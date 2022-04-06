//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- 冒険者アカデミー  実習室      by Pneuma
//------------------------------------------------------------

//----------------------------
// 旧実習室
//

//ac_cl_hall.gat,149,64,0	script	実習室A_WP	45,1,1,{
//	set '@novice, (BaseLevel<=25 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if(!'@novice) {
//		mes "‐Mido's note‐";
//		mes "この先は^FF0000Lv1～Lv25^000000の";
//		mes "冒険者専用の実習室になるよ！";
//		mes "^FF0000転生、2次職以上^000000の冒険者も";
//		mes "実習室には入れません。";
//		mes "駆け出しの冒険者を";
//		mes "サポートしてあげてね！";
//		close;
//	}
//	warp "ac_prac_a.gat",209,47;
//	end;
//}

//ac_cl_hall.gat,151,42,0	script	実習室B_WP	45,1,1,{
//	set '@novice, (BaseLevel>=20 && BaseLevel<=35 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if(!'@novice) {
//		mes "‐Mido's note‐";
//		mes "この先は^FF0000Lv20～Lv35^000000の";
//		mes "冒険者専用の実習室になるよ！";
//		mes "^FF0000転生、2次職以上^000000の冒険者も";
//		mes "実習室には入れません。";
//		mes "駆け出しの冒険者を";
//		mes "サポートしてあげてね！";
//		close;
//	}
//	warp "ac_prac_b.gat",0,0;
//	end;
//}

//ac_cl_hall.gat,182,21,0	script	実習室C_WP	45,1,1,{
//	set '@novice, (BaseLevel>=30 && BaseLevel<=45 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if(!'@novice) {
//		mes "‐Mido's note‐";
//		mes "この先は^FF0000Lv30～Lv45^000000の";
//		mes "冒険者専用の実習室になるよ！";
//		mes "^FF0000転生、2次職以上^000000の冒険者も";
//		mes "実習室には入れません。";
//		mes "駆け出しの冒険者を";
//		mes "サポートしてあげてね！";
//		close;
//	}
//	warp "ac_prac_c.gat",0,0;
//	end;
//}

ac_cl_hall.gat,167,53,0	script	磨り減った跡	111,{
	mes "-there is a sticker on the statue-";
	next;
	mes "[Mido's note]";
	mes "This practice room has been sealed off.";
	next;
	mes "-It looks like there was a practice room here-";
	close;
//2010/04/13削除
//	mes "‐磨り減ったレールのような";
//	mes "跡がある‐";
//	set '@novice, (BaseLevel>=40 && BaseLevel<=55 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if('@novice){
//		next;
//		mes "銅像を押してみますか？";
//		next;
//		if(select("押してみる","何もしない")==2){
//			mes "[" +strcharinfo(0)+ "]";
//			mes "（触るのはやめておこう……）";
//			close;
//		}
//		mes "[" +strcharinfo(0)+ "]";
//		mes "（なんだろう？）";
//		mes " ";
//		mes "‐銅像を力いっぱい押してみた‐";
//		close2;
//		warp "ac_prac_d.gat",104,20;
//		end;
//	}
//	close;
}

