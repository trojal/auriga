//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- 冒険者アカデミー  受付・講習室
//                                                  by Pneuma
// 1.1 since 2019 Updata, Add マスター・スヌス by refis
//------------------------------------------------------------

// 受付員
ac_cl_room.gat,43,41,4	script	Receptionist#Ella	90,{
	function getcombathan;
	set '@novice, callfunc("AC_GetNovice");

	if(Job==Job_Summoner) {
		mes "[Ella]";
		mes "You are Mr. Doram, aren't you?" ;
		mes "Welcome to the Adventurers Academy!" ;
		mes "Please take your time to visit." ;
		close;
	}
	if(AC_PASSPORT>=2){
		if(Job!=Job_Novice) {
			mes "[Ella]";
			mes "Hello." ;
			mes strcharinfo(0)+ ", you are always very studious." ;
			mes "Please tell me about your travels sometime." ;
			close;
		} else {
			if(AC_NOVICE_QUE<10){
				mes "[Ella]";
				mes "I know there are still many things you don't understand, but you are just beginning your journey as an adventurer." ;
				next;
				mes "[Ella]";
				mes "First, you should talk to ^0000FFPuron^000000 in this room." ;
			}
			else if(AC_NOVICE_QUE<20){
				mes "[Ella]";
				mes "Are you being taught a lot of things?" ;
				mes "We have new students coming in, so everyone is very excited." ;
				mes "You should hear from ^0000FFAldi^000000 there, too." ;
			}
			else if(AC_NOVICE_QUE<30) {
				mes "[Ella]";
				mes "It looks like you are making good progress." ;
				mes "I'm sure ^0000FFFaye^000000 will tell you about the future." ;
				mes "Please talk to ^0000FFFaye^000000 at the back of the room." ;
			}
			else {
				mes "[Ella]";
				mes "It looks like the course went well." ;
				mes "You can now go for the ^FF00001 next job ^000000." ;
				mes "You can ask Mr. ^0000FFFaye^000000 at the back of this training room." ;
				emotion 2,"";
			}
		}
	}

	if(AC_PASSPORT<2 && !checkquest(201040)){
		mes "[Ella]";
		mes "You are new here, aren't you?" ;
		mes "Welcome to the Adventurer Academy!" ;
		mes "First, let's complete the enrollment process." ;
		mes "Let's see, ......";
		mes "You must be " + strcharinfo(0)  + ".";
		next;
		mes "[Ella]";
		mes "First, we need the name ......";
		mes "The date is ......";
		next;
		mes "[Ella]";
		mes "First, we need the name ......";
		mes "The date is ......";
		mes "............";
		mes "The appearance is ......";
		next;
		mes "[Ella]";
		mes "First, we need the name ......";
		mes "The date is ......";
		mes "............";
		mes "The appearance is ......";
		mes "Woah " + (Sex ? "cool": "cute") + "!";
		mes "......";
		next;
		setquest 201040;
		emotion 46,"";
		mes "[Ella]";
		mes "Here you go!" ;
		mes "Your enrollment is complete!" ;
		mes "You are now a student of the Adventurer Academy!" ;
		next;
		mes "[Ella]";
		mes "The Adventurer Academy is a school established for adventurers from all over the world." ;
		mes "It's a school that is funded by donations from adventurers." ;
		next;
		mes "[Ella]";
		mes "It's a school where people from all walks of life come to learn, from fledgling adventurers just starting out to old strong adventurers." ;
		next;
		mes "[Ella]";
		mes "If you are not used to adventures, it would be a good idea to learn at the Adventurer Academy here." ;
		next;
		mes "[Ella]";
		mes "So, let's get right to it, and I'll tell you the most important thing you need to know as you begin your adventure." ;
		next;
		mes "[Ella]";
		mes "It is about ^FF000000quests^000000." ;
		mes " ";
		mes "A ^0000FFquest^000000 is simply an adventure that begins in a variety of places." ;
		next;
		mes "[Ella]";
		mes "By accomplishing quests, you get experience, rewards, and various services." ;
		next;
		mes "[Ella]";
		mes "There are many different quests, such as taking requests from people in need, solving their problems, exploring something, solving a mystery, or defeating a monster." ;
		next;
		mes "［Ella］";
		mes "Try pressing ^FF0000Alt+U key ^000000." ;
		mes "Now you see [Enroll in Adventurer Academy] and the quest in the window labeled Quest List." ;
		cutin "jp_quest_help01.bmp", 2;
		next;
		mes "[Ella]";
		mes "Each quest can be viewed in detail in the ^0000FFquest list^000000 window by selecting the quest name and pressing the \"^FF000000view^000000\" button or by ^0000FFdouble-clicking^000000 on the quest name." ;
		next;
		mes "[Ella]";
		mes "[Admission to Adventurer Academy] Quest is written that you have been admitted." ;
		mes "The contents of the quests vary, so if you lose track of the contents, try pressing ^FF0000Alt+U key ^000000." ;
		next;
		mes "[Ella]";
		mes "Yes, ^0000FFcompleted quests^000000FF will be displayed in the quest list as ^000000FFcrescent moon symbol^000000FF." ;
		if(!'@novice){
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[Ella]";
			mes "I feel lucky today to have someone as experienced as you to enroll." ;
			next;
			mes "[Ella]";
			mes "If you want to know about the inside of the school, I think ^0000FFMido^000000 is just outside this room, so please ask him." ;
			set AC_PASSPORT,2; //入学完了
			set AC_AFLIER,0; //ちらしフラグ破棄
			close;
		}
		if(!countitem(1243) && !countitem(2414) && !countitem(2510) && !countitem(2352) && !countitem(2112) && !countitem(5055)){
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[Ella]";
			mes "This is my gift to you for your enrollment." ;
			mes "Please accept it." ;
			//本家ではチェックが入っていない。
			if(checkitemblank()) getitem 1243, 1;
			if(checkitemblank()) getitem 2414, 1;
			if(checkitemblank()) getitem 2510, 1;
			if(checkitemblank()) getitem 2352, 1;
			if(checkitemblank()) getitem 2112, 1;
			if(checkitemblank()) getitem 5055, 1;
		}
		if(!getskilllv(142)){	// 初回会話時のみに変更？
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[Ella]";
			mes "Oh?　I see that you have not yet learned the skill \"^0000FF First Aid^000000\"." ;
			mes "Since you're here, I'll teach you the skill \"^000000FFFirst Aid^000000\" as well." ;
			mes "This is a pretty useful skill when you are injured." ;
			next;
			skill 142,1,0;
			mes "^4d4dff- Acquired the skill \"First Aid\". - ^000000";
		}
	}
	if(!checkquest(100056) && !checkquest(201036) && !checkquest(201815)){
		next;
		cutin "jp_quest_help01.bmp", 255;
		mes "[Ella]";
		mes "Ah!　It was." ;
		mes " ";
		mes "Right now, we're giving away free helpful items to support fledgling adventurers." ;
		next;
		mes "[Ella]";
		mes "The first item is called ^4d4dffThick Battle Manual^000000, and when used, it increases the experience gained by 50% for one hour!" ;
		next;
		mes "[Ella]";
		mes "The second item is called ^4d4dffLevel Up Box^000000, which is a box that can be opened when you reach a certain level and when opened you get various items!" ;
		next;
		getcombathan;
	}
	if(checkquest(100056) && !checkquest(201036) && !checkquest(201815)){
		mes "[Ella]";
		mes "Then I will give you ^4d4dffThick Battle Manual^000000 and ^4d4dffLevel Up Box^000000." ;
		next;
		getcombathan;
	}
	if(AC_PASSPORT<2){
		next;
		cutin "jp_quest_help01.bmp", 255;
		mes "[Ella]";
		mes "Well, that's it from me." ;
		mes " ";
		mes "For more useful basic adventure stories, ^0000FFPuron^000000, ^0000FFAldi^000000, and ^0000FFFaye^000000 in this room will tell you." ;
		next;
		mes "[Ella]";
		mes "If you learn here, as you grow, you'll have all the necessities that will help you." ;
		mes " ";
		mes "First, please talk to ^0000FFPuron^000000 in this room." ;
		setquest 100112;
		set AC_PASSPORT,2; //入学完了
		set AC_AFLIER,0; //ちらしフラグ破棄
	}
	close;

	function	getcombathan	{
		if(MaxWeight - Weight < 2000){
			mes "[Ella]";
			mes "Oh?" ;
			mes "I was going to give it to you, but your luggage is too heavy." ;
			mes "Please reduce your luggage." ;
			next;
			mes "-You cannot receive the item due to the weight of the items you are carrying-";
			mes "-Please reduce the number of items in your possession and then speak to us again-";
			close2;
			if(!checkquest(100056)) setquest 100056;
			cutin "jp_quest_help01.bmp", 255;
			end;
		}
		if(checkitemblank() < 3){
			mes "[Ella]";
			mes "Oh?" ;
			mes "I was going to give it to you, but it looks like you have too much luggage." ;
			mes "Please reduce your luggage." ;
			next;
			mes "-You cannot receive the item because you have too many different items in your possession.";
			mes "-Please reduce the number of items in your possession and then talk to us again-";
			close2;
			if(!checkquest(100056)) setquest 100056;
			cutin "jp_quest_help01.bmp", 255;
			end;
		}
		cutin "jp_quest_help01.bmp", 255;
		mes "[Ella]";
		mes "Use this to become a great adventurer!" ;
		getitem 25023, 1;
		getitem 12312, 10;
		getitem2 22954,1,1,0,0,0,0,0,0,1209600;
		delquest 100056;
		//setquest 201036;	// 古いクエスト
		setquest 201815;
		next;
		mes "[Ella]";
		mes "You can get various items from the box, but the first box you get contains an item called 'Armor Exchange Ticket'." ;
		next;
		mes "[Ella]";
		mes "Tickets can be exchanged for various items depending on your level, and ^FF0000Master Sunus^000000 is right there to help you exchange those items!" ;
		next;
		mes "[Ella]";
		mes "Be sure to come to Master Sunus when you get your ticket from the box!" ;
		next;
		mes "-Information-";
		mes " ^FF0000\"Level Up Boxes\" will automatically disappear approximately two weeks after receipt." ;
		mes " Please open the \"Level Up Box\" before the expiration date as we do not redistribute \"Level Up Boxes\"." ;
		next;
		mes "-Information-";
		mes " ^FF0000 Also, if you change your job to Ninja, Gunslinger, Supernovice, or Taekwon Kid, we will collect your \"Level Up Box\", \"Weapon Exchange Ticket\", and \"Armor Exchange Ticket\" when you change jobs." ;
		return;
	}
}

ac_cl_room.gat,44,16,0	script	#講習1_warp1	45,1,1,{
	if(AC_PASSPORT<2) {
		mes "[Ella]";
		mes "You are a prospective student!" ;
		mes "Please complete the enrollment process here first." ;
		mes " ";
		mes "-hearing voices from the room-";
		close;
	}
	warp "ac_cl_area.gat",40,133;
	end;
}

