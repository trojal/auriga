//= Auriga Script ==============================================================
// Ragnarok Online GvG Script - Nidavellir Guild 4	by Blaze
//==============================================================================

//============================================================
// GvGメイン処理
//------------------------------------------------------------
schg_cas04.gat,0,0,0	script	#AgitExe_N4	-1,{
OnAgitStart:
	callfunc "AgitEmperium",120,272,1;
	end;
OnAgitBreak:
	callfunc "AgitBreak","N4";
	callfunc "AgitBreakSE","N4";
	end;
OnAgitEliminate:
	callfunc "AgitEmperium",120,272,0;
	end;
OnAgitEnd:
	callfunc "AgitEnd";
	end;
OnGuildBreak:
	callfunc "AgitGiveUp","N4";
	end;
OnAgitSummon:
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1117,10;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1132,4;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1219,2;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1205,1;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1216,10;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1193,18;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1269,9;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1276,7;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1208,3;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1275,1;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1268,1;
	areamonster "schg_cas04.gat",0,0,0,0,"--ja--",1272,1;
	monster "schg_cas04.gat",120,272,"--ja--",1272,1;
	monster "schg_cas04.gat",120,272,"--ja--",1270,4;
	monster "schg_cas04.gat",120,272,"--ja--",1268,1;
	monster "schg_cas04.gat",120,272,"--ja--",1219,1;
	monster "schg_cas04.gat",120,272,"--ja--",1276,5;
	end;
}

//============================================================
// 宝箱
//------------------------------------------------------------
schg_cas04.gat,0,0,0	script	#AgitTreasure_N4	-1,{
OnClock0000:
	if('treasure_id[0] == 0) {
		setarray 'treasure_id,1324,1941;
		setarray 'treasure_x,388,388,388,387,386,385,384,384,384,384,384,384,385,386,387,388,389,390,390,390,389,388,387,386;
		setarray 'treasure_y,388,389,390,390,390,390,389,388,387,386,385,384,384,384,384,384,384,384,385,386,386,386,386,386;
	}
	callfunc "AgitTreasure",'treasure_id,'treasure_x,'treasure_y;
	end;
OnKilled:
	// dummy event
	end;
}

//============================================================
// 守備担当
//------------------------------------------------------------
schg_cas04.gat,123,306,3	script	Elzef#N4	868,{
	if('guardian1_x[0] == 0) {
		setarray 'guardian1_x,111,109,109, 65,109, 65,110,109, 65,110, 88,108;
		setarray 'guardian1_y, 18, 44, 44, 22, 44, 22, 40, 44, 22, 40, 20, 32;
		setarray 'guardian2_x,130,187,129,151,129,151,187,129,151,187,128,128;
		setarray 'guardian2_y, 22, 15, 47, 18, 47, 18, 15, 47, 18, 15, 42, 42;
	}
	callfunc "AgitGuard",'guardian1_x,'guardian1_y,'guardian2_x,'guardian2_y;
	close;
}

schg_cas04.gat,0,0,0	script	Guardian#N4	111,{
	end;
OnKilled1:
	set 'guardian1,'guardian1-1;
	if('guardian1 < 2)
		callfunc "AgitCallGuardian",1,0,120,37;
	end;
OnKilled2:
	set 'guardian2,'guardian2-1;
	if('guardian2 < 2)
		callfunc "AgitCallGuardian",2,0,151,18;
	end;
OnTimer300000:
	callfunc "AgitCallGuardian",1,1,65,40;
	end;
OnTimer600000:
	callfunc "AgitCallGuardian",2,0,152,43;
	end;
OnTimer900000:
	callfunc "AgitCallGuardian",1,2,47,43;
	end;
OnTimer1200000:
	callfunc "AgitCallGuardian",2,0,187,15;
	end;
OnTimer1800000:
	callfunc "AgitCallGuardian",1,3,109,44;
	end;
OnTimer2100000:
	callfunc "AgitCallGuardian",2,0,128,42;
	end;
OnTimer2700000:
	callfunc "AgitCallGuardian",1,4,111,18;
	end;
OnTimer3000000:
	callfunc "AgitCallGuardian",2,0,130,22;
	end;
OnTimer3600000:
	callfunc "AgitCallGuardian",1,5,112,32;
	end;
OnTimer3900000:
	callfunc "AgitCallGuardian",2,0,130,38;
	end;
OnAgitEnd:
	stopnpctimer;
	killmonster "schg_cas04.gat","Guardian#N4::OnKilled1";
	killmonster "schg_cas04.gat","Guardian#N4::OnKilled2";
	set 'guardian1,0;
	set 'guardian2,0;
	end;
}

//============================================================
// 守護石
//------------------------------------------------------------
schg_cas04.gat,0,0,0	script	GuardianStone1#N4	111,{
OnAgitStart:
OnRepair:
	callguardian "schg_cas04.gat",27,35,"--ja--",1907,1,"GuardianStone1#N4::OnKilled";
	set 'status,0;
	end;
OnKilled:
	callfunc "AgitStoneBreak",1;
	end;
OnSet:
OnTimer300000:
	hideoffnpc "1st Guardian Stone#N4";
	misceffect 247,"1st Guardian Stone#N4";
	set 'status,2;
	stopnpctimer;
	end;
OnAgitEnd:
	stopnpctimer;
	killmonster "schg_cas04.gat","GuardianStone1#N4::OnKilled";
	set 'status,0;
	end;
}

