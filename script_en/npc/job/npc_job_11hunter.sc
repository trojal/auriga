//====================================================================
//Ragnarok Online Hunter jobchange script
// - CHANGE_HT
// - CHANGE_HT
// 1 Sherin's Question
// 2 Shelyn's questions cleared
// 3 Item collection 1
// 4 Item Collection 2
// 5 Item Collection 3
// 6 Item Collection 4
// 7 Item Collection 5
// 8 Item Collection 6
// 9 Item Collection 7
// 10 GuildmasterArcher Village
// 11 Guildmaster Central Palace
// 12 Combat Test
// 13 Combat test in progress
// 14 Combat test cleared
// 15 Get Huiyan - Exam Clear
//
// - $@ht_tester$ -> name of the character taking the combat exam
//====================================================================

//==========================================
// Apply for exam and change jobs
//------------------------------------------

//pay_fild10.gat,148,252,4 script HunterGuild Member 98,{
// mes "[HunterGuild Member]";
// mes "Hello." ;
// mes "If you are looking for the Hunter Guild";
// mes "I will show you around." ;
// next;
// if(select("Please take me there", "I have no special business")==2) {
// mes "[HunterGuild Member]";
// mes "See you then." ;
// close;
// }
// mes "[HunterGuild Member]"
// mes "Yes, I will show you around then." ;
// close2;
// warp "in_hunter.gat",100,18;
// end;
//}

pay_fild10.gat,148,252,3 script Info Board 837,{
	mes "==============Guide ==============Hunter job station has moved to ^FF000000Hugel^000000 in the Republic of Schwartzvald." ;
	next;
	mes "The new Hugel route is now open and you can travel to Hugel by airship." ;
	next;
	mes "Those who are taking the job change exam should come to the new job change office, which has moved to ^FF000000Hugel^000000 in ^FF000000 upper right^000000." ;
	next;
	mes "^844200 (it also says something at the bottom) ^000000...... Falcon administrator went with me." ;
	close;
}

