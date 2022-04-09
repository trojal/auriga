//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Practice Room by Pneuma
//------------------------------------------------------------

//----------------------------
// Formerly Practice Room
//

//ac_cl_hall.gat,149,64,0	script	Practice RoomA_WP	45,1,1,{
// set '@novice, (BaseLevel<=25 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
// if(! @novice) {
// mes "-Mido's Notes-";
// mes "Beyond this point ^FF0000Lv1 to Lv25^000000"; // mes "-Mido's Notes-
// mes "This will be a Practice Room for adventurers only!";
// mes "^FF0000 reincarnation, 2nd and higher ^000000 adventurers too";
// mes "You cannot enter the Practice Room.";
// mes "fledgling adventurers";
// mes "Support them!";
// close;
// }
// warp "ac_prac_a.gat",209,47;
// end;
//}

//ac_cl_hall.gat,151,42,0	script	Practice RoomB_WP	45,1,1,{
// set '@novice, (BaseLevel>=20 && BaseLevel<=35 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
// if(! @novice) {
// mes "-Mido's Notes-";
// mes "Beyond this point ^FF0000Lv20 to Lv35^000000"; // mes "-Mido's Notes-
// mes "It's going to be a Practice Room for adventurers only!";
// mes "^FF0000 reincarnation, 2nd and higher ^000000 adventurers too";
// mes "You cannot enter the Practice Room.";
// mes "fledgling adventurers";
// mes "Support them!";
// close;
// }
// warp "ac_prac_b.gat",0,0;
// end;
//}

//ac_cl_hall.gat,182,21,0	script	Practice RoomC_WP	45,1,1,{
// set '@novice, (BaseLevel>=30 && BaseLevel<=45 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
// if(! @novice) {
// mes "-Mido's Notes-";
// mes "Beyond this point ^FF0000Lv30 to Lv45^000000"; // mes "-Mido's Notes-
// mes "It's going to be a Practice Room for adventurers only!";
// mes "^FF0000 reincarnation, 2nd and higher ^000000 adventurers too";
// mes "You cannot enter the Practice Room.";
// mes "fledgling adventurers";
// mes "Support them!";
// close;
// }
// warp "ac_prac_c.gat",0,0;
// end;
//}

ac_cl_hall.gat,167,53,0	script	Worn-out Track	111,{
	mes "-there is a sticker on the statue-";
	next;
	mes "[Mido's note]";
	mes "This Practice Room has been sealed off.";
	next;
	mes "-It looks like there was a Practice Room here-";
	close;
//2010/04/13 deleted.
// mes "-like a worn rail";
// mes "-traces-";
// set '@novice, (BaseLevel>=40 && BaseLevel<=55 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
// if('@novice){
// next;
// mes "Would you like to push the statue?";
// next;
// if(select("push", "do nothing")==2){
// mes "[" +strcharinfo(0)+ "]";
// mes "(Let's not touch ......)";
// close;
// }
// mes "[" +strcharinfo(0)+ "]";
// mes "(What is it?)";
// mes " ";
// mes "-I pushed the statue with all my might-";
// close2;
// warp "ac_prac_d.gat",104,20;
// end;
// }
// close;
}

