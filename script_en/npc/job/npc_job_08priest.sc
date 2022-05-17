//====================================================================
//Ragnarok Online Priest Jobchange Script
// - CHANGE_PR -> 0-9
// - CHANGE_PR -> 0-9
// @priest_check -> 0-8, the flag for the third stage of the retreat training
//====================================================================

//==========================================
// test acceptance and job change
//------------------------------------------

prt_church.gat,16,41,4 script bishop 60,{
	if(Upper == UPPER_HIGH) {
		mes "[Bishop Thomas]";
		mes "You are the one who is born again and has a new life, aren't you?" ;
		mes "The Cathedral of Prontera is also watching over you." ;
		next;
		mes "[Bishop Thomas]";
		mes "Do not be afraid of the trials that abound in the world." ;
		mes "You have the courage and strength to overcome them." ;
		mes "God bless you. ......" ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Bishop Thomas]";
		mes "God bless you..." ;
		mes "This is Prontera Cathedral." ;
		mes "What brings you here?" ;
		next;
		switch (select("I want to move to Acolyte", "I want to move to Priest", "I came to see the sights")) {
		case 1:
			mes "[Bishop Thomas]";
			mes "Hoho. You've come to make a career change to Acolyte." ;
			mes "For your new job at Acolyte, please go to the other side of the room...." ;
			break;
		case 2:
			mes "[Bishop Thomas]";
			mes "Hoho... . before you become Priest, you must first become Acolyte." ;
			mes "To change to Acolyte, please go to the other side of the room..." ;
			break;
		case 3:
			mes "[Bishop Thomas]";
			mes "Think of it as home and make yourself comfortable." ;
			mes "The cathedral is safer than anywhere else in the world." ;
			break;
		}
		next;
		mes "[Bishop Thomas]";
		mes "God bless you." ;
		close;
	}
	if(Job == Job_Priest) {
		mes "[Bishop Thomas]";
		mes "God bless our faithful brother..." ;
		next;
		mes "[Bishop Thomas]";
		mes "I see that you are following God's teachings and correcting your conduct." ;
		mes "[Bishop Thomas]"; mes "What business brings you here today?" ;
		next;
		switch (select("I came by to check on you while I was in the neighborhood", "I was trying to help the Acolyte I'm bringing with me", "I'm having a hard time surviving these days")) {
		case 1:
			mes "[Bishop Thomas]";
			mes "Hoho, I see." ;
			mes "I am as healthy as ever." ;
			mes "[Bishop Thomas]"; mes "Please tell the other brothers." ;
			next;
			mes "[Bishop Thomas]";
			mes "We Priests are here on this earth to speak for God." ;
			mes "Let those in need be given a helping hand...." ;
			close;
		case 2:
			mes "[Bishop Thomas]";
			mes "Well, that's a good idea." ;
			mes "It is also an important role of Priest to guide other Acolytes to good paths." ;
			next;
			mes "[Bishop Thomas]";
			mes "I just can't help with everything." ;
			mes "There are some trials that I really have to undergo as an Acolyte." ;
			next;
			mes "[Bishop Thomas]";
			mes "I'm sure I can help you with the second ordeal, the "Retribution Ordeal"." ;
			mes "You will need ^3051FD Rosalie ^000000 to go with you." ;
			next;
			mes "[Bishop Thomas]";
			mes "Would you like to help Acolyte with his degenerate training?" ;
			next;
			if(select("Yes, I will help", "I will come back later")==2) {
				mes "[Bishop Thomas]";
				mes "Yes, please take your time getting ready." ;
				mes "Be sure to come wearing your ^3051FD Rosalie^000000." ;
				close;
			}
			if(countitem(2608)<1) {
				mes "[Bishop Thomas]";
				mes "Yeah... Do you have ^3051FD Rosalie^000000?" ;
				next;
				mes "[Bishop Thomas]";
				mes "If you want to enter the training hall, please wear ^3051FD Rosalie^000000 before you come." ;
				close;
			}
			mes "[Bishop Thomas]";
			mes "Then I will send you to the training ground in Acolyte." ;
			mes "Please give my regards to Friar Peter." ;
			next;
			mes "[Bishop Thomas]";
			mes "Please guide him well so that he can be a good Priest." ;
			close2;
			warp "job_prist.gat",24,180;
			end;
		case 3:
			mes "[Bishop Thomas]";
			mes "You must exert yourself. You are a child of God's blessing..." ;
			mes "Let me heal your wounded body and heart..." ;
			next;
			mes "[Bishop Thomas]";
			mes "O God... Watch over us and help us..." ;
			mes "May our prayers be heard in times of hardship and adversity..." ;
			next;
			mes "[Bishop Thomas]";
			mes "Here is your child suffering..." ;
			mes "Please surround this child's weary heart with your warmth..." ;
			next;
			mes "[Bishop Thomas]";
			mes "It should be a little better." ;
			mes "Remember to keep praying..." ;
			mes "God bless you..." ;
			close;
		}
	}
	if(Job ! = Job_Acolyte) {
		mes "[Bishop Thomas]";
		mes "God bless you." ;
		mes "This is Prontera Cathedral." ;
		mes "What brings you here?" ;
		next;
		if(select("Tell me about Priest", "I'm here to see the sights")==2) {
			mes "[Bishop Thomas]";
			mes "Think of it as home and make yourself comfortable." ;
			mes "The cathedral is safer than anywhere else in the world, you know." ;
			next;
			mes "[Bishop Thomas]";
			mes "Then God bless you..." ;
			close;
		}
		mes "[Bishop Thomas]";
		mes "Priests are those who carry God's will to this world on his behalf." ;
		mes "Only those who have become Acolytes and have undergone much training are qualified to do so..." ;
		next;
		mes "[Bishop Thomas]";
		mes "If an Acolyte's JobLv is 40 or higher, he will be able to take some trials and become a Priest..." ;
		mes "He will have more power against demons and undead and more auxiliary skills..." ;
		next;
		mes "[Bishop Thomas]";
		mes "And you will have to play an important role in any city, field, or dungeon..." ;
		mes "[Bishop Thomas]"; mes "[Bishop Thomas]"; mes "[Bishop Thomas]"; mes "We Priests have been given the mission to serve and help others." ;
		next;
		mes "[Bishop Thomas]";
		mes "But when you meet other Priests, you must not force them to do so." ;
		mes "It is only by voluntary action that it makes sense..." ;
		next;
		mes "[Bishop Thomas]";
		mes "When you help, you must not hope for a reward, and the recipient of your help must always be courteous and grateful." ;
		next;
		mes "[Bishop Thomas]";
		mes "I don't know if this explains it." ;
		mes "It would be good to meet the Priests in person and talk to them. Ho ho ho..." ;
		next;
		mes "[Bishop Thomas]";
		mes "Then God bless you..." ;
		close;
	}
	switch(CHANGE_PR) {
	case 0:
		mes "[Bishop Thomas]";
		mes "What brings you here?" ;
		next;
		if(select("I'm here to change jobs at Priest", "I came to say hello")==2) {
			mes "[Bishop Thomas]";
			mes "Well... I am fine as you can see." ;
			mes "Please remember your mission as an Acolyte and live right." ;
			next;
			mes "[Bishop Thomas]";
			mes "So, when you come back, please let me know how the other Acolytes are doing." ;
			mes "God bless you..." ;
			close;
		}
		mes "[Bishop Thomas]";
		mes "I see... . would you like to move to Priest..." ;
		mes "God will be very pleased with your decision." ;
		next;
		mes "[Bishop Thomas]";
		mes "My name is Thomas Cervantes, Bishop of the Cathedral of Prontera." ;
		mes "Please do not be hard and easy." ;
		next;
		mes "[Bishop Thomas]";
		mes "If you have decided to move to Priest, you will have to go through some trials and tribulations." ;
		mes "First of all, you must have a JobLv of 40 or higher before you can do so." ;
		next;
		mes "[Bishop Thomas]";
		mes "Now, in order to help you with your job change, you must complete this application form." ;
		mes "Would you like to apply now?" ;
		next;
		if(select("Yes, I'm applying", "I'll think about it some more")==2) {
			mes "[Bishop Thomas]";
			mes "I see. Then please go ahead and think about it slowly." ;
			mes "Come back and visit me when you have made up your mind to move to Priest." ;
			next;
			mes "[Bishop Thomas]";
			mes "God bless you." ;
			close;
		}
		if(JobLevel < 40) {
			mes "[Bishop Thomas]";
			mes "You're not ready to be Priest yet..." ;
			mes "Go out in the world and get a lot more experience." ;
			next;
			mes "[Bishop Thomas]";
			mes "Priest has Priest's..." ;
			mes "Acolyte has Acolyte's mission..." ;
			mes "Come back and visit us when the time comes." ;
			close;
		}
		if(SkillPoint) {
			mes "[Bishop Thomas]";
			mes "Mm... You still have some SkillPoints left..." ;
			mes "Come back when you have mastered the skills you can acquire..." ;
			close;
		}
		mes "[Bishop Thomas]";
		mes ""+strcharinfo(0)+ " Yo..." ;
		mes "I am handing down the ordeal to Priest job change.... I know it will be a difficult and painful ordeal, but please get through it." ;
		next;
		mes "[Bishop Thomas]";
		mes "To change your job to Priest, you must first make a pilgrimage." ;
		mes "Come and meet in order the three monks who are in training in the field." ;
		next;
		mes "[Bishop Thomas]";
		mes "Next is the retreat training." ;
		mes "Retarding is to repel demons and undead and to destroy all temptations, afflictions, and evil forces." ;
		next;
		mes "[Bishop Thomas]";
		mes "And the pledge of service." ;
		mes "As Priest, you will make a pledge to help the weak and spread the faith." ;
		next;
		mes "[Bishop Thomas]";
		mes "Also, for Acolytes who have trained to JobLv 50, you may not make the pilgrimage." ;
		mes "You have probably made many pilgrimages so far..." ;
		next;
		if(JobLevel < 50) {
			set CHANGE_PR,1;
			mes "[Bishop Thomas]";
			mes "So let's go through the steps of the pilgrimage." ;
			mes "At the beginning, you should go to meet Father Rubalcabara, who is training at the ruins northeast of Prontera." ;
			next;
			mes "[Bishop Thomas]";
			mes "Next, please meet Sister Matilda." ;
			mes "She should be somewhere in the Morroc field located southwest of Prontera." ;
			next;
			mes "[Bishop Thomas]";
			mes "Please meet Father Yosuke at the end." ;
			mes "Father Yosuke is probably training in the fields northwest of Prontera." ;
			next;
			mes "[Bishop Thomas]";
			mes "Take care then." ;
			mes "If you are not sure of the location, ask Nun Cecile." ;
			mes "[Bishop Thomas]"; mes "When you have finished your pilgrimage, I will give you the next ordeal." ;
			next;
			mes "[Bishop Thomas]";
			mes "God bless you..." ;
			close;
		}
		mes "[Bishop Thomas]";
		mes "You have a JobLv of 50." ;
		mes "That's admirable. I can see that you have been training diligently." ;
		next;
		mes "[Bishop Thomas]";
		mes "Then, please proceed to the retreat training." ;
		mes "You can bring other Priests with you to the Exorcism." ;
		next;
		mes "[Bishop Thomas]";
		mes "I think it will be easy for you to do this, but it will be easier if you are accompanied by Priests." ;
		next;
		mes "[Bishop Thomas]";
		mes "[Bishop Thomas]"; mes "[Bishop Thomas]"; mes "[Bishop Thomas]"; mes "[Bishop Thomas]" ;
		break;
	case 1:
		mes "[Bishop Thomas]";
		mes "Oh? Why are you here?" ;
		mes "You didn't forget your pilgrimage, did you?" ;
		next;
		if(select("I'm sorry, can you tell me the order?", "No! No way!") ==2) {
			mes "[Bishop Thomas]";
			mes "I see. If you want to know more about the place, you can ask Nun Cecile at the entrance." ;
			next;
			mes "[Bishop Thomas]";
			mes "Then have a safe trip." ;
			mes "God bless you." ;
			close;
		}
		mes "[Bishop Thomas]";
		mes "Well, well, well... I'm a little worried about the future if this is the way it's going to go from the start..." ;
		mes "I'll tell you again, so this time, listen carefully and remember." ;
		next;
		mes "[Bishop Thomas]";
		mes "See Father Rubalcabara." ;
		mes "He is training at the ruins northeast of Prontera." ;
		next;
		mes "[Bishop Thomas]";
		mes "See Sister Matilda next." ;
		mes "She should be somewhere in the Morroc field located southwest of Prontera." ;
		next;
		mes "[Bishop Thomas]";
		mes "Please see Father Yosuke at the end." ;
		mes "Father Yosuke is probably training in the fields northwest of Prontera." ;
		next;
		mes "[Bishop Thomas]";
		mes "Take care then." ;
		mes "If you are not sure of the location, ask Nun Cecile." ;
		mes "[Bishop Thomas]"; mes "When you have finished your pilgrimage, I will give you the next ordeal." ;
		next;
		mes "[Bishop Thomas]";
		mes "God bless you..." ;
		close;
	case 2:
		mes "[Bishop Thomas]";
		mes "You have met Father Rubalcabara..." ;
		mes "Thank you for your hard work from a long way away." ;
		next;
		mes "[Bishop Thomas]";
		mes "Now let's go next to Sister Matilda." ;
		mes "It will be a long journey to the Morroc area, but good luck." ;
		close;
	case 3:
		mes "[Bishop Thomas]";
		mes "I see you have met Sister Matilda, and she is still training as usual in the heat of the desert..." ;
		next;
		mes "[Bishop Thomas]";
		mes "Then go and see Father Yosuke for the last time." ;
		mes "He should be somewhere in the rugged northwest field, so take care of yourself." ;
		close;
	case 4:
		mes "[Bishop Thomas]";
		mes "You have met Father Yosuke." ;
		mes "Congratulations on successfully completing the first ordeal, the Pilgrimage." ;
		next;
		mes "[Bishop Thomas]";
		mes "We will now begin the next ordeal, the retreat ordeal." ;
		mes "As I said at the beginning, you can take your Priest with you to the Exorcism Ordeal." ;
		next;
		mes "[Bishop Thomas]";
		mes "You will not be able to get help with all the ordeals, but you can ask Priest to guide you well." ;
		mes "Shall we begin the retreat training immediately, then?" ;
		break;
	case 5:
		mes "[Bishop Thomas]";
		mes "It seems that you are ready to begin your training." ;
		mes "Shall we begin immediately then?" ;
		next;
		if(select("Yes, please", "I'm not ready yet")==2) {
			mes "[Bishop Thomas]";
			mes "Okay. Go slowly and get ready. May you get through the ordeal in one piece." ;
			close;
		}
		mes "[Bishop Thomas]";
		mes "Then I will send you to the place of your training." ;
		next;
		mes "[Bishop Thomas]";
		mes "When you get there, please talk to Father Peter, who is in charge of the training." ;
		next;
		warp "job_prist.gat",24,180;
		end;
	case 6:
		mes "[Bishop Thomas]";
		mes "It looks like you had a very hard time..." ;
		mes "But there may be greater challenges ahead after you become Priest." ;
		mes "You must not be defeated by this level of ordeal." ;
		mes "Would you like to try again?" ;
		next;
		if(select("I'll try", "I'll be a little more prepared")==2) {
			mes "[Bishop Thomas]";
			mes "Okay. Go ahead and take your time getting ready. May you make it through the ordeal in one piece." ;
			close;
		}
		mes "[Bishop Thomas]";
		mes "We will send you on your way then." ;
		mes "I wish you a safe completion." ;
		next;
		mes "[Bishop Thomas]";
		mes "You may also want to ask Father Peter for advice." ;
		next;
		warp "job_prist.gat",24,180;
		end;
	case 7:
		mes "[Bishop Thomas]";
		mes "You have successfully completed your retreat training." ;
		mes "You did a great job." ;
		mes "With the power to overcome all temptations and troubles, you will already have the qualities of a Priest." ;
		next;
		mes "[Bishop Thomas]";
		mes "Then go to Nun Cecile and complete your pledge of service." ;
		mes "All you have to do is answer the voice in the back of your head as you see fit." ;
		next;
		mes "[Bishop Thomas]";
		mes "Then I look forward to the time of your career change..." ;
		close;
	case 8:
		mes "[Bishop Thomas]";
		mes "I wonder why... You have not fulfilled your pledge of service to the end." ;
		mes "If you don't have the basic mindset as a Priest, you never know when you will be swallowed up by the temptation of evil..." ;
		next;
		mes "[Bishop Thomas]";
		mes "Go to Nun Cecile again and fulfill your pledge to the end." ;
		mes "Or else we will ask you to make another pilgrimage in order to re-train your mind from the beginning." ;
		next;
		mes "[Bishop Thomas]";
		mes "Go ahead." ;
		mes "Don't listen with your ears, listen with your heart..." ;
		close;
	case 9:
		if(SkillPoint) {
			mes "[Bishop Thomas]";
			mes "Mm... You still have some SkillPoints left..." ;
			mes "Come back when you have mastered the skills you can acquire..." ;
			close;
		}
		set '@itemid,(JobLevel >= 50)? 1551: 1550;
		mes "[Bishop Thomas]";
		mes "Congratulations!" ;
		mes "You have overcome all your trials." ;
		mes "You are now eligible to become a Priest." ;
		next;
		mes "[Bishop Thomas]";
		mes "O God... Shine your auspicious light on this man and give him your power..." ;
		mes "He who bears your will to the world, is born here and now..."; mes "[Bishop Thomas]"; mes "[Bishop Thomas]" ;
		next;
		unequip;
		jobchange Job_Priest;
		set CHANGE_PR,0;
		mes "[Bishop Thomas]";
		mes "You are now a Priest in your own right." ;
		mes "I congratulate you and ask that you guide and help those in need with your new attitude." ;
		next;
		getitem '@itemid,1;
		mes "[Bishop Thomas]";
		mes "And I give this to the new job change ghost." ;
		mes "It is about faith and will be necessary for you as you continue on your path." ;
		next;
		mes "[Bishop Thomas]";
		mes "This concludes all the rituals of the change of employment. Thank you for your hard work..." ;
		mes "Continue on your new path...." ;
		close;
	}
	// go to retreat training
	next;
	set CHANGE_PR,5;
	if(select("Yes, please", "I'll go do some preparation")==2) {
		mes "[Bishop Thomas]";
		mes "Okay. Go slowly and get ready. May you get through the ordeal safely." ;
		close;
	}
	mes "[Bishop Thomas]";
	mes "Then I will send you to the place of your training." ;
	next;
	mes "[Bishop Thomas]";
	mes "When you get there, please talk to Father Peter, who is in charge of the training." ;
	next;
	warp "job_prist.gat",24,180;
	end;
}


