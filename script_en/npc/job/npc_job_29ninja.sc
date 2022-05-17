//====================================================================
//Ragnarok Online Ninja Jobchange Script
// - CHANGE_NJ -> 0-4
//====================================================================

//==========================================
// Shop
//------------------------------------------
que_ng.gat,73,26,5 shop Bunray 83,2117,2171,15053,7521,7522,7523,7524,6512,6513,6514,6515
que_ng.gat,72,31,3 shop Bunge 83,13250,13251,13252,13253,13254,6493
prontera.gat,178,244,3 shop Amatsu traders 83,13250,13251,13252,13253,13254,6493,2117,2171,15053,7521,7522,7523,7524,6512,6513,6514,6515

//==========================================
// Guide
//------------------------------------------
alberta.gat,30,65,3 script redwood 730,{
	if(Job == Job_Ninja) {
		mes "[Akagi]";
		mes "How are you doing?" ;
		mes "You never know when or where a mission will be given to you." ;
		mes "Don't neglect your training." ;
		close;
	}
	if(Job ! = Job_Novice || Upper ! = UPPER_NORMAL) {
		mes "[redwood]";
		mes "I am not interested in you." ;
		mes "Leave." ;
		close;
	}
	if(JobLevel < 10) {
		mes "[redwood]";
		mes "This is no place for a powerless one like you." ;
		close;
	}
	mes "[redwood]";
	mes "Nun......" ;
	mes "To come to such a dark alley ......" ;
	mes "Perhaps something you have led you here." ;
	mes "You ......" ;
	mes "Are you willing to follow the path of the Shinobi?" ;
	next;
	if(select("No", "Yes, I'm going")==1) {
		mes "[Akagi]";
		mes "I see. ......" ;
		mes "............" ;
		mes "Then I have nothing else to say." ;
		close;
	}
	mes "[redwood]";
	mes "Good." ;
	mes "Then I will send you on your way." ;
	close2;
	switch(rand(3)) {
	case 0:
		warp "amatsu.gat",170,229;
		end;
	case 1:
		warp "amatsu.gat",216,188;
		end;
	case 2:
		warp "amatsu.gat",178,164;
		end;
	}
}

alberta.gat,168,138,3 script captain 99,{
	if(Job ! = Job_Novice || Upper ! = UPPER_NORMAL || JobLevel < 10) {
		mes "[Captain]";
		mes "...... Mm!" ;
		mes "Clear skies today!" ;
		mes "Good day for a boat trip!" ;
		close;
	}
	mes "[captain]";
	mes "...... Mm!" ;
	mes "Clear skies today!" ;
	mes "Good day for a boat trip!" ;
	next;
	menu "What are you doing?" ,-;
	mes "[Captain]";
	mes "I am waiting for a Novice who wants to cross the ocean to become a Ninja and go to Amatsu!" ;
	next;
	mes "[captain]";
	mes "Hmm?" ;
	mes "Looking closer, you are also a Novice, aren't you?" ;
	next;
	mes "[Captain]";
	mes "Are you interested in Ninja?" ;
	mes "Now I can send you to Amatsu for only 200 Zeny!" ;
	next;
	if(select("Not interested", "Please") == 1) {
		mes "[captain]";
		mes "Hmmm ......" ;
		mes "Then come back anytime if you change your mind!" ;
		close;
	}
	if(Zeny < 200) {
		mes "[Captain]";
		mes "......?" ;
		mes "Remaining GHOST, but I don't think I have enough money." ;
		mes "Come back with some money!" ;
		close;
	}
	mes "[captain]";
	mes "That's the way to do it!" ;
	mes "Then we must sail now!" ;
	close2;
	set Zeny,Zeny-200;
	warp "amatsu.gat",113,127;
	end;
}

