//= Athena Script ==============================================================
// Ragnarok Online Umbala Town Script	by かる・Kalen
//==============================================================================

//============================================================
// Shop
//------------------------------------------------------------
um_in.gat,104,124,3	shop	道具商人	788,512,515,535,516,513,517,528,537,601,602,645,656,610
um_in.gat,160,125,3	shop	武器商人	789,1501,1504,1507,1510,1513,1519,1807,1811,1809

//============================================================
// コモドNPC
//------------------------------------------------------------
comodo.gat,170,137,7	script	ラエド	84,{}

comodo.gat,171,137,1	script	ヘイス	92,{
	mes "[ラエド]";
	mes "ものすごい宝が、隠されているに";
	mes "違いない！";
	next;
	mes "[ヘイス]";
	mes "宝物を探せ出したら、私達を";
	mes "「馬鹿コンビ」と呼ぶ人も";
	mes "いなくなるね!!";
	next;
	mes "[ラエド]";
	mes "僕達も宝を探しに行こう！";
	next;
	emotion 29,"ラエド";
	emotion 29;
	mes "[ヘイス]";
	mes "そうしようー!!";
	next;
	mes "[ラエド]";
	mes "………………";
	next;
	emotion 20,"ラエド";
	emotion 20;
	mes "[ラエド]";
	mes "けど、あいつがそう簡単に教えて";
	mes "くれるのかなぁ？";
	next;
	menu "何のこと？宝物？",-;
	mes "[ラエド]";
	mes "わっ、いつから聞いていたんだ?!";
	next;
	emotion 29;
	mes "[ヘイス]";
	mes "え、あなたも宝物の話が聞きたいの？";
	mes "もちろん、重要なことを知る為には";
	mes "それなりの物が必要だって";
	mes "こと……分かってるよね？";
	next;
	emotion 29,"ラエド";
	emotion 29;
	mes "[ラエド、ヘイス]";
	mes "1000Zenyくれたら、";
	mes "教えてあげるよ！";
	next;
	if(select("1000Zenyを払う","払わない")==2) {
		emotion 20,"ラエド";
		emotion 20;
		mes "[ヘイス]";
		mes "ふん！嫌なら、あっちへ行って！";
		close;
	}
	if(Zeny < 1000) {
		mes "[ラエド]";
		mes "ふん！お金がないんなら、";
		mes "情報は教えられないね。";
		close;
	}
	set Zeny,Zeny-1000;
	mes "[ヘイス]";
	mes "ふふ、本当は友達にしか教えないこと";
	mes "なんだけどね！";
	next;
	mes "[ラエド]";
	mes "……実はこの間、この村の有名な";
	mes "冒険家ニルスが旅行から帰って";
	mes "来たんだ。で、その時のこと";
	mes "なんだけど、";
	next;
	mes "[ヘイス]";
	mes "(小声で)";
	mes "両手に大きな箱を持っていたの。";
	next;
	mes "[ラエド]";
	mes "密かに真夜中に帰って来たってことは、";
	mes "他人に見られたくないってことだろ？";
	next;
	mes "[ヘイス]";
	mes "大きな箱に入った貴重なもの……";
	mes "これはもう、宝物しか";
	mes "有り得ないでしょ!!";
	next;
	mes "[ラエド]";
	mes "それで僕達も宝を探しに行こうー";
	mes "ってわけさ!!";
	next;
	emotion 20;
	mes "[ヘイス]";
	mes "けど問題は、ニルスが私達に";
	mes "宝物がある場所を教えてくれるの";
	mes "かってこと……";
	next;
	mes "[ラエド]";
	mes "ニルスはいつも、僕達をバカに";
	mes "するんだよ!!もう!!";
	next;
	menu "そのニルスという人は、どこにいるの？",-;
	mes "[ラエド]";
	mes "村の北にいるよ。";
	next;
	mes "[ヘイス]";
	mes "いいことを教えてあげたんだから、";
	mes "あなたも何か分かったら絶対、";
	mes "教えてよね！";
	next;
	mes "[ラエド、ヘイス]";
	mes "それじゃ、頑張ってねー！";
	close;
}

cmd_in01.gat,175,120,3	script	イリヤ	69,{
	mes "[イリヤ]";
	mes "あそこの隅のテーブルにいらっしゃる";
	mes "方が、冒険家のニルスさんです。";
	mes "あちこち旅行をしているらしく、面白い";
	mes "話をたくさんしてくださるそうです。";
	next;
	mes "[イリヤ]";
	mes "今度は一体、どこに行って来たのか……";
	mes "「やはり俺は、人に教えるのが";
	mes "苦手なようだ」と言いながら";
	mes "「はっはっはっ」と笑うだけなのです。";
	next;
	mes "[イリヤ]";
	mes "何故か、ニルスさんを訪ねてくる人が";
	mes "後を絶ちません……本当に一体、どこに";
	mes "行って来たのでしょうね？";
	close;
}

cmd_in01.gat,164,115,1	script	ニルス	731,{
	mes "[ニルス]";
	mes "……うん？何？";
	mes "ああー、お前もあの変なデマを聞いて";
	mes "来た馬鹿か？まぁ、無理もないか……";
	mes "くっくっくっく。";
	next;
	mes "[ニルス]";
	mes "世界最高の宝物うんぬん話は、みんなの";
	mes "誤解なんだよ。宝物みたいなものでは";
	mes "なく、実際は俺のコレクション";
	mes "だったってだけだよ。";
	next;
	mes "[ニルス]";
	mes "だけどな……「そこ」が実際に存在した";
	mes "という事実……その事実を俺の二つの目";
	mes "が確認したってだけでも、貴重な宝石を";
	mes "得たのと同じかもしれないだろう。";
	next;
	mes "[ニルス]";
	mes "ここ！この村コモド！";
	mes "何故か洞窟が小さすぎると思わないか？";
	next;
	mes "[ニルス]";
	mes "それで俺は考えたんだよ……隠された";
	mes "何かがあるんじゃないかって……";
	next;
	mes "[ニルス]";
	mes "それで！結局、探すことにしたのさ。";
	mes "今まで誰も見つけることができなかった";
	mes "「そこ」へ行くための道を!!";
	next;
	mes "[ニルス]";
	mes "……………………";
	next;
	mes "[ニルス]";
	mes "…………おい？";
	next;
	emotion 20;
	mes "[ニルス]";
	mes "こういう時、「ドドン!!」ていう";
	mes "效果音でも出るとこなんじゃないか?!";
	mes "つまんねぇな……";
	next;
	mes "[ニルス]";
	mes "は？お前、俺に「そこ」へどうやって";
	mes "行くのか、「そこ」に何があるって";
	mes "聞く気か!?";
	next;
	mes "[ニルス]";
	mes "俺がここまで喋ったんだから!!";
	mes "本当の探険家なら!!!!";
	next;
	mes "[ニルス]";
	mes "「あああああっ！早く知りたくてしょう";
	mes "がない!!」という顔で、すぐに門を";
	mes "蹴飛ばして走って行く！";
	mes "そして動物のような感覚と本能で";
	mes "「そこ」を自力で探し出すんだ!!";
	next;
	mes "[ニルス]";
	mes "さあ！早く！行け!!!!!!";
	next;
	mes "[ニルス]";
	mes "お前が見つけるのは、眩しい未知の";
	mes "世界か!?もしくは、死への落とし穴か!?";
	mes "くはっはっはっ!!!!";
	close;
}

//============================================================
// ウンバラNPC
//------------------------------------------------------------
umbala.gat,177,153,3	script	パスト	97,{
	emotion 0;
	mes "[パスト]";
	mes "うわっ！人間じゃないですか！";
	mes "こんな人里離れた所で人間に";
	mes "出会えるとは！とても嬉しいですね。";
	mes "私はパストと言います。";
	next;
	mes "[パスト]";
	mes "ここは、ウンバラと言う村です。";
	mes "こんな深い森の中にあるせいか、";
	mes "他の村とは全然違った文化圏を";
	mes "形成しています。";
	next;
	mes "[パスト]";
	mes "肌の色も違いますし、言語も私達が";
	mes "読み書きするものとは、全く違います";
	mes "ね。何より、一番戸惑ったのは彼らの";
	mes "感情表現が私達と違うことでした。";
	next;
	mes "[パスト]";
	mes "もちろん似ている点もあります。";
	mes "しかし、いくつかの事項に気を付け";
	mes "なければ、困ったことにになるかも";
	mes "しれません。いいですか？";
	next;
	mes "[パスト]";
	mes "彼らの顔が笑っているからといって、";
	mes "彼らの心も笑っていると思っては";
	mes "いけないのです。分かります？";
	next;
	emotion 28;
	mes "[パスト]";
	mes "もし言葉が通じていたら……私達の";
	mes "言語を知っている人は悩むでしょう……";
	mes "息苦しくてね……!!";
	close;
}

