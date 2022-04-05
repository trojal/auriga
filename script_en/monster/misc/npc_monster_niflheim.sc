//= Auriga Script ==============================================================
// Ragnarok Online Niflheim Monster Spawn Script　　Ep 15.2
//==============================================================================

//============================================================
// 死者の街ニブルヘイム - niflheim.gat
//------------------------------------------------------------
niflheim.gat,0,0,0,0	monster	Quve	1508,75,5000,0,0
niflheim.gat,0,0,0,0	monster	Lude	1509,75,5000,0,0

niflheim.gat,0,0,0	script	#NifMVP	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer7980000:
	switch(rand(7)) {
	case 0:
		monster "niflheim.gat",327,193,"Lord of Death",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",330,193,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",324,193,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",327,196,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",327,190,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",324,190,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",330,190,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",324,196,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",330,196,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		break;
	case 1:
		monster "niflheim.gat",337,252,"Lord of Death",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",337,255,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",337,249,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",334,252,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",340,252,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",334,249,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",340,255,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",340,249,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",334,255,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		break;
	case 2:
		monster "niflheim.gat",190,185,"Lord of Death",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",190,188,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",190,182,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",193,185,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",187,185,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",187,182,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",193,182,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",193,188,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",187,188,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		break;
	case 3:
		monster "niflheim.gat",131,138,"Lord of Death",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",131,141,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",131,135,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",128,138,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",134,138,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",134,141,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",128,141,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",134,135,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",128,135,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		break;
	case 4:
		monster "niflheim.gat",311,64,"Lord of Death",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",311,67,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",311,61,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",308,64,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",314,64,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",314,61,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",314,67,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",308,67,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",308,61,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		break;
	case 5:
		monster "niflheim.gat",238,131,"Lord of Death",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",238,134,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",238,128,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",235,131,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",241,131,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",235,128,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",235,134,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",241,128,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",241,134,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		break;
	case 6:
		monster "niflheim.gat",86,219,"Lord of Death",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",86,222,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",86,216,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",89,219,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",83,219,"Bloody Murderer",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",89,222,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",89,216,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",83,222,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",83,216,"Loli Ruri",1505,1,"#NifMVP::OnKilled2";
		break;
	}
	monster "niflheim.gat",154,95,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",115,65,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",330,195,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",151,83,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",285,245,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",235,135,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",265,48,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",186,139,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",166,267,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",82,202,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",219,44,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",287,44,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",275,165,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",138,204,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",299,39,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",31,154,"Disguise",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",154,96,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",116,65,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",151,84,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",286,245,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",330,196,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",236,135,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",165,49,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",167,267,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",82,203,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",220,44,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",287,45,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",287,44,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",276,166,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",139,205,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",300,39,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",31,155,"Dullahan",1504,1,"#NifMVP::OnKilled2";
	stopnpctimer;
	end;
OnKilled1:
	killmonster "niflheim.gat","#NifMVP::OnKilled2";
	initnpctimer;
	end;
OnKilled2:
	end;	//ダミーイベント
}
