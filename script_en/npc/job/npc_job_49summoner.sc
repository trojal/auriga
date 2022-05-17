//====================================================================
//Ragnarok Online - Summoner Script by refis
//====================================================================

//------------------------------------------------------------
// Monstar Spawn
//------------------------------------------------------------
// do_tu01a.gat
do_tu01a.gat,100,320,75,55 monster Egglyn 3495,30,5000,0,0
do_tu01a.gat,100,320,75,55 monster Grassfable 3497,30,5000,0,0,0
//------------------------------------------------------------
// do_tu04a.gat
do_tu04a.gat,0,0,0,0 monster Sweet Frog 3499,40,5000,0,0
do_tu04a.gat,0,0,0,0 monster HunterWolf 3500,30,5000,0,0
do_tu04a.gat,0,0,0,0 monster WildHornet 3498,30,5000,0,0
do_tu04a.gat,0,0,0,0,0 monster Leaf Runatic 3496,40,5000,0,0
do_tu04a.gat,0,0,0,0,0 monster Reconnaissance Basilisk 3502,10,5000,0,0
//------------------------------------------------------------
// do_tu06a.gat
do_tu06a.gat,0,0,0,0 monster Reconnaissance basilisk 3502,40,5000,0,0
do_tu06a.gat,0,0,0,0 monster Transpore 3501,30,5000,0,0
//------------------------------------------------------------
// do_tu07a.gat
do_tu07a.gat,0,0,0,0 monster Reconnaissance Basilisk 3502,80,5000,0,0
//------------------------------------------------------------

//------------------------------------------------------------
// tutorial npc
//------------------------------------------------------------
new_do1.gat,90,247,0 script object01#new_do1 139,30,3,{
	mes "[Shere]";
	mes "Not that way." ;
	mes "Come over here, please." ;
	set '@dummy,sleep2(1000);
	warp "new_do1.gat",95,260;
	end;
}

new_do1.gat,95,264,4 script chele#new_do1 10165,{
	if(DORAM_1QUE == 100) {
		mes "^ff0000[Information] Skipping process is running." ;
		mes "Do not terminate the client." ;
		mes "If you exit during execution, you may not receive some items or experience. ^000000";
		next;
		mes "Please click ^ff000000[Information] ^000000^000000^000000ff[next]. ^000000";
		next;
		mes "[Shere]";
		mes "Okay." ;
		mes "Then I'll arrange it that way." ;
		mes "I'm looking forward to your success!" ;
		set DORAM_1QUE,100;
		savepoint "lasagna.gat",299,239;
		warp "lasagna.gat",298,238;
		end;
	}
	//setquest 102845;
	//compquest 102845;
	mes "[Shere]";
	mes "Welcome to the continent of Persta!" ;
	mes "Are you a new adventurer?" ;
	next;
	mes "[Shele]";
	mes "I am Shele." ;
	mes "I guide adventurers who come from outside." ;
	next;
	mes "[Shele]";
	mes "Kun Kun ......." ;
	mes "hmmmmm ......" ;
	mes "You've got some pretty good qualities as a ^ff000000summoner^000000." ;
	mes "You'd make a good adventurer." ;
	next;
	mes "[Shere]";
	mes "If you want, why don't we take a tutorial here and learn the basics of adventure?" ;
	mes "I'm sure it will help you in your future travels." ;
	next;
	mes "[Shere]";
	mes "If you are confident about your adventure, you can skip the tutorial." ;
	next;
	mes "[Shele]";
	mes "But if you are a beginner who is ^000000ff going on an adventure for the first time, you should definitely take the tutorial."; next; mes "[Shele]"; mes "[Shele]"; mes "[Shele] ^000000";
	while(1) {
		next;
		switch(select("Where am I?" ^000000","^009effLearn the basics of adventure (start tutorial)^000000","^ff000000Start adventure immediately (skip tutorial)^000000")) {
		case 1:
			mes "[Shere]";
			mes "This is the ^ff000000port town of Lasagna on the ^ff000000continent of Persta^000000. Because of the ^000000recent discovery of a new continent called Midgard, a lot of Doram are coming from all over the continent." ;
			next;
			mes "[Shere]";
			mes "Just ...... There are too many Doram who are just curious and don't have the basics of adventure." ;
			mes "That's why I'm here to guide Doram who come from outside." ;
			continue;
		case 2:
			mes "[Shere]";
			mes "So I'll send you to the tutorial hall." ;
			mes "I'm looking forward to seeing you in action!" ;
			close2;
			warp "do_tu01a.gat",29,283;
			end;
		case 3:
			mes "^ff000000[Information] If you select <Skip all tutorials>, you can start your adventure from Lasagna with all the experience and items you can gain in the tutorials received. ^000000";
			next;
			mes "^ff000000[Information] However, you will not be able to review the tutorials again once you have selected it." ;
			mes "Do you want to skip the tutorial? ^000000";
			next;
			if(select("Think a little","^ff000000Skip all tutorials ^000000") == 1) {
				mes "[Shere]";
				mes "Okay." ;
				mes "So what are we going to do?" ;
				continue;
			}
			mes "^ff0000[Information] Skipping process is running." ;
			mes "Do not terminate the client." ;
			mes "If you exit during execution, you may not receive some items or experience. ^000000";
			next;
			if(DORAM_1QUE <= 4){
				getitem 26135, 1;
			}
			if(DORAM_1QUE <= 32) {
				getitem 15273, 1;
				getitem 22183, 1;
			}
			if(DORAM_1QUE <= 37) {
				getitem 569, 50;
			}
			if(DORAM_1QUE <= 42) {
				getitem 19330, 1;
				getitem 28576, 1;
				getitem 15274, 1;
				getitem 22184, 1;
			}
			if(DORAM_1QUE <= 40) {
				getitem 12324, 1;
			}
			if(DORAM_1QUE == 0) {
				setquest 98400;
				delquest 98400;
				getexp 2,0;
				getexp 0,10;
			}
			if(DORAM_1QUE <= 1) {
				getexp 4,0;
				getexp 0,20;
			}
			if(DORAM_1QUE <= 2) {
				setquest 98402;
				delquest 98402;
				getexp 6,0;
				getexp 0,40;
			}
			if(DORAM_1QUE <= 3) {
				setquest 98403;
				delquest 98403;
				getexp 9,0;
				getexp 0,60;
			}
			if(DORAM_1QUE <= 6) {
				setquest 98404;
				delquest 98404;
				getexp 12,0;
				getexp 0,80;
			}
			if(DORAM_1QUE <= 8) {
				setquest 98405;
				delquest 98405;
				getexp 15,0;
				getexp 0,100;
			}
			if(DORAM_1QUE <= 10) {
				setquest 98406;
				delquest 98406;
				getexp 18,0;
				getexp 0,200;
			}
			if(DORAM_1QUE <= 12) {
				setquest 98407;
				delquest 98407;
				getexp 21,0;
				getexp 0,400;
			}
			if(DORAM_1QUE <= 14) {
				setquest 98408;
				delquest 98408;
				getexp 27,0;
				getexp 0,600;
				delitem 26135, 1;
				getitem2 26135, 1, 1, 1, 4, 0, 0, 0, 0, 0, 0;
			}
			if(DORAM_1QUE <= 16) {
				setquest 98409;
				delquest 98409;
				getexp 40,0;
				getexp 0,800;
			}
			if(DORAM_1QUE <= 18) {
				setquest 98410;
				delquest 98410;
				getexp 48,0;
				getexp 0,1000;
			}
			if(DORAM_1QUE <= 20) {
				setquest 98411;
				delquest 98411;
				getexp 61,0;
				getexp 0,1200;
			}
			if(DORAM_1QUE <= 20) {
				setquest 98412;
				delquest 98412;
				getexp 73,0;
				getexp 0,1400;
			}
			if(DORAM_1QUE <= 23) {
				setquest 98413;
				delquest 98413;
				getexp 87,0;
				getexp 0,1600;
			}
			if(DORAM_1QUE <= 24) {
				skill 142,1,0;
				getexp 103,0;
				getexp 0,1800;
			}
			if(DORAM_1QUE <= 25) {
				setquest 98415;
				delquest 98415;
				getexp 121,0;
				getexp 0,2000;
			}
			if(DORAM_1QUE <= 28) {
				setquest 98416;
				delquest 98416;
				getexp 140,0;
				getexp 0,2200;
			}
			if(DORAM_1QUE <= 29) {
				setquest 98417;
				delquest 98417;
				getexp 157,0;
				getexp 0,2400;
			}
			if(DORAM_1QUE <= 31) {
				setquest 98418;
				delquest 98418;
				getexp 177,0;
				getexp 0,2600;
			}
			if(DORAM_1QUE <= 32) {
				setquest 98419;
				delquest 98419;
				getexp 214,0;
				getexp 0,2800;
				getexp 239,0;
				getexp 0,3000;
			}
			if(DORAM_1QUE <= 33) {
				setquest 98421;
				delquest 98421;
				getexp 267,0;
				getexp 0,3200;
			}
			if(DORAM_1QUE <= 35) {
				setquest 98422;
				delquest 98422;
				getexp 298,0;
				getexp 0,3400;
				getexp 332,0;
				getexp 0,3600;
			}
			if(DORAM_1QUE <= 36) {
				setquest 98424;
				delquest 98424;
				getexp 389,0;
				getexp 0,3800;
			}
			if(DORAM_1QUE <= 38) {
				setquest 98425;
				delquest 98425;
				getexp 430,0;
				getexp 0,4000;
			}
			if(DORAM_1QUE <= 39) {
				setquest 98426;
				delquest 98426;
				getexp 475,0;
				getexp 0,6000;
				setquest 98427;
				delquest 98427;
				getexp 524,0;
				getexp 0,8000;
			}
			if(DORAM_1QUE <= 40) {
				setquest 98428;
				delquest 98428;
			}
			if(DORAM_1QUE <= 41) {
				getexp 577,0;
				getexp 0,10000;
			}
			if(DORAM_1QUE <= 42) {
				setquest 98429;
				delquest 98429;
				getexp 0,25000;
			}
			set DORAM_1QUE,100;
			mes "^ff000000[Information] ^000000^000000^000000ff[next]. ^000000";
			next;
			mes "[Shere]";
			mes "Okay." ;
			mes "Then I'll arrange it that way." ;
			mes "I'm looking forward to your success!" ;
			savepoint "lasagna.gat",299,239;
			warp "lasagna.gat",298,238;
			end;
		}
	}
}

do_tu05a.gat,137,98,4 script Shele#do_tu01a 10165,{
	mes "[Shele]";
	mes "Oh, would you like to finish the tutorial?" ;
	while(1) {
		next;
		switch(select("Think a little","^009effBack to tutorials^000000","^ff000000Skip all tutorials^000000")) {
		case 1:
			mes "[Shere]";
			mes "Okay, I've got it." ;
			mes "Call me again when you decide." ;
			close;
		case 2:
			mes "[Shere]";
			mes "Okay then, I'll send you to the tutorial venue." ;
			mes "I'm looking forward to seeing you in action!" ;
			close2;
			if(DORAM_1QUE <= 1)
				warp "do_tu01a.gat",29,281;
			else if(DORAM_1QUE <= 24)
				warp "do_tu01a.gat",60,320;
			else if(DORAM_1QUE <= 26)
				warp "do_tu02a.gat",224,124;
			else if(DORAM_1QUE <= 34)
				warp "do_tu02a.gat",235,196;
			else if(DORAM_1QUE <= 35)
				warp "do_tu02a.gat",203,322;
			else if(DORAM_1QUE <= 37)
				warp "do_tu05a.gat",186,55;
			else if(DORAM_1QUE <= 38)
				warp "do_tu05a.gat",26,62;
			end;
		case 3:
			break;
		}
		mes "^ff000000[Information] If you select <Skip all tutorials>, you can start your adventure from Lasagna with all the experience and items you can gain in the tutorials received. ^000000";
		next;
		mes "^ff000000[Information] However, you will not be able to review the tutorials again once you have selected it." ;
		mes "Do you want to skip the tutorial? ^000000";
		next;
		if(select("Think a little","^ff000000Skip all tutorials ^000000") == 1) {
			mes "[Shere]";
			mes "Okay." ;
			mes "So what are we going to do?" ;
			continue;
		}
		mes "^ff0000[Information] Skipping process is running." ;
		mes "Do not terminate the client." ;
		mes "If you exit during execution, you may not receive some items or experience. ^000000";
		next;
		if(DORAM_1QUE <= 4){
			getitem 26135, 1;
		}
		if(DORAM_1QUE <= 32) {
			getitem 15273, 1;
			getitem 22183, 1;
		}
		if(DORAM_1QUE <= 37) {
			getitem 569, 50;
		}
		if(DORAM_1QUE <= 42) {
			getitem 19330, 1;
			getitem 28576, 1;
			getitem 15274, 1;
			getitem 22184, 1;
		}
		if(DORAM_1QUE <= 40) {
			getitem 12324, 1;
		}
		if(DORAM_1QUE == 0) {
			setquest 98400;
			delquest 98400;
			getexp 2,0;
			getexp 0,10;
		}
		if(DORAM_1QUE <= 1) {
			getexp 4,0;
			getexp 0,20;
		}
		if(DORAM_1QUE <= 2) {
			setquest 98402;
			delquest 98402;
			getexp 6,0;
			getexp 0,40;
		}
		if(DORAM_1QUE <= 3) {
			setquest 98403;
			delquest 98403;
			getexp 9,0;
			getexp 0,60;
		}
		if(DORAM_1QUE <= 6) {
			setquest 98404;
			delquest 98404;
			getexp 12,0;
			getexp 0,80;
		}
		if(DORAM_1QUE <= 8) {
			setquest 98405;
			delquest 98405;
			getexp 15,0;
			getexp 0,100;
		}
		if(DORAM_1QUE <= 10) {
			setquest 98406;
			delquest 98406;
			getexp 18,0;
			getexp 0,200;
		}
		if(DORAM_1QUE <= 12) {
			setquest 98407;
			delquest 98407;
			getexp 21,0;
			getexp 0,400;
		}
		if(DORAM_1QUE <= 14) {
			setquest 98408;
			delquest 98408;
			getexp 27,0;
			getexp 0,600;
			delitem 26135, 1;
			getitem2 26135, 1, 1, 1, 4, 0, 0, 0, 0, 0, 0;
		}
		if(DORAM_1QUE <= 16) {
			setquest 98409;
			delquest 98409;
			getexp 40,0;
			getexp 0,800;
		}
		if(DORAM_1QUE <= 18) {
			setquest 98410;
			delquest 98410;
			getexp 48,0;
			getexp 0,1000;
		}
		if(DORAM_1QUE <= 20) {
			setquest 98411;
			delquest 98411;
			getexp 61,0;
			getexp 0,1200;
		}
		if(DORAM_1QUE <= 20) {
			setquest 98412;
			delquest 98412;
			getexp 73,0;
			getexp 0,1400;
		}
		if(DORAM_1QUE <= 23) {
			setquest 98413;
			delquest 98413;
			getexp 87,0;
			getexp 0,1600;
		}
		if(DORAM_1QUE <= 24) {
			skill 142,1,0;
			getexp 103,0;
			getexp 0,1800;
		}
		if(DORAM_1QUE <= 25) {
			setquest 98415;
			delquest 98415;
			getexp 121,0;
			getexp 0,2000;
		}
		if(DORAM_1QUE <= 28) {
			setquest 98416;
			delquest 98416;
			getexp 140,0;
			getexp 0,2200;
		}
		if(DORAM_1QUE <= 29) {
			setquest 98417;
			delquest 98417;
			getexp 157,0;
			getexp 0,2400;
		}
		if(DORAM_1QUE <= 31) {
			setquest 98418;
			delquest 98418;
			getexp 177,0;
			getexp 0,2600;
		}
		if(DORAM_1QUE <= 32) {
			setquest 98419;
			delquest 98419;
			getexp 214,0;
			getexp 0,2800;
			getexp 239,0;
			getexp 0,3000;
		}
		if(DORAM_1QUE <= 33) {
			setquest 98421;
			delquest 98421;
			getexp 267,0;
			getexp 0,3200;
		}
		if(DORAM_1QUE <= 35) {
			setquest 98422;
			delquest 98422;
			getexp 298,0;
			getexp 0,3400;
			getexp 332,0;
			getexp 0,3600;
		}
		if(DORAM_1QUE <= 36) {
			setquest 98424;
			delquest 98424;
			getexp 389,0;
			getexp 0,3800;
		}
		if(DORAM_1QUE <= 38) {
			setquest 98425;
			delquest 98425;
			getexp 430,0;
			getexp 0,4000;
		}
		if(DORAM_1QUE <= 39) {
			setquest 98426;
			delquest 98426;
			getexp 475,0;
			getexp 0,6000;
			setquest 98427;
			delquest 98427;
			getexp 524,0;
			getexp 0,8000;
		}
		if(DORAM_1QUE <= 40) {
			setquest 98428;
			delquest 98428;
		}
		if(DORAM_1QUE <= 41) {
			getexp 577,0;
			getexp 0,10000;
		}
		if(DORAM_1QUE <= 42) {
			setquest 98429;
			delquest 98429;
			getexp 0,25000;
		}
		mes "^ff000000[Information]^000000[Shere]";
		mes "Okay, I got it." ;
		mes "Then I'll arrange it that way." ;
		mes "I'm looking forward to your success!" ;
		set DORAM_1QUE,100;
		savepoint "lasagna.gat",299,239;
		warp "lasagna.gat",298,238;
		end;
	}
}

