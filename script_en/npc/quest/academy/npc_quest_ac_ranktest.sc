//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Promotional Exams
// by Pneuma
//------------------------------------------------------------

// -----------------------------------------------------------
// Related to promotion examinations
// -----------------------------------------------------------

ac_cl_area.gat,85,37,4	script	Gordo	122,{

	function show_mission;

	if(!AC_RANKTEST) goto L_OTHER;
	switch(AC_RANK){
	case 0: goto L_TEST01;
	case 1: goto L_TEST02;
	case 2: goto L_TEST03;
	case 3: goto L_TEST04;
	case 4: goto L_TEST05;
	case 5: goto L_TEST06;
	case 6: goto L_TEST07;
	}
L_TEST01:
	switch(AC_RANKTEST){
	case 1:
		mes "[Gordo]";
		mes "Yo!";
		mes "Welcome to the site!";
		mes "My name is Gordo and I am in charge of your examinations.";
		mes "First of all, tell me your name.";
		next;
		EMOTION 9;
		mes "[Gordo]";
		mes ""+strcharinfo(0) + "......";
		mes "......" + strcharinfo(0) + ".";
		mes "Looks like you qualify for the first test.";
		next;
		mes "[Gordo]";
		mes "Yes, I'll explain one thing, you don't have to get defensive at the word exam.";
		mes "Because it's not much different from the requests from Lune that you've been taking on until now.";
		next;
		mes "[Gordo]";
		mes "Let me explain the exam as soon as possible.";
		mes "The Adventurer's Academy has other teachers besides me, as a matter of course.";
		next;
		mes "[Gordo]";
		mes "But most of the teachers are outside the academy, doing research on monster ecology and so on.";
		next;
		mes "[Gordo]";
		mes "And they submit their research materials to us on a regular basis, and we use them in our classes.";
		next;
		mes "[Gordo]";
		mes "So, the content of this exam is to get a research report from the Horn Study Box located in Payon Lost Forest 03.";
		next;
		mes "[Gordo]";
		mes "Oh, by the way, I think the study box is locked and some items are needed.";
		next;
		emotion 21;
		mes "[Gordo]";
		mes "But I'm sure they were all obtainable from the monsters that inhabit Payon Lost Forest 03.";
		mes "Well then, good luck!";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 98:
		emotion 0;
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Looks like you got your lab report in one piece.";
		next;
		mes "[Gordo]";
		mes "-Gordo with Professor Horn's research report -";
		next;
	case 99:
		emotion 46;
		mes "[Gordo]";
		mes "Congratulations on passing the first exam!";
		mes "All that's left is to report back to Lune.";
		mes "Good job!";
		NEXT;
		mes "^FF0000 [Mission] ^000000 - request accomplished!";
		mes "Let's go report to Mr. Lune-";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST02:
	switch(AC_RANKTEST){
	case 1:
		mes "[Gordo]";
		mes "Yo!";
		mes ""+strcharinfo(0);
		mes "I knew you'd be here by now, man.";
		mes "I'm sure you'll have an easy time clearing the second test.";
		next;
		mes "[Gordo]";
		mes "Well then, let's get right to the second test!";
		next;
		mes "[Gordo]";
		mes "I want you to get your research reports again, just like last time.";
		next;
		mes "[Gordo]";
		mes "Actually, I was going to go with something else, but Professor Poring hasn't sent me the report anytime soon. ......";
		next;
		mes "[Gordo]";
		mes "Professor Poring is supposed to be conducting research at Payon Lost Forest 04, but I wonder what happened to him. ......";
		next;
		mes "[Gordo]";
		mes "So, please get me the research report from Professor Poring.";
		next;
		mes "[Gordo]";
		mes "Ah!";
		mes "I think it's a place where strong monsters appear regularly, so be very careful, okay?";
		mes "Well then, I'm asking you.";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3: //Professor Poring requests zero pi and sticky liquid
	case 4: //Requested empty bottle
		goto L_MICHOUSA; //not investigated
	case 98:
		EMOTION 0;
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Looks like you brought the lab report without incident.";
		next;
		mes "-Gordo with Professor Poring's research report-";
		next;
	case 99:
		emotion 46;
		mes "[Gordo]";
		mes "Congratulations on passing the second exam!";
		mes "All that's left is to report back to Lune.";
		mes "Good job!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to ^FF0000Lune^000000-";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST03:
	switch(AC_RANKTEST){
	case 1:
		emotion 0;
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Isn't it!";
		mes "You're here for the third test.";
		next;
		emotion 5;
		mes "[Gordo]";
		mes "The third exam is more ......";
		mes "Oh, this one is also the one where you get the research report.";
		next;
		mes "[Gordo]";
		mes "The location is Payon Lost Forest 02.";
		mes "Is this place Professor Wolf!";
		next;
		mes "[Gordo]";
		mes "So, get the research report from Professor Wolf in Payon Lost Forest 02.";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3: //Professor Wolf bit me
	case 4: //found a jar
		goto L_MICHOUSA; //not investigated
	case 98:
		emotion 0;
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Looks like you brought the lab report without incident.";
		next;
		mes "-Gordo with Professor Wolf's research report -";
		next;
	case 99:
		emotion 46;
		mes "[Gordo]";
		mes "Congratulations on passing the third exam!";
		mes "All that's left is to report back to Lune.";
		mes "Good job!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to ^FF0000Lune^000000-";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST04:
	switch(AC_RANKTEST){
	case 1:
		emotion 0;
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Isn't it!";
		mes "You're here for the third test.";
		next;
		mes "[Gordo]";
		mes "For the fourth exam, you will walk from ^0000FFProntera^000000 to ^0000FFGeffen^000000!";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		mes "[Gordo]";
		mes "Hmm, do you want to hear the content again?";
		next;
		if(select("yes", "no")==2){
			mes "[Gordo]";
			mes "Well, good luck!";
			close;
		}
		mes "[Gordo]";
		mes "Okay.";
		mes "If you can't remember it, make a note of it.";
		next;
		mes "[Gordo]";
		mes "For the fourth test, you will walk from ^0000FFProntera^000000 to ^0000FFGeffen^000000!";
		next;
		show_mission;
		close;
	case 3: // pro west entrance
	case 4: // pro-west upper left before WP
	case 5: // mjolnir_09 WP
	case 6: // Give Professor Dragg his lunch
	case 7: // prt_fild00 WP
		EMOTION 0;
		mes "[Gordo]";
		mes "! I didn't expect you to come back in the middle of the exam ......";
		mes "Well, what you've come back to is what you're going to get.";
		mes "You'll have to take the exam again from the beginning.";
		next;
		cutin "quest_route001.bmp",3;
		mes "[Gordo]";
		mes "Are you ready?";
		mes "The test is to walk from ^0000FFProntera^000000 to ^0000FFGeffen^000000.";
		next;
		show_mission;
		next;
		mes "[Gordo]";
		mes "That means.";
		mes "Good luck!";
		close2;
		set AC_RANKTEST,2;
		end;
	case 98:
		emotion 0;
		mes "[Gordo]";
		mes "Oh!";
		mes ""+strcharinfo(0);
		mes "You're back in one piece.";
		next;
		mes "[Gordo]";
		mes "Looks like you made sure to give Dr. Drapp his lunch.";
		next;
	case 99:
		EMOTION 46;
		mes "[Gordo]";
		mes "So it is,";
		mes strcharinfo(0);
		mes "Congratulations on passing the fourth test!";
		mes "Now all we have to do is report it to Lune and we're done!";
		next;
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to ^FF0000Lune^000000-";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST05:
	switch(AC_RANKTEST){
	case 1:
		mes "[Gordo]";
		mes "Yo!";
		mes ""+strcharinfo(0) + "!";
		mes "Well, it's early days, and it's already the fifth exam.";
		mes "This exam is more ......";
		mes "Hmm, it looks like another exam where you have to get a research report.";
		next;
		mes "[Gordo]";
		mes "Now, as for the details, I would like you to get the research report from the Horn Study Box located at Mjolnir 09.";
		next;
		mes "[Gordo]";
		mes "The box containing the Professor Horn research reports is always locked.";
		mes "As I recall, you needed a cipher to open the one in this place: ......";
		next;
		mes "[Gordo]";
		mes "I think the cipher was hinted at by pressing the button on the post, but I forget the details.";
		next;
		mes "[Gordo]";
		mes "Well, I'd like you to head there anyway.";
		mes "I might be able to find out more if I check the area.";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3:
	case 4:
	case 5:
	case 6:
		goto L_MICHOUSA; //not investigated
	case 98:
		emotion 0;
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Looks like you brought the lab report without incident.";
		next;
		mes "[Gordo]";
		mes "-Gordo with Professor Horn's research report -";
		next;
	case 99:
		emotion 46;
		mes "[Gordo]";
		mes "Congratulations on passing the fifth exam!";
		mes "All that's left is to report back to Lune.";
		mes "Good job!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to Mr. Lune-";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST06:
	switch(AC_RANKTEST){
	case 1:
		mes "[Gordo]";
		mes "You're here!";
		mes ""+strcharinfo(0);
		mes "The sixth exam is quite a difficult one!";
		next;
		mes "[Gordo]";
		mes "Remember Professor Horn, whose name has come up a few times now?";
		mes "He has an unusual curiosity and seriousness about his research.";
		next;
		mes "[Gordo]";
		mes "So he goes everywhere without thinking about the consequences, even in places he doesn't know, even in places he knows are dangerous.";
		next;
		mes "[Gordo]";
		mes "That's how he gets lost on a regular basis!";
		mes "And maybe, because he often pushes himself to keep going, he is often dying when we find him. ......";
		next;
		mes "[Gordo]";
		mes "Frankly, unless you're a full-fledged adventurer, you'll have a hard time finding him.";
		mes "But!";
		mes "On the contrary!";
		next;
		mes "[Gordo]";
		mes "If you can find him, it is no exaggeration to say that you are a full-fledged adventurer.";
		next;
		mes "[Gordo]";
		mes "That's how it is!";
		mes "This time the test is to find Professor Horn and give him the milk!";
		next;
		mes "[Gordo]";
		mes "By the way, delivering the milk will be an important mission too, okay?";
		mes "Get the milk from the school salesman.";
		mes "It's also basic for adventurers to get what they ask for and deliver it well.";
		next;
		mes "[Gordo]";
		mes "So, you'd better get going!";
		mes "I would say that there is too little information, but this would not narrow down the places to look for.";
		next;
		mes "[Gordo]";
		mes "I'll give you one hint.";
		mes "We have received information that Professor Horn has been seen in Payon Lost Forest 08.";
		mes "If we find him and give him the milk, he will pass the sixth test.";
		next;
		mes "[Gordo]";
		mes "This information is a little out of date, and I'll have to go and see if he is there now.";
		next;
		mes "[Gordo]";
		mes "Well, take care and go tell them.";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3:
		mes "[Gordo]";
		mes "I see.";
		mes "You met Professor Horong.";
		mes "Good luck finding Professor Horn and giving him the milk, okay?";
		NEXT;
		mes "^FF0000 [Mission] ^000000-^FF0000Find Professor Horn^000000 and give him milk-";
		mes "-^0000FFMjolnir Mountains 06^000000According to reports, Professor Horn has been seen in the rear of the mountain range near ^0000FFMjolnir Mountains 06^000000.";
		mes " ^0000FFMjolnir Mountains 06^000000 is closer if you head from ^0000FFGeffen^000000-";
		close;
	case 4:
		mes "[Gordo]";
		mes "You met Professor Beetle.";
		mes "The back of your head looks just like Professor Horn's, you know.";
		mes "You can't blame me for making a mistake.";
		next;
		mes "^FF0000[mission]^000000-^FF0000Find Professor Horn^000000 and give him milk-";
		mes "-^FF0000Professor Horn^000000 is reportedly headed to ^0000FFSograt Desert 18^000000.";
		mes "^0000FFSograt Desert 18^000000 is closer if you head from ^0000FFMorroc^000000-";
		close;
	case 98:
		EMOTION 0;
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Welcome back!";
		mes "Did you meet Professor Horn safely?";
		next;
		mes "-Gordo with a note from Professor Horn-";
		next;
		mes "[Gordo]";
		mes "I see.";
		mes strcharinfo(0) + "is";
		mes "You saved Professor Horn's life.";
		mes "So if you hadn't taken the test this time, his life would not have been ......";
		next;
		mes "[Gordo]";
		mes "Let me thank you too, thank you!";
		mes "Of course you passed the exam without question!";
		mes "Good luck on the next exam, okay?";
		mes "Then go report to Lune!";
		next;
		mes "^FF0000 [Mission] ^000000 - request accomplished!";
		mes "Let's go report to Mr. Lune-";
		close2;
		set AC_RANKTEST,99;
		end;
	case 99: //What's the difference between [mission] and [request accomplished]?
		mes "[Gordo]";
		mes "Let me thank you for that one, thank you!";
		mes "Of course you passed the exam without question!";
		mes "Good luck on the next exam, okay?";
		mes "Then go report to Lune!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to Mr. Lune-";
		close;
	}
L_TEST07:
	switch(AC_RANKTEST){
	case 1:
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "Finally, the seventh test.";
		mes "If you pass this, you will have completed the first stage of the Adventurer Academy!";
		next;
		mes "[Gordo]";
		mes "As befits a final exam, it's harder than anything you've ever done before.";
		mes "Take it with care.";
		next;
		mes "[Gordo]";
		mes "Now then, let me explain to you what the exam is all about.";
		next;
		L_REP07:
		cutin "quest_route002.bmp",3;
		//Prontera6 map move from Morroc before Morroc collapsed
		mes "[Gordo]";
		mes "This time the content is to reach Prontera from Payon on foot.";
		next;
		mes "[Gordo]";
		mes "But this is just a simple test.";
		mes "So, I want you to go through the places I specify and get pictures, items, etc. along the way.";
		next;
		mes "[Gordo]";
		mes "The first is to come and get water from Lake Chunlim.";
		mes "And the second is to go and take pictures of the designated places.";
		mes "The third is to go and get some grass.";
		next;
		mes "[Gordo]";
		mes "By the way, you can get everything you just asked for on your way from Payon to Prontera.";
		next;
		mes "[Gordo]";
		mes "I'm going to detail them one by one.";
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		mes "[Gordo]";
		mes "Hmm, do you want to hear the content again?";
		next;
		if(select("yes", "no")==2){
			mes "[Gordo]";
			mes "Well, good luck!";
			close;
		}
		mes "[Gordo]";
		mes "Okay.";
		mes "If you can't remember it, make a note of it.";
		next;
		goto L_REP07;
	case 3: // get water from Janik
	case 4: // caught by bandits
	case 5: // ask the location of the package
	case 6: // luggage is recovered
	case 7: // Automatic conversation before WP
	case 8: // Take pictures of the ruins
	case 9: // automatic conversation before WP
	case 10: // Talk to Dr. Michelin
	case 11: // Picking weeds
	case 12: // Pollin comes out of the bushes (optional)
	case 13: // Ask Dr. Michelin to cast a spell
	case 14: // automatic conversation before WP
	case 15: // automatic conversation before WP
	case 16: // automatic conversation at pro-west entrance
		EMOTION 18;
		mes "[Gordo]";
		mes "I can't believe I'm back in the middle of an exam. ......";
		mes "Well, what you've come back for is what you're going to get.";
		mes "You'll have to take the exam again from the beginning.";
		next;
		mes "[Gordo]";
		mes "We're going to go over it again in more detail.";
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 98:
		emotion 0;
		mes "[Gordo]";
		mes "Oh!";
		mes ""+strcharinfo(0) + "Not!";
		mes "It's been a long time and I was worried about you, but I'm glad you're back safe and sound like this.";
		next;
		mes "[Gordo]";
		mes "Did you bring the specified items?";
		next;
		mes "-Gordo was given ^006600 purified water from Lake Chunlim^000000 and ^006600 enchanted grass^000000-";
		next;
		mes "[Gordo]";
		mes "Oh! I've certainly checked it out.";
		next;
	case 99:
		mes "[Gordo]";
		mes ""+strcharinfo(0);
		mes "You've really grown up.";
		mes "You are a full-fledged adventurer when you pass this exam!";
		next;
		mes "[Gordo]";
		mes "Then report to Lune as usual.";
		mes "Keep up the good work!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to Mr. Lune-";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_MICHOUSA: //To go here for unsurveyed
L_REPEAT:
	mes "[Gordo]";
	mes "Hmm, do you want to hear the content again?";
	next;
	if(select("yes", "no")==2){
		mes "[Gordo]";
		mes "Well, good luck!";
		close;
	}
	mes "[Gordo]";
	mes "Okay.";
	mes "If you can't remember it, make a note of it.";
	next;
	show_mission;
	next;
	mes "[Gordo]";
	mes "That means.";
	mes "Good luck!";
	close;
L_OTHER:
	switch(AC_RANK){
	case 0:
		mes "[Gordo]";
		mes "My name is Gordo and I'm in charge of your exams.";
		next;
		mes "[Gordo]";
		mes "In order to take the exam, I need to earn credits by doing some of Lune's requests.";
		mes "Once you have earned your credits and completed the exam procedures at Lune, come see me again!";
		next;
		mes "[Gordo]";
		mes "I'll be waiting for you!";
		close;
	case 1:
		mes "[Gordo]";
		mes "Congratulations on passing the first test!";
		close;
	case 2: mes "[Gordo]";
		mes "Congratulations on passing the second exam!";
		close;
	case 3: mes "[Gordo]";
		mes "Congratulations on passing the third exam!";
		close;
	case 4:
		mes "[Gordo]";
		mes "Congratulations on passing the fourth test!";
		close;
	case 5:
		mes "[Gordo]";
		mes "Congratulations on passing the fifth exam!";
		close;
	case 6:
		mes "[Gordo]";
		mes "Congratulations on passing the sixth exam!";
		close;
	case 7: case 8:
		emotion 18;
		mes "[Gordo]";
		mes "Yo!";
		mes ""+strcharinfo(0);
		mes "I miss the days when you were a chick.";
		close;
	}
	end;

OnInit:
	waitingroom "exam", 0;
	end;

	function show_mission {
		switch(AC_RANK){
		case 0:
			mes "^FF0000 [Mission] ^000000^0000FFPayon the ^FF0000Horn Study Box^000000 in the Lost Forest 03^000000 to get the ^006600 research report^000000.";
			mes " -^0000FFPayon You can get to the Lost Forest 03^000000 from ^0000FFAlberta^000000-";
			break;
		case 1: mes "^FF0000 [Mission] ^000000";
			mes "-^0000FFPayon I will get the ^006600 research report^000000 from ^FF0000Professor Poring^000000 in the Lost Forest 04^000000-";
			mes " -^0000FFPayon I can get to the Lost Forest 04^000000 from ^0000FFProntera^000000-";
			break;
		case 2: mes "^FF0000[mission]^000000";
			mes "-^0000FFPayon I will get the ^006600 research report^000000 from ^FF0000Professor Wolf^000000 in the lost forest 02^000000-";
			mes " -^0000FFPayon I can get to the Lost Forest 02^000000 from ^0000FFPayon^000000-";
			break;
		case 3:
			mes "[Gordo]";
			mes "As an adventurer, it is very important to walk the world with your feet.";
			mes "So that's what you're going to learn here.";
			next;
			cutin "quest_route001.bmp",3;
			mes "[Gordo]";
			mes "Later, go give this, lunchbox to Mr. Drapp^000000, who is near ^0000FFProntera field 00 (163,244)^000000 on the way ^0000FFProntera field 00 (163,244)^000000 and get him to sign for it.";
			next;
			mes "[Gordo]";
			mes "The exam will be passed when you have done what I have just described and reached Geffen!";
			mes "But if you don't have the specified item or if you don't come through the specified route";
			next;
			mes "[Gordo]";
			mes "The exam will fail, and everything will have to be redone.";
			mes "And later, if you talk to me before you finish everything, you'll have to start over as well, because you'll have to start over.";
			mes "Good luck then!";
			next;
			mes "^FF0000 [Mission] ^000000 - through the specified route while completing the specified content - from ^0000FFProntera^000000 to ^0000FFGeffen^000000 -";
			break; 
		case 4:
			mes "^FF0000 [Mission] ^000000-^0000FFMjolnir Mountains 09^000000-^FF0000 research report ^000000 from the ^006600Horn Study Box^000000 located at ^000000.";
			mes " -^0000FFMjolnir Mountains 09^000000 can be reached from ^0000FFProntera^000000-";
			break;
		case 5:
			mes "^FF0000[Mission] ^000000-^FF0000Find Professor Horn^000000 and give him the milk-";
			mes "-^0000FFPayonLost Forest 08^000000, there is a report that he was seen in the lost forest 08^000000, let's check this place first^0000FFPayonLost Forest 08^000000, you can go from ^0000FFPayon^000000, it's close to there. -";
			break;
		case 6: 
			mes "Around the northeast of ^0000FF Chunlim Lake^000000 there is a man named Janik^000000, a ^FF0000 peddler.";
			mes "If you tell him that I asked you for ^006600 purified water from Lake Chunlim^000000, he will give it to you.";
			next;
			mes "[Gordo]";
			mes "The second detailed explanation.";
			mes "Go photograph the stone ruins on the hill south of ^006600Sograt Desert01^000000.";
			next;
			mes "[Gordo]";
			mes "Then a third, more detailed description.";
			mes "I want you to talk to ^FF0000 Dr. Michelin^000000 near the oasis in ^0000FFProntera Field 09^000000 and get ^006600 enchanted grass^000000.";
			next;
			mes "[Gordo]";
			mes "The exam will be passed when you have done everything I have just explained and reached Prontera ^FF0000 from the west ^000000!";
			mes "However, if you do not have the specified item or if you do not come through the specified route";
			next;
			mes "[Gordo]";
			mes "The exam will fail, and everything will have to be redone.";
			mes "And later, if you talk to me before you finish everything, you'll have to start over as well, because you'll have to start over.";
			mes "Good luck then!";
			next;
			mes "^FF0000 [Mission] ^000000 - through the specified route while completing the specified content - ^0000FFPayon^000000 to ^0000FFProntera^000000 -";
			break;
		}
		return;
	}
}

// Course 1 --------------------------------------------------------

// Display the location on the minimap (ID:20~) yellow 0xFFFFFF00

pay_fild03.gat,209,141,4	script	Signboard	835,{
	mes "-Northwest= toward Prontera -North= toward Payon -East= toward Alberta -West= toward Morroc";
	close;
}
pay_fild03.gat,209,143,4	script	Horn Study Box	888,{
	if(AC_RANK || AC_RANKTEST!=2){
		mes "-Adventurer Academy Horn Study Box \"Don't put garbage in it!";
		mes " From everyone's Professor Horn\" written -";
		close;
	}
	if(AC_RANKTEST==98) goto L_FIN;
	mes "[Horn Study Box]";
	mes " -To open this box, you need 1 clover and 1 tree root-";
	next;
	if(countitem(705)>0 && countitem(902)>0){
		mes "[" + strcharinfo(0) + "]";
		mes "The items are all here, but what should we do?";
		next;
		if(select("throw in the post", "stop")==2) {
			mes "[" + strcharinfo(0) + "]";
			mes "Let's stop ......";
			close;
		} else {
			mes "-rattle ......";
			mes "-don't-don't-don't-don't ......";
			mes " Something that looks like a thick notebook came out from inside-";
			next;
			L_FIN:
			mes "[" + strcharinfo(0) + "]";
			mes "You've got it in one piece.";
			mes "Let's go back to the Adventurer Academy.";
			next;
			mes "^FF0000 [Mission] ^000000-Give Gordo at the Adventurers' Academy the Horn's research papers.";
			close2;
			set AC_RANKTEST,98;
			end;
		}
	} else {
		mes "[" + strcharinfo(0) + "]";
		mes "Looks like you are missing an item.";
		close;
	}
}
// 2nd course --------------------------------------------------------

// Display the location on the minimap (ID:20~) yellow 0xFFFFFF00

pay_fild04.gat,350,330,4	script	#AC_PORING	1002,{}
pay_fild04.gat,350,329,4	script	Professor Poring	111,{
	if(AC_RANK!=1 || AC_RANKTEST<2){
		mes "[Professor Poring]";
		mes "I'm so hungry. ......";
		close;
	}
	switch(AC_RANKTEST){
	case 2:goto L_TEST01;
	case 3:goto L_TEST02;
	case 4:goto L_TEST03;
	case 98:goto L_TEST04;
	}
L_TEST01:
	emotion 28, "#AC_PORING";
	mes "[Professor Poring]";
	mes "I'm hungry......";
	mes "I'm hungry!";
	mes "I'm hungry ～～～～～～～～～!!!";
	next;
	set '@dummy,select("Are you Professor Poring?") ;
	emotion 1, "#AC_PORING";
	mes "[Professor Poring]";
	mes "Hmm?";
	mes "How am I Professor Poring?";
	mes "What can I do for you?";
	mes "And I'm very hungry, by the way.";
	next;
	set '@dummy,select("explain the situation");
	mes "[Professor Poring]";
	mes "A research report! I'm hungry and facing a life-threatening situation!";
	mes "If you want the report, bring me food!";
	next;
	mes "[Professor Poring]";
	mes "[Professor Poring]";
	mes "I guess so.";
	mes "About 10 Xerpees and 5 sticky liquids, that should fill you up!";
	NEXT;
	mes "[Professor Poring]";
	mes "I can get these two from Poring and Drops, who are all over the place.";
	next;
	set '@dummy,select("That's cannibalism. ......");
	mes "[Professor Poring]";
	mes "That's cannibalism! Yeah, cannibalism!";
	mes "But I'm putting my life first!";
	mes "So please take care of me.";
	next;
	L_TEST01_REP:
	mes "^FF0000[Mission] ^000000-^006600 zero-pee^00000010 pieces and ^006600 sticky liquid^000000 5 pieces and give them to ^FF0000Professor Poring^000000 -";
	mes " -These two items can be obtained from Drops and Pollin-";
	close2;
	set AC_RANKTEST,3;
	end;
L_TEST02:
	emotion 0, "#AC_PORING";
	mes "[Professor Poring]";
	mes "Ah! You!";
	mes "Did you bring me a collection of 10 Xerpies and 5 sticky liquids?";
	next;
	if(countitem(909)<10 || countitem(938)<5){
		mes "[Professor Poring]";
		mes "What, you don't have it!";
		mes "Bring it to me as soon as you can!";
		next;
		goto L_TEST01_REP;
	}
	mes "[Professor Poring]";
	mes "Oh, you have it!";
	mes "Give it to me quickly!";
	next;
	if(select("yes", "no")==2){
		emotion 7, "#AC_PORING";
		mes "[Professor Poring]";
		mes "Sticky Sticky Sticky Sticky!!!";
		close;
	}
	emotion 15, "#AC_PORING";
	mes "[Professor Poring]";
	mes "Wow! Thank you!!! ......";
	mes "............";
	mes "Hey, you!";
	mes "You're missing something!";
	next;
	mes "[Professor Poring]";
	mes "How am I supposed to drink the sticky liquid like this!";
	mes "You should at least be smart enough to bring an empty bottle!";
	mes "Totally.";
	next;
	mes "^FF0000 [Mission] ^000000-^006600 Get one empty bottle^000000 and give it to ^FF0000Professor Poring^000000-";
	mes " -This item can be obtained from Drops or Poring-";
	close2;
	set AC_RANKTEST,4;
	end;
L_TEST03:
	mes "[Professor Poring]";
	mes "I hope you brought the empty bottle with you?";
	next;
	if(countitem(713)<1){
		mes "[Professor Poring]";
		mes "What, you don't have it!";
		mes "Bring it to me as soon as you can!";
		close;
	}
	mes "[Professor Poring]";
	mes "Oh, you have it!";
	mes "Give it to me quickly!";
	next;
	if(select("yes", "no")==2){
		emotion 7, "#AC_PORING";
		mes "[Professor Poring]";
		mes "Mukkah!";
		mes "What a horrible person to just show off!";
		close;
	}
	mes "[Professor Poring]";
	mes "You're actually a pretty nice guy, aren't you?";
	mes "Thank you.";
	next;
	mes "-punch, crunch, munch munch munch munch munch munch munch munch munch munch gobble-";
	next;
	mes "[Professor Poring]";
	mes "Whew.";
	mes "That was delicious!";
	mes "I'll never forget you!";
	mes "I'll return the empty bottle even though it got dirty.";
	mes "Bye!";
	next;
	set '@dummy,select("Um, the research report...");
	emotion 17, "#AC_PORING";
	mes "[Professor Poring]";
	mes "!";
	mes "Oh, sorry, sorry.";
	mes "I totally forgot!";
	mes "Make sure you deliver.";
	next;
	L_TEST03_REP:
	mes "^FF0000 [Mission] ^000000-Give ^FF0000Gordo^000000 at the Adventurers Academy ^000000 the ^006600 research report ^000000-";
	close2;
	set AC_RANKTEST,98;
	end;
L_TEST04:
	mes "[Professor Poring]";
	mes "Oh!";
	mes "Thanks for the food!";
	mes "I think you should bring back the research report as soon as possible.";
	next;
	goto L_TEST03_REP;
}
// Course 3 --------------------------------------------------------

// Display the location on the minimap (ID:20~) Yellow 0xFFFFFF00

pay_fild02.gat,105,242,4	script	#AC_WOLF	1107,{}
pay_fild02.gat,105,241,4	script	Professor Wolf	111,{
	if(AC_RANK!=2 || AC_RANKTEST<2){
		mes "[Professor Wolf]";
		mes "Zzzzz ......";
		close;
	}
	switch(AC_RANKTEST){
	case 2:
		emotion 36, "#AC_WOLF";
		mes "[Professor Wolf]";
		mes "Woooooooowwww!";
		mes "gulp";
		next;
		set '@dummy,select("It was");
		mes "-Professor Wolf bit me-";
		next;
		set '@dummy,select("What are you doing!") ;
		emotion 0, "#AC_WOLF";
		mes "[Professor Wolf]";
		mes "! Huh?";
		mes "Oh, I'm sorry.";
		mes "I thought it was them.";
		next;
		set '@dummy,select("They?") ;
		mes "[Professor Wolf]";
		mes "Yeah, the Wolves that live around here.";
		mes "We had a fight earlier.";
		mes "I thought those guys might have come back.";
		mes "What about you, by the way?";
		next;
		set '@dummy,select("explain the situation");
		mes "[Professor Wolf]";
		mes "Research report or ......";
		mes "I totally forgot about that.";
		mes "I must have put it away in this box.";
		mes "Hold on a second while I get it out.";
		next;
		mes "-Professor Wolf puts his hand on the box and chants something.";
		mes " But nothing happened-";
		next;
		mes "[Professor Wolf]";
		mes "Huh?";
		mes "Oops...";
		mes "This should empty the box. ......";
		mes "......";
		mes "Ah!";
		mes "Okay. ......";
		next;
		mes "[Professor Wolf]";
		mes "Because I hurt my hand in a fight earlier. ......";
		mes "I'm sorry, but I can't open it until the wound heals.";
		next;
		set '@dummy,select("Can you manage?") ;
		emotion 0, "#AC_WOLF";
		mes "[Professor Wolf]";
		mes "umm ......";
		mes "Ah! Yes!!! That meat should heal that wound in no time!";
		mes "Uh, I have some meat marinated in a special sauce for this kind of thing.";
		next;
		mes "[Professor Wolf]";
		mes "As long as you eat that, you should be able to open it.";
		mes "If I walk out now, I'm sure we'll get into another fight.";
		mes "I'm sorry, but could you go get it for me?";
		next;
		set '@dummy,select("Okay");
		mes "[Professor Wolf]";
		mes "Oh, that's a big help!";
		mes "I think it was around ^0000FF (129,186)^000000 on this map.";
		mes "I'll mark it for GHOST.";
		next;
		L_REP:
		mes "^FF0000 [Mission] ^000000-^006600Get meat ^000000 marinated in special sauce and deliver it to Professor Wolf-";
		close2;
		viewpoint 1,129,186,20,0xFFFFFF00;
		set AC_RANKTEST,3;
		end;
	case 3:
	case 4:
		mes "[Professor Wolf]";
		mes "Oh, did you bring the welcome home meat?";
		next;
		if(AC_RANKTEST!=4){
			mes "[Professor Wolf]";
			mes "You haven't brought it yet.";
			mes "I'll be waiting here, please.";
			next;
			goto L_REP;
		}
		mes "[Professor Wolf]";
		mes "Kung Kung This Smell!";
		mes "I'm so glad you brought it!";
		mes "Thank you!";
		next;
		set '@dummy,select("pass meat");
		mes "[Professor Wolf]";
		mes "-bakbakbakbak, bakbakbakbakbakgebut-";
		next;
		misceffect 77, "#AC_WOLF";
		emotion 54, "#AC_WOLF";
		mes "[Professor Wolf]";
		mes "That was delicious!!!";
		mes "You've given me a lot of strength!";
		mes "This should empty the box.";
		next;
		mes "-Professor Wolf puts his hand on the box and chants something.";
		mes "Pucker-";
		next;
		mes "[Professor Wolf]";
		mes "Alright.";
		mes "Now I'm free - here's the research report.";
		next;
		mes "[Professor Wolf]";
		mes "Well, have a safe trip home.";
		L_REP2:
		mes "Thanks for bringing the meat!";
		next;
		mes "^FF0000 [Mission] ^000000-Give ^FF0000Gordo^000000 at the Adventurer's Academy the ^006600 Research Report^000000-";
		close2;
		set AC_RANKTEST,98;
		end;
	case 98:
		mes "[Professor Wolf]";
		goto L_REP2;
	}
}
pay_fild02.gat,129,186,0	script	Digging Marks#ACTEST03	111,{
	mes "-there is an after like digging-"; //Afterwards as in the main mackerel
	if(AC_RANK!=2 || (AC_RANKTEST!=3 && AC_RANKTEST!=4)) close;
	next;
	if(AC_RANKTEST==4){
		mes "[" + strcharinfo(0) + "]";
		mes "I don't think we need any more meat.";
		next;
		goto L_REP;
	}
	set '@dummy,select("Let's dig");
	mes "-When you dig, a jar will come out from inside, and inside the jar is pickled meat-";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "I'm pretty sure this is Professor Wolf's pickled meat.";
	mes "Let's take one.";
	next;
	mes "-I took one of the meats and re-filled the jar-";
	next;
L_REP:
	mes "^FF0000 [Mission] ^000000-^FF0000Deliver meat to Professor Wolf^000000-";
	close2;
	viewpoint 1,105,242,20,0xFFFFFF00;
	set AC_RANKTEST,4;
	end;
}
// Course 4 --------------------------------------------------------

// Display the location on the minimap (ID:20~) yellow 0xFFFFFF00


// Walking quest route touch

//prt_fild05.gat,367,205,0	script	AC_TEST04#ROUTE01	139,1,1,{ //touch in pro west
// if(AC_RANK!=3 || AC_RANKTEST!=2) end;
// viewpoint 1,105,381,20,0xFFFFFF00;
// mes "[" + strcharinfo(0) + "]";
// mes "Gordo goes from ^0000FFProntera^000000 to ^0000FFGeffen^000000";
// mes "Did I mention walking?";
// mes "On the way ^FF0000 Dr. Drapp^000000 your lunch"; // mes "I'll take your lunch to ^FF0000 Dr. Drapp^000000.
// mes "I have to give it to him.";
// mes "Let's walk ^FF0000northwest^000000 first.";
// close2;
// set AC_RANKTEST,3; // flag update
// end;
//}
prt_fild05.gat,105,372,0	script	AC_TEST04#ROUTE02	139,5,4,{ //Touch before pro west upper left WP
	if(AC_RANK!=3 || AC_RANKTEST!=3) end;
	mes "[" + strcharinfo(0) + "]";
	mes "We still have a long way to go.";
	mes "Good luck ......";
	close2;
	set AC_RANKTEST,4; //flag update
	end;
}
prt_fild05.gat,292,377,0	script	AC_TEST04#ROUTE03	139,5,5,{ //Touch before pro west upper right WP
	if(AC_RANK!=3 || AC_RANKTEST!=3) end;
	viewpoint 1,105,381,20,0xFFFFFF00;
	mes "[" + strcharinfo(0) + "]";
	mes "Huh?";
	mes "Did I go to the wrong destination?";
	mes " -It seems that with the route Gordo told me to take, I need to head ^0000FF west more ^0000FF north-";
	close2;
	end;
}
mjolnir_09.gat,37,244,0	script	AC_TEST04#ROUTE04	139,5,5,{ //Touch before pro ←↑ ← warp
	if(AC_RANK!=3 || AC_RANKTEST!=4) end;
	mes "[" + strcharinfo(0) + "]";
	mes "I believe the next place is where Professor Dragg is.";
	mes "Let's move on.";
	close2;
	set AC_RANKTEST,5; //flag update
	end;
}
prt_fild00.gat,152,250,0	script	Professor Dragg	139,4,4,{
// Gordo says drupe, but
// Drabb seems to be correct. (It's in the Secret Story)
// Gordo must just be wrong because it won't be corrected: ......

	if(AC_RANK!=3 || (AC_RANKTEST!=5 && AC_RANKTEST!=6)) end;
	if(AC_RANKTEST==5){
		mes "[Professor Dragg]";
		mes "Survey -, survey -";
		mes "I'm going to investigate in the hole today.";
		mes "Such, the students are enraptured by me ~ and me smiling ~ and the students faint ~";
		next;
		set '@dummy,select("Dr. Gordo gave me this ......");
		mes "[Professor Dragg]";
		mes "Oh! Gordo's got it!";
		mes "I was dying of hunger, so I guess it's called good timing.";
		mes "Throw my lunch in the hole!";
		mes " -threw the lunch box down the hole-";
		next;
		set '@dummy,select("Um, sign ......");
		mes "[Professor Dragg]";
		mes "Sign! Oh, come on, I'm not that famous!";
		mes "(Heh, when did I become popular too?)";
		next;
		mes "[Professor Dragg]";
		mes "Well, well, if you insist that much, I'll give you my autograph.";
		mes "Take good care of it.";
		mes " -Gordo gave me a piece of paper to sign-";
		next;
		mes "[Professor Dragg]";
		mes "I guess I'll have my lunch then.";
		next;
		L_REP:
		mes "[" + strcharinfo(0) + "]";
		mes "(I got a signature from Professor Dragg.";
		mes "Let's head to ^FF0000Geffen^000000!";
		close2;
		viewpoint 1,18,129,20,0xFFFFFF00;
		set AC_RANKTEST,6; //flag update
		end;
	} else {
		mes "[Professor Dragg]";
		mes "Thanks for the lunch!";
		mes "Bye!";
		next;
		goto L_REP;
	}
}
prt_fild00.gat,28,124,0	script	AC_TEST04#ROUTE05	139,5,5,{
	if(AC_RANK!=3 || AC_RANKTEST<5 || AC_RANKTEST>6) end;
	//Confirm that you gave me my lunch
	if(AC_RANKTEST==5){
		//not researched Forgot to take a picture. But it looked like this
		mes "[" + strcharinfo(0) + "]";
		mes "I have to give Professor Dragg his lunch.";
		close2;
		viewpoint 1,152,250,20,0xFFFFFF00;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "We're almost there Geffen!";
	close2;
	set AC_RANKTEST,7; //flag update
	end;
}
geffen.gat,213,119,0	script	AC_TEST04#ROUTE06	139,1,1,{
	if(AC_RANK!=3 || AC_RANKTEST!=7) end;
	mes "We're safely in Geffen!";
	mes "Let's report to Mr. Gordo!";
	close2;
	set AC_RANKTEST,98; //flag update
	end;
}

// Course 5 --------------------------------------------------------

// Display the location on the minimap (ID:20~) yellow 0xFFFFFF00

mjolnir_09.gat,100,365,4	script	Horn Study Box	888,{
	if(AC_RANK!=4 || AC_RANKTEST<2){
		mes "-a mysterious word is written-";
		close;
	}
	switch(AC_RANKTEST){
	case 2:
		mes "[Horn Study Box]";
		mes " -Please enter the first cipher-";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "It said that the hint would appear when you press the button.";
		mes "Where is the button ......";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "......";
		mes "Whoa! Looks like this is the button.";
		mes "Let's press ......";
		next;
		mes "-rattle rattle rattle rattle, looks like a sheet of paper came out-";
		next;
		mes "-Angoha zenbu demitsubetenuurikusuku kotode, kenkyuho kokusho wo niiirukottegadekimasu-";
		next;
		mes "[" + strcharinfo(0) + "]";
		L_REP: //This is a strange place to repeat, but it is as in the main mackerel.
		mes "Apparently there are three ciphers.";
		mes "I see that the location of the ciphers is also written.";
		mes "Let's go to the cipher from the first one for now.";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "The location of the first cipher is ......";
		mes "That's the coordinates (284,354) on this map.";
		next;
		mes "^FF0000 [Mission] ^000000- look up the first cipher-";
		mes " -^0000FF Mulnir Mountains 09 (284,345)^000000-";
		close2;
		viewpoint 1,284,345,20,0xFFFFFF00;
		set AC_RANKTEST,3;
		end;
	case 3:
		mes " ";
		goto L_REP;
	case 4://not yet surveyed
		mes "[" + strcharinfo(0) + "]";
		mes "Apparently there are three ciphers.";
		mes "You've also written the location of the ciphers.";
		mes "The first cipher was ^006600Professor Horn was a manly ^000000.";
		mes "Let's go check the second one.";
		next;
	case 5:
		mes "[" + strcharinfo(0) + "]";
		mes "Apparently there are three ciphers.";
		mes "You've also written the location of the ciphers.";
		mes "The second cipher was ^006600Professor Horn was rich ^000000.";
		mes "Let's go check the third one.";
		next;
	case 6:
		mes "[Horn Study Box]";
		mes " -Enter the first cipher-";
		next;
		input '@dummy$;
		if('@dummy$!="Professor Horn is a manly man") goto L_INPERR;
		mes "[Horn Study Box]";
		mes " -Enter the second cipher-";
		next;
		input '@dummy$;
		if('@dummy$!="Professor Horn is rich") goto L_INPERR;
		mes "[Horn Study Box]";
		mes " -Enter the third cipher-";
		next;
		input '@dummy$;
		if('@dummy$!="Professor Horn is a great genius") goto L_INPERR;
		mes "-rattle ......";
		mes "-don-don-don ......";
		mes " Something that looks like a thick notebook came out from inside-";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "It's a research report.";
		mes "You've got it all in one piece.";
		mes "Let's go back to the Adventurer Academy.";
		next;
		mes "^FF0000 [Mission] ^000000-Give Gordo at the Adventurers' Academy the Horn's research papers.";
		close2;
		set AC_RANKTEST,98;
		end;
	}
L_INPERR:
	mes "[Horn Study Box]";
	mes "[Wrong cipher]";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "I think I made a mistake in entering the cipher.";
	mes "Let's check and enter it again.";
	close;
}
mjolnir_09.gat,284,345,4	script	Signboard#ACTEST501	858,{
	if(AC_RANK!=4 || (AC_RANKTEST!=3 && AC_RANKTEST!=4)){
		mes "-Signboard has a mysterious word written on it-";
		close;
	}
	if(AC_RANKTEST==4) goto L_REP;
	mes "-Signboard says ^006600Professor Horn is a manly man ^000000-";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "Nothing else is written.";
	mes "Apparently this is the cipher ......";
	next;
	L_REP:
	mes "[" + strcharinfo(0) + "]";
	mes "^006600Professor Horn is manly ^000000 or ......";
	mes "In the meantime, let's look at other places.";
	mes "Next coordinates are ......";
	mes "(309.282).";
	next; // period is right...
	mes "^FF0000 [Mission] ^000000 - Examine the second cipher -";
	close2;
	viewpoint 1,309,282,20,0xFFFFFF00;
	set AC_RANKTEST,4;
	end;
}
mjolnir_09.gat,309,282,4	script	Signboard#ACTEST502	858,{
	if(AC_RANK!=4 || (AC_RANKTEST!=4 && AC_RANKTEST!=5)){
		mes "-Signboard has a mysterious word written on it-";
		close;
	}
	if(AC_RANKTEST==5) goto L_REP;
	mes "-Signboard says ^006600Professor Horn is rich ^000000-";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "......";
	mes "Looks like this is the cipher.";
	next;
	L_REP:
	mes "[" + strcharinfo(0) + "]";
	mes "^006600Professor Horn is rich ^000000......";
	mes "Let's look at one more place.";
	mes "The next coordinate is ......";
	mes "(100,310).";
	next;
	mes "^FF0000 [Mission] ^000000 - look up the third cipher -";
	close2;
	viewpoint 1,100,310,20,0xFFFFFF00;
	set AC_RANKTEST,5;
	end;
}
mjolnir_09.gat,100,310,4	script	Signboard#ACTEST503	858,{
	if(AC_RANK!=4 || (AC_RANKTEST!=5 && AC_RANKTEST!=6)){
		mes "-Signboard has a mysterious word written on it-";
		close;
	}
	if(AC_RANKTEST==6) goto L_REP;
	mes "-Signboard says ^006600Professor Horn is a great genius ^000000-";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "......";
	mes "Looks like this is the cipher.";
	next;
	L_REP:
	//not researched The record below this point is lost... I'll just use my imagination for now.
	mes "[" + strcharinfo(0) + "]";
	mes "First, ^006600Professor Horn is handsome^000000, second, ^006600Professor Horn is rich^000000, third, ^006600Professor Horn is a great genius^000000?";
	mes "It seems that the ciphers are all here.";
	mes "Let's go type it in the research box.";
	next;
	mes "Go back to ^FF0000 [Mission] ^000000-^FF0000Horn Study Box^000000 and enter the three ciphers. -";
	close2;
	viewpoint 1,100,365,20,0xFFFFFF00;
	set AC_RANKTEST,6;
	end;
}
// Course 6 --------------------------------------------------------

// Display the location on the minimap (ID:20~) yellow 0xFFFFFF00


pay_fild08.gat,167,332,4	script	#AC_HORONG	1129,{}
pay_fild08.gat,167,331,4	script	Professor Horong	111,{
	if(AC_RANK==5 && AC_RANKTEST==3){ mes "[Professor Horong]";goto L_REP; }
	emotion 2, "#AC_HORONG";
	mes "[Professor Horong]";
	mes "hmmmmmmm..................................ummm research is hard.";
	mes "But I like the fact that it doesn't work.";
	if(AC_RANK!=5 || AC_RANKTEST!=2)close;
	next;
	set '@dummy,select("Professor Horn!") ;
	emotion 0, "#AC_HORONG";
	mes "[Professor Horong]";
	mes "!!!!? I'm so surprised!";
	mes "What is it to me?";
	next;
	set '@dummy,select("I'm here to give you some milk.") ;
	emotion 1, "#AC_HORONG";
	mes "[Professor Horong]";
	mes "???? Eh?";
	mes "They give you milk?";
	mes "But I don't like milk, so I'll just take it.";
	mes "Thank you.";
	next;
	set '@dummy,select("Need to accept it during the exam");
	emotion 0, "#AC_HORONG";
	mes "[Professor Horong]";
	mes "Examination ......?";
	mes "......";
	mes "Perhaps a sixth exam?";
	next;
	set '@dummy,select("Yes!") ;
	emotion 23,"";
	mes "[Professor Horong]";
	mes "That's not me, is it?";
	mes "You're looking for Professor Horn, right?";
	mes "I am ^FF0000Professor Horong^000000?";
	mes "I'm often mistaken for someone else...";
	next;
	set '@dummy,select("Ahhh! Sorry ......");
	mes "[Professor Horong]";
	mes "No, no, don't worry about it.";
	mes "It's more like ^FF0000Professor Horn^000000-like figure I saw just the other day.";
	mes "I wonder where it was: ......";
	mes "It was somewhere close to Geffen. ......";
	next;
	emotion 0, "#AC_HORONG";
	mes "[Professor Horong]";
	mes "Ah! Oh yes!";
	mes "As I recall, ^0000FFMjolnir Mountains 06^000000!";
	mes "I'm sure.";
	next;
	set '@dummy,select("Thank you!") ;
	mes "[Professor Horong]";
	mes "No~";
	L_REP:
	mes "I'm not certain that it's Professor Horn, you know.";
	mes "But I think that was Professor Horn in the back.";
	mes "Well, good luck with your exam.";
	next;
	mes "^FF0000 [Mission] ^000000-^FF0000Find Professor Horn^000000 and give him the milk-";
	mes "-^0000FFMjolnir Mountains 06^000000According to reports, we have seen Professor Horn's rear in the vicinity of ^0000FFMjolnir Mountains 06^000000.";
	mes " ^0000FFMjolnir Mountains 06^000000 is closer if you head from ^0000FFGeffen^000000-";
	close2;
	set AC_RANKTEST,3;
}
mjolnir_06.gat,226,183,4	script	#AC_BEETLE	1494,{}
mjolnir_06.gat,226,182,4	script	Professor Beetle	111,{
	if(AC_RANK==5 && AC_RANKTEST==4) goto L_REP;
	emotion 39, "#AC_BEETLE";
	mes "[Professor Beetle]";
	mes "Sap is the best. ......";
	mes "This exquisite sweetness is something ......";
	if(AC_RANK!=5 || AC_RANKTEST!=3) close;
	next;
	set '@dummy,select("Professor Horn?");
	emotion 57,"";
	mes "[Professor Beetle]";
	mes "Hmm?";
	mes "Are you calling for me?";
	mes "I'm Professor Beetle, though?";
	mes "He and I are often mistaken for each other because we have a similar back view.";
	next;
	set '@dummy,select("huh ......, again ......");
	emotion 2, "#AC_BEETLE";
	mes "[Professor Beetle]";
	mes "Oh dear, you seem quite depressed. ......";
	mes "What's wrong?";
	next;
	set '@dummy,select("explain the situation");
	mes "[Professor Beetle]";
	mes "I see... ......";
	mes "Sorry to hear that.";
	mes "But it's hard to live as an adventurer if you can't face many difficulties.";
	next;
	mes "[Professor Beetle]";
	mes "So, don't give up until the end, okay?";
	next;
	set '@dummy,select("Thank you.") ;
	emotion 11, "#AC_BEETLE";
	mes "[Professor Beetle]";
	mes "Looks like you're feeling a little better!";
	mes "Okay, here's something good for you!";
	mes "Actually, I actually had an actual encounter with Professor Horn just the other day.";
	next;
	set '@dummy,select("What?!") ;
	mes "[Professor Beetle]";
	mes "He said he was going to the coast near Morroc to find out what the Morroc sea breeze does to his body or something.";
	next;
	mes "[Professor Beetle]";
	mes "Speaking of the coast near Morroc, there are several places ......";
	mes "Most of the places are inhabited by dangerous monsters ......";
	mes "Considering his ability, ......";
	next;
	L_REP:
	mes "[Professor Beetle]";
	mes "Professor Horn is probably around ^0000FFSograt Desert18^000000.";
	mes "You should go there.";
	next;
	mes "^FF0000[Mission] ^000000-^FF0000Find Professor Horn^000000 and give him some milk-";
	mes "-^FF0000Professor Horn^000000 is reportedly headed to ^0000FFSograt Desert 18^000000.";
	mes "^0000FFSograt Desert 18^000000 is closer if you head from ^0000FFMorroc^000000-";
	close2;
	set AC_RANKTEST,4;
}
moc_fild18.gat,211,95,4	script	#AC_HORN	1128,{}
moc_fild18.gat,211,94,4	script	Professor Horn	111,{
	if(AC_RANK==5 && AC_RANKTEST==98) {
		mes "[Professor Horn]";
		mes "Well then, Horn will continue his research and you can go home safe and sound.";
		next; //for some reason, the big professor doesn't get it.
		mes "^FF0000 [Mission] ^000000-Report to Gordo, who is at the Adventurers Academy-";
		close; //"Gordo" is black over here, but as per the main mackerel.
	}
	if(AC_RANK!=5 || AC_RANKTEST!=4){
		mes "[??]";
		mes "The sea breeze is harsh. ......";
		close;
	}
	mes "[Professor Horn]";
	mes "Uggggg ......";
	mes "Kuk, kuru kuru kuru sea breeze seems to be bad for you ......";
	
	mes "Milk......";
	next;
	if(countitem(519)==0){
		//not researched I totally forgot about it ><
		mes "[" + strcharinfo(0) + "]";
		mes "Shit. I forgot the milk.";
		mes "Hurry up or Professor Horn will be in danger.";
		mes "Let's hurry and get some milk!";
		NEXT;
		mes "^FF0000[Mission] ^000000-^FF0000Give Professor Horn^000000 the milk-";
		close;
	}
	set '@dummy,select("Professor Horn! Milk!") ;
	emotion 0, "#AC_HORN";
	mes "[Professor Horn]";
	mes "Milk!";
	mes "This smell is milk!";
	mes "Ki, ki, kun!";
	mes "Quick give me that milk ......";
	mes " - handed the milk to Professor Horn -";
	next;
	misceffect 77, "#AC_HORN";
	mes "[Professor Horn]";
	mes "Oh, the desert and the sea breeze, it's wonderful to drink a glass of milk in this poor environment!";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "......";
	next;
	mes "[Professor Horn]";
	mes "You!";
	mes "What is your name?";
	next;
	set '@dummy,select("Identify yourself");
	mes "[Professor Horn]";
	mes ""+strcharinfo(0) + "You!";
	mes "You just witnessed an awesome moment, didn't you?";
	mes "I think you could be a little more impressed.";
	mes "You should be rather impressed!";
	next;
	set '@dummy,select("ha, ha ......");
	emotion 54,"";
	mes "[Professor Horn]";
	mes "Hmm ......";
	mes "You're not a researcher, so it's no surprise you don't understand ......";
	mes "Well, someday you will understand this emotion.";
	next;
	mes "[Professor Horn]";
	mes "Sorry, you forgot to tell me first.";
	mes "Thanks for your help.";
	mes "It would have been really close if you hadn't walked by: ......";
	next;
	set '@dummy,select("Actually ......");
	mes "[Professor Horn]";
	mes "So that's what happened, you were a student at the academy.";
	mes "......";
	mes "Perhaps you are the one who delivered the research report?";
	mes "I think we have similar names.";
	next;
	set '@dummy,select("yes");
	mes "[Professor Horn]";
	mes "Oh! I knew it!";
	mes "You've done a lot for me.";
	mes "Thank you so much.";
	mes "I'm sure you'll be a great adventurer.";
	next;
	mes "[Professor Horn]";
	mes "Oh, and if you give this to Gordo, it will be proof that you met Professor Horn.";
	mes "Well then, Professor Horn will continue his research, and you take care of yourself and go home.";
	next;
	L_REP:
	mes "^FF0000 [Mission] ^000000-Report to ^FF0000Gordo^000000, who is at the Adventurers Academy-";
	close2;
	delitem 519,1;
	set AC_RANKTEST,98;
	end;
}
// Course 7 --------------------------------------------------------

// Display the location on the minimap (ID:20~) yellow 0xFFFFFF00

// 2: contracted by Gordo
// 3: Get water from Janik
// 4: Caught by bandits
// 5: Ask for the location of the luggage
// 6: Package retrieved
// 7: Automatic conversation before WP
// 8: Take pictures of the ruins
// 9: Automatic conversation before WP
//10:Talk to Dr. Michelin
//11:Picking weeds
//12:Pollin comes out from the bush (can be omitted)
//13: Ask Dr. Michelin to cast a spell
//14:Automatic conversation before WP
//15:Automatic conversation before WP
//16:Pro West entrance automatic conversation
//98: Automatic conversation at the west exit in the pro
//99: Report to Gordo completed
pay_gld.gat,273,307,4	script	Peddler Janik	89,{
	if(AC_RANK!=6 || (AC_RANKTEST!=2 && AC_RANKTEST!=3)) {
		mes "[" + strcharinfo(0) + "]";
		mes "(Looks busy, let's not talk to him.)";
		close;
	}
	if(AC_RANKTEST==3){
		mes "[Peddler Janik]";
		mes "Yo, it's you.";
		mes "You'd better get going, huh?";
		close2;
		viewpoint 1,16,276,20,0xFFFFFF00;
		end;
	}
	mes "[Peddler Janik]";
	mes "Hello.";
	next;
	set '@dummy,select("Gordo told me");
	mes "[Peddler Janik]";
	mes "Oh wow, I missed Gordo.";
	mes "How is he?";
	next;
	set '@dummy,select("I'm fine");
	mes "[Peddler Janik]";
	mes "That's good to hear.";
	mes "By the way, if he told you to come here, doesn't that mean you have something for me?";
	mes "What does it look like?";
	next;
	set '@dummy,select("I would like to have water");
	mes "[Peddler Janik]";
	mes "Ooooh, I just found one distilled water.";
	mes "You can take this with you.";
	next;
	mes "[Peddler Janik]";
	mes "Yes, because if you go west of here, you will be in the desert, and water in the desert can be very precious.";
	mes "Bandits and such may attack you.";
	mes "Be very careful.";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "You got your water.";
	mes "Let's move on.";
	close2;
	viewpoint 1,16,276,20,0xFFFFFF00;
	set AC_RANKTEST,3;
}
// Thief, basic when spoken to
function	script	thiefFUNC#AC_TST07	{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6){
		mes "[Thief man]";
		mes "What the hell are you?";
		mes " -The man is staring at us-";
		close;
	}
	mes "[bandit man]";
	mes "You son of a bitch!";
	mes "You got away with it!";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}
