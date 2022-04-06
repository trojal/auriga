//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- 冒険者アカデミー  Luneの依頼
//
//                                                 by Pneuma
//奇跡の箱   -------------------------------------------------

// 赤色 0xFF0000
alberta.gat,39,46,5		script	Louise	726,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_1) goto L_OTHER;
	switch(AC_QUEST_LV_1){
	case 0:
		goto L_QUEST01;
	case 1:
		goto L_QUEST02;
	case 2:
		goto L_QUEST03;
	case 3:
		goto L_QUEST04;
	case 4:
		goto L_QUEST05;
	case 5:
		goto L_QUEST06;
	case 6:
		goto L_QUEST07;
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_QUEST09;
	}
L_QUEST01:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes "Ah! You, you!";
		next;
		menu "?",-;
		mes "[Louise]";
		mes "It's you! ;
		mes "Who took my request from the Adventurer's Academy." ;
		next;
		mes "[Louise]";
		mes "I am the client!" ;
		mes "My name is Louise." ;
		mes "Nice to meet you." ;
		next;
		menu "How did you know?" ,-;
		emotion 1,"";
		mes "[Louise]";
		mes "I'm in business, and I've seen all kinds of people." ;
		mes "I've been in business for a long time, and I can usually tell what a person is doing at a glance." ;
		next;
		mes "[Louise]";
		mes "I heard that the best adventurer from the academy was coming, so when I saw you, I knew that this was the one." ;
		next;
		menu "...... What is your request?" ,-;
		mes "[Louise]";
		mes "The request is for you to help me find the owner of this box." ;
		next;
		mes "[Louise]";
		mes "Actually, I just moved to Alberta." ;
		next;
		mes "[Louise]";
		mes "So, when I was digging a hole to plant a hobby plant because our yard was so bleak, I found this box." ;
		next;
		mes "[Louise]";
		mes "I opened the box and there was a letter in it, and I was soooooo touched by this letter ......";
		next;
		mes "[Louise]";
		mes "And if you look at the date, this letter was written over ^FF00000050 years ago^000000." ;
		mes " " ";
		mes "I really want to find the owner of this letter." ;
		next;
		mes "[Louise]";
		mes "But it's a 50 year old letter and it's so badly damaged that I can't read the part about the sender and the person to whom it was sent." ;
		next;
		mes "[Louise]";
		mes "So, you know, I've been told that there is a paper and pen expert here in east Alberta." ;
		next;
		mes "[Louise]";
		mes "So, I need you to find that specialist and have him look up the sender and the part of the person it was sent to.";
		next;
		mes "[Louise]";
		mes "Yes, I'll give you the letter and envelope." ;
		mes "Please find the sender and the person it was sent to." ;
		next;
		mes "^FF000000 [Mission] ^000000";
		mes "-Meet the paper and pen expert in the eastern direction of Alberta-";
		close2;
		viewpoint 1,234,98,11,0x0000FF;
		//なぜか青
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "From what I've heard, there are paper and pen experts here in Alberta to the east." ;
		next;
		mes "[Louise]";
		mes "So, I need you to find that specialist and have him look up the sender and the part of the person it was sent to." ;
		next;
		mes "^FF000000 [Mission] ^000000";
		mes "-Meet the paper and pen expert in the eastern direction of Alberta-";
		close2;
		viewpoint 1,234,98,11,0x0000FF;
		end;
	case 3:
		mes "-reported to Louise and gave her the envelope of the letter-";
		next;
		mes "[Louise]";
		mes "Thank you!" ;
		mes "So the sender is ^FF0000Noriek^000000 and the person it was sent to is called ^FF0000Tanya^000000!!!" ;
		next;
		emotion 2;
		mes "[Louise]";
		mes "mmmmmm ......";
		mes "Let's guess that name and read the letter again!" ;
		next;
	case 99:
		mes "[Louise]";
		mes strcharinfo(0)+", thanks!" ;
		if('@novice && AC_QUEST_ST_1!=99){
			mes "This is for you." ;
			mes "Please take it." ;
		}
		next;
		if('@novice && AC_QUEST_ST_1!=99){
			// 645 スピードアップポーション 10個
			if(!checkweight(645,10)){
				mes "-Overweight!-";
				close;
			}
			getitem 645,10;
		}
		mes "^FF0000 [Mission accomplished]^000000";
		mes "-Mission accomplished! Let's go report to the Adventurer Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST02:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + ", long time no see!" ;
		mes "You look great." ;
		next;
		emotion 2;
		mes "[Louise]";
		mes "この前は、";
		mes "手紙の調査してもらって";
		mes "ありがとうね！";
		mes "あれから";
		mes "^FF0000ノリーク^000000の^FF0000ターニャ^000000への手紙、";
		mes "何回も読みなおしちゃった。";
		next;
		mes "[Louise]";
		mes "あのね、今回は";
		mes "Payonにいるロイスって人に";
		mes "この荷物を届けて欲しいの。";
		mes "配送係の子が怪我しちゃって";
		mes "運べなくなっちゃって。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう。";
		mes "お願いね！";
		mes " ";
		mes "‐" + strcharinfo(0) + "は";
		mes "荷物を預かった‐";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Payonに行き";
		mes "ロイスに会って荷物を渡す‐";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "Payonにいる";
		mes "ロイスって人に";
		mes "この荷物を届けて欲しいの。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Payonに行き";
		mes "ロイスに会って荷物を渡す‐";
		close;
	case 3:
		mes "‐Louiseに報告した‐";
		next;
	case 99:
		mes "[Louise]";
		mes "ありがとう！";
		mes "助かったわ！";
		mes "また何かあった時は、";
		mes strcharinfo(0) + "に";
		mes "頼むわね。";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST03:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "久しぶり！";
		mes "元気そうね。";
		next;
		mes "[Louise]";
		mes "さっそく、お願いしたいことがあるの。";
		mes " ";
		mes "Amatsuにいるアーチボルド";
		mes "って人から急な注文が入ってさ、";
		mes "至急この荷物を届けて欲しいの。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう。";
		mes "お願いね！";
		mes " ";
		mes "‐" + strcharinfo(0) + "は";
		mes "荷物を預かった‐";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Amatsuに行き";
		mes "アーチボルドに会って荷物を渡す‐";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "Amatsuにいるアーチボルド";
		mes "って人から急な注文が入ってさ、";
		mes "至急この荷物を届けて欲しいの。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Amatsuに行き";
		mes "アーチボルドに会って荷物を渡す‐";
		close;
	case 3:
		mes "‐Louiseに報告した‐";
		next;
		mes "[Louise]";
		mes "ありがとう！";
		mes "助かったわ！";
		mes "また何かあった時は、";
		mes strcharinfo(0) + "に";
		mes "頼むわね。";
		next;
		mes "[Louise]";
		mes "手紙の時といい、";
		mes "君には感謝しているわ。";
		next;
		menu "手紙……そうだ、ノリークのこと！",-;
		mes "‐アーチボルドがノリークのことを";
		mes "話していたことをLouiseに話した‐";
		next;
		mes "‐Louiseは数秒間、";
		mes "時が止まったように動きが止まった。";
		mes "そして、叫んだ‐";
		next;
		emotion 0;
		mes "[Louise]";
		mes "えええぇぇぇっっ!!";
		mes "本当にっ！";
		mes "本当にっ！？";
		next;
		mes "[Louise]";
		mes "ノリーク……";
		mes "ノリークさんは本当にいたんだね。";
		next;
		mes "‐Louiseはあの手紙のことを";
		mes "話しだした‐";
		next;
		mes "[Louise]";
		mes "あの手紙ね、";
		mes "ノリークがターニャって人に";
		mes "プロポーズする手紙なの。";
		mes " ";
		mes "ノリークは傭兵でね、";
		mes "ターニャは名家のお嬢様なの。";
		next;
		mes "[Louise]";
		mes "自分は、傭兵で、君とは不釣合い";
		mes "かもしれないが、";
		mes "君を一生幸せにする、";
		mes "という感じで書いてあって。";
		mes "ターニャへの思いとか優しさとかが";
		mes "つまっていて……";
		next;
		emotion 40;
		mes "[Louise]";
		mes "あの手紙を読んで、";
		mes "わたし、すごく胸が熱くなっちゃって。";
		mes "こんなことを言われてみたいな、";
		mes "って思っちゃったりしてさ……";
		next;
		mes "[Louise]";
		mes "ま、まぁ、それはおいといてっ！";
		mes " ";
		mes "この2人が幸せになっているのか、";
		mes "何故この手紙が埋まっていたのか、";
		mes "とかどうしても知りたいの。";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "本当にありがとうね！";
		mes "荷物を運んでもらった上に";
		mes "すごくいい話が聞けたよ！";
		if('@novice && AC_QUEST_ST_1!=99){
			mes "これは気持ちよ。";
		}
		next;
		if('@novice && AC_QUEST_ST_1!=99){
			if(!checkweight(2101,1)){
				mes "‐重量オーバー！‐";
				close;
			}
			getitem 2101,1;
		}
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes "アーチボルドさんが傭兵団で";
		mes "一緒だったって言っているのね……";
		close2;
		//close なのに次ページが表示される。本鯖どおり。
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close;
	}
