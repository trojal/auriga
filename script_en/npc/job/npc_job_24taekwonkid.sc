//====================================================================
//Ragnarok Online TaekwonKid Jobchange Script
// - CHANGE_TK -> 0 to 3
// - CHANGE_TK -> 0 to 3
// CHANGE_TK_LV -> BaseLevel save variable
//====================================================================

//==========================================
// test application and job change
//------------------------------------------

payon.gat,157,141,5 script phoenix 753,{
	if(Job == Job_Taekwon) {
		mes "[Phoenix]";
		mes "Have you been neglecting your training?" ;
		mes "Have you been to the Adventurer Academy since becoming a Taekwon Kid?" ;
		next;
		mes "[Phoenix]";
		mes "If you want to learn the basics to improve yourself, you should go." ;
		next;
		mes "[Phoenix]";
		mes "There, you will see someone supporting the Adventurers Academy." ;
		mes "You can ask that one to send you there." ;
		next;
		mes "[Phoenix]";
		mes "Always be diligent, and never forget the mind that constantly pursues higher and higher." ;
		close;
	}
	if(Upper == Upper_BABY) {
		mes "[Phoenix]";
		mes "I have decided to cultivate a sound mind through proper training, and at the same time, to spread the path I have realized through my training to the world." ;
		mes "Perhaps that is the best I can do." ;
		close;
	}
	if(Job == Job_Novice && Upper == UPPER_NORMAL && CHANGE_TK == 3) {
		mes "[Phoenix]";
		mes "Are you ready for the heart?" ;
		mes "Then this is the last question." ;
		mes "It's not that big of a deal, but I want to hear your honest feelings without embellishment." ;
		next;
		mes "[Phoenix]";
		mes "^FF0000 Can you accept the path we've been talking about?" ;
		mes "And can you make the effort to continue on that path?" ;
		mes "It is a lonely road. Are you ready for that much? ^000000Come on, answer me." ;
		next;
		if(select("Yes!" , "still ......") ==2) {
			mes "[Phoenix]";
			mes "...... I guess you're not ready yet." ;
			mes "You are not ready to be a true practitioner." ;
			mes "Come to me when you are properly, prepared." ;
			mes "It's good to be honest, but it's not enough to go down this hard road." ;
			close;
		}
		mes "[Phoenix]";
		mes "All right!  If you're that determined, I'll say no more." ;
		mes "No, there's no need for you to do anything more." ;
		mes "When you have that spirit, you are already a great practitioner." ;
		next;
		mes "[Phoenix]";
		mes "The name of the path I walk is ......." ;
		mes "Well, the name is not important, but anyway, the name of this path is called ^FF0000 Tae Kwon Do ^000000." ;
		mes "Tae Kwon Do's Tae Kwon means feet and fists, and Do means path." ;
		next;
		mes "[Phoenix]";
		mes "Use the four limbs and incorporate them into the technique." ;
		mes "That is the discipline." ;
		mes "If you utilize all four limbs 100% and have the right spirit, the techniques derived from them will come naturally to you." ;
		next;
		mes "[Phoenix]";
		mes "In the future, you should cherish that spirit and also pass it on to other practitioners." ;
		mes "Even if you cannot pass it on, it is worthwhile to continue practicing." ;
		next;
		unequip;
		getitem 11043,1;
		getitem 2101,1;
		jobchange Job_Taekwon;
		set CHANGE_TK,0;
		chgquest 6002,50220;
		mes "[Phoenix]";
		mes "You ...... Hmmm, yeah, ......." ;
		mes "I'll give you a proper name to call me." ;
		mes "It's 'Taekwon Kid'." ;
		mes "Nice name, right?" ;
		mes "You can be confident." ;
		next;
		mes "[Phoenix]";
		mes "This is the best attire to train in and a shield to protect you when training." ;
		mes "By all means, use it." ;
		next;
		mes "[Phoenix]";
		mes "Now then, go!" ;
		mes "Use that sound mind of yours and the body you are about to train as a weapon to cleanse the world!" ;
		mes "Just because it's an ordeal doesn't necessarily mean you have to stay in the mountains and be alone." ;
		next;
		mes "[Phoenix]";
		mes "Whenever you run into difficulties, come to me." ;
		mes "I'll always be there for simple advice." ;
		mes "[Phoenix]"; mes "But basically, you'll be able to solve most things on your own, so don't forget that." ;
		next;
		mes "[Phoenix]";
		mes "If you are ever unsure of the path you should take, look to the Book of the Taekwon Kid." ;
		mes "It should be helpful." ;
		close;
	}
	if(Job == Job_Novice && Upper == UPPER_NORMAL && CHANGE_TK == 2) {
		mes "[Phoenix]";
		mes "Okay, looks like we're ready to go." ;
		mes "Then let's get into the lecture." ;
		mes "Yeah, I said test the spirit, but not that big a deal." ;
		mes "Simply ask the obvious questions and remember the obvious." ;
		next;
		mes "[Phoenix]";
		mes "When you have finished that, I will admit that you are qualified to be an accomplished practitioner." ;
		mes "It's a simple question and answer, so there's nothing to be nervous about." ;
		next;
		mes "[Phoenix]";
		mes "The first is about will." ;
		mes "The path of discipline: ...... This path is very steep." ;
		mes "It is a hard, lonely, long road where you have to give up all other pleasures and rest." ;
		next;
		mes "[Phoenix]";
		mes "There will also be many difficulties on the way." ;
		next;
		mes "[Phoenix]";
		mes "So, when you face those difficulties, what will you do?" ;
		mes "I'll give you some examples, and you can pick the one you think is right." ;
		next;
		switch(select("face the difficulty", "seek another way", "rest for a while and get ready again")) {
		case 1:
			mes "[Phoenix]";
			mes "Okay, you're right." ;
			mes "When faced with a difficulty, it is better to confront it directly, even if it is not likely to be resolved immediately." ;
			next;
			mes "[Phoenix]";
			mes "Also, do not fear even death in order to carry out your faithghost under any circumstances." ;
			next;
			mes "[Phoenix]";
			mes "And believe in yourself, a strong faith ghost and the spirit of the first intention." ;
			mes "[Phoenix]"; mes "If you go forward with these things, there will be nothing that stands in your way." ;
			next;
			mes "[Phoenix]";
			mes "Even if there were, it would not be much of an obstacle." ;
			next;
			mes "[Phoenix]";
			mes "Even if you cannot break through the difficulty immediately, your body will grow in the process of facing it." ;
			mes "Therefore, your answer is perfect." ;
			next;
			mes "[Phoenix]";
			mes "As for the will, there is nothing more for me to say." ;
			mes "Then let's move on to the next item." ;
			break;
		case 2:
			mes "[Phoenix]";
			mes "You fool! You're going to seek another path? Are you going to so easily bend your decision to go on the path of discipline just because it's hard for you!" ;
			next;
			mes "[Phoenix]";
			mes "Of course, looking for other paths is one thing in itself. In life, there is no daring to go down a difficult path that does not suit you." ;
			next;
			mes "[Phoenix]";
			mes "In that light, this may be the wiser way." ;
			next;
			mes "[Phoenix]";
			mes "But it is outrageous that you would so easily reverse what you have decided to do just on the assumption that there will be difficulties, when you have not yet taken even a single step along this path!" ;
			mes "Impossible!" ;
			next;
			mes "[Phoenix]";
			mes "Come to your senses!" ;
			mes "In your current state of mind, you will never be able to accomplish anything else, let alone practice." ;
			mes "Realize that you are in such a pathetic state, and review your mental attitude first!" ;
			close;
		case 3:
			mes "[Phoenix]";
			mes "Rest or ....... I like that too." ;
			mes "If you can't help it, one way is to take a break for a while and get yourself back in shape." ;
			mes "It takes you off the road for a while, but that doesn't mean you have to keep running all the time." ;
			next;
			mes "[Phoenix]";
			mes "Walking or sitting for a little while can be a fine way to keep one on the path." ;
			next;
			mes "[Phoenix]";
			mes "But that can only be said when you have done your best, to the best of your ability." ;
			mes "When you run into difficulties, you should first do your best and push your limits before you rest." ;
			next;
			mes "[Phoenix]";
			mes "If the situation is extreme and still unsolvable, it is also natural to choose to rest for a while to regain one's strength." ;
			mes "Of course, it is also good to rest after defeating difficulties." ;
			next;
			mes "[Phoenix]";
			mes "Therefore, resting for a while and getting ready again is not a perfectly correct answer." ;
			mes "[Phoenix]"; mes "Come again and think it over." ;
			close;
		}
		next;
		mes "[Phoenix]";
		mes "Now a question about something other than yourself." ;
		mes "Listen carefully and answer." ;
		next;
		mes "[Phoenix]";
		mes "As you walk the path of discipline, you will bump into people more or less, whether you like it or not." ;
		next;
		mes "[Phoenix]";
		mes "That is unavoidable because this path of cultivation is in conflict with our instincts and original desires." ;
		next;
		mes "[Phoenix]";
		mes "It is such a particular path." ;
		mes "Others may not understand this path that deviates from the general, and we may not understand the general either." ;
		next;
		mes "[Phoenix]";
		mes "Such differences in consciousness mean that we cannot escape clashing with others." ;
		mes "Whatever the reason, when you clash like this, what do you do?" ;
		next;
		switch(select("I'll stick to my faith GHOST no matter what", "Let bygones be bygones and go my way", "Acknowledge everything and keep going on my way")) {
		case 1:
			mes "[Phoenix]";
			mes "The heart that stubbornly adheres to the original intention is good." ;
			mes "However, no matter how solitary the path one takes, one will always live with many people." ;
			next;
			mes "[Phoenix]";
			mes "Nevertheless, it is a dangerous idea to insist on sticking only to one's own faith GHOST and to force others to do so as well." ;
			next;
			mes "[Phoenix]";
			mes "Moreover, it is not desirable to make others understand such a steep path and difficult thought." ;
			mes "It is enough for a few to go on such a lonely and painful path of training." ;
			next;
			mes "[Phoenix]";
			mes "We must go on this lonely and solitary path." ;
			mes "That is why I understand the desire to increase the number of practitioners." ;
			mes "But we cannot force it on others." ;
			next;
			mes "[Phoenix]";
			mes "Do you understand?  I like your spirit of trying to protect that faith GHOST of yours, but it's not the right answer." ;
			next;
			mes "[Phoenix]";
			mes "Therefore, think again." ;
			mes "It is desirable to keep the faithghost, but also keep in mind that human beings are beings who can never go on living alone." ;
			close;
		case 2:
			mes "[Phoenix]";
			mes "As I told you earlier, it is important to face difficulties once you face them." ;
			mes "But to pretend that there were not two paths itself and to go your own way is close to running away." ;
			next;
			mes "[Phoenix]";
			mes "It is a problem to clash with all your might and appear too coercive." ;
			mes "How much to argue and how much to compromise: ......." ;
			mes "That has to be decided after properly confronting them." ;
			next;
			mes "[Phoenix]";
			mes "That is why it is very desirable to go your own way, but it is not good to go ahead without listening to what others have to say and without even asserting your own opinion." ;
			next;
			mes "[Phoenix]";
			mes "So think again." ;
			mes "It is never wrong to follow your own path, but when you are in conflict with others, it is better to consider other points of view." ;
			close;
		case 3:
			mes "[Phoenix]";
			mes "It is quite a challenge to acknowledge any opinion or beliefghost of others as well as your own." ;
			mes "It would be difficult to carry it out." ;
			next;
			mes "[Phoenix]";
			mes "But the process of striving to understand each other and the other is the discipline." ;
			mes "Never avoid this process." ;
			next;
			mes "[Phoenix]";
			mes "You may not be able to understand the other person, but you can acknowledge them." ;
			mes "If you keep that in mind, the other person will open up and try to make an effort to be acknowledged." ;
			next;
			mes "[Phoenix]";
			mes "All you have to do is accept their efforts with a pure heart." ;
			next;
			mes "[Phoenix]";
			mes "And when you are able to recognize and accept one's faith ghost, then you will be able to go one step further." ;
			mes "Do you understand?" ;
			mes "Yes, you made the right choice." ;
			next;
			mes "[Phoenix]";
			mes "Okay, that's it for the mental adequacy test." ;
			mes "Take a break before the last question." ;
			mes "[Phoenix]"; mes "You must be tired of hearing so much at once." ;
			mes "Take a short break and then call on me again." ;
			set CHANGE_TK,3;
			chgquest 6001,6002;
			close;
		}
	}
	if(Job == Job_Novice && Upper == UPPER_NORMAL && CHANGE_TK == 1) {
		if(BaseLevel > CHANGE_TK_LV) {
			mes "[Phoenix]";
			mes "Yeah?" ;
			mes "This feels like ...... Right. ......" ;
			mes "Like I said, you've been practicing." ;
			mes "Then I will test your spirit as I promised." ;
			mes "Take a few deep breaths and call on me when you're ready." ;
			set CHANGE_TK_LV,0;
			set CHANGE_TK,2;
			chgquest 6000,6001;
			close;
		}
		mes "[Phoenix]";
		mes "All you have to do now is ^FF0000BaseLv a little higher. You didn't forget ^000000my advice, did you?" ;
		mes "Now, go train!" ;
		mes "Young man." ;
// next;
// mes "[Phoenix]"
// mes "By yourself alone."
// mes "You may train yourself, but"; // mes "[Phoenix]
// mes "to train yourself"; // mes "[Phoenix]"; // mes "[Phoenix]"; // mes "[Phoenix]
// mes "You will also need the optimal environment." ;
// mes "A place called ^0000FF Adventurers Academy is";
// mes "It should help you grow. ^000000";
// next;
// mes "[Phoenix]"
// mes "Right there, support the academy."
// mes "Do you see someone doing that?" ;
// mes "Talk to that person, and ";
// mes "Go to the ^0000FF Adventurers Academy and "
// mes "Go train yourself. ^000000";
		close;
	}
	mes "[Phoenix]";
	mes "My name is Phoenix." ;
	mes "I am a practitioner who devotes himself and trains himself to purify this world from evil." ;
	mes "I abandoned my real name at the start of my training, and I call myself 'Phoenix'." ;
	mes "You can call me Phoenix." ;
	next;
	mes "[Phoenix]";
	mes "How do you think you can purify the world?" ;
	mes "Good question. It's not often we get a chance to talk like this, so make sure you listen properly." ;
	next;
	mes "[Phoenix]";
	mes "The reason the world is stained with evil, in my opinion, is because so many people have failed to cultivate a sound mind." ;
	mes "Moreover, in a world where it is hard enough just to have a relationship with people, there are also many monsters inhabiting the world." ;
	next;
	mes "[Phoenix]";
	mes "For weak people living in such a difficult world to live in, it may be inevitable that they cannot have a healthy spirit." ;
	next;
	mes "[Phoenix]";
	mes "However, just because we are aware of such a situation, we cannot just stand by and watch this world become stained with evil." ;
	mes "That's where I stand up for the world!" ;
	next;
	mes "[Phoenix]";
	mes "But ...... I'm just another human being." ;
	mes "How can I, such as I am, change the world?" ;
	next;
	mes "[Phoenix]";
	mes "That's why I gave up my name to become a practitioner." ;
	mes "To change the world, you must become strong yourself." ;
	next;
	mes "[Phoenix]";
	mes "So ...... A sound mind dwells in a healthy body." ;
	mes "Of course, there are people who have healthy bodies but do evil things." ;
	mes "This is probably because they could never have a truly healthy body." ;
	next;
	mes "[Phoenix]";
	mes "Or it may be because they pursued only a healthy body and neglected to cultivate their spirit." ;
	mes "In any case, it is certainly an undesirable situation." ;
	next;
	mes "[Phoenix]";
	mes "I have made up my mind to cultivate a sound mind through proper training and at the same time to spread the path of a sound mind, which I have realized through my training, to the world." ;
	mes "Perhaps that is the best I can do." ;
	if(Job ! = Job_Novice || Upper ! = UPPER_NORMAL)
		close;
	next;
	mes "[Phoenix]";
	mes "So you, if you have not yet decided what path to take, why don't you go through the hard training and throw yourself into the battle to purify the world?" ;
	next;
	mes "[Phoenix]";
	mes "It would certainly be a meaningful battle." ;
	next;
	mes "[Phoenix]";
	mes "Then you may choose." ;
	mes "You'd better think it over and choose wisely." ;
	next;
	if(select("agree", "disagree")==2) {
		mes "[Phoenix]";
		mes "I see. ...... There are an infinite number of paths a human being can choose to live on, but of course, we can't choose all of them." ;
		mes "So it is also wise to abandon the path that does not suit you." ;
		mes "You should have confidence in your choices." ;
		next;
		mes "[Phoenix]";
		mes "You may trust your own heart as to which path to take." ;
		mes "If you follow your own faithghost, it may one day lead to the purification of the world." ;
		close;
	}
	if(getskilllv(1) < 9) {
		mes "[Phoenix]";
		mes "...... Remaining GHOST, but you lack the ^0000FF "basic skills" to walk the same path with me." ;
		mes "You'll come when you get your JobLv up to 10 and your ^0000FF "Basic Skill" is 9 ^000000!" ;
		next;
		mes "[Phoenix]";
		mes "The ^0000FF "Basic Skills" ^000000 levels can be raised in the ^0000FF "Skill List" ^000000 window." ;
		mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
		next;
		mes "[Phoenix]";
		mes "You need to ^FF0000FF "Confirm"^000000 button after assigning skill points to increase the level of the skill." ;
		mes "You should Attention." ;
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[phoenix]";
	mes "Okay, then let's get started right away." ;
	mes "A sound mind is important, but first let's see how well the body is trained." ;
	next;
	if(BaseLevel >= 20) {
		mes "[Phoenix]";
		mes "...... Looks like that won't be necessary." ;
		mes "It is enough to have such a strong body and strength at the Novice stage, when you are not in a specific profession." ;
		next;
		mes "[Phoenix]";
		mes "Okay, as for physical strength and willpower, I don't need to try anymore." ;
		mes "[Phoenix]"; mes "Next, let's test your spirit." ;
		mes "Take a few deep breaths and call on me when your mind is ready." ;
		set CHANGE_TK,2;
		setquest 6001;
		close;
	}
	mes "[Phoenix]";
	mes "You are not up to the strength to withstand the training now, no matter how you look at it." ;
	mes "You will certainly become stronger through training, but you will not be able to achieve results in your current state." ;
	next;
	mes "[Phoenix]";
	mes "That's why ^FF0000BaseLv should go up a little more. ^000000";
	next;
	mes "[Phoenix]";
	mes "In Novice status, fight and win against monsters and repeat it to get stronger. ......" ;
	mes "It's a pretty hard and steep road, but this is a test of your physical potential and your will. This much should be easy." ;
	next;
	set CHANGE_TK_LV,BaseLevel;
	set CHANGE_TK,1;
	setquest 6000;
	mes "[Phoenix]";
	mes "Now go!" ;
	mes "But don't be alarmed." ;
	mes "If you long for something, this world will respond to your wish." ;
	next;
	mes "[Phoenix]";
	mes "Even if the world does not respond to your wish, I believe that with your will, you will do well enough!" ;
// next;
// mes "[Phoenix]"
// mes "However, you alone have the power."
// mes "I am not overconfident." ;
// mes "to train yourself."
// mes "You will also need an optimal environment." ;
// mes "A place called ^0000FF Adventurers Academy is";
// mes "It will help you grow. ^000000";
// next;
// mes "[Phoenix]"
// mes "There you will support the academy."
// mes "There are people who are doing it." ;
// mes "Talk to that person and ";
// mes "Go to the ^0000FF Adventurers Academy and "
// mes "Go and train yourself. ^000000";
	close;
OnInit:
	waitingroom "changing jobs",0;
	end;
}
