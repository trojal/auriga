//= Athena Script ==============================================================
// Ragnarok Online Jawaii Town Script	by yukito
//==============================================================================

//============================================================
// Shop
//------------------------------------------------------------
jawaii.gat,186,174,2	shop	アイスクリーム商人	85,536,536,536,536,536,536,536

//============================================================
// イズルード⇔ジャワイ既婚者転送NPC
//------------------------------------------------------------
izlude.gat,171,185,4	script	新婚コンパニオン	71,{
	mes "[ウェディングハッピー]";
	mes "新婚の方はもちろん、何度も記念日を";
	mes "迎えられた仲の良いご夫婦も……";
	mes "既婚者なら誰でも行ける";
	mes "甘いムードが漂う島「ジャワイ」へ";
	mes "皆さんをご招待いたします！";
	next;
	switch(select("ジャワイ？","「ジャワイ」へ出発～","けっこうです")) {
	case 1:
		mes "[ウェディングハッピー]";
		mes "はい。ミッドガルド大陸のはるか";
		mes "海の彼方にある島のことです。";
		mes "静かで素敵な休養地でして、";
		mes "新婚旅行先としても有名です。";
		mes "但し、そこへ行けるのは";
		mes "結婚している方のみになります。";
		next;
		mes "[ウェディングハッピー]";
		mes "その為、料金は少々高めになります。";
		mes "そのお値段は、100,000Zeny!!";
		mes "でも、だからこそ平和で静かな";
		mes "新婚旅行を楽しめますよ。";
		close;
	case 2:
		if(!(PartnerId)) {
			mes "[ウェディングハッピー]";
			mes "申し訳ありませんが、未婚の方を";
			mes "お送りすることはできません。";
			mes "先ほども申し上げましたように";
			mes "既婚者の為の場所ですので。";
			mes "代わりに、プロンテラ酒場で寂しさを";
			mes "慰めてみてはいかがでしょう？";
			close;
		}
		if(Zeny < 100000) {
			mes "[ウェディングハッピー]";
			mes "「ジャワイ」へ行くには、";
			mes "100,000Zenyが必要です。";
			mes "旅費が足りないのでしたら、";
			mes "お連れの方にお願いして";
			mes "みてはいかがでしょう？";
			close;
		}
		mes "[ウェディングハッピー]";
		mes "楽しいご旅行になりますように。";
		mes "では、「ジャワイ」へ出発します！";
		close2;
		set Zeny,Zeny-100000;
		warp "jawaii.gat",245,125;
		end;
	case 3:
		mes "[ウェディングハッピー]";
		mes "愛する二人でなさる旅行ほど";
		mes "楽しいものはないんですよね。";
		mes "特にこのジャワイなら、より一層";
		mes "いい思い出が作れるはずです。";
		close;
	}
}

jawaii.gat,239,112,7	script	船員::イズルード#Jawaii	100,{
	mes "[船員]";
	mes strnpcinfo(4)+ "へお送りします。";	//識別子の#以降を無視して参照
	mes "ジャワイでの一時はいかがでしたか？";
	mes "ご出発前に、忘れ物はないか";
	mes "再度ご確認ください。";
	next;
	mes "[船員]";
	mes "では、" +strnpcinfo(4)+ "へ帰りますか？";
	next;
	if(select("帰る","やめる")==2) {
		mes "[船員]";
		mes "了解しました。";
		mes "もう少し滞在されるとよいでしょう。";
		mes "そうそう来られる所では";
		mes "ありませんしね。";
		close;
	}
	mes "[船員]";
	mes strnpcinfo(4)+ "へ出発します。";
	close2;
	if(strnpcinfo(4) == "イズルード")
		warp "izlude.gat",176,182;
	else
		warp "alberta.gat",192,157;
	end;
}