// Puron
ac_cl_room.gat,30,46,6	script	Puron#ac_room	750,{
	function ABOUT_QUESTWINDOW;
	function ABOUT_JOBCHANGE;
	function ABOUT_JOB;
	function ABOUT_SKILL;
	function ABOUT_STATUS;
	function ABOUT_WEAPON;

	if(AC_PASSPORT<2) {
		mes "[Puron]";
		mes "Welcome to the Adventurer Academy!" ;
		mes "It looks like you haven't completed the registration process yet." ;
		mes "Please complete the registration first." ;
		close;
	}
	set '@novice, callfunc("AC_GetNovice");
	if(AC_NOVICE_QUE>=10 || Job!=Job_Novice){
		if(Job!=Job_Novice){
			if(AC_NOVICE_QUE) {
				mes "[Puron]";
				mes "You seem to be doing well." ;
				mes "If you have any questions, I can explain." ;
				mes " ";
				mes "What do you want to ask me about?" ;
			} else {
				mes "[Puron]";
				mes "Hello." ;
				mes "I don't know if this is something you need to do, but.. ";
				mes " ";
				mes "What do you want to ask me about?" ;
			}
		} else if(AC_NOVICE_QUE==10){
			mes "[Puron]";
			mes "Next, ^FF0000Aldi^000000 on the other side of the room will teach you." ;
			next;
			mes "[Puron]";
			mes "If you have any questions about the primary profession, come back and ask me again, even when you are in the primary profession." ;
			mes "Or is there something else you want to ask?" ;
		} else if(AC_NOVICE_QUE > 10 && AC_NOVICE_QUE < 20){
			mes "[Puron]";
			mes "My course is finished." ;
			mes "Next, ^0000FFAldi^000000 on the other side of the room will teach you." ;
			mes "Or is there something else you want to ask?" ;
		} else if(AC_NOVICE_QUE >= 20 && AC_NOVICE_QUE < 30){
			mes "[Puron]";
			mes "I see my training is finished." ;
			mes "^0000FFFaye^000000 at the back of the room will teach you the last part." ;
			mes "Or is there something else you want to ask?" ;
		} else if(AC_NOVICE_QUE>=30){
			mes "[Puron]";
			mes "It looks like you got everything done safely." ;
			mes "Do you have any more questions about your profession?" ;
		}
		while(1){
			next;
			switch(select("About quests", "About changing jobs", "About first job", "About first job skills", "About first job status", "About weapons", "Nothing to ask")){
			case 1:
				ABOUT_QUESTWINDOW;
				break;
			case 2:
				ABOUT_JOBCHANGE;
				break;
			case 3:
				ABOUT_JOB;
				break;
			case 4:
				ABOUT_SKILL;
				break;
			case 5:
				ABOUT_STATUS;
				break;
			case 6:
				ABOUT_WEAPON;
				break;
			default:
				mes "[Puron]";
				mes "If you have any more questions, I'll explain it to you and you can come back anytime." ;
				close2;
				cutin "ninja_throwshurike.bmp", 255;
				end;
			}
			mes "[Puron]";
			mes "Is there anything else you would like to ask?" ;
		}
	}
	
	switch(AC_NOVICE_QUE){
	case 0:
		mes "[Puron]";
		mes "You're a new student." ;
		mes "I'm ^0000FFPuron^000000 in charge of the course." ;
		mes "Have you heard about ^FF000000quests^000000 from Ella?" ;
		next;
		mes "[Puron]";
		mes "Let's get started with a detailed discussion of the ^FF000000quest window^000000." ;
		next;
		ABOUT_QUESTWINDOW;
	case 1:
		mes "[Puron]";
		mes "I see you have figured out about the quest window." ;
		if(AC_NOVICE_QUE < 1){
			if(BaseLevel<2 || JobLevel<2){
				mes "Let's celebrate!" ;
				if(checkre()) {
					if (BaseLevel<2) getexp 2,0;
					if (JobLevel<2) getexp 0,8;
				}
				else {
					if (BaseLevel<2) getexp 10,0;
					if (JobLevel<2) getexp 0,31;
				}
			}
			set AC_NOVICE_QUE,1;
		}
		mes "Next, I'll teach you about the basics of being an adventurer and changing jobs!" ;
		ABOUT_JOBCHANGE;
	case 2:
		mes "[Puron]";
		mes "I guess you've figured out about the job change." ;
		if (AC_NOVICE_QUE < 2){
			if(BaseLevel<3 || JobLevel<3){
				mes "Let's celebrate!" ;
				if(checkre()) {
					if (BaseLevel<3) getexp 4,0;
					if (JobLevel<3) getexp 0,10;
				}
				else {
					if (BaseLevel<3) getexp 17,0;
					if (JobLevel<3) getexp 0,44;
				}
			}
			set AC_NOVICE_QUE,2;
		}
		mes "Okay, now let's talk about the professions that you can change from Novice to!" ;
		next;
		ABOUT_JOB;
	case 3:
	case 4:
	case 5:
		mes "[Puron]";
		mes "I see you have found out about the first job." ;
		if(AC_NOVICE_QUE < 3){
			if(BaseLevel<5 || JobLevel<5){
				mes "Let's celebrate!" ;
				if(checkre()) {
					if (BaseLevel<4) getexp 5,0;
					if (JobLevel<4) getexp 0,12;
					if (BaseLevel<5) getexp 9,0;
					if (JobLevel<5) getexp 0,16;
				}
				else {
					if (BaseLevel<4) getexp 26,0;
					if (JobLevel<4) getexp 0,59;
					if (BaseLevel<5) getexp 37,0;
					if (JobLevel<5) getexp 0,77;
				}
			}
			set AC_NOVICE_QUE,3;
		}
		if(Job==Job_Novice && AC_NOVICE_QUE<5){
			next;
			mes "[Puron]";
			if(AC_NOVICE_QUE==3){
				mes "Oh yeah, I'll give you this!" ;
				next;
			} else {
				mes "Have you reduced your baggage?" ;
				next;
				if(select("I have reduced", "I have not reduced")==2){
					mes "[Puron]";
					mes "I guess I'll have to reduce my luggage first." ;
					close;
				}
			}
			set AC_NOVICE_QUE,4;
			if(checkitemblank() == 0){
				mes "^FF0000<Warning>^000000";
				mes "-Unable to receive items due to the number of different items in your possession-";
				mes "-Please reduce the number of items in your possession and talk to me again-";
				close;
			} else
			if(Weight>(MaxWeight/100)*90){
				mes "^FF0000<Warning>^000000";
				mes "-The item cannot be received due to the high weight of the items in your possession-";
				mes "-Please reduce the number of items in your possession and then talk to me again-";
				close;
			}
			getitem 569, 50;
			emotion 46,"";
			set AC_NOVICE_QUE,5;
			mes "[Puron]";
			mes "A must-have for adventurers, a recovery item!" ;
			mes "You can use it when you are wounded in a battle with a monster." ;
			mes " ";
			mes "Well, that's the end of my training course!" ;
			next;
			mes "[Puron]";
			mes "You can check the items I just gave you by pressing the ^0000FF\"item\"^000000 button in the ^0000FF\"Basic Information\"^000000 window to display the ^0000FF\"Items in possession\"^000000 window." ;
		} else {
			mes "　";
			mes "Well, that's the end of my course!" ;
		}
		delquest 100112;
		setquest 100116;
		set AC_NOVICE_QUE, 10; //Puronの講習完了
	default:
		mes "[Puron]";
		mes "Next, ^FF0000Aldi^000000 on the other side of the room will teach you." ;
		next;
		mes "[Puron]";
		mes "If you have any questions about the first job, come back and ask me again, even when you are in the first job." ;
		close;
	}

	function	ABOUT_QUESTWINDOW	{
		while(1){
			mes "[Puron]";
			mes "The quest window can be displayed by pressing ^FF0000Alt + U^000000." ;
			mes "To see the details of a quest, double-click on the quest name or use the \"view\" button.";
			cutin "jp_quest_help02.bmp", 2;
			next;
			mes "[Puron]";
			mes "And the ^0000FF quest details^000000 contains the request and the objectives to accomplish." ;
			mes " ";
			mes "If you don't know what to do, check the detailed information!" ;
			cutin "jp_quest_help03.bmp", 2;
			next;
			mes "[Puron]";
			mes "Some of the quests involve defeating monsters." ;
			mes "In that case, you can look at the monster's location at the bottom of the window." ;
			mes "You can see which and how many monsters you have killed." ;
			cutin "jp_quest_help04.bmp", 2;
			next;
			mes "[Puron]";
			mes "Yes, the quests that involve time have the time in the lower right corner." ;
			mes "The ones that require a certain amount of time to complete or are restricted to a specified time have the time there, so I guess you'd better check." ;
			cutin "jp_quest_help05.bmp", 2;
			next;
			cutin "jp_quest_help05.bmp", 255;
			mes "[Puron]";
			mes "Did you understand about the quest window?" ;
			mes " ";
			mes "You can display the quest window with ^FF0000Alt+U^000000." ;
			next;
			if(select("OK", "Tell me again")==1) break;
			mes "[Puron]";
			mes "Okay, I'll explain it again." ;
			next;
		}
		return;
	}

	function	ABOUT_JOBCHANGE	{
		while(1) {
			mes "[Puron]";
			mes "Adventurers in this world come in a variety of occupations." ;
			mes "Your profession now is Novice." ;
			mes "Every adventurer starts as a Novice." ;
			next;
			mes "[Puron]";
			mes "From ^0000FFNovice^0000000000FF you can change to a ^0000FF1st job^000000FF or a special 1st job.";
			next;
			mes "[Puron]";
			mes "However, once you change jobs, you cannot return to your original occupation." ;
			mes "Choose carefully the profession you change jobs to." ;
			mes "Also, the profession you change jobs to will determine the second job of your profession." ;
			next;
			mes "[Puron]";
			mes "When you become a first degree, you will be able to use skills and items that are not available when you are a Novice." ;
			mes "You can grow through the stages of Novice → 1st job → 2nd job." ;
			next;
			mes "[Puron]";
			mes "By the time the three of us are done with the training, you should be able to change jobs." ; 
			next;
			mes "[Puron]";
			mes "Did you find out about the job change?" ;
			next;
			if (select("OK", "Not sure")==1) break;
			mes "[Puron]";
			mes "Okay, I'll explain it again." ;
			next;
		}
		return;
	}

	function	ABOUT_JOB_CLASS1	{
		cutin "weapon_list.bmp", 255;
		next;
		mes "[Puron]";
		mes "There are seven basic primary professions in the world and three other special primary professions." ;
		next;
		mes "[Puron]";
		mes "The basic primary occupations are ^000000FFSwordsman^000000, ^000000FFMagician^000000, ^000000FFAcolyte^000000, ^000000FFThief^000000, ^000000FFMArcher^000000, ^000000 FFMerchant^000000, and ^0000FFTaekwon Kid^000000.";
		mes "The three special first occupations are ^0000FFGunslinger^000000, ^0000FFNinja^000000, and ^0000FFSupernovice^000000." ;
		next;
		return;
	}

	function	ABOUT_JOB_FEATURE	{
	switch(select("Good at close combat", "Good at long range combat", "Good at magic", "Good at helping friends", "Good at carrying items and making money", "Good at fighting", "About special jobs",(AC_NOVICE_QUE2 & 0x2 ? "I know about occupations" : ""))) {
		case 1:
			cutin "swordman_1.bmp", 2;
			mes "[Puron]";
			mes "If I were to say a profession that is good at close combat, it would be the first job ^000000FFSwordsman^000000 or its higher professions, Knight and Crusader." ;
			next;
			mes "[Puron]";
			mes "I'll probably leave it to the knights for front line attacks and the crusaders for defense." ;
			mes "In the bottom row, the occupation on the left will be the Knight and the occupation on the right will be the Crusader." ;
			next;
			cutin "thief_1.bmp", 2;
			mes "[Puron]";
			mes "Also, the primary profession ^0000FFThief^000000, which can fight by evading enemy attacks with its quick attacks and lightness, and its higher professions, assassin and rogue, are also professions that can fight on the front lines." ;
			next;
			mes "[Puron]";
			mes "Assassins and rogues can use their skills to take enemy items, and they can also save money by selling the items they get." ;
			next;
			mes "[Puron]";
			mes "The Rogue's Snatcher skill in particular is very powerful, as it allows you to take enemy items during a normal attack." ;
			next;
			mes "[Puron]";
			mes "The occupation on the left in the bottom row will be Assassin, and the occupation on the right will be Rogue." ;
			next;
			cutin "thief_1.bmp", 255;
			mes "[Information]";
			mes "-1st job Swordsman-";
			mes "-Difficulty: suitable for beginners^FF000000(recommended)^000000-";
			mes "-1st job Thief-";
			mes "-Difficulty: suitable for beginners^FF000000(recommended)^000000-";
			break;
		case 2:
			cutin "archer_1.bmp", 2;
			mes "[Puron]";
			mes "The professions that are good at long-distance fighting would be the primary ^0000FFArcher^000000 and its higher professions, hunters, dancers and bards." ;
			next;
			cutin "archer_3.bmp", 2;
			mes "[Puron]";
			mes "Especially when you are a hunter, you can use your skills to set traps instead of direct attacks to lure the enemy into a fight." ;
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "Dancers and bards can use effective support skills, such as when fighting with their friends." ;
			next;
			cutin "archer_4.bmp", 255;
			mes "[Information]";
			mes "-1st job Archer‐";
			mes "-Difficulty: suitable for beginners^FF000000(recommended)^000000-";
			break;
		case 3:
			cutin "magician_1.bmp", 2;
			mes "[Puron]";
			mes "The professions that are good at magical warfare would be the primary profession ^0000FFMagician^000000 and its higher professions, such as wizard and sage." ;
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[Puron]";
			mes "Also, although it may be thorny, I see that the Soul Linker, which will be a higher level occupation for the Taekwon Kid, can also use a powerful magic attack called Esma." ;
			next;
			cutin "magician_3.bmp", 2;
			mes "[Puron]";
			mes "Wizards are able to strike down their enemies with powerful magical attacks." ;
			mes "While you can make powerful attacks, I wouldn't expect you to be able to defend yourself." ;
			next;
			cutin "magician_4.bmp", 2;
			mes "[Puron]";
			mes "Sage will be a profession that can fight against the weaknesses of various attributes and strengthen the resistance of the attributes." ;
			next;
			cutin "magician_4.bmp", 255;
			mes "[Information]";
			mes "-1st job Magician‐";
			mes "-Difficulty: intermediate level-";
			break;
		case 4:
			cutin "acolyte_1.bmp", 2;
			mes "[Puron]";
			mes "The professions that are good at helping their friends would be ^000000FFAcolyte^000000, which is the first level profession, and Priest, which is the higher level profession, and the professions shown on the left of the bottom row." ;
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[Puron]";
			mes "Soul Linker, which will also be the upper profession of the primary ^0000FFTaekwon Kid^000000,";
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "The professions of Bard and Dancer, which are higher level professions from the first job of ^0000FFArcher^000000, can also be said to be good at support." ;
			next;
			mes "[Puron]";
			cutin "acolyte_3.bmp", 2;
			mes "Priests have powerful support skills, such as Kyrie Eleison, a skill that puts a barrier on the target and protects it for a certain number of times, and Magnificat, which doubles the natural recovery of SP." ;
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[Puron]";
			mes "The skills handled by soul linkers have different effects for each profession, but there are powerful soul-based skills as support." ;
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "Bard has a powerful skill called Poem of Bragi that reduces the cast time of players within range and reduces the aftercast delay after using the skill." ;
			next;
			mes "[Puron]";
			mes "I see that Dancer has a support skill called Service for You that increases the maximum SP of targets within range and reduces SP drain." ;
			next;
			cutin "archer_4.bmp", 255;
			mes "[Information]";
			mes "‐1st job Acolyte‐";
			mes "-Difficulty: suitable for intermediate level";
			mes "‐1st job Taekwon Kid‐";
			mes "-Difficulty: suitable for intermediate level";
			mes "‐1st job Archer‐";
			mes "-Difficulty: suitable for beginners^FF000000(recommended)^000000-";
			break;
		case 5:
			cutin "merchant_1.bmp", 2;
			mes "[Puron]";
			mes "If I were to say a profession that is good at carrying baggage and making money, it would be the primary profession ^0000FFMerchant^000000 or its higher professions, Blacksmith and Alchemist." ;
			next;
			mes "[Puron]";
			mes "Merchant occupations have a skill that other occupations do not have, which is opening a stall, which is a feature that makes it easy to sell items." ;
			next;
			mes "[Puron]";
			mes "You can set any price you want for the items you acquire and sell them on the spot." ;
			mes "You can set your own price, so you can even sell them for a higher price than you would at a tool shop." ;
			next;
			cutin "merchant_1.bmp", 255;
			mes "[Information]";
			mes "‐1st job Merchant‐";
			mes "-Difficulty: for advanced users-";
			break;
		case 6:
			cutin "taekwonkid_2.bmp", 2;
			mes "[Puron]";
			mes "The professions that are good at fighting are the first-order ^0000FFTaekwon Kid^000000 and the ";
			next;
			cutin "taekwonkid_3.bmp", 2;
			mes "[Puron]";
			mes "Star Gladiator, which is the higher profession of Taekwon Kid.";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[Puron]";
			mes "Now I'll mention Monk, which is a higher level profession from the first job ^0000FFAcolyte^000000." ;
			next;
			cutin "taekwonkid_2.bmp", 2;
			mes "[Puron]";
			mes "Taekwon Kid is a profession where you don't carry any weapons and fight only with your body." ;
			mes "The skill of Warm Wind allows you to fight with various attributes on yourself, so you can take advantage of your opponent's weakness." ;
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[Puron]";
			mes "Monks have skills such as the three-step palm, which can be linked from skill to skill to inflict powerful damage." ;
			mes "There is also a one-hit kill skill called Asura Strike, so there is a wide variety of ways to fight." ;
			next;
			cutin "acolyte_4.bmp", 255;
			mes "[Information]";
			mes "‐1st job Taekwon Kid‐";
			mes "-Difficulty: suitable for intermediate level -";
			mes "‐1st job Acolyte‐";
			mes "-Difficulty: suitable for intermediate level -";
			break;
		case 7:
			mes "[Puron]";
			mes "Special professions are not really recommended for new adventurers, but I'll explain." ;
			mes " ";
			mes "What would you like to hear?" ;
			next;
			switch(select("Good at ninjutsu", "Good at using guns", "Want to live as Novice")){
			case 1:
				cutin "ninja.bmp", 2;
				mes "[Puron]";
				mes "A profession that is good at ninjutsu would be ^0000FFNinja^000000, which is a special primary profession." ;
				next;
				mes "[Puron]";
				mes "It's hard if you go for this profession half-heartedly, because there are no higher-level professions and there are difficulties in growing up that you won't find in other professions." ;
				next;
				mes "[Puron]";
				mes "Ninja can fight with magical attack skills or attack from a distance using weapons that can be thrown." ;
				next;
				mes "[Puron]";
				mes "Of course, you can also fight in close quarters and learn a skill called Final Strike, which is a powerful blow in exchange for your HP." ;
				mes "Depending on how you raise them, it's a profession that changes the way you fight a lot." ;
				next;
				cutin "ninja.bmp", 255;
				mes "[Information]";
				mes "‐Special 1st job Ninja‐";
				mes "-Difficulty: for advanced users-";
				break;
			case 2:
				cutin "gunslinger.bmp", 2;
				mes "[Puron]";
				mes "When I say good at using guns, I'm talking about a special primary ^0000FFGunslinger^000000." ;
				next;
				mes "[Puron]";
				mes "It's hard if you go for this profession half-heartedly, because there are no higher-level professions and there are difficulties in growing up that you won't find in other professions." ;
				next;
				mes "[Puron]";
				mes "Gunslinger is a profession that can handle a wide variety of guns, and depending on the lineage of the gun, it becomes a profession that changes the way you fight." ;
				next;
				mes "[Puron]";
				mes "The basic handgun, the shotgun for ranged attacks, the rifle for long-range attacks, the gatling for quick attacks, the..";
				next;
				mes "[Puron]";
				mes "..you're going to have to learn to use the grenades in your own way, because they do a lot of damage per hit." ;
				next;
				cutin "gunslinger.bmp", 255;
				mes "[Information]";
				mes "‐Special 1st job Gunslinger‐";
				mes "-Difficulty: for advanced users-";
				break;
			case 3:
				cutin "super_novice.bmp", 2;
				mes "[Puron]";
				mes "What?" ;
				mes "Do you want to live as a Novice?" ;
				mes "I guess the only thing I can recommend for such a precious idea is a special 1st ^0000FFSupernovice^000000." ;
				next;
				mes "[Puron]";
				mes "Supernovice has a lot of hardships that other professions don't have, such as the fact that Supernovice doesn't have a higher level profession and you have to have a BaseLv of 45 or higher to become a Supernovice." ;
				next;
				mes "[Puron]";
				mes "Supernovice can learn most of the basic skills of the other primary professions, with the exception of a few, so depending on how they grow, they may be able to fight in a variety of ways." ;
				next;
				mes "[Puron]";
				mes "It's a dream job, but I can say that people who pursue this profession are quite valuable in the Adventurer Academy." ;
				next;
				cutin "super_novice.bmp", 255;
				mes "[Information]";
				mes "‐Special 1st job Supernovice‐";
				mes "-Difficulty: for advanced users-";
				break;
			}
		}
		next;
		cutin "swordman_2.bmp", 255;
		return;
	}

	function	ABOUT_JOB_SELECT	{
		switch(select("^0000FFSwordsman^000000","^0000FFMagician^000000","^0000FFAcolyte^000000","^0000FFThief^000000","^0000FFArcher^000000","^0000FFMerchant^000000","^0000FFTaekwon Kid^000000","^0000FFSpecial 1st job^000000", "I know about the profession")){
		case 1:
			mes "[Puron]";
			mes "^0000FFSwordsman^000000, right?" ;
			mes "It's a profession that allows you to equip yourself with many types of weapons: daggers, one-handed swords, two-handed swords, axes, spears, and blunt weapons." ;
			mes "From the first Swordsman, you will be able to change jobs in two different lines." ;
			cutin "swordman_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "The one shown in the top row is the first job ^0000FFSwordsman^000000";
			mes "A sword user is often called a swordsman, right?" ;
			cutin "swordman_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the left of the bottom row is the second occupation, knight, which you can change jobs to after becoming a Swordsman." ;
			cutin "swordman_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the right of the bottom row is the ^0000FF Crusader^0000000000, the second job you can change to after becoming a Swordsman.";
			cutin "swordman_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "Swordsman is a profession that excels in swordsmanship." ;
			mes "They are very powerful in melee combat." ;
			mes "HP is basically higher than other professions." ;
			cutin "swordman_2.bmp", 2;
			next;
			cutin "swordman_2.bmp", 255;
			mes "[Information]";
			mes "‐Swordsman‐";
			mes "-Difficulty: suitable for beginners^FF000000(recommended)^000000-";
			break;
		case 2:
			mes "[Puron]";
			mes "^0000FFMagician^000000だね。";
			mes "短剣、杖といった種類の武器を";
			mes "装備することができる職業だ。";
			mes "1次職のMagicianからは2系統の";
			mes "転職が可能になるよ。";
			cutin "magician_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "上の段に表示されているのが";
			mes "1次職の^0000FFMagician^000000。";
			cutin "magician_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "下の段の左に表示されているのが、";
			mes "Magicianになった後に";
			mes "転職してなれる2次職の^0000FFウィザード^000000。";
			cutin "magician_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "下の段の右に表示されているのが、";
			mes "Magicianになった後に転職してなれる";
			mes "2次職の^0000FFセージ^000000。";
			cutin "magician_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "^0000FFMagician^000000は魔法の攻撃力に";
			mes "優れた職業だよ。";
			cutin "magician_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "体力が乏しいことを除けば、";
			mes "他の職業と違って、魔法に属性が";
			mes "あるため、弱点をついた攻撃を";
			mes "行いやすく、強力な魔法で敵を";
			mes "一掃できることが特徴だね。";
			next;
			cutin "magician_2.bmp", 255;
			mes "[Information]";
			mes "‐Magician‐";
			mes "‐育成難易度：中級者向き‐";
			break;
		case 3:
			mes "[Puron]";
			mes "^0000FFAcolyte^000000だね。";
			mes "鈍器、杖といった種類の武器を";
			mes "装備することができる職業だ。";
			mes "1次職のAcolyteからは2系統の";
			mes "転職が可能になるよ。";
			cutin "acolyte_1.bmp", 2;
			next;
			cutin "acolyte_2.bmp", 2;
			mes "[Puron]";
			mes "上の段に表示されているのが";
			mes "1次職の^0000FFAcolyte^000000。";
			next;
			cutin "acolyte_3.bmp", 2;
			mes "[Puron]";
			mes "下の段の左に表示されているのが、";
			mes "Acolyteになった後に";
			mes "転職してなれる2次職の^0000FFプリースト^000000。";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[Puron]";
			mes "下の段の右に表示されているのが、";
			mes "Acolyteになった後に転職してなれる";
			mes "2次職の^0000FFモンク^000000。";
			next;
			cutin "acolyte_2.bmp", 2;
			mes "[Puron]";
			mes "^0000FFAcolyte^000000は聖職者の奇跡によって、";
			mes "仲間の能力を引き出したり、";
			mes "負傷した仲間を癒すことに";
			mes "優れた職業だよ。";
			mes "パーティーでは欠かせない存在と";
			mes "なることが特徴だね。";
			next;
			cutin "acolyte_2.bmp", 255;
			mes "[Information]";
			mes "‐Acolyte‐";
			mes "‐育成難易度：中級者向き‐";
			break;
		case 4:
			mes "[Puron]";
			mes "^0000FFThief^000000だね。";
			mes "短剣、片手剣、斧、弓";
			mes "といった種類の武器を";
			mes "装備することができる職業だ。";
			mes "1次職の^0000FFThief^000000からは2系統の";
			mes "転職が可能になるよ。";
			cutin "thief_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "上の段に表示されているのが";
			mes "1次職の^0000FFThief^000000。";
			cutin "thief_2.bmp", 2;
			next;
			cutin "thief_3.bmp", 2;
			mes "[Puron]";
			mes "下の段の左に表示されているのが、";
			mes "Thiefになった後に";
			mes "転職してなれる2次職の^0000FFアサシン^000000。";
			next;
			cutin "thief_4.bmp", 2;
			mes "[Puron]";
			mes "下の段の右に表示されているのが、";
			mes "Thiefになった後に転職してなれる";
			mes "2次職の^0000FFローグ^000000。";
			next;
			cutin "thief_2.bmp", 2;
			mes "[Puron]";
			mes "^0000FFThief^000000は身軽さを生かし、";
			mes "攻撃を避けて戦闘を行うことが";
			mes "得意な職業だ。";
			mes "敵からアイテムを盗んだり、";
			mes "姿を消すことができる。";
			next;
			mes "[Puron]";
			mes "毒を使用した攻撃など、";
			mes "変わった戦い方が特徴だね。";
			next;
			cutin "thief_2.bmp", 255;
			mes "[Information]";
			mes "‐Thief‐";
			mes "‐育成難易度：初心者向き^FF0000(推奨)^000000‐";
			break;
		case 5:
			cutin "archer_1.bmp", 2;
			mes "[Puron]";
			mes "^0000FFArcher^000000だね。";
			mes "短剣、弓といった種類の武器を";
			mes "装備することができる職業だ。";
			mes "1次職のArcherからは2系統の";
			mes "転職が可能になるよ。";
			next;
			cutin "archer_2.bmp", 2;
			mes "[Puron]";
			mes "上の段に表示されているのが";
			mes "1次職の^0000FFArcher^000000。";
			next;
			cutin "archer_3.bmp", 2;
			mes "[Puron]";
			mes "下の段の左に表示されているのが、";
			mes "Archerになった後に";
			mes "転職してなれる2次職の^0000FFハンター^000000。";
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "下の段の右に表示されているのが、";
			mes "Archerになった後に転職してなれる";
			mes "2次職の^0000FFバード^000000と^0000FFダンサー^000000。";
			mes "^0000FFバード^000000は男性がなる職業。";
			mes "^0000FFダンサー^000000は女性がなる職業なんだ。";
			next;
			cutin "archer_2.bmp", 2;
			mes "[Puron]";
			mes "^0000FFArcher^000000は弓を扱うことに";
			mes "優れた職業だよ。";
			mes "属性つきの矢を使用した射撃に";
			mes "よって、強力な攻撃を繰り出せる。";
			mes "でも、矢を大量に所持するから、";
			mes "回復剤の量には注意が必要かな。";
			next;
			cutin "archer_2.bmp", 255;
			mes "[Information]";
			mes "‐Archer‐";
			mes "‐育成難易度：初心者向き^FF0000(推奨)^000000‐";
			break;
		case 6:
			mes "[Puron]";
			mes "^0000FFMerchant^000000だね。";
			mes "短剣、片手剣、斧、鈍器";
			mes "といった種類の武器を";
			mes "装備することができる職業だ。";
			mes "1次職のMerchantからは2系統の";
			mes "転職が可能になるよ。";
			cutin "merchant_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "上の段に表示されているのが";
			mes "1次職の^0000FFMerchant^000000。";
			mes "Merchantは^0000FF商人^000000と";
			mes "呼ばれることも多い職業だね。";
			cutin "merchant_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "下の段の左に表示されているのが、";
			mes "Merchantになった後に";
			mes "転職してなれる2次職の";
			mes "^0000FFブラックスミス^000000。";
			cutin "merchant_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "下の段の右に表示されているのが、";
			mes "Merchantになった後に";
			mes "転職してなれる";
			mes "2次職の^0000FFアルケミスト^000000。";
			cutin "merchant_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "^0000FFMerchant^000000は品物の扱いに";
			mes "優れた職業だよ。";
			mes "戦闘は得意ではないけれど、";
			mes "アイテムを大量に持ち運ぶことで、";
			mes "長時間の戦闘や、戦闘以外の";
			mes "売買が気軽にできることが特徴だね。";
			cutin "merchant_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "ブラックスミスやアルケミストに";
			mes "なることで、後々製造なども";
			mes "できるようになる職業だね。";
			next;
			cutin "merchant_2.bmp", 255;
			mes "[Information]";
			mes "‐Merchant‐";
			mes "‐育成難易度：上級者向き‐";
			break;
		case 7:
			mes "[Puron]";
			mes "^0000FFTaekwon Kid^000000だね。";
			mes "武器を装備せず、";
			mes "己の体で戦う職業だ。";
			mes "1次職のTaekwon Kidからは2系統の";
			mes "転職が可能になるよ。";
			cutin "taekwonkid_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "上の段に表示されているのが";
			mes "1次職の^0000FFTaekwon Kid^000000。";
			cutin "taekwonkid_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "下の段の左に表示されているのが、";
			mes "^0000FFTaekwon Kid^000000になった後に";
			mes "転職してなれる2次職の^0000FF拳聖^000000。";
			cutin "taekwonkid_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "下の段の右に表示されているのが、";
			mes "Taekwon Kidになった後に";
			mes "転職してなれる";
			mes "2次職の^0000FFソウルリンカー^000000。";
			cutin "taekwonkid_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "^0000FFTaekwon Kid^000000は蹴り技を駆使して";
			mes "戦うことに優れた職業だよ。";
			mes "武器を一切装備できないけれど、";
			mes "多彩な蹴りと素早い動きで";
			mes "戦うことが可能なことが特徴だね。";
			cutin "taekwonkid_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "また、^0000FFソウルリンカー^000000になった場合は";
			mes "^0000FFTaekwon Kid^000000のときに習得したスキルの";
			mes "多くが使えなくなる。";
			mes "習得する際に、後々のことを考えて";
			mes "スキルを習得していく必要があるね。";
			next;
			mes "[Puron]";
			mes "ただ、^0000FFTaekwon Kid^000000は他の基本 的な";
			mes "職業6つと異なっていて、";
			mes "^0000FF拳聖^000000、^0000FFソウルリンカー^000000の";
			mes "上位の職業はないんだ。";
			mes "1つを極めることを考えると、";
			mes "茨の道かもしれない。";
			next;
			cutin "taekwonkid_2.bmp", 255;
			mes "[Information]";
			mes "‐Taekwon Kid‐";
			mes "‐育成難易度：中級者向き‐";
			break;
		case 8:
			mes "[Puron]";
			mes "特殊1次職についてだね。";
			mes "他の職業と違って特殊1次職は";
			mes "1次職以上の上位職がない";
			mes "職業なんだ。";
			mes "聞きたい職業は何かな？";
			next;
			switch(select("^0000FFGunslinger^000000","^0000FFNinja^000000","^0000FFSupernovice^000000","他の職業について聞く")){
			case 1:
				cutin "gunslinger.bmp", 2;
				mes "[Puron]";
				mes "^0000FFGunslinger^000000だね。";
				mes "銃を装備する唯一の職業だ。";
				mes "銃は5種類ある。";
				mes "ハンドガン、ライフル、ショットガン、";
				mes "ガトリングガン、グレネードガンだ。";
				next;
				mes "[Puron]";
				mes "上の段に表示されているのは";
				mes "キミの今のノービスの職業。";
				mes "下の段に表示されているのが、";
				mes "特殊1次職の^0000FFGunslinger^000000になるよ。";
				next;
				mes "[Puron]";
				mes "^0000FFGunslinger^000000は銃を駆使して";
				mes "戦う職業だよ。";
				mes "戦闘は遠距離からの攻撃になるね。";
				next;
				mes "[Puron]";
				mes "5種類の武器を扱うことができるから、";
				mes "状況に合わせた様々な攻撃技が";
				mes "あるのが特徴だね。";
				next;
				cutin "gunslinger.bmp", 255;
				mes "[Information]";
				mes "‐Gunslinger‐";
				mes "‐育成難易度：上級者向き‐";
				break;
			case 2:
				cutin "ninja.bmp", 2;
				mes "[Puron]";
				mes "^0000FFNinja^000000だね。";
				mes "短剣、Ninja刀、手裏剣といった";
				mes "種類の武器を装備することが";
				mes "できる職業だ。";
				next;
				mes "[Puron]";
				mes "上の段に表示されているのは";
				mes "キミの今のノービスの職業。";
				mes "下の段に表示されているのが、";
				mes "特殊1次職の^0000FFNinja^000000になるよ。";
				next;
				mes "[Puron]";
				mes "Ninjaは隠密性の高い素早い動きを";
				mes "得意とする職業だよ。";
				mes "Ninja刀や手裏剣などの投擲武器、";
				mes "忍術といった魔法に似ている攻撃を";
				mes "駆使した戦いができることが特徴だね。";
				next;
				cutin "ninja.bmp", 255;
				mes "[Information]";
				mes "‐Ninja‐";
				mes "‐育成難易度：上級者向き‐";
				break;
			case 3:
				cutin "super_novice.bmp", 2;
				mes "[Puron]";
				mes "^0000FFSupernovice^000000だね。";
				mes "短剣、片手剣、斧、";
				mes "鈍器、杖といった種類の武器を";
				mes "装備することができる職業だ。";
				next;
				mes "[Puron]";
				mes "上の段に表示されているのは";
				mes "キミの今のノービスの職業。";
				mes "下の段に表示されているのが、";
				mes "特殊1次職の^0000FFSupernovice^000000";
				mes "になるよ。";
				next;
				mes "[Puron]";
				mes "Supernoviceは他の1次職の";
				mes "スキルの多くを習得できる職業だよ。";
				mes "ノービスとしての心を";
				mes "いつまでも持ち続けることが";
				mes "できる人がたどり着く職業だね。";
				next;
				mes "[Puron]";
				mes "個性あふれる成長が望めることが";
				mes "特徴になるかな。";
				next;
				cutin "super_novice.bmp", 255;
				mes "[Information]";
				mes "‐Supernovice‐";
				mes "‐育成難易度：上級者向き‐";
				break;
			}
		}
		next;
		cutin "swordman_2.bmp", 255;
		return;
	}

	function	ABOUT_JOB	{
		set '@sel,1;
		set '@last,0;
		while(1){
			switch('@sel){
			case 1:
				if('@last!=1 && AC_NOVICE_QUE<3){
					mes "[Puron]";
					mes "それでは多くの冒険者が転職する";
					mes "1次職について説明しよう。";
				}
				ABOUT_JOB_CLASS1;
				mes "[Puron]";
				mes "職業の特徴か、職業名";
				mes "どちらで聞きたいかな？";
				next;
				setarray '@select, 2,3,1,4;
				if('@last==1 || AC_NOVICE_QUE>=3){
					set '@last, '@sel;
					set '@sel, '@select[select("特徴で聞く","職業名で聞く","1次職について再度聞く","職業についてはわかった")-1];
				} else {
					set '@last, '@sel;
					set '@sel, '@select[select("特徴で聞く","職業名で聞く","1次職について再度聞く")-1];
				}
				continue;
			case 2:
				mes "[Puron]";
				if('@last!=2)
					mes "それじゃ、特徴で説明をしよう。";
				mes "どんな特徴が気になる？";
				next;
				ABOUT_JOB_FEATURE;
				mes "[Puron]";
				mes "他の特徴でも聞くかい？";
				mes "それとも職業で聞くかい？";
				next;
				setarray '@select, 4,2,3,1;
				set '@last, '@sel;
				set '@sel, '@select[select("職業についてはわかった","特徴で聞く","職業で聞く","1次職について再度聞く")-1];
				continue;
			case 3:
				mes "[Puron]";
				if('@last!=3)
					mes "それじゃ、職業で説明をしよう。";
				mes "どれか興味のある^FF0000職業^000000はあるかな？";
				next;
				setarray '@select, 4,3,2,1;
				ABOUT_JOB_SELECT;
				mes "[Puron]";
				mes "他の職業も聞くかい？";
				mes "それとも、特徴で聞くかい？";
				next;
				set '@last, '@sel;
				set '@sel, '@select[select("職業についてはわかった","職業で聞く","特徴で聞く","1次職について再度聞く")-1];
				continue;
			}
			break;
		}
		return;
	}

	function	ABOUT_SKILL	{
		mes "[Puron]";
		mes "^FF0000各職業はスキルという特殊技能を";
		mes "身につけることができる。^000000";
		mes "攻撃、回復、能力の向上、サポートな";
		mes "ど、その他にもいろいろな効果を";
		mes "持ったスキルが存在するんだ。";
		next;
		mes "[Puron]";
		mes "また、スキルによってはLvを";
		mes "上げることができるものもある。";
		mes "どのスキルを覚えて、成長させるか";
		mes "慎重に選んだほうがいいね。";
		next;
		mes "[Puron]";
		mes "^FF0000スキルはスキルポイントを消費して";
		mes "覚えることができるよ。^000000";
		mes "JobLvを1つ上げるごとに1ポイントの";
		mes "スキルポイントが得られるんだ。";
		next;
		mes "[Puron]";
		mes "各職業にはJobLvの上限が";
		mes "決まっていて、全てのスキルを";
		mes "覚えられるわけではないから、";
		mes "気をつけてね。";
		next;
		while(1){
			mes "[Puron]";
			mes "どの職業の^FF0000スキル^000000について聞きたい？";
			next;
			switch(select("^0000FFSwordsman^000000","^0000FFMagician^000000","^0000FFAcolyte^000000","^0000FFThief^000000","^0000FFArcher^000000","^0000FFMerchant^000000","^0000FFTaekwon Kid^000000","^0000FF特殊1次職^000000","スキルについてはわかった")){
			case 1:
				cutin "swordman_2",2;
				mes "[Puron]";
				mes "^0000FFSwordsman^000000だね。";
				mes "1次職であるSwordsmanは";
				mes "JobLvを50まで上げることができるよ。";
				mes "スキルポイントは49ポイント使用できる";
				mes "ことになるね。";
				next;
				mes "[Puron]";
				mes "^0000FFSwordsman^000000のスキルでオススメなのは";
				mes "^FF0000HP回復力向上^000000と^FF0000バッシュ^000000、";
				mes "それと^0000FFプロボ ック^000000だろうね。";
				next;
				cutin "swordman_provork",2;
				mes "[Puron]";
				mes "^0000FFHP回復力向上^000000は近接戦闘が主となる";
				mes "Swordsmanにとっては大事なスキルだ。";
				mes "^0000FFプロボ ック^000000は指定した敵を";
				mes "興奮させて、防御力を下げるスキル。";
				mes "興奮した敵の攻撃力が上がってしまう";
				mes "けど、強力なスキルだね。";
				next;
				cutin "swordman_bash",2;
				mes "[Puron]";
				mes "^0000FFバッシュ^000000は強力な一撃を";
				mes "モンスターに与えるスキルだ。";
				mes "早くモンスターを倒すことで";
				mes "自分が受けるダメージも抑えられる。";
				mes "このスキルをLv10にしているSwordsman";
				mes "は数知れないよ。";
				next;
				mes "[Puron]";
				mes "後は少々使い勝手は難しいけれど、";
				mes "^0000FFインデュア^000000といった";
				mes "攻撃を受けても移動と攻撃が";
				mes "可能な補助スキルもあるね。";
				mes "主にパーティを組んで";
				mes "戦う場合に活躍するスキルだよ。";
				next;
				cutin "swordman_bash",255;
				break;
			case 2:
				cutin "magician_2",2;
				mes "[Puron]";
				mes "^0000FFMagician^000000だね。";
				mes "1次職であるMagicianは";
				mes "JobLvを50まで上げることができるよ。";
				mes "スキルポイントは49ポイント使用できる";
				mes "ことになるね。";
				next;
				mes "[Puron]";
				mes "^0000FFMagician^000000のスキルでオススメなのは";
				mes "^FF0000ファイアーウォール^000000と";
				mes "^FF0000ファイアーボ ルト^000000、^FF0000コールドボ ルト^000000、";
				mes "^FF0000ライトニングボ ルト^000000の各種ボ ルト系に";
				mes "なるだろうね。";
				next;
				cutin "magician_firewall",2;
				mes "[Puron]";
				mes "^FF0000ファイアーウォール^000000はMagicianに";
				mes "とって非常に大事なスキルだね。";
				mes "多くのMagicianが愛用する魔法だよ。";
				mes "HPや防御力の劣るMagicianでは敵に";
				mes "近寄られてはひとたまりもないからね。";
				next;
				cutin "magician_coldbolt",2;
				mes "[Puron]";
				mes "^FF0000ファイアーボ ルト^000000、^FF0000コールドボ ルト^000000、";
				mes "^FF0000ライトニングボ ルト^000000の各種ボ ルト系は";
				mes "Magicianの基本 ともいえる魔法だ。";
				next;
				mes "[Puron]";
				mes "レベルの低いうちはこの^0000FF3種類のうち、";
				mes "どれか1つをLv4以上^000000にして、";
				mes "相手の弱点（属性）をついた戦い方";
				mes "をするといいよ。";
				next;
				mes "[Puron]";
				mes "詠唱が早いソウルストライクといった";
				mes "攻撃魔法もあるね。";
				mes "威力は低めだけど、";
				mes "瞬時にダメージを";
				mes "与えたいときには便利だよ。";
				next;
				mes "[Puron]";
				mes "ステータスのDexを";
				mes "上げていない場合は";
				mes "詠唱速度が遅い為、";
				mes "このスキルが補ってくれる。";
				next;
				cutin "swordman_bash",255;
				break;
			case 3:
				cutin "acolyte_2",2;
				mes "[Puron]";
				mes "^0000FFAcolyte^000000だね。";
				mes "1次職であるAcolyteは";
				mes "JobLvを50まで上げることができるよ。";
				mes "スキルポイントは49ポイント使用できる";
				mes "ことになるね。";
				next;
				mes "[Puron]";
				mes "^0000FFAcolyte^000000のスキルでオススメなのは";
				mes "^FF0000ヒール^000000と^FF0000ブレッシング^000000になるかな。";
				mes "Acolyteは他の職業と比べても";
				mes "非常にスキル数が多い職業だよ。";
				mes "スキルの習得は慎重に";
				mes "行う必要があるね。";
				next;
				mes "[Puron]";
				mes "^FF0000ヒール^000000はAcolyteの基本  ともいえる";
				mes "回復スキルだね。";
				mes "他の冒険者に対しても";
				mes "使用できることから、";
				mes "多くの冒険者を助けることが";
				mes "できるはずさ。";
				next;
				cutin "acolyte_blessing",2;
				mes "[Puron]";
				mes "^FF0000ブレッシング^000000は攻撃の基本  となる";
				mes "DEX、INT、STRといったステータスを";
				mes "一時的に増加させるスキル。";
				mes "呪いや石化状態といった状態異常も";
				mes "回復することができる。";
				next;
				mes "[Puron]";
				mes "また不死系、悪魔系といった";
				mes "モンスターの属性に対しても";
				mes "呪いの効果を付与できるなど、";
				mes "まさに至れり尽くせりのスキルだね。";
				mes "ブレッシングをLv10にしている";
				mes "Acolyteの冒険者は数知れないよ。";
				next;
				cutin "acolyte_holylight",2;
				mes "[Puron]";
				mes "補助系の魔法だけではなくて、";
				mes "ホーリーライトといった";
				mes "クエストで取得できる";
				mes "攻撃魔法スキルもある。";
				next;
				mes "[Puron]";
				mes "ホーリーライトは";
				mes "攻撃の主体ということではなくて、";
				mes "敵の気をそらすことにも使える為、";
				mes "是非覚えておきたいスキルだね。";
				next;
				cutin "acolyte_holylight",255;
				break;
			case 4:
				cutin "thief_2",2;
				mes "[Puron]";
				mes "^0000FFThief^000000だね。";
				mes "1次職であるThiefは";
				mes "JobLvを50まで上げることができるよ。";
				mes "スキルポイントは49ポイント使用できる";
				mes "ことになるね。";
				next;
				mes "[Puron]";
				mes "^0000FFThief^000000のスキルでオススメなのは";
				mes "^FF0000インベナム^000000、^FF0000回避率増加^000000だね。";
				next;
				cutin "thief_envenom",2;
				mes "[Puron]";
				mes "^FF0000インベナム^000000は敵を毒状態ににして、";
				mes "HPを徐々に減らしていくスキル。";
				mes "毒にかかりやすい敵と、";
				mes "かかりにくい敵がいるけれど、";
				mes "非常に有効なスキルだよ。";
				next;
				mes "[Puron]";
				mes "^FF0000回避率増加^000000はThiefの素早さを";
				mes "補って、敵からの攻撃を回避する";
				mes "確率を高めることができるスキルだ。";
				next;
				cutin "thief_steal",2;
				mes "[Puron]";
				mes "また、スティールといった";
				mes "Thiefらしい敵からアイテムを";
				mes "奪い取るスキルもあるね。";
				mes "スキルレベルとDexが高くなると";
				mes "成功率も高まっていくよ。";
				next;
				cutin "thief_steal",255;
				break;
			case 5:
				cutin "archer_2",2;
				mes "[Puron]";
				mes "^0000FFArcher^000000だね。";
				mes "1次職であるArcherは";
				mes "JobLvを50まで上げることができるよ。";
				mes "スキルポイントは49ポイント使用できる";
				mes "ことになるね。";
				next;
				mes "[Puron]";
				mes "^0000FFArcher^000000のスキルでオススメなのは";
				mes "^FF0000ダブルストレイフィング^000000、";
				mes "^FF0000チャージアロー^000000だね。";
				next;
				cutin "archer_doublestraf",2;
				mes "[Puron]";
				mes "^FF0000ダブルストレイフィング^000000は同時に";
				mes "2本 の矢を打ち出し、";
				mes "大きなダメージを与えることが";
				mes "できるスキルだね。";
				mes "多くのArcherの冒険者が";
				mes "Lv10にする主力のスキルになるね。";
				next;
				mes "[Puron]";
				mes "^FF0000チャージアロー^000000は敵を吹き飛ばす";
				mes "攻撃ができるスキルだ。";
				mes "このスキルはクエストで取得する";
				mes "ことができる。";
				next;
				mes "[Puron]";
				mes "チャージアローは";
				mes "仲間に攻撃している敵を";
				mes "大きく吹き飛ばすことができる、";
				mes "^0000FFパーティ^000000を組んだ場合に有効に";
				mes "働く場合が多いスキルになるよ。";
				next;
				cutin "archer_arrowshower",2;
				mes "[Puron]";
				mes "あとは扱いが難しいけれど、";
				mes "アローシャワーという範囲攻撃がある。";
				mes "このスキルは指定した範囲に";
				mes "大量に矢を打ち込み攻撃する";
				mes "必殺技だね。";
				mes "Lv1～Lv5で覚える人が多いスキルだ。";
				next;
				cutin "archer_arrowshower",255;
				break;
			case 6:
				cutin "merchant_2",2;
				mes "[Puron]";
				mes "^0000FFMerchant^000000だね。";
				mes "1次職であるMerchantは";
				mes "JobLvを50まで上げることができるよ。";
				mes "スキルポイントは49ポイント使用できる";
				mes "ことになるね。";
				next;
				mes "[Puron]";
				mes "^0000FFMerchant^000000のスキルで";
				mes "オススメなのは";
				mes "^FF0000プッシュカート^000000、^FF0000露店開設^000000だね。";
				next;
				mes "[Puron]";
				mes "^FF0000プッシュカート^000000は^0000FFMerchant^000000に";
				mes "とって非常に大事なスキル。";
				mes "荷物を大量に持つためのカートを";
				mes "持つことができるようになるのが";
				mes "このスキルなんだ。";
				next;
				mes "[Puron]";
				mes "ただこのスキルのLvが少ないうちは、";
				mes "カートを持っていると移動速度が";
				mes "減少してしまうんだ。";
				mes "プッシュカートスキルを高めることで、";
				mes "カートを持っていても移動速度を";
				mes "普段の状態に戻すことができる。";
				next;
				mes "[Puron]";
				mes "^FF0000露店開設^000000は手に入れたアイテムを";
				mes "自分の好きな値段で売ることが";
				mes "できるスキル。";
				mes "大量のアイテムをお金に買えたり、";
				mes "取り引きできる冒険者を気長に";
				mes "待つときなどに重宝するね。";
				next;
				mes "[Puron]";
				mes "また^0000FFMerchant^000000は^FF0000メマーナイト^000000や";
				mes "^FF0000カートレボ リューション^000000といった";
				mes "強力なスキルを覚えることができる。";
				next;
				cutin "merchant_mammonite",2;
				mes "[Puron]";
				mes "^FF0000メマーナイト^000000はZenyを消費して、";
				mes "大きなダメージを与えることができる。";
				mes "Merchantにとって大事なスキル。";
				mes "Zenyを消費するから、戦闘ごとに";
				mes "お金がなくなっていくけど、敵を";
				mes "一気に倒すときに活躍するスキルだ。";
				next;
				cutin "merchant_cartrevol",2;
				mes "[Puron]";
				mes "^FF0000カートレボ リューション^000000はカートを";
				mes "利用して攻撃する範囲攻撃スキル。";
				mes "カートの重量を高めるほど、";
				mes "攻撃力が増していくMerchantの";
				mes "戦闘を支えるスキルになるよ。";
				next;
				mes "[Puron]";
				mes "^FF0000カートレボ リューション^000000は";
				mes "クエストで取得することができる";
				mes "スキルだ。";
				next;
				cutin "merchant_cartrevol",255;
				break;
			case 7:
				cutin "taekwonkid_2",2;
				mes "[Puron]";
				mes "Taekwon Kidだね。";
				mes "1次職であるTaekwon Kidは";
				mes "JobLvを50まで上げることができるよ。";
				mes "スキルポイントは49ポイント使用できる";
				mes "ことになるね。";
				next;
				mes "[Puron]";
				mes "^0000FFTaekwon Kid^000000のスキルでオススメなのは";
				mes "^FF0000タイリギ^000000と^FF0000ティオアプチャギ^000000だね。";
				next;
				cutin "taekwon_sprint",2;
				mes "[Puron]";
				mes "^FF0000タイリギ^000000は素早くまっすぐ走るスキル。";
				mes "このスキルがLv7以上になると、";
				mes "使用後に直ぐ止まれば、";
				mes "一定時間Strが上昇する";
				mes "スパート状態となる。";
				mes "このスキルはTaekwon Kidの基本 だね。";
				next;
				cutin "taekwon_flyingkick",2;
				mes "[Puron]";
				mes "^FF0000ティオアプチャギ^000000は遠距離の敵に";
				mes "一気に接近して攻撃を行う";
				mes "とび蹴りスキルだ。";
				mes "連続して攻撃を行うことで、";
				mes "大ダメージにすることもできるね。";
				next;
				mes "[Puron]";
				mes "あと、敵を逃すことなく捕らえる";
				mes "アプチャオルリギも忘れては";
				mes "ならないだろうね。";
				mes "単体の敵相手なら非常に";
				mes "優秀な力を発揮できるはずさ。";
				next;
				cutin "taekwon_flyingkick",255;
				break;
			default:
				mes "[Puron]";
				mes "特殊1次職についてだね。";
				mes "スキルについて聞きたい職業は";
				mes "何かな？";
				next;
				switch(select("^0000FFGunslinger^000000","^0000FFNinja^000000","^0000FFSupernovice^000000","他の職業について聞く")){
				case 1:
					cutin "gunslinger",2;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000だね。";
					mes "特殊1次職である^0000FFGunslinger^000000は";
					mes "JobLvを70まで上げることができるよ。";
					mes "スキルポイントは69ポイント使用できる";
					mes "ことになるね。";
					next;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000は5種類の銃のうち";
					mes "どれを主力に戦っていくかで、";
					mes "習得するするスキルを慎重に";
					mes "選択していく必要がある。";
					next;
					mes "[Puron]";
					mes "講習では基本 となる^FF0000ハンドガン^000000と";
					mes "一発の威力が高い^FF0000ショットガン^000000の";
					mes "スキルについて説明しよう。";
					next;
					cutin "gunslinger_despera.bmp",2;
					mes "[Puron]";
					mes "^0000FFハンドガン^000000で必要となるのは";
					mes "^FF0000デスペラード^000000だね。";
					mes "自分の周囲に弾丸を乱射する";
					mes "スキルだ。";
					next;
					mes "[Puron]";
					mes "^0000FFハンドガン^000000を主力と選んだ場合は";
					mes "命中力を上げることができる";
					mes "^FF0000シングルアクション^000000と";
					mes "^FF0000スネークアイ^000000が重要になるよ。";
					next;
					cutin "gunslinger_fullbus",2;
					mes "[Puron]";
					mes "^0000FFショットガン^000000の魅力はやっぱり";
					mes "^FF0000フルバスター^000000になるね。";
					mes "弾丸を一挙に発射して強烈な";
					mes "ダメージを与えることができるんだ。";
					mes "ただ、SPの消耗が激しいので、";
					mes "回復系の対策が必要になるかな。";
					next;
					cutin "gunslinger_fullbus",255;
					break;
				case 2:
					cutin "ninja",2;
					mes "[Puron]";
					mes "^0000FFNinja^000000だね。";
					mes "特殊1次職である^0000FFNinja^000000は";
					mes "JobLvを70まで上げることができるよ。";
					mes "スキルポイントは69ポイント使用できる";
					mes "ことになるね。";
					next;
					mes "[Puron]";
					mes "^0000FFNinja^000000のスキルは大きく、^FF0000投擲系^000000、";
					mes "^FF0000体術系^000000と^FF0000忍術系^000000の3種類が存在し、";
					mes "成長の仕方によってどのスキルを";
					mes "取るかが変わってくる。";
					next;
					cutin "ninja_throwshurike",2;
					mes "[Puron]";
					mes "^0000FF投擲系^000000を選択していく場合は";
					mes "^FF0000手裏剣投げ^000000のスキルが主な";
					mes "攻撃手段となるだろう。";
					next;
					mes "[Puron]";
					mes "^0000FF体術系^000000を選択していく場合は^FF0000空蝉^000000、";
					mes "^FF0000影分身^000000という有用な回避スキルが";
					mes "使用できるようになる。";
					mes "体術系には一閃という強力な攻撃";
					mes "スキルがあるが、弱点も多い。";
					mes "極めるには忍耐が必要だろう。";
					next;
					cutin "ninja_dragonfirefo",2;
					mes "[Puron]";
					mes "^0000FF忍術^000000を選択していく場合は";
					mes "^FF0000氷閃槍、龍炎陣^000000が扱いやすい。";
					mes "^0000FF氷閃槍^000000は地面から氷の槍を";
					mes "出現させて、敵を攻撃する";
					mes "水属性の攻撃スキルだ。";
					next;
					mes "[Puron]";
					mes "^0000FF龍炎陣^000000は目標を指定して攻撃する";
					mes "範囲攻撃だ。";
					mes "先制攻撃を加えるのであれば、";
					mes "非常に使い勝手がよい忍術といえる。";
					next;
					cutin "ninja_dragonfirefo",255;
					break;
				case 3:
					cutin "super_novice",2;
					mes "[Puron]";
					mes "^0000FFSupernovice^000000だね。";
					mes "特殊1次職である^0000FFSupernovice^000000は";
					mes "JobLvを99まで上げることができるよ。";
					mes "スキルポイントは98ポイント使用できる";
					mes "ことになるね。";
					next;
					mes "[Puron]";
					mes "^0000FFSupernovice^000000は他の1次職の";
					mes "スキルを覚えていける職業だよ。";
					mes "^0000FFヒール^000000、^0000FFバッシュ^000000、^0000FFメマーナイト^000000などを";
					mes "使う冒険者は多いみたいだね。";
					next;
					cutin "supernovice_firebo",2;
					mes "[Puron]";
					mes "また、魔法を主体に戦う";
					mes "Supernoviceを目指すなら、";
					mes "^0000FFファイアーウォール^000000や、";
					mes "^0000FFファイアーボ ルト^000000などを";
					mes "使用していくほうがいいね。";
					next;
					cutin "supernovice_heal",2;
					mes "[Puron]";
					mes "^0000FFヒール^000000はSupernoviceでも";
					mes "使える回復魔法だ。";
					mes "魔法以外で戦う場合はバッシュ、";
					mes "メマーナイトのどちらかを";
					mes "選択することになるだろうね。";
					next;
					mes "[Puron]";
					mes "また、Supernoviceは";
					mes "非常に多くのパッシブスキルを";
					mes "習得することができる";
					mes "職業でもあるね。";
					next;
					cutin "supernovice_heal",255;
					break;
				default:
					continue;
				}
			}
			mes "[Puron]";
			mes "他の職業のスキルについて聞くかい？";
			next;
			if(select("他の職業のスキルについて聞く","スキルについてはわかった")==2) break;
		}
		return;
	}

	function	ABOUT_STATUS	{
		while(1){
			mes "[Puron]";
			mes "何のステータスの説明を";
			mes "聞きたいのかな？";
			next;
			switch(select("ステータス内の情報について聞く","^0000FFSwordsman^000000","^0000FFMagician^000000","^0000FFAcolyte^000000","^0000FFThief^000000","^0000FFArcher^000000","^0000FFMerchant^000000","^0000FFTaekwon Kid^000000","^0000FF特殊1次職^000000","ステータスについてはわかった")){
			case 1:
				mes "[Puron]";
				mes "^0000FFステータス^000000についてだね。";
				mes "まずは画面左上の基本 情報から";
				mes "ステータス（Status）ウィンドウを";
				mes "表示してみよう。";
				mes " ";
				mes "‐ショートカットは「Alt+A」‐";
				next;
				mes "[Puron]";
				mes "^0000FFステータス^000000は";
				mes "力（Str）、速さ（Agi）";
				mes "体力（Vit）、知力（Int）";
				mes "技（Dex）、運（Luk）";
				mes "から成り立っているんだ。";
				next;
				mes "[Puron]";
				mes "^FF0000Str^000000は直接的は攻撃力のAtkと";
				mes "アイテムをもてる最大重量に";
				mes "関係しているんだ。";
				mes "ただし、弓や銃を使う職業の";
				mes "場合Dexの値が攻撃力になるよ。";
				next;
				mes "[Puron]";
				mes "^FF0000Agi^000000は攻撃を回避するFleeと";
				mes "攻撃のスピードAspdに";
				mes "関係しているよ。";
				next;
				mes "[Puron]";
				mes "^FF0000Vit^000000は最大HPと";
				mes "一定時間ごとのHPの回復量、";
				mes "受けたダメージの軽減に";
				mes "関係しているよ。";
				next;
				mes "[Puron]";
				mes "^FF0000Int^000000は最大SPとSP回復量、";
				mes "Matk,Mdefに関係しているね。";
				mes "Matkは魔法攻撃力";
				mes "Mdefは魔法防御力になるよ。";
				mes "スキルを多用したり、魔法を駆使する";
				mes "場合は重要になるかな。";
				next;
				mes "[Puron]";
				mes "^FF0000Dex^000000は命中率のHitとAspdに";
				mes "大きく影響を与えるよ。";
				mes "攻撃力にも多少の影響を与えるね。";
				mes "攻撃力に関しては最小ダメージの";
				mes "底上げができるよ。";
				next;
				mes "[Puron]";
				mes "また、^FF0000弓や銃といった武器では";
				mes "Dexによって、攻撃力を高めるんだ。^000000";
				mes "弓と銃はStrでは攻撃力が";
				mes "変化しないから注意してね。";
				next;
				mes "[Puron]";
				mes "^FF0000Luk^000000はクリティカル率のCriticalと";
				mes "回避率のFlee、";
				mes "攻撃力に多少の影響があるね。";
				next;
				mes "[Puron]";
				mes "各ステータスはBaseLvが";
				mes "上がったときにもらえる";
				mes "^0000FFStatusPoint^000000を消費して";
				mes "上げていくことができるんだ。";
				mes "^FF0000自分の職業や成長したい部分を";
				mes "延ばしていくことが重要だよ。";
				next;
				break;
			case 2:
				cutin "swordman_2",2;
				mes "[Puron]";
				mes "それじゃあ、^0000FFSwordsman^000000の";
				mes "代表的なステータスについて";
				mes "教えるけど、ステータスポイントは";
				mes "一度割り振ると、取り戻す事が";
				mes "できないから注意してね。";
				next;
				mes "[Puron]";
				mes "それに、この世界にはまだまだ";
				mes "僕も知らない個性的な人たちが";
				mes "沢山いるんだ。";
				mes "自分の将来をしっかりイメージして";
				mes "ステータスポイントを使おうね。";
				next;
				mes "[Puron]";
				mes "Swordsmanは高い攻撃力を";
				mes "生かすため、^FF0000Str^000000を高めるのが";
				mes "オススメだよ。";
				mes "また、^FF0000HP^000000が高いので^FF0000Vit^000000を高めて";
				mes "耐える事に特化すれば、パーティの";
				mes "前衛、盾として大活躍できるよ。";
				next;
				mes "[Puron]";
				mes "パーティより一人を好むなら、";
				mes "^FF0000Vit^000000より^FF0000Agi^000000を高めるのもいいね。";
				mes "敵の攻撃を避けるのに特化し、";
				mes "高い攻撃速度で敵をすぐに倒せる。";
				next;
				mes "[Puron]";
				mes "また、スキルを多用するには^FF0000Int^000000、";
				mes "攻撃を命中させるためには";
				mes "^FF0000Dex^000000も必要だよ。";
				mes "Swordsmanは色んなステータスに";
				mes "割り振るため、バランスには";
				mes "注意してね。";
				next;
				cutin "swordman_2",255;
				break;
			case 3:
				cutin "magician_2",2;
				mes "[Puron]";
				mes "それじゃあ、^0000FFMagician^000000の";
				mes "代表的なステータスについて";
				mes "教えるけど、ステータスポイントは";
				mes "一度割り振ると、取り戻す事が";
				mes "できないから注意してね。";
				next;
				mes "[Puron]";
				mes "それに、この世界にはまだまだ";
				mes "僕も知らない個性的な人たちが";
				mes "沢山いるんだ。";
				mes "自分の将来をしっかりイメージして";
				mes "ステータスポイントを使おうね。";
				next;
				mes "[Puron]";
				mes "^0000FFMagician^000000は魔法攻撃を主軸として";
				mes "戦うため、^FF0000Int^000000を高めるのがいいね。";
				mes "また、詠唱速度を速めるために";
				mes "^FF0000Dex^000000を高めるのも有利だよ。";
				next;
				mes "[Puron]";
				mes "また、^0000FFMagician^000000は打たれ弱いから、";
				mes "^FF0000Vit^000000に少し振って^FF0000HP^000000を";
				mes "高めるのもいいね、";
				mes "ただし、その分攻撃に直結する";
				mes "^FF0000Int^000000や^FF0000Dex^000000にステータスポイントが";
				mes "振れなくなるのを忘れないでね。";
				next;
				cutin "magician_2",255;
				break;
			case 4:
				cutin "acolyte_2",2;
				mes "[Puron]";
				mes "それじゃあ、^0000FFAcolyte^000000の";
				mes "代表的なステータスについて";
				mes "教えるけど、ステータスポイントは";
				mes "一度割り振ると、取り戻す事が";
				mes "できないから注意してね。";
				next;
				mes "[Puron]";
				mes "それに、この世界にはまだまだ";
				mes "僕も知らない個性的な人たちが";
				mes "沢山いるんだ。";
				mes "自分の将来をしっかりイメージして";
				mes "ステータスポイントを使おうね。";
				next;
				mes "[Puron]";
				mes "^0000FFAcolyte^000000はやはり仲間を支援する";
				mes "スキルを使うことが多いね。";
				mes "そのため、^FF0000SP^000000が無くならないよう、";
				mes "^FF0000Int^000000を高めるのがオススメだよ。";
				next;
				mes "[Puron]";
				mes "また、スキルの詠唱速度を";
				mes "速めるために^FF0000Dex^000000を高めるのもいいよ。";
				mes "前衛の代わりとして率先して前に出て、";
				mes "パーティの盾となるなら";
				mes "^FF0000Vit^000000も有効だね。";
				next;
				cutin "acolyte_2",255;
				break;
			case 5:
				cutin "thief_2",2;
				mes "[Puron]";
				mes "それじゃあ、^0000FFThief^000000の";
				mes "代表的なステータスについて";
				mes "教えるけど、ステータスポイントは";
				mes "一度割り振ると、取り戻す事が";
				mes "できないから注意してね。";
				next;
				mes "[Puron]";
				mes "それに、この世界にはまだまだ";
				mes "僕も知らない個性的な人たちが";
				mes "沢山いるんだ。";
				mes "自分の将来をしっかりイメージして";
				mes "ステータスポイントを使おうね。";
				next;
				mes "[Puron]";
				mes "^0000FFThief^000000といえば、高い回避能力を";
				mes "さらに強くしていくため、";
				mes "^FF0000Agi^000000を高めるのがオススメだよ。";
				next;
				mes "[Puron]";
				mes "^FF0000Agi^000000を高めれば自然と";
				mes "攻撃速度も上がるから、";
				mes "^FF0000Str^000000で攻撃力を高め、";
				mes "^FF0000Dex^000000で攻撃を命中させるように";
				mes "していくとサクサク敵を";
				mes "倒せるようになるよ。";
				next;
				mes "[Puron]";
				mes "あと、将来カタールという武器が";
				mes "装備できるアサシンを目指すなら、";
				mes "^FF0000Luk^000000を高めてクリティカル攻撃を";
				mes "頻繁に出せるようにするのも";
				mes "いいかもしれないね。";
				next;
				cutin "thief_2",255;
				break;
			case 6:
				cutin "archer_2",2;
				mes "[Puron]";
				mes "それじゃあ、^0000FFArcher^000000の";
				mes "代表的なステータスについて";
				mes "教えるけど、ステータスポイントは";
				mes "一度割り振ると、取り戻す事が";
				mes "できないから注意してね。";
				next;
				mes "[Puron]";
				mes "それに、この世界にはまだまだ";
				mes "僕も知らない個性的な人たちが";
				mes "沢山いるんだ。";
				mes "自分の将来をしっかりイメージして";
				mes "ステータスポイントを使おうね。";
				next;
				mes "[Puron]";
				mes "Archerの特徴、弓での攻撃は";
				mes "^FF0000Dex^000000をあげるほど強力になるよ。";
				mes "攻撃力がある程度高まったと";
				mes "感じたら、^FF0000Agi^000000で攻撃速度を";
				mes "高めるのがいいね。";
				next;
				mes "[Puron]";
				mes "また、^FF0000Int^000000を高めることで、";
				mes "強力なスキル";
				mes "「ダブルストレイフィング」を";
				mes "次々と連射するのも有効だよ。";
				next;
				mes "[Puron]";
				mes "そうそう、Archerの上位職である";
				mes "バードやダンサーになって";
				mes "対人戦で活躍する気があるなら、";
				mes "^FF0000Vit^000000を高めておくのもいいね。";
				next;
				cutin "archer_2",255;
				break;
			case 7:
				cutin "merchant_2",2;
				mes "[Puron]";
				mes "それじゃあ、^0000FFMerchant^000000の";
				mes "代表的なステータスについて";
				mes "教えるけど、ステータスポイントは";
				mes "一度割り振ると、取り戻す事が";
				mes "できないから注意してね。";
				next;
				mes "[Puron]";
				mes "それに、この世界にはまだまだ";
				mes "僕も知らない個性的な人たちが";
				mes "沢山いるんだ。";
				mes "自分の将来をしっかりイメージして";
				mes "ステータスポイントを使おうね。";
				next;
				mes "[Puron]";
				mes "Merchantは^FF0000Str^000000で攻撃力を高め、";
				mes "^FF0000Agi^000000で敵の攻撃を避けたり、";
				mes "^FF0000Vit^000000で敵の攻撃を耐えるのが有効だよ。";
				mes "また、攻撃を命中させるためには";
				mes "^FF0000Dex^000000もある程度必要になってくるね。";
				next;
				mes "[Puron]";
				mes "もし、^0000FFMerchant^000000の上位職である";
				mes "^0000FFブラックスミス^000000になって製造を";
				mes "していくなら、^FF0000Dex^000000と^FF0000Luk^000000が重要に";
				mes "なってくるよ。";
				next;
				mes "[Puron]";
				mes "でも、^FF0000Dex^000000と^FF0000Luk^000000にステータスポイントを";
				mes "使いすぎると、攻撃に繋がる";
				mes "ステータスが低くなり、通常の戦闘が";
				mes "その分辛くなってしまうよ。";
				mes "バランスには十分注意してね。";
				next;
				cutin "merchant_2",255;
				break;
			case 8:
				cutin "taekwonkid_2",2;
				mes "[Puron]";
				mes "それじゃあ、^0000FFTaekwon Kid^000000の";
				mes "代表的なステータスについて";
				mes "教えるけど、ステータスポイントは";
				mes "一度割り振ると、取り戻す事が";
				mes "できないから注意してね。";
				next;
				mes "[Puron]";
				mes "それに、この世界にはまだまだ";
				mes "僕も知らない個性的な人たちが";
				mes "沢山いるんだ。";
				mes "自分の将来をしっかりイメージして";
				mes "ステータスポイントを使おうね。";
				next;
				mes "[Puron]";
				mes "^0000FFTaekwon Kid^000000は^FF0000Str^000000で攻撃力を高める、";
				mes "^FF0000Agi^000000で攻撃速度を高めるのが有効だよ。";
				mes "また、攻撃を命中させるには";
				mes "^FF0000Dex^000000もある程度必要になってくるね。";
				next;
				mes "[Puron]";
				mes "ただ、一つ気をつけて。";
				mes "^0000FFTaekwon Kid^000000の上位職である";
				mes "^0000FFソウルリンカー^000000になると、";
				mes "^0000FFTaekwon Kid^000000の時の常識が";
				mes "通用しなくなってしまうんだ。";
				next;
				mes "[Puron]";
				mes "^0000FFソウルリンカー^000000になる場合は";
				mes "使用するスキルも魔法、";
				mes "支援スキルが中心となっていくため、";
				mes "^0000FFTaekwon Kid^000000の頃から^FF0000Int^000000に振って";
				mes "おかないと、^FF0000SP^000000が足りないという事も";
				mes "あるかもしれないから注意してね。";
				next;
				cutin "taekwonkid_2",255;
				break;
			default:
				mes "[Puron]";
				mes "^0000FF特殊1次職^000000についてだね。";
				mes "ステータスについて";
				mes "聞きたい職業は何かな？";
				next;
				switch(select("^0000FFGunslinger^000000","^0000FFNinja^000000","^0000FFSupernovice^000000","他の職業")){
				case 1:
					cutin "gunslinger",2;
					mes "[Puron]";
					mes "それじゃあ、^0000FFGunslinger^000000の";
					mes "代表的なステータスについて";
					mes "教えるけど、ステータスポイントは";
					mes "一度割り振ると、取り戻す事が";
					mes "できないから注意してね。";
					next;
					mes "[Puron]";
					mes "それに、この世界にはまだまだ";
					mes "僕も知らない個性的な人たちが";
					mes "沢山いるんだ。";
					mes "自分の将来をしっかりイメージして";
					mes "ステータスポイントを使おうね。";
					next;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000の特徴、銃での攻撃は";
					mes "^FF0000Dex^000000をあげるほど強力になるよ。";
					mes "攻撃力がある程度高まったと";
					mes "感じたら、^FF0000Agi^000000で攻撃速度を";
					mes "高めるのもいいね。";
					next;
					mes "[Puron]";
					mes "また、^FF0000HP^000000、^FF0000SP^000000共に少ないので、";
					mes "^FF0000Vit^000000や^FF0000Int^000000をある程度高めておく";
					mes "のもいいよ。";
					next;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000は銃の種類が色々あり、";
					mes "どれを主力として使っていくかで、";
					mes "戦闘スタイルも変化してくるんだ。";
					mes "急いでステータスポイントを使わず、";
					mes "まずは色んな銃を使ってみるといいよ。";
					next;
					cutin "gunslinger",255;
					break;
				case 2:
					cutin "ninja",2;
					mes "[Puron]";
					mes "それじゃあ、^0000FFNinja^000000の";
					mes "代表的なステータスについて";
					mes "教えるけど、ステータスポイントは";
					mes "一度割り振ると、取り戻す事が";
					mes "できないから注意してね。";
					next;
					mes "[Puron]";
					mes "それに、この世界にはまだまだ";
					mes "僕も知らない個性的な人たちが";
					mes "沢山いるんだ。";
					mes "自分の将来をしっかりイメージして";
					mes "ステータスポイントを使おうね。";
					next;
					mes "[Puron]";
					mes "^0000FFNinja^000000はどんなスキルの系統を";
					mes "取っていくかを決めることが重要だよ。";
					mes "これを決めたらほぼステータスも";
					mes "どれを振るのがいいか見えてくる。";
					next;
					mes "[Puron]";
					mes "投擲系・体術系スキルなら、";
					mes "攻撃力を重視した";
					mes "^FF0000Str^000000、^FF0000Dex^000000、^FF0000Agi^000000が有効だよ。";
					mes "忍術系スキルなら魔法攻撃力と";
					mes "詠唱速度を重視した^FF0000Int^000000、^FF0000Dex^000000が";
					mes "有効なんだ。";
					next;
					mes "[Puron]";
					mes "ただし、どちらかのスタイルを";
					mes "選んだらステータスポイントを";
					mes "使っている以上、";
					mes "両立して割り振っていくことは";
					mes "難しいから、注意してね。";
					next;
					cutin "ninja",255;
					break;
				case 3:
					cutin "super_novice",2;
					mes "[Puron]";
					mes "それじゃあ、^0000FFSupernovice^000000の";
					mes "代表的なステータスについて";
					mes "教えるけど、ステータスポイントは";
					mes "一度割り振ると、取り戻す事が";
					mes "できないから注意してね。";
					next;
					mes "[Puron]";
					mes "それに、この世界にはまだまだ";
					mes "僕も知らない個性的な人たちが";
					mes "沢山いるんだ。";
					mes "自分の将来をしっかりイメージして";
					mes "ステータスポイントを使おうね。";
					next;
					mes "[Puron]";
					mes "^0000FFSupernovice^000000は";
					mes "どういったスキルを取っていくか。";
					mes "これを決めたらほぼステータスも";
					mes "どれを振るのがいいか見えてくるよ。";
					next;
					mes "[Puron]";
					mes "近接攻撃系なら、攻撃力を";
					mes "重視した^FF0000Str^000000、^FF0000Dex^000000、^FF0000Agi^000000が有効だよ。";
					mes "魔法系スキルなら魔法攻撃力と";
					mes "詠唱速度を重視した^FF0000Int^000000、^FF0000Dex^000000が";
					mes "有効だね。";
					next;
					cutin "super_novice",255;
					break;
				default:
					continue;
				}
			}
			cutin "swordman_2.bmp", 255;
			mes "[Puron]";
			mes "他の職業のステータスについて";
			mes "聞くかい？";
			next;
			if(select("他の職業のステータスについて聞く","ステータスついてはわかった")==2) break;
		}
		return;
	}

	function	ABOUT_WEAPON	{
		while(1){
			mes "[Puron]";
			mes "各職業にはそれぞれ特徴があり、";
			mes "職業によって扱える武器が";
			mes "異なるんだ。";
			cutin "weapon_list.bmp", 3;
			next;
			mes "[Puron]";
			mes "武器の種類は短剣、片手剣、両手剣、";
			mes "斧、槍、鈍器、杖、弓、爪、楽器、";
			mes "鞭、本、カタール、銃、手裏剣など、";
			mes "多くの種類があるよ。";
			next;
			mes "[Puron]";
			mes "武器については";
			mes "わかったかな？";
			next;
			if(select("わかった","わからない")==1) break;
			mes "[Puron]";
			mes "じゃあ、もう一度説明するね。";
			next;
		}
		cutin "swordman_2.bmp", 255;
		return;
	}
}

//Aldi
ac_cl_room.gat,57,46,2	script	Aldi#ac_room	751,{
	function HOWTO_BATTLE;
	function HOWTO_MAKEMONEY;
	function ABOUT_CARD;
	function ABOUT_WORLDMAP;

	if(AC_PASSPORT<2){
		mes "[Aldi]";
		mes "お、キミは新顔だな。";
		mes "冒険者アカデミーへようこそ！";
		mes "まずは受付を済ませてくれ。";
		close;
	}
	set '@novice, callfunc("AC_GetNovice");
	if(AC_NOVICE_QUE >= 20 || Job!=Job_Novice){
		if(Job!=Job_Novice){
			if(AC_NOVICE_QUE) {
				mes "[Aldi]";
				mes "元気そうで何よりだ。";
				mes "聞きたいことがあったら、";
				mes "なんでも聞いてくれていいぞ。";
				mes "何を聞きたいんだ？";
			} else {
				mes "[Aldi]";
				mes "見かけない顔だが、";
				mes "キミはなかなか筋がいい";
				mes "冒険者のようだな。";
				mes "何か聞いてみたいことはあるかい？";
			}
		} else if(AC_NOVICE_QUE == 20){
			mes "[Aldi]";
			mes "講習もいよいよ最後だ。";
			mes "部屋の奥にいる^FF0000Fay^000000に";
			mes "話しかけて見てくれ。";
			mes "ん？";
			mes "まだ、私に聞きたいことが";
			mes "あるのかな？";
		} else if(AC_NOVICE_QUE >= 30){
			mes "[Aldi]";
			mes "全て学んできたようだな。";
			mes "聞きたいことがあったら、";
			mes "もう一度説明するぞ。";
			mes "何か聞きたいことはあるか？";
		}
		while(1){
			next;
			switch(select("戦闘について","お金の稼ぎ方について","カードについて","世界地図について","聞きたいことはない")){
			case 1:
				HOWTO_BATTLE;
				break;
			case 2:
				HOWTO_MAKEMONEY;
				break;
			case 3:
				ABOUT_CARD;
				break;
			case 4:
				ABOUT_WORLDMAP;
				break;
			default:
				mes "[Aldi]";
				mes "そうか。";
				mes "それでは、良い冒険者になることを";
				mes "期待しているぞ。";
				mes "聞きたいことがあったら、";
				mes "いつでも来るといい。";
				close2;
				cutin "world_map_001.bmp", 255;
				end;
			}
			mes "[Aldi]";
			mes "他に聞きたいことはあるかな？";
		}
	}

	if(!AC_NOVICE_QUE){
		mes "[Aldi]";
		mes "お！";
		mes "キミは新顔のようだな。";
		mes "私はAldi。";
		mes "講習を担当している。";
		mes "まずはプロンに話しかけてみてくれ。";
		close;
	} else if(AC_NOVICE_QUE < 10){
		mes "[Aldi]";
		mes "まずはプロンの講習を";
		mes "終わらせないとな。";
		mes "反対側のプロンに話しかけて、";
		mes "プロンの講習を終わらせて";
		mes "きてくれ。		";
		close;
	} else if(AC_NOVICE_QUE>=10 && AC_NOVICE_QUE<20){
		switch(AC_NOVICE_QUE){
		case 10:
			mes "[Aldi]";
			mes "プロンの話が終わったようだな。";
			mes "私はAldiだ。";
			mes "よろしく。";
			mes "　";
			mes "さて、今後の成長について";
			mes "簡単に私が話そう。";
			next;
			while(1){
				mes "[Aldi]";
				mes "冒険者として、一人前に成長するには";
				mes "様々な経験が必要だが、";
				mes "幸い冒険者アカデミーには";
				mes "戦闘や仕事を手伝うクエストなどが";
				mes "揃っている。";
				next;
				mes "[Aldi]";
				mes "講習後、1次職に転職できたら、";
				mes "しばらく冒険者アカデミーで";
				mes "経験を積むといいだろう。";
				next;
				mes "[Aldi]";
				mes "特に戦闘や、お金に困ったときなど、";
				mes "わからないことがあったら、";
				mes "私が教えられるかもしれない。";
				mes "わからなくなったら、";
				mes "また戻ってくるといい。";
				next;
				if(select("わかった","わからなかった")==1){
					mes "[Aldi]";
					mes "ではキミの成長を期待しているぞ。";
					break;
				}
				mes "[Aldi]";
				mes "それじゃあ、もう一度話そう。";
				next;
			}
			next;
			if(checkre()) {
				if (BaseLevel<6) getexp 12,0;
				if (JobLevel<6) getexp 0,24;
			}
			else {
				if (BaseLevel<6) getexp 79,0;
				if (JobLevel<6) getexp 0,117;
			}
			set AC_NOVICE_QUE, 11;
		case 11:
			mes "[Aldi]";
			mes "最後に、この大陸について";
			mes "少し話しておこう。";
			next;
			ABOUT_WORLDMAP;
			if(checkre()) {
				if (BaseLevel<7) getexp 15,0;
				if (JobLevel<7) getexp 0,38;
			}
			else {
				if (BaseLevel<7) getexp 113,0;
				if (JobLevel<7) getexp 0,181;
			}
			set AC_NOVICE_QUE, 12;
		case 12:
			mes "[Aldi]";
			mes "よし、この大陸については";
			mes "わかったようだな。";
			mes "立派な冒険者になることを";
			mes "期待しているぞ！";
			next;
			if(checkre()) {
				if (BaseLevel<8) getexp 18,0;
				if (JobLevel<8) getexp 0,46;
			}
			else {
				if (BaseLevel<8) getexp 154,0;
				if (JobLevel<8) getexp 0,221;
			}
			set AC_NOVICE_QUE, 13;
		case 13:
		case 14:
			mes "[Aldi]";
			if(AC_NOVICE_QUE==13){
				mes "そうだ、これを渡しておこう！";
				next;
			} else {
				mes "[Aldi]";
				mes "荷物は減らしてきたかな？";
				next;
				if(select("減らしてきた","減らしてない")==2){
					mes "[Aldi]";
					mes "荷物を減らしてくれないと";
					mes "渡せないぞ。";
					close;
				}
			}
			set AC_NOVICE_QUE, 14;
			if(checkitemblank() < 2){
				mes "^FF0000＜警告＞^000000";
				mes "‐所持アイテムの種類数が多い為";
				mes "　アイテムを受けとることが";
				mes "　できません‐";
				mes "‐所持アイテムを減らしてから、";
				mes "　再度話しかけてください‐";
				close;
			} else
			if(Weight>(MaxWeight/100)*90){
				mes "^FF0000＜警告＞^000000";
				mes "‐所持アイテムの重量が多い為";
				mes "　アイテムを受けとることが";
				mes "　できません‐";
				mes "‐所持アイテムを減らしてから、";
				mes "　再度話しかけてください‐";
				close;
			}
			getitem 569, 100;
			getitem 611, 5;
			emotion 46,"";
			set AC_NOVICE_QUE, 15;
			mes "[Aldi]";
			mes "冒険者の必需品、鑑定アイテムだ！";
			mes "この^0000FF拡大鏡^000000は^0000FF未鑑定^000000のアイテムを";
			mes "鑑定することができる。";
			mes "未鑑定になっているアイテムを";
			mes "手に入れたら使うといい。";
			mes "それと、回復アイテムも渡しておくぞ。";
			next;
		case 15:
			delquest 100116;
			setquest 100120;
			set AC_NOVICE_QUE, 20;
			cutin "world_map_001.bmp", 255;
			mes "[Aldi]";
			mes "さあ、最後に^FF0000Fay^000000の話を";
			mes "聞いてみてくれ。";
			close;
		}
	}

	function	HOWTO_BATTLE	{
		mes "[Aldi]";
		mes "戦闘の何について";
		mes "聞きたいんだい？";
		next;
		switch(select("戦闘の準備について","モンスターについて","パーティーについて","他のことを聞く")){
		case 1:
			mes "[Aldi]";
			mes "戦闘に欠かせないのは";
			mes "装備と回復アイテムだ。";
			mes "今もっている装備品で";
			mes "装備していないアイテムがあったら、";
			mes "一度装備をしてみることを勧めるぞ。";
			next;
			mes "[Aldi]";
			mes "装備アイテムは^0000FFAlt＋ Q^000000キーか、";
			mes "^0000FF「基本 情報」^000000ウィンドウ内の";
			mes "^0000FF「equip」^000000ボ タンを押して、";
			mes "^0000FF「装備アイテム」^000000ウィンドウを";
			mes "表示して確認できる。";
			next;
			mes "[Aldi]";
			mes "また、所持アイテムは^0000FFAlt＋ E^000000キーか、";
			mes "^0000FF「基本 情報」^000000ウィンドウ内の";
			mes "^0000FF「item」^000000ボ タンを押して、";
			mes "^0000FF「所持アイテム」^000000ウィンドウを";
			mes "表示して確認できる。";
			next;
			mes "[Aldi]";
			mes "アイテムを装備するには";
			mes "^0000FF「所持アイテム」^000000ウィンドウ内の";
			mes "^0000FF「equip」^000000タブをクリックし、";
			mes "装備したいアイテムを";
			mes "ダブルクリックすることで装備できる。";
			next;
			mes "[Aldi]";
			mes "あと、忘れちゃならないのが、";
			mes "^0000FF「etc」^000000タブの装備アイテムだ。";
			next;
			mes "[Aldi]";
			mes "Archerや、Gunslinger等の";
			mes "職業では^0000FF矢^000000や^0000FF銃弾^000000といった";
			mes "遠距離攻撃用のアイテムを一緒に";
			mes "装備しないと攻撃ができない";
			mes "装備アイテムがある。";
			next;
			mes "[Aldi]";
			mes "これらのアイテムを使用する";
			mes "装備アイテムは^0000FF「装備アイテム";
			mes "ウィンドウ」^000000へ遠距離攻撃用の";
			mes "アイテム（矢や銃弾）を";
			mes "ドラッグアンドドロップし、";
			mes "一緒に装備する必要がある。";
			next;
			mes "[Aldi]";
			mes "もちろん、装備できるアイテムで";
			mes "あれば、通常の装備アイテムも";
			mes "装備ウィンドウの上まで";
			mes "ドラッグアンドドロップすれば、";
			mes "装備することができるぞ。";
			next;
			break;
		case 2:
			mes "[Aldi]";
			mes "まずはフィールドに戦いに行く前に";
			mes "^0000FFモンスター^000000について話そう。";
			mes "^0000FFモンスター^000000にはいろいろな^0000FF種族、";
			mes "大きさ、属性^000000があるぞ。";
			next;
			mes "[Aldi]";
			mes "モンスターの^FF0000大きさ^000000は";
			mes "^0000FF小型、中型、大型^000000に分かれている。";
			mes "^FF0000属性^000000は^0000FF無属性、地属性、風属性、";
			mes "水属性、火属性、毒属性、念属性、";
			mes "不死属性、闇属性、聖属性^000000という";
			mes "種類に分かれている。";
			next;
			mes "[Aldi]";
			mes "通常の直接攻撃で";
			mes "何の属性もなければ、";
			mes "無属性での攻撃となるぞ。";
			next;
			mes "[Aldi]";
			mes "^0000FF地、風、水、火^000000の属性同士の";
			mes "関係性を示すとこうなる。";
			mes "地は風に強く、";
			mes "風は水に強く、";
			mes "水は火に強く、";
			mes "火は地に強い。";
			cutin "attribute_main4.bmp", 2;
			next;
			mes "[Aldi]";
			mes "また、基本 的には";
			mes "^0000FF無属性、念属性^000000を除いて、";
			mes "同じ属性では効果が";
			mes "弱まる傾向があるぞ。";
			next;
			mes "[Aldi]";
			mes "また、^0000FF毒、不死、闇、聖^000000では";
			mes "毒は無属性以外の属性よりも弱く、";
			mes "不死と聖、闇と聖は";
			mes "互いに強みと弱みを持っている。";
			cutin "attribute_stdk.bmp", 2;
			next;
			mes "[Aldi]";
			mes "また、^0000FF念属性^000000は^0000FF無属性^000000で攻撃が";
			mes "難しいという特性がある。";
			mes "念に一番効果があるのは念なのだ。";
			mes "「念には念を！」という言葉が";
			mes "あるだろう……。";
			mes "ん？　意味が違うか……？";
			cutin "attribute_nonen.bmp", 2;
			next;
			mes "[Aldi]";
			mes "まぁ、モンスターに合わせて、";
			mes "武器や防具、スキルなどを";
			mes "特性に合わせて変更すれば、";
			mes "効果的な戦闘が行えるはずだ。";
			next;
			break;
		case 3:
			mes "[Aldi]";
			mes "^0000FFパーティー^000000について話そう。";
			mes "一人で戦うよりも大勢で力を";
			mes "合わせて戦うほうが";
			mes "より多くの敵を倒しやすくなる。";
			next;
			mes "[Aldi]";
			mes "冒険者同士で^0000FFパーティー^000000を組んで";
			mes "戦うことは戦闘不能になるリスクを";
			mes "回避することにもなるぞ！";
			next;
			mes "[Aldi]";
			mes "^0000FFパーティー^000000はチャット入力欄に";
			mes "「^FF0000/organize パーティーの名前^000000」と";
			mes "入力すれば作ることができる。";
			mes "パーティー名は自分の好きな名前を";
			mes "つけることができるぞ！";
			cutin "tra_pary_command.bmp", 2;
			next;
			mes "[Aldi]";
			mes "入力後に発言を行うと、";
			mes "^0000FFパーティー設定ウィンドウ^000000が出現する。";
			mes "アイテムの収集方式と";
			mes "アイテム分配方式が選択できる。";
			cutin "tra_pary_item.bmp", 2;
			next;
			mes "[Aldi]";
			mes "アイテムの収集方式に関しては";
			mes "『^0000FFパーティー全体で共有^000000』を";
			mes "選択したほうがいいだろう。";
			mes "この設定を行うことでパーティーに";
			mes "入っている人全員が敵が落とした";
			mes "アイテムをすぐに拾うことができる！";
			next;
			mes "[Aldi]";
			mes "アイテムの分配方式は";
			mes "一定確率で分配を選ぶことで";
			mes "拾った人がアイテムを貰うのではなく、";
			mes "パーティーを組んでいる全員が";
			mes "公平にアイテムを貰うことが";
			mes "できるようになる。";
			next;
			mes "[Aldi]";
			mes "^0000FFパーティー^000000設定では経験値の";
			mes "分配方式も決めることができる。";
			mes "一度アイテムについての設定を";
			mes "終えたら、^FF0000Alt＋ Z^000000で表示される";
			mes "パーティーウィンドウによって";
			mes "パーティーの設定が可能だ。";
			cutin "tra_pary_exp.bmp", 2;
			next;
			mes "[Aldi]";
			mes "パーティー設定は";
			mes "パーティーウィンドウの";
			mes "下の方にあるゴミ箱の";
			mes "ようなマークの左に記載されている！";
			cutin "tra_pary_window.bmp", 2;
			next;
			mes "[Aldi]";
			mes "経験値の分配方式設定での";
			mes "公平に分配には注意が必要だ。";
			mes "^FF0000レベル差が±15の範囲でのみ";
			mes "公平設定ができる。^000000";
			mes "レベル差が離れているときには";
			mes "できないので注意が必要だぞ！";
			cutin "tra_pary_exp.bmp", 2;
			next;
			mes "[Aldi]";
			mes "設定がすんだら、";
			mes "作成したパーティーに";
			mes "加入してもらおう！";
			mes "まず、相手のキャラクターに";
			mes "カーソルをもっていき、";
			mes "右クリックを押す。";
			next;
			mes "[Aldi]";
			mes "すると、選択メニューに";
			mes "『^0000FF○○さんにパーティー加入要請^000000』";
			mes "とでてくる。";
			mes "それを選択して、";
			mes "相手がパーティーの加入に";
			mes "承諾すれば、パーティーが組める！";
			cutin "tra_pary_exp.bmp", 255;
			next;
			mes "[Aldi]";
			mes "パーティーの加入要請を出しても";
			mes "相手の反応がなかった場合は、";
			mes "すでに相手がパーティーに";
			mes "加入していないか、";
			mes "会話ウィンドウで確認しよう。";
			next;
			mes "[Aldi]";
			mes "すでにパーティーに";
			mes "加入している場合は、";
			mes "会話ウィンドウに";
			mes "「他のパーティーに加入しています。」";
			mes "とメッセージが表示されるぞ。";
			next;
			mes "[Aldi]";
			mes "パーティーに加入していたら、";
			mes "^FF0000Alt＋ Z^000000で表示される";
			mes "パーティーウィンドウを";
			mes "確認してもらう必要がある！";
			cutin "tra_pary_window.bmp", 2;
			next;
			mes "[Aldi]";
			mes "すでにパーティーに入っている";
			mes "場合はパーティーウィンドウ内に";
			mes "表示されている名前を右クリックして";
			mes "『^FF0000脱退する^000000』を選んでもらおう！";
			cutin "tra_pary_window.bmp", 255;
			next;
			mes "[Aldi]";
			mes "そうすれば、キミが作った";
			mes "新しいパーティーに";
			mes "加入させることができる！";
			next;
			mes "[Aldi]";
			mes "パーティーは^FF0000最大で12人^000000まで";
			mes "加入できる。";
			mes "多人数でモンスターに";
			mes "立ち向かえば、いろいろな場所へ";
			mes "行くことができるぞ！";
			next;
			break;
		}
		return;
	}

	function	HOWTO_MAKEMONEY	{
		mes "[Aldi]";
		mes "お金の稼ぎ方の何について";
		mes "聞きたいんだい？";
		next;
		switch(select("収集アイテムについて","お金を手に入れる方法について","冒険者へのアイテムの売り方について","他のことを聞く")){
		case 1:
			mes "[Aldi]";
			mes "モンスターが落とすアイテムは";
			mes "消耗品や武器や防具などの装備品、";
			mes "収集品など、様々なものが存在する。";
			next;
			mes "[Aldi]";
			mes "モンスターの収集品の中には";
			mes "駆け出しの冒険者でも集めやすく、";
			mes "高く売れるものがあるぞ。";
			mes "ポリンやドロップスから収集できる";
			mes "『^FF0000空きビン^000000』だ。";
			next;
			mes "[Aldi]";
			mes "ただ、この『^FF0000空きビン^000000』は道具屋に";
			mes "売ってもたいしたお金^0000FF（Zeny）^000000には";
			mes "ならない。";
			mes "^0000FF同じ冒険者に売ることで";
			mes "多くのお金^0000FF（Zeny）^000000を手に入れることが";
			mes "できるぞ。^000000";
			next;
			break;
		case 2:
			mes "[Aldi]";
			mes "お金^0000FF（Zeny）^000000を手に入れる方法は";
			mes "幾つもあるが、";
			mes "多くの冒険者の収入源は";
			mes "手に入れたアイテムを売ることだ。";
			next;
			mes "[Aldi]";
			mes "冒険者アカデミー内では";
			mes "^0000FF教室棟ホール^000000に武器や防具、";
			mes "消耗品といったアイテムを";
			mes "買い取ってくれる道具屋の";
			mes "人達がいるので、そこで手に";
			mes "入れたアイテムを売るといい。";
			next;
			mes "[Aldi]";
			mes "アイテムはモンスターを倒すことや、";
			mes "クエストを行うことでも";
			mes "手に入れることができる。";
			next;
			mes "[Aldi]";
			mes "ただ、カードなどのアイテムは";
			mes "戦闘が有利になる様々な効果が";
			mes "ついていて、非常に貴重な";
			mes "アイテムだから、道具屋等では";
			mes "売らない方がいい。";
			next;
			mes "[Aldi]";
			mes "自分が利用しないカードであれば、";
			mes "^0000FF他の冒険者に売る^000000ことで";
			mes "多くのお金^0000FF（Zeny）^000000を手に入れることが";
			mes "できるはずだ。";
			next;
			break;
		case 3:
			while(1){
				mes "[Aldi]";
				mes "それじゃ、手に入れたアイテムの";
				mes "売り方について話をしよう。";
				mes "冒険者同士で売り買いしたほうが";
				mes "お店よりも得をすることが多いぞ。";
				next;
				mes "[Aldi]";
				mes "収集した^FF0000アイテムを";
				mes "他の冒険者に売る^000000には";
				mes "主に2つの手段がある。";
				mes "^0000FF露店^000000と^0000FFチャットルーム^000000だ。";
				next;
				mes "[Aldi]";
				mes "^0000FF露店^000000を開くにはある程度JobLvが";
				mes "必要だ。また、露店が使用できる";
				mes "職業も限定されている。";
				mes "なので、今の君でもできる";
				mes "チャットルームでの取引の仕方を";
				mes "今から教えよう。";
				next;
				mes "[Aldi]";
				mes "^0000FFチャットルーム^000000は^0000FF露店^000000と違い、";
				mes "看板を出して冒険者を待つ事が";
				mes "できる機能だ。";
				mes "これを利用して他の冒険者と";
				mes "会話で取引時の交渉が行える。";
				next;
				mes "[Aldi]";
				mes "まずは、自分が売ろうとしている";
				mes "アイテムがどれぐらいの値段で";
				mes "取引されているのか";
				mes "情報収集をする必要がある。";
				next;
				mes "[Aldi]";
				mes "なぁに、そう構えなくていい。";
				mes "情報収集といってもやり方は簡単だ。";
				mes "^0000FF露店^000000を開いている冒険者の";
				mes "お店で大体の予想を";
				mes "つければいいんだ。";
				next;
				mes "[Aldi]";
				mes "^0000FF露店中の冒険者^000000はこのように";
				mes "Zのマークの袋の看板を出している。";
				mes "その^FF0000看板をダブルクリック^000000すると、";
				mes "冒険者が売っているアイテムを";
				mes "見ることができるぞ。";
				cutin "tra_stall.bmp", 2;
				next;
				mes "[Aldi]";
				mes "こうして^0000FF露店^000000を見て回れば、";
				mes "自分の売りたいアイテムの";
				mes "相場が大体つかめてくるはずだ。";
				cutin "tra_stall_price.bmp", 2;
				next;
				mes "[Aldi]";
				mes "もしどうしても見つからない、";
				mes "価格がどうしてもわからない場合は、";
				mes "ちょっと勇気が必要だが";
				mes "近くの冒険者に聞いてみるのも";
				mes "いいかもしれないな。";
				next;
				mes "[Aldi]";
				mes "ただ、安易に聞くのはいただけない。";
				mes "まずは自分で調べる努力をしてから。";
				mes "人に聞くのは最後の手段";
				mes "だということを忘れるなよ。";
				next;
				cutin "tra_choom_create.bmp", 2;
				mes "[Aldi]";
				mes "売りたいアイテムの相場が";
				mes "大体わかったら";
				mes "チャットルームの出番だ。";
				mes "^FF0000Alt＋ C^000000を押せばチャットルームを";
				mes "作成することができる。";
				next;
				mes "[Aldi]";
				mes "^FF0000Title欄に売りたい商品名と";
				mes "値段を書いてOKボ タンを押そう。^000000";
				mes "例えば空きビン10個売りたい場合は";
				mes "こうやって書こう。";
				next;
				mes "[Aldi]";
				mes "Title欄の内容を話をしよう。";
				mes "『^0000FF売り^000000』とは売りますという意味だ。";
				mes "次に^0000FF売りたいアイテム名^000000、";
				mes "このとき^0000FF値段を書いておけば親切^000000だ。";
				mes "『^FF0000z^000000』はZeny、つまりお金のこと。";
				next;
				mes "[Aldi]";
				mes "最後に個数を入れれば、";
				mes "わかりやすくなるぞ。";
				mes "多くの冒険者は売りたいアイテムの";
				mes "個数を示す為に『^0000FF＠^000000』をつける。";
				mes "『^0000FF＠^000000』を個数の前につけておけば、";
				mes "わかりやすくなるだろう。";
				next;
				mes "[Aldi]";
				mes "^0000FFLimit^000000はチャットルームに";
				mes "入れる人数だ。";
				mes "自分を含めての数になる為、";
				mes "^FF00002^000000名にしておけば、より良いだろう。";
				next;
				mes "[Aldi]";
				mes "チャットルーム作成の";
				mes "ウィンドウが出ない場合は";
				mes "^0000FF基本 情報ウィンドウ^000000の";
				mes "^000000comm^000000ボ タンでも出すことができるぞ。";
				next;
				cutin "tra_chatroom_enter.bmp", 2;
				mes "[Aldi]";
				mes "しばらく、待ってみて冒険者が";
				mes "入ってきたら、挨拶をしてみよう。";
				mes "まずは取り引き数について";
				mes "確認して交渉をまとめるといいぞ。";
				next;
				mes "[Aldi]";
				mes "チャットルーム内での会話は";
				mes "周りには聞こえないから、";
				mes "沢山話しても迷惑にはならない。";
				mes "交渉がまとまったら、";
				mes "チャットルームを閉じよう。";
				next;
				mes "[Aldi]";
				mes "チャットルームはウィンドウの右上に";
				mes "表示されている『^0000FF×^000000』を";
				mes "左クリックするか、";
				mes "『^0000FF/q^000000』と発言して閉じることができる。";
				next;
				mes "[Aldi]";
				mes "ウィンドウを閉じたら、";
				mes "取り引きを行おう。";
				mes "アイテムとZenyを交換するには";
				mes "トレードウィンドウを使用する。";
				cutin "tra_tradewindow.bmp", 2;
				next;
				mes "[Aldi]";
				mes "トレードウィンドウは相手を";
				mes "右クリックしたときにでてくる";
				mes "メニューから、";
				mes "『^0000FF○○さんに取り引き要請^000000』を";
				mes "選択する。";
				mes "○○は^FF0000相手の名前^000000だ。";
				next;
				mes "[Aldi]";
				mes "相手が取り引きを承諾すれば、";
				mes "トレードウィンドウが表示される。";
				mes "^0000FFTrade ： の右に相手の名前が";
				mes "表示されていることを確認しよう。^000000";
				mes "間違った人に渡すわけには";
				mes "いかないからな。";
				next;
				mes "[Aldi]";
				mes "このウィンドウにアイテムを";
				mes "持ってくれば、トレードウィンドウに";
				mes "入れることができる。";
				mes "アイテムウィンドウは^FF0000Alt＋ E^000000だ。";
				next;
				mes "[Aldi]";
				mes "取り引き内容に間違いがなければ";
				mes "『^0000FFOK^000000』を押す。";
				mes "取り引き相手が『^0000FFOK^000000』を押せば、";
				mes "中央の『^0000FFTrade^000000』が押せるようになる。";
				mes "最後に『^0000FFTrade^000000』を押せば、";
				mes "取り引き完了だ！";
				next;
				cutin "tra_tradewindow.bmp", 255;
				mes "[Aldi]";
				mes "冒険者同士でのアイテムの";
				mes "売り買いはわかったかな。";
				mes "わからなかったら、もう一度話すが";
				mes "どうする？";
				next;
				if(select("わかったので大丈夫","わからなかった")==1) break;
				mes "[Aldi]";
				mes "それじゃあ、もう一度話そう。";
				next;
			}
			break;
		}
		return;
	}

	function	ABOUT_CARD	{
		while(1){
			mes "[Aldi]";
			mes "希少価値の高いアイテム、";
			mes "カードについて";
			mes "話そう！";
			next;
			mes "[Aldi]";
			mes "収集品の中には希少価値が";
			mes "高いものがある。";
			mes "それが、^FF0000モンスターが落とすカード^000000だ。";
			mes "モンスターの種類によるが、";
			mes "カードによってはとてつもなく";
			mes "高い値段がついているものもあるぞ。";
			next;
			mes "[Aldi]";
			mes "^0000FFカード^000000は^0000FFスロット^000000つきの装備品に";
			mes "装着して使用する。";
			mes "^FF0000一度装着するとカードは";
			mes "取り外せなくなるので、";
			mes "注意が必要だ。^000000";
			next;
			mes "[Aldi]";
			mes "^FF0000カード^000000には特殊効果があり、";
			mes "装備品にその効果を";
			mes "つけることができるため、";
			mes "非常に強力だぞ！";
			next;
			mes "[Aldi]";
			mes "^0000FFスロットがついている装備品^000000は";
			mes "装備品を右クリックすると、";
			mes "説明の下に四角い枠が出てくる。";
			mes "この四角い枠一つ一つにカードを";
			mes "つけることができる。";
			cutin "tra_slot_weapon.bmp", 2;
			next;
			mes "[Aldi]";
			mes "また、お店で売っている";
			mes "装備アイテムより、";
			mes "モンスターから収集できる装備品は";
			mes "同じ名前の装備品でもスロット数が";
			mes "多いことがあるぞ！";
			next;
			mes "[Aldi]";
			mes "そういったスロット数が多い装備品は";
			mes "冒険者の間で高値で";
			mes "取り引きされることが多い。";
			mes "お店に売る前に装備品の価値を";
			mes "調べて取り引きしたほうがいいぞ。";
			next;
			mes "[Aldi]";
			mes "カードについては";
			mes "わかったかい？";
			cutin "tra_slot_weapon.bmp", 255;
			next;
			if(select("わかったので大丈夫","わからなかった")==1) break;
			mes "[Aldi]";
			mes "それじゃあ、もう一度話そう。";
			next;
		}
		return;
	}

	function	ABOUT_WORLDMAP	{
		while(1){
			mes "[Aldi]";
			mes "Midoガルド大陸がある世界地図を";
			mes "見てみよう。";
			mes "これがLuneMidoガッツ王国を";
			mes "始め、主要な諸国が隣接している";
			mes "^0000FFMidoガルド大陸^000000だ。";
			cutin "world_map_001.bmp", 3;
			next;
			mes "[Aldi]";
			mes "世界地図に関して便利な機能を";
			mes "教えておこう。";
			mes "^0000FFAlt+.(ドット)^000000を押すと、";
			mes "ワールドマップが表示できる。";
			cutin "jp_quest_help06.bmp", 2;
			next;
			mes "[Aldi]";
			mes "ワールドマップでは";
			mes "^0000FF自分の位置^000000や、";
			cutin "jp_quest_help07.bmp", 2;
			next;
			mes "[Aldi]";
			mes "ワールドマップでは";
			mes "^0000FF自分の位置^000000や、";
			mes "^0000FFパーティーメンバー^000000の位置が";
			mes "確認できる。";
			cutin "jp_quest_help08.bmp", 2;
			next;
			mes "[Aldi]";
			mes "この画面では^0000FFマウスのカーソルを";
			mes "移動する^000000ことで、どんな場所か";
			mes "確認できるんだ。";
			cutin "jp_quest_help09.bmp", 2;
			next;
			mes "[Aldi]";
			mes "エー、コホンッ。";
			mes "この^0000FFワールドマップ^000000には";
			mes "^0000FF冒険者アカデミー^000000は";
			mes "表示はされないぞ。";
			mes "冒険者アカデミーは";
			mes "秘密の場所にあるんだ。";
			cutin "jp_quest_help09.bmp", 255;
			next;
			mes "[Aldi]";
			mes "^0000FF冒険者アカデミー^000000には";
			mes "LuneMidoガッツ王国の";
			mes "^0000FFProntera、Izlude、Alberta、";
			mes "Payon、Morroc^000000から";
			mes "転送してもらうことができるぞ。";
			next;
			mes "[Aldi]";
			mes "さあ、覚えたかな？";
			mes "ワールドマップの表示は";
			mes "^0000FFAlt+.(ドット)^000000だ。";
			mes "わからなかったら、もう一度話すが";
			mes "どうする？";
			cutin "jp_quest_help06.bmp", 2;
			next;
			if(select("わかった","わからなかった")==1) break;
			mes "[Aldi]";
			mes "それじゃあ、もう一度話そう。";
			next;
		}
		cutin "jp_quest_help06.bmp", 255;
		return;
	}
}

