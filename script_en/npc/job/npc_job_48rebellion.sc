//====================================================================
//Ragnarok Online - Rebellion Jobchange Script by refis
// - CHANGE_RB -> 0-4
// - CHANGE_RB -> 0-4
//====================================================================

moc_fild12.gat,261,318,3 script Suspicious Man 998,{
	if(Job == Job_Rebellion) {
		mes "[Suspicious Man]";
		mes "You are ......!" ;
		mes "The other day's bounty hunter ...... of someone else!" ;
		next;
		mes "[Suspicious Man]";
		mes "No, I'm sorry I made a mistake the other day." ;
		mes "After that, some information came around." ;
		mes "They said they had already caught the real guy when I was working." ;
		next;
		mes "[Suspicious man]";
		mes "I guess that means it wouldn't have paid for my dinner anyway." ;
		next;
		mes "[Suspicious Man]";
		mes "And that's why ......." ;
		mes "You've become a libelion!" ;
		next;
		mes "[Suspicious Man]";
		mes "To have become a Rebellion means that you have passed a rigorous test and have the will of freedom and rebellion in your soul." ;
		next;
		mes "[Suspicious Man]";
		mes "The path of the gun is a tough one, where tomorrow's food is not enough, but let's work together!" ;
		close;
	}
	if(Job == Job_Gunslinger && BaseLevel >= 99 && JobLevel >= 70) {
		if(CHANGE_RB) {
			mes "[Suspicious Man]";
			mes "Oh, you're Spike the Bounty Hunter!" ;
			next;
			mes "[Suspicious Man]";
			mes "I thought I let you go last time, but here you are again!　This time you won't get away!" ;
			next;
			switch(select("Escaping again!", "Intercepting")) {
			case 1:
				mes "[Suspicious man]";
				mes "C'mon!" ;
				mes "Don't run away, my winnings!!!" ;
				break;
			case 2:
				mes "-you drew your gun and flicked the weapon out of the man's hand-";
				soundeffect "ferus_move.wav", 0, 0;
				next;
				mes "[Suspicious man]";
				mes "Wow, what a hit!" ;
				next;
			}
			mes "-I can't keep dealing with him." ;
			mes " Let's do something about this mistaken person quickly-";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "(Let's hurry to ^FF000000Einbroch's secret bar ^000000, which is mentioned in the arrangement)";
			next;
			mes "-Would you like to head to Einbroch's secret tavern? -";
			next;
			if(select("Yes", "No") == 2) {
				mes "-Not now -"; next; mes "-Not now -";
				close;
			}
			mes "-Headed to Einbroch-";
			close2;
			warp "einbroch.gat",48,97;
			end;
		}
		mes "[Suspicious Man]";
		mes "I finally found you: ......!" ;
		mes "Bounty hunter Spike!" ;
		mes "The bounty on that head is mine!" ;
		next;
		mes "-A man I've never met before held me at gunpoint! -";
		next;
		switch(select("ask what's going on", "angry")) {
		case 1:
			mes "[Suspicious man]";
			mes "Don't play dumb with me!" ;
			mes "That unmistakable smell of evil you have, just like the bounty hunter on this wanted list!" ;
			break;
		case 2:
			mes "[Suspicious man]";
			mes "You're not going to resist!" ;
			mes "But the arrangements have already spread to many places." ;
			mes "There is nowhere to run!" ;
			break;
		}
		next;
		mes "[Suspicious Man]";
		mes "Watch GHOST and let me get the credit for it!!!" ;
		next;
		switch(select("escape", "intercept")) {
		case 1:
			mes "[Suspicious man]";
			mes "Whoa!  Don't come this way!" ;
			mes " -You hit the suspicious man standing in your way and ran away-"; mes "-You hit the suspicious man standing in your way and ran away-";
			soundeffect "ghoul_die2.wav", 0, 0;
			next;
			mes "-Then the paper the man was holding flew away and blocked your view-"; soundeffect "ghoul_die2.wav", 0, 0; next; next; next
			next;
			menu "Whoa!" ,-;
			mes "-The arrangement that you ripped off has a description that looks like you, and it says ^FF000000Issued: Einbroch's Secret Tavern^000000-";
			break;
		case 2:
			mes "-You drew your gun and flicked the weapon out of the man's hand-";
			soundeffect "ferus_move.wav", 0, 0;
			next;
			mes "[Suspicious man]";
			mes "What the hell ......! -holding your arm, the man looks at you with a look of astonishment-";
			next;
			mes "[Suspicious Man]";
			mes "So you're indeed a bounty hunter. ...... Kuhk";
			next;
			switch(select("secure the arrangement", "not a bounty hunter")) {
			case 1:
				mes "[Suspicious man]";
				mes "Ah!  Hey!" ;
				mes "Give it back! -You took the handbill away from the man;
				break;
			case 2:
				mes "[Suspicious man]";
				mes "Ha!  Every bounty hunter I've ever met has been sober like that." ;
				mes "But!" ;
				next;
				mes "[Suspicious Man]";
				mes "This arrangement is a legitimate one issued at ^000000ffEinbroch's secret tavern ^000000!" ;
				mes "It can't be so flawed!" ;
				break;
			}
			next;
			mes "-The arrangement was written with a physiognomy similar to yours, and ^FF0000 issued: the secret tavern of Einbroch ^000000-";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "(Einbroch......)" ;
			break;
		}
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "(Let's go to ^FF000000Einbroch's secret bar ^000000, which is written in the arrangement)";
		next;
		setquest 12340;
		set CHANGE_RB,1;
		mes "-Would you like to go to the secret tavern in Einbroch? -";
		next;
		if(select("Yes", "No") == 2) {
			mes "-Not now -"; next; mes "-Not now -";
			close;
		}
		mes "-Headed to Einbroch-";
		close2;
		warp "einbroch.gat",48,97;
		end;
	}
	mes "-Suspicious man spread out several sheets of paper-";
	next;
	mes "[Suspicious man]";
	mes "huffing and puffing......" ;
	mes "I've got as many arrangements as I can carry." ;
	//mes "Catch a prize head";
	mes "I'm gonna catch the prize head and make some rough money." ;
	close;
}
einbroch.gat,54,97,3 script guard 10062,{
	if(CHANGE_RB == 1) {
		mes "-The ^FF0000 secret tavern ^000000 mentioned in the arrangement book seems to be this building-";
		next;
		mes "[guard]";
		mes "Hey, there Gunslinger."
		mes "How long are you going to stand there ......?" ;
		mes " You're a prize spike!" ;
		next;
		menu "No, sir.",-, "You've got the wrong guy.",-;
		mes "[guard]";
		mes "What?" ;
		mes " No, yes." ;
		mes "I heard you got caught for sure." ;
		mes "But it's also for GHOST, ......." ;
		next;
		menu "I am not a bounty hunter",-, "I am annoyed at being mistaken",-;
		mes "[guard]";
		mes "What?" ;
		mes " -Guard stared at your face from various directions-"; mes "[guard]"; mes "[guard]"; mes "[guard]"; mes "[guard]
		next;
		mes "[guard]";
		mes "Hmmm ......" ;
		mes "Sure, they look alike, but they're different." ;
		next;
		mes "[guard]";
		mes "So, you want to talk to me about the arrangements, is that what you're saying?" ;
		next;
		mes "[guard]";
		mes "Well, it doesn't sound like a problem I can judge, and I'm sure you'd have no problem going in here." ;
		next;
		mes "[guard]";
		mes "Take the arrangement to ^0000FF Krubel^000000 in the store." ;
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	else if(CHANGE_RB >= 2) {
		mes "[guard]";
		mes "Yeah?  That's the guy from last time." ;
		mes "What do you want at the bar?" ;
		next;
		if(select("I'd like to come in", "Just stopping by") == 2) {
			mes "[guard]";
			mes "If you have no use for it, go home." ;
			close;
		}
		mes "[guard]";
		mes "Okay. Don't cause any problems inside." ;
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	else if(Job == Job_Rebellion) {
		mes "[guard]";
		mes "Yo, comrade." ;
		mes "How are you doing?" ;
		next;
		if(select("I want to get into the bar", "I just dropped by") == 2) {
			mes "[guard]";
			mes "Well..." ;
			mes "Glad to see you're doing well." ;
			mes "Keep up the good work, and keep up the great work on the guns." ;
			close;
		}
		mes "[guard]";
		mes "Okay. Don't cause any problems inside." ;
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	else {
		// not examined
	}
}

job_gun.gat,56,26,0 warp liberion room #1 2,2,einbroch.gat,49,97
job_gun.gat,18,10,0 warp liberion room#2 2,2,job_gun.gat,81,29
job_gun.gat,165,22,0 warp liberion room#3 2,2,job_gun.gat,197,44
job_gun.gat,197,49,0 warp Rebellion Room #4 2,2,job_gun.gat,157,21

job_gun.gat,68,33,3 script calm rebellion 10063,{
	if(Job == Job_Rebellion) {
		if(checkquest(121920)&0x8) {
			mes "[Calm Rebellion]";
			mes "Hey there, comrade." ;
			mes "Always be careful with your guns." ;
			mes "Because that gun is what we stand for." ;
			close;
		}
		setquest 121920;
		compquest 121920;
		mes "[Calm Rebellion]";
		mes "Hey, new guy." ;
		mes "Always be careful with your guns, man." ;
		mes "That gun is what we stand for." ;
		close;
	}
	mes "[Calm Rebellion]";
	mes "Do you know how to handle a gun?" ;
	close;
}

job_gun.gat,78,33,6 script Suspicious gunman 731,{
	if(Job == Job_Rebellion) {
		if(checkquest(121915)&0x8) {
			mes "[Suspicious Gunman]";
			mes "Yo, comrade." ;
			mes "Are you a gunman who has mastered the way of the gun in defense of freedom?" ;
			mes "Only with guns, haha!" ;
			close;
		}
		setquest 121915;
		compquest 121915;
		mes "[Suspicious gunman]";
		mes "Yo, comrade." ;
		mes "As a senior, all I can say to you, a junior, is this." ;
		next;
		mes "[Suspicious gunman]";
		mes "That gun in your hand is a symbol of your freedom." ;
		mes "To protect that freedom, Rebellion is the way to go." ;
		mes "Only with guns, haha!" ;
		close;
	}
	mes "[Suspicious Gunman]";
	mes "......" ;
	next;
	mes "[Suspicious Gunman]";
	mes "What?" ;
	mes "I don't do any blacksmithing." ;
	mes "I'm a gunman." ;
	mes "I'm a gunman who lives free." ;
	close;
}

Job_gun.gat,74,24,6 script drunk man 887,{
	if(Job == Job_Rebellion) {
		if(checkquest(121905)&0x8) {
			mes "[Drunken man]";
			mes "Goooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo ......" ;
			mes " -Man snoring loudly in his sleep-"; mes "[man snoring loudly in his sleep]"; mes "[man snoring loudly in his sleep]
			close;
		}
		setquest 121905;
		compquest 121905;
		mes "[Drunken man]";
		mes "This is a secret tavern where libations meet and exchange information." ;
		mes "If you're new, go say hello to Krubel." ;
		next;
		mes "[Drunk man]";
		mes "My job is to stock up on booze, you know." ;
		close;
	}
	mes "[drunk man]";
	mes "I'm the manager of this bar!" ;
	mes " ...... Hm?" ;
	next;
	mes "[Drunk guy]";
	mes "Is this my store?" ;
	mes "Am I the manager in the first place ......?" ;
	mes " -The man is terribly drunk-";
	close;
}

Job_gun.gat,64,33,6 script Anxious man 748,{
	if(Job == Job_Rebellion) {
		if(checkquest(121920)&0x8) {
			mes "[Anxious Man]";
			mes "I heard their symbol is freedom, but then I should be free too." ;
			next;
			mes "[Calm Rebellion]";
			mes "What are you talking about, man?" ;
			mes "You're just a directionless guy who keeps going into town, getting lost, and ending up here." ;
			next;
			mes "[Anxious Man]";
			mes "...... Ugh, it's bad that this place is so convoluted." ;
			close;
		}
		mes "[uneasy man]";
		mes "Are you part of this weird place?" ;
		mes "How can I get out?" ;
		close;
	}
	mes "[Anxious Man]";
	mes "It looks like we've entered a strange place." ;
	mes "Isn't this a bar?" ;
	mes "The atmosphere is weird." ;
	close;
}

job_gun.gat,86,29,3 script crubel 10062,{
	if(Job == Job_Rebellion) {
		if(checkquest(121910)&0x8) {
			if(checkquest(121925)&0x8 == 0) {
				setquest 121925;
				compquest 121925;
			}
			mes "[crubel]";
			
			next;
			mes "[Krubel]";
			mes "Yo, comrade." ;
			mes "How are you doing today, Rebellion?" ;
			mes "This is the bar where the Rebellions gather." ;
			mes "Come by once in a while." ;
			close;
		}
		setquest 121910;
		compquest 121910;
		mes "[Crubel]";
		mes "Congratulations." ;
		mes "Now you're one riveting rivellion." ;
		next;
		mes "[Crubel]";
		mes "I took care of the arrangement properly, so you won't be hounded anymore." ;
		mes "Don't worry." ;
		next;
		mes "[Krubel]";
		mes "So, of course, you've heard about Lewini and Sidren, right?" ;
		next;
		mes "[Krubel]";
		mes "Guns are more important to Liberion than they were to Gunslinger." ;
		mes "After all, you put your aspirations into that gun, and you keep proving them." ;
		next;
		mes "[Krubel]";
		mes "Our aspirations are one." ;
		mes "Freedom and rebellion." ;
		mes "We will use our guns against the evil that infests the world." ;
		mes "We embody that freedom." ;
		next;
		mes "[Crubel]";
		mes "It's harder to keep going than anything else, but above all, it's cool!" ;
		mes "That's what you've become!" ;
		next;
		mes "[Crubel]";
		mes "Be diligent, newbie!" ;
		close;
	}
	if(CHANGE_RB == 1) {
		mes "[Crubel]";
		mes "Welcome." ;
		mes "What business does Gunslinger have in this secret tavern?" ;
		next;
		if(select("talk about arrangements", "ask for an order") == 2) {
			mes "[Crubel]";
			mes "What would you like?" ;
			mes "Food for drinks ......" ;
			mes "[handbill]" ;
			emotion 0,"";
			next;
		}
		mes "-You confronted Krubel with an arrangement-";
		next;
		mes "[Krubel]";
		mes "...... Yup." ;
		mes "No, wait. Pukuku ......." ;
		mes " -Krubel's shoulders are shaking violently-";
		next;
		switch(select("Angry!" , "hand on the gun"))) {
		case 1:
			mes "[Crubel]";
			mes "Ha ha ha!" ;
			mes "Sorry, sorry, hold on a second." ;
			break;
		case 2:
			mes "[Crubel]";
			mes "Ah kola!" ;
			mes "We don't want a brawl in the store." ;
			mes "Get your hands off me." ;
			next;
			break;
		}
		mes "-Satisfied with a quick laugh, Krubel wiped away her tears and turned to you-";
		next;
		mes "[Crubel]";
		mes "No, it's quite a highlight to even get an arrangement from a bounty hunter." ;
		next;
		menu "What do you mean?" ,-;
		mes "[Crubel]";
		mes ""+strcharinfo(0)+ ", I've been told how good a Gunslinger you are." ;
		mes ""You're not interested in ^FF000000 Rebellion^000000?"" ;
		next;
		switch(select("Rebellion?" I'm not interested.", "That's not the point!")) {
		case 1:
			break;
		case 2:
			mes "[Crubel]";
			mes "Totally navel-bending." ;
			mes "You're quite a cute guy." ;
			next;
			break;
		case 3:
			mes "[Crubel]";
			mes "I know, I know." ;
			mes "You're impatient, you know." ;
			mes "That's also relevant, so listen to me first." ;
			next;
			break;
		}
		mes "[Crubel]";
		mes "Rebellion is the higher position of Gunslinger, the liberator of free souls!" ;
		next;
		mes "[Krubel]";
		mes "The evil that infests the world is often also powerful." ;
		mes "It is the liberion that rebels against such evil at the point of its muzzle." ;
		mes "Isn't that cool?" ;
		next;
		mes "[Crubel]";
		mes "...... So, here's one seedy thing." ;
		mes "This arrangement mistake is actually on purpose." ;
		next;
		mes "[Krubel]";
		mes "I'm scouting you, a master Gunslinger, and at the same time, I had to see what your heart was in the right place." ;
		next;
		mes "[Krubel]";
		mes "You can't rebel against the evils of the world with aspiration alone." ;
		mes "But the first thing is not to leave unreason unchecked, but one's heart and soul that decides to rebel!" ;
		next;
		mes "[Crubel]";
		mes "That spirit of yours to get in directly ......." ;
		mes "[Krubel]"; mes "[Krubel]"; mes "[Krubel]" ;
		next;
		mes "[Crubel]";
		mes "I'd like to have you as a comrade!" ;
		mes "I want you to follow the Rebellion path!" ;
		mes "From the bottom of my heart, man. From the bottom of my heart!" ;
		next;
		mes "[Crubel]";
		mes "I'll say it again." ;
		mes "Are you interested in becoming a part of our Rebellion?" ;
		while(1) {
			next;
			switch(select("will be", "won't be", "you're fighting with us")) {
			case 1:
				break;
			case 2:
				mes "[Crubel]";
				mes "No, no, no, don't say that." ;
				mes "After Gunslinger, why don't we master Rebellion?" ;
				next;
				mes "[Crubel]";
				mes "I'll say it again." ;
				mes "Are you interested in becoming a part of our Rebellion?" ;
				continue;
			case 3:
				mes "[Crubel]";
				mes "...... That's nice." ;
				mes " That one, right?　I can't believe you're going to rebel against me for luring you out with an arrangement." ;
				next;
				mes "[Crubel]";
				mes "You've already proven yourself to be a prime example of a rebellion." ;
				next;
				mes "[Krubel]";
				mes "...... So that's why." ;
				mes "I'll say it again." ;
				mes "Are you interested in being a part of us Rebellion?" ;
				continue;
			}
			break;
		}
		mes "[Crubel]";
		mes "Good, good, good." ;
		mes "Well said!" ;
		mes "Well then, before I change my mind, let's go with the job change exam, shall we?" ;
		next;
		mes "[Crubel]";
		mes "Hmm?" ;
		mes "Why did you ask me about the career change exam?" ;
		next;
		mes "[Crubel]";
		mes "Well, you're a scouted talent." ;
		mes "You can learn the aspirations and skills of a liberion at the same time in the career change exam." ;
		mes "Please take it. I'm counting on you." ;
		next;
		mes "[Krubel]";
		mes "The first examiner is a guy named Lewini." ;
		mes "You'll find out soon enough." ;
		next;
		mes "[Krubel]";
		mes "Well, go for it." ;
		mes "Next time I see you, you're going to be the Rebellion!" ;
		chgquest 12340,12341;
		set CHANGE_RB,2;
		close2;
		warp "job_gun.gat",19,15;
		end;
	}
	else if(CHANGE_RB == 2) {
		mes "[crubel]";
		mes "Looks like we're still in the middle of the test." ;
		mes "Do you want to go to Luwini's?" ;
		next;
		if(select("going", "not going") == 2) {
			mes "[Krubel]";
			mes "Okay, so you want to take a break and have a drink?" ;
			mes "hahahaha!" ;
			close;
		}
		mes "[Crubel]";
		mes "Okay, I'll let you see him now." ;
		mes "This way." ;
		close2;
		warp "job_gun.gat",19,15;
		end;
	}
	else if(CHANGE_RB == 3) {
		// unexamined
		mes "[crubel]";
		mes "Looks like we're still in the middle of the exam." ;
		mes "Shall we go to Sidren's?" ;
		next;
		if(select("going", "not going") == 2) {
			mes "[Krubel]";
			mes "Okay, so you want to take a break and have a drink?" ;
			mes "hahahaha!" ;
			close;
		}
		mes "[Crubel]";
		mes "Okay, I'll let you see him now." ;
		mes "This way." ;
		close2;
		warp "job_gun.gat",120,133;
		end;
	}
	else if(CHANGE_RB == 4) {
		// unexamined
		mes "[Crubel]";
		mes "Looks like the exam is over." ;
		mes "Shall we go to Sidren's?" ;
		next;
		if(select("going", "not going") == 2) {
			mes "[Krubel]";
			mes "Okay, so you want to take a break and have a drink?" ;
			mes "hahahaha!" ;
			close;
		}
		mes "[Crubel]";
		mes "Okay, I'll let you see him now." ;
		mes "Next time I see you, you're going to be the Rebellion!" ;
		close2;
		warp "job_gun.gat",210,132;
		end;
	}
}
job_gun.gat,19,24,3 script Luwini#1 10063,{
	if(CHANGE_RB == 2) {
		mes "[Lewini]";
		mes "Hi. Are you the aspiring Rebellion that Krubel was talking about?" ;
		mes " -a small figure with sharp eyes looked up at you-";
		next;
		mes "[Lewini]";
		mes "I'm sure Krubel's attitude must have been very irritating to you." ;
		mes "...... Well, that guy, that one." ;
		mes "He's just not delirious and friendly." ;
		mes "Don't even think about it." ;
		next;
		mes "[Lewini]";
		mes "...... Gohon." ;
		mes "Okay, so sign here before the exam." ;
		next;
		mes "[Luwini]";
		mes "We'll Attention too, but we'll be dealing with machines, fire, and steel." ;
		mes "Just in case." ;
		next;
		mes "- On the paper offered by Luwini, the signer swears that he or she will never be held responsible if he or she is injured or loses his or her life during the examination: ......." ;
		mes " and that he would not be held responsible for any injuries or loss of life during the course of the exam-";
		next;
		if(select("sign", "do not sign") == 2) {
			mes "[Luwini]";
			mes "Roger that." ;
			mes "If you don't like it, I don't blame you." ;
			mes "You can go home." ;
			close2;
			warp "job_gun.gat",62,27;
			end;
		}
		mes "[Luwini]";
		mes "Have you finished writing?" ;
		mes "Then follow me." ;
		close2;
		warp "job_gun.gat",117,41;
		end;
	}
	mes "[Luwini]";
	mes "What?  You lost your way or something?" ;
	mes "Check the situation and come to the testing center." ;
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,117,46,3 script Luwini#2 10063,{
	if(checkquest(12341))
		chgquest 12341,12342;
	if(checkquest(12342)) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) == 2431) {
			mes "^0000ff-already in transformation." ;
			mes " When you have completed all the test tasks, go to the assembly room and report to Luwini-^000000";
			close;
		}
		if(countitem(6746)) {
			delitem 6746,countitem(6746);
			mes "[Lewini]";
			mes "Excess iron fabrications from the test will be collected." ;
			next;
		}
		if(countitem(6747)) {
			delitem 6747,countitem(6747);
			mes "[Luwini]";
			mes "You have a standard iron fabrication." ;
			mes "The excess iron fabricated material from the test will be collected." ;
			next;
		}
		if(countitem(13118)) {
			delitem 13118,1;
			mes "[Lewini]";
			mes "The gun is complete, but we've already run out of time and disqualified it." ;
			mes "Remaining GOST, but we're going to retrieve that gun." ;
			next;
		}
		mes "[Luwini]";
		mes "I'm only going to speak to you once, so listen carefully." ;
		next;
		menu "Yes",-;
		mes "[Lewini]";
		mes "This place deals in castings." ;
		mes "Everywhere iron fabrications are produced." ;
		next;
		mes "[Luwini]";
		mes "The most fundamental thing about Rebellion is its broad knowledge of weapons." ;
		mes "In this test, you will select the necessary materials and assemble the firearm directly with your own hands." ;
		next;
		mes "[Lewini]";
		mes "All you have to do is to select ^FF0000002 pieces^0000000000 of iron fabrications that meet the standard, which can be taken out by operating the ^0000FF blast furnace control machine^000000 located near the south doorway." ;
		next;
		mes "[Luwini]";
		mes "Once you have secured two ironwork, assemble the firearms in the assembly room next door." ;
		next;
		mes "[Lewini]";
		mes "The time for assembling the firearms is ^FF0000003 minutes^000000."
		mes "You will be required to have skill, knowledge, and speed." ;
		next;
		mes "[Lewini]";
		mes "The completed firearms will be received in the next room." ;
		mes "I'm going to ask you to change your appearance to make the time limit easier to understand." ;
		next;
		mes "[Luwini]";
		mes "By the way, the post-transformation appearance is my hobby." ;
		mes "I've seen you around town once, and you were my ideal type." ;
		mes "That would motivate you, wouldn't it?" ;
		next;
		mes "[Lewini]";
		mes "If the disguise is removed after ^0000ff3 minutes, the exam fails. It's a retest ^000000." ;
		mes "Good luck and good luck." ;
		viewpoint 1, 165, 18, 1, 0xFFFFFF00;
		sc_start SC_MONSTER_TRANSFORM,180000,2431;
		close;
	}
	mes "[Luwini]";
	mes "What?  Are you lost?" ;
	mes "Check the situation and come to the testing center." ;
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,198,39,3 script Luwini#3 10063,{
	if(checkquest(12342)) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) ! = 2431) {
			mes "[Luwini]";
			mes "You are out of time. Disqualified." ;
			mes "All excess material will be collected." ;
			delitem 6746,countitem(6746);
			delitem 6747,countitem(6747);
			next;
			if(countitem(13118)) {
				// not yet investigated
				delitem 13118,1;
				mes "[Luwini]";
				mes "The gun is complete, but it's already out of time and disqualified." ;
				mes "Remaining GOST, but we're going to retrieve that gun." ;
				next;
			}
			mes "[Luwini]";
			mes "Come on, let's do it again." ;
			mes "Be encouraged." ;
			close2;
			warp "job_gun.gat",117,41;
			end;
		}
		if(countitem(13118) == 0) {
			mes "[Luwini]";
			mes "Are you done?" ;
			mes "...... I don't seem to see a finished gun for that?" ;
			close;
		}
		delitem 13118,1;
		mes "[Lewini]";
		mes "Okay, it looks like it was made in a hurry, so it's not in perfect condition, but it passes anyway." ;
		mes "All excess materials will be collected." ;
		delitem 6746,countitem(6746);
		delitem 6747,countitem(6747);
		chgquest 12342,121930;
		set CHANGE_RB,3;
		next;
		mes "[Luwini]";
		mes "Then let me take you to the next course." ;
		mes "Sidren will be in charge of your education next." ;
		close2;
		warp "job_gun.gat",120,133;
		end;
	}
	mes "[Luwini]";
	mes "What?  You lost your way or something?" ;
	mes "Check the situation and come to the testing center." ;
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,165,18,1 script blast furnace controller#1 844,{
	if(checkquest(12342)) {
		mes "-Extract finished product from blast furnace? -";
		next;
		if(select("extract", "stop") == 2) {
			mes "-Continue the operation and convert to standby mode-"; next; mes "-Continue the operation and convert to standby mode-";
			close;
		}
		donpcevent "Blast furnace controller #2::OnStart";
		hideonnpc "Blast furnace controller #1";
		mes "-Smelting furnace control machine ZX-3100::Start working-"; } donpcevent "-Smelting furnace control machine ZX-3100::OnStart";
		close;
	}
	mes "-No one without permission can operate-"; mes "-No one without permission can operate-"; mes "-No one without permission can operate-"; }
	close;
}