jawaii.gat,122,263,5	duplicate(イズルード#Jawaii)	船員::アルベルタ#Jawaii	100

//============================================================
// プロンテラ⇔ジャワイ未婚者転送NPC
//------------------------------------------------------------
prt_in.gat,173,13,4	script	お客さん	86,{
	if(PartnerId) {
		mes "[ハンス]";
		mes "…………うん？";
		next;
		mes "[ハンス]";
		mes "んあ！あっちへ行け！";
		mes "あっちへ行けったら！";
		mes "幸せな匂いをプンプンと";
		mes "漂わせてる奴はこっちに来るな！";
		next;
		mes "[ハンス]";
		mes "くう～、ケッ！";
		mes "ゴクッゴクッゴクッ!!";
		close;
	}
	mes "[ハンス]";
	mes "ゴクッゴクッ、ふぅ～。";
	mes "ちょいと酔っちまったかな。";
	mes "おい、お前！";
	mes "何だか寂しそうだな～。";
	next;
	mes "[ハンス]";
	mes "はぁ～。";
	mes "結婚だ何だーって";
	mes "大騒ぎしてる連中の姿を見てたら、";
	mes "ちょいとイライラしてきてさ。";
	next;
	mes "[ハンス]";
	mes "しかも、ソロ軍団を呼んでも";
	mes "全く気にしない幸せそうな";
	mes "カップルがいたんだよ。";
	mes "何かすっごく腹立つよな！";
	next;
	mes "[ハンス]";
	mes "他人に幸せを見せびらかされると、";
	mes "独り身の俺としちゃ何とも";
	mes "言えない気分になるわけよ。";
	mes "まあ、のんびりと暮らせる今が";
	mes "嫌というんじゃないけどな。";
	next;
	mes "[ハンス]";
	mes "とにかく結婚なんかいらないよな！";
	mes "友よ!!おし、一杯飲み交わそう！";
	mes "ほれ、俺がおごってやるから。";
	next;
	mes "- ハッ！ -";
	mes "- いつの間にか友達にされてる!? -";
	mes "- ……う、う～む。 -";
	mes "- まあ、ただのビールみたいだから -";
	mes "- 受け取って飲んでみるか…… -";
	next;
	mes "- ゴクゴクゴクゴク -";
	percentheal -10,0;
	next;
	mes "[ハンス]";
	mes "そーいや……";
	mes "いい所を知ってるんだが";
	mes "ちょいと行ってみるか？";
	while(1) {
		next;
		if(select("……もう一杯欲しい","……どんな所なんですか？")==1) {
			mes "[ハンス]";
			mes "そうか！飲みっぷりがいいな！";
			mes "おい、バチュカ。";
			mes "俺らも一杯飲もうぜ！";
			next;
			mes "[ハンス]";
			mes "おし、俺らのソロ人生に!!";
			mes "かーんぱい!!";
			next;
			mes "- ゴクゴクゴクゴクッ!! -";
			percentheal -10,0;
			set '@drink,'@drink+1;
			set '@flag,'@flag|1;
			if(('@flag&2 && '@drink < 4) || '@drink < 5) {
				next;
				mes "- ゴクゴクゴクゴクッ!! -";
				continue;
			}
			next;
			mes "[ハンス]";
			mes "おお!!お前ホント強いな！";
			mes "おし、気に入った！";
			mes "じゃあ、ここにサインしたら";
			mes "お前をいい所へ送ってやる。";
			next;
			if(select("サインする","サインしない")==1) {
				mes "[ハンス]";
				mes "よし！それじゃ送ってやろう！";
				mes "ククククッ。";
				close2;
				warp "jawaii_in.gat",44,124;
				end;
			}
		}
		else {
			if(('@flag&1 && '@drink < 3) || '@drink < 4) {
				mes "[ハンス]";
				mes "おい！全然飲んでないじゃないか!!";
				mes "ぬるい奴だな～!!";
				mes "遠慮せずにもっと飲もうぜ、友よ！";
				next;
				mes "[ハンス]";
				mes "俺らのソロ人生に！";
				mes "ほれ！かーんぱい!!";
				next;
				mes "- グビグビグビグビッ!! -";
				percentheal -10,0;
				set '@drink,'@drink+1;
				set '@flag,'@flag|2;
				continue;
			}
			mes "[ハンス]";
			mes "お、行ってみたいのか？";
			mes "よし、ここにサインしな。";
			mes "そしたらお前をいい所へ送ってやる。";
			next;
			if(select("サインする","サインしない")==1) {
				mes "[ハンス]";
				mes "おし！じゃあ、送ってやるか！";
				mes "クックックックッ……";
				mes "ちょいと惨めな思いをしてきな。";
				mes "クックックックッ……";
				close2;
				warp "jawaii_in.gat",44,124;
				end;
			}
		}
		break;	//while文抜ける
	}
	mes "[ハンス]";
	mes "……チェッ！";
	close;
}

prt_in.gat,170,14,0	script	お客さん	89,{
	mes "[バチュカ]";
	mes "……";
	mes "ゴクッゴクッ……";
	mes "くあああ!!うまい!!";
	emotion 28;
	close;
}

//============================================================
// ジャワイNPC
//------------------------------------------------------------
jawaii.gat,240,146,6	script	ジャワイ住民	724,{
	mes "[ワイワイ]";
	mes "ジャワイへようこそ！";
	mes "結婚と言えばやっぱり";
	mes "新婚旅行をは欠かせないですよね。";
	mes "ここなら、独り者に";
	mes "気を使う必要もありませんし。";
	next;
	mes "[ワイワイ]";
	mes "たまにモンスターを";
	mes "見かけるかもしれませんが、";
	mes "こちらから攻撃をしなければ大丈夫！";
	mes "昔からここに住んでいたんで。";
	mes "風景の一部とでも考えてください。";
	close;
}

jawaii.gat,165,121,2	script	ジャワイ住民	724,{
	mes "[ワニワニ]";
	mes "ジャワイ～。";
	mes "ああ～幸せな島～。";
	mes "素晴らしいとこですよ～。";
	mes "一日中の～んびりと";
	mes "何もしなくても過ごせる所。";
	mes "それがここ、ジャワイです～。";
	next;
	mes "[ワニワニ]";
	mes "こちらは舞台。";
	mes "時々、劇が上演されています～。";
	mes "よろしければ上がって";
	mes "歌でも一曲どうです～？";
	mes "ジャワイ～。";
	mes "ああ～ここは～幸せな島～。";
	close;
}

jawaii.gat,220,235,4	script	ジャワイ住民	724,{
	mes "[ザワザワ]";
	mes "ジャワイで一番きれいな場所は";
	mes "さあ、どこでしょう？";
	mes "そう、それはこのすぐ北にある";
	mes "「ハートアイランド」です。";
	next;
	mes "[ザワザワ]";
	mes "あ、そんなに深くないので、";
	mes "歩いて行けますよ。";
	mes "海を渡ってすぐです。";
	next;
	mes "[ザワザワ]";
	mes "二人で静かに時を過ごすのに";
	mes "とても良い場所です。";
	mes "でも、独りで座っていると";
	mes "……無人島に漂着した人に";
	mes "見えますけどね。";
	next;
	mes "[ザワザワ]";
	mes "だから「空きビンで漂流遊び！」";
	mes "なんてことは止めた方がいいですよ。";
	mes "ものすごーく暗く見えますから……";
	close;
}

jawaii.gat,168,247,6	script	ジャワイ住民	724,{
	mes "[ワザワザ]";
	mes "宿屋は西の方に集まっています。";
	mes "宿ごとに趣が異なりますので";
	mes "お好きな宿をお選びください。";
	mes "各宿に関しては、その傍にいる";
	mes "従業員にお聞きください。";
	next;
	mes "[ワザワザ]";
	mes "お帰りになる際は、北西と南東の";
	mes "各方角にある船をご利用ください。";
	mes "それぞれアルベルタとイズルード";
	mes "行きの定期船があります。";
	close;
}

jawaii.gat,188,218,4	script	秘密酒場のお嬢さん	80,{
	mes "[お嬢さん]";
	mes "あらあら、お客さん～。";
	mes "ここから先は軽い気持ちで";
	mes "行かない方がいいですよ！";
	mes "まあ、新婚旅行で有名なジャワイに";
	mes "こんな場所があること自体、";
	mes "信じられないんですけどね。";
	next;
	mes "[お嬢さん]";
	mes "どうやって入り込んだのか";
	mes "分かりませんが……たま～に";
	mes "未婚者がいるんですよ。それとね";
	mes "酒場で消える人もいるそうなんです。";
	mes "まあ、マスターが作るお酒は";
	mes "変な物ばかりですしね……";
	next;
	mes "[お嬢さん]";
	mes "雇われている身でこんな話をするのは";
	mes "本当はいけないんですけど……";
	mes "それでも勧めたくはないんですよ。";
	mes "まあ、行けば私が言っている";
	mes "意味が解りますよ。";
	close;
}

//============================================================
// 新婚時代の思い出販売NPC
//------------------------------------------------------------
jawaii.gat,214,168,5	script	新婚コンパニオン	71,{
	mes "[ウェディングハッピー]";
	mes "ご旅行はいかがです～？";
	mes "このジャワイほど新婚旅行に";
	mes "ぴったりな場所はないでしょう？";
	mes "せっかくいらしたんですから、";
	mes "楽しい思い出をた～くさん";
	mes "作ってくださいね。";
	next;
	mes "[ウェディングハッピー]";
	mes "いつまで経っても色あせない思い出。";
	mes "それはとても価値あるものです。";
	mes "初めてタキシードやウェディング";
	mes "ドレスを着た時のあの幸せな気分。";
	mes "それがすごく大事なんです。";
	next;
	mes "[ウェディングハッピー]";
	mes "残念ながら、ウェディングマーチの";
	mes "中を再び歩くことはできません。";
	mes "でもせめて、心のアルバムを開いて";
	mes "新婚時代の思い出に浸りたいですよね？";
	mes "そんな魔法を願う方々の為に、";
	mes "準備した物がございます。";
	next;
	mes "[ウェディングハッピー]";
	mes "その名も「新婚時代の思い出!!」";
	mes "魔法の力で少しの間、";
	mes "結婚式当日のあの幸せな気分を";
	mes "再び味わうことができます。";
	mes "ちなみにそのお値段は50000Zeny。";
	mes "いかがなさいます？";
	next;
	if(select("買います","遠慮します")==2) {
		mes "[ウェディングハッピー]";
		mes "そうですか～。";
		mes "月日は流れても、共に過ごした";
		mes "思い出が色あせることはないでしょう。";
		mes "また気が向きましたら、遠慮なく";
		mes "おっしゃってくださいね。";
		close;
	}
	if(Zeny < 50000) {
		mes "[ウェディングハッピー]";
		mes "「新婚時代の思い出」は";
		mes "50,000Zenyになります。";
		mes "あらら～、お金が足りないようですね。";
		mes "お連れの方にお願いしてみては";
		mes "いかがです～？";
		close;
	}
	set Zeny,Zeny-50000;
	getitem 681,1;
	mes "[ウェディングハッピー]";
	mes "ありがとうございます～！";
	mes "これは、本当に大切な思い出の場所で";
	mes "大事な人と一緒に使ってくださいね。";
	close;
}

//============================================================
// 宿泊施設NPC
//------------------------------------------------------------
jawaii.gat,141,200,4	script	従業員	798,{
	mes "[アルロワ]";
	mes "あの……";
	mes "こちらはスイートルームです。";
	mes "ぜ、是非、来てください。";
	mes "はい、もちろんきれいです。";
	mes "私がきちんと片付けておきましたから。";
	mes "だから、どうぞご利用ください。";
	next;
	mes "[アルロワ]";
	mes "宿泊料は一人当たり";
	mes "えーっと……";
	mes "あ、1000Zenyです。";
	mes "私にくだされば、すぐお部屋へ";
	mes "ご案内します。ほ、本当ですよ。";
	mes "それ以外入る方法はありませんから。";
	next;
	mes "[アルロワ]";
	mes "あ、かばん。";
	mes "それ、私がお持ちしますよ。";
	mes "あの、そうしないとうちの社長に";
	mes "三段掌で殴られます……";
	mes "社長の拳、すごく痛いんですよ。";
	next;
	if(select("利用します","やめます")==2) {
		mes "[アルロワ]";
		mes "うわ～ん、うわ～ん。";
		mes "他の部屋よりもすごく";
		mes "きれいで良いのに～。";
		mes "私の言葉を信じてくださいよ～。";
		mes "もし少しでも、考えが変わりましたら";
		mes "すぐに来てくださいね。うわ～ん。";
		close;
	}
	if(Zeny < 1000) {
		mes "[アルロワ]";
		mes "もう、お客さん！";
		mes "宿泊料をきちんと確認してください。";
		mes "所持金も確認してください。";
		mes "宿泊料が足りないと利用できません。";
		mes "うちの社長が怒ります！";
		mes "うちの社長が三段掌で、殴ります!!";
		close;
	}
	mes "[アルロワ]";
	mes "わあ～、ありがとう！";
	mes "はい、どうぞご利用ください。";
	mes "ありがとう。ありがとう。";
	mes "楽しい時間をお過ごしください。";
	close2;
	set Zeny,Zeny-1000;
	warp "jawaii_in.gat",116,64;
	end;
}

jawaii.gat,108,199,5	script	従業員	74,{
	mes "[パーインオレン]";
	mes "ようこそ。";
	mes "こちらはアンティークルームです。";
	mes "古風で素晴らしいお部屋ですよ。";
	mes "お二人が泊まるには、少々";
	mes "手狭に見えるかもしれませんが、";
	mes "内部はとても素敵ですよ。";
	next;
	mes "[パーインオレン]";
	mes "宿泊料はお一人様1000Zenyです。";
	mes "お支払いは前払いとさせて頂きます。";
	mes "わざわざこの様な場所まで";
	mes "いらっしゃったのですから";
	mes "素敵なお部屋をご選択された方が";
	mes "良いと思いますよ。";
	next;
	mes "[パーインオレン]";
	mes "ご利用なさるのでしたら";
	mes "遠慮なくおっしゃってください。";
	mes "すぐご案内いたします。";
	next;
	if(select("利用します","やめます")==2) {
		mes "[パーインオレン]";
		mes "それでは観光をお楽しみください。";
		mes "お客様のご利用をいつでも";
		mes "お待ちしております。";
		close;
	}
	if(Zeny < 1000) {
		mes "[パーインオレン]";
		mes "申し訳ございません。";
		mes "お金が少々足りないようです。";
		mes "再度、所持金を確認なさってから";
		mes "お越しください。";
		close;
	}
	mes "[パーインオレン]";
	mes "ご利用ありがとうございます。";
	mes "楽しい一時をお過ごしください。";
	close2;
	set Zeny,Zeny-1000;
	warp "jawaii_in.gat",129,110;
	end;
}

jawaii.gat,107,189,6	script	従業員	93,{
	mes "[シャルキラニア]";
	mes "……ハニールームです。";
	mes "宿泊料は1000Zenyです。";
	next;
	mes "[シャルキラニア]";
	mes "……利用しますか？";
	next;
	if(select("利用します","やめます")==2) {
		mes "[シャルキラニア]";
		mes "……そうですか。";
		close;
	}
	if(Zeny < 1000) {
		mes "[シャルキラニア]";
		mes "……お金が足りません。";
		close;
	}
	mes "[シャルキラニア]";
	mes "……どうぞ。";
	close2;
	set Zeny,Zeny-1000;
	warp "jawaii_in.gat",86,117;
	end;
}

jawaii.gat,112,173,0	script	従業員	93,{
	mes "[ラクスラニア]";
	mes "シャルキ……";
	mes "そんな顔してたら駄目じゃないの。";
	mes "もう少し愛想良くしなさいよ。";
	mes "そんなんだからお客さん達が";
	mes "不愉快に思うんじゃない。";
	next;
	mes "[ラクスラニア]";
	mes "……あら、お客さん！";
	mes "いらっしゃいませ。";
	mes "ご旅行でいらしたのですか？";
	next;
	mes "[ラクスラニア]";
	mes "こちらはビラルームです。";
	mes "ご自宅の様にくつろげますよ。";
	mes "宿泊料は他の部屋同様";
	mes "1000Zenyになります。";
	next;
	mes "[ラクスラニア]";
	mes "お望みならば、";
	mes "すぐにご案内いたします。";
	mes "どうなさいますか？";
	next;
	if(select("利用します","やめます")==2) {
		mes "[ラクスラニア]";
		mes "了解しました。";
		mes "もしよろしければ";
		mes "隣のハニールームに";
		mes "行ってみてはいかがでしょう。";
		mes "シャルキが少々、無愛想ですが";
		mes "お部屋はきれいですので。";
		close;
	}
	if(Zeny < 1000) {
		mes "[ラクスラニア]";
		mes "あら？";
		mes "宿泊料が不足しているようですね。";
		mes "お連れの方にお願いしてみては";
		mes "どうです？ウフフ。";
		close;
	}
	mes "[ラクスラニア]";
	mes "ありがとうございます。";
	mes "ごゆっくりなさってください。";
	mes "よいご旅行になりますように。";
	close2;
	set Zeny,Zeny-1000;
	warp "jawaii_in.gat",87,75;
	end;
}

//============================================================
// 秘密酒場NPC
//------------------------------------------------------------
jawaii_in.gat,28,96,0	script	JawaiiWaitress	139,3,3,{
	for(set '@i,0; '@i<8; set '@i,'@i+1) {
		if(PartnerID)
			emotion 30,"JawaiiWaitress0"+'@i;
		else
			emotion 23,"JawaiiWaitress0"+'@i;
	}
	end;
}

jawaii_in.gat,28,96,0	script	JawaiiWaitress#dummy	724,{	//同一セル封鎖ためのダミー
	end;
OnInit:
	hideonnpc;
	end;
}

