//====================================================================
//Ragnarok Online EP4.0(J) Marriage System      V1.0
//====================================================================
prt_church.gat,105,100,4	script	養子コンパニオン	71,{
	mes "[ハッピーマリー]";
	mes "養子とは、幸せを夢見る";
	mes "全ての子供の希望です。";
	mes "おやおや、もしかして……";
	mes "あなた、養子したい方が";
	mes "いらっしゃるのですか？";
	next;
	switch (select("養子縁組について聞きたい","養子縁組ってどうやるんですか","養子縁組を申し込みたい","私は無敵のソロ軍団！")) {
	case 1:
		mes "[ハッピーマリー]";
		mes "これはテスト用の暫定処理です";
		next;
		mes "[ハッピーマリー]";
		mes "養子になるとパラメーターが通常より";
		mes "低くなり、転生もできなくなります。";
		next;
		mes "[ハッピーマリー]";
		mes "一度養子になれば元に戻ることも出来ないし";
		mes "どんなことをしても養子関係を破棄する事は";
		mes "できません。";
		next;
		mes "…";
		next;
		mes "……";
		next;
		mes "……一種の呪いですね。";
		close;
	case 2:
		mes "[ハッピーマリー]";
		mes "三人だけのパーティーを組み、私に";
		mes "話しかけてください。";
		next;
		mes "[ハッピーマリー]";
		mes "最初に父親の名前を次に母親の名前";
		mes "を正確にお伝えください。";
		next;
		mes "[ハッピーマリー]";
		mes "養子縁組の事前に、必ず両親の名前の";
		mes "正確な綴りをご確認ください。";
		next;
		mes "[ハッピーマリー]";
		mes "方法としましては、";
		mes "両親に耳打ちを行ってみると";
		mes "よろしいと思います。相手に通じれば";
		mes "その名前が正しい綴りですし、もし通じ";
		mes "なければ、名前が間違っている可能性が";
		mes "あります。";
		next;
		mes "[ハッピーマリー]";
		mes "まず、相手に一度耳打ちをして、";
		mes "チャットウィンドウ左部のボタンを";
		mes "押します。そうすると、";
		mes "耳打ちリストに相手の名前が";
		mes "表示されますので選択しましょう。";
		next;
		mes "[ハッピーマリー]";
		mes "相手の名前がボタンの左に";
		mes "表示されますので、その名前を";
		mes "Ctrl+Cでコピーしておきます。";
		mes "そうすれば、報告の際に";
		mes "Shift＋Insertで相手の名前を";
		mes "呼び出すことができます。";
		next;
		mes "[ハッピーマリー]";
		mes "1)相手と耳打ち会話をする";
		mes "2)耳打ちリストに表示された";
		mes "相手の名前を選択する";
		mes "3)チャットウィンドウの左下に";
		mes "表示された相手の名前を";
		mes "Ctrl+Cでコピーする。";
		next;
		mes "[ハッピーマリー]";
		mes "この方法で、両親の名前を";
		mes "確実に記入できます、";
		next;
		mes "[ハッピーマリー]";
		mes "説明だけですとなんですので、1回";
		mes "試してみましょうか。";
		next;
		mes "[ハッピーマリー]";
		mes "Ctrl＋Cでコピーしたものを";
		mes "Shift＋Insertキーで呼び出してみて";
		mes "ください。よろしいですか？";
		next;
		input '@test$;
		mes "[ハッピーマリー]";
		mes "どうです、出来ましたか？";
		next;
		mes "[ハッピーマリー]";
		mes "では、もし結婚したいと思うお相手が";
		mes "いましたら、申し込みを是非どうぞ。";
		close;
	case 3:
		mes "[ハッピーマリー]";
		mes "では、父親の名前を入力してください";
		next;
		input '@papa$;
		mes "[ハッピーマリー]";
		mes "では、母親の名前を入力してください";
		next;
		input '@mama$;
		mes "[ハッピーマリー]";
		mes "本当に養子になりますか？";
		next;
		if(select("はい","いいえ")==2) {
			mes "[ハッピーマリー]";
			mes "今日も幸せな一日にな～っれっ！";
			close;
		}
		if(adoption('@papa$,'@mama$)==0) {
			mes "[ハッピーマリー]";
			mes "条件を満たしてないようですね";
			close;
		}
		mes "[ハッピーマリー]";
		mes "これで養子縁組は成立しました";
		mes "お祝い申し上げます！";
		mes "何があろうと関係が消えることはありません";
		mes "末永くお幸せに";
		close;
	case 4:
		mes "[ハッピーマリー]";
		mes "一人で強く生きてださい";
		close;
	}
}
