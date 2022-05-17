//====================================================================
//Ragnarok Online - ExpandedSuperNovice Jobchange Script by refis
// - CHANGE_SNV2 -> 0-7,99
// - CHANGE_SNV2 -> 0-7,99
//====================================================================

aldeba_in.gat,216,169,5 script seray#sp2 86,{
	if(Job == Job_Novice) {
		mes "[Seray]";
		mes "You are someone who has yet to know the joys of walking the mundane path!" ;
		mes "Would you like to become a Novice Club member?　Novice is great." ;
		next;
		mes "[Seray]";
		mes "Novice is great!" ;
		mes "hahahaha!!!" ;
		close;
	}
	if(Job == Job_ExpandedSuperNovice) {
		mes "[Seray]";
		mes "You seem to be stronger than before." ;
		mes "I thought you could pass the test." ;
		close;
	}
	if(CHANGE_SNV2 >= 1 && CHANGE_SNV2 <= 7) {
		mes "[Seray]";
		mes "A legend in Novice circles disappeared a few days ago, saying he had something to do at Comodo." ;
		mes "I'm sorry, but could you please go to Comodo and find that person?" ;
		next;
		mes "[Seray]";
		mes "I am sure he is fishing again at ^FF0000Comodo^000000." ;
		next;
		mes "[Seray]";
		mes "I'm sure that person can offer you a way forward ......." ;
		close;
	}
	if(Job ! = Job_SuperNovice) {
		mes "[Seray]";
		mes "nn......" ;
		mes "I see you have already strayed from the path of mediocrity and can no longer return." ;
		mes "Well ...... Live dangerously on our behalf until you feel better." ;
		close;
	}
	if(BaseLevel < 99 || JobLevel < 99) {
		mes "[Seray]";
		mes "Hmm?  Are you not a member of our Novice Club?" ;
		mes "Oh, you are so stylish in your clothes!" ;
		next;
		mes "[Seray]";
		mes "Let's continue to eat and live normally!" ;
		mes "By the way, I am the number one member directly under Mr. Toserei!　Ehmen!" ;
		next;
		mes "[Seray]";
		mes "Yes, I heard that there is a way to break through the limits of Supernovice: ......." ;
		mes "Come back when you have mastered Supernovice!" ;
		next;
		mes "[Seray]";
		mes "-^FF0000Come back when you reach BaseLv99 and JobLv99^000000-";
		close;
	}
	mes "[Seray]";
	mes "Mm?  Are you not a member of our Novice Club?" ;
	mes "Oh, you're all scrubbed up and ......." ;
	next;
	mes "[Seray]";
	mes "Mm!  I'm strong."; mes "[I'm strong]"; mes "[I'm strong]"; mes "[I'm strong]" ;
	next;
	mes "[Seray]";
	mes "You look full of chi and ......." ;
	mes "I think I can get through that person's exam now." ;
	next;
	mes "[Seray]";
	mes "I have a way to make you even stronger than you are now, would you like to hear it?" ;
	next;
	if(select("I am happy with what I have", "I want to be stronger!") == 1) {
		mes "[Seray]";
		mes "If you are happy with the way you are, then I have nothing to say." ;
		mes "Let's continue to eat and live normally!" ;
		close;
	}
	mes "[Seray]";
	mes "That's the spirit and good! Then I will ask you to find a certain one." ;
	next;
	mes "[Seray]";
	mes "That person is a legend in the Novice world, but he disappeared a few days ago, saying that he had something to do at Comodo." ;
	next;
	mes "[Seray]";
	mes "I am sure he is fishing again at ^FF0000Comodo^000000." ;
	next;
	set CHANGE_SNV2,1;
	setquest 5092;
	mes "[Seray]";
	mes "That person can offer you a way forward!" ;
	close;
OnInit:
	waitingroom "Break through the limits!!!" ,0;
	end;
}

