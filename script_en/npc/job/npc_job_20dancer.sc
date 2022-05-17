//====================================================================
//Ragnarok Online Dancer Jobchange Script by Kalen
//Set wait at end of dance test by Deme
// - CHANGE_DC -> 0-9
// - CHANGE_DC -> 0-9
//====================================================================

//==========================================
// exam application and primary exam
//------------------------------------------

comodo.gat,193,151,4 script Borlob 86,{
	mes "[Borlob]";
	mes "Oh ...... A prima donna that attracts the attention of many!" ;
	mes "I can't believe I got to see them become Dancers right in front of my eyes!" ;
	next;
	mes "[Borlov]";
	mes "I am so happy to be born in this time." ;
	mes "Hooray for ComodoDancer!" ;
	next;
	mes "[Borlob]";
	mes "Yeah? You want to see the Dancer job search test too?" ;
	next;
	if(select("Move to Dancer Job Place", "Cancel")==2) {
		mes "[Borlob]";
		mes "Not flippant~";
		close;
	}
	mes "[Borlob]";
	mes "Yay! Let's go!" ;
	close2;
	warp "job_duncer.gat",70,49;
	end;
}

//==============================================================
job_duncer.gat,43,93,4 script eir 724,{
	cutin "job_dancer_eir01",2;
	if(Upper == UPPER_HIGH) {
		mes "[eir]";
		mes "one, two, three, four ......" ;
		mes "ummm";
		next;
		mes "[Eil]";
		mes "I can't concentrate on my practice if you're watching me so much!" ;
		next;
		mes "[Eil]";
		mes "......" ;
		mes "...... I think I know you from somewhere ......" ;
		next;
		mes "[ail]";
		mes "But I can't remember. ......" ;
		mes "I have practice, can you please go over there?" ;
		close2;
		cutin "job_dancer_eir01",255;
		end;
	}
	if(Job == Job_Dancer) {
		mes "[eir]";
		mes "Hello - how are you doing these days?" ;
		mes "Are you entertaining people?" ;
		close2;
		cutin "job_dancer_eir01",255;
		end;
	}
	if(Job ! = Job_Archer || Sex == 1) {
		mes "[eir]";
		mes "Sir, this area is off-limits to all concerned?" ;
		next;
		mes "[Eil]";
		mes "The dance school is not open to everyone." ;
		next;
		mes "[Eil]";
		mes "If you want to visit, go to the dance stage in the village." ;
		close2;
		cutin "job_dancer_eir01",255;
		end;
	}
	switch(CHANGE_DC) {
	case 0:
		mes "[eir]";
		mes "Welcome - this is Comodo Dance School, where we teach a variety of dances." ;
		next;
		mes "[Eil]";
		mes "We offer wonderful dances to tourists who visit us from all over the world and";
		next;
		mes "[Eil]";
		mes "In addition, we are raising dancing girls who can become celebrities in Rune-Midgarts." ;
		next;
		mes "[Eil]";
		mes "What do you think?" ;
		mes "I can get fancy lights and dance in front of lots of people." ;
		mes "Isn't it wonderful!" ;
		next;
		mes "[ail]";
		mes "But our dance school is different from the others in that it is not open to everyone." ;
		next;
		mes "[Eil]";
		mes "If you don't think you can be a Dancer, the school will turn you down." ;
		next;
		mes "[Eil]";
		mes "I don't know, your sister seems to have the right qualities." ;
		mes "Would you like to take dance lessons here?" ;
		next;
		cutin "job_dancer_eir02",2;
		mes "[eir]";
		mes "Just fill out a little bit on the application form there." ;
		next;
		cutin "job_dancer_eir01",2;
		mes "[eir]";
		mes "What do you think?" ;
		mes "Would you like to apply?" ;
		mes "Hey? How about a tour as well?" ;
		next;
		if(select("Yes, I'll try it", "ignore")==2) {
			mes "[ail]";
			mes "Oh no. ...... That's cold. ......" ;
			mes "Please stop by again, okay?" ;
			mes "Hey?" ;
			break;
		}
		if(JobLevel < 40) {
			mes "[ail]";
			mes "Erm, ......" ;
			mes "Nice try, but it looks like you didn't meet the requirements to take the lesson: ......" ;
			next;
			mes "[ail]";
			mes "I can't accept your application until you are at least JobLv 40." ;
			mes "Then we look forward to seeing you again." ;
			break;
		}
		cutin "job_dancer_eir02",2;
		mes "[eir]";
		mes "Well decided!" ;
		mes "Please fill out the application form there." ;
		next;
		mes "......" ;
		next;
		mes "...... crunchy......" ;
		next;
		mes "......" ;
		next;
		cutin "job_dancer_eir01",2;
		mes "[eir]";
		mes "Your name is ......" ;
		mes ""+strcharinfo(0)+ "......"" ;
		mes "That's a great name!" ;
		mes "Then please wait a moment." ;
		mes "I will deliver the documents to the school director." ;
		set CHANGE_DC,1;
		break;
	case 1:
		mes "[ail]";
		mes "Yes, you applied earlier, didn't you?" ;
		mes "Then you will need to prepare the necessary items for the lesson." ;
		next;
		mes "[ail]";
		mes "I'm missing some of the equipment. ......." ;
		mes "Please go ahead and get them for your own lessons." ;
		next;
		mes "[ail]";
		mes "And just in case you need ^0000FF lesson fee of 10000Zeny^000000. Also, ";
		switch(rand(3)) {
			case 0:
				set CHANGE_DC,2;
				mes "You will need 5 ^0000FF worm skins^000000 to prevent shoes from slipping." ;
				next;
				mes "[ail]";
				mes "And a pair of ^0000FF boots^000000 to avoid foot injuries." ;
				break;
			case 1:
				set CHANGE_DC,3;
				mes "And 2 ^0000FF shells to decorate the Costume ^0000000000FF and";
				next;
				mes "[ail]";
				mes "We need 5 ^0000FF yellow potions ^000000 to apply to injured feet, and also 20 ^000000FF zero peas ^000000 to replace the ointment." ;
				next;
				mes "[ail]";
				mes "The rest is ......." ;
				mes "Make a performance wig^0000FF long hair 10^000000"; mes "Make a performance wig^000000FF long hair 10^000000";
				next;
				mes "[Eil]";
				mes "We also need one pair of ^0000FF sandals^000000 to wear to avoid injury." ;
				break;
			case 2: // dialog appropriate, unexamined
				set CHANGE_DC,4;
				mes "20 ^0000FF sticky liquid ^00000000FF red potions 5 ^00000000FF zero peas 3 ^00000000FF shoes ^00000000FF shoes ^00000000";
				break;
		}
		next;
		mes "[ail]";
		mes "Then call on me again when you are ready for your lesson." ;
		break;
	case 2:
	case 3:
	case 4:
		switch(CHANGE_DC) {
			case 2:
				setarray '@need,1055,2405;
				setarray '@amount,5,1;
				break;
			case 3:
				setarray '@need,965,503,909,1020,2401;
				setarray '@amount,2,5,20,10,1;
				break;
			case 4:
				setarray '@need,938,501,909,2403;
				setarray '@amount,20,5,3,1;
				break;
		}
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
			if(countitem('@need['@i]) < '@amount['@i] || Zeny < 10000)
				break;
		}
		if('@i < getarraysize('@need))) {
			mes "[ail]";
			mes "un ......" ;
			mes "Looks like I'm a little short." ;
			mes "I'll tell you again what you need, so please go get it ready." ;
			next;
			mes "[ail]";
			mes "^0000FF lesson fee 10000 Zeny^000000";
			for(set '@i,0; '@i<getarraysize('@need)-1; set '@i,'@i+1)
				mes "^0000FF" +getitemname('@need['@i])+ " " +'@amount['@i]+ "piece^000000^000000FF" +getitemname('@need['@i])+ "^000000";
			next;
			mes "[ail]";
			mes "That's all." ;
			mes "I'll be waiting." ;
			break;
		}
		cutin "job_dancer_eir02",2;
		mes "[eir]";
		mes "Oh, you've got it all." ;
		mes "Then I'll take your lesson fee." ;
		set Zeny,Zeny-10000;
		next;
		cutin "job_dancer_eir01",2;
		//fall through
	case 5:
	case 6:
		mes "[eir]";
		mes "Go to the interview examiner ^0000FF "Borwage" ^000000, the teacher in charge of the interview exam." ;
		mes "You will only have to answer a few simple questions, so please relax and take it." ;
		if(CHANGE_DC < 6)
			set CHANGE_DC,5;
		break;
	default:
		mes "[ail]";
		mes "Please practice diligently and show us your wonderful dance!" ;
		break;
	}
	close2;
	cutin "dummy",255;
	end;
}

