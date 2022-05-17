//====================================================================
//Ragnarok Online Acolyte jobchange script
// - CHANGE_AL -> 0 to 1, 0 to 6(Old)
// - CHANGE_AL -> 0 to 1, 0 to 6(Old)
// CHANGE_PR -> For Priest job change
// OLD_CLASS -> Job before changing jobs
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

prt_church.gat,184,41,4 script Cathedral Priest#AL 60,{
	if(Upper == UPPER_HIGH && (getbaseclass(Class) ! = CLASS_AL)) {
		mes "[Father Marcis]";
		mes "You have been through many trials." ;
		mes "I have heard about your success." ;
		next;
		if(OLD_CLASS ! = Job_Priest && OLD_CLASS ! = Job_Monk) {
			mes "[Father Marcis]";
			mes "But you cannot go the way of Acolyte." ;
			mes "You must see another way." ;
			mes "You must devote yourself to that path." ;
			close;
		}
		if(getskilllv(1) < 9 || SkillPoint) {
			mes "[Father Marcis]";
			mes "Well, I would love to give you a new job at Acolyte right now, but I guess that's not going to happen." ;
			mes "We need to grow his JobLv to 10, and his ^0000FF "Basic Skill" level to 9^000000." ;
			next;
			mes "[Father Marcis]";
			mes "The ^0000FF "Basic Skills" ^000000FF level would be raised in the ^0000FF "Skill List" ^000000 window." ;
			mes "The ^0000FF 'Skill List' ^000000 window will be displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
			next;
			mes "[Father Marcis]";
			mes "To increase the level of a skill, you need to press the ^FF000000 "Confirm"^000000 button after assigning the skill point." ;
			mes "Attention is required." ;
			mes "Then we look forward to seeing you again." ;
			close;
		}
		mes "[Father Marcis]";
		mes "I welcome you with open arms as you pursue the path of the priesthood." ;
		next;
		unequip;
		jobchange Job_Acolyte,UPPER_HIGH;
		//setquest 50940;
		skill 156,1,0;
	}
	if(Upper == UPPER_HIGH && (getbaseclass(Class) == CLASS_AL)) {
		mes "[Father Marcis]";
		mes "Now, please continue to work even harder as a messenger of God." ;
		mes "May your future be blessed!" ;
		close;
	}
	mes "[Father Marcis]";
	mes "How may I help you?" ;
	next;
	switch (select("Change job to Acolyte", "Ask Acolyte job conditions", "Quit")) {
	case 1:
		if(Job == Job_Acolyte) {
			mes "[Father Marcis]";
			mes "Are you not feeling well somewhere ......?" ;
			mes "Isn't that outfit already Acolyte?" ;
			mes "You don't think that was a joke?" ;
			next;
			mes "[Father Marcis]";
			mes "Oh yes, if you are Acolyte, I suggest you visit the Adventurer's Academy." ;
			next;
			mes "[Father Marcis]";
			mes "When you leave this cathedral, you will find someone who provides support for the Adventurers Academy and you can ask him to send you there." ;
			close;
		}
		if(Job ! = Job_Novice) {
			mes "[Father Marcis]";
			mes "Don't you already have another job?" ;
			close;
		}
		break;
	case 2:
		mes "[Father Marcis]";
		mes "Do you want to be Acolyte?" ;
		mes "Then you must overcome the conditions I am about to mention as a test from God." ;
		next;
		mes "[Father Marcis]";
		mes "First, you must raise your ^0000FF "basic skills" to 9^000000." ;
		mes "This is the training you need to live in this world, and it is for your own good." ;
		next;
		mes "[Father Marcis]";
		mes "When you fulfill that condition, come back here." ;
		mes "Then you will be able to enter the holy profession of God's angel." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 3:
		mes "[Father Marcis]";
		mes "Then." ;
		close;
	}
	//case 0
	if(CHANGE_AL==0) {
		mes "[Father Marcis]";
		mes "Are you sincerely going to be God's messenger?" ;
		next;
		if(select("Yes." mes "[Father Marcis]"; mes "I still don't want to.") ==2) {
			mes "[Father Marcis]";
			mes "Then." ;
			close;
		}
		set CHANGE_AL,1;
		mes "[Father Marcis]";
		mes "All right." ;
		mes "Then first tell me your name." ;
		next;
		menu "Tell me your name",-;
		mes "[Father Marcis]";
		mes "Mmm-hmm." ;
		mes " " +strcharinfo(0)+ "; mes " " +strcharinfo(0)+ "." ;
		mes "That's a nice sounding name." ;
		mes "I accept your Acolyte job application." ;
		next;
	}
	mes "[Father Marcis]";
	mes "So, " +strcharinfo(0)+ "." ;
	mes "Are you ready enough to carry out God's will...?" ;
	mes "From now on, I will check if you are worthy of being an Acolyte." ;
	next;
	mes "[Father Marcis]";
	mes "..." ;
	next;
	mes "[Father Marcis]";
	mes "......" ;
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[Father Marcis]";
		mes "What? You haven't even done the basic training yet!" ;
		mes "In order for you to grow, you need to grow your JobLv to 10 and your ^0000FF "basic skill" level to 9^000000." ;
		next;
		mes "[Father Marcis]";
		mes "The ^0000FF "Basic Skills" ^000000FF level would be raised in the ^0000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window will be displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Father Marcis]";
		mes "To increase the level of a skill, you need to press the ^FF000000 "Confirm"^000000 button after assigning the skill point." ;
		mes "Attention is required." ;
		mes "Then we look forward to seeing you again." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[Father Marcis]";
	mes "Mm. You have a good vocational level, and you seem to have good qualities as an Acolyte, so that's good." ;
	mes "I accept your will and grant you the qualifications to be an Acolyte." ;
	next;
	getitem 11034,1;
	set CHANGE_AL,0;
	setquest 50345;
	unequip;
	jobchange Job_Acolyte;
	mes "[Father Marcis]";
	mes "We give thanks to God who always watches over us, and no matter what hardships and trials may come our way, we will keep our faith and offer ourselves to God." ;
	next;
	mes "[Father Marcis]";
	mes "If you ever go astray, read the book of Acolyte." ;
	mes "It should help you." ;
	close;
