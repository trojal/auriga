//====================================================================
//Ragnarok Online Rogue jobchange script
// - CHANGE_RG
// - CHANGE_RG
// 1 Interview test
// 2 Interview test cleared
// 3 Item collection 1
// 4 Item Collection 2
// 5 Item Collection 3
// 6 Item Collection 4
// 7 Item Collection Clear
// 8 Antonio Jr.
// 9 Hermanson Jr. // not mounted
// 10 Aragam Jr. // not mounted
// 11 Holgren Jr. // not mounted
// 12 Antonio Jr. retest
// 13 Hermanson Jr. retest // not implemented
// 14 Aragam Jr. re-test // not mounted
// 15 Holgren Jr. re-test // not implemented
// 16 Final exam cleared
//====================================================================

//==========================================
// Exam Application and Job Change
//------------------------------------------

in_rogue.gat,363,122,4 script RogueGuild Member 747,{
	if(Upper == UPPER_HIGH) {
		mes "[Maki]";
		mes "Oh? You haven't met me in the past?" ;
		next;
		mes "[Maki]";
		mes "......" ;
		mes "Okay, I guess I looked at it wrong." ;
		mes "That's weird. ......." ;
		next;
		mes "[Maki]";
		mes "It's not often that I make a mistake. ......" ;
		mes "Well, have a safe trip home." ;
		close;
	}
	if(Job == Job_Rogue) {
		mes "[Maki]";
		mes "Oh, long time no see - no job from the guild right now." ;
		next;
		mes "[Maki]";
		mes "How are you doing?" ;
		mes "Let me know if you need anything." ;
		next;
		mes "[Maki]";
		mes "Oh yeah, don't forget to pay up~?" ;
		mes "Hmmm";
		close;
	}
	if(Job ! = Job_Thief) {
		mes "[Maki]";
		mes "hmm?" ;
		mes "What do you want?" ;
		mes "There's nothing here to see~";
		close;
	}
	if(JobLevel < 40) {
		mes "[Maki]";
		mes "Rogue can only be a Thief with a JobLevel of 40 or higher." ;
		mes "A chick like you is not ready yet." ;
		mes "Go train a little more." ;
		close;
	}
	if(SkillPoint) {
		mes "[RogueGuild Member]";
		mes "I can't change jobs if I have any SkillPoints left, right?" ;
		mes "Go ahead and spend them all." ;
		close;
	}
	switch(CHANGE_RG) {
	case 0:
		mes "[RogueGuild Member]";
		mes "What? What brings you all the way out here?" ;
		mes "You want to be a Rogue" +(Sex? "Brother": "Sister") + "huh?" ;
		next;
		mes "[RogueGuild Member]";
		mes "It's nice to meet you." ;
		mes "I'm Maki from the Rogue Guild." ;
		mes "What's your name?" ;
		next;
		mes "[Maki]";
		mes "Yeah?" +strcharinfo(0)+ "Duh?" ;
		mes "That's a good name, isn't it?" ;
		next;
		mes "[Maki]";
		mes "By the way, what brings you to this place again?" ;
		mes "You've been answering honestly since a while ago, so you seem like a yiatsu." ;
		next;
		mes "[Maki]";
		mes "But you shouldn't tell him everything like that in other places." ;
		mes "Attention to your own safety outside the Rogue Guild." ;
		next;
		mes "[Maki]";
		mes "Well, you look like you have a lot to offer, so why don't you take a test to get into my place?" ;
		next;
		mes "[Maki]";
		mes "An, don't be so nervous." ;
		mes "I'm just going to try a few things while you're taking the procedure." ;
		set CHANGE_RG,1;
		break;
	case 1:
		mes "[Maki]";
		mes "Here we go again." ;
		mes "Don't be nervous, try again." ;
		mes "Okay, let's begin." ;
		break;
	case 2:
		mes "[Maki]";
		mes "Go to 'smithrat'." ;
		mes "His test is a little tricky: ......." ;
		mes "He's in charge of collections. ......." ;
		mes "He has a clingy personality. ...... (whispering)";
		next;
		mes "[Maki]";
		mes "It's hard to make a mistake." ;
		mes "Good luck anyway!" ;
		close;
	default: //when 3-15
		mes "[Maki]";
		mes "Good luck!" ;
		mes "(something in a good mood)";
		next;
		mes "[Maki]";
		mes "Hmph. ...... This will make it easier to make money again. ......" ;
		mes "Ah ...... Oh it's nothing!" ;
		mes "ahaha...... Ahaha...... Ha......" ;
		close;
	case 16:
		set '@itemid,(JobLevel >= 50)? 1220: 1219;
		mes "[Maki]";
		mes "Whoa, you did your best!" ;
		mes "You must have had a hard time - I'll let you change jobs then." ;
		next;
		unequip;
		jobchange Job_Rogue;
		set CHANGE_RG,0;
		mes "[Maki]";
		mes "Congratulations!" ;
		mes "You did a great job, now you're free to live!" ;
		mes "Hmmm... ......" ;
		next;
		mes "[Maki]";
		mes "Oh, but I'll tell you one thing." ;
		mes "It means that if you value your freedom, you have to respect other people's freedom too." ;
		mes "Well then~~";
		getitem '@itemid,1;
		close;
	}
	// interview starts here
	next;
	if(select("OK", "Wait a minute")==2) {
		mes "[Maki]";
		mes "Right, go get ready then." ;
		close;
	}
	mes "[Maki]";
	mes "Yeah, let's get started then." ;
	next;
	mes "[Maki]";
	mes "Now I'm going to give you a question, so listen carefully and choose the correct one." ;
	next;
	switch(rand(3)) {
	case 0:
		mes "[Maki]";
		mes "1. What skills are needed to learn Rogue's skill "Tunnel Drive"?" ;
		next;
		if(select("Hiding", "Steel", "Improved Evasion", "Bash")==1)
			set '@point,'@point+10;
		mes "[maki]";
		mes "2. What percentage is the discount rate of Rogue's skill "Compulsion Discount" higher than the merchant's "Discount" Lv 10?" ;
		next;
		if(select("3 %", "2 %", "1 %", "0 %")==3)
			set '@point,'@point+10;
		mes "[maki]";
		mes "3. What is the ability of the skill "Steel Coin"?" ;
		next;
		if(select("steal item from player", "steal item from monster", "steal Zeny from monster", "steal Zeny from player")==3)
			set '@point,'@point+10;
		mes "[maki]";
		mes "4. What is the name of the skill that can be learned in the Thief system to quickly retreat backwards?" ;
		next;
		if(select("back dash", "emergency evade", "back stab", "back step")==4)
			set '@point,'@point+10;
		mes "[maki]";
		mes "5. What new skill appears by learning the skill "Strip Helm" Lv 5?" ;
		next;
		if(select("Invenum", "Tunnel Drive", "Venom Splasher", "Strip Shield")==4)
			set '@point,'@point+10;
		mes "[maki]";
		mes "6. Which of the following is a skill that allows you to move blindly around the perimeter?" ;
		next;
		if(select("Hiding", "Backstep", "Tunnel Drive", "Sanding")==3)
			set '@point,'@point+10;
		mes "[maki]";
		mes "7. Which of the following cards will increase the hit rate of physical attacks?" ;
		next;
		if(select("Andre", "Familiar card", "Mummy card", "Marina card")==3)
			set '@point,'@point+10;
		mes "[maki]";
		mes "8. Which of the following monsters is suitable to attack with a weapon with a Badon card (20% extra damage to fire) stuck in it?" ;
		next;
		if(select("Badon", "Deviruchi", "Elder Willow", "Baphomet")==3)
			set '@point,'@point+10;
		mes "[maki]";
		mes "9. What is the SP consumption when a double attack is triggered with a dagger?" ;
		next;
		if(select("15", "0" because it is passive, "fixed at 10 because it is passive", "54")==2)
			set '@point,'@point+10;
		mes "[maki]";
		mes "Which of the following weapons are effective in 10.Izlude dungeon?" ;
		next;
		if(select("Wind Maingauche", "Ice Maingauche", "Earth Maingauche", "Fire Maingauche")==1)
			set '@point,'@point+10;
		break;
	case 1:
		mes "[maki]";
		mes "1. Which of the following monsters drops a gladius with many slots?" ;
		next;
		if(select("steal bugs", "Pekopeko", "Desert Wolf", "Kobold")==4)
			set '@point,'@point+10;
		mes "[maki]";
		mes "2. From which monster can we get a minigosh with a socket?" ;
		next;
		if(select("Hornet", "Desert Wolf", "Marionette", "Mist")==1)
			set '@point,'@point+10;
		mes "[maki]";
		mes "3. Which professions can manufacture potions?" ;
		next;
		if(select("Merchant", "Alchemist", "Blacksmith", "Priest")==2)
			set '@point,'@point+10;
		mes "[Maki]";
		mes "4. Which of the following weapons cannot be used by Rogue?" ;
		next;
		if(select("square bow", "crossbow", "gladius", "katar")==4)
			set '@point,'@point+10;
		mes "[maki]";
		mes "5. What are the attributes of the horde?" ;
		next;
		if(select("water attribute", "fire attribute", "wind attribute", "earth attribute")==4)
			set '@point,'@point+10;
		mes "[maki]";
		mes "6. Which of the following monsters cannot be a pet?" ;
		next;
		if(select("PoPoring", "Creamy", "Oak Warrior", "Poison Spore")==2)
			set '@point,'@point+10;
		mes "[maki]";
		mes "7. Choose the monster for which the fire dagger is most effective." ;
		next;
		if(select("dagger goblin", "mace goblin", "flail goblin", "hammer goblin")==4)
			set '@point,'@point+10;
		mes "[maki]";
		mes "8. Which of the following cities has no guild fort?" ;
		next;
		if(select("Prontera", "Aldebaran", "Alberta", "Payon")==3)
			set '@point,'@point+10;
		mes "[Maki]";
		mes "9. Choose one of the following monsters that drops blue herbs." ;
		next;
		if(select("green herb", "yellow herb", "blue herb", "shining herb")==3)
			set '@point,'@point+10;
		mes "[maki]";
		mes "10. Choose one of the following monsters that is not undead." ;
		next;
		if(select("zombie", "megalodon", "familiars", "Carlitzburg")==3)
			set '@point,'@point+10;
		break;
	case 2:
		mes "[Maki]";
		mes "1. What is the FLEE that increases when Thief's "Improved Evasion" skill is mastered?" ;
		next;
		if(select("30", "40", "160", "20")==1)
			set '@point,'@point+10;
		mes "[maki]";
		mes "2. Which of the following monsters can spot hidding or cloaking?" ;
		next;
		if(select("Wormtail", "Argos", "Mummy", "Soldier Skeleton")==2)
			set '@point,'@point+10;
		mes "[maki]";
		mes "3. In the following, answer the name of the place where the Rogue guild is located." ;
		next;
		if(select("Comodo", "Kokomo Beach", "Pharos Lighthouse Island", "Morroc")==3)
			set '@point,'@point+10;
		mes "[Maki]";
		mes "4. Which city has the Thief guild?" ;
		next;
		if(select("Comodo", "Lutie", "Alberta", "Morroc")==4)
			set '@point,'@point+10;
		mes "[Maki]";
		mes "5. What card is not related to DEX?" ;
		next;
		if(select("locker card", "mummy card", "zerom card", "drops card")==2)
			set '@point,'@point+10;
		mes "[maki]";
		mes "6. Answer the Rogue's characteristics." ;
		next;
		if(select("excellent body language", "excellent insight", "excellent brazenness", "excellent offensive ability")) //Any of the answers are correct
			set '@point,'@point+10;
		mes "[maki]";
		mes "7. What is the minimum JobLv to go from Thief to Rogue?" ;
		next;
		if(select("30", "41", "40", "50")==3)
			set '@point,'@point+10;
		mes "[maki]";
		mes "8. Where can I go to dye my hair?" ;
		next;
		if(select("In the building at 7 o'clock Morroc", "In the building at 7 o'clock Prontera", "In the building at 5 o'clock Morroc", "In the building at 1 o'clock Prontera")==2)
			set '@point,'@point+10;
		mes "[maki]";
		mes "9. What is the name of the mushroom that will be needed if Novice becomes Thief?" ;
		next;
		if(select("Red Hairy Sticky Mushroom", "Red Hairy Sticky Mushroom", "Red Hairy Net Mushroom", "Red Shiitake Mushroom")) { //special processing since there are two correct answers
			if(@menu == 1 || @menu == 3)
				set '@point,'@point+10;
		}
		mes "[maki]";
		mes "10. What card is relatively unrelated to Rogue?" ;
		next;
		if(select("Whisper card", "Elder Willow card", "Zerom card", "Mater card")==2)
			set '@point,'@point+10;
		break;
	}
	mes "[Maki]";
	mes "Fuu......" ;
	mes "Good night." ;
	next;
	mes "[Maki]";
	mes "n...... The score is ......." ;
	mes ""+'@point+""; mes ""+'@point+""; mes ""+'@point+"" ;
	if('@point < 90) {
		mes "No." ;
		mes "You can't make it as a Rogue that way." ;
		mes "Come back when you have a little more information." ;
		close;
	}
	mes "Heh, there's quite a lot to see." ;
	next;
	mes "[Maki]";
	mes "Well, it's just the beginning." ;
	mes "[smithlat]"; mes "[smithlat]"; mes "[smithlat]"; mes "[smithlat]" ;
	mes "Watch out, he's in charge of collections, so he's pretty picky. ......." ;
	set CHANGE_RG,2;
	close;
}