umbala.gat,92,159,4	script	ベルタン	785,{
	if(UM_1QUE < 3) {
		mes "[？？？？]";
		mes "ウムバウムバウムバウムバ";
		mes "ウムバウムバウムバウムバ";
		mes "ウムバウムバウムバウムバ。";
		next;
		mes "[？？？？]";
		mes "ウムバウムババウングホ。";
		emotion 28;
		close;
	}
	mes "[ベルタン]";
	mes "ウンバラの住民の肌は、";
	mes "どうして真っ黒いのかなぁ？";
	mes "…………";
	next;
	mes "[ベルタン]";
	mes "そっか！";
	mes "ウンバラの人は、毎日寝る前に";
	mes "チョコを食べるからなんだ！";
	next;
	mes "[ベルタン]";
	mes "チョコはおいしいもんね～。";
	emotion 28;
	close;
}

umbala.gat,140,157,6	script	ウータン族の青年	785,{
	if(UM_1QUE < 3) {
		mes "[？？？？？]";
		mes "ウムバウムバフムバ。";
		mes "ウウムバウムバウムババウフムバ";
		mes "ウムバババウムバウムバ。";
		close;
	}
	mes "[セイルタン]";
	mes "バンジージャンプはすごく危ない。";
	mes "命がけなんだ。だからそれを";
	mes "成功させた人は、ウータン族の大人";
	mes "として認定を受けるんだ。";
	close;
}

umbala.gat,146,157,4	script	ウータン族の青年	786,{
	if(UM_1QUE < 3) {
		mes "[？？？？]";
		mes "ウムバウムバウムババウムババ。";
		mes "ウムバウムババウムバババウムフムバ。";
		close;
	}
	mes "[アロタン]";
	mes "バンジージャンプを無事に成功させる";
	mes "のは、とても大変。だから、無事に成功";
	mes "させた人を祝うために、たくさんの人が";
	mes "集まって宴会を開くんです。";
	close;
}

umbala.gat,149,165,4	script	ウータン族の子供	781,{
	if(UM_1QUE<3) {
		mes "[？？？？？？]";
		mes "ウムバウムバウムバババ。";
		mes "ウムバウムバウムウムババウムフムバ。";
		mes "ウムバウムバウムウムバフムバ。";
		close;
	}
	mes "[クリューバタン]";
	mes "あんなに高い所から落ちるのは";
	mes "とても恐ろしいです。ところが";
	mes "私達ウータン族ではあれに挑戦";
	mes "すると、勇気ある者だと";
	mes "認められるのです。";
	close;
}

umbala.gat,194,104,4	script	ウータン族の子供	787,{
	if(UM_1QUE<3) {
		mes "[？？？]";
		mes "ウムバウムバババウムフムバ。";
		mes "ウムババウムウムバウムバウムバ。";
		next;
		if(select("うん","いや")==1) {
			mes "[？？？]";
			mes "ウムバウムウムバウムババ。";
			mes "ウムバウムバウムウムババ。";
			close;
		}
		mes "[？？？]";
		mes "ウムバウムバウムウムバ。";
		mes "ウムバウムバウムババ。";
		mes "ウムバウムフムババウム。";
		close;
	}
	mes "[ブルカタン]";
	mes "外の人？";
	mes "バンジージャンプをしてみたいの？";
	next;
	if(select("うん","いや")==1) {
		mes "[ブルカタン]";
		mes "うわー、外の人がやりたいなんて";
		mes "すごい。ウータン族は、その勇気を";
		mes "歓迎するよ。";
		close;
	}
	mes "[ブルカタン]";
	mes "まだ挑戦する気ないんだ……でも、";
	mes "大人として認められるためには、誰もが";
	mes "通らなきゃいけない道なんだよ。";
	mes "僕ももうちょっと大きくなったら、";
	mes "必ず挑戦して、大人として";
	mes "認めてもらうんだ！";
	close;
}

umbala.gat,193,208,6	script	ウータン族の青年	789,{
	if(UM_1QUE < 3) {
		mes "[？？？？]";
		mes "ウムバウムバウムババ。";
		mes "ウムバウムバフムバウムウムババウム。";
		mes "ウムウムバババウムバフム。";
		close;
	}
	mes "[フェイタン]";
	mes "俺も若い頃、バンジージャンプをした。";
	mes "危うく死にかけたが、成功したよ。その";
	mes "時は、達成感で胸が一杯だった。";
	mes "無謀だと言う人もいるが、けっこういい";
	mes "伝統だよ。若さの証だと思う。";
	close;
}

umbala.gat,139,205,4	script	ウータン族の青年	785,{
	if(UM_1QUE < 3) {
		mes "[？？？？]";
		mes "ウムバウムバ！";
		mes "ウムバウムババババウムウムバ。";
		mes "ババウムウタンウムバウムババ";
		mes "ウムバババフム。";
		mes "ウムフムババウムバウムバウムババ。";
		next;
		mes "[？？？？]";
		mes "ウムバフムマババウムバ。";
		mes "ウムババタンウムバウムバ。";
		mes "ウムム、ウムバウムバウムバウム。";
		mes "ウムババウムバウムバウムウムウム。";
		mes "ウムバウムバウムバフム。";
		close;
	}
	mes "[ツナタン]";
	mes "久しぶりに見る外人だね！";
	mes "ここはバンジージャンプをする所だ。";
	mes "多くのウータン族の若者が、自分の";
	mes "勇気を証明するために飛び降りる所だ。";
	next;
	mes "[ツナタン]";
	mes "これ以上先に進むと落ちるから、";
	mes "覚悟してから行きな。";
	next;
	mes "[ツナタン]";
	mes "落ちた後は、綱を辿って登ることが";
	mes "できる。また、水中をよく探せば、";
	mes "向こう側へ通じる洞窟が見つかる";
	mes "はずだ。けど、たまに運のない人が、";
	mes "そのまま落ちて死ぬ時もある。";
	next;
	mes "[ツナタン]";
	mes "ずっと下を眺めていると、恐怖を感じて";
	mes "気分が悪くなる場合もあるから";
	mes "気をつけな。水中には正体不明の";
	mes "化け物がいるらしいので、長くいると";
	mes "死ぬかもしれない。";
	close;
}

umbala.gat,80,146,4	script	ユーキ	753,{
	mes "[ユーキ]";
	mes "ウムバウムバウガウ……ではなく";
	mes "あなたもやっぱり外の人？";
	mes "わ～嬉しいなぁ！こういう所で外の";
	mes "人に会うとは思わなかったよ。";
	mes "はっはっはっ。";
	next;
	mes "[ユーキ]";
	mes "強い者を捜し回ってここまでやって";
	mes "来たのはいいんだが、言葉が全然";
	mes "通じなくてさ……本当に訳が";
	mes "分からなかったよ。だけど、散々この";
	mes "言葉を聞いたから、さすがに慣れたね。";
	mes "はっはっはっ。";
	next;
	mes "[ユーキ]";
	mes "それより、ここってなんか曖昧なんだ。";
	mes "言葉が通じないのはともかくさ。";
	mes "男達の種族保存の欲求なのか、いたずら";
	mes "好きなのか……いや、本当に浮気者だら";
	mes "けみたいだ。";
	next;
	mes "[ユーキ]";
	mes "なんか原始に近い関係みたいで、法でも";
	mes "そういったものを制限してないよう";
	mes "だし……やっぱ本当に曖昧な感じが";
	mes "すごくするんだよな。";
	close;
}

