//====================================================================
//Ragnarok Online Assassin jobchange script
// - CHANGE_AS
// - CHANGE_AS
// 1 Written exam
// 2 Written test passed
// 3 Practical test 1
// 4 Practical exam 2
// 5 Final exam cleared
// - $@as_tester$ -> character name of the person who attempted the practical test
// - $@as_tester$ -> character name of practical test taker
// @as_step -> for Guildmaster room
//====================================================================

//==========================================
// test reception and job change
//------------------------------------------

in_moc_16.gat,19,33,4 script Guild Member 55,{
	if(Upper == UPPER_HIGH) {
		mes "[Ferocious-looking guy]";
		mes "How ...... You are ......." ;
		mes "You've got an unusual look." ;
		next;
		mes "[Ferocious-looking guy]";
		mes "But that sign of pressure on me: ......" ;
		mes "I don't like it." ;
		mes "Go home!" ;
		close;
	}
	if(Job == Job_Thief && SkillPoint) {
		mes "[Ferocious-looking guy]";
		mes "You can't change jobs if you have any SkillPoints left." ;
		mes "Everyone should consume and come." ;
		close;
	}
	mes "[Ferocious-looking guy]";
	mes "Hmm..." ;
	mes "What are you doing here?" ;
	mes "......" ;
	next;
	if(Job == Job_Novice) {
		mes "[Ferocious-looking guy]";
		mes "Hey... Novice." ;
		mes "This is no place for a man like you. Walk away..." ;
		close;
	}
	if(getbaseclass(Class) == CLASS_AL) {
		mes "[Ferocious-looking guy]";
		mes "What's a servant of God doing here?" ;
		mes "There is no God here that you seek." ;
		mes "[Ferocious-looking guy]"; mes "Go home..." ;
		close;
	}
	if(Job == Job_Assassin) {
		mes "[Veteran Assassin Huey]";
		mes "Yeah..." ;
		mes "I think it was " +strcharinfo(0)+ "..." ;
		next;
		mes "[Veteran Assassin Huey]";
		mes "Sorry to bother you, but I don't have a job offer from the guild right now." ;
		mes "[Veteran Assassin Huey]"; mes "[Veteran Assassin Huey]"; mes "Stay in training. Farewell." ;
		close;
	}
	if(Job ! = Job_Thief) {
		mes "[Ferocious-looking guy]";
		mes "You got a job for me?" ;
		mes "Otherwise, leave early..." ;
		close;
	}
	if(JobLevel < 40) {
		mes "[Ferocious-looking guy]";
		mes "Yeah... You're still a little out of practice." ;
		mes "If you want to be an Assassin, you must at least have some training as a Thief." ;
		next;
		mes "[Ferocious-looking guy]";
		mes "Then you will come back after further training..." ;
		mes "The exact requirements for changing jobs are JobLv 40 or higher." ;
		close;
	}
	switch(CHANGE_AS) {
	default:
		mes "[Ferocious-looking guy]";
		mes "Yeah... Thief..." ;
		mes "You've got quite the training as a Thief." ;
		mes "What do you think, are you going to switch to Assassin?" ;
		next;
		switch (select("That's why I'm here", "What are the conditions for changing jobs?" , "No thanks")) {
			case 1:
				mes "[Ferocious-looking guy]";
				mes "Mm... It's been a while since I've had a visitor." ;
				mes "Okay, let's send him to reception." ;
				hideoffnpc "Guild Member#assassin1";
				hideonnpc "Guild Member#assassin2";
				close2;
				savepoint "in_moc_16.gat",15,12;
				warp "in_moc_16.gat",19,76;
				end;
			case 2:
				mes "[Ferocious-looking guy]";
				mes "The terms of my new job..." ;
				mes "The three conditions are: 1. to be a Thief, 2. to have a JobLv of 40 or higher, and 3. to pass a test from the guild. Passing a test from the guild." ;
				next;
				mes "[Ferocious-looking guy]";
				mes "If you are a Thief and have trained above a certain level, you can also pass the test easily." ;
				close;
			case 3:
				mes "[Ferocious-looking guy]";
				mes "Well... No choice..." ;
				close;
		}
	case 4:
		mes "[Ferocious-looking guy]";
		mes "[Ferocious-looking guy]" ;
		mes "I'll restore your HP and SP." ;
		mes "[Ferocious-looking guy]"; mes "Try again with your strength." ;
		percentheal 100,100;
		next;
		mes "[Ferocious-looking guy]";
		mes "By the way... Is it enough to make you pass out?" ;
		mes "How about the next challenge..." ;
		mes "Still not possible?" ;
		next;
		if(select("It's okay", "Impossible... I'll do it next time.")==1) {
			mes "[Ferocious-looking guy]";
			mes "Hmm... I see..." ;
			mes "Good luck with that." ;
			close2;
			warp "in_moc_16.gat",19,76;
		}
		else {
			mes "[Ferocious-looking guy]";
			mes "Well... I'm always waiting." ;
			next;
			mes "[Ferocious-looking guy]";
			mes "Oh... Don't forget to save when you get back to town." ;
			mes "Then ......." ;
			close2;
		}
		set CHANGE_AS,2;
		end;
	case 5:
		if(countitem(1008) < 1) {
			mes "[Veteran Assassin Huey]";
			mes "mu...... I don't know what I heard wrong, you don't have a "ruthless heart"." ;
			next;
			mes "[Veteran Assassin Huey]";
			mes "Did you drop it somewhere...?" ;
			next;
			mes "[Veteran Assassin Huey]";
			mes "Go find it quickly before the Guildmaster notices!" ;
			next;
			mes "[Veteran Assassin Huey]";
			mes "Come back as soon as you find him!" ;
			close;
		}
		if(SkillPoint) {
			mes "[Ferocious-looking guy]";
			mes "You can't change jobs if you have any SkillPoints left." ;
			mes "Everyone should consume and come." ;
			close;
		}
		mes "[Veteran Assassin Huey]";
		mes "... Congratulations. You're finally moving on." ;
		mes "But first... Let's see what the Guildmaster asked for..." ;
		next;
		mes "[Veteran Assassin Huey]";
		mes "........." ;
		mes "......" ;
		mes "..." ;
		next;
		delitem 1008,1;
		mes "[Veteran Assassin Huey]";
		mes "Mm, good." ;
		next;
		unequip;
		jobchange Job_Assassin;
		set CHANGE_AS,0;
		mes "[Veteran Assassin Huey]";
		mes "Good, go on your way as an Assassin! Always live up to your GHOST beliefs!" ;
		mes "Come visit me sometime. Celebrate your new job." ;
		close;
	}
}


//==========================================
// First round (written test)
//------------------------------------------

in_moc_16.gat,21,91,2 script Guild Member#assassassin1 730,1,1,{
	end;
OnTouch:
	mes "[Assassin Kai]";
	mes "Yeah...?" ;
	close2;
	misceffect 16;
	hideonnpc;
	hideoffnpc "Guild Member#assassassin2";
	end;
}

in_moc_16.gat,25,90,2 script Guild Member#assassin2 730,2,2,{
	mes "[Assassin Kai]";
	mes "Well come closer. I try to talk to people face to face." ;
	mes "I'm not a big fan of people talking to me faceto-face..." ;
	mes "I especially don't like it when people talk to me from behind..." ;
	close;
