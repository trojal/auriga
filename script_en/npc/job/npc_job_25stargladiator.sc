//====================================================================
//Ragnarok Online StarGladiator Jobchange Script
// - CHANGE_SG -> 0-12
//====================================================================

//==========================================
// Application for Test
//------------------------------------------

payon.gat,215,102,3 script muhyun 828,3,3,{
	if(Job == Job_Star) {
		mes "[Moohyun]";
		mes "Oh ...... You are ......." ;
		mes "Aren't you the warrior of the sun, moon and stars! Haha, it's been a long time!" ;
		mes "Remember me?" ;
		mes "You seem to be doing well." ;
		mes "Hahaha!" ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Muhyung]";
		mes "Can I help you?" ;
		mes "Do you want to be a Taekwon Kid too?" ;
		mes "Then go see a guy called 'Phoenix' who only knows justice." ;
		mes "He should be nearby, you'll find him soon." ;
		next;
		mes "[Moohyun]";
		mes "It's a long way away. ......." ;
		mes "When you get tired of Taekwondo, come back to my place." ;
		mes "Huh." ;
		close;
	}
	if(Job ! = Job_Taekwon) {
		mes "[Moohyun]";
		mes "Don't poke around too much without any business." ;
		if(Sex) {
			mes "Does your brother want to be poked in the armpit by a man?" ;
			mes "Don't tell me you have weird taste!" ;
		}
		else {
			mes "No, I guess it can't be helped with your sister." ;
			mes "If you're so interested in me, why don't I spread my arms full out and give you a hug?　Hmmm." ;
		}
		next;
		mes "[Moohyun]";
		mes ".............................." ;
		mes "Yes, yes." ;
		mes "I'll let the jokes end here." ;
		mes "Don't get so mad at me." ;
		next;
		mes "[Muhyun]";
		mes "I may look like this, but I used to be a warrior of the sun, moon, and stars." ;
		next;
		mes "[Moohyun]";
		mes "You say you can't believe me?" ;
		mes "Then leave the kids to me and see." ;
		mes "I'm going to make you an awesome Star Gladiator and send you back!" ;
		close;
	}
	switch(CHANGE_SG) {
	case 0:
		mes "[Moohyun]";
		mes "Hey, Taekwon" +(Sex)? "Boy!" : "Girl!" ;
		mes "Wanna have a little chat with me?" ;
		mes "What, what, it'll be over soon." ;
		next;
		if(select("Okay", "No!") ==2) {
			mes "[muhyung]";
			mes "You say it once and for all." ;
			mes "You're using language a bit badly." ;
			mes "Next time you say no, be a little more considerate of the other person." ;
			close;
		}
		mes "[muhyun]";
		mes "What's your name?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "" +strcharinfo(0)+ "." ;
		next;
		mes "[mhyun]";
		mes "You're so unsociable." ;
		mes ""+strcharinfo(0)+"" ;
		mes "I have to say this much." ;
		next;
		mes "[mhyun]";
		mes "Oh yeah, what do you want to be in the future?" ;
		mes "If you want, why don't you become a ^4A4AFF sun, moon and star warrior^000000?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "What is it?" ;
		mes "I've never heard of it before. ......" ;
		mes "The only two I know of are "Soul Linker" and "Star Gladiator", those are the only two I know of." ;
		next;
		mes "[Muhyun]";
		mes "Heh, ....... You know a lot." ;
		mes "That 'Star Gladiator' thing you just mentioned is the Sun, Moon, and Star Warrior." ;
		mes "It's a very fascinating profession." ;
		mes "Don't you want to be a Star Gladiator?" ;
		next;
		if(select("That's my goal!" , "separately ......") ==2) {
			mes "[muhyung]";
			mes "I see." ;
			mes "I think you look better in Star Gladiator than Soul Linker. ......" ;
			mes "No way!" ;
			mes "You want to be Taekwon Kid forever!" ;
			next;
			mes "[muhyun]";
			mes "uuuuuu......" ;
			mes "Well ......" ;
			mes "Come back if you change your mind." ;
			mes "I'll always be your Star Gladiator." ;
			close;
		}
		mes "[muhyun]";
		mes "Target or ......." ;
		mes "I knew it!" ;
		mes "My eyes were right!" ;
		mes "Star Gladiator is in your future." ;
		next;
		if(JobLevel < 40) {
			mes "[Moohyun]";
			mes "But ......" ;
			mes "I guess I'm still a little under level ......" ;
			mes "I need to pack a little more training in Taekwon Kid." ;
				mes "I need to get at least job level 40." ;
			next;
			mes "[Moohyun]";
			mes "Come back after you get a little more strength." ;
			mes "Okay, you have my word." ;
			mes "I'll be a Star Gladiator for sure!" ;
			close;
		}
		mes "[Moohyun]";
		mes "That's good!  You've had a lot of training and your body and mind look sturdy." ;
		mes "But there's one thing you're missing, too: ......." ;
		mes "Yes, a teacher!" ;
		next;
		mes "[Muhyung]";
		mes "He's the teacher who will lead you to become a warrior of the sun, the moon, and the stars." ;
		mes "I can introduce you to that person if you like." ;
		mes "So I'm going to ask you again." ;
		next;
		mes "[Muhyun]";
		mes "Would you like to change jobs ^000000 to ^4A4AFFStar Gladiator?" ;
		next;
		if(select("I will change my job", "Please give me time to think about it")==2) {
			mes "[muhyung]";
			mes "I see." ;
			mes "Well, if you want to become a Star Gladiator, you can always come to me." ;
			close;
		}
		mes "[Muhyun]";
		mes "Okay!  Good answer." ;
		mes "Then I'll introduce you to your teacher." ;
		mes "As you can see, we don't have a guild for training juniors." ;
		next;
		mes "[Muhyun]";
		mes "But it gives us the freedom to do whatever we want." ;
		mes "It does make it harder to keep in touch with you, though. ......." ;
		next;
		mes "[mhyun]";
		mes "...... Anyway, that's what I'm talking about." ;
		mes "I know where the doctor is, so I'll tell you." ;
		next;
		mes "[Muhyun]";
		mes "I'm a teacher named ^4A4AFF Mugan^000000." ;
		mes "This guy is the one who works hard for the most junior students in Star Gladiator." ;
		mes "I'll write you a letter of introduction to that person." ;
		next;
		mes "[Moohyun]";
		mes "Dr. 'Mugan' is at Comodo right now." ;
		mes "Comodo is the closest to the sky." ;
		mes "Be sure to visit that person." ;
		set CHANGE_SG,1;
		close;
	case 1:
		mes "[Moohyun]";
		mes "Go see Dr. 'Moo Gun' at Comodo." ;
		mes "I've already sent you a referral." ;
		close;
	default:
		mes "[muhyung]";
		mes "How are you doing on your exam to become a warrior of the sun, moon, and stars?" ;
		mes "You are going to be a Star Gladiator." ;
		if(CHANGE_SG ! = 6)
			close;
		next;
		mes "[Moohyun]";
		mes "Oh, you don't look so good." ;
		mes "Are you in some kind of trouble?" ;
		mes "If so, do you want me to help you?" ;
		next;
		if(select("No, I'm going to try to do it alone.", "Actually, it's about Dr. Piru.")==1) {
			mes "[Moohyun]";
			mes "Yes, you're right." ;
			mes "Maybe you should try to worry about it alone." ;
			mes "The road to Star Gladiator is different from what it used to be." ;
			mes "There will always come a time when you have to make your own decisions." ;
			next;
			mes "[Muhyun]";
			mes "So I can say that a very careful person is a Star Gladiator." ;
			mes "Life is like, 'I'm going to do it!  No!" You can't just easily come and go." ;
			close;
		}
		mes "[Moohyun]";
		mes "I don't have to ask what Master Piru said." ;
		mes "I don't have to take anything in particular." ;
		next;
		mes "[Muhyun]";
		mes "You were thinking too hard." ;
		mes "You don't necessarily have to take something to prove it." ;
		next;
		mes "[Muhyung]";
		mes "Don't you see?" ;
		mes "It's very simple logic that only you can prove your belief GHOST." ;
		next;
		mes "[muhyung]";
		mes "I want to do it! I won't give up! "I won't regret it!" Isn't that what everyone says?" ;
		next;
		mes "[Muhyung]";
		mes "Everyone is exerting themselves for their own faith ghost." ;
		mes "People live in such a routine." ;
		next;
		mes "[Muhyung]";
		mes "People who work hard to earn money and live while eating their way through life." ;
		mes "Everyone is who they are ......." ;
		mes "I'm trying to prove that I exist, that I'm alive here and now." ;
		next;
		mes "[mhyun]";
		mes "Is this not the answer?" ;
		mes "What's the answer in your heart?" ;
		next;
		if(select("I don't want to give up!" , "I don't know what you're talking about")==2) {
			mes "[muhyung]";
			mes ".............................. I see." ;
			mes "We've talked about a lot of things so far, are you willing to do it?" ;
			next;
			mes "[Muhyung]";
			mes "Go and cool your head for a while." ;
			mes "What I'm ...... for." ;
			mes "For whom I made a passionate speech ......." ;
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "I don't want to give up!" ;
		mes "Now here is just this me, standing on the two feet I have, of my own volition!" ;
		next;
		mes "[Muhyung]";
		mes "Yes!  Good posture!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I am walking this path of my own volition!" ;
		mes "Only I can prove it." ;
		mes "I will be a Star Gladiator !!!!" ;
		next;
		mes "[Muhyun]";
		mes "Yes!  Don't give up!" ;
		mes "Confront and fight!" ;
		mes "He who tilts his head while looking into his opponent's two eyes is a coward!" ;
		next;
		mes "[Muhyun]";
		mes "You, with your body and mind!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "With my body and mind!" ;
		mes "Prove yourself!" ;
		next;
		mes "[Muhyun]";
		mes "Well said!" ;
		mes "I feel like I'm in high spirits." ;
		mes "If you keep going to see Dr. Mugan, he'll send you to the moon room." ;
		mes "Next time we meet, we'll be at Star Gladiator!" ;
		set CHANGE_SG,7;
		close;
	case 7:
		mes "[Moohyun]";
		mes "Tell Dr. Mugan and he'll send you to the moon room." ;
		mes "Next time we meet, we'll be at Star Gladiator!" ;
		close;
	}
OnTouch:
	if(Job == Job_Star) {
		mes "[muhyun]";
		mes "Oh ...... You are ......." ;
		mes "Aren't you the warrior of the sun, moon and stars! Haha, it's been a long time!" ;
		mes "Remember me?" ;
		mes "You seem to be doing well." ;
		mes "Hahaha!" ;
		close;
	}
	if(Job ! = Job_Taekwon) {
		mes "[Moohyun]";
		mes "Hey!  Get out of the way!" ;
		mes "You're blocking the sun!"; mes "You're blocking the sun!" ;
		close;
	}
	if(CHANGE_SG == 0) {
		mes "[muhyung]";
		mes "Hey, hey, you there." ;
		mes "Hey, how about you listen to me for a second and see what I have to say?" ;
		mes "It won't take long." ;
		close;
	}
}

