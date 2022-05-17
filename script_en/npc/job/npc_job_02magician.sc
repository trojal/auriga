//====================================================================
//Ragnarok Online Magician jobchange script
// - CHANGE_MG -> 0-1, 0-4(Old)
// - CHANGE_MG -> 0 to 1, 0 to 4(Old)
// OLD_CLASS -> occupation before reincarnation
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

geffen_in.gat,164,124,4 script Guild Member#MG 123,{
	if(Upper == UPPER_HIGH && (getbaseclass(Class) == CLASS_MG)) {
		mes "[Magician Guild Official]";
		mes "Yeah? What can I do for you ......?" ;
		mes "You don't have time to talk to me." ;
		close;
	}
	if(Upper == UPPER_HIGH) {
		if(Job ! = Job_Novice) {
			mes "[Magician Guild Official]";
			mes "Hey?" ;
			mes "Are you interested in the Magician Guild?" ;
			next;
			mes "[Magician Guild Official]";
			mes "I'm reasonably busy myself." ;
			mes "If you don't have anything special to do, go over there." ;
			close;
		}
		mes "[Magician Guild Official]";
		mes "Hello? It's been a while!" ;
		mes "Yeah, yeah, but I recognized you right away." ;
		mes "And you looked a lot like you did when I first met you." ;
		next;
		if(getskilllv(1) < 9 || SkillPoint) {
			mes "[Magician Guild Official]";
			mes "Hmmm, I can't let you change jobs until you've learned the basics properly like before." ;
			next;
			mes "[Magician Guild Official]";
			mes "Don't worry." ;
			mes "You should at least be able to get your old memories back." ;
			mes "Then you'll be able to use magic again." ;
			close;
		}
		mes "[Magician Guild Official]";
		mes "Well." ;
		mes "It's not a wild idea to make someone take the exam again if they've already passed it once." ;
		mes "You want to use magic as soon as possible, don't you?" ;
		next;
		unequip;
		jobchange Job_Magician,UPPER_HIGH;
		//setquest 50775;
		skill 157,1,0;
		mes "[Magician Guild Official]";
		mes "Yeah, that's a familiar look." ;
		mes "Keep up the good work!" ;
		close;
	}
	mes "[Magician Guild Official]";
	mes "Yes, what brings you here?" ;
	next;
	switch (select("Change to Magician", "Ask Magician's job conditions", "Quit")) {
	case 1:
		if(Job == Job_Magician) {
			mes "[Magician Guild Official]";
			mes "Erm. You are already a Magician, right?" ;
			mes "Don't you even know yourself?" ;
			mes "Well, maybe one day when you can build a bonfire with your bare hands, you'll understand your own Magician's destiny." ;
			next;
			mes "[Magician Guild Official]";
			mes "Oh yeah, have you ever visited the Adventurer Academy after you became a Magician?" ;
			next;
			mes "[Magician Guild Official]";
			mes "If you haven't, you should visit." ;
			mes "When you leave this building, you'll find someone who provides support for the Adventurers Academy, so you can ask him to send you there." ;
			close;
		}
		if(Job ! = Job_Novice) {
			mes "[Magician Guild Official]";
			mes "Ehh. You can't change your job to Magician." ;
			mes "You're already in another profession, aren't you?" ;
			close;
		}
		break;
	case 2:
		mes "[Magician Guild Official]";
		mes "You want to be a Magician?" ;
		mes ""+(Sex? "Brother": "Sister")+ "If a type like you can become a member of the guild, of course you are welcome~";
		next;
		mes "[Magician Guild Official]";
		mes "First of all, you have to get the level of ^0000FF "Basic Skills" to 9^000000." ;
		mes "You need to go and grow your JobLv to 10 and get your ^0000FF "Basic Skill" level to 9^000000." ;
		next;
		mes "[Magician Guild Official]";
		mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^000000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Magician Guild Official]";
		mes "To increase the level of a skill, you will need the ^FF000000 "Confirm"^000000 button after assigning the skill points, so Attention." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 3:
		mes "[Magician Guild Official]";
		mes "Yeah ......? What?" ;
		close;
	}
	//continuation of case1
	if(CHANGE_MG==0) {
		mes "[Magician Guild Official]";
		mes "You want to change your job to Magician?" ;
		mes "Yeah ......" ;
		next;
		mes "[Magician Guild Official]";
		if(Sex == 0) {
			mes "...... Look closely, sis, you're adorable." ;
			mes "I like your type, sis!" ;
		}
		else {
			mes "...... If you look closely, brother, you're cute." ;
			mes "Not my type, but ......." ;
		}
		mes "Well, that's just it, you said you wanted a new job at Magician, right?" ;
		mes "Then please sign the Magician job application here." ;
		next;
		if(select("I want to apply for Magician job change", "I still quit")==2) {
			mes "[Magician Guild Official]";
			mes "What! You said you wanted to be a Magician!" ;
			mes "Pfft!" ;
			close;
		}
		set CHANGE_MG,1;
		mes "[Magician Guild Official]";
		mes "Yeah, sign there ......" ;
		mes "Wow, your handwriting is beautiful - yeah, yeah, there you go." ;
		mes "The name is ......." ;
		mes ""+strcharinfo(0)+ "Hey."" ;
		next;
	}
	mes "[Magician Guild Official]";
	mes "Well then, let's get on with it";
	mes (Sex? "brother": "sister") + "regarding Chan";
	mes "Let me look up some information for you." ;
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[Magician Guild Official]";
		mes "...... If you look closely, you can see that " +(Sex? "Brother": "Sister")+ "Chan, umm, it looks like you're missing a level of ^0000FF "Basic Skill" ^000000." ;
		mes "Go grow your JobLv to 10 and get your ^0000FF "Basic Skill" level to 9^000000." ;
		next;
		mes "[Magician Guild Official]";
		mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^000000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Magician Guild Official]";
		mes "To increase the level of a skill, you will need the ^FF000000 "Confirm"^000000 button after assigning the skill points, so Attention." ;
		mes "First, you need to raise the level of ^0000FF "Basic Skills"^000000 before you come." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[Magician Guild Official]";
	mes "..." ;
	next;
	mes "[Magician Guild Official]";
	mes "......" ;
	next;
	mes "[Magician Guild Official]";
	mes "......... ;mes "[Magician Guild Official]" ;
	mes "I see, I see." ;
	next;
	mes "[Magician Guild Official]";
	mes "Yeah, ...... I've been shown the material about " +(Sex? "Brother": "Sister")+ "Chan, and she seems to be well qualified as a Magician, so this seems to be no problem." ;
	next;
	mes "[Magician Guild Official]";
	mes "Now your application for a new job as a Magician is complete!" ;
	mes "Be the Magician you've always wanted to be!" ;
	next;
	set CHANGE_MG,0;
	setquest 50385;
	getitem 11037,1;
	unequip;
	jobchange Job_Magician;
	mes "[Magician Guild Official]";
	mes "Welcome to the Magician Guild!" ;
	mes "Well, I was just saying hello again, so you don't have to be so shy - I'm just saying, moo";
	next;
	mes "[Magician Guild Official]";
	mes "Anyway, we are now members of the Magician Guild. Congratulations!" ;
	mes "Keep up the good work! Ehehe~";
	next;
	mes "[Magician Guild Official]";
	mes "Also, I gave you the Book of Magician." ;
	mes "It's an instruction manual for novice Magicians created by the Magician Guild." ;
	mes "You should read it." ;
	close;
