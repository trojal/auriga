//= Auriga Script ==============================================================
// Ragnarok Online GvG Script	by Blaze
//==============================================================================

//============================================================
// 攻城戦の制御
//------------------------------------------------------------
-	script	#AgitConfig	-1,{
OnAgitInit:
//---------------攻城戦を開催する曜日の設定-------------------
// 攻城戦の開催曜日
// 無し = 0, 日 = +1, 月 = +2, 火 = +4, 水 = +8, 木 = +16, 金 = +32, 土 = +64
// 攻城戦を行う曜日を加算（攻城戦無しなら0）
// 毎日行なう場合は'weekdayを127にする
	set 'weekday,1;

//---------------攻城戦の開催時間の設定（全体）---------------
// 攻城戦の開催時間と終了時間（時単位）
// 24時の場合は「24」と記載（0ではダメ）
// 開始時間と終了時間を同じにするとその日は攻城戦を終了させない
	set 'st_time,20;
	set 'ed_time,22;

//---------------攻城戦の開催時間の設定（個別）---------------
// 曜日毎に攻城戦の開催時間と終了時間を設定する
// 有効にするにはコメントアウトを外す
// 無効時、全体の開催時間設定が優先される
	// 日曜
	//set 'st_time[1],20;
	//set 'ed_time[1],22;

	// 月曜
	//set 'st_time[2],20;
	//set 'ed_time[2],22;

	// 火曜
	//set 'st_time[3],20;
	//set 'ed_time[3],22;

	// 水曜
	//set 'st_time[4],20;
	//set 'ed_time[4],22;

	// 木曜
	//set 'st_time[5],20;
	//set 'ed_time[5],22;

	// 金曜
	//set 'st_time[6],20;
	//set 'ed_time[6],22;

	// 土曜
	//set 'st_time[7],20;
	//set 'ed_time[7],22;

//---------------サーバー再起動時、攻城戦の再開時間-----------
// サーバー起動時に攻城戦の開催時間内だった場合、
// 攻城戦を再開するまでの猶予時間（単位:msec、60000 = 60秒）
	sleep 1000;

//---------------攻城戦の設定ここまで-------------------------
OnMinute00:
	set '@day,gettime(4);
	set '@hour,gettime(3);
	if('weekday & (1<<'@day)) {
		if('st_time['@day+1] == 0 && 'ed_time['@day+1] == 0) {
			set '@st_time,'st_time;
			set '@ed_time,'ed_time;
		}
		else {
			set '@st_time,'st_time['@day+1];
			set '@ed_time,'ed_time['@day+1];
		}
		if('@st_time == '@ed_time || ('@hour >= '@st_time  && '@hour < '@ed_time)) {
			if(!agitcheck()) {
				debugmes "Siege started [ " +gettimestr("%H:%M",6)+ " ]";
				agitstart;
			}
		}
		else if(agitcheck()) {
			debugmes "End of siege [ " +gettimestr("%H:%M",6)+ " ]";
			agitend;
		}
	}
	else if(agitcheck()) {
		debugmes "End of siege [ " +gettimestr("%H:%M",6)+ " ]";
		agitend;
	}
	end;
}

