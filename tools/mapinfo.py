#!/usr/bin/env python3
"""Writes map.info, the map server's cell cache (read_map_from_cache in conf/map_auriga.conf), from a TitanRO client
patch release, so the server's walkable cells are the shipped client's.

  python3 tools/mapinfo.py [--client https://patch.titanro.net/season] [--objects URL] [--out map.info]

The client data isn't kept in this repository: the image build (Dockerfile) runs this against the live release on
patch.titanro.net. A release is a manifest of content-addressed objects, data.grf split into segments; over HTTP only
the GRF's file table and the map files are downloaded (Range requests), about 400 MB.

Files are looked up as the patched client does: the release's loose data/ files first, then the GRFs in DATA.INI
order, with data/resnametable.txt aliases; each map's .gat is the one its .rsw names. Every map the client has is
cached, so any map the server is configured with is found. Cells are converted as map_readmap() does from a GRF
(src/map/map.c: walkable cells under the water level become water, type 3), with the water level read the way the
client reads it: the .rsw's for RSW < 2.6, else the .gnd's (GND 1.9: one level per zone of the map), and
conf/water_height.txt still overriding it.
"""
import argparse
import concurrent.futures
import http.client
import json
import os
import re
import struct
import sys
import threading
import time
import urllib.parse
import urllib.request
import zlib

UA = {'User-Agent': 'auriga-mapinfo/1'}  # Cloudflare refuses urllib's default agent
NO_WATER = 0x7fffffff
ALL_WATER = -0x80000000  # 0x80000000 as the int map_readmap() compares
MAX_MAP_SIZE = 512 * 512


def is_url(s):
    return s.startswith(('http://', 'https://'))


class Objects:
    """objects/<aa>/<sha256> under a directory or URL."""

    def __init__(self, base):
        self.base = base.rstrip('/')
        self.fetched = 0
        self.lock = threading.Lock()
        self.local = threading.local()

    def http(self, path, start, length):
        """GET over a kept-alive connection per thread (a TLS handshake per Range request costs more than the
        data); follows redirects."""
        url = self.base + '/' + path
        for _ in range(5):
            u = urllib.parse.urlsplit(url)
            conns = self.local.__dict__.setdefault('conns', {})
            conn = conns.get(u.netloc)
            if conn is None:
                cls = http.client.HTTPSConnection if u.scheme == 'https' else http.client.HTTPConnection
                conn = conns[u.netloc] = cls(u.netloc, timeout=120)
            headers = dict(UA)
            if start or length is not None:
                headers['Range'] = 'bytes=%d-%s' % (start, '' if length is None else start + length - 1)
            try:
                conn.request('GET', u.path, headers=headers)
                r = conn.getresponse()
                data = r.read()
            except (OSError, http.client.HTTPException):
                conn.close()
                del conns[u.netloc]
                raise
            if r.status in (301, 302, 303, 307, 308):
                url = urllib.parse.urljoin(url, r.getheader('Location'))
                continue
            if r.status == 200 and (start or length is not None):
                return data[start:None if length is None else start + length]
            if r.status not in (200, 206):
                raise OSError('%s: HTTP %d' % (url, r.status))
            return data
        raise OSError('%s: too many redirects' % url)

    def read(self, sha, start=0, length=None):
        rel = '%s/%s' % (sha[:2], sha)
        if is_url(self.base):
            for attempt in range(4):
                try:
                    data = self.http(rel, start, length)
                    break
                except (OSError, http.client.HTTPException):
                    if attempt == 3:
                        raise
        else:
            with open(os.path.join(self.base, rel), 'rb') as f:
                f.seek(start)
                data = f.read() if length is None else f.read(length)
        with self.lock:
            self.fetched += len(data)
        return data


class Segmented:
    def __init__(self, objects, entry, segment_size):
        self.o, self.seg, self.size, self.ss = objects, entry['segments'], entry['size'], segment_size

    def pread(self, pos, n):
        n = max(0, min(n, self.size - pos))
        out = bytearray()
        while n > 0:
            i, off = divmod(pos, self.ss)
            k = min(n, self.ss - off)
            out += self.o.read(self.seg[i], off, k)
            pos += k
            n -= k
        return bytes(out)


