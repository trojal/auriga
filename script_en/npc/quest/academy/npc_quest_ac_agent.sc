//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- 冒険者アカデミー  Academy Official
//                                                  by Pneuma
//------------------------------------------------------------

//----------------------------------
// 地域説明 -- arg1=mapno
function	script	ac_map_info	{
	switch(getarg(0)) {
	case 0:// Prontera
		cutin "area_map_002",3;
		mes "This is the capital of the Kingdom of Rune Midgard.";
		mes "City of ^0000FFProntera^000000";
		close;
	case 1:// Izlude
		cutin "area_map_006",3;
		mes "This city is a satellite city of the capital Prontera.
		mes "^0000FFIzlude^000000";
		close;
	case 2:// Morroc
		cutin "area_map_009",3;
		mes "[Academy Official]";
		mes "This is an oasis town in the Sograt Desert, southwest of Prontera." ;
		mes "^0000FFMorroc^000000";
		next;
		mes "[Academy Official]";
		mes "However, this is what it looks like now: ......";
		mes "The city's oasis is gone without a trace." ;
		mes "Look, the east side of the city has become quite dangerous." ;
		mes "It would be foolhardy to cross the desert on your own toward Prontera or Payon." ;
		next;
		mes "[Academy Official]";
		mes "If you want to move, use the transfer." ;
		close;
	case 3:// Alberta
		cutin "area_map_007",3;
		mes "This is the port town ^0000FFAlberta^000000";
		close;
	case 4:// Geffen
		cutin "area_map_003",3;
		mes "This is the magical city ^0000FFGeffen^000000";
		close;
	case 5:// Payon
		cutin "area_map_007",3;
		mes "This is a mountain city surrounded by greenery ^0000FFPayon^000000";
		close;
	case 6://Aldebaran
		cutin "area_map_002",3;
		mes "This is the city of ^0000FFAldebaran^000000 located north of Prontera";
		close;
	case 7://Yuno
		cutin "area_map_005",3;
		mes "This city is in the Republic of Schwartzvald";
		mes "Capital ^0000FFYuno^000000";
		close;
	case 8://Umbala
		cutin "area_map_004",3;
		mes "This place is lush with trees,";
		mes "A village of the Wootan tribe, rich in nature";
		mes "^0000FFUmbala^000000";
		close;
	case 9://Comodo
		cutin "area_map_004",3;
		mes "This is a cave city located in the southernmost part of the Kingdom of Rune Midgard";
		mes "^0000FFComodo^000000";
		close;
	case 10://Hugel
		cutin "area_map_005",3;
		mes "This is a rural city located in the northern part of the Republic of Schwartzvald";
		mes "^0000FFHugel^000000";
		close;
	case 11://Rachel
		cutin "area_map_010",3;
		mes "This is the capital of Arunafeltz ^0000FFRachel^000000";
		close;
	case 12://Lighthalzen
		cutin "area_map_010",3;
		mes "This is a corporate city located southwest of Einbroch";
		mes "^0000FF Lighthalzen^000000";
		close;
	case 13://Veins
		cutin "area_map_010",3;
		mes "This is a city built between a canyon and a cliff ^0000FFVeins^000000";
		close;
	case 14://Gonryun
		mes "This is an archipelago-like island floating in the air." ;
		mes "It is also a famous tourist destination ^0000FFGonryun^000000";
		close;
	case 15://Louyang
		mes "This is an ancient city with magnificent buildings ^0000FFLouyang^000000";
		close;
	case 16://Ayothaya
		mes "This place is inhabited by a group of people with peculiar beliefs ^0000FFAyothaya^000000";
		close;
	case 17://Pyramid Dungeon
		cutin "area_map_009",3;
		mes "This is the Thief Guild in the Pyramid Dungeon located northwest of ^0000FFMorroc^000000";
		close;
	case 18://Einbroch
		cutin "area_map_005",3;
		mes "This is an industrial city ^0000FFEinbroch^000000";
		close;
	case 19://Amatsu
		mes "This is a picturesque land surrounded by abundant water and magnificent cherry blossoms ^0000FFAmatsu^000000";
		close;
	case 20://Archer Village
		cutin "area_map_007",3;
		mes "This is an archery village in the mountain city ^0000FFPayon^000000 surrounded by greenery.";
		close;
	case 21://Einbech
		cutin "area_map_005",3;
		mes "This is a village created to dig out resources from the mine, ^0000FFEinbech^000000.";
		close;
	}
	return;
}

