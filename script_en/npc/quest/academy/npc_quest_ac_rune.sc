//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Lune's Request
//
// by Pneuma
//------------------------------------------------------------

// ----------------------------------------------------------------------------------------
// Minimap mark color
// Blue: That girl I'm interested in
// Red: Box of Miracles
// Orange: To that person who has helped me
// Green: help with experiments
// Water: I want to be an adventurer
// ----------------------------------------------------------------------------------------
// Lune
ac_cl_area.gat,48,145,4	script	Lune#ac	430,{
	function GetQueLv;
	function GetQuestSelectList;
	function GetQuestName;
	function GiveExp;
	set '@novice, callfunc("AC_GetNovice");
	cutin "jpn_run01",2;
	if('@novice && AC_NOVICE_QUE==30){ //after Faye's training
		set AC_NOVICE_QUE,31;
		mes "[Lune]";
		mes "Welcome to the Adventurers Academy!";
		mes "You must be a new student.";
		mes "Quickly, I need your help with something.";
		mes "Which of these requests could I help you with?";
		next;
		goto L_GETQUE;
	}
	if(!'@novice && !AC_NOVICE_QUE){
		mes "[Lune]";
		mes "Welcome to the Adventurers Academy!";
		mes "You have a very unusual vibe for a new student .......";
		mes "What can I do for you?";
	} else {
		mes "[Lune]";
		mes "Oh, hello.";
		mes "Can I help you?";
	}
	next;
L_MENU:
	menu "Talk about the request",L_QUEST, "Talk about the exam",L_TEST, "What are you doing Lune?", L_ABOUT, "Nothing",L_NOTHX;
L_QUEST:
	mes "[Lune]";
	mes "About the request.";
	mes "Uh, what's this about the request?";
	next;
	menu "Receive request",L_GETQUE, "Confirm request",L_QUECHECK, "Report request",L_QUEREPORT, "Confirm request",L_QUEINFO, "Nothing",L_NOTHX;
