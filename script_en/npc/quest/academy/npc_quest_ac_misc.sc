//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- 冒険者アカデミー              by Pneuma
//------------------------------------------------------------

//---------------------------------------------
// SHOP

-	shop	Tool Dealer::ac_shop1	-1,519,517,501,506,502,504,611,601,525,645,656,610
-	shop	Merchant::ac_shop2	-1,1750,1770,1751,717
-	shop	Zen::ac_shop3	-1,1351,1354,1116,1151,1154,1451,1454,1457
-	shop	Ay::ac_shop4	-1,1204,1207,1210,1213,1216,1101,1104,1107,1110,1113,1122,1601,1604,1607,1501,1504,1507,1510,1519,1301,1401,1404,1407
-	shop	Ko::ac_shop5	-1,1701,1704,1707,1710,13150,13151,13102,13154,13155
-	shop	Mori::ac_shop6	-1,2303,2305,2328,2323,2332,2307,2309,2312,2501,2503,2505,2101,2103,2401,2403,2405,2608,2627
-	shop	Shuri::ac_shop7	-1,2211,2208,2220,2222,2232,2216,2226,2206,2228,2230,2212,2205,2203,2201,2239,2243,2242,2218,2241

ac_cl_hall.gat,155,35,4	script	Tool Dealer#ac	93,{/* 52611 */
	callshop "ac_shop1";
	end;
OnInit:
	waitingroom "Consumables for sale", 0;
	end;
}
ac_cl_hall.gat,152,29,4	script	Merchant#ac	82,{/* 52612 */
	callshop "ac_shop2";
	end;
OnInit:
	waitingroom "Arrows and Blue Gems for sale", 0;
	end;
}
ac_cl_hall.gat,178,43,4	script	Zen#ac	752,{/* 52615 */
	callshop "ac_shop3";
	end;
OnInit:
	waitingroom "Two-handed Weapons for sale", 0;
	end;
}
ac_cl_hall.gat,182,39,3	script	Ay#ac	815,{/* 52616 */
	callshop "ac_shop4";
	end;
OnInit:
	waitingroom "One-handed Weapons for sale", 0;
	end;
}
ac_cl_hall.gat,183,44,4	script	Ko#ac	732,{/* 52617 */
	callshop "ac_shop5";
	end;
OnInit:
	waitingroom "Bows and Guns for sale", 0;
	end;
}
ac_cl_hall.gat,181,35,4	script	Mori#ac	52,{/* 52618 */
	callshop "ac_shop6";
	end;
OnInit:
	waitingroom "Armor for sale", 0;
	end;
}
ac_cl_hall.gat,179,31,4	script	Shuri#ac	731,{/* 52619 */
	callshop "ac_shop7";
	end;
OnInit:
	waitingroom "Headwear for sale", 0;
	end;
}

//---------------------------------------------
// 冒険者アカデミー専用Lv判定
//  未転生1次職、BaseLevelが55未満 ならば真を返す。
function	script	AC_GetNovice	{
	return (BaseLevel<=55 && Upper!=1 && Job!=Job_Summoner && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja || Job==Job_SuperNovice));
}

//----------------------------------
// セーブ地点へワープ
// Taroの転送と流用
function	script	AC_WarpTown	{
	switch(getarg(0)) {
	case 0: warp "prontera.gat",150,190; break;
	case 1: warp "izlude.gat",126,113; break;
	case 2: warp "morocc.gat",147,93; break;
	case 3: warp "alberta.gat",103,129; break;
	case 4: warp "geffen.gat",117,103; break;
	case 5: warp "payon.gat",155,203; break;
	case 6: warp "einbroch.gat",217,188; break;
	case 7: warp "amatsu.gat",148,134; break;
	case 8: warp "aldebaran.gat",138,110; break;
	}
	return;
}

//----------------------------------
// 初心者修練場からワープ後の表示
//
function	script	AC_NoviceInfo	{
	if(AC_AFLIER || AC_PASSPORT) end;
	set AC_AFLIER,1;
	if(BaseLevel>10 || Job!=0 || Upper!=0) {
		mes "[" + strcharinfo(0) + "]";
		mes "hmm?" ;
		mes "-a flyer has fallen down-";
		next;
		menu "View flyer",-;
		viewpoint 1, getarg(1), getarg(2), 100, 0xFF0000;
		mes "-Adventurer Academy Students Wanted! -";
		mes "-Welcome new students! -";
		mes "-Registration location here! -";
		mes "-Location is marked on the map with ^FF0000+^000000 -";
		close;
	}
	mes "[Information]";
	mes "-It's time for the grand adventure to begin! First, let's go to the Adventurer Academy, where adventurers gather-";
	mes "-you're sure to find new friends!" ;
	next;
	mes "[Information]";
	mes getarg(0);
	next;
	viewpoint 1, getarg(1), getarg(2), 100, 0xFF0000;
	mes "[Information]";
	mes "-You can enter the Adventurer Academy by going to the ^FF0000+^000000 location shown on the mini-map in the upper right corner of the screen! -";
	mes "-The minimap can be toggled between views by pressing ^0000FFCtrl+Tab^000000-";
	close;
	return;
}

prontera.gat,146,51,0	script	#GT_07	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","-This is the capital ^0000FFProntera^000000-",153,192;
}
geffen.gat,120,79,0	script	#GT_02	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","-This is a magical city^0000FFGeffen^000000-",116,109;
}
morocc.gat,156,94,0	script	#GT_03	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","-This is a desert city^0000FFMorroc^000000-",147,101;
}
payon.gat,166,67,0	script	#GT_04	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","-This is a mountain city^0000FFPayon^000000-",159,205;
}
alberta.gat,114,58,0	script	#GT_05	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","-This is a port city^0000FFAlberta^000000-",107,132;
}

//prontera.gat,279,356,0	script	#GT_01	139,{/* 52656 */}

//----------------------------------
// 教室棟ホール

