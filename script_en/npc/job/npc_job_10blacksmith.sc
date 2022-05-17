//= Athena Script ==============================================================
// Ragnarok Online Blacksmith Jobchange Script by Blaze
//= Registry ===================================================================
// CHANGE_BS -> 0-17
//==============================================================================

//============================================================
// Guide
//------------------------------------------------------------
geffen_in.gat,109,170,2 script Guild Member 726,{
	mes "[BlacksmithGuild Member]";
	mes "Hello, have you come to ask about the Blacksmith Guild?" ;
	next;
	mes "[BlacksmithGuild Member]";
	mes "Sorry, the Blacksmith Guild has moved to ^3131FFSchwartzvald Republic "City of Steel Einbroch" ^000000." ;
	next;
	mes "[BlacksmithGuild Member]";
	mes "You can travel to the Republic of Schwartzvald by airship." ;
	next;
	mes "[BlacksmithGuild Member]";
	mes "If you would like, you can travel in space to Izlude, where the airport is located, for 600Zeny." ;
	mes "Would you like to use spatial travel?" ;
	next;
	switch(select("Detailed directions to Einbroch", "To Izlude!" , "Don't use")) {
	case 1:
		mes "[BlacksmithGuild Member]";
		mes "Okay. I will explain." ;
		next;
		mes "[BlacksmithGuild Member]";
		mes "The Republic of Schwartzvald uses 'airships' instead of spatial transfer services." ;
		next;
		mes "[BlacksmithGuild Member]";
		mes "In ^3131FF "Izlude"^000000, the ^3131FF expatriate airship ^000000 is in operation, repeatedly traveling between ^3131FF "Izlude-Yuno"^000000." ;
		next;
		mes "[BlacksmithGuild Member]";
		mes "You can reach Einbroch by taking the out-of-country airship to Juno and transferring to the ^3131FF domestic airship^000000 that operates within Schwartzvald." ;
		next;
		mes "[BlacksmithGuild Member]";
		mes "When changing airships, be ^000000 careful not to go outside the ^3131FF airport." ;
		next;
		mes "[BlacksmithGuild Member]";
		mes "It's difficult if you only listen to me, but once you get used to it, it's easy." ;
		mes "It's just a ride in an airship." ;
		mes "Well then, please give my best regards to my Blacksmith friends in Einbroch." ;
		close;
	case 2:
		if(Zeny < 600) {
			mes "[BlacksmithGuild Member]";
			mes "There seems to be insufficient money." ;
			close;
		}
		warp "izlude.gat",94,103;
		end;
	case 3:
		mes "[BlacksmithGuild Member]";
		mes "Have a nice day then." ;
		close;
	}
}

//============================================================
// Reception and job change
//------------------------------------------------------------
//geffen_in.gat,110,169,2 script Guild Member 731,{
ein_in01.gat,18,28,4 script Guild Member 731,{
	if(Upper == UPPER_HIGH) {
		mes "[Alt-Eisen]";
		mes "Boy, boy, do you know where you are?" ;
		next;
		mes "[Alt-Eisen]";
		mes "Or do you know ...... Do you know where you're at?" ;
		mes "Ummm ......" ;
		mes "Ummm ............" ;
		next;
		mes "[Alt-Eisen]";
		mes "Was he the one who made off with the weapons we made? ......" ;
		mes "Or was it the guy who came to ask us to make him a weapon and eventually gave up and left? ......" ;
		mes "Hmmm... ......" ;
		next;
		mes "[Alt-Eisen]";
		mes "......" ;
		mes "I don't know! I don't recall ......" ;
		mes "Ha! ...... Is this what you call déjà vu!" ;
		next;
		mes "[Alt-Eisen]";
		mes "I have no recollection of this. ......" ;
		mes "There's a hint of something out of the ordinary. ......" ;
		mes "Well, anyway!" ;
		mes "Have a nice day, huh?" ;
		close;
	}
	mes "[Alt-Eisen]";
	mes "Welcome! We are the Ironworking Blacksmith Guild!" ;
	mes "And we are passionate about iron!" ;
	next;
	mes "[Alt-Eisen]";
	mes "The art of melting metals to create new weapons is truly an art!" ;
	next;
	if(Job == Job_Priest) {
		mes "[Alt-Eisen]";
		mes "Oh, is it an angel of God!" ;
		mes "Welcome!" ;
		mes "Please pray for blessings on me here!" ;
		close;
	}
	if(Job == Job_Blacksmith) {
		mes "[Alt-Eisen]";
		mes "Oh! Long time no see!" ;
		mes "What can I do for you Christopher?" ;
		mes "I've been doing a lot of paperwork lately..." ;
		mes "I feel like swinging a hammer... Ha ha ha..." ;
		close;
	}
	if(Job ! = Job_Merchant) {
		mes "[Alt-Eisen]";
		mes "Hmm, good eye" +(Sex? "Man": "Daughter") + "Yes!" ;
		mes "Want to be a Blacksmith?" ;
		mes "But we can only change jobs from merchant. Give up now." ;
		close;
	}
	if(SkillPoint) {
		mes "[Alt-Eisen]";
		mes "Oops, you can't change jobs if you have any SkillPoints left." ;
		mes "Shake them all out and come back." ;
		close;
	}
	switch(CHANGE_BS) {
	case 0:
		mes "[Alt-Eisen]";
		mes "Why don't you stop being a merchant and throw yourself into the art of fire with us?" ;
		mes "Write your name and JobLv on the job application there. Hmmm." ;
		next;
		switch(select("I'm applying for a new job", "What are your job requirements?" , "Another time...")) {
			case 1:
				break;
			case 2:
				mes "[Alt-Eisen]";
				mes "You mean the job change conditions?" ;
				mes "First, merchant JobLv over 40." ;
				mes "And then, you must pass a test." ;
				mes "These two things. Well, the test is a bit difficult, but a merchant with some knowledge should have no problem." ;
				next;
				mes "[Alt-Eisen]";
				mes "The tests are a hands-on test where you have to deliver goods and figure out the specialties of each area, and a written test where you have to test your knowledge to become a Blacksmith." ;
				close;
			case 3:
				mes "[Alt-Eisen]";
				mes "Mm, another time." ;
				close;
		}
		if(JobLevel < 40) {
			mes "[Alt-Eisen]";
			mes "Hmm... Looks like you still don't have enough JobLevel to be a merchant." ;
			mes "You can change jobs after merchant JobLevel 40 or higher." ;
			mes "I'm sorry to be a lingering ghost after you came all the way here, but please train a little more before you come." ;
			close;
		}
		mes "[Alt-Eisen]";
		mes "Mm..." ;
		mes "Looks like JobLv is okay for once." ;
		next;
		mes "[Alt-Eisen]";
		mes "Okay, the basics are done, but that doesn't make you a Blacksmith." ;
		mes "At the very least, we need to see your merchant integrity and your passion for Blacksmith." ;
		next;
		mes "- I've got some paperwork out -"; mes "- I've got some paperwork out -";
		next;
		mes "[Alt-Eisen]";
		//mes "Hmm... I'm on a business trip to Alberta right now."; next; mes "[Alt-Eisen]"; //mes "[Alt-Eisen]
		//mes "Hmm... Now traveling to Einbech";
		mes "Guild Member 'Geschu' seems to be busy and in trouble, so I need a little help with his work." ;
		mes "This is my first test for you." ;
		next;
		mes "[Alt-Eisen]";
		mes "Well, have a safe trip." ;
		set CHANGE_BS,1;
		close;
	case 1:
		mes "[Alt-Eisen]";
		mes "Oh, you hadn't left yet." ;
		//mes "Visit 'Geschu' in Alberta."
		mes "Visit 'Geschu' in Einbech." ;
		mes "See you then." ;
		close;
	default:
		mes "[Alt-Eisen]";
		mes "How is the work Geschu asked you to do going?" ;
		mes "He's a bit stubborn..." ;
		mes "Hang in there until the end." ;
		close;
	case 15:
		mes "[Alt-Eisen]";
		mes "Good job!" ;
		mes "You've cleared one up." ;
		next;
		mes "[Alt-Eisen]";
		mes "Hm? Ha ha..." ;
		mes "This doesn't mean the exam is over, you know." ;
		//mes "Okay, go to Morroc." ;
		//mes "There's the next person in charge over there." ;
		mes "Okay, go talk to the next person in charge nearby." ;
		next;
		if(select("tohoho ...... I'm going ......" ,"...... I hate it!") ==2) {
			mes "[Alt-Eisen]";
			mes "What? You're giving up on your new job?" ;
			mes "You gutless bastard! This is an insult to our guild!" ;
			mes "Go home! Don't come back!" ;
			next;
			mes "[Alt-Eisen]";
			mes "You thought you could be a Blacksmith by throwing out the test halfway through!" ;
			close;
		}
		mes "[Alt-Eisen]";
		mes "Sorry... I don't have a choice." ;
		} mes "Do you know too?" ;
		mes "They used to let anyone change jobs without testing... A lot of victims were caused by fraud and no-mannered behavior." ;
		next;
		mes "[Alt-Eisen]";
		mes "Huh..." ;
		//mes "Go to Morroc for now, next ";
		//mes "I wish you good luck with the test." ;
		mes "In the meantime, I wish you good luck with the next test." ;
		set CHANGE_BS,16;
		close;
	case 16:
		mes "[Alt-Eisen]";
		//mes "Hmm, didn't you go to Morroc?" ;
		//mes "Hurry up and get on your way!" ;
		mes "Hmm?" ;
		mes "Hurry up and meet me!" ;
		close;
	case 17:
		if(countitem(1005)==0)
			close;
		mes "[Alt-Eisen]";
		mes "Oh, you passed with flying colors!" ;
		mes "Then I will grant you the ability to inherit the art of the flame." ;
		next;
		mes "[Alt-Eisen]";
		mes "But do not forget." ;
		mes "We are those who breathe life into iron." ;
		mes "Do not work for your own greed!" ;
		set '@amount,(JobLevel >= 50)? 30: 5;
		unequip;
		set CHANGE_BS,0;
		jobchange Job_Blacksmith;
		next;
		mes "[Alt-Eisen]";
		mes "And this is a job change celebration." ;
		mes "Then be a good blacksmith!" ;
		delitem 1005,1;
		getitem 999,'@amount;
		close;
	}
}

