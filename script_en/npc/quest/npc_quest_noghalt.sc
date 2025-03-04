//==============================================================================
// Ragnarok Online Noghalt Script     by Blaze
//==============================================================================

//==============================================================================
// タナトスタワー
//==============================================================================
//タナトスタワー入り口管理人
hu_fild01.gat,140,163,5	script	入り口管理人	852,3,3,{
	mes "[カテ]";
	mes "こんにちは。";
	mes "私は、この「タナトスタワー」の";
	mes "入り口管理人カテ＝ヌムと申します。";
	mes "何かございますか？";
	next;
	switch(select("タナトスタワーとは？","塔の中へ入れますか？","塔の中へ……","いいえ、何でもないです")) {
	case 1:
		mes "[カテ]";
		mes "はい。";
		mes "こちらの塔が「タナトスタワー」です。";
		mes "実は以前、この塔は";
		mes "放置されていました。";
		next;
		mes "[カテ]";
		mes "それを私どもレッケンベルが発見し、";
		mes "大規模なモンスター退治と";
		mes "補修工事を行いました。";
		mes "それにより現在は、";
		mes "この地域の観光名所となっております。";
		next;
		mes "[カテ]";
		mes "この塔が発見された当時、";
		mes "「タナトス」という文字が刻まれた";
		mes "石版が、この近くにありました。";
		mes "そこで塔の名は、この名をとり";
		mes "「タナトスタワー」とされました。";
		next;
		mes "[カテ]";
		mes "塔は発見後、継続的に開発作業を行い、";
		mes "塔にいたモンスターのうち、";
		mes "1、2層に生息していたものの";
		mes "大部分を退治しました。";
		next;
		mes "[カテ]";
		mes "そして、一般の方が安全に";
		mes "出入りできるようにして、";
		mes "現在、開放しております。";
		next;
		mes "[カテ]";
		mes "ただ、3層以上の区域は、";
		mes "まだ開発中でして……。";
		mes "そこのモンスター退治に";
		mes "協力してくださる方々を";
		mes "現在、募集しております。";
		next;
		mes "[カテ]";
		mes "この件の詳細に関しては、";
		mes "塔の中にてご案内いたします。";
		next;
		mes "[カテ]";
		mes "更に知りたい事がございましたら、";
		mes "塔の中にいるガイドに";
		mes "お尋ねください。";
		close;
	case 2:
		mes "[カテ]";
		mes "もちろん入ることはできます。";
		mes "一般の方々にも";
		mes "公開されておりますので。";
		next;
		mes "[カテ]";
		mes "但し、公開されているのは、";
		mes "1、2層のみとなります。";
		next;
		mes "[カテ]";
		mes "また、入場料が必要となります。";
		mes "金額的に少々高いと";
		mes "感じられるかもしれませんが、";
		mes "塔の中に入れば、逆に安いと";
		mes "感じていただけると思います。";
		next;
		mes "[カテ]";
		mes "入場料はお一人様5,000Zenyです。";
		mes "何度もご利用なさると、";
		mes "多少の割引があるかもしれません。";
		mes "その他、私どもに";
		mes "協力してくださる方々には、";
		mes "割引がございます。";
		close;
	case 3:
		mes "[カテ]";
		mes "入られますか？";
		mes "入場料は、^FF0000お一人様、5,000Zeny^000000です。";
		next;
		if(select("入ります","またの機会に")==2) {
			mes "[カテ]";
			mes "それでは、次の機会のご利用を";
			mes "お待ちしております。";
			close;
		}
		if(THA_1QUE) {
			mes "[カテ]";
			mes "あ、" +strcharinfo(0)+ "様ですね。";
			mes "今回もお仕事ですか？";
			mes "お客様の入場料は、";
			mes "特別価格の3,000Zenyとなります。";
			next;
			if(select("入ります","またの機会に")==2) {
				mes "[カテ]";
				mes "お忙しいようですね。";
				mes "それでは、またの機会に";
				mes "よろしくお願いします。";
				close;
			}
			if(Zeny < 3000) {
				mes "[カテ]";
				mes "お客様、恐れ入りますが、";
				mes "お金が少々足りないようです。";
				mes "申し訳ありません。";
				close;
			}
			mes "[カテ]";
			mes "ありがとうございます。";
			mes "それではこちらへどうぞ。";
			close2;
			set Zeny,Zeny-3000;
			warp "tha_scene01.gat",131,220;
			end;
		}
		if(Zeny < 5000) {
			mes "[カテ]";
			mes "お客様、恐れ入りますが、";
			mes "お金が少々足りないようです。";
			mes "申し訳ありません。";
			close;
		}
		mes "[カテ]";
		mes "ありがとうございます。";
		mes "きっと、素敵な思い出に";
		mes "なることでしょう。";
		mes "それでは……。";
		close2;
		set Zeny,Zeny-5000;
		warp "tha_scene01.gat",131,220;
		end;
	case 4:
		mes "[カテ]";
		mes "あ、そうですか……。";
		mes "こちら「タナトスタワー」に関して";
		mes "何かございましたら、";
		mes "私をお訪ねください。";
		close;
	}
OnTouch:
	mes "[管理者]";
	mes "あ……";
	mes "ちょっとお待ちください。";
	mes "こちらは、レッケンベルの";
	mes "管理区域でして、";
	mes "出入りを制限しております。";
	close;
}