schg_cas04.gat,27,36,0	script	1st Guardian Stone#N4	844,{
	callfunc "AgitStone",1;
	close;
OnInit:
OnAgitEnd:
	hideonnpc;
	end;
}

schg_cas04.gat,0,0,0	script	GuardianStone2#N4	111,{
OnAgitStart:
OnRepair:
	callguardian "schg_cas04.gat",207,75,"--ja--",1908,1,"GuardianStone2#N4::OnKilled";
	set 'status,0;
	end;
OnKilled:
	callfunc "AgitStoneBreak",2;
	end;
OnSet:
OnTimer300000:
	hideoffnpc "Second Guardian Stone#N4";
	misceffect 247,"Second Guardian Stone#N4";
	set 'status,2;
	stopnpctimer;
	end;
OnAgitEnd:
	stopnpctimer;
	killmonster "schg_cas04.gat","GuardianStone2#N4::OnKilled";
	set 'status,0;
	end;
}

schg_cas04.gat,208,75,0	script	Second Guardian Stone#N4	844,{
	callfunc "AgitStone",2;
	close;
OnInit:
OnAgitEnd:
	hideonnpc;
	end;
}

//============================================================
// バリケード
//------------------------------------------------------------
schg_cas04.gat,0,0,0	script	Barricade#N4	111,{
OnSet:
OnAgitStart:
	areasetcell "schg_cas04.gat",114,48,126,48,1;
	callguardian "schg_cas04.gat",115,49," ",1905,1,"Barricade#N4::OnKilled";
	callguardian "schg_cas04.gat",117,49," ",1905,1,"Barricade#N4::OnKilled";
	callguardian "schg_cas04.gat",119,49," ",1905,1,"Barricade#N4::OnKilled";
	callguardian "schg_cas04.gat",121,49," ",1905,1,"Barricade#N4::OnKilled";
	callguardian "schg_cas04.gat",123,49," ",1905,1,"Barricade#N4::OnKilled";
	callguardian "schg_cas04.gat",125,49," ",1905,1,"Barricade#N4::OnKilled";
	end;
OnReset:
OnAgitEnd:
	areasetcell "schg_cas04.gat",114,48,126,48,0;
	killmonster "schg_cas04.gat","Barricade#N4::OnKilled";
	end;
OnKilled:
	end;
}

schg_cas04.gat,124,52,0	script	Control Unit01#N4	111,{
	callfunc "AgitBarricade";
	close;
OnSet:
OnAgitStart:
	set 'status,0;
	areasetcell "schg_cas04.gat",114,51,126,51,5;
	callguardian "schg_cas04.gat",115,50," ",1905,1,"Control Unit01#N4::OnKilled";
	callguardian "schg_cas04.gat",117,50," ",1905,1,"Control Unit01#N4::OnKilled";
	callguardian "schg_cas04.gat",119,50," ",1905,1,"Control Unit01#N4::OnKilled";
	callguardian "schg_cas04.gat",121,50," ",1905,1,"Control Unit01#N4::OnKilled";
	callguardian "schg_cas04.gat",123,50," ",1905,1,"Control Unit01#N4::OnKilled";
	callguardian "schg_cas04.gat",125,50," ",1905,1,"Control Unit01#N4::OnKilled";
	set 'count,6;
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'status,1;
	announce "The first barricade has been breached!",0x9,0xFF0000;
	areasetcell "schg_cas04.gat",114,51,126,51,0;
	killmonster "schg_cas04.gat","Control Unit01#N4::OnKilled";
	end;