L_GETQUE:
	if(AC_QUEST_LV_0+AC_QUEST_LV_1+AC_QUEST_LV_2+AC_QUEST_LV_3+AC_QUEST_LV_4==45){
		EMOTION 2;
		mes "[Lune]";
		mes "There are no requests you can accept right now.";
		mes "There were so many, but thanks to your help, they're all done, and I may have some free time.";
		mes "Let's go out for some good food.";
		next;
		goto L_OTHER;
	}
	GetQuestSelectList 0,'@quecount,'@quelist$,'@queidlist,'@queidcount;
	if('@quecount==0 && (AC_QUEST_ST_0 || AC_QUEST_ST_1 || AC_QUEST_ST_2 || AC_QUEST_ST_3 || AC_QUEST_ST_4)){
		mes "[Lune]";
		mes "You have a request you're working on right now.";
		mes "First, you need to help your current client.";
		next;
		goto L_OTHER;
	}
	mes "[Lune]";
	mes "The request you can accept now is ^FF0000"+ '@quecount + "^000000.";
	next;
	mes "[Lune's One Point of Advice]";
	mes "I don't think ^008800 green ^000000 requests involve fighting monsters.";
	mes "I think the ^FF0000 red ^000000 request might have a battle with a monster.";
	mes "Be prepared.";
	mes "Which one do you want to undertake?";
	next;
	set '@que_id, '@queidlist[select('@quelist$)-1];
	if('@que_id==99) goto L_NOTHX;
	set '@quelv,GetQueLv('@que_id);
	set '@idx,'@que_id*9+'@quelv;
	if(BaseLevel < 'QUE_REQUIRE['@idx]){
		mes "[Lune]";
		mes "You are ^006600 level short on this request" + ('QUE_REQUIRE['@idx]-BaseLevel) + "You are ^000000 short.";
		mes "When you grow up a little more, you'll be able to do the request.";
		next;
		goto L_OTHER;
	}
	set '@client_id, 'QUE_CLIENT['@idx];
	mes "[Lune]";
	switch ('@client_id) {
	case 0:
		mes "That's it, right?";
		mes "The request was made by Mr. Halbert, a male Prontera resident.";
		next;
		mes "[Lune]";
		mes "It seems that Mr. Halbert is located near the center of Prontera at coordinates (146,232).";
		break;
	case 1:
		mes "That request is more ......";
		mes "It's from a man named Gerald who lives in Payon.";
		mes "It seems he is a ring Artisan.";
		next;
		mes "[Lune]";
		mes "Gerald is located in the building 4 o'clock from the center of Payon.";
		mes "It looks like the building is located at coordinates around (144.85).";
		break;
	case 2:
		mes "The request is from WomanSusanne who lives in Izlude.";
		next;
		mes "[Lune]";
		mes "It seems that Ms. Susanne is located near the center of Izlude at coordinates (138,156).";
		break;
	case 3:
		mes "That's it, right?";
		mes "That's from WomanLouise, who lives in Alberta.";
		next;
		mes "[Lune]";
		mes "It looks like Louise is located near (39,46) in Alberta's 8 o'clock coordinates.";
		break;
	case 4:
		mes "That's it, right?";
		mes "That's from WomanMisery, who lives in Aldebaran.";
		next;
		mes "[Lune]";
		mes "Ms. Misery is located in the building at 4 o'clock Aldebaran.";
		mes "It looks like the building is located at coordinates around (231,107).";
		break;
	case 5:
		mes "That's it, right?";
		mes "That's from Mr. Mazzi, a man who lives in Yuno.";
		mes "It looks like a pastry Artisan.";
		next;
		mes "[Lune]";
		mes "Mazzi's place is in the building at 9 o'clock in Yuno.";
		mes "It looks like the building is located at coordinates around (95,184).";
		break;
	case 6:
		mes "That's it, right?";
		mes "That's from Dr. Tracy, a man who lives in Hugel.";
		next;
		mes "[Lune]";
		mes "Dr. Tracy is located in the building at 6 o'clock in Hugel.";
		mes "It looks like the building is located at coordinates around (107,77).";
		break;
	case 7:
		mes "That's it, right?";
		mes "That's from Mr. Amuron, a man who lives in Hugel.";
		next;
		mes "[Lune]";
		mes "Mr. Amuron is located in a building at 9 o'clock in Hugel.";
		mes "It looks like the building is located at coordinates (73,155).";
		break;
	case 8:
		mes "That's it, right?";
		mes "That's from Honest, a girl who lives in Geffen.";
		next;
		mes "[Lune]";
		mes "The place where Honest is is in the building at 2 o'clock in Geffen.";
		mes "It looks like the building is located at coordinates (168,170).";
		break;
	}
	next;
	mes "[Lune]";
	mes "As for the details of the request, you'll have to hear from the client.";
	mes "This request is ^FF0000"+ 'QUE_CREDITS['@quelv] +"^000000 units acquired.";
	next;
	if(!'@novice){
		mes "[Lune]";
		mes "I might be a ^0000FF volunteer ^000000 for you, is that OK?";
	}
	mes "-Do you accept this request? -";
	next;
	menu "Yes",-, "No",L_QUECANCEL;
	if('@novice){
		mes "[Lune]";
		mes "The request was ^0000FFHeim^000000 said he would help me.";
		//2011/? /? Change.
		//mes "^0000FFHeim^000000 is in the classroom building ";
		//mes "I think he's on the second floor, so ";
		//mes "Please look for him.";
		mes "^0000FFHeim^000000 is ^FF0000I think he is at ^000000 up from this place, so please look for him.";
		next;
		if('QUE_BATTLE['@que_id]){
			mes "[Lune]";
			mes "When you go out of town, you'd better get your items ready.";
			mes "Come back to me when you have completed the request safely.";
			next;
		}
		mes "[Lune]";
		mes "I think the people from the academy are around the center of town, so if you get lost, try going to the center of town.";
		mes "Well then, have a good day!";
		NEXT;
		mes "[Lune]";
		mes "Come back to me when you have successfully completed your request.";
		next;
	}
	else {
		mes "[Lune]";
		mes "Come back to me when you have successfully completed your request.";
		mes "Then, have a good day!";
		next;
	}
	//Request acquisition completed
	switch ('@que_id) {
	case 0: set AC_QUEST_ST_0,1; break;
	case 1: set AC_QUEST_ST_1,1; break;
	case 2: set AC_QUEST_ST_2,1; break;
	case 3: set AC_QUEST_ST_3,1; break;
	case 4: set AC_QUEST_ST_4,1; break;
	}
	mes "[Information]";
	mes "-'+' is now displayed on the minimap as "+'que_color$['@que_id]+" while the request is in progress-";
	if('@novice){
		mes " -The ^FF0000 [mission] ^000000 is now displayed while the request is in progress-";
		next;
		mes "[Information]";
		mes "-When you move near the Academy Official in the city indicated by ^FF0000 [Mission] ^000000, ^FF0000next destination will be indicated by a '+' on the minimap^000000-";
	}
	goto L_CLOSE;
L_QUECANCEL:
	mes "[Lune]";
	mes "Okay, if you want to take it, talk to me again.";
	goto L_CLOSE;