do_tu01a.gat,134,381,0 script warp01#do_tu01a 45,2,2,{
	mes "^ff0000[Information] I left the tutorial in progress." ;
	mes "Would you like to return to the tutorial in progress? ^000000";
	next;
	if(select("Yes", "No") == 2) {
		mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
		close;
	}
	if(DORAM_1QUE <= 1)
		warp "do_tu01a.gat",29,281;
	else if(DORAM_1QUE <= 22)
		warp "do_tu01a.gat",60,320;
	else if(DORAM_1QUE <= 22)
		warp "do_tu02a.gat",153,58;
	end;
}

do_tu01a.gat,29,283,0 script object01#do_tu01a 139,1,1,{
	if(DORAM_1QUE == 0) {
		initnpctimer;
		cutin "do_su_001.bmp", 3;
		setquest 98400;
		set DORAM_1QUE,1;
	}
	end;
OnTimer1000:
	donpcevent "Vigilante Ajenya#do::OnTalk1";
	end;
OnTimer3000:
	stopnpctimer;
	donpcevent "Neighborhood watchman Ajenya#do::OnTalk2"; end; OnTimer3000: stopnpctimer; stopnpctimer3000: stopnpctimer3000: stopnpctimer3000
	end;
}

do_tu01a.gat,35,288,3 script vigilante ajenya#do 10162,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-","";
		end;
	}
	switch(DORAM_1QUE) {
	case 0:
	case 1:
		if(checkquest(98400)) {
			delquest 98400;
			getexp 2,10;
		}
		mes "[Vigilante Ajenya]";
		mes "Oh, yes!  You got a solid click." ;
		next;
		mes "^009eff [Information] If you do not progress in a conversation with an NPC for approximately one minute or more, the conversation will be interrupted." ;
		mes "In that case, you will need to speak to them again, so please Attention. ^000000";
		next;
		mes " Tutorial <Instruction> 1/12************************; Using NPCs, opening and closing quest windows, basic movement, and checking your current location. ************************";
		next;
		switch(select("Begin", "Skip this tutorial", "Skip all tutorials")) {
		case 1:
			break;
		case 2:
			getexp 4,20;
			setquest 98402;
			set DORAM_1QUE,2;
			mes "^ff0000[Information] All tutorials have been completed with the NPC you are currently speaking with." ;
			mes "Would you like to head to the next tutorial location? ^000000";
			next;
			switch(select("Warp to the next location", "Walk to the next location without warping", "Skip all tutorials")) {
			case 1:
				warp "do_tu01a.gat",60,319;
				end;
			case 2:
				close;
			}
		case 3:
			warp "do_tu05a.gat",136,95;
			end;
		}
		mes "[Vigilante Ajenya]";
		mes "You can talk to me first when you meet other people, just like you just talked to me." ;
		next;
		mes "^009eff[Information] You can control various interfaces in the game by clicking your mouse. ^000000";
		next;
		mes "^009eff[Information] Use the left mouse click to talk to NPCs, move around, and attack monsters. ^000000";
		next;
		mes "[Vigilante Agenya]";
		mes "^009effYou are an adventurer who wishes to travel to the new continent ^000000?" ;
		mes "There really are a lot of them these days." ;
		next;
		mes "[Vigilante Agenya]";
		mes "But I was surprised when I heard the story." ;
		mes "Did I say ^009eff Midgard^000000?" ;
		mes "I can't believe that a new continent inhabited by a different species than ours was discovered with the missing ^009eff Navi ^000000." ;
		next;
		mes "[Vigilante Agenya]";
		mes "Thanks to that, this ^009eff Lasagna^000000, which was just a remote fishing village, is now full of Doram from the outside." ;
		next;
		mes "[Vigilante Ajenya]";
		mes "But the Doram who came from the outside are causing quite a few problems. ......" ;
		mes "They are causing us a lot of trouble." ;
		next;
		mes "[Vigilante Agenya]";
		mes "That's why we've decided to make it mandatory for anyone traveling to the New World to join the ^009eff Farfalle Vigilante ^000000." ;
		next;
		mes "[Vigilante Agenya]"; mes "[Vigilante Agenya]"; mes "[Vigilante Agenya]
		mes "If you too want to cross to the new continent, you must pass the entrance test and join the vigilante group." ;
		next;
		mes "[Vigilante Ajenya]"; mes "[Vigilante Ajenya]
		mes "However, I won't suddenly impose a test on someone who doesn't even know the ropes of adventure." ;
		mes "First, I'll teach you the basics of adventure." ;
		next;
		mes "[Vigilante Agenya]";
		mes "Your companion Ario is waiting for you in the northeast." ;
		mes "Ask him for more information." ;
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff[Information] The quest window can be opened by left-clicking on the icon or ^ff000000<Alt>key+<U>key^009eff. ^000000";
		next;
		cutin "do_su_003.bmp", 3;
		mes "^009eff[Information] The quest window contains destinations and goals." ;
		mes "This quest also has a destination written on it, so let's get there first! ^000000";
		next;
		mes "^009eff [Information] The map in the upper right corner of the screen shows your current location." ;
		mes "Find Ario based on the information in the quest window! ^000000";
		next;
		cutin "do_su_003.bmp", 255;
		viewpoint 1, 60, 322, 1, 0xFF0000;
		mes "[Vigilante Ajenya]";
		mes "I marked the map in the upper right corner of the ^ff0000 screen so that you can get to ^009eff Ario ^000000 safely. ^000000It must be unfamiliar territory, so proceed with care!" ;
		next;
		mes "[Vigilante Agenya]";
		mes "^009eff Ario ^000000 will tell you a lot of things you need to know for the adventure ahead, so ask him." ;
		mes "That's all from me." ;
		next;
		mes "^009eff[Information] You have received the quest "Vigilante Lecture"." ;
		mes "Open the quest window to confirm! ^000000";
		setquest 98402;
		set DORAM_1QUE,2;
		getexp 4,20;
		close;
	case 2:
		mes "[Vigilante Agenya]";
		mes "I must greet the curious Dorams like you who come for the new continent." ;
		mes "Ask me what to do next from ^009eff Ario^000000 over there." ;
		next;
		cutin "do_su_002.bmp", 3;
		mes "The ^009eff [Information] quest window can be opened by left-clicking on the icon or ^ff000000<Alt>key+<U>key^009eff. ^000000";
		next;
		cutin "do_su_003.bmp", 3;
		mes "^009eff[Information] The quest window contains destinations and goals." ;
		mes "This quest also has a destination written on it, so let's get there first! ^000000";
		next;
		mes "^009eff [Information] The map in the upper right corner of the screen shows your current location." ;
		mes "Find Ario based on the information in the quest window! ^000000";
		next;
		cutin "do_su_003.bmp", 255;
		viewpoint 1, 60, 322, 1, 0xFF0000;
		mes "[Vigilante Ajenya]";
		mes "I marked the map in the upper right corner of the ^ff0000 screen so that we could get to Ario's place safely. It must be ^000000unfamiliar territory, so proceed with care!" ;
		next;
		mes "[Vigilante Agenya]";
		mes "Ario is one of the best guys in our ^009eff Farfalle vigilante ^000000." ;
		mes "He will teach you a lot." ;
		close;
	default:
		mes "^ff0000[Information] You have left an ongoing tutorial." ;
		mes "Would you like to return to the tutorial in progress? ^000000";
		next;
		if(select("Yes", "No") == 2) {
			mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
OnTalk1:
	unittalk "Vigilante Ajenya : Hey, there new guy!  Over here!" ;
	end;
OnTalk2:
	unittalk "Vigilante Ajenya : come here!  Click me!" ;
	end;
}

do_tu01a.gat,60,322,3 script vigilante ario#do_tu01a 10154,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-","";
		end;
	}
	while(1) {
		switch(DORAM_1QUE) {
		case 2:
			if(checkquest(98402)) {
				delquest 98402;
				getexp 6,40;
			}
			mes " tutorial<training> 2/12************************ and attacking monsters************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				setquest 98403;
				delquest 98403;
				set DORAM_1QUE,4;
				getexp 9,60;
				continue;
			}
			EMOTION 12;
			mes "[Vigilante Ario]";
			mes "Hey, how are you?" ;
			mes "My name is Ario, and I'll be your guide from now on." ;
			mes "You're lucky." ;
			mes "I'm a pretty good member of the Farfalle Neighborhood Watch!" ;
			next;
			mes "[Vigilante Ario]";
			mes "I think I can help you with most things." ;
			mes "Let's see how much you can do first, shall we?" ;
			next;
			mes "[Vigilante Ario]";
			mes "Did you see any creatures like the Medamayaki before you came to me?" ;
			mes "They're monsters called ^009eff Egglyn^000000." ;
			next;
			mes "[Vigilante Ario]";
			mes "Go kill three ^009eff Egglyn^000000 to test your skill!" ;
			mes "Show me what you're made of!" ;
			next;
			mes "^009eff[Information] Left click to attack the monsters." ;
			mes "Go back the way you came and left click on Egglyn! ^000000";
			close2;
			set DORAM_1QUE,3;
			setquest 98403;
			end;
		case 3:
			if(! (checkquest(98403)&0x4)) {
				mes "[Vigilante Ario]";
				mes "Go kill 3 Eglin to test your skills!" ;
				mes "Show me what you're made of!" ;
				next;
				mes "^009eff[Information] Left click to attack the monster." ;
				mes "Go back the way you came and left click on Egglyn! ^000000";
				close;
			}
			mes "[Vigilante Ario]";
			mes "Oh, isn't he a medium good one?" ;
			mes "You're just trying to make it to a new continent." ;
			emotion 21;
			next;
			mes "[Vigilante Ario]";
			mes "I'm sure you'll do well in the tough environment ahead." ;
			next;
			if(checkquest(98403)) {
				delquest 98403;
				set DORAM_1QUE,4;
				getexp 9,60;
			}
		case 4:
		case 5:
			mes " tutorial<training> 3/12************************, how to open the possession item column, how to equip items************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				getitem 26135, 1. setquest 98404; 2. setquest 98405; 3. setquest 98404; 4;
				setquest 98404;
				delquest 98404;
				set DORAM_1QUE,7;
				getexp 12,80;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "Okay, let's do this to prepare for the adventure ahead." ;
			next;
			if(DORAM_1QUE == 4){
				set DORAM_1QUE,5;
				getitem 26135,1;
			}
			mes "[Vigilante Ario]";
			mes "Talk to me again when you have equipped the 'beginner's catnip' I just gave you." ;
			mes "Then I will tell you the next part of the training." ;
			next;
			mes "^009eff[Information] Open the item window to see what items Ario gave you!" ;
			next;
			cutin "do_su_004.bmp", 3;
			mes "^009eff[Information] The item window can be opened by left-clicking on the icon or ^ff000000<Alt>key+<E>key^009eff. ^000000";
			next;
			mes "^009eff[Information] Double-click on 'Catnip for Beginners' from the Equipment tab of the Item Window." ;
			mes "You can equip it." ;
			next;
			cutin "do_su_005.bmp", 3;
			mes "^009eff[Information] You can see the items you are equipping in the equip window." ;
			mes "You can open it by left-clicking the icon or ^ff000000<Alt>key+<Q>key^009eff. ^000000";
			next;
			cutin "do_su_006.bmp", 3;
			mes "^009eff[Information] Besides double-clicking, you can also drag and drop the item you want to equip from the item window to the equipment window. ^000000";
			next;
			mes "^009eff[Information] However, if you specify the ground by drag and drop when the equipment column is not open, the item will be dropped, so please Attention. ^000000";
			next;
			mes "^009eff[Information] If you press the drop lock button to lock the item, the item will not be dumped on the ground." ;
			mes "If you are worried about it, keep it locked. ^000000";
			setquest 98404;
			set DORAM_1QUE,6;
			close2;
			cutin "do_su_002.bmp", 255;
			end;
		case 6:
			if(getequipid(4) ! = 26135) {
				mes "[Vigilante Ario]";
				mes "You're wearing something different." ;
				mes "You'd better check again if you're wearing the 'beginner's catnip' I gave you." ;
				next;
				mes "^009eff[Information] Let's open the item window to see what items Ario gave you!" ;
				next;
				cutin "do_su_004.bmp", 3;
				mes "^009eff[Information] The item window can be opened by left-clicking on the icon or ^ff000000<Alt>key+<E>key^009eff. ^000000";
				next;
				mes "^009eff[Information] Double-click on 'Catnip for Beginners' from the Equipment tab of the Item Window." ;
				mes "You can equip it." ;
				next;
				cutin "do_su_005.bmp", 3;
				mes "^009eff[Information] You can see the items you are equipping in the equip window." ;
				mes "You can open it by left-clicking the icon or ^ff000000<Alt>key+<Q>key^009eff. ^000000";
				next;
				cutin "do_su_006.bmp", 3;
				mes "^009eff[Information] Besides double-clicking, you can also drag and drop the item you want to equip from the item window to the equipment window. ^000000";
				next;
				mes "^009eff[Information] However, if you specify the ground by drag and drop when the equipment column is not open, the item will be dropped, so please Attention. ^000000";
				next;
				mes "^009eff[Information] If you press the drop lock button to lock the item, the item will not be dumped on the ground." ;
				mes "If you are worried about it, keep it locked. ^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[Vigilante Ario]";
			mes "That's quite a quick swallow." ;
			mes "You're just trying to make it to a new continent." ;
			next;
			delquest 98404;
			set DORAM_1QUE,7;
			getexp 12,80;
		case 7:
			mes " tutorial<training> 4/12************************, status description, how to assign status ************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				setquest 98405;
				delquest 98405;
				set DORAM_1QUE,9;
				getexp 15,100;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "In the coming adventures you will gain many experiences and grow." ;
			next;
			mes "[Vigilante Ario]"; mes "[Vigilante Ario]
			mes "In order to determine your path, you must first gain an understanding of your status." ;
			next;
			cutin "do_su_007.bmp", 3;
			mes "^009eff[Information] There are six types of status." ;
			mes "Make sure you know the characteristics of each one! ^000000";
			next;
			cutin "do_su_008.bmp", 3;
			mes "^009eff[Information] status window can be opened by left-clicking on the icon or by ^ff000000<Alt>key+<A>key^009eff." ;
			mes "Let's open the window first! ^000000";
			next;
			cutin "do_su_009.bmp", 3;
			mes "^009eff[Information] Clicking the arrow will consume a Status Point and increase your status." ;
			mes "Status Points increase with each increase in BaseLv. ^000000";
			next;
			mes "^009eff[Information] In the beginning, aim for ^ff000000Str20Dex20^009eff to increase your Status. ^000000";
			next;
			mes "^009eff[Information] Once consumed, Status Points cannot be regained." ;
			mes "Be careful not to use a point for another status by mistake. ^000000";
			next;
			mes "^00009eff[Information] In addition, Doram can reset his status as many times as he wants until he reaches BaseLv 70, 7 days after he talks to Orio the Vigilante after the tutorial is over. ^000000";
			next;
			mes "^009eff[Information] The way you fight monsters depends on how you raise your status." ;
			mes "Find the right status for you. ^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[Vigilante Ario]";
			mes "Do you understand the status?" ;
			mes "Then try and raise ^000000ffDex until it reaches "10". ^000000";
			next;
			mes "[Vigilante Ario]";
			mes "By the way, the "+○" part of the status is the status bonus from equipment and JobLv." ;
			mes "This time, don't include the ^000000ff status bonus and set Dex to 10. ^000000";
			next;
			mes "^00009eff[Information] All equipment items have been removed and the status acquisition status has been reset. ^000000";
			setquest 98405;
			resetstatus;
			unequip -1;
			set DORAM_1QUE,8;
			close2;
			cutin "do_su_002.bmp", 255;
			end;
		case 8:
			if(readparam(bDex) < 10) {
				mes "[Vigilante Ario]";
				mes "You're still missing Dex." ;
				mes "Raise it until you get to '10'." ;
				mes "Show me what you can do!" ;
				next;
				mes "[Vigilante Ario]";
				mes "By the way, the "+○" part of the status is the status bonus from equipment and JobLv." ;
				mes "This time, don't include the ^000000ff status bonus, and set Dex to 10. ^000000";
				next;
				cutin "do_su_008.bmp", 3;
				mes "^009eff[Information] The status window can be opened by left-clicking on the icon or by ^ff000000<Alt>key+<A>key^009eff." ;
				mes "Let's open the window first! ^000000";
				next;
				cutin "do_su_009.bmp", 3;
				mes "^009eff[Information] Clicking the arrow will consume a Status Point and increase your status." ;
				mes "Status Points increase with each increase in BaseLv. ^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[Vigilante Ario]";
			mes "Okay, you've raised your Dex properly." ;
			mes "Now it's easier to hit the monster with your attacks." ;
			next;
			delquest 98405;
			set DORAM_1QUE,9;
			getexp 15,100;
		case 9:
			mes " tutorial<training> 5/12************************; about skills; how to open the skills window; how to assign skills************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				setquest 98406;
				delquest 98406;
				set DORAM_1QUE,11;
				getexp 18,200;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "Okay, now let's learn about skills, shall we?" ;
			next;
			mes "^009eff[Information] Skills differ for each profession, and you, who are a Summoner by profession, can learn offensive, recovery, and auxiliary skills. ^000000";
			next;
			cutin "do_su_010.bmp", 3;
			mes "^009eff[Information] The skill window can be opened by left-clicking on the icon or by pressing ^ff000000<Alt>key+<S>key^009eff." ;
			mes "Let's open the window first! ^000000";
			next;
			cutin "do_su_011.bmp", 3;
			mes "^009eff[Information] Left-click the skill you want to learn, press the confirm button, and if you agree to confirm, you will spend skill points to learn the skill." ;
			mes "Skill points are increased by 1 point for every 1 JobLv. ^000000";
			next;
			mes "^009eff[Information] Once consumed, skill points cannot be restored." ;
			mes "Be careful not to use points for another skill by mistake. ^000000";
			next;
			mes "^009eff[Information] In addition, Doram can reset his skills as many times as he wants until he reaches BaseLv 70, 7 days after the tutorial ends and he talks to Orio the Vigilante. ^000000";
			next;
			mes "^009eff[Information] Depending on the skills you learn, the way you fight monsters will vary greatly." ;
			mes "Find the right skill for you. ^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[Vigilante Ario]";
			mes "Do you understand the skills?" ;
			mes "Then try and learn ^000000ff "Doram Basic Skills" ^000000ff and ^000000ff "Bite" ^000000ff." ;
			next;
			mes "Some of the ^009eff [Information] skills have requirements to learn." ;
			mes "You must have learned "Doram Basic Skills" Lv 1 to learn "Bite". ^000000";
			next;
			mes "^009eff [Information] You must first learn "Doram Basic Skills" before learning "Biting". ^000000";
			next;
			mes "^009eff[Information] All equipped items have been removed and skill acquisition status reset. ^000000";
			setquest 98406;
			resetskill;
			unequip -1;
			set DORAM_1QUE,10;
			close;
		case 10:
			if(getskilllv(5019) == 0) { // bite skill
				mes "[Vigilante Ario]";
				if(getskilllv(5018) == 0) { // Doram basic skill
					mes "You haven't gotten either of those skills yet, okay?" ;
				}
				else {
					mes "You haven't gotten the biting skill yet." ;
				}
				mes "Check again." ;
				next;
				cutin "do_su_010.bmp", 3;
				mes "^009eff[Information] The skills window can be opened by left-clicking on the icon or ^ff0000<Alt> key + <S> key ^009eff." ;
				mes "Let's open the window first! ^000000";
				next;
				cutin "do_su_011.bmp", 3;
				mes "^009eff[Information] Left-click the skill you want to learn, press the confirm button, and if you agree to confirm, you will spend skill points to learn the skill. ^000000";
				next;
				mes "^009eff[Information] Once consumed, skill points cannot be restored." ;
				mes "Be careful not to use points for another skill by mistake. ^000000";
				next;
				mes "^009eff[Information] In addition, Doram can reset his skills as many times as he wants until he reaches BaseLv 70, 7 days after the tutorial ends and he talks to Orio the Vigilante. ^000000";
				next;
				mes "^009eff[Information] Depending on the skills you learn, the way you fight monsters will vary greatly." ;
				mes "Find the right skill for you. ^000000";
				next;
				cutin "do_su_002.bmp", 255;
				mes "^009eff[Information] Some skills have requirements to learn." ;
				mes "To learn "Bite" you must have learned "Doram Basic Skills" Lv 1. ^000000";
				next;
				mes "^009eff [Information] You must first learn "Doram Basic Skills" before learning "Biting". ^000000";
				close;
			}
			emotion 21;
			mes "[Vigilante Ario]";
			mes "You've learned your skills properly." ;
			mes "You want to use it right away?" ;
			next;
			delquest 98406;
			set DORAM_1QUE,11;
			getexp 18,200;
		case 11:
			mes " tutorial<training> 6/12************************; shortcut window; how to use skills; try out skills************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				setquest 98407;
				delquest 98407;
				set DORAM_1QUE,13;
				getexp 21,400;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "Okay, so let's get right to using the skills we just learned." ;
			next;
			mes "[Vigilante Ario]";
			mes "Hey, before we do that, let me explain the shortcut window where you can register skills and items." ;
			next;
			mes "[Vigilante Ario]";
			mes "You can register skills and items in the shortcut window so you can use them quickly." ;
			next;
			cutin "do_su_027.bmp", 3;
			mes "^009eff[Information] Shortcut windows can be opened by pressing ^ff0000<Ctrl>key+<F12>key^009eff." ;
			mes "Shortcut windows can be toggled with the <F12> key and up to four can be registered." ;
			next;
			cutin "do_su_012.bmp", 255;
			mes "[Vigilante Ario]";
			mes "Did you open the shortcut window?" ;
			mes "Then the next step is to register your skills in the shortcut window." ;
			next;
			cutin "do_su_012.bmp", 3;
			mes "^009eff[Information] Register the skill in the shortcut window." ;
			mes "Open the skill window and drag and drop the learned "bite" into the shortcut window! ^000000";
			next;
			cutin "do_su_013.bmp", 3;
			mes "^009eff[Information] Press the function key corresponding to the shortcut and the cursor for the skill will appear, so let's left-click on the enemy. ^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[Vigilante Ario]";
			mes "Did you figure out how to use it?" ;
			mes "Then report back to me when you kill three ^009eff glass fables^000000!" ;
			mes "^000000ffThey are green caterpillar-like monsters and are located east of here. You should be able to do it if you use your ^000000 skills!" ;
			close2;
			setquest 98407;
			set DORAM_1QUE,12;
			end;
		case 12:
			if(! (checkquest(98407)&0x4)) {
				mes "[Vigilante Ario]";
				mes "Then report back to me when you kill three ^009eff glass fables^000000!" ;
				mes "^000000ffThey are green caterpillar-like monsters and are located east of here. You should be able to do it if you use your ^000000 skills!" ;
				next;
				cutin "do_su_027.bmp", 3;
				mes "^009eff[Information] Shortcut window can be opened by pressing ^ff0000<Ctrl>key+<F12>key^009eff." ;
				mes "Shortcut windows can be toggled with the <F12> key and up to four can be registered." ;
				next;
				cutin "do_su_012.bmp", 3;
				mes "Register ^009eff[Information] skills in the shortcut window." ;
				mes "Open the skill window and drag and drop the learned "bite" into the shortcut window! ^000000";
				next;
				cutin "do_su_013.bmp", 3;
				mes "^009eff[Information] Press the function key corresponding to the shortcut and the cursor for the skill will appear, so let's left-click on the enemy. ^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[Vigilante Ario]";
			mes "You're gonna do it." ;
			mes "Well, if you want to get to the new continent, you're going to have to do this." ;
			next;
			delquest 98407;
			set DORAM_1QUE,13;
			getexp 21,400;
		case 13:
			mes " tutorial<training> 7/12************************ and refining items************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				delitem 26135, 1;
				getitem2 26135, 1, 1, 4, 0, 0, 0, 0, 0, 0;
				setquest 98408;
				delquest 98408;
				set DORAM_1QUE,15;
				getexp 27,600;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "Okay, that's the next course." ;
			mes "So far we've had you fight Egglyn and Grassfable, but you'll be fighting more powerful monsters in the future." ;
			next;
			mes "[Vigilante Ario]";
			mes "To defeat powerful monsters, you will need powerful equipment." ;
			mes "That's where ^ff000000 refining^000000 enhances your equipment and improves its performance." ;
			next;
			mes "[Vigilante Ario]";
			mes "Go talk to the blacksmith there and ask him to refine the weapons you have." ;
			next;
			mes "[Vigilante Ario]";
			mes "Normally, you would need to pay for the cost and materials, but this time I've told him to do it for you without any of those things specially." ;
			mes "Go refine the "Beginner's Catnip" until the refining value is ^ff000000+4^000000!" ;
			next;
			cutin "do_su_023.bmp", 3;
			mes "^009eff[Information] You can increase the performance of your weapons and armor by refining your equipment." ;
			mes "The cost and materials required for refining vary depending on the item. ^000000";
			next;
			cutin "do_su_024.bmp", 3;
			mes "^009eff[Information] Refining beyond a certain refining value may cause refining to fail." ;
			mes "Be aware that the safe refining value depends on the equipment and items that fail to refine will be lost! ^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[Vigilante Ario]";
			mes "Up to +4 refining value, refining will never fail." ;
			mes "Go ahead and rest assured!" ;
			close2;
			setquest 98408;
			set DORAM_1QUE,14;
			end;
		case 14:
			switch(getequipid(4)) {
			case 26135:
				break;
			case 0:
				mes "[Vigilante Ario]";
				mes "Hey, hey, you're not equipped with a weapon." ;
				mes "Make sure you're properly equipped before you call out to me." ;
				close;
			default:
				mes "[Vigilante Ario]";
				mes "Hey, that's not 'catnip for beginners'." ;
				mes "Make sure you're properly equipped before you call on me." ;
				close;
			}
			if(getequiprefinerycnt(4) < 4) {
				mes "[Vigilante Ario]";
				mes "Hey, hey, hey";
				if(getequiprefinerycnt(4) == 0) {
					mes "You didn't get it refined." ;
					mes "You need to get it refined properly before you can talk to me." ;
				}
				else {
					mes "You're not refining it enough." ;
					mes "Refine it until it's properly ^ff000000+4^000000 and then call me." ;
				}
				next;
				mes "[Vigilante Ario]";
				mes "Go talk to the blacksmith there and have him refine the weapon you have." ;
				mes "Go refine the "Beginner's Catnip" until the refining value is ^ff000000+4^000000!" ;
				close;
			}
			EMOTION 21;
			mes "[Vigilante Ario]";
			mes "Brilliant catnip!" ;
			mes "As expected of Doram, who is aiming for a new continent." ;
			next;
			delquest 98408;
			set DORAM_1QUE,15;
			getexp 27,600;
		case 15:
			mes " tutorial<training> 8/12************************, about natural recovery, about 50% and 90% of weight************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				setquest 98409;
				delquest 98409;
				set DORAM_1QUE,17;
				getexp 40,800;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "As you've probably figured out after a few fights, your HP decreases when you get attacked by monsters, and your SP decreases when you attack with skills." ;
			next;
			mes "[Vigilante Ario]";
			mes "So how do we recover them?" ;
			mes "That's what I'm going to teach you." ;
			next;
			cutin "do_su_014.bmp", 3;
			mes "^009eff[Information] HP and SP will recover naturally over time, but you can speed up the rate at which they recover by sitting. ^000000";
			next;
			mes "^009eff[Information] You can switch between "standing" and "sitting" with the ^ff000000<Insert> key ^009eff. ^000000";
			next;
			cutin "do_su_015.bmp", 3;
			mes "^009eff[Information] In addition, natural recovery will not occur when the weight of items in your possession exceeds 50% of the total weight." ;
			next;
			mes "^009eff[Information] Furthermore, when the weight of items in your possession reaches 90% or more of the total weight, normal and skill attacks will no longer occur." ;
			mes "If this happens, throw away your items to reduce the weight! ^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[Vigilante Ario]";
			mes "Okay, then sit down and talk to him!" ;
			close2;
			setquest 98409;
			set DORAM_1QUE,16;
			end;
		case 16:
			if(checksit() == 0) {
				mes "[Vigilante Ario]";
				mes "Hey, hey, you're not sitting down." ;
				mes "You can relax more." ;
				next;
				cutin "do_su_014.bmp", 3;
				mes "^009eff[Information] Sit back and recover." ;
				mes "You will notice that your HP and SP recover faster than when you are standing!" ;
				next;
				mes "^009eff[Information] You can switch between "standing" and "sitting" with the ^ff000000<Insert> key ^009eff. ^000000";
				next;
				cutin "do_su_015.bmp", 3;
				mes "^009eff[Information] In addition, natural recovery will not occur when the weight of items in your possession exceeds 50% of the total weight." ;
				next;
				mes "^009eff[Information] Furthermore, when the weight of items in your possession reaches 90% or more of the total weight, normal and skill attacks will no longer occur." ;
				mes "If this happens, throw away your items to reduce the weight! ^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[Vigilante Ario]";
			mes "Yes, sometimes it's important to stop and rest, not just keep going." ;
			next;
			delquest 98409;
			set DORAM_1QUE,17;
			getexp 40,800;
		case 17:
			mes " tutorial<training> 9/12************************, how to buy items, how to sell items************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				setquest 98410;
				delquest 98410;
				set DORAM_1QUE,19;
				getexp 48,1000;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "You've got the basics of adventure down pretty well." ;
			mes "Now for the next lesson, there will be many situations where you will not be able to get through with only natural recovery in order to fight many more monsters." ;
			next;
			mes "[Vigilante Ario]";
			mes "So what do we do?" ;
			mes "That's what I'm going to teach you now." ;
			next;
			mes "[Vigilante Ario]";
			mes "Go buy 5 beginner's potions, 5 blue potions for beginners from the merchant there." ;
			mes "Then I'll be waiting for you." ;
			next;
			cutin "do_su_016.bmp", 3;
			mes "^009eff [Information] Sell the zero peas, cotton wool, and other collectibles you've picked up in the battle so far to the merchant for Zeny." ;
			next;
			cutin "do_su_017.bmp", 3;
			mes "^009eff[Information] Once you have earned Zeny, buy ^ff000000 5 blue potions for beginners 5 blue potions for beginners ^009eff! ^000000";
			close2;
			setquest 98410;
			set DORAM_1QUE,18;
			cutin "do_su_002.bmp", 255;
			end;
		case 18:
			if(countitem(569) < 5 || countitem(11518) < 5) {
				mes "[Vigilante Ario]";
				mes "Go buy 5 beginner's potions and 5 blue potions for beginners from the merchant there." ;
				mes "Then I'll be waiting for you." ;
				next;
				cutin "do_su_016.bmp", 3;
				mes "^009eff [Information] Sell the zero peas, cotton wool, and other collectibles you've picked up in the battle so far to the merchant for Zeny." ;
				next;
				cutin "do_su_017.bmp", 3;
				mes "^009eff[Information] Once you have earned Zeny, buy ^ff000000 5 blue potions for beginners 5 blue potions for beginners ^009eff! ^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[Vigilante Ario]";
			mes "Looks like you got it right." ;
			mes "I guess you're good enough to do some errands for me." ;
			next;
			delquest 98410;
			set DORAM_1QUE,19;
			getexp 48,1000;
		case 19:
			mes " tutorial<training> 10/12************************ and how to use consumable items************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				setquest 98411;
				delquest 98411;
				set DORAM_1QUE,21;
				getexp 61,1200;
				continue;
			}
			mes "[Vigilante Ario]";
			mes "Now, listen carefully as I explain how to use that potion next." ;
			next;
			cutin "do_su_018.bmp", 3;
			mes "^009eff[Information] Open the item window and double-click the potion you purchased." ;
			mes "In addition, items may not be available while you are talking to NPCs, so please Attention! ^000000";
			next;
			mes "^009eff[Information] Also, as with skills, you can register them in the shortcut window and use them by pressing the corresponding function key. ^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[Vigilante Ario]";
			mes "I've reduced your HP and SP so you can feel the recovery." ;
			mes "Then, when you've used up all the ^000000ff potions you have, give me a ^000000 call." ;
			percentheal -50,-50;
			close2;
			setquest 98411;
			set DORAM_1QUE,20;
			end;
		case 20:
			if(countitem(569) > 0 || countitem(11518) > 0) {
				mes "[Vigilante Ario]";
				mes "^000000ffWhen you've used up all the potions you have, ^000000 call out to me." ;
				mes "Then I'll be waiting for you." ;
				next;
				cutin "do_su_018.bmp", 3;
				mes "^009eff[Information] Open the possession field and double-click on the potion." ;
				mes "In addition, items may not be available while you are talking to NPCs, so please Attention! ^000000";
				next;
				mes "^009eff[Information] Also, as with skills, you can register them in the shortcut window and use them by pressing the corresponding function key. ^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21, "Vigilante Ario#do_tu01a";
			mes "[Vigilante Ario]";
			mes "You've learned how to use items." ;
			mes "You have it ready to use at any time in case of an emergency." ;
			next;
			delquest 98411;
			set DORAM_1QUE,21;
			getexp 61,1200;
		case 21:
			mes " tutorial<training> 11/12************************ and items that go directly into the quest window ************************";
			next;
			switch(select("begin", "skip this tutorial", "skip all tutorials")) {
			case 1:
				break;
			case 2:
				getitem 1081, 1;
				setquest 98412;
				delquest 98412;
				getexp 73,1400;
				setquest 98413;
				set DORAM_1QUE,23;
				mes "^ff0000[Information] All tutorials have been completed with the NPC you are currently speaking with." ;
				mes "Would you like to head to the next tutorial location? ^000000";
				next;
				switch(select("Warp to the next location", "Walk to the next location without warping", "Skip all tutorials")) {
				case 1:
					warp "do_tu02a.gat",224,124;
					close;
				case 2:
					close;
				}
			}
			mes "[Vigilante Ario]";
			mes "Hmmm, so next up: ......" ;
			next;
			cloakoffnpc "The youngest son of the toolmaker#do_tu01a";
			donpcevent "youngest son of toolmaker#do_tu01a::OnTalk1";
			next;
			mes "[Vigilante Ario]";
			mes "You startled me, what do you want?" ;
			mes "You're the youngest of the toolmakers, aren't you?" ;
			mes "What brings you to this dangerous place?" ;
			next;
			mes "[Toolmaker's youngest son]";
			mes "I lost it when I fell. ......." ;
			mes "It's a package, and I was asked to give it to my brother Hal, but I was playing with it and before I knew it..." ;
			next;
			mes "[Toolmaker's youngest son]";
			mes "Help me, Brother Ario!" ;
			mes "I'm going to get angry!" ;
			next;
			mes "[Neighborhood Watchman Ario]";
			mes "I was asked to run an errand to deliver a box to Hal the Healer, but I was playing around a bit and lost the box when I fell, is that right?" ;
			next;
			mes "[Toolmaker's youngest son]";
			mes "Yes!  That's right!" ;
			mes "That's my brother!" ;
			mes "You understood it very well." ;
			next;
			mes "[Vigilante Ario]";
			mes "First of all, you should go back to the city now." ;
			mes "I'll take care of the box." ;
			mes "And don't talk that embarrassing way anymore in front of people you don't know." ;
			next;
			mes "[Toolmaker's youngest son]";
			mes "Don't be so harsh, brother~." ;
			mes "I am Lasagna's lovely youngest son!" ;
			mes "Anyway, I asked you for the box." ;
			next;
			cloakonnpc "youngest son of the toolmaker#do_tu01a";
			mes "[Vigilante Ario]";
			mes "......" ;
			mes "haha ......." ;
			next;
			mes "[Vigilante Ario]";
			mes "Now that it's come to this, we have no choice." ;
			mes ""+strcharinfo(0)+ ", can you please search the box?" ;
			next;
			mes "[Vigilante Ario]";
			mes "Well, I'm so glad to have the excellent Doram next door!" ;
			mes "The important thing is the box, probably ^009eff Egglyn^000000 ate it." ;
			next;
			mes "[Vigilante Ario]";
			mes "If we kill a few ^009eff Egglyn^000000s, we'll find the box." ;
			mes "Come on, I'm asking you!" ;
			next;
			mes "^009eff[Information] It looks like Egglyn swallowed a delivery crate." ;
			mes "Let's go find it and show it to Ario." ;
			next;
			cutin "do_su_019.bmp", 3;
			mes "^009eff[Information] Normally, items are dropped on the ground when a monster is defeated, but in some quests the target item may go directly into the item window. ^000000";
			close2;
			setquest 98412;
			set DORAM_1QUE,22;
			cutin "do_su_002.bmp", 255;
			end;
		case 22:
			if(countitem(1081) < 1) {
				mes "[Vigilante Ario]";
				mes "^009eff Egglyn^000000 defeated him earlier and you remember what he looks like, don't you?" ;
				mes "I don't know which one swallowed it, but if we take it down from one end to the other, we should be able to find it." ;
				next;
				mes "^009eff[Information] It looks like Egglyn swallowed a delivery crate." ;
				mes "Let's go find it and show it to Ario." ;
				next;
				cutin "do_su_019.bmp", 3;
				mes "^009eff[Information] Normally, items are dropped on the ground when a monster is defeated, but in some quests the target item may go directly into the item window. ^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			mes "[Vigilante Ario]";
			mes "Oh, that's it, that's the box!" ;
			mes "So can you deliver that box to Hal's next?" ;
			next;
			mes "[Vigilante Ario]";
			mes "When you get to town, find Hal the healer and give it to him." ;
			next;
			emotion 27;
			mes "[Vigilante Ario]";
			mes "To get to the town, just walk northeast along the road." ;
			mes "Just walk all the way." ;
			mes "It's an easy road, but be careful." ;
			next;
			cutin "do_su_020.bmp", 3;
			mes "^009eff[Information] Touch the warp link to go to another map." ;
			mes "You can move to the town of Lasagna by touching the warp link to the north of this map. ^000000";
			close2;
			viewpoint 1, 134, 381, 1, 0xFF0000;
			cutin "do_su_002.bmp", 255;
			delquest 98412;
			getexp 73,1400;
			setquest 98413;
			set DORAM_1QUE,23;
			end;
		case 23:
			mes "[Vigilante Ario]";
			mes "Hal the healer will be waiting for the package, so hurry up and take it to him." ;
			next;
			mes "[Neighborhood Watchman Ario]";
			mes "Just walk northeast along the road to the town." ;
			mes "Just walk all the way." ;
			mes "It's an easy road, but be careful." ;
			next;
			mes "[Vigilante Ario]";
			mes "I'll be there later, don't worry, just go straight." ;
			next;
			cutin "do_su_020.bmp", 3;
			mes "^009eff[Information] Touch the warp link to go to another map." ;
			mes "You can move to the town of Lasagna by touching the warp link to the north of this map. ^000000";
			close2;
			viewpoint 1, 134, 381, 1, 0xFF0000;
			cutin "do_su_002.bmp", 255;
			end;
		case 24:
			mes "[Vigilante Ario]";
			mes "Did you make it to Midgard?" ;
			mes "There seems to be some problems at the port, but don't worry, you'll figure it out." ;
			close;
		default:
			mes "^ff0000[Information] You have left the tutorial in progress." ;
			mes "Would you like to return to the tutorial in progress? ^000000";
			next;
			if(select("Yes", "No") == 2) {
				mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
				close;
			}
			if(DORAM_1QUE <= 1)
				warp "do_tu01a.gat",29,281;
			else if(DORAM_1QUE <= 24)
				warp "do_tu01a.gat",60,320;
			else if(DORAM_1QUE <= 26)
				warp "do_tu02a.gat",224,124;
			else if(DORAM_1QUE <= 34)
				warp "do_tu02a.gat",235,196;
			else if(DORAM_1QUE <= 37)
				warp "do_tu02a.gat",203,322;
			else
				warp "do_tu05a.gat",26,62;
			end;
		}
	}
}
- shop lasagna_callshop -1,569:1,11518:1
do_tu01a.gat,52,323,4 script traveling peddler#do_tu01a 10163,{
	if(DORAM_1QUE < 18) {
		mes "[traveling peddler]";
		mes "I am a traveling peddler." ;
		mes "But I can't sell anything to you." ;
		mes "I'm only allowed to do business with people who have been given permission by the vigilante, Ario." ;
		mes "I'm sorry." ;
		close;
	}
	if(DORAM_1QUE >= 19) {
		mes "[Traveling peddler]";
		mes "A new continent. ......." ;
		mes "I wonder if I should join the vigilantes and cross the ocean too." ;
		next;
		mes "[Traveling peddler]";
		mes "Unfortunately, I'm out of potions right now." ;
		mes "I have nothing to sell." ;
		close;
	}
	if(countitem(569) >= 5 && countitem(11518) >= 5) {
		mes "[Traveling peddler]";
		mes "Looks like we already have more than 5 potions each, right?" ;
		mes "Go show them to Mr. Ario quickly." ;
		close;
	}
	mes "[Traveling peddler]";
	mes "You came here to buy potions, didn't you?" ;
	mes "Ario-san told me about you." ;
	next;
	if(Zeny == 0) {
		mes "[Traveling peddler]";
		mes "Kimi is ......." ;
		mes "You don't have any money." ;
		mes "In that case, sell the things you don't need first to make money and then buy them." ;
		next;
	}
	switch(select("buy", "sell")) {
	case 1:
		callshop "lasagna_callshop",1;
		close;
	case 2:
		callshop "lasagna_callshop",2;
		close;
	}
}

do_tu01a.gat,62,320,3 script youngest son of toolshop#do_tu01a 10167,{
	end;
OnTalk1:
	unittalk "The youngest son of a toolmaker : a...... Ariooooo!!!" ;
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu01a.gat,66,323,4 script traveling blacksmith#do_tu01a 10163,{
	if(DORAM_1QUE < 14) {
		mes "[Traveling blacksmith]";
		mes "I am a traveling blacksmith." ;
		mes "I'm a traveling blacksmith."; mes "I'm the remaining ghost, but I can't do any refining without Ario's permission." ;
		mes "Sorry." ;
		close;
	}
	if(DORAM_1QUE >= 15) {
		mes "[Traveling blacksmith]";
		mes "How are your reborn weapons?" ;
		close;
	}
	mes "[Traveling Blacksmith]";
	mes "I've heard from Ario's brother. Refining, right?" ;
	mes "Leave it to me." ;
	mes "Which ones are you going to refine?" ;
	next;
	switch(getequipid(4)) {
	case 26135:
		break;
	case 0:
		mes "[Traveling blacksmith]";
		mes "But first, equip the weapon you want to refine." ;
		mes "Otherwise, there's no way to refine it, man." ;
		close;
	default:
		mes "[Traveling blacksmith]";
		mes "Oops, that item can't be refined." ;
		mes "Equip yourself with the 'beginner's catnip'." ;
		close;
	}
	if(getequiprefinerycnt(4) >= 4) {
		mes "[Traveling blacksmith]";
		mes "Oops, that weapon is already refined." ;
		mes "I can only refine up to ^ff000000+4^000000 this time." ;
		next;
		mes "[Traveling blacksmith]";
		mes "From there, ask someone else to do it for you." ;
		mes "I'm refining it for you as a service, don't complain, okay?" ;
		close;
	}
	if(select("^nItemID^"+ getequipid(4), "quit") == 2) {
		mes "[Traveling blacksmith]";
		mes "Hmm?  Don't you want to refine?" ;
		close;
	}
	successrefitem 4;
	mes "[Traveling blacksmith]";
	mes "Sora yotto!" ;
	mes "How's it going?" ;
	mes "Good job, huh?" ;
	close;
}

do_tu02a.gat,150,54,0 warp warp warp01#do_tu02a 2,2,do_tu01a.gat,131,378
do_tu02a.gat,358,91,0 warp warp02#do_tu02a 2,2,do_tu04a.gat,20,98
do_tu02a.gat,205,327,0 script warp03#do_tu02a 45,2,2,{
	switch(DORAM_1QUE) {
	case 33:
		mes "-Talk to Doram, the sailor sitting nearby-";
		close;
	default:
		if(DORAM_1QUE > 34) {
			warp "do_tu05a.gat",55,61;
			end;
		}
		mes "^ff0000[Information] You have left the tutorial in progress." ;
		mes "Would you like to return to the tutorial in progress? ^000000";
		next;
		if(select("Yes", "No") == 2) {
			mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		end;
	}
}

do_tu02a.gat,153,58,0 script object01#do_tu02a 139,3,3,{
	if(DORAM_1QUE == 23) {
		mes "^009eff[Information] The quest window contains destinations and goals." ;
		mes "^ff0000The location of the healer Hal ^009eff is also written in the quest window, so go there! ^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff[Information] The quest window can be opened by left-clicking on the icon or by pressing ^ff000000<Alt>key+<U>key^009eff. ^000000";
		next;
		cutin "do_su_002.bmp", 255;
		mes "^009eff[Information] You can also zoom in and out of the map by using the "+" and "-" keys at the bottom of the map in the upper right corner of the screen." ;
		mes "Resize the map depending on the situation! ^000000";
		close2;
		viewpoint 1, 224, 126, 1, 0xFF0000;
		end;
	}
	end;
}

do_tu02a.gat,224,126,5 script healer hull#do_tu02a 10164,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him...","";
		end;
	}
	switch(DORAM_1QUE) {
	case 23:
		delquest 98413;
		getexp 87,1600;
		savepoint "do_tu02a.gat",224,123;
		set DORAM_1QUE,24;
		mes "^009eff[Information] Savepoint updated." ;
		mes "If you lose the battle, you will be revived at this location. ^000000";
		next;
	case 24:
		mes " tutorial<training> 12/12************************ and quest skills************************";
		next;
		switch(select("begin", "skip this tutorial", "skip all tutorials")) {
		case 1:
			break;
		case 2:
			getexp 103,1800;
			delitem 1081, 1;
			skill 142,1,0;
			setquest 98415;
			set DORAM_1QUE,25;
			mes "^ff0000[Information] All tutorials have been completed with the NPC you are currently speaking with." ;
			mes "Would you like to head to the next tutorial location? ^000000";
			next;
			switch(select("Warp to the next location", "Walk to the next location without warping", "Skip all tutorials")) {
			case 1:
				warp "do_tu02a.gat",235,196;
				close;
			case 2:
				close;
			}
		}
		emotion 20, "Healer Hal#do_tu02a";
		mes "[Healer Hal]";
		mes "It's about time you got your package: ......" ;
		mes "You're late. ......." ;
		next;
		mes "[Healer Hal]";
		mes "Huh?" ;
		mes "What's in that box?" ;
		cloakoffnpc "The youngest son of the toolmaker#do_tu02a";
		donpcevent "youngest son of toolmaker#do_tu02a::OnTalk1";
		next;
		mes "[Healer Hal]";
		mes "Oh, I've been waiting for you." ;
		mes "You've been awfully late today." ;
		mes "I hope you didn't stop off somewhere to play." ;
		next;
		mes "[Toolmaker's youngest son]";
		mes "I ...... No?  Not at all?" ;
		mes "No, not at all?" ;
		mes "This person was kind enough to carry this luggage for me because it looked heavy." ;
		next;
		mes "[Healer Hal]";
		mes "Was that so?" ;
		mes "Thank you for taking the trouble." ;
		next;
		mes "[Toolmaker's youngest son]";
		mes "Well, that's it for me then!" ;
		next;
		donpcevent "The youngest son of the toolmaker#do_tu02a::OnTalk2";
		cloakonnpc "youngest son of a toolmaker#do_tu02a";
		mes "[Healer Hal]";
		mes "Oh, he's already gone." ;
		mes "You're an impatient little boy, aren't you?" ;
		next;
		mes "[Healer Hal]";
		mes "Well, for the most part, I'm sure he lost his luggage somewhere and you found it and brought it back to him." ;
		mes "It happens all the time, so I'm used to it." ;
		next;
		mes "[Healer Hal]";
		mes "Hmmm ......." ;
		mes "Excuse me, but from the looks of it, you're still new to traveling." ;
		next;
		mes "[Healer Hal]";
		mes "As a thank you for bringing your luggage, let me teach you a useful skill for traveling: first aid." ;
		next;
		mes "^009eff[Information] Skills that can be learned by completing quests, rather than by gaining levels, are called quest skills. ^000000";
		next;
		mes "[Healer Hal]";
		mes "First Aid is a skill that consumes SP to recover your HP." ;
		next;
		mes "[Healer Hal]";
		mes "The amount you recover is small, but it will help you in times of need." ;
		mes "It's a good thing to remember." ;
		next;
		mes "[Healer Hal]";
		mes "Now, are you ready?" ;
		mes "Watch closely." ;
		next;
		mes "[Healer Hal]";
		mes "First up here ......." ;
		next;
		mes "[Healer Hal]"; mes "[Healer Hal]
		mes "Next down here ......" ;
		next;
		mes "[Healer Hal]";
		mes "Move it left and right twice ......" ;
		next;
		mes "[Therapist Hal]"; mes "[Therapist Hal]
		mes "Yes!" ;
		mes "Done!" ;
		misceffect 58,"";
		misceffect 234,"";
		skill 142,1,0;
		next;
		cutin "do_su_010.bmp", 3;
		mes "^009eff[Information] I learned the skill "First Aid"." ;
		mes "Open the skill window to confirm." ;
		mes "Quest skills can be learned without spending skill points. ^000000";
		next;
		cutin "do_su_010.bmp", 255;
		mes "[Healer Hal]";
		mes "This is only first aid, so if you are in danger, please use potions to recover." ;
		next;
		cloakoffnpc "Vigilante Ario#do_tu02a";
		donpcevent "Neighborhood Watchman Ario#do_tu02a::OnTalk1";
		mes "[Neighborhood watchman Ario]";
		mes "Oh, looks like you got your package delivered properly." ;
		next;
		mes "[Neighborhood Watchman Ario]"; mes "[Neighborhood Watchman Ario]"; mes "[Neighborhood Watchman Ario]
		mes "I've taught you everything you need to know about the adventure, and in this way, I was able to properly fulfill your delivery request." ;
		next;
		mes "[Neighborhood Watchman Ario]";
		mes "I guess this means I'm ready to take the initiation test now." ;
		mes "Well then, let's head over to the Commander." ;
		next;
		mes "^009eff [Information] Thanks for your help." ;
		mes "This is the end of the tutorial <Courses>. ^000000";
		next;
		mes "^009eff[Information] Next, we will begin the ^ff000000 tutorial <Practical Edition> ^009eff, which is similar to the actual quest." ;
		mes "Please use what you have learned in the previous tutorials to complete the quest! ^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff[Information] You have received the quest "Entrance Test"." ;
		mes "Open the quest window to check it out! ^000000";
		cloakonnpc "Vigilante Ario#do_tu02a";
		viewpoint 1, 235, 198, 1, 0xFF0000;
		getexp 103,1800;
		delitem 1081,1;
		setquest 98415;
		set DORAM_1QUE,25;
		cutin "do_su_002.bmp", 255;
		close;
	case 25:
		mes "[Healer Hal]";
		mes "If you see the Commander, please give him my regards." ;
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff[Information] You have received the quest "Test for joining the group"." ;
		mes "Open the quest window to check it out! ^000000";
		next;
		mes "^009eff[Information] The quest window can be opened by left-clicking on the icon or by pressing ^ff000000<Alt> key + <U> key ^009eff. ^000000";
		close2;
		cutin "do_su_002.bmp", 255;
		viewpoint 1, 235, 198, 1, 0xFF0000;
		end;
	case 26:
		mes "[Healer Hal]";
		mes "I see you've met the Commander." ;
		close;
	default:
		mes "^ff0000[Information] You have left the tutorial in progress." ;
		mes "Would you like to return to the tutorial in progress? ^000000";
		next;
		if(select("Yes", "No") == 2) {
			mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu02a.gat,226,124,3 script youngest son of toolmaker#do_tu02a 10167,{
	end;
OnTalk1:
	unittalk "The youngest son of a toolmaker : Oh, here we go!" ;
	end;
OnTalk2:
	OnTalk2: unittalk "The youngest son of the tool shop : Thank you for your service! ;
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu02a.gat,230,127,3 script Vigilante Ario#do_tu02a 10154,{
	end;
OnTalk1:
	unittalk "Neighborhood Watchman Ario : Looks like you just finished your business." ;
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu02a.gat,235,198,3 script Commander Peron#do_tu02a 10152,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-",""";
		end;
	}
	switch(DORAM_1QUE) {
	case 25:
		delquest 98415;
		getexp 121,2000;
		savepoint "do_tu02a.gat",235,196;
		set DORAM_1QUE,26;
		mes "^009eff[Information] Savepoint updated." ;
		mes "If you lose the battle, you will be revived at this location. ^000000";
		next;
	case 26:
		mes " Tutorial <Practical> 1/3 ************************ and entrance test ************************";
		next;
		switch(select("begin", "skip this tutorial", "skip all tutorials")) {
		case 1:
			break;
		case 2:
			setquest 98416;
			delquest 98416;
			getexp 140,2200;
			setquest 98417;
			delquest 98417;
			getexp 157,2400;
			setquest 98418;
			delquest 98418;
			getexp 177,2600;
			setquest 98419;
			delquest 98419;
			getexp 214,2800;
			getexp 239,3000;
			viewpoint 1, 203, 324, 1, 0xFF0000;
			setquest 98421;
			set DORAM_1QUE,33;
			getitem 25046,1; // boarding permit
			getitem 15273,1; // white t-shirt
			getitem 22183,1; // wooden slippers
			mes "^ff0000[Information] You have completed all tutorials with the NPCs you are currently speaking with." ;
			mes "Would you like to head to the next tutorial location? ^000000";
			next;
			switch(select("Warp to the next location", "Walk to the next location without warping", "Skip all tutorials")) {
			case 1:
				warp "do_tu02a.gat",205,323;
				close;
			case 2:
				close;
			}
		}
	case 27:
		mes "[Commander Peron]";
		mes "Go to the Rabiolu Forest ^000000 at the southeast exit of the town ^ff000000." ;
		next;
		mes "[Commander Peron]";
		mes "Then look for a ^ff000000 large spiked branch^000000 east-northeast of the forest and get one of those branches." ;
		mes "If you do so, you will pass the test." ;
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff [Information] Quest received." ;
		mes "Open the quest window to confirm! ^000000";
		next;
		cutin "do_su_003.bmp", 3;
		mes "^009eff[Information] The location of the big spiky branch is written in the quest window." ;
		mes "First, go outside from the southeast side of town to Rabiolu Forest. ^000000";
		next;
		cutin "do_su_028.bmp", 3;
		mes "^009eff[Information] Rabiolu Forest is located in MAP^009eff next to ^ff000000 the town of Lasagna." ;
		mes "You can find out the name of the map you are in by typing ^ff0000 "/where"^009eff in the chat window. ^000000";
		next;
		cutin "do_su_002.bmp", 255;
		mes "[Commander Peron]";
		mes "There are aggressive monsters in Rabiolu Forest." ;
		mes "Please be careful enough." ;
		next;
		mes "[Commander Peron]";
		mes "If you have difficulty going alone, you may want to form a ^ff000000 party^000000 with other friends." ;
		next;
		mes "[Commander Peron]";
		mes "It is not a cunning thing." ;
		mes "It is part of your ability to gather friends." ;
		next;
		cutin "do_su_021.bmp", 3;
		mes "The ^009eff [Information] party window can be opened by left-clicking on the icon or by ^ff0000<Alt>key+<Z>key^009eff." ;
		mes "Once opened, you can create a party by clicking on "Create Party"! ^000000";
		next;
		cutin "do_su_022.bmp", 3;
		mes "^009eff[Information] Once you have named your party and created a party, you can right-click on another player to "Request to Join Party". ^000000";
		next;
		mes "^009eff[Information] If the other player approves your party request, you can join the party." ;
		mes "Invite your friends to join your party! ^000000";
		close2;
		viewpoint 1, 358, 91, 1, 0xFF0000;
		cutin "do_su_002.bmp", 255;
		end;
	case 28:
		emotion 21;
		mes "[Commander Peron]";
		mes "You brought the branch back safely." ;
		mes "Well done." ;
		next;
		delquest 98416;
		getexp 140,2200;
		set DORAM_1QUE,29;
		mes "[Commander Peron]";
		mes "Then take that branch and follow me." ;
		mes "The following test will be performed." ;
		close2;
		setquest 98417;
		warp "do_tu03a.gat",61,94;
		end;
	case 29:
	case 30:
	case 31:
		close;
	case 32:
		if(checkquest(98419)) {
			delquest 98419;
			getexp 214,2800;
		}
		mes "[Commander Peron]";
		mes "Thank you for your hard work." ;
		mes "This is the end of the test." ;
		next;
		mes "[Commander Peron]";
		mes "The ability to go deep into the Rabbior Forest and get a branch." ;
		next;
		mes "[Commander Peron]";
		mes "The brains and insight that led him to find a way to extract information from the Basilisk, who had kept his mouth shut." ;
		next;
		mes "[Commander Peron]";
		mes "I have found that both of them are excellent." ;
		mes "You are the right person for the Farfalle Vigilante." ;
		next;
		emotion 46,"";
		mes "[Commander Peron]";
		mes "Let us admit you into our ranks." ;
		mes "Congratulations." ;
		next;
		mes "[Commander Peron]";
		mes "Now, you wanted to go to the new continent." ;
		next;
		mes "[Commander Peron]";
		mes "If you take this boarding pass to a ship docked in a northern port, they will take you." ;
		mes "Please go there as soon as possible." ;
		next;
		mes "[Commander Peron]";
		mes "fufu ......" ;
		mes "When I was young, I used to go on adventures and breath that I was going to accomplish something big." ;
		next;
		mes "[Commander Peron]";
		mes "But ......" ;
		mes "I had too many things to protect." ;
		next;
		mes "[Commander Peron]";
		mes "Well, I was too seasick to go on an adventure." ;
		mes "Hahahaha." ;
		close2;
		set DORAM_1QUE,33;
		getitem 25046,1; // boarding pass
		getitem 15273,1; // white t-shirt
		getitem 22183,1; // wooden slippers
		cutin "do_su_002.bmp", 255;
		getexp 239,3000;
		viewpoint 1, 203, 324, 1, 0xFF0000;
		setquest 98421;
		end;
	case 33:
		mes "[Commander Peron]";
		mes "Take this boarding pass to a ship docked in the northern harbor and they will take you aboard." ;
		mes "Please go there as soon as possible." ;
		close2;
		viewpoint 1, 203, 324, 1, 0xFF0000;
		end;
	default:
		mes "^ff0000[Information] You have left the tutorial in progress." ;
		mes "Would you like to return to the tutorial in progress? ^000000";
		next;
		if(select("Yes", "No") == 2) {
			mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu02a.gat,203,324,5 script eglin#do_tu02a 10157,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-","";
		end;
	}
	switch(DORAM_1QUE) {
	case 33:
		delquest 98421;
		getexp 267,3200;
		savepoint "do_tu02a.gat",235,196;
		set DORAM_1QUE,34;
		mes "^009eff[Information] Savepoint updated." ;
		mes "If you lose the battle, you will be revived at this location. ^000000";
		next;
	case 34:
		mes " Tutorial <Practical> 2/3 ************************ and request for sailors ************************";
		next;
		switch(select("begin", "skip this tutorial", "skip all tutorials")) {
		case 1:
			break;
		case 2:
			setquest 98422;
			delquest 98422;
			getexp 298,3400;
			getexp 332,3600;
			setquest 98424;
			set DORAM_1QUE,36;
			mes "^ff0000[Information] All tutorials have been completed with the NPC you are currently speaking with." ;
			mes "Would you like to head to the next tutorial location? ^000000";
			next;
			switch(select("Warp to the next location", "Walk to the next location without warping", "Skip all tutorials")) {
			case 1:
				warp "do_tu05a.gat",26,62;
				close;
			case 2:
				close;
			}
		}
		EMOTION 45;
		mes "[Egglin]";
		mes "Would you like to come aboard?" ;
		mes "Show me your ticket." ;
		next;
		mes "[Egglin]";
		mes "Adventurer?  First time on a ship?" ;
		mes "I expect you to live up to the name of the Doram tribe in the new continent." ;
		mes "Good luck." ;
		next;
		mes "[Egglin]";
		mes "Oh, yeah." ;
		mes "While we're going in, I have some cooking ingredients I'd like you to give to the head chef in the back dining room. Do you mind?" ;
		next;
		menu "Yes.",-;
		mes "[Egglyn]";
		mes "Thanks." ;
		mes "I just have a little Attention when I give it to you." ;
		next;
		menu "Attention?",-;
		mes "[Egglin]";
		mes "Yeah." ;
		mes "The head chef is an eccentric, so if I gave it to him normally, he wouldn't accept it." ;
		mes "So now you're going to do exactly what I say. Okay?" ;
		next;
		mes "[Egglyn]";
		mes "Throw the cooking ingredients I give you at the chef's chest and say ^0000cd "We got a super big new guy here!" I say ^000000." ;
		next;
		mes "[Egglin]";
		mes "They say that if Doram, who is getting on a boat for the first time, does that, the voyage will go well." ;
		mes "It's that kind of ^000000ff spell^000000." ;
		mes "The chef also believes it is a brave act." ;
		next;
		getitem 25047,1; // Carniac
		set DORAM_1QUE,35;
		emotion 12, "Egglyn#do_tu02a";
		mes "[Egglyn]";
		mes "Did you get it?" ;
		mes "Take care of it then!" ;
		setquest 98422;
		next;
		mes "^009eff [Information] I have received the quest "Sailor's Request"." ;
		mes "Open the quest window to confirm! ^000000";
		close;
	case 35:
		mes "[Egglyn]";
		mes "Throw the cooking ingredients I gave you at the chef's chest and say ^000000cd "We got a very big new guy here!" I say ^000000." ;
		next;
		mes "[Egglin]";
		mes "They say that if Doram, who is getting on a boat for the first time, does that, the voyage will go well." ;
		mes "It's a spell like that." ;
		mes "The chef also believes it is a brave act." ;
		next;
		emotion 12;
		mes "[Egglin]";
		mes "Do you understand?" ;
		mes "Then take care of it!" ;
		close;
	case 36:
		mes "[Egglyn]";
		mes "What!  I really did it!" ;
		mes "I was just kidding!" ;
		mes "Hahahahaha!" ;
		mes "So?  How did it go?" ;
		mes "How did you survive?" ;
		next;
		mes "[Egglyn]";
		mes "What?" ;
		mes "The head chef can-can?" ;
		next;
		mes "[Egglyn]";
		mes "...... What should we do?" ;
		close;
	default:
		mes "^ff0000[Information] I left the tutorial in progress." ;
		mes "Would you like to return to the tutorial in progress? ^000000";
		next;
		if(select("Yes", "No") == 2) {
			mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu03a.gat,59,90,5 script Commander Peron#do_tu03e 10152,{
	switch(DORAM_1QUE) {
	case 29:
		if(checkquest(98417)) {
			delquest 98417;
			getexp 157,2400;
		}
		mes "[????]" ;
		mes "......." ;
		next;
		mes "-Something is peeking out of the jar-";
		next;
		mes "[Commander Peron]";
		mes "You may have seen this guy in the Rabbior Forest, but he is a basilisk and lives a little ways from the city of Lasagna." ;
		next;
		mes "[Commander Peron]";
		mes "Nothing has ever happened to him before, but recently he has suddenly started causing problems around Lasagna, and it has become a source of trouble." ;
		next;
		mes "[Commander Peron]";
		mes "This guy was trying to get into the city yesterday and was about to go on a rampage, so we caught him ourselves. ......" ;
		mes "As you can see, he doesn't speak." ;
		next;
		mes "[Commander Peron]";
		mes "So, I will use the spiked branch that you fetched for me." ;
		mes "First, please give that branch to Jindo." ;
		close2;
		setquest 98418;
		set DORAM_1QUE,30;
		end;
	case 30:
		mes "[Commander Peron]";
		mes "First, give that branch to Jindo." ;
		close;
	case 31:
		mes "[Commander Peron]";
		mes "Now, use that whistle to break the Basilisk's mouth." ;
		next;
		mes "-Use the whistle of the spike: ...... -";
		next;
		if(select("blow", "hit") == 2) {
			mes "-Boko! -";
			misceffect 1, "Basilisk captive#do_tu0";
			next;
			mes "[Basilisk captive]";
			mes "Guhah!" ;
			next;
			emotion 23;
			mes "[Commander Peron]";
			mes "Hey, hey!" ;
			mes "What are you doing!" ;
			mes "Don't be so rough!" ;
			close;
		}
		mes "-peep-peep-";
		next;
		mes "[captive basilisk]";
		mes "Shhhh!" ;
		next;
		mes "-Basilisk began to threaten in response to the sound of the whistle-"; mes "[Basilisk in captivity]"; mes "[Basilisk in captivity]
		next;
		mes "-with the whistle of the spike: ...... -";
		next;
		switch(select("play", "blow", "sting")) {
		case 1:
			break;
		case 2:
			mes "-peep-peep-";
			next;
			mes "[captive basilisk]";
			mes "Shhhh!" ;
			next;
			mes "-Basilisk remains menacing-";
			close;
		case 3:
			mes "-Gusa! -";
			misceffect 4, "Basilisk captive#do_tu0";
			next;
			mes "[Basilisk captive]";
			mes "-it!" ;
			next;
			emotion 23;
			mes "[Commander Peron]";
			mes "Hey, hey!" ;
			mes "What are you doing!" ;
			mes "Don't be so rough!" ;
			close;
		}
		mes "-poo-poo-pee-pee-pee♪-"; mes "-poo-poo-pee-pee-pee♪-";
		next;
		mes "[captive basilisk]";
		mes "Shah!!! Sha-sha-sha!!!" ;
		next;
		mes "-The basilisk's head came out of the jar little by little-"; mes "-The basilisk's head came out of the jar little by little-";
		next;
		mes "-with the whistle of a spike: ...... -";
		next;
		if(select("play more", "tap") == 2) {
			mes "-Bang! -";
			misceffect 3, "Basilisk captive#do_tu0";
			next;
			mes "[captive basilisk]";
			mes "Auch!" ;
			next;
			emotion 23;
			mes "[Commander Peron]";
			mes "Hey, hey!" ;
			mes "What are you doing!" ;
			mes "Don't be so rough!" ;
			close;
		}
		mes "-peep-peep-peep♪-"; mes "-peep-peep-peep♪-";
		next;
		mes "-Basilisk began to wiggle his body from side to side as he played-";
		next;
		mes "[captive basilisk]";
		mes "Or, my body is going to ...... on its own!" ;
		next;
		mes "[POW's Basilisk]"; mes "[POW's Basilisk]"; mes "[POW's Basilisk]
		mes "I don't know anything!" ;
		mes "I was never ordered by the king or anything like that!" ;
		next;
		mes "-with the spike whistle: ...... -";
		next;
		if(select("keep playing", "slash") == 2) {
			mes "-Zak! -";
			misceffect 565, "Basilisk captive#do_tu0";
			next;
			mes "[Basilisk captive]";
			mes "Guff!" ;
			next;
			emotion 23;
			mes "[Commander Peron]";
			mes "Hey, hey!" ;
			mes "What are you doing!" ;
			mes "Don't be so rough!" ;
			close;
		}
		
		next;
		mes "-Basilisk began shaking his head and twisting his body violently as he played-";
		next;
		mes "[captive basilisk]";
		mes "I'll never tell!" ;
		mes "I'll never tell you that that guy who lives in that cave is what I'm after!" ;
		next;
		emotion 21;
		mes "[Commander Peron]";
		mes "That's enough!" ;
		mes "That's enough." ;
		mes "Well done!" ;
		next;
		mes "[Commander Peron]";
		mes "When Basilisk hears that flute playing, his body starts dancing on its own and talking about everything." ;
		next;
		mes "[Commander Peron]";
		mes "Then, Jindo, please do the rest." ;
		next;
		mes "[Jindo]";
		mes "I understand." ;
		mes "We will take care of the whistle." ;
		next;
		mes "[Commander Peron]";
		mes "You have passed the entrance test." ;
		mes "Then let's go back." ;
		close2;
		delitem 25043, 1;
		delquest 98418;
		getexp 177,2600;
		setquest 98419;
		set DORAM_1QUE,32;
		warp "do_tu02a.gat",235,196;
		end;
	default:
		mes "^ff0000[Information] You have left the tutorial in progress." ;
		mes "Would you like to return to the tutorial in progress? ^000000";
		next;
		if(select("Yes", "No") == 2) {
			mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu03a.gat,64,92,3 script gindow#do_tu03e 10159,{
	if(DORAM_1QUE == 30) {
		delitem 25044, 1;
		getitem 25043, 1;
		set DORAM_1QUE,31;
		mes "[Jindo]";
		mes "That's a great spike." ;
		mes "This spike like this: ......" ;
		mes "Now, it's done." ;
		next;
		mes "[Jindo]";
		mes "With this whistle, Basilisk will not be able to stop talking." ;
		close;
	}
	else if(DORAM_1QUE == 31) {
		mes "[Jindo]";
		mes "With this whistle, Basilisk will not be able to stop talking." ;
		close;
	}
	mes "[Jindo]";
	mes "Hmmm ......." ;
	close;
}

do_tu03a.gat,61,91,5 script basilisk captive#do_tu0 10158,{
	emotion 9;
	mes "[Basilisk POW]";
	mes "......." ;
	close;
}

do_tu04a.gat,16,98,0 warp warp01#do_tu04a 2,2,do_tu02a.gat,355,92
do_tu04a.gat,348,244,0 script warp02#do_tu04a 45,2,2,{
	if(DORAM_1QUE < 38) {
		mes "-something seems dangerous." ;
		mes " Let's not go ahead just yet-";
		close;
	}
	warp "do_tu06a.gat",24,143;
	end;
}

do_tu04a.gat,20,98,0 script object01#do_tu04a 139,3,3,{
	if(DORAM_1QUE == 27) {
		mes "^009eff[Information] The quest window contains destinations and goals." ;
		mes "^ff0000Location of the big spiky branch ^009eff is also written in the quest window, so go there! ^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff[Information] The quest window can be opened by left-clicking on the icon or by pressing ^ff000000<Alt>key+<U>key^009eff. ^000000";
		close2;
		viewpoint 1, 340, 251, 1, 0xFF0000;
		cutin "do_su_001.bmp", 255;
		end;
	}
	end;
}

do_tu04a.gat,340,251,3 script big spiky branch#do 111,{
	if(DORAM_1QUE == 27) {
		getitem 25044,1;
		set DORAM_1QUE,28;
		misceffect 5;
		mes "-I got a branch with big spikes on it." ;
		mes "Let's go back to Commander Peron-";
		next;
		if(select("return", "not return") == 2) {
			mes "-Let's stay here a little longer-";
			close;
		}
		warp "do_tu02a.gat",235,196;
		end;
	}
	else if(DORAM_1QUE == 28) {
		mes "-Let's go back to Commander Peron-";
		next;
		if(select("return", "not return") == 2) {
			mes "-Let's stay here a little longer-";
			close;
		}
		warp "do_tu02a.gat",235,196;
		end;
	}
	mes "-It's a branch with big spikes." ;
	mes "Be careful not to hurt yourself-";
	close;
OnInit:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6;
	end;
}

do_tu05a.gat,59,62,0 warp warp01#do_tu05a 2,2,do_tu02a.gat,205,324
do_tu05a.gat,50,60,0 script warp02#do_tu05a 45,2,2,{
	if(DORAM_1QUE <= 35) {
		mes "-"Captain's office"." ;
		mes " Let's go to the mess hall first-";
		close;
	}
	warp "do_tu05a.gat",30,60;
	end;
}