//==========================================
// Secondary and career change
//------------------------------------------

job_dancer.gat,95,93,4 script volwage 101,{
	if(Job == Job_Dancer) {
		mes "[Borwage]";
		mes "Oh, hello~";
		next;
		mes "[Borwage]";
		mes "How are you these days?" ;
		mes "Are you impressing a lot of people?" ;
		mes "Always remember to be a Dancer." ;
		close;
	}
	if(Job ! = Job_Archer || Sex == 1) {
		mes "[Borwage]";
		mes "Oh, you came from outside?" ;
		mes "You've come a long way to see my wonderful dancing. ......" ;
		next;
		mes "[borwage]";
		mes "While I'm still here, I've already retired from active dance and I'm focusing on training younger dancers." ;
		next;
		mes "[Borwage]";
		mes "If you go to the dance stage in the center of the village, you will see my daughter, who has inherited my dance well, dancing." ;
		close;
	}
	if(SkillPoint) {
		mes "[Borwage]";
		mes "You cannot change jobs if you have any SkillPoints left." ;
		mes "Go ahead and spend them." ;
		close;
	}
	switch(CHANGE_DC) {
	default: //when 0-4
		mes "[Borwage]";
		mes "Oh, you're an aspiring Dancer girl." ;
		next;
		mes "[Borwage]";
		mes "If you want to be a Dancer, you should first apply to our school." ;
		mes "Ask Eil, who is around the left side of the stage, and he will tell you everything you need to know." ;
		close;
	case 5:
		mes "[Borwage]";
		mes "Oh, you're an aspiring Dancer." ;
		next;
		mes "[Borwage]";
		mes "...... I need to tone up a bit more." ;
		next;
		mes "[Borwage]";
		mes "Don't worry so much." ;
		mes "Your body will be ready during the lesson." ;
		mes "There are also body-shaping lessons. Hmmm... ......." ;
		next;
		mes "[borwage]";
		mes "So I'd like to know how you are prepared to be a Dancer, so I'd like to ask you a few questions. It's an interview in case you're interested, but it's just a few simple questions, so feel free." ;
		break;
	case 6:
		mes "[Borwage]";
		mes "Cheer up!" ;
		break;
	case 7:
		mes "[Borwage]";
		mes "Then we will go to the practice." ;
		mes "Before we do that, let's talk about a few Attention matters, shall we?" ;
		next;
		if(select("Ask Attention Matters", "Move to the examination site")==2) {
			set CHANGE_DC,8;
			mes "[Borwage]";
			mes "Good luck then!" ;
			close2;
			warp "job_duncer.gat",104,109;
			end;
		}
		mes "[borwage]";
		mes "Actually, this is an audition." ;
		mes "with a time limit of ^0000FF1 minutes ^000000";
		next;
		mes "[Borwage]";
		mes "^0000FFOne by one, you will take a turn ^000000 dancing." ;
		mes "Don't worry if you have no dance experience." ;
		next;
		mes "[Bollwage]";
		mes "When you enter the hall, you will see the stage, and you must first stand in the ^000000FF position where you can see the entire ^000000FF stage." ;
		next;
		mes "[Borwage]";
		mes "^0000FFYou have to be ^000000 so that you can see well to the front, back, left, and right." ;
		mes "Double click the right mouse button and the direction is also initially ......." ;
		mes "I'm not too familiar with photography terminology, but ......." ;
		next;
		mes "[vorwage]";
		mes "Please wait your turn in the ^0000FF waiting room ^000000 until the signal to begin." ;
		mes "When the person in front of you drops out or the time is up, it's your turn." ;
		next;
		mes "[borwage]";
		mes "If there are a lot of people, the waiting room may be full. If that's the case, make sure you line up in the right order." ;
		next;
		mes "[Borwage]";
		mes "When the audition starts, an announcement will be made and you will be told which direction to move based on your initial standing position. You can move accordingly." ;
		next;
		mes "[Bollwage]";
		mes "If you cannot match the timing within the ^0000FF specified time, you will be eliminated ^000000 immediately." ;
		mes "We're going to be strict!" ;
		close;
	case 8:
		mes "[Borwage]";
		mes "Oh, you're that girl from earlier. ......" ;
		mes "Come on, again!" ;
		mes "Get into the rhythm!" ;
		close2;
		warp "job_duncer.gat",104,109;
		end;
	case 9:
		mes "[borwage]";
		mes "Oh my, that was a nice dance you just did!";
		next;
		mes "[Bollwage]";
		mes "If you can dance like that, you are good enough to be a Dancer." ;
		mes "Come on, I'll let you change jobs." ;
		next;
		mes "[Borwage]";
		mes "Thou art now ...... with the blessings of the Goddess";
		next;
		mes "[Borwage]";
		mes "Be the Dancer who brings joy to all ......" ;
		next;
		set '@itemid,(JobLevel >= 50)? 1953: 1950;
		mes "[Borwage]";
		mes "henceforth whenever thou doth dance";
		next;
		unequip;
		jobchange Job_Dancer;
		set CHANGE_DC,0;
		mes "[borwage]";
		mes "May the smiles of the people overflow ......" ;
		next;
		mes "[Borwage]";
		mes "This is my gift to you." ;
		mes "Congratulations on your success!" ;
		getitem '@itemid,1;
		close;
	}
	// oral exam here
	next;
	switch(rand(3)) {
	case 0:
		mes "[Bollwage]";
		mes "1. What is the effect of the Dancer/Bard ensemble skill "Loki's Cry"?" ;
		next;
		if(select("Improves attack power of level 4 weapons", "doubles damage", "disables skills and magic in range", "increases attack speed")==3)
			set '@point,'@point+10;
		mes "[volwage]";
		mes "2. After dancing on the dance floor, what is the least polite thing you can do to your opponent?" ;
		next;
		if(select("thanking your partner", "praising your dance", "inviting your partner to dance other dances", "saying your partner is not good enough for you")==4)
			set '@point,'@point+10;
		mes "[volwage]";
		mes "3. If someone makes a mistake in a dance, what do you do when you notice it?" ;
		next;
		if(select("Keep smiling and keep dancing", "Point out the mistake", "Pretend not to notice", "Smile secretly")==2)
			set '@point,'@point+10;
		mes "[volwage]";
		mes "4. What is the name of the village where you can change your job to Dancer?" ;
		next;
		if(select("Kokomo", "Sandalman", "Comomo", "Comodo")==4)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "5. How many caves are directly connected to Comodo?" ;
		next;
		if(select("1", "2", "3", "4")==3)
			set '@point,'@point+10;
		mes "[volwage]";
		mes "6. Which of the following monsters cannot be petted?" ;
		next;
		if(select("Isis", "Argiope", "Dokebi", "Deviruchi")==2)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "7. Who is the best dancer?" ;
		next;
		switch (select(strcharinfo(0), "Master Borwage", "Isis", "Merci")) {
			case 1:
				set '@point,'@point-100;
				mes "............" ;
				next;
				break;
			case 2:
				set '@point,'@point+10;
				break;
		}
		mes "[Borwage]";
		mes "What is the name of the Kafra Service location in 8.Comodo?" ;
		next;
		if(select("Kafra Service headquarters", "Kafra Service western region", "Kafra Service", "Kafra Service western branch")==4)
			set '@point,'@point+10;
		mes "[......]" ;
		mes "9. What is my name?" ;
		next;
		if(select("bonsoir", "bourgeois", "beaurage", "bonjour")==3)
			set '@point,'@point+10;
		mes "[Bollwage]";
		mes "10. What is the ability of the skill "Lullaby"?" ;
		next;
		if(select("dark effect on surroundings", "sleep effect on surroundings", "all night effect on surroundings", "freezing effect on surroundings")==2)
			set '@point,'@point+10;
		break;
	case 1:
		mes "[volwage]";
		mes "1. What is the effect of Dancer's "Practice Dance" skill?" ;
		next;
		if(select("Increase INT", "Increase the effect of Dance skill", "Increase the damage of whip-based attacks", "Stun effect on a certain area")==2)
			set '@point,'@point+10;
		mes "[volwage]";
		mes "2. What is the name of a dance in which the dancers wear special shoes that produce a high-pitched sound and step to a lively rhythm?" ;
		next;
		if(select("tap dance", "concentration improvement", "tango", "double strafing")==1)
			set '@point,'@point+10;
		mes "[Bollwage]";
		mes "3. Choose the one that is far from the characteristics of Dancer." ;
		next;
		if(select("mastery of dance skills", "long range attacks", "use of whip", "use of two-handed sword")==4)
			set '@point,'@point+10;
		mes "[vorwage]";
		mes "4. Which city has the most Dancers?" ;
		next;
		if(select("Aldebaran", "Yuno", "Morroc", "Comodo")==4)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "5. Who performs the most beautiful dance?" ;
		next;
		switch (select(strcharinfo(0), "Master Borwage", "Isis", "Emeraldhandas")) {
			case 1:
				set '@point,'@point-100;
				mes "............" ;
				next;
				break;
			case 2:
				set '@point,'@point+10;
				break;
		}
		mes "[Bollwage]";
		mes "6. Answer the points in which Dancer excels compared to other professions." ;
		next;
		if(select("physical strength", "acting ability", "dancing ability", "magic ability")==3)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "7. What is the name of the manager of the Comodo casino?" ;
		next;
		if(select("Lou", "Moe", "Martin", "Lawyer")==3)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "8. What items can't Dancer equip?" ;
		next;
		if(select("cat ear hair band", "two-handed sword", "sandals", "earrings")==2)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "9. Is the exam boring?" ;
		next;
		if(select("yes", "no")==2)
			set '@point,'@point+10;
		mes "[volwage]"; next; if(select("yes", "no")==2) set '@point,'@point+10; next
		mes "10. How many lighthouses are there in total on Pharos Lighthouse Island?" ;
		next;
		if(select("1", "2", "3")==1)
			set '@point,'@point+10;
		break;
	case 2:
		mes "[volwage]";
		mes "1. Which ability value does the Dancer's dance "Kiss of Fortune" raise?" ;
		next;
		if(select("INT", "DEX", "VIT", "Critical rate")==4)
			set '@point,'@point+10;
		mes "[volwage]";
		mes "2. Which of the following is not a dance?" ;
		next;
		if(select("Tango", "Tap Dance", "Hip-Hop(HIP-HOP)", "Creative Dance", "Lightning Bolt")==5)
			set '@point,'@point+10;
		mes "[volwage]";
		mes "3. What word in the following describes the profession of Dancer?" ;
		next;
		if(select("loud person", "noisy person", "dancing person", "singing person")==3)
			set '@point,'@point+10;
		mes "[borwage]";
		mes "4. Which of the following do not fit Comodo's characteristics?" ;
		next;
		if(select("City on the beach", "Dancer can change jobs", "Always dark as night", "Dungeons in 3 directions around", "Many Thief")==5)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "5. What is the name of the place west of the Pharos Lighthouse Island on the way to Comodo from outside?" ;
		next;
		if(select("Hermes Plate", "Comoco Beach", "Kokomo Beach", "Jinai Swamp")==3)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "6. Who is the most beautiful dancing girl in the world?" ;
		next;
		switch (select(strcharinfo(0), "Lady Borwage", "Eil", "Bonjour")) {
			case 1:
				set '@point,'@point-100;
				mes "............" ;
				next;
				break;
			case 2:
				set '@point,'@point+10;
				break;
		}
		mes "[Bollwage]";
		mes "7. Which of the following occupations can be chorused with Dancer?" ;
		next;
		if(select("Assassin", "Bard", "Alchemist", "Sage")==2)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "8. What is not a Comodo specialty?" ;
		next;
		if(select("berserk potion", "shell", "crab shell", "glowing stone")==4)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "9. Who is the manager of the Comodo casino?" ;
		next;
		if(select("Lawyer", "Moe", "G.J.", "Lou")==2)
			set '@point,'@point+10;
		mes "[Borwage]";
		mes "10. What is the name of the Dancer School application representative?" ;
		next;
		if(select("Borwage", "Eil", "Assinia", "Snotra")==2)
			set '@point,'@point+10;
		break;
	}
	mes "[Borwage]";
	mes "Yes, good work~";
	next;
	mes "[Borwage]";
	mes "The result of the interview is " +'@point+ "point ......"" ;
	if( (CHANGE_DC == 5 && '@point < 80) || (CHANGE_DC == 6 && '@point < 70) ) {
		mes "Failed." ;
		mes "I don't want this to happen." ;
		set CHANGE_DC,6;
		next;
		mes "[Borwage]";
		mes "Was it a little difficult?" ;
		mes "But I could do better when I was younger, you know?" ;
		mes "Go back and study again." ;
		close;
	}
	if('@point < 100) {
		mes "There were a few points that bothered me, but that's ok." ;
	}
	} else
		mes "Excellent. You passed." ;
	next;
	mes "[Bollwage]";
	mes "This is about right." ;
	mes "The dance practice doesn't work like that, but if you work hard, you can make it work." ;
	set CHANGE_DC,7;
	close;
}