//----------------------------------
//実習室・特別室 転送装置
ac_cl_area.gat,57,185,4		script	Transfer Device#AC_PRACBD01	857,{
	set '@novice, callfunc("AC_GetNovice");
	mes "[Transfer Device]";
	mes "This is the entrance to the practice and special rooms." ;
	mes "Students who want to practice fighting monsters should go there." ;
	next;
	if(!'@novice) {
		mes "[Mido's note]";
		mes "This will be a training room for ^FF0000Lv1 to Lv55^000000 adventurers only!" ;
		mes "Adventurers and Dorams who are ^FF000000 transfers, 2nd degree or higher^000000 are not allowed in the training room." ;
		mes "Support our fledgling adventurers!" ;
		close;
	}
	switch(Job){
	case Job_Novice:
		mes "-Mido's note on the transfer device -";
		next;
		mes "[Mido's note]";
		mes "You can enter this training room after you change your job to the first level!" ;
		mes "^0000FFNovice^000000 students should go and change to ^0000FF1st job!^000000 The career change will be supported by ^FF000000Faye^000000 in the training room!" ;
		next;
		break;
	case Job_Gunslinger:
		mes "[Mido's note]";
		mes "Gunslinger students, don't forget to equip your ^0000FFbullets^000000!" ;
		mes "You can't attack monsters unless you have ^0000FFbullets^000000 equipped with a gun!" ;
		next;
		mes "[Mido's note]";
		mes "Students who are not equipped with bullets should click on the ^0000FF\"Etc\"^000000 tab in the ^0000FF\"Items in Possession\"^000000 window and drag and drop bullets to the ^0000FF\"Equipment Window\"^000000 to equip them!" ;
		next;
		mes "[Mido's note]";
		mes "If you don't find bullets in the ^0000FF\"etc\"^000000 tab, you can find the bullet case you got when you changed jobs in the ^0000FF\"item\"^000000 tab, double click on the bullet case and take out the bullets!" ;
		next;
		set '@hint,1;
		break;
	}
	menu "Go to lab/special room",L_PRAC, "Read Mido's note",L_ABOUT, "Do nothing",L_CANCEL;
