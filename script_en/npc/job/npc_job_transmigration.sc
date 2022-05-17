//====================================================================
//Ragnarok Online - Transmigration NPC Script by Blaze
// - TRANSMIGRATE -> 0 to 2
// - TRANSMIGRATE -> 0 to 2
// OLD_CLASS -> save your occupation before transmigration
//====================================================================

//==========================================
// Sage Castle
//------------------------------------------

yuno_in02.gat,88,164,5 script metheusilp 742,{
	if(TRANSMIGRATE == 0) {
		if(BaseLevel < 99 || JobLevel < 50 || Class < CLASS_KN || Class > CLASS_CR2) {
			mes "[MeteusSilp]";
			mes "Welcome." ;
			mes "This is the Schweichel Magic Academy Library." ;
			mes "We have many valuable books here." ;
			mes "Please take your time to visit." ;
			close;
		}
		mes "[Meteussilp]";
		mes "Welcome." ;
		mes "This is the Schweichel Academy of Magic Library." ;
		mes "I assume that you are here this time to read the Book of Yumir?" ;
		next;
		mes "[Metheus Schirp]";
		mes "The Book of Yumir is also available in printed form." ;
		mes "Still, from time to time, some people ask to read it in person: ......." ;
		next;
		mes "[Metheus Schirp]";
		mes "But the original is not in very good condition." ;
		mes "We are giving special permission to those who wish to view them there by making a donation." ;
		next;
		mes "[Metheus Shilp]";
		mes "The donation is 1,285,000 Zeny." ;
		mes "This will be used for the safe preservation of books and antiquarian research." ;
		mes "We are sorry, but if you wish to view the book, please pay it." ;
		mes "Would you like to donate?" ;
		next;
		if(countitem(25020) > 0) {
			next;
			mes "[metesilp]";
			mes "And I usually get a donation, but I see that you have a "diploma"." ;
			next;
			mes "[Metheussyrup]"; mes "[Metheussyrup]"; mes "[Metheussyrup]
			mes "If you give us your "diploma", we will allow you to view the site for free." ;
			mes "Would you like to come in?" ;
			next;
			if(select("enter", "quit") == 2) {
				mes "[Meteussilp]";
				mes "Please take your time to visit." ;
				mes "I hope you have a pleasant trip." ;
				close;
			}
			delitem 25020,1;
			set TRANSMIGRATE,101;
			mes "[Metheussilp]";
			mes "Then please come in." ;
			close;
		}
		if(select("donate", "quit")==2) {
			mes "[Meteussilp]";
			mes "Please take your time to visit." ;
			mes "I hope you have an enjoyable trip." ;
			close;
		}
		if(Zeny < 1285000) {
			mes "[Meteussilp]";
			mes "You seem to be a little short of what you have." ;
			mes "Please double-check your possessions before you come." ;
			close;
		}
		set Zeny,Zeny-1285000;
		set TRANSMIGRATE,1;
	}
	mes "[Meteussilp]";
	mes "Thank you." ;
	mes "Your donation will be carefully used to fund research at our academy." ;
	mes "Then, please come in." ;
	close;
}

