//= Auriga Script ==============================================================
// Ragnarok Online Lighthalzen Dungeon Monster Spawn Script　　Ep 15.2
//==============================================================================

//============================================================
// 生体工学研究所 01 - lhz_dun01.gat
//------------------------------------------------------------
lhz_dun01.gat,0,0,0,0		monster	Anopheles		1627,30,5000,0,0
lhz_dun01.gat,0,0,0,0		monster	Removal		1682,380,5000,0,0

//============================================================
// 生体工学研究所 02 - lhz_dun02.gat
//------------------------------------------------------------
lhz_dun02.gat,0,0,0,0		monster	Anopheles		1627,26,5000,0,0
lhz_dun02.gat,0,0,0,0		monster	Ygnizem	1652,46,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	Whikebain	1653,56,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	Armaia	1654,56,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	Erend		1655,46,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	Kavac	1656,26,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	Rawrel	1657,36,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	Ygnizem	1652,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	Whikebain	1653,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	Armaia	1654,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	Erend		1655,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	Kavac	1656,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	Rawrel	1657,4,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	Ygnizem	1652,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	Whikebain	1653,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	Armaia	1654,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	Erend		1655,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	Kavac	1656,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	Rawrel	1657,10,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	Gemini-S58		1681,10,1800000,0,0
lhz_dun02.gat,0,0,0,0		monster	Ygnizem	1658,1,7200000,5400000,1
//lhz_dun02.gat,0,0,0,0		monster	Wish Mascot	2441,1,14400000,18000000,1
//lhz_dun02.gat,0,0,0,0		monster	Artis Mascot	2442,1,14400000,18000000,1

//============================================================
// 生体工学研究所 03 - lhz_dun03.gat
//------------------------------------------------------------
lhz_dun03.gat,0,0,0,0	monster	Seyren	1634,20,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	Eremes		1635,10,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	Harword	1636,10,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	Magaleta	1637,20,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	Shecil		1638,20,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	Katrinn	1639,20,20000,0,0
lhz_dun03.gat,114,138,12,16	monster	Lord Knight Seyren	1640,1,600000,0,1
lhz_dun03.gat,163,138,12,16	monster	Whitesmith Harword	1642,1,600000,0,1
lhz_dun03.gat,139,158,20,11	monster	Assassin Cross Eremes		1641,1,600000,0,1
lhz_dun03.gat,139,117,20,11	monster	Sniper Shecil		1644,1,600000,0,1
lhz_dun03.gat,138,138,36,34	monster	High Priest Magaleta	1643,1,600000,0,1
lhz_dun03.gat,138,138,36,34	monster	High Wizard Katrinn	1645,1,600000,0,1

lhz_dun03.gat,0,0,0	script	#LhzMVP3	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer6000000:
OnTimer6300000:
OnTimer6600000:
OnTimer6900000:
OnTimer7200000:
OnTimer7500000:
	if(rand(6))
		end;
OnTimer7800000:
	stopnpctimer;
	switch(rand(6)) {
	case 0: set '@x,140; set '@y,232; break;
	case 1: set '@x,75; set '@y,138; break;
	case 2: set '@x,140; set '@y,87; break;
	case 3: set '@x,205; set '@y,140; break;
	case 4: set '@x,123; set '@y,137; break;
	case 5: set '@x,157; set '@y,137; break;
	}
	monster "lhz_dun03.gat",'@x,'@y,"--ja--",1646+rand(6),1,"#LhzMVP3::OnKilled";
	end;
OnKilled:
	switch(rand(6)) {
	case 0: set '@x,183; set '@y,97; break;
	case 1: set '@x,97; set '@y,96; break;
	case 2: set '@x,47; set '@y,139; break;
	case 3: set '@x,231; set '@y,140; break;
	case 4: set '@x,139; set '@y,211; break;
	case 5: set '@x,139; set '@y,259; break;
	}
	monster "lhz_dun03.gat",'@x,'@y,"--ja--",1640+rand(6),1;
	initnpctimer;
	end;
}

//============================================================
// 生体工学研究所 04 - lhz_dun04.gat
//------------------------------------------------------------
lhz_dun04.gat,0,0,0,0	monster	Randal	2221,40,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	Flamel	2222,30,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	Celia	2223,30,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	Chen	2224,20,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	Gertie	2225,20,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	Alphoccio	2226,10,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	Trentini	2227,10,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	Paladin Randel	2228,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	Biochemist Flamel	2229,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	Scholar Celia	2230,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	Champion Chen	2231,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	Stalker Gertie	2232,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	Minstel Alphoccio	2233,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	Gypsy Trentini	2234,1,600000,0,1

lhz_dun04.gat,0,0,0	script	#LhzMVP4	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer6000000:
OnTimer6300000:
OnTimer6600000:
OnTimer6900000:
OnTimer7200000:
OnTimer7500000:
	if(rand(6))
		end;
OnTimer7800000:
	stopnpctimer;
	switch(rand(7)) {
	case 0: set '@x,77; set '@y,251; break;
	case 1: set '@x,147; set '@y,224; break;
	case 2: set '@x,219; set '@y,219; break;
	case 3: set '@x,244; set '@y,120; break;
	case 4: set '@x,149; set '@y,41; break;
	case 5: set '@x,53; set '@y,109; break;
	case 6: set '@x,149; set '@y,151; break;
	}
	monster "lhz_dun04.gat",'@x,'@y,"--ja--",2235+rand(7),1,"#LhzMVP4::OnKilled";
	end;
OnKilled:
	switch(rand(7)) {
	case 0: set '@x,77; set '@y,251; break;
	case 1: set '@x,147; set '@y,224; break;
	case 2: set '@x,219; set '@y,219; break;
	case 3: set '@x,244; set '@y,120; break;
	case 4: set '@x,149; set '@y,41; break;
	case 5: set '@x,53; set '@y,109; break;
	case 6: set '@x,149; set '@y,151; break;
	}
	monster "lhz_dun04.gat",'@x,'@y,"--ja--",2228+rand(7),1;
	initnpctimer;
	end;
}
