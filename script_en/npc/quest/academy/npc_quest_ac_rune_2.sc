//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Lune's Request
//
// by Pneuma
// To that person who helped me -----------------------------------
aldeba_in.gat,171,171,4	script	Misery#aldeba_in	68,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_2)goto L_OTHER;
	switch(AC_QUEST_LV_2){
	case 0:
		goto L_QUEST01;
	case 1:
		goto L_QUEST02;
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_QUEST09;
	}
L_QUEST01:
	switch(AC_QUEST_ST_2) {
	case 1:
		mes "[Misery]";
		mes "Hello~";
		next;
		menu "Hello",-;
		emotion 5;
		mes "[Misery]";
		mes "Oh, you're the one who takes requests!";
		mes "Thank you so much for your help!";
		mes "Well, I need you to deliver this to ^FF0000Touhi^000000 who is in ^0000FFLutie^000000.";
		next;
		emotion 21,"";
		mes "[Misery]";
		mes "When I went to ^FF0000Lutie^000000 before, a monster got me. ......";
		mes "I was rescued from that.";
		mes "So I want to deliver this to you as a thank you.";
		mes "But I was too busy to deliver it.";
		next;
		menu "I'll make sure to deliver it.",-;
		mes "^FF0000 [Mission] ^000000^0000FFTouhi^000000 in ^FF0000Lutie^000000, and report back to Misery after delivering the thank-you gift.";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[Misery]";
		mes "Oh, did you deliver the requested item?";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "I'm on my way now.";
		next;
		emotion 21;
		mes "[Misery]";
		mes "I see - I'll give you the delivery address again for GOST.";
		mes "Please deliver the thank-you gift to ^FF0000Touhi^000000 in ^0000FFLutie^000000.";
		mes "Thanks for your help!";
		next;
		mes "^FF0000 [Mission] ^FF0000Touhi^000000 in ^0000FFLutie^000000, report to Misery after delivering the thank-you gift.";
		close;
	case 3:
		mes "[Misery]";
		mes "Oh, did you deliver the requested item?";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "Yes, they were very pleased.";
		mes "So I kept the letter.";
		next;
		EMOTION 21;
		mes "-I gave the letter to Misery-";
		next;
		mes "[Misery]";
		mes "I am thrilled to receive your letter.";
		mes ""+strcharinfo(0)+ " I'm glad you undertook this.";
		mes "I'll be in touch if I need anything else!";
		next;
		if('@novice){
			mes "[Misery]";
			mes "Here, it's not much, but here's a little something for you!";
			next;
			// 602 10 butterfly wings
			if(!checkweight(602,10)){
				mes "Overweight!";
				close;
			}
			getitem 602,10;
		}
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Misery]";
		mes "Thank you.";
		mes "Thanks again if you need anything else!";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	}
L_QUEST02:
	switch(AC_QUEST_ST_2) {
	case 1:
		emotion 0;
		mes "[Misery]";
		mes "!";
		mes "Maybe again";
		mes strcharinfo(0) + "but";
		mes "You're taking my request!";
		next;
		menu "Yes",-;
		mes "[Misery]";
		mes "Wow, that's an awesome help!";
		mes "I've asked you once and I trust you.";
		next;
		emotion 5;
		mes "[Misery]";
		mes "I'll tell you what I'm asking for right away.";
		mes "Well, I heard that there is an Artisan who makes rare sweets in Yuno.";
		mes "I wanted to ask that person to make one pastry for me. ......";
		mes "I'd like you to go ask him on my behalf.";
		next;
		mes "[Misery]";
		mes "I'm busy as usual and I can't move from here, so I'm asking you to do it for me.";
		mes "Here, this is the order form, so please give me this.";
		next;
		menu "Leave it to me!" ,-;
		mes "^FF0000 [Mission] ^000000^000000^0000FFYuno^000000, make a request to the sweets Artisan to create sweets and report to Misery.";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[Misery]";
		mes "Oh, did you request to create a pastry?";
		next;
		menu "I'm just on my way.",-;
		EMOTION 11;
		mes "[Misery]";
		mes "I didn't know that!";
		mes "I'll tell you again for GHOST.";
		mes "Can you go to the confectionery Artisan at ^0000FFYuno^000000 and ask him to create a confectionery?";
		next;
		mes "[Misery]";
		mes "Come back to me when you are done with your request.";
		mes "Nice to meet you then.";
		next;
		mes "Make a request to the sweets Artisan in ^FF0000 [Mission] ^000000^0000FFYuno^000000 to create sweets and report back to Misery.";
		close;
	case 3:
		mes "[Misery]";
		mes "Oh, how about a request to create sweets?";
		next;
		menu "Your request is ready!" ,-;
		EMOTION 33;
		mes "- that I requested and that it takes time to make sweets" /*"wo" is missing as in the main mackerel*/;
		mes " I told Misery -";
		next;
		mes "[Misery]";
		mes "Thanks - as expected";
		mes strcharinfo(0) + "Hey!";
		mes "Thanks again for your help.";
		if('@novoce){
			mes "Here, take this as a thank you!";
		}
		next;
		if('@novoce){
			if(!checkweight(2305,1)){
				mes "-overweight! -";
				close;
			}
			getitem 2305,1;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Misery]";
		mes ""+strcharinfo(0);
		mes "Thank you.";
		mes "Thanks again if you need anything else!";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_2){
	case 1:
		goto L_OTHER;
	case 2:
		mes "[Misery]";
		mes "Ah!";
		mes ""+strcharinfo(0) + "Hello!";
		next;
		menu "I brought you some candy!" ,-;
		EMOTION 0;
		mes "[Misery]";
		mes "!!! You finally finished it!";
		mes "Thank you!";
		next;
		menu "Also, I'd like to pay you ......",-;
		emotion 17;
		mes "[Misery]";
		mes "Oh, that was your bill!";
		mes "I totally forgot.";
		mes "I'm so sorry!";
		mes "Yes, here!";
		next;
		mes "I will give the money to ^FF0000Mazzi^000000, who is in ^FF0000 [Mission] ^0000FFYuno^000000.";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[Misery]";
		mes "Ufufu, Misery ♪ Misery ♪";
		next;
		mes "^FF0000[Mission] ^000000^0000FFYuno^000000, give the money to ^FF0000Mazzi^000000, who is in ^0000FFYuno^000000.";
		close;
	}