//============================================================
// ウンバラ室内NPC
//------------------------------------------------------------
um_in.gat,158,71,3	script	ウータン族の住民	787,{
	if(UM_1QUE < 3) {
		mes "[？？？？]";
		mes "ウムバウムバウムババウムハ！";
		mes "ウムバウムバウムバババウムバ";
		mes "ウムバウムバウムバ";
		mes "ウムババウムバウムババ。";
		close;
	}
	mes "[ムタクタン]";
	mes "ウンバラは、木がとーっても多い！";
	mes "僕ムタクタン、木が大好きなの。";
	mes "えヘヘ。";
	next;
	mes "[ムタクタン]";
	mes "その中でも特に大好きな木があるんだ！";
	mes "ウンバラにあるんだけど、僕よりも";
	mes "すっごく大きくて一番長い木！";
	mes "世界中で一番大きいはずだよ！";
	emotion 33;
	next;
	mes "[ムタクタン]";
	mes "あ！本当なんだよ！ものすごく";
	mes "大きくて、とーっても古いみたい。";
	mes "とーっても大きくて、全然てっぺんが";
	mes "見えないの。";
	next;
	mes "[ムタクタン]";
	mes "木をいくら登ってもてっぺんが";
	mes "見えなくて……しょうがないから降りて";
	mes "きちゃった。これでも僕は木登りが得意";
	mes "なんだよ！えっへん！";
	next;
	mes "[ムタクタン]";
	mes "でね、その木の実はおいしいんだ！";
	mes "今までこんなにおいしい実は、食べた";
	mes "ことない。本当だよ！";
	emotion 21;
	next;
	mes "[ムタクタン]";
	mes "ちょっと酸っぱくて甘ったるい……";
	mes "食べるといつの間にか元気になって、";
	mes "気分がとてもよくなる実なんだ!!";
	emotion 21;
	next;
	mes "[ムタクタン]";
	mes "それに不思議なお話もあるの。この間、";
	mes "村のお爺ちゃんがひどい病気になって、";
	mes "死にそうになったんだ。";
	next;
	mes "[ムタクタン]";
	mes "その時に、その木の葉で作った薬を一つ";
	mes "飲んだんだけど……そしたら、急に";
	mes "元気になって起き上がったんだよ!!";
	mes "きっと、その木は森が大好きな";
	mes "ウンバラ族のために、空から";
	mes "やってきた贈り物だと思うんだ。";
	emotion 28;
	next;
	mes "[ムタクタン]";
	mes "村の北にあるから、一度行ってみてよ。";
	mes "そうすればあの木のすごさが分かるよ！";
	close;
}

//============================================================
// 物々交換NPC
//------------------------------------------------------------
umbala.gat,70,106,3	script	ウータン族の子供#1	781,{
	if(UM_1QUE < 3) {
		mes "[？？？]";
		mes "ウムバ。";
		mes "ウムバルウムウムババウムバ。";
		next;
		mes "[？？？]";
		mes "ウムバ！ウムバウムバ！";
		mes "ウムバウムバハタンババ。";
		emotion 28;
		next;
		mes "[ハタン]";
		mes "……ウムバ、ウムバウムバウムバ";
		mes "ウムバウムバウムバウムバババ";
		mes "ウムババウムウムバウムバウムババ";
		mes "ウムバウムバ";
		mes "……ウムバウムバババウムバ……";
		emotion 18;
		next;
		mes "[ハタン]";
		mes "…………！";
		next;
		mes "[ハタン]";
		mes "ウムバ！";
		mes "ウムバウムバウムババウムババ";
		mes "ウムバウムバウムバウムバウムバ！";
		mes "ウムバウムウムウムババウムバ";
		mes "ウムフムバ！ウムバ！";
		emotion 18;
		next;
		if(select("うなずく","首を横に振る")==2) {
			mes "[ハタン]";
			mes "…………ウムバ……";
			emotion 18;
			close;
		}
		mes "[ハタン]";
		mes "ウムバウムバ!!";
		mes "ウム～バウムバ～ウム～バウムバ～";
		mes "ウム～バウムバ～ウム～バウムバ～。";
		if(Zeny < 1000) {
			next;
			mes "[ハタン]";
			mes "……ウムバウムバウムバ!!";
			mes "ウムバウム！";
			emotion 32;
			close;
		}
		set Zeny,Zeny-1000;
		getitem 517,1;
		emotion 19;
		next;
		mes "[ハタン]";
		mes "ウムバウムバウムバウム～。";
		emotion 28;
		close;
	}
	mes "[？？？]";
	mes "あれ？あなたは、";
	mes "私達ウンバラの者じゃないね？";
	next;
	mes "[？？？]";
	mes "びっくりだけど、嬉しい！";
	mes "私はハタン。";
	emotion 28;
	next;
	mes "[ハタン]";
	mes "……でも、残念だけど今は";
	mes "あなたと遊ぶことはできないの。";
	mes "この間、私の家に突然、雷が落ちて";
	mes "屋根が壊れてしまったの……";
	emotion 18;
	next;
	mes "[ハタン]";
	mes "……！";
	next;
	mes "[ハタン]";
	mes "そうだ！ちょっとだけ、お願い";
	mes "していい？あなた達人間はいい生活を";
	mes "してるみたいだから、すこーしお金を";
	mes "わけてくれない？人間族はけっこう";
	mes "余裕があるんじゃないの！お願い！";
	emotion 18;
	next;
	if(select("うなずく","首を横に振る")==2) {
		mes "[ハタン]";
		mes "…………そっか。";
		emotion 18;
		close;
	}
	mes "[ハタン]";
	mes "うわぁっ!!";
	mes "あなたは本当にいい人～！";
	mes "わーい！";
	if(Zeny < 1000) {
		next;
		mes "[ハタン]";
		mes "何よ！ホントは貧しいくせに、";
		mes "お金がある振りをするなんて……";
		emotion 32;
		close;
	}
	set Zeny,Zeny-1000;
	getitem 517,1;
	emotion 19;
	next;
	mes "[ハタン]";
	mes "私からのお礼。ありがとう。";
	emotion 28;
	close;
}

umbala.gat,59,243,5	script	ウータン族の子供#4	787,{
	if(UM_1QUE < 3) {
		mes "[？？？]";
		mes "…………";
		mes "……ウムバ。";
		mes "…………ウムババ。";
		mes "……フムバ。";
		emotion 10;
		next;
		if(select("ウムバ","ウムバブ")==2) {
			mes "[？？？]";
			mes "…………";
			mes "…………ウングバ。";
			mes "……ウムバババ。";
			emotion 28;
			close;
		}
		if(countitem(517) < 1) {
			mes "[？？？]";
			mes "ウムバウムウムフムブバババ！";
			mes "ウムバウムバババウムバウムブ！";
			emotion 6;
			percentheal -5,0;
			close;
		}
		mes "[？？？]";
		mes "ウムバウムバウムババババ。";
		mes "ウムババババウム。";
		emotion 11;
		delitem 517,1;
		getitem 909,2;
		getitem 914,2;
		getitem 705,2;
		close;
	}
	mes "[コタン]";
	mes "…………";
	mes "……ううっ。";
	mes "……肉欲しい。";
	mes "……肉、くれ。";
	emotion 10;
	next;
	if(select("あげる","あげない")==2) {
		mes "[コタン]";
		mes "…………";
		mes "……お腹すいた。";
		mes "……肉、食べたい。";
		emotion 28;
		close;
		}
	if(countitem(517) < 1) {
		mes "[コタン]";
		mes "なんだよ、肉ないのに！";
		mes "ある振りするなんて！";
		mes "ウータン族、嘘つかれる";
		mes "大嫌い!!";
		emotion 6;
		percentheal -5,0;
		close;
	}
	mes "[コタン]";
	mes "いいの？ありがとう。";
	mes "これお礼、あげる。";
	emotion 11;
	delitem 517,1;
	getitem 909,2;
	getitem 914,2;
	getitem 705,2;
	close;
}

//============================================================
// バンジージャンプNPC
//------------------------------------------------------------
umbala.gat,140,197,0	script	#バンジージャンプ	139,0,1,{
	switch(rand(10)) {
	case 0:
	case 1:
	case 2:
		announce "バンジージャンプ台: " +strcharinfo(0)+ " : イ～ヤッホ～～～ゥ！",1;
		break;
	case 3:
	case 4:
	case 5:
		announce "バンジージャンプ台: " +strcharinfo(0)+ " : ウギャアアアアアアアア～～～!!",1;
		percentheal -100,0;
		break;
	case 6:
	case 7:
	case 8:
		announce "バンジージャンプ台: " +strcharinfo(0)+ " : キャアアアアアアア～～～！",1;
		percentheal -50,0;
		break;
	case 9:
		announce "バンジージャンプ台: " +strcharinfo(0)+ " : ウワアアアアアアア～～～！",1;
		heal -Hp+1,0;
		warp "nif_in.gat",68,14;
	}
	end;
}

