//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Lune's Request
//
// by Pneuma
// Help with experiments / dungeon rescue ---------------------------
//
// AC_QUEST_LV_3
// 0 Experimental help 1
// 1 Dungeon Rescue 1
// 2 Experimental help 2
// 3 Dungeon Rescue 2
// 4 Experimental help 3
// 5 Dungeon Rescue 3
// 6 Experimental help 4
// 7 Dungeon Rescue 4
// 8 Experimental help 5

hu_in01.gat,309,27,4	script	Dr. Tracy	923,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_3)goto L_OTHER;
	switch(AC_QUEST_LV_3){
	case 0:
		goto L_QUEST01;
	case 2:
		goto L_QUEST03;
	case 4:
		goto L_QUEST05;
	case 6:
		goto L_QUEST07;
	case 8:
		goto L_QUEST09;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST01:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Dr. Tracy]";
		mes "It's going to work this time.";
		mes "Mix this ......";
		next;
		menu "Hello",-;
		mes "[Dr. Tracy]";
		mes "I'm in a research rush, so you'll have to wait until later.";
		next;
		menu "I have received a request." ,-;
		emotion 0;
		mes "[Dr. Tracy]";
		mes "What the hell!";
		mes "You mean you'll take care of it!";
		mes "Well, what an impressive young man!";
		next;
		mes "[Dr. Tracy]";
		mes "I need you to gather materials for my research!";
		mes "For more information, ask my very pretty assistant Laila!";
		next;
		menu "Okay",-;
		mes "[Dr. Tracy]";
		mes "You!";
		mes "Wait a minute!";
		next;
		if(Sex){
			menu "What's wrong?" ,-;
			EMOTION 36;
			mes "[Dr. Tracy]";
			mes "I don't care how beautiful your assistant Laila is, if you do anything indecent to her, I'm not going to let you get away with it!";
			mes "You understand?";
			next;
		}
		else {
			menu "What's wrong?" ,-;
			mes "[Dr. Tracy]";
			mes "You're a pretty girl, but you're no match for Laila.";
			next;
		}
		menu "ha, ha ......",-;
		mes "[Dr. Tracy]";
		mes "Well, good luck with that!";
		next;
		mes "^FF0000 [Mission] ^000000^0000FF Ask assistant Laila^000000 the details of your request.";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Dr. Tracy]";
		mes "I'm in a hurry, okay?";
		mes "Quickly get the details from my assistant Laila!";
		next;
		mes "^FF0000 [Mission] ^000000^0000FF Ask assistant Laila^000000 the details of your request.";
		close;
	case 3:
		mes "[Dr. Tracy]";
		mes "Young man!";
		mes "Best regards!";
		close;
	case 4:
		EMOTION 0;
		mes "[Dr. Tracy]";
		mes "Oh!";
		mes "That's exactly what ^FF0000Pom Pom Grass^000000!!!! Come on, come this way quickly.";
		next;
		menu "Pass the Pom Pom Grass",-;
		mes "[Dr. Tracy]";
		mes "Quickly, experiment!";
		mes "Hope this works ......";
		next;
		misceffect 32, "#AC_BOM";
		mes "-The moment the doctor put ^0000FFPom Pom Grass^000000 into the liquid, the liquid started to bubble bob bob bob -";
		next;
		misceffect 106, "#AC_BOM";
		percentheal -90,0;
		mes "[Dr. Tracy]";
		mes "I can't!";
		mes "It's going to explode!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		next;
		mes "[Dr. Tracy]";
		mes "......";
		mes "Are you alive ......?";
		next;
		menu "Hey, something ......",-;
		mes "[Dr. Tracy]";
		mes "Whew ......";
		mes "I did it. ......";
		mes "I thought the ^FF0000Pom Pom Grass^000000 component would work.";
		mes "Failed.";
		next;
		mes "[Dr. Tracy]";
		mes "That's the end of the request for now. ......";
		if('@novice){
			mes "Oh, by the way, you're an adventurer, so let's do this.";
			mes "I used to use one of these in the past, it might be useful.";
			next;
			// 2220 hats 1
			if(!checkweight(2220,1)){
				mes "Overweight!";
				close;
			}
			getitem 2220,1;
		}
		else next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Dr. Tracy]";
		mes "That's the end of the request for now. ......";
		next;
		mes "^FF0000 [request accomplished]^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	}
