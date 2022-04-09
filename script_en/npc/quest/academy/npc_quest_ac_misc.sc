//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy by Pneuma
//------------------------------------------------------------

//---------------------------------------------
// SHOP

- shop Consumables Salesman::ac_shop1 -1,519,517,501,506,502,504,611,601,525,645,656,610
- shop Tool Dealer::ac_shop2 -1,1750,1770,1751,717
- shop Zen::ac_shop3 -1,1351,1354,1116,1151,1154,1451,1454,1457
- shop Ai::ac_shop4	-1,1204,1207,1210,1213,1216,1101,1104,1107,1110,1113,1122,1601,1604,1607,1501,1504,1507,1510,1519,1301,1401,1404,1407
- shop Ko::ac_shop5 -1,1701,1704,1707,1710,13150,13151,13102,13154,13155
- shop Mori::ac_shop6 -1,2303,2305,2328,2323,2332,2307,2309,2312,2501,2503,2505,2101,2103,2401,2403,2405,2608,2627
- shop Shuri::ac_shop7 -1,2211,2208,2220,2222,2232,2216,2226,2206,2228,2230,2212,2205,2203,2201,2239,2243,2242,2218,2241

ac_cl_hall.gat,155,35,4	script	Consumables Salesman#ac	93,{/* 52611 */
	callshop "ac_shop1";
	end;
OnInit:
	waitingroom "Supplies on sale", 0;
	end;
}
ac_cl_hall.gat,152,29,4	script	Tool Dealer#ac	82,{/* 52612 */
	callshop "ac_shop2";
	end;
OnInit:
	waitingroom "Arrows and blue gems for sale", 0;
	end;
}
ac_cl_hall.gat,178,43,4	script	Zen#ac	752,{/* 52615 */
	callshop "ac_shop3";
	end;
OnInit:
	waitingroom "Two handed weapons for sale", 0;
	end;
}
ac_cl_hall.gat,182,39,3	script	Ai#ac	815,{/* 52616 */
	callshop "ac_shop4";
	end;
OnInit:
	waitingroom "one-handed weapons for sale", 0;
	end;
}
ac_cl_hall.gat,183,44,4	script	Ko#ac	732,{/* 52617 */
	callshop "ac_shop5";
	end;
OnInit:
	waitingroom "Bows and guns for sale", 0;
	end;
}
ac_cl_hall.gat,181,35,4	script	Mori#ac	52,{/* 52618 */
	callshop "ac_shop6";
	end;
OnInit:
	waitingroom "armor on sale", 0;
	end;
}
ac_cl_hall.gat,179,31,4	script	Shuri#ac	731,{/* 52619 */
	callshop "ac_shop7";
	end;
OnInit:
	waitingroom "head equipment on sale", 0;
	end;
}

//---------------------------------------------
// Adventurer Academy exclusive lvl determination
// Return true if unincarnated 1st job and BaseLevel is less than 55.
function	script	AC_GetNovice	{
	return (BaseLevel<=55 && Upper!=1 && Job!=Job_Summoner && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja || Job==Job_SuperNovice));
}

//----------------------------------
// Warp to save point
// Taro transfer and diversion
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
// Display after warp from beginner training area
//
function	script	AC_NoviceInfo	{
	if(AC_AFLIER || AC_PASSPORT) end;
	set AC_AFLIER,1;
	if(BaseLevel>10 || Job!=0 || Upper!=0) {
		mes "[" + strcharinfo(0) + "]";
		mes "hmm?";
		mes "-Flyer is down-";
		next;
		menu "-flyer is down-",-;
		viewpoint 1, getarg(1), getarg(2), 100, 0xFF0000;
		mes "-Adventurer Academy students wanted! -";
		mes "-Welcome new students! -";
		mes "-Registration area is here! -";
		mes "-Location is marked on the map with ^FF0000 + ^000000 -";
		close;
	}
	mes "[Information]";
	mes "-Finally, the epic adventure begins!";
	mes "First, let's go to the Adventurer Academy, where adventurers gather-";
	mes "-you're sure to find new friends!";
	next;
	mes "[Information]";
	mes ""+getarg(0);
	next;
	viewpoint 1, getarg(1), getarg(2), 100, 0xFF0000;
	mes "[Information]";
	mes "-You can enter the Adventurer Academy by going to the ^FF0000+^000000 location shown on the mini-map in the upper right corner of the screen! -";
	mes "-The minimap can be toggled by pressing ^0000FFCtrl+Tab^000000 -";
	close;
	return;
}

prontera.gat,146,51,0	script	#GT_07	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","-here is the capital^0000FFProntera^000000-",153,192;
}
geffen.gat,120,79,0	script	#GT_02	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","-This is a magic city^0000FFGeffen^000000-",116,109;
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
	callfunc "AC_NoviceInfo","-This is Port City^0000FFAlberta^000000-",107,132;
}

//prontera.gat,279,356,0	script	#GT_01	139,{/* 52656 */}

//----------------------------------
// Classroom Building Hall