OnReset:
OnAgitEnd:
	areasetcell "schg_cas04.gat",114,51,126,51,0;
	killmonster "schg_cas04.gat","Control Unit01#N4::OnKilled";
	set 'status,0;
	end;
}

schg_cas04.gat,128,157,0	script	Control Unit02#N4	111,{
	callfunc "AgitBarricade";
	close;
OnSet:
OnAgitStart:
	set 'status,0;
	areasetcell "schg_cas04.gat",114,154,126,154,5;
	callguardian "schg_cas04.gat",115,153," ",1905,1,"Control Unit02#N4::OnKilled";
	callguardian "schg_cas04.gat",117,153," ",1905,1,"Control Unit02#N4::OnKilled";
	callguardian "schg_cas04.gat",119,153," ",1905,1,"Control Unit02#N4::OnKilled";
	callguardian "schg_cas04.gat",121,153," ",1905,1,"Control Unit02#N4::OnKilled";
	callguardian "schg_cas04.gat",123,153," ",1905,1,"Control Unit02#N4::OnKilled";
	callguardian "schg_cas04.gat",125,153," ",1905,1,"Control Unit02#N4::OnKilled";
	set 'count,6;
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'status,1;
	announce "The second barricade has been breached!",0x9,0xFF0000;
	areasetcell "schg_cas04.gat",114,154,126,154,0;
	killmonster "schg_cas04.gat","Control Unit02#N4::OnKilled";
	end;
OnReset:
OnAgitEnd:
	areasetcell "schg_cas04.gat",114,154,126,154,0;
	killmonster "schg_cas04.gat","Control Unit02#N4::OnKilled";
	set 'status,0;
	end;
}

schg_cas04.gat,109,247,0	script	Control Unit03#N4	111,{
	callfunc "AgitBarricade";
	close;
OnSet:
OnAgitStart:
	set 'status,0;
	areasetcell "schg_cas04.gat",116,241,126,241,5;
	callguardian "schg_cas04.gat",116,240," ",1905,1,"Control Unit03#N4::OnKilled";
	callguardian "schg_cas04.gat",118,240," ",1905,1,"Control Unit03#N4::OnKilled";
	callguardian "schg_cas04.gat",120,240," ",1905,1,"Control Unit03#N4::OnKilled";
	callguardian "schg_cas04.gat",122,240," ",1905,1,"Control Unit03#N4::OnKilled";
	set 'count,4;
	end;
OnKilled:
	set 'count,'count-1;
	if('count > 0)
		end;
	set 'status,1;
	announce "The third barricade has been breached!",0x9,0xFF0000;
	areasetcell "schg_cas04.gat",116,241,126,241,0;
	killmonster "schg_cas04.gat","Control Unit03#N4::OnKilled";
	end;
OnReset:
OnAgitEnd:
	areasetcell "schg_cas04.gat",116,241,126,241,0;
	killmonster "schg_cas04.gat","Control Unit03#N4::OnKilled";
	set 'status,0;
	end;
}

//============================================================
// Link Flag(A)
//------------------------------------------------------------
schg_cas04.gat,106,302,0	script	LF-01#N4	111,{
	setarray '@code,1,2;	//"第1拠点","第2拠点"
	setarray '@x, 19,219;
	setarray '@y, 26, 90;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,109,302,0	script	LF-02#N4	111,{
	setarray '@code,11,12;	//"Defense Area 1-1","Defense Area 1-2"
	setarray '@x, 89,141;
	setarray '@y, 43, 45;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,112,302,0	script	LF-03#N4	111,{
	setarray '@code,13,14;	//"Defense Area 1-3","Defense Area 1-4"
	setarray '@x,137,102;
	setarray '@y, 54, 54;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,115,302,0	script	LF-04#N4	111,{
	setarray '@code,21,22;	//"Defense Area 2-1","Defense Area 2-2"
	setarray '@x, 94,163;
	setarray '@y,147,140;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,118,302,0	script	LF-05#N4	111,{
	setarray '@code,23,24;	//"Defense Area 2-3","Defense Area 2-4"
	setarray '@x, 87,151;
	setarray '@y,220,220;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,121,302,0	script	LF-06#N4	111,{
	setarray '@code,31,32;	//"Defense Area 3-1","Defense Area 3-2"
	setarray '@x,100,136;
	setarray '@y,242,242;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,124,302,0	script	LF-07#N4	111,{
	setarray '@code,101,102;	//"中央1区画","中央2区画"
	setarray '@x,120,119;
	setarray '@y,168,211;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,127,302,0	script	LF-08#N4	111,{
	setarray '@code,111,121,131;	//"Area 1-1","Area 2-1","Area 3-1"
	setarray '@x, 89, 94,100;
	setarray '@y, 43,147,242;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,130,302,0	script	LF-09#N4	111,{
	setarray '@code,112,122,132;	//"Area 1-2","Area 2-2","Area 3-2"
	setarray '@x,141,163,136;
	setarray '@y, 45,140,243;
	callfunc "AgitLinkFlagA",'@code,'@x,'@y;
	close;
}