//==========================================
// Job change
//------------------------------------------

comodo.gat,172,230,3 script wandering martial artist 730,{
	if(Job == Job_Star) {
		mes "[Muhyun]";
		mes "It's been a while." ;
		mes "Where have you been lately?" ;
		mes "Hahaha." ;
		mes "Where the sun, moon, and stars bless down, of course." ;
		next;
		mes "[muhyung]";
		mes "Don't forget my advice." ;
		mes "We have one choice to make in life." ;
		mes "I want you to make a choice you won't regret." ;
		next;
		mes "[Muhyung]";
		mes "If you miss the sun, moon, and starlight, you can always tell me." ;
		mes "I'll send it to you right away." ;
		mes "Do you want to go see it now?" ;
		next;
		switch(select("No, thanks", "To the sun room!" in the moon room!", "in the star room!") room!")) {
		case 1:
			mes "[muhyung]";
			mes "I see." ;
			mes "I'm always here, so come anytime." ;
			close;
		case 2:
			mes "[Muhyung]";
			mes "You should come and receive the abundance and hot passion that the sun gives you." ;
			close2;
			warp "job_star.gat",34,12;
			end;
		case 3:
			mes "[muhyun]";
			mes "Something to think long and hard about?" ;
			mes "You should go and learn something from the silence of the moonlight." ;
			close2;
			warp "job_star.gat",100,13;
			end;
		case 4:
			mes "[muhyung]";
			mes "The dim starlight helps me to dream." ;
			mes "Or did you have your heart broken?" ;
			mes "Haha, just kidding." ;
			close2;
			warp "job_star.gat",166,29;
			end;
		}
	}
	if(Job ! = Job_Taekwon) {
		mes "[wandering martial artist]";
		mes "Are you enjoying your mountain trek too?" ;
		mes "It's nice to look down from a high place to open up your chest and cool off." ;
		next;
		mes "[wandering martial artist]";
		mes "That enjoyment is doubled in the afterglow of a night full of moonlight and starlight. ......" ;
		next;
		mes "[wandering martial artist]";
		mes "haha ......" ;
		mes "I guess the problem is that I don't see it." ;
		next;
		mes "[wandering martial artist]";
		mes "In a small way, I wish you the blessings of the sun, moon, and stars on your future." ;
		close;
	}
	switch(CHANGE_SG) {
	case 0:
		mes "[Mugan]";
		mes "You are practicing Tae Kwon Do?" ;
		mes "I still can't help but notice people like you." ;
		mes "Excuse me." ;
		mes "My name is Mughan." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ""+strcharinfo(0)+ "]"" ;
		next;
		mes "[mugan]";
		mes "............ You ............" ;
		mes "^4A4AFFStar Are you interested in becoming a Gladiator? ^000000";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "........................" ;
		mes "............ a ...... no ...... that ............" ;
		next;
		mes "[mgan]";
		mes "Oh, I beg your pardon for this." ;
		mes "Pretend you didn't hear that." ;
		mes "Hahahaha." ;
		next;
		mes "[Mugan]";
		mes "We are the sun and ...... The moon and ...... We are the stars and ......" ;
		mes "...... We are Moohyun ...... It's Moohyun ......" ;
		mes "...... Muhyung Muhyung ............" ;
		close;
	case 1:
		mes "[mgan]";
		mes "I've been waiting for you." ;
		mes ""+strcharinfo(0)+ "." ;
		mes "Moohyun told me about you." ;
		next;
		mes "[Moo-gun]";
		mes "You can find me without going through Moohyun, but as you can see, I am the one who has met the devil of the sun, moon, and stars." ;
		mes "I cannot see people satisfactorily." ;
		next;
		mes "[Mugan]";
		mes "Moohyun's eye for people is sure." ;
		mes "And you are the one that this muhyun has recognized." ;
		mes "Are you ready to be an agent of the sun, the moon, and the stars and use your two feet and two fists?" ;
		next;
		if(select("Yes!  I'll take the job change test!" , "Please give me a moment.")==2) {
			mes "[mgan]";
			mes "Do you have anything to prepare?" ;
			mes "The night is long and the stars are many ......" ;
			mes "Nature will wait for a while now." ;
			mes "Remember you will be a Star Gladiator." ;
			close;
		}
		if(SkillPoint) {
			mes "[Mugan]";
			mes "You have an extra SkillPoint." ;
			mes "You still have some hesitation in your heart." ;
			next;
			mes "[Mugan]";
			mes "Use the skill points you have learned." ;
			mes "Otherwise, you cannot become a Star Gladiator." ;
			close;
		}
		mes "[Mugan]";
		mes "Do you understand what it is about us Star Gladiators?" ;
		next;
		mes "[mughan]";
		mes "Close your eyes and feel what you want." ;
		mes "Open your arms and hold the sky." ;
		next;
		mes "[Mugan]";
		mes "Can you feel nature inside you?" ;
		mes "Can you feel nature in your breast?" ;
		mes "Can you feel nature breathing with you?" ;
		next;
		mes "[Mugan]";
		mes "We embrace the light of the sun, we make swords out of starlight, we sprinkle fresh blood like starlight." ;
		next;
		mes "[Mugan]";
		mes "We are beings who must cross the world by the providence of nature, which we cannot defy." ;
		mes "So let's get right to the task." ;
		next;
		mes "[Mugan]";
		mes "Go gather the forces of nature that are scattered around the world." ;
		mes "A slice of wind, a dignified earth, frozen water, a scorching fire." ;
		next;
		mes "[Mugan]";
		mes "These exist under the name ^3434FF Rough Wind Great Nature Mystic Frozen Flame Heart ^000000." ;
		next;
		mes "[Mugan]";
		mes "Bring that proof that you can capture any nature before you become Star Gladiator." ;
		mes "This is the first test to become a Star Gladiator." ;
		set CHANGE_SG,2;
		close;
	case 2:
		if(countitem(996) < 1 || countitem(997) < 1 || countitem(995) < 1 || countitem(994) < 1) {
			mes "[Mugan]";
			mes "What's up." ;
			mes "Bring the nature you have encountered, felt and experienced." ;
			mes "The infinite power of nature is condensed but scattered somewhere in this world." ;
			next;
			mes "[Mugan]";
			mes "Think of the air that caresses you." ;
			mes "Think of this earth you are treading on." ;
			next;
			mes "[Mugan]";
			mes "Think of the stream by the river that rang in your ears." ;
			mes "Think of warmth like a hot breast." ;
			next;
			mes "[Mugan]";
			mes "That it cannot be felt, but it can be felt." ;
			mes "That which is invisible but visible." ;
			next;
			mes "[Mugan]";
			mes "It holds us too naturally, but we cannot feel it." ;
			mes "It embraces us too enormously, but we cannot see it." ;
			next;
			mes "[Mugan]";
			mes "That is the existence of nature." ;
			mes "The warriors of the sun, moon, and stars are, in other words, the warriors of nature." ;
			mes ".................." ;
			mes "Let's see what you can do." ;
			close;
		}
		mes "[Mugan]";
		mes "Welcome back well." ;
		mes "Quickly, did you get any sense of what you saw when you looked at these?" ;
		next;
		mes "[Mugan]";
		mes "A wind that breathes with us, but coexists with us, and pokes us with its hidden blade at a moment's notice." ;
		mes "The pulsating earth that is beneath us all but can overturn the world." ;
		next;
		mes "[Mugan]";
		mes "Water that flows down endlessly but changes itself and threatens with its cooling breath." ;
		mes "Fire that presides over rebirth and destruction with its dancing body." ;
		next;
		mes "[Mugan]";
		mes "This is nature." ;
		mes "This is the being we must honor." ;
		mes "And above all that";
		next;
		mes "[Mugan]";
		mes "^3434FF sun and ^000000";
		next;
		mes "[mughan]"; mes "[mughan]
		mes "^3434FF moon and ^000000";
		next;
		mes "[mughan]"; mes "[mughan]"; mes "[mughan]
		mes "^3434FF starlight is ^000000";
		next;
		mes "[Mugan]";
		mes "It fills us, the world, and the earth to the brim with its infinite blessings." ;
		next;
		mes "[mughan]";
		mes "Then let us lead you to our sanctuary." ;
		mes "It is our sanctuary where we support and live our destiny with a momentary choice." ;
		next;
		mes "[Mugan]";
		mes "All you have to do is tell me what you see, hear, and feel there." ;
		mes ".................." ;
		mes "Come back to me when you are ready." ;
		delitem 996,1;
		delitem 997,1;
		delitem 995,1;
		delitem 994,1;
		set CHANGE_SG,3;
		close;
	case 3:
		mes "[Mugan]";
		mes "Are you ready?" ;
		mes "To the sanctuary of the warriors of the sun, the moon, and the stars you will go." ;
		next;
		if(select("Wait a bit!" , "whenever you're ready")==1) {
			mes "[Mugan]";
			mes "Ok." ;
			mes "You can call them when you're ready." ;
			close;
		}
		mes "[Mugan]";
		mes "All right, go." ;
		mes "There will be another person in charge there." ;
		mes "Remember to come back to me when it's all over." ;
		close2;
		savepoint "comodo.gat",180,151;
		warp "job_star.gat",34,12;
		end;
	default:
		mes "[mugan]";
		mes "It's not time to go down the mountain yet." ;
		mes "Go to the sanctuary again." ;
		close2;
		warp "job_star.gat",34,12;
		end;
	case 6:
		mes "[mugan]";
		mes "I see a suspended GHOST on your face." ;
		mes "But you must derive the answer yourself." ;
		mes "You can come back when you find an answer that satisfies you." ;
		close;
	case 7:
		mes "[Mugan]";
		mes "Was Moohyun's story beneficial?" ;
		mes "Things like this are always there, it's like a barrier." ;
		mes "But you'd better be able to carry yourself through this." ;
		next;
		mes "[Mugan]";
		mes "Pilu is waiting for you." ;
		mes "Let him go to the moon room." ;
		mes "You must take it to heart so that you can tell me everything you see, hear, and feel." ;
		close2;
		warp "job_star.gat",100,13;
		end;
	case 10:
		mes "[mugan]";
		mes "Chihi no otsukai?" ;
		mes "There was such a thing, too." ;
		mes "You seem to be having a hard time too." ;
		next;
		mes "[Mugan]";
		mes "Do you want to go to the star room?" ;
		mes "If so, I'll give you a lift right now." ;
		next;
		if(select("please", "not yet")==2) {
			mes "[Mugan]";
			mes "Come back when you are done preparing." ;
			close;
		}
		mes "[mgan]";
		mes "You should be coming back to me again soon." ;
		close2;
		warp "job_star.gat",166,29;
		end;
	case 12:
		if(SkillPoint) {
			mes "[Mugan]";
			mes "You have an extra skill point." ;
			mes "You still have some hesitation in your mind." ;
			next;
			mes "[Mugan]";
			mes "Use the skill points you have learned." ;
			mes "Otherwise, you cannot become a Star Gladiator." ;
			close;
		}
		mes "[Mugan]";
		mes "I'm glad you're back." ;
		mes "Your eyes are looking a lot better." ;
		mes "What have you seen and felt?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I have felt that the sun, moon and stars exist." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I felt the warmth of the sun, moon and stars." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I felt the peacefulness that the sun, moon, and stars give." ;
		next;
		mes "[mugan]";
		mes "And?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I felt the scattered sadness of the stars." ;
		mes "I felt the cold fury of the moon." ;
		mes "The sun was rebirth and destruction incarnate." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "The wrath of the sun, the moon, and the stars calls forth the devil who divides all things more." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "But make the sun, moon, and stars your friends, and they have given you infinite blessings." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "My ...... This little body existed majestically in the universe." ;
		next;
		mes "[Mugan]";
		mes "You have become magnificent." ;
		mes "You are now a warrior of the sun, moon and stars." ;
		next;
		unequip;
		jobchange Job_Star;
		set CHANGE_SG,0;
		mes "[Mugan]";
		mes "Let all of us welcome you with open arms." ;
		next;
		mes "[mgan]";
		mes "Choose carefully." ;
		mes "We Star Gladiators are doomed for the rest of our lives by the choices we make." ;
		mes "And don't forget the song you've heard so many times." ;
		next;
		mes "[Mugan]";
		mes "^3434FFThe sun gives out its dazzling light on even days, the moon increases its brightness on odd days, and the stars look for the night on the fifth day and sprinkle their light. ^000000";
		next;
		mes "[Mugan]";
		mes "All I want from you is this." ;
		mes "The rest of your life is at your disposal." ;
		mes "Remember that we Star Gladiators will be under that sky as long as there is a sun, moon and stars." ;
		close;
	}
}