//============================================================
// First round of testing (written and weapons manufacturing)
//------------------------------------------------------------
//alberta_in.gat,174,22,4 script BlacksmithGuild Member 63,{
ein_in01.gat,201,27,4 script BlacksmithGuild Member 63,{
	mes "[Geschu]";
	mes "Hot Blood! I'm a hot-blooded BlacksmithGeschu! Nice to meet you!" ;
	next;
	if(Job ! = Job_Merchant) {
		mes "[Geschu]";
		mes "Blacksmith is a really fulfilling profession!" ;
		mes "Don't you think so? Hahaha";
		close;
	}
	mes "[Geschu]";
	mes "Oh! A merchant. Welcome!" ;
	mes "I'm in need of help!" ;
	next;
	switch(CHANGE_BS) {
	case 0:
		mes "[Geschu]";
		mes "But!" ;
		mes "Don't bother busy people!" ;
		next;
		mes "[Geschu]";
		mes "Then!" ;
		mes "Have a good trip!" ;
		close;
	case 1:
		mes "[Geschu]";
		mes "You're the one who heard from the Blacksmith guild, aren't you?" ;
		mes "No - we've been getting a lot of orders lately, and we were just in need of a few people." ;
		next;
		mes "[Geschu]";
		mes "Hmm, if you're here to help me work, answer a few questions." ;
		next;
		mes "[Geschu]";
		mes "Because the guy who came in the other day didn't know the basics and brought the wrong stuff..." ;
		mes "[Geschu]"; mes "He wasted his precious money..." ;
		mes "Then I'm going to ask you a question! Are you ready?" ;
		next;
		if(select("yes", "wait a minute")==2) {
			mes "[Geschu]";
			mes "Okay. Then get ready and come back later." ;
			mes "It's important to be careful sometimes." ;
			close;
		}
		break;
	case 2:
		mes "[Geschu]";
		mes "Hmmm... Okay, you've studied up!" ;
		mes "I'll forgive you if you make one mistake this time!" ;
		mes "Now, are you ready?" ;
		next;
		break;
	case 3:
		mes "[Geschu]";
		mes "Wait a minute... Surely the order request form is here..." ;
		next;
		mes "[Geschu]";
		mes "Ah! There it is, there it is!" ;
		mes "The one in the most hurry..." ;
		mes "Uh..." ;
		next;
		mes "[Geschu]";
		mes "First, I'll need some materials." ;
		next;
		set CHANGE_BS,rand(4,8);
		switch(CHANGE_BS) {
		case 4: //Hyugge
			setarray '@need,1001,932,912,1219;
			setarray '@amount,2,1,1,1;
			break;
		case 5: //Baisu
			setarray '@need,999,930,717,1610;
			setarray '@amount,2,1,2,1;
			break;
		case 6: //Krong
			setarray '@need,1003,935,990,1119;
			setarray '@amount,2,2,2,1;
			break;
		case 7: //Bismarck
			setarray '@need,998,511,919,1122;
			setarray '@amount,8,20,2,1;
			break;
		case 8: /Talpiz
			setarray '@need,1002,2212,717,1713;
			setarray '@amount,8,1,2,1;
			break;
		}
		mes "[Geschu]";
		for(set '@i,0; '@i < 3; set '@i,'@i+1)
			mes ""+getitemname('@need['@i])+ " " " +'@amount['@i]+ "Pieces and ... " +getitemname('@need[3])+ " " " +'@amount['@i]+ " " " +getitemname('@need['@need[3]]+ " "" ;
		next;
		mes "[Geschu]";
		mes "No, I'm not asking because I'm broke. This is a test." ;
		next;
		mes "[Geschu]";
		mes "I'm going to say it one more time, so listen carefully." ;
		for(set '@i,0; '@i < 3; set '@i,'@i+1)
			mes ""+getitemname('@need['@i])+ " " " +'@amount['@i]+ "sold at the individual store" +getitemname('@need[3])+ "one." ;
		next;
		mes "[Geschu]";
		mes "Then, please. Bring it to me as soon as possible!" ;
		close;
	case 4:
	case 5:
	case 6:
	
	case 8:
		switch(CHANGE_BS) {
		case 4: //Hyugge
			setarray '@need,1001,932,912,1219;
			setarray '@amount,2,1,1,1;
			break;
		case 5: //Baisu
			setarray '@need,999,930,717,1610;
			setarray '@amount,2,1,2,1;
			break;
		case 6: //Krong
			setarray '@need,1003,935,990,1119;
			setarray '@amount,2,2,2,1;
			break;
		case 7: //Bismarck
			setarray '@need,998,511,919,1122;
			setarray '@amount,8,20,2,1;
			break;
		case 8: /Talpiz
			setarray '@need,1002,2212,717,1713;
			setarray '@amount,8,1,2,1;
			break;
		}
		mes "[Geschu]";
		mes "Yeah? Did you get what you asked for?" ;
		next;
		for(set '@i,0; '@i<4; set '@i,'@i+1) {
			if(countitem('@need['@i]) < '@amount['@i]) {
				mes "[Geschu]";
				mes "...... I don't have all the materials yet..." ;
				mes "... How many times do I have to tell you!!!?" ;
				for(set '@i,0; '@i<3; set '@i,'@i+1)
					mes ""+getitemname('@need['@i])+ " " " +'@amount['@i]+ "Sold at the individual store" +getitemname('@need[3])+ "One." ;
				next;
				mes "[Geschu]";
				mes "Get a grip, this is a test!" ;
				mes "You think someone who can't even shop can be a Blacksmith?" ;
				close;
			}
		}
		mes "[Geschu]";
		switch(CHANGE_BS) {
			case 4:
				mes "Star dust... Wasn't it 3?" ;
				next;
				mes "[Geschu]";
				mes "Oh, two is right. The other..." ;
				break;
			case 5:
				mes "Steel... Wasn't there three?" ;
				next;
				mes "[Geschu]";
				mes "Oh, it was two. The other..." ;
				break;
			case 6:
				mes "Coal... Wasn't there three?" ;
				next;
				mes "[Geschu]";
				mes "Oh, it was two. The other..." ;
				break;
			case 7:
				mes "Iron... Wasn't there 40 of them?" ;
				next;
				mes "[Geschu]";
				mes "Oh, it was 8 pieces. The others are..." ;
				break;
			case 8:
				mes "Iron ore... Wasn't there 30 of them?" ;
				next;
				mes "[Geschu]";
				mes "Oh, that's right, 8 pieces. The others are..." ;
				break;
		}
		mes "Okay! Perfect." ;
		mes "Hmm... I'm going to set this up now, just give me a minute." ;
		next;
		mes "[Geschu]";
		mes "Ah, yes... You, do you have ^FF0000 other " +getitemname('@need[3])+ "^000000 in your possession?" ;
		next;
		if(select("Oh, wait a minute...", "I have only for the job change test.")==1) {
			mes "[Geschu]";
			mes "Umm, you can put the ones not for the job change exam in the warehouse." ;
			close;
		}
		mes "[Geschu]";
		mes "Okay!" ;
		next;
		mes "[Geschu]";
		mes "Eiichi ......." ;
		next;
		mes "[Geschu]";
		mes "Yokorashotto ......." ;
		next;
		for(set '@i,0; '@i<4; set '@i,'@i+1)
			delitem '@need['@i],'@amount['@i];
		set CHANGE_BS,CHANGE_BS+5;
		getitem '@need[3],1; //weapon is passed
		mes "[Geschu]";
		mes "Haa." ;
		mes "You've done it..." ;
		switch(CHANGE_BS) {
			case 9: mes "Now, this to Morroc's 'Hyugge'"; break;
			case 10: mes "Now, this to Geffen's "Baisu""; break;
			//case 11: mes "Now, this to Izlude's "Krong""; break; case 10: mes "Now, this to Geffen's "Baisu""; break
			case 11: mes "Now, this to Lighthalzen's "Krong""; break; //case 12: mes "Now, this to Geffen's "Krong""; break
			//case 12: mes "Now, this to Comodo's "Bismarck""; break; case 12: mes "Now, this to Comodo's "Bismarck""; break
			case 12: mes "Now, this to Hugel's 'Bismarck'"; break; //case 12: mes "Now, this to Hugel's 'Bismarck'"; break
			case 13: mes "Now, this to Payon's 'Talpiz'"; break
		}
		mes "Give it to him and bring me the receipt and you're good to go." ;
		next;
		switch(CHANGE_BS) {
		case 9:
			mes "[Geschu]";
			mes "Yeah? What's the difference between this and a regular Gradius? Look closely at the blade there." ;
			mes "It has a decorative emblem!" ;
			mes "Ultra Gradius GeschuMk2 Version!!!" ;
			next;
			mes "[Geschu]";
			mes "......" ;
			mes "You're going to fall in love with it just by looking at it, aren't you?" ;
			next;
			mes "[Geschu]";
			mes "Anyway, give it to Morroc's 'Hyugge' and get a receipt!" ;
			close;
		case 10:
			mes "[Geschu]";
			mes "Hm? What's the difference between this and a regular arc wand? Look closely at the handle there." ;
			mes "I can't get enough of the grip!" ;
			mes "Super Arc Wand GeschuMk2 Version!!!" ;
			next;
			mes "[Geschu]";
			mes "......" ;
			mes "It feels different when you shake it!" ;
			mes "The feel!" ;
			next;
			mes "[Geschu]";
			mes "Anyway, go give it to Geffen's 'Baisu' and get a receipt!" ;
			close;
		case 11:
			mes "[Geschu]";
			mes "Yeah? What's the difference between this and a regular Tsurugi? Look closely at the blade there." ;
			mes "It has a decorative emblem!!!! Nimonji slash Tsurugi GeschuMk2 Version!!!!!!" ;
			next;
			mes "[Geschu]";
			mes "......" ;
			mes "You're going to fall in love with it just by looking at it, aren't you?" ;
			next;
			mes "[Geschu]"
			//mes "Anyway, give it to 'Krong' in Izlude."; next; mes "[Geschu]"; next; mes "[Geschu]
			mes "Anyway, give it to 'Krong' in Lighthalzen and get a receipt!" ;
			close;
		case 12:
			mes "[Geschu]";
			mes "Hm? What's the difference between this and a normal ring-headed sword? Look closely at the blade there." ;
			mes "It contains green herbal liquid!" ;
			mes "Green Herb Liquid Injection Kantou Tachi GeschuMk2 Version!!!" ;
			next;
			mes "[Geschu]";
			mes ".... When you're poisoned, just stab with this and you'll be cured in no time!" ;
			mes "The injury will be worse, but..." ;
			mes "Poison can be treated!!!" ;
			next;
			mes "[Geschu]"
			//mes "Anyway, give it to 'Bismarck' at Comodo";
			mes "Give it to 'Bismarck' at Hugel anyway and get a receipt!" ;
			close;
		case 13:
			mes "[Geschu]";
			mes "Hm? What's the difference between this and a normal arbalest? Look at the body there! It has an eye patch storage place! The GeschuMk2 Version!!!" ;
			next;
			mes "[Geschu]";
			mes "... It's going to make the eye patch more portable!" ;
			next;
			mes "[Geschu]";
			mes "Anyway, give it to Payon's 'Talpiz' and get a receipt!" ;
			close;
		}
	case 9:
	case 10:
	case 11:
	case 12: }
	case 13:
		mes "[Geschu]";
		mes "Yeah? Go quickly." ;
		mes "What? You said you forgot the delivery address?" ;
		next;
		mes "[Geschu]";
		switch(CHANGE_BS) {
		case 9:
			mes "Give it to 'Hyugge' near the Morroc Sword Mace merchant and bring the receipt." ;
			close;
		case 10:
			mes "Geffen Give it to "Baisu" at 11 o'clock and bring the receipt." ;
			close;
		case 11:
			//mes "Izlude 11 o'clock near the statue."
			//mes "Give it to "Krong" and bring the receipt."
			//mes "Bring it." ;
			mes "Lighthalzen 6 o'clock, near the arms shop, give it to "Krong" and bring the receipt." ;
			close;
		case 12:
			//mes "Comodo 12 o'clock, "Bismarck"";
			//mes "Give it to "Bismarck" and bring the receipt." ;
			mes "Hugel 1 o'clock, give to "Bismarck" near airship and bring receipt." ;
			close;
		case 13:
			mes "Payon 5 o'clock, give it to "Talpiz" near the airship and bring the receipt." ;
			close;
		}
	case 14:
		mes "[Geschu]";
		mes "Oh, welcome back!" ;
		mes "Umm, do you have a receipt?" ;
		next;
		if(select("Yes, this is it." , "Oh, sorry!") ==2) {
			mes "[Geschu]";
			mes "Ok. Let me know when you find the receipt." ;
			mes "You forgot to get it or something... You don't think that's possible, do you? Hahahahaha!" ;
			close;
		}
		if(countitem(1073) < 1) {
			mes "[Geschu]";
			mes "...... You say you forgot your receipt?" ;
			mes "...... That's ridiculous ......." ;
			next;
			mes "[Geschu]";
			mes "That's not going to happen, is it?" ;
			mes "How can we lose that!" ;
			next;
			mes "[Geschu]";
			mes "Receipts are a merchant's life! The pride of the blacksmith!" ;
			mes "It is unforgivable to forget it!" ;
			mes "Start from the beginning!" ;
			set CHANGE_BS,3; //start over from material procurement
			close;
		}
		mes "[Geschu]";
		mes "Oh! Okay... Certainly." ;
		mes "Perfect!!! You're really solid!!!! All right!!!" ;
		//mes "Geffen's 'Alt-Eisen'";
		mes "Go back to Einbroch's 'Alt-Eisen'. Yes, of the job change receptionist." ;
		mes "Good job, you are well qualified!" ;
		delitem 1073,1;
		set CHANGE_BS,15;
		close;
	case 15:
		mes "[Geschu]";
		mes "Mm, that was very good." ;
		//mes "Quickly, Geffen's 'Alt-Eisen'";
		//mes "Go back to the "Alt-Eisen"." ;
		mes "Quickly return to Einbroch's 'Alt-Eisen'." ;
		close;
	case 16:
	case 17:
		mes "[Geschu]";
		mes "Yeah? I'm not supposed to be here anymore?" ;
		//mes "towards Morroc or Geffen";
		mes "I thought you were going towards Einbroch?" ;
		close;
	}
	// Start the test when 1,2
	if(rand(2)) {
		mes "[Geschu]";
		mes "1. Which of the following does not match the region and the specialty?" ;
		next;
		if(select("Morroc - Thief Claus", "Alberta - Two Handed Axe", "Comodo - Berserk Potion", "Alberta - Sword Mace")==4)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "2. What is the effect of Blacksmith's skill "Eight Mar Falls" in the following?" ;
		next;
		if(select("stun", "darkdark", "silence", "sleep")==1)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "3. What of the following can't the merchant do?" ;
		next;
		if(select("open a stall", "buy goods at a lower price", "sell goods at a higher price", "run faster")==4)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "4. Where are the stores that sell blue gemstones?" ;
		next;
		if(select("Alberta", "Morroc", "Geffen", "Prontera")==3)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "5. Then where is Geffen's tool shop?" ;
		next;
		if(select("8 o'clock from Geffen tower", "11 o'clock from Geffen tower", "6 o'clock from Geffen tower", "5 o'clock from Geffen tower")==1)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "6. Which of the following weapons cannot be used by merchants?" ;
		next;
		if(select("stiletto", "ring-headed sword", "chain", "bible")==4)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "7. Which of the following defensive tools has the highest defense?" ;
		next;
		if(select("brief", "mink coat", "udun mail", "silk robe")==2)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "8. How far can you safely refine a level 3 weapon when refining it?" ;
		next;
		if(select("up to +3", "up to +4", "up to +5", "up to +6")==3)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "9. What items can be made from "wood chips"?" ;
		next;
		if(select("shades", "deceased's hair band", "majestic goat", "deer antlers")==1)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "10. What is the most important thing to you as a merchant?" ;
		next;
		if(select("trust", "sincerity", "money", "talk")) //all correct
			set '@point,'@point+10;
	}
	else {
		mes "[Geschu]";
		mes "1. Which of the following does not match the region and the specialty?" ;
		next;
		if(select("Aldebaran - Leaves of Igdrasil", "Alberta - Hammer", "Comodo - Potion of Madness", "Aldebaran - Hammer")==4)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "2. What is the price of a zeropy?" ;
		next;
		if(select("1 Zeny", "2 Zeny", "3 Zeny", "4 Zeny")==3)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "3. What are the requirements to open a stall?" ;
		next;
		if(select("must be equipped with a cart", "must have goods in hand", "must be equipped with a weapon", "must be equipped with armor")==1)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "4. Which of the following cities has a merchant job center?" ;
		next;
		if(select("Alberta", "Morroc", "Geffen", "Prontera")==1)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "5. Where is the arms store in Morroc?" ;
		next;
		if(select("7 o'clock from the center", "11 o'clock from the center", "3 o'clock from the center", "5 o'clock from the center")==4)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "6. What weapons can't the merchant use next?" ;
		next;
		if(select("Maingauche", "Claymore", "Chain", "Two Handed Axe")==2)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "7. Which of the following armor has the highest defense?" ;
		next;
		if(select("brief", "mink coat", "udun mail", "silk robe")==2)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "8. How far can you safely refine a level 3 weapon when refining it?" ;
		next;
		if(select("up to +3", "up to +4", "up to +5", "up to +6")==3)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "9. Which monsters do not drop iron ore?" ;
		next;
		if(select("Chonchon", "Steel Chonchon", "Zerom", "Anorean")==4)
			set '@point,'@point+10;
		mes "[Geschu]";
		mes "10. What is the most important thing for a merchant!!!?" ;
		next;
		if(select("Speech", "Trust", "Money", "Relationships")) //All of them are correct
			set '@point,'@point+10;
	}
	mes "[Geschu]";
	mes "Mm, ok! Good job!" ;
	next;
	mes "[Geschu]";
	mes "Let's see... What's the score..." ;
	mes ""+'@point+ "point!"" ;
	if( (CHANGE_BS == 1 && '@point < 90) || (CHANGE_BS == 2 && '@point < 80) ) {
		mes "........." ;
		next;
		mes "[Geschu]";
		mes "Hmmm, sorry, but I can't ask you to do the job unless you can clear this level of problems with ease." ;
		mes "Study up and come back." ;
		set CHANGE_BS,2;
		close;
	}
	mes "Oh! This is no problem!" ;
	mes "Then..." ;
	next;
	mes "[Geschu]";
	mes "Then, let's get some help with the job." ;
	mes "I'm going to do a little preparation, talk to you again in a little while." ;
	set CHANGE_BS,3;
	close;
}

