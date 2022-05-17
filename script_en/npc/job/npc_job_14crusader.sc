//====================================================================
//Ragnarok Online Crusader jobchange script
// - CHANGE_CRU -> 0-10
// - CHANGE_CRU -> 0-10
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

prt_castle.gat,45,169,4 script Master Crusader 752,{
	if(Job == Job_Crusader) {
		mes "[Michael Halig]";
		mes "Are you a crusader?" ;
		mes "Do not stay here, but train yourself." ;
		mes "[Michael Halig]"; mes "For those who train themselves, the light of victory will shine." ;
		next;
		mes "[Michael Halig]";
		mes "We do not know when the crisis of the world will come. Train yourself diligently until the day when Odin's will is carried out and the demons are vanquished, and the ideal world of us mortals is built." ;
		close;
	}
	switch(CHANGE_CRU) {
	case 0:
		mes "[Michael Halig]";
		mes "We are Crusader."
		mes "We are those who prepare for the Holy War by Odin's will." ;
		if(Upper == UPPER_HIGH) {
			next;
			mes "[Michael Halig]";
			mes "One day, as a thousand years ago, we will again defeat the demon tribe. ......" ;
			next;
			mes "[Michael Halig]";
			mes "You are not the one who should be here." ;
			mes "[Michael Halig]"; mes "Train thyself without neglect." ;
			close;
		}
		if(Job == Job_Novice) {
			next;
			mes "[Michael Halig]";
			mes "If you wish to join us, come well trained as a swordsman ......" ;
			close;
		}
		if(Job ! = Job_Swordman) {
			next;
			mes "[Michael Halig]";
			mes "One day we will defeat the demon tribe again, as we did a thousand years ago: ......" ;
			close;
		}
		mes "What did you come to visit me about?";
		next;
		if(select("I want to join the crusade too", "It's nothing")==2) {
			mes "[Michael Halig]";
			mes "If you too are a sword wielder, practice constant discipline." ;
			mes "No one knows the time of the Holy War." ;
			next;
			mes "[Michael Halig]";
			mes "There may come a time when Odin's voice will reach you, even if you don't understand it now." ;
			close;
		}
		mes "[Michael Halig]";
		mes "You say you want to be a Crusader?" ;
		mes "[Michael Halig]"; mes "It's not that easy to walk with us." ;
		next;
		mes "[Michael Halig]";
		mes "I am Michael Halig."
		mes "I am one of those who prepare for the Holy War." ;
		mes "We train ourselves constantly under a thick trust and endless loyalty." ;
		next;
		mes "[Michael Halig]";
		mes "We select the most dependable of swordsmen from the most dependable of swordsmen, and we encourage anyone born a warrior by Odin's will to join us." ;
		next;
		mes "[Michael Halig]";
		mes "In particular, the Swordsman with the ^3152FF Mark of Loyalty^000000 and the ^3152FF Stigmata^000000 has been given the qualities of a Crusader from the heavens." ;
		mes "Such a swordsman can become a Crusader if he overcomes certain trials." ;
		next;
		mes "[Michael Halig]";
		mes "I still have no idea what qualities you possess." ;
		mes "Would you like to try the ordeal once?" ;
		next;
		if(select("Yes, I'll try", "Let me think about it")==2) {
			mes "[Michael Halig]";
			mes "I see." ;
			mes "Come well prepared." ;
			next;
			mes "[Michael Halig]";
			mes "As soon as you hear Odin's voice, come to be tested." ;
			close;
		}
		if(JobLevel < 40) {
			mes "[Michael Halig]";
			mes "Sorry to hear that ......" ;
			mes "You have to get your JobLv above 40 before you can become a Crusader." ;
			next;
			mes "[Michael Halig]";
			mes "Train a little more as a Swordsman and wait for Odin's call." ;
			mes "I approve of your mettle, ......." ;
			close;
		}
		if(SkillPoint) {
			mes "[Michael Halig]";
			mes "umm ...... Looks like you still have some skills left to acquire as a swordsman. Come back when you have mastered the other skills." ;
			close;
		}
		mes "[Michael Halig]";
		mes "Then let us see if you are worthy of being a Crusader." ;
		mes "The name is " +strcharinfo(0)+ "or." ;
		next;
		if(countitem(1004) && countitem(1009)) //when in possession of the proof of loyalty and the sacrament
			break;
		mes "[Michael Halig]";
		mes "umm ......" ;
		mes "I'm not sure how good a Crusader you are. ......" ;
		mes "But I can feel your will." ;
		mes "Prove it by working hard." ;
		next;
		mes "[Michael Halig]";
		mes "You will collect these things." ;
		set CHANGE_CRU,rand(1,3);
		switch(CHANGE_CRU) {
			case 1:
				mes "^3152FF deceased claws^000000 10 ^3152FF wedged scales^000000 10 ^3152FF tattered prison uniform^000000 10 ^3152FF pigtail ribbons^000000 10";
				break;
			case 2:
				mes "^3152FF skeleton^000000 10 pieces^3152FF oak claws^000000 10 pieces^3152FF handcuffs^000000 10 pieces^3152FF short pigtail ribbons^000000 10 pieces";
				break;
			case 3:
				mes "^3152FF fangs of the deceased^000000 10 ^3152FF wedged bandages^000000 10 ^3152FF lanterns^000000 10 ^3152FF pumpkin heads^000000 10";
				break;
		}
		next;
		mes "[Michael Halig]";
		mes "Depending on your efforts, I will decide whether or not to have you take the ordeal to Crusader." ;
		mes "Then go ahead and go." ;
		mes "[Michael Halig]"; mes "May the blessings of Odin be upon you." ;
		close;
	case 1:
	case 2:
	case 3:
		mes "[Michael Halig]";
		mes "Are you the one who heard Odin's voice?" ;
		mes "Or have you come to prove your efforts?" ;
		next;
		if(countitem(1004) && countitem(1009)) //when in possession of a token of loyalty and a sacrament
			break;
		switch(CHANGE_CRU) {
			case 1: setarray '@need,957,959,1099,901; break
			case 2: setarray '@need,932,1043,1098,1094; break
			case 3: setarray '@need,958,930,1041,1062; break
		}
		for(set '@i,0; '@i<4; set '@i,'@i+1) {
			if(countitem('@need['@i]) < 10) {
				mes "[Michael Halig]";
				mes "Looking at you, I don't see the qualities of a Crusader yet." ;
				mes "If you want to show me your will, show me your effort." ;
				next;
				mes "[Michael Halig]";
				mes "You will collect these things." ;
				for(set '@i,0; '@i<4; set '@i,'@i+1)
					mes "^3152FF" +getitemname('@need['@i])+ "^000000 10 pieces";
				next;
				mes "[Michael Halig]";
				mes "I'd like to see a little more effort." ;
				mes "Then go ahead and go." ;
				mes "May Odin's blessing be upon you." ;
				close;
			}
		}
		mes "[Michael Halig]";
		mes "Good! You made an effort!" ;
		mes "I acknowledge your efforts and allow you to take the trials to Crusader." ;
		next;
		mes "[Michael Halig]";
		mes "Meet Murnak Mijoul." ;
		mes "He is here in the underground prison of Prontera Castle." ;
		mes "[Michael Halig]"; mes "First you must meet him and talk to him." ;
		next;
		mes "[Michael Halig]";
		mes "He will tell you what you need to do." ;
		mes "[Michael Halig]"; mes "Come back to me again when all your trials are over." ;
		for(set '@i,0; '@i<4; set '@i,'@i+1)
			delitem '@need['@i],10;
		set CHANGE_CRU,4;
		close;
	default: //when 4 to 9
		mes "[Michael Halig]";
		mes "You have not yet accomplished all the trials." ;
		mes "I don't even know if you have what it takes to be a Crusader right now." ;
		next;
		mes "[Michael Halig]";
		mes "Come back after you have accomplished all your trials." ;
		mes "I will make an evaluation then." ;
		close;
	case 10:
		if(SkillPoint) {
			mes "[Michael Halig]";
			mes "umm ...... Looks like you still have some skills left to acquire as a swordsman. Come back when you have mastered other skills." ;
			close;
		}
		mes "[Michael Halig]";
		mes "You have survived all the trials!" ;
		mes "Admirable." ;
		mes "[Michael Halig]"; mes "You are now ready, body and soul, for the holy war with us." ;
		next;
		mes "[Michael Halig]";
		mes "Congratulations." ;
		mes "Now you are reborn as one of our comrades." ;
		set '@amount,(JobLevel >= 50)? 12: 6;
		unequip;
		jobchange Job_Crusader;
		set CHANGE_CRU,0;
		next;
		mes "[Michael Halig]";
		mes "And this is good to use if you have an emergency: ......." ;
		mes "It will give us Crusader the strength to fight once more." ;
		getitem 504,'@amount;
		next;
		mes "[Michael Halig]";
		mes "Always keep in mind that the Holy War is coming, and continue your training." ;
		mes "May Odin bless you." ;
		mes "Then go!" ;
		close;
	}
	mes "[Michael Halig]";
	mes "Ummm ......" ;
	mes "I think I've caught a glimpse of the Crusader qualities in you." ;
	mes "But that's not enough to know yet. You will be tested." ;
	next;
	mes "[Michael Halig]";
	mes "See Murnak Mijoul." ;
	mes "He is here in the underground prison of Prontera Castle." ;
	mes "[Michael Halig]"; mes "First you must meet him and talk to him." ;
	next;
	mes "[Michael Halig]";
	mes "He will tell you what you need to do." ;
	mes "[Michael Halig]"; mes "Come back to me again when all your trials are over." ;
	delitem 1004,1;
	delitem 1009,1;
	set CHANGE_CRU,4;
	close;
}