jawaii_in.gat,25,94,0	script	従業員::JawaiiWaitress00	724,{
	mes "[従業員トリト]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員トリト]";
		mes "最近、変な人を見かけるんですよ。";
		mes "飲みに来ているだけなら";
		mes "いいんですけどね……";
		next;
		mes "[従業員トリト]";
		mes "お二方のご結婚";
		mes "お祝い申し上げます～。";
		mes "お幸せに～！";
	}
	else {
		mes "[従業員トリト]";
		mes "どうぞ楽しい一時をお過ごしください。";
		mes "でもあまり飲み過ぎないでくださいね。";
	}
	close;
}

jawaii_in.gat,25,96,0	script	従業員::JawaiiWaitress01	724,{
	mes "[従業員パイ]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員パイ]";
		mes "ここはけっこう静かなので、";
		mes "おくつろぎになれると思います。";
		mes "でもたまにソロ軍団と称する";
		mes "騒がしい人達が来るんですけどね。";
		next;
		mes "[従業員パイ]";
		mes "お二方のご結婚";
		mes "お祝い申し上げます～。";
		mes "楽しい思い出をたくさん";
		mes "作ってくださいね～。";
	}
	else {
		mes "[従業員パイ]";
		mes "楽しんでくださいね～！";
		mes "でも、幸せな人々の邪魔は";
		mes "しないでくださいね!!";
	}
	close;
}

