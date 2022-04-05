//==============================================================================
//Ragnarok Online - Kafra bunny hairband Script
//
//  ■ BUNNY_EVE -> 0or1
//==============================================================================

-	script	UsamimiEvt	-1,{
	mes "[カプラ職員]";
	mes "- いつもお客様のそばに -";
	mes "^529DFFウサギのヘアバンド^FF0000製作イベント";
	mes "開催中！";
	next;
	switch (select("イベント参加","イベント案内","やめる")) {
	case 1:
		if(BUNNY_EVE == 0) {
			set BUNNY_EVE,1;
			mes "[カプラ職員]";
			mes "ご参加ありがとうございます。";
			mes "ウサギのヘアバンドに必要な";
			mes "アイテムを用意してからまた";
			mes "こちらへいらしてください。";
			close;
		}
		mes "[カプラ職員]";
		mes "お客様のイベントアイテムを";
		mes "確認させていただきます。";
		next;
		if(countitem(949)<100) {
			mes "[カプラ職員]";
			mes "お客様、やわらかな毛100個が";
			mes "必要です。";
			close;
		}
		if(countitem(706)<1) {
			mes "[カプラ職員]";
			mes "お客様、四葉クローバ１個以上が必要です。";
			close;
		}
		if(countitem(722)<1) {
			mes "[カプラ職員]";
			mes "お客様、真珠が一個以上必要であります。";
			close;
		}
		if(countitem(2213)<1) {
			mes "[カプラ職員]";
			mes "お客様、猫耳のヘアバンドが１個以上必要です。";
			close;
		}
		mes "[カプラ職員]";
		mes "おおっ！お客様、全てのアイテムをそろって来ましたね！！";
		mes "すぐカプラ職員の手作りウサギのヘアバンドをさしあげます。";
		mes "しばらくお待ちくださいませ。";
		next;
		delitem 949,100;
		delitem 706,1;
		delitem 722,1;
		delitem 2213,1;
		mes "[カプラ職員]";
		mes "^FF0000ウサギのヘアバンド^000000さあ、受け取ってください。";
		getitem 2214,1;
		set BUNNY_EVE,0;
		next;
		mes "[カプラ職員]";
		mes "今度のイベントに参加したのを感謝します。後にもカプライベントは顧客満足のためにもっともっとがんばります～";
		mes "ありがとうございます。";
		close;
	case 2:
		mes "[カプラ職員]";
		mes "我々カプラサービスが提供する";
		mes "ボーナスイベントです！";
		next;
		mes "[カプラ職員]";
		mes "^529DFFお客様と共に^FF0000非常にレアなアイテム";
		mes "^529DFF「ウサギのヘアバンド」^FF0000を製作しようと";
		mes "いうイベントです。";
		mes "(スポンサー : アルベルタ商人組合)";
		next;
		mes "[カプラ職員]";
		mes "このイベントは、";
		mes "お客様にウサギのヘアバンドを";
		mes "作るために必要なアイテムを用意して";
		mes "いただき、当方で仕上げるという";
		mes "ものです。";
		mes "必要なアイテムは以下の通りです。";
		next;
		mes "[カプラ職員]";
		mes "やわらかな毛- 100個";
		mes "四葉のクローバー- 1個";
		mes "真珠- 1個";
		mes "猫耳のヘアバンド - 1個";
		next;
		mes "[カプラ職員]";
		mes "以上のアイテムをお持ちになって";
		mes "またこちらまでお越しください。";
		mes "皆様の幸運をお祈りします。";
		close;
	case 3:
		close;
	}
}

//prontera.gat,146,87,6	duplicate(UsamimiEvt)	カプラ職員	83
//geffen.gat,116,62,0	duplicate(UsamimiEvt)	カプラ職員	83
//morocc.gat,154,97,4	duplicate(UsamimiEvt)	カプラ職員	83
alberta.gat,26,229,0	duplicate(UsamimiEvt)	カプラ職員	83
//payon.gat,97,116,4	duplicate(UsamimiEvt)	カプラ職員	83