//----------------------------------
//Practice Room, Special Room Transfer Device
ac_cl_area.gat,57,185,4	script	Transfer Device#AC_PRACBD01	857,{
	set '@novice, callfunc("AC_GetNovice");
	mes "[Transfer Device]";
	mes "This is the entrance to the Practice Room/Special Room.";
	mes "Students who want to practice fighting monsters should go there.";
	next;
	if(!'@novice) {
		mes "[Mido's note]";
		mes "This will be a Practice Room exclusively for adventurers from ^FF0000Lv1 to Lv55^000000!";
		mes "^FF0000Transfers, adventurers of the 2nd level or higher ^000000 and the Doram tribe are not allowed in the Practice Room.";
		mes "Support our fledgling adventurers!";
		close;
	}
	switch(Job){
	case Job_Novice:
		mes "-Transfer Device has Mido's note on it-";
		next;
		mes "[Mido's note]";
		mes "You can enter this Practice Room even if you change to the first job!";
		mes "^0000FF Novice ^000000 students should go change to ^0000FF 1st degree! The ^000000 career change will be supported by ^FF0000Faye^000000 in the training room!";
		next;
		break;
	case Job_Gunslinger:
		mes "[Mido notes]";
		mes "Gunslinger students don't forget to equip ^0000FF bullets ^000000!";
		mes "You can't attack monsters unless you have ^0000FF bullets^000000 equipped with a gun!";
		next;
		mes "[Mido notes]";
		mes "Students who do not have bullets equipped should click on the ^0000FF \"Etc\"^000000 tab in the ^0000FF \"Items in Possession\"^000000 window and drag and drop bullets to the ^0000FF \"Equipped Item Window\"^000000 to equip them!";
		next;
		mes "[Mido's note]";
		mes "If you don't find bullets in the ^0000FF \"etc\" ^000000 tab, you can find the bullet case you got when you changed jobs in the ^0000FF \"item\" ^000000 tab, double click on the bullet case and take out the bullets (barrettes)!";
		next;
		set '@hint,1;
		break;
	}
	menu "Go to Practice Room/Special Room",L_PRAC, "Read Mido's warning",L_ABOUT, "Do nothing",L_CANCEL;
L_PRAC:
	mes "[Transfer Device]";
	mes "Which way do you want to go?";
	mes " -Practice Rooms/Special Rooms that you can go to are indicated by ^FF0000 red ^000000 or ^0000FF blue ^000000-";
	next;
	set '@list$,"";
	for(set '@i,0; '@i<8; set '@i,'@i+1){
		if(BaseLevel>='LVREQUIRE['@i]){
			set '@list$,'@list$ + 'COLORSTR$['MAPNAMECL['@i]] + 'MAPLVSTR$['@i] + 'MAPNAME$['@i] + ":";
		} else {
			set '@list$,'@list$ + "^777777" + 'MAPLVSTR$['@i] + 'MAPNAME$['@i] + ":";
		}
	}
	set '@list$,'@list$ + "^000000 yet, there are things to prepare";
	set '@num,select('@list$)-1;
	if('@num==8){
		mes "[" + strcharinfo(0) + "]";
		mes "(Let's go get ready)";
		close;
	}
	if(BaseLevel < 'LVREQUIRE['@num]){
		mes "[Transfer Device]";
		mes "You need ^0000FFBaseLv after " + ('LVREQUIRE['@num] - BaseLevel) + "^000000 to use this Practice Room.";
		next;
		goto L_PRAC;
	}
	savepoint "ac_cl_area.gat",53,180;
	mes "[Transfer Device]";
	mes "^FF0000" + 'MAPNAME$['@num] + "Transfer to ^000000";
	mes " -^0000FFSave location has been set to ^000000 in front of the entrance to the classroom building 1 FPractice Room-";
	close2;
	switch('@num){
	case 0: warp "ac_prac_01.gat",225,31; end;
	case 1: warp "ac_prac_02.gat",108,33; end;
	case 2: warp "ac_prac_03.gat",29,337; end;
	case 3: warp "ac_prac_04.gat",261,261; end;
	case 4: warp "ac_prac_05.gat",57,170; end;
	case 5: warp "ac_spec_01.gat",283,34; end;
	case 6: warp "ac_spec_02.gat",124,59; end;
	case 7: warp "ac_spec_03.gat",98,78; end;
	}
L_ABOUT:
	mes "[Mido's note]";
	mes "Use ^0000FFRecovery Plate^000000 in Practice Room and Special Room!";
	mes "^0000FFHP and SP can be recovered^000000!";
	mes " ^0000FF attribute effects ^000000, so let's experience the difference in attribute effects! -";
	close;