//==============================================================
//in_hunter.gat,99,99,4 script HunterGuild Member 727,{
hu_in01.gat,386,373,4 script HunterGuild Member 727,{
	if(Upper == UPPER_HIGH) {
		mes "[Hunter Sherin]";
		mes "Oh, hello!" ;
		mes "How have you been?" ;
		mes "It's been a long time since we met before. ......" ;
		next;
		mes "[Hunter Sherin]";
		mes "Oh ......?" ;
		mes "I'm sorry, did I have the wrong person?" ;
		next;
		mes "[Hunter Sherin]";
		mes "......" ;
		mes "I'm sure I've seen you somewhere ......" ;
		next;
		mes "[Hunter Sherin]";
		mes "Hmmm, I can't remember." ;
		mes "It's very unusual for me to get people wrong. ......" ;
		mes "Anyway, have a nice day!" ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[HunterGuild Member]";
		mes "Oh my, Mr. Novice..." ;
		mes "I don't see many of those around here...." ;
		close;
	}
	if(Job == Job_Hunter) {
		mes "[HunterGuild Member]";
		mes "Oh," +strcharinfo(0)+ "!" ;
		mes "It's been a while~" ;
		mes "How can I help you today?" ;
		mes "There has been no announcement from the guild, but please take your time." ;
		close;
	}
	if(Job ! = Job_Archer) {
		mes "[HunterGuild Member]";
		mes "Oh, welcome!" ;
		mes "It's a pleasure!" ;
		mes "We don't get many people visiting us anymore..." ;
		close;
	}
	switch(CHANGE_HT) {
	case 0:
		if(JobLevel < 40) {
			mes "[HunterGuild Member]";
			mes "Ah... You are not yet good enough with bows..." ;
			mes "At least, to become a Hunter, you have to have a certain level of training as an Archer." ;
			next;
			mes "[HunterGuild Member]";
			mes "Please go and train a little more." ;
			mes "The exact job change requirement is JobLv40 or higher." ;
			mes "Of course, there is no problem if you train more than that." ;
			mes "Then I look forward to seeing you next time." ;
			close;
		}
		if(SkillPoint) {
			mes "[Hunter Sherin]";
			mes "You cannot change jobs if you still have SkillPoints. Please wait until you have consumed all of them." ;
			close;
		}
		mes "[HunterGuild Member]";
		mes "Oh, you must be Archer." ;
		mes "From the looks of it, you've had quite a bit of training." ;
		mes "And you are visiting us because you wish to change jobs to Hunter?" ;
		next;
		switch(select("Yes, that's why I'm here.", "I'm here to ask you about your job change conditions.", "I'm not changing jobs yet.")) {
			case 1:
				mes "[HunterGuild Member]";
				mes "Hehe, that's a hit!" ;
				mes "Then let's go through the procedure... and..." ;
				next;
				mes "[HunterGuild Member]";
				mes "First, we'll interview you first." ;
				mes "Please answer the questions with ease." ;
				next;
				mes "Gosh..." ;
				next;
				mes "[HunterGuild Member]";
				mes "Oh, I'm late to offer..." ;
				mes "My name is 'Sherin'." ;
				mes "Nice to meet you!" ;
				next;
				mes "[Hunter Sherin]";
				mes "Yes, then we will begin the interview~";
				next;
				if(select("Please come back", "I'm in the middle of an errand, I'll come back later")==2) {
					mes "[Hunter Sherin]";
					mes "Then, please come again anytime." ;
					close;
				}
				mes "[Hunter Sherin]";
				mes "Then I will talk to you and ask you questions from time to time." ;
				mes "And then you can answer them." ;
				next;
				mes "[Hunter Sherin]";
				mes "This is to know what kind of idea you have and why you wanted to be a Hunter, so please feel free to answer it." ;
				set CHANGE_HT,1;
				break;
			case 2:
				mes "[HunterGuild Member]";
				mes "Job change conditions." ;
				mes "1. you must be an Archer, 2. your JobLv must be 40 or more, 3. you must collect the items requested by the guild, 4. you must be a HunterGuild Member, 5. you must be an Archer. You must collect the items requested by the guild. 4. Pass the guild's examination.";
				next;
				mes "[HunterGuild Member]";
				mes "If you have trained well in Archer, you should be able to pass the exam." ;
				close;
			case 3:
				mes "[HunterGuild Member]";
				mes "Then please come back anytime." ;
				close;
		}
		break;
	case 1:
		mes "[Hunter Sherin]";
		mes "You are here again!" ;
		mes "So we'll start with the interview - this time, make sure you answer Sherin's questions!" ;
		break;
	case 2:
		mes "[Hunter Sherin]";
		mes "Oh?" ;
		next;
		mes "[Hunter Sherin]";
		mes "Have you found the daemon Hunter yet?" ;
		mes "Daemon Hunter is on the left side of the room."; mes "You can find him on the left side of the room." ;
		next;
		mes "[Hunter Sherin]";
		mes "I can't wait to see you change jobs - you're going to be a wonderful Hunter." ;
		close;
	default: //when 3 to 9
		mes "[Hunter Sherin]";
		mes "You can bring the items together to the Daemon Hunter over there." ;
		next;
		mes "[Hunter Sherin]";
		mes "When you become a Hunter, be sure to come to Sherin." ;
		mes "You are so " +(Sex? "good looking": "beautiful")+ "so I definitely want to see you as a Hunter too. Hmmm..." ;
		close;
	case 10:
	case 11:
	case 12:
	
	case 14:
		mes "[Hunter Sherin]";
		mes "Umm... You are not looking for me, you are looking for Mr. Guildmaster, who is on a business trip elsewhere?" ;
		next;
		mes "[Hunter Sherin]";
		mes "From what I hear, you are either at Payon Central Palace or Archer Village." ;
		mes "You should go there." ;
		close;
	case 15:
		if(countitem(1007) < 1) {
			mes "[Hunter Sherin]";
			mes "Yes, we have received word that you have passed the exam, but you do not have the mark "Huiyan"." ;
			next;
			mes "[Hunter Sherin]";
			mes "I will not tell the Guildmaster that you have lost it, so please go find the "Huiyan" anyway." ;
			close;
		}
		if(Skillpoint) {
			mes "[Hunter Sherin]";
			mes "You cannot change jobs if you still have skillpoints. Please wait until you have spent all of your skill points." ;
			close;
		}
		set '@itemid,(JobLevel >= 50)? 1718: 1710;
		mes "[Hunter Sherin]";
		mes "Oh, you passed the job change exam!" ;
		mes "Congratulations!" ;
		next;
		mes "[Hunter Sherin]";
		mes "Well, then, I will immediately change your job to Hunter." ;
		next;
		delitem 1007,1;
		unequip;
		jobchange Job_Hunter;
		set CHANGE_HT,0;
		mes "[Hunter Sherin]";
		mes "Congratulations again." ;	
		mes "Yes, you look great in your Hunter outfit!" ;
		next;
		mes "[Hunter Sherin]";
		mes "Don't be ashamed to act as a Hunter and don't forget to love nature!" ;
		next;
		getitem '@itemid,1;
		mes "[Hunter Sherin]";
		mes "And this is a tribute to your efforts." ;
		close;
	}
	// interview here
	next;
	mes "[Hunter Sherin]";
	mes "Then let's go." ;
	next;
	mes "[Hunter Sherin]";
	mes "You are Archer and you want to go hunting somewhere, but you don't know where to go." ;
	mes "Well, what should I do?" ;
	next;
	if(select("walk around shouting about where is a good place to go", "talk to someone passing by and ask them", "go around by yourself and look for it")==2)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "I have decided where to hunt." ;
	mes "I have decided to hunt a monster called 'Horde' that lives in the Sograt Desert." ;
	next;
	mes "[Hunter, Sherin]";
	mes "But this is Payon.";
	mes "How shall we get to the desert?" ;
	next;
	if(select("Ask Master Priest to transfer me", "Use Kafra Staff", "Walk with my friends")==3)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "There is no Master Priest or friends nearby." ;
	mes "I decided to use Kafra Staff, but I don't have enough money. What should I do?" ;
	next;
	if(select("beg", "sell unneeded items for money", "hunt in nearby forest")==2)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "We managed to reach the desert where Hord is." ;
	mes "By the way, it seems that I was a little bit not good enough myself to hunt Hordes..." ;
	next;
	mes "[Hunter Sherin]";
	mes "What do you want to do?" ;
	next;
	if(select("attack the horde down the hill", "head for the city", "attack the horde that people are fighting")==2)
		set '@point,'@point+10;
	mes "[Hunter, Sherin]";
	mes "I have stopped hunting and returned to the city." ;
	next;
	mes "[Hunter Sherin]";
	mes "I found that I was running out of energy. I ask you to help me recover, but how would you ask?" ;
	next;
	if(select("If you don't mind, can I have a heal?" heal please", "heal please", "heal please")==1)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "Hmm? I was hunting and before I knew it, I had acquired a rare item. I immediately went out to the square to sell the items, but many stalls and chat rooms are open." ;
	next;
	mes "[Hunter Sherin]";
	mes "In such a case, what is the best way to sell the item?" ;
	next;
	if(select("walk around letting everyone know so they can hear", "open a chat room and wait", "try to find someone who is looking for it")==3)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "So I waited, and then the person begging showed up." ;
	mes "How do you respond?" ;
	next;
	if(select("Offer your money and items", "Ignore him and walk away", "I'll tell you where the right hunting spot is for him")==3)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "Now I went out to the labyrinth forest." ;
	next;
	mes "[Hunter Sherin]";
	mes "There I met a man who had lost his way." ;
	mes "What should I do?" ;
	next;
	if(select("I will show you the way", "I will guide you to your destination", "Ignore")==2)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "I continued the hunt, guiding the person along the way, but along the way I saw someone. I immediately went to the square to sell the goods and fight with the boss monster." ;
	next;
	mes "[Hunter Sherin]";
	mes "What should I do?" ;
	next;
	if(select("I'll help if they ask for help", "I'll attack anyway", "I'll go straight back to town")==1)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "I'm already quite tired from the trip." ;
	mes "I think I'll go back to town." ;
	next;
	mes "[Hunter Sherin]";
	mes "At that time, I found an unusual item on the road." ;
	mes "How would you like to do it?" ;
	next;
	if(select("pick it up and bring it back myself", "try to find out who it belongs to", "pass by")==2)
		set '@point,'@point+10;
	mes "[Hunter Sherin]";
	mes "Yes, thank you for your help!" ;
	mes "That's all the questions." ;
	next;
	if('@point < 50) {
		mes "[Hunter Sherin]";
		mes "Hmmm... It's a little difficult..." ;
		mes "If you don't have the basic mindset, we can't ask you to become a Hunter." ;
		next;
		mes "[Hunter Sherin]";
		mes "Please remember well what my question was and think about it again." ;
		mes "The way you treat people is very helpful in seeing their heart for nature." ;
		close;
	}
	set CHANGE_HT,2;
	if('@point == 100) {
		mes "[Hunter Sherin]";
		mes "Good, go into the job change exam with that mindset." ;
		mes "You have the qualities to be a Hunter well enough." ;
		next;
		mes "[Hunter Sherin]";
		mes "This concludes the interview." ;
		mes "Please ask the person in the corner over there to teach you the items you need to change jobs." ;
		close;
	}
	mes "[Hunter Sherin]";
	mes "There was some concern, but this is the end of the interview." ;
	mes "Please think about it again later and remember the questions you just asked." ;
	next;
	mes "[Hunter Sherin]";
	mes "Please do your best on the remaining exams and let Sherin hear your good results." ;
	close;
}


//==========================================
// First exam (item collection)
//------------------------------------------

//in_hunter.gat,55,99,4 script Hunter guild exam acceptance 732,{
hu_in01.gat,382,382,4 script Hunter guild exam acceptance 732,{
	switch(CHANGE_HT) {
	case 0:
	case 1:
		mes "[Daemon Hunter]";
		mes "If you want to take the examination to become a Hunter, you must first complete the reception desk." ;
		close;
	case 2:
		mes "[Hunter guild exam receptionist]";
		mes "Welcome. My name is Hunter Guild Exam Receptionist "Daemon Hunter"." ;
		mes "Your name is " +strcharinfo(0);
		mes "Right?" ;
		next;
		if(select("Yes, I am", "No, I'm not (fff...)" ==2) {
			mes "[Daemon Hunter]";
			mes "Don't be silly..." ;
			mes ""+strcharinfo(0)+ "Right?" ;
			next;
			if(select("u... Sorry", "ahaha")==2) {
				mes "[Daemon Hunter]";
				mes "If you came here to chill, get out! I'm talking to you out of respect and you act like that!" ;
				close2;
				//warp "pay_fild10.gat",133,235;
				warp "hugel.gat",208,223;
				end;
			}
		}
		mes "[Daemon Hunter]";
		mes "Yes, then I will let you know what you need for the job change test." ;
		mes "Please go and gather the materials for the bow and arrow. We too are short on finances..." ;
		mes "Well... What we are short of right now is..." ;
		next;
		switch(rand(7)) {
			case 0:
				mes "[Daemon Hunter]";
				mes "3 'bat fangs' used for arrowheads, 1 'sticky liquid' used as glue here and there, and ... 1 'bear's paw'." ;
				mes "That is all." ;
				set CHANGE_HT,3;
				break;
			case 1: //Message not yet investigated
				mes "[Daemon Hunter]";
				mes "1 'monkey tail', 2 'hedgehog needles' and . 1 'acorn'." ;
				mes "That is all." ;
				set CHANGE_HT,4;
				break;
			case 2: //Message not yet investigated
				mes "[Daemon Hunter]";
				mes "3 'Dokebi horns,' 3 'broken egg pieces,' and . 10 pieces of 'fluff'." ;
				mes "That is all." ;
				set CHANGE_HT,5;
				break;
			case 3: //Message not yet investigated
				mes "[Daemon Hunter]";
				mes "3 'bird beaks', 5 'skele bones', and . 3 'green herbs'." ;
				mes "That is all." ;
				set CHANGE_HT,6;
				break;
			case 4: //Message not yet investigated
				mes "[Daemon Hunter]";
				mes "3 'white herbs', 5 'wood shavings' and . 5 'desert wolf claws'." ;
				mes "That is all." ;
				set CHANGE_HT,7;
				break;
			case 5: //Message not yet investigated
				mes "[Daemon Hunter]";
				mes "9 'yellow herbs', 9 'mushy skins', and . 9 'bully skins'." ;
				mes "That is all." ;
				set CHANGE_HT,8;
				break;
			case 6: //Message not yet investigated
				mes "[Daemon Hunter]";
				mes "3 'poison fangs', 3 'beast skins', and . 5 'red herbs'." ;
				mes "That is all." ;
				set CHANGE_HT,9;
				break;
		}
		next;
		mes "[Daemon Hunter]";
		mes "Also, Mr. Guildmaster, who is on a business trip to Payon, is in charge of the exam, so please meet with him once." ;
		mes "Then, please come back when you have everything in order." ;
		close;
	default: //when 3 to 9
		mes "[Daemon Hunter]";
		mes "Let's see..." ;
		next;
		switch(CHANGE_HT) {
			case 3:
				setarray '@need,913,938,948;
				setarray '@amount,3,1,1;
				break;
			case 4:
				setarray '@need,942,1027,1026;
				setarray '@amount,1,2,1;
				break;
			case 5:
				setarray '@need,1021,7032,914;
				setarray '@amount,3,3,10;
				break;
			case 6:
				setarray '@need,925,932,511;
				setarray '@amount,3,5,3;
				break;
			case 7:
				setarray '@need,509,1019,7030;
				setarray '@amount,3,5,5;
				break;
			case 8:
				setarray '@need,508,955,935;
				setarray '@amount,9,9,9;
				break;
			case 9:
				setarray '@need,937,919,507;
				setarray '@amount,3,3,5;
				break;
		}
		for(set '@i,0; '@i<3; set '@i,'@i+1) { //need item check
			if(countitem('@need['@i]) < '@amount['@i]) {
				mes "[Daemon Hunter]";
				mes "It looks like you are not ready yet." ;
				mes "You need..." ;
				for(set '@i,0; '@i<3; set '@i,'@i+1)
					mes "" +getitemname('@need['@i])+ "" +'@amount['@i]+ "Pieces. Please come with all of them." ;
				close;
			}
		}
		mes "[Daemon Hunter]";
		mes "Yeah, you've collected everything I mentioned!" ;
		mes "Now all we need to do is to meet with Master Guildmaster who is traveling to Payon and he will take us to the next test." ;
		for(set '@i,0; '@i<3; set '@i,'@i+1)
			delitem '@need['@i],'@amount['@i];
		set CHANGE_HT,10+rand(2);
		close;
	case 10:
	case 11:
	case 12:
	
	case 14:
		mes "[Daemon Hunter]";
		mes "I am sure that Master Guildmaster went to Payon Central Palace or Archer Village." ;
		mes "Please search a little..." ;
		close;
	case 15:
		mes "[Daemon Hunter]";
		mes "Oh, you passed the test!" ;
		mes "Please go to Sherin." ;
		close;
	}
}


