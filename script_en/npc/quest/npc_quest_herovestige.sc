//= Auriga Script ==============================================================
// Ragnarok Online Hero Vestige Script	by refis
//==============================================================================

//============================================================
// 次元の狭間 時の通路01 NPC
//------------------------------------------------------------
mid_camp.gat,207,290,5	script	次元の狭間の案内員#gk01	852,{
	mes "[遠征隊員フィル]";
	mes "次元の狭間内部に行きたいのですか？";
	mes "それなら、そこにある次元移動機を";
	mes "使ってください。";
	next;
	if(select("次元の狭間について聞く","会話を終わらせる") == 2) {
		mes "‐あなたはその場から離れた‐";
		close;
	}
	mes "[遠征隊員フィル]";
	mes "少し前から、私たちは次元の狭間を";
	mes "利用して、こことミッドガルドを";
	mes "行き来しているじゃありませんか？";
	mes "こちらの狭間も、そういった";
	mes "通路のようなものだと";
	mes "考えていただければいいと思います。";
	next;
	mes "[遠征隊員フィル]";
	mes "次元の狭間の中を通ることで";
	mes "いろいろな場所に移動する方法が";
	mes "発見されたんです。";
	next;
	mes "[遠征隊員フィル]";
	mes "それで、安定性の確認がとれた通路が";
	mes "公開されたのです。";
	mes "これで、ビフロストとモロク、";
	mes "エルディカスティスへの";
	mes "移動が楽になりました。";
	next;
	mes "[遠征隊員フィル]";
	mes "次元の狭間は時間と空間が";
	mes "歪んだ場所です。";
	mes "もし道に迷ってしまったら";
	mes "どこに放り出されるかわかりません。";
	mes "調査済みの地域のみ利用してください。";
	next;
	mes "[遠征隊員フィル]";
	mes "中で迷子になると救出は困難ですので";
	mes "くれぐれも気を付けてください。";
	close;
}

mid_camp.gat,212,290,3	script	次元の狭間の案内員#gk02	852,{
	mes "[遠征隊員]";
	mes "次元の狭間内部に行きたい方は";
	mes "次元移動機を利用してください。";
	mes "次元の狭間内部は";
	mes "まだ探索中の通路もありますので";
	mes "道に迷わない様に気を付けて下さい。";
	close;
}

moc_fild22b.gat,225,198,5	script	次元の狭間の案内員#gk03	707,{
	mes "[遠征隊員]";
	mes "次元の狭間内部に行きたいのですか？";
	mes "それなら、そこにある次元移動機を";
	mes "使ってください。";
	next;
	if(select("次元の狭間について聞く","会話終了") == 2) {
		mes "‐あなたはその場から離れた‐";
		close;
	}
	mes "[遠征隊員]";
	mes "少し前から、私たちは次元の狭間を";
	mes "利用して、こことミッドガルドを";
	mes "行き来しているじゃありませんか？";
	mes "こちらの狭間も、そういった";
	mes "通路のようなものだと";
	mes "考えていただければいいと思います。";
	next;
	mes "[遠征隊員]";
	mes "次元の狭間の中を通ることで";
	mes "いろいろな場所に移動する方法が";
	mes "発見されたんです。";
	next;
	mes "[遠征隊員]";
	mes "それで、安定性の確認がとれた通路が";
	mes "公開されたのです。";
	mes "これで、ビフロストとモロク、";
	mes "エルディカスティスへの";
	mes "移動が楽になりました。";
	next;
	mes "[遠征隊員]";
	mes "次元の狭間は時間と空間が";
	mes "歪んだ場所です。";
	mes "もし道に迷ってしまったら";
	mes "どこに放り出されるかわかりません。";
	mes "調査済みの地域のみ利用してください。";
	next;
	mes "[遠征隊員]";
	mes "くれぐれも気を付けてください。";
	close;
}

moc_fild22b.gat,223,203,3	script	次元の狭間の案内員#gk04	707,{
	mes "[遠征隊員]";
	mes "次元の狭間内部に行きたい方は";
	mes "次元移動機を利用してください。";
	mes "次元の狭間内部は";
	mes "まだ探索中の通路もありますので";
	mes "道に迷わない様に気を付けて下さい。";
	close;
}