//Fay
ac_cl_room.gat,44,65,4	script	Fay#ac_room	828,6,6,{
	if(AC_PASSPORT<2){
		mes "[Fay]";
		mes "ん？";
		mes "入学希望者みたいだな。";
		mes "そこで受付をすれば、";
		mes "入学できるぜ。";
		mes "冒険者アカデミーへようこそ。";
		close;
	}
	function ABOUT_JOB;
	function GIVE_BOOK;
	set '@novice, callfunc("AC_GetNovice");
	
	if(Job!=Job_Novice){
		if(AC_NOVICE_QUE){
			if('@novice) {
				if(AC_NOVICE_QUE>30){
					mes "[Fay]";
					mes "よう！";
					mes "最近^0000FFLuneの仕事^000000は";
					mes "手伝ってるかい？";
					mes "まあ、2次職について";
					mes "聞きたいことがあったら、";
					mes "俺に聞いてくれ。";
				} else {
					mes "[Fay]";
					mes "よう！";
					mes "調子よさそうだな。";
					mes "2次職について";
					mes "また聞きたくなったのかい？";
				}
			} else {
				mes "[Fay]";
				mes "2次職について";
				mes "もう一度聞きたいなら、";
				mes "説明するぜ。";
				mes "2次職について聞くかい？";
			}
		} else {
			mes "[Fay]";
			mes "あまり見ない顔だけど、";
			mes "キミにはただならぬものを";
			mes "感じるな。";
			mes "何か聞くことがあるかい？";
		}
		next;
		if(AC_NOVICE_QUE>30){
			set '@sel, select("2次職について聞く","Luneの仕事について聞く","聞くことはない");
		} else {
			set '@sel, select("2次職について聞く","聞くことはない");
			if('@sel==2) set '@sel,3;
		}
		switch('@sel){
		case 1:
			ABOUT_JOB;
		case 3:
			mes "[Fay]";
			mes "そうか、また知りたくなったら、";
			mes "いつでも聞きにきてくれ。";
			mes "喜んで話すぜ。";
			close;
		case 2:
			mes "[Fay]";
			mes "よし！";
			mes "^FF0000Lune^000000のことだな。";
			mes "Luneは仕事を手伝ってくれる人を";
			mes "探してるぞ。";
			mes "キミのようにしっかりしている";
			mes "冒険者なら、助けになるはずだ。";
			next;
			mes "[Fay]";
			mes "この部屋を出たら、";
			mes "^0000FFピンク色の髪をした女性^000000に";
			mes "話しかけてみるといい。";
			mes "キミの成長の手助けになるはずだ。";
			close;
		}
	}
	if(AC_NOVICE_QUE<10){
		mes "[Fay]";
		mes "入学を済ませたみたいだな。";
		mes "まずはそこにいる^0000FFプロン^000000から、";
		mes "話を聞いてみてくれ。";
		close;
	}
	if(AC_NOVICE_QUE<20){
		mes "[Fay]";
		mes "プロンの講習を終えたみたいだな。";
		mes "次は^0000FFAldi^000000が役立つ情報を";
		mes "教えてくれるぞ。";
		close;
	}
	if(AC_NOVICE_QUE<30){
		mes "[Fay]";
		mes "Aldiの講習が終わったようだな！";
		mes "もうすこしで、転職の準備が";
		mes "整うところまできたな。";
		mes "あとは覚悟さえあれば、";
		mes "転職することが出来るだろうな。";
		next;
		mes "[Fay]";
		mes "何の職業に転職するか、";
		mes "決めたかい？";
		next;
		switch(select("転職する職業は決めた","上位職について聞いておく")){
		case 1:
			mes "[Fay]";
			mes "すでに転職する職業を";
			mes "決めていたようだな。";
			break;
		case 2:
			ABOUT_JOB;
			mes "[Fay]";
			mes "よし、これで講習も最後だ。";
		}
		if(AC_NOVICE_QUE<21){
			if (JobLevel<10 || BaseLevel<10) {
				mes "お祝いをしよう！";
				if(checkre()) {
					if (BaseLevel<9) getexp 21,0;
					if (JobLevel<9) getexp 0,56;
					//if (BaseLevel<10) getexp 253,0;
					if (JobLevel<10) getexp 0,60;
				}
				else {
					if (BaseLevel<9) getexp 201,0;
					if (JobLevel<9) getexp 0,273;
					if (BaseLevel<10) getexp 253,0;
					if (JobLevel<10) getexp 0,680;
				}
			}
			set AC_NOVICE_QUE, 21;
		}
		next;
		if(AC_NOVICE_QUE==21){
			mes "[Fay]";
			mes "最後にこれを渡しておくぜ！";
			next;
		} else {
			mes "[Fay]";
			mes "荷物は減らしたかい？";
			next;
			if(select("減らしてきた","減らしてない")==2){
				mes "[Fay]";
				mes "荷物を減らさないと";
				mes "渡せないぜ。";
				close;
			}
		}
		set AC_NOVICE_QUE, 22;
		if(checkitemblank() < 2){
			mes "^FF0000＜警告＞^000000";
			mes "‐所持アイテムの種類数が多い為";
			mes "　アイテムを受けとることが";
			mes "　できません‐";
			mes "‐所持アイテムを減らしてから、";
			mes "　再度話しかけてください‐";
			close;
		} else
		if(Weight>(MaxWeight/100)*90){
			mes "^FF0000＜警告＞^000000";
			mes "‐所持アイテムの重量が多い為";
			mes "　アイテムを受けとることが";
			mes "　できません‐";
			mes "‐所持アイテムを減らしてから、";
			mes "　再度話しかけてください‐";
			close;
		}
		set AC_NOVICE_QUE, 23;
		getitem 569, 150;
		getitem 602, 3;
		emotion 46,"";
		mes "[Fay]";
		mes "冒険者の必需品、ワープアイテムだ！";
		mes "この^0000FF蝶の羽^000000は^0000FF位置をセーブ^000000した所へ";
		mes "瞬時にワープすることができる。";
		mes "これがあれば、危険な場所に";
		mes "迷い込んでも安心だ。";
		mes "回復アイテムも渡しておくぜ。";
		next;
		mes "[Fay]";
		mes "今は冒険者アカデミーに";
		mes "^0000FF位置をセーブ^000000しているから、";
		mes "迷っちまったら、^FF0000蝶の羽^000000を";
		mes "使って戻ってくるといいぜ。";
		next;
		chgquest 100120,201045;
	} else {
		if(Job==Job_Novice){
			if(CHANGE_TK || CHANGE_SNV){
				emotion 21;
				mes "[Fay]";
				mes "おっ！";
				mes "転職がんばってる";
				mes "みたいだな。";
				mes "BaseLvを上げるなら、";
				mes "もう一度話すぜ、";
				mes "聞くかい？";
				next;
				set '@sel, select("BaseLvを上げたい","1次転職したい","2次職について聞く","基礎ブックがほしい","聞くことはない");
			} else
			if(CHANGE_GS || CHANGE_NJ){
				emotion 21;
				mes "[Fay]";
				mes "おっ！";
				mes "転職がんばってる";
				mes "みたいだな。";
				mes "他の街に行くなら、";
				mes "もう一度話すぜ、";
				mes "聞くかい？";
				next;
				set '@sel, select("転送サービスについて聞く","1次転職したい","2次職について聞く","基礎ブックがほしい","聞くことはない");
			} else {
				mes "[Fay]";
				mes "1次転職したいなら、";
				mes "もう一度説明するぜ、";
				mes "聞くかい？";
				next;
				set '@sel, select("1次転職したい","2次職について聞く","基礎ブックがほしい","聞くことはない")+1;
			}
		} else {
			mes "[Fay]";
			mes "2次職について";
			mes "もう一度聞きたいなら、";
			mes "説明するぜ。";
			mes "2次職について聞くかい？";
			next;
			set '@sel, select("2次職について聞く","基礎ブックがほしい","聞くことはない")+2;
		}
		switch('@sel){
		case 1:
			if(CHANGE_TK || CHANGE_SNV){
				mes "[Fay]";
				mes "よし！";
				mes "BaseLvを上げたいんだな。";
				mes "成長したいなら、実戦を";
				mes "積むことが大切だ。";
				next;
				mes "[Fay]";
				mes "冒険者アカデミー内の";
				mes "実習室か特別室へ";
				mes "行って見るといいぞ。";
				next;
				mes "[Fay]";
				mes "実習室はこの講習室を";
				mes "出てから、左上の方へ";
				mes "行くとあるからな。";
				close;
			} else {
				mes "[Fay]";
				mes "よし！";
				mes "転送サービスのことだな。";
				mes "それはタールがやってるぞ。";
				next;
				mes "[Fay]";
				mes "他の街へ行くなら、";
				mes "^0000FF「転送サービス」^000000をしている";
				mes "赤い髪の^0000FFタール^000000を探して";
				mes "みるといい。";
				next;
				mes "[Fay]";
				mes "タールはこの講習室を";
				mes "出てから、左上の方へ行くと";
				mes "いるはずだ。";
				close;
			}
		case 2:
			break;
		case 4:
			if(!checkweight(11055,1)){
				mes "[Fay]";
				mes "あれ？";
				mes "荷物が多いみたいだな。";
				mes "もう少し、荷物の種類数を";
				mes "減らしてきてくれ。";
				//setquest 100097; //本鯖でも未実装メッセージ
				next;
				mes "[Fay]";
				mes "この部屋をでたところの、";
				mes "Kafra Serviceで倉庫が";
				mes "利用できる。";
				mes "そこで荷物を預けるといい。";
				close;
			}
			GIVE_BOOK;
			close;
		case 3:
			ABOUT_JOB;
		case 5:
			mes "[Fay]";
			mes "そうか、また知りたくなったら、";
			mes "いつでも聞きにきてくれ。";
			mes "喜んで話すぜ。";
			close;
		}
	}
	mes "[Fay]";
	mes "まず、転職前に準備が必要だ。";
	mes "^0000FF「基本スキル」をレベル9　^000000に";
	mes "成長させていれば1次職の";
	mes "転職ができる。";
	mes "俺が言う通りにやってみてくれ。";
	next;
	mes "[Fay]";
	mes "^0000FF「基本スキル」^000000のレベルは";
	mes "^0000FF「基本情報」^000000ウィンドウ内の";
	mes "^0000FF「Skill」^000000ボタンから、";
	mes "^0000FF「スキルリスト」^000000を表示して、";
	mes "^0000FF「スキルポイント」^000000を割り";
	mes "振ることで、上げることができる。";
	next;
	mes "[Fay]";
	mes "忘れちゃならないのは、";
	mes "スキルのレベルを上げるには、";
	mes "スキルポイントを割り振った後、";
	mes "^0000FFスキルリストウィンドウの右下にある^000000";
	mes "^FF0000「確定」^000000ボタンを押して、";
	mes "確定させる必要があるってことだ。";
	next;
	mes "[Fay]";
	mes "いいかい。";
	mes "1次職に転職するには";
	mes "^0000FF「基本スキル」をレベル9　^000000に";
	mes "するんだ。";
	next;
	mes "[Fay]";
	mes "職業が決まってるなら、";
	mes "転職場所を教えとくぜ。";
	mes "どうする？";
	next;
	set '@sel,select("転職場所を聞く","転職の準備をする","まだ、決まってない");
	if(AC_NOVICE_QUE<30){
		mes "[Fay]";
		mes "あ、そうそう。";
		mes "これを渡しておかなくっちゃな。";
		next;
		GIVE_BOOK;
		set AC_NOVICE_QUE, 30;
		mes "[Fay]";
		mes "本の話はこのくらいだな。";
		next;
	}
	switch('@sel){
	case 2:
		mes "[Fay]";
		mes "^0000FF「基本スキル」をレベル9　^000000に";
		mes "成長させれば、";
		mes "Swordsman、Magician、";
		mes "Acolyte、Thief、";
		mes "Archer、Merchantは";
		mes "転職がすぐに出来るからな。";
		next;
		mes "[Fay]";
		mes "1次職への転職がしたくなったら、";
		mes "俺が送ってあげるから";
		mes "また来てくれ。";
		close2;
		cutin "start_020_jp.bmp", 4;
		setquest 100124; //state=1
		end;
	case 3:
		mes "まだ転職する職業が決まって";
		mes "ないなら、冒険者アカデミーで";
		mes "手伝いをやってみないか？";
		mes "Luneが仕事をしてくれる人を";
		mes "探してるみたいなんだ。";
		next;
		mes "[Fay]";
		mes "Luneなら、この部屋を出た";
		mes "^0000FF教室棟1F^000000にいるから、";
		mes "話しかけてみるといい。";
		next;
		mes "[Fay]";
		mes "1次職への転職がしたくなったら、";
		mes "俺が送ってあげるから、";
		mes "また来てくれ。";
		close2;
		setquest 100124;
		setquest 100128;
		end;
	}
	mes "[Fay]";
	mes "どの職業になるんだい？";
	next;
	set '@sel,select("Swordsman^FF0000（初心者向き）^000000","Magician^0000FF（中級者向き）^000000","Acolyte^0000FF（中級者向き）^000000","Thief^FF0000（初心者向き）^000000","Archer^FF0000（初心者向き）^000000","Merchant^000000（上級者向き）^000000","Taekwon Kid^0000FF（中級者向き）^000000","Gunslinger^000000（上級者向き）^000000","Ninja^000000（上級者向き）^000000","Supernovice^000000（上級者向き）^000000");
	switch('@sel){
	case 1:
		mes "[Fay]";
		mes "^0000FFSwordsman^000000の場合はIzludeだな。";
		mes "^FF0000Izludeの西^000000に";
		mes "^FF0000剣士ギルド^000000がある。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000剣士ギルド^000000まで送ってやるぜ。";
		mes "転職してくるかい？";
		break;
	case 2:
		mes "[Fay]";
		mes "^0000FFMagician^000000の場合はGeffenだな。";
		mes "^FF0000Geffenの北西^000000に";
		mes "^FF0000魔法学校^000000がある。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000魔法学校^000000まで送ってやるぜ。";
		mes "転職してくるかい？";
		break;
	case 3:
		mes "[Fay]";
		mes "^0000FFAcolyte^000000の場合はPronteraだな。";
		mes "^FF0000Pronteraの北東^000000に";
		mes "^FF0000大聖堂^000000がある。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000大聖堂^000000まで送ってやるぜ。";
		mes "転職してくるかい？";
		break;
	case 4:
		mes "[Fay]";
		mes "^0000FFThief^000000の場合はMorrocだな。";
		mes "^FF0000Morrocに行ってから、";
		mes "北西のピラMido^000000に行くといい。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000北西のピラMido^000000まで";
		mes "送ってやるぜ。";
		mes "転職してくるかい？";
		break;
	case 5:
		mes "[Fay]";
		mes "^0000FFArcher^000000の場合はPayonだな。";
		mes "^FF0000Payonの北東^000000に";
		mes "^FF0000Archerギルド^000000がある。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000Archerギルド^000000まで";
		mes "送ってやるぜ。";
		mes "転職してくるかい？";
		break;
	case 6:
		mes "[Fay]";
		mes "^0000FFMerchant^000000の場合はAlbertaだな。";
		mes "^FF0000Albertaの南西^000000に";
		mes "^FF0000商人組合^000000がある。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000商人組合^000000まで";
		mes "送ってやるぜ。";
		mes "転職してくるかい？";
		break;
	case 7:
		mes "[Fay]";
		mes "^0000FFTaekwon Kid^000000の場合はPayonだな。";
		mes "^FF0000Payonの中央から";
		mes "少し南西あたりに、";
		mes "鳳凰っていう修行者^000000が";
		mes "いるはずだ。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000Payonの南西あたり^000000へ";
		mes "送ってやるぜ。";
		next;
		mes "[Fay]";
		mes "まあ、そうはいっても、";
		mes "Taekwon Kidになるためには";
		mes "^FF0000試練がある^000000ようだけどな。";
		mes "キミが本当になりたいと言うなら、";
		mes "止めはしない。";
		mes "転職してくるかい？";
		break;
	case 8:
		mes "[Fay]";
		mes "^0000FFGunslinger^000000の場合は";
		mes "^FF0000Einbroch^000000だな。";
		mes "^FF0000都市の中央にある研究所^000000に";
		mes "行くといい。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000都市の中央にある研究所^000000へ";
		mes "送ってやるぜ。";
		next;
		mes "[Fay]";
		mes "まあ、そうはいっても、";
		mes "Gunslingerになるためには";
		mes "^FF0000試練がある^000000ようだけどな。";
		mes "キミが本当になりたいと言うなら、";
		mes "止めはしない。";
		mes "転職してくるかい？";
		break;
	case 9:
		mes "[Fay]";
		mes "^0000FFNinja^000000の場合はAmatsuだな。";
		mes "行きかたは^FF0000Albertaに行ってから、";
		mes "船で行く^000000ことになるな。";
		mes "船代が高いから、駆け出しの";
		mes "冒険者のキミには";
		mes "大変かもしれないぜ。";
		next;
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000Amatsuの屋敷^000000へ";
		mes "送ってやるぜ。";
		next;
		mes "[Fay]";
		mes "まあ、そうはいっても、";
		mes "Ninjaになるためには";
		mes "^FF0000試練がある^000000ようだけどな。";
		mes "キミが本当になりたいと言うなら、";
		mes "止めはしない。";
		mes "転職してくるかい？";
		break;
	case 10:
		mes "[Fay]";
		mes "^0000FFSupernovice^000000の場合は";
		mes "^FF0000BaseLvを45^000000にする必要があるぞ。";
		mes "場所はAldebaranだな。";
		mes "^FF0000Aldebaranの南の家屋^000000に";
		mes "トゼーレっていう変わりものが";
		mes "いるはずだ。";
		next;
		if(BaseLevel<45) {
			mes "[Fay]";
			mes "Luneなら、この部屋を出た";
			mes "^0000FF教室棟1F^000000にいるから、";
			mes "話しかけてみるといい。";
			next;
			mes "[Fay]";
			mes "1次職への転職がしたくなったら、";
			mes "俺が送ってあげるから、";
			mes "また来てくれ。";
			close;
		}
		mes "[Fay]";
		mes "そうだな、すぐに転職するなら、";
		mes "俺が^FF0000Aldebaranの南の家屋^000000へ";
		mes "送ってやるぜ。";
		next;
		mes "[Fay]";
		mes "まあ、そうはいっても、";
		mes "Supernoviceになるためには";
		mes "^FF0000試練がある^000000ようだけどな。";
		mes "キミが本当になりたいと言うなら、";
		mes "止めはしない。";
		mes "転職してくるかい？";
		break;
	}
	next;
	cutin "jp_quest_help10.bmp", 255;
	if(select("転職しに行く","まだ、転職しない")==2){
		mes "[Fay]";
		mes "Luneなら、この部屋を出た";
		mes "^0000FF教室棟1F^000000にいるから、";
		mes "話しかけてみるといい。";
		next;
		mes "[Fay]";
		mes "1次職への転職がしたくなったら、";
		mes "俺が送ってあげるから、";
		mes "また来てくれ。";
		close;
	}
	switch('@sel){
	case 7:
	case 8:
	case 9:
	case 10:
		mes "[Fay]";
		mes "あとは、そうだな……";
		mes "転職するために、どこかへ";
		mes "行くことがあったら、";
		mes "一度冒険者アカデミーに戻って";
		mes "くるといい。";
		next;
		mes "[Fay]";
		mes "^FF0000冒険者アカデミーには";
		mes "転送のサービスをしてくれる人が";
		mes "いるからな。^000000";
		next;
		break;
	}
	mes "[Fay]";
	mes "それじゃ、転送するぜ。";
	close2;
	set AC_JOBCHANGE,1;
	switch('@sel){
	case 1: warp "izlude_in.gat",74,167; break;
	case 2: warp "geffen_in.gat",164,122; break;
	case 3: warp "prt_church.gat",183,37; break;
	case 4: warp "moc_prydb1.gat",45,124; break;
	case 5: warp "payon_in02.gat",63,67; break;
	case 6: warp "alberta_in.gat",57,43; break;
	case 7: warp "payon.gat",157,145; break;
	case 8: warp "que_ng.gat",150,167; break;
	case 9: warp "que_ng.gat",30,62; break;
	case 10:warp "aldebaran.gat",112,64; break;
	}
	end;

	function	ABOUT_JOB	{
		while(1){
			mes "[Fay]";
			mes "どの職業の系統について";
			mes "聞きたい？";
			next;
			switch(select("Swordsman系","Magician系","Acolyte系","Thief系","Archer系","Merchant系","Taekwon Kid系","特殊1次職","聞くことをやめる")){
			case 1:
				mes "[Fay]";
				mes "Swordsman系についてだな。";
				mes "プロンがちょっと話してる";
				mes "だろうけど、Swordsmanは";
				mes "ナイトとクルセイダーに";
				mes "転職できるようになる。";
				mes "どっちについて聞きたいんだい？";
				cutin "swordman_1.bmp", 2;
				next;
				switch(select("ナイト","クルセイダー","その他の職業について聞く")){
				case 1:
					mes "[Fay]";
					mes "ナイトは高い物理攻撃と防御力を";
					mes "兼ね備えた王国騎士だ。";
					mes "ペコペコに騎乗することができるため、";
					mes "高い機動力を持つことが可能になる。";
					cutin "swordman_3.bmp", 2;
					next;
					mes "[Fay]";
					mes "ナイトの戦い方は主に";
					mes "剣を使用するか槍を使用するかで";
					mes "異なってくる。";
					mes "槍ならブランディッシュスピア";
					mes "両手剣ならボ ウリングバッシュ";
					mes "といった強力な範囲攻撃を習得できる。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ナイトはロードナイト（左）へ";
					mes "クルセイダーはパラディン（右）";
					mes "という職業になれるぞ！";
					cutin "swordman_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Fay]";
					mes "クルセイダーはナイトよりも防御力に";
					mes "特化した職業だ。";
					mes "ナイトと同様にペコペコに";
					mes "騎乗でき、高い機動性を持てる。";
					cutin "swordman_4.bmp", 2;
					next;
					mes "[Fay]";
					mes "クルセイダーは高い防御力を";
					mes "活かした戦いが可能だ。";
					mes "槍や盾のスキルを使いこなし、";
					mes "範囲攻撃のグランドクロスや";
					mes "仲間を守るディボ ーションといった";
					mes "スキルを習得することができる。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ナイトはロードナイト（左）へ";
					mes "クルセイダーはパラディン（右）";
					mes "という職業になれるぞ！";
					cutin "swordman_5.bmp", 2;
					next;
					break;
				}
				cutin "swordman_5.bmp", 255;
				break;
			case 2:
				mes "[Fay]";
				mes "Magician系についてだな。";
				mes "プロンがちょっと話してる";
				mes "だろうけど、Magicianは";
				mes "ウィザードとセージに";
				mes "転職できるようになる。";
				mes "どっちについて聞きたいんだい？";
				cutin "magician_1.bmp", 2;
				next;
				switch(select("ウィザード","セージ","その他の職業について聞く")){
				case 1:
					mes "[Fay]";
					mes "ウィザードは最大級の火力を用いた";
					mes "広範囲の大魔法が魅力の職業だ。";
					mes "接近戦は苦手だが、";
					mes "パーティー戦などで";
					mes "活躍しやすい職業だ。";
					cutin "magician_3.bmp", 2;
					next;
					mes "[Fay]";
					mes "ウィザードの戦い方は";
					mes "高い魔法攻撃力を";
					mes "活かしたものとなる。";
					mes "メテオストーム";
					mes "ストームガストといった強力な";
					mes "範囲魔法を駆使して戦うことが可能だ。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ウィザードはハイウィザード（左）へ";
					mes "セージはプロフェッサー（右）";
					mes "という職業になれるぞ！";
					cutin "magician_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Fay]";
					mes "セージは魔法に対する知識を";
					mes "深めることで、魔法に対抗する";
					mes "能力を身につけた、物理攻撃を";
					mes "行う職業だ。";
					mes "近接能力が高く、直接攻撃と";
					mes "魔法攻撃の両方を駆使して戦える。";
					cutin "magician_4.bmp", 2;
					next;
					mes "[Fay]";
					mes "敵を攻撃中に自動でスキルを";
					mes "使用することができる";
					mes "オートスペルや";
					mes "魔法詠唱中の移動が可能な";
					mes "フリーキャストといったスキルが";
					mes "習得できる。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ウィザードはハイウィザード（左）へ";
					mes "セージはプロフェッサー（右）";
					mes "という職業になれるぞ！";
					cutin "magician_5.bmp", 2;
					next;
					break;
				}
				cutin "magician_5.bmp", 255;
				break;
			case 3:
				mes "[Fay]";
				mes "Acolyte系についてだな。";
				mes "プロンがちょっと話してる";
				mes "だろうけど、Acolyteは";
				mes "プリーストとモンクに";
				mes "転職できるようになる。";
				mes "どっちについて聞きたいんだい？";
				cutin "acolyte_1.bmp", 2;
				next;
				switch(select("プリースト","モンク","その他の職業について聞く")){
				case 1:
					mes "[Fay]";
					mes "プリーストは多彩な回復や";
					mes "補助魔法を覚えることが";
					mes "できる職業だ。";
					mes "パーティーの要といってよい";
					mes "存在となり、多くの仲間を";
					mes "助けて戦うことができる。";
					cutin "acolyte_3.bmp", 2;
					next;
					mes "[Fay]";
					mes "プリーストの戦い方は支援スキルを";
					mes "生かした戦いとなる。";
					mes "物理攻撃を防ぐキリエエレイソンや";
					mes "SPの回復力を上げるマグニフィカート、";
					mes "サンクチュアリの継続的な";
					mes "回復魔法も習得できるようになる。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "プリーストはハイプリースト（左）へ";
					mes "モンクはチャンピオン（右）";
					mes "という職業になれるぞ！";
					cutin "acolyte_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Fay]";
					mes "モンクは肉体を鍛えて、";
					mes "ひたすら実戦を重視した";
					mes "修行僧の職業だ。";
					mes "直接攻撃を得意とし、気功によって";
					mes "具現化した気を攻撃に";
					mes "使用することができる。";
					cutin "acolyte_4.bmp", 2;
					next;
					mes "[Fay]";
					mes "モンクの戦い方は接近戦を";
					mes "主とした戦いとなる。";
					mes "高い防御力の相手に有効な発勁、";
					mes "完全に防御に徹する金剛、";
					mes "一撃必殺の阿修羅覇凰拳などが";
					mes "習得できる。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "プリーストはハイプリースト（左）へ";
					mes "モンクはチャンピオン（右）";
					mes "という職業になれるぞ！";
					cutin "acolyte_5.bmp", 2;
					next;
					break;
				}
				cutin "acolyte_5.bmp", 255;
				break;
			case 4:
				mes "[Fay]";
				mes "Thief系についてだな。";
				mes "プロンがちょっと話してる";
				mes "だろうけど、Thiefは";
				mes "アサシンとローグに";
				mes "転職できるようになる。";
				mes "どっちについて聞きたいんだい？";
				cutin "thief_1.bmp", 2;
				next;
				switch(select("アサシン","ローグ","その他の職業について聞く")){
				case 1:
					mes "[Fay]";
					mes "アサシンは全職中で最速の";
					mes "素早さで敵を翻弄しながら、";
					mes "戦える職業だ。";
					mes "二刀流か専用武器のカタールを";
					mes "使用しての攻撃ができる。";
					cutin "thief_3.bmp", 2;
					next;
					mes "[Fay]";
					mes "アサシンの戦い方は高い回避率を";
					mes "生かした攻撃となる。";
					mes "毒攻撃を行えるエンチャントポイズン、";
					mes "高確率で毒状態にするベナムナイフ";
					mes "といったスキルが習得できる。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "アサシンはアサシンクロス（左）へ";
					mes "ローグはチェイサー（右）";
					mes "という職業になれるぞ！";
					cutin "thief_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Fay]";
					mes "ローグは短剣を使用した戦闘ができ、";
					mes "アイテムなどを敵から奪うことが";
					mes "容易な職業だ。";
					mes "地面に落書きを残せるなど、";
					mes "遊び心がある職業になるな。";
					cutin "thief_4.bmp", 2;
					next;
					mes "[Fay]";
					mes "攻撃中に敵のアイテムを奪う";
					mes "スティールを発動できる";
					mes "スナッチャーや、";
					mes "背後を取ることで使用可能となる";
					mes "バックスタブの攻撃スキルは強力だ。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "アサシンはアサシンクロス（左）へ";
					mes "ローグはチェイサー（右）";
					mes "という職業になれるぞ！";
					cutin "thief_5.bmp", 2;
					next;
					break;
				}
				cutin "thief_5.bmp", 255;
				break;
			case 5:
				mes "Archer系についてだな。";
				mes "プロンがちょっと話してる";
				mes "だろうけど、Archerはハンターと";
				mes "バード（男）もしくはダンサー（女）";
				mes "に転職できるようになる。";
				mes "どっちについて聞きたいんだい？";
				cutin "archer_1.bmp", 2;
				next;
				switch(select("ハンター","バードとダンサー","その他の職業について聞く")){
				case 1:
					mes "[Fay]";
					mes "ハンターは遠距離攻撃と多彩な";
					mes "罠で敵を倒すことができる職業だ。";
					mes "ファルコンが繰り出すスキルと";
					mes "多くの種類の罠を効果的に";
					mes "使用してテクニカルに戦うことが";
					mes "できるだろう。";
					cutin "archer_3.bmp", 2;
					next;
					mes "[Fay]";
					mes "ハンターの戦い方はファルコンと";
					mes "トラップの取得方法にある。";
					mes "敵の動きを封じるアンクルスネアや";
					mes "ファルコンを利用した範囲攻撃の";
					mes "ブリッツビートは連続してダメージを";
					mes "加えることもできるスキルだ。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ハンターはスナイパー（左）へ";
					mes "バードとダンサーは";
					mes "クラウンとジプシー（右）";
					mes "という職業になれるぞ！";
					cutin "archer_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Fay]";
					mes "バード（男）は歌と演奏によって、";
					mes "ダンサー（女）は華麗な舞いで";
					mes "様々な支援を行うことを";
					mes "得意とする職業だ。";
					cutin "archer_4.bmp", 2;
					next;
					mes "[Fay]";
					mes "バードとダンサーはスキルの";
					mes "効果範囲内のプレイヤーに";
					mes "支援を行えるのが特徴だ。";
					mes "バードが使用するブラギの詩は";
					mes "スキルの発動時間と硬直時間を";
					mes "短くする強力なスキル。";
					next;
					mes "[Fay]";
					mes "ダンサーのサービスフォーユーは";
					mes "効果範囲内のプレイヤーの";
					mes "最大SPを増加させ、";
					mes "スキル使用時のSP消費量を";
					mes "減少させることができるスキルだ。";
					next;
					mes "[Fay]";
					mes "また、バードとダンサーが";
					mes "2人揃うことで合奏スキルという";
					mes "強力な支援スキルを";
					mes "使用することもできる。";
					next;
					cutin "archer_5.bmp", 2;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ハンターはスナイパー（左）へ";
					mes "バードとダンサーは";
					mes "クラウンとジプシー（右）";
					mes "という職業になれるぞ！";
					next;
					break;
				}
				cutin "archer_5.bmp", 255;
				break;
			case 6:
				mes "[Fay]";
				mes "Merchant系についてだな。";
				mes "プロンがちょっと話してる";
				mes "だろうけど、Merchantは";
				mes "ブラックスミスとアルケミストに";
				mes "転職できるようになる。";
				mes "どっちについて聞きたいんだい？";
				cutin "merchant_1.bmp", 2;
				next;
				switch(select("ブラックスミス","アルケミスト","その他の職業について聞く")){
				case 1:
					mes "[Fay]";
					mes "ブラックスミスは力強い腕力と";
					mes "装備品で武器の精錬や効果属性の";
					mes "付与を行うことができる職業だ。";
					mes "戦闘を補助するスキルが増え、";
					mes "武器の製作を行うこともできる。";
					cutin "merchant_3.bmp", 2;
					next;
					mes "[Fay]";
					mes "ブラックスミスの戦い方は";
					mes "腕力に頼るものが多い。";
					mes "敵に囲まれたときに範囲で";
					mes "スタンさせるハンマーフォールや";
					mes "武器の破損と引き換えに攻撃力を";
					mes "上げるオーバートラストがある。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ブラックスミスは";
					mes "ホワイトスミス（左）へ";
					mes "アルケミストはクリエイター（右）";
					mes "という職業になれるぞ！";
					cutin "merchant_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Fay]";
					mes "アルケミストは回復用ポーションなどの";
					mes "薬品を作り出す錬金術の職業だ。";
					mes "各種ポーション系のアイテムを";
					mes "作成することができる。";
					mes "ホムンクルスやモンスターを";
					mes "召喚して戦うこともできる。";
					cutin "merchant_4.bmp", 2;
					next;
					mes "[Fay]";
					mes "アルケミストは";
					mes "ポーションピッチャーでの支援や";
					mes "バイオプラントを駆使した戦いを";
					mes "行うこともできるようになる。";
					next;
					mes "[Fay]";
					mes "アルケミストが召喚できる";
					mes "ホムンクルスは一緒に";
					mes "戦うことができる人工生命でもあり、";
					mes "育てていけば、強力な味方に";
					mes "なってくれるだろう。";
					next;
					mes "[Fay]";
					mes "さらに成長して、";
					mes "転生という行為を行えば、";
					mes "ブラックスミスは";
					mes "ホワイトスミス（左）へ";
					mes "アルケミストはクリエイター（右）";
					mes "という職業になれるぞ！";
					cutin "merchant_5.bmp", 2;
					next;
					break;
				}
				cutin "merchant_5.bmp", 255;
				break;
			case 7:
				mes "[Fay]";
				mes "Taekwon Kid系についてだな。";
				mes "プロンがちょっと話してる";
				mes "だろうけど、Taekwon Kidは";
				mes "拳聖とソウルリンカーに";
				mes "転職できるようになる。";
				mes "どっちについて聞きたいんだい？";
				cutin "taekwonkid_1.bmp", 2;
				next;
				switch(select("拳聖","ソウルリンカー","その他の職業について聞く")){
				case 1:
					mes "[Fay]";
					mes "拳聖は太陽、月、星の恩恵を";
					mes "授かった職業だ。";
					mes "本 に秘められたエネルギーを";
					mes "足にため、攻撃力にする能力がある。";
					mes "また、場所や日によって使用可能な";
					mes "スキルが変化する職業でもある。";
					cutin "taekwonkid_3.bmp", 2;
					next;
					mes "[Fay]";
					mes "拳聖の戦い方はスキルで";
					mes "登録するモンスターと";
					mes "場所によるところが大きい。";
					mes "太陽、月、星の怒 りスキルは";
					mes "攻撃力が大きく上昇する";
					mes "強力なスキルだ。";
					next;
					break;
				case 2:
					mes "[Fay]";
					mes "ソウルリンカーはテコンドーの";
					mes "道を断ち、霊魂の力を";
					mes "自在に操る職業だ。";
					mes "様々な職業をサポートできると共に、";
					mes "魔法による攻撃を行うこともできる。";
					cutin "taekwonkid_4.bmp", 2;
					next;
					mes "[Fay]";
					mes "ソウルリンカーの戦い方は";
					mes "単体魔法として強力なエスマや";
					mes "職業ごとの特性を発揮する魂のスキル";
					mes "を使用したものとなる。";
					mes "HPダメージを受けてSPを消費し、";
					mes "回復を行うカアヒは強力なスキルだ。";
					next;
					break;
				}
				cutin "taekwonkid_4.bmp", 255;
				break;
			case 8:
				mes "[Fay]";
				mes "特殊1次職のGunslinger、Ninja";
				mes "Supernoviceには";
				mes "上位職はないんだ。";
				mes "この職業は冒険者でも稀な";
				mes "職業と言えるかもしれないな。";
				mes "個性豊かな職業さ。";
				next;
				break;
			case 9:
				mes "[Fay]";
				mes "そうか、また知りたくなったら、";
				mes "いつでも聞きにきてくれ。";
				mes "喜んで話すぜ。";
				close;
			}
			mes "[Fay]";
			mes "他の上位職について聞くかい？";
			next;
			if(select("わかったから大丈夫","他の職も聞きたい")==1) break;
		}
		return;
	}

	function	GIVE_BOOK {
		if(checkitemblank() < 2){
			mes "^FF0000＜警告＞^000000";
			mes "‐所持アイテムの種類数が多い為";
			mes "　アイテムを受けとることが";
			mes "　できません‐";
			mes "‐所持アイテムを減らしてから、";
			mes "　再度話しかけてください‐";
			close;
		} else
		if(Weight>(MaxWeight/100)*90){
			mes "^FF0000＜警告＞^000000";
			mes "‐所持アイテムの重量が多い為";
			mes "　アイテムを受けとることが";
			mes "　できません‐";
			mes "‐所持アイテムを減らしてから、";
			mes "　再度話しかけてください‐";
			close;
		}
		getitem 11055,1;
		mes "[Fay]";
		mes "冒険の基礎ブックだ。";
		mes "大事なことが書いてある。";
		mes " ";
		mes "せっかくだから、この本の使い方も";
		mes "教えておこう。";
		next;
		cutin "jp_quest_help10.bmp",2;
		mes "[Fay]";
		mes "^FF0000Alt+Eキー^000000で所持アイテムが";
		mes "表示されるから、冒険の基礎ブックに";
		mes "^FF0000カーソルを合わせて、";
		mes "右クリック^000000してみてくれ。";
		mes "すると、アイテムの詳細ウィンドウが";
		mes "表示される。";
		next;
		mes "[Fay]";
		mes "冒険の基礎ブックのような";
		mes "本のアイテムは読むことができる。";
		mes "^0000FFウィンドウ左上の開いた本のマークを";
		mes "左クリック^000000してみてくれ。";
		mes "カーソルを合わせたときに「読む」と";
		mes "表示されるほうだ。";
		next;
		mes "[Fay]";
		mes "すると、本の中を読むことができる。";
		mes "冒険の大切なことが書かれている";
		mes "ので、読んでみるといい。";
		next;
		cutin "jp_quest_help10.bmp", 255;
		return;
	}

OnTouch:
	set AC_JOBCHANGE,0;
	if(AC_NOVICE_QUE==30 && Job!=Job_Novice && !checkquest(100128)){
		mes "[Fay]";
		mes "無事転職できたようだな。";
		mes "おめでとう！";
		next;
		mes "[Fay]";
		mes "それじゃ、冒険者アカデミー内を";
		mes "見て回るといい。";
		mes "冒険者アカデミーには、";
		mes "戦闘が出来る実習室や";
		mes "いろんな依頼に応える";
		mes "仕事があるからな。";
		next;
		mes "[Fay]";
		mes "そうそう、";
		mes "^FF0000Lune^000000が";
		mes "仕事を手伝ってくれる人を";
		mes "探してるんだ。";
		next;
		mes "[Fay]";
		mes "この部屋を出たら、";
		mes "^0000FFピンク色の髪をした女性^000000に";
		mes "話しかけてみるといい。";
		mes "キミの成長の手助けになるはずだ。";
		setquest 100128;
		close;
	} else
	if(AC_NOVICE_QUE==30 && Job==Job_Novice){
		if(CHANGE_SNV || CHANGE_TK || CHANGE_GS || CHANGE_NJ){
			emotion 21, "Fay#ac_room"; //52725
			mes "[Fay]";
			mes "おっ！";
			mes "転職に向けてがんばってる";
			mes "みたいだな！";
			next;
			if(CHANGE_TK||CHANGE_SNV){
				mes "[Fay]";
				mes "BaseLvを上げたいなら、";
				mes "冒険者アカデミー内の";
				mes "実習室か特別室へ";
				mes "行って見るといい。";
				next;
				mes "[Fay]";
				mes "実習室はこの講習室を";
				mes "出てから、左上の方へ";
				mes "行くとあるぞ。";
				close;
			} else {
				mes "[Fay]";
				mes "他の街へ行くなら、";
				mes "^0000FF「転送サービス」^000000をしている";
				mes "赤い髪の^0000FFタール^000000を探して";
				mes "みるといい。";
				next;
				mes "[Fay]";
				mes "タールはこの講習室を";
				mes "出てから、左上の方へ行くと";
				mes "いるはずだ。";
				close;
			}
		}
	}
	end;
}


