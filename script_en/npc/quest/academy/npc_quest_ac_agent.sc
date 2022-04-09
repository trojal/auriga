//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Academy Official
// by Pneuma
//------------------------------------------------------------

//----------------------------------
// region description -- arg1=mapno
function	script	ac_map_info	{
	switch(getarg(0)) {
	case 0:// Prontera
		cutin "area_map_002",3;
		mes "This is the capital of the Kingdom of Rune-Midgarts.";
		mes "The city of ^0000FFProntera^000000";
		close;
	case 1:// Izlude
		cutin "area_map_006",3;
		mes "This city is a satellite city of the capital Prontera ^0000FFIzlude^000000";
		close;
	case 2:// Morroc
		cutin "area_map_009",3;
		mes "[Academy Official]";
		mes "This is an oasis town in the Sograt Desert southwest of Prontera.";
		mes "^0000FFMorroc^000000";
		next;
		mes "[Academy Official]";
		mes "However, this is what it looks like now: ......";
		mes "The city's oasis is gone without a trace.";
		mes "Look, the east side of the city has become quite dangerous.";
		mes "It would be foolhardy to cross the desert on your own toward Prontera or Payon.";
		next;
		mes "[Academy Official]";
		mes "If you want to move, use the transfer.";
		close;
	case 3:// Alberta
		cutin "area_map_007",3;
		mes "This is the port town ^0000FFAlberta^000000";
		close;
	case 4:// Geffen
		cutin "area_map_003",3;
		mes "This is a magical city ^0000FFGeffen^000000";
		close;
	case 5:// Payon
		cutin "area_map_007",3;
		mes "This is a mountain city surrounded by greenery^0000FFPayon^000000";
		close;
	case 6://Aldebaran
		cutin "area_map_002",3;
		mes "This is the city of ^0000FFAldebaran^000000 located north of Prontera";
		close;
	case 7://Yuno
		cutin "area_map_005",3;
		mes "This city is the capital of the Republic of Schwartzvald ^0000FFYuno^000000";
		close;
	case 8://Umbala
		cutin "area_map_004",3;
		mes "This is a village of the Wu-Tang tribe where trees grow thick and nature is abundant."; //As in the main mackerel
		mes "^0000FFUmbala^000000";
		close;
	case 9://Comodo
		cutin "area_map_004",3;
		mes "This is the southernmost cave city in the Kingdom of Rune-Midgarts ^0000FFComodo^000000";
		close;
	case 10://Hugel
		cutin "area_map_005",3;
		mes "This is a rural city located in the north of the Republic of Schwartzvald ^0000FFHugel^000000";
		close;
	case 11://Rachel
		cutin "area_map_010",3;
		mes "This is the capital of the Arnabertsian State ^0000FFRachel^000000";
		close;
	case 12://Lighthalzen
		cutin "area_map_010",3;
		mes "This is a corporate city city located southwest of Einbroch"; //as per the main server
		mes "^0000FFLighthalzen^000000";
		close;
	case 13://Veins
		cutin "area_map_010",3;
		mes "This is a city ^0000FFVeins^000000, built between canyons and cliffs.";
	case 14://Gonryun
		mes "This is an archipelago-like island floating in the air.";
		mes "It is also a famous tourist destination ^0000FFGonryun^000000";
		close;
	case 15://Louyang
		mes "This is an ancient city with magnificent buildings soaring ^0000FFLouyang^000000";
		close;
	case 16://Ayothaya
		mes "This place is inhabited by a group of people with a unique faith ^0000FFAyothaya^000000";
		close;
	case 17://Pyramid basement
		cutin "area_map_009",3;
		mes "This is the Thief guild in the Pira Mido dungeon, northwest of ^0000FFMorroc^000000";
		close;
	case 18://Einbroch
		cutin "area_map_005",3;
		mes "This is an industrial city^0000FFEinbroch^000000";
		close;
	case 19://Amatsu
		mes "This is a picturesque land surrounded by abundant water and magnificent cherry blossoms^0000FFAmatsu^000000";
		close;
	case 20://Archer Village
		cutin "area_map_007",3;
		mes "This is Archer Village in the green mountain city ^0000FFPayon^000000";
		close;
	case 21://Einbech
		cutin "area_map_005",3;
		mes "This is a miners' village, ^0000FFEinbech^000000";
		close;
	}
	return;
}