L_QUEST09:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[Misery]";
		mes "Oh, I knew it";
		mes strcharinfo(0) + "!";
		mes "I'm sure you'll come"/*come to the main mackerel street*/;
		mes "I thought so!";
		next;
		menu "So what kind of request?" ,-;
		mes "[Misery]";
		mes "Well, I want you to deliver the candy and letter you delivered to me the other day to ^FF0000Roxxo^000000.";
		next;
		menu "Where are you?" ,-;
		mes "[Misery]";
		mes "Oh, yeah.";
		mes "Uh, yeah. ......";
		mes "Actually, he's an adventurer, and he's traveling around the world, so I don't know where he is right now. ......";
		next;
		menu "Do you have any information at all?" ,-;
		mes "[Misery]";
		mes "Yeah, hey ......";
		mes "I've also told my work colleague ^FF0000Ilias^000000 to let me know if he finds it, but he hasn't contacted me. ......";
		mes "Hmmm ......";
		next;
		emotion 33;
		mes "[Misery]";
		mes "I don't think we'll find it by blindly looking for it, so can you first ask ^FF0000Ilias^000000, my work colleague at ^FF0000Payon^000000, if he has any information?";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFPayon^000000, check with my workmate ^FF0000Ilias^000000 to see if he has any information.";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[Misery]";
		mes "Oh, should I explain again?";
		next;
		mes "[Misery]";
		mes "You won't know if you look for it blindly, so can you first ask your business partner ^FF0000Ilias^000000 at ^FF0000Payon^000000 if he has any information?";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFPayon^000000, check with my workmate ^FF0000Ilias^000000 to see if he has any information.";
		close;
	case 3:
		//not investigated
		mes "[Misery]";
		mes ""+strcharinfo(0) + "!";
		mes "Can you try going to ^FF0000Hugel^000000 immediately?";
		mes "I got a call from Ilias saying they have ^FF0000Roxxo^000000!";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFHugel^000000 to find ^FF0000Roxxo^000000.";
		close;
	case 4:
		mes "[Misery]";
		mes ""+strcharinfo(0) + "!";
		mes "^FF0000Roxxo^000000 found?";
		next;
		menu "Yes",-;
		mes "[Misery]";
		mes "Thank you so much!";
		mes "So how has he been?";
		next;
		menu "I was fine",-;
		mes "[Misery]";
		mes "I'm glad.";
		mes "I guess the letter will come later.";
		mes "Thank you so much!";
		mes "Thanks for all your help.";
		next;
		menu "About being an adventurer",-;
		mes "[Misery]";
		mes "Oh, that Roxxo guy is chatty. ......";
		mes "Yes, I was an adventurer too.";
		mes "But I'm having more fun with business.";
		next;
		mes "[Misery]";
		mes "I used to team up with him to go to different dungeons, you know?";
		mes "Those were full days.";
		mes "But I'm kind of lonely.";
		next;
		mes "[Misery]";
		mes "Now I want to team up with him in business, but ......";
		mes "He wants to continue being an adventurer.";
		next;
		emotion 23,"";
		emotion 29;
		mes "[Misery]";
		mes "I'm sure you've noticed that eating that candy would make your body incapable of continuing the adventure, so I'm sure you'll achieve my goal as a result.";
		next;
		mes "[Misery]";
		mes "Oh, that slipped my mind. ......";
		mes "Forget what you just said.";
		next;
		mes "[Misery]";
		if('@novice){
			mes "Also, this is my secondhand one, but you can use it if you want.";
		}
		mes "Thank you so much.";
		next;
		if('@novoce){
			if(!checkweight(2340,1)){
				mes "-overweight! -";
				close;
			}
			getitem 2340,1;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Misery]";
		mes ""+strcharinfo(0) + "!";
		mes "Thank you.";
		next;
		mes "^FF0000 [request fulfilled] ^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_CLEAR:
	switch(AC_QUEST_LV_2){
	case 1:
	case 2:
		mes "[Misery]";
		mes ""+strcharinfo(0)+"Thank you.";
		mes "Thanks again if you need anything else!";
		close;
	//not investigated
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[Misery]";
		mes ""+strcharinfo(0)+"How are things going with the sweets?";
		close;
	//not investigated
	case 7:
		mes "[Misery]";
		mes ""+strcharinfo(0)+"Thank you.";
		mes "Thanks again if you need anything else!";
		close;
	//not yet investigated
	case 8:
	case 9:
		mes "[Misery]";
		mes "Oh,";
		mes strcharinfo(0)+"Not!";
		mes "Thanks for all your help.";
		mes "Thank you so much!";
		close;
	}
