# fname=quest/academy/npc_quest_ac_exercise.sc && iconv -f CP932 -t UTF-8 script/npc/$fname | sed -E -f /workspace/script_cleanup.sed > script_en/npc/$fname.tmp && cp script_en/npc/$fname.tmp script_en/npc/$fname
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
#  /[]。！‐？…"\n]";/{ # check for phrase-ending character.
#    b glossary# do not merge this line
#  }

  :mergelines
  /^(\s*)mes (".*[^]。！‐？…"\n]");/{
    # lines without terminating punctuation.
    N
    s/(".*[^]。！‐？…"\n])";[\r]*[\n]*\s*mes "[ 　]*/\1/g # remove terminating quote and next line opening quote.
    t mergelines # check for more lines without terminating punctuation.
    T glossary
  }
}

:glossary
s/プロンテラ/Prontera/g
s/イズルード/Izlude/g
s/アルベルタ/Alberta/g
s/フェイヨン/Payon/g
s/弓手村/Archer Village/g
s/モロク/Morroc/g
s/ジュノー/Yuno/g
s/ゲフェン/Geffen/g
s/ソグラト砂漠/Sograt Desert/g
s/ラヘル/Rachel/g
s/アルデバラン/Aldebaran/g
s/リヒタルゼン/Lighthalzen/g
s/ベインス/Veins/g
s/コンロン/Gonryun/g
s/フィゲル/Hugel/g
s/アインブロック/Einbroch/g
s/ウンバラ/Umbala/g
s/コモド/Comodo/g
s/アマツ/Amatsu/g
s/アインベフ/Einbech/g
s/龍の城/Louyang/g
s/ルティエ/Lutie/g
s/龍之城/Louyang/g
s/アユタヤ/Ayothaya/g
s/ピラ地下/Pyramid basement/g
s/ルーンミッドガッツ/Rune-Midgarts/g
s/シュバルツバルド/Schwartzvald/g
s/ミョルニール/Mjolnir/g
s/Mjolnir山脈/Mount Mjolnir/g
s/オークの村/Orc Village/g
s/ソグラド砂漠/Sograt Desert/g

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
s/アサクロ/SinX/g
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

#s/火/fire/g
#s/水/water/g
#s/地/earth/g
#s/風/wind/g
s/闇/dark/g
s/不死/undead/g
s/念/ghost/g
#s/聖/holy/g


# short names
s/エーイ/Ai/g
s/ミッド/Mido/g
s/ヨン/Yong/g
s/ゼン/Zen/g
s/コウ/Ko/g
s/バリー/Barry/g

# longer names
s/ヘイム/Heim/g
s/タール/Taro/g
s/モッド/Modo/g
s/マスター・スヌス/Master Sunus/g
s/受付員エーラ/Receptionist Ella/g
s/エーラ/Ella/g
s/店員/Clerk/g
s/プロン/Puron/g
s/アルディ/Aldi/g
s/フェイ/Faye/g
s/ルーン/Lune/g
s/アイン/Ein/g
s/モーリ/Mori/g
s/ガルド/Gordo/g
s/シャーレ/Shuri/g
s/マリアン/Mary-Anne/g
s/リューク/Ryuk/g
s/宝石商/Jeweler/g
s/スザンヌ/Susanne/g
s/ジェラルド/Gerald/g
s/医者/Physician/g
s/ノエリア/Nelia/g
s/ルイーゼ/Louise/g
s/職人/Artisan/g
s/ロイス/Royce/g
s/アーチボルド/Archibald/g
s/ゲイソン/Grayson/g
s/老人/Old Man/g
s/老婆/Old Woman/g
s/ドナテロ/Donatello/g
s/ターニャ/Tanya/g
s/ノリーク/Noriek/g
s/埋める場所/Burial Site/g
s/ミザリー/Misery/g
s/マッズイ/Mazzi/g
s/女性/Woman/g
s/デューイ/Dewey/g
s/デニス/Denis/g
s/ポリン先生/Professor Poring/g
s/ウルフ先生/Professor Wolf/g
s/ドラッブ先生/Professor Dragg/g
s/ホロン先生/Professor Horong/g
s/ビートル先生/Professor Beetle/g
s/ホルン先生/Professor Horn/g
s/行商人ヤニク/Peddler Janik/g
s/ハルBard/Halberd/g
s/指輪職人/Ring Maker/g
s/ドルドイ/Dordoi/g
s/ンライバ/Noriba/g
s/落し物/Lost Property/g
s/アイリン/Airin/g
s/トイーヒ/Touhi/g
s/ライアス/Ilias/g
s/ロックス/Roxxo/g
s/タラシー博士/Dr. Tracy/g
s/ライラ/Laila/g
s/ポムポム草/Pom Pom Grass/g
s/黒い変なキノコ/Black Funny Mushroom/g
s/あやしいキノコ/Suspicious Mushroom/g
s/ミンミン草/Minmin Grass/g
s/アムロン/Amuron/g
s/ザーパフ/Zapapo/g
s/メルシーちゃん/Mercy-chan/g
s/ツイーフラ/Swiffler/g
s/チスロー/Chislow/g
s/オネスト/Honest/g
s/ユタ/Yuta/g
s/フィー/Phee/g
s/Pheeルド/フィールド/g #Put back "field"
s/ルティー/Ruthie/g

s/アカデミー関係者/Academy Official/g
s/アカデミーサポート/Academy Support/g
s/転送装置/Transfer Device/g
s/リカバリープレート/Recovery Plate/g
s/アカデミーボックス/Academy Box/g
s/消耗品販売員/Consumables Salesman/g
s/道具販売員/Tool Dealer/g
s/銃弾販売員/Ammo Dealer/g
s/インフォメーション/Information/g
s/資料室管理人/Data Room Administrator/g
s/カプラサービス/Kafra Service/g
s/案内板/Info Board/g
s/自習室/Self-study Room/g
s/受付、講習室/Reception and Training Rooms/g
s/研究室/Research Office/g
s/講義室/Lecture Room/g
s/資料室/Information Room/g
s/試験室/Laboratory/g
s/エントランス/Entrance/g
s/図書室/Library Room/g
s/教室棟ホール/Classroom Hall/g
s/操作ノート/Operation Notes/g
s/実習室/Practice Room/g
s/磨り減った跡/Worn-out Track/g
s/掘り返したような跡/Digging Marks/g
s/看板/Signboard/g
s/ホルンの研究ボックス/Horn Study Box/g
s/ドブの泥/Mud Pit/g

# monsters
s/ポリン/Poring/g
s/ウルフ/Wolf/g
s/ホロン/Horong/g
s/ビートル/Beetle/g
s/ホルン/Horn/g
s/メタリン/Metalling/g

# items
s/プラコン/Phracon/g
s/エンベルタコン/Emveretarcon/g
s/オリデオコン/Oridecon/g
s/エルニウム/Elunium/g

s/衣装/Costume/g
s/"さん/"/g #-san honorific
s/◆/•/g #bullet point