ac_cl_hall.gat,159,31,4	script	Ninja equipment salesman#ac	49,{
	mes "[Ninja equipment salesman]";
	mes "Hi there.";
	mes "We sell Ninja equipment here.";
	if (BaseLevel<=55 && Job==Job_Ninja) {
		while(1) {
			next;
			mes "[Ninja tool salesman]";
			mes "Which item do you want?";
			next;
			switch(select( "shuriken",
							"Shuriken of Raincloud <- Lv 19 or lower, cannot be equipped",
							"Shuriken of Flash <- Lv 39 and below cannot be equipped",
							"Ice flash stone",
							"Fiery fire stone",
							"Wind chime stone",
							"Shadow Pearl",
							"Hand armor <- lvl 19 or lower, cannot be equipped",
							"Stop buying")) {
			case 1: set '@itemid,13250; set '@price,4; break;
			case 2: set '@itemid,13251; set '@price,10; break;
			case 3: set '@itemid,13252; set '@price,20; break;
			case 4: set '@itemid,7522; set '@price,150; break;
			case 5: set '@itemid,7521; set '@price,150; break;
			case 6: set '@itemid,7523; set '@price,150; break;
			case 7: set '@itemid,7524; set '@price,300; break;
			case 8:
				mes "[Ninja tool salesman]";
				mes "One hand armor, 10000Zeny.";
				mes "Are you buying?";
				next;
				if(select("don't buy", "buy")==1) {
					mes "[Ninja tool salesman]";
					mes "Oh?";
					mes "Don't we need hand armor?";
					continue;
				}
				if(Zeny < 10000) {
					mes "[Ninja tool salesman]";
					mes "Looks like you don't have enough money, huh?";
					continue;
				}
				if(checkweight(2117,1)==0) {
					mes "[Ninja tool salesman]";
					mes "Apparently, you're not that popular, huh?";
					continue;
				}
				mes "[Ninja tool salesman]";
				mes "Yes, please.";
				mes "Here's the product you promised.";
				set Zeny,Zeny-10000;
				getitem 2117,1;
				continue;
			default:
				mes "[Ninja tool salesman]";
				mes "I see.";
				mes "Come back if you need anything else.";
				close;
			}
			mes "[Ninja tool salesman]";
			mes "One "+getitemname('@itemid)+ " is " +'@price+ " zeny.";
			mes "How much do you want?";
			mes "Enter the number you want, between 1 and 1000.";
			mes "You can stop the purchase by entering 0.";
			next;
			input '@num;
			if('@num < 0 || '@num > 1000) {
				mes "[Ninja tool salesman]";
				mes "You can only buy 1000 at a time.";
				continue;
			}
			if('@num == 0) {
				mes "[Ninja tool salesman]";
				mes "Oh?";
				mes ""+getitemname('@itemid)+ "is not necessary?";
				continue;
			}
			if(Zeny < '@price*'@num) {
				mes "[Ninja tool salesman]";
				mes "Looks like you don't have enough money, huh?";
				continue;
			}
			if(checkweight('@itemid,'@num)==0) {
				mes "[Ninja tool salesman]";
				mes "Apparently, you're not that popular, huh?";
				continue;
			}
			mes "[Ninja tool salesman]";
			mes "Yes, please.";
			mes "Here's the product you promised.";
			set Zeny,Zeny-'@price*'@num;
			getitem '@itemid,'@num;
			continue;
		}
	} else {
		next;
		set '@novice, callfunc("AC_GetNovice");
		if ('@novice) {
			mes "[Ninja tool salesman]";
			mes "I'm sorry, but I can't sell Ninja equipment to anyone but Ninja.";
			mes "We carry them from far away and we don't have much in stock.";
			close;
		} else {
			mes "[Ninja tool salesman]";
			mes "I'm sorry, but we can't sell Ninja supplies to skilled adventurers.";
			mes "We don't want to have anything to give to adventurers who are just starting out.";
			close;
		}
	}
	end;
OnInit:
	Waitingroom "Ninja tools for sale", 0;
	end;
}

ac_cl_hall.gat,158,34,4	script	Ammo Dealer#ac	85,{
	mes "[Ammo Dealer]";
	mes "Hi there.";
	mes "I sell bullets for guns here.";
	if (Job==Job_Gunslinger && BaseLevel<=55) {
		while(1){
			next;
			mes "[Ammo Dealer]";
			mes "Which bullets do you want?";
			next;
			set '@sel, select("Barrett", "Silver Barrett", "Blood Barrett", "Stop buying");
			mes "[Ammo Dealer]";
			switch('@sel){
			case 1:
				set '@itemid,13200;
				set '@price,1;
				mes "One valet, one Zeny."; //all characters, as in the original.
				break;
			case 2:
				set '@itemid,13201;
				set '@price,15;
				mes "There is one Silver Bullet, 15Zeny.";
				break;
			case 3:
				set '@itemid,13202;
				set '@price,30;
				mes "One Blood Bullet is 30 Zeny.";
				break;
			default:
				mes "I see.";
				mes "Come back when you need more bullets.";
				close;
			}
			mes "How much do you want?";
			mes "Enter the number you want, between 1 and 1000.";
			mes "You can stop the purchase by entering 0.";
			next;
			input '@num;
			if('@num < 0 || '@num > 1000) {
				mes "[Ammo Dealer]";
				mes "You can only buy 1000 at a time.";
				continue;
			}
			if('@num == 0) {
				mes "[Ammo Dealer]";
				mes "Oh?";
				mes ""+getitemname('@itemid)+ "is not necessary?";
				continue;
			}
			if(Zeny < '@price*'@num) {
				mes "[Ammo Dealer]";
				mes "Looks like you don't have enough money, huh?";
				continue;
			}
			if(!checkweight('@itemid,'@num)) {
				mes "Apparently I'm not that hospitable, huh?";
				continue;
			}
			mes "[Ammo Dealer]";
			mes "Yes, please.";
			mes "Here's the promised product.";
			set Zeny,Zeny-'@price*'@num;
			getitem '@itemid,'@num;
		}
	} else {
		next;
		set '@novice, callfunc("AC_GetNovice");
		if ('@novice) {
			mes "[Ammo Dealer]";
			mes "I'm sorry, but I can't sell bullets to anyone but Gunslinger.";
			close;
		} else {
			mes "[Ammo Dealer]";
			mes "I'm sorry, but I can't sell bullets to skilled adventurers.";
			mes "We need to keep an inventory for our fledgling adventurers.";
			close;
		}
	}
	end;
OnInit:
	waitingroom "Bullets for sale", 0;
	end;
}

//------------------------------------------------------------------------------
// Classroom Building, 1st floor

//Kafra Service Post
ac_cl_area.gat,41,145,4	script	Kafra Service	888,{
	mes "-Kafra Service Inc. is always by your side-";
	mes " -Which service do you use? -";
	next;
	switch(select("location saving service", "warehouse service -> 0z", "read the warning", "quit")){
	case 1:
		savepoint "ac_cl_area.gat",48,128;
		mes "-saved-";
		mes "-Thank you for your service-";
		mes "-(Kafra Service Inc.) will always be by your side-";
		close;
	case 2:
		if(basicskillcheck() && ((getskilllv(1) < 6 && Job != Job_Summoner) || (getskilllv(5018) < 1 && Job == Job_Summoner))) {
			mes "-The warehouse will be available only after acquiring basic skill level 6 -";
			mes " -(Kafra Service Co., Ltd.) will always be by your side-";
			close;
		}
		openstorage;
		close;
	case 3:
		mes "-The academy's warehouse is a free warehouse -";
		mes "-The warehouse should be used cleanly-";
		close;
	default:
		mes "-Stop using it-";
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
		mes "Hello!";
		mes "Congratulations on your admission to the Adventurer Academy!";
		next;
		mes "[Mido]";
		mes "The Adventurer Academy is a school established for adventurers from all over the world.";
		mes "If you have any questions, ask your seniors and teachers.";
		next;
		mes "[Mido]";
		mes "There's a pre-Zento for you as an entrance gift.";
		next;
		set AC_PASSPORT,5;
		if(!checkweight(5406,1)){
			mes "[Mido]";
			mes "Huh?";
			mes "Looks like you have a lot of baggage.";
			mes "You seem to have too many of a kind.";
			mes "Please go and reduce the number of kinds.";
			goto L_END;
		}
		getitem 5406,1;
		set AC_PASSPORT,3; // New student celebration complete
		mes "[Mido]";
		mes ""+('@novice? "Equip yourself with this and good luck!" : "You may not need it.");
		mes "You are now a member of the Adventurer Academy!";
		goto L_END;
	}
	if(AC_PASSPORT==5){
		mes "[Mido]";
		mes "Did you pack light?";
		mes "Come on, it's an entrance gift!";
		next;
		mes "-Make sure that there are at least 2 openings in the number of types of items in your possession-";
		mes "-If you select \"Yes\" when there is no space available, you may lose the item-";
		next;
		mes "-If there is no space available, please select \"No\" once and make sure that the number of types of items is at least two available before speaking to the person again-";
		mes "-Are you accepting the item? -";
		next;
		if(select("No", "Yes")==1){
			mes "[" + strcharinfo(0) + "]";
			mes "(Let's check the number of items.)";
			close;
		}
		if(!checkweight(5406,1)){
			mes "[Mido]";
			mes "Huh?";
			mes "Looks like you have a lot of baggage.";
			mes "You seem to have too many of a kind.";
			mes "Please go and reduce the number of kinds.";
			goto L_END;
		}
		getitem 5406,1;
		set AC_PASSPORT,3; // New student celebration complete
		mes "[Mido]";
		mes ""+('@novice ? "Equip yourself with this and good luck!" : "You may not need it.");
		mes "You are now a member of the Adventurer Academy!";
		goto L_END;
	}
	if(AC_RANK==7){ // Unresearched except for beginners, so common for now.
		mes "[Mido]";
		mes "Congratulations on passing the primary course completion exam!";
		mes "To celebrate your completion of the primary course, I give you this!";
		next;
		if(!checkweight(2751,10)){
			mes "[Mido]";
			mes "Huh?";
			mes "Looks like you have a lot of baggage.";
			mes "You seem to have too many of a kind.";
			mes "Please go and reduce the number of kinds.";
			goto L_END; 
		}
		getitem 2751,1;
		set AC_RANK,8;
		mes "[Mido]";
		mes "This badge is a sign of completion of the primary process!";
		mes "Put it on your chest, put it on your chest!";
		next;
		mes "[Mido]";
		mes "The primary process is over, but your adventure is far from over!";
		mes "Now it's your turn to teach all the beginners!";
		goto L_END;
	}
	if('@novice && AC_RANK<7){
		switch(AC_RANK){
		case 0:
			mes "[Mido]";
			mes "Hello!";
			mes "Welcome to the Adventurer Academy!";
			next;
			if(AC_CREDIT>0){
				mes "[Mido]";
				mes "I see you've only been here a short time.";
				mes "I know you don't understand a lot yet, but let's learn a little bit at a time!";
				mes "You can ask me anything about the Academy.";
				break;
			}
			// 05/25/2010 Academy Reform Pollindan Come in! Added by .
			mes "[Mido]";
			mes "I see you've only been in here a short time.";
			mes "If you haven't decided on anything yet, you might want to help ^FF0000Lune work ^000000.";
			mes "I think you'll get all kinds of requests, so you'll be able to travel around the world.";
			next;
			mes "[Mido]";
			mes "^FF0000Lune^000000 is the lady with pink hair right next to me.";
			mes "You'll have to ask Lune for more details.";
			next;
			mes "[Mido]";
			mes "If you want to fight monsters right away and get your arms around them, you can go to the ^FF0000 training room or the special room ^000000.";
			next;
			mes "[Mido]";
			mes "When you go to fight, don't forget to prepare the equipment and recovery items that were given to you at the reception and during the training.";
			next;
			mes "[Mido]";
			mes "The entrance to the ^FF0000 training room and the special room ^000000 is up here on the left.";
			mes "There should be a ^0000FF Misty^000000 nearby who calls herself Polin Dan.";
			next;
			mes "[Mido]";
			mes "I know you don't know it all yet, but learn it little by little!";
			mes "You can ask me anything about the Academy.";
			break;
		case 1:
			mes "[Mido]";
			mes "Hey, it's you.";
			mes "Are you familiar with the academy yet?";
			mes "Is there something you want to ask me?";
			break;
		case 2:case 3:case 4: //may be unexamined
			mes "[Mido]";
			mes "Hey, it's you.";
			mes "You're getting quite acclimated to the academy, aren't you?";
			mes "Is there something you want to ask me?";
			break;
		case 5:
			mes "[Mido]";
			mes "Hey, it's you.";
			mes "Hey, you're rumored to be a good student among the teachers.";
			mes "You're almost done with your first course.";
			mes "Good luck!";
			mes "Do you want something for me today?";
			break;
		case 6:
			mes "[Mido]";
			mes "Hello!";
			mes "Welcome to the Adventurer Academy!";
			next;
			mes "[Mido]";
			mes "Ask me anything about this academy!";
			mes "Is there anything more I can teach you, even if it's ......?";
			mes "You're almost done with your primary course!";
			mes "Do you want something for me today?";
			break;
		}
	} else {
		mes "[Mido]";
		mes "Hey there!";
		mes "What can I do for you today?";
	}
	next;
	if('@novice){ menu "Ask what to do",L_TODO, "Ask again what's important",L_IMPORTANT, "About the Adventurer Academy",L_ABOUT, "About inside the school",L_SCHOOL, "Show me the world map",L_VIEWWORLD," I want the book of professions",L_GIVEBOOK, "Have a chat",L_TALK; }
	else { menu "About the Adventurer Academy",L_ABOUT, "About inside the school",L_SCHOOL, "Show me the world map",L_VIEWWORLD, "Make a chat",L_TALK; }
L_TODO:
	// 05/25/2010 Academy Reform Pollinators are here! Added by .
	//ask what to do
	mes "[Mido]";
	mes "Uh, yeah.";
	L_REP_01:
	mes "First, I need to get the credits to take the exam, right?";
	next;
	mes "[Mido]";
	mes "To get the credits, you can help ^0000FFLune^000000 or you can help ^000000 Polin Dan's Misty^000000 and her friends.";
	next;
	mes "[Mido]";
	mes "To get the credits, you can take the ^FF0000 first process exam^000000 from Lune.";
	mes "There are a number of exams, so let's go through them in order.";
	next;
	mes "[Mido]";
	mes "And once you've completed all of the first process, I'll prezenet ^FF0000 academy badge[0]^000000 to you on KiGhost!";
	next;
	mes "[Information]";
	mes "Would you like to see the effects of Academy Badge [0]?";
	next;
	if(select("yes", "no")==1){
		mes "[Information]";
		mes "-Academy Badge[0]-";
		mes "The academy badge that you will receive upon completion of the first process.";
		next;
		mes "[Information]";
		mes "-Academy badge[0]-";
		mes "The shape of the badge is a prayer that a full-fledged adventurer will be able to leave the nest after accumulating knowledge.";
		next;
		mes "[Information]";
		mes "-Academy Badge[0]-";
		mes "MaxHP + 400MaxSP + 200 series when BaseLv 79 or lower : ^7777777Accessory^000000Defense : ^777777770^000000";
		next;
		mes "[Information]";
		mes "-Academy Badge[0]-";
		mes "weight : ^777777710^000000 equipment : ^7777777 all professions^000000@next[Information]";
		mes "-Would you like to hear Mido speak again? -";
		next;
		if(select("Yes, ask again", "No, not necessary")==1){
			mes "[Mido]";
			mes "Okay, let me explain again.";
			goto L_REP_01;
		}
	}
	mes "[Mido]";
	mes "Good luck then.";
	mes "If you have any questions, just ask me anything.";
	goto L_END;
L_IMPORTANT:
	// ask again for important stories (unexamined)
	mes "[Mido]";
	mes "Huh?";
	mes "There doesn't seem to be anything I can explain to you right now.";
	next;
	menu "stop";
	mes "[Mido]";
	mes "If you have any other questions, just ask me.";
	goto L_END;
L_ABOUT:
	mes "[Mido]";
	mes "The Adventurer Academy is a school established for adventurers.";
	mes "If you don't understand something, ask your seniors and teachers to teach you things.";
	next;
	mes "[Mido]";
	mes "At the Adventurer Academy, we offer various kinds of support until you become a full-fledged adventurer.";
	next;
	mes "[Mido]";
	mes "There are certain requirements to be accepted as a full-fledged adventurer at the Adventurer Academy.";
	mes "One, you have to be Baselv56 or higher!";
	mes "Two, I'm in the second or higher profession!";
	mes "Three, reborn!";
	next;
	if(!'@novice){
		mes "[Mido]";
		mes "You're a full-fledged adventurer now!";
		mes "As a senior adventurer, I hope you can help a fledgling adventurer!";
		goto L_END;
	}
	mes "[Mido]";
	mes "If any of these conditions are met, you're on your own!";
	mes "We are all fledgling adventurers together until we become one.";
	mes "You can find your friends here and explore the world in many ways!";
	goto L_END;
L_SCHOOL:
	mes "[Mido]";
	mes "Which place would you like to hear about?";
	next;
	switch(select("1F lecture room", "1F study room", "1F practice room", "1F sales", "1F library", "2F exam room", "2F reference room", "nothing more to ask")) {
	case 1:
		mes "[Mido]";
		mes "It's a training room.";
		mes "I'm giving a lecture for fledgling adventurers in the training room.";
		next;
		mes "[Mido]";
		mes "You can learn the basics you need for adventure from Puron, Aldi, and Fen.";
		next;
		mes "[Mido]";
		mes "The training room is next to this [classroom building, 1st floor].";
		mes "Look for the sign in this room.";
		next;
		goto L_SCHOOL;
	case 2:
		mes "[Mido]";
		mes "It's a study room.";
		mes "We give all kinds of advice in the study room.";
		mes "If you have any problems, you can go there.";
		next;
		mes "[Mido]";
		mes "You should be able to get advice from Ruthie about professions, from Fee about quest skills, and from Utah about job change quests.";
		next;
		mes "[Mido]";
		mes "The study room is next to this [classroom building, 1st floor].";
		mes "Look for the sign in this room.";
		next;
		goto L_SCHOOL;
	case 3:
		mes "[Mido]";
		mes "That's a practice room/special room.";
		mes "In the training room, various monsters inhabit, and we can do investigations and practice fighting monsters.";
		next;
		mes "[Mido]";
		mes "The training rooms are opened at different locations depending on your strength, so remember where you can go.";
		next;
		mes "[Mido]";
		mes "The Recovery Plate will be available to all Adventurer Academy students, and will be a facility for multi-person investigations.";
		next;
		//mes "[Mido]";
		//mes "When used by a large party, ";
		//mes "The investigation and monster combat practice will be ";
		//mes "It will be easier, so take advantage of it.";
		//mes "Of course, you can also use it with a small party."
		//mes "You can use it, but the fewer people you have, the more";
		//mes "Be careful, because it will be less effective.";
		//next;
		//mes "[Mido]";
		//mes "lv1-lv25, lv20-lv35, lv30-lv45";
		//mes "The practice room for ";
		//mes "It's next to this [classroom building, 1st floor].";
		//mes "Look for the sign in this room.";
		//next;
		//mes "[Mido]";
		//mes "There are other hidden practice rooms."
		//mes "I hear there are, though.";
		//next;
		//goto L_SCHOOL;
		//modified on 2010/04/13
		mes "[Mido]";
		mes "The more advanced you become, the more ^FF0000 power you need ^000000 when performing recovery.";
		mes "Advanced users need to be careful, because it takes a long time to recharge the power.";
		next;
		goto L_SCHOOL;
	case 4:
		mes "[Mido]";
		mes "In the hall of the classroom building next to this [classroom building 1F], there is a salesman who sells a variety of equipment.";
		next;
		mes "[Mido]";
		mes "You can find most of the basics here.";
		next;
		goto L_SCHOOL;
	case 5:
		mes "[Mido]";
		mes "In the library next to the entrance hall, you can look up all sorts of things.";
		next;
		mes "[Mido]";
		mes "You can look up not only the basic operations, but also the conversations you often see around town, details about skills, and anything else you don't understand.";
		next;
		goto L_SCHOOL;
	case 6:
		mes "[Mido]";
		mes "[Classroom building 2F] has an exam room.";
		next;
		mes "[Mido]";
		mes "When Lune asks you to take the exam, talk to Gardo in the exam room and take the exam.";
		next;
		goto L_SCHOOL;
	case 7:
		mes "[Mido]";
		mes "[Classroom building 2F] has a resource room.";
		next;
		mes "[Mido]";
		mes "Old man Yong in the reference room is very knowledgeable, so he knows a lot of places.";
		next;
		goto L_SCHOOL;
	case 8:
		mes "[Mido]";
		mes "If you want to hear it again, come on over.";
		goto L_END;
	}
	goto L_END;
	
L_VIEWWORLD:
	cutin "jpn_mid01",255;
	cutin "world_map_001",3;
	mes "[Mido]";
	mes "This is the world map where the Mido Gardo continent is located.";
	next;
	mes "[Mido]";
	mes "There are many adventurers traveling around the world.";
	mes "There are many cities, and people from all walks of life.";
	next;
	mes "[Mido]";
	mes "There are other towns besides the ones shown on this map.";
	mes "If you find a new town, you might want to stop by during your adventure.";
	close;
L_GIVEBOOK:
	//2010/04/13 added
	mes "[Mido]";
	mes "Do you want the Book of Occupations?";
	next;
	if(select("yes", "no")==2){
		mes "[Mido]";
		mes "Huh?";
		mes "You don't want it.";
		mes "If you lost it or something, I'm getting the book for you.";
		goto L_END;
	}
	if(checkweight(11055,1)) {
		switch(Job){
			case Job_Swordman: getitem 11025,1; break; //Swordsman's book
			case Job_Thief: getitem 11028,1; break; //Thief's book
			case Job_Archer: getitem 11031,1; break; //Archer's book
			case Job_Acolyte: getitem 11034,1; break; //Acolyte's book
			case Job_Magician: getitem 11037,1; break; //Magician's book
			case Job_Merchant: getitem 11040,1; break; //The book of Merchant
			case Job_Taekwon: getitem 11043,1; break; //Taekwon Kid's book
			case Job_Ninja: getitem 11046,1; break; //The Book of Ninja
			case Job_Gunslinger: getitem 11049,1; break; //Gunslinger's book
			case Job_SuperNovice: getitem 11052,1; break; //Writing of Supernovice
			default: getitem 11055,1;
		}
		mes "[Mido]";
		mes "Yes.";
		mes "Good luck then.";
		mes " -Mido gave me the book-";
		goto L_END;
	}
	//not yet researched
	mes "[Mido]";
	mes "You might want to organize your belongings a bit.";
	mes "You should use Kafra Service to store your important things and sell what you don't need to merchants.";
	goto L_END;
L_TALK:
	switch(rand(12)){
	case 0:
		mes "[Mido]";
		mes "The mark of the Adventurer's Academy comes from the six-pointed star, which represents true wisdom, the Philosopher's Stone.";
		goto L_END;
	case 1:
		mes "[Mido]";
		mes "I heard that this school has a different library than the one we have now.";
		next;
		mes "[Mido]";
		mes "I don't know any details about it either.";
		goto L_END;
	case 2:
		mes "[Mido]";
		mes "Are you having trouble finding something to do?";
		next;
		mes "[Mido]";
		mes "Then you should talk to Lune.";
		mes "He'll explain in detail about the requests that come to the Adventurers Academy.";
		goto L_END;
	case 3:
		mes "[Mido]";
		mes "Do you know about the hidden training room?";
		next;
		mes "[Mido]";
		mes "I heard that somewhere in the hall of the classroom building, there is a lab that used to be open to the public.";
		next;
		mes "[Mido]";
		mes "It's rumored that that practice room was sealed up somehow because it was too dangerous.";
		goto L_END;
	case 4:
		mes "[Mido]";
		mes "I'm a teacher like this now, but I used to be an adventurer too.";
		mes "I was so excited when I arrived at the town of Luthiers.";
		next;
		mes "[Mido]";
		mes "I saw snow for the first time in my life.";
		mes "It was a little cold, but it was fun.";
		next;
		mes "[Mido]";
		mes "In my case, Santa in Aldebaran forwarded it to me.";
		mes "Is he still there?";
		goto L_END;
	case 5:
		mes "[Mido]";
		mes "This academy is made possible by everyone's donations.";
		next;
		mes "[Mido]";
		mes "We are really looking forward to wonderful adventurers like you.";
		goto L_END;
	case 6:
		mes "[Mido]";
		mes "Do you believe in the world of the dead?";
		mes "People don't believe me, but I have been to the world of the dead.";
		next;
		mes "[Mido]";
		mes "The world of the dead really exists.";
		mes "That was, I think, when I tried bungee jumping in Umbala: ......";
		next;
		mes "[Mido]";
		mes "I don't remember the details anymore, but I believe that experience was not a dream.";
		goto L_END;
	case 7:
		mes "[Mido]";
		mes "Lune looks very solid, doesn't he?";
		next;
		mes "[Mido]";
		mes "But actually, I have a very sweet tooth.";
		next;
		mes "[Mido]";
		mes "I used to be treated to ice cream all the time. ......";
		goto L_END;
	case 8:
		mes "[Mido]";
		mes "The Adventurer Academy is looking for a lot of adventurers.";
		next;
		mes "[Mido]";
		mes "If you know someone who hasn't joined the academy yet, you should definitely give them a shout.";
		goto L_END;
	case 9:
		mes "[Mido]";
		mes "There is a very famous teacher at this school.";
		next;
		mes "[Mido]";
		mes "He's a teacher who studies monsters and he's very ......";
		mes "No, he's a little different!";
		next;
		mes "[Mido]";
		mes "You'll see how it's changed as soon as you see him in person!";
		goto L_END;
	case 10:
		mes "[Mido]";
		mes "By the way, last time I heard, the principal wanted to expand this facility.";
		next;
		mes "[Mido]";
		mes "It doesn't look like it will be possible for a while, but maybe someday the school building will be bigger.";
		goto L_END;
	case 11:
		mes "[Mido]";
		mes "Have you already had it with old man Yong upstairs?";
		next;
		mes "[Mido]";
		mes "He likes books so much, he's in the reference room all the time.";
		next;
		mes "[Mido]";
		mes "...... What the hell is his job?";
		goto L_END;
	}
L_END:
	close2;
	cutin "jpn_mid01",255;
	end;
OnInit:
	waitingroom "Beginners go here", 0;
	end;
}


//Modo
ac_cl_area.gat,61,166,4	script	Modo#AC	704,{
	set '@novice, callfunc("AC_GetNovice");
	if (!'@novice) {
		mes "[Modo]";
		mes "Hello.";
		mes ""+strcharinfo(0)+ "It seems you don't need my help.";
		mes "From now on, please travel around, not only within the academy.";
		close;
	}
	mes "[Modo]";
	mes ""+strcharinfo(0)+ ", I'm here to lend you a cart.";
	next;
	mes "[Modo]";
	mes "Would you like to use the cart?";
	mes "It's free.";
	next;
	switch(select("Use cart", "About using cart", "I still quit")){
	case 1:
		if(Job!=Job_Merchant && Job!=Job_SuperNovice){
			mes "[Modo]";
			mes "Huh?";
			mes "You can't use the cart unless you are a Merchant and its higher positions or a Supernovice.";
			close;
		}
		setcart;
		mes "[Modo]";
		mes "Please come back if you need more.";
		close;
	case 2:
		mes "[Modo]";
		mes "The cart is available to merchants and their higher positions, plus Supernovice.";
		mes "You have to learn the \"push cart\" skill to use it.";
		close;
	default:
		mes "[Modo]";
		mes "See you then.";
		close;
	}
OnInit:
	Waitingroom "cart rental",0;
}

//Taro
ac_cl_area.gat,57,173,2	script	Taro#AC	931,{
	set '@novice, callfunc("AC_GetNovice");
	if ('@novice) {
		if(AC_RANK==0){
			mes "[Taro]";
			mes "Oh,";
			mes strcharinfo(0)+ "";
			mes "Yes.";
			mes "I'm here to help with the transfer.";
		} else
		if(AC_RANK<3){
			mes "[Taro]";
			mes ""+strcharinfo(0)+ "Isn't it?";
			mes "You seem to be doing well today.";
		} else
		if(AC_RANK<=6){
			mes "[Taro]";
			mes "It looks like you're doing a great job.";
			mes ""+strcharinfo(0)+ "Tell me about your trip sometime.";
		} else
		if(AC_RANK>=7){
			mes "[Taro]";
			mes "You're looking splendid.";
			mes ""+strcharinfo(0)+ "Then you can do anything you want.";
		}
		next;
		if(Job==Job_Novice) goto L_NOVICE;
		mes "[Taro]";
		mes "Where are you going?";
		mes "There's no charge for the registration point at the Academy.";
		next;
		if('mapprice==0) {
			setarray 'mapprice, 500,400,350,300,250,200
								,400,300,250,200,150,100
								,650,600,500,400,300,200
								,750,700,600,500,400,300
								,750,700,600,500,400,300
								,650,600,500,400,300,200;
		}
		set '@rank,(AC_RANK < 5 ? AC_RANK : 5);
		set '@num, select(
			"Prontera -> " +(AC_SAVE_MAP!=0 ? 'mapprice[ '@rank] : 0)+ "z",
			"Izlude -> " +(AC_SAVE_MAP!=1 ? 'mapprice[1*6+'@rank] : 0)+ "z",
			"Morroc -> " +(AC_SAVE_MAP!=2 ? 'mapprice[2*6+'@rank] : 0)+ "z",
			"Alberta -> " +(AC_SAVE_MAP!=3 ? 'mapprice[3*6+'@rank] : 0)+ "z",
			"Geffen -> " +(AC_SAVE_MAP!=4 ? 'mapprice[4*6+'@rank] : 0)+ "z",
			"Payon -> " +(AC_SAVE_MAP!=5 ? 'mapprice[5*6+'@rank] : 0)+ "z",
			"I still quit.")-1;
		if ('@num==6) goto L_CANCEL;
		set '@price,(AC_SAVE_MAP!='@num ? 'mapprice['@num]['@rank] : 0);
		if(Zeny<'@price) {
			mes "[Taro]";
			mes "Oops, you don't have enough money.";
			mes "Please come back again.";
			close;
		}
		mes "[Taro]";
		mes "I'll transfer you then.";
		close2;
		set Zeny,Zeny-'@price;
		callfunc "AC_WarpTown",'@num;
		end;

	} else {
		mes "[Taro]";
		mes "Hello.";
		mes ""+strcharinfo(0)+ "You look good today.";
		next;
		mes "[Taro]";
		mes "It seems you don't need my help.";
		mes "As a senior member of the academy, you should look after the juniors.";
		mes "Would you like to return to the city where you registered?";
		next;
		menu "return",L_RETURN, "do not return",-;
		mes "[Taro]";
		mes "If you want to go back, you can always tell me.";
		close;
	L_RETURN:
		mes "[Taro]";
		mes "I'll transfer you then.";
		close2;
		callfunc "AC_WarpTown",AC_SAVE_MAP;
		end;
	}
