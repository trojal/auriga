# doctl registry login --expiry-seconds 3600 && docker build -t registry.digitalocean.com/titanro-nyc/auriga-game . && docker image push registry.digitalocean.com/titanro-nyc/auriga-game
# Normally built by Tekton Pipelines-as-Code (.tekton/push.yaml) on pushes to master; titanro-ci[bot] pins the digest in
# TitanRO/sysops argo/test-season/auriga-server, and Argo CD deploys it. The line above is the manual fallback.

FROM alpine:3.24 AS build

RUN apk add --no-cache \
	mariadb-dev \
	gcc \
	g++ \
	gdb \
	git \
	pcre-dev \
	make \
	openssh-client \
	zlib-dev \
	linux-headers

COPY . /auriga_server
WORKDIR /auriga_server
RUN delgroup ping \
	&& addgroup -g 999 appuser \
	&& adduser -S -u 999 -G appuser appuser

RUN chown -R 999:999 /auriga_server

USER appuser

RUN make clean \
	&& make


FROM alpine:3.24

RUN apk add --no-cache \
	mariadb-connector-c \
	libgcc \
	pcre-dev \
	ca-certificates
# MariaDB Connector/C >= 3.4 verifies the server's TLS certificate by default; DigitalOcean managed MySQL is signed
# by its project CA (doctl databases get-ca <id>; valid until 2030-08). Without it the servers exit after connecting.
COPY certs/do-mysql-ca.crt /usr/local/share/ca-certificates/do-mysql-ca.crt
RUN update-ca-certificates

WORKDIR /auriga_server
RUN delgroup ping \
	&& addgroup -g 999 appuser \
	&& adduser -S -u 999 -G appuser appuser

COPY --from=build /auriga_server/sql-files ./sql-files
COPY --from=build /auriga_server/conf ./conf
COPY --from=build /auriga_server/db ./db
# COPY --from=build /auriga_server/data ./data
# log/ is git-ignored (not in the build context): start with an empty one instead of copying local logs.
RUN mkdir -p log
COPY --from=build /auriga_server/script ./script
COPY --from=build /auriga_server/script_en ./script_en
COPY --from=build /auriga_server/save ./save
COPY --from=build /auriga_server/map.info ./
COPY --from=build /auriga_server/login-server /auriga_server/char-server /auriga_server/map-server ./

RUN chown -R 999:999 /auriga_server

USER appuser