L_QUEST04:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "久しぶり！";
		mes "元気そうね。";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "に";
		mes "お願いがあるんだよ。";
		mes "ノリークのことなんだけど……";
		next;
		mes "[Louise]";
		mes "前回、アーチボルドさんが";
		mes "ノリークと同じ傭兵団にいた";
		mes "っていう話があったじゃない。";
		next;
		mes "[Louise]";
		mes "実はね、あの後、";
		mes "どうしても、どう～～っしても、";
		mes "ノリークのことが頭から離れなくて";
		mes "アーチボルドさんのところに";
		mes "行ったのよ。";
		next;
		mes "[Louise]";
		mes "そうしたらね、";
		mes "アーチボルドさんは";
		mes "戦闘で怪我をして、早い時期に";
		mes "傭兵団を辞めてしまったんだって。";
		mes "その後、ノリークと会えなくなって";
		mes "音信不通なんだって。";
		next;
		mes "[Louise]";
		mes "でもね、その傭兵団って";
		mes "今はもうないらしいんだけど、";
		mes "Gonryunを拠点にしていたから";
		mes "Gonryunに行けば";
		mes "何かわかるかもしれない、";
		mes "って言われたの。";
		next;
		mes "[Louise]";
		mes "そこで、お願いなんだ！";
		mes "Gonryunに行って、";
		mes "傭兵団の情報、ノリークの情報を";
		mes "集めて欲しいの。";
		next;
		mes "[Louise]";
		mes "本当は、";
		mes "わたしが行きたいところだけど……";
		mes "実はね、";
		mes "私がアーチボルドさんのところに";
		mes "行ったって言ったじゃない？";
		next;
		emotion 4;
		mes "[Louise]";
		mes "でもね、";
		mes "その日、大事な商談があったの。";
		mes "それをすっぽかして";
		mes "行ったものだから、お客さんに";
		mes "かなり信用なくしてしまって……";
		next;
		menu "どうしてそこまで……",-;
		mes "[Louise]";
		mes "ノリークとターニャのことが";
		mes "もう頭から離れないのよ……";
		mes "ノリークの手紙に私の心は";
		mes "奪われてしまったというか……";
		next;
		mes "[Louise]";
		mes "でもこれ以上、";
		mes "お客さんに信用なくすと";
		mes "このLouise商店が";
		mes "傾いてしまう……";
		next;
		mes "[Louise]";
		mes "だから、";
		mes strcharinfo(0) + "、";
		mes "お願い！Gonryunに行って、";
		mes "傭兵団の情報、ノリークの情報を";
		mes "集めて。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう！";
		mes "傭兵団があった箇所はここよ。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Gonryunに行き";
		mes "傭兵団の本拠地があった場所に行き、";
		mes "情報を探す‐";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "ありがとう！";
		mes "傭兵団があった箇所は";
		mes "ここらへんらしいわ。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Gonryunに行き";
		mes "傭兵団の本拠地があった場所に行き、";
		mes "情報を探す‐";
		close;
	case 3:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "どうだった？";
		next;
		mes "‐Louiseに報告した‐";
		next;
		mes "[Louise]";
		mes "ゲイソンさんって人から";
		mes "連絡がくるのね。";
		mes "わかったわ。";
		next;
		emotion 2;
		mes "[Louise]";
		mes "ノリークに近づいている";
		mes "感じがするわねっ！";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "いつもありがとね。";
		mes "本当は私自ら、行きたいんだけど……";
		mes "仕事のせいで中々行けなくてさ。";
		next;
	case 99:
		mes "[Louise]";
		mes strcharinfo(0) + "に、";
		mes "またお願いすることが";
		mes "あると思うけど、";
		mes "その時はよろしくね。";
		mes "頼りにしているわよ。";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST05:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "久しぶり！";
		next;
		mes "[Louise]";
		mes "あのね、";
		mes "Gonryunのゲイソンさんから";
		mes "連絡が来たんだっ！";
		next;
		mes "[Louise]";
		mes "傭兵団にいたって人は、";
		mes "ドナテロって人らしいんだけど、";
		mes "今、Louyangにいるんだって。";
		next;
		mes "[Louise]";
		mes "だからね、";
		mes strcharinfo(0) + "、";
		mes "お願い！";
		mes "Louyangに行って、ドナテロさんに";
		mes "ノリークのこと聞いて欲しいんだ。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう！";
		next;
		mes "[Louise]";
		mes "ウフフ、これで";
		mes "ノリークの居場所がわかるかもね。";
		mes " ";
		mes "ノリークとターニャは今";
		mes "幸せにやってるのかしら。";
		next;
		mes "[Louise]";
		mes "私の予想！";
		mes "ノリークはターニャに";
		mes "尻にしかれている。";
		next;
	case 2:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "お願いね！";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louyangにいるドナテロに会い、";
		mes "ノリークについて聞く‐";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 3:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "どうだった？";
		mes "ノリークのことわかった？";
		mes "教えて教えて。";
		next;
		menu "……",-;
		mes "‐Louiseにノリークは";
		mes "50年前、戦死していたことを報告した‐";
		next;
		emotion 9;
		mes "[Louise]";
		mes "………………";
		next;
		mes "[Louise]";
		mes "‐Louiseは";
		mes "時が止まったように、";
		mes "動きが止まった。";
		mes "そして静かに、ゆっくりと話した‐";
		next;
		mes "[Louise]";
		mes "嘘……";
		mes "でしょ？";
		next;
		mes "[Louise]";
		mes "だって……";
		mes "ターニャと……";
		mes "幸せに暮らしているんじゃないの？";
		next;
		menu "ターニャと結婚していなかった",-;
		emotion 9;
		mes "[Louise]";
		mes "…………";
		next;
		mes "‐Louiseは混乱している……‐";
		next;
		mes "[Louise]";
		mes "じゃあ、あの……";
		mes "手紙……は？";
		next;
		mes "‐おそらく、あの手紙はノリークが";
		mes "ターニャに書いたものには";
		mes "間違いないだろう。しかし、ノリークは";
		mes "手紙をターニャに渡すことなく、";
		mes "戦いの場で散っていった……";
		mes strcharinfo(0) + "は";
		mes "そう思った‐";
		next;
		mes "[Louise]";
		mes "こんなのって……";
		next;
		mes "[Louise]";
		mes "でも、ターニャ……";
		mes "ターニャは";
		mes "生きているんだよね……";
		next;
		mes "[Louise]";
		mes "ターニャに会って……";
		mes "話を聞きたい……";
		if('@novice){
			mes strcharinfo(0) + "、";
			mes "これ、調べてもらったお礼……";
		}
		next;
		if('@novice){
			if(!checkweight(2503,1)){
				mes "‐重量オーバー！‐";
				close;
			}
			getitem 2503,1;
		}
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes "でも、ターニャ……";
		mes "ターニャは";
		mes "生きているんだよね……";
		mes "ターニャに会って……";
		mes "話を聞きたい……";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close;
	}