OnInit:
	waitingroom "Job change",0;
	end;
}

//==============================================================
geffen_in.gat,164,109,2 script Wizard 64,{
	mes "[Wizard]";
	mes "The powerfulness of magic is regulated by the law of causality." ;
	next;
	mes "[Wizard]";
	mes "In short, if you use magic that harms someone or goes against the flow of nature, the repercussions will always come back to the user." ;
	next;
	mes "[Wizard]";
	mes "However, if there is an object that can receive the reaction on behalf of the wizard, then the magic can be used safely." ;
	mes "That is the mysterious ore called 'gemstone'." ;
	close;
}


//==========================================
// Item Synthesis
//------------------------------------------

geffen_in.gat,177,112,0 script bookshelf 111,{
	mes "-Attention writing sticker on the bookshelf-";
	next;
	mes "[Attention]";
	mes "The books on the bookshelf are the property of the Geffen School of Magic." ;
	mes "Please use them neatly." ;
	close;
}


//==========================================
// aqueous solution part time
//------------------------------------------

- script aqueous solution part time job 88,{
	mes "[Magician Guild Official]";
	mes "Would you like to purchase a water solution?" ;
	mes "You will need at least 50 Zeny and one empty test tube." ;
	next;
	if(select("buy aqueous solution", "stop")==2) {
		mes "[Magician Guild Official]";
		mes "We look forward to seeing you again." ;
		close;
	}
	if(Zeny < 50) {
		mes "[Magician Guild Official]";
		mes "Not enough money ......" ;
		mes "The water solution is 50 Zeny." ;
		close;
	}
	if(countitem(1092) < 1) {
		mes "[Magician Guild Official]";
		mes "How do you take the aqueous solution?" ;
// mes "Please bring an empty test tube." ; // this saba spec.
		mes "Please bring an empty test tube." ;
		close;
	}
	set Zeny,Zeny-50;
	delitem 1092,1;
	if(strnpcinfo(2) == "Pay")
		getitem 1089,1;
	if(strnpcinfo(2) == "Moc")
		getitem 1088,1;
	mes "[Magician Guild Official]";
	mes "Thank you very much." ;
	close;
}

pay_arche.gat,120,100,0 duplicate(water solution part time job) water solution part time job#Pay 88
moc_ruins.gat,91,150,0 duplicate(aqueous solution part time job) aqueous solution part time job#Moc 93