//==========================================
// Secondary (combat test)
//------------------------------------------

- script HunterGuildmaster -1,{
	cutin "job_huntermaster",2;
	switch(CHANGE_HT) {
	case 0:
	case 1:
	case 2:
		mes "[Hunter]";
		mes "What is your business?" ;
		mes "I'm on a business trip and I'm busy." ;
		mes "Please leave me alone." ;
		close2;
		cutin "job_huntermaster",255;
		end;
	default: //when 3 to 9
		mes "[HunterGuildmaster]";
		mes "Yes, how can I help you, Mr. Archer?" ;
		mes "I haven't heard from the Hunter Guild specifically, but you didn't come here to skip the intermediate process and take the exam, did you?" ;
		next;
		mes "[HunterGuildmaster]";
		mes "First, please collect the items needed for the job change exam and deliver them to the Hunter Guild before coming here." ;
		close2;
		cutin "job_huntermaster",255;
		end;
	case 10:
	case 11:
		set '@num,strnpcinfo(2);
		if(CHANGE_HT ! = '@num) { //if it does not match the specified master
			mes "[Hunter]";
			mes "Yeah?" ;
			mes "If you would like to change jobs, please come to the Hunter guild and complete the application." ;
			close2;
			cutin "job_huntermaster",255;
			end;
		}
		mes "[HunterGuildmaster]";
		mes "Yeah...? Is it a job change test?" ;
		mes "Then let me tell you what the exam is." ;
		mes "Please give me the items you want to know." ;
		break;
	case 12:
	case 13:
		mes "[HunterGuildmaster]";
		mes "Yeah? You're the one who took the job test before?" ;
		mes "We will start the exam when you are ready." ;
		mes "If you have any questions, please go ahead." ;
		break;
	case 14:
		mes "[HunterGuildmaster]";
		mes "Yes, you've finished and returned safely." ;
		mes "Then I will give you a sign that you have completed the exam." ;
		mes "Please return to the Hunter Guild." ;
		mes "I have a few more things left to do here..." ;
		next;
		mes "[HunterGuildmaster]";
		mes "Well, here we go." ;
		mes "So here it is..." ;
		getitem 1007,1;
		set CHANGE_HT,15;
		close2;
		cutin "job_huntermaster",255;
		end;
	case 15:
		mes "[HunterGuildmaster]";
		mes "You can't wait to become a Hunter, can you?" ;
		mes "When I became a Hunter, I ran as fast as I could." ;
		next;
		mes "[HunterGuildmaster]";
		mes "Try to get back to the Hunter Guild as soon as possible!" ;
		close2;
		cutin "job_huntermaster",255;
		end;
	}
	// Combat test starts here
	while(1) {
		next;
		switch (select("Exam Content", "Exam Passing Conditions", "Attention Matters", "Start Exam")) {
		case 1:
			mes "[HunterGuildmaster]";
			mes "The content of the exam is to avoid pitfalls here and there and hunt only certain predetermined monsters." ;
			next;
			mes "[HunterGuildmaster]";
			mes "The test is designed to test your ability to identify the most important targets to become a Hunter and your quickness." ;
			continue;
		case 2:
			mes "[HunterGuildmaster]";
			mes "Starting at 6 o'clock on the MAP, hunt the target monster within the time limit."; continue; case 3: mes "[HunterGuildmaster]"; continue; case 4: mes "[HunterGuildmaster]
			next;
			mes "[HunterGuildmaster]";
			mes "An escape switch will appear in the center of the map, press it to escape in the direction of 12 o'clock to complete the game." ;
			continue;
		case 3:
			mes "[HunterGuildmaster]";
			mes "Is it an Attention matter..." ;
			mes "It's obvious, but if you fall into a pitfall, you have to start all over again." ;
			next;
			mes "[HunterGuildmaster]";
			mes "You will be tested one at a time." ;
			mes "When I send you towards the exam room, you should be able to see the waiting room, so if the person in front of you is taking the exam, please stay in the chat room." ;
			next;
			mes "[HunterGuildmaster]";
			mes "If the person in front of you drops out or clears, you can enter in turn from the person waiting in the chat room." ;
			mes "You can also start immediately if there is no one else in the exam." ;
			continue;
		}
		break;
	}
	if(CHANGE_HT <= 11) {
		mes "[HunterGuildmaster]";
		mes "Ok. I'll send it to you now. If you do it as described, it should be fine." ;
		next;
		mes "[HunterGuildmaster]";
		mes "Also, I have made arrows from the materials you brought for the guild supplies, so please take these with you to the job change test." ;
		getitem 1751,200;
		set CHANGE_HT,12;
		next;
		mes "[HunterGuildmaster]";
		mes "Then I wish you good luck." ;
	}
	else {
		mes "[HunterGuildmaster]";
		mes "Okay." ;
		mes "I'll send it to you right away." ;
		next;
		mes "[HunterGuildmaster]";
		mes "Yeah...? I gave you the silver arrows before." ;
		mes "I cannot give it to you a second time." ;
		mes "So, shall we begin?" ;
		next;
		if(select("Let's go", "Wait a minute.") ==2) {
			mes "[HunterGuildmaster]";
			mes "Get ready and come back again." ;
			close2;
			cutin "job_huntermaster",255;
			end;
		}
		mes "[HunterGuildmaster]";
		mes "Alright! You'll pass the test this time!" ;
	}
	close2;
	cutin "job_huntermaster",255;
	savepoint "job_hunte.gat",176,22;
	warp "SavePoint",0,0;
	end;
}