OnInit:
	waitingroom "Job change",0;
	end;
}


//==========================================
// Pilgrimage to the Holy Land (shared with Priest)
//------------------------------------------

prt_fild03.gat,365,255,1 script Priest in training 89,{
	//Acolyte job change
	if(Job == Job_Novice && CHANGE_AL >= 1) {
		mes "[Father Rubalcabara]";
		mes "You are an aspiring Acolyte. ......" ;
		mes "I'm sorry you had to come all the way here, but actually, the exam to get a job at Acolyte has already been eliminated." ;
		next;
		mes "[Father Rubalcabara]";
		mes "Still on the road to Acolyte."
// mes "If you haven't given up, then"; // original spec.
		mes "If you haven't given up, visit Father Marcis." ;
		close;
	}
	//Priest job change
	if(Job == Job_Acolyte) {
		switch(CHANGE_PR) { //issued in npc_job_08priest.txt
		case 0:
			mes "[Father Rubalcabara]";
			mes "I'm sorry. I am in training now." ;
			mes "I can't talk to people." ;
			close;
		case 1:
			mes "[Father Rubalcabara]";
			mes "You're an Acolyte with Priest aspirations..." ;
			mes "Bishop Thomas has been in touch with us. The pilgrimage has just begun, but I hope you will not give up until the end." ;
			next;
			mes "[Father Rubalcabara]";
			mes "If you have the chance, you can always come back..." ;
			mes "This is a sacred place for us..." ;
			next;
			mes "[Father Rubalcabara]";
			mes "Then head on to the next pilgrimage site." ;
			mes "Take care on your way." ;
			set CHANGE_PR,2;
			savepoint "prt_fild03.gat",360,255;
			close;
		case 2:
			mes "[Father Rubalcabara]";
			mes "Hurry up and head to the next pilgrimage site." ;
			mes "Be careful on your way." ;
			close;
		default:
			mes "[Father Rubalcabara]";
			mes "Why did you come here?" ;
			mes "You have your own training." ;
			close;
		}
	}
	mes "[Father Rubalcabara]";
	mes "Oh, you've come all this way to train in the backcountry?" ;
	mes "Be careful, the monsters here are quite strong, unlike their appearance." ;
	close;
}