L_QUECHECK:
	GetQuestSelectList 1,'@quecount,'@quelist$,'@queidlist,'@queidcount;
	if('@quecount==0) {
		mes "["+ strcharinfo(0) +"]";
		mes "(Are there any requests that can be checked now ......)";
		goto L_CLOSE;
	}
	mes "[Lune]";
	mes "Oh, you want to ask again where the client is?";
	if('@quecount==1){
		next;
		set '@que_id, '@queidlist[0];
	} else {
		mes "I wonder what request they want to confirm?";
		next;
		set '@que_id, '@queidlist[select('@quelist$)-1];
	}
	set '@quelv,GetQueLv('@que_id);
	set '@idx,'@que_id*9+'@quelv;
	set '@client_id,'QUE_CLIENT['@idx];
	mes "[Lune]";
	switch ('@client_id) {
	case 0:
		mes "It looks like the client man, Mr. Halbert, is located at coordinates (146,232) near the center of Prontera.";
		break;
	case 1:
		mes "The client, Gerald, is located in the building at 4 o'clock from the center of Payon.";
		mes "It looks like the building is located at coordinates around (144.85).";
		break;
	case 2:
		mes "The client, WomanSusanne, is located in the center of Izlude at coordinates (138,156).";
		break;
	case 3:
		mes "It seems that the client, WomanLouise, is located at coordinates (39,46) in Alberta at 8 o'clock.";
		break;
	case 4:
		mes "The client, WomanMisery, is located in a building at 4 o'clock in Aldebaran.";
		mes "It looks like the building is located at coordinates around (231,107).";
		break;
	case 5:
		mes "The client man Mazzi is located in the building at Yuno 9 o'clock.";
		mes "It looks like the building is located at coordinates around (95,184).";
		break;
	case 6:
		mes "The client man Dr. Tracy is located in the building at Hugel 6 o'clock.";
		mes "It looks like the building is located at coordinates around (107,77).";
		break;
	case 7:
		mes "The client man, Amuron, is in the building at 9 o'clock in Hugel.";
		mes "It looks like the building is located at coordinates (73,155).";
		break;
	case 8:
		mes "The client, WomanHonest, is in the building at Geffen 2 o'clock.";
		mes "It looks like the building is located at coordinates (168,170).";
		break;
	}
	next;
	mes "[Information]";
	
	next;
	mes "[Lune]";
	mes "As for the details of the request, please ask the client directly.";
	goto L_CLOSE;
L_QUEREPORT:
	GetQuestSelectList 2,'@quecount,'@quelist$,'@queidlist,'@queidcount;
	if('@quecount==0) {
		mes "["+ strcharinfo(0) +"]";
		mes "(No requests to report now ......)";
		goto L_CLOSE;
	}
	mes "["+ strcharinfo(0) +"]";
	mes "(Which one should I report?)";
	next;
	set '@que_id, '@queidlist[select('@quelist$)-1];
	GetQuestName '@que_id,'@que_name$;
	if('@que_id==99) {
		EMOTION 1;
		mes "["+ strcharinfo(0) +"]";
		mes "(Let's not report now ......)";
		goto L_CLOSE;
	}
	set '@quelv,GetQueLv('@que_id);
	mes "[Lune]";
	mes ""+'@que_name$ + "'s report.";
	mes "Um, I'll check it now, wait a bit. ......";
	next;
	mes "[Lune]";
	mes "I've got confirmation.";
	mes "It looks like the client has successfully contacted me to resolve the request as well.";
	if('@novice){
		if('QUE_BATTLE['@que_id]){
			mes "You're awesome!";
			mes "It must have been tough with the monsters, huh?";
			mes "I'm really glad you're okay.";
		} else {
			mes "Good job!";
		}
		next;
		mes "[Lune]";
		mes "Here's your reward from me.";
		set '@pot_count, 150 + '@quelv*30;
		if(!checkweight(569,'@pot_count)){
			mes "Oh?";
			mes "I can't give you the package because it's full.";
			mes "You'll have to report back to me after you check in your luggage.";
			goto L_CLOSE;
		}
		GiveExp '@que_id;
		getitem 569,'@pot_count;
		mes "Potions for beginners" + '@pot_count + "Pieces!";
		mes "It's not much recovery, but it's awfully light, so I think it'll be useful in your adventures.";
		next;
		mes "[Lune]";
		mes "And the units you can get from this request will be [" + 'QUE_CREDITS['@quelv] + "] units.";
		mes "If you add up the units you have so far, you get [" + AC_CREDIT + "] units.";
		next;
		mes "[Lune]";
		mes "The procedure is now complete!";
		mes "Please talk to me again if you need me.";
		goto L_CLOSE;
	} else {
		next;
		mes "[Lune]";
		mes "I'm so glad to have a skilled adventurer like you helping me!";
		mes "Thank you!";
		next;
		GiveExp '@que_id;
		mes "[Lune]";
		mes "I'm ^0000FF volunteer ^000000 for you, but you get [" + 'QUE_CREDITS['@quelv] + "] units with this request.";
		mes "Totaled with your previous credits, you get [" + AC_CREDIT + "]credits.";
		next;
		mes "[Lune]";
		mes "Also, your help would be a big help!";
		mes "The procedure is now complete!";
		mes "Also, talk to me if you need me.";
		goto L_CLOSE;
	}
L_QUEINFO:
	EMOTION 20;
	mes "[Lune]";
	mes "About the request.";
	mes "Hmm, I don't give students the details of the request from me.";
	mes "Because there are so many students and if I explained it to each one of them, there wouldn't be enough time, would there?";
	NEXT;
	mes "[Lune]";
	mes "The only thing I can tell you is that I'm going to check your levels and see if I can solve your problems.";
	next;
	mes "[Lune]";
	mes "So if there is not a single request that you can accept, it means that there is not a single request that you can solve at your level, so you need to work hard to raise your level.";
	next;
	mes "[Lune]";
	mes "Ah!";
	mes "There was another one!";
	mes "Colors, colors!";
	mes "I'm putting three colors on the request.";
	next;
	mes "[Lune]";
	mes "One is ^008800 green ^000000.";
	mes "The ^008800 green ^000000 is the one I saw that I thought had the least chance of fighting a monster.";
	mes "So it might be a bit uninspired!";
	NEXT;
	mes "[Lune]";
	mes "The second one is ^FF0000 red ^000000.";
	mes "^FF0000 red ^000000 doesn't sound very dangerous, does it?";
	next;
	mes "[Lune]";
	mes "You're absolutely right!";
	mes "I've marked in red the ones that I think are most likely to be in combat with monsters!";
	next;
	emotion 29;
	mes "[Lune]";
	mes "Hmmm, the thrill of knocking down monsters and coming back alive just in time ......";
	mes "I can't resist. ......";
	mes "Mmmmmm";
	next;
	menu "Let's see......",-;
	emotion 0;
	mes "[Lune]";
	mes "Ha!";
	mes "Oh, sorry, sorry.";
	mes "Uh, what were we talking about?";
	next;
	menu "About the color of the request",-;
	mes "[Lune]";
	mes "Ah!";
	mes "Oh, yes, you did!";
	mes "Uh, the other one is a request that's a little low level to take on, but this one is ^7777777 gray^000000.";
	next;
	mes "[Lune]";
	mes "So that's the explanation?";
	goto L_CLOSE;
L_TEST:
	////*recalculate units*/{
	// set AC_CREDIT,0;
	// for(set '@i,0; '@i<5; set '@i,'@i+1){
	// for(set '@j,0; '@j < GetQueLv('@i); set '@j,'@j+1){
	// set AC_CREDIT,AC_CREDIT+'QUE_CREDITS['@j];
	// }
	// }
	//}
	set '@chklv,(BaseLevel < 'TST_REQUIR_LV[AC_RANK]);
	set '@chkct,(AC_CREDIT < 'TST_REQUIR[AC_RANK]);
	mes "[Lune]";
	mes "About the exam.";
	mes "Uh, what's this about the exam?";
	next;
	menu "Take an exam",L_GETTEST, "Confirm exam",L_CHKTEST, "Report exam",L_REPOTEST, "How to take an exam?",L_ABOUTTEST, "Nothing",L_NOTHX;