umbala.gat,136,195,0	script	#ワープポイント	139,1,1,{
	warp "umbala.gat",145,166;
	end;
}

//============================================================
// 言語習得クエストNPC
//- Registry -------------------------------------------------
// UM_1QUE -> 0～7
//------------------------------------------------------------
um_in.gat,39,122,5	script	ウータン族酋長	784,{
	switch(UM_1QUE) {
	case 0:
		mes "[カルカタン]";
		mes "ホッホッ、人間族じゃな。";
		mes "ウータン族の村は初めてかね？";
		mes "初めて来た人間族らは、誰でも";
		mes "そんな顔をしているもんじゃよ。";
		next;
		mes "[カルカタン]";
		mes "言葉がまったく通じず、どこでどんな";
		mes "ことが起きているか知ることさえ";
		mes "出来んもんじゃから、本当に歯がゆい";
		mes "じゃろうね……ホッホッホー。";
		mes "とにかく訪ねてきたことを歓迎するよ。";
		next;
		mes "[カルカタン]";
		mes "わしはカルカタン。ウータン族の酋長で";
		mes "村のあらゆる事を決めておる。";
		next;
		mes "[カルカタン]";
		mes "ん？わしだけ、人間族の言葉を喋る";
		mes "のが不思議そうなじゃな、ホッホッ。";
		mes "わしが人間族の言葉を喋れるのは、";
		mes "いつじゃったか、この村にやってきた";
		mes "人間族の探険家のおかげなんじゃ。";
		next;
		mes "[カルカタン]";
		mes "その人間族がここに来たのは、ずいぶん";
		mes "前の事じゃった……今はまたどこを探険";
		mes "しておるのかの。わしは人間族の言語と";
		mes "文化、その他にも様々なことを教えても";
		mes "らった。そしてわしは人間族に、ウータ";
		mes "ン族の言語を教えてあげたんじゃ。";
		next;
		mes "[カルカタン]";
		mes "そなたもウータン族の言語を学びたけれ";
		mes "ば、わしらの文化を少しでも理解しよう";
		mes "と努力するんじゃな。言葉が通じなくと";
		mes "も、服装や生活などの様子は、十分に";
		mes "感じて、見ることができるからのう。";
		next;
		mes "[カルカタン]";
		mes "むやみにわしらの事を外の者に教える";
		mes "訳にはいかんからのう……もし悪い人間";
		mes "族がわしらの言語を学んだら、わしらが";
		mes "危険になるもんじゃからね。";
		next;
		mes "[カルカタン]";
		mes "もしわしらの言葉を学ぶ気になったら、";
		mes "再びわしを訪ねてきなさい。見かけも大";
		mes "事じゃが、それよりも心意気がもっと";
		mes "大事じゃということを忘れんように";
		mes "のう……";
		set UM_1QUE,1;
		close;
	case 1:
		mes "[カルカタン]";
		mes "ホホ、人間族の者よ。村をたくさん見て";
		mes "回ったかね？人間族を初めて見るウータ";
		mes "ン族もおるから、驚いて隠れてしまう者";
		mes "がいたりするんじゃ。なので、";
		mes "そなたがどう感じたか心配じゃが……";
		next;
		mes "[カルカタン]";
		mes "それで、何か用かね？";
		mes "村を見物する分には問題ないと思うが";
		mes "何か悩み事でもあるのかね？";
		next;
		switch(select("ウータン族の言葉を学びたいです","ウムババウムババ？","特にないです")) {
		case 1:
			if(getequipid(9) != 2278 && getequipid(9) != 2297 && getequipid(9) != 2288 &&
				getequipid(9) != 2292 &&  getequipid(9) != 5005 &&  getequipid(9) != 2281 &&  getequipid(9) != 5043) {
				mes "[カルカタン]";
				mes "そなたはまだ、わしらウータン族を理解";
				mes "出来ていないようじゃね……文化が異な";
				mes "り言葉が通じないというだけで、理解";
				mes "しようと努力をすることすら諦めてし";
				mes "まうとは、駄目な奴じゃのう。";
				next;
				mes "[カルカタン]";
				mes "そう、そんな表情さえウータン族に";
				mes "とっては、恐怖の対象になるんじゃ。";
				mes "いざという時、大事なことを伝える";
				mes "ことができずに、表に現われること";
				mes "だけですべてのものを判断して";
				mes "しまったりするんじゃ。";
				next;
				mes "[カルカタン]";
				mes "もう少し、歩き回ってみるんじゃな。";
				mes "言葉を学びたいのなら、どんな風に";
				mes "話して聞けばいいかを、知るとよい";
				mes "のではないかな。そして理解できた";
				mes "というのなら、またわしを訪ねてくる";
				mes "とよい。";
				next;
				mes "[カルカタン]";
				mes "それはさておき、わしの仮面、";
				mes "ウータン族最新の流行なんじゃが……";
				mes "かなり素敵ではないか？";
				mes "どう？どうじゃ？";
				close;
			}
			mes "[カルカタン]";
			mes "ホッホッ、素敵な仮面じゃね。わしら";
			mes "ウータン族も仮面を好むんじゃよ。";
			mes "自分本来の顔と表情を隠し話すことに";
			mes "よって、お互いの考えをより深く理解";
			mes "できることがあるんじゃ。";
			next;
			mes "[カルカタン]";
			mes "だから、普段は仮面を被って話をする";
			mes "んじゃ。仮面を被ることがむしろ、";
			mes "より真実の心を伝えることができる";
			mes "という、わしらの信頼に繋がって";
			mes "いるんじゃ。";
			next;
			mes "[カルカタン]";
			mes "そなたなら、わしらの言葉を学んでも";
			mes "よさそうじゃな。約束どおり、わしらの";
			mes "言葉を教えてやろう。じゃが、人間族が";
			mes "ウータン語を聞いて話すためには、";
			mes "いくつかの準備が必要なんじゃ……";
			next;
			mes "[カルカタン]";
			mes "そう、紙じゃ、紙が必要じゃ。わしも";
			mes "人間族から紙をもらったおかげで、";
			mes "言葉を学ぶことができたんじゃ。";
			next;
			mes "[カルカタン]";
			mes "よいかな。^3173FF油紙^000000を10枚、^3173FFなめらかな紙^000000を";
			mes "5枚。そして、紙に書くための何かが";
			mes "必要じゃったはずなんじゃが……";
			mes "そうじゃ、^3173FF墨汁^000000を1個と^3173FF鳥の羽毛^000000を";
			mes "1個じゃ。";
			next;
			mes "[カルカタン]";
			mes "これらを全部用意してきたら、わしらの";
			mes "言葉を教えてやろう。";
			set UM_1QUE,2;
			close;
		case 2:
			mes "[カルカタン]";
			mes "ホッホッ、音を真似するだけでは、何も";
			mes "伝えることはできないじゃろう。言葉";
			mes "というのは、考えを伝えるために皆で";
			mes "決めた約束事ではないのかね？";
			mes "そのように思わないかね？";
			next;
			mes "[カルカタン]";
			mes "たまに人間族は、そういう約束事の意味";
			mes "すら忘れたかのように話をするから、";
			mes "あまり心が伝わらないみたいじゃね。";
			mes "同じ人種にも関わらず通訳が必要";
			mes "なんてのう……";
			next;
			mes "[カルカタン]";
			mes "わしらウータン族の言葉に、本当に";
			mes "関心があるんじゃったら、もう少し";
			mes "努力してみるんじゃな。そうした後";
			mes "でも、まだわしらの言葉を学びたい";
			mes "と思ったら、わしを訪ねてきなされ。";
			next;
			mes "[カルカタン]";
			mes "音ではない言葉というものの意味を";
			mes "教えてやるからな。ホッホッ。";
			close;
		case 3:
			mes "[カルカタン]";
			mes "特に当てもなく、旅をするのもよい";
			mes "じゃろう。じゃが、何か目的を決めて";
			mes "旅をする方が、もっとやりがいがあって";
			mes "記憶にも長く残るんじゃがね。";
			close;
		}
	case 2:
		if(countitem(7151) < 10 || countitem(7111) < 5 || countitem(1024) < 1 || countitem(916) < 1) {
			mes "[カルカタン]";
			mes "まだ準備が不十分なようじゃのう……";
			mes "もしや必要なものを忘れたのでは";
			mes "ないかね？また教えてやるから、忘れ";
			mes "ないうちに、必ず手に入れてきなされ。";
			next;
			mes "[カルカタン]";
			mes "^3173FF油紙^000000を10枚、";
			mes "^3173FFなめらかな紙^000000を5枚、";
			mes "^3173FF墨汁^000000を1個、";
			mes "^3173FF鳥の羽毛^000000を1個じゃ。";
			mes "全部用意したら、言葉を教えてやろう。";
			close;
		}
		mes "[カルカタン]";
		mes "よし。全ての準備が整ったようじゃね。";
		mes "では、教えてやろう。これをやれば、";
		mes "そなたもわしらウータン族と話すことが";
		mes "できるよ。";
		next;
		mes "[カルカタン]";
		mes "…………";
		next;
		mes "[カルカタン]";
		mes "………………";
		mes "……………………";
		next;
		mes "[カルカタン]";
		mes "………………";
		mes "……………………";
		mes "………………………………";
		next;
		mes "[カルカタン]";
		mes "さあ、終わったな。今まで息苦しかった";
		mes "気持ちを開放して、他のウータン族の";
		mes "人々にも話しかけてみるんじゃな。";
		mes "対話は本当に重要じゃ。";
		delitem 7151,10;
		delitem 7111,5;
		delitem 1024,1;
		delitem 916,1;
		set UM_1QUE,3;
		next;
		mes "[カルカタン]";
		mes "では、また何かあったら訪ねて";
		mes "きなされ。わしもできる限り、";
		mes "そなたを助けてやるからな。";
		close;
	default:	//3,6,7のとき
		mes "[カルカタン]";
		mes "まだ何か用かの？";
		mes "できるものなら、村周辺を案内してあげ";
		mes "たいんじゃが、わしはここを絶対に";
		mes "離れることができない立場なんじゃよ。";
		next;
		mes "[カルカタン]";
		mes "一族を導く立場というのは、そんなに";
		mes "たやすいものではないんじゃ。";
		mes "そなたもわしのような立場になったら、";
		mes "どういうことかを理解できるんじゃろう";
		mes "がね。すまんが、一人で見物して";
		mes "きなされ。";
		close;
	case 4:
		mes "[カルカタン]";
		mes "ホッホッ、久しぶりじゃのう。";
		mes "話しは聞いておるよ。";
		next;
		mes "[カルカタン]";
		mes "プツチァルタンに何か頼みたいことが";
		mes "あるんじゃね。わざわざわしの許しを";
		mes "得なくてもいいんじゃが……でも、";
		mes "彼女がそう言うのなら、わしも何か";
		mes "しなきゃならんのう。";
		next;
		mes "[カルカタン]";
		mes "ふむ……そんなに大変なことじゃなくて";
		mes "いいんじゃが……そうじゃな、人間族の";
		mes "仮面が一つあればよさそうじゃ……";
		mes "仮面ならプツチァルタンも十分";
		mes "満足するはずじゃろう、どうじゃ？";
		next;
		mes "[カルカタン]";
		mes "^3173FFスマイルマスク^000000を1個じゃ。";
		mes "仮面を受けとることは、ウータン族に";
		mes "とって最高の栄誉と言えるんじゃよ。";
		mes "しかし、プツチャルタンはシャーマンと";
		mes "いう特殊な立場だからのう。わしが代わ";
		mes "りに受けとることとなる。よいな。";
		set UM_1QUE,5;
		close;
	case 5:
		if(countitem(2278) < 1) {
			mes "[カルカタン]";
			mes "^3173FFスマイルマスク^000000を1個じゃと言わなかっ";
			mes "たか？それがなければ、彼女は絶対に";
			mes "手伝ってくれないんじゃよ。";
			mes "彼女に許可を与えることが出来る";
			mes "数少ない存在がわしだと言うことを";
			mes "そなたは理解しておられるかな？";
			close;
		}
		mes "[カルカタン]";
		mes "ホホ、持って来たようじゃな。そう、";
		mes "まさしくこれが、一度被ってみたかった";
		mes "仮面じゃ。もちろんこの仮面は、後で";
		mes "プツチァルタンに贈り物として与え";
		mes "なければならんのじゃが……ホッホッ。";
		next;
		mes "[カルカタン]";
		mes "プツチャルタンには、手助けを許すと";
		mes "伝えておこう。彼女に会って、話を聞い";
		mes "てみなさい。きっと彼女の能力は";
		mes "大きな助けとなるじゃろう。";
		delitem 2278,1;
		set UM_1QUE,6;
		close;
	}
}