do_tu05a.gat,36,60,0 warp warp warp03#do_tu05a 2,2,do_tu05a.gat,54,60
do_tu05a.gat,143,60,0 warp warp04#do_tu05a 2,2,do_tu05a.gat,165,60
do_tu05a.gat,159,60,0 warp warp05#do_tu05a 2,2,do_tu05a.gat,138,60
do_tu05a.gat,186,57,3 script cook length#do_tu05a 548,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-","";
		end;
	}
	switch(DORAM_1QUE) {
	case 35:
		if(checkquest(98422)) {
			delquest 98422;
			getexp 298,3400;
		}
		mes "[chef]";
		mes "What?" ;
		mes "I'm busy right now, you can do that later." ;
		next;
		menu "We got a very big new guy here!" ,-;
		misceffect 1, "chef#do_tu05a";
		emotion 9, "Chef de Cuisine#do_tu05a";
		emotion 23, "Deck Chief#do_tu05a";
		emotion 23, "Quartermaster#do_tu05a";
		mes "[Head cook]";
		mes "......." ;
		next;
		mes "[head chef]";
		mes "Hou ...... You ......." ;
		mes "You seem to be very confident in your skills." ;
		mes "Good!" ;
		mes "I'm a fighter who buys the fights I'm sold on!" ;
		mes "Take up arms!" ;
		next;
		emotion 4, "Deck Commander#do_tu05a";
		mes "[deck captain]";
		mes "Hey, hey, hey, hey, seriously?" ;
		next;
		emotion 16, "Quartermaster#do_tu05a";
		mes "[Helmsman]";
		mes "He's going to die, that guy." ;
		next;
		emotion 29, "chef#do_tu05a";
		mes "[head chef]";
		mes "Nice nerve for a young guy to try to take the head chef's place!" ;
		mes "He's going to make me rust this knife!" ;
		next;
		menu "I didn't mean it ......" ,-;
		mes "[Chef]";
		mes "You're scared to death at this stage!" ;
		mes "Where's your bravado from a few minutes ago!" ;
		next;
		emotion 0, "Deck Commander#do_tu05a";
		mes "[deck captain]";
		mes "...... Huh?" ;
		next;
		mes "[Deck Captain]";
		mes "Could that guy have thrown ......?" ;
		next;
		mes "[Deck Captain]";
		mes "I knew it." ;
		mes "Isn't this the Carniac the chef ordered?" ;
		next;
		emotion 0, "chef#do_tu05a";
		mes "[Chef]";
		mes "What ......?" ;
		next;
		mes "[Head chef]";
		mes "...... Indeed it is." ;
		mes "Why do you, the new guy, have this?" ;
		next;
		mes "-you told me about the Doram you met outside the ship-";
		next;
		emotion 36, "Chef#do_tu05a";
		mes "[The head chef]";
		mes "That guy again!" ;
		mes "Not only does he use the new guy as an errand boy, he also pulls pranks like this!" ;
		mes "That's why they'll always call you Egglyn!" ;
		next;
		mes "[Chef]";
		mes "I'm sorry I startled you." ;
		mes "It seems it was a prank by one of our sailors." ;
		next;
		mes "[Chef]";
		mes "I feel bad for you." ;
		mes "I apologize on his behalf." ;
		next;
		mes "[Chef]";
		mes "I'm going to make him apologize on my behalf later." ;
		mes "He's always causing trouble, and he'll always be half a problem child." ;
		next;
		emotion 15, "chef#do_tu05a";
		mes "[Chef]";
		mes "Thanks for delivering the ingredients, man." ;
		mes "If you're the captain, he's in the captain's office just inside the ship, so go say hi to him quickly." ;
		close2;
		delitem 25047, 1;
		set DORAM_1QUE,36;
		getexp 332,3600;
		setquest 98424;
		end;
	case 36:
		mes "[Chef]";
		mes "Thanks for delivering the ingredients, man." ;
		mes "If you're the captain, he's in the captain's office just inside the ship, so go say hello to him quickly." ;
		close;
	default:
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu05a.gat,122,61,5 script sailor#do_tu05a_01 559,{
	mes "[Sailor]";
	mes "Is this your first time on a new continent?" ;
	mes "How does it feel to go somewhere you've never been and never seen?" ;
	next;
	mes "[Sailor]";
	mes "Doesn't it thrill you?" ;
	mes "I couldn't sleep the first time either." ;
	mes "I still feel that way when I go to a new continent." ;
	close;
}

