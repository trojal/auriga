//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Lune's Request
//
// by Pneuma
// That Girl You Care About -------------------------------------------
prontera.gat,146,232,4	script	Halberd#AC_QUE00H01	48,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_0) goto L_OTHER;
	switch(AC_QUEST_LV_0){
	case 0:
		goto L_QUEST01;
	case 1:
		goto L_QUEST02;
	case 2:
		goto L_QUEST03;
	case 3:
		goto L_QUEST04;
	case 4:
		goto L_OTHER;
	case 5:
		goto L_QUEST06;
	case 6:
		goto L_QUEST07;
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_OTHER;
	}
	goto L_OTHER;
L_QUEST01:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "-This person seems to be the client-";
		next;
		emotion 1;
		mes "[Halberd]";
		mes "hmm, what about you?";
		next;
		select "identify yourself";
		mes "[Halberd]";
		mes "You, you took my request.";
		mes strcharinfo(0) + "You did!";
		mes "I've been waiting for you for a long time!";
		next;
		menu "What is the nature of this request?" ,-;
		mes "[Halberd]";
		mes "It's pretty important.";
		mes "I want you to take it seriously.";
		mes "Yes, that's what we're asking for this time!";
		next;
		mes "[Halberd]";
		mes "I need you to listen to my love life problems!";
		next;
		mes "[Halberd]";
		mes "I have a girl I've known since childhood.";
		mes "Her name is Susanne.";
		mes "^FF0000 She lives in Izlude. ^000000Me and her have the same birthday month, July, same food preferences, same school.";
		mes "We've always been good friends.";
		next;
		emotion 40;
		mes "[Halberd]";
		mes "But you know, lately, Susanne has been acting strangely mature ......";
		mes "I've always seen her only as a childhood friend, but lately, when I see her, I get all hot and bothered.";
		next;
		mes "[Halberd]";
		mes "Yes, I have fallen in love with Susanne!";
		mes "I'm so conscious of it, I can't even talk to Susanne these days ......";
		mes "I get jealous just because she talks to other boys ......";
		next;
		mes "[Halberd]";
		mes "I can't control these feelings anymore!";
		mes "So I'm going to tell her how I feel about this! I'm going to confess!";
		mes "What do you think about this?";
		NEXT;
		menu "I think that's a good idea.",-;
		emotion 4;
		mes "[Halberd]";
		mes "But I suddenly shy away from confessing, thinking that it might ruin the relationship we've had, or that he won't like me. ......";
		next;
		mes "[Halberd]";
		mes "Ugh, I'm getting sick to my stomach ......";
		mes "Atta-ta-ta ......";
		next;
		emotion 23;
		mes "[Halberd]";
		mes "Geez!";
		mes "It really hurts!";
		mes "Ouch!";
		next;
		menu "Are you okay?" ,-;
		mes "[Halberd]";
		mes "Ugh, sorry, but ......";
		mes "Can you bring me some milk?";
		mes "I'm in pain and can't move ......";
		mes "I need some gentle milk for my stomach!";
		NEXT;
	L_M_01_2_REP:
		mes "[Halberd]";
		mes "Milk is sold by ^FF0000 milk merchants ^000000 in this city of Prontera!";
		mes "The place is around ^FF0000 southwest^000000!";
		mes "Here, go buy some with this~"; // Added at the same time as the removal of the training center?
		mes "Woohoo!";
		next;
		mes "-Halberd will give you ^0000FF50zeny^000000-"; //add
		mes " ^FF0000 [Mission] ^000000-Buy milk from a milk merchant and give it to Halberd-";
		close2;
		viewpoint 1,74,134,1,0x0000FF;
		if(2147483647 - Zeny > 50) set Zeny, Zeny + 50;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		if(countitem(519)==0){
			EMOTION 23;
			mes "[Halberd]";
			mes "Gghh...";
			mes "Please!";
			mes "Milk...";
			mes "Bring milk!";
			next;
			goto L_M_01_2_REP;
		}
		mes "[Halberd]";
		mes "That's milk!";
		mes "Please!";
		mes "Give it to me!";
		mes " -Gave the milk to Halberd-";
		next;
		mes "[Halberd]";
		mes "Oh, thank you!";
		mes "Well, let's get to it!";
		next;
		mes "[Halberd]";
		mes "Gokugok......";
		mes "Gokugok......";
		mes "Gokgok Gokgok Gokgok ......";
		next;
		emotion 21;
		mes "[Halberd]";
		mes "～～～～～～ck ah!";
		mes "Ummm~!";
		mes "I'm back to life!";
		next;
		mes "[Halberd]";
		mes "Thank you so much!";
		mes "The pain is gone!";
		next;
		mes "[Halberd]";
		mes "But I am pathetic ......";
		mes "So much so that I'm worried ......";
		next;
		menu "Good luck",-;
		mes "[Halberd]";
		mes ""+strcharinfo(0) +"......";
		mes "Thanks.";
		mes "I'm feeling a little braver now.";
		next;
		mes "[Halberd]";
		mes "I'd rather take action and regret it than do nothing and regret it.";
		mes " But I just need a little more time to confess to her ......";
		next;
		mes "[Halberd]";
		mes "Thank you so much for taking the time to discuss this issue with me.";
		mes "I'll talk to you again if I need anything else!";
		next;
		delitem 519,1;
		if('@novice){
			// 3 ig leaves for beginners
			if(!checkweight(610,3)){
				mes "Overweight!";
				close;
			}
			getitem 610,3;
		}
		set AC_QUEST_ST_0,99;
	L_M_01_3_REP:
		mes "^FF0000 [Mission Accomplished]^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	case 99:
		mes "[Halberd]";
		mes "Thank you so much!";
		mes "You're a really nice guy.";
		mes "I'll talk to you again!";
		next;
		goto L_M_01_3_REP;
	}
	goto L_OTHER;