//----------------------------------
// Academy Official (Admissions)
// AurigaはOnTouch重複不可の為、コンパスNPCも兼ねる

-	script	Academy Official#func	-1,{
	function WARP_ACADEMY;
	function JOIN_ACADEMY;
	function DORAM_ACADEMY;

	set '@novice,callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	while ('save_gatname$['@mapnumber]!='@gatname$) set '@mapnumber,'@mapnumber+1;

	if(Job == Job_Summoner){ // ドラム族専用
		DORAM_ACADEMY;
		end;
	} else
	if (AC_PASSPORT==0){ // 未入学
		JOIN_ACADEMY;
		end;
	} else
	if(AC_PASSPORT==1){ // 仮入学済
		WARP_ACADEMY;
		end;
	}

	if('@novice){
		mes "[Academy Official]";
		mes "Hello." ;
		mes "How are you doing?" ;
		mes "Are you going to the Adventurer Academy?" ;
	} else {
		mes "[Academy Official]";
		mes "Hello!" ;
		mes "We request donations of ^0000FF1000^000000 Zeny from skilled adventurers." ;
		mes "Shall I transfer you to the Adventurer's Academy?" ;
	}
	next;
	switch(select("Transfer", "Learn about the area", "Nevermind")){
	case 1:
		WARP_ACADEMY;
		end;
	case 2:
		mes "[Academy Official]";
		mes "You want to know about this area." ;
		callfunc "ac_map_info", '@mapnumber;
		end;
	default:
		mes "[Academy Official]";
		mes "I see." ;
		mes "Whenever you're ready, just give me a shout and I'll send you on your way." ;
		close;
	}

	function	WARP_ACADEMY	{
		set '@novice,callfunc("AC_GetNovice");
		if(!'@novice && AC_PASSPORT!=1){ //仮入学済みの場合は無料
			set '@price,(AC_PASSPORT ? 1000 : 2000);
			if (Zeny<'@price) {
				mes "Huh?" ;
				mes "It looks like you don't have enough money." ;
				mes "I'm sorry, but please come back after you get the Zeny together.";
				close;
			}
			set Zeny, Zeny - '@price;
		}
		mes "[Academy Official]";
		if(AC_PASSPORT==1){
			//仮入学済み、転送後に蝶を使った場合のみ表示。
			mes "You're enrolled." ;
		}
		set AC_SAVE_MAP, '@mapnumber;
		mes "Then I'll transfer you to the Adventurer's Academy." ;
		mes " ";
		mes "The Academy's save point is now ^FF0000" +'save_mapname$[AC_SAVE_MAP]+ "^000000-";
		close2;
		switch(AC_PASSPORT){
		case 0:
			set AC_PASSPORT,1; //入学仮受付
		case 1:
			warp "ac_cl_room.gat",44,32;
			break;
		default:
			if('@novice) warp "ac_cl_area.gat",67,155;
			else         warp "ac_en_hall.gat",97,12;
		}
		return;
	}

	function	JOIN_ACADEMY	{
		set '@novice,callfunc("AC_GetNovice");
		if ('@novice) {
			if(getarg(0)){
				mes "[Academy Official]";
				mes "Oh?" ;
				mes "You're a newcomer, aren't you?" ;
				mes "Would you like to enroll in the Adventurer Academy?" ;
			} else {
				mes "[Academy Official]";
				mes "Hello." ;
				mes "We're looking for new students right now." ;
				mes "Would you like to enroll in the Adventurer Academy?" ;
			}
			next;
			menu "Adventurer Academy?", -;
			mes "[Academy Official]";
			mes "The Adventurer Academy is an adventurer's school open to everyone from novice adventurers to seasoned adventurers." ;
			next;
			mes "[Academy Official]";
			mes "By enrolling in the academy, you learn a lot of knowledge.";
			mes "You get a lot of benefits as you learn.";
			next;
			mes "[Academy Official]";
			mes "Any difficult event during your adventure should be solved quickly by asking the teachers and seniors at the academy." ;
			next;
			mes "[Academy Official]";
			mes "I'm sure it will help you with all the challenges that await you on your adventure." ;
			mes "What do you think?" ;
			mes "Would you like to enroll in the Adventurer Academy?" ;
		} else {
			mes "[Academy Official]";
			mes "Hello." ;
			mes "I'm looking for new students right now." ;
			mes "We can take in experienced and skilled people, but we do take donations." ;
			mes "Would you like to enroll in the Adventurer Academy?" ;
			next;
			switch(select("Do not enroll", "Enroll", "What is the Adventurer Academy?")) {
			case 1:
				mes "[Academy Official]";
				mes "I see." ;
				mes "You can always enroll in the Adventurer's Academy!" ;
				mes "If you have any questions, I suggest you enroll in the program." ;
				close;
			case 2:
				mes "[Academy Official]";
				mes "I see." ;
				mes "You seem like a skilled adventurer." ;
				mes "The donation for admission is ^0000FF2000^000000 Zeny." ;
				mes "Would you like to enroll?" ;
				break;
			case 3:
				mes "[Academy Official]";
				mes "The Adventurer Academy is a school that supports adventurers." ;
				mes "The Adventurers Academy is funded by donations." ;
				mes "You can learn a lot of knowledge by enrolling in the Academy." ;
				next;
				mes "[Academy Official]";
				mes "Any difficult event during your adventure should be solved quickly by asking the teachers and seniors at the academy.";
				next;
				mes "[Academy Official]";
				mes "However, you may be in a better position to teach than I am, since we only have a new teacher now." ;
				emotion 23,"";
				next;
				mes "[Academy Official]";
				mes "You get all kinds of perks as you learn what you need to know about the adventure.";
				mes " ";
				mes "The school that fully supports adventurers, that's the Adventurer Academy.";
				close;
			}
		}
		next;
		if(select("Enroll", "Do not enroll")==2){
			mes "[Academy Official]";
			mes "I see." ;
			mes "You can always enroll in the Adventurer's Academy!" ;
			mes "If you have any questions, I suggest you enroll in the program." ;
			close;
		}
		WARP_ACADEMY;
		return;
	}

	function	DORAM_ACADEMY	{
		mes "[Academy Official]";
		mes "Hello." ;
		mes "I'm looking for new students right now." ;
		mes "As a Doram, you can't enroll in the Adventurer Academy, but you're free to visit." ;
		mes "Would you like to take a tour?" ;
		next;
		switch(select("Do not visit", "Visit", "What is the Adventurer Academy?")) {
		case 1:
			mes "[Academy Official]";
			mes "I see." ;
			mes "Too bad." ;
			close;
		case 2:
			set AC_SAVE_MAP, '@mapnumber;
			mes "[Academy Official]";
			mes "Then I'll transfer you to the Adventurer's Academy." ;
			mes " ";
			mes "The Academy's save point is now ^FF0000" +'save_mapname$[AC_SAVE_MAP]+ "^000000-";
			close2;
			warp "ac_cl_room.gat",44,32;
			end;
		case 3:
			mes "[Academy Official]";
			mes "The Adventurer Academy is a school that supports adventurers." ;
			mes "The Adventurers Academy is funded by donations." ;
			mes "By enrolling in the academy, you can learn a lot of knowledge." ;
			next;
			mes "[Academy Official]";
			mes "Any difficulties you may encounter during your adventures can be quickly resolved by asking the teachers and seniors at the academy." ;
			next;
			mes "[Academy Official]";
			mes "You can get various benefits by learning what you need for your adventure." ;
			mes " " ";
			mes "The Adventurer Academy is a school that fully supports adventurers." ;
			close;
		}
	}

OnTouch:
	set '@novice,callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	while ('save_gatname$['@mapnumber]!='@gatname$) set '@mapnumber,'@mapnumber + 1;

	if ('@novice && AC_PASSPORT==0) JOIN_ACADEMY 1;

	// ミニマップにポイント表示 (その他エリアは npc_quest_ac_ontouch.txt 参照)
	switch('@mapnumber){
	case 0://Prontera
		if(AC_RANK==1 && AC_RANKTEST==2){ //第２課程
			viewpoint 1,156,22,20,0xFFFF00;
		}
		if( (AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99)|| //第４課程
			(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99)){ //第５課程
			viewpoint 1,22,203,20,0xFFFF00;
		}
		if( (AC_QUEST_LV_0==0 && AC_QUEST_ST_0==1)||	//気になるあの子１
			(AC_QUEST_LV_0==1 && AC_QUEST_ST_0==1)||	//気になるあの子２
			(AC_QUEST_LV_0==2 && AC_QUEST_ST_0==1)||	//気になるあの子３
			(AC_QUEST_LV_0==3 && AC_QUEST_ST_0==1)||	//気になるあの子４
			(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==1)||	//気になるあの子６
			(AC_QUEST_LV_0==6 && AC_QUEST_ST_0==1)||	//気になるあの子７
			(AC_QUEST_LV_0==7 && AC_QUEST_ST_0==3)){	//気になるあの子８
			if(AC_QUEST_ST_0==1) cutin "q_run_npc_01.bmp", 4;
			viewpoint 1,146,232,10,0x0000FF; //ハルバード
		}
		//東門
		if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //冒険者になりたい１
			viewpoint 1,289,203,14,0x00FFFF;
		}
		//南門
		if( (AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2)|| //冒険者になりたい２
			(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2)){ //冒険者になりたい６
			viewpoint 1,156,22,14,0x00FFFF;
		}
		//西門
		if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //冒険者になりたい４
			(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) || //冒険者になりたい７
			(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) ){ //冒険者になりたい９
			viewpoint 1,22,203,14,0x00FFFF;
		}
		if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2) ||	//ダンジョン救出１
			(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) ||	//ダンジョン救出３
			(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) ){	//実験のお手伝い５
			viewpoint 1,22,203,13,0x00FF00;
		}
		end;
	case 1://Izlude
		if(  AC_QUEST_ST_0==2 && AC_QUEST_LV_0==1){		//気になるあの子２
			viewpoint 1,148,148,10,0x0000FF; //道具屋
		} else 
		if( (AC_QUEST_LV_0==7 && AC_QUEST_ST_0==1)||	//気になるあの子８
			(AC_QUEST_LV_0==8 && AC_QUEST_ST_0==1)){	//気になるあの子９
			cutin "q_run_npc_03.bmp", 4;
			viewpoint 1,137,156,10,0x0000FF; //スザンヌ
		}
		if(  AC_QUEST_LV_2==5 && AC_QUEST_ST_2==2){		//お菓子の材料集め４
			viewpoint 1,201,181,12,0xFF9900; //船員
		}
		if( (AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2) || //ダンジョン救出２
			(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2) ){ //ダンジョン救出４
			viewpoint 1,201,181,13,0x00FF00; //船員
		}
		end;
	case 2://Morroc
		if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //第６課程
			viewpoint 1,160,17,20,0xFFFF00;
		}
		if( (AC_QUEST_LV_0==2 && AC_QUEST_ST_0==2)||	//気になるあの子３
			(AC_QUEST_LV_0==4 && AC_QUEST_ST_0==3)){	//気になるあの子５
			viewpoint 1,25,294,10,0x0000FF; //ピラ
		}
		if( (AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) || //冒険者になりたい３
			(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) ){ //冒険者になりたい５
			viewpoint 1,160,17,14,0x00FFFF;
		}
		if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //実験のお手伝い２
			viewpoint 1,25,294,13,0x00FF00; //ピラ
		}
		end;
	case 3://Alberta
		if(AC_RANK==0 && AC_RANKTEST==2){ //第１課程
			viewpoint 1,15,234,20,0xFFFF00;
		}
		if(AC_QUEST_ST_1){ //奇跡の箱 全エピソード
			if(AC_QUEST_ST_1==1) cutin "q_run_npc_04.bmp", 4;
			viewpoint 1,39,46,11,0xFF0000;
		}
		end;
	case 4://Geffen
		if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //第６課程
			viewpoint 1,217,119,20,0xFFFF00;
		}
		if(AC_QUEST_LV_0==3 && AC_QUEST_ST_0==2){		//気になるあの子４
			viewpoint 1,172,174,10,0x0000FF; //主治医の家(オネストと同じ家)
		}
		if(AC_QUEST_ST_4==1){ //冒険者になりたい 全章
			cutin "q_run_npc_09.bmp", 4;
			viewpoint 1,172,174,14,0x00FFFF;
		}
		if(AC_QUEST_LV_3==0 && AC_QUEST_ST_3==3){	//実験のお手伝い１
			viewpoint 1,26,119,13,0x00FF00;
		}
		end;
	case 5://Payon
		if(AC_RANK==2 && AC_RANKTEST==2){ //第３課程
			viewpoint 1,122,27,20,0xFFFF00; // Payon南
		}
		if(AC_RANK==5 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第６課程
			viewpoint 1,267,89,20,0xFFFF00; // Payon東
		}
		if(AC_RANK==6 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //第７課程
			viewpoint 1,16,143,20,0xFFFF00; // Payon西
		}
		if(AC_QUEST_LV_0==4 && AC_QUEST_ST_0==1){ //気になるあの子５
			cutin "q_run_npc_02.bmp", 4;
			viewpoint 1,140,85,10,0x0000FF; //ジェラルド(道具屋)
		}
		if(AC_QUEST_LV_1==1 && AC_QUEST_ST_1==2){ //奇跡の箱２
			viewpoint 1,216,120,11,0xFF0000; //ロイス
		}
		if(AC_QUEST_LV_2==8 && AC_QUEST_ST_2==2){ //お詫びの品を届けたい２
			viewpoint 1,165,99,12,0xFF9900; //ライアス
		}
		if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){ //実験のお手伝い３
			viewpoint 1,228,330,13,0x00FF00;	// Archer VillageWP
		}
		if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){//	実験のお手伝い４
			viewpoint 1,122,27,13,0x00FF00;	// Payon南
		}
		end;
	}
	end;