//操作ノート
-	script	操作ノート#func	-1,{
	mes "[操作ノート]";
	mes "‐冒険に役立つことがかかれた本だ‐";
	mes "‐本を開くと、ページの項目が";
	mes "のっている‐";
	mes "‐どのページを読んでみようか‐";
	next;
	switch(select("会話の仕方","戦闘の仕方","場所の調べ方","座り方","視点変更の仕方","ショートカットの使い方","読むのをやめる")){
	case 1:
		mes "[会話の仕方のページ]";
		mes "‐左下に会話と書かれた半透明の";
		mes "ウィンドウが会話ウィンドウです。";
		mes "会話ウィンドウには会話をはじめ、";
		mes "ステータスの変化やアイテムの";
		mes "入手時にもメッセージが表示されます‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐下段右側の空欄にメッセージを";
		mes "入れ、^0000FFEnterキー^000000を押すと、";
		mes "同一画面の全プレイヤーに";
		mes "会話が表示されます。";
		next;
		mes "[会話の仕方のページ]";
		mes "‐下段左側の空欄にキャラクター名を";
		mes "入力することで、その相手と1対1で";
		mes "会話を行うことができます‐";
		mes "‐この機能を使うことで、";
		mes "画面内に相手がいない状態でも";
		mes "ログイン中の相手と会話ができます‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐会話ウィンドウ右下の";
		mes "2つの○の内、";
		mes "右の○をクリックすると、";
		mes "ウィンドウの大きさが変更され、";
		mes "表示行数を変更できます‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐左側の○をクリックすると、";
		mes "会話モードの切り替えが行われます‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐会話モードの切り替えは、全体、";
		mes "パーティ、ギルドの3種類と";
		mes "なります‐";
		mes "‐全体は同一画面内の";
		mes "キャラクターに会話が表示されます‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐パーティはログイン中の";
		mes "パーティメンバー全員に";
		mes "発言した会話が表示されます。";
		mes "パーティメンバー以外には";
		mes "この会話は見えません‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐ギルドもログイン中の";
		mes "ギルドメンバー全員に";
		mes "発言した会話が表示されます。";
		mes "ギルドメンバー以外には";
		mes "この会話は見えません‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐また、発言の際に";
		mes "^0000FFCtrlキーを押した状態で";
		mes "Enterキーを押す^000000と";
		mes "パーティメンバーへの";
		mes "会話になります‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐同様に、発言の際に";
		mes "^0000FFAltキーを押した状態で";
		mes "Enterキーを押す^000000と";
		mes "ギルドメンバーへの";
		mes "会話となります‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐キーを押す以外にも";
		mes "発言内容の前に";
		mes "「^0000FF%^000000」を入れることで";
		mes "パーティメンバーへの";
		mes "会話として発言することができます‐";
		mes "‐「^0000FF%^000000」は半角での入力となります‐";
		next;
		mes "[会話の仕方のページ]";
		mes "‐同様に発言の前に";
		mes "「^0000FF$^000000」を入れることで、";
		mes "ギルドメンバーへの";
		mes "会話として発言することができます‐";
		mes " ";
		mes "‐「^0000FF$^000000」は半角での入力となります‐";
		close;
	case 2:
		mes "[戦闘の仕方ページ]";
		mes "‐モンスターへの攻撃は";
		mes "攻撃するモンスターを";
		mes "左クリックすることで、";
		mes "行うことができます‐";
		mes "‐また、^0000FFCtrlキー^000000を同時に押すことで、";
		mes "オートモードになります‐";
		next;
		mes "[戦闘の仕方ページ]";
		mes "‐会話ウィンドウ内に^0000FF『/nc』^000000または『/noctr』と";
		mes "入力して発言すると、";
		mes "Ctrlキーを押さずに";
		mes "常にオートモードへ";
		mes "切り替えておくことができます‐";
		close;
	case 3:
		mes "[座り方のページ]";
		mes "‐基本スキルレベルが";
		mes "Lv3となることで、座ることが";
		mes "できるようになります‐";
		mes "‐^0000FFInsertキー^000000を押すことで";
		mes "座る、立つの動作を";
		mes "行うことができます。";
		next;
		mes "[座り方のページ]";
		mes "‐座った状態の時には";
		mes "HPとSPの自然回復速度が増加します‐";
		close;
	case 4:
		mes "[視点変更の仕方のページ]";
		mes "‐マウスの右クリックを押し続け、";
		mes "左右にマウスを動かすと、";
		mes "視点の変更ができます‐";
		next;
		mes "[視点変更の仕方のページ]";
		mes "‐また、視点を変更した状態で、";
		mes "マウスの^0000FF右ボタンを";
		mes "ダブルクリック^000000すると、";
		mes "視点を元の状態へ戻すことが";
		mes "できます‐";
		next;
		mes "[視点変更の仕方のページ]";
		mes "‐しかし、室内などの";
		mes "特定の場所では";
		mes "右のダブルクリックで";
		mes "視点が変更されない場所も";
		mes "あります‐";
		next;
		mes "[マウス操作]";
		mes "‐右ボタンを押し続けることで、";
		mes "カーソルが左右の矢印の形に";
		mes "変化します。";
		mes "この状態でマウスを移動させると";
		mes "視点を変更することが出来ます‐";
		next;
		mes "[視点変更の仕方のページ]";
		mes "‐^0000FF『Ctrl+右ボタン』^000000で";
		mes "キャラクターに";
		mes "ズームインすることが出来ます‐";
		next;
		mes "[視点変更の仕方のページ]";
		mes "‐^0000FF『Shift+右ボタン』^000000で";
		mes "視点の角度を";
		mes "変更することが出来ます。";
		mes "この際^0000FF『Ctrlキー』^000000を";
		mes "同時に押すことで、より大きく";
		mes "角度を変更することが出来ます‐";
		next;
		mes "[視点変更の仕方のページ]";
		mes "‐視点の拡大縮小は";
		mes "^0000FFマウスのホイールを上下に";
		mes "動かす^000000ことでも行うことができます‐";
		close;
	case 5:
		mes "[ショートカットの使い方]";
		mes "‐ショートカットウィンドウは";
		mes "^0000FFF12キー^000000を押すことで";
		mes "表示させることができます‐";
		mes "‐ウィンドウの表示中は";
		mes "3つのショートカットウィンドウが";
		mes "切り替わります‐";
		next;
		mes "[ショートカットの使い方]";
		mes "‐ショートカットウィンドウには";
		mes "消費アイテムやスキル、";
		mes "装備品を登録することができます‐";
		mes "‐登録後、^000000F1～F9キー^000000までの";
		mes "キーを押すことで、登録したものを";
		mes "使用することができます‐";
		next;
		mes "[ショートカットの使い方]";
		mes "‐ショートカットしたいアイテム、";
		mes "スキル、装備品のアイコンを";
		mes "^0000FFショートカットウィンドウに";
		mes "ドラッグ^000000することで、";
		mes "登録することができます‐";
		next;
		mes "[ショートカットの使い方]";
		mes "‐消耗品となる回復アイテムなどを";
		mes "ショートカットウィンドウに";
		mes "登録し、ボタンを連打しながら";
		mes "回復すると大変便利です‐";
		close;
	default:
		mes "["+ strcharinfo(0) +"]";
		mes "（もう調べることはないかな。）";
		close;
	}