//==============================================================
yuno_in02.gat,93,207,0 script The Book of Yumir 111,{
	if(Upper == UPPER_HIGH) {
		mes "[The Book of Yumiru]";
		mes "...... The entrance to the Temple of Glory is open to all the reborn." ;
		mes "It is open everywhere in the world to help heroes on their path." ;
		next;
		mes "[The Book of Yumir]";
		mes "There, every provision is made for them." ;
		mes "Moreover, it is said that even wishes that cannot be fulfilled in reality can be fulfilled in that temple." ;
		next;
		if(select("stop reading", "continue")==1) {
			mes "[The Book of Yumir]";
			mes "............" ;
			close;
		}
		mes "[The Book of Yumir]";
		mes "The place closest to the sky. Therein is the way that leads to the temple of the Valkyries." ;
		mes "But the unqualified cannot know it forever." ;
		close2;
		warp "valkyrie.gat",48,8;
		end;
	}
	if(TRANSMIGRATE == 0) {
		mes "[The Book of Yumir]";
		mes "............" ;
		close;
	}
	mes "[The Book of Yumir]";
	mes "...... And along with the many accomplishments of the previous generation, there was the question of death, which loomed inevitably over the heroes. Even heroes are bound to have their last moments." ;
	next;
	mes "[The Book of Yumir]";
	mes "But no poems, records, or even oral traditions about any heroes left any record of their final moments." ;
	mes "In contrast, one point is worth noting." ;
	mes "It is what is described in the "Ragnarok" about the Valkyries." ;
	next;
	mes "[The Book of Yumir]";
	mes "One who possessed the highest qualities at the best of times as a human being. He fought as a warrior in the Final Crusade. And his soul seems to have gone to Valhalla under the guidance of Valkyrie." ;
	mes "This is not the end of ordinary people." ;
	next;
	mes "[The Book of Yumir]";
	mes "By reincarnating, heroes are reborn as true heroes, shining their light into a new age." ;
	mes "And the fallen bodies will rise again, and the souls will gain new abilities." ;
	next;
	mes "[The Book of Yumir]";
	mes "Unfortunately, however, Yumir's heart disappeared throughout the continent after the Holy War." ;
	mes "So I sought further clarification by various methods. But ......." ;
	next;
	mes "[The Book of Yumir]";
	mes "While remaining GOST, I could not learn anything more." ;
	mes "Therefore I hereby leave a record." ;
	next;
	if(!checkquest(1000)) setquest 1000;
	mes "[The Book of Yumir]";
	mes "I eagerly await that someone in later generations will find this record and be reborn as a hero who will find his will and hope, the last light of the age, and that once again someone will appear to lead the heroes in the temple of the Valkyries. And after that ......" ;
	if(TRANSMIGRATE == 1) set TRANSMIGRATE,2;
	else if(TRANSMIGRATE == 101) set TRANSMIGRATE,102;
	close;
}

//==============================================================
yuno_in05.gat,49,43,0 script Heart of Yumir 111,{
	if(TRANSMIGRATE == 2 || TRANSMIGRATE == 102)
		warp "valkyrie.gat",48,8;
	end;
}


//==========================================
// Temple of Valkyrie
//------------------------------------------