ac_cl_hall.gat,159,31,4	script	Ninja Tool Salesman#ac	49,{
	mes "[Ninja Tool Salesman]";
	mes "Hi there." ;
	mes "I sell Ninja equipment here." ;
	if (BaseLevel<=55 && Job==Job_Ninja) {
		while(1) {
			next;
			mes "[Ninja Tool Salesman]";
			mes "Which item do you want?" ;
			next;
			switch(select(	"Shuriken",
							"Nimbus Shuriken <- Lv 19 or lower, cannot be equipped",
							"Flash Shuriken <- Lv 39 or lower, cannot be equipped",
							"Ice Stone",
							"Flame Stone",
							"Wind Stone",
							"Shadow Orb",
							"Hand armor <- lvl 19 or lower, cannot be equipped",
							"Stop buying")) {
			case 1:
				set '@itemid,13250;
				set '@price,4;
				break;
			case 2:
				set '@itemid,13251;
				set '@price,10;
				break;
			case 3:
				set '@itemid,13252;
				set '@price,20;
				break;
			case 4:
				set '@itemid,7522;
				set '@price,150;
				break;
			case 5:
				set '@itemid,7521;
				set '@price,150;
				break;
			case 6:
				set '@itemid,7523;
				set '@price,150;
				break;
			case 7:
				set '@itemid,7524;
				set '@price,300;
				break;
			case 8:
				mes "[Ninja Tool Salesman]";
				mes "One cuirass, 1,000 Zeny." ;
				mes "Are you buying?" ;
				next;
				if(select("Don't buy", "Buy")==1) {
					mes "[Ninja Tool Salesman]";
					mes "Oh?" ;
					mes "Do we need the hand armor?" ;
					continue;
				}
				if(Zeny < 10000) {
					mes "[Ninja Tool Salesman]";
					mes "Looks like you don't have enough money, huh?" ;
					continue;
				}
				if(checkweight(2117,1)==0) {
					mes "[Ninja Tool Salesman]";
					mes "Apparently, you're not that popular, huh?" ;
					continue;
				}
				mes "[Ninja Tool Salesman]";
				mes "Yes, please." ;
				mes "Here's the promised goods." ;
				set Zeny,Zeny-10000;
				getitem 2117,1;
				continue;
			default:
				mes "[Ninja Tool Salesman]";
				mes "I see.";
				mes "Come back if you need anything else.";
				close;
			}
			mes "[Ninja Tool Salesman]";
			mes getitemname('@itemid)+ " is " +'@price+ "Zeny.";
			mes "How much do you want?";
			mes "Enter the number you want, between 1 and 1000.";
			mes "You can stop the purchase by entering 0.";
			next;
			input '@num;
			if('@num < 0 || '@num > 1000) {
				mes "[Ninja Tool Salesman]";
				mes "You can only buy 1000 at a time." ;
				continue;
			}
			if('@num == 0) {
				mes "[Ninja Tool Salesman]";
				mes "Oh?" ;
				mes getitemname('@itemid)+ " is not necessary?" ;
				continue;
			}
			if(Zeny < '@price*'@num) {
				mes "[Ninja Tool Salesman]";
				mes "Apparently you don't have enough money, huh?" ;
				continue;
			}
			if(checkweight('@itemid,'@num)==0) {
				mes "[Ninja Tool Salesman]";
				mes "Apparently, you're not that popular, huh?" ;
				continue;
			}
			mes "[Ninja Tool Salesman]";
			mes "Yes, please." ;
			mes "Here's the promised goods." ;
			set Zeny,Zeny-'@price*'@num;
			getitem '@itemid,'@num;
			continue;
		}
	} else {
		next;
		set '@novice, callfunc("AC_GetNovice");
		if ('@novice) {
			mes "[Ninja Tool Salesman]";
			mes "I'm sorry, but we can't sell Ninja supplies to anyone but Ninja." ;
			mes "We carry them from far away and we don't have much in stock." ;
			close;
		} else {
			mes "[Ninja Tool Salesman]";
			mes "Sorry, but we can't sell Ninja supplies to seasoned adventurers." ;
			mes "We don't want to be without something to give to fledgling adventurers." ;
			close;
		}
	}
	end;
OnInit:
	waitingroom "Ninja Tools for sale", 0;
	end;
}

ac_cl_hall.gat,158,34,4	script	Ammo Dealer#ac	85,{
	mes "[Ammo Dealer]";
	mes "Hi there." ;
	mes "I sell bullets for guns here." ;
	if (Job==Job_Gunslinger && BaseLevel<=55) {
		while(1){
			next;
			mes "[Ammo Dealer]";
			mes "Which bullets do you want?" ;
			next;
			set '@sel, select("Bullet", "Silver Bullet", "Bloody Bullet", "Stop Buying");
			mes "[Ammo Dealer]";
			switch('@sel){
			case 1:
				set '@itemid,13200;
				set '@price,1;
				mes "One Bullet, one Zeny." ; //全角文字で本家通り
				break;
			case 2:
				set '@itemid,13201;
				set '@price,15;
				mes "One Silver Bullet is 15 Zeny." ;
				break;
			case 3:
				set '@itemid,13202;
				set '@price,30;
				mes "One Bloody Bullet is 30 Zeny." ;
				break;
			default:
				mes "I see." ;
				mes "Come back when you need bullets." ;
				close;
			}
			mes "How much do you want?" ;
			mes "Enter the number you want, between 1 and 1000." ;
			mes "You can stop the purchase by entering 0." ;
			next;
			input '@num;
			if('@num < 0 || '@num > 1000) {
				mes "[Ammo Dealer]";
				mes "You can only buy 1000 at a time." ;
				continue;
			}
			if('@num == 0) {
				mes "[Ammo Dealer]";
				mes "Oh?" ;
				mes getitemname('@itemid)+ "is not necessary?" ;
				continue;
			}
			if(Zeny < '@price*'@num) {
				mes "[Ammo Dealer]";
				mes "Apparently you don't have enough money, huh?" ;
				continue;
			}
			if(!checkweight('@itemid,'@num)) {
				mes "Apparently, you're not that popular, huh?" ;
				continue;
			}
			mes "[Ammo Dealer]";
			mes "Yes, please." ;
			mes "Here's the promised goods." ;
			set Zeny,Zeny-'@price*'@num;
			getitem '@itemid,'@num;
		}
	} else {
		next;
		set '@novice, callfunc("AC_GetNovice");
		if ('@novice) {
			mes "[Ammo Dealer]";
			mes "I'm sorry, but I can't sell bullets to anyone but Gunslinger." ;
			close;
		} else {
			mes "[Ammo Dealer]";
			mes "I'm sorry, but I can't sell bullets to seasoned adventurers." ;
			mes "We need to keep an inventory for our fledgling adventurers." ;
			close;
		}
	}
	end;
OnInit:
	waitingroom "Bullets for sale", 0;
	end;
}

//------------------------------------------------------------------------------
// 教室棟 1F

//カプラサービスポスト
ac_cl_area.gat,41,145,4	script	Kafra Service	888,{
	mes "-(Kafra Service Co.) is always by your side-";
	mes " ";
	mes "-Which service do you use? -";
	next;
	switch(select("Save Location", "Storage Service -> 0z", "Read Warning", "Quit")){
	case 1:
		savepoint "ac_cl_area.gat",48,128;
		mes "-Saved-";
		mes "-Thank you for your service-";
		mes " ";
		mes "-(Kafra Service Co.) will always be by your side-";
		close;
	case 2:
		if(basicskillcheck() && ((getskilllv(1) < 6 && Job != Job_Summoner) || (getskilllv(5018) < 1 && Job == Job_Summoner))) {
			mes "-Storage will be available only after mastering basic skill level 6-";
			mes " ";
			mes "-(Kafra Service Co.) will always be by your side-";
			close;
		}
		openstorage;
		close;
	case 3:
		mes "-The Academy's storage is a free storage -";
		mes "-The storage should be used cleanly-";
		close;
	default:
		mes "-stopped using it-";
		close;
	}
	end;
}

//Mido
ac_cl_area.gat,45,146,4	script	Mido#ac_area	429,{
	set '@novice, callfunc("AC_GetNovice");
	cutin "jpn_mid01",2;
	if(AC_PASSPORT==2){
		mes "[Mido]";
		mes "Hello!" ;
		mes "Congratulations on entering the Adventurer Academy!" ;
		next;
		mes "[Mido]";
		mes "The Adventurer Academy is a school established for adventurers from all over the world." ;
		mes "If you have any questions, ask your seniors and teachers." ;
		next;
		mes "[Mido]";
		mes "I have a gift for you to celebrate your entrance into the school." ;
		next;
		set AC_PASSPORT,5;
		if(!checkweight(5406,1)){
			mes "[Mido]";
			mes "Huh?" ;
			mes "Looks like you have a lot of luggage." ;
			mes "You seem to have too many items." ;
			mes "Please go and reduce the number of items." ;
			goto L_END;
		}
		getitem 5406,1;
		set AC_PASSPORT,3; // 新入生祝い完了
		mes "[Mido]";
		mes ('@novice ?" Equip yourself with this and good luck!" : "You may not need it.");
		mes "Now you're part of the Adventurer Academy!" ;
		goto L_END;
	}
	if(AC_PASSPORT==5){
		mes "[Mido]";
		mes "Did you pack light?" ;
		mes "Come on, it's an entrance gift!" ;
		next;
		mes "-Make sure there are at least 2 openings in the number of types of items in your possession-";
		mes "-If you select \"Yes\" when there is no space available, you may lose the item-";
		next;
		mes "-If there is no space available, please select \"No\" once, leave at least two item types available, and speak again -";
		mes "-Are you accepting items? -";
		next;
		if(select("No", "Yes")==1){
			mes "[" + strcharinfo(0) + "]";
			mes "(Let's check the number of items.)" ;
			close;
		}
		if(!checkweight(5406,1)){
			mes "[Mido]";
			mes "Huh?" ;
			mes "Looks like you have a lot of luggage." ;
			mes "You seem to have too many items." ;
			mes "Please go and reduce the number of items." ;
			goto L_END;
		}
		getitem 5406,1;
		set AC_PASSPORT,3; // 新入生祝い完了
		mes "[Mido]";
		mes ('@novice ?" Equip yourself with this and good luck!" : "You may not need it.");
		mes "Now you're part of the Adventurer Academy!" ;
		goto L_END;
	}
	if(AC_RANK==7){ // 初心者以外未調査なのでとりあえず共通です。
		mes "[Mido]";
		mes "Congratulations on passing your primary course completion exam!" ;
		mes "To congratulate you on completing your first degree, I have something for you!" ;
		next;
		if(!checkweight(2751,10)){
			mes "[Mido]";
			mes "Huh?" ;
			mes "Looks like you have a lot of luggage." ;
			mes "You seem to have too many items." ;
			mes "Please go and reduce the number of items." ;
			goto L_END; 
		}
		getitem 2751,1;
		set AC_RANK,8;
		mes "[Mido]";
		mes "This badge is a sign of completion of the primary process!" ;
		mes "Put it on your chest, put it on your chest!" ;
		next;
		mes "[Mido]";
		mes "The primary process is over, but your adventure is far from over!" ;
		mes "Now it's your turn to teach all the beginners!" ;
		goto L_END;
	}
	if('@novice && AC_RANK<7){
		switch(AC_RANK){
		case 0:
			mes "[Mido]";
			mes "Hello!" ;
			mes "Welcome to the Adventurer Academy!" ;
			next;
			if(AC_CREDIT>0){
				mes "[Mido]";
				mes "I see you've only been in here a short time." ;
				mes "I know you don't understand a lot yet, but let's learn a little bit at a time!" ;
				mes "You can ask me anything about the Academy." ;
				break;
			}
			// 2010/05/25 アカデミー改革 ポリン団参上！で追加。
			mes "[Mido]";
			mes "I see you've only been in here a short time." ;
			mes "If you haven't decided on anything yet, you might want to help ^FF000000Lune^000000 work." ;
			mes "I think you'll get all kinds of requests, so you'll be able to travel around the world." ;
			next;
			mes "[Mido]";
			mes "^FF0000Lune^000000 is the lady with pink hair right next to me." ;
			mes "You'll have to ask Lune for more details." ;
			next;
			mes "[Mido]";
			mes "If you want to fight monsters right away and get a good shot, I'd go to the ^FF0000 training room or the special room ^000000." ;
			next;
			mes "[Mido]";
			mes "When you go to fight, don't forget to prepare the equipment and recovery items that were given to you at the reception and during the training." ;
			next;
			mes "[Mido]";
			mes "The entrance to the ^FF000000 lab and special room ^000000 is up here on the left." ;
			mes "There should be a ^0000FF Misty^000000 nearby who calls herself Polin Dan." ;
			next;
			mes "[Mido]";
			mes "I know you don't know it all yet, but learn it little by little!" ;
			mes "You can ask me anything about the Academy." ;
			break;
		case 1:
			mes "[Mido]";
			mes "Hey, it's you." ;
			mes "Are you used to the Academy by now?" ;
			mes "Is there something you want to ask me?" ;
			break;
		case 2:
		case 3:
		case 4: //未調査かもしれない
			mes "[Mido]";
			mes "Hey, it's you." ;
			mes "You're getting used to the academy pretty well, aren't you?" ;
			mes "Is there something you want to ask me?" ;
			break;
		case 5:
			mes "[Mido]";
			mes "Hey, it's you." ;
			mes "Hey, you're rumored to be a high achiever among the teachers." ;
			mes "You're almost done with the first course, aren't you?" ;
			mes "Good luck!" ;
			mes "Do you want something from me today?" ;
			break;
		case 6:
			mes "[Mido]";
			mes "Hello!" ;
			mes "Welcome to the Adventurer Academy!" ;
			next;
			mes "[Mido]";
			mes "Ask me anything about this academy!" ;
			mes "Is there anything more I can teach you, even if it's ......?" ;
			mes "You're almost done with your primary course!" ;
			mes "Do you want something from me today?" ;
			break;
		}
	} else {
		mes "[Mido]";
		mes "Hey there!" ;
		mes "What can I do for you today?" ;
	}
	next;
	if('@novice){ menu "Ask what to do",L_TODO, "Ask what's important",L_IMPORTANT, "About the Adventurer Academy",L_ABOUT, "About inside the school",L_SCHOOL, "Show me the world map",L_VIEWWORLD," I want the book of professions",L_GIVEBOOK, "Have a chat",L_TALK; }
	else { menu "About the Adventurer Academy",L_ABOUT, "About inside the school",L_SCHOOL, "Show me the world map",L_VIEWWORLD, "Have a chat",L_TALK; }
L_TODO:
	// 2010/05/25 アカデミー改革 ポリン団参上！で追加。
	//どうしたらいいのか聞く
	mes "[Mido]";
	mes "Uh, yeah." ;
	L_REP_01:
	mes "First of all, you need to get the credits to take the exam, right?" ;
	next;
	mes "[Mido]";
	mes "To get credit, you can help ^0000FFLune^000000 or help the ^000000 Polin Dan misties ^000000 and their friends." ;
	next;
	mes "[Mido]";
	mes "When you get your credits, you may take the ^FF000000 first process exam ^000000 from Lune." ;
	mes "There are a number of exams, so let's go through them in order." ;
	next;
	mes "[Mido]";
	mes "And once you've completed the entire first process, I'll give you a commemorative ^FF000000 Academy Badge[0]^000000 as a gift to you!" ;
	next;
	mes "[Information]";
	mes "Would you like to see the effect of Academy Badge [0]?" ;
	next;
	if(select("Yes", "No")==1){
		mes "[Information]";
		mes "-Academy Badge[0]-";
		mes "The academy badge that you will receive upon completion of the first exam." ;
		next;
		mes "[Information]";
		mes "-Academy Badge[0]-";
		mes "The shape of the badge is a prayer that a full-fledged adventurer will be able to leave the nest after accumulating knowledge." ;
		next;
		mes "[Information]";
		mes "-Academy Badge[0]-";
		mes "When BaseLv 79 or lower,";
		mes "MaxHP + 400";
		mes "MaxSP + 200";
		mes "Series : ^7777777 Accessory ^000000";
		mes "Defense : ^7777770^000000";
		mes "Weight : ^77777710^000000";
		mes "Equipment : ^7777777 all professions^000000";
		next;
		mes "[Information]";
		mes "-Would you like to hear Mido speak again? -";
		next;
		if(select("Yes, again", "No, not necessary")==1){
			mes "[Mido]";
			mes "Okay, let me explain again." ;
			goto L_REP_01;
		}
	}
	mes "[Mido]";
	mes "Well, good luck with that." ;
	mes "If you have any questions, you can ask me anything." ;
	goto L_END;
L_IMPORTANT:
	//大事な話を聞きなおす(未調査)
	mes "[Mido]";
	mes "Huh?" ;
	mes "There doesn't seem to be anything I can explain to you right now." ;
	next;
	menu "Quit";
	mes "[Mido]";
	mes "If you have any other questions, just ask me." ;
	goto L_END;
L_ABOUT:
	mes "[Mido]";
	mes "The Adventurer Academy is a school established for adventurers." ;
	mes "If you don't understand something, ask your seniors and teachers to teach you things." ;
	next;
	mes "[Mido]";
	mes "The Adventurer Academy offers a variety of support until you become a full-fledged adventurer." ;
	next;
	mes "[Mido]";
	mes "Meet one of these conditions to be accepted as a full-fledged member of the Adventurer Academy." ;
	mes "One, you have to be Baselv56 or higher!" ;
	mes "Two, you're in the second job or higher profession!" ;
	mes "Three, reborn!" ;
	next;
	if(!'@novice){
		mes "[Mido]";
		mes "You're a full-fledged adventurer now!" ;
		mes "As a senior adventurer, I hope you can help a fledgling adventurer!" ;
		goto L_END;
	}
	mes "[Mido]";
	mes "If you meet any of these conditions, you're one of a kind!" ;
	mes "We are all fledgling adventurers together until we become one." ;
	mes "You can find your friends here and explore the world in many ways!" ;
	goto L_END;
L_SCHOOL:
	mes "[Mido]";
	mes "What place do you want to hear about?" ;
	next;
	switch(select("1F Lecture room", "1F Study room", "1F Practice room", "1F Sales", "1F Library", "2F Exam room", "2F Reference room", "No more to ask")) {
	case 1:
		mes "[Mido]";
		mes "It's a training room." ;
		mes "In the training room, I give lectures for fledgling adventurers." ;
		next;
		mes "[Mido]";
		mes "You can learn the basics you need for my adventures from Puron, Aldi, and Ein." ;
		next;
		mes "[Mido]";
		mes "The training room is next to this [first floor of the classroom building]." ;
		mes "Look for the sign in this room." ;
		next;
		goto L_SCHOOL;
	case 2:
		mes "[Mido]";
		mes "It's a study room, right?" ;
		mes "We give all kinds of advice in the study room." ;
		mes "If you have any problems, you can go there." ;
		next;
		mes "[Mido]";
		mes "You should be able to get advice from Ruthie about your profession, from Fay about your quest skills, and from Utah about your job change quest." ;
		next;
		mes "[Mido]";
		mes "The study room is next to this [classroom building, 1st floor]." ;
		mes "Look for the sign in this room." ;
		next;
		goto L_SCHOOL;
	case 3:
		mes "[Mido]";
		mes "It's a practice room/special room." ;
		mes "In the training room, various monsters inhabit, and we can conduct investigations and practice fighting monsters." ;
		next;
		mes "[Mido]";
		mes "The training rooms are opened at different locations depending on your strength, so remember where you can go.";
		next;
		mes "[Mido]";
		mes "The Recovery Plate will be available to all Adventurer Academy students, and will be used for multi-person investigations.";
		next;
		//mes "[Mido]";
		//mes "大人数パーティで利用すると、";
		//mes "調査やモンスターとの戦闘実習が";
		//mes "楽になるから、利用してみてね。";
		//mes "もちろん、少人数パーティでも";
		//mes "利用できるけど、人数が少ないほど";
		//mes "効果が低くなるから気をつけてね。";
		//next;
		//mes "[Mido]";
		//mes "lv1～lv25、lv20～lv35、lv30～lv45";
		//mes "用の実習室は";
		//mes "この[教室棟1F]の隣にあるよ。";
		//mes "この部屋にある看板を探してみてね。";
		//next;
		//mes "[Mido]";
		//mes "他にも隠された実習室が";
		//mes "あるらしいけどね。";
		//next;
		//goto L_SCHOOL;
		//2010/04/13修正
		mes "[Mido]";
		mes "The more advanced you become, the more ^FF0000 power you need ^000000 when performing recovery." ;
		mes "The more advanced you are, the longer it takes to recharge your power, so you need to be careful." ;
		next;
		goto L_SCHOOL;
	case 4:
		mes "[Mido]";
		mes "In the hall of the classroom building next to this [First floor of the classroom building], there are salespeople selling a variety of equipment." ;
		next;
		mes "[Mido]";
		mes "You can find most of the basics here.";
		next;
		goto L_SCHOOL;
	case 5:
		mes "[Mido]";
		mes "In the library next to the entrance hall, you can look up all sorts of things." ;
		next;
		mes "[Mido]";
		mes "You can look up not only the basic operations, but also the conversations you often see around town, details about skills, and anything else you don't understand." ;
		next;
		goto L_SCHOOL;
	case 6:
		mes "[Mido]";
		mes "[The second floor of the classroom building] has an exam room." ;
		next;
		mes "[Mido]";
		mes "When Lune asks you to take the exam, talk to Guard in the exam room and take the exam." ;
		next;
		goto L_SCHOOL;
	case 7:
		mes "[Mido]";
		mes "There is a reference room on the [2nd floor of the classroom building].";
		next;
		mes "[Mido]";
		mes "Old Yong in the reference room is very knowledgeable, so he knows a lot of places." ;
		next;
		goto L_SCHOOL;
	case 8:
		mes "[Mido]";
		mes "If you ever want to hear it again, come to me." ;
		goto L_END;
	}
	goto L_END;
	
L_VIEWWORLD:
	cutin "jpn_mid01",255;
	cutin "world_map_001",3;
	mes "[Mido]";
	mes "This is a map of the world where the Midgard continent is located." ;
	next;
	mes "[Mido]";
	mes "There are many adventurers traveling around the world." ;
	mes "There are many cities and many different people living in them." ;
	next;
	mes "[Mido]";
	mes "There are other towns besides the ones on this map." ;
	mes "If you find a new town, you might want to stop by on your adventure." ;
	close;
L_GIVEBOOK:
	//2010/04/13追加
	mes "[Mido]";
	mes "Do you want the Job Book?" ;
	next;
	if(select("Yes", "No")==2){
		mes "[Mido]";
		mes "Huh?" ;
		mes "You don't want it." ;
		mes "If you lost it or something, I will get the book for you." ;
		goto L_END;
	}
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
		mes "[Mido]";
		mes "Yes." ;
		mes "Good luck then." ;
		mes " ";
		mes "-Mido gave me the book-";
		goto L_END;
	}
	//未調査
	mes "[Mido]";
	mes "You should probably organize your belongings a bit." ;
	mes "You should use Kafra Service to store your important things and sell what you don't need to merchants." ;
	goto L_END;
L_TALK:
	switch(rand(12)){
	case 0:
		mes "[Mido]";
		mes "The mark of the Adventurers Academy comes from the six-pointed star, which represents true wisdom, the Philosopher's Stone." ;
		goto L_END;
	case 1:
		mes "[Mido]";
		mes "I heard that this school had a different library from the one we have now." ;
		next;
		mes "[Mido]";
		mes "I don't know any of the details either." ;
		goto L_END;
	case 2:
		mes "[Mido]";
		mes "Are you in trouble because there's nothing to do?" ;
		next;
		mes "[Mido]";
		mes "Then you should talk to Lune." ;
		mes "He will explain in detail the requests that come to the Adventurers' Academy." ;
		goto L_END;
	case 3:
		mes "[Mido]";
		mes "Do you know about the hidden lab?" ;
		next;
		mes "[Mido]";
		mes "I heard that somewhere in the hall of the classroom building, there is a lab that used to be open to the public." ;
		next;
		mes "[Mido]";
		mes "It's rumored that that practice room was sealed up somehow because it was too dangerous." ;
		goto L_END;
	case 4:
		mes "[Mido]";
		mes "I'm a teacher like this now, but I used to be an adventurer too." ;
		mes "I was so excited when I arrived at the town of Lutie." ;
		next;
		mes "[Mido]";
		mes "I saw snow for the first time in my life." ;
		mes "It was a little cold, but it was fun." ;
		next;
		mes "[Mido]";
		mes "In my case, Santa in Aldebaran transported me there." ;
		mes "Is he still there?" ;
		goto L_END;
	case 5:
		mes "[Mido]";
		mes "This academy is made possible by everyone's donations." ;
		next;
		mes "[Mido]";
		mes "We are really looking forward to wonderful adventurers like you." ;
		goto L_END;
	case 6:
		mes "[Mido]";
		mes "Do you believe in the world of the dead?" ;
		mes "People don't believe me, but I have been to the world of the dead." ;
		next;
		mes "[Mido]";
		mes "The world of the dead really exists." ;
		mes "That was, I think, when I tried bungee jumping in Umbala: ......";
		next;
		mes "[Mido]";
		mes "I don't remember the details anymore, but I believe that experience was not a dream." ;
		goto L_END;
	case 7:
		mes "[Mido]";
		mes "Lune looks very solid, doesn't he?" ;
		next;
		mes "[Mido]";
		mes "But actually, he has a strong sweet tooth." ;
		next;
		mes "[Mido]";
		mes "I used to be treated to ice cream all the time. ......";
		goto L_END;
	case 8:
		mes "[Mido]";
		mes "We're recruiting a lot of adventurers for the Adventurer Academy." ;
		next;
		mes "[Mido]";
		mes "If you know someone who hasn't joined the academy yet, you should definitely give them a shout." ;
		goto L_END;
	case 9:
		mes "[Mido]";
		mes "There is a very famous teacher at this school." ;
		next;
		mes "[Mido]";
		mes "He's a teacher who studies monsters and he's very ......";
		mes "No, he's a little different!" ;
		next;
		mes "[Mido]";
		mes "You'll see how it's changed as soon as you see him in person!" ;
		goto L_END;
	case 10:
		mes "[Mido]";
		mes "Well, last time I heard, the principal wanted to expand this facility." ;
		next;
		mes "[Mido]";
		mes "It doesn't look like it will be possible for a while, but maybe someday the school building will be bigger." ;
		goto L_END;
	case 11:
		mes "[Mido]";
		mes "Did you already speak with Grandpa Yong upstairs?" ;
		next;
		mes "[Mido]";
		mes "He likes books so much, he's in the reference room all the time." ;
		next;
		mes "[Mido]";
		mes "...... What the hell is his job?" ;
		goto L_END;
	}
L_END:
	close2;
	cutin "jpn_mid01",255;
	end;
OnInit:
	waitingroom "Beginners, click here.", 0;
	end;
}


//Modo
ac_cl_area.gat,61,166,4	script	Modo#AC	704,{
	set '@novice, callfunc("AC_GetNovice");
	if (!'@novice) {
		mes "[Modo]";
		mes "Hello." ;
		mes strcharinfo(0)+ ", you don't seem to need my help." ;
		mes "From now on, please travel around, not only within the academy." ;
		close;
	}
	mes "[Modo]";
	mes strcharinfo(0)+ ", I'm renting out carts here." ;
	next;
	mes "[Modo]";
	mes "Would you like to use the cart?" ;
	mes "It's free." ;
	next;
	switch(select("Use cart", "About cart", "Nevermind")){
	case 1:
		if(Job!=Job_Merchant && Job!=Job_SuperNovice){
			mes "[Modo]";
			mes "Huh?" ;
			mes "You can only use the cart if you are a Merchant and its higher jobs or a Supernovice." ;
			close;
		}
		setcart;
		mes "[Modo]";
		mes "Please come back if you need us again." ;
		close;
	case 2:
		mes "[Modo]";
		mes "The carts are available to merchants and their higher jobs, plus Supernovice." ;
		mes "You'll have to learn the \"push cart\" skill to use it." ;
		close;
	default:
		mes "[Modo]";
		mes "See you then." ;
		close;
	}
OnInit:
	waitingroom "Cart rental",0;
}

//Taro
ac_cl_area.gat,57,173,2	script	Taro#AC	931,{
	set '@novice, callfunc("AC_GetNovice");
	if ('@novice) {
		if(AC_RANK==0){
			mes "[Taro]";
			mes "Oh, " +strcharinfo(0)+ " you are here." ;
			mes "I'm here to help with the transfer." ;
		} else
		if(AC_RANK<3){
			mes "[Taro]";
			mes "Isn't it "+strcharinfo(0)+"?";
			mes "You seem to be doing well today." ;

		} else
		if(AC_RANK<=6){
			mes "[Taro]";
			mes "You seem to be very active." ;
			mes "Master " +strcharinfo(0)+ ", next time please tell me about your trip." ;
		} else
		if(AC_RANK>=7){
			mes "[Taro]";
			mes "You're looking splendid." ;
			mes strcharinfo(0)+ ", you seem to be able to do anything." ;
		}
		next;
		if(Job==Job_Novice) goto L_NOVICE;
		mes "[Taro]";
		mes "Where are you going?" ;
		mes "There's no charge for the registration point at the Academy." ;
		next;
		if('mapprice==0) {
			setarray 'mapprice,  500,400,350,300,250,200
								,400,300,250,200,150,100
								,650,600,500,400,300,200
								,750,700,600,500,400,300
								,750,700,600,500,400,300
								,650,600,500,400,300,200;
		}
		set '@rank,(AC_RANK < 5 ? AC_RANK : 5);
		set '@num, select(
			"Prontera -> " +(AC_SAVE_MAP!=0 ? 'mapprice[    '@rank] : 0)+ "z",
			"Izlude -> " +(AC_SAVE_MAP!=1 ? 'mapprice[1*6+'@rank] : 0)+ "z",
			"Morroc -> "     +(AC_SAVE_MAP!=2 ? 'mapprice[2*6+'@rank] : 0)+ "z",
			"Alberta -> " +(AC_SAVE_MAP!=3 ? 'mapprice[3*6+'@rank] : 0)+ "z",
			"Geffen -> "   +(AC_SAVE_MAP!=4 ? 'mapprice[4*6+'@rank] : 0)+ "z",
			"Payon -> " +(AC_SAVE_MAP!=5 ? 'mapprice[5*6+'@rank] : 0)+ "z",
			"Nevermind")-1;
		if ('@num==6) goto L_CANCEL;
		set '@price,(AC_SAVE_MAP!='@num ? 'mapprice['@num]['@rank] : 0);
		if(Zeny<'@price) {
			mes "[Taro]";
			mes "Oops, you don't have enough money." ;
			mes "Please come back again." ;
			close;
		}
		mes "[Taro]";
		mes "Then I'll transfer you." ;
		close2;
		set Zeny,Zeny-'@price;
		callfunc "AC_WarpTown",'@num;
		end;

	} else {
		mes "[Taro]";
		mes "Hello." ;
		mes strcharinfo(0)+ ", you look good today." ;
		next;
		mes "[Taro]";
		mes "It seems you don't need my help." ;
		mes "As a senior member of the academy, you should look after the juniors." ;
		mes " ";
		mes "Would you like to return to the city where you registered?" ;
		next;
		menu "Return",L_RETURN, "Do not return",-;
		mes "[Taro]";
		mes "If you want to go back, you can always tell me." ;
		close;
	L_RETURN:
		mes "[Taro]";
		mes "Then I'll transfer you." ;
		close2;
		callfunc "AC_WarpTown",AC_SAVE_MAP;
		end;
	}