//==========================================
// test
//------------------------------------------

job_star.gat,29,33,0 script tal 59,{
	if(Job ! = Job_Taekwon) {
		mes "[Tal]";
		mes "Please don't interrupt my job search exam." ;
		mes "Would you like to return to the village?" ;
		next;
		if(select("Return to the village", "No")==2) {
			mes "[tal]";
			mes "Yes, I see." ;
			close;
		}
		mes "[Tal]";
		mes "I understand." ;
		mes "I will send you to the village." ;
		close2;
		warp "payon.gat",164,58;
		end;
	}
	switch(CHANGE_SG) {
	case 3:
		mes "[tal]";
		mes "You are the one sent to Dr. Mugan." ;
		mes "Welcome to the sun room." ;
		mes "I have been asked to assist you here." ;
		next;
		mes "[tal]";
		mes "Then I will begin." ;
		mes "What is in front of you now?" ;
		next;
		switch(select("sun", "moon", "stars", "don't know")) {
		case 1:
			mes "[tal]";
			mes "Correct answer. That is the sun." ;
			mes "And we are the sun, too, facing the sun majestically." ;
			set '@test,'@test+1;
			break;
		case 2:
			mes "[tal]";
			mes "Is it a month? ......" ;
			mes "I told you this is the sun room." ;
			break;
		case 3:
			mes "[tal]";
			mes "Is it a star?" ;
			mes "Surely the sun is a star among the many that exist in the universe." ;
			break;
		case 4:
			mes "[tal]";
			mes "I see. ......" ;
			mes "You should be a little more open-minded and imaginative." ;
			break;
		}
		next;
		mes "[tal]";
		mes "Plants and trees create life by the light of the sun." ;
		mes "What do you get from the sun?" ;
		next;
		switch(select("warmth", "comfort", "blessing", "get nothing")) {
		case 1:
			mes "[tal]";
			mes "Yes." ;
			mes "We are given warmth and warmth from its infinite light." ;
			set '@test,'@test+1;
			break;
		case 2:
			mes "[tal]";
			mes "Yes." ;
			mes "When we are in bright light, we wipe away the anxiety of our minds and attain peace." ;
			set '@test,'@test+1;
			break;
		case 3:
			mes "[tal]";
			mes "Yes." ;
			mes "We are blessed as plants and trees are blessed by the sun to create life." ;
			set '@test,'@test+1;
			break;
		case 4:
			mes "[tal]";
			mes "Think and see it in your chest, not in your head." ;
			mes "You definitely have something that you received from the sun." ;
			break;
		}
		next;
		mes "[tal]";
		mes "There is a song like this." ;
		mes "^3434FFThe sun gives out its dazzling light on even days, the moon increases its brightness on odd days, and the stars look for the night on the fifth day and sprinkle their light. ^000000";
		next;
		mes "[tal]";
		mes "You have given the place of the sun to the desert, and the hatred of the sun to the ants." ;
		mes "Thou hast given the place of the moon to the swamp, and the hatred of the moon to the crocodile." ;
		mes "You have given the place of the stars to the old castle, and the hatred of the stars to the black knight." ;
		next;
		mes "[Tal]";
		mes "When is the day when you can shine brightest?" ;
		next;
		if(select("2 days, swamp, black knight", "4 days, desert, ant", "10 days, desert, black knight", "5 days, swamp, alligator")==2)
			set '@test,'@test+1;
		mes "[tal]";
		mes "Hmm, this much is enough." ;
		mes "These three questions will not affect the test." ;
		mes "Don't worry." ;
		next;
		if('@test >= 2) {
			mes "[tal]";
			mes "You are at ......." ;
			mes "Do you believe that the light of the sun started with us?" ;
			next;
			mes "[tal]";
			mes "Do you believe that the light of the sun must be protected by us?" ;
			next;
			mes "[tal]";
			mes "I believe in you." ;
			mes "Be a warrior of the sun and receive the sun's warmth, peace, and blessings with your two hands." ;
			next;
			mes "[tal]";
			mes "Then let us send you to the Room of the Moon." ;
			set CHANGE_SG,5;
			close2;
			warp "job_star.gat",100,13;
			end;
		}
		else {
			mes "[tal]";
			mes "You are ......" ;
			mes "Don't assume the sun is a natural being as it is." ;
			next;
			mes "[tal]";
			mes "They are like parents who breathe with you and live with you in your world." ;
			next;
			mes "[tal]";
			mes "You need to understand the sun a little more." ;
			mes "Sit there and feel the greatness of the sun." ;
			set CHANGE_SG,4;
			close;
		}
	case 4:
		if(rand(5)) {
			mes "[tal]";
			mes "Quietly sink your heart ......" ;
			mes "Close your eyes ......" ;
			mes "Feel the warmth of the gradually approaching sun." ;
			next;
			mes "[tal]";
			mes "We'll continue the next story after you've felt the sun to the fullest." ;
			close;
		}
		mes "[Tal]";
		mes "Did you understand what the sun is like?" ;
		mes "It is even more important to feel it in your chest than to understand it in your head." ;
		next;
		mes "[tal]";
		mes "Thank you for your time." ;
		mes "I trust you understand enough to send you to the moon room." ;
		set @star_test,0;
		set CHANGE_SG,5;
		close2;
		warp "job_star.gat",100,13;
		end;
	case 5:
	case 6:
		mes "[tal]";
		mes "Why are you still here?" ;
		mes "I will send you to the moon room." ;
		close2;
		warp "job_star.gat",100,13;
		end;
	default:
		mes "[tal]";
		mes "Do you like the sun room?" ;
		mes "Or are you lost?" ;
		mes "You must now be in the Room of the Stars." ;
		next;
		mes "[tal]";
		mes "I will send you to the 'star room'." ;
		close2;
		warp "job_star.gat",166,29;
		end;
	}
}