jawaii_in.gat,25,98,0	script	従業員::JawaiiWaitress02	724,{
	mes "[従業員ボビ]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員ボビ]";
		mes "あ～、うらやまし～な～。";
		mes "私も早く結婚したい～！";
	}
	else {
		mes "[従業員ボビ]";
		mes "うわ？";
		mes "外の人??";
		mes "あの～、恋人はいないんですか？";
		mes "……あ、ちなみに私";
		mes "料理が得意なんですよ～。";
		mes "どうです？今度お茶しません？";
	}
	close;
}

jawaii_in.gat,25,100,0	script	従業員::JawaiiWaitress03	724,{
	mes "[従業員イト]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員イト]";
		mes "幸せそう……";
		mes "いいな……";
		mes "ソロ軍団に邪魔されないように";
		mes "気をつけてお楽しみください～。";
	}
	else {
		mes "[従業員イト]";
		mes "妨害禁止！騒動禁止！";
		mes "泥酔禁止！祝福歓迎！";
	}
	close;
}

jawaii_in.gat,30,94,4	script	従業員::JawaiiWaitress04	724,{
	mes "[従業員ルカ]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員ルカ]";
		mes "結婚おめでとう～！";
		mes "幸せそうなお二人を見ていると";
		mes "とても気分がいいです。";
		mes "それに引き換えソロ軍団の";
		mes "酒癖といったら…はぁ～。";
		mes "お二方も気をつけてくださいね。";
	}
	else {
		mes "[従業員ルカ]";
		mes "……歓迎……";
		mes "……できないです！";
		mes "くれぐれも迷惑は";
		mes "かけないでくださいね！";
	}
	close;
}

