//===============================================================================================
//Ragnarok Online Monk jobchange script
// - CHANGE_MO -> 0-20
// - CHANGE_MO -> 0-20
// @monk_test -> 0-10, marathon laps
//===============================================================================================

//==========================================
// Job change guide
//------------------------------------------

prt_monk.gat,59,247,4 script Guarding Monk 120,6,2,{
	if(Job == Job_Monk) {
		mes "[Tohobu]";
		mes "Welcome to St. Capitolina Monastery." ;
		mes "Please do not disturb Monk in his training." ;
		mes "Even if you are Monk: ......." ;
		close;
	}
	switch(CHANGE_MO) {
	case 0:
		mes "[Tohobu]";
		mes "NON...... What do you want from me?" ;
		mes "If you want to enter the sacred training hall, you will have to provide me with your name and JobLv before you can enter." ;
		next;
		if(Upper == UPPER_HIGH) {
			mes "[Tohobu]";
			mes "Ah ......" ;
			mes "Sorry!" ;
			mes "I made a mistake looking at ......." ;
			next;
			mes "[Tohobu]";
			mes "......" ;
			mes "............" ;
			next;
			mes "[Tohobu]";
			mes "It's rare that I make a mistake ......" ;
			mes "...... Have a good day." ;
			close;
		}
		mes "[Tohobu]";
		mes "Now, your name and JobLv." ;
		next;
		if(select("ignore", "teach")==1) {
			mes "[Tohobu]";
			mes "Rude! Get out!" ;
			close2;
			warp "prt_fild03.gat",357,256;
			end;
		}
		mes "[Tohobu]";
		mes "un......" +strcharinfo(0);
		mes "Yes. ......." ;
		mes "JobLv is " +JobLevel+ "is it?" ;
		next;
		mes "[Tohobu]";
		mes "Well, what brings you here?" ;
		mes ""+strcharinfo(0)+ "Yo ......"" ;
		setarray '@word$, "To see Monk and his friends in training", "To be a Monk", "To take a break at the training center";
		break;
	case 1:
		if(Job == Job_Acolyte && JobLevel >= 40) {
			mes "[Tohobu]";
			mes "How are you doing?" ;
			mes "Have you changed your mind?" ;
			setarray '@word$, "No", "I want to be a Monk!" mes "I'm going to take some more time off";
			break;
		}
		mes "[Tohobu]";
		mes "Take your time to look around." ;
		mes "You might get something out of it." ;
		close;
	case 2:
		mes "[Tohobu]";
		mes "Meet Sensei Moohae." ;
		mes "Sensei should be inside the monastery, southeast of here." ;
		close;
	default:
		mes "[Tohobu]";
		mes "Un ...... Please overcome the hard training and become a good Monk." ;
		close;
	}
	// menu section
	next;
	switch(select('@word$[0],'@word$[1],'@word$[2])) {
	case 1:
		mes "[Tohobu]";
		mes "Yeah, I see. ......" ;
		mes "I understand." ;
		mes "I hope that our Monk's training will be of some help." ;
		set CHANGE_MO,1;
		close;
	case 2:
		if(Job ! = Job_Acolyte) {
			mes "[Tohobu]";
			mes "Haha, you make interesting jokes." ;
			close;
		}
		if(JobLevel < 40) {
			mes "[Tohobu]";
			mes "Yeah ...... It appears you are not yet qualified for it." ;
			mes "We only allow people with an AcolyteJobLv of 40 or higher to qualify for the ordeal." ;
			next;
			mes "[Tohobu]";
			mes "Well, since you have come a long way, it would be a good idea to observe the training of Monk and the others." ;
			next;
			mes "[Tohobu]";
			mes "I hope that our Monk's training will be of some use to you." ;
			set CHANGE_MO,1;
			close;
		}
		mes "[Tohobu]";
		mes "Yeah, JobLv seems to have reached a certain level." ;
		mes "Okay, go inside and meet Sensei Moohae. He will guide you." ;
		set CHANGE_MO,2;
		close;
	case 3:
		mes "[Tohobu]";
		mes "I see. ...... You look tired after a long trip, it's important to rest once in a while." ;
		mes "You may want to take a rest here at Monk Training Center." ;
		next;
		mes "[Tohobu]";
		mes "I hope that our Monk's always striving to get closer to God will help you in your training." ;
		set CHANGE_MO,1;
		close;
	}
OnTouch:
	if(Job == Job_Monk)
		end;
	switch(CHANGE_MO) {
	case 0:
		mes "[Tohobu]";
		mes "What are you!" ;
		mes "You are not allowed to enter this sacred training ground without my permission!" ;
		next;
		mes "[Tohobu]";
		mes "Leave quickly!" ;
		close;
	case 1:
		mes "[Tohobu]";
		mes "Take your time." ;
		mes "You might get something out of it." ;
		close;
	case 2:
		mes "[Tohobu]";
		mes "Meet Sensei Moohae." ;
		mes "Sensei should be inside the monastery, southeast of here." ;
		close;
	default:
		mes "[Tohobu]";
		mes "Un ...... Please overcome the hard training and become a good Monk." ;
		close;
	}
}

//==========================================
// Application for examination and change of job
//------------------------------------------

monk_in.gat,99,58,4 script Sensei 60,{
	mes "[Sensei Moohae]";
	mes "May the power of earth and chi bring good fortune to all. ......" ;
	mes "Hmm, what brings you to me?" ;
	next;
	if(SkillPoint) {
		mes "[Sensei Moohae]";
		mes "You can't change jobs if you still have SkillPoints!" ;
		mes "Go ahead and consume everyone." ;
		close;
	}
	if(Job == Job_Monk) {
		mes "[Sensei Moohae]";
		mes "Are you continuing your training?" ;
		mes "Always try to be diligent." ;
		next;
		mes "[Sensei Moohae]";
		mes "We must train our bodies and maintain a strong spirit or the evil one will come for them." ;
		next;
		mes "[Sensei Moohae]";
		mes "Always remember that we are the agents of God, the agents of divine punishment." ;
		mes "[Sensei Moohae]"; mes "Be careful not to be taken advantage of by the evil will." ;
		close;
	}
	if(Job ! = Job_Acolyte) {
		mes "[Sensei Moohae]";
		mes "If you need advice, go to Prontera Cathedral. This is not a consultation center." ;
		mes "[Sensei Moohae]"; mes "I have nothing to say to a man of another profession, as you are." ;
		close;
	}
	switch(CHANGE_MO) {
	case 0:
	case 1:
		mes "[Sensei Moohae]";
		mes "You are Acolyte." ;
		mes "If you need advice, go to Prontera Cathedral. This is not a consultation center." ;
		mes "If you are not going to be a Monk, go somewhere else." ;
		close;
	case 2:
		mes "[Sensei Moohae]";
		mes "Sounds like a young man who wants to be a Monk. ......?" ;
		next;
		if(select("yes", "no")==2) {
			mes "[Sensei Moohae]";
			mes "Hmmm ......" ;
			mes "My intuition has waned. ......" ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Hmmm ...... I didn't realize that even in these times, there are still those who remember us Monk's existence. ......" ;
		mes "You've come a long way," +(Sex? "Young man": "daughter") + "Yo." ;
		next;
		mes "[Sensei Moohae]";
		mes "Monk Aspiring Student or ......" ;
		mes "Glad to hear it." ;
		mes "Just in case, there is something you need to know before becoming a Monk." ;
		next;
		mes "[Sensei Moohae]";
		mes "We Monk are those who, while serving God, train our own bodies to the utmost limit, and pass on our faith to the world." ;
		next;
		mes "[Sensei Moohae]";
		mes "To train one's body is to repel those who would oppose one's faith, to be in harmony with all things of nature, and to receive its blessings for oneself." ;
		next;
		mes "[Sensei Moohae]";
		mes "Of course, it is also important to train your spirit and repel evil ghosts." ;
		next;
		mes "[Sensei Moohae]";
		mes "These training processes may be very severe and involve great suffering." ;
		mes "but whether or not you can endure this will be the difference between whether or not you can become a Monk." ;
		next;
		mes "[Sensei Moohae]";
		mes "Now, then, I would like to test whether you have the firm will to become a Monk and serve God." ;
		next;
		mes "[Sensei Moohae]";
		mes "First, I will see if you are ready for that, so gather the following." ;
		next;
		set CHANGE_MO,rand(3,9);
		switch(CHANGE_MO) {
		case 3: //sticky liquid 5, worm skin 10, green herb 20
			setarray '@need,938,1055,511;
			setarray '@amount,5,10,20;
			break;
		case 4: //monkey tail 20, iron ore 5, blue herb 3
			setarray '@need,942,1002,510;
			setarray '@amount,20,5,3;
			break;
		case 5: //plant stems 30, zeropy 5, bugskin 10
			setarray '@need,905,909,955;
			setarray '@amount,30,5,10;
			break;
		case 6: //very tough skin 5, tough skin 20, jargon 5
			setarray '@need,943,935,912;
			setarray '@amount,5,20,5;
			break;
		case 7: //cypher 5, white herb 10, yellow herb 10
			setarray '@need,7053,509,508;
			setarray '@amount,5,10,10;
			break;
		case 8: //bats' fangs 10, bears' sole 5, poisonous mushroom spores 20
			setarray '@need,913,948,7033;
			setarray '@amount,10,5,20;
			break;
		case 9: //hedgehog needle 5, spider silk 20, short legs 10
			setarray '@need,1027,1025,1042;
			setarray '@amount,5,20,10;
			break;
		}
		mes "[Sensei Moohae]";
		for(set '@i,0; '@i<3; set '@i,'@i+1)
			mes ""+getitemname('@need['@i])+ " " " +'@amount['@i]+ "Collect the pieces."" ;
		next;
		mes "[Sensei Moohae]";
		mes "Since you are going to test yourself, go and collect them directly with your own hands." ;
		next;
		mes "[Sensei Moohae]";
		mes "Then come back when you have gathered." ;
		mes "Let's go!" ;
		mes "God bless you." ;
		close;
	case 3:
	case 4:
	case 5:
	
	case 7: case 8: close
	
	case 9:
		mes "[Sensei Moohae]";
		mes "Fumuu ......" ;
		next;
		switch(CHANGE_MO) {
		case 3: //sticky liquid 5, worm skin 10, green herb 20
			setarray '@need,938,1055,511;
			setarray '@amount,5,10,20;
			break;
		case 4: //monkey tail 20, iron ore 5, blue herb 3
			setarray '@need,942,1002,510;
			setarray '@amount,20,5,3;
			break;
		case 5: //plant stems 30, zeropy 5, bugskin 10
			setarray '@need,905,909,955;
			setarray '@amount,30,5,10;
			break;
		case 6: //very tough skin 5, tough skin 20, jargon 5
			setarray '@need,943,935,912;
			setarray '@amount,5,20,5;
			break;
		case 7: //cypher 5, white herb 10, yellow herb 10
			setarray '@need,7053,509,508;
			setarray '@amount,5,10,10;
			break;
		case 8: //bats' fangs 10, bears' sole 5, poisonous mushroom spores 20
			setarray '@need,913,948,7033;
			setarray '@amount,10,5,20;
			break;
		case 9: //hedgehog needle 5, spider silk 20, short legs 10
			setarray '@need,1027,1025,1042;
			setarray '@amount,5,20,10;
			break;
		}
		for(set '@i,0; '@i<3; set '@i,'@i+1) {
			if(countitem('@need['@i]) < '@amount['@i]) {
				mes "[Sensei Moohae]";
				mes "Not ready yet." ;
				mes "The following are to be collected." ;
				for(set '@i,0; '@i<3; set '@i,'@i+1)
					mes ""+getitemname('@need['@i])+ " " " +'@amount['@i]+ "Collect the following." ;
				close;
			}
		}
		for(set '@i,0; '@i<3; set '@i,'@i+1)
			delitem '@need['@i],'@amount['@i];
		set CHANGE_MO,10;
		mes "[Sensei Moohae]";
		mes "Mm! You've got it all!" ;
		mes "You've had a hard time!" ;
		mes "But I'm sure your will was conveyed to God." ;
		next;
		mes "[Sensei Moohae]";
		mes "All right, then, let us proceed to the next stage of your training." ;
		mes "[Sensei Moohae]"; mes "[Sensei Moohae]"; mes "[Sensei Moohae]" ;
		mes "He should be in the cemetery north of here." ;
		close;
	case 10:
		mes "[Sensei Moohae]";
		mes "You will proceed to the next training." ;
		mes "Go to [Touha]." ;
		mes "He should be in the cemetery north of here." ;
		close;
	default: //11-19.
		mes "[Sensei Moohae]";
		mes "Mm, he's in training." ;
		mes "Make an effort." ;
		close;
	case 20:
		if(countitem(506)) {
			mes "[Sensei Moohae]";
			mes "Hm? You haven't taken the elixir yet." ;
			mes "Take a potion similar to that green potion." ;
			mes "You can't prepare your body as a Monk without taking that potion." ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "You have completed all your training." ;
		mes "You are now fully qualified to become a Monk." ;
		mes "The elixir you just drank has prepared your body." ;
		next;
		mes "[Sensei Moohae]";
		mes "You didn't throw away your precious medicine, did you?" ;
		mes "Then, if you recite the pledge to live as Monk, your job change is complete." ;
		next;
		mes "[Sensei Moohae]";
		mes "Do you dedicate your entire remaining life to the service of God?" ;
		next;
		if(select("Yes", "No")==2) {
			mes "[Sensei Moohae]";
			mes "......" ;
			mes "You say you haven't made up your mind to be a Monk yet?" ;
			mes "Go and train a little more." ;
			mes "We cannot let those who are tainted with evil become Monk." ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Do you use your acquired abilities only for your own sake?" ;
		next;
		if(select("yes", "no")==1) {
			mes "[Sensei Moohae]";
			mes "No. We Monk's power is not used only for ourselves." ;
			mes "We must live with the awareness that we are God's agents and executors of God's punishment." ;
			mes "How dare you use it for yourself!" ;
			next;
			mes "[Sensei Moohae]";
			mes "Go and think carefully again about what kind of being Monk is." ;
			mes "With such a mindset, you will be tainted by the greed of the world and will gradually lose your ability." ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Do you not hesitate to pass righteous judgment on those who defile God?" ;
		next;
		if(select("Yes", "No")==2) {
			mes "[Sensei Moohae]";
			mes "What do you know of us Monk?" ;
			mes "No one should defile God in the world." ;
			next;
			mes "[Sensei Moohae]";
			mes "Go and train a little more in Acolyte." ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "When you judge justice, will you do so without regard for your own sacrifice?" ;
		next;
		if(select("yes", "no")==2) {
			mes "[Sensei Moohae]";
			mes "You must not be so prepared." ;
			mes "It is admirable to do justice even at the cost of oneself." ;
			next;
			mes "[Sensei Moohae]";
			mes "Go and think carefully about what sacrifice means." ;
			mes "It is never easy. ......" ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Do you help others in battle, even if you have to drag many monsters along with you?" ;
		next;
		if(select("yes", "no")==1) {
			mes "[Sensei Moohae]";
			mes "It shall not be done." ;
			mes "Bringing in many monsters will be the seed of more sacrifices. We must refrain from such behavior." ;
			next;
			mes "[Sensei Moohae]";
			mes "Even with our strong minds and bodies, we will never be perfect." ;
			next;
			mes "[Sensei Moohae]";
			mes "Even if it is our intention to help others, it may end up causing things to be even worse than they are." ;
			mes "Go think again about what Monk should do." ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Do you walk in the streets and villages, uttering the same words?" ;
		next;
		if(select("Yes", "No")==1) {
			mes "[Sensei Moohae]";
			mes "No." ;
			mes "This is not just for Monk, but for all humans." ;
			mes "I'm sure they won't take you seriously if you yell too loudly." ;
			next;
			mes "[Sensei Moohae]";
			mes "It's the same when you preach." ;
			mes "[Sensei Moohae]"; mes "[Sensei Moohae]"; mes "Reflect once again on your actions." ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Are you aware that you are God's agent and can you dedicate yourself to God?" ;
		next;
		if(select("yes", "no")==2) {
			mes "[Sensei Moohae]";
			mes "You cannot become a Monk with that kind of knowledge." ;
			mes "It would make sense if we could reduce the number of the ungodly to one less with our death." ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Finally, swear to uphold all that you have just said." ;
		next;
		if(select("I swear", "I can't")==2) {
			mes "[Sensei Moohae]";
			mes "......" ;
			next;
			mes "[Sensei Moohae]";
			mes "I guess I haven't had enough training yet." ;
			mes ""+(Sex? "Youth": "Daughter")+ "Yo, I can't admit you to Monk yet." ;
			next;
			mes "[Sensei Moohae]";
			mes "It would be better to start the training from the beginning again, but ......" ;
			mes "Calm your mind and come again." ;
			next;
			mes "[Sensei Moohae]";
			mes ""+(Sex? "Youth": "Daughter")+ "May the faith be transmitted to ......" ;
			close;
		}
		mes "[Sensei Moohae]";
		mes "Then we will conclude our pledge ceremony." ;
		mes "Our" +(Sex? "brother": "sister")+ ", now born here!" ;
		next;
		mes "[Sensei Moohae]";
		mes ""+(Sex? "Youth": "Daughter")+ "The pledge of ""+(Sex? "Youth": "Daughter")+ ""has been conveyed to my breast, your breast, and to God who watches over us."" ;
		next;
		mes "[Sensei Moohae]";
		mes "Then I will now pierce your meridians." ;
		next;
		mes "[Sensei Moohae]";
		mes "Now ...... I'm going to poke 365 meridians from now on. Don't move!" ;
		next;
		mes "[Sensei Moohae]";
		mes "Kahhhh";
		next;
		mes "[Sensei Moohae]"; mes "[Sensei Moohae]
		mes "Hooooooooooo";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "- after the master took a deep breath -"; mes "[" +strcharinfo(0)+ "]"; next; mes "[
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "- began to poke my meridians -"; next; mes "[" +strcharinfo(0)+ "]"; next; mes "[
		next;
		mes "[Sensei Moohae]";
		mes "Nuorya!" ;
		next;
		mes "[Sensei Moohae]"; mes "[Sensei Moohae]
		mes "Atatata atatata!"; next; mes "[Sensei Moohae]
		next;
		mes "[Sensei Moohae]";
		mes "Say!" ;
		next;
		mes "[Sensei Moohae]";
		mes "Choyer!" ;
		next;
		mes "[Sensei Moohae]";
		mes "Hooooooooooooo";
		next;
		mes "[Sensei Moohae]";
		mes "Owww!" ;
		next;
		set '@itemid,(JobLevel >= 50)? 1804: 1801;
		unequip;
		jobchange job_Monk;
		set CHANGE_MO,0;
		mes "[Sensei Moohae]";
		mes "Your job change is complete." ;
		next;
		mes "[Sensei Moohae]";
		mes "Kukku ......." ;
		next;
		mes "[Sensei Moohae]";
		mes "After all, ...... You can't beat old age. ......" ;
		next;
		mes "[Sensei Moohae]";
		mes "Come on, you're Monk." ;
		mes "Let's celebrate being comrades." ;
		next;
		mes "[Sensei Moohae]";
		mes "Do not forget the pledge you just made." ;
		next;
		mes "[Sensei Moohae]";
		mes "Do not forget your own practice with unwavering faith." ;
		next;
		mes "[Sensei Moohae]";
		mes "This is a gift of celebration I give to you." ;
		mes "[Sensei Moohae]"; mes "Be useful." ;
		getitem '@itemid,1;
		close;
	}
}

//==========================================
// First test (recitation of the heart's knowledge)
//------------------------------------------

prt_monk.gat,251,255,4 script Touha 79,{
	switch(CHANGE_MO) {
	default:
		mes "[Touha]";
		mes "We at Monk are the voice of God ......" ;
		mes "And the agent of God's punishment!" ;
		next;
		mes "[Touha]";
		mes "To block our way, that is to say, against God!" ;
		next;
		mes "[Touha]";
		mes "Therefore ......" ;
		mes "Are you an enemy too! Because you blocked my way ......" ;
		next;
		mes "[Touha]";
		mes "For blocking my front ......" ;
		mes "......" ;
		mes "Keeeeeeeeeeeeeee!" ;
		next;
		mes "[Touha]";
		mes "Hahaha ......" ;
		next;
		mes "[Touha]";
		mes "Surprised?" ;
		mes "What, it's a pretense." ;
		close;
	case 10:
		mes "[Touha]";
		mes "What do you want?" ;
		mes "Do you want to talk about God?" ;
		next;
		mes "[Touha]";
		mes "You are continuing your training to Monk. Your chi flow is much closer to that of Monk." ;
		next;
		mes "[Touha]";
		mes "When you realize that your chi veins are open, you should go to Sensei Moohae-sama." ;
		next;
		mes "[Touha]";
		mes "I teach about the knowledge that every would-be Monk must know." ;
		mes "After you have understood the teachings from me, you will train your body." ;
		next;
		mes "[Touha]";
		mes "You may memorize what I am about to say and recite it later." ;
		mes "Now, are you mentally focused?" ;
		next;
		if(select("yes", "no")==2) {
			mes "[Touha]";
			mes "Come back when you are ready." ;
			close;
		}
		mes "[Touha]";
		mes "Then ......." ;
		next;
		mes "[Touha]";
		mes "Listen carefully and learn it by heart." ;
		set CHANGE_MO,rand(11,13);
		break;
	case 11:
	case 12:
	case 13:
		mes "[Touha]";
		mes "Good, let's chant again." ;
		break;
	case 14:
		mes "[Touha]";
		mes "Yeah ......?" ;
		mes "I already told you who to go to ......." ;
		next;
		mes "[Touha]";
		mes "If you have ......" ;
		next;
		mes "[Touha]";
		mes "Are you testing my patience or ......?" ;
		next;
		mes "[Touha]";
		mes "Good." ;
		mes "Once again, please see Master Boohae." ;
		close;
	case 15:
		mes "[Touha]";
		mes "Please also complete the remaining training." ;
		close;
	}
	next;
	switch(CHANGE_MO) {
	case 11:
		setarray '@list$, "Judgment on those who avenge God! @list$, "Damnation for the avenger of God!", "End for the avenger of God!" case 11: setarray '@list$, "Judgment on God's avengers! break; "We, Monk," "carry God's will to the earth," "speak for God," "represent God's punishment," "though we be cut and burned," "all for God's sake," "to judge those who avenge God!"
		break;
	case 12:
		setarray '@list$, "God's Advocate", "God's Punishment Agent", "Monk", "Our mission", "with the bodies we have been given", "to avenge", "the foolish", "the wicked who roam", "to hunt down", "the wicked to the end", "to extinguish";
		break;
	case 13:
		setarray '@list$, "to carry the voice of God to the world", "with the given body", "we Monk", "are the agent of God's punishment", "are the voice of God", "our mission", "is to avenge", "those who cannot even die", "the foolish", "the foolish", "are to be exterminated";
		break;
	}
	for(set '@i,0; '@i<10; set '@i,'@i+1) {
		mes "[Touha]";
		mes ""+'@list$['@i];
		next;
	}
	mes "[Touha]";
	mes "Yes, this is it." ;
	mes ""+strcharinfo(0)+ ", it's your turn." ;
	next;
	function Shuffle;
	for(set '@c,0; '@c<10; set '@c,'@c+1) {
		Shuffle '@list$;
		set '@ret,select( @monk_word$[0],@monk_word$[1],@monk_word$[2],@monk_word$[3],@monk_word$[4],
					@monk_word$[5],@monk_word$[6],@monk_word$[7],@monk_word$[8],@monk_word$[9])-1;
		if('@c == 0)
			mes "["+strcharinfo(0)+"]";
		mes ""+@monk_word$['@ret];
		if(@monk_word$['@ret] == '@list$['@c])
			set '@point,'@point+1;
	}
	cleararray @monk_word$,""",10; //delete because it is not used anymore
	next;
	mes "[Touha]";
	mes "Fuu......" ;
	mes "Thanks for your help." ;
	next;
	mes "[Touha]";
	mes "Now ......." ;
	next;
	if('@point == 10) {
		mes "[Touha]";
		mes "Admirable, that was perfect." ;
		next;
		mes "[Touha]";
		mes "But don't let your guard down." ;
		mes "The road to Monk is still hard ......" ;
		next;
		mes "[Touha]";
		mes "Taaah!" ;
		next;
		mes "Say!" ;
		next;
		mes "Huh!" ;
		next;
		mes "Yah!" ;
		next;
		mes "[Touha]";
		mes "It seems your veins are one step closer to that of Monk's." ;
		next;
		mes "[Touha]";
		mes "Then go to Master Boohae and see." ;
		set CHANGE_MO,14;
		close;
	}
	mes "[Touha]";
	mes "Nn...... I can't even remember this much. ......" ;
	next;
	mes "[Touha]";
	mes "As I said before, don't just memorize it, but understand it by heart." ;
	next;
	mes "[Touha]";
	mes "Now, let's try again." ;
	next;
	mes "[Touha]";
	mes "Just so you know, we can't go on without finishing this." ;
	close;

	//'Shuffle the strings in @list$ and store them in @monk_word$.
	function Shuffle {
		setarray '@num,0,1,2,3,4,5,6,7,8,9;
		for(set '@i,10; '@i>0; set '@i,'@i-1) {
			set '@r,rand('@i);
			set @monk_word$[10-'@i],getelementofarray(getarg(0),'@num['@r]); //treat as global variable
			deletearray '@num['@r],1; //remove selected number
		}
		return;
	}
}

//==========================================
// Secondary Examination (Subjective Examination)
//------------------------------------------

prt_monk.gat,57,179,0 script Boohae 110,{
	switch(CHANGE_MO) {
	default:
		mes "[Boohae]";
		mes "Haaaa!" ;
		next;
		mes "- seems to be lost in meditation -"; mes "[Boohae]"; mes "[Boohae]"; mes "[Boohae]
		close;
	case 14:
		mes "[Boohae]";
		mes "......" ;
		next;
		mes "[Boohae]";
		mes "............" ;
		next;
		mes "[Boohae]";
		mes ".................." ;
		next;
		mes "[Boohae]";
		mes "........................" ;
		next;
		menu "that ......" ,-;
		mes "[Boohae]";
		mes "What the ......" ;
		mes "You must have a good reason for interrupting my conversation with God, right?" ;
		next;
		mes "[Boohae]";
		mes "......" ;
		mes "First, let's take that life." ;
		next;
		mes "[Boohae]";
		mes "Now, explain what you're here for." ;
		next;
		if(select("I came here on the referral of Mr. Touha.", "It's nothing.")==2) {
			mes "[Boohae]";
			mes "......" ;
			mes "Hmmm ...... Don't think you'll make it back in one piece?" ;
			close;
		}
		mes "[Boohae]";
		mes "Yeah? I see. ......" ;
		mes "Which ......" ;
		next;
		mes "[Boohae]";
		mes "Hmm......" ;
		mes "The veins are ......" ;
		mes "Well, okay ......" ;
		next;
		mes "[Boohae]";
		mes "By the way, what did you do with Touha?" ;
		next;
		if(select("Oh ...... Uh ......" , "I recited the sentence", "I had the bloodline diagnosed")! =2) {
			mes "[Boohae]";
			mes "Tawane ga!" ;
			mes "Don't interrupt!" ;
			close;
		}
		mes "[Boohae]";
		mes "Hmm, do ......" ;
		mes "What was the result?" ;
		next;
		switch(select("Oh ...... What was it ......" , "I worked out", "You taught me the rudiments to Monk", "You brought me closer to Monk's veins")) {
			default:
				mes "[Boohae]";
				mes "Tawane ga!" ;
				mes "Don't interrupt me!" ;
				close;
			case 3:
				mes "[Boohae]";
				mes "Sounds right but ......" ;
				mes "Not an exact answer." ;
				close;
			case 4:
				mes "[Boohae]";
				mes "Yes, you are aware of what has changed in your body." ;
				mes "Okay, let's move on to the next practice." ;
				next;
				mes "[Boohae]";
				mes "Okay, I'll give you a choice about your training." ;
				mes "You may choose one of the following to practice." ;
				next;
				if(select("mushroom gathering", "marathon")==1) {
					mes "[Boohae]";
					mes "Hmm, mushroom gathering means to train patience." ;
					mes "Okay. You can talk to me again after you finish your preparations." ;
					set CHANGE_MO,15;
				}
				else {
					mes "[Boohae]";
					mes "Hmmm, you say you're getting a strong body while assessing the limits of your physical strength." ;
					mes "Good, you may speak to me again when you have finished your preparations." ;
					set CHANGE_MO,16;
				}
				close;
		}
	case 15:
		mes "[Boohae]";
		mes "Are you ready?" ;
		next;
		mes "[Boohae]";
		mes "Your choice of mushroom gathering is a test of patience, if you will." ;
		next;
		mes "[Boohae]";
		mes "You will take the test with a like-minded person here in the monastery." ;
		next;
		mes "[Boohae]";
		mes "The more people who take the test at the same time, the more difficult it will be to find the mushrooms, but they are friends trying to walk the same path. Don't fight it." ;
		close;
	case 16:
		mes "[Boohae]";
		mes "Are you ready?" ;
		next;
		mes "[Boohae]";
		mes "The marathon you've chosen to run is, metaphorically speaking, a battle against yourself." ;
		next;
		mes "[Boohae]";
		mes "You may enter the monastery here." ;
		next;
		mes "[Boohae]";
		mes "The test is to go around a certain course a specified number of times." ;
		mes "Then go." ;
		close;
	}
}

prt_monk.gat,199,169,3 script guardian general 746,{
	mes "[Keeper Chorip]";
	mes "This is Monk job change testing site." ;
	next;
	switch(CHANGE_MO) {
	default:
		mes "[Keeper Chorip]";
		mes "Quiet inside!" ;
		close;
	case 14:
		mes "[Keeper Chorip]";
		mes "Are you Mr. Boohae, ......?" ;
		next;
		mes "[Keeper Chorip]";
		mes "Mr. Boohae prefers a quiet place." ;
		mes "Like in a corner. ......" ;
		close;
	case 15:
	case 16:
		mes "[Keeper Chorip]";
		mes ""+strcharinfo(0)+ "...... is it?" ;
		next;
		if(select("Yes!" No")==1) {
			mes "[Keeper Chorip]";
			mes "Okay, good reply!" ;
			mes "The test is waiting for you!" ;
			mes "Please come inside." ;
			close;
		}
		mes "[Keeper Chorip]";
		mes "It can't be different!" ;
		mes "Come on, get inside!" ;
		close;
	}
}

monk_test.gat,329,61,3 script Teaching Assistant 753,{
	switch(CHANGE_MO) {
	default:
		mes "[Bashu]";
		mes "Hello, this is Monk training center, St. Capitolina Monastery." ;
		mes "Inside you will find Dumon-sama." ;
		next;
		mes "[Bashu]";
		mes "Please refrain from touching things that are placed here and there, or just making noise." ;
		close;
	case 15:
	case 16:
		mes "[Bashu]";
		mes "Which test site do you want to move to?" ;
		next;
		mes "[Bashu]";
		mes "In case you're wondering, from what I've heard";
		mes ((CHANGE_MO==15)? "Mushroom gathering": "Marathon")+"It was an exam, but ......" ;
		mes "The choice is yours." ;
		next;
		if(select("patience-mushroom collecting", "fight with yourself-marathon exam")==1) {
			mes "You have selected Patience - Mushroom gathering test." ;
			set CHANGE_MO,15;
			close2;
			warp "job_monk.gat",226,175;
		}
		else {
			mes "Challenge to myself - I chose to run a marathon." ;
			set CHANGE_MO,16;
			close2;
			warp "monk_test.gat",386,387;
		}
		end;
	}
}

//==========================================
// Assignment test (mushroom collecting)
//------------------------------------------

job_monk.gat,225,180,0 script Teaching Assistant 89,{
	if(countitem(1069)) { //no response only for red hair gooey mushrooms
		if(countitem(1069) >=30 || countitem(1070) >=30) {
			mes "[Genbu]";
			mes "Mm! Excellent!" ;
			mes "You may proceed." ;
			next;
			mes "[Xuanwu]";
			mes "Next, you may see Master [Dumon]." ;
			mes "Doumon-sama should be at the far end of the monastery building." ;
			delitem 1069,countitem(1069);
			delitem 1070,countitem(1070);
			set CHANGE_MO,17;
			close2;
			warp "prt_monk.gat",194,168;
			end;
		}
		mes "[Genbu]";
		mes "Muuu...... Still not much." ;
		next;
		mes "[Genbu]";
		mes "Give up?" ;
		next;
		if(select("Find more mushrooms", "Give up")==1) {
			mes "[Genbu]";
			mes "Go for it!" ;
			close;
		}
	}
	} else {
		mes "[Genbu]";
		mes "Okay, I am in charge of this mushroom collection trial, and my name is 'Genbu'." ;
		next;
		mes "[Genbu]";
		mes "Think of the hardship you are about to experience as an ordeal, so to speak." ;
		next;
		mes "[Genbu]";
		mes "We cultivate simple crops as part of our spiritual practice." ;
		mes "But recently, we've been getting some terrible smelling mushrooms around those crops. ......" ;
		next;
		mes "[Xuanwu]";
		mes "You're going to help me eradicate that mushroom." ;
		mes "If you can cut down some of them, you can bring proof of that." ;
		next;
		mes "[Xuanwu]";
		mes "The evidence is the Red Hair Net Mushroom and the Red Hair Sticky Mushroom." ;
		next;
		mes "[Genbu]";
		mes "If you want to become a Monk quickly, quickly collect these." ;
		mes "I don't tell you how many to collect, but come back and show me when you have collected some." ;
		next;
		mes "[Genbu]";
		mes "Shall we begin then?" ;
		next;
		if(select("hunt mushrooms", "give up")==1) {
			mes "[Genbu]";
			mes "Then good luck!" ;
			close;
		}
	}
	announce "Teaching Assistant: " +strcharinfo(0)+ ", job change exam - mushroom gathering - declined ghost",9;
	mes "[Genbu]";
	mes "You don't have guts either. ......" ;
	close2;
	warp "prt_monk.gat",194,168;
	end;
}

//==========================================
// Assignment test (marathon)
//------------------------------------------

monk_test.gat,386,388,4 script Teaching Assistant 110,{
	mes "[Apprentice Monk]";
	mes "Welcome Welcome." ;
	mes "This is a testing ground to test yourself." ;
	next;
	mes "[Apprentice Monk]";
	mes "but it's just a run." ;
	mes "Anyway, you just run and run." ;
	next;
	mes "[Apprentice Monk]";
	mes "You must not give up in the middle of the race." ;
	next;
	if(select("I can't", "run anyway")==2) {
		mes "[Apprentice Monk]";
		mes "Yes, keep running!" ;
		close;
	}
	announce "Teaching Assistant: " +strcharinfo(0)+ "; mes ", abandon the job change exam!" ,9;
	mes "[Apprentice Monk]";
	mes ""+strcharinfo(0)+ ", Abandon job change exam!" ;
	set @monk_test,0;
	close2;
	warp "prt_monk.gat",194,168;
	end;
}

@monk_test.gat,387,350,0 script #MO_Goal 45,2,2,{
	set @monk_test,@monk_test+1;
	if(@monk_test == 9) {
		warp "monk_test.gat",385,388;
		sleep 500;
		announce "Director: okay, last lap. When you finish this, the test is over." ,9;
		end;
	}
	if(@monk_test == 10) {
		announce "Director: good job, " +strcharinfo(0)+ "! You finished the race!" ,9;
		mes "[Test director]";
		mes "Okay, go to "Doumon"-sama." ;
		mes "Dumon-sama is at the far end inside the monastery." ;
		set CHANGE_MO,17;
		close2;
		warp "prt_monk.gat",194,168;
		end;
	}
	warp "monk_test.gat",385,388;
	end;
}

monk_test.gat,82,384,0 script #MO_Abyss 139,0,0,{
	announce "Pitfall: " +strcharinfo(0)+ ", off course. Start from the original position." ,9;
	warp "monk_test.gat",387,387;
	end;
}

monk_test.gat,82,385,0 duplicate(#MO_Abyss) pit 139,0,0
monk_test.gat,83,384,0 duplicate(#MO_Abyss) pit 139,0,0
monk_test.gat,83,385,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,82,390,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,82,391,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,83,390,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,83,391,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,38,387,0 duplicate(#MO_Abyss) Pit 139,0,1
monk_test.gat,38,389,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,39,387,0 duplicate(#MO_Abyss) pitfall 139,0,1
monk_test.gat,39,389,0 duplicate(#MO_Abyss) pitfall 139,0,0
monk_test.gat,11,158,0 duplicate(#MO_Abyss) Pit 139,1,0
monk_test.gat,13,158,0 duplicate(#MO_Abyss) pit 139,0,0
monk_test.gat,11,159,0 duplicate(#MO_Abyss) pitfall 139,1,0
monk_test.gat,13,159,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,11,30,0 duplicate(#MO_Abyss) Pit 139,3,0
monk_test.gat,15,30,0 duplicate(#MO_Abyss) pit 139,0,0
monk_test.gat,11,31,0 duplicate(#MO_Abyss) pitfall 139,3,0
monk_test.gat,15,31,0 duplicate(#MO_Abyss) pitfall 139,0,0
monk_test.gat,70,11,0 duplicate(#MO_Abyss) Pit 139,0,1
monk_test.gat,70,13,0 duplicate(#MO_Abyss) pitfall 139,0,0
monk_test.gat,71,11,0 duplicate(#MO_Abyss) Pit 139,0,1
monk_test.gat,71,13,0 duplicate(#MO_Abyss) pitfall 139,0,0
monk_test.gat,186,11,0 duplicate(#MO_Abyss) Pit 139,2,3
monk_test.gat,189,11,0 duplicate(#MO_Abyss) pitfall 139,0,3
monk_test.gat,387,42,0 duplicate(#MO_Abyss) Pit 139,1,0
monk_test.gat,387,43,0 duplicate(#MO_Abyss) pitfall 139,1,0
monk_test.gat,389,42,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,389,43,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,387,164,0 duplicate(#MO_Abyss) pit 139,1,0
monk_test.gat,387,165,0 duplicate(#MO_Abyss) pitfall 139,1,0
monk_test.gat,389,164,0 duplicate(#MO_Abyss) Pit 139,0,0
monk_test.gat,389,165,0 duplicate(#MO_Abyss) pitfall 139,0,0

//==========================================
// Tertiary test (Driving Demon Practice)
//------------------------------------------

monk_test.gat,319,139,4 script Doumen 52,{
	switch(CHANGE_MO) {
	default:
		mes "[Doumon]";
		mes "Be quiet ......" ;
		mes "Fuuuuuuuuuu......" ;
		next;
		mes "[Doumen]";
		mes "Here in the Monastery of St. Capitolina, the great works left behind by our predecessors are laid to rest." ;
		next;
		mes "[Dumon]";
		mes "Do not release the sleep of our arch-enemy sealed behind that ......" ;
		close;
	case 17:
		mes "[Dumon]";
		mes "Well done for your efforts here!" ;
		mes "I am in charge of the last test, the Exterminating Demon training, and my name is "Dumon"." ;
		next;
		mes "[Doumen]";
		mes "Come on, no words are needed!" ;
		mes "There is only action." ;
		next;
		mes "[Doumen]";
		mes "All the 'demons' that appear in the maze must be wiped out of the world by your hand." ;
		next;
		mes "[Doumen]";
		mes "Don't be with the weak Priest." ;
		mes "We have strong, well-trained bodies." ;
		next;
		mes "[Doumen]";
		mes "Now, clench your fists and stand up!" ;
		next;
		mes "[Doumen]";
		mes "Show your strength to the fullest!" ;
		set CHANGE_MO,18;
		close2;
		warp "monk_test.gat",88,74;
		end;
	case 18:
		mes "[Doumon]";
		mes "umu......" ;
		mes "They say failure is the mother of success." ;
		mes "Come on, let's go with force!" ;
		close2;
		warp "monk_test.gat",88,74;
		end;
	case 19:
		mes "[Doumon]";
		mes "Well done!" ;
		mes "You didn't miss a beat in my eyes." ;
		mes "All right, let's raise your inner merit." ;
		next;
		mes "[Doumen]";
		mes "If you drink it, your inner merit will increase and you should be qualified to be a Monk." ;
		mes "Then go to the "no-life" Sensei!" ;
		getitem 506,1;
		set CHANGE_MO,20;
		close;
	case 20:
		mes "[Doumon]";
		mes "Go to Sensei Moohae!" ;
		close;
	}
}

monk_test.gat,88,91,4 script exam director#MO_Test 52,{
	mes "[Doumen]";
	mes "Now, are you ready for your extermination training?" ;
	next;
	switch(select("Yes", "No", "Ask Attention Matters")) {
	case 1:
		mes "[Doumon]";
		mes "Then I wish you good luck." ;
		mes "If you get lost in the maze and can't get back home, you can exit once: ......." ;
		mes "In that case, though, you'll be returned to the last place you recorded." ;
		close2;
		if(strnpcinfo(2) == "MO_Test")
			warp "monk_test.gat",125,177;
		else if(strnpcinfo(2) == "MO_Test1")
			warp "monk_test.gat",125,277;
		else if(strnpcinfo(2) == "MO_Test1")
			warp "monk_test.gat",229,277;
		if(getnpctimer(1, "MO_Timer") == 0) //start timer if it stopped
			initnpctimer "MO_Timer";
		end;
	case 2:
		mes "[Doumon]";
		mes "Talk to me when you're ready." ;
		close;
	case 3:
		mes "[Doumen]";
		mes "There is an invisible wall inside the testing center." ;
		mes "For the sake of training, we have put up wards so that you cannot move around easily." ;
		next;
		mes "[Doumen]";
		mes "If you reach the other side from the starting position, you will find the exit." ;
		next;
		mes "[Doumen]";
		mes "The evil one is roaming inside the training hall." ;
		mes "If they block your way, do not hesitate to strike them down." ;
		mes "Then I wish you good luck." ;
		close;
	}
}

monk_test.gat,82,85,1 duplicate(exam director#MO_Test) exam director#MO_Test1 95
monk_test.gat,95,85,4 duplicate(exam director#MO_Test) exam director#MO_Test2 79

//==============================================================
monk_test.gat,140,181,0 script #MO_Test1-1 139,1,1,{
	monster "monk_test.gat",140,181, "zombie",1015,4;
	end;
}

monk_test.gat,150,164,0 script #MO_Test1-2 139,1,1,{
	monster "monk_test.gat",150,164, "zombie",1015,4;
	end;
}

monk_test.gat,158,192,0 script #MO_Test1-3 139,1,1,{
	monster "monk_test.gat",158,192, "Mummy",1041,1;
	end;
}

monk_test.gat,134,291,0 script #MO_Test2-1 139,1,1,{
	monster "monk_test.gat",134,291, "zombie",1015,4;
	end;
}

monk_test.gat,144,277,0 script #MO_Test2-2 139,1,1,{
	monster "monk_test.gat",144,277, "zombie",1015,4;
	end;
}

monk_test.gat,149,268,0 script #MO_Test2-3 139,1,1,{
	monster "monk_test.gat",149,268, "zombie",1015,5;
	end;
}

monk_test.gat,249,277,0 script #MO_Test3-1 139,1,1,{
	monster "monk_test.gat",249,277, "zombie",1015,4;
	end;
}

monk_test.gat,252,284,0 script #MO_Test3-2 139,1,1,{
	monster "monk_test.gat",252,284, "mummy",1041,1;
	end;
}

monk_test.gat,264,292,0 script #MO_Test3-3 139,1,1,{
	monster "monk_test.gat",264,292, "Mommy",1041,1;
	end;
}

//==============================================================
monk_test.gat,0,0,0 script MO_Timer -1,{
	end;
OnTimer100000:
	killmonster "monk_test.gat", "All";
	// stop timer if no one is in the test area
	if(getareausers("this",124,158,167,197) + getareausers("this",124,259,167,296) + getareausers("this",228,258,271,297) == 0)
		stopnpctimer;
	else
		initnpctimer;
	end;
}

//==============================================================

monk_test.gat,166,178,0 script #MO_Goal_ 45,1,1,{
	mes "[Test director]";
	mes "Okay, you did a great job." ;
	mes "Go back to Doumon-sama." ;
	set CHANGE_MO,19;
	close2;
	warp "prt_monk.gat",196,168;
	end;
}

monk_test.gat,166,278,0 duplicate(#MO_Goal_) #MO_Goal 45,1,1
monk_test.gat,270,278,0 duplicate(#MO_Goal_) #MO_Goal 45,1,1