L_QUEST03:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Dr. Tracy]";
		mes "This is what happens when you do this: ......";
		mes "Oh no, it's difficult ......";
		next;
		menu "Hello",-;
		mes "[Dr. Tracy]";
		mes "Oh!";
		mes "You helped me the other day!";
		mes "......";
		mes "What was that?";
		next;
		menu "Identify yourself",-;
		emotion 0;
		mes "[Dr. Tracy]";
		mes "!";
		mes "Yes, yes, yes!";
		mes "I take it you will be assisting me with my research again?";
		next;
		menu "Yes",-;
		mes "[Dr. Tracy]";
		mes "Excellent!";
		mes "Unusual for a young man these days!";
		mes "As for the details of your request, as usual, ^FF0000Laila^000000, you'll hear from me!";
		next;
		menu "Okay",-;
		mes "[Dr. Tracy]";
		mes "Then, please take care of it!";
		next;
		mes "^FF0000 [Mission] ^000000 Ask assistant Laila for details of the request.";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Dr. Tracy]";
		mes ""+strcharinfo(0)+"!";
		mes "I'm sorry, but I'm in a hurry.";
		mes "Ask Laila what's going on.";
		next;
		mes "^FF0000 [Mission] Ask my assistant Laila^000000 the details of your request.";
		close;
	case 3:
		mes "-She seems to be concentrating on her research and doesn't seem to notice us-";
		close;
	case 4:
		mes "[Dr. Tracy]";
		mes ""+strcharinfo(0);
		mes "I guess not.";
		mes "Laila is really beautiful.";
		mes "You think so too, don't you?";
		next;
		menu "Yes, it is.",-;
		emotion 33;
		mes "[Dr. Tracy]";
		mes "Isn't that right, isn't that right?";
		mes "I'm so proud of you, you're my assistant!";
		mes "And by the way, I thought I asked you to do something for me: ......";
		mes "What was it?";
		next;
		menu "Laila rushes at ......",-;
		mes "[Dr. Tracy]";
		mes "Oh!";
		mes "That's right!!! Put ^FF0000Laila rushes^000000 in this liquid!";
		mes "Now you may put it in!";
		next;
		menu "What? I am? ......",-;
		misceffect 99, "#AC_BOM";
		sc_start3 SC_Blind,1,0,0,0,15000,0x8;
		mes "-Laila rushes were thrown into the liquid and a tremendous light was emitted from the liquid-";
		next;
		mes "[Dr. Tracy]";
		mes "......";
		mes "............";
		mes "Well, this happens!";
		mes "I still wonder if Pom Pom Grass was better ......";
		next;
		mes "[Dr. Tracy]";
		mes "It's no use, we'll have to look for other materials again.";
		mes "I'll ask again if you need anything else.";
		if('@novice){
			mes "Also, take this.";
			next;
			// 1247 Kindling dagger, 1 piece
			if(!checkweight(1247,1)){
				mes "Overweight!";
				close;
			}
			getitem 1247,1;
		}
		else next;
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Dr. Tracy]";
		mes "It's no use, let's look for other material again.";
		mes "I'll ask again if you need anything else.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST05:
	switch(AC_QUEST_ST_3) {
	case 1:
		EMOTION 7;
		mes "[Dr. Tracy]";
		mes "What should we do about the pre-Zent to Laila?";
		mes "I really don't understand the female mind. ......";
		next;
		menu "What happened?" ,-;
		EMOTION 0;
		mes "[Dr. Tracy]";
		mes "Oh!";
		mes ""+strcharinfo(0);
		mes "Isn't it!";
		mes "You don't have to worry about it.";
		mes "Besides, you're going to help me with my research again, aren't you?";
		next;
		menu "Yes",-;
		mes "[Dr. Tracy]";
		mes "One thing I learned from the last experiment!";
		mes "Grass is just grass.";
		mes "The time is now for mushrooms.";
		mes "Mix mushrooms with grass and your research will succeed, I think!";
		next;
		menu "It's like it doesn't matter what time period you're in. ......",-;
		mes "[Dr. Tracy]";
		mes "It's the times, the times.";
		mes "This is important, right?";
		mes "You can't afford to be out of fashion!";
		next;
		menu "ha, ha",-;
		mes "[Dr. Tracy]";
		mes "Then ask Laila for the details!";
		next;
		mes "^FF0000 [Mission] ^000000^0000FF Ask assistant Laila^000000 the details of your request.";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Dr. Tracy]";
		mes ""+strcharinfo(0)+"!";
		mes "I'm sorry, but I'm in a hurry.";
		mes "Ask Laila what's going on.";
		next;
		mes "^FF0000[Mission] ^000000^0000FF Ask assistant Laila^000000 the details of your request.";
		close;
	case 3:
		mes "-She seems to be concentrating on her research and doesn't seem to notice us-";
		close;
	case 4:
		emotion 7;
		mes "[Dr. Tracy]";
		mes "Oh!";
		mes "I've been waiting for you!";
		mes "If it's mushrooms, it should work!";
		next;
		mes "[Dr. Tracy]";
		mes "I'm almost done, I can finish the potion!";
		mes "And so will the eagle ......";
		mes "mwahhhh";
		next;
		menu "What kind of medicine are you making?" ,-;
		mes "[Dr. Tracy]";
		mes "That's what you call a trade secret!";
		mes "I can't tell you!";
		mes "But first, let's try putting the mushrooms in this liquid!";
		next;
		misceffect 109, "#AC_BOM";
		mes "-Black Funny Mushroom thrown into liquid.";
		mes " But nothing happened -";
		next;
		mes "[Dr. Tracy]";
		mes "......";
		mes "............";
		mes "Hmm, looks like a failure. ......";
		mes "However, it is quite possible that the ingredients have harmonized into a drug with a different effect.";
		next;
		mes "[Dr. Tracy]";
		mes "And so it is!";
		mes "You, try it for yourself!";
		next;
		menu "No thanks. ......",-;
		mes "[Dr. Tracy]";
		mes "Stop talking and drink it!";
		NEXT;
		misceffect 7,"";
		percentheal 100,100;
		mes "[Dr. Tracy]";
		mes "How's it going?";
		mes "What happened?";
		next;
		menu "I feel better.",-;
		mes "[Dr. Tracy]";
		mes "Aren't you?";
		mes "I've been aware of it for some time.";
		mes "But the key research has failed again. ......";
		mes "Maybe it was the wrong kind of mushrooms. ......";
		next;
		mes "[Dr. Tracy]";
		mes "For now, this is the end of the request.";
		mes "Please let me know if you need anything else.";
		if('@novice){
			mes "Also, take this.";
			next;
			// 3 leaves of Yggdrasil
			if(!checkweight(610,3)){
				mes "Overweight!";
				close;
			}
			getitem 610,3;
		}
		else next;
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Dr. Tracy]";
		mes "This is the end of the request for now.";
		mes "Please let me know if you need anything else.";
		next;
		mes "^FF0000[request completed]^000000You have completed your request!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST07:
	switch(AC_QUEST_ST_3) {
	case 1:
		Emotion 0;
		mes "[Dr. Tracy]";
		mes ""+strcharinfo(0)+"!";
		mes "We've been waiting for you!";
		mes "Well, then, listen to me!";
		mes "It was my birthday the other day, and lo and behold, Laila gave me a pre-Zento!";
		next;
		menu "Good for you",-;
		mes "[Dr. Tracy]";
		mes "Right?";
		mes "I bet Laila likes me.";
		mes "That must be why she did the pre-Zento.";
		mes "Don't you think so?";
		NEXT;
		menu "What do you think?" ,-;
		mes "[Dr. Tracy]";
		mes "No, of course it is!";
		mes "But I am ashamed to say that I have never been in a relationship with a Woman.";
		mes "That's why I need to complete my research!";
		NEXT;
		mes "[Dr. Tracy]";
		mes "So it is!";
		mes "Again, I would like to request the collection of research materials!";
		mes "Ask Laila for more details, will you?";
		NEXT;
		menu "Okay",-;
		mes "[Dr. Tracy]";
		mes "Well then, take care of it!";
		mes "Oh yeah, and don't ask Laila about what we just talked about, okay?";
		mes "You're going to embarrass me.";
		next;
	L_REP4_1:
		mes "Ask ^FF0000 [Mission] ^000000^0000FF assistant Laila^000000 the details of your request.";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Dr. Tracy]";
		mes ""+strcharinfo(0)+"!";
		mes "I'm sorry, but I'm in a hurry.";
		mes "Ask Laila what's going on.";
		next;
		goto L_REP4_1;
	case 3:
		mes "-She seems to be concentrating on her research and doesn't seem to notice us...";
		close;
	case 4:
		mes "[Dr. Tracy]";
		mes "Oh!";
		mes "At last, at long last, it's done.";
		mes "It must be finished now.";
		mes "Now, give it to me.";
		next;
		menu "Pass the Suspicious Mushroom",-;
		mes "[Dr. Tracy]";
		mes "Now, the moment of the century!";
		next;
		misceffect 70, "#AC_BOM";
		mes "-Dr. Drew threw Suspicious Mushroom into the liquid.";
		mes " Then the liquid turned a funny color and started to bubble -";
		next;
		misceffect 106, "#AC_BOM";
		mes "[Dr. Tracy]";
		mes "It exploded. !!!!!!! Fire!!!!";
		mes "Put it out quickly. !!!!! Atchiti";
		next;
		menu "How do you ......",-;
		mes "[Laila]";
		mes "Oh, my God!";
		mes "I'll have to turn it off right away.";
		mes "I'm going to have to ask you both to step back for a minute.";
		next;
		misceffect 89, "#AC_BOM";
		sc_start2 SC_Freeze,5000,1,10000;
		percentheal -99,0;
		mes "[Laila]";
		mes "Stormgast!";
		next;
		mes "[Laila]";
		mes "......";
		mes "Oh my ...... sorry.";
		mes "I went a little overboard. ......";
		mes "Doctor,";
		mes strcharinfo(0) + "";
		mes "Are you okay?";
		next;
		menu "na, something ......",-;
		mes "[Dr. Tracy]";
		mes "I'm fine, I'm fine!";
		mes "I felt Laila's love!";
		mes ""+strcharinfo(0) + "also don't worry.";
		mes "No problem!";
		mes "You're young!";
		next;
		mes "[Dr. Tracy]";
		mes "Hmmm, and if even those mushrooms don't work, what else should I try ......";
		mes "Grass would be better, though, wouldn't it?";
		mes "Hmmm ......";
		next;
		menu "that ......",-;
		if('@novice){
			mes "[Dr. Tracy]";
			mes "Sorry, sorry.";
			mes "I forgot.";
			mes "I'll take this as my reward.";
			next;
			// 579 50 delicious fish
			if(!checkweight(579,50)){
				mes "Overweight!";
				close;
			}
			getitem 579,50;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Dr. Tracy]";
		mes "Hmmm, and if those mushrooms don't work, what else should I try ......";
		mes "Would grass still be better?";
		mes "Hmmm ......";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST09:
	switch(AC_QUEST_ST_3) {
	case 1:
		EMOTION 19;
		mes "[Dr. Tracy]";
		 ;
		mes "What am I supposed to do!";
		mes "It's good!";
		next;
		menu "What's wrong?" ,-;
		mes ""+strcharinfo(0) + "!!! ......";
		mes "You may speak to me at ......";
		mes "I'm going to say it in a low voice, so listen carefully.";
		next;
		emotion 19;
		mes "[Dr. Tracy]";
		mes "What a ......";
		mes "I saw Laila and a stranger walking yesterday. ......";
		mes "I wonder what kind of relationship they have ......";
		next;
		menu "Why don't you ask him?" ,-;
		EMOTION 36;
		mes "[Dr. Tracy]";
		mes "Stupid!";
		mes "You can't ask me that.";
		mes "Mmmm, but if I don't do this, I'm going to have to go to ......";
		mes "There's a chance you'll be beguiled by a man you don't know.";
		mes "I must finish the medicine as soon as possible.";
		next;
		mes "[Dr. Tracy]";
		mes "So, I want you to hurry up and get the research materials!";
		mes "This time you can be sure.";
		mes "Absolutely!";
		mes "I did a lot of research and I know what you need!";
		next;
		mes "[Dr. Tracy]";
		mes "Ask ^FF0000Laila^000000 for more information.";
		next;
		L_REP9_1:
		mes "Ask ^FF0000 [Mission] ^FF0000^FF0000Laila^000000 assistant Laila^000000 for details of the request.";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Dr. Tracy]";
		mes ""+strcharinfo(0) + "!";
		mes "I'm sorry, but I'm in a hurry.";
		mes "Ask Laila what's going on.";
		next;
		goto L_REP9_1;
	case 3:
		mes "-She seems to be concentrating on her research and doesn't seem to notice us...";
		close;
	case 4:
		emotion 0;
		mes "[Dr. Tracy]";
		mes "Oh!";
		mes "At last!";
		mes "The time has finally come.";
		mes "Now, give it to me quickly!";
		next;
		menu "Pass Minmin Grass",-;
		mes "[Dr. Tracy]";
		mes "Okay, I'll put Minmin Grass in first.";
		next;
		misceffect 94, "#AC_BOM";
		mes "-The moment Dr. Tracy put Minmin Grass in the liquid, the liquid started to glow";
		next;
		mes "[Dr. Tracy]";
		mes "Okay!";
		mes "Success!";
		mes "Success. !!!!";
		next;
		mes "[Laila]";
		mes "Congratulations to Dr. Laila!";
		next;
		mes "[Dr. Tracy]";
		mes "Thank you Laila.";
		mes "It's been a long day so far ......";
		next;
		mes "[Laila]";
		mes "By the way, Dr. ......";
		mes "What is this medicine?";
		next;
		menu "I was wondering about that too." ,-;
		EMOTION 29;
		mes "[Dr. Tracy]";
		mes "Hmph, I'll tell you wai.";
		mes "This is oh ......";
		mes "Oh my god, what a surprise!";
		mes "It's a drug that can read Woman's mind!";
		next;
		menu "What?",-;
		emotion 23, "Laila#AC";
		emotion 23,"";
		mes "[Dr. Tracy]";
		mes "Yes, and if you put this hair in it and drink it!";
		mes "Laila's heart should be in your hand!";
		next;
		mes "-With a swift movement, the doctor placed a lock of Laila's hair in the liquid and drank it down -";
		next;
		mes "[Dr. Tracy]";
		mes "Huahahahaha.";
		mes "Now, Laila, bare your heart!";
		mes "Expose yourself!";
		NEXT;
		mes "[Dr. Tracy]";
		mes "......";
		mes "............";
		next;
		mes "[Dr. Tracy]";
		mes "What the hell? I can't read your mind! What the hell is going on?";
		mes "My research must be perfect ......";
		next;
		mes "[Dr. Tracy]";
		mes "......";
		mes "............";
		mes "Actually, yes. ......";
		mes "I, actually. ............";
		next;
		mes "-Laila took what looked like a capsule out of her bag and swallowed it-";
		next;
		emotion 23;
		emotion 23,"";
		donpcevent "#AC_BOM::OnEvent";
		mes "[Laila]";
		mes "I'm a man. ......";
		mes "Actually, I made something called a makeover potion before ......";
		next;
		mes "[Dr. Tracy]";
		mes "Gahhhh ............";
		next;
		mes "-Dr. Tracy seems to have passed out after screaming and yelling ......-";
		next;
		mes "[Laila]";
		mes "Oh dear ......";
		mes "I think I fainted. ......";
		next;
		mes "[Laila]";
		mes "I'll take care of the rest.";
		mes "Thank you so much for everything.";
		if('@novice){
			mes "This will be your reward this time, so please accept it.";
			next;
			switch(Job){
			// Swordsman : 1 helm[0].
			case Job_Swordman:
				set '@item,2228;
				break;
			//Thief : cap[0] 1pc
			case Job_Thief:
			// Merchant : cap[0] 1
			case Job_Merchant:
			//Acha : cap[0] 1
			case Job_Archer:
				set '@item,2226;
				break;
			//ACO : Villeta[0] 1 piece
			case Job_Acolyte:
				set '@item,2216;
				break;
			//Maj: 1 round hat[0].
			case Job_Magician:
			//Telecon: round hat[0] 1 piece
			case Job_TaeKwon:
			//Ninja : round hat [0] 1
			case Job_Ninja:
			//Gunslinger: round hat [0] 1 piece
			case Job_Gunslinger:
				set '@item,2222;
				break;
			//Novi : Supernovice hat [0] 1 piece
			//Supernovice: 1 Supernovice hat [0].
			default:
				set '@item,5112;
				break;
			}
			if(!checkweight('@item,1)){
				mes "Overweight!";
				close;
			}
			getitem '@item,1;
		}
		else next;
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "-Dr. Tracy is out cold-";
		next;
		mes "^FF0000 [request accomplished]^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_CLEAR:
	mes "[Dr. Tracy]";
	mes ""+strcharinfo(0) + "No!";
	mes "Thank you so much for all your help.";
	mes "I'd like to ask you again if I need anything else!";
	close;
L_OTHER:
	mes "[Dr. Tracy]";
	mes "This is what happens when you do this: ......";
	mes "Oh no, it's difficult ......";
	close;
}
hu_in01.gat,305,27,4	script	Laila#AC	69,{
	set '@novice, callfunc("AC_GetNovice");
	switch(AC_QUEST_LV_3){
	case 0:
		goto L_QUEST01;
	case 2:
		goto L_QUEST03;
	case 4:
		goto L_QUEST05;
	case 6:
		goto L_QUEST07;
	case 8:
		goto L_QUEST09;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST01:
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[Laila]";
		mes "We have heard from Dr.";
		mes "The details of your request?";
		next;
		menu "Best regards",-;
		mes "[Laila]";
		mes "No, thank you for taking the time out of your busy schedule to accept my request.";
		next;
		mes "[Laila]";
		mes "As for your request, would you please pick ^FF0000Pom Pom Grass^000000 that grows in ^0000FFGeffen field 07 (185 249)^000000?";
		next;
		// as per the main mackerel (Itadakimasu)
		menu "What kind of grass is it?" ,-;
		mes "[Laila]";
		mes "Oh, I'm sorry.";
		mes "Pom Pom Grass is. ......";
		next;
		mes "-Laila explained Pom Pom Grass to me-";
		next;
		mes "[Laila]";
		mes "Well, I'm looking forward to working with you.";
		next;
		menu "Okay.",-;
		mes "^FF0000[Mission] ^000000^0000FFFGeffen field 07 (185 249)^000000 I'm going to pick ^FF0000Pom Pom Grass^000000 that grows in the field.";
		mes " -^0000FFGeffen field 07^000000 is close to Geffen -";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Laila]";
		mes "Did you forget what you requested?";
		mes "I will tell you again for GOST.";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFFGeffen field 07 (185 249)^000000 to pick ^FF0000Pom Pom Grass^000000 that grows in the field.";
		mes " -^0000FFGeffen field 07^000000 is closer to Geffen if you go from Geffen-";
		close;
	case 4:
		mes "[Laila]";
		mes "Ah!";
		mes "Welcome back.";
		mes "It looks like you got ^FF0000Pom Pom Grass^000000 safely!";
		mes "Please give ^FF0000Pom Pom Grass^000000 to the doctor.";
		close;
	case 99:
		mes "[Laila]";
		mes "It appears that your research is a failure.";
		mes "Hopefully the next one will be successful. ......";
		mes "Thank you for accepting my request.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST03:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Laila]";
		mes "Oh my,";
		mes strcharinfo(0) + "";
		mes "Hello.";
		close;
	case 2:
		mes "[Laila]";
		mes "Again this time";
		mes strcharinfo(0) + "is";
		mes "You are going to help us.";
		next;
		mes "[Laila]";
		mes "The request is, could you please pick up ^FF0000Laila rushes^000000 that grow in ^0000FF Pila Mido dungeon 1F^000000?";
		mes "Laila rushes are available at ......";
		next;
		menu "Okay",-;
		mes "-Laila explained Laila rushes to me-";
		next;
		mes "[Laila]";
		mes "The Pila Mido dungeon is near Morroc and you can find it in town.";
		mes "I'll write you a note just in case.";
		mes "Well then, thank you very much.";
		next;
	L_REP3_3:
		mes "^FF0000 [Mission] ^000000^0000FF Pila Mido dungeon 1F (193,193)^000000 to pick ^FF0000Laila rushes^000000 that grow in the dungeon.";
		mes " -^0000FF Pila Mido dungeon 1F^000000 to get there from ^0000FFMorroc^000000 is close -";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Laila]";
		mes "Did you forget what you requested?";
		mes "I will tell you again for GOST.";
		next;
		mes "[Laila]";
		mes "As for your request, could you please pick up the ^FF0000Laila rush^000000 that grows on the ^0000FF Pila Mido dungeon 1F^000000?";
		next;
		goto L_REP3_3;
	case 4:
		mes "[Laila]";
		mes "As expected,";
		mes strcharinfo(0) + "As expected.";
		mes "Did you successfully get ^FF0000Laila rushes ^000000?";
		mes "Then please give it to the doctor.";
		close;
	case 99:
		mes "[Laila]";
		mes "It appears that your research is a failure.";
		mes "Hopefully the next one will be successful. ......";
		mes "Thank you for accepting my request.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST05:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Laila]";
		mes "Oh my,";
		mes strcharinfo(0) + "";
		mes "Hello.";
		close;
	case 2:
		mes "[Laila]";
		mes ""+strcharinfo(0)+"The research you helped Dr. Laila with has come up with some new concoction.";
		mes "Maybe this time it will work!";
		next;
		mes "[Laila]";
		mes "Quickly, as to your request, could you please pick the ^FF0000Black Funny Mushroom^000000 that grows in the ^0000FFPayon dungeon 1F^000000?";
		mes "^FF0000Black Funny Mushroom^000000 is ......";
		next;
		menu "Okay",-;
		mes "-Laila explained Black Funny Mushroom to me-";
		next;
		mes "[Laila]";
		mes "Payon dungeon is near Payon and you can find it in town.";
		mes "I'll write you a note just in case.";
		mes "Well, thank you very much for your time.";
		next;
	L_REP4_2:
		mes "^FF0000 [Mission] ^000000^0000FFPayon dungeon 1F^000000 I'm going to pick ^FF0000Black Funny Mushroom^000000 that grows in the dungeon.";
		mes " -^0000FFPayon dungeon 1F^000000 is close to ^0000FFPayon^000000 if you go from ^0000FFPayon^000000-";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Laila]";
		mes "Did you forget what you requested?";
		mes "I will tell you again for GOST.";
		next;
		mes "[Laila]";
		mes "As for your request, could you please pick the ^FF0000Black Funny Mushroom^000000 that grows in the ^0000FFPayon dungeon 1F^000000?";
		next;
		goto L_REP4_2;
	case 4:
		mes "[Laila]";
		mes ""+strcharinfo(0)+"Welcome back.";
		mes "It looks like you got ^FF0000Black Funny Mushroom^000000 safely.";
		mes "Then, please give it to the doctor.";
		close;
	case 99:
		mes "[Laila]";
		mes "I think I screwed up again. ......";
		mes "Oh, by the way, I'm an assistant, and they won't even tell me what they are working on this time.";
		mes "Do you know anything about it?";
		NEXT;
		menu "Yes, no, ......",-;
		mes "[Laila]";
		mes "Yes, indeed. ......";
		mes "I'm very curious what you are researching ......";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST07:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Laila]";
		mes ""+strcharinfo(0) + "Hello.";
		mes "Thank you for everything.";
		close;
	case 2:
		mes "[Laila]";
		mes ""+strcharinfo(0) + "Hello.";
		mes "You are already a customer.";
		mes "I'm really always happy to help you.";
		next;
		mes "[Laila]";
		mes "I will explain the collection we are requesting this time as soon as possible.";
		mes "uh ......";
		mes "This time, please collect ^FF0000Suspicious Mushroom^000000, which grows in the ^0000FFPayon Lost Forest 02^000000.";
		next;
		mes "-Laila explained to me about Suspicious Mushroom-";
		next;
		mes "[Laila]";
		mes "So, thank you again for your time.";
		next;
	L_REP5_2:
		mes "^FF0000[Mission] ^000000^0000FFPayon the lost forest 02(49,126)^000000 and pick ^FF0000Suspicious Mushroom^000000 that grows there.";
		mes "-^0000FFPayon Lost Forest 02^000000 is closer if you go from Payon-";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Laila]";
		mes "Did you forget what you requested?";
		mes "I will tell you again for GOST.";
		next;
		mes "[Laila]";
		mes "This time, please pick the ^FF0000Suspicious Mushroom^000000 that grows in the ^0000FFPayon Lost Forest 02^000000.";
		mes "You should go to ^0000FFPayon Lost Forest 02^000000 from ^0000FFPayon^000000.";
		mes "Then, please take care of it.";
		next;
		goto L_REP5_2;
	case 4:
		mes "[Laila]";
		mes "As expected,";
		mes strcharinfo(0) + "As expected.";
		mes "Did you get ^FF0000Suspicious Mushroom^000000 successfully?";
		mes "Then please give it to the doctor.";
		close;
	case 99:
		mes "[Laila]";
		mes ""+strcharinfo(0) + "I'm really sorry about earlier ......";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "Don't worry about it.";
		mes "More importantly, did you give the Dr. a pre-Zento or something?";
		next;
		mes "[Laila]";
		mes "Yes, I have to at least give you a birthday pre-Zento since you usually take care of me.";
		next;
		menu "I see!" ,-;
		mes "[Laila]";
		mes "Hmmm.";
		mes "Well then, please let me know if you need anything else.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST09:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Laila]";
		mes ""+strcharinfo(0) + "Hello.";
		mes "Something's going on with Dr. Laila, what's going on ......";
		close;
	case 2:
		mes "[Laila]";
		mes "Dr. Laila is still having a rough time ......";
		mes "What the hell is going on ......";
		next;
		mes "[Laila]";
		mes "But Dr. Laila seems pretty confident about the material this time.";
		mes "But it's a little strange that it might be successful.";
		mes "He's in a hurry, or something like that. ......";
		next;
		mes "[Laila]";
		mes "Well, the first material that I need you to collect is ^FF0000Minmin Grass^000000 that grows in the ^0000FFProntera underground canal 3F^000000, and the other is ......";
		mes "^FF0000My Hair^000000!";
		next;
		mes "[Laila]";
		mes "Hmm, what's with my hair in it ......";
		next;
		mes "[Laila]";
		mes "For now, I'll give the hair directly to the doctor, so";
		mes strcharinfo(0) + "is";
		mes "Could you please pick up the other material?";
		next;
		mes "[Laila]";
		mes "Uh, ^FF0000Minmin Grass^000000 that grows in the ^0000FFProntera underground canal 3F^000000.";
		mes "Well then, thank you very much.";
		next;
	L_REP9_2:
		mes "^FF0000[Mission] ^000000^000000^0000FFProntera underground canal 3F (184,17), where I will pick ^FF0000Minmin Grass^000000 that grows there.";
		mes " -^0000FFProntera Underground Canal 3F^000000 is close to ^0000FFProntera^000000 if you go from ^0000FFProntera^000000-";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Laila]";
		mes "Did you forget what you requested?";
		mes "I will tell you the story again for GHOST.";
		next;
		mes "[Laila]";
		mes "As for your request, please pick up the ^FF0000Minmin Grass^000000 that grows in the ^0000FFProntera underground canal 3F^000000.";
		next;
		goto L_REP9_2;
	case 4:
		mes "[Laila]";
		mes ""+strcharinfo(0) + ".";
		mes "Welcome back.";
		mes "I gave you the hair earlier.";
		mes "Please give ^FF0000Minmin Grass^000000 to the doctor.";
		close;
	case 99:
		mes "[Laila]";
		mes "Thank you so much for all your help.";
		mes "When the doctor wakes up, I'll explain the situation to him, don't worry.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurer's Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_CLEAR:
	mes "[Laila]";
	mes ""+strcharinfo(0) + "Thanks for everything!";
	next;
	mes "[Laila]";
	mes "Doctor, I don't think he remembers that I'm transforming.";
	mes "So I guess I will keep it a secret.";
	close;