do_tu05a.gat,169,70,3 script sailor#do_tu05a_02 545,{
	mes "[Sailor]";
	mes "Midgard has been found, but are there others?" ;
	mes "Places not even on the map." ;
	mes "Places we haven't even been to yet." ;
	mes "";
	close;
}

do_tu05a.gat,166,68,6 script sailor#do_tu05a_03 544,{
	mes "[Sailor]";
	mes "I have a feeling that first mate Stelroe will find another route to a new continent that's not even on the map." ;
	next;
	mes "[Sailor]";
	mes "I have to stay on this ship as long as possible to see the moment of discovery with my own eyes." ;
	close;
}

do_tu05a.gat,181,61,5 script deck captain#do_tu05a 421,{
	mes "[deck chief]";
	mes "The head chef here, he's got a scary face, but he's a good cook." ;
	close;
}

do_tu05a.gat,181,58,3 script Quartermaster#do_tu05a 561,{
	mes "[helmsman]";
	mes "Eglin's do." ;
	mes "You're slacking off again." ;
	close;
}

do_tu05a.gat,26,64,5 script Captain Gumberry#do_tu05a 10153,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-","";
		end;
	}
	switch(DORAM_1QUE) {
	case 36:
		delquest 98424;
		getexp 389,3800;
		savepoint "do_tu05a.gat",26,62;
		set DORAM_1QUE,37;
		mes "^009eff[Information] Savepoint updated." ;
		mes "If you lose the battle, you will be revived at this location. ^000000";
		next;
	case 37:
		mes " Tutorial <Practical> 3/3************************ and the first job of a new vigilante ************************";
		next;
		switch(select("Begin", "Skip this tutorial", "Skip all tutorials")) {
		case 1:
			break;
		case 2:
			getitem 569, 50;
			delitem 25046, 1;
			setquest 98425;
			delquest 98425;
			getexp 430,4000;
			setquest 98426;
			delquest 98426;
			getexp 475,6000;
			setquest 98427;
			delquest 98427;
			getexp 524,8000;
			setquest 98428;
			delquest 98428;
			getexp 577,10000;
			getitem 19330, 1;
			getitem 28576, 1;
			getitem 15274, 1;
			getitem 22184, 1;
			getitem 12324, 1;
			setquest 98429;
			delquest 98429;
			getexp 0,25000;
			set DORAM_1QUE,100;
			savepoint "lasagna.gat",299,239;
			mes "^009eff[Information] Thanks for your help." ;
			mes "All tutorials have been completed." ;
			mes "After this, we will move on to the port town of Lasagna. ^000000";
			next;
			mes "^009eff[Information] In the beginning, it is recommended to play the quests that can be received from the vigilante Orio (coordinates: 323,229) in the port town Lasagna. ^000000";
			next;
			mes "^009eff[Information] Then enjoy the world of Ragnarok Online! ^000000";
			close2;
			warp "lasagna.gat",298,238;
			end;
		}
		mes "[Captain Gumberry]";
		mes "Who is it?" ;
		mes "This place is off limits to all concerned." ;
		mes "Get the hell out of here." ;
		next;
		menu "I'll give you a boarding pass.",-;
		emotion 33;
		mes "[Captain Gumberry]";
		mes "You're a new adventurer." ;
		mes "I am the captain^0000cd Gumberry^000000 of this ship, and he next to me is first mate Stelroe." ;
		mes "Let me welcome you." ;
		next;
		menu "When does the ship sail?" ,-;
		mes "[Captain Gumberry]";
		mes "Is the ship sailing or ...... That's the thing, but I'm having a little trouble with it." ;
		mes "Look out there." ;
		next;
		mes "-I looked out the window toward the offshore area and saw a thick plume of smoke -";
		next;
		mes "[Stelroe]";
		mes "With this smoke, it is impossible to make a proper voyage." ;
		mes "We can't launch the ship until the visibility clears." ;
		mes "And this is probably ......." ;
		next;
		mes "[Captain Gumberry]";
		mes "Yeah, that's probably him." ;
		next;
		menu "That guy?" ,-;
		mes "[Captain Gumberry]";
		mes "It's a ^000000ff dragon ^000000 who lives in a cave deep in the Ravior Forest." ;
		mes "The fire that that guy breathes out burns around him and makes that smoke." ;
		next;
		mes "[Captain Gumberry]";
		mes "He's usually quiet, so it's nothing to worry about, but I'm sure there's some kind of problem going on right now." ;
		next;
		mes "[Captain Gumberry]";
		mes "I don't think this smoke will clear until that problem is resolved." ;
		next;
		mes "[Stelroe]";
		mes "And I don't have a crew available right now." ;
		mes "We can't go check on the dragon, we're just going to have to sit and wait for the smoke to clear." ;
		next;
		menu "Shall I go myself?" ,-;
		mes "[Captain Gumberry]";
		mes "Really?!" ;
		mes "That would be helpful." ;
		next;
		mes "[Captain Gumberry]";
		mes "The dragons are located ^ff000000northeast of Rabiolu Forest, deep in a cave called "Dragon's Nest" ^000000." ;
		next;
		mes "[Captain Gumberry]";
		mes "Basilisk has been running rampant in that area lately, so Attention." ;
		mes "You're going to get hurt if you don't have some competence." ;
		next;
		mes "[Captain Gumberry]";
		mes "Are you growing your stats or learning skills?" ;
		mes "The skills 'bite' and 'scratch' are also useful against basilisks." ;
		next;
		cutin "do_su_009.bmp", 3;
		mes "[Captain Gumberry]";
		mes "If you want to increase the power of 'Bite' and 'Scratch', increase the status 'Str'." ;
		mes "You'll get a boost in attack power, which will give you an edge in the fight." ;
		next;
		cutin "do_su_002.bmp", 255;
		mes "[Captain Gumberry]";
		mes "If you want to redo your status assignments, tell ^ff000000 Stelroe ^000000." ;
		mes "Only this time, he will reset your status specially." ;
		next;
		mes "[Captain Gumberry]";
		mes "^0000ffThere should be a vigilante just inside the cave. ^000000 First check with him to see what the status of the dragon is." ;
		next;
		mes "[Captain Gumberry]";
		mes "And if necessary, work with him to stop the flames that the dragon spits out." ;
		next;
		mes "[Captain Gumberry]";
		mes "The entrance to the dragon's lair can be reached at ......." ;
		mes "^ff000000 Stelroe ^000000, can you lead the way?" ;
		next;
		emotion 33, "Stelroe#do_tu05a";
		mes "[Stelroe]";
		mes "Roger that, Captain." ;
		next;
		mes "[Stelroe]";
		mes "That's what I mean." ;
		mes "Give me a shout when you're ready." ;
		next;
		mes "[Captain Gumberry]";
		mes "This is the first real battle for a new adventurer who has completed his training." ;
		mes "Keep your heads up and go." ;
		next;
		mes "[Captain Gumberry]";
		mes "I'll give you this." ;
		mes "Use it if you're in danger." ;
		mes "[Captain Gumberry]"; mes "Then I'm counting on you." ;
		next;
		set DORAM_1QUE,38;
		getitem 569, 50;
		delitem 25046, 1;
		setquest 98425;
		mes "^009eff-received beginner's potion from Captain Gumberry-^000000";
		next;
		mes "^009eff[Information] You have received the quest "New Adventurer's First Job"." ;
		mes "Open the quest window to check it out! ^000000";
		close;
	case 38:
	case 39:
	case 40:
	case 41:
		mes "[Captain Gumberry]";
		mes "The dragon is at ^ff000000 the back of the cave ^000000 northeast of Rabiolu Forest." ;
		mes "Basilisk has been running rampant in that area recently, so Attention." ;
		next;
		mes "[Captain Gumberry]";
		mes "^0000ffThere should be a vigilante just inside the cave. ^000000 First check with him to see what the status of the dragon is." ;
		next;
		mes "[Captain Gumberry]";
		mes "I'll have Stelroe take you to the entrance of the cave." ;
		mes "You can leave when you're ready." ;
		next;
		mes "[Stelroe]";
		mes "That's what I mean." ;
		mes "Give me a shout when you're ready." ;
		close;
	case 42:
		cloakoffnpc "Deck Officer#do_tu05a_2";
		cloakoffnpc "helmsman#do_tu05a_2";
		cloakoffnpc "Stelroe#do_tu05a";
		mes "[Captain Gumberry]";
		mes "Oh, you're safe." ;
		mes "I was just about to send someone out to check on you because you didn't come back very well." ;
		next;
		mes "[Captain Gumberry]";
		mes "So, how did it go?" ;
		mes "Did you solve the problem?" ;
		next;
		menu "Tartuffe has regained his composure.",-;
		mes "[Captain Gumberry]";
		mes "Well, Tartuffe was on a rampage because of Basilisk. ......." ;
		next;
		mes "[Captain Gumberry]";
		mes "But if you're right, the smoke should clear in a little while. ......." ;
		next;
		emotion 0, "Stelroe#do_tu05a";
		mes "[Stelroe]";
		mes "Captain!" ;
		mes "Look out!" ;
		next;
		mes "[Captain Gumberry]";
		mes "Oh Oh ......" ;
		mes "The smoke is ......." ;
		next;
		mes "-The thick smoke that had filled the offshore area faded away. ......" ;
		musiceffect "149";
		mes " -the bright blue sea and the horizon came into view-"; next; mes "-the blue sea and the horizon came into view-";
		next;
		mes "[Captain Gumberry]";
		mes "......" ;
		mes "...... I can't do this." ;
		next;
		emotion 27, "Captain Gumberry#do_tu05a";
		mes "[Captain Gumberry]";
		mes "Stelroe!  Communicate to all personnel!" ;
		mes "Prepare to set sail!" ;
		next;
		emotion 21, "Stelroe#do_tu05a";
		mes "[Stelroe]";
		mes "Roger!" ;
		next;
		mes "[Stelroe]";
		mes "Communicate to all personnel!" ;
		mes "The smoke has cleared offshore!" ;
		mes "Prepare to launch immediately!" ;
		next;
		emotion 27, "Stelroe#do_tu05a";
		mes "[Stelroe]";
		mes "Quartermaster and Deck Officer!" ;
		mes "Don't keep selling oil, get back to your stations!" ;
		next;
		emotion 29, "Deck Officer#do_tu05a_2";
		mes "[Deck Captain]";
		mes "Hey hey hey!" ;
		next;
		emotion 32, "Quartermaster#do_tu05a_2";
		mes "[helmsman]";
		mes "Damn, I've been waiting for this!" ;
		next;
		mes "[Captain Gumberry]";
		mes "Now we're going to get busy." ;
		mes "We're going to make up for all the delays we've had!" ;
		next;
		misceffect 119, "Captain Gumberry#do_tu05a";
		mes "[Captain Gumberry]";
		mes "You guys!" ;
		mes "Get fired up and get to it!" ;
		donpcevent "Stelroe#do_tu05a::OnTalk1";
		donpcevent "Deck Chief#do_tu05a::OnTalk1";
		donpcevent "helmsman#do_tu05a::OnTalk1";
		cloakonnpc "Stelroe#do_tu05a";
		cloakonnpc "Deck Chief#do_tu05a_2"; cloakonnpc "Deck Chief#do_tu05a_2";
		cloakonnpc "helmsman#do_tu05a_2";
		next;
		menu "Are we finally sailing?" ,-;
		mes "[Captain Gumberry]";
		mes "Yes, but it will be a little while before we sail." ;
		mes "You may come back to town once while you still can and get yourself ready." ;
		next;
		emotion 29, "Captain Gumberry#do_tu05a";
		mes "[Captain Gumberry]";
		mes "ffff......" ;
		mes "I'm a little hot off the boat after all these years." ;
		next;
		mes "[Captain Gumberry]";
		mes "It's thanks to you calming Tartuffe that we are able to sail safely like this." ;
		mes "Thank you." ;
		next;
		mes "[Captain Gumberry]";
		mes "That courage and ability of yours, very hard to believe you are a new adventurer." ;
		mes "It seems that it is not a lie to say that you are a very big newcomer." ;
		next;
		menu "That's what Egglin is ......" ,-;
		emotion 18, "Captain Gumberry#do_tu05a";
		mes "[Captain Gumberry]";
		mes "Ha ha ha!" ;
		mes "Well, don't be so modest." ;
		mes "In fact, you've done just that." ;
		next;
		mes "[Captain Gumberry]";
		mes "Oops, that's right, I had something I was keeping from that Peron guy." ;
		next;
		mes "-gosso-"; mes "-gosso-"; mes "-gosso-"; mes "-gosso-
		next;
		mes "[Captain Gumberry]";
		mes "This is the hat given to a full-fledged Farfalle vigilante." ;
		mes "Only when you can wear this can you say you've become a true vigilante." ;
		next;
		mes "[Captain Gumberry]";
		mes "It's something I've been asked to give to the new vigilante coming on board this ship when the time is right. ......" ;
		mes "I never thought the time would come so soon." ;
		next;
		mes "[Captain Gumberry]";
		mes "Now, when you get this, go back to town and get ready." ;
		mes "Don't be too proud of that hat and don't be late." ;
		mes "If you're too late, I might leave you behind. Hahaha!" ;
		close2;
		misceffect 42,"";
		misceffect 91,"";
		misceffect 68,"";
		getitem 19330, 1;
		getitem 28576, 1;
		getitem 15274, 1;
		getitem 22184, 1;
		getitem 12324, 1;
		delquest 98429;
		set DORAM_1QUE,100;
		getexp 0,25000;
		savepoint "lasagna.gat",299,239;
	case 100:
		mes "^009eff[Information] Thanks for your help." ;
		mes "All tutorials have been completed." ;
		mes "After this, we will move to the port town Lasagna. ^000000";
		next;
		mes "^009eff[Information] In the beginning, it is recommended to play the quests that can be received from the vigilante Orio (coordinates: 323,229) in the port town Lasagna. ^000000";
		next;
		mes "^009eff[Information] Then enjoy the world of Ragnarok Online! ^000000";
		close2;
		warp "lasagna.gat",298,238;
		end;
	}
}

