//====================================================================
//Ragnarok Online EP4.0(J) Super Novice Jobchange Script
// - CHANGE_SNV -> 0 to 1
// - CHANGE_SNV -> 0 to 1
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

aldeba_in.gat,223,167,3 script tosere 709,{
	if(Upper == UPPER_HIGH) {
		mes "[Tzele]";
		mes "You are now a member of the fine Novice Club ......" ;
		next;
		mes "[Tosere]";
		mes "Yeah yeah!!! Oh, you are!　You~! - Jiriri~! -";
		next;
		mes "- clang! -";
		next;
		mes "[Tzele]";
		mes "What?  Yes, yes, yes." ;
		mes "I understand. Yes. ......." ;
		mes "Ah!  No, no!" ;
		mes "I haven't said anything yet." ;
		mes "Yes, I understand." ;
		mes "- I put down the receiver. -";
		next;
		mes "[Tosere]";
		mes "............" ;
		mes "Well, good day to you~" ;
		close;
	}
	if(Job == Job_SuperNovice || Job == Job_ExpandedSuperNovice) {
		mes "[Tosere]";
		mes "You are now a member of the fine Novice Club. You don't have anything special to excel at, but there's nothing particularly wrong with you." ;
		mes "You are such a normal and respectable Novice." ;
		next;
		mes "[Tosere]";
		mes "Please continue to live a normal and ordinary life, enjoy it, work hard, and spread the Novice presence far and wide." ;
		close;
	}
	if(Job ! = Job_Novice) {
		mes "[Tzele]";
		mes "Mmmm! You are not a normal and ordinary person! My name is Tozele, the unofficial boss of the Novice Club." ;
		next;
		mes "[Tozele]";
		mes "This is a place where people like you, who are not normal and ordinary, will never have a chance in life." ;
		mes "It's okay, we don't expect you to understand our belief in Ghost, and we don't expect you to understand us either." ;
		next;
		mes "[Tzele]";
		mes "...... The world has such and such people. That's just the way it is." ;
		close;
	}
	if(CHANGE_SNV == 0) {
		mes "[Tosere]";
		mes "You there! It's you!!! Your whole body is telling you that you are normal and ordinary!" ;
		mes "You are like a man born for us!" ;
		next;
		mes "[Tosere]";
		mes "What do you think?" ;
		mes "Why don't you join our Novice Club, think and act in a normal and ordinary way with us, follow a normal and ordinary path, and enjoy a normal and ordinary life to the fullest?" ;
		next;
		mes "[Tosere]";
		mes "In return, if you become a member, I'll give you a new job in Supernovice, the highest rank in Novice." ;
		next;
		switch (select("I'll join", "I won't join", "I'll listen to some more explanation")) {
		case 1:
			if(getskilllv(1) < 9 || SkillPoint) {
				mes "[Tzele]";
				mes "Oh well, ...... I am a remaining GOST, but I don't think I have the ability to withstand a job change yet." ;
				mes "Please grow your JobLv to 10 and ^0000FF "Basic Skill" level to 9 ^000000." ;
				next;
				mes "[Tzele]";
				mes "The level of ^0000FF "Basic Skills" ^000000 can be raised in the ^0000FF "Skill List" ^000000 window." ;
				mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
				next;
				mes "[Tzele]";
				mes "To increase the level of a skill, the ^FF000000 'Confirm' ^000000 button is required after assigning the skill points." ;
				mes "Please Attention." ;
				close2;
				cutin "start_020_jp.bmp",4;
				end;
			}
			if(BaseLevel < 45) {
				mes "[tozele]";
				mes "Oh well, ...... It seems that the remaining ghosts are not yet strong enough to withstand the change of jobs. Please come back after your base level reaches ^0000FF45 or higher ^000000." ;
				close;
			}
			mes "[Tzele]";
			mes "Oooh. In this day and age, living a normal, ordinary life is the path of the briars! I'm surprised that you dare to choose that path. ......" ;
			mes "Well done for making up your mind!" ;
			next;
			mes "[Tosere]";
			mes "Ordinary...... Ordinary ...... Good word." ;
			mes "Don't you think so?" ;
			next;
			mes "[Tosere]";
			mes "But not everyone can become a Novice Club member simply by applying. There is a normal and mundane eligibility test." ;
			next;
			mes "[Tzele]";
			mes "Go to a map that is normal and ordinary, befitting a normal and ordinary life, and bring an ordinary item with you." ;
			mes "Hmmm ...... I still think ^FF0000 sticky liquid^000000 and ^FF000000 old tree dew^000000 would be good here." ;
			next;
			mes "[Tosere]";
			mes "Come and collect the two items ^FF00000030 ^000000 each. Hey, hey, this number is also really normal and ordinary~." ;
			next;
			mes "[Tzele]";
			mes "Then, we are waiting for your return~." ;
			set CHANGE_SNV,1;
			setquest 6010;
			close;
		case 2:
			mes "[tozele]";
			mes "oh oh ......" ;
			mes "You seem to have no idea of the joys of the ordinary and mundane path." ;
			mes "...... Oh well. Life is full of things." ;
			mes "You have to decide your own path." ;
			next;
			mes "[Tosere]";
			mes "If you ever change your mind, you are always welcome." ;
			close;
		case 3:
			mes "[Tosere]";
			mes "Eh, Hen. You say you want to know more about our club." ;
			mes "Good! I will tell you all about it!" ;
			next;
			mes "[Tzele]";
			mes "First of all, I must start with the story of Kim Jong-Nim, the founder of the Novice Club. Kim is saddened to see that people are forgetting the importance of normal, ordinary life. ......"; next; mes "[tozele]"; mes "[tozele]" ;
			next;
			mes "- You had to listen to Tozere's speech for 10 minutes ...... -";
			next;
			mes "[Tozele]";
			mes "...... And so the Novice Club continues to this day, with our motto of normal and ordinary, and we are proud to be normal and ordinary, and we are proud to be a Novice Club!" ;
			mes "Ehhhhh!!!" ;
			close;
		}
	}
	if(countitem(938) < 30 || countitem(907) < 30) {
		mes "[Tzele]";
		mes "Oh, did you forget the item you need? I will explain it to you again. May I?" ;
		next;
		mes "[Tosere]";
		mes "^FF0000 sticky liquid ^000000 and ^FF000000 old tree dew^000000. Please don't forget it this time!" ;
		close;
	}
	mes "[Tosere]";
	mes "Yes, as I expected, you seem to be the one who was born to lead a normal and ordinary life! I saw that you are qualified enough to join our Novice Club." ;
	next;
	mes "[Tosere]";
	mes "Then, as promised, we will send you to Supernovice: ...... Hmmm?" ;
	mes "Ahhhhh, on your back !!!!!!" ;
	next;
	if(select("What!?" , "what?!") ==1) {
		mes "- you turned around -- but nothing ...... -- Oh? A moment later, you thought "Oh? -";
	}
	else {
		mes "- - You were so startled by Tosere's words that you let out a cry -- at that moment! -";
	}
	next;
	delitem 938,30;
	delitem 907,30;
	getitem 2339,1;
	unequip;
	jobchange Job_SuperNovice;
	set CHANGE_SNV,0;
	chgquest 6010,50275;
	mes "[tozele]";
	mes "Ha ha ha! Are you surprised?" ;
	mes "A little prank to spawn a different kind of normal and mundane routine: ......." ;
	mes "That is the creed of this Tosere." ;
	next;
	mes "[Tosere]";
	mes "Well, let's not talk about that." ;
	mes "As a result, you are now a fine Supernovice." ;
	next;
	mes "[Tzele]";
	mes "What I gave you is the legendary armor that the legendary Kim-Jeong-Nim also wore!" ;
	mes "Please use it!" ;
	next;
	mes "[Tzele]";
	mes "Well then, good day~. Please continue to live a normal, ordinary life and let the non-ordinary people know about our Novice Club." ;
	close;
OnInit:
	waitingroom "job change",0;
	end;
}