L_NOVICE:
	mes "[Taro]";
	mes "You are a Novice, aren't you?";
	mes "We offer free job search support to Novices.";
	mes "Where would you like to go?";
	next;
	set '@num,select("Prontera -> 0z", "Izlude -> 0z", "Morroc -> 0z", "Alberta -> 0z", "Geffen -> 0z", "Payon -> 0z", "Einbroch -> 0z", "Amatsu -> 0z", "Aldebaran -> 0z", "I quit after all")-1;
	if ('@num==9) goto L_CANCEL;
	mes "[Taro]";
	mes "Then I'll transfer it.";
	close2;
	callfunc "AC_WarpTown",'@num;
	end;
L_CANCEL:
	mes "[Taro]";
	mes "I understand.";
	mes "Please come back again.";
	close;
OnInit:
	waitingroom "Transfer Service",0;
}

// ----------------------------------------------
// Heim (transfer of Lune's request to the relevant map)
ac_cl_area.gat,57,168,4	script	Heim	798,{
	mes "[Heim]";
	mes "Hi there.";
	mes "I'm Heim.";
	next;
	set '@novice, callfunc("AC_GetNovice");
	if ('@novice) goto L_NOVICE;
	else goto L_EXPERT;
L_NOVICE:
	if(AC_QUEST_ST_0+AC_QUEST_ST_1+AC_QUEST_ST_2+AC_QUEST_ST_3+AC_QUEST_ST_4==0){
		mes "[Heim]";
		mes "Come back if Lune says anything to you.";
		mes "I'll help you out a little.";
		close;
	}
	mes "[Heim]";
	mes "Lune told me about this.";
	mes "I'll forward it to you.";
	mes "Where do you want to go?";
	mes "^0000FF-Lune request/test is in progress and a '+' indicating the destination will be displayed in the mini-map in the upper right corner of the screen after the transfer-^000000";
	next;
	//Quest status acquisition

	set '@warplist,0; //insert map display order as in the main mackerel
	//Prontera
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==0)|| //that girl you care about1
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==1)|| //that child you care about2
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==2)|| //that child you care about3
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==3)|| //that child I care about4
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==5)|| //that child I care about6
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==6)|| //that child I care about7
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==7)|| //that child I care about8
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==1)|| // Dungeon rescue1
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==5)|| // Dungeon rescue 3
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==8)|| //Assistance with experiments5
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==0)|| //I want to be an adventurer1
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==1)|| //I want to be an adventurer2
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==3)|| //I want to be an adventurer4
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==5)|| //I want to be an adventurer6
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==8)|| //I want to be an adventurer9
		(AC_RANK==1 && AC_RANKTEST && AC_RANKTEST<98)|| //Course 2 exam
		(AC_RANK==3 && AC_RANKTEST && AC_RANKTEST<98)|| //Course 4 test
		(AC_RANK==4 && AC_RANKTEST && AC_RANKTEST<98)){ //Course 5 test
		set '@warplist[getarraysize('@warplist)],1;
	}
	//Morroc
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==2)|| //that girl you care about3
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==4)|| //that child you care about5
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==2)|| //Assistance in experiments2
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==2)|| //I want to be an adventurer3
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==4)|| //I want to be an adventurer5
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)){ //6th course exam
		set '@warplist[getarraysize('@warplist)],3;
	}
	//Geffen
	if( (AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==0)|| //help with experiment 1
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==3)|| //that girl I care about4
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99)|| //I want to be an adventurer (all episodes)
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)){ //Course 6 exam
		set '@warplist[getarraysize('@warplist)],5;
	}
	//Payon
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==4)|| //that girl you care about5
		(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==1)|| //Miracle Box 2
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)|| //I want to deliver an apology2
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==4)|| //help with experiments3
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==6)|| //Assistance for experiment 4
		(AC_RANK==2 && AC_RANKTEST && AC_RANKTEST<98)|| //Course 3 test
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)|| //Course 6 test
		(AC_RANK==6 && AC_RANKTEST && AC_RANKTEST<98)){ //seventh course examination
		set '@warplist[getarraysize('@warplist)],6;
	}
	//Alberta
	if( (AC_QUEST_ST_1 && AC_QUEST_ST_1<99) || //Chest of Miracles (all episodes)
		(AC_RANK==0 && AC_RANKTEST && AC_RANKTEST<98)){ //The 1st course exam
		set '@warplist[getarraysize('@warplist)],4;
	}
	//Izlude
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==1)|| //that girl you care about2
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==7)|| //that child I care about8
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8)|| //that child I care about9
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==5)|| //collect ingredients for sweets4
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==6)|| //collecting ingredients for sweets5
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==3)|| // Dungeon rescue2
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==7)){ //dungeon rescue 4
		set '@warplist[getarraysize('@warplist)],2;
	}
	//Aldebaran
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==0)|| //To that person who helped me
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==1)|| //I want to deliver an apology1
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==7)|| //sweets delivery
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)){ //I want to deliver an apology2
		set '@warplist[getarraysize('@warplist)],7;
	}
	//Yuno
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==1)|| //I want to deliver an apology1
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==2)|| //collect ingredients for sweets1
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==3)|| //Collecting ingredients for sweets 2
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==4)|| //collection of ingredients for sweets3
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==5)|| //collect ingredients for sweets4
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==6)|| //collecting ingredients for sweets5
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==7)){ //deliver sweets
		set '@warplist[getarraysize('@warplist)],8;
	}
	//Comodo
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==5)|| //that girl you care about6
		(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==7)){ //The miracle box8
		set '@warplist[getarraysize('@warplist)],10;
	}
	//Rachel
	if(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8){ //that girl I care about9
		set '@warplist[getarraysize('@warplist)],12;
	}
	//Veins
	if(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8){ //that child I care about9
		set '@warplist[getarraysize('@warplist)],14;
	}
	//Einbroch
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==3){ //collect ingredients for sweets2
		set '@warplist[getarraysize('@warplist)],19;
	}
	//Einbech
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==4){ //collect ingredients for sweets3
		set '@warplist[getarraysize('@warplist)],20;
	}
	//Hugel
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)|| //I want to deliver an apology2
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99)){ //help with experiments (all episodes)
		set '@warplist[getarraysize('@warplist)],11;
	}
	//Lighthalzen
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==2){ //collect ingredients for sweets1
		set '@warplist[getarraysize('@warplist)],13;
	}
	//Amatsu
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==2){ //box of miracles3
		set '@warplist[getarraysize('@warplist)],18;
	}
	//Gonryun
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==3){ //Miracle Box 4
		set '@warplist[getarraysize('@warplist)],15;
	}
	//Louyang
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==4){ //Miracle Box 5
		set '@warplist[getarraysize('@warplist)],16;
	}
	//Ayothaya
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==5){ //Miracle Box 6
		set '@warplist[getarraysize('@warplist)],17;
	}
	//Umbala
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==6){ //Miracle Box 7
		set '@warplist[getarraysize('@warplist)],9;
	}
	set '@mapselect$,"";
	for(set '@i,0; '@i<getarraysize('@warplist); set '@i,'@i+1){
		set '@mapselect$,'@mapselect$ + 'mapname$['@warplist['@i]-1] + ":";
	}
	set '@mapselect$,'@mapselect$ + "Not needed now";
	set '@mapid, select('@mapselect$)-1;
	set '@num,'@warplist['@mapid]-1;
	if('mapname$['@num]=="") goto L_CANCEL;
	mes "[Heim]";
	mes "Then I'll transfer it.";
	mes " ^0000FF-You can zoom in and out of the minimap by left-clicking the '+-' in the upper right corner in the minimap-^000000";
	next;
	mes "[Heim]";
	mes "When you come back to the academy, ^0000FF 'academy officials' ^000000 are ^FF0000 near the center of town ^000000, so if you get lost, try going near the center of town.";
	close2;
	warp 'gatname$['@num],'map_xy['@num*2],'map_xy['@num*2+1];
	end;
