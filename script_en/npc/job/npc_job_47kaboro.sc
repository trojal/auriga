//====================================================================
//Ragnarok Online - Kagerou Oboro Jobchange Script by refis
// - CHANGE_KO -> 0-11
// - CHANGE_KO -> 0-11
//====================================================================

que_ng.gat,28,156,0 script first #ko 139,1,1,{
	if(Job == Job_Ninja && BaseLevel >= 99 && JobLevel >= 70 && CHANGE_KO == 0) {
		mes "-I hear a voice I've heard somewhere before-";
		next;
		mes "[Mysterious Voice A]";
		mes "Hey, it's been a while." ;
		mes "How are the young people who have joined the clan since I left here?" ;
		next;
		mes "[Mysterious Voice B]";
		mes "Mm. A lot of them have joined us who have quite a lot of guts." ;
		mes "Your eye for people hasn't been abandoned yet, ......." ;
		next;
		mes "[Mysterious Voice A]";
		mes "I'm honored to hear you say so." ;
		mes "I was just sent to a place with bad air quality and missed this place, but ......." ;
		next;
		mes "[Mysterious Voice A]";
		mes "How about it, isn't it time for a change?" ;
		next;
		mes "[Mystery Voice B]";
		mes "I see you haven't let up on your unfinished business." ;
		mes "Do you think that He will forgive you?" ;
		next;
		mes "[Mysterious Voice A]";
		mes "I'm just kidding." ;
		mes "By the way, have any of you newbies found ^BD0408 that place ^000000?" ;
		next;
		mes "[Mysterious voice B]";
		mes "No, finding the hidden place is another trial ......." ;
		next;
		mes "[Mystery Voice A]";
		mes "You are still as inflexible as ever." ;
		mes "That place, just a wall ......." ;
		next;
		mes "[Mysterious Voice B]";
		mes "...... Wait, someone is listening!" ;
		mes "You're back in charge now!" ;
		next;
		mes "-I can't hear you talking." ;
		mes " hidden places, walls, trials ......" ;
		mes " What on earth are they talking about? -";
		setquest 5131;
		set CHANGE_KO,1;
		close;
	}
	end;
}

que_ng.gat,21,76,0 script Wall with a picture on it#ko 844,{
	if(Job == Job_Kagerou || Job == Job_Oboro) {
		mes "-I have no more use for this place-";
		close;
	}
	if(CHANGE_KO == 1) {
		mes "-I found what I think is a hidden place-";
		next;
		mes "-I wonder why I didn't notice it when I came to this room before-";
		next;
		mes "-Anyways, to get inside, you need to go to ...... -";
		next;
		if(select("tear off the picture", "hold your hand over the picture") == 1) {
			mes "-I can't hurt someone else's stuff without permission-";
			close;
		}
		mes "-When I put my hand in front of the painting, I felt something pull hard on it-";
		close2;
		warp "job_ko.gat",26,111;
		end;
	}
	if(CHANGE_KO >= 2) {
		mes "-^25C18DNinja mansion^000000 entrance to a hidden room-";
		next;
		if(select("enter", "don't enter") == 2) {
			mes "-You have left the wall-";
			close;
		}
		mes "-When you put your hand in front of the painting, you felt something pull hard on it-";
		close2;
		warp "job_ko.gat",26,111;
		end;
	}
	mes "-It's a wall with a beautiful picture on it-";
	close;
}