L_QUEST02:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + "!";
		mes "I've been waiting for you!";
		mes "I just had to talk to you about it!";
		NEXT;
		menu "What's wrong?" ,-;
		EMOTION 52;
		mes "[Halberd]";
		mes "I've made up my mind.";
		mes "I'm going to confess to Susanne! I won't regret it no matter what the outcome.";
		next;
		mes "[Halberd]";
		mes "So, before I confess to her, I want to give her a pre-Zento that she will enjoy.";
		next;
		mes "[Halberd]";
		mes "So, I'm asking you for a favor.";
		mes "I need you to find out what she wants.";
		mes "Because if you hear it from me directly, it's like, I'm thinking about pre-Zento.";
		mes "";
		next;
		menu "Can I ask Susanne directly?" ,-;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + "But if I ask Susanne directly, she might get suspicious.";
		mes "Hmmm.";
		next;
		emotion 52;
		mes "[Halberd]";
		mes "Yes! Come to think of it, I heard that Susanne has been going to Izlude's tool shop lately, maybe the tool clerks there know what she likes!";
		NEXT;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", ^FF0000Izlude's tool shop ^000000Can you try?";
		next;
		menu "Okay!" ,-;
		mes "[Halberd]";
		mes "Thank you!";
		mes "I'm asking for it!";
		next;
		mes "^FF0000 [Mission] ^000000-Speak to the Clerk in Izlude's tool shop-";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + "!";
		mes "I'm asking for it!";
		mes "Ask about Susanne at ^FF0000Izlude's tool shop ^000000!";
		NEXT;
		mes "^FF0000 [Mission] ^000000-Speak to the Clerk at Izlude's Tool Shop-";
		close;
	case 3:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + "!";
		mes "How was it?";
		mes "Did you figure out what she wants?";
		next;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", what's up?";
		mes "Look gloomy ......";
		next;
		emotion 52;
		mes "[Halberd]";
		mes "Haha, I get it!";
		next;
		mes "[Halberd]";
		mes "What Susanne wanted was expensive, wasn't it?";
		mes "Don't worry, don't worry!";
		mes "I've been saving my money for this day, you know.";
		NEXT;
		misceffect 28;
		mes "- sorry to hear that, but I reported to Halberd about the story in Izlude's tool shop.";
		mes "I can see Halberd freezing -";
		next;
		mes "[Halberd]";
		mes "Nah,";
		next;
		emotion 23;
		mes "[Halberd]";
		mes "Na,";
		mes "You mean to tell me that Susanne already has someone she loves!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! And with Morroc jewelry and other such expensive things!";
		next;
		mes "[Halberd]";
		mes "Hi, it's too much~!";
		mes "Gghhhh!";
		next;
		mes "[Halberd]";
		mes "......";
		mes ""+strcharinfo(0) + ", and, anyway, thanks for checking ......";
		if('@novice){
			mes "This is a thank you.";
		}
		mes "Hey, let me alone...";
		next;
		if('@novice){
			if(!checkweight(1210,1)) {
				mes "-overweight! -";
				close;
			}
			getitem 1210,1;
			// dark
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", sorry, hey, let me alone...";
		next;
		mes "^FF0000 [request fulfilled] ^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
	goto L_OTHER;
L_QUEST03:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", long time no see.";
		mes " Goho ...... Goho!";
		next;
		mes "[Halberd]";
		mes "Sorry, I'm sorry.";
		mes "I'm not feeling well...";
		mes "I just took some medicine, so I'll be better soon - I'm very weak.";
		next;
		mes "[Halberd]";
		mes "To cut to the chase, this time, ";
		mes strcharinfo(0) + "to";
		mes "I need you to find out what kind of person Susanne likes.";
		next;
		menu "why?" ,-;
		mes "[Halberd]";
		mes "As her childhood friend, I want to know if the man is worthy of Susanne.";
		next;
		mes "[Halberd]";
		mes "mumble ......";
		mes "(If he's the kind of guy who would hurt her, then I'll just do it myself ......)";
		next;
		menu "What did you say?" ,-;
		mes "[Halberd]";
		mes "No, I didn't say anything.";
		next;
		menu "The truth is, I'm still trying to get Susanne to ......",-;
		mes "[Halberd]";
		mes "......";
		mes "The truth is, I still love her.";
		mes "If I could, I would tell her how I feel about this ......";
		next;
		menu "You should tell her.",-;
		mes "[Halberd]";
		mes "No, you can't do that!";
		mes "I don't want to embarrass her.";
		next;
		mes "[Halberd]";
		mes "And anyway, why don't you ask Susanne about who Susanne likes?";
		next;
		mes "[Halberd]";
		 ;
		next;
		mes "[Halberd]";
		mes "So, today, Susanne is going to pick up the jewelry she asked Jeweler in Morroc for.";
		next;
		mes "[Halberd]";
		mes "So, why don't you ask her what kind of person she is dealing with?";
		mes "(or their weaknesses or ......)";
		next;
		menu "How did you know she was going?" ,-;
		mes "[Halberd]";
		mes "That's because I went ahead and asked at Jeweler's in Morroc ......";
		mes "Gosh gosh gosh, well, it doesn't matter how you know!";
		next;
		mes "[Halberd]";
		mes "It's at Jeweler's in Morroc.";
		mes "Oh! We were now evacuated to a camp around Pira Mido.";
		mes "It's northwest of Morroc.";
		mes "You understand? I'm counting on you!";
		NEXT;
		mes "^FF0000 [Mission] ^000000-go to Jeweler's place around Pira Mido in Morroc and talk to Susanne-";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		//not yet investigated
		mes "[Halberd]";
		mes "It's Jeweler's place in Morroc.";
		mes "Oh! We were now evacuated to a camp around Pira Mido.";
		mes "It's northwest of Morroc.";
		mes "You understand? I'm counting on you!";
		NEXT;
		mes "^FF0000 [Mission] ^000000-go to Jeweler's place around Pira Mido in Morroc and talk to Susanne-";
		close;
	case 3:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + "!";
		mes "How was it?";
		mes "Did you find out who Susanne likes?";
		next;
		mes "-Reported what I talked to Susanne about-";
		next;
		mes "[Halberd]";
		mes "You didn't get the name - the remaining GHOST.";
		mes "But the man is a very kind man and always tries to protect Susanne, even though he is physically weak, or...";
		next;
		mes "[Halberd]";
		mes "Well, I'd say he's kind, but it's hard to tell what people are really like.";
		mes "I don't know about that guy either.";
		next;
		mes "[Halberd]";
		mes "And is he weak or ......";
		mes "Hmm, if you're weak, I'm as weak as you are.";
		mes "And I've tried to protect Susanne too. ......";
		next;
		emotion 28;
		mes "[Halberd]";
		mes "Ugh, so why ......";
		mes "Oh, not much ......";
		mes "Ugh ......";
		next;
		mes "[Halberd]";
		mes "Hey,";
		mes strcharinfo(0) + ",";
		mes "By the way, that guy, did he ever tell you which way he goes home at night?";
		next;
		mes "[Halberd]";
		mes "Oh, don't look at me like that.";
		mes "I don't mean anything deep, ......";
		mes "Gosh, gosh, gosh!";
		next;
		mes "[Halberd]";
		mes "Gosh, gosh, gosh!";
		mes "Oh, sorry, I think I'm getting sick again.";
		next;
		mes "[Halberd]";
		mes "Gosh, gosh, gosh!";
		mes "I'm going to take my medicine, I'll be back in a minute.";
		mes " Oh, I think I'm going to run out of medicine.";
		mes "I have to go get some more ......";
		next;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", Thanks again for all the research and help.";
		if('@novice){
			mes "This is a thank you.";
		}
		mes "If you need any more help, please let me know!";
		next;
		if('@novice){
			if(!checkweight(1010,7)){
				mes "-overweight! -";
				close;
			}
			getitem 1010,7;
			//placon x7
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[Halberd]";
		mes "Gosh, gosh, gosh!";
		mes "I think we're going to run out of medicine.";
		mes "I have to go get some more ......";
		next;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", Thanks again for all your help and research.";
		mes "I'll be in touch if you need any more help!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
	goto L_OTHER;
L_QUEST04:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", gho, gho ......";
		mes "It's been a while. ......";
		next;
		mes "[Halberd]";
		mes "I'm not feeling well, as you can see.";
		mes "I'm out of medicine. ......";
		mes "I want to go get them, but my body won't listen to me, so I can't.";
		mes "Gosh, gosh, gosh. ......";
		next;
		mes "[Halberd]";
		mes "I'm sorry, but could you please go to my doctor's office to get my medicine?";
		next;
		menu "Okay!" ,-;
		EMOTION 15;
		mes "[Halberd]";
		mes "Gosh, gosh ......";
		mes "Thank you.";
		mes "My doctor is in ^FF0000Geffen^000000.";
		mes "Please do.";
		next;
		mes "^FF0000 [Mission] ^000000-Speak to the Physician in Geffen-";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[Halberd]";
		mes "Gosh, gosh ......";
		mes "My doctor is in ^FF0000Geffen^000000.";
		mes "Gosh, Gosh ......";
		mes "I asked for your medicine.";
		next;
		mes "^FF0000 [Mission] ^000000-Speak to the Physician in Geffen-";
		close;
	case 3:
		emotion 15;
		mes "[Halberd]";
		mes "Oh," + strcharinfo(0) + ".";
		mes "I see you got your medicine!";
		mes "Thank you!";
		NEXT;
		mes "-Halberd's health looks good.";
		mes "I gave Halberd the medicine that Dr. Barry gave me -";
		next;
		mes "[Halberd]";
		mes "Actually, Susanne brought the medicine to me earlier!";
		mes "I've been feeling much better since I took it~";
		next;
		emotion 2;
		mes "[Halberd]";
		mes "I knew it, Susanne is so sweet.";
		mes "It was lovely ......";
		mes "She was like an angel.";
		next;
		mes "[Halberd]";
		mes "I used to have Susanne accompany me to Dr. Barry's office.";
		mes "You're still as kind as you were back then.";
		mes "I miss it...";
		next;
		mes "[Halberd]";
		mes "Actually, it's been hard for me to talk to Susanne lately, so I've been cold when she talks to me.";
		mes "And yet ......";
		next;
		emotion 28;
		mes "[Halberd]";
		mes "And yet, I'm the one who noticed that I wasn't feeling well ......";
		mes "And I can't believe you even brought me medicine.";
		mes "Ugh, Susanne......";
		next;
		mes "[Halberd]";
		mes "Hah ......";
		mes "Now let's savor this happy feeling.";
		next;
		menu "I have to thank Susanne for this.",-;
		mes "[Halberd]";
		mes "Oh, Susanne!";
		mes "Forgive my foolishness for being cold!!!";
		next;
		emotion 9,"";
		mes "[Halberd]";
		mes "Oh, Susanne!";
		mes "I love it!";
		mes "I love you!";
		next;
		menu "......",-;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[Halberd]";
		mes "haaaa......";
		mes "Now let's savor this happy feeling.";
		next;
		mes "^FF0000 [request accomplished] ^000000-you accomplished your request!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
	goto L_OTHER;
L_QUEST06:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", long time no see.";
		mes "Thanks for delivering my meds the other day!";
		next;
		mes "[Halberd]";
		mes "Actually,";
		mes strcharinfo(0) + "to";
		mes "I have another favor to ask: ......";
		next;
		menu "Is this about Susanne?" ,-;
		mes "[Halberd]";
		mes "Yes, it's about Susanne...";
		next;
		mes "[Halberd]";
		mes "Susanne went to Comodo...";
		mes "Definitely to see Nelia, I think.";
		next;
		menu "Nelia?",-;
		mes "[Halberd]";
		mes "Nelia is a good friend of mine and Susanne's, the three of us used to hang out all the time.";
		next;
		mes "[Halberd]";
		mes "That Nelia, a while ago, wants to be a Dancer!";
		mes "I started saying, 'I'm going to go to Comodo,' and then I suddenly went to Comodo.";
		next;
		menu "What's wrong with going to see Nelia?" ,-;
		mes "[Halberd]";
		mes "It's not a question of going to see Nelia.";
		mes "The problem is that I went to see her alone.";
		next;
		mes "[Halberd]";
		mes "We are all three of our best friends.";
		mes "When we went to see Nelia at Comodo before, it was just the two of us, me and Susanne.";
		next;
		mes "[Halberd]";
		mes "But this time Susanne went alone...";
		mes "What I'm about to say may be my assumption, but I think it probably has something to do with who Susanne likes ......";
		next;
		emotion 54;
		mes "[Halberd]";
		mes "Because, right?";
		mes "If you're leaving me, you know...";
		mes "I'm going to miss you so much.";
		next;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", please, can you go to ^FF0000Comodo^000000 and check on me?";
		mes "I'm sorry to ask you to do everything, but please.";
		next;
		menu "Okay.",-;
		mes "[Halberd]";
		mes "Thank you!";
		next;
		mes "^FF0000 [Mission] ^000000-See how Susanne and Nelia are doing in Comodo-";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[Halberd]";
		mes "Can you go to ^FF0000Comodo^000000 and check on Susanne?";
		mes "I'm sorry to ask you to do everything, but please.";
		next;
		mes "^FF0000 [Mission] ^000000-See how Susanne and Nelia are doing in Comodo-";
		close;
	case 3:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", how did it go?";
		next;
		mes "-Reported to Halberd about what happened at Comodo-";
		next;
		mes "[Halberd]";
		mes "Well, Susanne consulted Nelia.";
		mes "And that the consultation was like a love consultation.";
		next;
		emotion 54;
		mes "[Halberd]";
		mes "Hah!";
		mes "Love advice, huh?";
		mes "I'm still shocked, I guess.";
		next;
		mes "[Halberd]";
		mes "But honestly, I was even thinking about leaving me alone and having fun playing with Susanne, Nelia, and Comodo.";
		next;
		mes "[Halberd]";
		mes "I'm a little relieved.";
		mes "And you haven't confessed yet, Susanne.";
		next;
		menu "Are you sure you want to keep this up?" ,-;
		mes "[Halberd]";
		mes "......";
		next;
		menu "I think Susanne likes you",-;
		mes "[Halberd]";
		mes "......";
		mes "Thanks for saying so.";
		mes "For trying to inspire me.";
		mes "But that can't be true.";
		next;
		mes "[Halberd]";
		mes "But I've decided.";
		mes "I'm always depending on you all the time and I'm not doing anything ......";
		mes "I haven't even told you how I feel!";
		next;
		mes "[Halberd]";
		mes "You've traveled to so many different cities for me, and now you're going to ......";
		mes "What the hell have I been doing all this time ......";
		next;
		mes "[Halberd]";
		mes "Thank you for .......";
		mes "I noticed that when I saw you.";
		next;
		mes "[Halberd]";
		mes "I'm confessing to Susanne!";
		mes "Absolutely!";
		mes "I don't care if Susanne likes someone else!";
		next;
		mes "[Halberd]";
		mes "I'll tell you how I feel!!!";
		mes strcharinfo(0) + ",";
		mes "Thank you!";
		if('@novice){
			mes "This is for you.";
		}
		next;
		if('@novice){
			if(!checkweight(1216,1)) {
				mes "-overweight! -";
				close;
			}
			getitem 1216,1;
			//stile
		}
		mes "^FF0000 [request fulfilled]^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[Halberd]";
		mes "I'm going to confess to Susanne!";
		mes "Absolutely!";
		mes "I don't care if Susanne likes someone else!";
		next;
		//not yet researched
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
	goto L_OTHER;
L_QUEST07:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", thanks for coming.";
		next;
		mes "[Halberd]";
		mes "Actually, I got a call from Susanne.";
		mes "The place is ^FF0000 St. Capitolina Monastery. ^000000";
		next;
		mes "[Halberd]";
		mes "Maybe that's where Susanna is trying to talk to me about who she likes.";
		next;
		mes "[Halberd]";
		mes "But I think I am going to confess to Susanne at that place.";
		next;
		mes "[Halberd]";
		mes "I can't suppress these feelings any longer!";
		next;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + "You've helped me a lot, haven't you?";
		mes "So I want you to witness my confession.";
		next;
		menu "Okay",-;
		mes "[Halberd]";
		mes "Thank you!";
		mes "Let's meet at ^FF0000 St. Capitolina Monastery ^000000.";
		mes "I'll be there first.";
		next;
		mes "[Halberd]";
		mes "You can get to the Monastery of St. Capitolina by going ^0000FF one map east first from this town of Prontera, then one map north, then one map east. ^000000";
		next;
		mes "^FF0000[Mission] ^000000-go to the Monastery of St. Capitolina and talk to Halberd-";
		close2;
		set AC_QUEST_ST_0,2;
		viewpoint 1,289,203,11,0x0000FF;
		end;
	case 2:
		mes "[Halberd]";
		mes "Let's meet at the site.";
		mes "You can get to the Monastery of St. Capitolina by going ^0000FF one map east from this city of Prontera, then one map north, then one map east. ^000000";
		next;
		mes "^FF0000[Mission] ^000000-go to the Monastery of St. Capitolina and talk to Halberd-";
		close2;
		viewpoint 1,289,203,11,0x0000FF;
		end;
	}
	goto L_OTHER;
L_QUEST08:
	switch(AC_QUEST_ST_0) {
	case 2:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", sorry, I have to go out soon.";
		next;
		mes "-Susanne told me she was worried about you-";
		next;
		mes "[Halberd]";
		mes "I, you know, ever since then, I've been looking for a ruby as good as that one.";
		mes "I asked Jeweler at Morroc and he told me that they don't have gems as good as those rubies right now.";
		next;
		mes "[Halberd]";
		mes "It seems that those gems were mined in the Arnabertsian countries.";
		mes "I go to the Arnabertsian State.";
		next;
		mes "[Halberd]";
		mes "Gosh, gosh!";
		mes "Sorry, I'm a little tired.";
		mes "I want a matching pair of rubies with Susanne, you know?";
		mes "So, I'll do my best.";
		next;
		mes "[Halberd]";
		mes "If I find a ruby and make a ring with it ......";
		mes "I'm going to propose to Susanne then.";
		next;
		mes "[Halberd]";
		mes "Sorry, I have to go now.";
		mes "Please tell Susanne to wait just a little bit longer.";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "(Let's report back to Susanne.)";
		next;
		mes "^FF0000 [Mission] ^000000-Let's report to Susanne in Izlude-";
		close2;
		set AC_QUEST_ST_0,3;
		end;
	case 3:
		mes "[Halberd]";
		mes "Sorry, I have to go now.";
		mes "Please tell Susanne to wait a little longer.";
		next;
		mes "^FF0000 [Mission] ^000000-Let's report to Susanne in Izlude-";
		close;
	}
	goto L_OTHER;
L_QUEST09:
L_OTHER:
	switch(AC_QUEST_LV_0){
	case 1:
		mes "[Halberd]";
		mes "Thank you so much!";
		mes "You are really nice.";
		mes "I'll talk to you again!";
		close;
	case 2:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", sorry, hey, let me alone...";
		close;
	case 3:
		mes "[Halberd]";
		mes "Gosh, gosh, gosh!";
		mes "I think we're going to run out of medicine.";
		mes "I have to go get some more ......";
		next;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", Thanks again for all your help and research.";
		mes "I'll be in touch if you need any more help!";
		close;
	case 4:
	case 5:
		mes "[Halberd]";
		mes "haaaa......";
		mes "Now let's savor this happy feeling.";
		close;
	case 6:
	case 7:
	case 0:
		mes "[Halberd]";
		mes "Oh, Susanne......";
		mes "My heart breaks for her. ......";
		close;
	case 8:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", sorry, I have to go out soon.";
		close;
	case 9:
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", thank you so much!";
		close;
	}
}
izlude_in.gat,108,55,4	script	Clerk#AC_QUE02	951,{
	mes "[Mary-Anne]";
	mes "Welcome!";
	if(AC_QUEST_LV_0>1 && AC_QUEST_ST_0!=2) goto L_OTHER;
	if(AC_QUEST_LV_0!=1 && AC_QUEST_ST_0!=2) close;
	next;
	menu "We would like to ask you...",-;
	EMOTION 1;
	mes "[Mary-Anne]";
	mes "Yes, what is it?";
	next;
	menu "Do you know a woman named Susanne?" ,-;
	mes "[Mary-Anne]";
	mes "Oh, are you a friend of Susanne's?";
	mes "Susanne often comes to this store.";
	next;
	menu "What items were you looking at?" ,-;
	mes "[Mary-Anne]";
	mes "She bought a ring here.";
	mes "Ummm, she said she was going to give it to someone she likes.";
	mes "Oh, it's so nice to be young!";
	next;
	mes "[Mary-Anne]";
	mes "She was happily talking about going to Morroc to look for a gemstone to put on that ring.";
	next;
	mes "[Mary-Anne]";
	mes "I'm jealous of her boyfriend for getting that, even though I'm a woman.";
	mes "It's not often you get a pretty girl like that.";
	next;
	menu "Do you know what the other person's name is?" ,-;
	mes "[Mary-Anne]";
	mes "I'm sorry.";
	mes "I didn't even ask for your name.";
	mes "We're not dating yet, it seems that Susanne has a crush on me.";
	mes "I hope it works out!";
	NEXT;
	mes "-Let's report to Halberd.";
	mes "Will Halberd endure? -";
	next;