//==========================================
// test application
//------------------------------------------
que_ng.gat,30,65,3 script Kuga Kai 730,{
	if(Job == Job_Ninja || Job == Job_Kagerou || Job == Job_Oboro) {
		mes "[Kuga Kai]";
		mes "How are you doing?" ;
		mes "You never know when or where a mission will be given to you." ;
		mes "Don't neglect your training." ;
		next;
		mes "[Kuga Kai]";
		mes "--Yes, I know a good place to do my training." ;
		mes "Have you been to a place called the Adventurer's Academy after you became a Ninja?" ;
		next;
		mes "[Kuga Kai]";
		mes "After becoming a Ninja, if you have never been there, there should be someone outside this building who supports the Adventurer's Academy." ;
		mes "You can ask them to send you there." ;
		close;
	}
	if(Upper == Upper_BABY) {
		mes "[Kuga Kai]";
		mes "Nah!" ;
		mes "There's a child here ......" ;
		mes "Stupid ......" ;
		mes "Was my technology at a level where a child could find it ......" ;
		close;
	}
	if(Job ! = Job_Novice || Upper == Upper_HIGH) {
		mes "[Kuga Kai]";
		mes "What are you!" ;
		mes "I don't know where you came from, but I have no use for you." ;
		mes "Get the hell out of my sight." ;
		close;
	}
	if(JobLevel < 10) {
		mes "[Kuga Kai]";
		mes "I'm not trained enough yet!" ;
		mes "Come back!" ;
		mes "Go get your Job level to 10 first!" ;
		mes "Then, you will get your ^0000FF "Basic Skill" level to 9 ^000000!" ;
		next;
		mes "[Kuga Kai]";
		mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^0000FF "Skill List" ^000000 window!" ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Kuga Kai]";
		mes "To increase the level of a skill, the ^FF000000 'Fix' ^000000 button is required after assigning the skill points." ;
		mes "Attention is required." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	switch(CHANGE_NJ) {
	case 0:
		mes "[" +strcharinfo(0)+ "]";
		mes "Hello?" ;
		next;
		mes "[Kuga Kai]";
		mes "...... MU?" ;
		mes "Na, nannyyyy!" ;
		mes "When did you do that?" ;
		next;
		mes "[Kuga Kai]";
		mes "Triya!" ;
		next;
		mes "-The man suddenly threw something at me-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Wow!" ;
		mes "Oh, no!" ;
		mes "What are you doing!" ;
		next;
		mes "[Kuga Kai]";
		mes "Nu ......?" ;
		mes "Looks like you're not the assassin who came to kill me." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "What is that!" ;
		mes "I'll be damned if I'm going to be attacked because of a misunderstanding!" ;
		next;
		mes "[Kuga Kai]";
		mes "Damn!" ;
		mes "My eternal rival, the guy with the wild sheep!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ".................." ;
		next;
		mes "[Kuga Kai]";
		mes "Woah!" ;
		mes "Ha!  Saiya!" ;
		mes "Talya!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-I don't think I heard anything-";
		next;
		mes "[Kuga Kai]";
		mes "Mu......?" ;
		mes "Nuh!" ;
		mes "You're still here!" ;
		mes "Tay!  Ha ha!  Yah!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Wah wah wah!" ;
		mes "Please stop already!" ;
		mes "And now the technique is ......." ;
		next;
		mes "[Kuga Kai]";
		mes "Nunununu ......" ;
		mes "That's pretty good." ;
		mes "You have deflected all my jutsu. ......" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-What is this man ...... -";
		next;
		mes "[Kuga Kai]";
		mes "Mu ...... Yes." ;
		mes "Speaking of which, you, what do you want from me?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ".................." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "e...... a ......" ;
		mes "Yes." ;
		mes "I'm here to change jobs at Ninja." ;
		next;
		mes "[Kuga Kai]";
		mes "Hoho ......." ;
		mes "Isn't that a good mindset?" ;
		mes "But!  But!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "............" ;
		next;
		mes "[Kuga Kai]";
		mes "You are not yet Ninja." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "...... Why?" ;
		next;
		mes "[Kuga Kai]";
		mes "I don't know anything about you." ;
		mes "So I don't trust you." ;
		mes "Furthermore, in my eyes, you are not experienced enough to live as a Ninja!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ".................." ;
		next;
		mes "[Kuga Kai]";
		mes "...... But ......" ;
		mes "You can't be Ninja." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ".................." ;
		next;
		mes "[Kuga Kai]";
		mes "As you can see, I'm a very busy man." ;
		next;
		mes "[Kuga Kai]";
		mes "Besides, I have a lot of enemies around me." ;
		mes "I can't move that easily." ;
		next;
		mes "[Kuga Kai]";
		mes "And I have to train for a duel with him." ;
		mes "Taa-ryaaa!" ;
		next;
		mes "[Kuga Kai]";
		mes "I'll win next time!" ;
		mes "Wait for me, wild goat!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Wild goat?" ;
		mes "You fight sheep?" ;
		next;
		mes "[Kuga Kai]";
		mes "What?" ;
		mes "Oh, hahaha." ;
		mes "Wild sheep is a nickname." ;
		mes "The other guy is a human being." ;
		next;
		mes "[Kuga Kai]";
		mes "He's a shrewd guy." ;
		mes "He will stop at nothing to win." ;
		mes "Moreover, the ninjutsu he uses is strangely strong." ;
		next;
		mes "[Kuga Kai]";
		mes "But he and I are both just out of shurikens and kunai." ;
		mes "We're in no condition to fight properly." ;
		mes "Hahaha." ;
		next;
		mes "[Kuga Kai]";
		mes "Speaking of which, you." ;
		mes "If you really want to be a Ninja, I'll give you one mission." ;
		mes "If you succeed in your mission, I will teach you the art of Ninja." ;
		mes "How about it?" ;
		next;
		if(select("accept", "decline")==2) {
			mes "[" +strcharinfo(0)+ "]";
			mes "It doesn't matter how much you learn just technology." ;
			mes "I'm sorry, but please ask someone else to do it." ;
			next;
			mes "[Kuga Kai]";
			mes "Nu ...... I see." ;
			mes "Okay." ;
			mes "Looks like I wasted my time." ;
			mes "Now, if you have no use for me, get out of here." ;
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "umm ......" ;
		mes "Okay, I understand." ;
		next;
		mes "[Kuga Kai]";
		mes "I see." ;
		mes "So, I'm going to deliver this letter to this guy called Wild Sheep." ;
		next;
		mes "[Kuga Kai]";
		mes "The gist of the contents is that we should make a temporary truce until we are both ready." ;
		mes "Be sure to get a reply and come back to me." ;
		next;
		mes "[Kuga Kai]";
		mes "According to my information, he went to Einbroch." ;
		mes "I don't know why he went there, but ......." ;
		next;
		mes "[Kuga Kai]";
		mes "He's good at disguises, too." ;
		mes "He will be hard to find." ;
		next;
		mes "[Kuga Kai]";
		mes "But I do have one thing in mind." ;
		mes "He likes heights." ;
		mes "You should look for those places often." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Roger that." ;
		mes "Then, I'm off!" ;
		set CHANGE_NJ,1;
		setquest 6015;
		close;
	case 1:
		mes "[Kuga Kai]";
		mes "Nun_......" ;
		mes "Not so urgent mission, but for you it would be better to hurry." ;
		next;
		mes "[Kuga Kai]";
		mes "Because you never know how long the wild sheep will be in Einbroch." ;
		close;
	case 2:
		mes "[Kuga Kai]";
		mes "Don't forget to receive my reply." ;
		close;
	case 3:
		mes "[Kuga Kai]";
		mes "Did you get the reply?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Yes, here." ;
		next;
		mes "[Kuga Kai]";
		mes "Okay, let's get on with the reading." ;
		mes "-goso ...... -";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-I'm reading the letter I brought -";
		next;
		mes "[Kuga Kai]";
		mes "Hey, what the hell!" ;
		mes "No truce? No way. ......" ;
		mes "You already made kunai!" ;
		mes "Damn ...... I can't keep doing this." ;
		next;
		mes "[Kuga Kai]";
		mes "Sorry, one more mission." ;
		mes "I have to make the weapons I need for my duel with him." ;
		mes "I'm running out of materials." ;
		next;
		mes "[Kuga Kai]";
		mes "If you gather the materials, I will recognize your abilities and make you Ninja!" ;
		next;
		mes "[Kuga Kai]";
		mes "The materials you will gather are 1 Phracon and 30 iron ore." ;
		mes "Hurry up, we don't have much time." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "...... Ah!" ;
		mes "That's!" ;
		next;
		mes "[Kuga Kai]";
		mes "What's up?" ;
		mes "What's the problem?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I gave that material to Mr. Leopard to give to ......." ;
		next;
		mes "[Kuga Kai]";
		mes "What? So you helped him!" ;
		mes "Here, here, here, here, you careless bastard!" ;
		mes "Idiot!  Dumbass!" ;
		next;
		mes "[Kuga Kai]";
		mes "...... No. ......" ;
		mes "This is a good kicker. ......" ;
		next;
		mes "[Kuga Kai]";
		mes "Anyway, now that you've helped him, you'll definitely be helping me too!" ;
		mes "Come on, get going!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "E...... a ...... Yes!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-Let's go find 1 Phracon and 30 iron ore-";
		set CHANGE_NJ,4;
		chgquest 6017,6018;
		close;
	case 4:
		if(countitem(1010) < 1 || countitem(1002) < 30) {
			mes "[Kuga Kai]";
			mes "Bring 1 Phracon and 30 iron ore." ;
			mes "Hurry up." ;
			close;
		}
		if(getskilllv(1) < 9) {
			mes "[Kuga Kai]";
			mes "Go learn all the basic skills." ;
			mes "You need to get the level of ^0000FF "basic skills" to 9 ^000000." ;
			next;
			mes "[Kuga Kai]";
			mes "You can raise the level of ^0000FF "Basic Skills" ^000000FF in the ^000000FF "Skill List" ^000000 window." ;
			mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
			next;
			mes "[Kuga Kai]";
			mes "To increase the level of a skill, the ^FF000000 'Fix' ^000000 button is required after assigning the skill points." ;
			mes "Attention is required." ;
			close2;
			cutin "start_020_jp.bmp",4;
			end;
		}
		mes "[Kuga Kai]";
		mes "You got it!" ;
		mes "That was surprisingly quick." ;
		next;
		mes "[Kuga Kai]";
		mes "...... Alright." ;
		mes "Looks like we'll be ready for the duel." ;
		mes "You are more capable than I thought." ;
		next;
		mes "[Kuga Kai]";
		mes "That's good." ;
		mes "As promised, I am officially transferring you to Ninja." ;
		next;
		mes "[Kuga Kai]";
		mes "First, let's officially say your name." ;
		mes "My name is Kai." ;
		mes "I have been given the task of leading a search party to find my former chieftain, Kazuma-sama, who has been turned into a loose ninja." ;
		next;
		mes "[Kuuga Kai]";
		mes "Actually, the internal situation of our Ninja is complicated now." ;
		mes "Therefore, you, the newcomer, will not be assigned to any unit." ;
		next;
		mes "[Kuga Kai]";
		mes "However, there is a sentence in the letter of the wild sheep that speaks highly of you." ;
		mes "I think you did well on your assignment from me." ;
		mes "I have high expectations of you." ;
		next;
		mes "[Kuga Kai]";
		mes "Ninja is a lonely profession." ;
		mes "The mission is the most important, but never lose your emotions." ;
		next;
		mes "[Kuga Kai]";
		mes "Many difficulties will now befall such a man as you." ;
		mes "But we Ninjas act in a way that conceals our true identity from many." ;
		mes "Do not rely on others." ;
		next;
		mes "[Kuga Kai]";
		mes "And Ninja weapons are very dangerous." ;
		mes "Be careful how you handle them." ;
		next;
		mes "[Kuga Kai]";
		mes "Then we officially recognize you as a member of our Ninja." ;
		next;
		mes "[Kuga Kai]";
		mes "Quick as the wind!" ;
		mes "Dance like the wind!" ;
		mes "Its body is light, and it flies!" ;
		next;
		mes "[Kuga Kai]";
		mes "Tuah!" ;
		next;
		getitem 13010,1;
		delitem 1010,1;
		delitem 1002,30;
		unequip;
		jobchange Job_Ninja;
		set CHANGE_NJ,0;
		chgquest 6018,50495;
		getitem 11046,1;
		mes "[Kuga Kai]";
		mes "And you may take this." ;
		mes "It is a sword called Asura and the Book of Ninja." ;
		mes "The Book of Ninja is an instruction manual on how to practice Ninja." ;
		mes "Read this and practice." ;
		close;
	}
OnInit:
	waitingroom "changing jobs",0;
	end;
}

//==========================================
// Job change test
//------------------------------------------
einbroch.gat,184,194,3 script youth 881,{
	if(Job == Job_Ninja || Job == Job_Kagerou || Job == Job_Oboro) {
		mes "[Leopard]";
		mes "You've become a Ninja." ;
		mes "From now on, many difficulties will come upon you." ;
		mes "Do not neglect your training." ;
		close;
	}
	switch(CHANGE_NJ) {
	case 0:
		mes "[Youth]";
		mes "wow ......" ;
		mes "This place is very expensive." ;
		mes "I've seen many countries, but I've never seen such a high place." ;
		next;
		mes "[Youth]";
		mes "But it is really residual ghost that even though it is so high, the view you can see is not beautiful nature." ;
		close;
	case 1:
		mes "[young man]";
		mes "Whew - it's really high here." ;
		mes "I've traveled to many countries, but I've never seen such a tall building." ;
		mes "...... But the beauty is more darn good in my hometown." ;
		next;
		mes "[Youth]";
		mes "Where I lived, it was quiet, the air was clean, and the sea was very white." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Amatsu by any chance?"; mes "[" +strcharinfo(0)+ "]"; mes "Amatsu?
		next;
		mes "[Youth]";
		mes "...... No." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Huh?" ;
		mes "...... Then ......" ;
		mes "Izlude?" ;
		next;
		mes "[Youth]";
		mes "Yes." ;
		mes "I am from Izlude." ;
		next;
		mes "[Youth]";
		mes "I came to this country because of a few circumstances, and I came to this country where we can get a lot of minerals." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I see. ......" ;
		mes "Oh, do you know a guy called Noyamu?" ;
		mes "I'm Ninja from Amatsu and I'm looking for him." ;
		next;
		mes "[Youth]";
		mes "No, I've never heard that name before." ;
		mes "But it sounds like there's a reason you really need to meet that person." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Yes." ;
		mes "I will give this letter to that person and receive a reply." ;
		mes "That will be the first step for me to become a Ninja." ;
		next;
		mes "[Youth]";
		mes "umm ......" ;
		mes "...... Oh, by the way, ......" ;
		mes "I think I saw someone here dressed like a tourist." ;
		next;
		mes "[young man]";
		mes "I can help you if you like." ;
		mes "But I'm also here on business, so that comes first." ;
		next;
		mes "[young man]";
		mes "If you help me with my business, I can help you find someone?" ;
		next;
		if(select("No, I'll look for them on my own.", "Yes, let me help you.")==1) {
			mes "[Youth]";
			mes "I see." ;
			mes "Good luck." ;
			mes "If you ever need my help, you can always call on me." ;
			close;
		}
		mes "[Youth]";
		mes "Thank you." ;
		mes "So, please start with my work." ;
		next;
		mes "[Youth]";
		mes "I am here in search of a certain mineral." ;
		mes "30 iron ore and 1 Phracon." ;
		mes "I would be grateful if these could be found." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-Let's go find 1 Phracon and 30 iron ore-";
		set CHANGE_NJ,2;
		chgquest 6015,6016;
		close;
	case 2:
		if(countitem(1010) < 1 || countitem(1002) < 30) {
			mes "[Youth]";
			mes "1 Phracon and 30 iron ore." ;
			mes "I'm not in a hurry, please bring me the exact number." ;
			close;
		}
		mes "[Youth]";
		mes "Have you brought it?" ;
		mes "Thank you." ;
		mes "Now it's my turn to help you." ;
		next;
		mes "[young man]";
		mes "Then please give me that letter." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "?" ;
		next;
		mes "[Youth]";
		mes "What's wrong?" ;
		mes "Kai asked you to give it to him, didn't he?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "...... Ah!" ;
		mes "Perhaps you are the wild sheep!" ;
		next;
		mes "[Youth]";
		mes "...... No." ;
		mes "I am not a wild sheep, but a leopard." ;
		mes "A wild sheep is just what Kai calls himself." ;
		mes "Ha ha ha." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ".................." ;
		next;
		mes "[leopard]";
		mes "No." ;
		mes "If you want to be a Ninja, don't just believe what you see." ;
		next;
		mes "[Leopard]";
		mes "Not many Ninjas dress like the ones in the books." ;
		next;
		mes "[leopard]";
		mes "Don't forget." ;
		mes "Ninja loses his life the moment his opponent knows who he is." ;
		next;
		mes "[Leopard]";
		mes "What I look like now, my hometown, the name I taught you." ;
		mes "All of that could be a lie." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "...... Yes." ;
		mes ".................." ;
		next;
		mes "[leopard]";
		mes "I think you got it." ;
		mes "So, shall we have the letter?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Ah, yes." ;
		mes "Here it is." ;
		next;
		mes "[leopard]";
		mes "Which is ......." ;
		mes "...... Kai's." ;
		mes "I thought it was a challenge letter, but it says we don't have any weapons so let's have a temporary truce." ;
		next;
		mes "[Leopard]";
		mes "Hahaha." ;
		mes "While remaining GOST, I have gathered all the materials for the kunai, you know." ;
		next;
		mes "[leopard]";
		mes "In the meantime, I'll write back to you." ;
		mes "If you are good enough to help me, just a little more sensory training would make you a great Ninja." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ".................." ;
		next;
		mes "[leopard]";
		mes "Please wait a moment, I'm writing a reply now. ......" ;
		mes "-sara-sara-sara-"; mes "-sara-sara-sara-"; mes "-sara-sara-sara-";
		next;
		mes "[leopard]";
		mes "Yes, please." ;
		mes "You can give this to Kai." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-Received the letter-";
		next;
		mes "[leopard]";
		mes "Then please go immediately." ;
		mes "Ninja must spare no time at any time." ;
		next;
		mes "[Leopard]";
		mes "If you can be a Ninja, you will have more opportunities to meet with me." ;
		mes "I'm counting on you." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Yes, ......." ;
		mes "Then I am now ......" ;
		next;
		mes "[leopard]";
		mes "Oh ......" ;
		mes "If you want to go to Amatsu, I can give you a ride." ;
		mes "Well, have a good day." ;
		set CHANGE_NJ,3;
		chgquest 6016,6017;
		delitem 1010,1;
		delitem 1002,30;
		close2;
		warp "amatsu.gat",113,127;
		end;
	case 3:
		mes "[leopard]";
		mes "Hmm?  What's wrong?" ;
		mes "I see you haven't met Kai yet." ;
		next;
		mes "[leopard]";
		mes "If you wish, I can send you to Amatsu?" ;
		next;
		if(select("No, thank you", "Yes, please")==1) {
			mes "[leopard]";
			mes "Okay, I understand." ;
			mes "Then, good luck." ;
			close;
		}
		mes "[leopard]";
		mes "I understand." ;
		mes "Then, off you go." ;
		close2;
		warp "amatsu.gat",113,127;
		end;
	case 4:
		mes "[leopard]";
		mes "It looks like Kai's got a nasty one on his hands." ;
		mes "Good luck." ;
		close;
	}
}

//==========================================
// bitter production
//------------------------------------------
- script kashin#ng 83,{
	if(strnpcinfo(2) == "que") {
		mes "[Cashin]";
		mes "I am Kashin." ;
		mes "If you need any bitterness, come to me anytime." ;
	}
	else {
		mes "[Kashin]";
		mes "We've been very busy lately with people asking for bitterness here and there." ;
	}
	next;
	mes "[Kashin]";
	mes "What do you need?" ;
	mes "Please choose." ;
	next;
	switch(select("Bitterness of Explosion: 20", "Bitterness of Poison: 10", "Bitterness of Ice Pillar: 10", "Bitterness of Mad Wind: 10", "Bitterness of Black Earth: 10", "Bitterness of Fiery Fire: 10", "cancel")) {
	case 1: //bitter blasts - 20 sharp-edged shurikens, 1 black powder
		mes "20 sharp-edged shurikens and 1 black powder are exchanged for 1 bundle of 20 explosive bitterness." ;
		next;
		mes "[Kashin]";
		mes "You can exchange up to 100 bundles at a time." ;
		mes "Enter 0 if you want to stop exchanging." ;
		next;
		input '@num;
		if('@num <= 0 || '@num > 100) {
			mes "[Casin]";
			mes "Exchange aborted." ;
			mes "Please come back next time." ;
			close;
		}
		if(countitem(13253) < 20*'@num || countitem(6213) < '@num) {
			mes "[Cashin]";
			mes "It looks like you don't have enough items to exchange?" ;
			close;
		}
		delitem 13253,20*'@num;
		delitem 6213,'@num; }
		getitem 13294,20*'@num;
		mes "[Casin]";
		mes "Confirmed." ;
		mes "Then, go ahead." ;
		close;
	case 2: //bitter of ravenous poison - 20 shuriken, 1 shadow pearl
		set '@itemid,13259;
		setarray '@need,13250,7524;
		setarray '@amount,20,1;
		break;
	case 3: //bitter of icicle - rain cloud shuriken 8,ice flashing stone 2
		set '@itemid,13255;
		setarray '@need,13251,7522;
		setarray '@amount,8,2;
		break;
	case 4: //bitter wind of madness - shuriken of flash 4,wind chime stone 2
		set '@itemid,13257;
		setarray '@need,13252,7523;
		setarray '@amount,4,2;
		break;
	case 5: //Bitter Black Earth - Shuriken of Sharp Edge 2,Shadow Pearl 1
		set '@itemid,13256;
		setarray '@need,13253,7524;
		setarray '@amount,2,1;
		break;
	case 6: //bitter of fire - shuriken of stabbing needle1,stone of fire2
		set '@itemid,13258;
		setarray '@need,13254,7521;
		setarray '@amount,1,2;
		break;
	case 7:
		mes "[Cashin]";
		mes "I understand." ;
		mes "Please come back anytime." ;
		close;
	}
	mes "[Cashin]";
	mes ""+getitemname('@need[0])+'@amount[0]+"piece and" +getitemname('@need[1])+'@amount[1]+"piece,";
	mes getitemname('@itemid)+ "10 pieces as a bundle";
	mes "Exchanged." ;
	next;
	mes "[Cashin]";
	mes "You can exchange up to 500 bundles at a time." ;
	mes "Enter 0 if you want to stop the exchange." ;
	next;
	input '@num;
	if('@num <= 0 || '@num > 500) {
		mes "[Casin]";
		mes "Exchange aborted." ;
		mes "Please come back next time." ;
		close;
	}
	if(countitem('@need[0]) < '@amount[0]*'@num || countitem('@need[1]) < '@amount[1]*'@num) {
		mes "[Cashin]";
		mes "It looks like you don't have enough items to exchange?" ;
		close;
	}
	delitem '@need[0],'@amount[0]*'@num;
	delitem '@need[1],'@amount[1]*'@num;
	getitem '@itemid,10*'@num;
	mes "[Cashin]";
	mes "Confirmed." ;
	mes "Then, go ahead." ;
	close;
}

prontera.gat,178,240,3 duplicate(cassin#ng) cassin#prt 83
que_ng.gat,72,29,3 duplicate(cassin#ng) cassin#que 83

//==========================================
// Ninja sword production
//------------------------------------------
- script kaibara#ng 847,{
	if(strnpcinfo(2) == "que") {
		mes "[Kaibara]";
		mes "I am Kaibara who can make Ninja weapons." ;
		mes "What do you want?" ;
	}
	else {
		mes "[Kaibara]";
		mes "I've been traveling back and forth between here and Amatsu a lot lately as more and more people come to visit me." ;
		mes "Is there anything you want?" ;
	}
	next;
	switch(select("black scales", "ten hands", "asura[3]", "murasame", "white blade", "quit")) {
	case 1: //black scales - 400 dragon scales, 5 Oridecon, 30 dragon skins, 200,000z
		mes "[Kaibara]";
		mes "Hm, you chose ^FF0000 black scales ^000000." ;
		mes "The black scales are mostly made of dragon scales." ;
		next;
		mes "[Kaibara]";
		mes "You will need 400 dragon scales, 5 Oridecon, 30 dragon scales, and 200,000 Zeny for the materials." ;
		mes "Do you want me to make it for you?" ;
		set '@itemid,13006;
		setarray '@need,1036,984,7123;
		setarray '@amount,400,5,30;
		set '@zeny,200000;
		break;
	case 2: //10 hand - Steel30,old pattern1,20,000z
		mes "[Kaibara]";
		mes "Hm, you chose ^FF0000 ten hands ^000000." ;
		mes "There is a legend that the more you use the ten hands, the stronger they become." ;
		next;
		mes "[Kaibara]";
		mes "You need 30 pieces of Steel, an old handle, and 20,000 Zeny for the materials." ;
		mes "Do you want me to make it for you?" ;
		set '@itemid,13007;
		setarray '@need,999,7022;
		setarray '@amount,30,1;
		set '@zeny,20000;
		break;
	case 3: //Ashura[3] - Steel25,old magic circle5,32,000z
		mes "[Kaibara]";
		mes "Hm, you chose ^FF0000 Asura[3]^000000." ;
		mes "To make Asura[3], you need 25 Steel, 5 old magic circle, and 32,000 Zeny." ;
		mes "Do you want me to make it for you?" ;
		set '@itemid,13011;
		setarray '@need,999,7099;
		setarray '@amount,25,5;
		set '@zeny,32000;
		break;
	case 4: //Murasame - Steel30,Aquamarine10,48,000z
		mes "[Kaibara]";
		mes "Hm, you chose ^FF0000 Murasame ^000000." ;
		mes "You need 30 Steel, 10 Aquamarine, and 48,000 Zeny to make Murasame." ;
		mes "Would you like me to make it for you?" ;
		set '@itemid,13012;
		setarray '@need,999,720;
		setarray '@amount,30,10;
		set '@zeny,48000;
		break;
	case 5: //white blade - skelbourne 500,pearl 5,heal lvl 3 10,120,000z
		mes "[Kaibara]";
		mes "Hm, you chose ^FF0000 white blade ^000000." ;
		mes "To make a white blade, you need 500 skele bones, 5 pearls, 10 heal lvl 3, and 120,000 zeny." ;
		mes "Do you want me to make it for you?" ;
		set '@itemid,13014;
		setarray '@need,932,722,12001;
		setarray '@amount,500,5,10;
		set '@zeny,120000;
		break;
	case 6:
		mes "[Kaibara]";
		mes "Mm." ;
		mes "You may come back when you feel like it." ;
		close;
	}
	next;
	if(select("I'll stop", "Yes!") ==1) {
		mes "[Kaibara]";
		mes "umm ......" ;
		mes "Not so easy material to collect. ......" ;
		mes "If you can gather the materials, please come back anytime." ;
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[Kaibara]";
			mes "You don't seem to have enough material to make " +getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "") ;
			next;
			break;
		}
	}
	if('@i == getarraysize('@need) && Zeny < '@zeny) {
		mes "[Kaibara]";
		mes "umm ......" ;
		mes "I have enough material, but not enough money..." ;
		next;
	}
	if('@i < getarraysize('@need) || Zeny < '@zeny) {
		mes "[Kaibara]";
		mes ""+getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ ""'s material is";
		switch('@itemid) {
		case 13006:
			mes "You need ^FF000000Dragon's scales^000000, ^FF000000Oridecon5^000000, ^FF000000Dragon's scales30^000000, ^FF000000200,000Zeny^000000." ;
			break;
		case 13007:
			mes "You need 30 ^FF000000Steel^000000, 1 ^FF000000Old Pattern^000000, and ^FF00000020,000Zeny^000000." ;
			break;
		case 13011:
			mes "I need 25 ^FF000000Steel^000000, 5 ^FF000000 old magic circle^000000, and ^FF00000032,000Zeny^000000." ;
			break;
		case 13012:
			mes "You need ^FF000000Steel30^000000, ^FF000000Aquamarine10^000000, ^FF00000048,000Zeny^000000." ;
			break;
		case 13014:
			mes "^FF000000I need 500^000000 skele bones, 5^FF000000 pearls, 10^FF000000 heal lvl 3^000000, and ^FF000000120,000 Zeny^000000." ;
			break;
		}
		mes "Make sure you go check it out." ;
		close;
	}
	if(checkweight('@itemid,1) == 0) {
		mes "[Kaibara]";
		mes "Looks like you're full of baggage." ;
		mes "You may want to come back with a little extra room." ;
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	getitem '@itemid,1;
	mes "[Kaibara]";
	mes "Mm." ;
	mes "I've got all the materials and money..." ;
	mes "Then you may receive " +getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "" ;
	close;
}

payon.gat,210,44,3 duplicate(kaibara#ng) kaibara#pay 847
que_ng.gat,72,34,3 duplicate(caibara#ng) caibara#que 847

//==========================================
// Fuma Shuriken production
//------------------------------------------
- script Tetsu#ng 709,{
	mes "[Tetsu]";
	mes "My name is Tetsu." ;
	mes "I handle the Fuuma Shuriken." ;
	next;
	mes "[Tetsu]";
	mes "I lost my savings from my hobby of gambling. ......." ;
	mes "I resumed weapons manufacturing, which I had quit." ;
	next;
	mes "[Tetsu]";
	mes "Despite what it may look like, I'm the best in the world at making windmill-related weapons!" ;
	mes "Don't worry, you can trust me to manufacture them!" ;
	next;
	switch(select("Fuuma Shuriken - Wind Bird", "Fuuma Shuriken - Great Wheel [3]", "Fuuma Shuriken - Great Wheel [4]", "Fuuma Shuriken - Rocket Fire", "Stop")) {
	case 1: //Fuuma Shuriken, Wind Bird - Steel 50, Harpy's Feather 20, Oridecon 5, 90,000z
		mes "[Tetsu]";
		mes "Did you choose ^FF0000 Wind Demon Shuriken, Wind Bird ^000000?" ;
		mes "You need 50 Steel, 20 Harpy Feathers, 5 Oridecon, and 90,000 Zeny to make the Wind Demon Shuriken, Wind Bird." ;
		mes "Do you want to commission the production?" ;
		set '@itemid,13300;
		setarray '@need,999,7115,984;
		setarray '@amount,50,20,5;
		set '@zeny,90000;
		break;
	case 2: //Fuuma shuriken, big wheel[3] - Steel30,handle string100,Oridecon2,40,000z
		mes "[Tetsu]";
		mes "Did you choose ^FF0000Fuuma Shuriken, Great Wheel [3]^000000?" ;
		mes "To make the Fuuma Shuriken, Wind Bird [3], you need 30 Steel, 100 Handle Strings, 2 Oridecon, and 40,000 Zeny." ;
		mes "Do you want me to commission the production?" ;
		set '@itemid,13301;
		setarray '@need,999,7301,984;
		setarray '@amount,30,100,2;
		set '@zeny,40000;
		break;
	case 3: //fuuma shuriken, big wheel[4] - damaged diamond 20,fuuma shuriken, big wheel[3],Oridecon3,40,000z
		mes "[tetsu]";
		mes "Did you choose ^FF0000 Fuma Shuriken, Great Wheel [4]^000000?" ;
		mes "To make Fuuma Shuriken, Great Wheel [4], you need 20 damaged diamonds, 1 Fuuma Shuriken, Great Wheel [3], 3 Oridecon, and 40,000 Zeny." ;
		mes "Do you want to commission the fabrication?" ;
		next;
		mes "[Tetsu]";
		mes "I'm telling you, you'll lose the cards and refining value for the Fuuma Shuriken, Great Wheel [3]." ;
		mes "Think carefully and decide." ;
		set '@itemid,13302;
		setarray '@need,733,13301,984;
		setarray '@amount,20,1,3;
		set '@zeny,40000;
		break;
	case 4: //Fuuma Shuriken, Ardent Fire - Steel50,firebrand100,burning heart100,ardent fire stone50,78,000z
		mes "[Tetsu]";
		mes "Did you choose ^FF0000 Fuma Shuriken, Retsubi^000000?" ;
		mes "To make the Wind Demon Shuriken, Raging Fire, you need 50 Steel, 100 Fire Seeds, 100 Burning Heart, 50 Raging Fire Stones, and 78,000 Zeny." ;
		mes "Do you want to commission the fabrication?" ;
		set '@itemid,13303;
		setarray '@need,999,7098,7097,7521;
		setarray '@amount,50,100,100,50;
		set '@zeny,78000;
		break;
	case 5:
		mes "[Kaibara]";
		mes "It's the remaining GHOST." ;
		mes "I wanted to show you the weapon I poured my heart and soul into: ......." ;
		mes "Come back if you change your mind." ;
		close;
	}
	next;
	if(select("I'll stop", "Yes!") ==1) {
		mes "[Tetsu]";
		mes "ummm ......" ;
		mes "Well, it's not cheap material, is it?" ;
		mes "But you can always come to me when you have the materials." ;
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[tets]";
			mes ""+getitemname('@itemid)+('@itemid ==13301? "[3]"": ('@itemid ==13302? "[4]"": ""))+ "Looks like we're running out of stuff to make, man." ;
			next;
			break;
		}
	}
	if('@i == getarraysize('@need) && Zeny < '@zeny) {
		mes "[tetz]";
		mes "I've got enough material, but not enough money, man!" ;
		next;
	}
	if('@i < getarraysize('@need) || Zeny < '@zeny) {
		mes "[tetz]";
		mes ""+getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "to make ";
		switch('@itemid) {
		case 13300:
			mes "You need 50 ^FF0000Steel^000000, 20 ^FF0000Harpy Feathers^000000, 5 ^FF0000Oridecon^000000, and ^FF000090,000Zeny^000000." ;
			break;
		case 13301:
			mes "I need ^FF000000Steel30^000000, ^FF000000Pattern Cord100^000000, ^FF000000Oridecon2^000000, ^FF00000040,000Zeny^000000." ;
			break;
		case 13302:
			mes "I need ^FF000000Damaged Diamonds 20^000000, ^FF000000Fuuma Shuriken, Great Wheel [3] 1^000000, ^FF000000Oridecon 3^000000, ^FF00000040,000 Zeny^000000." ;
			break;
		case 13303:
			mes "I need ^FF000000Steel50^000000, ^FF000000Fire Seeds100^000000, ^FF000000Burning Heart100^000000, ^FF000000Fire Stones50^000000, ^FF00000078,000 Zeny^000000." ;
			break;
		}
		mes "Make sure you get it right." ;
		close;
	}
	if(checkweight('@itemid,1) == 0) {
		mes "[Tetsu]";
		mes "You don't look like you can hold it." ;
		mes "Come back when you have a little more room." ;
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	getitem '@itemid,1;
	mes "[tetz]";
	mes "Okay, you have the materials and the money." ;
	mes "See, this is" +getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "" ;
	close;
}

geffen.gat,63,70,3 duplicate(tets#ng) tets#gef 709
que_ng.gat,22,62,3 duplicate(tets#ng) tets#que 709

//==========================================
// making hand armor [1] (Tetsu#ng.gat,22,62,3)
//------------------------------------------
que_ng.gat,28,50,3 script bosh 709,{
	if(BaseLevel < 20) {
		mes "[bosh]";
		mes "I make the best armor for the youth of Ninja." ;
		next;
		mes "[bosh]";
		mes "But I see that you are still not at a high enough level to be equipped with the armor I have made for you." ;
		close;
	}
	if(countitem(2102) < 1 && ARMGARD_1QUE < 3) {
		mes "[bosh]";
		mes "I am bosh." ;
		mes "I am considered the best of the three Ninja armor Artisan." ;
		next;
		mes "[Bosh]";
		mes "When I say three, the other two are as good as frauds!" ;
		mes "There is no one in the world who can make better armor than me." ;
		next;
		mes "[bosh]";
		mes "Because I know how to make all kinds of armor, including all the armor of the East." ;
		next;
		mes "[bosh]";
		mes "But the problem was that the armor I made was too defensive and those who wore it would not be able to fight each other to a decision." ;
		next;
		mes "[bosh]";
		mes "I have stopped making armor to prevent Ninja from relying too much on it and degrading their skills." ;
		mes "Right now, I am mainly engaged in collecting protective gear." ;
		next;
		mes "[bosh]";
		mes "But from what I hear, there's still a lot of armor in this whole wide world that I don't know about." ;
		mes "What was that ......?" ;
		next;
		mes "[bosh]";
		mes "Was it ^FF0000 guard [1]^000000?" ;
		mes "I'm pretty sure it was something like that." ;
		mes "I would love to see it in person." ;
		next;
		mes "[bosh]";
		mes "I know it's a poor piece of armor compared to the one I made anyway. ......" ;
		next;
		mes "[bosh]";
		mes "If you do what I ask, I'll make you something special." ;
		mes "What do you think?" ;
		next;
		if(select("I'm not too crazy about it.", "Okay")==1) {
			mes "[bosh]";
			mes "Oh, it's the remaining ghost." ;
			mes "This is a unique opportunity to get the armor I made, though." ;
			close;
		}
		mes "[bosh]";
		mes "It's called a successful business meeting." ;
		mes "Well, go get the armor called ^FF0000 guard[1]^000000." ;
		set ARMGARD_1QUE,1;
		close;
	}
	if(ARMGARD_1QUE == 1) {
		mes "[bosh]";
		mes "Oh, you brought it?" ;
		mes "Let me see it once: ......" ;
		mes "Hmmm ......" ;
		next;
		mes "[bosh]";
		mes "Yes!  That's it!" ;
		mes "Slotting all the armor will give you better performance!" ;
		next;
		mes "[bosh]";
		mes "Okay, let's apply this and put slots on my armor." ;
		next;
		mes "[bosh]";
		mes "If you want, I can make you 1 hand armor, 1 guard [1], and for 10,000 zeny I can make you a hand armor [1]." ;
		mes "What do you want?" ;
		next;
		if(select("no", "yes")==1) {
			mes "[bosh]";
			mes "Hmmm, okay." ;
			mes "Anyway, I just want to thank you for showing me the unusual armor." ;
			mes "Thanks for going out of your way." ;
			set ARMGARD_1QUE,0;
			close;
		}
		mes "[bosh]";
		mes "Okay." ;
		mes "Once again, the materials are 1 hand armor, 1 guard [1], and 10,000 Zeny." ;
		mes "Come back when you are ready." ;
		set ARMGARD_1QUE,2;
		close;
	}
	if(ARMGARD_1QUE == 2) {
		callsub L_Routine;
		close;
	}
	if(ARMGARD_1QUE == 3) {
		mes "[bosh]";
		mes "Hey." ;
		mes "Did you need another hand armor [1]?" ;
		next;
		if(select("no", "yes")==1) {
			mes "[bosh]";
			mes "I see." ;
			mes "Come back to me if you need me." ;
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "[bosh]";
	mes "Ah, you!" ;
	mes "Perhaps that's the armor called a guard?" ;
	mes "Let me see it!" ;
	next;
	mes "[bosh]";
	mes "Yes!  That's it!" ;
	mes "Slotting all the armor will give you better performance!" ;
	mes "Why didn't I notice this simple thing!" ;
	next;
	mes "[bosh]";
	mes "Oh, my name is Bosh." ;
	mes "I am said to be the best of the three Ninja armor Artisans in the East." ;
	mes "I know the methods of making all the armor in the East." ;
	next;
	mes "[Bosch]";
	mes "But the armor I have made is so hard that if those who equip themselves with it fight each other, they will not be able to settle." ;
	next;
	mes "[bosh]";
	mes "I stopped making armor to prevent Ninja from relying on it and losing their skills." ;
	mes "I am now a collector of armor." ;
	next;
	mes "[bosh]";
	mes "But when I saw that armor you have, it ignited my soul!" ;
	next;
	mes "[bosh]";
	mes "If you like, I can make you 1 hand armor, 1 guard [1], and for 10,000 Zeny I can make you a hand armor [1]." ;
	mes "What do you want?" ;
	next;
	if(select("No, thank you", "Yes!  Please!") ==1) {
		mes "[bosh]";
		mes "I see. ......" ;
		mes "Hmm, it's a residual GOST." ;
		mes "If you change your mind, come back anytime." ;
		close;
	}
	callsub L_Routine;
	close;
L_Routine:
	if(countitem(2102) < 1 || countitem(2117) < 1) {
		mes "[bosh]";
		mes "Looks like you're a little short on ingredients." ;
		next;
		mes "[bosh]";
		mes "To make a hand armor [1], you need 1 hand armor, 1 guard [1], and 10,000 zeny." ;
		mes "Make sure you check it properly and come back to me." ;
		close;
	}
	if(Zeny < 10000) {
		mes "[bosh]";
		mes "I see you have enough materials, but not enough money." ;
		next;
		mes "[bosh]";
		mes "To make a cuirass[1], you need 1 cuirass, 1 guard[1], and 10,000 zeny." ;
		mes "Make sure you check it properly and come back to me." ;
		close;
	}
	mes "[bosh]";
	mes "Looks like the material is ready." ;
	mes "I'm going to ask you one last time, can I make the hand armor [1]?" ;
	next;
	if(select("no", "yes")==1) {
		mes "[bosh]";
		mes "Ok." ;
		mes "If you change your mind, come back anytime." ;
		close;
	}
	mes "[bosh]";
	mes "Alright!" ;
	mes "Wait a minute." ;
	mes "-cancel-cancel-"; mes "-cancel-cancel-";
	next;
	mes "[bosh]";
	mes "Okay, it's done!" ;
	mes "Here's the cupped [1]." ;
	mes "If you want it again, you can always come back." ;
	delitem 2102,1;
	delitem 2117,1;
	set Zeny,Zeny-10000;
	set ARMGARD_1QUE,3;
	getitem 2118,1;
	return;
}

//==========================================
// hand armor modification production
//------------------------------------------
que_ng.gat,28,45,3 script bash 86,{
	if(BaseLevel < 50) {
		mes "[bash]";
		mes "My name is Bash and I make armor for Ninja." ;
		next;
		mes "[Bash]";
		mes "However, there are conditions to equip the armor I make." ;
		mes "Please come back when you have grown up a little more." ;
		close;
	}
	if(countitem(2107) < 1 && ARMGARD_2QUE < 3) {
		mes "[bash]";
		mes "My name is Bash, one of the three Ninja armor Artisans." ;
		mes "By the way, the other two are my brothers." ;
		next;
		mes "[Bash]";
		mes "I can't do much as a protective gear Artisan with my brothers' titles, but many people appreciate my protective gear." ;
		next;
		mes "[bash]";
		mes "I am currently researching armor and magic." ;
		next;
		mes "[bash]";
		mes "So, but I heard that there is an armor called Mirror Shield in the land beyond the sea?" ;
		mes "Is there any way to get it?" ;
		next;
		mes "[bash]";
		mes "If we could examine the mirror shields, it would make our research so much better." ;
		mes "Can you do me a favor?" ;
		next;
		if(select("I refuse", "Okay")==1) {
			mes "[bash]";
			mes "Hmmm... I guess it was an impossible request after all." ;
			mes "I'm sorry." ;
			mes "If you get a mirror shield and are having trouble getting rid of it, please come to me anytime." ;
			close;
		}
		mes "[bash]";
		mes "Thank you very much." ;
		mes "Oh, I'll take one without a slot, please." ;
		mes "We will be waiting for you then." ;
		set ARMGARD_2QUE,1;
		close;
	}
	if(ARMGARD_2QUE == 1) {
		mes "[bash]";
		mes "What, did you get it?" ;
		mes "Let me see it once: ......" ;
		mes "...... Hmmm ......" ;
		next;
		mes "[bash]";
		mes "I knew it!" ;
		mes "If we add protection against magic like this armor!" ;
		next;
		mes "[bash]";
		mes "Thank you." ;
		mes "That mirror shield you showed me has put a soul into my dormant creativity." ;
		next;
		mes "[bash]";
		mes "One hand armor and one mirror shield if you like." ;
		mes "And for 20,000 zeny I will make you a hand armor modification." ;
		mes "What would you like to do?" ;
		next;
		if(select("No thanks.", "Please")==1) {
			mes "[bash]";
			mes "Hmmm, okay." ;
			mes "It's the remaining GHOST." ;
			mes "If you change your mind, come back anytime." ;
			set ARMGARD_2QUE,0;
			close;
		}
		mes "[bash]";
		mes "I understand." ;
		mes "My heart is pounding ......." ;
		next;
		mes "[bash]";
		mes "Then come back when you are ready." ;
		set ARMGARD_2QUE,2;
		close;
	}
	if(ARMGARD_2QUE == 2) {
		callsub L_Routine;
		close;
	}
	if(ARMGARD_2QUE == 3) {
		mes "[bash]";
		mes "Welcome." ;
		mes "Are you here because you need the Tekko Kai?" ;
		next;
		if(select("No", "Yes")==1) {
			mes "[bash]";
			mes "Hmmm, I see." ;
			mes "It's the remaining GHOST." ;
			mes "If you change your mind, come back anytime." ;
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "[bash]";
	mes "Oh, maybe that's the armor called a mirror shield?" ;
	next;
	mes "[bash]";
	mes "Sorry, let me see it once: ......." ;
	next;
	mes "[bash]";
	mes "I knew it!" ;
	mes "If we add protection against magic like this armor!" ;
	next;
	mes "[bash]";
	mes "so ......" ;
	mes "It looks like we can get even better performance out of it!" ;
	mes "Why didn't I notice this simple thing!" ;
	next;
	mes "[bash]";
	mes "Actually, my name is Bash, one of the three Ninja armor Artisan." ;
	mes "By the way, the other two are my brothers." ;
	next;
	mes "[Bash]";
	mes "I can't do much as a protective gear Artisan with my brothers' titles, but many people appreciate my protective gear." ;
	next;
	mes "[bash]";
	mes "I am currently researching armor and magic." ;
	next;
	mes "[bash]";
	mes "So I was trying to get an idea from an armor called Mirror Shield in a country beyond the sea, but I was having trouble getting it." ;
	next;
	mes "[bash]";
	mes "But luckily, that mirror shield you showed me gave a soul to my dormant creativity." ;
	next;
	mes "[bash]";
	mes "One hand armor and one mirror shield if you like." ;
	mes "And for 20,000 zeny I will make you a hand armor modification." ;
	mes "What would you like to do?" ;
	next;
	if(select("No thanks.", "Please")==1) {
		mes "[bash]";
		mes "Hmmm, okay." ;
		mes "It's the remaining GHOST." ;
		mes "If you change your mind, come back anytime." ;
		close;
	}
	callsub L_Routine;
	close;
L_Routine:
	if(countitem(2107) < 1 || countitem(2117) < 1) {
		mes "[bash]";
		mes "You seem to be a little short on material." ;
		mes "If you want to make a hand armor modification, 1 hand armor and 1 mirror shield." ;
		mes "And you need 20,000 Zeny." ;
		mes "Please come back after confirming." ;
		close;
	}
	if(Zeny < 20000) {
		mes "[bash]";
		mes "You have enough material, but not enough money." ;
		mes "If you want to make a hand armor modification, 1 hand armor and 1 mirror shield." ;
		mes "And you need 20,000 Zeny." ;
		mes "Please come back after confirming." ;
		close;
	}
	mes "[bash]";
	mes "It looks like the materials are already ready." ;
	mes "Then I'll ask one last time." ;
	next;
	mes "[bash]";
	mes "The hand armor modification increases your defense against magic, but decreases your physical defense somewhat." ;
	next;
	mes "[bash]";
	mes "Would you still like to make the Tekko Kai with the materials you brought?" ;
	next;
	if(select("No", "Yes")==1) {
		mes "[bash]";
		mes "Okay, I understand." ;
		mes "Then come back if you change your mind." ;
		close;
	}
	mes "[bash]";
	mes "Yes, let's get started then." ;
	mes "-ton-tton--cancel-cancel-cancel-"; mes "-ton-tton--cancel-cancel-cancel-";
	next;
	mes "[bash]";
	mes "Here you go, this is the Tekko Kai." ;
	mes "Please come back anytime you need this again." ;
	delitem 2107,1;
	delitem 2117,1;
	set Zeny,Zeny-20000;
	set ARMGARD_2QUE,3;
	getitem 2119,1;
	return;
}

//==========================================
// production of armguard[1
//------------------------------------------
que_ng.gat,27,18,3 script Tosh 709,{
	mes "[Tosh]";
	mes "How are you?" ;
	mes "My young friend." ;
	mes "I am one of three brothers who make armor for Ninja." ;
	mes "My name is Tosh." ;
	next;
	mes "[Tosh]";
	mes "I've learned the art of slotting on armor across the ocean, and now I want to make the most of it." ;
	next;
	mes "[Tosh]";
	mes "If you wish, one hand armor modification and one buckler [1]." ;
	mes "And if you bring 40,000 Zeny, I will give you a slot on the hand armor modification." ;
	next;
	mes "[Tosh]";
	mes "But this technique is very delicate." ;
	mes "There is a slight possibility of failure." ;
	mes "I want you to think about that very carefully." ;
	mes "Do you still want to try to put a slot on it?" ;
	next;
	if(select("No", "Yes")==1) {
		mes "[Tosh]";
		mes "Yes." ;
		mes "Better to be cautious." ;
		mes "If you make up your mind, you can come back." ;
		close;
	}
	if(countitem(2104) < 1 || countitem(2119) < 1) {
		mes "[Tosh]";
		mes "Looks like we're running out of material." ;
		mes "The materials are 1 buckler[1], 1 hand armor modification, and 40,000 zeny." ;
		mes "The quantity and amount are exact." ;
		close;
	}
	if(Zeny < 40000) {
		mes "[Tosh]";
		mes "I have enough material, but not enough money, I guess." ;
		next;
		mes "[Tosh]";
		mes "The materials are one buckler [1], one hand armor modification, and 40,000 zeny." ;
		mes "The quantity and amount are exact." ;
		close;
	}
	mes "[Tosh]";
	mes "Yes." ;
	mes "It's all there." ;
	mes "Then we'll go into production." ;
	next;
	mes "[Tosh]";
	mes "Once again, there is a chance of failure." ;
	mes "Would you still do it?" ;
	next;
	if(select("I still won't", "I'll still try")==1) {
		mes "[Tosh]";
		mes "I guess so." ;
		mes "Better to be cautious." ;
		mes "If you make up your mind, you can come back." ;
		close;
	}
	mes "[Tosh]";
	mes "Okay, okay." ;
	mes "Give me a minute." ;
	mes "-tosh-tosh-tosh--gagong-gagong-"; mes "-tosh-tosh-tosh--gagong-gagong-
	next;
	delitem 2104,1;
	delitem 2119,1;
	set Zeny,Zeny-40000;
	if(rand(5) < 2) {
		mes "[Tosh]";
		mes "く......" ;
		mes "No. ...... Failed." ;
		mes "...... Sorry." ;
		mes "I'm sorry to say I'm sorry, but please eat some of this and cheer up." ;
		getitem 12043,1;
		close;
	}
	mes "[Tosh]";
	mes "Okay, it's done." ;
	mes "I was worried it would fail, but you did fine." ;
	mes "So, if you need me again, come back anytime." ;
	getitem 2120,1;
	close;
}