job_star.gat,95,33,0 script pilu 106,{
	if(Job ! = Job_Taekwon) {
		mes "[Pilu]";
		mes "It interferes with the job test." ;
		mes "If you can't keep quiet, go back to your village." ;
		mes "Go back now?" ;
		next;
		if(select("Return to the village", "No")==2) {
			mes "[Pilu]";
			mes ".................." ;
			mes "Well, ...... Don't bother." ;
			close;
		}
		mes "[Pilu]";
		mes "I'll send you to the village." ;
		close2;
		warp "payon.gat",164,58;
		end;
	}
	switch(CHANGE_SG) {
	case 5:
		mes "[Pilu]";
		mes "Come quickly." ;
		mes "O shadow of the moon!" ;
		mes "From now on, this Pilu will deal with you." ;
		next;
		mes "[Pilu]";
		mes "Let us ask." ;
		mes "What kind of moon do we need?" ;
		mes "What moon is the moon you wish for?" ;
		next;
		switch(select("red moon", "blue moon", "yellow moon","......?")) {
		case 1:
			mes "[pyru]";
			mes "If it's a red moon, ......" ;
			mes "Do you wish to embrace blood?" ;
			mes "It is better to keep madness away." ;
			break;
		case 2:
			mes "[Pilu]";
			mes "The moon, which is quiet and blue, calms the mind and helps you find your calm self." ;
			mes "Good choice." ;
			set '@test,'@test+1;
			break;
		case 3:
			mes "[Pilu]";
			mes "The moon shining in gold promises a bountiful harvest for all." ;
			mes "It shows the abundance that the master of the night possesses." ;
			mes "Not a bad choice." ;
			set '@test,'@test+1;
			break;
		case 4:
			mes "[piru]";
			mes "It's very important to have your own opinion." ;
			mes "You need to be more confident." ;
			mes "No way. ...... You don't like the moon?" ;
			break;
		}
		next;
		mes "[Pilu]";
		mes "What is that reason you are the shadow of the moon?" ;
		next;
		switch(select("righteous practice", "self-mastery", "nature conservation", "revenge")) {
		case 1:
			mes "[Pilu]";
			mes "Do you practice justice through martial arts and force?" ;
			mes "You know that you need force to carry out your faithghost." ;
			set '@test,'@test+1;
			break;
		case 2:
			mes "[piru]";
			mes "It's very important to cure ourselves." ;
			mes "But we must not forget the reason and the goal of why we practice." ;
			set '@test,'@test+1;
			break;
		case 3:
			mes "[piru]";
			mes ".................. Of course, it is our mission to protect nature." ;
			mes "But we don't have to be the shadow of the moon to protect nature." ;
			break;
		case 4:
			mes "[Pilu]";
			mes "The blue moon utters a silent fury." ;
			mes "After a cold smile, he wields a well-honed blade." ;
			mes "Like a sunken lake ............." ;
			mes "But ......." ;
			next;
			mes "[Pilu]";
			mes "After you're done with your revenge, what will you live on?" ;
			mes "It seems you must learn harmony rather than blind revenge." ;
			break;
		}
		next;
		mes "[Pilu]";
		mes "Remember this song?" ;
		mes "^3434FFThe sun gives out its dazzling light on even days, the moon increases its brightness on odd days, and the stars look for the night on the fifth day and sprinkle their light. ^000000";
		next;
		mes "[Pillu]";
		mes "You have given the place of the sun to the desert and the hatred of the sun to the ants." ;
		mes "You have given the place of the moon to the swamp, and the hatred of the moon to the crocodile." ;
		mes "You have given the place of the stars to the old castle, and the hatred of the stars to the black knight." ;
		next;
		mes "[Pilu]";
		mes "When do you shine brightest as the shadow of the moon?" ;
		next;
		if(select("2 days, swamp, black knight", "4 days, desert, ant", "10 days, desert, black knight", "5 days, swamp, alligator")==4)
			set '@test,'@test+1;
		mes "[pyru]";
		mes "This is enough for a simple question." ;
		next;
		if('@test >= 2) {
			mes "[Pilu]";
			mes "You are ......." ;
			mes "You must understand what the shadow of the moon is, what the quiet, hushed moonlight means." ;
			next;
			mes "[Pillu]";
			mes "It is the cold moon that exists so that the hot passion of the sun does not burn out your heart." ;
			mes "You must be the shadow of such a moon." ;
			next;
			mes "[Pillu]";
			mes "You must become the shadow of the moon, accept the wrath of all, and fight on their behalf as a warrior of the moon." ;
			next;
			mes "[Pilu]";
			mes "I will not say the same thing twice." ;
			mes "It is the same for the warrior of the sun, the shadow of the moon, and the tears of the stars." ;
			next;
			mes "[Pilu]";
			mes "Every person is always at a crossroads of choice." ;
			mes "And it is precisely we, Star Gladiators, who have to spend a lifetime at choices that we cannot look back on." ;
			next;
			mes "[Pilu]";
			mes "I hope that you will follow a path that you will never regret." ;
			mes "Then I will qualify you to go to the star chamber." ;
			set CHANGE_SG,8;
			close2;
			warp "job_star.gat",166,29;
			end;
		}
		else {
			mes "[piru]";
			mes "You are ......" ;
			mes "You need to understand more about what the blue moonlight means." ;
			next;
			mes "[piru]";
			mes "A short mind cannot contend on behalf of the moon." ;
			mes "You must develop patience, and you must cultivate an equanimity that allows you to remain in place at all times." ;
			next;
			mes "[Pilu]";
			mes "I will not say the same path twice." ;
			mes "It is the same for the warrior of the sun, the shadow of the moon, and the tears of the stars." ;
			next;
			mes "[Pilu]";
			mes "Every person is always at a crossroads of choice." ;
			mes "And it is precisely we, Star Gladiators, who have to spend a lifetime at choices that we cannot look back on." ;
			next;
			mes "[Pilu]";
			mes "If you still want to take the path of no regrets, then show me the proof." ;
			set CHANGE_SG,6;
			close2;
			warp "payon.gat",164,58;
			end;
		}
	case 7:
		mes "[piru]";
		mes "........................ ff." ;
		mes "I'm getting a little tired of waiting." ;
		mes "If you hadn't come back, you would have lived with regret for the rest of your life." ;
		next;
		mes "[piru]";
		mes "You need 'guts' to live a life without regrets." ;
		mes "Perseverance," "inclusion," and the "guts" for the "understanding" and challenges that can support it all." ;
		next;
		mes "[Pillu]";
		mes "You must train your mind before you allow yourself to be captured by the forces, and conversely, you must master the forces." ;
		mes "Without bending his faithghost, man should live his life looking up to the sky with dignity." ;
		next;
		mes "[Pillu]";
		mes "A life without regret." ;
		mes "That's exactly what we Star Gladiators are going for!" ;
		mes "You who have fallen down and got up again, you deserve to go to the Star Chamber!" ;
		set CHANGE_SG,8;
		close2;
		warp "payon.gat",164,58;
		end;
	default:
		mes "[piru]";
		mes "Why is it still here?" ;
		mes "Do you like it on a blue full moon?" ;
		mes "I don't know, but aren't you taking the test to become a Star Gladiator?" ;
		next;
		mes "[Pilu]";
		mes "I'll send you to the Star Chamber." ;
		close2;
		warp "job_star.gat",166,29;
		end;
	}
}

