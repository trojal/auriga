//====================================================================
// Event Oni
//
//  ■ ONI_EVE -> アムムト倒したら1、褒美をもらったら0に戻る
//====================================================================
//勝ちパターン(一番成功率が高い様子)
//　避ける⇒フェイヨン水溶液⇒かたい皮⇒銀の矢
//賞品はジュース各種(偏りなし)
//他は適当にランダム脳内仕様

payon.gat,93,75,4	script	警備兵	708,{
	cutin "pay_soldier",2;
	if(ONI_EVE == 0) {
		mes "[警備兵]";
		mes "今、この町はある問題を抱えています。";
		mes "……住民が鬼に襲われたのです！";
		mes "もし、言い伝えのように鬼が襲って";
		mes "くるとしたら……";
		mes "私たちだけでは町を守りきる";
		mes "ことはできないでしょう……";
		next;
		mes "[警備兵]";
		mes "あの……";
		mes "あなたを経験豊かな冒険者と";
		mes "見込んでお願いします。";
		mes "協力していただけないでしょうか？";
		next;
		switch (select("わかりました、引き受けましょう！","私には無理です。")) {
		case 1:
			mes "[警備兵]";
			mes "本当ですか!?";
			mes "ありがとうございます！";
			mes "町を守っていただくためには";
			mes "まず鬼について知ってもらわないと……";
			next;
			mes "[警備兵]";
			mes "この町の奥にある弓手の村に、";
			mes "物知りなおじいさんがいます。";
			mes "鬼についても詳しいと思いますので";
			mes "一度話を聞いてみては";
			mes "いかがでしょうか？";
			next;
			mes "[警備兵]";
			mes "そうそう、襲われた住民は";
			mes "旅館にいます。";
			mes "どうかよろしくお願いします。";
			break;
		case 2:
			mes "[警備兵]";
			mes "そうですか、残念です……";
			mes "はぁ、どうしよう……";
			break;
		}
	}
	else {
		mes "[警備兵]";
		mes "おお、どこに行っておられたのです？";
		mes "……ん？";
		mes "何ですか、それは？";
		mes "棍棒じゃないですか……";
		mes "ええ？鬼が持っていた武器!?";
		mes "ドケビはそれで人を襲ったのですね！";
		next;
		mes "[警備兵]";
		mes "……";
		mes "え!?襲ったのはドケビじゃない？";
		mes "……";
		mes "そうだったんですか。";
		mes "その昔、町を襲ったのも、";
		mes "アムムトという鬼……";
		next;
		mes "[警備兵]";
		mes "では、言い伝えは";
		mes "間違っていたのか……。";
		mes "なんと……";
		next;
		mes "[警備兵]";
		mes "ああ、すいません。";
		mes "何はともあれ、";
		mes "本当にありがとうございました。";
		next;
		mes "[警備兵]";
		mes "そうだ、実はあの物知りなおじいさんが";
		mes "鬼について尋ねてきたあなたのことを";
		mes "心配していたようなんです。";
		mes "どうかあなたの元気な姿を";
		mes "見せてあげてもらえませんか？";
	}
	close2;
	cutin "pay_soldier",255;
	end;
}

