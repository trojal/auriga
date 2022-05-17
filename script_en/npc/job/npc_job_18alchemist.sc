//====================================================================
//Ragnarok Online Alchemist jobchange script by Kalen
// - CHANGE_AM
// - CHANGE_AM
// 1 First test (portable blast furnace)
// 2 First exam (berserk potion)
// 3 Passed 1st exam, before talking to Gregory
// 4 Experienced second exam failure, affecting Gregory's pass value.
// 5 Second exam passed, before talking to Darcia.
// 6 During third exam, after hearing the material.
// 7 Passed third exam, before speaking to Van Helmont.
// 8 Talked to Van-Helmont. He comes the solution event.
// 9 Passed the fourth exam, answered the material for the solution. Before talking to Nicholas.
// 10 Failed 5th exam, trying again.
// 11 Passed 5th exam, before talking to Nicholas again.
// 12 Asked to help with an experiment at Yuno. He gives me some materials.
// 13 Completed helping out at Yuno. (Published in npc_town_yuno)
// 14 Pass the 6th exam, experiment help completed. Possible to change jobs.
// 15 Shorten job change by illusory flower
//====================================================================

//==========================================
// Exam application and first exam
//------------------------------------------

alde_alche.gat,27,185,5 script Alchemist Guild Member 744,{
	if(Upper == UPPER_HIGH) {
		mes "[Palmigianino]";
		mes "Welcome." ;
		mes "This is the Alchemists Guild." ;
		mes "We are very busy today." ;
		next;
		mes "[Palmisianino]";
		mes "Hey, have we met before in this city?" ;
		mes "Hmmm, I think I've seen you before: ......" ;
		mes "Is it my imagination? ......" ;
		close;
	}
	if(Job == Job_Alchemist) {
		mes "[Palmigianino]";
		mes "Welcome";
		mes strcharinfo(0)+ "Dear." ;
		mes "The Alchemist Guild is very busy today." ;
		next;
		mes "[Palmisianino]";
		mes "There is a lot of research here on putting life into dolls and on bioengineering." ;
		next;
		mes "[Palmisianino]";
		mes "Everyone is waiting for the success of the research." ;
		mes "It's a complex study, so everyone is busy." ;
		close;
	}
	if(Job ! = Job_Merchant) {
		mes "[Balmigianino]";
		mes "Welcome. This is the Alchemists Guild." ;
		mes "We are always looking for fresh talent." ;
		next;
		mes "[Balmigianino]";
		mes "If you know of any outstanding merchants, please let our guild know." ;
		mes "We are always looking for talented alchemists." ;
		close;
	}
	switch(CHANGE_AM) {
	case 0:
		mes "[Palmigianino]";
		mes "Welcome. This is the Alchemists Guild." ;
		mes "Can I help you?" ;
		next;
		switch (select("What is an alchemist?" , "I want to be an alchemist." , "I don't have any special business.")) {
			case 1:
				mes "[Palmisianino]";
				mes "Alchemists are people who study the creation of new substances using various materials." ;
				mes "They begin by using chemical substances to explore the elements and change their properties." ;
				next;
				mes "[Palmigianino]";
				mes "It is said that the ultimate goal is to create gold, but it is not the only goal. It also involves the manufacture of simple chemicals and the creation of other substances." ;
				next;
				mes "[Palmisianino]";
				mes "Sometimes we study the creation of life, which is the realm of the gods. ......" ;
				mes "It's too difficult a field, so everyone is still researching." ;
				next;
				mes "[Palmisianino]";
				mes "Alchemists have to work more on experimentation and research than on business, so it is very difficult." ;
				next;
				mes "[Palmizzanino]";
				mes "If you are interested in becoming an alchemist, I suggest you become a merchant and gain experience." ;
				mes "[Palmisianino]"; mes "You can gain a lot of knowledge by handling a lot of goods." ;
				close;
			case 2:
				mes "[Palmisianino]";
				mes "Well, I'm glad to hear that." ;
				mes "My name is Palmisianino of the Alchemists' Guild." ;
				next;
				mes "[Palmisianino]";
				mes "If you join our guild and receive the prescribed education, you will be recognized as an alchemist and can officially participate in research activities." ;
				next;
				mes "[Palmisianino]";
				mes "However, not everyone will be recognized. You must be hardworking, curious, and enthusiastic about research." ;
				next;
				mes "[Palmigianino]";
				mes "There are some requirements to join the guild." ;
				mes "We will explain them to you after you apply." ;
				next;
				mes "[Palmisianino]";
				mes "So, would you like to apply for a subscription?" ;
				next;
				if(select("I'm applying." , "I will subscribe later.") ==2) {
					mes "[Palmisianino]";
					mes "Talented merchants are always welcome in our guild." ;
					mes "Please come again." ;
					close;
				}
				if(JobLevel < 40) {
					mes "[Palmigianino]";
					mes "Please wait a moment ......" ;
					mes "It looks like you don't have enough level." ;
					mes "If you want to become an alchemist, you need to have a job level of 40 or higher." ;
					close;
				}
				if(JobLevel >= 50) { // dialogue appropriate, unexamined
					mes "[Palmisianino]";
					mes "Thank you for your application." ;
					mes "You are exempt from the exam because you have been job mastered." ;
					next;
					set CHANGE_AM,3;
					mes "[Palmisianino]";
					mes "Then let's learn the basics of alchemy." ;
					mes "First, I will show you the process of combining chemicals." ;
					next;
					mes "[Palmigianino]";
					mes "Oh, but first, ......." ;
					mes "Gregory would like to see you." ;
					mes "What in the world can I do for you? ......" ;
					mes "Would you like to go there?" ;
					close;
				}
				mes "[Palmigianino]";
				mes "Thank you for your application." ;
				mes "You will have to pay ^3355FF50,000Zeny^000000 to join the guild." ;
				mes "Also, you will need to bring some items with you." ;
				next;
				mes "[Palmigianino]";
				mes "However, if you prepare ^3355FF old magic books^000000 and ^3355FF blacksmith's hammer^000000, we will exempt you from the necessary items." ;
				next;
				mes "[Palmisianino]";
				mes "Then please sign the subscription form." ;
				next;
				menu strcharinfo(0),-;
				mes "[Palmisianino]";
				mes "Then please pay the subscription fee." ;
				mes "You must have the exact items you need, so please Attention." ;
				next;
				if(Zeny < 50000) { //no dialogue yet
					mes "[Palmigianino]";
					mes "There does not seem to be enough money." ;
					close;
				}
				set Zeny,Zeny-50000;
				mes "[Palmigianino]";
				mes "Which is ...... " +strcharinfo(0)+ "which is ......" ;
				if(rand(2)) {
					set CHANGE_AM,1;
					mes "^3355FF portable blast furnace ^000000 100 pieces";
				}
				else {
					set CHANGE_AM,2;
					mes "^3355FF berserk potions^000000 7 of them."
				}
				mes "Please come prepared." ;
				next;
				mes "[Palmisianino]";
				mes "So, the application form has been received." ;
				mes "Then, have a good day." ;
				close;
			case 3:
				mes "[Palmigianino]";
				mes "Well, please come again if you have any business." ;
				close;
		}
	case 1:
	case 2:
		if(countitem(1005) && countitem(1006)) {
			mes "[Balmigianino]";
			mes "Welcome back." ;
			mes "I see you have brought an old magic book and a blacksmith's hammer." ;
			mes "Then you are exempt from the first examination."
			delitem 1005,1;
			delitem 1006,1;
		}
		else {
			if(CHANGE_AM == 1) {
				set '@itemid,612;
				set '@amount,100;
			}
			else {
				set '@itemid,657;
				set '@amount,7;
			}
			if(countitem('@itemid) < '@amount) {
				mes "[Palmigianino]";
				mes "Not ready yet?" ;
				mes "To join the guild ^3355FF" +getitemname('@itemid)+ "^000000 " +'@amount+ "You need to bring the pieces." ;
				next;
				mes "[Palmigianino]";
				mes "Please come back when you are done preparing." ;
				close;
			}
			mes "[Palmigianino]";
			mes "Welcome back." ;
			mes "I see you are ready to go." ;
			mes "I'm sure the items you brought will be put to good use by the guild." ;
			delitem '@itemid,'@amount;
		}
		next;
		set CHANGE_AM,3;
		mes "[Palmisianino]";
		mes "So let's learn the basics of alchemy." ;
		mes "First, I will show you the process of combining chemicals." ;
		next;
		mes "[Palmigianino]";
		mes "Oh, but first, ......." ;
		mes "Gregory would like to see you." ;
		mes "What in the world can I do for you? ......" ;
		mes "Would you like to go there?" ;
		close;
	case 3:
		mes "[Palmisianino]";
		mes "Gregory is waiting for you." ;
		mes "Go and talk to him." ;
		close;
	default:
		mes "[Palmisianino]";
		mes "Oh, I'm sorry." ;
		mes "We are a little busy right now." ;
		next;
		mes "[Palmisianino]";
		mes "Please ask someone else." ;
		mes "Then." ;
		close;
	}
}


//==========================================
// Secondary Examination (written test)
//------------------------------------------

alde_alche.gat,175,107,2 script The dour alchemist 749,{
	if(Job == Job_Alchemist) {
		mes "[Gregory]";
		mes "Kikki, kekeke, what are you?!" ;
		next;
		mes "[Gregory]";
		mes "You're trying to steal my research!" ;
		mes "Where did you hear about this!" ;
		next;
		mes "[Gregory]";
		mes "This guy is using his shallow wits: ......." ;
		mes "But I won't let you have your way." ;
		mes "kiki kiki ke ke ke ke ke ......" ;
		close;
	}
	if(Job ! = Job_Merchant) {
		mes "[Gregory]";
		mes "Kiki Kiki, what can I do for you?" ;
		mes "You want to know what I do? ......" ;
		mes "I'll tell you something special, just for you." ;
		mes "I am the word ......  ;
		next;
		mes "[Gregory]";
		mes "When this potion is completed ......" ;
		mes "You could control a whole country!" ;
		next;
		mes "[Gregory]";
		mes "kiki kekekeke......" ;
		mes "Don't tell the guys at Prontera about this. ......" ;
		close;
	}
	switch(CHANGE_AM) {
	case 0:
		mes "[Gregory]";
		mes "Kiki, kekeke, what are you?!" ;
		next;
		mes "[Gregory]";
		mes "A merchant should have a stall. ......" ;
		mes "What brings you to a place like this?" ;
		next;
		mes "[Gregory]";
		mes "Kiki Kiki ...... Get out." ;
		mes "I have nothing to give you ...... kekekekekekekekekekekekekekekekekekekekekekekekekekekekekekeke";
		close;
	case 1:
	case 2:
		mes "[Gregory]";
		mes "Kiki, kekekekeke, what are you?!" ;
		next;
		mes "[Gregory]";
		mes "You want to learn alchemy? Why don't you only talk in your sleep!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" ;
		next;
		mes "[Gregory]";
		mes "Kekekekeke! Come back in a thousand years!" ;
		mes "Now get the hell out of here!" ;
		close;
	case 3:
		if(JobLevel >= 50) {
			mes "[Gregory]";
			mes "Oh, you're a job master." ;
			mes "Then I ain't got no use for you." ;
			next;
			mes "[Gregory]";
			mes "Then go! See Darcia." ;
			mes "He will teach you the lab exercises." ;
			mes "Tell him I sent you." ;
			set CHANGE_AM,5;
			close;
		}
		mes "[Gregory]";
		mes "Kiki Kiki ...... Some horse's ass has rolled into the guild again!" ;
		next;
		mes "[Gregory]";
		mes "I don't like it ...... I don't like it at all ......." ;
		mes "How dare this guy think he can be an alchemist if he pays for it!!!" ;
		next;
		mes "[Gregory]";
		mes "Kiki Kiki ...... Let me do a little interview for you!" ;
		mes "If you don't have the guts, they'll drive you away Buddha!!!" ;
		next;
		mes "[Gregory]";
		mes "You are stunned... Good, good, good..." ;
		mes "If you thought you could just sit quietly and be briefed, you were naive!" ;
		mes "kiki kiki kiki ......" ;
		next;
		mes "[Gregory]";
		mes "Then answer the questions I give you!" ;
		mes "Let's see how well you can do!" ;
		break;
	case 4:
		mes "[Gregory]";
		mes "What, here we go again." ;
		mes "I told you to get out!" ;
		next;
		mes "[Gregory]";
		mes "I don't like it ...... I don't like it ......! Come sneak in here and ......." ;
		mes "What the hell do you think you're doing!" ;
		next;
		mes "[Gregory]";
		mes "Hmm, well, good." ;
		mes "This Gregory will test you once more ......." ;
		next;
		mes "[Gregory]";
		mes "Then answer the questions I give you!" ;
		mes "Let's see how well you can do!" ;
		break;
	case 5:
		mes "[Gregory]";
		mes "What are you doing? Why don't you study up a little!" ;
		next;
		//fall through?
	default:
		mes "[Gregory]";
		mes "Kikki, kekeke, don't think this is over!" ;
		close;
	}
	//written test starts here
	next;
	for(set '@i,0; '@i<6; set '@i,'@i+1) { //process common until question 6
		mes "[Gregory]";
		if(rand(2)) {
			switch('@i) {
			case 0:
				mes "12 + 23 + 34 + 45 =";
				set '@ans,114;
				break;
			case 1:
				mes "1000 - 36 - 227 - 348 =";
				set '@ans,389;
				break;
			case 2:
				mes "14 x 17 x 3 =";
				set '@ans,714;
				break;
			case 3:
				mes "9765 / 3 / 5 / 7 =";
				set '@ans,93;
				break;
			case 4:
				mes "(47 x 28) - (1376 / 4) =";
				set '@ans,972;
				break;
			case 5:
				mes "(2646 / 7) + (13 x 28) =";
				set '@ans,742;
				break;
			}
		}
		} else {
			switch('@i) {
			case 0:
				mes "13 + 25 + 37 + 48 =";
				set '@ans,123;
				break;
			case 1:
				mes "1000 - 58 - 214 - 416 =";
				set '@ans,312;
				break;
			case 2:
				mes "12 x 24 x 3 =";
				set '@ans,864;
				break;
			case 4:
				mes "(35 x 19) - (1792 / 7) =";
				set '@ans,409;
				break;
			case 5:
				mes "(2368 / 8) + (24 x 17) =";
				set '@ans,704;
				break;
			}
		}
		next;
		input '@val;
		if('@val == '@ans)
			set '@point,'@point+10;
	}
	switch(rand(4)) { //separate processing from the 7th question
		case 0:
			mes "[Gregory]";
			mes "What is the total cost of 12 red potions, 5 fly wings, and 1 butterfly wing at a discount of 24%?" ;
			set '@ans,909;
			break;
		case 1:
			mes "[Gregory]";
			mes "What is the total price when you buy 6 red potions 6 green potions 7 fly wings 8 fly wings at a discount of 24%?" ;
			set '@ans,798;
			break;
		case 2:
			mes "[Gregory]";
			mes "What is the total cost of 15 green potions at 24% discount, 6 magnifiers, 4 traps for installation?" ;
			set '@ans,934;
			break;
		case 3:
			mes "[Gregory]";
			mes "At a discount of 24%, what is the total price when you buy 6 red potions 6 green potions 7 green potions?" ;
			set '@ans,438;
			break;
	}
	next;
	input '@val;
	if('@val == '@ans)
		set '@point,'@point+10;
	switch(rand(3)) {
		case 0:
			mes "[Gregory]";
			mes "What is the total weight of 2 ring-headed swords, 2 caps, 3 boots, 3 weights?" ;
			set '@ans,480;
			break;
		case 1:
			mes "[Gregory]";
			mes "What is the total weight of 3 ring-headed swords, 3 caps, 4 boots, 2 boots?" ;
			set '@ans,550;
			break;
		case 2:
			mes "[Gregory]";
			mes "3 scimitars, 2 helms, 1 long coat, total weight?" ;
			set '@ans,450;
			break;
	}
	next;
	input '@val;
	if('@val == '@ans)
		set '@point,'@point+10;
	switch(rand(3)) {
		case 0:
			mes "[Gregory]";
			mes "What is the sum of Mirror Shield, Leather Jacket Smile, Silk Clove, Veil Scarf, and Eyepiece Defense values?" ;
			set '@ans,12;
			break;
		case 1:
			mes "[Gregory]";
			mes "What is the sum of the viretas, mantle, opera mask ribbon, scarf, boots, and earpiece defense values?" ;
			set '@ans,20;
			break;
		case 2:
			mes "[Gregory]";
			mes "Buckler, long coat, mask big ribbon, ribbon hair band shade, total glass defense value?" ;
			set '@ans,15;
			break;
	}
	next;
	input '@val;
	if('@val == '@ans)
		set '@point,'@point+10;
	switch(rand(3)) {
		case 0:
			mes "[Gregory]";
			mes "What is the difference between buying 5 helms at discount 24% and at discount 20%?" ;
			set '@ans,8800;
			break;
		case 1:
			mes "[Gregory]";
			mes "What is the difference between buying 4 pieces of armor at 24% discount versus 20% discount?" ;
			set '@ans,7680;
			break;
		case 2:
			mes "[Gregory]";
			mes "What is the difference between buying 3 tights at 24% discount and 20% discount?" ;
			set '@ans,8520;
			break;
	}
	next;
	input '@val;
	if('@val == '@ans)
		set '@point,'@point+10;
	if( (CHANGE_AM == 3 && '@point < 90) || (CHANGE_AM == 4 && '@point < 80)) {
		set CHANGE_AM,4;
		mes "[Gregory]";
		mes "...... This is stupid!" ;
		mes "I was stupid to go along to the end!" ;
		mes "You are a failure!!!!" ;
		next;
		mes "[Gregory]";
		mes "It pains me to think that someone who can't even do this kind of math wants to be an alchemist!" ;
		next;
		mes "[Gregory]";
		mes "You're way out of line!" ;
		mes "Get out! Get out!" ;
		mes "Get the fuck out of here !!!!" ;
		close;
	}
	mes "[Gregory]";
	switch('@point) {
		case 100: mes "Hmmm..." ; break;
		case 90: mes "Kekeke ...... You got one question wrong on the way." ; break;
		case 80: mes "kekeke...... You made two mistakes on the way." ; break;
	}
	mes "Oh well. Gregory here is going to give you special recognition ......." ;
	next;
	mes "[Gregory]";
	mes "Kiki kiki ...... Then go." ;
	mes "Study diligently your history, and be of service to me. KikiKiki......" ;
	next;
	mes "[Gregory]";
	mes "Then go! See Darcia." ;
	mes "He will teach you the lab exercises." ;
	mes "Tell him I sent you." ;
	set CHANGE_AM,5;
	close;
}


//==========================================
// Tertiary examination (laboratory practice)
//------------------------------------------

alde_alche.gat,13,15,7 script Researcher 750,{
	if(Job == Job_Alchemist) {
		mes "[Dulcia]";
		mes "Ah ...... It's you. You're here. ...... Yes, that's right." ;
		mes "You've come to be a fine alchemist. ......." ;
		next;
		mes "[Dulcia]";
		mes "But have you had your fantasy flower yet ......?" ;
		mes "Beautiful moonlit flowers ...... Oh ......" ;
		next;
		mes "[dulcia]";
		mes "If only I could see that light, my dear Hannah ......" ;
		mes "Ahahahaha ......" ;
		close;
	}
	switch(CHANGE_AM) {
	default:
		mes "[darcia]";
		mes "Nothing more to lose, nothing more to gain ......" ;
		mes "Nothing at all......" ;
		next;
		mes "[Dulcia]";
		mes "All I see in my cursed eyes is a vision I forgot long ago ahahahahaha ......" ;
		next;
		mes "[dulcia]";
		mes "There is no paradise ...... Yes......" ;
		mes "My dear Hannah ...... Oh ......" ;
		close;
	case 5:
		mes "[Darcia]";
		mes ".............................." ;
		mes ".............................." ;
		mes ".................. Oh ......" ;
		next;
		mes "[Darcia]";
		mes "Is it a wolf? No, a human. ......" ;
		mes "You're looking for something too." ;
		next;
		mes "[Darcia]";
		mes "If you have something important, be careful." ;
		mes "Because you can lose everything you have to gain something. ......" ;
		next;
		mes "[Darcia]";
		mes ".............................." ;
		next;
		mes "[Darcia]";
		mes "...... What's going on, by the way?" ;
		mes "I can't believe you came all this way." ;
		next;
		switch (select("Please give me a lab exercise." , "Please tell me about the flowers." , "It's nothing.")) {
			case 1:
				mes "[Darcia]";
				mes "Have you come to learn alchemy? ......" ;
				mes "All the knowledge I have, I have woven to accomplish my hopes ......" ;
				next;
				mes "[Darcia]";
				mes "I can teach you the basics, but ......" ;
				mes "What you want to do is something you ultimately have to decide for yourself. ......" ;
				next;
				mes "[Darcia]";
				mes "I'll give you the basics: ......" ;
				mes "It's a simple way to make medicine: ......" ;
				mes "Come prepared with some ......" ;
				next;
				mes "[darcia]";
				mes "^3355FF mortar^000000 3 ^3355FF empty bottles^000000 3 ^3355FF red herbs^000000 1 ^3355FF yellow herbs^000000 1 ^3355FF white herbs^000000 1";
				next;
				mes "[dulcia]";
				mes "When you are ready, ...... Come back." ;
				set CHANGE_AM,6;
				close;
			case 2:
				mes "[Darcia]";
				mes "Flowers ...... From memory..." ;
				mes "Faintly fading ......" ;
				mes "There is such a flower ......" ;
				next;
				mes "[dulcia]";
				mes "I have tried to accomplish only one study for the sake of my loved ones ......" ;
				next;
				mes "[dulcia]";
				mes "Let's just say it has to do with wolves and flowers. ......" ;
				mes "I can't give you the details, though. ......" ;
				next;
				mes "[Darcia]";
				mes "So ...... It's a single flower." ;
				mes "It's like a glimpse of paradise. ......" ;
				mes "It's such a mood^3355FF fantasy flower^000000......" ;
				next;
				mes "[Dulcia]";
				mes "I made a homunculus." ;
				mes "I gave birth to a new life from a flower!" ;
				mes "No one believed my research, though." ;
				next;
				mes "[Dulcia]";
				mes "But I was left with nothing: ......." ;
				mes "After that, my time stopped..." ;
				mes "Nothing was left to me. ......" ;
				mes "Then my time stopped... ......" ;
				next;
				mes "[Darcia]";
				mes "Oh ...... Hannah ......" ;
				mes "Where have you gone in those endless fields of beautiful flowers ......" ;
				close;
			case 3:
				mes "[dulcia]";
				mes ".............................." ;
				mes ".............................." ;
				mes "What is important ......" ;
				mes "Don't forget: ......" ;
				close;
		}
	case 6:
		mes "[Darcia]";
		mes ".............................." ;
		mes ".............................." ;
		mes ".................. Oh ......" ;
		next;
		mes "[Darcia]";
		mes "You're the one who said you wanted to learn alchemy. ......" ;
		mes "Yes, you came prepared ......." ;
		next;
		if(countitem(710)) { //exempt to the end if there is an illusion flower
			mes "[dulcia]";
			mes "...... Ah, that's ......! How did you get the flower of illusion to ......!!!" ;
			next;
			mes "[dulcia]";
			mes "Where did you ...... That one flower ......!" ;
			mes "Beautiful ...... Although the light is a little fading ......" ;
			mes "But it is true that it blooms silently in the moonlit night...... A flower of illusion!!!" ;
			next;
			mes "[dulcia]";
			mes "Oh, that flower ...... Show me!!!" ;
			mes "Ah, the flower of illusion ...... Flower of Illusion!!! Uwaaaaaaah!!!" ;
			next;
			mes "[dulcia]";
			mes "I'd like to ...... that flower. Can you give it to me?" ;
			mes "This is that ...... that I was studying." ;
			mes "Of the moonlight!!!" ;
			next;
			if(select("I can't give it to you." , "I brought it to give it to you.") ==1) {
				mes "[Darcia]";
				mes "Well..." ;
				close;
			}
			mes "[Darcia]";
			mes "Oh, really!!! Thank you!!!" ;
			mes "I can't believe you gave me these precious flowers: ......" ;
			mes "Oh, Hannah ...... My dear Hannah ......." ;
			next;
			mes "[Darcia]";
			mes "Yes, ...... Please accept my thanks ......" ;
			mes "I will give you all my knowledge of alchemy!!!" ;
			next;
			mes "[Dulcia]";
			mes "Open your eyes wide and look into my eyes! Do not look away until the end!!!" ;
			next;
			mes "- You have been tapped by Darcia into various -- knowledge about alchemy --"; mes "[Darcia]"; mes "[Darcia]"; mes "[Darcia]"; mes "Darcia]
			next;
			delitem 710,1;
			set CHANGE_AM,15;
			mes "[Darcia]";
			mes "...... Ha, ha, ha you are an alchemist now! Go see your guild leader and cut yourself off from being a merchant!!!" ;
			close;
		}
		if(countitem(7134) < 3 || countitem(713) < 3 || countitem(507) < 1 || countitem(508) < 1 || countitem(509) < 1) {
			mes "[Darcia]";
			mes "...... You forgot to prepare something to come ......" ;
			mes "I'll tell you again, slowly, so this time don't forget to come prepared. ......" ;
			next;
			mes "[darcia]";
			mes "^3355FF mortar^000000 3 ^3355FF empty bottles^000000 3 ^3355FF red herbs^000000 1 ^3355FF yellow herbs^000000 1 ^3355FF white herbs^000000 1";
			next;
			mes "[dulcia]";
			mes "When you are ready, ...... Come back." ;
			close;
		}
		mes "[darcia]";
		mes "Looks like you've got all the ingredients: ......." ;
		mes "As promised, I'll show you how to make medicine: ......" ;
		next;
		mes "[Darcia]";
		mes "First, prepare the mortar ......" ;
		mes "Put the herbs in it ......" ;
		mes "Then slowly crush the herbs ......" ;
		next;
		mes "[dulcia]";
		mes "while adding a little bit of clean water ......" ;
		mes "Gently stir and let it sludge ......" ;
		mes "Add the herbs little by little and mash again......" ;
		next;
		mes "[dulcia]";
		mes "Thus ......" ;
		mes "When the right amount is reached, ......" ;
		mes "Gently put it in an empty bottle. ......" ;
		next;
		delitem 7134,3;
		delitem 713,3;
		delitem 507,1;
		delitem 508,1;
		delitem 509,1;
		mes "[Dulcia]";
		mes "Yes, it's done. Now do exactly as I did it, and try to imitate it." ;
		mes "It's easy. ...... You can do it." ;
		break;
	case 7:
		mes "[Darcia]";
		mes "To Van-Helmont: ......." ;
		mes "Go see him ......" ;
		next;
		mes "[Darcia]";
		mes "Oh, Hannah ...... My darling." ;
		mes "From now on, you won't even see that flower. ......" ;
		mes "I guess my soul is just quietly waiting for the time to come. ......" ;
		close;
	case 15:
		mes "[Darcia]";
		mes "I have nothing more to teach you. ......" ;
		mes "I wish I could tell you more, but..." ;
		mes "I've already ...... I've taught you everything. ......" ;
		mes "Yeah ......" ;
		next;
		mes "[Darcia]";
		mes "You can go see the guild leader upstairs. ......" ;
		mes "Because a sad life as an alchemist awaits you ......" ;
		close;
	}
	//experimental practice here
	next;
	if(select("Prepare mortar." , "Use the mortar for the head." }, "Kick the mortar with your foot." ==1)
		set '@point,'@point+1;
	else {
		mes "[darcia]";
		mes "...... umm";
		next;
	}
	if(select("Put soil in mortar." , "Put the herbs in the mortar." , "Put the harp in the mortar.") ==2)
		set '@point,'@point+1;
	else {
		mes "[dulcia]";
		mes "...... Ah!" ;
		next;
	}
	switch (select("crush herbs." , "Crush mortar." , "Crush dulcinea legs.")) {
		case 1:
			set '@point,'@point+1;
			break;
		case 2:
			mes "[Darcia]";
			mes "...... what!" ;
			next;
			break;
		case 3:
			mes "[Darcia]";
			mes "...... Ouch! What are you doing? ;
			next;
			break;
	}
	switch (select("Shake off the clean water." , "Drink clean water." , "Fill with clean water.")) {
		case 1:
			mes "[Darcia]";
			mes "...... What are you doing?!" ;
			next;
			break;
		case 2:
			mes "[Darcia]";
			mes "...... Are you thirsty?" ;
			next;
			break;
		case 3:
			set '@point,'@point+1;
			break;
	}
	switch (select("Crush herbs." , "Eat the herb." })) {
		case 1:
			set '@point,'@point+1;
			break;
		case 2:
			mes "[Darcia]";
			mes "...... Are you hungry?" ;
			next;
			break;
		case 3:
			mes "[Darcia]";
			mes "...... Have you lost your mind?" ;
			next;
			break;
	}
	switch (select("Put the noodles in the stir fry." , "Put them in an empty bottle." , "Hold the mortar and drink.")) {
		case 1:
			mes "[dulcia]";
			mes "...... Are you hungry?" ;
			next;
			break;
		case 2:
			set '@point,'@point+1;
			break;
		case 3:
			mes "[Darcia]";
			mes "...... Have you recovered?" ;
			next;
			break;
	}
	if('@point < 6) {
		mes "[Darcia]";
		mes ".................." ;
		next;
		mes "[Darcia]";
		mes "...... You've lost all your ingredients." ;
		mes "...... Come back and prepare again." ;
		close;
	}
	getitem 501,1;
	getitem 503,1;
	getitem 504,1;
	set CHANGE_AM,7;
	mes "[dulcia]";
	mes "...... Well done. You did well for a first time. ...... Take this one to the journal GHOST." ;
	next;
	mes "[Dulcia]";
	mes "Go see Van-Helmont in the next room ......." ;
	mes "A little more ...... He will tell you." ;
	mes "Ask him for further instruction. ......" ;
	next;
	mes "[Darcia]";
	mes "Do not forget ......" ;
	mes "The best for me ......" ;
	mes "What is important to you ......" ;
	mes "What are the things you have to protect......" ;
	close;
}


