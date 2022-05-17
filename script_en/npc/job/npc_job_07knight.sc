//= Athena Script ==============================================================
// Ragnarok Online Knight Jobchange Script by Blaze
//= Registry ===================================================================
// CHANGE_KN -> 0-14
//==============================================================================

//============================================================
// Test Application and Job Change
//------------------------------------------------------------
prt_in.gat,88,101,4 script Knight Commander of Prontera 56,{
	if(Job == Job_Novice) {
		mes "[Knight Commander Hermann]";
		mes "This is Knight Commander Prontera." ;
		mes "What can we do for you?" ;
		next;
		switch (select("I want to change my job to Swordsman", "I want to change my job to Knight", "I'm here to watch")) {
		case 1:
			mes "[Knight Commander Hermann]";
			mes "Ha ha ha! I see..." ;
			mes "You visited the wrong place!";
			next;
			mes "[Knight Commander Hermann]";
			mes "This is not a swordsmen's guild, but a knighthood." ;
			mes "If you want to be a swordsman, go to the Swordsmen's Guild in Izlude." ;
			break;
		case 2:
			mes "[Knight Commander Hermann]";
			mes "Hmm, it's good to dream big." ;
			mes "But to become a Knight, you must first become a swordsman." ;
			next;
			mes "[Knight Commander Hermann]";
			mes "Go to the Swordsmen's Guild in Izlude." ;
			mes "[Knight Commander Hermann]"; mes "Come back when you have honed your skills to some degree as a swordsman." ;
			break;
		case 3:
			mes "[Knight Commander Hermann]";
			mes "Well, you can watch, but if you're not busy, kill as many monsters as you can." ;
			break;
		}
		next;
		mes "[Knight Commander Hermann]";
		mes "Then come back and visit me when you need me." ;
		close;
	}
	if(Job == Job_Knight) {
		mes "[Knight Commander Hermann]";
		mes "Oh, Knight Commander... Do you remember what I said?" ;
		mes "My Knight Commanders shall stand tall even in death." ;
		close;
	}
	if(Job ! = Job_Swordman) {
		mes "[Knight Commander Hermann]";
		mes "Welcome to your visit to the Knights of Prontera." ;
		mes "Take your time." ;
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[Knight Commander Hermann]";
		mes "This is Knight Commander Prontera." ;
		mes "What can we do for you?" ;
		next;
		if(select("I want to change my job to Knight.", "I'm here to watch.")==2) {
			mes "[Knight Commander Hermann]";
			mes "How, you are not a swordsman?" ;
			mes "From the looks of it, you've honed your skills quite a bit by now..." ;
			next;
			mes "[Knight Commander Hermann]";
			mes "If you are a swordsman, why don't you consider a career change to Knight?" ;
			mes "[Knight Commander Hermann]"; mes "If you are willing to change your job to Knight, visit me." ;
			next;
			mes "[Knight Commander Hermann]";
			mes "Then take your time and look around." ;
			close;
		}
		if(Upper == UPPER_HIGH) {
			mes "[Knight Commander Hermann]";
			mes "What is ......?" ;
			mes "I sense something is amiss." ;
			mes "You've been a knight for a long time, and I don't have much advice for you." ;
			next;
			mes "[Knight Commander Hermann]";
			mes "[Knight Commander Hermann]"; mes "Tell others to have a heart that will not yield to any trial." ;
			mes "Glory to you!" ;
			close;
		}
		mes "[Knight Commander Hermann]";
		mes "Oh, go Knight" +(Sex? "young man": "young lady") + "Oh!" ;
		mes "We Knights of Prontera will take care of you." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "I am Hermann von Ephesus, Knight Commander of the Knights of Prontera here." ;
		mes "My heart beats faster every time I see these motivated young people." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "We, the Knight Order of Prontera, only allow swordsmen with JobLv 40 or higher to take the exam." ;
		mes "Because we can't let a greenhorn become a Knight!" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "So do you want to apply for a new job?" ;
		next;
		if(select("Yes, I'm applying", "I'll think about it some more")==2) {
			mes "[Knight Commander Hermann]";
			mes "Haha, that was a bit sudden, wasn't it?" ;
			mes "Then take your time and think about it." ;
			next;
			mes "[Knight Commander Hermann]";
			mes "Come back when you are ready to change jobs." ;
			close;
		}
		if(JobLevel < 40) {
			mes "[Knight Commander Hermann]";
			mes "Haha, you're not ready to be a Knight yet." ;
			mes "I told you that you need a JobLevel of 40 or higher!" ;
			next;
			mes "[Knight Commander Hermann]";
			mes "Of course I'm willing to do that, but not yet." ;
			mes "[Knight Commander Hermann]"; mes "Of course I would love to do that, but not yet."; mes "Fight a few more monsters, and then come back." ;
			mes "I'll be waiting for you." ;
			close;
		}
		if(SkillPoint) {
			mes "[Knight Commander Hermann]";
			mes "Hmmm, you can't change jobs if you have any SkillPoints left." ;
			mes "Get the skills you can learn, then come back." ;
			close;
		}
		mes "[Knight Commander Hermann]";
		mes "Alright, I welcome your application." ;
		mes "The name is " +strcharinfo(0);
		mes "You read it like this." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Then let me explain about the job change test." ;
		mes "You will meet the knights of my Order one by one, and you will all have to pass the test they will give you." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "When all the examinations are completed and all of my knights have passed them, you can change your job to Knight." ;
		mes "Unanimous as the word is! If even one of you objects, you will have to take the exam again from the beginning." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "But if you are sincere, your will will be conveyed to all." ;
		next;
		if(JobLevel >= 50) { //not researched
			mes "[Knight Commander Hermann]";
			mes "You have a JobLevel of 50." ;
			mes "That's admirable. It seems that you have trained diligently until now." ;
			next;
			mes "[Knight Commander Hermann]";
			mes "You have a JobLv of 50." ;
			mes "You don't need the first ordeal." ;
			mes "[Knight Commander Hermann]"; mes "Then let's move on." ;
			next;
			mes "[Knight Commander Hermann]";
			mes "Go to James-Syracuse." ;
			mes "He will conduct the next examination." ;
			mes "[Knight Commander Hermann]"; mes "Now go." ;
			set CHANGE_KN,5;
		}
		else {
			mes "[Knight Commander Hermann]";
			mes "Seeing is believing!" ;
			mes "See the knights immediately and take the test." ;
			mes "Come back here when all the examinations are over." ;
			set CHANGE_KN,1;
		}
		close;
	case 1:
		mes "[Knight Commander Hermann]";
		mes "Yeah? " +strcharinfo(0)+ ", what do you want?" ;
		mes "Hmm... You don't seem to know who to see." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "They have difficult personalities and seem to have set up some sort of procedure among themselves." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "First, you should meet Knight Andrew Shylock." ;
		mes "This is your first exam, but don't be too nervous." ;
		close;
	case 4:
		mes "[Knight Commander Hermann]";
		mes "Yeah " +strcharinfo(0)+ "." ;
		mes "Hmm? You don't know who to go to?" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "I see you've completed one of your exams." ;
		mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "So that means... Shylock!" ;
		mes "Who's next in charge!" ;
		next;
		mes "[Knight Andrew]";
		mes "I said James!" ;
		mes "How can someone who can't remember one of those be a Knight!!!!" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Did you hear that?" ;
		mes "Take the Knight James=Syracuse exam." ;
		mes "And don't make the mistake of meeting them in the wrong order." ;
		close;
	case 6:
		mes "[Knight Commander Hermann]";
		mes "Yeah " +strcharinfo(0)+ "." ;
		mes "Hmm? You don't know who to go to?" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "I see you've completed two exams." ;
		mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "So that means... Syracuse!" ;
		mes "Who's next in charge!" ;
		next;
		mes "[Knight James]";
		mes "Ha! I told you to meet Windsor!" ;
		mes "It's his fault for not remembering!" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Did you hear that?" ;
		mes "Take Knight Windsor=Benedict's test." ;
		mes "And don't make the mistake of meeting them in the wrong order." ;
		close;
	case 8:
		mes "[Knight Commander Hermann]";
		mes "Yeah " +strcharinfo(0)+ "." ;
		mes "Hmm? You don't know who to go to?" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "I see you have completed three exams." ;
		mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "That means... Benedict!" ;
		mes "Who's next in charge!" ;
		next;
		mes "[Knight Windsor]";
		mes "... Amy Beatrice!" ;
		mes "... The bad swordsman!" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Did you hear that?" ;
		mes "Take Knight Amy=Beatrice's test." ;
		mes "And don't make the mistake of meeting them in the wrong order." ;
		close;
	case 10:
		mes "[Knight Commander Hermann]";
		mes "Yeah " +strcharinfo(0)+ "." ;
		mes "Hmm? You don't know who to go to?" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "I see you've completed four exams." ;
		mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "That means... Beatrice!" ;
		mes "Who's next in charge!" ;
		next;
		mes "[Knight Amy]";
		mes "Totally.... I told you to see Edmond!" ;
		mes "I'm sure those kids will run away with a bunch of monsters." ;
		mes "I scold him, but he forgets right away..." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Did you hear that?" ;
		mes "Take Knight Edmund-Grost's test." ;
		mes "And don't make the mistake of meeting him in the wrong order." ;
		close;
	case 12:
		mes "[Knight Commander Hermann]";
		mes "Yeah " +strcharinfo(0)+ "." ;
		mes "Hmm? You don't know who to go to?" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "It's probably the last knight..." ;
		mes "Go take the Knight Gray=Prosfero test..." ;
		next;
		mes "[Knight Edmund]";
		mes "........." ;
		next;
		mes "[Knight Edmund]";
		mes "You've misjudged people..." ;
		mes "But even this has cause and effect." ;
		mes "You will know when the time comes to make a decision..." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "It's the last exam, so make sure you're on top of it." ;
		mes "Also, it is against the ways of knighthood to rely on others." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Then go and finish your examinations." ;
		mes "And let's hear what everyone has to say." ;
		close;
	case 13:
		mes "[Knight Commander Hermann]";
		mes "Then go finish your exam." ;
		mes "I haven't finished the exam yet." ;
		close;
	default:
		mes "[Knight Commander Hermann]";
		mes "Yeah " +strcharinfo(0)+ "." ;
		mes "The exam may be difficult, but good luck." ;
		close;
	case 14:
		if(SkillPoint) {
			mes "[Knight Commander Hermann]";
			mes "Hmmm, you can't change jobs if you still have SkillPoints left." ;
			mes "Get the skills you can learn, then come back." ;
			close;
		}
		mes "[Knight Commander Hermann]";
		mes "Mm, you have completed all of the knight's exams." ;
		mes "But not every swordsman who has completed his exams can become a knight." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "How serious, honorable, or strong did you show in the course of the examination..." ;
		mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "I was allowed to watch during the examination." ;
		mes "And according to our seven evaluations, the decision to change knights will be made." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "So let's hear everyone's evaluations, shall we?" ;
		mes "Shall this person be transferred to Knight?" ;
		mes "Shylock, what are your thoughts! ";
		next;
		mes "[Knight Andrew]";
		mes "I asked for a nasty item and I came away with it." ;
		mes "I agree!" ;
		mes ""+(Sex? "He": "She")+ "will live a serious life after Knight." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Mm, very good assessment." ;
		mes "What do you think of Syracuse?" ;
		next;
		mes "[Knight James]";
		mes "Well, it's fine." ;
		mes "I don't like it much right now, but I'm sure it will bring me more fame after I become Knight." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Mm. Benedict, what about you?" ;
		next;
		mes "[Knight Windsor]";
		mes "..." ;
		next;
		mes "[Knight Windsor]";
		mes "For..." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "It doesn't sound like he's unhappy with you." ;
		mes "Then let's hear Beatrice's assessment." ;
		next;
		mes "[Knight Amy]";
		mes "Yes, it's good!" ;
		if(Sex) {
			mes "He's polite enough." ;
			mes "He's not quite ready now, but he's going to be wonderful when he becomes a Knight." ;
			mes "Hmmm..." ;
		}
		else {
			mes "She's polite enough, you know." ;
			mes "And she's cute, so more points..." ;
			mes "I shouldn't say that, should I?" ;
		}
		next;
		mes "[Knight Commander Hermann]";
		mes "What a strange assessment, but it seems to be in favor of it." ;
		mes "Gross, you also have a word." ;
		next;
		mes "[Knight Edmund]";
		mes "Still rough around the edges, but he's got some good stuff." ;
		mes ""+(Sex? "he": "she")+ "The day will come when the hidden gems of the "he" will show us the light." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Finally, Prosfero." ;
		mes "Let's hear what he has to say." ;
		next;
		mes "[Knight Gray]";
		mes "I guess there's nothing more to say from me." ;
		mes "It is enough that the "young" +(Sex? "guy": "lady")+ "wished to be knighted so bravely." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "All in favor? No opposition?" ;
		mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]"; mes "[Knight Commander Hermann]" ;
		next;
		mes "[Knight Commander Hermann]";
		mes "..." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "I agree." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "It is difficult to say whether he has passed all the tests perfectly, but I have determined that he is fully equipped with the virtues of a knight." ;
		next;
		unequip;
		jobchange Job_Knight;
		set CHANGE_KN,0;
		mes "[Knight Commander Hermann]";
		mes "You are now a member of our Knight Order of Prontera." ;
		mes "Protect the weak and become a knight of honor." ;
		next;
		getitem 656,7;
		mes "[Knight Commander Hermann]";
		mes "And all of us have prepared a gift to congratulate you on your new job." ;
		next;
		mes "[Knight Commander Hermann]";
		mes "Then go!" ;
		mes "May your future and the future of the Order be bright!" ;
		close;
	}
}