L_GETTEST:
	if(AC_RANK>=7){
		EMOTION 2;
		mes "[Lune]";
		mes "You have completed your primary course.";
		mes "I'm not doing the exam right now.";
		mes "You are a studious person.";
		mes "I wish you would share that feeling with the fledgling adventurers.";
	}
	if(AC_RANKTEST){
		mes "[Lune]";
		mes "You are taking an exam right now.";
		mes "You need to complete the current exam in order to take the next one.";
		mes "First, you need to finish your current exam.";
		goto L_CLOSE;
	}
	if('@chklv || '@chkct){
		mes "[Lune]";
		mes "There are no exams you can take now.";
		if('@chklv && '@chkct){
			mes "Base level is ^FF0000" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000 units are ^FF0000" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000 seems to be missing.";
			mes "Raise Base level and ";
		} else
		if('@chklv){
			mes "I've got the credits to take the exam, but my Base level is ^FF0000 after" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000 seems to be missing.";
			mes "Can you tell me again when you get your Base level up.";
			goto L_CLOSE;
		} else
		if('@chkct){
			mes "I have enough levels, but the units are ^FF0000 after" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "I think I'm ^000000 short.";
		}
		mes "Tell me again when you have completed the request and received your credits.";
		goto L_CLOSE;
	}
	set AC_RANKTEST,1; //exam acceptance complete *This is the correct place to flag. The test is completed even if you relog in the conversation after this.

	switch(AC_RANK){
	case 0:
		mes "[Lune]";
		mes "You're taking the first test.";
		mes "Gordo is handling all the exams for you.";
		next;
		break;
	case 1: 
		mes "[Lune]";
		mes "Second test, right?";
		mes "Gordo is doing the examinations.";
		next;
		break;
	case 2:
		mes "[Lune]";
		mes "I'm going to check a few things.";
		mes "Uh, next, looks like a third test, right?";
		mes "As for the exam, you will still have to take it from Gordo as before.";
		next;
		break;
	case 3:
		mes "[Lune]";
		mes "Fourth test!";
		mes "You're awesome, and if you pass this exam, you'll only have three left.";
		mes "You're almost there!";
		next;
		break;
	case 4:
		mes "[Lune]";
		mes "Fifth test.";
		mes "I think the exam is getting much more difficult when you get to this stage.";
		mes "But I'm sure you will pass it after all your hard work!";
		next;
		break;
	case 5: emotion 0;
		mes "[Lune]";
		mes "You are ...... the sixth test! You did your best!";
		mes "There are two exams left! Two!";
		mes "We've taken care of the formalities.";
		next;
		break;
	case 6: 
		emotion 29;
		mes "[Lune]";
		mes "Seventh test.";
		mes "This is the last exam of the first process, so the difficulty level must be quite high.";
		mes "I wonder if I'll make it back alive?";
		next;
		mes "[Lune]";
		mes "Come on, let's go to Gordo's place!";
		mes "Go to the Laboratory on the 2nd floor of the school!";
		goto L_CLOSE;
	}
	mes "[Lune]";
	mes "Gordo is at 2FLaboratory in the school, so you should go there.";
	goto L_CLOSE;