// Thief OnTouch only
function	script	thiefFUNC2#AC_TST07	{
	if(AC_RANK!=6 || (AC_RANKTEST<4 && AC_RANKTEST>6)) end;
	mes "[Thief man]";
	mes "You!";
	mes "You got away with it!";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}

//Three men in front of East WP and Osenbo
moc_fild02.gat,370,272,4	script	bandit man#AC_TST07_03	930,10,10,{
	callfunc "thiefFUNC#ac_tst07";
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<3 || AC_RANKTEST>6) end;
	if(AC_RANKTEST==3){
		mes "[bandit man]";
		mes "Heh heh heh.";
		mes "He's a fool to wander around our territory alone.";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "Hey, what are you doing ......";
		mes "-I think I've been hit from behind with something, my consciousness is fading away-";
		close2;
		warp "moc_fild02.gat",153,312;
		end;
	}
	mes "[Thief man]";
	mes "Damn you!";
	mes "Where the hell did you run off from!";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}
moc_fild02.gat,373,278,4	script	Thieves man#AC_TST07_01	931,{
	callfunc "thiefFUNC#AC_TST07";
}
moc_fild02.gat,370,279,4	script	Thief woman#AC_TST07_02	919,{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6){
		mes "[Thief woman]";
		mes "What's that, Anta?";
		mes " -The woman is staring at us-";
		close;
	}
	mes "[Thief woman]";
	mes "You son of a bitch!";
	mes "I won't let you get away!";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}