//==========================================
// Tertiary test
//
// - 4
// --- ≡ 513
// - 2
//
// *Same as the infield position in baseball.
//------------------------------------------

job_duncer.gat,32,152,6 script Info Staff::DC_Test 69,{
	// Dance step judgment
	function Judgement {
		for(set '@i,1; '@i<=5; set '@i,'@i+1) {
			if('@i ! = getarg(0))
				hideoffnpc "#DC_Step "+'@i; //Hide release except for specified tile
		}
		return;
	}
	//Hide all tiles
	function HideTile {
		hideonnpc "#DC_Step1";
		hideonnpc "#DC_Step2";
		hideonnpc "#DC_Step3";
		hideonnpc "#DC_Step4";
		hideonnpc "#DC_Step5";
		return;
	}
	// back Dancer Emotion
	function EmotionDancer {
		emotion 21, "DC_Dancer1"; }
		emotion 21, "DC_Dancer2"; }
		emotion 21, "DC_Dancer3"; emotion 21, "DC_Dancer3";
		emotion 21, "DC_Dancer4";
		return;
	}
	end;
OnInit:
	waitingroom "Dance lesson waiting room",20, "DC_Test::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	awake "DC_Test";
	HideTile;
	killmonster "job_duncer.gat", "DC_Test::OnKilled"; //This mackerel is not killed here, but it is troublesome so kill it
	warpwaitingpc "job_duncer.gat",70,111,1;
	set 'accid,$@warpwaitingpc[0];
	initnpctimer;
	end;