OnInit:
	if(strnpcinfo(2)!="func") waitingroom "Academy Official",0;
	setarray 'save_gatname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat";
	setarray 'save_mapname$,"Prontera","Izlude","Morroc","Alberta","Geffen","Payon";
}

prontera.gat,153,192,4	duplicate(Academy Official#func)	Academy Official::AC_PRO	750,8,8
izlude.gat,126,118,4	duplicate(Academy Official#func)	Academy Official::AC_IZL	750,8,8
geffen.gat,116,109,4	duplicate(Academy Official#func)	Academy Official::AC_GEF	750,8,8
morocc.gat,147,101,4	duplicate(Academy Official#func)	Academy Official::AC_MOR	750,8,8
payon.gat,159,205,4		duplicate(Academy Official#func)	Academy Official::AC_PAY	750,8,8
alberta.gat,107,132,4	duplicate(Academy Official#func)	Academy Official::AC_ALB	750,8,8

//-----------------------------------------
// ルーンのクエスト補助員

-	script	Academy Official#func2	-1,{
	set '@novice, callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	for(set '@i,0; 'mapname$['@i]!='@gatname$; set '@i,'@i+1){}
	set '@mapnumber,'@i;

	if(AC_PASSPORT==0){
		mes "[Academy Official]";
		mes "Hello." ;
		mes "I am an assistant at the Adventurer Academy." ;
		mes "What can I do for you?" ;
		next;
		if(select("About the Adventurer Academy", "Nothing in particular")==2){
			mes "[Academy Official]";
			mes "Well, if you need me again, please come back." ;
			close;
		}
		mes "[Academy Official]";
		mes "The Adventurer Academy is a school for adventurers." ;
		mes "By enrolling in the academy, you can learn a lot of knowledge." ;
		mes "You can get various benefits by learning." ;
		next;
		mes "[Academy Official]";
		mes "If you have any difficult events during your adventure, just ask the teachers and seniors at the academy and they will help you out." ;
		next;
		mes "[Academy Official]";
		mes "If you want to enroll in the Adventurer Academy, please talk to the academy officials in Prontera, Morroc, Geffen, Payon, Alberta, or Izlude.";
		close;
	}
	mes "[Academy Official]";
	mes "Hello." ;
	mes "You must be a student of the Adventurer Academy." ;

	//転送チェック
	set '@warpflag,0;
	if('@novice) {
		// クエ進行中で且つ、依頼人の居るマップでないと
		// アカデミーへ移動させてくれない。
		switch('@mapnumber){
		case 6: //Aldebaran
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==0)||	//お世話になったあの人に
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==1)||	//お詫びの品を届けたい１
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==7)||	//お菓子お届け
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==8);	//お詫びの品を届けたい２
			break;
		case 7: //Yuno
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==1)||	//お詫びの品を届けたい１
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==2)||	//お菓子の材料集め１
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==3)||	//お菓子の材料集め２
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==4)||	//お菓子の材料集め３
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==5)||	//お菓子の材料集め４
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==6)||	//お菓子の材料集め５
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==7);	//お菓子お届け
			break;
		case 8: //Umbala
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==6);	//奇跡の箱７
			break;
		case 9: //Comodo
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==5)||	//気になるあの子６
							(AC_QUEST_ST_1 && AC_QUEST_LV_1==7);	//奇跡の箱８
			break;
		case 10: //Hugel
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==8)||	//お詫びの品を届けたい２
							(AC_QUEST_ST_3);						//実験のお手伝い(全エピソード)
			break;
		case 11: //Rachel
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==8);	//気になるあの子９
			break;
		case 12: //Lighthalzen
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==2);	//お菓子の材料集め１
			break;
		case 13: //Veins
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==8);	//気になるあの子９
			break;
		case 14: //Gonryun
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==3);	//奇跡の箱４
			break;
		case 15: //Louyang
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==4);	//奇跡の箱５
			break;
		case 16: //Ayothaya
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==5);	//奇跡の箱６
			break;
		case 18: //Amatsu
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==2);	//奇跡の箱３
			break;
		case 19: //Einbroch
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==3);	//お菓子の材料集め２
			break;
		case 21: //Einbech
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==4);	//お菓子の材料集め３
			break;
		}
	}
	if('@warpflag){
		mes "Have you done your business with the runes yet?" ;
		mes "If you're done with your business, I'll transfer you to the Adventurer's Academy." ;
		next;
		set '@sel, select("Transfer", "I want to know about the area", "Nevermind");
	} else {
		mes "Is there something you want from me?" ;
		next;
		set '@sel, select("I want to know about the area", "Nothing in particular")+1;
	}
	switch('@sel){
	case 1:
		mes "[Academy Official]";
		mes "Then let's go!" ;
		close2;
		warp "ac_cl_area.gat",67,155;
		end;
	case 2:
		mes "[Academy Official]";
		mes "You want to know about this area." ;
		callfunc "ac_map_info", '@mapnumber;
		end;
	default:
		mes "[Academy Official]";
		mes "Really?" ;
		mes "Come back if you need me again." ;
		close;
	}
