//====================================================================
//Ragnarok Online Wizard jobchange script
// - CHANGE_WZ -> 0-12
// - CHANGE_WZ -> 0-12
// $@wz_tester$ -> character name of the actual skill challenger
//====================================================================

//==========================================
// Application for exam, primary exam (collection), job change
//------------------------------------------

gef_tower.gat,111,37,4 script Guild Member 70,{
	if(Upper == UPPER_HIGH) {
		mes "[Catherine]";
		mes "Yeah?" ;
		mes "What brings you all the way out here?" ;
		next;
		mes "[Catherine]";
		mes "You have some unusual presence." ;
		mes "Keep up the good work." ;
		close;
	}
	if(Job == Job_Wizard) {
		mes "[Catherine]";
		mes "You, the Wizard, should no longer have any use for us." ;
		next;
		mes "[Catherine]";
		if(Sex == 0) { //not investigated
			mes "If you get a boyfriend or something, bring him along. Hmph";
		}
		else
			mes "I'd be happy to ask you out on a date." ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[Magician Guild Official]";
		mes "Oh, what are you doing up so high?" ;
		mes "If you don't have anything special to do, please come down." ;
		mes "This place is for Wizards." ;
		next;
		mes "[Magician Guild Official]";
		mes "Well, be careful down there." ;
		close;
	}
	switch(CHANGE_WZ) {
	case 0:
		mes "[Magician Guild Official]";
		mes "Oh my, I can't believe you came up this high. What brings you up here?" ;
		next;
		if(select("I'm here to change jobs to Wizard","... It's nothing.")==2) {
			mes "[Magician Guild Official]";
			mes "Hmm..." ;
			mes "Please get off if you don't have anything special to do~" ;
			close;
		}
		mes "[Magician Guild Official]";
		mes "Well, I wouldn't have come up this high for any other reason. Anyway, well done for coming." ;
		mes "I can help you with your new job." ;
		next;
		mes "[Magician Guild Official]";
		mes "My name is Catherine-Medicci." ;
		mes "I'm also a Wizard who hasn't been here that long after changing jobs. Feel free to call me 'Catherine'. Hmmm..." ;
		next;
		mes "[Catherine]";
		mes "Many people want to be Wizards, but many drop out..." ;
		mes "It's very hard to be a Wizard..." ;
		next;
		mes "[Catherine]";
		mes "First, you need to be at least Job level 40 to change jobs." ;
		mes "Otherwise, you don't have enough magic power to become a Wizard." ;
		next;
		mes "[Catherine]";
		mes "I'll explain more about it after you apply for a new job." ;
		mes "How about it? Do you want to make an application now?" ;
		next;
		if(select("Yes, please", "I'll think about it some more")==2) {
			mes "[Catherine]";
			mes "Okay, I understand. Think slowly." ;
			mes "I'm always open to job applications." ;
			close;
		}
		if(JobLevel < 40) {
			mes "[Catherine]";
			mes "See, remember what I said earlier, you can't change jobs unless your JobLevel is above 40." ;
			next;
			mes "[Magician Guild Official]";
			mes "Don't be in a hurry, go study some more." ;
			mes "I'll let you take it if you meet the requirements for a new job." ;
			close;
		}
		if(SkillPoint) { //not investigated
			mes "[Catherine]";
			mes "Oh dear, looks like you have a few extra SkillPoints." ;
			mes "Please come back after you've used up all your SkillPoints." ;
			close;
		}
		mes "[Catherine]";
		mes "Yes, then I will accept your job application." ;
		mes "The name is " +strcharinfo(0)+ " Ne." ;
		next;
		mes "[Catherine]";
		mes "The Wizard Job Test is divided into three parts, the first is collecting magic items." ;
		mes "The second is a written exam and the third is a practical magic exam." ;
		next;
		mes "[Catherine]";
		mes "The first of these exams will be waived for those with Job level 50." ;
		mes "I'm already working hard enough." ;
		next;
		if(JobLevel >= 50) {
			mes "[Catherine]";
			mes "Oh, you're at JobLevel 50." ;
			mes "You must have worked really hard." ;
			mes "You will be a wonderful Wizard." ;
			next;
			mes "[Catherine]";
			mes "Then let's waive the first test." ;
			mes "But don't worry, there are still two exams left." ;
			next;
			mes "[Catherine]";
			mes "Well, talk to the person in that corner." ;
			mes "I think it's going to be pretty difficult, so be careful." ;
			set CHANGE_WZ,3;
			close;
		}
		mes "[Catherine]";
		mes "So, now that we've completed the application, shall we move on to the first test?" ;
		next;
		mes "[Catherine]";
		mes "The first exam is to collect the magic items." ;
		mes "The important thing is that you have to go and collect them by yourself." ;
		next;
		mes "[Catherine]";
		mes "The items you will gather are";
		if(rand(2)) { //no dialogue yet
			set CHANGE_WZ,1;
			mes "^3051FD yellow gemstone^000000 10 pieces,^3051FD red gemstone^000000 10 pieces,^3051FD blue gemstone^000000 10 pieces,"
		}
		}
			set CHANGE_WZ,2;
			mes "^3051FD Crystal Blue^000000 5pcs,^3051FD Yellow Live^000000 5pcs,^3051FD Red Blood^000000 5pcs,^3051FD Wind of Verdure^000000 5pcs,"
		}
		mes "It's going to take a little bit of work, but we'll manage." ;
		next;
		mes "[Catherine]";
		mes "Well then, have a good day~" ;
		mes "I'll be waiting for you slowly." ;
		close;
	case 1:
	case 2:
		mes "[Catherine]";
		mes "Yes, have you collected the items?" ;
		mes "Then let's see if you have collected them properly." ;
		next;
		if(CHANGE_WZ == 1) {
			setarray '@need,715,716,717;
			set '@amount,10;
		}
		else {
			setarray '@need,990,991,992,993;
			set '@amount,5;
		}
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) { //check for required items
			if(countitem('@need['@i]) < '@amount)
				break;
		}
		if('@i < getarraysize('@need))) {
			mes "[Catherine]";
			mes "Hmm? I don't have them all." ;
			next;
			mes "[Catherine]";
			mes "I know it was hard for you to come all the way up here, but please go again." ;
			mes "Make sure you collect it this time." ;
			next;
			mes "[Catherine]";
			for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1)
				mes "^3051FD" +getitemname('@need['@i])+ "^000000 " +'@amount+ "pieces, remember to collect them well." ;
			close;
		}
		mes "[Catherine]";
		mes "Oh, that's accurate!" ;
		mes "Well collected." ;
		mes "I will put those items to good use in the guild." ;
		next;
		set CHANGE_WZ,3;
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1)
			delitem '@need['@i],'@amount;
		mes "[Catherine]";
		mes "Yes, the first test passed." ;
		mes "But don't worry, there are still two exams left." ;
		next;
		mes "[Catherine]";
		mes "Well, talk to the person in that corner." ;
		mes "I think it's going to be pretty difficult, so be careful." ;
		close;
	case 3:
	case 4:
		mes "[Catherine]";
		mes "Hmm? What's wrong?" ;
		mes "The first test is over, so go to the person in that corner." ;
		next;
		mes "[Catherine]";
		mes "Because you have to take the second exam." ;
		mes "They will be waiting for you, so go to them quickly." ;
		close;
	case 5:
		mes "[Catherine]";
		mes "Hmm, I heard you." ;
		mes "You did a great job solving the problem." ;
		mes "I'd love to give you something as a gift, but you have one last exam left." ;
		next;
		mes "[Catherine]";
		mes "You'll be a Wizard in a little while, so we'll do the gift then." ;
		next;
		mes "[Catherine]";
		mes "Then go on your way." ;
		mes "She's waiting for you." ;
		close;
	default: //when 6-11
		mes "[Catherine]";
		mes "Oh dear, you shouldn't have left the exam." ;
		next;
		if(Sex == 0) {
			mes "[Catherine]";
			mes "A girl can't pretend to be weak." ;
			mes "Even you came all this way to be a Wizard, didn't you?" ;
			next;
			mes "[Catherine]";
			mes "It was difficult for me too, but I didn't give up." ;
			mes "If you are going to live in the future, you have to be able to handle an exam like this." ;
		}
		else {
			mes "A man should not be weak just because he is a Magician." ;
		}
		mes "[Catherine]";
		mes "Then cheer up and go." ;
		mes "That man is waiting for you." ;
		close;
	case 12:
		mes "[Catherine]";
		mes "Congratulations on passing all your exams!" ;
		next;
		mes "[Catherine]";
		mes "Oh, I don't have time for this." ;
		mes "I have to get her a new job right away." ;
		next;
		unequip;
		jobchange Job_Wizard;
		set CHANGE_WZ,0;
		mes "[Catherine]";
		mes "You are already a Wizard."; mes "[Catherine]"; mes "[Catherine]"; mes "[Catherine]
		mes "You have to be fair and live well." ;
		mes "We Wizards can use very powerful magic, so we have to act sparingly." ;
		next;
		mes "[Catherine]";
		mes "It is strictly forbidden to use magic unnecessarily in the city or to disturb people." ;
		mes "Wizard magic is something that shows its true value when fighting monsters." ;
		next;
		mes "[Catherine]";
		mes "You should party with others and help them." ;
		mes "Oh... Also, I have a present for you. Just a minute..." ;
		next;
		mes "[Catherine]";
		mes "Gosh..." ;
		mes "rustling..." ;
		next;
		getitem 505,6;
		mes "[Catherine]";
		mes "I hope you put it to good use when you need it." ;
		mes "I gave it to you, so please don't sell it and use it yourself." ;
		next;
		mes "[Catherine]";
		mes "Now, please live a nice life as a Wizard." ;
		close;
	}
}