payon_in02.gat,21,31,3 duplicate(HunterGuildmaster) Hunter#10 59
payon_in03.gat,131,7,3 duplicate(HunterGuildmaster) Hunter#11 59

//==============================================================================
job_hunte.gat,178,32,4 script Guide 107,5,2,{
OnTouch:
	if(CHANGE_HT ! = 13) {
		mes "[Guide]";
		mes "Welcome to the Hunter Job Search Testing Center." ;
		next;
		mes "[Guide]";
		mes "Enter the waiting room by me and the exam will begin shortly." ;
		next;
		mes "[Guide]";
		mes "While moving from the starting position, you will be able to press the switch in the center of the MAP if you kill at least 4 targets named "Monster for the Job Test"." ;
		next;
		mes "[Guide]";
		mes "If you press the switch, you can escape from the exit at 12 o'clock in the MAP." ;
		mes "Complete the objective and escape within the time limit." ;
		next;
		mes "[Guide]";
		mes "If you lose the battle, fall into a pitfall, or exceed the time limit, you will be disqualified and must take the test again." ;
		next;
		mes "[Guide]";
		mes "Arrows should be provided by the guild." ;
		mes "So, only the bow should be provided." ;
		mes "Then, please enter the waiting room when you are ready." ;
		close;
	}
	percentheal 100,100;
	mes "[Guide]";
	mes "Failed or..." ;
	mes "Let's restore your HP and SP." ;
	mes "If you can't, we can come back out, what do you want to do?" ;
	next;
	if(select("still trying", "give up once")==1) {
		mes "[Guide]";
		mes "Okay, I hope you work hard and become a great Hunter." ;
		mes "Then go to the waiting room." ;
		mes "If there is someone who entered before you, stay there until his/her exam is over." ;
		close;
	}
	announce "Guide: " +strcharinfo(0)+ "Your test is interrupted, please come in next",9;
	mes "[Guide]";
	mes "Then I'll send you to Payon." ;
	mes "See you later." ;
	close2;
	set CHANGE_HT,12;
	savepoint "payon.gat",104,99;
	warp "SavePoint",0,0;
	end;
}