L_QUEST06:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "聞いて聞いて！";
		next;
		mes "[Louise]";
		mes "ターニャの居場所が分かったのよ！";
		next;
		mes "[Louise]";
		mes "実はね、あれから";
		mes "ターニャのことが気になって、";
		mes "ずっと調べていたの。";
		next;
		mes "[Louise]";
		mes "手紙だと名家ってあるから、";
		mes "もしかしたら知っている人がいるかも、";
		mes "って思ってさ。";
		next;
		mes "[Louise]";
		mes "そしたらね、";
		mes "私の取引のある人で";
		mes "知っている人がいたのよっ！";
		mes "ターニャは、^FF0000ターニャ・グリンカ^000000";
		mes "っていう名前らしいの。";
		next;
		mes "[Louise]";
		mes "^FF0000グリンカ家^000000って、あまり、";
		mes "表舞台には出ないんだけど、";
		mes "裏の世界では";
		mes "かなり知られているんだって。";
		next;
		menu "裏の世界……",-;
		mes "[Louise]";
		mes "それで、その人に";
		mes "どうしてもターニャに";
		mes "会いたいって頼み込んだらね、";
		mes "その人、グリンカ家の人に";
		mes "伝えてくれてたの。";
		next;
		mes "[Louise]";
		mes "そして、";
		mes "グリンカ家の人から";
		mes "連絡がきたのっ！";
		next;
		mes "[Louise]";
		mes "Ayothayaで、";
		mes "まず秘書に会って欲しいんだって。";
		mes "ターニャに会うためには、";
		mes "色々とチェックが";
		mes "必要らしいのよ。";
		next;
		mes "[Louise]";
		mes "だから、";
		mes "私今すぐ、Ayothayaに行くわ！";
		mes "って言いたいところなんだけど……";
		next;
		menu "仕事でしょ",-;
		mes "[Louise]";
		mes "そうなのよ……";
		mes "時間がなくて、とてもじゃないけど、";
		mes "Ayothayaなんて行けないのよ。";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "私の代理で、Ayothayaに行って";
		mes "その秘書の人に会って欲しいの。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "ありがとう！";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Ayothayaに行き、";
		mes "グリンカ家の秘書に会う‐";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "私の代理で、Ayothayaに行って";
		mes "その秘書の人に会って欲しいの。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Ayothayaに行き、";
		mes "グリンカ家の秘書に会う‐";
		close;
	case 3:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "どうだった？";
		next;
		mes "‐Louiseに報告した‐";
		next;
		mes "[Louise]";
		mes "わかったわ。";
		mes "また日をあらためて";
		mes "私に連絡がくるのね。";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "私の代わりに";
		mes "Ayothayaまで行ってもらって";
		mes "ありがとね！";
		next;
		menu "少し、怖かった……",-;
		mes "[Louise]";
		mes "怖かったって？";
		mes "君、そんなこと";
		mes "言ってちゃだめだよっ。";
		mes "商売も冒険も度胸が";
		mes "大事なんだから。";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "私の代わりに";
		mes "Ayothayaまで行ってもらって";
		mes "ありがとね！";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close;
	}