L_OTHER:
	mes "[Misery]";
	mes "Hello~";
	close;
}
//-------------------------------------------------------
xmas_in.gat,173,171,4	script	Touhi#xmas_in	908,{
	if(AC_QUEST_LV_2==0) goto L_QUEST01;
	goto L_OTHER;
L_QUEST01:
	switch(AC_QUEST_ST_2) {
	case 2:
		mes "[Touhi]";
		mes "Hello.";
		next;
		menu "Mr. Touhi?" ,-;
		mes "[Touhi]";
		mes "I am indeed Touhi, okay?";
		mes "What can I do for you?";
		next;
		menu "Explain the background",-;
		emotion 33;
		mes "-Explained the circumstances to Touhi and handed him a thank-you gift-";
		next;
		emotion 19;
		mes "[Touhi]";
		mes "I kind of made her feel bad about it... ......";
		mes "But I'm soooo happy.";
		next;
		emotion 5;
		mes "[Touhi]";
		mes "Yes!";
		mes "And while you're at it, could you deliver one letter?";
		next;
		menu "OK",-;
		emotion 0;
		mes "[Touhi]";
		mes "Oh!";
		mes "Thank you!";
		mes "Well, I'll write you a letter in a minute.";
		next;
		emotion 5;
		mes "[Touhi]";
		mes "......";
		mes "............";
		mes "..................";
		next;
		mes "[Touhi]";
		mes "It's done, it's done!";
		mes "Well then, please take care of this!";
		next;
		mes "Report to ^FF0000Misery^000000, who is in ^FF0000 [Mission] ^000000^0000FFAldebaran^000000!";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[Touhi]";
		mes "Hello.";
		mes ""+strcharinfo(0)+".";
		mes "Did you deliver the letter?";
		next;
		menu "Not yet." ,-;
		mes "[Touhi]";
		mes "Letter, please take care of it!";
		next;
		mes "Report to ^FF0000Misery^000000 in ^FF0000 [Mission] ^0000FFAldebaran^000000!";
		close;
	}