L_NOVICE:
	mes "[Taro]";
	mes "You are a Novice, aren't you?" ;
	mes "We offer free job search assistance to Novices." ;
	mes " ";
	mes "Where would you like to go?" ;
	next;
	set '@num,select("Prontera -> 0z","Izlude -> 0z","Morroc -> 0z","Alberta -> 0z","Geffen -> 0z","Payon -> 0z","Einbroch -> 0z","Amatsu -> 0z","Aldebaran -> 0z","やっぱりやめる")-1;
	if ('@num==9) goto L_CANCEL;
	mes "[Taro]";
	mes "Then I'll transfer you." ;
	close2;
	callfunc "AC_WarpTown",'@num;
	end;
L_CANCEL:
	mes "[Taro]";
	mes "I understand." ;
	mes "Please come back again." ;
	close;
OnInit:
	waitingroom "Transfer Services",0;
}

// ----------------------------------------------
// Haim(Luneの依頼の関連マップへの転送)
ac_cl_area.gat,57,168,4	script	Haim	798,{
	mes "[Haim]";
	mes "Hi there." ;
	mes "I'm Haim." ;
	next;
	set '@novice, callfunc("AC_GetNovice");
	if ('@novice)	goto L_NOVICE;
	else			goto L_EXPERT;
L_NOVICE:
	if(AC_QUEST_ST_0+AC_QUEST_ST_1+AC_QUEST_ST_2+AC_QUEST_ST_3+AC_QUEST_ST_4==0){
		mes "[Haim]";
		mes "If Lune says anything to you, come back." ;
		mes "I'll help you out a little bit." ;
		close;
	}
	mes "[Haim]";
	mes "Lune told me about this." ;
	mes "I'll transfer you." ;
	mes "Where do you want to go?" ;
	mes "^0000FF-Lune request/test is in progress and a '+' indicating the destination will appear in the mini-map in the upper right corner of the screen after the transfer-^000000";
	next;
	//クエスト状態取得

	set '@warplist,0; //マップ表示順が本鯖どおりになるように入れる
	//Prontera
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==0)||	//気になるあの子１
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==1)||	//気になるあの子２
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==2)||	//気になるあの子３
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==3)||	//気になるあの子４
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==5)||	//気になるあの子６
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==6)||	//気になるあの子７
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==7)||	//気になるあの子８
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==1)||	//ダンジョン救出１
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==5)||	//ダンジョン救出３
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==8)||	//実験のお手伝い５
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==0)||	//冒険者になりたい１
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==1)||	//冒険者になりたい２
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==3)||	//冒険者になりたい４
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==5)||	//冒険者になりたい６
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==8)||	//冒険者になりたい９
		(AC_RANK==1 && AC_RANKTEST && AC_RANKTEST<98)||				//第2課程試験
		(AC_RANK==3 && AC_RANKTEST && AC_RANKTEST<98)||				//第4課程試験
		(AC_RANK==4 && AC_RANKTEST && AC_RANKTEST<98)){				//第5課程試験
		set '@warplist[getarraysize('@warplist)],1;
	}
	//Morroc
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==2)||	//気になるあの子３
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==4)||	//気になるあの子５
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==2)||	//実験のお手伝い２
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==2)||	//冒険者になりたい３
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==4)||	//冒険者になりたい５
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)){				//第6課程試験
		set '@warplist[getarraysize('@warplist)],3;
	}
	//Geffen
	if( (AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==0)||	//実験のお手伝い１
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==3)||	//気になるあの子４
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99)||						//冒険者になりたい(全エピソード)
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)){				//第6課程試験
		set '@warplist[getarraysize('@warplist)],5;
	}
	//Payon
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==4)||	//気になるあの子５
		(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==1)||	//奇跡の箱２
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)||	//お詫びの品を届けたい２
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==4)||	//実験のお手伝い３
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==6)||	//実験のお手伝い４
		(AC_RANK==2 && AC_RANKTEST && AC_RANKTEST<98)||			//第3課程試験
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)||			//第6課程試験
		(AC_RANK==6 && AC_RANKTEST && AC_RANKTEST<98)){			//第7課程試験
		set '@warplist[getarraysize('@warplist)],6;
	}
	//Alberta
	if( (AC_QUEST_ST_1 && AC_QUEST_ST_1<99) ||						//奇跡の箱(全エピソード)
		(AC_RANK==0 && AC_RANKTEST && AC_RANKTEST<98)){				//第1課程試験
		set '@warplist[getarraysize('@warplist)],4;
	}
	//Izlude
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==1)||	//気になるあの子２
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==7)||	//気になるあの子８
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8)||	//気になるあの子９
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==5)||	//お菓子の材料集め４
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==6)||	//お菓子の材料集め５
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==3)||	//ダンジョン救出２
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==7)){	//ダンジョン救出４
		set '@warplist[getarraysize('@warplist)],2;
	}
	//Aldebaran
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==0)||	//お世話になったあの人に
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==1)||	//お詫びの品を届けたい１
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==7)||	//お菓子お届け
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)){	//お詫びの品を届けたい２
		set '@warplist[getarraysize('@warplist)],7;
	}
	//Yuno
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==1)||	//お詫びの品を届けたい１
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==2)||	//お菓子の材料集め１
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==3)||	//お菓子の材料集め２
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==4)||	//お菓子の材料集め３
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==5)||	//お菓子の材料集め４
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==6)||	//お菓子の材料集め５
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==7)){	//お菓子お届け
		set '@warplist[getarraysize('@warplist)],8;
	}
	//Comodo
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==5)||	//気になるあの子６
		(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==7)){	//奇跡の箱８
		set '@warplist[getarraysize('@warplist)],10;
	}
	//Rachel
	if(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8){		//気になるあの子９
		set '@warplist[getarraysize('@warplist)],12;
	}
	//Veins
	if(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8){		//気になるあの子９
		set '@warplist[getarraysize('@warplist)],14;
	}
	//Einbroch
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==3){		//お菓子の材料集め２
		set '@warplist[getarraysize('@warplist)],19;
	}
	//Einbech
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==4){		//お菓子の材料集め３
		set '@warplist[getarraysize('@warplist)],20;
	}
	//Hugel
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)||	//お詫びの品を届けたい２
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99)){						//実験のお手伝い(全エピソード)
		set '@warplist[getarraysize('@warplist)],11;
	}
	//Lighthalzen
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==2){		//お菓子の材料集め１
		set '@warplist[getarraysize('@warplist)],13;
	}
	//Amatsu
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==2){		//奇跡の箱３
		set '@warplist[getarraysize('@warplist)],18;
	}
	//Gonryun
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==3){		//奇跡の箱４
		set '@warplist[getarraysize('@warplist)],15;
	}
	//Louyang
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==4){		//奇跡の箱５
		set '@warplist[getarraysize('@warplist)],16;
	}
	//Ayothaya
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==5){		//奇跡の箱６
		set '@warplist[getarraysize('@warplist)],17;
	}
	//Umbala
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==6){		//奇跡の箱７
		set '@warplist[getarraysize('@warplist)],9;
	}
	set '@mapselect$,"";
	for(set '@i,0; '@i<getarraysize('@warplist); set '@i,'@i+1){
		set '@mapselect$,'@mapselect$ + 'mapname$['@warplist['@i]-1] + ":";
	}
	set '@mapselect$,'@mapselect$ + "今は必要ない";
	set '@mapid, select('@mapselect$)-1;
	set '@num,'@warplist['@mapid]-1;
	if('mapname$['@num]=="") goto L_CANCEL;
	mes "[Haim]";
	mes "Then I'll transfer you." ;
	mes " ";
	mes "^0000FF-You can zoom in and out of the minimap by left clicking on the '+-' in the upper right corner in the minimap-^000000";
	next;
	mes "[Haim]";
	mes "To come back to the academy, ^0000FF 'Academy Officials' ^000000 are ^FF000000 near the center of town ^000000, so if you get lost, go near the center of town." ;
	close2;
	warp 'gatname$['@num],'map_xy['@num*2],'map_xy['@num*2+1];
	end;