//============================================================
// First test (item collection)
//------------------------------------------------------------
prt_in.gat,75,107,4 script Knight Andrew 65,{
	if(Job == Job_Novice) {
		mes "[Knight Andrew]";
		mes "Novice." ;
		mes "Welcome to the Knight Order of Prontera." ;
		next;
		mes "[Knight Andrew]";
		mes "You may feel as weak as you can be right now, but you can be strong if you work hard." ;
		next;
		mes "[Knight Andrew]";
		mes "Dream of a bright future and walk your path in silence." ;
		close;
	}
	if(Job == Job_Knight) {
		mes "[Knight Andrew]";
		mes "You are a Knight Andrew. How are you doing these days?" ;
		next;
		mes "[Knight Andrew]";
		mes "It's important to have solid habits in order to be equipped and get food as well." ;
		mes "Collect every single zeropy you can get from daily combat." ;
		next;
		mes "[Knight Andrew]";
		mes "That said, it's not a good idea to gobble up a lot of supplies." ;
		mes "Because we are knights." ;
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[Knight Andrew]";
		mes "We, the Knights of Prontera, are striving for peace on this continent." ;
		next;
		mes "[Knight Andrew]";
		mes "In the midst of many battles, we envision a bright future that will one day come." ;
		close;
	case 1:
		mes "[Knight Andrew]";
		mes "Hello. How can I help you?" ;
		next;
		if(select("I would like to take the Knight job change test", "Nothing")==2) {
			mes "[Knight Andrew]";
			mes "I see..." ;
			close;
		}
		mes "[Knight Andrew]";
		mes "Oh, you are the one who wants to move to Knight. What is your name..." ;
		mes ""+strcharinfo(0)+ " is that correct?"" ;
		next;
		mes "[Knight Andrew]";
		mes "My name is Andrew Shylock, Knight of the Order of Prontera." ;
		mes "I am in charge of your first career change exam." ;
		next;
		mes "[Knight Andrew]";
		mes "What I want to know is your integrity." ;
		mes "It is one of the virtues that every knight must have." ;
		mes "[Knight Andrew]"; mes "My test for you is to go and collect the spoils of the battle." ;
		next;
		mes "[Knight Andrew]";
		mes "Well, let's get started, shall we?" ;
		next;
		mes "[Knight Andrew]";
		mes "Go collect the next item." ;
		next;
		set CHANGE_KN,rand(2,3);
		mes "[Knight Andrew]";
		if(CHANGE_KN == 2) {
			mes "5 old fairy whiskers, 5 red bat wings, 5 moth feather powder, 5 orc warrior's marks, 5 reptile tongues, 5 boar's mane,";
		}
		else {
			mes "5 short legs, 5 mermaid hearts, 5 cannibal plant flowers, 5 shellfish nips, 5 old frying pans, 5 catasimuli skins,";
		}
		next;
		mes "[Knight Andrew]";
		mes "That's all." ;
		mes "Please go and collect them well." ;
		close;
	case 2:
		setarray '@need,1040,7006,1057,931,903,1028;
		break;
	case 3:
		setarray '@need,1042,950,1032,966,7031,946;
		break;
	case 4:
		mes "[Knight Andrew]";
		mes "See, the test is over from me." ;
		mes "Knight James is waiting for you." ;
		mes "Please go and see him quickly." ;
		close;
	default:
		mes "[Knight Andrew]";
		mes "Is there something you want to tell me?" ;
		mes "If you have time for that, go take your next exam." ;
		mes "Once again, I must reiterate that you must take the exam seriously." ;
		close;
	case 14:
		mes "[Knight Andrew]";
		mes "You have all completed your exams. Good job." ;
		mes "[Knight Andrew]"; mes "Then please go to our Knight Commander's office and have him listen to everyone's evaluations." ;
		close;
	}
	//continued from 2-3
	mes "[Knight Andrew]";
	mes "Welcome back." ;
	mes "Have you collected your items?" ;
	mes "[Knight Andrew]"; mes "Then let's take a look." ;
	next;
	for(set '@i,0; '@i<6; set '@i,'@i+1) {
		if(countitem('@need['@i]) < 5) {
			mes "[Knight Andrew]";
			mes "Wait a minute." ;
			mes "You don't have all of them." ;
			next;
			mes "[Knight Andrew]";
			mes "Did you think you could be Knight without proper preparation?" ;
			mes "If you forgot the item you asked for, I'll say it again." ;
			next;
			mes "[Knight Andrew]";
			for(set '@i,0; '@i<6; set '@i,'@i+1)
				mes ""+getitemname('@need['@i])+ " 5 items,";
			next;
			mes "[Knight Andrew]";
			mes "Once again, please take the exam seriously." ;
			mes "Then go." ;
			close;
		}
	}
	mes "[Knight Andrew]";
	mes "Perfect. Thanks for your hard work." ;
	mes "This item will be a great addition to the finances of the Order." ;
	next;
	mes "[Knight Andrew]";
	mes "Then please go to my fellow Knight James-Syracuse." ;
	mes "I ask that you hope that the remaining examinations will be as serious as you have lived." ;
	for(set '@i,0; '@i<6; set '@i,'@i+1)
		delitem '@need['@i],5;
	set CHANGE_KN,4;
	close;
}

