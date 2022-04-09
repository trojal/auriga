//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Reception and Training Room
// by Pneuma
// 1.1 since 2019 Updata, Add Master Sunus by refis
//------------------------------------------------------------

// Receptionist
ac_cl_room.gat,43,41,4	script	Receptionist Ella#Ella	90,{
	function getcombathan;
	set '@novice, callfunc("AC_GetNovice");

	if(Job==Job_Summoner) {
		mes "[Ella]";
		mes "You must be Doram.";
		mes "Welcome to the Adventurer Academy!";
		mes "Please take your time to visit.";
		close;
	}
	if(AC_PASSPORT>=2){
		if(Job!=Job_Novice) {
			mes "[Ella]";
			mes "Hello " +strcharinfo(0)+ ", you are always eager to learn.";
			mes "Please tell me about your travels sometime.";
			close;
		} else {
			if(AC_NOVICE_QUE<10){
				mes "[Ella]";
				mes "I know there are still many things you don't understand, but you are just beginning your journey as an adventurer.";
				next;
				mes "[Ella]";
				mes "First, you should talk to ^0000FFPuron^000000 in this room.";
			}
			else if(AC_NOVICE_QUE<20){
				mes "[Ella]";
				mes "Are you being taught a lot of things?";
				mes "We have new students coming in, so everyone is very excited.";
				mes "You should hear from ^0000FFAldi^000000 there, too.";
			}
			else if(AC_NOVICE_QUE<30) {
				mes "[Ella]";
				mes "It looks like you are making good progress.";
				mes "I'm sure ^0000FFFaye^000000 will tell you about the future.";
				mes "Please talk to ^0000FFFaye^000000 at the back of the room.";
			}
			else {
				mes "[Ella]";
				mes "It looks like the training course went well.";
				mes "You can now go for ^FF00001 next job ^000000.";
				mes "You can ask ^0000FFFaye^000000 at the back of this training room.";
				emotion 2,"";
			}
		}
	}

	if(AC_PASSPORT<2 && !checkquest(201040)){
		mes "[Ella]";
		mes "You are new here.";
		mes "Welcome to the Adventurer Academy!";
		mes "First, let's complete the enrollment process.";
		mes "Let's see, ......";
		mes "Yes, "+strcharinfo(0)+ ".";
		next;
		mes "[Ella]";
		mes "First, the name is ......";
		mes "...... date is ";
		next;
		mes "[Ella]";
		mes "First, the name is ......";
		mes "...... date is ............";
		mes "The appearance is ......";
		next;
		mes "[Ella]";
		mes "First, the name is ......";
		mes "...... date is ............";
		mes "The appearance is ......";
		mes "Whoa "+(Sex ? "cool": "cute")+ "!";
		mes "......";
		next;
		setquest 201040;
		emotion 46,"";
		mes "[Ella]";
		mes "Here you go!";
		mes "Your enrollment is complete!";
		mes "You are now a student at the Adventurer Academy!";
		next;
		mes "[Ella]";
		mes "The Adventurer Academy is a school for adventurers from all over the world.";
		mes "It's a school that is funded by donations from adventurers.";
		next;
		mes "[Ella]";
		mes "It's a school where people from all walks of life come to learn, from fledgling adventurers just starting out to old and strong adventurers.";
		next;
		mes "[Ella]";
		mes "If you are not used to adventuring, it would be a good idea to learn at the Adventurer Academy here.";
		next;
		mes "[Ella]";
		mes "Well then, let me quickly tell you the important things you need to know as you begin your adventure.";
		next;
		mes "[Ella]";
		mes "It's about the ^FF0000 quest ^000000.";
		mes " ^0000FFQuest^000000 is, simply put, an adventure that begins in various places.";
		next;
		mes "[Ella]";
		mes "By accomplishing the quests, you get experience, rewards, and various services.";
		next;
		mes "[Ella]";
		mes "Quests can be anything from taking requests from people in need and solving their problems, to exploring something, solving a mystery, defeating a monster, and so on.";
		next;
		mes "[Ella] ^FF0000Alt+U key ^000000.";
		mes "Now you see [Enroll in Adventurer Academy] and a quest in the window labeled Quest List.";
		cutin "jp_quest_help01.bmp", 2;
		next;
		mes "[Ella]";
		mes "Each quest can be viewed in the ^0000FF quest list^000000 window by selecting the quest name and pressing the \"^FF0000view^000000\" button or by ^0000FF double-clicking^000000 on the quest name to see the detailed contents.";
		next;
		mes "[Ella]";
		mes "[Admission to the Adventurer's Academy] quest says that you have enrolled.";
		mes "The quests vary, so if you lose track of the content, try pressing ^FF0000Alt+U key ^000000.";
		next;
		mes "[Ella]";
		mes "Yes, ^0000FF completed quests ^000000 will be displayed in the quest list with the ^0000FF crescent moon symbol ^000000.";
		if(!'@novice){
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[Ella]";
			mes "It seems like I'm lucky today to have someone as experienced as you enroll.";
			next;
			mes "[Ella]";
			mes "If you want to know about the inside of the school, I think ^0000FFMido^000000 is just outside this room, so please ask him.";
			set AC_PASSPORT,2; //enrollment complete
			set AC_AFLIER,0; //destroy flicker flag
			close;
		}
		if(!countitem(1243) && !countitem(2414) && !countitem(2510) && !countitem(2352) && !countitem(2112) && !countitem(5055)){
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[Ella]";
			mes "This is my entrance gift to you.";
			mes "Please accept it.";
			// The check is not checked in the main house.
			if(checkitemblank()) getitem 1243, 1;
			if(checkitemblank()) getitem 2414, 1;
			if(checkitemblank()) getitem 2510, 1;
			if(checkitemblank()) getitem 2352, 1;
			if(checkitemblank()) getitem 2112, 1;
			if(checkitemblank()) getitem 5055, 1;
		}
		if(!getskilllv(142)){ // change only on first conversation?
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[Ella]";
			mes "Oh?  I see that you have not yet learned the skill \"^0000FF First Aid^000000\".";
			mes "Since you're here, I'll teach you the skill \"^0000FF First Aid^000000\" as well.";
			mes "This is a pretty useful skill when you are injured.";
			next;
			skill 142,1,0;
			mes "^4d4dff- You have mastered the skill 'First Aid'. - ^000000";
		}
	}
	if(!checkquest(100056) && !checkquest(201036) && !checkquest(201815)){
		next;
		cutin "jp_quest_help01.bmp", 255;
		mes "[Ella]";
		mes "Ah!  It was.";
		mes " Right now, we're giving away free helpful items to support fledgling adventurers.";
		next;
		mes "[Ella]";
		mes "The first item is called ^4d4dff Thick Combat Instruction^000000, and when used, it increases the experience gained by 50% for one hour!";
		next;
		mes "[Ella]";
		mes "The second item is a ^4d4dff level up box^000000, which is a box that can be opened when you reach a certain level and when opened you get various items!";
		next;
		getcombathan;
	}
	if(checkquest(100056) && !checkquest(201036) && !checkquest(201815)){
		mes "[Ella]";
		mes "Then I'll give you ^4d4dff thick combat instruction^000000 and ^4d4dff level up box^000000.";
		next;
		getcombathan;
	}
	if(AC_PASSPORT<2){
		next;
		cutin "jp_quest_help01.bmp", 255;
		mes "[Ella]";
		mes "Well, that's it from me.";
		mes " For more useful basic adventure stories, ^0000FFPuron^000000, ^0000FFAldi^000000, and ^0000FFFaye^000000 in this room will tell you.";
		next;
		mes "[Ella]";
		mes "If you learn here, as you grow, you'll have all the necessities that will help you.";
		mes " First, please talk to ^0000FFPuron^000000 in this room.";
		setquest 100112;
		set AC_PASSPORT,2; //enrollment complete
		set AC_AFLIER,0; //destroy flicker flag
	}
	close;

	function getcombathan {
		if(MaxWeight - Weight < 2000){
			mes "[Ella]";
			mes "Oh?";
			mes "I was going to give it to you, but it looks like your luggage is too heavy to carry.";
			mes "Please reduce your luggage.";
			next;
			mes "-You cannot receive the item due to the weight of the item you are carrying-";
			mes "-Please reduce the number of items in your possession and then speak to us again-";
			close2;
			if(!checkquest(100056)) setquest 100056;
			cutin "jp_quest_help01.bmp", 255;
			end;
		}
		if(checkitemblank() < 3){
			mes "[Ella]";
			mes "Oh my?";
			mes "I was going to give it to you, but it looks like you have too much stuff.";
			mes "Please reduce your luggage.";
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
		mes "Use this to become a great adventurer!";
		getitem 25023, 1;
		getitem 12312, 10;
		getitem2 22954,1,1,0,0,0,0,0,0,0,1209600;
		delquest 100056;
		//setquest 201036; // old quest
		setquest 201815;
		next;
		mes "[Ella]";
		mes "You can get various items from the box, but the first box you get contains an item called 'armor exchange ticket'.";
		next;
		mes "[Ella]";
		mes "The ticket can be exchanged for various items depending on your level, and ^FF0000 \"Master Sunus-san\" ^000000 is right there to help you exchange those items!";
		next;
		mes "[Ella]";
		mes "Be sure to come to \"Master Sunus\" when you get your ticket from the box!";
		next;
		mes "-Information-";
		mes " ^FF0000 \"Level Up Boxes\" will automatically disappear approximately two weeks after receipt.";
		mes " Please open the \"Level Up Box\" before the expiration date as we do not redistribute \"Level Up Boxes\".";
		next;
		mes "-Information-";
		mes " ^FF0000 Also, if you change your job to Ninja, Gunslinger, Supernovice, or Taekwon Kid, we will collect your \"Level Up Box\", \"Weapon Exchange Ticket\", and \"Armor Exchange Ticket\" when you change your job.";
		return;
	}
}

