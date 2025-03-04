// 2006お正月イベント
//==============================================================
// アマツ無料転送
//==============================================================
alberta.gat,210,53,5	script	アマツ貿易商	762,{
	mes "[貿易商]";
	mes "古木の露は……よし。";
	mes "あと、ハリネズミの針はと……";
	mes "うん、大丈夫。";
	next;
	mes "[実輝]";
	mes "あ、失礼。申し遅れましたが、";
	mes "私、アマツで貿易商をしている";
	mes "「実輝」と申します。";
	next;
	mes "[実輝]";
	mes "アマツは今、「お正月」の";
	mes "お祝いでとても賑わってます。";
	mes "おかげさまで私共も大忙しですよ。";
	next;
	mes "[実輝]";
	mes "そのため……お恥ずかしい話ですが";
	mes "少々、品薄状態になってしまいまして。";
	mes "そこで向こうのことは弟達に任せ、";
	mes "私は正月用品の買出しのため";
	mes "ここアルベルタへやって来ました。";
	next;
	mes "[実輝]";
	mes "それで今から帰るところなのですが、";
	mes "よろしければアマツへお送りしますよ。";
	mes "あ、御代はけっこうです。";
	mes "船旅ゆえかなりの危険を伴いますし……";
	next;
	mes "[実輝]";
	mes "天候によっては見知らぬ地へ";
	mes "流されてしまうかもしれません。";
	mes "まぁ、人間万事塞翁が馬と言いますし。";
	mes "……要は漕いでみなければ";
	mes "わからないということです。";
	mes "さて、いかがなさいますか？";
	next;
	if(select("それでも構わないので、お願いします","え……じゃあ、遠慮します")==2) {
		mes "[実輝]";
		mes "わかりました。";
		mes "また何かありましたら";
		mes "お声をおかけください。";
		mes "では、ご機嫌よう～。";
		close;
	}
	mes "[実輝]";
	mes "了解しました。";
	mes "では、あちらの船にお乗りください。";
	mes "少々、足場が悪いので";
	mes "足元に気をつけてくださいね。";
	next;
	mes "実輝が指す先にあった";
	mes "頑丈そうな小ぶりの船に乗りこんだ。";
	close2;
	switch(rand(10)) {
		case 0:
			warp "izlude.gat",168,177;
			end;
		case 1:
		case 2:
			warp "gon_fild01.gat",260,86;
			end;
		default:
			warp "amatsu.gat",125,81;
			end;
	}
}

//==============================================================
// イベント案内
//==============================================================
amatsu.gat,123,96,3	script	旅行客	726,{
	mes "[リン]";
	mes "はふはふ……う～ん!!";
	mes "うっまぁ～い!!";
	mes "噂には聞いてたけど、";
	mes "ホントお雑煮はおいしいわ～！";
	mes "特にこのお餅がグーッ!!";
	next;
	mes "[リン]";
	mes "さぁて、破魔矢とおみくじを";
	mes "買ってこなきゃ！";
	next;
	switch (select("お雑煮はどこで売ってます？","お餅はどこで売ってます？","破魔矢はどこで売ってます？","おみくじはどこで売ってます？","何か女の子の噂を知りません？")) {
	case 1:
		mes "[リン]";
		mes "ああ、このお雑煮のこと？";
		mes "これは、ここから東にある広場で";
		mes "おばさんが売ってるわ。";
		mes "でも、今、品薄らしいから、";
		mes "買うには材料必須！みたいよ。";
		close;
	case 2:
		mes "[リン]";
		mes "ああ、このお雑煮に入ってる";
		mes "お餅のことね？";
		mes "これなら、ここから東にある広場で";
		mes "オジサンが売ってるわよ。";
		mes "もちもちっとしてて、おいしいよ～。";
		close;
	case 3:
		mes "[リン]";
		mes "え？　破魔矢？";
		mes "あら、奇遇ね～。";
		mes "私もちょうど買いに行くところなのよ。";
		mes "ここから北西に行ったところで、";
		mes "巫女さんが売っているらしいわ。";
		close;
	case 4:
		mes "[リン]";
		mes "え？　おみくじ？";
		mes "あら、奇遇ね～。";
		mes "私もちょうど買いに行くところなのよ。";
		mes "ここから西にある通りで、";
		mes "巫女さんが売っているらしいわ。";
		next;
		mes "[リン]";
		mes "聞いた話によると、";
		mes "不思議な力が込められたものも";
		mes "用意されているそうなの。";
		mes "楽しみだわ～！";
		close;
	case 5:
		mes "[リン]";
		mes "女の子～？";
		mes "う～ん、女の子ねぇ……。";
		mes "あ！　変な空き家の話は知ってる？";
		next;
		mes "[リン]";
		mes "河童がいる森に、桜に囲まれた";
		mes "空き家があるんだけど……";
		mes "そこに何かいるみたいなの。";
		mes "さすがに中は見てこなかったけど、";
		mes "かすかに女の子の声がしたわ。";
		mes "それとは関係ないかな？";
		close;
	}
}

//==============================================================
// 破魔矢販売NPC
//==============================================================
amatsu.gat,46,132,5	script	破魔矢巫女さん#arrow	769,{
	mes "[巫女]";
	mes "明けましておめでとうございます。";
	mes "こちらでは、お正月の縁起物の";
	mes "破魔矢を販売しております。";
	mes "1本 ^3152FF300 Zeny^000000になりますが";
	mes "いかがですか？";
	next;
	switch (select("破魔矢をください！","破魔矢ってなんですか？","けっこうです")) {
	case 1:
		mes "[巫女]";
		mes "ありがとうございます。";
		mes "一度に1000本まで";
		mes "お買い求めいただけます。";
		next;
		input '@num;
		if('@num <= 0) {
			mes "[巫女]";
			mes "あら？";
			mes "都合が悪いのですか？";
			mes "また機会がありましたら";
			mes "どうぞ。";
			close;
		}
		if('@num > 1000) {
			mes "[巫女]";
			mes "あら？";
			mes "1000本より多いと";
			mes "私も持てません。";
			mes "1000本以内でお願いします。";
			close;
		}
		if(Zeny < '@num*300) {
			mes "[巫女]";
			mes "あら？";
			mes "その数だとお金が足りません。";
			mes "1本 ^3152FF300 Zeny^000000になります。";
			mes "所持金を確認してくださいね。";
			close;
		}
		if(checkweight(1766,'@num)==0) {
			mes "[巫女]";
			mes "お客様、ちょっと荷物が";
			mes "多いようですね。";
			mes "荷物を減らしてくるか、";
			mes "持てる分だけでどうぞ。";
			close;
		}
		set Zeny,Zeny-'@num*300;
		getitem 1766,'@num;
		mes "[巫女]";
		mes "はい、" +'@num+ "本ですね。";
		mes "ありがとうございました。";
		mes "本年もよいお年になりますように。";
		close;
	case 2:
		mes "[巫女]";
		mes "昔から、弓には魔を退ける力があると";
		mes "信じられてきました。";
		mes "そこから、様々な邪気から";
		mes "身を守るもの「破魔弓」、そして";
		mes "「破魔矢」となったのです。";
		next;
		mes "[巫女]";
		mes "そして、年占いの際に行われた";
		mes "弓射や正月の男の子の遊びと";
		mes "されていたものが、江戸時代以降、";
		mes "子供の成長の無事を祈る縁起物として、";
		mes "弓と矢が男の子の初正月や初節句に";
		mes "贈られるようになりました。";
		next;
		mes "[巫女]";
		mes "その後、これが簡略化され矢だけが";
		mes "魔除けとして正月に神社で";
		mes "授けられるようになったのが";
		mes "この「破魔矢」と考えられています。";
		mes "新しい破魔矢を買いましたら、";
		mes "ご帰宅後、神棚におまつりください。";
		close;
	case 3:
		mes "[巫女]";
		mes "破魔矢は、縁起物なんですよ。";
		mes "お守りとして1本";
		mes "いかがですか？";
		close;
	}
}