//============================================================
// Secondary Examination (Oral Examination)
//------------------------------------------------------------
prt_in.gat,71,91,0 script Knight James 65,{
	if(Job == Job_Novice) {
		mes "[Knight James]";
		mes "Oh, what's Novice doing here?" ;
		next;
		mes "[Knight James]";
		mes "If you are interested in Knight, you can't move from Novice to Knight." ;
		next;
		mes "[Knight James]";
		mes "[Knight James]"; mes "Come back after you have trained as a Swordsman.
		close;
	}
	if(Job == Job_Knight) {
		mes "[Knight James]";
		mes "How are you! The Knights are just as they used to be." ;
		next;
		mes "[Knight James]";
		mes "I've been taking on new Knights for a while now, and they're all burly guys." ;
		mes "By the way, have you seen anyone anywhere who would dishonor our Order?" ;
		next;
		mes "[Knight James]";
		mes "If you see such a man, scold him for me." ;
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[Knight James]";
		mes "Perhaps because we cannot attack and defend, both at the same time, or because if we use a two-handed sword, we will have to discard our shield, which weakens our defense. Is there any weapon that can overcome this drawback?" ;
		next;
		mes "[Knight James]";
		mes "If we could make such a thing, it would be useful for the knights." ;
		close;
	case 1:
	case 2:
	case 3:
	case 4:
		mes "[Knight James]";
		mes "Hmm, you wanted to see me?" ;
		break;
	case 5:
		mes "[Knight James]";
		mes "Hmm, you again. What do you want?" ;
		break;
	case 6:
		mes "[Knight James]";
		mes "Hmm, you still want to see me?" ;
		break;
	default:
		mes "[Knight James]";
		mes "Oh, sorry, I'm busy." ;
		mes "Finish all your exams." ;
		close;
	case 14:
		mes "[Knight James]";
		mes "Hmm, you've finished all your other colleagues' exams." ;
		next;
		mes "[Knight James]";
		mes "Then go and hear what the Knight Commander has to say." ;
		mes "We'll be there." ;
		close;
	}
	next;
	if(select("I would like to take the Knight job change test", "Nothing")==2) {
		mes "[Knight James]";
		mes ""+(CHANGE_KN == 5)? "If you have nothing to do, go home!" : "What a watery mess." ;
		close;
	}
	switch(CHANGE_KN) {
	case 1:
		mes "[Knight James]";
		mes "Knight job change exam..." ;
		mes "Oh, by the way, that's the guy I applied for..." ;
		mes "The name was " +strcharinfo(0)+ "..." ;
		next;
		mes "[Knight James]";
		mes "But you'll have to come and see my other colleagues before you see me." ;
		mes "You haven't taken the first test I've seen yet, have you?" ;
		next;
		mes "[Knight James]";
		mes "If you've taken even one exam, I'll let you take mine." ;
		close;
	default: //when 2 or 3
		mes "[Knight James]";
		mes "Ha ha, c'mon..." ;
		mes "You're in the middle of Andrew's exam, aren't you?" ;
		mes "How dare you ignore that and come to me...." ;
		next;
		mes "[Knight James]";
		mes "Come on, get the hell out of here!" ;
		close;
	case 4:
		mes "[Knight James]";
		mes "Oh, the first test is over." ;
		mes "[Knight James]"; mes "Okay, I'll give you a moment to yourself." ;
		next;
		mes "[Knight James]";
		mes "My name is James-Syracuse." ;
		mes "I'm a Knight of the Order of Prontera, of course." ;
		next;
		mes "[Knight James]";
		mes "The test you are about to take is how well you understand knighthood, and I would like to hear your thoughts on the honor of knighthood." ;
		next;
		mes "[Knight James]";
		mes "[Knight James]"; mes "Don't be nervous." ;
		mes "It won't take that long." ;
		mes "It's a simple question." ;
		next;
		mes "[Knight James]";
		mes "I'll begin then. Answer me right away." ;
		set CHANGE_KN,5;
		break;
	case 5:
		mes "[Knight James]";
		mes "Right. I'm hoping for a decent answer this time." ;
		mes "If you make a mistake next time... Brace yourself!" ;
		next;
		mes "[Knight James]";
		mes "Then we'll begin." ;
		break;
	case 6:
		mes "[Knight James]";
		mes "Hey, you already took my test! Go to one of my other colleagues." ;
		mes "I told you Knight Windsor would be waiting for you." ;
		close;
	}
	// oral exam here
	next;
	mes "[Knight James]";
	mes "Knight is a profession that combines high physical attack and defense, attack speed, and powerful two-handed sword skills." ;
	mes "Then, answer the weapon that does not allow the use of the typical two-handed sword skill, Two Handed Quicken." ;
	next;
	if(select("katana", "slayer", "broadsword", "flamberge") ! = 4) {
		mes "[Knight James]";
		mes "No! That's a two-handed sword, so it works!" ;
		mes "What would a would-be Knight do if he didn't know the Knight's skills!" ;
		next;
		mes "[Knight James]";
		mes "If you don't know, go out of town and grab a Knight around the corner and ask him." ;
		mes "Do a little more research on Knight." ;
		close;
	}
	mes "[Knight James]";
	mes "Okay, so let's learn a little more about the skill." ;
	mes "What skills are not required to learn the 'bowling bash'?" ;
	next;
	if(select("Two Handed Sword Training Lv.5", "Magnum Break Lv.3", "Provoc Lv.10", "Bash Lv.10") ! = 3) {
		mes "[Knight James]";
		mes "No! If you don't learn that, you won't be able to use the bowling bash forever!" ;
		mes "What would a would-be Knight do if he didn't know Knight skills!" ;
		next;
		mes "[Knight James]";
		mes "If you don't know, go out of town and grab a Knight around the corner and ask him." ;
		mes "Do a little more research on Knight." ;
		close;
	}
	mes "[Knight James]";
	mes "Knight can handle a spear." ;
	mes "And he can use skills that utilize the spear. Answer one of these that does not require mastery for the Brandish Spear." ;
	next;
	if(select("Pierce Lv.5", "Spear Stab Lv.3", "Spear Boomerang Lv.3", "Riding Lv.1") ! = 3) {
		mes "[Knight James]";
		mes "No! If you don't learn that, you won't be able to use Brandish Spear forever!" ;
		mes "What would a would-be Knight do if he didn't know Knight skills!" ;
		next;
		mes "[Knight James]";
		mes "If you don't know, go out of town and grab a Knight around the corner and ask him." ;
		mes "Do a little more research on Knight." ;
		close;
	}
	mes "[Knight James]";
	mes "Some spears, like other weapons, have attributes." ;
	mes "So which of the following spears can damage a Knight mare with the 'ghost' attribute?" ;
	next;
	if(select("Zephyrus", "Lance", "Gizarmes", "Crescent Cider") ! = 1) {
		mes "[Knight James]";
		mes "No! You'll only strike out if you poke with that thing!" ;
		mes "What would a would-be Knight do if he didn't know about Knight weapons!" ;
		next. mes "[Knight James]"; mes "[Knight James]
		mes "[Knight James]";
		mes "If you don't know, go out of town and grab a Knight around the corner and ask him." ;
		mes "Do a little more research on Knight." ;
		close;
	}
	mes "[Knight James]";
	mes "Once you become a Knight, you will be able to travel on Peko Peko." ;
	mes "Instead, your attack speed will be reduced." ;
	mes "However, the attack speed can be increased by learning the cavalry training skill." ;
	next;
	mes "[Knight James]";
	mes "So what is the attack speed when the cavalry discipline is mastered to Lv.3?" ;
	next;
	if(select("70% of normal", "80% of normal", "90% of normal", "100% of normal") ! = 2) {
		mes "[Knight James]";
		mes "No! If you don't know anything about cavalry training, don't ride Pecopeko!" ;
		mes "How can a would-be Knight not know about Knight weapons!" ;
		next;
		mes "[Knight James]";
		mes "If you don't know, go out of town and grab a Knight around the corner and ask him." ;
		mes "Do a little more research on Knight." ;
		close;
	}
	mes "[Knight James]";
	mes "Okay, if you can answer this well, your knowledge of Knight is good for now." ;
	mes "So let me ask you a few personal questions about Knight." ;
	next;
	mes "[Knight James]";
	mes "What should we do when we meet a newbie in town asking for ad baisu?" ;
	next;
	switch(select("I'll recommend a suitable hunting ground", "I'll take the attack and help him", "I'll give him plenty of money and items")) {
	case 1:
		mes "[Knight James]";
		mes "Yes. Beginners will have to become independent at some point." ;
		mes "It is very important to show them the right place to grow on their own." ;
		next;
		break;
	case 2:
		mes "[Knight James]";
		mes "You're making a mistake." ;
		mes "Would that really help the person?" ;
		mes "[Knight James]"; mes "You are so vain. Come back out!" ;
		close;
	case 3:
		mes "[Knight James]";
		mes "Hmm. The other person might be pleased, but that's like giving them poison." ;
		mes "Instead of helping them, you're ruining them. Come back out!" ;
		close;
	}
	mes "[Knight James]";
	mes "So how should we work within the party?" ;
	next;
	switch(select("lead the way and protect everyone", "gather monsters and let them kill everyone", "pick up items regardless of combat")) {
	case 1:
		mes "[Knight James]";
		mes "That's exactly right! Our knights' strong physical strength and offensive power really play an important role in the party." ;
		mes "Always keep that in mind." ;
		next;
		break;
	case 2:
		mes "[Knight James]";
		mes "... Are you serious?" ;
		mes "[Knight James]"; mes "... you don't know how much damage that could do to the surrounding area." ;
		mes "Go home already!" ;
		close;
	case 3:
		mes "[Knight James]";
		mes "..." ;
		mes "If you're not up to it, you can leave." ;
		close;
	}
	mes "[Knight James]";
	mes "Finally, what is the most important thing to a knight?" ;
	next;
	switch(select("honor", "money", "status")) {
	case 1:
		mes "[Knight James]";
		mes "Yes, knight is honor!" ;
		mes "Live for honor, die for honor." ;
		mes "We must always keep it in mind." ;
		next;
		break;
	case 2:
		mes "[Knight James]";
		mes "Rotten guts! Go wherever you want!" ;
		mes "[Knight James]"; mes "Our Order can't take in guys like you." ;
		close;
	case 3:
		mes "[Knight James]";
		mes "We can't accept a guy with a crooked gut who fights to get ahead in our Order." ;
		close;
	}
	mes "[Knight James]";
	mes "Okay, the test is over from me." ;
	next;
	mes "[Knight James]";
	mes "Knight Windsor is waiting for you." ;
	mes "[Knight James]"; mes "He's a mute fellow, so watch your words." ;
	set CHANGE_KN,6;
	close;
}