L_EXPERT:
	mes "[Heim]";
	mes "An adventurer as dignified as you may not need my help.";
	mes "I'm here to help the inexperienced adventurers.";
	next;
	if(select("Is that so?", "Why are you helping here?")==1) {
		mes "[Heim]";
		mes "If you want to learn something, there is a library in the academy, you can go there once.";
		close;
	}
	mes "[Heim]";
	mes "I was once rescued by a strange adventurer.";
	mes "I still vividly remember that time.";
	next;
	mes "[Heim]";
	mes "I am here now because of him.";
	next;
	emotion 2;
	mes "[Heim]";
	mes "Remember when you were a novice adventurer?";
	close;
L_CANCEL:
	mes "[Heim]";
	mes "Really?";
	mes "Come back when you need me again!";
	close;
OnInit:
	setarray 'gatname$, "prontera.gat", "izlude.gat", "morocc.gat", "alberta.gat", "geffen.gat", "payon.gat", "aldebaran.gat", "yuno.gat", "umbala.gat", "comodo.gat", "hugel.gat", "rachel.gat", "lighthalzen.gat", "veins.gat", "gonryun.gat", "louyang.gat", "ayothaya.gat", "amatsu.gat", "einbroch.gat",  "einbech.gat";
	setarray 'mapname$, "Prontera", "Izlude", "Morroc", "Alberta", "Geffen", "Payon", "Aldebaran", "Yuno", "Umbala", "Comodo", "Hugel", "Rachel",    "Lighthalzen", "Veins", "Gonryun", "Louyang", "Ayothaya", "Amatsu", "Einbroch", "Einbech";
	setarray 'map_xy, 147,190, 121,115, 147,93, 103,129, 110,103, 155,197, 138,110, 150,174, 100,154, 209,143, 90,146, 129,138, 214,156, 200,123,    160,120, 217,114, 216,175, 117,151, 217,188, 168,131;
	waitingroom "helping",0;
	end;
}