schg_cas04.gat,133,302,0	script	LF-10#N4	111,{
	callfunc "AgitLinkFlagB",1,275,244;
	close;
}

//============================================================
// Link Flag(B)
//------------------------------------------------------------
-	script	#LinkFlag_N4	{
	callfunc "AgitLinkFlagB",0,120,290;
	close;
OnAgitInit:
OnFlagEmb_N4:
	if(substr(strnpcinfo(2),0,1) == "B")	//Guild Flag型ならエンブレム更新
		flagemblem getcastledata("schg_cas04.gat",1);
	end;
}
schg_cas04.gat,17,45,0		duplicate(#LinkFlag_N4)	Hljod#A01	111
schg_cas04.gat,207,95,0		duplicate(#LinkFlag_N4)	Hljod#A02	111
schg_cas04.gat,111,46,4		duplicate(#LinkFlag_N4)	Hljod#B03	722
schg_cas04.gat,129,46,4		duplicate(#LinkFlag_N4)	Hljod#B04	722
schg_cas04.gat,99,77,0		duplicate(#LinkFlag_N4)	Hljod#A05	111
schg_cas04.gat,140,77,0		duplicate(#LinkFlag_N4)	Hljod#A06	111
schg_cas04.gat,109,150,4	duplicate(#LinkFlag_N4)	Hljod#B07	722
schg_cas04.gat,130,150,4	duplicate(#LinkFlag_N4)	Hljod#B08	722
schg_cas04.gat,112,212,0	duplicate(#LinkFlag_N4)	Hljod#A09	111
schg_cas04.gat,127,212,0	duplicate(#LinkFlag_N4)	Hljod#A10	111
schg_cas04.gat,113,238,0	duplicate(#LinkFlag_N4)	Hljod#A11	111
schg_cas04.gat,126,238,0	duplicate(#LinkFlag_N4)	Hljod#A12	111
schg_cas04.gat,95,247,0		duplicate(#LinkFlag_N4)	Hljod#A13	111
schg_cas04.gat,144,247,0	duplicate(#LinkFlag_N4)	Hljod#A14	111

//============================================================
// Kafra Staff
//------------------------------------------------------------
schg_cas04.gat,300,287,5	script	Kafra Staff::AgitKafra_N4	117,{
	callfunc "AgitKafra",13;
	close;
OnAgitInit:
	if(getcastledata("schg_cas04.gat",9) == 0)
		hideonnpc;
	end;
}

//============================================================
// 執事
//------------------------------------------------------------
schg_cas04.gat,247,305,3	script	Butler	55,{
	callfunc "AgitSteward","N4",0,0,0,381,381;
	close;
}

//============================================================
// マスタールームのスイッチ
//------------------------------------------------------------
schg_cas04.gat,391,391,0	script	#AgitMaster_N4	111,{
	callfunc "AgitMaster",275,244;
	close;
}

//============================================================
// Guild Flag
//------------------------------------------------------------
-	script	#GldFlag_N4a	{
	callfunc "AgitEmblemFlag",2,"schg_cas04.gat",120,290;
	close;
OnAgitInit:
OnFlagEmb_N4:
	flagemblem getcastledata("schg_cas04.gat",1);
	end;
}
sch_gld.gat,134,97,4	duplicate(#GldFlag_N4a)	Hljod#a01	722
sch_gld.gat,141,97,4	duplicate(#GldFlag_N4a)	Hljod#a02	722

-	script	#GldFlag_N4b	{
	end;
OnAgitInit:
OnFlagEmb_N4:
	flagemblem getcastledata("schg_cas04.gat",1);
	end;
}
//yuno.gat,112,179,5	duplicate(#GldFlag_N4b)	Hljod#b01	722

//============================================================
// Mysterious Sunflower（アジトダンジョン）
//------------------------------------------------------------
schg_cas04.gat,280,391,3	script	Mysterious Sunflower#N4	976,{
	callfunc "AgitDungeonSE","schg_dun01.gat",212,70;
	close;
}