//====================================================================
pay_arche.gat,140,30,4	script	おじいさん	120,{
	if(ONI_EVE == 0 || countitem(1501)<1) {
		mes "[物知りじい]";
		mes "ん？";
		mes "なんじゃ？";
		mes "何かようかな？";
		next;
		if(select("鬼について知りたい","特に用はないです")==2) {
			mes "[物知りじい]";
			mes "そうか……";
			close;
		}
		mes "[物知りじい]";
		mes "そうか……";
		mes "鬼について知りたいとな。";
		mes "……ふむ……";
		mes "では話すとしようかの。";
		next;
		mes "[物知りじい]";
		mes "昔、鬼と人間は仲が良かったのじゃ。";
		mes "両種族の子供は、いつも一緒に遊んで";
		mes "おった。";
		mes "そんなある日のことじゃ、";
		mes "鬼の子と遊ぶために出かけた子供が";
		mes "寂しそうに帰ってきたのじゃ。";
		next;
		mes "[物知りじい]";
		mes "話を聞くと、もう会えないと";
		mes "言われたらしい。";
		mes "そして……";
		mes "鬼の子が姿を見せなくなってから";
		mes "数日後、冒険者が次々と襲われる";
		mes "事件が起こった。";
		next;
		mes "[物知りじい]";
		mes "冒険者達は鬼に襲われたと言う。";
		mes "町の人々は驚き、戸惑ったが";
		mes "やがて、事件と鬼の子が姿を";
		mes "消した事に関係があるのではないかと";
		mes "考えるようになったんじゃ。";
		next;
		mes "[物知りじい]";
		mes "この事件をきっかけに";
		mes "住民は集会を行った。";
		mes "その結果、町と住民の安全を";
		mes "守るために町から外出を";
		mes "禁止することにした。";
		next;
		mes "[物知りじい]";
		mes "そして、ある日の夜。";
		mes "町が襲われ、荒らされた……";
		next;
		mes "[物知りじい]";
		mes "幸い、どの家からも怪我人は";
		mes "出なかったものの、その夜に";
		mes "多くの人が鬼を見たと話し";
		mes "町には鬼の足跡が";
		mes "たくさん残っておった。";
		next;
		mes "[物知りじい]";
		mes "人々は、今までの事件や";
		mes "町を襲ったのは、やはり鬼の仕業だと";
		mes "判断したのじゃ。";
		mes "その時から鬼とは交流が";
		mes "なくなってしまった……";
		next;
		mes "[物知りじい]";
		mes "まぁ、わしが知っているのは";
		mes "このくらいじゃな。";
		close;
	}
	mes "[物知りじい]";
	mes "おお……心配したぞ。";
	mes "鬼のもとへ向かったと聞いてな。";
	mes "じゃが、ふむ……無事で何より。";
	mes "してどうじゃった？";
	mes "鬼を見つけたかの？";
	mes "もしや、鬼を倒したのか？";
	next;
	mes "[物知りじい]";
	mes "ほう、それは……";
	mes "棍棒じゃな？";
	mes "鬼のものかの？";
	mes "すると……";
	mes "鬼を倒してくれたのじゃな！";
	mes "ようやってくれたのぉ。";
	next;
	mes "[物知りじい]";
	mes "……";
	mes "ふむ。";
	mes "……";
	mes "なんと！";
	mes "人を襲ったのはドケビでは";
	mes "ないというのか！";
	next;
	mes "[物知りじい]";
	mes "アムムトという鬼が";
	mes "悪さをしておったと……";
	mes "……";
	mes "昔、悪さをしたのもそやつの";
	mes "仕業じゃったと。";
	next;
	mes "[物知りじい]";
	mes "知らんかった……";
	mes "他にも鬼がおったとは……";
	mes "おぉ……何ということじゃ。";
	mes "わしらは、今までとんでもない";
	mes "間違いをしていたのか……";
	next;
	mes "[物知りじい]";
	mes "わしは……";
	mes "わしは、長い間ドケビを恨んでおった。";
	mes "どうして裏切ったのか、";
	mes "あの時、なぜわしの前から";
	mes "消えたのかと……";
	next;
	mes "[物知りじい]";
	mes "……";
	mes "そなたに教えた言い伝えの人の子とは";
	mes "わしだったのじゃ。";
	mes "わしは、ドケビに裏切られたと";
	mes "ずっと思っていた。";
	mes "しかし……";
	next;
	mes "[物知りじい]";
	mes "裏切ったのは、";
	mes "いや、信頼していなかったのは";
	mes "わしらのほうだったんじゃな。";
	mes "わしらは酷い事をしてしまった。";
	mes "ドケビが恨んでいても";
	mes "仕方がないのぉ……";
	next;
	mes "[物知りじい]";
	mes "……";
	mes "わしはどうすればいいんじゃ";
	mes "どうすれば……";
	mes "……";
	next;
	mes "[物知りじい]";
	mes "なんじゃと!?";
	mes "ドケビは、わしらを";
	mes "恨んでいなかったというのか。";
	mes "それどころか、";
	mes "わしらと遊べなかったのが";
	mes "悲しかったと…";
	next;
	mes "[物知りじい]";
	mes "……";
	mes "そうか……";
	mes "まだ遅くないのかもしれん……";
	next;
	mes "[物知りじい]";
	mes "よければ……";
	mes "その棍棒、わしにもらえんかの。";
	mes "子供らに、この事を話す時に";
	mes "見せてやりたいんじゃ。";
	next;
	if(select("もちろん、どうぞ！","嫌です。")==2) {
		mes "[物知りじい]";
		mes "そうか、残念じゃ……";
		close;
	}
	mes "[物知りじい]";
	mes "ありがとう。";
	mes "そなたがいなければ、";
	mes "わしはこれからもずっとドケビを";
	mes "恨んでいたじゃろう。";
	mes "なんとお礼をいったらいいか……";
	next;
	mes "[物知りじい]";
	mes "そうじゃ、わしはこんな物しか";
	mes "持っておらぬが、どうか";
	mes "受け取ってくだされ。";
	mes "ほんの心ばかりのお礼じゃ。";
	next;
	mes "[物知りじい]";
	mes "ここフェイヨンで作られている物で";
	mes "体に良いと評判なんじゃよ。";
	mes "どうか使ってくだされ……";
	next;
	set ONI_EVE,0;
	delitem 1501,1;
	getitem 531+rand(4),1;	//531～534までランダム
	mes "[物知りじい]";
	mes "そなたから聞いた真実は、";
	mes "孫たちへ伝えていくとしよう。";
	mes "もちろん、そなたのこともな……";
	close;
}

