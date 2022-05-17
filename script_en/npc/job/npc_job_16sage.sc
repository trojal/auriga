//= Athena Script ==============================================================
//= Ragnarok Online Sage Jobchange Script by Blaze
//= Registry ===================================================================
// CHANGE_SA -> 0-15
//==============================================================================

//============================================================
// Job change
//------------------------------------------------------------
yuno_in02.gat,38,61,5 script President of the Academy of Magic 743,{
	cutin "job_sage_kayron",2;
	if(Upper == UPPER_HIGH) {
		mes "[Kayron-Gulick]";
		mes "hmm ......" ;
		mes "I've been watching people for a long time, and you have a special 'gift', don't you?" ;
		next;
		mes "[Chiron-Glick]";
		mes "You should get out in the world more and use your abilities instead of being in a place like this." ;
		mes "Don't forget your first love, you know." ;
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	if(Job == Job_Sage) {
		mes "[Kayron-Gulick]";
		mes "Hmm, what can I do for you?" ;
		mes "Don't neglect your studies just because you're a Sage." ;
		next;
		mes "[Chiron-Glick]";
		mes "Our knowledge has contributed greatly to the development of this continent." ;
		mes "[Chiron-Gulick]"; mes "[Chiron-Gulick]"; mes "[Chiron-Gulick]"; mes "[Chiron-Gulick]"; mes "[Chiron-Gulick]" ;
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	if(Job == Job_Novice) {
		mes "[Kayron-Glick]";
		mes "Hmm? What brings you here?" ;
		mes "You must have had a hard time getting here, are you so interested in Sage?" ;
		next;
		mes "[Chiron-Gulick]";
		mes "If you are interested in the studies Sage is learning, go become a 'Magician' first, study and gain insight." ;
		mes "I look forward to seeing you again someday." ;
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	if(Job ! = Job_Magician) {
		mes "[Kayron=Glick]";
		mes "Hmmm ...... We study this world every day, but there is something missing." ;
		mes "It is knowledge based on experience that people in other professions gain ......." ;
		next;
		mes "[Chiron-Gulick]";
		mes "If there is a Sage nearby, I would like you guys to talk to him often about the experience you have gained." ;
		mes "They should be able to help you too." ;
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	switch(CHANGE_SA) {
	case 0:
	case 1:
	case 2:
		mes "[Chiron-Glick]";
		mes "Welcome to your passion for magic." ;
		mes "What brings you here?" ;
		next;
		switch(select("I want to change jobs to Sage", "Tell me about changing jobs to Sage", "Nothing")) {
		case 1:
			mes "[Chiron-Glick]";
			mes "Yeah ..... .you want to change jobs at Sage?" ;
			mes "changing jobs and ......." ;
			mes "I'd have to change that mindset first." ;
			next;
			mes "[Chiron-Glick]";
			mes "A Sage is a person who contributes to the development of a continent through endless study and documentation of the things of the world." ;
			mes "Therefore, if you just change your clothes and look different, it is meaningless." ;
			next;
			mes "[Chiron-Glick]";
			mes "First, submit an application for admission to the Schweichel Academy of Magic." ;
			mes "They should be able to explain it to you well there." ;
			break;
		case 2:
			mes "[Chiron-Glick]";
			mes "Sage job change ......" ;
			mes "No one calls becoming a Sage a "career change"." ;
			next;
			mes "[Chiron-Glick]";
			mes "To become a Sage, you must first submit an application for admission to the Schweichel Academy of Magic." ;
			mes "Then take the entrance exam." ;
			next;
			mes "[Chiron-Glick]";
			mes "After taking the exam, you will be required to do further research on your major subject and submit a thesis at the end." ;
			next;
			mes "[Chiron-Gulick]";
			mes "I will review and evaluate your paper." ;
			mes "If you pass there, I will qualify you to live as a Sage." ;
			next;
			mes "[Chiron-Glick]";
			mes "First, go to the Schweichel Magic Academy and see." ;
			mes "Make sure you apply to a young Sage named Metheus-Silp." ;
			break;
		case 3:
			mes "[Chiron-Glick]";
			mes "Hmmm ...... If you have the time, I suggest you read one of the books." ;
			mes "You can learn most things in the world from books." ;
			next;
			mes "[Chiron-Glick]";
			mes "Of course, not everything can be learned from books alone." ;
			mes "Still, we at Sage value books as a treasure trove of knowledge." ;
			break;
		}
		close2;
		cutin "job_sage_kayron",255;
		end;
	default: //when 3 to 10
		mes "[Kayron-Gulick]";
		mes "Ha, the road to becoming a Sage is never easy." ;
		mes "Just being able to use magic well doesn't get you anywhere, you know." ;
		next;
		mes "[Chiron-Gulick]";
		mes "Good luck finishing your paper. I'll be waiting for you." ;
		break;
	case 15:
		if(countitem(1550) < 1) {
			mes "[Chiron-Glick]";
			mes "Yeah? What happened to your paper?" ;
			mes "Bring it in quickly if you want to show it to me." ;
			next;
			mes "[Chiron-Gulick]";
			mes "You didn't forget, did you?" ;
			mes "Let's wait for them to bring it anyway." ;
			break;
		}
		if(SkillPoint) {
			mes "[Chiron-Glick]";
			mes "You still have some skills left to assign." ;
			mes "Go learn the skills you can acquire before submitting your paper." ;
			break;
		}
		mes "[Chiron-Glick]";
		mes "Yeah, looks like you worked hard on your paper." ;
		mes "Let's have a look at it then." ;
		next;
		mes "[Chiron-Gulick]";
		mes "Yeah ......." ;
		next;
		mes "[Chiron-Gulick]"; mes "[Chiron-Gulick]
		mes "hmm......" ;
		next;
		mes "[Chiron-Gulick]"; mes "[Chiron-Gulick]
		mes "Mmm......" ;
		next;
		mes "[Chiron-Gulick]";
		mes "Not quite stylized yet, but ......" ;
		mes "Your paper shows your enthusiasm for research." ;
		mes "Okay, good." ;
		next;
		set CHANGE_SA,0;
		unequip;
		jobchange Job_Sage;
		mes "[Chiron-Gulick]";
		mes "Graduation!" ;
		mes "From now on, you will live as a Sage." ;
		mes "Remember your eagerness to learn in the future." ;
		next;
		mes "[Chiron-Gulick]";
		mes "Keep your papers in a safe place." ;
		mes "It is the only book you have written." ;
		mes "It may be useful to you." ;
		next;
		mes "[Chiron-Glick]";
		mes "Now, learn diligently so that you yourself may be a storehouse of knowledge!" ;
		break;
	}
	close2;
	cutin "job_sage_kayron",255;
	end;
}

//============================================================
// test application
//------------------------------------------------------------
yuno_in03.gat,154,35,4 script Academy Official 742,{
	if(Job == Job_Sage) {
		mes "[Metheus=Silp]";
		mes "Welcome." ;
		mes "It's been a while." ;
		mes "How is your research going?" ;
		next;
		mes "[Metheus-Silp]";
		mes "It is good to study alone based on books and materials, but sometimes it is important to go outside and confront the monsters directly." ;
		next;
		mes "[Metheus=Silp]";
		mes "If there are any Sage applicants, please teach them well." ;
		mes "Please give my best wishes to the other colleagues." ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Metheus-Silp]";
		mes "Welcome." ;
		mes "This is the Schweichel Academy of Magic." ;
		next;
		mes "[Metheus-Silp]";
		mes "We are an institution that trains Sage and conducts research on monsters and magic." ;
		mes "We also welcome enrollment at any time." ;
		next;
		mes "[Metheus-Silp]";
		mes "If you are a Magician and have JobLv 40 or higher, you are welcome to enroll." ;
		mes "You can become a Sage through a defined process." ;
		next;
		mes "[Metheus-Silp]";
		mes "If you are interested in Sage, please visit again." ;
		mes "Have a nice day then." ;
		close;
	}
	if(Job ! = Job_Magician || Upper == UPPER_HIGH) {
		mes "[Metheus=Silp]";
		mes "Welcome." ;
		mes "This is the Schweichel Magic Academy." ;
		next;
		mes "[Metheus-Silp]";
		mes "We are an institution that trains Sage and conducts research on monsters and magic." ;
		next;
		mes "[Metheus-Silp]";
		mes "If you are a Magician and have JobLv 40 or higher, you can enroll." ;
		mes "You can become a Sage through a defined process." ;
		mes "If you know someone nearby who is a Magician, please let them know." ;
		next;
		mes "[Metheus-Silp]";
		mes "Have a nice day then." ;
		close;
	}
	switch(CHANGE_SA) {
	case 0:
		mes "[Metheus=silp]";
		mes "Welcome." ;
		mes "This is the Schweichel Academy of Magic." ;
		mes "You must be the Magician." ;
		mes "How may I help you here?" ;
		next;
		switch(select("Tell me about your new job at Sage", "I would like to apply for admission", "Nothing")) {
		case 1:
			mes "[Metheus=silp]";
			mes "Would you like to apply for a new job at Sage?" ;
			mes "However, we are not giving you a job change." ;
			next;
			mes "[Metheus-Silp]";
			mes "Only those who have enrolled in our academy and completed the prescribed process will be certified for formal research work." ;
			next;
			mes "[Metheus-Silp]";
			mes "Therefore, we call it graduation, not a career change." ;
			mes "If you pay the enrollment fee along with your application for admission, you can take the exam." ;
			next;
			mes "[Metheus-Silp]";
			mes "However, only those with the special ^3355FF old magic book ^000000 and ^3355FF keen eye ^000000 will be exempted from paying the entrance fee." ;
			next;
			mes "[Metheus=silp]";
			mes "As soon as your registration is complete, you may take the exam." ;
			mes "Once you pass the entrance exam, you will be asked to do research on your theme." ;
			mes "Finally, you will be asked to write a paper on what you have researched." ;
			next;
			mes "[Metheus-Silp]";
			mes "The thesis will be reviewed by the Rector, who will decide whether to accept or reject it." ;
			mes "If you pass, you will be allowed to engage in research activities as a Sage." ;
			next;
			mes "[Metheus-Silp]";
			mes "We welcome your application at any time if you wish to apply." ;
			mes "Then have a nice day." ;
			close;
		case 2:
			break;
		case 3:
			mes "[Metheus=silp]";
			mes "I see." ;
			mes "Please take your time to look around." ;
			mes "Have a nice day, then." ;
			close;
		}
		mes "[Metheus-Silp]";
		mes "You are applying for admission." ;
		mes "Welcome to the Schweichel Academy of Magic." ;
		next;
		mes "[Metheus-Silp]";
		mes "The basic requirements for admission are JobLv 40 or higher and that you have spent time as a Magician." ;
		mes "And you must also pay an enrollment fee for various expenses that are necessary for the learning process." ;
		next;
		mes "[Metheus-Silp]";
		mes "The enrollment fee is 70,000 Zeny." ;
		mes "Or the entrance fee will be waived if you submit ^3355FF old magic book ^000000 and ^3355FF Huiyan ^000000." ;
		next;
		mes "[Metheus-Silp]";
		mes "So, would you like to apply for admission immediately?" ;
		next;
		switch(select("I will apply for admission", "The admission fee is too high", "I will come back later")) {
		case 1:
			if(JobLevel < 40) {
				mes "[Metheus=silp]";
				mes "It looks like you don't have enough JobLevel yet." ;
				mes "Please study a little more before coming back." ;
				close;
			}
			if(SkillPoint) {
				mes "[Metheus=Silp]";
				mes "Please come back after you have mastered the skills you can acquire." ;
				mes "We cannot admit you if you are half-heartedly prepared." ;
				close;
			}
			mes "[Metheus-Silp]";
			mes "Then we will prepare an application for admission." ;
			mes "Please sign here." ;
			next;
			menu strcharinfo(0),-;
			mes "[Metheus=silp]";
			mes "Your name is ......." ;
			mes ""+strcharinfo(0);
			mes "Yes. It's a good name." ;
			next;
			if(JobLevel >= 50) {
				mes "[Metheus=Silp]";
				mes "Wow, you have trained Magician to Master level!" ;
				mes "We'll give you a special entrance fee waiver!" ;
				next;
				mes "[Metheus-Silp]";
				mes "Yes, the procedure is complete." ;
				mes "Then please go and take the entrance exam." ;
				set CHANGE_SA,4;
				next;
				mes "[Metheus-Silp]";
				mes "Please go to Professor Kratos. He is in the back room on the left." ;
				close;
			}
			mes "[Metheus-Silp]";
			mes "So, do you want to pay the entrance fee of 70,000 Zeny?" ;
			mes "Or do you submit the ^3355FF old magic book ^000000 and the ^3355FF Huiyan ^000000?" ;
			next;
			if(select("Pay the entrance fee of 70,000 Zeny", "Submit the old magic book and the Huiyan")==1) {
				if(Zeny < 70000) {
					mes "[Metheus=silp]";
					mes "n...... Oh, it looks like you don't have enough money in your possession. Please check and come back again." ;
					close;
				}
				set Zeny,Zeny-70000;
			}
			else {
				if(countitem(1006) < 1 || countitem(1007) < 1) {
					mes "[Metheus=silp]";
					mes "n......?" ;
					mes "It doesn't seem to be aligned?" ;
					mes "I think I may have forgotten it somewhere." ;
					mes "Please return as soon as you find them." ;
					close;
				}
				delitem 1006,1;
				delitem 1007,1;
			}
			mes "[Metheus=silp]";
			mes "Yes, the enrollment process has been completed." ;
			mes "Then please go ahead and take the entrance exam." ;
			set CHANGE_SA,4;
			next;
			mes "[Metheus-Silp]";
			mes "Please go to Professor Kratos. He is in the back room on the left." ;
			close;
		case 2:
			if(JobLevel < 40) {
				mes "[Metheus=silp]";
				mes "It seems that you don't have enough JobLevel yet before the entrance fee." ;
				mes "Please study a little more before coming." ;
				close;
			}
			if(JobLevel >= 50) {
				mes "[Metheus=silp]";
				mes "Hmmm ...... However, you must pay the enrollment fee to be admitted: ......." ;
				mes "Even if you feel it is expensive, it is necessary for the process of becoming a Sage." ;
				next;
				mes "[Metheus=silp]";
				mes "n......?" ;
				mes "Perhaps you are ......?" ;
				mes "You have mastered Magician, have you not?" ;
				mes "This is a surprise. Let us give you a special waiver of the enrollment fee!" ;
				next;
				mes "[Metheus-Silp]";
				mes "Then we will prepare an application for admission." ;
				mes "Please sign here." ;
				next;
				menu strcharinfo(0),-;
				mes "[Metheus=silp]";
				mes "Your name is ......." ;
				mes ""+strcharinfo(0);
				mes "Yes. It's a good name." ;
				next;
				mes "[Metheus=silp]";
				mes "Yes, the enrollment process is complete." ;
				mes "Then please go ahead and take the entrance exam." ;
				set CHANGE_SA,4;
				next;
				mes "[Metheus-Silp]";
				mes "Please go to Professor Kratos. He is in the back room on the left." ;
				close;
			}
			if(Zeny > 43210) {
				mes "[Metheus=silp]";
				mes "umm ......." ;
				mes "We will not be able to admit you unless you pay the admission fee." ;
				mes "Even if you feel it is expensive, it is necessary money for the process of becoming a Sage." ;
				next;
				mes "[Metheus=silp]";
				mes "Or would you like to submit ^3355FF old magic books^000000 and ^3355FF Huiyan^000000?" ;
				mes "If that is difficult, please still provide the entrance fee." ;
				next;
				mes "[Metheus-Silp]";
				mes "Then have a nice day." ;
				close;
			}
			mes "[Metheus-Silp]";
			mes "Hmmm ...... Do you need more money ......?" ;
			mes "According to the regulations, you have to pay 70,000 Zeny. ......" ;
			next;
			if(select("Is there any other way?", "I'll come back later")==1) {
				mes "[Metheus=silp]";
				mes "Then let's make a few special concessions." ;
				mes "I will lower the entrance fee to 30,000 Zeny. but you will have to submit some items." ;
				next;
				mes "[Metheus-Silp]";
				mes "Please submit the following items." ;
				set CHANGE_SA,rand(1,3);
				switch(CHANGE_SA) {
				case 1:
					mes "^3355FF bird feathers^000000 50 ^3355FF cotton wool^000000 50 ^3355FF iron ore^000000 25";
					break;
				case 2:
					mes "^3355FF clover^000000 50 pieces^3355FF soft hair^000000 50 pieces^3355FF inkstone^000000 25 pieces";
					break;
				case 3:
					mes "^3355FF bird feathers^000000 50 pieces^3355FF cotton wool^000000 50 pieces^3355FF clover^000000 50 pieces^3355FF soft hair^000000 50 pieces";
					break;
				}
				next;
				mes "[Metheus=silp]";
				mes "If you submit what I have said, I will reduce the entrance fee to 30,000 Zeny." ;
				mes "This would be possible." ;
				mes "Good luck in collecting it." ;
				next;
				mes "[Metheus=silp]";
				mes "Of course, if you can come up with 70,000 Zeny before that, you will have to pay the entrance fee." ;
				mes "Regulations are regulations, you know." ;
				next;
				mes "[Metheus=silp]";
				mes "Or you may submit ^3355FF old magic book^000000 and ^3355FF Huijin^000000." ;
				mes "Then have a nice day." ;
				close;
			}
			//fall through if else
		case 3:
			mes "[Metheus-Silp]";
			mes "Yes, please don't panic and get ready." ;
			mes "Then have a nice day." ;
			close;
		}
	case 1:
	case 2:
	case 3:
		mes "[Metheus=silp]";
		mes "Welcome." ;
		mes "Are you applying for admission?" ;
		next;
		if(countitem(1006) && countitem(1007)) { //not yet investigated
			delitem 1006,1;
			delitem 1007,1;
			mes "[Metheus=silp]";
			mes "You have submitted an old magic book and a huija." ;
			mes "Admission is granted." ;
			set CHANGE_SA,4;
			break;
		}
		if(Zeny >= 70000) {
			set Zeny,Zeny-70000;
			mes "[Metheus=silp]";
			mes "70,000 Zeny has been paid." ;
			mes "Admission is granted." ;
			set CHANGE_SA,4;
			break;
		}
		switch(CHANGE_SA) {
		case 1:
			setarray '@need,916,914,1002;
			setarray '@amount,50,50,25;
			break;
		case 2:
			setarray '@need,705,949,1024;
			setarray '@amount,50,50,25;
			break;
		case 3:
			setarray '@need,916,914,705,949;
			setarray '@amount,50,50,50,50;
			break;
		}
		set '@max,getarraysize('@need);
		for(set '@i,0; '@i < '@max; set '@i,'@i+1) {
			if(countitem('@need['@i]) < '@amount['@i]) {
				mes "[Metheus=silp]";
				mes "But you're not ready yet." ;
				mes "Check again for the items you need." ;
				next;
				mes "[Metheus-Silp]";
				mes "Please submit the following items." ;
				for(set '@j,0; '@j < '@max; set '@j,'@j+1)
					mes "^3355FF" +getitemname('@need['@j])+ "^000000 " +'@amount['@j]+ "piece";
				next;
				mes "[Metheus-Silp]";
				mes "If you submit what I said, I will reduce the entrance fee to 30,000 Zeny." ;
				mes "Good luck collecting them." ;
				mes "Have a nice day, then." ;
				close;
			}
		}
		if(Zeny < 30000) {
			mes "[Metheus=silp]";
			mes "But you're not ready yet." ;
			mes "You have the goods but not enough money for admission." ;
			next;
			mes "[Metheus-Silp]";
			mes "As I said, I will make it 30,000 Zeny if you submit the goods." ;
			mes "The goods must be paid with the entrance fee." ;
			close;
		}
		for(set '@i,0; '@i < '@max; set '@i,'@i+1)
			delitem '@need['@i],'@amount['@i];
		set Zeny,Zeny-30000;
		mes "[Metheus=silp]";
		mes "You have submitted the item I mentioned." ;
		mes "You have submitted the item along with 30,000 Zeny." ;
		mes "Admission is granted." ;
		set CHANGE_SA,4;
		next;
		mes "[Metheus=silp]";
		mes "Then we will make an application for admission." ;
		mes "Please sign here." ;
		next;
		menu strcharinfo(0),-;
		mes "[Metheus=silp]";
		mes "Your name is ......." ;
		mes ""+strcharinfo(0);
		mes "Yes. It's a good name." ;
		next;
		mes "[Metheus=silp]";
		mes "Yes, the enrollment process is complete." ;
		mes "Then please go ahead and take the entrance exam." ;
		next;
		mes "[Metheus-Silp]";
		mes "Please go to Professor Kratos. He is in the back room on the left." ;
		close;
	case 4:
		mes "[Metheus-Silp]";
		mes "Yes? What are you doing?" ;
		mes "The exam is about to start." ;
		mes "Please go to Professor Kratos, who is in the back room to the left." ;
		close;
	case 15:
		mes "[Metheus-Silp]";
		mes "Oh, is your paper ready?" ;
		mes "If so, please go to President Chiron." ;
		next;
		mes "[Metheus-Silp]";
		mes "I hope your efforts will lead to good results." ;
		mes "Have a good day then." ;
		close;
	default:
		mes "[Metheus-Silp]";
		mes "Oh, I'm sorry." ;
		mes "I'm a little busy right now. ......" ;
		mes "Please come back later." ;
		mes "I am so sorry ......" ;
		close;
	}
	//30K route application form signed
	mes "[Metheus-Silp]";
	mes "Then I will make an application form for enrollment." ;
	mes "Please sign here." ;
	next;
	menu strcharinfo(0),-;
	mes "[Metheus=silp]";
	mes "Your name is ......." ;
	mes ""+strcharinfo(0);
	mes "Yes. It's a good name." ;
	next;
	mes "[Metheus-Silp]";
	mes "So, first you will take a written exam with Professor Kratos." ;
	next;
	mes "[Metheus-Silp]";
	mes "Professor Kratos is in the Library Room in the Academy." ;
	mes "It will be the upper left room in the back from here, so please head that way." ;
	next;
	mes "[Metheus-Silp]";
	mes "Well then, good luck." ;
	close;
}

