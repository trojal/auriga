//===============================================================================================
//Ragnarok Online Bard jobchange script
// - CHANGE_BA -> 0-4
// - CHANGE_BA -> 0-4
// LUTIE_1QUE -> Snow Snow Snow quest flag
//===============================================================================================

comodo.gat,211,155,5 script wandering bard 741,{
	cutin "job_bard_aiolo01",2;
	if(Upper == UPPER_HIGH) {
		mes "[aiolde]";
		mes "Men with the qualities of heroes are born countless times in that era, but they forget their potential and their destiny and live a life of mediocrity. ......" ;
		next;
		mes "[Aiolde]";
		mes "O winds, O clouds, tell everyone who eats and drinks and sings all their days that your life is not like that, that you have forgotten what is important. ......" ;
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	if(Job == Job_Novice) {
		mes "[aiolde]";
		mes "You can't count all the pain that's carved in your chest one by one, you know." ;
		mes "Items are easy to find, but I'm not sure if they'll add up to the journey..." ;
		mes "I haven't seen anything rare yet either." ;
		next;
		mes "[iolde]";
		mes "Would you like to hear me sing?" ;
		mes "I'm sorry." ;
		mes "I'm working on a new song." ;
		next;
		mes "[iolde]";
		mes "haha ...... Could you ask someone else to sing it for me?" ;
		mes "I'm a little out of my depth right now." ;
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	if(Job == Job_Bard) {
		mes "[aiolde]";
		mes "Hey, how are you singing today?" ;
		mes "Have you learned to sing a lot?" ;
		next;
		mes "[iolde]";
		mes "Singing conveys fun and excitement to people, so don't forget to learn new songs all the time." ;
		next;
		mes "[Aiolde]";
		mes "Don't forget to have a happy heart, too." ;
		mes "And sing to you everywhere you visit." ;
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	if(Job ! = Job_Archer) {
		mes "[aiolde]";
		mes "La la la la la la la la la la la la la beautiful Comodo - always full of fun";
		next;
		mes "[Aiolde]";
		mes "You, too, forget everything today ~ enjoy it to the fullest ~ because this day will not come twice!"; next; mes "[aiolde]
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	switch(CHANGE_BA) {
	case 0:
		mes "[aiolde]";
		if(Sex)
			mes "Hello! My delightful Archer friend";
		else {
			mes "Hello!" ;
			mes "Lovely Archer's lady"; else { mes "Hello!
		}
		mes "What do you want with a drifter like me?" ;
		next;
		switch(select("You have a nice voice." } mes "Please play me a song." , "I have no special use for you.")) {
			case 1:
				mes "[iolde]";
				mes "Hahaha! Of course I do!" ;
				mes "If you always sing with a happy heart, it will come naturally!" ;
				next;
				mes "[iolde]";
				mes "But in the profession of Bard, the voice is vital." ;
				mes "You have to be careful because sometimes your voice gets broken." ;
				break;
			case 2:
				mes "[iolde]";
				mes "You want to sing? No, thanks." ;
				mes "Then let's sing a song: ......." ;
				next;
				mes "[iolde]";
				mes "Let's sing a song about the battlefield." ;
				mes "Hm-hm, ho-ho-ho one, two, three, four~";
				next;
				mes "The sound of hoofbeats ringing from the horizon, the dust of Payon covering the setting sun, the moment when thousands of eyes are opened in the night sky, burn the torches of the citadel to a crisp.";
				next;
				mes "I hear it, the beating of my heart, the pulse of my blood, the weight of my armor, the enemy's figure";
				next;
				mes "Louder and louder, louder and louder, let it ring!" ;
				mes "Onward soldiers, put your strength into it!" ;
				mes "Shout louder, louder, louder!" ;
				mes "This day shall never come again!" ;
				next;
				mes "Look up to the sky and tread the earth!" ;
				mes "Let your ripped hearts run!" ;
				mes "Let the whistle roar on the ramparts!" ;
				mes "This day shall never come again!" ;
				next;
				mes "[iolde]";
				mes "Hummmmmm ...... It's always a good song to sing, don't you agree?" ;
				next;
				if(select("Yes, it's a good song." , "No, not really. ......") ==2) {
					cutin "job_bard_aiolo02",2;
					mes "[aiolde]";
					mes "Oh ...... Did my arm fall off?" ;
					mes "I'll have to work harder." ;
					mes "Anyway, thanks for asking." ;
					break;
				}
				mes "[iolde]";
				mes "Thanks! I'm glad you like my song." ;
				next;
				if(Sex == 1 && JobLevel >=40) {
					mes "[iolde]";
					mes "I wish more people sang this song: ......" ;
					mes "It's okay as it is, though. ...... Haha." ;
					set CHANGE_BA,1;
				}
				else {
					mes "[iolde]";
					mes "If you want to listen, come back." ;
				}
				break;
			case 3:
				cutin "job_bard_aiolo02",2;
				mes "[aiolde]";
				mes "Would you tell Bard not to ask me to sing?" ;
				mes "...... Hmmm, are you busy?" ;
				next;
				mes "[iolde]";
				mes "Hunting is good, but ......." ;
				mes "Why don't you have a little bit of heart." ;
				mes "This day is not coming back." ;
				break;
		}
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	case 1:
		mes "[aiolde]";
		mes "Hello! My merry Archer friends, what do you want with a drifter like me?" ;
		next;
		switch(select("You have a nice voice." , "Please play me a song." , "I have no special business.")) {
			case 1:
				mes "[iolde]";
				mes "Ha ha, you have a nice voice too." ;
				mes "Aren't you going to sing and see?" ;
				next;
				if(select("Of course!" , "I can't believe I'm singing ......") ==1) {
					mes "[iolde]";
					mes "Ha ha, good one. Mm-hmm." ;
					mes "Then let me help you become a Bard." ;
					next;
					mes "[iolde]";
					mes "But first, ......." ;
					mes "Could you bring me a flower?" ;
					mes "If I could smell the flower, I could teach it a good song." ;
					next;
					mes "[iolde]";
					mes "I don't care what kind of flowers you have, but could you bring me some flowers that I like, preferably ones that aren't sold." ;
					set CHANGE_BA,2;
				}
				else {
					mes "[iolde]";
					mes "Haha, don't be afraid." ;
					mes "Don't underestimate yourself." ;
					next;
					mes "[iolde]";
					mes "You're talented enough, so if you change your mind, come back and ask." ;
				}
				break;
			case 2:
				mes "[iolde]";
				mes "It's a residual GHOST, even though it looks like it has the potential to be a good singer." ;
				mes "Singing is not only fun to listen to, it's also fun to let other people hear you sing." ;
				next;
				mes "[iolde]";
				mes "It's also exceptional to go from village to village singing." ;
				mes "Would you like to live as a Bard too?" ;
				break;
			case 3:
				mes "[iolde]";
				mes "Yeah ...... I see." ;
				mes "That's a bit of a residual GOST." ;
				next;
				mes "[iolde]";
				mes "So, I'll see you somewhere~." ;
				break;
		}
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	case 2:
		mes "[aiolde]";
		mes "That was quick, my friend!" ;
		mes "Did you bring flowers?" ;
		mes "Can I see them?" ;
		next;
		if(countitem(629)) { //singing flowers
			mes "[iolde]";
			mes "Oh, isn't this a singing flower!" ;
			mes "It's my memory flower. ......." ;
			next;
			mes "[Aiolde]";
			mes "It's the flower that my friend, Gyorkowski, loved." ;
			mes "I wonder where he is now ......." ;
			delitem 629,1;
		}
		else if(countitem(703)) { //hinares
			mes "[iolde]";
			mes "Oh ...... Cute hinare..." ;
			mes "It doesn't have a scent, but it's a pretty, simple flower." ;
			next;
			mes "[aiolde]";
			mes "The daisy leaves are really helpful flowers that gave me strength when I fell. Thank you." ;
			delitem 703,1;
		}
		else if(countitem(704)) { //aloe
			mes "[iolde]";
			mes "Aloe or ...... This is rare." ;
			mes "I'm surprised you got it!" ;
			next;
			mes "[iolde]";
			mes "Aloe leaves are delicious, but ......" ;
			mes "The flowers are still the best." ;
			delitem 704,1;
		}
		else if(countitem(708)) { //ment
			mes "[iolde]";
			mes "ment ......" ;
			mes "I think I can remember something important..." ;
			mes "It's been a long time since I've seen it, and I'm so glad I did." ;
			next;
			mes "[iolde]";
			mes "I hear you can make antipayments..." ;
			mes "It's a shame to do so. Thanks." ;
			delitem 708,1;
		}
		else if(countitem(709)) { //idjdle
			mes "[iolde]";
			mes "Ah, this is Ijidol." ;
			mes "It's a dangerous but very beautiful flower. ......" ;
			next;
			mes "[iolde]";
			mes "Dark purple with a scent that makes one ecstatic. ......" ;
			mes "I like it. Thank you." ;
			delitem 709,1;
		}
		else if(countitem(710)) { //flowers of illusion
			mes "[iolde]";
			mes "Ya, this is the flower of illusion!" ;
			mes "I can't believe you brought such a precious thing!" ;
			next;
			mes "[iolde]";
			mes "Oh ...... I can see heaven right in front of me." ;
			mes "Great! I'm really happy!" ;
			delitem 710,1;
		}
		else if(countitem(748)) { //Wilting rose
			mes "[iolde]";
			mes "A rose that never wilts... A rose that never wilts." ;
			mes "You should have given it to your girlfriend instead of me." ;
			next;
			mes "[Iolde]";
			mes "I wonder if someone like me is allowed to receive it." ;
			mes "Haha, thank you." ;
			delitem 748,1;
		}
		else if(countitem(749)) { //ice rose
			mes "[iolde]";
			mes "Ice roses: ...... It's a transparent rose." ;
			mes "It may not be a flower, but it's still beautiful. ......" ;
			next;
			mes "[iolde]";
			mes "Yes, maybe it's a flower even if it doesn't have a scent wafting through the air." ;
			mes "I'll take it then." ;
			delitem 749,1;
		}
		else if(countitem(712)) { //flower
			cutin "job_bard_aiolo02",2;
			mes "[aiolde]";
			mes "What is it, you mediocre flower?" ;
			mes "A flower is a flower, but... This is not good enough." ;
			next;
			mes "[iolde]";
			mes "You have a girl for sale at Prontera." ;
			mes "Can you bring me some other flowers?" ;
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		else if(countitem(744)) { //hana taba
			mes "[aiolde]";
			mes "Houhou, you brought a bouquet of flowers." ;
			mes "This would not be something you would bring me.";
			next;
			mes "[Aiolde]";
			mes "It's a celebratory thing, why don't you give it to Mr. Novice who is changing jobs?" ;
			mes "For me, I'll take other flowers, please." ;
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		else if(countitem(745)) { //bouquet
			cutin "job_bard_aiolo02",2;
			mes "[aiolde]";
			mes "Hey hey ......" ;
			mes "Are you going to give me a wedding?" ;
			mes "What are you going to do, give the guy a bouquet?" ;
			next;
			mes "[iolde]";
			mes "You should give it to the right girl." ;
			mes "[iolde]"; mes "[iolde]"; mes "[iolde]"; mes "[iolde]"; mes "[iolde]"; mes "[iolde]" ;
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		else if(countitem(1032)) { //cannibalistic flower
			cutin "job_bard_aiolo02",2;
			mes "[aiolde]";
			mes "...... Why did you bring this ugly thing?" ;
			mes "You have to think a little more about it. ......" ;
			next;
			mes "[iolde]";
			mes "Were you trying to make me laugh?" ;
			mes "You need to prepare some more decent flowers." ;
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		else if(countitem(2207)) { //decorative flowers
			mes "[aiolde]";
			mes "umm ...... This is a decorative flower, isn't it?" ;
			mes "A flower is a flower, but... I guess this is not good enough." ;
			next;
			mes "[iolde]";
			mes "I like beautiful, fragrant flowers." ;
			mes "I don't like flowers just for decoration." ;
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		else {
			cutin "job_bard_aiolo02",2;
			mes "[aiolde]";
			mes "Yeah? You don't have anything." ;
			mes "Didn't I tell you to bring me flowers?" ;
			next;
			mes "[iolde]";
			mes "If you want to learn on your own, that's fine." ;
			mes "You're free to sing." ;
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		next;
		mes "[aiolde]";
		mes "Then I'll have to help you become a Bard, as promised." ;
		mes "But it's not going to be easy, my friend. Ha ha!" ;
		next;
		mes "[iolde]";
		mes "It's important to be in contact with many people in order to learn to sing." ;
		mes "You also have to see and hear about the various incidents in the villages here and there. ......" ;
		next;
		mes "[Aiolde]";
		mes "Yes, there is a talking snowman in a village called Lutie." ;
		mes "Go to that village and get him a gift. Good." ;
		next;
		mes "[Aiolde]";
		mes "If you make friends with Snownow, you will get something from him." ;
		mes "Why don't you go and have a lot of words with the people in the village?" ;
		set CHANGE_BA,3;
		set LUTIE_1QUE,1;
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	case 3:
		if(LUTIE_1QUE < 11) { //issued in npc_town_lutie.txt
			mes "[aiolde]";
			mes "Well, you couldn't be friends with him." ;
			mes "Sometimes words are not enough." ;
			next;
			mes "[iolde]";
			mes "If you make friends with Snow Noo, you'll get something from him." ;
			mes "Why don't you go and have a lot of words with the people in the village?" ;
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		mes "[aiolde]";
		mes "Welcome back." ;
		mes "Have you met a lot of people?" ;
		mes "You know there are more important things than gifts." ;
		next;
		mes "[iolde]";
		mes "So, let's sing a song and see: ......." ;
		mes "I'll sing a model for you and you'll see ......" ;
		mes "You can learn and sing it for me." ;
		next;
		mes "[iolde]";
		mes "Let's begin, hmmm hmmm, hmmm hmmm, hmmm 1, 2, 3, 4~";
		next;
		switch(rand(5)) {
		case 0: //Njord's song
			setarray '@list$, "Merchant who had no money", "Merchant who had no equipment", "I managed to make some money", "I sold clothes and swords", "At first I sold red potions", "I say I also sold potatoes at Prontera";
			break;
		case 1: //song of the battlefield
			setarray '@list$, "Play it louder!" @list$, "Onward soldiers, put your strength into it!" @list$, "Look up to the sky, tread on the earth!", "Tear yourselves apart! "Let the hearts that are breaking run out!" Let the whistles roar on the ramparts! "This day will never come again!" ;
			break;
		case 2: //Siegfried's song
			setarray '@list$, "called undead", "there was a man", "his name was 'Siegfried'", "son of the hero 'Siegmund'", "the evil giant 'Fafnir'", "turned into a dragon and blocked him";
			break;
		case 3: //Bragi's song
			setarray '@list$, "Bragi, Bragi", "Call the name of the Eternal Poet", "My song is his breath", "My heart is his will", "The bard is his incarnation", "All songs will return to him";
			break;
		case 4: //Idun's Song
			setarray '@list$, "The beautiful goddess Idun", "O beautiful and white goddess of fertility", "Wife of Bragi, son of Odin", "Her basket full of apples", "It will be because of her sweet apples", "The gods will never grow old forever";
			break;
		}
		for(set '@i,0; '@i<6; set '@i,'@i+1) {
			for(set '@j,0; '@j<6; set '@j,'@j+1)
				mes ""+(('@count<'@j)? "^000000": "^3173FF") +'@list$['@j]+ "^000000";
			next;
			input '@word$;
			if('@word$=='@list$['@i])
				set '@point,'@point+1;
		}
		if('@point<6) {
			cutin "job_bard_aiolo02",2;
			mes "[aiolde]";
			mes "Oh, hey, ...... You've got the wrong lyrics." ;
			mes "You have to sing it properly. ......" ;
			next;
			mes "[iolde]";
			mes "Your pronunciation seems to be a work in progress." ;
			mes "Next time, try to speak more properly." ;
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		mes "......" ;
		next;
		mes "[iolde]";
		mes "Splendid! That's great!" ;
		mes "This would make a good Bard!" ;
		next;
		mes "[iolde]";
		mes "Then..." ;
		mes "You can be Bard from now on." ;
		mes "Before that, I'd like to raise what will be KiGhost." ;
		next;
		mes "[iolde]";
		mes "Do you want to change jobs at this point?" ;
		mes "Or do you want something else?" ;
		next;
		if(select("I will change jobs as is." , "I would like a gift.") ==2) {
			mes "[iolde]";
			mes "Yeah... Yes." ;
			mes "Can you go get me some ^3173FF wood shavings^000000?" ;
			mes "I don't care what it is, just get me 60 of the same kind." ;
			next;
			mes "[iolde]";
			mes "If you bring them to me, I'll give you one of the KiGhost items." ;
			mes "Well, have a good day." ;
			set CHANGE_BA,4;
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
	case 4:
		if(SkillPoint) {
			mes "[aiolde]";
			mes "Oh... Looks like you still have some SkillPoints left." ;
			mes "You'll have to come back after you've used them all." ;
			next;
			mes "[iolde]";
			mes "So, I want to make a KiGhost product, so..." ;
			mes "Could you please collect ^3173FF wood shavings^000000?" ;
			mes "I don't care what it is, just give me 60 of the same kind." ;
			set CHANGE_BA,4;
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		if(CHANGE_BA == 3) break;
		if(countitem(1066) >= 60) {
			set '@trunkid,1066;
			set '@itemid,(JobLevel >= 50)? 1910: 1905;
		}
		else if(countitem(1067) >= 60) {
			set '@trunkid,1067;
			set '@itemid,1903;
		}
		else if(countitem(1068) >= 60) {
			set '@trunkid,1068;
			set '@itemid,1903;
		}
		else if(countitem(1019) >= 60) {
			set '@trunkid,1019;
			set '@itemid,1901;
		}
		else {
			mes "[iolde]";
			mes "Hmm, you were going to collect ^3173FF wood shavings^000000 and you decided to change jobs like this?" ;
			next;
			if(select("I'm going to change jobs as is." , "No, I'm going to go collect it.") ==2) {
				mes "[iolde]";
				mes "Yeah... Yes." ;
				mes "Can you go get me some ^3173FF wood shavings^000000?" ;
				mes "I don't care what it is, just get me 60 of the same kind." ;
				next;
				mes "[iolde]";
				mes "If you bring them to me, I'll give you one of the KiGhost items." ;
				mes "Well, have a good day." ;
				close2;
				cutin "job_bard_aiolo01",255;
				end;
			}
			break;
		}
		mes "[aiolde]";
		mes "Hey there." ;
		mes "I'll make you a job change journal GOST product as soon as I can." ;
		mes "Can you wait just a little while?" ;
		next;
		mes "^3173FF gee gee, tontan, tontan kankan, squeak squeak ^000000";
		next;
		delitem '@trunkid,60;
		getitem '@itemid,1;
		unequip;
		jobchange Job_Bard;
		set CHANGE_BA,0;
		mes "[iolde]";
		mes "Come on, it's a KiGhost item." ;
		mes "Can you use it when you sing?" ;
		mes "I want you to have fun singing with this." ;
		mes "Well, I'll see you soon!" ;
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	unequip;
	jobchange Job_Bard;
	set CHANGE_BA,0;
	mes "[iolde]";
	mes "Yes! Let's have fun singing." ;
	mes "Like the wind, like the clouds!" ;
	next;
	mes "[iolde]";
	mes "Well, I'll see you soon!" ;
	close2;
	cutin "job_bard_aiolo01",255;
	end;
}