//==============================================================================
job_hunte.gat,176,38,4 script Hunter job change waiting room::HT_ChatRoom 66,{
	end;
OnInit:
	waitingroom "Job change examination room waiting room",10, "HT_ChatRoom::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid '@accid;
	if(attachrid('@accid)) {
		set $@ht_tester$,strcharinfo(0); //name of challenger
		set CHANGE_HT,13;
		donpcevent "HT_Center::OnStart";
		warp "job_hunte.gat",90,68;
	}
	} else
		enablewaitingroomevent;
	end;
}

//==============================================================================
job_hunte.gat,0,0,0 script HT_Center -1,{
	end;
OnStart:
	set 'count,4;
	hideonnpc "switch#HT_Test";
	hideonnpc "Escape port#HT_Test"; hideonnpc "Escape port#HT_Test";
	monster "job_hunte.gat",54,73, "Monster for job change test",1041,1, "HT_Center::OnKillOK";
	monster "job_hunte.gat",54,73, "Job change test monster",1002,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",54,73, "monster sample",1002,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",54,73, "Hunter job change sample",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",54,106, "Job change test monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",54,106, "Hunter exam sample",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",54,106, "Do not bully",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",68,80, "Monster for job test",1015,1, "HT_Center::OnKillOK";
	monster "job_hunte.gat",68,80, "Monster for Hunter job change",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",72,103, "Monster for job change experiment",1041,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",72,103, "Job change test tube monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",72,103, "Don't hit me",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",78,110, "Job change test monster",1016,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",78,110, "Job change test monster",1016,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",78,110, "Hunter job change sample",1016,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",79,94, "Monster for job change test",1015,1, "HT_Center::OnKillOK";
	monster "job_hunte.gat",79,94, "Monster for Hunter job change",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",83,112, "Job change test tube monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",83,112, "ikkashikasei",1015,1, "HT_Center::OnKillNG"; monster "job_hunte.gat",83,112, "ikkashikasei",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",89,129, "Monster for job change test",1002,1, "HT_Center::OnKillOK";
	monster "job_hunte.gat",89,129, "Monster for job change experiment",1002,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",90,91, "Job change experiment monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",90,91, "Anorean",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",90,91, "Job change test tube monster",1041,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",90,92, "job change examiner monster",1015,1, "HT_Center::OnKillOK";
	monster "job_hunte.gat",93,101, "Job change test tube monster",1002,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",108,102, "job_change_tester_monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",108,102, "Job change experiment monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",108,102, "Do not kill",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",114,78, "Monster for job test",1015,1, "HT_Center::OnKillOK";
	monster "job_hunte.gat",115,139, "dime",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",115,139, "PhilipAnselmo",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",115,139, "Fall",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",115,139, "Rex",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",125,69, "Monster for the job test",1016,1, "HT_Center::OnKillOK";
	monster "job_hunte.gat",125,69, "job change exam monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",125,69, "Job change test monster",1015,1, "HT_Center::OnKillNG";
	monster "job_hunte.gat",125,69, "Hunter sample for job change",1015,1, "HT_Center::OnKillNG";
	initnpctimer;
	end;
OnKillOK:
	set 'count,'count-1;
	if('count) {
		announce "Examiner: not yet, go for it!" ,9;
		end;
	}
	announce "Examiner: Okay, good job. Watch out for the pitfalls and look for the switch in the center of the MAP.",9;
	killmonster "job_hunte.gat", "All";
	hideoffnpc "switch#HT_Test";
	end;
OnKillNG:
	stopnpctimer;
	announce "Test Director: " +$@ht_tester$+ ", You made a mistake. Please try again.",9;
	areawarp "job_hunte.gat",50,64,129,143, "job_hunte.gat",176,22;
	killmonster "job_hunte.gat", "All";
	enablewaitingroomevent "HT_ChatRoom";
	end;
OnTimer1000:
	announce "Examiner: we will now begin the job change test",9;
	end;
OnTimer3000:
	OnTimer3000: announce "Examiner: Please select and defeat only the "monsters for the job change test"",9;
	end;
OnTimer5000:
	announce "Examiner: If you operate the escape switch, the exit at 12 o'clock in the MAP will be opened",9;
	end;
OnTimer7000:
	announce "Examiner: You have 3 minutes to escape",9;
	end;
OnTimer9000:
	announce "Examiner: I will announce every minute elapsed. Let's start!" ,9;
	end;
OnTimer11000:
	announce "Examination director: ****** 3 minutes left ******",9;
	end;
OnTimer71000:
	announce "Exam Supervisor: ****** 2 minutes left ******",9;
	end;
OnTimer131000:
	announce "Exam Supervisor: ****** 1 minute left ******",9;
	end;
OnTimer161000:
	announce "Exam Supervisor: ****** 30 seconds left ******",9;
	end;
OnTimer186000:
	announce "Test Director: 5 seconds before end of test. . . . ." ,9;
	end;
OnTimer187000:
	announce "Test Director: 4 seconds before end of test . . . ." ,9;
	end;
OnTimer188000:
	announce "Test Director: 3 seconds before end of test . . ." ,9;
	end;
OnTimer189000:
	announce "Test Director: 2 seconds before end of test . ." ,9;
	end;
OnTimer190000:
	announce "Test director: 1 second before exam end. ,9;
	end;
OnTimer191000:
	announce "Examination director: 0",9;
	,9; end; OnTimer191000: announce "Examination director: 0",9; end
OnTimer192000:
	announce "Examination Director: The time limit has passed. We are waiting for your next attempt.",9;
	areawarp "job_hunte.gat",50,64,129,143, "job_hunte.gat",176,22;
	end;
OnTimer195000:
	stopnpctimer;
	killmonster "job_hunte.gat", "All";
	enablewaitingroomevent "HT_ChatRoom";
	end;
}