job_gun.gat,165,18,1 script blast furnace controller#2 844,{
	if(checkquest(12342)) {
		mes "-The extraction of the finished ironwork is in progress." ;
		mes " No arbitrary work can be done until completed-";
		close;
	}
	mes "-No one without permission can operate-"; mes "-No one without permission can operate-";
	close;
OnStart:
	hideoffnpc "Blast furnace controller #2";
	sleep 3000;
	announce "Blast furnace controller : Start extracting iron workpiece from the blast furnace. Please stand by at the production line." , 0x9, 0x00ff44, 0x190, 12, 0, 0;
	sleep 500;
	for(set '@i,0; '@i<30; set '@i,'@i+1) {
		set '@r,rand(1,100);
		if('@r < 33)
			donpcevent "Heating Furnace #3::OnStart";
		else if('@r < 66)
			donpcevent "Heating Furnace #4::OnStart";
		else
			donpcevent "Heating Furnace #5::OnStart";
		sleep 200;
		set '@x,rand(127,143);
		set '@y,rand(26,29);
		dropitem "job_gun.gat",'@x,'@y,6746,1,0;
		if(rand(100) < 50) {
			set '@x,rand(127,143);
			set '@y,rand(26,29);
			dropitem "job_gun.gat",'@x,'@y,6747,1,0;
		}
		sleep 500;
	}
	announce "Blast furnace controller : extraction operation is completed." , 0x9, 0x00ff44, 0x190, 12, 0, 0;
	sleep 100;
	hideonnpc "Melting furnace controller #2";
	hideoffnpc "blast furnace controller #1";
	end;
OnInit:
	hideonnpc;
	end;
}

job_gun.gat,130,31,1 script heating furnace#3 844,{
	end;
OnStart:
	misceffect 96;
	sleep 500;
	misceffect 97;
	end;
}