//Nakashu and Osenbo
moc_fild02.gat,270,268,4	script	bandit man#AC_TST07_04	930,3,5,{
	callfunc "thiefFUNC#AC_TST07";
OnTouch:
	callfunc "thiefFUNC2#AC_TST07";
}
// Southwest Root and Osebo
moc_fild02.gat,91,98,4	duplicate(bandit man#AC_TST07_04)	bandit man#AC_TST07_05	930,5,10
//Luggage Routes and Osebo
moc_fild02.gat,203,290,4	duplicate(bandit man#AC_TST07_04)	bandit man#AC_TST07_06	934,10,5

//northwest route and osenbo
moc_fild02.gat,78,210,4	script	Thief man#AC_TST07_07	930,10,5,{
	if(AC_RANK==6 && AC_RANKTEST==6){
		mes "[Thief man]";
		mes "mnya mnya_......";
		close;
	}
	callfunc "thiefFUNC#AC_TST07";
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>5) end;
	callfunc "thiefFUNC2#AC_TST07";
}

// Location when caught (for automatic conversation)
moc_fild02.gat,153,312,0	script	#AC_TST07_08	139,3,3,{
OnTouch:
	if(AC_RANK!=6) end;
	switch(AC_RANKTEST){
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "......";
		mes "............";
		mes "(Where am I ......?)";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "(You see the bandit. ......";
		mes "I think he passed out and was dragged to this place.\")";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "(......It appears that they have stolen water and luggage.\")";
		next;
		set AC_RANKTEST,4;
	case 4:
		viewpoint 1,160,302,20,0xFFFFFF00;
		mes "[" + strcharinfo(0) + "]";
		mes "(^FF0000 Let's move around so the bandits don't find us and find where our stuff is! ^000000)";
		close;
	case 5:
		viewpoint 1,234,314,20,0xFFFFFF00;
		mes "[" + strcharinfo(0) + "]";
		mes "(caught ......";
		mes "Let's move to ^0000FFSograt Desert02(234,314) near ^000000 and get our stuff back so the bandits don't find us!";
		close;
	}
	end;
}
// Eavesdropping automatic conversation
moc_fild02.gat,147,302,0	script	#AC_TST07_09	139,5,5,{
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST!=4) end;
	viewpoint 1,160,302,20,0xFFFFFF00;
	mes "[" + strcharinfo(0) + "]";
	mes "(A voice is heard immediately to the southeast: ......";
	mes "Let's go to the southeast.)";
	close;
}