OnTimer1000:
	announce "Bollwage: Here we go, let's begin. Relax. The time limit is one minute." ,9;
	end;
OnTimer3000:
	announce "Borwage: yes, back! : [up]",9;
	sleep 3000;
	Judgement 4;
	end;
OnTimer7000:
	EmotionDancer;
	HideTile;
	announce "Vorwage: previous~ : [↓]",9;
	sleep 3000;
	Judgement 2;
	end;
OnTimer11000:
	EmotionDancer;
	HideTile;
	announce "Vorwage: left~ : [←]",9;
	sleep 3000;
	Judgement 5;
	end;
OnTimer15000:
	EmotionDancer;
	HideTile;
	announce "Vorwage: turn right : [→]",9;
	sleep 3000;
	Judgement 3;
	end;
OnTimer19000:
	EmotionDancer;
	HideTile;
	announce "Borwage: back to the middle : [...]",9;
	sleep 2000;
	Judgement 1;
	end;
OnTimer21000:
	EmotionDancer;
	announce "Bollwage: Pause as you are! ",9;
	end;
OnTimer24000:
	EmotionDancer;
	announce "Borwage: after the pause, improvise "improve concentration" and so on! ",9;
	end;
OnTimer26000:
	Announce "Borwage: as is~ ",9;
	end;