//------------------------------------------------------------------------------
// Classroom Bldg. 2F

ac_cl_area.gat,63,81,0	script	3rd floor WP	45,1,1,{
	mes "[3rd floor]";
	mes "The third floor is off limits to the general student population.";
	close;
}

//Data Room Administrator
ac_cl_area.gat,41,38,4	script	Data Room Administrator	75,{
	mes "[Data Room Administrator]";
	mes "This will be the data room.";
	mes "We collect various materials here.";
	mes "How can I help you today?";
	next;
	if(select("Is Grandfather Yong there?", "Nothing")==2) {
		mes "[Data Room Administrator]";
		mes "I see.";
		mes "Please come back when the data room is ready.";
	} else {
		mes "[Data Room Administrator]";
		mes "I think Grandpa Yong is in the data room.";
		mes "He's an old man who loves books.";
	}
	close;
}

//Yong Grandpa
ac_cl_area.gat,39,23,4	script	Yong#ac_cl_area	766,{
	set '@novice, callfunc("AC_GetNovice");
	if(AC_RANK>0) goto L_TENSOU;
	if (!'@novice) {
		mes "[Yong]";
		mes "Woo hoo hoo.";
		mes "Admiration, admiration.";
		mes "I hope there will be more fine adventurers like you.";
		next;
		mes "[Yong]";
		mes "If all the other students could be like you, I would be able to retire with peace of mind.";
		mes "Woo hoo hoo.";
		close;
	}
	mes "[Yong]";
	mes "Woohoo.";
	mes "This is an interesting book you've found.";
	mes "...... hmmm .........";
	mes "What material shall I put on this shelf?";
	mes "......";
	next;
	mes "[Yong]";
	mes "Hmm?";
	mes "You seem to be interested in books, too.";
	mes "Do you like books?";
	next;
	if (select("like", "don't like")==2) {
		mes "[Yong]";
		mes "I see.";
		mes "It's a lonely thing~";
		mes "Books are a good way to feel many different worlds.";
		mes "You should try reading a variety of books, starting with the ones that interest you.";
		next;
		mes "[Yong]";
		mes "There's a library at the Academy, too.";
		mes "Why don't you visit it?";
		mes "It's too messy to read here.";
		mes "Woah woah woah.";
		close;
	}
	mes "[Yong]";
	mes "Woohoo.";
	mes "Interest interest interest.";
	mes "It's good to read different books.";
	mes "Books give us a lot of knowledge.";
	mes " -Grandpa Yong seems to be happy-";
	next;
	mes "[Yong]";
	mes "Since we're on the subject, let me tell you about my favorite place that I learned about from books.";
	mes "Shall we try?";
	next;
	if(select("going", "not going")==2) {
		mes "[Yong]";
		mes "I see.";
		mes "Zan-ghost-nao~";
		mes "This is my favorite place.";
		mes "I'm ready to send you anytime.";
		close;
	}
	mes "[Yong]";
	mes "Then, I'll send it.";
	mes "It's a peaceful place, but watch out for the monsters!";
	close2;
	warp "prt_fild07.gat",78,287;
	end;
