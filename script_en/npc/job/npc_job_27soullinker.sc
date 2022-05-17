//====================================================================
//Ragnarok Online SoulLinker Jobchange Script
// - CHANGE_SL -> 0-4
//====================================================================

//==========================================
// Application for Test
//------------------------------------------

morocc_in.gat,174,30,6 script children 716,{
	if(Job == Job_Linker) {
		mes "[Child]";
		mes "May peace be with you and the souls who walk with you on the path ahead!" ;
		mes "...... Ehehe!" ;
		close;
	}
	if(Job ! = Job_Taekwon) {
		mes "[child]";
		mes "......" ;
		mes "I have no use for you!" ;
		close;
	}
	if(JobLevel < 40) {
		mes "[child]";
		mes "............." ;
		close;
	}
	switch(CHANGE_SL) {
	case 0:
		mes "[child]";
		mes "............" ;
		mes "You." ;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "Hmm?" ;
		next;
		mes "[child]";
		mes "Yeah, yeah." ;
		mes "You there." ;
		mes "That's you." ;
		next;
		if(select("Me, why are you being so violent?" , "ignore")==2) {
			mes "[child]";
			mes "What?  Oh, hey!" ;
			mes "Wait a minute!" ;
			mes "Where are you going!" ;
			mes "Listen to me for a second!" ;
			close;
		}
		EMOTION 32;
		mes "[child]";
		mes "Don't think of them as children and ignore them." ;
		mes "This still makes me ..... .305 years old." ;
		next;
		mes "[child]";
		mes "Your martial arts ....... Do you really think that's the path you should be on?" ;
		mes "As I see it, there is another path for you." ;
		next;
		mes "[child]";
		mes "Think about it." ;
		mes "The people you've met, strong Wizards, Alchemists, etc. ......." ;
		mes "Did any of those people seem strange to you?" ;
		next;
		mes "[child]";
		mes "Yes, weird people ...... For example, ......." ;
		mes "Ghosts, for example." ;
		next;
		emotion 18;
		mes "[child]";
		mes "Oh, don't be afraid." ;
		mes "Those people just showed up because they were on your mind. You just might not know it yet." ;
		next;
		mes "[Kids]";
		mes "They want to fight." ;
		mes "But they don't have a body, so all they can do is watch." ;
		mes "There is something you can do for them." ;
		mes "That's ...... It's what they can do for you." ;
		next;
		mes "[child]";
		mes "You can't use their power yourself." ;
		mes "But you can lend your power to those who are in the occupation of their soul's life." ;
		next;
		mes "[child]";
		mes "And since that soul still remains in the world after death, it must have been very strong in life." ;
		next;
		mes "[child]";
		mes "Let's conclude." ;
		mes "Are you going to be a 'Soul Linker'?" ;
		next;
		if(select("Where am I, Mom?" , "Soul Linker?")==1) {
			mes "[child]";
			mes "d~k~ra~, she's not a child!" ;
			mes "Why don't you listen to people!" ;
			mes "Totally ......." ;
			close;
		}
		mes "[child]";
		mes "Yes, it's Soul Linker." ;
		mes "One who can strengthen his friends with the help of the dead who have strong powers." ;
		mes "You have the qualities to do so." ;
		mes "You just don't know it yet." ;
		mes "How about it?  Want to give it a try?" ;
		next;
		if(select("No. ......" yes!") ==1) {
			mes "[child]";
			mes "...... It's a residual ghost." ;
			mes "If you later decide to abandon the path of the fist, visit me." ;
			close;
		}
		mes "[child]";
		mes "Ok. ...... Then I'll tell you what you need for the ritual." ;
		mes "A ^000000FF wilting rose^000000FF three carats of diamonds, and a ^000000FF unstoppable heart^000000FF." ;
		mes "Come back when you have everything ready." ;
		set CHANGE_SL,1;
		close;
	case 1:
		mes "[child]";
		mes "Wellcome." ;
		mes "Let's see, ...... Did you bring ^000000FF wilting roses ^000000FF wilting roses ^000000FF diamonds 3 carats ^000000FF and ^000000FF unstoppable hearts ^000000FF?" ;
		next;
		if(select("Here it is", "No, still ......") ==2) {
			mes "[child]";
			mes "Well, okay." ;
			mes "I have plenty of time anyway." ;
			mes "Just bring it in when it's convenient for you, and you'll get it right." ;
			close;
		}
		if(countitem(748) < 1 || countitem(732) < 1 || countitem(929) < 1) {
			emotion 32;
			mes "[child]";
			mes "Hey, you're missing." ;
			mes "I can't believe you lied to me. ......." ;
			mes "Just because you look like a kid, don't think you can lie!" ;
			next;
			mes "[child]";
			mes "Get it right this time!" ;
			mes "...... I have plenty of time, so when it's convenient for you is fine." ;
			mes "Make sure you get it right!" ;
			close;
		}
		delitem 748,1;
		delitem 732,1;
		delitem 929,1;
		mes "[child]";
		mes "Okay, I've certainly received it." ;
		mes "Well, let's see: ......." ;
		mes "I'll explain later why I told you to go collect these ......." ;
		next;
		mes "[Maia]";
		mes "My name is Maia." ;
		mes "and ......." ;
		mes "As you may have already guessed, I am not of this world." ;
		next;
		mes "[Maia]";
		mes "It's not that I can't go to the other side." ;
		mes "But because there are things left for me to do." ;
		mes "When my successor comes along, I'll be able to ......." ;
		mes "I'd be willing to give it up if someone was willing to do it." ;
		next;
		mes "[Maia]";
		mes "Yes, I am here to identify those who have the qualities and make them Soul Linker." ;
		next;
		mes "[Maia]";
		mes "When you're ready, give me a shout." ;
		set CHANGE_SL,2;
		close;
	case 2:
		if(SkillPoint) {
			mes "[Maia]";
			mes "You have some SkillPoints left!" ;
			mes "I can't make you a Soul Linker unless you accomplish everything you should as a fist wielder." ;
			mes "Go ahead and learn it quickly!" ;
			close;
		}
		if(getmapusers("job_soul.gat")) {
			mes "[Maia]";
			mes "Oh, just a minute." ;
			mes "Now someone else is performing the ritual to become a Soul Linker." ;
			close;
		}
		mes "[Maia]";
		mes "Okay, then follow me!" ;
		close2;
		warp "job_soul.gat",30,30;
		end;
	case 3:
	case 4:
		mes "[maia]";
		mes "...... Now may we perform the ritual?" ;
		next;
		if(select("No, hey ......" , "yes!") ==1) {
			mes "[Maia]";
			mes "Well, ...... Remaining GHOST.";
			mes "If you change your mind again, talk to me." ;
			close;
		}
		if(getmapusers("job_soul.gat")) {
			mes "[Maia]";
			mes "Oh, just a minute." ;
			mes "Now someone else is performing the ritual to become a Soul Linker." ;
			close;
		}
		mes "[Maia]";
		mes "Okay, then, let's get inside your mind: ......." ;
		close2;
		warp "job_soul.gat",30,30;
		end;
	}
}

//==========================================
// exam and job change
//------------------------------------------

job_soul.gat,37,30,5 script mya#SL_Test 716,7,1,{
OnTouch:
	if(getnpctimer(1) == 0) //if timer was not running
		initnpctimer;
	switch(CHANGE_SL) {
	case 2:
		mes "[Maia]";
		mes "This is your mind." ;
		mes "And ...... There are souls gathered here, guided by your heart." ;
		next;
		mes "[Maia]";
		mes "When you become a Soul Linker, they will always help you and strengthen your people." ;
		next;
		mes "[Maia]";
		mes "There are few souls gathered now ......." ;
		mes "The souls you gather depend on how diligently you practice as a Soul Linker." ;
		mes "Eventually, you should be able to bring in stronger souls." ;
		next;
		mes "[Maia]";
		mes "You have only three minutes here to face your own mind." ;
		mes "It's already been counted." ;
		mes "[Maia]"; mes "Come on, give them a shout." ;
		set CHANGE_SL,3;
		close;
	case 3:
		mes "[Maia]";
		mes "Listen to the words of the souls and take them to heart." ;
		close;
	case 4:
		mes "[Maia]";
		mes "If you talk to them enough, you can become a Soul Linker." ;
		mes "What do you think?" ;
		next;
		if(select("talk to them some more", "change your job to Soul Linker")==1) {
			mes "[Maia]";
			mes "Ok." ;
			mes "But time is limited, so you'd better do it quickly." ;
			close;
		}
		mes "[Maia]";
		mes "Ok." ;
		mes "Then we will begin the ritual." ;
		next;
		misceffect 247,"";
		mes "[Maia]";
		mes "The rose that does not wilt, withers in your stead,";
		next;
		mes "[Maia]";
		mes "The heart that never stops, ceases its activity in your stead,"; next; mes "[Maia]"; mes "The heart that never stops, ceases its activity in your stead,
		next;
		mes "[Maia]";
		mes "The diamond that never breaks will break in your stead." ;
		next;
		mes "[Maia]";
		mes "and ......" ;
		mes "Those who want to fight will fight for you." ;
		next;
		unequip;
		jobchange Job_Linker;
		set CHANGE_SL,0;
		mes "[Maia]";
		mes "As one fine Soul Linker, you ...... from now on." ;
		mes "No, may peace be with you and the souls that walk with you on your path!" ;
		close2;
		warp "morocc.gat",156,46;
		end;
	}
OnTimer180000:
	stopnpctimer;
	areawarp "job_soul.gat",30,30,30, "morocc.gat",157,47;
	end;
}