//==============================================================
gef_tower.gat,107,36,4 script White-haired Dog 81,{
	if(Job == Job_Wizard) {
		mes "[Mary]";
		mes "Instead of staying here, why don't you go outside and test how strong you've become?" ;
		next;
		mes "[Mary]";
		mes "Remember that we Wizards grow differently each and every day." ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[[Dog]]";
		mes "Hmm... What are you doing here if you can't even use magic?" ;
		mes "If you're not busy, go get some exercise under Geffen Tower~" ;
		next;
		mes "[[Dog]]";
		mes "Get out of here!" ;
		mes "I don't have time to talk to you!" ;
		close;
	}
	switch(CHANGE_WZ) {
	case 0:
		mes "[[Dog]]";
		mes "Oh, I know what you want to talk about." ;
		mes "You want to change jobs to Wizard, don't you?" ;
		next;
		mes "[[Dog]]";
		mes "If you want to change jobs, talk to Catherine on the side." ;
		mes "She will help you a lot." ;
		next;
		mes "[[Dog]]";
		mes "If you have any questions about the job testing process, ask me too." ;
		mes "I may look like this, but I know things." ;
		next;
		if(select("......" },"[Dog] is talking...") ==1) {
			mes "[[Dog]]";
			mes "Hmm? What... While it's talking..." ;
			mes "[Dog]]"; mes "Is this the first time you've seen [Dog] talk?" ;
			next;
			mes "[[Dog]]";
			mes "Hmm... It's not every day you get to see [Dog] talk." ;
			mes "Hmmm..." ;
			mes "......" ;
		}
		else {
			mes "[[Dog]]";
			mes "You don't have to be so blunt!" ;
			mes "You don't even know how this happened..." ;
		}
		next;
		mes "[[Dog]]";
		mes "My name is Mary-Sprue-Rodopska, and you can call me "Mary" as it is." ;
		mes "I'm here to help wizard career changers like you." ;
		next;
		mes "[Mary]";
		mes "I became [Dog] because..." ;
		mes "I was doing some experiments and my boyfriend made a mistake and this happened..." ;
		next;
		mes "[Mary]";
		mes "Theoretically, the drug should wear off after a few months..." ;
		next;
		mes "[Mary]";
		mes "Oh well..." ;
		mes "I can help you if you want to take the test." ;
		next;
		mes "[Mary]";
		mes "As I said earlier about changing jobs, talk to Catherine first." ;
		mes "She hasn't been a Wizard for very long either... Hmph." ;
		next;
		mes "[Mary]";
		mes "I could go into detail about the process of the job test, but..." ;
		mes "How about it? Would you like me to explain it to you?" ;
		next;
		switch (select("Yes! Can you explain?", "No, I'm fine.", "[Dog] talks about stuff...")) {
			case 1:
				mes "[Mary]";
				mes "Hmm. I'll give you some special details." ;
				next;
				mes "[Mary]";
				mes "You have to pass three exams to become a wizard." ;
				mes "First, there is a test where you have to collect magic items." ;
				next;
				mes "[Mary]";
				mes "That will begin as soon as you present the exam application to Catherine." ;
				mes "You will collect each gemstone or attribute gemstone." ;
				next;
				mes "[Mary]";
				mes "Second, a magic quiz." ;
				mes "A gloomy guy named Lawrel in the corner over there is in charge." ;
				next;
				mes "[Mary]";
				mes "It must have been a question about magic, or monsters, or Magician." ;
				mes "They're going to give you 10 questions and if you don't answer them all correctly, they're going to flunk you more and more..." ;
				next;
				mes "[Mary]";
				mes "He'll take you straight to the third test." ;
				mes "The third test is to defeat the monsters." ;
				next;
				mes "[Mary]";
				mes "When you enter each room, monsters with the same attributes as each room will appear, so it's important to use more effective magic to advance." ;
				next;
				mes "[Mary]";
				mes "That's about it for my explanation." ;
				mes "It's better to experience it yourself than to listen to it." ;
				close;
			case 2:
				mes "[Mary]";
				mes "Well, good luck with your application then." ;
				close;
			case 3:
				mes "[Mary]";
				mes "[Dog], sorry about that!" ;
				next;
				mes "[Mary]";
				mes "Go away already!!!" ;
				close2;
				warp "gef_dun00.gat",116,102;
				end;
		}
	case 1:
	case 2:
		mes "[Mary]";
		mes "You look like you don't know what to do." ;
		mes "You've already applied for the job test, and you were told to collect the items, right?" ;
		next;
		mes "[Mary]";
		mes "In case you're wondering, this is also an exam, so you'll have to do something on your own." ;
		next;
		mes "[Mary]";
		mes "From what I've heard, you're going to collect attribute gemstones." ;
		mes "I can't help you collect them, but I can at least give you some advice." ;
		next;
		mes "[Mary]";
		mes "Crystal Blue, you should go to Bylan Island." ;
		mes "Canatous, Kukule, Marina, Badon..." ;
		mes "It will be easier to get from these monsters." ;
		next;
		mes "[Mary]";
		mes "You can get yellow lives from insectoid monsters." ;
		mes "Try to defeat monsters such as Horn, Mantis, and Vittata." ;
		next;
		mes "[Mary]";
		mes "I know you say a lot of Red Blood comes out of Elder Willow, but you could also go to the desert and try to kill Metalla and Scorpion." ;
		next;
		mes "[Mary]";
		mes "I think Wind of Verdure is around Hornet, Steiner, and Steel Chon Chon." ;
		mes "You can get them if you work a little harder." ;
		next;
		mes "[Mary]";
		mes "Good luck with that." ;
		mes "This is about as basic as it gets to be a Wizard." ;
		close;
	case 3:
	case 4:
		mes "[Mary]";
		mes "You seem relieved that the first test is over... But!" ;
		mes "There are still two exams left, so don't let up!" ;
		close;
	case 5:
		mes "[Mary]";
		mes "Yes, you've solved it well." ;
		next;
		mes "[Mary]";
		mes "Well then, keep up the good work and don't let up until the last exam." ;
		mes "Lawrel is waiting for you." ;
		close;
	default: //when 6-11
		mes "[Mary]";
		mes "No... Did you give up and come back?" ;
		mes "Oh my God... You'll never be a good Wizard that way!" ;
		next;
		mes "[Mary]";
		mes "You do realize that each room will have a monster with the same attributes as that room, right?" ;
		mes "If you're a magician, you must also have a good understanding of which attributes are effective against that monster." ;
		next;
		mes "[Mary]";
		mes "You also have to be able to deal with monsters that use skills, so if someone dies from a skill, you have to take them down before they eat it." ;
		next;
		mes "[Mary]";
		mes "Anyway, go back and try again. You can't be making noise in a place like this." ;
		close;
	case 12:
		mes "[Mary]";
		mes "You made it after all!" ;
		mes "I guess you can call me Wizard from now on." ;
		next;
		mes "[Mary]";
		mes "Congratulations. Keep up the good work." ;
		close;
	}
}