//==========================================
// Fourth test (quest request)
//------------------------------------------

alde_alche.gat,79,19,5 script Experimental Expert 748,{
	if(Job == Job_Alchemist) {
		mes "[Van=Helmont]";
		mes "What the heck, I'm busy right now! Why don't you hurry up and tell me what you need?" ;
		next;
		mes "[Van-Helmont]";
		mes "Ah yes, I know you're happy to be an alchemist, but ...... You can't develop and improve if you keep getting excited." ;
		next;
		mes "[Van=Helmont]";
		mes "Yes, so work hard and study biotechnology." ;
		mes "[Van-Helmont]"; mes "[Van-Helmont]"; mes "[Van-Helmont]"; mes "[Van-Helmont]" ;
		close;
	}
	switch(CHANGE_AM) {
	default:
		mes "[Van=Helmont]";
		mes "Almost there... Almost there. ......" ;
		mes "Oh, I'm so close to getting it done!" ;
		next;
		mes "[Van=Helmont]";
		mes "Why, why did I fail!!!! I didn't do a single thing wrong!" ;
		mes "Why on earth! Why!!!" ;
		next;
		mes "[Van=Helmont]";
		mes "Do I have to get the materials again ......" ;
		mes "But one day it will be finished huff ......" ;
		close;
	case 7:
		mes "[Van=Helmont]";
		mes "ugh ...... What the hell is wrong with ......." ;
		mes "How do I... Here this and there that ......" ;
		mes "It's certainly right in theory, but ......" ;
		mes "Why does it stop?" ;
		mes "What's wrong with ......?" ;
		next;
		mes "[Van=Helmont]";
		mes "Yes, even though you have to stop when you pour the solution here ......" ;
		mes "It won't stop ............" ;
		mes "Such a beginner's mistake ...... Yeah, sometimes you have to change your method ......" ;
		next;
		mes "[Van=Helmont]";
		mes "Yes, just fix this part." ;
		mes "You don't have to start over!" ;
		mes "Yes, if the result is good: ......." ;
		mes "...... Hey, hey, hey, ah !!!!." ;
		set CHANGE_AM,8;
		break;
	case 8:
		mes "[Van=Helmont]";
		mes "So, cut off the tentacles here and mix a little of the sticky liquid with a little of the sticky liquid and put it in the Xeropy solution prepared in the test tube ...... Huh?" ;
		mes "Where did the mortar go ......?" ;
		next;
		mes "[Van=Helmont]";
		mes "Oh, I must have used the last one." ;
		mes "Nicholas's, I wonder if he has it: ......." ;
		mes "I can't be bothered to go borrow it. ......" ;
		break;
	case 9:
		mes "[Van=Helmont]";
		mes "What are you doing, get the hell out of here." ;
		mes "There is nothing more to teach you from me." ;
		next;
		mes "[Van-Helmont]";
		mes "See Nicholas in the next room." ;
		mes "I have to continue my research." ;
		close;
	}
	//quest request here
	next;
	mes "[Van=Helmont]";
	mes ".............................." ;
	next;
	mes "[Van-Helmont]";
	mes "............ What the hell are you?" ;
	next;
	if(select("I am an aspiring alchemist student." ,"............") ==2) {
		mes "[Van=Helmont]";
		mes "You're here to see the sights. ......" ;
		mes "If you're here to watch, stay where you are." ;
		next;
		mes "[Van Helmont]";
		mes "I don't want you touching this and that for no reason." ;
		mes "Just don't get in my way." ;
		next;
		if(select("Tell me a little something." ,"............") ==1) {
			mes "[Van=Helmont]";
			mes "Didn't I just now tell you not to interrupt me?" ;
			mes "Not at all, you're taking up a lot of my time just to listen to you... Mumm." ;
			next;
			mes "[Van-Helmont]";
			mes "Okay, here's the assignment." ;
			mes "Go outside and do a little studying." ;
			mes "Right. ...... Ummm ......." ;
			next;
			mes "[Van-Helmont]";
			mes "Yes, go see Morgenstein and learn how to make neutralizers and mixtures." ;
			next;
			mes "[Van-Helmont]";
			mes "You don't have to bring the goods." ;
			mes "[Van-Helmont]"; mes "[Van-Helmont]"; mes "[Van-Helmont]"; mes "[Van-Helmont]"; mes "[Van-Helmont]"; mes "Go take a good look at him handling the chemicals. You got it." ;
			next;
			mes "[Van Helmont]";
			mes "Go on, then." ;
		}
		else {
			mes "[Van-Helmont]";
			mes ".............................." ;
			next;
			mes "[Van-Helmont]";
			mes ".............................." ;
			next;
			mes "[Van Helmont]";
			mes ".............................." ;
			next;
			mes "[Van-Helmont]";
			mes "...... What the hell are you?" ;
			next;
			mes "[Van-Helmont]";
			mes "I don't know who you are, but get the hell out of here!" ;
			mes "This is my room, you know." ;
			next;
			mes "[Van=Helmont]"
		}
		mes "Look, he went quickly!" ;
		mes "Foy!!!" ;
		close;
	}
	mes "[Van-Helmont]";
	mes "Ah, the merchant who came in the other day." ;
	mes "I hope you've learned your lesson." ;
	mes "I hope you didn't come here just for fun. ......" ;
	next;
	mes "[Van=Helmont]";
	mes "Then let's hear and see some of them." ;
	mes "As you have seen, you may answer." ;
	next;
	if(DYE_EVE < 3) { //issued in npc_event_dye.txt
		mes "[Van=Helmont]";
		mes "The item needed when making the neutralizer is ";
		next;
		menu "soft hair",-, "sticky liquid",-, "livestock blood",-;
		mes "[Van=Helmont]";
		mes "When making the mixture, the items needed are ";
		next;
		menu "monster bait",-, "ancient fish lips",-, "wedged bandages",-;
	}
	else {
		mes "[Van=Helmont]";
		mes "Items not needed when making neutralizers are";
		next;
		if(select("carbodil", "ditrimin", "alcohol")==1)
			set '@point,'@point+1;
		mes "[Van=Helmont]";
		mes "Items not needed when making mixtures are";
		next;
		if(select("carbodil", "ditrimin", "alcohol")==2)
			set '@point,'@point+1;
	}
	if('@point < 2) {
		mes "[Van=Helmont]";
		mes "...... Frankly, it's offensive." ;
		mes "I certainly told you to go learn from Morgenstein. ......" ;
		next;
		mes "[Van Helmont]";
		mes "I have no words for you at all!" ;
		mes "I can't believe you came back without learning anything or thinking!" ;
		mes "You're in my way, get the hell out of my way!" ;
		close;
	}
	mes "[Van=Helmont]";
	mes "Yeah, you're well aware of that." ;
	mes "Yes, it's important to understand the chemicals." ;
	mes "Those are the things that will protect you in your research for a long time." ;
	next;
	mes "[Van-Helmont]";
	mes "Go outside as it is and see Nicholas in the next room." ;
	mes "[Van-Helmont]"; mes "[Van-Helmont]"; mes "He'll tell you more things." ;
	next;
	mes "[Van-Helmont]";
	mes "What are you doing, get going." ;
	mes "There is nothing more to teach you from me." ;
	set CHANGE_AM,9;
	close;
}


