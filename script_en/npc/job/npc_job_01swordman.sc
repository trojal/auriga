//====================================================================
//Ragnarok Online Swordman jobchange script
// - CHANGE_SM -> 0 to 1, 0 to 4(Old)
// - CHANGE_SM -> 0 to 1, 0 to 4(Old)
// OLD_CLASS -> occupation before reincarnation
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

izlude_in.gat,74,172,4 script Swordsman Guild Member#SM 119,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Knight || OLD_CLASS == Job_Crusader)) {
		if(Job == Job_Novice) {
			mes "[Swordsman Guild Member]";
			mes "Hahaha!" ;
			mes "You're so glad to hear that you want to be a Swordsman again, even if you're born again!" ;
			next;
			if(getskilllv(1) < 9) {
				mes "[Swordsman Guild Member]";
				mes "I'm busy right now, so come back when you've wielded a few more swords." ;
				mes "First, I'm going to grow my JobLv to 10 and get my ^0000FF "Basic Skill" level to 9 ^000000." ;
				next;
				mes "[Swordsman Guild Member]";
				mes "Just to let you know, the level of ^0000FF "Basic Skills" ^000000 can be raised in the ^0000FF "Skill List" ^000000 window." ;
				next;
				mes "[Swordsman Guild Member]";
				mes "And because the ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
				next;
				mes "[Swordsman Guild Member]";
				mes "Lastly, don't forget that to level up a skill, you need to press the ^FF000000 "Confirm" ^000000 button after assigning the skill points." ;
				mes "You should Attention." ;
				next;
				mes "[Swordsman Guild Member]";
				mes "I don't know what you've been doing, but if you keep this up, you won't be recognized as a Swordsman." ;
				close;
			}
			mes "[Swordsman Guild Member]";
			mes "Okay, no problem." ;
			mes "No special procedures are needed." ;
			mes "We'll get you a new job right away." ;
			next;
			unequip;
			jobchange Job_Swordman,UPPER_HIGH;
			//setquest 50615;
			//setquest 50670;
			//setquest 50725;
			skill 144,1,0;
			skill 145,1,0;
			skill 146,1,0;
			mes "[Swordsman Guild Member]";
			mes "Okay, it's tightening up." ;
			mes "Don't skip your training from now on!" ;
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[Swordsman Guild Member]";
		mes "Yeah?" ;
		mes "What?" ;
		mes "I am a member of the Swordsman Guild." ;
		next;
		mes "[Swordsman Guild Member]";
		mes "What the hell is this ......?" ;
		mes "I'm sleepy right now." ;
		mes "If you don't need me, please leave." ;
		close;
	}
	mes "[Swordsman Guild Member]";
	mes "I am the job changer here at the Swordsman Guild! What do you want?" ;
	next;
	switch (select("Changing jobs to Swordsman", "Ask about Swordsman", "Ask about Swordsman job requirements", "Nothing")) {
	case 1:
		if(Job == Job_Swordman) {
			mes "[Swordsman Guild Member]";
			mes "Wahahaha!" ;
			mes "Isn't that funny Jordan!" ;
			mes "You're a Swordsman now, right?" ;
			next;
			mes "[Guildmember Mahnsoo]";
			mes "You're a funny guy!" ;
			mes "If you're a Swordsman, you should try the Adventurer's Academy." ;
			next;
			mes "[Guildmember Mahnsoo]";
			mes "When you leave this building, there's a guy who supports the Adventurer's Academy, you can ask him to send you there!" ;
			close;
		}
		if(Job ! = Job_Novice) {
			mes "[Swordsman Guild Member]";
			mes "Haha!  That's totally weird!" ;
			mes "You're already in another profession!" ;
			close;
		}
		break;
	case 2:
		mes "[Swordsman Guild Member]";
		mes "Want to know about Swordsman?" ;
		mes "Okay, let me explain!" ;
		next;
		mes "[Swordsman Guild Member]";
		mes "The biggest thing about Swordsman is that it is most powerful in close quarters combat!" ;
		mes "There are three reasons why Swordsman is the strongest in close combat!" ;
		next;
		mes "[Swordsman Guild Member]";
		mes "First, they have more HP than other professions!" ;
		mes "Second, you can use all weapons except bows and staffs! So you can choose the weapon you need depending on the situation!" ;
		next;
		mes "[Swordsman Guild Member]";
		mes "Third, Swordsman's skills are usually powerful physical blows." ;
		mes "This is a brief description, but it should suffice." ;
		mes "Because Swordsman is the best looking profession in the world, and no explanation is needed in the first place!" ;
		close;
	case 3:
		mes "[Swordsman Guild Member]";
		mes "You want to be a Swordsman!" ;
		if(Job ! = Job_Novice) {
			if(Job == Job_Swordman) {
				mes "...... I mean, you're already a Swordsman, right ......?" ;
			}
			else {
				mes "But you're already in another profession, aren't you?" ;
			}
			mes "Still want to ask ......?" ;
			mes "Well, then I'll tell you." ;
		}
		mes "[Swordsman Guild Member]";
		mes "To become a Swordsman, you must first raise your ^0000FF "Basic Skills" level to 9^000000." ;
		next;
		mes "[Swordsman Guild Member]";
		mes "It means that first, you have to grow your JobLv to 10, and then go to the level of ^0000FF "Basic Skills" to 9^000000." ;
		mes "The level of ^0000FF "Basic Skills" ^000000FF can be raised in the ^000000FF "Skill List" ^000000 window." ;
		next;
		mes "[Swordsman Guild Member]";
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Swordsman Guild Member]";
		mes "Lastly, don't forget that to level up a skill, you need to press the ^FF000000 "Confirm"^000000 button after assigning the skill point." ;
		mes "You should Attention." ;
		next;
		mes "[Swordsman Guild Member]";
		mes "Well, if you do what I just said, you have all the requirements to become a Swordsman, and you can change jobs whenever you want." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 4:
		mes "[Swordsman Guild Member]";
		mes "Haha! You remind me of my youth!" ;
		close;
	}
	//continuation of case1
	if(CHANGE_SM=0) {
		mes "[Swordsman Guild Member]";
		mes "Would you like to change jobs with Swordsman?" ;
		mes "Okay, then go ahead and apply." ;
		next;
		if(select("Apply for a new job", "Stop")==2) {
			mes "[Swordsman Guild Member]";
			mes "Well, ...... Come back if you change your mind." ;
			close;
		}
		mes "[Swordsman Guild Member]";
		mes "Sign there ...... OK!" ;
		mes "Let's get this application processed right away." ;
		mes "Oh, you can change jobs as soon as you meet the job change requirements." ;
		mes "Do you want to find out if you meet the job change requirements?" ;
		next;
		if(select("Yes", "No")==2) {
			mes "[Swordsman Guild Member]";
			mes "If there's any part of the job change requirements you don't know about, ask me." ;
			mes "Now all you have to do is fulfill the requirements we've given you. Well, good luck!" ;
			close;
		}
		set CHANGE_SM,1;
		mes "[Swordsman Guild Member]";
		mes "How?  Well, let's check it out, shall we?" ;
		next;
	}
	mes "[Swordsman Guild Member]";
	mes "Well then, let's get started and see if we can get a new job at Swordsman!" ;
	next;
	mes "[Swordsman Guild Member]";
	mes "...... Hou." ;
	next;
	mes "[Swordsman Guild Member]";
	mes "...... Hmmm." ;
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[Swordsman Guild Member]";
		mes "Hey, dude. Your "Basic Skills" level is not at the specified level." ;
		mes "First, go grow your JobLv to 10, and then go ^0000FF "Basic Skill" level to 9^000000." ;
		next;
		mes "[Swordsman Guild Member]";
		mes "The level of ^0000FF "Basic Skills" ^000000FF can be raised in the ^000000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Swordsman Guild Member]";
		mes "Lastly, don't forget that to level up a skill, you need to press the ^FF000000 "Confirm"^000000 button after assigning the skill points." ;
		mes "Attention, please." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[Swordsman Guild Member]";
	mes "^0000FF "Basic Skills" ^000000 level is good enough, and you seem to have the guts." ;
	mes "It looks like you're not quite ready for a real-world test, but I'm sure you'll be fine once you gain more experience!" ;
	next;
	mes "[Swordsman Guild Member]";
	mes "Congratulations!" ;
	mes "You are about to enter the wonderful profession of Swordsman!" ;
	mes "I appoint you Swordsman!" ;
	next;
	getitem 11025,1;
	unequip;
	jobchange Job_Swordman;
	set CHANGE_SM,0;
	setquest 50165;
	mes "[Swordsman Guild Member]";
	mes "And you can take this!" ;
	mes "Read this Swordsman's Book and you will walk properly as a Swordsman!" ;
	next;
	mes "[Swordsman Guild Member]";
	mes "Congratulations once again on becoming a Swordsman. I hope you will help the Swordsman Guild a lot from now on!" ;
	close;