//==========================================
// Secondary examination (written)
//------------------------------------------

gef_tower.gat,102,24,8 script Gloomy Wizard 735,{

	function Routine {
		mes "[Lawrel]";
		mes "Serious guy..." ;
		mes "Which... I'll explain it to you now." ;
		mes "If you find the exam difficult, you will be able to finish it quickly and easily if you do as you are told." ;
		next;
		mes "[Lawrel]";
		mes "The exam is to go through the battle." ;
		mes "You will go through the water room, the earth room, and the fire room, in that order, and each room will have monsters with the attributes of that room." ;
		next;
		mes "[Lawrel]";
		mes "You will know what kind of monsters will appear once you enter." ;
		mes "There, you will be able to exit more easily by countering each attribute with an effective attribute..." ;
		next;
		mes "[Lawrel]";
		mes "Within the time limit, if you defeat all the monsters that appear and also the gate monsters that stand in your way, you will be able to move on to the next room." ;
		next;
		mes "[Lawrel]";
		mes "And if you return to my place, your job change test will be over. You are now a Wizard." ;
		return;
	}

	if(Job == Job_Novice) {
		mes "[Lawrel]";
		mes "How did a chick end up in this place?" ;
		mes "Leave now." ;
		close2;
		warp "geffen.gat",120,110;
		end;
	}
	if(Job == Job_Priest) {
		mes "[Lawrel]";
		mes "Go home. We have no use for God's service." ;
		mes "Because magic and divine power are incompatible." ;
		next;
		mes "[Lawrel]";
		mes "If it weren't for that, I wouldn't be in good shape..." ;
		mes "[Lawrel]"; mes "Stay away and go that way..." ;
		close;
	}
	if(Job == Job_Wizard) {
		mes "[Lawrel]";
		mes "... What do you want from me?" ;
		mes "If you are a magician, you must know a lot about magic." ;
		next;
		mes "[Lawrel]";
		mes "If you treat magic untruthfully, you will lose control of your magic when you use powerful magic..." ;
		mes "If you don't want that to happen, you should have a deep understanding of magic." ;
		next;
		mes "[Lawrel]";
		mes "Unless you want to end the rest of your life as a cripple..." ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[Lawrel]";
		mes "Ugh... I'm in pain..." ;
		mes "It's as if my whole body is immersed in cold ice..." ;
		next;
		mes "[Lawrel]";
		mes "What the hell are you..." ;
		mes "Can you please go away...." ;
		close;
	}
	switch(CHANGE_WZ) {
	case 0:
		mes "[Lawrel]";
		mes "... I don't know what you want, but I don't have time for you right now." ;
		next;
		mes "[Lawrel]";
		mes "Go over there." ;
		close;
	case 1:
	case 2:
		mes "[Lawrel]";
		mes "Kukuk..." ;
		mes "The guy wants to be a Wizard..." ;
		next;
		mes "[Lawrel]";
		mes "If you stay that way, you'll only be able to hunt a little bit." ;
		next;
		mes "[Lawrel]";
		mes "You'll realize how wonderful Wizard is later... Kkkk...." ;
		close;
	case 3:
		mes "[Lawrel]";
		mes "Kukuk... You've come over the first test." ;
		mes "So... I am Lawrel=Master Aspagoras in charge of the second test." ;
		next;
		mes "[Lawrel]";
		mes "It's not too late, why don't you go back to town and continue your peaceful life? Hmmm..." ;
		next;
		mes "[Lawrel]";
		mes "Kkkk... I guess you're still imperfect enough to master magic." ;
		mes "Very dangerous..." ;
		break;
	case 4:
		mes "[Lawrel]";
		mes "Kukuk... You seem to be unmoved." ;
		next;
		mes "[Lawrel]";
		mes "You don't like your peaceful life so much?" ;
		next;
		mes "[Lawrel]";
		mes "You are still imperfect to control magic.... You'd better reconsider." ;
		break;
	case 5:
		set CHANGE_WZ,6;
		mes "[Lawrel]";
		mes "Okay... Did you get enough rest?" ;
		mes "Then it's time for your final test for your Wizard job change." ;
		next;
		mes "[Lawrel]";
		mes "Let me briefly explain the exam..." ;
		next;
		if(select("No, thank you", "I'll ask a few questions")==1) {
			mes "[Lawrel]";
			mes "You're reckless... Well, I'll pick up the bones." ;
			mes "Monsters and others will welcome you." ;
			next;
		}
		else {
			Routine;
			next;
			mes "[Lawrel]";
			mes "Kukuk... That's a look of horror." ;
			mes "It's not too late. If you give up now, I'll return you to town... What do you say?" ;
			next;
			if(select("Please continue with the exam", "I'm going home because it's horrible")==2) {
				mes "[Lawrel]";
				mes "Well thought out. Well... You look good just the way you are." ;
				mes "[Lawrel]"; mes "Go back to town and live an ordinary life." ;
				close2;
				warp "geffen.gat",120,110;
				end;
			}
		}
		// script unexamined
		mes "[Lawrel]";
		mes "Then I'll send you on your way now, as you wish. Go ahead and riot as you please." ;
		next;
		warp "job_wiz.gat",57,154;
		end;
	default: //when 6-9
		mes "[Lawrel]";
		mes "What? You're taking the test again...?" ;
		mes "You failed the combat exam... Kukuk...." ;
		mes "That's how much you love magic..." ;
		next;
		mes "[Lawrel]";
		mes "Seeing as how it doesn't go right, you'll have to take another test more often..." ;
		mes "If you're not happy, you need to do better." ;
		next;
		mes "[Lawrel]";
		mes "Then solve it once... Kuku...." ;
		next;
		mes "[Lawrel]";
		mes "1. Choose one of the following with different attributes." ;
		next;
		if(select("Mantis", "Canatius", "Gaius", "Caramel")==2)
			set '@point,'@point+20;
		mes "[Lawrel]";
		mes "2. Answer which of the following is not a root monster." ;
		next;
		if(select("Yoyo", "White Lotus Ball", "Metalla", "Zerom")==4)
			set '@point,'@point+20;
		mes "[Lawrel]";
		mes "3. Which of the following monsters does not respond to chanting?" ;
		next;
		if(select("Marina", "Vitata", "Scorpion", "Gaius")==1)
			set '@point,'@point+20;
		mes "[Lawrel]";
		mes "4. Answer the magic that is effective against Marin Sphere." ;
		next;
		if(select("Cold Bolt", "Firebolt", "Lightning Bolt", "Stone Curse")==3)
			set '@point,'@point+20;
		mes "[Lawrel]";
		mes "5. choose one of the following monsters to move." ;
		next;
		if(select("Hydra", "Mandragora", "Tengaishogun", "Frilledra")==4)
			set '@point,'@point+20;
		mes "[Lawrel]";
		mes "Kuku... Well... How's it coming?" ;
		next;
		set CHANGE_WZ,CHANGE_WZ+1;
		mes "[Lawrel]";
		mes "The score is... " +'@point+ "It's a point." ;
		if('@point < 40) {
			mes "Failed. Go study some more..." ;
			next;
			mes "[Lawrel]";
			mes "After all, you still lack something. That's why you fail..." ;
			close;
		}
		if('@point == 40) {
			mes "Kuku... So-so..." ;
			mes "I'm going to make you take the battle test again..." ;
		}
		else {
			mes "If you solve it so well, why are you so weak when it comes to actual combat..." ;
		}
		next;
		if(select("I'm going to take the exam", "Explain the exam again")==2) {
			Routine;
			next;
		}
		// script not yet examined
		mes "[Lawrel]";
		mes "Don't come back crying this time..." ;
		mes "Kukuk...." ;
		mes "I'll send you right back as soon as you want!" ;
		close2;
		warp "job_wiz.gat",57,154;
		end;
	case 10:
		// script not yet investigated
		set CHANGE_WZ,11;
		mes "[Lawrel]";
		mes "... What a guy." ;
		mes "I've never seen anyone so persistent in his examinations..." ;
		next;
		mes "[Lawrel]";
		mes "Okay... I have one suggestion." ;
		mes "You must be tired too... Kkkk..." ;
		mes "Yes, bring me one of the ^3051FD old scrolls ^000000." ;
		next;
		mes "[Lawrel]";
		mes "If you don't like it, take the test again and pass it." ;
		mes "I'll send you to the exam center..." ;
		close2;
		warp "job_wiz.gat",57,154;
		end;
	case 11:
		mes "[Lawrel]";
		mes "Well... Here we go again... Kukuk." ;
		mes "Are you going to try the test... Or did you bring the ^3051FD old scroll ^000000?" ;
		next;
		if(select("Attempt the exam", "old scrolls...") ==1) {
			mes "[Lawrel]";
			mes "Kkk... You've got to have that much guts." ;
			mes "I'll send you back, good luck..." ;
			close2;
			warp "job_wiz.gat",57,154;
			end;
		}
		if(countitem(618) < 1) {
			mes "[Lawrel]";
			mes "You don't have it..." ;
			close;
		}
		delitem 618,1;
		set CHANGE_WZ,12;
		mes "[Lawrel]";
		mes "Kukuk... You got it after all." ;
		mes "Well done." ;
		mes "Now you can continue my research again. I thank you..." ;
		next;
		mes "[Lawrel]";
		mes "Kkk... .let Catherine know that the exam passed.... Kkkkk...." ;
		mes "Good job...." ;
		close;
	case 12:
		mes "[Lawrel]";
		mes "You passed the exam." ;
		mes "You may go to Catherine and complete the procedure for your new job..." ;
		next;
		mes "[Lawrel]";
		mes "Go.... And be the Wizard you want to be..." ;
		mes "But be careful... The magic will always be after you... Kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk..." ;
		close;
	}
	//written test here
	next;
	if(select("I will live as a mediocre Magician", "Please continue with the job change exam")==1) {
		mes "[Lawrel]";
		mes "Ha ha... Well chosen." ;
		mes "Don't dream of being a Wizard, there's no rule that says you have to use magic..." ;
		next;
		mes "[Lawrel]";
		mes "Go down the tower slowly." ;
		mes "Never look back." ;
		mes "Take it easy and live in the town, using the abilities you have." ;
		close;
	}
	if(CHANGE_WZ == 3) {
		mes "[Lawrel]";
		mes "Wahahaha!" ;
		mes "I'll see clearly with my own eyes how good you are..." ;
	}
	else {
		mes "[Lawrel]";
		mes "Hahaha... You never learn either..." ;
		mes "Which, then, let's see how much you've learned..." ;
	}
	next;
	mes "[Lawrel]";
	mes "Then let's begin the exam." ;
	mes "You have to answer all of them correctly." ;
	next;
	mes "[Lawrel]";
	mes "There will be 10 questions, answer them all." ;
	mes "If you get it wrong, I can't tell you where you got it wrong." ;
	next;
	mes "[Lawrel]";
	mes "Kook... Now let's start the test." ;
	next;
	switch(rand(3)) {
	case 0:
		mes "[Lawrel]";
		mes "1. from which monster can you get a 'guard' with a slot?" ;
		next;
		if(select("steal bugs", "Pekopeko", "Pupa", "Kobold")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "2. Which of the following monsters is the easiest for Magician to defeat?" ;
		next;
		if(select("Flora", "Gaius", "Golem", "Mist")==1)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "3. Which of the monsters can't get through Stonecurse at all?" ;
		next;
		if(select("Elder Willow", "Evil Druid", "White Lotus Ball", "Marc")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "4. What is the damage rate when attacking a water Lv 3 monster with wind attribute?" ;
		next;
		if(select("125%", "150%", "175%", "200%")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "5. If child DesertWolf and Familiar fight, who will win?" ;
		next;
		if(select("Child DesertWolf", "Familiar", "Fight", "Don't know")==1)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "6. Which of the following monsters cannot be made into a cuppet?" ;
		next;
		if(select("PoPoring", "Rodderfrog", "Smokey", "Poison Spore")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "7. Choose the monster whose fire attribute is most effective among the following." ;
		next;
		if(select("Goblin (dagger)", "Goblin (flail)", "Goblin (axe)", "Goblin (hammer)")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "8. Choose the monster with the highest magic defense among the following." ;
		next;
		if(select("Horn", "Chon Chon", "Andre", "Caramel")==3)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "9. choose one monster of a different race." ;
		next;
		if(select("Poring", "Master Ring", "Ghost Ring", "Spore")==3)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "10. Which of the following monsters is not an undead?" ;
		next;
		if(select("Drake", "Megalodon", "DeBeers", "Carlitzburg")==3)
			set '@point,'@point+10;
		break;
	case 1:
		mes "[Lawrel]";
		mes "1. What is the most important status in Magician?" ;
		next;
		if(select("INT", "AGI", "DEX", "VIT")==1)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "2. There is one attribute that is not in Magician's "bolt" family of magic. Which one?" ;
		next;
		if(select("water attribute", "earth attribute", "fire attribute", "wind attribute")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "3. Choose the one that is the furthest away from Magician's characteristics." ;
		next;
		if(select("Low strength", "Can attack at long range", "Good for making money", "High SP")==3)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "4. which city has the most Magicians?" ;
		next;
		if(select("Prontera", "Morroc", "Alberta", "Geffen")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "5. Which cards do not increase INT?" ;
		next;
		if(select("Andre's Larva card", "Vitata card", "Child Desert Wolf card", "Elder Willow card")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "6. Choose Magician's advantages." ;
		next;
		if(select("excellent singing ability", "excellent acting ability", "excellent dancing ability", "excellent magic ability")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "7. What is the additional INT gained by weighted values when Magician is JobLvl 40?" ;
		next;
		if(select("8", "7", "6", "5")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "8. What items can't the Magician equip?" ;
		next;
		if(select("knife", "cap", "sandals", "Physician's hairband")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "9. Which ore is the catalyst for "Mixture 3" in the Magician job change test?" ;
		next;
		if(select("Blue Gemstone", "Red Gemstone", "Yellow Gemstone", "Red Blood")==1)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "10. What card has nothing to do with magic?" ;
		next;
		if(select("Marduk card", "White Lotus Ball card", "Willow card", "Maya card")==2)
			set '@point,'@point+10;
		break;
	case 2:
		mes "[Lawrel]";
		mes "1. what skills are not required to learn firewall?" ;
		next;
		if(select("Firebolt Lv 4", "Fireball Lv 5", "Sight Lv 1", "Napalm Beat Lv 4")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "2. If you freeze a monster with Frost Diver, what are its attributes?" ;
		next;
		if(select("water attribute", "earth attribute", "fire attribute", "wind attribute")==1)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "3. When you master Napalm Beat, how many times the MATK is the damage to the monster?" ;
		next;
		if(select("1.6x", "1.7x", "2x", "20x")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "4. What items are needed when using stonecurse?" ;
		next;
		if(select("Red Blood", "Blue Gemstone", "Yellow Gemstone", "Red Gemstone")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "5. What skills are not required to learn Safety Wall?" ;
		next;
		if(select("Napalm Beat Lv 7", "Soul Strike Lv 5", "SP Resilience Improvement Lv 6", "Sight Lv 1")==3)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "6. If SP Resilience Improvement is learned up to Lv 7, how much SP is recovered in 10 seconds by pure skill effect?" ;
		next;
		if(select("14", "21", "28", "35")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "7. if 50% SP left, what is the amount of damage reduction and SP consumption by Energy Coat?" ;
		next;
		if(select("damage 18% SP1.5%", "damage 18% SP2%", "damage 24% SP1.5%", "damage 24% SP2%")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "8. What is the SP consumption and evasion frequency when using Safety Wall Lv6?" ;
		next;
		if(select("SP 40. 6 times", "SP 35. 6 times", "SP 40. 7 times", "SP 35. 7 times")==4)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "9. how much SP is consumed when using Lv10 Thunderstorm?" ;
		next;
		if(select("84", "74", "64", "54")==2)
			set '@point,'@point+10;
		mes "[Lawrel]";
		mes "10. What skills are most effective in Izlude dungeon?" ;
		next;
		if(select("Lightning Bolt", "Firebolt", "Cold Bolt", "Sight")==1)
			set '@point,'@point+10;
		break;
	}
	mes "[Lawrel]";
	mes "Thanks for your help..." ;
	next;
	mes "[Lawrel]";
	mes "Which... Point..."; mes "'@point+"; mes "'@point+"; mes "'@point+ " +'@point+ "point..." ;
	switch(CHANGE_WZ) {
	case 3:
		if('@point < 100) {
			mes "Failed." ;
			next;
			mes "[Lawrel]";
			mes "That's how much you wanted to become a Wizard..." ;
			mes "Study up and come back." ;
			set CHANGE_WZ,4;
			close;
		}
		mes "Kukuk... Good. The second test also passed." ;
		next;
		mes "[Lawrel]";
		mes "Don't worry yet. There is a third exam left. Get some rest..." ;
		mes "Kkkkkkkkkkkkkkkkkkk..." ;
		break;
	case 4:
		if('@point < 80) {
			mes "Failed." ;
			next;
			mes "[Lawrel]";
			mes "I still haven't learned enough..." ;
			mes "At that level, even if you become a Wizard, you'll be easily beaten by monsters." ;
			close;
		}
		mes "Hmm... That's about as good as it gets..." ;
		mes "Well, okay. Passed." ;
		mes "I didn't make it through the first time, but I'll give you credit for trying." ;
		next;
		mes "[Lawrel]";
		mes "Don't worry yet. There is a third test." ;
		mes "Get some rest before the next exam..." ;
		break;
	}
	set CHANGE_WZ,5;
	close;
}


//==========================================
// Third stage test (practical)
// 6 levels: Water x 2, Earth x 2, Fire x 2
//------------------------------------------

job_wiz.gat,50,165,4 script Combat Combat Staff::WZ_ChatRoom 700,{
	mes "[Combat Combat Staff]";
	mes "Welcome to the Combat Test Room." ;
	mes "If you are taking the exam, please enter the exam waiting room." ;
	next;
	mes "[Combat Staff]";
	mes "If other job applicants are in the process of examining, please wait a moment." ;
	mes "The progress will be announced and you will enter when the previous person finishes." ;
	next;
	mes "[Combat Combat Staff]";
	mes "Each person's combat test will last approximately 5 to 10 minutes." ;
	mes "If you wish to interrupt the exam, please log out without leaving." ;
	close;
OnInit:
	waitingroom "Examination waiting room",10, "WZ_ChatRoom::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid '@accid;
	if(attachrid('@accid)) {
		set $@wz_tester$,strcharinfo(0);
		donpcevent "WZ_Water1::OnStart";
		warp "job_wiz.gat",116,171;
	}
	} else
		enablewaitingroomevent;
	end;
}

//==============================================================
job_wiz.gat,0,0,0 script WZ_Water1 -1,{
	end;
OnStart:
	set 'count,7;
	monster "job_wiz.gat",118,174,"--en--",1074,1, "WZ_Water1::OnKilled";
	monster "job_wiz.gat",118,165,"--en--",1067,1, "WZ_Water1::OnKilled";
	monster "job_wiz.gat",109,165,"--ja--",1066,1, "WZ_Water1::OnKilled";
	monster "job_wiz.gat",109,174,"--ja--",1158,1, "WZ_Water1::OnKilled";
	monster "job_wiz.gat",126,157,"--ja--",1242,1, "WZ_Water1::OnKilled";
	monster "job_wiz.gat",101,157,"--ja--",1141,1, "WZ_Water1::OnKilled";
	monster "job_wiz.gat",98,170,"--ja--",1138,1, "WZ_Water1::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "Water room: " +$@wz_tester$+ "Dear, monster elimination succeeded",9;
		donpcevent "WZ_Water2::OnStart";
	}
	end;
OnTimer1000:
	announce "Water room: water room, combat test is starting",9;
	end;
OnTimer2000:
	announce "Water room: time limit is 3 minutes",9;
	end;
OnTimer3000:
	announce "Water room: eliminate all monsters in time",9;
	end;
OnTimer33000:
	announce "Water room: 2 minutes 30 seconds left",9;
	end;
OnTimer63000:
	OnTimer63000: announce "Water room: 2 minutes left",9;
	end;
OnTimer93000:
	OnTimer93000: announce "Water room: 1 minute 30 seconds left",9;
	end;
OnTimer123000:
	OnTimer123000: announce "Water room: 1 minute left",9;
	end;
OnTimer153000:
	announce "Water room: 30 seconds left",9;
	end;
OnTimer173000:
	announce "10 seconds left until time limit! ,9;
	end;
OnTimer183000:
	announce "Water room: end",9;
	killmonster "job_wiz.gat", "WZ_Water1::OnKilled";
	end;
OnTimer184000:
	announce "Water room: " +$@wz_tester$+ "Dear, monster elimination failed",9;
	areawarp "job_wiz.gat",95,150,135,190, "geffen.gat",120,110;
	end;
OnTimer185000:
	announce "Water room: next person, please enter",9;
	end;
OnTimer186000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0 script WZ_Water2 -1,{
	end;
OnStart:
	set 'count,5;
	monster "job_wiz.gat",114,171,"--en--",1068,1, "WZ_Water2::OnKilled";
	monster "job_wiz.gat",116,169,"--ja--",1068,1, "WZ_Water2::OnKilled";
	monster "job_wiz.gat",114,167,"--ja--",1068,1, "WZ_Water2::OnKilled";
	monster "job_wiz.gat",112,169,"--ja--",1068,1, "WZ_Water2::OnKilled";
	monster "job_wiz.gat",114,169,"--ja--",1170,1, "WZ_Water2::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "Water room: " +$@wz_tester$+ "Dear, gatekeeper monster eliminated successfully",9;
		areawarp "job_wiz.gat",95,150,135,190, "job_wiz.gat",116,97;
		donpcevent "WZ_Earth1::OnStart";
	}
	end;
OnTimer1000:
	announce "Water room: gatekeeper monster has appeared. Time limit is 1 minute.",9;
	end;
OnTimer30000:
	announce "Water room: 30 seconds left",9;
	end; OnTimer30000: announce "Water room: 30 seconds left",9; end
OnTimer50000:
	OnTimer50000: announce "Water room: 10 seconds left",9;
	end;
OnTimer60000:
	OnTimer60000: announce "Water room: end",9;
	killmonster "job_wiz.gat", "WZ_Water2::OnKilled";
	end;
OnTimer61000:
	announce "Water room: " +$@wz_tester$+ "Dear, monster elimination failed",9;
	areawarp "job_wiz.gat",98,154,129,185, "geffen.gat",120,110;
	end;
OnTimer62000:
	announce "Water room: next person, please enter",9;
	end;
OnTimer63000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0 script WZ_Earth1 -1,{
	end;
OnStart:
	if( attachrid(getcharid(3,$@wz_tester$)) )
		percentheal 100,100;
	set 'count,8;
	monster "job_wiz.gat",120,102,"--en--",1127,1, "WZ_Earth1::OnKilled";
	monster "job_wiz.gat",120,102,"--ja--",1105,1, "WZ_Earth1::OnKilled";
	monster "job_wiz.gat",124,98,"--ja--",1023,1, "WZ_Earth1::OnKilled";
	monster "job_wiz.gat",120,93,"--ja--",1121,1, "WZ_Earth1::OnKilled";
	monster "job_wiz.gat",111,93,"--ja--",1166,1, "WZ_Earth1::OnKilled";
	monster "job_wiz.gat",107,98,"--ja--",1060,1, "WZ_Earth1::OnKilled";
	monster "job_wiz.gat",111,102,"--ja--",1057,1, "WZ_Earth1::OnKilled";
	monster "job_wiz.gat",111,102,"--ja--",1103,1, "WZ_Earth1::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "Earth Room: " +$@wz_tester$+ "Dear, monster elimination succeeded",9;
		donpcevent "WZ_Earth2::OnStart";
	}
	end;
OnTimer1000:
	announce "Earth room: earth room, combat test is starting",9;
	end;
OnTimer2000:
	announce "Earth room: time limit is 3 minutes",9;
	end;
OnTimer3000:
	announce "Earth room: eliminate all monsters in time",9;
	end;
OnTimer33000:
	announce "Earth room: 2 minutes 30 seconds left",9;
	end;
OnTimer63000:
	OnTimer63000: announce "Earth room: 2 minutes left",9;
	end;
OnTimer93000:
	OnTimer93000: announce "Earth room: 1 minute 30 seconds left",9;
	end;
OnTimer123000:
	OnTimer123000: announce "Earth room: 1 minute left",9;
	end;
OnTimer153000:
	OnTimer153000: announce "Earth room: 30 seconds left",9; end; OnTimer153000: announce "Earth room: 30 seconds left",9;
	end;
OnTimer173000:
	OnTimer173000: announce "Earth room: 10 seconds left",9;
	end;
OnTimer183000:
	OnTimer183000: announce "Land room: end",9; end; OnTimer183000: announce "Land room: end",9; end; killmonster
	killmonster "job_wiz.gat", "WZ_Earth1::OnKilled";
	end;
OnTimer184000:
	announce "earth room: " +$@wz_tester$+ "sama, monster elimination failed",9;
	areawarp "job_wiz.gat",95,75,135,120, "geffen.gat",120,110;
	end;
OnTimer185000:
	mapannounce "job_wiz.gat", "Ground room: next person, please enter",9;
	end;
OnTimer186000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0 script WZ_Earth2 -1,{
	end;
OnStart:
	set 'count,7;
	monster "job_wiz.gat",116,100,"--en--",1020,1, "WZ_Earth2::OnKilled";
	monster "job_wiz.gat",118,99,"--ja--",1020,1, "WZ_Earth2::OnKilled";
	monster "job_wiz.gat",118,95,"--ja--",1020,1, "WZ_Earth2::OnKilled";
	monster "job_wiz.gat",116,94,"--ja--",1020,1, "WZ_Earth2::OnKilled";
	monster "job_wiz.gat",114,95,"--ja--",1020,1, "WZ_Earth2::OnKilled";
	monster "job_wiz.gat",114,99,"--ja--",1020,1, "WZ_Earth2::OnKilled";
	monster "job_wiz.gat",116,97,"--ja--",1118,1, "WZ_Earth2::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "ground room: " +$@wz_tester$+ "Dear, gatekeeper monster eliminated successfully",9;
		areawarp "job_wiz.gat",95,75,135,120, "job_wiz.gat",46,99;
		donpcevent "WZ_Fire1::OnStart";
	}
	end;
OnTimer1000:
	announce "Earth room: gatekeeper monster has appeared. Time limit is 1 minute.",9;
	end;
OnTimer30000:
	OnTimer30000: announce "Earth room: 30 seconds left",9;
	end;
OnTimer50000:
	OnTimer50000: announce "Earth room: 10 seconds left",9;
	end;
OnTimer60000:
	OnTimer60000: announce "Land room: end",9;
	killmonster "job_wiz.gat", "WZ_Earth2::OnKilled";
	end;
OnTimer61000:
	announce "earth room: " +$@wz_tester$+ "sama, monster elimination failed",9;
	areawarp "job_wiz.gat",95,75,135,120, "geffen.gat",120,110;
	end;
OnTimer62000:
	announce "Ground room: next person, please enter",9;
	end;
OnTimer63000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0 script WZ_Fire1 -1,{
	end;
OnStart:
	if( attachrid(getcharid(3,$@wz_tester$)) )
		percentheal 100,100;
	set 'count,7;
	monster "job_wiz.gat",51,103,"--en--",1119,1, "WZ_Fire1::OnKilled";
	monster "job_wiz.gat",51,92,"--ja--",1033,1, "WZ_Fire1::OnKilled";
	monster "job_wiz.gat",40,92,"--ja--",1019,1, "WZ_Fire1::OnKilled";
	monster "job_wiz.gat",40,103,"--ja--",1001,1, "WZ_Fire1::OnKilled";
	monster "job_wiz.gat",58,110,"--ja--",1178,1, "WZ_Fire1::OnKilled";
	monster "job_wiz.gat",37,89,"--ja--",1058,1, "WZ_Fire1::OnKilled";
	monster "job_wiz.gat",33,110, "goblin",1123,1, "WZ_Fire1::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "Fire Room: " +$@wz_tester$+ "Dear, monster elimination succeeded",9;
		donpcevent "WZ_Fire2::OnStart";
	}
	end;
OnTimer1000:
	announce "Fire room: fire room, combat test is starting",9;
	end;
OnTimer2000:
	announce "Fire room: last room. Time limit is 3 minutes.",9;
	end;
OnTimer3000:
	announce "Fire room: eliminate all monsters in time",9;
	end;
OnTimer33000:
	announce "Fire room: 2 minutes 30 seconds left",9;
	end;
OnTimer63000:
	OnTimer63000: announce "Fire room: 2 minutes left",9;
	end;
OnTimer93000:
	OnTimer93000: announce "Fire room: 1 minute 30 seconds left",9;
	end;
OnTimer123000:
	OnTimer123000: announce "Fire room: 1 minute left",9;
	end;
OnTimer153000:
	OnTimer153000: announce "Fire room: 30 seconds left",9;
	end;
OnTimer173000:
	OnTimer173000: announce "Fire room: 10 seconds left",9;
	end;
OnTimer183000:
	announce "fire room: end",9;
	killmonster "job_wiz.gat", "WZ_Fire1::OnKilled";
	end;
OnTimer184000:
	announce "Fire room: " +$@wz_tester$+ "sama, monster elimination failed",9;
	areawarp "job_wiz.gat",25,75,65,120, "geffen.gat",120,110;
	end;
OnTimer185000:
	announce "fire room: next person, please enter",9;
	end;
OnTimer186000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0 script WZ_Fire2 -1,{
	end;
OnStart:
	set 'count,3;
	monster "job_wiz.gat",43,99,"--en--",1129,1, "WZ_Fire2::OnKilled";
	monster "job_wiz.gat",45,99,"--ja--",1129,1, "WZ_Fire2::OnKilled";
	monster "job_wiz.gat",44,99,"--ja--",1277,1, "WZ_Fire2::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		killmonster "job_wiz.gat", "WZ_Fire2::OnKilled";
		set CHANGE_WZ,12;
		announce "Fire room: congratulations! " +$@wz_tester$+ "You have passed the exam." ,9;
		areawarp "job_wiz.gat",95,75,135,120, "job_wiz.gat",46,99;
		sleep 3000;
		announce "Examination completed: please return to the examiner and complete the rest of the procedure.",9;
		sleep 3000;
		announce "Examination finished: the examination is over. Please have the next examinee ready.",9;
		areawarp "job_wiz.gat",30,82,61,113, "gef_tower.gat",110,33;
		sleep 1000;
		announce "Examination finished: next person, please enter",9;
		sleep 1000;
		enablewaitingroomevent "WZ_ChatRoom";
		end;
	}
	end;
OnTimer1000:
	announce "Fire room: gatekeeper monster has appeared. Time limit is 2 minutes.",9;
	end;
OnTimer30000:
	OnTimer30000: announce "Fire room: 1 minute 30 seconds left",9;
	end;
OnTimer60000:
	OnTimer60000: announce "Fire room: 1 minute left",9;
	end;
OnTimer90000:
	OnTimer90000: announce "Fire room: 30 seconds left",9;
	end;
OnTimer110000:
	OnTimer110000: announce "Fire room: 10 seconds left",9;
	end;
OnTimer120000:
	OnTimer120000: announce "fire room: end",9;
	killmonster "job_wiz.gat", "WZ_Fire2::OnKilled";
	end;
OnTimer121000:
	announce $@wz_tester$+ "sir has failed the exam!" ,9;
	areawarp "job_wiz.gat",25,75,65,120, "geffen.gat",120,110;
	end;
OnTimer122000:
	announce "Fire room: next person, please enter",9;
	end;
OnTimer123000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}