//============================================================
// Emperium召喚
//	callfunc "AgitEmperium",EmperiumX,EmperiumY,StartFlag;
//------------------------------------------------------------
function	script	AgitEmperium	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	maprespawnguildid '@map$,getcastledata('@map$,1),2;
	callguardian '@map$,getarg(0),getarg(1),"--ja--",1288,1,strnpcinfo(0)+"::OnAgitBreak";
	if(getarg(2)) {		// 攻城戦開始処理か？
		gvgon '@map$;
		if(getcastledata('@map$,1))
			announce "Fort [" +getcastlename('@map$,0)+ "] of " +getcastlename('@map$,1)+ "] is occupied by [" +getguildname(getcastledata('@map$,1))+ "] guild",0x20;
		else
			donpcevent strnpcinfo(0)+"::OnAgitSummon";	//モンスター召喚
	}
	return;
}

//============================================================
// アジト占領
//	callfunc "AgitBreak","AgitCode";
//------------------------------------------------------------
function	script	AgitBreak	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	killmonsterall '@map$;
	set '@gid,getcharid(2);		//Emperium破壊者のGIDを取得
	if('@gid <= 0)
		return;

	// 砦情報の書き換え
	setcastledata '@map$,1,'@gid;
	for(set '@i,2; '@i<=17; set '@i,'@i+1) {
		if('@i==2 || '@i==3) {	// 商業値・防衛値
			set '@val,getcastledata('@map$,'@i)-5;
			setcastledata '@map$,'@i,('@val<1)? 1: '@val;
		}
		else
			setcastledata '@map$,'@i,0;
	}
	announce "The emperium has been destroyed.",0x9,0x00ff00,0x2bc,10,0,40;
	sleep 7000;
	announce "Fort [" +getcastlename('@map$,0)+ "] of " +getcastlename('@map$,1)+ "] is occupied by [" +getguildname(getcastledata('@map$,1))+ "] guild",0x20;
	donpcevent "::OnFlagEmb_"+getarg(0);	//フラッグエンブレムの変更
	return;
}

//============================================================
// 攻城戦終了
//	callfunc "AgitEnd";
//------------------------------------------------------------
function	script	AgitEnd	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	maprespawnguildid '@map$,getcastledata('@map$,1),4;
	killmonster '@map$,strnpcinfo(0)+"::OnAgitBreak";	//エンペのみ抹殺
	gvgoff '@map$;
	if(getcastledata('@map$,1))
		announce "Fort [" +getcastlename('@map$,0)+ "] of " +getcastlename('@map$,1)+ "] is occupied by [" +getguildname(getcastledata('@map$,1))+ "] guild",0x20;
	return;
}

//============================================================
// アジト放棄
//	callfunc "AgitGiveUp","AgitCode";
//------------------------------------------------------------
function	script	AgitGiveUp	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	killmonsterall '@map$;
	hideonnpc "AgitKafra_"+getarg(0);
	setcastledata '@map$,1,0;
	for(set '@i,4; '@i<=17; set '@i,'@i+1) {
		setcastledata '@map$,'@i,0;
	}
	donpcevent "::OnFlagEmb_"+getarg(0);		//フラッグエンブレムの変更
	maprespawnguildid '@map$,0,7;
	if(agitcheck()) {
		donpcevent strnpcinfo(0)+"::OnAgitEliminate";	//Emperium召喚
		donpcevent strnpcinfo(0)+"::OnAgitSummon";	//モンスター召喚
	}
	return;
}

//============================================================
// 宝箱
//	callfunc "AgitTreasure",TBoxIDArray,TBoxXArray,TBoxYArray;
//------------------------------------------------------------
function	script	AgitTreasure	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー

	// 商業値
	set '@economy,getcastledata('@map$,2) + getcastledata('@map$,4);
	if(getcastledata('@map$,4)) {
		if(getgdskilllv(getcastledata('@map$,1),10014)) // 永久的な発展
			set '@economy,'@economy + rand(2);
	}
	set '@economy,('@economy > 100)? 100: '@economy;

	// 防衛値
	set '@defense,getcastledata('@map$,3) + getcastledata('@map$,5);
	set '@defense,('@defense > 100)? 100: '@defense;

	// 砦情報更新
	setcastledata '@map$,2,'@economy;
	setcastledata '@map$,3,'@defense;
	setcastledata '@map$,4,0;	// 商業投資回数リセット
	setcastledata '@map$,5,0;	// 防衛投資回数リセット

	// 宝箱
	killmonster '@map$,strnpcinfo(0)+"::OnKilled";
	set '@count,('@economy / 5) + 4;
	set '@max,getarraysize(getarg(0));
	copyarray '@id,getarg(0),'@max;
	copyarray '@x,getarg(1),'@count;
	copyarray '@y,getarg(2),'@count;
	for(set '@i,0; '@i < '@count; set '@i,'@i+1) {
		if('@x['@i] && '@y['@i])	// x座標,y座標が正しいかチェック
			monster '@map$,'@x['@i],'@y['@i],"--ja--",'@id['@i % '@max],1,strnpcinfo(0)+"::OnKilled";
	}
	return;
}

//============================================================
// Guild Flag
//	callfunc "AgitEmblemFlag",Type,"WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitEmblemFlag	{
	set '@gid,getcastledata(getarg(1),1);
	if(getcharid(2) > 0 && getcharid(2) == '@gid) {
		mes "[ Voice ]";
		mes "O brave man..." ;
		mes "Return to your land?" ;
		next;
		if(select("Return to the fort.", "Quit.") == 1) {
			// 移動前に再チェック
			set '@gid,getcastledata(getarg(1),1);
			if(getcharid(2) > 0 && getcharid(2) == '@gid)
				warp getarg(1),getarg(2),getarg(3);
		}
		return;
	}
	if(getarg(0) == 1) {
		mes "[ Rune-Midgarts Kingdom territory ]";
		mes " 1. This is by agreement between the Kingdom of Rune-Midgarts and the Republic of Schwartzvald";
	}
	else if(getarg(0) == 2) {
		mes "[Decree of the Republic of Schwartzvald]";
		mes " 1. This is the Schwartzvald Republic Decree.";
	}
	else if(getarg(0) == 3) {
		mes "[Arunafeltz doctrinal proclamation]";
		mes " 1. This is the Arunafeltz Order of the Church.";
	}
	else {
		mes "[ Rune-Midgarts Kingdom territory ]";
		mes " 1. This is by the Kingdom of Rune-Midgarts";
	}
	if('@gid <= 0) {
		mes "Publicize the fact that it is a hideout with no official owner." ;
		next;
		mes " 2. The brave man who wins the terrible ordeal that protects this place and destroys the Emperium will be granted the right to own the hideout, which will be recognized by the king.";
		return;
	}
	mes "Guild ^ff0000 " +getguildname('@gid)+ " ^000000 is acknowledged to be owned by ^000000." ;
	next;
	mes " 2.^ff0000 " +getguildname('@gid)+ " The master of ^000000 is ^ff0000 " +getguildmaster('@gid)+ " ^000000." ;
	mes "If anyone disputes this, take up your sword and win honor by force." ;
	return;
}

//============================================================
// Kafra Staff
//	callfunc "AgitKafra",MapCode;
//------------------------------------------------------------
function	script	AgitKafra	{
	cutin "kafra_01",2;
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid <= 0 || getcharid(2) != '@gid) {
		mes "[Kafra Staff]";
		mes "I am contracted to serve only the guild ^FF0000" + getguildname('@gid) + "^000000 people." ;
		mes "Please use another Kafra Service." ;
		close2;
		cutin "kafra_01",255;
		return;
	}
	mes "[Kafra Staff]";
	mes "Welcome ^ff0000" +getguildname('@gid)+ "^000000 everyone Kafra Service is always with you." ;
	next;
	set '@code,getarg(0);
	set '@price,200;
	callfunc "KafraMain",3,0x4e,0,0,0,0,0,0,40,800,'@code,'@price;
	return;
}

//============================================================
// 執事
//	callfunc "AgitSteward","AgitCode",GuardianIDArray,GuardianXArray,GuardianYArray,MasterRoomX,MasterRoomY;
//------------------------------------------------------------
function	script	AgitSteward	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	set '@name$,"Butler " +(getarg(1)? strnpcinfo(0): "");	//SEでないなら固有名
	if('@gid <= 0) {
		mes "[" +'@name$+ "]";
		mes "I am waiting for the One who will be my Master, as fate leads me." ;
		mes "If you are brave, why not try your fate once?" ;
		return;
	}
	if(getcharid(0) != getguildmasterid('@gid)) {
		mes "[" +'@name$+ "]";
		mes "No matter how much you threaten me, I am my master ^ff0000" +getguildmaster('@gid)+ "I am a servant only to Master ^000000." ;
		mes "Where are the Guardians!" ;
		mes "Quickly banish these insolent people and others!" ;
		return;
	}
	mes "[" +'@name$+ "]";
	mes "Welcome back, ^FF0000" +strcharinfo(0)+ "Dear ^000000." ;
	mes "Please let us know if there is anything we can do for you." ;
	next;
	set '@tmp$,getarg(1)? "Guardian installation": "";	//SEはガーディアン設置メニューを表示しない
	switch(select("Show fort status", "Invest in commercial development", "Invest in fort defense",'@tmp$, "Contract with / dismiss Kafra", "Enter master's room")) {
	case 1:		// 砦の状態を表示
		mes "[" +'@name$+ "]";
		mes "We are pleased to report the status of the fort." ;
		mes " ^0000ffThe current commercial development value is " +getcastledata('@map$,2);
		if(getcastledata('@map$,4) != 0)
			mes "- within 1 day " +getcastledata('@map$,4)+ "invested." ;
		mes "The current defense value is " +getcastledata('@map$,3)+ ". ^000000";
		if(getcastledata('@map$,5) != 0)
			mes "^0000ff- Within 1 day " +getcastledata('@map$,5)+ "investment. ^000000 or more." ;
		break;
	case 2:		// 商業発展に投資
		mes "[" +'@name$+ "]";
		mes "Increasing the commercial development value will increase the number of logistical goods produced by the guild, so you may want to invest for the future." ;
		next;
		mes "[" +'@name$+ "]";
		mes "Normally you can invest only once a day, but you can also invest a second time by paying an additional amount." ;
		next;
		set '@count,getcastledata('@map$,4);
		if('@count == 2) {
			mes "[" +'@name$+ "]";
			mes "^ff0000But I have already made two investments today, so I can't make any more." ;
			mes "^000000We look forward to your continued growth." ;
			break;
		}
		set '@val,getcastledata('@map$,2);
		if('@val >= 100) {	//未調査
			mes "[" +'@name$+ "]";
			mes "^ff0000The commercial development value is currently the maximum value." ;
			mes "There is no need to invest now. ^000000";
		 	break;
		}
		set '@tmp,('@val-'@count)/5;
		set '@price,5000*(1+(1+'@tmp)*'@tmp/2)*(1+3*'@count);
		switch('@count) {
		case 0:
			mes "[" +'@name$+ "]";
			mes "The current investment required is ^ff0000" +'@price+ "^000000 Zeny." ;
			mes "Would you like to invest?" ;
			break;
		case 1:
			mes "[" +'@name$+ "]";
			mes "You have made one investment now, would you like to make an additional investment?" ;
			mes "In that case ^ff0000" +'@price+ "^000000 Zeny is required." ;
			break;
		}
		next;
		if(select("Invest in commercial development", "Cancel") == 2) {
			mes "[" +'@name$+ "]";
			mes "Yes, sir." ;
			mes "There is no need to rush." ;
			mes "Please feel free to contact me again anytime." ;
			break;
		}
		if(Zeny < '@price) {	//未調査
			mes "[" +'@name$+ "]";
			mes "Master!" ;
			mes "I do not have enough money to invest." ;
			mes "The investment has been canceled." ;
			break;
		}
		set Zeny,Zeny-'@price;
		setcastledata '@map$,4,'@count+1;
		mes "[" +'@name$+ "]";
		mes "I was able to invest successfully!" ;
		mes "I am looking forward to seeing more and more of your work in the future." ;
		mes "The development value will increase tomorrow." ;
		break;
	case 3:		// 砦の防衛に投資
		mes "[" +'@name$+ "]";
		mes "Increasing the defense value improves the durability of the Guardian and Emperium." ;
		mes "It would be wise to strengthen them for the battle ahead." ;
		next;
		mes "[" +'@name$+ "]";
		mes "Normally you can invest only once a day, but you can also invest a second time by paying an additional amount." ;
		next;
		set '@count,getcastledata('@map$,5);
		if('@count == 2) {
			mes "[" +'@name$+ "]";
			mes "^ff0000But I have already made two investments today, so I can't make any more." ;
			mes "^000000We look forward to your continued growth." ;
			break;
		}
		set '@val,getcastledata('@map$,3);
		if('@val >= 100) {	//未調査
			mes "[" +'@name$+ "]";
			mes "^ff0000Defense investment value is currently 100%." ;
			mes "No need to invest now. ^000000";
			break;
		}
		set '@tmp,('@val-'@count)/5;
		set '@price,10000*(1+(1+'@tmp)*'@tmp/2)*(1+3*'@count);
		if('@count) {
			mes "[" +'@name$+ "]";
			mes "You have made one investment now, would you like to make an additional investment?" ;
			mes "In that case ^ff0000" +'@price+ "^000000 Zeny is required." ;
		}
		else {
			mes "[" +'@name$+ "]";
			mes "The current investment required is ^ff0000" +'@price+ "^000000 Zeny." ;
			mes "Would you like to invest?" ;
		}
		next;
		if(select("Invest in Defense", "Cancel") == 2) {
			mes "[" +'@name$+ "]";
			mes "Yes, sir." ;
			mes "There is no need to rush." ;
			mes "Please feel free to contact me again anytime." ;
			break;
		}
		if(Zeny < '@price) {	//未調査
			mes "[" +'@name$+ "]";
			mes "Master!" ;
			mes "I do not have enough money to invest." ;
			mes "The investment has been canceled." ;
			break;
		}
		set Zeny,Zeny-'@price;
		setcastledata '@map$,5,'@count+1;
		mes "[" +'@name$+ "]";
		mes "I was able to invest successfully!" ;
		mes "I am looking forward to seeing more and more of your work in the future." ;
		mes "The defense value will go up tomorrow." ;
		break;
	case 4:		// ガーディアン設置
		set '@max,getarraysize(getarg(1));
		copyarray '@id,getarg(1),'@max;
		mes "[" +'@name$+ "]";
		mes "Do you want to install a Guardian?" ;
		mes "The Guardian will be the protector of our fort." ;
		mes "Please select the Guardian you wish to install." ;
		next;
		for(set '@i,0; '@i < '@max; set '@i,'@i+1) {
			set '@name$,getmobname('@id['@i]);
			if(getcastledata('@map$,'@i+10) == 0)
				set '@stat$,"設置できます";
			else
				//表示範囲からはみ出るので表示をアレンジ
				//set '@stat$,"設置できません (" +getguardianinfo('@map$,'@i+1,3)+ " / " +getguardianinfo('@map$,'@i+1,4)+ ")";
				set '@stat$,"(" +getguardianinfo('@map$,'@i+1,3)+ " / " +getguardianinfo('@map$,'@i+1,4)+ ")";
			set '@tmp$['@i],'@name$ + " - " + '@stat$;
		}
		set '@ret,select(printarray('@tmp$))+9;
		mes "[" +'@name$+ "]";
		mes "Do you really want to install the selected Guardian? Installation requires ^ff00001000000^000000Zeny." ;
		next;
		if(select("Install", "Quit") == 2) {
			mes "[" +'@name$+ "]";
			mes "Yes, sir." ;
			mes "We encourage you to install this system when you have the funds to do so." ;
			break;
		}
		if(getgdskilllv(getcharid(2),10002) == 0) {
			mes "[" +'@name$+ "]";
			mes "Master... Lack of research knowledge required for Guardian installation." ;
			mes "You must acquire the guild skill ^FF0000 Guardian Fabrication Research^000000 in order to gain knowledge about Guardian installation." ;
			break;
		}
		if(getcastledata('@map$,'@ret)) {
			mes "[" +'@name$+ "]";	//未調査
			mes "Master!" ;
			mes "Guardian already in place." ;
			mes " Guardian installation has been canceled." ;
			break;
		}
		if(Zeny < 10000) {	//未調査
			mes "[" +'@name$+ "]";
			mes "Master!" ;
			mes "I do not have enough money to invest." ;
			mes "The investment has been canceled." ;
			break;
		}
		set Zeny,Zeny-10000;
		copyarray '@x,getarg(2),'@max;
		copyarray '@y,getarg(3),'@max;
		set '@ret,'@ret-10;
		callguardian '@map$,'@x['@ret],'@y['@ret],"--ja--",'@id['@ret],1,"",'@ret+1;
		mes "[" +'@name$+ "]";
		mes "Guardian has been installed." ;
		mes "The Guardian will protect our castle from our enemies." ;
		break;
	case 5:		// Kafraとの契約 / 解雇
		if(getcastledata('@map$,9) == 0) {
			mes "[" +'@name$+ "]";
			mes "Do you have a contract with Kafra headquarters to hire Kafra Staff in the fort?" ;
			mes "I need ^ff000010000^000000Zeny to hire..." ;
			next;
			if(select("hire", "cancel") == 2) {
				mes "[" +'@name$+ "]";
				mes "Yes, sir." ;
				mes "However, we must not forget to improve convenience for our guild members." ;
				break;
			}
			if(getgdskilllv(getcharid(2),10001) == 0) {
				mes "[" +'@name$+ "]";
				mes "Master... The contract has not yet been signed with Kafra headquarters." ;
				mes "Without signing a contract, you will not be able to hire Kafra Staff." ;
				next;
				mes "[" +'@name$+ "]";
				mes "If you want a contract with Kafra headquarters, you must learn the ^FF0000Kafra Contract^000000 skill in the Guild Skills." ;
				break;
			}
			if(Zeny < 10000) {	//未調査
				mes "[" +'@name$+ "]";
				mes "Master! You don't have enough money!" ;
				break;
			}
			set Zeny,Zeny-10000;
			hideoffnpc "AgitKafra_"+getarg(0);	//"AgitCode"を使って呼び出すNPC名を合成
			setcastledata '@map$,9,1;
			mes "[" +'@name$+ "]";
			mes "Contract with Kafra has been completed";
			next;
			cutin "kafra_01",2;
			mes "[Kafra Staff]";
			mes "Nice to meet you, my name is Kafra di Forte." ;
			mes "I will do my best and I look forward to working with you!" ;
			close2;
			cutin "kafra_01",255;
			//mes "[" +'@name$+ "]";
			//mes "ギルドベースでKafraとの契約を維持するために";
			//mes "毎月Zenyを払わなければなりません。";
			//mes "(未実装)";
			break;
		}
		mes "[" +'@name$+ "]";
		mes "Are you breaking your contract with Kafra Staff?" ;
		next;
		if(select("解雇する","キャンセル") == 2) {
			mes "[" +'@name$+ "]";
			mes "I understand." ;
			break;
		}
		cutin "kafra_01",2;
		mes "[Kafra Staff]";
		mes "I... Did I do something wrong?" ;
		mes "I'll be careful from now on..." ;
		mes "Can you forgive me..." ;
		next;
		if(select("Dismissed", "Cancel")==2) {
			mes "[Kafra Staff]";
			mes "Thank you very much." ;
			mes "I will do my best to get to the office!" ;
			close2;
			cutin "kafra_01",255;
			break;
		}
		mes "[Kafra Staff]";
		mes "Oh, you're firing me..." ;
		next;
		hideonnpc "AgitKafra_"+getarg(0);
		setcastledata '@map$,9,0;
		cutin "kafra_01",255;
		mes "[" +'@name$+ "]";
		mes "...";
		mes "The contract with Kafra has been terminated." ;
		break;
	case 6:		// マスターの部屋に入る
		mes "[" +'@name$+ "]";
		mes "You are entering a room where many of our precious productions are stored?" ;
		mes "That is a room that only the master is allowed to enter." ;
		next;
		if(select("enter master's room", "cancel") == 2) {
			mes "[" +'@name$+ "]";
			mes "Produced goods can be produced once a day, but once they are saved to a certain degree, they are not produced any more. Therefore, it must be taken out in moderation for the development of our guild." ;
			break;
		}
		mes "[" +'@name$+ "]";
		mes "Then we will show you the way." ;
		mes "Please follow me." ;
		mes "When you come back, you can leave by operating the hidden switch." ;
		close2;
		warp '@map$,getarg(4),getarg(5);
		break;
	}
	return;
}

//============================================================
// マスタールームのスイッチ
//	callfunc "AgitMaster",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitMaster	{
	mes "There is a small lever." ;
	mes "Do you want to pull it?" ;
	next;
	if(select("Pull","Don't pull") == 1) {
		set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
		warp '@map$,getarg(0),getarg(1);
	}
	return;
}

//============================================================
// ギルドダンジョンへのスイッチ
//	callfunc "AgitDungeon","WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitDungeon	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid <= 0) {
		mes "[Voice]";	//未調査
		mes "He who has overcome many hardships and trials, let him have further trials";
		return;
	}
	mes "[Voice]";
	mes "If you are up to the challenge, go ahead.";
	next;
	mes " There is a small lever." ;
	mes "Do you want to pull it?" ;
	next;
	if(select("Pull","Don't pull") == 2)
		return;
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid && '@gid == getcharid(2)) {
		warp getarg(0),getarg(1),getarg(2);
		return;
	}
	mes " But nothing happened." ;
	return;
}

//============================================================
// マスタールーム制限
//	callfunc "AgitBanWarp","WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitBanWarp	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid <= 0 || getcharid(0) != getguildmasterid('@gid))	//マスターか？
		warp getarg(0),getarg(1),getarg(2);
	return;
}

//============================================================
// SEアジト占領
//	callfunc "AgitBreakSE","AgitCode";
//------------------------------------------------------------
function	script	AgitBreakSE	{
	donpcevent "Barricade#"+getarg(0)+"::OnReset";
	donpcevent "Control Unit01#"+getarg(0)+"::OnReset";
	donpcevent "Control Unit02#"+getarg(0)+"::OnReset";
	donpcevent "Control Unit03#"+getarg(0)+"::OnReset";
	sleep 10000;
	set getvariableofnpc('guardian1,"Guardian#"+getarg(0)),0;
	set getvariableofnpc('guardian2,"Guardian#"+getarg(0)),0;
	set getvariableofnpc('status,"Control Unit01#"+getarg(0)),1;
	set getvariableofnpc('status,"Control Unit02#"+getarg(0)),1;
	set getvariableofnpc('status,"Control Unit03#"+getarg(0)),2;
	donpcevent "GuardianStone1#"+getarg(0)+"::OnSet";
	donpcevent "GuardianStone2#"+getarg(0)+"::OnSet";
	announce "Control Unit of each guardian stone repair point and the third barricade has been activated",0x9,0x00FF00;
	return;
}

//============================================================
// SE守備担当
//	callfunc "AgitGuard";
//------------------------------------------------------------
function	script	AgitGuard	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid <= 0 || getcharid(2) != '@gid) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "Who are you?" ;
		mes "Please leave this fort now!" ;
		return;
	}
	if(getcharid(0) != getguildmasterid('@gid)) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "I am the one in charge of defending the fort." ;
		mes "I will discuss the details with the master." ;
		return;
	}
	if(agitcheck()) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "Master!" ;
		mes "Please order me to do whatever you want!" ;
		next;
		switch(select("Fortification of fortifications", "Current status report", "Cancel")) {
		case 1:
			if(getgdskilllv(getcharid(2),10002) == 0) {
				// 未調査
				mes "[" +strnpcinfo(1)+ "]";
				mes "Lack of research knowledge required for Guardian installation." ;
				mes "You must acquire the guild skill ^FF0000 Guardian Production Research^000000 in order to gain knowledge about Guardian installation." ;
				return;
			}
			mes "[" +strnpcinfo(1)+ "]";
			mes "I command you to summon the ^4DF4DFF Guardian ^000000 through the ^FF0000 guardian stone ^000000 outside." ;
			mes "However, if the ^FF0000 guardian stone ^000000 is destroyed, the ^4DF4DFF Guardian ^000000 cannot be summoned." ;
			mes "In that case, if the ^FF0000 guardian stone ^000000 is rebuilt, the ^4DFF Guardian ^000000 will be summoned." ;
			set '@def,getcastledata('@map$,3);
			set '@count,getvariableofnpc('guardian1,"Guardian#"+strnpcinfo(2));
			if(getvariableofnpc('status,"GuardianStone1#"+strnpcinfo(2)) == 0 && '@count == 0) {
				copyarray '@x,getarg(0),getarraysize(getarg(0));
				copyarray '@y,getarg(1),getarraysize(getarg(1));
				callguardian '@map$,'@x[0],'@y[0],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
				if('@def > 10 && '@def < 31) {
					callguardian '@map$,'@x[1],'@y[1],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set '@count,'@count+2;
				}
				else if('@def > 30 && '@def < 51) {
					callguardian '@map$,'@x[2],'@y[2],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian '@map$,'@x[3],'@y[3],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set '@count,'@count+3;
				}
				else if('@def > 50 && '@def < 71) {
					callguardian '@map$,'@x[4],'@y[4],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian '@map$,'@x[5],'@y[5],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian '@map$,'@x[6],'@y[6],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set '@count,'@count+4;
				}
				else if('@def > 70) {
					callguardian '@map$,'@x[7],'@y[7],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian '@map$,'@x[8],'@y[8],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian '@map$,'@x[9],'@y[9],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian '@map$,'@x[10],'@y[10],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set '@count,'@count+5;
				}
				else {
					callguardian '@map$,'@x[11],'@y[11],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set '@count,'@count+2;
				}
				set getvariableofnpc('guardian1,"Guardian#"+strnpcinfo(2)),'@count;
				initnpctimer "Guardian#"+strnpcinfo(2);
			}
			set '@count,getvariableofnpc('guardian2,"Guardian#"+strnpcinfo(2));
			if(getvariableofnpc('status,"GuardianStone2#"+strnpcinfo(2)) == 0 && '@count == 0) {
				copyarray '@x,getarg(2),getarraysize(getarg(2));
				copyarray '@y,getarg(3),getarraysize(getarg(3));
				callguardian '@map$,'@x[0],'@y[0],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
				if('@def > 10 && '@def < 31) {
					callguardian '@map$,'@x[1],'@y[1],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set '@count,'@count+2;
				}
				else if('@def > 30 && '@def < 51) {
					callguardian '@map$,'@x[2],'@y[2],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian '@map$,'@x[3],'@y[3],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set '@count,'@count+3;
				}
				else if('@def > 50 && '@def < 71) {
					callguardian '@map$,'@x[4],'@y[4],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian '@map$,'@x[5],'@y[5],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian '@map$,'@x[6],'@y[6],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set '@count,'@count+4;
				}
				else if('@def > 70) {
					callguardian '@map$,'@x[7],'@y[7],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian '@map$,'@x[8],'@y[8],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian '@map$,'@x[9],'@y[9],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian '@map$,'@x[10],'@y[10],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set '@count,'@count+5;
				}
				else {
					callguardian '@map$,'@x[11],'@y[11],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set '@count,'@count+2;
				}
				set getvariableofnpc('guardian2,"Guardian#"+strnpcinfo(2)),'@count;
				initnpctimer "Guardian#"+strnpcinfo(2);
			}
			return;
		case 2:
			mes "[" +strnpcinfo(1)+ "]";
			mes "We would like to inform you of our current situation." ;
			set '@status,getvariableofnpc('status,"GuardianStone1#"+strnpcinfo(2));
			mes "1st guardian stone : " +('@status == 1? "^FF0000Destroyed^000000": '@status == 2? "^008000Recoverable^000000": "^4D4DFFNormal^000000");
			set '@status,getvariableofnpc('status,"GuardianStone2#"+strnpcinfo(2));
			mes "Second guardian stone : " +('@status == 1? "^FF0000Destroyed^000000": '@status == 2? "^008000Recoverable^000000": "^4D4DFFNormal^000000");
			set '@status,getvariableofnpc('status,"Control Unit01#"+strnpcinfo(2));
			mes "Barricade 1 : " +('@status == 1? "^FF0000Destroyed^000000": '@status == 2? "^008000Recoverable^000000": "^4D4DFFNormal^000000");
			set '@status,getvariableofnpc('status,"Control Unit02#"+strnpcinfo(2));
			mes "Barricade 2 : " +('@status == 1? "^FF0000Destroyed^000000": '@status == 2? "^008000Recoverable^000000": "^4D4DFFNormal^000000");
			set '@status,getvariableofnpc('status,"Control Unit03#"+strnpcinfo(2));
			mes "Barricade 3 : " +('@status == 1? "^FF0000Destroyed^000000": '@status == 2? "^008000Recoverable^000000": "^4D4DFFNormal^000000");
			return;
		case 3:
			mes "[" +strnpcinfo(1)+ "]";
			mes "I am always here for you, so whenever you need me, I am at your service.";
			return;
		}
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "I am in charge of defending the fort";
	mes strnpcinfo(1)+ "My name is." ;
	mes "There is nothing unusual at the moment." ;
	next;
	if(select("Continue conversation", "Stop") == 2) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "I am always here for you, so whenever you need me, I am at your service." ;
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "Do you have any questions about the fort?" ;
	next;
	switch(select("What is ^FF0000 guardian stone^000000?" ,"^4D4DFF What is a barricade^000000?" ,"^008000What is the use of flags^000000?" , "What strategy do you prefer?" , "No.")) {
	case 1:
		mes "[" +strnpcinfo(1)+ "]";
		mes "There is ^9C009C one emperium ^000000 and ^FF0000 two guardian stones ^000000 in the fort." ;
		mes "This ^FF0000 guardian stone^000000 is the first defensive measure to protect the fort, and the enemy cannot enter the fort unless all ^FF0000 guardian stones are destroyed^000000.";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "At the entrance to the fort there is a ^4DF4DFF castle gate barricade^000000 and the ^FF0000 two guardian stones^000000 are linked to the ^4DFF castle gate barricade^000000." ;
		mes "The castle gate barricade cannot be attacked or passed through at all unless all the guardian stones are destroyed." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "The place where this ^FF0000 guardian stone^000000 is located is called '^FF0000 base^000000'." ;
		mes "If we can perfectly defend the \"^FF0000base^000000\" and the ^FF0000 guardian stone^000000, the enemy cannot approach the Emperium.";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "This ^FF0000 guardian stone ^000000 is also responsible for summoning ^9C009C guardians to protect the fort, so it is an important part in many ways." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "And the solid number of ^9C009C Guardians^000000 summoned by ^FF0000 guardian stones^000000 is related to the defense value^000000 of the ^4D4DFF fort." ;
		mes "The higher the ^4DF4DFF defense value^000000, the more Guardians ^FF0000 Guardian Stones^000000 will summon, so do your best to defend and invest." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "Destroyed ^FF0000 guardian stones ^000000 can be rebuilt after a certain amount of time, but that is the role of all guild members." ;
		mes "The status of the ^FF0000 guardian stone ^000000 can be checked through me, and you can order me to do so at any time." ;
		return;
	case 2:
		mes "[" +strnpcinfo(1)+ "]";
		mes "The ^4D4DFF barricade^000000 is a secondary defensive feature we are building at the fort as the next line of defense after the ^FF0000 guardian stone^000000." ;
		mes "If all ^FF0000 guardian stones^000000 are destroyed, the ^4DF4DFF castle gate barricade^000000 will disappear and allow entry into the fort." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "The enemy is prevented inside the castle ^4D4DFF 1st to 3rd barricades ^000000." ;
		mes "These ^4D4DFF three barricades^000000 prevent the enemy from entering at key points in the fort." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "^4D4DFF As long as the barricade ^000000 is holding up, you can buy some time. However, please note that ^FF0000 once a barricade is destroyed, it cannot be repaired ^000000." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "The ^4D4DFF barricade^000000 is automatically built at the start of the siege, but once the battle begins and it is destroyed, it can no longer be repaired." ;
		mes "The only time it can be built is when the owner of the fort changes." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "Please note that the ^4D4DFF barricade^000000 construction process is only available to ^FF0000 guild masters." ;
		mes "In addition, it will be possible to build from the third barricade in sequence." ;
		mes "Please do not forget this point as well." ;
		return;
	case 3:
		mes "[" +strnpcinfo(1)+ "]";
		mes "There are many ^008000 flags ^000000 in the fort." ;
		mes "The ^4D4DFF barricade^000000 creates restrictions on movement, so we set up these ^008000 flags^000000 to get past them." ;
		mes "We call it the '^008000 link flag^000000'." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "Which ^008000 flag ^000000 is connected to which location ......" ;
		mes "It is ...... I haven't been able to remember them all, but roughly the ^FF0000 first flag ^000000 was connected to each ^FF0000 base ^000000." ;
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "The ^008000 flag^000000 of the fort is basically connected to where the '^9C009C Emperium^000000' is, and the ^008000 flag^000000 as a convenience feature for all guild members would usually be the last number." ;
		return;
	case 4:
		mes "[" +strnpcinfo(1)+ "]";
		mes "Is it a strategy? ......" ;
		mes "I think that should be considered directly by the master, not me. ......" ;
		mes "Well, I guess it would be to make the best use of ^FF0000 bases ^000000 and ^4D4DFF barricades ^000000 and be careful about the timing of the recovery." ;
		return;
	case 5:
		mes "[" +strnpcinfo(1)+ "]";
		mes "I am always here for you, so whenever you need me, I am at your service." ;
		return;
	}
}

//============================================================
// SEガーディアン召喚
//	callfunc "AgitCallGuardian",GuardianNo,Announce,PosX,PosY;
//------------------------------------------------------------
function	script	AgitCallGuardian	{
	if(getvariableofnpc('status,"GuardianStone"+getarg(0)+"#"+strnpcinfo(2)) != 0)
		return;
	switch(getarg(1)) {
		case 1: announce "Summons a primary additional Guardian to the base.",0x9,0xFF4500; break;
		case 2: announce "Summons a secondary additional Guardian to the base.",0x9,0xFF4500; break;
		case 3: announce "Summons a third additional Guardian to the base.",0x9,0xFF4500; break;
		case 4: announce "Summon a fourth additional Guardian to the base.",0x9,0xFF4500; break;
		case 5: announce "Summons a fifth additional Guardian to the base.",0x9,0xFF4500; break;
		default: break;
	}
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	callguardian '@map$,getarg(2),getarg(3),"--ja--",1899,1,strnpcinfo(0)+"::OnKilled"+getarg(0);
	if(getarg(0) == 1)
		set getvariableofnpc('guardian1,strnpcinfo(0)),getvariableofnpc('guardian1,strnpcinfo(0))+1;
	else if(getarg(0) == 2)
		set getvariableofnpc('guardian2,strnpcinfo(0)),getvariableofnpc('guardian2,strnpcinfo(0))+1;
	return;
}

//============================================================
// SE守護石
//	callfunc "AgitStone",StoneNo;
//------------------------------------------------------------
function	script	AgitStone	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid <= 0 || getcharid(2) != '@gid)
		return;
	mes "[" +strnpcinfo(1)+ "]";
	mes "Rebuild destroyed guardian stones." ;
	mes "The following ores are required to rebuild." ;
	next;
	mes "[" +strnpcinfo(1)+ "]";
	mes "Oridecon ^4DF4DFF1 piece ^000000Elunium ^4DF4DFF1 piece ^000000Stone ^4DF4DFF30 piece ^000000Blue Gemstone ^4DF4DFF5 piece ^000000Yellow Gemstone ^4DF4DFF5 piece ^000000 Red Gemstone ^4D4DFF5 pieces^000000";
	next;
	mes "[" +strnpcinfo(1)+ "]";
	mes "Would you like to continue working?" ;
	next;
	if(select("stop", "continue") == 1) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "All work has been canceled.";
		return;
	}
	if(countitem(984) < 1 || countitem(985) < 1 || countitem(7049) < 30 || countitem(715) < 5 || countitem(716) < 5 || countitem(717) < 5) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "Insufficient material." ;
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "•Phase: 1Place the ores in the following order." ;
	mes " ^008000Stones^000000⇒^FF0000Elunium^000000⇒^4D4DFFOridecon^000000";
	next;
	set '@point,0;
	setarray '@tmp$,"^4D4DFFOridecon^000000","^FF0000Elunium^000000","^008000Stones^000000";
	for(set '@i,1; '@i <= 3; set '@i,'@i+1) {
		set @menu,select(printarray('@tmp$));
		mes "[" +strnpcinfo(1)+ "]";
		mes "•Phase：1-" +'@i;
		mes ""+'@tmp$[@menu-1]+ "を配置。";
		mes " ";
		if('@i < 3)
			mes "Please select the next ore to place." ;
		else
			mes "Moving to the next phase." ;
		if('@i == 1 && @menu == 3 || '@i == 2 && @menu == 2 || '@i == 3 && @menu == 1)
			set '@point,'@point+10;
		next;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "-Phase: 2 Place a gemstone with a magical power that matches the magical power to be activated." ;
	mes "The nature of the magical power can be determined by the effect of the activation." ;
	next;
	mes "[" +strnpcinfo(1)+ "]";
	mes "-Phase: 2 Also, the affection is fiery red, the flash is yellow like light, and the drop of water is blue and cool." ;
	next;
	setarray '@tmp$,"Red Gemstone", "Yellow Gemstone", "Blue Gemstone";
	for(set '@i,1; '@i <= 8; set '@i,'@i+1) {
		set '@pattern,rand(1,3);
		switch('@pattern) {
		case 1:
			misceffect 225;
			emotion 3;
			break;
		case 2:
			misceffect 57;
			emotion 5;
			break;
		case 3:
			misceffect 54;
			emotion 4;
			break;
		}
		mes "[" +strnpcinfo(1)+ "]";
		mes "•Phase：2-" +'@i;
		mes "Place a gemstone with a magical power that matches the activated magical power.";
		next;
		set @menu,select(printarray('@tmp$));
		mes "[" +strnpcinfo(1)+ "]";
		mes "•Phase：2-" +'@i;
		mes ""+'@tmp$[@menu-1]+ "を配置します。";
		if(@menu != '@pattern) {
			next;
			mes "[" +strnpcinfo(1)+ "]";
			mes "-^FF0000MISS^000000Mutual magical forces collided and failed to rebuild the ^FF0000 guardian stone^000000." ;
			return;
		}
		set '@point,'@point+10;
		misceffect 18;
		next;
	}
	if('@point < 100) {
		// 未調査
		mes "[" +strnpcinfo(1)+ "]";
		mes "..................";
		mes "-The situation was not properly addressed and the repair failed." ;
		mes " lost some of its resources-";
		delitem 7049,10;
		delitem 715,2;
		delitem 716,2;
		delitem 717,2;
		return;
	}
	if(getvariableofnpc('status,"GuardianStone"+getarg(0)+"#"+strnpcinfo(2)) == 0) {
		// 未調査
		mes "[" +strnpcinfo(1)+ "]";
		mes "Gemstone placement is finished." ;
		return;
	}
	if(agitcheck() == 0) {
		// 未調査
		mes "[" +strnpcinfo(1)+ "]";
		mes "The emperium disappeared and failed to rebuild the guardian stone." ;
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "Gemstone placement is finished." ;
	mes "^FF0000 guardian stones ^000000 have been successfully ^4DF4DFF^000000 reconstructed!!!" ;
	delitem 984,1;
	delitem 985,1;
	delitem 7049,30;
	delitem 715,5;
	delitem 716,5;
	delitem 717,5;
	misceffect 135;
	hideonnpc;
	donpcevent "GuardianStone"+getarg(0)+"#"+strnpcinfo(2)+"::OnRepair";
	if(getvariableofnpc('status,"GuardianStone1#"+strnpcinfo(2))+getvariableofnpc('status,"GuardianStone2#"+strnpcinfo(2)) == 0) {
		announce "The guardian stone has been fully restored and the castle gate barricade has been reinstated.",0x9,0x00FF00;
		donpcevent "Barricade#"+strnpcinfo(2)+"::OnSet";
	}
	else
		announce "The guardian stone number " + getarg(0) + " has been successfully rebuilt!",0x9,0x00FF00;
	return;
}

//============================================================
// SE守護石破壊
//	callfunc "AgitStoneBreak",StoneNo;
//------------------------------------------------------------
function	script	AgitStoneBreak	{
	set getvariableofnpc('status,strnpcinfo(0)),1;
	set '@status1,getvariableofnpc('status,"GuardianStone1#"+strnpcinfo(2));
	set '@status2,getvariableofnpc('status,"GuardianStone2#"+strnpcinfo(2));
	if(('@status1 == 1 || '@status1 == 2) && ('@status2 == 1 || '@status2 == 2)) {
		announce "All the guardian stones have been destroyed and the barricades at the gates have been obliterated!",0x9,0xFF0000;
		donpcevent "Barricade#"+strnpcinfo(2)+"::OnReset";
		stopnpctimer "Guardian#"+strnpcinfo(2);
	}
	else {
		announce "The guardian stone number " + getarg(0) + " has been destroyed！",0x9,0xFF4500;
	}
	killmonster "this","Guardian#"+strnpcinfo(2)+"::OnKilled"+getarg(0);
	initnpctimer;
	return;
}

//============================================================
// SEバリケードControl Unit
//	callfunc "AgitBarricade";
//------------------------------------------------------------
function	script	AgitBarricade	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if(getcharid(0) != getguildmasterid('@gid) || getvariableofnpc('status,strnpcinfo(0)) != 2)
		return;
	mes "[" +strnpcinfo(1)+ "]";
	mes "Damaged barricades can be repaired." ;
	mes "The following materials are needed:" ;
	mes "Wood shavings ^4D4DFF 30 pieces ^000000 Steel ^4D4DFF 10 pieces ^000000Emveretarcon ^4D4DFF 10 pieces ^000000Oridecon ^4D4DFF 5 pieces ^000000";
	next;
	if(select("stop", "continue") == 1) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "All work has been canceled." ;
		return;
	}
	if(countitem(1019) < 30 || countitem(999) < 10 || countitem(1011) < 10 || countitem(984) < 5) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "Insufficient material." ;
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "If ^4D4DFF strut reinforcement^000000 is needed, use ^4D4DFF wood shavings^000000." ;
	mes "Use ^FF0000Oridecon^000000 for ^FF0000 durability reinforcement^000000 and ^008000 steel^000000 for ^008000 reinforced gluing^000000." ;
	mes "Use ^9C009CEmveretarcon^000000 for ^9C009C general repair^000000." ;
	next;
	set '@success,rand(5,10);
	set '@fail,0;
	set '@point,0;
	setarray '@tmp$,"Wood chips","Steel","Emveretarcon","Oridecon";
	while('@point < '@success) {
		set '@pattern,rand(1,4);
		switch('@pattern) {
		case 1:
			mes "-The destroyed point is dug deep." ;
			mes "-Reinforcement of the support columns is needed-";
			break;
		case 2:
			mes "-I'm worried about cracks here and there." ;
			mes " Looks like it needs to be strongly glued or welded -";
			break;
		case 3:
			mes "-general repair work seems to be needed-";
			break;
		case 4:
			mes "-It looks like we need to strengthen the durability so it won't be destroyed easily-";
			break;
		}
		next;
		set @menu,select(printarray('@tmp$));
		if('@pattern == 2 && @menu == 1) {
			mes "(I made a wooden armor using wood shavings." ;
			mes " (If you put this on ......)" ;
			set '@fail,1;
			next;
			continue;
		}
		if(@menu != '@pattern) {
			mes "(I tried to use " +'@tmp$[@menu-1]+ " but it doesn't work." ;
			mes " (I guess I'd better start over.)" ;
			return;
		}
		switch('@pattern) {
		case 1:
			mes "(The posts were reinforced with wood shavings.)" ;
			break;
		case 2:
			mes "(Attempted to weld using steel." ;
			mes "(I feel like I've put on a fine steel armor.)" ;
			break;
		case 3:
			mes "(General repair work was done using Emveretarcon.)" ;
			break;
		case 4:
			mes "(I hit it with Oridecon like Holgren does with weapon refining. Looks good.)" ;
			break;
		}
		set '@point,'@point+1;
		misceffect 101,"";
		next;
	}
	mes "-looks like it's mostly done-";
	next;
	if(agitcheck() == 0) {
		// 未調査
		mes "-but the emperium disappeared and the barricades could not be built-";
		return;
	}
	if('@fail) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "..................";
		mes "-The situation was not properly addressed and the repair failed." ;
		mes " lost some of its resources-";
		delitem 984,2;
		delitem 999,4;
		delitem 1019,14;
		delitem 1011,3;
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "^4D4DFF barricade ^000000 repaired!" ;
	delitem 1019,30;
	delitem 999,10;
	delitem 1011,10;
	delitem 984,5;
	set getvariableofnpc('status,strnpcinfo(0)),0;
	if(strnpcinfo(1) == "Control Unit03") {
		mes "-^FF0000Control Unit02 has been activated^000000." ;
		mes " 2nd barricade can be repaired-";
		set getvariableofnpc('status,"Control Unit02#"+strnpcinfo(2)),2;
		announce "Third barricade successfully repaired!",0x9,0x00FF00;
	}
	else if(strnpcinfo(1) == "Control Unit02") {
		mes "-^FF0000Control Unit01 has been activated^000000." ;
		mes " 1st barricade can be repaired-";
		set getvariableofnpc('status,"Control Unit01#"+strnpcinfo(2)),2;
		announce "The second barricade has been successfully repaired!",0x9,0x00FF00;

	}
	else
		announce "Barricade 1 has been successfully repaired!",0x9,0x00FF00;
	donpcevent strnpcinfo(0)+"::OnSet";
	return;
}

//============================================================
// SELink FlagA（各地域へのワープ）
//	callfunc "AgitLinkFlagA",SelectMenuArray,WarpXArray,WarpYArray;
//------------------------------------------------------------
function	script	AgitLinkFlagA	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid <= 0 || getcharid(2) != '@gid)
		return;
	mes "[Link Flag]";
	mes "Select a location to move to.";
	set '@max,getarraysize(getarg(0));
	copyarray '@code,getarg(0),'@max;
	for(set '@i,0; '@i < '@max; set '@i,'@i+1) {
		switch('@code['@i]) {
			case 1: set '@disp$['@i],"1st base"; break;
			case 2: set '@disp$['@i],"Second base"; break;
			case 11: set '@disp$['@i],"Defense Area 1-1"; break;
			case 12: set '@disp$['@i],"Defense Area 1-2"; break;
			case 13: set '@disp$['@i],"Defense Area 1-3"; break;
			case 14: set '@disp$['@i],"Defense Area 1-4"; break;
			case 21: set '@disp$['@i],"Defense Area 2-1"; break;
			case 22: set '@disp$['@i],"Defense Area 2-2"; break;
			case 23: set '@disp$['@i],"Defense Area 2-3"; break;
			case 24: set '@disp$['@i],"Defense Area 2-4"; break;
			case 31: set '@disp$['@i],"Defense Area 3-1"; break;
			case 32: set '@disp$['@i],"Defense Area 3-2"; break;
			case 33: set '@disp$['@i],"Defense Area 3-3"; break;
			case 34: set '@disp$['@i],"Defense Area 3-4"; break;
			case 111: set '@disp$['@i],"Area 1-1"; break;
			case 112: set '@disp$['@i],"Area 1-2"; break;
			case 113: set '@disp$['@i],"Area 1-3"; break;
			case 114: set '@disp$['@i],"Area 1-4"; break;
			case 121: set '@disp$['@i],"Area 2-1"; break;
			case 122: set '@disp$['@i],"Area 2-2"; break;
			case 123: set '@disp$['@i],"Area 2-3"; break;
			case 124: set '@disp$['@i],"Area 2-4"; break;
			case 131: set '@disp$['@i],"Area 3-1"; break;
			case 132: set '@disp$['@i],"Area 3-2"; break;
			case 133: set '@disp$['@i],"Area 3-3"; break;
			case 134: set '@disp$['@i],"Area 3-4"; break;
			case 100: set '@disp$['@i],"Road to the base"; break;
			case 101: set '@disp$['@i],"Central area 1"; break;
			case 102: set '@disp$['@i],"Central area 2"; break;
			case 103: set '@disp$['@i],"Central area 3"; break;
			default: set '@disp$['@i],"part that one does not understand"; break;
		}
	}
	set '@disp$['@max],"取り消し";
	set @menu,select(printarray('@disp$))-1;
	if(@menu == '@max)	//取り消し
		return;
	copyarray '@x,getarg(1),'@max;
	copyarray '@y,getarg(2),'@max;
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	warp '@map$,'@x[@menu],'@y[@menu];
	return;
}

//============================================================
// SELink FlagB（ギルドルームへのワープ）
//	callfunc "AgitLinkFlagB",Type,WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitLinkFlagB	{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid <= 0 || getcharid(2) != '@gid)
		return;
	mes "[Link Flag]";
	if(getarg(0)) {		//Typeが0以外のときはギルドルームのメッSage
		mes "Allows movement to areas built for the convenience of guild members." ;
	}
	else {		//Typeが0のときは中央作戦地域のメッSage
		mes "Move to the Central Operations Area where ^9C009CEmperium^000000 is located." ;
	}
	mes "Would you like to move?" ;
	if(select("move", "cancel") == 2)
		return;
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	warp '@map$,getarg(1),getarg(2);
	return;
}

//============================================================
// SEギルドダンジョン移動
//	callfunc "AgitDungeonSE","WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitDungeonSE	{
	if(!getcharid(2))
		return;
	mes "-It's quite a big, strange sunflower. ......" ;
	mes " I can feel the magic, if only slightly...";
	next;
	if(select("^0000FFTouch^000000", "Stop") == 2) {
		mes "-I feel like I'm being sucked into the unknown: ......" ;
		mes " Let's not -";
		return;
	}
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$以外はダミー
	set '@gid,getcastledata('@map$,1);
	if('@gid && '@gid == getcharid(2)) {
		warp getarg(0),getarg(1),getarg(2);
		return;
	}
	mes "-but nothing happened-";
	return;
}