job_soul.gat,23,30,6 script Alchemist's soul 744,{
	mes "[Alchemist's soul]";
	mes "No one has better skills than me." ;
	mes "I can manufacture more quickly than anyone else." ;
	next;
	mes "[Alchemist soul]";
	mes "After all, I was partly to blame for such overconfidence ......." ;
	mes "I died in an accident." ;
	next;
	mes "[Alchemist's soul]";
	mes "But rather by his death, he gained strength." ;
	mes "Even faster manufacturing is now possible: ......." ;
	mes "Then I want to try manufacturing!" ;
	mes "Such a will was born." ;
	next;
	mes "[The Soul of an Alchemist]";
	mes "I want to help my juniors to do more ...... I want to give them my strength and to give them more will!" ;
	next;
	mes "[Soul of an Alchemist]";
	mes "I would appreciate your cooperation." ;
	if(CHANGE_SL == 3)
		set CHANGE_SL,4;
	close;
}

job_soul.gat,30,23,7 script Sage's soul 754,{
	mes "[Sage's soul]";
	mes "Destruction!" ;
	mes "Destruction is the only way I will go!" ;
	mes "I grew old before I was alive, before I had done as much destruction as I wanted." ;
	next;
	mes "[Sage's soul]";
	mes "If someone adventuring around the world wants to use my power to beat and destroy the things of the world, I will gladly lend my help!" ;
	next;
	mes "[Sage's soul]";
	mes "I, I, I have the power to destroy everything in the world!" ;
	mes "But without your help, it is as good as nothing!" ;
	next;
	mes "[Sage's soul]";
	mes "I want to leave it to you!" ;
	if(CHANGE_SL == 3)
		set CHANGE_SL,4;
	close;
}

job_soul.gat,30,37,5 script Monk's soul 827,{
	mes "[Monk's soul]";
	mes "When I was alive, I thought I had done all I had to do as Monk." ;
	mes "But when I died and thought about it again, I wasn't so sure." ;
	next;
	mes "[Monk's soul]";
	mes "I want to pass on these skills to my juniors." ;
	mes "But I can't teach them directly." ;
	mes "So the juniors can't handle that technology without my help, but ......." ;
	next;
	mes "[Monk's soul]";
	mes "Still, I need your help to take over." ;
	mes "At any rate, why don't you help me and teach the juniors of the world about the higher world?" ;
	next;
	mes "[Monk's soul]";
	mes "Please!" ;
	if(CHANGE_SL == 3)
		set CHANGE_SL,4;
	close;
}