comodo.gat,200,75,4 script Fishing Novice#sp2 567,{
	if(Job == Job_ExpandedSuperNovice) {
		set '@super2,rand(1,10);
		if('@super2 == 2) {
			mes "[no dollars]";
			mes "Young people these days have no guts!!!! Guts!!!" ;
			next;
			mes "[noddle]";
			mes "They are trying to make things easy instead of trying to solve everything themselves. ......" ;
			close;
		}
		else if('@super2 == 4) {
			mes "[no dollar]";
			mes "Why are you always in a hurry and why don't you think about taking your time!" ;
			next;
			mes "[noddle]";
			mes "Hurry, hurry, hurry, and you'll only tire yourself out even more. ......." ;
			close;
		}
		else if('@super2 == 8) {
			mes "[no dollar]";
			mes "If anyone works hard and puts in the effort, they will be recognized for their efforts." ;
			mes "Just like you!" ;
			close;
		}
		mes "[noddle]";
		mes "Keep in mind, you're a Novice." ;
		mes "Novices always be Novices!" ;
		mes "Always have fun and live an ordinary life." ;
		close;
	}
	switch(CHANGE_SNV2) {
	case 1:
		mes "[Fishing Novice]";
		mes "Quiet! Be quiet." ;
		mes "Because the fish will escape!!!" ;
		next;
		menu "That ...... Maybe it's ......" ,-;
		mes "[Novice fishing]";
		mes "Whoa!  What are you!!! Didn't I tell you to be quiet? I said it twice out loud, didn't I? And now all the fish are running away because you're being so loud!!!!" ;
		next;
		mes "[Novice fishing]";
		mes "What's with your eyes?" ;
		mes "You came and all the fish are gone, isn't this true?" ;
		mes "What are you in the first place?" ;
		mes "Why are you messing with my fishing?" ;
		mes "Hmm? ";
		next;
		menu "Mr. Seray asked me to find someone for you. ......" ,-;
		emotion 20;
		mes "[Novice fishing]";
		mes "To whom?  Serei?" ;
		mes "Did you say Serei?" ;
		mes "That name sounds familiar." ;
		mes "Serei ...... Serei ...... hmmm";
		next;
		emotion 9,"";
		emotion 9;
		mes "[Novice fishing]";
		mes "............" ;
		next;
		emotion 0;
		mes "[Novice fishing]"; mes "[Novice fishing]
		mes "Ah~!  Ah~!!! I remembered!!!　I remember!!! You belong to ^0000FFAldebaran Novice Club ^000000 seray, right?" ;
		next;
		switch(select("No", "Yes")) {
		case 1:
			mes "[Fishing Novice]";
			mes "Oh my god!  No?" ;
			mes "Then where the hell is Seray?" ;
			next;
			emotion 9,"";
			emotion 9;
			mes "[Fishing Novice]";
			mes ".................." ;
			next;
			mes "[Novice fishing]"; mes "[Novice fishing]
			mes "What?" ;
			mes "Doesn't it matter?" ;
			mes "Then what is your requirement of me?" ;
			break;
		case 2:
			mes "[Fishing Novice]";
			mes "Hmmm... ...... Oh yeah!" ;
			mes "My memory is accurate!" ;
			mes "Hmmm";
			next;
			mes "[Fishing Novice]";
			mes "So what are the requirements?" ;
			break;
		}
		next;
		mes "-You told Novice you were fishing and that's why you came all the way here-";
		next;
		emotion 20;
		mes "[Fishing Novice]";
		mes "Hmmm, further down the road in Novice, or ......." ;
		mes "That seems like an easy but difficult question. ......." ;
		next;
		mes "-I hear a little voice mumbling -";
		next;
		emotion 6;
		mes "[Novice while fishing]";
		mes "That's Seray's guy. ......." ;
		mes "How dare you interrupt my first precious vacation in a long time." ;
		mes "Next time I see you, ......." ;
		next;
		mes "-Novices wearing smiley masks are talking shit that doesn't fit their good-natured masks-"; mes "-Novices wearing smiley masks are talking shit that doesn't fit their good-natured masks-
		next;
		mes "[Novice fishing]";
		mes "Hah~~ poor me rest!" ;
		mes "Ohhhh~~ it's a hassle~~ it's a real hassle~~!!!" ;
		next;
		mes "-Fishing Novice complains and wriggles around-"; mes "-Fishing Novice complains and wriggles around-
		next;
		emotion 1;
		mes "[Novice fishing]";
		mes "Haa...... hah...... hah......" ;
		mes "Fuu~ I'm tired." ;
		mes "By the way, what's your name?" ;
		next;
		mes "["+strcharinfo(0)+"]";
		mes ""+strcharinfo(0)+ ". What's yours?" ;
		next;
		mes "[no dollar]";
		mes "Is it me?" ;
		mes "My name is Noddle! Yes!!!　I am the living legend of the Novice world, Master Noddle is me!!!" ;
		next;
		menu "You must be Mr. Noddle.",-;
		mes "[Noddle]";
		mes "Yes, I am." ;
		mes "My name is Noddle." ;
		next;
		mes "[Noddle]";
		mes "Oh, wow! What's that, "You're Mr. Noddle, aren't you?"!" ;
		mes "I told you, didn't I?" ;
		mes "My name is Noddle." ;
		mes "I told you loudly that my name is Mr. Noddle - didn't I?" ;
		next;
		mes "[Noddle]";
		mes "So ......" ;
		mes "And the reply to that is "Mr. Noddle, isn't it?" ;
		mes "How very well ......." ;
		next;
		mes "[Noddle]";
		mes "And such a surprise!  And excitement!!!" ;
		mes "A cold heart that feels nothing! I want to warm you up!" ;
		next;
		mes "[noddle]";
		mes "I don't think that!" ;
		mes "It's a hassle!" ;
		mes "After all, I'm on vacation!" ;
		next;
		mes "[no dollars]";
		mes "Well, I generally know what you're thinking." ;
		mes "I can see it in your face." ;
		next;
		mes "[Noddle]";
		mes "You were thinking that the name Noddle sounds like Condor or Beetle or something, right?" ;
		mes "How shallow!" ;
		next;
		set CHANGE_SNV2,2;
		delquest 5092;
		setquest 5093;
		mes "[no dollar]";
		mes "Well, whatever!" ;
		mes "Now that we're here, let's figure out how to get further down the Novice path!" ;
		mes "Come back in a while!" ;
		next;
		mes "-Noddle seems to have come up with something." ;
		mes "Let's talk to him again-";
		close;
	case 2:
		mes "[Noddle]";
		mes "Mm! -Noddle is looking at you all over with meaningful eyes-";
		next;
		mes "[Noddle]";
		mes "I didn't notice it earlier, but you're pretty good ^1486EBSupernovice^000000!" ;
		next;
		mes "[noddle]";
		mes "Hey!  Mr. Supernovice." ;
		mes "Did you come all this way knowing who I am?" ;
		next;
		menu "I hear you are a legendary figure in the world of Novice.",-;
		mes "[Noddle]";
		mes "Mm! I'll save why I'm a legend for another time. ......" ;
		next;
		mes "[noddle]";
		mes "Hey!  Mr. Supernovice." ;
		mes "I'm going to help you become strong and responsible, so listen to me!!!" ;
		next;
		menu "I refuse",-, "Why me?" ,-;
		mes "[no dollars]";
		mes "I know - I don't like it when someone I just met says that to me - see you later." ;
		next;
		mes "[noddle]";
		mes "Oh, wow! That's not how this conversation is going to go right now, is it?!!!" ;
		next;
		mes "[noddle]";
		mes "Well, if you're a Novice and you've learned to be that good, you can't help but be a bull ......." ;
		next;
		mes "[Noddle]";
		mes "But I will not be discouraged, I will not be discouraged!" ;
		mes "I don't care what you say, I like it and I'll teach it to you on my own." ;
		mes "And will you follow it -?" ;
		mes "Obey it already!" ;
		next;
		menu "............" ,-;
		mes "-something is wrong with this person-";
		next;
		mes "[noddle]";
		mes "That's why the problem for you now is that no matter how much you train, you can't get any stronger." ;
		mes "Right?" ;
		next;
		menu "That's right. I can't be any stronger.",-;
		emotion 20;
		mes "[no dollar]";
		mes "Hmmm ......" ;
		mes "Then that's the only way!" ;
		next;
		mes "[noddle]";
		mes "I'm the only one who knows how to do it this way, and no one else can pave the way to the end of the road for Nobis except this way." ;
		next;
		mes "[noddle]";
		mes "I'm going to ask you again?" ;
		mes "Do everything I tell you to do, without arguing!" ;
		mes "These are the conditions under which I will teach you how to be strong." ;
		mes "How about it?  Can you do it?" ;
		next;
		if(select("I don't like it." , "Ya ...... I'll do it.") == 1) {
			mes "[no dollar]";
			mes "I don't like itーー? You're supposed to say "I'll do it" in a mysterious way, right? You are so stubborn!" ;
			mes "Well, going my own way is not so bad." ;
			next;
			mes "[noddle]";
			mes "I'll give you one piece of advice!" ;
			mes "You're not always right." ;
			mes "Sometimes you have to listen to others." ;
			mes "Because sometimes it's for your own good." ;
			mes "Keep that in mind!" ;
			close;
		}
		set '@test,rand(1,4);
		mes "[no dollar]";
		mes "Oh yeah!" ;
		mes "Is it because of your enthusiasm to be strong?" ;
		mes "You seem to be a little more honest." ;
		next;
		mes "[noddle]";
		mes "So, let's get right to it, go and kill ^0000FF1,000^000000 monsters that I'm going to tell you to do." ;
		next;
		set CHANGE_SNV2,3;
		delquest 5093;
		switch('@test) {
		case 1:
			setquest 5094;
			set '@hunt$, "Poring";
			break;
		case 2:
			setquest 5095;
			set '@hunt$, "Lunatic";
			break;
		case 3:
			setquest 5096;
			set '@hunt$, "fable";
			break;
		case 4:
			setquest 5097;
			set '@hunt$, "Picchi";
			break;
		}
		mes "[noddle]";
		mes "^FF0000" +'@hunt$+ "You know the monster called ^000000, right?" ;
		next;
		mes "[noddle]";
		mes ""+'@hunt$+ "Go kill ^0000FFF1,000 ^000000 monsters." ;
		mes "Got it?" ;
		mes "Don't tell me you can't do it, okay?" ;
		next;
		menu "I can do it. ......" ,-;
		mes "[no dollar]";
		mes "Druaaaah!!!! I told you I wouldn't let you say that!" ;
		next;
		mes "[noddle]";
		mes "And have you forgotten that already?" ;
		mes "And no talking back! Don't come back until you've killed 1,000 of them!" ;
		next;
		mes "-" +'@hunt$+ "Kill ^0000FF1,000^000000 and report back to Noddle-";
		close;
	case 3:
		set '@poring_hunt,checkquest(5094);
		set '@lunatic_hunt,checkquest(5095);
		set '@fabre_hunt,checkquest(5096);
		set '@picky_hunt,checkquest(5097);
		mes "["+strcharinfo(0)+"]";
		mes "Oh hey noddle." ;
		next;
		emotion 23;
		mes "[noddle]";
		mes "Uh-oh ～～～～!" ;
		mes "Surprise ......." ;
		mes "Can you please not call out to me out of the blue! You'll scare me!" ;
		mes "And don't call me that!" ;
		next;
		mes "[noddle]";
		mes "And ah!" ;
		mes "You made so much noise that the fish got away again!!!" ;
		next;
		mes "[noddle]";
		mes "Totally ......" ;
		mes "So, have you been killing monsters, as I instructed you to do?" ;
		next;
		if((('@poring_hunt&0x4) || ('@fabre_hunt&0x4) || ('@lunatic_hunt&0x4) || ('@picky_hunt&0x4)) {
			mes "[Noddle]";
			mes "That's faster than I thought." ;
			mes "By the way, what was that monster I told you to go defeat?" ;
		}
		else {
			mes "[Noddle]";
			mes "Hmmm?" ;
			mes "Hey, Mr. Supernovice." ;
			mes "I told you not to come back until you've killed 1,000 of them, didn't I?" ;
			next;
			mes "[Noddle]";
			mes "Go ahead and go." ;
			close;
		}
		next;
		switch(select("Poring", "Lunatic", "Fabre", "Picchi", "Baphomet")) {
		case 1:
			if('@poring_hunt&0x4) {
				set '@quest,5094;
			} else {
				mes "[no$]";
				mes "That's not the monster I directed you to!" ;
				mes "I didn't instruct you to go and kill the Poring!" ;
				close;
			}
			break;
		case 2:
			if('@lunatic_hunt&0x4) {
				set '@quest,5095;
			} else {
				mes "[noddle]";
				mes "That's not the monster I directed you to!" ;
				mes "I didn't instruct you to go kill the Lunatic!" ;
				close;
			}
			break;
		case 3:
			if('@fabre_hunt&0x4) {
				set '@quest,5096;
			} else {
				mes "[noddle]";
				mes "That's not the monster I directed you to!" ;
				mes "I didn't instruct you to go and beat Fable!" ;
				close;
			}
			break;
		case 4:
			if('@picky_hunt&0x4) {
				set '@quest,5097;
			} else {
				mes "[noddle]";
				mes "That's not the monster I directed you to!" ;
				mes "I didn't instruct you to go and kill Picchi!" ;
				close;
			}
			break;
		case 5:
			mes "[no dollar]";
			mes "Oh yeah, Baphomet!" ;
			mes "......." ;
			mes "Did I really say something so absurd ......?" ;
			mes "I'm going to be pissed if you lie to me!" ;
			close;
		}
		EMOTION 18;
		mes "[noddle]";
		mes "It's something I made you do just for fun. ......" ;
		mes "This is ......." ;
		next;
		mes "[no dollars]";
		mes "Oh, no, haha ......" ;
		mes "You really have beaten 1,000 of them!" ;
		mes "That's incredible guts." ;
		next;
		mes "[noddle]";
		mes "Okay!!!  Now that you've made it this far, I'll show you how to push the limits of nobility." ;
		next;
		mes "[noddle]";
		mes "But first!" ;
		mes "I have a little letter in the mail." ;
		mes "Talk to me again when you finish reading it." ;
		next;
		mes "-Noddle started reading the letter." ;
		mes "Speak to him again-";
		set CHANGE_SNV2,4;
		delquest '@quest;
		setquest 5098;
		close;
	case 4:
		emotion 7;
		mes "[noddle]";
		mes "Oh, totally ......" ;
		mes "Why is he like this ......." ;
		next;
		mes "["+strcharinfo(0)+"]"";
		mes "No dollars?" ;
		next;
		mes "[no$]";
		mes "Oww!  Sorry, sorry!" ;
		mes "My brother hasn't sent me a letter in a long time, and it's a hell of a lot of stuff." ;
		mes "Well, you should read some of it." ;
		next;
		if(select("read", "don't read") == 2) {
			mes "[no dollar]";
			mes "Yeah, yeah, it's rude to read a letter addressed to someone else!" ;
			next;
			mes "[noddle]";
			mes "......." ;
			next;
			mes "[noddle]";
			mes "Read it!" ;
			mes "You're still an airhead!" ;
			mes "Come on, read it!" ;
			mes "Because it's relevant to what I'm about to ask you to do." ;
			next;
		}
		mes "-Noddle unfolded the crumpled letter and handed it to you-";
		next;
		mes "-Dear brother Noddle, Dear brother Noddle, my dear brother Noodle, my dear brother Noodle." ;
		mes "It's been a long time since I sent you a letter." ;
		next;
		mes " Please send me some money because I have run out of food money." ;
		mes " Your brother makes a lot of money, doesn't he?" ;
		mes " Please help me out." ;
		mes " If you don't send it to me, I'll send it to that time ××××-";
		next;
		mes "["+strcharinfo(0)+"]"";
		mes "(badly wrinkled, can't read any more ......)" ;
		next;
		mes "-You read the letter from Noodle's brother, Noodle, and for some reason you felt uneasy-";
		next;
		mes "[Noddle]";
		mes "huh ...... I wondered if my brother, who only has one, wrote to me once in a while and asked me to send him some money. ......." ;
		mes "And even a threat at the end of the letter." ;
		mes "Oh!!!  What a life I have!!!" ;
		emotion 28;
		next;
		mes "-I have an ominous feeling." ;
		mes " Let's get out of this place quickly-";
		next;
		set CHANGE_SNV2,5;
		delquest 5098;
		setquest 5099;
		mes "[Noddle]";
		mes "Supernovice";
		if(!Sex) {
			mes ""+strcharinfo(0)+ "Chan!" ;
		} else {
			mes ""+strcharinfo(0)+ "kun!" ;
		}
		} next;
		mes "[no dollars]";
		mes "Go ahead and give my brother a little bit of money as a substitute for tuition." ;
		mes "Because I hear he's on a Schwartzvald domestic airship." ;
		next;
		mes "[no dollars]";
		mes "Oh my god, ......." ;
		mes "Why has that guy always been ......?" ;
		next;
		mes "-Let's go give some money to Noodle on the Schwartzvald domestic airship-";
		close;
	case 5:
		mes "[Noodle]";
		mes "Huh?  You've already been there?" ;
		next;
		menu "How much do you want me to give you?" ,-;
		mes "[no dollars]";
		mes "What the ...... You haven't been there yet?" ;
		mes "Wouldn't that guy be happy if you gave him about 500,000 Zeny?" ;
		close;
	case 6:
		mes "[no dollars]";
		mes "Oh, I see you've been there." ;
		mes "I just heard from my brother." ;
		next;
		mes "[no dollars]";
		mes "My brother was very proud that the person he sent me gave me 500,000Zeny. ......." ;
		next;
		mes "[no dollars]";
		mes "But I didn't know that he really gave me 500,000Zeny. ......" ;
		mes "I guess you've made my mensch!" ;
		next;
		mes "["+strcharinfo(0)+"]"";
		mes "Maybe you'd like to ......" ;
		next;
		mes "[no$]";
		mes "Maybe?  Hmm?" ;
		mes "What?" ;
		next;
		mes "["+strcharinfo(0)+"]"";
		mes "Maybe ......" ;
		mes "Was this part of the exam?" ;
		next;
		mes "[no dollar]";
		mes "!!! Oh, yes!!!　That's right!!! This was a test to find out your scale for money!!!! Actually, it was!!!! Ha ha ha ha ha ha!!!" ;
		next;
		mes "[no dollars]";
		mes "......." ;
		emotion 9;
		emotion 9,"";
		next;
		mes "["+strcharinfo(0)+"]"";
		mes "(...... I guess I was overthinking it.)" ;
		next;
		mes "[no dollar]";
		mes "Hmm?  Yes, yes, I almost forgot." ;
		mes "I'm gonna have to teach you how to push the limits of nobis, aren't I?" ;
		next;
		mes "[Noddle]";
		mes "Because I wasn't just playing around after I let you go either!" ;
		next;
		mes "[noddle]";
		mes "By the way, when you hit your limit, ^FF0000 your status and skills will be reset. You can say goodbye to ^000000 your old self and be reborn as a new you!" ;
		mes " Then ......" ;
		next;
		emotion 23;
		mes "[noddle]";
		mes "Hmm?  What's that?"; mes "[noddle]"; mes That one ...... is ...... Aaaaahhh!!!" ;
		next;
		menu "？？？？？？" ,-;
		emotion 19;
		mes "[noddle]";
		mes "Wow!!!! U...... Stalactite Golem swarms over here from behind!!!! Hey!　Quick!!!" ;
		mes "Quickly, get out of here!" ;
		next;
		switch(select("Yes! yes?", "hmm?")) {
		case 1:
			emotion 23,"";
			mes "-you listened again in surprise at Noddle's words-";
			break;
		case 2:
			emotion 23,"";
			mes "-you looked behind you." ;
			mes " The moment you were about to say there is nothing behind you! -";
			break;
		}
		next;
		if(sc_ison(SC_ALL_RIDING)) {
			// unexamined
			mes "[no dollar]";
			mes "What the hell ......? What did you expect?" ;
			mes "It's more like ......." ;
			next;
			mes "[noddle]";
			mes "You're making it easy on the riding creature." ;
			mes "Novices walk on their own two feet, it's the most natural thing to do!" ;
			mes "Have you forgotten the spirit of Novice?" ;
			next;
			mes "[Noddle]";
			mes "Remove the riding creature and then speak to me again." ;
			close;
		}
		if(Weight) {
			mes "[Noddle]";
			mes "What the hell ......? What did you expect?" ;
			mes "It's more like ......." ;
			next;
			mes "[no dollars]";
			mes "You have kind of a lot of stuff." ;
			mes "You're not going to get even stronger if you keep relying on stuff." ;
			next;
			mes "[no dollar]";
			mes "Deposit all of your possessions and then talk to me again." ;
			close;
		}
		if(checkcart()) {
			mes "[no dollars]";
			mes "What the hell ......? What did you expect?" ;
			mes "It's more like ......." ;
			next;
			mes "[no dollars]";
			mes "You're making it easy with the cart." ;
			mes "You're not going to get even stronger until you at least own your own stuff." ;
			next;
			mes "[noddle]";
			mes "Remove the cart and then talk to me again." ;
			close;
		}
		if(SkillPoint) {
			mes "[no dollar]";
			mes "What the hell ......? What did you expect?" ;
			mes "It's more like ......." ;
			next;
			mes "[noddle]";
			mes "You've got some skill points left." ;
			mes "You're not going to get even stronger if you're tied to the existing ones." ;
			next;
			mes "[noddle]";
			mes "Talk to me again when you've allocated all your skill points." ;
			close;
		}
		misceffect 90,"";
		misceffect 62,"";
		misceffect 89,"";
		set CHANGE_SNV2,7;
		delquest 5100;
		setquest 72250;
		resetstatus;
		resetskill;
		setoption 0;
		jobchange Job_ExpandedSuperNovice;
		mes "["+strcharinfo(0)+"]";
		mes " !!!!!!!!" ;
		emotion 23,"";
		next;
		mes "[no$]";
		mes "Woohoo!" ;
		mes "Yessss~!!! Great success~!!!" ;
		next;
		emotion 18;
		mes "[no dollar]";
		mes "Wahahahaha!" ;
		mes "Good!  I love it!!! That dumb look!!!! That was too good to see alone~";
		next;
		menu "........." ,-;
		emotion 9,"";
		emotion 17;
		mes "[noddle]";
		mes "Oh, I'm sorry if I surprised you!" ;
		mes "Don't look too scared." ;
		mes "Kkkkkk ......." ;
		next;
		mes "[noddle]";
		mes "Ahhh, gosh!" ;
		mes "We Novices have a mission and duty to make a mundane and pleasant day through light mischief even in the most boring of days!!!" ;
		next;
		mes "[Noddle]";
		mes "That being said, anything unusual?" ;
		mes "I feel lighter, or I have more strength that I didn't have before. ......." ;
		next;
		menu "......?" ,-;
		emotion 1,"";
		mes "[noddle]";
		mes "ee ee!" ;
		next;
		emotion 20;
		mes "[no dollar]";
		if(!Sex) {
			mes ""+strcharinfo(0)+ "chan";
		} else {
			mes ""+strcharinfo(0)+ "kun";
		}
		mes "You really don't notice?" ;
		next;
		switch(select("What on earth?" , "I've noticed")) {
		case 1:
			mes "[no dollar]";
			mes "Okay, then I'll tell you!" ;
			mes "You've finally pushed the envelope!" ;
			mes "You were a chrysalis, now you're a butterfly!" ;
			next;
			mes "[noddle]";
			mes "Simply put, it means you can be stronger from now on." ;
			mes "Didn't you want to be stronger?" ;
			mes "Your wish came true!" ;
			break;
		case 2:
			// unexamined
			mes "[noddle]";
			mes "Your wish to be strong has come true!" ;
			mes "Good for you!" ;
			break;
		}
		next;
		mes "[noddle]";
		mes "Alright!!! From now on, go out into the wide world and live a free and joyful life like a Novice, over!!!" ;
		next;
		mes "[Noddle]";
		mes "That concludes the examination!  Dismissed!!!" ;
		next;
		mes "-Something is wrong with Noddle." ;
		mes " - seems to be trying to get rid of him as quickly as possible." ;
		mes " Let's talk to Noddle again-";
		close;
	case 7:
		mes "[Noddle]";
		mes "What the hell!" ;
		mes "I wasn't going to give it to you unless you came back again, but now you're here. ......." ;
		next;
		mes "-Noddle is disappointed-";
		next;
		mes "[Noddle]";
		mes "Well, if it's here, it's here!" ;
		mes "I'm going to give away some equipment to congratulate my fellow Novices on their new path!" ;
		next;
		mes "[Noddle]";
		mes "Don't give it to me and then say, "My bag is overflowing and I can't fit in it," ^ff000000Check now to see if you have enough room in your bag. ^000000";
		next;
		if(select("Oh!  I'll go sort it out.", "It's okay, just give it to me.") == 1) {
			mes "[no dollars]";
			mes "Oh yeah!" ;
			mes "I won't lose anything if you don't come back." ;
			mes "You know that, right?" ;
			mes "You don't always have to come back!" ;
			close;
		}
		if(checkitemblank() < 7) {
			mes "[no dollar]";
			mes "Look at that!  You've got too many." ;
			mes "I was right." ;
			mes "Now go and sort out your belongings." ;
			close;
		}
		if((MaxWeight - Weight) < 5000) {
			mes "[no dollars]";
			mes "Look at that!  You're too heavy to hold it." ;
			mes "I was right." ;
			mes "Now go get your belongings in order." ;
			close;
		}
		set CHANGE_SNV2,99;
		getitem 2522,1;
		getitem 2113,1;
		getitem 2340,1;
		getitem 2416,1;
		getitem 2512,1;
		getitem 2628,1;
		getitem 5119,1;
		delquest 72250;
		setquest 201475;
		mes "[noddle]";
		mes "This is my previous equipment, it should still work." ;
		next;
		menu "What, it's not new, it's a hand-me-down?" ,-;
		emotion 6;
		mes "[no dollars]";
		mes "If you don't like it, return it!" ;
		mes "I'm trying to give you something you don't want to give, but what's that~!" ;
		next;
		mes "[no dollars]";
		mes "Oh my God!  That's a joke!" ;
		mes "I'm not going to ask you to give me back what I gave you." ;
		mes "Then I will congratulate you again." ;
		next;
		misceffect 78,"";
		misceffect 42,"";
		mes "[Noddle]";
		mes "Supernovice";
		mes strcharinfo(0)+ "of";
		mes "May the blessings of the Supernovice guardian angels be with you on the road ahead: ......" ;
		close;
	case 99:
		set CHANGE_SNV2,0;
		mes "[no dollar]";
		mes "What, you're still here?" ;
		mes "You're in the way of fishing, get the hell out of here~!" ;
		close;
	default:
		mes "[Novice fishing]";
		mes "Quiet~! The fish will run away, so be quiet." ;
		close;
	}
}

