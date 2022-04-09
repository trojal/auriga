//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Lune's Request
//
// by Pneuma
// miracle box -------------------------------------------------

// red 0xFF0000
alberta.gat,39,46,5	script	Louise	726,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_1) goto L_OTHER;
	switch(AC_QUEST_LV_1){
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
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes "Ah! You, you!";
		next;
		menu "?" ,-;
		mes "[Louise]";
		mes "It's you, isn't it! The one who took my request from the Adventurers Academy.";
		next;
		mes "[Louise]";
		mes "I am the client!";
		mes "My name is Louise.";
		mes "Nice to meet you.";
		next;
		menu "How did you know?" ,-;
		emotion 1,"";
		mes "[Louise]";
		mes "I'm in business, and I've seen a lot of people.";
		mes "I've been in business for a long time, and I can usually tell what a person is doing at a glance.";
		next;
		mes "[Louise]";
		mes "I had heard that the best adventurer from the academy was coming, and when I saw you, I knew that this was the girl.";
		next;
		menu "...... What is your request?" ,-;
		mes "[Louise]";
		mes "The request is for you to help me find the owner of this box.";
		next;
		mes "[Louise]";
		mes "Actually, I just moved to Alberta.";
		next;
		mes "[Louise]";
		mes "So, when I was digging a hole to plant a hobby plant because my yard was so bare, I found this box.";
		next;
		mes "[Louise]";
		mes "I opened the box and there was a letter in it, and I was soooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo touched by this letter ......";
		next;
		mes "[Louise]";
		mes "And if you look at the date, this letter was written over ^FF000050 years ago^000000.";
		mes " I really want to find the owner of this letter.";
		next;
		mes "[Louise]";
		mes "But it's a 50 year old letter and it's so damaged that I can't read the part about the sender and the recipient.";
		next;
		mes "[Louise]";
		mes "So, you know, I've been told that there is a paper and pen expert here in east Alberta.";
		next;
		mes "[Louise]";
		mes "So, I need you to find that specialist and have him look up the sender and the part of the person you sent it to.";
		next;
		mes "[Louise]";
		mes "Yes, I'll give you the letter and envelope.";
		mes "Here is the sender and here is the person you sent it to.";
		next;
		mes "^FF0000 [Mission] ^000000-Meet the paper and pen expert in the eastern direction of Alberta-";
		close2;
		viewpoint 1,234,98,11,0x0000FF;
		// blue for some reason
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "From what I've heard, there are paper and pen experts here in the east side of Alberta.";
		next;
		mes "[Louise]";
		mes "So, I need you to find that specialist and have him look up the sender and the part of the person to whom you sent it.";
		next;
		mes "^FF0000[Mission] ^000000-Meet the paper and pen expert in the eastern direction of Alberta-";
		close2;
		viewpoint 1,234,98,11,0x0000FF;
		end;
	case 3:
		mes "-reported to Louise and gave her an envelope of letters-";
		next;
		mes "[Louise]";
		mes "Thank you!";
		mes "So the sender says ^FF0000Noriek^000000 and the person you sent it to says ^FF0000Tanya^000000!!!";
		next;
		emotion 2;
		mes "[Louise]";
		mes "Mufufu......";
		mes "Let's guess that name and read the letter again!";
		next;
	case 99:
		mes "[Louise]";
		mes ""+strcharinfo(0)+", thanks!";
		if('@novice && AC_QUEST_ST_1!=99){
			mes "This is a thank you.";
			mes "Please take it.";
		}
		next;
		if('@novice && AC_QUEST_ST_1!=99){
			// 645 10 speed-up potions
			if(!checkweight(645,10)){
				mes "-overweight! -";
				close;
			}
			getitem 645,10;
		}
		mes "^FF0000 [Mission Accomplished]^000000-You have accomplished your request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST02:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", long time no see!";
		mes "You look well.";
		next;
		emotion 2;
		mes "[Louise]";
		mes "Thanks for doing the research on my letter the other day!";
		mes "I've re-read ^FF0000Noriek^000000's letter to ^FF0000Tanya^000000 many times since then.";
		next;
		mes "[Louise]";
		mes "You know, this time I need you to deliver this package to someone named Royce in Payon.";
		mes "The delivery girl got hurt and can't carry it.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thank you.";
		mes "Please!";
		mes " -" + strcharinfo(0) + "is checked luggage -";
		next;
		mes "^FF0000 [mission] ^000000-go to Payon and meet Royce and give him the package-";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "I need you to deliver this package to someone named Royce in Payon.";
		next;
		mes "^FF0000[Mission] ^000000-go to Payon and meet Royce and give him the package-";
		close;
	case 3:
		mes "-reported to Louise-";
		next;
	case 99:
		mes "[Louise]";
		mes "Thank you!";
		mes "Thank you so much for your help!";
		mes "If you need anything else,";
		mes strcharinfo(0) + "to";
		mes "I'll be counting on you.";
		next;
		mes "^FF0000 [request accomplished] ^000000-you accomplished your request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST03:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", long time no see!";
		mes "You look well.";
		next;
		mes "[Louise]";
		mes "Quickly, I have a favor to ask.";
		mes "I have an urgent order from a guy named Archibald in Amatsu, and I need this package delivered ASAP.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thanks.";
		mes "Please!";
		mes " -" + strcharinfo(0) + "is checked luggage -";
		next;
		mes "^FF0000 [Mission] ^000000-go to Amatsu and meet Archibald and give him the package-";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "I got an urgent order from a guy named Archibald in Amatsu, and I need this package delivered ASAP.";
		next;
		mes "^FF0000[Mission] ^000000-go to Amatsu, meet Archibald and deliver the package-";
		close;
	case 3:
		mes "-reported to Louise-";
		next;
		mes "[Louise]";
		mes "Thank you!";
		mes "Thank you so much for your help!";
		mes "If you need anything else,";
		mes strcharinfo(0) + "to";
		mes "I'll be counting on you.";
		next;
		mes "[Louise]";
		mes "I'm grateful to you for all you've done for me, both in your letters and otherwise.";
		next;
		menu "Letter ...... yes, about Noriek!" ,-;
		mes "-I told Louise that Archibald was talking about Noriek-";
		next;
		mes "-Louise stopped moving for a few seconds, as if time had stopped.";
		mes "And then she screamed -";
		next;
		emotion 0;
		mes "[Louise]";
		mes "Yeah yeah yeah!!!! Really!";
		mes "Really!";
		next;
		mes "[Louise]";
		mes "Noriek......";
		mes "Noriek was really there, wasn't he?";
		next;
		mes "-Louise started talking about that letter-";
		next;
		mes "[Louise]";
		mes "That letter, the one where Noriek proposes to someone named Tanya.";
		mes "[Noriek] is a mercenary, and Tanya is the daughter of a famous family.";
		next;
		mes "[Louise]";
		mes "It says something like, I am a mercenary, and I may be disproportionate to you, but I will make you happy for the rest of my life.";
		mes "It's full of tenderness and feelings for Tanya. ......";
		next;
		emotion 40;
		mes "[Louise]";
		mes "I was so moved when I read that letter.";
		mes "I wish someone would say something like that to me. ......";
		next;
		mes "[Louise]";
		mes "Well, well, let's leave it at that!";
		mes " I really want to know if these two people are happy, or why this letter was buried.";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", thank you so much!";
		mes "I got my stuff moved and heard great things about you!";
		if('@novice && AC_QUEST_ST_1!=99){
			mes "This feels good.";
		}
		next;
		if('@novice && AC_QUEST_ST_1!=99){
			if(!checkweight(2101,1)){
				mes "-overweight! -";
				close;
			}
			getitem 2101,1;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes "Mr. Archibald says you were with him in the mercenaries. ......";
		close2;
		//close but the next page is displayed. As per the main mackerel.
		mes "^FF0000 [request accomplished] ^000000-you accomplished the request!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST04:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", long time no see!";
		mes "You look well.";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + "I have a favor to ask of you.";
		mes "It's about Noriek. ......";
		next;
		mes "[Louise]";
		mes "Last time you mentioned that Mr. Archibald was in the same mercenary group as Noriek.";
		next;
		mes "[Louise]";
		mes "Actually, after that, I couldn't stop thinking about Noriek, so I went to Mr. Archibald.";
		next;
		mes "[Louise]";
		mes "Then, you know, Mr. Archibald was injured in battle and quit the mercenary company early on.";
		mes "After that, he couldn't see Noriek anymore and they lost touch.";
		next;
		mes "[Louise]";
		mes "But, you know, I heard that the mercenary group is no longer there, but they were based in Gonryun, so they told me that if I went to Gonryun, I might be able to find out something.";
		next;
		mes "[Louise]";
		mes "So, please!";
		mes "I need you to go to Gonryun and gather information about the mercenary group, Noriek.";
		next;
		mes "[Louise]";
		mes "Actually, I'm the one who wants to go there. ......";
		mes "Actually, you know, you said I went to Mr. Archibald's place.";
		next;
		emotion 4;
		mes "[Louise]";
		mes "But you know, I had an important business meeting that day.";
		mes "I had to skip it, so I lost a lot of credibility with the customer. ......";
		next;
		menu "How did you get there ......",-;
		mes "[Louise]";
		mes "I can't stop thinking about Noriek and Tanya ......";
		mes "Noriek's letter has stolen my heart or ......";
		next;
		mes "[Louise]";
		mes "But if I lose any more credibility with my customers, this Louise store will tip over. ......";
		next;
		mes "[Louise]";
		mes "So,";
		mes strcharinfo(0) + ",";
		mes "Please, go to Gonryun and gather information about the mercenaries, Noriek.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thank you!";
		mes "Here's where the mercenaries were.";
		next;
		mes "^FF0000 [Mission] ^000000-go to Gonryun and go to the place where the mercenary group had its headquarters and look for information-";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "Thank you!";
		mes "It seems that the mercenaries were somewhere around here.";
		next;
		mes "^FF0000 [Mission] ^000000-go to Gonryun and go to the place where the mercenary group had its headquarters and look for information-";
		close;
	case 3:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", how was it?";
		next;
		mes "-reported to Louise-";
		next;
		mes "[Louise]";
		mes "You are contacted by someone named Grayson.";
		mes "Okay.";
		next;
		EMOTION 2;
		mes "[Louise]";
		mes "I feel like I'm getting closer to Noriek!";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", thanks for everything.";
		mes "I'd really like to go, myself, but ......";
		mes "I can't get there often because of work.";
		next;
	case 99:
		mes "[Louise]";
		mes ""+strcharinfo(0) + "I'm sure I'll have to ask you again.";
		mes "I'm counting on you.";
		next;
		mes "^FF0000 [request accomplished] ^000000-you accomplished your request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST05:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", long time no see!";
		next;
		mes "[Louise]";
		mes "Hey, I just heard from Grayson at Gonryun!";
		next;
		mes "[Louise]";
		mes "The guy who said he was in the mercenaries is Donatello, and he's in Louyang right now.";
		next;
		mes "[Louise]";
		mes "So,";
		mes strcharinfo(0) + ",";
		mes "Please!";
		mes "I want you to go to Louyang and ask Mr. Donatello about Noriek.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thanks!";
		next;
		mes "[Louise]";
		mes "ugh, maybe now I can find out where Noriek is.";
		mes " I wonder if Noriek and Tanya are happy now.";
		next;
		mes "[Louise]";
		mes "My guess!";
		mes "Noriek has Tanya on her ass.";
		next;
	case 2:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", please!";
		next;
		mes "^FF0000 [Mission] ^000000-Meet Donatello in Louyang and ask him about Noriek-";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 3:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", how was it?";
		mes "Did you find out about Noriek?";
		mes "Tell me, tell me.";
		next;
		menu "......",-;
		mes "-Reported to Louise that Noriek had been killed in action 50 years ago-";
		next;
		emotion 9;
		mes "[Louise]";
		mes "..................";
		next;
		mes "[Louise]";
		mes "-Louise stopped moving, as if time had stopped.";
		mes "And spoke quietly and slowly-";
		next;
		mes "[Louise]";
		mes "Lie ......";
		mes "Right?";
		next;
		mes "[Louise]";
		mes "Because ......";
		mes "Tanya and ......";
		mes "Aren't they living happily ever after?";
		NEXT;
		menu "I wasn't married to Tanya",-;
		EMOTION 9;
		mes "[Louise]";
		mes "............";
		next;
		mes "-Louise is confused ......-";
		next;
		mes "[Louise]";
		mes "Well, that ......";
		mes "What about the letter ......?";
		next;
		mes "-Perhaps that letter was definitely written by Noriek to Tanya. However, Noriek never gave the letter to Tanya and it was scattered on the battlefield. ......";
		mes ""+strcharinfo(0) + "thought so -";
		next;
		mes "[Louise]";
		mes "Such is ......";
		next;
		mes "[Louise]";
		mes "But Tanya......";
		mes "Tanya is alive and well ......";
		next;
		mes "[Louise]";
		mes "Meet Tanya ......";
		mes "I want to talk to her ......";
		if('@novice){
			mes ""+strcharinfo(0) + ", thanks for checking this out ......";
		}
		next;
		if('@novice){
			if(!checkweight(2503,1)){
				mes "-overweight! -";
				close;
			}
			getitem 2503,1;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes "But Tanya......";
		mes "Tanya is alive and well......";
		mes "Meet Tanya......";
		mes "I want to talk to her ......";
		next;
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST06:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", listen, listen!";
		next;
		mes "[Louise]";
		mes "I think I know where Tanya is!";
		next;
		mes "[Louise]";
		mes "Actually, I've been wondering about Tanya since then, and I've been trying to find out what happened to her.";
		next;
		mes "[Louise]";
		mes "I thought, since the letter says that it's a famous family, maybe there's someone who knows her.";
		next;
		mes "[Louise]";
		mes "Then, you know, I found someone who knows someone I do business with!";
		mes "Tanya seems to be named ^FF0000Tanya Glinka^000000.";
		next;
		mes "[Louise]";
		mes "The ^FF0000Glinka family^000000 doesn't get much publicity, but they're pretty well known in the underworld.";
		next;
		menu "The Underworld ......",-;
		mes "[Louise]";
		mes "So I asked the guy to meet Tanya, because I really wanted to meet Tanya, and he told the Glinka family.";
		next;
		mes "[Louise]";
		mes "And then the Glinka family contacted me!";
		next;
		mes "[Louise]";
		mes "He wants me to go to Ayothaya and meet his secretary first.";
		mes "They want me to meet Tanya, they need to do a lot of checks.";
		next;
		mes "[Louise]";
		mes "So I'm going to Ayothaya, right now!";
		mes "I would say ......";
		next;
		menu "You're working.",-;
		mes "[Louise]";
		mes "Yes I am. ......";
		mes "I don't have time to go to Ayothaya, it's not very nice.";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", I want you to go to Ayothaya and see that secretary person on my behalf.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", thanks!";
		next;
		mes "^FF0000 [Mission] ^000000-Go to Ayothaya and meet the secretary of the Glinka family-";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", I want you to go to Ayothaya and meet its secretary on my behalf.";
		next;
		mes "^FF0000[Mission] ^000000-go to Ayothaya and meet the secretary of the Glinka family-";
		close;
	case 3:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", how was it?";
		next;
		mes "-reported to Louise-";
		next;
		mes "[Louise]";
		mes "Okay, I've got it.";
		mes "You'll get back to me another day.";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", thanks for going to Ayothaya on my behalf!";
		next;
		menu "A little, scary ......",-;
		mes "[Louise]";
		mes "Scared?";
		mes "You, you can't talk like that.";
		mes "Business and adventure are all about courage.";
		next;
		mes "^FF0000 [request accomplished]^000000-You accomplished your request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", thanks for going to Ayothaya for me!";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST07:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", long time no see!";
		next;
		mes "[Louise]";
		mes "This time, I need you to deliver this package to someone named Denis in Umbala.";
		mes "The delivery girl got hurt again and can't carry it.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thanks.";
		mes "Please!";
		mes " -" + strcharinfo(0) + "is checked luggage -";
		next;
		mes "^FF0000 [mission] ^000000-go to Umbala, meet Denis and give him the package-";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[Louise]";
		mes "I need you to deliver this package to someone named Denis in Umbala.";
		mes "The delivery girl got hurt again and can't carry it.";
		next;
		mes "^FF0000 [Mission] ^000000-go to Umbala, meet Denis and give him the package-";
		close;
	case 3:
		mes "-reported to Louise-";
		next;
		mes "[Louise]";
		mes "Thank you!";
		mes "Thank you so much for your help!";
		mes ""+strcharinfo(0) + "is still reliable!";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", I know this is off topic, but I still haven't heard from Tanya.";
		next;
		emotion 40;
		mes "[Louise]";
		mes "I spend every day with a sense of excitement, like, \"I wonder if I've heard from her today.";
		if('@novice) {
			mes " Here, thanks for this time.";
		}
		next;
		if('@novice) {
			if(!checkweight(610,6)){
				mes "-overweight! -";
				close;
			}
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes "Thank you!";
		mes "Thank you so much for your help!";
		mes ""+strcharinfo(0) + "is still reliable!";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", I know this is off topic, but I haven't heard from Tanya yet.";
		mes "I can't wait to hear from her.";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + "!";
		mes "We've been waiting for you!";
		next;
		emotion 40;
		mes "[Louise]";
		mes "I've come, I've come!";
		mes "I got a letter from Tanya.";
		mes " Tanya is at the villa in Comodo.";
		next;
		mes "[Louise]";
		mes "It says that she would love for you to come visit her.";
		
		mes "I would love to go and hear all about Tanya.";
		next;
		mes "[Louise]";
		mes "But I, you know, I can never go to Comodo right now because of work. ......";
		mes "[Haaah, it's hard ......";
		next;
		mes "[Louise]";
		mes "......";
		mes "So";
		mes strcharinfo(0) + ",";
		mes "Please, can you go to Comodo for me?";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thank you!";
		mes "Well, then";
		mes strcharinfo(0) + "to";
		mes "I'll pass this on.";
		next;
		mes "-I received the box with Noriek's letter from Louise-";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", I want Tanya to ask me a lot of things, but I want her to be careful.";
		mes "So Noriek is gone, and I am sure that Tanya has another husband.";
		next;
		mes "[Louise]";
		mes "So, you know, as far as Tanya is concerned, maybe she doesn't want us to touch the past too much. ......";
		next;
		mes "[Louise]";
		mes "So, if you're in that mood, don't give me that box, bring it back.";
		next;
		menu "Okay.",-;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", please.";
		next;
		mes "^FF0000[Mission] ^000000-Go to Comodo and meet Tanya-";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		//not researched I forgot ...
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", I want Tanya to ask me a lot of questions, but I want her to be careful.";
		mes "So Noriek is no longer here, and I am sure that Tanya has another husband.";
		next;
		mes "[Louise]";
		mes "So, you know, as far as Tanya is concerned, maybe she doesn't want us to touch the past too much. ......";
		next;
		mes "[Louise]";
		mes "So, if you're in that mood, don't give me that box, bring it back.";
		next;
		mes "^FF0000[Mission] ^000000-Go to Comodo and meet Tanya-";
		close;
	case 3:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", how was it?";
		next;
		mes "-reported to Louise that Noriek was alive, that Noriek and Tanya were married and happy, etc.-";
		next;
		mes "-Louise is listening with tears full in her eyes-";
		next;
		mes "[Louise]";
		mes "Noriek was safe. ......";
		mes "And you were happily married to Tanya. ......";
		next;
		mes "[Louise]";
		mes "Thank God......";
		mes "I'm really happy for you.";
		next;
		mes "[Louise]";
		mes "And the accessories came out of the box I gave them: ......";
		mes "I'm glad you two are happy with it. ......";
		mes "What I did, it made sense. ......";
		next;
	case 99:
		mes "[Louise]";
		mes "...... Gusun me, I'll definitely go see Noriek and Tanya when I get my work settled ......";
		next;
		mes "^FF0000 [request fulfilled] ^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST09:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", I've been waiting for you.";
		next;
		mes "[Louise]";
		mes "Thanks so much for the letter.";
		mes "So, this time I'm asking you for a favor: ......";
		next;
		mes "[Louise]";
		mes "Actually, I was very touched by Noriek and Tanya's letter.";
		mes "It's like the feelings I had decades ago are reaching me now!";
		next;
		mes "[Louise]";
		mes "So, you know, I want to write a letter and bury it somewhere.";
		mes "I hope you get it in decades!";
		next;
		mes "[Louise]";
		mes "......";
		mes "But you know, I don't have anyone to write my thoughts to...";
		mes "I'm a workaholic, and there's no one I like. ......";
		next;
		mes "[Louise]";
		mes "So, there you are!";
		mes "I want you to write to me too, you know.";
		mes "Oops, I'm not saying I like you.";
		next;
		mes "[Louise]";
		mes "I want you to write about Noriek and Tanya's miracle in the sense that we experienced it together and shared the emotion.";
		next;
		mes "[Louise]";
		mes "I'll write to you, you write to me, whatever, let's write.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thank you!";
		mes "Well, in Alberta, I'd like you to check out the Burial Site as well.";
		next;
		menu "Okay",-;
		mes "[Louise]";
		mes "Thanks!";
		mes "Well, please do.";
		mes "Roughly that area is good for filling.";
		next;
		mes "^FF0000 [Mission] ^000000-Find a suitable place to fill the box in Alberta-";
		close2;
		set AC_QUEST_ST_1,2;
		viewpoint 1,107,59,11,0x0000FF;
		// blue for some reason
		end;
	case 2:
		mes "[Louise]";
		mes "In Alberta, I need you to look up the letter in Burial Site too.";
		mes "Roughly that area would be a good place to fill.";
		next;
		mes "^FF0000 [Mission] ^000000-Find a suitable place in Alberta to bury the box-";
		close2;
		viewpoint 1,107,59,11,0x0000FF;
		//why blue
		end;
	case 3:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", how was it?";
		next;
		mes "-I told you where I found it-";
		next;
		mes "[Louise]";
		mes "Well, let's bury it there.";
		mes "On my part, I wrote a letter to you.";
		mes "You write yours now, too.";
		next;
		mes "-I wrote a lot of things at random.";
		mes "Finally, I wrote honestly about Louise, exactly what I was thinking -";
		next;
		mes "-Okay, now it's done.";
		mes "I gave the letter to Louise-";
		next;
		mes "[Louise]";
		mes "Oh, you wrote it!";
		mes "Thank you.";
		mes "I'll put the letter in a box and bury it later.";
		next;
		mes "[Louise]";
		mes "Fifty years is indeed a long time, hmmm, I guess.";
		mes "Ten years!";
		mes "Let's dig it up in 10 years.";
		next;
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", let's dig it up in 10 years.";
		mes "I promise.";
		if('@novice){
			mes "Here's a feeling from me.";
			mes "Thank you for everything.";
		}
		next;
		if('@novice){
			switch(Job){
			case Job_Swordman:
				set '@item,2105;
				set '@ammount,1;
				break;
			// 1 shield[0].
				case Job_Archer:
			case Job_Magician:
			case Job_TaeKwon:
				set '@item,568;
				set '@ammount,50;
				break;
			// 50 lemons
			case Job_Acolyte:
			case Job_Thief:
			case Job_Merchant:
				set '@item,2103;
				set '@ammount,1;
				break;
			// 1 buckler[0].
			case Job_Gunslinger:
				set '@item,12151;
				set '@ammount,10;
				break;
			// 10 silver bullet cases
			case Job_Ninja:
				set '@item,2119;
				set '@ammount,1;
				break;
			// hand armor[0] 1 piece
			case Job_SuperNovice:
			default:
				set '@item,2113;
				set '@ammount,1;
				break;
				// Novice Shield[1] 1
			}
			if(!checkweight('@item,'@ammount)){
				mes "-overweight-";
				close;
			}
			getitem '@item,'@ammount;
		}
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", let's dig it up in 10 years.";
		mes "I promise.";
		next;
		mes "^FF0000 [request fulfilled] ^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_CLEAR:
	mes "[Louise]";
	mes "Yessss!";
	mes "Work hard, work fast, and let's go see Noriek and Tanya!";
	close;
L_OTHER:
	switch(AC_QUEST_LV_1){
	case 0:
		mes "[Louise]";
		mes "Hello!";
		mes "I am Louise.";
		mes "I recently moved to Alberta.";
		mes "Nice to meet you!";
		close;
	case 1:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", thanks for investigating the letter!";
		close;
	case 2:
		mes "[Louise]";
		mes "I'm so grateful to you for all your help, especially with the letter.";
		close;
	case 3:
		mes "[Louise]";
		mes "Mr. Archibald says you were with him in the Mercenaries. ......";
		close;
	case 4:
		mes "[Louise]";
		mes "You are contacted by someone named Ms. Grayson.";
		mes "Okay.";
		close;
	case 5:
		mes "[Louise]";
		mes "Meet Tanya at ......";
		mes "I'd like to talk to her ......";
		close;
	//not yet researched
	CASE 6:
		mes "[Louise]";
		mes "I still haven't heard from Tanya.";
		mes "I can't wait to hear from her.";
		close;
	//not yet investigated
	CASE 7:
		mes "[Louise]";
		mes ""+strcharinfo(0) + ", thanks for investigating the letter!";
		close;
	case 8:
	case 9:
		mes "[Louise]";
		mes "Yessss!";
		mes "Work hard and fast, we're going to see Noriek and Tanya!";
		close;
	}
}
alberta.gat,234,98,3	script	Artisan	847,{
	if(AC_QUEST_LV_1!=0) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		goto L_MISSION;
	case 3:
		goto L_CLEAR;
	case 99:
		goto L_REPORT;
	default:
		goto L_OTHER;
	}
L_MISSION:
	mes "[Artisan]";
	mes "......";
	next;
	menu "Excuse me",-;
	mes "[Artisan]";
	mes "......";
	mes " Umm, what's ......";
	next;
	menu "Are you the one familiar with paper and pen?" ,-;
	mes "[Artisan]";
	mes "......";
	mes "[Artisan]";
	next;
	mes "[Artisan]";
	mes "So, ......";
	mes " This way ......";
	mes " 80 years......じゃ......";
	next;
	mes "-I gave him the envelope of the letter and explained the situation-";
	next;
	mes "-Artisan took the envelope in his hand and remained motionless for a moment -";
	next;
	menu "Um, ......",-;
	mes "[Artisan]";
	mes "..............................";
	next;
	menu "Um, sorry, ......",-;
	mes "[Artisan]";
	mes "...... has already been cured and ...... has been finished.";
	mes "Can't wait to receive ......";
	next;
	mes "-!";
	mes "Received letter from Artisan.";
	mes "The envelope of the letter says ^FF0000Noriek^000000 to the sender ^FF0000Tanya^000000 to the recipient!";
	mes "When did you ......-";
	next;
	mes "[Artisan]";
	mes "..............................";
	next;
	set AC_QUEST_ST_1,3;
	/////////
	mes "^FF0000 [Mission] ^000000-Report to Louise-";
	close;
L_CLEAR:
	mes "[Artisan]";
	mes "..............................";
	next;
	mes "-He was a true master of the path-";
	next;
	mes "^FF0000 [Mission] ^000000-Report to Louise-";
	close;
L_REPORT:
	mes "[Artisan]";
	mes "..............................";
	close;
L_OTHER:
	mes "[Artisan]";
	mes "..............................";
	next;
	mes "-Old Man stares into the distance.";
	mes "Let's leave it gently-";
	close;
}
payon.gat,216,120,4	script	Royce	928,{
	if(AC_QUEST_LV_1!=1) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "[Royce]";
		mes "You wanted to see me?";
		next;
		mes "-I gave you the package that Louise entrusted to me-";
		next;
	case 3:
		emotion 0;
		mes "[Royce]";
		mes "Oh, it finally arrived!";
		mes "Thanks!";
		mes "Please give my regards to Louise!";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	}
L_OTHER:
	mes "[Royce]";
	mes "Yo!";
	mes "My name is Royce.";
	mes "It's another beautiful day and it's great!";
	close;
}
amatsu.gat,212,141,4	script	Archibald	120,{
	if(AC_QUEST_LV_1==2 && AC_QUEST_ST_1==3) goto L_REP;
	if(AC_QUEST_LV_1>=8) goto L_CLEAR;
	mes "[Archibald]";
	mes "My name is Archibald.";
	mes "I'm angry at the lack of courtesy among young people these days!";
	mes "Young people these days don't listen to old people at all!";
	if(AC_QUEST_LV_1!=2 || AC_QUEST_ST_1!=2) close;
	next;
	menu "Pass the package",-;
	mes "-I gave Archibald the package Louise entrusted me with-";
	next;
	mes "[Archibald]";
	mes "Oh, you got it as soon as possible!";
	mes "Tremendous speed!";
	mes "Louise store ......";
	mes "I hope to be familiar with you in the future.";
	next;
	menu "See you then",-;
	mes "[Archibald]";
	mes "Well, wait.";
	mes "Sincerely.";
	mes "Take your time.";
	mes "You must listen to me.";
	mes "A story from my youth.";
	mes "When I was young. ......";
	next;
	emotion 54,"";
	mes "^FF0000-30 minutes elapsed-^000000";
	next;
	mes "[Archibald]";
	mes "I was in the mercenaries over 50 years ago!";
	mes "Back then, I was good at heeling.";
	mes "................................................";
	mes "Everyone respected me. ......";
	next;
	emotion 54,"";
	mes "^FF0000-1 hour passed-^000000-The story is long and hard ......-";
	next;
	mes "[Archibald]";
	mes "So I said, 'Hey!";
	mes "And guess what he said?";
	mes "................................................";
	mes "Wahahahahaha!!! ............";
	next;
	emotion 54,"";
	mes "^FF0000-2 hours have passed-^000000-The story is long and really hard ......-";
	next;
	mes "[Archibald]";
	mes "So, I've been getting girls in my own way.";
	mes "But as a hard man, I'm ......";
	mes "................................................";
	next;
	mes "^FF0000-3 hours have passed-^000000-Then! ......-";
	next;
	mes "[Archibald]";
	mes "I have a ^FF0000Noriek^000000, my best friend in the Mercenaries.";
	mes "I miss him.";
	mes "I'd love to have a drink with ^FF0000Noriek^000000 again.";
	next;
	mes "-^FF0000Noriek^000000?";
	mes "I've heard that somewhere -";
	next;
	mes "^FF0000-5 hours have passed-^000000";
	next;
L_REP:
	mes "[Archibald]";
	mes "It's time to call it a night.";
	mes "You are a wonderful young man.";
	mes "There are young people like you these days.";
	next;
	menu "......",-;
	mes "^FF0000 [Mission] ^000000-Report to Louise-";
	close2;
	set AC_QUEST_ST_1,3;
	end;
L_CLEAR:
	mes "-Tell that Noriek was doing well at Comodo-";
	next;
	mes "[Archibald]";
	mes "Oh, really!";
	mes "Hey Noriek's guy, how are you doing at Comodo!";
	mes "Then maybe next time I'll go to Comodo with a bottle of booze.";
	mes "I'm looking forward to it!";
	close;
}
gonryun.gat,140,65,4	script	Grayson	777,{
	if(AC_QUEST_LV_1==3 && AC_QUEST_ST_1==3) goto L_REP;
	mes "[Grayson]";
	mes "I used to live around here.";
	mes "There used to be a strong band of mercenaries.";
	mes "They protected the town from monsters.";
	if(AC_QUEST_LV_1!=3 || AC_QUEST_ST_1!=2) close;
	next;
	menu "Can you elaborate?",-;
	mes "[Grayson]";
	mes "Are you interested in a mercenary group?";
	mes "What do you want to know?";
	NEXT;
	menu "Was there anyone named Noriek?" ,-;
	mes "[Grayson]";
	mes "Noriek......";
	mes "Sorry, I've never heard that name before.";
	mes "I actually know some of the mercenaries in that group, but I don't know a guy named Noriek.";
	next;
	mes "[Grayson]";
	mes "As you can imagine, I don't know them all.";
	next;
	menu "I see. ......",-;
	mes "[Grayson]";
	mes "Don't look so sad.";
	mes "............";
	mes "From the look on your face, there must be something going on.";
	next;
	mes "[Grayson]";
	mes "Okay.";
	mes "Can you give me a minute?";
	mes " As a matter of fact, I know a guy who was actually in that mercenary group.";
	mes "You can ask him.";
	next;
	mes "[Grayson]";
	mes "Only, he's about my age, and he's been wandering around this continent.";
	mes "It's going to take some time to figure out where he is.";
	next;
	menu "Thank you!" ,-;
	mes "[Grayson]";
	mes "I'll contact you when I know where he is.";
	mes "Can you tell me where I can contact you?";
	next;
	mes "-I gave you Louise's address-";
	next;
L_REP:
	mes "[Grayson]";
	mes "I'll get back to you as soon as I know.";
	next;
	mes "^FF0000 [Mission] ^000000-Report to Louise-";
	close2;
	set AC_QUEST_ST_1,3;
	end;
}
louyang.gat,229,109,4	script	Old Man	866,{
	if(AC_QUEST_LV_1!=4 || AC_QUEST_ST_1!=2) goto L_OTHER;
	emotion 52;
	mes "[Old Man]";
	mes "Wow, this is a great view.";
	mes " -Old Man is looking at Woman next to him-";
	next;
	mes "[Old Man]";
	mes "There are still such beautiful women in this world, so I can't stop traveling. ......";
	mes "Hahaha, I can't stop looking at them ......";
	mes "mumble mumble ......";
	next;
	menu "Are you Donatello?" ,-;
	mes "[Donatello]";
	mes "Whoa, what the hell!";
	mes "......";
	mes "Don't talk to me on short notice.";
	mes "You scared me.";
	next;
	menu "What were you doing?" ,-;
	mes "[Donatello]";
	mes "Mm, I've been watching Woman beside you.";
	mes "She is very beautiful.";
	mes "I couldn't help but look.";
	mes "There are few such beauties in the world.";
	next;
	emotion 0, "Woman#AC_QUE01";
	mes "[Woman]";
	mes "!";
	next;
	mes "[Donatello]";
	mes "There are not many beauties like this in the world.";
	mes "I travel all over the continent to meet such beauties.";
	mes "By the way, what can I do for you?";
	next;
	EMOTION 9;
	mes "-Donatello told me about the mercenaries.";
	mes "And I asked him if there was Noriek in that mercenary group.";
	mes "Donatello's face became a little stern-";
	next;
	mes "[Donatello]";
	mes "The mercenary group, that was a long time ago.";
	mes "It's not a story I want to tell now...";
	mes "......";
	mes "You want to know about Noriek?";
	next;
	menu "Yes." ,-;
	mes "[Donatello]";
	mes "I see. ......";
	mes "Good.";
	mes "I remember Noriek.";
	mes "He was a kind man with a strong sense of justice.";
	next;
	menu "Do you know where he is now?" ,-;
	mes "[Donatello]";
	mes "............";
	next;
	emotion 0,"";
	mes "[Donatello]";
	mes "Noriek was killed in battle with a monster 50 years ago. ......";
	mes "The rest of ghost.";
	next;
	menu "What?" ,-;
	mes "[Donatello]";
	mes "I was in that battle, too.";
	mes "............";
	mes "I saw Noriek get killed by the monster with my own eyes. ......";
	mes "It was only for a moment.";
	next;
	menu "...... Do you know my girlfriend Tanya?" ,-;
	mes "[Donatello]";
	mes "Tanya?";
	mes "I've never heard of her.";
	mes "Noriek didn't talk about it much, you know.";
	mes "But Noriek wasn't married, you know.";
	next;
	mes "-what a mess ......";
	mes "It's hard to report to Louise.";
	mes "I'm sorry I made Donatello talk about his painful past -";
	/* Not "apologized". As per the main mackerel*/ next;
	mes "^FF0000 [Mission] ^000000-Report to Louise-";
	close2;
	set AC_QUEST_ST_1,3;
	end;
L_OTHER:
	if(AC_QUEST_LV_1<4){
		mes "[Old Man]";
		mes "Woman beside me, she is beautiful.";
		mes "I can't resist ......";
		close;
	}
	mes "[Donatello]";
	mes "There are so many sad stories to tell about those days. ......";
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==3){
		next;
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close;
	}
	if(AC_QUEST_LV_1<8) close;
	next;
	mes "-Told Donatello that Noriek was alive-";
	next;
	mes "[Donatello]";
	mes "What the hell!";
	mes "Noriek is alive!";
	mes "Really?";
	NEXT;
	menu "Yes." ,-;
	mes "[Donatello]";
	mes "So ......";
	mes "Now I'm going to go to Comodo and have my first drink with him in 50 years!";
	close;
}
louyang.gat,233,109,4	script	Woman#AC_QUE01	66,{
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==3){
		mes "[Woman]";
		mes "It's rare for someone to say so much, so clearly: ......";
		mes "I'm so disappointed.";
		mes "Well, I guess I'm glad you called me the most beautiful woman in the world.";
		close;
	}
	mes "[Woman]";
	mes "Since a while ago, the old man beside me seems to be gawking at me ......";
	mes "It's just my imagination.";
	close;
}
ayothaya.gat,212,176,4	script	Dewey	109,{
	if(AC_QUEST_LV_1!=5) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "-At first glance, he looks like a gentleman, but he is extremely awesome.";
		mes "I sense that he has been through quite a lot -";
		next;
		menu "I'm here on behalf of Louise." ,-;
		mes "-I told Dewey what I've been up to.";
		mes "While I was talking, Dewey's eyes glinted sharply from time to time -";
		next;
		mes "[Dewey]";
		mes "......";
		mes "......";
		mes "I see.";
		next;
		mes "[Dewey]";
		mes "So one buried letter led you to Master Tanya.";
		next;
		mes "[Dewey]";
		mes "......";
		mes "I understand.";
		mes "Then I will let Tanya know from my end.";
		next;
		mes "[Dewey]";
		mes "I will contact Ms. Louise of Alberta from here on another day.";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		mes "[Dewey]";
		mes "I will inform Mr. Tanya.";
		mes "We will contact Louise in Alberta at a later date.";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close;
	}