jawaii_in.gat,30,96,4	script	従業員::JawaiiWaitress05	724,{
	mes "[従業員ケン]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員ケン]";
		mes "この頃、変な人を見かけるので";
		mes "ちょっと心配です……";
		mes "そのせいもあってカプラ職員を";
		mes "島に呼びにくくて……";
	}
	else {
		mes "[従業員ケン]";
		mes "どうぞお楽しみください。";
		mes "でもお酒はほどほどにね。";
	}
	close;
}

jawaii_in.gat,30,98,4	script	従業員::JawaiiWaitress06	724,{
	mes "[従業員アマド]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員アマド]";
		mes "火炎放射器のように";
		mes "あつあつのカップルですね～。";
		mes "おめでとう～。";
	}
	else {
		mes "[従業員アマド]";
		mes "……ちょっと場違いじゃないですか？";
		mes "ここでは楽しみづらいでしょ。";
		mes "でもだからといって、";
		mes "人の邪魔はしないでくださいね～。";
	}
	close;
}

jawaii_in.gat,30,100,4	script	従業員::JawaiiWaitress07	724,{
	mes "[従業員ビア]";
	mes "ジャワイの酒場へようこそ～！";
	next;
	if(PartnerId) {
		mes "[従業員ビア]";
		mes "月明かりに輝く剣のように";
		mes "お二方はとてもお似合いですね！";
	}
	else {
		mes "[従業員ビア]";
		mes "アクセルに対するブレーキのごとく";
		mes "この雰囲気に水をさしてません？";
		mes "是非、恋人を見つけてから";
		mes "お越しください～。";
	}
	close;
}