job_gun.gat,136,31,1 script heating furnace#4 844,{
	end;
OnStart:
	misceffect 96;
	sleep 500;
	misceffect 97;
	end;
}

job_gun.gat,141,31,1 script heating furnace#5 844,{
	end;
OnStart:
	misceffect 96;
	sleep 500;
	misceffect 97;
	end;
}

job_gun.gat,214,36,1 script all automatic anvil #1 844,{
	if(checkquest(12342)) {
		if(countitem(13118)) {
			mes "-Traces of firearms refined through unauthorized channels were found." ;
			mes " Please report to the administrator Luwini -";
			close;
		}
		if(countitem(6747) < 2) {
			mes "-People without permission cannot operate-";
			next;
			mes "-Use the blast furnace controller to extract the finished product-";
			viewpoint 1, 165, 18, 1, 0xFFFFFF00;
			close;
		}
		mes "-Use a fully automatic anvil to produce firearms using steel workpieces that meet your standards? -";
		next;
		if(select("start", "stop") == 2) {
			mes "-Continue control of the fully automatic anvil-"; mes "-Continue control of the fully automatic anvil-";
			close;
		}
		misceffect 101;
		mes "[" +strcharinfo(0)+ "]";
		mes "(Fully automatic anvil was used and a normal weapon was manufactured." ;
		mes " (Let's report before the transformation effect disappears)";
		delitem 6747,2;
		getitem 13118,1;
		close;
	}
	mes "-People without permission cannot operate-"; delitem 6747,2; getitem 13118,1; close; }
	close;
}