L_EXPERT:
	mes "[Haim]";
	mes "With an adventurer as dignified as you, you may not need my help." ;
	mes "I'm here to help the inexperienced adventurers." ;
	next;
	if(select("Is that so?", "Why help here?")==1) {
		mes "[Haim]";
		mes "If you want to learn something, there is a library in the academy, you can go there once." ;
		close;
	}
	mes "[Haim]";
	mes "I was once rescued by a strange adventurer." ;
	mes "I still vividly remember that time." ;
	next;
	mes "[Haim]";
	mes "I am here now because of that man." ;
	next;
	emotion 2;
	mes "[Haim]";
	mes "Remember when you were a novice adventurer?";
	close;
L_CANCEL:
	mes "[Haim]";
	mes "Really?" ;
	mes "Come back when you need me again!" ;
	close;
OnInit:
	setarray 'gatname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat","aldebaran.gat","yuno.gat","umbala.gat","comodo.gat","hugel.gat","rachel.gat","lighthalzen.gat","veins.gat","gonryun.gat","louyang.gat","ayothaya.gat","amatsu.gat","einbroch.gat",  "einbech.gat";
	setarray 'mapname$,"Prontera",  "Izlude","Morroc",    "Alberta", "Geffen", "Payon","Aldebaran", "Yuno","Umbala",  "Comodo",    "Hugel", "Rachel",    "Lighthalzen",   "Veins", "Gonryun",   "Louyang",     "Ayothaya",    "Amatsu",    "Einbroch","Einbech";
	setarray 'map_xy,   147,190,      121,115,     147,93,      103,129,      110,103,    155,197,     138,110,        150,174,   100,154,     209,143,     90,146,     129,138,     214,156,          200,123,    160,120,      217,114,      216,175,       117,151,     217,188,         168,131;
	waitingroom "Assisting you",0;
	end;
}