L_QUEST07:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "久しぶり！";
		next;
		mes "[Louise]";
		mes "今回は、Umbalaにいる";
		mes "デニスって人に";
		mes "この荷物を届けて欲しいの。";
		mes "配送係の子がまた怪我をして";
		mes "運べなくなっちゃって。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう。";
		mes "お願いね！";
		mes " ";
		mes "‐" + strcharinfo(0) + "は";
		mes "荷物を預かった‐";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Umbalaに行き、";
		mes "デニスに会って荷物を渡す‐";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "Umbalaにいる";
		mes "デニスって人に";
		mes "この荷物を届けて欲しいの。";
		mes "配送係の子がまた怪我をして";
		mes "運べなくなっちゃって。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Umbalaに行き、";
		mes "デニスに会って荷物を渡す‐";
		close;
	case 3:
		mes "‐Louiseに報告した‐";
		next;
		mes "[Louise]";
		mes "ありがとう！";
		mes "助かったわ！";
		mes strcharinfo(0) + "は";
		mes "やっぱり頼りになるわね！";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "話は変わるけど、";
		mes "まだターニャから";
		mes "連絡がこないのよ。";
		next;
		emotion 40;
		mes "[Louise]";
		mes "今日は連絡が来てないかな、";
		mes "って風に毎日、ドキドキしながら";
		mes "過ごしているの。";
		if('@novice) {
			mes " ";
			mes "これ、今回のお礼だよ。";
		}
		next;
		if('@novice) {
			if(!checkweight(610,6)){
				mes "‐重量オーバー！‐";
				close;
			}
		}
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes "ありがとう！";
		mes "助かったわ！";
		mes strcharinfo(0) + "は";
		mes "やっぱり頼りになるわね！";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "話は変わるけど、";
		mes "まだターニャから";
		mes "連絡がこないのよね。";
		mes "連絡がくるのが待ち遠しいわ。";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "！";
		mes "待っていたのよ！";
		next;
		emotion 40;
		mes "[Louise]";
		mes "きたのよ、きたのよ！";
		mes "ターニャから手紙がきたのよっ。";
		mes " ";
		mes "ターニャは、";
		mes "今Comodoの別荘にいるらしいわ。";
		next;
		mes "[Louise]";
		mes "是非、遊びに来て欲しいって";
		mes "書いてあるの。";
		mes " ";
		mes "ああ、今すぐにでも行きたい……";
		mes "行って、ターニャの事を";
		mes "色々聞きたいわ。";
		next;
		mes "[Louise]";
		mes "でも、私ね、";
		mes "仕事で今、Comodoに行くなんて、";
		mes "絶対に無理なのよ……";
		mes " ";
		mes "はぁぁ、つらい……";
		next;
		mes "[Louise]";
		mes "……";
		mes "だから";
		mes strcharinfo(0) + "、";
		mes "お願い、私の代わりに";
		mes "Comodoに行ってくれないかな？";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう！";
		mes "じゃあ、";
		mes strcharinfo(0) + "に";
		mes "これを渡すね。";
		next;
		mes "‐Louiseから";
		mes "ノリークの手紙を入れた箱";
		mes "を受けとった‐";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "ターニャに色々と聞いて欲しいけど、";
		mes "気をつかって聞いて欲しいの。";
		mes "ノリークはもういないわけだし、";
		mes "きっと、ターニャには、";
		mes "他の旦那さんがいると思うの。";
		next;
		mes "[Louise]";
		mes "だからさ、ターニャとしてはさ、";
		mes "あまり過去に触れてほしくないの";
		mes "かもしれないし……";
		next;
		mes "[Louise]";
		mes "だから、そんな雰囲気だったら、";
		mes "その箱を渡さないで、";
		mes "持って帰ってきてね。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "お願いね。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Comodoに行き、";
		mes "ターニャに会う‐";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		//未調査 忘れてた・・・
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "ターニャに色々と聞いて欲しいけど、";
		mes "気をつかって聞いて欲しいの。";
		mes "ノリークはもういないわけだし、";
		mes "きっと、ターニャには、";
		mes "他の旦那さんがいると思うの。";
		next;
		mes "[Louise]";
		mes "だからさ、ターニャとしてはさ、";
		mes "あまり過去に触れてほしくないの";
		mes "かもしれないし……";
		next;
		mes "[Louise]";
		mes "だから、そんな雰囲気だったら、";
		mes "その箱を渡さないで、";
		mes "持って帰ってきてね。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Comodoに行き、";
		mes "ターニャに会う‐";
		close;
	case 3:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "どうだった？";
		next;
		mes "‐Louiseに";
		mes "ノリークが生きていたこと、";
		mes "ノリークとターニャが";
		mes "結婚して幸せになっていること";
		mes "などを報告した‐";
		next;
		mes "‐Louiseは";
		mes "目にいっぱいの涙を";
		mes "ためながら聞いている‐";
		next;
		mes "[Louise]";
		mes "ノリーク無事だったんだね……";
		mes "しかも、ターニャと結婚して";
		mes "幸せになっていたんだね……";
		next;
		mes "[Louise]";
		mes "よかった……";
		mes "本当によかったよぉ。";
		next;
		mes "[Louise]";
		mes "しかも、私が渡した箱から";
		mes "アクセサリが出てきて……";
		mes "2人が喜んでくれて";
		mes "よかった……";
		mes "私のやったこと、";
		mes "意味があったんだね……";
		next;
	case 99:
		mes "[Louise]";
		mes "……　グスン";
		mes "私、仕事が落ち着いたら、";
		mes "絶対にノリークとターニャに";
		mes "会いに行くね……";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST09:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "待ってたわよ。";
		next;
		mes "[Louise]";
		mes "本当に手紙の件では";
		mes "ありがとね。";
		mes "そこで、今回の";
		mes "お願いなんだけど……";
		next;
		mes "[Louise]";
		mes "実はさ、";
		mes "ノリークとターニャの手紙にね、";
		mes "ものすごく感動しちゃって。";
		mes "何十年前の思いが、";
		mes "今届くみたいなのがさぁ～。";
		next;
		mes "[Louise]";
		mes "それでね、";
		mes "私も手紙を書いて";
		mes "どこかに埋めたいのよ。";
		mes "何十年後に届くようにねっ！";
		next;
		mes "[Louise]";
		mes "……";
		mes "でもね、思いを書く相手がいないの…";
		mes "仕事一筋の私に好きな人なんて……";
		next;
		mes "[Louise]";
		mes "そこで、君だよっ！";
		mes "君にも手紙を書いて欲しいんだよ。";
		mes "おっと、";
		mes "別に君の事を好きだって";
		mes "言ってるわけじゃないよ。";
		next;
		mes "[Louise]";
		mes "ノリークとターニャの奇跡について";
		mes "共に体験して、感動をわかちあった";
		mes "という意味で、";
		mes "君に書いて欲しいんだよ。";
		next;
		mes "[Louise]";
		mes "私は、君あてに手紙を書く、";
		mes "君は、私あてに手紙を書く、";
		mes "なんでもいいからさ、";
		mes "書いてみようよ。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう！";
		mes "じゃあさ、";
		mes "Albertaの中でさ、";
		mes "埋める場所も調べて欲しいんだ。";
		next;
		menu "わかった",-;
		mes "[Louise]";
		mes "ありがとう！";
		mes "じゃあ、お願いね。";
		mes "大体あのあたりが埋めるのに";
		mes "いいかな。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Albertaの中で";
		mes "箱を埋めるのに";
		mes "適当な場所を探す‐";
		close2;
		set AC_QUEST_ST_1,2;
		viewpoint 1,107,59,11,0x0000FF;
		//なぜか青
		end;
	case 2:
		mes "[Louise]";
		mes "Albertaの中でさ、";
		mes "手紙を埋める場所も";
		mes "調べて欲しいんだ。";
		mes "大体あのあたりが埋めるのに";
		mes "いいかな。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Albertaの中で";
		mes "箱を埋めるのに";
		mes "適当な場所を探す‐";
		close2;
		viewpoint 1,107,59,11,0x0000FF;
		//なぜか青
		end;
	case 3:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "どうだった？";
		next;
		mes "‐見つけた場所を教えた‐";
		next;
		mes "[Louise]";
		mes "じゃあ、そこに埋めましょう。";
		mes "私のほうは、";
		mes "君への手紙を書いたわよ。";
		mes "君も今、書いてね。";
		next;
		mes "‐適当にいろいろと書いた。";
		mes "最後に、Louiseについて、";
		mes "思っている事を";
		mes "そのまま正直に書いた‐";
		next;
		mes "‐よし、これで完成。";
		mes "手紙をLouiseに渡した‐";
		next;
		mes "[Louise]";
		mes "お、書いてくれたのね！";
		mes "ありがとう。";
		mes "後で、私が手紙を箱に入れて";
		mes "埋めておくわね。";
		next;
		mes "[Louise]";
		mes "50年はさすがに長いから、";
		mes "う～ん、そうねぇ。";
		mes "10年後！";
		mes "10年後に掘り起こしましょう。";
		next;
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "10年後に掘り起こしましょう。";
		mes "約束だよ。";
		if('@novice){
			mes "これ、私からの気持ち。";
			mes "いつもありがとうね。";
		}
		next;
		if('@novice){
			switch(Job){
			case Job_Swordman:
				set '@item,2105;
				set '@ammount,1;
				break;
			// シールド[0] 1個
				case Job_Archer:
			case Job_Magician:
			case Job_TaeKwon:
				set '@item,568;
				set '@ammount,50;
				break;
			// レモン 50個
			case Job_Acolyte:
			case Job_Thief:
			case Job_Merchant:
				set '@item,2103;
				set '@ammount,1;
				break;
			// バックラー[0] 1個
			case Job_Gunslinger:
				set '@item,12151;
				set '@ammount,10;
				break;
			// シルバーバレットケース 10個
			case Job_Ninja:
				set '@item,2119;
				set '@ammount,1;
				break;
			// 手甲改[0] 1個
			case Job_SuperNovice:
			default:
				set '@item,2113;
				set '@ammount,1;
				break;
				// ノービスシールド[1] 1個
			}
			if(!checkweight('@item,'@ammount)){
				mes "‐重量オーバー‐";
				close;
			}
			getitem '@item,'@ammount;
		}
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "10年後に掘り起こしましょう。";
		mes "約束だよ。";
		next;
		mes "^FF0000【依頼達成】^000000";
		mes "‐依頼を達成した！";
		mes "冒険者アカデミーに";
		mes "報告しに行こう‐";
		close;
	}
L_CLEAR:
	mes "[Louise]";
	mes "よ～し！";
	mes "頑張って仕事して";
	mes "早く、ノリークとターニャに";
	mes "会いに行くぞ！";
	close;