//============================================================
// Tertiary test (combat test)
//------------------------------------------------------------
prt_in.gat,79,94,4 script Knight Windsor 733,{
	mes "[Knight Windsor]";
	mes "......" ;
	next;
	if(Job == Job_Novice) {
		mes "[Knight Windsor]";
		mes "Go outside and play..." ;
		close;
	}
	if(Job == Job_Knight) {
		mes "[Knight Windsor]";
		mes "Don't talk to him..." ;
		close;
	}
	if(Job ! = Job_Swordman) {
		mes "[Knight Windsor]";
		mes "What do you want..." ;
		close;
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[Knight Windsor]";
		mes "Don't talk to him..." ;
		close;
	case 1:
	case 2:
	case 3:
	
	case 5:
		mes "[Knight Windsor]";
		mes "What do you want..." ;
		next;
		if(select("I would like to take the Knight job change exam", "Nothing")==2) {
			mes "[Knight Windsor]";
			mes "......" ;
			close;
		}
		mes "[Knight Windsor]";
		mes "......" ;
		next;
		mes "[Knight Windsor]";
		mes "Not my turn..." ;
		close;
	case 6:
	case 7:
		mes "[Knight Windsor]";
		mes ""+(CHANGE_KN == 7)? "... Again... What do you want?" : "What do you want..." ;
		next;
		if(select("I would like to take the Knight job change exam", "Nothing")==2) {
			mes "[Knight Windsor]";
			mes "......" ;
			close;
		}
		mes "[Knight Windsor]";
		mes "......" ;
		next;
		mes "[Knight Windsor]";
		mes "... Follow me." ;
		if(CHANGE_KN == 6)
			set CHANGE_KN,7;
		close2;
		warp "job_knt.gat",89,101;
		end;
	default:
		mes "[Knight Windsor]";
		mes "You want a battle..." ;
		close;
	case 14:
		mes "[Knight Windsor]";
		mes "Go to the Lord Commander..." ;
		close;
	}
}

job_knt.gat,89,106,4 script Knight Windsor#Test 733,{
	mes "[Knight Windsor]";
	mes "......" ;
	next;
	mes "[Knight Windsor]";
	mes "You have a question...?" ;
	next;
	switch(select("What kind of exam is it?" , "How is the exam going to go?" , "I want to get out of here", "No")) {
	case 1:
		mes "[Knight Windsor]";
		mes "......" ;
		next;
		mes "[Knight Windsor]";
		mes "It's a battle with monsters..." ;
		next;
		mes "[Knight Windsor]";
		mes "Kill them all..." ;
		next;
		mes "[Knight Windsor]";
		mes "......" ;
		next;
		mes "[Knight Windsor]";
		mes "Finish all three steps..." ;
		next;
		mes "[Knight Windsor]";
		mes "Give 3 minutes per phase..." ;
		next;
		mes "[Knight Windsor]";
		mes "......" ;
		close;
	case 2:
		mes "[Knight Windsor]";
		mes "......" ;
		next;
		mes "[Knight Windsor]";
		mes "Enter the waiting room..." ;
		next;
		mes "[Knight Windsor]";
		mes "Then we will begin immediately." ;
		next;
		mes "[Knight Windsor]";
		mes "......" ;
		next;
		mes "[Knight Windsor]";
		mes "Wait if others are testing." ;
		next;
		mes "[Knight Windsor]";
		mes "Enter as soon as one finishes." ;
		next;
		mes "[Knight Windsor]";
		mes "......" ;
		close;
	case 3:
		mes "[Knight Windsor]";
		mes "......" ;
		next;
		mes "[Knight Windsor]";
		mes "... I see. ......" ;
		close2;
		warp "prt_in.gat",80,100;
		end;
	case 4:
		mes "[Knight Windsor]";
		mes "......" ;
		close;
	}
OnInit:
	waitingroom "waiting room",20, "Knight Windsor#Test::OnWarp",1;
	end;