L_CHKTEST:
	if(AC_LANC>=7){
		mes "[Lune]";
		mes "There are no exams available for you right now.";
		mes "That's great that you completed the primary process.";
		mes "I'll have to work hard too.";
		emotion 2, "Lune#ac"; //54752
		goto L_CLOSE;
	}
	if(AC_RANKTEST==1){
		mes "[Lune]";
		mes "I'll leave the exam to Gordo.";
		mes "Gordo is at 2FLaboratory in the school, so you should go there.";
		goto L_CLOSE;
	}
	if(AC_RANKTEST){
		mes "[Lune]";
		mes "You seem to be in the middle of an exam.";
		mes "I leave the details of the exam to Gordo.";
		mes "Gordo should be in the laboratory on the second floor of the classroom building, so check with him.";
		goto L_CLOSE;
	}
	mes "[Lune]";
	mes "Let's see, ......, wait a minute.";
	mes "Oh?";
	mes "I guess you didn't take the test.";
	goto L_CLOSE;
L_REPOTEST:
	if(AC_RANKTEST!=99){
		mes "[" + strcharinfo(0) + "]";
		mes "(Are there any tests that can be reported now ......)";
		goto L_CLOSE; 
	}
	EMOTION 46;
	switch(AC_RANK){
	case 0:
		mes "[Lune]";
		mes "Congratulations on passing the first test!";
		mes "I bet you were nervous about your first exam, weren't you?";
		mes "Get your credits again and try for the next level.";
		next;
		emotion 5;
		mes "[Lune]";
		mes "Yes!";
		mes "Now that you've passed this exam, don't you want to start fighting monsters outside the academy?";
		mes "hmmm...yeah...";
		next;
		mes "[Lune]";
		mes "Oh yeah, there's an old man named Yong on the second floor of the classroom building, you should talk to him.";
		next;
		mes "[Lune]";
		mes "And do you know someone called Taro-san who provides a forwarding service?";
		mes "He is, you know, the one who comes to the academy and does business.";
		next;
		mes "[Lune]";
		mes "The last time I had dinner with him, he asked me for more information about the academy, and I told him about the fledgling adventurers who are doing well.";
		mes "I did, and he said he wanted to help too.";
		next;
		mes "[Lune]";
		mes "What a surprise! They're offering a discount on forwarding services for fledgling adventurers who pass the exam!";
		mes "And if you pass the exams above, the discount rate will go up and up and up, okay?";
		mes "Isn't it amazing!";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 415,225;
		mes "[Lune]";
		mes "Yes, a discount coupon.";
		mes "Be careful not to lose it!";
		break;
	case 1:
		mes "[Lune]";
		mes "Congratulations on passing the second test!";
		mes "Gordo told me that there is a seventh exam coming up, so good luck on the next one!";
		next;
		mes "[Lune]";
		mes "Oh yeah, Grandpa Yong said he can transfer you to a new place, so why don't you go ask him?";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 810,798;
		mes "[Lune]";
		mes "Also, I'll update Taro's transfer service discount rate.";
		mes "This should give you more of a discount rate.";
		break;
	case 2:
		mes "[Lune]";
		mes "Congratulations on passing the third test!";
		mes "Speaking of which, how is Professor Wolf?";
		mes "That teacher is so adorable, I can't be bothered!";
		next;
		mes "[Lune]";
		mes "And he's so loud when he's alone.";
		mes "You were saying wan wan, weren't you?";
		mes "I'm sure you'll do well on the next exam.";
		next;
		mes "[Lune]";
		mes "Oh yeah, Grandpa Yong said he's going to transfer you to a new place, so why don't you go ask him?";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 1475,2295;
		mes "[Lune]";
		mes "Also, I'll update Taro's transfer service discount rate.";
		mes "This should give you more of a discount rate.";
		break;
	case 3:
		mes "[Lune]";
		mes "Congratulations on passing the fourth test!";
		mes "Gordo told me you had a long trip.";
		mes "That's great!!! I think you could go anywhere.";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 3998,5672;
		mes "[Lune]";
		mes "Also, I'll update Taro's transfer service discount rate.";
		mes "This should give you more of a discount rate.";
		break;
	case 4:
		mes "[Lune]";
		mes "Congratulations on passing the fifth test!";
		mes "Looks like you were able to deliver the report to Gordo.";
		mes "Glad to hear you're all right.";
		next;
		mes "[Lune]";
		mes "Oh yeah, Grandpa Yong said he's going to transfer you to a new place, so why don't you go ask him?";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 5213,7943;
		mes "[Lune]";
		mes "Also, I'll update Taro's transfer service discount rate.";
		mes "This should give you more of a discount rate.";
		break;
	case 5:
		mes "[Lune]";
		mes "Congratulations on passing the sixth test!";
		mes "I can't believe you found Professor Horn";
		mes strcharinfo(0) + ", wow!";
		mes "They say a lot of people can't find it.";
		mes "Maybe you should try traveling around the world.";
		next;
		mes "[Lune]";
		mes "Oh yeah, Grandpa Yong said he can transfer you to a new place, so why don't you go ask him?";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 7888,12499;
		mes "[Lune]";
		mes "Also, I'll update Taro's transfer service discount rate.";
		mes "This should give you more of a discount rate.";
		break;
	case 6:
		mes "[Lune]";
		mes "Congratulations on passing the seventh test!";
		mes "Wow!";
		mes "You finally passed all the first process exams!";
		next;
		mes "[Lune]";
		mes "Now you are one step closer to becoming a full-fledged adventurer.";
		mes "I know you've been through a lot, but I'm sure what you've done will help you in your future adventures.";
		next;
		mes "[Lune]";
		mes "Good job" + strcharinfo(0) + "I have something for you.";
		mes ""+strcharinfo(0) + "You've worked very hard to get here.";
		next;
		mes "[Lune]";
		mes "This is a certificate of completion of the primary course of the academy.";
		mes "This is the academy's first completion cap!";
		if(!checkweight(5407,1)){ //sorry, not researched. This is imaginary.
			mes "Oh my?";
			mes "I can't give it to you because your bags are full.";
			mes "You'll have to report back to me after you drop off your luggage.";
			goto L_CLOSE;
		}
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 17106,25183;
		getitem 5407,1;
		mes "Please continue to help all kinds of people.";
		next;
		mes "[Lune]";
		mes "Oh, yes!";
		mes "I think Mido has something he wants to give you too, so you can talk to him.";
		break;
	}
	goto L_CLOSE;