//==============================================================
moc_fild07.gat,41,355,4 script Sister in training 95,{
	//Acolyte job change
	if(Job == Job_Novice && CHANGE_AL >= 1) {
		mes "[Matilda]";
		mes "You are a pilgrim, aren't you?" ;
		mes "I'm sorry you had to come all the way here, but the exam to change jobs to Acolyte has already been eliminated." ;
		next;
		mes "[Matilda]";
		mes "Still on the road to Acolyte."
// mes "If you haven't given up,"; // original spec.
		mes "If you haven't given up, visit Father Marcis." ;
		close;
	}
	//Priest job change
	if(Job == Job_Acolyte) {
		switch(CHANGE_PR) { //issued in npc_job_08priest.txt
		case 0:
			mes "[Matilda]";
			mes "May God bless you..." ;
			close;
		case 1:
			mes "[Matilda]";
			mes "You are a pilgrim, aren't you?" ;
			mes "But before you visit me, you must visit someone else." ;
			next;
			mes "[Matilda]";
			mes "Why don't you ask Mr. Bishop Thomas or Mr. Cecil?" ;
			mes "May God bless you..." ;
			close;
		case 2:
			mes "[Matilda]";
			mes "Oh, you are a Priest practitioner, aren't you?" ;
			mes "Thank you for traveling so far - we Priests have to preach the faith to all on earth." ;
			next;
			mes "[Matilda]";
			mes "When you become a Priest, please come to the Pyramid of Morroc." ;
			mes "There are a lot of undead there." ;
			mes "Please let them go..." ;
			next;
			mes "[Matilda]";
			mes "Then please take care..." ;
			mes "May God bless you..." ;
			set CHANGE_PR,3;
			savepoint "moc_fild07.gat",36,355;
			close;
		case 3:
			mes "[Matilda]";
			mes "Well, don't stay here, go to the next pilgrimage site..." ;
			close;
		default:
			mes "[Matilda]";
			mes "What brings you here?" ;
			mes "Continue your training." ;
			close;
		}
	}
	mes "[Matilda]";
	} mes "......" ;
	close;
}

//==============================================================
prt_fild00.gat,208,218,4 script Priest in training 98,{
	//Acolyte job change
	if(Job == Job_Novice && CHANGE_AL >= 1) {
		mes "[Father Yosuke]";
		mes "Are you an Acolyte practitioner?" ;
		mes "I'm sorry you had to come all the way here, but the test to change jobs to Acolyte has already been eliminated." ;
		next;
		mes "[Father Yosuke]";
		mes "Still on the road to Acolyte."
// mes "If you haven't given up, then"; // original spec.
		mes "If you haven't given up, visit Father Marcis." ;
		close;
	}
	//Priest job change
	if(Job == Job_Acolyte) {
		switch(CHANGE_PR) { //issued in npc_job_08priest.txt
		case 0:
			mes "[Father Yosuke]";
			mes "Acolyte, huh? It's been a long time.";
			close;
		case 1:
		case 2:
			mes "[Father Yosuke]";
			mes "Yeah, Priest practitioner." ;
			mes "I've visited here often." ;
			next;
			mes "[Father Yosuke]";
			mes "But before you come to ask for me, you should see someone else." ;
			mes "The early word is that you made a mistake." ;
			next;
			mes "[Father Yosuke]";
			mes "Go back to the cathedral and check it out." ;
			close;
		case 3:
			mes "[Father Yosuke]";
			mes "Yeah, Priest practitioner." ;
			mes "I've visited here often." ;
			next;
			mes "[Father Yosuke]";
			mes "Good, live rightly in the name of Priest." ;
			next;
			mes "[Father Yosuke]";
			mes "Go back to the cathedral." ;
			mes "Your pilgrimage ends here." ;
			mes "[Father Yosuke]"; mes "I'm amazed you've made the journey this far." ;
			mes "Be careful on your way back." ;
			set CHANGE_PR,4;
			savepoint "prt_fild00.gat",205,231;
			close;
		case 4:
			mes "[Father Yosuke]";
			mes "Hmm? Aren't you going back to the cathedral?" ;
			mes "Or do you want to stay here forever?" ;
			close;
		default:
			mes "[Father Yosuke]";
			mes "Hey, stop playing around here and become a Priest." ;
			close;
		}
	}
	mes "[Father Yosuke]";
	mes "......" ;
	close;
}