airplane.gat,33,47,5 script noodle#sp2 567,{
	if(Job == Job_ExpandedSuperNovice) {
		mes "[Noodle]";
		mes "Wooooooo";
		if(!Sex) {
			mes "Sis, with my brother";
		} else {
			mes "Brother, with our brother"; mes "Brother, with our brother"; mes "Brother, with our brother"; mes "Brother, with our brother"; }
		}
		mes "Aren't they as strong as each other?" ;
		mes "You were a great guy!" ;
		next;
		mes "[noodle]";
		mes "I have to eat a lot of food and grow up and be strong like my brother. ......." ;
		close;
	}
	switch(CHANGE_SNV2) {
	case 5:
		mes "[noodle]";
		mes "Ahh ...... I've lost all my food money and I'm starving ......" ;
		mes "When will my brother send me money?" ;
		next;
		menu "That ...... Maybe it's Mr. Noodle?" ,-;
		mes "[Noodle]";
		mes "Whoa!  You scared me~!!!" ;
		mes "Who are you?  Have we met somewhere?" ;
		next;
		mes "-you explained why you came to see Noodle-";
		next;
		mes "[Noodle]";
		mes "I see! You came to give me money to send money on behalf of your brother, didn't you?" ;
		next;
		mes "[noodle]";
		mes "Ummmmm... ......." ;
		mes "And so?" ;
		mes "How much did your brother give you?" ;
		next;
		mes "- Noodle is demanding money with his eyes glowing and his hands out." ;
		mes "How much do you give him? -";
		next;
		if(select("I have no money to give you", "I will give you 500,000Zeny") == 1) {
			mes "[noodle]";
			mes "uaaaah ～～～～!" ;
			mes "I hate my brother~!" ;
			mes "I hate you too~~!" ;
			close2;
			warp "airplane.gat",70,93;
			end;
		}
		mes "[noodle]";
		mes "Oh~ my brother gave you 500,000Zeny?" ;
		next;
		if(Zeny < 500000) {
			mes "[Noodle]";
			mes "Hmm?" ;
			mes "But where is 500,000Zeny?" ;
			close;
		}
		set Zeny,Zeny-500000;
		set CHANGE_SNV2,6;
		delquest 5099;
		setquest 5100;
		mes "[noodle]";
		mes "[noodle]";
		mes "Hehehe, I'll just say it!" ;
		if(!Sex) {
			mes ""+strcharinfo(0)+ "Sister,";
		} else {
			mes ""+strcharinfo(0)+ "Brother,"; }
		}
		mes "Thank you~!" ;
		next;
		mes "-Something doesn't add up, but in the meantime, I've given you my money, so let's go back to Noddle's place-";
		close;
	case 6:
		mes "[Noodle]";
		mes "I'm glad - I'll send you another letter often." ;
		mes "Hmmm... ......." ;
		next;
		mes "[Noodle]";
		mes "Oh,";
		if(!Sex) {
			mes ""+strcharinfo(0)+ "Sister!" ;
		} else {
			mes ""+strcharinfo(0)+ "Brother!" ;
		}
		mes "It's a secret for our brother~?" ;
		close;
	default:
		mes "[noodle]";
		mes "ah ......" ;
		mes "All my meal money is gone and I'm starving, but when is my brother going to send me money?" ;
		close;
	}
}