job_ko.gat,25,115,4 script Mysterious Old Man#ko 588,{
	switch(CHANGE_KO) {
	case 1:
		cutin "job_ko03",2;
		mes "-^1A95E6Old Man is quietly meditating^000000-";
		next;
		if(select("ignore", "talk to") == 1) {
			cutin "job_ko03",255;
			mes "-you have gently left the place-";
			close;
		}
		mes "-^1A95E6You spoke to Old Man but he didn't respond ......" ;
		mes " You tried to walk away^000000-";
		next;
		mes "[Mysterious Old Man]";
		mes "Someone finally got there." ;
		mes "Hmmm ...... It's been a while since I've seen a living person." ;
		next;
		menu "What the hell is this place ......?" ,-;
		mes "-^1A95E6Old Man ignored you and kept talking ^000000-";
		next;
		mes "[Mysterious Old Man]";
		mes "Long ago, there was a family in Amatsu that secretly lived in the shadows of history ......" ;
		next;
		mes "[Old Man of Mystery]";
		mes "Lurking in the shadows like a sunflower ......" ;
		mes "Yes, a family who wished for a place where the sun shines ......" ;
		next;
		mes "[Mysterious Old Man]";
		mes "A clan that swore allegiance to only one Lord: ......" ;
		next;
		mes "[Old Man of Mystery]";
		mes "dependably ......" ;
		next;
		mes "[Mystery Old Man]";
		mes "Loyal ......" ;
		next;
		mes "[Mystery Old Man]";
		mes "and strong......" ;
		next;
		menu "What happened to that family? ",-;
		mes "-^1A95E6Old Man turned his lonely eyes to you ^000000-";
		next;
		mes "[Mysterious Old Man]";
		mes "Why would you want to know about a family abandoned by the Lord and by history? ";
		next;
		if(select("..... .because it's Ninja", "just curious") == 2) {
			mes "[Mysterious Old Man]";
			mes "...... I see." ;
			mes "Sorry, you'll have to leave." ;
			close2;
			warp "amatsu.gat",147,136;
			end;
		}
		cutin "job_ko02",2;
		mes "[Mysterious Old Man]";
		mes "Ninja!";
		mes "Indeed, there was a time when the family was called Ninja. ......." ;
		next;
		set CHANGE_KO,2;
		chgquest 5131,5132;
		mes "[Mysterious Old Man]";
		mes "I will tell you an old story that has been handed down to you." ;
		mes "Tell the story of a forgotten family ......." ;
		close2;
		cutin "job_ko03",255;
		end;
	case 2:
		cutin "job_ko01",2;
		mes "-^1A95E6The mysterious Old Man began to speak in a quiet voice, as if he were telling his grandchildren an old story^000000-";
		next;
		mes "[Mysterious Old Man]";
		mes "It was not told for so long that no one living in Amatsu today will remember it." ;
		next;
		mes "[Mysterious Old Man]";
		mes "There was a family that chose to work in the shadow of the lord of the castle and live for him." ;
		next;
		mes "[Old Man of Mystery]";
		mes "A loyal clan that would do anything difficult for the Lord. ......." ;
		next;
		mes "[Old Man of Mystery]";
		mes "They were also called the Ninja or dark clan, but never because the clan wanted to be called that." ;
		next;
		mes "[Mysterious Old Man]";
		mes "They were the limbs of the lord of the castle, but because of their abilities, they caused problems." ;
		next;
		menu "What is the problem?" ,-;
		mes "[Mysterious Old Man]";
		mes "A thoroughly secretive organization in which even the principal castle owner cannot get the whole picture." ;
		next;
		mes "[Mysterious Old Man]";
		mes "Those who became aware of the clan's existence investigated relentlessly, but were unable to obtain any information." ;
		next;
		mes "[Mysterious Old Man]";
		mes "Eventually, even the lord of the castle became afraid of him and gradually kept him away. ......" ;
		next;
		mes "[Old Man of Mystery]";
		mes "Even though he had to leave the castle lord's side, the family never betrayed the lord. ......." ;
		next;
		menu "You were a loyal family.",-;
		cutin "job_ko03",2;
		mes "[Mysterious Old Man]";
		mes "Yes, they were too loyal. ......." ;
		next;
		set CHANGE_KO,3;
		chgquest 5132,5133;
		mes "-^1A95E6Old Man looked even more desolate. ^000000Continue talking to him-";
		close2;
		cutin "job_ko02",255;
		end;
	case 3:
		cutin "job_ko03",2;
		mes "[Mysterious Old Man]";
		mes "The family has been hiding in the shadows for far too long." ;
		mes "The current lord of the castle probably doesn't even know about the clan." ;
		next;
		menu "............" ,-;
		cutin "job_ko01",2;
		mes "[Mysterious Old Man]";
		mes "I am Ninja, or Gion, the last guide of the clan called the dark clan." ;
		next;
		if(select("Rest now", "I want to reach further extremes") == 1) {
			cutin "job_ko04",2;
			mes "[Guiding hand, Guion]";
			mes "...... Were you an assassin who wanted this old man's life?" ;
			next;
			mes "[Guiding Hand, Guion]"; mes "[Guiding Hand, Guion]
			mes "Is that why you took an interest in the family ......?" ;
			mes "But I'm not going to give it to you so easily." ;
			next;
			mes "[Guide Guion]";
			mes "I'm not going to take your life, but ......." ;
			next;
			mes "-^1A95E6I get a big shock and my consciousness fades away. ...... ^000000-";
			close2;
			percentheal -99,0;
			warp "amatsu.gat",147,136;
			end;
		}
		cutin "job_ko02",2;
		mes "[guiding hand gion]";
		mes "Polarity ...... ka." ;
		mes "I haven't heard that word in a long time." ;
		next;
		mes "[Guiding hand, Guion]";
		mes "It may be some kind of guidance that brought you here. ......." ;
		next;
		mes "[Guiding Hand Guion]"; mes "[Guiding Hand Guion]"; mes "[Guiding Hand Guion]
		mes "But I am sorry, there is nothing I can teach you." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "But I can only guide you to the ^33CC71" +(Sex? "Shadow Wolf": "Oboro")+ "path^000000." ;
		next;
		mes "-^1A95E6Consciousness fades away and Gion's voice is heard from afar^000000-";
		next;
		set CHANGE_KO,4;
		chgquest 5133,5134;
		mes "[Guiding hand Gion]";
		mes "With me, the guiding hand";
		mes (Sex? "Shadow Wolf": "Oboro")+ "If you are ready to walk the path to";
		mes "Come again to see me." ;
		close2;
		warp "amatsu.gat",147,136;
		end;
	case 4:
		cutin "job_ko02",2;
		mes "[guiding hand guion]";
		mes "hmm ...... I thought you might not be afraid to come ^000000 to ^33CC71" +(Sex? "Shadow Wolf": "Oboro")+ "the way to ......" ;
		mes "It seems that it was an unnecessary worry." ;
		next;
		mes "[Guiding hand, Gion]";
		mes "In order to step into the next level, you must have a right mind to resist temptation, and a strong spirit that will not falter in the face of the unknown." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]";
		mes "The ancestors of the family acquired their spirit through four kinds of trials." ;
		next;
		menu "Four kinds of trials?" ,-;
		cutin "job_ko01",2;
		mes "[Guiding hand, Gion]";
		mes "Yes, the ancestors cultivated the right mind and spirit by challenging the four kinds of trials: ^087FF8Knowledge, Survival, Weaponry, and Combat^000000." ;
		next;
		mes "[Guiding hand, Gion]";
		mes "You seem to want to know what the ordeals are like." ;
		mes "I can explain it to you." ;
		while(1) {
			next;
			switch(select("Test of Knowledge", "Test of Survival", "Test of Weapons", "Test of Combat")) {
			case 1:
				mes "[Guiding hand, Guion]";
				mes "To serve as an assistant to the lord of the castle, you must have a great deal of knowledge." ;
				mes "The trials are for that purpose." ;
				next;
				mes "[Guide Guion]";
				mes "Answer 10 questions and get at least 9 correct to get through the ordeal." ;
				next;
				mes "[Guide Guion]"; mes "[Guidance Guion]"; mes "[Guidance Guion]"; mes "[Guidance Guion]
				mes "If you have accumulated knowledge on a regular basis, you should have no problem." ;
				set '@flag,'@flag|1;
				if('@flag == 15)
					break;
				mes "Which ordeal shall we talk about next?" ;
				continue;
			case 2:
				mes "[Guide Guion]";
				mes "Because the mission is not always safe." ;
				mes "Survival is important." ;
				next;
				mes "[Guide Guion]";
				mes "This ordeal was called Sugoroku by our ancestors." ;
				mes "The ordeal is to advance as many times as the dice roll." ;
				next;
				mes "[Guide Guion]";
				mes "Well, you guessed it as soon as I said 'slog'." ;
				next;
				mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
				mes "But it's so called an ordeal." ;
				mes "It's not just a pastime." ;
				next;
				mes "[Guide Guion]";
				mes "There will be squares to help you and squares to hinder you." ;
				next;
				mes "[Guide Guion]"; mes "[Guide Guion]"; mes "[Guide Guion]"; mes "[Guide Guion]
				mes "If you deal with them wisely, you will overcome them." ;
				set '@flag,'@flag|2;
				if('@flag == 15)
					break;
				mes "Which ordeal can we talk about next?" ;
				continue;
			case 3:
				mes "[Guiding hand, Guion]";
				mes "The family used a unique weapon." ;
				mes "Most of them were of their own making." ;
				next;
				mes "[Guiding hand, Guion]";
				mes "They say that those who created their own unique weapons were called the blessed ones." ;
				next;
				mes "[Guiding Hand, Guion]"; mes "[Guiding Hand, Guion]"; mes "[Guiding Hand, Guion]
				mes "The goal of this ordeal is to create a weapon that you will use and to strengthen that weapon." ;
				next;
				mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
				mes "I pray that you may be called the Blessed One." ;
				set '@flag,'@flag|4;
				if('@flag == 15)
					break;
				mes "Which ordeal shall we talk about next?" ;
				continue;
			case 4:
				mes "[Guide Guion]";
				mes "The task is not always given to just one person." ;
				mes "It is also common for a single mission to be carried out by several people." ;
				next;
				mes "[Guiding hand guion]";
				mes "The ordeal of combat can only be attempted by those who have overcome all the ordeals of knowledge, survival, and weaponry." ;
				mes "So you mean the last ordeal. ......." ;
				next;
				mes "[Guiding Guidance Guion]";
				mes "Unlike the other ordeals, it requires you to compete with others. ......." ;
				next;
				mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
				mes "There is only one goal!" ;
				mes "Only the one who defeats the target the fastest will survive the ordeal." ;
				next;
				mes "[Guide Guion]";
				mes "Well, if there is no one to compete with you when you go through the ordeal, then that too is your luck." ;
				set '@flag,'@flag|8;
				if('@flag == 15)
					break;
				mes "Which ordeal can we talk about next?" ;
				continue;
			}
			break;
		}
		next;
		cutin "job_ko02",2;
		mes "[guiding hand guion]";
		mes "Seeing is believing, as they say." ;
		mes "It would be most effective to go there in person." ;
		next;
		set CHANGE_KO,5;
		chgquest 5134,5135;
		mes "[Guide Guion]";
		mes "If you are ready to be tested, you may call out again." ;
		close2;
		cutin "job_ko02",255;
		end;
	case 5:
		cutin "job_ko03",2;
		mes "[Guiding hand, Guion]";
		mes "It's been a really long time. ......" ;
		mes "My heart is so excited like this." ;
		next;
		mes "[Guiding hand, Guion]";
		mes "I am excited beyond my years, thanks to a young man who is going down a new path." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]";
		mes "I have already explained the ordeal to you." ;
		mes "Now let me tell you a little about the clan." ;
		next;
		cutin "job_ko01",2;
		mes "[Guiding hand, Guion]";
		mes "The clan began with two warriors. ......." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "The Shadow Wolf, a warrior like the wolf that lurks in the shadows, likened to the sun. ......." ;
		next;
		mes "[Guiding hand Gion]";
		mes "Oboro, the warrior who is like the pale moonlight compared to the moon. ......." ;
		next;
		mes "[Guiding hand Gion]";
		mes "The sun and the moon both illuminate the world, but the two warriors are similar and different." ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "There was a time when they were at odds with each other." ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "But it did not take long before we were of the same clan." ;
		next;
		menu "What in the world happened to you?" ,-;
		cutin "job_ko02",2;
		mes "[Guiding hand, Guion]";
		mes "Woo hoo hoo." ;
		mes "I'm a little tired from all the talking." ;
		mes "I'll let you hear the rest of the story when I get through the ordeal." ;
		next;
		mes "[Guiding Guidance Guion]";
		mes "Which ordeal would you choose to begin with?" ;
		next;
		switch(select("Test of Knowledge", "Test of Survival", "Test of Weapons")) {
		case 1:
			mes "[Guide Guion]";
			mes "^339CCCC Do we start with the ordeal of knowledge ^000000?" ;
			mes "Woo hoo hoo." ;
			mes "I can't wait to see the look on his face when he finds out that you have chosen this path." ;
			next;
			menu "That guy?" ,-;
			set CHANGE_KO,6;
			setquest 5136;
			mes "[Guiding hand, Guion]";
			mes "Woohoo, woohoo." ;
			mes "You'll have to wait until we meet." ;
			mes "The test of knowledge is this way." ;
			close2;
			warp "job_ko.gat",72,128;
			end;
		case 2:
			mes "[guiding hand guion]";
			mes "^339CCCC survival ordeal^000000 to start?" ;
			mes "It may be a lonely ordeal. ......." ;
			next;
			set CHANGE_KO,6;
			setquest 5137;
			mes "[Guiding hand, Gion]";
			mes "You have nothing to worry about." ;
			mes "The test of survival is this way." ;
			close2;
			warp "job_ko.gat",62,16;
			end;
		case 3:
			mes "[guiding hand guion]";
			mes "^339CCCC weapon trials^000000 to start?" ;
			mes "Then ...... before the ordeal." ;
			next;
			set CHANGE_KO,6;
			setquest 5138;
			getitem 1002,5;
			getitem 1010,1;
			mes "-5 iron ore received 1 Phracon -";
			next;
			mes "[Guide Guion]";
			mes "You will need that." ;
			mes "The weapon trials are this way." ;
			close2;
			warp "job_ko.gat",121,129;
			end;
		}
	case 6:
		set '@test1,checkquest(5136);
		set '@test2,checkquest(5137);
		set '@test3,checkquest(5138);
		if('@test1) {
			set '@test$, "knowledge";
			if('@test1 & 0x1) {
				set '@x,72;
				set '@y,128;
			}
		}
		else if('@test2) {
			set '@test$, "survival";
			if('@test2 & 0x1) {
				set '@x,62;
				set '@y,16;
			}
		}
		else if('@test3) {
			set '@test$, "weapon";
			if('@test3 & 0x1) {
				set '@x,121;
				set '@y,129;
			}
		}
		if('@x && '@y) {
			cutin "job_ko04",2;
			mes "[guiding hand guion]";
			mes "^339CCC" +'@test$+ "Are you undergoing the ordeal ^000000?" ;
			mes "Are you heading for the ordeal again?" ;
			next;
			switch(select("Heading to the trials", "Back to town")) {
			case 1:
				mes "[Guide Guion]";
				mes ""+'@test$+" ordeal is this way."" ;
				close2;
				warp "job_ko.gat",'@x,'@y;
				end;
			case 2:
				mes "[Guide Guion]";
				mes "Let's get you back to town." ;
				close2;
				warp "amatsu.gat",147,136;
				end;
			}
		}
		cutin "job_ko01",2;
		mes "[guiding hand gion]";
		mes "Have you been through the ^000000 ordeal of ^339CCC "+'@test$+"?" ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "Did we both get satisfactory results?" ;
		next;
		menu "Continue the story: ......" ,-;
		cutin "job_ko02",2;
		mes "[Guiding hand, Guion]";
		mes "Don't be so hasty, I remember." ;
		mes "...... Where were we?" ;
		mes "...... Oh, yes, you did." ;
		next;
		mes "[Guiding hand, Gion]";
		mes "The Shadow Wolf, a warrior like the wolf that lurks in the shadows, likened to the sun. ......." ;
		next;
		mes "[Guiding hand Gion]";
		mes "Oboro, the warrior who is like the pale moonlight compared to the moon. ......." ;
		next;
		mes "[Guiding Hand Guion]"; mes "[Guiding Hand Guion]"; mes "[Guiding Hand Guion]
		mes "Originally, the two were not on good terms." ;
		mes "Their personalities and ways of thinking were all opposites. ......." ;
		next;
		mes "[Guiding Guidance Guion]";
		mes "They first met on the battlefield ......." ;
		mes "They also met as enemies." ;
		next;
		mes "[Guide Guion]";
		mes "Under such circumstances, they had no choice but to hurt and hate each other. ......." ;
		next;
		mes "[Guide Guion]"; mes "[Guidance Guion]"; mes "[Guidance Guion]"; mes "[Guidance Guion]
		mes "But that's what war is." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "The friends who were laughing next to me yesterday are no longer with me today. ......." ;
		mes "That's the kind of place it is." ;
		next;
		mes "[Guide Guion]";
		mes "And moreover, enemies of each other." ;
		mes "Your hatred for the one who took your friends from you will only grow. ......." ;
		next;
		mes "[Guide Guion]";
		mes "I'm a little tired." ;
		mes "We can talk about the rest after we get through one more ordeal." ;
		next;
		mes "[Guide Guion]";
		mes "Which ordeal is the second? ";
		if(!' @test1)
			set '@str1$, "Test of Knowledge";
		if(!' @test2)
			set '@str2$, "Trial of Survival"; if(!' @test2)
		if(!' @test3)
			set '@str3$, "Trial of Weapons";
		next;
		switch(select('@str1$,'@str2$,'@str3$)) {
		case 1:
			mes "[Guiding hand, Guion]";
			mes "^339CCCC knowledge ordeal^000000?" ;
			mes "Woohoo." ;
			mes "I can't wait to see the look on his face when he finds out you chose this path." ;
			next;
			menu "That guy?" ,-;
			set CHANGE_KO,7;
			setquest 5136;
			mes "[Guiding hand, Guion]";
			mes "Woohoo, woohoo." ;
			mes "You'll have to wait until we meet." ;
			mes "The test of knowledge is this way." ;
			close2;
			warp "job_ko.gat",72,128;
			end;
		case 2:
			mes "[guiding hand guion]";
			mes "^339CCC survival ordeal^000000?" ;
			mes "It may be a lonely ordeal. ......." ;
			next;
			set CHANGE_KO,7;
			setquest 5137;
			mes "[Guiding hand, Gion]";
			mes "You have nothing to worry about." ;
			mes "The test of survival is this way." ;
			close2;
			warp "job_ko.gat",62,16;
			end;
		case 3:
			mes "[guiding hand guion]";
			mes "^339CCCC weapon trials^000000?" ;
			mes "So before the ordeal, ......." ;
			next;
			set CHANGE_KO,7;
			setquest 5138;
			getitem 1002,5;
			getitem 1010,1;
			mes "-5 iron ore received 1 Phracon -";
			next;
			mes "[Guide Guion]";
			mes "You will need that." ;
			mes "The weapon trials are this way." ;
			close2;
			warp "job_ko.gat",121,129;
			end;
		}
	case 7:
		set '@test1,checkquest(5136);
		set '@test2,checkquest(5137);
		set '@test3,checkquest(5138);
		if('@test1 & 0x1) {
			set '@test$, "knowledge";
			set '@x,72;
			set '@y,128;
		}
		else if('@test2 & 0x1) {
			set '@test$, "Survival";
			set '@x,62;
			set '@y,16;
		}
		else if('@test3 & 0x1) {
			set '@test$, "Weapon"; set '@x,62; set '@y,16; }
			set '@x,121;
			set '@y,129;
		}
		if('@x && '@y) {
			cutin "job_ko04",2;
			mes "[guiding hand guion]";
			mes "^339CCC" +'@test$+ "Are you undergoing the ordeal ^000000?" ;
			mes "Are you heading for the ordeal again?" ;
			next;
			switch(select("Heading to the trials", "Back to town")) {
			case 1:
				mes "[Guide Guion]";
				mes ""+'@test$+" ordeal is this way."" ;
				close2;
				warp "job_ko.gat",'@x,'@y;
				end;
			case 2:
				mes "[Guide Guion]";
				mes "Let's get you back to town." ;
				close2;
				warp "amatsu.gat",147,136;
				end;
			}
		}
		if('@test1 & 0x8 && '@test2 & 0x8) {
			set '@type,3;
			set '@str$, "Knowledge, test of survival";
		}
		else if('@test1 & 0x8 && '@test3 & 0x8) {
			set '@type,2;
			set '@str$, "Knowledge, trial of arms";
		}
		else if('@test2 & 0x8 && '@test3 & 0x8) {
			set '@type,1;
			set '@str$, "Survival, weapon trials";
		}
		cutin "job_ko04",2;
		mes "[guiding hand, gion]";
		mes "^339CCC" +'@str$+ "Did you survive ^000000?" ;
		next;
		mes "[guiding hand gion]";
		mes "Now you have two ......." ;
		mes "Did you get something out of it?" ;
		next;
		cutin "job_ko01",2;
		mes "[guiding hand guion]";
		mes "So let's talk about the rest of the story." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "The Shadow Wolf, a warrior like the wolf that lurks in the shadows, likened to the sun. ......." ;
		next;
		mes "[Guiding hand Gion]";
		mes "Oboro, the warrior who is like the pale moonlight compared to the moon. ......." ;
		next;
		mes "[Guiding Hand Gion]";
		mes "I told you where the two warriors met as enemies on the battlefield." ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "The time has finally come for the long war to end." ;
		mes "Peace has come, and even the survivors are wounded and exhausted. ......" ;
		next;
		mes "[Guiding hand, Gion]";
		mes "The two warriors also stopped fighting." ;
		mes "They no longer tried to take each other's lives, but these two also needed time to heal." ;
		next;
		mes "[Guiding hand, Guion]";
		mes "Then a man appeared before them." ;
		mes "It is said that it was that man who won the loyalty of the two warriors, although the details are not told." ;
		next;
		menu "Who is that man?" ,-;
		mes "[Guiding hand, Guion]";
		mes "There is little that has been handed down about the man." ;
		mes "The only thing that is recorded is that he had the loyalty of two people." ;
		next;
		mes "[Guide Guion]";
		mes "I believe they are probably the ancestors of the current Lord of Amatsu Castle." ;
		next;
		mes "[Guiding Hand Guion]"; mes "[Guiding Hand Guion]";
		mes "The story about the family is running out." ;
		mes "If you've survived the third ordeal, we'll talk again." ;
		next;
		switch('@type) {
		case 1:
			mes "[Guiding hand, Guion]";
			mes "^339CCCC knowledge test ^000000?" ;
			mes "Woohoo." ;
			mes "I can't wait to see the look on his face when he finds out you chose this path." ;
			next;
			menu "That guy?" ,-;
			set CHANGE_KO,8;
			setquest 5136;
			mes "[Guiding hand, Guion]";
			mes "Woohoo, woohoo." ;
			mes "You'll have to wait until we meet." ;
			mes "The test of knowledge is this way." ;
			close2;
			warp "job_ko.gat",72,128;
			end;
		case 2:
			mes "[guiding hand guion]";
			mes "^339CCC survival ordeal^000000?" ;
			mes "It may be a lonely ordeal. ......." ;
			next;
			set CHANGE_KO,8;
			setquest 5137;
			mes "[Guiding hand, Gion]";
			mes "You have nothing to worry about." ;
			mes "The test of survival is this way." ;
			close2;
			warp "job_ko.gat",62,16;
			end;
		case 3:
			mes "[guiding hand guion]";
			mes "^339CCCC weapon trials^000000?" ;
			mes "So before the ordeal, ......." ;
			next;
			set CHANGE_KO,8;
			setquest 5138;
			getitem 1002,5;
			getitem 1010,1;
			mes "-5 iron ore received 1 Phracon -";
			next;
			mes "[Guide Guion]";
			mes "You will need that." ;
			mes "The weapon trials are this way." ;
			close2;
			warp "job_ko.gat",121,129;
			end;
		}
	case 8:
		set '@test1,checkquest(5136);
		set '@test2,checkquest(5137);
		set '@test3,checkquest(5138);
		if('@test1 & 0x1) {
			set '@test$, "knowledge";
			set '@x,72;
			set '@y,128;
		}
		else if('@test2 & 0x1) {
			set '@test$, "Survival";
			set '@x,62;
			set '@y,16;
		}
		else if('@test3 & 0x1) {
			set '@test$, "Weapon"; set '@x,62; set '@y,16; }
			set '@x,121;
			set '@y,129;
		}
		if('@x && '@y) {
			cutin "job_ko04",2;
			mes "[guiding hand guion]";
			mes "^339CCC" +'@test$+ "Are you undergoing the ordeal ^000000?" ;
			mes "Are you heading for the ordeal again?" ;
			next;
			switch(select("Heading to the trials", "Back to town")) {
			case 1:
				mes "[Guide Guion]";
				mes ""+'@test$+" ordeal is this way."" ;
				close2;
				warp "job_ko.gat",'@x,'@y;
				end;
			case 2:
				mes "[Guide Guion]";
				mes "Let's get you back to town." ;
				close2;
				warp "amatsu.gat",147,136;
				end;
			}
		}
		cutin "job_ko01",2;
		mes "[Guiding hand, Gion]";
		mes "Is there only one ordeal left?" ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "Unlike the other ordeals, you are required to compete with others. ......" ;
		mes "It's not that kind of ordeal." ;
		next;
		menu "That ...... What's the rest of the story?" ,-;
		cutin "job_ko02",2;
		mes "[Guiding hand, Guion]";
		mes "Woah woah woah, you remember." ;
		mes "Then let's continue." ;
		next;
		mes "[Guiding hand, Guion]";
		mes "The Shadow Wolf, a warrior like a wolf lurking in the shadows, likened to the sun. ......." ;
		next;
		mes "[Guiding hand Gion]";
		mes "Oboro, the warrior who is like the pale moonlight compared to the moon. ......." ;
		next;
		mes "[Guiding Hand, Guion]"; mes "[Guiding Hand, Guion]
		mes "It is said that the man who won the loyalty of these two warriors had a somewhat unusual character." ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "It is said that he preferred discussion to conflict, loved to joke, and was fond of women." ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "woohoo......" ;
		mes "I don't know why this little thing is being passed on, but ......." ;
		next;
		mes "[Guiding hand, Guion]";
		mes "It seems that the man wished to bring the two warriors together." ;
		mes "Maybe it's because they didn't get along so easily in the long war." ;
		next;
		mes "[Guide Guion]";
		mes "They say he paired the two warriors together on missions or locked them in secret rooms, leaving them alone together." ;
		next;
		menu "If only I had enjoyed myself. ......" ,-;
		mes "[Guiding hand, Guion]";
		mes "Woo hoo hoo, you may be right." ;
		mes "Well, thanks to that, the two warriors are now in a fine union." ;
		next;
		mes "[Guiding hand, Guion]";
		mes "The beginning of a family, I suppose." ;
		next;
		menu "And then what happened? ",-;
		mes "[Guiding hand, Guion]";
		mes "Regrettably, what happened after that does not seem to have been deliberately communicated by anyone." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "I think it is because I wanted him to move forward into the future without being bound by the past. ......" ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "Well, it's time to begin the final ordeal, isn't it?" ;
		next;
		set CHANGE_KO,9;
		chgquest 5135,72900;
		mes "[Guiding hand, Guion]";
		mes "If you're feeling tired, you might want to rest a while." ;
		mes "Call out to him when you are ready." ;
		close2;
		cutin "job_ko01",255;
		end;
	case 9:
		cutin "job_ko01",2;
		mes "[Guiding hand, Guion]";
		mes "You could have rested a little longer." ;
		mes "Or are you in a hurry?" ;
		next;
		input '@str$;
		cutin "job_ko03",2;
		mes "[Guide Guion]";
		mes "^B24E59" +'@str$+ "^000000?" ;
		next;
		mes "[Guiding hand Gion]";
		mes "It's hard to understand the young man's mindset." ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "Well, you've come this far, I'm sure you can overcome your final ordeal." ;
		next;
		cutin "job_ko01",2;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]"; next; cutin "job_ko01",2; next
		mes "Well!" ;
		mes "Let's discuss the trials of combat." ;
		next;
		mes "[Guide Guion]";
		mes "The target of the ordeal of battle is a monster called ^000000, past ^FF000000 clan." ;
		next;
		mes "[Guiding hand Gion]"; mes "[Guiding hand Gion]
		mes "There are monsters with similar appearances and similar names in the ordeal." ;
		mes "Attention and fight them." ;
		next;
		mes "[Guide Guion]";
		mes "Maybe there are others who are after the same target." ;
		mes "Only the one who defeats the target will survive the ordeal." ;
		next;
		mes "[Guiding hand, Guion]";
		mes "To you" +(Sex? "Shadow Wolf": "Oboro")+ "May the blessings of the Lord be upon you. ......." ;
		next;
		set CHANGE_KO,10;
		chgquest 72900,5146;
		mes "[Guiding hand, Guion]";
		mes "So let's head to the battle ordeal." ;
		close2;
		switch(rand(3)){
		case 0: warp "job_ko.gat",142,20; break;
		case 1: warp "job_ko.gat",141,80; break
		}
		end;
	case 10:
	case 11:
		cutin "job_ko03",2;
		mes "[guiding hand guion]";
		mes "Mm? Shouldn't you have taken the ^339CCC battle ordeal^000000? ";
		next;
		switch(select("I'll have you sent to the ordeal", "I'm going back to the city")) {
		case 1:
			mes "[Guiding hand, Guion]";
			mes "The place of trials is this way." ;
			close2;
			warp "job_ko.gat",141,80;
			end;
		case 2:
			mes "[Guide Guion]";
			mes "Let's get you back to town." ;
			close2;
			warp "amatsu.gat",147,136;
			end;
		}
	}
}

job_ko.gat,81,124,4 script kuga kai#ko 730,{
	if(checkquest(5136)) {
		if(checkquest(5136) & 0x8) {
			mes "[Kuga Kai]";
			mes "Come on, let's get you out." ;
			mes "Report the results to Master Guion." ;
			close2;
			warp "job_ko.gat",16,113;
			end;
		}
		if(!checkquest(5139)) {
			mes "[Kuga Kai]";
			mes "Long time no see!" ;
			next;
			menu "You are ......" ,-;
			mes "[Kuga Kai]";
			mes "I thought it was only a few days ago that you came to me for a path to Ninja. ......." ;
			next;
			mes "[Kuga Kai]";
			mes "I didn't realize you've already grown so much!" ;
			next;
			mes "[Kuga Kai]";
			mes "Ha ha ha ha!" ;
			mes "You've got guts, as I expected." ;
			mes "I like it!" ;
			next;
			mes "[Kuga Kai]";
			mes "You're going to get a ^339CCC knowledge test^000000 here." ;
			next;
			mes "[Kuga Kai]";
			mes "You're not just getting stronger, you're also acquiring knowledge, right?" ;
			next;
			if(select("Of course.", "No. ......") == 2) {
				setquest 5139;
				mes "[Kuga Kai]";
				mes "You won't get through this on guts alone." ;
				mes "Talk to me again when you're ready." ;
				close;
			}
			setquest 5139;
		}
		mes "[Kuga Kai]";
		mes "Are you ready for the trials?" ;
		next;
		switch(select("Yes", "No", "I want to go outside")) {
		case 1:
			break;
		case 2:
			mes "[Kuga Kai]";
			mes "I don't have a choice." ;
			mes "Let's wait a little longer." ;
			close;
		case 3:
			mes "[Kuga Kai]";
			mes "What?" ;
			mes "It is outrageous to turn back in the face of trials!" ;
			next;
			mes "[Kuga Kai]";
			mes "I would not complain if you excommunicated me, but ...... Well, I'll forgive you just this once." ;
			mes "Come back with full preparation." ;
			close2;
			warp "job_ko.gat",16,113;
			end;
		}
		mes "[Kuga Kai]";
		mes "Have you heard how to test your knowledge?" ;
		next;
		mes "[Kuga Kai]";
		mes "Listen to the questions I give you and pick the one you think is correct." ;
		mes "You won't get through the trials with half a dozen correct answers." ;
		next;
		mes "[Kuga Kai]";
		mes "Then let the trials begin!" ;
		next;
		for(set '@i,0; '@i<=47; set '@i,'@i+1)
			set '@list['@i],'@i;
		for(set '@i,1; '@i<=10; set '@i,'@i+1) {
			set '@r,rand(getarraysize('@list));
			set '@test,'@list['@r];
			deletearray '@list['@r],1;
			mes "[Kuga Kai]";
			if('@i<10)
				mes "第" +'@i+ "問";
			else
				mes "Final question";
			switch('@test) {
			case 0:
				mes "Answer the status that has the greatest impact on increasing the attack power of the single flash skill." ;
				next;
				if(select("Vit", "MaxHP", "Int", "MaxSP")==2)
					set '@m,'@m+1;
				break;
			case 1:
				mes "Select the most effective card among the following to insert into the shoes to increase the attack power of the flash skill." ;
				next;
				if(select("Gold Osidos card", "Mater card", "Thanatos Hatred card", "Edoga card")==2)
					set '@m,'@m+1;
				break;
			case 2:
				mes "How many levels of throwing training are required to learn a flash?" ;
				next;
				if(select("5", "7", "6", "8")==2)
					set '@m,'@m+1;
				break;
			case 3:
				mes "Answer the maximum level of the empty cicada skill." ;
				next;
				if(select("5", "3", "1", "4")==1)
					set '@m,'@m+1;
				break;
			case 4:
				mes "What is the maximum number of attacks when the flame formation skill is level 10?" ;
				next;
				if(select("7", "8", "9", "10")==3)
					set '@m,'@m+1;
				break;
			case 5:
				mes "Answer the catalyst needed to use the flame formation skill." ;
				next;
				if(select("ice flash stone", "fire stone", "wind chime stone", "shadow pearl")==2)
					set '@m,'@m+1;
				break;
			case 6:
				mes "What is the maximum distance traveled by shadow jump Lv 5?" ;
				next;
				if(select("9 steps", "11 steps", "13 steps", "15 steps")==1)
					set '@m,'@m+1;
				break;
			case 7:
				mes "Which is the correct number of evasions and duration of shadow alteration level 10?" ;
				next;
				if(select("7 times-200 seconds", "5 times-220 seconds", "6 times-240 seconds", "5 times-240 seconds")==4)
					set '@m,'@m+1;
				break;
			case 8:
				mes "Answer the attack power when the haze slash skill is level 4." ;
				next;
				if(select("140%", "150%", "160%", "170%")==1)
					set '@m,'@m+1;
				break;
			case 9:
				mes "Answer the number of blows when using the bitter throw." ;
				next;
				if(select("2", "3", "4", "5")==2)
					set '@m,'@m+1;
				break;
			case 10:
				mes "Select the correct Matk and range from the following at Sakkaze level 4." ;
				next;
				if(select("Matk400-8 steps", "Matk500-7 steps", "Matk500-8 steps", "Matk400-7 steps")==3)
					set '@m,'@m+1;
				break;
			case 11:
				mes "How many steps is the basic attack distance of the shuriken throw?" ;
				next;
				if(select("7 steps", "8 steps", "9 steps", "10 steps")==3)
					set '@m,'@m+1;
				break;
			case 12:
				mes "Answer the duration of the water fugue skill at level 7." ;
				next;
				if(select("40s", "45s", "50s", "55s")==2)
					set '@m,'@m+1;
				break;
			case 13:
				mes "Choose one of the following that is not an effect of the water fugue skill." ;
				next;
				if(select("Movement speed decrease", "Water ball available", "Aqua Benedicta available", "Vit decrease")==4)
					set '@m,'@m+1;
				break;
			case 14:
				mes "Answer the level of throwing training required to master the coin throwing skill." ;
				next;
				if(select("4", "6", "8", "10")==4)
					set '@m,'@m+1;
				break;
			case 15:
				mes "Answer the amount of money spent when using the skill when the coin thrower is level 6." ;
				next;
				if(select("2000-8000Zeny", "1000-6000Zeny", "3000-8000Zeny", "3000-6000Zeny")==4)
					set '@m,'@m+1;
				break;
			case 16:
				mes "Answer the total number of skill points required to master the senyai skill." ;
				next;
				if(select("25", "30", "35", "37")==3)
					set '@m,'@m+1;
				break;
			case 17:
				mes "Answer how many steps ahead you can attack when you have mastered the Tatami-matashi skill." ;
				next;
				if(select("5", "7", "3", "1")==3)
					set '@m,'@m+1;
				break;
			case 18:
				mes "Select one of the following skills that cannot be learned when the throwing discipline skill is level 7." ;
				next;
				if(select("bitter throw", "wind devil shuriken throw", "issen", "sen throw")==4)
					set '@m,'@m+1;
				break;
			case 19:
				mes "Answer the attack power added to shuriken throwing when the throwing discipline is level 7." ;
				next;
				if(select("18", "21", "27", "30")==2)
					set '@m,'@m+1;
				break;
			case 20:
				mes "Answer the Str and Int values that increase when ghost skill level 5 is used." ;
				next;
				if(select("4", "5", "6", "7")==2)
					set '@m,'@m+1;
				break;
			case 21:
				mes "What is the correct attribute of the thunderbolt crusher?" ;
				next;
				if(select("fire", "water", "earth", "wind")==4)
					set '@m,'@m+1;
				break;
			case 22:
				mes "Answer the attack range of the dragon flame formation." ;
				next;
				if(select("3x3", "4x4", "5x5", "6x6")==3)
					set '@m,'@m+1;
				break;
			case 23:
				mes "Answer the skill level of ninja training required to master the Dragon Flame Formation." ;
				next;
				if(select("10", "9", "8", "1")==1)
					set '@m,'@m+1;
				break;
			case 24:
				mes "Answer the following Ninja skill that does not require a catalyst." ;
				next;
				if(select("flame formation", "water fugue", "red flame flower", "icicle fall")==3)
					set '@m,'@m+1;
				break;
			case 25:
				mes "Choose the most effective skill against monsters of the earth attribute among the following." ;
				next;
				if(select("SAKUFU", "RYUFU-JIN", "HYOKUSHITA", "WIND BLADE")==2)
					set '@m,'@m+1;
				break;
			case 26:
				mes "Choose one of the following incorrect combinations of skills and attributes." ;
				next;
				if(select("Red Flame Flower, Fire", "Ice Pillar Falling, Water", "Ice Spear, Earth", "Thunderbolt Crushing, Wind")==3)
					set '@m,'@m+1;
				break;
			case 27:
				mes "Choose the bitter that can do the most damage against the monster Porcellio from the following." ;
				next;
				if(select("Bitter of Fiery Fire", "Bitter of Pillar of Ice", "Bitter of Poison", "Bitter of Mad Wind")==1)
					set '@m,'@m+1;
				break;
			case 28:
				mes "Choose the most effective bitterness to use when fighting the Orc Warrior from the following." ;
				next;
				if(select("Bitter of Fiery Fire", "Bitter of Pillar of Ice", "Bitter of Poison", "Bitter of Mad Wind")==1)
					set '@m,'@m+1;
				break;
			case 29:
				mes "What is the correct power that resides in Murasame? ";
				next;
				if(select("Attack power +10% for human form monster", "Cri+10 for human form monster", "Attack power +10% for demon form monster", "Cri+10 for demon form monster")==2)
					set '@m,'@m+1;
				break;
			case 30:
				mes "Choose one of the following powers that reside in the Fuuma Shuriken, Retsuhi." ;
				next;
				if(select("Fireball Lv5,Dex-2", "Fireball Lv5,Dex-3", "Fireball Lv3,Dex-2", "Fireball Lv3,Dex-3")==1)
					set '@m,'@m+1;
				break;
			case 31:
				mes "Answer the materials needed to make 10 icicle bitterns." ;
				next;
				if(select("4 rain cloud shurikens, 2 ice flashes", "8 rain cloud shurikens, 2 ice flashes", "2 rain cloud shurikens, 1 ice flashes", "1 rain cloud shuriken, 2 ice flashes")==2)
					set '@m,'@m+1;
				break;
			case 32:
				mes "Choose one of the following that will not be effective when you assign points to Str." ;
				next;
				if(select("Melee Attack Power Increased", "Possessable Weight Increased", "Magic Attack Power Increased", "Weapon Attack Power Increased")==3)
					set '@m,'@m+1;
				break;
			case 33:
				mes "Choose one of the following that does not take effect when points are assigned to Agi." ;
				next;
				if(select("increased hit rate", "increased evasion rate", "increased attack speed", "decreased delay after attack")==1)
					set '@m,'@m+1;
				break;
			case 34:
				mes "Choose one of the following that will not be effective when you assign points to Vit." ;
				next;
				if(select("Increase Physical Defense", "Increase MaxHP", "Increase Magic Defense", "Increase Magic Attack")==4)
					set '@m,'@m+1;
				break;
			case 35:
				mes "Choose one of the following that does not take effect when you assign points to Int." ;
				next;
				if(select("MaxSP increase", "Matk increase", "SP recovery increase", "Wand attack increase")==4)
					set '@m,'@m+1;
				break;
			case 36:
				mes "Choose one of the following that does not take effect when you assign points to Dex." ;
				next;
				if(select("reduced chanting time", "increased evasion", "increased hit rate", "increased long range attack power")==2)
					set '@m,'@m+1;
				break;
			case 37:
				mes "Choose one of the following that will not be effective when you assign points to Luk." ;
				next;
				if(select("increased hit rate", "increased complete evasion rate", "reduced magic attack power", "increased critical rate")==1)
					set '@m,'@m+1;
				break;
			case 38:
				mes "Choose the following cards for weapons that are most effective when making physical attacks against large monsters." ;
				next;
				if(select("Lunatic Card", "Minotaur Card", "Skelwerker Card", "Desert Wolf Card")==2)
					set '@m,'@m+1;
				break;
			case 39:
				mes "Choose one of the following cards for weapons that is most effective when making a physical attack against a medium-sized monster." ;
				next;
				if(select("Lunatic Card", "Minotaur Card", "Skelwerker Card", "Desert Wolf Card")==3)
					set '@m,'@m+1;
				break;
			case 40:
				mes "Choose one of the following cards for weapons that is most effective when making a physical attack against small monsters." ;
				next;
				if(select("Lunatic Card", "Minotaur Card", "Skelwerker Card", "Desert Wolf Card")==4)
					set '@m,'@m+1;
				break;
			case 41:
				mes "Choose one of the following weapons that Kaibara cannot make." ;
				next;
				if(select("Black Scale", "Murasame", "White Blade", "Fuuma Shuriken/Fuutori")==4)
					set '@m,'@m+1;
				break;
			case 42:
				mes "Choose one of the following that is not the name of a master craftsman who makes Ninja-specific items." ;
				next;
				if(select("Kaibara", "Icu", "Tetsu", "Tosh")==2)
					set '@m,'@m+1;
				break;
			case 43:
				mes "How many is Ninja's max JobLv?" ;
				next;
				if(select("70", "50", "99", "100")==1)
					set '@m,'@m+1;
				break;
			case 44:
				mes "Answer the name of the city where the Ninja mansion is located." ;
				next;
				if(select("Lutie", "Amatsu", "DeWata", "Comodo")==2)
					set '@m,'@m+1;
				break;
			case 45:
				mes "Answer the name of the person to whom I sent a letter when I changed jobs in Ninja." ;
				next;
				if(select("stray[Dog]", "stray cat", "goat", "goat")==3)
					set '@m,'@m+1;
				break;
			case 46:
				mes "Answer what was placed next to me when you first met me." ;
				next;
				if(select("zabuton", "hanging scroll", "flowerpot", "brazier")==4)
					set '@m,'@m+1;
				break;
			case 47:
				mes "Choose one of the following people that Ninja needs to meet when he is reincarnated." ;
				next;
				if(select("Valkyrie", "Landgris", "No", "Leopard")==3)
					set '@m,'@m+1;
				break;
			case 48:
				mes "Choose the correct name of the NPC responsible for the reincarnation among the following." ;
				next;
				if(select("Valkyrie", "Valkyrie", "Harakiri", "Kuga Kai")==1)
					set '@m,'@m+1;
				break;
			case 49:
				mes "Answer the total value of Dex and Luk added at NinjaJobLvl 70." ;
				next;
				if(select("8", "10", "12", "14")==2)
					set '@m,'@m+1;
				break;
			}
		}
		mes "[Kuga Kai]";
		mes "This is the end of all questions." ;
		mes "Wait a moment while we grade them." ;
		next;
		mes "[Kuga Kai]";
		mes "............." ;
		next;
		if('@m < 9) {
			mes "[Kuga Kai]";
			mes "hm ......." ;
			mes "Not as good as I was hoping for." ;
			next;
			mes "[Kuga Kai]";
			mes "It means that we are not yet ready to move on to further extremes." ;
			next;
			mes "[Kuga Kai]";
			mes "I'll give you another chance!" ;
			mes "Come back!" ;
			close;
		}
		mes "[Kuga Kai]";
		mes ""+'@m+ "Zero points or ......." ;
		mes "Have you not acquired all your strength?" ;
		mes "As expected." ;
		next;
		mes "[Kuga Kai]";
		mes "But don't be so vain as to have overcome this level of ordeal." ;
		next;
		mes "[Kuga Kai]";
		mes "There are still more challenges left for you to overcome." ;
		next;
		mes "[Kuga Kai]";
		mes "Let me see if you can overcome the ordeal with your strength." ;
		next;
		compquest 5136;
		delquest 5139;
		mes "[Kuga Kai]";
		mes "Come on, let's let them out." ;
		mes "Report the results to Master Guion." ;
		close2;
		warp "job_ko.gat",16,113;
		end;
	}
}