//==============================================================
aldeba_in.gat,216,169,5 script seray 86,{
	if(Job == Job_SuperNovice || Job == Job_ExpandedSuperNovice) {
		mes "[Seray]";
		mes "Oh, oh, oh, oh, oh, oh, oh, oh, oh, oh, oh, oh, !!!! Aren't you a member of our Novice Club!" ;
		next;
		mes "[Seray]";
		mes "Keep up the good work!" ;
		mes "Let's continue to live a normal and ordinary life!" ;
		next;
		mes "[Seray]";
		mes "Oh, by the way, I am the number one member directly under Toserei-sama! Ehmen!" ;
		close;
	}
	if(Job ! = Job_Novice) {
		mes "[Seray]";
		mes "Tsk! Pui!!! I don't know anyone who's escaped the normal and mundane path!" ;
		mes "At best, live dangerously and unordinary to the fullest!" ;
		mes "Pui pui!!!" ;
		close;
	}
	mes "[Seray]";
	mes "You still really don't understand the joys of the ordinary and mundane road!!!" ;
	mes "You should be part of the Novice Club, hey?" ;
	next;
	mes "[Seray]";
	mes "Novice is still the best!" ;
	mes "Wahhhh!!!" ;
	close;
}


//==========================================
// dedicated cart service
//------------------------------------------

aldebaran.gat,54,238,5 script Kafra Staff 117,{
	if(Job ! = Job_SuperNovice && Job ! = Job_ExpandedSuperNovice) {
		mes "[Kafra Staff]";
		mes "Hello~. I am sorry, but there is nothing I can do for you. Please try another Kafra Staff." ;
		close;
	}
	mes "[Kafra Staff]";
	mes "Oh, it's Supernovice." ;
	mes "What, the other Kafra Staff, can't you lend me a cart?" ;
	mes "Don't worry!" ;
	next;
	mes "[Kafra Staff]";
	mes "I, here at Supernovice, will be happy to lend you a private cart." ;
	mes "I'm secretly lending it to you in secret, though, because it conflicts with the orders of the Kafra headquarters." ;
	mes "Tehe." ;
	next;
	mes "[Kafra Staff]";
	mes "So much for the preface!" ;
	mes "The cart usage fee is ^FF00001900zeny^000000." ;
	next;
	mes "[Kafra Staff]";
	mes "You must have the "pushcart" skill to use the cart." ;
	mes "Without that skill, you will not be able to use the cart and only the money will disappear." ;
	mes "Are you ready?" ;
	next;
	if(select("borrow cart", "don't borrow cart")==1) {
		mes "[Kafra Staff]";
		mes "The service here is a private service so I am not able to check if you guys are getting the "push cart"." ;
		mes "Are you okay? If you don't have a 'push cart' you won't be able to use your cart and your money will just disappear." ;
		next;
		if(select("It's ok!" , "wait a minute")==1) {
			if(Zeny < 1900) {
				mes "[Kafra Staff]";
				mes "Sorry about that." ;
				mes "It looks like you don't have enough money." ;
				close;
			}
			set Zeny,Zeny-1900;
			set KAFRA_PIT,KAFRA_PIT+190;
			setcart;
			mes "[Kafra Staff]";
			mes "Thank you for your interest." ;
			mes "Thank you for using Kafra Service Inc. even though it is not a legitimate service." ;
			close;
		}
	}
	mes "[Kafra Staff]";
	mes "We look forward to seeing you again." ;
	mes "Thank you very much." ;
	close;
}