//==========================================
// First test (patience test)
//------------------------------------------

prt_castle.gat,164,32,0 script Sufferer 733,{
	if(Job == Job_Novice) {
		mes "[Murnak Mijoul]";
		mes "Is it Novice ......" ;
		mes "I am not a bad person." ;
		next;
		mes "[Murnak Mijoul]";
		mes "I am in here to train myself." ;
		close;
	}
	if(Job == Job_Crusader) {
		mes "[Murnak Mijoul]";
		mes "Don't stop here, move forward." ;
		mes "Until the day we all pick up our swords and fight: ......" ;
		close;
	}
	if(Job ! = Job_Swordman) {
		mes "[Murnak Mijoul]";
		mes "Distracted." ;
		next;
		mes "[Murnak Mijoul]";
		mes "Please do not interfere with my practice." ;
		close;
	}
	switch(CHANGE_CRU) {
	default: //when 0 to 3
		mes "[Murnak Mijoul]";
		mes "What is it?" ;
		mes "If you have no special need, please leave here ......" ;
		mes "I am in training, and what I need more than anything else is tranquility." ;
		next;
		mes "[Murnak Mijoul]";
		mes "I must always maintain a sense of normalcy for the holy war that will one day be upon us." ;
		mes "Therefore, please take your seats." ;
		close;
	case 4:
		mes "[Murnak Mijoul]";
		mes "What can I do for you?" ;
		mes "What can I do for you during your training?" ;
		next;
		if(select("I want to become a Crusader", "Nothing")==2) {
			mes "[Murnak Mijoul]";
			mes "Are you free?" ;
			mes "Don't play around here, go out front and pick up some zero peas." ;
			close;
		}
		mes "[Murnak Mijoul]";
		mes "Are you an aspiring Crusader? ......" ;
		mes "Unusual ......" ;
		mes "My name is Murnak Mijoul and I am one of the people preparing for the Crusade." ;
		next;
		mes "[Murnak Mijoul]";
		mes "My name is ......." ;
		mes ""+strcharinfo(0)+ "is it?"" ;
		mes "Please show yourself well." ;
		next;
		if(equippeditem(2608) < 1) { //Rosalie unequipped
			mes "[Murnak Mijoul]";
			mes "But!" ;
			mes "How is it that a would-be Crusader is not even wearing Rosalie?" ;
			mes "I have nothing to say to a person with such a mindset." ;
			next;
			mes "[Murnak Mijoul]";
			mes "Go outside." ;
			close;
		}
		mes "[Murnak Mijoul]";
		mes "I see. ......" ;
		mes "Preparedness is good." ;
		mes "It doesn't make you a Crusader, though." ;
		next;
		mes "[Murnak Mijoul]";
		mes "So let's see how patient you are first." ;
		mes "Crusader needs a strong mentality to endure things." ;
		next;
		mes "[Murnak Mijoul]";
		mes "Let's get started right away." ;
		mes "What, it's not too difficult." ;
		mes "Just follow the path to the end. ......" ;
		next;
		mes "[Murnak Mijoul]";
		mes "There is one thing you should keep in mind." ;
		mes "Do not kill the monsters no matter what." ;
		next;
		mes "[Murnak Mijoul]";
		mes "Then go." ;
		break;
	case 5:
		mes "[Murnak Mijoul]";
		mes "What is your business, O swordsman who was just here?" ;
		mes "Hmmm ...... Did you fail ......?" ;
		next;
		if(select("Let me try again", "What kind of ordeal is this?") ==2) {
			mes "[Murnak Mijoul]";
			mes "...... Hmm?" ;
			mes "It looks like you don't like my ordeal." ;
			mes "I don't want people like you to join me in preparing for the Holy War." ;
			next;
			mes "[Murnak Mijoul]";
			mes "Do not speak to me until you come to change your mind." ;
			close;
		}
		mes "[Murnak Mijoul]";
		mes "I will let you try again and again." ;
		mes "But if you fail, it means there is something wrong with your mind." ;
		next;
		if(equippeditem(2608) < 1) { //Rosalie unequipped
			mes "[Murnak Mijoul]";
			mes "Did you leave Rosalie somewhere again?" ;
			mes "We who have Odin's blessing must not treat Rosalie poorly." ;
			next;
			mes "[Murnak Mijoul]";
			mes "If you just swing your sword without thinking, you are not so different from a monster." ;
			mes "If you want to challenge the ordeal, first go and learn Rosalie to prepare yourself." ;
			close;
		}
		mes "[Murnak Mijoul]";
		mes "You usually draw your sword as soon as you see a monster ....... I guess I haven't gotten out of that habit." ;
		mes "Remember that it is your patience that I see." ;
		next;
		mes "[Murnak Mijoul]";
		mes "Then again, just follow the path and reach the end." ;
		next;
		mes "[Murnak Mijoul]";
		mes "Do not defeat the monsters no matter what." ;
		mes "Keep that in mind as you proceed." ;
		next;
		mes "[Murnak Mijoul]";
		mes "Then we will begin." ;
		break;
	case 6:
		mes "[Murnak Mijoul]";
		mes "Okay, good." ;
		mes "How was it? It wasn't too hard, was it?" ;
		mes "No more talking from me." ;
		next;
		mes "[Murnak Mijoul]";
		mes "You should see Gabriel Valentine at the Prontera Cathedral." ;
		mes "He will give you the next ordeal." ;
		mes "So long." ;
		close;
	case 7:
	case 8:
	case 9:
	case 10:
		mes "[Murnak Mijoul]";
		mes "You can't be selling oil in a place like this." ;
		close;
	}
	//continued from 5,6
	close2;
	warp "job_cru.gat",98,40;
	if(getnpctimer(1, "#CRU_1stTest") == 0) { //move timer if it's stopped
		donpcevent "#CRU_1stTest::OnStart";
		for(set '@i,0; '@i<3 ; set '@i,'@i+1)
			awake "#CRU_1stTest";
	}
	end;
}