bif_fild01.gat,314,155,5	script	次元の狭間の案内員#gk05	852,{
	mes "[遠征隊員]";
	mes "次元の狭間内部に行きたいのですか？";
	mes "それなら、そこにある次元移動機を";
	mes "使ってください。";
	next;
	switch(select("次元の狭間について聞く","近くに怪しい人がいる","会話終了")) {
	case 1:
		mes "[遠征隊員]";
		mes "少し前から、私たちは次元の狭間を";
		mes "利用して、こことミッドガルドを";
		mes "行き来しているじゃありませんか？";
		mes "こちらの狭間も、そういった";
		mes "通路のようなものだと";
		mes "考えていただければいいと思います。";
		next;
		mes "[遠征隊員]";
		mes "次元の狭間の中を通ることで";
		mes "いろいろな場所に移動する方法が";
		mes "発見されたんです。";
		next;
		mes "[遠征隊員]";
		mes "それで、安定性の確認がとれた通路が";
		mes "公開されたのです。";
		mes "これで、ビフロストとモロク、";
		mes "エルディカスティスへの";
		mes "移動が楽になりました。";
		next;
		mes "[遠征隊員]";
		mes "次元の狭間は時間と空間が";
		mes "歪んだ場所です。";
		mes "もし道に迷ってしまったら";
		mes "どこに放り出されるかわかりません。";
		mes "調査済みの地域のみ利用してください。";
		next;
		mes "[遠征隊員]";
		mes "中で迷子になると救出は困難ですので";
		mes "くれぐれも気を付けてください。";
		close;
	case 2:
		mes "[遠征隊員]";
		mes "怪しい人？";
		mes "あ……はい、あの人ですね。";
		mes "エルディカスティスの偉い方が";
		mes "狭間の調査に派遣した人のようです。";
		next;
		mes "[遠征隊員]";
		mes "なるべく摩擦が起きない様に";
		mes "ラフィネ族達が努力をしています。";
		mes "それ以上の詳しいことは";
		mes "私もよく分かりません。";
		close;
	case 3:
		mes "‐あなたはその場から離れた‐";
		close;
	}
}

bif_fild01.gat,320,154,3	script	次元の狭間の案内員#gk06	852,{
	mes "[遠征隊員]";
	mes "次元の狭間内部に行きたい方は";
	mes "次元移動機を利用してください。";
	mes "次元の狭間内部は";
	mes "まだ探索中の通路もありますので";
	mes "道に迷わない様に気を付けて下さい。";
	close;
}

dic_fild02.gat,236,33,5	script	次元の狭間の案内員#gk07	852,{
	mes "[遠征隊員]";
	mes "次元の狭間内部に行きたいのですか？";
	mes "それなら、そこにある次元移動機を";
	mes "使ってください。";
	next;
	if(select("次元の狭間について聞く","会話終了") == 2) {
		mes "‐あなたはその場から離れた‐";
		close;
	}
	mes "[遠征隊員]";
	mes "少し前から、私たちは次元の狭間を";
	mes "利用して、こことミッドガルドを";
	mes "行き来しているじゃありませんか？";
	mes "こちらの狭間も、そういった";
	mes "通路のようなものだと";
	mes "考えていただければいいと思います。";
	next;
	mes "[遠征隊員]";
	mes "次元の狭間の中を通ることで";
	mes "いろいろな場所に移動する方法が";
	mes "発見されたんです。";
	next;
	mes "[遠征隊員]";
	mes "それで、安定性の確認がとれた通路が";
	mes "公開されたのです。";
	mes "これで、ビフロストとモロク、";
	mes "エルディカスティスへの";
	mes "移動が楽になりました。";
	next;
	mes "[遠征隊員]";
	mes "次元の狭間は時間と空間が";
	mes "歪んだ場所です。";
	mes "もし道に迷ってしまったら";
	mes "どこに放り出されるかわかりません。";
	mes "調査済みの地域のみ利用してください。";
	next;
	mes "[遠征隊員]";
	mes "中で迷子になると救出は困難ですので";
	mes "くれぐれも気を付けてください。";
	close;
}

