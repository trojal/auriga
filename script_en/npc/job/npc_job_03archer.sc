//====================================================================
//Ragnarok Online Archer jobchange script
// - CHANGE_AC -> 0 to 1
// - CHANGE_AC -> 0 to 1
// OLD_CLASS -> occupation before reincarnation
//====================================================================

//==========================================
// test application and career change
//------------------------------------------

payon_in02.gat,64,71,4 script Guild Member#AC 85,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Hunter || OLD_CLASS == Job_Bard || OLD_CLASS == Job_Dancer)) {
		if(Job == Job_Novice) {
			mes "[ArcherGuild Member]";
			mes "Oh, are you sure ......" ;
			mes "So you're here to become an Archer again!" ;
			next;
			if(getskilllv(1) < 9 || SkillPoint) {
				mes "[ArcherGuild Member]";
				mes "Again, the job change conditions must be in place." ;
				mes "You must grow your JobLv to 10, and your ^0000FF "Basic Skill" level must be 9^000000." ;
				next;
				mes "[ArcherGuild Member]";
				mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^000000FF "Skill List" ^000000 window!" ;
				mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window!" ;
				next;
				mes "[ArcherGuild Member]";
				mes "To increase the level of a skill, you need to press the ^FF000000 "Confirm"^000000 button after assigning the skill point." ;
				mes "Please Attention!" ;
				mes "Then, please do your best!" ;
				close;
			}
			mes "[ArcherGuild Member]";
			mes "There's nothing in particular I have to say." ;
			mes "Good luck getting back to your old senses." ;
			next;
			unequip;
			jobchange Job_Archer,UPPER_HIGH;
			//setquest 50835;
			//setquest 50895;
			skill 147,1,0;
			skill 148,1,0;
			set CHANGE_AC,0;
			mes "[ArcherGuild Member]";
			mes "Please show your face once in a while." ;
			mes "Have a good day." ;
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[ArcherGuild Member]";
		mes "Is this your first time meeting Archer?" ;
		mes "I think we can meet on the way here." ;
		mes "I'm an Archer myself, though." ;
		close;
	}
	mes "[ArcherGuild Member]";
	mes "Hi, what can I help you with?" ;
	next;
	switch (select("Job change to Archer", "What are Archer's job requirements?" , "Nothing.")) {
	case 1:
		if(Job == Job_Archer) {
			mes "[ArcherGuild Member]";
			mes "You have already changed your job to Archer." ;
			next;
			mes "[ArcherGuild Member]";
			mes "If you have become an Archer, you should visit the Adventurer Academy." ;
			next;
			mes "[ArcherGuild Member]";
			mes "When you leave this building, there is a person who provides support for the Adventurer Academy, so you can ask him to send you there." ;
			close;
		}
		if(Job ! = Job_Novice) {
			mes "[ArcherGuild Member]";
			mes "Fu......" ;
			mes "You cannot be an Archer as long as you have chosen another profession." ;
			close;
		}
		break;
	case 2:
		mes "[ArcherGuild Member]";
		mes "Then I will explain the job change conditions for Archer." ;
		if(Job ! = Job_Novice) {
			if(Job == Job_Archer)
				mes "But you are already an Archer. ......" ;
			else {
				mes "But you are already in another profession. ......" ;
			}
			mes "...... Well, okay." ;
		}
		} next;
		mes "[ArcherGuild Member]";
		mes "First, set the level of ^0000FF "Basic Skills" to 9^000000." ;
		mes "Archer is a profession that requires a high degree of concentration, so a moron can never become an Archer." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 3:
		mes "[ArcherGuild Member]";
		mes "Ah ...... Good bye." ;
		close;
	}
	//continuation of case1
	if(CHANGE_AC==0) {
		mes "[ArcherGuild Member]";
		mes "Are you interested in joining Archer?" ;
		mes "If so, please apply for an Archer job change here." ;
		next;
		if(select("Apply for a new job at Archer", "Stop")==2) {
			mes "[ArcherGuild Member]";
			mes "Ah ...... Good-bye." ;
			close;
		}
		mes "[ArcherGuild Member]";
		mes "Sign the application ......." ;
		mes "Yes. This is OK." ;
		mes "I will now check to see if you meet all the requirements to become an Archer. ......" ;
		mes "Are you sure?" ;
		next;
		if(select("Yes." , "No.") ==2) {
			mes "[ArcherGuild Member]";
			mes "Okay." ;
			mes "If you have any questions about the Archer job change requirements, please ask me." ;
			close;
		}
		set CHANGE_AC,1;
		mes "[ArcherGuild Member]";
		mes "Confirmation." ;
		next;
	}
	mes "[ArcherGuild Member]";
	mes "Your name is ......." ;
	mes " " +strcharinfo(0)+ "." ;
	mes "Right?" ;
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[ArcherGuild Member]";
		mes "Oh?" ;
		mes "It seems you are not ready." ;
		mes "Please grow your JobLv to 10 and set your ^0000FF "Basic Skills" level to 9^000000." ;
		next;
		mes "[ArcherGuild Member]";
		mes "The level of ^0000FF "Basic Skills" ^000000 can be raised in the ^0000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[ArcherGuild Member]";
		mes "To increase the level of a skill, you need to press the ^FF000000 "Confirm"^000000 button after assigning the skill points." ;
		mes "Please Attention." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[ArcherGuild Member]";
	mes "Your basic skills seem to be good enough. ......" ;
	mes "You also seem to have developed the concentration skills that are essential for Archer, and you are well qualified to move to Archer." ;
	next;
	mes "[ArcherGuild Member]";
	mes "......" ;
	mes " Yes. Well, now I have the Archer job change conditions. I will change jobs immediately." ;
	next;
	unequip;
	jobchange Job_Archer;
	set CHANGE_AC,0;
	setquest 50055;
	getitem 1702,1;
	getitem 12004,5;
	getitem 11031,1;
	mes "[ArcherGuild Member]";
	mes "Congratulations on your new job with Archer!" ;
	mes "You have received a gift from the production staff." ;
	next;
	mes "[ArcherGuild Member]";
	mes "Archer must have a bow and arrows after all!" ;
	next;
	mes "[ArcherGuild Member]";
	mes "And if you read this Archer's Book, created by our guild, you will know what it takes to be an Archer." ;
	next;
	mes "[ArcherGuild Member]";
	mes "Well then, good luck." ;
	mes "I'm counting on you!" ;
	close;
OnInit:
	waitingroom "Job change",0;
	end;
}
