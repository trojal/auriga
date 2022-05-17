//====================================================================
//Ragnarok Online Merchant jobchange script
// - CHANGE_MC -> 0 to 1
// - CHANGE_MC -> 0 to 1
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

alberta_in.gat,53,43,6 script Wealthy-looking Merchant#MC 86,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Blacksmith || OLD_CLASS == Job_Alchemist)) {
		if(Job == Job_Novice) {
			mes "[Guildmember Mahnsoo]";
			mes "Hey, what can I do for you?" ;
			mes "I guess you're not a merchant now." ;
			next;
			if(getskilllv(1) < 9) {
				mes "[Guildmember Mahnsoo]";
				mes "Even though we all have a vocation, we all have the same basic things in common." ;
				mes "First, grow your JobLv to 10, and come back when you have ^0000FF "basic skill" level of 9 ^000000." ;
				next;
				mes "[Guildmember Mahnsoo]";
				mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^000000FF "Skill List" ^000000 window." ;
				mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
				next;
				mes "[Guildmember Mahnsoo]";
				mes "To increase the level of a skill, you need to press the ^FF000000 "Confirm" ^000000 button after allocating the skill points." ;
				mes "You have to Attention." ;
				next;
				mes "[Guildmember Mahnsoo]";
				mes "I'm always in the union, come back when you're ready." ;
				close;
			}
			mes "[Guildmember Mahnsoo]";
			mes "But your calling is to be a merchant." ;
			mes "Keep up the good work and keep working!" ;
			next;
			unequip;
			jobchange Job_Merchant,UPPER_HIGH;
			//setquest 51220;
			//setquest 51280;
			//setquest 51335;
			skill 153,1,0;
			skill 154,1,0;
			skill 155,1,0;
			mes "[Guildmember Mahnsoo]";
			mes "Okay, you still look good in that outfit." ;
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[Guildmember Mahnsoo]";
		mes "Ahhhh, I'm bored." ;
		mes "I'm so bored I'm going to blur ......." ;
		mes "I still haven't heard back from the Capra lady. ......" ;
		close;
	}
	mes "[Guildmember Mahnsoo]";
	mes "What do you want from me?" ;
	next;
	switch (select("I want to become a merchant", "What is a merchant?" , "What are the requirements for becoming a merchant?" , "nothing")) {
	case 1:
		if(Job == Job_Merchant) {
			mes "[Guildmember Mahnsoo]";
			mes "Hm?  What are you saying?" ;
			mes "You're not a merchant anymore, not at all." ;
			mes "Was this place supposed to be funny?" ;
			next;
			mes "[Guildmember Mahnsoo]";
			mes "Well, if someone like you became a merchant, maybe you should try the Adventurer's Academy." ;
			next;
			mes "[Guildmember Mahnsoo]";
			mes "When you leave this building, there is a guy who supports the Adventurer Academy, so you can ask him to send you there." ;
			close;
		}
		if(Job ! = Job_Novice) {
			mes "[Guildmember Mahnsoo]";
			mes "We merchant guild members hate people like bats the most." ;
			mes "That kind of guy who does business during the day and wears naughty clothes at night and hangs out in shady bars." ;
			mes "Ugh ...... Disgusting!!!" ;
			next;
			mes "[Guildmember Mahnsoo]";
			mes "Well, it's a long story, but we don't need guys like you in other professions in the merchant guild." ;
		   	close;
		}
		break;
	case 2:
		mes "[Guildmember Mahnsoo]";
		mes "A merchant? Simply put, they sell things and make money. That's what a merchant is." ;
		mes "I'm not a good fighter, and I don't have any great offensive or recovery skills." ;
		mes "But you can get items for cheap." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "There is an ultimate technique called "Memer Knight", but, well, apart from that ......." ;
		mes "I can use most weapons other than bows, staffs, and two-handed swords. ......" ;
		mes "And anyway, a merchant is a money-making profession. That should be enough, right?" ;
		close;
	case 3:
		mes "[Guildmember Mahnsoo]";
		mes "There are some requirements to become a merchant, but it's not that hard." ;
		mes "First, you need to grow your JobLv to 10, and come to a level of ^0000FF "basic skills" of 9^000000." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "The level of ^0000FF "Basic Skills" ^000000 can be raised in the ^0000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "To increase the level of a skill, you need to press the ^FF000000 "Confirm" ^000000 button after allocating the skill points." ;
		mes "You have to Attention." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "No matter how much of a merchant you are, you need to have ^0000FF "Basic Skills" to reach level 9^000000." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 4:
		mes "[Guildmember Mahnsoo]";
		mes "Oh yeah - well, if you change your mind, you can come back here again." ;
		close;
	}
	if(CHANGE_MC == 0) {
		mes "[Guildmember Mahnsoo]";
		mes "You want to be a merchant?" ;
		mes "Fu ......" ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "Okay then, sign this application!" ;
		next;
		if(select("sign the application", "quit")==2) {
			mes "[Guildmember Mahnsoo]";
			mes "Oh yeah - well, if you change your mind, you can come back here again." ;
			close;
		}
		mes "[Guildmember Mahnsoo]";
		mes "Sign the application and go to ......." ;
		mes "Oh yeah, and make sure your signature is neatly written." ;
		mes "You know, sometimes business meetings can fail because your handwriting is so dirty." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "Alright, now I'm going to check if you meet all the requirements to become a Merchant, is that OK?" ;
		next;
		if(select("Yes", "No")==2) {
			mes "[Guildmember Mahnsoo]";
			mes "Right - well, if you change your mind, you can come back here again." ;
			close;
		}
		set CHANGE_MC,1;
		mes "[Guildmember Mahnsoo]";
		mes "Well, let's get on with it and check it out." ;
		next;
	}
	mes "[Guildmember Mahnsoo]";
	mes "The name is ......." ;
	mes " "+ strcharinfo(0) + " "right?" ;
	mes " "+ strcharinfo(0) +" material is more ......" ;
	next;
	mes "[Guildmember Mahnsoo]";
	mes "..." ;
	next;
	mes "[Guildmember Mahnsoo]";
	mes "......" ;
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[Guildmember Mahnsoo]";
		mes "Hey! If you're going to be a merchant, your ^0000FF "Basic Skill" level has to be 9^000000!" ;
		mes "First, you need to grow your JobLv to 10, and then come back when your ^0000FF "Basic Skills" level is 9^000000." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "The level of ^0000FF "Basic Skills" ^000000 can be raised in the ^0000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "To increase the level of a skill, you need to press the ^FF000000 "Confirm" ^000000 button after allocating the skill points." ;
		mes "You have to Attention." ;
		next;
		mes "[Guildmember Mahnsoo]";
		mes "No matter how much money a merchant makes, at the very least, he has to have the basics." ;
		close2;
		cutin "start_020_jp.bmp",1;
		end;
	}
	mes "[Guildmember Mahnsoo]";
	mes "^0000FF "Basic Skills" ^000000 doesn't seem to be a problem." ;
	mes "Okay, you pass!" ;
	mes "Let's start the process to Merchant right away!" ;
	next;
	getitem 11040,1;
	unequip;
	jobchange Job_Merchant;
	set CHANGE_MC,0;
	setquest 50465;
	mes "[Guildmember Mahnsoo]";
	mes "Congratulations!" ;
	mes "The entire union congratulates you on becoming a member of the Merchant Guild." ;
	mes "Keep up the good work." ;
	next;
	mes "[Guildmember Mahnsoo]";
	mes "To achieve our grand goal of securing 20% of the global monetary volume, the power of passionate youth is essential!" ;
	mes "Do you understand?  What I'm saying? Well, that was just a metaphor." ;
	mes "The bottom line is that we're talking about making money." ;
	next;
	mes "[Guildmember Mahnsoo]";
	mes "Also, I just gave you the Merchant's Guild-created Book of Merchant." ;
	mes "You should read it once because it should be useful.";
	close;