//============================================================
// second test (delivery)
//------------------------------------------------------------
morocc.gat,27,112,4 script Hyugge 725,{
	switch(CHANGE_BS) {
	case 9:
		if(countitem(1219)) {
			cutin "job_black_hucke01",2;
			mes "[Hyugge]";
			mes "...... You got it!" ;
			mes "Give it to me!" ;
			next;
			mes "[Hyugge]";
			mes "This is what I ordered, right?" ;
			mes "I don't want what you used to use, etc., do I?" ;
			next;
			if(select("Ugh, this is... My..." , "No problem. It's new.")==1) {
				cutin "job_black_hucke03",2;
				mes "[Hyugge]";
				mes "... Kwah!" ;
				next;
				mes "- seems to be angry -";
				break;
			}
			cutin "job_black_hucke02",2;
			mes "[Hyugge]";
			mes "hahahahaha!" ;
			next;
			mes "- you look really happy -";
			next;
			cutin "job_black_hucke01",2;
			mes "[Hyugge]";
			//mes "with the Blacksmith guild in Geffen";
			mes "Tell Einbroch's Blacksmith Guild and your teacher, Geschu!" ;
			next;
			cutin "job_black_hucke03",2;
			mes "[Hyugge]";
			mes "It's late." ;
			mes "I hate waiting." ;
			next;
			cutin "job_black_hucke02",2;
			mes "[Hyugge]";
			mes "But the quality is good. Satisfied. And." ;
			next;
			mes "(I'm writing something.)" ;
			next;
			mes "[Hyugge]";
			mes "It's a receipt. I thank you too." ;
			delitem 1219,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			break;
		}
		//fall through
	default:
		cutin "job_black_hucke03",2;
		mes "[Hyugge]";
		mes ".........." ;
		mes "...... What I ordered... When is it coming?" ;
		next;
		mes "[Hyugge]";
		//mes "Blacksmith guild in Geffen..." ;
		mes "Blacksmith guild in Einbroch..." ;
		mes "Geschu... Too slow!" ;
		next;
		mes "[Hyugge]";
		mes "I'm so angry!" ;
		break;
	case 14:
		cutin "job_black_hucke02",2;
		mes "[Hyugge]";
		mes "Thank you." ;
		break;
	}
	close2;
	cutin "dummy",255;
	end;
}

