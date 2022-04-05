// デバック転送
prontera.gat,154,195,4	script	ポタ子	115,{
	cutin "kafra_03",2;
	mes "[ポタ子]";
	mes "こんにちは。ポタ子です。";
	mes "皆さんを無料でダンジョンに転送して差し上げますわ。";
	mes "ポタ屋さん商売上がったりですね；；";
	mes "転送して差し上げましょうか？";
	next;
	if(select("お願いします","けっこうです") == 2) {
		mes "[ポタ子]";
		mes "いつでもご利用してくださいね。";
		close2;
		cutin "kafra_03",255;
		end;
	}
	mes "[ポタ子]";
	mes "まずは地域を選んでください。";
	next;
	set @menu,select("プロンテラ","モロク","グラストヘイム","アルデバラン","ゲフェン","イズルード","アルベルタ",
	                 "フェイヨン","ルティエ","コモド","ジュノー","アマツ","コンロン","ギルドダンジョン","やっぱやめる");
	if(@menu != 15) {
		mes "[ポタ子]";
		mes "行きたい場所を選んでください。";
		next;
	}

	switch(@menu) {
	case 1:
		switch(select("地下水路B1F","地下水路B2F","地下水路B3F","地下水路B4F","迷宮の森1",
		              "迷宮の森2","迷宮の森3","やっぱやめる")) {
			case 1: warp "prt_sewb1",131,247; end;
			case 2: warp "prt_sewb2",19,19;   end;
			case 3: warp "prt_sewb3",180,169; end;
			case 4: warp "prt_sewb4",100,192; end;
			case 5: warp "prt_maze01",176,7;  end;
			case 6: warp "prt_maze02",94,19;  end;
			case 7: warp "prt_maze03",23,8;   end;
		}
		break;

	case 2:
		switch(select("スフィンクス1F","スフィンクス2F","スフィンクス3F","スフィンクス4F","スフィンクス5F",
		              "ピラミッド1F","ピラミッド2F","ピラミッド3F","ピラミッド4F","蟻地獄1","蟻地獄2","やっぱやめる")) {
			case 1:  warp "in_sphinx1",289,9;  end;
			case 2:  warp "in_sphinx2",149,81; end;
			case 3:  warp "in_sphinx3",210,54; end;
			case 4:  warp "in_sphinx4",10,222; end;
			case 5:  warp "in_sphinx5",100,99; end;
			case 6:  warp "moc_pryd01",192,9;  end;
			case 7:  warp "moc_pryd02",10,192; end;
			case 8:  warp "moc_pryd03",100,92; end;
			case 9:  warp "moc_pryd04",18,187; end;
			case 10: warp "anthell01",35,262;  end;
			case 11: warp "anthell02",34,263;  end;
		}
		break;

	case 3:
		switch(select("修道院前","古城1F","古城2F","騎士団1F","騎士団2F","個室前","カタコン","階段",
		              "地下水路B1F","地下水路B2F","地下水路B3F","地下水路B4F","最下層地下洞窟B1F","最下層地下洞窟B2F",
		              "監獄B1F","監獄B2F","やっぱやめる")) {
			case 1:  warp "glast_01",200,125;  end;
			case 2:  warp "glast_01",200,336;  end;
			case 3:  warp "gl_cas01",199,29;   end;
			case 4:  warp "gl_cas02",104,25;   end;
			case 5:  warp "gl_knt01",150,15;   end;
			case 6:  warp "gl_knt02",157,287;  end;
			case 7:  warp "gl_chyard",147,15;  end;
			case 8:  warp "gl_step",12,7;      end;
			case 9:  warp "gl_sew01",258,274;  end;
			case 10: warp "gl_sew02",29,270;   end;
			case 11: warp "gl_sew03",171,283;  end;
			case 12: warp "gl_sew04",68,277;   end;
			case 13: warp "gl_dun01",133,271;  end;
			case 14: warp "gl_dun02",224,274;  end;
			case 15: warp "gl_prison",17,70;   end;
			case 16: warp "gl_prison1",150,14; end;
		}
		break;

	case 4:
		switch(select("時計塔1F","時計塔2F","時計塔3F","時計塔4F","時計塔B1F","時計塔B2F",
		              "時計塔B3F","時計塔B4F","やっぱやめる")) {
			case 1: warp "c_tower1",199,159;   end;
			case 2: warp "c_tower2",268,26;    end;
			case 3: warp "c_tower3",65,147;    end;
			case 4: warp "c_tower4",189,39;    end;
			case 5: warp "alde_dun01",171,158; end;
			case 6: warp "alde_dun02",128,169; end;
			case 7: warp "alde_dun03",277,178; end;
			case 8: warp "alde_dun04",203,220; end;
		}
		break;

	case 5:
		switch(select("ダンジョンB1F","ダンジョンB2F","ダンジョンB3F","ダンジョンB4F","ミニョール廃坑B1F",
		              "ミニョール廃坑B2F","ミニョール廃坑B3F","オーク地下洞窟1","オーク地下洞窟2","やっぱやめる")) {
			case 1: warp "gef_dun00",104,99;  end;
			case 2: warp "gef_dun01",115,236; end;
			case 3: warp "gef_dun02",106,132; end;
			case 4: warp "gef_dun03",203,204; end;
			case 5: warp "mjo_dun01",52,17;   end;
			case 6: warp "mjo_dun02",381,343; end;
			case 7: warp "mjo_dun03",302,262; end;
			case 8: warp "orcsdun01",32,170;  end;
			case 9: warp "orcsdun02",180,17;  end;
		}
		break;

	case 6:
		switch(select("海底洞窟一層","海底洞窟二層","海底洞窟三層","海底洞窟四層","海底神殿","やっぱやめる")) {
			case 1: warp "iz_dun00",168,168; end;
			case 2: warp "iz_dun01",41,37;   end;
			case 3: warp "iz_dun02",236,204; end;
			case 4: warp "iz_dun03",32,63;   end;
			case 5: warp "iz_dun04",26,27;   end;
		}
		break;

	case 7:
		switch(select("沈没船一層","沈没船二層","タートルアイランド","タートルアイランドダンジョン",
		              "タートルアイランド陽居村","タートルアイランド久陽宮","やっぱやめる")) {
			case 1: warp "treasure01",69,24;  end;
			case 2: warp "treasure02",102,27; end;
			case 3: warp "tur_dun01",154,46;  end;
			case 4: warp "tur_dun02",148,264; end;
			case 5: warp "tur_dun03",132,189; end;
			case 6: warp "tur_dun04",100,192; end;
		}
		break;

	case 8:
		switch(select("地下洞窟B1F","地下洞窟B2F","地下洞窟B3F","地下寺院1","地下寺院2","やっぱやめる")) {
			case 1: warp "pay_dun00",21,183;  end;
			case 2: warp "pay_dun01",19,33;   end;
			case 3: warp "pay_dun02",19,63;   end;
			case 4: warp "pay_dun03",155,159; end;
			case 5: warp "pay_dun04",98,205;  end;
		}
		break;

	case 9:
		switch(select("おもちゃ工場倉庫","おもちゃ工場分類所","やっぱやめる")) {
			case 1: warp "xmas_dun01",205,15;  end;
			case 2: warp "xmas_dun02",129,133; end;
		}
		break;

	case 10:
		switch(select("西洞窟カル","北洞窟ルワンダ","東洞窟マオ","やっぱやめる")) {
			case 1: warp "beach_dun",266,67;  end;
			case 2: warp "beach_dun2",154,25; end;
			case 3: warp "beach_dun3",23,260; end;
		}
		break;

	case 11:
		switch(select("ノークロード一層","ノークロード二層","やっぱやめる")) {
			case 1: warp "mag_dun01",126,68; end;
			case 2: warp "mag_dun02",47,30;  end;
		}
		break;

	case 12:
		switch(select("畳の迷宮","地下戦場跡","アマツ地下神社","やっぱやめる")) {
			case 1: warp "ama_dun01",228,9;   end;
			case 2: warp "ama_dun02",31,41;   end;
			case 3: warp "ama_dun03",195,123; end;
		}
		break;

	case 13:
		switch(select("崑崙D1","崑崙D2","崑崙D3","やっぱやめる")) {
			case 1: warp "gon_dun01",154,45; end;
			case 2: warp "gon_dun02",26,114; end;
			case 3: warp "gon_dun03",68,8;   end;
		}
		break;

	case 14:
		switch(select("フェイヨン","アルデバラン","プロンテラ","ゲフェン","やっぱやめる")) {
			case 1: warp "gld_dun01",120,23; end;
			case 2: warp "gld_dun02",25,160; end;
			case 3: warp "gld_dun03",44,37;  end;
			case 4: warp "gld_dun04",110,28; end;
		}
		break;
	}
	mes "[ポタ子]";
	mes "いつでもご利用してくださいね。";
	close2;
	cutin "kafra_03",255;
	end;
}