//==========================================
// First round (written)
//------------------------------------------
yuno_in03.gat,105,177,5 script Written exam Prof. 754,{
	if(Job == Job_Sage) {
		mes "[Kratos=Belmo]";
		mes "Yeah? What can a graduate do for you?" ;
		mes "You wish to enroll again?" ;
		next;
		mes "[Kratos-Belmo]";
		mes "I know how you feel, but you should hold your own, since we have granted you graduation." ;
		mes "It's good to reminisce about your place of learning, but don't stay here forever. Take a dangerous trip once in a while." ;
		next;
		mes "[Kratos-Belmo]";
		mes "Remember to keep a record of everything you experience." ;
		mes "Be sure to share your useful knowledge with others." ;
		close;
	}
	if(Job == Job_Wizard) {
		mes "[Kratos=Belmo]";
		mes "Nm...... You're the one who's completely enchanted by the magic." ;
		mes "That wouldn't be too bad ......." ;
		next;
		mes "[Kratos-Belmo]";
		mes "Just keep this in mind." ;
		mes "One cannot live alone." ;
		mes "What you have learned will only be of real value if you teach it to others." ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Kratos=Belmo]";
		mes "What can I do for you?" ;
		mes "This is not a playground." ;
		next;
		mes "[Kratos-Belmo]";
		mes "Go outside and play with Poring." ;
		mes "Come on, get out." ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[Kratos=Belmo]";
		mes "NON_...... Your request to enroll will not result in you becoming a Sage from your current profession." ;
		mes "You have other talents." ;
		next;
		mes "[Kratos-Belmo]";
		mes "Don't sell your oil here, go somewhere else." ;
		close;
	}
	switch(CHANGE_SA) {
	case 0:
		mes "[Kratos=Belmo]";
		mes "umm ..... You want to be a .Sage." ;
		mes "You have that look on your face." ;
		next;
		mes "[Kratos-Belmo]";
		mes "To do that, you have to enroll in our academy." ;
		mes "Come back when you have completed the formalities." ;
		close;
	case 1:
	case 2:
	case 3:
		case 3: close;
	case 4:
		mes "[Kratos-Belmo]";
		mes "Mm, welcome to the Schweichel Academy." ;
		mes "You've come through the formalities, haven't you?" ;
		next;
		mes "[Kratos-Belmo]";
		mes "Let's take a look. The name is ......." ;
		mes ""+strcharinfo(0);
		mes "I'm pretty sure it's [Kratos-Belmo], right?" ;
		mes "Okay, then let's start the test right away." ;
		next;
		mes "[Kratos-Belmo]";
		mes "The exam I'm going to give you is all about this world." ;
		mes "There are 20 questions." ;
		mes "Each will be worth 5 points, and you will pass if you get 80 points or more." ;
		next;
		mes "[Kratos=Belmo]";
		mes "If you do not answer the question immediately, the test will be canceled." ;
		mes "Then begin." ;
		set CHANGE_SA,5;
		break;
	case 5:
		mes "[Kratos=Belmo]";
		mes "Then we will retest." ;
		mes "Have you studied hard this time?" ;
		next;
		mes "[Kratos=Belmo]";
		mes "Well, the passing grade is the same this time." ;
		mes "Each of the 20 questions will be allotted 5 points, and a score of 80 or higher will be considered passing." ;
		next;
		mes "[Kratos=Belmo]";
		mes "Then let's get started." ;
		mes "If you don't answer right away, the test will be canceled, so good luck." ;
		break;
	case 6:
		mes "[Kratos=Belmo]";
		mes "Hmm? You want to take the test again?" ;
		mes "You have passed the written exam." ;
		next;
		mes "[Kratos-Belmo]";
		mes "Go to Professor Hermes and take the practical exam." ;
		mes "Don't take it easy." ;
		close;
	default:
		mes "[Kratos-Belmo]";
		mes "I'm busy grading exams for other incoming students right now: ......." ;
		mes "Sorry, come back later." ;
		close;
	case 15:
		mes "[Kratos-Belmo]";
		mes "Oh, good job finishing your paper." ;
		mes "But I didn't grade the paper." ;
		next;
		mes "[Kratos-Belmo]";
		mes "Please show this to President Chiron." ;
		mes "The President will decide whether you can graduate or not." ;
		close;
	}
	//written exam here
	next;
	switch(rand(3)) {
	case 0:
		mes "1. Which of the following goods are not sold by the gift merchants in Prontera?" ;
		next;
		if(select("white plate", "red picture frame", "flower tabbies", "glass balls")==3)
			set '@point,'@point+5;
		mes "2. Which city does not sell stilettos?" ;
		next;
		if(select("Prontera", "Morroc", "Geffen", "Lutie")==1)
			set '@point,'@point+5;
		mes "3. Which city is closest to Turtle Island?" ;
		next;
		if(select("Aldebaran", "Alberta", "Comodo", "Izlude")==2)
			set '@point,'@point+5;
		mes "4. Only one of the following is of a different species. Which one?" ;
		next;
		if(select("regulo", "plague", "frilledora", "starfish")==4)
			set '@point,'@point+5;
		mes "5. One of the following has different attributes. Which one?" ;
		next;
		if(select("Mantis", "Metalla", "Rocker", "Horn")==2)
			set '@point,'@point+5;
		mes "6. One of the following is of a different size. Which one?" ;
		next;
		if(select("Raidric", "Raidric Archer", "Wandering", "Dark Flame")==1)
			set '@point,'@point+5;
		mes "7. Which of the following monsters does not drop alcohol?" ;
		next;
		if(select("Horong", "Plankton", "Poison Spore", "Toad")==3)
			set '@point,'@point+5;
		mes "8. Who among the following is not related to Knight job change?" ;
		next;
		if(select("James-Syracuse", "Thomas-Cervantes", "Amy-Beatrice", "Edmond-Grost")==2)
			set '@point,'@point+5;
		mes "9. Who among the following is not in Prontera?" ;
		next;
		if(select("Nami", "Aldifon", "Thomas", "Holgren")==2)
			set '@point,'@point+5;
		mes "10. Answer the name of the Kafra Staff wearing glasses." ;
		next;
		if(select("Deforte", "Telling", "Glaris", "W")==3)
			set '@point,'@point+5;
		mes "11. How many SP are consumed when using the skill "Thunder Storm" Lv 7?" ;
		next;
		if(select("49", "59", "69", "74")==2)
			set '@point,'@point+5;
		mes "12. If 50% SP is left, what is the damage reduction rate and how much SP is consumed by the skill "Energy Coat"?" ;
		next;
		if(select("24% reduction SP1.5% consumption", "24% reduction SP2% consumption", "18% reduction SP1.5% consumption", "18% reduction SP2% consumption")==4)
			set '@point,'@point+5;
		mes "13. Answer the attribute that is not found in Magician's "bolt-based magic"." ;
		next;
		if(select("water attribute", "earth attribute", "fire attribute", "wind attribute")==2)
			set '@point,'@point+5;
		mes "14. Answer what will happen to the activation probability and attack power when Thief's skill "Double Attack" Lv7 is learned." ;
		next;
		if(select("35% / 120%", "35% / 140%", "40% / 120%", "40% / 140%")==2)
			set '@point,'@point+5;
		mes "15. Which of the following is not in the process of learning Priest's skill "Magnus Exorcism"?" ;
		next;
		if(select("Divine Protection", "Heal", "Ruaf", "Aqua Venetica")==1)
			set '@point,'@point+5;
		mes "16. Answer the protection value and additional ability value of "Rabbit Hairband"." ;
		next;
		if(select("1 / LUK +2", "1 / LUK +5", "2 / LUK +2", "2 / LUK +5")==3)
			set '@point,'@point+5;
		mes "17. Which of the following professions cannot equip armor?" ;
		next;
		if(select("Swordsman", "Merchant", "Thief", "Archer")==4)
			set '@point,'@point+5;
		mes "18. Which of the following items will restore all HP and SP?" ;
		next;
		if(select("Royal Jelly", "Seeds of Igdrasil", "Fruits of Igdrasil", "Fruits of Mastella")==3)
			set '@point,'@point+5;
		mes "19. Answer the name of the king of the kingdom of Rune-Midgarts." ;
		next;
		if(select("Triston III", "Tristan III", "Tristar III", "Trust III")==2)
			set '@point,'@point+5;
		mes "20. What god do the Crusaders serve?" ;
		next;
		if(select("Odin", "Loki", "Thor", "Aragamsaree")==1)
			set '@point,'@point+5;
		break;
	case 1:
		mes "1. Choose from the following items that are not found in the gems sold by the Jeweler people of Morroc." ;
		next;
		if(select("topaz", "garnet", "diamond", "sapphire")==2)
			set '@point,'@point+5;
		mes "2. Which city does not sell monster bait?" ;
		next;
		if(select("Prontera", "Morroc", "Aldebaran", "Alberta")==3)
			set '@point,'@point+5;
		mes "3. Which is the nearest city from the labyrinth forest?" ;
		next;
		if(select("Prontera", "Morroc", "Geffen", "Payon")==1)
			set '@point,'@point+5;
		mes "4. Only one of the following is of a different species. Which one?" ;
		next;
		if(select("Mukar", "Drops", "Plankton", "Penomena")==4)
			set '@point,'@point+5;
		mes "5. One of the following has different attributes. Which one?" ;
		next;
		if(select("Dokebi", "Isis", "Gaius", "Deviruchi")==3)
			set '@point,'@point+5;
		mes "6. One of the following is different in size from the others. Which one?" ;
		next;
		if(select("Male Thief Bug", "Horn", "Metalla", "Argos")==4)
			set '@point,'@point+5;
		mes "7. Which of the following monsters does not drop "Leaves of Igdrasil"?" ;
		next;
		if(select("Marduk", "Baphomet.Jr", "Angeling", "Wanderer")==1)
			set '@point,'@point+5;
		mes "8. Who among the following is not related to Priest's job change?" ;
		next;
		if(select("Thomas=Cervantes", "Windsor=Benedict", "Peter S. Alberto", "Cecil=Margarita")==2)
			set '@point,'@point+5;
		mes "9. Who among the following is not in Morroc?" ;
		next;
		if(select("Abdul", "Aragam", "Antonio", "Sad")==3)
			set '@point,'@point+5;
		mes "10. What is the name of Kafra Staff with attractive blue hair?" ;
		next;
		if(select("Deforte", "Telling", "Glaris", "W")==1)
			set '@point,'@point+5;
		mes "11. Choose one of the following that is not necessary in the process of mastering the skill "Firewall"." ;
		next;
		if(select("Firebolt Lv 4", "Napalm Beat Lv 4", "Fireball Lv 5", "Sight Lv 1")==2)
			set '@point,'@point+5;
		mes "12. If the skill "Improved SP Recovery" is learned up to Lv 6, how many SP values are recovered in 10 seconds by the pure skill effect?" ;
		next;
		if(select("14", "16", "18", "21")==3)
			set '@point,'@point+5;
		mes "13. How many INT-weighted values does a magician get at JobLv 33?" ;
		next;
		if(select("7", "6", "5", "4")==4)
			set '@point,'@point+5;
		mes "14. What is the SP consumption and duration of Archer's skill "Improved Concentration" Lv 5?" ;
		next;
		if(select("45 / 140 sec", "50 / 140 sec", "45 / 150 sec", "50 / 150 sec")==1)
			set '@point,'@point+5;
		mes "15. Which of the following is not necessary for the process of learning the Blacksmith skill "Maximize Power"?" ;
		next;
		if(select("Hilt Binding", "Skin Tempering", "Hammerfall", "Weapon Perfection")==2)
			set '@point,'@point+5;
		mes "16. Answer the defense and additional abilities of the ribbon hairband." ;
		next;
		if(select("0 / SP +20", "0 / SP +30", "1 / SP +20", "1 / SP +30")==3)
			set '@point,'@point+5;
		mes "17. Which of the following occupations cannot be equipped with saints' robes?" ;
		next;
		if(select("Swordsman", "Merchant", "Thief", "Acolyte")==3) //The swordsman cannot be equipped at present
			set '@point,'@point+5;
		mes "18. Which of the following conditions cannot be recovered by "green potion"?" ;
		next;
		if(select("silence", "poison", "darkness", "curse")==4)
			set '@point,'@point+5;
		mes "Answer the name of the vanished ancient kingdom that can be entered from somewhere in 19.Geffen." ;
		next;
		if(select("Geppayon", "Geffenia", "Geffedria", "Gefferia")==2)
			set '@point,'@point+5;
		mes "20. Answer the name of the tree that is said to be the root of the world." ;
		next;
		if(select("Igdrasil", "Idogracil", "Mastella", "Old tree branch")==1)
			set '@point,'@point+5;
		break;
	case 2:
		mes "1. Answer the following that are not sold by Geffen's magic merchants." ;
		next;
		if(select("Mentor", "Wand", "Circlet", "Silver Robe")==1)
			set '@point,'@point+5;
		mes "2. Choose one of the following cities where "blades" are not sold." ;
		next;
		if(select("Prontera", "Izlude", "Aldebaran", "Payon")==3)
			set '@point,'@point+5;
		mes "3. Which city is located closest to Glastheim?" ;
		next;
		if(select("Prontera", "Geffen", "Morroc", "Payon")==2)
			set '@point,'@point+5;
		mes "4. Only one of the following is of a different species. Which one?" ;
		next;
		if(select("starfish", "marc", "mars", "merlin")==4)
			set '@point,'@point+5;
		mes "5. One of the following has different attributes. Which one?" ;
		next;
		if(select("Child Desert Wolf", "Smokey", "Picky", "Chocolate")==2)
			set '@point,'@point+5;
		mes "6. One of the following is of a different size. Which one?" ;
		next;
		if(select("Drake", "Wraith", "Evil Druid", "Carlitzburg")==1)
			set '@point,'@point+5;
		mes "7. Which of the following monsters does not drop "Phracon"?" ;
		next;
		if(select("Pupa", "Condor", "Savage Bebe", "Child Desert Wolf")==2)
			set '@point,'@point+5;
		mes "8. Who among the following is not related to the Blacksmith job change?" ;
		next;
		if(select("Baisu", "Hyugge", "Barcardi", "Mittmeier")==3)
			set '@point,'@point+5;
		mes "9. Who among the following is not in Aldebaran?" ;
		next;
		if(select("RS125", "Marcell", "Manstad", "Eisenberg")==2)
			set '@point,'@point+5;
		mes "10. Give the name of the youngest member of the Kafra Staff." ;
		next;
		if(select("Diforte", "Telling", "Glaris", "W")==4)
			set '@point,'@point+5;
		mes "11. Answer the SP consumption and the number of evasion when using the skill "Safety Wall" Lv6." ;
		next;
		if(select("SP 40, 6 times", "SP 35, 6 times", "SP 35, 7 times", "SP 40, 7 times")==4)
			set '@point,'@point+5;
		mes "12. When the skill "Napalm Beat" Lv 6 is used, what is the attack power times MATK?" ;
		next;
		if(select("1.2x", "1.3x", "1.4x", "1.5x")==2)
			set '@point,'@point+5;
		mes "13. Which ore is the catalyst for mixture 4 in the Magician job change test?" ;
		next;
		if(select("blue gemstone", "red gemstone", "yellow gemstone", "transparent jewel")==4)
			set '@point,'@point+5;
		mes "14. Answer the attack power and SP consumption of the Swordsman's skill "Bash Lv6"." ;
		next;
		if(select("250% / 8", "280% / 8", "280% / 15", "310% / 15")==3)
			set '@point,'@point+5;
		mes "15. Which of the following is not necessary in the process of learning Hunter's skill "Claymore Trap"?" ;
		next;
		if(select("Remove Trap", "Land Mine", "Ankle Snare", "Flasher")==1)
			set '@point,'@point+5;
		mes "16. Answer the defense and additional ability values of "Veil"." ;
		next;
		if(select("0 / MDEF +3", "0 / MDEF +5", "1 / MDEF +3", "1 / MDEF +5")==2)
			set '@point,'@point+5;
		mes "17. Which of the following occupations cannot be equipped with a "long coat"?" ;
		next;
		if(select("Swordsman", "Merchant", "Thief", "Novice")==4)
			set '@point,'@point+5;
		mes "18. Which of the following items is not a material for blue dye?" ;
		next;
		if(select("alcohol", "ditrimin", "carbodil", "blue herb")==3)
			set '@point,'@point+5;
		mes "19. Which of the following items is said to have been used by the god Odin when the world was created?" ;
		next;
		if(select("Ymir's heart", "Ymir's claw", "Ymir's tooth", "Ymir's relic")==2)
			set '@point,'@point+5;
		mes "20. Which of the following metals is the metal that says, "I go before the one who can change the fate of this world and share its destiny?" ;
		next;
		if(select("Emveretarcon", "Emperium", "Emperor", "Phracon")==2)
			set '@point,'@point+5;
		break;
	}
	mes "[Kratos=Belmo]";
	mes "Okay, that's it." ;
	mes "So let's grade it." ;
	next;
	mes "[Kratos=Belmo]";
	mes "Which ......." ;
	mes "un......" ;
	next;
	mes "[Kratos=Belmo]";
	mes "Grading is done." ;
	mes "Your score is " +'@point+"." ;
	if('@point < 80) {
		mes "......" ;
		mes "Remaining GOST but you failed." ;
		next;
		mes "[Kratos-Belmo]";
		mes "I'll let you take the exam again, go study a little more about the world." ;
		close;
	}
	else if('@point == 100) {
		mes "You are indeed surprised." ;
		mes "If you can make it this far, you have the makings to be a Sage." ;
	}
	else {
		mes "Hm." ;
		mes "I wish I could do this much." ;
	}
	set CHANGE_SA,6;
	next;
	mes "[Kratos=Belmo]";
	mes "Okay, the written test passed." ;
	mes "Go to Professor Hermes and take the practical exam as well." ;
	close;
}

