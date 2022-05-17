//====================================================================
//Ragnarok Online Thief jobchange script
// - CHANGE_TF -> 0 to 1, 0 to 3(Old)
// - CHANGE_TF -> 0 to 1, 0 to 3(Old)
// OLD_CLASS -> occupation before reincarnation
// @doubt_npc -> 0-4
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

moc_prydb1.gat,39,129,2 script Guild Member#TF 69,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Assassin || OLD_CLASS == Job_Rogue)) {
		if(Job == Job_Novice) {
			mes "[ThiefGuild Member]";
			mes "Hey, I think I saw that somewhere." ;
			mes "Do you have a brother?" ;
			next;
			if(getskilllv(1) < 9) {
				mes "[ThiefGuild Member]";
				mes "What, you want to be a Thief?" ;
				mes "But aren't you forgetting something simple for that?" ;
				next;
				mes "[ThiefGuild Member]";
				mes "Go grow your JobLv to 10 and get your ^0000FF "Basic Skills" level to 9 ^000000." ;
				next;
				mes "[ThiefGuild Member]";
				mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^000000FF "Skill List" ^000000 window!" ;
				mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
				next;
				mes "[ThiefGuild Member]";
				mes "To increase the level of a skill, you'll need to press the ^FF000000 "Confirm"^000000 button after assigning the skill points." ;
				mes "Attention, please." ;
				next;
				mes "[ThiefGuild Member]";
				mes "Well, you'll have to work out a little more before you can come back!" ;
				close;
			}
			mes "[ThiefGuild Member]";
			mes "Or is that the guy you made me change jobs with a long time ago?" ;
			mes "Okay, I'll let you change jobs again!" ;
			next;
			unequip;
			jobchange Job_Thief,UPPER_HIGH;
			//setquest 51010;
			//setquest 51050;
			//setquest 51105;
			//setquest 51160;
			skill 149,1,0;
			skill 150,1,0;
			skill 151,1,0;
			skill 152,1,0;
			mes "[ThiefGuild Member]";
			mes "Thiefs live like Thiefs!" ;
			mes "The rest is omitted because I'm busy." ;
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[ThiefGuild Member]";
		mes ""+(Sex)? "Hey, bro." : "Hey, Sis." ;
		mes "What are you doing here?  Go home, go home!" ;
		close;
	}
	if(Job == Job_Thief) {
		mes "[ThiefGuild Member]";
		mes "Yo, if you have any problems, you can always talk to this onee-san!" ;
		mes "Yeah?" ;
		next;
		mes "[ThiefGuild Member]";
		mes ""+(Sex)? "Brother,": "Sis, now that you're a Thief, you should try the Adventurer Academy." ;
		next;
		mes "[ThiefGuild Member]";
		mes "You see the person in the corner of this room who is supporting the Adventurer Academy?" ;
		mes "They'll send it to you." ;
		close;
	}
	if(Job ! = Job_Novice) {
		mes "[ThiefGuild Member]";
		mes "What are you ......?" ;
		switch(Job) {
			case Job_Swordman: mes "You stupid Swordsman!" ; break;
			case Job_Magician: mes "You're a circus magician!" ; break;
			case Job_Archer: mes "You're an idiot Archer!" ; break;
			case Job_Acolyte: mes "Acolyte, the world's most powerful entertainer worshipper! ; break;
			case Job_Merchant: mes "You're a vicious merchant!" ; break;
		}
		if(Job < Job_Thief) {
			next;
			mes "[ThiefGuild Member]";
		}
		mes ""+(Sex)? "Hey, bro." : "Hey, sis." ;
		mes "What are you doing here?  Go home, go home!" ;
		close;
	}
	switch(CHANGE_TF) {
	case 0:
		mes "[ThiefGuild Member]";
		mes "Heh ......" +((Sex == 0)?" Miss": "little boy")+ "has come all the way to this filthy place for what?" ;
		break;
	case 1:
		mes "[ThiefGuild Member]";
		mes "Oh, here we go again." ;
		mes "You're sure this time, right?" ;
		break;
	}
	//continuation of case0,1
	next;
	if(select("I want to be Thief." }, "Nothing.") ==2) {
		mes "[ThiefGuild Member]";
		mes "What the heck. I'm not even changing jobs. ......" ;
		mes "What are you really doing here?" ;
		mes "What are you thinking ......?" ;
		close;
	}
	if(CHANGE_TF==0) {
		mes "[ThiefGuild Member]";
		mes "...... Nothing to brag about, right?" ;
		mes "How can you say such an embarrassing thing about wanting to be a Thief?" ;
		mes "Are you an idiot?  Are you going to advertise to people walking down the street that I'm going to be a Thief?　Hey, what's in your head?" ;
		next;
		mes "[ThiefGuild Member]";
		mes "Do you really want to be a Thief?" ;
		next;
		switch (select("Yeah." , "No." , "You who says that?")) {
		case 1:
			mes "[ThiefGuild Member]";
			mes "Hmmm ......" ;
			mes "Well, if that's the case..." ;
			break;
		case 2:
			mes "[ThiefGuild Member]";
			mes "Then what?" ;
			mes "Do you have a girlfriend here?" ;
			mes "If not, what are you doing here in the Thief Guild?" ;
			break;
		case 3:
			mes "[ThiefGuild Member]";
			mes "What ......?  I'm ......?" ;
			mes "Well, I'm ...... Just ...... Ugh, don't ask me the details!" ;
			break;
		}
		mes "Anyway, don't say you want to be Thief in the real world!" ;
		next;
		mes "[ThiefGuild Member]";
		mes "Do you really, really want to be a Thief?" ;
		next;
		if(select("Yes." }, "I'm still going to quit.") ==2) {
			mes "[ThiefGuild Member]";
			mes "What the heck. I'm not even changing jobs. ......" ;
			mes "What are you really doing here?" ;
			mes "What are you thinking ......?" ;
			close;
		}
		set CHANGE_TF,1;
		mes "[ThiefGuild Member]";
		mes "Then say your name." ;
		mes "Yeah?  What?" ;
		mes " " +strcharinfo(0)+ " ......" ;
		 ;
		next;
		mes "[ThiefGuild Member]";
		mes "The application is OK."
		mes "If you already know the job requirements, I'll go ahead and start the interview process." ;
		mes "Do you want to give it a try?" ;
		next;
		if(select("Yeah, sure", "No, later")==2) {
			mes "[ThiefGuild Member]";
			mes "Well, suit yourself. Bye-bye~";
			close;
		}
	}
	mes "[ThiefGuild Member]";
	mes "Now then, shall we check?" ;
	next;
	mes "[ThiefGuild Member]";
	mes "The name is " +strcharinfo(0)+ "." ;
	mes "Let's see, ...... Ah, here it is." ;
	mes "Last name " +strcharinfo(0)+ "." ;
	mes "Hey - wait a minute";
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[ThiefGuild Member]";
		mes "I understand your desire to become a Thief, but ......" ;
		mes "You can't live in the world by will alone!" ;
		mes "You have to have at least ^0000FF "Basic Skills" level 9^000000!" ;
		next;
		mes "[ThiefGuild Member]";
		mes "You have to grow your JobLv to 10 and go to a level of ^0000FF "Basic Skills" of 9^000000!" ;
		next;
		mes "[ThiefGuild Member]";
		mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^000000FF "Skill List" ^000000 window!" ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[ThiefGuild Member]";
		mes "To increase the level of a skill, you'll need to press the ^FF000000 "Confirm"^000000 button after assigning the skill points." ;
		mes "Attention, please." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[ThiefGuild Member]";
	mes "Yeah ...... If you look at the documents, there are some interesting parts to some extent: ......" ;
	mes "And the basics are done, too. ...... It's good." ;
	mes "That concludes the Thief Guild interview!" ;
	next;
	getitem 11028,1;
	unequip;
	jobchange Job_Thief;
	set CHANGE_TF,0;
	setquest 50115;
	mes "[ThiefGuild Member]";
	mes "Congratulations on your Thief job change." ;
	mes "Thereafter, as a member of the Thief Guild, you will observe the order and norms of the guild. In the unlikely event that the Thief Guild is harmed by stray behavior or rule violations, ";
	next;
	mes "[ThiefGuild Member]";
	mes "Remember that your presence will be erased by the guild." ;
	mes "Well, I expect great activity." ;
	mes "That's all." ;
	next;
	mes "[ThiefGuild Member]";
	mes "That's it for the hard talk." ;
	next;
	mes "[ThiefGuild Member]";
	mes "This Book of Thief tells you what you should do as Thief." ;
	mes "You should read through it." ;
	next;
	mes "[ThiefGuild Member]";
	mes "Now your job change to Thief is complete!" ;
	mes "Thiefs live like Thiefs!" ;
	mes "We look forward to your success!" ;
	close;