//------------------------------------------------------------------------------
// 教室棟 2F

ac_cl_area.gat,63,81,0	script	3rd floorWP	45,1,1,{
	mes "[3rd floor]";
	mes "The 3rd floor is off limits to the general student population.";
	mes "Prohibited." ;
	close;
}

//Curator
ac_cl_area.gat,41,38,4	script	Curator	75,{
	mes "[Curator]";
	mes "This would be the reference room." ;
	mes "We collect all kinds of materials here." ;
	mes "How can I help you today?" ;
	next;
	if(select("Is Old Yong there?" , "Nothing")==2) {
		mes "[Curator]";
		mes "I see." ;
		mes "Please come back when the resource room is ready." ;
	} else {
		mes "[Curator]";
		mes "I think Grandfather Yong is in the reference room." ;
		mes "He's an old man who loves books." ;
	}
	close;
}

//Yongお爺さん
ac_cl_area.gat,39,23,4	script	Yong#ac_cl_area	766,{
	set '@novice, callfunc("AC_GetNovice");
	if(AC_RANK>0) goto L_TENSOU;
	if (!'@novice) {
		mes "[Yong]";
		mes "Woo hoo hoo." ;
		mes "Admiration, admiration." ;
		mes "I hope there will be more fine adventurers like you." ;
		next;
		mes "[Yong]";
		mes "If all the other students could be like you, I would be able to retire with peace of mind." ;
		mes "Woo hoo hoo." ;
		close;
	}
	mes "[Yong]";
	mes "Woohoo." ;
	mes "This is an interesting book you've found." ;
	mes "...... hmmm .........";
	mes "What material shall I put on this shelf?" ;
	mes "......";
	next;
	mes "[Yong]";
	mes "Hmm?" ;
	mes "You seem to be interested in books, too." ;
	mes "Do you like books?" ;
	next;
	if (select("Like", "Don't like")==2) {
		mes "[Yong]";
		mes "I see." ;
		mes "It's a lonely thing~" ;
		mes "Books are a good way to feel many different worlds." ;
		mes "You should try reading a variety of books, starting with the ones that interest you." ;
		next;
		mes "[Yong]";
		mes "There's a library at the Academy, too." ;
		mes "Why don't you visit it?";
		mes "It's too messy to read here." ;
		mes "Woah woah woah." ;
		close;
	}
	mes "[Yong]";
	mes "Woo hoo hoo." ;
	mes "Interest interest interest." ;
	mes "It's good to read different books." ;
	mes "Books give us a lot of knowledge." ;
	mes " ";
	mes "-Grandpa Yong seems to be happy-";
	next;
	mes "[Yong]";
	mes "Since we're on the subject, let me show you about my favorite place that I learned about from a book.";
	mes " ";
	mes "Shall we try it?" ;
	next;
	if(select("Going", "Not going")==2) {
		mes "[Yong]";
		mes "I see." ;
		mes "Too bad~" ;
		mes "This is my favorite place." ;
		mes "I'll be ready to send it to you anytime." ;
		close;
	}
	mes "[Yong]";
	mes "Then I'll transfer you." ;
	mes "It's a peaceful place, but watch out for the monsters!" ;
	close2;
	warp "prt_fild07.gat",78,287;
	end;