//==========================================
// Secondary exam (practical)
//------------------------------------------
yuno_in03.gat,169,180,3 script Practical test professor 755,{
	if(Job == Job_Sage) {
		mes "[Hermes=Tris]";
		mes "Hey, how are you?" ;
		mes "From the look on your face, you've been through a lot of hard work, haven't you?" ;
		next;
		mes "[Hermes=Tris]";
		mes "After all, it's important to have a lot of experience, isn't it?" ;
		mes "It makes a big difference between just knowing about it with knowledge and experiencing it with your own body, you know?" ;
		next;
		mes "[Hermes=Tris]";
		mes "But you should try to go to dangerous dungeons with a companion you can rely on." ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Hermes=Tris]";
		mes "Haha, isn't she a cute Novice?" ;
		next;
		mes "[Hermes-Tris]";
		mes "There are still many things in the Midgard continent that even we don't know about." ;
		mes "A lot of items, heroes and legends: ......." ;
		next;
		mes "[Hermes-Tris]";
		mes "Wouldn't you like to dream of becoming a Sage too?" ;
		mes "Well, after I learn a little more about the world." ;
		next;
		mes "[Hermes=Tris]";
		mes "If we have a chance, we may meet again." ;
		mes "[Hermes-Triss]"; mes "[Hermes-Triss]"; mes "Then have a safe trip home." ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[Hermes=Tris]";
		mes "This is the Schweichel Magic Academy." ;
		next;
		mes "[Hermes-Tris]";
		mes "I guess we Sage are more like scholars than sorcerers." ;
		mes "I'm sure you'll be of some use to the party." ;
		next;
		mes "[Hermes-Tris]";
		mes "By all means take Sage with you on your next trip to try it out." ;
		mes "I'm sure you will do your part admirably." ;
		close;
	}
	switch(CHANGE_SA) {
	case 0:
	case 1:
	case 2:
	case 3:
		mes "[Hermes=Tris]";
		mes "My name is Hermes and I am in charge of the practical exam." ;
		mes "Are you an aspiring Sage student?" ;
		next;
		mes "[Hermes=Tris]";
		mes "First, you need to finish the admission process and take the written exam." ;
		close;
	case 4:
	case 5:
		mes "[Hermes=Tris]";
		mes "My name is Hermes and I am in charge of the practical exam." ;
		mes "Are you an aspiring Sage student?" ;
		next;
		mes "[Hermes=Tris]";
		mes "Come and pass Professor Kratos' written exam." ;
		mes "Then you will take my exam." ;
		close;
	case 6:
		mes "[Hermes=Tris]";
		mes "Oh, a student who passed the written exam?" ;
		mes "Then you will now take the practical exam." ;
		next;
		mes "[Hermes=Tris]";
		mes "The practical test is at ...... The rules are simple." ;
		mes "You have to kill all the monsters that appear within a time limit." ;
		next;
		mes "[Hermes=Tris]";
		mes "It is quicker to experience it once than to hear it a hundred times. You know the saying." ;
		mes "Well, shall we take the test now?" ;
		next;
		if(select("I'm taking the practical exam", "Let me prepare")==2) {
			set CHANGE_SA,7;
			mes "[Hermes=Tris]";
			mes "Yes, okay." ;
			mes "Go prepare well." ;
			close;
		}
		set CHANGE_SA,7;
		mes "[Hermes=Tris]";
		mes "Okay, then we'll start right away." ;
		mes "Good luck with that." ;
		close2;
		warp "job_sage.gat",50,154;
		end;
	case 7:
		mes "[Hermes=Tris]";
		mes "Hey, have we prepared well this time?" ;
		mes "The practical exam is not that difficult, so I wish you good luck." ;
		next;
		mes "[Hermes=Tris]";
		mes "Now, shall we take the exam?" ;
		next;
		if(select("I will take the practical exam", "Please give me time to prepare")==2) {
			mes "[Hermes=Tris]";
			mes "Yes, okay." ;
			mes "Go prepare well." ;
			close;
		}
		mes "[Hermes=Tris]";
		mes "All right, then, let's get started right away." ;
		mes "Good luck with that." ;
		close2;
		warp "job_sage.gat",50,154;
		end;
	case 8:
		mes "[Hermes=Tris]";
		mes "Okay, I did my best." ;
		mes "And you passed the practical exam." ;
		mes "Let's welcome you to the school." ;
		next;
		mes "[Hermes=Tris]";
		mes "Then let's decide on the area of study you'll be working on: ......." ;
		mes "Wait a minute." ;
		mes "Let's see how many points you got on the written exam and how much time you spent on the combat exam." ;
		next;
		mes "[Hermes=Tris]";
		mes "Hmmm ......." ;
		mes "Okay, this should work." ;
		next;
		switch(rand(3)) {
		case 0:
			set CHANGE_SA,9;
			mes "[Hermes=Tris]";
			mes "You will be doing research on Yggdrasil." ;
			mes "A study on the tree that was the root of this world we live in." ;
			next;
			mes "[Hermes-Triss]";
			mes "It is an important field to determine the changes and development of this continent today." ;
			mes "Listen to Professor Sipien-Leiries, who is in the Academy's Lecture Room." ;
			break;
		case 1:
			set CHANGE_SA,11;
			mes "[Hermes-Triss]";
			mes "You are to do research on monsters." ;
			mes "This is a study of monsters from all over the continent." ;
			next;
			mes "[Hermes-Tris]";
			mes "You will gain the knowledge you will need to live from now on." ;
			mes "Listen to Professor Lucius-Kelsos at the Monster Museum." ;
			break;
		case 2:
			set CHANGE_SA,13;
			mes "[Hermes-Triss]";
			mes "You are to do research on attribute magic." ;
			mes "You will gain a better understanding of the basic magic we use." ;
			next;
			mes "[Hermes-Tris]";
			mes "This is a good area to understand the nature of magic." ;
			mes "Listen to Professor Ebesi-Jorda at the Biotechnology Institute." ;
			break;
		}
		next;
		mes "[Hermes-Triss]";
		mes "Then I wish you good luck and good results." ;
		close;
	case 9:
		mes "[Hermes-Tris]";
		mes "Hm? Didn't you listen carefully?" ;
		mes "I told you I was going to have you do some research on Yggdrasil." ;
		next;
		mes "[Hermes-Triss]";
		mes "Go to Professor Sipien-Lyerse in the Academy's Lecture Room." ;
		close;
	case 11:
		mes "[Hermes-Triss]";
		mes "Hm? Didn't you listen carefully?" ;
		mes "I told you I'd have you do some research on monsters." ;
		next;
		mes "[Hermes-Triss]";
		mes "Go to Professor Lucius-Kelsos at the Monster Museum." ;
		close;
	case 13:
		mes "[Hermes-Triss]";
		mes "Hm? Didn't you listen carefully?" ;
		mes "I told you I was going to have you do some research on attribute magic." ;
		next;
		mes "[Hermes-Triss]";
		mes "Go to Professor Ebesi-Jorda at the Biotechnology Institute." ;
		close;
	case 15:
		mes "[Hermes-Torris]";
		mes "What are you selling oil for here?" ;
		mes "If you've finished your paper, show it to the rector as soon as possible." ;
		mes "You can show it to me, but the Rector will judge your graduation." ;
		next;
		mes "[Hermes-Tris]";
		mes "Come on, come on, get going." ;
		close;
	default:
		mes "[Hermes-Triss]";
		mes "hmmm ......" ;
		mes "Oh, sorry, I'm a little busy right now." ;
		mes "If you have any questions, ask your professor." ;
		close;
	}
}

