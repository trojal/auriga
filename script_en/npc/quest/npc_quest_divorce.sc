//==============================================================================
// Ragnarok Online Divorce Event Script   2005-05-23     by Athena Wiki & Dev
//==============================================================================

nif_in.gat,190,112,5	script	デビルチ	738,{
	if(!PartnerId) {
		mes "[デビルチ]";
		mes "クックックッ、所詮皆独りよ。";
		mes "慰めにペットでも飼ってみるか？";
		mes "近頃はわし、デビルチが";
		mes "いいらしいぞ……";
		close;
	}
	mes "[デビルチ]";
	mes "何か浮かない顔をしているな。";
	mes "ふん、わしは幸せな奴には";
	mes "興味ないんだがね……";
	mes "クックックッ……";
	next;
	mes "[デビルチ]";
	mes "だが一度自分の心に聞いてみるんだ。";
	mes "ぬしは結婚して幸せになれたのか？";
	mes "ケッケッケッ……";
	next;
	mes "[デビルチ]";
	mes "こんな所まで来たのには";
	mes "何か訳があるんだろう？";
	mes "永遠の愛なんてものは……";
	mes "ケケケッ。";
	next;
	mes "[デビルチ]";
	mes "フン、方法は簡単だ。";
	mes "婚姻なんてたかが契約の一種だろう？";
	mes "わしならそれくらいすぐに";
	mes "破棄できるぞ。相手の同意？";
	mes "そんなものは必要ない。";
	next;
	mes "[デビルチ]";
	mes "つまり、自由になれるってわけだ。";
	mes "そうすれば新たな出会いもあるだろう。";
	mes "ケッケッケッ……";
	mes "婚姻の破棄を手伝ってやろうか？";
	next;
	if(select("けっこうです","お願いします")==1) {
		mes "[デビルチ]";
		mes "フン、フン、フン！";
		mes "カップルなんか……ケッ!!";
		mes "後でわしに泣きついたって";
		mes "知らないからな！";
		close2;
		warp "niflheim.gat",169,162;
		end;
	}
	mes "[デビルチ]";
	mes "よかろう。";
	mes "その意志と2,500,000Zeny";
	mes "それで十分だ。";
	mes "では、結婚前の状態に戻るが平気か？";
	mes "本当に離婚してもよいんだな？";
	next;
	if(select("……少し考えさせてください","はい、離婚します")==1) {
		mes "[デビルチ]";
		mes "所詮人間は独り。";
		mes "ぬしの心と資金、";
		mes "両方準備ができたら";
		mes "また訪ねてくるがよい……";
		mes "ククククッ……";
		close;
	}
	if(Zeny<2500000) {
		mes "[デビルチ]";
		mes "2,500,000Zenyは、ぬしの";
		mes "誠意の証だ。それすら";
		mes "出せぬのなら諦めるんだな。";
		mes "ケケケケッ……";
		close;
	}
	set '@name$,getcharname(PartnerId);
	mes "[デビルチ]";
	mes "仕方ねぇな。破棄してやるか。";
	mes "よしよし。ちょっと待ってな。";
	close2;
	set '@name$,getcharname(divorce(0));	//念のためもう１回名前を要求
	heal -Hp+1,-Sp;
	set Zeny,Zeny-2500000;
	announce strcharinfo(0)+ "さんと " +'@name$+ "さんが離婚しました。",0x1a;
	end;
}