L_PRAC:
	mes "[Transfer Device]";
	mes "Which way would you like to go?" ;
	mes " ";
	mes "-Laboratory and special rooms that you can go to are indicated by ^FF000000red^00000000 or ^0000FFblue^00000000-";
	next;
	set '@list$,"";
	for(set '@i,0; '@i<8; set '@i,'@i+1){
		if(BaseLevel>='LVREQUIRE['@i]){
			set '@list$,'@list$ + 'COLORSTR$['MAPNAMECL['@i]] + 'MAPLVSTR$['@i] + 'MAPNAME$['@i] + ":";
		} else {
			set '@list$,'@list$ + "^777777" + 'MAPLVSTR$['@i] + 'MAPNAME$['@i] + ":";
		}
	}
	set '@list$,'@list$ + "^000000I still have to prepare.";
	set '@num,select('@list$)-1;
	if('@num==8){
		mes "[" + strcharinfo(0) + "]";
		mes "(Let's go get ready)";
		close;
	}
	if(BaseLevel < 'LVREQUIRE['@num]){
		mes "[Transfer Device]";
		mes "You need ^0000FF" + ('LVREQUIRE['@num] - BaseLevel) + " more BaseLv^000000 to use this lab." ;
		next;
		goto L_PRAC;
	}
	savepoint "ac_cl_area.gat",53,180;
	mes "[Transfer Device]";
	mes "Transferring to ^FF0000" + 'MAPNAME$['@num] + "^000000.";
	mes " ";
	mes "-^000000FFsave position set^000000 in front of the entrance to the 1st floor lab of the classroom building-";
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
	mes "Use the ^0000FF recovery plate ^000000 in the lab and special rooms!" ;
	mes "You can recover ^0000FFHP and SP ^000000!" ;
	mes " ";
	mes "^0000FF attribute imparting effects^000000, so let's experience the different attribute effects! -";
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
	waitingroom "Entrance to the practice room",0;
	setarray 'MAPNAME$, "Lab (coast)", "Lab (island)", "Lab (plateau)", "Lab (mine)", "Lab (desert)", "Special Lab (lake)", "Special Lab (ruin)", "Special Lab (underground passage)";
	setarray 'MAPLVSTR$, "Lv1+ ", "Lv15+ ", "Lv25+ ", "Lv35+ ", "Lv45+ ", "Lv10+ ", "Lv10+ ", "Lv10+ ";
	setarray 'LVREQUIRE,1,15,25,35,45,10,10,10;
	setarray 'MAPNAMECL,0,0,0,0,0,1,1,1;
	setarray 'COLORSTR$,"^FF0000","^0000FF";
}
ac_cl_hall.gat,152,66,4		duplicate(Transfer Device#AC_PRACBD01)		Transfer Device#AC_PRACBD02	857
ac_cl_hall.gat,154,44,4		duplicate(Transfer Device#AC_PRACBD01)		Transfer Device#AC_PRACBD03	857
ac_cl_hall.gat,174,22,4		duplicate(Transfer Device#AC_PRACBD01)		Transfer Device#AC_PRACBD04	857
ac_cl_area.gat,57,187,0		duplicate(Transfer Device#AC_PRACBD01)		WP#AC_PRACBD01	45,1,1
ac_cl_hall.gat,149,64,0		duplicate(Transfer Device#AC_PRACBD01)		WP#AC_PRACBD02	45,1,1
ac_cl_hall.gat,151,42,0		duplicate(Transfer Device#AC_PRACBD01)		WP#AC_PRACBD03	45,1,1
ac_cl_hall.gat,182,21,0		duplicate(Transfer Device#AC_PRACBD01)		WP#AC_PRACBD04	45,1,1

//----------------------------------
// 実習室 立ち入り禁止看板
function	script	stopboard_func	{
	viewpoint 1,getarg(0),getarg(1),1,0xFF0000;
	mes "-No entry after this point-";
	mes " ";
	mes "-Students who get lost should rely on the \"^FF0000+^000000\" on the mini-map to come back.";
	close;
}
//実習室（海岸）
ac_prac_01.gat,299,57,4		script	#ac_exerboard_P11	837,{ callfunc "stopboard_func",225,31; }
ac_prac_01.gat,370,93,4		script	#ac_exerboard_P12	837,{ callfunc "stopboard_func",225,31; }
ac_prac_01.gat,22,59,4		script	#ac_exerboard_P13	837,{ callfunc "stopboard_func",225,31; }
//実習室（島）
ac_prac_02.gat,111,91,4		script	#ac_exerboard_P21	837,{ callfunc "stopboard_func",108,27; }
//実習室（高原）
ac_prac_03.gat,27,241,4		script	#ac_exerboard_P31	837,{ callfunc "stopboard_func",29,343; }
ac_prac_03.gat,191,236,4	script	#ac_exerboard_P32	837,{ callfunc "stopboard_func",29,343; }
//実習室（炭鉱）
ac_prac_04.gat,19,15,0		script	#ac_exerboard_P41	837,{ callfunc "stopboard_func",261,261; }
//実習室（砂漠）
ac_prac_05.gat,160,378,4	script	#ac_exerboard_P51	837,{ callfunc "stopboard_func",51,170; }
ac_prac_05.gat,380,308,4	script	#ac_exerboard_P52	837,{ callfunc "stopboard_func",51,170; }
//特別室（湖）
ac_spec_01.gat,371,345,4	script	#ac_exerboard_S11	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,35,26,4		script	#ac_exerboard_S12	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,17,172,4		script	#ac_exerboard_S13	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,378,168,4	script	#ac_exerboard_S14	837,{ callfunc "stopboard_func",283,34; }
//特別室（地下道）
ac_spec_03.gat,67,278,4		script	#ac_exerboard_S31	837,{ callfunc "stopboard_func",105,78; }

//----------------------------------
// Recovery Plate
-	script	Recovery Plate#func	-1,{
	setarray 'RECOVER_TIME,0,1,2,4,8;
	set '@time,(BaseLevel>20) * 'RECOVER_TIME[(BaseLevel-11)/10];
	mes "[Recovery Plate]";
	if(BaseLevel>60){
		set @AC_RECOVERTIME,0;
		mes "[Mido's note]";
		mes "-This Recovery Plate is a training machine for the ^FF000000 Adventurer Apprentice^000000 in training! -";
		mes " ";
		mes "-I'm not available to a full-fledged adventurer! -";
		close;
	}
	if(gettimetick(2) < @AC_RECOVERTIME) { //タイマーチェック
		set '@min,(((@AC_RECOVERTIME-gettimetick(2))/60) % 60);
		if('@min==0){
			mes "^FF0000 recovery startup preparation start ......^000000";
		} else {
			mes "^FF0000Recovery in approx. "+'@min+"min^000000";
		}
		mes " ";
		mes "-What do you do? -";
		next;
		menu "Read the warning",L_ABOUT, "Do nothing",L_CANCEL;
	} else {
		set @AC_RECOVERTIME,0;
		mes "^FF0000Recoverable^000000";
		mes " ";
		mes "-What do you do? -";
		next;
		menu "Perform recovery",-, "Read the warning",L_ABOUT, "Do nothing",L_CANCEL;
	}
	mes "[Recovery Plate]";
	mes "What attribute do you want to give? ^FF0000";
	mes "-Attribute assignment can be done with the weapon equipped-^000000";
	next;
	set '@num,select("Fire attribute", "Earth attribute", "Wind attribute", "Water attribute", "Holy attribute", "Poison attribute", "No attribute", "Do nothing");
	if('@num==8) goto L_CANCEL;
	mes "[Recovery Plate]";
	switch('@num) {
		case 1:
			npcskillsupport 280,4,"","";
			sc_start 90,1800000,5;
			mes "-^FF0000Fire^000000 attribute assigned -";
			break;
		case 2:
			npcskillsupport 283,4,"","";
			sc_start 93,1800000,5;
			mes "-^FF0000Earth^000000 attribute assigned-";
			break;
		case 3:
			npcskillsupport 282,4,"","";
			sc_start 92,1800000,5;
			mes "-^FF0000Wind^000000 attribute assigned-";
			break;
		case 4:
			npcskillsupport 281,4,"","";
			sc_start 91,1800000,5;
			mes "-^FF0000Water^000000 attribute assigned-";
			break;
		case 5:
			npcskillsupport 425,7,"","";
			sc_start 17,300000,5;
			mes "-^FF0000Holy^000000 attribute assigned-";
			break;
		case 6:
			npcskillsupport 138,10,"","";
			sc_start 6,900000,5;
			mes "-^FF0000Poison^000000 attribute assigned-";
			break;
		case 7:
			break;
	}
	mes "-HP, SP recovered-";
	set @AC_RECOVERTIME,gettimetick(2) + ('@time * 60); //タイマーセット
	misceffect 7,"";
	percentheal 100,100;
	close;
L_ABOUT:
	mes "[Mido's note]";
	mes "-This Recovery Plate is a training machine for adventurers in training! -";
	next;
	mes "[Mido's note]";
	if('@time>0)
		mes "-Now you can do ^FF0000 about" + '@time + "^000000 recovery every minute! -";
	else
		mes "-Now you can recover ^FF000000anytime^000000! -";
	mes " ";
	mes "-What is Recovery? -";
	mes "-It's about restoring HP, SP, and giving attributes! -";
	next;
	mes "[Mido's note]";
	mes "-The more advanced you are, the more ^FF0000 power you need^000000 when performing recovery! -";
	mes " ";
	mes "-Advanced users, beware that it takes time to recharge your power! -";
	next;
	mes "[Mido's note]";
	mes "-Attributes can be given in fire, earth, wind, water, poison, or holy! -";
	next;
	mes "[Mido's note]";
	mes "-Try different attributes! -^FF0000";
	mes "-Attributes can be applied while the weapon is equipped! -^000000";
	close;
L_CANCEL:
	mes "[Recovery Plate]";
	mes "-Operation cancelled-";
	close;
}
//実習室（海岸）
ac_prac_01.gat,236,51,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,52,30,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,322,179,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,141,130,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_01.gat,354,34,4		duplicate(Recovery Plate#func)	Recovery Plate	857

//実習室（島）
ac_prac_02.gat,116,58,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_02.gat,171,131,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_02.gat,58,150,4		duplicate(Recovery Plate#func)	Recovery Plate	857

//実習室（高原）
ac_prac_03.gat,46,310,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_03.gat,132,35,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_03.gat,26,90,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_03.gat,119,174,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//実習室（炭鉱）
ac_prac_04.gat,287,271,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,228,78,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,141,178,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,12,119,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,44,273,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_04.gat,119,32,4		duplicate(Recovery Plate#func)	Recovery Plate	857

//実習室（砂漠）
ac_prac_05.gat,150,323,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,229,288,3	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,357,252,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,229,204,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,120,178,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_prac_05.gat,264,112,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//特別室（湖）
ac_spec_01.gat,261,47,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,310,271,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,236,337,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,140,137,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,123,236,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_01.gat,232,121,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//特別室（廃墟）
ac_spec_02.gat,140,72,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,185,40,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,174,147,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,72,176,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,25,155,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,74,72,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,29,33,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_02.gat,120,130,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//特別室（地下道）
ac_spec_03.gat,140,168,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,204,46,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,73,220,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,283,275,4	duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,256,81,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,9,220,4		duplicate(Recovery Plate#func)	Recovery Plate	857
ac_spec_03.gat,194,179,4	duplicate(Recovery Plate#func)	Recovery Plate	857

//----------------------------------
-	script	Academy Box#func		-1,{
	mes "[Academy Box]";
	mes "... beep beep beep...";
	mes " ";
	mes "Academy Student confirmation complete, please select a function.";
	next;
	menu "Potion Exchange Service",L_POTION, "Entrance Transfer Service",L_TENSOU, "Academy Box Guide",L_HOWTO, "Cancel",L_CANCEL;
L_POTION:
	setarray '@potname$, "Potion for beginners", "Blue Potion for beginners", "Concentration potion", "Awakening potion";
	setarray '@potid,569,11518,645,656;
	mes "[Academy Box]";
	mes "Please select a potion to exchange";
	next;
	set '@num,select("Potion for beginners", "Blue potion for beginners", "Concentration potion", "Awakening potion", "Stop after all")-1;
	if('@num==4) goto L_CANCEL;
	mes "[Academy Box]";
	switch('@num){
	case 0:
		mes "Beginner's potion effect:";
		mes "HP recovery";
		next;
		setarray '@item,914,507,945;
		setarray '@amount,10,5,20;
		setarray '@amount2,25,50,100;
		setarray '@name$, "Fluff", "Red Herb", "Raccoon Leaf"; //タヌキの葉で本鯖通り
		break;
	case 1:
		mes "Blue potion for beginners";
		mes "Effect: SP recovery^FF0000";
		mes "*This item cannot be moved at all, including to storage^000000.";
		next;
		setarray '@item,1026,998,549;
		setarray '@amount,1,1,1;
		setarray '@amount2,1,2,5;
		setarray '@name$, "Acorn", "Iron", "Yam";
		break;
	case 2:
		mes "Concentration potion";
		mes "Lv limit:1 or higher";
		mes "Effect: Attack speed increase (small)";
		mes "Available primary occupation: 1st job";
		next;
		setarray '@item,940;
		setarray '@amount,30;
		setarray '@amount2,1;
		setarray '@name$, "Grasshopper's Leg";
		break;
	case 3:
		mes "Awakening potion";
		mes "Lvl limit:40 or higher";
		mes "Effect:Attack Speed Increase (Medium)";
		mes "Available primary jobs:";
		mes "Available Primary Occupations: Excluding Acolyte";
		next;
		setarray '@item,1018;
		setarray '@amount,15;
		setarray '@amount2,1;
		setarray '@name$, "Mole Claw";
		break;
	}
	mes "[Academy Box]";
	mes '@potname$['@num] + " exchange list";
	set '@select$,"";
	for(set '@i,0; '@i<getarraysize('@name$); set '@i,'@i+1){
		mes "　" + '@name$['@i] + ('@amount['@i]) + "=" + '@amount2['@i] + "";
		set '@select$,'@select$ + '@name$['@i] + ":";
	}
	set '@select$,'@select$ + '@name$['@i] + "Do not exchange";
	if('@num>1) mes " ";
	mes "Please select an item to exchange.";
	next;
	set '@trade,select('@select$)-1;
	if('@trade==getarraysize('@name$)) goto L_CANCEL;
	mes "[Academy Box]";
	mes '@name$['@trade] + ('@amount['@trade]) + " are exchanged for " +'@potname$['@num] + ('@amount2['@trade]) + ".";
	mes " ";
	mes "Is it alright?" ;
	next;
	menu "Yes",-, "Cancel",L_CANCEL;
	if(countitem('@item['@trade])<'@amount['@trade]){
		mes "[Academy Box]";
		mes "...thunk thunk...";
		mes " ";
		mes "We don't have enough items for the exchange";
		mes " ";
		mes "Please check and use the item again.";
		close;
	}
	if(!checkweight('@potid['@num],'@amount2['@trade])){
		mes "[Academy Box]";
		mes "...thunk thunk...";
		mes " ";
		mes "Weight is in excess.";
		mes " ";
		mes "Please use the item again after adjusting it.";
		close;
	}
	delitem '@item['@trade],'@amount['@trade];
	getitem '@potid['@num],'@amount2['@trade];
	mes "[Academy Box]";
	mes "...beep... beep beep beep!" ;
	mes " ";
	mes "(clunk, clunk)";
	mes " ";
	mes "Thank you for using our service.";
	close;