OnInit:
	if(strnpcinfo(2)=="func") end;
OnTimer3000:
	misceffect 543;
	initnpctimer;
}
ac_library.gat,110,108,0	duplicate(操作ノート#func)	操作ノート#_1	111
ac_library.gat,107,108,0	duplicate(操作ノート#func)	操作ノート#_2	111
ac_cl_room.gat,45,62,4	duplicate(操作ノート#func)	操作ノート#3	111
ac_cl_room.gat,33,47,4	duplicate(操作ノート#func)	操作ノート#4	111
ac_cl_room.gat,55,44,4	duplicate(操作ノート#func)	操作ノート#4_1	111

ac_cl_room.gat,37,32,4	script	マスター・スヌス	51,{
	function GetBeginnerEquip;
	if(AC_PASSPORT<2){
		mes "[マスター・スヌス]";
		mes "ん？君はまだアカデミーでの";
		mes "入学手続きが";
		mes "完了していないようだね。";
		next;
		mes "[マスター・スヌス]";
		mes "まずは、^FF0000「エーラさん」^000000の";
		mes "ところで入学手続きを";
		mes "すませるんだ。";
		close;
	}
	if(checkquest(201036)) {
		mes "‐男はなにやら忙しそうである‐";
		next;
		mes "‐インフォメーション‐";
		//mes "　^FF00002015年5月26日";
		//mes "　定期メンテナンス以前に";
		//mes "　「分厚い戦闘教範」を";
		//mes "　受け取っている場合、";
		mes "　こちらのNPCを";
		mes "　利用することができません‐";
		close;
	}
	mes "[マスター・スヌス]";
	// 挨拶分岐未調査
	if(gettime(3) >= 5 && gettime(3) <= 10)
		mes "やぁ、おはよう。";
	else if(gettime(3) >= 11 && gettime(3) <= 17)
		mes "やぁ、こんにちは。";
	else
		mes "やぁ、こんばんは。";
	next;
	if(Upper == UPPER_HIGH || getbaseclass(Class) > CLASS_DC || Job >= Job_RuneKnight) {
		mes "[マスター・スヌス]";
		mes "冒険者として十分に";
		mes "成長している君には";
		mes "僕の導きは必要ないだろう。";
		mes "人生とは孤独なものさ……";
		mes "孤独だからこそ、仲間と共に歩む事が";
		mes "なにより素晴らしいのさ！";
		next;
		mes "[マスター・スヌス]";
		mes "ギルドに入るのもいいだろう。";
		mes "見ず知らずの相手とひと時";
		mes "共に歩むのもいいだろう……";
		next;
		mes "[マスター・スヌス]";
		mes "これからの君の道が";
		mes "素晴らしい物になる事を";
		mes "願っているよ。";
		close;
	}
	if(AC_PASSPORT == 2) {
		mes "[マスター・スヌス]";
		mes "初めまして。";
		mes "僕の名はスヌス………";
		mes "マスター・スヌスと呼んでくれ。";
		next;
		mes "[マスター・スヌス]";
		mes "まずは……君の為に";
		mes "^0000FF初心者用ポーション^000000を用意したんだ。";
		mes "量は少ないが、君の助けになれば";
		mes "と思ってね。";
		next;
		mes "[マスター・スヌス]";
		mes "HPが減って危なくなったら";
		mes "これを使って回復するんだ。";
		next;
		mes "‐インフォメーション‐";
		mes "　^FF0000マスター・スヌスから";
		mes "　提供される初心者用ポーション";
		mes "　の提供期間は";
		mes "　2週間となります‐";
		//setquest 117475;
		//compquest 117475;
		setquest 117480;
		set AC_PASSPORT,3;
		next;
	}
	if(checkquest(117480)) {
		if(checkquest(117480)&2) {
			mes "‐インフォメーション‐";
			mes "　初心者用ポーション提供開始から";
			mes "　2週間経過したので、";
			mes "　初心者用ポーションの配布は";
			mes "　終了となります‐";
			delquest 117480;
			delquest 117470;
			next;
		}
		else {
			if(!checkquest(117470) || checkquest(117470)&2) {
				if(MaxWeight - Weight < 1000) {
					mes "[マスター・スヌス]";
					mes "……ちょっと荷物が";
					mes "重すぎるみたいだね。";
					mes "荷物を整理して、^FF0000所持重量を";
					mes "^FF0000減らして^000000おいで。";
					mes "改めて初心者用ポーションを";
					mes "渡してあげるよ。";
				}
				else if(checkitemblank() < 3) {
					mes "[マスター・スヌス]";
					mes "……ちょっと荷物が";
					mes "多すぎるみたいだね。";
					mes "荷物を整理して、^FF0000所持種類数を";
					mes "^FF0000減らして^000000おいで。";
					mes "改めて初心者用ポーションを";
					mes "渡してあげるよ。";
				}
				else {
					setquest 117470;
					// 個数分岐未調査
					if(BaseLevel < 30)
						getitem 569, 100;
					else if(BaseLevel < 50)
						getitem 569, 200;
					else if(BaseLevel < 70)
						getitem 569, 300;
					else if(BaseLevel < 90)
						getitem 569, 500;
					else
						getitem 569, 1000;
					mes "[マスター・スヌス]";
					mes "少し時間はかかるけど";
					mes "また用意しておくよ。";
					mes "いつ頃渡せるかは、";
					mes "クエストウィンドウを確認";
					mes "しておくれ。";
				}
			}
			else {
				mes "[マスター・スヌス]";
				mes "初心者用ポーションはまだ";
				mes "準備中なんだ。";
				mes "いつ頃渡せるかは、";
				mes "クエストウィンドウを確認";
				mes "しておくれ。";
			}
			next;
		}
	}
	else {
		mes "[マスター・スヌス]";
		mes "冒険は順調かい？";
		next;
	}
	mes "[マスター・スヌス]";
	mes "さて、それじゃあ……";
	next;
	if(select("アイテム交換","立ち去る") == 2) {
		mes "[マスター・スヌス]";
		mes "そうかい？";
		mes "また来るといい。";
		close;
	}
	mes "[マスター・スヌス]";
	mes "アイテム交換だね。";
	mes "君が交換できるのは……";
	next;
	if(AC_BEGINNER_EQUIP == 12) {
		mes "[マスター・スヌス]";
		mes "チケットがないようだから、";
		mes "君にあげられるものは";
		mes "なさそうだね……";
		next;
		mes "[マスター・スヌス]";
		mes "それだけの実力があって";
		mes "JobLvが50に達しているのなら";
		mes "君は次のステージに進む";
		mes "時が来たんだろうね。";
		next;
		if(countitem(25020) == 0) {
			mes "[マスター・スヌス]";
			mes "そういえば、君は";
			mes "「卒業証書」は";
			mes "持っていないようだね。";
			mes "未開封のレベルアップ";
			mes "ボックスがあるなら";
			mes "開けておくといいよ。";
			next;
			mes "[マスター・スヌス]";
			mes "さて、君さえよければ";
			mes "「メテウスシルプ」という";
			mes "人物のところへ案内しよう。";
			mes "そこで「転生」の手続きに";
			mes "進むことが可能となる。";
			next;
			mes "[マスター・スヌス]";
			mes "手続きを行うには";
			mes "^FF00001,285,000Zeny^000000が必要と";
			mes "なるので、注意しておくれ。";
		}
		else {
			mes "[マスター・スヌス]";
			mes "君さえよければ";
			mes "「メテウスシルプ」という";
			mes "人物のところへ案内しよう。";
			next;
			mes "[マスター・スヌス]";
			mes "そこで「卒業証書」を";
			mes "渡せば無料で「転生」の";
			mes "手続きに進むことが";
			mes "可能となる。";
			next;
			mes "[マスター・スヌス]";
			mes "「卒業証書」をなくして";
			mes "しまうと「転生」の手続きに";
			mes "^FF00001,285,000Zeny^000000が必要と";
			mes "なるので、注意しておくれ。";
		}
		next;
		mes "[マスター・スヌス]";
		mes "それじゃ、";
		mes "「メテウスシルプ」へいくかい？";
		next;
		if(select("はい","また今度にする") == 2) {
			mes "[マスター・スヌス]";
			mes "そうかい？";
			mes "また来るといい。";
			close;
		}
		mes "[マスター・スヌス]";
		mes "いままで教えたことを";
		mes "忘れずにこれからも";
		mes "冒険を頑張ってほしい！";
		close2;
		warp "yuno_in02.gat",90,162;
		end;
	}
	if(countitem(25018) < 1 && countitem(25019) < 1) {
		mes "[マスター・スヌス]";
		mes "チケットを持っていない";
		mes "みたいだね。";
		next;
		mes "[マスター・スヌス]";
		mes "レベルを上げて";
		mes "レベルアップボックスを";
		mes "開けたら、チケットが";
		mes "手に入るんだ。";
		next;
		mes "[マスター・スヌス]";
		mes "頑張ってね！";
		next;
		mes "‐インフォメーション‐";
		mes "　^FF0000アイテム交換は";
		mes "　Ninja、Taekwon Kid、";
		mes "　ソウルリンカー、拳聖、";
		mes "　Gunslinger、";
		mes "　Supernoviceを除く";
		mes "　未転生職業のみの権利です。";
		next;
		mes "‐インフォメーション‐";
		mes "　また、転生後の職業での";
		mes "　交換は受け付けていませんので";
		mes "　ご注意ください。";
		close;
	}
	if(Job == Job_Novice) {
		mes "[マスター・スヌス]";
		mes "チケットは持っているけれど……";
		mes "まずはTaekwon Kidを除く";
		mes "いずれかの一次職に";
		mes "転職してから……だね。";
		next;
		mes "[マスター・スヌス]";
		mes "転職したら、またおいで。";
		mes "その時改めて、チケットとアイテムを";
		mes "交換してあげよう。";
		close;
	}
	switch(AC_BEGINNER_EQUIP) {
	case 0:
		if(countitem(25019) == 0) close;

		mes "[マスター・スヌス]";
		mes "[衣装] ビギナー帽";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,1;
		delitem 25019, 1;
		getitem 20307, 1;
		mes "[マスター・スヌス]";
		mes "[衣装] ビギナー帽は";
		mes "冒険をはじめてまもない";
		mes "冒険者に贈っている";
		mes "装備アイテムであり";
		mes "冒険者ビギナーの証でもある。";
		next;
		mes "[マスター・スヌス]";
		mes "この帽子は、";
		mes "装備しているだけで";
		mes "様々なステータスを";
		mes "強化してくれる。";
		next;
		mes "[マスター・スヌス]";
		mes "また、これを装備していれば";
		mes "他の熟練した冒険者が";
		mes "手を貸してくれることも";
		mes "あるだろうから、きちんと";
		mes "身に着けておいてくれ。";
		next;
		mes "[マスター・スヌス]";
		mes "それと…";
		mes "[衣装] ビギナー帽を";
		mes "装備した状態で";
		mes "スキル「応急手当」を";
		mes "使えば、僕の所に";
		mes "戻ってくることが出来るんだ。";
		next;
		mes "[マスター・スヌス]";
		mes "何かあれば使うといい。";
		mes "僕はいつでも此処に";
		mes "居るからね。";
		next;
		mes "‐インフォメーション‐";
		mes "　^FF0000習得しているスキルを確認、";
		mes "　使用する場合は";
		mes "　基本情報画面の「Skill」を押すか";
		mes "　「Alt + S」でスキルウィンドウを";
		mes "　呼び出すことができます。";
		next;
		mes "‐インフォメーション‐";
		mes "　[[衣装] ビギナー帽]は、";
		mes "　次の職業への転職の際に";
		mes "　回収をさせて頂きます。";
		mes "　Ninja、Gunslinger";
		mes "　Taekwon Kid";
		mes "　Supernovice。";
		next;
		mes "‐インフォメーション‐";
		mes "　それ以外の職業は";
		mes "　「転生」又は";
		mes "　「3次職転職」の際に";
		mes "　回収させて頂きます。";
		next;
		mes "[マスター・スヌス]";
		mes "ところで、この部屋にいる人達から";
		mes "講習は全部受けたかい？";
		mes "もし受けてないようであれば";
		mes "きちんと受けておくんだよ。";
		next;
		break;
	case 1:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		break;
	case 2:
		if(countitem(25019) == 0) close;

		mes "[マスター・スヌス]";
		mes "フード[0]";
		mes "サンダル[0]";
		mes "ガード[0]";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,3;
		delitem 25019, 1;
		getitem 2501, 1;
		getitem 2401, 1;
		getitem 2101, 1;
		mes "[マスター・スヌス]";
		mes "いま渡した防具は";
		mes "装備することで少しなりとも";
		mes "モンスターからの";
		mes "ダメージを軽減して";
		mes "くれるものだから、";
		next;
		mes "[マスター・スヌス]";
		mes "忘れずに装備する";
		mes "ようにしてくれ。";
		if(checkre()) {
			mes "ただし、盾である";
			mes "「ガード」は攻撃速度が";
			mes "遅くなるデメリットも";
			mes "あるから注意してくれ。";
		}
		next;
		mes "[マスター・スヌス]";
		mes "まずは試しに装備してみて";
		mes "使い勝手が悪いようであれば";
		mes "無理に装備する必要はないぞ。";
		next;
		break;
	case 3:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		mes "[マスター・スヌス]";
		mes "今回渡した武器は";
		mes "以前渡したものよりは";
		mes "攻撃力が強化された武器だ。";
		next;
		mes "[マスター・スヌス]";
		mes "いま所持している武器より";
		mes "攻撃力が高いようであれば";
		mes "是非使ってみてほしい。";
		next;
		break;
	case 4:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[マスター・スヌス]";
			mes "そうだね……";
			mes "どれが欲しいか、選んでご覧。";
			next;
			switch(select("モルフェウスセット","ヘルモードセット①","ヘルモードセット②")) {
			case 1:
				mes "[マスター・スヌス]";
				mes "Acolyte、Magician系の";
				mes "後衛にお勧めの防具だね。";
				setarray '@itemid,5126,2518,2648,2649;
				break;
			case 2:
				mes "[マスター・スヌス]";
				mes "前衛にお勧めの防具だね。";
				mes "HPやSPが増加したり";
				mes "モンスターから受けるダメージを";
				mes "軽減する効果をもっているぞ。";
				setarray '@itemid,5123,2353,2517,2418;
				break;
			case 3:
				mes "[マスター・スヌス]";
				mes "前衛にお勧めの防具だね。";
				mes "装備することで回避力や";
				mes "回復アイテムの回復効果を";
				mes "強化する効果をもっているぞ。";
				setarray '@itemid,5123,2353,2516,2417;
				break;
			}
			next;
			mes "[マスター・スヌス]";
			mes getitemname('@itemid[0])+ "[" +getiteminfo('@itemid[0],10)+ "]";
			mes getitemname('@itemid[1])+ "[" +getiteminfo('@itemid[1],10)+ "]";
			mes getitemname('@itemid[2])+ "[" +getiteminfo('@itemid[2],10)+ "]";
			mes getitemname('@itemid[3])+ "[" +getiteminfo('@itemid[3],10)+ "]";
			mes "これにするかい？";
			next;
			if(select("いいえ","はい") == 2) {
				break;
			}
		}
		mes "[マスター・スヌス]";
		mes getitemname('@itemid[0])+ "[" +getiteminfo('@itemid[0],10)+ "]";
		mes getitemname('@itemid[1])+ "[" +getiteminfo('@itemid[1],10)+ "]";
		mes getitemname('@itemid[2])+ "[" +getiteminfo('@itemid[2],10)+ "]";
		mes getitemname('@itemid[3])+ "[" +getiteminfo('@itemid[3],10)+ "]";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,5;
		delitem 25019, 1;
		getitem '@itemid[0], 1;
		getitem '@itemid[1], 1;
		getitem '@itemid[2], 1;
		getitem '@itemid[3], 1;
		mes "[マスター・スヌス]";
		mes "今回渡した防具は";
		mes "全て装備することで";
		mes "特殊な効果が発揮される";
		mes "すごい防具なんだ！";
		next;
		mes "[マスター・スヌス]";
		mes "^FF0000セット装備は、";
		mes "全てそろった状態で";
		mes "装備しないと";
		mes "効果を発揮しない^000000ので";
		mes "装備するときは";
		mes "そのことを忘れないようにね。";
		next;
		break;
	case 5:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		mes "[マスター・スヌス]";
		mes "今回渡した武器は";
		mes "以前渡したものより";
		mes "更に強化された武器だ。";
		next;
		mes "[マスター・スヌス]";
		mes "武器によっては";
		mes "ステータスやスキルを";
		mes "強化してくれる";
		mes "物もあるので";
		next;
		mes "[マスター・スヌス]";
		mes "いま所持している武器より";
		mes "攻撃力が高いようであれば";
		mes "是非使ってみてほしい。";
		next;
		break;
	case 6:
		if(countitem(25019) == 0) close;

		switch(getbaseclass(Class,2)) {
		case CLASS_KN: set '@itemid,5950; break;
		case CLASS_CR: set '@itemid,2606; break;
		case CLASS_WZ: set '@itemid,5951; break;
		case CLASS_SA: set '@itemid,5956; break;
		case CLASS_HT: set '@itemid,5952; break;
		case CLASS_BA: set '@itemid,5958; break;
		case CLASS_DC: set '@itemid,5957; break;
		case CLASS_PR: set '@itemid,5953; break;
		case CLASS_MO: set '@itemid,5959; break;
		case CLASS_BS: set '@itemid,5954; break;
		case CLASS_AM: set '@itemid,5960; break;
		case CLASS_AS: set '@itemid,5955; break;
		case CLASS_RG: set '@itemid,5961; break;
		}
		if('@itemid == 0) {	// 未調査
			mes "[マスター・スヌス]";
			mes "まだ2次職に転職していない";
			mes "君にあげられるものは";
			mes "なさそうだね……";
			close;
		}
		mes "[マスター・スヌス]";
		mes getitemname('@itemid);
		mes "を君に貸してあげよう。";
		next;
		set AC_BEGINNER_EQUIP,7;
		delitem 25019, 1;
		getitem2 '@itemid,1,1,0,0,0,0,0,0,1209600;
		mes "[マスター・スヌス]";
		mes "今回渡した防具は";
		mes "装備することで";
		mes "特殊な効果を発揮する";
		mes "特別な防具だ。";
		next;
		mes "[マスター・スヌス]";
		mes "ただ効果がかなり";
		mes "すぐれているので";
		mes "今回はレンタルという";
		mes "かたちで防具を渡している。";
		next;
		mes "[マスター・スヌス]";
		mes "今回渡した防具は";
		mes "いまから約2週間で";
		mes "自動的に消滅するので";
		mes "まずは装備して";
		mes "その効果を試してみてほしい。";
		next;
		break;
	case 7:
		if(countitem(25019) == 0) close;

		mes "[マスター・スヌス]";
		mes "イヤリング[1]";
		mes "ネックレス[1]";
		mes "ロザリオ[1]";
		mes "グローブ[1]";
		mes "ブローチ[1]";
		mes "リング[1]";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,8;
		delitem 25019, 1;
		getitem 2622, 1;
		getitem 2623, 1;
		getitem 2626, 1;
		getitem 2624, 1;
		getitem 2625, 1;
		getitem 2621, 1;
		mes "[マスター・スヌス]";
		mes "今回渡した防具は";
		mes "アクセサリーという";
		mes "場所に装備できる";
		mes "防具だ。";
		next;
		mes "[マスター・スヌス]";
		mes "装備することで";
		mes "ステータスを上昇させる";
		mes "効果があるので";
		mes "君の好みで使ってみてほしい。";
		next;
		break;
	case 8:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[マスター・スヌス]";
			mes "そうだね……";
			mes "どれが欲しいか、選んでご覧。";
			next;
			switch(select("エベシ嵐のうねり[1]","クレイトス大地の裂け目[1]","ルシウス火山の激しさ[1]","シャピニハ海の叫び[1]")) {
			case 1:
				set '@elem$,"風";
				set '@itemid,2349;
				break;
			case 2:
				set '@elem$,"地";
				set '@itemid,2351;
				break;
			case 3:
				set '@elem$,"火";
				set '@itemid,2345;
				break;
			case 4:
				set '@elem$,"水";
				set '@itemid,2347;
				break;
			}
			mes "[マスター・スヌス]";
			mes "鎧に" +'@elem$+ "属性が付与されている";
			mes "防具だね。";
			mes '@elem$+ "属性攻撃をしてくる";
			mes "ダンジョンやフィールドで";
			mes "有効だよ。";
			next;
			mes "[マスター・スヌス]";
			mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "これにするかい？";
			next;
			if(select("いいえ","はい") == 2) {
				break;
			}
		}
		mes "[マスター・スヌス]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,9;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	case 9:
		if(countitem(25019) == 0) close;

		mes "[マスター・スヌス]";
		mes "Louiseの赤い靴[1]";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,10;
		delitem 25019, 1;
		getitem 22068, 1;
		mes "[マスター・スヌス]";
		mes "今回渡した防具は";
		mes "装備することで";
		mes "[初心者用ポーション]の";
		mes "回復効果を高めることが";
		mes "できる防具だ。";
		next;
		mes "[マスター・スヌス]";
		mes "またこの防具を";
		mes "精錬していくことで";
		mes "[初心者用ポーション]の";
		mes "回復効果を更に";
		mes "高めることができるぞ。";
		next;
		mes "[マスター・スヌス]";
		mes "ただし、精錬を重ねていくと";
		mes "精錬に失敗することがあって";
		mes "防具そのものを失って";
		mes "しまうこともあるから";
		mes "注意するようにしてほしい。";
		next;
		break;
	case 10:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[マスター・スヌス]";
			mes "そうだね……";
			mes "どれが欲しいか、選んでご覧。";
			next;
			switch(select("シャレールシールド[1]","フロワシールド[1]","ソルシールド[1]","ルヴァンシールド[1]","ソンブルシールド[1]","ラモールシールド[1]","エスプリシールド[1]","リュミエールシールド[1]","プワゾンシールド[1]")) {
			case 1: set '@elem$,"火";   set '@race$,"悪魔"; set '@itemid,2159; break;
			case 2: set '@elem$,"水";   set '@race$,"動物"; set '@itemid,2163; break;
			case 3: set '@elem$,"地";   set '@race$,"魚貝"; set '@itemid,2165; break;
			case 4: set '@elem$,"風";   set '@race$,"昆虫"; set '@itemid,2194; break;
			case 5: set '@elem$,"闇";   set '@race$,"不死"; set '@itemid,2164; break;
			case 6: set '@elem$,"不死"; set '@race$,"人間"; set '@itemid,2158; break;
			case 7: set '@elem$,"念";   set '@race$,"天使"; set '@itemid,2175; break;
			case 8: set '@elem$,"聖";   set '@race$,"竜";   set '@itemid,2174; break;
			case 9: set '@elem$,"毒";   set '@race$,"植物"; set '@itemid,2167; break;
			}
			mes "[マスター・スヌス]";
			mes '@elem$+ "属性モンスターから受ける";
			mes "ダメージを少し軽減し、";
			mes '@race$+ "型モンスターから受ける";
			mes "ダメージが少し増える";
			mes "盾だね。";
			next;
			mes "[マスター・スヌス]";
			mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "これにするかい？";
			next;
			if(select("いいえ","はい") == 2) {
				break;
			}
		}
		mes "[マスター・スヌス]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,11;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	case 11:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[マスター・スヌス]";
			mes "そうだね……";
			mes "どれが欲しいか、選んでご覧。";
			next;
			switch(select("シャレールマント[1]","フロワマント[1]","ソルマント[1]","ルヴァンマント[1]","ソンブルマント[1]","ラモールマント[1]","エスプリマント[1]","リュミエールマント[1]","プワゾンマント[1]")) {
			case 1: set '@elem$,"火";   set '@race$,"悪魔"; set '@itemid,2596; break;
			case 2: set '@elem$,"水";   set '@race$,"動物"; set '@itemid,2593; break;
			case 3: set '@elem$,"地";   set '@race$,"魚貝"; set '@itemid,20701; break;
			case 4: set '@elem$,"風";   set '@race$,"昆虫"; set '@itemid,20750; break;
			case 5: set '@elem$,"闇";   set '@race$,"不死"; set '@itemid,2595; break;
			case 6: set '@elem$,"不死"; set '@race$,"人間"; set '@itemid,2598; break;
			case 7: set '@elem$,"念";   set '@race$,"天使"; set '@itemid,20716; break;
			case 8: set '@elem$,"聖";   set '@race$,"竜";   set '@itemid,20705; break;
			case 9: set '@elem$,"毒";   set '@race$,"植物"; set '@itemid,20708; break;
			}
			mes "[マスター・スヌス]";
			mes '@elem$+ "属性モンスターから受ける";
			mes "ダメージを少し軽減し、";
			mes '@race$+ "型モンスターから受ける";
			mes "ダメージが少し増える";
			mes "マントだね。";
			next;
			mes "[マスター・スヌス]";
			mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "これにするかい？";
			next;
			if(select("いいえ","はい") == 2) {
				break;
			}
		}
		mes "[マスター・スヌス]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "を君にあげよう。";
		next;
		set AC_BEGINNER_EQUIP,12;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	}
	mes "[マスター・スヌス]";
	mes "まだチケットを持っているなら";
	mes "もう一度話しかけておくれ。";
	next;
	mes "‐インフォメーション‐";
	mes "　^FF0000アイテム交換は";
	mes "　未転生時のみの権利です。";
	mes "　転生後は受け付けていませんので";
	mes "　交換し忘れにご注意ください‐";
	close;

	function	GetBeginnerEquip	{
		switch(AC_BEGINNER_EQUIP) {
		case 1:
			switch(getbaseclass(Class)) {
			case CLASS_SM: set '@itemid,1107; break;
			case CLASS_MG: set '@itemid,1601; break;
			case CLASS_AC: set '@itemid,1704; break;
			case CLASS_AL: set '@itemid,1504; break;
			case CLASS_MC: set '@itemid,1301; break;
			case CLASS_TF: set '@itemid,1207; break;
			}
			break;
		case 3:
			switch(getbaseclass(Class)) {
			case CLASS_SM: set '@itemid,1122; break;
			case CLASS_MG: set '@itemid,1607; break;
			case CLASS_AC: set '@itemid,1710; break;
			case CLASS_AL: set '@itemid,1519; break;
			case CLASS_MC: set '@itemid,1354; break;
			case CLASS_TF: set '@itemid,1216; break;
			}
			break;
		case 5:
			switch(getbaseclass(Class)) {
			case CLASS_SM:
				if(getbaseclass(Class,2) == CLASS_KN) { set '@itemid,1163; }
				else if(getbaseclass(Class,2) == CLASS_CR) { set '@itemid,1410; }	// 未確認
				break;
			case CLASS_MG:
				if(getbaseclass(Class,2) == CLASS_WZ) { set '@itemid,1619; }
				else if(getbaseclass(Class,2) == CLASS_SA) { set '@itemid,1551; }	// 未確認
				break;
			case CLASS_AC:
				if(getbaseclass(Class,2) == CLASS_HT) { set '@itemid,1718; }
				else if(getbaseclass(Class,2) == CLASS_BA) { set '@itemid,1907; }
				else if(getbaseclass(Class,2) == CLASS_DC) { set '@itemid,1956; }	// 未確認
				break;
			case CLASS_AL:
				if(getbaseclass(Class,2) == CLASS_PR) { set '@itemid,1625; }
				else if(getbaseclass(Class,2) == CLASS_MO) { set '@itemid,1807; }	// 未確認
				break;
			case CLASS_MC:
				if(getbaseclass(Class,2) == CLASS_BS) { set '@itemid,1360; }
				else if(getbaseclass(Class,2) == CLASS_AM) { set '@itemid,1119; }
				break;
			case CLASS_TF:
				if(getbaseclass(Class,2) == CLASS_AS) { set '@itemid,1360; }	// 未確認
				else if(getbaseclass(Class,2) == CLASS_RG) { set '@itemid,1360; }	// 未確認
				break;
			}
			break;
		}
		if('@itemid == 0) {	// 未調査
			mes "[マスター・スヌス]";
			mes "まだ2次職に転職していない";
			mes "君にあげられるものは";
			mes "なさそうだね……";
			close;
		}
		mes "[マスター・スヌス]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "を君にあげよう。";
		set AC_BEGINNER_EQUIP,AC_BEGINNER_EQUIP + 1;
		delitem 25018, 1;
		getitem '@itemid, 1;
		next;
		return;
	}

OnInit:
	waitingroom "マスター・スヌス",0;
	end;
}