L_OTHER:
	if(AC_QUEST_LV_2 || AC_QUEST_ST_2>3){
		mes "[Touhi]";
		mes "Hello.";
		mes ""+strcharinfo(0)+".";
		close;
	}
	else {
		mes "[Touhi]";
		mes "Hey, it's cold again today!";
		close;
	}
}
//------------------------------------------------------
payon.gat,165,99,4	script	Ilias	807,{
	if(AC_QUEST_LV_2!=8) goto L_OTHER;
	switch(AC_QUEST_ST_2) {
	case 2:
		mes "[Ilias]";
		mes "Hmm?";
		mes "Adventurer or ......";
		next;
		menu "Misery has told me",-;
		mes "[Ilias]";
		mes "Oh, from Misery.";
		mes "So, what is it?";
		next;
		menu "Explain the situation",-;
		emotion 0;
		mes "[Ilias]";
		mes "!";
		mes "Oh, the you-know-who thing!";
		mes "I just got the information earlier.";
		mes "I hear he's at ^FF0000Hugel^000000 right now?";
		next;
		menu "Really?",-;
		mes "[Ilias]";
		mes "Yeah, it's from a business associate, so I don't think it's a mistake, okay?";
		mes "I'll let Misery know about this, just in case.";
		NEXT;
		menu "Thank you very much.",-;
		mes "["+strcharinfo(0)+"]";
		mes "Let's head to Hugel as soon as possible.";
		next;
		mes "Go to ^FF0000 [Mission] ^000000^0000FFHugel^000000 and look for ^FF0000Roxxo^000000.";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[Ilias]";
		mes "Oh, it's you.";
		mes "You better head to ^FF0000Hugel^000000 right away, okay?";
		next;
		mes "Go to ^FF0000 [Mission] ^000000^0000FFHugel^000000 and look for ^FF0000Roxxo^000000.";
		close;
	}
L_OTHER:
	mes "[Ilias]";
	mes "hmm?";
	mes "Adventurer or ......";
	close;
}
hugel.gat,72,90,4	script	Roxxo	884,{
	if(AC_QUEST_LV_2!=8 || AC_QUEST_ST_2<3 || AC_QUEST_ST_2>4) goto L_OTHER;
	switch(AC_QUEST_ST_2) {
	case 3:
		EMOTION 9;
		mes "[Roxxo]";
		mes "......";
		next;
		menu "Hello",-;
		emotion 9;
		mes "[Roxxo]";
		mes "......";
		next;
		menu "That ......Misery asked me to do",-;
		emotion 0;
		mes "[Roxxo]";
		mes "!";
		mes "Misery......";
		mes "That's a name I've missed. ......";
		next;
		menu "Pass the letter and candy",-;
		mes "-Roxxo seems to be reading the letter-";
		next;
		emotion 4;
		mes "[Roxxo]";
		mes "I had completely forgotten about my birthday until I saw the letter.";
		mes "That's so ......";
		mes "How often do you tell people to quit being adventurers ......";
		next;
		mes "[Roxxo]";
		mes "That guy was an adventurer too, until recently, you know?";
		mes "Whew, he's selfish.";
		mes "Totally ......";
		next;
		mes "[Roxxo]";
		mes "Come to think of it, I never heard your name.";
		next;
		menu "Identify yourself.",-;
		mes "[Roxxo]";
		mes ""+strcharinfo(0) + "or.";
		mes "I'm sorry I seem to have caused you a lot of trouble.";
		mes "Tell ^FF0000Misery^000000 that I'll send a letter later.";
		mes "Thanks.";
		next;
		mes "Report to ^FF0000Misery^000000 who is in ^FF0000 [Mission] ^000000^0000FFAldebaran^000000.";
		close2;
		set AC_QUEST_ST_2,4;
		end;
	case 4:
	case 99:
		mes "[Roxxo]";
		mes ""+strcharinfo(0) + "or.";
		mes "Thanks, man.";
		close;
	}
L_OTHER:
	mes "[Roxxo]";
	mes "......";
	close;
}
//------------------------------------------------------
yuno_in04.gat,39,126,4	script	Mazzi	886,{
	set '@novice, callfunc("AC_GetNovice");
	switch(AC_QUEST_LV_2){
	case 0:
		goto L_OTHER;
	case 1:
		goto L_QUEST02;
	case 2:
		goto L_QUEST03;
	case 3:
		goto L_QUEST04;
	case 4:
		goto L_QUEST05;
	case 5:
		goto L_QUEST06;
	case 6:
		goto L_QUEST07;
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_OTHER;
	}
L_QUEST02:
	switch(AC_QUEST_ST_2){
	case 0:
	case 1:
	case 99:
		goto L_OTHER;
	case 2:
		mes "[Mazzi]";
		mes "hmmm hmmm hmmm.";
		mes "Making delicious sweets - yummy yummy yummy.";
		mes "Yummy yummy yummy yummy!";
		next;
		menu "Um",-;
		mes "[Mazzi]";
		mes "Oh, are you a customer?";
		mes "Welcome!";
		next;
		mes "-I gave Mazzi the order form I received from Misery-";
		next;
		emotion 11;
		mes "[Mazzi]";
		mes "Hmmm...you want me to make food to give to someone for a celebration?";
		mes "And it's challenging to make a bizarre pastry!";
		NEXT;
		mes "[Mazzi]";
		mes "But then again, eccentric pastries require special ingredients, so the first step is to gather the ingredients!";
		mes "I'm getting into it!";
		next;
		mes "[Mazzi]";
		mes "Oops, my apologies, we have received your order and please inform the person who requested it that it will take some time to create it.";
		mes "Well then, I'll take care of it.";
		next;
		menu "Understood!" ,-;
		mes "Report to ^FF0000Misery^000000 in ^FF0000 [Mission] ^000000^0000FFAldebaran^000000!";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[Mazzi]";
		mes "Hi,";
		mes strcharinfo(0) + ".";
		mes "Did you tell ^FF0000Misery^000000?";
		next;
		menu "I'm not there yet." ,-;
		mes "[Mazzi]";
		mes "I see.";
		mes "Well, I'll take care of it, then.";
		next;
		mes "Let's report to ^FF0000Misery^000000, who is in ^FF0000 [Mission] ^0000FFAldebaran^000000!";
		close;
	}
L_QUEST03:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[Mazzi]";
		mes "Mmmmmmmmmm.";
		mes "Making delicious sweets - yummy yummy yummy.";
		mes "Yummy yummy yummy yummy!";
		next;
		menu "Um",-;
		mes "[Mazzi]";
		mes "Oh, you're the one from the other day, aren't you?";
		next;
		menu "I was able to do the request.",-;
		mes "[Mazzi]";
		mes "Oh!";
		mes "It's a small world that you are undertaking this project!";
		mes "As for the request, it's to gather ingredients for the sweets that Misery asked me to make last time.";
		next;
		emotion 11;
		mes "[Mazzi]";
		mes "I have a lot of orders and I just couldn't go and get them myself, you know?";
		mes "I really wanted to go get it myself. ......";
		mes "But you're in good hands!";
		next;
		mes "[Mazzi]";
		mes "Uh, I need this leaf from the tree that grows in ^0000FFLighthalzen^000000.";
		mes "I would like to ask for this.";
		mes "Oops, I'll put down on paper which part of town.";
		mes "Thank you very much then.";
		next;
		menu "Leave it to me!" ,-;
		mes "^FF0000 [Mission] ^000000^0000FFLighthalzen^000000 get leaves from a tree that grows in ^000000.";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[Mazzi]";
		mes "Oh, you're early.";
		mes "You've already taken it!";
		next;
		menu "Not yet.",-;
		mes "[Mazzi]";
		mes "I didn't think so.";
		mes "I'll take care of it, then.";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFLighthalzen^000000 get some leaves from a tree that grows in ^000000.";
		close;
	case 3:
		mes "[Mazzi]";
		mes "Mmmmmmmmmm.";
		next;
		menu "Mr. Mazzi?" ,-;
		mes "[Mazzi]";
		mes "Make delicious pastries~";
		next;
		menu "I got the leaves!!!!" ,-;
		emotion 23;
		mes "[Mazzi]";
		mes "!!!?!!!!! ............";
		next;
		mes "[Mazzi]";
		mes "Oh my god, I'm so surprised ......";
		mes "My heart is still racing.";
		next;
		mes "[Mazzi]";
		mes "Woah, you brought me some weed!";
		mes "Thank you!";
		mes "I certainly received it.";
		next;
		mes "^FF0000 [request fulfilled] ^000000 request fulfilled!";
		mes "Let's go report to the Adventurers Academy.";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Mazzi]";
		mes "I may have to ask you again, but I'd appreciate it then.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	}