//タナトスタワーガイド
tha_t01.gat,149,78,4	script	ガイド	90,{
	if(THA_1QUE) {
		mes "[ティーチェ]";
		mes "詳細に関しては、";
		mes "2層と私のそばにいるガイドが";
		mes "ご案内いたします。";
		mes "ありがとうございました。";
		close;
	}
	mes "[ティーチェ]";
	mes "こんにちは。";
	mes "レッケンベルが開発し、公開中の";
	mes "こちら「タナトスタワー」に";
	mes "ようこそお越しくださいました。";
	mes "何をお手伝いしましょうか？";
	next;
	switch(select("タナトスタワーについて教えてください","人を集めていると聞きましたが……","何でもありません")) {
	case 1:
		mes "[ティーチェ]";
		mes "この「タナトスタワー」は、";
		mes "誰が、いつ、何故建設したのかなど……";
		mes "その起源について、";
		mes "正確には判っておりません。";
		mes "これに関して、";
		mes "いくつかの説があります。";
		next;
		mes "[ティーチェ]";
		mes "「千年前の戦争時、";
		mes "魔族がとある事情により建てた」";
		mes "「ある魔導師の研究所だった」";
		mes "「ある英雄が魔王を倒し、";
		mes "その記念として建てた」等々。";
		next;
		mes "[ティーチェ]";
		mes "私どもレッケンベルでは、";
		mes "長年、発掘と研究を続けておりますが、";
		mes "未だ正確な起源の解明には";
		mes "至っておりません。";
		next;
		mes "[ティーチェ]";
		mes "また、塔の内部は、ほぼ全地域に";
		mes "多数のモンスターが生息しています。";
		mes "そのため、犠牲者も";
		mes "かなりの数に上がっていますが……。";
		next;
		mes "[ティーチェ]";
		mes "私どもレッケンベルでは、";
		mes "この「タナトスタワー」には、";
		mes "数々の秘密が存在していると";
		mes "確信しています。";
		next;
		mes "[ティーチェ]";
		mes "そして、その秘密が、人類発展に";
		mes "大いに役立つと考えております。";
		mes "その判断に基づき、危険を省みず、";
		mes "現在も発掘作業を続けております。";
		next;
		mes "[ティーチェ]";
		mes "その結果、全12層中、";
		mes "1層と2層の開発を完了しました。";
		mes "また、3層と4層は、開発作業を";
		mes "急ピッチで行っている最中です。";
		next;
		mes "[ティーチェ]";
		mes "強力なモンスターのせいで、";
		mes "作業が難航しておりますが、";
		mes "多くの方々がモンスター退治に";
		mes "協力してくださっているおかげで、";
		mes "何とか開発は進んでおります。";
		next;
		mes "[ティーチェ]";
		mes "このような状況ですので、";
		mes "いずれ3層と4層の開発も";
		mes "完了すると思われます。";
		while(1) {
			next;
			switch(select("モンスターって？","モンスター退治？","…………")) {
			case 1:
				mes "[ティーチェ]";
				mes "はい。";
				mes "私どもがこちらの開発に着手した直後、";
				mes "出現し始めました。";
				next;
				mes "[ティーチェ]";
				mes "その珍しい点と言いますと……";
				mes "あれらの出現場所が不明なことと、";
				mes "あれらがまるで天使のような形を";
				mes "しているということです。";
				next;
				mes "[ティーチェ]";
				mes "そのせいか、あれらを見た者は、";
				mes "「彼らは神の使いだ」";
				mes "とか言っていますが……。";
				mes "神の使いが私たち人間を";
				mes "襲う理由があると思います？";
				next;
				mes "[ティーチェ]";
				mes "そこで私どもは、";
				mes "ジュノーのセージ学会に";
				mes "調査を依頼しました。";
				next;
				mes "[ティーチェ]";
				mes "その結果、彼らは単に";
				mes "天使のような姿をしている";
				mes "モンスターに過ぎないという事が";
				mes "判りました。";
				next;
				mes "[ティーチェ]";
				mes "それで、私どもはより精力的に";
				mes "彼らを退けるようになりました。";
				mes "そして、今日まで彼らとの戦いが";
				mes "続いているのです。";
				continue;
			case 2:
				break;
			case 3:
				mes "[ティーチェ]";
				mes "上層部の開発には、";
				mes "かなりの人員を要しますので、";
				mes "外部の方々の支援も";
				mes "受け付けております。";
				mes "もしよろしければ、";
				mes "志願なさってはいかがでしょう？";
				close;
			}
			break;
		}
	case 2:
		mes "[ティーチェ]";
		mes "入り口管理人から";
		mes "お聞きになったかもしれませんが、";
		mes "私どもレッケンベルでは、";
		mes "3層と4層、そしてその上の層の";
		mes "発掘及び開発のため、";
		mes "アルバイトを募集しております。";
		next;
		mes "[ティーチェ]";
		mes "一種の傭兵とでも";
		mes "考えてくださればよいです。";
		mes "私どもと契約をなさる方々には、";
		mes "一般の方々には制限している";
		mes "3層以上への出入りを";
		mes "許可しております。";
		next;
		mes "[ティーチェ]";
		mes "そして、該当のモンスターたちを";
		mes "退治したという証拠を";
		mes "持ってきてくだされば、";
		mes "相応の報酬を差し上げます。";
		next;
		mes "[ティーチェ]";
		mes "もし、応募する意向がございましたら、";
		mes "私にお申し付けください。";
		next;
		if(select("またの機会に","申し込みます")==1) {
			mes "[ティーチェ]";
			mes "いつでも受け付けておりますので、";
			mes "考えが変わりましたら";
			mes "またお越しください。";
			close;
		}
		mes "[ティーチェ]";
		mes "分かりました。";
		mes "ありがとうございます。";
		mes "では、こちらの書類を";
		mes "ご覧ください。";
		mes "簡単な誓約書みたいなものです。";
		next;
		mes "[ティーチェ]";
		mes "それから……お名前は……";
		mes strcharinfo(0)+ "様で";
		mes "よろしいでしょうか？";
		next;
		menu "はい",-;
		mes "[ティーチェ]";
		mes "それでは、こちら全てに";
		mes "目をお通しになってから、";
		mes "署名なさってください。";
		next;
		mes "‐小さな字がびっしりと";
		mes "書かれた紙を渡された‐";
		next;
		mes "＜契約書＞";
		mes "1.この契約書は、";
		mes "レッケンベル（以降「甲」)と";
		mes strcharinfo(0)+ "（以降「乙」）間の";
		mes "契約として効力を発揮する。";
		mes "1-1.この契約の名称は、";
		mes "「甲」と「乙」間の傭兵契約とする。";
		mes "2.契約の効力は、両者が契約書に";
		mes "署名することで発生する。";
		mes "3.任務による成果は、「乙」によって";
		mes "提示される証拠によって確認する。";
		mes "3-1.証拠は、次の通りとする。";
		mes "…………";
		mes "4.各証拠物を規定数以上、";
		mes "集めて来た場合に限り、";
		mes "「甲」は「乙」に報酬を与えるとする。";
		mes "4-1.報酬は次の通りとする。";
		mes "…………";
		mes "………………";
		mes "……………………";
		mes "13.この契約書は、";
		mes "タナトスタワーでのみ効力を発揮し、";
		mes "他地域ではその効力を発揮しない。";
		mes "……………………";
		mes "……追加報酬として、「甲」は「乙」に";
		mes "タナトスタワーの出入りに関して、";
		mes "割引措置を与えるとする。";
		mes "それによる入場価格は、";
		mes "5,000Zenyのものを";
		mes "3,000Zenyに変更する。";
		mes "…………";
		mes "………………";
		mes "　　　　　　　　レッケンベル";
		mes "　　　　　　　　"+ strcharinfo(0);
		next;
		if(select("署名する","署名しない")==2) {
			mes "[ティーチェ]";
			mes "あら……";
			mes "署名なさらないんですか？";
			mes "えっと……";
			mes "何か腑に落ちない部分が";
			mes "あるようですね。";
			next;
			mes "[ティーチェ]";
			mes "では、仕方ありませんね。";
			mes "もしお考えが変わりましたら、";
			mes "またお訪ねください。";
			close;
		}
		mes "‐同じ内容が書かれた";
		mes "二枚の契約書に署名した‐";
		next;
		mes "[ティーチェ]";
		mes "ありがとうございます。";
		mes "これで私どもと傭兵契約が";
		mes "締結されました。";
		next;
		mes "[ティーチェ]";
		mes "この契約書は、";
		mes "こちらタナトスタワーでのみ、";
		mes "効力を発揮しますので、";
		mes "特に心配する必要はございません。";
		next;
		mes "[ティーチェ]";
		mes "その他事項に関しては、";
		mes "契約書をご覧ください。";
		mes "なお、3層への出入りは、";
		mes "2層にいるガイドが担当しております。";
		mes "また、報酬は私のそばにいる";
		mes "ガイド「リエ」が担当しております。";
		next;
		mes "[ティーチェ]";
		mes "この件に関するより詳しい説明は、";
		mes "2層にいるガイドがご案内します。";
		mes "それでは、良い成果を";
		mes "期待しております。";
		set THA_1QUE,1;
		close;
	case 3:
		mes "[ティーチェ]";
		mes "タナトスタワーガイド";
		mes "ティーチェ＝ラパでした。";
		mes "楽しい一時になりますように。";
		close;
	}
}

