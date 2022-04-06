//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- 冒険者アカデミー
//                                                  by Pneuma
// 自動会話関係 ----------------------------------------------

//------------------------------------------------------------------------------
// ミニマップ表示(本鯖ではNPC名 「コンパス」)
//
// Academy Officialタイプ１でタッチするものはAcademy OfficialのOnTouch参照
// NPCが重なるとOnTouchが発生しない為、全てここに！
//
// *IDはviewpointで使用するID
// 青色 0x0000FF ID:10 (気になるあの子)
// 赤色 0xFF0000 ID:11 (奇跡の箱)
// 橙色 0xFF9900 ID:12 (お世話になったあの人へ)
// 緑色 0x00FF00 ID:13 (実験のお手伝い/ダンジョン救出)
// 水色 0x00FFFF ID:14 (冒険者になりたい)
// 黄色 0xFFFF00 ID:20 (全試験)
//
//------------------------------------------------------------------------------

pay_fild03.gat,388,63,0	script	AC_TSTVP1_02	139,1,1,{ //街からのワープ先でタッチ
	if(AC_RANK==0 && AC_RANKTEST==2){ //第１課程
		viewpoint 1,209,143,20,0xFFFF00;
	}
}
prt_fild08.gat,170,375,0	script	AC_TSTVP2_02	139,1,1,{ //プロ南でタッチ
	if(AC_RANK==1 && AC_RANKTEST==2){ //第２課程
		viewpoint 1,233,16,20,0xFFFF00;
	}
	if( (AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2)|| //冒険者になりたい２
		(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2)){ //冒険者になりたい６
		viewpoint 1,233,16,14,0x00FFFF;
	}
}
moc_fild01.gat,238,378,0	script	AC_TSTVP2_03	139,1,1,{ //子デザマップでタッチ
	if(AC_RANK==1 && AC_RANKTEST==2){ //第２課程
		viewpoint 1,379,162,20,0xFFFF00;
	}
	if(AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2){ //冒険者になりたい２
		viewpoint 1,379,162,14,0x00FFFF;
	}
	if(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2) { //冒険者になりたい６
		viewpoint 1,322,16,14,0x00FFFF;
	}
}
pay_fild04.gat,20,165,0		script	AC_TSTVP2_04	139,1,1,{ //ポリン島でタッチ
	if(AC_RANK==1 && AC_RANKTEST==2){ //第２課程
		viewpoint 1,350,330,20,0xFFFF00;
	}
	if(AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2){ //冒険者になりたい２
		viewpoint 1,267,193,14,0x00FFFF; //撮影ポイント２
	}
}
pay_fild01.gat,333,356,0				script	AC_TSTVP3_02	139,1,1,{ //Fay南でタッチ
	if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){//	実験のお手伝い４
		viewpoint 1,353,14,13,0x00FF00;	// ウルフマップ入り口(右下)
	}
	if(AC_RANK==2 && AC_RANKTEST==2){ //第３課程
		viewpoint 1,353,14,20,0xFFFF00;
	}
}
pay_fild02.gat,160,381,0				script	AC_TSTVP2_03	139,1,1,{ //ウルフマップ右上WPでタッチ
	if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){//	実験のお手伝い４
		viewpoint 1,52,125,13,0x00FF00;	// あやしいキノコ
	}
	if(AC_RANK==2 && AC_RANKTEST==2){ //第３課程
		viewpoint 1,105,242,20,0xFFFF00;
	}
}
pay_fild02.gat,83,382,0					script	AC_TSTVP2_04	139,1,1,{ //ウルフマップ上中央WPでタッチ(いらない？)
	if(AC_RANK==2 && AC_RANKTEST==2){ //第３課程
		viewpoint 1,105,242,20,0xFFFF00;
	}
}
mjolnir_09.gat,106,34,0					script	AC_TSTVP4_03	139,1,1,{ //プロ←↑ワープ先でタッチ
	if(AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第４課程
		viewpoint 1,30,249,20,0xFFFF00;
	}
	if(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第５課程
		viewpoint 1,100,365,20,0xFFFF00;
	}
}
gef_fild00.gat,376,140,0				script	AC_TSTVP4_05	139,1,1,{ //ゲフェ東
	if(AC_RANK==3 && AC_RANKTEST>=7 && AC_RANKTEST!=99){ //第４課程
		viewpoint 1,40,199,20,0xFFFF00;
	}
}
prt_fild00.gat,380,249,0				script	AC_TSTVP4_05	139,1,1,{ //プロ←↑←ワープ先でタッチ
	if(AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第４課程
		viewpoint 1,152,250,20,0xFFFF00;
	}
}
prt_fild05.gat,367,205,0				script	AC_TSTVP5_02	139,1,1,{ //プロ西
	if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2) ||	//ダンジョン救出１
		(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) ||	//ダンジョン救出３
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) 		//実験のお手伝い５
	){
		viewpoint 1,270,212,13,0x00FF00;	//地下水路管理兵
	}
	if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //冒険者になりたい４
		(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) ){ //冒険者になりたい７
		viewpoint 1,13,63,14,0x00FFFF;
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2){	//冒険者になりたい９
		viewpoint 1,270,212,14,0x00FFFF; //地下水路管理兵
	}
	if(AC_RANK==3 && AC_RANKTEST==2){ //第４課程
		viewpoint 1,105,381,20,0xFFFF00;
		mes "[" + strcharinfo(0) + "]";
		mes "ガルドは^0000FFProntera^000000から^0000FFGeffen^000000へ";
		mes "歩くことって言ってたっけ。";
		mes "途中で^FF0000ドラップ先生^000000にお弁当を";
		mes "渡さなくちゃ。";
		mes "まずは^FF0000北西の方角へ^000000歩いていこう。";
		close2;
		set AC_RANKTEST,3; //フラグ更新
		end;
	}
	if(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第５課程
		viewpoint 1,105,381,20,0xFFFF00;
	}
}
prt_fild05.gat,357,205,0				script	AC_TSTVP5_02	139,7,7,{ //プロ西（ワープ前）
	if(AC_RANK==6 && AC_RANKTEST==15){
		mes "[" + strcharinfo(0) + "]";
		mes "Pronteraが見える。";
		mes "あと少しだ！";
		close2;
		set AC_RANKTEST,16;
		end;
	}
}
pay_fild08.gat,20,74,0					script	AC_TSTVP6_02	139,1,1,{ //Fay東
	if(AC_RANK==5 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第６課程
		viewpoint 1,167,332,20,0xFFFF00;
	}
}
gef_fild00.gat,46,199,0					script	AC_TSTVP6_04	139,1,1,{ //Geffen東
	if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //第６課程
		viewpoint 1,267,382,20,0xFFFF00;
	}
}
mjolnir_06.gat,265,32,0					script	AC_TSTVP6_05	139,1,1,{ //ミョルニール山脈06
	if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //第６課程
		viewpoint 1,226,183,20,0xFFFF00;
	}
}
moc_fild12.gat,159,378,0				script	AC_TSTVP6_07	139,1,1,{ //Morroc南
	if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //第６課程
		viewpoint 1,118,30,20,0xFFFF00;
	}
	if( (AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) || //冒険者になりたい３
		(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) ){ //冒険者になりたい５
		viewpoint 1,118,30,14,0x00FFFF;
	}
}
moc_fild18.gat,158,379,0				script	AC_TSTVP6_07	139,1,1,{ //ソグラト砂漠18
	if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //第６課程
		viewpoint 1,211,95,20,0xFFFF00;
	}
	if(AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) { //冒険者になりたい３
		viewpoint 1,232,217,14,0x00FFFF; //撮影ポイント３
	}
	if(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) { //冒険者になりたい５
		viewpoint 1,382,305,14,0x00FFFF;
	}
}
pay_gld.gat,370,149,0					script	AC_TSTVP7_02	139,1,1,{ //チュンリム湖
	if(AC_RANK==6 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第７課程
		viewpoint 1,273,307,20,0xFFFF00;
	}
}
moc_fild01.gat,315,25,0					script	AC_TSTVP7_03	139,1,1,{ //ソグラト砂漠01
	if(AC_RANK==6 && AC_RANKTEST>=7 && AC_RANKTEST!=99){ //第７課程
		viewpoint 1,190,38,20,0xFFFF00;
	}
}
prt_fild09.gat,380,237,0				script	AC_TSTVP7_04	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=9 && AC_RANKTEST!=99){ //第７課程
		viewpoint 1,304,193,20,0xFFFF00;
	}
}
prt_fild07.gat,206,15,0					script	AC_TSTVP7_05	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=14 && AC_RANKTEST!=99){ //第７課程
		viewpoint 1,248,376,20,0xFFFF00;
	}
}
prt_fild05.gat,257,18,0					script	AC_TSTVP7_06	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=15 && AC_RANKTEST!=99){ //第７課程
		viewpoint 1,367,205,20,0xFFFF00;
	}
}
moc_ruins.gat,156,42,0		script	AC_QUEVP00_04	139,1,1,{
	if( (AC_QUEST_ST_0==2 && AC_QUEST_LV_0==2)||	//気になるあの子３
		(AC_QUEST_ST_0==3 && AC_QUEST_LV_0==4)){	//気になるあの子５
		viewpoint 1,114,100,10,0x0000FF; //ピラ前スザンヌ
	}
	if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //実験のお手伝い２
		viewpoint 1,54,161,13,0x00FF00; //ピラ入り口
	}
}
comodo.gat,172,165,0		script	AC_QUEVP00_05	139,7,7,{ //Comodo Academy Officialタイプ２
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==5){		//気になるあの子６
		viewpoint 1,165,163,10,0x0000FF; //ノエリア
	}
	if(AC_QUEST_LV_1==7 && AC_QUEST_ST_1==2){ //奇跡の箱８
		viewpoint 1,113,219,11,0xFF0000; //ターニャ
	}
}
prt_fild06.gat,27,193,0		script	AC_QUEVP00_06	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){		//気になるあの子６
		viewpoint 1,277,320,10,0x0000FF; //カピトーリナ修道院へ
	}
	if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //冒険者になりたい１
		viewpoint 1,277,320,14,0x00FFFF;
	}
}
prt_fild02.gat,305,22,0		script	AC_QUEVP00_07	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){		//気になるあの子６
		viewpoint 1,380,347,10,0x0000FF; //カピトーリナ修道院へ
	}
	if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //冒険者になりたい１
		viewpoint 1,305,157,14,0x00FFFF; //撮影ポイント１
	}
}
prt_fild03.gat,23,249,0		script	AC_QUEVP00_08	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){		//気になるあの子６
		viewpoint 1,371,256,10,0x0000FF; //カピトーリナ修道院へ
	}
}
rachel.gat,129,144,0		script	AC_QUEVP00_10	139,7,7,{	//Rachel Academy Officialタイプ２
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==8){		//気になるあの子９
		viewpoint 1,148,190,10,0x0000FF;
	}
}
veins.gat,197,133,0			script	AC_QUEVP00_11	139,7,7,{	//Veins Academy Officialタイプ２
	if(AC_QUEST_ST_0==3 && AC_QUEST_LV_0==8){		//気になるあの子９
		viewpoint 1,148,329,10,0x0000FF;
	}
}
amatsu.gat,121,155,0	script	#AC_QUEVP01_03	139,7,7,{	//Academy Officialタイプ２
	if(AC_QUEST_LV_1==2 && AC_QUEST_ST_1==2){ //奇跡の箱３
		viewpoint 1,212,141,11,0xFF0000; //アーチボルド
	}
}
gonryun.gat,174,134,0	script	#AC_QUEVP01_04	139,7,7,{	//Academy Officialタイプ２
	if(AC_QUEST_LV_1==3 && AC_QUEST_ST_1==2){ //奇跡の箱４
		viewpoint 1,140,65,11,0xFF0000; //ゲイソン
	}
}
louyang.gat,215,118,0	script	#AC_QUEVP01_05	139,7,7,{	//Academy Officialタイプ２
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==2){ //奇跡の箱５
		viewpoint 1,229,109,11,0xFF0000; //ドナテロ
	}
}
ayothaya.gat,213,193,0	script	#AC_QUEVP01_06	139,7,7,{	//Academy Officialタイプ２
	if(AC_QUEST_LV_1==5 && AC_QUEST_ST_1==2){ //奇跡の箱６
		viewpoint 1,212,176,11,0xFF0000; //デューイ
	}
}
umbala.gat,93,154,0		script	#AC_QUEVP01_07	139,7,7,{	//Academy Officialタイプ２
	if(AC_QUEST_LV_1==6 && AC_QUEST_ST_1==2){ //奇跡の箱７
		viewpoint 1,96,164,11,0xFF0000; //デニス
	}
}
prt_fild04.gat,374,73,0			script	AC_QUEVP04_13	139,1,1,{
	if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //冒険者になりたい４
		(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) ){ //冒険者になりたい７
		viewpoint 1,17,114,14,0x00FFFF;
	}
}
gef_fild01.gat,375,111,0		script	AC_QUEVP04_14	139,1,1,{
	if(AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2){ //冒険者になりたい４
		viewpoint 1,208,242,14,0x00FFFF;//撮影ポイント４
	}
	if(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2){ //冒険者になりたい７
		viewpoint 1,16,102,14,0x00FFFF;
	}
}
moc_fild17.gat,33,300,0		script	AC_QUEVP04_15	139,1,1,{
	if(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) { //冒険者になりたい５
		viewpoint 1,146,145,14,0x00FFFF;//撮影ポイント５
	}
}
moc_fild02.gat,77,338,0		script	AC_QUEVP04_19	139,1,1,{
	if(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2) { //冒険者になりたい６
		viewpoint 1,332,19,14,0x00FFFF;
	}
}
gef_fild09.gat,368,92,0		script	AC_QUEVP04_20	139,1,1,{
	if(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) { //冒険者になりたい７
		viewpoint 1,225,25,14,0x00FFFF;
	}
}
aldebaran.gat,134,114,0		script	AC_QUEVP04_21	139,7,7,{ 	//Academy Officialタイプ２
	if( (AC_QUEST_LV_2==0 && AC_QUEST_ST_2==1) || // お世話になったあの人に１
		(AC_QUEST_LV_2==1 && AC_QUEST_ST_2==1) || // お詫びの品を届けたい１
		(AC_QUEST_LV_2==7 && AC_QUEST_ST_2==2) || // お菓子お届け
		(AC_QUEST_LV_2==8 && AC_QUEST_ST_2==1)) { // お詫びの品を届けたい２
		if(AC_QUEST_ST_2==1) cutin "q_run_npc_05.bmp", 4;
		viewpoint 1,231,107,12,0xFF9900; //ミザリーの家
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //冒険者になりたい８
		viewpoint 1,168,168,14,0x00FFFF; //リンクサンタ
	}
}
aldebaran.gat,231,107,0				script	AC_QUEVP02_02	139,1,1,{ //ミザリーの建物から出た
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) {
		viewpoint 1,168,166,12,0xFF9900; //リンクサンタ
	}
}
xmas_fild01.gat,100,100,0	script	AC_QUEVP04_22	139,1,1,{
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) { // お世話になったあの人に１
		viewpoint 1,84,248,12,0xFF9900;
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //冒険者になりたい８
		viewpoint 1,84,248,14,0x00FFFF;
	}
}
xmas.gat,149,44,0			script	AC_QUEVP04_23	139,1,1,{
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) { //お世話になったあの人に１
		viewpoint 1,189,276,12,0xFF9900;
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //冒険者になりたい８
		viewpoint 1,143,314,14,0x00FFFF;
	}
}
xmas_dun01.gat,205,16,0		script	AC_QUEVP04_24	139,1,1,{
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //冒険者になりたい８
		viewpoint 1,129,130,14,0x00FFFF;
	}
}
prt_sewb1.gat,131,247,0		script	AC_QUEVP04_25	139,1,1,{	//プロ地下水路１
	if(AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2){ //	ダンジョン救出１
		viewpoint 1,301,206,13,0x00FF00; //チスロー
	} else
	if( (AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) ||	//	ダンジョン救出３
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) ){	//	実験のお手伝い５
		viewpoint 1,188,247,13,0x00FF00; //2層入り口
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //冒険者になりたい９
		viewpoint 1,188,247,14,0x00FFFF;
	}
}
prt_sewb2.gat,19,19,0		script	AC_QUEVP04_26	139,1,1,{	//プロ地下水路２
	if(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2){ //	ダンジョン救出３
		viewpoint 1,159,182,13,0x00FF00; //メルシーちゃん
	} else
	if(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3){ //	実験のお手伝い５
		viewpoint 1,180,24,13,0x00FF00; //3層入り口
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //冒険者になりたい９
		viewpoint 1,180,24,14,0x00FFFF;
	}
}
prt_sewb3.gat,180,169,0		script	AC_QUEVP04_27	139,1,1,{	//プロ地下水路３
	if(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3){ //	実験のお手伝い５
		viewpoint 1,184,17,13,0x00FF00; //ミンミン草
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //冒険者になりたい９
		viewpoint 1,20,185,14,0x00FFFF;
	}
}
yuno.gat,142,176,0					script	AC_QUEVP02_05	139,7,7,{ //マッズイの家
	if( (AC_QUEST_LV_2==1 && AC_QUEST_ST_2==2) || //お詫びの品を届けたい１
		(AC_QUEST_LV_2>=2 && AC_QUEST_LV_2<=7 && AC_QUEST_ST_2==1) //お菓子の材料集め１～５・お菓子お届け
	){
		viewpoint 1,95,182,12,0xFF9900;
	}
}
lighthalzen.gat,219,161,0			script	AC_QUEVP02_06	139,7,7,{ //リヒ Academy Officialタイプ２
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==2){ //お菓子の材料集め１
		viewpoint 1,51,161,12,0xFF9900;  //木
	}
}
einbroch.gat,223,182,0			script	AC_QUEVP02_07	139,7,7,{ //Einbroch Academy Officialタイプ２
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==3){ //お菓子の材料集め２
		viewpoint 1,111,261,12,0xFF9900; //ドブ
	}
}
einbech.gat,171,137,0			script	AC_QUEVP02_08	139,7,7,{ //Einbech Academy Officialタイプ２
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==4){ //お菓子の材料集め３
		viewpoint 1,130,247,12,0xFF9900; //ドルドイ
	}
}
izlu2dun.gat,107,50,0			script	AC_QUEVP02_09	139,1,1,{ //バイラン島
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==5){ //お菓子の材料集め４
		viewpoint 1,136,50,12,0xFF9900; //ンライバ
	}
	if( (AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2) || //ダンジョン救出２
		(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2) ){ //ダンジョン救出４
		viewpoint 1,108,83,13,0x00FF00;	// 海底洞窟入り口
	}
}
alb2trea.gat,43,53,0	script	AC_QUEVP02_10	139,1,1,{ //沈没船
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==6){ //お菓子の材料集め５
		viewpoint 1,105,95,12,0xFF9900; //アイリン
	}
}
hugel.gat,93,155,0	script	AC_QUEVP02_11	139,8,9,{ //Hugel Academy Officialタイプ２
	if(AC_QUEST_ST_2==3 && AC_QUEST_LV_2==8){ //お詫びの品を届けたい２
		viewpoint 1,72,90,12,0xFF9900; //ロックス
	} else
	if( (AC_QUEST_LV_3==0 && AC_QUEST_ST_3==1) ||	//実験のお手伝い１
		(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==1) ||	//実験のお手伝い２
		(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==1) ||	//実験のお手伝い３
		(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==1) ||	//実験のお手伝い４
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==1)		//実験のお手伝い５
	){
		viewpoint 1,104,79,13,0x00FF00;
	} else
	if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==1) ||	//ダンジョン救出１
		(AC_QUEST_LV_3==3 && AC_QUEST_ST_3==1) ||	//ダンジョン救出２
		(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==1) ||	//ダンジョン救出３
		(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==1)		//ダンジョン救出４
	){
		viewpoint 1,73,152,13,0x00FF00;
	}
}
gef_fild07.gat,336,187,0	script	AC_QUEVP03_01	139,1,1,{ //Geffen西
	if(AC_QUEST_LV_3==0 && AC_QUEST_ST_3==3){ //	実験のお手伝い１
		viewpoint 1,185,249,13,0x00FF00;
	}
}
moc_pryd01.gat,192,9,0	script	AC_QUEVP03_03	139,1,1,{ //ピラMido地上1F
	if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //実験のお手伝い２
		viewpoint 1,193,193,13,0x00FF00; //ライライ草
	}
}
iz_dun00.gat,168,168,0	script	AC_QUEVP03_05	139,1,1,{ //海底洞窟1層
	if(AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2){//	ダンジョン救出２
		viewpoint 1,351,45,13,0x00FF00;	// ツイーフラ
	} else
	if(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2){//	ダンジョン救出４
		viewpoint 1,352,341,13,0x00FF00;	//2層入り口(右上)
	}
}
iz_dun01.gat,253,252,0	script	AC_QUEVP03_06	139,1,1,{ //海底洞窟2層
	if(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2){//	ダンジョン救出４
		viewpoint 1,129,79,13,0x00FF00;	//ザーパフ
	}
}
pay_arche.gat,81,22,0	script	AC_QUEVP03_07	139,1,1,{ //Archer Village入り口
	if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){//	実験のお手伝い３
		viewpoint 1,36,131,13,0x00FF00;	// Payonダンジョン
	}
}
pay_dun00.gat,21,183,0	script	AC_QUEVP03_08	139,1,1,{ //Payonダンジョン
	if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){//	実験のお手伝い３
		viewpoint 1,154,172,13,0x00FF00;	// 黒い変なキノコ
	}
}