//==========================================
// Fifth test (magic circle test)
//------------------------------------------

alde_alche.gat,145,19,1 script Chief researcher 57,{
	switch(CHANGE_AM) {
	default:
		mes "[Nicholas-Plamer]";
		mes "This is what happens here: ......" ;
		mes "If we assign that here, this is what happens, so if we put this over here, we get ......" ;
		mes "So here is ......" ;
		mes "...... butb ......" ;
		close;
	case 9:
		mes "[Nicholas-Plamer]";
		mes "You are the merchant who wants to become an alchemist?" ;
		mes "But you know, ...... Not everyone can be an alchemist." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "It is not permissible to dabble in alchemy half-heartedly." ;
		mes "That's why we're testing your brains in the guild." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "As I'm sure you've figured out in the process so far, the knowledge of formulas and chemical formulas required for alchemy is extraordinary." ;
		next;
		mes "[Nicholas-Plamere]";
		mes "We can't afford to train alchemists who will just keep repeating failed experiments and not benefit the guild." ;
		mes "Ha ha ha!" ;
		set CHANGE_AM,10;
		next;
		//fall through
	case 10:
		mes "[Nicholas-Plamer]";
		mes "Now, the alchemist will need many abilities." ;
		mes "Memory, concentration and calculation: ......" ;
		mes "And the ability to conceive." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "From now on, I'm going to test how much of an alchemist you are." ;
		mes "First, let's have a look at the following table." ;
		next;
		mes "";
		mes "15.15.15.1515.□. □. □15.□. □. □15.□. □. □.15";
		next;
		mes "[Nicholas-Plamer]";
		mes "You had a row of 15 numbers, one vertical and one horizontal, and three squares of □, one vertical and one horizontal." ;
		mes "You have to fit these squares one by one with the numbers from 1 to 9 to complete the table." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "There is a rule, however: the numbers you fit must be added together in the vertical, horizontal, and diagonal columns, all adding up to a total of 15." ;
		mes "The way to answer is as follows." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "1. 2. 34. 5. 67. 8. 9If If you fit it this way, enter the numbers in the answer column in the order 123456789." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "If you take too long, I'll have to abort, so Attention." ;
		mes "Then let's have it done." ;
		mes "I'll show you the table again." ;
		next;
		mes "";
		mes "15.15.15.1515.□. □. □15.□. □. □15.□. □. □";
		next;
		mes "[Nicholas-Plamer]";
		mes "Then let's have him answer." ;
		next;
		input '@num;
		if('@num <= 0) {
			mes "[Nicholas-Plamer]";
			mes "That is not an answer." ;
			close;
		}
		if('@num==618753294 || '@num==816357492 || '@num==276951438 || '@num==672159834 || '@num==492357816
							|| '@num==294753618 || '@num==834159672 || '@num==438951276) {
			mes "[Nicholas-Plamer]";
			mes "Correct." ;
			mes "I'll let you move on to the next test, but talk to me again in a little while because I have some preparations to do." ;
			set CHANGE_AM,11;
		}
		else {
			mes "[Nicholas-Plamer]";
			mes "hmmm ......" ;
			mes "Incorrect." ;
			mes "Take your time and think about it." ;
		}
		close;
	case 11:
		mes "[Nicholas-Plamer]";
		mes "Next, there is a place you must go." ;
		mes "Visit the brothers 'Baan' or 'Bazin', who are studying alchemy with Sage and the others in the 'Wise City of Yuno'." ;
		mes "Go and help him with his research." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "Now, take this with you." ;
		mes "It will help you to get to know them." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "1 mixing agent, 5 pieces of burned wood, 5 pieces of clean sand, 3 each of Oridecon and Elunium";
		getitem 974,1;
		getitem 7068,5;
		getitem 7043,5;
		getitem 756,3;
		getitem 757,3;
		set CHANGE_AM,12;
		next;
		mes "[Nicholas-Plamer]";
		mes "I wish you a safe journey to Juno. Have a good day." ;
		close;
	case 12:
		mes "[Nicholas Plamere]";
		mes "Visit the brothers 'Baan' or 'Bazin', who are studying alchemy with Sage and the others in the 'Wise City of Yuno'." ;
		mes "Go and help him with his research." ;
		close;
	case 13:
		mes "[Nicholas-Plamer]";
		mes "I'm sorry you had a long trip." ;
		mes "I have received a letter from brothers "Baan" and "Bazin" saying you were very helpful." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "I see that you have been successful in your research." ;
		mes "If you're good enough to help them and their brothers with their research, ......." ;
		mes "Mm, I have no doubt that you are well qualified." ;
		next;
		mes "[Nicholas-Plamer]";
		mes "You can go upstairs and see the guild leader." ;
		mes "Rejoice! You're only a few days away from your new job!" ;
		set CHANGE_AM,14;
		close;
	case 14:
		mes "[Nicholas-Plamer]";
		mes "You can go upstairs to see the head of the guild." ;
		mes "Rejoice! You only have a few days left until your new job!" ;
		close;
	}
}