L_ABOUTTEST:
	if(AC_RANK>=7){
		mes "[Lune]";
		mes "You have completed the first process.";
		mes "There won't be any exams for a while.";
		mes "I wonder if Gordo is a little tired.";
		mes "You must be very studious to want to take the exam again.";
		next;
		mes "[Lune]";
		mes "May I ask you to look after all the other adventurers?";
		mes "I think you could teach them a lot of things.";
		emotion 2, "Lune#ac"; //54752
		goto L_CLOSE;
	}
	if('@chklv || '@chkct){
		mes "[Lune]";
		mes "You need a certain level of credits and Base level to take the exam.";
		mes "You can earn credits by taking requests.";
	} else {
		mes "[Lune]";
		mes "You need credits to take the exam.";
		mes "You can earn credits by taking requests.";
	}
	next;
	//Added due to implementation of Porin Dan
	if(AC_QUEST_LV_6 != 16){
		mes "[Lune]";
		mes "But lately it seems like I'm getting more credits for students headed towards the Practice Room.";
		mes "I don't see any deficiencies in the paperwork. ......";
		mes "Well, it's just my imagination.";
	} else {
		// Clearing the line changes the line.
		mes "[Lune]";
		mes "Of course, the credits you got from the Pollin group are still valid.";
	}
	if('@chklv || '@chkct){
		if('@chklv && '@chkct){
			next;
			mes "[Lune]";
			mes "If ^FF0000 more" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000 credits are earned and the level is ^FF0000" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000";
		} else
		if('@chklv){
			mes "After ^FF0000" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "After ^000000 credits are earned and the level reaches ^FF0000" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000";
		} else
		if('@chkct){
			mes "If ^FF0000 more credits are earned" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000 credits";
		}
		mes "You can take the next exam, if you want.";
	} else {
		mes "[Lune]";
		mes "You have earned enough credits for the next exam.";
		mes "You can take the exam at any time.";
	}
	goto L_CLOSE;