OnInit:
	waitingroom "changing jobs",0;
	end;
}


//==========================================
// on-the-job test
//------------------------------------------
//job test removal
//izlude_in.gat,62,170,6 script Swordsman Guild Member 85,{
// if(Job == Job_Swordman) {
// mes "[Swordsman Guild Member]"
// mes "Stop! This is a beginner's field test site!" ;
// mes "You've already changed jobs, there's no reason for you to enter!" ;
// mes "Go home!" ;
// close;
// }
// if(Job ! = Job_Novice) {
// mes "[Swordsman Guild Member]";
// mes "Who are you! You're already in another profession";
// mes "You, don't come here!" ;
// close;
// }
// if(getskilllv(1) < 9) {
// mes "[Swordsman Guild Member]"
// mes "Stop! The beginner skill points are ";
// mes "This is no place for an amateur who is not even 9!" ;
// mes "When your skill points reach 9 or more, ";
// mes "I'll make you enter the job change test center." ;
// close;
// }
// switch(CHANGE_SM) {
// case 0:
// mes "[Swordsman Guild Member]";
// mes "Stop! Swordsman Job Change Examination."
// mes "If you want to take it, fill out the job change application";
// mes "Write it first!" ;
// close;
// default:
// warp "izlude_in.gat",39,170;
// end;
// case 4:
// mes "[Swordsman Guild Member]";
// mes "Stop! First, ask the Guild Member in the center";
// mes "Ask first!" ;
// close;
// }
//}