def grf_table(f):
    """{lower-case path with /: (compressed, aligned, real size, flags, offset)} of a 0x200 or 0x300 GRF."""
    h = f.pread(0, 46)
    if h[:13] == b'Event Horizon':  # kRO's 0x300: 64-bit offsets
        off, v3 = struct.unpack('<Q', h[30:38])[0], True
        pos = 46 + off + 4
    elif h[:15] == b'Master of Magic' and struct.unpack('<I', h[42:46])[0] == 0x200:
        off, v3 = struct.unpack('<I', h[30:34])[0], False
        pos = 46 + off
    else:
        raise SystemExit('unsupported GRF (only 0x200 and 0x300)')
    comp, _ = struct.unpack('<II', f.pread(pos, 8))
    t = zlib.decompress(f.pread(pos + 8, comp))
    out, p = {}, 0
    while p < len(t):
        end = t.index(b'\0', p)
        name = t[p:end].decode('cp949', 'replace').replace('\\', '/').lower()
        p = end + 1
        if v3:
            out[name] = struct.unpack('<IIIBQ', t[p:p + 21])
            p += 21
        else:
            out[name] = struct.unpack('<IIIBI', t[p:p + 17])
            p += 17
    return out


class Client:
    def __init__(self, where, objects_at=None):
        where = where.rstrip('/')
        if is_url(where):
            with urllib.request.urlopen(urllib.request.Request(where + '/manifest.json', headers=UA), timeout=60) as r:
                self.manifest = json.load(r)
        else:
            self.manifest = json.load(open(os.path.join(where, 'manifest.json')))
        rel = self.manifest.get('objects', 'objects/').strip('/')
        self.o = Objects(objects_at or (where + '/' + rel if is_url(where) else os.path.join(where, rel)))
        files = {f['path'].replace('\\', '/'): f for f in self.manifest['files']}
        self.loose = {p.lower(): f['sha256'] for p, f in files.items() if p.lower().startswith('data/')}
        ini = self.o.read(files['DATA.INI']['sha256']).decode('latin-1') if 'DATA.INI' in files else '1=data.grf'
        order = sorted((int(k), v.strip()) for k, _, v in (l.partition('=') for l in ini.splitlines())
                       if k.strip().isdigit() and v.strip())
        self.grfs = []
        for _, name in order:
            entry = next((f for p, f in files.items() if p.lower() == name.lower()), None)
            if entry is not None:
                fh = Segmented(self.o, entry, self.manifest['segmentSize'])
                self.grfs.append((fh, grf_table(fh)))
        self.alias = {}
        for line in (self._read('data/resnametable.txt') or b'').decode('cp949', 'replace').splitlines():
            parts = line.split('#')
            if len(parts) >= 3 and parts[0].strip() and parts[1].strip():
                self.alias['data/' + parts[0].strip().lower()] = 'data/' + parts[1].strip().lower()

    def names(self):
        """Every path the client can open."""
        out = set(self.loose) | set(self.alias)
        for _, t in self.grfs:
            out.update(t)
        return out

    def read(self, path):
        path = path.lower()
        return self._read(self.alias.get(path, path))

    def _read(self, path):
        if path in self.loose:
            return self.o.read(self.loose[path])
        for fh, t in self.grfs:
            if path in t:
                comp, aligned, real, flags, off = t[path]
                if flags & 0x06:
                    raise ValueError('%s: encrypted GRF entry' % path)
                return zlib.decompress(fh.pread(46 + off, aligned))[:real] if real else b''
        return None


def _f32(b, o):
    return struct.unpack_from('<f', b, o)[0]


def _cstr(b):
    return b.split(b'\0', 1)[0].decode('cp949', 'replace').replace('\\', '/').lower()


def gnd_water(gnd):
    """(split width, split height, levels) of a GND >= 1.8, else None."""
    if gnd is None or gnd[:4] != b'GRGN' or (gnd[4], gnd[5]) < (1, 8):
        return None
    w, h = struct.unpack_from('<II', gnd, 6)
    p = 18
    count, length = struct.unpack_from('<II', gnd, p)
    p += 8 + count * length
    lm, px, py, cells = struct.unpack_from('<iiii', gnd, p)
    p += 16 + lm * px * py * cells * 4
    p += 4 + struct.unpack_from('<I', gnd, p)[0] * 40
    p += w * h * 28
    level = _f32(gnd, p)
    sw, sh = struct.unpack_from('<ii', gnd, p + 24)
    if (gnd[4], gnd[5]) < (1, 9) or sw <= 0 or sh <= 0:
        return 1, 1, [level]
    return sw, sh, [_f32(gnd, p + 32 + i * 24) for i in range(sw * sh)]