function script jobchenge_ko_func {
	set '@cost,getarg(0);
	set '@heal,getarg(1);
	setarray '@to_x,63,
				54,46,38,30,22,17,17,17,17,17,
				17,25,33,41,49,57,62,62,62,62,
				62,54,46,38,30,25,25,25,25,33,
				41,49,54,54,54,54,47,38,33,33,33,41;
	setarray '@to_y,16,
				16,16,16,16,16,16,19,27,35,43,51,
				60,60,60,60,60,60,56,48,40,32,
				23,23,23,23,23,28,35,43,52,52,
				52,52,48,40,31,31,31,35,44,44;
	mes " LPs held:" +CHANGE_KO_LP;
	mes " Rolling the dice consumes " +'@cost+ "^FD0260LP^000000 -";
	next;
	menu "Roll the dice",-;
	set '@rand,rand(1,6);
	emotion 57+'@rand,"";
	mes "-" +'@rand+ "has been rolled." ;
	mes " " +'@rand+ "mass proceed-"; mes " " +'@rand+ "mass proceed-"; mes "-" +'@rand+ "mass proceed-";
	close2;
	set CHANGE_KO_LP,CHANGE_KO_LP - '@cost + '@heal;
	if(CHANGE_KO_LP > 100)
		set CHANGE_KO_LP,100;
	set CHANGE_KO_NOW,CHANGE_KO_NOW + '@rand;
	warp "job_ko.gat",'@to_x[CHANGE_KO_NOW],'@to_y[CHANGE_KO_NOW];
	end;
}