//==============================================================================
job_hunte.gat,93,101,0 script switch#HT_Test 723,1,1,{
OnTouch:
	mes "There is an escape switch and three buttons are visible." ;
	next;
	switch (select("escape", "cancel", "retest")) {
	case 1:
		mes "The escape hatch is open";
		announce "switch: ## escape exit opened ##",9;
		hideoffnpc "Escape port ##HT_Test";
		close;
	case 2:
		mes "operation canceled";
		announce "switch: ## operation canceled ##",9;
		close;
	case 3:
		mes "Transferred to the waiting room";
		announce "switch: ## transfer test is suspended ...... ##",9;
		close2;
		stopnpctimer "HT_Center";
		warp "job_hunte.gat",176,22;
		killmonster "job_hunte.gat", "All";
		enablewaitingroomevent "HT_ChatRoom";
		end;
	}
}

//==============================================================================
job_hunte.gat,89,139,0 script escape#HT_Test 45,1,1,{
	stopnpctimer "HT_Center";
	set CHANGE_HT,14;
	savepoint "payon.gat",104,99;
	if(rand(2))
		warp "payon_in02.gat",17,31;
	else
		warp "payon_in03.gat",128,7; else
	killmonster "job_hunte.gat", "All";
	enablewaitingroomevent "HT_ChatRoom";
	end;
}