L_OTHER:
	mes "[Laila]";
	mes "Oh, hello.";
	close;
}
hu_in01.gat,308,27,4	script	#AC_BOM	139,{
OnEvent:
	disablenpc "Laila#AC";
	enablenpc "Laila#AC2";
	misceffect 744, "Laila#AC2";
	misceffect 30, "Laila#AC2";
	misceffect 72, "Laila#AC2";
	sleep 5000;
	disablenpc "Laila#AC2";
	enablenpc "Laila#AC";
}
hu_in01.gat,305,27,4	script	Laila#AC2	740,{
OnInit:
	disablenpc;
}
gef_fild07.gat,179,242,4	script	#AC_POMPOM	1083,{
}
gef_fild07.gat,179,241,4	script	Pom Pom Grass#AC	111,{
	if(AC_QUEST_LV_3!=0 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "This grass seems to be the right grass.";
	next;
	mes "-I got one Pom Pom Grass-";
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Pom Pom Grass^000000 to Dr. Tracy^000000.";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "-The grass is growing-";
	if(AC_QUEST_LV_3!=0 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Pom Pom Grass^000000 to ^FF0000Dr. Tracy^000000.";
	close;
}
moc_pryd01.gat,193,193,0	script	#AC_RAIRAI	1081,{
}
moc_pryd01.gat,193,192,0	script	Laila rushes#AC	111,{
	if(AC_QUEST_LV_3!=2 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "This grass seems to be the right grass.";
	next;
	mes "-^FF0000Laila I got one grass ^000000 -";
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Laila rushes^000000 to Dr. Tracy^000000.";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "-The grass is growing-";
	if(AC_QUEST_LV_3!=2 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Laila rushes^000000 to ^FF0000Dr. Tracy^000000.";
	close;
}
pay_dun00.gat,154,172,0	script	#AC_KINOKO1	1084,{
}
pay_dun00.gat,154,171,0	script	Black Funny Mushroom#AC	111,{
	if(AC_QUEST_LV_3!=4 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "It looks like this mushroom is the right one.";
	next;
	mes "-^FF0000Black Funny Mushroom^000000 got one -";
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Black Funny Mushroom^000000 to ^FF0000Dr. Tracy^000000.";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "-mushrooms are growing-";
	if(AC_QUEST_LV_3!=4 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Black Funny Mushroom^000000 to ^FF0000Dr. Tracy^000000.";
	close;
}
pay_fild02.gat,52,125,0	script	#AC_KINOKO2	1085,{
}
pay_fild02.gat,52,124,0	script	Suspicious Mushroom#AC	111,{
	if(AC_QUEST_LV_3!=6 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "This grass seems to be the right grass.";
	next;
	mes "-^FF0000Suspicious Mushroom^000000 got one -";
	next;
	mes "^FF0000[Mission] ^000000^FF0000Deliver ^FF0000Suspicious Mushroom^000000 to Dr. Tracy^000000.";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "-mushrooms are growing-";
	if(AC_QUEST_LV_3!=6 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Suspicious Mushroom^000000 to ^FF0000Dr. Tracy^000000.";
	close;
}
prt_sewb3.gat,184,17,0	script	#AC_MINMIN	1080,{
}
prt_sewb3.gat,184,16,0	script	Minmin Grass#AC	111,{
	if(AC_QUEST_LV_3!=8 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "This grass seems to be the right grass.";
	next;
	mes "-^FF0000Minmin Grass^000000 got one -";
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Minmin Grass^000000 to Dr. Tracy^000000.";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "-The grass is growing-";
	if(AC_QUEST_LV_3!=8 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000 [Mission] ^000000^FF0000Deliver ^FF0000Minmin Grass^000000 to ^FF0000Dr. Tracy^000000.";
	close;
}
hu_in01.gat,113,313,4	script	Amuron	47,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_3) goto L_OTHER;
	switch(AC_QUEST_LV_3){
	case 1:
		goto L_QUEST02;
	case 3:
		goto L_QUEST04;
	case 5:
		goto L_QUEST06;
	case 7:
		goto L_QUEST08;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST02:
	switch(AC_QUEST_ST_3) {
	case 1:
		emotion 0;
		mes "[Amuron]";
		mes "Oh!";
		mes "Is that you?";
		mes "The adventurer who will accept the request.";
		next;
		menu "Uh, of the Adventurers Association?" ,-;
		mes "[Amuron]";
		mes "Sorry.";
		mes "I'm sorry I'm late in saying hello.";
		mes "My name is Amuron, and I oversee the Adventurers Association.";
		mes "It's nice to meet you.";
		next;
		mes "[Amuron]";
		mes "First, let me explain what the Adventurers' Association does.";
		next;
		mes "[Amuron]";
		mes "The Adventurers Association is simply a volunteer organization that takes care of everything.";
		mes "However, we only handle cases that are difficult for ordinary people to solve.";
		next;
		mes "[Amuron]";
		mes "We help people who are stranded in dungeons, or in situations where it is difficult to help them unless they are adventurers, and so on.";
		next;
		mes "[Amuron]";
		mes "I'm really glad that the Adventurer Academy is backing us fully this time.";
		mes "It would have cost us an awful lot of money to hire them normally. ......";
		next;
		mes "[Amuron]";
		mes "So that's that.";
		mes "I'll explain the request as soon as possible.";
		next;
		mes "[Amuron]";
		mes "Mmmm, this might be a bad idea if we don't hurry.";
		mes "Apparently, a child is stranded in the dungeon.";
		next;
		mes "[Amuron]";
		mes "The name is ^FF0000Chislow^000000.";
		mes "He is a boy of age 10.";
		mes "He has left a note that he is going to ^0000FFProntera Underground Canal 1F^000000 and has not returned at curfew.";
		next;
		mes "[Amuron]";
		mes "I think the matter is time sensitive.";
		mes "There are monsters out there.";
		mes "If you find ^FF0000Chislow^000000, please give me this ^0000FF butterfly feather^000000.";
		mes " -I received a bag of butterfly wings-";
		next;
	L_REP2_1:
		mes "Give the butterfly wings to ^FF0000Chislow^000000 who is in ^FF0000 [Mission] ^000000^0000FFProntera underground canal 1F (301,206)^000000.";
		mes " -^0000FFProntera Underground Canal 1F^000000 is closer to ^0000FFProntera^000000 -";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Amuron]";
		mes "Please hurry up.";
		mes "Things are time-sensitive.";
		next;
		goto L_REP2_1;
	case 3:
		mes "[Amuron]";
		mes "I just got a call from the client thanking me for my help.";
		mes ""+strcharinfo(0)+"Thanks for your help.";
		mes "I'm really glad the child and you are safe.";
		next;
		mes "[Amuron]";
		mes "Well, I will be in touch with the academy if I need anything else, and if my hands are open, please let me know then.";
		mes "Thank you very much.";
		next;
	L_REP2_3:
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Amuron]";
		mes ""+strcharinfo(0)+"Thank you.";
		next;
		goto L_REP2_3;
	default:
		goto L_OTHER;
	}