do_tu05a.gat,24,62,5 script stelllow#do_tu05a 10156,{
	if(DORAM_1QUE < 38) {
		mes "[Stelroe]";
		mes "I'm Stelroe." ;
		mes "I am the navigator of this ship." ;
		close;
	}
	if(DORAM_1QUE >= 42) {
		mes "[Stelroe]";
		mes "Looks like you're safe." ;
		close;
	}
	mes "[Stelroe]";
	mes "We'll leave when you're ready." ;
	next;
	switch(select("We're leaving", "I want to reassign status", "Wait a minute")) {
	case 1:
		mes "[Stelroe]";
		mes "I'll lead you to the cave entrance." ;
		mes "Are you ready?" ;
		next;
		if(select("We're leaving", "wait a minute") == 2) {
			mes "[Stelroe]";
			mes "I don't have much free time either." ;
			mes "Just get ready to go." ;
			close;
		}
		mes "[Stelroe]";
		mes "Okay, here we go." ;
		close2;
		warp "do_tu04a.gat",343, 244;
		end;
	case 2:
		mes "[Stelroe]";
		mes "See?" ;
		mes "I reset your status, man." ;
		resetstatus;
		unequip -1;
		next;
		mes "^009eff[Information] All equipment items have been removed and status acquisition status has been reset. ^000000";
		close;
	case 3:
		mes "[Sterlow]";
		mes "I don't have much free time either." ;
		mes "Just get ready to go." ;
		close;
	}