//----------------------------------
// Academy Official (Admissions)
// Auriga is also a compass NPC because OnTouch duplication is not allowed

-	script	Academy Official#func	-1,{
	function WARP_ACADEMY;
	function JOIN_ACADEMY;
	function DORAM_ACADEMY;

	set '@novice,callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	while ('save_gatname$['@mapnumber]!='@gatname$) set '@mapnumber,'@mapnumber+1;

	if(Job == Job_Summoner){ // for Doram tribe only
		DORAM_ACADEMY;
		end;
	} else
	if (AC_PASSPORT==0){ // not enrolled
		JOIN_ACADEMY;
		END;
	} else
	if(AC_PASSPORT==1){ // provisionally enrolled
		WARP_ACADEMY;
		end;
	}

	if('@novice){
		mes "[Academy Official]";
		mes "Hello.";
		mes "How are you doing?";
		mes "Are you going to the Adventurer Academy?";
	} else {
		mes "[Academy Official]";
		mes "Hello!";
		mes "We have received donations of ^0000FF1000^000000Zeny from skilled adventurers.";
		mes "Shall I transfer you to the Adventurer's Academy?";
	}
	next;
	switch(select("I want to be transferred", "I want to know about the area", "Nothing")){
	case 1:
		WARP_ACADEMY;
		end;
	case 2:
		mes "[Academy Official]";
		mes "You want to know about this area.";
		callfunc "ac_map_info", '@mapnumber;
		end;
	default:
		mes "[Academy Official]";
		mes "I see.";
		mes "Anytime, just give me a shout and I'll send you right over.";
		close;
	}

	function WARP_ACADEMY {
		set '@novice,callfunc("AC_GetNovice");
		if(!'@novice && AC_PASSPORT!=1){ //Free if already provisionally enrolled
			set '@price,(AC_PASSPORT ? 1000 : 2000);
			if (Zeny<'@price) {
				mes "[Academy Official]";
				mes "Huh?";
				mes "It looks like you don't have enough money.";
				mes "I'm sorry, but you'll have to come back after we get together.";
				close;
			}
			set Zeny, Zeny - '@price;
		}
		mes "[Academy Official]";
		if(AC_PASSPORT==1){
			// Displayed only if provisionally enrolled and using butterflies after transfer.
			mes "You're enrolled.";
		}
		set AC_SAVE_MAP, '@mapnumber;
		mes "Then I'll transfer you to the Adventurer's Academy.";
		mes " -The base point of the academy is now ^FF0000" +'save_mapname$[AC_SAVE_MAP]+ "^000000-";
		close2;
		switch(AC_PASSPORT){
		case 0:
			set AC_PASSPORT,1; //tentative acceptance of admission
		case 1:
			warp "ac_cl_room.gat",44,32;
			break;
		default:
			if('@novice) warp "ac_cl_area.gat",67,155;
			else warp "ac_en_hall.gat",97,12;
		}
		return;
	}

	function JOIN_ACADEMY {
		set '@novice,callfunc("AC_GetNovice");
		if ('@novice) {
			if(getarg(0)){
				mes "[Academy Official]";
				mes "Oh?";
				mes "You're the new guy.";
				mes "Would you like to enroll in the Adventurer Academy?";
			} else {
				mes "[Academy Official]";
				mes "Hello.";
				mes "We're looking for new students right now.";
				mes "Would you like to enroll in the Adventurer Academy?";
			}
			next;
			menu "Adventurer Academy?" ,-;
			mes "[Academy Official]";
			mes "The Adventurer Academy is an adventurer's school open to everyone from novice adventurers to seasoned adventurers.";
			next;
			mes "[Academy Official]";
			mes "By enrolling in the Academy, you can learn a lot of knowledge.";
			mes "You can get a lot of benefits by learning.";
			next;
			mes "[Academy Official]";
			mes "If you have any difficulties during your adventure, just ask the teachers and seniors at the academy and they will help you out.";
			next;
			mes "[Academy Official]";
			mes "I'm sure they will help you with the many difficulties that await you on your adventures.";
			mes "How's it going?";
			mes "Would you like to enroll in the Adventurer's Academy?";
		} else {
			mes "[Academy Official]";
			mes "Hello.";
			mes "We're looking for new students right now.";
			mes "We can take in experienced and skilled people, but we do take donations.";
			mes "Would you like to enroll in the Adventurer Academy?";
			next;
			switch(select("do not enroll", "enroll", "What is the Adventurer Academy?")) {
			case 1:
				mes "[Academy Official]";
				mes "I see.";
				mes "You can always enroll in the Adventurer's Academy!";
				mes "If you have any questions, I suggest you enroll in the program.";
				close;
			case 2:
				mes "[Academy Official]";
				mes "I see.";
				mes "You seem like a skilled adventurer.";
				mes "The donation for admission is ^0000FF2000^000000Zeny.";
				mes "Would you like to enroll?";
				break;
			case 3:
				mes "[Academy Official]";
				mes "The Adventurer Academy is a school that provides support for adventurers.";
				mes "The Adventurers Academy is funded by donations.";
				mes "You can learn a lot of knowledge by enrolling in the Academy.";
				next;
				mes "[Academy Official]";
				mes "You can ask the teachers and seniors at the academy about any difficulties you may encounter during your adventures.";
				next;
				mes "[Academy Official]";
				mes "However, since there are only new teachers now, you may be in a better position to teach.";
				emotion 23,"";
				next;
				mes "[Academy Official]";
				mes "You get all kinds of perks for learning what you need to know for your adventure.";
				mes "The school that fully supports adventurers is the Adventurer Academy.";
				close;
			}
		}
		next;
		if(select("enroll", "do not enroll")==2){
			mes "[Academy Official]";
			mes "I see.";
			mes "You can always enroll in the Adventurer's Academy!";
			mes "If you have any questions, I suggest you enroll in the program.";
			close;
		}
		WARP_ACADEMY;
		return;
	}

	function DORAM_ACADEMY {
		mes "[Academy Official]";
		mes "Hello.";
		mes "We're looking for new students right now.";
		mes "You, Doram, are not allowed to enter the Adventurer Academy, but you are free to visit.";
		mes "Would you like to take a tour?";
		next;
		switch(select("do not visit", "visit", "What is the Adventurer Academy?")) {
		case 1:
			mes "[Academy Official]";
			mes "I see.";
			mes "It's the remaining ghost.";
			close;
		case 2:
			set AC_SAVE_MAP, '@mapnumber;
			mes "[Academy Official]";
			mes "Then, I'll transfer you to the Adventurers' Academy.";
			mes " -The academy's registration point is now ^FF0000" +'save_mapname$[AC_SAVE_MAP]+ "^000000-";
			close2;
			warp "ac_cl_room.gat",44,32;
			end;
		case 3:
			mes "[Academy Official]";
			mes "The Academy of Adventurers is a school that provides support for adventurers.";
			mes "The Adventurers Academy is funded by donations.";
			mes "By enrolling in the Academy, you can learn a lot of knowledge.";
			next;
			mes "[Academy Official]";
			mes "You can ask the teachers and seniors at the academy about any difficulties you may encounter during your adventures.";
			next;
			mes "[Academy Official]";
			mes "You can get various benefits by learning what you need for your adventure.";
			close;
		}
	}

OnTouch:
	set '@novice,callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	while ('save_gatname$['@mapnumber]!='@gatname$) set '@mapnumber,'@mapnumber + 1;

	if ('@novice && AC_PASSPORT==0) JOIN_ACADEMY 1;

	// display points on minimap (see npc_quest_ac_ontouch.txt for other areas)
	switch('@mapnumber){
	case 0://Prontera
		if(AC_RANK==1 && AC_RANKTEST==2){ //second course
			viewpoint 1,156,22,20,0xFFFFFF00;
		}
		if( (AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99)|| //Course 4
			(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99)){ //5th course
			viewpoint 1,22,203,20,0xFFFFFF00;
		}
		if( (AC_QUEST_LV_0==0 && AC_QUEST_ST_0==1)|| //that child you care about1
			(AC_QUEST_LV_0==1 && AC_QUEST_ST_0==1)|| //That child I care about 2
			(AC_QUEST_LV_0==2 && AC_QUEST_ST_0==1)|| //And that child 3
			(AC_QUEST_LV_0==3 && AC_QUEST_ST_0==1)|| //And that child 4
			(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==1)|| //And that child of concern 6
			(AC_QUEST_LV_0==6 && AC_QUEST_ST_0==1)|| //And that child I care about7
			(AC_QUEST_LV_0==7 && AC_QUEST_ST_0==3)){ //That child I care about8
			if(AC_QUEST_ST_0==1) cutin "q_run_npc_01.bmp", 4;
			viewpoint 1,146,232,10,0x0000FF; //Hal Bard
		}
		// East gate
		if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //I want to be an adventurer1
			viewpoint 1,289,203,14,0x00FFFF;
		}
		// South gate
		if( (AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2)|| //I want to be an adventurer2
			(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2)){ //I want to be an adventurer6
			viewpoint 1,156,22,14,0x00FFFF;
		}
		//West gate
		if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //I want to be an adventurer4
			(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) || //I want to be an adventurer7
			(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) ){ //I want to be an adventurer9
			viewpoint 1,22,203,14,0x00FFFF;
		}
		if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2) || //dungeon rescue1
			(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) || // Dungeon rescue 3
			(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) ){ //Assistance with experiments5
			viewpoint 1,22,203,13,0x00FF00;
		}
		end;
	case 1://Izlude
		if( AC_QUEST_ST_0==2 && AC_QUEST_LV_0==1){ //that girl I'm interested in2
			viewpoint 1,148,148,10,0x0000FF; //tool shop
		} else 
		if( (AC_QUEST_LV_0==7 && AC_QUEST_ST_0==1)|| //that child you care about8
			(AC_QUEST_LV_0==8 && AC_QUEST_ST_0==1)){ //that child I care about9
			cutin "q_run_npc_03.bmp", 4;
			viewpoint 1,137,156,10,0x0000FF; //Suzanne
		}
		if( AC_QUEST_LV_2==5 && AC_QUEST_ST_2==2){ //collect ingredients for sweets 4
			viewpoint 1,201,181,12,0xFF9900; //seafarer
		}
		if( (AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2) || //dungeon rescue2
			(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2) ){ //dungeon rescue 4
			viewpoint 1,201,181,13,0x00FF00; //seafarer
		}
		end;
	case 2://Morroc
		if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //Course 6
			viewpoint 1,160,17,20,0xFFFFFF00;
		}
		if( (AC_QUEST_LV_0==2 && AC_QUEST_ST_0==2)|| //that child you care about3
			(AC_QUEST_LV_0==4 && AC_QUEST_ST_0==3)){ //That child I care about5
			viewpoint 1,25,294,10,0x0000FF; //pila
		}
		if( (AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) || //I want to be an adventurer3
			(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) ){ //I want to be an adventurer5
			viewpoint 1,160,17,14,0x00FFFF;
		}
		if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //help with experiments2
			viewpoint 1,25,294,13,0x00FF00; //pyra
		}
		end;
	case 3://Alberta
		if(AC_RANK==0 && AC_RANKTEST==2){ //Course 1
			viewpoint 1,15,234,20,0xFFFFFF00;
		}
		if(AC_QUEST_ST_1){ //Chest of Miracles All episodes
			if(AC_QUEST_ST_1==1) cutin "q_run_npc_04.bmp", 4;
			viewpoint 1,39,46,11,0xFF0000;
		}
		end;
	case 4://Geffen
		if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //6th course
			viewpoint 1,217,119,20,0xFFFFFF00;
		}
		if(AC_QUEST_LV_0==3 && AC_QUEST_ST_0==2){ //that girl you care about 4
			viewpoint 1,172,174,10,0x0000FF; //Home of the attending physician (same house as Honest)
		}
		if(AC_QUEST_ST_4==1){ //I want to be an adventurer All chapters
			cutin "q_run_npc_09.bmp", 4;
			viewpoint 1,172,174,14,0x00FFFF;
		}
		if(AC_QUEST_LV_3==0 && AC_QUEST_ST_3==3){ //help with experiment 1
			viewpoint 1,26,119,13,0x00FF00;
		}
		end;
	case 5://Payon
		if(AC_RANK==2 && AC_RANKTEST==2){ //third course
			viewpoint 1,122,27,20,0xFFFFFF00; // Payon south
		}
		if(AC_RANK==5 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //Course 6
			viewpoint 1,267,89,20,0xFFFFFF00; // Payon East
		}
		if(AC_RANK==6 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //Course 7
			viewpoint 1,16,143,20,0xFFFFFF00; // Payon West
		}
		if(AC_QUEST_LV_0==4 && AC_QUEST_ST_0==1){ //that girl you care about5
			cutin "q_run_npc_02.bmp", 4;
			viewpoint 1,140,85,10,0x0000FF; //Gerald (tool shop)
		}
		if(AC_QUEST_LV_1==1 && AC_QUEST_ST_1==2){ //Chest of Miracles 2
			viewpoint 1,216,120,11,0xFF0000; //Lois
		}
		if(AC_QUEST_LV_2==8 && AC_QUEST_ST_2==2){ //I want to deliver an apology2
			viewpoint 1,165,99,12,0xFF9900; //Lias
		}
		if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){ //help with experiments3
			viewpoint 1,228,330,13,0x00FF00; // Archer VillageWP
		}
		if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){/// Help with experiment 4
			viewpoint 1,122,27,13,0x00FF00; // Payon South
		}
		end;
	}
	end;
