//====================================================================
// Ragnarok Online New Novice Script by refis
// - CHANGE_NV
// - CHANGE_NV
// +0x1 Login
// +0x2 South dead end
// +0x4 North dead end
//====================================================================

new_1-1.gat,53,111,0 script #start_jp 139,1,1,{
OnTouch:
	if(CHANGE_NV & 0x1 == 0) {
		cutin "start_jp.bmp",3;
		set CHANGE_NV,CHANGE_NV|0x1;
	}
	end;
}

new_1-1.gat,53,114,4 script Farah 727,{
	mes "[Farah]";
	mes "Welcome to the continent of Midgard!" ;
	mes "... I see you are from another world on a mission of adventure." ;
	mes "Your name is ......." ;
	mes ""+strcharinfo(0);
	mes "...... Nice name." ;
	next;
	mes "[Farah]";
	mes "I'm Farah."
	mes "I show people who come to our world around where we teach them the basics of adventure." ;
	mes "Yeah. Mm-hmm..." ;
	mes "You have good qualities." ;
	next;
	mes "[Farah]";
	mes "If you are as good a person as you are, I think you can quickly grow into a fine adventurer by studying the basics of adventure at the "Adventurer Academy"." ;
	next;
	mes "[Farah]";
	mes "Well then, I'll take you to the "Adventurer Academy" as soon as possible...is there anything you want to ask me?" ;
	mes "I can answer some simple questions." ;
	while(1) {
		next;
		switch(select("Where am I?" , "What is the Adventurer Academy?" , "Tell me about the basic operations", "Go to the Adventurer Academy right away")) {
		case 1:
			mes "[Farah]";
			mes "This is the continent of Midgard." ;
			mes "It has been peaceful for a long time, but recently demons have appeared and strange things have been happening in many places, and something big is about to happen." ;
			next;
			mes "[Farah]";
			mes "The news has become widely known, and adventurers from many worlds have come to this continent to find out what is going on."; next; mes "[Farah]" ;
			next;
			mes "[Farah]";
			mes "I want you to grow as an adventurer, unraveling the mysteries of Midgard, little by little." ;
			continue;
		case 2:
			mes "[Farah]";
			mes "The Adventurer Academy is a place where adventurers who visit this continent are taught how to operate and become stronger." ;
			next;
			mes "[Farah]";
			mes "First, you should go to the Academy to learn about the knowledge and techniques necessary for adventuring, as well as the first step to becoming a strong adventurer: your profession." ;
			continue;
		case 3:
			mes "[Farah]";
			mes "Basic operations. ......." ;
			mes "First, let's talk about how to move. When you want to move, just select the place you want to move to with the cursor, click on it, and it will move you there." ;
			next;
			mes "[Farah]";
			mes "Then, if you see someone you want to talk to, just hover over that person and click after the butterflies appear." ;
			mes "You've mastered this already." ;
			next;
			mes "[Farah]";
			mes "Other basic movements and actions, such as picking up items or attacking monsters with weapons, are mainly controlled with the mouse." ;
			mes "Make sure you remember that part." ;
			next;
			mes "[Farah]";
			mes "That's about all I can teach you." ;
			mes "You can learn more about how to operate it at the Adventurer's Academy." ;
			continue;
		case 4:
			break;
		}
		break;
	}
	mes "[Farah]";
	mes "When you get to the Adventurer's Academy, look for the receptionist, Ella." ;
	mes "Talk to her and complete the enrollment process and you'll be able to take various courses." ;
	next;
	mes "[Farah]";
	mes "Then I'll send you to the academy." ;
	mes "I'm excited to see what you can do!" ;
	set CHANGE_NV,0;
	savepoint "ac_cl_room.gat",44,32;
	warp "ac_cl_room.gat",44,32;
	end;
}

new_1-1.gat,51,105,0 script #nv_s1 139,11,0,{
OnTouch:
	if(CHANGE_NV & 0x2 == 0) {
		mes "-this one seems to be a dead end-";
		emotion 0,"";
		set CHANGE_NV,CHANGE_NV|0x2;
		close;
	}
	end;
}
new_1-1.gat,48,77,0 script #nv_s2 139,6,1,{
OnTouch:
	mes "-I can see the endless sea--I can smell the tide--";
	emotion 2,"";
	close;
}
new_1-1.gat,57,124,0 script #nv_n1 139,10,0,{
OnTouch:
	if(CHANGE_NV & 0x4 == 0) {
		mes "-this one seems to be a dead end-";
		emotion 0,"";
		set CHANGE_NV,CHANGE_NV|0x4;
		close;
	}
	end;
}
new_1-1.gat,67,154,0 script #nv_n2 139,10,1,{
OnTouch:
	mes "-I can see the endless ocean--a gentle breeze is blowing through.";
	emotion 2,"";
	close;
}
new_1-1.gat,67,112,0 script #nv_e 139,0,2,{
OnTouch:
	warp "new_1-1.gat",53,111;
	end;
}

new_1-2.gat,38,182,3 script Adventurer Academy Info Desk# 47,{
	mes "[Adventurer Academy Info Desk]";
	mes "Oh?" ;
	mes " I see that some of you are still in the training center." ;
	next;
	mes "[Adventurer Academy Info Desk]";
	mes "I am the one who provides information to the Adventurer Academy." ;
	next;
	mes "[Adventurer Academy Info Desk]";
	mes "I am here to guide you to the Adventurer Academy, a place where you can learn the knowledge you will need for your adventures." ;
	next;
	mes "[Adventurer Academy Info Desk]";
	mes "When you arrive at the academy, first look for the receptionist, Ms. Ella." ;
	mes " Once you see her, you will be able to complete the enrollment process." ;
	next;
	mes "[Adventurer Academy Info Desk]";
	mes "That's all I have to say." ;
	mes "Then I will take you to the Academy." ;
	warp "ac_cl_room.gat",44,32;
	end;
}

// obsolete below.
//====================================================================
// Ragnarok Online Novice Script by yukito
// - CHANGE_NV
// - CHANGE_NV
// +0x1 Farah pattern 1
// +0x2 Farah pattern 2
// +0x4 Farah end
// +0x8 Receptionist end
// +0x10 End of Interface Instructor
// +0x20 Skill Instructor ends
// +0x40 Item Instructor ends
// +0x80 Capra BaseLvUp ends
// +0x100 End of Kapla Job LvUp
// +0x200 End of Armine
// +0x400 End of first combat training reception
// +0x800 End of second combat training reception
// +0x1000 End of Job Instructor
// +0x2000 End of aptitude test
//====================================================================

//==========================================
// out of training area
//------------------------------------------