valkyrie.gat,48,86,4 script Valkyrie 811,{
	if(Upper ! = UPPER_NORMAL) {
		mes "[Valkyrie]";
		mes "Welcome to the glorious Valhalla!" ;
		mes "You may want to get some rest." ;
		mes "Let there be light for the warriors!" ;
		close;
	}
	mes "[Valkyrie]";
	mes "Welcome to the glorious Valhalla!" ;
	mes "From now on, you will sort out your life up to the present and take on a new life." ;
	mes "Let there be light to the warriors!" ;
	next;
	if(Weight || SkillPoint|| checkcart() || checkfalcon() || checkriding() || sc_ison(SC_ALL_RIDING)) {
		mes "[Valkyrie]";
		mes "You have some things you need to prepare." ;
		mes "Please rest well. ......" ;
		mes "And let your body and mind be without." ;
		mes "Honor is something that shows up when you are mindless." ;
		next;
		mes "[Valkyrie]";
		mes "You must have nothing, including items and skill points." ;
		mes "You cannot take any animals or carts with you on your journey." ;
		next;
		mes "[Valkyrie]";
		mes "Would you like to go back to the city once and get ready?" ;
		mes "If you want to go back, I can give you a lift." ;
		next;
		if(select("No", "Yes") == 1) {
			mes "[Valkyrie]";
			mes "Then please visit ...... Please come when you are ready." ;
			close;
		}
		mes "[Valkyrie]";
		mes "Then we will send you to the city." ;
		mes "Please come when you are ready." ;
		close2;
		warp "yuno.gat",151,183;
		end;
	}
	mes "[Valkyrie]";
	mes "You've lost your body and soul." ;
	mes "...... You have a beautiful heart." ;
	mes "Now that you have become mindless, your honor is well represented." ;
	next;
	mes "[Valkyrie]";
	mes "Sleep well ......." ;
	mes "Erase the memories of the past that are etched in your mind and let your spirit remember the glorious tokens of your past up to the present." ;
	next;
	mes "[Valkyrie]";
	mes "Then ......." ;
	mes "One thing, I'll leave Urd with a memory of the past." ;
	mes "Two, let Verdandi remember the glorious moments of the present." ;
	mes "Three, let Skuld give life to the future." ;
	next;
	mes "[Valkyrie]";
	mes "One";
	next;
	mes "[Valkyrie]";
	mes "two ......" ;
	next;
	mes "[Valkyrie]";
	mes "three......" ;
	for(set '@i,22954;'@i<=22969;set '@i,'@i+1) {
		if(countitem('@i))
			delitem '@i,1;
	}
	if(countitem(25018)) delitem 25018,1;
	if(countitem(25019)) delitem 25019,1; }
	if(countitem(25020)) delitem 25020,1; }
	if(getequipid(14) == 20307) unequip 14;
	if(countitem(20307)) delitem 20307,1;
	set OLD_CLASS,Job;
	jobchange Job_Novice,UPPER_HIGH;
	set BaseLevel,1;
	resetstatus;
	resetskill;
	setoption 0x0000;
	skill 143,1,0;
	skill 142,1,0;
	set SkillPoint,0;
	set StatusPoint,100;
	if(TRANSMIGRATE == 102)
		set '@TRANSMIGRATE,1;
	set TRANSMIGRATE,0;
	set AC_BEGINNER_EQUIP,0;
	chgquest 1000,50000;
	next;
	mes "[Valkyrie]";
	mes "Congratulations!" ;
	mes "All rituals have been completed." ;
	mes "Here is a small gift for the warrior on his new path." ;
	getitem 1202,1;
	getitem 2302,1;
	next;
	if('@TRANSMIGRATE) {
		mes "[Information]";
		mes "If you get a gift from Valkyrie, your ^000000FFBaseLv and JobLv will be ^000000^000000FF10. Would you like to receive ^000000 gifts?" ;
		next;
		if(select("Yes", "No") == 1) {
			getexp 2,0;
			getexp 4,0;
			getexp 6,0;
			getexp 9,0;
			getexp 12,0;
			getexp 15,0;
			getexp 18,0;
			getexp 21,0;
			getexp 27,0;
			getexp 0,4;
			getexp 0,6;
			getexp 0,8;
			getexp 0,10;
			getexp 0,20;
			getexp 0,30;
			getexp 0,40;
			getexp 0,50;
			getexp 0,60;
		}
	}
	mes "[Valkyrie]";
	mes "Please, I hope that your life, as remembered by Urd in the past, will not be in vain." ;
	mes "And that your glory, which the present Verdandi remembers, may be reproduced."; mes "[Valkyrie]"; mes "[Valkyrie]
	next;
	mes "[Valkyrie]";
	mes "And I hope that there will be light in your new life that the future Skuld remembers." ;
	close2;
	switch(OLD_CLASS) {
		case Job_Knight:
		case Job_Crusader:
			warp "izlude.gat",94,103;
			break;
		case Job_Priest:
		case Job_Monk:
			warp "prontera.gat",273,354;
			break;
		case Job_Wizard:
		case Job_Sage:
			warp "geffen.gat",120,100;
			break;
		case Job_Blacksmith:
		case Job_Alchemist:
			warp "alberta.gat",116,57;
			break;
		case Job_Hunter:
		case Job_Bard:
		case Job_Dancer:
			warp "payon.gat",160,58;
			break;
		case Job_Assassin:
		case Job_Rogue:
			warp "morocc.gat",160,94;
			break;
	}
	end;
}