//the person who is talking to the scarecrow
moc_fild02.gat,163,294,7	script	bandit man#AC_TST07_11	943,9,9,{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6){
		mes "[" + strnpcinfo(1) + "]";
		mes "What the hell are you?";
		mes " -The man is staring at us-";
		close;
	}
	mes "-" + strnpcinfo(1) + "is slobbering and blubbering -";
	close;
OnTouch:
	if(AC_RANK!=6 || (AC_RANKTEST!=4 && AC_RANKTEST!=5)) end;
	switch(AC_RANKTEST){
	case 4:
		mes "[" + strcharinfo(0) + "]";
		mes "-(bandits talking, let's hide here ......)" + strcharinfo(0) + " hid behind the tree-";
		next;
		mes "[bandit man]";
		mes "Oh karaaaa, the stupid adventurer was carrying water, and I gave it to him.";
		next;
		mes "[Okamoto]";
		mes "Oh, oh, oh!";
		mes "You've had another expensive one with water, haven't you?";
		mes "And where is that water?";
		next;
		mes "[Thief man]";
		mes "Heh heh heh.";
		mes "If it's water, I have it hidden around ^0000FFSograt Desert02(234,314)^000000.";
		mes "Of course, I have a guard on duty, so you don't have to worry.";
		next;
		mes "[head]";
		mes "That's great!";
		mes "All right, let's all make some noise tonight!";
		mes "hehehe ......";
		mes " -The pigtails are drooling-";
		next;
		mes "[bandit man]";
		mes "Yes, it is!";
		mes "hehehe ......";
		mes " -The bandit man is drooling-";
		close2;
		viewpoint 1,234,314,20,0xFFFFFF00;
		set AC_RANKTEST,5;
		end;
	case 5:
		mes "[I wonder]";
		mes "Oops, that reminds me, ......";
		mes "Um, ......";
		mes "Huh?";
		mes "Where is the water hidden?";
		next;
		mes "[bandit man]";
		mes "Oh no, I don't like it!";
		mes "The hiding place is around ^0000FFSograt Desert02(234,314)^000000.";
		next;
		mes "[okama]";
		mes "I see!";
		mes "I can't wait to get rid of it and make some money.";
		mes "hehehe ......";
		mes " -Kasara is drooling-";
		next;
		mes "[bandit man]";
		mes "Yes, it is!";
		mes "hehehe ......";
		mes " -The bandit man is drooling-";
		close2;
		viewpoint 1,234,314,20,0xFFFFFF00;
		end;
	}
}
moc_fild02.gat,165,294,4	duplicate(bandit man#AC_TST07_11)	okara#AC_TST07_12	939

function	script	thiefFUNC3#ac_tst07	{
	mes "[Thief man]";
	mes "What are you doing!";
	mes "I can't believe you got through that security net. ......";
	mes "You've done well.";
	mes "But! As long as my eyes are black, I won't lift a finger on my cargo!";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}