OnTalk1:
	unittalk "Sterlow : iIcer!" ;
	end;
}

do_tu05a.gat,30,57,0 script object01#do_tu05a 139,11,11,{
	if(DORAM_1QUE == 42) {
		cloakoffnpc "decklength#do_tu05a_2";
		cloakoffnpc "helmsman#do_tu05a_2";
	}
	end;
}

do_tu05a.gat,22,60,5 script deckmaster#do_tu05a_2 421,{
	mes "[deck length]";
	mes "If too much time passes, the cargo will be ruined." ;
	mes "I hope they do something about it soon." ;
	close;
OnTalk1:
	unittalk "Deck Chief : Iaiisar!" ;
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu05a.gat,21,56,3 script helmsman#do_tu05a_2 561,{
	mes "[helmsman]";
	mes "I wonder when we'll be able to sail." ;
	close;
OnTalk1:
	unittalk "Quartermaster : aiisser!" ;
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu06a.gat,18,143,0 warp warp01#do_tu06a 2,2,do_tu04a.gat,344,243
do_tu06a.gat,29,146,5 script vigilante#do_tu06a 10162,5,5,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-","";
		end;
	}
	if(DORAM_1QUE == 38) {
		if(checkquest(98425)) {
			delquest 98425;
			getexp 430,4000;
		}
		mes "[Vigilante]";
		mes "Oh, what's a new adventurer doing here?" ;
		next;
		mes "-You told us what is happening in the sea of Lasagna-"; mes "[Vigilante]
		next;
		emotion 5;
		mes "[Vigilante]";
		mes "Heh - I see." ;
		mes "I didn't know that was happening." ;
		mes "I was wondering why it was so smoky earlier...is that what happened?" ;
		next;
		mes "[Neighborhood Watch]";
		mes "Well, why don't you come with me to see what's going on?" ;
		next;
		if(select("Yes", "I want to go back to Lasagna") == 2) {
			mes "[Neighborhood Watch]";
			mes "Huh?" ;
			mes "Did you forget something?" ;
			mes "I'm here, so please go get it quickly." ;
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		mes "[Neighborhood Watch]";
		mes "Here's where we're going." ;
		mes "I've marked the map so you can get lost." ;
		mes "Come on, let's go." ;
		viewpoint 1, 157, 98, 1, 0xFF0000;
		close2;
		setquest 98426;
		set DORAM_1QUE,39;
		end;
	}
	if(DORAM_1QUE == 39) {
		mes "[Neighborhood Watch]";
		mes "If you were wondering why you were smokin' earlier, that's what you meant." ;
		mes "Well, let's go check it out together, shall we?" ;
		next;
		if(select("yes", "I want to go back to Lasagna") == 2) {
			mes "[Neighborhood Watch]";
			mes "Huh?" ;
			mes "Did you forget something?" ;
			mes "I'm here, so please go get it quickly." ;
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		mes "[Neighborhood Watch]";
		mes "Here's where we're going." ;
		mes "I've marked the map so you can get lost." ;
		mes "Come on, let's go." ;
		viewpoint 1, 157, 98, 1, 0xFF0000;
		close;
	}
	mes "^ff0000[Information] You have left the tutorial in progress." ;
	mes "Would you like to return to the tutorial in progress? ^000000";
	next;
	if(select("Yes", "No") == 2) {
		mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
		close;
	}
	if(DORAM_1QUE <= 1)
		warp "do_tu01a.gat",29,281;
	else if(DORAM_1QUE <= 24)
		warp "do_tu01a.gat",60,320;
	else if(DORAM_1QUE <= 26)
		warp "do_tu02a.gat",224,124;
	else if(DORAM_1QUE <= 34)
		warp "do_tu02a.gat",235,196;
	else if(DORAM_1QUE <= 37)
		warp "do_tu02a.gat",203,322;
	else
		warp "do_tu05a.gat",26,62;
	end;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu06a.gat,153,103,3 script vigilante#do_tu06a_2 10162,5,5,{
	if(distance(getcharid(3)) > 5) {
		showmessage "-Let's get closer and then talk to him-","";
		end;
	}
	if(DORAM_1QUE == 39) {
		if(checkquest(98426)) {
			delquest 98426;
			getexp 475,6000;
		}
		mes "[Vigilante]";
		mes "You made it here without getting lost." ;
		mes "Just ahead is the dragon of this cave, ^ff000000 Tartufi^000000." ;
		next;
		mes "[Vigilante]";
		mes "He's a quiet one, so I don't think he's going to attack you, but just be careful." ;
		mes "Let's proceed then." ;
		next;
		if(select("yes", "I want to go back to Lasagna") == 2) {
			mes "[Neighborhood Watch]";
			mes "Huh?" ;
			mes "Did you forget something?" ;
			mes "I'm here, so please go get it quickly." ;
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		if(!checkquest(98427))
			setquest 98427;
		warp "do_tu07a.gat",190,20;
		end;
	}
	mes "^ff0000[Information] You have left the tutorial in progress." ;
	mes "Would you like to return to the tutorial in progress? ^000000";
	next;
	if(select("Yes", "No") == 2) {
		mes "^ff000000[Information] If you lose the location of the tutorial in progress, you can return to the location of the NPC in progress of the tutorial by talking to them again. ^000000";
		close;
	}
	if(DORAM_1QUE <= 1)
		warp "do_tu01a.gat",29,281;
	else if(DORAM_1QUE <= 24)
		warp "do_tu01a.gat",60,320;
	else if(DORAM_1QUE <= 26)
		warp "do_tu02a.gat",224,124;
	else if(DORAM_1QUE <= 34)
		warp "do_tu02a.gat",235,196;
	else if(DORAM_1QUE <= 37)
		warp "do_tu02a.gat",203,322;
	else
		warp "do_tu05a.gat",26,62;
	end;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu07a.gat,190,15,0 warp warp warp01#do_tu07a 2,2,do_tu06a.gat,153,98
do_tu07a.gat,190,20,0 script object01#do_tu07a 139,4,4,{
	if(DORAM_1QUE == 39) {
		mes "^009eff[Information] The quest window contains destinations and goals." ;
		mes "^ff0000Tartufi^009eff location is also written in the quest window, so go there! ^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff[Information] The quest window can be opened by left-clicking on the icon ^ff000000<Alt>key+<U>key ^009eff. ^000000";
		close2;
		viewpoint 1, 162, 158, 1, 0xFF0000;
		cutin "do_su_001.bmp", 255;
		end;
	}
	end;
}

do_tu07a.gat,159,156,5 script vigilante#do_tu07a 10162,5,5,{
	if(DORAM_1QUE < 42) {
		mes "[Neighborhood Watch]";
		mes "That's a lot more basilisk. ......." ;
		next;
		if(select("Yes", "I want to go back to Lasagna") == 2) {
			mes "[Neighborhood Watch]";
			mes "Huh?" ;
			mes "Did you forget something?" ;
			mes "I'm here, so please go get it quickly." ;
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		mes "[Neighborhood Watch]";
		mes "They're the ones who get into trouble for something, so even the neighborhood watch is having a hard time keeping their heads above water." ;
		close;
	}
	mes "[Neighborhood Watch]";
	mes "Thanks for your help." ;
	mes "I'm going back to the entrance." ;
	next;
	mes "[Neighborhood Watch]";
	mes "With that ^ff000000 beginner's butterfly wings^000000, you too can get back into town." ;
	close;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu07a.gat,162,158,3 script Tartufi#do_tu07a 10161,5,5,{
	if(DORAM_1QUE == 39) {
		if(checkquest(98427)) {
			delquest 98427;
			getexp 524,8000;
		}
		emotion 6, "Tartufi#do_tu07a";
		mes "[Tartufi]";
		mes "Yeah, they're noisy ones." ;
		mes "What do you have against me?" ;
		next;
		mes "[Tartuffe]";
		mes "Dad, Mom, I miss you. ......." ;
		next;
		mes "-What the big dragon is muttering-";
		next;
		emotion 0, "Tartuffe#do_tu07a";
		mes "[Tartuffe]";
		mes "Hmm?  Who?" ;
		mes "I've never seen your face before." ;
		next;
		mes "[Neighborhood Watch]";
		mes "Hey Tartuffe." ;
		mes "He's a new adventurer." ;
		mes "I tried to get to the Midgard continent by ship, but apparently the smoke from the flames you exhale prevents the ship from leaving." ;
		next;
		mes "[Tartuffe]";
		mes "Oh, sorry about that." ;
		mes "But that's ^ff000000 basilisk's fault ^000000." ;
		next;
		mes "[Tartuffe]";
		mes "He used to just mess with me once in a while, but the other day it suddenly became more intense." ;
		next;
		mes "[Neighborhood Watch]";
		mes "Speaking of which, Basilisk has been having a rough time lately." ;
		mes "What have you done?" ;
		next;
		mes "[Tartuffe]";
		mes "I didn't do anything." ;
		mes "[fellowship grudge!" I'm sure they did something to those guys." ;
		mes "I heard they got caught and had a bad time." ;
		next;
		mes "[Vigilante]";
		mes "I see. ......." ;
		mes "Do you know anything about it?" ;
		next;
		menu "No",-, "I don't know",-, "I have no idea",-;
		mes "[Neighborhood Watch]";
		mes "Yes, I do." ;
		mes "You're a new adventurer, you wouldn't know, would you?" ;
		next;
		mes "[Tartuffe]";
		mes "Well, that's why I don't want to do it either." ;
		next;
		emotion 0, "Tartuffe#do_tu07a";
		mes "[Tartuffe]";
		mes "Yes!" ;
		mes "You guys can punish the basilisks around here." ;
		mes "If those guys would just grow up, I wouldn't have to breathe fire too." ;
		next;
		mes "[Tartuffe]";
		mes "Hmmm, yeah." ;
		mes "I guess it would be enough to kill ^ff000000 five ^000000 recon basilisks." ;
		mes "Please." ;
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff [Information] Quest received." ;
		mes "Open the quest window to confirm! ^000000";
		setquest 98428;
		set DORAM_1QUE,40;
		close2;
		cutin "do_su_002.bmp", 255;
		end;
	}
	if(DORAM_1QUE == 40 || DORAM_1QUE == 41) {
		if(! (checkquest(98428) & 0x4)) {
			mes "[Tartufi]";
			mes "You guys punish the basilisks around here." ;
			mes "If those guys would just grow up, I wouldn't have to breathe fire too." ;
			next;
			mes "[Tartuffe]";
			mes "Hmmm, yeah." ;
			mes "I guess it would be enough to kill ^ff000000 five ^000000 recon basilisks." ;
			mes "Please." ;
			next;
			cutin "do_su_002.bmp", 3;
			mes "^009eff [Information] Quest received." ;
			mes "Open the quest window to confirm! ^000000";
			close2;
			cutin "do_su_002.bmp", 255;
			end;
		}
		mes "[Tartufi]";
		mes "Looks like it's finally quiet." ;
		mes "Thanks." ;
		mes "I guess now those guys will be quiet for a while." ;
		next;
		mes "[Vigilante]";
		mes "I heard you're a new adventurer, but you're pretty good." ;
		mes "I'm already a full-fledged adventurer." ;
		next;
		mes "[Tartuffe]";
		mes "You're going to the continent of Midgard, aren't you?" ;
		mes "I wish you'd come back once in a while and tell me about the other side." ;
		next;
		mes "[Tartuffe]";
		mes "I have to stay here until I'm a little older." ;
		mes "I envy your freedom." ;
		next;
		mes "[Tartuffe]";
		mes "Thank you for the short time you were here." ;
		mes "If you're leaving, use this." ;
		next;
		mes "-Tartufi gave me something -";
		next;
		if(DORAM_1QUE == 40) {
			getitem 12324, 1;
			set DORAM_1QUE,41;
		}
		mes "[Tartufi]";
		mes "This is ^ff000000 beginner butterfly wings ^000000." ;
		mes "When I use it, I can move to the location saved." ;
		next;
		mes "^009eff[Information] Location save points can be set by certain NPCs." ;
		mes "The current location save point is in front of Captain Gumberry. ^000000";
		next;
		mes "[Tartuffe]";
		mes "I'd really like to send you there myself, but you never know when the basilisk will arrive. ......." ;
		mes "Use that instead." ;
		mes "I'll see you then." ;
		close2;
		delquest 98428;
		set DORAM_1QUE,42;
		getexp 577,10000;
		setquest 98429;
		end;
	}
	mes "[Tartuffe]";
	mes "You're going to the continent of Midgard, right?" ;
	mes "I wish you'd come back once in a while and tell me about the other side." ;
	close;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu07a.gat,247,194,0 script object02#do_tu07a 139,{}

do_tu02a.gat,226,181,3 script carlou#do_tu02a 548,{
	mes "[Carlu]";
	mes "Do you know what the main ingredients of caluña milk are?" ;
	mes "It is made from the essence of a special shellfish called caluña, which is fermented, and fresh milk." ;
	next;
	mes "[Karlou]";
	mes "Mix it with the right amount." ;
	mes "Then add the nyandare nuts together and it becomes the kaluña milk that everyone loves." ;
	close;
}

do_tu02a.gat,225,290,5 script work group leader#do_tu02a 421,{
	mes "[work group leader]";
	mes "Have you done this job before?" ;
	mes "It's an easy thing to learn quickly." ;
	mes "Captain Gumberry on the Conchirina was especially good at it." ;
	close;
}

do_tu02a.gat,139,299,3 script sardine fishing boat captain#do_tu02a 561,{
	mes "[sardine fishing boat captain]";
	mes "Even though the sardine industry is down from previous years, there is always a shortage of manpower." ;
	close;
}