L_CANCEL:
	mes "-did nothing-";
	close2;
	switch('@hint){
	case 1:
		cutin "start_035_jp.bmp", 4;
		break;
	}
	end;
OnInit:
	waitingroom "Entrance to Practice Room",0;
	setarray 'MAPNAME$, "Practice Room (coast)", "Practice Room (island)", "Practice Room (plateau)", "Practice Room (mine)", "Practice Room (desert)", "Special Room (lake)", "Special Room (ruin) (underground passage)", "Special room (underground passage)";
	setarray 'MAPLVSTR$, "Lv1+ ", "Lv15+ ", "Lv25+ ", "Lv35+ ", "Lv45+ ", "Lv10+ ", "Lv10+ ", "Lv10+ ";
	setarray 'LVREQUIRE,1,15,25,35,45,10,10,10;
	setarray 'MAPNAMECL,0,0,0,0,0,1,1,1;
	setarray 'COLORSTR$,"^FF0000","^0000FF";
}
ac_cl_hall.gat,152,66,4	duplicate(Transfer Device#AC_PRACBD01)	Transfer Device#AC_PRACBD02	857
ac_cl_hall.gat,154,44,4	duplicate(Transfer Device#AC_PRACBD01)	Transfer Device#AC_PRACBD03	857
ac_cl_hall.gat,174,22,4	duplicate(Transfer Device#AC_PRACBD01)	Transfer Device#AC_PRACBD04	857
ac_cl_area.gat,57,187,0	duplicate(Transfer Device#AC_PRACBD01)	WP#AC_PRACBD01	45,1,1
ac_cl_hall.gat,149,64,0	duplicate(Transfer Device#AC_PRACBD01)	WP#AC_PRACBD02	45,1,1
ac_cl_hall.gat,151,42,0	duplicate(Transfer Device#AC_PRACBD01)	WP#AC_PRACBD03	45,1,1
ac_cl_hall.gat,182,21,0	duplicate(Transfer Device#AC_PRACBD01)	WP#AC_PRACBD04	45,1,1

//----------------------------------
// Practice Room No Trespassing sign
function	script	stopboard_func	{
	viewpoint 1,getarg(0),getarg(1),1,0xFF0000;
	mes "-This area is off-limits-";
	mes " -Students who get lost should return by relying on the \"^FF0000+^000000\" on the minimap-";
	close;
}
//Practice Room (Coastal)
ac_prac_01.gat,299,57,4	script	#ac_exerboard_P11	837,{ callfunc "stopboard_func",225,31; }
ac_prac_01.gat,370,93,4	script	#ac_exerboard_P12	837,{ callfunc "stopboard_func",225,31; }
ac_prac_01.gat,22,59,4	script	#ac_exerboard_P13	837,{ callfunc "stopboard_func",225,31; }
//Practice Room (Island)
ac_prac_02.gat,111,91,4	script	#ac_exerboard_P21	837,{ callfunc "stopboard_func",108,27; }
//Practice Room (Plateau)
ac_prac_03.gat,27,241,4	script	#ac_exerboard_P31	837,{ callfunc "stopboard_func",29,343; }
ac_prac_03.gat,191,236,4	script	#ac_exerboard_P32	837,{ callfunc "stopboard_func",29,343; }
//Practice Room (Coal Mine)
ac_prac_04.gat,19,15,0	script	#ac_exerboard_P41	837,{ callfunc "stopboard_func",261,261; }
//Practice Room (Desert)
ac_prac_05.gat,160,378,4	script	#ac_exerboard_P51	837,{ callfunc "stopboard_func",51,170; }
ac_prac_05.gat,380,308,4	script	#ac_exerboard_P52	837,{ callfunc "stopboard_func",51,170; }
// Special room (lake)
ac_spec_01.gat,371,345,4	script	#ac_exerboard_S11	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,35,26,4	script	#ac_exerboard_S12	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,17,172,4	script	#ac_exerboard_S13	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,378,168,4	script	#ac_exerboard_S14	837,{ callfunc "stopboard_func",283,34; }
//special room (underground passage)
ac_spec_03.gat,67,278,4	script	#ac_exerboard_S31	837,{ callfunc "stopboard_func",105,78; }

//----------------------------------
// Recovery Plate
-	script	Recovery Plate#func	-1,{
	setarray 'RECOVER_TIME,0,1,2,4,8;
	set '@time,(BaseLevel>20) * 'RECOVER_TIME[(BaseLevel-11)/10];
	mes "[Recovery Plate]";
	if(BaseLevel>60){
		set @AC_RECOVERTIME,0;
		mes "[Mido's note]";
		mes "-This Recovery Plate is a training machine for the ^FF0000 Adventurer Apprentice^000000 in training! -";
		mes " - - not available to full-fledged adventurers! -";
		close;
	}
	if(gettimetick(2) < @AC_RECOVERTIME) { //check timer
		set '@min,(((@AC_RECOVERTIME-gettimetick(2))/60) % 60);
		if('@min==0){
			mes "^FF0000 recovery startup preparation start ......^000000";
		} else {
			mes "^FF0000Recovery until approximately "+'@min+"minutes^000000";
		}
		mes " -What do you do? -";
		next;
		menu "Read the warning",L_ABOUT, "Do nothing",L_CANCEL;
	} else {
		set @AC_RECOVERTIME,0;
		mes "^FF0000Recoverable^000000-What do you do? -";
		next;
		menu "Perform recovery",-, "Read the warning",L_ABOUT, "Do nothing",L_CANCEL;
	}
	mes "[Recovery Plate]";
		mes "What attribute do you want to add?";
		mes "^FF0000-attribution can be given while the weapon is equipped-^000000";
	next;
	set '@num,select("Grant fire attribute", "Grant earth attribute", "Grant wind attribute", "Grant water attribute", "Grant holy attribute", "Grant poison attribute", "Do not grant attribute", "Do nothing");
	if('@num==8) goto L_CANCEL;
	mes "[Recovery Plate]";
	switch('@num) {
		case 1: npcskillsupport 280,4,"","";  sc_start 90,1800000,5; mes "-^FF0000 fire ^000000 attributes assigned-";break;
		case 2: npcskillsupport 283,4,"","";  sc_start 93,1800000,5; mes "-^FF0000 earth^000000 attributes were assigned-";break;
		case 3: npcskillsupport 282,4,"","";  sc_start 92,1800000,5; mes "-^FF0000 wind^000000 attributes were assigned-";break;
		case 4: npcskillsupport 281,4,"","";  sc_start 91,1800000,5; mes "-^FF0000 water^000000 attributes were assigned-";break;
		case 5: npcskillsupport 425,7,"","";  sc_start 17,300000,5;  mes "-^FF0000 holy^000000 attributes granted-";break;
		case 6: npcskillsupport 138,10,"",""; sc_start  6,900000,5;  mes "-^FF0000 poison^000000 attributes were granted-";break;
		case 7: break;
	}
	mes "-HP and SP recovered-";
	set @AC_RECOVERTIME,gettimetick(2) + ('@time * 60); //Timer set
	misceffect 7,"";
	percentheal 100,100;
	close;
L_ABOUT:
	mes "[Mido's note]";
	mes "-This Recovery Plate is a practice machine for adventurers in training! -";
	next;
	mes "[Mido's note]";
	if('@time>0) mes "- Now you are ^FF0000 about" + '@time + "^000000 every minute";
	else mes "-Now you ^FF0000 every ^000000 minutes";
	mes "You can do recovery! -";
	mes " -What is recovery? -";
	mes "-It means to restore HP, SP, and to give attributes! -";
	next;
	mes "[Mido notes]";
	mes "-The more advanced you get, the more ^FF0000 power you need^000000 when performing recovery! -";
	mes " -Advanced users, beware that it takes time to recharge your power! -";
	next;
	mes "[Mido notes]";
	mes "-Attribute grants can be fire, earth, wind, water, poison, holy! -";
	next;
	mes "[Mido's note]";
	mes "-Try different attributes! -^FF0000-Attributes can be applied while the weapon is equipped! -^000000";
	close;
L_CANCEL:
	mes "[Recovery Plate]";
	mes "-Operation canceled-";
	close;
}
//Practice Room (Coastal)
ac_prac_01.gat,236,51,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,52,30,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,322,179,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,141,130,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,354,34,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//Practice Room (Island)
ac_prac_02.gat,116,58,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_02.gat,171,131,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_02.gat,58,150,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//Practice Room (Plateau)
ac_prac_03.gat,46,310,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_03.gat,132,35,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_03.gat,26,90,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_03.gat,119,174,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//Practice Room (Coal Mine)
ac_prac_04.gat,287,271,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,228,78,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,141,178,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,12,119,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,44,273,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,119,32,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//Practice Room (Desert)
ac_prac_05.gat,150,323,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,229,288,3	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,357,252,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,229,204,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,120,178,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,264,112,4	duplicate(Recovery Plate#func)	Recovery Plate	857

// Special room (lake)
ac_spec_01.gat,261,47,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,310,271,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,236,337,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,140,137,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,123,236,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,232,121,4	duplicate(Recovery Plate#func)	Recovery Plate	857

// Special room (abandoned)
ac_spec_02.gat,140,72,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,185,40,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,174,147,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,72,176,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,25,155,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,74,72,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,29,33,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,120,130,4	duplicate(Recovery Plate#func)	Recovery Plate	857

// Special room (underground passage)
ac_spec_03.gat,140,168,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,204,46,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,73,220,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,283,275,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,256,81,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,9,220,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,194,179,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//----------------------------------
-	script	Academy Box#func	-1,{
	mes "[Academy Box]";
	mes "Vienna... beep beep...";
	
	next;
	menu "Potion Exchange Service",L_POTION, "Entrance Transfer Service",L_TENSOU, "Academy Box Guide",L_HOWTO, "I still stop",L_CANCEL;
L_POTION:
	setarray '@potname$, "Potion for beginners", "Blue potion for beginners", "Speed-up potion", "High speed potion";
	setarray '@potid,569,11518,645,656;
	mes "[Academy Box]";
	mes "Please select the potion you wish to exchange.";
	next;
	set '@num,select("Beginner potion", "Blue potion for beginners", "Speed up potion", "High speed potion", "Stop after all")-1;
	if('@num==4) goto L_CANCEL;
	mes "[Academy Box]";
	switch('@num){
	case 0:
		mes "Beginner's potion effect: HP recovery";
		next;
		setarray '@item,914,507,945;
		setarray '@amount,10,5,20;
		setarray '@amount2,25,50,100;
		setarray '@name$, "cotton wool", "red herb", "raccoon dog leaf"; //take the raccoon dog leaf and go to the main mackerel street
		break;
	case 1:
		mes "Blue potion for beginners: SP recovery^FF0000*This item cannot be moved at all, including to the warehouse^000000";
		next;
		setarray '@item,1026,998,549;
		setarray '@amount,1,1,1;
		setarray '@amount2,1,2,5;
		setarray '@name$, "acorn", "iron", "delicious baked potato";
		break;
	case 2:
		mes "speedup potion lvl limit:1 or more effect:attack speed increase (small) available na primary occupation:sveteno primary occupation";
		next;
		setarray '@item,940;
		setarray '@amount,30;
		setarray '@amount2,1;
		setarray '@name$, "Grasshopper legs";
		break;
	case 3:
		mes "High Speed PotionLvLimit:40+Effect:Attack Speed Increase (Medium)Available primary jobs:Acolyte wo 除クスベテノ1次職";
		next;
		setarray '@item,1018;
		setarray '@amount,15;
		setarray '@amount2,1;
		setarray '@name$, "Claws of the dragon";
		break;
	}
	mes "[Academy Box]";
	mes ""+'@potname$['@num] + " Exchange list";
	set '@select$,"";
	for(set '@i,0; '@i<getarraysize('@name$); set '@i,'@i+1){
		mes " " + '@name$['@i] + ('@amount['@i]) + "pieces = " + '@amount2['@i] + "pieces";
		set '@select$,'@select$ + '@name$['@i] + ":";
	}
	set '@select$,'@select$ + '@name$['@i] + "not exchange";
	if('@num>1) mes " ";
	mes "Select item(s) to exchange";
	next;
	set '@trade,select('@select$)-1;
	if('@trade==getarraysize('@name$)) goto L_CANCEL;
	mes "[Academy Box]";
	mes ""+'@name$['@trade] + ('@amount['@trade]) + "個 ヲ";
	mes '@potname$['@num] + ('@amount2['@trade]) + "個 ni";
	mes "Shima shimasu yoroshii desuka?";
	next;
	menu "Yes",-, "I still stop",L_CANCEL;
	if(countitem('@item['@trade])<'@amount['@trade]){
		mes "[Academy Box]";
		mes "Gagapi_...... Gagapi...";
		close;
	}
	if(!checkweight('@potid['@num],'@amount2['@trade])){
		mes "[Academy Box]";
		mes "Gagapi ...... Gagapi...";
		close;
	}
	delitem '@item['@trade],'@amount['@trade];
	getitem '@potid['@num],'@amount2['@trade];
	mes "[Academy Box]";
	mes "beep...beep!";
	mes "(colon, colon) Thank you for using our service";
	close;