OnInit:
	if(strnpcinfo(2)!="func") waitingroom "Academy Official",0;
	setarray 'save_gatname$, "prontera.gat", "izlude.gat", "morocc.gat", "alberta.gat", "geffen.gat", "payon.gat";
	setarray 'save_mapname$, "Prontera", "Izlude", "Morroc", "Alberta", "Geffen", "Payon";
}

prontera.gat,153,192,4	duplicate(Academy Official#func)	Academy Official::AC_PRO	750,8,8
izlude.gat,126,118,4	duplicate(Academy Official#func)	Academy Official::AC_IZL	750,8,8
geffen.gat,116,109,4	duplicate(Academy Official#func)	Academy Official::AC_GEF	750,8,8
morocc.gat,147,101,4	duplicate(Academy Official#func)	Academy Official::AC_MOR	750,8,8
payon.gat,159,205,4	duplicate(Academy Official#func)	Academy Official::AC_PAY	750,8,8
alberta.gat,107,132,4	duplicate(Academy Official#func)	Academy Official::AC_ALB	750,8,8

//-----------------------------------------
// Lune's quest assistant

-	script	Academy Official#func2	-1,{
	set '@novice, callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	for(set '@i,0; 'mapname$['@i]!='@gatname$; set '@i,'@i+1){}
	set '@mapnumber,'@i;

	if(AC_PASSPORT==0){
		mes "[Academy Official]";
		mes "Hello.";
		mes "I am an assistant at the Academy of Adventurers.";
		mes "What can I do for you?";
		next;
		if(select("About Adventurer Academy", "Nothing in particular")==2){
			mes "[Academy Official]";
			mes "Well, please come back if you need me again.";
			close;
		}
		mes "[Academy Official]";
		mes "The Adventurer Academy is a school for adventurers.";
		mes "By enrolling in the academy, you can learn a lot of knowledge.";
		mes "You can get various benefits by learning.";
		next;
		mes "[Academy Official]";
		mes "If you have any difficulties during your adventure, just ask the teachers and seniors at the Academy and they will help you out.";
		next;
		mes "[Academy Official]";
		mes "If you want to enroll in the Adventurer's Academy, please talk to the Academy Officials in Prontera, Morroc, Geffen, Payon, Alberta, and Izlude.";
		close;
	}
	mes "[Academy Official]";
	mes "Hello.";
	mes "You must be a student of the Academy of Adventurers.";

	//transfer check.
	set '@warpflag,0;
	if('@novice) {
		// unless the query is in progress and the client is on the map
		// They won't let you move to the academy.
		switch('@mapnumber){
		case 6: //Aldebaran
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==0)|| //to that person who helped me
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==1)|| //I want to deliver an apology1
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==7)|| //sweets delivery
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==8); //To deliver an apology 2
			break;
		case 7: //Yuno
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==1)|| //I want to deliver an apology1
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==2)|| //gathering ingredients for sweets1
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==3)|| //gathering ingredients for sweets2
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==4)|| //Collecting ingredients for sweets 3
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==5)|| //Collect ingredients for sweets 4
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==6)|| //collection of ingredients for sweets5
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==7); //delivery of sweets
			break;
		case 8: //Umbala
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==6); //box of miracles 7
			break;
		case 9: //Comodo
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==5)|| //that girl I care about6
							(AC_QUEST_ST_1 && AC_QUEST_LV_1==7); //box of miracles8
			break;
		case 10: //Hugel
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==8)|| //I want to deliver an apology2
							(AC_QUEST_ST_3); //help with experiments (all episodes)
			break;
		case 11: //Rachel
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==8); //that girl I care about9
			break;
		case 12: //Lighthalzen
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==2); //collect ingredients for sweets1
			break;
		case 13: //Veins
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==8); //that girl I'm interested in9
			break;
		case 14: //Gonryun
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==3); //box of miracles4
			break;
		case 15: //Louyang
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==4); //Chest of Miracles 5
			break;
		case 16: //Ayothaya
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==5); //Chest of Miracles 6
			break;
		case 18: //Amatsu
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==2); //Wonder Box 3
			break;
		case 19: //Einbroch
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==3); //collect ingredients for sweets2
			break;
		case 21: //Einbech
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==4); //collect ingredients for sweets3
			break;
		}
	}
	if('@warpflag){
		mes "Have you done your business with Lune yet?";
		mes "If you're done with your business, I'll transfer you to the Adventurer's Academy.";
		next;
		set '@sel, select("I want to be transferred", "I want to know about the area", "I have no special business");
	} else {
		mes "Is there something you want from me?";
		next;
		set '@sel, select("I want to know about the surroundings", "I have no special needs")+1;
	}
	switch('@sel){
	case 1:
		mes "[Academy Official]";
		mes "Here we go then!";
		close2;
		warp "ac_cl_area.gat",67,155;
		end;
	case 2:
		mes "[Academy Official]";
		mes "You want to know about this area.";
		callfunc "ac_map_info", '@mapnumber;
		end;
	default:
		mes "[Academy Official]";
		mes "Really?";
		mes "Come back if you need me again.";
		close;
	}