job_ko.gat,57,16,4 script road marker#ko_00 858,1,1,{
	mes "-Starting point^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	set CHANGE_KO_LP,100;
	set CHANGE_KO_NOW,0;
	if(!checkquest(5140)) {
		mes "-small description -";
		while(1) {
			next;
			if(select("read description", "start ordeal") == 1) {
				mes "-The ordeal of survival proceeds in the form of a sugoroku." ;
				mes " 100 ^FD0260 Trial of Survival points (LP)^000000 are given at the start and 1 LP is spent for each roll of the dice-";
				next;
				mes "-There are 40 squares to the goal, and events occur in the frames along the way that increase or decrease ^FD0260LP^000000-";
				next;
				mes "-To reach the goal, you must reach the goal before ^FD0260LP^000000 reaches 0;
				next;
				mes "-In addition, if ^FD0260LP^000000 becomes 0 upon arrival at the goal, the goal is accepted-";
				next;
				mes "-This is the end of the description of the survival ordeal-";
				continue;
			}
			break;
		}
		setquest 5140;
		mes "-Survival trial points (LP) of 100 have been earned-";
		next;
		mes "-Position: starting point";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "-Position: back to the start point." ;
	mes " LP recovered-";
	while(1) {
		next;
		if(select("Read the description", "Start the ordeal") == 1) {
			mes "-The ordeal of survival will proceed in the form of a sugoroku." ;
			mes " 100 ^FD0260 Trial of Survival points (LP)^000000 are given at the start and 1 LP is spent for each roll of the dice-";
			next;
			mes "-There are 40 squares to the goal, and events occur in the frames along the way that increase or decrease ^FD0260LP^000000-";
			next;
			mes "-To reach the goal, you must reach the goal before ^FD0260LP^000000 reaches 0;
			next;
			mes "-In addition, if ^FD0260LP^000000 becomes 0 upon arrival at the goal, the goal is accepted-";
			next;
			mes "-This is the end of the description of the survival ordeal-";
			continue;
		}
		break;
	}
	mes "-Position: starting point";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,49,16,4 script road marker#ko_01 858,1,1,{
	mes "-1st square^1A95E6 other characters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-No luck getting a 1 from the start." ;
	mes " Here you can proceed to square 9 by paying 10^FD0260LP^000000-";
	next;
	if(select("Pay 10LP to advance to square #9", "don't pay")==1) {
		mes "-10LP paid." ;
		mes " proceed to number 9-";
		close2;
		set CHANGE_KO_LP,CHANGE_KO_LP - 10;
		set CHANGE_KO_NOW,9;
		warp "job_ko.gat",17,43;
		end;
	}
	mes "-Position: square 1";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,41,16,4 script roadmap#ko_02 858,1,1,{
	mes "-2nd square^1A95E6 other characters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-The trap has been triggered! Return to the starting point-";
	close2;
	warp "job_ko.gat",63,16;
	end;
}

job_ko.gat,33,16,4 script road marker#ko_03 858,1,1,{
	mes "-3rd square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Cursed by my ancestors." ;
	mes " You must pay 5^FD0260LP^000000 to get rid of the ancestor's curse-";
	next;
	menu "Pay 5LP",-;
	mes "-5LP paid dice can be rolled-"; next; menu "pay 5LP",-; mes "-5LP paid dice can be rolled-";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "-Position: square 3";
	callfunc "jobchange_ko_func",1,0;
	end;
}

job_ko.gat,25,16,4 script roadmap#ko_04 858,1,1,{
	mes "-4th square^1A95E6 other characters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small camel-colored writing on it-";
	next;
	mes "-^0000FF" +'name$+ "-^000000Trying to survive-"; mes "-^000000" +'name$+ "^000000Trying to survive-";
	next;
	mes "-Do you want to leave your name in the "GHOST"? -";
	next;
	if(select("Pay 5LP and leave name", "Don't pay") == 1) {
		mes "-5LP paid -";
		set CHANGE_KO_LP,CHANGE_KO_LP - 5;
		set 'name$,strcharinfo(0);
		next;
		mes "-" +strcharinfo(0);
		mes " Trial for survival." ;
		mes " Name left." ;
		mes " dice can be rolled-"; mes " dice can be rolled-"; mes " dice can be rolled-";
		next;
	}
	mes "-Position: square 4";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,17,16,4 script roadmap#ko_05 858,1,1,{
	mes "-5th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(! (checkquest(5141) & 0x2)) {
			mes "-Cannot roll dice due to curse-";
			close;
		}
		mes "-2 minutes have elapsed and the curse has been lifted." ;
		mes "-Can roll the dice-"; } mes "-Can roll the dice-"; } mes "-Can roll the dice-
		next;
		delquest 5141;
		mes "-Position: square 5";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "-small description written-";
	next;
	mes "-If you don't pay 5^FD0260LP^000000 you will be cursed not to roll dice for 2 minutes-";
	next;
	if(select("pay 5LP", "don't pay") == 2) {
		setquest 5141;
		mes "-you are cursed not to roll dice for 2 minutes-";
		close;
	}
	mes "-5LP paid." ;
	mes " You can roll the dice-";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "-Position: square 5";
	callfunc "jobchange_ko_func",1,0;
	end;
}

job_ko.gat,17,24,4 script roadmap#ko_06 858,1,1,{
	mes "-6th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Lucky!" ;
	mes " 7^FD0260LP^000000 recovery of survival trial points when moving to the next square." ;
	mes " No more than 100^FD0260LP^000000 will be recovered -";
	next;
	mes "-Position: square 6";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,17,32,4 script roadmap#ko_07 858,1,1,{
	mes "-7th square^1A95E6 other characters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-The trap has been triggered! !!!Return to number 5-";
	close2;
	set CHANGE_KO_NOW,5;
	warp "job_ko.gat",22,16;
	end;
}

job_ko.gat,17,40,4 script marker#ko_08 858,1,1,{
	mes "-8th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "- rock-paper-scissors machine if you win, move to number 14." ;
	mes "If you draw, roll the dice." ;
	mes " If you lose, return to the starting point-";
	next;
	mes "Jan!  Ken!  Pong! ";
	next;
	set '@own,select("play choki", "play goo", "play par")-1; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next
	set '@enemy,rand(3);
	mes "--result display--machine:" +(('@enemy==0)? "Choki": (('@enemy==1)? "goo": "par"));
	mes "you:" +(('@own==0)? "Choki": (('@own==1)? "goo": "par"));
	next;
	if('@own == '@enemy) {
		mes "-Draw is a draw-";
		next;
		mes "-Position: square 8";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	if('@own ! = ('@enemy+1)%3) {
		mes "-You Lose......" ;
		mes " Return to the starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-You Win !!!Go to number 14-";
	close2;
	set CHANGE_KO_NOW,14;
	warp "job_ko.gat",41,60;
	end;
}

job_ko.gat,17,48,4 script marker#ko_09 858,1,1,{
	mes "-9th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Please proceed further-";
	next;
	mes "-Position: square 9";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,17,56,4 script roadmap#ko_10 858,1,1,{
	mes "-10th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-do it before you get hit-";
	next;
	if('trap) {
		mes "-The trap that was placed has been triggered!" ;
		mes "Return to the start-"; next; if('trap) { mes "-Return to the start-";
		close2;
		set 'trap,0;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-no traps currently in place-";
	next;
	mes "-You can install a trap back to the start by paying 10^FD0260LP^000000-";
	next;
	if(select("Place a trap", "Do not place and roll dice") == 1) {
		mes "-10LP paid." ;
		mes " trap installed-";
		set 'trap,1;
		set CHANGE_KO_LP,CHANGE_KO_LP - 10;
		next;
	}
	mes "-Position: square 10";
	callfunc "jobchange_ko_func",1,0;
	end;
}

job_ko.gat,22,60,4 script roadmap#ko_11 858,1,1,{
	mes "-11th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Traps are in place! Return to number 9-";
	close2;
	set CHANGE_KO_NOW,9;
	warp "job_ko.gat",17,43;
	end;
}

job_ko.gat,30,60,4 script marker#ko_12 858,1,1,{
	mes "-12th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "- rock-paper-scissors machine if you win, move to number 20." ;
	mes "If you draw, roll the dice." ;
	mes " If you lose, go back to number 9-";
	next;
	mes "Jan!  Ken!  Pong!" ;
	next;
	set '@own,select("play choki", "play goo", "play par")-1; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next
	set '@enemy,rand(3);
	mes "--result display--machine:" +(('@enemy==0)? "Choki": (('@enemy==1)? "goo": "par"));
	mes "you:" +(('@own==0)? "Choki": (('@own==1)? "goo": "par"));
	next;
	if('@own == '@enemy) {
		mes "-Draw is a draw-";
		next;
		mes "-Position: square 12";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	if('@own ! = ('@enemy+1)%3) {
		mes "-You Lose......" ;
		mes " Return to number 9-";
		close2;
		set CHANGE_KO_NOW,9;
		warp "job_ko.gat",17,43;
		end;
	}
	mes "-You Win !!!Go to number 20-";
	close2;
	set CHANGE_KO_NOW,20;
	warp "job_ko.gat",62,32;
	end;
}

job_ko.gat,38,60,4 script marker#ko_13 858,1,1,{
	mes "-13th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Lucky!" ;
	mes " 7^FD0260LP^000000 recovery of survival trial points when moving to the next square." ;
	mes " No more than 100^FD0260LP^000000 will be recovered -";
	next;
	mes "-Position: square 13";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,46,60,4 script roadmap#ko_14 858,1,1,{
	mes "-14th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(! (checkquest(5141) & 0x2)) {
			mes "-Cannot roll dice due to curse-";
			close;
		}
		mes "-2 minutes have elapsed and the curse has been lifted." ;
		mes "-Can roll the dice-"; } mes "-Can roll the dice-"; } mes "-Can roll the dice-
		next;
		delquest 5141;
		mes "-Position: square 14";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "-small description written-";
	next;
	mes "-If you don't pay 5^FD0260LP^000000 you will be cursed not to roll dice for 2 minutes-";
	next;
	if(select("pay 5LP", "don't pay") == 2) {
		setquest 5141;
		mes "-you are cursed not to roll dice for 2 minutes-";
		close;
	}
	mes "-5LP paid." ;
	mes " You can roll the dice-";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "-Position: square 14";
	callfunc "jobchange_ko_func",1,0;
	end;
}

job_ko.gat,54,60,4 script roadmap#ko_15 858,1,1,{
	mes "-15th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(! (checkquest(5141) & 0x2))) {
			mes "-Cannot proceed due to curse-";
			close;
		}
		mes "-2 minutes have elapsed and the curse has been lifted." ;
		mes "You can roll the dice-";
		next;
		delquest 5141;
		mes "-Position: square 15";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "-small description written-";
	next;
	mes "-A powerful curse has been placed on you and you have been unable to proceed for 2 minutes-";
	setquest 5141;
	close;
}

job_ko.gat,62,60,4 script marker#ko_16 858,1,1,{
	mes "-16th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-spend 2^FD0260LP^000000 and roll the dice twice-";
	next;
	mes "-If you get the same number of dice, proceed to number 19." ;
	mes "-If you don't get the same number of dice, spend 2^FD0260LP^000000 and keep rolling the dice twice until you get the same number of dice-";
	while(1) {
		next;
		mes "-Position: 16th square holding LP:" +CHANGE_KO_LP;
		mes " Rolling the dice consumes 2^FD0260LP^000000000-"; while(1) { next; mes "-Position: 16th square holding LP:" +CHANGE_KO_LP; }
		next;
		menu "Rolling the first dice",-;
		mes "-2LP consumed-";
		set CHANGE_KO_LP,CHANGE_KO_LP - 2;
		next;
		set '@dice1,rand(1,6);
		emotion 57+'@dice1,"";
		mes "-" +'@dice1+ "has been found." ;
		mes " Roll the second dice -";
		next;
		menu "Roll the second dice",-;
		set '@dice2,rand(1,6);
		emotion 57+'@dice2,"";
		mes "-" +'@dice2+ "has been rolled." ;
		if('@dice1 == '@dice2) {
			mes "Same eye was found, proceed to number 19-"; mes "-
			close2;
			set CHANGE_KO_NOW,19;
			warp "job_ko.gat",62,40;
			end;
		}
		else {
			// not investigated
			mes " roll the dice again because the same roll did not come up-";
			continue;
		}
	}
}

job_ko.gat,62,51,4 script marker#ko_17 858,1,1,{
	mes "-17th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-I'm kind of heavy because of the curse." ;
	mes "-10^FD0260LP^000000000 consumed to roll the dice-";
	next;
	mes "-Position: square 17";
	callfunc "jobchenge_ko_func",10,0;
	end;
}

job_ko.gat,62,43,4 script road marker#ko_18 858,1,1,{
	mes "-18th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-spend 2^FD0260LP^000000 and roll the dice twice-";
	next;
	mes "-If the total of the two rolls is less than 5, proceed to number 24." ;
	mes "-If the total is greater than 5, proceed to number 19-";
	next;
	mes "-Position: 18th square holding LP: " +CHANGE_KO_LP;
	mes " Rolling the dice consumes 2^FD0260LP^000000 -";
	next;
	menu "Rolling the first dice",-;
	mes "-2LP consumed-";
	set CHANGE_KO_LP,CHANGE_KO_LP - 2;
	next;
	set '@dice1,rand(1,6);
	emotion 57+'@dice1,"";
	mes "-" +'@dice1+ "has been found." ;
	mes " Roll the second dice -";
	next;
	menu "Roll the second dice",-;
	set '@dice2,rand(1,6);
	emotion 57+'@dice2,"";
	mes "-" +'@dice2+ "has been rolled." ;
	next;
	if((('@dice1+'@dice2) >= 5) {
		mes ""+'@dice1+ " + " +'@dice2+ " = " +('@dice1+'@dice2);
		mes "-2 total was greater than or equal to 5." ;
		mes " Go to number 19 -";
		close2;
		set CHANGE_KO_NOW,19;
		warp "job_ko.gat",62,40;
		end;
	}
	else {
		// not examined
		mes "-2 total was less than 5." ;
		mes "Proceed to number 24 -";
		close2;
		set CHANGE_KO_NOW,24;
		warp "job_ko.gat",38,23;
		end;
	}
}

job_ko.gat,62,35,4 script marker#ko_19 858,1,1,{
	mes "-19th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Please proceed further-";
	next;
	mes "-Position: square 19";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,62,27,4 script roadmap#ko_20 858,1,1,{
	mes "-20th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Lucky!" ;
	mes " 7^FD0260LP^000000 recovery of survival trial points when moving to the next square." ;
	mes " No more than 100^FD0260LP^000000 will be recovered -";
	next;
	mes "-Position: square 20";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,57,23,4 script roadmap#ko_21 858,1,1,{
	mes "-21th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-I'm kind of heavy because of the curse." ;
	mes "-10^FD0260LP^000000000 consumed to roll the dice-";
	next;
	mes "-Position: square 21";
	callfunc "jobchenge_ko_func",10,0;
	end;
}

job_ko.gat,49,23,4 script road marker#ko_22 858,1,1,{
	mes "-22nd square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-If you donate all the remaining ^FD0260LP^000000 and return to the starting point, the next person who steps here will be saved-";
	next;
	if('trap) {
		mes "-someone kindly donated their ^FD0260LP^000000." ;
		mes " proceed to the finish line-";
		close2;
		set 'trap,0;
		warp "job_ko.gat",41,44;
		end;
	}
	mes "-^FD0260LP^000000 donate all the money and the next person who stops here will be able to proceed to the finish line." ;
	mes "Do you wish to donate all ^FD0260LP^000000? -";
	next;
	if(select("Donate all LP", "Don't donate") == 1) {
		mes "- I have donated all remaining ^FD0260LP^000000." ;
		mes " Return to starting point-";
		close2;
		set 'trap,1;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-Position: 22nd square";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,41,23,4 script roadmap#ko_23 858,1,1,{
	mes "-23rd square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-The trap has been triggered! !!!Return to number 17-";
	close2;
	set CHANGE_KO_NOW,17;
	warp "job_ko.gat",62,55;
	end;
}

job_ko.gat,33,23,4 script marker#ko_24 858,1,1,{
	mes "-24th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-spend 2^FD0260LP^000000 and roll the dice twice-";
	next;
	mes "-If the sum of the two rolls is 9 or more, proceed to any place between 25 and 30." ;
	mes " If 8 or less, return to number 19-";
	next;
	mes "-Position: 24th square holding LP: " +CHANGE_KO_LP;
	mes " Rolling the dice consumes 2^FD0260LP^000000 -";
	next;
	menu "Rolling the first dice",-;
	mes "-2LP consumed-";
	set CHANGE_KO_LP,CHANGE_KO_LP - 2;
	next;
	set '@dice1,rand(1,6);
	emotion 57+'@dice1,"";
	mes "-" +'@dice1+ "has been found." ;
	mes " Roll the second dice -";
	next;
	menu "Roll the second dice",-;
	set '@dice2,rand(1,6);
	emotion 57+'@dice2,"";
	mes "-" +'@dice2+ "has been rolled." ;
	next;
	if((('@dice1+'@dice2) >= 9) {
		mes ""+'@dice1+ " + " +'@dice2+ " = " +('@dice1+'@dice2);
		mes "-2 total was greater than or equal to 9." ;
		mes " Proceed to any place between #25 and #30 -";
		next;
		switch(select("Go to number 25", "Go to number 26", "Go to number 27", "Go to number 28", "Go to number 29", "Go to number 30")) {
		case 1: set CHANGE_KO_NOW,25; warp "job_ko.gat",30,23; break;
		case 2: set CHANGE_KO_NOW,26; warp "job_ko.gat",25,28; break
		case 3: set CHANGE_KO_NOW,27; warp "job_ko.gat",25,35; break
		case 4: set CHANGE_KO_NOW,28; warp "job_ko.gat",25,43; break
		case 5: set CHANGE_KO_NOW,29; warp "job_ko.gat",25,52; break
		case 6: set CHANGE_KO_NOW,30; warp "job_ko.gat",33,52; break
		}
		end;
	}
	else {
		mes "-2 total was less than 8." ;
		mes " Return to number 19 -";
		close2;
		set CHANGE_KO_NOW,19;
		warp "job_ko.gat",62,40;
		end;
	}
}