//==========================================
// Sixth test (experimental help)
//------------------------------------------

// see npc_town_yuno.txt


//==========================================
// Job transfer
//------------------------------------------

alde_alche.gat,101,184,4 script Master Alchemist 122,{
	cutin "job_alche_vincent",2;
	if(Job == Job_Novice) {
		mes "[Vincent-Kershal]";
		mes "Go that way, child." ;
		mes "You'll get hurt if you play here." ;
		next;
		mes "[Vincent-Kershal]";
		mes "There are a lot of dangerous things here." ;
		mes "Come on, come on, go outside and play." ;
		close2;
		cutin "job_alche_vincent",255;
		end;
	}
	if(Job == Job_Alchemist) {
		mes "[Vincent-Kershal]";
		mes "How is your research going?" ;
		mes "Be sure to be Attentive enough when handling the chemicals." ;
		next;
		mes "[Vincent-Kershal]";
		mes "Sometimes experiments yield results that could not be predicted!" ;
		mes "It is also necessary to perform many experiments." ;
		next;
		mes "[Vincent-Kershal]";
		mes "If you are able to create new life, be sure to let the guild know." ;
		mes "[Vincent-Kershal]"; mes "Everyone else is working diligently on it." ;
		mes "Good luck to you too!" ;
		close2;
		cutin "job_alche_vincent",255;
		end;
	}
	if(Job ! = Job_Merchant) {
		mes "[Vincent-Kershal]";
		mes "What business does a civilian have in a place like this?" ;
		next;
		mes "[Vincent-Khashal]";
		mes "This is not a freak show." ;
		mes "Don't hang around, go somewhere else." ;
		close2;
		cutin "job_alche_vincent",255;
		end;
	}
	switch(CHANGE_AM) {
	case 0:
		mes "[Vincent-Kershal]";
		mes "Yeah merchant." ;
		mes "You're interested in alchemy." ;
		next;
		mes "[Vincent-Kershal]";
		mes "We, the Alchemists' Guild, study various substances." ;
		mes "The goal is to obtain new results in a different way than magic." ;
		next;
		mes "[Vincent-Kershal]";
		mes "I'm working on creating new life, studying old age and undead, making new matter out of mundane matter, etc." ;
		next;
		mes "[Vincent-Kershal]";
		mes "When you live long enough as a merchant, your interest in all things increases." ;
		mes "If you want to learn alchemy, join our guild." ;
		break;
	default: //when 1-13
		mes "[Vincent-Kershal]";
		mes "I see you've applied to join ......." ;
		mes "Keep up your research and always have high aspirations." ;
		next;
		mes "[Vincent-Kershal]";
		mes "Remember to seek advice from the alchemists who have gone before you. There is much to be gained from the knowledge of others." ;
		break;
	case 14:
	case 15:
		if(Upper == UPPER_HIGH) //not investigated?
			break;
		if(SkillPoint) {
			mes "[Vincent=Kershal]";
			mes "Looks like there are some SkillPoints you haven't used yet." ;
			mes "Use them all, then come back." ;
			break;
		}
		mes "[Vincent-Kershal]";
		mes "Well, well. I see you have joined and learned the necessary basic knowledge. Thank you." ;
		next;
		unequip;
		jobchange Job_Alchemist;
		set CHANGE_AM,0;
		mes "[Vincent-Kershal]";
		mes "From now on you are an alchemist and a member of our guild." ;
		mes "Study hard and always have high aspirations." ;
		next;
		getitem 7127,1;
		mes "[Vincent-Kershal]";
		mes "I give you this specially for you." ;
		next;
		mes "[Vincent-Kershal]";
		mes "Then we shall meet again, shall we not?" ;
		mes "As an alchemist, don't forget to hone your skills!" ;
		break;
	}
	close2;
	cutin "job_alche_vincent",255;
	end;
}