OnInit:
	setarray 'mapname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat","aldebaran.gat","yuno.gat","umbala.gat","comodo.gat","hugel.gat","rachel.gat","lighthalzen.gat","veins.gat","gonryun.gat","louyang.gat","ayothaya.gat","moc_prybd1.gat","amatsu.gat","einbroch.gat","pay_arche.gat","einbech.gat";
	if(strnpcinfo(2)!="func2") waitingroom "Academy Official",0;
}
aldebaran.gat,134,114,4		duplicate(Academy Official#func2)	Academy Official#ALD	883
yuno.gat,142,176,4			duplicate(Academy Official#func2)	Academy Official#YNO	883
umbala.gat,93,154,4			duplicate(Academy Official#func2)	Academy Official#UBR	883
comodo.gat,172,165,4		duplicate(Academy Official#func2)	Academy Official#CMD	883
hugel.gat,93,155,4			duplicate(Academy Official#func2)	Academy Official#HGL	883
rachel.gat,129,144,4		duplicate(Academy Official#func2)	Academy Official#RCL	883
lighthalzen.gat,219,161,4	duplicate(Academy Official#func2)	Academy Official#LTZ	883
veins.gat,197,133,4			duplicate(Academy Official#func2)	Academy Official#VNS	883
amatsu.gat,121,155,4		duplicate(Academy Official#func2)	Academy Official#AMA	883
gonryun.gat,174,134,4		duplicate(Academy Official#func2)	Academy Official#GON	883
louyang.gat,215,118,4		duplicate(Academy Official#func2)	Academy Official#LOU	883
ayothaya.gat,213,193,4		duplicate(Academy Official#func2)	Academy Official#AYO	883
einbroch.gat,223,182,4		duplicate(Academy Official#func2)	Academy Official#EIN	883
einbech.gat,171,137,4		duplicate(Academy Official#func2)	Academy Official#EIB	883

//----------------------------------
// 一次転職サポート

-	script	Academy Support#func	-1,{
L_START:
	set '@novice, callfunc("AC_GetNovice");
	if     ("SWD"==strnpcinfo(2)) set '@job$,"Swordsman";
	else if("MGI"==strnpcinfo(2)) set '@job$,"Magician";
	//else if("ACO"==strnpcinfo(2)) set '@job$,"Acolyte";
	else if("ARC"==strnpcinfo(2)) set '@job$,"Archer";
	else if("SHF"==strnpcinfo(2)) set '@job$,"Thief";
	//else if("MRC"==strnpcinfo(2)) set '@job$,"Merchant";
	else if("TKW"==strnpcinfo(2)) set '@job$,"Taekwon Kid";
	else if("GUN"==strnpcinfo(2)) set '@job$,"Gunslinger";
	else if("NIN"==strnpcinfo(2)) set '@job$,"Ninja";
	else if("SNV"==strnpcinfo(2)) set '@job$,"Supernovice";
	if('@job$==""){
		mes "[Academy Official]";
		mes "Hello." ;
		mes "I'm the new adventurers' representative at the Adventurer Academy, and I'm here to help fledgling adventurers get started in their new job." ;
	}
	else {
		mes "[Academy Official]";
		mes "Hello." ;
		mes "I'm the new adventurer rep at the Adventurer Academy, and I support adventurers who are trying to become a "+'@job$+" and those who have just become a "+'@job$+"." ;
	}
	if(!'@novice){
		next;
		mes "[Academy Official]";
		mes "You're a seasoned adventurer now." ;
		mes "It seems you don't need my support." ;
		close;
	}
	next;
	menu "I want to transfer to the academy.",L_WARP, "I want to know about the area.",L_WHERE, "I want a job skill book.",L_GIVEBOOK, "Nothing.",L_CANCEL;
L_WARP:
	mes "[Academy Official]";
	mes "I'll transfer you." ;
	close2;
	warp "ac_cl_room.gat",44,59; end;
L_WHERE:
	set '@gatname$,getmapname("");
	for(set '@i,0; 'mapname$['@i]!='@gatname$; set '@i,'@i+1){}
	set '@mapnumber,'@i;
	mes "So you want to know about this area." ;
	callfunc "ac_map_info", '@mapnumber;
	end;
L_GIVEBOOK:
	mes "[Academy Official]";
	mes "It's a book of professions." ;
	mes "Yes, here you go. Whenever you need it, just let me know." ;
	if(checkweight(11055,1)) {
		switch(Job){
			case Job_Swordman:    getitem 11025,1; break; //Swordsmanの書
			case Job_Thief:       getitem 11028,1; break; //Thiefの書
			case Job_Archer:      getitem 11031,1; break; //Archerの書
			case Job_Acolyte:     getitem 11034,1; break; //Acolyteの書
			case Job_Magician:    getitem 11037,1; break; //Magicianの書
			case Job_Merchant:    getitem 11040,1; break; //Merchantの書
			case Job_TaeKwon:     getitem 11043,1; break; //Taekwon Kidの書
			case Job_Ninja:       getitem 11046,1; break; //Ninjaの書
			case Job_Gunslinger:  getitem 11049,1; break; //Gunslingerの書
			case Job_SuperNovice: getitem 11052,1; break; //Supernoviceの書
			default: getitem 11055,1;
		}
		close;
	}
	next;
	mes "[Academy Official]";
	mes "......";
	mes "Oh, I can't give you the Book of Occupations because your bags are so full." ;
	mes "Please talk to me again after you reduce your baggage." ;
	close;
L_CANCEL:
	mes "[Academy Official]";
	mes "I see." ;
	mes "Whenever you're ready, just give me a shout and I'll send you on your way." ;
	close;
OnTouch:
	if(AC_JOBCHANGE){
		set AC_JOBCHANGE,0;
		if(!callfunc("AC_GetNovice")) end;
		mes "[Academy Official]";
		mes "Hello." ;
		mes "I'm the new adventurers' representative at the Adventurer Academy, and I'm here to help fledgling adventurers get started in their new job." ;
		next;
		if(BaseLevel<=55 && Job==Job_Novice && Upper!=1){
			mes "[Academy Official]";
			mes "Huh?" ;
			mes "I guess you didn't get your new job." ;
			mes " ";
			mes "You need to change your ^0000FF "Basic Skill" level to 9 ^000000 if you want to change to the first job." ;
			emotion 0;
			next;
			mes "[Academy Official]";
			mes "Would you like to go get a new job?" ;
			mes "Or do you want to go back to the Adventurer's Academy?" ;
			next;
			if(select("I'm going to change to the first job", "Return to the academy")==2){
				mes "[Academy Official]";
				mes "Then I'll transfer you to the Adventurer's Academy." ;
				close2;
				warp "ac_cl_room",44,59;
				end;
			}
		} else {
			mes "[Academy Official]";
			mes "I heard about you from Ella." ;
			mes "I see you have successfully changed jobs." ;
			mes "Congratulations!" ;
			emotion 46;
			next;
			mes "[Academy Official]";
			mes "The Adventurer Academy is a good place for fledgling adventurers to grow." ;
			mes " ";
			mes "Would you like to go back to the Adventurers Academy soon?" ;
			next;
			if(select("Return to Academy", "Do not return to Academy")==1){
				mes "[Academy Official]";
				mes "Then I'll transfer you to the Adventurers Academy." ;
				close2;
				warp "ac_cl_room",44,59;
				end;
			}
		}
		mes "[Academy Official]";
		mes "I'll send you to the Adventurer's Academy anytime, so when you change jobs, come back and see me." ;
		close;
	}
	end;
OnInit:
	setarray 'mapname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat","aldebaran.gat","yuno.gat","umbala.gat","comodo.gat","hugel.gat","rachel.gat","lighthalzen.gat","veins.gat","gonryun.gat","louyang.gat","ayothaya.gat","moc_prybd1.gat","einbroch.gat","amatsu.gat","pay_arche.gat";
	if(strnpcinfo(2)!="func") waitingroom "First Job Change Support",0;
}
izlude.gat,56,139,4			duplicate(Academy Support#func)	Academy Support#SWD	750,5,5
geffen.gat,65,170,4			duplicate(Academy Support#func)	Academy Support#MGI	750,5,7
prontera.gat,238,313,4		duplicate(Academy Support#func)	Academy Support#ACO	750,5,5
pay_arche.gat,141,165,4		duplicate(Academy Support#func)	Academy Support#ARC	750,5,5
moc_prydb1.gat,52,132,4		duplicate(Academy Support#func)	Academy Support#SHF	750
alberta.gat,46,46,4			duplicate(Academy Support#func)	Academy Support#MRC	750,5,5
payon.gat,161,135,4			duplicate(Academy Support#func)	Academy Support#TKW	750
einbroch.gat,131,196,4		duplicate(Academy Support#func)	Academy Support#GUN	750,5,5
amatsu.gat,151,139,4		duplicate(Academy Support#func)	Academy Support#NIN	750,5,5
aldebaran.gat,108,70,4		duplicate(Academy Support#func)	Academy Support#SNV	750,5,5