L_QUEST04:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[Mazzi]";
		mes "Melt-in-your-mouth goodness!";
		mes "Your mouth might be a little numb...";
		mes "Mmmmmmmm.";
		next;
		menu "Hello",-;
		mes "[Mazzi]";
		mes "Oh!";
		mes ""+strcharinfo(0) + "After all" + strcharinfo(0) + "has come!";
		next;
		mes "[Mazzi]";
		mes "This request is also about gathering materials, though.";
		mes "Well, the last time I did this, I found out that I couldn't make something complete with just leaves.";
		next;
		emotion 11;
		mes "[Mazzi]";
		mes "Uh, the next ingredient is ......";
		mes "I need you to get me ^0000FFEinbroch^000000 Mud Pit!";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "What! ?Mud Pit? ......?";
		next;
		mes "[Mazzi]";
		mes "Oh yeah, Mud Pit.";
		mes "Nice to meet you!";
		mes "Oh, here's the container.";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "Leave it to me!";
		mes " (But what is Mud Pit used for? ......)";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFEinbroch^000000 get the mud from the ditch.";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[Mazzi]";
		mes "Oh, you're early.";
		mes "You've already taken it!";
		next;
		menu "Not yet.",-;
		mes "[Mazzi]";
		mes "I didn't think so.";
		mes "I'll take care of it, then.";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFEinbroch^000000 to get the mud in the ditch.";
		close;
	case 3:
		mes "[Mazzi]";
		mes "It may be poisonous to some people who eat it - ummmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm!";
		mes "It's delicious!";
		next;
		menu "I took the Mud Pit." ,-;
		mes "[Mazzi]";
		mes "Oh, thanks for your help!";
		mes "This, this, this is the color.";
		next;
		menu "What is this mud used for?" ,-;
		mes "[Mazzi]";
		mes "hmm?";
		mes "What do you mean, of course it's an ingredient for sweets!";
		mes "How to use it is a secret, though.";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "Yes, that's right.";
		mes "Pardon me.";
		mes " (I bet the person who ate this candy is in trouble ......)";
		next;
		mes "[Mazzi]";
		mes "No, no, thank you again for your help.";
		mes "I'll be happy to help you again if you need anything else.";
		if('@novoce){
			mes "Also, take this with you.";
			mes "Take good care of it, it's an item you can't buy in the store!";
		}
		next;
		if('@novoce){
			if(!checkweight(568,20)){
				mes "-overweight! -";
				close;
			}
			getitem 568,20;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";//hyphenated
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Mazzi]";
		mes "I may have to ask you again, but I'd appreciate it then.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy."; //without hyphen
		close;
	}
L_QUEST05:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[Mazzi]";
		mes "Hey!";
		mes "Making pastries is fun.";
		mes "It's fun!";
		next;
		menu "Hello",-;
		mes "[Mazzi]";
		mes ""+strcharinfo(0) + "Thank you for everything!";
		mes "I'm gathering materials again this time.";
		next;
		emotion 11;
		mes "[Mazzi]";
		mes "The material I want to request this time is the ore that can be obtained at ^0000FFEinbech^000000.";
		mes "I would like you to get it for me.";
		next;
		emotion 4,"";
		mes "[" + strcharinfo(0) + "]";
		mes "ore ......";
		mes "(another weird material ......)";
		next;
		mes "[Mazzi]";
		mes "I have a friend of mine in ^0000FFEinbech^000000 named ^FF0000Dordoi^000000, please get me one ore from him.";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "(I wonder if they use it for ovens or something ......)";
		next;
		menu "Wow, okay",-;
		mes "^FF0000 [Mission] ^000000^000000DFEinbech^000000 get ore from ^FF0000Dordoi^000000 who is in ^FF0000DFEinbech^000000.";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[Mazzi]";
		mes "Oh, you're early.";
		mes "You've already taken it!";
		next;
		menu "Not yet.",-;
		mes "[Mazzi]";
		mes "I didn't think so.";
		mes "I'll take care of it, then.";
		next;
		mes "I'm going to get some ore from ^FF0000Dordoi^000000 in ^FF0000 [Mission] ^000000^0000FFEinbech^000000.";
		close;
	case 3:
		mes "[Mazzi]";
		mes "Zunchatcher Zunchatcher Zunchatcher fresh cream mixed with ~mud~.";
		next;
		menu "I have brought the ore",-;
		mes "[Mazzi]";
		mes "As expected,";
		mes strcharinfo(0) + "";
		mes "You work really fast.";
		next;
		mes "[Mazzi]";
		mes "Hmmm, good ore.";
		mes "This should make for even better pastries.";
		mes "Thanks! Please let me know if you need anything else!";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Mazzi]";
		mes "I may have to ask you again, but I'd appreciate it then.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	}