L_TENSOU:
	mes "[Academy Box]";
	mes "Two Jellopy are required to charge energy to transfer to the entrance of the Academy.";
	mes " ";
	mes "Do you want to use them?" ;
	next;
	menu "Yes",-, "Cancel",L_CANCEL;
	if(countitem(909)<2){
		mes "[Academy Box]";
		mes "...thunk thunk...";
		mes " ";
		mes "Jellopy is missing or wrong item type";
		mes " ";
		mes "Academy transfer has been aborted";
		close;
	}
	mes "[Academy Box]";
	mes "Ready to transfer.";
	close2;
	delitem 909,2;
	warp "ac_cl_area.gat",53,181;
	end;
L_HOWTO:
	mes "-In order to use the Academy Box, you must have the required number of items corresponding to each exchange list, but first you will be able to experience the functionality by defeating Poring and Fabre";
	mes " ";
	mes "said the guide‐";
	close;
L_CANCEL:
	mes "-Academy Box operation aborted-";
	close;
}
//実習室（海岸）
ac_prac_01.gat,236,56,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,52,35,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,141,125,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,317,174,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_01.gat,354,40,4		duplicate(Academy Box#func)	Academy Box	888

//実習室（島）
ac_prac_02.gat,111,58,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_02.gat,171,126,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_02.gat,56,145,4		duplicate(Academy Box#func)	Academy Box	888

//実習室（高原）
ac_prac_03.gat,42,306,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_03.gat,137,41,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_03.gat,26,85,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_03.gat,114,174,4	duplicate(Academy Box#func)	Academy Box	888

//実習室（炭鉱）
ac_prac_04.gat,279,279,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,223,88,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,145,177,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,19,119,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,49,269,4		duplicate(Academy Box#func)	Academy Box	888
ac_prac_04.gat,116,27,4		duplicate(Academy Box#func)	Academy Box	888

//実習室（砂漠）
ac_prac_05.gat,154,323,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,223,288,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,357,247,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,225,204,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,117,168,4	duplicate(Academy Box#func)	Academy Box	888
ac_prac_05.gat,256,103,4	duplicate(Academy Box#func)	Academy Box	888

//特別室（湖）
ac_spec_01.gat,265,52,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,310,277,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,240,333,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,134,144,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,128,236,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_01.gat,236,117,4	duplicate(Academy Box#func)	Academy Box	888

//特別室（廃墟）
ac_spec_02.gat,140,68,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,180,40,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,180,147,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,69,178,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,38,155,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,70,76,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,29,38,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_02.gat,123,133,4	duplicate(Academy Box#func)	Academy Box	888

//特別室（地下道）
ac_spec_03.gat,140,163,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,207,46,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,251,81,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,282,280,4	duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,73,216,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,9,216,4		duplicate(Academy Box#func)	Academy Box	888
ac_spec_03.gat,194,184,4	duplicate(Academy Box#func)	Academy Box	888