dic_fild02.gat,239,36,3	script	次元の狭間の案内員#gk08	852,{
	mes "[遠征隊員]";
	mes "次元の狭間内部に行きたい方は";
	mes "次元移動機を利用してください。";
	mes "次元の狭間内部は";
	mes "まだ探索中の通路もありますので";
	mes "道に迷わない様に気を付けて下さい。";
	close;
}

-	script	次元移動機#Hero1	10007,{
	mes "‐次元移動機がある。";
	mes "　次元の狭間内部に行きますか？‐";
	next;
	if(select("はい","いいえ") == 2) {
		mes "‐あなたは次元移動機から離れた‐";
		close;
	}
	mes "‐次元の狭間内部に移動します‐";
	close2;
	set '@name$,strnpcinfo(2);
	if('@name$ == "gate01")
		warp "dali.gat",141,82;
	else if('@name$ == "gate02")
		warp "dali.gat",119,59;
	else if('@name$ == "gate03")
		warp "dali.gat",44,94;
	else if('@name$ == "gate04")
		warp "dali.gat",40,134;
	end;
}

mid_camp.gat,210,292,0		duplicate(次元移動機#Hero1)	次元移動機#gate01	10007
moc_fild22b.gat,222,200,3	duplicate(次元移動機#Hero1)	次元移動機#gate02	10007
bif_fild01.gat,318,159,3	duplicate(次元移動機#Hero1)	次元移動機#gate03	10007
dic_fild02.gat,241,31,3		duplicate(次元移動機#Hero1)	次元移動機#gate04	10007

dali.gat,149,82,0	warp	#dari_to_midcamp		3,3,mid_camp.gat,210,289
dali.gat,122,48,0	warp	#dari_to_moc_fild22b	3,3,moc_fild22b.gat,227,200
dali.gat,39,87,0	warp	#dari_to_bif_fild01		3,3,bif_fild01.gat,318,155
dali.gat,35,139,0	warp	#dari_to_dic_fild02		3,3,dic_fild02.gat,237,32

dali.gat,109,94,5	shop	猫の手サービス雑貨商人	496,611,1750,1065,579,602

dali.gat,112,95,3	script	猫の手サービス物流管理	496,{
	mes "[物流管理ニャン]";
	mes "いらっしゃいにゃん。";
	mes "この不思議な場所で";
	mes "あなた達の品物を管理している";
	mes "物流管理ニャンだにゃん。";
	mes "倉庫利用するのにゃん？";
	next;
	if(select("倉庫を利用する-200Zeny","やめる") == 2) {
		mes "[物流管理ニャン]";
		mes "また来てくれにゃん。";
		close;
	}
	if(Zeny < 200) {
		// 未調査
		mes "[物流管理ニャン]";
		mes "お金が足りないにゃん！";
		close;
	}
	mes "[物流管理ニャン]";
	mes "倉庫を開くにゃん。";
	set Zeny,Zeny-200;
	openstorage;
	close;
}

dali.gat,56,126,3	script	サファ族の派遣員#dali01	449,{
	mes "[ミヨ]";
	mes "ここの次元の狭間は";
	mes "エルディカスティスの南にある。";
	mes "カミダル山麗南部と繋がっています。";
	mes "調査のため、ここに寄りましたけど";
	mes "本当に信じられません。";
	next;
	mes "[ミヨ]";
	mes "すぐ隣にはラフィネ族がいるし……";
	mes "……うむ……";
	mes "あ、心配しないでください。";
	mes "こんな所で戦いたくありませんから。";
	close;
OnInit:
	waitingroom "カミダル山麓南部方面",0;
	end;
}

dali.gat,51,104,5	script	スプレンディット兵士#da	447,{
	mes "[スプレンディット兵士]";
	mes "この空間内もビフロストと同じで";
	mes "不思議な力が働いているようですね。";
	mes "他の種族との意志疎通が容易なので";
	mes "助かります。";
	next;
	mes "[スプレンディット兵士]";
	mes "ここはビフロスト南部と繋がっている";
	mes "次元の狭間です。";
	mes "スプレンディット前線基地まで";
	mes "移動できます。";
	next;
	mes "[スプレンディット兵士]";
	mes "それと、これをうまく利用すると";
	mes "サファ族の首都まで素早い進撃が";
	mes "可能かもしれません。";
	mes "ふふ……冗談ですよ。";
	next;
	mes "[スプレンディット兵士]";
	mes "マヨルからなるべく摩擦は避けて";
	mes "協力するようにと言われたので、";
	mes "そんな事はしませんよ。";
	mes "現時点での敵はサファ族ではなく、";
	mes "魔王ですから。";
	close;
OnInit:
	waitingroom "ビフロスト南部方面",0;
	end;
}

dali.gat,137,87,3	script	連合駐屯地派遣員#dali03	997,{
	mes "[連合駐屯地派遣員]";
	mes "こちらの次元の狭間は";
	mes "ヨトゥンヘイムの連合キャンプと";
	mes "繋がっています。";
	next;
	mes "[連合駐屯地派遣員]";
	mes "安定的な移動が可能になるように";
	mes "数百回の実験の末に";
	mes "設置されたものなので";
	mes "安心してください。";
	close;
OnInit:
	waitingroom "ミッドガルド連合軍駐屯地方面",0;
	end;
}

dali.gat,122,60,3	script	モロク兵士#dali04	707,{
	mes "[モロク兵士]";
	mes "こっちはモロクに発生している";
	mes "次元の狭間と繋がっています。";
	mes "ミッドガルドに戻れる一番の近道です。";
	mes "狭間の周辺は相変わらずですが……";
	close;
OnInit:
	waitingroom "モロク東部方面",0;
	end;
}


//============================================================
// 次元の狭間 時の通路02 NPC
//------------------------------------------------------------

dali.gat,64,129,0	warp	#dali_to_dali02	1,1,dali02.gat,66,101
dali02.gat,66,97,0	warp	#dali02_to_dali	1,1,dali.gat,64,125

dali.gat,68,129,3	script	案内板	837,{
	mes "[インフォメーション]";
	mes "この先";
	mes "次元の狭間 時の通路02(dali02)";
	close;
}

dali02.gat,70,98,3	script	案内板	837,{
	mes "[インフォメーション]";
	mes "魔神の塔の入場口を";
	mes "コンパスに表示しますか？";
	mes "　";
	mes "コンパスは画面右上のミニマップより";
	mes "確認可能です。";
	next;
	switch(select("コンパスを表示させたい","コンパスを消したい")) {
	case 1:
		mes "[インフォメーション]";
		mes "コンパス表示を出しました。";
		viewpoint 1, 141, 120, 1, 0x00FF00;
		close;
	case 2:
		mes "[インフォメーション]";
		mes "コンパス表示を消しました。";
		viewpoint 2, 1, 1, 1, 0xFFFFFF;
		close;
	}
}

dali02.gat,51,112,5	script	混乱に陥ったシーフ	939,{
	mes "[混乱に陥ったシーフ]";
	mes "酒に酔った奴らから金品を";
	mes "盗んでいたら、いつの間にか";
	mes "こんなところに出たんだ。";
	mes "ここは変なものばかりだな。";
	next;
	mes "[混乱に陥ったシーフ]";
	mes "時間も場所も全てがでたらめ";
	mes "ふぅ……あの時のように";
	mes "仕事に集中していれば";
	mes "また、帰れるのだろうか……？";
	close;
}

dali02.gat,68,117,5	script	案内人レシア族	516,{
	mes "[案内人レシア族]";
	mes "また、ここに出てしまった。";
	mes "出口も見えないなんて……";
	mes "まったく……";
	mes "ひどい迷路につかまってしまった。";
	close;
}

dali02.gat,65,119,5	script	観光客レシア族	516,{
	mes "[観光客レシア族]";
	mes "ここがあの有名なプロンテラか？";
	mes "やはり大都市！　薄暗いな！";
	close;
}

dali02.gat,69,122,5	script	旅行中レシア族	516,{
	mes "[旅行中レシア族]";
	mes "時計の音が聞こえる暗い場所！";
	mes "ここは絶対コモドだよ！";
	close;
}

dali02.gat,65,115,5	script	冒険好きレシア族	516,{
	mes "[冒険好きレシア族]";
	mes "みんな、武器を取れ！";
	mes "僕たちはタナトスタワーの";
	mes "真っ只中なんだ！";
	close;
}

dali02.gat,45,96,6	script	コンチネンタルガード	707,{
	mes "[コンチネンタルガード]";
	mes "ここから先は移動が統制されています。";
	mes "とても危険な場所なので、";
	mes "不用意な出入りは控えて下さい。";
	next;
	switch(select("次元の狭間に入る","どこに繋がっているのか聞く","何が起きていたのか聞く","対話をやめる")) {
	case 1:
		mes "[コンチネンタルガード]";
		mes "次元の狭間に入りますか？";
		mes "安定性をチェックするので、";
		mes "少しお待ち下さい。";
		next;
		mes "[コンチネンタルガード]";
		mes "チェックが完了しました。";
		mes "くれぐれも気を付けて下さいね。";
		close2;
		warp "moc_fild22.gat",36,196;
		end;
	case 2:
		mes "[コンチネンタルガード]";
		mes "魔王は倒されましたが、様々な時間と";
		mes "繋がっているここからは、";
		mes "ポイントさえうまく抑える事ができれば、";
		mes "過去を旅することも可能です。";
		next;
		mes "[コンチネンタルガード]";
		mes "学者たちの研究によると、";
		mes "この次元の狭間の先は、";
		mes "まだモロクが活動していた時代に";
		mes "繋がっているらしいです。";
		next;
		mes "[コンチネンタルガード]";
		mes "怖いので私は入った事はありません。";
		mes "これ以上のことを知りたければ、";
		mes "直接中に入って確かめてください。";
		close;
	case 3:
		mes "[コンチネンタルガード]";
		mes "モロクの事件をご存じないのですか？";
		next;
		mes "[コンチネンタルガード]";
		mes "以前、砂漠の都市モロクの地下に";
		mes "封印されていた魔王モロクが";
		mes "復活する事件があったんです。";
		next;
		mes "[コンチネンタルガード]";
		mes "しかし三ヶ国同盟、";
		mes "ラフィネ族、サファ族による";
		mes "連合軍の活躍によって、";
		mes "魔王モロクは退治されました。";
		next;
		mes "[コンチネンタルガード]";
		mes "ただ、モロクの街周辺には";
		mes "まだモロクの部下が残っています。";
		mes "そのため周辺を移動する際には、";
		mes "十分に注意をしてください。";
		close;
	case 4:
		mes "[コンチネンタルガード]";
		mes "それでは良い一日を。";
		close;
	}
}

dali.gat,100,82,5	script	案内人ガド#01	516,{
	mes "[案内人ガド]";
	mes "ここって風景がどこも似ていて";
	mes "意外に迷いやすいよね。";
	mes "行きたいところがあったら";
	mes "案内してあげるよ。";
	next;
	switch(select(
		"やめる",
		((strnpcinfo(2) == "01")? "時の通路02": "時の通路01"),
		"サラの記憶",
		"フェイスワームの巣",
		"ゲフェン魔法大会",
		"魔神の塔",
		"フェンリルとサラ",
		"飛行船襲撃",
		"呪いの剣士"
	)) {
	case 1:
		mes "[案内人ガド]";
		mes "そう。";
		mes "迷わないように気を付けてね。";
		close;
	case 2:
		if(strnpcinfo(2) == "01")
			set '@map$,"dali02.gat";
		else
			set '@map$,"dali.gat";
		set '@x,110;
		set '@y,78;
		break;
	case 3:
		set '@map$,"dali.gat";
		set '@x,138;
		set '@y,111;
		break;
	case 4:
		set '@map$,"dali.gat";
		set '@x,85;
		set '@y,63;
		break;
	case 5:
		set '@map$,"dali.gat";
		set '@x,90;
		set '@y,139;
		break;
	case 6:
		set '@map$,"dali02.gat";
		set '@x,135;
		set '@y,112;
		break;
	case 7:
		set '@map$,"dali02.gat";
		set '@x,90;
		set '@y,139;
		break;
	case 8:
		set '@map$,"dali02.gat";
		set '@x,134;
		set '@y,83;
		break;
	case 9:
		set '@map$,"dali02.gat";
		set '@x,48;
		set '@y,128;
		break;
	}
	mes "[案内人ガド]";
	mes "よーし！";
	mes "それじゃボクについてきて！";
	close2;
	warp '@map$,'@x,'@y;
	end;
}

dali02.gat,100,82,5		duplicate(案内人ガド#01)	案内人ガド#02	516