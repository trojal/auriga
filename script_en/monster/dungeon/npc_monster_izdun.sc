//= Auriga Script ==============================================================
// Ragnarok Online Izlude Dungeon Monster Spawn Script　　Ep 15.2
//==============================================================================

//============================================================
// イズルード海底洞窟 1層 - iz_dun00.gat
//------------------------------------------------------------
iz_dun00.gat,0,0,0,0	monster	Hydra		1068,50,5000,0,0
iz_dun00.gat,0,0,0,0	monster	Hydra		1068,20,60000,0,0
iz_dun00.gat,0,0,0,0	monster	Plankton	1161,60,5000,0,0
iz_dun00.gat,0,0,0,0	monster	Kukre		1070,20,5000,0,0
iz_dun00.gat,0,0,0,0	monster	Marina		1141,50,5000,0,0
iz_dun00.gat,0,0,0,0	monster	Vadon		1066,40,5000,0,0
iz_dun00.gat,0,0,0,0	monster	Black Mushroom	1084,5,180000,90000,1

//============================================================
// イズルード海底洞窟 2層 - iz_dun01.gat
//------------------------------------------------------------
iz_dun01.gat,0,0,0,0	monster	Hydra		1068,40,5000,0,0
iz_dun01.gat,0,0,0,0	monster	Kukre		1070,20,5000,0,0
iz_dun01.gat,0,0,0,0	monster	Vadon		1066,60,5000,0,0
iz_dun01.gat,0,0,0,0	monster	Marse		1144,40,5000,0,0
iz_dun01.gat,0,0,0,0	monster	Obeaune	1044,10,5000,0,0
iz_dun01.gat,0,0,0,0	monster	Cornutus	1067,50,5000,0,1
iz_dun01.gat,0,0,0,0	monster	Black Mushroom	1084,10,180000,90000,1

//============================================================
// イズルード海底洞窟 3層 - iz_dun02.gat
//------------------------------------------------------------
iz_dun02.gat,0,0,0,0	monster	Hydra		1068,30,5000,0,0
iz_dun02.gat,0,0,0,0	monster	Kukre		1070,10,5000,0,0
iz_dun02.gat,0,0,0,0	monster	Marse		1144,20,5000,0,0
iz_dun02.gat,0,0,0,0	monster	Obeaune	1044,100,5000,0,0
iz_dun02.gat,0,0,0,0	monster	Cornutus	1067,30,5000,0,0
iz_dun02.gat,0,0,0,0	monster	Merman		1264,100,5000,0,0
iz_dun02.gat,0,0,0,0	monster	Black Mushroom	1084,15,180000,90000,1

//============================================================
// イズルード海底洞窟 4層 - iz_dun03.gat
//------------------------------------------------------------
iz_dun03.gat,0,0,0,0	monster	Hydra			1068,50,5000,0,0
iz_dun03.gat,0,0,0,0	monster	Phen			1158,10,5000,0,0
iz_dun03.gat,0,0,0,0	monster	Marine Sphere	1142,10,5000,0,0
iz_dun03.gat,0,0,0,0	monster	Swordfish	1069,60,5000,0,0
iz_dun03.gat,0,0,0,0	monster	Strouf		1065,20,5000,0,0
iz_dun03.gat,0,0,0,0	monster	Marc			1045,50,5000,0,0
iz_dun03.gat,0,0,0,0	monster	Merman			1264,40,5000,0,0

iz_dun03.gat,0,0,0	script	#IzdunEVNT	-1,{
OnInit:
	set 'iz_monster,1158;
	initnpctimer;
	end;
OnTimer3600000:
	switch(rand(5)) {
		case 0: set 'iz_monster,1158; break;	//Phen
		case 1: set 'iz_monster,1069; break;	//Swordfish
		case 2: set 'iz_monster,1065; break;	//Strouf
		case 3: set 'iz_monster,1045; break;	//Marc
		case 4: set 'iz_monster,1264; break;	//Merman
	}
	areamonster "iz_dun03.gat",0,0,0,0,"--ja--",'iz_monster,80,"#IzdunEVNT::OnKilled";
	end;
OnKilled:
	if(getnpctimer(0) > 3600000 && getnpctimer(0) < 3900000){
		areamonster "iz_dun03.gat",0,0,0,0,"--ja--",'iz_monster,1,"#IzdunEVNT::OnKilled";
	}
	end;
OnTimer3900000:
	killmonster "iz_dun03.gat","#IzdunEVNT::OnKilled";
	initnpctimer;
	end;
}

//============================================================
// イズルード海底神殿 - iz_dun04.gat
//------------------------------------------------------------
iz_dun04.gat,0,0,0,0		monster	Marc		1045,60,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Obeaune	1044,100,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Strouf		1065,100,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Merman		2394,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Siren		2395,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Poseidon		2396,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Kraken Baby	2397,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Deviace	1108,6,5000,0,0
iz_dun04.gat,0,0,0,0		monster	Pot Dofle			2203,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	Sedora			2204,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	Sropho		2201,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	King Kray	2198,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	Penomena	1216,18,300000,0,0

//============================================================
// イズルード海底都市 - iz_dun05.gat
//------------------------------------------------------------
iz_dun05.gat,0,0,0,0	monster	Pot Dofle			2203,120,5000,0,0
iz_dun05.gat,0,0,0,0	monster	Sedora			2204,150,5000,0,0
iz_dun05.gat,0,0,0,0	monster	Sropho		2201,140,5000,0,0
iz_dun05.gat,0,0,0,0	monster	King Kray	2198,40,5000,0,0
iz_dun05.gat,0,0,0,0	monster	Takun			2205,20,60000,0,0

iz_dun05.gat,0,0,0	script	#IzdunMVP	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer7200000:
OnTimer7500000:
OnTimer7800000:
OnTimer8100000:
OnTimer8400000:
OnTimer8700000:
	if(rand(6))
		end;
OnTimer9000000:
	stopnpctimer;
	set 'kraken,5;
	set '@x,rand(55,75);
	set '@y,rand(70,90);
	set 'mob,callmonster("iz_dun05.gat",'@x,'@y,"Kraken",2202,"#IzdunMVP::OnKilled");
	monster "iz_dun05.gat",15,206,"Tentacles",2384,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",250,228,"Tentacles",2385,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",142,18,"Tentacles",2386,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",12,98,"Tentacles",2387,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",196,28,"Tentacles",2388,1,"#IzdunMVP::OnKilled2";
	end;
OnKilled:
	killmonster "iz_dun05.gat","#IzdunMVP::OnKilled2";
	initnpctimer;
	end;
OnKilled2:
	//テンタクルスを1体倒すごとにクラーケンの体力が20%が減少すると思われる
	if(getmobhp('mob)){
		setmobhp 'mob,getmobhp('mob) * 80 / 100;
		set 'kraken,'kraken-1;
		switch('kraken){
		case 0:
			announce "魔物の悲痛な叫びが海底に響いた。かなり弱っている!!", 0x9, 0xff8c00, 0x190, 12, 0, 0;
			break;
		case 1:
		case 2:
			announce "魔物の悲鳴が聞こえる。かなり苦しそうだ･･････", 0x9, 0xff8c00, 0x190, 12, 0, 0;
			break;
		case 3:
		case 4:
			announce "魔物のうめき声が聞こえる･･････", 0x9, 0xff8c00, 0x190, 12, 0, 0;
			break;
		}
	}
	end;
}