//==========================================
// item sales for pharmacy
//------------------------------------------

alde_alche.gat,24,188,2 script guild merchant 740,{
	mes "[alsharp]";
	mes "Welcome!" ;
	next;
	switch (select("Buy a mortar." mes "[Alsharpe]"; mes "[Alsharpe]"; mes "[Alsharpe]"; mes "Welcome! , "Quit")) {
	case 1:
		mes "[alsharp]";
		mes "What would you like to purchase?" ;
		next;
		if(select("mortar - 8z", "abort transaction.") ==2)
			break;
		mes "[alsharp]";
		mes "How many do you need?" ;
		mes "If you want to abort the transaction, write "0"." ;
		while(1) {
			next;
			input '@num;
			if('@num <= 0) {
				mes "[alsharp]";
				mes "The transaction has been aborted." ;
				mes "Please come back when you need us." ;
				close;
			}
			if('@num > 1000) {
				mes "[alsharp]";
				mes "Less than 1000 pieces, please." ;
				continue;
			}
			break;
		}
		if(Zeny < '@num*8) {
			mes "[alsharp]";
			mes "Not enough money";
			close;
		}
		if(checkweight(7134,'@num)==0) {
			// is there a weight check? Unknown, not investigated
			close;
		}
		set Zeny,Zeny-'@num*8;
		getitem 7134,'@num;
		break;
	case 2:
		mes "[alsharp]";
		mes "Which item would you like?" ;
		mes "The book of manufacture is 240,000 Zeny for the book of slim potion manufacture; the other books are 100,000 Zeny." ;
		next;
		switch (select("Book of Potion Manufacturing", "Book of Alcohol Manufacturing", "Book of Fire Bottle Manufacturing", "Book of Acid Bottle Manufacturing",
				"Book of Plant Bottle Making", "Book of Mine Bottle Making", "Book of Coating Potion Making", "Book of Slim Potion Making", "Suspend Transaction")) {
			default:
				set '@price,100000;
				break;
			case 8:
				set '@price,240000;
				break;
			case 9:
				mes "[alsharp]";
				mes "Please come back later." ;
				close;
		}
		if(Zeny < '@price) {
			mes "[alsharp]";
			mes "The transaction has been aborted." ;
			mes "Please come back when you need it." ;
			close;
		}
		set Zeny,Zeny-'@price;
		setarray '@itemid,7144,7127,7128,7129,7130,7131,7132,7133;
		getitem '@itemid[@menu-1],1;
		mes "[alsharp]";
		mes "Thank you for using our service." ;
		close;
	case 3:
		break;
	}
	mes "[alsharp]";
	mes "Please come back later." ;
	close;
}