ac_cl_room.gat,44,16,0	script	# course1_warp1	45,1,1,{
	if(AC_PASSPORT<2) {
		mes "[Ella]";
		mes "You are a prospective student!";
		mes "Please complete the enrollment process here first.";
		mes " -hearing voices from the room-";
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
		mes "Welcome to the Adventurer Academy!";
		mes "It looks like you haven't completed the registration process yet.";
		mes "Please complete the registration first.";
		close;
	}
	set '@novice, callfunc("AC_GetNovice");
	if(AC_NOVICE_QUE>=10 || Job!=Job_Novice){
		if(Job!=Job_Novice){
			if(AC_NOVICE_QUE) {
				mes "[Puron]";
				mes "Looks like you're doing well.";
				mes "If you have any questions, I can explain.";
				mes "What do you want to ask me about?";
			} else {
				mes "[Puron]";
				mes "Hello.";
				mes "This may not be necessary for you, but what do you want to ask me about?";
			}
		} else if(AC_NOVICE_QUE==10){
			mes "[Puron]";
			mes "Next, ^FF0000Aldi^000000 on the other side of the room will tell you.";
			next;
			mes "[Puron]";
			mes "If you have any questions about the first profession, come back and ask me again when you get to the first profession.";
			mes "Or is there something else you want to ask?";
		} else if(AC_NOVICE_QUE > 10 && AC_NOVICE_QUE < 20){
			mes "[Puron]";
			mes "My course is finished.";
			mes "Next, ^0000FFAldi^000000 on the other side of the room will teach you.";
			mes "Or is there something else you want to ask?";
		} else if(AC_NOVICE_QUE >= 20 && AC_NOVICE_QUE < 30){
			mes "[Puron]";
			mes "You've completed my course.";
			mes "The ^0000FFFaye^000000 at the back of the room will teach you the last part.";
			mes "Or is there something else you want to ask?";
		} else if(AC_NOVICE_QUE>=30){
			mes "[Puron]";
			mes "Looks like you got everything done without a hitch.";
			mes "Do you have any more questions about your profession?";
		}
		while(1){
			next;
			switch(select("about quests", "about changing jobs", "about first job", "about first job skills", "about first job status", "about weapons", "nothing to ask")){
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
				mes "If you have any more questions, come back anytime and I'll explain it to you.";
				close2;
				cutin "ninja_throwshurike.bmp", 255;
				end;
			}
			mes "[Puron]";
			mes "Is there anything else you want to ask?";
		}
	}
	
	switch(AC_NOVICE_QUE){
	case 0:
		mes "[Puron]";
		mes "You are a new student.";
		mes "It's ^0000FFPuron^000000 who's in charge of the course.";
		mes "Have you heard from Ella about the ^FF0000quest^000000?";
		next;
		mes "[Puron]";
		mes "Let's get started with a detailed discussion of the ^FF0000 quest window ^000000.";
		next;
		ABOUT_QUESTWINDOW;
	case 1:
		mes "[Puron]";
		mes "I see you figured out about the quest window.";
		if(AC_NOVICE_QUE < 1){
			if(BaseLevel<2 || JobLevel<2){
				mes "Let's celebrate!";
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
		mes "Next, I'll teach you about the basics of being an adventurer and changing jobs!";
		ABOUT_JOBCHANGE;
	case 2:
		mes "[Puron]";
		mes "I see you've figured out about changing jobs.";
		if (AC_NOVICE_QUE < 2){
			if(BaseLevel<3 || JobLevel<3){
				mes "Let's celebrate!";
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
		mes "Okay, now let's talk about the professions you can change from Novice to!";
		next;
		ABOUT_JOB;
	case 3:
	CASE 4:
	case 5:
		mes "[Puron]";
		mes "I see you have found out about your primary occupation.";
		if(AC_NOVICE_QUE < 3){
			if(BaseLevel<5 || JobLevel<5){
				mes "Let's celebrate!";
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
				mes "Oh yeah, let's pass this along!";
				next;
			} else {
				mes "Have you reduced your luggage?";
				next;
				if(select("I have reduced", "I have not reduced")==2){
					mes "[Puron]";
					mes "I guess I'll have to reduce my luggage first.";
					close;
				}
			}
			set ac_novice_que,4;
			if(checkitemblank() == 0){
				mes "^FF0000<WARNING>^000000-You cannot receive items due to the number of different items in your possession-";
				mes "-Please reduce the number of items in your possession and talk to us again-";
				close;
			} else
			if(Weight>(MaxWeight/100)*90){
				mes "^FF0000<WARNING>^000000-You will not be able to receive the item due to the high weight of the item you are carrying-";
				mes "-Please reduce the number of items in your possession and then speak to me again-";
				close;
			}
			getitem 569, 50;
			emotion 46,"";
			set AC_NOVICE_QUE,5;
			mes "[Puron]";
			mes "A must-have for adventurers, a recovery item!";
			mes "I think I'll use it when I'm wounded in a battle with a monster.";
			mes " Well then, that's the end of my training!";
			next;
			mes "[Puron]";
			mes "You can check the items I just gave you by pressing the ^0000FF \"item\"^000000 button in the ^0000FF \"Basic Information\"^000000 window to display the ^0000FF \"Items in your possession\"^000000 window.";
		} else {
			mes " Well, that's the end of my training course!";
		}
		delquest 100112;
		setquest 100116;
		set AC_NOVICE_QUE, 10; //Puron's training completed
	default:
		mes "[Puron]";
		mes "Next, ^FF0000Aldi^000000 on the other side of the room will teach you.";
		next;
		mes "[Puron]";
		mes "If you have any questions about the first profession, come back and ask me again when you get to the first profession.";
		close;
	}

	function ABOUT_QUESTWINDOW {
		while(1){
			mes "[Puron]";
			mes "You can use ^FF0000Alt+ U^000000 to display the quest window.";
			mes "For details of a quest, double-click on the quest name or use the \"view\" button.";
			mes "[Puron]";
			mes "And the ^0000FF quest details^000000 include the details of the request and the objective to accomplish it.";
			mes " If you don't know what to do, check the detailed information!";
			mes "[Puron]";
			mes "Some quests involve killing monsters.";
			mes "In that case, you can look at the monster's location at the bottom of the window.";
			mes "You can see which and how many monsters you have killed.";
			mes "[Puron]";
			mes "Oh yeah, quests that involve time have the time in the lower right corner.";
			mes "The ones that need to be completed in a certain amount of time or are restricted to a specified time have the time in here, so I guess I'll check that.";
			cutin "jp_quest_help05.bmp", 2;
			next;
			cutin "jp_quest_help05.bmp", 255;
			mes "[Puron]";
			mes "Did you understand about the quest window?";
			mes " You can display the quest window with ^FF0000Alt+U^000000.";
			next;
			if(select("Okay", "I don't know")==1) break;
			mes "[Puron]";
			mes "Okay, I'll explain again.";
			next;
		}
		return;
	}

	function ABOUT_JOBCHANGE {
		while(1) {
			mes "[Puron]";
			mes "Adventurers in this world have various occupations.";
			mes "Your occupation right now is Novice.";
			mes "Every adventurer starts as a Novice.";
			mes "[Puron]";
			mes "From ^0000FF Novice^000000 you can change to ^0000FF 1st job ^000000 or 1st job expanded [Puron]";
			mes "However, once you change jobs, you cannot return to your original profession.";
			mes "Choose carefully which profession you change jobs to.";
			mes "Also, the profession you change jobs to will determine the higher level of your profession.";
			mes "[Puron]";
			mes "Once you become a first-level profession, you will be able to use skills and items that are not available when you are a Novice.";
			mes "You can progress through the stages of Novice → 1st job → 2nd job.";
			mes "[Puron]";
			mes "By the time the three of us are done with the training, you should be able to change jobs."; 
			next;
			mes "[Puron]";
			mes "Did you understand about changing jobs?";
			next;
			if (select("Okay", "Don't know")==1) break;
			mes "[Puron]";
			mes "Okay, I'll explain again.";
			next;
		}
		return;
	}

	function ABOUT_JOB_CLASS1 {
		cutin "weapon_list.bmp", 255;
		next;
		mes "[Puron]";
		mes "There are 7 basic 1st jobs and 3 other 1st job expansions in the world.";
		next;
		mes "[Puron]";
		mes "The basic 1st jobs are ^0000FFSwordsman^000000, ^0000FFMagician^000000, ^0000FFAcolyte^000000, ^0000FFThief^000000, ^0000FF Archer^000000, ^0000FFArcher^000000, and ^0000FFAcolyte^000000. FFMerchant^000000, ^0000FFTaekwon Kid^000000, and seven professions.";
		mes "1st job expanded is ^0000FFGunslinger^000000, ^0000FFNinja^000000, and ^0000FFSupernovice^000000.";
		next;
		return;
	}

	function ABOUT_JOB_FEATURE {
	switch(select("good at close combat", "good at long distance combat", "good at magic combat", "good at supporting friends", "good at carrying goods and making money", "good at fighting", "good at special characteristics",(AC_NOVICE_QUE2 & 0x2 ? "I know about occupations" :
		""))) {
		case 1:
			cutin "swordman_1.bmp", 2;
			mes "[Puron]";
			mes "The professions that are good at close combat would be the primary ^0000FFSwordsman^000000 and its higher level professions, Knight and Crusader.";
			next;
			mes "[Puron]";
			mes "I would probably leave it to Knight for front line attacks and Crusader for defense.";
			mes "In the bottom row, the occupation on the left will be Knight and the occupation on the right will be Crusader.";
			next;
			cutin "thief_1.bmp", 2;
			mes "[Puron]";
			mes "Also, the first occupation ^0000FFThief^000000, which can fight by evading enemy attacks with quick attacks and lightness, and its higher occupations, Assassin and Rogue, can also fight on the front line.";
			next;
			mes "[Puron]";
			mes "Assassin and Rogue can also use their skills to take enemy items, and they can also save money by selling the items they get.";
			next;
			mes "[Puron]";
			mes "Especially Rogue's skill called Snatcher is very powerful because it allows her to take enemy items during normal attacks.";
			next;
			mes "[Puron]";
			mes "In the bottom row, the left profession is Assassin and the right profession is Rogue.";
			next;
			cutin "thief_1.bmp", 255;
			mes "[Information]";
			mes "-Swordsman of the 1st occupation-";
			mes "-Difficulty of training: suitable for beginners^FF0000(recommended)^000000-";
			mes "-Thief of the 1st job-";
			mes "-Training difficulty: suitable for beginners^FF0000(recommended)^000000-";
			break;
		case 2:
			cutin "archer_1.bmp", 2;
			mes "[Puron]";
			mes "The professions that are good at long-distance fighting would be ^0000FFArcher^000000, which is the first level profession, and Hunter, Dancer and Bard, which are its higher level professions.";
			next;
			cutin "archer_3.bmp", 2;
			mes "[Puron]";
			mes "Especially when you become a Hunter, you will be able to use your skills to set traps and lure the enemy to fight, instead of attacking directly.";
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "Dancers and Bards can use effective support skills, such as when fighting with their friends.";
			next;
			cutin "archer_4.bmp", 255;
			mes "[Information]";
			mes "-1st Archer-";
			mes "-Training difficulty: suitable for beginners^FF0000(recommended)^000000-";
			break;
		case 3:
			cutin "magician_1.bmp", 2;
			mes "[Puron]";
			mes "If we talk about professions that are good at magical warfare, it would be ^0000FFMagician^000000, which is the first level profession, and Wizard and Sage, which are its higher level professions.";
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[Puron]";
			mes "Also, although it may be thorny, Soul Linker, which is a higher level profession of Taekwon Kid, can also use a powerful magic attack called Esma.";
			next;
			cutin "magician_3.bmp", 2;
			mes "[Puron]";
			mes "The Wizard is able to strike down his enemies with powerful magical attacks.";
			mes "While it can make powerful attacks, I wouldn't expect it to defend itself half as well.";
			next;
			cutin "magician_4.bmp", 2;
			mes "[Puron]";
			mes "Sage will be a profession that can fight against various types of attributes by strengthening their weaknesses and resistance to attributes.";
			next;
			cutin "magician_4.bmp", 255;
			mes "[Information]";
			mes "-Magician of the 1st profession-";
			mes "-Difficulty of training: suitable for intermediate level -";
			break;
		case 4:
			cutin "acolyte_1.bmp", 2;
			mes "[Puron]";
			mes "The professions that are good at helping their friends would be ^0000FFAcolyte^000000, the first profession, and Priest, which is a higher level profession, and the profession shown on the left of the bottom row.";
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[Puron]";
			mes "Also, Soul Linker, which will be the higher profession of the first profession, ^0000FFTaekwon Kid^000000";
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "Bard and Dancer, which are the higher level occupations of ^0000FFArcher^000000, are also good at supporting.";
			next;
			mes "[Puron]";
			cutin "acolyte_3.bmp", 2;
			mes "Priests have powerful support skills such as Kyrie Eleison, which protects the target for a certain number of times by putting up a barrier, and Magnificat, which doubles the natural recovery of SP.";
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[Puron]";
			mes "The skills handled by Soul Linker have different effects for each profession, but there are powerful soul-based skills as support.";
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "Bard has a powerful skill called Bragi's Poem that reduces the chanting time of players within range and reduces the stiffness after skill use.";
			next;
			mes "[Puron]";
			mes "I see that Dancer has a support skill called Service for You that increases the maximum SP of targets within range and reduces SP drain.";
			next;
			cutin "archer_4.bmp", 255;
			mes "[Information]";
			mes "-1st Acolyte-";
			mes "-Difficulty of training: suitable for intermediate level -";
			mes "-Taekwon Kid- of the 1st degree-";
			mes "-Training difficulty: intermediate";
			mes "-1st Profession Archer-";
			mes "-Training difficulty: for beginners^FF0000(recommended)^000000-";
			break;
		case 5:
			cutin "merchant_1.bmp", 2;
			mes "[Puron]";
			mes "If I were to say a profession that is good at carrying luggage and making money, it would be the first level profession ^0000FFMerchant^000000 or its higher level professions Blacksmith and Alchemist.";
			next;
			mes "[Puron]";
			mes "Merchant occupations have the skill of opening stalls, which is not found in other occupations, so it is easy to sell items.";
			next;
			mes "[Puron]";
			mes "I can set any price I want for the items I acquire and sell them on the spot.";
			mes "You can set your own price, so you can even sell them for a higher price than you would at a tool shop.";
			next;
			cutin "merchant_1.bmp", 255;
			mes "[Information]";
			mes "-1st Merchant-";
			mes "-Difficulty of training: for advanced users-";
			break;
		case 6:
			cutin "taekwonkid_2.bmp", 2;
			mes "[Puron]";
			mes "Professions that are good at fighting are the primary ^0000FFTaekwon Kid^000000 and ";
			next;
			cutin "taekwonkid_3.bmp", 2;
			mes "[Puron]";
			mes "Star Gladiator, which is the higher profession of Taekwon Kid,";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[Puron]";
			mes "And then there's Monk, which is a higher level occupation for the first level occupation ^0000FFAcolyte^000000.";
			next;
			cutin "taekwonkid_2.bmp", 2;
			mes "[Puron]";
			mes "Taekwon Kid is an occupation that does not carry any weapons and fights only with his body.";
			mes "The skill Warm Wind allows you to fight with various attributes on yourself, so you can take advantage of your opponent's weaknesses.";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[Puron]";
			mes "Monk has a three-stage palm and other techniques that can be linked from skill to skill to inflict powerful damage.";
			mes "There is also a one-hit kill skill called Asura Haoho Fist, so there is a wide variety of ways to fight.";
			next;
			cutin "acolyte_4.bmp", 255;
			mes "[Information]";
			mes "-Taekwon Kid of the 1st level-";
			mes "-Difficulty of training: suitable for intermediate level -";
			mes "-Acolyte- of the 1st job-";
			mes "-Difficulty of training: for intermediate level-";
			break;
		case 7:
			mes "[Puron]";
			mes "Special professions are not really recommended for new adventurers, but I will explain them.";
			mes "What would you like to hear?";
			next;
			switch(select("good at ninjutsu", "good at using guns", "want to live in Novice")){
			case 1:
				cutin "ninja.bmp", 2;
				mes "[Puron]";
				mes "When I say that I'm good at ninjutsu, that would be ^0000FFNinja^000000 in 1st job expanded.";
				next;
				mes "[Puron]";
				mes "This profession has no higher level profession, and there are difficulties in growing up that other professions don't have, so it's hard if you aim for it half-heartedly.";
				next;
				mes "[Puron]";
				mes "Ninjas can fight using their magical attack skills or attack from a distance using weapons that can be thrown.";
				next;
				mes "[Puron]";
				mes "Of course, they can also fight in close quarters and learn a skill called Isshin, which allows them to deliver a powerful blow in exchange for their own HP.";
				mes "It's a profession that can change the way you fight a lot, depending on how you raise it.";
				next;
				cutin "ninja.bmp", 255;
				mes "[Information]";
				mes "-1st job expanded Ninja-";
				mes "-Difficulty of training: for advanced users-";
				break;
			case 2:
				cutin "gunslinger.bmp", 2;
				mes "[Puron]";
				mes "When I say I'm good with guns, that would be ^0000FFGunslinger^000000 in 1st job expanded.";
				next;
				mes "[Puron]";
				mes "This profession has no higher level profession and there are difficulties in growing up that other professions don't have, so it's tough if you aim for it half-heartedly.";
				next;
				mes "[Puron]";
				mes "Gunslinger is a profession that can handle a wide variety of guns, and depending on the lineage of the gun, it will be a profession that changes the way you fight.";
				next;
				mes "[Puron]";
				mes "There is the basic handgun, the shotgun for ranged attacks, the rifle for long-range attacks, the gatling for quick attacks, and the";
				next;
				mes "[Puron]";
				mes "You will need to master in your own way the grenades, which do a lot of damage per hit.";
				next;
				cutin "gunslinger.bmp", 255;
				mes "[Information]";
				mes "-1st job expanded gunslinger-";
				mes "-Difficulty of training: for advanced users-";
				break;
			case 3:
				cutin "super_novice.bmp", 2;
				mes "[Puron]";
				mes "Ehh! You want to live as a Novice?";
				mes "I guess the only thing I can recommend to such a precious Kimi is 1st job expanded ^0000FFSupernovice^000000.";
				next;
				mes "[Puron]";
				mes "Supernovice has a lot of hardships that other professions don't have, such as the fact that Supernovice doesn't have a higher profession and you have to have a BaseLv of 45 or higher to become a Supernovice.";
				next;
				mes "[Puron]";
				mes "Supernovice can learn most of the basic skills except some of the other primary professions, so depending on how you grow, you may be able to fight in a variety of ways.";
				next;
				mes "[Puron]";
				mes "It is a dream job, but those who aim for this job are quite valuable in the adventurer academy.";
				next;
				cutin "super_novice.bmp", 255;
				mes "[Information]";
				mes "-1st job expanded Supernovice-";
				mes "-Difficulty of training: advanced-";
				break;
			}
		}
		next;
		cutin "swordman_2.bmp", 255;
		return;
	}

	function ABOUT_JOB_SELECT {
		 switch(select("^0000FFSwordsman^000000","^0000FFMagician^000000","^0000FFAcolyte^000000","^0000FFThief^000000","^0000FFArcher^000000","^0000FFMerchant^000000","^0000FFTaekwon Kid^000000","^0000FF1st job expanded^000000", "I know about the occupation")){
		case 1:
			mes "[Puron]";
			mes "^0000FFSwordsman^000000, right?";
			mes "It's a profession that allows you to equip yourself with many types of weapons: daggers, one-handed swords, two-handed swords, axes, spears, and blunt weapons.";
			mes "From the first Swordsman profession, you will be able to change jobs in two different lines.";
			cutin "swordman_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "The one shown in the top row is the first job ^0000FFSwordsman^000000";
			mes "Swordsman is often called a swordsman, right?";
			cutin "swordman_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown on the left of the bottom row is Knight, the second profession that you can change jobs to after becoming a Swordsman.";
			cutin "swordman_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the right of the bottom row is ^0000FFCrusader^000000, the second job you can change jobs to after becoming Swordsman.";
			cutin "swordman_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "Swordsman is a profession that excels in swordsmanship.";
			mes "They are very powerful in melee combat.";
			mes "HP is basically higher than other professions.";
			cutin "swordman_2.bmp", 2;
			next;
			cutin "swordman_2.bmp", 255;
			mes "[Information]";
			mes "-Swordsman-";
			mes "-Difficulty of training: suitable for beginners^FF0000(recommended)^000000-";
			break;
		case 2:
			mes "[Puron]";
			mes "^0000FFMagician^000000.";
			mes "It is a profession that allows you to equip yourself with weapons of various kinds, such as daggers and staffs.";
			mes "From the first Magician profession, you will be able to change jobs in two lines.";
			cutin "magician_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "The first job ^0000FFMagician^000000 is shown in the top row.";
			cutin "magician_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "Displayed on the left of the bottom row is the second job ^0000FFWizard^000000, which you can change jobs to become after becoming a Magician.";
			cutin "magician_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the right of the bottom row is the ^0000FFSage^000000 of the second job that you can change jobs and become after becoming a Magician.";
			cutin "magician_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "^0000FFMagician^000000 is a profession with excellent magic attack power.";
			cutin "magician_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "Except for its lack of physical strength, unlike other professions, it has attributes in its magic, which makes it easy to attack at weak points and wipe out enemies with powerful magic.";
			next;
			cutin "magician_2.bmp", 255;
			mes "[Information]";
			mes "-Magician-";
			mes "-Difficulty of training: for intermediate level-";
			break;
		case 3:
			mes "[Puron]";
			mes "^0000FFAcolyte^000000.";
			mes "It's a profession that allows you to equip yourself with weapons of the kind: blunt weapons, staffs, etc.";
			mes "From the first Acolyte, you'll be able to change jobs in two different lines.";
			cutin "acolyte_1.bmp", 2;
			next;
			cutin "acolyte_2.bmp", 2;
			mes "[Puron]";
			mes "The first acolyte ^0000FFAcolyte^000000 is shown in the top row.";
			next;
			cutin "acolyte_3.bmp", 2;
			mes "[Puron]";
			mes "Shown on the left of the bottom row is the ^0000FFPriest^000000 of the second job that you can change jobs after becoming an Acolyte.";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[Puron]";
			mes "Shown to the right of the bottom row is the ^0000FFMonk^000000 of the second job that you can change jobs and become after becoming an Acolyte.";
			next;
			cutin "acolyte_2.bmp", 2;
			mes "[Puron]";
			mes "^0000FFAcolyte^000000 is a profession that excels at drawing out the abilities of your companions and healing wounded companions through the miracles of the clergy.";
			mes "It's characterized by being an indispensable part of the party.";
			next;
			cutin "acolyte_2.bmp", 255;
			mes "[Information]";
			mes "-Acolyte-";
			mes "-Difficulty of training: for intermediate level-";
			break;
		case 4:
			mes "[Puron]";
			mes "^0000FFThief^000000.";
			mes "It's a profession that allows you to equip yourself with different types of weapons, such as daggers, one-handed swords, axes, and bows.";
			mes "From the ^0000FFThief^000000 of the first profession, you'll be able to change jobs in two different lines.";
			cutin "thief_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "The first job ^0000FFThief^000000 is shown in the upper row.";
			cutin "thief_2.bmp", 2;
			next;
			cutin "thief_3.bmp", 2;
			mes "[Puron]";
			mes "Shown to the left of the bottom row is the ^0000FFAssassin^000000 of the second job you can change jobs after becoming Thief.";
			next;
			cutin "thief_4.bmp", 2;
			mes "[Puron]";
			mes "Displayed on the right of the bottom row is the ^0000FFRogue^000000, the second job that you can change jobs and become after becoming a Thief.";
			next;
			cutin "thief_2.bmp", 2;
			mes "[Puron]";
			mes "^0000FFThief^000000 is a profession that takes advantage of its lightness and is good at avoiding attacks and engaging in combat.";
			mes "It can steal items from enemies and disappear.";
			next;
			mes "[Puron]";
			mes "You have an unusual fighting style, such as using poison to attack.";
			next;
			cutin "thief_2.bmp", 255;
			mes "[Information]";
			mes "-Thief-";
			mes "-Training difficulty: suitable for beginners^FF0000(recommended)^000000-";
			break;
		case 5:
			cutin "archer_1.bmp", 2;
			mes "[Puron]";
			mes "^0000FFArcher^000000, right?";
			mes "It's a profession that allows you to equip yourself with weapons of different types, such as daggers and bows.";
			mes "You can change jobs in two lines from Archer, the first line of work.";
			next;
			cutin "archer_2.bmp", 2;
			mes "[Puron]";
			mes "The one shown in the top row is the first job ^0000FFArcher^000000.";
			next;
			cutin "archer_3.bmp", 2;
			mes "[Puron]";
			mes "Shown on the left of the bottom row is ^0000FFHunter^000000, the second job that you can change jobs after becoming an Archer.";
			next;
			cutin "archer_4.bmp", 2;
			mes "[Puron]";
			mes "Shown to the right of the bottom row are the ^0000FFBard^000000 and ^0000FFDancer^000000 secondary jobs that you can change jobs to after becoming an Archer.";
			mes "^0000FFBard^000000 is the profession that men become.";
			mes "^0000FFDancer^000000 is the profession that Woman becomes.";
			next;
			cutin "archer_2.bmp", 2;
			mes "[Puron]";
			mes "^0000FFArcher^000000 is a profession that excels at handling bows.";
			mes "It is capable of powerful attacks by shooting with attributed arrows.";
			mes "But he carries a lot of arrows, so I guess he needs to be careful about the amount of restoratives he carries.";
			next;
			cutin "archer_2.bmp", 255;
			mes "[Information]";
			mes "-Archer-";
			mes "-Training difficulty: suitable for beginners^FF0000(recommended)^000000-";
			break;
		case 6:
			mes "[Puron]";
			mes "^0000FFMerchant^000000.";
			mes "It's a profession that allows you to equip yourself with different types of weapons, such as daggers, one-handed swords, axes, and blunt weapons.";
			mes "From the first Merchant profession, you will be able to change jobs in two different lines.";
			cutin "merchant_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "The first job, ^0000FFMerchant^000000, is shown in the top row.";
			mes "Merchant is a profession that is often called ^0000FFMerchant^000000.";
			cutin "merchant_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the left of the bottom row is the ^0000FFBlacksmith^000000, the second profession you can change jobs to after becoming a Merchant.";
			cutin "merchant_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the right of the bottom row is ^0000FFAlchemist^000000, the second job that you can change jobs to after becoming a Merchant.";
			cutin "merchant_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "^0000FFMerchant^000000 is an excellent occupation for handling goods.";
			mes "Although not a good fighter, it is characterized by the fact that it can carry a large number of items and can easily fight for long periods of time or buy and sell outside of combat.";
			cutin "merchant_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "By becoming a Blacksmith or Alchemist, you will be able to do things like manufacturing later on.";
			next;
			cutin "merchant_2.bmp", 255;
			mes "[Information]";
			mes "-Merchant-";
			mes "-Difficulty of training: for advanced users-";
			break;
		case 7:
			mes "[Puron]";
			mes "^0000FFTaekwon Kid^000000.";
			mes "It is a profession in which you fight with your own body, unarmed.";
			mes "From the first job of Taekwon Kid, you will be able to change jobs in two different lines.";
			cutin "taekwonkid_1.bmp", 2;
			next;
			mes "[Puron]";
			mes "The first job ^0000FFTaekwon Kid^000000 is shown in the top row.";
			cutin "taekwonkid_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the left of the bottom row is ^0000FFStar Gladiator^000000, the second job you can change jobs to after becoming ^0000FFTaekwon Kid^000000.";
			cutin "taekwonkid_3.bmp", 2;
			next;
			mes "[Puron]";
			mes "Shown to the right of the bottom row is ^0000FFSoul Linker^000000, the second job that you can change jobs to after becoming Taekwon Kid.";
			cutin "taekwonkid_4.bmp", 2;
			next;
			mes "[Puron]";
			mes "^0000FFTaekwon Kid^000000 is an excellent profession for fighting with kicking techniques.";
			mes "Although it cannot equip any weapons, it is characterized by its ability to fight with a variety of kicks and quick movements.";
			cutin "taekwonkid_2.bmp", 2;
			next;
			mes "[Puron]";
			mes "Also, if you become a ^0000FFSoul Linker^000000, you will not be able to use many of the skills you learned when you were a ^0000FFTaekwon Kid^000000.";
			mes "I need to think about the skills I'm going to learn later when I learn them.";
			next;
			mes "[Puron]";
			mes "However, ^0000FFTaekwon Kid^000000 is different from the other six basic professions, and there is no higher level of ^0000FFT Star Gladiator^000000, ^0000FFSoul Linker^000000.";
			mes "It may be a thorny issue to consider mastering one.";
			next;
			cutin "taekwonkid_2.bmp", 255;
			mes "[Information]";
			mes "-Taekwon Kid-";
			mes "-Taekwon Kid difficulty level: intermediate-";
			break;
		case 8:
			mes "[Puron]";
			mes "It's about 1st job expanded.";
			mes "Unlike other professions, 1st job expanded is a profession that doesn't have a higher job than 1st job.";
			mes "What is the occupation you want to ask about?";
			next;
			switch(select("^0000FFGunslinger^000000","^0000FFNinja^000000","^0000FFSupernovice^000000", "Ask about other professions")){
			case 1:
				cutin "gunslinger.bmp", 2;
				mes "[Puron]";
				mes "^0000FFGunslinger^000000.";
				mes "It's the only profession that equips guns.";
				mes "There are five types of guns.";
				mes "They are handguns, rifles, shotguns, gatling guns, and grenade guns.";
				next;
				mes "[Puron]";
				mes "Shown in the top row is your current Novice occupation.";
				mes "The one shown in the bottom row will be your 1st job expanded ^0000FFGunslinger^000000.";
				next;
				mes "[Puron]";
				mes "^0000FFGunslinger^000000 is a profession that fights with guns.";
				mes "Combat will be from a distance.";
				next;
				mes "[Puron]";
				mes "I can handle five different weapons, so I have a variety of attack techniques to suit the situation.";
				next;
				cutin "gunslinger.bmp", 255;
				mes "[Information]";
				mes "-Gunslinger-";
				mes "-Difficulty of training: for advanced users-";
				break;
			case 2:
				cutin "ninja.bmp", 2;
				mes "[Puron]";
				mes "^0000FFNinja^000000.";
				mes "This occupation allows you to equip yourself with different types of weapons, such as daggers, Ninja swords, and shurikens.";
				next;
				mes "[Puron]";
				mes "Shown in the top row is your current Novice occupation.";
				mes "The one shown in the bottom row will be your 1st job expanded ^0000FFNinja^000000.";
				next;
				mes "[Puron]";
				mes "Ninja is a profession that specializes in covert and quick movements.";
				mes "Ninja swords, shuriken and other throwing weapons, and ninjutsu, which are attacks that resemble magic, are the hallmarks of Ninja fighting.";
				next;
				cutin "ninja.bmp", 255;
				mes "[Information]";
				mes "-Ninja-";
				mes "-Difficulty of training: for advanced users-";
				break;
			case 3:
				cutin "super_novice.bmp", 2;
				mes "[Puron]";
				mes "^0000FFSupernovice^000000.";
				mes "This occupation allows you to equip yourself with different types of weapons: dagger, one-handed sword, axe, blunt weapon, and staff.";
				next;
				mes "[Puron]";
				mes "Shown in the top row is your current Novice occupation.";
				mes "The one shown in the bottom row will be your 1st job expanded ^0000FFSupernovice^000000.";
				next;
				mes "[Puron]";
				mes "Supernovice is a profession that allows you to learn many of the skills of other 1st jobs.";
				mes "It's a profession that can be reached by those who can keep their mind as a Novice forever.";
				next;
				mes "[Puron]";
				mes "I think it will be characterized by a growth full of individuality.";
				next;
				cutin "super_novice.bmp", 255;
				mes "[Information]";
				mes "-Supernovice-";
				mes "-Supernovice Difficulty: Advanced-";
				break;
			}
		}
		next;
		cutin "swordman_2.bmp", 255;
		return;
	}

	function ABOUT_JOB {
		set '@sel,1;
		set '@last,0;
		while(1){
			switch('@sel){
			case 1:
				if('@last!=1 && AC_NOVICE_QUE<3){
					mes "[Puron]";
					mes "So let's talk about the first job that many adventurers change to.";
				}
				ABOUT_JOB_CLASS1;
				mes "[Puron]";
				mes "Would you like to hear about the characteristics of the profession or the name of the profession?";
				next;
				setarray '@select, 2,3,1,4;
				if('@last==1 || AC_NOVICE_QUE>=3){
					set '@last, '@sel;
					set '@sel, '@select[select("Ask by characteristics", "Ask by occupation name", "Ask again about the primary occupation", "I know about the occupation")-1];
				} else {
					set '@last, '@sel;
					set '@sel, '@select[select("Ask by characteristics", "Ask by occupation name", "Ask again about the first job")-1];
				}
				continue;
			case 2:
				mes "[Puron]";
				if('@last!=2)
					mes "Then let's use the feature to explain it.";
				mes "What features are you interested in?";
				next;
				ABOUT_JOB_FEATURE;
				mes "[Puron]";
				mes "Would you like to hear about any other features?";
				mes "Or do you want to ask by occupation?";
				next;
				setarray '@select, 4,2,3,1;
				set '@last, '@sel;
				set '@sel, '@select[select("I know about the occupation", "Ask by characteristics", "Ask by occupation", "Ask again about the primary occupation")-1];
				continue;
			case 3:
				mes "[Puron]";
				if('@last!=3)
					mes "Well then, let's explain it in terms of occupation.";
				mes "Are any of these ^FF0000 occupations ^000000 of interest to you?";
				next;
				setarray '@select, 4,3,2,1;
				ABOUT_JOB_SELECT;
				mes "[Puron]";
				mes "Would you like to hear about other jobs?";
				mes "Or do you want to ask by characteristics?";
				next;
				set '@last, '@sel;
				set '@sel, '@select[select("I know about the occupation", "Ask by occupation", "Ask by characteristics", "Ask again about the primary occupation")-1];
				continue;
			}
			break;
		}
		return;
	}

	function ABOUT_SKILL {
		mes "[Puron]";
		mes "^FF0000Each profession can acquire special skills called skills. ^000000Skills exist to attack, heal, improve abilities, support, and many other effects.";
		next;
		mes "[Puron]";
		mes "Also, some skills can increase lvl.";
		mes "You should choose carefully which skills to learn and grow.";
		next;
		mes "[Puron]";
		mes "You can learn ^FF0000 skills by spending skill points. You get one skill point for every ^000000JobLv you raise.";
		next;
		mes "[Puron]";
		mes "Each profession has a fixed JobLv limit, and not all skills can be learned, so be careful.";
		next;
		while(1){
			mes "[Puron]";
			mes "Which profession ^FF0000 skill ^000000 do you want to hear about?";
			next;
			 switch(select("^0000FFSwordsman^000000","^0000FFMagician^000000","^0000FFAcolyte^000000","^0000FFThief^000000","^0000FFArcher^000000","^0000FFMerchant^000000","^0000FFTaekwon Kid^000000","^0000FF1st job expanded^000000", "I know about skills")){
			case 1:
				cutin "swordman_2",2;
				mes "[Puron]";
				mes "^0000FFSwordsman^000000.";
				mes "You can raise the JobLv of Swordsman, the first job, to 50.";
				mes "That means I can use 49 skill points.";
				next;
				mes "[Puron]";
				mes "The ^0000FFSwordsman^000000 skills I would recommend would be ^FF0000HP Resiliency Improvement^000000, ^FF0000Bash^000000, and ^0000FFProboc^000000.";
				next;
				cutin "swordman_provork",2;
				mes "[Puron]";
				mes "^0000FFHP resilience improvement^000000 is an important skill for Swordsman, who is primarily a melee fighter.";
				mes "^0000FFProvork^000000 is a skill that excites the specified enemy and lowers his defense.";
				mes "It is a powerful skill, though it increases the attack power of excited enemies.";
				next;
				cutin "swordman_bash",2;
				mes "[Puron]";
				mes "^0000FF bash ^000000 is a skill that deals a powerful blow to monsters.";
				mes "By defeating the monster quickly, you can also reduce the damage you take.";
				mes "I can't count the number of Swordsman who have this skill at lvl 10.";
				next;
				mes "[Puron]";
				mes "There are also some auxiliary skills that are a little more difficult to use, but allow you to move and attack even if you are attacked, such as ^0000FF Inured ^000000.";
				mes "These skills are mainly useful when fighting in a party.";
				next;
				cutin "swordman_bash",255;
				break;
			case 2:
				cutin "magician_2",2;
				mes "[Puron]";
				mes "^0000FFMagician^000000, right?";
				mes "The first job, magician, can raise JobLv to 50.";
				mes "That means I can use 49 skill points.";
				next;
				mes "[Puron]";
				mes "The recommended skills for ^0000FFMagician^000000 are ^FF0000 Firewall^000000, ^FF0000 Firebolt^000000, ^FF0000 Coldbolt^000000, and ^FF0000 Lightningbolt^000000. It's going to be the various bolting systems of 00000000.";
				next;
				cutin "magician_firewall",2;
				mes "[Puron]";
				mes "^FF0000 firewall^000000 is a very important skill for Magician.";
				mes "It is a favorite of many Magicians.";
				mes "Magicians with poor HP and defenses can't afford to let enemies get close to them.";
				next;
				cutin "magician_coldbolt",2;
				mes "[Puron]";
				mes "The ^FF0000 Firebolt^000000, ^FF0000 Coldbolt^000000, and ^FF0000 Lightningbolt^000000 are the basic magic of Magician.";
				next;
				mes "[Puron]";
				mes "At a low level, you should set one of these ^0000FF3 types to lvl 4 or higher^000000, and try to fight by targeting your opponent's weak points (attributes).";
				next;
				mes "[Puron]";
				mes "There are also attack magic such as Soul Strike, which has a fast chant.";
				mes "It's less powerful, but it's useful when you want to do instant damage.";
				next;
				mes "[Puron]";
				mes "If the Dex of the status is not raised, this skill will compensate for the slow chanting speed.";
				next;
				cutin "swordman_bash",255;
				break;
			case 3:
				cutin "acolyte_2",2;
				mes "[Puron]";
				mes "^0000FFAcolyte^000000.";
				mes "You can raise the JobLv of Acolyte, the first job, to 50.";
				mes "That means I can use 49 skill points.";
				next;
				mes "[Puron]";
				mes "I would recommend ^0000FFAcolyte^000000 skills for ^0000FFAcolyte^000000 would be ^FF0000 Healing^000000 and ^FF0000 Blessing^000000.";
				mes "Acolyte is a profession with a very large number of skills compared to other professions.";
				mes "You have to be very careful when learning skills.";
				next;
				mes "[Puron]";
				mes "^FF0000 heal^000000 is Acolyte's basic recovery skill.";
				mes "It can also be used against other adventurers, so it should be able to help a lot of adventurers.";
				next;
				cutin "acolyte_blessing",2;
				mes "[Puron]";
				mes "^FF0000 Blessing^000000 is a skill that temporarily increases stats such as DEX, INT, and STR, which are the basis of attacks.";
				mes "It can also heal abnormalities such as curses and petrification.";
				next;
				mes "[Puron]";
				mes "It's also a very complete skill, such as being able to inflict curse effects on monster attributes such as undead and demon types.";
				mes "I can't count the number of adventurers in Acolyte who have Blessing at lvl 10.";
				next;
				cutin "acolyte_holylight",2;
				mes "[Puron]";
				mes "There are not only auxiliary magic skills, but also offensive magic skills that can be acquired through quests, such as Holy Light.";
				next;
				mes "[Puron]";
				mes "Holy Light is not only the main attack skill, but it can also be used to distract the enemy, so it is a skill that you should definitely learn.";
				next;
				cutin "acolyte_holylight",255;
				break;
			case 4:
				cutin "thief_2",2;
				mes "[Puron]";
				mes "^0000FFThief^000000, right?";
				mes "The first job, Thief, can raise JobLv to 50.";
				mes "That means I can use 49 skill points.";
				next;
				mes "[Puron]";
				mes "The recommended skills for ^0000FFThief^000000 are ^FF0000 Invenum^000000 and ^FF0000 Evasion Rate Increase^000000.";
				next;
				cutin "thief_envenom",2;
				mes "[Puron]";
				mes "^FF0000 Invenom^000000 is a skill that puts the enemy in a poisoned state and gradually reduces their HP.";
				mes "It's a very effective skill, although some enemies are easy to poison and some are hard to poison.";
				next;
				mes "[Puron]";
				mes "^FF0000Increased Evasion^000000 is a skill that compensates for Thief's quickness and can increase the probability of evading attacks from enemies.";
				next;
				cutin "thief_steal",2;
				mes "[Puron]";
				mes "You also have a skill that allows you to steal items from Thief-like enemies, such as steal.";
				mes "The higher the skill level and Dex, the higher the success rate.";
				next;
				cutin "thief_steal",255;
				break;
			case 5:
				cutin "archer_2",2;
				mes "[Puron]";
				mes "^0000FFArcher^000000, right?";
				mes "You can raise the JobLv of Archer, the first job, to 50.";
				mes "That means I can use 49 skill points.";
				next;
				mes "[Puron]";
				mes "I recommend ^0000FFArcher^000000 skills for ^FF0000 Double Strafing^000000 and ^FF0000 Charge Arrow^000000.";
				next;
				cutin "archer_doublestraf",2;
				mes "[Puron]";
				mes "^FF0000Double Strafing^000000 is a skill that lets you launch two arrows at the same time and do a lot of damage.";
				mes "It will be a mainstay skill for many Archer adventurers at lvl 10.";
				next;
				mes "[Puron]";
				mes "^FF0000 Charge Arrow ^000000 is a skill that allows you to attack your enemies with an attack that blows them away.";
				mes "This skill can be acquired through quests.";
				next;
				mes "[Puron]";
				mes "Charge Arrow will be a skill that often works well when you have a ^0000FF party^000000, which can blow away enemies attacking your friends in a big way.";
				next;
				cutin "archer_arrowshower",2;
				mes "[Puron]";
				mes "Then there is a ranged attack called Arrowshower, although it is difficult to handle.";
				mes "This skill is a special move that attacks by launching a large number of arrows at a specified range.";
				mes "This is a skill that many people learn from lvl 1 to lvl 5.";
				next;
				cutin "archer_arrowshower",255;
				break;
			case 6:
				cutin "merchant_2",2;
				mes "[Puron]";
				mes "^0000FFMerchant^000000, right?";
				mes "The first job, Merchant, can raise JobLv to 50.";
				mes "That means I can use 49 skill points.";
				next;
				mes "[Puron]";
				mes "The recommended skills for ^0000FFMerchant^000000 are ^FF0000 Pushcart^000000 and ^FF0000 Opening a stall^000000.";
				next;
				mes "[Puron]";
				mes "^FF0000Pushcart^000000 is a very important skill for ^FF00FFMerchant^000000.";
				mes "This skill is what allows you to have a cart to hold a large amount of luggage.";
				next;
				mes "[Puron]";
				mes "But while the lvl of this skill is low, you will decrease your movement speed when you have a cart.";
				mes "By increasing the pushcart skill, you can restore your movement speed to normal, even if you have a cart.";
				next;
				mes "[Puron]";
				mes "^FF0000 Opening a stall ^000000 is a skill that allows you to sell items you acquire at a price of your choice.";
				mes "This is useful when you can buy a large amount of items for money, or when you are patiently waiting for adventurers to trade with you.";
				next;
				mes "[Puron]";
				mes "Also ^0000FFMerchant^000000 can learn powerful skills such as ^FF0000 Memer Knight^000000 and ^FF0000 Cart Revolution^000000.";
				next;
				cutin "merchant_mammonite",2;
				mes "[Puron]";
				mes "^FF0000 Memmer Knight^000000 can spend Zeny and do a lot of damage.";
				mes "An important skill for Merchant.";
				mes "It consumes Zeny, so you lose money every battle, but it is a skill that is useful for taking down enemies all at once.";
				next;
				cutin "merchant_cartrevol",2;
				mes "[Puron]";
				mes "^FF0000 Cart Revolution^000000 is a ranged attack skill that uses carts to attack.";
				mes "It's going to be the skill that supports Merchant's combat, as the more you increase the weight of your cart, the more powerful your attacks will be.";
				next;
				mes "[Puron]";
				mes "^FF0000 Cart Revolution^000000 is a skill that can be acquired through quests.";
				next;
				cutin "merchant_cartrevol",255;
				break;
			case 7:
				cutin "taekwonkid_2",2;
				mes "[Puron]";
				mes "You must be Taekwon Kid.";
				mes "As a primary job, Taekwon Kid can raise JobLv to 50.";
				mes "That means I can use 49 skill points.";
				next;
				mes "[Puron]";
				mes "I recommend ^0000FFTaekwon Kid^000000 skills for ^FF0000 Tairigi^000000 and ^FF0000Tioapchagi^000000.";
				NEXT;
				cutin "taekwon_sprint",2;
				mes "[Puron]";
				mes "^FF0000 Tailigi^000000 is the skill of running quickly and straight.";
				mes "When this skill reaches lvl 7 or higher, if you stop immediately after using it, you will be in a spurt state where your Str will increase for a certain amount of time.";
				mes "This skill is the basis of Taekwon Kid.";
				next;
				cutin "taekwon_flyingkick",2;
				mes "[Puron]";
				mes "^FF0000Tioapchagi^000000 is a flying kick skill that attacks distant enemies by approaching them at once.";
				mes "I can also make it do a lot of damage by attacking in succession.";
				next;
				mes "[Puron]";
				mes "Also, I guess we shouldn't forget the aptchaorrigi, which catches the enemy without letting them get away.";
				mes "It should be very good against a single enemy.";
				next;
				cutin "taekwon_flyingkick",255;
				break;
			default:
				mes "[Puron]";
				mes "It's about 1st job expanded.";
				mes "What is the occupation you want to ask about skills?";
				next;
				switch(select("^0000FFGunslinger^000000","^0000FFNinja^000000","^0000FFSupernovice^000000", "Ask about other professions")){
				case 1:
					cutin "gunslinger",2;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000, right?";
					mes "The ^0000FFGunslinger^000000, which is 1st job expanded, can raise JobLv to 70.";
					mes "That means I can use 69 skill points.";
					next;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000 will have to carefully choose which of the five different guns he will use to fight as his mainstay and which skills he will learn.";
					next;
					mes "[Puron]";
					mes "In the course, I will explain the basic ^FF0000handgun^000000 and the ^FF0000shotgun^000000 skills, which have high one-shot power.";
					next;
					cutin "gunslinger_despera.bmp",2;
					mes "[Puron]";
					mes "You'll need ^FF0000 despera^000000 for the ^0000FF handgun^000000.";
					mes "It's a skill that shoots a barrage of bullets around you.";
					next;
					mes "[Puron]";
					mes "If you choose ^0000FF Handgun^000000 as your mainstay, ^FF0000 Single Action^000000 and ^FF0000 Snake Eye^000000 that can increase your hit power will be important.";
					NEXT;
					cutin "gunslinger_fullbus",2;
					mes "[Puron]";
					mes "The charm of the ^0000FF shotgun^000000 will still be the ^FF0000 full buster^000000.";
					mes "It can fire bullets all at once and do intense damage.";
					mes "However, it drains a lot of SP, so I think you'll need a recovery-type measure.";
					next;
					cutin "gunslinger_fullbus",255;
					break;
				case 2:
					cutin "ninja",2;
					mes "[Puron]";
					mes "^0000FFNinja^000000.";
					mes "The 1st job expanded, ^0000FFNinja^000000, can raise JobLv to 70.";
					mes "That means I can use 69 skill points.";
					next;
					mes "[Puron]";
					mes "There are three major types of skills for ^0000FFNinja^000000: ^FF0000 throwing ^000000, ^FF0000 body art ^000000 and ^FF0000 ninjutsu ^000000, and which skill you take will depend on how you grow.";
					next;
					cutin "ninja_throwshurike",2;
					mes "[Puron]";
					mes "If you are going to choose the ^0000FF throwing system^000000, the ^FF0000 shuriken throwing^000000 skill will be your main means of attack.";
					next;
					mes "[Puron]";
					mes "If you are going to choose the ^0000FF body art system^000000, you will be able to use the useful evasion skills ^FF0000 Kuusemi^000000 and ^FF0000 Shadow Disposition^000000.";
					mes "The body art system has a powerful attack skill called Issen, but it also has many weaknesses.";
					mes "You will need patience to master it.";
					next;
					cutin "ninja_dragonfirefo",2;
					mes "[Puron]";
					mes "If you are going to select ^0000FF ninjutsu^000000, ^FF0000 ice flash spear and dragonfirefo^000000 are easy to handle.";
					mes "^0000FF Ice Flash Spear^000000 is a water-based attack skill that causes ice spears to appear from the ground and attack the enemy.";
					next;
					mes "[Puron]";
					mes "^0000FF Dragon Flame Formation^000000 is a ranged attack that specifies a target and attacks it.";
					mes "It is a very useful ninjutsu if you want to make a preemptive attack.";
					next;
					cutin "ninja_dragonfirefo",255;
					break;
				case 3:
					cutin "super_novice",2;
					mes "[Puron]";
					mes "^0000FFSupernovice^000000.";
					mes "The 1st job expanded, ^0000FFSupernovice^000000, can raise JobLv to 99.";
					mes "That means you can use 98 skill points.";
					next;
					mes "[Puron]";
					mes "^0000FFSupernovice^000000 is a profession that can learn other primary skills.";
					mes "It seems that many adventurers use ^0000FFHeal^000000, ^0000FFBash^000000, ^0000FFMemerKnight^000000, etc.";
					next;
					cutin "supernovice_firebo",2;
					mes "[Puron]";
					mes "Also, if you want to become a Supernovice who fights mainly with magic, it is better to use ^0000FF Firewall^000000, ^0000FF Firebolt^000000, and so on.";
					next;
					cutin "supernovice_heal",2;
					mes "[Puron]";
					mes "^0000FF heal^000000 is a restorative magic that can also be used in Supernovice.";
					mes "If you're fighting non-magic, you'll probably have to choose between Bash and Memar Knight.";
					next;
					mes "[Puron]";
					mes "Supernovice is also a profession where you can learn so many passive skills.";
					next;
					cutin "supernovice_heal",255;
					break;
				default:
					continue;
				}
			}
			mes "[Puron]";
			mes "Would you like to hear about my other occupational skills?";
			next;
			if(select("Ask about the skills of other professions", "I know about the skills")==2) break;
		}
		return;
	}

	function ABOUT_STATUS {
		while(1){
			mes "[Puron]";
			mes "What status description do you want to hear?";
			next;
			switch(select("Ask about information in status","^0000FFSwordsman^000000","^0000FFMagician^000000","^0000FFAcolyte^000000","^0000FFThief^000000 ","^0000FFArcher^000000","^0000FFMerchant^000000","^0000FFTaekwon Kid^000000","^0000FF1st job expanded^000000", "I know about the status")){
			case 1:
				mes "[Puron]";
				mes "It's about ^0000FF status^000000.";
				mes "First, let's display the Status window from the basic information in the upper left corner of the screen.";
				mes " -The shortcut is \"Alt+A\" -";
				next;
				mes "[Puron]";
				mes "The ^0000FF Status^000000 consists of Strength (Str), Speed (Agi), Strength (Vit), Intelligence (Int), Skill (Dex), and Luck (Luk).";
				next;
				mes "[Puron]";
				mes "^FF0000Str^000000 is directly related to the Atk of attack power and the maximum weight an item can carry.";
				mes "However, for professions that use bows and guns, the Dex value is the attack power.";
				next;
				mes "[Puron]";
				mes "^FF0000Agi^000000 is related to the Flee of avoiding attacks and the speed Aspd of attacks.";
				next;
				mes "[Puron]";
				mes "^FF0000Vit^000000 is related to the maximum HP, the amount of HP recovered at regular intervals, and the reduction of damage received.";
				next;
				mes "[Puron]";
				mes "^FF0000Int^000000 is related to your max SP, SP recovery, Matk, and Mdef.";
				mes "Matk is magic attack power and Mdef is magic defense power.";
				mes "It is important if you use a lot of skills and magic.";
				next;
				mes "[Puron]";
				mes "^FF0000Dex^000000 will greatly affect your Hit and Aspd to hit.";
				mes "It also has some effect on attack power.";
				mes "As for attack power, you can raise the minimum damage.";
				next;
				mes "[Puron]";
				mes "Also, with weapons like ^FF0000 bows and guns, you increase their attack power by Dex. Note that ^000000 bows and guns do not change their attack power with Str.";
				next;
				mes "[Puron]";
				mes "^FF0000Luk^000000 has some effect on Critical Rate, Evasion Rate, Flee, and Attack Power.";
				next;
				mes "[Puron]";
				mes "Each status can be raised by spending ^0000FFStatusPoint^000000 that you get when your BaseLv is raised.";
				mes "^FF0000It's important to extend your profession and the areas you want to grow.";
				next;
				break;
			case 2:
				cutin "swordman_2",2;
				mes "[Puron]";
				mes "Okay, I'll tell you about the typical status of ^0000FFSwordsman^000000, but be careful, because once you assign status points, you can't get them back.";
				next;
				mes "[Puron]";
				mes "Besides, there are still many unique people in this world that I don't even know.";
				mes "Let's use status points with a clear image of your future.";
				next;
				mes "[Puron]";
				mes "I recommend Swordsman to increase ^FF0000Str^000000 to take advantage of his high attack power.";
				mes "Also, since ^FF0000HP^000000 is high, if you increase ^FF0000Vit^000000 and specialize in withstanding, you can be very active as a vanguard and shield in a party.";
				next;
				mes "[Puron]";
				mes "If you prefer to be alone rather than in a party, you can increase ^FF0000Agi^000000 rather than ^FF0000Vit^000000.";
				mes "Specializes in avoiding enemy attacks and can take down enemies quickly with its high attack speed.";
				next;
				mes "[Puron]";
				mes "You also need ^FF0000Int^000000 to use your skills a lot and ^FF0000Dex^000000 to make your attacks hit.";
				mes "Swordsman allocates to various stats, so be careful to balance them.";
				next;
				cutin "swordman_2",255;
				break;
			case 3:
				cutin "magician_2",2;
				mes "[Puron]";
				mes "Okay, I'll tell you about the typical status of ^0000FFMagician^000000, but be careful, because once you assign status points, you can't get them back.";
				next;
				mes "[Puron]";
				mes "Besides, there are still many unique people in this world that I don't even know.";
				mes "Let's use status points with a clear image of your future.";
				next;
				mes "[Puron]";
				mes "Since ^0000FFMagician^000000 fights mainly with magic attacks, it is good to increase ^FF0000Int^000000.";
				mes "It is also advantageous to increase ^FF0000Dex^000000 to speed up the chanting speed.";
				next;
				mes "[Puron]";
				mes "Also, since ^0000FFMagician^000000 is vulnerable to being hit, it's good to boost ^FF0000HP^000000 with a slight swing to ^FF0000Vit^000000, however, that directly affects attack ^FF0000Int^000000 and ^FF0000Dex^. Remember, you won't be able to swing status points to 00000000.";
				next;
				cutin "magician_2",255;
				break;
			case 4:
				cutin "acolyte_2",2;
				mes "[Puron]";
				mes "Okay, I'll tell you about the typical status of ^0000FFAcolyte^000000, but be careful, because once you assign status points, you can't get them back.";
				next;
				mes "[Puron]";
				mes "Besides, there are still many unique people in this world that I don't even know.";
				mes "Let's use status points with a clear image of your future.";
				next;
				mes "[Puron]";
				mes "^0000FFAcolyte^000000 still often use skills to support their friends.";
				mes "Therefore, I recommend that you increase ^FF0000Int^000000 so that you don't lose ^FF0000SP^000000.";
				next;
				mes "[Puron]";
				mes "You can also increase ^FF0000Dex^000000 to speed up the speed of skill chanting.";
				mes "If you want to take the initiative to step forward as a replacement for the vanguard and be a shield for the party, ^FF0000Vit^000000 is also useful.";
				next;
				cutin "acolyte_2",255;
				break;
			case 5:
				cutin "thief_2",2;
				mes "[Puron]";
				mes "Okay, I'll tell you about the typical status of ^0000FFThief^000000, but be careful, because once you assign status points, you can't get them back.";
				next;
				mes "[Puron]";
				mes "Besides, there are still many unique people in this world that I don't even know.";
				mes "Let's use status points with a clear image of your future.";
				next;
				mes "[Puron]";
				mes "Speaking of ^0000FFThief^000000, I recommend you to increase ^FF0000Agi^000000 to make your high evasion ability even stronger.";
				next;
				mes "[Puron]";
				mes "If you increase ^FF0000Agi^000000, your attack speed will naturally increase, so if you increase your attack power with ^FF0000Str^000000 and make your attacks hit with ^FF0000Dex^000000, you will be able to defeat enemies quickly.";
				next;
				mes "[Puron]";
				mes "Also, if you want to become an Assassin who can equip the Ka Taro weapon in the future, you might want to increase ^FF0000Luk^000000 so that you can make critical attacks more often.";
				next;
				cutin "thief_2",255;
				break;
			case 6:
				cutin "archer_2",2;
				mes "[Puron]";
				mes "Okay, I'll tell you about the typical status of ^0000FFArcher^000000, but be careful, because once you assign status points, you can't get them back.";
				next;
				mes "[Puron]";
				mes "Besides, there are still many unique people in this world that I don't even know.";
				mes "Let's use status points with a clear image of your future.";
				next;
				mes "[Puron]";
				mes "Archer's trait, bow attack will become more powerful as you increase ^FF0000Dex^000000.";
				mes "When you feel that your attack power has increased to some extent, you should increase your attack speed with ^FF0000Agi^000000.";
				next;
				mes "[Puron]";
				mes "It's also useful to increase ^FF0000Int^000000 to fire the powerful skill \"Double Strafing\" one after another.";
				next;
				mes "[Puron]";
				mes "Oh yeah, if you are willing to become a Bard or Dancer, which are the higher level jobs of Archer, and play an active role in the battle against others, it is also good to raise ^FF0000Vit^000000.";
				next;
				cutin "archer_2",255;
				break;
			case 7:
				cutin "merchant_2",2;
				mes "[Puron]";
				mes "Okay, I'll tell you about the typical status of ^0000FFMerchant^000000, but be careful, because once you assign status points, you can't get them back.";
				next;
				mes "[Puron]";
				mes "Besides, there are still many unique people in this world that I don't know either.";
				mes "Let's use status points with a clear image of your future.";
				next;
				mes "[Puron]";
				mes "Merchants can use ^FF0000Str^000000 to increase their attack power, ^FF0000Agi^000000 to avoid enemy attacks, and ^FF0000Vit^000000 to withstand enemy attacks.";
				mes "I also need some ^FF0000Dex^000000 to make my attacks hit.";
				next;
				mes "[Puron]";
				mes "If you want to become a ^FF00FFBlacksmith^000000, which is a higher level job than ^0000FFMerchant^000000 and do manufacturing, then ^FF0000Dex^000000 and ^FF0000Luk^000000 will be important.";
				next;
				mes "[Puron]";
				mes "But if you spend too many status points on ^FF0000Dex^000000 and ^FF0000Luk^000000, your stats that lead to attacks will be lower and normal combat will be harder because of it.";
				mes "Be very careful with your balance.";
				next;
				cutin "merchant_2",255;
				break;
			case 8:
				cutin "taekwonkid_2",2;
				mes "[Puron]";
				mes "Okay, I'll tell you about the typical status of ^0000FFTaekwon Kid^000000, but be careful, because once you assign status points, you can't get them back.";
				next;
				mes "[Puron]";
				mes "Besides, there are still many unique people in this world that I don't know either.";
				mes "Let's use status points with a clear image of your future.";
				next;
				mes "[Puron]";
				mes "^0000FFTaekwon Kid^000000 can use ^FF0000Str^000000 to increase attack power and ^FF0000Agi^000000 to increase attack speed.";
				mes "I also need some ^FF0000Dex^000000 to make the attack hit.";
				next;
				mes "[Puron]";
				mes "Just one thing to keep in mind.";
				mes "When you become a ^0000FFSoul Linker^000000, which is a higher position than ^0000FFTaekwon Kid^000000, the common sense you had when you were a ^0000FFTaekwon Kid^000000 doesn't apply anymore.";
				next;
				mes "[Puron]";
				mes "When you become a ^0000FFSoul Linker^000000, the skills you use will be mainly magic and support skills, so if you don't swing to ^FF0000Int^000000 from when you were a ^0000FFTaekwon Kid^000000, you will have to swing to ^FF0000SP^000000. Be careful, because it might happen that you don't have enough 00000000.";
				NEXT;
				cutin "taekwonkid_2",255;
				break;
			default:
				mes "[Puron]";
				mes "^0000FF1st job expanded^000000 about.";
				mes "What is the occupation you want to ask about status?";
				next;
				switch(select("^0000FFGunslinger^000000","^0000FFNinja^000000","^0000FFSupernovice^000000", "other occupations")){
				case 1:
					cutin "gunslinger",2;
					mes "[Puron]";
					mes "Okay, I'll tell you about the typical status of ^0000FFGunslinger^000000, but be careful, because once you assign status points, you can't get them back.";
					next;
					mes "[Puron]";
					mes "Besides, there are still many unique people in this world that I don't even know.";
					mes "Let's use status points with a clear image of your future.";
					next;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000 trait, gun attacks will become more powerful the more ^FF0000Dex^000000 you raise.";
					mes "If you feel that your attack power has increased to some extent, you can also increase your attack speed with ^FF0000Agi^000000.";
					next;
					mes "[Puron]";
					mes "Also, since ^FF0000HP^000000 and ^FF0000SP^000000 are both low, it's good to increase ^FF0000Vit^000000 and ^FF0000Int^000000 to some extent.";
					next;
					mes "[Puron]";
					mes "^0000FFGunslinger^000000 has many different types of guns, and your fighting style will change depending on which one you use as your main weapon.";
					mes "Don't rush to spend status points, try using various guns first.";
					next;
					cutin "gunslinger",255;
					break;
				case 2:
					cutin "ninja",2;
					mes "[Puron]";
					mes "Okay, I'll tell you about the typical status of ^0000FFNinja^000000, but be careful, because once you assign status points, you can't get them back.";
					next;
					mes "[Puron]";
					mes "Besides, there are still many unique people in this world that I don't know either.";
					mes "Let's use status points with a clear image of your future.";
					next;
					mes "[Puron]";
					mes "^0000FFNinja^000000 is important to decide what lineage of skills you are going to take.";
					mes "Once you've decided this, you can almost see which statuses to shake as well.";
					next;
					mes "[Puron]";
					mes "For throwing and body skills, ^FF0000Str^000000, ^FF0000Dex^000000, and ^FF0000Agi^000000 are effective for attack power.";
					mes "For ninjutsu skills, ^FF0000Int^000000 and ^FF0000Dex^000000, which emphasize magic attack power and chanting speed, are effective.";
					next;
					mes "[Puron]";
					mes "Be careful, however, because once you choose either style, it's difficult to assign them both as long as you're using status points.";
					next;
					cutin "ninja",255;
					break;
				case 3:
					cutin "super_novice",2;
					mes "[Puron]";
					mes "Okay, I'll tell you about the typical status of ^0000FFSupernovice^000000, but be careful, because once you assign status points, you can't get them back.";
					next;
					mes "[Puron]";
					mes "Besides, there are still many unique people in this world that I don't even know.";
					mes "Let's use status points with a clear image of your future.";
					next;
					mes "[Puron]";
					mes "What skills will ^0000FFSupernovice^000000 take?";
					mes "Once you've decided on this, you can almost see which statuses you'd like to shake.";
					next;
					mes "[Puron]";
					mes "If you are a melee attacker, ^FF0000Str^000000, ^FF0000Dex^000000, and ^FF0000Agi^000000 are effective for attack power.";
					mes "For magic skills, ^FF0000Int^000000 and ^FF0000Dex^000000, which emphasize magic attack power and chanting speed, are effective.";
					next;
					cutin "super_novice",255;
					break;
				default:
					continue;
				}
			}
			cutin "swordman_2.bmp", 255;
			mes "[Puron]";
			mes "Do you want to ask about the status of other professions?";
			next;
			if(select("Ask about the status of other professions", "I know about the status")==2) break;
		}
		return;
	}

	function ABOUT_WEAPON {
		while(1){
			mes "[Puron]";
			mes "Each profession has its own characteristics, and different professions can handle different weapons.";
			cutin "weapon_list.bmp", 3;
			next;
			mes "[Puron]";
			mes "There are many types of weapons: daggers, one-handed swords, two-handed swords, axes, spears, blunt weapons, staffs, bows, claws, instruments, whips, books, kataro, guns, shurikens, etc.";
			next;
			mes "[Puron]";
			mes "Did you understand about weapons?";
			next;
			if(select("got it", "don't know")==1) break;
			mes "[Puron]";
			mes "Okay, I'll explain again.";
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
		mes "Oh, you're new here.";
		mes "Welcome to the Adventurer Academy!";
		mes "First, you'll have to go through the reception desk.";
		close;
	}
	set '@novice, callfunc("AC_GetNovice");
	if(AC_NOVICE_QUE >= 20 || Job!=Job_Novice){
		if(Job!=Job_Novice){
			if(AC_NOVICE_QUE) {
				mes "[Aldi]";
				mes "Glad to see you're doing well.";
				mes "You can ask me anything you want.";
				mes "What do you want to ask me?";
			} else {
				mes "[Aldi]";
				mes "You don't look familiar, but you seem like a pretty reasonable adventurer.";
				mes "Is there anything you'd like to ask me?";
			}
		} else if(AC_NOVICE_QUE == 20){
			mes "[Aldi]";
			mes "The course is finally at its end.";
			mes "Talk to ^FF0000Faye^000000Faye^000000 at the back of the room and see.";
			mes "Hmm?";
			mes "Do you still have questions for me?";
		} else if(AC_NOVICE_QUE >= 30){
			mes "[Aldi]";
			mes "Looks like you've learned everything you need to know.";
			mes "If you have any questions, I'll explain it to you again.";
			mes "Do you have any questions?";
		}
		while(1){
			next;
			switch(select("about battle", "about earning money", "about cards", "about world map", "nothing to ask")){
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
				mes "I see.";
				mes "Well then, I hope you'll be a good adventurer!";
				mes "If you have any questions, you can always come to me.";
				close2;
				cutin "world_map_001.bmp", 255;
				end;
			}
			mes "[Aldi]";
			mes "Is there anything else you want to ask?";
		}
	}

	if(!AC_NOVICE_QUE){
		mes "[Aldi]";
		mes "Oh!";
		mes "Looks like you're new here.";
		mes "I'm Aldi.";
		mes "I'm in charge of the course.";
		mes "Talk to Puron first.";
		close;
	} else if(AC_NOVICE_QUE < 10){
		mes "[Aldi]";
		mes "I need to finish Puron's training first.";
		mes "Go talk to Puron on the other side and finish Puron's training.		";
		close;
	} else if(AC_NOVICE_QUE>=10 && AC_NOVICE_QUE<20){
		switch(AC_NOVICE_QUE){
		case 10:
			mes "[Aldi]";
			mes "Looks like we're done talking about Puron.";
			mes "I'm Aldi.";
			mes "Nice to meet you.";
			mes " Now, let's talk briefly about my future growth.";
			next;
			while(1){
				mes "[Aldi]";
				mes "As an adventurer, you need a variety of experiences to grow into a full-fledged adventurer, but fortunately, the Adventurer Academy has a full range of quests to help you in combat and in your work.";
				next;
				mes "[Aldi]";
				mes "After the course, if you are able to change to the first job, it would be a good idea to gain experience at the Adventurer Academy for a while.";
				next;
				mes "[Aldi]";
				mes "I may be able to teach you if you have any questions, especially in combat or if you have trouble with money.";
				mes "If you don't understand, you can come back to me.";
				next;
				if(select("I understand", "I didn't understand")==1){
					mes "[Aldi]";
					mes "Then I'm looking forward to your growth.";
					break;
				}
				mes "[Aldi]";
				mes "Then let's talk again.";
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
			mes "Finally, let's talk a little bit about this continent.";
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
			mes "Okay, I think we've got it about this continent.";
			mes "I hope you'll be a fine adventurer!";
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
				mes "Yes, let's pass this along!";
				next;
			} else {
				mes "[Aldi]";
				mes "Have you reduced your luggage?";
				next;
				if(select("I have reduced", "I have not reduced")==2){
					mes "[Aldi]";
					mes "You're going to have to reduce your luggage or I can't give it to you.";
					close;
				}
			}
			set AC_NOVICE_QUE, 14;
			if(checkitemblank() < 2){
				mes "^FF0000<WARNING>^000000-You cannot receive items due to the number of different items in your possession-";
				mes "-Please reduce the number of items in your possession and talk to us again-";
				close;
			} else
			if(Weight>(MaxWeight/100)*90){
				mes "^FF0000<WARNING>^000000-You will not be able to receive the item due to the high weight of the item you are carrying-";
				mes "-Please reduce the number of items in your possession and then speak to me again-";
				close;
			}
			getitem 569, 100;
			getitem 611, 5;
			emotion 46,"";
			set AC_NOVICE_QUE, 15;
			mes "[Aldi]";
			mes "It's a must-have item for adventurers, an appraised item!";
			mes "This ^0000FF magnifier^000000 can appraise ^0000FF unappraised^000000 items.";
			mes "You can use it when you get an item that is unappraised.";
			mes "And I'll give you some recovery items, too.";
			next;
		case 15:
			delquest 100116;
			setquest 100120;
			set AC_NOVICE_QUE, 20;
			cutin "world_map_001.bmp", 255;
			mes "[Aldi]";
			mes "Now, listen to the last ^FF0000Faye^000000.";
			close;
		}
	}

	function HOWTO_BATTLE {
		mes "[Aldi]";
		mes "What do you want to ask me about combat?";
		next;
		switch(select("About preparing for battle", "About monsters", "About party", "Ask other things")){
		case 1:
			mes "[Aldi]";
			mes "The essentials for combat are equipment and recovery items.";
			mes "If you have any items of equipment that you are not currently equipped with, I suggest you try equipping them.";
			next;
			mes "[Aldi]";
			mes "You can check your equipped items by pressing the ^0000FFAlt+Q^000000 keys or the ^0000FF \"equip\"^000000 button in the ^0000FF \"Basic Info\"^000000 window to display the ^0000FF \"Equipped Items\"^000000 window.";
			next;
			mes "[Aldi]";
			mes "You can also check the items you have by pressing the ^0000FFAlt+E^000000 keys or the ^0000FF \"item\"^000000 button in the ^0000FF \"Basic Info\"^000000 window to display the ^0000FF \"Items You Have\"^000000 window. ";
			next;
			mes "[Aldi]";
			mes "Items can be equipped by clicking on the ^0000FF \"equip\"^000000 tab in the ^0000FF \"items in your possession\"^000000 window and double-clicking on the item you wish to equip.";
			next;
			mes "[Aldi]";
			mes "Also, don't forget to equip items in the ^0000FF \"etc\"^000000 tab.";
			next;
			mes "[Aldi]";
			mes "For professions such as Archer and Gunslinger, there are some equipment items that cannot be attacked unless equipped with long-range attack items such as ^0000FF arrows ^000000 and ^0000FF bullets ^000000.";
			next;
			mes "[Aldi]";
			mes "Equipped items that use these items need to drag and drop items for long-range attacks (arrows and bullets) to the ^0000FF \"Equipped Item Window\"^000000 and equip them together.";
			next;
			mes "[Aldi]";
			mes "Of course, you can also equip normal equipment items by dragging and dropping them to the top of the equipment window, as long as they are items that can be equipped.";
			next;
			break;
		case 2:
			mes "[Aldi]";
			mes "First let's talk about the ^0000FF monster ^000000 before we go fight in the field.";
			mes "There are various ^0000FF races, sizes and attributes^0000FF of ^0000FF monsters^000000.";
			next;
			mes "[Aldi]";
			mes "The ^FF0000 size^000000 of monsters are divided into ^0000FF small, medium and large^000000.";
			mes "The ^FF0000 attributes^000000 are divided into the following types: ^0000FF nonattribute, earth attribute, wind attribute, water attribute, fire attribute, poison attribute, ghost attribute, undead attribute, dark attribute, and holy attribute^000000.";
			next;
			mes "[Aldi]";
			mes "If you don't have any attributes in a normal direct attack, you'll be attacked with no attributes.";
			next;
			mes "[Aldi]";
			mes "This is how the ^0000FF earth, wind, water, and fire ^000000 attributes relate to each other.";
			mes "Earth is strong in wind, wind is strong in water, water is strong in fire, and fire is strong in earth.";
			cutin "attribute_main4.bmp", 2;
			next;
			mes "[Aldi]";
			mes "Also, basically, except for ^0000FF no attribute and ghost attribute ^000000, the same attribute tends to weaken the effect.";
			next;
			mes "[Aldi]";
			mes "Also, with ^0000FF poison, undead, dark, and holy^000000, poison is weaker than all other attributes, and undead and holy, dark and holy have strengths and weaknesses against each other.";
			cutin "attribute_stdk.bmp", 2;
			next;
			mes "[Aldi]";
			mes "Also, the ^0000FFghost attribute ^000000 has the characteristic of being difficult to attack with the ^0000FFnon-attribute ^000000.";
			mes "It is GHOST that is most effective against GHOST.";
			mes "Ghost against GHOST!\" You know the saying: .......";
			mes "Hmm?  Do you mean something different ......?";
			cutin "attribute_nonen.bmp", 2;
			next;
			mes "[Aldi]";
			mes "Well, if you change your weapons, armor, and skills to match the characteristics of the monster, you should be able to fight effectively.";
			next;
			break;
		case 3:
			mes "[Aldi]";
			mes "Let's talk about ^0000FF party ^000000.";
			mes "It is easier to defeat more enemies when many people fight together than when one fights alone.";
			next;
			mes "[Aldi]";
			mes "Fighting in a ^0000FF party^000000 with other adventurers also avoids the risk of losing the battle!";
			next;
			mes "[Aldi]";
			mes "A ^0000FF party^000000 can be created by typing \"^FF0000/organize party name^000000\" in the chat input field.";
			mes "You can name the party anything you want!";
			cutin "tra_pary_command.bmp", 2;
			next;
			mes "[Aldi]";
			mes "When you make a statement after typing, the ^0000FF party setting window ^0000FF appears.";
			mes "The item collection method and item distribution method can be selected.";
			cutin "tra_pary_item.bmp", 2;
			next;
			mes "[Aldi]";
			mes "As for the item collection method, it would be better to choose '^0000FF party-wide sharing^000000'.";
			mes "This setting will allow everyone in the party to immediately pick up items dropped by enemies!";
			next;
			mes "[Aldi]";
			mes "The method of distributing the items will be chosen with a certain probability of distribution, so that everyone in the party will get the items fairly, instead of the person who picked them up getting them.";
			next;
			mes "[Aldi]";
			mes "The ^0000FF party ^000000 setting also determines the experience distribution method.";
			mes "Once you have finished setting up your items, you can set up your party by means of the party window that appears with ^FF0000Alt + Z^000000.";
			cutin "tra_pary_exp.bmp", 2;
			next;
			mes "[Aldi]";
			mes "The party settings are listed to the left of the trashcan-like symbol at the bottom of the party window!";
			cutin "tra_pary_window.bmp", 2;
			next;
			mes "[Aldi]";
			mes "Be careful to distribute the experience fairly in the distribution method setting.";
			mes "^FF0000 level difference can only be set to fair within a range of +/- 15. You need to be careful because you can't do it when ^000000 level difference is far apart!";
			cutin "tra_pary_exp.bmp", 2;
			next;
			mes "[Aldi]";
			mes "When you're done setting up, let's get them to join the party we've created!";
			mes "First, bring the cursor to the other character and press right click.";
			next;
			mes "[Aldi]";
			mes "Then, in the selection menu, you will see '^0000FFXX requesting ^000000 to join the party^000000'.";
			mes "If you select it and the other party agrees to join your party, you can form a party!";
			cutin "tra_pary_exp.bmp", 255;
			next;
			mes "[Aldi]";
			mes "If you submit a request to join a party and the other party does not respond, check the conversation window to see if the other party has already joined the party.";
			next;
			mes "[Aldi]";
			mes "If they have already joined a party, the conversation window will say \"They have joined another party.\" and message will appear in the conversation window.";
			next;
			mes "[Aldi]";
			mes "If you've joined a party, you need to have ^FF0000Alt + Z^000000 check the party window that appears!";
			cutin "tra_pary_window.bmp", 2;
			next;
			mes "[Aldi]";
			mes "If you are already in the party, right-click on the name displayed in the party window and have them select '^FF0000 leave ^000000'!";
			cutin "tra_pary_window.bmp", 255;
			next;
			mes "[Aldi]";
			mes "Then you can let them join the new party you've created!";
			next;
			mes "[Aldi]";
			mes "A party can have ^FF0000 maximum of 12 ^000000 members.";
			mes "You can go to many places if you have a large number of people to face the monsters!";
			next;
			break;
		}
		return;
	}

	function HOWTO_MAKEMONEY {
		mes "[Aldi]";
		mes "What do you want to ask me about how to make money?";
		next;
		switch(select("about collectibles", "about how to get money", "about how to sell items to adventurers", "about other things")){
		case 1:
			mes "[Aldi]";
			mes "There are a variety of items that monsters drop, including consumables, equipment such as weapons and armor, and collectibles.";
			next;
			mes "[Aldi]";
			mes "Some monster collectibles are easy for even a novice adventurer to collect and can be sold for a high price.";
			mes "It's the '^FF0000 empty bottles^000000' that can be collected from Poring and Drops.";
			next;
			mes "[Aldi]";
			mes "However, this '^FF0000 empty bottles^000000' will not make much money^0000FF (Zeny)^000000 when sold to a tool shop.";
			mes "You can get a lot of money ^0000FF (Zeny)^000000 by selling it to the same adventurer. ^000000";
			next;
			break;
		case 2:
			mes "[Aldi]";
			mes "There are several ways to get money ^0000FF (Zeny) ^000000, but the source of income for many adventurers is selling the items they acquire.";
			next;
			mes "[Aldi]";
			mes "In the Adventurer Academy, in the ^0000FFClassroom Hall^000000, there are toolmakers who will buy items such as weapons, armor, and supplies, and you can sell the items you acquire there.";
			next;
			mes "[Aldi]";
			mes "Items can also be obtained by defeating monsters or by doing quests.";
			next;
			mes "[Aldi]";
			mes "However, items such as cards should not be sold at tool shops, etc., because they have various effects that can give you an advantage in battle and are very valuable items.";
			next;
			mes "[Aldi]";
			mes "If the card is not used by you, you should be able to get a lot of money ^0000FF (Zeny)^000000 by selling it ^0000FF to other adventurers.";
			next;
			break;
		case 3:
			while(1){
				mes "[Aldi]";
				mes "Then let's talk about how to sell the items we got.";
				mes "You'll often get more for your money if you sell and buy from other adventurers than you would from a store.";
				next;
				mes "[Aldi]";
				mes "There are two main ways to sell ^FF0000 items you collect to other adventurers.";
				mes "The ^0000FF stall^000000 and the ^0000FF chat room^000000.";
				next;
				mes "[Aldi]";
				mes "You need some JobLv to open ^0000FF stall^000000. Also, the professions that can use the stall are limited.";
				mes "So I'll teach you now how to trade in the chat room, which even you can do now.";
				next;
				mes "[Aldi]";
				mes "The ^0000FF chat room ^0000FF chat room ^0000FF stall ^0000FF is a feature that, unlike the ^0000FF stall ^0000FF, allows you to put up a Signboard and wait for adventurers.";
				mes "This can be used to negotiate with other adventurers in conversation when trading.";
				next;
				mes "[Aldi]";
				mes "First, you need to gather information about the price at which the item you are trying to sell is being traded.";
				next;
				mes "[Aldi]";
				mes "Hey, you don't have to be so uptight.";
				mes "It's easy to gather information.";
				mes "You can get a general idea of what to expect at the stores of adventurers who have ^0000FF stalls^000000.";
				next;
				mes "[Aldi]";
				mes "^0000FF Adventurers ^000000 during the stall ^000000 are putting out a Signboard of bags marked with a Z like this.";
				mes "Double-click^000000 on that ^FF0000Signboard^000000 to see what items the adventurer is selling!";
				cutin "tra_stall.bmp", 2;
				next;
				mes "[Aldi]";
				mes "If you look around ^0000FF stalls^000000 in this way, you should be able to get a rough idea of the market price for the items you want to sell.";
				cutin "tra_stall_price.bmp", 2;
				next;
				mes "[Aldi]";
				mes "If you just can't find it, or you just can't figure out the price, you might want to ask a nearby adventurer, although it takes a bit of courage.";
				next;
				mes "[Aldi]";
				mes "Just don't ask too easily.";
				mes "Make the effort to find out for yourself first.";
				mes "Remember that asking people is a last resort.";
				next;
				cutin "tra_choom_create.bmp", 2;
				mes "[Aldi]";
				mes "Once you have a general idea of the market price of the item you want to sell, the chat room comes into play.";
				mes "You can create a chat room by pressing ^FF0000Alt+ C^000000.";
				next;
				mes "[Aldi]";
				mes "^FF0000Write the name and price of the item you want to sell in the Title field and press the OK button. ^000000For example, if you want to sell 10 empty bottles, you can write like this.";
				next;
				mes "[Aldi]";
				mes "Let's talk about the contents of the Title field.";
				mes "'^0000FF sale^000000' means sell.";
				mes "Next ^0000FF the name of the item you want to sell^000000, and at this time it would be kind if you wrote the price.";
				mes "'^FF0000z^000000' means Zeny, or money.";
				next;
				mes "[Aldi]";
				mes "Put the number of pieces at the end for clarity.";
				mes "Many adventurers add '^0000FF@^000000' to indicate the number of items they want to sell.";
				mes "Putting '^0000FF@^000000' before the number of pieces will make it easier to understand.";
				next;
				mes "[Aldi]";
				mes "^0000FFLimit^000000 is the number of people that can be in the chat room.";
				mes "It would be better if you set ^FF00002^000000 names, since the number includes yourself.";
				next;
				mes "[Aldi]";
				mes "If you don't get the chat room creation window, you can also use the ^000000comm^000000 button in the ^0000FF Basic Info Window^000000.";
				next;
				cutin "tra_chatroom_enter.bmp", 2;
				mes "[Aldi]";
				mes "Let's wait a while and see if any adventurers come in and say hello.";
				mes "You might want to check with them first about the number of deals and wrap up negotiations.";
				next;
				mes "[Aldi]";
				mes "People can't hear you talking in the chat room, so it won't bother you if you talk a lot.";
				mes "Once the negotiations are settled, we'll close the chat room.";
				next;
				mes "[Aldi]";
				mes "The chat room can be closed by left-clicking on '^0000FF x ^000000' in the upper right corner of the window or by saying '^0000FF/q^000000'.";
				next;
				mes "[Aldi]";
				mes "Once the window is closed, let's do the deal.";
				mes "Use the trade window to exchange Zeny for items.";
				cutin "tra_tradewindow.bmp", 2;
				next;
				mes "[Aldi]";
				mes "The trade window is the menu that comes up when you right-click on the other person and select '^0000FFXXX request a deal^000000'.";
				mes "XXX is ^FF0000 the name of the other party^000000.";
				next;
				mes "[Aldi]";
				mes "If the other party accepts the deal, the trade window will appear.";
				mes "Make sure the other party's name appears to the right of ^0000FFTrade:. We can't give ^000000 to the wrong person.";
				next;
				mes "[Aldi]";
				mes "If you bring the item to this window, you can put it in the trade window.";
				mes "The item window is ^FF0000Alt+ E^000000.";
				next;
				mes "[Aldi]";
				mes "If the transaction is correct, press '^0000FFOK^000000'.";
				mes "If the deal partner presses '^0000FFOK^000000', the center '^0000FFTrade^000000' can be pressed.";
				mes "Finally, press '^0000FFTrade^000000' and the deal is done!";
				next;
				cutin "tra_tradewindow.bmp", 255;
				mes "[Aldi]";
				mes "Have you figured out how to buy and sell items between adventurers?";
				mes "If you don't understand, I'll tell you again, what do you want to do?";
				next;
				if(select("I understood, so it's ok", "I didn't understand")==1) break;
				mes "[Aldi]";
				mes "Then let's talk again.";
				next;
			}
			break;
		}
		return;
	}

	function ABOUT_CARD {
		while(1){
			mes "[Aldi]";
			mes "Let's talk about rare and valuable items and cards!";
			next;
			mes "[Aldi]";
			mes "Some collectibles are rare and valuable.";
			mes "That's the ^FF0000 card^000000 that monsters drop.";
			mes "Depending on the type of monster, some cards have tremendously high prices!";
			next;
			mes "[Aldi]";
			mes "The ^0000FF card^000000 is used by attaching it to equipment with a ^0000FF slot^000000.";
			mes "^FF0000Once attached, the card cannot be removed. ^000000";
			next;
			mes "[Aldi]";
			mes "^FF0000The card ^000000 has special effects and you can attach its effects to your equipment, making it very powerful!";
			next;
			mes "[Aldi]";
			mes "For equipment ^0000FF slotted ^000000, right click on the equipment and a square frame will appear below the description.";
			mes "You can attach a card to each of these square frames.";
			cutin "tra_slot_weapon.bmp", 2;
			next;
			mes "[Aldi]";
			mes "Also, equipment items that can be collected from monsters may have more slots than equipment items sold in stores, even if they have the same name!";
			next;
			mes "[Aldi]";
			mes "Equipment with a large number of slots like that is often traded for a high price among adventurers.";
			mes "You should check the value of your equipment before selling it to a store to make a deal.";
			next;
			mes "[Aldi]";
			mes "Did you figure out about the cards?";
			cutin "tra_slot_weapon.bmp", 255;
			next;
			if(select("I got it, so it's ok", "I didn't get it")==1) break;
			mes "[Aldi]";
			mes "Then let's talk again.";
			next;
		}
		return;
	}

	function ABOUT_WORLDMAP {
		while(1){
			mes "[Aldi]";
			mes "Let's look at a world map with the MidoGordo continent.";
			mes "This is the ^0000FFMidoGordo continent^000000 where the Kingdom of Rune-Midgarts and other major countries are adjacent.";
			cutin "world_map_001.bmp", 3;
			next;
			mes "[Aldi]";
			mes "I'll tell you a useful feature regarding the world map.";
			mes "^0000FFAlt+. (dot)^000000 to display the world map.";
			cutin "jp_quest_help06.bmp", 2;
			next;
			mes "[Aldi]";
			mes "In the world map, you can see ^0000FF your position ^000000 and ";
			cutin "jp_quest_help07.bmp", 2;
			next;
			mes "[Aldi]";
			mes "On the world map, you can see ^0000FF your position ^0000FF and the positions of ^0000FF party members ^0000FF.";
			cutin "jp_quest_help08.bmp", 2;
			next;
			mes "[Aldi]";
			mes "In this screen, you can check what kind of location by moving the ^0000FF mouse cursor ^000000.";
			cutin "jp_quest_help09.bmp", 2;
			next;
			mes "[Aldi]";
			mes "Ehh, cohonk.";
			mes "You won't see ^0000FF Adventurer Academy^0000FF on this ^0000FF world map^0000FF.";
			mes "The Adventurer Academy is in a secret location.";
			cutin "jp_quest_help09.bmp", 255;
			next;
			mes "[Aldi]";
			mes "You can get transferred to the ^0000FF Adventurers Academy ^000000 from ^0000FFProntera, Izlude, Alberta, Payon, Morroc^000000 in the Kingdom of Rune-Midgarts.";
			next;
			mes "[Aldi]";
			mes "Now, do you remember?";
			mes "The world map displays ^0000FFAlt+. (dot)^000000.";
			mes "If you don't understand, I'll tell you again, what do you want?";
			cutin "jp_quest_help06.bmp", 2;
			next;
			if(select("got it", "didn't get it")==1) break;
			mes "[Aldi]";
			mes "Then let's talk again.";
			next;
		}
		cutin "jp_quest_help06.bmp", 255;
		return;
	}
}

//Faye
ac_cl_room.gat,44,65,4	script	Faye#ac_room	828,6,6,{
	if(AC_PASSPORT<2){
		mes "[Faye]";
		mes "Hmm?";
		mes "Looks like a prospective student.";
		mes "You can enroll if you register there, you know.";
		mes "Welcome to the Adventurer Academy.";
		close;
	}
	function ABOUT_JOB;
	function GIVE_BOOK;
	set '@novice, callfunc("AC_GetNovice");
	
	if(Job!=Job_Novice){
		if(AC_NOVICE_QUE){
			if('@novice) {
				if(AC_NOVICE_QUE>30){
					mes "[Faye]";
					mes "Yo!";
					mes "Have you been helping ^0000FFLune work ^000000 lately?";
					mes "Well, if you have any questions about the second job, just ask me.";
				} else {
					mes "[Faye]";
					mes "Yo!";
					mes "You're looking good.";
					mes "Did you want to ask me again about the second job?";
				}
			} else {
				mes "[Faye]";
				mes "If you want to hear about the second job again, I'll explain it to you.";
				mes "Do you want to hear about the second job?";
			}
		} else {
			mes "[Faye]";
			mes "You don't look like much, but I sense something special about you.";
			mes "What can I ask you?";
		}
		next;
		if(AC_NOVICE_QUE>30){
			set '@sel, select("Ask about 2nd job", "Ask about Lune job", "Nothing to ask");
		} else {
			set '@sel, select("Ask about the second job", "Nothing to ask");
			if('@sel==2) set '@sel,3;
		}
		switch('@sel){
		case 1:
			ABOUT_JOB;
		case 3:
			mes "[Faye]";
			mes "Well, if you want to know more, you can always come back and ask me.";
			mes "I'll be happy to talk to you.";
			close;
		case 2:
			mes "[Faye]";
			mes "Okay!";
			mes "You mean ^FF0000Lune^000000.";
			mes "Lune is looking for someone to help him with his work.";
			mes "A solid adventurer like you should be able to help.";
			next;
			mes "[Faye]";
			mes "When you leave this room, talk to the ^0000FF pink-haired Woman^000000.";
			mes "She should be able to help you grow.";
			close;
		}
	}
	if(AC_NOVICE_QUE<10){
		mes "[Faye]";
		mes "Looks like you've completed enrollment.";
		mes "First, you need to talk to ^0000FFPuron^000000 there.";
		close;
	}
	if(AC_NOVICE_QUE<20){
		mes "[Faye]";
		mes "Looks like you've finished your Puron training.";
		mes "Next, ^0000FFAldi^000000 is going to give you some useful information.";
		close;
	}
	if(AC_NOVICE_QUE<30){
		mes "[Faye]";
		mes "Looks like Aldi's training is over!";
		mes "You're almost ready for your new job.";
		mes "Now all you need to do is to be ready and you'll be able to change jobs.";
		next;
		mes "[Faye]";
		mes "Have you decided what profession you want to change to?";
		next;
		switch(select("I've decided which occupation to change", "I'll ask about higher level jobs")){
		case 1:
			mes "[Faye]";
			mes "Looks like you've already decided what profession you're going to change to.";
			break;
		case 2:
			ABOUT_JOB;
			mes "[Faye]";
			mes "Okay, that's the last of the training.";
		}
		if(AC_NOVICE_QUE<21){
			if (JobLevel<10 || BaseLevel<10) {
				mes "Let's celebrate!";
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
			mes "[Faye]";
			mes "I'll give you this last one!";
			next;
		} else {
			mes "[Faye]";
			mes "Have you reduced your luggage?";
			next;
			if(select("I have reduced", "I have not reduced")==2){
				mes "[Faye]";
				mes "I can't give it to you if you don't reduce your luggage, man.";
				close;
			}
		}
		set AC_NOVICE_QUE, 22;
		if(checkitemblank() < 2){
			mes "^FF0000<WARNING>^000000-You cannot receive items due to the number of different items in your possession-";
			mes "-Please reduce the number of items in your possession and talk to us again-";
			close;
		} else
		if(Weight>(MaxWeight/100)*90){
			mes "^FF0000<WARNING>^000000-You will not be able to receive the item due to the high weight of the item you are carrying-";
			mes "-Please reduce the number of items in your possession and then speak to me again-";
			close;
		}
		set AC_NOVICE_QUE, 23;
		getitem 569, 150;
		getitem 602, 3;
		emotion 46,"";
		mes "[Faye]";
		mes "It's a warp item, a necessity for adventurers!";
		mes "This ^0000FF butterfly wing ^0000FF can instantly warp to the ^0000FF location where you saved ^0000FF.";
		mes "With this, you can rest easy even if you wander into dangerous places.";
		mes "I'll give you some recovery items too.";
		next;
		mes "[Faye]";
		mes "I've saved ^0000FF location ^000000 in the Adventurer's Academy now, so if you get lost, use ^FF0000 butterfly wings ^000000 to come back.";
		next;
		chgquest 100120,201045;
	} else {
		if(Job==Job_Novice){
			if(CHANGE_TK || CHANGE_SNV){
				EMOTION 21;
				mes "[Faye]";
				mes "Whoa!";
				mes "Looks like you're doing a great job changing jobs.";
				mes "If you want to raise your BaseLv, I'll talk to you again, hear?";
				next;
				set '@sel, select("I want to raise my BaseLv", "I want to change my 1st job", "Ask about my 2nd job", "I want a basic book", "Nothing to ask");
			} else
			if(CHANGE_GS || CHANGE_NJ){
				EMOTION 21;
				mes "[Faye]";
				mes "Whoa!";
				mes "Looks like you're doing a great job changing jobs.";
				mes "If you go to another city, I'll talk to you again, hear?";
				next;
				set '@sel, select("Ask about transfer service", "I want to change my 1st job", "Ask about 2nd job", "I want a basic book", "Nothing to ask");
			} else {
				mes "[Faye]";
				mes "If you want to change to the first job, I'll explain it to you again, do you want to hear it?";
				next;
				set '@sel, select("I want to change to the first job", "Ask about the second job", "I want the basic book", "Nothing to ask")+1;
			}
		} else {
			mes "[Faye]";
			mes "If you want to ask me again about the second job, I'll explain it to you.";
			mes "Do you want to hear about the second job?";
			next;
			set '@sel, select("Ask about the second job", "I want the basic book", "Don't ask")+2;
		}
		switch('@sel){
		case 1:
			if(CHANGE_TK || CHANGE_SNV){
				mes "[Faye]";
				mes "Okay!";
				mes "You want to raise your BaseLv.";
				mes "If you want to grow, you need to get some real competition.";
				next;
				mes "[Faye]";
				mes "You should go to the Practice Room or a special room in the Adventurer's Academy and take a look.";
				next;
				mes "[Faye]";
				mes "The Practice Room is in the upper left after you leave this training room.";
				close;
			} else {
				mes "[Faye]";
				mes "Okay!";
				mes "You mean the transfer service.";
				mes "That's what Taro does.";
				next;
				mes "[Faye]";
				mes "If you're going to another city, look for the red-haired ^0000FFTaro^000000 who is ^0000FF \"forwarding service\" ^000000.";
				next;
				mes "[Faye]";
				mes "Taro should be found after you leave this training room and go to the upper left.";
				close;
			}
		case 2:
			break;
		case 4:
			if(!checkweight(11055,1)){
				mes "[Faye]";
				mes "Huh?";
				mes "Looks like you have a lot of baggage.";
				mes "Go ahead and reduce the number of types of luggage a little more.";
				//setquest 100097; //not yet implemented in this mackerel mes Sage
				next;
				mes "[Faye]";
				mes "Warehouses are available at Kafra Service, just outside this room.";
				mes "You can leave your belongings there.";
				close;
			}
			GIVE_BOOK;
			close;
		case 3:
			ABOUT_JOB;
		case 5:
			mes "[Faye]";
			mes "Well, if you want to know more, you can always come back and ask me.";
			mes "I'll be happy to talk to you.";
			close;
		}
	}
	mes "[Faye]";
	mes "First, you need to prepare before you change jobs.";
	mes "If you have grown ^0000FF \"Basic Skills\" to level 9 ^000000, you can change your first job.";
	mes "Do exactly what I tell you to do.";
	next;
	mes "[Faye]";
	mes "The level of ^0000FF \"Basic Skills\"^000000 is determined by clicking the ^0000FF \"Skill\"^000000 button in the ^0000FF \"Basic Information\"^000000 window, displaying the ^0000FF \"Skill List\"^000000, and then clicking the ^0000FF \"Skill Points\"^000000. It can be raised by assigning 00000000.";
	next;
	mes "[Faye]";
	mes "Don't forget, to raise the level of a skill, you need to press the ^000000^FF0000 \"confirm\" ^000000 button at the bottom right of the ^0000FF skill list window to confirm it after assigning the skill points.";
	next;
	mes "[Faye]";
	mes "Okay.";
	mes "To change to the first job, you need to ^0000FF \"Basic Skills\" to level 9 ^000000.";
	next;
	mes "[Faye]";
	mes "If you have an occupation in mind, I'll tell you where to change jobs.";
	mes "What do you want to do?";
	next;
	set '@sel,select("Ask where I'm going to change jobs", "Prepare for a new job", "Not decided yet");
	if(AC_NOVICE_QUE<30){
		mes "[Faye]";
		mes "Oh, yeah.";
		mes "I'll have to pass this along.";
		next;
		GIVE_BOOK;
		set AC_NOVICE_QUE, 30;
		mes "[Faye]";
		mes "So much for the book.";
		next;
	}
	switch('@sel){
	case 2:
		mes "[Faye]";
		mes "If you grow ^0000FF \"Basic Skills\" to level 9 ^000000, Swordsman, Magician, Acolyte, Thief, Archer, and Merchant can change jobs quickly.";
		next;
		mes "[Faye]";
		mes "If you want to change jobs to the first level, I'll send you back to me and you can come back.";
		close2;
		cutin "start_020_jp.bmp", 4;
		setquest 100124; //state=1
		end;
	case 3:
		mes "If you haven't decided on a career change yet, why don't you try helping out at the Adventurer Academy?";
		mes "I think Lune is looking for someone to do the job.";
		next;
		mes "[Faye]";
		mes "Lune would be in the ^0000FF classroom building, 1F^000000, just outside this room, so you can talk to him.";
		next;
		mes "[Faye]";
		mes "If you want to change your job to the first level, I'll send you there and you can come back.";
		close2;
		setquest 100124;
		setquest 100128;
		end;
	}
	mes "[Faye]";
	mes "Which profession are you going to be?";
	next;
	set '@sel,select("Swordsman^FF0000 (for beginners)^000000", "Magician^0000FF (for intermediate)^000000", "Acolyte^0000FF (for intermediate)^000000", "Thief^FF0000 (for beginners) (for beginners)^000000", "Archer^FF0000 (for beginners)^000000", "Merchant^000000 (for experts)^000000", "Taekwon Kid^0000FF (for intermediate)^000000", "Gunslinger^000000 (for experts) (Suitable for advanced users)^000000", "Ninja^000000 (Suitable for advanced users)^000000", "Supernovice^000000 (Suitable for advanced users)^000000");
	switch('@sel){
	case 1:
		mes "[Faye]";
		mes "If ^0000FFSwordsman^000000, it's Izlude.";
		mes "There is a ^FF0000swordsman's guild^000000 to the west^000000 of ^FF0000Izlude.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll give you a ride to the ^FF0000 Swordsman's Guild^000000.";
		mes "Would you like to go change jobs?";
		break;
	case 2:
		mes "[Faye]";
		mes "If ^0000FFMagician^000000, it's Geffen.";
		mes "There is a ^FF0000 magic school ^000000 to the northwest ^000000 of ^FF0000 Geffen.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll give you a ride to ^FF0000Magic School^000000.";
		mes "Would you like to go change jobs?";
		break;
	case 3:
		mes "[Faye]";
		mes "If ^0000FFAcolyte^000000, it's Prontera.";
		mes "Northeast of ^FF0000Prontera^000000 is ^FF0000Cathedral^000000.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll give you a ride to the ^FF0000Cathedral^000000.";
		mes "Would you like to go change jobs?";
		break;
	case 4:
		mes "[Faye]";
		mes "If ^0000FFThief^000000, it's Morroc.";
		mes "You can go to ^FF0000Morroc and then to Pira Mido^000000 in the northwest.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll give you a ride to ^FF0000Northwest Pila Mido^000000.";
		mes "Would you like to go change jobs?";
		break;
	case 5:
		mes "[Faye]";
		mes "Payon if ^0000FFArcher^000000.";
		mes "There is a ^FF0000Archer guild ^000000 in the northeast ^000000 of ^FF0000Payon.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll give you a ride to the ^FF0000Archer guild^000000.";
		mes "Would you like to go change jobs?";
		break;
	case 6:
		mes "[Faye]";
		mes "If ^0000FFMerchant^000000, it's Alberta.";
		mes "There is a ^FF0000merchant association^000000 to the southwest^000000 of ^FF0000Alberta.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll give you a ride to the ^FF0000 Merchants' Union^000000.";
		mes "Would you like to go change jobs?";
		break;
	case 7:
		mes "[Faye]";
		mes "^0000FFTaekwon Kid^000000 if it's Payon.";
		mes "A little southwest of the center of ^FF0000Payon, there should be a practitioner^000000 named Phoenix.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll send you to ^000000 around the southwest of ^FF0000Payon.";
		next;
		mes "[Faye]";
		mes "Well, even so, it seems ^FF0000there are ^000000tests to become a Taekwon Kid.";
		mes "If you really want to be one, I won't stop you.";
		mes "You want to go get a new job?";
		break;
	case 8:
		mes "[Faye]";
		mes "^0000FFGunslinger^000000 in case ^FF0000Einbroch^000000.";
		mes "^FF0000You can go to the laboratory^000000 in the center of the city.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs right away, I'll send you to the laboratory ^000000 in the center of ^FF0000 city.";
		next;
		mes "[Faye]";
		mes "Well, even so, it looks like ^FF0000 trials^000000 to become a Gunslinger.";
		mes "If you really want to be one, I won't stop you.";
		mes "You want to go get a new job?";
		break;
	case 9:
		mes "[Faye]";
		mes "^0000FFNinja^000000 case Amatsu.";
		mes "The way to get there is to go to ^FF0000Alberta and then take a boat ^000000.";
		mes "The cost of the boat is high, so it might be difficult for you as a new adventurer.";
		next;
		mes "[Faye]";
		mes "Well, if you change jobs soon, I'll send you to ^FF0000Amatsu's mansion^000000.";
		next;
		mes "[Faye]";
		mes "Well, even so, it seems ^FF0000there are ^000000tests^000000 to become a Ninja.";
		mes "If you really want to be one, I won't stop you.";
		mes "You want to go get a new job?";
		break;
	case 10:
		mes "[Faye]";
		mes "If you're ^0000FFSupernovice^000000, you need to get your ^FF0000BaseLv to 45^000000.";
		mes "The place is Aldebaran, right?";
		mes "There should be an oddball named Tozele in a house ^000000 south of ^FF0000Aldebaran.";
		next;
		if(BaseLevel<45) {
			mes "[Faye]";
			mes "If you're Lune, you can talk to him on the first floor of the ^0000FF classroom building^000000 outside this room.";
			next;
			mes "[Faye]";
			mes "If you want to change your job to the first level, I'll send you there and you can come back.";
			close;
		}
		mes "[Faye]";
		mes "Well, if you change jobs soon, I'll send you to ^FF0000Aldebaran's southern house ^000000.";
		next;
		mes "[Faye]";
		mes "Well, even so, it seems ^FF0000there are ^000000tests^000000 to become a Supernovice.";
		mes "If you really want to be one, I won't stop you.";
		mes "You want to go get a new job?";
		break;
	}
	next;
	cutin "jp_quest_help10.bmp", 255;
	if(select("going to change jobs", "not yet")==2){
		mes "[Faye]";
		mes "If you're Lune, you can talk to him on the ^0000FF classroom building, 1F^000000, just outside this room.";
		next;
		mes "[Faye]";
		mes "If you want to change your job to the first level, I'll send you there and you can come back.";
		close;
	}
	switch('@sel){
	case 7:
	case 8:
	case 9:
	case 10:
		mes "[Faye]";
		mes "And yes, ......";
		mes "If you ever go somewhere to change jobs, you can come back to the Adventurer's Academy once.";
		next;
		mes "[Faye]";
		mes "^FF0000The Adventurer's Academy has a guy who will do the transfer service for you. ^000000";
		next;
		break;
	}
	mes "[Faye]";
	mes "Then I'm gonna transfer you.";
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
	case 10: warp "aldebaran.gat",112,64; break;
	}
	end;

	function ABOUT_JOB {
		while(1){
			mes "[Faye]";
			mes "Which line of work would you like to hear about?";
			next;
			switch(select("Swordsman", "Magician", "Acolyte", "Thief", "Archer", "Merchant", "Taekwon Kid", "1st job expanded", "stop asking")){
			case 1:
				mes "[Faye]";
				mes "It's about the Swordsman system.";
				mes "Puron is probably talking a little bit about it, but Swordsman will be able to change jobs to Knight and Crusader.";
				mes "Which one do you want to ask about?";
				cutin "swordman_1.bmp", 2;
				next;
				switch(select("Knight", "Crusader", "Ask about other professions")){
				case 1:
					mes "[Faye]";
					mes "Knight is a knight of the kingdom with high physical attack and defense.";
					mes "The ability to ride Peko Peko allows him to be highly mobile.";
					cutin "swordman_3.bmp", 2;
					next;
					mes "[Faye]";
					mes "The Knight's fighting style differs depending on whether he primarily uses a sword or a spear.";
					mes "The Knight can learn powerful ranged attacks, such as the Brandish Spear for spears and the Bowling Bash for two-handed swords.";
					next;
					mes "[Faye]";
					mes "As you grow up and perform the act of reincarnation, your Knight can become a Lord Knight (left) and your Crusader can become a Paladin (right)!";
					cutin "swordman_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Faye]";
					mes "Crusader is a more defensive profession than Knight.";
					mes "Like the Knight, it can be ridden by Peko Peko and can have high mobility.";
					cutin "swordman_4.bmp", 2;
					next;
					mes "[Faye]";
					mes "Crusader can take advantage of his high defense.";
					mes "He is proficient with spear and shield skills and can master skills such as the ranged attack ground cross and devotion to protect his comrades.";
					next;
					mes "[Faye]";
					mes "Further growth and the act of reincarnation will allow the Knight to become a Lord Knight (left) and the Crusader to become a Paladin (right)!";
					cutin "swordman_5.bmp", 2;
					next;
					break;
				}
				cutin "swordman_5.bmp", 255;
				break;
			case 2:
				mes "[Faye]";
				mes "It's about the Magician system.";
				mes "Puron is probably talking a little bit about it, but Magician will be able to change jobs to Wizard and Sage.";
				mes "Which one do you want to ask about?";
				cutin "magician_1.bmp", 2;
				next;
				switch(select("Wizard", "Sage", "Ask about other professions")){
				case 1:
					mes "[Faye]";
					mes "The Wizard is an attractive profession for its broad range of great magic using the greatest firepower.";
					mes "Although not good at close combat, it is a profession that is easily used in party fights.";
					cutin "magician_3.bmp", 2;
					next;
					mes "[Faye]";
					mes "The wizard's fighting style takes advantage of his high magical attack power.";
					mes "It can fight with powerful ranged magic such as Meteor Storm Storm Gust.";
					next;
					mes "[Faye]";
					mes "As you grow and perform the act of reincarnation, the Wizard can become a High Wizard (left) and the Sage can become a Professor (right)!";
					cutin "magician_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Faye]";
					mes "Sage is a profession of physical attackers who, by deepening their knowledge of magic, have acquired the ability to counter magic.";
					mes "They have a high proximity ability and can fight with both direct and magical attacks.";
					cutin "magician_4.bmp", 2;
					next;
					mes "[Faye]";
					mes "He can learn skills such as autospell, which allows him to use skills automatically while attacking enemies, and freecast, which allows him to move while chanting magic.";
					next;
					mes "[Faye]";
					mes "If you grow further and perform the act of reincarnation, the Wizard can become a High Wizard (left) and the Sage can become a Professor (right)!";
					cutin "magician_5.bmp", 2;
					next;
					break;
				}
				cutin "magician_5.bmp", 255;
				break;
			case 3:
				mes "[Faye]";
				mes "It's about the Acolyte system.";
				mes "Puron is probably talking a little bit about it, but Acolyte will be able to change jobs to Priest and Monk.";
				mes "Which one do you want to ask about?";
				cutin "acolyte_1.bmp", 2;
				next;
				switch(select("Priest", "Monk", "Ask about other professions")){
				case 1:
					mes "[Faye]";
					mes "Priest is a profession that can learn a variety of recovery and auxiliary magic.";
					mes "The Priest is a key member of the party and can help many of his friends to fight.";
					cutin "acolyte_3.bmp", 2;
					next;
					mes "[Faye]";
					mes "Priest's fighting style is to utilize his support skills.";
					mes "He will also be able to learn Kyrie Eleison to prevent physical attacks, Magnificat to increase SP recovery, and Sanctuary's continuous recovery magic.";
					next;
					mes "[Faye]";
					mes "If you grow further and perform the act of reincarnation, Priests can become High Priests (left) and Monks can become Champions (right)!";
					cutin "acolyte_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Faye]";
					mes "Monk is a profession of ascetic monks who train their bodies and focus solely on actual combat.";
					mes "He specializes in direct attacks and can use the chi embodied by qigong in his attacks.";
					cutin "acolyte_4.bmp", 2;
					next;
					mes "[Faye]";
					mes "Monk's fighting style is primarily close combat.";
					mes "He can learn Hajin, which is effective against high defensive opponents, Kongo, which is completely defensive, and Asura Haoho Fist, which is a one-hit kill.";
					next;
					mes "[Faye]";
					mes "If you grow further and perform the act of reincarnation, Priests can become High Priests (left) and Monks can become Champions (right)!";
					cutin "acolyte_5.bmp", 2;
					next;
					break;
				}
				cutin "acolyte_5.bmp", 255;
				break;
			case 4:
				mes "[Faye]";
				mes "It's about the Thief system.";
				mes "Puron is probably talking a little bit about it, but Thief will be able to change jobs to Assassin and Rogue.";
				mes "Which one do you want to ask about?";
				cutin "thief_1.bmp", 2;
				next;
				switch(select("Assassin", "Rogue", "Ask about other professions")){
				case 1:
					mes "[Faye]";
					mes "The Assassin is the fastest of all professions and can fight with the fastest speed, keeping the enemy at bay.";
					mes "They can attack with either two swords or with their special weapon, the Ka Taro.";
					cutin "thief_3.bmp", 2;
					next;
					mes "[Faye]";
					mes "Assassin's fighting style is to take advantage of his high evasion rate.";
					mes "Skills such as Enchanted Poison, which can perform poison attacks, and Venom Knife, which has a high probability of poisoning.";
					next;
					mes "[Faye]";
					mes "Further growth and the act of reincarnation will allow the Assassin to become the Assassin Cross (left) and the Rogue to become the Stalker (right)!";
					cutin "thief_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Faye]";
					mes "Rogue is a profession that can use daggers in combat and can easily take items and other items from enemies.";
					mes "It would be a profession that is playful, such as being able to leave graffiti on the ground.";
					cutin "thief_4.bmp", 2;
					next;
					mes "[Faye]";
					mes "The Snatcher, which can trigger a steal to take an enemy's item while attacking, and the Backstab attack skill, which can be used by getting behind them, are powerful.";
					next;
					mes "[Faye]";
					mes "Further growth and the act of reincarnation will allow the Assassin to become the Assassin Cross (left) and the Rogue to become the Stalker (right)!";
					cutin "thief_5.bmp", 2;
					next;
					break;
				}
				cutin "thief_5.bmp", 255;
				break;
			case 5:
				mes "It's about the Archer system.";
				mes "Puron is probably talking a little bit about it, but Archer will be able to change jobs to Hunter and Bard (male) or Dancer (female).";
				mes "Which one do you want to ask about?";
				cutin "archer_1.bmp", 2;
				next;
				switch(select("Hunter", "Bard and Dancer", "Ask about other professions")){
				case 1:
					mes "[Faye]";
					mes "Hunter is a profession that can defeat enemies with long-range attacks and a variety of traps.";
					mes "The Falcon will be able to fight technically by effectively using the skills and many types of traps that the Falcon can unleash.";
					cutin "archer_3.bmp", 2;
					next;
					mes "[Faye]";
					mes "The way Hunter fights is in how he acquires the Falcon and traps.";
					mes "The Ankle Snare, which blocks enemy movement, and the Blitz Beat, a ranged attack that utilizes the Falcon, are skills that can also add damage in succession.";
					next;
					mes "[Faye]";
					mes "Further growth and the act of reincarnation will allow the Hunter to become a Sniper (left) and the Bard and Dancer to become a Clown and Gypsy (right)!";
					cutin "archer_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Faye]";
					mes "Bard (male) is a profession that specializes in providing various types of assistance by singing and playing, and Dancer (female) by dancing in a spectacular manner.";
					cutin "archer_4.bmp", 2;
					next;
					mes "[Faye]";
					mes "Bard and Dancer are characterized by their ability to provide assistance to players within the area of effect of their skills.";
					mes "The Bragi Poem used by Bard is a powerful skill that reduces the activation time and hardness time of skills.";
					next;
					mes "[Faye]";
					mes "Dancer's Service for You is a skill that can increase the maximum SP of players within its area of effect and decrease SP consumption when using skills.";
					next;
					mes "[Faye]";
					mes "Also, when two Bard and Dancer are together, they can use a powerful support skill called Ensemble Skill.";
					next;
					cutin "archer_5.bmp", 2;
					mes "[Faye]";
					mes "Further growth and the act of reincarnation will allow the Hunter to become a Sniper (left) and the Bard and Dancer to become a Clown and Gypsy (right)!";
					next;
					break;
				}
				cutin "archer_5.bmp", 255;
				break;
			case 6:
				mes "[Faye]";
				mes "It's about the Merchant system.";
				mes "I know Puron is talking a bit about this, but Merchants will be able to change jobs to Blacksmith and Alchemist.";
				mes "Which one do you want to ask about?";
				cutin "merchant_1.bmp", 2;
				next;
				switch(select("Blacksmith", "Alchemist", "Ask about other professions")){
				case 1:
					mes "[Faye]";
					mes "The Blacksmith is a profession that allows the refining of weapons and the granting of effect attributes with powerful arms and equipment.";
					mes "They have more skills to aid in combat and can also craft weapons.";
					cutin "merchant_3.bmp", 2;
					next;
					mes "[Faye]";
					mes "The Blacksmith's fighting style relies heavily on brawn.";
					mes "There are hammerfalls that stun at range when surrounded by enemies and overthrusts that increase attack power in exchange for weapon damage.";
					next;
					mes "[Faye]";
					mes "If you grow further and perform the act of reincarnation, the Blacksmith can become a Whitesmith (left) and the Alchemist can become a Creator (right)!";
					cutin "merchant_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[Faye]";
					mes "Alchemist is an alchemical profession that produces restorative potions and other medicines.";
					mes "It can create various potion-based items.";
					mes "They can also summon homunculi and monsters to fight.";
					cutin "merchant_4.bmp", 2;
					next;
					mes "[Faye]";
					mes "The Alchemist will also be able to assist with potion pitchers and fight with bio-plants.";
					next;
					mes "[Faye]";
					mes "The homunculus that the Alchemist can summon is also an artificial life that can fight alongside him and, if raised, will become a powerful ally.";
					next;
					mes "[Faye]";
					mes "If you grow further and perform the act of reincarnation, the Blacksmith can become a Whitesmith (left) and the Alchemist can become a Creator (right)!";
					cutin "merchant_5.bmp", 2;
					next;
					break;
				}
				cutin "merchant_5.bmp", 255;
				break;
			case 7:
				mes "[Faye]";
				mes "It's about Taekwon Kid system.";
				mes "Puron is probably talking a little bit about it, but Taekwon Kid will be able to change jobs to Star Gladiator and Soul Linker.";
				mes "Which one do you want to hear about?";
				cutin "taekwonkid_1.bmp", 2;
				next;
				switch(select("Star Gladiator", "Soul Linker", "Ask about other professions")){
				case 1:
					mes "[Faye]";
					mes "Star Gladiator is a profession endowed by the sun, moon, and stars.";
					mes "The Star Gladiator has the ability to store the energy contained in books in his legs and turn it into offensive power.";
					mes "It is also a profession whose available skills change depending on location and day.";
					cutin "taekwonkid_3.bmp", 2;
					next;
					mes "[Faye]";
					mes "Star Gladiator's fighting style depends largely on the monster and location that registers with his skills.";
					mes "The sun, moon, and star rage skills are powerful skills that greatly increase attack power.";
					next;
					break;
				case 2:
					mes "[Faye]";
					mes "Soul Linker is a profession that breaks the path of Taekwondo and manipulates the power of the spirit at will.";
					mes "It can support various professions and can also attack with magic.";
					cutin "taekwonkid_4.bmp", 2;
					next;
					mes "[Faye]";
					mes "The Soul Linker's fighting style is based on the use of powerful esma as a single magic and soul skills that exhibit the characteristics of each profession.";
					mes "Kaahi, which takes HP damage, consumes SP, and heals, is a powerful skill.";
					next;
					break;
				}
				cutin "taekwonkid_4.bmp", 255;
				break;
			case 8:
				mes "[Faye]";
				mes "Gunslinger in 1st job expanded, NinjaSupernovice doesn't have a higher job.";
				mes "I guess you could say this profession is rare among adventurers.";
				mes "It's a very unique profession.";
				next;
				break;
			case 9:
				mes "[Faye]";
				mes "Well, if you want to know more, you can always come back and ask.";
				mes "I'll be happy to talk to you.";
				close;
			}
			mes "[Faye]";
			mes "Would you like to hear about other higher positions?";
			next;
			if(select("OK, I'm fine.", "I want to ask about other jobs too.")==1) break;
		}
		return;
	}

	function GIVE_BOOK {
		if(checkitemblank() < 2){
			mes "^FF0000<WARNING>^000000-You cannot receive items due to the number of different items in your possession-";
			mes "-Please reduce the number of items in your possession and talk to us again-";
			close;
		} else
		if(Weight>(MaxWeight/100)*90){
			mes "^FF0000<WARNING>^000000-You will not be able to receive the item due to the high weight of the item you are carrying-";
			mes "-Please reduce the number of items in your possession and then speak to me again-";
			close;
		}
		getitem 11055,1;
		mes "[Faye]";
		mes "It's a basic adventure book.";
		mes "It contains important information.";
		mes "Since we're here, let me tell you how to use this book.";
		next;
		cutin "jp_quest_help10.bmp",2;
		mes "[Faye]";
		mes "^FF0000Alt+E key ^000000 will show you the items you have, so just hover ^FF0000 cursor over the Basic Adventure Book and right click ^000000.";
		mes "Then the item details window will appear.";
		next;
		mes "[Faye]";
		mes "Items from books like the Basic Adventure Book can be read.";
		mes "Try left-clicking^0000FF the open book symbol in the upper left corner of the ^0000FF window.";
		mes "It's the one that says 'read' when you hover over it.";
		next;
		mes "[Faye]";
		mes "Then you can read in the book.";
		mes "You can read it because it contains important information about the adventure.";
		next;
		cutin "jp_quest_help10.bmp", 255;
		return;
	}

OnTouch:
	set AC_JOBCHANGE,0;
	if(AC_NOVICE_QUE==30 && Job!=Job_Novice && !checkquest(100128)){
		mes "[Faye]";
		mes "Looks like you've successfully changed jobs.";
		mes "Congratulations!";
		next;
		mes "[Faye]";
		mes "Then you may look around the Adventurer's Academy.";
		mes "The Adventurer's Academy has a Practice Room where you can do battle and various jobs to respond to requests.";
		next;
		mes "[Faye]";
		mes "Oh yeah, ^FF0000Lune^000000 is looking for someone to help him with his work.";
		next;
		mes "[Faye]";
		mes "When you leave this room, you can talk to the ^0000FF pink-haired Woman^000000.";
		mes "She should be able to help you grow.";
		setquest 100128;
		close;
	} else
	if(AC_NOVICE_QUE==30 && Job==Job_Novice){
		if(CHANGE_SNV || CHANGE_TK || CHANGE_GS || CHANGE_NJ){
			emotion 21, "Faye#ac_room"; //52725
			mes "[Faye]";
			mes "Whoa!";
			mes "Looks like you're working hard on your new job!";
			next;
			if(CHANGE_TK||CHANGE_SNV){
				mes "[Faye]";
				mes "If you want to raise your BaseLv, go to the Practice Room or Special Room in the Adventurer's Academy and see.";
				next;
				mes "[Faye]";
				mes "The Practice Room is located in the upper left after you leave this training room.";
				close;
			} else {
				mes "[Faye]";
				mes "If you want to go to another city, look for the red-haired ^0000FFTaro^000000 who is ^0000FF \"forwarding service\" ^000000.";
				next;
				mes "[Faye]";
				mes "Taro should be found after you leave this training room and go to the upper left.";
				close;
			}
		}
	}
	end;
}


//Operation Notes
-	script	Operation Notes#func	-1,{
	mes "[Operation Notes]";
	mes "-It's a book with things that will help you in your adventures-";
	mes "-When you open the book, you will see the items on the pages-";
	mes "-Which page shall I read?-";
	next;
	switch(select("How to talk", "How to fight", "How to find out where you are", "How to sit", "How to change viewpoint", "How to use shortcuts", "Stop reading")){
	CASE 1:
		mes "[Conversation instructions page]";
		mes "-The translucent window with the word conversation in the lower left corner is the conversation window.";
		mes "The conversation window displays the conversation, as well as the status changes and the mesage when items are obtained-";
		next;
		mes "[How to Conversation page]";
		mes "-Put your MessSage in the blank space on the right side of the bottom row and press ^0000FFEnter key ^000000, and the conversation will be displayed to all players on the same screen.";
		next;
		mes "[How to Conversation page]";
		mes "-Enter a character name in the blank space on the left side of the bottom row to have a one-on-one conversation with that person-";
		mes "-Using this feature, you can have a conversation with the person you are logged in with, even if he/she is not in the screen.-";
		next;
		mes "[How to Conversation page]";
		mes "-Click on the right circle of the two circles in the lower right corner of the conversation window to resize the window and change the number of lines displayed.-";
		next;
		mes "[How to Conversation Page]";
		mes "-Clicking the left circle will toggle the conversation mode-";
		next;
		mes "[Conversation method page]";
		mes "-There are three types of conversation mode switching: whole, party and guild-";
		
		next;
		mes "[Conversation way page]";
		mes "-Party will show the conversations said to all party members who are logged in.-";
		mes "-Non-party members will not see this conversation-";
		next;
		mes "[How to Conversation Page]";
		mes "-The guild will also see the conversation that was said to all guild members who are logged in.";
		mes "Only guild members can see this conversation-";
		next;
		mes "[How to Conversation Page]";
		mes "-Also, if you hold down the ^0000FFCtrl key when you speak and press the Enter key ^000000, the conversation will be to the party members-";
		next;
		mes "[How to Conversation Page]";
		mes "-Similarly, pressing the Enter key while holding down the ^0000FFAlt key when speaking ^000000 and pressing the Enter key ^000000 will be a conversation to guild members-";
		next;
		mes "[How to Conversation Page]";
		mes "-In addition to pressing the key, you can also put \"^0000FF%^000000\" in front of your statement to make it a conversation to your party members-";
		next;
		mes "[Conversation instructions page]";
		mes "-Similarly, you can speak as a conversation to guild members by putting \"^0000FF$^000000\" in front of your statement-";
		close;
	case 2:
		mes "[How to Combat page]";
		mes "-Attacking a monster can be done by left-clicking on the monster to be attacked-";
		mes "-Also, by pressing ^0000FFCtrl key ^000000 at the same time, you will be in auto mode-";
		next;
		mes "[How to combat page]";
		mes "-You can always switch to auto mode without pressing the Ctrl key by typing ^0000FF '/nc'^000000 or '/noctr' in the conversation window and saying -";
		close;
	case 3:
		mes "[Sitting page]";
		mes "-Basic skill level of Lv 3 allows you to sit down-";
		mes "-^0000FFPressing the Insert key ^000000 allows you to perform sitting and standing actions.";
		next;
		mes "[Sitting page]";
		mes "-The natural recovery rate of HP and SP is increased when you are in a sitting position-";
		close;
	case 4:
		mes "[How to change viewpoint page]";
		mes "-Hold down the right mouse button and move the mouse left or right to change the viewpoint-";
		next;
		mes "[How to change viewpoint page]";
		mes "-And if you double click^0000FF the right mouse button^000000 with the viewpoint changed, you can change the viewpoint back to the original state-";
		next;
		mes "[How to change viewpoint page]";
		mes "-But in certain places, such as indoors, the right double-click will not change the viewpoint-";
		next;
		mes "[Mouse actions]";
		mes "-Holding down the right button changes the cursor into the shape of left and right arrows.";
		mes "You can change the viewpoint by moving the mouse in this state -";
		next;
		mes "[How to change viewpoint page]";
		mes "-^0000FF 'Ctrl+right button' ^000000 you can zoom in on the character-";
		next;
		mes "[How to change viewpoint page]";
		mes "-^0000FF 'Shift+right button'^000000 you can change the angle of the viewpoint.";
		mes "You can also press ^0000FF 'Ctrl key'^000000 at the same time to change the angle more significantly-";
		next;
		mes "[How to change the viewpoint page]";
		mes "-The zooming in and out of the viewpoint can also be done by moving the ^0000FF mouse wheel up and down ^000000-";
		close;
	case 5:
		mes "[How to use shortcuts]";
		mes "-The shortcut window can be displayed by pressing the ^0000FFF12 key ^000000-";
		mes "-Three shortcut windows are toggled while the window is displayed-";
		next;
		mes "[How to use shortcuts]";
		mes "-The shortcut windows allow you to register consumable items, skills and equipment-";
		mes "-After registering, you can use the registered items by pressing ^000000F1 to F9 keys ^000000-";
		next;
		mes "[How to use shortcuts]";
		mes "-You can register the icon of the item, skill or equipment you want to shortcut by dragging^0000FF the icon to the shortcut window^000000-";
		mes "-After registering the item, skill or equipment, you can use it by pressing the keys from ^0000FFF1 to F9^000000.-";
		next;
		mes "[How to use shortcuts]";
		mes "-It is very convenient to register consumable recovery items and other items in the shortcut window and recover them by repeatedly pressing the buttons.";
		close;
	default:
		mes "["+ strcharinfo(0) +"]";
		mes "(I guess I don't have to look it up anymore.)";
		close;
	}
OnInit:
	if(strnpcinfo(2)=="func") end;
OnTimer3000:
	misceffect 543;
	initnpctimer;
}
ac_library.gat,110,108,0	duplicate(Operation Notes#func)	Operation Notes#_1	111
ac_library.gat,107,108,0	duplicate(Operation Notes#func)	Operation Notes#_2	111
ac_cl_room.gat,45,62,4	duplicate(Operation Notes#func)	Operation Notes#3	111
ac_cl_room.gat,33,47,4	duplicate(Operation Notes#func)	Operation Notes#4	111
ac_cl_room.gat,55,44,4	duplicate(Operation Notes#func)	Operation Notes#4_1	111

ac_cl_room.gat,37,32,4	script	Master Sunus	51,{
	function GetBeginnerEquip;
	if(AC_PASSPORT<2){
		mes "[Master Sunus]";
		mes "Hmm? I see you have not yet completed the enrollment process at the Academy.";
		next;
		mes "[Master Sunus]";
		mes "First, you need to complete the enrollment process at ^FF0000 \"Ella-san\" ^000000.";
		close;
	}
	if(checkquest(201036)) {
		mes "-The man is busy with something-";
		next;
		mes "-Information-";
		//mes " ^FF0000May 26, 2015";
		//mes " before scheduled maintenance ";
		//mes " "Thick Combat Instruction";
		//mes " If you have received ";
		mes " This NPC is not available -";
		close;
	}
	mes "[Master Sunus]";
	// greeting branch unexamined
	if(gettime(3) >= 5 && gettime(3) <= 10)
		mes "Hey, good morning.";
	else if(gettime(3) >= 11 && gettime(3) <= 17)
		mes "Hi there.";
	else
		mes "Hi, good evening.";
	next;
	if(Upper == UPPER_HIGH || getbaseclass(Class) > CLASS_DC || Job >= Job_RuneKnight) {
		mes "[Master Sunus]";
		mes "You are mature enough to be an adventurer and will not need my guidance.";
		mes "Life is a lonely thing. ......";
		mes "It is solitary, and that is why it is most wonderful to walk with friends!";
		NEXT;
		mes "[Master Sunus]";
		mes "You could join a guild.";
		mes "It would be nice to walk with a stranger for a moment ......";
		next;
		mes "[Master Sunus]";
		mes "I hope your path ahead is a great one.";
		close;
	}
	if(AC_PASSPORT == 2) {
		mes "[Master Sunus]";
		mes "Nice to meet you.";
		mes "My name is Sunus. .........";
		mes "Call me Master Sunus.";
		next;
		mes "[Master Sunus]";
		mes "First of all, I have prepared ^0000FF beginner's potion ^000000 for you .......";
		mes "It's not much, but I hope it will help you.";
		next;
		mes "[Master Sunus]";
		mes "If your HP gets low and you are in danger, use this to recover.";
		next;
		mes "-Information-";
		mes " ^FF0000Master Sunus will provide beginner potions for a period of 2 weeks-";
		//setquest 117475;
		//compquest 117475;
		setquest 117480;
		set AC_PASSPORT,3;
		next;
	}
	if(checkquest(117480)) {
		if(checkquest(117480)&2) {
			mes "-Information-";
			mes " The distribution of potions for beginners will end as two weeks have passed since the start of providing potions for beginners-";
			delquest 117480;
			delquest 117470;
			next;
		}
		else {
			if(!checkquest(117470) || checkquest(117470)&2) {
				if(MaxWeight - Weight < 1000) {
					mes "[Master Sunus]";
					mes "...... Looks like your luggage is a little too heavy.";
					mes "Sort out your luggage and reduce ^FF0000 your weight ^000000 in your possession and come.";
					mes "I'll give you a beginner's potion again.";
				}
				else if(checkitemblank() < 3) {
					mes "[Master Sunus]";
					mes "...... Looks like you have a little too much baggage.";
					mes "Sort out your stuff and reduce the number of ^FF0000 types you have ^000000 and come.";
					mes "I'll give you the beginner's potion again.";
				}
				else {
					setquest 117470;
					// piece count branch not yet investigated
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
					mes "[Master Sunus]";
					mes "It's going to take a little while, but I'll have it ready again.";
					mes "Check the quest window to see when I can give it to you.";
				}
			}
			else {
				mes "[Master Sunus]";
				mes "I'm still preparing the potions for beginners.";
				mes "Check your quest window to see when you can give it to me.";
			}
			next;
		}
	}
	else {
		mes "[Master Sunus]";
		mes "How is your adventure going?";
		next;
	}
	mes "[Master Sunus]";
	mes "Okay, so ......";
	next;
	if(select("item exchange", "walk away") == 2) {
		mes "[Master Sunus]";
		mes "Really?";
		mes "You can come back.";
		close;
	}
	mes "[Master Sunus]";
	mes "I guess we're exchanging items.";
	mes "You can exchange ......";
	next;
	if(AC_BEGINNER_EQUIP == 12) {
		mes "[Master Sunus]";
		mes "Since you don't seem to have any tickets, it looks like I don't have anything to give you. ......";
		next;
		mes "[Master Sunus]";
		mes "If you're that good and your JobLv has reached 50, I guess it's time for you to move on.";
		next;
		if(countitem(25020) == 0) {
			mes "[Master Sunus]";
			mes "Come to think of it, I don't think you have a 'diploma'.";
			mes "If you have an unopened level-up box, you should open it.";
			next;
			mes "[Master Sunus]";
			mes "Now, if it's all right with you, I'll take you to someone named 'Metheus Silp'.";
			mes "There you will be able to proceed to the \"reincarnation\" procedure.";
			next;
			mes "[Master Sunus]";
			mes "Please note that ^FF00001,285,000Zeny^000000 is required to complete the procedure.";
		}
		else {
			mes "[Master Sunus]";
			mes "If you are willing, I can take you to someone named 'Metheus Silp'.";
			next;
			mes "[Master Sunus]";
			mes "There, if you hand over your 'diploma', you will be able to proceed to the 'reincarnation' procedure for free.";
			next;
			mes "[Master Sunus]";
			mes "If you lose the 'diploma', you will need ^FF00001,285,000Zeny^000000 to proceed to 'reincarnation', so be careful.";
		}
		next;
		mes "[Master Sunus]";
		mes "So, shall we go to [Metheus Shilp] then?";
		next;
		if(select("yes", "another time") == 2) {
			mes "[Master Sunus]";
			mes "Really?";
			mes "You can come back.";
			close;
		}
		mes "[Master Sunus]";
		mes "I hope you remember what I've taught you so far and keep up the good work on your adventures!";
		close2;
		warp "yuno_in02.gat",90,162;
		end;
	}
	if(countitem(25018) < 1 && countitem(25019) < 1) {
		mes "[Master Sunus]";
		mes "It looks like you don't have a ticket.";
		next;
		mes "[Master Sunus]";
		mes "If you level up and open the level up box, you'll get the ticket.";
		next;
		mes "[Master Sunus]";
		mes "Good luck!";
		next;
		mes "-Information-";
		mes " ^FF0000Item exchange is only entitled to unincarnated professions except Ninja, Taekwon Kid, Soul Linker, Star Gladiator, Gunslinger, and Supernovice.";
		next;
		mes "-Information-";
		mes " Also, please note that we do not accept exchanges with post-transfiguration professions.";
		close;
	}
	if(Job == Job_Novice) {
		mes "[Master Sunus]";
		mes "I have a ticket but ......";
		mes "I'll have to change to one of the primary jobs first, except Taekwon Kid, and then I'll go to .......";
		next;
		mes "[Master Sunus]";
		mes "When you change jobs, come back.";
		mes "At that time, I will exchange your ticket for the item again.";
		close;
	}
	switch(AC_BEGINNER_EQUIP) {
	case 0:
		if(countitem(25019) == 0) close;

		mes "[Master Sunus]";
		mes "[Costume] I give you the beginner's hat.";
		next;
		set AC_BEGINNER_EQUIP,1;
		delitem 25019, 1;
		getitem 20307, 1;
		mes "[Master Sunus]";
		mes "[Costume] The beginner's hat is an item of equipment given to adventurers who have just started adventuring and is a sign of an adventurer beginner.";
		next;
		mes "[Master Sunus]";
		mes "This hat enhances various stats just by equipping it.";
		next;
		mes "[Master Sunus]";
		mes "Also, other skilled adventurers may lend a hand if you have this equipped, so make sure you wear it properly.";
		next;
		mes "[Master Sunus]";
		mes "And...";
		mes "[Costume] If you use the skill \"First Aid\" with your beginner's hat equipped, you can come back to me.";
		next;
		mes "[Master Sunus]";
		mes "You can use it if you need anything.";
		mes "I'm always here for you.";
		next;
		mes "-Information-";
		mes " ^FF0000To check and use the skills you have learned, you can press \"Skill\" on the basic information screen or use \"Alt + S\" to call up the skill window.";
		next;
		mes "-Information-";
		mes "[[Costume] Beginner Hat] will be collected when you change to the next profession.";
		mes " Ninja, GunslingerTaekwon KidSupernovice.";
		next;
		mes "-Information-";
		mes " Other occupations will be collected at the time of \"transferring\" or \"changing to the third occupation\".";
		next;
		mes "[Master Sunus]";
		mes "By the way, have you taken all the courses from the people in this room?";
		mes "If you haven't taken it, make sure you do.";
		next;
		break;
	case 1:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		break;
	case 2:
		

		mes "[Master Sunus]";
		mes "Hood[0]";
		mes "Sandals[0]";
		mes "Guard[0]";
		mes "I give to you the [Master Sunus]";
		next;
		set AC_BEGINNER_EQUIP,3;
		delitem 25019, 1;
		getitem 2501, 1;
		getitem 2401, 1;
		getitem 2101, 1;
		mes "[Master Sunus]";
		mes "The armor I just gave you will reduce the damage from monsters in any way by equipping it.";
		next;
		mes "[Master Sunus]";
		mes "Don't forget to equip it.";
		if(checkre()) {
			mes "Be aware, however, that the shield, \"Guard,\" has the disadvantage of slowing down the attack speed.";
		}
		next;
		mes "[Master Sunus]";
		mes "Try it out first, and if it doesn't seem useful, don't force yourself to equip it.";
		next;
		break;
	case 3:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		mes "[Master Sunus]";
		mes "The weapon I gave you this time is a weapon with enhanced attack power than the one I gave you before.";
		next;
		mes "[Master Sunus]";
		mes "If you find that the attack power is higher than the weapon you have now, please try to use it.";
		next;
		break;
	case 4:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[Master Sunus]";
			mes "Yes, ......";
			mes "See which one you want, pick one.";
			next;
			switch(select("Morpheus Set", "Hell Mode Set 1", "Hell Mode Set 2")) {
			CASE 1:
				mes "[Master Sunus]";
				mes "Acolyte, I would recommend this armor for the rear guard of the Magician family.";
				setarray '@itemid,5126,2518,2648,2649;
				break;
			case 2:
				mes "[Master Sunus]";
				mes "That's the recommended armor for the vanguard.";
				mes "It increases HP and SP and reduces damage from monsters.";
				setarray '@itemid,5123,2353,2517,2418;
				break;
			case 3:
				mes "[Master Sunus]";
				mes "That's the recommended armor for the vanguard.";
				mes "Equipping this armor enhances the evasion and recovery effects of recovery items.";
				setarray '@itemid,5123,2353,2516,2417;
				break;
			}
			next;
			mes "[Master Sunus]";
			mes ""+getitemname('@itemid[0])+ "[" +getiteminfo('@itemid[0],10)+ "]";
			mes ""+getitemname('@itemid[1])+ "[" +getiteminfo('@itemid[1],10)+ "]";
			mes ""+getitemname('@itemid[2])+ "[" +getiteminfo('@itemid[2],10)+ "]";
			mes ""+getitemname('@itemid[3])+ "[" +getiteminfo('@itemid[3],10)+ "]";
			mes "Would you like this?";
			next;
			if(select("No", "Yes") == 2) {
				break;
			}
		}
		mes "[Master Sunus]";
		mes ""+getitemname('@itemid[0])+ "[" +getiteminfo('@itemid[0],10)+ "]";
		mes ""+getitemname('@itemid[1])+ "[" +getiteminfo('@itemid[1],10)+ "]";
		mes ""+getitemname('@itemid[2])+ "[" +getiteminfo('@itemid[2],10)+ "]";
		mes ""+getitemname('@itemid[3])+ "[" +getiteminfo('@itemid[3],10)+ "]";
		mes " for you.";
		next;
		set AC_BEGINNER_EQUIP,5;
		delitem 25019, 1;
		getitem '@itemid[0], 1;
		getitem '@itemid[1], 1;
		getitem '@itemid[2], 1;
		getitem '@itemid[3], 1;
		mes "[Master Sunus]";
		mes "All the armor I gave you this time is amazing armor that will give you special effects when you equip it!";
		next;
		mes "[Master Sunus]";
		mes "^FF0000The set equipment will not be effective ^000000 unless you equip it all together, so don't forget that when you equip it.";
		next;
		break;
	case 5:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		mes "[Master Sunus]";
		mes "The weapon I gave you this time is a more enhanced weapon than the one I gave you before.";
		next;
		mes "[Master Sunus]";
		mes "Some weapons will enhance your status and skills.";
		next;
		mes "[Master Sunus]";
		mes "If the attack power of the weapon is higher than your current weapon, please use it.";
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
		if('@itemid == 0) { // not investigated
			mes "[Master Sunus]";
			mes "I guess I don't have anything to give you that you haven't already changed to the second job. ......";
			close;
		}
		mes "[Master Sunus]";
		mes ""+getitemname('@itemid);
		mes " to you.";
		next;
		set AC_BEGINNER_EQUIP,7;
		delitem 25019, 1;
		getitem2 '@itemid,1,1,0,0,0,0,0,0,1209600;
		mes "[Master Sunus]";
		mes "The armor I gave you this time is a special armor that has special effects when equipped.";
		next;
		mes "[Master Sunus]";
		mes "The effect is so superior that I am giving it to you as a rental.";
		next;
		mes "[Master Sunus]";
		mes "The armor I gave you this time will disappear automatically in about two weeks from now, so please equip it first and try its effect.";
		next;
		break;
	case 7:
		if(countitem(25019) == 0) close;

		mes "[Master Sunus]";
		mes "Earrings[1]";
		mes "Necklace[1]";
		mes "Rosary[1]";
		mes "Globe[1]";
		mes "Brooch[1]";
		mes "Ring[1]";
		mes "is for you.";
		next;
		set AC_BEGINNER_EQUIP,8;
		delitem 25019, 1;
		getitem 2622, 1;
		getitem 2623, 1;
		getitem 2626, 1;
		getitem 2624, 1;
		getitem 2625, 1;
		getitem 2621, 1;
		mes "[Master Sunus]";
		mes "The armor I gave you this time is armor that can be equipped in a place called accessories.";
		next;
		mes "[Master Sunus]";
		mes "Equipping this armor will increase your status, so you can use it as you like.";
		next;
		break;
	case 8:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[Master Sunus]";
			mes "Yes, ......";
			mes "See which one you want, pick one.";
			next;
			switch(select("Ebesi Storm Swell [1]", "Kratos Earth Rift [1]", "Lucius Volcanic Fury [1]", "Shapinha Sea Cry [1]")) {
			case 1:
				set '@elem$, "wind";
				set '@itemid,2349;
				break;
			case 2:
				set '@elem$, "earth";
				set '@itemid,2351;
				break;
			case 3:
				set '@elem$, "fire";
				set '@itemid,2345;
				break;
			case 4:
				set '@elem$, "water";
				set '@itemid,2347;
				break;
			}
			mes "[Master Sunus]";
			mes "That's armor with the " +'@elem$+ "attribute on the armor.";
			mes ""+'@elem$+ "It's useful in dungeons and fields with attribute attacks.";
			next;
			mes "[Master Sunus]";
			mes ""+getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "Would you like this?";
			next;
			if(select("No", "Yes") == 2) {
				break;
			}
		}
		mes "[Master Sunus]";
		mes ""+getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "is for you.";
		next;
		set AC_BEGINNER_EQUIP,9;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	case 9:
		if(countitem(25019) == 0) close;

		mes "[Master Sunus]";
		mes "Louise's red shoes [1]";
		mes "is for you.";
		next;
		set AC_BEGINNER_EQUIP,10;
		delitem 25019, 1;
		getitem 22068, 1;
		mes "[Master Sunus]";
		mes "The armor I gave you this time can increase the recovery effect of [beginner's potion] by equipping it.";
		next;
		mes "[Master Sunus]";
		mes "Also, by refining this armor, you can further increase the restorative effect of [Beginner's Potion].";
		next;
		mes "[Master Sunus]";
		mes "However, please be aware that as you continue to refine this armor, you may fail to refine it, and you may lose the armor itself.";
		next;
		break;
	case 10:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[Master Sunus]";
			mes "Yes, ......";
			mes "See which one you want, pick one.";
			next;
			switch(select("Charailleur shield[1]", "Flois shield[1]", "Sol shield[1]", "Levain shield[1]", "Sombre shield[1]", "Lamor shield[1]", "Esprit shield[1]", "Lumière shield[1]"," Puisson Shield[1]")) {
			case 1: set '@elem$, "fire"; set '@race$, "devil"; set '@itemid,2159; break;
			case 2: set '@elem$, "water"; set '@race$, "animal"; set '@itemid,2163; break;
			case 3: set '@elem$, "land"; set '@race$, "fish and shellfish"; set '@itemid,2165; break;
			case 4: set '@elem$, "wind"; set '@race$, "insects"; set '@itemid,2194; break;
			case 5: set '@elem$, "dark"; set '@race$, "undead"; set '@itemid,2164; break;
			case 6: set '@elem$, "undead"; set '@race$, "human"; set '@itemid,2158; break;
			case 7: set '@elem$, "ghost"; set '@race$, "angel"; set '@itemid,2175; break;
			case 8: set '@elem$, "holy"; set '@race$, "dragon"; set '@itemid,2174; break;
			case 9: set '@elem$, "poison"; set '@race$, "plant"; set '@itemid,2167; break;
			}
			mes "[Master Sunus]";
			mes ""+'@elem$+ "Reduces damage taken from attribute monsters slightly and ";
			mes '@race$+ "Received from type monsters";
			mes "It's a shield that does a little more damage.";
			next;
			mes "[Master Sunus]";
			mes ""+getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "Would you like this?";
			next;
			if(select("No", "Yes") == 2) {
				break;
			}
		}
		mes "[Master Sunus]";
		mes ""+getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "is for you.";
		next;
		set AC_BEGINNER_EQUIP,11;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	case 11:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[Master Sunus]";
			mes "Yes, ......";
			mes "See which one you want, pick one.";
			next;
			switch(select("Chaleur cloak[1]", "Frois cloak[1]", "Sol cloak[1]", "Levant cloak[1]", "Sombre cloak[1]", "Lamor cloak[1]", "Esprit cloak[1]", "Lumière cloak[1]", "Puison cloak[1 ]")) {
			case 1: set '@elem$, "fire"; set '@race$, "devil"; set '@itemid,2596; break;
			case 2: set '@elem$, "water"; set '@race$, "animal"; set '@itemid,2593; break;
			case 3: set '@elem$, "land"; set '@race$, "fish and shellfish"; set '@itemid,20701; break;
			case 4: set '@elem$, "wind"; set '@race$, "insects"; set '@itemid,20750; break;
			case 5: set '@elem$, "dark"; set '@race$, "undead"; set '@itemid,2595; break;
			case 6: set '@elem$, "undead"; set '@race$, "human"; set '@itemid,2598; break;
			case 7: set '@elem$, "ghost"; set '@race$, "angel"; set '@itemid,20716; break;
			case 8: set '@elem$, "holy"; set '@race$, "dragon"; set '@itemid,20705; break;
			case 9: set '@elem$, "poison"; set '@race$, "plant"; set '@itemid,20708; break;
			}
			mes "[Master Sunus]";
			mes ""+'@elem$+ "Reduces damage taken from attribute monsters slightly and ";
			mes '@race$+ "Received from type monsters";
			mes "It's a cape that increases the damage a little.";
			next;
			mes "[Master Sunus]";
			mes ""+getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "Would you like this?";
			next;
			if(select("No", "Yes") == 2) {
				break;
			}
		}
		mes "[Master Sunus]";
		mes ""+getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "is for you.";
		next;
		set AC_BEGINNER_EQUIP,12;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	}
	mes "[Master Sunus]";
	mes "If you still have the ticket, please speak to me again.";
	next;
	mes "-Information-";
	mes " ^FF0000Item exchange is only right when you are unincarnated.";
	mes " Please be careful not to forget to exchange it as it is not accepted after reincarnation-";
	close;

	function GetBeginnerEquip {
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
				else if(getbaseclass(Class,2) == CLASS_CR) { set '@itemid,1410; } // unconfirmed
				break;
			case CLASS_MG:
				if(getbaseclass(Class,2) == CLASS_WZ) { set '@itemid,1619; }
				else if(getbaseclass(Class,2) == CLASS_SA) { set '@itemid,1551; } // unconfirmed
				break;
			case CLASS_AC:
				if(getbaseclass(Class,2) == CLASS_HT) { set '@itemid,1718; }
				else if(getbaseclass(Class,2) == CLASS_BA) { set '@itemid,1907; }
				else if(getbaseclass(Class,2) == CLASS_DC) { set '@itemid,1956; } // unconfirmed
				break;
			case CLASS_AL:
				if(getbaseclass(Class,2) == CLASS_PR) { set '@itemid,1625; }
				else if(getbaseclass(Class,2) == CLASS_MO) { set '@itemid,1807; } // unconfirmed
				break;
			case CLASS_MC:
				if(getbaseclass(Class,2) == CLASS_BS) { set '@itemid,1360; }
				else if(getbaseclass(Class,2) == CLASS_AM) { set '@itemid,1119; }
				break;
			case CLASS_TF:
				if(getbaseclass(Class,2) == CLASS_AS) { set '@itemid,1360; } // unconfirmed
				else if(getbaseclass(Class,2) == CLASS_RG) { set '@itemid,1360; } // unconfirmed
				break;
			}
			break;
		}
		if('@itemid == 0) { // not investigated
			mes "[Master Sunus]";
			mes "I guess I don't have anything to give you that you haven't already changed to the second job. ......";
			close;
		}
		mes "[Master Sunus]";
		mes ""+getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "is for you.";
		set AC_BEGINNER_EQUIP,AC_BEGINNER_EQUIP + 1;
		delitem 25018, 1;
		getitem '@itemid, 1;
		next;
		return;
	}

OnInit:
	waitingroom "Master Sunus",0;
	end;
}