OnTouch:
	if(CHANGE_AS ! = 1) {
		mes "[Assassin Kai]";
		mes "What the... He's here to change jobs..." ;
		mes "I have a habit of avoiding anyone who approaches me..." ;
		mes "Hmm... I'm glad you've made it this far." ;
		next;
		mes "[Assassin Kai]";
		mes "You want to ask me about my new job at Assassin?" ;
		next;
		if(select("Yes", "No")==1) {
			mes "[Assassin Kai]";
			mes "Okay, let's make a job application right away." ;
			mes "Write your name and JobLv on the form there." ;
		}
		else {
			mes "[Assassin Kai]";
			mes "Hmm..." ;
			mes "......" ;
			next;
			mes "[Assassin Kai]";
			mes "Really?" ;
			mes "......" ;
			next;
			if(select("Yes", "No, I want to change jobs")==1) {
				mes "[Assassin Kai]";
				mes "Then leave." ;
				close2;
				warp "moc_fild16.gat",206,229;
				end;
			}
			mes "[Assassin-Kai]";
			mes "......" ;
			mes "...... Chillin' or what! Anyway... You're changing jobs, aren't you?" ;
			next;
			mes "[Assassin Kai]";
			mes "Write your name and JobLv on the job change application there." ;
		}
		next;
		mes "[Assassin Kai]";
		mes "Which... " +strcharinfo(0)+ " and..." ;
		mes "JobLv is " +JobLevel+ " ..." ;
		next;
		if(JobLevel >= 50) {
			mes "[Assassin Kai]";
			mes "What! 50!" ;
			mes "You... You've got a lot of experience!"; mes "[Assassin Kai]" ;
			mes "I'm sure the top brass will be pleased to have someone of use after all these years..." ;
			mes "Oh, I'm talking to myself. Write quickly." ;
		}
		else {
			mes "[Assassin Kai]";
			mes "Hmm... That's wise." ;
			mes "Everyone's been so gutless lately..." ;
			mes "Oh, I'm talking to myself. Forget it." ;
		}
		next;
		mes "[Assassin Kai]";
		mes "......" ;
		} next;
		mes "[Assassin Kai]";
		mes "Have you finished making to the application form?" ;
		mes "Then give it to me." ;
		next;
		mes "[Assassin Kai]";
		mes "Alright, go. Good luck." ;
		close2;
		warp "in_moc_16.gat",19,144;
		misceffect 16;
		hideonnpc;
		hideoffnpc "Guild Member#assassassin1";
		end;
	}
	mes "[Assassin Kai]";
	mes "Oh... Did you finish your exam?" ;
	next;
	mes "[Assassin Kai]";
	mes "Hmm... You failed the written exam?" ;
	mes "Pfft... Kkkkkkkkkkkkkkkkkkkkkkkkkkkkk... Ha-ha-ha-ha!" ;
	next;
	mes "[Assassin Kai]";
	mes "No... It's the funniest thing I've seen in a long time" +(Sex? "he": "sis");
	mes "I thought..." ;
	mes "If you want to be an Assassin, you should know that much, right? Damn..." ;
	next;
	mes "[Assassin Kai]";
	mes "... Haha my stomach hurts..." ;
	next;
	mes "[Assassin Kai]";
	mes "Kukku... I don't have time to laugh..." ;
	mes "Hmmm... I'll give you a hint?" ;
	next;
	switch (select("Yes", "Don't laugh, give me a hint", "I don't need a hint")) {
	case 1:
		mes "[Assassin Kai]";
		mes "Puh... Ha ha ha ha!" ;
		mes "This is hilarious..." ;
		mes "My stomach hurts... Don't make me laugh too much!" ;
		next;
		mes "[The Anonymous One]";
		mes "... . kukku";
		next;
		mes "[Assassin Kai]";
		mes "Ha ha ha... You are very brazen for someone whose name I don't even know..." ;
		next;
		mes "[The Anonymous One]";
		mes "......" ;
		next;
		mes "[Assassin Kai]";
		mes "A hint..." ;
		next;
		mes "[Assassin Kai]";
		mes "..." ;
		next;
		mes "[Assassin Kai]";
		mes "......" ;
		next;
		mes "[Assassin Kai]";
		mes "............" ;
		next;
		mes "[Assassin Kai]";
		mes ".................." ;
		next;
		mes "[Assassin Kai]";
		mes "........................" ;
		next;
		mes "[Assassin Kai]";
		mes "Oh no." ;
		next;
		mes "[Assassin Kai]";
		mes "Kukku... He said yes..." ;
		close;
	case 2:
		mes "[Assassin Kai]";
		mes "Hmm... I guess we'll just have to wait and see..." ;
		mes "Well... Yes, everyone makes mistakes."; mes "Well... ;
		mes "Sorry for laughing." ;
		mes "But don't give up your pride." ;
		next;
		mes "[Assassin Kai]";
		mes "A few tips." ;
		mes "I'll say a word or two about Assassin." ;
		next;
		mes "[Assassin Kai]";
		mes "Above all, we must protect our pride." ;
		mes "[Desert Fang]"; mes "Don't say Assassin." ;
		mes "Someday it will be our turn..." ;
		mes "Now we just have to wait for that time..." ;
		next;
		mes "[Assassin Kai]";
		mes "And... Some of us have someone close by, but we usually live in solitude because of our work." ;
		mes "If your loved one or friend gets hurt badly and you have to see blood..." ;
		next;
		mes "[Assassin Kai]";
		mes "You will never forget it." ;
		mes "You will have to live with the weight of it for the rest of your life..." ;
		next;
		mes "[Assassin Kai]";
		mes "It's a little sad, but since I'm going my own way, I guess that's what I have to do..." ;
		mes "It's literally 'my way'." ;
		next;
		mes "[Assassin Kai]";
		mes "So much for what I can say..." ;
		close;
	case 3:
		mes "[Assassin Kai]";
		mes "Mm..." ;
		next;
		mes "[Assassin Kai]";
		mes "That's the spirit. Don't do anything that will throw away your pride." ;
		mes "We have pride as 'Desert Fangs' no matter what anyone says." ;
		mes "Sorry for laughing... I formally apologize..." ;
		next;
		mes "[Assassin Kai]";
		mes "There are too many corrupt people around these days... Even if I put aside my knowledge of my job, where is my pride as Assassin and my memory of the efforts I have made in the past when times were hard..." ;
		next;
		mes "[Assassin Kai]";
		mes "Totally..." ;
		next;
		mes "[Assassin Kai]";
		mes "By all means, don't ever give up your pride when you become Assassin!" ;
		next;
		if(select("... Ok","... I don't want to")==2) {
			mes "[Assassin Kai]";
			mes "... Don't you get it after all this?" ;
			next;
			mes "[Assassin Kai]";
			mes "Is it so hard to keep your pride?" ;
			next;
			mes "[Assassin Kai]";
			mes "You mean to be a [Dog] who licks other people's shoes!" ;
			next;
			mes "[Assassin Kai]";
			mes "Get out! Now!" ;
			mes "People like you don't deserve to be Assassin!" ;
			next;
			mes "[Assassin Kai]";
			mes "Kwak !!!!!" ;
			close2;
			warp "c_tower4.gat",64,76;
			end;
		}
		mes "[Assassin Kai]";
		mes "Mm. You've got a lot of determination in that quiet reply." ;
		mes "Then I will give you some hints." ;
		break;
	}
	next;
	switch(rand(3)) {
		case 0:
			mes "[Assassin Kai]";
			mes "If you pick up an Elder Willow card, sell it immediately to the sorcerers." ;
			mes "They will want the card, which we have no use for. I think it had an effect to increase INT..." ;
			next;
			mes "[Assassin Kai]";
			mes "We should work on our evasion more than our defense." ;
			mes "Sometimes, there are guys who wear heavy equipment even on their heads and train as they are, even though their visibility may not be good.... Are they using their mind's eye or something.... Anyway, heavy equipment like a helm is no good." ;
			next;
			mes "[Assassin Kai]";
			mes "When you learn the Increased Evasion skill, your evasion rate increases by 3 for each step up." ;
			next;
			mes "[Assassin Kai]";
			mes "I say this for GHOST's sake... Qatari series weapons (Jamadahar/Jul/Qatari) are two-handed weapons." ;
			next;
			mes "[Assassin/Khai]";
			mes "Desert city... I miss it..." ;
			mes "It's been a long time since I've been to my hometown of Morroc..." ;
			mes "Seems like just yesterday I was in Thief, but then I realized quite a few years have passed..." ;
			next;
			mes "[Assassin Kai]";
			mes "Speaking of nostalgia, when I snuck into the farm during Thief's career change exam and stole the red hair net mushrooms and the red hair gooey mushrooms..." ;
			mes "That was exciting..." ;
			next;
			mes "[Assassin Kai]";
			mes "Insects will see through the hiding and clawing. I bet they know where we are with those antennae." ;
			next;
			mes "[Assassin Kai]";
			mes "Baphomet Junior... His card effect should be AGI+3 and CRI+1." ;
			next;
			mes "[Assassin Kai]";
			mes "We Assassin have the best AGI, and if we master it, we get an extra 10 in job weighted values. This increase would be a big deal." ;
			break;
		case 1:
			mes "[Assassin, Kai]";
			mes "The sharply sharpened leg bones of a ghoul have the ghoul's attributes, i.e., undead attributes, intact." ;
			next;
			mes "[Assassin Kai]";
			mes "What weapons have you been using..." ;
			mes "Damascus? Stiletto?" ;
			mes "Maingauche?" ;
			mes "If you don't know, look closely at your hand..." ;
			next;
			mes "[Assassin Kai]";
			mes "Qatar has a lot of slots, Desert Wolf has a lot of slots." ;
			mes "Remember well." ;
			next;
			mes "[Assassin Kai]";
			mes "Joules with many slots are held by monsters that tunnel into the soil." ;
			next;
			mes "[Assassin Kai]";
			mes "I don't like frogs." ;
			next;
			mes "[Assassin Kai]";
			mes "Goblins with hammers are, I believe, earth-based...." ;
			mes "The earth attribute is weak against the fire attribute." ;
			next;
			mes "[Assassin Kai]";
			mes "The weapon made bears the name of the blacksmith." ;
			break;
		case 2:
			mes "[Assassin Kai]";
			mes "First, Grim Tooth is a skill that can only be used when equipped with a qatari." ;
			next;
			mes "[Assassin Kai]";
			mes "The word Poison means 'poison'." ;
			next;
			mes "[Assassin Kai]";
			mes "Double Attack is a skill that cuts twice in one attack." ;
			next;
			mes "[Assassin Kai]";
			mes "Red Blood is a fire attribute, and Blue Gemstone is a stone that has nothing to do with Assassin." ;
			next;
			mes "[Assassin Kai]";
			mes "Elder Willow is a cold bolt that the sorcerer's guys are killing with cold bolts." ;
			mes "In other words, the water attribute is strong against the fire attribute." ;
			mes "Conversely, it is weak against the wind attribute." ;
			next;
			mes "[Assassin Kai]";
			mes "Cloaking is by the wall... In other words, you have to be one cell away to be able to steal someone's eye." ;
			mes "As long as a certain skill is not used." ;
			break;
	}
	next;
	mes "[Assassin Kai]";
	mes "Whew... That's a lot of work in its own way..." ;
	mes "This too..." ;
	next;
	mes "[Assassin Kai]";
	mes "Here's a hint that I can tell you about." ;
	mes "I've talked about almost all the issues, but the rest are very basic, so you should be fine. Now, go take the exam for The Anonymous One." ;
	close2;
	warp "in_moc_16.gat",19,144;
	hideonnpc;
	hideoffnpc "Guild Member#assassassin1";
	end;