L_REP:
	mes "^FF0000 [Mission] ^000000-Report to Halberd in Prontera-";
	close2;
	set AC_QUEST_ST_0,3;
	end;
L_OTHER:
	mes "[Mary-Anne]";
	mes "Susanne, I hope it works out for you.";
	if(AC_QUEST_LV_0==1 || AC_QUEST_ST_0==3) goto L_REP;
	close;
}
function	script	JewelerFUNC#AC_QUE00	{
	if(AC_QUEST_ST_0==3){
		mes "[Ryuk]";
		mes "Did you like it?";
		next;
		if(strnpcinfo(1)=="Susanne"){
			emotion 33, "Susanne#AC_QUE00SZ01";
			// only appears when talking to Susanne
		}
		mes "[Susanne]";
		mes "Yes, very much!";
		mes "I bet he'll love these rubies!";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Halberd in Prontera-";
		close;
	}
	mes "[Ryuk]";
	mes "Susanne.";
	mes "We have been waiting for you.";
	mes "The item you promised is ready.";
	next;
	mes "-A man who looks like Jeweler is talking with a woman who looks like a customer";
	next;
	mes "[Ryuk]";
	mes "Susanne-san.";
	mes "This way, please.";
	next;
	mes "-Jeweler man gave two jewels to Susanne -";
	next;
	// all numbers, as in the main mackerel.
	emotion 2, "Susanne#AC_QUE00SZ01";
	mes "[Susanne]";
	mes "Wow ......";
	next;
	mes "[Ryuk]";
	mes "Did you like it?";
	next;
	emotion 33, "Susanne#AC_QUE00SZ01";
	mes "[Susanne]";
	mes "Yes, very much!";
	mes "He'll love these rubies!";
	next;
	mes "-Let's ask Susanne who to pre-Zent-";
	next;
	menu "It's a lovely gemstone." ,-;
	mes "[Susanne]";
	mes "Eh, thanks.";
	next;
	menu "Pre-Zento?" ,-;
	mes "[Susanne]";
	mes "Uh, yeah. ......";
	mes "I thought I'd pre-ZenT to someone I've always loved: ......";
	next;
	mes "[Susanne]";
	mes "Me and him have the same birth month and our birthstones are rubies.";
	mes "[Susanne]";
	next;
	menu "What is that person's name?" ,-;
	mes "[Susanne]";
	mes "What, name?";
	mes "Hey, I can't tell you that.";
	mes "I'm sorry.";
	next;
	mes "[Susanne]";
	mes "But she is a very sweet person.";
	mes "Even though she is frail, she always tries to protect me. ......";
	next;
	menu "...... I hope things work out for you." ,-;
	emotion 15, "Susanne#AC_QUE00SZ01";
	mes "[Susanne]";
	mes "Thank you!";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "(Let's report to Halberd.)";
	next;
	mes "^FF0000 [Mission] ^000000-Report to Halberd in Prontera-";
	close2;
	set AC_QUEST_ST_0,3;
	end;
}
moc_ruins.gat,114,100,4	script	Susanne#AC_QUE00SZ01	90,{
	if(AC_QUEST_LV_0==2 && (AC_QUEST_ST_0==2 || AC_QUEST_ST_0==3)) callfunc "JewelerFUNC#AC_QUE00";
	if(AC_QUEST_LV_0==4){
		switch(AC_QUEST_ST_0){
		case 2:
			mes "[Susanne]";
			mes "Oh, you are ......";
			next;
			menu "Yes, please." ,-;
			mes "-I gave Susanne the two boxes containing the rings that had been entrusted to me...";
			next;
			mes "[Susanne]";
			mes "You brought the rings, thank you.";
			next;
			emotion 40;
			mes "-Susanne slowly opened the box.";
			mes "Then she looked inside and sighed-";
			next;
			mes "[Susanne]";
			mes "Wow, beautiful ......";
			mes "Really beautiful ring ......";
			next;
			mes "[Ryuk]";
			mes "It's a stunning ring.";
			mes "As expected, Gerald.";
			mes "I am always amazed at how well that man does his job.";
			next;
			EMOTION 40;
		case 3:
			mes "[Susanne]";
			mes "Really beautiful ring ......";
			mes "I hope she'll be happy with it ......";
			next;
			mes "-Susanne looks at the ring and smiles-";
			next;
			mes "^FF0000 [Mission] ^000000-Report to Ring MakerGerald in Payon-";
			close2;
			set AC_QUEST_ST_0,3;
			end;
		}
	}
	mes "[Susanne]";
	mes "Ryuk's handling of the gems is very beautiful.";
	close;
}
moc_ruins.gat,116,100,4	script	Jeweler#AC_QUE00	47,{
	if(AC_QUEST_LV_0==2 && (AC_QUEST_ST_0==2 || AC_QUEST_ST_0==3)) callfunc "JewelerFUNC#AC_QUE00";
	mes "[Ryuk]";
	mes "My name is Ryuk and I run Jeweler.";
	mes "Please take a moment to get to know me.";
	close;
}
geffen_in.gat,113,104,4	script	Susanne#AC_QUE00SZ02	90,{
	if(AC_QUEST_LV_0==3){
		switch(AC_QUEST_ST_0){
		case 2:
			mes "-Susanne is talking to a man who looks like a Physician-";
			close;
		case 3:
			emotion 19;
			mes "[Susanne]";
			mes "You met at Morroc ......";
			mes "Oh, sorry.";
			mes "I have to hurry up and deliver this medicine!";
			close;
		}
	}
	mes "[Susanne]";
	mes "Hello.";
	mes "I'm here to see Dr. Barry to get my medicine.";
	close;
}
geffen_in.gat,113,101,4	script	Physician#AC_QUE00	121,{
	if(AC_QUEST_LV_0==3){
		switch(AC_QUEST_ST_0){
		case 2:
			mes "-Susanne is talking to the Physician-";
			next;
			emotion 19, "Susanne#AC_QUE00SZ02";
			mes "[Susanne]";
			mes "Doctor, he doesn't feel well again!";
			mes "I think I'm out of medicine too. ......";
			next;
			mes "[Susanne]";
			mes "So I came to get the medicine instead of him.";
			next;
			mes "[Barry]";
			mes "Okay, then I'll prescribe the medicine right away.";
			next;
			mes "-Physician gave the medicine to Susanne-";
			next;
			mes "[Susanne]";
			mes "Thank you, doctor!";
			mes "Hurry up, I'll get it to him!";
			next;
			mes "[Barry]";
			mes "Mm, hurry up and give him a drink.";
			next;
			mes "-Physician looked at us when Susanne was done dealing with -";
			next;
			mes "[Barry]";
			mes "Umm, next: ......";
			next;
			mes "-Talked about Halberd's case-";
			next;
			mes "[Barry]";
			mes "Have you come to pick up Halberd's meds?";
			mes "Halberd seems to have a lot of good friends.";
			next;
			menu "?" ,-;
			mes "[Barry]";
			mes "You won't have to worry about having too many pills.";
			mes " Here, medicine.";
			next;
			mes "-I've received the medicine-";
			next;
			mes "^FF0000 [Mission] ^000000-Give the medicine to Halberd in Prontera-";
			close2;
			set AC_QUEST_ST_0,3;
			end;
		case 3:
			mes "[Barry]";
			mes "When you run out of medicine, come back anytime.";
			next;
			mes "^FF0000[Mission] ^000000-Give medicine to Halberd in Prontera-";
			close;
		}
	}
	mes "[Barry]";
	mes "My name is Barry.";
	mes "I am a Physician.";
	mes "Take care of your health.";
	close;
}
payon_in01.gat,6,55,4	script	Ring Maker#AC_QUE00	901,{
	if(AC_QUEST_LV_0==4){
		switch(AC_QUEST_ST_0){
		case 1:
			mes "[Gerald]";
			mes "Oh, you've come a long way!";
			mes "I am Gerald, the guy you asked for this time!";
			next;
			mes "[Gerald]";
			mes "I've been making rings for 40 years!";
			mes "I am a Ring Maker!";
			next;
			mes "[Gerald]";
			mes "Well, you've got some pretty nice fingers.";
			mes "I think you'd be good at this job.";
			next;
			mes "[Gerald]";
			mes "Hmmm, next time I'll ask you to help me make a ring.";
			next;
			menu "What did you request this time?" ,-;
			mes "[Gerald]";
			mes "What I need you to do this time is to deliver the ring I made to the client as soon as possible.";
			mes "Here it is.";
			next;
			mes "[Gerald]";
			mes "What do you think?";
			mes "Good work, isn't it?";
			mes "The decoration of this ring is my best work.";
			next;
			mes "[Gerald]";
			mes "Please deliver me two of these ruby rings.";
			mes "The location is at Jeweler's place around Morroc Pira Mido.";
			mes "The client of these rings should be there.";
			next;
			emotion 0,"";
			mes "[Gerald]";
			mes "The client's name is ^FF0000Susanne^000000.";
			mes "Best regards.";
			next;
			mes "^FF0000[Mission] ^000000-Meet Susanne at Jeweler's place around Pira Mido in Morroc and give her the ruby ring-";
			close2;
			set AC_QUEST_ST_0,2;
			end;
		case 2:
			mes "[Gerald]";
			mes "The location is at Jeweler^000000 around Pira Mido in ^FF0000Morroc.";
			mes "The client of this ring should be there.";
			mes "The client's name is ^FF0000Susanne^000000.";
			mes "Please take good care of it.";
			next;
			mes "^FF0000[Mission] ^000000-Meet Susanne at Jeweler's place around Pira Mido in Morroc and give her the ruby ring-";
			close;
		case 3:
			mes "[Gerald]";
			mes "Oh, you delivered it!";
			mes "Thank you!";
			mes "You're a fast worker, my friend.";
			next;
		case 99:
			mes "[Gerald]";
			mes "I may need to ask you for something else.";
			mes "If you do, I'll be looking forward to working with you.";
			next;
			mes "^FF0000 [request accomplished] ^000000-you accomplished your request!";
			mes "Let's go report to the Adventurers Academy-";
			close2;
			set AC_QUEST_ST_0,99;
			end;
		}
	}
	mes "[Halberd]";
	mes "My name is Gerald.";
	mes "I have been making rings for 40 years!";
	mes "I am a Ring Maker!";
	close;
}
function	script	NeliaFUNC#AC_QUE00	{
	mes "-Susanne is here.";
	mes "Susanne is talking to a woman.";
	mes "I'm going to listen -";
	next;
	mes "[Susanne]";
	mes "...... Even if that happens, we're still going to be friends, right?";
	next;
	mes "[Nelia]";
	mes "That's right!";
	mes "No wonder!";
	mes "Don't worry, you'll be fine.";
	next;
	mes "[Susanne]";
	mes "Thank goodness ......";
	next;
	emotion 18, "Nelia#AC_QUE00";
	mes "[Nelia]";
	mes "You're really, really disciplined to come all the way over here to check on me like that!";
	next;
	mes "[Susanne]";
	mes "Because we're best friends.";
	mes "So ......";
	next;
	emotion 18, "Nelia#AC_QUE00";
	mes "[Nelia]";
	mes "Don't worry, don't worry!";
	mes "I'll always be your best friend!";
	mes "But then again, I like that guy ......";
	next;
	emotion 0, "Nelia#AC_QUE00";
	// Can you reproduce the subtle time difference?
	mes "-Then the two of them, who were absorbed in the story, ";
	mes strcharinfo(0) + "were";
	mes "I noticed that they were beside each other -";
	emotion 0, "Susanne#AC_QUE00SZ03";
	next;
	emotion 23, "Susanne#AC_QUE00SZ03";
	mes "[Susanne]";
	mes "～～～～～～～～!!!!";
	mes strcharinfo(0) + "!";
	next;
	mes "[Susanne]";
	mes "Did you hear everything I just said?";
	next;
	menu "I didn't hear you",-;
	emotion 54, "Susanne#AC_QUE00SZ03";
	mes "[Susanne]";
	mes "haha ......";
	mes "Thank God......";
	next;
	emotion 29, "Nelia#AC_QUE00";
	mes "[Nelia]";
	mes "Oh, you didn't hear that?";
	mes "Well, I'll tell you all about it.";
	mes "This is the girl ......";
	next;
	emotion 23, "Susanne#AC_QUE00SZ03";
	mes "[Susanne]";
	mes "Hey, Nelia!";
	mes "Really stop ～～～～!!!";
	next;
	mes "-Susanne is desperately trying to cover Nelia's mouth-";
	next;
	emotion 23, "Nelia#AC_QUE00";
	mes "[Nelia]";
	mes "V~~~!";
	mes "mogomogo～～～～!!!";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "(Let's report this to Halberd.)";
	next;
	mes "^FF0000 [Mission] ^000000-Report to Halberd in Prontera-";
	close2;
	set AC_QUEST_ST_0,3;
	end;
}
comodo.gat,165,163,4	script	Susanne#AC_QUE00SZ03	90,{
	if(AC_QUEST_LV_0==9) goto L_CLEAR;
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==2) callfunc "NeliaFUNC#AC_QUE00";
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==3) {
		mes "[Susanne]";
		mes ""+strcharinfo(0) + ", I didn't really hear you ......";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Halberd in Prontera-";
		close;
	}