L_OTHER:
	switch(AC_QUEST_LV_1){
	case 0:
		mes "[Louise]";
		mes "こんにちは！";
		mes "わたしはLouise。";
		mes "最近、Albertaに";
		mes "引っ越してきたんだ。";
		mes "よろしくね！";
		close;
	case 1:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "手紙の調査してもらって";
		mes "ありがとね！";
		close;
	case 2:
		mes "[Louise]";
		mes "手紙の時といい、";
		mes "君には感謝しているわ。";
		close;
	case 3:
		mes "[Louise]";
		mes "アーチボルドさんが傭兵団で";
		mes "一緒だったって言っているのね……";
		close;
	case 4:
		mes "[Louise]";
		mes "ゲイソンさんって人から";
		mes "連絡がくるのね。";
		mes "わかったわ。";
		close;
	case 5:
		mes "[Louise]";
		mes "ターニャに会って……";
		mes "話を聞きたい……";
		close;
	//未調査
	case 6:
		mes "[Louise]";
		mes "まだターニャから";
		mes "連絡がこないのよね。";
		mes "連絡がくるのが待ち遠しいわ。";
		close;
	//未調査
	case 7:
		mes "[Louise]";
		mes strcharinfo(0) + "、";
		mes "手紙の調査してもらって";
		mes "ありがとね！";
		close;
	case 8:
	case 9:
		mes "[Louise]";
		mes "よ～し！";
		mes "頑張って仕事して";
		mes "早く、ノリークとターニャに";
		mes "会いに行くぞ！";
		close;
	}
}
alberta.gat,234,98,3	script	職人	847,{
	if(AC_QUEST_LV_1!=0) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		goto L_MISSION;
	case 3:
		goto L_CLEAR;
	case 99:
		goto L_REPORT;
	default:
		goto L_OTHER;
	}
L_MISSION:
	mes "[職人]";
	mes "……";
	next;
	menu "すいません",-;
	mes "[職人]";
	mes "……";
	mes " ";
	mes "うむ、";
	mes " ";
	mes "なんじゃ……";
	next;
	menu "あなたが紙やペンに詳しい方ですか？",-;
	mes "[職人]";
	mes "……";
	mes " ";
	mes "そ、";
	next;
	mes "[職人]";
	mes "そうじゃ……";
	mes " ";
	mes "この道……";
	mes " ";
	mes " ";
	mes "80年……じゃ……";
	next;
	mes "‐手紙の封筒を渡し、";
	mes "事情を説明した‐";
	next;
	mes "‐職人は、封筒を手に取り、";
	mes "そのまましばらく動かない‐";
	next;
	menu "あのう……",-;
	mes "[職人]";
	mes "…………………………";
	next;
	menu "あのう、すいません……",-;
	mes "[職人]";
	mes "……も、";
	mes "もう";
	mes "治し……おわっとる。";
	mes "早く";
	mes "……受け取らんか";
	next;
	mes "‐！";
	mes "職人から手紙を受け取る。";
	mes "手紙の封筒には、";
	mes "送り主が^FF0000ノリーク^000000";
	mes "送り相手に^FF0000ターニャ^000000";
	mes "と書いてある！";
	mes "いつのまに……‐";
	next;
	mes "[職人]";
	mes "…………………………";
	next;
	set AC_QUEST_ST_1,3;
	/////////
	mes "^FF0000【ミッション】^000000";
	mes "‐Louiseに報告する‐";
	close;
L_CLEAR:
	mes "[職人]";
	mes "…………………………";
	next;
	mes "‐正に道を極めた人だった‐";
	next;
	mes "^FF0000【ミッション】^000000";
	mes "‐Louiseに報告する‐";
	close;
L_REPORT:
	mes "[職人]";
	mes "…………………………";
	close;
L_OTHER:
	mes "[職人]";
	mes "…………………………";
	next;
	mes "‐老人が遠くを見つめている。";
	mes "そっとしておこう‐";
	close;
}
payon.gat,216,120,4		script	ロイス	928,{
	if(AC_QUEST_LV_1!=1) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "[ロイス]";
		mes "俺に用かい？";
		next;
		mes "‐Louiseから預かった荷物を渡した‐";
		next;
	case 3:
		emotion 0;
		mes "[ロイス]";
		mes "おお、やっと届いたか！";
		mes "ありがとよ！";
		mes "Louiseによろしく";
		mes "言っておいてくれ！";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	}