job_gun.gat,95,148,10,10 monster Non-fire target 3170,3,180000,0,0,0
job_gun.gat,95,148,10,10 monster shooting target 3169,5,180000,0,0
job_gun.gat,95,110,10,15 monster Non-fire target 3170,3,180000,0,0
job_gun.gat,95,110,10,15 monster Target 3169,17,180000,0,0,0
job_gun.gat,140,100,15,10 monster Non-fire target 3170,13,180000,0,0
job_gun.gat,140,100,15,10 monster Target 3169,7,180000,0,0
job_gun.gat,140,150,15,10 monster Non-shooting target 3170,4,180000,0,0,0
job_gun.gat,140,150,15,15,10 monster Target 3169,4,180000,0,0
job_gun.gat,115,160,10,10 monster Non-shooting target 3170,8,180000,0,0,0
job_gun.gat,115,160,10,10 monster Target 3169,10,180000,0,0

job_gun.gat,120,138,3 script Sydren#1 10062,{
	if(CHANGE_RB == 3) {
		if(checkquest(12343)) {
			if(checkquest(12343)&4 && checkquest(12344)&4 == 0 && sc_onparam(SC_MONSTER_TRANSFORM,1) == 2431) {
				mes "[Sidren]";
				mes "Hmmm, that's great!" ;
				mes "I didn't expect it to be cleared up this easily." ;
				next;
				mes "[Sidren]";
				mes "This is the end of the final exam." ;
				mes "You wait outside." ;
				mes "Collect the other instructor's evaluations and I will give you the results of the exam." ;
				delquest 12343;
				delquest 12344;
				setquest 12345;
				set CHANGE_RB,4;
				close2;
				warp "job_gun.gat",210,132;
				end;
			}
			mes "[Sidren]";
			mes "Accuracy, speed, nothing to praise." ;
			mes "It's a complete no-no." ;
			mes "Have you really lived with a gun in your hand?" ;
			next;
			mes "[Sidren]";
			mes "I will begin the retest immediately." ;
			mes "Next time, make sure you move." ;
			delquest 12343;
			delquest 12344;
			setquest 12343;
			setquest 12344;
			sc_start SC_MONSTER_TRANSFORM,180000,2431;
			close2;
			warp "job_gun.gat",102,146;
			end;
		}
		mes "[sidren]";
		mes "Hey!  Don't look away." ;
		mes "This is a shooting range with live ammunition." ;
		mes "If you're not careful, you could get hurt." ;
		next;
		mes "[Sidren]";
		mes "Well. I will now begin to explain the final exam." ;
		mes "Now you are going to run within ^FF0000005 shooting ranges^000000." ;
		next;
		mes "[Sidren]";
		mes "This is a test to measure your judgment in accurately identifying targets in a crowd and your quickness to do so." ;
		mes "The goal is not to knock down a lot of them!" ;
		next;
		mes "[Sidren]";
		mes "You are to shoot only at targets marked ^000000ff shooting targets^000000 among those who look similar in the shooting range." ;
		mes "If you shoot an unrelated guy by mistake, you lose a point." ;
		next;
		mes "[Sidren]";
		mes "Well, it's better to have direct experience with the final exam than verbal explanations." ;
		mes "The phantom named ^000000ff shooting target ^000000 is limited in number, so shoot accurately." ;
		next;
		mes "[Sidren]";
		mes "^0000ffTime limit is 3 minutes." ;
		mes "If you break that disguise, you will be disqualified as time is up. ^000000In that case, come back to me meekly." ;
		next;
		mes "[Sidren]";
		mes "Hmm, are you wondering what the transformation is?" ;
		mes "Now you know, don't you?" ;
		mes " ...... It's Ruwini's hobby." ;
		next;
		mes "[Sidren]";
		mes "Let's get back to the story." ;
		mes "Failure to shoot 10 ^0000ff shooting targets or shooting 3 inappropriate targets will disqualify you. ^000000";
		next;
		mes "[Sidren]";
		mes "That's all the explanation." ;
		mes "Then let's begin immediately." ;
		setquest 12343;
		setquest 12344;
		delquest 121930;
		sc_start SC_MONSTER_TRANSFORM,180000,2431;
		close2;
		warp "job_gun.gat",102,146;
		end;
	}
	if(CHANGE_RB == 4) {
		mes "[Sidren]";
		mes "Why are you still here?" ;
		mes "Get out." ;
		mes "I'll be right there." ;
		close2;
		warp "job_gun.gat",210,132;
		end;
	}
	mes "[sidren]";
	mes "What?  You lost your way or something?" ;
	mes "Check the situation and come to the testing center." ;
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,88,144,0 warp firing range #1 2,2,job_gun.gat,93,123
job_gun.gat,105,97,0 warp Range #2 2,2,job_gun.gat,125,98
job_gun.gat,156,115,0 warp Range #3 2,2,job_gun.gat,157,137
job_gun.gat,152,154,0 warp Range #4 2,2,job_gun.gat,135,154
job_gun.gat,130,146,0 warp Range #5 2,2,job_gun.gat,120,130