L_TENSOU:
	mes "[Academy Box]";
	mes "Two zero peas are required to transfer energy to the entrance of the academy by charging the energy.";
	next;
	menu "Yes",-, "I still stop",L_CANCEL;
	if(countitem(909)<2){
		mes "[Academy Box]";
		mes "Gagapi...... Gagapi...";
		
		close;
	}
	mes "[Academy Box]";
	mes "Soere desha transfer shimasu";
	close2;
	delitem 909,2;
	warp "ac_cl_area.gat",53,181;
	end;
L_HOWTO:
	mes "-In order to use the Academy Box, you need to prepare the required number of items for each exchange list";
	close;
L_CANCEL:
	mes "-Academy Box operation was aborted-";
	close;
}
//Practice Room (Coast)
ac_prac_01.gat,236,56,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,52,35,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,141,125,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,317,174,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,354,40,4	duplicate(Academy Box#func)	Academy Box	888

//Practice Room (Island)
ac_prac_02.gat,111,58,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_02.gat,171,126,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_02.gat,56,145,4	duplicate(Academy Box#func)	Academy Box	888

//Practice Room (Plateau)
ac_prac_03.gat,42,306,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_03.gat,137,41,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_03.gat,26,85,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_03.gat,114,174,4	duplicate(Academy Box#func)	Academy Box	888

//Practice Room (Coal Mine)
ac_prac_04.gat,279,279,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,223,88,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,145,177,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,19,119,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,49,269,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,116,27,4	duplicate(Academy Box#func)	Academy Box	888

//Practice Room (Desert)
ac_prac_05.gat,154,323,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,223,288,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,357,247,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,225,204,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,117,168,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,256,103,4	duplicate(Academy Box#func)	Academy Box	888

// Special room (lake)
ac_spec_01.gat,265,52,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,310,277,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,240,333,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,134,144,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,128,236,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,236,117,4	duplicate(Academy Box#func)	Academy Box	888

// Special room (abandoned)
ac_spec_02.gat,140,68,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,180,40,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,180,147,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,69,178,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,38,155,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,70,76,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,29,38,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,123,133,4	duplicate(Academy Box#func)	Academy Box	888

// Special room (underground passage)
ac_spec_03.gat,140,163,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,207,46,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,251,81,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,282,280,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,73,216,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,9,216,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,194,184,4	duplicate(Academy Box#func)	Academy Box	888
