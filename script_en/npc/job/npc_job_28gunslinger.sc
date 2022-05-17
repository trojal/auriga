//= Athena Script ==============================================================
// Ragnarok Online Gunslinger Jobchange Script by Blaze
//= Registry ===================================================================
// CHANGE_GS -> 0-5
//==============================================================================

//============================================================
// Shop
//------------------------------------------------------------
que_ng.gat,179,91,3 shop Arms dealer, Sivas 900,13150,13102,13151,13154,13155,13163,13165,13168
que_ng.gat,180,79,3 shop Arms dealer, Wico 900,13200,13201,13202
alberta.gat,176,81,3 shop Trade merchant 900,13200,13201,13202,13150,13102,13151,13154,13155,13163,13165,13168

//============================================================
// Application for Examination
//------------------------------------------------------------
que_ng.gat,152,167,3 script master mirror 901,{
	if(Job == Job_Gunslinger) {
		mes "[master mirror]";
		mes "It's been a while." ;
		mes "You've got to take good care of that gun." ;
		next;
		mes "[Master Miller]";
		mes "Yes, I do." ;
		mes "If you're a Gunslinger, you should visit the Adventurer's Academy." ;
		next;
		mes "[Master Mirror]";
		mes "When you leave this building, there will be someone providing support at the Adventurer's Academy, so you can ask them to send you there." ;
		close;
	}
	if(Upper == Upper_BABY) {
		mes "[Master Mirror]";
		mes "...... Why is the child here ......?" ;
		next;
		mes "[master mirror]";
		mes "Go home to your mother." ;
		mes "It's not safe here." ;
		close;
	}
	if(Job ! = Job_Novice || Upper == Upper_HIGH) {
		mes "[Master Mirror]";
		mes "Don't make eye contact with me." ;
		mes "This is not a store." ;
		close;
	}
	switch(CHANGE_GS) {
	case 0:
		if(getskilllv(1) < 9) {
			mes "[master mirror]";
			mes "hmm ......" ;
			mes "If my eyes are right, you have plenty of potential." ;
			mes "But there seems to be something missing." ;
			next;
			mes "[Master Mirror]";
			mes "Grow your JobLv to 10, and bring your ^0000FF "Basic Skills" level to 9 ^000000." ;
			mes "The level of ^0000FF "Basic Skills" ^000000 can be raised in the ^0000FF "Skill List" ^000000 window." ;
			next;
			mes "[Master Mirror]";
			mes "The ^0000FF 'Skill List' ^000000 window is displayed by the ^0000FF 'Skill' ^000000 button in the ^0000FF 'Basic Info' ^000000 window." ;
			next;
			mes "[Master Mirror]";
			mes "To increase the level of a skill, the ^FF000000 'Confirm' ^000000 button is required after assigning the skill points." ;
			mes "Be Attentive." ;
			next;
			mes "[Master Mirror]";
			mes "You may come back again when you have made further efforts and improved your basic skills." ;
			close2;
			cutin "start_020_jp.bmp",4;
			end;
		}
		mes "[Master Mirror]";
		mes "I am Master Miller, Chief of Security for Miss Serlena and Gunslinger Training Instructor." ;
		next;
		mes "[Master Miller]";
		mes "What is your reason for calling on me here, who cannot waste a single moment?" ;
		next;
		if(select("separately ......" I want to be a Gunslinger")==1) {
			mes "[master mirror]";
			mes "What a waste of my precious time ......" ;
			mes "Now get out of my presence." ;
			close;
		}
		mes "[master mirror]";
		mes "Hoho ......" ;
		mes "He's still young, but he's got a pretty good eye." ;
		next;
		mes "[master mirror]";
		mes "Hmmm ...... Very well." ;
		mes "If you really want to be a Gunslinger, you need a simple procedure first." ;
		mes "Then there is an interview and education." ;
		next;
		mes "[Master Miller]";
		mes "Are you ready for that?" ;
		next;
		if(select("I'll give it some thought.", "Yes")==1) {
			mes "[master mirror]";
			mes "MU...... I see." ;
			mes "But this profession can only be served by a prudent man." ;
			mes "You can come back when you have made up your mind." ;
			close;
		}
		mes "[master mirror]";
		mes "Very well." ;
		mes "Then take this letter and visit Master Fansopulu in Payon." ;
		next;
		mes "[Master Miller]";
		mes "He will judge whether you are worthy of being a Gunslinger." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Yes!  I understand." ;
		set CHANGE_GS,1;
		setquest 6020;
		close;
	case 1:
		mes "[master mirror]";
		mes "Go quickly." ;
		mes "Master Fansopur is in Payon." ;
		close;
	case 2:
		mes "[Master Miller]";
		mes "Master Fansopulu is with the material of the mark?" ;
		mes "............" ;
		next;
		mes "[Master Mirror]";
		mes "It appears that Master Fansopulu has taken a liking to you." ;
		close;
	case 3:
		mes "[master mirror]";
		mes "Did he ask you for a favor?" ;
		mes "I hear Master Fansopur likes you very much." ;
		close;
	case 4:
		mes "[Master Miller]";
		mes "I have high hopes for you." ;
		mes "You should go to Master Fansopulu as soon as possible." ;
		close;
	case 5:
		mes "[Master Miller]";
		mes "You have received a sign from Master Fansopulu." ;
		mes "...... It's been a really long time." ;
		mes "I don't usually get marks that easily." ;
		next;
		mes "[master mirror]";
		mes "Okay, fine." ;
		mes "If Master Fansopulu allows it, there is no reason for me to refuse." ;
		next;
		mes "[Master Miller]";
		mes "Then I appoint you as Gunslinger." ;
		mes "But first, let me give you an important explanation about Gunslinger." ;
		next;
		mes "[Master Mirror]";
		mes "The purchase of weapons and live ammunition is done through the Gunslinger guild officials in various locations." ;
		next;
		mes "[Master Miller]";
		mes "I know this sounds like a hassle, but this is a procedure to prevent these weapons from being misused and falling into the wrong hands." ;
		mes "You must understand." ;
		next;
		mes "[Master Mirror]";
		mes "There are many other reasons." ;
		mes "But all of these provisions are dictated by the Lady Serlena, who is in charge of this guild, whom you will meet at some point." ;
		next;
		mes "[Master Mirror]";
		mes "When the time comes, you will understand the will of the Lady, along with the duties that will be given to you." ;
		next;
		mes "[Master Miller]";
		mes "[Master Mirror]"; mes "Well, it is time for me to take care of something else." ;
		mes "May the blessings of the earth be with you, and I bestow upon you this weapon and the Book of Gunslinger, the instruction manual of Gunslinger." ;
		unequip;
		jobchange Job_Gunslinger;
		set CHANGE_GS,0;
		chgquest 6024,50550;
		getitem 11049,1;
		getitem 13100,1;
		getitem 12149,5;
		close;
	}
OnInit:
	waitingroom "job change",0;
	end;
}

//============================================================
// Job change test
//------------------------------------------------------------
payon.gat,184,65,3 script fansopul 866,{
	if(Job == Job_Gunslinger) {
		mes "[FANSOPLE]";
		mes "Mm ...... Long time no see." ;
		mes "Be a wise beast." ;
		close;
	}
	switch(CHANGE_GS) {
	case 0:
		mes "[FANSOPLE]";
		mes "guu ...... guu guu ......" ;
		close;
	case 1:
		mes "[fansopul]";
		mes "...... n ......" ;
		mes "...... Here comes the young wolf: ......" ;
		mes "What do you want from me?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "I was referred here by Mr. Miller." ;
		next;
		mes "[fansopple]";
		mes "Miller ......" ;
		mes "...... Ah, you're here because of the black fox referral ......" ;
		next;
		mes "[Fansopulu]";
		mes "He's a nice guy ......." ;
		mes "He is willing to risk his life for his friends, and he has a righteous heart." ;
		next;
		mes "[Fansopulu]";
		mes "If you introduce him, you can get a general idea of what he's about: ......." ;
		next;
		mes "[fansopul]"; mes "[fansopul]"; mes "[fansopul]"; mes "[fansopul]
		mes "Come on, ...... Come over here a little more ......." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "............" ;
		next;
		mes "[fansopple]"; mes "[" +strcharinfo(0) + "]"; next; next; next
		mes "ん......" ;
		mes "うんうん......" ;
		next;
		mes "[fansopple]";
		mes "...... Clean eyes and a good heart ...... And a sense of responsibility to protect what's important to you ......" ;
		mes "But ...... I am young......" ;
		next;
		mes "[Fansopul]";
		mes "still lacks experience ......" ;
		mes "I can't get the blessing of the wilderness and the earth ......" ;
		mes "So I will make you a sign of the earth to replace you." ;
		next;
		mes "[Fansopulu]";
		mes "Bring me three brilliant bug skins, one wood chip, ten hard skins, three soft hairs, three jargon, and three green herbs." ;
		next;
		mes "[Fansopur]";
		mes "Show the black fox the mark of the earth made from them, and your wish will be granted." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-Let's go get 3 brilliant bug skins, 1 wood chip, 10 hard skins, 3 soft hairs, 3 jargon, 3 green herbs-";
		set CHANGE_GS,2;
		chgquest 6020,6021;
		close;
	case 2:
		if(countitem(1013) < 3 || countitem(1019) < 1 || countitem(935) < 10 || countitem(949) < 3 || countitem(912) < 3 || countitem(511) < 3) {
			mes "[" +strcharinfo(0)+ "]";
			mes "-Let's go get 3 brilliant bug skins, 1 wood chip, 10 hard skins, 3 soft hairs, 3 jargon, 3 green herbs-";
			close;
		}
		mes "[fansople]";
		mes "n...... I'm surprised you brought it." ;
		mes "It will take some time to make your mark." ;
		mes "Wait a while." ;
		set CHANGE_GS,3;
		chgquest 6021,6022;
		delitem 1013,3;
		delitem 1019,1;
		delitem 935,10;
		delitem 949,3;
		delitem 912,3;
		delitem 511,3;
		close;
	case 3:
		mes "[fansopul]";
		mes "nn...... Just in time." ;
		mes "Just about ready." ;
		mes "It's a simple sign, but ......." ;
		mes "Long time no see ......." ;
		next;
		mes "[Fansopulu]";
		mes "It's been decades since I started making marks. ......" ;
		mes "There was a time when I too, as a warrior of the earth, fought with such a mark ......" ;
		next;
		mes "[Fansopulu]";
		mes "It seems like only a long time ago that I met Selrena's father ......" ;
		mes "Really ...... Time flies by like the wind in the sky. ......" ;
		next;
		mes "[Fansopul]";
		mes "A lot has happened, but ......" ;
		mes "Serlena and the Black Fox, who will carry on and cherish the will that the eagle has protected." ;
		mes "And I am grateful to the many young people ......." ;
		next;
		mes "[Fansopulu]";
		mes "I am old and have no more strength." ;
		mes "The day will come when I will return to the earth. ......" ;
		next;
		mes "[Fansopulu]";
		mes "...... Phew." ;
		mes "I'm suddenly feeling tired." ;
		mes "Sorry, but I have one last request: ......." ;
		next;
		mes "[Fansopur]";
		mes "I'm thirsty ......" ;
		mes "I need a glass of cold milk." ;
		next;
		mes "[Fansopur]";
		mes "Can't you do me a favor, Oibo?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-I'll get a bottle of milk for my grandfather-"; mes "-I'll get a bottle of milk for my grandfather-";
		set CHANGE_GS,4;
		chgquest 6022,6023;
		close;
	case 4:
		if(countitem(519) < 1) {
			mes "[" +strcharinfo(0)+ "]";
			mes "-I'll get a bottle of milk for your grandfather-";
			close;
		}
		set CHANGE_GS,5;
		chgquest 6023,6024;
		delitem 519,1;
		mes "[Fansopul]";
		mes "Thank you." ;
		mes "You really are a young man with a beautiful heart." ;
		next;
		mes "[Fansopul]";
		mes "Here." ;
		mes "This is the mark I made." ;
		mes "Show this to the black fox and you will become a Gunslinger." ;
		next;
	case 5:
		mes "[Fansopulu]";
		
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "-The grandfather suddenly sang a song-"; next; mes "[" + strcharinfo(0) + "]"; next
		mes "-It's kind of strange, even though there are no lyrics-"; mes "[" + strcharinfo(0) + "]"; mes "
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "-Now, let's go show Mr. Miller the mark we received-";
		close;
	}
}

//============================================================
// bullet shop
//------------------------------------------------------------
- script SphereShop 86,{
	if(Job ! = Job_Gunslinger) {
		mes "[Tony]";
		mes "I'm Tony, the bullet shop that supplies items to Gunslinger." ;
		next;
		mes "[Tony]";
		mes "You're not a Gunslinger, so go ahead and look around as you see fit." ;
		close;
	}
	mes "[Tony]";
	mes "I'm Tony the Bullet Shop!" ;
	mes "If you're short on bullets, come by anytime!" ;
	next;
	mes "[Tony]";
	mes "Come on, my friend, my fellow!" ;
	mes "What's missing!" ;
	next;
	switch(select("Poison Sphere", "Fire Sphere", "Wind Sphere", "Dark Sphere", "Ice Sphere", "Quit")) {
	case 1: //poison sphere - poison fang 10
		set '@itemid,13205;
		set '@need,937;
		set '@amount,10;
		break;
	case 2: //fire sphere - burning heart 2
		set '@itemid,13203;
		set '@need,7097;
		set '@amount,2;
		break;
	case 3: //windsphere - cypher 3
		set '@itemid,13204;
		set '@need,7053;
		set '@amount,3;
		break;
	case 4: //darksphere - inksphere5
		set '@itemid,13206;
		set '@need,1024;
		set '@amount,5;
		break;
	case 5: //ice sphere - brigand2
		set '@itemid,13207;
		set '@need,7054;
		set '@amount,2;
		break;
	case 6:
		mes "[Tony]";
		mes "I see." ;
		mes "Come back and see me." ;
		mes "Tony the Bullet Shop is always here, man!" ;
		close;
	}
	mes "[Tony]";
	mes "1 Phracon, 1 Emveretarcon, ";
	mes getitemname('@need)+'@amount+ "by";
	mes ""+getitemname('@itemid)+ "I'm exchanging 30 pieces as a set." ;
	next;
	mes "[Tony]";
	mes "How many sets do you want?" ;
	mes "You can trade up to 500 sets at a time." ;
	mes "If you want to stop trading, I'll give you 0." ;
	next;
	input '@num;
	if('@num <= 0 || '@num > 500) {
		mes "[Tony]";
		mes "OK, deal's off." ;
		close;
	}
	if(countitem(1010) < 1*'@num || countitem(1011) < 1*'@num || countitem('@need) < '@amount*'@num) {
		mes "[Tony]";
		mes "Hey, hey." ;
		mes "I think you're missing some ingredients." ;
		mes "Let's make sure we're doing the deal right." ;
		close;
	}
	delitem 1010,'@num;
	delitem 1011,'@num;
	delitem '@need,'@amount*'@num;
	getitem '@itemid,30*'@num;
	mes "[Tony]";
	mes "Okay, transaction complete!" ;
	mes "Come back!" ;
	close;
}

que_ng.gat,187,156,3 duplicate(SphereShop) Bullet Shop, Tony 86
izlude.gat,171,133,3 duplicate(SphereShop) Tony 86

//============================================================
// Bullet Case Shop
//------------------------------------------------------------
- script SphereCaseShop 83,{
	if(Job ! = Job_Gunslinger) {
		mes "[Kenny]";
		mes "My name is Kenny and I am trading bullets and bullet cases to Gunslinger." ;
		next;
		mes "[Kenny]";
		mes "You are not a Gunslinger and cannot handle bullets." ;
		mes "I'm sorry." ;
		close;
	}
	mes "[Kenny]";
	mes "I'm Kenny the Bullet Case Shop!" ;
	mes "If your ammo is heavy, by all means use me!" ;
	next;
	mes "[Kenny]";
	mes "The bullet case I made is an excellent way to carry bullets with ease." ;
	next;
	switch(select("windsphere case", "darksphere case", "poison sphere case", "ice sphere case", "fire sphere case", "bullet case", "blood bullet case", "silver bullet case", "quit")) {
	case 1: //windsphere case
		set '@itemid,13204;
		break;
	case 2: //darksphere case
		set '@itemid,13206;
		break;
	case 3: //poison sphere case
		set '@itemid,13205;
		break;
	case 4: //Ice Sphere case
		set '@itemid,13207;
		break;
	case 5: //fire sphere case
		set '@itemid,13203;
		break;
	case 6: //valet case
		set '@itemid,13200;
		break;
	case 7: //Blood valet case
		set '@itemid,13202;
		break;
	case 8: //silver valet case
		set '@itemid,13201;
		break;
	case 9:
		mes "[Kenny]";
		mes "Come back when you need it." ;
		close;
	}
	mes "[Kenny]";
	mes ""+getitemname(12143+@menu)+ "is";
	mes getitemname('@itemid)+ "500 rounds and";
	mes "You can exchange one for a fee of 500 Zeny." ;
	next;
	mes "[Kenny]";
	mes "Please enter the number you wish to purchase." ;
	mes "You may exchange up to 50 at a time." ;
	mes "Enter 0 to stop the exchange." ;
	next;
	input '@num;
	if('@num <= 0 || '@num > 50) {
		mes "[Kenny]";
		mes "Exchange interrupted." ;
		mes "Please come back." ;
		close;
	}
	if(countitem('@itemid) < 500*'@num) {
		mes "[Kenny]";
		mes "It looks like you're missing an item." ;
		mes "Please check it once." ;
		close;
	}
	if(Zeny < 500*'@num) {
		mes "[Kenny]";
		mes "It looks like you don't have enough money." ;
		mes "The fee is " +(500*'@num)+ "Zeny." ;
		mes "Please check it once." ;
		close;
	}
	set Zeny,Zeny-500*'@num;
	delitem '@itemid,500*'@num;
	getitem 12143+@menu,'@num;
	mes "[Kenny]";
	mes "The transaction is complete." ;
	mes "Please use us again." ;
	close;
}

que_ng.gat,187,149,3 duplicate(SphereCaseShop) bullet case shop, Kenny 83
izlude.gat,171,127,3 duplicate(SphereCaseShop) Bullet Case Shop Kenny 83

//============================================================
// Garrison Manufacturing
//- Registry -------------------------------------------------
// GUN_1QUE -> 0-5
//------------------------------------------------------------
que_ng.gat,182,85,3 script garrison 109,{
	if(Job ! = Job_Gunslinger) {
		mes "[Garrison]";
		mes "You are not a Gunslinger, are you?" ;
		mes "I don't think you have any use for me?" ;
		close;
	}
	if(BaseLevel < 55) {
		mes "[Garrison]";
		mes "My name is Garrison." ;
		mes "And the gun I made is as perfect as I am, so I say Garrison as well." ;
		next;
		mes "[Garrison]";
		mes "Would you like to request me to make a Garrison for you?" ;
		next;
		mes "[Garrison]";
		mes "To make Garrison, you need 50 Steel, 3 Elunium, 1 Oridecon, 50 Coal, 20 Rusty Screws and 30,000 Zeny." ;
		next;
		callsub L_Routine;
	}
	switch(GUN_1QUE) {
	case 0:
		if(countitem(13104) < 1)
			break;
		mes "[GARISN]";
		mes "NON...... Are you a customer?" ;
		mes "May I help you with weapons?" ;
		next;
		switch(select("I need a garrison", "No, not really. ......" , "stop conversation")) {
		case 1:
			break;
		case 2:
			mes "[Garrison]";
			mes "Hmm." ;
			mes "There doesn't seem to be any particular mission." ;
			mes "If you have a moment, could you do me a favor?" ;
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "Yes, sir?" ;
			next;
			mes "[Garrison]";
			mes "Yes ...... In fact, I recently received a letter complaining about a defective gun I built and sold called the Six Shooter." ;
			next;
			mes "[Garrison]";
			mes "I am always striving for perfection, but with my failing eyesight, I must have inadvertently sold a defective product." ;
			next;
			mes "[Garrison]";
			mes "So, could you please go gather the materials for the six-shooter to replace that defective product?" ;
			next;
			mes "[Garrison]";
			mes "If you do what I ask, I will give you an extra slot in the Garrison you have." ;
			next;
			mes "[Garrison]";
			mes "Furthermore. When you increase the slot, you will also lose the cards and refining level you already have attached to it." ;
			mes "What do you want to do?" ;
			next;
			if(select("I don't want to", "Okay")==1) {
				mes "[Garrison]";
				mes "I see." ;
				mes "Remaining GOST, but I'll try to find someone else." ;
				close;
			}
			mes "[Garrison]";
			mes "Thank you so much." ;
			mes "So, please go gather the materials for the Six Shooter first." ;
			next;
			mes "[Garrison]";
			mes "The materials are 10 Steel, 1 Elunium, 10 Emveretarcon, 30 Coal and 10 rusty screws." ;
			mes "That's all." ;
			mes "Please do not make a mistake in the number." ;
			set GUN_1QUE,1;
			close;
		case 3:
			mes "[Garrison]";
			mes "Then please come back." ;
			close;
		}
		break;
	case 1:
		if(countitem(999) < 10 || countitem(985) < 1 || countitem(1011) < 10 || countitem(1003) < 30 || countitem(7317) < 10) {
			mes "[Garrison]";
			mes "The materials are 10 Steel, 1 Elunium, 10 Emveretarcon, 30 coal and 10 rusty screws." ;
			mes "That's all." ;
			mes "Please do not make a mistake in the number." ;
			close;
		}
		mes "[Garrison]";
		mes "Oh, that was quick." ;
		mes "Thank you so much." ;
		mes "...... I am afraid I have one more request." ;
		next;
		mes "[Garrison]";
		mes "I must deliver the goods made from those materials, but I am too much at work right now to leave this place very much." ;
		next;
		mes "[Garrison]";
		mes "I'm sorry, but could you please make the delivery for me?" ;
		next;
		mes "[Garrison]";
		mes "While you're gone, I'll be ready to make the slotted version of Garrison you promised." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-ummm ...... It's a hassle, but I'll deliver it for you-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Okay, I understand." ;
		mes "I'll take care of it for you." ;
		next;
		mes "[Garrison]";
		mes "Thank you." ;
		mes "Now, please deliver this item to a man named Rabe in the favela of Lighthalzen." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-I have received an item to be delivered from Mr. Garrison--let's deliver it to a man named Rabe in the favela of Lighthalzen."; next; mes "[" +strcharinfo(0)+ "]
		set GUN_1QUE,2;
		delitem 999,10;
		delitem 985,1;
		delitem 1011,10;
		delitem 1003,30;
		delitem 7317,10;
		close;
	case 2:
		mes "[" +strcharinfo(0)+ "]";
		mes "-I've received an item to deliver from Mr. Garrison--let's deliver it to a man named Rabe in the favela of Lighthalzen--";
		close;
	case 3:
		mes "[Garrison]";
		mes "Oh?  What's wrong?" ;
		mes "You seem to be angry." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "No problem!" ;
		mes "I was almost killed!" ;
		mes "That man attacked me as soon as he saw me!" ;
		next;
		mes "[Garrison]";
		mes "Oh ...... So that's what you mean ......." ;
		mes "Perhaps that letter is ......." ;
		mes "It is probably a trap set by assassins hired by those who are against us." ;
		next;
		mes "[Garrison]";
		mes "It has resulted in us involving you in a dangerous situation that has nothing to do with you." ;
		next;
		mes "[Garrison]";
		mes "I am truly sorry." ;
		mes "As you know, the Gunslinger Guild and the villains who are after Dr. Serlena are concocting a dastardly ruse." ;
		next;
		mes "[Garrison]";
		mes "I am truly sorry, but you can consider this time to have been an ordeal for you." ;
		mes "You are already a Gunslinger too." ;
		next;
		mes "[Garrison]";
		mes "So let's add more slots to your Garrison, as promised." ;
		next;
		if(countitem(13104) < 1) {
			mes "[Garrison]";
			mes "Oh?" ;
			mes "Do you have the garrison properly?" ;
			mes "I can only modify a garrison that has no slots." ;
			set GUN_1QUE,4;
			close;
		}
		mes "[Garrison]";
		mes "Ah ...... I wonder if you have ^FF0000 cards installed or refined ^000000 Garrisons in ^FF000000 possession ^000000?" ;
		next;
		mes "[Garrison]";
		mes "If so, you will lose both the card and the refined value level." ;
		mes "For ghost, make sure you still have only ^FF000000 Garrisons ^000000, which is not a problem." ;
		next;
		if(select("Going to check", "Check complete. Will modify immediately.")==1) {
			mes "[Garrison]";
			mes "Understood." ;
			mes "Please get confirmation enough." ;
			set GUN_1QUE,4;
			close;
		}
		mes "[Garrison]";
		mes "Yes, I was able to modify it." ;
		mes "Please take good care of it." ;
		set GUN_1QUE,5;
		delitem 13104,1;
		getitem 13105,1;
		close;
	case 4:
		if(countitem(13104) < 1) {
			mes "[Garrison]";
			mes "Oh?" ;
			mes "Do you have the garrison properly?" ;
			mes "I can only modify Garrison with a few slots." ;
			close;
		}
		mes "[Garrison]";
		mes "Ah ...... I wonder if you have ^FF0000 cards installed or refined ^000000 Garrisons ^FF000000 in your ^FF000000 possession ^000000?" ;
		next;
		mes "[Garrison]";
		mes "If so, you will lose both the card and the refined value level." ;
		mes "For ghost, make sure you still have only ^FF000000 Garrisons ^000000, which is not a problem." ;
		next;
		if(select("Going to check", "Check complete. Will modify immediately.")==1) {
			mes "[Garrison]";
			mes "Understood." ;
			mes "Please get confirmation enough." ;
			close;
		}
		mes "[Garrison]";
		mes "Yes, modifications have been made." ;
		mes "Please take good care of it." ;
		set GUN_1QUE,5;
		delitem 13104,1;
		getitem 13105,1;
		close;
	case 5:
		mes "[Garrison]";
		mes "Welcome to our home." ;
		mes "Yes, people all seek me!" ;
		mes "The weapon that bears my name, Garrison, is the best of the best!" ;
		mes "I hope you will be needing it soon?" ;
		next;
		switch(select("Garrison", "Garrison slot modification", "Stop conversation")) {
		case 1:
			mes "[Garrison]";
			mes "To make Garrison, you need 50 Steel, 3 Elunium, 1 Oridecon, 50 Coal, 20 Rusty Screws and 30,000 Zeny." ;
			mes "May I?" ;
			next;
			callsub L_Routine;
		case 2:
			mes "[Garrison]";
			mes "10 Steel, 1 Elunium, 10 Emveretarcon, 30 coal and 10 rusty screws for slot modification in Garrison." ;
			mes "The above are required." ;
			mes "May I?" ;
			next;
			switch(select("Do it again now", "Do it now", "Quit")) {
			case 1:
				mes "[Garrison]";
				mes "I see." ;
				mes "Then please think it over and get back to me." ;
				close;
			}
			if(countitem(13104) < 1 || countitem(999) < 10 || countitem(985) < 1 || countitem(1011) < 10 || countitem(1003) < 30 || countitem(7317) < 10) {
				mes "[Garrison]";
				mes "10 Steel, 1 Elunium, 10 Emveretarcon, 30 coal and 10 rusty screws for slot modification in Garrison." ;
				mes "The above are required." ;
				close;
			}
			if(MaxWeight - Weight <= 5000) {
				mes "[Garrison]";
				mes "You have a full load." ;
				mes "Please organize it once and come back again." ;
				close;
			}
			mes "[Garrison]";
			mes "Ah ...... I wonder if you have ^FF0000 cards installed or refined ^000000 Garrisons ^FF000000 in your ^FF000000 possession ^000000?" ;
			next;
			mes "[Garrison]";
			mes "If so, you will lose both the card and the refined value level." ;
			mes "For ghost, make sure you still have only ^FF000000 Garrisons ^000000, which is not a problem." ;
			next;
			if(select("Going to check", "Check complete. Will modify immediately.")==1) {
				mes "[Garrison]";
				mes "Understood." ;
				mes "Please get confirmation enough." ;
				close;
			}
			mes "[Garrison]";
			mes "Yes, modifications have been made." ;
			mes "Please take good care of it." ;
			delitem 999,10;
			delitem 985,1;
			delitem 1011,10;
			delitem 1003,30;
			delitem 7317,10;
			delitem 13104,1;
			getitem 13105,1;
			close;
		case 3:
			mes "[Garrison]";
			mes "Then we will see you again." ;
			close;
		}
	}
	mes "[Garrison]";
	mes "Ha ha ha!" ;
	mes "Welcome to our home." ;
	mes "Yes, all people seek me!" ;
	mes "The weapon that bears my name, Garrison, is the best of the best!" ;
	mes "I hope you will be needing it soon?" ;
	next;
	mes "[Garrison]";
	mes "To make Garrison, you need 50 Steel, 3 Elunium, 1 Oridecon, 50 Coal, 20 Rusty Screws and 30,000 Zeny." ;
	mes "May I?" ;
	next;
L_Routine:
	switch(select("make it again now", "make it now", "quit")) {
	case 1:
		mes "[Garrison]";
		mes "I see." ;
		mes "Then please think it over and get back to me." ;
		close;
	case 2:
		if(countitem(999) < 50 || countitem(985) < 3 || countitem(984) < 1 || countitem(1003) < 50 || countitem(7317) < 20) {
			mes "[GALLISON]";
			mes "To make Garrison, you need 50 Steel, 3 Elunium, 1 Oridecon, 50 Coal, 20 rusty screws and 30,000 Zeny." ;
			mes "Don't forget." ;
			close;
		}
		if(Zeny < 30000) {
			mes "[Garrison]";
			mes "There is not enough money." ;
			close;
		}
		if(MaxWeight - Weight <= 5000) {
			mes "[Garrison]";
			mes "You have a full load." ;
			mes "Please organize it once and come back again." ;
			close;
		}
		mes "[Garrison]";
		mes "Then come in." ;
		mes "This is Garrison." ;
		mes "Please come back if you need more." ;
		delitem 999,50;
		delitem 985,3;
		delitem 984,1;
		delitem 1003,50;
		delitem 7317,20;
		set Zeny,Zeny-30000;
		getitem 13104,1;
		close;
	case 3:
		mes "[Garrison]";
		mes "Then we will see you again." ;
		close;
	}
}

lighthalzen.gat,322,247,5 script rabe 86,{
	switch(GUN_1QUE) {
	default:
		mes "[Rabe]";
		mes "ugg......" ;
		mes "Gugg ...... Kuu......" ;
		mes "............" ;
		close;
	case 2:
		mes "[" +strcharinfo(0)+ "]";
		mes "Hello." ;
		mes "Gunslinger Guild to replace a defective item: ......" ;
		next;
		mes "[Rabe]";
		mes "Noooooo!!! Kooooooooooooo!!! Zoolaaaah!!!" ;
		set GUN_1QUE,3;
		percentheal -90,0;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-The man named Rabe attacked me out of the blue--he seemed to respond to the word Gunslinger: ...... -";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-Anyway, let's run away - and go ask Mr. Garrison what it's all about..."; next; mes "[" +strcharinfo(0)+ "]
		close;
	case 3:
		mes "[" +strcharinfo(0)+ "]";
		mes "-The man named Rabe suddenly attacked me - I think he reacted to the word Gunslinger: ...... -";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-Anyway, let's run away - and go ask Mr. Garrison what it's all about..."; next; mes "[" +strcharinfo(0)+ "]
		close;
	}
}

//============================================================
// Drifter Butcher Production
//- Registry -------------------------------------------------
// GUN_2QUE -> 0-9
//------------------------------------------------------------
que_ng.gat,149,178,4 script lab planner 744,{
	switch(GUN_2QUE) {
	case 0:
		mes "[ray]";
		mes "Oh, hello." ;
		mes "My name is Einbroch Institute planner, Ei." ;
		next;
		if(Job ! = Job_Gunslinger) {
			menu "talk to me",-;
			mes "[ray]";
			mes "If you know someone who is a Gunslinger, tell them to come here for information about a certain weapon." ;
			close;
		}
		if(BaseLevel < 56) {
			menu "talk to them",-;
			mes "[ray]";
			mes "...... continuous fire ......" ;
			mes "sustained......" ;
			mes "..... .180 or more......" ;
			next;
			mes "[ray]";
			mes "Oh, sorry." ;
			mes "I'm busy working on weapons right now." ;
			close;
		}
		if(BaseLevel >= 68)
			set '@str$, "Ask about weapon "Butcher"";
		switch(select('@str$, "Ask about weapon "Drifter"", "Stop talking")) {
		case 1:
			mes "[ray]";
			mes "Looks like you've heard the rumors." ;
			next;
			mes "[ray]";
			mes "The ^FF000000 Butcher ^000000 is a Gatling gun made with the heart and soul of our Einbroch Institute." ;
			next;
			mes "[ray]";
			mes "^FF0000Drifter^000000 is a good weapon, but I can say with confidence that the firepower of the ^FF0000Butcher^000000 is even better!" ;
			next;
			mes "[ray]";
			mes "It is called the "Butcher" because of its too strong firepower." ;
			mes "At the same time, it is a very unwieldy weapon." ;
			next;
			mes "[ray]";
			mes "Can you really master this weapon?" ;
			next;
			if(select("...... I don't know", "of course!") ==1) {
				mes "[ray]";
				mes "^FF0000 Butcher ^000000 is not such a sweet substitute that you can handle it with such a one-sided attitude." ;
				mes "Please come back when you feel more confident about yourself." ;
				close;
			}
			mes "[ray]";
			mes "You seem confident." ;
			mes "But anyone can easily have just confidence." ;
			mes "What can you prove about that confidence of yours?" ;
			next;
			mes "[ray]";
			mes "ummm ............" ;
			next;
			mes "[ay]";
			mes "Ah!" ;
			mes "I've got a good idea!" ;
			next;
			mes "[ray]";
			mes "Go gather ^FF000000 1,000 ^000000 orc claws and ^FF000000 1,000 ^000000 skeleton bones." ;
			mes "If you can collect these, I will give you ^FF000000 butchers^000000." ;
			next;
			mes "[ray]";
			mes "What do you think?" ;
			mes "You can do this much if you want to, right?" ;
			mes "I'll let you show me what you can do." ;
			mes "Hmph. ......." ;
			set GUN_2QUE,3;
			close;
		case 2:
			mes "[ray]";
			mes "Looks like you heard about ^FF0000 drifter ^000000." ;
			next;
			mes "[ray]";
			mes "The ^FF000000 Drifter^000000 is one of the best weapons that Dr. Serlena has created." ;
			mes "It is a revolving electrically powered continuous-fire gun." ;
			mes "Its rate of continuous fire is the highest of any weapon the Gunslinger can be equipped with." ;
			next;
			mes "[ray]";
			mes "Of course, skill in handling the Gatling is essential, but once you can handle the Gatling as freely as your limbs, the ^FF0000 Drifter ^000000 will be your best partner." ;
			next;
			mes "[ray]";
			mes "Would you like to try the ^FF000000 Drifter^000000?" ;
			next;
			if(select("No", "Yes")==1) {
				mes "[ray]";
				mes "Please come back whenever you plan to use it." ;
				close;
			}
			mes "[ray]";
			mes "The ^FF000000 drifter ^000000 is hard to get materials for, so we make ours by appointment system too." ;
			mes "But if you bring us the material for ^FF000000 Drifter^000000, we will make it for you right away." ;
			next;
			mes "[ray]";
			mes "I'm going to tell you the ingredients, so please take proper notes." ;
			next;
			mes "[ray]";
			mes "^FF000070 pieces of Steel, 5 pieces of Elunium, 3 pieces of Oridecon, 70 pieces of coal, 50 rusty screws. ^000000And you need ^FF000050,000Zeny^000000 for the cost of production." ;
			mes "Please come back when you have collected everything." ;
			set GUN_2QUE,1;
			close;
		case 3:
			mes "[ray]";
			mes "I have some information about weapons: ......" ;
			mes "It looks like you are busy." ;
			mes "Please come back." ;
			close;
		}
	case 1:
		if(countitem(999) < 70 || countitem(985) < 5 || countitem(984) < 3 || countitem(1003) < 70 || countitem(7317) < 50 || Zeny < 50000) {
			mes "[ray]";
			mes "It looks like you haven't gathered the material yet." ;
			mes "I'll say it again." ;
			next;
			mes "[ray]";
			mes "^FF0000Seventy pieces of Steel, five pieces of Elunium, three pieces of Oridecon, seventy pieces of coal, and fifty rusty screws. ^000000And you need ^FF000050,000Zeny^000000 for the production cost." ;
			mes "Please come back when you have collected everything." ;
			next;
			mes "[ray]";
			mes "I can cancel the production request if you don't need it anymore." ;
			mes "What would you like to do?" ;
			next;
			if(select("do not cancel", "cancel")==1) {
				mes "[ray]";
				mes "Then come back when you have gathered the materials." ;
				close;
			}
			mes "[ray]";
			mes "The production request has been cancelled." ;
			mes "Well, have a pleasant day." ;
			set GUN_2QUE,0;
			close;
		}
		mes "[ray]";
		mes "Oh, the material has been gathered." ;
		mes "Now, let's start production." ;
		mes "It will take some time, so please wait a bit." ;
		delitem 999,70;
		delitem 985,5;
		delitem 984,3;
		delitem 1003,70;
		delitem 7317,50;
		set Zeny,Zeny-50000;
		set GUN_2QUE,2;
		close;
	case 2:
		if(MaxWeight - Weight < 2300) {
			mes "-You cannot receive the item due to the high weight of the item you are carrying--please reduce the number of items you are carrying and then talk to me again-";
			close;
		}
		mes "[ray]";
		mes "The drifter is complete." ;
		set GUN_2QUE,0;
		getitem 13157,1;
		next;
		mes "[ray]";
		mes "Gunslinger's skills, Gatling Fever and Madness Canceller are very useful." ;
		mes "Please learn them." ;
		mes "Well, I'll see you soon." ;
		close;
	case 3:
		if(countitem(1043) < 1000 || countitem(932) < 1000) {
			mes "[ray]";
			mes "Can you collect ^FF000000 1,000 orc claws ^000000 and ^FF000000 1,000 skeleton bones ^000000?" ;
			mes "If it's too difficult, you can give up, okay?" ;
			next;
			if(select("I don't give up", "I give up")==1) {
				mes "[ray]";
				mes "I understand." ;
				mes "I believe in your strength." ;
				close;
			}
			mes "[ray]";
			mes "Are you giving up?" ;
			mes "umm ......" ;
			mes "It is a difficult condition, but it is impossible to handle this weapon unless you overcome it." ;
			next;
			mes "[ray]";
			mes "Come back when you can believe in your own strength." ;
			set GUN_2QUE,0;
			close;
		}
		mes "[ray]";
		mes "Oh, the material has been gathered." ;
		mes "Oh ...... When I made ^FF000000 Butcher^000000, I was worried about whether anyone could use this ......." ;
		mes "And that's only until today!" ;
		delitem 1043,1000;
		delitem 932,1000;
		set GUN_2QUE,4;
		next;
		mes "[ray]";
		mes "So, we will start making the ^FF000000 butcher ^000000, but first we must ask Dr. Serlena for permission to make and use the butcher." ;
		next;
		mes "[ray]";
		mes "I will get the permission to use the butcher, so please have 100,000 zeny ready, which is the cost of producing the butcher and the fee for the permit process." ;
		close;
	case 4:
		mes "[ray]";
		mes "Dr. Serlena has given me permission to use the butcher." ;
		mes "We will give you the butcher as soon as you pay us 100,000 zeny." ;
		mes "May I?" ;
		next;
		if(select("No", "Yes")==1) {
			mes "[ray]";
			mes "Please come back whenever you are ready to pay." ;
			close;
		}
		if(Zeny < 100000) {
			mes "[ray]";
			mes "It looks like you don't have enough money." ;
			mes "Please check again." ;
			close;
		}
		if(MaxWeight - Weight < 2500) {
			mes "-You cannot receive the item due to the high weight of the item in your possession--please reduce the number of items in your possession and then speak to us again."
			close;
		}
		mes "[ray]";
		mes "1, 2, ........... .10!";
		mes "Confirmed." ;
		mes "Then I will give you ^FF000000 butcher ^000000!" ;
		set Zeny,Zeny-100000;
		set GUN_2QUE,0;
		getitem 13158,1;
		next;
		mes "[ray]";
		mes "Uncle F. Hellison, who is in Lighthalzen, was concerned about that weapon." ;
		mes "Please go and see him when you have time." ;
		next;
		mes "[ray]";
		mes "Please use your weapons carefully." ;
		mes "Then, we will see you again when we have a chance." ;
		close;
	case 6:
		mes "[ray]";
		mes "Oh, hello." ;
		mes "My name is Einbroch Institute planner, Ei." ;
		mes "How can I help you?" ;
		next;
		menu "Need special metal",-;
		mes "[ray]";
		mes "What?  ...... Ah!" ;
		mes "Oh, by the way, you're the guy who took the butcher before, right?" ;
		mes "Are you using the butcher properly?" ;
		next;
		mes "[ray]";
		mes "............ is ......" ;
		mes "Special metals are ......" ;
		mes "Did you, by any chance, break the butcher!" ;
		next;
		mes "[ray]";
		mes "I trusted you!" ;
		mes "You betrayed my trust!" ;
		mes "You vile thing!" ;
		next;
		menu "Explain the situation",-;
		mes "[ai]";
		mes "...... I see." ;
		mes "Uncle Hellison is ......." ;
		mes "I'm sorry I doubted you." ;
		next;
		mes "[ray]";
		mes "The special metal is in the possession of Dr. Serlena." ;
		mes "However, Dr. Serlena is away right now and I don't know where it is." ;
		next;
		mes "[ray]";
		mes "I would try to find it, but he is in the middle of a new study and I don't have time for that right now." ;
		mes "I can't put off researching attribute bullets, so ......." ;
		next;
		menu "I have one suggestion.",-;
		mes "[ray]";
		mes "Hmm?  What is it?" ;
		next;
		menu "I'm going to find out what we need from each other.",-;
		mes "[ray]";
		mes "umm ...... OK!" ;
		mes "So, I'll look for the special metals and you go get the attribute bullets." ;
		next;
		mes "[ray]";
		mes "^FF0000 Poison Sphere, Fire Sphere, Wind Sphere, Dark Sphere, Ice Sphere ^000000."
		next;
		mes "[ray]";
		mes "Please collect 30 attribute bullets of one of these five types." ;
		set GUN_2QUE,7;
		close;
	case 7:
		mes "[ray]";
		mes "^FF000000 30 Poison Spheres, 30 Fire Spheres, 30 Wind Spheres, 30 Dark Spheres, 30 Ice Spheres ^000000."
		mes "Have you gathered any of them?" ;
		next;
		switch(select("No", "Poison Sphere", "Fire Sphere", "Wind Sphere", "Dark Sphere", "Ice Sphere")) {
		case 1:
			mes "[ray]";
			mes "If you collect even one kind, please bring it to me." ;
			close;
		case 2:
			set '@itemid,13205;
			break;
		case 3:
			set '@itemid,13203;
			break;
		case 4:
			set '@itemid,13204;
			break;
		case 5:
			set '@itemid,13206;
			break;
		case 6:
			set '@itemid,13207;
			break;
		}
		if(countitem('@itemid) < 30) {
			mes "[ray]";
			mes "Where is it?" ;
			mes "Make sure you get it right!" ;
			close;
		}
		mes "[ray]";
		mes "You've got it right." ;
		mes "I also searched and found Dr. Serlena's Research Office to find it." ;
		mes "So, let's trade." ;
		delitem '@itemid,30;
		set GUN_2QUE,8;
		next;
		mes "-give the ray the attribute bullet and received the special metal-";
		next;
		mes "[ray]";
		mes "Uncle Hellison is a dexterous man and will be able to repair it properly." ;
		mes "Then." ;
		close;
	case 8:
	case 9:
		mes "[ray]";
		mes "Uncle Hellison is a dexterous man and will be able to repair it properly." ;
		mes "Well then." ;
		close;
	}
}

lighthalzen.gat,205,284,5 script helisun 85,{
	switch(GUN_2QUE) {
	default:
		mes "[helisun]";
		mes "Ahh ...... I'm bored - something interesting to do. ......" ;
		if(GUN_2QUE ! = 0 || Job ! = Job_Gunslinger || BaseLevel < 68 || countitem(13158) < 1)
			close;
		next;
		mes "[helisun]";
		mes "hmm?" ;
		mes "Are you Gunslinger?" ;
		mes "...... and then ......." ;
		mes "I've never seen you with a weapon before!" ;
		next;
		mes "[HELISON]";
		mes "Wait, can I have a look at it?" ;
		mes "Just a little bit." ;
		mes "Hey?  Huh?" ;
		mes "Please." ;
		next;
		if(select("I won't show you", "I'll show you the butcher")==1) {
			mes "[helisson]";
			mes "Hmph!" ;
			mes "Okay, okay." ;
			mes "Don't think you're the only one with a good weapon!" ;
			mes "Even I have these crimson bolts!" ;
			close;
		}
		mes "[helisson]";
		mes "Oh ...... This is the Butcher Butcher, developed by the Einbroch Institute, which no one has ever been able to use!" ;
		mes "wonderful ......" ;
		next;
		mes "[HELISON]";
		mes "Can I use it for a minute! It's okay!" ;
		mes "I'm used to handling weapons!" ;
		mes "Don't worry!  Hey!" ;
		mes "-GOTTON! - ...... ah." ;
		close2;
		delitem 13158,1;
		set GUN_2QUE,5;
		end;
	case 5:
		if(MaxWeight - Weight < 450) {
			mes "-You cannot receive the item due to the high weight of the item in your possession--please reduce the number of items in your possession and then speak to the client again";
			close;
		}
		mes "[helisun]";
		mes "E...... A...... Huh?" ;
		next;
		mes "[helisun]";
		mes "U...... yeah...... A......" ;
		next;
		menu "Ask them what they did",-;
		mes "[helisn]";
		mes "What! Ah ...... No. ...... That ......." ;
		next;
		mes "[helisun]";
		mes "That ...... That's the one. ......" ;
		mes "a...... Aha......" ;
		mes "ahahahahahahaha~";
		next;
		mes "[helisn]";
		mes "I'm the one ...... ahahahaha......" ;
		next;
		mes "[helisun]"; mes "[helisun]"; mes "[helisun]"; mes "[helisun]
		mes "This one. ...... haha...... ha......" ;
		next;
		mes "[helisn]";
		mes "Zda-da-da-da!" ;
		mes "I was going to shoot him." ;
		mes "...... That's right!" ;
		next;
		mes "[helisson]";
		mes "But this is surprisingly heavy!" ;
		mes "My delicate hands just inadvertently ......" ;
		mes "Aha...... ahahahahahaha!" ;
		next;
		mes "[helisun]";
		mes ".................." ;
		mes "...... Sorry." ;
		mes "I broke it." ;
		next;
		mes "[HELISON]";
		mes "Oh, no!  It's okay!" ;
		mes "I look like this, but I'm actually a jack-of-all-trades!" ;
		mes "I call myself ......." ;
		mes "No!  Don't get me wrong!" ;
		mes "I can fix this!" ;
		next;
		mes "[HELISON]";
		mes "But I don't have the materials needed to fix it. ......" ;
		mes "I have some parts that I've never seen before. ......" ;
		next;
		mes "[helisn]";
		mes "I'm the one who broke it. ......" ;
		mes "Can you go gather the materials needed to repair it?" ;
		mes "I'll show you how to fix it as soon as I have the materials!" ;
		next;
		mes "[HELISON]";
		mes "No, on the contrary, I'll even do a special modification!　You got it!" ;
		next;
		mes "[Helisun]";
		mes "The materials needed are ^FF0000Steel 10 pieces, Elunium 2 pieces, Oridecon 1 piece, Coal 20 pieces ^000000." ;
		next;
		mes "[helisun]";
		mes "And we need ^FF000000Special Metals^000000 for Butcher only." ;
		mes "Perhaps only Dr. Serlena can make this metal." ;
		next;
		mes "[HELISON]";
		mes "First, ask Dr. Serlena's assistant, 'Stingray', to help you." ;
		mes "She's a bit hysterical, but she'll understand if you talk to her. ...... Maybe ......." ;
		next;
		mes "[HELISON]";
		mes "I still feel bad about this." ;
		mes "In the meantime, I'll lend you my prized "Crimson Bolt" instead, and you'll give it back to me when you can fix it, okay?" ;
		mes "Hey?  Huh?" ;
		close2;
		set GUN_2QUE,6;
		getitem 13102,1;
		end;
	case 6:
	case 7:
		mes "[helisun]";
		mes "The materials needed are ^FF0000Steel 10 pieces, Elunium 2 pieces, Oridecon 1 piece, Coal 20 pieces ^000000." ;
		next;
		mes "[helisun]";
		mes "And we need ^FF000000Special Metals^000000 for Butcher only." ;
		mes "You can get this metal by asking "ray" ...... Maybe ......." ;
		close;
	case 8:
		if(countitem(999) < 10 || countitem(985) < 2 || countitem(984) < 1 || countitem(1003) < 20) {
			mes "[helisun]";
			mes "The materials needed are ^FF0000Steel 10 pieces, Elunium 2 pieces, Oridecon 1 piece and coal 20 pieces ^000000." ;
			next;
			mes "[helisun]";
			mes "And we need ^FF000000Special Metals^000000 for the Butcher only, which you seem to have gotten." ;
			close;
		}
		mes "[helisun]";
		mes "Oh, you've gathered the materials!" ;
		if(countitem(13102) < 1) {
			mes "By the way, where are the 'crimson bolts'?" ;
			mes ".................." ;
			mes "Please give it back to me: ......" ;
			close;
		}
		mes "Okay then, just give me a few moments so I can start fixing it." ;
		delitem 999,10;
		delitem 985,2;
		delitem 984,1;
		delitem 1003,20;
		delitem 13102,1;
		set GUN_2QUE,9;
		close;
	case 9:
		if(MaxWeight - Weight < 2500) {
			mes "-You cannot receive the item due to the high weight of the item in your possession--please reduce the number of items in your possession and then speak to me again";
			close;
		}
		mes "[helisun]";
		mes "Huh. ...... I managed to repair it successfully." ;
		mes "I'm really sorry." ;
		mes "I'm sorry to say that I've enhanced the butcher's functionality as a replacement." ;
		mes "Take good care of it." ;
		set GUN_2QUE,0;
		getitem 13159,1;
		close;
	}
}

//============================================================
// Destroyer Production
//- Registry -------------------------------------------------
// GUN_3QUE -> 0 to 2
//------------------------------------------------------------
que_ng.gat,185,180,3 script venessa 726,{
	switch(GUN_3QUE) {
	case 0:
		mes "[Benessa]";
		mes "Ha!  No!" ;
		mes "Sei!  Toria!" ;
		mes "Someday I will master all the martial arts in the world!" ;
		next;
		if(Job ! = Job_Gunslinger) {
			mes "[Venessa]";
			mes "Hmm?  What?" ;
			mes "Can you go away so I don't have to interrupt your practice?" ;
			close;
		}
		mes "[Venessa]";
		mes "Hmm?" ;
		mes "You're Gunslinger, aren't you?" ;
		mes "I'm interrupting your practice." ;
		mes "What can I do for you?" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "No, I was watching the practice." ;
		mes "Because it was so cool. ......" ;
		next;
		mes "[Venessa]";
		mes "Oh!" ;
		mes "You like martial arts?" ;
		mes "Then come over here." ;
		mes "I'll give you some moves." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "...... Eh?" ;
		mes "Oh, no, don't worry about it." ;
		next;
		mes "[Venessa]";
		mes "I'm fine, I'm fine." ;
		mes "See!" ;
		mes "-sh!  Sh! -";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Aww, don't come over here!" ;
		mes "Wa ...... Aww!" ;
		mes "--shush! --boom!　Boom! -";
		next;
		mes "[Venessa]";
		mes "Why are you avoiding it!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Isn't it obvious!" ;
		mes "It's not safe!" ;
		next;
		mes "[Venessa]";
		mes "Oh dear." ;
		mes "Don't freak out over this." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "You know what I mean!" ;
		mes "If it hits you, you'll get hurt!" ;
		next;
		mes "[Venessa]";
		mes "Yes, yes, yes - I know!"
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Roughly suddenly ............" ;
		next;
		mes "[Venessa]";
		mes "Shallap!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes ".................." ;
		next;
		mes "[Venessa]";
		mes "Yes." ;
		mes "You certainly overdid it." ;
		mes "I'm sorry, in case you're wondering." ;
		mes "So I'm going to make a special weapon for you." ;
		next;
		mes "[Benessa]";
		mes "I am Benessa Lewis." ;
		mes "I used to be an aspiring fighter, but now I'm here making weapons." ;
		mes "Well, I mean I don't have any money." ;
		next;
		mes "[Venessa]";
		mes "The weapon I can make is a Destroyer." ;
		next;
		mes "[Benessa]";
		mes "This is the weapon I name for my martial arts competitions." ;
		mes "Hmmm... ......." ;
		mes "Destroyer!" ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Wow!" ;
		mes "Please stop already!" ;
		next;
		mes "[Venessa]";
		mes "I know, I know, I know." ;
		mes "Mooo, just in case you need the ingredients to make a Destroyer." ;
		next;
		mes "[Venessa]";
		mes "What do you think?" ;
		mes "It's not every day you get an opportunity like this." ;
		mes "Do you want to make it?" ;
		next;
		if(select("I'll do it again", "please")==1) {
			mes "[Venessa]";
			mes "Oh dear, residual GOST."
			mes "That would have been a good time for you." ;
			mes "I don't know if you'll regret it later." ;
			mes "Well, bye-bye." ;
			close;
		}
		mes "[Venessa]";
		mes "Ok." ;
		mes "To build the Destroyer, you need 50 old steel plates, 5 Oridecon, 70 rusty screws, and 100,000 Zeny for the fee." ;
		set GUN_3QUE,1;
		close;
	case 1:
		if(countitem(7319) < 50 || countitem(984) < 5 || countitem(7317) < 70) {
			mes "[Venessa]";
			mes "To build the Destroyer, you need 50 old steel plates, 5 Oridecon, 70 rusty screws, and 100,000 Zeny for the fee." ;
			close;
		}
		if(Zeny < 100000) {
			mes "[Venessa]";
			mes "You have enough material, but you're short 100,000 Zeny for the fee." ;
			close;
		}
		if(MaxWeight - Weight <= 1200) {
			mes "[Venessa]";
			mes "The luggage is not full." ;
			mes "Go organize it a bit." ;
			close;
		}
		mes "[Venessa]";
		mes "Ok, you've got everything." ;
		mes "Well, I'll trade you the Destroyer I made beforehand." ;
		delitem 7319,50;
		delitem 984,5;
		delitem 7317,70;
		set GUN_3QUE,2;
		getitem 13160,1;
		next;
		mes "[Venessa]";
		mes "If you ever need me again, you can always come back." ;
		mes "Next time, I'll give you another fighting technique." ;
		close;
	case 2:
		mes "[Venessa]";
		mes "Oh, here we go again, aren't we?" ;
		mes "How are you?" ;
		mes "Oh yeah, I got a new weapon." ;
		mes "I can make you one if you want." ;
		next;
		switch(select("Destroyer", "Slotted Destroyer", "Don't")) {
		case 1:
			mes "[Venessa]";
			mes "Ok." ;
			mes "To build the Destroyer, you need 50 old steel plates, 70 rusty screws, 5 Oridecon, and 100,000 Zeny for the fee." ;
			mes "Do you want to build it?" ;
			next;
			if(select("I'll think about it", "please")==1) {
				mes "[Venessa]";
				mes "Oh, yeah." ;
				mes "Then take your time and think about it." ;
				close;
			}
			if(countitem(7319) < 50 || countitem(984) < 5 || countitem(7317) < 70) {
				mes "[Venessa]";
				mes "To build the Destroyer, you need 50 old steel plates, 5 Oridecon, 70 rusty screws, and 100,000 Zeny for the fee." ;
				close;
			}
			if(Zeny < 100000) {
				mes "[Venessa]";
				mes "You have enough material, but you're short 100,000 Zeny for the fee." ;
				close;
			}
			if(MaxWeight - Weight <= 1200) {
				mes "[Venessa]";
				mes "The luggage is not full." ;
				mes "Go organize it a bit." ;
				close;
			}
			mes "[Venessa]";
			mes "Ok, you've got everything." ;
			mes "Well, I'll trade you the Destroyer I made beforehand." ;
			delitem 7319,50;
			delitem 984,5;
			delitem 7317,70;
			getitem 13160,1;
			next;
			mes "[Venessa]";
			mes "If you ever need me again, you can always come back." ;
			mes "Next time, I'll give you another fighting technique." ;
			close;
		case 2:
			mes "[Venessa]";
			mes "I'll trade you a Destroyer with an okie slot if you bring me one of my personal collection." ;
			next;
			mes "[Benessa]";
			mes "I will trade you 1 Finger with 2 slots and 5 Oridecon." ;
			mes "Do you want to make it?" ;
			next;
			if(select("I'll think about it", "please")==1) {
				mes "[Venessa]";
				mes "Oh, yeah." ;
				mes "Then take your time and think about it." ;
				close;
			}
			if(countitem(1812) < 1 || countitem(984) < 5) {
				mes "[Venessa]";
				mes "You have 1 finger with 2 slots to replace, 5 Oridecon." ;
				close;
			}
			if(MaxWeight - Weight <= 1200) {
				mes "[Venessa]";
				mes "The luggage is not full." ;
				mes "Go organize it a bit." ;
				close;
			}
			mes "[Venessa]";
			mes "Ok, you've got everything." ;
			mes "Well, I'll trade you the pre-made slotted Destroyer." ;
			delitem 1812,1;
			delitem 984,5;
			getitem 13161,1;
			next;
			mes "[Venessa]";
			mes "If you ever need me again, you can always come back." ;
			mes "Next time, I'll give you another fighting technique." ;
			close;
		case 3:
			mes "[Venessa]";
			mes "Oh, yeah." ;
			mes "Then go ahead and take your time." ;
			mes "Or do you want to spar with me?" ;
			close;
		}
	}
}

//============================================================
// Inferno Production
//- Registry -------------------------------------------------
// GUN_4QUE -> 0 to 5
//------------------------------------------------------------
que_ng.gat,187,163,3 script Ingrid 744,{
	switch(GUN_4QUE) {
	case 0:
		mes "[Ingrid]";
		mes "Hello!" ;
		mes "My name is Ingrid and I am in charge of making weapons." ;
		mes "Nice to meet you." ;
		next;
		if(Job ! = Job_Gunslinger) {
			mes "[Ingrid]";
			mes "But, while remaining GOST, the weapon I produce is for Gunslinger only." ;
			next;
			mes "[Ingrid]";
			mes "You are not a member of the Gunslinger guild, so you cannot use my weapons." ;
			mes "I am sorry." ;
			close;
		}
		mes "[Ingrid]";
		mes "I'm just starting my job, but I'll do my best!" ;
		next;
		mes "[Ingrid]";
		mes "Oh ...... I'm thrilled." ;
		mes "I make a weapon called Inferno for my customers." ;
		next;
		mes "[Ingrid]";
		mes "The Inferno is one of the best weapons developed in the Gunslinger Guild laboratories." ;
		next;
		mes "[Ingrid]";
		mes "Stability when held in the hand, considering the human body engineering design, while providing high destructive power." ;
		mes "A great weapon with minimal recoil from firing!" ;
		mes "Hmmmmmmmmm... ......." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "...... You know a lot about it, don't you?" ;
		next;
		mes "[Ingrid]";
		mes "Of course I do!" ;
		mes "Because I designed that weapon." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "...... I see: ......" ;
		next;
		mes "[Ingrid]";
		mes "...... Oh, hmmm... I'm just bragging." ;
		mes "Compared to Dr. Serlena, I'm not even close to being on my feet. ......" ;
		next;
		mes "[Ingrid]";
		mes "Actually, I wanted to be a Gunslinger too, but I couldn't keep up with my body and mind, so I gave up." ;
		next;
		mes "[Ingrid]";
		mes "But during the exam, Dr. Serlena cared about me the whole time and helped me a lot so that I could do this job now." ;
		next;
		mes "[Ingrid]";
		mes "It's a bit of a lingering ghost that I didn't become a Gunslinger, but my brother, who took the exam with me, became a Gunslinger." ;
		next;
		mes "[Ingrid]";
		mes "I'm so happy that my big brother alone was able to catch his own dream." ;
		next;
		mes "[Ingrid]";
		mes "Hahaha." ;
		mes "I'm sorry." ;
		mes "You're kind of talking on your own." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "It's okay." ;
		mes "As far as I can see, Ingrid seems to be shining bright enough even now that she couldn't become a Gunslinger." ;
		next;
		mes "[Ingrid]";
		mes "Hmph, thank you very much." ;
		mes "Really, I'm enjoying my job now." ;
		mes "...... Now, let's get back to the story, shall we?" ;
		next;
		mes "[Ingrid]";
		mes "To make the Inferno, you will need 100 old steel plates, 50 rusty screws, 10 Oridecon, 100 burning hearts and a fee of 200,000 Zeny." ;
		mes "May I?" ;
		next;
		if(select("I'll give it some thought.", "Please")==1) {
			mes "[Ingrid]";
			mes "I understand." ;
			mes "Then please take your time and think about it." ;
			close;
		}
		mes "[Ingrid]";
		mes "I understand." ;
		mes "Then come back when you have gathered the materials." ;
		next;
		mes "[Ingrid]";
		mes "To make the Inferno, you will need 100 old steel plates, 50 rusty screws, 10 Oridecon, 100 burning hearts and a fee of 200,000 Zeny." ;
		mes "Please do not make a mistake with the materials." ;
		set GUN_4QUE,1;
		close;
	case 1:
		if(countitem(7319) < 100 || countitem(7317) < 50 || countitem(984) < 10 || countitem(7097) < 100) {
			mes "[Ingrid]";
			mes "To make Inferno, you need 100 old iron plates, 50 rusty screws, 10 Oridecon, 100 burning hearts and a fee of 200,000 Zeny." ;
			mes "Please do not make a mistake with the materials." ;
			close;
		}
		if(Zeny < 200000) {
			mes "[Ingrid]";
			mes "I have enough material, but not enough commission." ;
			mes "It is 200,000 Zeny." ;
			mes "Please don't make a mistake." ;
			close;
		}
		if(MaxWeight - Weight <= 1250) {
			mes "[Ingrid]";
			mes "Isn't your baggage full?" ;
			mes "Please organize a bit and come back later." ;
			close;
		}
		mes "[Ingrid]";
		mes "Oh, you've already collected them?" ;
		mes "Really ...... I'm surprised." ;
		mes "Well, let's get started: ......." ;
		next;
		mes "[Ingrid]";
		mes "Yes, this is Inferno." ;
		mes "Please take good care of it." ;
		delitem 7319,100;
		delitem 7317,50;
		delitem 984,10;
		delitem 7097,100;
		set GUN_4QUE,2;
		getitem 13162,1;
		next;
		mes "[Ingrid]";
		mes "If you see my brother, talk to him." ;
		mes "My brother's name is Ingram." ;
		mes "You can look for him if you want." ;
		close;
	case 2:
		mes "[Ingrid]";
		mes "Hello." ;
		mes "You are here again." ;
		mes "Did you need an inferno?" ;
		next;
		if(select("No", "Yes")==1) {
			mes "[Ingrid]";
			mes "I see." ;
			mes "Then please take your time." ;
			close;
		}
		if(countitem(7319) < 100 || countitem(7317) < 50 || countitem(984) < 10 || countitem(7097) < 100) {
			mes "[Ingrid]";
			mes "To make Inferno, you need 100 old iron plates, 50 rusty screws, 10 Oridecon, 100 burning hearts and a fee of 200,000 Zeny." ;
			mes "Please do not make a mistake with the materials." ;
			close;
		}
		if(Zeny < 200000) {
			mes "[Ingrid]";
			mes "I have enough material, but not enough commission." ;
			mes "It is 200,000 Zeny." ;
			mes "Please don't make a mistake." ;
			close;
		}
		if(MaxWeight - Weight <= 1250) {
			mes "[Ingrid]";
			mes "Isn't your baggage full?" ;
			mes "Please organize a bit and come back later." ;
			close;
		}
		mes "[Ingrid]";
		mes "Yes, this is Inferno." ;
		mes "Please take good care of it." ;
		delitem 7319,100;
		delitem 7317,50;
		delitem 984,10;
		delitem 7097,100;
		getitem 13162,1;
		close;
	}
}