job_ko.gat,25,23,4 script roadmap#ko_25 858,1,1,{
	mes "-25th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(! (checkquest(5141) & 0x2))) {
			mes "-Cannot proceed due to curse-";
			close;
		}
		mes "-2 minutes have elapsed and the curse has been lifted." ;
		mes "You can roll the dice-";
		next;
		delquest 5141;
		mes "-Position: square 25";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "-small description written-";
	next;
	mes "-here it is cold ......" ;
	} mes "The text is blurred and cannot be seen clearly." ;
	mes " What should I do? -";
	next;
	if(select("do some tricks", "do nothing") == 1) {
		// just uttering cold jokes, not skills
		mes "-I unleashed a cold joke that's going viral on Prontera! -";
		next;
		setquest 5141;
		mes "-I've been cursed to not be able to proceed for 2 minutes: ...... -";
		close;
	}
	if(rand(6)) {
		mes "-nothing happens ...... -" ;
		mes " Should we do tricks? -";
		close;
	}
	mes "-It seems that doing nothing was the right choice-";
	next;
	mes "-Position: square 25";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,25,32,4 script roadmap#ko_26 858,1,1,{
	mes "-26th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-The trap has been triggered! !!!Return to number 20-";
	close2;
	set CHANGE_KO_NOW,20;
	warp "job_ko.gat",62,32;
	end;
}

job_ko.gat,25,40,4 script marker#ko_27 858,1,1,{
	mes "-27th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Lucky!" ;
	mes " 7^FD0260LP^000000 recovery of survival trial points when moving to the next square." ;
	mes " No more than 100^FD0260LP^000000 will be recovered -";
	next;
	mes "-Position: square 27";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,25,48,4 script roadmap#ko_28 858,1,1,{
	mes "-28th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-do it before you get hit-";
	next;
	if('trap) {
		mes "-The trap that was placed has been triggered!" ;
		mes "Return to the start-"; next; if('trap) { mes "-Return to the start-";
		close2;
		set 'trap,0;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-no traps currently in place-";
	next;
	mes "-You can install a trap back to the start by paying 10^FD0260LP^000000-";
	next;
	if(select("Place a trap", "Do not place and roll dice") == 1) {
		mes "-10LP paid." ;
		mes " trap installed-";
		set 'trap,1;
		set CHANGE_KO_LP,CHANGE_KO_LP - 10;
		next;
	}
	mes "-Location: square 28";
	callfunc "jobchange_ko_func",1,0;
	end;
}

job_ko.gat,30,52,4 script roadmap#ko_29 858,1,1,{
	mes "-29th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-11 squares left." ;
	} mes "-Forward -"; next; mes "-Forward -"; }
	next;
	mes "-Position: square 29";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,38,52,4 script roadmap#ko_30 858,1,1,{
	mes "-30th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-The trap has been triggered! !!!Return to number 9-";
	close2;
	set CHANGE_KO_NOW,9;
	warp "job_ko.gat",17,43;
	end;
}

job_ko.gat,46,52,4 script marker#ko_31 858,1,1,{
	mes "-31st square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(! (checkquest(5141) & 0x2)) {
			mes "-Cannot roll dice due to curse-";
			close;
		}
		mes "-2 minutes have elapsed and the curse has been lifted." ;
		mes "-Can roll the dice-"; } mes "-Can roll the dice-"; } mes "-Can roll the dice-
		next;
		delquest 5141;
		mes "-Position: square 31";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "-small description written-";
	next;
	mes "-If you don't pay 5^FD0260LP^000000 you will be cursed not to roll dice for 2 minutes-";
	next;
	if(select("pay 5LP", "don't pay") == 2) {
		setquest 5141;
		mes "-you are cursed not to roll dice for 2 minutes-";
		close;
	}
	mes "-5LP paid." ;
	mes " You can roll the dice-";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "-Position: square 31";
	callfunc "jobchange_ko_func",1,0;
	end;
}

job_ko.gat,54,52,4 script roadmap#ko_32 858,1,1,{
	mes "-32nd square^1A95E6 other characters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "- rock-paper-scissors machine If you win, you will go to your favorite place from number 33 to 38." ;
	} mes " - Return to the starting point if you lose or tie -";
	next;
	mes "-Janken machine you win, you return to the starting point-"; mes "-Janken!  Ken!  Pong!" ;
	next;
	set '@own,select("play choki", "play goo", "play par")-1; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next; next
	set '@enemy,rand(3);
	mes "--result display--machine:" +(('@enemy==0)? "Choki": (('@enemy==1)? "goo": "par"));
	mes "you:" +(('@own==0)? "Choki": (('@own==1)? "goo": "par"));
	next;
	if('@own == '@enemy) {
		// not examined
		mes "-Draw draw, return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if('@own ! = ('@enemy+1)%3) {
		// not yet investigated
		mes "-You Lose......" ;
		mes " Return to the starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-You Win !!!Choose the square you want to proceed from 33 to 38-";
	next;
	switch(select("To square 33", "To square 34", "To square 35", "To square 36", "To square 37", "To square 38")) {
	case 1: set CHANGE_KO_NOW,33; warp "job_ko.gat",54,48; break;
	case 2: set CHANGE_KO_NOW,34; warp "job_ko.gat",54,40; break
	case 3: set CHANGE_KO_NOW,35; warp "job_ko.gat",54,31; break
	case 4: set CHANGE_KO_NOW,36; warp "job_ko.gat",47,31; break
	case 5: set CHANGE_KO_NOW,37; warp "job_ko.gat",38,31; break
	case 6: set CHANGE_KO_NOW,38; warp "job_ko.gat",33,35; break
	}
	end;
}

job_ko.gat,54,43,4 script marker#ko_33 858,1,1,{
	mes "-33rd square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Pay all points except 1^FD0260LP^000000 for the last dice roll and move on to number 39-";
	next;
	if(select("pay", "don't pay") == 1) {
		mes "-" +(CHANGE_KO_LP-1)+ "Proceed to 39th LP paid -";
		close2;
		set CHANGE_KO_LP,1;
		set CHANGE_KO_NOW,39;
		warp "job_ko.gat",33,44;
		end;
	}
	mes "-Roll the dice-";
	next;
	mes "-Position: square 33";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,54,35,4 script roadmap#ko_34 858,1,1,{
	mes "-34th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Lucky!" ;
	mes " 7^FD0260LP^000000 recovery of survival trial points when moving to the next square." ;
	mes " No more than 100^FD0260LP^000000 will be recovered -";
	next;
	mes "-Location: square 34";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,49,31,4 script roadmap#ko_35 858,1,1,{
	mes "-35th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-The trap that was installed has been triggered!" ;
	} mes "-return to #29-"; next; mes "-return to #29-"; }
	close2;
	set CHANGE_KO_NOW,29;
	warp "job_ko.gat",25,52;
	end;
}

job_ko.gat,41,31,4 script marker#ko_36 858,1,1,{
	mes "-36th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-4 squares left-";
	next;
	mes "-If you get 4 or more eyes, you can reach the finish line, but you may choose another rule-"; } mes "-There are 4 squares left-"; next; mes "-There are 4 squares left-
	next;
	mes "-The other rule is that a 1, 2, or 3 will get you to the finish line, and a 4, 5, or 6 will get you back to square 29." ;
	mes " You may roll the dice normally without using this rule-";
	next;
	if(select("Use another rule", "Roll dice normally") == 1) {
		mes "-Position: 36th square holding LP:" +CHANGE_KO_LP;
		mes " Rolling the dice consumes 1^FD0260LP^000000 -";
		next;
		menu "Roll dice",-;
		set '@dice,rand(1,6);
		emotion 57+'@dice,"";
		set CHANGE_KO_LP,CHANGE_KO_LP - 1;
		mes "-" +'@dice+ "was found." ;
		if('@dice <= 3) {
			mes " Proceed to the finish line -";
			close2;
			warp "job_ko.gat",41,44;
			end;
		}
		else {
			mes " return to 29-";
			close2;
			set CHANGE_KO_NOW,29;
			warp "job_ko.gat",25,52;
			end;
		}
	}
	mes "-Position: 36th square";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,33,31,4 script roadmap#ko_37 858,1,1,{
	mes "-37th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-3 squares left-";
	next;
	} mes "-If an odd number is found, the game will proceed to the finish line." ;
	mes "But if an even number is found, return to the starting point-";
	next;
	mes "-Position: 37 squares held LP: " +CHANGE_KO_LP;
	mes " Rolling the dice consumes 1^FD0260LP^000000 -";
	next;
	menu "Roll dice",-;
	set '@dice,rand(1,6);
	emotion 57+'@dice,"";
	set CHANGE_KO_LP,CHANGE_KO_LP - 1;
	mes "-" +'@dice+ "was found." ;
	if('@dice%2) {
		mes "Proceed to the finish line -";
		close2;
		warp "job_ko.gat",41,44;
		end;
	}
	else {
		mes " return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
}

job_ko.gat,33,40,4 script road marker#ko_38 858,1,1,{
	mes "-38th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-Leave 1^FD0260LP^000000 and pay all ^FD0260LP^000000 to place a trap back to the start-";
	next;
	if('trap) {
		mes "-The trap that was installed has been triggered!" ;
		mes " Return to start-";
		close2;
		set 'trap,0;
		warp "job_ko.gat",63,16;
		end;
	}
	if(select("set trap", "set no trap and roll dice") == 1) {
		mes "-" +(CHANGE_KO_LP-1)+ "LP paid." ;
		mes " trap installed-";
		set 'trap,1;
		set CHANGE_KO_LP,1;
		next;
	}
	mes "-Location: square 38"; set 'trap,1; set 'trap,1; set CHANGE_KO_LP,1; next; }
	callfunc "jobchange_ko_func",1,0;
	end;
}

job_ko.gat,38,44,4 script roadmap#ko_39 858,1,1,{
	mes "-39th square^1A95E6 other letters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "-^FD0260LP^000000 is missing." ;
		mes " Return to starting point-";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "-small description -";
	next;
	mes "-One square left." ;
	mes "It must have been a long road -";
	next;
	mes "-but it's not going to be easy to get through." ;
	mes " When you get a 3, you'll have to go back to number 3 -";
	next;
	mes "-Position: 39th square holding LP: " +CHANGE_KO_LP;
	mes " Rolling the dice consumes 1^FD0260LP^000000 -";
	next;
	menu "Roll dice",-;
	set '@dice,rand(1,6);
	emotion 57+'@dice,"";
	set CHANGE_KO_LP,CHANGE_KO_LP - 1;
	mes "-" +'@dice+ "was found." ;
	if('@dice == 3) {
		mes " Return to number 3 -";
		close2;
		set CHANGE_KO_NOW,3;
		warp "job_ko.gat",38,16;
		end;
	}
	else {
		mes " proceed to the finish line-";
		close2;
		warp "job_ko.gat",41,44;
		end;
	}
}

job_ko.gat,46,41,4 script road marker#ko_40 858,1,1,{
	mes "-goal^1A95E6 other characters are too small to see." ;
	mes " Let's get closer^000000-";
	close;
OnTouch:
	mes "-There is a small description-"; mes "-There is a small description-"; mes "-There is a small description-";
	next;
	mes "-Bless you who have taken the steps of a courageous beginning to those who walk to the further extremes! -";
	next;
	compquest 5137;
	delquest 5140;
	mes "- having accomplished the ordeal of survival-";
	close2;
	warp "job_ko.gat",35,113;
	end;
}