amatsu.gat,46,135,5	duplicate(破魔矢巫女さん#arrow)	破魔矢巫女さん	769

//==============================================================
// おもち販売NPC
//==============================================================
amatsu.gat,170,114,4	script	餅つきオジサン	63,{
	mes "[餅つきオジサン]";
	mes "よう！新年あけましてめでたいな～。";
	mes "わっはっは。どうだい、俺っちが";
	mes "日の出と共についた餅はいらねぇか？";
	mes "1個^3152FF100zeny^000000だ。";
	next;
	switch (select("いただきます","いりません","餅ってなんですか？")) {
	case 1:
		mes "[餅つきオジサン]";
		mes "おし、そう来なくちゃな！";
		mes "ただし、一度に100個までだ。";
		next;
		input '@num;
		if('@num <= 0) {
			mes "[餅つきオジサン]";
			mes "つきたてでウマいんだがなー。";
			mes "ま、次はよろしく頼むぜ！";
			close;
		}
		if('@num > 100) {
			mes "[餅つきオジサン]";
			mes "おいおい、100個までって言っただろ？";
			mes "食いすぎると太るからな！";
			close;
		}
		if(Zeny < '@num*100) {
			mes "[餅つきオジサン]";
			mes "おいおい、金が足りないようだな。";
			mes "俺も生活があるからな。";
			mes "ただって訳にはいかねぇんだ。";
			close;
		}
		if(checkweight(554,'@num)==0) {
			mes "[餅つきオジサン]";
			mes "おし来た……って、おい。そんなに";
			mes "荷物を持ってたら餅が持ちきれねぇぞ。";
			mes "荷物を減らして来な。";
			close;
		}
		set Zeny,Zeny-'@num*100;
		getitem 554,'@num;
		mes "[餅つきオジサン]";
		mes "ウマくて頬が落ちるぜ！";
		mes "あ、でも慌てて食うなよ。";
		mes "喉を詰まらすからな。";
		close;
	case 2:
		mes "[餅つきオジサン]";
		mes "つきたてでウマいんだがなー。";
		mes "ま、次はよろしく頼むぜ！";
		close;
	case 3:
		mes "[餅つきオジサン]";
		mes "なんでぃ。餅を知らないのか?!";
		mes "こんな美味いもんを知らねぇなんて";
		mes "あんた人生かな～り損してるぜ。";
		mes "よし、俺が餅について教えてやらぁ！";
		next;
		mes "[餅つきオジサン]";
		mes "餅ってのはよ、糯米を蒸して作る";
		mes "アマツ伝統の食べ物さ。";
		mes "蒸した糯米をよ、俺っちが持ってる";
		mes "みたいな杵でペッタンペッタンと";
		mes "良～く粘りが出るまでつくのさ。";
		next;
		mes "[餅つきオジサン]";
		mes "んでよ、良くついてツブツブがなくなっ";
		mes "たらよ、食べやすい大きさにちぎって";
		mes "丸くしたり四角くしたりすんのさ。";
		next;
		mes "[餅つきオジサン]";
		mes "つきたてはよ、そのまま食べても美味い";
		mes "んだぜー。他にも、焼いて海苔巻いたり";
		mes "醤油つけたりよ、野菜と一緒に煮て";
		mes "雑煮にしたりよ、とにかく美味いんだ。";
		mes "うん。";
		close;
	}
}

//==============================================================
//おみくじNPC
//==============================================================
amatsu.gat,44,105,5	script	おみくじ巫女さん#chance	769,{
	mes "[巫女]";
	mes "明けましておめでとうございます。";
	mes "せっかくアマツへ";
	mes "初詣にいらしたのですから";
	mes "おみくじを引いていかれませんか？";
	next;
	mes "[巫女]";
	mes "今年は、一風変わったものも";
	mes "用意してございます。";
	mes "1回^3152FF100 zeny^000000です。";
	next;
	switch (select("はい","いいえ","おみくじ？")) {
	case 1:
		mes "[巫女]";
		mes "どの運勢について知りたいですか？";
		next;
		set @menu,select("総合運","恋愛運","金運","勝負運","健康運","？");
		if(Zeny < 100) {
			mes "[巫女]";
			mes "あらら…お金が足りないようですよ。";
			mes "おみくじは1回^3152FF100 zeny^000000です。";
			close;
		}
		if(@menu<6) {
			mes "[巫女]";
			mes "はい、ではこちらから";
		}
		else {
			mes "[巫女]";
			mes "あ、これは……";
			mes "ある冒険者さんから、";
			mes "是非、お供え物代に利用して欲しい";
			mes "ということで頂いたおみくじです。";
			next;
			mes "[巫女]";
			mes "何が書かれているかは、";
			mes "私共にも分かりませぬが……";
			mes "不思議な力が込められているようです。";
			mes "ではこちらから。";
		}
		mes "1枚引いてくださいませ。";
		next;
		mes "^3152FF- ガサガサ -^000000";
		next;
		mes "^3152FF- …… -^000000";
		next;
		set Zeny,Zeny-100;
		break;		//長いので続きは外に出す
	case 2:
		mes "[巫女]";
		mes "あら、そうですか……";
		mes "せっかく初詣にいらしたのに残念です。";
		mes "では、良いお年を～。";
		close;
	case 3:
		mes "[巫女]";
		mes "^FF5263おみくじ^000000とはアマツで年始に配られる";
		mes "一年の運勢が書かれているお札です。";
		mes "今、アマツでは神社近辺が危険なため";
		mes "こうして私が出向いておりますが……";
		next;
		mes "[巫女]";
		mes "おみくじは神前で「神の意思」を";
		mes "確かめるために行われておりました。";
		next;
		mes "[巫女]";
		mes "^3152FF‘おみくじは三拝してから引くべし’^000000";
		mes "とも言われておりまして、";
		mes "これは‘真剣な態度で引きましょう’";
		mes "と言う意味が込められています。";
		mes "軽い気持ちや遊び半分ですと、神様";
		mes "に失礼に当たりますから。";
		next;
		mes "[巫女]";
		mes "しかし、同時におみくじや占いは";
		mes "^3152FF‘吉、凶に転ずる’^000000とも言います。";
		mes "おみくじに書いてあるから必ず叶う";
		mes "という意味ではなく、おみくじを";
		mes "きっかけに自分の方針を決め、努力する";
		mes "ことが大事なのではないかと思います。";
		close;
	}
	//おみくじ続き
	switch(@menu) {
	case 1:
		switch(rand(20)) {
			case 0:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『終わり良ければ全て良し』";
				next;
				mes "途中経過は山あり谷ありで不安かもしれ";
				mes "まぜんが、最終的に願っていた以上の結";
				mes "果が出そうです。";
				break;
			case 1:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『笑う門には福来る』";
				next;
				mes "正しい行いからは良い結果が生まれるも";
				mes "のです。反対に邪心があると災難を招く";
				mes "でしょう。";
				break;
			case 2:
				mes "[御神籤][吉]";
				mes " ";
				mes "『会った時は傘をぬげ』";
				next;
				mes "挨拶は大事です。特に親しい人とあった";
				mes "ら必ず挨拶するようにしましょう。";
				mes "きっと縁が続きます。";
				break;
			case 3:
				mes "[御神籤][吉]";
				mes " ";
				mes "『人のふり見て我がふり直せ』";
				next;
				mes "他人がやってるから自分もやっていい";
				mes "ではありません。他人がやっていて悪";
				mes "いと思ったことはやらないようにしま";
				mes "しょう。";
				break;
			case 4:
				mes "[御神籤][吉]";
				mes " ";
				mes "『言うは易く行うは難し』";
				next;
				mes "目標を持つことは大事ですが、その目標";
				mes "に達するために何が必要か、しっかり考";
				mes "えてみるといいでしょう。";
				break;
			case 5:
				mes "[御神籤][吉]";
				mes " ";
				mes "『沈む瀬あれば浮かぶ瀬あり』";
				next;
				mes "辛いこともあれば良いこともあります。";
				mes "きっと努力は報われるので諦めずに進み";
				mes "ましょう。";
				break;
			case 6:
				mes "[御神籤][吉]";
				mes " ";
				mes "『一年の計は元旦にあり』";
				next;
				mes "何事も最初に計画し、それから実行しま";
				mes "しょう。行き当たりばったりでは、良い";
				mes "結果は得られそうにありません。";
				break;
			case 7:
				mes "[御神籤][吉]";
				mes " ";
				mes "『明日は明日の風が吹く』";
				next;
				mes "辛今日は今日、明日は明日です。あまり";
				mes "くよくよせずに、その日その日を過ご";
				mes "してみましょう。";
				break;
			case 8:
				mes "[御神籤][吉]";
				mes " ";
				mes "『千里の道も一歩から』";
				next;
				mes "ただ待っているだけでは何も得られませ";
				mes "ん。自分から勇気を出して一歩一歩踏み";
				mes "出していけば、きっと良い結果を得られ";
				mes "るでしょう。";
				break;
			case 9:
				mes "[御神籤][吉]";
				mes " ";
				mes "『恒産なき者は恒心なし』";
				next;
				mes "欲張らず、安定を求めれば平穏に一年が";
				mes "過ぎるでしょう。逆に功を焦ったり、だ";
				mes "らけてしまうと、後々ストレスのもとと";
				mes "なります。";
				break;
			case 10:
			case 11:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『犬も歩けば棒に当たる』";
				next;
				mes "障害物を恐れてじっとしているよりは、";
				mes "何かにぶつかる勢いで動いたほうが良い";
				mes "こともあります。思いがけない幸運は";
				mes "待っているだけでは訪れません。";
				break;
			case 12:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『旅は道連れ、世は情け』";
				next;
				mes "助け合えば、どんな困難も乗り越えられ";
				mes "るでしょう。";
				break;
			case 13:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『棚から牡丹餅』";
				next;
				mes "予期せぬ時に思わぬ幸運が舞い込んでく";
				mes "るでしょう。";
				break;
			case 14:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『雨垂れ石を穿つ』";
				next;
				mes "小さな力でも努力を忘れなければ、必ず";
				mes "大きな成果を挙げられるでしょう。";
				break;
			case 15:
				mes "[御神籤][凶]";
				mes " ";
				mes "『恩を仇で返す』";
				next;
				mes "恩人や友人を傷つけるような行為に注意";
				mes "しましょう。親しい仲でも感謝の気持ち";
				mes "を伝えることを忘れずに。";
				break;
			case 16:
				mes "[御神籤][凶]";
				mes " ";
				mes "『高慢は出世の行き止まり』";
				next;
				mes "控えめに行きましょう。偉そうな言動は";
				mes "人に嫌われるきっかけとなります。";
				break;
			case 17:
				mes "[御神籤][凶]";
				mes " ";
				mes "『前門の虎、後門の狼』";
				next;
				mes "一つ災難をやりすごしたとしても、油断";
				mes "してしまっては次の災いを招きます。";
				break;
			case 18:
				mes "[御神籤][凶]";
				mes " ";
				mes "『喉もと過ぎれば熱さ忘れる』";
				next;
				mes "苦しい時に助けてくれたり支えてくれた";
				mes "人への恩や礼を軽んじたり忘れてはいま";
				mes "せんか？大事な人を失う結果になってし";
				mes "まうかもしれません。";
				break;
			case 19:
				mes "[御神籤][大凶]";
				mes " ";
				mes "『天知る地知る我知る人知る』";
				next;
				mes "誰も見てない気がつかないと思ったら";
				mes "大間違いです。悪事や嘘が災いを招く";
				mes "でしょう。";
				break;
		}
		break;
	case 2:
		switch(rand(20)) {
			case 0:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『縁は異なもの味なもの』";
				next;
				mes "新しい展開がありそうです。人と人との";
				mes "繋がりを大事にしましょう。";
				break;
			case 1:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『破鍋に綴じ蓋』";
				next;
				mes "良い出会いがあります。お互いを思い";
				mes "やる心を忘れないようにすれば、長い";
				mes "付き合いとなるでしょう。";
				break;
			case 2:
				mes "[御神籤][吉]";
				mes " ";
				mes "『暖簾に腕押し』";
				next;
				mes "張り合いはないかも知れませんが、平穏";
				mes "が一番です。";
				break;
			case 3:
				mes "[御神籤][吉]";
				mes " ";
				mes "『言わぬことは聞こえぬ』";
				next;
				mes "口に出して言葉にしないと、伝わらない";
				mes "こともあります。言うべきことははっき";
				mes "りと伝えてあげましょう。";
				break;
			case 4:
				mes "[御神籤][吉]";
				mes " ";
				mes "『傾蓋、旧の如し』";
				next;
				mes "過去に訪れた場所に行ってみると思い";
				mes "がけない出会いがあるでしょう。";
				break;
			case 5:
				mes "[御神籤][吉]";
				mes " ";
				mes "『薊の花も一盛り』";
				next;
				mes "誰にでも魅力の出る時期は訪れるもので";
				mes "す。自分を磨く気持ちを大切にしましょ";
				mes "う。";
				break;
			case 6:
				mes "[御神籤][吉]";
				mes " ";
				mes "『お医者様でもアマツの湯でも";
				mes "　惚れた病は治りゃせぬ』";
				next;
				mes "周りが見えなくなる程のぼせあがるのを";
				mes "気をつければ、願いは叶うでしょう。";
				break;
			case 7:
				mes "[御神籤][吉]";
				mes " ";
				mes "『切る手遅かれ』";
				next;
				mes "延期できるものは伸ばしたほうが良さそ";
				mes "う。相手がいる人もいない人も焦りは禁";
				mes "物です。";
				break;
			case 8:
				mes "[御神籤][吉]";
				mes " ";
				mes "『相手のない喧嘩は出来ぬ』";
				next;
				mes "一人で喧嘩は出来ないものです。周りに";
				mes "やっかみを言われたとしても、あまり相";
				mes "手にしないほうが吉でしょう。";
				break;
			case 9:
				mes "[御神籤][吉]";
				mes " ";
				mes "『水中に火を求む』";
				next;
				mes "高望みをしてしまうと、得られるものも";
				mes "失ってしまいかねません。程ほどに。";
				break;
			case 10:
				mes "[御神籤][吉]";
				mes " ";
				mes "『惚れて通えば千里も一理』";
				next;
				mes "大切な相手のための努力は苦にならない";
				mes "もの。でも、やりすぎは逆に相手を心配";
				mes "させてしまいそうです。";
				break;
			case 11:
			case 12:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『正直の頭に神宿る』";
				next;
				mes "自分の気持ちに素直になってみると良い";
				mes "でしょう。その気持ちを伝えることも忘";
				mes "れずに。";
				break;
			case 13:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『雨降って地固まる』";
				next;
				mes "諍いやケンカもあるかも知れませんが、";
				mes "お互いの理解を深めるきっかけになりそ";
				mes "うです。";
				break;
			case 14:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『果報は寝て待て』";
				next;
				mes "待ち人は遅くなりますが必ずやってきま";
				mes "す。障害を乗り越えてこその愛です！";
				break;
			case 15:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『好機逸すべからず』";
				next;
				mes "とても大きなチャンスがやってくるで";
				mes "しょう。しかし、見逃してしまっては";
				mes "元も子もありません。";
				break;
			case 16:
				mes "[御神籤][凶]";
				mes " ";
				mes "『男心と秋の空』";
				next;
				mes "変化を求めず、現状を維持することに";
				mes "集中するべき時期です。";
				break;
			case 17:
				mes "[御神籤][凶]";
				mes " ";
				mes "『口は禍のもと』";
				next;
				mes "不用意な一言が禍となります。相手どこ";
				mes "ろか、自分の評判も落とす結果に。言葉";
				mes "には気をつけましょう。";
				break;
			case 18:
				mes "[御神籤][凶]";
				mes " ";
				mes "『思うに別れて思わぬに沿う』";
				next;
				mes "短気になったら負け。自分も傷つき、";
				mes "大切な人も傷つけてしまうかもしれま";
				mes "せん。";
				break;
			case 19:
				mes "[御神籤][大凶]";
				mes " ";
				mes "『年貢の納め時』";
				next;
				mes "観念する時期が迫っています。潔く結末";
				mes "を迎えるか、足掻いてみるかは貴方次第";
				mes "です。";
				break;
		}
		break;
	case 3:
		switch(rand(20)) {
			case 0:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『金的を射落とす』";
				next;
				mes "思いがけない大金が手に入りそうです。";
				mes "ただし、無駄遣いにはくれぐれも注意。";
				break;
			case 1:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『一攫千金』";
				next;
				mes "ドカーンと一発当たりそうな雰囲気で";
				mes "す。チャンスを逃さないよう気配りを";
				mes "忘れずに。";
				break;
			case 2:
				mes "[御神籤][吉]";
				mes " ";
				mes "『地獄の沙汰も金次第』";
				next;
				mes "自分のために使うお金なら程ほどに。";
				mes "誰かのために使うお金なら躊躇わずに";
				mes "使いましょう。";
				break;
			case 3:
				mes "[御神籤][吉]";
				mes " ";
				mes "『食うた餅より心餅』";
				next;
				mes "お金や物も大事ですが、それを与えてく";
				mes "れた人への心も大事にしましょう。";
				break;
			case 4:
				mes "[御神籤][吉]";
				mes " ";
				mes "『一銭を笑う者は一銭に泣く』";
				next;
				mes "1zenyでもお金はお金です。その価値を";
				mes "大事にすれば出費も多いですが、それに";
				mes "見合う収入がありそうです。";
				break;
			case 5:
				mes "[御神籤][吉]";
				mes " ";
				mes "『口と財布は締めるが得』";
				next;
				mes "おしゃべりと無駄遣いが天敵な一年に";
				mes "なりそうです。";
				break;
			case 6:
				mes "[御神籤][吉]";
				mes " ";
				mes "『長者の万灯より貧者の一灯』";
				next;
				mes "小さな金額だとしても、そこに達するま";
				mes "での努力や労働、気持ちを忘れないよう";
				mes "に。";
				break;
			case 7:
				mes "[御神籤][吉]";
				mes " ";
				mes "『残り物に福がある』";
				next;
				mes "マイペースでいきましょう。例え最後に";
				mes "なったとしても、福は貴方を味方するで";
				mes "しょう。";
				break;
			case 8:
				mes "[御神籤][吉]";
				mes " ";
				mes "『鍬を担げた乞食は来ない』";
				next;
				mes "働いていれば貧乏になることはありませ";
				mes "ん。収入が欲しいなら働くべきです。";
				break;
			case 9:
				mes "[御神籤][吉]";
				mes " ";
				mes "『好きこそ物の上手なれ』";
				next;
				mes "好きなことに打ち込んでみると、思わぬ";
				mes "報酬が得られそうです。";
				break;
			case 10:
				mes "[御神籤][吉]";
				mes " ";
				mes "『時は金なり』";
				next;
				mes "欲しいものがあるなら頑張って働き、";
				mes "コツコツと貯金しましょう。";
				break;
			case 11:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『日計足らずして歳計余りあり』";
				next;
				mes "物事を長い目で見ると、意外な所で儲け";
				mes "があるものです。広い視野を持ってみま";
				mes "しょう。";
				break;
			case 12:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『下手な鉄砲も数撃ちゃ当たる』";
				next;
				mes "大きいチャンスはないかもしれませんが";
				mes "そこそこの儲けが、ちょくちょくあるか";
				mes "も。目を開いてチャンスを逃さないよう";
				mes "に。";
				break;
			case 13:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『窪い所に水溜まる』";
				next;
				mes "集まるべき時と場所に、物は自然にたま";
				mes "ります。資金もまた然り。溜まった資金";
				mes "の使い道次第で新たな福を呼び込めるで";
				mes "しょう。";
				break;
			case 14:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『為せば成る』";
				next;
				mes "チャレンジ精神です。やろう！と言う";
				mes "意気込みが幸運を招くでしょう。";
				break;
			case 15:
				mes "[御神籤][凶]";
				mes " ";
				mes "『ただより高いものはない』";
				next;
				mes "付き合いやお祝い事等の出費が多い一年";
				mes "になりそうです。しかし、ケチってしま";
				mes "うと後々人間関係が気まずいことになる";
				mes "ことも……";
				break;
			case 16:
				mes "[御神籤][凶]";
				mes " ";
				mes "『夏歌うものは冬泣く』";
				next;
				mes "怠けてはいけません。一番大事な時に";
				mes "泣く羽目になります。";
				break;
			case 17:
				mes "[御神籤][凶]";
				mes " ";
				mes "『捕らぬ狸の皮算用』";
				next;
				mes "売買の計画は慎重に。手元に資金がない";
				mes "内から将来の予定を組むことは避けたほ";
				mes "うがいいでしょう。";
				break;
			case 18:
				mes "[御神籤][凶]";
				mes " ";
				mes "『貧乏暇なし』";
				next;
				mes "せっかく貯金しても無駄遣いしてしまい";
				mes "そう。あまり大きな収入は期待せずに地";
				mes "道に行きましょう。";
				break;
			case 19:
				mes "[御神籤][大凶]";
				mes " ";
				mes "『煮ても焼いても食えない』";
				next;
				mes "軽はずみな借金や、物の貸し借りは止め";
				mes "ましょう。手に負えない状態になりかね";
				mes "ません。";
				break;
		}
		break;
	case 4:
		switch(rand(20)) {
			case 0:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『先手必勝』";
				next;
				mes "ここぞ！という時に良い結果が出来るで";
				mes "しょう。負け知らずの年と言ってもいい";
				mes "ですが、準備を怠れば痛い目に合うで";
				mes "しょう。";
				break;
			case 1:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『逃げるが勝ち』";
				next;
				mes "自分の実力が発揮できる年です。満足な";
				mes "結果が得られるでしょう。ただし、時に";
				mes "は逃げることも必要です。";
				break;
			case 2:
				mes "[御神籤][吉]";
				mes " ";
				mes "『備えあれば憂い無し』";
				next;
				mes "戦いに赴く前は事前調査、情報の確認、";
				mes "装備の確認などを忘れずに。備えをしっ";
				mes "かりすれば負けることはないでしょう。";
				break;
			case 3:
				mes "[御神籤][吉]";
				mes " ";
				mes "『命あっての物種』";
				next;
				mes "命があるからこそ出来ることがありま";
				mes "す。無茶はやめて、危険なことは極力";
				mes "避けましょう。";
				break;
			case 4:
				mes "[御神籤][吉]";
				mes " ";
				mes "『急がば回れ』";
				next;
				mes "慌ててしまうと、結局出遅れてしまう";
				mes "可能性も。落ち着いて行動してみま";
				mes "しょう。";
				break;
			case 5:
				mes "[御神籤][吉]";
				mes " ";
				mes "『小事は大事』";
				next;
				mes "些細なことの積み重ねで大局を得られま";
				mes "す。日々の積み重ねが大切です。";
				break;
			case 6:
				mes "[御神籤][吉]";
				mes " ";
				mes "『餅は餅屋』";
				next;
				mes "自分の出来ること、相手の出来ること";
				mes "皆で出来ることを考えて行動するのが";
				mes "勝敗の鍵です。";
				break;
			case 7:
				mes "[御神籤][吉]";
				mes " ";
				mes "『七転び八起き』";
				next;
				mes "転んだままでは進展はありません。負け";
				mes "続きだと感じても、起き上がり続けなけ";
				mes "ば前へ進めません。";
				break;
			case 8:
				mes "[御神籤][吉]";
				mes " ";
				mes "『後悔先に立たず』";
				next;
				mes "負けた後に、ああすれば良かった……と";
				mes "思っても時は戻せません。後悔しない為";
				mes "にやるべきことを考えてみると良いで";
				mes "しょう。";
				break;
			case 9:
				mes "[御神籤][吉]";
				mes " ";
				mes "『腹が減っては戦が出来ぬ』";
				next;
				mes "準備なしで戦いに挑むのはやめま";
				mes "しょう。勝敗以前の問題です。";
				break;
			case 10:
			case 11:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『下駄も阿弥陀も同じ木の切れ』";
				next;
				mes "心構え一つの違いで雲泥の差が出てきま";
				mes "す。志を高く持ちましょう。";
				break;
			case 12:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『失敗は成功のもと』";
				next;
				mes "失敗したとしても、そこから学び、同じ";
				mes "ミスを繰り返さないよう心掛けるべし。";
				mes "自分の実力を伸ばす機会に恵まれる年と";
				mes "なるでしょう。";
				break;
			case 13:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『時は得難くして失い易し』";
				next;
				mes "油断しているとせっかくの勝機を逃して";
				mes "しまいます。勝機を見逃さなければ大き";
				mes "な成果を得られるでしょう。";
				break;
			case 14:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『研がずに鍛冶を怨むな』";
				next;
				mes "自分の環境を見直し、努力を怠っていな";
				mes "いか見つめなおしてみましょう。きっと";
				mes "良い方向に答えが見えてくるはずです。";
				break;
			case 15:
				mes "[御神籤][凶]";
				mes " ";
				mes "『得を取るより名を取れ』";
				next;
				mes "自分のことだけ考えて突進してしまうと";
				mes "仲間と上手くいかなくなってしまう恐れ";
				mes "があります。何が自分にとって大事か忘";
				mes "れずに。";
				break;
			case 16:
				mes "[御神籤][凶]";
				mes " ";
				mes "『火で火は消えぬ』";
				next;
				mes "贅沢せずに、生存優先。欲張ってしまっ";
				mes "たり、効率重視してしまうと、かえって";
				mes "マイナスとなってしまいます。";
				break;
			case 17:
				mes "[御神籤][凶]";
				mes " ";
				mes "『出る杭は打たれる』";
				next;
				mes "焦ってしまうと天は貴方を見放すで";
				mes "しょう。自分の実力を冷静に見直し";
				mes "自分の出来ることに集中すると良い";
				mes "でしょう。";
				break;
			case 18:
				mes "[御神籤][凶]";
				mes " ";
				mes "『生兵法は大怪我のもと』";
				next;
				mes "中途半端な知識で勝負しようとすると、";
				mes "返って失敗してしまいます。見栄を張っ";
				mes "たり、出た所勝負は止めましょう。";
				break;
			case 19:
				mes "[御神籤][大凶]";
				mes " ";
				mes "『万事休す』";
				next;
				mes "負ける時は負ける！どんなにコンディ";
				mes "ションが良く感じても駄目なときは駄";
				mes "目なものです。そう割り切ってしまう";
				mes "ほうが良いときもあります。";
				break;
		}
		break;
	case 5:
		switch(rand(20)) {
			case 0:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『片山曇れば片山日照る』";
				next;
				mes "体力が満ち、すごく活発的な一年になる";
				mes "でしょう。但し、他人が自分と同じとは";
				mes "限りませんので、あまり無茶を強いるの";
				mes "は止めましょう。";
				break;
			case 1:
				mes "[御神籤][大吉]";
				mes " ";
				mes "『医者の薬も匙加減』";
				next;
				mes "精神的に充実するでしょう。しかし、";
				mes "無理をしすぎると息切れするので注意";
				mes "しましょう。";
				break;
			case 2:
				mes "[御神籤][吉]";
				mes " ";
				mes "『医者の不養生』";
				next;
				mes "自分の生活態度を今一度見直してみま";
				mes "しょう。他人には気をつけて～と言っ";
				mes "ていること等、自分で実践できていま";
				mes "すか？";
				break;
			case 3:
				mes "[御神籤][吉]";
				mes " ";
				mes "『灯台下暗し』";
				next;
				mes "肉体的、精神的にも平穏に過ごせそうで";
				mes "す。けれど、足元には注意しましょう。";
				break;
			case 4:
				mes "[御神籤][吉]";
				mes " ";
				mes "『垢で死んだ者はない』";
				next;
				mes "……と言いますが、ある程度清潔感に気";
				mes "を配るのも大事。暗いダンジョンばかり";
				mes "でなく、日の光の差す場所に出て深呼吸";
				mes "してみてはいかが？";
				break;
			case 5:
				mes "[御神籤][吉]";
				mes " ";
				mes "『一に看病、二に薬』";
				next;
				mes "病に効くのはまず心遣いであって、薬は";
				mes "その次。でも、あまり不養生を重ねて周";
				mes "りを心配させないように。";
				break;
			case 6:
				mes "[御神籤][吉]";
				mes " ";
				mes "『碁打ちに時無し』";
				next;
				mes "何かに熱中するのはいいのですが、少し";
				mes "運動不足の様です。歩いて行動すること";
				mes "を心がけましょう。";
				break;
			case 7:
				mes "[御神籤][吉]";
				mes " ";
				mes "『注意一秒怪我一生』";
				next;
				mes "思わぬ怪我に注意しましょう。薬等を";
				mes "常備しておくとよいでしょう。";
				break;
			case 8:
				mes "[御神籤][吉]";
				mes " ";
				mes "『郷に入っては郷に従え』";
				next;
				mes "その地にはその地にあった生活や習慣が";
				mes "あり、何かしら由来があるものです。少";
				mes "し耳を傾けてみると、後々役に立つで";
				mes "しょう。";
				break;
			case 9:
				mes "[御神籤][吉]";
				mes " ";
				mes "『蝋燭は身を減らして人を照らす』";
				next;
				mes "自分を犠牲にして他人に尽くす心持ちで";
				mes "いれば、自分が倒れた時に誰かが助けに";
				mes "来てくれるでしょう。";
				break;
			case 10:
			case 11:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『闇雲野鶴』";
				next;
				mes "一日一日を元気に悠々と過ごせるで";
				mes "しょう。これを期に少し遠出をして";
				mes "みるといいかもしれません。";
				break;
			case 12:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『病は気から』";
				next;
				mes "何事も気の持ちようです。あまりクヨク";
				mes "ヨせずに、前向きでいれば病も吹き飛ぶ";
				mes "でしょう。";
				break;
			case 13:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『一病息災』";
				next;
				mes "なにか病気をしそうですが、無茶をせず";
				mes "気をつけるようにすれば、大事に至らず";
				mes "一年を過ごせるでしょう。";
				break;
			case 14:
				mes "[御神籤][小吉]";
				mes " ";
				mes "『医食同源』";
				next;
				mes "日々の食生活が健康と病気予防につなが";
				mes "ります。規則正しい生活さえしていれば";
				mes "大病とは縁がないでしょう。";
				break;
			case 15:
				mes "[御神籤][凶]";
				mes " ";
				mes "『薬も過ぎれば毒となる』";
				next;
				mes "少量では妙薬でも、同じものの多量摂取";
				mes "は体に毒です。何事も、集中的な摂取は";
				mes "控え、たまには散歩の一つもしてみま";
				mes "しょう。";
				break;
			case 16:
				mes "[御神籤][凶]";
				mes " ";
				mes "『痛い上の針』";
				next;
				mes "怪我をした時は、きっちりと治してから";
				mes "行動しましょう。怪我の上にまた怪我を";
				mes "してしまっては悪化するばかりです。";
				break;
			case 17:
				mes "[御神籤][凶]";
				mes " ";
				mes "『食うに倒れず病に倒れる』";
				next;
				mes "無理は禁物です。余裕をもって行動しま";
				mes "しょう。食うに困らないと驕っていては";
				mes "病に倒れてしまった時に結局出費が";
				mes "かかってしまいます。";
				break;
			case 18:
				mes "[御神籤][凶]";
				mes " ";
				mes "『鬼の霍乱』";
				next;
				mes "自分の健康を過信しすぎていると、何が";
				mes "起こるかわかりません。無理をせず睡眠";
				mes "休憩はしっかりとりましょう。";
				break;
			case 19:
				mes "[御神籤][大凶]";
				mes " ";
				mes "『生簀の鯉』";
				next;
				mes "一つのことに囚われすぎてはいません";
				mes "か？";
				mes "周囲が見えなくなってはいませんか？";
				mes "たまには違う場所に目を向けて、";
				mes "世間を見るのも大事です。";
				break;
		}
		break;
	case 6:
		switch(rand(6)) {
			case 0:
				npcskillsupport 34,0;
				sc_start 10,240000,10;	//SC_BLESSING
				mes "[御神籤][大吉]";
				mes "金運に恵まれています。";
				mes "とても貴重なアイテムが";
				mes "手に入るでしょう。";
				break;
			case 1:
				npcskillsupport 29,0;
				sc_start 12,240000,10;	//SC_INCREASEAGI
				mes "[御神籤][中吉]";
				mes "躍進の時です。";
				mes "思い切った行動が、";
				mes "幸運を呼び込むでしょう。";
				break;
			case 2:
				npcskillsupport 28,9999;
				heal 9999,0;
				mes "[御神籤][小吉]";
				mes "無理は禁物です。";
				mes "休息は適度にとりましょう。";
				break;
			case 3:
				misceffect 169,"";
				mes "[御神籤][吉]";
				mes "前進することも大事ですが、";
				mes "時には立ち止まって";
				mes "自らを振り返ることを";
				mes "忘れてはいけません。";
				break;
			case 4:
				sc_start3 SC_STONE,0,0,0,0,10000,10;
				mes "[御神籤][凶]";
				mes "忍耐の時です。";
				mes "焦らず、地道に修練を積めば、";
				mes "いずれ転機が訪れるでしょう。";
				break;
			case 5:
				sc_start3 SC_CURSE,0,0,0,0,10000,10;
				mes "[御神籤][大凶]";
				mes "背後に気をつけましょう。";
				mes "不意の攻撃に遭うかもしれません。";
				break;
		}
		break;
	}
	next;
	mes "[巫女]";
	mes "いかがでしたか？";
	mes "良い結果も悪い結果も日頃の";
	mes "行いによってもたされるもの。";
	mes "おごることなく精進する心を忘れずに。";
	mes "では、良いお年を～。";
	close;
}

amatsu.gat,44,115,5	duplicate(おみくじ巫女さん#chance)	おみくじ巫女さん	769

//==============================================================
//お雑煮作成NPC
//==============================================================
amatsu.gat,172,122,5	script	お雑煮屋	701,{
	mes "[おばさん]";
	mes "ああ～忙しいわ～。";
	mes "お正月早々、嬉しいことだけどね。";
	mes "ちょっと、そこのあんた";
	mes "お正月の定番「お雑煮」はいかが？";
	next;
	if(select("おばちゃん、お雑煮1個ください！","それって食べ物なんですか？")==2) {
		mes "[おばさん]";
		mes "まぁ！";
		mes "こんなにおいしい物を知らないのかい。";
		mes "仕方がないわねぇ～。";
		next;
		mes "[おばさん]";
		mes "「お雑煮」っていうのはね、";
		mes "お正月の定番料理のことよ。";
		mes "お餅やお野菜などを一緒に、";
		mes "こうやってじっくりじっくり";
		mes "煮込んだ温かい汁物なの。";
		next;
		mes "[おばさん]";
		mes "ほら、いい匂いがするでしょう？";
		mes "しかもおいしいし、体も温まるのよ。";
		mes "もしよかったら、あんたも";
		mes "一杯注文しなさいな";
		close;
	}
	mes "[おばさん]";
	mes "はい、お雑煮1杯ね。";
	mes "……あら、材料を切らしちゃってるわ。";
	mes "ごめんね、今、ちょっと";
	mes "品切れしちゃってるのよ。";
	mes "そうだ、あんたちょいと";
	mes "手伝ってくれないかい？";
	next;
	if(select("いいですよ","いや、急いでるので…")==2) {
		mes "[おばさん]";
		mes "それじゃ、仕方がないわねぇ。";
		mes "あぁ～、誰か手伝ってくれる";
		mes "いい人はいないのかしら～？";
		close;
	}
	mes "[おばさん]";
	mes "まぁ、悪いわねぇ～。";
	mes "じゃあ、これから言う物を";
	mes "集めてきてちょうだい。";
	mes "いい？メモは大丈夫かい？";
	next;
	mes "[おばさん]";
	mes "まず「おもち」が3個。";
	mes "これは具の目玉だからね。";
	mes "それと「緑ハーブ」が2個。";
	mes "これは添え物として使うのよ。";
	next;
	mes "[おばさん]";
	mes "あとはお野菜の「ニンジン」を3個ね。";
	mes "これを入れると甘みが出ていいのよ。";
	mes "「にく」は……2個くらいでいいわ。";
	mes "そうそう大事なダシの素「魚の尻尾」を";
	mes "忘れちゃいけないわね。";
	mes "これは5個でいいかしら。";
	next;
	if(countitem(511)<2 || countitem(515)<3 || countitem(517)<2 || countitem(554)<3 || countitem(1023)<5) {
		mes "[おばさん]";
		mes "ちゃんとメモしたわね？";
		mes "おもち3個";
		mes "緑ハーブ2個";
		mes "ニンジン3個";
		mes "にく2個";
		mes "魚の尻尾5個";
		next;
		mes "[おばさん]";
		mes "あ、あもちはそこのオジサンに";
		mes "頼んでも構わないわよ。";
		mes "でも、他はアマツじゃ";
		mes "なかなか手に入らないわねぇ。";
		mes "ちょっと大変かもしれないけど、";
		mes "お願いするわね。";
		close;
	}
	mes "[おばさん]";
	mes "あらやだ、全部持ってるじゃないの。";
	mes "あんた、お雑煮を1杯無料であげるから";
	mes "その材料をおばさんにくれないかい？";
	next;
	if(select("はい、どうぞ","これは自分で作る分なので……")==2) {
		mes "[おばさん]";
		mes "そうかい。残念だねぇ。";
		mes "材料さえあれば、私が";
		mes "温かくておいしい「お雑煮」を";
		mes "ご馳走してあげられるのにねぇ。";
		close;
	}
	mes "[おばさん]";
	mes "ありがとう。助かるわ～。";
	mes "これでまたお雑煮が";
	mes "たくさん作れるわね。";
	mes "はい、お礼のお雑煮だよ。";
	mes "まだ熱いから、火傷しないように";
	mes "少し冷ましてから食べなさいね。";
	next;
	delitem 511,2;
	delitem 515,3;
	delitem 517,2;
	delitem 554,3;
	delitem 1023,5;
	getitem 669,1;
	close;
}

//==============================================================
//お正月クエスト
//==============================================================
ama_in01.gat,180,132,4	script	少年#Newyear	764,{
	if(countitem(669)<1) {
		mes "-" +strnpcinfo(1)+ "のようだ。";
		mes "……姿が揺らいでいる。-";
		close;
	}
	mes "[達吉]";
	mes "はふはふ……ズルル～!!";
	mes "ゴックンッ、ゲホゲホ……。";
	next;
	mes "[八重]";
	mes "もう～、達吉くん。";
	mes "そんなに慌てなくてもいいのに……";
	mes "お雑煮は逃げたりしませんよ。";
	next;
	mes "[達吉]";
	mes "だって～、お雑煮おいしいんだし、";
	mes "冷めたらまずいだろ～！";
	mes "あ、さくらちゃんも食べる？";
	mes "え？　いらない？";
	mes "そっか……じゃ、ちょっと待っててね。";
	mes "食べ終わったら遊ぼ！";
	next;
	mes "-パクパク、ズルズル～！";
	mes "ゴックンゴックン!!-";
	next;
	mes "[達吉]";
	mes "ぷはーっ！";
	mes "よし、んじゃ、遊ぶか！";
	mes "さ～て、今日は何しよっか？";
	next;
	mes "[さくら]";
	mes "あ、あの……";
	mes "これ……。";
	next;
	mes "[達吉・八重]";
	mes "？？？";
	next;
	mes "[八重]";
	mes "わぁ～、これ風車じゃない～！";
	mes "これ、さくらちゃんが作ったの？";
	mes "すご～い！";
	next;
	mes "[達吉]";
	mes "フーッ！";
	mes "……おおおおお！";
	mes "よく回るよ～！　かっこいい～!!";
	next;
	mes "[達吉・八重]";
	mes "ありがとう～!!";
	next;
	mes "-さくらは、二人の笑顔に";
	mes "恥ずかしそうにしながらも、";
	mes "かすかに微笑んだ-";
	next;
	mes "-少年達の笑い声がこだましている。";
	mes "……やがて、辺りが静かになった-";
	close;
}

ama_in01.gat,177,132,4	duplicate(少年#Newyear)	少女#Newyear	759


ama_in01.gat,183,131,4	script	雅人形	1404,{}

ama_in01.gat,183,131,0	script	雅人形	111,{
	switch(NEWYEAR_EVE) {
	case 0:
		break;
	case 1:
	case 2:
		mes "[さくら]";
		mes "お二人によろしくお伝えください。";
		close;
	case 3:
		if(countitem(668)) {
			mes "[さくら]";
			mes "ありがとうございます。";
			mes "これで、私もやっと……。";
			close;
		}
		break;
	}
	if(countitem(669)<1) {
		mes "-雅人形のようだ。";
		mes "……姿が揺らいでいる。";
		mes "だが、何故か邪気が感じられない-";
		close;
	}
	mes "[雅人形]";
	mes "……あ、あの、それは？";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "ああ、お雑煮です。";
	mes "これがどうかしました？";
	next;
	mes "[雅人形]";
	mes "……お雑煮、ですか。";
	mes "とても懐かしい……";
	mes "もしかして、あなたは";
	mes "彼のことをご存知ですか？";
	next;
	input '@word$;
	if('@word$ != "達吉") {
		mes "[雅人形]";
		mes "あ、私の思い違いのようですね……";
		mes "私のことはお気になさらず、";
		mes "そっとしておいてください。";
		close;
	}
	mes "["+strcharinfo(0)+"]";
	mes "達吉さんのことですか？";
	next;
	mes "[雅人形]";
	mes "……!!";
	mes "あ、あの彼女のことも";
	mes "ご存知でしょうか？";
	next;
	input '@word$;
	if('@word$ != "八重") {
		mes "[雅人形]";
		mes "あ、私の思い違いのようですね……";
		mes "私のことはお気になさらず、";
		mes "そっとしておいてください。";
		close;
	}
	mes "["+strcharinfo(0)+"]";
	mes "八重さんのことですか？";
	next;
	mes "[雅人形]";
	mes "ああ、お二人のことを";
	mes "ご存知なのですね……";
	mes "あの……私の話を少し";
	mes "聞いていただけますか。";
	next;
	mes "[雅人形]";
	mes "……私は、昔、達吉に呼び出された";
	mes "雅人形です。";
	mes "でも、達吉、そして八重は、";
	mes "私に刃を向けませんでした。";
	mes "彼らは、私を「友達」として";
	mes "迎えてくれたのです。";
	next;
	mes "[雅人形]";
	mes "達吉たちは、私を「さくら」と名づけ、";
	mes "たくさんのことを教えてくれました。";
	mes "この「言葉」も、その一つです。";
	next;
	mes "[さくら]";
	mes "……ここは、達吉と八重と過ごした";
	mes "大事な思い出の場所。";
	mes "「喜怒哀楽」という感情を学んだ場所。";
	next;
	mes "[さくら]";
	mes "この空き家にいると、達吉たちとの";
	mes "思い出が蘇ってきます。";
	mes "今でも、彼らの笑い声が";
	mes "聞こえてくる気がします……";
	mes "そう、達吉たちと過ごした日々は";
	mes "楽しかったです……";
	next;
	mes "[さくら]";
	mes "けれど、それは束の間のことでした。";
	mes "ある日突然、アマツの民が、";
	mes "達吉たちの留守中に私を襲ったのです。";
	next;
	mes "[さくら]";
	mes "私は、深い傷を負いながらも、";
	mes "かろうじて逃げ出すことができました。";
	mes "けれども、その時に解ったのです。";
	mes "民が何故、私に刃を向けたのか。";
	next;
	mes "[さくら]";
	mes "そう、私は本来、魔物として、";
	mes "人間の敵として生きる者。";
	mes "だからこそ、";
	mes "民は達吉たちのことを案じて、";
	mes "私を排除しようとしたのです。";
	next;
	mes "[さくら]";
	mes "結局、私はその時の傷が災いし、";
	mes "命を落としました。";
	mes "しかし、達吉たちは、";
	mes "私が達吉たちを嫌って立ち去ったと";
	mes "思い込んでしまったのです。";
	next;
	mes "[さくら]";
	mes "……とても悲しいです。";
	mes "私は達吉たちのことが";
	mes "本当に好きなのに……";
	next;
	mes "[さくら]";
	mes "この頃、あの懐かしい匂いが";
	mes "アマツのあちらこちらから";
	mes "漂ってきます。";
	mes "その匂いに誘われ……";
	mes "気が付くと私はここにいました。";
	next;
	mes "[さくら]";
	mes "……そして、年老いた達吉と八重を";
	mes "見かけました。";
	mes "そこで、彼らに頑張って話しかけようと";
	mes "しましたが、何かを言う前に、";
	mes "姿が消えてしまい……";
	mes "気付くとまた、私はこの空き家に……。";
	next;
	mes "[さくら]";
	mes "あの、よろしければ、達吉と八重に";
	mes "私の想いを伝えていただけませんか？";
	mes "私は、達吉たちのことが大好きだと。";
	mes "決して嫌ってなんかいないと。";
	mes "その証として、この思い出の風車を";
	mes "渡していただけませんか？";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "わかりました。";
	mes "では、このお雑煮は";
	mes "あなたにあげましょう。";
	next;
	mes "[さくら]";
	mes "ありがとうございます！";
	mes "とても嬉しいです……";
	next;
	mes "[さくら]";
	mes "お雑煮……お雑煮も、";
	mes "彼らに渡していただけませんか。";
	mes "きっと喜んでくれると思います。";
	mes "私では、お雑煮を手に入れることが";
	mes "できませんので……お願いします。";
	delitem 669,1;
	getitem 7192,2;
	set NEWYEAR_EVE,1;
	close;
}

alberta.gat,247,115,4	script	お爺さん	120,{
	switch(NEWYEAR_EVE) {
	case 0:
		break;
	case 1:
		if(countitem(669) && countitem(7192)) {
			mes "[達吉]";
			mes "お!!　おぬし！";
			mes "これをどこで手に入れたのじゃ？";
			mes "も、もしかして、あの女の子に……？";
			next;
			input '@word$;
			if('@word$ != "さくら") {
				mes "[達吉]";
				mes "あ、すまんかった。";
				mes "わしの勘違いのようじゃな。";
				close;
			}
			mes "["+strcharinfo(0)+"]";
			mes "さくらさんからあなたに渡して欲しいと";
			mes "頼まれたものです。";
			next;
			mes "[達吉]";
			mes "な、さ、さくらじゃと？";
			mes "……さくら……ああ、そうか。";
			mes "そうじゃったのか……。";
			next;
			mes "[達吉]";
			mes "昔、わしはアマツに住んでいた。";
			mes "八重ちゃんはわしの幼馴染で、";
			mes "よく一緒に遊んでおった。";
			mes "ある日、わしは、八重ちゃんを誘って、";
			mes "遥か彼方にあると言われていた";
			mes "ミッドガルド大陸へ渡ったのじゃ。";
			next;
			mes "[達吉]";
			mes "当時はまだ、大陸との行き来は";
			mes "盛んじゃなかったがのう。";
			mes "どうやって渡ったかって？";
			mes "それは、内緒じゃ。";
			mes "まあ、後で親父には";
			mes "大目玉をくらったがのう～。";
			next;
			mes "[達吉]";
			mes "大陸で、わしは不思議な枝を";
			mes "拾ったんじゃ。";
			mes "何の枝かはわからんかったが、";
			mes "何か気になってのう……";
			mes "それを森の中にある空き家に";
			mes "そっと隠しておいた。";
			next;
			mes "[達吉]";
			mes "だが、ある日、わしはそれを誤って";
			mes "折ってしまったのじゃ。";
			mes "そしたら……なんと、";
			mes "女の子が出てきたではないか。";
			mes "わしと八重ちゃんはかなり驚いたよ。";
			next;
			mes "[達吉]";
			mes "けれども、とても嬉しかった。";
			mes "何せ、新しい友達ができたからのう～。";
			mes "わしらは、その女の子を、";
			mes "空き家の前にある桜の木にちなんで";
			mes "「さくら」と呼ぶことにした。";
			next;
			mes "[達吉]";
			mes "それから、わしと八重ちゃんは";
			mes "よく森の空き家で遊ぶようになった。";
			mes "ちょうどお正月の時期じゃったから";
			mes "よくそこでお雑煮を食べておったよ。";
			next;
			mes "[達吉]";
			mes "そうじゃ、そこでわしらのために、";
			mes "さくらちゃんが作ってくれたものが……";
			mes "この風車じゃった。懐かしいのう～。";
			mes "そうか、さくらちゃんは、";
			mes "わしらのことを嫌いになったわけじゃ";
			mes "なかったのか……";
			next;
			mes "[達吉]";
			mes "ありがとう、ありがとう。";
			mes "嬉しいのう～。";
			mes "いずれ、八重ちゃんに会いに行き、";
			mes "そしてあの空き家にも行こう。";
			mes "おぬし、先に、八重ちゃんに、";
			mes "わしは元気じゃと伝えてくれないか。";
			next;
			mes "[達吉]";
			mes "あと、これを八重ちゃんに";
			mes "渡して欲しい。";
			mes "これは、昔、八重ちゃんが";
			mes "欲しがっていたものじゃ。";
			mes "八重ちゃんはきれいなものを";
			mes "集めておってのう。よろしく頼む。";
			delitem 669,1;
			delitem 7192,1;
			getitem 7041,1;
			set NEWYEAR_EVE,2;
			close;
		}
		break;
	case 2:
		mes "[達吉]";
		mes "八重ちゃんによろしくな。";
		close;
	case 3:
		if(countitem(668)) {
			mes "[達吉]";
			mes "本当にありがとうな。";
			mes "おかげで、とても";
			mes "すがすがしい気分じゃ。";
			close;
		}
		break;
	}
	mes "[達吉]";
	mes "ん？　わしに何か用か？";
	mes "わしは、ここで遥か彼方の故郷を思い、";
	mes "海を眺めているんじゃよ。";
	mes "アマツを離れて、もう何十年が";
	mes "経つことやら……八重ちゃんに";
	mes "会って話がしたいのう。";
	next;
	mes "[達吉]";
	mes "年をとったせいなのか、";
	mes "このところ何度も同じ夢を見る。";
	mes "いつも同じ女の子がわしに";
	mes "何かを語りかけてくるのじゃ。";
	mes "アマツで何か起きているのじゃろうか？";
	close;
}

amatsu.gat,262,248,6	script	お婆さん	103,{
	switch(NEWYEAR_EVE) {
	case 0:
	case 1:
		break;
	case 2:
		if(countitem(669) && countitem(7041) && countitem(7192)) {
			mes "[八重]";
			mes "ん？　それは……";
			mes "あなた、もしかして";
			mes "あの女の子に会ったのかい？";
			next;
			input '@word$;
			if('@word$ != "さくら") {
				mes "[八重]";
				mes "あら……ごめんね。";
				mes "私の思い違いのようじゃ……";
				mes "気にしないでね。";
				close;
			}
			mes "["+strcharinfo(0)+"]";
			mes "さくらさんに会いました。";
			mes "それから……";
			next;
			input '@word$;
			if('@word$ != "達吉") {
				mes "["+strcharinfo(0)+"]";
				mes "（あ、えっと何だっけ？";
				mes "仕方ない。";
				mes "もう一度お爺さんに会ってこよう）";
				mes "……あ、ちょっとまた後で来ます！";
				close;
			}
			mes "["+strcharinfo(0)+"]";
			mes "達吉さんにも会いました。";
			next;
			mes "[八重]";
			mes "……！";
			mes "え、達吉さんに会ったのかい？";
			mes "それに、さくらちゃんって……";
			mes "あ、さくらちゃん……あの女の子……";
			next;
			mes "[八重]";
			mes "そう……さくらちゃん……私のことを、";
			mes "嫌いになったわけじゃなかったのね……";
			mes "それを伝えようとしていたのかい。";
			mes "それに達吉さん、元気そうでよかった。";
			mes "しかも私のことを";
			mes "覚えていたなんて、嬉しいわ。";
			next;
			mes "[八重]";
			mes "達吉さん、さくらちゃんと過ごした";
			mes "あの空き家での日々……";
			mes "私にとってかけがえのない";
			mes "大切な思い出じゃ。";
			next;
			mes "[八重]";
			mes "それが私だけでなく、";
			mes "達吉さんやさくらちゃんも";
			mes "大切に想っていてくれたなんて……";
			mes "この上ない喜びじゃ。";
			next;
			mes "[八重]";
			mes "見ず知らずの老人に";
			mes "こんなにも親切にしてくれるなんて";
			mes "本当にありがたい。";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "あ、いえ、そんな……";
			mes "あ、これ、達吉さんとさくらさんから";
			mes "預かってきたものです。";
			next;
			mes "[八重]";
			mes "まさか、達吉さんとさくらちゃんから";
			mes "贈り物をいただけるなんて……";
			mes "ありがとう、ありがとう……";
			mes "これは、私からの";
			mes "お礼の気持ちですじゃ。";
			delitem 669,1;
			delitem 7041,1;
			delitem 7192,1;
			getitem 668,1;
			set NEWYEAR_EVE,3;
			close;
		}
		break;
	case 3:
		if(countitem(668)) {
			mes "[八重]";
			mes "ありがとうありがとう……";
			mes "達吉さんと会える日を";
			mes "楽しみにしておるよ。";
			close;
		}
		break;
	}
	mes "[八重]";
	mes "こんにちは～。";
	mes "こちらへはお散歩かね？";
	mes "……最近、幼い頃を思い出すわ。";
	mes "昔、よく遊んだ達吉さんは";
	mes "今頃どうしているのかねぇ……";
	next;
	mes "[八重]";
	mes "そういえばこの頃、いつも夢に";
	mes "ある女の子が出てくるの。";
	mes "彼女は何を伝えたいのじゃろう……？";
	close;
}