umbala.gat,221,193,1	script	 #骸骨門	111,{
	if(UM_1QUE== 7) {
		warp "um_in.gat",32,71;
		end;
	}
	mes "^3152FFなんとなく気持ち悪い骸骨が門の";
	mes "そばにある。門は堅く閉ざされていて、";
	mes "中へ入ることができない。内部に人気が";
	mes "感じられる。中に誰かいるようだ。^000000";
	next;
	if(select("骸骨をよく見てみる","やめる")==2) {
		mes "^3152FF叩いても開かない門を開けることは";
		mes "難しいと思ったので、諦めてそのまま";
		mes "去ることにした。^000000";
		close;
	}
	mes "^3152FF白い骸骨の両目が開いている。よく";
	mes "見ると、ジェムストーンをはめられる";
	mes "くらいの穴がある。反対側の柱にも";
	mes "骸骨はあるが、そちらにはそのような";
	mes "穴は見当たらなかった。^000000";
	next;
	//アイテムIDを配列に格納
	setarray '@id[2],717,715,716;
	for(set '@i,0; '@i<2; set '@i,'@i+1) {	//左と右で2回繰り返す
		set '@eye$,('@i==0)? "左": "右";
		mes "^3152FF" +'@eye$+ "側の眼が見える。";
		mes "どうしようか？^000000";
		next;
		if(select("そのままにする","ブルージェムストーンをはめてみる","イエロージェムストーンをはめてみる","レッドジェムストーンをはめてみる")==1)
			mes "^3152FF" +'@eye$+ "側の眼には何もしなかった。^000000";
		else {
			if(countitem('@id[@menu]) < 1) {
				mes "^3152FF" +getitemname('@id[@menu])+ "を";
				mes "一つも持っていなかった。仕方なく";
				mes '@eye$+ "側の眼は、そのままにしておいた。^000000";
			}
			else {
				mes "^3152FF持っていた" +getitemname('@id[@menu])+ "を";
				mes "骸骨の" +'@eye$+ "側の眼にはめてみた。^000000";
				next;
				mes "^3152FFジェムストーンは転がる音を立てて、";
				mes "骸骨の口から出てきた。^000000";
				if('@i == 1 && '@left == @menu)
					set '@rand,2;
				else {
					set '@rand,4;
					set '@left,@menu;
				}
				delitem '@id[@menu],1;
				getitem '@id[@menu],1;
			}
		}
		next;
	}
	mes "^3152FF……………………^000000";
	next;
	mes "^3152FF………………………………";
	mes "………………………………^000000";
	next;
	mes "^3152FF………………………………";
	mes "………………………………";
	mes "………………………………^000000";
	next;
	if(rand('@rand) || '@rand == 0) {
		mes "^3152FF何も起きなかった。";
		mes "骸骨が笑う声がしたが、";
		mes "気のせいだと思う事にした。^000000";
		close;
	}
	mes "^3152FF骸骨のがらんとした眼から、";
	mes "ゴトリゴトリという音が聞こえ、";
	mes "門が開いた。門が開くと同時に";
	mes "無意識のうちに足が建物の中へと";
	mes "向かっていた。^000000";
	close2;
	warp "um_in.gat",32,71;
	end;
}

umbala.gat,220,189,0	script	#umbalawarp1013	45,1,1,{
	if(UM_1QUE == 7)
		warp "um_in.gat",32,71;
	end;
}

um_in.gat,29,71,0	warp	umbalawarp1014	1,1,umbala.gat,217,186

um_in.gat,44,71,2	script	ウータン族シャーマン	782,{
	switch(UM_1QUE) {
	default:
		mes "[？？？？？]";
		mes "ウムバウムバウムババウタンウムバウム";
		mes "ウムバウムバウムバフムウムバウム……";
		mes "ウムババウムバウムババウムババウムバ";
		mes "ウムババウムババウムバウムババウムバ";
		mes "フムウムバウムバ。";
		close2;
		warp "umbala.gat",217,186;
		end;
	case 3:
		mes "[プツチァルタン]";
		mes "人間が私達ウータン族の村まで訪ねて";
		mes "くるようになるとは、思いませんでした";
		mes "……大自然がこのような変化に対して";
		mes "どんなお言葉をくださるかは、まだ";
		mes "分かりません。";
		next;
		mes "[プツチァルタン]";
		mes "君達人間は恐ろしい種族……手に触れる";
		mes "すべてのものを所有するために、手段を";
		mes "選びませんし、足に触れるすべての";
		mes "場所へ行くために、どんな代価も支払い";
		mes "ます。";
		next;
		mes "[プツチァルタン]";
		mes "君達人間が、私達にどんな影響を及ぼす";
		mes "のか分かりませんが……私のもとへ";
		mes "来たということは、君には何か望む";
		mes "ことがあるのでしょう。";
		next;
		mes "[プツチァルタン]";
		mes "けれども、私の能力はウータン族の";
		mes "ためのものです。もし、助力を願うの";
		mes "でしたら、酋長様にお許しを得て下さ";
		mes "い。また、村の人々にはあまり関わら";
		mes "ないようにしなさい……私達は皆、";
		mes "静かに暮したいのです。";
		set UM_1QUE,4;
		close;
	case 4:
	case 5:
		mes "[プツチァルタン]";
		mes "酋長様にお許しを得なさいと、";
		mes "言いませんでしたか？お許しのない";
		mes "人間には、どんな助けも与えることは";
		mes "できません。……さあ、行きなさい。";
		close;
	case 6:
		mes "[プツチァルタン]";
		mes "お許しを得てきたようですね……あまり";
		mes "気は進みませんが、手伝ってあげること";
		mes "にしましょう。";
		next;
		mes "[プツチァルタン]";
		mes "自然物の隠された力を合わせる、または";
		mes "固く結合された力を分ける……私の能力";
		mes "でそれらを行うことが出来ます。";
		mes "君達が属性石と呼ぶもののこと";
		mes "です……";
		next;
		mes "[プツチァルタン]";
		mes "私はしばしの間、準備をしなければなり";
		mes "ません。ですから、必要になったら声を";
		mes "掛けなさい。";
		set UM_1QUE,7;
		close;
	case 7:
		break;
	}
	mes "[プツチァルタン]";
	mes "助力を要する人間よ……私の能力が";
	mes "役立つかどうかは分かりませんが、";
	mes "手伝ってあげましょう。";
	next;
	if(MaxWeight - Weight < 5000) {
		mes "[プツチァルタン]";
		mes "いや？……君が持っている何かが、私の";
		mes "魂の平和を乱しています……必要な";
		mes "材料以外の品物は、どこかに隠して";
		mes "きなさい。";
		next;
		mes "[プツチァルタン]";
		mes "今の状態では、何も得ることができない";
		mes "でしょう。準備ができたら、また";
		mes "訪ねてきなさい。";
		close;
	}
	mes "[プツチァルタン]";
	mes "それでは、なにを望みますか？";
	mes "属性の結合、分解……結合には自然物、";
	mes "分解には属性石が必要です。";
	while(1) {
		next;
		switch(select("属性の分解","属性の結合","やめる")) {
		case 1:
			mes "[プツチァルタン]";
			mes "属性の分解……どんな属性を分解したい";
			mes "のでしょうか？地、水、火、風……君が";
			mes "今、持っている属性を言いなさい。";
			next;
			switch(select("地属性","水属性","火属性","風属性")) {
			case 1:
				set '@need,997;
				set '@gain,993;
				break;
			case 2:
				set '@need,995;
				set '@gain,991;
				break;
			case 3:
				set '@need,994;
				set '@gain,990;
				break;
			case 4:
				set '@need,996;
				set '@gain,992;
				break;
			}
			mes "[プツチァルタン]";
			mes "どれくらい分解したいのか？";
			mes "君が望む数を言いなさい。";
			mes "最大10個までなら";
			mes "一度に分解することができますよ。";
			next;
			switch(select("10個一気にお願いします","数は、えっと……")) {
			case 1:
				mes "[プツチァルタン]";
				mes "わかりました。";
				mes "これから神聖な呪文を唱え、";
				mes "分解を試みてみます。";
				next;
				mes "[プツチァルタン]";
				mes "ウンバ、ウンバ、カラム！ウンバ！タ！";
				mes "ルクラ、ウクレレ、ウン！ウンバ！カ！";
				mes "アンブラカ、タブラカン！ウンバ！ラ！";
				mes "オンバルヅ、ザン、クヌ！ウンバ！ク！";
				mes "クン、ツン、ラクラクン！ウンバ！ハ！";
				next;
				if(countitem('@need) < 10) {
					switch('@need) {
					case 997:
						mes "[プツチァルタン]";
						mes "むむ？どうやら失敗です……";
						mes "大地の気が一杯に満ちた結晶、";
						mes "地の属性石が10個必要です。";
						mes "^3377FFグレイトネイチャが10個^000000";
						break;
					case 995:
						mes "[プツチァルタン]";
						mes "水属性を分解したいのですか……";
						mes "大洋の流れの神秘を氷結した";
						mes "水の属性石が10個必要です。";
						mes "^3173FFミスティックフローズンが10個^000000";
						break;
					case 994:
						mes "[プツチァルタン]";
						mes "火属性を分解したいのですか……";
						mes "燃える火炎の心を持った結晶、";
						mes "火の属性石が10個必要です。";
						mes "^3173FFフレイムハートが10個^000000";
						break;
					case 996:
						mes "[プツチァルタン]";
						mes "風属性を分解したいのですか……";
						mes "荒れ狂う風の姿が隠されている結晶、";
						mes "風の属性石が10個必要です。";
						mes "^3173FFラフウィンドが10個^000000";
						break;
					}
					next;
					mes "[プツチァルタン]";
					mes "必要な属性石はそれだけです……";
					mes "準備ができたら、また訪ねてきなさい。";
					mes "私はいつでもここにいますから。";
					close;
				}
				delitem '@need,10;
				set '@count,10;
				set '@num,rand(1,9);
				for(set '@num,0; '@count > 0; set '@count,'@count-1) {
					if('@need == 997) { //グレイトネイチャ
						switch(rand(5)) {
						case 0: set '@num,'@num+10; break;
						case 1: set '@num,'@num+8; break;
						case 2:
						case 3: set '@num,'@num+7; break;
						case 4: set '@num,'@num+6+rand(2);
						}
					}
					else if('@need == 996) { //ラフウィンド
						switch(rand(10)) {
						case 0: set '@num,'@num+(rand(2)? 10: 6); break;
						case 1:
						case 2: set '@num,'@num+8; break;
						case 3:
						case 4:
						case 5: set '@num,'@num+7; break;
						default: set '@num,'@num+6;
						}
					}
					else { //その他の属性石
						switch(rand(10)) {
						case 0: set '@num,'@num+10; break;
						case 1:
						case 2: set '@num,'@num+8; break;
						case 3:
						case 4:
						case 5: set '@num,'@num+7; break;
						default: set '@num,'@num+6;
						}
					}
				}
				getitem '@gain,'@num;
				mes "[プツチァルタン]";
				mes "こちらが、君が望んだ属性原石になり";
				mes "ます。自然に存在する物から呪術で";
				mes "作り出したものです……目的を";
				mes "よく考えてから使うようにしなさい。";
				continue;
			case 2:
				while(1) {
					input '@count;
					if('@count > 10) {
						mes "[プツチァルタン]";
						mes "一度に分解できる数は";
						mes "10個までです。";
						mes "やめる場合は0を選びなさい。";
						mes "どうするか？";
						next;
						continue;
					}
					if('@count < 0) {
						continue;
					}
					if('@count == 0) {
						mes "[プツチァルタン]";
						mes "うん？";
						mes "分解をやめたいのか。";
						mes "必要になったらまた訪ねてきなさい。";
						mes "私はいつでもここにいますから。";
						close;
					}
					if(countitem('@need) < '@count) {
						switch('@need) {
						case 997:
							mes "[プツチァルタン]";
							mes "地属性を分解したいのですか……";
							mes "大地の気が一杯に満ちた結晶、";
							mes "地の属性石が" +'@count+ "個必要です。";
							mes "^3377FFグレイトネイチャが" +'@count+ "個^000000";
							break;
						case 995:
							mes "[プツチァルタン]";
							mes "水属性を分解したいのですか……";
							mes "大洋の流れの神秘を氷結した";
							mes "水の属性石が" +'@count+ "個必要です。";
							mes "^3173FFミスティックフローズンが" +'@count+ "個^000000";
							break;
						case 994:
							mes "[プツチァルタン]";
							mes "火属性を分解したいのですか……";
							mes "燃える火炎の心を持った結晶、";
							mes "火の属性石が" +'@count+ "個必要です。";
							mes "^3173FFフレイムハートが" +'@count+ "個^000000";
							break;
						case 996:
							mes "[プツチァルタン]";
							mes "風属性を分解したいのですか……";
							mes "荒れ狂う風の姿が隠されている結晶、";
							mes "風の属性石が" +'@count+ "個必要です。";
							mes "^3173FFラフウィンドが" +'@count+ "個^000000";
							break;
						}
						next;
						mes "[プツチァルタン]";
						mes "必要な属性石はそれだけです……";
						mes "準備ができたら、また訪ねてきなさい。";
						mes "私はいつでもここにいますから。";
						close;
					}
					break;
				}
				mes "[プツチァルタン]";
				mes "わかりました。";
				mes "これから神聖な呪文を唱え、";
				mes "分解を試みてみます。";
				next;
				mes "[プツチァルタン]";
				mes "ウンバ、ウンバ、カラム！ウンバ！タ！";
				mes "ルクラ、ウクレレ、ウン！ウンバ！カ！";
				mes "アンブラカ、タブラカン！ウンバ！ラ！";
				mes "オンバルヅ、ザン、クヌ！ウンバ！ク！";
				mes "クン、ツン、ラクラクン！ウンバ！ハ！";
				next;
				delitem '@need,'@count;
				set '@num,rand(1,9);
				for(set '@num,0; '@count > 0; set '@count,'@count-1) {
					if('@need == 997) { //グレイトネイチャ
						switch(rand(5)) {
						case 0: set '@num,'@num+10; break;
						case 1: set '@num,'@num+8; break;
						case 2:
						case 3: set '@num,'@num+7; break;
						case 4: set '@num,'@num+6+rand(2);
						}
					}
					else if('@need == 996) { //ラフウィンド
						switch(rand(10)) {
						case 0: set '@num,'@num+(rand(2)? 10: 6); break;
						case 1:
						case 2: set '@num,'@num+8; break;
						case 3:
						case 4:
						case 5: set '@num,'@num+7; break;
						default: set '@num,'@num+6;
						}
					}
					else { //その他の属性石
						switch(rand(10)) {
						case 0: set '@num,'@num+10; break;
						case 1:
						case 2: set '@num,'@num+8; break;
						case 3:
						case 4:
						case 5: set '@num,'@num+7; break;
						default: set '@num,'@num+6;
						}
					}
				}
				getitem '@gain,'@num;
				mes "[プツチァルタン]";
				mes "こちらが、君が望んだ属性原石になり";
				mes "ます。自然に存在する物から呪術で";
				mes "作り出したものです……目的を";
				mes "よく考えてから使うようにしなさい。";
				continue;
			}
		case 2:
			mes "[プツチァルタン]";
			mes "属性の結合……どんな属性を結合したい";
			mes "のでしょうか？地、水、火、風……君が";
			mes "今、望む属性を言いなさい。";
			next;
			switch(select("地属性","水属性","火属性","風属性")) {
			case 1:
				if(countitem(947) < 15) {
					mes "[プツチァルタン]";
					mes "地属性……地の気に満ちている自然物が";
					mes "必要です。林の中に住み、大地の気で";
					mes "一杯になったホルン……そうホルンの";
					mes "^3173FF硬い角が15個^000000必要です。";
				}
				else {
					set '@need,947;
					set '@amount,15;
					set '@gain,993;
				}
				break;
			case 2:
				if(countitem(946) < 20) {
					mes "[プツチァルタン]";
					mes "水属性……水の気に満ちている自然物が";
					mes "必要です。全身に水気を含んで、堅く";
					mes "身を包むアンバーナイト……そう";
					mes "^3173FFカタシムリの皮が20個^000000必要です。";
				}
				else {
					set '@need,946;
					set '@amount,20;
					set '@gain,991;
				}
				break;
			case 3:
				if(countitem(904) < 20) {
					mes "[プツチァルタン]";
					mes "火属性……火の気に満ちている";
					mes "自然物が必要です。砂漠の熱気を";
					mes "全身に受けながら生きている";
					mes "スコーピオン……そう、^3173FFサソリの尻尾^000000が";
					mes "^3173FF20個^000000必要です。";
				}
				else {
					set '@need,904;
					set '@amount,20;
					set '@gain,990;
				}
				break;
			case 4:
				if(countitem(1013) < 25) {
					mes "[プツチァルタン]";
					mes "風属性……風の気に満ちている";
					mes "自然物が必要です。小さな羽で";
					mes "軽やかに飛び回るスタイナー……";
					mes "その^3173FF華麗な蟲の皮^000000が";
					mes "^3173FF25個^000000必要です。";
				}
				else {
					set '@need,1013;
					set '@amount,25;
					set '@gain,992;
				}
				break;
			}
			if('@need == 0) {	//アイテム不足
				next;
				mes "[プツチァルタン]";
				mes "必要な自然物はそれだけです……";
				mes "準備ができたら、また訪ねてきなさい。";
				mes "私はいつでもここにいますから。";
				close;
			}
			mes "[プツチァルタン]";
			mes "大自然の力によって、その隠された";
			mes "力の源泉を一つに集めてみましょう。";
			mes "1から9までのうち、君が好きな数字を";
			mes "一つ選びなさい。属性の結合を";
			mes "望まないなら、0を選びなさい。";
			while(1) {
				next;
				input '@num;
				if('@num == 0) {
					mes "[プツチァルタン]";
					mes "望まないのですね。それも一つの選択";
					mes "でしょう。後で、もし助けが必要に";
					mes "なったら、また訪ねてきなさい。";
					close;
				}
				if('@num < 0 || '@num > 9) {
					mes "[プツチァルタン]";
					mes "1から9までの中で選ばなければ";
					mes "なりません。重要なことですから、";
					mes "本当に好きな数字を選ぶように";
					mes "しなさい。";
					continue;
				}
				break;
			}
			mes "[プツチァルタン]";
			mes "この沸いている釜に、その" +(('@need == 946)? "角": ('@need == 904)? "尾": "皮")+ "を";
			mes "入れなさい。私は神聖な言葉を";
			mes "唱えます。君は先程の数字を心に思い";
			mes "描きなさい。それでも、力が集まるかは";
			mes "分かりませんが……";
			next;
			mes "[プツチァルタン]";
			mes "アムバ、オムバ、ザンバ！ウンバ！チ！";
			mes "ウムタウム、エウルカバ！ウンバ！ハ！";
			mes "ジュル、フムバ、ルララ！ウンバ！ラ！";
			mes "ダムツハ、オムババラカ！ウンバ！シ！";
			mes "スヌタムバ、アブルムバ！ウンバ！シ！";
			next;
			delitem '@need,'@amount;
			if(rand(10)) {
				getitem '@gain,1;
				mes "[プツチァルタン]";
				mes "こちらが、君が望んだ属性原石になり";
				mes "ます。自然に存在する物から呪術で";
				mes "作り出したものです……目的を";
				mes "よく考えてから使うようにしなさい。";
				continue;
			}
			getitem 910,1;
			mes "[プツチァルタン]";
			mes "少し力が足りなかったようです。";
			mes "集まった自然の力がどこかで散らばって";
			mes "しまいました。";
			next;
			mes "[プツチァルタン]";
			mes "今日はあまりよくない感じです。私の力";
			mes "が必要でしたら、後で手伝いましょう。";
			mes "もちろんその時も、失敗する可能性が";
			mes "あることを考慮してください。";
			close;
		case 3:
			mes "[プツチァルタン]";
			mes "望まないのですね。それも一つの選択";
			mes "でしょう。私の助けが必要になったら";
			mes "また訪ねてきなさい。";
			close;
		}
	}
}

//============================================================
// 夫婦喧嘩クエストNPC
//- Registry -------------------------------------------------
// UM_2QUE -> 0～6
//------------------------------------------------------------
um_in.gat,139,48,5	script	プレネタン	783,{
	if(UM_1QUE >= 3) {
		mes "[プレネタン]";
		mes "全く、この人はすぐ浮気する";
		mes "んだから……ああ！今度やったら、";
		mes "殴り倒して見捨てるからね！";
		mes "あんた!!わかってるの!?";
		close;
	}
	if(Job == Job_Novice) {
		mes "[プレネタン]";
		mes "ウムバ～ウムバウムバ！";
		mes "ウムバウムウムウムウム！";
		mes "ウムバウムウムウムババ！";
		close;
	}
	if(UM_2QUE == 6) {
		emotion 6;
		mes "[プレネタン]";
		mes "ウムババ！ウムバウムバ……";
		mes "ウムバウムウムバウムウガウガ！";
		mes "ウガウムウムウムウムバババブ!!!!";
		next;
		emotion 4,"ウムポコリオタン";
		close;
	}
	emotion 6;
	mes "[プレネタン]";
	mes "ウムバウムバウガウガ";
	mes "ウムバウムババババババ！";
	mes "ウムバウム！";
	next;
	emotion 24;
	mes "[プレネタン]";
	mes "ウムバウムバウムバウムバウムバ";
	mes "ウムバババババウガウ！";
	mes "ウガウガウムババウムバウム！";
	next;
	emotion 27;
	if(UM_2QUE == 0)
		set UM_2QUE,1;
	close;
}

um_in.gat,144,45,5	script	ウムポコリオタン	789,{
	if(UM_1QUE >= 3) {
		mes "[ウムポコリオタン]";
		mes "うう……うちの家内は乱暴";
		mes "過ぎるよ……痛い痛い。";
		next;
		mes "[ウムポコリオタン]";
		mes "ウェナタン、ベルツタン、";
		mes "チャビバタン……ううう……ウンバラの";
		mes "美女達に会いたいよ～。彼女達も私に";
		mes "会いたいだろうに……うわ～ん、痛い！";
		close;
	}
	mes "[ウムポコリオタン]";
	mes "ウムバウムバ…………";
	mes "ウムバウガウガウ！";
	mes "ウムバウムウムババウムバウガガ。";
	emotion 18;
	next;
	emotion 6,"プレネタン";
	close;
OnInit:
	hideonnpc;
	end;
}

um_in.gat,101,73,3	script	ウェナタン	783,{
	if(UM_1QUE >= 3) {
		mes "[ウェナタン]";
		mes "はぁ……夜になると現われて";
		mes "訳もなく横をうろついて、大騷ぎを";
		mes "するから本当にたまらないわ！";
		mes "ウムポコリオタンは姿を見るのも嫌!!";
		close;
	}
	if(UM_2QUE == 1) {
		if(gettime(3) < 19) {
			mes "[ウェナタン]";
			mes "ウムババ！ウムバウムバウガガ";
			mes "ウガウガウムバウガウムウム。";
			mes "ウムババババババババババ。";
			close;
		}
		emotion 6;
		mes "[ウェナタン]";
		mes "ウムバウムバウムガガガ。";
		mes "ウムバウガウガババ。";
		mes "ウムバウムババウガウ。";
		next;
		emotion 24;
		mes "[ウェナタン]";
		mes "ウガウガウガガガ。";
		mes "ウガガガウガガガ";
		mes "ガウガウガ。";
		set UM_2QUE,2;
		close;
	}
	mes "[ウェナタン]";
	mes "ウムバウムバウムバウムバウムバ";
	mes "ウガウガウガウガウガウム。";
	mes "ウムウムウムウムウムウムウムウム。";
	close;
}

um_in.gat,94,123,5	script	ベルツタン	783,{
	if(UM_1QUE >= 3) {
		mes "[ベルツタン]";
		mes "もう……ウムポコリオタンは変態";
		mes "みたいな奴よ！いくら大嫌いだと";
		mes "言っても、すっごくしつこくて。";
		mes "話もしたくない。ああ……二度と";
		mes "見たくもないわ。";
		close;
	}
	if(UM_2QUE == 2 && gettime(3) >= 19) {
		emotion 6;
		mes "[ベルツタン]";
		mes "ウムバウガウガバウガウム。";
		mes "ウムバルウムバルウガウガウン";
		mes "ウムバウムバルウガウムバル。";
		next;
		emotion 24;
		mes "[ベルツタン]";
		mes "ウガウムバルウムバルウムバ";
		mes "ウムバルウガガガウ！ウ！ウ！";
		mes "ウガ～ウガ～ウガムウムバル。";
		set UM_2QUE,3;
		close;
	}
	mes "[ベルツタン]";
	mes "ウムバルウガウムバルウムバウム！";
	mes "ウム～ウガウガウムバルウム。";
	mes "ウムバ……ウウム。";
	close;
}

umbala.gat,145,217,3	script	チャビバタン	783,{
	if(UM_1QUE >= 3) {
		mes "[チャビバタン]";
		mes "ふぅ……ウムポコリオタンは奥さんが";
		mes "いるみたいです。なのにどうして、";
		mes "女性を見るとすぐに追っかけるのか……";
		mes "分からないです。ウータン族では";
		mes "ないのかしら？";
		close;
	}
	if(UM_2QUE == 3 && gettime(3) >= 19) {
		emotion 6;
		mes "[チャビバタン]";
		mes "ウムババウムバルバルウガウガウム";
		mes "ウムババウムバルバルウガウガウムバ";
		mes "ウガウガムウウム！ウガ！";
		next;
		emotion 24;
		mes "[チャビバタン]";
		mes "ウムババ～～";
		mes "ウガウガウムバルウムバルウウウ！";
		mes "ウガウムバルウガウムバルウガウガガ。";
		hideoffnpc "ウムポコリオタン";
		hideoffnpc "夫婦喧嘩#um1";
		set UM_2QUE,4;
		close;
	}
	mes "[チャビバタン]";
	mes "ウムババ～～";
	mes "ウガウガウムバルウムバルウウウ！";
	mes "ウガウムバルウガウムバルウガウガガ。";
	close;
}

um_in.gat,141,46,0	script	夫婦喧嘩#um1	139,8,8,{
	if(UM_2QUE != 4)
		end;
	mes "- 家に入ろうとしたら -";
	mes "- プレネタンが男を乱暴に -";
	mes "- 殴っているのを見つけた -";
	next;
	emotion 6,"プレネタン";
	mes "[プレネタン]";
	mes "ウムバウムバウムバウムバ！";
	mes "ウムバウムバウムバ!!";
	mes "ウムバウムバウムバウムバ!!!!";
	next;
	mes "- プレネタンが暴れたせいで -";
	mes "- 外へ押し出されてしまった -";
	next;
	set UM_2QUE,5;
	hideoffnpc "夫婦喧嘩#um2";
	hideonnpc;
	warp "umbala.gat",94,181;
	end;
OnInit:
	hideonnpc;
	end;
}

umbala.gat,94,181,0	script	夫婦喧嘩#um2	139,1,1,{
	if(UM_2QUE != 5)
		end;
	mes "- 強引に外へ追い出された。-";
	mes "- ……我に返ってふと見ると -";
	mes "- そばに何かの木の葉が落ちていた。-";
	mes "- 一緒に押し出されたようである。-";
	next;
	if(select("拾う","そのままにしておく")==1)
		getitem 610,1;
	else {
		mes "[" +strcharinfo(0)+ "]";
		mes "他人の物に手をつけるのは";
		mes "よくない。やっぱり良心を";
		mes "大事にしよう。";
	}
	set UM_2QUE,6;
	hideonnpc;
	close;
OnInit:
	hideonnpc;
	end;
}