OnWarp:
	disablewaitingroomevent;
	initnpctimer "KN_Timer";
	set getvariableofnpc('count, "KN_Test3"),12;
	monster "job_knt.gat",39,150,"--en--",1114,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",39,142,"--ja--",1114,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",35,146,"--ja--",1100,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",47,150,"--ja--",1114,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",47,142,"--ja--",1114,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",43,137,"--ja--",1160,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",43,137,"--ja--",1095,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",43,137,"--ja--",1105,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",43,155,"--ja--",1160,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",43,155,"--ja--",1095,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",43,155,"--ja--",1105,1, "KN_Test3::OnKilled1";
	monster "job_knt.gat",52,146,"--ja--",1100,1, "KN_Test3::OnKilled1";
	warpwaitingpc "job_knt.gat",43,147,1;
	end;
}

job_knt.gat,0,0,0 script KN_Test3 -1,{
	end;
OnKilled1:
	set 'count,'count-1;
	if('count)
		end;
	initnpctimer "KN_Timer"; //Message selection wait time is also 3 minutes
	mes "[Knight Windsor]";
	mes "......" ;
	next;
	mes "[Knight Windsor]";
	mes "Proceed to the next step..." ;
	close2;
	initnpctimer "KN_Timer"; //initialize timer since we selected it
	set 'count,12;
	monster "job_knt.gat",34,52,"--en--",1119,1, "KN_Test3::OnKilled2";
	monster "job_knt.gat",29,52,"--ja--",1111,2, "KN_Test3::OnKilled2";
	monster "job_knt.gat",53,52,"--ja--",1119,1, "KN_Test3::OnKilled2";
	monster "job_knt.gat",58,52,"--ja--",1111,2, "KN_Test3::OnKilled2";
	monster "job_knt.gat",43,42,"--ja--",1106,1, "KN_Test3::OnKilled2";
	monster "job_knt.gat",43,62,"--ja--",1106,1, "KN_Test3::OnKilled2";
	monster "job_knt.gat",57,64,"--ja--",1030,1, "KN_Test3::OnKilled2";
	monster "job_knt.gat",57,39,"--ja--",1030,1, "KN_Test3::OnKilled2";
	monster "job_knt.gat",31,64,"--ja--",1030,1, "KN_Test3::OnKilled2";
	monster "job_knt.gat",31,39,"--ja--",1030,1, "KN_Test3::OnKilled2";
	warp "job_knt.gat",43,52;
	end;
OnKilled2:
	set 'count,'count-1;
	if('count)
		end;
	initnpctimer "KN_Timer";
	mes "[Knight Windsor]";
	mes "......" ;
	next;
	mes "[Knight Windsor]";
	mes "One more step..." ;
	close2;
	initnpctimer "KN_Timer";
	set 'count,7;
	monster "job_knt.gat",136,152,"--en--",1122,1, "KN_Test3::OnKilled3";
	monster "job_knt.gat",150,152,"--ja--",1123,1, "KN_Test3::OnKilled3";
	monster "job_knt.gat",143,145,"--ja--",1124,1, "KN_Test3::OnKilled3";
	monster "job_knt.gat",136,158,"--ja--",1280,1, "KN_Test3::OnKilled3";
	monster "job_knt.gat",130,165,"--ja--",1125,1, "KN_Test3::OnKilled3";
	monster "job_knt.gat",156,165,"--ja--",1126,1, "KN_Test3::OnKilled3";
	monster "job_knt.gat",143,167,"--ja--",1258,1, "KN_Test3::OnKilled3";
	warp "job_knt.gat",143,152;
	end;
OnKilled3:
	set 'count,'count-1;
	if('count)
		end;
	initnpctimer "KN_Timer";
	mes "[Knight Windsor]";
	mes "......" ;
	next;
	mes "[Knight Windsor]";
	mes "Examination completed..." ;
	next;
	mes "[Knight Windsor]";
	mes "Leave here and meet Amy-Beatrice." ;
	close2;
	stopnpctimer "KN_Timer";
	set CHANGE_KN,8;
	warp "prt_in.gat",80,100;
	killmonster "job_knt.gat", "KN_Test3::OnKilled1";
	killmonster "job_knt.gat", "KN_Test3::OnKilled2";
	killmonster "job_knt.gat", "KN_Test3::OnKilled3";
	enablewaitingroomevent "Knight Windsor#Test";
	end;
}

job_knt.gat,0,0,0 script KN_Timer -1,{ //waiting for next timer during test and after each stage is cleared
	end;
OnTimer180000:
	stopnpctimer;
	areawarp "job_knt.gat",22,126,65,165, "prt_in.gat",80,100;
	areawarp "job_knt.gat",22,32,65,71, "prt_in.gat",80,100;
	areawarp "job_knt.gat",122,132,165,171, "prt_in.gat",80,100;
	killmonster "job_knt.gat", "KN_Test3::OnKilled1";
	killmonster "job_knt.gat", "KN_Test3::OnKilled2";
	killmonster "job_knt.gat", "KN_Test3::OnKilled3";
	enablewaitingroomevent "Knight Windsor#Test";
	end;
}

//============================================================
// Fourth test (personality test)
//------------------------------------------------------------
prt_in.gat,69,107,6 script Knight Amy 728,{
	if(Job == Job_Novice) {
		mes "[Knight Amy]";
		mes "Oh my, cute little Novice." ;
		mes "Very cute!" ;
		next;
		mes "[Knight Amy]";
		mes "Hey, can we be Knight later?" ;
		mes "I bet it would be cool to be a Knight!" ;
		next;
		mes "[Knight Amy]";
		mes "I'll remember that..." ;
		mes "Be a Knight for sure!" ;
		mes "I promise!" ;
		close;
	}
	if(Job == Job_Knight) {
		mes "[Knight Amy]";
		mes "Oh? What brings you to visit me?" ;
		next;
		mes "[Knight Amy]";
		mes "You don't have a problem with knighthood, do you?" ;
		mes "Amy trusts that the knight is doing well." ;
		next;
		mes "[Knight Amy]";
		mes "So long!" ;
		mes "My fellow Knights of Prontera!" ;
		close;
	}
	if(Job ! = Job_Swordman) {
		mes "[Knight Amy]";
		mes "Welcome to the Knights of Prontera!" ;
		next;
		mes "[Knight Amy]";
		mes "We're all knights, but take your time~" ;
		close;
	}
	if(CHANGE_KN == 0) {
		mes "[Knight Amy]";
		mes "Oh my, Swordsman." ;
		mes "Are you here to change jobs to Knight?" ;
		next;
		mes "[Knight Amy]";
		mes "To change your job to Knight, you should first listen to the Knight Commander over there." ;
		close;
	}
	mes "[Knight Amy]";
	mes "Yeah? What do you want with Amy?" ;
	next;
	if(CHANGE_KN < 10) {
		if(select("I would like to take the Knight job test", "Nothing")==2) {
			mes "[Knight Amy]";
			mes "Amy, you're boring..." ;
			close;
		}
	}
	switch(CHANGE_KN) {
	default:
		mes "[Knight Amy]";
		mes "Yeah! You've already applied for a new job!" ;
		mes "Then go take the other knight's test before me!" ;
		next;
		mes "[Knight Amy]";
		mes "I'd like to see you from the beginning, but that's not good enough!" ;
		close;
	case 8:
		mes "[Knight Amy]";
		mes "Come on, come over here more!" ;
		mes "Now for Amy's exam. Hmmm." ;
		next;
		mes "[Knight Amy]";
		mes "My name is Amy Beatrice." ;
		mes "I am one of the red stars of the Knight Order of Prontera." ;
		next;
		mes "[Knight Amy]";
		mes "Amy's test is to see if she has enough civility to be a Knight." ;
		next;
		mes "[Knight Amy]";
		mes "If you listen to what I say and answer the occasional question, I will evaluate you accordingly." ;
		next;
		mes "[Knight Amy]";
		mes "So just listen carefully and say what you think is right as Knight. Do you understand?" ;
		next;
		mes "[Knight Amy]";
		mes "Then I will begin." ;
		break;
	case 9:
		mes "[Knight Amy]";
		mes "Yes, now have you studied about courtesy?" ;
		next;
		mes "[Knight Amy]";
		mes "If you fail again this time, Amy will be very angry!" ;
		next;
		mes "[Knight Amy]";
		mes "And I'm going to tell the Knight Commander that I'm not going to let you become Knight." ;
		next;
		mes "[Knight Amy]";
		mes "So listen carefully and give the right answer as a Knight!" ;
		next;
		mes "[Knight Amy]";
		mes "Then, let's go!" ;
		break;
	case 10:
		mes "[Knight Amy]";
		mes "Go to Master Edmond's." ;
		mes "Amy's exams are over." ;
		close;
	case 11:
	case 12:
	case 13:
		mes "[Knight Amy]";
		mes "There are still other knight exams left!" ;
		mes "Come on, come on, go!" ;
		close;
	case 14:
		mes "[Knight Amy]";
		mes "Oh, it's time for everyone to get results!" ;
		next;
		mes "[Knight Amy]";
		mes "Listen to what the Knight Commander has to say." ;
		mes "Don't be too nervous." ;
		close;
	}
	// personality test here
	next;
	mes "[Knight Amy]";
	mes "You are Knight, seeking a party on the streets of Morroc." ;
	mes "How should I recruit?" ;
	next;
	if(select("shout that you are looking for a party", "create a chat room and wait", "find people looking for Knight") ! = 1)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "I've hooked up a party with people close to my level: Priest, WizardHunter, Assassin, and Blacksmith." ;
	next;
	mes "[Knight Amy]";
	mes "The six of us are going straight to the pyramid." ;
	next;
	mes "[Knight Amy]";
	mes "We arrived at the fourth floor." ;
	mes "Now, what do you want to do?" ;
	next;
	if(select("Look around and make calm decisions", "Collect monsters for the party", "Go slowly to the front") ! = 2)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "Then someone suddenly disappeared with many monsters in tow." ;
	mes "And then you?" ;
	next;
	if(select("protect the party and get attacked", "fight while retreating", "flee quickly with pecks") ! = 3)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "Fortunately, everyone in the party is safely out of danger." ;
	mes "Now, if you walk all the way down, you will see someone who is not a member of the party is down." ;
	next;
	mes "[Knight Amy]";
	mes "The person politely asked to be patched up." ;
	next;
	if(select("inform the Priest of the party", "say I'll patch you up if you give me money", "ignore and pass by")==1)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "I have to say goodbye to the party members because I have to go somewhere else soon." ;
	next;
	mes "[Knight Amy]";
	mes "At that time, how would you like to distribute the loot you have won during the battle?" ;
	next;
	if(select("Give it to the person with the most merit", "Pretend not to care and take it yourself", "Everyone discusses and decides")==3)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "After leaving the party members, I came to Prontera to sell some valuable items." ;
	mes "Lots of people are setting up stalls/trading chats in the square." ;
	next;
	mes "[Knight Amy]";
	mes "Now how do I put my items up for sale?" ;
	next;
	if(select("walk around calling out to people", "open a chat room and wait", "look for people asking for items") ! = 1)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "While doing so, I met someone begging." ;
	mes "What should I do?" ;
	next;
	if(select("divide my money and items", "ignore and leave", "tell the person where to hunt")==3)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "Now I decided to go to the labyrinth forest alone." ;
	mes "I'm humming along on the pecking order." ;
	next;
	mes "[Knight Amy]";
	mes "So, I came across someone who has lost their way. What do you do?" ;
	next;
	if(select("I'll show you the way home", "I'll show you the way to the exit", "I'll give you one of my butterfly wings") ! = 3)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "I was surrounded by many monsters in the forest and ran out of recovery medicine." ;
	mes "Your strength is shown in red and you are in a dangerous situation." ;
	next;
	mes "[Knight Amy]";
	mes "Oh, Priest just passed by. How would you like to ask?" ;
	next;
	if(select("A few heels if you don't mind", "Heels please", "Heels") ! = 3)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "I'm already very tired." ;
	mes "Time to go back to town." ;
	next;
	mes "[Knight Amy]";
	mes "On my way back, I found a very expensive item down." ;
	next;
	if(select("pick it up and take it back myself", "look for who it belongs to", "just pass by")==2)
		set '@point,'@point+10;
	mes "[Knight Amy]";
	mes "Yes, this is the end of my test!" ;
	next;
	if(CHANGE_KN == 8 && '@point < 90) {
		set CHANGE_KN,10;
		mes "[Knight Amy]";
		mes "Hmmm... I thought about it, but no." ;
		mes "If you really acted like that, it would mean that all our knights are rude." ;
		next;
		mes "[Knight Amy]";
		mes "Please think again about how you answered the question I asked you, and then come back and take the test." ;
		close;
	}
	if(CHANGE_KN == 9 && '@point < 80) {
		mes "[Knight Amy]";
		mes "Hmmm... No!" ;
		mes "If I make you a Knight, my knighthood will look bad..." ;
		next;
		mes "[Knight Amy]";
		mes "Go home and think slowly about where you went wrong." ;
		mes "Then I'll let you take the test again. Okay?" ;
		close;
	}
	mes "[Knight Amy]";
	mes "Wow! That's enough to be a knight if you know how to do it!" ;
	mes "Next test... I guess it's at Master Edmond's place." ;
	next;
	mes "[Knight Amy]";
	mes "Please listen carefully to your knight and do your best for the remaining exams!" ;
	set CHANGE_KN,10;
	close;
}

//============================================================
// Fifth test (patience test)
//------------------------------------------------------------
prt_in.gat,70,99,6 script Knight Edmund 734,{
	if(Job == Job_Novice) {
		mes "[Knight Edmund]";
		mes "The deep-rooted tree is not beaten by the wind..." ;
		next;
		mes "[Knight Edmund]";
		mes "Strength built solidly from the foundation will one day yield glorious results..." ;
		next;
		mes "[Knight Edmund]";
		mes "I can tell you that your future will be determined now..." ;
		close;
	}
	if(Job == Job_Knight) {
		mes "[Knight Edmund]";
		mes "Like water flowing through the heart..." ;
		next;
		mes "[Knight Edmund]";
		mes "Flowing water grazes the rocks and goes its own way..." ;
		next;
		mes "[Knight Edmund]";
		mes "A knight must flow as quietly as water in all circumstances." ;
		close;
	}
	if(Job ! = Job_Swordman) {
		mes "[Knight Edmund]";
		mes "Everything in the world... They all exist in harmony." ;
		next;
		mes "[Knight Edmund]";
		mes "Live in harmony with that reason." ;
		close;
	}
	if(CHANGE_KN == 0) {
		mes "[Knight Edmund]";
		mes "He who has dark thoughts will have only dark dreams..." ;
		next;
		mes "[Knight Edmund]";
		mes "If you keep dreaming dark dreams, you won't even dream..." ;
		close;
	}
	if(CHANGE_KN <= 12) {
		mes "[Knight Edmund]";
		mes "What do you want? Swordsman..." ;
		next;
		if(select("I would like to take the Knight job change test.", "Nothing")==2) {
			mes "[Knight Edmund]";
			mes "Your wish will open before your eyes." ;
			close;
		}
	}
	switch(CHANGE_KN) {
	default: //when 1 to 9
		mes "[Knight Edmund]";
		mes "A flower... Young shoots grow, stems grow, leaves grow, fruits form and bloom." ;
		next;
		mes "[Knight Edmund]";
		mes "Or it will be an imperfect flower..." ;
		next;
		mes "[Knight Edmund]";
		mes "There's someone waiting for you ahead." ;
		mes "[Knight Edmund]"; mes "You will find your way." ;
		close;
	case 10:
		mes "[Knight Edmund]";
		mes "Your turn to take my test..." ;
		mes "[Knight Edmund]"; mes "[Knight Edmund]"; mes "[Knight Edmund]"; mes "[Knight Edmund]" ;
		next;
		mes "[Knight Edmund]";
		mes "My name is Edmund-Grost, a member of the Order of Prontera." ;
		next;
		mes "[Knight Edmund]";
		mes "A knight should be a role model for others." ;
		mes "Therefore, he must be a man of constant piety and worthy to maintain the order of the world." ;
		next;
		mes "[Knight Edmund]";
		mes "Do not judge as you please, and do not be rash in your actions." ;
		mes "Sometimes we need a mind as flexible as water, and sometimes we need a determination as firm as a rock." ;
		next;
		mes "[Knight Edmund]";
		mes "Do not kill monsters for no reason, and do not enjoy the carnage." ;
		mes "[Knight Edmund]"; mes "Meditate and prepare your mind." ;
		next;
		mes "[Knight Edmund]";
		mes "Then begin the examination." ;
		mes "[Knight Edmund]"; mes "[Knight Edmund]"; mes "[Knight Edmund]"; mes "Come with reverence." ;
		set CHANGE_KN,11;
		break;
	case 11:
		mes "[Knight Edmund]";
		mes "You made a rash move last time." ;
		mes "A knight is in the profession of protecting the weak..." ;
		mes "It is not a profession that oppresses the weak..." ;
		next;
		mes "[Knight Edmund]";
		mes "Where all things in the world are in harmony, what happens when man alone continues to destroy..." ;
		mes "[Knight Edmund]"; mes "This is not just about the test, it's about the real world..." ;
		next;
		mes "[Knight Edmund]";
		mes "So let's do it again." ;
		mes "[Knight Edmund]"; mes "Let me see your quiet, waiting heart." ;
		break;
	case 12:
	case 13:
		mes "[Knight Edmund]";
		mes "Your heart has been shown." ;
		mes "Go to Knight Gray and take the final test..." ;
		close;
	case 14:
		mes "[Knight Edmund]";
		mes "Listen to the Knight Commander..." ;
		mes "[Knight Edmund]"; mes "You will hear what everyone has to say then..." ;
		close;
	}
	// patience test here
	close2;
	addtimer 270000, "KN_Test5::OnClear"; //Clear if survived 270sec
	killmonster "job_knt.gat", "KN_Test5::OnKilled";
	monster "job_knt.gat",167,57,"--en--",1182,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",167,54,"--ja--",1182,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",120,57,"--ja--",1182,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",120,54,"--ja--",1182,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",141,57,"--ja--",1002,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",145,57,"--ja--",1002,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",143,55,"--ja--",1002,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",143,59,"--ja--",1002,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",141,55,"--ja--",1063,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",141,59,"--ja--",1063,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",145,55,"--ja--",1063,1, "KN_Test5::OnKilled";
	monster "job_knt.gat",145,59,"--ja--",1063,1, "KN_Test5::OnKilled";
	// comment out because it is considered a stack and seems to boil elsewhere
	// monster "job_knt.gat",139,57,"--en--",1011,1, "KN_Test5::OnKilled";
	// monster "job_knt.gat",147,57,"--ja--",1011,1, "KN_Test5::OnKilled";
	// monster "job_knt.gat",143,53,"--ja--",1011,1, "KN_Test5::OnKilled";
	// monster "job_knt.gat",143,61,"--ja--",1011,1, "KN_Test5::OnKilled";
	warp "job_knt.gat",143,57;
	end;
}

//Need to trigger events from NPCs in the same MAP
job_knt.gat,0,0,0 script KN_Test5 -1,{
	end;
OnKilled: //Redo if the enemy is killed
	deltimer "KN_Test5::OnClear";
	warp "prt_fild05.gat",353,251;
	end;
OnClear:
	set CHANGE_KN,13;
	warp "prt_in.gat",80,100;
	end;
}

//============================================================
// final exam and claymore creation
//------------------------------------------------------------
prt_in.gat,87,92,4 script Knight Gray 119,{
	if(Job == Job_Novice) {
		mes "[Knight Gray]";
		mes "It may look this way, but even I had my Novice days." ;
		next;
		mes "[Knight Gray]";
		mes "I never thought of becoming a knight in particular, but I always wanted to be strong." ;
		next;
		mes "[Knight Gray]";
		mes "So I did, and before I knew it, I was a knight. Ha ha." ;
		close;
	}
	if(Job == Job_Knight) { //claimer sold
		mes "[Knight Gray]";
		mes "A blade of indescribably beautiful color..." ;
		mes "If there is a weapon that a knight should have, this is it!" ;
		mes "Yes, the ^3355FF "Claymore"^000000 !!! A knight should have one of these." ;
		next;
		switch (select("^3355FF "Claymore" ^000000 about", "Buy Claymore", "Stop Conversation")) {
		case 1:
			mes "[Knight Gray]";
			mes "The sword Claymore is said to be one of the best among the various great swords that can be obtained in Prontera in the Kingdom of Rune-Midgarts! It is truly a perfect match for the knight." ;
			next;
			mes "[Knight Gray]";
			mes "That reputed Claymore is made for ^3355FF74000^000000Zeny only for the knights in my knighthood." ;
			next;
			mes "[Knight Gray]";
			mes "But we need one precious ^3355FF "Steel"^000000 to build that sturdy and sharp blade that is the Claymore's signature." ;
			mes "As soon as you bring me the production cost and the Steel, I will build it. On the honor of the Order." ;
			close;
		case 2:
			if(countitem(999) < 1 || Zeny < 74000) {
				mes "[Knight Gray]";
				mes "I understand your desire for the claymore, but I can't build it for you if you're not ready." ;
				mes "^3355FF74000Zeny!Steel one! ^000000";
				next;
				mes "[Knight Gray]";
				mes "Come back when you're ready." ;
				mes "I'll always be waiting for you." ;
				close;
			}
			if(checkweight(1163,1)==0) {
				mes "[Knight Gray]";
				mes "Looks like we have a full load";
				close;
			}
			mes "[Knight Gray]";
			mes "Oh! You've got it all ready." ;
			mes "Who knows the value of a claymore." ;
			mes "Yo... I'll make you one right now!" ;
			next;
			mes "[Knight Gray]";
			mes "Heat the claymore blade, melt the Steel and mix it..." ;
			next;
			mes "^3355FF- kakin kakin kakin -^000000";
			next;
			mes "[Knight Gray]";
			mes "Look, the pride of the Order, the Claymore!" ;
			mes "It will be a reliable partner in your future travels!" ;
			delitem 999,1;
			set Zeny,Zeny-74000;
			getitem 1163,1;
			close;
		case 3:
			mes "[Knight Gray]";
			mes "A good knight should be able to use a claymore like a limb." ;
			mes "I hope you'll come back again someday." ;
			close;
		}
	}
	switch(CHANGE_KN) {
	case 0:
		mes "[Knight Gray]";
		mes "Young man, time is of the essence." ;
		next;
		mes "[Knight Gray]";
		mes "Because after time, it's too late to start regretting what you've done." ;
		close;
	default:
		mes "[Knight Gray]";
		mes "What can I do for you, young swordsman?" ;
		break;
	case 13:
		mes "[Knight Gray]";
		mes "Ah, it's you. What do you want?" ;
		break;
	case 14:
		mes "[Knight Gray]";
		mes "Listen to the Knight Commander." ;
		next;
		mes "[Knight Gray]";
		mes "They'll think it over too." ;
		mes "[Knight Gray]"; mes "[Knight Gray]"; mes "[Knight Gray]"; mes "[Knight Gray]" ;
		close;
	}
	next;
	if(select("I would like to take the Knight job change exam", "Nothing")==2) {
		mes "[Knight Gray]";
		mes "Take care of yourself." ;
		mes "Health comes first." ;
		close;
	}
	switch(CHANGE_KN) {
	default:
		mes "[Knight Gray]";
		mes "Haha, there are much younger knights here than me. Talk to them first before you come." ;
		next;
		mes "[Knight Gray]";
		mes "I'll take care of them when you're done talking to them." ;
		close;
	case 12:
		mes "[Knight Gray]";
		mes "Oh, yeah. You've taken all the other guys' exams." ;
		next;
		mes "[Knight Gray]";
		mes "Then let's start my exam." ;
		mes "Well, it's not really an exam." ;
		next;
		mes "[Knight Gray]";
		mes "Let's take it easy and talk." ;
		break;
	case 13:
		mes "[Knight Gray]";
		mes "Well... You've been doing a lot of thinking." ;
		next;
		mes "[Knight Gray]";
		mes "So let's hear more of what you have to say." ;
		break;
	}
	next;
	mes "[Knight Gray]";
	mes "First... Why did you decide to become a Knight?" ;
	next;
	switch(select("to become stronger", "to be useful to the guild", "I'm not satisfied with my current situation")) {
	case 1:
		mes "[Knight Gray]";
		mes "To be stronger...?" ;
		mes "Indeed Knight is strong." ;
		next;
		mes "[Knight Gray]";
		mes "But what is that strength?" ;
		mes "Is it to show off your strength to others, or to be famous, or something else..." ;
		next;
		mes "[Knight Gray]";
		mes "What is 'power' as a knight?" ;
		next;
		switch(select("for arms and prestige", "to be able to protect myself", "to protect others")) {
		case 1:
			set '@bad,'@bad+10;
			mes "[Knight Gray]";
			mes "Of course, getting money and being famous is a good thing." ;
			mes "But our knights live to get value that is not so." ;
			break;
		case 2:
			mes "[Knight Gray]";
			mes "Good answer. Anyone who can protect himself can also protect others." ;
			mes "To do so, you must not neglect your training on a regular basis." ;
			break;
		case 3:
			mes "[Knight Gray]";
			mes "It is a noble idea. A knight's power is only effective when he protects the weak. Sometimes there are those who abandon that spirit and bring dishonor to the name of knight..." ;
			break;
		}
		break; }
	case 2:
		mes "[Knight Gray]";
		mes "Guild... or working with a party..." ;
		mes "Our king, Tristan III, also said the following..." ;
		next;
		mes "[Knight Gray]";
		mes "Behind every peaceful day, there is always a threat. Therefore, we must be prepared in advance for every crisis..."; next; mes "[Knight Gray]"; mes And." ;
		next;
		mes "[Knight Gray]";
		mes "So how does the power you gain help the guild?" ;
		next;
		switch(select("The Guild needs my power", "I can help the Guild secure funding", "I can protect the Guild Members")) {
		case 1:
			mes "[Knight Gray]";
			mes "Wherever you are in the world, you want to be where you want to be." ;
			mes "But as long as there are those who need our help, we must not refuse." ;
			mes "[Knight Gray]; mes "Not only in guilds..." ;
			break;
		case 2:
			set '@bad,'@bad+10;
			mes "[Knight Gray]";
			mes "Of course, getting money and being famous is a good thing." ;
			mes "But our knights live to get value that is not so." ;
			break;
		case 3:
			mes "[Knight Gray]";
			mes "It is a noble idea. A knight's power is only effective when he protects the weak. Sometimes there are those who abandon that spirit and bring dishonor to the name of knight..." ;
			break;
		}
		break; }
	case 3:
		set '@bad,'@bad+5;
		mes "[Knight Gray]";
		mes "Hmmm..." ;
		mes "You're already a fine swordsman, but why do you still want to be a knight?" ;
		next;
		mes "[Knight Gray]";
		mes "A swordsman may be a swordsman, but a knight is never allowed to be selfish." ;
		mes "Sometimes, some young men lose their inhibitions because of their desire for power." ;
		next;
		mes "[Knight Gray]";
		mes "So what are you not satisfied with now?" ;
		next;
		switch(select("It's the technology", "It's the goal", "It's the outfit")) {
		case 1:
			set '@bad,'@bad+5;
			mes "[Knight Gray]";
			mes "Technology will follow itself when you become a Knight." ;
			mes "So it will not be of high value in itself. You will probably not be satisfied with becoming a Knight." ;
			break;
		case 2:
			set '@bad,'@bad-5;
			mes "[Knight Gray]";
			mes "Well... It's important to constantly embrace new goals." ;
			mes "You're probably preoccupied with becoming a Knight right now, but after you become a Knight, you'll have new goals again." ;
			break;
		case 3:
			set '@bad,'@bad+5;
			mes "[Knight Gray]";
			mes "Oh no, it's not worth much, just for looks." ;
			mes "Some swordsmen are stronger than Knight, which means it depends on your effort." ;
			break;
		}
		break;
	}
	} next;
	mes "[Knight Gray]";
	mes "Hmm, you've thought this through." ;
	mes "Some people try to be Knight without thinking..." ;
	next;
	mes "[Knight Gray]";
	mes "Such young people cause problems and bring dishonor to the Knight Order..." ;
	next;
	mes "[Knight Gray]";
	mes "This goes for you too, but once you become a Knight, you can never go back to being a swordsman again." ;
	mes "You must never forget your awareness and responsibility as a Knight." ;
	next;
	mes "[Knight Gray]";
	mes "If you could be a Knight right now, what would you do?" ;
	next;
	switch(select("I would go to battle immediately", "I would go to those who wait for me", "I would learn more about knighthood")) {
	case 1:
		mes "[Knight Gray]";
		mes "Hm, and?" ;
		next;
		switch(select("I will grow up fast", "I want to test my skills as a Knight", "I will go where I cannot go as a swordsman")) {
		case 1:
			set '@bad,'@bad+10;
			mes "[Knight Gray]";
			mes "Not in too much of a hurry." ;
			mes "You yourself won't necessarily grow up too fast." ;
			mes "[Knight Gray]"; mes "It is better to lay a solid foundation." ;
			break;
		case 2:
			mes "[Knight Gray]";
			mes "It's good to test yourself." ;
			mes "It's good to rejoice about the skills you've acquired, but don't forget to be a knight." ;
			break;
		case 3:
			mes "[Knight Gray]";
			mes "Becoming a Knight does not change the essence of the guy." ;
			mes "Don't overwork your body too much." ;
			break;
		}
		break;
	case 2:
		mes "[Knight Gray]";
		mes "Who's waiting for me?" ;
		next;
		switch(select("It's a friend", "It's the Guild Members", "It's a lover")) {
		case 1:
			mes "[Knight Gray]";
			mes "Mm, your friends will be as happy to see you become Knight as you are." ;
			mes "Don't forget to take care of your friends." ;
			break;
		case 2:
			mes "[Knight Gray]";
			mes "Fellowship of life and death." ;
			mes "Take care of your friends and protect them." ;
			break;
		case 3:
			mes "[Knight Gray]";
			mes "You are a youth! What a way to become a Knight for the one you love." ;
			mes "With everything you have";
			mes (Sex? "She": "Boyfriend")+ "Protect her." ;
			break;
		}
		break; }
	case 3:
		mes "[Knight Gray]";
		mes "Good attitude. What do you learn?" ;
		next;
		switch(select("Places where Knight is easy to fight", "How to grow as a Knight", "How to earn income as a Knight")) {
		case 1:
			set '@bad,'@bad+5;
			mes "[Knight Gray]";
			mes "There are various easy and hard places in the world." ;
			mes "Knight must stay strong in any place." ;
			break;
		case 2:
			mes "[Knight Gray]";
			mes "If you go outside, you will see Knight." ;
			mes "Ask the senior knights for more information." ;
			break;
		case 3:
			set '@bad,'@bad+15;
			mes "[Knight Gray]";
			mes "Hey! What do you think you are, a knight?" ;
			mes "That's not what knights are!" ;
			break;
		}
		break;
	}
	} next;
	mes "[Knight Gray]";
	mes "Oh... That was a very long story." ;
	next;
	if('@bad > 10) {
		set CHANGE_KN,13;
		mes "[Knight Gray]";
		mes "I was bored talking to you." ;
		mes "You're not ready to be Knight yet." ;
		next;
		mes "[Knight Gray]";
		mes "You should learn a few more things at Swordsman." ;
		mes "If you really want to be a Knight, you will need to change yourself." ;
		close;
	}
	set CHANGE_KN,14;
	mes "[Knight Gray]";
	mes "I enjoyed talking with you." ;
	mes ""+'@bad?""; mes "There were a few things that bothered me." : "You reminded me of my younger days, man." ;
	next;
	mes "[Knight Gray]";
	mes "So let's hear what the Knight Commander has to say and let the guys decide." ;
	next;
	mes "[Knight Gray]";
	mes "Don't worry too much." ;
	mes "[Knight Gray]"; mes "I'll talk to him a lot." ;
	close;
}