//報酬ガイド
tha_t01.gat,140,78,4	script	ガイド	831,{
	if(THA_1QUE) {
		mes "[リエ]";
		mes "こんにちは～。";
		mes "何をお手伝いしましょうか～？";
		next;
		if(select("報酬をください","何でもないです")==2) {
			mes "[リエ]";
			mes "ありがとうございます～。";
			mes "さようなら～。";
			close;
		}
		mes "[リエ]";
		mes "おお！　契約の方ですね～？";
		mes "少々お待ちください～。";
		next;
		mes "[リエ]";
		mes strcharinfo(0)+ "様ですね……";
		mes "どの品の報酬をご希望ですか～？";
		next;
		switch(select("金の腕輪","赤い羽毛","青い羽毛","呪われた印")) {
		case 1: set '@itemid,7435; break;
		case 2: set '@itemid,7440; break;
		case 3: set '@itemid,7441; break;
		case 4: set '@itemid,7442; break;
		}
		if(countitem('@itemid) < 1) {
			mes "[リエ]";
			mes "…………";
			mes "あの～、「" +getitemname('@itemid)+ "」が";
			mes "ないようですが……。";
			mes "もう一度お荷物を";
			mes "確認してください～。";
			close;
		}
		set '@num,countitem('@itemid);
		set '@zeny,1000*'@num;
		if(checkre())
			set '@exp,200*'@num;
		else
			set '@exp,2000*'@num;
		mes "[リエ]";
		mes "「" +getitemname('@itemid)+ "」一個当たりの報酬は、";
		mes "お金：1,000Zeny";
		if(checkre())
			mes "追加報酬：200exp";
		else
			mes "追加報酬：2,000exp";
		mes "になりますね～。";
		next;
		mes "[リエ]";
		mes "現在、お持ちの「" +getitemname('@itemid)+ "」は、";
		mes '@num+ "個なので……";
		mes "お金：" +'@zeny+ "Zeny";
		mes "追加報酬：" +'@exp+ "exp";
		mes "になりますね～。";
		next;
		mes "[リエ]";
		mes "報酬を受けとります～？";
		next;
		if(select("はい","いいえ")==2) {
			mes "[リエ]";
			mes "報酬を受け取りたくなったら、";
			mes "いつでも来てください～。";
			close;
		}
		mes "[リエ]";
		mes "ありがとうございます～。";
		mes "では、精算しますね～。";
		next;
		mes "[リエ]";
		mes "お金：" +'@zeny+ "Zeny";
		mes "追加報酬：" +'@exp+ "exp";
		mes "をお渡しします～。";
		mes "また、お願いしますね～。";
		delitem '@itemid,'@num;
		set Zeny,Zeny+'@zeny;
		getexp '@exp,0;
		close;
	}
	mes "[リエ]";
	mes "こんにちは～。";
	mes "「タナトスタワー契約」に";
	mes "関する報酬担当の";
	mes "リエ＝クニジェです～。";
	next;
	if(select("契約？","お疲れ様です")==1) {
		mes "[リエ]";
		mes "契約というのは、";
		mes "私ども「レッケンベル」社との";
		mes "傭兵契約のことです～。";
		mes "詳細と契約に関する手続きは、";
		mes "そこにいる「ティーチェ」に";
		mes "聞いてください～。";
		close;
	}
	mes "[リエ]";
	mes "ありがとうございます～。";
	mes "よい日になるといいですね～。";
	close;
}

//ゲートガイド
tha_t02.gat,231,161,5	script	ゲートガイド	874,{
	if(THA_1QUE) {
		mes "-男は、何か考え事をしているようだ-";
		next;
		mes "[プルレド]";
		mes "…………。";
		next;
		if(select("あの……","…………")==2) {
			mes "[" +strcharinfo(0)+ "]";
			mes "………………。";
			close;
		}
		mes "[プルレド]";
		mes "あ……";
		mes "申し訳ありません。";
		mes "どのようなご用件でしょうか？";
		next;
		if(select("3層に行きたいのですが","契約者への説明を……")==2) {
			mes "[プルレド]";
			mes "かしこまりました。";
			mes "大方の話は既に";
			mes "お聞きになったでしょうから、";
			mes "ここでは、必要な部分だけにします。";
			next;
			mes "[プルレド]";
			mes "先に申し上げておきますが、";
			mes "3層へ通じる道は、";
			mes "こちら一つだけとなります。";
			mes "また、5層以上への道は、";
			mes "一方通行となっております。";
			next;
			mes "[プルレド]";
			mes "3層と4層は、私どもがある程度";
			mes "開発を進めておりますので、";
			mes "比較的自由に";
			mes "行き来することができます。";
			next;
			mes "[プルレド]";
			mes "しかし5層からは、";
			mes "何かの力が作用しているらしく、";
			mes "先へ進むことはできても、";
			mes "戻ることはできません。";
			next;
			mes "[プルレド]";
			mes "この塔の最上層は、12層です。";
			mes "上層へ上がるほど、";
			mes "登場するモンスターたちも強力になり、";
			mes "地形もかなり変化しています。";
			next;
			mes "[プルレド]";
			mes "もし、5層以上に行くのでしたら、";
			mes "必ず帰る方法を決めてから";
			mes "上がるようにしてください。";
			close;
		}
		mes "[プルレド]";
		mes "かしこまりました。";
		mes "少々、確認をします。";
		mes "お名前は……";
		mes strcharinfo(0)+ "様ですね。";
		mes "3層へ通じるゲートを開きます。";
		next;
		mes "[プルレド]";
		mes "ゲートの開放時間は短いので、";
		mes "即座に移動してください。";
		mes "移動に時間がかかりますと、";
		mes "上の層のモンスターたちが、";
		mes "こちらへ入ってきますので。";
		hideoffnpc "thawarp1";
		initnpctimer;
		close;
	}
	mes "[プルレド]";
	mes "こちらは、3層へ通じるゲートです。";
	mes "私どもと契約を結ばれた方々だけが";
	mes "出入り可能となっております。";
	next;
	mes "[プルレド]";
	mes "詳細は下の層のガイドに";
	mes "お尋ねください。";
	close;
OnTimer30000:
	hideonnpc "thawarp1";
	stopnpctimer;
	end;
}

tha_t02.gat,227,163,0	script	thawarp1	45,1,1{
	if(THA_1QUE)
		warp "tha_t03.gat",219,159;
	else
		warp "tha_t02.gat",227,158;
	end;
OnInit:
	hideonnpc;
	end;
}

//==============================================================================
// アビスレイク
//==============================================================================
hu_fild05.gat,168,304,0	script	柱	111,{
	mes "-柱の表面に、";
	mes "何かが通り抜けたかのような";
	mes "小さい穴がある-";
	mes "-その柱の模様は、竜に似ている-";
	if(countitem(1035) < 1 || countitem(1036) < 1 || countitem(1037) < 1) {
		mes "-そして、三つの小さな穴には、";
		mes "何か物を入れられそうだ-";
		close;
	}
	next;
	if(select("柱の穴にアイテムを入れる","自分の口にアイテムを入れる")==1) {
		mes "-ドラゴンの牙を、慎重に";
		mes "柱の穴に押し込んだ-";
		mes "-すると、柱から";
		mes "ウォーンという音がした-";
		next;
		mes "-ドラゴンの鱗を、慎重に";
		mes "別の穴に押し込んだ-";
		mes "-また、柱から音がして、";
		mes "しばらく揺れた-";
		next;
		misceffect 72;
		mes "-ドラゴンの尻尾を、慎重に";
		mes "残りの穴に押し込んだ-";
		mes "-すると、ウォーンという音と共に、";
		mes "柱の割れ目から光が漏れてきて……";
		mes "全身を包んだ-";
		next;
		mes "-どこかから引っ張られたかのように";
		mes "足元がスッと消えた感じがした-";
		misceffect 99;
		misceffect 321,"";
		close2;
		delitem 1035,1;
		delitem 1036,1;
		delitem 1037,1;
		warp "hu_fild05.gat",184,204;
		hideoffnpc "abysswarp";
		initnpctimer;
		end;
	}
	mes "-自分の口の中へ";
	mes "アイテムを慎重に押し込んだ-";
	mes "-すると、ウォーンという音と共に、";
	mes "お腹が搖れ始めた-";
	next;
	delitem 1035,1;
	delitem 1036,1;
	delitem 1037,1;
	emotion 23,"";
	percentheal -10,0;
	close;
OnTimer10000:
	hideonnpc "abysswarp";
	stopnpctimer;
	end;
}

hu_fild05.gat,196,210,0	script	abysswarp	45,1,1{
	warp "abyss_01.gat",260,268;
	end;
OnInit:
	hideonnpc;
	end;
}

hu_fild05.gat,171,211,0	script	柱	111,{
	mes "-湖で見た柱と似ている-";
	mes "-穴が青く輝いている-";
	next;
	if(select("輝いている穴に手を入れてみる","輝いている穴からアイテムを引き抜く")==1) {
		mes "-コツンコツンコツン……-";
		next;
		misceffect 72;
		mes "-光が遮られ、";
		mes "柱の内側から何か音がした-";
		next;
		mes "-グググググググッ-";
		mes "-グーーンッ-";
		next;
		mes "-穴の所が揺れ、";
		mes "柱の中から光が伸びてきた-";
		mes "-どこかから引っ張られたかのように";
		mes "足元がスッと消えた感じがした-";
		next;
		misceffect 99;
		misceffect 321,"";
		close2;
		warp "hu_fild05.gat",169,305;
		end;
	}
	misceffect 72;
	mes "-バリン!!-";
	mes "-引き抜いたアイテムが壊れた-";
	next;
	mes "-グググググググッグーーーーン!!-";
	next;
	mes "-柱が揺れ始め、";
	mes "光はどこかへ吸い込まれていった-";
	mes "-そして足元が揺れ……";
	mes "どこかへ投げ飛ばされた-";
	next;
	misceffect 99;
	misceffect 321,"";
	close2;
	warp "hu_fild05.gat",158,274;
	end;
}