payon.gat,100,135,4	script	子供	706,{
	mes "[町の少年]";
	mes "怖いよ～！！";
	mes "僕たち鬼にたべられちゃうのかなぁ……";
	close;
}

//====================================================================
payon.gat,45,130,4	script	住民	50,{
	mes "[町の男性]";
	mes "その昔、町が鬼に襲われたという";
	mes "言い伝えは本当だったのか！";
	mes "どうすればいいんだ。";
	next;
	mes "[町の男性]";
	mes "そういえば……";
	mes "私が幼いころ、寝る前によく";
	mes "鬼の言い伝えを聞かされたんだ。";
	mes "その昔、枕元には必ず";
	mes "^ff0000フェイヨン水溶液^000000が置いてあったな。";
	mes "母親は魔除けだと言っていたが……";
	close;
}

//====================================================================
payon.gat,153,163,4	script	住民	75,{
	mes "[町の女性]";
	mes "人が鬼に襲われたんですって！";
	mes "言い伝えのように";
	mes "町に鬼が来るのでしょうか？";
	close;
}

//====================================================================
payon_in01.gat,177,49,2	script	怪我を負った人	48,{
	mes "[怪我を負った人]";
	mes "言い伝えにある鬼が本当にいたんだ！";
	mes "私はアルベルタからこの町へ帰る途中";
	mes "鬼に襲われて深手を負ったんだ。";
	mes "何とか帰ってこれたが……";
	mes "この怪我じゃ当分外にはでられないよ…";
	next;
	switch (select("どこで鬼に襲われたの？","どうやって逃げたの!?")) {
	case 1:
		mes "[怪我を負った人]";
		mes "鬼がいた場所は";
		mes "アルベルタとフェイヨンの";
		mes "ちょうど中間くらいだ。";
		mes "通るときには十分に";
		mes "気をつけた方がいい……";
		close;
	case 2:
		mes "[怪我を負った人]";
		mes "必死だったから、よく覚えていないけど";
		mes "持ってきた道具をかたっぱしから";
		mes "投げつけたんだ。";
		next;
		mes "[怪我を負った人]";
		mes "えっと……^ff0000矢、銀の矢、";
		mes "ソード、ガード、アックス^000000……";
		mes "他にもあったかも知れないけど……";
		mes "覚えてないなぁ。";
		close;
	}
}

//====================================================================
payon_in01.gat,171,138,2	script	青年	59,{
	mes "[青年]";
	mes "かたい皮に被われたモンスターには";
	mes "物理的な力が通用しないんだ、";
	mes "それらを効果的に退治するには";
	mes "「気」または「魔法」と言う";
	mes "精神的な力だけだ。";
	close;
}

//====================================================================
pay_fild02.gat,105,244,4	script	#ドケビ	1407,{}