//==============================================================
valkyrie.gat,44,33,5 script teleporter 124,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Teleporter]";
			mes "Congratulations on your reincarnation!" ;
			mes "Let there be light for the warriors!" ;
		}
		else {
			mes "[teleporter]";
			mes "Don't touch the exhibits!" ;
		}
		} close;
	}
	mes "[teleporter]";
	mes "Warrior, where do you want to go home?" ;
	next;
	switch (select("Prontera", "Morroc", "Payon", "Geffen", "Alberta", "Izlude", "Aldebaran", "Comodo", "Yuno")) {
		case 1: savepoint "prontera.gat",116,72; break;
		case 2: savepoint "morocc.gat",156,46; break
		case 3: savepoint "payon.gat",160,58; break
		case 4: savepoint "geffen.gat",120,39; break
		case 5: savepoint "alberta.gat",117,56; break
		case 6: savepoint "izlude.gat",91,105; break
		case 7: savepoint "aldebaran.gat",160,109; break
		case 8: savepoint "comodo.gat",209,143; break
		case 9: savepoint "yuno.gat",328,101; break
	}
	warp "SavePoint",0,0;
	end;
}

//==============================================================
valkyrie.gat,44,39,5 script Lord Knight 56,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Lord Knight]";
			mes "Congratulations on your reincarnation!" ;
			mes "Let there be light to the warrior!"; mes "[Lord Knight]"; mes "[Lord Knight]"; mes "[Lord Knight]" ;
		}
		else {
			mes "[Lord Knight]";
			mes "Everyone appreciates you." ;
			mes "No one disagrees with you." ;
			mes "Now it's up to you to evaluate yourself." ;
			mes "Your assessment is ......." ;
			next;
			mes "[Lord Knight]";
			mes "Okay, you're good to go." ;
		}
		close;
	}
	callfunc "JobChanger", "Lord Knight",Job_Swordman,Job_Knight;
	mes "[Lord Knight]";
	mes "Welcome to glorious Valhalla." ;
	mes "Have a good rest." ;
	mes "Let there be light to the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,44,42,5 script High Priest 60,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[High Priest]";
			mes "Congratulations on your reincarnation." ;
			mes "Blessings to our hero!" ;
		}
		else {
			mes "[High Priest]";
			mes "O God, ring the bells of blessing on those who stand here now." ;
			mes "And grant this man the strength to spread his profound will on earth." ;
		}
		close;
	}
	callfunc "JobChanger", "High Priest",Job_Acolyte,Job_Priest;
	mes "[High Priest]";
	mes "Welcome to the glorious Valhalla!" ;
	mes "Please have a rest." ;
	mes "Blessed are the Warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,44,47,5 script High Wizard 735,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[High Wizard]";
			mes "Congratulations on your reincarnation." ;
			mes "Let there be light for the warrior!" ;
		}
		else {
			mes "[High Wizard]";
			mes "You are officially a High Wizard too, so please try to act like a High Wizard." ;
			mes "We High Wizards have powerful magic and must act sparingly." ;
		}
		close;
	}
	callfunc "JobChanger", "High Wizard",Job_Magician,Job_Wizard;
	mes "[High Wizard]";
	mes "Welcome to the glorious Valhalla." ;
	mes "Please have a rest." ;
	mes "Let there be light for the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,44,50,5 script Whitesmith 731,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Whitesmith]";
			mes "Congratulations on your reincarnation!" ;
			mes "Let there be light for the warrior!"; mes "[Whitesmith]"; mes "[Whitesmith]" ;
		}
		else {
			mes "[Whitesmith]";
			mes "Thanks for the delivery." ;
			mes "Here "+strcharinfo(0)+", receipt." ;
			mes "Hmm? What's the difference?" ;
		}
		close;
	}
	callfunc "JobChanger", "Whitesmith",Job_Merchant,Job_Blacksmith;
	mes "[Whitesmith]";
	mes "Welcome well to glorious Valhalla." ;
	mes "Well, go get some rest." ;
	mes "Let there be light to the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,44,55,5 script Sniper 727,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Sniper]";
			mes "Congratulations on your reincarnation." ;
			mes "Let there be light for the warrior!" ;
		}
		else {
			mes "[Sniper]";
			mes "^6B8C21, let's begin the job change test." ;
			mes "Among the many monsters, defeat only those whose name is 'job-test monster'. Also - watch out for pitfalls. -^000000Hmmm? Wasn't it?" ;
		}
		close;
	}
	callfunc "JobChanger", "Sniper",Job_Archer,Job_Hunter;
	mes "[Sniper]";
	mes "Welcome to glorious Valhalla." ;
	mes "Please make yourself at home." ;
	mes "Let there be light to the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,44,58,5 script Assassin Cross 725,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Assassin Cross]";
			mes "Congratulations on your reincarnation." ;
			mes "Good luck!" ;
		}
		else {
			mes "[Assassin Cross]";
			mes "No matter what anyone says, you should be proud to be a 'Desert Fang'!" ;
			mes "Never give up your pride!" ;
		}
		close;
	}
	callfunc "JobChanger", "Assassin Cross",Job_Thief,Job_Assassin;
	mes "[Assassin Cross]";
	mes "Welcome to Valhalla, my friend." ;
	mes "Get some rest." ;
	mes "Good luck!" ;
	close;
}