OnTimer27000:
	HideTile;
	OnTimer27000: HideTile; announce "Borwage: to the left ~ : [←]",9. sleep 3000; end; OnTimer27000: HideTile
	sleep 3000;
	Judgement 5;
	end;
OnTimer31000:
	EmotionDancer;
	HideTile;
	announce "Borwage: previous ~ : [↓] ",9;
	sleep 2000;
	Judgement 2;
	end;
OnTimer34000:
	EmotionDancer;
	HideTile;
	announce "Borwage: right away! : [→] ",9;
	sleep 1500;
	Judgement 3;
	end;
OnTimer36000:
	EmotionDancer;
	announce "Borwage: Yes Pause! ",9;
	end;
OnTimer39000:
	EmotionDancer;
	HideTile;
	announce "Volwage: left, middle, right, back~ : [←][∙][→][↑] ",9;
	sleep 5000;
	Judgement 4;
	end;
OnTimer45000:
	EmotionDancer;
	HideTile;
	announce "Borwage: [→] ",9;
	sleep 2000;
	Judgement 3;
	end;
OnTimer48000:
	EmotionDancer;
	HideTile;
	announce "Borwage: left, middle, front, back : [←][∙][↓][↑] ",9;
	sleep 5000;
	Judgement 4;
	end;