pay_fild02.gat,105,244,4	script	ドケビ	111,{
	mes "[ドケビ]";
	mes "オラニ、ナニカヨウカ？";
	next;
	if(select("お前を倒しに来た！","なんでもない。")==2) {
		mes "[ドケビ]";
		mes "ソカ……";
		close;
	}
	mes "[ドケビ]";
	mes "ナゼダ？";
	mes "オラタチ、ナニカシタカ？";
	mes "……";
	mes "オラタチ、ヒト、オソウ？";
	mes "ソレ、ナイ。";
	next;
	mes "[ドケビ]";
	mes "オラ、ヒト、ムカシ、ナカヨシ。";
	mes "イマ、アソバナイ、";
	mes "デモ、キライナイ。";
	next;
	mes "[ドケビ]";
	mes "ヒト、オソウ、タブン、アムムト。";
	mes "オラモ、アムムト、オソワレタ。";
	mes "アムムト、ワルイ、デモツヨイ。";
	mes "オラタチ、ニゲタ。";
	mes "ダカラ、ヒト、アソベナクナタ。";
	mes "ヒト、アソベナイ、オラ、カナシイ……";
	next;
	if(select("アムムトを倒してくる！","かわいそうに。")==2) {
		mes "[ドケビ]";
		mes "オラカナシイ……";
		mes "マタ、アソビタイ……";
		close;
	}
	mes "[ドケビ]";
	mes "ソカ……アムムト、チカクイル……";
	mes "アムムト、キケン、ツヨイ。";
	mes "アムムト、チカヅク、ヨクナイ。";
	next;
	mes "[ドケビ]";
	mes "^ff0000カタイカワ^000000、トオク、";
	mes "ブツケル、イチバン。";
	mes "^ff0000フタツ^000000、モテク、イイ。";
	mes "ムカシ、ナゲタ、";
	mes "アムムト、イタガタ。";
	mes "……シヌナ……";
	close;
}

//====================================================================
pay_fild02.gat,53,128,4	script	#アムムト	1301,{}