L_QUEST04:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Amuron]";
		mes ""+strcharinfo(0)+"Are you taking care of it this time too?";
		next;
		menu "Yes",-;
		mes "[Amuron]";
		mes "No, that's very helpful.";
		mes "Well, let me get right to it and explain the details of this request.";
		next;
		mes "[Amuron]";
		mes "I heard that one girl who was playing hide-and-seek in ^0000FFIzlude undersea cave 1F^000000 has not been found after 5 hours.";
		next;
		mes "[Amuron]";
		mes "Her name is ^FF0000Swiffler, ^000000age 11 years old.";
		next;
		mes "[Amuron]";
		mes "If you find ^FF0000Swiffler^000000, I want you to give her this, ^0000FF butterfly wings^000000 like last time.";
		mes " -I received a bag of butterfly wings-";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFIzlude the butterfly feather to ^FF0000Swiffler^000000 in the undersea cave 1F(351,45)^000000.";
		mes " ^0000FF-Izlude Undersea Caves^000000 are located on Byran Island, which can be reached by boat from Izlude-";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Amuron]";
		mes "Then again, you don't usually play in dungeons. ......";
		mes "I wonder what kind of education the parents are giving ......";
		mes "Please hurry up for now.";
		next;
		mes "^FF0000[Mission] ^000000^0000FFIzlude Undersea Cave 1F (351,45)^000000 give butterfly wings to ^FF0000Swiffler^000000 who is in ^000000.";
		mes "-^0000FFIzlude Undersea Cave^000000 is located on Bylan Island, which can be reached by boat from Izlude-";
		close;
	case 3:
		mes "[Amuron]";
		mes ""+strcharinfo(0)+"Good work.";
		mes "You have successfully completed your mission.";
		mes "Just now, you've heard from the client.";
		next;
		mes "[Amuron]";
		mes "Well, I'll be in touch with the academy if I hear anything else, and if your hands are open, I'll be happy to help you then.";
		mes "Thank you very much.";
		next;
	L_REP4_3:
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Amuron]";
		mes ""+strcharinfo(0)+"Thank you.";
		next;
		goto L_REP4_3;
	default:
		goto L_OTHER;
	}