L_TENSOU:
	mes "[Yong]";
	mes strcharinfo(0) + "or." ;
	mes "I thought it was about time you came." ;
	mes "You seem to be doing well on your exams.";
	mes " ";
	mes "-Grandpa Yong brought the map-";
	next;
	cutin "support_map001.bmp",3;
	//一次過程修了でもセリフ変わらず
	mes "[Yong]";
	mes "This is the only place I am going to recommend to you." ;
	mes "As far as Mister Guard is concerned, you can't go to all of them." ;
	mes "This is as far as you can go." ;
	mes "Where do you want to go?" ;
	next;
	set '@select$,"";
	for(set '@i,0; '@i<13; set '@i,'@i+1){
		set '@select$,'@select$ + (AC_RANK >= 'REQUIRE['@i] ? 'MAPNAME$['@i] : "^FF0000Not allowed^000000") + ":";
	}
	set '@select$,'@select$ + "やっぱり行かない";
	set '@num,select('@select$);
	if(AC_RANK < 'REQUIRE['@num-1]){
		mes "[Yong]";
		mes "I'm sorry, but I can't recommend it to you right now." ;
		mes "Leave it somewhere else." ;
		close;
	}
	if('@num==10){
		mes "[Yong]";
		mes "Ummm ...... this is the place, there used to be a place called Sograt Desert 08 ......";
		mes "It's gone now, and I can't send you here." ;
		mes "You will have to find another place.";
		close;
	}
	if('@num==14){
		mes "[Yong]";
		mes "I see." ;
		mes "If you want to go, you can always tell me." ;
		mes "I'll be waiting for you." ;
		close;
	}
	mes "[Yong]";
	mes "Ein should be at the destination, so tell Ein when you want to return." ;
	mes "Be careful of the monsters." ;
	mes "Then, I'll send you on your way." ;
	mes "Woah woah woah." ;
	close2;
	switch('@num){
	case 1: warp "prt_sewb2.gat",70,100; end;
	case 2: warp "prt_fild07.gat",78,287; end;
	case 3: warp "pay_fild02.gat",135,172; end;
	case 4: warp "pay_dun00.gat",108,24; end;
	case 5: warp "pay_fild09.gat",218,289; end;
	case 6: warp "iz_dun00.gat",237,166; end;
	case 7: warp "gef_fild03.gat",32,55; end;
	case 8: warp "pay_dun01.gat",231,74; end;
	case 9: warp "gef_fild11.gat",369,294; end;
	case 11: warp "gef_fild12.gat",125,184; end;
	case 12: warp "mjolnir_05.gat",170,280; end;
	case 13: warp "gef_dun01.gat",247,231; end;
	}
	end;