jawaii_in.gat,43,115,0	script	お客さん	97,{
	if(PartnerId) {
		mes "[ブル]";
		mes "……幸せそうだな。";
		mes "その気持ちを忘れるなよ！";
		mes "おい、絶対だぞ！";
		close;
	}
	if(Zeny < 100) {
		mes "[ブル]";
		mes "クウッ……";
		mes "ん？君、お金がないのか？";
		mes "……うんうん、その気持ち。";
		mes "僕も分かるよ。";
		next;
		mes "[ブル]";
		mes "仕方ないな、おごってやろう！";
		mes "ほら、一緒に飲もう!!";
		next;
		mes "[ブル]";
		mes "この一杯で、人生をパーッと";
		mes "明るくしよう!!";
		mes "さあ元気を出して!";
		mes "こんな所でくじけてはいけないよ！";
		next;
		mes "- 彼はJJスペシャルを勧めてきた。 -";
		mes "- 「幸せになるぞー!!」 -";
		mes "- と思いっきり叫び -";
		mes "- グイと勢いよく飲んだ。 -";
		close2;
		percentheal -100,0;
		end;
	}
	mes "[ブル]";
	mes "クウーッ!!";
	mes "こんな所に来るんじゃなかった！";
	mes "はぁ～……";
	mes "みーんな幸せそうにしてるな……";
	mes "それに比べて僕は……";
	next;
	mes "[ブル]";
	mes "……恋人がいない人は";
	mes "すーっごく惨めなんだよ!!";
	mes "君も、君も同じだよね？";
	mes "わかるよね!?";
	next;
	mes "[ブル]";
	mes "クウッ……";
	mes "おい!!もう一杯!!";
	close;
}

jawaii_in.gat,41,106,2	script	お客さん	98,{
	if(PartnerId) {
		mes "[ガイ]";
		mes "……チッ。";
		mes "貴様はどうなんだ?!";
		mes "人生は一人で歩むものだよな？";
		next;
		mes "[ガイ]";
		mes "俺は誰も信じないぞ！";
		mes "俺だけの道を進んでやる!!";
	}
	else {
		mes "[ガイ]";
		mes "食べて、食べて!!";
		mes "飲んで、飲んで!!";
		next;
		mes "[ガイ]";
		mes "ウオーッ！";
		mes "ラブラブカップルのバカヤロー!!";
		mes "自由気ままなシングルバンザーイ！";
	}
	close;
}

jawaii_in.gat,15,104,2	script	従業員	80,{
	if(PartnerId) {
		emotion 30;
		mes "[従業員]";
		mes "いらっしゃいませ。";
		mes "何をお望みでしょうか？";
		next;
		switch(select("食べ物をください","飲み物をください","ここは何をやっているとこです？")) {
		case 1:
			mes "[従業員]";
			mes "にく1個";
			set '@itemid,517;
			break;
		case 2:
			mes "[従業員]";
			mes "黄ポーション1個";
			set '@itemid,503;
			break;
		case 3:
			mes "[従業員]";
			mes "お酒をお望みでしたら";
			mes "まっすぐ中央へお進みください。";
			mes "あ、でも……";
			mes "飲み過ぎには注意してくださいね。";
			mes "ほどほどに飲んで語るのがいいんです。";
			mes "では楽しい一時を～！";
			close;
		}
		mes "1000Zenyになります～。";
		mes "いかがなさいます？";
		next;
		if(select("いただきます","高い！……遠慮します")==2) {
			mes "[従業員]";
			mes "何かございましたら、";
			mes "いつでもおっしゃってくださいね～。";
			close;
		}
		if(Zeny < 1000) {
			mes "[従業員]";
			mes "あの……";
			mes "お金が足りないんですけど……";
			close;
		}
		mes "[従業員]";
		mes "こちらになります～。";
		mes "どうぞお召しあがりください。";
		set Zeny,Zeny-1000;
		getitem '@itemid,1;
		close;
	}
	emotion 23;
	mes "[従業員]";
	mes "……いらっしゃいませ。";
	mes "どうやってここまで";
	mes "いらっしゃったのかは知りませんが……";
	next;
	mes "[従業員]";
	mes "幸せな人々に訳もなく";
	mes "言い寄って邪魔するくらいなら";
	mes "あそこのバーで酒でも";
	mes "飲んでなさい！";
	next;
	if(select("私たちはソロ軍団だ!!","……お祝いに来たんですが……")==1) {
		mes "[従業員]";
		mes "なんて人なんでしょう!?";
		mes "たとえ他人の幸せであっても";
		mes "少し位は祝ってあげてもいいでしょ！";
		mes "ソロ軍団だ何だと言って騒ぐ気なら……";
		mes "ちょっとこっちへ来なさい!!";
		next;
		mes "[従業員]";
		mes "……いいですか？";
		mes "きちんと相手を見つけて";
		mes "結婚してから、お越しください。";
		mes "そうすればちゃんと";
		mes "おもてなしをしますから。";
		close;
	}
	mes "[従業員]";
	mes "あ、わざわざお祝いで";
	mes "いらっしゃったのですか。";
	mes "申し訳ありませんでした!!";
	mes "私ってばとんでもない誤解を……";
	mes "それではどうぞお楽しみください～。";
	close;
}