job_ko.gat,127,125,4 script leopard#ko 730,{
	if(checkquest(5138)) {
		if(checkquest(5138) & 0x8) {
			mes "[leopard]";
			mes "Oh yeah, don't forget to report it to Master Guion." ;
			close2;
			warp "job_ko.gat",26,104;
			end;
		}
		if(!checkquest(5142)) {
			mes "[leopard]";
			mes "It's been a while." ;
			next;
			menu "It's been a while.",-;
			mes "[leopard]";
			mes "I thought you had forgotten all about me, but by the looks of it, you seem to have remembered me." ;
			next;
			mes "[leopard]";
			mes "Well, I have some stories to pile up. ......" ;
			mes "Now was not the time to talk about such leisurely things, was it?" ;
			next;
			mes "[Leopard]";
			mes "Then again!" ;
			mes ""+strcharinfo(0);
			mes "Welcome to the family weapons workshop!" ;
			next;
			mes "[leopard]";
			mes "From time immemorial, our clan has crafted our own unique weapons to carry out our duties as a covert force." ;
			next;
			menu "And so to Einbroch?" ,-;
			mes "[Leopard]";
			mes "...... Oh, you still remember?" ;
			next;
			mes "[leopard]";
			mes "That's right." ;
			mes "The city of Einbroch in Steel is full of skilled artisans and new techniques are frequently created." ;
			next;
			mes "[Leopard]";
			mes "My task was to learn and analyze such new techniques and report back to the clan." ;
			next;
			mes "[leopard]";
			mes "Oops. ......." ;
			mes "I slipped up a bit." ;
			next;
			mes "[leopard]";
			mes "Aside from that ^6848B7 iron ore, do you have enough iron, Steel, Phracon, Emveretarcon, Oridecon ore, Elunium ore ^000000?" ;
			next;
			mes "[Leopard]";
			mes "Let's quickly make a prototype of a new weapon." ;
			next;
			misceffect 191, "Production tool#ko_01";
			mes "[leopard]";
			mes "The fabrication tools are there and ......." ;
			next;
			misceffect 191, "fabrication-tool#ko_02";
			mes "[leopard]";
			mes "Here ......" ;
			next;
			misceffect 191, "Production tool#ko_03";
			setquest 5142;
			mes "[leopard]";
			mes "Then feel free to use what's over there." ;
			next;
			mes "[leopard]";
			mes "Speak to me again if you would like to hear an explanation of how to make weapons." ;
			mes "Then please begin." ;
			close;
		}
		if(checkquest(5145)) {
			mes "[leopard]";
			mes "Did you get satisfactory results?" ;
			next;
			switch(select("Not yet.", "Done.", "Broken.")) {
			case 1:
				mes "[Leopard]";
				mes "Satisfactory results are not easy to achieve, you know." ;
				close;
			case 2:
				mes "[leopard]";
				mes "It looks like you got a good result." ;
				next;
				if(getequipid(4) ! = 13074 && getequipid(4) ! = 13312) {
					mes "[leopard]";
					mes "Oh ......." ;
					next;
					mes "[leopard]";
					mes "Sorry." ;
					mes "Could you please equip me with the weapon you have forged?" ;
					mes "I will check it for you." ;
					close;
				}
				mes "[leopard]";
				mes "Then let me confirm it." ;
				next;
				mes "-The leopard holds the weapon in his hand and observes-";
				next;
				set '@ref,getequiprefinerycnt(4);
				if('@ref < 7) {
					mes "[leopard]";
					mes "I see." ;
					mes "It looks good, but it needs to be worked out a bit more." ;
					mes "Good luck." ;
					close;
				}
				else if('@ref < 9) {
					mes "[leopard]";
					mes "You're doing pretty well." ;
					mes "I think I can get a pass on this." ;
					mes "However, it is still possible to enhance it, but is this enough to complete it?" ;
					next;
					if(select("yes", "no") == 2) {
						mes "[Leopard]";
						mes "Then come back when you have a satisfactory result." ;
						close;
					}
				}
				else if('@ref == 9) {
					mes "[leopard]";
					mes "Great ......." ;
					mes "You passed without question." ;
					mes "It's so good that I have such a desire to have you aim for the highest peak." ;
					next;
					mes "[Leopard]";
					mes "What do you think?" ;
					mes "If it's good enough for you, I'd love to see you work hard for the highest peak." ;
					next;
					if(select("I'll take this much", "I'm not satisfied yet") == 2) {
						mes "[Leopard]";
						mes "I'm going to let your skill get the best of you." ;
						close;
					}
				}
				else if('@ref >= 10) {
					// not examined
					mes "[leopard]";
					mes "Excellent!" ;
					mes "Passed without question!" ;
					next;
				}
				mes "[Leopard]";
				mes "As for your skills, we have confirmed enough." ;
				mes "I will do the finishing touches on this weapon." ;
				mes "I'll leave it with you once." ;
				next;
				delequip 4;
				delquest 5145;
				compquest 5138;
				delquest 5142;
				if(checkquest(5143))
					compquest 5143;
				if(checkquest(5144))
					compquest 5144;
				mes "[leopard]";
				mes ""+strcharinfo(0)+ "Finish the ordeal of weapons!"" ;
				close;
			case 3:
				mes "[leopard]";
				mes "I would have advised you to ......" ;
				next;
				mes "[leopard]";
				mes "I can't help it." ;
				mes "I'm going to have to check a few things." ;
				next;
				mes "-all the equipment is off!" ;
				mes "What did the leopard do? -";
				next;
				unequip;
				if(countitem(13074) > 0 || countitem(13312) > 0) {
					mes "[leopard]";
					mes "Oh ......?" ;
					mes "You have a prototype, don't you?" ;
					close;
				}
				mes "[leopard]";
				mes "Hmmm ......" ;
				mes "I guess I really lost it." ;
				next;
				setquest 5142;
				delquest 5143;
				delquest 5144;
				delquest 5145;
				mes "[Leopard]";
				mes "It can't be helped." ;
				mes "Please make it again from the prototype." ;
				close;
			}
		}
		mes "[Leopard]";
		mes "Have you completed the prototype of your new weapon?" ;
		if(checkquest(5143) || checkquest(5144))
			set '@str$, "Yes, it's finished";
		next;
		switch(select("Ask about production tools", "Materials are missing", "Ask how to make",'@str$)) {
		case 1:
			misceffect 191, "fabrication tools#ko_01";
			mes "[leopard]";
			mes "There are fabrication tools at the location I'm about to show you." ;
			mes "First one." ;
			next;
			misceffect 191, "Production tools#ko_02";
			mes "[leopard]";
			mes "The second one." ;
			next;
			misceffect 191, "Production tool#ko_03";
			mes "[leopard]";
			mes "Last three eyes." ;
			mes "Use whatever you like." ;
			close;
		case 2:
			mes "[Leopard]";
			mes "Are you running out of material?" ;
			next;
			misceffect 191, "wardrobe#ko";
			mes "[leopard]";
			mes "It looks like you need to go back to town." ;
			mes "Check the wardrobe there." ;
			close;
		case 3:
			mes "[leopard]";
			mes "Hmm, do I still need to explain?" ;
			next;
			mes "[leopard]";
			mes "First, melt the ore." ;
			mes "It is best to use the same type of ore to produce a metal of high purity." ;
			mes "If you run out of ore during the process, you will have to start over, so make sure you have a sufficient number of ores." ;
			next;
			mes "[Leopard]";
			mes "Also, the rarer the ore, the more pure the metal can be made with fewer pieces." ;
			next;
			mes "[leopard]";
			mes "Yes. ......" ;
			mes "If you keep melting the same ore, ^FF000050^000000 for iron ore or Phracon, ^FF000025^000000 for iron or Emveretarcon, and ^FF000017^000000 for Steel or Oridecon ore would be enough." ;
			next;
			mes "[Leopard]";
			mes "But these numbers are only a guide." ;
			mes "The number of pieces you will need depends on the combination of ores you melt, so please Attention." ;
			next;
			mes "[Leopard]";
			mes "Also, please Attention about the properties of the ores." ;
			mes "For example, iron ore, iron, and Steel have similar properties and can be mixed and melted together to produce a metal of high purity." ;
			next;
			mes "[Leopard]";
			mes "The same is true of Phracon, EmveretarconOridecon ore, since each has similar properties." ;
			next;
			mes "[leopard]";
			mes "However!" ;
			mes "These properties are opposites, so ^FF000000 melting ores with different properties will reduce the enhanced purity ^000000."; mes "[Leopard]"; mes "[Leopard]"; mes "[Leopard]"; mes "[Leopard]
			next;
			mes "[Leopard]";
			mes "In addition, Elunium ore has special properties that can slightly increase purity when dissolved in metals of either nature." ;
			next;
			mes "[leopard]";
			mes "When you have a metal of high purity, pour it into the mold." ;
			next;
			mes "[leopard]";
			mes "Then, strengthen the metal by repeated polishing and hardening, and finally finish it off." ;
			next;
			mes "[leopard]";
			mes "Insufficient strengthening will make the prototype fragile." ;
			mes "Please polish and harden thoroughly before moving on to finishing." ;
			next;
			mes "[leopard]";
			mes "For reference, the best way to make a good weapon is to work alternately with polishing and hardening." ;
			next;
			mes "[leopard]";
			mes "Is this explanation enough?" ;
			mes "Now, let's make a prototype!" ;
			close;
		case 4:
			if(checkquest(5143)) {
				mes "[leopard]";
				mes "law......" ;
				mes "Is it some kind of dagger that imitates a bitter?" ;
				next;
				mes "[leopard]";
				mes "That's an interesting idea." ;
			}
			else if(checkquest(5144)) {
				mes "[leopard]";
				mes "Is this a Fuuma Shuriken ......?" ;
				mes "No no no ......" ;
				next;
				mes "[leopard]";
				mes "That's no ordinary Fuuma Shuriken!" ;
			}
			mes "It's tough to use as a weapon without a little retraining, but I can see the potential for it to be a good weapon." ;
			next;
			mes "[leopard]";
			mes "Okay, I think I can give this a passing grade." ;
			next;
			mes "[leopard]";
			mes "Next, we're going to enhance the weapons." ;
			mes "There is a refining device below me." ;
			mes "Bring it to me when the ^0000FF refining value reaches +7^000000." ;
			next;
			mes "[leopard]";
			mes "You may refine it further, but there is no ^FF000000 special reward, etc. ^000000 to Attention." ;
			next;
			mes "[leopard]";
			mes "Yes, yes, refining must ^FF000000be done in the refining equipment in this room. ^000000";
			next;
			mes "[leopard]";
			mes "In addition, please note that the refining equipment in this room was made by the skilled artisans of Einbroch, the city of Steel;
			next;
			mes "[Leopard]";
			mes "The success rate of refining seems to be different from that of refining elsewhere." ;
			mes "Please Attention." ;
			next;
			mes "[Leopard]";
			mes "Also, ^0000FF the weapon will not break if you fail to refine it with the refining equipment in this room ^000000."
			next;
			mes "[leopard]";
			mes "But if you ask someone else or fail to refine it in a place other than here and break the ^FF000000 prototype, you will have to start over ^000000, so don't break it." ;
			setquest 5145;
			close;
		}
	}
}

job_ko.gat,117,128,0 script wardrobe#ko 844,{
	mes "- Looks like a normal chest of drawers ...... -";
	next;
	if(select("leave it alone", "open the drawer") == 1) {
		mes "-You're off the hook-"; next; mes "-You're off the hook-";
		close;
	}
	mes "-somewhere there is the sound of a machine moving ...... -";
	close2;
	warp "amatsu.gat",147,136;
	end;
}

job_ko.gat,131,124,0 script fabrication tool#ko_01 844,{
	if(! (checkquest(5142) & 0x1)) {
		mes "-It's a fabrication tool." ;
		mes "-Not necessary to use now-";
		close;
	}
	mes "-Tools for fabricating weapons."; mes "-Tools for fabricating weapons.
	next;
	mes "-First, it seems we need to melt the metal for weapon making-"; next; } mes "-First, it seems we need to melt the metal for weapon making-"; next; }
	setarray '@point,20,40,60,20,40,60,20;
	while(1) {
		next;
		set '@sel,select("Melt iron ore", "Melt iron", "Melt Steel", "Melt Phracon", "Melt Emveretarcon", "Melt Oridecon ore", "Melt Elunium ore", "Stop") - 1;
		switch('@sel) {
		case 0: set '@itemid,1002; break;
		case 1: set '@itemid,998; break
		case 2: set '@itemid,999; break
		case 3: set '@itemid,1010; break
		case 4: set '@itemid,1011; break
		case 5: set '@itemid,756; break
		case 6: set '@itemid,757; break
		case 7:
			mes "-you have left the place-";
			close;
		}
		if(countitem('@itemid) < '@iron['@sel]+1) {
			mes "-But" +getitemname('@itemid)+ "you don't have-"
		}
		else {
			if('@cnt == 0)
				misceffect 302;
			mes "-gave high heat" +getitemname('@itemid)+ "melted-";
			set '@cnt,'@cnt + '@point['@sel];
			set '@iron['@sel],'@iron['@sel] + 1;
			next;
			if('@cnt < 200) {
				mes "-It looks like we still have a long way to go-";
			}
			else if('@cnt < 400) {
				mes "-Let's keep melting at this rate-";
			}
			else if('@cnt < 600) {
				mes "-I think we're about halfway there-"
			}
			else if('@cnt < 800) {
				mes "-I think it's getting a lot purer-"
			}
			else if('@cnt < 1000) {
				mes "-I think it's almost done-"
			}
			else {
				mes "-We have enough molten metal ready to make the weapon-";
				break;
			}
		}
		next;
		mes "-Currently, the number of melted ores is as follows-";
		next;
		mes "-Iron ore: ^FF0000" +'@iron[0]+ "^000000 pieces Iron: ^FF0000" +'@iron[1]+ "^000000 pieces Steel: ^FF0000" +'@iron[2]+ "^000000 pieces Phracon: ^FF0000" +'@iron[3]+ "^000000 pieces Emveretarcon: ^FF0000" +'@iron[4]+ "^000000 pieces Oridecon ore: ^FF0000" +'@iron[5]+ "^000000 pieces Elunium ore: ^FF0000" +'@iron[6]+ "^000000 pieces-";
		next;
		mes "-Which metal shall we melt next? -";
		continue;
	}
	next;
	mes "-Next, let's put the molten metal in the mold." ;
	mes " Which mold shall we use? -";
	next;
	switch(select("Mold for dagger", "Mold for windmill shuriken")) {
	case 1:
		mes "-Melted metal is poured into the mold for the dagger-";
		set '@type,1;
		break;
	case 2:
		mes "-The molten metal was poured into the mold for the Fuuma Shuriken";
		set '@type,2;
		break;
	}
	next;
	misceffect 101;
	mes "-Some form seems to be in place." ;
	mes " What shall we work on next? -";
	next;
	switch(select("do the polishing work", "do the hardening work")) {
	case 1:
		misceffect 21,"";
		set '@cnt,1;
		mes "-Grinding operation performed-";
		next;
		mes "- still a long way to go." ;
		mes "-Next, let's do the hardening work-"; next; mes "-Next, let's do the hardening work-";
		break;
	case 2:
		misceffect 101,"";
		set '@cnt,2;
		mes "-Hardening operation performed-";
		next;
		mes "-still a long way to go." ;
		mes "-Next, let's do the hardening work-"; next; mes "-Next, let's do the hardening work-";
		break;
	}
	while(1) {
		next;
		mes "-What work shall we do next? -";
		next;
		switch(select("Do polishing work", "Do hardening work", "Do finishing work")) {
		case 1:
			misceffect 21,"";
			if('@cnt == 2) {
				set '@cnt2,'@cnt2 + 1;
			}
			set '@cnt,1;
			mes "-Polishing work done-";
			next;
			if('@cnt2 < 3)
				mes "-Long way to go yet." ;
			else if('@cnt2 < 6)
				mes "-I guess I need to work out more." ;
			else if('@cnt2 < 9)
				mes "-Let's keep working out at this rate." ;
			else if('@cnt2 < 12)
				mes "-I'm getting a lot of workout." ;
			else if('@cnt2 < 15)
				mes "-Almost done." ;
			else {
				mes "-It's time to do some finishing work-";
				continue;
			}
			mes "-Next, let's do the hardening work-";
			continue;
		case 2:
			misceffect 101,"";
			if('@cnt == 1) {
				set '@cnt2,'@cnt2 + 1;
			}
			set '@cnt,2;
			mes "-Hardening operation performed-";
			next;
			if('@cnt2 < 3)
				mes "-There's still a long way to go." ;
			else if('@cnt2 < 6)
				mes "-I guess I need to work out more." ;
			else if('@cnt2 < 9)
				mes "-Let's keep working out at this rate." ;
			else if('@cnt2 < 12)
				mes "-I'm getting a lot of workout." ;
			else if('@cnt2 < 15)
				mes "-Almost done." ;
			else {
				mes "-It's time to do some finishing work-";
				continue;
			}
			mes " -Let's do some polishing next-";
			continue;
		case 3:
			mes "-Finishing work was done on the weapon matting-";
			next;
			misceffect 101;
			delitem 1002,'@iron[0];
			delitem 998,'@iron[1];
			delitem 999,'@iron[2];
			delitem 1010,'@iron[3];
			delitem 1011,'@iron[4];
			delitem 756,'@iron[5];
			delitem 757,'@iron[6];
			if('@cnt2 < 15) {
				misceffect 183,"";
				mes "-The prototype was broken in the middle of the finishing process-";
				next;
				mes "-Maybe there was a problem with the fabrication process. ......." ;
				mes "-We have to start all over again from the beginning-";
				close;
			}
			misceffect 103,"";
			if('@type == 1) {
				compquest 5142;
				setquest 5143;
				getitem 13074,1;
			}
			else {
				compquest 5142;
				setquest 5144;
				getitem 13312,1;
			}
			mes "-prototype completed-";
			next;
			mes "-Let's show the finished product to the leopard-";
			close;
		}
	}
}

job_ko.gat,129,129,0 duplicate(fabrication tool#ko_01) fabrication tool#ko_02 844
job_ko.gat,116,124,0 duplicate(fabrication tool#ko_01) fabrication tool#ko_03 844

job_ko.gat,121,121,0 script refining equipment#ko_01 844,{
	if(!checkquest(5143) && !checkquest(5144)) {
		mes "-It's a device that does the refining automatically." ;
		mes " but you won't need to use it now -";
		close;
	}
	mes "-The refining device is turned on." ;
	mes " The equipment started working with a quiet sound-";
	next;
	mes "-There is a warehouse with Oridecon next to the equipment and it will be ready for refining soon-";
	next;
	if(select("refine", "don't refine") == 2) {
		mes "-Equipment turned off-";
		close;
	}
	if(getequipisequiped(4)==0) {
		mes "-hearing a warning sound from the beep-beep device-";
		next;
		mes "[leopard]";
		mes "If you want to refine, please equip your weapon." ;
		close;
	}
	if(getequipid(4) ! = 13074 && getequipid(4) ! = 13312) {
		mes "[leopard]";
		mes "Oh?" ;
		mes "That's not the weapon you made here." ;
		next;
		mes "[Leopard]";
		mes "If you want to enhance it, you can ask the blacksmith in town to do so." ;
		close;
	}
	mes "-Analyzing weapons-";
	next;
	if(getequiprefinerycnt(4) >= 10) {
		// not yet examined
		mes "-This weapon cannot be further refined-";
		close;
	}
	if(getequippercentrefinery(4) < 100) {
		mes "-This weapon has been refined several times, so if the refinement fails, the refinement value will drop by one -";
		next;
		if(select("Refine", "Do not refine") == 2) {
			mes "-Equipment turned off-";
			close;
		}
	}
	else {
		mes "-Begin refining-";
		next;
	}
	if(getequippercentrefinery(4) > rand(100)) {
		successrefitem 4;
		mes "-Successful refining-"; next; } if(getequippercentrefinery(4 > rand(100)) { successrefitem 4
		close;
	}
	else {
		downrefitem 4;
		mes "-refining failed." ;
		mes " The refining value has dropped by one -";
		close;
	}
}

job_ko.gat,127,121,0 duplicate(refining device#ko_01) refining device#ko_02 844

job_ko.gat,148,46,4 script guiding hand gion#ko 588,{
	switch(CHANGE_KO) {
	case 10:
		cutin "job_ko01",2;
		mes "[guiding hand Gion]";
		mes "I see you haven't defeated your target yet." ;
		next;
		mes "[guiding hand Gion]"; mes "[guiding hand Gion]"; mes "[guiding hand Gion]
		mes "The name of the target is ^FF000000, the past of the family ^000000." ;
		next;
		mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]"; mes "[Guiding Hand Gion]
		mes "Talk to me again when you have successfully killed it." ;
		mes "Or do you want to get out?" ;
		next;
		if(select("not answer", "go outside") == 1) {
			mes "[Guide Guion]";
			mes "There are many enemies with similar names, but I know you can finish them off." ;
			close2;
			cutin "job_ko01",255;
			end;
		}
		mes "[Guiding hand, Gion]";
		mes "Normally, it would be unforgivable to sneak out in the middle of an ordeal. ......" ;
		mes "Just this once." ;
		close2;
		cutin "job_ko01",255;
		warp "amatsu.gat",147,136;
		end;
	case 11:
		cutin "job_ko02",2;
		mes "[guiding hand gion]";
		mes "Looks like you finished the target well." ;
		next;
		if(Weight) {
			mes "[Guide Guion]";
			mes "You don't need anything extra for the first step on your new path." ;
			mes "I'll take care of your belongings, so leave everything with me and then talk to me again." ;
			next;
			switch(select("open ^0000FF warehouse^000000", "quit")) {
			case 1:
				mes "[Guide Guion]";
				mes "Let's open the warehouse." ;
				close2;
				openstorage;
				cutin "job_ko02",255;
				end;
			case 2:
				mes "[Guiding hand, Guion]";
				mes "What's more?" ;
				close2;
				cutin "job_ko02",255;
				end;
			}
		}
		cutin "job_ko04",2;
		mapannounce "job_ko.gat", "Guiding hand Gion : the clan" +strcharinfo(0)+ "is" +(Sex? "Shadow Wolf": "Oboro")+ "the way of the" + "Oboro. Blessed be He!" ,0;
		mes "[Guiding hand Geon]";
		mes "clan" +strcharinfo(0)+ "is";
		mes (Sex? "Shadow Wolf": "Oboro")+ "is to go the way of the" ;
		mes "Blessed be he!" ;
		next;
		cutin "job_ko02",2;
		mes "[Guiding hand, Guion]";
		mes "Let's welcome the emergence of a young man who seeks further extremes." ;
		next;
		mes "[Kuga Kai]";
		mes "Master Guion, please wait a moment." ;
		next;
		cutin "job_ko04",2;
		mes "[Guiding hand, Guion]";
		mes "Sorry, sorry." ;
		mes "I forgot about you." ;
		mes "Do you have something to tell " +strcharinfo(0)+ "?" ;
		next;
		cutin "job_ko01",255;
		mes "[Kuga Kai]";
		mes "Then ......" ;
		next;
		mes "[kuga kai]";
		mes ""+strcharinfo(0);
		mes "You are a proud member of our clan." ;
		mes "Live proudly and proudly at all times." ;
		next;
		mes "[Kuga Kai]";
		mes "...... I'm sorry I attacked you out of the blue when I first met you. ......" ;
		next;
		mes "[Leopard]";
		mes "phew ......" ;
		mes "Is the Kai one just words?" ;
		mes "Let me give you something more useful than him." ;
		next;
		mes "[Leopard]";
		mes "I took care of the prototype you made." ;
		next;
		mes "[leopard]";
		if(checkquest(5143) & 0x8) {
			// unexamined
			mes "The name of the weapon is 'Red'." ;
			mes "The weapon was designed to be caught up in demonic spirits as it was being cared for." ;
			set '@gain,13075;
		}
		else if(checkquest(5144) & 0x8) {
			mes "[leopard]";
			mes "The name of the weapon is 'shadow'." ;
			mes "The more I cared for the weapon, the more it blended into the darkdark." ;
			set '@gain,13311;
		}
		next;
		mes "[leopard]";
		mes "I think you'll like it." ;
		} next;
		mes "[leopard]";
		mes "So, Mr. Guion, please continue: ......." ;
		next;
		cutin "job_ko01",2;
		mes "[Guiding hand, Guion]";
		mes "woo hoo hoo ......" ;
		mes "You two got me on the line." ;
		mes "I have nothing to say to you." ;
		next;
		mes "[Guide Guion]";
		mes "I only regret that I could not create a better environment for a young man like you." ;
		next;
		mes "[Guiding Hand Guion]";
		mes "Keep moving forward." ;
		mes "And ......." ;
		next;
		if(sc_ison(SC_ALL_RIDING)) {
			// unexamined
			mes "[Guiding Guion]";
			mes "Hmm, you don't seem to be ready for a new journey." ;
			mes "Come down from your mount." ;
			close2;
			cutin "job_ko01",255;
			end;
		}
		if(SkillPoint) {
			mes "[Guiding hand, Guion]";
			mes "Hmm, you don't seem ready for a new journey." ;
			mes "Go and shake all your SkillPoints." ;
			close2;
			cutin "job_ko01",255;
			end;
		}
		resetstatus;
		resetskill;
		jobchange (Sex? Job_Kagerou: Job_Oboro);
		set CHANGE_KO,0;
		delquest 5136;
		delquest 5137;
		delquest 5138;
		delquest 5143;
		delquest 5144;
		delquest 72905;
		setquest 201655;
		getitem '@gain,1;
		mes "[Guiding hand, Guion]";
		mes "May the blessings of Lord Kagewolf and Oboro be upon your path!" ;
		close2;
		warp "que_ng.gat",22,69;
		end;
	default:
		mes "[Guiding hand Geon]";
		mes "May the blessings of Lord Kagewolf and Oboro be upon your path!" ;
		close2;
		warp "que_ng.gat",22,69;
		end;
	}
}

job_ko.gat,151,47,4 script kuga kai#ko2 730,{
	mes "[Kuga Kai]";
	mes "You've come this far ......" ;
	close;
}

job_ko.gat,145,47,6 script leopard#ko2 730,{
	mes "[leopard]";
	mes "Hey, it's time to go." ;
	close;
}

job_ko.gat,0,0,0 script ko_test_mon 139,{
OnTimer300000:
	initnpctimer;
	killmonster "job_ko.gat", "ko_test_mon::OnKilled1";
	set '@r,rand(getarraysize('mobid));
	areamonster "job_ko.gat",128,26,168,66, "family past",'mobid['@r],1, "ko_test_mon::OnKilled1";
	end;
OnInit:
	setarray 'mobid,1002,1010,1031,1049,1050,1063,1113;
	setarray 'mobname$,
		"Hazure of the clan", "Shadow wolf of the clan", "Oboro of the clan", "Kako of the clan", "Heritage of the clan",
		"blessing of the clan", "clan's mistake", "clan's black history", "clan's founder",
		"Shadow Wolf's Memory", "Shadow Wolf's Past", "Shadow Wolf's Memories", "Shadow Wolf's History",
		"Oboro's Memory", "Oboro's Past", "Oboro's Memories", "Oboro's History",
		"Clan of Error", "Clan of Ninja", "Fool of a Castle Lord", "Legacy of a Relative", "Past of a Relative";

	set '@r,rand(getarraysize('mobid));
	areamonster "job_ko.gat",128,26,168,66, "family past",'mobid['@r],1, "ko_test_mon::OnKilled1";

	for(set '@i,110; '@i<=171; set '@i,'@i+1) {
		set '@r1,rand(getarraysize('mobid));
		set '@r2,rand(getarraysize('mobname$));
		monster "job_ko.gat",'@i,50,'mobname$['@r2],'mobid['@r1],1, "ko_test_mon::OnKilled2";
	}
	for(set '@i,31; '@i<=81; set '@i,'@i+1) {
		set '@r1,rand(getarraysize('mobid));
		set '@r2,rand(getarraysize('mobname$));
		monster "job_ko.gat",140,'@i,'mobname$['@r2],'mobid['@r1],1, "ko_test_mon::OnKilled2";
	}
	initnpctimer;
	end;
OnKilled1:
	if(CHANGE_KO == 10)
		set CHANGE_KO,11;
	end;
OnKilled2:
	if(rand(2)) {
		set '@x,rand(110,171);
		set '@y,50;
	}
	else {
		set '@x,140;
		set '@y,rand(31,81);
	}
	set '@r1,rand(getarraysize('mobid));
	set '@r2,rand(getarraysize('mobname$));
	monster "job_ko.gat",'@x,'@y,'mobname$['@r2],'mobid['@r1],1, "ko_test_mon::OnKilled2";
	if(!rand(3))
		warp "job_ko.gat",16,113;
	end;
}