//==========================================
// First test (robbery of money and goods)
//------------------------------------------

in_rogue.gat,376,23,2 script smithrat 57,{
	switch(CHANGE_RG) {
	case 0:
	case 1:
		mes "[smithlat]";
		mes "Hiifumi ..............." ;
		mes "My business partner is ......" ;
		mes "Morroc..... .Geffen..... .Comodo......" ;
		next;
		mes "[smithrat]";
		mes "My head hurts......" ;
		next;
		mes "[smithrat]";
		mes "Hm? What are you?" ;
		mes "If you want to change jobs, tell someone else!" ;
		next;
		mes "[smithrat]";
		mes "...... Damn it, ......." ;
		close;
	case 2:
		mes "[smithrat]";
		mes "Welcome to the Rogue guild." ;
		mes "Now we're going to give you a basic test to become a Rogue." ;
		next;
		mes "[smithrat]";
		mes "Just a few things I need you to prepare before the test." ;
		next;
		mes "[smithlat]";
		mes "I have tuition, so I need to have a little money ready." ;
		mes "We, the Rogue guild, also have to start working from capital and generate revenue." ;
		mes "[Smithrat]"; mes "Then bring me the next thing." ;
		next;
		mes "[smithrat]";
		mes "First, the guild registration fee ^FF333310000Zeny^000000 and";
		switch(rand(4)) {
			case 0:
				set CHANGE_RG,3;
				mes "10 Skelborn, 6 blue herbs";
				next;
				mes "[smithrat]";
				mes "10 claws of the deceased 10 fangs of the deceased"; next; mes "[smithrat]"; next; mes "[smithrat]"; mes "[smithrat]
				break;
			case 1:
				set CHANGE_RG,4;
				mes "10 green herbs 10 crab shells";
				next;
				mes "[smithrat]";
				mes "10 snake scales 10 garrets 10";
				break;
			case 2:
				set CHANGE_RG,5;
				mes "10 yellow herbs 10 hard skins";
				next;
				mes "[smithrat]";
				mes "10 grasshopper legs 10 bear soles 10";
				break;
			case 4: //no dialogue investigated
				set CHANGE_RG,6;
				mes "5 chrysalis skins 5 empty bottles 5 iron ore 5 rock hearts 5 red herbs";
				next;
				mes "[smithrat]";
				mes "5 beast skins 5 yellow gemstones 5 bat fangs 5 scorpion tails 5 monkey tails 5 monster bait 5 then ......" ;
				next;
				mes "[smithrat]";
				mes "5 cotton wools, 5 clovers, 5 bird feathers, 5 bird claws, 5 frog eggs, 5 raccoon tree leaves";
				break;
		}
		mes "yeah...... also ......" ;
		next;
		mes "[smithlat]";
		mes "I'll leave it at that." ;
		if(CHANGE_RG == 6) { //no dialogue examined
			mes "Hmm? What do you mean there are too many?" ;
			mes "... Never mind." ;
		}
		mes "Then come back when you have everything in order." ;
		close;
	case 3:
	case 4:
	case 5:
	case 6:
		switch(CHANGE_RG) {
			case 3:
				setarray '@need,932,510,957,958;
				setarray '@amount,10,6,10,10;
				break;
			case 4:
				setarray '@need,511,964,926,910;
				cleararray '@amount,10,10,4;
				break;
			case 5:
				setarray '@need,508,935,940,948;
				cleararray '@amount,10,4;
				break;
			case 6:
				setarray '@need,915,713,1002,953,507,919,715,913,904,942,528,914,705,916,917,908,845;
				cleararray '@amount,5,17;
				break;
		}
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
			if(countitem('@need['@i]) < '@amount['@i] || Zeny < 10000)
				break;
		}
		if('@i < getarraysize('@need))) {
			mes "[smithrat]";
			mes "ne...... I'm missing something." ;
			mes "Tell me again what you asked for." ;
			next;
			mes "[smithrat]";
			mes "Guild registration fee^FF333310000Zeny^000000";
			next;
			mes "[smithlat]";
			if(CHANGE_RG < 6) {
				for(set '@i,0; '@i<4; set '@i,'@i+1)
					mes ""+getitemname('@need['@i])+ " " " +'@amount['@i]+ "pieces";
			}
			else {
				mes "5 chickskin, 5 empty bottles, 5 iron ore, 5 rock hearts, 5 red herbs";
				next;
				mes "5 beast skins 5 yellow gemstones 5 bat fangs 5 scorpion tails 5 monkey tails 5 monster bait 5";
				next;
				mes "5 cotton wool, 5 clover, 5 bird feathers, 5 bird claws, 5 frog eggs, 5 raccoon tree leaves";
			}
			mes "That's it. Then I'll be waiting." ;
			close;
		}
		mes "[smithrat]";
		mes "First, the guild registration fee^FF333310000Zeny^000000 and ";
		set Zeny,Zeny-10000;
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1)
			delitem '@need['@i],'@amount['@i];
		switch(CHANGE_RG) {
			case 3:
				mes "10 skelbourne, 10 blue herbs, 6 good, ......" ;
				next;
				mes "10 deceased claws 10 deceased fangs 10 hmmm ...... Perfect." ;
				break;
			case 4:
				mes "10 green herbs 10 crab shells";
				next;
				mes "10 snake scales, 10 garrets, 10 garrets... Okay, we have them all." ;
				break;
			case 5:
				mes "10 yellow herbs 10 hard skins";
				next;
				 ;
				break;
			case 6:
				mes "5 chrysalis skins, 5 empty bottles, 5 iron ore, 5 rock hearts, 5 red herbs";
				next;
				mes "5 beast skins 5 yellow gemstones 5 bat fangs 5 scorpion tails 5 monkey tails 5 monster bait 5";
				next;
				mes "5 cotton wool 5 clovers 5 bird feathers 5 bird claws 5 frog eggs 5 raccoon tree leaves 5 ......" ;
				//no dialogue researched
				next;
				mes "[smithrat]";
				mes "How did you manage to gather all this stuff?" ;
				mes "This is a reward. Keep it." ;
				getitem 1097,1;
				break;
		}
		set CHANGE_RG,7;
		next;
		mes "[smithrat]";
		mes "Okay, hold on while I set up a few things." ;
		mes "Talk to me again." ;
		mes "The next test is at ...... and ......." ;
		close;
	case 7:
		mes "[smithlat]";
		mes "The next test is assigned to ......." ;
		mes "Who would you like to ......?" ;
		next;
		mes "[smithlat]";
		mes "Oh ...... There's the guy." ;
		next;
		switch(rand(1)) {
			case 0: //Antonio Jr.
				set CHANGE_RG,8;
				mes "[smithrat]";
				mes "I want Antonio Jr." ;
				mes "It's Antonio's son." ;
				mes "If you know him?" ;
				mes "I don't know what your dad did wrong, but I heard that he's trying to kill you for everything: ......." ;
				next;
				mes "[smithrat]";
				mes "He's from Payon in the east but lives in an abandoned house in Kokomo Beach." ;
				mes "Sometimes when someone makes noise outside, he says he goes out and gets violent. ......" ;
				next;
				mes "[Smith Rat]";
				mes "They say he has sharpened nerves and will throw knives at anyone who comes near him. ......" ;
				mes "Our Guildmaster was barely persuaded to join the Rogue guild." ;
				next;
				mes "[smithrat]";
				mes "He was such a guy, but he was good and worked fast. He was especially good at footwork. ......" ;
				next;
				mes "[smithrat]";
				mes "Also, he liked to gamble, so if he liked me for that story, he could teach me a lot." ;
				next;
				mes "[smithrat]";
				mes "Oh, and just in case you want to know the password to get to him." ;
				mes "^3333FF Antonio doesn't like ^000000^3333FF to break refined products. Be careful." ;
				close;
			case 1: //Hermanson Jr.
				set CHANGE_RG,9;
				//not yet investigated
				close;
			case 2: //Aragam Jr
				set CHANGE_RG,10;
				//not investigated
				close;
			case 3: //Holgren Jr
				set CHANGE_RG,11;
				//not investigated
				close;
		}
	case 8:
		mes "[smithrat]";
		mes "What, did you forget where you are?" ;
		mes "Make sure you write it down this time." ;
		next;
		mes "[Smith Rat]";
		mes "The building is on the sandy beach from here towards Comodo, Kokomo Beach." ;
		mes "Meet Antonio Jr." ;
		mes "The password is ^3333FF Antonio doesn't like ^000000^3333FF breaking refined products ^000000";
		close;
	case 9:
		//not investigated
		close;
	case 10:
		//not investigated
		close;
	case 11:
		//not investigated
		close;
	case 12:
		mes "[smithlat]";
		mes "You don't have any more use for this place, do you?" ;
		close;
	}
}