//==============================================================
valkyrie.gat,53,39,3 script Paladin 752,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Paladin]";
			mes "I congratulate you on your reincarnation." ;
			mes "Let there be light to the warrior!" ;
		}
		else {
			mes "[Paladin]";
			mes "Never forget that the Holy War is approaching, and train yourself constantly!" ;
			mes "May Odin bless you!" ;
			mes "[Paladin]"; mes "Now go!" ;
		}
		close;
	}
	callfunc "JobChanger", "Paladin",Job_Swordman,Job_Crusader;
	mes "[Paladin]";
	mes "Welcome to glorious Valhalla." ;
	mes "Get some rest." ;
	mes "Let there be light to the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,53,42,3 script Champion 52,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Champion]";
			mes "Congratulations on your reincarnation!" ;
			mes "Light to the Warrior!"; mes "Light to the Warrior!" ;
		}
		else {
			mes "[Champion]";
			mes "Then we will now perform the Conversion Ceremony." ;
			next;
			mes "[Champion]";
			mes "...... Hey. You've already changed jobs." ;
		}
		close;
	}
	callfunc "JobChanger", "Champion",Job_Acolyte,Job_Monk;
	mes "[Champion]";
	mes "Welcome well to glorious Valhalla." ;
	mes "Get some rest." ;
	mes "Let there be light to the warrior!" ;
	close;
}

//==============================================================
valkyrie.gat,53,47,3 script Professor 743,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Professor]";
			mes "Congratulations on your reincarnation." ;
			mes "Let there be light for the warrior!" ;
		}
		else {
			mes "[Professor]";
			mes "Keep your papers safe." ;
			mes "It's an important book you wrote." ;
			mes "It may come in handy someday." ;
			mes "Read it over and memorize it." ;
		}
		close;
	}
	callfunc "JobChanger", "Professor",Job_Magician,Job_Sage;
	mes "[Professor]";
	mes "Welcome to the glorious Valhalla." ;
	mes "Get some rest." ;
	mes "Let there be light to the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,53,58,3 script Stalker 747,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Stalker]";
			mes "Congratulations on your reincarnation!" ;
			mes "Good luck!" ;
		}
		else {
			mes "[Stalker]";
			mes "Oh yeah, the password is ^3333 FF Allagam is not embezzling refining supplies ^000000." ;
			mes "Nah! Haha!" ;
		}
		close;
	}
	callfunc "JobChanger", "Stalker",Job_Thief,Job_Rogue;
	mes "[Stalker]";
	mes "Welcome to Valhalla!" ;
	mes "Take a little break." ;
	mes "Good luck!" ;
	close;
}