//==============================================================================
job_hunte.gat,52,67,0 script #HT_Abyss 139,0,1,{
	stopnpctimer "HT_Center";
	announce "Test director: " +$@ht_tester$+ "Sir, you have fallen into the pit." ,9;
	warp "job_hunte.gat",176,22;
	killmonster "job_hunte.gat", "All";
	enablewaitingroomevent "HT_ChatRoom";
	end;
}

job_hunte.gat,53,67,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,53,69,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,54,68,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,54,70,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,55,70,0 duplicate(#HT_Abyss) pitfall 139,0,1

job_hunte.gat,59,66,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,59,67,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,61,66,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,61,67,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,68,67,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,69,67,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,68,69,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,69,69,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,76,66,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,76,67,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,77,66,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,77,67,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,82,68,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,82,69,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,68,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,69,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,96,66,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,96,67,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,97,66,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,97,67,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,100,68,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,100,69,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,101,68,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,101,69,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,107,66,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,107,67,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,109,66,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,109,67,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,117,68,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,117,69,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,119,68,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,119,69,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,124,66,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,124,67,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,125,66,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,125,67,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,126,70,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,126,71,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,70,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,127,71,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,124,78,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,124,79,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,125,78,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,125,79,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,126,82,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,126,83,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,82,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,127,83,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,126,86,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,126,87,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,86,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,87,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,125,96,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,125,97,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,127,96,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,127,97,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,126,107,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,127,107,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,126,109,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,109,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,124,119,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,125,119,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,124,121,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,125,121,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,126,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,126,127,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,127,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,124,130,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,124,131,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,125,130,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,125,131,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,126,138,0 duplicate(#HT_Abyss) pitfall 139,0,2
job_hunte.gat,127,138,0 duplicate(#HT_Abyss) pitfall 139,0,2
job_hunte.gat,126,141,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,127,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,120,138,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,120,139,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,121,138,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,121,139,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,116,140,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,116,141,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,117,140,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,117,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,112,140,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,112,141,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,140,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,120,138,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,120,139,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,121,138,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,121,139,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,106,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,107,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,106,141,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,107,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,99,138,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,99,139,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,101,138,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,101,139,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,82,138,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,82,139,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,138,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,139,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,78,140,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,78,141,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,79,140,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,79,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,72,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,73,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,72,141,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,73,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,62,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,63,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,64,140,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,64,141,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,62,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,52,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,53,139,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,54,140,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,54,141,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,52,141,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,52,133,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,53,133,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,52,135,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,53,135,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,52,122,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,53,122,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,54,120,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,54,121,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,52,120,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,54,109,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,55,109,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,54,111,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,55,111,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,53,101,0 duplicate(#HT_Abyss) pit 139,1,1
job_hunte.gat,53,103,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,55,101,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,55,103,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,54,92,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,54,93,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,55,92,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,55,93,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,52,90,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,52,91,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,53,90,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,53,91,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,52,86,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,52,87,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,53,86,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,53,87,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,54,79,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,55,79,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,54,81,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,55,81,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,82,78,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,82,79,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,78,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,79,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,78,80,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,78,81,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,79,80,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,79,81,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,74,78,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,74,79,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,75,78,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,75,79,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,66,78,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,66,79,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,78,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,79,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,64,81,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,65,81,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,64,83,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,83,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,66,88,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,66,89,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,88,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,89,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,64,92,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,64,93,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,92,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,93,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,66,100,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,66,101,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,100,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,67,101,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,64,106,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,64,107,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,106,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,107,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,64,112,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,64,113,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,112,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,113,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,66,116,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,66,117,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,116,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,117,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,66,120,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,66,121,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,120,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,67,121,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,64,128,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,64,129,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,128,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,65,129,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,68,126,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,68,127,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,69,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,69,127,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,75,128,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,75,129,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,77,128,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,77,129,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,82,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,82,127,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,127,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,96,128,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,96,129,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,97,128,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,97,129,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,100,126,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,100,127,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,101,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,101,127,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,106,128,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,106,129,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,107,128,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,107,129,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,112,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,112,127,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,126,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,127,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,114,118,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,114,119,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,115,118,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,115,119,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,114,114,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,114,115,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,115,114,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,115,115,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,112,110,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,112,111,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,110,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,111,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,112,103,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,113,103,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,112,105,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,105,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,114,96,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,114,97,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,115,96,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,115,97,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,112,90,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,112,91,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,90,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,113,91,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,114,84,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,114,85,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,115,84,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,115,85,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,114,80,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,114,81,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,115,80,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,115,81,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,110,78,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,110,79,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,111,78,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,111,79,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,104,78,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,104,79,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,105,78,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,105,79,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,101,80,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,101,81,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,103,80,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,103,81,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,94,78,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,94,79,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,95,78,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,95,79,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,76,114,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,76,115,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,77,114,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,77,115,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,80,110,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,80,111,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,81,110,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,81,111,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,82,116,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,82,117,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,116,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,117,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,86,114,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,86,115,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,87,114,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,87,115,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,82,100,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,82,101,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,83,100,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,83,101,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,76,94,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,76,95,0 duplicate(#HT_Abyss) pit 139,0,0
job_hunte.gat,77,94,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,77,95,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,78,92,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,78,93,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,79,92,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,79,93,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,86,92,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,86,93,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,87,92,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,87,93,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,90,96,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,90,97,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,91,96,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,91,97,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,99,94,0 duplicate(#HT_Abyss) pit 139,1,0
job_hunte.gat,99,95,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,100,93,0 duplicate(#HT_Abyss) pit 139,0,1
job_hunte.gat,101,93,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,101,95,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,102,90,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,102,91,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,103,90,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,103,91,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,102,98,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,102,99,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,103,98,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,103,99,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,106,104,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,106,105,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,107,104,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,107,105,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,102,116,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,102,117,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,103,116,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,103,117,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,76,98,0 duplicate(#HT_Abyss) pit 139,2,0
job_hunte.gat,76,99,0 duplicate(#HT_Abyss) pit 139,2,0
job_hunte.gat,78,101,0 duplicate(#HT_Abyss) pit 139,0,3
job_hunte.gat,79,101,0 duplicate(#HT_Abyss) pitfall 139,0,3
job_hunte.gat,81,104,0 duplicate(#HT_Abyss) pitfall 139,5,0
job_hunte.gat,81,105,0 duplicate(#HT_Abyss) pitfall 139,5,0
job_hunte.gat,86,106,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,87,106,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,87,104,0 duplicate(#HT_Abyss) pitfall 139,0,0

job_hunte.gat,90,108,0 duplicate(#HT_Abyss) pit 139,0,6
job_hunte.gat,91,108,0 duplicate(#HT_Abyss) pitfall 139,0,6
job_hunte.gat,92,114,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,92,115,0 duplicate(#HT_Abyss) pitfall 139,1,0
job_hunte.gat,90,115,0 duplicate(#HT_Abyss) pit 139,0,0

job_hunte.gat,94,98,0 duplicate(#HT_Abyss) pit 139,2,0
job_hunte.gat,94,99,0 duplicate(#HT_Abyss) pitfall 139,2,0
job_hunte.gat,96,102,0 duplicate(#HT_Abyss) pit 139,0,4
job_hunte.gat,97,102,0 duplicate(#HT_Abyss) pitfall 139,0,4
job_hunte.gat,94,108,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,95,108,0 duplicate(#HT_Abyss) pitfall 139,0,1
job_hunte.gat,96,106,0 duplicate(#HT_Abyss) pitfall 139,2,0
job_hunte.gat,96,107,0 duplicate(#HT_Abyss) pitfall 139,2,0
job_hunte.gat,98,109,0 duplicate(#HT_Abyss) pitfall 139,0,2
job_hunte.gat,99,109,0 duplicate(#HT_Abyss) pitfall 139,0,2
job_hunte.gat,99,106,0 duplicate(#HT_Abyss) pitfall 139,0,0
job_hunte.gat,102,108,0 duplicate(#HT_Abyss) pit 139,4,0
job_hunte.gat,102,109,0 duplicate(#HT_Abyss) pitfall 139,4,0


//==========================================
// Falcon Rental
//------------------------------------------

//in_hunter.gat,146,99,2 script Falcon Contractor 105,{
hu_in01.gat,381,304,5 script Falcon Contractor 105,{
	if(Job ! = Job_Hunter && Job ! = Job_Ranger) {
		mes "You idiot! Falcon is for Hunter, Sniper and Ranger only!" ;
		close;
	}
	mes "[Falcon Contractor]";
	mes "Do you need a Falcon?" ;
	mes "2500 zeny a bird!" ;
	next;
	if(select("use", "stop")==2) {
		mes "[Falcon Contractor]";
		mes "Hey! What the heck are you imitating?" ;
		mes "You there!" ;
		mes "Stop! Stop!" ;
		close;
	}
	if(checkfalcon()) {
		mes "[Falcon Contractor]";
		mes "You already have a Falcon." ;
		close;
	}
	if(Zeny < 2500) {
		mes "[Falcon Contractor]";
		mes "Not enough money!" ;
		close;
	}
	if(getskilllv(127) < 1) {
		// not yet checked
		close;
	}
	set Zeny,Zeny-2500;
	setfalcon;
	close;
}
