//=========================================================================
// 執事一括ファンクション
//	callfunc "StewardMain","AgitCode",MasterRoomX,MasterRoomY;
//
// • parse終了処理
//	内部で全てclose,endしているが、ghostのため呼び出し後はendを入れる
//
// • function
//	「ガーディアン設置」の場合は function "GuardianCall"を、
//	「アジトを放棄する」の場合は function "AgitGiveUp" を呼び出す(npc_gvg_monster.txt)
//
//   ※ NPC名はstrnpcinfo()、NPCの居るMAP名はgetmapxy() を使って自前で取得
//-------------------------------------------------------------------------

function	script	StewardMain	{
	//挨拶部分
	function StewardSpeech {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
		set '@gid,getcastledata('@map$,1);
		if('@gid <= 0) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "I am waiting for the One who will be my Master, as fate leads me.";
			mes "If you are brave, why not try your fate once?";
			close;
		}
		if(getcharid(0) != getguildmasterid('@gid)) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "No matter how much you threaten me, I am my master ^ff0000" +getguildmaster('@gid)+ "I am a servant only to Master ^000000." ;
			mes "Where are the Guardians!" ;
			mes "Quickly banish these insolent people and others!" ;
			close;
		}
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Welcome back, ^FF0000" +strcharinfo(0)+ "Dear ^000000." ;
		mes "Please let us know if there is anything we can do for you." ;
		next;
		return;
	}

	//砦の状態を表示
	function StewardConf {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "We are pleased to report the status of the fort." ;
		mes " ^0000ffThe current commercial development value is " +getcastledata('@map$,2);
		if(getcastledata('@map$,4) != 0)
			mes "- within 1 day " +getcastledata('@map$,4)+ "invested." ;
		mes "The current defense value is " +getcastledata('@map$,3)+ ". ^000000";
		if(getcastledata('@map$,5) != 0)
			mes "^0000ff- Within 1 day " +getcastledata('@map$,5)+ "investment. ^000000 or more." ;
		return;
	}

	//商業発展に投資
	function StewardEco {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Increasing the commercial development value will increase the number of logistical goods produced by the guild, so you may want to invest for the future." ;
		next;
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Normally you can invest only once a day, but you can also invest a second time by paying an additional amount." ;
		next;
		set '@count,getcastledata('@map$,4);
		if('@count == 2) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "^ff0000But I have already made two investments today, so I can't make any more." ;
			mes "^000000We look forward to your continued growth." ;
			close;
		}
		set '@val,getcastledata('@map$,2);
		if('@val == 100) {	//未調査
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "^ff0000The commercial development value is currently the maximum value." ;
			mes "There is no need to invest now. ^000000";
		 	close;
		}
		set '@tmp,('@val-'@count)/5;
		set '@price,5000*(1+(1+'@tmp)*'@tmp/2)*(1+3*'@count);
		switch('@count) {
		case 0:
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "The current investment required is ^ff0000" +'@price+ "^000000 Zeny." ;
			mes "Would you like to invest?" ;
			break;
		case 1:
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "You have made one investment now, would you like to make an additional investment?" ;
			mes "In that case ^ff0000" +'@price+ "^000000 Zeny is required." ;
			break;
		}
		next;
		if(select("Invest in commercial development", "Cancel")==2) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Yes, sir." ;
			mes "There is no need to rush." ;
			mes "Please feel free to contact me again anytime." ;
			close;
		}
		if(Zeny < '@price) {	//未調査
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Master!" ;
			mes "I do not have enough money to invest." ;
			mes "The investment has been canceled." ;
			close;
		}
		set Zeny,Zeny-'@price;
		setcastledata '@map$,4,'@count+1;
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "I was able to invest successfully!" ;
		mes "I am looking forward to seeing more and more of your work in the future." ;
		mes "The development value will increase tomorrow." ;
		return;
	}

	//砦の防衛に投資
	function StewardDef {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Increasing the defense value improves the durability of the Guardian and Emperium." ;
		mes "It would be wise to strengthen them for the battle ahead." ;
		next;
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Normally you can invest only once a day, but you can also invest a second time by paying an additional amount." ;
		next;
		set '@count,getcastledata('@map$,5);
		if('@count == 2) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "^ff0000But I have already made two investments today, so I can't make any more." ;
			mes "^000000We look forward to your continued growth." ;
			close;
		}
		set '@val,getcastledata('@map$,3);
		if('@val == 100) {	//未調査
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "^ff0000Defense investment value is currently 100%." ;
			mes "No need to invest now. ^000000";
			close;
		}
		set '@tmp,('@val-'@count)/5;
		set '@price,10000*(1+(1+'@tmp)*'@tmp/2)*(1+3*'@count);
		switch('@count) {
		case 0:
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "The current investment required is ^ff0000" +'@price+ "^000000 Zeny." ;
			mes "Would you like to invest?" ;
			break;
		case 1:
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "You have made one investment now, would you like to make an additional investment?" ;
			mes "In that case ^ff0000" +'@price+ "^000000 Zeny is required." ;
			break;
		}
		next;
		if(select("Invest in Defense", "Cancel".)==2) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Yes, sir." ;
			mes "There is no need to rush." ;
			mes "Please feel free to contact me again anytime." ;
			close;
		}
		if(Zeny < '@price) {	//未調査
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Master!" ;
			mes "I do not have enough money to invest." ;
			mes "The investment has been canceled." ;
			close;
		}
		set Zeny,Zeny-'@price;
		setcastledata '@map$,5,'@count+1;
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "I was able to invest successfully!" ;
		mes "I am looking forward to seeing more and more of your work in the future." ;
		mes "The defense value will go up tomorrow." ;
		return;
	}

	//ガーディアン設置
	function StewardGuard {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Do you want to install a Guardian?" ;
		mes "The Guardian will be the protector of our fort." ;
		mes "Please select the Guardian you wish to install." ;
		next;
		//実際のMenu(B5参考)
		//menu 	"Archerガーディアン - 設置できます",L_MENU_1,"Archerガーディアン - 設置できます",L_MENU_2,
		//	"ソルジャーガーディアン - 設置できます",L_MENU_3,"ソルジャーガーディアン - 設置できます",L_MENU_4,
		//	"Knightガーディアン - 設置できます",L_MENU_5,"ソルジャーガーディアン - 設置できます",L_MENU_6,
		//	"Knightガーディアン - 設置できます",L_MENU_7,"マスターガーディアン - 設置できません (31214 / 31214)",L_MENU_8;
		//
		//設置できるか出来ないかの表示と、居た場合HPが表示される。
		//また、居た場合でも設置動作可能であり、その場合HPを回復させることが出来る。
		set '@ret,select("Gurdian 1","Gurdian 2","Gurdian 3","Gurdian 4","Gurdian 5","Gurdian 6","Gurdian 7","Gurdian 8")+9;
		if(getcastledata('@map$,'@ret)) {
			mes "[Butler "+strnpcinfo(0)+"]";	//未調査
			mes "Master!" ;
			mes "Guardian already in place." ;
			mes " Guardian installation has been canceled." ;
			close;
		}
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Do you really want to install the selected Guardian? Installation requires ^ff00001000000^000000Zeny." ;
		next;
		if(select("設置する","やめる")==2) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Yes, sir." ;
			mes "We encourage you to install this system when you have the funds to do so." ;
			close;
		}
		if(getgdskilllv(getcharid(2),10002) == 0) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Master...you lack the research knowledge necessary for Guardian installation." ;
			mes "You must acquire the guild skill ^FF0000 Guardian Fabrication Research^000000 in order to gain knowledge about Guardian installation." ;
			close;
		}
		if(Zeny < 10000) {	//未調査
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Master!" ;
			mes "I do not have enough money to invest." ;
			mes "The investment has been canceled." ;
			close;
		}
		set Zeny,Zeny-10000;
		setcastledata '@map$,'@ret,1;
		callfunc "GuardianCall",getarg(0),'@ret,1;	//ガーディアン召喚(npc_gvg_monster.txt)
		return;
	}

	//Kafraとの契約・解雇
	function StewardKafra {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
		if(getcastledata('@map$,9)==0) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Do you have a contract with the Kafra headquarters to hire Kafra Staff within the fort?" ;
			mes "I need ^ff00001000000^000000Zeny to hire..."
			next;
			if(select("雇う","取り消す")==2) {
				mes "[Butler "+strnpcinfo(0)+"]";
				mes "Yes, sir." ;
				mes "However, we must not forget to improve convenience for our guild members." ;
				close;
			}
			if(getgdskilllv(getcharid(2),10001) == 0) {
				mes "[Butler "+strnpcinfo(0)+"]";
				mes "Master...the contract has not yet been signed with the Kafra headquarters." ;
				mes "Without signing a contract, you cannot hire Kafra Staff." ;
				next;
				mes "[Butler "+strnpcinfo(0)+"]";
				mes "If you want a contract with Kafra headquarters, you must learn the ^FF0000Kafra Contract^000000 skill in the Guild Skills." ;
				close;
			}
			if(Zeny < 10000) {	//未調査
				mes "[Butler "+strnpcinfo(0)+"]";
				mes "Master! You don't have enough money!" ;
				close;
			}
			set Zeny,Zeny-10000;
			enablenpc "AgitKafra_"+getarg(0);	//"AgitCode"を使って呼び出すNPC名を合成
			setcastledata '@map$,9,1;
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Contract with Kafra has been completed";
			next;
			cutin "kafra_01",2;
			mes "[Kafra Staff]";
			mes "Nice to meet you, my name is Kafra di Forte." ;
			mes "I will do my best and I look forward to working with you!" ;
			next;
			cutin "kafra_01",255;
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "You have to pay Zeny every month to keep your contract with Kafra on a guild basis." ;
			mes "(not implemented)";
		}
		else {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Are you breaking your contract with Kafra Staff?" ;
			next;
			if(select("Dismiss", "Cancel")==2) {
				mes "[Butler "+strnpcinfo(0)+"]";
				mes "I understand." ;
				close;
			}
			cutin "kafra_01",2;
			mes "[Kafra Staff]";
			mes "I...did I do something wrong?" ;
			mes "I'll be careful from now on...";
			mes "Can you please forgive me...";
			next;
			if(select("Dismiss", "Cancel")==2) {
				mes "[Kafra Staff]";
				mes "Thank you very much." ;
				mes "I will do my best to get to the office!" ;
				close2;
				cutin "kafra_01",255;
				end;
			}
			mes "[Kafra Staff]";
			mes "Oh, you're firing me..."
			next;
			disablenpc "AgitKafra_"+getarg(0);
			setcastledata '@map$,9,0;
			cutin "kafra_01",255;
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "...";
			mes "The contract with Kafra has been terminated." ;
		}
		return;
	}

	//マスターの部屋に入る
	function StewardRoom {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "You are entering a room where many of our precious productions are stored?" ;
		mes "That is a room that only the master is allowed to enter." ;
		next;
		if(select("Enter master's room", "Cancel")==1) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Then we will show you the way." ;
			mes "Please follow me." ;
			mes "When you come back, you can leave by operating the hidden switch." ;
			close2;
			warp '@map$,getarg(1),getarg(2);
			end;
		}
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Produced goods can be produced once a day, but once they are saved to a certain degree, they are not produced any more. Therefore, it must be taken out in moderation for the development of our guild.";
		return;
	}

	//アジトを放棄する
	function StewardGiveup {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
		mes "[Butler "+strnpcinfo(0)+"]";	//未調査？
		mes "Master!" ;
		mes "You're abandoning your hideout!" ;
		mes " Please reconsider, Master!" ;
		next;
		if(select("Abandon castle", "Cancel".)==1) {
			mes "[Butler "+strnpcinfo(0)+"]";
			mes "Master!" ;
			mes "Please reconsider..." ;
			mes "Please, please, please !!!!!!!!" ;
			next;
			if(select("Quit", "Abandon your hideout".)==2) {
				mes "[Butler "+strnpcinfo(0)+"]";
				mes "Master!!!!" ;
				mes "... I...... yada ...... a ......" ;
				close2;
				announce "The fort [" +getcastlename('@map$)+ "] has been abandoned by [" +getguildname(getcharid(2))+ "] guild." ,0x20;
				callfunc "AgitGiveUp",getarg(0);	//アジト放棄処理(npc_gvg_exe.txt)
				end;
			}
		}
		mes "[Butler "+strnpcinfo(0)+"]";
		mes "Yessir! Master^^! Please don't make jokes like that ^^." ;
		return;
	}

	//ここからmain
	StewardSpeech;
	switch (select("Show Fort Status", "Invest in Commercial Development", "Invest in Fort Defense", "Install Guardian", "Contract / Terminate Kafra", "Enter Master's Room", "Abandon Hideout".)) {
		case 1:
			StewardConf;
			close;
		case 2:
			StewardEco;
			close;
		case 3:
			StewardDef;
			close;
		case 4:
			StewardGuard getarg(0);
			close;
		case 5:
			StewardKafra getarg(0);
			close;
		case 6:
			StewardRoom 0,getarg(1),getarg(2);
			close;
		case 7:
			StewardGiveup getarg(0);
			close;
	}
	return;
}