L_QUEST06:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[Mazzi]";
		mes "O-kaa-shii!";
		mes "Sweetsooooo!!!!";
		next;
		menu "Oh, that ......",-;
		mes "[Mazzi]";
		mes "!";
		mes "Oh, I've been waiting for you!";
		mes "This time I want you to go to Bylan Island to get seaweed.";
		next;
		EMOTION 11;
		mes "[Mazzi]";
		mes "There is a person named Noriba on the island of Bylan, and I want you to go and get some seaweed from him.";
		next;
		emotion 4,"";
		mes "[" + strcharinfo(0) + "]";
		mes "That's seaweed.";
		mes "I understand!";
		mes "(A little more decent material this time)";
		next;
		mes "[Mazzi]";
		mes "Take care of it then!";
		next;
		menu "Wow, okay",-;
		mes "^FF0000 [Mission] ^000000^000000^0000FF I'll get some seaweed from Mr. ^FF0000Noriba^000000 on Byran Island^000000.";
		mes " -You can get to Bylan Island from ^0000FFIzlude^000000-";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
	case 3:
	//The line when returning without finishing Noriba's query has not been investigated yet.
	case 4:
		mes "[Mazzi]";
		mes "Oh, you're early.";
		mes "You already took it!";
		next;
		menu "Not yet.",-;
		mes "[Mazzi]";
		mes "I didn't think so.";
		mes "I'll take care of it, then.";
		next;
		mes "^FF0000 [Mission] ^000000^000000^0000FF I'll get some seaweed from Mr. ^FF0000Noriba^000000 on Byran Island^000000.";
		mes " -You can get to Bylan Island from ^0000FFIzlude^000000-";
		close;
	case 5:
		mes "[Mazzi]";
		mes "Mud mixed cream and ore are a perfect match~!";
		mes "Maze maze!";
		mes "Making cakes is fun~Hey!";
		mes "And seaweed ~~.";
		next;
		menu "I've got some seaweed for you.",-;
		mes "[Mazzi]";
		mes "Oh!";
		mes "Seaweed!";
		mes "I was just about to use that!";
		mes "Good timing indeed!";
		next;
		mes "[Mazzi]";
		mes "It's looking good.";
		mes "The ultimate pastry is nearing completion!";
		mes ""+strcharinfo(0) + "!";
		mes "Thank you again for your help.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Mazzi]";
		mes "I may have to ask you again, but I'd appreciate it then.";
		next;
		mes "^FF0000 [request accomplished] ^000000 request accomplished!";
		mes "Let's go report to the Adventurers Academy.";
		close;
	}
L_QUEST07:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[Mazzi]";
		mes "Yeaaah!";
		mes "Mix the sweets with the mixed seaweed.";
		next;
		menu "Hello!" ,-;
		mes "[Mazzi]";
		mes "Oops, you're going to accept my request again, aren't you?";
		next;
		menu "Yes, it is.",-;
		EMOTION 11;
		mes "[Mazzi]";
		mes "This time it's water, water!";
		mes "But it's not just water.";
		mes "Deep sea water I want this.";
		mes "There is a girl named ^0000FFAirin^000000 on the island ^0000FF near the wreck ^0000FF, so please get it from her.";
		next;
		mes "[Mazzi]";
		mes "Then please take care of her!";
		next;
		menu "Leave it to me!" ,-;
		mes "^FF0000 [Mission] ^000000 I will get deep ocean water from ^0000FFAirin^000000 who is on the island ^FF0000 near the sunken ship^000000.";
		mes " -The island near the wreck can be reached from ^0000FFAlberta^000000-";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
	case 3:
		mes "[Mazzi]";
		mes "Oh, you're early.";
		mes "You've already taken it!";
		next;
		menu "Not yet.",-;
		mes "[Mazzi]";
		mes "I didn't think so.";
		mes "I'll take care of it, then.";
		next;
		mes "^FF0000 [Mission] ^000000^000000^0000FF I'll get some deep ocean water from Mr. ^FF0000Airin^000000 on the island ^000000 near the sunken ship.";
		mes " -The island near the wreck can be reached from ^0000FFAlberta^000000-";
		close;
	case 4:
		mes "[Mazzi]";
		mes "I see you brought deep sea water!";
		mes "Oh no, I'm really grateful.";
		next;
		mes "[Mazzi]";
		mes "I'll make this as soon as possible and continue baking.";
		if('@novoce){
			mes "Oh, here's a leftover, but here you go";
		}
		next;
		if('@novoce){
			if(!checkweight(579,50)){
				mes "-overweight! -";
				close;
			}
			getitem 579,50;
		}
		mes "^FF0000 [request fulfilled]^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Mazzi]";
		mes "I may have to ask you again, but I'd appreciate it then.";
		next;
		mes "^FF0000 [request fulfilled] ^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[Mazzi]";
		mes ""+strcharinfo(0) + "It's the moment of the century!";
		mes "The ultimate confection is about to be completed!";
		next;
		set '@dummy,("Oh!");
		misceffect 12;
		mes "[Mazzi]";
		mes "Now for the final touches!";
		next;
		emotion 28;
		mes "[Mazzi]";
		mes "It's finished!";
		mes "A wonderful pastry has been completed.";
		mes "Now, please deliver this to ^FF0000Misery^000000!";
		mes "And please don't forget to pick up the bill for the rest of the day.";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFAldebaran^000000 to deliver sweets to ^FF0000Misery^000000 who is in ^0000FFAldebaran^000000.";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[Mazzi]";
		mes ""+strcharinfo(0) + "Please deliver quickly!";
		next;
		mes "^FF0000[Mission] ^000000^0000FFAldebaran^000000 deliver sweets to Mr. ^FF0000Misery^000000 in ^FF0000.";
		close;
	case 3:
		mes "[Mazzi]";
		mes ""+strcharinfo(0) + "Welcome back.";
		next;
		menu "Give you a bill",-;
		mes "[Mazzi]";
		mes "Thank you.";
		mes ""+strcharinfo(0) + "Thank you for all your help.";
		mes "Thank you so much!";
		next;
		mes "^FF0000 [request fulfilled] ^000000- request fulfilled!";
		mes "Let's go report to the Adventurers Academy-";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[Mazzi]";
		mes "I may have to ask you again, but I'd appreciate it then.";
		next;
		mes "^FF0000 [request fulfilled] ^000000-you fulfilled the request!";
		mes "Let's go report to the Adventurers Academy-";
		close;
	}