//==============================================================
izlude_in.gat,30,175,4 script Swordsman Guild Member 92,{
	mes "[Swordsman Guild Member]";
	mes "Let me give you a quick rundown on the practical test!" ;
	mes "Listen carefully and don't ask any strange questions later!" ;
	next;
	mes "[Swordsman Guild Member]";
	mes "The purpose of this test is to test if you have the talent of a swordsman, which requires a strong physical strength and a strong mentality!" ;
	mes "Of course, if you don't have the talent, you will fail the exam." ;
	next;
	mes "[Swordsman Guild Member]";
	mes "The ^33ff55 passing requirement^000000 for the exam is soooo easy!" ;
	mes "All you have to do is successfully complete the entire course at the exam site and get a passing certificate from the examiner waiting for you at the last checkpoint." ;
	next;
	mes "[Swordsman Guild Member]";
	mes "On the contrary, if you declare an abandonment or fail to arrive at the last checkpoint, you will fail, if you want to declare an abandonment, you can go back to each course entrance or talk to the officials at each checkpoint." ;
	next;
	mes "[Swordsman Guild Member]";
	mes "You should Attention because the exam site has three courses and if you leave the course, you will fall into a random location in the underground caverns." ;
	mes "Good luck then." ;
	close;
}

//==============================================================
izlude_in.gat,30,163,0 script Laboratory Personnel 105,{
	switch(CHANGE_SM) {
	default:
		mes "[Laboratory Personnel]";
		mes "Mm, how did you get in here?" ;
		close2;
		warp "izlude_in.gat",63,169;
		end;
	case 1:
		mes "[Laboratory Personnel]";
		mes "You want to be a swordsman? Hmm, well, it looks like you've got talent." ;
		mes "Compared to the life to come, the hardships here will be nothing!" ;
		mes "Don't be nervous! You can do it!" ;
		close2;
		set CHANGE_SM,2;
		break;
	case 2:
		mes "[Laboratory Personnel]";
		mes "You failed..." ;
		mes "Take this with you";
		close2;
		getitem 512,5;
		set CHANGE_SM,3;
		break;
	case 3:
		mes "[Laboratory Personnel]";
		mes "Don't give up! Try again!"; mes "Don't give up!
		close2;
		break;
	}
	warp "sword_1-1.gat",10,245;
	end;
}

//==============================================================
sword_1-1.gat,7,245,0 script Test Center Support#1 45,1,3,{
	end;
OnTouch:
	mes "[Test Center Support]";
	mes "Examinee " +strcharinfo(0)+ ", do you want to declare abandonment?" ;
	next;
	if(select("Yes", "No")==1) {
		announce "Test Center Support: student " +strcharinfo(0)+ " has abandoned the exam." ,9;
		warp "izlude_in.gat",65,165;
		end;
	}
	set '@num,strnpcinfo(2);
	switch('@num) {
		case 1: warp "sword_1-1.gat",10,245; break
		case 2: warp "sword_1-1.gat",11,207; break
		case 3: warp "sword_1-1.gat",11,169; break
	}
	end;
}