geffen.gat,46,164,4 script Baisu 69,{
	switch(CHANGE_BS) {
	case 10:
		if(countitem(1610)) {
			mes "[Baisu]";
			mes "Oh my... You finally got it!" ;
			mes "Thanks - I was really waiting for it." ;
			next;
			mes "[Baisu]";
			mes "It's what I ordered, right?" ;
			mes "It's not a used one with your card in it or something, is it?" ;
			next;
			if(select("Oh, this is my..." , "No problem. It's new.")==1) {
				mes "[Baisu]";
				mes "... Get a grip." ;
				close;
			}
			mes "[Baisu]";
			mes "I know, hmmm..." ;
			next;
			mes "[Baisu]";
			//mes "to the Blacksmith guild in Geffen";
			//mes "If you ask, you can get a good arm in Alberta."; //mes "[Baisu]"; //mes "[Baisu]
			mes "I asked the Blacksmith guild in Einbroch, and they told me there was a good one in Einbech." ;
			next;
			mes "[Baisu]";
			mes "Thank you so much for coming all the way to such a far away place." ;
			mes "That Geschu guy, please give him a good beating. I've really been waiting for you." ;
			next;
			mes "[Baisu]";
			mes "Oh, wait - I'll give you a receipt." ;
			next;
			mes "-I wrote something -";
			next;
			mes "[Baisu]";
			mes "Yes, here it is. Well then, thank you for your time. Thank you so much -";
			delitem 1610,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[Baisu]";
		//mes "I'm in trouble... Alberta is too far away";
		mes "I'm in trouble... Einbech is too far away and the ordered goods are not coming..." ;
		next;
		mes "[Baisu]";
		//mes "to the Blacksmith guild in Geffen."
		//mes "When I requested it, I got a skilled". mes "in Alberta";
		mes "I asked the Blacksmith guild in Einbroch, and they told me there was a good one in Einbech." ;
		next;
		mes "[Baisu]";
		mes "I wonder when my "nice little arc wand" will come..." ;
		close;
	case 14:
		mes "[Baisu]";
		mes "Thank you very much." ;
		close;
	}
}

//izlude.gat,69,181,4 script Krong 734,{
lighthalzen.gat,209,80,4 script Krong 734,{
	switch(CHANGE_BS) {
	case 11:
		if(countitem(1119)) {
			mes "[Krong]";
			mes "Oh... You got it, didn't you?" ;
			mes "Great... Let's take a look at it." ;
			next;
			mes "[Krong]";
			mes "That's what I ordered, right?" ;
			mes "If it's something you used, no thanks." ;
			next;
			if(select("Ugh, this is... My..." , "No problem. It's new.")==1) {
				mes "[Krong]";
				mes "Please give me something decent!" ;
				mes "I don't want anything carded or refined!" ;
				next;
				mes "- you seem angry -";
				close;
			}
			mes "[Krong]";
			mes "Have you checked?" ;
			mes "Then... I'll take it." ;
			next;
			mes "[Krong]";
			mes "Oh... This will do..." ;
			mes "It's better than the custom specs." ;
			next;
			mes "[Krong]";
			mes "This Tsurugi would be... My special technique..." ;
			mes "You will be able to complete a two-character slash!" ;
			mes "I like it!" ;
			next;
			mes "[Krong]";
			mes "Well then... Receipt." ;
			next;
			mes "- I'm writing something -";
			next;
			mes "[Krong]";
			mes "Here's your receipt... Thanks for your time!" ;
			delitem 1119,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[Krong]";
		mes ".........." ;
		mes "...... When will my order arrive?" ;
		next;
		mes "[Krong]";
		mes "To complete the two letter slash..." ;
		mes "Even though that tsurugi is all I have..."; mes "[Krong]"; mes "[Krong] Oh..." ;
		next;
		mes "[Krong]";
		mes "Ohhhhhh ......." ;
		close;
	case 14:
		mes "[Krong]";
		mes "Thank you very much." ;
		close;
	}
}

//comodo.gat,158,342,4 script Bismarck 118,{
hugel.gat,168,183,4 script Bismarck 118,{
	switch(CHANGE_BS) {
	case 12:
		if(countitem(1122)) {
			mes "[Bismarck]";
			mes "Goho Goho ......" ;
			mes "Haa... Haa.... This... Give it over here..." ;
			next;
			mes "[Bismarck]";
			mes "I ordered... thing...?" ;
			mes "If it's not the same thing, I won't be able to help..." ;
			next;
			if(select("Ugh, this is... My..." , "No problem. It's new.")==1) {
				mes "[Bismarck]";
				mes "... Ji... Time... Quickly..." ;
				mes "Goho... Poison... Do... Poison..." ;
				next;
				mes "- weakening -";
				close;
			}
			mes "[Bismarck]";
			mes "So... I... I... to..." ;
			next;
			mes "[Bismarck]";
			mes "Kuu..." ;
			mes "Green herb treatment..." ;
			mes "It's done right..." ;
			next;
			mes "[Bismarck]";
			mes "Help me... I can't work alone..." ;
			mes "Gufu..." ;
			next;
			mes "- I hurt myself with my own hands..."; mes "- I hurt myself with my own hands...
			next;
			mes "[Bismarck]";
			mes "Ugh..." ;
			next;
			mes "[Bismarck]";
			mes "Phew... Looks like the detoxification is working..." ;
			next;
			mes "[Bismarck]";
			mes "Here... Receipt. Thank you for your help..." ;
			delitem 1122,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[Bismarck]";
		mes "...... Haa... Haa...." ;
		mes "...... Why doesn't what I ordered come...?" ;
		next;
		mes "[Bismarck]";
		mes "... I'm at my limit... The poison is all over my body..." ;
		mes "Ugh... Gufu..." ;
		next;
		mes "[Bismarck]";
		mes "Quick... Antidote... Antidote... ..." ;
		close;
	case 14:
		mes "[Bismarck]";
		mes "Thank you very much..." ;
		mes "Thanks for your help..." ;
		close;
	}
}

payon.gat,214,79,2 script Talpiz 59,{
	switch(CHANGE_BS) {
	case 13:
		if(countitem(1713)) {
			mes "[Talpiz]";
			mes "....... Oh. Finally!!! It's here!!!! Let me see!!!! Quickly!!!" ;
			next;
			mes "[Talpiz]";
			mes "This is what I ordered, right?" ;
			mes "I don't want what you've used up." ;
			next;
			if(select("Ugh, this is... My..." , "No problem. It's new.")==1) {
				mes "[Talpiz]";
				mes "Then give me something decent!" ;
				mes "Anything with cards in it or refined is fine!" ;
				next;
				mes "- you seem really angry -";
				close;
			}
			mes "[Talpiz]";
			mes "Good. It's new!" ;
			next;
			mes "[Talpiz]";
			mes "Ha ha ha ha..." ;
			mes "Excellent work!" ;
			next;
			mes "[Talpiz]";
			mes "This... This eye bag! It is a masterpiece!!! I love the way this is finished!!!! I really, really like it!!!" ;
			next;
			mes "[Talpiz]";
			mes "Thank you, thank you..." ;
			next;
			mes "-I'm writing something-";
			next;
			mes "[Talpiz]";
			mes "This is a receipt." ;
			mes "Thank you so much!" ;
			delitem 1713,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[Talpiz]";
		mes "Oh ......." ;
		mes "...... I wonder when the order will be ready..." ;
		next;
		mes "[Talpiz]";
		mes "I don't have a bag for my eye patch..." ;
		mes "Oh... The only person who could make such a bag for me is "that one"... Huh..." ;
		next;
		mes "[Talpiz]";
		mes "Oh... I wonder when it's coming..." ;
		close;
	case 14:
		mes "[Talpiz]";
		mes "The more you look, the more masterpieces you see: ......" ;
		close;
	}
}

//============================================================
// Third and final examination (final test)
//------------------------------------------------------------
//morocc.gat,95,133,4 script BlacksmithGuild Member 726,{
ein_in01.gat,24,41,4 script BlacksmithGuild Member 726,{
	switch(CHANGE_BS) {
	default:
		//mes "[Mittmeier]";
		//mes "Huh... Morroc is always";
		//mes "It's so hot!"; //mes "It's so hot!
		//mes "......" ;
		//next;
		//mes "[Mittmeier]";
		//mes "Well, we Blacksmiths";
		//mes "always in the heat near the fire";
		//mes "We work, so it's hot."
		//mes "I'm used to it." ;
		//next;
		//mes "[Mittmeier]";
		//mes "But... I don't want my skin to get darker..." ;
		//close;
		mes "[Mittmeier]";
		mes "Huh... Morroc was hot, but the smoke is hard here." ;
		mes "......" ;
		next;
		mes "[Mittmeier]";
		mes "But we Blacksmiths always do our best for the best weapon making with the Blacksmith Guild and our own honor." ;
		next;
		mes "[Mittmeier]";
		mes "Yes, I have the patience to beat anyone myself!" ;
		close;
	case 16:
		mes "[Mittmeier]";
		mes "Welcome. Hmmm, want to be a Blacksmith?" ;
		mes "Okay..." ;
		mes "But there's one more exam left." ;
		next;
		mes "[Mittmeier]";
		mes "I will ask you many questions about your ore knowledge and Blacksmith skills." ;
		mes "Well, let's begin..." ;
		next;
		if(select("yes", "no")==2) {
			mes "[Mittmeier]";
			mes "Yes, always ready to go." ;
			mes "It's the basis of Blacksmith mindset." ;
			close;
		}
		mes "[Mittmeier]";
		mes "Alright... I'll give you the problem..." ;
		mes "If you make some mistakes, you will not pass." ;
		next;
		mes "[Mittmeier]";
		mes "There are a total of five questions." ;
		mes "Please choose carefully." ;
		next;
		mes "[Mittmeier]";
		mes "... Go!" ;
		next;
		break;
	case 17:
		mes "[Mittmeier]";
		mes "Yes? You passed!" ;
		next;
		mes "[Mittmeier]";
		//mes "Please go back to Geffen." ;
		mes "Please go back to Einbroch." ;
		next;
		mes "[Mittmeier]";
		mes "The blacksmith's hammer... Don't forget it!" ;
		next;
		mes "[Mittmeier]";
		mes "Oh yeah, don't forget to roll all your skill points before you change jobs." ;
		close;
	}
	//final test from here
	switch(rand(3)) {
	case 0:
		mes "[Mittmeier]";
		mes "1. which monster drops Steel next?" ;
		next;
		set @menu,select("Zerom", "Steel Chonchon", "Skelwerker", "Requiem"); //2 and 3 are correct
		if(@menu == 2 || @menu == 3)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "2. What attribute stone can be made from red blood next?" ;
		next;
		if(select("Flame Heart", "Rough Wind", "Great Nature", "Mystic Frozen")==1)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "3. What is the largest number of attribute gemstones in your warehouse?" ;
		next;
		if(select("Wind of Verdure", "Red Blood", "Yellow Live", "Crystal Blue")) //All of them are correct
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "4. In general, what attribute is most effective when attacked with a wind weapon?" ;
		next;
		if(select("fire attribute", "water attribute", "earth attribute", "wind attribute")==2)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "5. How many iron do you need to make Steel?" ;
		next;
		if(select("5", "4", "3", "10")==1)
			set '@point,'@point+20;
		break;
	case 1:
		mes "[Mittmeier]";
		mes "1. what do you do when someone asks for help?" ;
		next;
		if(select("ask what they need", "listen for a while", "ignore", "give them an item and leave")<3) //1 and 2 are correct
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "2. Which city can learn loud voice and change carts?" ;
		next;
		if(select("Aldebaran", "Alberta", "Morroc", "Izlude")==2)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		//mes "3. with respect to the Geffen tower"; mes "[Mittmeier]"; mes "[Mittmeier]"; mes "[Mittmeier]
		mes "3. With respect to the gazebo, what is the location of the Blacksmith guild?" ;
		next;
		if(select("11 o'clock", "5 o'clock", "7 o'clock", "12 o'clock")==2)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "4. Which city has the most Blacksmiths?" ;
		next;
		//if(select("Prontera", "Morroc", "Alberta", "Geffen")==4)
		if(select("Prontera", "Morroc", "Alberta", "Einbroch")==4)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "5. What statuses affect production?" ;
		next;
		if(select("STR (strength)", "DEX (dexterity)", "AGI (speed)", "VIT (strength)")==2)
			set '@point,'@point+20;
		break;
	case 2:
		mes "[Mittmeier]";
		mes "1. In order to learn the discount, what is the necessary process?" ;
		next;
		if(select("Pushcart Lv3", "Item Appraisal", "Memmer Knight Lv10", "Increase Possession Limit Lv3")==4)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "2. what is the additional effect that appears when the hammerfall hits the target?" ;
		next;
		if(select("stun", "dark dark", "confusion", "silence")==1)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "3. How much Zeny is consumed when Memmer Knight Lv10 is activated?" ;
		next;
		if(select("900 Zeny", "1000 Zeny", "2000 Zeny", "100,000 Zeny")==2)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "4. Discount What is the discount rate for Lv 10?" ;
		next;
		if(select("21 %", "22 %", "23 %", "24 %")==4)
			set '@point,'@point+20;
		mes "[Mittmeier]";
		mes "5. overcharge What % can you sell for more at Lv 10?" ;
		next;
		if(select("21 %", "22 %", "23 %", "24 %")==4)
			set '@point,'@point+20;
	}
	mes "[Mittmeier]";
	mes "Good work..." ;
	next;
	mes "[Mittmeier]";
	mes "Hmmm... The score is " +'@point+ "point!" ;
	if('@point < 80) {
		mes "Remaining ghost... Please study more!" ;
		next;
		mes "[Mittmeier]";
		mes "This is... Absolutely impossible..." ;
		mes "Even if you become a blacksmith, you will get hurt..." ;
		close;
	}
	mes "Hmmm... Wonderful...!" ;
	mes "Congratulations. You passed!" ;
	next;
	mes "[Mittmeier]";
	mes "But don't let this get you down." ;
	mes "The real test begins when you become a Blacksmith." ;
	mes "Yes, this is a sign of success, the blacksmith's hammer -";
	getitem 1005,1;
	set CHANGE_BS,17;
	next;
	mes "[Mittmeier]";
	//mes "Take this, Geffen's";
	mes "Take this back to the Blacksmith guild in Einbroch." ;
	next;
	mes "[Mittmeier]";
	mes "Well then, good luck!!!" ;
	close;
}

//============================================================
// refining supplies sales rep.
//------------------------------------------------------------
ein_in.gat,38,29,4 script Paul Spanner 63,{
	if((MaxWeight - Weight) < 2000) {
		mes "-You cannot receive the item due to the high weight of the item you are carrying--please reduce the number of items you are carrying and then speak to me again.";
		close;
	}
	mes "[Paul Spanner]";
	mes "You've come a long way." ;
	mes "This place handles all items related to refining." ;
	mes "Tell me what you want." ;
	next;
	switch(select("buy an anvil", "buy refined products", "buy metals", "refine gemstones", "quit")) {
	case 1:
		mes "[Paul Spanner]";
		mes "The anvil is the basic item for refining." ;
		mes "Why don't you take the plunge and pick a good one?" ;
		next;
		switch(select("Anvil - 30000Zeny", "Oridecon anvil - 1200000Zeny", "Golden anvil - 300000Zeny", "Harder anvil", "Stop trading")) {
		case 1:
			set '@itemid,986;
			set '@price,30000;
			break;
		case 2:
			set '@itemid,987;
			set '@price,120000;
			break;
		case 3:
			set '@itemid,988;
			set '@price,300000;
			break;
		case 4:
			mes "[Paul Spanner]";
			mes "I don't see anything harder than a golden anvil." ;
			mes "If it's a harder metal, you won't find it in any other store." ;
			mes "...... If you're "Ringel," the legendary anvil maker, you can find it at ............." ;
			close;
		case 5:
			mes "[Paul Spanner]";
			mes "You can come back if you need something." ;
			close;
		}
		if(Zeny < '@price) {
			mes "[Paul Spanner]";
			mes "You're short on money." ;
			mes "Sorry, but this is business too." ;
			close;
		}
		set Zeny,Zeny-'@price;
		getitem '@itemid,1;
		switch(@menu) {
		case 1:
			mes "[Paul Spanner]";
			mes "It's probably the cheapest price but a good one." ;
			break;
		case 2:
			mes "[Paul Spanner]";
			mes "That's a pretty good eye." ;
			mes "As a blacksmith, an anvil of this size is probably a necessity." ;
			break;
		case 3:
			mes "[Paul Spanner]";
			mes "Just the choice of a golden anvil shows that you have a fine blacksmithing mind!" ;
			mes "Make a fine weapon with this best anvil." ;
			close;
		}
		break;
	case 2:
		mes "[Paul Spanner]";
		mes "It takes a lot of material to refine minerals and manufacture weapons." ;
		mes "All the items you need are here." ;
		mes "Pick the one you like." ;
		next;
		switch(select("Portable blast furnace - 150 Zeny", "Steel hammer - 1000 Zeny", "Golden hammer - 3000 Zeny", "Oridecon hammer - 5000 Zeny", "Stop trading")) {
		case 1:
			mes "[Paul Spanner]";
			mes "You need this guy for metal refining!!!" ;
			next;
			set '@itemid,612;
			set '@price,150;
			break;
		case 2:
			set '@itemid,613;
			set '@price,1000;
			break;
		case 3:
			set '@itemid,614;
			set '@price,3000;
			break;
		case 4:
			set '@itemid,615;
			set '@price,5000;
			break;
		case 5:
			mes "[Paul Spanner]";
			mes "You can come back if you need something." ;
			close;
		}
		mes "[Paul Spanner]";
		mes "Now, how many do you want?" ;
		mes "If you want to abort the deal, type '0'." ;
		while(1) {
			next;
			input '@num;
			if('@num < 0 || '@num > 500) {
				mes "[Paul Spanner]";
				mes "Decide on 500 or less." ;
				continue;
			}
			break;
		}
		if('@num == 0) {
			mes "[Paul Spanner]";
			mes "Deal aborted." ;
			mes "You can come back if you need anything." ;
			close;
		}
		if(Zeny < '@price*'@num) {
			mes "[Paul Spanner]";
			mes "You're short on money." ;
			mes "Sorry, but this is business too." ;
			close;
		}
		if(checkweight('@itemid,'@num)==0) {
			mes "[Paul Spanner]";
			mes "You can't hold that much, can you?" ;
			mes "Why don't you get your stuff in order first." ;
			close;
		}
		set Zeny,Zeny-'@price*'@num;
		getitem '@itemid,'@num;
		mes "[Paul Spanner]";
		break;
	case 3:
		mes "[Paul Spanner]";
		mes "I've only selected the purest of the pure." ;
		mes "We have ^007373Phracon^000000 for level 1 weapon smelting and ^007373Emveretarcon^000000 for level 2 weapon smelting." ;
		mes "Which metal are you buying?" ;
		next;
		if(checkweight(1010,10)==0 || checkweight(1011,10)==0) {
			mes "[Paul Spanner]";
			mes "That's a lot of luggage." ;
			mes "Sort out your belongings and come back again." ;
			close;
		}
		switch(select("Buy Phracon", "Buy Emveretarcon", "Quit the deal")) {
		case 1:
			set '@itemid,1010;
			set '@price,200;
			break;
		case 2:
			set '@itemid,1011;
			set '@price,1000;
			break;
		case 3:
			mes "[Paul Spanner]";
			mes "You can come back if you need something." ;
			close;
		}
		mes "[Paul Spanner]";
		mes "Now, how many do you want?" ;
		mes "If you want to abort the deal, type '0'." ;
		while(1) {
			next;
			input '@num;
			if('@num < 0 || '@num > 500) {
				mes "[Paul Spanner]";
				mes "Decide on 500 or less." ;
				continue;
			}
			break;
		}
		if('@num == 0) {
			mes "[Paul Spanner]";
			mes "Deal aborted." ;
			mes "You can come back if you need anything." ;
			close;
		}
		if(Zeny < '@price*'@num) {
			mes "[Paul Spanner]";
			mes "You're short on money." ;
			mes "Sorry, but this is business too." ;
			close;
		}
		if(checkweight('@itemid,'@num)==0) {
			mes "[Paul Spanner]";
			mes "You can't hold that much, can you?" ;
			mes "Why don't you get your stuff in order first." ;
			close;
		}
		set Zeny,Zeny-'@price*'@num;
		getitem '@itemid,'@num;
		mes "[Paul Spanner]";
		break;
	case 4:
		mes "[Paul Spanner]";
		mes "The metals that can be refined are Oridecon and Elunium." ;
		mes "Each of these five gemstones is refined to produce a metal of high purity." ;
		mes "Now ...... Which metal are you going to use?" ;
		next;
		switch(select("Make Oridecon", "Make Elunium", "Stop")) {
		case 1:
			set '@itemid,756;
			set '@gain,984;
			break;
		case 2:
			set '@itemid,757;
			set '@gain,985;
			break;
		case 3:
			mes "[Paul Spanner]";
			mes "You can come back if you need something." ;
			close;
		}
		if(countitem('@itemid)<5) {
			mes "[Paul Spanner]";
			mes ""+getitemname('@itemid)+ "if there are not 5 ";
			mes getitemname('@gain)+ "that you can't make";
			mes "Didn't I tell you?" ;
			close;
		}
		delitem '@itemid,5;
		getitem '@gain,1;
		mes "[Paul Spanner]";
		mes "Now," +getitemname('@gain)+ "that's it." ;
		mes "You can come back when you need it again." ;
		close;
	case 5:
		mes "[Paul Spanner]";
		mes "You can come back if you need anything else." ;
		close;
	}
	mes "Thanks." ;
	mes "You can come back if you need anything else." ;
	close;
}