OnTimer54000:
	EmotionDancer;
	HideTile;
	announce "Borwage: again, left, middle, front, back : [←][∙][↓][↑] ",9;
	sleep 5000;
	Judgement 4;
	end;
OnTimer60000:
	EmotionDancer;
	HideTile;
	announce "Vorwage: previous~ : [↓]",9;
	sleep 3000;
	Judgement 2;
	end;
OnTimer64000:
	EmotionDancer;
	HideTile;
	announce "Borwage: left : [←] ",9;
	sleep 3000;
	Judgement 5;
	end;
OnTimer68000:
	EmotionDancer;
	HideTile;
	announce "Borwage: middle : [...] ",9;
	sleep 3000;
	Judgement 1;
	end;
OnTimer72000:
	if(getareausers("job_duncer.gat",65,109,73,111) + getareausers("job_duncer.gat",68,106,70,114) > 0) {
		if(attachrid('accid))
			set CHANGE_DC,9; //clear fixed at this point regardless of AS
	}
	EmotionDancer;
	HideTile;
	announce "Bollwage: Decide with Arrow Shower! ",9;
	monster "job_dancer.gat",69,106, "Dance Poring",1002,1, "DC_Test::OnKilled";
	end;
OnKilled:
	stopnpctimer;
	announce "dance: nice shot!" ,9;
	sleep 5000;
	announce "dance: good job! You must have appealed to Mr. Bollwage!",9;
	//fall through
OnTimer78000:
	stopnpctimer;
	killmonster "job_duncer.gat", "DC_Test::OnKilled";
	areawarp "job_duncer.gat",65,109,73,111, "comodo.gat",188,162; //Tile 5,1,3 range
	areawarp "job_duncer.gat",68,106,70,114, "comodo.gat",188,162; //Tile 2,1,4 range
	enablewaitingroomevent;
	end;
}

//==============================================================
job_duncer.gat,69,110,4 script #DC_Step1 139,1,1,{
	end;
OnTouch:
	announce "dance: " +strcharinfo(0)+ "~ timing delayed!" ,9;
	areawarp "job_duncer.gat",65,109,73,111, "comodo.gat",188,162;
	areawarp "job_duncer.gat",68,106,70,114, "comodo.gat",188,162;
	emotion 23, "DC_Dancer1";
	emotion 23, "DC_Dancer2";
	emotion 23, "DC_Dancer3";
	emotion 23, "DC_Dancer4";
	enablewaitingroomevent "DC_Test"; //The timer does not stop, only the chat is enabled.
	end;
OnInit:
	hideonnpc;
	end;
}