L_QUEST06:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Amuron]";
		mes "We've been waiting for you.";
		mes ""+strcharinfo(0)+"This request is to find a cat!";
		next;
		menu "Is it a cat!" ,-;
		mes "[Amuron]";
		mes "Yes, apparently the client's cat has been missing for a few days.";
		mes "So, he wants us to locate the cat.";
		next;
		mes "[Amuron]";
		mes "I have received information from other adventurers that they have seen a cat-like figure in the Prontera underground canal 2F, so could you please search ^FF0000Prontera underground canal 2F^000000?";
		next;
		mes "[Amuron]";
		mes "The cat's name is ^FF0000 Merci^000000 and she is two years old this year.";
		mes "She seems to be a very smart cat and can come back by herself if you give her ^008800 butterfly wings^000000.";
		next;
		mes "[Amuron]";
		mes "So if you find Mercy-chan, please give her the butterfly feather like you did last time.";
		mes " -I received a bag with butterfly wings in it-";
		next;
	L_REP6_1:
		mes "^FF0000 [Mission] ^000000^0000FFProntera underground canal 2F (159,182)^000000 give the butterfly wings to ^FF0000 Mercy-chan at ^000000.";
		mes " ^0000FF-Prontera Underground Canal 2F^000000 can be reached from ^0000FFProntera^000000-";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Amuron]";
		mes "I'll ask for it then.";
		next;
		goto L_REP6_1;
	case 3:
		emotion 4;
		emotion 23,"";
		mes "[Amuron]";
		mes ""+strcharinfo(0)+"^FF0000Mercy-chan^000000They came back safely.";
		mes "But ......I heard he went missing again soon after. ......";
		next;
		menu "I see. ......",-;
		mes "[Amuron]";
		mes "The request is closed for now.";
		mes "Then I will contact the academy if I have any more questions, and if you are available, I would appreciate it then.";
		mes "Thank you very much.";
		next;
	L_REP6_3:
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Amuron]";
		mes ""+strcharinfo(0)+"Thank you.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST08:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[Amuron]";
		mes "Hello,";
		mes strcharinfo(0) + "";
		mes "I will explain the request as soon as possible.";
		next;
		mes "[Amuron]";
		mes "It seems that the new adventurers were adventuring in pairs, but they were surrounded by monsters and one of them is stuck.";
		next;
		mes "[Amuron]";
		mes "It seems that the partner who was paired with him is also injured, and he is unable to go help him immediately.";
		mes "So this request will be to rescue this new adventurer.";
		next;
		mes "[Amuron]";
		mes "His name is ^FF0000Zapapo^000000.";
		mes "His age is 20 years old male.";
		mes "This time, give him ^008800Butterfly Wings^000000 and this ^008800Wound Medicine^000000 as well.";
		mes "-I received the bag with the butterfly wings and the wound medicine-";
		next;
	L_REP8_1:
		mes "^FF0000[mission] ^000000^0000FFIzlude the ^FF0000Zapapo^000000 in the undersea cave 2F(129,79)^000000 and give him ^008800 butterfly wings^000000 and ^008800 wound medicine^000000.";
		mes " -^0000FFIzlude Undersea Cave 2F^0000FFIzlude^000000 to ^0000FFIzlude^000000 by boat-";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[Amuron]";
		mes "I'll ask for it then.";
		next;
		goto L_REP8_1;
	case 3:
		mes "[Amuron]";
		mes ""+strcharinfo(0) + "How was it?";
		next;
		menu "Explain the situation",-;
		emotion 4;
		mes "[Amuron]";
		mes "What a ......";
		mes "Well, well, I'm glad you're okay!";
		mes "But how much of a heartless person would you have to be to sleep in a place like that ......";
		next;
		mes "[Amuron]";
		mes "At any rate, the mission is complete. ......";
		mes ""+strcharinfo(0) + "Thank you very much.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[Amuron]";
		mes ""+strcharinfo(0)+"Thank you.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[Amuron]";
	mes "Hello.";
	close;
