# fname=npc_quest_ac_entrance.sc && iconv -f CP932 -t UTF-8 $fname | sed -E -f script.sed > $fname.tmp && mv $fname.tmp $fname
/^(\s*)mes /{
  s/^(\s*)mes ([^"])/\1mes ""+\2/ # prepend quotes to a mes beginning with function/variable.
  s/([^"]);$/\1+"";/ # append quotes to a mes ending with function/variable.
}

s/　/  /g # convert shiftjis whitespace to space.

:split
/^(\s*)(mes ".*";)[^\n]*mes/{
  # break up multiple mes on a single line.
  s/^(\s*)(mes ".*";)[^\n]*mes/\1\2\n\1mes/
  t split
}

/^(\s*)mes/{
  /[]。！‐？…"\n]";/{ # check for phrase-ending character.
    b glossary# do not merge this line
  }

  :mergelines
  /^(\s*)mes (".*[^]。！‐？…"\n]");/{
    # lines without terminating punctuation.
    N
    s/";[\r]*[\n]*\s*mes "[ 　]*//g # remove terminating quote and next line opening quote.
    t mergelines # check for more lines without terminating punctuation.
    T glossary
  }
}

:glossary
s/プロンテラ/Prontera/g
s/イズルード/Izlude/g
s/アルベルタ/Alberta/g
s/フェイヨン/Payon/g
s/モロク/Morroc/g
s/ルーンミッドガッツ/Rune Midgard/g

s/ソードマン/Swordsman/g
s/ロードナイト/Lord Knight/g
s/ナイト/Knight/g
s/クルセイダー/Crusader/g
s/パラディン/Paladin/g
s/マジシャン/Magician/g
s/ハイウィザード/High Wizard/g
s/ウィザード/Wizard/g
s/セージ/Sage/g
s/プロフェッサー/Professor/g
s/アコライト/Acolyte/g
s/ハイプリースト/High Priest/g
s/プリースト/Priest/g
s/モンク/Monk/g
s/チャンピオン/Champion/g
s/シーフ/Thief/g
s/アサシンクロス/Assassin Cross/g
s/アサシン/Assassin/g
s/ローグ/Rogue/g
s/チェイサー/Stalker/g
s/アーチャー/Archer/g
s/ハンター/Hunter/g
s/スナイパー/Sniper/g
s/バード/Bard/g
s/クラウン/Clown/g
s/ダンサー/Dancer/g
s/ジプシー/Gypsy/g
s/マーチャント/Merchant/g
s/ブラックスミス/Blacksmith/g
s/ホワイトスミス/Whitesmith/g
s/アルケミスト/Alchemist/g
s/クリエイター/Creator/g
s/テコンキッド/Taekwon Kid/g
s/拳聖/Star Gladiator/g
s/ソウルリンカー/Soul Linker/g
s/ガンスリンガー/Gunslinger/g
s/忍者/Ninja/g
s/スーパーノービス/Supernovice/g
s/特殊1次職/1st job expanded/g
s/ドラム/Doram/g

s/火/fire/g
s/水/water/g
s/地/earth/g
s/風/wind/g
s/闇/dark/g
s/不死/undead/g
s/念/ghost/g
s/聖/holy/g

s/マスター・スヌス/Master Sunus/g;
s/エーラ/Ella/g
s/プロン/Puron/g
s/アルディ/Aldi/g
s/フェイ/Faye/g
s/ルーン/Lune/g

s/"さん/"/g #-san honorific