OnInit:
	waitingroom "Job change",0;
	end;
}


//==========================================
// package delivery warehouse
//------------------------------------------

alberta_in.gat,28,29,2 script Wealthy-looking Merchant 83,{
	mes "[Union Member Kay]";
	mes "Hi, what can I do for you?" ;
	next;
	switch (select("It's about a career change exam", "It's about a part-time job", "Nothing")) {
	case 1:
		if(Job == Job_Merchant) {
			mes "[Union Member Kay]";
			mes "What are you talking about? You're already a merchant, aren't you?" ;
			close;
		}
		mes "[Union Member Kay]";
		mes "Actually, the exam to become a Merchant has been eliminated." ;
		mes "Therefore, it is possible to become a Merchant without taking the exam, so talk to <Guildmember Mahnsoo> in the center." ;
		close;
	case 2:
		mes "[Union Member Kay]";
		mes "Part-time job? I'm still getting ready." ;
		mes "The General Assembly won't give me a budget." ;
		mes "Totally ......." ;
		close;
	case 3:
		mes "[Union Member Kay]";
		mes "?  ...... Yeah, yeah?" ;
		mes "Yes?" ;
		close;
	}
}


//==========================================
// delivery
//------------------------------------------

prontera.gat,248,42,0 script Kafra Staff::MC_DeliverPro 116,{
	cutin "kafra_02",2;
	mes "[Kafra Staff]";
	mes "Welcome, this is Kafra Corporation." ;
	mes "As you can see, the Swordsmen's Guild has moved from the capital city of Prontera to the satellite city of Izlude." ;
	next;
	mes "[Kafra Staff]";
	mes "We at Kafra Ltd. offer a mobile service from here in Prontera to Izlude for a usage fee of 600 Zeny." ;
	next;
	switch (select("Use", "Confirm Kapra Point", "End")) {
		case 1:
			if(Zeny<600) {
				mes "[Kafra Staff]";
				mes "Sir, it looks like you don't have enough money." ;
				break;
			}
			set Zeny,Zeny-600;
			set KAFRA_PIT,KAFRA_PIT+60;
			warp "izlude.gat",94,103;
			end;
		case 2: //copy from within function
			mes "[Kafra Staff]";
			mes ""+strcharinfo(0)+ "Your points earned are ";
			mes KAFRA_PIT+ "The points are." ;
			next;
			mes "[Kafra Staff]";
			mes "Kafra points can be redeemed for prizes at our Kafra Service headquarters." ;
			mes "Thank you for your continued support of Kafra Service." ;
			break;
		case 3:
			mes "[Kafra Staff]";
			mes "Thank you very much." ;
			break;
	}
	close2;
	cutin "kafra_02",255;
	end;
OnInit:
	// disable npc_town_kafra.txt when this is read
	disablenpc "Kafra Staff#ProSword";
	end;
}

//==============================================================
geffen_in.gat,155,122,4 script Guild Member 47,{
	mes "[Magic Guild Official]";
	mes "It's about time you got your package. ......" ;
	mes "You're late ...... Hmmm ......" ;
	close;
}

//==============================================================
morocc_in.gat,140,102,4 script Apprentice 86,{
	mes "[Apprentice Dyemaker]";
	mes "Dr. Zabadrihan's dyeing skills cannot be imitated by anyone on the Midgard continent!" ;
	mes "He has a wonderful skill." ;
	mes "I am his disciple!" ;
	close;
}

//==============================================================
izlu2dun.gat,106,58,4 script Kafra Staff::MC_DeliverBya 116,{
	cutin "kafra_02",2;
	callfunc "KafraMain",0,0x1da,0,0,0,0,0,40,800;
	end;
OnInit:
	// disable the npc_town_kafra.txt one when this is read
	disablenpc "Kafra Staff#Byalan";
	end;
}