job_star.gat,161,33,0 script chihi 77,{
	if(Job ! = Job_Taekwon) {
		mes "[Chihi]";
		mes "Isn't the starlight beautiful?" ;
		mes "Shall we return to the village?" ;
		next;
		if(select("Return to the village", "No")==2) {
			mes "[Chihi]";
			mes "I see." ;
			close;
		}
		mes "[Chihi]";
		mes "I understand." ;
		mes "I will return you to the village." ;
		close2;
		warp "payon.gat",164,58;
		end;
	}
	switch(CHANGE_SG) {
	case 8:
		mes "[chihi]";
		mes "How are you doing?" ;
		mes "Isn't the starlight really pretty?" ;
		next;
		mes "[Chihi]";
		mes "It's almost as if it's a little girl's tears scattered on a black curtain." ;
		set CHANGE_SG,9;
		close;
	case 9:
		if(rand(3)) {
			mes "[chhi]";
			mes ".............................." ;
			mes ".............................." ;
			next;
			mes "-She keeps her eyes on the stars in the sky-";
			close;
		}
		mes "[Chihi]";
		mes "Can you get that star on earth?" ;
		mes "Can I have these stars that will disappear like dust if I scatter them?" ;
		set CHANGE_SG,10;
		close;
	case 10:
		if(countitem(1000) < 1 || countitem(1001) < 1) {
			mes "[chihi]";
			mes "Piece of star ...... And star dust." ;
			mes "You can't get it here." ;
			mes "Please come down the mountain once to get it." ;
			close2;
			warp "payon.gat",164,58;
			end;
		}
		mes "[chihi]";
		mes "Thank you for your patience." ;
		mes "People forge iron on a planet like this, don't they?" ;
		next;
		mes "[Chihi]";
		mes "People who live their days timidly try to protect people, life, and all things by the power of the stars." ;
		next;
		mes "[Chihi]";
		mes "And the star that has become iron will protect other life by taking life." ;
		next;
		mes "[Chihi]";
		mes "This is a sad thing." ;
		mes "But you understand in your head that this is reality, don't you?" ;
		next;
		mes "[Chihi]";
		mes "Isn't the light flowing through the Milky Way beautiful?" ;
		mes "But those are the tears of the stars, born from the lives that disappeared and joined together in the sky." ;
		next;
		mes "[Chihi]";
		mes "Try to get the sun's momentum, the moon's momentum, and the stars' momentum: ......." ;
		next;
		mes "[Chihi]";
		mes "Then I will ask you." ;
		mes "Whose tears would you be willing to shed blood instead?" ;
		delitem 1000,1;
		delitem 1001,1;
		set CHANGE_SG,11;
		close;
	case 11:
		mes "[Chihi]";
		mes "Have you thought about it?" ;
		mes "I'm sure it wasn't a difficult question." ;
		mes "I was just asking if you know that tears are always with those who have shed blood." ;
		next;
		mes "[Chihi]";
		mes "^3434FFThe sun gives out its dazzling light on even days, the moon increases its brightness on odd days, and the stars look for the night on the fifth day and sprinkle their light. ^000000You have heard this song, have you not?" ;
		next;
		mes "[Chihi]";
		mes "You have given the place of the sun to the desert and the hatred of the sun to the ants." ;
		mes "You have given the place of the moon to the swamp and the hatred of the moon to the crocodile." ;
		mes "You have given the place of the stars to the old castle and the hatred of the stars to the black knight." ;
		next;
		mes "[Chihi]";
		mes "Do you know at what time the light of the star shines brightest from you?" ;
		next;
		if(select("5 days, old castle, ants", "10 days, desert, ants", "25 days, old castle, black knight", "10 days, desert, black knight")==3) {
			mes "[Chihi]";
			mes "You seem to understand." ;
			mes "The stars go around the universe in cycles and come to visit us." ;
			mes "It is on even days that we confront the sun and become one sun ourselves." ;
			next;
			mes "[Chihi]";
			mes "It is an odd day to be one with the moon and become a shadow." ;
			mes "It is the fifth day that the stars themselves visit us." ;
			next;
			mes "[Chihi]";
			mes "The starlight that visits us every fifth day bestows its blessings upon us." ;
			mes "A star day, a star place, and a star hate bestowed upon us." ;
			next;
			mes "[Chich]";
			mes "That is the day when you will shine the strongest." ;
			mes "Star Gladiator must better understand the emotions, warmth and hatred of the sun, moon and stars." ;
			next;
			mes "[Chihi]";
			mes "The sun, the moon, the stars and our principles are on everyone in the song I just wrote." ;
			mes "Think slowly and understand what it means." ;
		}
		else {
			mes "[Chihi]";
			mes "Star Gladiator needs to understand more about the emotions, warmth and hatred of the sun, moon and stars." ;
			next;
			mes "[Chihi]";
			mes "The sun, the moon, the stars and our principles depend on everyone." ;
			mes "Think slowly and understand what it all means." ;
		}
		next;
		mes "[Chihi]";
		mes "When you become a Star Gladiator, you must remember to reflect on what it means and choose a choice you will not regret." ;
		next;
		mes "[Chihi]";
		mes "If you feel starry-eyed and satisfied enough, we will send you back to Dr. Mugan." ;
		set CHANGE_SG,12;
		close;
	case 12:
		mes "[Chihi]";
		mes "Do you want to go down the mountain?" ;
		next;
		if(select("yes", "no")==2) {
			mes "[Chihi]";
			mes "You can stay here as long as you want until you fill your heart with starlight." ;
			mes "Be spontaneous, take your time, and have no regrets in the future. ............" ;
			close;
		}
		mes "[Chihi]";
		mes "I will send you to a nearby village." ;
		close2;
		warp "payon.gat",164,58;
		end;
	}
}