do_tu02a.gat,263,156,5 script grandma#do_tu02a 554,{
	mes "[grandma]";
	mes "The old lasagna was awesome." ;
	mes "The roads and residents are falling apart." ;
	mes "They call those days the Dark Ages, you know." ;
	next;
	mes "[Grandma]";
	mes "At some point, I don't know what the play was, but the bad boys started rehabilitating the other thugs and forcing them into the vigilante and cat hand services that they had created." ;
	next;
	mes "[Grandma]";
	mes "All those who didn't want to be rehabilitated left Lasagna, and only those who wanted a new life were left." ;
	mes "All the Lasagna we have today was created by those kids." ;
	close;
}

do_tu02a.gat,244,231,3 script sardine fisherman#do_tu02a 544,{
	mes "[sardine fisherman]";
	mes "Walk along this yellow cheese road and our home will appear." ;
	mes "I want to go back someday." ;
	close;
}

do_tu02a.gat,260,134,3 script Rasmus#do_tu02a 546,{
	mes "[Rasmus]";
	mes "The red yarn will take you where you want to go, and the yellow road will take you home." ;
	mes "If you get lost, just follow the red yarn." ;
	close;
}

do_tu02a.gat,141,166,5 script Kurume#do_tu02a 555,{
	mes "[Kurume]";
	mes "There are things you realize when you walk down the street." ;
	mes "That you can smell meat sauce from anywhere in this world." ;
	close;
}