//==============================================================
job_cru.gat,0,0,0 script #CRU_1stTest -1,{
	end;
OnTimer150000:
	if(getareausers("job_cru.gat",90,34,105,105) == 0) { //Write off mob if nobody is there
		for(set '@i,0; '@i<3 ; set '@i,'@i+1)
			awake "#CRU_1stTest";
		killmonster "job_cru.gat", "All";
		stopnpctimer;
		end;
	}
OnStart:
	initnpctimer;
	killmonster "job_cru.gat", "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,50, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,55, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,60, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,65, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,70, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,75, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,80, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,85, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	monster "job_cru.gat",98,90, "Familiar",1005,1, "#CRU_1stTest::OnKilled1";
	sleep 50000;
	killmonster "job_cru.gat", "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",94,45, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",101,45, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",94,55, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",101,55, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",94,65, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",101,65, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",94,75, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",101,75, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",94,85, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",101,85, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",94,95, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	monster "job_cru.gat",101,95, "mandragora",1020,1, "#CRU_1stTest::OnKilled2";
	sleep 50000;
	killmonster "job_cru.gat", "#CRU_1stTest::OnKilled3";
	monster "job_cru.gat",98,50, "Flora",1118,1, "#CRU_1stTest::OnKilled3";
	monster "job_cru.gat",92,60, "Flora",1118,1, "#CRU_1stTest::OnKilled3";
	monster "job_cru.gat",104,60, "Flora",1118,1, "#CRU_1stTest::OnKilled3";
	monster "job_cru.gat",98,70, "Flora",1118,1, "#CRU_1stTest::OnKilled3";
	monster "job_cru.gat",92,80, "Flora",1118,1, "#CRU_1stTest::OnKilled3";
	monster "job_cru.gat",104,80, "Flora",1118,1, "#CRU_1stTest::OnKilled3";
	monster "job_cru.gat",98,90, "Flora",1118,1, "#CRU_1stTest::OnKilled3";
	sleep 50000;
	killmonster "job_cru.gat", "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",90,50, "Tianxia Daishogun",1277,1, "#CRU_1stTest::OnKilled4"; sleep 50000; killmonster "job_cru.gat",90,50, "Tianxia Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",105,50, "Tenka Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",98,60, "Tenka Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",90,70, "Tenka Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",105,70, "Tenka Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",98,80, "Tenka Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",90,90, "Tenka Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	monster "job_cru.gat",105,90, "Tenka Daishogun",1277,1, "#CRU_1stTest::OnKilled4";
	end;