L_OTHER:
	mes "[Mazzi]";
	mes "Mmmmmmmmmm.";
	mes "Making delicious sweets - yummy yummy yummy.";
	mes "Yummy yummy yummy yummy!";
	close;
}
//---------------------------------------------------------------
lighthalzen.gat,51,161,0	script	tree#AC_QUE02	111,{
	mes "-There are many leaves on the tree-";
	if(AC_QUEST_LV_2==2 && (AC_QUEST_ST_2==2 || AC_QUEST_ST_2==3)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "Is this leaf enough?";
		mes "Let's take one for now.";
		next;
		mes "-I took one leaf from the tree-";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFYuno^000000's ^FF0000Mazzi^000000 delivers a leaf.";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "We've got the leaves, let's get them to ^FF0000Mazzi^000000 as soon as possible.";
		next;
		mes "Deliver the leaves to ^FF0000Mazzi^000000 of ^FF0000 [Mission] ^0000FFYuno^000000.";
		close;
	}
}
einbroch.gat,111,261,0	script	Mud Pit#AC_QUE02	111,{
	mes "-The mud is packed tightly in the ditch-";
	if(AC_QUEST_LV_2==3 && (AC_QUEST_ST_2==2 || AC_QUEST_ST_2==3)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "I wonder if this is really an ingredient for sweets ......";
		mes "It smells awesome by the way ......";
		next;
		mes "-Mud Pit in a container-";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFYuno^000000's ^FF0000Mazzi^000000 delivers the mud.";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "We've got the mud, let's get it to Mr. ^FF0000Mazzi^000000 as soon as possible,";
		next;
		//reading as per the main mackerel
		mes "^FF0000 [Mission] ^000000^0000FFYuno^000000's ^FF0000Mazzi^000000's ^FF0000Mazzi^000000 delivers leaves.";
		close;
	}
}
einbech.gat,130,247,3	script	Dordoi#AC_QUE02	848,{
	mes "[Dordoi]";
	mes "Sorry, I'm at work, could you not talk to me?";
	if(AC_QUEST_LV_2==4 && (AC_QUEST_ST_2==2 || AC_QUEST_ST_2==3)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 2:
		menu "Mazzi requested ......",-;
		mes "[Dordoi]";
		mes "Oh, you know that guy...";
		mes "And that guy is what?";
		next;
		menu "Explain how it happened.",-;
		mes "[Dordoi]";
		mes "I see, you need ore ......";
		mes "Hola, I'll give you one.";
		next;
		mes "[Dordoi]";
		mes "Speaking of which, I've always wondered what that guy uses the ore for in his baking.";
		mes "Do you know?";
		mes "I asked him and he wouldn't tell me!";
		next;
		menu "No. ......",-;
		mes "[Dordoi]";
		mes "Hmmm, still ......";
		mes "I asked, but they won't tell me.";
		mes "Well, okay.";
		mes "Well, I'm going back to work.";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFYuno^000000's ^FF0000Mazzi^000000 delivers ore to Mr. Mazzi^000000.";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[Dordoi]";
		mes "Hmm, you're still here.";
		mes "Don't you have to deliver it quickly?";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFYuno^000000's ^FF0000Mazzi^000000 delivers ore to Mr. Mazzi^000000.";
		close;
	}
}
izlu2dun.gat,136,50,4	script	Noriba#AC_QUE02	88,{
	if(AC_QUEST_LV_2!=5 || AC_QUEST_ST_2<2 || AC_QUEST_ST_2>5) goto L_OTHER;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[Noriba]";
		mes "Hmm, I'm in trouble, trouble.";
		next;
		menu "Seaweed please!" ,-;
		mes "[Noriba]";
		mes "hmm?";
		mes "Sorry, but that's not what I'm here for. ......";
		mes "I dropped my wallet.";
		next;
		menu "I'll explain how it happened.",-;
		mes "[Noriba]";
		mes "So that's what happened. ......";
		mes "Okay!";
		mes "Well, why don't you go look for my wallet while I get the seaweed?";
		mes "I think by the time you find your wallet, the seaweed will be removed.";
		next;
		menu "Okay!" ,-;
		mes "[Noriba]";
		mes "Thank you!";
		mes "Well, I think I probably dropped it up north. ......";
		mes "I'm asking you to take care of it for me.";
		close2;
		set AC_QUEST_ST_2,3;
		viewpoint 1,58,165,32,0xFF9900;
		///It was a separate ID, so I'll just go ahead and make it appropriate.
		end;
	case 3:
		mes "[Noriba]";
		mes "Wallet, please!";
		mes "I'm picking seaweed.";
		close2;
		viewpoint 1,58,165,32,0xFF9900;
		end;
	case 4:
		mes "[Noriba]";
		mes "Oh, that's it!";
		mes "Isn't that my wallet!";
		mes "I'm so glad you found it!";
		mes "Thank you!";
		next;
		mes "[Noriba]";
		mes "Oops, here's the promised seaweed!";
		mes "It's fresh off the rack, so it's fresh!";
		mes "Get it to me right away!";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFYuno^000000's ^FF0000Mazzi^000000 delivers seaweed.";
		close2;
		set AC_QUEST_ST_2,5;
		end;
	case 5:
		mes "[Noriba]";
		mes "Thanks for finding my wallet.";
		next;
		mes "Deliver seaweed to ^FF0000Mazzi^000000 of ^FF0000 [Mission] ^0000FFYuno^000000.";
		close;
	}