do_tu02a.gat,233,174,5 script drunk#do_tu02a_01 561,{
	mes "[drinker]";
	mes "You have to mix the caruña milk slowly before you drink it." ;
	mes "The drifters who came here recently seem to be shaking it and drinking it, but that's what little kids do." ;
	close;
}

do_tu02a.gat,236,173,3 script drunk#do_tu02a_02 561,{
	mes "[drinker]";
	mes "Caruña milk is best shaken well before drinking." ;
	mes "You can taste the delicate flavor created by the fermented caruña mixing with the milk." ;
	close;
}

do_tu02a.gat,200,278,5 script worried Doram#do_tu0 559,{
	emotion 54;
	mes "[Worried Doram]";
	mes "I hear that many Doram are being tricked and taken on board fishing boats that illegally catch sardines these days. It's a scary world we live in." ;
	mes "I hear that the vigilantes are really looking around for them." ;
	close;
}

do_tu02a.gat,202,276,5 script Floating Doram#do_tu02a 560,{
	emotion 18;
	mes "[Floaty Doram]";
	mes "Yes!" ;
	mes "I won a luxury cruise vacation!" ;
	mes "What luck!" . mes "I have to get to the meeting place in front of the sardine fishing boat!
	mes "I have to get to the meeting place in front of the sardine fishing boat!" ;
	close;
}

do_tu02a.gat,209,301,3 script Mustachi#do_tu02a 10167,{
	mes "[Mustachi]";
	mes "Why don't you try to look presentable before you leave for the new continent?" ;
	close;
}

do_tu02a.gat,236,179,5 script Nyankun#do_tu02a 10163,{
	mes "[Nyankun]";
	mes "If you have a problem, why don't you ask the neighborhood watch?" ;
	close;
}

do_tu02a.gat,229,197,5 script toss#do_tu02a 10164,{
	emotion 22;
	mes "[toss]";
	mes "It's still a famous place, so there are a lot of people." ;
	close;
}

do_tu02a.gat,228,193,5 script Porto#do_tu02a 10163,{
	emotion 32;
	mes "[Porto]";
	mes "If you're here, you've got to drink the caruña milk!" ;
	close;
}

do_tu02a.gat,226,196,5 script Aram#do_tu02a 10166,{
	emotion 7;
	mes "[Aram]";
	mes "Don't scurry!" ;
	mes "Don't be a total redneck!" ;
	close;
}

do_tu02a.gat,227,187,1 script Vongolo#do_tu02a 544,{
	mes "[Vongolo]";
	mes "Hello." ;
	mes "Welcome to the pub "Oven"." ;
	mes "Have you decided what to order?" ;
	next;
	mes "[Vongolo]";
	mes "Due to the 'Oath of the Oven' by Commander Peron, Captain Gumberry, and Captain Thomas, everyone will be ordering carunya milk, but it is the boss's dish that I am most confident will taste the best." ;
	next;
	mes "[Vongolo]";
	mes "After the white fish has been heartily cleaned, it is mixed with boiled beans and potatoes, mashed, shaped and fried." ;
	mes "It's really good, but no one orders it." ;
	next;
	mes "[Vongolo]";
	mes "That's why I don't even prepare the ingredients these days, so when I get a rush order, I have to run to the fishmonger to buy it." ;
	next;
	emotion 54;
	mes "[Vongolo]";
	mes "Oh my God, it's really good, but it's ......." ;
	close;
}

do_tu02a.gat,232,187,6 script Fettuccinha#do_t 545,{
	mes "[Fettuccinha]";
	mes "I've been working here for a good amount of time, but I'm still the lowly one, so I'm still in charge of all the dishwashing." ;
	next;
	mes "[Fettuccinha]";
	mes "A drink before going to the ship, a drink after a long voyage, a drink for adventurers who came to visit from all over the place, a drink for those who have been drinking since the beginning, a drink for those who start drinking when they get caught around ......." ;
	next;
	mes "[Fettuccinia]";
	mes "Anyway, the number of dishes that have to be washed is beyond imagination." ;
	mes "And that's not all, the whining of vigilantes and cat's paw staffers, consultations from new adventurers, etc. ......." ;
	next;
	emotion 28;
	mes "[Fettuccinia]";
	mes "24 hours is not enough." ;
	mes "You should have more employees!" ;
	close;
}

do_tu02a.gat,232,181,5 script Linguine#do_tu02a 559,{
	mes "[Linguine]";
	mes "This is the headquarters of the Neighborhood Watch, but it's also a pub where adventurers stop by." ;
	mes "Adventurers who come pouring in from all over also exchange experiences and look for fellow adventurers." ;
	next;
	mes "[Linguine]";
	mes "These days, more and more people come here to get information before setting off for a new continent." ;
	next;
	mes "[Linguine]";
	mes "More than a decade ago, it was also used as a place to rehabilitate delinquent Doram and others to join the vigilante group." ;
	mes "Before that, it was a place for rough sailors to relax after a hard day's work." ;
	next;
	mes "[Linguine]";
	mes "Commander Peron, Captain Gumberry, and Captain Thomas also met here." ;
	mes "The three of them formed a bond of brotherhood here and became living legends here in Lasagna for their subsequent merits." ;
	next;
	mes "[Linguine]";
	mes "Many adventurers come here because of their admiration." ;
	close;
}

do_tu02a.gat,190,239,5 script young Nyanko#do_tu02a_0 559,{
	unittalk "Young Nyanko : I am the captain of this playground~!" ;
	end;
}

do_tu02a.gat,180,230,7 script juvenile_nyanko#do_tu02a_0 560,{
	unittalk "Childish Nyanko : huh ...... I can't play with these childish guys~!" ;
	end;
}

do_tu02a.gat,192,245,7 script juvenile_nyanko#do_tu02a_0 554,{
	unittalk "Young Nyanko : One, Natsu, Futtsu, Muttsu ...... Many!!!" ;
	end;
}

do_tu02a.gat,184,234,5 script juvenile_nyanko#do_tu02a_0 422,{
	unittalk "Young Nyanko : Gather all who want to play together while riding the seesaw~!" ;
	end;
}

do_tu02a.gat,186,231,3 script young nyanko#do_tu02a_0 10167,{
	emotion 28;
	unittalk "Young Nyan Cat : Why doesn't this roll? Make it roll!" ;
	end;
}

do_tu02a.gat,211,186,5 script Boarding Guide#do_tu02a 559,{
	mes "[Boarding Guide]";
	mes "Hello!" ;
	mes "Ships leaving for the new continent are docked at the pier north of here!" ;
	close;
}

do_tu02a.gat,222,187,3 script boss#do_tu02a 548,{
	mes "[Boss]";
	mes "What?" ;
	mes "Are you a carunya milk too?" ;
	close;
}

do_tu02a.gat,202,291,3 script Neighborhood Watch Guide#do_tu02a01 10162,{
	mes "[Neighborhood Watch Guide]";
	mes "Welcome to the port city of Lasagna!" ;
	mes "Visit the Farfalle Neighborhood Watch whenever you need help." ;
	close;
}

do_tu02a.gat,174,160,3 script Neighborhood Watch Guide#do_tu02a02 10162,{
	mes "[Neighborhood Watch Guide]";
	mes "Hello." ;
	mes "It's a beautiful day." ;
	close;
}

do_tu02a.gat,233,197,5 script Neighborhood Watchman Orio#do_tu02a 10155,{
	mes "[Vigilante Orio]";
	mes "This is Master Peron, the leader of the Farfalle Neighborhood Watch!" ;
	close;
}

do_tu02a.gat,77,263,5 script Tarly#do_tu02a 10166,{
	mes "[Tarly]";
	mes "I need to finish my work soon ......" ;
	mes "I'm going to be late for my meeting." ;
	close;
}

do_tu02a.gat,191,174,3 script Golli#do_tu02a 547,{
	emotion 45;
	mes "[Golli]";
	mes "It's a beautiful day." ;
	close;
}