L_OTHER:
	mes "[Susanne]";
	mes "I came from Prontera to see Nelia.";
	close;
L_CLEAR:
	mes "[Susanne]";
	mes ""+strcharinfo(0) + ".";
	mes "I'm so grateful to you!";
	close;
}
comodo.gat,168,163,4	script	Nelia#AC_QUE00	724,{
	if(AC_QUEST_LV_0==9) goto L_CLEAR;
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==2) callfunc "NeliaFUNC#AC_QUE00";
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==3) {
		mes "[Nelia]";
		mes "Susanne is so cute that I want to tease her!";
		next;
		mes "^FF0000[Mission] ^000000-Report to Halberd in Prontera-";
		close;
	}
L_OTHER:
	mes "[Nelia]";
	mes "Oh, I love Comodo!";
	mes "I came from Prontera to be a Dancer.";
	mes "I'm glad I came!";
	close;
L_CLEAR:
	mes "[Nelia]";
	mes "I'm glad Halberd and Susanne worked things out.";
	mes "I'm so glad!";
	close;
}
prt_monk.gat,138,168,4	script	Halberd#AC_QUE00H02	48,{
	set '@novice, callfunc("AC_GetNovice");
	if(AC_QUEST_LV_0!=6) goto L_OTHER;
	switch(AC_QUEST_ST_0){
	case 2:
		mes "[Halberd]";
		mes "Hi,";
		mes strcharinfo(0) + "!";
		mes "I've been waiting for you!";
		next;
		mes "[Halberd]";
		mes "I heard that Susanne is from the south.";
		mes "Whew, that makes me nervous.";
		next;
		emotion 1;
		mes "[Halberd]";
		mes "......";
		mes "hmm?";
		mes "Oh, there's something down there.";
		next;
		mes "-There's a little box falling down.";
		mes "I seem to remember ......";
		mes "Halberd picked up that box -";
		next;
		mes "[Halberd]";
		mes "I wonder what it is?";
		mes "Oh, there's a ring in it.";
		mes "It's a very beautiful ring. ......";
		next;
		mes "^FF0000-Susanne's ring! -^000000";
		next;
		mes "[Halberd]";
		mes "I wonder if the person who dropped it off is in trouble.";
		mes "I still have a little time before Susanne's meeting time, so I'll try to find the owner for a bit: ......";
		next;
		mes "-I'd better hurry and ask Susanne.";
		mes "Susanne is apparently in the south -";
		next;
		mes "^FF0000[Mission] ^000000-I'll ask Susanne about the ring.";
		mes "Susanne is to the south of the monastery of St. Capitolina-";
		close2;
		set AC_QUEST_ST_0,3;
		viewpoint 1,232,86,11,0x0000FF;
		end;
	case 3:
		mes "[Halberd]";
		mes "That's a cool ring by the way.";
		mes "I'd love to have it if the loser didn't show up.";
		next;
		mes "^FF0000 [Mission] ^000000-Ask Susanne about the ring.";
		mes "Susanne is in the south direction of the Monastery of St. Capitolina-";
		close;
	case 4:
		mes "[Halberd]";
		mes "That's a cool ring, by the way.";
		mes "I'd love to have it if the loser didn't show up.";
		next;
		menu "I found the owner.",-;
		mes "[Halberd]";
		mes "What, really?";
		mes "Well, I'll go return it.";
		mes "Where is the person who owns it?";
		next;
		menu "I'll return it myself.",-;
		EMOTION 9;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + "I'll go give it back, okay?";
		mes "No, I'm fine.";
		mes "I picked it up, I'll deliver it.";
		next;
		menu "......",-;
		emotion 1;
		mes "[Halberd]";
		mes "Where is the person who owns this?";
		mes "Hey, why don't you tell me?";
		next;
		mes "-for a while";
		mes strcharinfo(0) + "is";
		mes "I told Halberd to give the ring to me, but Halberd did not give it back-";
		next;
		mes "-I had no choice but to tell him that the ring belonged to Susanne-";
		next;
		emotion 0;
		mes "[Halberd]";
		mes "!";
		mes "I see.";
		next;
		mes "[Halberd]";
		mes "Perhaps this is the ring that Susanne is going to give to the person she loves: ......";
		next;
		mes "[Halberd]";
		mes ""+strcharinfo(0) + ", I'm about to be ruled by one emotion right now.";
		mes "I've never had this happen before. ......";
		next;
		emotion 7;
		mes "[Halberd]";
		mes "It's a feeling, loving Susanne.";
		mes "That is, I do not want to give Susanne to another man.";
		next;
		emotion 36;
		mes "[Halberd]";
		mes "Eei!";
		mes "Such a thing!";
		next;
		mes "-Halberd slammed the ring to the ground, then picked up another fallen stone and slammed it into the ring! -";
		next;
		mes "^0000FF- And Halberd threw the ring overboard! -";
		next;
		menu "Oh my God!" ,-;
		mes "-" + strcharinfo(0) + "slapped Halberd -";
		next;
		mes "[Halberd]";
		mes "Bubbe!";
		mes "......";
		mes "I couldn't control my emotions ......";
		mes "Sorry.";
		next;
		mes "[Halberd]";
		mes "I'm so sorry about Susanne ......";
		mes "I can't help it, I love her ......";
		next;
		mes "-I can't help it ......";
		mes "Let's report to Susanne about the ring-";
		next;
		mes "^FF0000 [Mission] ^000000-Report to Susanne about the ring-";
		close2;
		viewpoint 1,232,86,11,0x0000FF;
		set AC_QUEST_ST_0,5;
		end;
	case 5:
		mes "[Halberd]";
		mes "Susanne's thing is ......";
		mes "I can't help it, I love her ......";
		next;
		mes "^FF0000 [Mission] ^000000-report to Susanne about the ring-";
		close2;
		viewpoint 1,232,86,11,0x0000FF;
		end;
	case 6:
		emotion 23;
		mes "[Halberd]";
		mes "Ahhhh! I am!";
		mes "Oh my God, what have I done!";
		next;
		mes "[Halberd]";
		mes "I'm such a fool, such a fool!!!";
		next;
		emotion 23;
		mes "[Halberd]";
		mes "I have no face to meet Susanne ......";
		mes "Ugh!";
		next;
		mes "[Halberd]";
		mes "......";
		mes ""+strcharinfo(0) + ", sorry ......";
		mes "I need to think alone...";
		mes "Thanks for everything.";
		if('@novice){
			mes "This is a thank you. ......";
		}
		next;
		if('@novice){
			if(!checkweight(1011,6)){
				mes "-overweight! -";
				close;
			}
			getitem 1011,6;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[Halberd]";
		mes "......";
		mes ""+strcharinfo(0) + ", sorry ......";
		mes "I need to think alone...";
		mes "Thanks for everything.";
		next;
		mes "^FF0000 [request fulfilled] ^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_OTHER:
	mes "[Halberd]";
	mes "Hello.";
	close;
}
prt_monk.gat,232,86,4	script	Susanne#AC_QUE00SZ03	90,{
	if(AC_QUEST_LV_0!=6) goto L_OTHER;
	switch(AC_QUEST_ST_0){
	case 3:
		emotion 28;
		mes "[Susanne]";
		mes "What should I do, I don't have the ring ......";
		mes "I must have dropped it ......";
		mes "I can't confess this ......";
		next;
		mes "-I told Susanne that the ruby ring had fallen and that Halberd had picked it up-";
		next;
		emotion 0;
		mes "[Susanne]";
		mes "Oh no, Halberd picked it up!";
		mes "Oh, no.";
		next;
		mes "[Susanne]";
		mes "Of all people, I can't believe Halberd picked it up. ......";
		mes "That was a ruby ring from me to give to Halberd ......";
		next;
		mes "[Susanne]";
		mes "......";
		mes "Actually, you know, I'm thinking of confessing to Halberd today.";
		mes "So I called him up here.";
		next;
		mes "[Susanne]";
		mes "We have the same birth month, so I got him a matching pair of rubies, his birthstone.";
		next;
		mes "[Susanne]";
		mes "I wanted to give it to you and confess my feelings.";
		mes "And that's why I can't believe this is happening: ......";
		next;
		menu "Anyway, I'm going to get the ring back.",-;
		mes "[Susanne]";
		mes "...... yeah, please ......";
		mes "I want to give it to Halberd from me. ......";
		next;
		mes "^FF0000 [Mission] ^000000-Speak to Halberd and ask him to return the ring-";
		close2;
		set AC_QUEST_ST_0,4;
		viewpoint 1,138,168,11,0x0000FF;
		end;
	case 4:
		emotion 54;
		mes "[Susanne]";
		mes "Oh, how screwed up I am ......";
		next;
		mes "^FF0000[mission] ^000000-talk to Halberd and get the ring back-";
		close;
	case 5:
		mes "[Susanne]";
		mes ""+strcharinfo(0) + ", how was it?";
		next;
		mes "-Halberd told me that he had destroyed the ring-";
		next;
		mes "-and told that Halberd likes Susanne and that he destroyed the ring because he mistakenly thought it was for another man-";
		next;
		EMOTION 1;
		mes "[Susanne]";
		mes "Halberd likes me?";
		mes "Oh, no. ......";
		next;
		mes "[Susanne]";
		mes "Because, Halberd, you haven't seen me for a long time now, and when I talk to you, you've been cold to me. ......";
		mes " That's why I miss you so much. ......";
		next;
		mes "[Susanne]";
		mes "So I got a ruby ring ......";
		mes "Rubies are the birthstone for July, the month he and I were born.";
		mes "The stone language is also 'pure love' and I wanted to confess my love with a ruby ring. ......";
		next;
		mes "-Then! -";
		next;
		mes "[?]";
		mes "Kuh!!!";
		next;
		mes "-a voice was heard from the shadows.";
		mes "^0000FFHalberd! ^000000I think he heard our conversation just now-";
		next;
		mes "-Halberd ran off with a ^0000FF sad face^000000! -";
		next;
		emotion 0;
		mes "[Susanne]";
		mes "Halberd! -Susanne tries to go after Halberd-";
		next;
		if(select("stop Susanne", "watch")==1){
			mes "-Susanne tried to follow, but ";
			mes strcharinfo(0) + "is";
			mes "stopped it-";
			next;
			mes "[Susanne]";
			mes ""+strcharinfo(0) + ", why stop it!";
			next;
			menu "I'll go myself",-;
			mes "[Susanne]";
			mes "......";
			mes "Okay. ......";
			mes "Please.";
			next;
			mes "[Susanne]";
			mes "......";
			mes "If only I hadn't lost my ruby ring: ......";
			next;
		}
		else {
			mes "-Susanne goes after Halberd.";
			mes ""+strcharinfo(0) + "watches over it-";
			next;
			mes "[Susanne]";
			mes "Ah!";
			mes " -Susanne tripped.";
			mes "Meanwhile, Halberd was out of sight -";
			next;
			mes "[Susanne]";
			mes "Oh, Halberd......";
			mes "Don't go ......";
			next;
			menu "I'll go find it myself.",-;
			mes "[Susanne]";
			mes "......";
			mes "Yes, please ......";
			next;
		}
		mes "^FF0000 [Mission] ^000000-Speak to Halberd-";
		close2;
		set AC_QUEST_ST_0,6;
		viewpoint 1,138,168,11,0x0000FF;
		end;
	case 6:
		mes "[Susanne]";
		mes "......";
		mes "If only I hadn't lost my ruby ring: ......";
		next;
		mes "^FF0000 [Mission] ^000000-Speak to Halberd-";
		close2;
		viewpoint 1,138,168,11,0x0000FF;
		end;
	case 99:
		mes "[Susanne]";
		mes "......";
		mes "If only I hadn't lost my ruby ring: ......";
		next;
		//unresearched
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_OTHER:
	mes "[Susanne]";
	mes "Hello.";
	mes "I like this place.";
	close;
}
izlude.gat,137,156,4	script	Susanne#AC_QUE00SZ04	90,{
	switch(AC_QUEST_LV_0){
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_QUEST09;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST08:
	switch(AC_QUEST_ST_0){
	case 1:
		mes "[Susanne]";
		mes ""+strcharinfo(0) + ", I need a favor.";
		next;
		mes "[Susanne]";
		mes "I haven't been able to locate Halberd since then.";
		mes "Every once in a while, he seems to come back to Prontera, but then he's gone.";
		next;
		mes "[Susanne]";
		mes "I'm so worried about her. ......";
		mes "So I need you to find out where Halberd is and what he is doing.";
		next;
		menu "Okay",-;
		mes "[Susanne]";
		mes "Thanks!";
		next;
		mes "-Let's go to the place where Halberd was in Prontera-";
		next;
		mes "^FF0000 [Mission] ^000000-go to the location where Halberd of Prontera was and look for information-";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[Susanne]";
		mes "I need you to find out where Halberd is and what he is doing.";
		next;
		mes "-Let's go to where Halberd was in Prontera-";
		next;
		mes "^FF0000 [Mission] ^000000-go to the location where Halberd was in Prontera and look for information-";
		close;
	case 3:
		mes "[Susanne]";
		mes ""+strcharinfo(0) + ", what did you find out?";
		next;
		mes "-I told him that I met Halberd in Prontera and that Halberd was looking for a replacement ruby in the Arnaveltian Province-";
		next;
		mes "[Susanne]";
		mes "Oh, no. ......";
		mes "Halberd, you are so frail, but such a long way away ......";
		next;
		mes "[Susanne]";
		mes "I wish I could just stay with Halberd ......";
		next;
		mes "^FF0000 [request fulfilled] ^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[Susanne]";
		mes "Halberd, even though you are frail: ......";
		mes "Worried ......";
		next;
		mes "^FF0000 [request accomplished] ^000000- request accomplished!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
	goto L_OTHER;
L_QUEST09:
	switch(AC_QUEST_ST_0){
	case 1:
		mes "[Susanne]";
		mes ""+strcharinfo(0) + ", Oh my God!";
		next;
		menu "What's wrong?" ,-;
		mes "[Susanne]";
		mes "Halberd went to the Arnavelts teaching country and hasn't come back for a week!";
		mes "He's so weak!";
		mes "I need medicine!";
		NEXT;
		emotion 0,"";
		mes "[Susanne]";
		mes "I checked with Halberd's doctor in Geffen and he said he only got a 3-day supply a week ago.";
		next;
		menu "!!!" ,-;
		mes "[Susanne]";
		mes "I'm sure you're out of medicine by now and in a lot of trouble, so come with me to the Arnaveltian State to deliver the medicine!";
		NEXT;
		menu "Of course!" ,-;
		mes "[Susanne]";
		mes "First, let's go find Rachel!";
		next;
		mes "[Susanne]";
		mes "If you go north on the central road in Rachel, there are stairs to the Temple of Freya.";
		mes "In front of it, let's meet up!";
		NEXT;
		mes "^FF0000 [Mission] ^000000-go to Rachel and meet Susanne in front of the stairs to the Freya Temple to gather information-";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[Susanne]";
		mes "First, let's go to Rachel!";
		next;
		mes "[Susanne]";
		mes "If you go north on the central road in Rachel, there are stairs to the Temple of Freya.";
		mes "In front of it, let's meet up!";
		NEXT;
		mes "^FF0000 [Mission] ^000000-go to Rachel and meet Susanne in front of the stairs to the Freya Temple to gather information-";
		close;
	}
L_OTHER:
	mes "[Susanne]";
	mes "Hello.";
	close;
L_CLEAR:
	mes "[Susanne]";
	mes ""+strcharinfo(0) + ".";
	mes "I'm so grateful to you!";
	close;
}
rachel.gat,148,190,4	script	Susanne#AC_QUE00SZ05	90,{
	if(AC_QUEST_LV_0==9) goto L_CLEAR;
	if(AC_QUEST_LV_0!=8) goto L_OTHER;
	switch(AC_QUEST_ST_0){
	case 2:
		mes "[Susanne]";
		mes ""+strcharinfo(0) + "!";
		mes "Halberd, I was staying at Rachel's hotel until 2 days ago!";
		next;
		mes "[Susanne]";
		mes "I heard that she told the hotel staff that she was going to Veins from now on.";
		next;
		mes "[Susanne]";
		mes "I'm a little relieved, especially since she didn't seem to be sick ......";
		next;
		mes "[Susanne]";
		mes "But we have to hurry.";
		mes "Let's go to Veins next.";
		mes "Halberd......";
		mes "Wait for me!";
		next;
		mes "^FF0000 [Mission] ^000000-go to Veins and find Halberd-";
		close2;
		set AC_QUEST_ST_0,3;
		end;
	case 3:
		mes "[Susanne]";
		mes "Let's go to Veins next.";
		mes "Halberd......";
		mes "Wait for me!";
		next;
		mes "^FF0000 [Mission] ^000000-go to Veins and find Halberd-";
		close;
	}
L_OTHER:
	mes "[Susanne]";
	mes "Hello.";
	close;
L_CLEAR:
	mes "[Susanne]";
	mes ""+strcharinfo(0) + ".";
	mes "I'm so grateful to you!";
	close;
}
veins.gat,151,330,4	script	Susanne#AC_QUE00SZ06	90,{
	set '@novice, callfunc("AC_GetNovice");
	if(AC_QUEST_LV_0!=8) goto L_OTHER;
	switch(AC_QUEST_ST_0) {
	case 3:
		mes "[Susanne]";
		mes "Halberd!";
		next;
		emotion 0, "Halberd#AC_QUE00H03";
		mes "[Halberd]";
		mes "Susanne!";
		mes "Why are you here?";
		next;
		mes "[Susanne]";
		mes "I didn't come here to worry!";
		mes "Is your body okay?";
		mes "I brought you medicine!";
		mes "Come on, take it!";
		NEXT;
		mes "-Susanne shoved the pills into Halberd's mouth-";
		next;
		emotion 16, "Halberd#AC_QUE00H03";
		mes "[Halberd]";
		mes "Hey! Ghee-hoo ghee-hoo ......";
		mes "Suffering!";
		next;
		mes "[Halberd]";
		mes "Kuh, I took the pills earlier, so I'm fine.";
		next;
		emotion 1, "Susanne#AC_QUE00SZ06";
		mes "[Susanne]";
		mes "Why?";
		mes "You must have had a hard time without your medicine!";
		next;
		mes "[Halberd]";
		mes "Previously, ";
		mes strcharinfo(0) + "was";
		mes "I found some medicine you brought me and I took it, so I'm fine.";
		next;
		mes "[Susanne]";
		mes "Really?";
		mes "Thank goodness ......";
		mes "I was worried about you. ......";
		next;
		emotion 33, "Susanne#AC_QUE00SZ06";
		mes "[Susanne]";
		mes "Well, come with me, let's go back now.";
		mes "Hey?";
		next;
		mes "[Halberd]";
		mes "No!";
		mes "I can't go back yet!";
		next;
		emotion 1, "Susanne#AC_QUE00SZ06";
		mes "[Susanne]";
		mes "Why?";
		mes "Why can't you go back?";
		next;
		mes "[Halberd]";
		mes "......";
		mes "To make a matching pairing with you. ......";
		mes "I have to find rubies for that.";
		next;
		emotion 0, "Susanne#AC_QUE00SZ06";
		mes "[Susanne]";
		mes "No more pairings!";
		mes "So let's go back together.";
		next;
		mes "[Halberd]";
		mes "No, you can't.";
		mes "This is my test.";
		mes "I've been relying on people too much.";
		next;
		mes "[Halberd]";
		mes "Susanne, I like you, but I was afraid that you would reject me, so I ran away from confessing my feelings";
		mes strcharinfo(0) + "to";
		mes "I relied on you all the time.";
		next;
		mes "[Halberd]";
		mes "I'm not worthy of you like that.";
		mes "I can only be a man worthy of you when I get myself a matching pair of rings.";
		next;
		mes "[Susanne]";
		mes "That's not true!";
		mes "You came all this way by yourself for me, without regard for your own body ......";
		mes "That feeling is enough for me.";
		next;
		mes "-Halberd shook his head-";
		next;
		mes "-Susanne thought for a moment.";
		mes "And then she took out a ruby ring -";
		next;
		mes "[Halberd]";
		mes "That's the ring for you, isn't it?";
		mes "I'll be sure to make one for me, and we'll be matching. ......";
		next;
		mes "-Susanne suddenly threw that ruby ring as hard as she could towards the mountain! -";
		next;
		mes "[Halberd]";
		mes "Ah!";
		mes "What are you doing!";
		next;
		mes "[Susanne]";
		mes "Now we're all together, aren't we?";
		next;
		mes "[Susanne]";
		mes "If Halberd makes a ruby ring, we won't match anymore.";
		next;
		emotion 9, "Halberd#AC_QUE00H03";
		mes "[Halberd]";
		mes "......";
		next;
		emotion 20, "Halberd#AC_QUE00H03";
		mes "[Halberd]";
		mes "Hmph Susanne, let's go back together.";
		mes "I'm like this, but I'll definitely make you happy!";
		next;
		emotion 33, "Susanne#AC_QUE00SZ06";
		mes "[Susanne]";
		mes "Yes!";
		next;
		mes "[Susanne]";
		mes ""+strcharinfo(0) + ", thank you so much.";
		if('@novice){
			mes "Here's a little something from me.";
		}
		next;
		if('@novice){
			if(!checkweight(1146,1)) {
				mes "-overweight! -";
				close;
			}
			getitem 1146,1;
		}
		set AC_QUEST_ST_0,99;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	case 99:
		mes "[Susanne]";
		mes "Halberd......";
		mes "I'll be with you all the way.";
		mes "From now on, you can talk to me about anything.";
		next;
		mes "[Halberd]";
		mes "Yeah ......";
		next;
		mes "[Susanne]";
		mes ""+strcharinfo(0) + ", thank you so much.";
		next;
		mes "[Halberd]";
		mes "We made it work";
		mes strcharinfo(0) + "of";
		mes "Thanks to you.";
		mes "Thanks!";
		next;
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_OTHER:
	mes "[" + strcharinfo(0) + "]";
	mes "(The two are having a pleasant conversation.";
	mes "Let's leave them alone.\")";
	close;
}
veins.gat,148,329,4	duplicate(Susanne#AC_QUE00SZ06)	Halberd#AC_QUE00H03	48