pay_fild02.gat,53,128,4	script	アムムト	111,{
	if(countitem(1751)<1 || countitem(1089)<1 || countitem(935)<2) {
		mes "今のままでは勝てそうにない……";
		mes "何か弱点を探す必要がありそうだ。";
		close;
	}
	delitem 1751,1;
	delitem 1089,1;
	delitem 935,2;
	mes "[アムムト]";
	mes "……ニンゲン……";
	mes "ナニシニキタ";
	mes "ドケビ……";
	mes "ニンゲン……";
	mes "キライ！";
	mes "ニンゲンタオス！！";
	next;
	mes "アムムトが突然襲い掛かってきた!!";
	next;
	mes "アムムトはアドレナリンラッシュを";
	mes "使った。";
	mes "アムムトの攻撃速度が増加した。";
	mes "アムムトが連続攻撃を仕掛けてきた。";
	mes "どうする!?";
	next;
	switch (select("避ける","防御する","受け流す")) {
	case 1:
		mes "スッ……";
		mes " ";
		mes "うまく避けることができた。";
		mes "どうする？";
		break;
	case 2:
		mes "ガッ……";
		mes " ";
		mes "何とか耐え凌いだ。";
		mes "どうする？";
		set '@point,'@point|0x01;
		break;
	case 3:
		mes "ドガッ……";
		mes " ";
		mes "受け流すことに失敗した。";
		mes "ダメージを受けた！";
		mes "どうする？";
		set '@point,'@point|0x02;
		break;
	}
	next;
	switch (select("フェイヨン溶液をぶちまける","銀の矢を地面に刺す。","かたい皮を投げる。")) {
	case 1:
		mes "バシャッ……";
		mes " ";
		mes "アムムトに液体がかかった。";
		mes "アムムトはもがき苦しんでいる。";
		mes "どうやら効果があったようだ……";
		break;
	case 2:
		mes "ドスッ……";
		mes " ";
		mes "何も起こらなかった……";
		mes "それを見てアムムトが";
		mes "ケラケラ笑っている。";
		set '@point,'@point|0x04;
		break;
	case 3:
		mes "ビュ……";
		mes " ";
		mes "アムムトはとっさによけた。";
		mes "惜しい！";
		mes "ダメージを与えられなかった。";
		set '@point,'@point|0x08;
		break;
	}
	next;
	mes "アムムトの攻撃！";
	mes "アムムトはメマーナイトを使って";
	mes "攻撃してきた。";
	next;
	set '@rand,rand(100);
	if('@rand < 40) {
		mes "スッ……";
		mes " ";
		mes "運良く避けることができた。";
		mes "さあ反撃だ！";
	}
	else if('@point==0 || '@rand >= 79) {
		mes "ズガッ……";
		mes " ";
		mes "回避をこころみたが";
		mes "避けきることができなかった。";
		mes "さあ反撃だ！";
	}
	else {
		mes "ズガガガッ……";
		mes " ";
		mes "避ける事ができず";
		mes "大ダメージを受けた！";
		mes "意識が遠のいていく……";
		close2;
		warp "payon_in01.gat",170,45;
		end;
	}
	next;
	switch (select("フェイヨン水溶液を飲む","銀の矢で突く。","かたい皮を投げる。")) {
	case 1:
		mes "ゴクゴク……";
		mes " ";
		mes "水溶液を飲んだ瞬間";
		mes "体に痺れを感じた！";
		break;
	case 2:
		mes "シュッ……";
		mes " ";
		mes "アムムトに突進しながら";
		mes "矢で突いたが";
		mes "避けられてしまった！";
		set '@point,'@point|0x10;
		break;
	case 3:
		mes "バシッ……";
		mes " ";
		mes "見事、アムムトに命中した。";
		mes "痛がっている！";
		set '@point,'@point|0x20;
		break;
	}
	next;
	mes "アムムトの攻撃！";
	mes "アムムトは持っている棍棒を";
	mes "力いっぱい振り回して";
	mes "こちらに突っ込んできた。";
	next;
	set '@rand,rand(100);
	if('@point==0x20 || '@rand < 40) {
		mes "ガガッ……";
		mes " ";
		mes "防御することに成功したが";
		mes "すさまじい威力だったため";
		mes "ダメージを受けてしまった。";
		mes "反撃だ！";
	}
	else if('@point==0x10 || '@rand >= 79) {
		mes "ドテッ……";
		mes " ";
		mes "しかし、アムムトは";
		mes "攻撃する際に転んだ。";
		mes "反撃だ！";
	}
	else {
		mes "ドガガガッ……";
		mes " ";
		mes "あまりの猛攻に耐え切れず";
		mes "防御をとかれてしまった。";
		mes "そこに強烈な一撃が入った！";
		mes "全身の力が抜けていく……";
		close2;
		warp "payon_in01.gat",165,140;
		end;
	}
	next;
	switch (select("フェイヨン水溶液を投げつける。","銀の矢を投げつける","かたい皮を投げる。")) {
	case 1:
		mes "ガシャッ……";
		mes " ";
		mes "途中で試験管が割れて";
		mes "アムムトにとどかなかった……";
		break;
	case 2:
		mes "ドスッ……";
		mes " ";
		mes "投げた矢は、アムムトに";
		mes "突きささりダメージを与えた！";
		set '@point,'@point|0x40;
		break;
	case 3:
		mes "ガゴッ……";
		mes " ";
		mes "アムムトは持っていた";
		mes "棍棒で皮を弾き返した。";
		mes "飛んできた皮をよけきれず";
		mes "ダメージを受けた！";
		set '@point,'@point|0x80;
		break;
	}
	next;
	if('@point==0x60 || rand(100) >= 79) {	//勝利
		set ONI_EVE,1;
		getitem 1501,1;
		mes "アムムトをこらしめた！！";
		mes "目の前でアムムトが気絶している。";
		mes "アムムトが装備していた";
		mes "棍棒を手に入れた。";
		next;
		mes "鬼を倒した証拠として";
		mes "町にもって帰ろう。";
		close2;
		warp "payon.gat",90,30;
		end;
	}
	mes "ドゴッ……";
	mes " ";
	mes "強烈な体当たりをくらった！！";
	mes "アムムトを追い詰めたが";
	mes "後一歩のところで";
	mes "反撃を受けてしまった！";
	mes "目の前が暗くなっていく……";
	close2;
	warp "payon_in01.gat",165,140;
	end;
}