moc_fild02.gat,234,314,4	script	thief man#luggage number	945,5,5,{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6) end; //as main mackerel without mezzage
	if(getvariableofnpc('flag, "luggage#AC_TST07")<3){
		mes "[bandit man]";
		mes "mnya mnya ......";
		mes "Zzzzz";
		next;
		if(AC_RANKTEST==6){
			mes "[" + strcharinfo(0) + "]";
			mes "You got your stuff back. ......";
			mes "Let's head to the next location so the bandits don't find us: ......";
			close2;
			viewpoint 1,80,342,20,0xFFFFFF00;
			end;
		}
		mes "[" + strcharinfo(0) + "]";
		mes "Now that I'm asleep, I can get my water and luggage back without being detected.";
		close;
	}
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6 || getvariableofnpc('flag, "luggage#AC_TST07")<3) end;
	callfunc "thiefFUNC3#AC_TST07";
}
moc_fild02.gat,234,313,4	script	Luggage#AC_TST07	111,{
	if(AC_RANK!=6 || (AC_RANKTEST!=5 && AC_RANKTEST!=6)){
		mes "-Lots of baggage on the floor: ......-";
		close;
	}
	if(AC_RANKTEST==6){
		mes "[" + strcharinfo(0) + "]";
		mes "You got your stuff back. ......";
		mes "Let's head to the next location so the bandits don't find us: ......";
		close2;
		viewpoint 1,80,342,20,0xFFFFFF00;
		end;
	}
	if('flag<3){
		mes "-Found the stolen luggage and water-";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "Okay, let's head to the next location so the bandits don't find us: ......";
		close2;
		viewpoint 1,80,342,20,0xFFFFFF00;
		set AC_RANKTEST,6;
		end;
	}
	callfunc "thiefFUNC3#AC_TST07";
	end;
OnInit:
OnTimer3000:
	switch('flag){
		case 0: misceffect 197, "bandit man#luggage guard"; break;
		case 1: misceffect 197, "bandit man#luggage guard"; break;
		case 2: misceffect 197, "bandit-man#luggage guard"; break;
		case 3: emotion 23, "bandit man#luggage guard"; break;
		case 4: emotion 20, "bandit man#luggage guard"; break;
		case 5: emotion 9, "bandit-man#luggage guard"; break;
		case 6: emotion 45, "bandit man#luggage guard"; break;
	}
	set 'flag,('flag<6)*('flag+1);
	initnpctimer;
}
moc_fild02.gat,67,337,0	script	#AC_TST07_13	139,11,5,{
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6) end;
	if(AC_RANKTEST==6){
		mes "[" + strcharinfo(0) + "]";
		mes "A lot has happened, but we've made it this far ......";
		mes "We have to move on ......";
		close2;
		set AC_RANKTEST,7;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "We need to go back and get our stuff back ......";
	close2;
	if(AC_RANKTEST==3 || AC_RANKTEST==4)
		viewpoint 1,163,294,20,0xFFFFFF00;
	else
		viewpoint 1,234,314,20,0xFFFFFF00;
	end;
}
moc_fild02.gat,92,337,0	duplicate(#AC_TST07_13)	#AC_TST07_14	139,11,5

moc_fild01.gat,190,38,0	script	#AC_TSTVP7_15	139,8,8,{
	if(AC_RANK!=6 || (AC_RANKTEST!=7 && AC_RANKTEST!=8)) end;
	if(AC_RANKTEST==8){
		mes "[" + strcharinfo(0) + "]";
		mes "You've already finished shooting.";
		mes "Let's move on.";
		close2;
		viewpoint 1,22,242,20,0xFFFFFF00;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "It looks like this is definitely the place to shoot.";
	next;
	mes "- landscape photographed-";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "Looks like you got a good shot.";
	mes "Let's move on.";
	close2;
	set AC_RANKTEST,8;
	viewpoint 1,22,242,20,0xFFFFFF00;
	end;
}
moc_fild01.gat,28,242,0	script	#AC_TSTVP7_16	139,5,2,{
	if(AC_RANK!=6 || (AC_RANKTEST!=7 && AC_RANKTEST!=8)) end;
	if(AC_RANKTEST==7){
		mes "[" + strcharinfo(0) + "]";
		mes "I have to take a picture.";
		close2;
		viewpoint 1,190,38,20,0xFFFFFF00;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "I see green again.";
	mes "Can we finally cross the desert?";
	close2;
	set AC_RANKTEST,9;
	end;
}
prt_fild09.gat,304,193,4	script	Dr. Michelin	101,{
	if(AC_RANK!=6 || AC_RANKTEST<9 || AC_RANKTEST>13) {
		mes "[Dr. Michelin]";
		mes "Hello.";
		close;
	}
	switch(AC_RANKTEST){
	case 9:
		EMOTION 1;
		mes "[Dr. Michelin]";
		mes "Hello.";
		mes "What can I do for you?";
		next;
		set '@dummy,select("explain the situation");
	case 10:
		emotion 33;
		mes "[Dr. Michelin]";
		mes "You need some enchanted grass.";
		mes "Then can you get me the ^FF0000 grass ^000000 that grows on this map?";
		mes "Do that and I'll put a spell on it for you.";
		next;
		viewpoint 1,39,255,21,0xFFFFFF00;
		mes "[Dr. Michelin]";
		mes "It's a detailed location...was it around (39,255)?";
		mes "Yes, it should be growing around here.";
		mes "Have a good day then.";
		close2;
		set AC_RANKTEST,10;
		end;
	case 11:
	case 12:
		misceffect 17;
		mes "[Dr. Michelin]";
		mes "Welcome back!";
		mes "Looks like you weeded safely.";
		mes "Well, I'll do some quick magic.";
		next;
		mes "[Dr. Michelin]";
		mes "It worked.";
		mes "Well then, good luck with the rest of the exam!";
		next;
		mes "-I received the enchanted grass from Michelin-";
		next;
		mes "[Dr. Michelin]";
		mes "We're almost to the finish line, but don't let up.";
		close2;
		set AC_RANKTEST,13;
		viewpoint 1,224,380,20,0xFFFFFF00;
		end;
	case 13:
		mes "[Dr. Michelin]";
		mes "Good luck with the rest of the exam!";
		close2;
		viewpoint 1,224,380,20,0xFFFFFF00;
		end;
	}
}
prt_fild09.gat,39,255,0	script	#AC_TSTVP7_17	1080,{}
prt_fild09.gat,39,254,0	script	grass#AC_TSTVP7_18	111,{
	mes "-The grass is growing-";
	if(AC_RANK!=6 || AC_RANKTEST!=10) close;
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "This grass seems to be fine.";
	mes "Let's put it back in.";
	next;
	mes "-I've got the grass-";
	close2;
	viewpoint 1,304,193,20,0xFFFFFF00;
	set AC_RANKTEST,11;
	end;
}
prt_fild09.gat,227,368,0	script	#AC_TSTVP7_19	139,7,7,{
	if(AC_RANK!=6 || AC_RANKTEST<9 || AC_RANKTEST>13) end;
	if(AC_RANKTEST!=13){
		mes "[" + strcharinfo(0) + "]";
		mes "I've got to get some magic grass.";
		close2;
		if(AC_RANKTEST==9 || AC_RANKTEST>=11)
			viewpoint 1,304,193,20,0xFFFFFF00; //Dr. Michelin
		else
			viewpoint 1,39,255,21,0xFFFFFF00; //grass
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "We're almost to Prontera.";
	mes "Good luck!";
	close2;
	set AC_RANKTEST,14;
	end;
}
prt_fild09.gat,50,260,0	script	#AC_TSTVP7_20	139,10,10,{
	if(AC_RANK!=6 || AC_RANKTEST!=11) end;
	mes "-sound coming from the bushes ......-";
	next;
	mes "-a monster appears out of the bushes! -";
	close2;
	set '@dummy, getmapxy('@dummy$,'@x,'@y,0);
	areamonster "prt_fild09.gat",'@x-3,'@y-3,'@x +3,'@y+3,"--en--",1002,3;
	set AC_RANKTEST,12;
	end;
}
prt_fild07.gat,248,370,0	script	#AC_TSTVP7_21	139,5,5,{
	if(AC_RANK!=6 || AC_RANKTEST!=14) end;
	mes "[" + strcharinfo(0) + "]";
	mes "I think this end was the west side of Prontera.";
	mes "We're almost there!";
	close2;
	set AC_RANKTEST,15;
	end;
}

// Move to the minimap display process.
//prt_fild05.gat,367,205,0	script	#AC_TSTVP7_22	139,5,5,{ // before pro west entrance
// if(AC_RANK!=6 || AC_RANKTEST!=15) end;
// mes "[" + strcharinfo(0) + "]";
// mes "Prontera is visible.";
// mes "We're almost there!";
// close2;
// set AC_RANKTEST,16;
// end;
//}

// Not investigated. I heard that if you try to go through, it will turn you away.
prt_fild05.gat,371,123,4	script	A man who looks like a rascal	943,{
	mes "[man who looks like a rattler]";
	mes "Gooo.";
	mes "Guo.";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "(Looks like the guy is sleeping.)";
	close;
}

prontera.gat,26,203,0	script	#AC_TSTVP7_22	139,5,5,{ //pro arrival
	if(AC_RANK!=6 || AC_RANKTEST!=16) end;
	mes "[" + strcharinfo(0) + "]";
	mes "You have arrived at Prontera!";
	mes "Now all we have to do is report back to Mr. Gordo and the test is complete!";
	close2;
	set AC_RANKTEST,98;
	end;
}