L_ABOUT:
	if(AC_QUEST_LV_0+AC_QUEST_LV_1+AC_QUEST_LV_2+AC_QUEST_LV_3+AC_QUEST_LV_4<=15) {
		mes "[Lune]";
		mes "Here you can take on requests collected from all over.";
		mes "And you can get credits for solving the requests.";
		mes "In short, this request is a class.";
		next;
		emotion 5;
		mes "[Lune]";
		mes "Oh, right, you haven't introduced yourself yet.";
		mes "My name is Lune and I am managing the request.";
		mes "If you would like to receive a request, please contact me.";
		next;
		mes "[Lune]";
		mes "Oh yeah, I forgot to mention that I'm also the one who grants the credits, so be careful what you say and do.";
		goto L_CLOSE;
	} else
	if(AC_QUEST_LV_0+AC_QUEST_LV_1+AC_QUEST_LV_2+AC_QUEST_LV_3+AC_QUEST_LV_4<=30) {
		EMOTION 9;
		mes "[Lune]";
		mes "......";
		mes "Don't you recognize it when you see it?";
		mes "I'm working!";
		mes "Work!";
		mes "haha ......";
		next;
		menu "What's wrong?" ,-;
		EMOTION 36;
		mes "[Lune]";
		mes "Listen to me!";
		mes "Yesterday Mido and I were supposed to go to dinner at Prontera's, but he cancelled on me because he was busy with work!";
		mes "Don't you think it's terrible?";
		next;
		if(select("terrible", "not terrible")==1){
			EMOTION 29;
			mes "[Lune]";
			mes "That's terrible. ......";
			mes "I was really looking forward to it.";
			mes "Next time I go, I'm going to make sure I buy you a full-price meal!";
			mes "Thanks for listening to me complain.";
			mes "I feel so much better!";
			goto L_CLOSE;
		} else {
			EMOTION 6;
			mes "[Lune]";
			mes "?! Sure, work is important, but I don't think you should break your word!";
			mes "Oh, I've been soooooo I Laila ......";
			goto L_CLOSE;
		}
	} else {
		EMOTION 18;
		mes "[Lune]";
		mes "As you can see, I'm managing the requests - there may be some that you can take, so let me know if you want to take them.";
		next;
		menu "You seem to be in a good mood.",-;
		emotion 43;
		mes "[Lune]";
		mes "Uh-huh, you know what I mean?";
		mes "Next time, Mido is treating me to a famous fine dining restaurant - I'm sure it will be amazingly delicious. ......";
		next;
		menu "Lune, you slob!" ,-;
		EMOTION 40;
		mes "[Lune]";
		mes "Ah! What I did with me ......";
		mes "Embarrassing ......";
		mes "I'm sorry you had to see me in such a strange way.";
		next;
		emotion 52;
		mes "[Lune]";
		mes "Don't tell anyone else about this.";
		mes "If you talk about it, you can go to ......";
		mes "You'll be in big trouble!";
		goto L_CLOSE;
	}
L_OTHER:
	mes "[Lune]";
	mes "Is there anything else you want to talk about?";
	next;
	menu "yes",L_MENU, "no",L_NOTHX;
L_NOTHX:
	mes "[Lune]";
	mes "If you have something to tell me, please tell me right away.";
	goto L_CLOSE;
L_CLOSE:
	close2;
	cutin "jpn_run01",255;
	end;
OnInit:
	setarray 'QUE_NAMES$, "That girl I'm interested in", "Box of Miracles", "I want to deliver an apology", "Collect ingredients for sweets", "Deliver sweets", "Help with experiments", "Rescue dungeon", "I want to be an adventurer";
	setarray 'QUE_CHAP$,"","①","②","③","④","⑤","⑥","⑦","⑧","⑨";
	setarray 'QUE_NAMEIDS, 0,0,0,0,0,0,0,0,0, 1,1,1,1,1,1,1,1,1, 2,3,4,4,4,4,4,5,3, 6,7,6,7,6,7,6,7,6, 8,8,8,8,8,8,8,8,8;
	setarray 'QUE_CHAPTERS,1,2,3,4,5,6,7,8,9, 1,2,3,4,5,6,7,8,9, 0,1,1,2,3,4,5,0,2, 1,1,2,2,3,3,4,4,5, 1,2,3,4,5,6,7,8,9;
	setarray 'QUE_REQUIRE,1,12,15,18,21,24,27,30,33, 1,13,16,19,22,25,28,31,34, 1,14,17,20,23,26,29,32,35, 1,14,17,20,23,26,29,32,35, 1,12,15,18,21,24,27,30,33;
	setarray 'QUE_BATTLE,0,0,0,1,1;
	setarray 'QUE_CREDITS,1,1,2,2,3,3,4,4,5;
	setarray 'QUE_CLIENT, 0,0,0,0,1,0,0,2,2, 3,3,3,3,3,3,3,3,3, 4,4,5,5,5,5,5,5,4, 6,7,6,7,6,7,6,7,6, 8,8,8,8,8,8,8,8,8;
	setarray 'QUE_COLOR$,"^0000FFBlue^000000","^FF0000Red^000000","^FF9900Orange^000000","^FFFF00Green^000000","^FFFFFFLight blue^000000";
	setarray 'QUE_EXP,160,293,485,710,995,1475,2237,4587,6984, 193,350,560,810,1180,1713,3445,5213,7888, 245,415,630,930,1252,1967,3997,5874,8839, 245,415,630,930,1252,1967,3997,5874,8839, 160,293,485,710,995,1475,2237,4587,6984;
	setarray 'QUE_JOB,104,160,334,608,1252,2294,3711,7295,10471, 121,190,387,798,1403,3058,4639,7936,12488, 140,225,445,1114,1823,3375,5663,8599,15614, 140,225,445,1114,1823,3375,5663,8599,15614, 104,160,334,608,1252,2294,3711,7295,10471;
	setarray 'TST_REQUIR,5,10,15,20,30,40,45;
	setarray 'TST_REQUIR_LV,14,19,24,29,31,34,39;
	waitingroom "Lune request", 0;