job_duncer.gat,69,107,4 duplicate(#DC_Step1) #DC_Step2 139,1,1
job_duncer.gat,72,110,4 duplicate(#DC_Step1) #DC_Step3 139,1,1
job_duncer.gat,69,113,4 duplicate(#DC_Step1) #DC_Step4 139,1,1
job_duncer.gat,66,110,4 duplicate(#DC_Step1) #DC_Step5 139,1,1

//==============================================================
job_duncer.gat,69,110,4 script #DC_Dummy1 101,{ //Dummy NPC just to prevent getting on cell
	end;
OnInit:
	hideonnpc;
	end;
}

job_duncer.gat,69,107,4 duplicate(#DC_Dummy1) #DC_Dummy2 101
job_duncer.gat,72,110,4 duplicate(#DC_Dummy1) #DC_Dummy3 101
job_duncer.gat,69,113,4 duplicate(#DC_Dummy1) #DC_Dummy4 101
job_duncer.gat,66,110,4 duplicate(#DC_Dummy1) #DC_Dummy5 101

//==============================================================
job_duncer.gat,63,110,4 script backDancer::DC_Dancer1 724,{}
job_duncer.gat,66,113,4 script back Dancer::DC_Dancer2 724,{}
job_duncer.gat,72,113,4 script back Dancer::DC_Dancer3 724,{}
job_duncer.gat,75,110,4 script back Dancer::DC_Dancer4 724,{}