L_CLEAR:
	mes "[Amuron]";
	mes ""+strcharinfo(0)+"You are really a great adventurer.";
	mes "I'll look forward to working with you again.";
	close;
}
prt_sewb1.gat,301,206,4	script	Chislow#AC	896,{
	if(AC_QUEST_LV_3!=1) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[Chislow]";
		mes "Woah, woah.";
		mes "I forgot my butterfly wings, I can't go home!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "Chislow-kun, I'm here to help you.";
		next;
		emotion 0;
		mes "[Chislow]";
		mes "! Gussh, gussh thank you ......";
		mes "Now I can go home.";
		next;
		emotion 15;
		mes "[Chislow]";
		mes "Yay!";
		mes "I'm fine with butterfly wings, so let's explore some more!";
		mes "Thank you!";
		next;
	L_REP01:
		mes "^FF0000 [Mission] ^000000Report to ^FF0000Amuron^000000 that you have safely given the butterfly wings.";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Chislow]";
		mes "Thanks for coming all the way out here.";
		mes "I'll be back after a little exploring, don't worry!";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[Chislow]";
	mes "I'm looking forward to exploring.";
	close;
}
iz_dun00.gat,351,45,4	script	Swiffler#AC	96,{
	if(AC_QUEST_LV_3!=3) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[Swiffler]";
		mes "......";
		next;
		menu "Swiffler-chan?" ,-;
		mes "[Swiffler]";
		mes "Shh, we're playing hide-and-seek right now, so don't talk to me!";
		mes "The ogres will find out!";
		NEXT;
		menu "Explain the situation",-;
		mes "[Swiffler]";
		mes "I'm awesome!";
		mes "I didn't know enough to do that!";
		mes "Are you a hide-and-seek master?";
		mes "hmmm";
		next;
		mes "[Swiffler]";
		mes "But thanks for coming all the way out here.";
		mes "I'll make sure you get home right!";
		mes "So long.";
		next;
	L_REP01:
		mes "^FF0000 [Mission] ^000000Report to ^FF0000Amuron^000000 that you have safely given the butterfly wings.";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Swiffler]";
		mes "I'll be back later, don't worry!";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[Swiffler]";
	mes "......";
	close;
}
prt_sewb2.gat,159,182,4	script	Mercy-chan#AC	876,{
	if(AC_QUEST_LV_3!=5) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[Mercy-chan]";
		mes "Meow-meow";
		next;
		menu "Mercy-chan?",-;
		mes "[Mercy-chan]";
		mes "Meow-meow-meow";
		next;
		menu "Explain the situation",-;
		mes "[" + strcharinfo(0) + "]";
		mes "(It appears to be Mercy-chan.";
		mes " Give him the wings of a butterfly.";
		mes " I wonder if this is really okay ......)";
		next;
	L_REP01:
		mes "^FF0000 [Mission] ^000000Report to ^FF0000Amuron^000000 that you have safely given the butterfly wings.";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Mercy-chan]";
		mes "Meow!";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[Mercy-chan]";
	mes "Meow-meow";
	close;
}
iz_dun01.gat,129,79,4	script	Zapapo#AC	887,{
	if(AC_QUEST_LV_3!=7) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[Zapapo]";
		mes "Zzzzz ......";
		next;
		menu "Mr. Zapapo?" ,-;
		mes "[Zapapo]";
		mes "Hmm?";
		mes "mnya mnya ......";
		mes "I can't eat anymore ......";
		next;
		menu "Mr. Zapapo!" ,-;
		EMOTION 23;
		mes "[Zapapo]";
		mes "D'oh!";
		mes "What the hell is that?";
		next;
		menu "Explain the situation",-;
		mes "[Zapapo]";
		mes "I see, that's what happened, but I'm fine!";
		mes "I'm just sleeping.";
		mes "No, I'm awfully sleepy, and it's nice and cold here.";
		next;
		menu "......",-;
		mes "[Zapapo]";
		mes "But thankfully I'll take ^008800wound medicine^000000 and ^008800butterfly wings^000000.";
		mes "Well then!";
		next;
	L_REP01:
		mes "^FF0000 [Mission] ^000000Report to ^FF0000Amuron^000000 that you have safely given the butterfly wings.";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[Zapapo]";
		mes "Zzzzz......";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[Zapapo]";
	mes "Zzzzz ......";
	close;
}