def map_cells(cl, name, overrides):
    """(xs, ys, water height stored in the entry, cells) or None."""
    rsw = cl.read('data/%s.rsw' % name)
    gat_name, water = 'data/%s.gat' % name, None
    if rsw is not None and rsw[:4] == b'GRSW':
        v = (rsw[4], rsw[5])
        off = 6 + (1 if v >= (2, 2) else 0) + (4 if v >= (2, 5) else 0)
        if v > (1, 4) and _cstr(rsw[off + 80:off + 120]):
            gat_name = 'data/' + _cstr(rsw[off + 80:off + 120])
        if v < (2, 6):
            water = (1, 1, [_f32(rsw, off + 160)])
        else:
            water = gnd_water(cl.read('data/' + _cstr(rsw[off + 40:off + 80])))
    gat = cl.read(gat_name)
    if gat is None or gat[:4] != b'GRAT':
        return None
    xs, ys = struct.unpack_from('<ii', gat, 6)
    if xs <= 0 or ys <= 0 or xs * ys > MAX_MAP_SIZE or len(gat) < 14 + xs * ys * 20:
        return None
    if name in overrides:
        water = (1, 1, [overrides[name]])
    sw, sh, levels = water or (1, 1, [NO_WATER])
    levels = [NO_WATER if v == NO_WATER else ALL_WATER if v == ALL_WATER else int(v) for v in levels]
    cells = bytearray(xs * ys)
    for i, (h1, h2, h3, h4, t) in enumerate(struct.iter_unpack('<ffffi', gat[14:14 + xs * ys * 20])):
        y, x = divmod(i, xs)
        wh = levels[(y * sh // ys) * sw + x * sw // xs]
        if wh != NO_WATER and t == 0:
            t = 3 if wh == ALL_WATER or h1 > wh or h2 > wh or h3 > wh or h4 > wh else 0
        cells[i] = t & 0xff
    stored = levels[0] if len(levels) == 1 else (overrides.get(name, int(water[2][0]) if water else NO_WATER))
    return xs, ys, stored, bytes(cells)


def water_overrides(path):
    out = {}
    if os.path.exists(path):
        for line in open(path, encoding='latin-1'):
            if line.startswith('//') or not line.strip():
                continue
            parts = line.split()
            out[parts[0][:-4] if parts[0].endswith('.gat') else parts[0]] = int(parts[1]) if len(parts) > 1 \
                else ALL_WATER
    return out


def write_mapinfo(path, maps):
    """maps: [(name, xs, ys, water height, cells)]. Layout of map_cache_open()/map_cache_write() (src/map/map.c):
    header {sizeof header, sizeof entry, entries, file size}, 56-byte entries, then zlib data (compressed = 1)."""
    head, entry = 16, 56
    pos = head + entry * len(maps)
    table, blobs = bytearray(), []
    for name, xs, ys, wh, cells in maps:
        comp = zlib.compress(cells)
        table += struct.pack('<32siiiiiI', (name + '.gat').encode('latin-1'), xs, ys, wh, pos, 1, len(comp))
        blobs.append(comp)
        pos += len(comp)
    with open(path, 'wb') as f:
        f.write(struct.pack('<IIii', head, entry, len(maps), pos) + table + b''.join(blobs))


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__.split('\n\n')[0])
    p.add_argument('--client', default='https://patch.titanro.net/season')
    p.add_argument('--objects', help='where the objects are, if not under --client (e.g. the CDN)')
    p.add_argument('--water', default='conf/water_height.txt')
    p.add_argument('--out', default='map.info')
    a = p.parse_args(argv)
    t = time.time()
    cl = Client(a.client, a.objects)
    names = sorted({n[5:-4] for n in cl.names()
                    if re.fullmatch(r'data/[^/]+\.(gat|rsw)', n) and len(n[5:-4]) + 4 < 32})
    overrides = water_overrides(a.water)
    with concurrent.futures.ThreadPoolExecutor(32) as pool:
        cells = list(pool.map(lambda n: map_cells(cl, n, overrides), names))
    maps = [(n,) + c for n, c in zip(names, cells) if c is not None]
    write_mapinfo(a.out, maps)
    print('%s: %d maps from client release %s (%.0f s, %.0f MB read)' % (
        a.out, len(maps), cl.manifest.get('version'), time.time() - t, cl.o.fetched / 1e6))


if __name__ == '__main__':
    sys.exit(main())