OnInit:
	setarray 'mapname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat","aldebaran.gat","yuno.gat","umbala.gat","comodo.gat","hugel.gat","rachel.gat","lighthalzen.gat","veins.gat","gonryun.gat","louyang.gat","ayothaya.gat","moc_prybd1.gat","amatsu.gat","einbroch.gat","pay_arche.gat","einbech.gat";
	if(strnpcinfo(2)!="func2") waitingroom "Academy Official",0;
}
aldebaran.gat,134,114,4	duplicate(Academy Official#func2)	Academy Official#ALD	883
yuno.gat,142,176,4	duplicate(Academy Official#func2)	Academy Official#YNO	883
umbala.gat,93,154,4	duplicate(Academy Official#func2)	Academy Official#UBR	883
comodo.gat,172,165,4	duplicate(Academy Official#func2)	Academy Official#CMD	883
hugel.gat,93,155,4	duplicate(Academy Official#func2)	Academy Official#HGL	883
rachel.gat,129,144,4	duplicate(Academy Official#func2)	Academy Official#RCL	883
lighthalzen.gat,219,161,4	duplicate(Academy Official#func2)	Academy Official#LTZ	883
veins.gat,197,133,4	duplicate(Academy Official#func2)	Academy Official#VNS	883
amatsu.gat,121,155,4	duplicate(Academy Official#func2)	Academy Official#AMA	883
gonryun.gat,174,134,4	duplicate(Academy Official#func2)	Academy Official#GON	883
louyang.gat,215,118,4	duplicate(Academy Official#func2)	Academy Official#LOU	883
ayothaya.gat,213,193,4	duplicate(Academy Official#func2)	Academy Official#AYO	883
einbroch.gat,223,182,4	duplicate(Academy Official#func2)	Academy Official#EIN	883
einbech.gat,171,137,4	duplicate(Academy Official#func2)	Academy Official#EIB	883

//----------------------------------
// Primary Job Support

-	script	Academy Support#func	-1,{
L_START:
	set '@novice, callfunc("AC_GetNovice");
	if ("SWD"==strnpcinfo(2)) set '@job$, "Swordsman";
	else if("MGI"==strnpcinfo(2)) set '@job$, "Magician";
	//else if("ACO"==strnpcinfo(2)) set '@job$, "Acolyte";
	else if("ARC"==strnpcinfo(2)) set '@job$, "Archer";
	else if("SHF"==strnpcinfo(2)) set '@job$, "Thief";
	//else if("MRC"==strnpcinfo(2)) set '@job$, "Merchant";
	else if("TKW"==strnpcinfo(2)) set '@job$, "Taekwon Kid";
	else if("GUN"==strnpcinfo(2)) set '@job$, "Gunslinger";
	else if("NIN"==strnpcinfo(2)) set '@job$, "Ninja";
	else if("SNV"==strnpcinfo(2)) set '@job$, "Supernovice";
	if('@job$==""){
		mes "[Academy Official]";
		mes "Hello.";
		mes "I'm the New Adventurers Officer at the Adventurer Academy, and I'm here to help fledgling adventurers get lost in their new job.";
	}
	else {
		mes "[Academy Official]";
		mes "Hello.";
		mes "I'm the new adventurer rep for the Adventurer Academy, and I support adventurers who are trying to become "+'@job$+" and those who have just become "+ '@job$+".";
	}
	if(!'@novice){
		next;
		mes "[Academy Official]";
		mes "You are now an accomplished adventurer.";
		mes "It seems you don't need my support.";
		close;
	}
	next;
	menu "I want to be forwarded to the academy.",L_WARP, "I want to know about the surrounding area.",L_WHERE, "I want a book of occupations.",L_GIVEBOOK, "Nothing.",L_CANCEL;
L_WARP:
	mes "[Academy Official]";
	mes "I'll forward it to you.";
	close2;
	warp "ac_cl_room.gat",44,59; end;
L_WHERE:
	set '@gatname$,getmapname("");
	for(set '@i,0; 'mapname$['@i]!='@gatname$; set '@i,'@i+1){}
	set '@mapnumber,'@i;
	mes "So you want to know about this area.";
	callfunc "ac_map_info", '@mapnumber;
	end;
L_GIVEBOOK:
	mes "[Academy Official]";
	mes "It's a book of professions.";
	mes "Yes, please.";
	mes "Whenever you need it, just let me know.";
	if(checkweight(11055,1)) {
		switch(Job){
			case Job_Swordman: getitem 11025,1; break; //Swordsman's book
			case Job_Thief: getitem 11028,1; break; //Thief's book
			case Job_Archer: getitem 11031,1; break; //Archer's book
			case Job_Acolyte: getitem 11034,1; break; //Acolyte's book
			case Job_Magician: getitem 11037,1; break; //Magician's book
			case Job_Merchant: getitem 11040,1; break; //The book of Merchant
			case Job_TaeKwon: getitem 11043,1; break; //Taekwon Kid's book
			case Job_Ninja: getitem 11046,1; break; //The Book of Ninja
			case Job_Gunslinger: getitem 11049,1; break; //Gunslinger's book
			case Job_SuperNovice: getitem 11052,1; break; //Writing of Supernovice
			default: getitem 11055,1;
		}
		close;
	}
	next;
	mes "[Academy Official]";
	mes "......";
	mes "Oh, I can't give you the Book of Occupations because your bags are full.";
	mes "Please talk to me again after you reduce the number of types of baggage.";
	close;
L_CANCEL:
	mes "[Academy Official]";
	mes "I see.";
	mes "Anytime, just give me a shout and I'll send you right over.";
	close;
OnTouch:
	if(AC_JOBCHANGE){
		set AC_JOBCHANGE,0;
		if(!callfunc("AC_GetNovice")) end;
		mes "[Academy Official]";
		mes "Hello.";
		mes "I'm the New Adventurers Officer at the Adventurer Academy, and I'm here to help fledgling adventurers get lost in their new job.";
		next;
		if(BaseLevel<=55 && Job==Job_Novice && Upper!=1){
			mes "[Academy Official]";
			mes "Huh?";
			mes "I guess you didn't get the new job.";
			mes "To change to the first job, you need ^0000FF \"Basic Skill\" level 9 ^000000.";
			emotion 0;
			next;
			mes "[Academy Official]";
			mes "Would you like to change jobs?";
			mes "Or would you like to return to the Adventurer's Academy?";
			next;
			if(select("I'm going to change to the first job", "Back to the academy")==2){
				mes "[Academy Official]";
				mes "Then I'll transfer you to the Adventurer's Academy.";
				close2;
				warp "ac_cl_room",44,59;
				end;
			}
		} else {
			mes "[Academy Official]";
			mes "Ella told me about you.";
			mes "I see you have successfully changed jobs.";
			mes "Congratulations!";
			EMOTION 46;
			next;
			mes "[Academy Official]";
			mes "The Adventurer Academy is a good place for fledgling adventurers to grow.";
			 ;
			next;
			if(select("return to academy", "do not return to academy")==1){
				mes "[Academy Official]";
				mes "Then I'll transfer you to the Academy of Adventurers.";
				close2;
				warp "ac_cl_room",44,59;
				end;
			}
		}
		mes "[Academy Official]";
		mes "I'll send you to the Adventurer's Academy anytime, so come back and see me when you change jobs.";
		close;
	}
	end;
OnInit:
	setarray 'mapname$, "prontera.gat", "izlude.gat", "morocc.gat", "alberta.gat", "geffen.gat", "payon.gat", "aldebaran.gat", "yuno.gat", "umbala.gat", "comodo.gat", "hugel. gat", "rachel.gat", "lighthalzen.gat", "veins.gat", "gonryun.gat", "louyang.gat", "ayothaya.gat", "moc_prybd1.gat", "einbroch.gat", "amatsu.gat", "pay_arche.gat";
	if(strnpcinfo(2)!="func") waitingroom "primary job change support",0;
}
izlude.gat,56,139,4	duplicate(Academy Support#func)	Academy Support#SWD	750,5,5
geffen.gat,65,170,4	duplicate(Academy Support#func)	Academy Support#MGI	750,5,7
prontera.gat,238,313,4	duplicate(Academy Support#func)	Academy Support#ACO	750,5,5
pay_arche.gat,141,165,4	duplicate(Academy Support#func)	Academy Support#ARC	750,5,5
moc_prydb1.gat,52,132,4	duplicate(Academy Support#func)	Academy Support#SHF	750
alberta.gat,46,46,4	duplicate(Academy Support#func)	Academy Support#MRC	750,5,5
payon.gat,161,135,4	duplicate(Academy Support#func)	Academy Support#TKW	750
einbroch.gat,131,196,4	duplicate(Academy Support#func)	Academy Support#GUN	750,5,5
amatsu.gat,151,139,4	duplicate(Academy Support#func)	Academy Support#NIN	750,5,5
aldebaran.gat,108,70,4	duplicate(Academy Support#func)	Academy Support#SNV	750,5,5