//==========================================
// ルイーナ
//------------------------------------------
aldeg_cas01.gat,218,175,0	script	Alfredo	55,{
	callfunc "StewardMain","L1",113,223;
	end;
}

aldeg_cas02.gat,78,74,0		script	Chenchenlie	55,{
	callfunc "StewardMain","L2",134,225;
	end;
}

aldeg_cas03.gat,110,118,0	script	Najarf	55,{
	callfunc "StewardMain","L3",219,268;
	end;
}

aldeg_cas04.gat,67,116,0	script	Williott	55,{
	callfunc "StewardMain","L4",79,14;
	end;
}

aldeg_cas05.gat,51,179,0	script	Brymhensen	55,{
	callfunc "StewardMain","L5",68,13;
	end;
}

//==========================================
// ブリトニア
//------------------------------------------
gefg_cas01.gat,40,48,5		script	Gnahcher	55,{
	callfunc "StewardMain","B1",151,109;
	end;
}

gefg_cas02.gat,12,66,0		script	Esmarehk	55,{
	callfunc "StewardMain","B2",137,113;
	end;
}

gefg_cas03.gat,106,23,3		script	Jyang	55,{
	callfunc "StewardMain","B3",267,287;
	end;
}

gefg_cas04.gat,73,46,3		script	Kellvahni	55,{
	callfunc "StewardMain","B4",113,115;
	end;
}