L_OTHER:
	mes "[" + strcharinfo(0) + "]";
	mes "Looks busy.";
	mes "Let's not talk to him.";
	close;
}
izlu2dun.gat,58,165,0	script	Lost Property#AC_QUE02	111,{
	mes "-something that looks like a wallet is down-";
	if(AC_QUEST_LV_2==5 && (AC_QUEST_ST_2==3 || AC_QUEST_ST_2==4)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "Is this what ^FF0000Noriba^000000 was looking for?";
		mes "Let's deliver it anyway.";
		next;
	case 4:
		mes "Deliver the wallet to ^FF0000Noriba^000000 who is in ^FF0000 [Mission] ^0000FF Southeast^000000.";
		close2;
		set AC_QUEST_ST_2,4;
		viewpoint 1,136,50,12,0xFF9900;
		end;
	}
}
alb2trea.gat,105,95,4	script	Airin#AC_QUE02	96,{
	if(AC_QUEST_LV_2!=6 || AC_QUEST_ST_2<2 || AC_QUEST_ST_2>4) goto L_OTHER;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[Airin]";
		mes "Hello!";
		mes "Can I help you?";
		next;
		menu "Explain the situation",-;
		mes "[Airin]";
		mes "I see that ^FF0000Mazzi^000000 asked you to do this.";
		mes "You can give it to him.";
		mes "But on one condition!";
		NEXT;
		menu "What are the conditions?" ,-;
		mes "[Airin]";
		mes "My throat is so dry.";
		mes "So I need you to buy one ^FF0000 red potion^000000 from ^0000FF the tool merchant^000000 on this island and bring it to me.";
		next;
		menu "Okay!" ,-;
		mes "[Airin]";
		mes "You're so sensible!";
		mes "I'll be waiting here as soon as I can.";
		next;
		mes "^FF0000 [Mission] ^000000 buy one ^FF0000 red potion ^000000 from the tool merchant and give it to Airin.";
		close2;
		set AC_QUEST_ST_2,3;
		viewpoint 1,87,65,32,0xFF9900;
		end;
	case 3:
		if(countitem(501)==0){///not examined
			mes "[Airin]";
			mes "My throat is so dry.";
			mes "I'll be here waiting for you as soon as I can -";
			next;
			mes "^FF0000 [Mission] ^000000 buy one ^FF0000 red potion ^000000 from the tool merchant and give it to Airin.";
			close2;
			viewpoint 1,87,65,32,0xFF9900;
			end;
		}
		set AC_QUEST_ST_2,4;
		delitem 501,1;
		mes "[Airin]";
		mes "Thank you.";
		mes "Looks like you brought it!";
		mes "I'll take it right away!";
		next;
		mes "-gulp gulp Airin gulped down the red potion-";
		next;
		mes "This is what you promised!";
		mes "It's precious, so be careful bringing it back.";
		next;
		mes "^FF0000 [Mission] ^000000^0000FFYuno^000000's ^FF0000Mazzi^000000 delivers deep sea water.";
		close;
	case 4:
		mes "[Airin]";
		mes "Deliver it to him as soon as possible.";
		next;
		mes "Deliver deep ocean water to ^FF0000Mazzi^000000 of ^FF0000 [Mission] ^0000FFYuno^000000.";
		close;
	}
L_OTHER:
	mes "[Airin]";
	mes "......";
	close;
}