L_TENSOU:
	mes "[Yong]";
	mes ""+strcharinfo(0) + "or.";
	mes "I thought it was about time you came.";
	mes "You seem to be doing well on your exams.";
	mes " -Grandpa Yong brought the map-";
	next;
	cutin "support_map001.bmp",3;
	//The lines remain the same after completion of the primary process.
	mes "[Yong]";
	mes "This is the only place I'm going to recommend to you.";
	mes "I'm not sure you can go to all of them.";
	mes "This is as far as you can go.";
	mes "Where do you want to go?";
	next;
	set '@select$,"";
	for(set '@i,0; '@i<13; set '@i,'@i+1){
		set '@select$,'@select$ + (AC_RANK >= 'REQUIRE['@i] ? 'MAPNAME$['@i] : "^FF0000 infeasible ^000000") + ":";
	}
	set '@select$,'@select$ + "I still won't go";
	set '@num,select('@select$);
	if(AC_RANK < 'REQUIRE['@num-1]){
		mes "[Yong]";
		mes "The rest of Ghost, but I can't recommend it to you right now.";
		mes "Put it somewhere else.";
		close;
	}
	if('@num==10){
		mes "[Yong]";
		mes "Ummm ...... this place used to be called Sograt Desert 08 ......";
		mes "It's gone now, and I can't send you here.";
		mes "You will have to find another place.";
		close;
	}
	if('@num==14){
		mes "[Yong]";
		mes "I see.";
		mes "If you want to go, you can always tell me.";
		mes "I'll be waiting for you.";
		close;
	}
	mes "[Yong]";
	mes "Ein should be at the destination, so tell Ein when you return.";
	mes "Be careful of the monsters.";
	mes "Then, I'll send you on your way.";
	mes "Woah woah woah.";
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
	setarray 'MAPNAME$, "Prontera Underground Canal B2F", "Prontera Field 07", "Payon Lost Forest 02", "Payon Underground Cave B1F", "Payon Lost Forest 09", "Izlude Underwater Cave Layer 1", "Geffen Field 03"," Payon underground cave B2F", "Geffen field 11","^8C008C extinction^000000", "Geffen field 12", "Mjolnir Mountains 05", "Geffen underground dungeon B2F";
	setarray 'REQUIRE,1,1,1,1,2,2,3,4,4,0,5,6,7;
}