/*
new_1-1.gat,53,114,4 script Farah 727,{
	switch(CHANGE_NV &0x7) {
	case 0:
		mes "[Farah]";
		mes "Oh my, have I never seen your face before?" ;
		mes "Welcome to our world." ;
		mes "Well, your name is ......." ;
		mes ""+strcharinfo(0);
		mes "...... That's a nice name." ;
		next;
		mes "[Farah]";
		mes "I guess it's a good thing we met here." ;
		mes "I'm here to help." ;
		mes "How do I get around? or where should I go? or anything else you want to ask me?" ;
		next;
		switch(select("Where do I go?" , "Tell me about basic operations", "Who are you?")) {
			case 1:
				mes "[Farah]";
				mes "Can you see the bridge over the river over there?" ;
				mes "It's wooden and makes a squeaky sound, but ......" ;
				mes "When you cross it, there's a castle." ;
				mes "You can go into that castle." ;
				next;
				mes "[Farah]";
				mes "There is a ^4A4AFF swirling light^000000 at the small entrance to the building." ;
				mes "It connects space to space." ;
				mes "It's something you have to go through whenever you move somewhere." ;
				next;
				mes "[Farah]";
				mes "Yes, can you move?" ;
				mes "Align the triangle with the place you want to move and click." ;
				mes "You can do it like you talked to me." ;
				mes "It's okay, right?" ;
				next;
				mes "[Farah]";
				mes "Well, go to the Novice Training Ground at the end of the bridge there." ;
				mes "There's a soldier near the entrance who can give you directions, okay?" ;
				mes "Uh-huh." ;
				set CHANGE_NV,CHANGE_NV|0x1;
				close;
			case 2:
				mes "[Farah]";
				mes "Basic operation: ......" ;
				mes "Do you know the words click, double-click, and drag?" ;
				mes "If you press the mouse button once, it's a click, right?" ;
				mes "Pressing twice in a row is a double click." ;
				next;
				mes "[Farah]";
				mes "Dragging is moving the mouse up, down, left, or right with the mouse clicked." ;
				mes "You often use it to select text or move files around." ;
				next;
				mes "[Farah]";
				mes "You should understand these basic things first." ;
				mes "You'll have a lot of opportunities to use them." ;
				mes "And ......." ;
				next;
				mes "[Farah]";
				mes "You'll learn everything you need to know about adventure in the castle just beyond that bridge." ;
				mes "It's a place for adventure beginners like you. Then go to the Novice Training Ground." ;
				next;
				mes "[Farah]";
				mes "Go to the entrance of the building and there is a ^4A4AFF swirling light^000000." ;
				mes "Just click there and jump in." ;
				mes "Don't worry, there are attendants inside. Hmmm." ;
				set CHANGE_NV,CHANGE_NV|0x1;
				close;
			case 3:
				mes "[Farah]";
				mes "What, me? I'm Farah." ;
				mes "Perhaps you are interested in your sister?" ;
				mes "What, no?" ;
				mes "Mmm~!" ;
				mes "Get your ass to the training ground!" ;
				set CHANGE_NV,CHANGE_NV|0x2;
				close;
		}
	case 1:
		mes "[Farah]";
		mes "Oh, what's wrong?" ;
		mes "Are you hesitating to go?" ;
		mes "You can learn a lot of things at Novice Training Ground. And not only that, they also provide you with weapons and recovery items." ;
		next;
		mes "[Farah]";
		mes "For example, ...... See, you can also gain experience like this." ;
		set CHANGE_NV,CHANGE_NV|0x4;
		getexp 9,0;
		next;
		mes "[Farah]";
		mes "It might be a little daunting for you, but it's well worth the trip." ;
		mes "What you learn there will come in handy someday." ;
		mes "...... Don't forget your first love." ;
		close;
	case 2:
		mes "[Farah]";
		mes "Oh my, you're looking good." ;
		mes "Do you have any more questions for me?" ;
		mes "Hmm, or do you want to talk to me?" ;
		mes "Well, what can I help you with ......?" ;
		next;
		mes "[Farah]";
		mes "Well, how about we go to the Novice Training Ground and see?" ;
		mes "Just cross the bridge you see there and go inside the big castle. Once you're inside, there's an attendant who will show you around." ;
		next;
		mes "[Farah]";
		mes "If you don't see the entrance, try clicking and holding your mouse and dragging it left or right." ;
		mes "Then the screen will rotate and you should be able to see it." ;
		next;
		mes "[Farah]";
		mes "Well, have a good day." ;
		mes "And go learn some manners for a lady like me." ;
		mes "This is a gift from me." ;
		set CHANGE_NV,CHANGE_NV|0x4;
		getexp 9,0;
		close;
	default: //when 5,6
		mes "[Farah]";
		mes "Novice Training Ground is just across the bridge there." ;
		mes "It may be hard work, with lectures and fighting, but I'm sure it will help." ;
		mes "You should definitely go there." ;
		close;
	}
}

//==============================================================
new_1-1.gat,66,114,0 script Signboard 111,{
	mes "^FF0000=================================^000000^FF0000= ^E708AD[welcome] ^CE0000 first^FF9400 heart^7BFF00 person ^00FF00 shu^00FFFFFFF knead^0000FFF place ^E708AD[welcome] ^FF0000=^000000^FF0000=================================^000000";
	close;
}

//==============================================================
new_1-1.gat,144,116,2 script Police Officer 105,{
	mes "[Novice Training GroundPolice Officer]";
	mes "Welcome to Novice Training Ground!" ;
	mes "Once inside the castle, you will find the Novice Training Ground." ;
	close;
}

new_1-1.gat,144,107,2 script Police Officer 105,{
	if(rand(2)) {
		mes "[Novice Training GroundPolice Officer]";
		mes "Nice to see you here!" ;
		mes "Welcome to Novice Training Ground!" ;
		mes "Novice Training Ground will do its best to help you beginners who are starting a new life to improve yourselves and build a future full of hope!"; mes "[Novice Training GroundPolice Officer]"; mes "Welcome to Novice Training Ground! ;
	}
	else {
		mes "[Novice Training GroundPolice Officer]";
		mes "Come on!  Let's go!  Novices!" ;
		mes "On this road you run, the sun of tomorrow will rise!" ;
	}
	close;
}


//==========================================
// Reception
//------------------------------------------

new_1-2.gat,100,29,4 script Novice Training GroundReceptionist 86,{
	mes "[Novice Training GroundReceptionist]";
	mes "Welcome." ;
	mes "^FF0000Novice Training Ground^000000." ;
	mes "If you are new to Ragnarok Online, please first select the ^019CFFNovice Training Ground Introduction^000000 menu for more information." ;
	while(1) {
		next;
		switch(select("Create Novice Training Ground application form", "Start Ragnarok Online immediately","^019CFFNovice Training Ground Introduction^000000", "Stop")) {
		case 1:
			mes "[Novice Training GroundReceptionist]";
			mes "Your application has been accepted." ;
			mes "For more information about each course at the training ground, please contact the Guide for each course." ;
			next;
			if(CHANGE_NV &0x8 == 0) {
				mes "[Novice Training GroundReceptionist]";
				mes "You will receive a training assistance fee, 50 Zeny. If you have any questions during the course progression, please ask Info Staff in the central hall." ;
				mes "Then we will move you to the Novice Training Ground." ;
				set CHANGE_NV,CHANGE_NV|0x8;
				set Zeny,Zeny+50;
				close2;
			}
			warp "new_1-2.gat",100,70;
			end;
		case 2:
			mes "[Novice Training GroundReceptionist]";
			mes "Yes, I understand." ;
			mes "I wish you success and good luck." ;
			close2;
			set CHANGE_NV,0;
			switch(rand(6)) {
				case 0: savepoint "prontera.gat",273,354; break
				case 1: savepoint "morocc.gat",160,94; break
				case 2: savepoint "geffen.gat",120,100; break
				case 3: savepoint "payon.gat",70,100; break
				case 4: savepoint "alberta.gat",116,57; break
				case 5: savepoint "izlude.gat",94,103; break
			}
			warp "SavePoint",0,0;
			end;
		case 3:
			mes "[Novice Training GroundReceptionist]";
			mes "This Novice Training Ground provides a basic explanation of Ragnarok Online so that players who are new to the game Ragnarok Online can enjoy playing it." ;
			next;
			mes "[Novice Training GroundReceptionist]";
			mes "We also recommend the most suitable job for players through combat training to experience real game situations and through conversations with instructors and personnel."; next; mes "[Novice Training GroundReceptionist]" ;
			next;
			mes "[Novice Training GroundReceptionist]";
			mes "This training ground was established with the support of the Ministry of Education and Human Resources of the Kingdom of Rune-Midgarts to provide the above education to beginners." ;
			next;
			mes "[Novice Training GroundReceptionist]";
			mes "[Novice Training Ground Receptionist]"; mes "[Novice Training Ground Receptionist]"; mes "[Novice Training Ground Receptionist]"; mes "[Novice Training Ground Receptionist]" ;
			mes "The first course will guide you through the basic things you need to know to play Ragnarok Online." ;
			next;
			mes "[Novice Training GroundReceptionist]";
			mes "In the second course, you will practice combat in places where monsters appear based on the theory you learned in the first course." ;
			mes "After all courses are completed, we will explain each profession." ;
			next;
			mes "[Novice Training GroundReceptionist]";
			mes "We will also conduct a vocational aptitude test where you will be asked to fill out a questionnaire to find the most suitable occupation for each player through personality assessment and depth psychological analysis." ;
			mes "We will then ask you which profession you would like to choose." ;
			next;
			mes "[Novice Training GroundReceptionist]";
			mes "If you would like to enter the Novice Training Ground you were introduced to, please select "Create Novice Training Ground Application Form" in the next menu." ;
			continue;
		case 4:
			mes "[Novice Training GroundReceptionist]";
			mes "Please take your time and think about it." ;
			close;
		}
	}
}


//==========================================
// center room
//------------------------------------------

new_1-2.gat,99,105,3 script interface instructor 751,{
	if(CHANGE_NV &0x10 == 0) {
		mes "[Instructor Chris]";
		mes "I see you are new here." ;
		mes "May I see your course certificate?" ;
		next;
		mes "[Instructor Chris]";
		mes "Yes, this is no problem." ;
		mes "So let's teach you about the basic interface to " +strcharinfo(0)+ "Mr." ;
		next;
		mes "[Instructor Chris]";
		mes "This is not mandatory, so if you would prefer not to do this, please let me know." ;
		next;
		switch(select("I want to take a lecture on interfaces", "More than talk, actual practice!"); mes "[Instructor Chris]"; mes "[Instructor Chris]"; mes "[Instructor Chris]"; mes "This is not mandatory. , "stop")) {
		case 1:
			mes "[Instructor Chris]";
			mes "I understand." ;
			mes "Then we will give the lecture." ;
			mes "May I?" ;
			next;
			mes "[Instructor Chris]";
			mes "All windows can be positioned by dragging, but let's discuss each window based on its position in the initial stage." ;
			next;
			mes "[Instructor Chris]";
			mes "First look at the upper left corner of the screen." ;
			mes "You see a window with your name, level, etc. This will also tell you how much experience you have gained. This will be your character's ^4A4AFF basic information ^000000." ;
			next;
			if(BaseLevel < 8) {
				mes "[Instructor Chris]";
				mes "Now, we're going to increase the Base experience level, so watch how the experience level portion of the Basic Info window changes." ;
				mes "How is it?" ;
				if(BaseLevel == 7) getexp 155,0;
				else if(BaseLevel == 6) getexp 115,0;
				else if(BaseLevel == 5) getexp 78,0;
				else if(BaseLevel == 4) getexp 37,0;
				else if(BaseLevel == 3) getexp 26,0;
				else if(BaseLevel == 2) getexp 17,0;
				else if(BaseLevel == 1) getexp 10,0;
			}
			else {
				mes "[Instructor Chris]";
				mes "...... Ah, it looks like the level is quite high." ;
				mes "Then you don't need any more experience." ;
				mes "Then ......." ;
			}
			set CHANGE_NV,CHANGE_NV|0x10;
			next;
			mes "[Instructor Chris]";
			mes "You can also view the items and friends list from the menu displayed in the Basic Info window." ;
			next;
			mes "[Instructor Chris]";
			mes "And then there is experience, apart from the Base experience I mentioned earlier, there is also Job experience." ;
			mes "In order to use ^4A4AFF skills, you need to gain this Job experience and the skill points you get from it ^000000." ;
			next;
			mes "[Instructor Chris]";
			mes "The window at the bottom left of the screen is called the chat window." ;
			mes "You can see past conversations by scrolling the bar on the right." ;
			next;
			mes "[Instructor Chris]";
			mes "You can also use the buttons on the right to change the conversation to the whole group, party, or guild." ;
			mes "The chat window is always open for conversation, so you can easily talk to people you know." ;
			next;
			mes "[Instructor Chris]";
			mes "There is a mini-map in the upper right corner of the screen." ;
			mes "It shows the current position of you, your party members, and guild members." ;
			next;
			mes "[Instructor Chris]";
			mes "In the city and field, the ^4A4AFF red dot is the exit ^000000 on the map for reference." ;
			next;
			mes "[Instructor Chris]";
			mes "Now press each menu in the Basic Info window to open everything once." ;
			mes "You can see your items, equipment, ability values, etc." ;
			next;
			mes "[Instructor Chris]";
			mes "That might have been boring." ;
			if(JobLevel < 7) {
				mes "Let's give you a little experience." ;
				mes "Now for Job experience." ;
				mes "Open the skills window and try to raise your basic skills." ;
				if(JobLevel == 6) getexp 0,151;
				else if(JobLevel == 5) getexp 0,91;
				else if(JobLevel == 4) getexp 0,40;
				else if(JobLevel == 3) getexp 0,28;
				else if(JobLevel == 2) getexp 0,18;
				else if(JobLevel == 1) getexp 0,10;
			}
			else {
				mes "...... Ah, it looks like the level is quite high." ;
				mes "Then you don't need any more experience." ;
				mes "Then ......." ;
			}
			next;
			mes "[Instructor Chris]";
			mes "Please ask your instructor Edwin for more details." ;
			mes "He will be happy to teach you." ;
			mes "This is a small gift from me." ;
			getitem 2352,1;
			close;
		case 2:
			mes "[Instructor Chris]";
			mes "Now, let's give you a real combat experience." ;
			mes "And if you feel you don't have enough knowledge, you can always come back." ;
			close2;
			warp "new_1-2.gat",28,178;
			end;
		case 3:
			emotion 19;
			close;
		}
	}
	if(CHANGE_NV &0x20 == 0 || CHANGE_NV &0x40 == 0) {
		set '@word$,(CHANGE_NV &0x20 == 0)? "skill": "item";
		mes "[Instructor Chris]";
		mes "How can I help you?" ;
		mes "May I see your course certificate?" ;
		mes "Oh, it looks like you haven't had your " +'@word$+ "related lecture yet." ;
		mes ""+'@word$+ "If you are an instructor, my " +((CHANGE_NV &0x20)? "right": "left")+ "I am in"." ;
		next;
		switch(select("Well, I'd like to take a lecture on "+'@word$+"", "I'm bored if all I do is talk ......" , "oh, so ......")) {
		case 1:
			if('@word$ == "skills") {
				mes "[Instructor Chris]";
				mes "If you know how to use your skills, you'll have a much easier time in battle." ;
				mes "So let's send you down to Skill Instructor." ;
				close2;
				warp "new_1-2.gat",84,107;
				end;
			}
			mes "[Instructor Chris]";
			mes "He'll teach you how to use items, utilize shortcuts, and many other things." ;
			mes "So let's send them down to the Item Instructor." ;
			close2;
			warp "new_1-2.gat",115,107;
			end;
		case 2:
			mes "[Instructor Chris]";
			mes "So let's send him to the second course combat training map." ;
			next;
			if(select("Oh, no, not yet.", "Send me")== 1) {
				mes "[Instructor Chris]";
				mes "I see. ......" ;
				mes "Please give me a shout if you need anything else." ;
				close;
			}
			mes "[Instructor Chris]";
			mes "Well, I wish you the best of luck!" ;
			close2;
			warp "new_1-2.gat",28,178;
			end;
		case 3:
			emotion 19;
			close;
		}
	}
	mes "[Instructor Chris]";
	mes "I see you have completed all of your required lectures." ;
	mes "Have you also listened to the lecturers?" ;
	mes "Next up is the combat training: ......." ;
	mes "Would you like to proceed to the second course?" ;
	next;
	switch(select("Yes, I want to go on to the next course", "No, I want to study some more", "I want to go to the city immediately")) {
	case 1:
		mes "[Instructor Chris]";
		mes "Okay, I understand." ;
		mes "The next course is Combat Practice." ;
		mes "Please listen carefully to your instructor and be ready for the exam." ;
		mes "May Odin bless you." ;
		close2;
		warp "new_1-2.gat",28,178;
		end;
	case 2:
		mes "[Instructor Chris]";
		mes "I understand." ;
		mes "The required lectures are mainly basic, so you should listen to the lecturers for the parts that are missing." ;
		mes "That way you will learn more in depth." ;
		next;
		mes "[Instructor Chris]";
		mes "If you have any questions, you can always ask." ;
		close;
	case 3:
		mes "[Instructor Chris]";
		mes "Do you want to go to town?" ;
		mes "When you have learned enough in the training hall, please talk to ^4A4AFFKafra Staff^000000 on my left." ;
		next;
		mes "[Instructor Chris]";
		mes "Kafra Service provides city-to-city transportation and item storage services in the various regions." ;
		mes "You can actually use their services." ;
		next;
		mes "[Instructor Chris]";
		mes "...... Maybe one day we will fight together." ;
		mes "Always remember to improve yourself." ;
		mes "May Odin bless you." ;
		close;
	}
}

//==============================================================
new_1-2.gat,83,111,3 script Skill Instructor 753,{
	if(CHANGE_NV &0x20 == 0) {
		mes "[Instructor Rhino]";
		mes ""+strcharinfo(0)+ "!"" ;
		mes "Good name!" ;
		mes "Let's start the lecture then." ;
		next;
		switch(select("What are you going to teach me?" , "I actually want to fight!" , "I'm not going to")) {
		case 1:
			mes "[Instructor Rhino]";
			mes "I'm a man who puts everything in his fists!" ;
			mes "So here's a very important special move for you: ......" ;
			mes "No, I'm going to teach you how to use your skills." ;
			mes "First, let's give you some skills." ;
			next;
			mes "[Instructor Rhino]";
			mes "The skill window can be opened by pressing the ^4A4AFFskill^000000 button in the Basic Info window." ;
			next;
			mes "[Instructor Rhino]";
			mes "Conversely, to close it, hold down the ^4A4AFFalt key and press the s key ^000000." ;
			mes "From now on, this kind of expression is called 'alt+s', so remember that." ;
			next;
			mes "[Instructor Rhino]";
			mes "Did you open the window?" ;
			mes "Do you see the icon named Basic Functions?" ;
			if(JobLevel < 7) {
				mes "On the bottom side, you see skill points: 1 and a number." ;
				mes "Press the "LvUp" sign next to the basic skill icon!" ;
				if(JobLevel == 6) getexp 0,151;
				else if(JobLevel == 5) getexp 0,91;
				else if(JobLevel == 4) getexp 0,40;
				else if(JobLevel == 3) getexp 0,28;
				else if(JobLevel == 2) getexp 0,18;
				else if(JobLevel == 1) getexp 0,10;
			}
			else {
				mes "Oh, you were high level ......" ;
				mes "Then I don't see the "LvUp" indicator. Well, you know what I'm talking about, so that's good." ;
			}
			set CHANGE_NV,CHANGE_NV|0x20;
			next;
			mes "[Instructor Rhino]";
			mes "How's it going?" ;
			mes "If you want to know more, ask the instructor, a guy named Priest Judas." ;
			mes "...... Hmmm, I'm sure he had some skills he wanted to teach you. ......" ;
			next;
			mes "[Instructor Rhino]";
			mes "Oh, yes!" ;
			mes "Let me teach you the skill 'First Aid'." ;
			mes "This is a pretty useful skill when you are injured." ;
			next;
			mes "^4A4AFF- I have mastered the skill "First Aid". -^000000";
			skill 142,1,0;
			next;
			if(JobLevel < 7) {
				mes "^4A4AFF- Job experience gained. -^000000";
				if(JobLevel == 6) getexp 0,151;
				else if(JobLevel == 5) getexp 0,91;
				else if(JobLevel == 4) getexp 0,40;
				else if(JobLevel == 3) getexp 0,28;
				else if(JobLevel == 2) getexp 0,18;
				else if(JobLevel == 1) getexp 0,10;
			}
			else {
				mes "^4A4AFF- JobLevel is so high that it -- level -- doesn't seem to go up right away. -^000000";
			}
			} next;
			percentheal -50,0;
			mes "[Instructor Rhino]";
			mes "Now open the skill window!" ;
			mes "You see ^4A4AFF First Aid^000000?" ;
			mes "You can double click on it to use it." ;
			mes "Come on, use it!" ;
			next;
			mes "[Instructor Rhino]";
			mes "How's that working out for you?" ;
			mes "By the way, using the skill will consume a certain amount of SP." ;
			mes "First aid will restore some but not all of your strength when you use it." ;
			mes "It's a useful skill in the beginning." ;
			next;
			mes "[Instructor Rhino]";
			mes "You must be tired of listening to me all the time." ;
			if(BaseLevel < 8) {
				mes "Here's your reward." ;
				mes "I'm a fat man, you know." ;
				if(BaseLevel == 7) getexp 155,0;
				else if(BaseLevel == 6) getexp 115,0;
				else if(BaseLevel == 5) getexp 78,0;
				else if(BaseLevel == 4) getexp 37,0;
				else if(BaseLevel == 3) getexp 26,0;
				else if(BaseLevel == 2) getexp 17,0;
				else if(BaseLevel == 1) getexp 10,0;
			}
			else {
				mes "Looks like you're doing pretty well." ;
				mes "You're serious!  Ha ha ha!"
			}
			next;
			mes "[Instructor Rhino]";
			mes "So much for my lecture." ;
			mes "Hmm? You're relieved that my talk was so short?" ;
			mes "Then go listen to the others." ;
			mes "For example, Priest Judas, the instructor, can tell you more about the skills." ;
			next;
			switch(select("I want to look around a little more", "Now for the real work!" , "Enough already.")) {
				case 1:
					mes "[Instructor Rhino]";
					mes "Okay, go talk to the other instructors and lecturers, they should all be willing to help you." ;
					mes "Here, go for it!" ;
					close;
				case 2:
					break;
				case 3:
					emotion 23;
					close;
			}
			//fall through
		case 2:
			mes "[Instructor Rhino]";
			mes "Oh, that's a lot of bluster." ;
			mes "It sure is nice to actually experience combat." ;
			mes "Well, let's send you to the combat training map." ;
			mes "Go ahead and fight as much as you want!" ;
			close2;
			warp "new_1-2.gat",28,178;
			end;
		case 3:
			emotion 23;
			close;
		}
	}
	if(CHANGE_NV &0x10 ==0 || CHANGE_NV &0x40 == 0) {
		set '@word$,(CHANGE_NV &0x10 == 0)? "interface": "item";
		mes "[Instructor Rhino]";
		mes "Is there anything you want to ask me?" ;
		mes "Hmm? You";
		mes '@word$+ "The lecture is";
		mes "Looks like you haven't yet." ;
		mes "Then go get it first!" ;
		mes "Ha ha ha ha!" ;
		next;
		switch(select('@word$+"Go get a lecture!" , "I'd rather have a real game than a talk", "No, thanks, I'll pass.")) {
		case 1:
			if('@word$ == "interface") {
				mes "[Instructor Rhino]";
				mes "Oh, go ahead and do that!" ;
				mes "Everything, it's all about the basics." ;
				mes "The interface instructor is in the middle." ;
				mes "Ha ha ha ha." ;
				close;
			}
			mes "[Instructor Rhino]";
			mes "Oh, go do that!" ;
			mes "As with anything, the basics are important." ;
			mes "Item Instructor is over there to my left." ;
			mes "Okay, service. I'll send it to you." ;
			close2;
			warp "new_1-2.gat",115,107;
			end;
		case 2:
			mes "[Instructor Rhino]";
			mes "Oh, that's a lot of bluster." ;
			mes "It sure is nice to actually experience combat." ;
			mes "Well, let's send you to the combat training map." ;
			mes "Go ahead and fight as much as you want!" ;
			close2;
			warp "new_1-2.gat",28,178;
			end;
		case 3:
			emotion 23;
			close;
		}
	}
	mes "[Instructor Rhino]";
	mes "What's going on?" ;
	mes "You've already finished all your lectures, haven't you?" ;
	mes "Haha~ Well, now you're in love with me here." ;
	mes "...... Huh?  No?" ;
	mes "Don't be so modest." ;
	next;
	mes "[Instructor Rhino]";
	mes "By the way, did you listen to Skill Tutor properly?" ;
	next;
	switch(select("I want to go to the next course", "This instructor?" , "I want to go to the city")) {
	case 1:
		mes "[Instructor Rhino]";
		mes "Oh!  You're going to do combat training." ;
		mes "Ohhh, I can't believe I have to send you to the entrance of that dangerous map ......." ;
		mes "My fists are wet with tears." ;
		next;
		mes "[Instructor Rhino]";
		mes "But most of all for your own good." ;
		mes "Let's send you on your way, for crying out loud." ;
		mes "Then take this fist!" ;
		close2;
		warp "new_1-2.gat",28,178;
		end;
	case 2:
		mes "[Instructor Rhino]";
		mes "Oh? By the looks of it, you didn't know." ;
		mes "We instructors focus on the really important basics." ;
		next;
		mes "[Instructor Rhino]";
		mes "But that's not quite enough, is it?" ;
		mes "Well, some people just need a general idea, but some people want to know a wide range of things, don't they?" ;
		next;
		mes "[Instructor Rhino]";
		mes "So, that's where the instructors come in for those hard-working people." ;
		mes "Now, go see them!" ;
		next;
		mes "[Instructor Rhino]";
		mes "I'm sure that guy in particular, 'Priest Judas', can tell you more about his skills. Well, he looks a little dangerous. ......" ;
		mes "By all means, take a look!" ;
		mes "Ha ha ha!" ;
		close;
	case 3:
		mes "[Instructor Rhino]";
		mes "If you're in town, you can go to ...... Kafra Staff is just down the street to the left from me, right?" ;
		mes "She'll give you a ride if you ask her." ;
		mes "Ha ha ha! You'll have to talk to her." ;
		close;
	}
}

//==============================================================
new_1-2.gat,115,111,3 script Item Instructor 726,{
	if(CHANGE_NV &0x40 == 0) {
		mes "[Instructor Alice]";
		mes "Hello!" ;
		mes "Nice to meet you, I guess?" ;
		mes "Shall I give you a lecture on items?" ;
		next;
		switch(select("Yeah, yeah! Item!" , "Uh, that's a little ......" , "No, I want to go to the city!")) {
		case 1:
			mes "[Instructor Alice]";
			mes "Ryokai!" ;
			mes "Let's start the lecture!" ;
			mes "Open the item window." ;
			next;
			mes "[Instructor Alice]";
			mes "Press the button named item in the basic information window and you'll see it." ;
			mes "By the way, items are categorized into consumables, equipment, and collectibles." ;
			next;
			mes "[Instructor Alice]";
			mes "How's that?  Do you understand?" ;
			mes "I'm going to give you a beginner's potion, double click on it and use it." ;
			set CHANGE_NV,CHANGE_NV|0x40;
			getitem 569,1;
			allowuseitem;
			percentheal -50,0;
			next;
			if(countitem(569) < 1) {
				mes "[Instructor Alice]";
				mes "Well done!" ;
				if(BaseLevel < 8) {
					mes "Yes, you're rewarded." ;
					if(BaseLevel == 7) getexp 155,0;
					else if(BaseLevel == 6) getexp 115,0;
					else if(BaseLevel == 5) getexp 78,0;
					else if(BaseLevel == 4) getexp 37,0;
					else if(BaseLevel == 3) getexp 26,0;
					else if(BaseLevel == 2) getexp 17,0;
					else if(BaseLevel == 1) getexp 10,0;
				}
				else {
					mes "That's just as well you have a high level." ;
				}
			}
			else {
				mes "[Instructor Alice]";
				mes "See, double click to use." ;
			}
			mes "...... Next, you're equipped." ;
			allowuseitem -1;
			next;
			mes "[Instructor Alice]";
			mes "Press equip on the left side of the item window." ;
			mes "That's where the items you can equip are displayed." ;
			next;
			mes "[Instructor Alice]";
			mes "I'll give you the items you can equip, so you can try them out!" ;
			mes "First, double click ^4A4AFF sandals! ^000000";
			getitem 2510,1;
			getitem 2414,1;
			getitem 5055,1;
			allowuseitem;
			next;
			if(getequipid(6) == 2414) {
				mes "[Instructor Alice]";
				mes "Well done!" ;
				if(BaseLevel < 8) {
					mes "Yes, you're rewarded." ;
					if(BaseLevel == 7) getexp 155,0;
					else if(BaseLevel == 6) getexp 115,0;
					else if(BaseLevel == 5) getexp 78,0;
					else if(BaseLevel == 4) getexp 37,0;
					else if(BaseLevel == 3) getexp 26,0;
					else if(BaseLevel == 2) getexp 17,0;
					else if(BaseLevel == 1) getexp 10,0;
				}
				else {
					mes "That's just as well you have a high level." ;
				}
			}
			else {
				mes "[Instructor Alice]";
				mes "Here, double click to equip it." ;
			}
			mes "Equip the other items in the same way." ;
			allowuseitem -1;
			next;
			mes "[Instructor Alice]";
			mes "Then press ^4A4AFFF12^000000 next." ;
			mes "You should see 9 little square columns appear." ;
			next;
			mes "[Instructor Alice]";
			mes "This is a shortcut window where you can register recovery items, skills, and equipment items by pulling them in with the mouse." ;
			next;
			mes "[Instructor Alice]";
			mes "And you can use it by pressing the keys from ^4A4AFFF1 to F9^000000 corresponding to each column." ;
			next;
			mes "[Instructor Alice]";
			mes "If you take a lecture on skills, you'll be taught first aid." ;
			mes "Let's register that icon in the shortcut window to try it out!" ;
			next;
			mes "[Instructor Alice]";
			mes "How's that? Did you get it?" ;
			mes "Oh yeah, you need skill points to use skills." ;
			mes "So, basic skills are passive, so you can't register them in the shortcut window, though." ;
			if(JobLevel < 7) {
				if(JobLevel == 6) getexp 0,151;
				else if(JobLevel == 5) getexp 0,91;
				else if(JobLevel == 4) getexp 0,40;
				else if(JobLevel == 3) getexp 0,28;
				else if(JobLevel == 2) getexp 0,18;
				else if(JobLevel == 1) getexp 0,10;
			}
			next;
			mes "[Instructor Alice]";
			mes "So much for the easy and well-supported Alice lecture!　Finally, I'll give you a few useful items. However, ......." ;
			mes "^FF0000Don't use fly wings or butterfly wings here. You don't want ^000000 to get lost." ;
			getitem 601,10;
			getitem 602,2;
			getitem 569,50;
			next;
			mes "[Instructor Alice]";
			mes "And this is ......" ;
			if(JobLevel < 7) {
				mes "Job experience as job change support!" ;
				if(JobLevel == 6) getexp 0,151;
				else if(JobLevel == 5) getexp 0,91;
				else if(JobLevel == 4) getexp 0,40;
				else if(JobLevel == 3) getexp 0,28;
				else if(JobLevel == 2) getexp 0,18;
				else if(JobLevel == 1) getexp 0,10;
			}
			else {
				mes "Woah, I was going to give you experience, but you're so high level!" ;
				mes "Then I guess I'm done with the reward." ;
			}
			mes "Good job!" ;
			next;
			switch(select("What now?" } mes "Good job!" ; next; switch(select("What are you going to do now?", "Let's go to the battle!" )) {
				case 1:
					mes "[Instructor Alice]";
					mes "If you haven't met any instructors yet, you should go to their lectures." ;
					mes "Because they can help you with a lot of things, just like me." ;
					mes "[Instructor Alice]"; mes "Or you could just look around." ;
					next;
					mes "[Instructor Alice]";
					mes "The instructors should be helpful enough." ;
					mes "If you're not sure who to talk to, ask someone nearby." ;
					close;
				case 2:
					break;
				case 3:
					mes "[Instructor Alice]";
					mes "...... See you later!" ;
					close;
			}
			break;
		case 2:
			mes "[Instructor Alice]";
			mes "You want the real game." ;
			mes "Do you want to go right away?" ;
			mes "Well, ...... You've met all the instructors, right?" ;
			mes "It's definitely worth it to take all the lectures from the instructors." ;
			next;
			if(select("Yeah, the real battle!" , "Wait a minute!") ==1)
				break;
			mes "[Instructor Alice]";
			mes "Okay, I've got it." ;
			mes "Well, go listen to more of the others. The instructors' stories should be helpful too." ;
			close;
		case 3:
			mes "[Instructor Alice]";
			mes "If you want to go to the city, ask Kafra Staff over there." ;
			mes "Prontera, Morroc, Payon......." ;
			mes "They will take you to the city you want to go to." ;
			close;
		}
		mes "[Instructor Alice]";
		mes "Oh, you're going to do it!" ;
		mes "Well, I'll send you on your way." ;
		mes "Make sure you listen to the person in charge of the place you send them to." ;
		mes "Combat is deadly!  So." ;
		mes "Well, have a good day!" ;
		close2;
		warp "new_1-2.gat",28,178;
		end;
	}
	if(CHANGE_NV &0x10 == 0 || CHANGE_NV &0x20 == 0) {
		set '@word$,(CHANGE_NV &0x10 == 0)? "interface": "skill";
		mes "[Instructor Alice]";
		mes "Can I help you?" ;
		if('@word$ == "interface") {
			mes "Oh, I see you didn't get the interface lecture." ;
			mes "I think you should go talk to Chris."
		}
		else {
			mes "Oh, I guess you didn't get the ^000000 lecture on ^4A4AFF skills." ;
			mes "You'd better go and listen to what Mr. Cy has to say."
		}
		mes "Okay." ;
		next;
		switch(select('@word$+"I'd rather have a lecture on "@word$+"", "I'd rather have a real battle than a talk!" , "How do I get to the city?")) {
		case 1:
			if('@word$ == "interface") {
				mes "[Instructor Alice]";
				mes "Instructor Chris is in the center of this room." ;
				mes "Go there and talk to Chris-san." ;
				mes "[Instructor Alice]"; mes "I'm sure she can help you." ;
				close;
			}
			mes "[Instructor Alice]";
			mes "Instructor Sai is on my right." ;
			mes "Go there and talk to Mr. Rhino." ;
			mes "Then I will take you to Mr. Sai." ;
			close2;
			warp "new_1-2.gat",84,107;
			end;
		case 2:
			mes "[Instructor Alice]";
			mes "You want the real game." ;
			mes "Do you want to go right away?" ;
			mes "Well, ...... You've met all the instructors, right?" ;
			mes "It's definitely worth it to take all the lectures from the instructors." ;
			next;
			if(select("Yeah, the real battle!" , "Wait a minute!") ==1) {
				mes "[Instructor Alice]";
				mes "Oh, you're gonna do it!" ;
				mes "Well, I'll send you on your way." ;
				mes "Make sure you listen to the person in charge of the place you send them to." ;
				mes "Combat is deadly!  So." ;
				mes "Well, have a good day!" ;
				close2;
				warp "new_1-2.gat",28,178;
				end;
			}
			mes "[Instructor Alice]";
			mes "Okay, I've got it." ;
			mes "Well, go listen to more of the others. The instructors' stories should be helpful, too." ;
			close;
		case 3:
			mes "[Instructor Alice]";
			mes "If you want to go to the city, ask Kafra Staff over there." ;
			mes "Prontera, Morroc, Payon......." ;
			mes "They will take you to the city you want to go to." ;
			close;
		}
	}
	mes "[Instructor Alice]";
	mes "What's wrong?" ;
	mes "Are you in some kind of trouble?" ;
	mes "The lectures are at ...... Looks like you got all of them." ;
	mes "Do you want to go somewhere?" ;
	next;
	switch(select("Where do you want to go?" , "I want to go to the city", "Nothing")) {
	case 1:
		mes "[Instructor Alice]";
		mes "Right. ......" ;
		mes "I know how to use items and I've learned skills. ...... Then all that's left is the combat training." ;
		mes "Then I can send you to the entrance of the training map, if you want." ;
		next;
		if(select("Send! Send!" , "Wait a minute!") ==1) {
			mes "[Instructor Alice]";
			mes "You have the items I gave you, right?" ;
			mes "Did you equip your weapons and armor?" ;
			mes "Then I'll send them to you!" ;
			close2;
			warp "new_1-2.gat",28,178;
			end;
		}
		mes "[Instructor Alice]";
		mes "Okay, I've got it." ;
		mes "If you need anything else, just call me anytime." ;
		close;
	case 2:
		mes "[Instructor Alice]";
		mes "If you want to go to the city, ask Kafra Staff over there." ;
		mes "Prontera, Morroc, Payon......." ;
		mes "They will take you to the city you want to go to." ;
		close;
	case 3:
		mes "[Instructor Alice]";
		mes "...... See you later!" ;
		close;
	}
}

//==============================================================
new_1-2.gat,118,108,3 script Kafra Staff 117,{
	mes "[Kafra Staff]";
	mes "Welcome." ;
	mes "I have been dispatched from the Kafra headquarters to guide you through the process for beginners." ;
	mes "Please give me your best regards." ;
	next;
	mes "[Kafra Staff]";
	mes "Our Kafra Service provides services to adventurers in almost every city, as we are said to manage all logistics within the Midgard continent." ;
	next;
	mes "[Kafra Staff]";
	mes "Welcome." ;
	mes "Kafra Service is always with you." ;
	mes "How can we help you?" ;
	next;
	mes "[Kafra Staff]";
	mes "We will let you know about our space transfer services first." ;
	mes "If you move to the city now, ^4A4AFF you will not be able to return to the Novice Training Ground again. ^000000Please understand this in advance." ;
	next;
	if(select("Spatial Transfer Service", "What's in Kafra Service?") ==1) {
		if(CHANGE_NV &0x70 == 0) {
			mes "[Kafra Staff]";
			mes "You are going to the city." ;
			mes "So, let me briefly introduce you to the major cities." ;
			mes "First, there is Prontera, the capital of the Kingdom of Rune-Midgarts, and its satellite city Izlude." ;
			next;
			mes "[Kafra Staff]";
			mes "^4A4AFFMorroc is a desert city with a large concentration of Thief and Assassin^000000." ;
			mes "^4A4AFFPayon is located in the mountains, with Archer Village^000000 in its immediate vicinity." ;
			next;
			mes "[Kafra Staff]";
			mes "^4A4AFFGeffen is said to be a magical city." ;
			mes "If you want to become a Magician, you should go to Geffen^000000." ;
			next;
			mes "[Kafra Staff]";
			mes "^4A4AFFAlberta is a port town and has a merchants' association^000000." ;
			mes "Also, if you want to travel by boat, you need to go to Alberta or Izlude." ;
			mes "Then please choose your destination." ;
			next;
		}
		switch (select((CHANGE_NV&0x70=0)? "": "Course 2 (Combat Training)", "Prontera", "Morroc", "Payon", "Alberta", "Geffen")) {
		case 1:
			mes "[Kafra Staff]";
			mes "Send them to the second course." ;
			close2;
			warp "new_1-2.gat",28,178;
			end;
		case 2:
			mes "[Kafra Staff]";
			mes "Prontera, the capital of the Kingdom of Rune-Midgarts, isn't it?" ;
			mes "Then let's send it to Prontera." ;
			mes "Thank you very much." ;
			mes "Thank you for your continued support of Kafra Service." ;
			close2;
			savepoint "prontera.gat",118,72;
			warp "prontera.gat",150,50;
			break;
		case 3:
			mes "[Kafra Staff]";
			mes "It's the desert city of Morroc." ;
			mes "The central oasis is a lovely place." ;
			mes "So, let's send you to Morroc." ;
			mes "Thank you very much." ;
			mes "Thank you for your continued support of Kafra Service." ;
			close2;
			savepoint "morocc.gat",151,98;
			warp "morocc.gat",155,110;
			break;
		case 4:
			mes "[Kafra Staff]";
			mes "Oh?  Do you want to be an Archer?" ;
			mes "Then let's send you to Payon." ;
			mes "Thank you very much." ;
			mes "Thank you for your continued support of Kafra Service." ;
			close2;
			savepoint "payon.gat",160,58;
			warp "payon.gat",166,67;
			break;
		case 5:
			mes "[Kafra Staff]";
			mes "It's the port city Alberta." ;
			mes "It is a trading center of the Kingdom of Rune-Midgarts." ;
			mes "There are also shipping services to other areas from Alberta." ;
			mes "Are you part of a merchants' association?" ;
			next;
			mes "[Kafra Staff]";
			mes "Then let's send them to Alberta." ;
			mes "Thank you very much." ;
			mes "Thank you for your continued support of Kafra Service." ;
			close2;
			savepoint "alberta.gat",31,233;
			warp "alberta.gat",114,58;
			break;
		case 6:
			mes "[Kafra Staff]";
			mes "It's the magical city of Geffen." ;
			mes "Geffen has a magnificent Geffen Tower in the center. Now, let's send you near the fountain of Geffen." ;
			next;
			mes "[Kafra Staff]";
			mes "Thank you very much." ;
			mes "Thank you for your continued support of Kafra Service." ;
			close2;
			savepoint "geffen.gat",118,37;
			warp "geffen.gat",121,65;
			break;
		}
		if(CHANGE_NV &0x70 == 0) {
			getitem 569,100;
			getitem 1243,1;
			getitem 2414,1;
			getitem 2510,1;
			getitem 2352,1;
			getitem 2112,1;
			getitem 601,10;
			getitem 602,2;
		}
		set CHANGE_NV,0;
		end;
	}
	mes "[Kafra Staff]";
	mes "Let's explain Kafra Service." ;
	mes "Please select the service you want to know about." ;
	while(1) {
		next;
		switch(select("location saving service", "warehouse service", "spatial movement service", "cart service", "stop talking")) {
		case 1:
			mes "[Kafra Staff]";
			mes "This service saves the resurrection point in case of combat failure. If you save at Kafra Staff in each town, you can revive from the save position that the corresponding Kafra Staff is in charge of." ;
			next;
			mes "[Kafra Staff]";
			mes "Also, the save position will be effective from the last saved location." ;
			mes "Then you can return to the save position by using the item "Butterfly Wings"." ;
			next;
			mes "[Kafra Staff]";
			mes "This location saving service is free of charge, so please take advantage of it." ;
			if(CHANGE_NV &0x80 == 0) {
				if(BaseLevel < 8) {
					if(BaseLevel == 7) getexp 155,0;
					else if(BaseLevel == 6) getexp 115,0;
					else if(BaseLevel == 5) getexp 78,0;
					else if(BaseLevel == 4) getexp 37,0;
					else if(BaseLevel == 3) getexp 26,0;
					else if(BaseLevel == 2) getexp 17,0;
					else if(BaseLevel == 1) getexp 10,0;
				}
				set CHANGE_NV,CHANGE_NV|0x80;
			}
			continue;
		case 2:
			mes "[Kafra Staff]";
			mes "Our Kafra Service is the largest logistics center on the continent with a long history and tradition." ;
			next;
			mes "[Kafra Staff]";
			mes "Kafra Service also provides a warehouse to store the goods of our adventurers." ;
			next;
			mes "[Kafra Staff]";
			mes "Kafra Service is open in almost every city." ;
			next;
			mes "[Kafra Staff]";
			mes "If you have a lot of luggage, you may not be able to move as much as you would like during transportation or in battle." ;
			mes "In such a case, it would be a good idea to deposit items that you don't use very often in the warehouse of our Kafra Service." ;
			next;
			mes "[Kafra Staff]";
			mes "The use of our warehouse is only for those who have gained some experience." ;
			mes "And we charge a certain amount for the use of the warehouse." ;
			next;
			mes "[Kafra Staff]";
			mes "To use the warehouse, you must have ^4A4AFF basic skill level 6 or higher^000000." ;
			next;
			mes "[Kafra Staff]";
			mes "Warehouses are categorized like items: consumables, equipment and other items." ;
			next;
			mes "[Kafra Staff]";
			mes "You can also deposit up to 300 different items." ;
			mes "The maximum number of the same item that can be stored is 30,000." ;
			next;
			mes "[Kafra Staff]";
			mes "Characters in the same account will use a common warehouse." ;
			mes "Each city has different warehouse usage fees, so please Attention when using this service." ;
			if(CHANGE_NV &0x100 == 0) {
				if(JobLevel < 7) {
					if(JobLevel == 6) getexp 0,151;
					else if(JobLevel == 5) getexp 0,91;
					else if(JobLevel == 4) getexp 0,40;
					else if(JobLevel == 3) getexp 0,28;
					else if(JobLevel == 2) getexp 0,18;
					else if(JobLevel == 1) getexp 0,10;
				}
				set CHANGE_NV,CHANGE_NV|0x100;
			}
			continue;
		case 3:
			mes "[Kafra Staff]";
			mes "At Kafra Service, we have been providing space transfer services with our long-standing know-how to make your travel more comfortable." ;
			next;
			mes "[Kafra Staff]";
			mes "This is the ability of a certain spatial surgeon to transfer you to the area of your choice." ;
			mes "The areas that can be transferred are determined for each city, so please check the destination as well when using this service." ;
			next;
			mes "[Kafra Staff]";
			mes "It is our policy at Kafra Service to respond to our customers' requests with sincerity." ;
			mes "We look forward to working with Kafra Service in the future." ;
			continue;
		case 4:
			mes "[Kafra Staff]";
			mes "Our Kafra Service rents "carts", one of the means of transportation, for those in the merchant profession." ;
			mes "Originally done by the Alberta Merchant's Association, we have decided to take over the business at Kafra." ;
			next;
			mes "[Kafra Staff]";
			mes "This makes it convenient and easy to use." ;
			mes "The cart is only available to merchants, Blacksmiths, Alchemists and their higher professions." ;
			next;
			mes "[Kafra Staff]";
			mes "Oh, and that's not exactly what I heard, but ......." ;
			mes "Supernovice may also be able to use the cart." ;
			next;
			mes "[Kafra Staff]";
			mes "The skill "Pushcart" is required to use this service." ;
			mes "Also, the rental fee for the cart varies from town to town, so please Attention when using the cart." ;
			continue;
		case 5:
			mes "[Kafra Staff]";
			mes "Did you understand about our Kafra Service?" ;
			mes "Thank you for your continued support of Kafra Service." ;
			close;
		}
	}
}

//==============================================================
new_1-2.gat,121,101,2 script Info Staff 105,{
	mes "[Info Staff]";
	mes "We, Info Staff, are at the entrance of the city to guide you about the location of buildings and other information." ;
	mes "When you visit a city for the first time, please visit an Info Staff like me." ;
	next;
	mes "[Info Staff]";
	mes "The Info Staff in each city may dress differently depending on the characteristics of the city, so please keep that in mind." ;
	next;
	mes "[Info Staff]";
	mes "If you want to go to a city, please use Kafra Staff's spatial transfer service." ;
	close;
}


//==========================================
// right room.
//------------------------------------------

new_1-2.gat,161,182,6 script Interface Instructor 92,{
	mes "[Edwin]";
	mes "I'm an instructor teaching more about interfaces." ;
	mes "Now, choose what you want to know." ;
	while(1) {
		next;
		switch(select("About Basic Info Window", "About Party Window", "About Item Window", "About Option Window", "About Equipment Window", "Quit")) {
		case 1:
			mes "[Edwin]";
			mes "Then let's look at the basic information window." ;
			mes "It's got your name on it and your base level and your profession level, right?" ;
			next;
			mes "[Edwin]";
			mes "Base Level^8408FF(Base Lv)^000000 says your base level." ;
			next;
			mes "[Edwin]";
			mes "The ^8408FFJob Lv^000000 behind it is your occupation level." ;
			mes "If you've been to the instructor's lecture, you already know the difference between the two." ;
			next;
			mes "[Edwin]";
			mes "The Basic Info window will tell you your current experience level." ;
			mes "Experience is expressed as a % and is still divided into Base Lv and Job Lv. When your experience reaches 100%, each of them will level up." ;
			next;
			mes "[Edwin]";
			mes "HP represents your strength." ;
			mes "When your HP reaches 0, you will faint and lose the ability to fight. At that point, you must return to town or wait for someone to revive you." ;
			next;
			mes "[Edwin]";
			mes "If you lose combat in a field or dungeon, you will receive a ^4A4AFF experience -1% penalty^000000, so be careful." ;
			next;
			mes "[Edwin]";
			mes "SP is the number you spend when you use a skill. You can learn the skills you can use later when you start working in a profession, so try it then." ;
			mes "The Skill Instructor will explain the skills to you." ;
			next;
			mes "[Edwin]";
			mes "If you want to know what your current possession limit is, look at the weight value at the bottom of the Basic Info window." ;
			next;
			mes "[Edwin]";
			mes "The part after the "/" is your possession limit, and be aware that if your possession weight exceeds 50%, your HP/SP will not automatically recover." ;
			next;
			mes "[Edwin]";
			mes "The number after the possession limit represents the money you currently have." ;
			mes "The monetary unit in Midgard is the Zenny." ;
			next;
			mes "[Edwin]";
			mes "The buttons on the right side of the Basic Info window are a separate interface menu, so press them one at a time to see what appears." ;
			next;
			mes "[Edwin]";
			mes "Also, you can minimize/maximize the Basic Info window with 'alt+v', so please refer to that." ;
			continue;
		case 2:
			mes "[Edwin]";
			mes "The party window can be displayed with the friend button in the basic info window, and can also be opened with 'alt+z'." ;
			next;
			mes "[Edwin]";
			mes "You can see a list of the party members who are currently in the party." ;
			next;
			mes "[Edwin]";
			mes "The party leader who formed the party can change the experience distribution scheme." ;
			next;
			mes "[Edwin]";
			mes "Also, remember that the location of your party members will be shown on the mini-map in the upper right corner of the screen." ;
			next;
			mes "[Edwin]";
			mes "In addition to the party window, there is also a friends list where you can see who you have added as friends." ;
			mes "You can also send a message to your friends." ;
			next;
			mes "[Edwin]";
			mes "The person in charge of explaining your skills will tell you how to form a party." ;
			mes "It's best to try these things in person." ;
			continue;
		case 3:
			mes "[Edwin]";
			mes "The item window is divided into three tabs, and 'item' is for supplies." ;
			mes "equip" will contain equipment items and "etc" will contain everything else." ;
			next;
			mes "[Edwin]";
			mes "You can't have more than your possession limit or more than 100 different items, so you should use the Kafra Service's warehouse." ;
			next;
			mes "[Edwin]";
			mes "You can also register consumables and equipment items in the shortcut window." ;
			mes "It's very useful, so learn to use it." ;
			next;
			mes "[Edwin]";
			mes "You can open the ^4A4AFF shortcut window with F12^000000." ;
			mes "I can assign the use of registered items to the keys F1 through F9." ;
			next;
			mes "[Edwin]";
			mes "Finally, remember that the item window can also be opened and closed with 'alt+e'." ;
			continue;
		case 4:
			mes "[Edwin]";
			mes "The options window can also be opened with the option button in the basic information window, but so can "alt+o"." ;
			mes "In options, you can adjust the sound, change the skin, etc." ;
			next;
			mes "[Edwin]";
			mes "Sound controls allow you to turn background music on and off and change the volume of the sound."; mes "Effect controls the volume of the sound effects." ;
			next;
			mes "[Edwin]";
			mes "The Skin section allows you to change the skin of the interface." ;
			mes "Just select the skin you want to apply from the list." ;
			next;
			mes "[Edwin]";
			mes "The snap part is a feature that will automatically align the cursor to a nearby target." ;
			mes "Attack is the target of the attack, skill is the target of the skill, and item is the target of the skill... I don't have to explain it to you." ;
			next;
			mes "[Edwin]";
			mes "It can be useful or a hindrance, depending on how you use it. ......" ;
			mes "You can set it up so it's easy for you to use." ;
			next;
			mes "[Edwin]";
			mes "It's best to learn by doing. That's enough about options." ;
			continue;
		case 5:
			mes "[Edwin]";
			mes "Press the equip button in the basic info window, or press 'alt+q'." ;
			mes "You can see what items your character currently has equipped." ;
			next;
			mes "[Edwin]";
			mes "By default, he is equipped with a knife and a cotton shirt." ;
			mes "To equip an item, double-click the item you want to equip in the item window, or you can click and hold and drag it to the equip point." ;
			next;
			mes "[Edwin]";
			mes "You can use F12 to register shortcuts in the shortcut window, which is very useful when you want to smoothly change your equipment to match the enemy." ;
			continue;
		case 6:
			mes "[Edwin]";
			mes "If you have any questions, you can always ask me." ;
			close;
		}
	}
}

//==============================================================
new_1-2.gat,182,182,3 script Status Instructor 754,{
	mes "[Zeriot]";
	mes "You are an adventurer taking your first steps in the world." ;
	mes "I Zeriot am your status ...... In other words, I will teach you about your abilities and what principles they are based on." ;
	next;
	mes "[Zeriot]";
	mes "First ask me about the ability value you want to know." ;
	next;
	mes "[Zeriot]";
	mes "Oh, you forgot to tell me." ;
	mes "The stats consist of Strength (Str), Speed (Agi), Strength (Vit), Intellect (Int) Skill (Dex), and Luck (Luk)." ;
	while(1) {
		next;
		switch(select("Str and Agi", "Vit and Int", "Dex and Luk", "quit")) {
		case 1:
			mes "[Zeriot]";
			mes "Str is related to Atk, which is related to the damage you can do to your opponent with direct attacks, and the maximum amount of items you can have." ;
			next;
			mes "[Zeriot]";
			mes "An increase of 1 in Str increases the damage of a direct attack by 1." ;
			mes "In addition, a bonus is added to the attack power in increments of 10." ;
			next;
			mes "[Zeriot]";
			mes "For example, to be specific, let's assume your Str is 48+1." ;
			mes "Your pure Str is 48 and the +1 is a weighted value due to JobLv, equipped items, etc." ;
			next;
			mes "[Zeriot]";
			mes "And if you square 49 ^4A4AFF tens place 4, you get (4x4) which is 16, and that 16 is the ^000000 bonus to attack power." ;
			next;
			mes "[Zeriot]";
			mes "Then, if you level up and your Str is 49+1, you have a total of 50, so 5x5 is 25." ;
			mes "If your Str is 100, then 10x10 gives you a bonus of 100." ;
			mes "Do you understand?" ;
			next;
			mes "[Zeriot]";
			mes "So let's talk about Agi." ;
			mes "^4A4AFFAgi affects ^000000 the number of attacks that can be avoided by the opponent, ^4A4AFFAff evasion rate (Flee) and attack speed (Aspd) ^000000." ;
			next;
			mes "[Zeriot]";
			mes "If Agi increases by 1, the evasion rate also increases by 1. If level increases by 1, the evasion rate also increases by 1." ;
			mes "So ^4A4AFFFlee^000000 is ^4A4AFFAgi + BaseLv^000000." ;
			next;
			mes "[Zeriot]";
			mes "Let's take a concrete example." ;
			mes "If your level is 40 and your Agi is 40, that means your Flee is 80." ;
			next;
			mes "[Zeriot]";
			mes "Also, Flee is shown as normal evasion rate + full evasion rate." ;
			mes "^4A4AFFAgi is ^000000 related to the normal evasion rate only." ;
			next;
			mes "[Zeriot]";
			mes "The full avoidance rate is related to the Luk value, so let's explain it at Luk." ;
			next;
			mes "[Zeriot]";
			mes "Also, the higher the attack speed (Aspd), the less time it takes to attack and the less time of hardness (Delay) after the attack." ;
			mes "Aspd will also vary from profession to profession, so please refer to it." ;
			continue;
		case 2:
			mes "[Zeriot]";
			mes "Vit and Int." ;
			mes "^4A4AFFVit is a status related to the character's maximum HP and HP recovery and the reduction in damage taken from it. ^000000";
			next;
			mes "[Zeriot]";
			mes "The HP value that increases when Vit is increased by 1 is different for each profession, but is highest for the Swordsman profession." ;
			next;
			mes "[Zeriot]";
			mes "As for the decrease in damage, it is related to the value of Def and is shown as the previous value + the back value, this back value is the value of Vit." ;
			next;
			mes "[Zeriot]";
			mes "So what is the previous value?" ;
			mes "This is the value due to the equipped armor." ;
			next;
			mes "[Zeriot]";
			mes "The armor's defense reduces your opponent's attack by a % calculation, and the damage reduced minus the back value is the damage you take." ;
			next;
			mes "[Zeriot]";
			mes "However, this is only a basic calculation, so if other factors are involved, the damage you receive will also change." ;
			next;
			mes "[Zeriot]";
			mes "And you are not going to be a Magician?" ;
			mes "Well, ...... I'm kidding, but let's talk about Int." ;
			next;
			mes "[Zeriot]";
			mes "Int is related to max SP and SP recovery, Matk and Mdef." ;
			next;
			mes "[Zeriot]";
			mes "Matk represents magic attack power, Mdef represents magic defense power." ;
			mes "...... As a bit of a side note, the value of SP that increases per Int1 varies from profession to profession." ;
			next;
			mes "[Zeriot]";
			mes "I believe the Mdef is also displayed as the previous value + the back value, just like the Def." ;
			mes "I still think the back value is due to Int." ;
			next;
			mes "[Zeriot]";
			mes "If you want to understand the elements that make up everything in the world, you need to improve your Int, i.e. your intellect." ;
			mes "Scholars and magicians like myself place great emphasis on Int." ;
			continue;
		case 3:
			mes "[Zeriot]";
			mes "Dex and Luk, right?" ;
			mes "Some people achieve success through luck, but it's also important to earn it through hard work. ...... Hmm." ;
			mes "Oh, I'm talking to myself." ;
			mes "Shall we begin then?" ;
			next;
			mes "[Zeriot]";
			mes "Dex greatly affects Hit (hit rate) and Aspd, and has some effect on attack power." ;
			mes "In particular, it raises the minimum damage." ;
			next;
			mes "[Zeriot]";
			mes "The presence of Dex is also important, because if the minimum damage improves, the damage to the opponent will improve as a result." ;
			next;
			mes "[Zeriot]";
			mes "If you use a ^4A4AFF bow ^000000, you should not neglect Dex if you intend to become an Archer or Hunter at a later date because ^4A4AFF attack power is ^000000 determined by the Dex value." ;
			next;
			mes "[Zeriot]";
			mes "Also, Hit is based on BaseLv + Dex." ;
			next;
			mes "[Zeriot]";
			mes "If your level is 40 and your Dex is 20, then Hit is 40 + 20, which is 60. Do you understand?" ;
			next;
			mes "[Zeriot]";
			mes "You can also ^000000 to decrease ^4A4AFF casting (chanting) time when using skills that require chanting, such as magic." ;
			next;
			mes "[Zeriot]";
			mes "Now, Luk is a word, but it also has some effect on Critical (Critical Rate), Flee (Evasion Rate), and Attack Power." ;
			next;
			mes "[Zeriot]";
			mes "Critical goes up by ^000000 for each ^4A4AFFLuk3, and critical attacks can do damage that ignores your opponent's defenses." ;
			next;
			mes "[Zeriot]";
			mes "Also, for every 10 units of Luk, the complete evasion rate increases by 1." ;
			mes "When complete evasion is triggered, the indicator Lucky appears above the character's head." ;
			mes "At this time, you will avoid the opponent's attack once." ;
			next;
			mes "[Zeriot]";
			mes "Fortune is a good word, but don't rely on it all the time." ;
			mes "Now, is everything else okay?" ;
			continue;
		case 4:
			mes "[Zeriot]";
			mes "It seems to be okay." ;
			mes "Knowledge gained from books is good, but it is also important to learn from experience." ;
			mes "Good luck!" ;
			close;
		}
	}
}

//==============================================================
new_1-2.gat,184,172,2 script Skill Tutor 47,{
	emotion 30;
	mes "[Priest Judas]";
	mes "Welcome!" ;
	mes "We've been waiting for you so long we almost lost our heads - New Face is cute!" ;
	mes "This Mr. Pitch is here to teach you about your skills with all his heart!" ;
	while(1) {
		next;
		switch(select("Passive and Active Skills", "Passive! Let's learn basic skills", "Emotionally express emotions", "Quit")) {
		case 1:
			mes "[Priest Judas]";
			mes "Passive and active skills!" ;
			mes "I'll start with passive, so listen carefully - please open the skill window with "alt+s" first!" ;
			next;
			mes "[Priest Judas]";
			mes "Do you see the available skills?" ;
			mes "If you look at the basic skills, it will say passive on the right - so let's right click on the basic skill icon?" ;
			next;
			mes "[Priest Judas]";
			mes "You can use the skills about the basic interface." ;
			mes "It says 'I'm not sure I'm going to be able to do that!'" ;
			mes "These are skills that you all need in your lives." ;
			mes "And you don't need SP to use these skills." ;
			next;
			mes "[Priest Judas]";
			mes "Passive skills are skills whose effects are applied without consuming SP." ;
			next;
			mes "[Priest Judas]";
			mes "Conversely, an active skill is an active skill that consumes SP and is activated when the skill is used. This is the case with Swordsman's Bash, Acolyte's Heal, etc." ;
			next;
			mes "[Priest Judas]";
			mes "If you have been taking the instructor's classes well, you should have learned the skill of first aid. What do you think~?" ;
			mes "If you have mastered it, try using it once with a double click." ;
			mes "It consumes SP and activates, right?" ;
			next;
			mes "[Priest Judas]";
			mes "Such a skill is an active skill." ;
			next;
			mes "[Priest Judas]";
			mes "Anything that you train your skills in physically or mentally is generally a passive skill, and anything that you activate when you use it, like magic, is an active skill. Is that clear?" ;
			next;
			mes "[Priest Judas]";
			mes "Ummm ...... Isn't it difficult to explain?　If it's difficult, I'll explain it again~";
			continue;
		case 2:
			mes "[Priest Judas]";
			mes "The essence of passive skills!" ;
			mes "Cute Novice learns his first skill!" ;
			mes "Time to study the basic skills you need for life!" ;
			next;
			mes "[Priest Judas]";
			mes "You can read the description by right-clicking on the icon in the skill window, but I've categorized the basic skills and divided them into items." ;
			while(1) {
				next;
				switch(select("trade and exchange", "form and join a party", "open a chat room", "use a warehouse", "know all")) {
				case 1:
					mes "[Priest Judas]";
					mes "You must have at least 1 basic skill to trade with others." ;
					next;
					mes "[Priest Judas]";
					mes "Distance is important when requesting a deal!" ;
					mes "You have to get right up close to the person you want to offer a deal to, and right-click on the person you want to offer a deal to... just once." ;
					next;
					mes "[Priest Judas]";
					mes "Then, select ^4808FF trade request^000000 and the other party will see the trade request message, and if they accept, the exchange window will open. Be careful, it will be interrupted if the distance between you and the other party opens." ;
					next;
					mes "[Priest Judas]";
					mes "Then drag and place the item you want to pass from the item window to the left side of the exchange window." ;
					mes "When you want to give Zeny, just enter the amount." ;
					next;
					mes "[Priest Judas]";
					mes "When you want to check the item to give, right click on the item to see the details." ;
					next;
					mes "[Priest Judas]";
					mes "After pressing OK to confirm, press the "trade" button to confirm the item to be exchanged on your side." ;
					mes "If you press trade for the other side in the same way, the transaction is completed." ;
					next;
					mes "[Priest Judas]";
					mes "Remember, you can cancel the transaction before you press trade." ;
					continue;
				case 2:
					mes "[Priest Judas]";
					mes "What we are going to study is about ~party!" ;
					mes "A party is all about beautiful lights and sparkling dresses!" ;
					next;
					mes "[Priest Judas]";
					mes "Not the ...... It's about a party system that helps you explore with your friends ......" ;
					next;
					mes "[Priest Judas]";
					mes "Parties can be formed with the command ^4A4AFF/organize [party name]^000000." ;
					mes "Of course, the ^4A4AFF basic skill must be at least 7^000000." ;
					next;
					mes "[Priest Judas]";
					mes "You can also press "friend" in the Basic Info window to view party information." ;
					next;
					mes "[Priest Judas]";
					mes "You can also form a party and change the experience distribution format, but you can actually do that later." ;
					mes "I'd really like to come over and help you right away. ......" ;
					next;
					mes "[Priest Judas]";
					mes "On the other hand, to join the party, all you have to do is accept the party leader's request and agree to it." ;
					mes "There are no level restrictions for this." ;
					next;
					emotion 30;
					mes "[Priest Judas]";
					mes "That's all from me regarding the party." ;
					mes "Hmmm";
					continue;
				case 3:
					mes "[Priest Judas]";
					mes "Opening a chat room is possible when you have a basic skill level of 4 or higher." ;
					mes "It can be opened by pressing the "comm" button in the Basic Info window or by pressing "Alt+c"." ;
					next;
					mes "[Priest Judas]";
					mes "After opening a chat room, you can also change the room's name, number of people, and other settings." ;
					next;
					mes "[Priest Judas]";
					mes "You cannot hear voices outside the chat room when you are participating in a chat." ;
					mes "Please use this as a reference." ;
					next;
					mes "[Priest Judas]";
					mes "......" ;
					mes "............" ;
					mes "I also want to open a chat room ......" ;
					mes "My status doesn't allow that either." ;
					mes "thohohohoho ......" ;
					continue;
				case 4:
					mes "[Priest Judas]";
					mes "There is a huge logistics service called Capra throughout Midgard that does useful things like storing travelers' belongings." ;
					mes "Have you met them yet?" ;
					next;
					mes "[Priest Judas]";
					mes "Use of the warehouse is possible once you have a basic skill of 6 or higher." ;
					mes "Instructions on the use of the Kafra Service will be given separately by the Kafra Staff." ;
					next;
					mes "[Priest Judas]";
					mes "Holding too many items at once may make you too heavy to attack or recover." ;
					mes "It is a good idea to store items and other items that you do not use on a regular basis in a warehouse." ;
					continue;
				case 5:
					mes "[Priest Judas]";
					mes "I can't believe you know everything!" ;
					mes "I'm so impressed with this pitch!" ;
					next;
					mes "[Priest Judas]";
					mes "Now let's study something else." ;
				}
				break;
			}
			} continue;
		case 3:
			mes "[Priest Judas]";
			mes "Emotions, one of the most commonly used means of expressing emotions, can be used in a wide range of your communications." ;
			next;
			mes "[Priest Judas]";
			mes "You will be able to use it when your skill level reaches 2 or higher." ;
			next;
			mes "[Priest Judas]";
			mes "You can use "Alt+L" and "Alt+M" to display the emotion list so you can set it up and use it." ;
			next;
			mes "[Priest Judas]";
			mes "Oh, isn't rich emotional expression what people always need in their relationships!" ;
			mes "If you have difficulty communicating in words, please try to use it!" ;
			next;
			mes "[Priest Judas]";
			mes "Oh, so how to use it, you can use it by using "Alt+M" to register it, or by typing directly in the chat window like "/e1"." ;
			next;
			mes "[Priest Judas]";
			mes "You can also use Ctrl + ";", "-", and "⌘" to produce "Goo", "Choki", and "Par"!" ;
			next;
			emotion 3;
			mes "[Priest Judas]";
			mes "You can also check the commands for each emotion with the "/help" and "/emotion" commands for your reference." ;
			mes "fufu ......" ;
			continue;
		case 4:
			mes "[Priest Judas]";
			mes "I guess I have nothing more to teach you. ......" ;
			mes "Then take care!" ;
			close;
		}
	}
}


//==========================================
// left room
//------------------------------------------

new_1-2.gat,17,182,5 script Combat Staff 84,{

	function Battle {
		mes "[Armine]";
		mes "First, to do battle, hover the cursor over the monster, then left click to attack the monster." ;
		next;
		mes "[Armine]";
		mes "If you don't want to keep clicking all the time, you can hold down "Ctrl" to attack the monster and it will keep attacking until you kill it." ;
		next;
		mes "[Armine]";
		mes "And if you don't want to press Ctrl as well, try typing ^E79C29/nc^000000 in the chat window." ;
		mes "Now you don't have to press Ctrl, just left click to continue the attack." ;
		next;
		mes "[Armine]";
		mes "If the monster's attribute is undead (undead), you can still use the heal skill to attack." ;
		mes "In this case, you can hold down "Shift" and use heal." ;
		next;
		mes "[Armine]";
		mes "If you don't want to press Shift every time for this too, there is a useful command ^E79C29/ns^000000. This allows you to use heal on a monster without having to press Shift." ;
		return;
	}

	if(CHANGE_NV &0x200 == 0) {
		mes "[Armine]";
		mes "How was the first course?" ;
		mes "Have you gotten a lot more familiar with the world of Ragnarok Online?" ;
		next;
		mes "[Armine]";
		mes "Here, we would like you to learn about the basics of combat." ;
		mes "If you have had a good lecture on theory, you should have been provided with some equipment." ;
		next;
		mes "[Armine]";
		mes "In the meantime, check and see what your equipment is before you do battle." ;
		mes "Are you equipped?" ;
		next;
		if(select("It's perfect", "Not yet")==2) {
			mes "[Armine]";
			mes "Please take good care of the equipment you were provided." ;
			mes "If you lose it by mistake, it cannot be supplied again." ;
			close;
		}
		Battle;
		next;
		mes "[Armine]";
		mes "Roughly, did you understand the basics of combat?" ;
		mes "Then I will explain the nature and attributes of monsters, experience and items after the battle." ;
		next;
		mes "[Armine]";
		mes "In the meantime, there are dangers involved in combat, so shall I share my strength with you so that you can fight to some extent?" ;
		next;
		mes "[Armine]";
		mes "Ei!  Ya!!!" ;
		if(BaseLevel == 7) getexp 153,0;
		else if(BaseLevel == 6) getexp 112,0;
		else if(BaseLevel == 5) getexp 77,0;
		else if(BaseLevel == 4) getexp 36,0;
		else if(BaseLevel == 3) getexp 25,0;
		else if(BaseLevel == 2) getexp 16,0;
		else if(BaseLevel == 1) getexp 9,0;
		set CHANGE_NV,CHANGE_NV|0x200;
		next;
		mes "[Armine]";
		mes "Huh......" ;
		mes "I hope I can be of help." ;
		mes "So what would you like to know about?" ;
	}
	else {
		mes "[Armine]";
		mes "I see there is still something else you want to know about." ;
		mes "What would you like to ask?" ;
		set '@word$, "Basic operations about combat";
	}
	while(1) {
		next;
		switch (select("monster properties and attributes", "gaining experience in combat", "gaining items",'@word$,('@word$ == "")? "Nothing": "Stop talking")) {
		case 1:
			mes "[Armine]";
			mes "Some of these monsters are the type that attack first before they attack you." ;
			mes "Also, be aware that some monsters will gather and attack you if you attack their own people." ;
			next;
			mes "[Armine]";
			mes "And the monsters have various forms, sizes and attributes." ;
			mes "The forms include human, animal, undead, demon, etc., and a good grasp of these will make combat somewhat easier." ;
			next;
			mes "[Armine]";
			mes "For example, weapons with cards that increase damage to certain forms and armor with cards that decrease damage from certain forms will give you an advantage in battle." ;
			next;
			mes "[Armine]";
			mes "Monsters are divided into small, medium and large sizes." ;
			mes "This will also make combat easier if you use weapons with cards inserted that increase damage based on size." ;
			next;
			mes "[Armine]";
			mes "Each weapon has its own characteristics, and the damage may vary depending on the size of each." ;
			mes "For example, a dagger is 100% effective against small targets, but only 50% effective against large ones." ;
			next;
			mes "[Armine]";
			mes "Attributes include fire, water, earth, wind, poison, undead, dark, ghost, and holy." ;
			mes "Basically, attacking with an attribute that goes against the monster's attribute will cause more damage." ;
			next;
			mes "[Armine]";
			mes "Also, there are cases where damage cannot be inflicted with an attribute weapon, or conversely, where damage cannot be inflicted without attacking with an attribute weapon." ;
			next;
			mes "[Armine]";
			mes "For example, if the GHOST attribute is used, attacking with a non-attribute will do little or no damage, while attacking with an attribute weapon will do damage." ;
			continue;
		case 2:
			mes "[Armine]";
			mes "Experience is generally given to those who deal more damage to the monster." ;
			mes "Experience is given in proportion to the monster's HP and damage." ;
			next;
			mes "[Armine]";
			mes "For example, if Mr. A attacks a monster with "1000" experience and "100" HP, causing "65" damage, Mr. A will gain "650" experience." ;
			next;
			mes "[Armine]";
			mes "Also, even if the same "65" damage is inflicted, the experience gained will vary depending on the monster's HP." ;
			next;
			mes "[Armine]";
			mes "If others do the same damage, the person who attacked first will get 2/3 of the experience and the person who attacked later will only get 1/3 of the experience." ;
			next;
			mes "[Armine]";
			mes "The experience gained during party play will be divided equally among the party members, as long as the experience gained by the entire party is distributed fairly." ;
			next;
			mes "[Armine]";
			mes "If you are defeating monsters with others, you may want to take advantage of party play after you have some familiarity with it." ;
			continue;
		case 3:
			mes "[Armine]";
			mes "If you defeat a monster, there is a certain probability that it will drop an item." ;
			mes "Otherwise, you can steal items with the 'steal' skill." ;
			next;
			mes "[Armine]";
			mes "Stealing an item from a monster by means of Steal does not mean that the item will no longer be dropped when the monster is defeated." ;
			next;
			mes "[Armine]";
			mes "If you defeat a monster with others, priority to pick up the item basically goes to the person who did the most damage to the monster." ;
			continue;
		case 4:
			Battle; //if CHANGE_NV &0x200 == 0, then no answer
			continue;
		case 5:
			mes "[Armine]";
			mes "If you have any more questions, please give us a call." ;
			close;
		}
	}
}

//==============================================================
new_1-2.gat,38,182,3 script Receptionist 92,{
	if(CHANGE_NV &0x200 == 0) {
		mes "[Kang]";
		mes "Are you planning to practice without even knowing the basics of combat?" ;
		mes "I'm sorry, but please have the Combat Staff to my right teach you about the basics of combat before you come." ;
		close;
	}
	if(CHANGE_NV &0x400 == 0) {
		mes "[Kang]";
		mes "In the second course, you will check in actual combat to see if you have acquired the knowledge you have learned so far. How well you can apply it in real combat is the task of the combat practice." ;
		next;
		mes "[Kang]";
		mes "The map for the practical training has a variety of monsters. Please fight through them based on the knowledge you have cultivated so far." ;
		next;
		mes "[Kang]";
		mes "We will not enforce any particular targets or restrict your actions here. You can think of it as going to a place where you can actually experience combat, and that's about it." ;
		next;
		mes "[Kang]";
		mes "If you proceed to the second course training map, you will find Combat Staff at its northern entrance." ;
		mes "He will send you to that next location, please speak to him. So, would you like to start the practical training?" ;
		next;
		if(select("Yes, please!" }, "I'm going to go get ready for a minute.")==2) {
			mes "[Kang]";
			mes "Roger that." ;
			mes "Then you may want to talk to the Combat Staff on my right." ;
			mes "Please come when you are ready." ;
			close;
		}
		mes "[Kang]";
		mes "Roger that." ;
		mes "Please never take it easy." ;
		mes "Then, we will supply you with items, please use them when you fall into danger." ;
		mes "Then ...... We will also supply you with weapons and shields together." ;
		set CHANGE_NV,CHANGE_NV|0x400;
		getitem 602,1;
		getitem 601,9;
		getitem 1243,1;
		getitem 2112,1;
		getitem 611,2;
		getitem 569,30;
	}
	else {
		mes "[Kang]";
		mes "I Attentioned you not to overdo it, didn't I?" ;
		mes "Well, as they say, 'Failure is the source of success'. I hope it's working for you." ;
		next;
		mes "[Kang]";
		mes "Would you like to try again?" ;
		next;
		if(select("Yes, by all means!" }, "I'm going to go get ready for a bit")==2) {
			mes "[Kang]";
			mes "Roger that." ;
			mes "Then you may want to talk to the Combat Staff on my right." ;
			mes "Please come when you are ready." ;
			close;
		}
		mes "[Kang]";
		mes "Roger that." ;
		mes "It is modest."; mes "It is modest."; mes "It is modest.
		if(CHANGE_NV &0x800 == 0) {
			mes "This is a gift of support from me." ;
			if(BaseLevel >= 8) getexp 200,0;
			else if(BaseLevel == 7) getexp 153,0;
			else if(BaseLevel == 6) getexp 112,0;
			else if(BaseLevel == 5) getexp 77,0;
			else if(BaseLevel == 4) getexp 36,0;
			else if(BaseLevel == 3) getexp 25,0;
			else if(BaseLevel == 2) getexp 16,0;
			getitem 569,50;
			set CHANGE_NV,CHANGE_NV|0x800;
		}
		else {
			mes "This is a show of support from me." ;
		}
		percentheal 100,100;
		mes "Well, have a safe trip." ;
	}
	close2;
	savepoint "new_1-2.gat",24,189;
	switch(rand(5)) {
		case 0: warp "new_1-3.gat",96,21; break
		case 1: warp "new_2-3.gat",96,21; break
		case 2: warp "new_3-3.gat",96,21; break
		case 3: warp "new_4-3.gat",96,21; break
		case 4: warp "new_5-3.gat",96,21; break
	}
	end;
}

new_1-2.gat,28,185,3 shop imo-sell-girl 90,516


//==========================================
// combat practice
//------------------------------------------

- script NoviceTraining -1,{
	mes "[Fuhrman]";
	mes "Even low-level monsters can hurt you if you underestimate them." ;
	mes "Be careful, because if you're not careful, you can get seriously hurt." ;
	next;
	mes "[Fuhrman]";
	mes "Yes, there are monsters that sometimes attack first, so please Attention!" ;
	mes "Well then, good luck completing your training!!!" ;
	next;
	mes "[Fuhrman]";
	mes "...... Maybe the truth is that the monsters here are weak!" ;
	mes "You think?" ;
	mes "Actually, a service for those who do! We'll send you to a place where the monsters are a bit stronger." ;
	next;
	mes "[Fuhrman]";
	mes "Hey, would you like to give it a try?" ;
	next;
	// take the number not to be displayed from the NPC name and fill that menu with an empty letter
	set '@num,strnpcinfo(2);
	setarray '@serv$, "I want to fight a weaker monster", "I want to fight a little stronger monster", "I want to challenge a stronger monster!" ;
	set '@serv$['@num],""";
	switch (select('@serv$[0],'@serv$[1],'@serv$[2], "No, I don't want to ......")) {
	case 1:
		mes "[Fuhrman]";
		mes "I got it!" ;
		mes "Then let's send him to where the weaker monsters are." ;
		mes "I wish you good luck!" ;
		next;
		warp "new_1-3.gat",96,21;
		end;
	case 2:
		mes "[Fuhrman]";
		mes "I got it!" ;
		mes "Then let's send you to a place with a little stronger monster." ;
		mes "I wish you good luck!" ;
		next;
		warp "new_"+rand(2,3)+"-3.gat",96,21;
		end;
	case 3:
		mes "[Fuhrman]";
		mes "You are a brave man. ......" ;
		mes "Then let's meet that request!" ;
		mes "Have a nice day!" ;
		next;
		warp "new_"+rand(4,5)+"-3.gat",96,21;
		end;
	case 4:
		mes "[Fuhrman]";
		mes "You are a cautious man. ......" ;
		mes "Surely, it's more important to make sure you get the practice done. I wish you good luck!" ;
		close;
	}
}

new_1-3.gat,95,30,4 duplicate(NoviceTraining) Training Requester #0 84
new_2-3.gat,95,30,4 duplicate(NoviceTraining) Training Requester #1 84
new_3-3.gat,95,30,4 duplicate(NoviceTraining) Trainee #1 84
new_4-3.gat,95,30,4 duplicate(NoviceTraining) Trainee #2 84
new_5-3.gat,95,30,4 duplicate(NoviceTraining) Training Requester #2 84

//==============================================================
- script NoviceManager 85,{
	mes "[Ciman]";
	mes "...... What is it?" ;
	mes "Did you do your combat training properly?" ;
	mes "Well, how about I send you to the next map?" ;
	next;
	if(select("Yes, please!" , "Still good")==1) {
		mes "[Ciman]";
		mes "Okay, there will be a lot more to come, but never forget what you have just learned! Then I wish you a good adventure!" ;
		close2;
		warp "new_1-4.gat",99,10;
		end;
	}
	mes "[Ciman]";
	mes "Hm. Good for you to admit your own immaturity! Go ahead and practice until you feel better!" ;
	close;
}

new_1-3.gat,96,174,3 duplicate(NoviceManager) Examination Director 85
new_2-3.gat,96,174,3 duplicate(NoviceManager) Examination Supervisor 85
new_3-3.gat,96,174,3 duplicate(NoviceManager) Exam Supervisor 85
new_4-3.gat,96,174,3 duplicate(NoviceManager) Exam Supervisor 85
new_5-3.gat,96,174,3 duplicate(NoviceManager) Exam Supervisor 85


//==========================================
// Vocational Aptitude Test
//------------------------------------------

new_1-4.gat,91,22,3 script vocational instructor 57,{
	mes "[Baroso]";
	mes "It must have been really hard to get here. Thank you for your hard work." ;
	mes "^8C2121" +strcharinfo(0)+ "^000000 sir, it is a pleasure to see you." ;
	mes "My name is Baroso, sent from the Kingdom of Rune-Midgarts." ;
	next;
	mes "[Baroso]";
	mes "It is my duty to give an overview of each profession to help beginners in their choice of profession." ;
	next;
	mes "[Baroso]";
	mes "The professions I will introduce are ^0000FF Swordsman, Magician, Archer, Merchant, Thief, Acolyte, and Special Primary ^000000." ;
	next;
	mes "[Baroso]";
	mes "Which profession would you like to know about?" ;
	while(1) {
		next;
		switch (select("Swordsman", "Magician", "Archer", "Merchant", "Thief", "Acolyte", "Special primary occupation", "Stop talking")) {
		case 1:
			mes "[Baroso]";
			mes "A swordsman is literally one who wields a sword, sometimes called a Swordsman. Sometimes some people use spears instead of swords." ;
			next;
			mes "[Baroso]";
			mes "Swordsmen are able to equip themselves with heavy armor and weapons because of their physical strength." ;
			mes "They can also handle most weapons except bows, staffs, katars, knuckles, etc." ;
			next;
			mes "[Baroso]";
			mes "However, they basically cannot use magic, so that is a disadvantage, but this can be compensated for by equipping them with weapons that have attributes attached to them." ;
			next;
			mes "[Baroso]";
			mes "Swordsmen are impervious to the attacks of their enemies due to their strong physical strength." ;
			mes "He also knows how to take care of himself." ;
			next;
			mes "[Baroso]";
			mes "As a vanguard, you will be at your greatest strength when you start using even more powerful skills." ;
			mes "It is no exaggeration to say that he is ironclad." ;
			next;
			mes "[Baroso]";
			mes "Swordsmen use their physical strength to protect other professions that are physically weaker." ;
			mes "They will often have the opportunity to be the leader during party play." ;
			next;
			mes "[Baroso]";
			mes "From ^8C2121 Swordsman, you can change to Knight or Crusader. ^000000";
			break;
		case 2:
			mes "[Baroso]";
			mes "Magician is a profession that can perform magical attacks based on its own magical power and using the attributes of fire, water, earth, wind, etc." ;
			next;
			mes "[Baroso]";
			mes "Weapons are mainly staffs and books, and there are other items that can be equipped, but they have the disadvantage that they can only equip light objects because of their lack of physical strength." ;
			next;
			mes "[Baroso]";
			mes "However, the powerful attacks more than make up for it, which is one of the reasons why the Magician is favored by the people." ;
			next;
			mes "[Baroso]";
			mes "The Magician will serve as a reassuring companion during party play, using powerful magic to inflict heavy damage on the enemy." ;
			next;
			mes "[Baroso]";
			mes "^8C2121Magician can change to Wizard or Sage. ^000000";
			break;
		case 3:
			mes "[Baroso]";
			mes "The Archer has the advantage of being able to support his friends as well without being targeted by the enemy because he is good at attacking using a bow and can attack at long range." ;
			next;
			mes "[Baroso]";
			mes "As a disadvantage, his physical strength is weak, but he can attack from far away from the enemy, so he can fight while keeping himself safe." ;
			next;
			mes "[Baroso]";
			mes "The Archer's high hit rate and attack power allow it to take early and quick aim before the enemy gets close." ;
			next;
			mes "[Baroso]";
			mes "From ^8C2121Archer can change jobs to Hunter." ;
			mes "In addition, you can also change to Bard for Male and Dancer for Woman."; mes "[Baroso]"; mes "[Baroso]"; mes "^8C2121Archer can change to Hunter. ^000000";
			break;
		case 4:
			mes "[Baroso]";
			mes "A Merchant is literally a profession that is all about buying and selling goods and making a profit." ;
			mes "With their long years of expertise in the trade, they can buy goods at a much lower price than other professions or sell goods at a higher price." ;
			next;
			mes "[Baroso]";
			mes "You can also cart more items and open your own store." ;
			next;
			mes "[Baroso]";
			mes "From ^8C2121 merchants can change jobs to Blacksmith or Alchemist. ^000000";
			break;
		case 5:
			mes "[Baroso]";
			mes "The Thief has the advantage of quick attacks with his dagger and a high evasion rate due to his lightness of body." ;
			next;
			mes "[Baroso]";
			mes "Besides that, they can also learn to use poison and hide themselves. In the unlikely event that the person is poisoned by that poison, he or she will gradually lose his or her strength." ;
			next;
			mes "[Baroso]";
			mes "In a critical situation, a person can quickly hide himself or herself and attack from behind to reverse the situation." ;
			next;
			mes "[Baroso]";
			mes "^8C2121Thiefs can change jobs to Assassin or Rogue. ^000000";
			break;
		case 6:
			mes "[Baroso]";
			mes "Acolyte is a profession of service, not only serving God and teaching people about his faith, but also willingly sacrificing himself for the sake of others." ;
			next;
			mes "[Baroso]";
			mes "The Acolyte is not directly involved in combat, but is responsible for bringing out the abilities of his companions through miracles and for healing wounded companions." ;
			next;
			mes "[Baroso]";
			mes "It is said to be one of the most indispensable professions during party play." ;
			next;
			mes "[Baroso]";
			mes "From ^8C2121Acolyte can change jobs to Priest or Monk. ^000000";
			break;
		case 7:
			mes "[Baroso]";
			mes "Special primary occupations include Taekwon Kid, Ninja, Supernovice, and Gunslinger." ;
			mes "Which description would you like to hear?" ;
			while(1) {
				next;
				switch(select("Taekwon Kid", "Ninja", "Supernovice", "Gunslinger", "Stop talking")) {
				case 1:
					mes "[Baroso]";
					mes "This profession was introduced from a far eastern country and uses fighting techniques consisting mainly of kicking." ;
					next;
					mes "[Baroso]";
					mes "Through this profession, it is possible to change jobs to become a Star Gladiator with stronger attack techniques or a Soul Linker who manipulates various souls to help others." ;
					break;
				case 2:
					mes "[Baroso]";
					mes "Ninja, who excel in quick movements, can use throwing weapons and ninjutsu as well as common weapons." ;
					mes "It is also a multifaceted profession that uses physical and magical attacks along with a variety of evasion skills." ;
					next;
					mes "[Baroso]";
					mes "Ninjas fight their enemies with daggers, windmagic shurikens, throwing weapons, and "ninjutsu," which is similar to magic." ;
					break;
				case 3:
					mes "[Baroso]";
					mes "It is a profession that has further refined its self as a Novice, without forgetting the Novice's mindset." ;
					mes "The best thing about this profession is that it is possible to learn most of the skills of other primary professions." ;
					next;
					mes "[Baroso]";
					mes "Once you become a Supernovice, it is no longer possible to change to another profession, but it is possible to become a character full of personality." ;
					break;
				case 4:
					mes "[Baroso]";
					mes "This profession handles firearms made in the city of Steel "Einbroch" and has excellent long-range attack capabilities. It is recommended for those who aim for powerful firepower." ;
					break;
				case 5:
					mes "[Baroso]";
					mes "...... It seems to be ok." ;
					mes "Then please talk to Hasan." ;
					close;
				}
				if(CHANGE_NV &0x1000 == 0)
					set CHANGE_NV,CHANGE_NV|0x1000;
			}
		case 8:
			mes "[Baroso]";
			mes "...... It seems to be ok." ;
			mes "Then please talk to Hasan." ;
			close;
		}
		if(CHANGE_NV &0x1000 == 0)
			set CHANGE_NV,CHANGE_NV|0x1000;
	}
}

//==============================================================
new_1-4.gat,100,29,4 script aptitude tester 46,{

	function Transport {
		set CHANGE_NV,0;
		switch(rand(6)) {
			case 0:
				savepoint "izlude.gat",94,103;
				warp "prt_fild08.gat",357,212;
				break;
			case 1:
				savepoint "payon.gat",256,242;
				warp "pay_fild01.gat",334,354;
				break;
			case 2:
				savepoint "morocc.gat",149,100;
				warp "moc_fild07.gat",198,39;
				break;
			case 3:
				savepoint "geffen.gat",120,38;
				warp "gef_fild07.gat",327,188;
				break;
			case 4:
				savepoint "prontera.gat",116,72;
				warp "prt_fild08.gat",170,371;
				break;
			case 5:
				savepoint "alberta.gat",31,231;
				warp "pay_fild03.gat",388,70;
				break;
		}
		return;
	}

	function Place {
		switch(getarg(0)) {
			case 1:
				mes "The destination is the satellite city Izlude." ;
				mes "There is a swordsmen's guild on the west side of the city.";
				break;
			case 2:
				mes "The destination is the magic city Geffen." ;
				mes "There is a magic school in the northwest of the city."; break; case 3: mes "The destination is the magic school in the northwest of the city.
				break;
			case 3:
				mes "The destination is the port city Alberta." ;
				mes "There is a merchants' association southwest of the city."; break; case 4: mes "The destination is the port city of Alberta.
				break;
			case 4:
				mes "The destination is the desert city of Morroc." ;
				mes "The Thief guild is on the first basement floor of the pyramid northwest of the city."; break; case 5: mes "The destination is the desert city of Morroc.
				break;
			case 5:
				mes "The destination is the mountain city Payon." ;
				mes "The Archer guild is located in Archer Village, northeast of the city."; break; case 6: mes "The destination is the mountain city of Payon.
				break;
			case 6:
				mes "The destination is the capital city Prontera." ;
				mes "The Prontera Cathedral is located in the northeast of the city."; break; case 7: mes "The destination is the capital, Prontera.
				break;
		}
		return;
	}

	if(CHANGE_NV &0x1000 == 0) {
		mes "[Hasan]";
		mes "Hello." ;
		mes "My name is "Hasan" and I am in charge of vocational aptitude testing. Your name is ......." ;
		mes "^8C2121" +strcharinfo(0)+ "You must be ^000000." ;
		next;
		mes "[Hasan]";
		mes "First you will receive a description of your occupation from Baroso, who is in front of me before the inspection." ;
		close;
	}
	if(CHANGE_NV &0x2000) {
		mes "[Hasan]";
		mes "Oh, how can I help you?" ;
		mes "You've already completed the vocational aptitude test and we've given you the supplies." ;
		mes "Then let me send you to the nearest town." ;
		next;
		Transport;
		end;
	}
	mes "[Hasan]";
	mes "Hello, ^8C2121" +strcharinfo(0)+ "Dear ^000000." ;
	mes "Good job on getting here." ;
	mes "Good job. ...... Hmmm... I see that you have already received the job description." ;
	mes "Then, at the end, we will give you a vocational aptitude test." ;
	mes "But this will not be mandatory." ;
	next;
	mes "[Hasan]";
	mes "It means that if you don't want to accept it, you can pass it." ;
	mes "On the other hand, if you take the inspection, you will be paid for it." ;
	next;
	mes "[Hasan]";
	mes "First, there are recovery items that will be provided during the inspection process." ;
	mes "That will be quite useful in the early stages of your adventure." ;
	next;
	mes "[Hasan]";
	mes "Next, after inspection, ^882420" +strcharinfo(0)+ "^000000 we recommend a suitable occupation for you." ;
	mes "We will then send you to the city related to the occupation you have requested. There are also several other supplies." ;
	next;
	mes "[Hasan]";
	mes "What will you do then?" ;
	mes "Do you want to start your adventure right away or take a vocational aptitude test?" ;
	mes "How about it?" ;
	next;
	if(select("I will take the vocational aptitude test", "No thanks")==2) {
		mes "[Hasan]";
		mes "Okay. Then I will send you to the city immediately." ;
		next;
		mes "[Hasan]";
		mes "Further knowledge and skills will be acquired as you gain experience in actual adventures." ;
		next;
		mes "[Hasan]";
		mes ""+strcharinfo(0)+ " We wish you success and good luck in the future." ;
		mes "Well, goodbye." ;
		next;
		Transport;
		end;
	}
	mes "[Hasan]";
	mes "I understand." ;
	mes "If you want to be a true adventurer, participating in this inspection is the right choice." ;
	mes "If you had refrained, you would have lost a lot." ;
	next;
	mes "[Hasan]";
	mes "Now we will begin the vocational aptitude test." ;
	mes "Please remain calm and answer the questions as you normally would. Choose the one that seems closest to your behavioral tendencies for the question." ;
	next;
	mes "[Hasan]";
	mes "This test is simply to analyze your personality, good or bad. Now, let's begin." ;
	next;
	// Appropriateness test from here.
	//'@point array and add to it, element numbers are 1- Swordsman, 2-Maj, 3-Merchant, 4-Thief, 5-Acha, 6-Aco
	mes "[Hasan]";
	mes "Choose the word that seems closest to you in the following." ;
	next;
	switch( select("diligent", "active", "service", "violent")) {
		case 1:
			set '@point[2],'@point[2]+1;
			break;
		case 2:
			set '@point[1],'@point[1]+1;
			set '@point[4],'@point[4]+1;
			break;
		case 3:
			set '@point[6],'@point[6]+1;
			break;
		case 4:
			set '@point[4],'@point[4]+1;
			break;
	}
	switch( select("change", "permanent")) {
		case 1: set '@point[2],'@point[2]+1; break
		case 2: set '@point[6],'@point[6]+1; break
	}
	switch( select("consumer", "seller", "producer") ) {
		case 1:
			set '@point[1],'@point[1]+1;
			set '@point[4],'@point[4]+1;
			set '@point[6],'@point[6]+1;
			break;
		case 2:
			set '@point[3],'@point[3]+1;
			break;
		case 3:
			set '@point[2],'@point[2]+1;
			break;
	}
	switch( select("prompt", "prudent")) {
		case 1: set '@point[4],'@point[4]+1; break
		case 2: set '@point[5],'@point[5]+1; break
	}
	switch( select("theory", "experience")) {
		case 1: set '@point[2],'@point[2]+1; break
		case 2: set '@point[1],'@point[1]+1; break
	}
	switch( select("past", "present", "future") ) {
		case 1:
			set '@point[5],'@point[5]+1;
			break;
		case 2:
			set '@point[3],'@point[3]+1; break; case 2: set '@point[4],'@point[4]+1; break
			set '@point[4],'@point[4]+1;
			break;
		case 3:
			set '@point[2],'@point[2]+1;
			break;
	}
	mes "[Hasan]";
	mes "Answer the following questions with 'yes' and 'no'." ;
	next;
	mes "[Hasan]";
	mes "It is better to die gracefully than to live despicably." ;
	next;
	switch( select("Yes", "No")) {
		case 1:
			set '@point[1],'@point[1]+1;
			break;
		case 2:
			set '@point[3],'@point[3]+1; break; case 2: set '@point[4],'@point[4]+1; break
			set '@point[4],'@point[4]+1;
			break;
	}
	mes "[Hasan]";
	mes "Human misery tastes dense." ;
	next;
	switch( select("yes", "no")) {
		case 1: set '@point[3],'@point[3]+1; break;
		case 2: set '@point[6],'@point[6]+1; break
	}
	mes "[Hasan]";
	mes "I'm not afraid to go on in dangerous places." ;
	next;
	switch( select("Yes", "No")) {
		case 1: set '@point[1],'@point[1]+1; break;
		case 2: set '@point[2],'@point[2]+1; break
	}
	mes "[Hasan]";
	mes "I'm the type to come forward in any matter." ;
	next;
	switch( select("Yes", "No")) {
		case 1: set '@point[1],'@point[1]+1; break;
		case 2: set '@point[5],'@point[5]+1; break;
	}
	mes "[Hasan]";
	mes "While exploring the dungeon, I hit the end of the road. Upon closer examination of the wall, I found a mark that looked like the word "push" had been written on it. Near the mark is a protruding stone that looks like a button." ;
	mes "At such a time ......." ;
	next;
	mes "[Hasan]";
	mes "It says "push" but you want to pull the opposite." ;
	next;
	switch( select("Yes", "No")) {
		case 1: set '@point[4],'@point[4]+1; break;
		case 2: set '@point[1],'@point[1]+1; break;
	}
	mes "[Hasan]";
	mes "Sometimes I see unrealistic phenomena that should not exist in reality." ;
	next;
	switch( select("Yes", "No")) {
		case 1: set '@point[6],'@point[6]+1; break;
		case 2: set '@point[2],'@point[2]+1; break;
	}
	mes "[Hasan]";
	mes "If you jump off the rooftop, you might be able to fly." ;
	next;
	switch( select("Yes", "No")) {
		case 1: set '@point[6],'@point[6]+1; break;
		case 2: set '@point[2],'@point[2]+1; break;
	}
	mes "[Hasan]";
	mes "Money is everything in the world." ;
	mes "As long as you have money, you can do anything." ;
	mes "As long as you have money, I think you can even buy and sell life forms." ;
	next;
	switch( select("yes", "no")) {
		case 1: set '@point[5],'@point[5]+1; break;
		case 2: set '@point[3],'@point[3]+1; break
	}
	mes "[Hasan]";
	mes "Now we'll change the question format a bit." ;
	mes "Please be calm and go through the inspection." ;
	mes "Now, choose the one that seems closest to your behavioral tendencies in response to the questions." ;
	next;
	mes "[Hasan]";
	mes "Being on time is ......." ;
	next;
	switch( select("I feel like a machine and suffocate", "It's a good thing", "No matter, I'm not bound by anything")) {
		case 1:
			set '@point[1],'@point[1]+1;
			set '@point[4],'@point[4]+1;
			break;
		case 2:
			set '@point[2],'@point[2]+1; break; case 3: set '@point[6],'@point[6]+1; break
			set '@point[6],'@point[6]+1;
			break;
		case 3:
			set '@point[3],'@point[3]+1; break; case 3: set '@point[5],'@point[5]+1; break
			set '@point[5],'@point[5]+1;
			break;
	}
	mes "[Hasan]";
	mes "I found something I wanted very much at the store." ;
	mes "I feel tempted to impulse buy." ;
	mes "So before you buy it ......." ;
	next;
	switch( select("Make sure you need it", "Make sure you have enough money now", "Think about it after you buy it")) {
		case 1: set '@point[5],'@point[5]+1; break;
		case 2: set '@point[3],'@point[3]+1; break
		case 3: set '@point[4],'@point[4]+1; break
	}
	mes "[Hasan]";
	mes "You have a lot of people to compete with ......." ;
	next;
	switch( select("I like", "I dislike", "I can't say either")) {
		case 1:
			set '@point[3],'@point[3]+1;
			break;
		case 2:
			set '@point[4],'@point[4]+1;
			break;
		case 3:
			set '@point[1],'@point[1]+1; break; case 4: set '@point[4],'@point[4]+1; break
			set '@point[6],'@point[6]+1;
			break;
	}
	mes "[Hasan]";
	mes "One person has to do the heavy lifting. It would take a tremendous amount of time by myself, but if I do it with a lot of people, I can get it done fairly quickly." ;
	mes "If that's the case, you can ......." ;
	next;
	switch( select("Even if it's hard, I'll do it by myself.", "I'll ask someone I know for help.")) {
		case 1: set '@point[2],'@point[2]+1; break;
		case 2: set '@point[3],'@point[3]+1; break
	}
	mes "[Hasan]";
	mes "If anyone needs help from you: ......" ;
	next;
	switch( select("help immediately", "wait and see the situation", "ignore if it has nothing to do with me")) {
		case 1:
			set '@point[6],'@point[6]+1;
			break;
		case 2:
			set '@point[1],'@point[1]+1;
			set '@point[5],'@point[5]+1;
			break;
		case 3:
			set '@point[2],'@point[2]+1; break; case 4: set '@point[2],'@point[2]+1; break
			set '@point[3],'@point[3]+1; break; case 4: set '@point[4],'@point[4]+1; break
			set '@point[4],'@point[4]+1;
			break;
	}
	mes "[Hasan]";
	mes "I was walking down the street and happened to find some 'clothes'." ;
	mes "What would you think?" ;
	next;
	switch( select("It's made by a famous brand company.", "Who is the owner of these clothes?" , "Let's take it home", "Let's leave it as it is")) {
		case 1:
			set '@point[3],'@point[3]+1;
			break;
		case 2:
			set '@point[6],'@point[6]+1;
			break;
		case 3:
			set '@point[3],'@point[3]+1; break; case 4: set '@point[4],'@point[4]+1; break
			set '@point[4],'@point[4]+1;
			break;
		case 4:
			set '@point[2],'@point[2]+1;
			break;
	}
	mes "[Hasan]";
	mes "When your position becomes difficult in the middle of a conversation: ......" ;
	next;
	switch( select("make a joke and cover it up", "change the subject", "thoroughly investigate the cause", "apologize at any rate")) {
		case 1: set '@point[4],'@point[4]+1; break
		case 2: set '@point[1],'@point[1]+1; break
		case 3: set '@point[2],'@point[2]+1; break
		case 4: set '@point[6],'@point[6]+1; break
	}
	mes "[Hasan]";
	mes "If your girlfriend asks you to buy her a crappy insignia ghost product that she doesn't need, you're ......." ;
	next;
	switch( select("I'll buy whatever your girlfriend wants", "I refuse", "I'll buy it for you next time")) {
		case 1: set '@point[1],'@point[1]+1; break;
		case 2: set '@point[3],'@point[3]+1; break
		case 3: set '@point[4],'@point[4]+1; break
	}
	mes "[Hasan]";
	mes "Inspection is now complete." ;
	mes "And the whole process of Novice Training Ground is also finished." ;
	mes "Thank you for your hard work." ;
	next;
	mes "[Hasan]";
	mes "This is the reward for the vocational aptitude test." ;
	mes "Please accept it." ;
	next;
	set CHANGE_NV,CHANGE_NV|0x2000;
	getitem 501,4;
	getitem 503,2;
	getitem 506,2;
	next;
	mes "[Hasan]";
	mes "After the announcement of the overall evaluation ^882420" +strcharinfo(0)+ "Let me tell you the suitable occupation for Mr. ^000000." ;
	mes "Please wait a moment." ;
	next;
	mes "[Hasan]";
	mes "........................" ;
	mes "I'll be done soon." ;
	mes "................................................" ;
	next;
	mes "[Hasan]";
	mes "........................!!!" ;
	next;
	mes "[Hasan]";
	mes "The result is available." ;
	mes "^882420" +strcharinfo(0)+ "We present the overall evaluation of ^000000-sama." ;
	next;
	//Store the subscript with the largest points in '@i
	set '@i,1;
	for(set '@j,1; '@j<=5; set '@j,'@j+1) {
		if('@point['@i] < '@point['@j+1])
			set '@i,'@j+1;
	}
	setarray '@name$[1], "Swordsman", "Magician", "Merchant", "Thief", "Archer", "Acolyte";
	switch('@i) {
		case 1:
			mes "[Hasan]";
			mes "He is simple and linear but has a strong faith GHOST and wants to be a person who will have a great impact on the world." ;
			mes "A righteous type who tries to protect the weak." ;
			next;
			mes "[Hasan]";
			mes "You are assertive, and ^696969 swordsman^000000 fits you best." ;
			break;
		case 2:
			mes "[Hasan]";
			mes "An independent type who works alone, trying to understand everything so that people don't see you as foolish." ;
			mes "Intelligent and judgmental." ;
			mes "Introverted, analytical and insightful type." ;
			next;
			mes "[Hasan]";
			mes "You like to observe, and ^696969Magician^000000 is the best fit for you." ;
			break;
		case 3:
			mes "[Hasan]";
			mes "You have an excellent popular sense of people's psychology." ;
			mes "Organized and decisive." ;
			mes "Goal oriented, responsible but basically optimistic." ;
			next;
			mes "[Hasan]";
			mes "You have a high desire for fulfillment, and ^696969 merchant^000000 is the best fit for you." ;
			break;
		case 4:
			mes "[Hasan]";
			mes "You have a strong desire to make life pleasant. The type of person who is always looking for a new job and wants to contribute to the world." ;
			next;
			mes "[Hasan]";
			mes "You have an adventurous spirit and a ^696969Thief^000000 profession suits you best." ;
			break;
		case 5:
			mes "[Hasan]";
			mes "You are the type of person who tries hard to understand various emotions that you normally don't understand, and still try to help others understand them." ;
			mes "Also, not content with an ordinary life, he tries to find his own life." ;
			next;
			mes "[Hasan]";
			mes "You are a sensitive and romantic person, and ^696969Archer^000000 is the best fit for you." ;
			break;
		case 6:
			mes "[Hasan]";
			mes "You are warm-hearted, kind, and considerate of others." ;
			mes "He does not separate himself from anyone and tries to help. The type of person who likes to take care of others. The type who takes care that he does not need help from others and is called an altruist by others." ;
			next;
			mes "[Hasan]";
			mes "You like to help people, and ^696969Acolyte^000000 is the best fit for you." ;
			//mes "*He who desires the happiness of others at the expense of self*";
			break;
	}
	mes "...... and it says." ;
	next;
	mes "[Hasan]";
	mes "Whatever the result of your overall evaluation, this is just one reference." ;
	mes "So, which profession would you prefer?" ;
	mes "Is it the " +'@name$['@i]+ "or other profession in the test results?" ;
	next;
	mes "[Hasan]";
	mes "Just for your information, you will receive more payment if you choose the same occupation as your inspection result. So, please choose one." ;
	next;
	if(select('@name$['@i]+"in!" , "In the occupation I want!") ==1) {
		mes "[Hasan]";
		mes "Roger." ;
		mes "You believe the test results." ;
		mes "Then we will send you to the city related to your profession after the provision of goods." ;
		next;
		mes "^882420[breakdown of provision]^000099";
		switch('@i) {
		case 1:
			mes "1 falchion";
			getitem 1104,1;
			break;
		case 2:
			mes "1 rod 1 cutter 1";
			getitem 1601,1;
			getitem 1204,1;
			break;
		case 3:
			mes "1 battle axe"; getitem 1601,1; getitem 1204,1; break; case 3: mes "1 battle axe";
			getitem 1351,1;
			break;
		case 4:
			mes "Maingauche 1 piece"; getitem 1207,1; break; case 4: mes "Maingauche 1 piece";
			getitem 1207,1;
			break;
		case 5:
			mes "1 composite bow";
			getitem 1704,1;
			break;
		case 6:
			mes "1 mace"; getitem 1504,1; break; case 6: mes "1 mace";
			getitem 1504,1;
			break;
		}
		mes "Phracon 7 potions for beginners 10^000000";
		getitem 1010,7;
		getitem 569,10;
		next;
		mes "[Hasan]";
		mes "Please make sure you have all the supplied items. Now let's have a brief description of the supplied items." ;
		next;
		mes "[Hasan]";
		switch('@i) {
		case 1:
			mes "[Falchion]" when he changed his job to a swordsman."; next; switch('@i'); next; mes "[Hasan]"; switch('@i')
			break;
		case 2:
			mes "Rod" and "Cutter" are used when you change your job to Magician.";
			break;
		case 3:
			mes "Battle Axe" is used when you change your job to Merchant."; break; case 3: mes "Battle Axe" is used when you change your job to Magician."; break
			break;
		case 4:
			mes "Maingauche" is used when the player changes his job to Thief;
			break;
		case 5:
			mes "Composite Bow" is changed to Archer."; break; case 6: mes "Composite Bow" is changed to Thief;
			break;
		case 6:
			mes "Mace" is used when changing jobs to Acolyte;
			break;
		}
		mes "It is a weapon that will often be used in place of the beginner's Maingauche." ;
		next;
		mes "[Hasan]";
		mes "Phracon" is an item used by blacksmiths to upgrade a weapon level 1 item by one level. Some cities have refineries where Blacksmith Artisan operates." ;
		next;
		mes "[Hasan]";
		mes "You can take the Phracon with you even after you change jobs." ;
		Place '@i;
		mes "You should go there once." ;
	}
	else {
		mes "[Hasan]";
		mes "Understood." ;
		mes "Then please select your preferred occupation." ;
		next;
		set '@name$['@i],"""; //fill in the same occupation as the test result with an empty letter
		set '@i,select('@name$[1],'@name$[2],'@name$[3],'@name$[4],'@name$[5],'@name$[6]);
		mes "[Hasan]";
		mes ""+'@name$['@i]+ "Yes."" ;
		Place '@i;
		next;
		mes "[Hasan]";
		mes "Then, after the provision of goods, we will send you to the city related to your profession." ;
		next;
		mes "^882420[breakdown of supplies]";
		mes "^000030 1 adventure suit ^000099 10 beginner's potions ^000000";
		getitem 2305,1;
		getitem 569,10;
		next;
		mes "[Hasan]";
		mes "Please make sure you have all the supplied items. Now let's have a brief description of the supplied items." ;
		next;
		mes "[Hasan]";
		mes "The Adventure Suit is the next outfit you will wear after the Ninja Suit for beginners that you have already been provided." ;
	}
	next;
	mes "[Hasan]";
	mes "Then we will send it to you." ;
	mes "^882420" +strcharinfo(0)+ "^000000Sama wishes you good luck. Good bye." ;
	close2;
	set CHANGE_NV,0;
	switch('@i) {
		case 1:
			savepoint "izlude.gat",94,103;
			warp "izlude_in.gat",74,167;
			break;
		case 2:
			savepoint "geffen.gat",120,38;
			warp "geffen_in.gat",163,98;
			break;
		case 3:
			savepoint "alberta.gat",31,231;
			warp "alberta_in.gat",62,44;
			break;
		case 4:
			savepoint "morocc.gat",149,100;
			warp "moc_ruins.gat",155,44;
			break;
		case 5:
			savepoint "payon.gat",256,242;
			warp "payon_in02.gat",64,65;
			break;
		case 6:
			savepoint "prontera.gat",116,72;
			warp "prt_church.gat",172,19;
			break;
	}
	end;
}
*/