//==========================================
// First test (holy pilgrimage)
//------------------------------------------

// see npc_job_04acolyte.txt


//==========================================
// Secondary examination (retreat training)
//------------------------------------------

job_prist.gat,24,187,4 script tough priest::PR_Timer 110,{
	if('flag) { //lock during challenge
		mes "[Father Peter]";
		mes "Ah... Wait a minute." ;
		mes "There's another Acolyte in training right now." ;
		next;
		mes "[Father Peter]";
		mes "Call on me again in a while." ;
		mes "I'll send you home if it's over." ;
		close;
	}
	if(Job ! = Job_Acolyte) {
		mes "[Father Peter]";
		mes "God bless you." ;
		next;
		mes "[Father Peter]";
		mes "Priest... Do you have an Acolyte to help you?" ;
		mes "That's very kind of you. Which, I'm sure, would be easy for you to do." ;
		next;
		mes "[Father Peter]";
		mes "But remember this. It is not an ordeal for you to undergo." ;
		mes "Just because I'm going to help you doesn't mean I'm going to solve everything." ;
		next;
		mes "[Father Peter]";
		mes "Shall we move on then?" ;
		next;
		switch (select("Yes, I'm going", "Please wait a moment", "Yes, I'm going back to town")) {
		case 1:
			mes "[Father Peter]";
			mes "Okay, if Acolyte is in, we'll start!" ;
			mes "I'm sure you'll remember when you were Acolyte, too." ;
			close2;
			warp "job_prist.gat",24,44;
			end;
		case 2:
			mes "[Father Peter]";
			mes "Hmmm... You're right, we should be ready." ;
			mes "Okay, call on me again in good time." ;
			close;
		case 3:
			mes "[Father Peter]";
			mes "Hmm... Then go home." ;
			mes "We will meet again if we have a chance." ;
			mes "God bless you." ;
			close2;
			warp "prontera.gat",234,318;
			end;
		}
	}
	if(CHANGE_PR < 6) {
		mes "[Father Peter]";
		mes "God bless you." ;
		mes "First, let me congratulate you on successfully completing the first ordeal. You did a great job." ;
		next;
		mes "[Father Peter]";
		mes "My name is Peter S. Alberto. How has Thomas been?" ;
		next;
		mes "[Father Peter]";
		mes "In case you're wondering, he's a bishop, so you really have to call him Bishop Thomas-sama..." ;
		mes "It's not like I'm a priest for the rest of my life, hahaha!" ;
		next;
		mes "[Father Peter]";
		mes "Now, let me briefly explain to you about the retreat ordeal. Do you know what this ordeal is all about?" ;
		next;
		if(select("Yes, I know", "I'm not sure...") ==1) {
			mes "[Father Peter]";
			mes "Clever. Well, let me explain it to you in a nutshell." ;
			mes "There is a difference between knowing well and being able to do it." ;
		}
		else {
			mes "[Father Peter]";
			mes "Well, then you'll need to elaborate." ;
			mes "If you listen to me carefully, you will be able to master the retreat before you know it." ;
		}
		next;
		mes "[Father Peter]";
		mes "The practice of exorcism literally means to slay demons." ;
		mes "Demon is the general term for undes and demons." ;
		next;
		mes "[Father Peter]";
		mes "There are so many things in the world that are against the faith. These demons are good people of God..."; next; mes "[Father Peter]"; mes "There are too many things in the world that are against the faith. They harm us." ;
		next;
		mes "[Father Peter]";
		mes "We Priests will not have a day of rest until we have destroyed all such demons." ;
		next;
		mes "[Father Peter]";
		mes "Now do you have a rough idea of what the training of the demon exterminators is all about?" ;
		mes "Pretend you are Priest and test yourself." ;
		mes "There, you can put on help, because this ordeal will be quite difficult." ;
		next;
		mes "[Father Peter]";
		mes "If you have a senior Priest you know well, you can ask him or her." ;
		mes "[Father Peter]"; mes "Then it's time to get started." ;
		next;
		set CHANGE_PR,6;
		set '@word$, "Please wait a moment";
	}
	else {
		mes "[Father Peter]";
		mes "Have we prepared well this time?" ;
		mes "Come on, come on, let's get this over with and be Priest." ;
		next;
		mes "[Father Peter]";
		mes "Then let's get started right away." ;
		next;
		// lines are slightly different
		set '@word$, "Wait a little longer";
	}
	switch (select("please",'@word$, "I'm going back to town")) {
	case 1:
		mes "[Father Peter]";
		mes "Then we will begin the retreat training." ;
		mes "The content is quite simple... All you have to do is defeat all the monsters that appear." ;
		next;
		mes "[Father Peter]";
		mes "There are several levels, so be careful." ;
		mes "Good luck!" ;
		next;
		if('flag) { //lock check here too
			mes "[Father Peter]";
			mes "Oh... Wait a minute." ;
			mes "There's another Acolyte in training right now." ;
			next;
			mes "[Father Peter]";
			mes "Call on me again in a while." ;
			mes "I'll send you home if it's over." ;
			close;
		}
		set @priest_check,0;
		set getvariableofnpc('count, "PR_Summon"),0; //initialize mob counter
		set 'flag,getcharid(3); //lock using account ID
		initnpctimer;
		warp "job_prist.gat",24,44;
		end;
	case 2:
		mes "[Father Peter]";
		mes "Hmmm... Yes, we need to be prepared." ;
		mes "Okay, give me another shout if you want." ;
		close;
	case 3:
		if(CHANGE_PR < 6) {
			mes "[Father Peter]";
			mes "What, you've come this far and you're leaving?" ;
			mes "I don't mind, but..." ;
			next;
			mes "[Father Peter]";
			mes "Well, it's your first time, so no wonder you're scared. You can still come when you get the courage." ;
		}
		else {
			mes "[Father Peter]";
			mes "When you return to the city again..." ;
			mes "You can't be Priest forever if you do that." ;
			next;
			mes "[Father Peter]";
			mes "You're not ready for this place yet." ;
			mes "[Father Peter]"; mes "Come back when you've seen a little more of the world." ;
		}
		close2;
		warp "prontera.gat",234,318;
		end;
	}
OnTimer350000:
	stopnpctimer;
	if(attachrid('flag)) { //target only aco
		set '@d,distance('flag);
		if('@d < 0 || '@d > 23) //warp if not in waiting area
			warp "prontera.gat",234,318;
	}
	set 'flag,0;
	killmonster "job_prist.gat", "All";
	end;
}

//==============================================================
job_prist.gat,24,109,4 script #PR_Warp1 45,2,2,{
	if(Job ! = Job_Acolyte || getvariableofnpc('count, "PR_Summon") >= 13)
		warp "job_prist.gat",168,17;
	end;
}

job_prist.gat,168,180,4 script #PR_Warp2 45,2,2,{
	warp "job_prist.gat",98,40;
	end;
}

job_prist.gat,98,105,0 script #PR_Warp3 45,2,2,{
	if(Job == Job_Acolyte) {
		if(@priest_check < 8) //check for ghost
			end;
		set CHANGE_PR,7;
		set @priest_check,0;
		stopnpctimer "PR_Timer";
		set getvariableofnpc('flag, "PR_Timer"),0;
		killmonster "job_prist.gat", "All";
	}
	warp "prt_church.gat",15,36;
	end;
}

//==============================================================
job_prist.gat,168,45,4 script Deviruchi 1109,5,0,{
	end;
OnTouch:
	if(Job ! = Job_Acolyte) {
		mes "[Deviruchi]";
		mes "Hmm... What is Priest doing here? Shouldn't he be in town praying? Kiki-kiki-kiki..." ;
		mes "You seem to like wasting time." ;
		next;
		mes "[Deviruchi]";
		mes "I'll give you more today, so get the hell out of my way." ;
		mes "Not twice... Kikacha!" ;
		close;
	}
	mes "[Deviruchi]";
	mes "Wow, haven't seen Acolyte in a while." ;
	mes "From the looks of it, he's thinking about a career change to Priest... Caca!" ;
	next;
	mes "[Deviruchi]";
	mes "But I can't help wondering how you've made it this far." ;
	next;
	mes "[Deviruchi]";
	mes "You dare to go through such a difficult path?" ;
	mes "There were other easier occupations for you!" ;
	next;
	mes "[Deviruchi]";
	mes "They're all asking for your help in the city and in the dungeon, aren't they?" ;
	mes "Not a single thing they do for you!"; mes "[Deviruchi]"; mes "[Deviruchi]"; mes "Not a single thing they do for you!" ;
	next;
	mes "[Deviruchi]";
	mes "I am giving you this advice out of the goodness of my heart. The trials are hard, but it's even harder to live like this, okay?" ;
	mes "Let us find another way to live." ;
	next;
	if(select("Yes... I will", "You devil! Retreat!") ==1) {
		mes "[Deviruchi]";
		mes "Kikki, well chosen." ;
		mes "Don't come here again!" ;
		mes "I have a good present for you, since you gave up your new job!" ;
		next;
		mes "[Deviruchi]";
		mes "I'll give you a chance to meet my friends for free! Cackle cackle cackle!" ;
		next;
		warp "c_tower2.gat",168,33;
		end;
	}
	mes "[Deviruchi]";
	mes "kiki kiki kiki..." ;
	mes "Don't say that, listen to me more." ;
	next;
	mes "[Deviruchi]";
	mes "If you give up your job now, I will give you something good." ;
	mes "It's something you may or may not see in your lifetime. Cackle";
	next;
	cutincard 4132;
	mes "[Deviruchi]";
	mes "Do you think you could get a card like this on your own? Think about it." ;
	next;
	if(select("receive card", "Devil! Retreat!") ==1) {
		mes "[Deviruchi]";
		mes "Kikiki-kikikki, I am human after all!" ;
		mes "I'll give you this precious card!" ;
		next;
		mes "[Deviruchi]";
		mes "But not by me." ;
		mes "Good luck getting it!" ;
		next;
		warp "mjolnir_05.gat",200,200;
		end;
	}
	cutin "dummy",255;
	mes "[Deviruchi]";
	mes "Kiki... That's quite a strong spirit." ;
	mes "I'll see if you can get it by yourself..." ;
	next;
	mes "[Deviruchi]";
	mes "One day you'll come back to me with regrets, though! C'mon!" ;
	close;
}

//==============================================================
job_prist.gat,168,75,4 script Doppelganger 1046,5,0,{
	end;
OnTouch:
	if(Job ! = Job_Acolyte) {
		mes "[Doppelganger]";
		mes "Foolish man... I have no use for you." ;
		mes "Isn't this too much trouble? You are not here to test yourself..." ;
		next;
		mes "[Doppelganger]";
		mes "I'm not here to go through the trouble for a single Acolyte who has no chance..." ;
		mes "[Doppelganger]"; mes "[Doppelganger]"; mes "[Doppelganger]"; mes "[Doppelganger]" ;
		close;
	}
	mes "[Doppelganger]";
	mes "Acolyte... Listen to me for a moment..." ;
	next;
	mes "[Doppelganger]";
	mes "Why do you want to be Priest?" ;
	mes "[Doppelganger]"; mes "I see that you are not fit for such a position." ;
	next;
	mes "[Doppelganger]";
	mes "If you wish, I will let you start a new life with my abilities?" ;
	mes "I will make you a Novice with the strength you have now, and I will also let you get the job you want." ;
	next;
	mes "[Doppelganger]";
	mes "Of course, you'll still have about the level of ability you have now." ;
	mes "I think that's a good deal... What do you think?" ;
	next;
	if(select("Please!" , "Devil! Retreat!")==2) {
		mes "[Doppelganger]";
		mes "You don't seem to understand me very well..." ;
		mes "This would have been a great opportunity to rewind your life..." ;
		next;
		mes "[Doppelganger]";
		mes "Just say you won't become Priest. For example, you could change your career to become a swordsman like me?" ;
		next;
		if(select("I will not change my job to Priest", "You devil! Retreat!") ==2) {
			mes "[Doppelganger]";
			mes "... Then I'll let you off the hook for now..." ;
			next;
			mes "[Doppelganger]";
			mes "Next time I see you, I'll give you a painful death." ;
			close;
		}
	}
	mes "[Doppelganger]";
	mes "Well chosen." ;
	mes "I'll put you back in Novice as you wish." ;
	next;
	mes "[Doppelganger]";
	mes "Reborn to death!" ;
	next;
	warp "gef_dun02.gat",210,177;
	end;
}

//==============================================================
job_prist.gat,168,115,4 script Dark Lord 1272,5,0,{
	end;
OnTouch:
	if(Job ! = Job_Acolyte) {
		mes "[Dark Lord]";
		mes "Feel! Pain and despair!" ;
		mes "Feel the sorrow and anger of being betrayed by the one you love the most!" ;
		next;
		mes "[Dark Lord]";
		mes "Your heart will one day become a sharp blade that will pierce deep into your heart!" ;
		close;
	}
	mes "[Dark Lord]";
	mes "Halt... Human..." ;
	mes "[Dark Lord]"; mes "With whose permission do you wish to pass through here?" ;
	next;
	mes "[Dark Lord]";
	mes "Acolyte trying to be Priest..." ;
	mes "[Dark Lord]"; mes "[You] can't pass this place..." ;
	mes "Go home... Or I will kill you." ;
	next;
	mes "[Dark Lord]";
	mes "O ant-like man... Do not pollute my hour of rest..." ;
	next;
	if(select("I'm sorry..." I'm sorry...", "Devil! Move away!") ==2) {
		mes "[Dark Lord]";
		mes "Hmm... I could smash you to pieces like a dead leaf..." ;
		next;
		mes "[Dark Lord]";
		mes "Let the infinite magic I possess tear you to pieces!" ;
		next;
		if(select("Please spare my life!" If(select("Save my life!", "You demon! Move away!") ==2) {
			mes "[Dark Lord]";
			mes "You have a strong core, despite appearances..." ;
			next;
			mes "[Dark Lord]";
			mes "[Dark Lord]"; mes "Next time you stand before me, I will make sure to show you hell..." ;
			close;
		}
	}
	mes "[Dark Lord]";
	mes "Don't show up again!" ;
	next;
	warp "gl_church.gat",145,170;
	end;
}

//==============================================================
job_prist.gat,168,150,4 script Baphomet 736,5,0,{
	end;
OnTouch:
	if(Job ! = Job_Acolyte) {
		mes "[Baphomet]";
		mes "Human... And Priest..." ;
		next;
		mes "[Baphomet]";
		mes "No use..." ;
		close;
	}
	mes "[Baphomet]";
	mes "Human..." ;
	next;
	mes "[Baphomet]";
	mes "Shall we make a deal...?" ;
	next;
	mes "[Baphomet]";
	mes "I give you wealth and power." ;
	mes "Gold that you will not be able to spend in your lifetime..." ;
	mes "Weapons that no man can make..." ;
	next;
	mes "[Baphomet]";
	mes "And if you wish, you may summon me at any time." ;
	mes "[Baphomet]"; mes "[Baphomet]"; mes "[Baphomet]"; mes "[Baphomet]"; mes "[Baphomet]"; mes "[Baphomet]" ;
	next;
	mes "[Baphomet]";
	mes "Give up your new job at Priest and make a covenant with me..." ;
	mes "[Baphomet]"; mes "Give up your job at Priest and make a covenant with me." ;
	next;
	if(select("I will not change to Priest", "You devil! Retreat!") ==1) {
		mes "[Baphomet]";
		mes "Then let's make a deal..." ;
		mes "It will be a choice without regret..." ;
		next;
		mes "[Baphomet]";
		mes "Come to me..." ;
		mes "I will make a contract with you there." ;
		next;
		warp "glast_01.gat",200,203;
		end;
	}
	mes "[Baphomet]";
	mes "Okay... I'll disappear as you wish..." ;
	mes "But you'll have a hard time getting out too..." ;
	next;
	mes "[Baphomet]";
	mes "I've got some monsters especially for you. Let's see how good they are." ;
	next;
	mes "[Baphomet]";
	mes "Then go home..." ;
	close;
}

//==============================================================
job_prist.gat,0,0,0 script PR_Summon -1,{
	end;
//First step
OnEvent0:
	monster "job_prist.gat",24,52, "immorality",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",18,52, "disloyal",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",30,51, "Envy",1015,1, "PR_Summon::OnKilled";
	end;
OnEvent1:
	monster "job_prist.gat",21,62, "anger",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",27,62, "grudge",1015,1, "PR_Summon::OnKilled";
	end;
OnEvent2:
	monster "job_prist.gat",24,72, "arrogance",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",18,72, "lust",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",30,72, "Laziness",1015,1, "PR_Summon::OnKilled";
	end;
OnEvent3:
	monster "job_prist.gat",21,82, "devour",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",27,82, "greed",1015,1, "PR_Summon::OnKilled";
	end;
OnEvent4:
	monster "job_prist.gat",24,92, "desperation",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",18,92, "distrust",1015,1, "PR_Summon::OnKilled";
	monster "job_prist.gat",30,92, "fear",1015,1, "PR_Summon::OnKilled";
	end;
// Third step
OnEvent5:
	monster "job_prist.gat",90,55, "amoz",1041,1;
	monster "job_prist.gat",105,54, "Amasis",1041,1;
	end;
OnEvent6:
	monster "job_prist.gat",90,70, "Menetho",1041,1;
	monster "job_prist.gat",105,70, "Ahmad",1041,1;
	end;
OnEvent7:
	monster "job_prist.gat",90,85, "Meneses",1041,1;
	monster "job_prist.gat",105,85, "Nepeth",1041,1;
	end;
OnKilled:
	set 'count,'count+1;
	end;
}

//==============================================================
job_prist.gat,24,51,0 script PR_Test#0 139,16,0,{
	set '@num,strnpcinfo(2);
	if(Job == Job_Acolyte && @priest_check == '@num) {
		donpcevent "PR_Summon::OnEvent "+'@num;
		set @priest_check,'@num+1;
	}
	end;
}

job_prist.gat,24,61,0 duplicate(PR_Test#0) PR_Test#1 139,16,0
job_prist.gat,24,71,0 duplicate(PR_Test#0) PR_Test#2 139,16,0
job_prist.gat,24,81,0 duplicate(PR_Test#0) PR_Test#3 139,16,0
job_prist.gat,24,91,0 duplicate(PR_Test#0) PR_Test#4 139,16,0
job_prist.gat,98,54,0 duplicate(PR_Test#0) PR_Test#5 139,8,0
job_prist.gat,98,69,0 duplicate(PR_Test#0) PR_Test#6 139,8,0
job_prist.gat,98,84,0 duplicate(PR_Test#0) PR_Test#7 139,8,0


//==========================================
// Tertiary Test (Pledge of Service)
//------------------------------------------

prt_church.gat,27,24,4 script nun 79,{
	if(Upper == UPPER_HIGH) {
		mes "[Nun Cecile]";
		mes "You have been reincarnated, so we cannot guide you to a new job here." ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Nun Cecile]";
		mes "May God bless you..." ;
		mes "Prontera Cathedral welcomes you..." ;
		next;
		mes "[Nun Cecile]";
		mes "Have you decided on a profession yet?" ;
		mes "How about becoming a clergyman?" ;
		mes "It would be really great to become an Acolyte and live your life helping others." ;
		next;
		mes "[Nun Cecile]";
		mes "Please talk to the priest on the other side of the room about changing to Acolyte." ;
		next;
		mes "[Nun Cecile]";
		mes "If you have trained diligently in Acolyte and have reached JobLvl 40 or above, you can receive the Priest Job Change ceremony here." ;
		next;
		mes "[Nun Cecile]";
		mes "Since you are still a Novice, you should take your time to think about it." ;
		mes "May God bless you..." ;
		close;
	}
	if(Job == Job_Priest) {
		mes "[Nun Cecile]";
		mes "May God bless you..." ;
		mes "I hope you have a good day..." ;
		close;
	}
	if(Job ! = Job_Acolyte) {
		mes "[Nun Cecile]";
		mes "This is Prontera Cathedral." ;
		mes "How may I help you?" ;
		next;
		if(select("Tell me about Priest", "I stopped by briefly")==2) {
			mes "[Nun Cecile]";
			mes "Please have a good rest." ;
			mes "Please remember to thank God." ;
			next;
			mes "[Nun Cecile]";
			mes "May God bless you..." ;
			close;
		}
		mes "[Nun Cecile]";
		mes "Priest is the voice of God who preaches faithfulness." ;
		mes "Only those who have first become Acolytes from Novices and have been trained can become Priests." ;
		next;
		mes "[Nun Cecile]";
		mes "The Priests are forbidden to use weapons with sharp edges." ;
		mes "Because the purpose of attacking monsters is not to kill, but to indoctrinate." ;
		next;
		mes "[Nun Cecile]";
		mes "Of course, you could meet Priest and the others and ask them directly, but why don't you ask Bishop Thomas, who is in the back?" ;
		next;
		mes "[Nun Cecile]";
		mes "I'm sure he can tell you more about it than I can." ;
		next;
		mes "[Nun Cecile]";
		mes "May God bless you..." ;
		close;
	}
	switch(CHANGE_PR) {
	case 0:
		mes "[Nun Cecile]";
		mes "May God bless you..." ;
		mes "How can I help you?" ;
		next;
		if(select("I would like to change my job to Priest.", "No special business")==2) {
			mes "[Nun Cecile]";
			mes "Please have a good rest." ;
			mes "The cathedral is like a home to you. Please feel free to visit us anytime." ;
			next;
			mes "[Nun Cecile]";
			mes "And next time you come, please let us know how the other Acolytes are doing." ;
			mes "God bless you." ;
			close;
		}
		mes "[Nun Cecile]";
		mes "Oh, you're moving to Priest!" ;
		mes "I dream everyday that many Acolytes will become Priest." ;
		next;
		mes "[Nun Cecile]";
		mes "My name is Cecile-Margarita." ;
		mes "I am a nun who helps the Acolytes to change jobs." ;
		mes "I would be happy to help you." ;
		next;
		mes "[Nun Cecile]";
		mes "I have seen many people move to Priest because I grew up here." ;
		mes "And now I help people who want to become Priests..." ;
		next;
		mes "[Nun Cecile]";
		mes "You have to overcome many challenges to change your Priest job..." ;
		mes "Pilgrimage to the Holy Land, retreat training, pledge of service..." ;
		mes "Only after completing all of them will you be allowed to become a Priest." ;
		next;
		mes "[Nun Cecile]";
		mes "If you wish to change jobs, please go to Bishop Thomas in the back and take the test to change jobs." ;
		next;
		mes "[Nun Cecile]";
		mes "If you have any difficulties, please ask me." ;
		mes "[Nun Cecile]"; mes "I will help you in any way I can." ;
		close;
	case 1:
		mes "[Nun Cecile]";
		mes "You have begun your pilgrimage." ;
		mes "It's hard work, but please hang in there until the end." ;
		mes "The first place we are going to is Father Rubalcabara's place." ;
		next;
		mes "[Nun Cecile]";
		mes "The place where he is is the entrance to the ruins, northeast of Prontera." ;
		mes "That will be the place of pilgrimage." ;
		next;
		mes "[Nun Cecile]";
		mes "There are many monkeys living in the area where he is." ;
		mes "Sometimes there is a monster that attacks humans called Choco, which is a ferocious monkey, so be careful with that." ;
		next;
		mes "[Nun Cecile]";
		mes "After you meet Father Rubalcabara-sama, you should meet Sister Matilda-sama and Father Yosuke-sama. Of course, you may stop by here on your way to check on them." ;
		next;
		mes "[Nun Cecile]";
		mes "Well then, have a good day." ;
		mes "Don't give up and finish. I wish you a safe journey." ;
		close;
	case 2:
		mes "[Nun Cecile]";
		mes "You have met Father Rubalcabara. Then you will meet Sister Matilda." ;
		mes "She is near the city of Morroc." ;
		next;
		mes "[Nun Cecile]";
		mes "I understand that she is training in the desert north of Morroc. Perhaps... If you look carefully to the northwest, you will find him." ;
		next;
		mes "[Nun Cecile]";
		mes "I would like to go to training like the rest of you, but it is also an important part of my role to help you here, so I guess this is part of my faith." ;
		next;
		mes "[Nun Cecile]";
		mes "Then, have a good day." ;
		mes "Don't give up and finish. I wish you a safe journey." ;
		close;
	case 3:
		mes "[Nun Cecile]";
		mes "Yes, now we just need to meet Father Yosuke-sama and our pilgrimage will be over." ;
		mes "I heard that he is near the lake northwest of Prontera." ;
		next;
		mes "[Nun Cecile]";
		mes "I think it will be easier if you go out to the west first." ;
		next;
		mes "[Nun Cecile]";
		mes "Even though the pilgrimage is over, the ordeal will still continue, but I hope that you will always make it to the end..." ;
		close;
	case 4:
		mes "[Nun Cecile]";
		mes "Welcome back." ;
		mes "Thank you for your long trip." ;
		mes "Then go to the bishop's place." ;
		mes "The ordeal moves on to the next stage." ;
		next;
		mes "[Nun Cecile]";
		mes "The retreat ordeal is tough, but I know you'll be fine!" ;
		mes "I would like to help you, but I have to help Master Acolyte who is coming here." ;
		next;
		mes "[Nun Cecile]";
		mes "It would be good to find someone to help you with your training." ;
		mes "So, keep up the good work." ;
		close;
	case 5:
		mes "[Nun Cecile]";
		mes "How did you do your retreat training?" ;
		mes "Even I can't tell you in detail what kind of ordeal it will be..." ;
		next;
		mes "[Nun Cecile]";
		mes "However, you will need to be well prepared and have the mental strength not to give yourself to vexations and desires." ;
		mes "[Nun Cecile]"; mes "If you can keep yourself strong, you will be fine." ;
		next;
		mes "[Nun Cecile]";
		mes "For more information, please ask Father Peter who is in the training hall." ;
		mes "He is also very close to Bishop Thomas, so I am sure he will be able to tell you well." ;
		close;
	case 6:
		mes "[Nun Cecile]";
		mes "It is hard, but you must not give up." ;
		mes "If you have a strong heart to resist all troubles and temptations, you will become Priest." ;
		next;
		mes "[Nun Cecile]";
		mes "If other senior Priests pass by, you may ask them to help you." ;
		mes "You can help us up to the first stage of the retreat training." ;
		next;
		mes "[Nun Cecile]";
		mes "May God bless you..." ;
		mes "Please come back to me when you finish your retreat training." ;
		close;
	case 7:
		mes "[Nun Cecile]";
		mes "You have had a hard time!" ;
		mes "But I was able to come to the final stage of my career change ordeal." ;
		next;
		mes "[Nun Cecile]";
		mes "Then I would like to begin the pledge ceremony to transfer you to Priest." ;
		mes "Please answer my questions seriously." ;
		break;
	case 8:
		mes "[Nun Cecile]";
		mes "......" ;
		next;
		mes "[Nun Cecile]";
		mes "You have returned." ;
		mes "This time, I hope you will make good on your pledge..." ;
		next;
		mes "[Nun Cecile]";
		mes "May your faithfulness be conveyed..." ;
		mes "Please take the reception seriously." ;
		break;
	case 9:
		mes "[Nun Cecile]";
		mes "All trials are over..." ;
		mes "Go to Bishop Thomas and be reborn as Priest." ;
		next;
		mes "[Nun Cecile]";
		mes "May God bless you." ;
		close;
	}
	//continued when 7,8
	next;
	set CHANGE_PR,8;
	mes "[Nun Cecile]";
	mes "Then we will begin." ;
	next;
	mes "[Nun Cecile]";
	mes "Are you willing to dedicate the rest of your life to God?" ;
	next;
	if(select("Yes", "No")==2) {
		mes "[Nun Cecile]";
		mes "Why such a reply..." ;
		mes "I guess you are not ready to be a Priest yet..." ;
		next;
		mes "[Nun Cecile]";
		mes "Please take a little more time to look at yourself." ;
		mes "With that kind of attitude, you will surely lose your mind to evil." ;
		close;
	}
	mes "[Nun Cecile]";
	mes "Do you seek to use your abilities for your own benefit and gain?" ;
	next;
	if(select("Yes", "No")==1) {
		mes "[Nun Cecile]";
		mes "No, I do not." ;
		mes "The ability we have gained is not for gain." ;
		mes "Is that the kind of thinking that made you decide to become a Priest?" ;
		next;
		mes "[Nun Cecile]";
		mes "Please think more carefully about Priest." ;
		mes "With such a mindset, you will only be tainted by worldly greed." ;
		close;
	}
	mes "[Nun Cecile]";
	mes "Do you try to help others who are suffering in combat with your abilities?" ;
	next;
	if(select("Yes", "No")==2) {
		mes "[Nun Cecile]";
		mes "That will not do." ;
		mes "Priest's ability is there as something that helps people..." ;
		mes "It is our duty to help anyone who asks for help, no matter who they are..." ;
		next;
		mes "[Nun Cecile]";
		mes "Take a good look at the people around you..." ;
		mes "You should see the suffering in people..." ;
		close;
	}
	mes "[Nun Cecile]";
	mes "Can you help others and sacrifice yourself?" ;
	next;
	if(select("Yes", "No")==2) {
		mes "[Nun Cecile]";
		mes "... No." ;
		mes "It is admirable to help others at the expense of yourself." ;
		next;
		mes "[Nun Cecile]";
		mes "Think carefully about the word sacrifice." ;
		mes "There is no greater act of service to others..." ;
		close;
	}
	mes "[Nun Cecile]";
	mes "Do you walk around town or outside, speaking the "same words" over and over again?" ;
	next;
	if(select("yes", "no")==1) {
		mes "[Nun Cecile]";
		mes "No, it will not. This is not only for Priest, but also for the others." ;
		mes "No one will turn around and listen to you if you walk around screaming loudly." ;
		next;
		mes "[Nun Cecile]";
		mes "It is wrong to preach the way, but not in that way." ;
		mes "Please take another good look at your own behavior..." ;
		close;
	}
	mes "[Nun Cecile]";
	mes "Do you help others by bringing in more monsters?" ;
	next;
	if(select("yes", "no")==1) {
		mes "[Nun Cecile]";
		mes "That is a very dangerous practice." ;
		mes "It could lead to a situation involving not only you, but others as well." ;
		mes "It is not limited to good monsters and bad monsters." ;
		next;
		mes "[Nun Cecile]";
		mes "Even if you think you are helping others, you will not necessarily save them or those around you." ;
		mes "Please rethink what it really means to help others." ;
		close;
	}
	mes "[Nun Cecile]";
	mes "Are you willing to follow the path of faith and die for faith?" ;
	next;
	if(select("Yes", "No")==2) {
		mes "[Nun Cecile]";
		mes "You cannot be a Priest with that kind of mindset." ;
		next;
		mes "[Nun Cecile]";
		mes "We also have the ability to resuscitate." ;
		mes "Think carefully about what life and death mean to you." ;
		close;
	}
	mes "[Nun Cecile]";
	mes "I have received your pledge." ;
	mes "Finally, do you pledge all that you have said so far?" ;
	next;
	if(select("I swear", "No")==2) {
		mes "[Nun Cecile]";
		mes "......" ;
		next;
		mes "[Nun Cecile]";
		mes "It seems that you are still not fully prepared." ;
		mes "You are not ready to be Priest yet." ;
		next;
		mes "[Nun Cecile]";
		mes "I would ask you again from the Pilgrimage, but you must often reflect on yourself and make up your mind before coming to me." ;
		next;
		mes "[Nun Cecile]";
		mes "May God bless you..." ;
		close;
	}
	set CHANGE_PR,9;
	mes "[Nun Cecile]";
	mes "This concludes the pledge ceremony." ;
	mes "Please go to Bishop Thomas to receive the last rites." ;
	next;
	mes "[Nun Cecile]";
	mes "Always remember..." ;
	mes "That we are together as brothers and sisters..." ;
	mes "May God bless you..." ;
	close;
}