OnInit:
	waitingroom "Job change",0;
	end;
}


//==========================================
// mushroom collecting
//------------------------------------------

moc_ruins.gat,141,125,3 script Suspicious Fellow 83,{
	if(Job == Job_Thief) {
		mes "[ThiefGuild Member]";
		mes "Heh, you've become a fine Thief." ;
		mes "But you can't get in here anymore." ;
		mes "As you probably know, this is a testing ground only for guys who want to change jobs. Go pick up something more interesting and tasty." ;
		close;
	}
	if(Job ! = Job_Novice) {
		switch(@doubt_npc) {
		case 0:
			mes "[Suspicious Fellow]";
			mes "Hello - it's a beautiful day!" ;
			mes "On a warm sunny afternoon like today, it's best to have a picnic near the pyramid." ;
			break;
		case 1:
			mes "[Suspicious Fellow]";
			mes "'Having a home to return to is the first step to happiness." ;
			mes "This is my favorite proverb. A home to go back to..." ;
			break;
		case 2:
			mes "[Suspicious Fellow]";
			mes "............... ";
			break;
		case 3:
			mes "[Suspicious Fellow]";
			mes "Oh I am not an a, a, a, a, a, a, a person." ;
			mes "Don't look at me like that, please." ;
			break;
		case 4:
			mes "[Suspicious Fellow]";
			mes "...... You're persistent." ;
			mes "I have nothing more to say to you, so go away." ;
			close;
		}
		set @doubt_npc,@doubt_npc+1;
		close;
	}
	switch(CHANGE_TF) {
	case 0:
		mes "[Suspicious Fellow]";
		mes "You beginner!" ;
		mes "Do you want to live a wonderful life?" ;
		mes "Want an easier life?" ;
		mes "Then be a Thief!" ;
		mes "Then join the Thief Guild!" ;
		next;
		mes "[Suspicious Fellow]";
		mes "The Thief Guild welcomes you!" ;
		mes "Join now and get a points card! (Just kidding) Located in the Pyramid Dungeon, 1st floor, down the center stairs, to the left!　Or right!" ;
		mes "Don't go straight!" ;
		close;
	case 1:
		mes "[Suspicious Fellow]";
		mes "I smell a strange Thief ......" ;
		mes "You are ...... You'll be a Thief in the future ......" ;
		close;
	}
}

moc_prydb1.gat,42,133,2 script Guild Member 118,{
	if(Job == Job_Thief) {
		mes "[Brade]";
		mes "I don't have any special events right now." ;
		mes "Meet up when we call you." ;
		close;
	}
	if(Job ! = Job_Novice || Upper == UPPER_HIGH) {
		mes "[ThiefGuild Member]";
		mes "Hey, hey, hey there!" ;
		mes "What are you doing here?" ;
		mes "There's no place for you here, so let's get you out of here." ;
		close;
	}
	mes "[ThiefGuild Member]";
	mes "Yeah?" ;
	mes "You're a newbie, what do you want here?" ;
	mes "If you want to change jobs to Thief, ask my sister next to me." ;
	close;
}