job_sage.gat,50,165,4 script practical examiner#sage 700,{
	mes "[Practical skills examiner]";
	mes "Welcome to the Sage Practical Examination." ;
	mes "If you wish to take the exam, please enter the exam waiting room." ;
	next;
	mes "[Practical Exam Administrator]";
	mes "Please wait a moment if someone else is taking the exam." ;
	mes "The progress will be announced and you will be called when it is over." ;
	next;
	mes "[Practical examiner]";
	mes "Each person will be given 5-10 minutes to complete the exam." ;
	mes "If you want to leave the battlefield, please reconnect once." ;
	close;
OnInit:
	waitingroom "Waiting room for exam",20, "Practical examiner#sage::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	hideonnpc "SageTestFail";
	warpwaitingpc "job_sage.gat",116,97;
	donpcevent "SageTest::OnStart1";
	end;
}

job_sage.gat,0,0,0 script SageTest -1,{
	end;
OnStart1:
	set 'count,16;
	set 'flag,1; //first flag
	monster "job_sage.gat",111,102, "units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,102, "units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,93, "Units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,93, "units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",107,98, "Units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",124,98, "units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",115,106, "Units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",115,90, "units",1183,1, "SageTest::OnKilled";
	monster "job_sage.gat",103,110, "Units",1184,1, "SageTest::OnKilled";
	monster "job_sage.gat",128,110, "units",1184,1, "SageTest::OnKilled";
	monster "job_sage.gat",103,85, "units",1184,1, "SageTest::OnKilled";
	monster "job_sage.gat",128,85, "units",1184,1, "SageTest::OnKilled";
	monster "job_sage.gat",107,106, "Units",1184,1, "SageTest::OnKilled";
	monster "job_sage.gat",124,106, "units",1184,1, "SageTest::OnKilled";
	monster "job_sage.gat",107,89, "units",1184,1, "SageTest::OnKilled";
	monster "job_sage.gat",124,89, "units",1184,1, "SageTest::OnKilled";
	initnpctimer;
	end;
OnStart2:
	set 'count,24;
	set 'flag,2; //second flag
	monster "job_sage.gat",111,102, "math",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,102, "Physics",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,102, "History",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,102, "Geography",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,102, "Astronomy",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,102, "meteorology",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,93, "Architecture",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,93, "Control Science",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,93, "Metrology",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,102, "Statistics",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,102, "urban studies",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,102, "linguistics",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,93, "Food Science",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,93, "Nutrition",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",111,93, "Plastic Science",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,93, "Anthropology",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,93, "biology",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",120,93, "Ethics",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",107,98, "Economics",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",107,98, "Political Science",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",107,98, "Magical Science",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",124,98, "forestry",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",124,98, "Health Sciences",1063,1, "SageTest::OnKilled";
	monster "job_sage.gat",124,98, "Psychology",1063,1, "SageTest::OnKilled";
	setnpctimer 1001;
	end;
OnStart3:
	set 'flag,3; //3rd flag
	monster "job_sage.gat",116,97, "Bachelor title",1179,1, "SageTest::OnPass";
	monster "job_sage.gat",107,106, "Absent",1185,1;
	monster "job_sage.gat",124,106, "tardy",1185,1;
	monster "job_sage.gat",107,89, "cheating",1185,1;
	monster "job_sage.gat",124,89, "lending",1185,1;
	setnpctimer 123001;
	end;
OnKilled:
	set 'count,'count-1;
	if('count < 1) {
		announce "Test site: " +strcharinfo(0)+ "Sama, monster repelled successfully",9;
		if('flag == 1)
			donpcevent "SageTest::OnStart2";
		else if('flag == 2)
			donpcevent "SageTest::OnStart3";
	}
	end;
OnPass:
	stopnpctimer;
	killmonster "job_sage.gat", "All";
	set CHANGE_SA,8;
	announce "Examination center: congratulations," +strcharinfo(0)+ "you have passed your practical exam",9;
	sleep 2000;
	announce "Examiner: Good luck with the rest of the process;
	sleep 2000;
	announce "Examiner: You have passed the practical examination. Next examinees, please prepare",9. sleep 1000; announce "Examiner: You have passed the exam;
	sleep 1000;
	areawarp "job_sage.gat",100,82,131,113, "yuno_in03.gat",163,180;
	hideoffnpc "SageTestFail";
	sleep 2000;
	announce "Examiner: Next examinee, please enter",9;
	sleep 2000;
	enablewaitingroomevent "Practical examiner #sage";
	end;
OnTimer1000:
	if('flag == 1)
		announce "Testing room: begin entrance practical exam." ,9;
	end;
OnTimer2000:
	announce "Examination center: " +(('flag==1)? "1": "2")+ "Th exam - time limit 3 minutes",9;
	end;
OnTimer3000:
	announce "Exam site: fight off all monsters in time." ,9;
	end;
OnTimer33000:
	announce "test site: 2 minutes 30 seconds left",9;
	end;
OnTimer63000:
	OnTimer63000: announce "Testing station: 2 minutes left",9;
	end;
OnTimer93000:
	OnTimer93000: announce "Testing station: 1 minute 30 seconds left",9;
	end;
OnTimer123000:
	OnTimer123000: announce "Testing station: 1 minute left",9;
	end;
OnTimer124000:
	if('flag == 3)
		OnTimer123000: announce "Exam site: third exam - time limit 1 minute",9; end; OnTimer124000: if('flag == 3)
	end;
OnTimer153000:
	announce "Exam site: 30 seconds left",9;
	end;
OnTimer173000:
	OnTimer173000: announce "Testing site: 10 seconds left",9;
	end;
OnTimer183000:
	killmonster "job_sage.gat", "All";
	announce "test_place: time_limit_end",9;
	end;
OnTimer184000:
	hideoffnpc "SageTestFail";
	end;
OnTimer185000:
	announce "Next examinee, please enter",9;
	end;
OnTimer186000:
	stopnpctimer;
	set 'flag,0;
	enablewaitingroomevent "Practical examiner #sage";
	end;
}

job_sage.gat,116,97,0 script SageTestFail 139,16,16,{
OnTouch:
	announce "Test site: " +strcharinfo(0)+ "Sage failed the test",9;
	warp "yuno.gat",324,258;
	end;
}

//==========================================
// Tertiary exam (Yggdrasil study)
//------------------------------------------
yuno_in03.gat,62,176,2 script History Professor 109,{
	if(Job == Job_Sage) {
		mes "[Sipien-Leiries]";
		mes "Who is it ......?" ;
		mes "Oh, you're the student I taught." ;
		mes "You graduated from the academy, I believe." ;
		next;
		mes "[Sipien-Leiries]";
		mes "If we know the past, we can understand the present and imagine the future." ;
		mes "Therein lies all truth." ;
		next;
		mes "[Sipien-Leiries]";
		mes "Now you too are trying to know the past." ;
		mes "Someday you will recall the 'now', you will miss it, and you will discover a changed you." ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Sipien-Lyerse]";
		mes "What can Mr. Novice do for you?" ;
		next;
		mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
		mes "What path will you take now that you have so many possibilities?" ;
		next;
		mes "[Sipien-Leiries]"; mes "[Sipien-Leiries]"; mes "[Sipien-Leiries]
		mes "That is for you to decide for yourself." ;
		mes "Don't go down the wrong path." ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[Sipien-Leiries]";
		mes "Yes, I teach history." ;
		next;
		mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
		mes "The world we live in today is shaped by many memories and years." ;
		mes "Knowing the past can be a bridge between the present and the future." ;
		next;
		mes "[Sipien-Leiries]";
		mes "You, too, should reflect on your past. You will surely find a way to the future." ;
		close;
	}
	switch(CHANGE_SA) {
	case 9:
		switch(RESEARCH_SA) {
		case 0:
			mes "[Sipien=Lyleece]";
			mes "Yes," +strcharinfo(0)+ "It's you." ;
			mes "Welcome. My name is Sipien-Leiries, and I am in charge of lectures." ;
			next;
			mes "[Sipien-Leiries]";
			mes "The topic here is a study on Ygdrasil." ;
			mes "Do you know what Igdrasil is?" ;
			next;
			if(select("Yes, I know", "No, I am not familiar with it. ......") ==1) {
				mes "[Sipien-Lyerse]";
				mes "Then tell us what you know about Ygdrasil." ;
				next;
				switch(select("It is the name of a recovery item.", "It is a tree said to be the root of the world.", "Actually, I don't know much about it. ......")) {
				case 1:
					mes "[Sipien-Lyrlees]";
					mes "No, it's not." ;
					mes ""+strcharinfo(0)+ "You, you have 10 points deducted." ;
					mes "That's just using the ingredients from that tree." ;
					next;
					mes "[Sipien-Lyrlees]";
					mes "Igdrasil is the name of the tree that was the root of the world." ;
					break;
				case 2:
					mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]";
					mes "Yes, Igdrasil is the name of the tree that became the root of this world we live in." ;
					break;
				case 3:
					mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]
					mes "If you don't know, say you don't know." ;
					mes ""+strcharinfo(0)+ "You, you have 10 points deducted." ;
					next;
					mes "[Sipien-Lyrlees]";
					mes "Yggdrasil is the name of the tree from which the world is rooted." ;
					break;
				}
			}
			} else {
				mes "[Sipien-Lyrleth]";
				mes "Yes, you may have heard a little bit about it, but Ygdrasil is the name of the tree that was also the root of the Midgard continent." ;
			}
			next;
			mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
			mes "Then there are a few things I would like you to prepare prior to the lecture." ;
			mes "This is necessary in order to understand Ygdrasil." ;
			next;
			mes "[Sipien-Leiries]";
			mes "Gather whatever you can, anything that has to do with Ygdrasil." ;
			mes "Seeds and berries are most desirable." ;
			mes "It's a lot of work, but do your best to find them." ;
			next;
			mes "[Sipien-Leiries]";
			mes "Then we will start the lecture as soon as it is ready." ;
			mes "Have a good day." ;
			set RESEARCH_SA,1;
			close;
		case 1:
			if(countitem(607) < 1 && countitem(608) < 1 && countitem(610) < 1) {
				mes "[Sipien=Lyleece]";
				mes "Hmm? I don't think you're ready for a lecture yet, are you?" ;
				mes "Whatever it is, go gather up anything related to Yggdrasil." ;
				next;
				mes "[Sipien-Lyrlees]";
				mes "We will begin when you are ready." ;
				mes "Now go." ;
				close;
			}
			mes "[Sipien-Lyerse]";
			mes "Mm, have you made your preparations?" ;
			if(countitem(607)) {
				mes "......!" ;
				mes "Did you bring the fruit of Yggdrasil!" ;
				mes "I'm impressed." ;
			}
			else if(countitem(608)) {
				mes "......" ;
				mes "Oh, is that an Yggdrasil seed?" ;
				mes "You must have had a hard time." ;
			}
			else if(countitem(610)) {
				mes "......" ;
				mes "Is it an igdrasil leaf?" ;
				next;
				mes "[Sipien-Lyrlees]";
				mes "You sell these in some towns." ;
				mes "Don't be sidetracked." ;
				mes ""+strcharinfo(0)+ "You, you have 10 points deducted." ;
			}
			next;
			mes "[Sipien-Leiries]";
			mes "Then we will begin the lecture." ;
			mes "Don't doze off and listen." ;
			next;
			mes "[Sipien-Lyrlees]";
			mes "It is said that the tree of Ygdrasil, the root of the world, takes root on all continents and reaches its height to the sky." ;
			next;
			mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
			mes "Outside the continent is an ocean, and the world is surrounded by Jormungand, a giant serpent." ;
			mes "The continent is divided into Asgard, Midgard, and Utgard." ;
			next;
			mes "[Sipien-Lyrleth]";
			mes "Utgard, where the giants live: ......." ;
			next;
			mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]
			mes "Midgard, where we humans live......" ;
			next;
			mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]
			mes "And Asgard, where the gods dwell......" ;
			mes "The giant tree that rises in the center of this continent is Igdrasil." ;
			next;
			mes "[Sipien-Lyrleth]";
			mes "Deeply rooted in this continent, which was born with the death of Ymir in prehistoric times, its roots, which support the giant tree, extend to three places." ;
			next;
			mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]
			mes "The first root goes to Asgard, where the gods dwell." ;
			mes "To a land still unknown to us mortals. ......" ;
			next;
			mes "[Sipien-Lyrleth]";
			mes "The second is said to be Jotunheim, where the giants live." ;
			mes "The name is heard in legends and mythological passages." ;
			next;
			mes "[Sipien-Lyrleth]";
			mes "The third eye extends to Nibbleheim." ;
			mes "The earth is covered with deep mist, dark and ice." ;
			next;
			mes "[Sipien-Lyrleth]";
			mes "The fruit, seeds, and leafy things of Ygdrasil that we happen to have are thought to be the product of that very giant tree." ;
			next;
			mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
			mes "The fantastic, prehistoric, and life-giving Ygdrasil berries will completely restore your HP and SP." ;
			next;
			mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
			mes "The seeds of Ygdrasil, which are said to be energized by its fragrant and bitter aroma, will restore about half of your HP and SP." ;
			next;
			mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
			mes "Possessing a strong life force, igdrasil leaves can revive the dead." ;
			next;
			mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]
			mes "Finally, ...... If you find your way to Asgard in the distant future, be sure to look for Igdrasil." ;
			next;
			mes "[Sipien-Lyrleth]"; mes "[Sipien-Lyrleth]
			mes "Of course, the story is based on myth and legend, but that is why we must investigate the existence of Ygdrasil." ;
			next;
			mes "[Sipien-Lyrlees]"; mes "[Sipien-Lyrlees]
			mes "So, that's it for the lecture." ;
			mes "You need to organize and remember what you've heard very well." ;
			next;
			mes "[Sipien-Leiries]";
			mes "Next, you will write a paper." ;
			mes "Please come prepared to write your paper." ;
			next;
			mes "[Sipien-Leiries]";
			mes "^3355FF bird's feathers^000000 1 for writing instruments ^3355FF beast's hide^000000 1 needed for bookbinding ^3355FF wood shavings^000000 1 for ink ^3355FF black ink^000000 1 for ink ^3355FF empty bottle^000000 1 for ink. ";
			next;
			mes "[Sipien=Lyleys]";
			mes "You will be asked to start working on your paper as soon as it is ready." ;
			set RESEARCH_SA,0;
			set CHANGE_SA,10;
			close;
		}
	case 10:
		if(countitem(916) < 1 || countitem(919) < 1 || countitem(1019) < 1 || countitem(1024) < 1 || countitem(713) < 1) {
			mes "[Sipien-Leiries]";
			mes "I don't think you're ready to write your paper yet." ;
			mes "I told you to come prepared." ;
			next;
			mes "[Sipien-Leiries]";
			mes "^3355FF bird feathers^000000 1 for writing instruments ^3355FF beast skins^000000 1 needed for binding ^3355FF wood shavings^000000 1 for ink ^3355FF India ink^000000 1 for ink ^3355FF empty bottle^000000 1 for ink. ";
			next;
			mes "[Sipien=Lyleys]";
			mes "As soon as you are ready, I will help you produce your thesis." ;
			mes "Well, have a good day." ;
			close;
		}
		delitem 916,1;
		delitem 919,1;
		delitem 1019,1;
		delitem 1024,1;
		delitem 713,1;
		mes "[Sipien-Leiries]";
		mes "Then start writing your paper." ;
		mes "I'll watch you on the side." ;
		next;
		mes "......" ;
		next;
		mes "............" ;
		next;
		mes ".................." ;
		next;
		mes "Outside the continent is an ocean, and encompassing that wide ocean is";
		setarray '@word$, "They say it is a huge water bottle", "They say it is a huge snake Jormungand", "They say it is a huge turtle and elephants", "They say it is a huge dish";
		if(select('@word$[0],'@word$[1],'@word$[2],'@word$[3])! =2)
			set '@failed,1;
		mes ""+'@word$[@menu-1];
		mes "The continent is divided into three parts";
		setarray '@word$, "Mount Mjolnir where the spider people live", "Uranos where the giants live", "Utgard where the giants live", "Lutie the land of winter";
		if(select('@word$[0],'@word$[1],'@word$[2],'@word$[3])! =3)
			set '@failed,1;
		mes ""+'@word$[@menu-1];
		setarray '@word$, "Midgard where humans live", "Rune-Midgarts where humans live", "Tritonia where mermaids live", "Morroc the desert city";
		if(select('@word$[0],'@word$[1],'@word$[2],'@word$[3])! =1)
			set '@failed,1;
		mes ""+'@word$[@menu-1];
		setarray '@word$, "Adgalus where the gods live", "Asgard where the gods live", "Schwartzvald where the citizens live", "Prontera the capital of the Rune-Midgarts";
		if(select('@word$[0],'@word$[1],'@word$[2],'@word$[3])! =2)
			set '@failed,1;
		mes ""+'@word$[@menu-1];
		mes "Thus divided." ;
		next;
		if('@failed) {
			mes "[Sipien-Lyles]"; mes "[Sipien-Lyles]";
			mes "......" ;
			mes ""+strcharinfo(0)+ "You, you have a point wrong." ;
			mes "This is not a paper." ;
			next;
			mes "[Sipien-Leiries]";
			mes "I can't show it to the president of the university, so I have to rewrite it." ;
			close;
		}
		mes "Yggdrasil is the root of the world";
		setarray '@word$, "is a huge tree", "is a nice mastella tree", "is a big willow", "is a branch of an old tree";
		if(select('@word$[0],'@word$[1],'@word$[2],'@word$[3])! =1)
			set '@failed,1;
		mes ""+'@word$[@menu-1];
		mes "Its roots extend toward three places." ;
		setarray '@word$, "In Schwartzvald, Jotunheim, and Nibbleheim", "In Midgard, Jotunheim, and Nibbleheim", "In Asgard, Jotunheim, and Nibbleheim", "In Asgard, Jotunheim, and Nibbleheim";
		if(select('@word$[0],'@word$[1],'@word$[2],'@word$[3])! =4)
			set '@failed,1;
		mes ""+'@word$[@menu-1];
		mes "Firmly rooted in the earth." ;
		mes "He who eats the fruit of Ygdrasil";
		setarray '@word$, "all status abnormalities are healed", "all HP and SP are healed", "half HP and SP are healed", "return from silence, curse, and confusion";
		if(select('@word$[0],'@word$[1],'@word$[2],'@word$[3])! =2)
			set '@failed,1;
		mes ""+'@word$[@menu-1];
		next;
		if('@failed) {
			mes "[Sipien-Lyles]";
			mes "......" ;
			mes ""+strcharinfo(0)+ "You, you have a point wrong." ;
			mes "This is not a paper." ;
			next;
			mes "[Sipien-Leiries]";
			mes "I can't show it to the president of the university, so I have to rewrite it." ;
			close;
		}
		mes "......" ;
		next;
		mes "............" ;
		next;
		mes ".................." ;
		next;
		mes "[Sipien-Leiries]";
		mes "Yes, you did your best." ;
		mes "Please take good care of this." ;
		mes "Don't ever lose it." ;
		set CHANGE_SA,15;
		getitem 1550,1;
		next;
		mes "[Sipien-Leiries]";
		mes "Then go and show your paper to the Rector." ;
		mes "He will decide whether you pass or fail graduation." ;
		close;
	case 15:
		mes "[Sipien-Leiries]";
		mes "What are you doing?" ;
		mes "The paper is done, so go show it to the president of the university as soon as possible." ;
		mes "Before you lose that paper!" ;
		close;
	default:
		mes "[Sipien-Leiries]";
		mes "I don't know what you're doing here, but right now I want to GOST exclusively for thinking." ;
		mes "Ask me again later ......." ;
		close;
	}
}