L_OTHER:
	mes "[ロイス]";
	mes "よう！";
	mes "俺はロイスって言うんだ。";
	mes "今日もいい天気で最高だぜ！";
	close;
}
amatsu.gat,212,141,4	script	アーチボルド	120,{
	if(AC_QUEST_LV_1==2 && AC_QUEST_ST_1==3) goto L_REP;
	if(AC_QUEST_LV_1>=8) goto L_CLEAR;
	mes "[アーチボルド]";
	mes "わしの名はアーチボルドじゃ。";
	mes "わしは最近の若者の礼儀のなさ";
	mes "に怒っとる！";
	mes "最近の若い者は年寄りの話を";
	mes "全く聞かん！";
	if(AC_QUEST_LV_1!=2 || AC_QUEST_ST_1!=2) close;
	next;
	menu "荷物を渡す",-;
	mes "‐アーチボルドに、Louiseより";
	mes "預かった荷物を渡した‐";
	next;
	mes "[アーチボルド]";
	mes "おお、早速届いたか！";
	mes "凄まじい速さじゃな！";
	mes "Louise商店……";
	mes "これからも馴染みにしたいのう。";
	next;
	menu "それでは、また",-;
	mes "[アーチボルド]";
	mes "まぁ、待て。";
	mes "せっかくじゃ。";
	mes "ゆっくりしていくがよい。";
	mes "わしの話を聞いてくれんかのう。";
	mes "わしの若い頃の話じゃ。";
	mes "わしが若い頃……";
	next;
	emotion 54,"";
	mes "^FF0000‐30分経過‐^000000";
	next;
	mes "[アーチボルド]";
	mes "わしは、50年以上前、";
	mes "傭兵団にいたんじゃよ！";
	mes "そのころ、わしはヒールが得意でのう。";
	mes "…………………………………………";
	mes "皆、わしを尊敬しておった……";
	next;
	emotion 54,"";
	mes "^FF0000‐1時間経過‐^000000";
	mes " ";
	mes "‐話が長くてつらい……‐";
	next;
	mes "[アーチボルド]";
	mes "そこでなぁ、わしは";
	mes "言ってやったんじゃ！";
	mes "そうしたら、奴は何と言ったと思う？";
	mes "…………………………………………";
	mes "ワハハハハハ!! …………";
	next;
	emotion 54,"";
	mes "^FF0000‐2時間経過‐^000000";
	mes " ";
	mes "‐話が長くて本当につらい……‐";
	next;
	mes "[アーチボルド]";
	mes "それでのう、";
	mes "わしもそれなりに女子にもててのう。";
	mes "しかし、硬派なわしとしては……";
	mes "…………………………………………";
	next;
	mes "^FF0000‐3時間経過‐^000000";
	mes " ";
	mes "‐その時！……‐";
	next;
	mes "[アーチボルド]";
	mes "傭兵団には^FF0000ノリーク^000000という";
	mes "わしの無二の親友がおってのう。";
	mes "懐かしいわい。";
	mes "^FF0000ノリーク^000000とまた、";
	mes "酒を酌みかわしたいわい。";
	next;
	mes "‐^FF0000ノリーク^000000？";
	mes "どこかで聞いたような‐";
	next;
	mes "^FF0000‐5時間経過‐^000000";
	next;
L_REP:
	mes "[アーチボルド]";
	mes "そろそろおひらきにするかのう。";
	mes "おまえさんは";
	mes "すばらしい若者じゃ。";
	mes "最近の若者にも";
	mes "おまえさんみたいなやつが";
	mes "いるんじゃのう。";
	next;
	menu "……",-;
	mes "^FF0000【ミッション】^000000";
	mes "‐Louiseに報告する‐";
	close2;
	set AC_QUEST_ST_1,3;
	end;
L_CLEAR:
	mes "‐ノリークがComodoで元気にしていた";
	mes "ことを伝えた‐";
	next;
	mes "[アーチボルド]";
	mes "おお、本当か！";
	mes "ノリークのやつ、";
	mes "Comodoで元気でやっていたか！";
	mes "ならば、今度、酒を持って";
	mes "Comodoにいくかのう。";
	mes "楽しみじゃのう！";
	close;
}
gonryun.gat,140,65,4	script	ゲイソン	777,{
	if(AC_QUEST_LV_1==3 && AC_QUEST_ST_1==3) goto L_REP;
	mes "[ゲイソン]";
	mes "昔、ここらへんになあ。";
	mes "屈強な傭兵団がいたんじゃよ。";
	mes "彼らは、モンスターから";
	mes "町を守ってくれたんじゃ。";
	if(AC_QUEST_LV_1!=3 || AC_QUEST_ST_1!=2) close;
	next;
	menu "詳しく教えてくれませんか",-;
	mes "[ゲイソン]";
	mes "傭兵団に興味があるのか。";
	mes "何が知りたいんじゃ？";
	next;
	menu "ノリークという人はいませんでしたか？",-;
	mes "[ゲイソン]";
	mes "ノリーク……";
	mes "すまぬが、初めて聞く名前じゃ。";
	mes "わしは、その傭兵団の傭兵たちを";
	mes "実際に知っているが、";
	mes "ノリークという男は知らぬよ。";
	next;
	mes "[ゲイソン]";
	mes "さすがに、わしも全員を";
	mes "知っているわけではないからのう。";
	next;
	menu "そうですか……",-;
	mes "[ゲイソン]";
	mes "そんな悲痛な顔をせんでくれ。";
	mes "…………";
	mes "その顔からすると、";
	mes "なにか事情があるようじゃな。";
	next;
	mes "[ゲイソン]";
	mes "わかった。";
	mes "わしに少し時間をくれぬか？";
	mes " ";
	mes "実は、わしの知り合いに、実際に";
	mes "その傭兵団にいた男がおるんじゃ。";
	mes "そやつに聞けばいいじゃろう。";
	next;
	mes "[ゲイソン]";
	mes "ただ、そやつは";
	mes "わしと同じような年なのに、";
	mes "この大陸をブラブラと旅しておってな。";
	mes "行方を掴むのに、少々時間がかかる。";
	next;
	menu "ありがとうございます！",-;
	mes "[ゲイソン]";
	mes "居所がわかったら";
	mes "わしの方から連絡するわい。";
	mes "どこに連絡すればいいか";
	mes "教えてくれないかのう。";
	next;
	mes "‐Louiseの住所を教えた‐";
	next;
L_REP:
	mes "[ゲイソン]";
	mes "分かり次第、連絡するよ。";
	next;
	mes "^FF0000【ミッション】^000000";
	mes "‐Louiseに報告する‐";
	close2;
	set AC_QUEST_ST_1,3;
	end;
}
louyang.gat,229,109,4	script	老人	866,{
	if(AC_QUEST_LV_1!=4 || AC_QUEST_ST_1!=2) goto L_OTHER;
	emotion 52;
	mes "[老人]";
	mes "ほう、これは絶景じゃわい。";
	mes " ";
	mes "‐老人が隣にいる女性を";
	mes "眺めている‐";
	next;
	mes "[老人]";
	mes "この世界には、";
	mes "まだまだこんな美人がいるから";
	mes "旅はやめられないんじゃ……";
	mes "はぁぁぁぁ、見とれる……";
	mes "ブツブツ……";
	next;
	menu "ドナテロさんですか？",-;
	mes "[ドナテロ]";
	mes "うぉっ、なんじゃ！";
	mes "……";
	mes "急に話をかけんでおくれよ。";
	mes "びっくりしたわい。";
	next;
	menu "何をしていたんですか？",-;
	mes "[ドナテロ]";
	mes "うむ、横にいる女性を";
	mes "ずっと見ていたんじゃよ。";
	mes "ものすごく美人でのう。";
	mes "見ずにおれんかった。";
	mes "世界でも、中々こんな美人はおらん。";
	next;
	emotion 0,"女性#AC_QUE01";
	mes "[女性]";
	mes "！";
	next;
	mes "[ドナテロ]";
	mes "世界でも、中々こんな美人はおらん。";
	mes "わしはこんな美人に巡り合うために";
	mes "大陸中を旅しているんじゃ。";
	mes "ところで、わしに何か用かのう？";
	next;
	emotion 9;
	mes "‐ドナテロに、";
	mes "傭兵団について聞いた。";
	mes "そして、その傭兵団にノリークが";
	mes "いたか聞いた。";
	mes " ";
	mes "ドナテロの顔が少し険しくなった‐";
	next;
	mes "[ドナテロ]";
	mes "傭兵団の話か、";
	mes "随分昔の話じゃな。";
	mes "いまさら語りたい話でもないが…";
	mes "……";
	mes "ノリークについて知りたいのか？";
	next;
	menu "はい。",-;
	mes "[ドナテロ]";
	mes "そうか……";
	mes "よかろう。";
	mes "ノリークのことは覚えておるぞ。";
	mes "正義感が強く、優しい男じゃった。";
	next;
	menu "今、どこにいるか知っていますか？",-;
	mes "[ドナテロ]";
	mes "…………";
	next;
	emotion 0,"";
	mes "[ドナテロ]";
	mes "ノリークは50年前、";
	mes "モンスターとの戦いで";
	mes "戦死してしまったよ……";
	mes "残念じゃが。";
	next;
	menu "え？",-;
	mes "[ドナテロ]";
	mes "その戦いには、";
	mes "わしも参加したんじゃ。";
	mes "…………";
	mes "ノリークがモンスターにやられる姿を、";
	mes "わしはこの目で見た……";
	mes "一瞬じゃった。";
	next;
	menu "……恋人のターニャを知っていますか？",-;
	mes "[ドナテロ]";
	mes "ターニャ？";
	mes "聞いた事がない。";
	mes "ノリークは、あまりそういう話を";
	mes "しなかったからのう。";
	mes "ただ、ノリークは";
	mes "結婚はしていなかったぞ。";
	next;
	mes "‐何ということだろう……";
	mes "Louiseに報告するのがつらい。";
	mes "ドナテロに、";
	mes "つらい過去の話を";
	mes "させてしまったことを侘びた‐";
	/*「詫びた」ではない。本鯖通り*/ next;
	mes "^FF0000【ミッション】^000000";
	mes "‐Louiseに報告する‐";
	close2;
	set AC_QUEST_ST_1,3;
	end;
L_OTHER:
	if(AC_QUEST_LV_1<4){
		mes "[老人]";
		mes "わしの横にいる女性、";
		mes "綺麗じゃのう。";
		mes "たまらないわい……";
		close;
	}
	mes "[ドナテロ]";
	mes "あの頃は、";
	mes "話すには悲しすぎる話が";
	mes "多いんじゃよ……";
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==3){
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close;
	}
	if(AC_QUEST_LV_1<8) close;
	next;
	mes "‐ドナテロに、ノリークが";
	mes "生きていたことを教えた‐";
	next;
	mes "[ドナテロ]";
	mes "なんとっ！";
	mes "ノリークは生きておったか！";
	mes "本当かっ！？";
	next;
	menu "はい。",-;
	mes "[ドナテロ]";
	mes "そうか……";
	mes "今度は、Comodoに行って";
	mes "やつと50年ぶりの酒を";
	mes "酌み交わすぞ！";
	close;
}
louyang.gat,233,109,4	script	女性#AC_QUE01	66,{
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==3){
		mes "[女性]";
		mes "ここまで、はっきり言う人も";
		mes "珍しいわね……";
		mes "あきれるけど。";
		mes "まぁ、私を世界の美人と";
		mes "言ってくれたのは嬉しいかな。";
		close;
	}
	mes "[女性]";
	mes "さっきから、横にいるおじいちゃんが";
	mes "私の方をジロジロ見ているような……";
	mes " ";
	mes "気のせいよね。";
	close;
}
ayothaya.gat,212,176,4		script	デューイ	109,{
	if(AC_QUEST_LV_1!=5) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "‐一見、紳士のように見えるが、";
		mes "ものすごく凄みがある。";
		mes "かなりの修羅場をくくってきたのを";
		mes "感じる‐";
		next;
		menu "Louiseの代理で来ました。",-;
		mes "‐デューイに、";
		mes "今までの経緯を話した。";
		mes "話している間、";
		mes "時折、デューイの眼光が鋭く光る‐";
		next;
		mes "[デューイ]";
		mes "……";
		mes "……";
		mes "なるほど。";
		next;
		mes "[デューイ]";
		mes "埋もれていた一つの手紙から";
		mes "ターニャ様のところまで";
		mes "たどりついたのですね。";
		next;
		mes "[デューイ]";
		mes "……";
		mes "わかりました。";
		mes "それでは、私の方から";
		mes "ターニャ様にお伝えしましょう。";
		next;
		mes "[デューイ]";
		mes "日をあらためて、";
		mes "こちらからAlbertaの";
		mes "Louise様にご連絡いたします。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		mes "[デューイ]";
		mes "ターニャ様にお伝えしておきます。";
		mes "日をあらためて、";
		mes "こちらからAlbertaの";
		mes "Louise様にご連絡いたします。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close;
	}