gefg_cas05.gat,70,52,3		script	Byohre	55,{
	callfunc "StewardMain","B5",141,107;
	end;
}

//==========================================
// チュンリム
//------------------------------------------
payg_cas01.gat,120,58,4		script	Kurunnadi	55,{
	callfunc "StewardMain","C1",287,5;
	end;
}

payg_cas02.gat,22,260,7		script	Cherieos	55,{
	callfunc "StewardMain","C2",141,141;
	end;
}

payg_cas03.gat,50,261,3		script	Gheriot	55,{
	callfunc "StewardMain","C3",155,165;
	end;
}

payg_cas04.gat,38,284,3		script	DJ	55,{
	callfunc "StewardMain","C4",143,45;
	end;
}

payg_cas05.gat,277,249,3	script	Nahzar	55,{
	callfunc "StewardMain","C5",153,129;
	end;
}

//==========================================
// ヴァルキリーレルム
//------------------------------------------
prtg_cas01.gat,112,181,0	script	Ahvray	55,{
	callfunc "StewardMain","V1",7,205;
	end;
}

prtg_cas02.gat,94,61,4		script	Roy	55,{
	callfunc "StewardMain","V2",199,225;
	end;
}

prtg_cas03.gat,51,100,4		script	Sttick	55,{
	callfunc "StewardMain","V3",185,129;
	end;
}

prtg_cas04.gat,259,265,4	script	Van Dreth	55,{
	callfunc "StewardMain","V4",267,159;
	end;
}

prtg_cas05.gat,36,37,4		script	Raynor	55,{
	callfunc "StewardMain","V5",273,175;
	end;
}