//==========================================
// Tertiary (Monster Research)
//------------------------------------------
yuno_in03.gat,32,102,1 script biology professor 755,{
	if(Job == Job_Sage) {
		mes "[Lucius=Kelsos]";
		mes "Is there something you're unclear on?" ;
		mes "If you have any questions, make an appointment a week in advance. We're busy here, too." ;
		next;
		mes "[Lucius-Kelsos]";
		mes "You know how busy I am." ;
		mes "I thought the guy who became Sage would know what I'm talking about. ......" ;
		next;
		mes "[Lucius-Kelsos]";
		mes "If you have time, go to the dungeon." ;
		mes "You'll learn something just by lying on the floor and looking at the ceiling." ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Lucius-Kelsos]";
		mes "What?" ;
		next;
		mes "[Lucius=Kelsos]";
		mes "Don't play here, go outside with your friends." ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[Lucius=Kelsos]";
		mes "Hmm? Are you here to see the monsters?" ;
		next;
		mes "[Lucius=Kelsos]";
		mes "It's okay to look, but don't touch me everywhere." ;
		mes "Some things are dangerous to touch." ;
		next;
		mes "[Lucius-Kelsos]";
		mes "And if you catch any unusual monsters, please let me know." ;
		mes "I'll buy your information for a high price." ;
		close;
	}
	switch(CHANGE_SA) {
	case 11:
		switch(RESEARCH_SA) {
		case 0:
			mes "[Lucius=Kelsos]";
			mes "Okay, did you pass the practical exam?" ;
			mes "I'm Lucius-Kelsos, a researcher on the cutting edge of biology." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "When a person mentions your name, it is polite to say your name as well." ;
			mes "What is your name?" ;
			next;
			menu strcharinfo(0)+ "Is." ,-;
			mes "[Lucius-Kelsos]";
			mes "Good name. Good to see you." ;
			mes "So let's talk about the field you're going into for your research." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "As you know, your research topic is about monsters." ;
			mes "Have you ever encountered and fought many monsters?" ;
			next;
			if(select("Yes, I tried a lot", "No, not much ......") ==1) {
				mes "[Lucius=Kelsos]";
				mes "Did you put in a lot of effort?" ;
				mes "You generally went to the easy places, didn't you?" ;
				mes "[Lucius-Kelsos]"; mes "Well, that's okay. My classes aren't easy." ;
			}
			else {
				mes "[Lucius-Kelsos]";
				mes "Okay. I don't mind." ;
				mes "That won't be the case once you're in my Research Office. Hahaha." ;
			}
			next;
			mes "[Lucius-Kelsos]";
			mes "Shall we begin then?" ;
			mes "Just keep in mind that my class is a lot to learn in the field." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "All right, go gather these things up." ;
			set RESEARCH_SA,rand(1,3);
			switch(RESEARCH_SA) {
			case 1:
				mes "^3355FF tentacles^000000 5 ^3355FF single cells^000000 5 ^3355FF fish tails^000000 5";
			case 2:
				mes "^3355FF crab nippers^000000 5^3355FF shellfish peel^000000 5^3355FF mermaid heart^000000 5";
				break;
			case 3:
				mes "^3355FF blood vessels^000000 5^3355FF crab nippers^000000 5^3355FF sharp scales^000000 5";
				break;
			}
			next;
			mes "[Lucius=Kelsos]";
			mes "When we have everything, we'll continue the story." ;
			mes "Well, go on then." ;
			close;
		case 1:
		case 2:
		case 3:
			switch(RESEARCH_SA) {
				case 1: setarray '@need,962,1052,1023; break
				case 2: setarray '@need,960,966,950; break
				case 3: setarray '@need,1050,960,963; break
			}
			for(set '@i,0; '@i<3; set '@i,'@i+1) {
				if(countitem('@need['@i]) < 5) {
					mes "[Lucius=Kelsos]";
					mes "Hey, come on, get a grip." ;
					mes "I'm going to say it again, so listen carefully." ;
					next;
					mes "[Lucius=Kelsos]";
					for(set '@i,0; '@i<3; set '@i,'@i+1) {
						mes "^3355FF" +getitemname('@need['@i])+ "^000000 5 pieces";
					}
					close;
				}
			}
			mes "[Lucius=Kelsos]";
			mes "Hey there." ;
			mes "I don't know if you picked it up directly or bought it." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "Anyway, the guys who drop these items have one thing in common." ;
			mes "Do you know what that is?" ;
			next;
			switch(select("It's water", "It's fish and shellfish", "It's active", "It's monster")) {
			case 1:
			case 2:
				mes "[Lucius=Kelsos]";
				mes "Yes, it is water-based and a fish and shellfish." ;
				mes "Most fish and shellfish are water-attributes because they live in watery places." ;
				break;
			case 3:
				if(RESEARCH_SA == 3) {
					mes "[Lucius=Kelsos]";
					mes "Hey ...... Did you grow a leg on the Marine Sphere?" ;
					mes "You really got the veins on your own, didn't you ......?" ;
				}
				else {
					mes "[Lucius=Kelsos]";
					mes "Do ghost shells attack you these days?" ;
					mes "Or did the badons and crabs want an item or two? ......" ;
				}
				next;
				mes "[Lucius-Kelsos]"
				//mes "I guess it's not all prior..." ; //unified because it's a bizarre sentence
				//mes "[Lucius=Kelsos]" ;
				//mes "The commonality is that they're watery despite being fish and shellfish." ;
				mes "Not all of them are active!" ;
				mes "Not at all ......." ;
				mes "They are fish and shellfish and have the water attribute in common." ;
				break;
			case 4:
				mes "[Lucius=Kelsos]";
				mes "......" ;
				mes "That's not what I'm asking." ;
				mes "Not at all. ......" ;
				mes "They are fish and shellfish and have the water attribute in common." ;
				break;
			}
			next;
			mes "[Lucius=Kelsos]";
			mes "Not all fish and shellfish are water-based, but most are." ;
			mes "So which magic works for these fish and shellfish?" ;
			next;
			switch(select("It is Lightning Bolt", "It is Firebolt", "It is Thunderstorm", "It is Frost Diver")) {
			case 1:
				mes "[Lucius=Kelsos]";
				mes "Correct. Lightning Bolt, which is a wind magic, works against the water attribute." ;
				mes "You have to Attention the monsters that respond to the chanting, though." ;
				break;
			case 2:
				mes "[Lucius-Kelsos]";
				mes "You're going to have a bonfire in the river." ;
				mes "It won't work!" ;
				mes "Fish and shellfish are mostly water-based, so wind-based magic works well." ;
				break;
			case 3:
				mes "[Lucius-Kelsos]";
				mes "Thunderstorm will work fine." ;
				mes "It's a wind magic." ;
				mes "But you have to be careful about the point of attack." ;
				break;
			case 4:
				mes "[Lucius-Kelsos]";
				mes "......" ;
				mes "What's the point of giving water to those who like water !!!! A water attack on a water-loving person is almost meaningless." ;
				break;
			}
			mes "[Lucius-Kelsos]";
			mes "By the way, monsters like penomena and starfish are fish and shellfish, but they have different attributes, so you have to be careful." ;
			next;
			mes "[Lucius=Kelsos]";
			mes "So, let's study insects next." ;
			mes "Then ......." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "Go collect these next." ;
			set RESEARCH_SA,rand(4,7);
			switch(RESEARCH_SA) {
			case 4:
				mes "^3355FF spider thread^000000 5 ^3355FF hard skin^000000 5 ^3355FF insect catalyst angle^000000 5";
				break;
			case 5:
				mes "^3355FF hard horn^000000 5 pieces^3355FF catatheli skin^000000 5 pieces^3355FF moth wing powder^000000 5 pieces";
				break;
			case 6:
				mes "^3355FF kamakiri hands^000000 5 ^3355FF mushimuri skins^000000 5 ^3355FF brilliant mushimuri skins^000000 5";
				break;
			case 7:
				mes "^3355FF spider thread^000000 5 pieces^3355FF kamakiri hands^000000 5 pieces^3355FF very tough skin^000000 5 pieces";
				break;
			}
			next;
			mes "[Lucius=Kelsos]";
			mes "When we have everything, we will continue the story." ;
			mes "Well, go on then." ;
			close;
		case 4:
		case 5:
		case 6:
		case 7:
			switch(RESEARCH_SA) {
				case 4: setarray '@need,1025,935,928; break
				case 5: setarray '@need,947,946,1057; break
				case 6: setarray '@need,1031,955,1013; break
				case 7: setarray '@need,1025,1031,943; break
			}
			for(set '@i,0; '@i<3; set '@i,'@i+1) {
				if(countitem('@need['@i]) < 5) {
					mes "[Lucius=Kelsos]";
					mes "What, you forgot the item you asked for?" ;
					mes "Well, okay, I'll say it again." ;
					next;
					for(set '@i,0; '@i<3; set '@i,'@i+1) {
						mes "^3355FFFD" +getitemname('@need['@i])+ "^000000 5 pieces";
					}
					close;
				}
			}
			mes "[Lucius=Kelsos]";
			mes "Okay, I've collected well." ;
			mes "I'm sure you didn't neglect to observe." ;
			mes "Well, this wouldn't have been so hard." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "Insects have a lot more attributes than you might think, so you'll have to think again before using magic." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "It's also worth noting, among other things, that Thief's Hiding and Assassin's Cloaking don't work on them either." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "Some insects act in groups." ;
			mes "As if the boss-class insects were following the soldiers, as it were." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "Like the queen ant Maya or ......." ;
			mes "Mistress of the queen bees, master of the thieving bugs - the golden bugs ......" ;
			next;
			mes "[Lucius-Kelsos]";
			mes "These boss-class ones must be prepared to die if confronted alone." ;
			mes "If you want to explore the habitat of these guys, it would be best to take a companion with you." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "Well, that's enough talk, it's time for me to write my paper." ;
			mes "It needs to be done formally, so let's get on with it." ;
			mes "Before we do that, go ahead and prepare the following." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "^3355FF bird feathers^000000 1 for writing instruments ^3355FF beast skins^000000 1 needed for binding ^3355FF wood shavings^000000 1 for ink ^3355FF India ink^000000 1 for ink ^3355FF empty bottles^000000 1 ";
			next;
			mes "[Lucius=Kelsos]";
			mes "Come back here when you have collected." ;
			mes "You're almost there, keep up the good work." ;
			set RESEARCH_SA,0;
			set CHANGE_SA,12;
			close;
		}
	case 12:
		if(countitem(916) < 1 || countitem(919) < 1 || countitem(1019) < 1 || countitem(1024) < 1 || countitem(713) < 1) {
			mes "[Lucius=Kelsos]";
			mes "What, you're not ready!" ;
			mes "I'll say it again: ......." ;
			next;
			mes "[Lucius-Kelsos]";
			mes "used for writing ^3355FF bird feathers^000000 1 for writing ^3355FF beast skins^000000 1 needed for binding ^3355FF wood shavings^000000 1 for ink ^3355FF black ink^000000 1 for ink ^3355FF empty bottle^000000 1 for ink ";
			next;
			mes "[Lucius=Kelsos]";
			mes "You've worked so hard for this, that's nothing, right?" ;
			mes "Come on, go get ready." ;
			close;
		}
		delitem 916,1;
		delitem 919,1;
		delitem 1019,1;
		delitem 1024,1;
		delitem 713,1;
		mes "[Lucius-Kelsos]";
		mes "Okay, well collected." ;
		next;
		mes "[Lucius=Kelsos]";
		mes "I dare you to write it yourself, but I'll put an example here for your reference." ;
		next;
		mes "[Lucius=Kelsos]";
		mes "All right?" ;
		mes "What I've experienced in my own body is already meaningful enough." ;
		mes "Then let's see it when it's done." ;
		next;
		mes "......" ;
		next;
		mes "............" ;
		next;
		mes ".................." ;
		next;
		menu "Monsters by race",-;
		mes "Monsters are species-specific";
		menu "They have various attributes.",-;
		mes "They have various attributes." ;
		menu "Know the attributes of monsters in advance.",-; mes "The attributes of monsters are known in advance.",-; mes "The attributes of monsters are known in advance.
		mes "Knowing the attributes of monsters in advance"; menu "Knowing the attributes of monsters in advance"; menu "Knowing the attributes of monsters in advance
		menu "You must use magic precisely.",-; mes "You must use magic precisely."; mes "You must use magic precisely."; mes "You must use magic precisely;
		mes "You must use magic precisely." ;
		menu "The monsters you should especially Attention",-; mes "The monsters you should especially Attention",-;
		mes "The monsters that should be especially Attention";
		menu "The monsters of the holy and dark attributes are",-; mes "The monsters of the holy and dark attributes are",-;
		mes "The monsters that should be Attended to are monsters with the holy and dark attributes." ;
		next;
		mes "......" ;
		next;
		mes "............" ;
		next;
		mes ".................." ;
		next;
		mes "[Lucius-Kelsos]";
		mes "Mm, good night!" ;
		mes "Don't lose this one!" ;
		set CHANGE_SA,15;
		getitem 1550,1;
		next;
		mes "[Lucius-Kelsos]";
		mes "This will be read by the president of the university to determine graduation." ;
		mes "You've done well so far." ;
		close;
	case 15:
		mes "[Lucius-Kelsos]";
		mes "What are you doing? I told you to show your paper to the Rector." ;
		mes "Look, don't sell your oil here." ;
		close;
	default:
		mes "[Lucius-Kelsos]";
		mes "Ugh, my head hurts ......." ;
		mes "There's too much stuff to prepare ......" ;
		mes "What! I'm too busy over here!" ;
		next;
		mes "[Lucius Kelsos]";
		mes "If you want to visit, go ahead!" ;
		mes "I've got a headache for nothing. ......" ;
		mes "I've got a headache. ...... (mumble)";
		close;
	}
}