sword_1-1.gat,8,207,0 duplicate(Test Center Support#1) Test Center Support#2 45,1,1
sword_1-1.gat,8,169,0 duplicate(Test Center Support#1) Test Center Support#3 45,1,1

//==============================================================
sword_1-1.gat,192,244,0 script Test Center Support#4 45,1,3,{
	end;
OnTouch:
	set '@num,strnpcinfo(2);
	announce "Test Center Support: examinees " +strcharinfo(0)+ ", #" +(('@num==4)? "1": ('@num==5)? "2": "3")+ "Point passed." ,9;
	switch('@num) {
		case 4: warp "sword_1-1.gat",215,244; break;
		case 5: warp "sword_1-1.gat",215,205; break
		case 6: warp "sword_1-1.gat",215,167; break
	}
	end;
}

sword_1-1.gat,193,207,0 duplicate(Test Center Support#4) Test Center Support#5 45,1,1
sword_1-1.gat,193,168,0 duplicate(Test Center Support#4) Test Center Support#6 45,1,1

//==============================================================
sword_1-1.gat,230,242,2 script Test Center Support#7 105,{
	mes "[Test Center Support]";
	mes "Declare a waiver?" ;
	next;
	if(select("yes", "no")==1) {
		announce "Test Center Support: student " +strcharinfo(0)+ " has abandoned the exam." ,9;
		warp "izlude_in.gat",65,165;
		end;
	}
	mes "[Test Center Support]";
	mes "Yo!" ;
	mes "Face it with burning young power!" ;
	close;
}

sword_1-1.gat,230,204,2 duplicate(Test Center Support#7) Test Center Support#8 105

//==============================================================
sword_1-1.gat,230,245,2 script Medical Support#1 105,{
	mes "[Medical Support]";
	mes "Here is the first" +((strnpcinfo(2)==1)? "1": "2")+ "This is the checkpoint!" ;
	mes "We're going to get you back to full strength, so hang in there!" ;
	heal 1000,0;
	close;
}

sword_1-1.gat,230,207,2 duplicate(Medical Support#1) Medical Support#2 105

//==============================================================
sword_1-1.gat,223,167,4 script Manstein 92,{
	announce "Manstein: Examinee " +strcharinfo(0)+ ", you have passed the exam.",9;
	set CHANGE_SM,4;
	mes "[Manstein]";
	mes "Congratulations on passing the exam!";
	mes "We have already informed the Job Change Management Department that you have passed the exam.";
	mes "Please leave here and go to the central job change management staff."
	close2;
	warp "izlude_in.gat",66,173;
	end;
}

//==============================================================
sword_1-1.gat,16,250,0 script SM_1stfall -1,{
	switch(rand(5)) {
		case 0: warp "sword_1-1.gat",65,56; end
		case 1: warp "sword_1-1.gat",29,26; end
		case 2: warp "sword_1-1.gat",43,16; end
		case 3: warp "sword_1-1.gat",23,112; end
		case 4: warp "sword_1-1.gat",58,83; end
	}
}
sword_1-1.gat,16,251,0 duplicate(SM_1stfall) #swordwarp6101_a 139,0,1
sword_1-1.gat,19,251,0 duplicate(SM_1stfall) #swordwarp6101_b 139,0,1
sword_1-1.gat,17,250,0 duplicate(SM_1stfall) #swordwarp6101_c 139,1,0
sword_1-1.gat,16,238,0 duplicate(SM_1stfall) #swordwarp6102_a 139,0,1
sword_1-1.gat,19,238,0 duplicate(SM_1stfall) #swordwarp6102_b 139,0,1
sword_1-1.gat,17,239,0 duplicate(SM_1stfall) #swordwarp6102_c 139,0,1
sword_1-1.gat,28,247,0 duplicate(SM_1stfall) #swordwarp6103_a 139,4,0
sword_1-1.gat,33,245,0 duplicate(SM_1stfall) #swordwarp6103_b 139,0,2
sword_1-1.gat,29,242,0 duplicate(SM_1stfall) #swordwarp6103_c 139,4,0
sword_1-1.gat,24,244,0 duplicate(SM_1stfall) #swordwarp6103_d 139,0,2
sword_1-1.gat,38,251,0 duplicate(SM_1stfall) #swordwarp6104_a 139,0,1
sword_1-1.gat,41,251,0 duplicate(SM_1stfall) #swordwarp6104_b 139,0,1
sword_1-1.gat,39,250,0 duplicate(SM_1stfall) #swordwarp6104_c 139,1,0
sword_1-1.gat,38,238,0 duplicate(SM_1stfall) #swordwarp6105_a 139,0,1
sword_1-1.gat,41,238,0 duplicate(SM_1stfall) #swordwarp6105_b 139,0,1
sword_1-1.gat,39,239,0 duplicate(SM_1stfall) #swordwarp6105_c 139,1,0
sword_1-1.gat,54,251,0 duplicate(SM_1stfall) #swordwarp6106_a 139,0,1
sword_1-1.gat,71,251,0 duplicate(SM_1stfall) #swordwarp6106_b 139,0,1
sword_1-1.gat,62,250,0 duplicate(SM_1stfall) #swordwarp6106_c 139,9,0
sword_1-1.gat,62,247,0 duplicate(SM_1stfall) #swordwarp6107_a 139,8,0
sword_1-1.gat,71,244,0 duplicate(SM_1stfall) #swordwarp6107_b 139,0,2
sword_1-1.gat,63,242,0 duplicate(SM_1stfall) #swordwarp6107_c 139,8,0
sword_1-1.gat,54,244,0 duplicate(SM_1stfall) #swordwarp6107_d 139,0,2
sword_1-1.gat,54,238,0 duplicate(SM_1stfall) #swordwarp6108_a 139,0,1
sword_1-1.gat,71,238,0 duplicate(SM_1stfall) #swordwarp6108_b 139,0,1
sword_1-1.gat,62,239,0 duplicate(SM_1stfall) #swordwarp6108_c 139,9,0
sword_1-1.gat,102,247,0 duplicate(SM_1stfall) #swordwarp6109_a 139,2,0
sword_1-1.gat,105,245,0 duplicate(SM_1stfall) #swordwarp6109_b 139,0,2
sword_1-1.gat,103,242,0 duplicate(SM_1stfall) #swordwarp6109_c 139,2,0
sword_1-1.gat,100,244,0 duplicate(SM_1stfall) #swordwarp6109_d 139,0,2
sword_1-1.gat,156,249,0 duplicate(SM_1stfall) #swordwarp6110_a 139,14,0
sword_1-1.gat,156,248,0 duplicate(SM_1stfall) #swordwarp6110_b 139,14,0
sword_1-1.gat,170,249,0 duplicate(SM_1stfall) #swordwarp6110_c 139,1,0
sword_1-1.gat,170,248,0 duplicate(SM_1stfall) #swordwarp6110_d 139,1,0
sword_1-1.gat,156,245,0 duplicate(SM_1stfall) #swordwarp6111_a 139,14,0
sword_1-1.gat,156,244,0 duplicate(SM_1stfall) #swordwarp6111_b 139,14,0
sword_1-1.gat,170,245,0 duplicate(SM_1stfall) #swordwarp6111_c 139,1,0
sword_1-1.gat,170,244,0 duplicate(SM_1stfall) #swordwarp6111_d 139,1,0
sword_1-1.gat,156,241,0 duplicate(SM_1stfall) #swordwarp6112_a 139,14,0
sword_1-1.gat,156,240,0 duplicate(SM_1stfall) #swordwarp6112_b 139,14,0
sword_1-1.gat,170,241,0 duplicate(SM_1stfall) #swordwarp6112_c 139,1,0
sword_1-1.gat,170,240,0 duplicate(SM_1stfall) #swordwarp6112_d 139,1,0
sword_1-1.gat,180,251,0 duplicate(SM_1stfall) #swordwarp6113_a 139,0,1
sword_1-1.gat,183,251,0 duplicate(SM_1stfall) #swordwarp6113_b 139,0,1
sword_1-1.gat,181,250,0 duplicate(SM_1stfall) #swordwarp6113_c 139,1,0
sword_1-1.gat,180,238,0 duplicate(SM_1stfall) #swordwarp6114_a 139,0,1
sword_1-1.gat,183,238,0 duplicate(SM_1stfall) #swordwarp6114_b 139,0,1
sword_1-1.gat,181,239,0 duplicate(SM_1stfall) #swordwarp6114_c 139,1,0

//==============================================================
sword_1-1.gat,56,211,0 script SM_2ndfall -1,{
	switch(rand(5)) {
		case 0: warp "sword_1-1.gat",162,120; end;
		case 1: warp "sword_1-1.gat",94,120; end
		case 2: warp "sword_1-1.gat",94,85; end
		case 3: warp "sword_1-1.gat",162,85; end
		case 4: warp "sword_1-1.gat",130,47; end
	}
}
sword_1-1.gat,26,212,0 duplicate(SM_2ndfall) #swordwarp6201_a 139,10,0
sword_1-1.gat,47,212,0 duplicate(SM_2ndfall) #swordwarp6201_b 139,10,0
sword_1-1.gat,68,212,0 duplicate(SM_2ndfall) #swordwarp6201_c 139,10,0
sword_1-1.gat,87,212,0 duplicate(SM_2ndfall) #swordwarp6201_d 139,10,0
sword_1-1.gat,26,210,0 duplicate(SM_2ndfall) #swordwarp6201_e 139,10,0
sword_1-1.gat,47,210,0 duplicate(SM_2ndfall) #swordwarp6201_f 139,10,0
sword_1-1.gat,68,210,0 duplicate(SM_2ndfall) #swordwarp6201_g 139,10,0
sword_1-1.gat,87,210,0 duplicate(SM_2ndfall) #swordwarp6201_h 139,10,0
sword_1-1.gat,16,206,0 duplicate(SM_2ndfall) #swordwarp6202_a 139,0,3
sword_1-1.gat,97,206,0 duplicate(SM_2ndfall) #swordwarp6202_b 139,0,3
sword_1-1.gat,26,203,0 duplicate(SM_2ndfall) #swordwarp6203_a 139,10,0
sword_1-1.gat,47,203,0 duplicate(SM_2ndfall) #swordwarp6203_b 139,10,0
sword_1-1.gat,68,203,0 duplicate(SM_2ndfall) #swordwarp6203_c 139,10,0
sword_1-1.gat,87,203,0 duplicate(SM_2ndfall) #swordwarp6203_d 139,10,0
sword_1-1.gat,26,201,0 duplicate(SM_2ndfall) #swordwarp6203_e 139,10,0
sword_1-1.gat,47,201,0 duplicate(SM_2ndfall) #swordwarp6203_f 139,10,0
sword_1-1.gat,68,201,0 duplicate(SM_2ndfall) #swordwarp6203_g 139,10,0
sword_1-1.gat,87,201,0 duplicate(SM_2ndfall) #swordwarp6203_h 139,10,0
sword_1-1.gat,113,212,0 duplicate(SM_2ndfall) #swordwarp6204_a 139,14,0
sword_1-1.gat,125,212,0 duplicate(SM_2ndfall) #swordwarp6204_b 139,2,0
sword_1-1.gat,113,210,0 duplicate(SM_2ndfall) #swordwarp6205_a 139,14,0
sword_1-1.gat,125,210,0 duplicate(SM_2ndfall) #swordwarp6205_b 139,2,0
sword_1-1.gat,100,206,0 duplicate(SM_2ndfall) #swordwarp6205_c 139,0,3
sword_1-1.gat,127,206,0 duplicate(SM_2ndfall) #swordwarp6205_d 139,0,3
sword_1-1.gat,113,203,0 duplicate(SM_2ndfall) #swordwarp6205_e 139,14,0
sword_1-1.gat,125,203,0 duplicate(SM_2ndfall) #swordwarp6205_f 139,2,0
sword_1-1.gat,113,201,0 duplicate(SM_2ndfall) #swordwarp6206_a 139,14,0
sword_1-1.gat,125,201,0 duplicate(SM_2ndfall) #swordwarp6206_b 139,2,0
sword_1-1.gat,132,212,0 duplicate(SM_2ndfall) #swordwarp6207_0 139,2,0
sword_1-1.gat,155,212,0 duplicate(SM_2ndfall) #swordwarp6207_a 139,21,0
sword_1-1.gat,181,212,0 duplicate(SM_2ndfall) #swordwarp6207_b 139,2,0
sword_1-1.gat,132,210,0 duplicate(SM_2ndfall) #swordwarp6208_0 139,2,0
sword_1-1.gat,155,210,0 duplicate(SM_2ndfall) #swordwarp6208_a 139,21,0
sword_1-1.gat,181,210,0 duplicate(SM_2ndfall) #swordwarp6208_b 139,2,0
sword_1-1.gat,130,206,0 duplicate(SM_2ndfall) #swordwarp6208_c 139,0,3
sword_1-1.gat,183,206,0 duplicate(SM_2ndfall) #swordwarp6208_d 139,0,3
sword_1-1.gat,132,203,0 duplicate(SM_2ndfall) #swordwarp6208_1 139,2,0
sword_1-1.gat,155,203,0 duplicate(SM_2ndfall) #swordwarp6208_e 139,21,0
sword_1-1.gat,181,203,0 duplicate(SM_2ndfall) #swordwarp6208_f 139,2,0
sword_1-1.gat,132,201,0 duplicate(SM_2ndfall) #swordwarp6209_0 139,2,0
sword_1-1.gat,155,201,0 duplicate(SM_2ndfall) #swordwarp6209_a 139,21,0
sword_1-1.gat,181,201,0 duplicate(SM_2ndfall) #swordwarp6209_b 139,2,0

//==============================================================
sword_1-1.gat,17,174,0 script SM_3rdfall -1,{
	switch(rand(5)) {
		case 0: warp "sword_1-1.gat",195,15; end;
		case 1: warp "sword_1-1.gat",195,38; end
		case 2: warp "sword_1-1.gat",231,30; end
		case 3: warp "sword_1-1.gat",198,65; end
		case 4: warp "sword_1-1.gat",196,116; end
	}
}
sword_1-1.gat,17,174,0 duplicate(SM_3rdfall) #swordwarp6301_a 139,2,0
sword_1-1.gat,17,163,0 duplicate(SM_3rdfall) #swordwarp6302_a 139,2,0
sword_1-1.gat,29,171,0 duplicate(SM_3rdfall) #swordwarp6303_a 139,2,0
sword_1-1.gat,31,168,0 duplicate(SM_3rdfall) #swordwarp6303_b 139,0,2
sword_1-1.gat,28,166,0 duplicate(SM_3rdfall) #swordwarp6303_c 139,2,0
sword_1-1.gat,26,168,0 duplicate(SM_3rdfall) #swordwarp6303_d 139,0,2
sword_1-1.gat,36,169,0 duplicate(SM_3rdfall) #swordwarp6304_a 139,0,0
sword_1-1.gat,37,169,0 duplicate(SM_3rdfall) #swordwarp6304_b 139,0,0
sword_1-1.gat,37,168,0 duplicate(SM_3rdfall) #swordwarp6304_c 139,0,0
sword_1-1.gat,36,168,0 duplicate(SM_3rdfall) #swordwarp6304_d 139,0,0
sword_1-1.gat,40,175,0 duplicate(SM_3rdfall) #swordwarp6305_a 139,0,1
sword_1-1.gat,41,175,0 duplicate(SM_3rdfall) #swordwarp6305_b 139,0,1
sword_1-1.gat,41,171,0 duplicate(SM_3rdfall) #swordwarp6306_a 139,1,0
sword_1-1.gat,41,170,0 duplicate(SM_3rdfall) #swordwarp6306_b 139,1,0
sword_1-1.gat,41,167,0 duplicate(SM_3rdfall) #swordwarp6306_c 139,1,0
sword_1-1.gat,41,166,0 duplicate(SM_3rdfall) #swordwarp6306_d 139,1,0
sword_1-1.gat,42,169,0 duplicate(SM_3rdfall) #swordwarp6306_e 139,0,1
sword_1-1.gat,43,170,0 duplicate(SM_3rdfall) #swordwarp6306_f 139,0,1
sword_1-1.gat,43,167,0 duplicate(SM_3rdfall) #swordwarp6306_g 139,0,1
sword_1-1.gat,40,162,0 duplicate(SM_3rdfall) #swordwarp6307_a 139,0,1
sword_1-1.gat,41,162,0 duplicate(SM_3rdfall) #swordwarp6307_b 139,0,1
sword_1-1.gat,46,175,0 duplicate(SM_3rdfall) #swordwarp6308_a 139,0,1
sword_1-1.gat,51,175,0 duplicate(SM_3rdfall) #swordwarp6308_b 139,0,1
sword_1-1.gat,47,174,0 duplicate(SM_3rdfall) #swordwarp6308_c 139,1,0
sword_1-1.gat,50,174,0 duplicate(SM_3rdfall) #swordwarp6308_d 139,1,0
sword_1-1.gat,48,173,0 duplicate(SM_3rdfall) #swordwarp6308_e 139,0,1
sword_1-1.gat,49,173,0 duplicate(SM_3rdfall) #swordwarp6308_f 139,0,1
sword_1-1.gat,46,162,0 duplicate(SM_3rdfall) #swordwarp6309_a 139,0,1
sword_1-1.gat,51,162,0 duplicate(SM_3rdfall) #swordwarp6309_b 139,0,1
sword_1-1.gat,47,163,0 duplicate(SM_3rdfall) #swordwarp6309_c 139,1,0
sword_1-1.gat,50,163,0 duplicate(SM_3rdfall) #swordwarp6309_d 139,1,0
sword_1-1.gat,48,164,0 duplicate(SM_3rdfall) #swordwarp6309_e 139,0,1
sword_1-1.gat,49,164,0 duplicate(SM_3rdfall) #swordwarp6309_f 139,0,1
sword_1-1.gat,54,170,0 duplicate(SM_3rdfall) #swordwarp6310_a 139,0,1
sword_1-1.gat,55,170,0 duplicate(SM_3rdfall) #swordwarp6310_b 139,0,1
sword_1-1.gat,54,167,0 duplicate(SM_3rdfall) #swordwarp6310_c 139,0,1
sword_1-1.gat,55,167,0 duplicate(SM_3rdfall) #swordwarp6310_d 139,0,1
sword_1-1.gat,53,169,0 duplicate(SM_3rdfall) #swordwarp6310_e 139,1,0
sword_1-1.gat,53,168,0 duplicate(SM_3rdfall) #swordwarp6310_f 139,1,0
sword_1-1.gat,56,169,0 duplicate(SM_3rdfall) #swordwarp6310_g 139,1,0
sword_1-1.gat,56,168,0 duplicate(SM_3rdfall) #swordwarp6310_h 139,1,0
sword_1-1.gat,58,175,0 duplicate(SM_3rdfall) #swordwarp6311_a 139,0,1
sword_1-1.gat,59,174,0 duplicate(SM_3rdfall) #swordwarp6311_b 139,1,0
sword_1-1.gat,60,173,0 duplicate(SM_3rdfall) #swordwarp6311_c 139,0,1
sword_1-1.gat,61,172,0 duplicate(SM_3rdfall) #swordwarp6311_d 139,1,0
sword_1-1.gat,58,162,0 duplicate(SM_3rdfall) #swordwarp6312_a 139,0,1
sword_1-1.gat,59,163,0 duplicate(SM_3rdfall) #swordwarp6312_b 139,1,0
sword_1-1.gat,60,164,0 duplicate(SM_3rdfall) #swordwarp6312_c 139,0,1
sword_1-1.gat,61,165,0 duplicate(SM_3rdfall) #swordwarp6312_d 139,1,0
sword_1-1.gat,76,172,0 duplicate(SM_3rdfall) #swordwarp6313_a 139,1,0
sword_1-1.gat,77,173,0 duplicate(SM_3rdfall) #swordwarp6313_b 139,0,1
sword_1-1.gat,78,174,0 duplicate(SM_3rdfall) #swordwarp6313_c 139,1,0
sword_1-1.gat,79,175,0 duplicate(SM_3rdfall) #swordwarp6313_d 139,0,1
sword_1-1.gat,76,165,0 duplicate(SM_3rdfall) #swordwarp6314_a 139,1,0
sword_1-1.gat,77,164,0 duplicate(SM_3rdfall) #swordwarp6314_b 139,0,1
sword_1-1.gat,78,163,0 duplicate(SM_3rdfall) #swordwarp6314_c 139,1,0
sword_1-1.gat,79,162,0 duplicate(SM_3rdfall) #swordwarp6314_d 139,0,1
sword_1-1.gat,94,175,0 duplicate(SM_3rdfall) #swordwarp6315_a 139,0,1
sword_1-1.gat,95,174,0 duplicate(SM_3rdfall) #swordwarp6315_b 139,1,0
sword_1-1.gat,98,174,0 duplicate(SM_3rdfall) #swordwarp6315_c 139,1,0
sword_1-1.gat,99,175,0 duplicate(SM_3rdfall) #swordwarp6316_d 139,0,1
sword_1-1.gat,96,169,0 duplicate(SM_3rdfall) #swordwarp6317_a 139,0,0
sword_1-1.gat,97,169,0 duplicate(SM_3rdfall) #swordwarp6317_b 139,0,0
sword_1-1.gat,97,168,0 duplicate(SM_3rdfall) #swordwarp6317_c 139,0,0
sword_1-1.gat,96,168,0 duplicate(SM_3rdfall) #swordwarp6317_d 139,0,0
sword_1-1.gat,94,162,0 duplicate(SM_3rdfall) #swordwarp6318_a 139,0,1
sword_1-1.gat,95,163,0 duplicate(SM_3rdfall) #swordwarp6318_b 139,1,0
sword_1-1.gat,98,163,0 duplicate(SM_3rdfall) #swordwarp6318_c 139,1,0
sword_1-1.gat,99,162,0 duplicate(SM_3rdfall) #swordwarp6318_d 139,0,1
sword_1-1.gat,114,175,0 duplicate(SM_3rdfall) #swordwarp6319_a 139,0,1
sword_1-1.gat,115,175,0 duplicate(SM_3rdfall) #swordwarp6319_b 139,0,1
sword_1-1.gat,114,162,0 duplicate(SM_3rdfall) #swordwarp6320_a 139,0,1
sword_1-1.gat,115,162,0 duplicate(SM_3rdfall) #swordwarp6320_b 139,0,1
sword_1-1.gat,126,175,0 duplicate(SM_3rdfall) #swordwarp6321_a 139,0,1
sword_1-1.gat,127,175,0 duplicate(SM_3rdfall) #swordwarp6321_b 139,0,1
sword_1-1.gat,126,162,0 duplicate(SM_3rdfall) #swordwarp6323_a 139,0,1
sword_1-1.gat,127,162,0 duplicate(SM_3rdfall) #swordwarp6323_b 139,0,1
sword_1-1.gat,160,174,0 duplicate(SM_3rdfall) #swordwarp6324_a 139,0,2
sword_1-1.gat,161,174,0 duplicate(SM_3rdfall) #swordwarp6324_b 139,0,2
sword_1-1.gat,160,163,0 duplicate(SM_3rdfall) #swordwarp6325_a 139,0,2
sword_1-1.gat,161,163,0 duplicate(SM_3rdfall) #swordwarp6325_b 139,0,2
sword_1-1.gat,168,175,0 duplicate(SM_3rdfall) #swordwarp6326_a 139,0,2
sword_1-1.gat,169,175,0 duplicate(SM_3rdfall) #swordwarp6326_b 139,0,2
sword_1-1.gat,168,162,0 duplicate(SM_3rdfall) #swordwarp6327_a 139,0,2
sword_1-1.gat,169,162,0 duplicate(SM_3rdfall) #swordwarp6327_b 139,0,2
sword_1-1.gat,176,174,0 duplicate(SM_3rdfall) #swordwarp6328_a 139,0,2
sword_1-1.gat,177,174,0 duplicate(SM_3rdfall) #swordwarp6328_b 139,0,2
sword_1-1.gat,178,173,0 duplicate(SM_3rdfall) #swordwarp6328_c 139,1,0
sword_1-1.gat,178,172,0 duplicate(SM_3rdfall) #swordwarp6328_d 139,1,0
sword_1-1.gat,181,174,0 duplicate(SM_3rdfall) #swordwarp6328_e 139,2,0
sword_1-1.gat,179,169,0 duplicate(SM_3rdfall) #swordwarp6329_a 139,3,0
sword_1-1.gat,179,168,0 duplicate(SM_3rdfall) #swordwarp6329_b 139,3,0
sword_1-1.gat,182,169,0 duplicate(SM_3rdfall) #swordwarp6329_c 139,0,2
sword_1-1.gat,183,169,0 duplicate(SM_3rdfall) #swordwarp6329_d 139,0,2
sword_1-1.gat,181,167,0 duplicate(SM_3rdfall) #swordwarp6329_e 139,1,0
sword_1-1.gat,181,166,0 duplicate(SM_3rdfall) #swordwarp6329_f 139,1,0
sword_1-1.gat,183,167,0 duplicate(SM_3rdfall) #swordwarp6329_g 139,0,1
sword_1-1.gat,176,163,0 duplicate(SM_3rdfall) #swordwarp6330_a 139,0,2
sword_1-1.gat,177,163,0 duplicate(SM_3rdfall) #swordwarp6330_b 139,0,2
sword_1-1.gat,181,163,0 duplicate(SM_3rdfall) #swordwarp6330_c 139,2,0