OnInit:
	setarray 'MAPNAME$, "Prontera culverts B2F", "Prontera field 07", "Payon forest 02", "Payon cave B1F", "Payon forest 09", "Izlude underwater cave 1st floor", "Geffen field 03"," Payon underground cave B2F", "Geffen field 11","^8C008C extinction^000000", "Geffen field 12", "Mjolnir Mountains 05", "Geffen underground dungeon B2F";
	setarray 'REQUIRE,1,1,1,1,2,2,3,4,4,0,5,6,7;
}

//------------------------------------------------------------------------------
// Einの支援
// 補足：アンゼやマニピなどのPT支援系は、1人が行えばパーティ全員にかかる為、
//       処理が複雑になっています。

-	script	EinACFUNC	-1,{
	function	abs		{ return getarg(0)*(getarg(0)<0 ? -1 : 1); }
	set '@novice, callfunc("AC_GetNovice");
	if(AC_PASSPORT){
		if(!'@novice){
			mes "[Ein]";
			mes "You won't need my help anymore." ;
			mes "You have grown far beyond my expectations, and you've grown well." ;
			mes "You've helped so many people." ;
			close;
		}
		mes "[Ein]";
		mes "You are a student of the academy." ;
		mes "You shouldn't be so reckless." ;
		mes "Fighting with your friends is the key to longevity." ;
		mes " ";
		mes "Is there something you want to talk about?" ;
		next;
		menu "I want to get help.",L_SHIEN, "I want to go back to the Adventurers Academy.",L_WARP, "What are you doing?",L_WHAT, "Nothing",L_CANCEL;
	} else {
		if(!'@novice){
			mes "[Ein]";
			mes "......";
			mes "Are you a traveler?" ;
			mes "What can I do for you?" ;
			next;
			if(select("Nothing", "What are you doing?") ==1){
				mes "[Ein]";
				mes "There are monsters living around here, too." ;
				mes "Be careful on your journey." ;
				mes "Have a good trip." ;
				close;
			}
			mes "[Ein]";
			mes "I am here to take care of the students of the Adventurers Academy." ;
			mes "I help the fledgling adventurers." ;
			mes "You should try the Adventurer Academy." ;
			close;
		}
		mes "[Ein]";
		mes "......";
		mes "You sound like an adventurer." ;
		mes "I help adventurers in this place." ;
		mes "You should try the Adventurer's Academy." ;
		next;
		menu "Adventurer Academy?" ,-;
		mes "[Ein]";
		mes "It's like a school for adventurers." ;
		mes "Admission procedures can be done there." ;
		mes "If you want, I can send you to the Adventurer Academy, what do you say?" ;
		next;
		if(select("Send me", "Decline")==2){
			mes "[Ein]";
			mes "I see." ;
			mes "If you ever have trouble adventuring, go there and see." ;
			mes "There should be people from the academy around the center of town, too." ;
			close;
		}
		mes "[Ein]";
		mes "Okay." ;
		mes "Then we'll transfer you." ;
		close2;
		warp "ac_cl_room.gat",44,32;
		end;
	}
L_WARP:
	mes "[Ein]";
	mes "Do you want to go back to the Adventurers Academy?" ;
	next;
	if(select("Yes", "No")==2){
		mes "[Ein]";
		mes "I see." ;
		mes "Don't take it too hard." ;
		mes "If it gets dangerous, you can come back." ;
		close;
	}
	mes "[Ein]";
	mes "I guess we'll take a break once." ;
	mes "Then we'll transfer." ;
	close2;
	warp "ac_cl_area.gat",67,155;
	end;
L_SHIEN:
	mes "[Ein]";
	mes "No matter how much assistance you receive, it is not free of charge." ;
	mes "You're going to need Zeny." ;
	mes " ";
	mes "Which assistance would you like to receive?" ;
	next;
	switch(select(
				"^0000FF Basic Set^000000 - 10Zeny",
				(AC_RANK>3 ? "^FF0000 Auxiliary Set I^000000" : "^777777？？？？？ I^000000") + " - 50Zeny",
				(AC_RANK>3 ? "^006600 Auxiliary set II^000000" : "^777777？？？？？ II^000000") + " - 50Zeny",
				"Listen to the description of the set", "Quit"))
	{
	case 1:
		if(Zeny<10) goto L_NOMONEY;
		mes "[Ein]";
		mes "Okay." ;
		mes "Then be careful fighting." ;
		close2;
		set Zeny,Zeny-10;
		npcskillsupport 34,0;
		sc_end 10;
		sc_start 10,'BLESS[AC_RANK],'BASIC_LV[AC_RANK];	//SC_BLESSING
		npcskillsupport 29,0;
		sc_end 12;
		sc_start 12,'BLESS[AC_RANK],'BASIC_LV[AC_RANK];	//SC_INCREASEAGI
		if(!getcharid(1)){
			npcskillsupport 33,0,"","";
			sc_end 9;
			sc_start 9,'ANGEL[AC_RANK],'BASIC_LV[AC_RANK];	//SC_ANGELUS
			if(AC_RANK>=7){
				npcskillsupport 74,0,"","";
				sc_end 20;
				sc_start 20,90000,5;	//SC_MAGNIFICAT
			}
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; }  //マップチェック
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //範囲チェック
					npcskillsupport 33,0,"","";
					sc_end 9;
					sc_start 9,'ANGEL[AC_RANK],'BASIC_LV[AC_RANK];	//SC_ANGELUS
					if(AC_RANK>=7){
						npcskillsupport 74,0,"","";
						sc_end 20;
						sc_start 20,90000,5;	//SC_MAGNIFICAT
					}
					detachrid;
				}
			}
			if(!attachrid('@chid)) end; //アタッチしなおす
		}
		npcskillsupport 73,0,"","";//キリエだけ上手く再現できないのはなんでだ・・・
		sc_end 110;
		sc_end 19;
		sc_start 19,120000,'BASIC_LV[AC_RANK];	//SC_KYRIE
		end;
	case 2:
		if(AC_RANK<4) goto L_FEWLANC;
		if(Zeny<50) goto L_NOMONEY;
		mes "[Ein]";
		mes "Okay." ;
		mes "Then be careful fighting." ;
		close2;
		set Zeny,Zeny-50;
		npcskillsupport 66,0;
		sc_end 15;
		sc_start 15,60000,'SUP1_LV[AC_RANK];	//SC_IMPOSITIO
		if(!getcharid(1)){
			npcskillsupport 383,0,"","";
			sc_end 116;
			sc_start 116,'WINDW[AC_RANK],'SUP2_LV[AC_RANK];	//SC_WINDWALK
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; }  //マップチェック
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //範囲チェック
					npcskillsupport 383,0,"","";
					sc_end 116;
					sc_start 116,'WINDW[AC_RANK],'SUP2_LV[AC_RANK];	//SC_WINDWALK
					detachrid;
				}
			}
		}
		end;
	case 3:
		if(AC_RANK<4) goto L_FEWLANC;
		if(Zeny<50) goto L_NOMONEY;
		mes "[Ein]";
		mes "Okay." ;
		mes "Then be careful fighting." ;
		close2;
		set Zeny,Zeny-50;
		if(!getcharid(1)){
			npcskillsupport 112,0,"","";
			sc_end 24;
			sc_start 24,'WEAPF[AC_RANK],'SUP1_LV[AC_RANK];	//SC_WEAPONPERFECTION
			npcskillsupport 113,0,"","";
			sc_end 25;
			sc_start 25,'OVERT[AC_RANK],'SUP1_LV[AC_RANK];	//SC_OVERTHRUST
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; }  //マップチェック
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //範囲チェック
					npcskillsupport 112,0,"","";
					sc_end 24;
					sc_start 24,'WEAPF[AC_RANK],'SUP1_LV[AC_RANK];	//SC_WEAPONPERFECTION
					npcskillsupport 113,0,"","";
					sc_end 25;
					sc_start 25,'OVERT[AC_RANK],'SUP1_LV[AC_RANK];	//SC_OVERTHRUST
					detachrid;
				}
			}
		}
		end;
	case 4:
		mes "[Ein]";
		if(AC_RANK<4){
			mes "For now you only have ^0000FF basic set ^000000 available --" ;
		} else {
			mes "You have three types of assistance available to you.";
			mes "First of all ^0000FF basic set ^000000 -- ";
		}
		mes "it's Blessing, Increase Agility, Angelus, and Kyrie Eleison." ;
		mes "As you complete each exam, I will increase the level of your support skills." ;
		next;
		mes "[Ein]";
		mes "In the end, I'll offer the four skills I mentioned earlier in the basic set at lvl 10, plus a magnificat lvl 5 as an extra." ;
		if(AC_RANK<4){
			mes "That's all the explanation I have." ;
			close;
		}
		next;
		mes "[Ein]";
		mes "And ^FF000000 Auxiliary Set I ^000000 applies Impositio Manus and Windwalk, and ^006600 Auxiliary Set II ^000000 applies Weapon Perfection and Overthrust." ;
		next;
		mes "[Ein]";
		mes "Also, we'll raise the level as you grow." ;
		mes "I want you to make good use of it." ;
		close;
	default:
		goto L_CANCEL;
	}
	close;