end;

	// function Get Quest Lv -----------------------------
	function GetQueLv {
		switch (getarg(0)) {
		case 0: set '@quelv,AC_QUEST_LV_0; break;
		case 1: set '@quelv,AC_QUEST_LV_1; break;
		case 2: set '@quelv,AC_QUEST_LV_2; break;
		case 3: set '@quelv,AC_QUEST_LV_3; break;
		case 4: set '@quelv,AC_QUEST_LV_4; break;
		}
		return '@quelv;
	}

	// function Get quest selection list (Argument(0)) 0:Contracted 1:Confirmed 2:Reported -----------------------------
	function GetQuestSelectList {
		set '@arg,getarg(0);
		set '@quelist$, "";
		set '@quecount, 0;
		setarray '@queidlist,0;
		set '@queidcount,0; //getarraysize cannot be used because it starts from 0
		for(set '@i,0; '@i<5; set '@i,'@i+1) {
			//Get quest lvl and status
			switch ('@i) {
			case 0: set '@quelv,AC_QUEST_LV_0; set '@quest,AC_QUEST_ST_0; break;
			case 1: set '@quelv,AC_QUEST_LV_1; set '@quest,AC_QUEST_ST_1; break;
			case 2: set '@quelv,AC_QUEST_LV_2; set '@quest,AC_QUEST_ST_2; break;
			case 3: set '@quelv,AC_QUEST_LV_3; set '@quest,AC_QUEST_ST_3; break;
			case 4: set '@quelv,AC_QUEST_LV_4; set '@quest,AC_QUEST_ST_4; break;
			}
			if( //display requests that have already been received
				('@arg==0 && '@quest>0) ||
				// Do not display requests that have not been received.
				('@arg==1 && '@quest==0) ||
				//Not completed
				('@arg==2 && '@quest!=99) ||
				//Do not show cleared
				'@quelv==9
			) {
				continue;
			}
			set '@idx,'@i*9+'@quelv;
			//determine text color
			if(
				//Lvs that are not enough are grayed out
				('@arg==0)*(BaseLevel>='QUE_REQUIRE['@idx] && '@quest==0) ||
				// Requests received
				('@arg==1) ||
				// Requests that can be reported
				('@arg==2)
			){
				if('QUE_BATTLE['@i]) set '@color$,"^FF0000";
				else set '@color$,"^008800";
				set '@quecount,'@quecount+1;
			} else {
				set '@color$,"^777777";
			}
			if('@arg==0) set '@quelist$,'@quelist$ + '@color$ +"Lv"+ 'QUE_REQUIRE['@idx] +"Over "+ 'QUE_NAMES$['QUE_NAMEIDS['@idx]] + 'QUE_CHAP$['QUE_CHAPTERS['@idx]] +" "+ 'QUE_CREDITS['@quelv] + "Unit^000000:";
			else		 set '@quelist$,'@quelist$ + '@color$ +'QUE_NAMES$['QUE_NAMEIDS['@idx]] + 'QUE_CHAP$['QUE_CHAPTERS['@idx]] +"^000000" + ('@arg==2 || '@i<4 ? ":" : "");
			set '@queidlist['@queidcount],'@i;
			set '@queidcount,'@queidcount+1;
		}
		set '@quelist$,'@quelist$ + ('@arg==0 ? "Do not accept request" : ('@arg==2 ? "Do not report" : "") );
		set '@queidlist['@queidcount],99;

		set getarg(1),'@queecount;
		set getarg(2),'@quelist$;
		copyarray getarg(3),'@queidlist,'@queidcount+1;
		set getarg(4),'@queidcount;
		return;
	}

	// function Get quest name -----------------------------
	function GetQuestName {
		set '@queid,getarg(0);
		set '@quelv, GetQueLv('@queid);
		set '@idx,'@queid*9+'@quelv;
		//determine text color
		if(BaseLevel>='QUE_REQUIRE['@idx]){
			if('QUE_BATTLE['@queid]) set '@color$,"^FF0000";
			else set '@color$,"^008800";
		} else {
			set '@color$,"^777777";
		}
		set '@que_name$,'@color$ + 'QUE_NAMES$['QUE_NAMEIDS['@idx]] + 'QUE_CHAP$['QUE_CHAPTERS['@idx]] + "^000000";
		set getarg(1),'@que_name$;
		return;
	}

	// function Experience/JOB Experience Granted -----------------------------
	function GiveExp {
		set '@que_id,getarg(0);
		set '@quelv, GetQueLv('@que_id);
		set '@idx,'@queid*9+'@quelv;
		getexp 'QUE_EXP['@idx],'QUE_JOB['@idx];
		set AC_CREDIT,AC_CREDIT+'QUE_CREDITS['@quelv];
		switch ('@que_id) {
		case 0: set AC_QUEST_LV_0,AC_QUEST_LV_0+1; set AC_QUEST_ST_0,0; break;
		case 1: set AC_QUEST_LV_1,AC_QUEST_LV_1+1; set AC_QUEST_ST_1,0; break;
		case 2: set AC_QUEST_LV_2,AC_QUEST_LV_2+1; set AC_QUEST_ST_2,0; break;
		case 3: set AC_QUEST_LV_3,AC_QUEST_LV_3+1; set AC_QUEST_ST_3,0; break;
		case 4: set AC_QUEST_LV_4,AC_QUEST_LV_4+1; set AC_QUEST_ST_4,0; break;
		}
		return;
	}
}