OnInit:
	OnInit: hideonnpc;
	end;
}

//==============================================================
in_moc_16.gat,19,154,0 script The Anonymous One 139,8,2,{
	switch(CHANGE_AS) {
	case 0:
		mes "[The Anonymous One]";
		mes "Hmm... A customer." ;
		mes "xoxoxo... Don't even look for it." ;
		mes "I'm completely out of sight." ;
		mes "This is just basic, okay?" ;
		mes "Kuk..." ;
		next;
		mes "[The Anonymous One]";
		mes "Yeah, the reason why I don't have a name..." ;
		mes "... Cahahaha! You can afford it..." ;
		mes "Aren't you afraid of the invisible me?" ;
		mes "You never know where the blade is aiming at your back." ;
		next;
		if(select("terrifying..." 
			mes "[The Anonymous One]";
			mes "Hmm, you're a boring guy too..." ;
			next;
			mes "[The Anonymous One]";
			mes "I don't like talking to boring people." ;
		}
		else {
			mes "[The Anonymous One]";
			mes "Hmm... I see." ;
			next;
			mes "[The Anonymous One]";
			mes "......" ;
			next;
			mes "[The Anonymous One]";
			mes "Great, let's keep talking." ;
			next;
			mes "[The Anonymous One]";
			mes "I've been killing and killing." ;
			mes "My hands are completely bloodied..." ;
			next;
			mes "[The Anonymous One]";
			mes "I exist as the sword of the guild." ;
			mes "I am the one who does the killing, but it is the Guild that gives the orders." ;
			mes "I am merely a tool." ;
			mes "So why do I need a name?" ;
			next;
			mes "[The Anonymous One]";
			mes "Kookkook..." ;
			mes "Anyway, I don't like the idea of someone with no skills being Assassin." ;
			mes "So you have to answer the questions well enough to be accepted by me." ;
			next;
			mes "[The Anonymous One]";
			mes "Hmmm... So before I give you the problem, I'll take any questions you have." ;
			mes "Ask me what you want to know?" ;
		}
		while(1) {
			next;
			switch (select("about skills", "about status", "enough already")) {
			case 1:
				mes "[The Anonymous One]";
				mes "Yeah... Skills..." ;
				mes "The effects of skills can change slightly as the world goes on, but there is a basic structure, so let me tell you about it." ;
				next;
				mes "[The Anonymous One]";
				mes "First, 'Qatari Training' literally increases the attack power when using the katari, a weapon used for assassination." ;
				mes "Also, as you increase the level of training, its attack power also increases." ;
				next;
				mes "[The Anonymous One]";
				mes "The [Left-Handed Training] and [Right-Handed Training] Assassin may equip two weapons, one in each hand, together." ;
				mes "However, they are more difficult to handle than one-handed, and their attack power is reduced." ;
				next;
				mes "[The Anonymous One]";
				mes "This skill is designed to compensate for such shortcomings through practice." ;
				mes "[Left Hand Mastery]"; mes "[Left Hand Mastery]"; mes "[Right Hand Mastery]"; mes "[Left Hand Mastery]"; mes "[Right Hand Mastery]"; mes "[Right Hand Mastery]" ;
				next;
				mes "[The Anonymous One]";
				mes "[Sonic Blow]"; mes "[Sonic Blow]"; mes "[Sonic Blow]"; mes "[Sonic Blow]"; mes "[Sonic Blow]"; mes "[Sonic Blow]" ;
				mes "It requires considerable skill and can only be done when equipped with a qatari." ;
				mes "This could be learned by training up to four levels of 'Qatari training'." ;
				next;
				mes "[The Anonymous One]";
				mes "[Grim Tooth]"; mes "[Grim Tooth]"; mes "[Grim Tooth]"; mes "[Grim Tooth]"; mes "[Grim Tooth]" ;
				mes "This technique utilizes "Hiding", which can be learned in Thief, and allows you to attack enemies in a hidden state of invisibility." ;
				next;
				mes "[The Anonymous One]";
				mes "The higher the level of mastery, the further away the enemy can be attacked." ;
				mes "It has some range effect and is used when you have to deal with a large number of enemies. It's only "unavoidable," though." ;
				next;
				mes "[The Anonymous One]";
				mes "In Assassin, the basic technique is "assassination", and Grim Tooth requires at least two "cloaking" practices, since it is based on the premise of disappearing." ;
				next;
				mes "[The Anonymous One]";
				mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "[The Anonymous One]" ;
				mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "[The Anonymous One]"; mes "You can also move invisibly, like I'm doing now." ;
				mes "You have to stay by the wall at all times." ;
				next;
				mes "[The Anonymous One]";
				mes "[Enchanted Poison]"; mes "[Enchanted Poison]"; mes "[The Anonymous One]" ;
				mes "A weapon coated with poison naturally has a "poison attribute" and if attacked in that state, the opponent will be poisoned with a certain probability." ;
				next;
				mes "[The Anonymous One]";
				mes "In addition, if you learn the 'Venom Splasher', you will be able to inflict even more damage." ;
				mes "You can also apply poison to your party's weapons." ;
				mes "Use it effectively." ;
				next;
				mes "[The Anonymous One]";
				 ;
				mes "It can be used on others as well as on yourself." ;
				next;
				mes "[The Anonymous One]";
				mes "[Enchanted Poison]"; mes "[Enchanted Poison]"; mes "[Enchanted Poison]"; mes "[Enchanted Poison]"; mes "[Enchanted Poison]" ;
				next;
				mes "[The Anonymous One]";
				mes "Venum Dust" This technique consumes red gemstones to disperse poison in a designated area. The higher the level of mastery, the longer the contamination time." ;
				next;
				mes "[The Anonymous One]";
				mes "[Enchanted Poison]"; mes "[Enchanted Poison]"; mes "[Enchanted Poison]"; mes "[Enchanted Poison]" ;
				next;
				mes "[The Anonymous One]";
				mes "Venom Splasher" Can be used when an enemy is poisoned and has less than two-thirds of its HP reduced from full health, and when used, the target explodes in a certain amount of time." ;
				next;
				mes "[The Anonymous One]";
				mes "At that time, it also sprays poison in the vicinity, and those nearby take damage." ;
				mes "It is difficult to learn and requires "Poison React" 5 or higher and "Venom Dust" 5 or higher." ;
				next;
				mes "[The Anonymous One]";
				mes "These are all of the Assassin skills." ;
				continue;
			case 2:
				mes "[The Anonymous One]";
				mes "Yeah... Status..." ;
				mes "The most important ability for an Assassin is, by far, agility..." ;
				mes "I guess that would be AGI..." ;
				next;
				mes "[The Anonymous One]";
				mes "To inflict great damage on the enemy during an assassination, "power" - STR would not be negligible..." ;
				next;
				mes "[The Anonymous One]";
				mes "The most efficient way to ensure that you hit the vital spot and kill the enemy most efficiently is to make a "critical" decision, but it is largely dependent on "luck", i.e. LUK." ;
				next;
				mes "[The Anonymous One]";
				mes "I can't say what value is generally stronger, but did you get a little reference?" ;
				mes "You'll have to learn the rest for yourself." ;
				continue;
			case 3:
				mes "[The Anonymous One]";
				mes "Then we'll start the test." ;
				mes "It's a choice question." ;
				next;
				mes "[The Anonymous One]";
				mes "Pass if you answer at least 9 out of 10 questions correctly." ;
				mes "But I won't tell you where you went wrong." ;
				next;
				mes "[The Anonymous One]";
				mes "Hmmm... I'll start..." ;
				set CHANGE_AS,1;
			}
			break; //exit while statement
		}
		break; //exit first switch statement
	case 1:
		mes "[The Anonymous One]";
		mes "Hmmm... You're still not over it, are you?" ;
		next;
		mes "[The Anonymous One]";
		mes "You seem to hate your peaceful and stable life so much..." ;
		next;
		mes "[The Anonymous One]";
		mes "If you can't pass the next test, stop being an Assassin!" ;
		next;
		if(select("I'll live as a mediocre thief", "Keep testing for a new job")==1) {
			mes "[The Anonymous One]";
			mes "Huh... I guess so." ;
			mes "Don't dream of being an Assassin." ;
			mes "You'll always be alone in the world." ;
			next;
			mes "[The Anonymous One]";
			mes "Come on, let's go outside." ;
			mes "And walk home through the sandstorm..." ;
			close2;
			warp "moc_fild16.gat",206,241;
			end;
		}
		mes "[The Anonymous One]";
		mes "kkk..." ;
		mes "I'll always be by your side on your lonely journey. Until the time you lie on the ground." ;
		next;
		mes "[The Anonymous One]";
		mes "Then I'll start the test." ;
		mes "It's a choice question." ;
		next;
		mes "[The Anonymous One]";
		mes "Pass if you answer at least 9 out of 10 questions correctly." ;
		mes "But I won't tell you where you went wrong." ;
		next;
		mes "[The Anonymous One]";
		mes "I hope you pass this time." ;
		break;
	default:
		mes "[The Anonymous One]";
		mes "Kookook..." ;
		close;
	}
	//written test here
	next;
	switch(rand(3)) {
	case 0:
		mes "[The Anonymous One]";
		mes "1. What is the increase in Thief's evasion rate increase skill when trained to the maximum?" ;
		next;
		if(select("30", "40", "160", "20")==1)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "2. Which of the following monsters can spot the hiding?" ;
		next;
		if(select("Wormtail", "Andre", "Mummy", "Soldier Skeleton")==2)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "3. What combinations can't be equipped with Assassin's two-faced sword?" ;
		next;
		if(select("Maingauche + Gladius", "Stiletto + Maingauche", "Qatar + Maingauche", "Damascus + Stiletto")==3)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "4. What is the nearest city to Thief job center?" ;
		next;
		if(select("Prontera", "Lutie", "Alberta", "Morroc")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "5. What cards are not related to AGI?" ;
		next;
		if(select("Baphomet Junior Card", "Whisper Card", "Female Thief Mushi Card", "Male Thief Mushi Card")==2)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "6. state what Assassin does better than other professions." ;
		next;
		if(select("excellent singing", "excellent acting", "excellent dancing", "excellent evasion")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "7. What is the AGI weighted value that Assassin gets at JobLv 50?" ;
		next;
		if(select("7", "8", "9", "10")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "8. What items can't Assassin equip?" ;
		next;
		if(select("silk robe", "helm", "boots", "brooch")==2)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "9. What mushrooms do Nobis need to change their job to Thief?" ;
		next;
		if(select("Red Hairy Sticky Mushroom", "Red Hairy Sticky Mushroom", "Red Hairy Net Mushroom", "Red Hairy Shiitake")==3)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "10. What cards are relatively unassassociated with Assassin?" ;
		next;
		if(select("Whisper Card", "Elder Willow Card", "Soldier Skeleton Card", "Kobold Card")==2)
			set '@point,'@point+10;
		break;
	case 1:
		mes "[The Anonymous One]";
		mes "1. from which monster do you get the Qatar with the most slots?" ;
		next;
		if(select("Thieves", "Pekopeko", "Desert Wolf", "Blunt Kobold")==3)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "2. from which monster can you get a jul with many slots?" ;
		next;
		if(select("Martin", "Desert Wolf", "Marionette", "Mist")==1)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "3. Which professions can manufacture attribute weapons?" ;
		next;
		if(select("Merchant", "Blacksmith", "Thief", "Priest")==2)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "4. Which of the following weapons are not Qatari?" ;
		next;
		if(select("Jamadahar", "Jul", "Qatar", "Gladius")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "5. What are the attributes of most of the monsters in the Izlude dungeon?" ;
		next;
		if(select("water attribute", "fire attribute", "wind attribute", "earth attribute")==1)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "6. Which of the following monsters cannot be made into a cuppet?" ;
		next;
		if(select("PoPoring", "Rodderfrog", "Smokey", "Poison Spore")==2)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "7. Choose the monster whose fire dagger is most effective." ;
		next;
		if(select("Dagger Goblin", "Mace Goblin", "Axe Goblin", "Hammer Goblin")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "8. Choose an unattributed qatari among the following." ;
		next;
		if(select("Qatar of the Blasted Flame", "Qatar of the Sharpened Thorn", "Death Knife", "Traitor")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "9. choose a monster of a different race." ;
		next;
		if(select("Poring", "Master Ring", "Ghost Ring", "Spore")==3)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "10. Which of the following monsters is not undead?" ;
		next;
		if(select("Drake", "Megalodon", "Spore", "Carlitzburg")==3)
			set '@point,'@point+10;
		break;
	case 2:
		mes "[The Anonymous One]";
		mes "1. What skills are not required to learn Grim Tooth?" ;
		next;
		if(select("Clawing Lv 2", "Sonic Blow Lv 5", "Qatar Mastery Lv 4", "Right Hand Mastery Lv 2")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "2. Enchanted Poison is a skill that adds attributes to a weapon." ;
		mes "Choose that attribute from the following." ;
		next;
		if(select("poison attribute", "earth attribute", "dark attribute", "wind attribute")==1)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "3. what is the effect of right hand training Lv4?" ;
		next;
		if(select("Recover 80% of the descending attack power", "Recover 90% of the descending attack power", "Increase 90% of the attack power", "Increase 108% of the attack power")==2)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "4. What items are needed for Benam Dust?" ;
		next;
		if(select("Red Blood", "Blue Gemstone", "Yellow Gemstone", "Red Gemstone")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "5. What skills can be learned by training to Enchanted Poison Lv 5?" ;
		next;
		if(select("Invenum", "Sonic Blow", "Venum Splasher", "Venum Dust")==4)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "6. Which of the following skills can be used to move around without being seen?" ;
		next;
		if(select("Hiding", "Backstepping", "Cloaking", "Sanding")==3)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "7. What is not a condition for the use of a venum splasher?" ;
		next;
		if(select("Target must be poisoned", "Red Gemstone", "Target has less than 1/3 of the total HP")==1)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "8. Among the following, choose the monster that is most effective when attacking with a weapon with a Badon card (20% extra damage to fire targets) stuck in it." ;
		next;
		if(select("Steel Chonchon", "Deviruchi", "Elder Willow", "Baphomet")==3)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "9. how much SP is consumed when a double attack is triggered with a dagger?" ;
		next;
		if(select("15", "0", "10", "54")==2)
			set '@point,'@point+10;
		mes "[The Anonymous One]";
		mes "10. Which of the following weapons are effective in the Izlude dungeon?" ;
		next;
		if(select("Wind Maingauche", "Ice Maingauche", "Earth Maingauche", "Fire Maingauche")==1)
			set '@point,'@point+10;
		break;
	}
	mes "[The Anonymous One]";
	mes "How did you do? Problem." ;
	next;
	mes "[The Anonymous One]";
	mes "Well... The score is..." ;
	mes ""+'@point+ "point..."" ;
	if('@point < 90) {
		mes "Failed. You didn't study hard enough." ;
		next;
		mes "[The Anonymous One]";
		mes "Is that why you decided to become an Assassin?" ;
		mes "Come back to us." ;
		next;
		mes "[The Anonymous One]";
		mes "Or maybe you could learn from "Kai", who is in charge of filling out job applications." ;
		close2;
		warp "in_moc_16.gat",19,76;
		end;
	}
	mes "Test passed." ;
	next;
	mes "[The Anonymous One]";
	mes "Don't worry yet." ;
	mes "There's still more testing to be done." ;
	mes "If you go in the back, the next test will be waiting for you." ;
	set CHANGE_AS,2;
	close;
}


//==========================================
// Secondary Examination (Practical 1)
//------------------------------------------

in_moc_16.gat,19,162,0 script Barcardi 139,3,1,{
	switch(CHANGE_AS) {
	case 0:
	case 1:
		mes "[Barcardi]";
		mes "Go ahead and take the test." ;
		mes "Ignoring basic knowledge..." ;
		close2;
		warp "in_moc_16.gat",19,76;
		end;
	case 2:
		mes "[Barcardi]";
		mes ""+strcharinfo(0)+ "..."" ;
		mes "I passed the written exam well..." ;
		next;
		mes "[Barcardi]";
		mes "Yeah... I would have let you change jobs as it is, but there are too many people living without knowing the basics..." ;
		next;
		mes "[Barcardi]";
		mes "Above all we must protect our self-respect. It's Assassin, the 'fang of the desert'..." ;
		mes "Someday our time will come." ;
		mes "Until then, we just keep waiting..." ;
		next;
		mes "[Barcardi]";
		mes "There are too many mentally corrupt people these days." ;
		next;
		mes "[Barcardi]";
		mes "Where have you forgotten your self-respect as an Assassin and the hard work you must have done in the past..." ;
		next;
		mes "[Barcardi]";
		mes "I'm in trouble. ......" ;
		next;
		mes "[Barcardi]";
		mes "If you change jobs, don't forget your self-respect as an Assassin." ;
		mes "I swear by the weapon in your hand..." ;
		next;
		mes "[Barcardi]";
		mes "Then I will begin to explain the test." ;
		mes "The basis of assassination is quick decisions." ;
		next;
		mes "[Barcardi]";
		mes "In other words, one must immediately distinguish between friend and foe." ;
		mes "Therefore..." ;
		next;
		mes "[Barcardi]";
		mes "The test is to select and defeat the one called "sample for the job change test" that is mixed in among many enemies." ;
		next;
		mes "[Barcardi]";
		mes "The number of "samples for the job change test" is six." ;
		mes "Be careful, because many of them look alike." ;
		mes "If you make a mistake, you'll have to start all over again." ;
		next;
		mes "[Barcardi]";
		mes "If you stay in the waiting room, I'll send you to the exam room." ;
		next;
		mes "[Barcardi]";
		mes "As a rule, you take the exam one at a time." ;
		mes "If someone enters first, he or she is asked to wait until the end of his or her exam. Good." ;
		close;
	default:
		mes "[Barcardi]";
		mes "Don't give up if you fail." ;
		mes "Well, ...... Feel free to turn back." ;
		mes "What are you going to do?" ;
		next;
		if(select("I'm not ready yet", "I'm giving up my new job")==1) {
			mes "[Barcardi]";
			mes "fufu......" ;
			mes "Once again, you have to defeat 6 "samples for the job change test"." ;
			mes "Then I wish you good luck." ;
			close;
		}
		mes "[Barcardi]";
		mes "I see." ;
		mes "Get a good rest before you come." ;
		close2;
		warp "in_moc_16.gat",19,13;
		end;
	}
}

//==============================================================
in_moc_16.gat,21,165,2 script Job Test Guide::AS_ChatRoom 725,{
	end;
OnInit:
	waitingroom "Waiting room "Job change examination room waiting room",10, "AS_ChatRoom::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid '@accid;
	if(attachrid('@accid)) {
		set $@as_tester$,strcharinfo(0); //name of challenger
		set CHANGE_AS,3;
		warp "in_moc_16.gat",66,151;
		donpcevent "AS_Test2nd::OnStart";
	}
	} else
		enablewaitingroomevent;
	end;
}

//==============================================================
in_moc_16.gat,0,0,0 script AS_Test2nd -1,{
OnStart:
	set 'count,6;
	disablenpc "#AS_Warp";
	monster "in_moc_16.gat",62,161, "Sample for job change test",1002,1, "AS_Test2nd::OnKillOK"; 
	monster "in_moc_16.gat",85,169, "Sample for job change test",1063,1, "AS_Test2nd::OnKillOK";
	monster "in_moc_16.gat",88,152, "Sample for job change test",1002,1, "AS_Test2nd::OnKillOK";
	monster "in_moc_16.gat",90,143, "Sample for job change test",1113,1, "AS_Test2nd::OnKillOK";
	monster "in_moc_16.gat",74,167, "Sample for job change test",1031,1, "AS_Test2nd::OnKillOK";
	monster "in_moc_16.gat",77,173, "Sample for job change test",1002,1, "AS_Test2nd::OnKillOK";
	monster "in_moc_16.gat",62,161, "Monster for job change test",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",85,169, "Monster for job change test",1031,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",79,174, "Sample for practical skills test",1113,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",85,156, "Monster for the job change test",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",74,171, "Job change test monster",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",68,173, "Job change test dummy",1113,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",65,158, "Sample for combat test",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",60,158, "Sample for job change test",1113,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",64,169, "Sample for job change experiment",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",71,173, "Sample from the job change test",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",77,172, "Sample for practical test",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",76,172, "Sample for job change test",1063,1, "AS_Test2nd::OnKillNG"; monster "in_moc_16.gat",76,172, "Sample for job change test",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",75,172, "Monster for job change test",1113,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",67,167, "Sample for practical skills test",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",86,170, "Sample for job change experiment",1031,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",86,171, "Sample test for job change experiment",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",86,173, "Sample for practical test",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",85,170, "combat test monster",1031,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",89,156, "sample",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",89,156, "Sample for martyrdom test",1113,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",89,156, "Sample for combat test",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",89,156, "Sample for test sample brave profession",1113,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",89,156, "Sample job change test sample",1031,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",83,169, "Evil Druid",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",63,158, "Doppelganger",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",63,157, "Sample Job Test",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",64,159, "Sample for combat preparation",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",63,159, "Sample for preparation for new job",1063,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",63,159, "Sample for archer job change",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",63,159, "Sample for Swordsman",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",83,148, "Sample for Thief",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",82,148, "Acolyte Job Samples",1002,1, "AS_Test2nd::OnKillNG";
	monster "in_moc_16.gat",84,148, "Merchant job change sample",1002,1, "AS_Test2nd::OnKillNG";
	initnpctimer;
	end;
OnKillOK:
	set 'count,'count-1;
	if('count) {
		announce "Beholder: not yet... Keep up the good work..." ,9;
		end;
	}
	stopnpctimer;
	announce "Beholder: okay, well done... You passed!" ,9;
	announce "Gatekeeper: coordinate 87 137 The door to the next job site has opened.",9;
	killmonster "in_moc_16.gat", "All";
	enablenpc "#AS_Warp";
	initnpctimer "AS_Test3rd"; //start timer for tertiary test
	end;
OnKillNG:
	stopnpctimer;
	announce "Beholder: " +$@as_tester$+ " ! You made a mistake, come back." ,9;
	areawarp "in_moc_16.gat",60,136,93,177, "in_moc_16.gat",19,161;
	killmonster "in_moc_16.gat", "All";
	enablewaitingroomevent "AS_ChatRoom";
	end;
OnTimer1000:
	announce "Beholder: the test is starting",9;
	end;
OnTimer2000:
	announce "Beholder: as I said, defeat only the monster whose name is "sample for the job change test"!" ,9;
	end;
OnTimer3000:
	announce "Beholder: the purpose of the test is to identify the subject more quickly and accurately." ,9;
	end;
OnTimer4000:
	announce "Beholder: Now you will have 3 minutes. I will tell you every minute the time has elapsed." ,9;
	end;
OnTimer5000:
	announce "Beholder: Okay... Start. 3 minutes left!" ,9;
	end;
OnTimer65000:
	announce "Beholder: 2 minutes. Defeat "Job Test Sample"!" ,9;
	end;
OnTimer125000:
	announce "Beholder: 1 minute left!" ,9;
	,9; end; OnTimer125000: announce "Beholder: 1 minute left!
OnTimer180000:
	OnTimer180000: announce "Beholder: 5 seconds before end of test",9;
	end;
OnTimer181000:
	announce "Beholder: 4 seconds before end of test",9;
	end;
OnTimer182000:
	announce "Beholder: - 3 -",9;
	end;
OnTimer183000:
	announce "Beholder: - 2 -",9;
	end;
OnTimer184000:
	announce "Beholder: - 1 -",9;
	end;
OnTimer185000:
	announce "Beholder: finished",9;
	end;
OnTimer186000:
	announce "Beholder: time is up, but you didn't clear.... Try again next time." ,9;
	areawarp "in_moc_16.gat",60,136,93,177, "in_moc_16.gat",19,161;
	end;
OnTimer189000:
	stopnpctimer;
	killmonster "in_moc_16.gat", "All";
	enablewaitingroomevent "AS_ChatRoom";
	end;
}

//==============================================================
in_moc_16.gat,87,137,0 script #AS_Warp 45,2,1,{
	stopnpctimer "AS_Test2nd";
	warp "in_moc_16.gat",87,102;
	killmonster "in_moc_16.gat", "All";
	enablewaitingroomevent "AS_ChatRoom";
	end;
}

//==============================================================
in_moc_16.gat,68,158,0 script #AS_Abyss 139,0,0,{
	announce "Beholder: " +$@as_tester$+ "Sir, you have fallen into a pit." ,9;
	warp "in_moc_16.gat",19,161;
	stopnpctimer "AS_Test2nd";
	killmonster "in_moc_16.gat", "All";
	enablewaitingroomevent "AS_ChatRoom";
	end;
}

in_moc_16.gat,68,159,0 duplicate(#AS_Abyss) pit 139,0,0
in_moc_16.gat,69,158,0 duplicate(#AS_Abyss) pit 139,0,0
in_moc_16.gat,69,159,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,64,162,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,64,163,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,65,162,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,65,163,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,62,168,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,62,169,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,63,168,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,63,169,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,66,170,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,66,171,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,67,170,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,67,171,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,64,174,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,64,175,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,65,174,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,65,175,0 duplicate(#AS_Abyss) pit 139,0,0

in_moc_16.gat,72,174,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,72,175,0 duplicate(#AS_Abyss) pit 139,0,0
in_moc_16.gat,73,174,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,73,175,0 duplicate(#AS_Abyss) pit 139,0,0

in_moc_16.gat,72,167,0 duplicate(#AS_Abyss) Pit 139,0,1
in_moc_16.gat,73,167,0 duplicate(#AS_Abyss) Pit 139,0,1
in_moc_16.gat,72,169,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,73,169,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,78,168,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,78,169,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,79,168,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,79,169,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,81,172,0 duplicate(#AS_Abyss) Pit 139,1,0
in_moc_16.gat,81,173,0 duplicate(#AS_Abyss) pit 139,1,0
in_moc_16.gat,83,172,0 duplicate(#AS_Abyss) pit 139,0,0
in_moc_16.gat,83,173,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,88,174,0 duplicate(#AS_Abyss) pit 139,0,0
in_moc_16.gat,88,175,0 duplicate(#AS_Abyss) pit 139,0,0
in_moc_16.gat,89,174,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,89,175,0 duplicate(#AS_Abyss) pit 139,0,0

in_moc_16.gat,86,166,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,86,167,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,87,166,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,87,167,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,90,164,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,90,165,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,91,164,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,91,165,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,86,160,0 duplicate(#AS_Abyss) Pit 139,2,0
in_moc_16.gat,86,161,0 duplicate(#AS_Abyss) Pit 139,2,0
in_moc_16.gat,89,160,0 duplicate(#AS_Abyss) pit 139,0,0
in_moc_16.gat,89,161,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,86,154,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,86,155,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,87,154,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,87,155,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,84,150,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,84,151,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,85,150,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,85,151,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,90,150,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,90,151,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,91,150,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,91,151,0 duplicate(#AS_Abyss) Pit 139,0,0

in_moc_16.gat,86,146,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,86,147,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,87,146,0 duplicate(#AS_Abyss) Pit 139,0,0
in_moc_16.gat,87,147,0 duplicate(#AS_Abyss) Pit 139,0,0


//==========================================
// Tertiary exam (practical 2)
//------------------------------------------

in_moc_16.gat,89,98,2 script Dante 118,5,1,{
	end;
OnTouch:
	if(CHANGE_AS ! = 4) {
		mes "[Dante]";
		mes "I am looking at this test "Dante"." ;
		mes "What I see in this exam is your evasiveness." ;
		next;
		mes "[Dante]";
		mes "Moderate use of hidings is also allowed." ;
		next;
		mes "[Dante]";
		mes "The objective is to get to the "Barcardi" entrance on the other side." ;
		mes "You have to go through many monsters to get to the other side." ;
		mes "Don't knock them down." ;
		next;
		mes "[Dante]";
		mes "If you faint or run away on the way, you'll have to come back here." ;
		mes "Then let's begin. I wish you good luck." ;
		set CHANGE_AS,4;
		donpcevent "AS_Test3rd::OnStart";
		close;
	}
	mes "[Dante]";
	mes "Yeah... I think I've passed out." ;
	mes "Okay, I'll recover." ;
	percentheal 100,100;
	next;
	mes "[Dante]";
	mes "But is it enough to make you faint?" ;
	mes "You can try to change jobs again, but if you can't, tell me now." ;
	next;
	if(select("I'm trying again.", "Still doesn't seem possible...") ==1) {
		mes "[Dante]";
		mes "Well, good luck with that." ;
		mes "Barcardi should be nearby." ;
		close;
	}
	mes "[Dante]";
	mes "Well... I'll see you next time." ;
	next;
	mes "[Dante]";
	mes "Don't forget to record it when you get back to town." ;
	close2;
	stopnpctimer "AS_Test3rd";
	set CHANGE_AS,2;
	announce "Dante: " +$@as_tester$+ " has given up his new job. Enter the next person." ,9;
	warp "in_moc_16.gat",18,14;
	killmonster "in_moc_16.gat", "All";
	enablewaitingroomevent "AS_ChatRoom";
	end;
}

//==============================================================
in_moc_16.gat,0,0,0 script AS_Test3rd -1,{
OnStart:
	monster "in_moc_16.gat",81,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",82,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",83,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",84,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",85,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",86,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",87,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",88,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",89,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",90,77, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",75,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",77,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",79,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",81,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",83,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",85,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",90,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",92,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",94,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",96,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",98,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",100,56, "Mummy",1041,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",76,62, "Hydra",1068,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",76,65, "hydra",1068,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",79,62, "hydra",1068,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",79,65, "hydra",1068,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",96,62, "Hydra",1068,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",96,65, "hydra",1068,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",99,62, "Hydra",1068,1, "AS_Test3rd::OnKilled";
	monster "in_moc_16.gat",99,65, "hydra",1068,1, "AS_Test3rd::OnKilled";
	end;
OnKilled:
	announce "Dante: If you beat the monster",9;
	announce "Dante: Start over from the beginning." ,9;
	areawarp "in_moc_16.gat",64,46,111,105, "in_moc_16.gat",87,102;
	killmonster "in_moc_16.gat", "All";
	enablewaitingroomevent "AS_ChatRoom";
	end;
OnTimer240000:
	stopnpctimer;
	areawarp "in_moc_16.gat",60,136,93,177, "in_moc_16.gat",19,161;
	areawarp "in_moc_16.gat",64,46,111,105, "in_moc_16.gat",19,161;
	killmonster "in_moc_16.gat", "All";
	enablewaitingroomevent "AS_ChatRoom";
	end;
}

//==============================================================
in_moc_16.gat,87,48,1 script Barcardi 725,2,2,{
	end;
OnTouch:
	killmonster "in_moc_16.gat", "All";
	mes "[Barcardi]";
	mes "Okay, here it comes!" ;
	mes "Now it's time for the final exam." ;
	close2;
	stopnpctimer "AS_Test3rd";
	set @as_step,0;
	warp "in_moc_16.gat",181,183;
	enablewaitingroomevent "AS_ChatRoom";
	end;
}


//==========================================
// final exam
//------------------------------------------

in_moc_16.gat,182,169,0 script # gatekeeper 45,1,1,{
	if(@as_step < 2) {
		set @as_step,@as_step+1;
		warp "in_moc_16.gat",181,183;
		end;
	}
	announce "Gatekeeper: " +strcharinfo(0)+ "Lady has entered the Guildmaster's room",9;
	hideonnpc "Huey#AS";
	hideonnpc "Kai#AS";
	hideonnpc "The Anonymous One#AS";
	hideonnpc "Barcardi#AS";
	hideonnpc "Beholder#AS";
	hideonnpc "Dante#AS";
	hideonnpc "Gayle Maroubitz#AS";
	savepoint "in_moc_16.gat",167,110;
	warp "SavePoint",0,0;
	end;
}

//==============================================================
in_moc_16.gat,167,110,0 script Assassin's Guide to the Maze 139,3,1,{
	mes "[Guildmaster]";
	mes "Hmm... You've come a long way." ;
	mes "This is the 'Guildmaster's Room', the deepest part of the Assassin guild." ;
	next;
	mes "[Guildmaster]";
	mes "It is a labyrinth so that you can't find me." ;
	mes "And about the exam..." ;
	mes "I want you to come to me." ;
	mes "I built it this way because of occasional break-ins." ;
	next;
	mes "[Guildmaster]";
	mes "So I'll see you later..." ;
	close;
}

in_moc_16.gat,170,90,0 script Assassin Labyrinth Guide#AS 139,1,1,{
	mes "[Guildmaster]";
	mes "It's a convoluted path there..." ;
	mes "Continue on the other." ;
	close;
}

in_moc_16.gat,160,85,0 duplicate(Assassin's Maze Guide#AS) Assassin's Maze Guide 139,1,1

in_moc_16.gat,180,101,0 script Assassin's Guide to the Labyrinth 139,1,1,{
	mes "[Guildmaster]";
	mes "I don't think it's that way..." ;
	close;
}

in_moc_16.gat,186,107,0 script Assassin's Guide to the Maze 139,1,1,{
	mes "[Guildmaster]";
	mes "I don't think it's that way..." ;
	close;
}

in_moc_16.gat,149,95,0 script Assassin Labyrinth Guide 139,1,1,{
	mes "[Guildmaster]";
	mes "Hmm, I see you've got the general idea of how to get there." ;
	close;
}

in_moc_16.gat,149,95,0 script Assassin Labyrinth Guide 139,0,0,{
	mes "[Guildmaster]";
	mes "You're getting pretty close." ;
	mes "I can feel your presence." ;
	close;
}

in_moc_16.gat,175,89,0 script Assassin Labyrinth Guide 139,1,1,{
	mes "[Guildmaster]";
	mes "It leads to the aide's place." ;
	mes "What can I do for you aide?" ;
	close;
}

in_moc_16.gat,153,85,0 script Assassin's Guide to the Maze 139,1,1,{
	mes "[Guildmaster]";
	mes "It's a convoluted path there..." ;
	mes "Just go back a bit." ;
	mes "The path is blocked by pillars, so go around and continue." ;
	close;
}

//==============================================================
in_moc_16.gat,186,81,0 script Assistant Guildmaster 55,{
	mes "[Gayle Maroubitz]";
	mes "I am not involved in the career change exam." ;
	mes "Please ask the Guildmaster over there about changing jobs." ;
	close;
}

//==============================================================
in_moc_16.gat,149,80,4 script Guildmaster 106,1,1,{
	end;
OnTouch:
	mes "[Guildmaster]";
	mes "Good to see you. I'm sorry you had a hard time because of the complexity of the road." ;
	mes "The report came up just now, and I hear it's quite a thief to see." ;
	mes "I'm looking forward to seeing a well-trained guy like you in the future." ;
	next;
	mes "[Guildmaster]";
	mes "Now, I'm going to ask you a few questions and you can answer them the way you normally think, so make yourself comfortable." ;
	next;
	mes "[Guildmaster]";
	mes "First . . what is important to Assassin?" ;
	next;
	switch (select("stronger power", "pride (self-esteem)", "constant practice")) {
	case 1:
		mes "[Guildmaster]";
		mes "Speaking of more power... I can certainly say that Assassin is stronger than Thief." ;
		next;
		mes "[Guildmaster]";
		mes "But what do we need that strength for? Is it for revenge, for example..." ;
		mes "Or for something else?" ;
		next;
		mes "[Guildmaster]";
		mes "What would be the benefit of having Assassin's power?" ;
		next;
		switch (select("I can get revenge", "I can make more money", "I can go to more places")) {
			case 1:
				mes "[Guildmaster]";
				mes "Revenge..." ;
				mes "So... Most of us have something called a grudge." ;
				next;
				mes "[Guildmaster]";
				mes "But we must be faithful to the task assigned to us without being influenced by our emotions." ;
				next;
				mes "[Guildmaster]";
				mes "If you want to be an Assassin, you must turn off your emotions." ;
				break;
			case 2:
				mes "[Guildmaster]";
				mes "... Yes, you need money to survive... That's not what you should want in life as an Assassin." ;
				break;
			case 3:
				mes "[Guildmaster]";
				mes "Good idea. Learning and observing different places will make the mission more successful." ;
				next;
				mes "[Guildmaster]";
				mes "But please refrain from traveling in large numbers, no matter how many friends you have with you. For you must avoid being conspicuous..." ;
				break;
		}
		break;
	case 2:
		mes "[Guildmaster]";
		mes "Pride..." ;
		mes "Did our people say so?" ;
		next;
		mes "[Guildmaster]";
		mes "Hmm... On what grounds?" ;
		mes "I don't know what attracted you to Assassin..." ;
		next;
		mes "[Guildmaster]";
		mes "Most of these guys have been through some major hardships together at one point or another." ;
		mes "So I understand it well." ;
		mes "So why do you need pride?" ;
		next;
		switch (select("I need it to live alone", "I need it to make money", "Because it looks good")) {
			case 1:
				mes "[Guildmaster]";
				mes "So... We are lonely beings..." ;
				mes "Wherever we are, we are always alone." ;
				next;
				mes "[Guildmaster]";
				mes "But we also have companions. If we get too deep into it, it can be dangerous, but if we have a good partner, it will be easier to achieve our goals..." ;
				break;
			case 2:
				mes "[Guildmaster]";
				mes "... Yes, you need money to survive... That's not what you should want in life as an Assassin." ;
				break;
			case 3:
				mes "[Guildmaster]";
				mes "Either we are so concerned with appearances that we miss the essence of things..." ;
				mes "Such a weak spirit is not fit to be an Assassin." ;
				break;
		}
		break;
	case 3:
		mes "[Guildmaster]";
		mes "Ordeal..." ;
		mes "You already look like a great Thief, what's the reason for you to continue your training?" ;
		next;
		mes "[Guildmaster]";
		mes "An Assassin must be self-disciplined and sometimes moderate in his behavior, even though he is a Thief. Sometimes, the desire for power overtakes some young people and they lose control of themselves..." ;
		next;
		mes "[Guildmaster]";
		mes "What, then, is it that you are not satisfied with what you have now, and you want to train yourself?" ;
		next;
		switch (select("technique", "goal", "spirit")) {
			case 1:
				mes "[Guildmaster]";
				mes "Technology is something you can learn to a certain extent if you become an Assassin. It is not in itself of the highest value." ;
				mes "I don't know if you'll be satisfied if you become an Assassin." ;
				break;
			case 2:
				mes "[Guildmaster]";
				mes "Well... It's good to constantly set new goals... But..." ;
				mes "I'm full of being an Assassin right now, but that may change someday!" ;
				break;
			case 3:
				mes "[Guildmaster]";
				mes "I agree. It is important to always have a strong spirit. It's not easy to strengthen the mental side of the body while training the mental side along with the physical." ;
				next;
				mes "[Guildmaster]";
				mes "The profession of Assassin is not only about skill, but also about a constant mental attitude." ;
				mes "Only then can you fully demonstrate the skills you have acquired." ;
				break;
		}
		break;
	}
	} next;
	mes "[Guildmaster]";
	mes "You've thought this through." ;
	mes "Some people try to be Assassin without thinking..." ;
	next;
	mes "[Guildmaster]";
	mes "Those people cause problems and bring mud to our guild's face." ;
	next;
	mes "[Guildmaster]";
	mes "This is something you can say too, but once you become an Assassin, you can never go back to being a Thief." ;
	mes "As an Assassin, you will have duties and responsibilities for the rest of your life." ;
	next;
	mes "[Guildmaster]";
	mes "What is the first thing you will do when you become Assassin from now on?" ;
	next;
	switch (select("I will do battle immediately", "I will go to the people waiting for me", "I will find out about Assassin")) {
	case 1:
		mes "[Guildmaster]";
		mes "Combat? So?" ;
		next;
		switch (select("I want to grow up fast", "Test my skills as an Assassin", "Go to places that are hard to get to in Thief")) {
			case 1:
				mes "[Guildmaster]";
				mes "If you are in too much of a hurry to grow, you will loose your fundamentals, especially your mental discipline. Without a good foundation, you may be slow to react on the spur of the moment." ;
				mes: "Assassin is the one who should solidify the fundamentals, because a split-second decision can be fatal." ;
				break;
			case 2:
				mes "[Guildmaster]";
				mes "It is good to test yourself." ;
				mes "It's good to test your evolved abilities, but don't forget to be an Assassin." ;
				break;
			case 3:
				mes "[Guildmaster]";
				mes "Good for you. You go to a new place and you'll discover something new." ;
				mes "However, becoming an Assassin does not necessarily change a person's nature." ;
				next;
				mes "[Guildmaster]";
				mes "It is better not to take it too far at first, but to expand the scope of your activities little by little." ;
				break;
		}
		break;
	case 2:
		mes "[Guildmaster]";
		mes "Who is waiting for you?" ;
		next;
		switch (select("It's my friends", "It's the Guild Members", "It's my lover")) {
			case 1:
				mes "[Guildmaster]";
				mes "I see. They'll be glad to have you as one of their own." ;
				mes "Don't forget to think of your friends in your loneliness." ;
				break;
			case 2:
				mes "[Guildmaster]";
				mes "Friends in life and death... Good." ;
				mes "As an Assassin, you are to shadow and help your fellow man well." ;
				break;
			case 3:
				mes "[Guildmaster]";
				mes "For the sake of your loved ones?" ;
				mes ""+(Sex? "He": "She")+ ""You mean to shadow and always watch over..."" ;
				next;
				mes "[Guildmaster]";
				mes "Cherish it..." ;
				mes "But that naivety is fatal to a profession like ours." ;
				mes "It's your life. Don't have any regrets..." ;
				break;
		}
		break;
	case 3:
		mes "[Guildmaster]";
		mes "Good attitude." ;
		mes "What do you want to look into?" ;
		next;
		switch (select("where is a good place for Assassin", "about guild growth", "how to increase income in Assassin")) {
			case 1:
				mes "[Guildmaster]";
				mes "There are indeed easy and hard places in this world." ;
				mes "But an Assassin has to be flexible enough to perform his mission in any environment." ;
				break;
			case 2:
				mes "[Guildmaster]";
				mes "There are many of us out there." ;
				mes "There must be something to learn from them." ;
				next;
				mes "[Guildmaster]";
				mes "And I hope you will use the knowledge and experience you gain there to create a foundation and donate it to the development of the guild." ;
				mes "[Guildmaster]"; mes "And when you reach a certain level, you will have the opportunity to take care of those below you." ;
				break;
			case 3:
				mes "[Guildmaster]";
				mes "... Assassin is not there for the money..." ;
				mes "...Assassin is not there for money..."; mes "...Assassin should think a little more carefully about its responsibilities..." ;
				break;
		}
		break;
	}
	} next;
	mes "[Guildmaster]";
	mes "It was quite a conversation I had with you." ;
	mes "I remember the old days too..." ;
	next;
	mes "[Guildmaster]";
	mes "Hmm... Let's collect them then." ;
	next;
	announce "Guildmaster: " +strcharinfo(0)+ "Those who were involved in the Assassin job test for "Guildmaster: " +strcharinfo(0)+ "must gather with me",9;
	mes "[Guildmaster]";
	mes ""+strcharinfo(0)+ "Those who were involved in the Assassin's job examination must gather under me";
	next;
	mes "[Guildmaster]";
	mes "Come at once!" ;
	next;
	hideoffnpc "Huey#AS";
	hideoffnpc "Kai#AS";
	hideoffnpc "The Anonymous One#AS";
	hideoffnpc "Barcardi#AS";
	hideoffnpc "Beholder#AS";
	hideoffnpc "Dante#AS";
	hideoffnpc "Gayle Maroubitz#AS";
	mes "[The Anonymous One]";
	mes "You wanted to see me?" ;
	next;
	mes "[Guildmaster]";
	mes ""+strcharinfo(0)+ "I wanted to get the opinion of the person who was in charge of the job test for ......"" ;
	mes "What do you think?" ;
	next;
	mes "[The Anonymous One]";
	mes "That guy would be good. Kkkk..." ;
	next;
	mes "[Guildmaster]";
	mes "[The Anonymous One]" You're up for it." ;
	mes "Huey?" ;
	next;
	if(JobLevel >= 50) {
		mes "[Huey]";
		mes "That was the gutsiest Thief I've seen recently." ;
		next;
		mes "[Huey]";
		mes "I agree." ;
		mes "Then I'll leave you to it." ;
		mes "I must return to my seat..." ;
		mes "Oh, Master... Please give him something as a gift instead of me." ;
		next;
		mes "[Guildmaster]";
		mes "Mm. I promise." ;
	}
	else {
		mes "[Huey]";
		mes "Well, the basics are done." ;
		mes "I agree." ;
		mes "Well, I'll leave you to it." ;
		mes "I must return to my seat..." ;
		next;
		mes "[Guildmaster]";
		mes "Mm, do that." ;
	}
	next;
	mes "[Guildmaster]";
	mes "So, 'Beholder', how about you?" ;
	next;
	hideonnpc "Huey#AS";
	mes "[Beholder]";
	mes "It passed for the time being, so it's treated as a pass." ;
	next;
	mes "[Guildmaster]";
	mes "Mm, looks like everyone agrees." ;
	mes "I like it about this one too." ;
	next;
	mes "[Guildmaster]";
	mes "So... Assassin is subjected to the discipline of solitude for the rest of his life." ;
	mes "Be strong and live." ;
	next;
	mes "[Guildmaster]";
	mes "Hmm... It's a long story." ;
	if(JobLevel >= 50) {
		mes "Here are the following weapons." ;
		mes "Jul, Qatar, Maingauche, Gladius, and above are all weapons that I used to love." ;
		next;
		switch(select("jul", "Qatar", "Maingauche", "Gradius")) {
			case 0: getitem 1251,1; break;
			case 1: getitem 1253,1; break
			case 2: getitem 1208,1; break
			case 3: getitem 1220,1; break;
		}
		mes "[Guildmaster]";
		mes "There was a time when one of these was enough..." ;

	}
	} else {
		mes "Take this first." ;
		next;
		switch(rand(4)) {
			case 0: getitem 1207,1; break
			case 1: getitem 1219,1; break
			case 2: getitem 1250,1; break
			case 3: getitem 1252,1; break;
		}
	}
	set CHANGE_AS,5;
	next;
	savepoint "morocc.gat",100,101;
	getitem 1008,1;
	mes "[Guildmaster]";
	mes "Then return to the veteran Assassin Huey at the entrance as I will give you a mark of acceptance." ;
	mes "Huey will actually give you a new job." ;
	next;
	mes "[Guildmaster]";
	mes "Here " +strcharinfo(0)+ " ..." ;
	mes "I'm going to be an assassin..." ;
	mes "And though the road ahead may be a lonely and solitary one, do not forget your will..." ;
	next;
	mes "[Guildmaster]";
	mes "All right, everybody back!" ;
	mes "I'll take you back to the entrance too." ;
	hideonnpc "Kai#AS";
	hideonnpc "The Anonymous One#AS";
	hideonnpc "Barcardi#AS";
	hideonnpc "Beholder#AS";
	hideonnpc "Dante#AS";
	hideonnpc "Gayle Maroubitz#AS";
	close2;
	warp "in_moc_16.gat",17,19;
	end;
}

in_moc_16.gat,156,87,2 script Huey#AS 55,{}
in_moc_16.gat,156,85,2 script Huey#AS 730,{}
in_moc_16.gat,156,83,2 script The Anonymous One#AS 106,{}
in_moc_16.gat,156,81,2 script Barcardi#AS 725,{}
in_moc_16.gat,156,79,2 script Beholder#AS 118,{}
in_moc_16.gat,156,77,2 script Dante#AS 118,{}
in_moc_16.gat,156,75,2 script Gayle Maroubitz#AS 55,{}