//==========================================
// Secondary Examination (Rogue Visit)
//------------------------------------------

cmd_fild04.gat,304,180,0 script roguewarp0401 45,1,1,{
	mes "[ ]";
	mes "Who is this! What the heck is going on here!" ;
	next;
	for(set '@i,0; '@i<4; set '@i,'@i+1) {
		switch('@i) {
			case 0: setarray '@word$, "Antionio is", "Aragam is", "Antonio is", "Holgren is"; break
			case 1: setarray '@word$, "Refine goods", "Refine goods", "Refine goods", "Refine goods"; break
			case 2: setarray '@word$, "breaking the", "breaking the", "fixing the", "fixing the"; break
			case 3: setarray '@word$, "seems to like", "may like", "doesn't like", "likes", "likes", "doesn't like"; break
		}
		set '@ret['@i],select('@word$[0],'@word$[1],'@word$[2],'@word$[3],'@word$[4],'@word$[5]);
		if('@i == 0)
			mes "["+strcharinfo(0)+"]";
		mes ""+'@word$['@ret['@i]-1]; //The selected item is output as Message.
	}
	next;
	if('@ret[0] == 3 && '@ret[1] == 2 && '@ret[2] == 2 && '@ret[3] == 3) {
		mes "--Kachari--The key has been opened." ;
		close2;
		warp "in_rogue.gat",164,106;
		end;
	}
	mes "[ ]";
	mes "Go away!" ;
	close;
}

cmd_fild07.gat,355,286,0 warp roguewarp0402 1,1,in_rogue.gat,247,126

cmd_fild09.gat,106,195,0 script roguewarp0403 45,1,1,{
	mes "[ ]";
	mes "Who is this! What the hell is going on here!" ;
	next;
	for(set '@i,0; '@i<4; set '@i,'@i+1) {
		switch('@i) {
			case 0: setarray '@word$, "Our father is", "Aragam is", "Aragon is", "Legorlas is"; break
			case 1: setarray '@word$, "Refine goods", "Refine weapons", "Refine supplies", "Refine goods"; break
			case 2: setarray '@word$, "fix", "misappropriate", "take away", "strike", "extract"; break
			case 3: setarray '@word$, "not", "sat", "held", "didn't",""; break
		}
		set '@ret['@i],select('@word$[0],'@word$[1],'@word$[2],'@word$[3],'@word$[4]);
		if('@i == 0)
			mes "["+strcharinfo(0)+"]";
		mes ""+'@word$['@ret['@i]-1]"]; //The selected item is output as Message.
	}
	next;
	if('@ret[0] == 2 && '@ret[1] == 3 && '@ret[2] == 2 && '@ret[3] == 1) {
		mes "--Kachari--The key has been opened." ;
		close2;
		warp "in_rogue.gat",244,25;
		end;
	}
	mes "[ ]";
	mes "Go away!" ;
	close;
}

cmd_fild09.gat,335,143,0 script roguewarp0404 45,1,1,{
	mes "[ ]";
	mes "Who is this! What the hell is going on here!" ;
	next;
	for(set '@i,0; '@i<4; set '@i,'@i+1) {
		switch('@i) {
			case 0: setarray '@word$, "Our father is", "Aragam is", "Aragon is", "Legorlas is"; break
			case 1: setarray '@word$, "Refine goods", "Refine weapons", "Refine supplies", "Refine goods"; break
			case 2: setarray '@word$, "repair", "refine", "break", "steal", "embezzle"; break
			case 3: setarray '@word$, "not", "sat", "held", "did not",""; break
		}
		set '@ret['@i],select('@word$[0],'@word$[1],'@word$[2],'@word$[3],'@word$[4]);
		if('@i == 0)
			mes "["+strcharinfo(0)+"]";
		mes ""+'@word$['@ret['@i]-1]"]; //The selected item is output as Message.
	}
	next;
	if('@ret[0] == 1 && '@ret[1] == 3 && '@ret[2] == 5 && '@ret[3] == 1) {
		mes "--Kachari--The key has been opened." ;
		close2;
		warp "in_rogue.gat",169,34;
		end;
	}
	mes "[ ]";
	mes "Go away!" ;
	close;
}

in_rogue.gat,161,103,0 warp roguewarp0501 1,1,cmd_fild04.gat,302,177
in_rogue.gat,247,122,0 warp roguewarp0502 1,1,cmd_fild07.gat,349,285
in_rogue.gat,244,21,0 warp roguewarp0503 1,1,cmd_fild09.gat,106,191
in_rogue.gat,172,34,0 warp roguewarp0504 1,1,cmd_fild09.gat,341,143

in_rogue.gat,270,130,0 script roguewarp6001 45,1,1,{
	mes "Locked." ;
	mes "Looks like there's a place to put the numbers together." ;
	next;
	input '@val;
	if('@val == 3019) {
		mes "[Hermanson Jr.]";
		mes "I changed my password." ;
	}
	else if('@val ! = 0)
		mes "Nothing happened";
	close;
}

//==============================================================
in_rogue.gat,177,109,2 script Antonio Jr 88,{
	if(Job == Job_Rogue) {
		mes "[Antonio Jr.]";
		mes "What brings you here?" ;
		mes "Since you're here, take a break." ;
		close;
	}
	switch(CHANGE_RG) {
	default:
		mes "[Antonio Jr.]";
		mes "What!" ;
		mes "I thought you were from the Rogue guild!" ;
		mes "No. ......." ;
		mes "Don't come! ...... Don't come here!" ;
		next;
		mes "[Antonio Jr.]";
		mes "You're the one who has a grudge against my family!" ;
		mes "I can't die." ;
		mes "[Antonio Jr.]"; mes "If you don't get out of here, I'll get you!" ;
		close;
	case 8:
	case 9: //Allow 9-11 for now, since all but Antonio's are not yet implemented.
	case 10:
	case 11:
		mes "[Antonio Jr.]";
		mes "You're from the Rogue guild." ;
		next;
		mes "[Antonio Jr.]"
		mes "Did you come here to become a Rogue?" ;
		mes "I'll tell you if that's the case." ;
		next;
		mes "[Antonio Jr.]";
		mes "We Rogue ^3333FF should avoid the ^3333FF strong, and fight the ^000000 against the weak." ;
		mes "Therefore, we have a certain way of carrying ourselves when we face monsters." ;
		next;
		mes "[Antonio Jr.]";
		mes "Even with monsters, the principle is still to aggressively attack the weak and run away from the strong." ;
		next;
		mes "[Antonio Jr.]"
		mes "Now, following this principle, go through the underground channel ^000000 that leads to the ^3333FFRogue guild, and try to reach it safely." ;
		mes "You'll do well with the skills you have." ;
		next;
		if(select("depart", "quit")==2) {
			mes "[Antonio Jr.]";
			mes "I'm busy." ;
			mes "I don't have time for your jokes." ;
			close;
		}
		mes "[Antonio Jr.]"
		mes "Don't drag the guild down with your repeated failures, okay?" ;
		close2;
		set CHANGE_RG,12;
		warp "in_rogue.gat",15,105;
		end;
	case 12:
	case 13: //not implemented except for Antonio, so allow 13-15 for now
	case 14:
	case 15:
		mes "[Antonio Jr.]";
		mes "Yeah ...... It's a residual GHOST." ;
		mes "But I'm not saying anything." ;
		mes "You'll have to figure it out for yourself." ;
		next;
		if(select("departing", "quit")==2) {
			mes "[Antonio Jr.]";
			mes "I'm busy." ;
			mes "Are you going to change jobs?" ;
			close;
		}
		mes "[Antonio Jr.]";
		mes "Then let's send it, good luck." ;
		close2;
		warp "in_rogue.gat",15,105;
		end;
	}
}

//==============================================================
in_rogue.gat,272,135,2 script Hermansson Jr 85,{
	if(Job == Job_Rogue) {
		//not yet investigated
		close;
	}
	switch(CHANGE_RG) {
	default:
		mes "[Hermansson Jr.]";
		mes "Hm? What do you want!" ;
		mes "You're not the guy from the Rogue Guild!" ;
		mes "Here, get out of here ......." ;
		next;
		mes "[Hermanson Jr.]"
		mes "You ...... You're one of those who hate my family too!" ;
		mes "Wait a minute ...... I don't want to die!" ;
		mes "Get out of here!" ;
		mes "Go away or I'll make you !!!!" ;
		close;
	case 9:
		//not yet investigated
		set CHANGE_RG,13;
		close;
	case 13:
		//not investigated
		close;
	}
}

//==============================================================
in_rogue.gat,244,39,5 script aragam Jr 99,{
	if(Job == Job_Rogue) {
		mes "[Aragam Jr.]";
		mes "Yeah? What do you want?" ;
		mes "Since you're here, go rest." ;
		close;
	}
	switch(CHANGE_RG) {
	default:
		mes "[Aragam Jr.]";
		mes "na ...... Nah!" ;
		mes "You're not from the Rogue Guild!" ;
		mes "Go away! ;
		next;
		mes "[Aragam Jr.]";
		mes "Are you one of those who have a grudge against my family ......!" ;
		mes "I cannot die yet." ;
		mes "If you don't go away, I will you!" ;
		close;
	case 10:
		//unexamined
		set CHANGE_RG,14;
		close;
	case 14:
		//not investigated
		close;
	}
}

//==============================================================
in_rogue.gat,160,34,2 script Holgren Jr 85,{
	if(Job == Job_Rogue) {
		mes "[Antonio Jr.]";
		mes "Yo, what can I do for you?" ;
		mes "Well, since you're here, why don't you get some rest?" ;
		close;
	}
	switch(CHANGE_RG) {
	default:
		mes "[Holgren Jr.]";
		mes "!" ;
		mes "You are ...... What the hell!" ;
		mes "You're not from the Rogue Guild!" ;
		next;
		mes "[Holgren Jr.]";
		mes "Gooooooo!" ;
		next;
		mes "[Holgren Jr.]"
		mes "Get out now!" ;
		next;
		mes "[Holgren Jr.]"
		mes "Are you one of those guys who has a grudge against my family?" ;
		mes "Damn it, I can't die here." ;
		mes "Get out! Or I'll take you with me!" ;
		close;
	case 11:
		//not investigated
		set CHANGE_RG,15;
		close;
	case 15:
		//not investigated
		close;
	}
}


//==========================================
// Tertiary (return)
//------------------------------------------

in_rogue.gat,15,185,0 script #RG_Test01 139,8,0,{
	if(CHANGE_RG ! = 12)
		end;
	if(getnpctimer(1, "RG_Timer") == 0) //start timer if it stopped
		initnpctimer "RG_Timer";
	monster "in_rogue.gat",13,188,"--en--",1394,1;
	monster "in_rogue.gat",14,189,"--en--",1394,1;
	monster "in_rogue.gat",15,190,"--en--",1394,1;
	monster "in_rogue.gat",16,188,"--en--",1394,1;
	monster "in_rogue.gat",17,189,"--en--",1394,1;
	monster "in_rogue.gat",18,190,"--ja--",1394,1;
	end;
}

in_rogue.gat,15,245,0 script #RG_Test02 139,8,0,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",13,248,"--en--",1393,1;
	monster "in_rogue.gat",15,248,"--ja--",1393,1;
	monster "in_rogue.gat",17,248,"--ja--",1393,1;
	end;
}

in_rogue.gat,15,333,0 script #RG_Test03 139,8,0,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",15,336,"--en--",1394,3;
	end;
}

in_rogue.gat,35,342,0 script #RG_Test04 139,0,8,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",38,340,"--en--",1393,1;
	monster "in_rogue.gat",37,342,"--en--",1893,1;
	monster "in_rogue.gat",39,342,"--en--",1423,1;
	monster "in_rogue.gat",38,344,"--ja--",1393,1;
	end;
}

in_rogue.gat,57,306,0 script #RG_Test05 139,4,0,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",59,301,"--en--",1438,1;
	end;
}

in_rogue.gat,96,333,0 script #RG_Test06 139,0,4,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",92,325,"--en--",1438,1;
	end;
}