que_ng.gat,75,23,3 script blacksmith tene#ko 762,{
	mes "[blacksmith Thane]";
	mes "Good day to you, sir." ;
	mes "I am Thane, the most polite of blacksmiths." ;
	next;
	mes "[Blacksmith Thane]";
	mes "How may I help you today?" ;
	next;
	switch(select("What work can you do?" , "Add ability", "Delete ability")) {
	case 1:
		mes "[Blacksmith Thane]";
		mes "Oops!" ;
		mes "I'm afraid I didn't introduce myself well enough." ;
		mes "I am sorry." ;
		next;
		mes "[Blacksmith Thane]";
		mes "I can add abilities to some equipment." ;
		mes "I will charge a small fee for doing so." ;
		next;
		mes "[Blacksmith Thane]";
		mes "In addition, the abilities granted will vary depending on the refining value of the equipment." ;
		mes "Also, ^FF0000 abilities will never fail to be granted. ^000000";
		next;
		mes "[Blacksmith Thane]";
		mes "Would you also like to see a list of the equipment we carry?" ;
		next;
		switch(select("see list of weapons", "see list of armor")) {
		case 1:
			mes "[Blacksmith Thane]";
			mes "Here is the list of weapons." ;
			next;
			mes "[Blacksmith Thane]";
			mes "The weapons I am dealing with are ^FD3302 Rasenken Crescent Moon Fuuma Shuriken, Ranhua Fuuma Shuriken, Ran Yuki Fuuma Shuriken, and Thunderstorm ^000000." ;
			next;
			mes "[Blacksmith Thane]";
			mes "That is all." ;
			mes "I still have to train myself to handle even more armors." ;
			next;
			mes "[Blacksmith Thane]";
			mes "If you wish, I can add abilities to slots 3 and 4." ;
			close;
		case 2:
			mes "[Blacksmith Thane]";
			mes "Here is the list of armor." ;
			next;
			mes "[Blacksmith Thane]";
			mes "The armor I am dealing with is ^FD3302 wolf crested hand armor crescent moon crested hand armor round scaled armor foggy dark shadow special Ninja suit [1]^000000." ;
			next;
			mes "[Blacksmith Thane]";
			mes "That is all." ;
			mes "I still have to train myself to handle even more armors." ;
			next;
			mes "[Blacksmith Thane]";
			mes "If you wish, I can add abilities to slots 3 and 4." ;
			close;
		}
	case 2:
		mes "[Blacksmith Thane]";
		mes "I see that you have added the ability." ;
		mes "We will add abilities to the 4th and 3rd slots of the armament you have equipped, in that order." ;
		next;
		mes "[Blacksmith Thane]";
		mes "Due to my ingenuity, you will not lose ^FF000000 refining value ^000000 or already inserted ^FF000000 cards ^000000." ;
		mes "Nor will it fail to grant ^FF0000 abilities. ^000000";
		next;
		mes "[Blacksmith Thane]";
		mes "However, we do charge a small ^5565AA fee ^000000 because of the price of the materials." ;
		next;
		mes "[Blacksmith Thane]"; mes "[Blacksmith Thane]"; mes "[Blacksmith Thane]
		mes "Oops, sorry for the long explanation." ;
		mes "Which equipment do you want to give the ability to?" ;
		next;
		switch(select("weapon", "armor")) {
		case 1:
			mes "[Blacksmith Thane]";
			mes "You wish to grant abilities to the weapon." ;
			mes "The ^E14A1E fee to grant abilities to a weapon is 100,000Zeny^000000 per time." ;
			next;
			mes "[Blacksmith Thane]";
			mes "And could you please equip ^FF000000 one-handed weapons on your right hand ^000000 in advance?" ;
			mes "We would appreciate your cooperation." ;
			next;
			mes "[Blacksmith Thane]";
			mes "To which weapon would you like to grant the ability?" ;
			next;
			switch(select("Another time", "Rasenken", "Mikazuki", "Fuuma Shuriken/Ranka", "Fuuma Shuriken/Ransetsu", "Fuuma Shuriken/Raisetsu", "Fuuma Shuriken/Raisyu")) {
			case 1:
				mes "[Blacksmith Thane]";
				mes "Do you need time to reconsider?" ;
				mes "Please come back anytime." ;
				close;
			case 2: set '@itemid,13076; set '@menu,4; break
			case 3: set '@itemid,13078; set '@menu,4; break
			case 4: set '@itemid,13313; set '@menu,4; break
			case 5: set '@itemid,13314; set '@menu,4; break
			case 6: set '@itemid,13315; set '@menu,4; break
			}
			break;
		case 2:
			mes "[Blacksmith Thane]";
			mes "You wish to grant abilities to armor." ;
			mes "The ^E14A1E fee for granting abilities to armor is 100,000Zeny^000000 per time." ;
			next;
			mes "[Blacksmith Thane]";
			mes "Which armor do you want to grant abilities to?" ;
			next;
			switch(select("another time", "wolf crest hand armor", "crescent moon crest hand armor", "circular scale armor", "dark shadow in the mist", "special Ninja suit[1]")) {
			case 1:
				mes "[Blacksmith Thane]";
				mes "Do you need time to reconsider?" ;
				mes "Please come back anytime." ;
				close;
			case 2: set '@itemid,2172; set '@menu,3; break
			case 3: set '@itemid,2173; set '@menu,3; break
			case 4: set '@itemid,15054; set '@menu,2; break
			case 5: set '@itemid,15055; set '@menu,2; break
			case 6: set '@itemid,15056; set '@menu,2; break
			}
			break; }
		}
		break; }
	case 3:
		mes "[Blacksmith Thane]";
		mes "Do you wish to remove an already granted ability?" ;
		mes "It seems that you did not like the ability that was granted to you." ;
		next;
		mes "[Blacksmith Thane]";
		mes "Then we apologize for the often high fees. ......" ;
		next;
		mes "[Blacksmith Thane]";
		mes "The ^E14A1E ability removal fee is 100,000Zeny^000000." ;
		mes "Which equipment ability do you want to delete? ";
		next;
		switch(select("another time", "Rasenken", "Crescent Moon", "Fuuma Shuriken/Ranka", "Fuuma Shuriken/Ransetsu", "Fuuma Shuriken/Raisetsu", "Fuuma Shuriken/Raisetsu", "Wolf Crested Armor", "Crescent Moon Crested Armor", "Enscale Armor", "Dark Shadow in the Mist", "Special Ninja Suit [1]")) {
		case 1:
			mes "[Blacksmith Thane]";
			mes "So the fee burden is still high?" ;
			mes "We will make more efforts to lower the fees a bit." ;
			close;
		case 2: set '@itemid,13076; set '@menu,4; break
		case 3: set '@itemid,13078; set '@menu,4; break
		case 4: set '@itemid,13313; set '@menu,4; break
		case 5: set '@itemid,13314; set '@menu,4; break
		case 6: set '@itemid,13315; set '@menu,4; break
		case 7: set '@itemid,2172; set '@menu,3; break
		case 8: set '@itemid,2173; set '@menu,3; break
		case 9: set '@itemid,15054; set '@menu,2; break
		case 10: set '@itemid,15055; set '@menu,2; break
		case 11: set '@itemid,15056; set '@menu,2; break
		}
		mes "[Blacksmith Thane]";
		mes "^44B7BC" +getitemname('@itemid)+ "Would you like to initialize ^000000 abilities?" ;
		next;
		mes "[Blacksmith Thane]";
		mes "We also offer a service to remove only the ability of slot 3, leaving the ability of slot 4, while keeping the fee." ;
		mes "Please note that it is not possible to remove only the ability of slot 4." ;
		next;
		switch(select("initialize only slot 3", "initialize both")) {
		case 1:
			mes "[Blacksmith Thane]";
			mes "Yes, sir." ;
			mes "Only slot 3 will be initialized." ;
			set '@type,1;
			break;
		case 2:
			mes "[Blacksmith Thane]";
			mes "Yes, sir." ;
			mes "We will initialize both slots." ;
			set '@type,2;
			break;
		}
		next;
		if(getequipid('@menu) ! = '@itemid) {
			mes "[Blacksmith Thane]";
			mes "It appears that you are not equipped with the equipment you wish to work with." ;
			next;
			mes "[Blacksmith Thane]";
			mes "Please make sure you are equipped with the equipment you wish to work with." ;
			close;
		}
		if(Zeny < 100000) {
			mes "[Blacksmith Thane]";
			mes "We are very sorry, but the commission seems to be insufficient." ;
			next;
			mes "[Blacksmith Thane]";
			mes "We have to charge the minimum necessary commission because the raw materials are very expensive." ;
			close;
		}
		set '@refine,getequiprefinerycnt('@menu);
		set '@card1,getequipcardid('@menu,0);
		set '@card2,getequipcardid('@menu,1); }
		set '@card3,getequipcardid('@menu,2);
		set '@card4,getequipcardid('@menu,3);
		if('@type == 1) {
			if('@card3 == 0) {
				mes "[Blacksmith Thane]";
				mes "Number 3 has no ability." ;
				mes "Please confirm." ;
				close;
			}
			set '@card3,0;
		}
		else if('@type == 2) {
			if('@card3 == 0 && '@card4 == 0) {
				mes "[Blacksmith Thane]";
				mes "The equipment has not been given any abilities." ;
				mes "Please check it." ;
				close;
			}
			set '@card3,0;
			set '@card4,0;
		}
		set Zeny,Zeny-100000;
		delequip '@menu;
		getitem2 '@itemid,1,1,'@refine,0,'@card1,'@card2,'@card3,'@card4;
		mes "[Blacksmith Thane]";
		mes "Initialization has been successfully completed." ;
		close;
	}
	// Continuing to grant abilities
	if(getequipid('@menu) ! = '@itemid) {
		mes "[Blacksmith Thane]";
		mes "It appears that you are not equipped with the equipment you wish to work with." ;
		next;
		mes "[Blacksmith Thane]";
		mes "Please make sure you are equipped with the equipment you wish to work with." ;
		close;
	}
	if(Zeny < 100000) {
		mes "[Blacksmith Thane]";
		mes "We are very sorry, but the commission seems to be insufficient." ;
		next;
		mes "[Blacksmith Thane]";
		mes "We have to charge the minimum necessary commission because the raw materials are very expensive." ;
		close;
	}
	set '@refine,getequiprefinerycnt('@menu);
	set '@card1,getequipcardid('@menu,0);
	set '@card[1],'@card1;
	set '@card2,getequipcardid('@menu,1);
	set '@card[2],'@card2;
	set '@card3,getequipcardid('@menu,2);
	set '@card[3],'@card3;
	set '@card4,getequipcardid('@menu,3);
	set '@card[4],'@card4;
	if('@card4 == 0) {
		mes "[Blacksmith Thane]";
		mes "The equipment has not been given the ability." ;
		mes "Would you like to grant the ability to slot 4?" ;
		set '@slot,4;
	}
	else if('@card3 == 0) {
		mes "[Blacksmith Thane]";
		mes "This is an equipment item that has already been given the ability in slot 4." ;
		mes "Would you like to grant the ability to slot 3 as well?" ;
		set '@slot,3;
	}
	else {
		mes "[Blacksmith Thane]";
		mes "It is difficult to grant any more abilities with my power." ;
		next;
		mes "[Blacksmith Thane]";
		mes "If you don't like the ability granted, why don't you initialize it?" ;
		close;
	}
	next;
	if(select("Another time", "grant") == 1) {
		mes "[Blacksmith Thane]";
		mes "Yes, sir." ;
		mes "Please come again." ;
		close;
	}
	mes "[Blacksmith Thane]";
	mes "Then we will work on granting the ability to the " +'@slot+ "number slot." ;
	next;
	misceffect 154;
	set Zeny,Zeny-100000;
	delequip '@menu;
	if('@refine <= 4) {
		set '@rand,rand(1,26);
		setarray '@rate[1],20,16,14,13,7,3,1,0;
		setarray '@tbl_enchant[1],4786,4787,4788,4789,4791,4792,4793,4794;
	}
	else if('@refine <= 7) {
		set '@rand,rand(1,44);
		setarray '@rate[1],41,38,35,32,29,26,20,16,14,13,7,3,1,0;
		setarray '@tbl_enchant[1],4700,4710,4720,4730,4740,4750,4786,4787,4788,4789,4791,4792,4793,4794;
	}
	else if('@refine <= 9) {
		set '@rand,rand(1,36);
		setarray '@rate[1],32,28,24,20,16,12,10,8,6,4,2,0;
		setarray '@tbl_enchant[1],4700,4701,4710,4711,4720,4721,4730,4731,4740,4741,4750,4751;
	}
	else {
		set '@rand,rand(1,46);
		setarray '@rate[1],42,38,36,35,33,32,28,24,20,16,12,10,8,6,4,2,0;
		setarray '@tbl_enchant[1],4795,4796,4797,4800,4801,4700,4701,4710,4711,4720,4721,4730,4731,4740,4741,4750,4751;
	}
	for(set '@j,1; '@j <= getarraysize('@rate); set '@j,'@j+1) {
		if ('@rand > '@rate['@j]) {
			set '@card['@slot],'@tbl_enchant['@j];
			break;
		}
	}
	getitem2 '@itemid,1,1,'@refine,0,'@card[1],'@card[2],'@card[3],'@card[4];
	mes "[blacksmith Thane]";
	mes "^44B7BC" +getitemname('@itemid)+ "^000000 has been given the ability." ;
	close;
}