//------------------------------------------------------------------------------
// Ein Assistance
// Supplemental: PT support systems such as Anze and Manipi are not as effective for the whole party as they are for one person, so they are not as effective for the whole party as they are for the other person.
// processing is more complicated.

-	script	EinACFUNC	-1,{
	function abs { return getarg(0)*(getarg(0)<0 ? -1 : 1); }
	set '@novice, callfunc("AC_GetNovice");
	if(AC_PASSPORT){
		If(!'@novice){
			mes "[Ein]";
			mes "You won't need my help anymore.";
			mes "Kimi has grown far beyond my expectations, and you've grown well.";
			mes "Help a lot of people.";
			close;
		}
		mes "[Ein]";
		mes "You are a student of the Academy.";
		mes "You shouldn't be too reckless.";
		mes "Fighting alongside your friends is the key to longevity.";
		mes " Is there something you want to talk about?";
		NEXT;
		menu "I want to get help.",L_SHIEN, "I want to go back to the Adventurers Academy.",L_WARP, "What are you doing?",L_WHAT, "Nothing",L_CANCEL;
	} else {
		if(!'@novice){
			mes "[Ein]";
			mes "......";
			mes "Are you a traveler?";
			mes "What can I do for you?";
			next;
			if(select("Nothing", "What are you doing?") ==1){
				mes "[Ein]";
				mes "There are monsters living around here too.";
				mes "Be careful on your journey.";
				mes "Have a good trip.";
				close;
			}
			mes "[Ein]";
			mes "I am here to take care of the students of the Adventurers Academy.";
			mes "I help the fledgling adventurers.";
			mes "You should try the Adventurer Academy once.";
			close;
		}
		mes "[Ein]";
		mes "......";
		mes "Looks like you're an adventurer.";
		mes "I help adventurers in this place.";
		mes "You should try the Adventurer's Academy.";
		next;
		menu "Adventurer Academy?" ,-;
		mes "[Ein]";
		mes "It's like a school for adventurers.";
		mes "Admission procedures can be done there.";
		mes "If you want, I can send you to the Adventurer's Academy, what do you say?";
		next;
		if(select("send me", "decline")==2){
			mes "[Ein]";
			mes "I see.";
			mes "If you ever have trouble adventuring, go there and see.";
			mes "There should be people from the academy around the center of town, too.";
			close;
		}
		mes "[Ein]";
		mes "Okay.";
		mes "Then we'll transfer it.";
		close2;
		warp "ac_cl_room.gat",44,32;
		end;
	}
L_WARP:
	mes "[Ein]";
	mes "You want to go back to the Adventurer's Academy?";
	next;
	if(select("yes", "no")==2){
		mes "[Ein]";
		mes "I see.";
		mes "Don't take it too hard.";
		mes "If it gets dangerous, you can come back.";
		close;
	}
	mes "[Ein]";
	mes "I guess we're taking a break.";
	mes "Then we'll transfer.";
	close2;
	warp "ac_cl_area.gat",67,155;
	end;
L_SHIEN:
	mes "[Ein]";
	mes "No matter how many recommendations are received, they are not free of charge.";
	mes "You'll need Zeny.";
	mes "Which assistance do you want?";
	next;
	switch(select(
				"^0000FF Basic Set^000000 - 10Zeny",
				(AC_RANK>3 ? "^FF0000 Auxiliary Set I^000000" : "^777777？？？？？ I^000000") + " - 50Zeny",
				(AC_RANK>3 ? "^006600 auxiliary set II^000000" : "^777777？？？？？ II^000000") + " - 50Zeny",
				"Ask for a description of the set", "Quit"))
	{
	case 1:
		if(Zeny<10) goto L_NOMONEY;
		mes "[Ein]";
		mes "Okay.";
		mes "Then you'd better be careful fighting.";
		close2;
		set Zeny,Zeny-10;
		npcskillsupport 34,0;
		sc_end 10;
		sc_start 10,'BLESS[AC_RANK],'BASIC_LV[AC_RANK]; //SC_BLESSING
		npcskillsupport 29,0;
		sc_end 12;
		sc_start 12,'BLESS[AC_RANK],'BASIC_LV[AC_RANK]; //SC_INCREASEAGI
		if(!getcharid(1)){
			npcskillsupport 33,0,"","";
			sc_end 9;
			sc_start 9,'ANGEL[AC_RANK],'BASIC_LV[AC_RANK]; //SC_ANGELUS
			if(AC_RANK>=7){
				npcskillsupport 74,0,"","";
				sc_end 20;
				sc_start 20,90000,5; //sc_magnificat
			}
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; } //map check
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //range check
					npcskillsupport 33,0,"","";
					sc_end 9;
					sc_start 9,'ANGEL[AC_RANK],'BASIC_LV[AC_RANK]; //SC_ANGELUS
					if(AC_RANK>=7){
						npcskillsupport 74,0,"","";
						sc_end 20;
						sc_start 20,90000,5; //sc_magnificat
					}
					detachrid;
				}
			}
			if(!attachrid('@chid)) end; //reattach
		}
		npcskillsupport 73,0,"","";//Why can't I reproduce it well only in Kirie...
		sc_end 110;
		sc_end 19;
		sc_start 19,120000,'BASIC_LV[AC_RANK]; //SC_KYRIE
		end;
	case 2:
		if(AC_RANK<4) goto L_FEWLANC;
		if(Zeny<50) goto L_NOMONEY;
		mes "[Ein]";
		mes "Okay.";
		mes "Then you're going to have to be careful fighting.";
		close2;
		set Zeny,Zeny-50;
		npcskillsupport 66,0;
		sc_end 15;
		sc_start 15,60000,'SUP1_LV[AC_RANK]; //SC_IMPOSITIO
		if(!getcharid(1)){
			npcskillsupport 383,0,"","";
			sc_end 116;
			sc_start 116,'WINDW[AC_RANK],'SUP2_LV[AC_RANK]; //SC_WINDWALK
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; } //map check
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //range check
					npcskillsupport 383,0,"","";
					sc_end 116;
					sc_start 116,'WINDW[AC_RANK],'SUP2_LV[AC_RANK]; //SC_WINDWALK
					detachrid;
				}
			}
		}
		end;
	case 3:
		if(AC_RANK<4) goto L_FEWLANC;
		if(Zeny<50) goto L_NOMONEY;
		mes "[Ein]";
		mes "Okay.";
		mes "Then you're going to have to be careful fighting.";
		close2;
		set Zeny,Zeny-50;
		if(!getcharid(1)){
			npcskillsupport 112,0,"","";
			sc_end 24;
			sc_start 24,'WEAPF[AC_RANK],'SUP1_LV[AC_RANK]; //SC_WEAPONPERFECTION
			npcskillsupport 113,0,"","";
			sc_end 25;
			sc_start 25,'OVERT[AC_RANK],'SUP1_LV[AC_RANK]; //SC_OVERTHRUST
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; } //map check
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //range check
					npcskillsupport 112,0,"","";
					sc_end 24;
					sc_start 24,'WEAPF[AC_RANK],'SUP1_LV[AC_RANK]; //SC_WEAPONPERFECTION
					npcskillsupport 113,0,"","";
					sc_end 25;
					sc_start 25,'OVERT[AC_RANK],'SUP1_LV[AC_RANK]; //SC_OVERTHRUST
					detachrid;
				}
			}
		}
		end;
	case 4:
		mes "[Ein]";
		if(AC_RANK<4){
			mes "Now you can support ^0000FF basic set^000000.";
		} else {
			mes "You can have three types of assistance.";
			mes "First, ^0000FF basic set^000000.";
		}
		mes "It's Blessing, Speed Increase, Angelus, and Kyrie Eleison.";
		mes "As you complete each exam, I will increase the level of your support skills.";
		next;
		mes "[Ein]";
		mes "Eventually, I'll provide you with the four skills mentioned above in the basic set at lvl 10, plus an extra Magnificat lvl 5.";
		if(AC_RANK<4){
			mes "That's all the explanation I have.";
			close;
		}
		next;
		mes "[Ein]";
		mes "And ^FF0000 auxiliary set I ^000000 applies Imposity Omanus and Windwalk, and ^006600 auxiliary set II ^000000 applies Weapon Perfection and Overtrust.";
		next;
		mes "[Ein]";
		mes "Likewise, we'll increase the level as you grow.";
		mes "I want you to make good use of it.";
		close;
	default:
		goto L_CANCEL;
	}
	close;