//==============================================================
valkyrie.gat,53,50,3 script Creator 122,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Creator]";
			mes "Congratulations on your reincarnation." ;
			mes "Let there be light for the warrior!" ;
		}
		else {
			mes "[Creator]";
			mes "Suddenly, I have a question." ;
			mes "What is the difference in price between buying 5 helms from an armor merchant at a discount of 24% and at a discount of 20%?" ;
			mes "How about it? This is so easy." ;
		}
		close;
	}
	callfunc "JobChanger", "Creator",Job_Merchant,Job_Alchemist;
	mes "[Creator]";
	mes "Welcome to glorious Valhalla!" ;
	mes "Go rest here for a bit." ;
	mes "Let there be light for the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,53,54,3 script Clown 741,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Clown]";
			mes "Congratulations on your reincarnation." ;
			mes "Let there be light for the warrior!" ;
		}
		else {
			mes "[Clown]";
			mes "Sing with me, and I'll sing with you." ;
			mes "How about this song?" ;
		}
		close;
	}
	callfunc "JobChanger", "Clown",Job_Archer,Job_Bard;
	mes "[Clown]";
	mes "Welcome to glorious Valhalla." ;
	mes "You may want to take a little rest here." ;
	mes "Let there be light for the warriors!" ;
	close;
}

//==============================================================
valkyrie.gat,53,56,3 script Gypsy 101,{
	if(Upper ! = UPPER_HIGH) {
		if(rand(3)) {
			mes "[Gypsy]";
			mes "Congratulations on your reincarnation!" ;
			mes "Let there be light for the warrior!"; mes "[Gypsy]"; mes "[Gypsy]" ;
		}
		else {
			mes "[Gypsy]";
			mes "Yes left, Migi : [→]";
			mes "............" ;
		}
		close;
	}
	callfunc "JobChanger", "Gypsy",Job_Archer,Job_Dancer;
	mes "[Gypsy]";
	mes "Welcome to glorious Valhalla!" ;
	mes "Get some rest before you go home." ;
	mes "Let there be light for the warriors!" ;
	close;
}


//==========================================
// Transfer Secondary JobChanger Functions
// callfunc "JobChanger", "Name",1stClass,2ndClass
//------------------------------------------

function script JobChanger {
	if(JobLevel < 40 || Job ! = getarg(1) || OLD_CLASS ! = getarg(2))
		return;
	mes "["+getarg(0)+"]"";
	mes "The time has come to regain our original form and bring a new light to the world." ;
	mes "Follow your path in your new form." ;
	next;
	mes "["+getarg(0)+"]";
	mes ""+getarg(0)+"]"; mes ""+getarg(0)+"]"; mes ""+getarg(0)+"]" ;
	next;
	if(select("No", "Yes")==1) {
		mes "["+getarg(0)+"]";
		mes "Please visit me again when you are ready." ;
		mes "Bless you hero!" ;
		close;
	}
	if(sc_ison(SC_ALL_RIDING)) {
		mes "-Cannot proceed while using a riding creature." ;
		mes " Please get down from the riding creature-";
		close;
	}
	if(SkillPoint) {
		mes "["+getarg(0)+"]"";
		mes "I see you still have some things to learn." ;
		mes "Please spend all of your SkillPoints before coming back." ;
		close;
	}
	unequip;
	jobchange getarg(2),UPPER_HIGH;
	if(getbaseclass(Class,2) == CLASS_AM && SKILL_BIOETHICS == 13) {
		skill 238,1,0;
		set SKILL_BIOETHICS,0;
	}
	mes "["+getarg(0)+"]"";
	mes "Congratulations!" ;
	mes "Return to earth and lead your people in your power." ;
	close;
}