L_OTHER:
	mes "[デューイ]";
	mes "こんにちは。";
	mes "私はここで、";
	mes "人と待ち合わせをしております。";
	close;
}
umbala.gat,96,164,4		script	デニス	89,{
	if(AC_QUEST_LV_1!=6) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "[デニス]";
		mes "こんにちは。";
		next;
		mes "‐Louiseから預かった荷物を渡した‐";
		next;
		emotion 0;
		//いらない？
		mes "[デニス]";
		mes "！";
		mes "ありがとうっ!!";
		mes "早速中身を確認させてもらうよ！";
		mes " ";
		mes "‐ガサガサガサガサッッ！‐";
		next;
		emotion 21;
		mes "[デニス]";
		mes "フォォォォォォォォォォォォォッ！";
		mes "これだよ、これ！";
		mes " ";
		mes "やっと手に入ったぁぁ！";
		next;
		mes "[デニス]";
		mes "本当にありがとう！";
		mes "さすが、Louise商会！";
		mes "これからも、Louise商会を";
		mes "利用するからね！";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		emotion 21;
		mes "[デニス]";
		mes "いいねぇ！";
		mes "本当にいい！";
		mes " ";
		mes "特にこの角度から見ると……";
		mes "はぁぁぁぁ、たまらないよ！";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close;
	}