jawaii_in.gat,28,124,2	script	バーテンダー	46,{
	mes "[バーテンダー]";
	mes "いらっしゃいませ。";
	mes "お客さん、何になさいますか？";
	next;
	if(Zeny < 100) {
		mes "[バーテンダー]";
		mes "うーん、お客さん。";
		mes "お金が足りないですね。";
		mes "申し訳ありませんが、当店は";
		mes "無料のお酒を置いていませんので。";
		close;
	}
	set Zeny,Zeny-100;
	while(1) {
		set @menu,select("マスターのお勧め","ミシェル","オールドフレンズ","ミサ","パンランズ");
		if('@flag && '@drink >= 4) {
			mes "[バーテンダー]";
			mes "……これは私のおごりです。";
			close2;
			percentheal -100,0;
			end;
		}
		switch(@menu) {
		case 1:
			if('@drink >= 4 || ('@flag && '@drink == 3)) {
				mes "[バーテンダー]";
				mes "どうぞお召し上がりください。";
				mes "……大丈夫ですか？";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "マスター、辛いよ……";
				mes "だってさ……";
				input '@dummy$;
				mes '@dummy$;
				mes "なんだよ……";
				next;
				mes "[バーテンダー]";
				mes "……では、私のお勧め";
				mes "^0000FFJ&Jスクリュードライバーver.5^000000";
				mes "をどうぞ。";
				mes "これは私のおごりです。";
				close2;
				percentheal -100,0;
				end;
			}
			switch(rand(4)) {
			case 0:
				mes "[バーテンダー]";
				mes "私がお勧めするものはですね……";
				next;
				mes "[バーテンダー]";
				mes "^0000FFホワイトマグナム^000000です。";
				mes "スライスしたレモン独特の香りが";
				mes "しますが、それはまやかし……";
				mes "少し飲んで見ると分かりますよ。";
				mes "実はモロクの魂がベースなんです。";
				next;
				mes "- 少量のレモン汁が塗られた -";
				mes "- 逆三角形のグラスを受けとった。 -";
				mes "- やや酸っぱい香りが漂っている。 -";
				mes "- 一気に飲むのはなんとなく -";
				mes "- 危険な気がする。 -";
				next;
				mes "[バーテンダー]";
				mes "やや酸っぱめの爽やかな味なので";
				mes "女性に人気があります。";
				mes "モロク風の香りもしますよ。";
				next;
				mes "- 何故かソンブレロを無性に -";
				mes "- 被りたくなった。 -";
				mes "- その勢いで口の中へお酒を -";
				mes "- 一気に放り込んだ。 -";
				misceffect 17,"";
				break;
			case 1:
				mes "[バーテンダー]";
				mes "それでは……";
				mes "こんなのはどうでしょうか？";
				next;
				mes "[バーテンダー]";
				mes "私のお勧め";
				mes "^0000FFキスオブファイアー^000000です。";
				mes "甘い香りと独特の赤色に酔っていると";
				mes "……気づいたら目を回してひっくり";
				mes "返っていたなんてことが";
				mes "あるかもしれません。";
				next;
				mes "- 少量の砂糖がついている -";
				mes "- 逆三角形のグラスを受け取った。 -";
				mes "- 甘い香りが漂っている。 -";
				mes "- 一気に飲むのはなんとなく -";
				mes "- 危険な感じがする。 -";
				next;
				mes "[バーテンダー]";
				mes "口をつけるその瞬間が重要です。";
				mes "甘い砂糖が唇の上を軽やかに";
				mes "走り回るような味がよいのです。";
				next;
				mes "- 唇の位置に気をつけて -";
				mes "- ゆっくり飲んだ。 -";
				misceffect 38,"";
				break;
			case 2:
				mes "[バーテンダー]";
				mes "うん、これはどうでしょうか？";
				next;
				mes "[バーテンダー]";
				mes "私のお勧め^0000FFブラックジャック^000000です。";
				mes "懐かしい思い出と後悔の気持ちが";
				mes "盛られた海賊のカクテルです。";
				next;
				mes "- 小さなグラスに注がれた -";
				mes "- 黒みがかった紫色の液体を眺めた。";
				mes "-";
				mes "- 一口で飲みきれる程少ない量だ。 -";
				mes "- だが危険な雰囲気が漂っている。 -";
				next;
				mes "[バーテンダー]";
				mes "火をつけると激しく";
				mes "燃え上がるほど濃いお酒です。";
				mes "一気に飲み干そうとすると";
				mes "喉が焼けるような感じになりますよ。";
				next;
				mes "- 一気に飲み干した。 -";
				misceffect 124,"";
				break;
			case 3:
				mes "[バーテンダー]";
				mes "これはどうでしょうか？";
				next;
				mes "[バーテンダー]";
				mes "私のお勧め^0000FFミッドガルド^000000です。";
				mes "雄大なミッドガルド大陸の";
				mes "大地の温もりが感じられる";
				mes "カクテルです。";
				next;
				mes "- 少し大きめのグラスに氷と一緒に -";
				mes "- 注がれた黒色の液体を眺めた。 -";
				mes "- 少々甘い香りが漂う。だが -";
				mes "- 立派なひげを生やした筋肉質の -";
				mes "- おじさんのような匂いもする。 -";
				next;
				mes "[バーテンダー]";
				mes "香りを楽しみながら";
				mes "少しずつ飲むとよいですよ。";
				mes "少し苦めの味がしますがね。";
				mes "これはミッドガルドの男達が";
				mes "好んで飲むものなんです。";
				next;
				mes "- 少しずつ味わいながら飲んだ。 -";
				misceffect 118,"";
				break;
			}
			set '@flag,1;
			percentheal -20,0;
			break;
		case 2:
			mes "[バーテンダー]";
			mes "どうぞ、こちらになります。";
			next;
			mes "[バーテンダー]";
			mes "好きな異性の気を引きたい時は";
			mes "これをお選びください。";
			mes "独特の香りと細やかながらも";
			//mes "毒毒しい味を持つこれは、";	//本鯖仕様
			mes "毒々しい味を持つこれは、";
			mes "あなたの個性を引き立てるでしょう。";
			next;
			mes "- シンプルなグラスに注がれた -";
			mes "- 白い液体を見た。少々甘辛い -";
			mes "- 匂いがするがおいしそうだ。 -";
			mes "- 思わず「うまい!」と -";
			mes "- 叫びたくなるかもしれない。 -";
			next;
			mes "[バーテンダー]";
			mes "甘辛い味ですが、";
			mes "やや苦めのこれこそが人生だ";
			mes "とおっしゃる方が多いですね。";
			mes "舌を使いながら少しずつ";
			mes "ゆっくり飲むとよいですよ。";
			next;
			mes "- 舌を使って -";
			mes "- 少しずつ飲んでみた。 -";
			next;
			mes "- 感想はやはり -";
			mes "- 「うまい!!」 -";
			misceffect 18,"";
			break;
		case 3:
			mes "[バーテンダー]";
			mes "どうぞ、こちらになります。";
			next;
			mes "[バーテンダー]";
			mes "飲めば飲むほど深い味がします。";
			mes "古い友人みたいなものですね。";
			mes "いつでも誰とでも";
			mes "どんな食べ物にも合います。";
			next;
			mes "- 目の前の派手なグラスに -";
			mes "- 鮮やかな青色の液体が注がれた。 -";
			mes "- やや酸っぱい香りが鼻を刺激する。";
			mes "-";
			next;
			mes "[バーテンダー]";
			mes "少しずつ味わうことで";
			mes "深みが増していくものです。";
			mes "これは一口で終わらせるには";
			mes "とても惜しい物ですね。";
			next;
			mes "- 三度に分けて飲んでみた。 -";
			mes "- 口の中一杯に甘酸っぱい香りが -";
			mes "- 広がる。本当においしい。 -";
			misceffect 83,"";
			break;
		case 4:
			mes "[バーテンダー]";
			mes "どうぞ、こちらになります。";
			next;
			mes "[バーテンダー]";
			mes "激動の時代、";
			mes "その当時の栄光を懐かしむ人……";
			mes "混沌の中で秩序の為に闘った者達の";
			mes "記憶を振り返る人……";
			mes "そして……セピア色のロマンが";
			mes "解る方々にお勧めしています。";
			next;
			mes "- 茶色い液体がタンブラーに -";
			mes "- 注がれた。ねばねばした -";
			mes "- 深い香りがする。-";
			mes "- ……弾薬の匂いに似ている。 -";
			mes "- まるで巨大な機械がその場に -";
			mes "- あるかのような印象を受けた。 -";
			next;
			mes "[バーテンダー]";
			mes "大きいグラスですが、";
			mes "一口で飲み切った方がいいですよ。";
			mes "ゆっくり飲むと、せっかくの激しい";
			mes "味がぬるくなってしまいますからね。";
			next;
			mes "- タンブラーをしっかり持ち -";
			mes "- 一気に飲み干した。 -";
			next;
			mes "- 巨大な砲撃を受けたような -";
			mes "- 衝撃が走った。 -";
			misceffect 106,"";
			break;
		case 5:
			mes "[バーテンダー]";
			mes "どうぞ、こちらになります。";
			next;
			mes "[バーテンダー]";
			mes "こちらを選ぶ方は本当に珍しいです。";
			mes "派手な色で量も多いのですが……";
			mes "実際に飲んだ後は、とても虚しく";
			mes "暗い気持ちだけが残ります。";
			next;
			mes "- 曲がったグラスに -";
			mes "- 薄紫色の液体が注がれた。 -";
			mes "- 香ばしいが、何故か -";
			mes "- 不気味な感じがする。 -";
			mes "- そのせいなのか微妙に -";
			mes "- 拒否感がある。 -";
			next;
			mes "[バーテンダー]";
			mes "もし召し上がれそうにないのでしたら";
			mes "他のお酒をご提供しますが……";
			mes "ご自分で注文なさったのですから";
			mes "一度お飲みになるのも";
			mes "いいかもしれませんね。";
			next;
			mes "- 一口飲んでみた。 -";
			mes "- ……!! -";
			mes "- すぐに吐き出してしまった。 -";
			misceffect 5,"";
			break;
		}
		if(@menu>1) {
			percentheal -10,0;
			if(@menu==5) {
				next;
				mes "- 二度と飲む気にはなれなかった。 -";
			}
		}
		set '@drink,'@drink+1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "マスター……もう一杯……";
		next;
	}
}