OnKilled1:
OnKilled2:
OnKilled3:
OnKilled4:
	warp "prt_fild05.gat",353,251;
	end;
}

job_cru.gat,98,105,0 script #CRU_1stWarp 45,1,1,{
	set CHANGE_CRU,6;
	warp "prt_castle.gat",164,28;
	end;
}


//==========================================
// Secondary examination (written test)
//------------------------------------------

prt_church.gat,95,127,4 script Crusader 745,{
	switch(CHANGE_CRU) {
	case 0:
		mes "[Gabriel Valentine]";
		mes "Welcome." ;
		mes "I am Crusader." ;
		mes "I am preparing for the holy war that will one day come." ;
		next;
		if(Job == Job_Novice) {
			mes "[Gabriel Valentine]";
			mes "If you are interested in Crusader, train as a swordsman." ;
			mes "Please come back to us when you feel you have gained some training as a fencer on your own." ;
			next;
			mes "[Gabriel Valentine]";
			mes "We are serving at Prontera Castle." ;
			mes "Why not stop by for a visit?" ;
			close;
		}
		if(Job == Job_Crusader) {
			mes "[Gabriel Valentine]";
			mes "Welcome, Mr. Crusader." ;
			mes "I see that you have been training well." ;
			next;
			mes "[Gabriel Valentine]";
			mes "Be well prepared for the Holy War that will come one day. ......" ;
			close;
		}
		if(Job ! = Job_Swordman) {
			mes "[Gabriel Valentine]";
			mes "You should always train yourself and prepare for the future." ;
			close;
		}
		mes "[Gabriel Valentine]";
		mes "If you want to become a Crusader, visit our master in the castle of Prontera." ;
		close;
	default: //if 1 to 5
		mes "[Gabriel Valentine]";
		mes "You are a candidate for a job change to Crusader, aren't you?" ;
		mes "You have not yet completed the ordeal to the stage of meeting me." ;
		next;
		mes "[Gabriel Valentine]";
		mes "Please come again after you have completed the other ordeals." ;
		mes "We are waiting for you." ;
		mes "Then please visit ......." ;
		close;
	case 6:
		mes "[Gabriel Valentine]";
		mes "Welcome." ;
		mes "You have passed the test of patience." ;
		mes "I will be in charge of the next ordeal." ;
		next;
		mes "[Gabriel Valentine]";
		mes "My name is Gabriel Valentine."
		mes "I am one of those who are preparing for the Holy War." ;
		mes "Here at the cathedral, I am on duty as a clergy escort." ;
		next;
		mes "[Gabriel Valentine]";
		mes "I will see if you have enough knowledge to be a Crusader." ;
		mes "Simply wielding a sword is not enough to win a crusade." ;
		next;
		mes "[Gabriel Valentine]";
		mes "Then I will give you 10 problems." ;
		mes "Listen carefully and give the correct answers." ;
		set CHANGE_CRU,7;
		break;
	case 7:
		mes "[Gabriel Valentine]";
		mes "Welcome." ;
		mes "Are you all set?" ;
		next;
		mes "[Gabriel Valentine]";
		mes "We will give you 10 problems again." ;
		mes "Please listen carefully and give the correct answers." ;
		break;
	case 8:
	case 9:
		mes "[Gabriel Valentine]";
		mes "As I said, head on to the next ordeal." ;
		next;
		mes "[Gabriel Valentine]";
		mes "Please meet Master Bliant Piyord at the castle of Prontera." ;
		close;
	case 10:
		mes "[Gabriel Valentine]";
		mes "What are you doing here?" ;
		mes "You should have completed all the trials." ;
		mes "Why don't you meet the Master Commander?" ;
		next;
		mes "[Gabriel Valentine]";
		mes "You are just a few steps away from becoming a Crusader." ;
		mes "So you will be one of us." ;
		mes "Keep up the training even after you change jobs." ;
		close;
	}
	//written test here
	next;
	switch(rand(3)) {
	case 0:
		mes "[Gabriel Valentine]";
		mes "1. What is the most effective attribute attack on the undes?" ;
		next;
		if(select("no attribute", "earth attribute", "undead attribute", "holy attribute")==4)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "2. When the monster is undead attribute lvl 2, what is the damage done by the holy attribute attack?" ;
		next;
		if(select("125%", "150%", "175%", "200%")==3)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "3. Which of the following items cannot be obtained from the Evil Druid?" ;
		next;
		if(select("Clergyman's Hat", "Leaves of Ygdrasil", "White Herb", "Returned Souls Bills")==1)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "4. Which of the following undead has the highest HP?" ;
		next;
		if(select("ghoul", "skelprisoner", "wraith", "zombieprisoner")==4)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "5. Which of the following undead are of different sizes?" ;
		next;
		if(select("Wraith", "Carlitzburg", "Drake", "Evil Druid")==3)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "6. Which cards are resistant to undead attribute attacks?" ;
		next;
		if(select("orc skeleton card", "orc zombie card", "ghoul card", "skele worker card")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "7. What was the relationship between Munak and Bongon in the past?" ;
		next;
		if(select("real brother and sister", "like sister and brother in the same village", "brother and sister in law", "unknown")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "8. Choose one of the following undead that does not attack first." ;
		next;
		if(select("Soldier Skeleton", "Orc Skeleton", "Skeleton", "Skele Worker")==3)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "9. What is the name of the shield with the Munak card on it?" ;
		next;
		if(select("Atomic Shield", "Amlet Shield", "Hypnotic Shield", "Homeros Shield")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "10. Which undead do not drop relics of the dead?" ;
		next;
		if(select("Munak", "Ghoul", "Mummy", "Soldier Skeleton")==1)
			set '@point,'@point+10;
		break;
	case 1:
		mes "[Gabriel Valentine]";
		mes "1. Which of the following is a demon race monster with different attributes?" ;
		next;
		if(select("Jester", "Wind Ghost", "Isis", "Wanderer")==3)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "2. Which of the following swords is effective against demon race monsters?" ;
		next;
		//if(select("Dextrose Tsurugi", "Harrod Tsurugi", "Hybrid Tsurugi", "Sidelike Tsurugi")==2) //This mackerel spec
		if(select("Dextrose Tsurugi", "Decursate Tsurugi", "Hybrid Tsurugi", "Sidelike Tsurugi")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "3. Which of the following items does Dokebi not drop?" ;
		next;
		if(select("Elunium Ore", "Golden Mace", "Sword Mace", "Might Staff")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "4. Which of the following monsters has the highest HP?" ;
		next;
		if(select("Gaius", "White Lotus Ball", "Dokebi", "Marionette")==4)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "5. What is the next demon race monster of different sizes?" ;
		next;
		if(select("Ghostling", "Whisper", "Deviruchi", "Baphomet Junior")==1)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "6. Which of the following mufflers is resistant to dark attribute attacks?" ;
		next;
		if(select("Glorious Scarf", "Divine Scarf", "Angelic Scarf", "Mocking Scarf")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "7. What attribute attacks are effective against Wind Ghost?" ;
		next;
		if(select("water attribute", "earth attribute", "fire attribute", "wind attribute")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "8. Which of the following demon race monsters attacks first?" ;
		next;
		if(select("Sohi", "Gaius", "Dokebi", "Whisper")==4)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "9. What is the marionette card's ability?" ;
		next;
		if(select("resistance to dark attacks 30%", "resistance to poison attacks 30%", "resistance to ghost attacks 30%", "resistance to no attacks 30%")==3)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "10. What is the effective way to deal with a demon race monster when you encounter one?" ;
		next;
		if(select("Demon, retreat! and make a contract", "Pour holy water on your weapon and attack", "Wear a child demon hat")==3)
			set '@point,'@point+10;
		break;
	case 2:
		mes "[Gabriel Valentine]";
		mes "1. What is the Divine Protection minimum lvl to get Demonbane?" ;
		next;
		if(select("Lv1", "Lv2", "Lv3", "Lv4")==3)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "2. If BaseLv55 and INT including job weighted value is 30, how much heal Lv5 heals?" ;
		next;
		if(select("396", "440", "484", "528")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "3. How many more defenses from the undead do you have at Divine Protection Lv 7?" ;
		next;
		if(select("21", "22", "23", "24")==1)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "4. Which of the following spears can attack a Knightmare with the Ghost attribute?" ;
		next;
		if(select("Lance", "Partisan", "Crescent Cider", "Zephyrus")==4)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "5. What is the minimum heal lvl to learn the Cure?" ;
		next;
		if(select("Lv1", "Lv2", "Lv3", "Lv4")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "6. What is the attack speed when riding if you learn cavalry training up to Lv3?" ;
		next;
		if(select("70% of normal", "80% of normal", "90% of normal", "100% of normal")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "7. Choose one of the following that differs from the daemonbane description." ;
		next;
		if(select("Increased attack power against undead", "Acolyte only skill", "+30 increase when master", "passive skill")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "8. What is the SP consumption of Heal Lv 7?" ;
		next;
		if(select("30", "31", "33", "35")==2)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "9. What conditions cannot be treated with Cure?" ;
		next;
		if(select("curse", "silence", "confusion", "darkness")==1)
			set '@point,'@point+10;
		mes "[Gabriel Valentine]";
		mes "10.What kind of being is Crusader?";
		next;
		if(select("He who prepares sweets", "He who prepares for the crusade", "He who prepares for the drink", "He who prepares for the potion")==2)
			set '@point,'@point+10;
		break;
	}
	mes "[Gabriel Valentine]";
	mes "Good work." ;
	mes "Then we will let you know the result." ;
	next;
	mes "[Gabriel Valentine]";
	mes ""+strcharinfo(0)+ "Your score is ";
	mes '@point+ "It is a point." ;
	if( (CHANGE_CRU == 6 && '@point < 90) || (CHANGE_CRU == 7 && '@point < 80) ) {
		mes "That was close. ......" ;
		mes "Please study a little more before coming back." ;
		next;
		mes "[Gabriel Valentine]";
		mes "We need a lot of knowledge, so we will wait until you are ready." ;
		mes "Please come back when you feel more confident." ;
		close;
	}
	mes ""+('@point < 100)? "That's good." : "Admirable. ......." ;
	mes "Head on to the next ordeal." ;
	next;
	mes "[Gabriel Valentine]";
	mes "Please meet Master Bliant Piyord at Prontera Castle." ;
	mes "I will inform him to prepare for you." ;
	set CHANGE_CRU,8;
	close;
}


//==========================================
// tertiary test (purification)
//------------------------------------------

prt_castle.gat,35,151,4 script Patron Knight 751,{
	switch(CHANGE_CRU) {
	case 0:
		mes "[Bliant Piyord]";
		mes "I'm here often." ;
		if(Job == Job_Crusader) {
			next;
			mes "[Bliant Piyord]";
			mes "Keep practicing every day and become a great Crusader." ;
			close;
		}
		mes "We are Crusader." ;
		mes "We are those who prepare for the Holy War that will come in the future." ;
		next;
		if(Job == Job_Novice) {
			mes "[Bliant Piyord]";
			mes "If you are interested in Crusader, you are always welcome to join us." ;
			next;
			mes "[Bliant Piyord]";
			mes "If you have some training as a swordsman and have realized Odin's will, you are more than welcome." ;
			close;
		}
		if(Job ! = Job_Swordman) {
			mes "[Bliant Piyord]";
			mes "Even in the midst of peaceful routines, we must constantly be prepared." ;
			mes "For that day that will one day come: ......." ;
			close;
		}
		mes "[Bliant Piyord]";
		mes "If you are interested in joining Crusader, you are always welcome." ;
		next;
		mes "[Bliant Piyord]";
		mes "To become a Crusader, you must train your Swordsman JobLv to 40." ;
		mes "For more information, please ask the master inside." ;
		next;
		mes "[Bliant Piyord]";
		mes "Then may the blessings of Odin be upon you." ;
		close;
	default: //on 1 through 7
		mes "[Bliant Piyord]";
		mes "Well done, my dear." ;
		mes "You are challenging the ordeal to Crusader." ;
		next;
		mes "[Bliant Piyord]";
		mes "But it is still too early for you to take the ordeal from me." ;
		mes "Please come back after you have gone through all the trials from the others." ;
		next;
		mes "[Bliant Piyord]";
		mes "Then we will be waiting for you." ;
		mes "May Odin bless you." ;
		close;
	case 8:
		mes "[Bliant Piyord]";
		mes "Welcome." ;
		mes "Welcome." ;
		mes "The next ordeal is the last ordeal." ;
		next;
		mes "[Bliant Piyord]";
		mes "My name is Bliant Piyord."
		mes "I am one of those who prepare for the Holy War." ;
		mes "You have done well so far." ;
		next;
		mes "[Bliant Piyord]";
		mes "The last ordeal you will get out of me is a real-world training." ;
		mes "As a Crusader, you must also excel in combat." ;
		next;
		mes "[Bliant Piyord]";
		mes "Before taking the ordeal, prepare one ^3152FF holy water^000000." ;
		mes "This is to purify those who are to undergo the ordeal." ;
		next;
		mes "[Bliant Piyord]";
		mes "Shall we begin, then?" ;
		mes "Or shall we prepare?" ;
		set CHANGE_CRU,9;
		break;
	case 9:
		mes "[Bliant Piyord]";
		mes "I'm here often." ;
		mes "You've come prepared, haven't you?" ;
		next;
		mes "[Bliant Piyord]";
		mes "So, would you like to take the trials?" ;
		mes "Or do you want to prepare?" ;
		break;
	case 10:
		mes "[Bliant Piyord]";
		mes "Congratulations!" ;
		mes "You have now completed your ordeal to Crusader." ;
		next;
		mes "[Bliant Piyord]";
		mes "Go to the Master who is inside, and from that time on you will be a part of the Crusade." ;
		close;
	}
	//purification ordeal starts here
	next;
	if(select("I'm going to start", "I'm going to prepare")==2) {
		mes "[Bliant Piyord]";
		mes "I understand." ;
		mes "Please come back when you are ready." ;
		mes "We will be waiting for you." ;
		close;
	}
	if(equippeditem(2608)==0) { //Rosalie not equipped
		mes "[Bliant Piyord]";
		mes "...... Hmm?" ;
		mes "You are not wearing Rosalie, are you?" ;
		mes "You must always wear rosaries when undergoing trials." ;
		next;
		mes "[Bliant Piyord]";
		mes "You must wear the rosary before coming back." ;
		close;
	}
	if(countitem(523) < 1) {
		mes "[Bliant Piyord]";
		mes "Please prepare one ^3152FF holy water^000000 for the ordeal." ;
		mes "As I said before, it is to purify those who are to be tested." ;
		next;
		mes "[Bliant Piyord]";
		mes "Come back again, prepared." ;
		mes "I'll be waiting." ;
		close;
	}
	mes "[Bliant Piyord]";
	mes "Then let's begin." ;
	mes "First we will cleanse you." ;
	delitem 523,1;
	next;
	mes "[Bliant Piyord]";
	mes "......" ;
	next;
	mes "[Bliant Piyord]";
	mes "Then please come in and wait in the waiting room." ;
	mes "You should be able to fight off all the monsters that appear." ;
	close2;
	warp "job_cru.gat",24,169;
	end;
}

//==============================================================
job_cru.gat,24,187,4 script Defending Knight::CRU_ChatRoom 751,{
	mes "[Bliant Piyord]";
	mes "Welcome." ;
	mes "Here you will undergo your final ordeal." ;
	mes "Please enter the anteroom if you wish to begin." ;
	next;
	mes "[Bliant Piyord]";
	mes "Only one person at a time is allowed into the trial hall." ;
	mes "Please wait in the anteroom if others are receiving." ;
	next;
	mes "[Bliant Piyord]";
	mes "There is a time limit of 4 minutes per person, but if you want to stop in the middle of the session, please reconnect once." ;
	close;
OnInit:
	waitingroom "Waiting room",20, "CRU_ChatRoom::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	hideoffnpc "#CRU_3rdTest1";
	hideoffnpc "#CRU_3rdTest2";
	hideoffnpc "#CRU_3rdTest3";
	hideoffnpc "#CRU_3rdTest4";
	hideonnpc "#CRU_3rdWarp";
	warpwaitingpc "job_cru.gat",168,17;
	initnpctimer;
	end;
OnKilled:
	hideoffnpc "#CRU_3rdWarp";
	end;
OnTimer240000:
	OnTimer240000: stopnpctimer;
	areawarp "job_cru.gat",160,14,175,179, "prt_fild05.gat",353,251;
	areakillmonster "job_cru.gat",160,14,175,179;
	enablewaitingroomevent;
	end;
}

//==============================================================
job_cru.gat,168,17,0 script #CRU_Messanger 139,2,2,{
	mes "[Bliant Piyord]";
	mes "As you advance, fight off all enemies that appear." ;
	mes "If you leave even one behind, you fail." ;
	next;
	mes "[Bliant Piyord]";
	mes "Give 4 minutes." ;
	mes "Then go." ;
	close;
}

//==============================================================
job_cru.gat,168,45,0 script #CRU_3rdTest1 139,8,1,{
	monster "job_cru.gat",168,45, "zombie",1015,6;
	hideonnpc;
	end;
}

job_cru.gat,168,80,0 script #CRU_3rdTest2 139,8,1,{
	monster "job_cru.gat",168,80, "soldier skeleton",1028,3;
	hideonnpc;
	end;
}

job_cru.gat,168,110,0 script #CRU_3rdTest3 139,8,1,{
	monster "job_cru.gat",168,105, "Archer skeleton",1016,1;
	monster "job_cru.gat",168,110, "Mummy",1041,1;
	hideonnpc;
	end;
}

job_cru.gat,168,150,0 script #CRU_3rdTest4 139,8,1,{
	monster "job_cru.gat",168,150,strcharinfo(0),1036,1, "CRU_ChatRoom::OnKilled";
	hideonnpc;
	end;
}

job_cru.gat,168,180,0 script #CRU_3rdWarp 45,1,1,{
	if(getareamobs("job_cru.gat",160,14,175,179) == 0)
		set CHANGE_CRU,10;
	warp "prt_castle.gat",35,147;
	areakillmonster "job_cru.gat",160,14,175,179;
	enablewaitingroomevent "CRU_ChatRoom";
	end;
}


//==========================================
// Peko Peko Rental
//------------------------------------------

prontera.gat,232,318,3 script PecoPeco Manager 105,{
	if(Job ! = Job_Crusader) {
		mes "[PecoPeco Manager]";
		mes "What are you here for, our PecoPeco is dedicated to Crusader." ;
		close;
	}
	mes "[PecoPeco Manager]";
	mes "Welcome,";
	mes (Upper == UPPER_HIGH)? "Dear Paladin." : "Dear Crusader." ;
	mes "We have a special peculiar peculiar for you." ;
	mes "We will lend them to you for 3500 Zeny each." ;
	next;
	if(select("use", "quit")==2) {
		mes "[PecoPeco Manager]";
		mes "Copy";
		close;
	}
	if(checkriding()) {
		mes "[PecoPeco Manager]";
		mes "You are already on PecoPeco." ;
		close;
	}
	if(Zeny < 3500) {
		mes "[PecoPeco Manager]";
		mes "There is insufficient money." ;
		mes "Please prepare 3500 Zeny." ;
		close;
	}
	if(getskilllv(63) < 1) {
		mes "[PecoPeco Manager]";
		mes "Please go train to ride PecoPeco first." ;
		close;
	}
	set Zeny,Zeny-3500;
	setriding;
	close;
}