que_ng.gat,21,72,6 script armor Artisan Guillot#kaboro 934,{
	mes "[Guillot]";
	mes "What do you consider victory?" ;
	mes "Defeating the enemy. ......" ;
	mes "That's certainly true." ;
	mes "But there are more important things to do." ;
	mes "That is to never fall down!" ;
	next;
	mes "[Guillot]";
	mes "To do that, you have to protect yourself." ;
	mes "One who cannot protect 'himself' cannot protect 'others'." ;
	next;
	if(select("create armor", "end conversation") == 2) {
		mes "[Guillot]";
		mes "Being cautious is a very important element in combat." ;
		close;
	}
	switch(select("wolf crest hand armor[1]", "crescent moon crest hand armor[1]", "circle scale armor[1]", "dark shadow in fog[1]", "quit")) {
	case 1:
		mes "[Guillot]";
		mes "Wolf patterned hand armor[1]?" ;
		mes "You picked a wild one." ;
		while(1) {
			next;
			switch(select("see materials", "see performance", "create", "quit")) {
			case 1:
				mes "[Guillot]";
				mes "^ff0000Wolf crest hand armor [1] requires 1 fox crest hand armor [1] 10 wolf blood ^000000." ;
				mes "You can feel it, can't you?" ;
				mes "The hot, burning wolf's blood." ;
				continue;
			case 2:
				mes "[Wolf Crested Hand Armor[1]]";
				mes "Atk + 100Flee - 50 for 5 seconds at a certain chance when hit by a physical attack";
				next;
				mes "[Wolf Crest Hand Armor [1]]";
				mes "[Armor of Circular Scales]";
				mes "When equipped together with, additional Str + 2 Damage dealt by physical attacks + 10%";
				next;
				mes "[Wolf Crested Armor[1]]"; mes "[Wolf Crested Armor]"; mes "[Wolf Crested Armor]
				mes "series : shield defense : 70 weight : 25 required level : 100 equip : shadow wolf Oboro";
				continue;
			case 3:
				set '@gain,2172;
				setarray '@need,2171,6252;
				setarray '@amount,1,10;
				break;
			case 4:
				mes "[Guillot]";
				mes "Well, think about it." ;
				close;
			}
			break;
		}
		break;
	case 2:
		mes "[Guillot]";
		mes "A crescent moon patterned cuirass [1]?" ;
		mes "It is a fine piece, both beautiful and strong." ;
		while(1) {
			next;
			switch(select("see materials", "see performance", "create", "stop")) {
			case 1:
				mes "[Guillot]";
				mes "^ff0000Crescent moon crest hand armor [1] will require 100 pieces of crystal ^000000 for one fox crest hand armor [1]." ;
				mes "This will carve a beautiful crescent moon as clear and beautiful as crystal." ;
				continue;
			case 2:
				mes "[Crescent moon pattern hand armor[1]]";
				mes "For every 1 increase in refinement value, skill delay - 2% [dark shadow in fog]";
				mes "When equipped with, additional Flee + 10 Complete Evasion + 10";
				next;
				mes "[Crescent Moon Pattern Hand Armor [1]]";
				mes "series : shield defense : 45 weight : 25 required level : 100 equip : shadow wolf Oboro";
				continue;
			case 3:
				set '@gain,2173;
				setarray '@need,2171,7321;
				setarray '@amount,1,100;
				break;
			case 4:
				mes "[Guillot]";
				mes "Well, think about it." ;
				close;
			}
			break;
		}
		break;
	case 3:
		mes "[Guillot]";
		mes "Armor [1] of the circle scale?" ;
		mes "This seems to be what the legendary Ninja once wore." ;
		while(1) {
			next;
			switch(select("see materials", "see performance", "create", "quit")) {
			case 1:
				mes "[Guillot]";
				mes "The ^ff000000 yen scale armor [1] will require 30 fire dragon scales, 30 ice scales, and 30 fresh blood scales ^000000." ;
				continue;
			case 2:
				mes "[circular scales[1]]";
				mes "MaxHP + 15%MaxSP - 30%";
				next;
				mes "[circular scales[1]]"; mes "MaxHP + 15%MaxSP - 30%"; next; next; next; next; next; next; next; next; next; next; next; next; next
				mes "[Wolf Pattern Hand Armor]";
				mes "When equipped together with, additional Str + 2 Damage dealt by physical attacks + 10%";
				next;
				mes "[Circular Scale Scales[1]]"; mes "[Circular Scale Scales]"; mes "[Circular Scale Scales]"; mes "[Circular Scale Scales]
				mes "series : armor defense : 90 weight : 180 required level : 100 equip : shadow wolf Oboro";
				continue;
			case 3:
				set '@gain,15054;
				setarray '@need,7451,7562,6091;
				setarray '@amount,30,30,30;
				break;
			case 4:
				mes "[Guillot]";
				mes "Well, think about it." ;
				close;
			}
			break;
		}
		break; }
	case 4:
		mes "[Guillot]";
		mes "Foggy dark shadow [1] or ......." ;
		mes "This is made to hide in the fog, to hide in the dark, and to protect oneself." ;
		while(1) {
			next;
			switch(select("see materials", "see performance", "create", "stop")) {
			case 1:
				mes "[Guillot]";
				mes "^ff0000Special Ninja suit[1] for foggy dark shadow[1]"; mes "^ff0000Special Ninja suit[1] for foggy dark shadow[1]"; mes "^ff0000Special Ninja suit[1] for dark shadow[1]
				mes "10 pieces of darkdark^000000 will be needed." ;
				continue;
			case 2:
				mes "[Foggy dark shadow[1]]"; mes "[Foggy dark shadow[1]]"; mes "[Foggy dark shadow[1]]";
				mes "When you are hit by Agi + 1 physical attack, there is a certain probability that you will activate the autospell [Illusion - shadow warrior -] Lv1 for yourself."
				next;
				mes "[Dark Shadow in Mist[1]]";
				mes "[Crescent Moon Pattern Hand Armor]";
				mes "When equipped together with, additional Complete Evasion + 10Flee + 10";
				next;
				mes "[Dark Shadow in the Mist[1]]";
				mes "series : armor defense : 60 weight : 150 required level : 100 equip : shadow wolf Oboro";
				continue;
			case 3:
				set '@gain,15055;
				setarray '@need,15056,6089;
				setarray '@amount,1,10;
				break;
			case 4:
				mes "[Guillot]";
				mes "Well, think about it." ;
				close;
			}
			break;
		}
		break; }
	}
	mes "[Guillot]";
	mes "There is an Attention point in the creation." ;
	mes "If you have more than one piece of material equipment in your possession to use for creation, you cannot specify ^ff000000which one to use for material. Be careful to come with only the one you ^000000use for materials in your possession." ;
	next;
	mes "[Guillot]";
	mes "I don't care if you regret it later." ;
	mes "Then, may I create it?" ;
	next;
	if(select("create", "quit") == 2) {
		mes "[Guillot]";
		mes "Well, think about it." ;
		close;
	}
	for(set '@i,0; '@amount['@i]! =0; set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[Guillot]";
			mes "......." ;
			mes "Looks like you're running out of material." ;
			switch('@gain) {
			case 2172:
				mes "^ff000000 wolf crested cuirass[1] is one fox crested cuirass[1] 10 wolf's blood ^000000";
				break;
			case 2173:
				mes "^ff000000Crescent moon pattern hand armor[1] is fox pattern hand armor[1], 100 pieces of crystal^000000";
				break;
			case 15054:
				mes "^ff000000 Yen scale armor[1] is 30 fire dragon scales, 30 ice scales, and 30 fresh blood scales^000000";
				break;
			case 15055:
				mes "^ff0000Misty dark shadow[1] has a special Ninja suit[1]"; break; case 15055: "^ff000000 dark shadow[1] has a special Ninja suit[1]"; break; case 15056;
				mes "10 pieces of darkdark^000000";
				break;
			}
			mes "is needed." ;
			mes "Look hard and see." ;
			close;
		}
	}
	if(checkitemblank() == 0) {
		mes "[Guillot]";
		mes "Looks like you have too much baggage." ;
		mes "Come back after you've reduced your load." ;
		close;
	}
	if(checkweight('@gain,1) == 0) {
		mes "[Guillot]";
		mes "Looks like the load is too heavy." ;
		mes ""+getitemid('@gain)+ "[1] is weight" +(getiteminfo('@gain,6)/10)+ "" ;
		mes "Lighten the load and come back." ;
		close;
	}
	for(set '@i,0; '@amount['@i]! =0; set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	getitem '@gain,1;
	mes "[Guillot]";
	mes "Mm. It's done." ;
	mes "Beautiful ......." ;
	close;
}

que_ng.gat,23,70,3 script weapon Artisan key#kaboro 939,{
	mes "[key]";
	mes "There is a saying that attack is the best defense." ;
	mes "A strong weapon is the only thing that can protect me." ;
	next;
	mes "[key]";
	mes "If you have the materials you need, I will provide you with a special item." ;
	next;
	if(select("create weapon", "end conversation") == 2) {
		mes "[key]";
		mes "The problem is that we are too cautious." ;
		close;
	}
	switch(select("Rasenken[1]", "Mikazuki[1]", "Fuuma Shuriken/Ranka[2]", "stop")) {
	case 1:
		mes "[key]";
		mes "The Rasenken[1] is a difficult weapon that only those with some training can handle." ;
		while(1) {
			next;
			switch(select("see material", "see performance", "create", "quit")) {
			case 1:
				mes "[key]";
				mes "^ff0000 Rasen sword will require 1 Murasame [2] 1 Garnet ^000000." ;
				mes "The garnet gives the Rasen sword its unique and beautiful color." ;
				continue;
			case 2:
				mes "[Rasen Sword[1]]";
				mes "Int + 3Matk + 100";
				next;
				mes "[Rasenken[1]]"; mes "Int + 3Matk + 100"; next; next; mes "[Rasenken[1]]";
				mes "Series : Dagger Attack : 120 Weight : 60 Weapon Level : 3 Requirement Level : 110 Equipment : Shadow Wolf Oboro";
				continue;
			case 3:
				set '@gain,13076;
				setarray '@need,13013,718;
				setarray '@amount,1,1;
				break;
			case 4:
				mes "[key]";
				mes "Well, think about it." ;
				close;
			}
			break;
		}
		break;
	case 2:
		mes "[key]";
		mes "Crescent[1] or ......." ;
		mes "A beautiful curve that curves like a crescent moon." ;
		mes "One of the few that can produce this finish." ;
		while(1) {
			next;
			switch(select("see materials", "see performance", "create", "stop")) {
			case 1:
				mes "[key]";
				mes "^ff0000Crescent moon[1] will require 1 white blade[1] 1 opal ^000000." ;
				mes "The opal makes the light of the crescent moon shine even brighter." ;
				continue;
			case 2:
				mes "[Crescent Moon[1]]";
				mes "Matk + 120, SP consumption when using skill - 5% Chanting time when using skill - 5%";
				next;
				mes "[Crescent Moon[1]]";
				mes "Series : Dagger Attack : 50 Weight : 60 Weapon Level : 4 Requirement Level : 100 Equipment : Shadow Wolf Oboro";
				continue;
			case 3:
				set '@gain,13078;
				setarray '@need,13015,727;
				setarray '@amount,1,1;
				break;
			case 4:
				mes "[key]";
				mes "Well, think about it." ;
				close;
			}
			break;
		}
		break;
	case 3:
		mes "[key]";
		mes "Fuuma shuriken, ranka [2]?" ;
		mes "This is really beautiful too." ;
		mes "Have you ever seen petals dancing?" ;
		while(1) {
			next;
			switch(select("see material", "see performance", "create", "stop")) {
			case 1:
				mes "[key]";
				mes "^ff0000Fuuma Shuriken, Ranhua [2] will require 100 ^000000 broken shurikens, one Fuuma Shuriken, Meijo [2]." ;
				mes "A little more shurikens are needed, but only to dance beautifully." ;
				continue;
			case 2:
				mes "[Fuuma Shuriken-Ranka[2]]";
				mes "Matk + 50 skill [Fuuma Shuriken-Ranka-]";
				mes "Damage dealt by + 20%";
				next;
				mes "Series : Fuuma Shuriken Attack : 150 Weight : 150 Weapon Level : 3 Requirement Level : 110 Equipment : Shadow Wolf Oboro";
				continue;
			case 3:
				set '@gain,13313;
				setarray '@need,13304,7156;
				setarray '@amount,1,100;
				break;
			case 4:
				mes "[key]";
				mes "Well, think about it." ;
				close;
			}
			break;
		}
		break; }
	case 4:
		mes "[key]";
		mes "Well, think about it." ;
		close;
	}
	mes "[key]";
	mes "There is an Attention point in the creation." ;
	mes "If you have more than one piece of material equipment in your possession to use for creation, you cannot specify ^ff000000which one to use for material. Be careful to come with only the one you ^000000use for materials in your possession." ;
	next;
	mes "[key]";
	mes "I don't care if you regret it later." ;
	mes "So, let's create it, shall we?" ;
	next;
	if(select("create", "quit") == 2) {
		mes "[key]";
		mes "Well, think about it." ;
		close;
	}
	for(set '@i,0; '@amount['@i]! =0; set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[key]";
			mes "No. Not enough material." ;
			switch('@gain) {
			case 13076:
				mes "The materials needed for the Rasen sword [1] are ^ff0000Rasen sword is 1 Murasame [2] 1 garnet ^000000";
				break;
			case 13078:
				mes "The materials required for the Crescent Moon [1] are ^ff000000 one white blade [1] and one opal ^000000";
				break;
			case 13313:
				mes "The materials required for ^ff000000Fuuma Shuriken, Ranhana [2] are ^ff000000Fuuma Shuriken, Meijo [2], 1 broken shuriken, 100 ^000000";
				break;
			}
			mes "That's all." ;
			mes "You can't have the materials equipped." ;
			close;
		}
	}
	if(checkitemblank() == 0) {
		mes "[key]";
		mes "Looks like you have too much baggage." ;
		mes "Please reduce your load and come back later." ;
		close;
	}
	if(checkweight('@gain,1) == 0) {
		mes "[key]";
		mes "Looks like the load is too heavy." ;
		mes ""+getitemid('@gain)+ "[" +getiteminfo('@gain,10)+ "] is weight" +(getiteminfo('@gain,6)/10)+ "" ;
		mes "Lighten the load and come back." ;
		close;
	}
	for(set '@i,0; '@amount['@i]! =0; set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	getitem '@gain,1;
	mes "[key]";
	mes "Mm. Done." ;
	mes "Beautiful ......." ;
	close;
}