//==========================================
// Tertiary (magical research)
//------------------------------------------
yuno_in03.gat,244,31,3 script Physics Professor 120,{
	if(Job == Job_Sage) {
		mes "[Ebesi=Jorda]";
		mes "Hyohoho, hello." ;
		mes "What can I do for you?" ;
		mes "...... Oh, I'm not Sage~!" ;
		mes "Nice to see you~!";
		next;
		mes "[Ebesi=Jorda]";
		mes "And yet, you're killing time here~?" ;
		mes "Well, it's better than those who are drowned in magic power~"; mes "[Ebeshi-Jorda]"; mes "[Ebeshi-Jorda]" ;
		next;
		mes "[Ebesi=Jorda]";
		mes "Nah nah nah, don't you want to go back to the study house sometimes?" ;
		mes "Don't say that, come on, come on, let's go outside, hyohoho ......." ;
		close;
	}
	if(Job == Job_Novice) {
		mes "[Ebesi = Jorda]";
		mes "Nah nah nah nah nah, not you cute Novice-kun~";
		next;
		mes "[Ebesi=Jorda]";
		mes "Did you come here to play?" ;
		mes "Do you want some candy?" ;
		mes "Hmmm... ......." ;
		next;
		mes "[Ebesi=Jorda]";
		mes "Hyohoho, I don't have any candy. ......" ;
		mes "Look for me at Santa Poring, hyo ho ......" ;
		close;
	}
	if(Job ! = Job_Magician) {
		mes "[Ebesi = Jorda]";
		mes "hmm? Hmm? Nanny nanny?" ;
		next;
		mes "[Ebesi=Jorda]";
		mes "Are you here to watch?" ;
		mes "I don't think there's much to see here." ;
		next;
		mes "[Ebesi=Jorda]";
		mes "Rare?" ;
		mes "Oh my goodness - hyohohohoho";
		close;
	}
	switch(CHANGE_SA) {
	case 13:
		switch(RESEARCH_SA) {
		case 0:
			mes "[Ebesi=Jorda]";
			mes "Hello, nice to see you." ;
			mes "I'm a student who hasn't been here in a while -";
			next;
			mes "[Ebesh-Jorda]";
			mes "Hyohoho, I'm the professor who teaches you." ;
			mes "How do you like it? Aren't you happy? Hyohoho!" ;
			next;
			mes "[Ebesi=Jorda]";
			mes "So, can you do me a favor before the lecture~?" ;
			mes "No, no, it's not hard." ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Bring me only ^3355FF stones^000000 30." ;
			mes "That's it. Not too hard, right?" ;
			next;
			mes "[Ebesi=Jorda]";
			mes "If it's too hard to pick up the stones, ask your friend Thief to do it for you." ;
			mes "Then I'll wait for 30 of them!";
			set RESEARCH_SA,1;
			close;
		case 1:
			if(countitem(7049) < 30) {
				mes "[Ebesi=Jorda]";
				mes "What are you doing?" ;
				mes "Are you here to play a prank on me?" ;
				mes "Come on, come on, stop playing with me and go!" ;
				next;
				mes "[Ebesi=Jorda]";
				mes "I told you to collect ^3355FF stones^000000 30!" ;
				mes "You can easily pick up stones lying on the road, can't you~?" ;
				close;
			}
			mes "[Ebesi=Jorda]";
			mes "Hey, you did a good job collecting them!" ;
			mes "Wait a minute~";
			next;
			mes "[Ebeshi-Jorda]"; mes "[Ebeshi-Jorda]
			mes "Abracadabra!" ;
			next;
			mes "[Ebesi=Jorda]"; mes "[Ebesi=Jorda]
			mes "Abracadabra!" ;
			next;
			mes "[Ebesi=Jorda]"; mes "[Ebesi=Jorda]
			mes "Abraca~tabla!" ;
			next;
			delitem 7049,30;
			mes "[Ebesh-Jorda]";
			mes "See, I made three good stones out of these mere stones!" ;
			next;
			mes "[Ebeshi-Jorda]";
			mes "Satisfied and satisfied." ;
			mes "Right? You're happy, aren't you? Hyohoho!" ;
			next;
			set RESEARCH_SA,2;
			getitem 991,1;
			getitem 993,1;
			getitem 992,1;
			mes "[Ebesi=Jorda]";
			mes "Here, I give you the attribute gem." ;
			mes "And so, and so, still hear me out." ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Go make the following arrows." ;
			mes "^3355FF crystal arrows^000000 50 ^3355FF rock arrows^000000 50 ^3355FF wind arrows^000000 50";
			next;
			mes "[Ebesi=Jorda]";
			mes "If you're a friend of Archer's, he'll make it for you." ;
			mes "Nice to meet you then! Hyohoho~";
			close;
		case 2:
			if(countitem(1754) < 50 || countitem(1756) < 50 || countitem(1755) < 50) {
				mes "[Ebesi=Jorda]";
				mes "Nani nani?" ;
				mes "What happened to the attribute gem I just gave you?" ;
				mes "I didn't think you sold it. ......" ;
				next;
				mes "[Ebesi=Jorda]";
				mes "^3355FF crystal arrows^000000 50 ^3355FF rock arrows^000000 50 ^3355FF wind arrows^000000 50 Ask Archer's friend to make them for you ~hyohoho";
				close;
			}
			mes "[Ebesi=Jorda]";
			mes "Hey, you brought it well." ;
			mes "Well, let's get on with the lecture." ;
			next;
			mes "[Ebesi=Jorda]";
			mes "I'm going to read to you, so listen carefully and cross out the important parts." ;
			next;
			mes "[Ebesh-Jorda]";
			mes "Water magic is strong against fire magic." ;
			mes "Just think of it as water on fire." ;
			mes "It's easy, right?" ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Wind magic is strong against water magic." ;
			mes "What happens when lightning strikes a lake?" ;
			mes "Hyohoho!" ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Earth magic is strong against wind magic." ;
			mes "If you wanted to block the wind, you'd build a house out of dirt, right? That's it." ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Fire magic is strong against earth magic." ;
			mes "If a fire breaks out, the trees will burn, right? It's the same ......." ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Oro, is it that late already?" ;
			mes "Well then - let's continue next time." ;
			next;
			delitem 1754,50;
			delitem 1756,50;
			delitem 1755,50;
			mes "[Ebesi=Jorda]";
			mes "I want only one ^3355FF holy water^000000 to be ready by next time." ;
			mes "If my friend doesn't have a clergyman, I'll have to make it on my own." ;
			set RESEARCH_SA,3;
			close;
		case 3:
			if(countitem(523) < 1) {
				mes "[Ebesi=Jorda]";
				mes "What are you doing!" ;
				mes "Don't forget!"; mes "Don't forget!"; mes "Don't forget!"; mes "Don't forget!
				next;
				mes "[Ebesh-Jorda]";
				mes "^3355FF holy water ^000000 Ask your friends at Acolyte and Priest for one. Hyohoho";
				close;
			}
			mes "[Ebeshi=Jorda]";
			mes "Yo shiyo shi!" ;
			mes "Well brought!" ;
			mes "Well, well, well, I must continue my lecture." ;
			next;
			mes "[Ebesi=Jorda]";
			mes "I'll read to you again this time, so listen carefully and take notes." ;
			next;
			mes "[Ebeshi-Jorda]"; mes "[Ebeshi-Jorda]
			mes "Water attribute is weak against wind magic!" ;
			mes "Wouldn't it have hurt if lightning struck you when you were frozen? Hyohoho!" ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Wind attribute is weak against earth magic!" ;
			mes "If a little girl who is flying around falls down, she will get a big injury, right?" ;
			mes "hyo_......" ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Earth attributes are weak against fire magic!" ;
			mes "If a tree that grows out of the earth were to catch fire, it would burn and disappear, wouldn't it?" ;
			next;
			mes "[Ebesi=Jorda]";
			mes "The fire attribute is weak against water magic!" ;
			mes "It's still water that cools down hot things." ;
			next;
			mes "[Ebesi=Jorda]";
			mes "Alright, that's it for the lecture: ～～～～～!" ;
			mes "Did you understand it well?" ;
			next;
			delitem 523,1;
			mes "[Ebesi=Jorda]";
			mes "Yes, now we just need to get the paper done and it will be perfect." ;
			mes "I knew my lectures were the best." ;
			mes "Hyo hoo hoo hoo!" ;
			set RESEARCH_SA,0;
			set CHANGE_SA,14;
			next;
			mes "[Ebesi=Jorda]";
			mes "Then let's get ready to write the paper as soon as possible." ;
			mes "^3355FF bird feathers^000000 1 for writing instruments ^3355FF beast skins^000000 1 needed for binding ^3355FF wood shavings^000000 1 for ink ^3355FF India ink^000000 1 for ink ^3355FF empty bottle^000000 1 ";
			next;
			mes "[Ebesi=Jorda]";
			mes "Prepare this much." ;
			mes "I'll be waiting." ;
			close;
		}
	case 14:
		if(countitem(916) < 1 || countitem(919) < 1 || countitem(1019) < 1 || countitem(1024) < 1 || countitem(713) < 1) {
			mes "[Ebesi=Jorda]";
			mes "Nani nani?" ;
			mes "Don't forget~"; mes "Don't forget~";
			next;
			mes "[Ebesi=Jorda]"; mes "[Ebesi=Jorda]
			mes "^3355FF bird feathers^000000 1 for writing ^3355FF beast skins^000000 1 needed for bookbinding ^3355FF wood shavings^000000 1 for ink ^3355FF black ink^000000 1 for ink ^3355FF empty bottle^000000 ";
			next;
			mes "[Ebesi=Jorda]";
			mes "You can at least do the preparation by yourself, right?" ;
			mes "I don't mind if you help me - I'll be waiting for you then!" ;
			close;
		}
		delitem 916,1;
		delitem 919,1;
		delitem 1019,1;
		delitem 1024,1;
		delitem 713,1;
		mes "[Ebesi=Jorda]";
		mes "Mm." ;
		mes "Then let's write it." ;
		mes "I taught it to you, so you'll be fine~~hyohoho!" ;
		next;
		mes "......" ;
		next;
		mes "............" ;
		next;
		mes ".................." ;
		next;
		mes "Attribute magic consists of four elements,";
		setarray '@word$, "Divided into water, earth, fire, and wind", "Divided by earth, water, fire, and wind", "Divided by water, wind, earth, and fire";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1]+ "."" ;
		mes "Each attribute has a characteristic, ";
		setarray '@word$, "Wind magic is strong against water", "Water magic is strong against fire", "Fire magic is strong against earth";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1];
		setarray '@word$, "Earth attribute magic is strong against wind attribute." mes ""+'@word$[@menu-1]; setarray '@word$, "Wind magic is strong against water magic."" , "Water magic is strong against fire magic." ;
		mes ""+'@word$[@menu-1];
		setarray '@word$, "But because weaknesses also exist", "the same applies to attribute weapons", "because different races have different attributes";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1];
		setarray '@word$, "You need to figure out your abilities", "You should change your attributes depending on your location", "Rumor has it that red potions taste like strawberries";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1]+ "."" ;
		next;
		setarray '@word$, "The prettiest girl is Amy of Prontera", "They say red potions are made from Poring", "The depths of magic are beyond human knowledge";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1];
		setarray '@word$, "The merchant lady in Morroc is cute too.", "I don't know why it tastes like strawberry.", "It's dangerous to rely on magic unnecessarily."
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1]+ "."" ;
		setarray '@word$, "If you give me a rabbit hairband", "Then the white potion tastes", "The proper magic use and rest";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1];
		setarray '@word$, "gives me pleasure", "hard to imagine", "ensures safe combat";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1]+ "."" ;
		setarray '@word$, "Rabbit hairbands fit Acolyte", "I like the harried feeling", "Tie the party together with other professions";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1];
		setarray '@word$, "I really want to know if it's good for Knight", "I can't drink it if I'm running out of energy", "I prefer to hope for a battle with it";
		set @menu,select('@word$[0],'@word$[1],'@word$[2]);
		mes ""+'@word$[@menu-1]+ "."" ;
		next;
		mes "......" ;
		next;
		mes "............" ;
		next;
		mes ".................." ;
		next;
		mes "[Ebesi=Jorda]";
		mes "Hohoho - that's pretty tasteful - there, you've done it. Hyohoho";
		set CHANGE_SA,15;
		getitem 1550,1;
		next;
		mes "[Ebesi=Jorda]";
		mes "Let's show that to the rector." ;
		mes "Then you'll graduate too!" ;
		mes "Hyoho~";
		close;
	case 15:
		mes "[Ebesi=Jorda]";
		mes "What are you doing?" ;
		mes "You have to go quickly!" ;
		next;
		mes "[Ebesi=Jorda]";
		mes "You'll forget something, won't you?" ;
		mes "Go ahead and graduate quickly before it's too late!" ;
		close;
	default:
		mes "[Ebesi=Jorda]";
		mes "What is it?" ;
		next;
		mes "[Ebesi=Jorda]";
		mes "Did you come to visit?" ;
		mes "Not much to see here, huh?" ;
		next;
		mes "[Ebesi=Jorda]";
		mes "Well, feel free to look around - hyo hoo hoo hoo";
		close;
	}
}