L_FEWLANC:
	mes "[Ein]";
	mes "I'm sorry, but you are unable to receive this assistance now." ;
	mes "You should do a few more exams and get more practice." ;
	close;
L_NOMONEY:
	mes "[Ein]";
	mes "Hmm?" ;
	mes "You're short on money." ;
	mes "Maybe it's time to go back to the Adventurer's Academy." ;
	close;
L_WHAT:
	mes "[Ein]";
	mes "I've heard about you from Mido and Lune." ;
	mes "I'll support you here for a while until you can fight without help." ;
	next;
	mes "[Ein]";
	mes "As you progress in the Adventurer Academy, I will give you the support you deserve." ;
	next;
	mes "[Ein]";
	mes "I can't help you forever, but I'll stick with you until you grow up to be a strong adventurer." ;
	close;
L_CANCEL:
	mes "[Ein]";
	mes "I see." ;
	mes "Be careful on your way." ;
	close;
OnInit:
	//スキルレベル
	setarray 'BASIC_LV,3,4,5,6,7,8,9,10;
	setarray 'SUP1_LV, 0,0,0,0,2,3,4,5;
	setarray 'SUP2_LV, 0,0,0,0,4,6,8,10; //ウインドウォーク用
	//スキル持続時間
	setarray 'BLESS,100000,120000,140000,160000,180000,200000,220000,240000;//IA共用
	setarray 'ANGEL,90000,120000,150000,180000,210000,240000,270000,300000;
	setarray 'WINDW,0,0,0,0,220000,280000,340000,400000;
	setarray 'WEAPF,0,0,0,0,20000,30000,40000,50000;
	setarray 'OVERT,0,0,0,0,40000,60000,80000,100000;
	//キリエ 120000 マニピ 90000 IMP 60000
}
prt_fild07.gat,78,290,4		duplicate(EinACFUNC)		Ein#PRTF07	747
prt_sewb2.gat,70,103,4		duplicate(EinACFUNC)		Ein#PRTSB2	747
pay_fild02.gat,135,175,4	duplicate(EinACFUNC)		Ein#PAYF02	747
pay_dun00.gat,108,26,4		duplicate(EinACFUNC)		Ein#PAYD00	747
pay_fild09.gat,218,292,4	duplicate(EinACFUNC)		Ein#PAYF09	747
iz_dun00.gat,237,169,4		duplicate(EinACFUNC)		Ein#IZLD00	747
gef_fild03.gat,32,58,4		duplicate(EinACFUNC)		Ein#GEFF03	747
pay_dun01.gat,231,77,4		duplicate(EinACFUNC)		Ein#PAYD01	747
gef_fild11.gat,369,297,4	duplicate(EinACFUNC)		Ein#GEFF11	747
gef_fild12.gat,125,187,4	duplicate(EinACFUNC)		Ein#GEFF12	747
mjolnir_05.gat,170,285,4	duplicate(EinACFUNC)		Ein#MJOL05	747
gef_dun01.gat,247,234,4		duplicate(EinACFUNC)		Ein#GEFD01	747