in_rogue.gat,139,313,0 script #RG_Test07 139,4,0,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",139,309,"--en--",1893,1;
	end;
}

in_rogue.gat,135,246,0 script #RG_Test08 139,0,4,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",140,246,"--en--",1394,1;
	monster "in_rogue.gat",141,246,"--en--",1394,1;
	monster "in_rogue.gat",142,246,"--en--",1394,1;
	monster "in_rogue.gat",148,246,"--en--",1394,1;
	monster "in_rogue.gat",149,246,"--en--",1394,1;
	monster "in_rogue.gat",150,246,"--ja--",1394,1;
	end;
}

in_rogue.gat,199,218,0 script #RG_Test09 139,0,8,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",157,218,"--en--",1394,10;
	monster "in_rogue.gat",157,218,"--en--",1893,1;
	monster "in_rogue.gat",157,218,"--en--",1423,1;
	monster "in_rogue.gat",157,218,"--ja--",1420,1;
	end;
}

in_rogue.gat,86,187,0 script #RG_Test10 139,0,8,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",88,190,"--en--",1393,1;
	monster "in_rogue.gat",88,187,"--en--",1393,1;
	monster "in_rogue.gat",88,184,"--ja--",1393,1;
	end;
}

in_rogue.gat,225,187,0 script #RG_Test11 139,0,8,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",232,191,"--en--",1893,1;
	monster "in_rogue.gat",233,190,"--en--",1893,1;
	monster "in_rogue.gat",234,189,"--ja--",1893,1;
	end;
}

in_rogue.gat,252,320,0 script #RG_Test12 139,0,8,{
	if(CHANGE_RG ! = 12)
		end;
	monster "in_rogue.gat",252,319,"--en--",1393,1;
	monster "in_rogue.gat",252,321,"--en--",1393,1;
	monster "in_rogue.gat",252,319,"--en--",1423,1;
	monster "in_rogue.gat",252,321,"--en--",1423,1;
	monster "in_rogue.gat",257,320,"--en--",1420,1;
	monster "in_rogue.gat",248,320,"--ja--",1420,1;
	end;
}

//==============================================================
in_rogue.gat,0,0,0 script RG_Timer -1,{
	end;
OnTimer30000:
	killmonster "in_rogue.gat", "All";
	// stop timer if no one is in the test area
	if(getareausers("this",8,98,23,349) + getareausers("this",24,180,241,349) + getareausers("this",242,312,373,327) == 0)
		stopnpctimer;
	else
		initnpctimer;
	end;
}

//==============================================================
in_rogue.gat,370,320,0 script roguewarp6002 45,1,1,{
	set CHANGE_RG,16;
	warp "in_rogue.gat",378,113;
	end;
}