L_OTHER:
	mes "[Dewey]";
	mes "Hello.";
	mes "I am meeting someone here.";
	close;
}
umbala.gat,96,164,4	script	Denis	89,{
	if(AC_QUEST_LV_1!=6) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "[Denis]";
		mes "Hello.";
		next;
		mes "-I gave you the package that Louise entrusted to me-";
		next;
		emotion 0;
		// don't you want it?
		mes "[Denis]";
		mes "!";
		mes "Thanks!!! I'll check out what's inside as soon as I can!";
		mes " - rustle rustle rustle! -";
		next;
		emotion 21;
		mes "[Denis]";
		mes "Fooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo!";
		mes "This is it, this is it!";
		mes " I finally got it!";
		next;
		mes "[Denis]";
		mes "Thank you so much!";
		mes "That's what I'm talking about, Louise Chamber of Commerce!";
		mes "I will continue to use Louise Trading Company!";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		emotion 21;
		mes "[Denis]";
		mes "I love it!";
		mes "Really good!";
		mes " Especially from this angle: ......";
		mes "Hahaha, I can't get enough of it!";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close;
	}
L_OTHER:
	mes "[Denis]";
	mes "Hello.";
	close;
}
comodo.gat,113,219,4	script	Old Woman#ac_comodo	918,{
	if(AC_QUEST_LV_1!=7) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "An elderly couple is talking happily.";
		next;
		menu "Are you Tanya?" ,-;
		mes "[Tanya]";
		mes "Oh my, ......";
		mes "Hello.";
		mes "Can I help you?";
		next;
		menu "I'm here on behalf of Louise." ,-;
		mes "[Tanya]";
		mes "You are the ";
		mes strcharinfo(0) + "Hey!";
		mes "I've been waiting for you.";
		mes "But Louise can't come, can she?";
		next;
		mes "[Tanya]";
		mes "Indeed, the Louise Chamber of Commerce is growing very fast right now, isn't it?";
		mes "It's a residual GOST, but I can't help it.";
		next;
		emotion 0,"";
		mes "[Noriek]";
		mes "Hello.";
		mes "I am Noriek.";
		mes "Tanya told me about you.";
		mes "I heard you found the letter.";
		NEXT;
		menu "! Noriek!" ,-;
		mes "[Noriek]";
		mes "Hey, what's that?";
		mes "I never thought you would be so surprised to see my face.";
		mes "I am surprised.";
		next;
		mes "-I told him how I had been researching the two of them ever since I found the letter and how I thought Noriek had been killed in the war...";
		next;
		mes "[Noriek]";
		mes "You seem to want to know a lot about why I'm here when I'm supposed to be dead, why that letter was buried, why I and Tanya are together, and so on.";
		next;
		mes "[Noriek]";
		mes "Well, I, the one who buried the letter, can start from the beginning.";
		next;
		mes "-Noriek cleared his throat, paused for a moment, and began to speak-";
		next;
		mes "[Noriek]";
		mes "At the time, Tanya and I were engaged to be married.";
		 ;
		next;
		mes "[Noriek]";
		mes "Tanya, on the other hand, was the daughter of a prominent family, and naturally, all of Tanya's relatives were against our marriage.";
		next;
		mes "[Noriek]";
		mes "But I, however, am a mercenary who does not know what tomorrow holds for me, even though I have a different status."; //"ni" is missing, but it's the same as in the mackerel.
		mes "Although I felt a bit of a drawback,";
		mes "I believed that I was the only one who could make Tanya happy.";
		next;
		mes "[Noriek]";
		mes "So I wrote that letter to ask Tanya to marry me.";
		next;
		mes "[Noriek]";
		mes "But the day I was going to give that letter to Tanya, the monsters suddenly attacked the city, and there was a battle with the monsters.";
		next;
		mes "[Noriek]";
		mes "......";
		mes "So one of my companions was killed by the monster and lost his life.";
		next;
		mes "[Noriek]";
		mes "That fellow had a fiancée.";
		mes "The fiancée wept before the corpse of her companion.";
		mes "What am I to do now that I am left?";
		next;
		mes "[Noriek]";
		mes "I have been unable to stay.";
		mes "Because that's how I see me and Tanya in the near future.";
		next;
		mes "[Noriek]";
		mes "I decided to stop being a mercenary for Tanya's sake.";
		mes "But ......";
		mes "Looking back, the people of the city we protected were there.";
		next;
		mes "[Noriek]";
		mes "They all thanked us.";
		mes "Thanks to us.";
		mes "Some children would look at me and say with a twinkle in their eyes, 'When I grow up, I want to be a mercenary like me.";
		next;
		mes "[Noriek]";
		mes "I buried the letter that day in the spot where I met Tanya.";
		next;
		mes "[Noriek]";
		mes "I realized that I couldn't make Tanya happy.";
		next;
		mes "[Tanya]";
		mes "......";
		next;
		mes "[Tanya]";
		mes "......";
		mes "I wish you had consulted me when making that decision. ......";
		mes "Always on your own ......";
		next;
		mes "[Noriek]";
		mes "......";
		next;
		mes "[Noriek]";
		mes "......";
		mes "Years later, I spent my days fighting monsters as a mercenary.";
		next;
		mes "[Noriek]";
		mes "Then one day, I met a group of powerful monsters.";
		next;
		mes "[Noriek]";
		mes "I was mortally wounded in the battle.";
		next;
		mes "[Noriek]";
		mes "I am alone, separated from my fellow troops.";
		mes "I struggled to stay conscious as I fled from the enemy.";
		next;
		mes "[Noriek]";
		mes "But, I was surrounded by monsters.";
		mes "I didn't even notice.";
		mes "I have no more strength to fight or move ......";
		mes "I fell down on the spot and prepared to die.";
		next;
		mes "[Noriek]";
		mes "The monster came right in front of me and tried to swing its claws at me.";
		mes "There, I lost consciousness.";
		next;
		mes "[Noriek]";
		mes "I don't know how long it was, but I woke up.";
		next;
		mes "[Noriek]";
		mes "When I woke up, I couldn't believe it, Tanya was right in front of me.";
		mes "I thought I was dreaming, but it was definitely Tanya taking care of me.";
		next;
		mes "[Noriek]";
		mes "I heard the story, I was surrounded by monsters and Tanya was rescuing me.";
		next;
		mes "[Noriek]";
		mes "Tanya told me the story.";
		mes "What happened after I disappeared that day.";
		mes "Tanya told me that after I disappeared that day, she ran away from home and kept looking for me.";
		next;
		mes "[Noriek]";
		mes "I heard that the Glinka family was originally a famous family in the dark world.";
		mes "I heard that they have been training for a long time.";
		mes "Since they set out to find me, they've become even more skilled.";
		next;
		mes "[Noriek]";
		mes "He became a ^FF0000Assassin Cross^000000 profession.";
		
		next;
		mes "[Noriek]";
		mes "And so we meet again, and so we are.";
		mes "Tanya's enthusiasm has broken the hearts of Tanya's relatives.";
		next;
		mes "[Tanya]";
		mes "Yes, they did.";
		mes "I was very happy to be with Noriek.";
		next;
		menu "Let's pass the box.",-;
		mes "[Tanya]";
		mes "Here it is!";
		mes "After more than 50 years, you finally got it to me.";
		next;
		mes "[Noriek]";
		mes "Oh, this box is ......";
		mes "Yes, I remember.";
		mes "For Tanya...";
		mes "I think I had to double-bottom this box!";
		NEXT;
		mes "-Noriek took the box and began to fiddle with it.";
		mes "The box made a clicking sound and the bottom of the box opened and a necklace came out from inside -";
		next;
		mes "[Noriek]";
		mes "Yes, I've got a trick here to surprise Tanya with this, to pre-Zenit her. ......";
		next;
		mes "[Noriek]";
		mes "Yeah, I'm over 50 years late in giving it to you, but ......";
		mes " -Noriek took the necklace and put it on Tanya-";
		next;
		mes "[Tanya]";
		mes "It's too late to give it to you. ......";
		mes "......";
		mes "But ......";
		mes "I'm so, so happy for you. ......";
		mes "-Tears well up in Tanya's eyes-";
		next;
		mes "-Tanya is wearing a lot of expensive looking accessories, but the necklace that Noriek pre-Zent seemed to shine the brightest-";
		next;
		mes "-Just as this necklace hasn't lost its shine in 50 years, Noriek and Tanya's love has probably been shining for 50 years.";
		mes ""+strcharinfo(0) + "thought so -";
		next;
		mes "[Tanya]";
		mes "Noriek, I'm really happy for you.";
		mes "I am so happy to be with you.";
		next;
		mes "[Noriek]";
		mes "Me too.";
		mes " ";
		mes strcharinfo(0) + ",";
		mes "Thank you so much.";
		mes "For delivering this box.";
		mes "I hope Louise thanks you as well.";
		next;
		mes "[Tanya]";
		mes "Yes, it's true.";
		mes "Tell Louise to come early.";
		mes "I wish I could tell her in person how much I appreciate this.";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		mes "[Tanya]";
		mes "Please tell Louise to come as soon as she settles down to work.";
		next;
		mes "[Tanya]";
		mes "Also tell her that if she doesn't come soon, I will arrange for her to lose her job.";
		next;
		mes "[Noriek]";
		mes "Ta, Tanya, you joke too much.";
		next;
		mes "^FF0000[Mission] ^000000-Report to Louise-";
		close;
	}
L_OTHER:
	mes "An elderly couple is talking happily.";
	mes "Let's not interrupt them.";
	close;
}
comodo.gat,116,219,4	duplicate(Old Woman#ac_comodo)	Old Man#ac_comodo	55
//In the early days, it was not an automatic conversation, but a click method
alberta.gat,107,59,0	script	Burial Site#AC_QUE01	139,2,2,{
	if(AC_QUEST_LV_1!=8 || (AC_QUEST_ST_1!=2 && AC_QUEST_ST_1!=3)) end;
	mes "-I think this is the best place to fill-";
	next;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "-Let's report to Louise-";
		next;
	case 3:
		mes "^FF0000 [Mission] ^000000-Report to Louise-";
		close2;
		set AC_QUEST_ST_1,3;
		viewpoint 1,39,46,11,0x0000FF;
		end;
	}
}
