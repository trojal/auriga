//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Lune's Request
//
// by Pneuma
// I want to be an adventurer -----------------------------------------

geffen_in.gat,110,28,4	script	Honest	62,{
	set '@novice, callfunc("AC_GetNovice");
	function show_mission;
	if(AC_QUEST_ST_4==0) goto L_OTHER;
	switch(AC_QUEST_LV_4){
	case 0:
		goto L_QUEST01;
	case 1:
		goto L_QUEST02;
	case 2:
		goto L_QUEST03;
	case 3:
		goto L_QUEST04;
	case 4:
		goto L_QUEST05;
	case 5:
		goto L_QUEST06;
	case 6:
		goto L_QUEST07;
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_QUEST09;
	}
L_QUEST01:
	switch(AC_QUEST_ST_4){
	case 1:
		mes "[Honest]";
		mes "Hi, are you the adventurer who will accept my request?";
		next;
		menu "Yes.",-;
		emotion 5;
		mes "[Honest]";
		mes "I knew it!";
		mes "That's what I thought.";
		mes "Because I want to be an adventurer in the future.";
		mes "I saw what you were wearing and it just clicked.";
		next;
		mes "[Honest]";
		mes "But, you know, my parents are being a little picky.";
		mes "There are a lot of people my age who are doing a lot of adventurous things, and they want me to study, study, study.";
		next;
		mes "[Honest]";
		mes "So, when I studied to become an adventurer, I was scolded and all the materials I collected were thrown away once.";
		next;
		mes "[Honest]";
		mes "So I'm in the process of re-gathering all my materials.";
		mes "I wanted to ask you to help me gather that material.";
		next;
		mes "[Honest]";
		mes "So I'm looking forward to working with you!";
		mes "This time, I need you to take pictures of the map ^0000FFProntera Field 02^000000, where the boss monster ^FF0000 Eclipse ^000000 lives.";
		next;
		mes "[Honest]";
		mes "Was it closer to ^0000FFProntera Field 02^000000 if I headed from Prontera?";
		mes "Also, I made a note of the shooting point, so please take me there.";
		mes "Oh, and use this camera.";
		next;
		mes "-I received the camera from Honest-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFProntera go to field 02(305,157)^000000 and take a picture-";
		mes " ^0000FFProntera field 02^000000-^0000FFProntera^000000-^0000FFProntera^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		next;
		mes "[Honest]";
		mes "Was it closer to ^0000FFProntera field 02^000000 if I headed from Prontera?";
		mes "Also, I made a note of the shooting point, so please take me there.";
		next;
		mes "^FF0000 [mission] ^000000-^0000FFProntera go to field 02(305,157)^000000 and take pictures-";
		mes " ^0000FFProntera field 02^000000-^0000FFProntera^000000 to go from ^0000FFProntera^000000-";
		close;
	case 3:
		emotion 0;
		mes "[Honest]";
		mes "Oh, that was pretty quick.";
		mes "I'm still not sure if I got it right, but looking at you, it looks like you got it right, so I'm happy to end the request now.";
		next;
		mes "-Returned the camera to Honest-";
		next;
		mes "[Honest]";
		if('@novice){
			mes "Yes, it's not much, but I'll give you this.";
			mes "It's an easy item to move around the map.";
		}
		mes "Well, if you need anything else, I'll be happy to help!";
		next;
		if('@novice){
			if(!checkweight(601,30)){
				mes "-overweight-";
				close;
			}
			getitem 601,30;
		}
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[Honest]";
		mes "Thank you!";
		mes "Thank you for your help.";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST02:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 15;
		mes "[Honest]";
		mes "Hey, hey, thanks for the other day.";
		mes "Thanks again for your help this time!";
		mes "Oh, I didn't get your name, did I?";
		mes "What's your name?";
		next;
		menu "Identify yourself",-;
		mes "[Honest]";
		mes ""+strcharinfo(0) + "ka!";
		mes "I'm Honest, nice to meet you!";
		mes "Well, then, here's the contents as soon as possible.";
		next;
		mes "[Honest]";
		mes "This time, I want you to take pictures of the map ^0000FFPayon Lost Forest 04^000000, where the boss monster ^FF0000 Master Ring^000000 lives.";
		next;
		mes "[Honest]";
		mes "Also, I made a note of the shooting point as I did the last time, so please use that location.";
		mes "Oh, and use this camera.";
		next;
		mes "-Received the camera from Honest-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFPayon lost forest 04 (267.193)^000000";
		/* "." to go to the main mackerel street*/mes ".";
		mes " ^0000FFPayon lost forest 04^000000 is better to go from ^0000FFProntera^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		next;
		mes "[Honest]";
		mes "This time I want you to take pictures of the map ^0000FFPayon Lost Forest 04^000000 where the boss monster ^FF0000 Master Ring^000000 lives.";
		next;
		mes "^FF0000[Mission] ^000000-^0000FFPayon Lost Forest 04 (267.193)^000000";
		mes " and take pictures-";
		mes " ^0000FFPayon lost forest 04^000000 is better to go from ^0000FFProntera^000000-";
		close;
	case 3:
		mes "[Honest]";
		mes "As expected";
		mes strcharinfo(0) + "Yes, as expected.";
		mes "I got a good picture of the last one, and this one looks promising.";
		mes "Thanks again if you need anything else.";
		next;
		mes "-Returned the camera to Honest-";
		next;
		if('@novice){
			mes "[Honest]";
			mes "Ah!";
			mes "Also, you can take this with you if you want!";
			next;
			switch(Job){
			case Job_Swordman:
			case Job_Thief:
			case Job_Archer:
			case Job_Merchant:
			case Job_TaeKwon:
			case Job_Gunslinger:
				set '@item,2405;
				break;
			// boots[0].
				case Job_Magician:
			case Job_Acolyte:
			case Job_Ninja:
				set '@item,2403;
				break;
			// fuse[0].
				case Job_SuperNovice:
			default:
				set '@item,2416;
				break;
				// Novice shoes[1].
			}
			if(!checkweight('@item,1)){
				mes "-overweight-";
				close;
			}
			getitem '@item,1;
		}
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[Honest]";
		mes "Thank you!";
		mes "Thank you for your help.";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST03:
	switch(AC_QUEST_ST_4){
	case 1:
		mes "[Honest]";
		mes "Hi" + strcharinfo(0);
		mes "Thanks again for your help this time!";
		next;
		mes "[Honest]";
		mes "This time I want you to take pictures of the map ^0000FFFSograt Desert18^000000 where the boss monster ^FF0000 Dragonfly^000000 lives.";
		next;
		mes "[Honest]";
		mes "Also, I wrote down the photo points as I did the last time, so please use those locations.";
		mes "Oh, and use this camera.";
		next;
		mes "-Received the camera from Honest-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFSograt Go to Desert18(232,217)^000000 and take pictures-";
		mes " ^0000FFSograt Desert18^000000-^0000FFMorroc^000000-^000000-^000000-^0000FFMorroc^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		next;
		mes "[Honest]";
		mes "This time I want you to take pictures of the map ^0000FFFSograt Desert18^000000 where the boss monster ^FF0000 Dragonfly^000000 lives.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFSograt Desert18(232,217)^000000 go there and take pictures-";
		mes " ^0000FFSograt Desert18^000000-^0000FFMorroc^000000-^000000-^000000-^0000FFMorroc^000000-";
		close;
	case 3:
		emotion 5;
		mes "[Honest]";
		mes "Thanks for your help!";
		mes "Now we have three boss monster related documents.";
		mes "I'm sure I'll need more, so thanks again.";
		next;
		mes "-Returned camera to Honest-";
		next;
		mes "^FF0000 [request fulfilled]^000000-You fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		emotion 5;
		mes "[Honest]";
		mes "Thanks for your hard work.";
		mes "Now we have three boss monster related documents.";
		mes "I'm sure I'll need more, so thanks again.";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST04:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[Honest]";
		mes ""+strcharinfo(0);
		mes "You're taking care of it this time too.";
		mes "No, thank you for your help.";
		mes "Really.";
		mes "Well, let me quickly explain about this request.";
		next;
		mes "[Honest]";
		mes "This time, I want you to take pictures of the map ^00FFFFGeffen Field 01^000000 where the boss monster ^FF0000 Toad^000000 lives.";
		next;
		mes "[Honest]";
		mes "Also, I wrote down the photo points as I did the last time, so please use those locations.";
		mes "Oh, and use this camera.";
		next;
		mes "-Received the camera from Honest-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFFGeffen go to field 01(208,242)^000000 and take a picture-";
		mes " ^0000FFFGeffen field 01^000000-^0000FFProntera^000000 to get there-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		next;
		mes "[Honest]";
		mes "This time I want you to take pictures of the map ^00FFFFGeffen Field 01^000000 where the boss monster ^FF0000 Toad^000000 lives.";
		next;
		mes "^FF0000 [mission] ^000000-^0000FFGeffen field 01(208,242)^000000 and go there and take pictures-";
		mes " ^0000FFFGeffen field 01^000000-^0000FFProntera^000000 to get there-";
		close;
	case 3:
		mes "[Honest]";
		mes "Good job!";
		mes "No, that's great.";
		mes "I can't wait to become an adventurer too and go adventuring to different places.";
		next;
		mes "-Honest returned the camera to me-";
		next;
		if('@novice){
			EMOTION 0;
			mes "[Honest]";
			mes "Yes! This!";
			mes "It's a magnifying glass that can appraise unappraised items, and I have a lot of them, so I'll give them away!";
			mes "Even if I had it, I wouldn't use it.";
			next;
			if(!checkweight(611,20)){
				mes "-overweight-";
				close;
			}
			getitem 611,20;
		}
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[Honest]";
		mes "Thank you!";
		mes "Thank you for your help.";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST05:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[Honest]";
		mes "Oh," + strcharinfo(0);
		mes "I've been really looking forward to having you here.";
		next;
		emotion 9;
		mes "[Honest]";
		mes "Actually, the next location is an awesome and dangerous place ......";
		mes "So I want you to go there and be careful.";
		mes "After all, it's where the MVP boss monster is.";
		next;
		mes "[Honest]";
		mes "So that's where we're going to shoot, and I want you to take pictures of the map ^0000FFSograt Desert17^000000 where the MVP boss monster ^FF0000 Frioni^000000 lives.";
		next;
		mes "[Honest]";
		mes "Also, I wrote down the photo points as usual, so please use those locations.";
		mes "Use this camera.";
		next;
		mes "-Received the camera from Honest-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFSograt Go to Desert17(146,145)^000000 and take pictures-";
		mes " ^0000FFSograt Desert17^000000-^0000FFMorroc^000000-^000000-^0000FFMorroc^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		mes "This time the place is dangerous, so be careful.";
		next;
		mes "[Honest]";
		mes "It's a photo location, but I need you to take pictures of the map ^0000FFSograt Desert17^000000 where the MVP boss monster ^FF0000 Frioni^000000 lives.";
		NEXT;
		mes "^FF0000 [Mission] ^000000-^0000FFSograt Desert17(146,145)^000000 go there and take pictures-";
		mes " ^0000FFSograt Desert17^000000-^0000FFMorroc^000000-^000000-^000000-^0000FFMorroc^000000-";
		close;
	case 3:
		mes "[Honest]";
		mes ""+strcharinfo(0) + "!";
		mes "Thank goodness you're all right.";
		mes "I was worried that the ^FF0000 frii^000000 frii^000000 might have gotten you.";
		mes "I'm so glad.";
		next;
		emotion 20;
		mes "[Honest]";
		mes "That's really great. ......";
		mes "Me too" + strcharinfo(0);
		mes "I have to study hard so that I can be an adventurer like";
		mes "Well, I'll see you soon.";
		next;
		mes "-Honest returned the camera to me-";
		next;
		mes "^FF0000 [request fulfilled]^000000-You fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		emotion 20;
		mes "[Honest]";
		mes "That's really great. ......";
		mes "Me too" + strcharinfo(0);
		mes "I have to study hard to be an adventurer like";
		mes "Well, I'll see you soon.";
		next;
		mes "^FF0000 [request accomplished] ^000000-you accomplished your request!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST06:
	switch(AC_QUEST_ST_4){
	case 1:
		mes "[Honest]";
		mes "Hello!";
		mes "I knew you would come again this time.";
		mes "Thanks to you, I've learned a lot, and I think I've gained a lot, if only in knowledge.";
		next;
		mes "[Honest]";
		mes "Now for the location, this time I want you to take pictures of the map ^0000FFSograt Desert03^000000 where the normal boss monster ^FF0000 wandering wolf^000000 lives.";
		next;
		mes "[Honest]";
		mes "I want you to take a picture of ^0000FFProntera^000000 near where you enter from the ^0000FFProntera^000000 side?";
		mes "So I want you to go from ^0000FFProntera^000000 to shoot, even though it will be a bit far.";
		next;
		mes "[Honest]";
		mes "Also, I made a note of the shooting point as usual, so please go there.";
		mes "Use this camera.";
		next;
		mes "-Received the camera from Honest-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFSograt Go to Desert03(70,336)^000000 and take pictures-";
		mes " ^0000FFSograt Desert03^000000-go to ^0000FFProntera^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		next;
		mes "[Honest]";
		mes "Quick photo location, this time I want you to take a picture of the map ^0000FFSograt Desert03^000000, which is inhabited by the regular boss monster ^FF0000 Wandering Wolf^000000.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFSograt Desert03(70,336)^000000 go there and take pictures-";
		mes " ^0000FFSograt Desert03^000000-^0000FFProntera^000000-^000000-^000000-^0000FFProntera^000000-";
		close;
	case 3:
		mes "[Honest]";
		mes ""+strcharinfo(0);
		mes "Thanks for the long way.";
		mes "It looks like you are taking pictures safely.";
		next;
		mes "-Returned the camera to Honest-";
		next;
		if('@novice){
			EMOTION 21;
			mes "[Honest]";
			mes "Also, this is called a speed-up potion.";
			mes "I heard it increases attack speed.";
			mes ""+strcharinfo(0) + "I'll give it to you.";
			next;
			if(!checkweight(645,10)){
				mes "-overweight-";
				close;
			}
			getitem 645,10;
		}
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[Honest]";
		mes "Thanks again!";
		mes "That's really helpful.";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST07:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[Honest]";
		mes ""+strcharinfo(0) + "!";
		mes "Thanks for everything.";
		mes "Thanks to you I was able to collect a lot of material.";
		next;
		mes "[Honest]";
		mes "Thanks again!";
		next;
		mes "[Honest]";
		mes "Now, the location for the photo shoot, I need you to take a picture of the map ^0000FFGeffen Field 10^000000 where the MVP boss monster ^FF0000 Orc Lord ^000000 lives.";
		next;
		mes "[Honest]";
		mes "It's a very dangerous place, so be careful.";
		next;
		mes "-Received camera from Honest-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFFGeffen go to field 10(251,368)^000000 and take pictures-";
		mes " ^0000FFFGeffen field 10^000000-go to ^0000FFProntera^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		mes "This time the place is dangerous, so be careful.";
		next;
		mes "[Honest]";
		mes "I need you to take pictures of the map ^0000FFGeffen Field 10^000000 where the MVP boss monster ^FF0000 Orc Lord ^000000 lives.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGeffen field 10(251,368)^000000 and go there and take pictures-";
		mes " ^0000FFFGeffen field 10^000000-go to ^0000FFProntera^000000-";
		close;
	case 3:
		EMOTION 21;
		mes "[Honest]";
		mes ""+strcharinfo(0);
		mes "Welcome back.";
		mes "You're back sooner than I thought!";
		mes "As expected" + strcharinfo(0);
		mes "It's...";
		next;
		mes "[Honest]";
		mes "Let's see... ......";
		mes "I think I'm going to have a serious talk with my parents once.";
		mes "If I'm sneaking around and gathering material, they'll probably find out eventually.";
		next;
		mes "[Honest]";
		mes ""+strcharinfo(0) + "I'll show you the pictures I've taken and have a serious talk with you.";
		next;
		menu "Good luck!",-;
		mes "-Honest returned the camera to me-";
		next;
		mes "^FF0000 [request fulfilled]^000000-You fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[Honest]";
		mes "Let's see, ......";
		mes "I think I'm going to have a serious talk with my parents once.";
		mes "If I'm sneaking around and gathering material, they'll probably find out eventually.";
		next;
		mes "[Honest]";
		mes ""+strcharinfo(0) + "I'll show you the pictures I've taken and have a serious talk with you.";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[Honest]";
		mes "Hey," + strcharinfo(0);
		mes "You've given me quite a bit of material to work with, and I'm getting a lot of my knowledge.";
		mes "I've also recently started studying magic, you know?";
		next;
		mes "[Honest]";
		mes "After all, magic is good!";
		mes "I became a Magician and wiped out the monsters with a bang.";//You tried that? Is that correct at ......? as per the main mackerel
		NEXT;
		mes "[Honest]";
		mes "Okay, this is where I want you to take pictures of the map ^0000FF Toy Factory Dungeon 02^000000 where the MVP boss monster ^FF0000 Storm Knight^000000 lives.";
		next;
		mes "[Honest]";
		mes "I'd like you to take pictures inside the dungeon for the first time.";
		mes "I think there are a lot of powerful monsters, so be careful.";
		next;
		mes "-I received the camera from Honest-";
		next;
		mes "[Honest]";
		mes "To get to the ^0000FF toy factory dungeon^000000, you'll first need to talk to the ^FF0000 Link Santa^000000 in the ^0000FFAldebaran^000000 and move to the ^0000FFLutie field^000000.";
		next;
		mes "[Honest]";
		mes "And if you go north on ^0000FFLutie field^000000, there's a town, but it should be in there.";
		mes "Well then, nice to meet you!";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FF Go to the Toy Factory Dungeon 02^000000 and take a picture-";
		mes " ^0000FFToy Factory Dungeon 02^000000-^0000FFAldebaran^000000 to go to ^0000FFAldebaran^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		mes "This time the place is dangerous, so be careful.";
		next;
		mes "[Honest]";
		mes "To get to the ^0000FF Toy Factory Dungeon^000000, you must first talk to the ^FF0000 Link Santa^000000 in the ^0000FFAldebaran^000000 and move to the ^0000FFLutie Field^000000.";
		next;
		mes "[Honest]";
		mes "And if you go north on ^0000FFLutie field^000000, there's a town, but it should be in there.";
		mes "Well then, nice to meet you!";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FF Go to the Toy Factory Dungeon 02^000000 and take a picture-";
		mes " ^0000FFToy Factory Dungeon 02^000000-^0000FFAldebaran^000000 to go to ^0000FFAldebaran^000000-";
		close;
	case 3:
		mes "[Honest]";
		mes ""+strcharinfo(0);
		mes "Good work!";
		mes "Just hearing about the toy factory dungeon is so exciting I can't wait to see the pictures developed.";
		next;
		emotion 21;
		mes "[Honest]";
		mes "One more place to go and we'll have a full set of materials for now.";
		mes "This is thanks to the hard work of " + strcharinfo(0) + ".";
		mes "I'll send out another request in a little while, thank you.";
		next;
		mes "-Returned the camera to Honest-";
		next;
		mes "^FF0000 [request fulfilled]^000000-You fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		emotion 21;
		mes "[Honest]";
		mes "One more place to go and you'll have a full set of materials for now.";
		mes "This is thanks to the hard work of " + strcharinfo(0) + ".";
		mes "I'll send out another request in a little while, thank you.";
		next;
		mes "^FF0000 [request fulfilled] ^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST09:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[Honest]";
		mes "Hey," + strcharinfo(0);
		mes "You're here.";
		mes "Time flies by, by the way.";
		mes "I guess it's been a long time since I met you.";
		next;
		mes "[Honest]";
		mes "So, that's where we're going to shoot as soon as possible, but this time it's a dungeon again.";
		mes "And you'll have to go deep into it.";
		mes "I think it will be a very dangerous shoot.";
		next;
		mes "[Honest]";
		mes "I need you to take pictures of the map ^0000FFProntera underground canal 4F^000000 where the MVP boss monster ^FF0000 golden bugs^000000 lives.";
		next;
		mes "[Honest]";
		mes "There are a lot of active monsters and it's really dangerous, so be prepared before you head out.";
		mes "Also, I think you should take some fly wings with you.";
		next;
		mes "-I received the camera from Honest-";
		next;
		mes "^FF0000[Mission] ^000000-^0000FFProntera underground canal 4F^000000, go to ^000000-^0000FFProntera underground canal 4F^000000 and take pictures-";
		mes " ^0000FFPronteraUnderground canal 4F^000000-go to ^0000FFProntera^000000-";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[Honest]";
		mes "Hmm, should I explain again?";
		mes "This time the place is dangerous, so be careful.";
		next;
		mes "[Honest]";
		mes "I want you to take pictures of the map ^0000FFProntera underground canal 4F^000000 where the MVP boss monster ^FF0000 golden bugs^000000 lives.";
		next;
		mes "[Honest]";
		mes "There are a lot of active monsters and it's really dangerous, so be prepared before you head out.";
		mes "Also, I think you should take some fly wings with you.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFProntera Go to the underground canal 4F^000000 and take pictures-";
		mes " ^0000FFPronteraUnderground canal 4F^000000-go to ^0000FFProntera^000000-";
		close;
	case 3:
		mes "[Honest]";
		mes ""+strcharinfo(0);
		mes "I'm so glad you made it back safe and sound.";
		mes "You must have had a hard time indeed this time.";
		next;
		if(select("It was easy.", "It was hard.")==1){
			EMOTION 23;
			mes "[Honest]";
			mes "Yeah!";
			mes "Actually" + strcharinfo(0) + "was an awesome adventurer!";
			mes "That's awesome!";
			mes "I'm definitely going to become an adventurer and have many adventures.";
			next;
		}
		else {
			EMOTION 33;
			mes "[Honest]";
			mes "That's right...";
			mes "It's a place with lots of monsters.";
			mes "Oh, I can't wait to be an adventurer too!";
			next;
		}
		EMOTION 0;
		mes "[Honest]";
		mes "Oh, yes!";
		mes "My parents saw the pictures you've been taking and approved me to be an adventurer!";
		mes "My parents thought I took the pictures, though.";
		next;
		mes "[Honest]";
		mes "I feel terribly bad for "+strcharinfo(0) + " but my parents think I took the picture, so I'm sorry about that.";
		next;
		menu "Don't worry about it.",-;
		mes "[Honest]";
		mes "Thanks ......";
		mes "When I become an adventurer, I'd love to have an adventure with you too.";
		next;
		if('@novice){
			mes "-Returned camera to Honest and received items-";
			next;
		}
		else {
			mes "-Returned camera to Honest-";
			next;
		}
		EMOTION 21;
		mes "[Honest]";
		mes "Thank you so much for helping me so many times.";
		mes "If I ever need anything else, I'll make a request to the Adventurers Academy, so I'll definitely be in touch then!";
		next;
		if('@novice){
			mes "[Honest]";
			mes "Ah! That's it!";
			mes "It's an item called an Yggdrasil leaf, and it can help people who have fallen.";
			mes "Use it for your adventures.";
			next;
			if(!checkweight(610,10)){
				mes "-overweight-";
				close;
			}
			getitem 610,10;
		}
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[Honest]";
		mes "Thank you so much for helping me so many times.";
		mes "If I need any more help, I'll make a request to the Adventurer's Academy, so I'll definitely be in touch then!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_OTHER:
	switch(AC_QUEST_LV_4){
	case 0:
		mes "[Honest]";
		mes "I wonder if we need this and this material after that?";
		close;
	case 1:
	case 2:
		mes "[Honest]";
		mes "Thank you!";
		mes "Thank you for your help.";
		close;
	case 3:
		mes "[Honest]";
		mes "Now I have three boss monster related documents.";
		mes "I'm sure I'll need more, so thanks again.";
		close;
	case 4:
		mes "[Honest]";
		mes "Thank you!";
		mes "Thank you for your help.";
		close;
	case 5:
		mes "[Honest]";
		mes "That's really great. ......";
		mes "Me too" + strcharinfo(0);
		mes "I have to study hard so I can be an adventurer like [Honest].";
		mes "Well, I'll see you soon.";
		close;
	case 6:
		mes "[Honest]";
		mes "Thanks again!";
		mes "That's really helpful.";
		close;
	case 7:
		mes "[Honest]";
		mes "Let's see, ......";
		mes "I think I'm going to have a serious talk with my parents once.";
		mes "If I'm sneaking around and gathering material, they'll probably find out sooner or later.";
		next;
		mes "[Honest]";
		mes ""+strcharinfo(0) + "I'll show you the pictures I've taken and have a serious talk with you.";
		close;
	case 8:
		mes "[Honest]";
		mes "One more place to go and we'll have a full set of materials for now.";
		mes "This is thanks to the hard work of " + strcharinfo(0) + ".";
		mes "I'll send out another request in a little while, thank you.";
		close;
	case 9:
		mes "[Honest]";
		mes "Thanks again and again for your help.";
		mes "If I need any more help, I'll make a request to the Adventurer's Academy, so I'll definitely be in touch then!";
		close;
	}
}
prt_fild02.gat,305,157,0	script	# shooting point prt02	139,5,5,{
	if(AC_QUEST_LV_4!=0) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
pay_fild04.gat,267,193,0	script	# shooting point PAY04	139,5,5,{
	if(AC_QUEST_LV_4!=1) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
moc_fild18.gat,232,217,0	script	# shooting point MOC18	139,5,5,{
	if(AC_QUEST_LV_4!=2) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should just shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
gef_fild01.gat,208,242,0	script	# shooting point GEF01	139,5,5,{
	if(AC_QUEST_LV_4!=3) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
moc_fild17.gat,146,145,0	script	# shooting point MOC17	139,5,5,{
	if(AC_QUEST_LV_4!=4) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
moc_fild03.gat,70,336,0	script	# shooting point MOC03	139,5,5,{
	if(AC_QUEST_LV_4!=5) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
gef_fild09.gat,227,29,4	script	Info Board	835,{
	mes "[Orc Village]";
	mes "Attention!";
	mes "Orcs will appear ahead.";
	mes "Please beware of Orc Warriors, Orc Ladies and High Orcs.";
	mes "Also, please be especially careful of Orc Heroes and Orc Lords.";
	close;
}
gef_fild10.gat,251,368,0	script	# shooting point GEF10	139,5,5,{
	if(AC_QUEST_LV_4!=6) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
xmas_dun02.gat,131,130,0	script	# shooting point XMS02	139,5,5,{
	if(AC_QUEST_LV_4!=7) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
prt_sewb4.gat,100,92,0	script	# shooting point SEW04	139,5,5,{
	if(AC_QUEST_LV_4!=8) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I guess I should shoot here.";
		next;
		mes "-Photography completed-";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFF Return to Geffen and report to ^FF0000Honest^000000-";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "I don't see the need to take a picture.";
		next;
		mes "^FF0000 [Mission] ^000000-^0000FFGo back to Geffen and report to ^FF0000Honest^000000-";
		close;
	}
}