//============================================================
// Peko Peko Rentals.
//------------------------------------------------------------
prontera.gat,55,350,5 script PecoPeco Manager 105,{
	if(Job ! = Job_Knight) {
		mes "[PecoPeco Manager]";
		mes "What can I do for you?" ;
		mes "PecoPeco is for Knight and Lord Knight only." ;
		close;
	}
	mes "[PecoPeco Manager]";
	mes "Welcome." ;
	mes "Shall I prepare one PecoPeco for you?" ;
	mes "2500 zeny per animal." ;
	next;
	if(select("use", "quit")==2) {
		mes "[PecoPeco Manager]";
		mes "I see. Then ......." ;
		close;
	}
	if(checkriding()) {
		mes "[PecoPeco Manager]";
		mes "You are already on PecoPeco." ;
		close;
	}
	if(Zeny < 2500) {
		mes "[PecoPeco Manager]";
		mes "Um, I'm afraid you don't have enough money. ......" ;
		mes "...... Are you bankrupt ......?" ;
		close;
	}
	if(getskilllv(63) < 1) {
		mes "[PecoPeco Manager]";
		mes "...... It looks like you can't get on PecoPeco yet." ;
		mes "Please learn the skill 'Riding' before coming." ;
		close;
	}
	set Zeny,Zeny-2500;
	setriding;
	close;
}