L_FEWLANC:
	mes "[Ein]";
	mes "Remaining GHOST but now you can't provide this assistance.";
	mes "You may want to do a few more tests to get more practice.";
	close;
L_NOMONEY:
	mes "[Ein]";
	mes "Hmm?";
	mes "You're short on money.";
	mes "Maybe it's time to go back to the Adventurer's Academy.";
	close;
L_WHAT:
	mes "[Ein]";
	mes "Mido and Lune have told me about you.";
	mes "I'll support you here for a while until you can fight without help.";
	next;
	mes "[Ein]";
	mes "As you progress in the Adventurer Academy, I will give you the support you deserve.";
	next;
	mes "[Ein]";
	mes "I can't keep up with you forever, but I'll stay with you until you grow up.";
	close;
L_CANCEL:
	mes "[Ein]";
	mes "I see.";
	mes "Be careful on your way.";
	close;
OnInit:
	//Skill Levels
	setarray 'BASIC_LV,3,4,5,6,7,8,9,10;
	setarray 'SUP1_LV,0,0,0,2,3,4,5;
	setarray 'SUP2_LV, 0,0,0,0,4,6,8,10; //for windwalk
	//Skill Duration
	setarray 'BLESS,100000,120000,140000,160000,180000,200000,220000,240000;//IA shared
	setarray 'ANGEL,90000,120000,150000,180000,210000,240000,270000,300000;
	setarray 'WINDW,0,0,0,0,220000,280000,340000,400000;
	setarray 'WEAPF,0,0,0,0,20000,30000,40000,50000;
	setarray 'OVERT,0,0,0,0,40000,60000,80000,100000;
	//quillier 120000 manipi 90000 IMP 60000
}
prt_fild07.gat,78,290,4	duplicate(EinACFUNC)	Ein#PRTF07	747
prt_sewb2.gat,70,103,4	duplicate(EinACFUNC)	Ein#PRTSB2	747
pay_fild02.gat,135,175,4	duplicate(EinACFUNC)	Ein#PAYF02	747
pay_dun00.gat,108,26,4	duplicate(EinACFUNC)	Ein#PAYD00	747
pay_fild09.gat,218,292,4	duplicate(EinACFUNC)	Ein#PAYF09	747
iz_dun00.gat,237,169,4	duplicate(EinACFUNC)	Ein#IZLD00	747
gef_fild03.gat,32,58,4	duplicate(EinACFUNC)	Ein#GEFF03	747
pay_dun01.gat,231,77,4	duplicate(EinACFUNC)	Ein#PAYD01	747
gef_fild11.gat,369,297,4	duplicate(EinACFUNC)	Ein#GEFF11	747
gef_fild12.gat,125,187,4	duplicate(EinACFUNC)	Ein#GEFF12	747
mjolnir_05.gat,170,285,4	duplicate(EinACFUNC)	Ein#MJOL05	747
gef_dun01.gat,247,234,4	duplicate(EinACFUNC)	Ein#GEFD01	747