L_OTHER:
	mes "[デニス]";
	mes "こんにちは。";
	close;
}
comodo.gat,113,219,4	script	老婆#ac_comodo	918,{
	if(AC_QUEST_LV_1!=7) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "老夫婦が楽しげに話をしている。";
		next;
		menu "ターニャさんですか？",-;
		mes "[ターニャ]";
		mes "あら……";
		mes "こんにちは。";
		mes "私に何か用かしら。";
		next;
		menu "Louiseの代理で来ました。",-;
		mes "[ターニャ]";
		mes "あなたが、";
		mes strcharinfo(0) + "ね！";
		mes "待っていたわよ。";
		mes "でもLouiseさんは来れないのね。";
		next;
		mes "[ターニャ]";
		mes "確かに、Louise商会は今、";
		mes "すごい勢いで急成長しているものね。";
		mes "残念だけど、仕方ないわ。";
		next;
		emotion 0,"";
		mes "[ノリーク]";
		mes "こんにちは。";
		mes "わしはノリークじゃ。";
		mes "ターニャから話は聞いているよ。";
		mes "手紙を見つけたんだってね？";
		next;
		menu "！！ ノリーク！？",-;
		mes "[ノリーク]";
		mes "な、なんじゃ？";
		mes "わしの顔を見てそんな驚くとは。";
		mes "わしが驚くわい。";
		next;
		mes "‐手紙を見つけてから、";
		mes "二人のことをずっと調べていたことや";
		mes "ノリークが戦死したと";
		mes "思っていたことなど";
		mes "今までの経緯を話した‐";
		next;
		mes "[ノリーク]";
		mes "何故、死んだはずのわしが";
		mes "ここにいるか、";
		mes "何故、あの手紙が埋まっていたか、";
		mes "何故、わしとターニャが一緒に";
		mes "なっているか、";
		mes "色々と知りたいようじゃのう。";
		next;
		mes "[ノリーク]";
		mes "じゃあ、";
		mes "あの手紙を埋めた張本人である";
		mes "わしが一から話そうかのう。";
		next;
		mes "‐ノリークは、咳払いをし、";
		mes "少し間をおいた後、話しだした‐";
		next;
		mes "[ノリーク]";
		mes "当時、わしとターニャは";
		mes "結婚を誓いあう仲だったんじゃ。";
		mes " ";
		mes "わしは、その頃、傭兵団の一員でな、";
		mes "日々、モンスターから街を守るため、";
		mes "戦いにあけくれていたんじゃ。";
		next;
		mes "[ノリーク]";
		mes "一方、ターニャは";
		mes "名家のお嬢様でな、";
		mes "当然、ターニャの親類一同、";
		mes "わしらの結婚に反対していたんじゃよ。";
		next;
		mes "[ノリーク]";
		mes "しかし、わしはのう、";
		mes "明日の命がわからぬ傭兵で、";
		mes "身分の差があることついても";//「に」が抜けているが本鯖どおり
		mes "引け目を感じてはいたが、";
		mes "ターニャを幸せにできるのは、";
		mes "自分しかいない、と信じていたんじゃ。";
		next;
		mes "[ノリーク]";
		mes "それで、ターニャに結婚を申し込もうと";
		mes "あの手紙を書いたんじゃ。";
		next;
		mes "[ノリーク]";
		mes "しかし、あの手紙をターニャに渡そうと";
		mes "思っていた日、";
		mes "モンスターが急に街を攻めてきてな、";
		mes "モンスターとの戦いがあったんじゃ。";
		next;
		mes "[ノリーク]";
		mes "……";
		mes "そこで、わしの仲間のひとりが";
		mes "モンスターにやられて、";
		mes "命を失ってしまった。";
		next;
		mes "[ノリーク]";
		mes "その仲間には、婚約者がいたんじゃ。";
		mes "その婚約者は、仲間の亡骸の前で、";
		mes "号泣しておった。";
		mes "これから残されたわたしは";
		mes "どうすればいいの、とな。";
		next;
		mes "[ノリーク]";
		mes "わしは、いてもたっても";
		mes "いられなくなった。";
		mes "なぜなら、その姿が、";
		mes "近い将来の";
		mes "わしとターニャの姿に見えてな。";
		next;
		mes "[ノリーク]";
		mes "いっそ、ターニャのために";
		mes "傭兵をやめようと思った。";
		mes "しかし……";
		mes "振り返れば、";
		mes "わしらが守った街の人たちが";
		mes "そこにおった。";
		next;
		mes "[ノリーク]";
		mes "皆がわしらに、礼を言うんじゃよ。";
		mes "わしらがいたおかげで助かった、とな。";
		mes "わしを見て、「大きくなったら";
		mes "わしみたいな傭兵になりたい」と";
		mes "眼を輝かせながら言う子供もおった。";
		next;
		mes "[ノリーク]";
		mes "わしは、その日に、";
		mes "ターニャと出会った場所に、";
		mes "手紙を埋めたんじゃ。";
		next;
		mes "[ノリーク]";
		mes "わしは、";
		mes "ターニャを幸せにできない、";
		mes "と悟ってな。";
		next;
		mes "[ターニャ]";
		mes "……";
		next;
		mes "[ターニャ]";
		mes "……";
		mes "その決断をする時、";
		mes "相談して欲しかったわ……";
		mes "いつも勝手に……";
		next;
		mes "[ノリーク]";
		mes "……";
		next;
		mes "[ノリーク]";
		mes "……";
		mes "それから数年後、";
		mes "わしは傭兵として、";
		mes "日々、モンスターとの戦いに";
		mes "あけくれていた。";
		next;
		mes "[ノリーク]";
		mes "そしてある日、";
		mes "強力なモンスターの集団と";
		mes "出会ってしまってな。";
		next;
		mes "[ノリーク]";
		mes "わしは、その戦闘で";
		mes "瀕死の重傷を負ってしまった。";
		next;
		mes "[ノリーク]";
		mes "仲間の部隊からも";
		mes "分断されてしまって、わしひとりじゃ。";
		mes "わしは、意識が途切れそうになるのを";
		mes "必死にこらえて、敵から逃走した。";
		next;
		mes "[ノリーク]";
		mes "しかし、、わしはモンスターに";
		mes "囲まれてしまったんじゃ。";
		mes "気付かない間にな。";
		mes "もう戦う力も、動く力もない……";
		mes "わしはその場に倒れこみ、";
		mes "死の覚悟をした。";
		next;
		mes "[ノリーク]";
		mes "モンスターがわしの目の前まで来て、";
		mes "その爪をわしに振り下ろそうとした。";
		mes "そこで、わしは意識を失ってしまった。";
		next;
		mes "[ノリーク]";
		mes "どれくらい時間が";
		mes "たったかわからないが、";
		mes "わしは目を覚ましたんじゃ。";
		next;
		mes "[ノリーク]";
		mes "眼を覚ますと、目の前に";
		mes "信じられないことだが、";
		mes "ターニャがおったんじゃ。";
		mes "夢かなと思ったが、";
		mes "間違いなくターニャが";
		mes "看病してくれていたんじゃよ。";
		next;
		mes "[ノリーク]";
		mes "話を聞くと、わしがモンスターに";
		mes "包囲されているのを";
		mes "ターニャが";
		mes "救い出してくれていたんじゃ。";
		next;
		mes "[ノリーク]";
		mes "ターニャは、わしに話してくれた。";
		mes "あの日、わしが消えてからのことを。";
		mes " ";
		mes "あの日、わしが消えてから";
		mes "ターニャは家を飛び出して";
		mes "わしを探し続けていたそうじゃ。";
		next;
		mes "[ノリーク]";
		mes "もともと、グリンカ家は";
		mes "闇の世界で名家だったらしくてのう。";
		mes "昔から、かなり訓練を";
		mes "つんでいたそうじゃ。";
		mes "わしを探す旅に出てから、";
		mes "さらに腕が上がって、";
		next;
		mes "[ノリーク]";
		mes "^FF0000アサシンクロス^000000という職業";
		mes "になっておった。";
		mes " ";
		mes "わしを囲んでいたモンスターを";
		mes "一瞬で倒したそうじゃ……";
		next;
		mes "[ノリーク]";
		mes "そうやって、わしらは";
		mes "再び出会い、こうしておる。";
		mes "ターニャの熱意に";
		mes "ターニャの親類も折れてくれてのう。";
		next;
		mes "[ターニャ]";
		mes "そうね。";
		mes "ノリークと一緒になれて";
		mes "とても幸せだったわ。";
		next;
		menu "箱を渡そう",-;
		mes "[ターニャ]";
		mes "これね！";
		mes "50年以上たって、";
		mes "やっと私のところに届いたのね。";
		next;
		mes "[ノリーク]";
		mes "あ、この箱は……";
		mes "そうだ、思い出した。";
		mes "ターニャのために…";
		mes "この箱を2重底にしていた気がする！";
		next;
		mes "‐ノリークは箱を持って、";
		mes "箱をいじり始めた。";
		mes "箱は、カチャッと音を出して";
		mes "箱の底が開き、";
		mes "中からネックレスが出てきた‐";
		next;
		mes "[ノリーク]";
		mes "そうだ、";
		mes "これをターニャにプレゼントしようと、";
		mes "びっくりさせようと、";
		mes "ここに仕掛けをしておいたんだ……";
		next;
		mes "[ノリーク]";
		mes "ああ、50年以上渡すのが";
		mes "遅れてしまったけど……";
		mes " ";
		mes "‐ノリークはそのネックレスをとって、";
		mes "ターニャにかけた‐";
		next;
		mes "[ターニャ]";
		mes "渡すのが遅すぎるわよ……";
		mes "……";
		mes "でも……";
		mes "すごく、嬉しいわ……";
		mes "‐ターニャの目から涙があふれ出る‐";
		next;
		mes "‐ターニャは高そうなアクセサリーを";
		mes "たくさんつけているが、";
		mes "ノリークがプレゼントした";
		mes "ネックレスが一番輝いているように";
		mes "見えた‐";
		next;
		mes "‐このネックレスが50年前から";
		mes "輝きを失っていないように、";
		mes "ノリークとターニャの愛も";
		mes "50年前から輝き続けているのだろう。";
		mes strcharinfo(0) + "は";
		mes "そう思った‐";
		next;
		mes "[ターニャ]";
		mes "ノリーク、本当に嬉しいわ。";
		mes "私は、あなたと一緒になれて、";
		mes "本当に幸せよ。";
		next;
		mes "[ノリーク]";
		mes "わしもだよ。";
		mes " ";
		mes strcharinfo(0) + "、";
		mes "本当にありがとう。";
		mes "この箱を届けてくれて。";
		mes "Louiseにも礼を伝えて欲しい。";
		next;
		mes "[ターニャ]";
		mes "ええ、本当よ。";
		mes "Louiseさんに";
		mes "早く来るように伝えて。";
		mes "この感謝の気持ちを直接伝えたいわ。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		mes "[ターニャ]";
		mes "Louiseさんにも";
		mes "是非、仕事が落ち着いたら";
		mes "すぐに来るように伝えてちょうだい。";
		next;
		mes "[ターニャ]";
		mes "あまり来ないようだったら、";
		mes "仕事がなくなるように";
		mes "手配してしまうわよ、とも";
		mes "伝えておいてちょうだい。";
		next;
		mes "[ノリーク]";
		mes "た、ターニャ、";
		mes "冗談が過ぎるぞ。";
		next;
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close;
	}
L_OTHER:
	mes "老夫婦が楽しげに話をしている。";
	mes "邪魔をしないでおこう。";
	close;
}
comodo.gat,116,219,4	duplicate(老婆#ac_comodo)	老人#ac_comodo	55
//初期の頃は自動会話ではなく、クリック方式だった
alberta.gat,107,59,0	script		埋める場所#AC_QUE01		139,2,2,{
	if(AC_QUEST_LV_1!=8 || (AC_QUEST_ST_1!=2 && AC_QUEST_ST_1!=3)) end;
	mes "‐ここの場所が";
	mes "埋めるのに最適だと思う‐";
	next;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "‐Louiseに報告しよう‐";
		next;
	case 3:
		mes "^FF0000【ミッション】^000000";
		mes "‐Louiseに報告する‐";
		close2;
		set AC_QUEST_ST_1,3;
		viewpoint 1,39,46,11,0x0000FF;
		end;
	}
}