job_gun.gat,220,132,3 script sidren#2 10062,{
	if(Job == Job_Rebellion) {
		mes "[Sydren]";
		mes "Hi. How are you doing?" ;
		mes "Pulling the trigger on rebellion against evil to embody freedom can be tough, but rewarding." ;
		close;
	}
	if(CHANGE_RB ! = 4) {
		mes "[Sidren]";
		mes "What?  Are you lost?" ;
		mes "Check the situation and come to the testing center." ;
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	if(Job == Job_Gunslinger) {
		mes "[Sidren]";
		mes "Based on your performance thus far, Krubel, Lewini, and I, Sidren, have determined your evaluation for your new job at Rebellion." ;
		next;
		mes "[Sidren]";
		mes "The results are available at ......." ;
		next;
		mes "[Sidren]";
		mes "No shortage of results and impressions from this time." ;
		next;
		mes "[Sidren]";
		mes "Yes." ;
		mes "We have decided to accept you as a member of our Rebellion." ;
		mes "Congratulations!" ;
		next;
		if(SkillPoint) {
			mes "[Sidren]";
			mes "You, ^ff000000 SkillPoints are still left. ^000000 Totally, you should check that much yourself." ;
			close;
		}
		if(Weight) {
			mes "[Sidren]";
			mes "You've got all kinds of stuff." ;
			mes "It's in the way, so get ^ff000000 Calrex^000000 to take care of it." ;
			mes "He's right around the corner, you know what I mean?" ;
			close;
		}
		if(sc_ison(SC_ALL_RIDING)) {
			// unexamined
			mes "[Sidren]";
			mes "Get down from the riding creature." ;
			mes "I know how you feel, but it's not appropriate for the occasion, is it?" ;
			close;
		}
		resetstatus;
		resetskill;
		setoption 0;
		jobchange Job_Rebellion;
		set CHANGE_RB,0;
		chgquest 12345,201860;
		getitem 13119,1;
		mes "-You have changed your job to ^FF000000 Rebelion, the symbol of rebellion^000000! -";
		next;
		mes "[Sidren]";
		mes "Oh!" ;
		mes "That's pretty neat." ;
		mes "It looks good on you. Junior!" ;
		next;
		mes "[Sidren]";
		mes "The gun I just gave you was prepared for you by Instructor Lewini." ;
		mes "I've been polishing it with a lot of care." ;
		mes "Take good care of it." ;
		next;
		mes "[Sidren]";
		mes "I'll see you then." ;
		close2;
		warp "job_gun.gat",81,29;
		end;
	}
	mes "[sidren]";
	mes "Why are you here?" ;
	mes "Get out." ;
	close2;
	warp "job_gun.gat",210,132;
	end;
}

job_gun.gat,220,138,4 shop props vending machine 564,13200:1

job_gun.gat,216,138,4 script calrex 47,{
	mes "[Calrex]";
	mes "We will take care of your unwanted items before you change jobs." ;
	next;
	if(select("open warehouse", "quit") == 2) {
		mes "[Calrex]";
		mes "Thank you for your service." ;
		mes "Now, let's move on to Rebellion." ;
		close;
	}
	mes "[Calrex]";
	mes "Open the warehouse." ;
	close2;
	openstorage;
	end;
}
