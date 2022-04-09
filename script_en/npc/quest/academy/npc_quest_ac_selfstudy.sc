//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Self-study Room
// by refis
//------------------------------------------------------------

ac_cl_room.gat,152,41,4	script	Yuta#ac_cl_room	84,{
	if(Job != Job_Novice){
		mes "[Yuta]";
		mes "Congratulations!";
		mes "It looks like you passed the test to move to the first job.";
		close;
	}
	mes "[Yuta]";
	mes "Are you one of the new students?";
	mes "I'm Yuta.";
	mes "I'm teaching about changing jobs to the first level.";
	next;
	mes "[Yuta]";
	mes "As you may know, once you reach JobLv 10 and your basic skills reach Lv 9, you will be able to change to the 1st job.";
	next;
	mes "[Yuta]";
	mes "But you see, each profession has different requirements for changing jobs.";
	mes "Some professions require you to go through trials, and some are more difficult than others.";
	next;
	mes "[Yuta]";
	mes "So, in order to prepare you for changing jobs, the Adventurer Academy collects information about job changes that our seniors have overcome and teaches it to you, the new students.";
	while(1){
		next;
		mes "[Yuta]";
		mes "Which profession would you like to know about changing jobs?";
		mes "I'll tell you anything you want to know.";
		next;
		switch(select("Swordsman", "Magician", "Acolyte", "Thief", "Archer", "Merchant", "Taekwon Kid", "Special primary occupation", "I know about the occupation")){
		case 1:
			mes "[Yuta]";
			mes "You must be Swordsman.";
			mes "You can change your job to Swordsman at the Swordsman's Guild ^0000FFIzlude, which is located ^0000FF to the west of the city of ^0000FF.";
			break;
		case 2:
			mes "[Yuta]";
			mes "You're a Magician.";
			mes "You can change your job to Magician at the ^0000FFMagic School ^0000FFMagic School ^0000FFMagic School ^0000FFMagician in the northwest of the city of ^0000FFGeffen.";
			break;
		case 3:
			mes "[Yuta]";
			mes "Acolyte, right?";
			mes "You can change your job to Acolyte at the cathedral ^0000FF in the northeast of ^0000FF town of Prontera.";
			break;
		case 4:
			mes "[Yuta]";
			mes "You're Thief.";
			mes "You can change your job to Thief at the Thief Guild ^000000 in the B1F of the ^0000FF Pira Mido dungeon.";
			break;
		case 5:
			mes "[Yuta]";
			mes "You're an Archer.";
			mes "You can change your job to Archer at the Archer Guild ^000000 in ^0000FFPayonArcher Village.";
			break;
		case 6:
			mes "[Yuta]";
			mes "You are a Merchant.";
			mes "You can change your job to Merchant at the Merchant's Association ^000000 in ^0000FFAlberta.";
			break;
		case 7:
			mes "[Yuta]";
			mes "You must be Taekwon Kid.";
			mes "You can change your job to Taekwon Kid by ^0000FFPayon^000000.";
			next;
			mes "[Yuta]";
			mes "There is a person named ^FF0000 Phoenix^000000 in the center^000000 of the city of ^0000FFPayon.";
			mes "In coordinates, it is around (^0000FF157,141^000000).";
			mes "If you talk to the Phoenix, you can take an exam.";
			next;
			mes "[Yuta]";
			mes "The test is to raise your Base level by 1. After you raise your Base level by 1 by defeating monsters, talk to the Phoenix.";
			mes "Then you can change your job to Taekwon Kid.";
			break;
		case 8:
			mes "[Yuta]";
			mes "It's about 1st job expanded.";
			mes "What is the occupation you want to ask about?";
			next;
			switch(select("Gunslinger", "Ninja", "Supernovice", "Ask about other professions")){
			case 1:
				mes "[Yuta]";
				mes "You're a Gunslinger.";
				mes "You can change your job to Gunslinger with ^0000FFEinbroch^000000.";
				next;
				mes "[Yuta]";
				mes "You can talk to someone named ^000000^FFF0000 Master Miller^000000 who is in the building in the center of ^0000FFEinbroch.";
				next;
				mes "[Yuta]";
				mes "You'll be asked to meet ^FF0000Fansople^000000 in Payon, so let's go meet Fathomple.";
				mes "Fansopulu is in ^0000FFPayon, south of the city of ^0000FFPayon.";
				mes "The coordinates are around (^0000FF184,65^000000).";
				next;
				mes "[Yuta]";
				mes "Fansople asks me to bring ^FF0000 3 mushroom spores, 1 wood chip, 10 hard bark, 3 soft hairs, 3 sticky liquid, 3 green herbs ^000000.";
				next;
				mes "[Yuta]";
				mes "Do you want to know how to collect these items?";
				next;
				if(select("want to know", "not now")==2) break;
				mes "[Yuta]";
				mes "I'll explain.";
				mes "There are many ways to get it, so I'll just tell you the typical way.";
				mes "First, I'll tell you what you can get by defeating monsters.";
				next;
				mes "[Yuta]";
				mes "Mushroom spores are ^FF0000 spores. ^000000Wood chips are ^FF0000willow and elderwillow. ^000000The hard bark is ^FF0000Chonchon, Steel Chonchon. ^000000";
				next;
				mes "[Yuta]";
				mes "The soft hairs are ^FF0000Lunatic, Picchi, Fable. ^000000Green herbs are ^FF0000Green grass, PoPoring. ^000000Sticky liquid is ^FF0000Poring, Drops. ^000000";
				next;
				mes "[Yuta]";
				mes "Next, I'll tell you the ingredients you can buy at the store.";
				mes "Milk is sold for ^FF000025Zeny^000000 in the southwest of the city of ^0000FFProntera.";
				mes "The coordinates are (^0000FF73,134^000000).";
				next;
				mes "[Yuta]";
				mes "When you collect the materials, give them to Fansopulu, then talk to Master Miller and you can change your job to Gunslinger.";
				break;
			case 2:
				mes "[Yuta]";
				mes "You're a Ninja.";
				mes "You can change your job to Ninja at ^0000FFAmatsu^000000.";
				mes "First, meet someone named ^FF0000Kuga Kai^000000 at Amatsu.";
				next;
				mes "[Yuta]";
				mes "Kuga Kai is in a house around the center of the city of Amatsu. The coordinates are (^0000FF148,140^000000).";
				mes "When you enter the house, it looks empty, but the wall is a hidden passage.";
				next;
				mes "[Yuta]";
				mes "In the coordinates, the wall around (^0000FF29,152^000000) is a hidden passage.";
				mes "Kuga Kai is at the end of that hidden passage.";
				next;
				mes "[Yuta]";
				mes "When you get to the town of Einbroch, talk to a man named Oze at coordinates (173,229) a little north of the center of town and pay him 10 Zeny to move to the gazebo.";
				next;
				mes "[Yuta]";
				mes "At ^0000FF gazebo^000000 there is a ^0000FF young man^000000, talk to him and he will ask you to bring ^FF0000 30 iron ore^000000 and 1 ^FF0000 placon^000000.";
				next;
				mes "[Yuta]";
				mes "After you give those items to ^FF0000Youth^000000, go see Kuga Kai in Amatsu.";
				next;
				mes "[Yuta]";
				mes "Talk to Kuuga Kai and he will ask you to bring him another ^FF0000 30 iron ore and 1 plastic con ^000000.";
				next;
				mes "[Yuta]";
				mes "If you give those items to Kuuga Kai, you can change your job to Ninja.";
				mes " Do you have any other questions about changing jobs to Ninja?";
				while(1){
					next;
					switch(select("How to get to Amatsu", "How to get from Amatsu to Einbroch", "How to collect iron ore and plasticons", "Enough")){
					case 1:
						mes "[Yuta]";
						mes "You can get to Amatsu from Alberta.";
						mes "But it costs 10000Zeny.";
						next;
						mes "[Yuta]";
						mes "However, if your ^FF0000JobLv is 10, someone named ^FF0000Akagi^000000 in the southwest of the city of ^000000Alberta will transfer you to Amatsu for free.";
						next;
						mes "[Yuta]";
						mes "^FF0000Akagi^000000 is located at coordinates around (^0000FF32,64^000000).";
						mes "Is there anything else you want to ask?";
						continue;
					case 2:
						mes "[Yuta]";
						mes "I'll tell you how to get to Einbroch from Amatsu.";
						mes "First, take a boat from ^0000FFAmatsu to Alberta. This is a free trip.";
						next;
						mes "[Yuta]";
						mes "And next, from ^0000FFAlberta, take a boat to Izlude. It'll cost ^000000500Zeny.";
						mes "And next";
						next;
						mes "[Yuta]";
						mes "From ^0000FFIzlude you take an airship to Yuno. You can go straight to Einbroch by changing airships at the airfield in Juno. It will cost you ^0000001200Zeny.";
						next;
						mes "[Yuta]";
						mes "It will cost 1700Zeny in total.";
						mes "Is there anything else you want to ask?";
						continue;
					case 3:
						mes "[Yuta]";
						mes "I'll tell you how to collect iron ore and placons.";
						mes "First, iron ore.";
						mes "This is an item that monsters drop.";
						next;
						mes "[Yuta]";
						mes "Monsters that drop these include ^FF0000 Chon Chon, Amber Knight, and Zerom ^000000.";
						mes "However, it is rare for them to drop iron ore.";
						mes "You may have a hard time when it comes to collecting it.";
						next;
						mes "[Yuta]";
						mes "You can buy the plastic cones at the store.";
						mes "They sell 200zeny at the refineries in each town.";
						mes "You can also find them in Alberta, in the Merchant's Guild building in the southwest part of the city.";
						next;
						mes "[Yuta]";
						mes "Is there anything else you want to ask?";
						continue;
					}
					break;
				}
				break;
			case 3:
				set '@snovice,1;
				mes "[Yuta]";
				mes "You're Supernovice.";
				mes "The transition to Supernovice is quite special.";
				mes "You need ^FF0000Base level 45 or more and ^000000Job level 10.";
				next;
				mes "[Yuta]";
				mes "You can change jobs in Supernovice with ^0000FFAldebaran^000000.";
				mes "In a building in the south of the city of ^0000FFAldebaran ^000000, there is a man named ^000000, ^FF0000 Tzele^000000.";
				mes "The coordinates of the building location are around (^0000FF116,63^000000).";
				next;
				mes "[Yuta]";
				mes "Talk to Tzele and he will ask you to bring ^FF0000 sticky liquid and 30 ^000000 dewdrops from an old tree.";
				next;
				mes "[Yuta]";
				mes "If you bring these items, you can change your job to Supernovice.";
				mes "Do you have any other questions about changing jobs in Supernovice?";
				while(1){
					next;
					switch(select("How to get to Aldebaran", "How to get sticky liquid, old tree dew", "Enough")){
					case 1:
						mes "[Yuta]";
						mes "You can go to Aldebaran from Izlude for 1800Zeny with the Capra transfer service.";
						mes " Is there anything else you want to ask?";
						continue;
					case 2:
						mes "[Yuta]";
						mes "I'll tell you how to collect the sticky liquid, the dew from the old tree.";
						mes "First, sticky liquid.";
						next;
						mes "[Yuta]";
						mes "^FF0000Sticky liquid ^000000 will be dropped by ^FF0000Poring, PoPoring^000000.";
						next;
						mes "[Yuta]";
						mes "^FF0000Dew^000000 from old trees^000000 will be dropped by ^FF0000Willow, Elderwillow^000000.";
						mes "Is there anything else you want to ask?";
						continue;
					}
					break;
				}
				break;
			}
			break;
		default:
			if(!'@snovice){
				mes "[Yuta]";
				mes "If you're done with your training, ^0000FFFaye^000000 in the ^0000FF training room^000000 will send you to your new job location and you can ask him.";
				next;
				mes "[Yuta]";
				mes "The ^0000FFF training room^000000 where ^0000FFFaye^000000 is located is the same place where ^0000FFF receptionist^000000 was.";
				mes "If you get lost, check the ^0000FF triangle-shaped information plate^0000FF to see where you are.";
				close;
			}
			mes "[Yuta]";
			mes "Well, to become a Supernovice, you need to have a ^FF0000Base level of 45^000000 or higher^000000, so you need to fight monsters in the ^0000FFPractice Room^000000 or the ^0000FFSpecial Room^000000, or you need to fight in the ^0000FFLune. I think I'd like to help with the work^000000 and see the world.";
			next;
			mes "[Yuta]";
			mes "But compared to other professions, there may be a lot of difficulties until you fulfill the requirements.";
			mes "If it gets hard, choosing another profession might be an option.";
			next;
			mes "[Yuta]";
			mes "^0000FFPractice Room^000000 is the upper part after leaving Self-study Room, ^0000FFLune^000000 is the lower right part after leaving Self-study Room.";
			next;
			mes "[Yuta]";
			mes "You can go to the one you're interested in.";
			close;
		}
	}
}

ac_cl_room.gat,145,48,4	script	Phee#ac_cl_room	123,{
	mes "[Phee]";
	mes "Hello.";
	mes "I am Phee.";
	mes "I teach new students about special acquisition skills.";
	next;
	if(Job == Job_Novice){
		mes "[Phee]";
		mes "But you're still a Novice.";
		mes "Talk to me again when you get your first job.";
		close;
	}
	mes "[Phee]";
	mes "Some skills are acquired by having certain people teach them to you.";
	mes "You have to be taught by that person to get them all the time.";
	next;
	mes "[Phee]";
	mes "Of the primary professions, ^FF0000Swordsman, Magician, Acolyte, Thief, Archer, and Merchant^000000 have that special skill.";
	next;
	mes "[Phee]";
	mes "Honey, would you like to know more about this skill?";
	next;
	if(select("I'd like to know", "now is good")==2){
		mes "[Phee]";
		mes "Oh, yeah.";
		mes "If you want to ask, you're always welcome.";
		close;
	}
	switch(Job){
	case Job_Swordman:
		mes "[Phee]";
		mes "Your occupation is Swordsman.";
		mes "As a Swordsman, you have three skills that you can get from quests: ^FF0000 rapid attack, auto-versaque, and HP recovery on movement^000000.";
		mes "Which skill would you like to know about?";
		while(1){
			next;
			switch(select("kryptonite attack", "auto-versaque", "HP recovery on movement", "enough is enough")){
			case 1:
				mes "[Phee]";
				mes "^FF0000Attack on the point of impact^000000 is a skill that has a certain probability of causing a stun when you use a bash of level 6 or higher.";
				next;
				mes "[Phee]";
				mes "^FF0000The condition for obtaining this skill is that you have a Job level of 25 or higher^000000.";
				mes "Once you have met the acquisition condition, talk to someone named ^FF0000 Leo von Frisch^000000 in the Prontera Knights.";
				next;
				mes "[Phee]";
				mes "The Prontera Knights are located northwest of the city of Prontera.";
				mes "In coordinates, it's around (^0000FF48,344^000000).";
				next;
				mes "[Phee]";
				mes "And if you bring Leo von Frisch 10 ^FF0000 flame arrows, 10 silver arrows, 1 banana juice, 30 tentacles, 5 royal jelly ^000000, you'll get the kryptonite attack skill.";
				break;
			case 2:
				mes "[Phee]";
				mes "^FF0000 Auto Versac^000000 is a skill that, if used when you are dying, will turn you rabid and put you in the same state as if you had used Provoc level 10.";
				next;
				mes "[Phee]";
				mes "^FF0000The condition for obtaining this skill is that your Job level is at least 30 ^000000.";
				mes "Once you meet the acquisition condition, talk to someone named ^FF0000 fan ^000000 in the Prontera refinery.";
				next;
				mes "[Phee]";
				mes "The Prontera refinery is located in the center of the city of Prontera.";
				mes "In coordinates, it is around (^0000FF176,187^000000).";
				next;
				mes "[Phee]";
				mes "And to the fan, take 35 ^FF0000 butterfly scales, 10 fangs of the deceased, 10 claws of the deceased, and 10 bee honey^000000 and you'll get the auto-berserk skill.";
				break;
			case 3:
				mes "[Phee]";
				mes "^FF0000 HP recovery on the move^000000 is a skill that recovers HP at 50% efficiency of normal standing while on the move.";
				mes "However, while you are moving, you won't be able to recover HP using the HP Recovery skill.";
				next;
				mes "[Phee]";
				mes "The condition to get ^FF0000 is that your Job level is at least 35 ^000000.";
				mes "Once you meet the acquisition condition, talk to someone named ^FF0000 Detomaso^000000 who is in a building to the east of the city of Izlude.";
				next;
				mes "[Phee]";
				mes "In coordinates, that building is around (^0000FF212,129^000000).";
				next;
				mes "[Phee]";
				mes "And if you take ^FF0000 empty bottles, 200 empty bottles, and 1 moth feather ^000000 to Detomaso, you can get the skill of recovering HP on the move.";
				break;
			default:
				mes "[Phee]";
				mes "Oh, yeah.";
				mes "If you want to ask, you're always welcome.";
				close;
			}
			next;
			mes "[Phee]";
			mes "Are there any other skills you would like to know about?";
		}
		break;
	case Job_Merchant: //Merchant
		mes "[Phee]";
		mes "Your occupation is Merchant.";
		mes "As a Merchant, you can get three skills from quests: ^FF0000Loud Voice, Change Cart, and Cart Revolution^000000.";
		mes "Which skill do you want to know about?";
		while(1){
			next;
			switch(select("loud voice", "change cart", "cart revolution", "enough is enough")){
			case 1:
				mes "[Phee]";
				mes "^FF0000Loud Voice^000000 is a skill that increases your Str by 4 for 5 minutes by being loud and spirited.";
				next;
				mes "[Phee]";
				mes "The cat is around (^0000FF84,95^000000) in Alberta in coordinates.";
				next;
				mes "[Phee]";
				mes "Bring the cat 7 ^FF0000 pearls, 50 mushroom spores, and 1 banana juice ^000000 to get the Loud Voice skill.";
				break;
			case 2:
				mes "[Phee]";
				mes "^FF0000 Change Cart^000000 is a skill that allows you to change the decoration of your cart according to your Base level.";
				mes "There are five different cart decorations.";
				next;
				mes "[Phee]";
				mes "The condition for getting ^FF0000 is that your Job level is at least 30 ^000000.";
				mes "Once you have met the requirements, talk to a man named ^FF0000 Cheiron^000000 who is located north of the city of Alberta.";
				next;
				mes "[Phee]";
				mes "Cheiron is at coordinates around (^0000FF119,220^000000) in Alberta.";
				next;
				mes "[Phee]";
				mes "If you bring ^FF0000 50 wood shavings, 10 iron, and 20 beast skins^000000 to Shiron, you can get the change cart skill.";
				break;
			case 3:
				mes "[Phee]";
				mes "^FF0000 Cart Revolution^000000 is the skill to hit the enemy with your cart.";
				mes "You can attack a range of \"3x3\" cells centered on yourself with 150% of the damage of a normal attack. And the heavier the cart, the more powerful the attack.";
				next;
				mes "[Phee]";
				mes "It can only be used while the cart is equipped.";
				mes "The condition for getting ^FF0000 is that your Job level is at least 35 ^000000.";
				mes "Once you meet the acquisition requirements, talk to someone named ^FF0000Cosans^000000 who is located east of the city of Alberta.";
				next;
				mes "[Phee]";
				mes "Cosance is around (^0000FF232,105^000000) in Alberta in terms of coordinates.";
				mes "Every time you talk to Cosans, he will ask for ^FF0000 banana juice^000000, so get your banana juice ready.";
				next;
				mes "[Phee]";
				mes "Bring Cosance about ^FF0000 iron, 32 sticky liquid, 23 fly wings, 6 tentacles, and 2 grape juice^000000 and you'll get the Cart Revolution skill.";
				break;
			default:
				mes "[Phee]";
				mes "Oh, yeah.";
				mes "If you want to ask, you're always welcome.";
				close;
			}
			next;
			mes "[Phee]";
			mes "Are there any other skills you would like to know about?";
		}
		break;
	case Job_Magician:
		mes "[Phee]";
		mes "Your occupation is Magician.";
		mes "If you are a magician, the skill you get from the quest is ^FF0000 Energy Coat^000000.";
		mes "Which skill would you like to know about?";
		while(1){
			next;
			switch(select("Energy Coat", "Enough is enough")){
			case 1:
				mes "[Phee]";
				mes "^FF0000 Energy Coat^000000 is a skill that wraps you in mental energy and reduces the physical attacks of your enemies.";
				mes "The more SP the surgeon has left, the more damage he can reduce, but every time he is attacked, his SP decreases.";
				next;
				mes "[Phee]";
				mes "The condition for getting ^FF0000 is that your Job level is at least 35 ^000000.";
				mes "Once you meet the acquisition condition, talk to someone named ^FF0000 Blizzaris^000000 at Geffen's magic school.";
				next;
				mes "[Phee]";
				mes "The magic school is located in the northwest part of the city of Geffen.";
				mes "In coordinates, it is around (^0000FF61,181^000000).";
				next;
				mes "[Phee]";
				mes "And if you bring the Blizzard Squirrel 3 ^FF0000 glass balls, 1 carat of diamonds, 5 hard skins, and 1 very hard skin ^000000, you'll get the Energy Coat skill.";
				break;
			default:
				mes "[Phee]";
				mes "Oh, yeah.";
				mes "If you want to ask, you're always welcome.";
				close;
			}
			next;
			mes "[Phee]";
			mes "Do you want to hear it again?";
		}
		break;
	case Job_Archer:
		mes "[Phee]";
		mes "Your occupation is Archer.";
		mes "If you are an Archer, you can get two skills from the quest: ^FF0000 arrow making and ^000000 charge arrows.";
		mes "Which skills would you like to know about?";
		while(1){
			next;
			switch(select("create arrow", "charge arrow", "enough is enough")){
			CASE 1:
				mes "[Phee]";
				mes "^FF0000Arrow Creation^000000 is a skill that uses an item to create an arrow.";
				mes "The type and amount of arrows you can create depends on the items you use as materials.";
				next;
				mes "[Phee]";
				mes "The condition for getting ^FF0000 is that your Job level is at least 30 ^000000.";
				mes "Once you meet the acquisition condition, talk to someone named ^FF0000 Gyornari^000000, who is located slightly southwest of the city of Morroc.";
				next;
				mes "[Phee]";
				mes "Gyornari is at coordinates around (^0000FF234,314^000000) in Morroc.";
				next;
				mes "[Phee]";
				mes "Take ^FF0000 red potions, 20 dewdrops from old trees, 41 scaly stems, 13 wood shavings, and 7 poisonous mushroom spores^000000 to Gyornari and you will get the arrow making.";
				break;
			case 2:
				mes "[Phee]";
				mes "^FF0000 Charge Arrow^000000 is a skill that lets you draw the string long enough to fire a powerful arrow.";
				mes "Any enemy hit by the arrow will be sent flying backwards 6 cells.";
				next;
				mes "[Phee]";
				mes "The condition for getting ^FF0000 is that your Job level is at least 35 ^000000.";
				mes "Once you meet the acquisition condition, talk to someone named ^FF0000 Kaigo^000000 who is located in the southwest part of Payon.";
				next;
				mes "[Phee]";
				mes "Kaigo is at coordinates around (^0000FF103,62^000000) in Payon.";
				next;
				mes "[Phee]";
				mes "If you bring ^FF0000 tentacles, 10 bird beaks, 3 monkey tails, 2 emeralds, and 36 ^000000 banana juice to Kaigo, you can charge-arrow him.";
				break;
			default:
				mes "[Phee]";
				mes "Oh, yeah.";
				mes "If you want to ask, you're always welcome.";
				close;
			}
			next;
			mes "[Phee]";
			mes "Are there any other skills you would like to know about?";
		}
		break;
	case Job_Acolyte:
		mes "[Phee]";
		mes "Your occupation is Acolyte.";
		mes "If you are Acolyte, the skill you can get from the quest is ^FF0000 Holy Light^000000.";
		mes "Which skill would you like to know about?";
		while(1){
			next;
			switch(select("Holy Light", "Enough is enough")){
			case 1:
				mes "[Phee]";
				mes "^FF0000 Holy Light^000000 is a skill that uses sacred light to deal 125% magic attack (Matk) damage to enemies at a distance.";
				next;
				mes "[Phee]";
				mes "^FF0000The condition for obtaining this skill is that you have a Job level of 30 or higher^000000 in Acolyte.";
				mes "Once you meet the acquisition condition, talk to ^FF0000 chief Acolyte's crypt ^000000 in Prontera Cathedral.";
				next;
				mes "[Phee]";
				mes "The Prontera Cathedral is located northeast of the city of Prontera.";
				mes "In coordinates, it is around (^0000FF234,314^000000).";
				next;
				mes "[Phee]";
				mes "And if you bring to the chief Acolyte's crypt, ^FF0000 1 rosary, 1 opal, 1 crystal blue ^000000, you'll get the Holy Light skill.";
				break;
			default:
				mes "[Phee]";
				mes "Oh, yeah.";
				mes "If you want to ask, you're always welcome.";
				close;
			}
			next;
			mes "[Phee]";
			mes "Do you want to hear it again?";
		}
		break;
	case Job_Thief:
		mes "[Phee]";
		mes "Your occupation is Thief.";
		mes "In Thief, you can get 4 skills from quests: ^FF0000 stone throwing, stone picking, sand throwing, and back stepping^000000.";
		mes "Which skills would you like to know about?";
		while(1){
			next;
			switch(select("stone throwing", "stone picking", "sand throwing", "back stepping", "enough is enough")){
			case 1:
				mes "[Phee]";
				mes "Stone Throwing is a skill where you throw a stone that does 50 damage, ignoring defenses.";
				mes "You need one stone to use it.";
				mes "If the skill attack succeeds, there's a 3% chance of stun and darkdark effects.";
				next;
				mes "[Phee]";
				mes "The condition for getting ^FF0000 is that your Job level is at least 15 ^000000.";
				mes "Once you meet the acquisition condition, you must talk to someone named ^FF0000 Alcosk^000000 who is in the Thief guild.";
				next;
				mes "[Phee]";
				mes "The Thief guild is located on the B1F of the Pira Mido dungeon.";
				mes "You'll find Alcosk in the room to the east of it.";
				next;
				mes "[Phee]";
				mes "Also, the Pila Mido dungeon can be reached by going northwest within the city of Morroc to ^0000FF Pila Mido neighborhood map ^000000.";
				mes "It's located northwest of that map.";
				mes "The coordinates are around (^0000FF56,162^000000).";
				next;
				mes "[Phee]";
				mes "And if you bring to Alcosk, ^FF0000 2 galets and 2 selu ^000000, you can get the skill of stone throwing.";
				break;
			case 2:
				mes "[Phee]";
				mes "^FF0000Stone Picking^000000 is the skill to pick up stones on the ground.";
				mes "But you can't pick them up if your item possession quantity is more than 50%.";
				next;
				mes "[Phee]";
				mes "The condition for getting ^FF0000 is that your Job level is at least 20 ^000000.";
				mes "Once you meet the acquisition condition, you must talk to someone named ^FF0000 Alcosk^000000 who is in the Thief guild.";
				next;
				mes "[Phee]";
				mes "The Thief guild is located on the B1F of the Pira Mido dungeon.";
				mes "You'll find Alcosk in the room to the east of it.";
				next;
				mes "[Phee]";
				mes "Also, the Pila Mido dungeon can be reached by going northwest within the city of Morroc to ^0000FF Pila Mido neighborhood map ^000000.";
				mes "It's located northwest of that map.";
				mes "The coordinates are around (^0000FF56,162^000000).";
				next;
				mes "[Phee]";
				mes "And if you take one ^FF0000 bear sole, one jargon, and five frog eggs ^000000 to Alcosk, you'll get the stone-picking skill.";
				break;
			case 3:
				mes "[Phee]";
				mes "^FF0000 Sand Sowing^000000 is a skill that attacks with the earth attribute and deals 130% of its normal attack power.";
				mes "If the skill attack succeeds, there's a 20% chance of a darkdark effect.";
				next;
				mes "[Phee]";
				mes "The condition for getting ^FF0000 is that your Job level is at least 25 ^000000.";
				mes "Once you meet the acquisition condition, you must talk to someone named ^FF0000 Alcosk^000000 who is in the Thief guild.";
				next;
				mes "[Phee]";
				mes "The Thief guild is located on the B1F of the Pira Mido dungeon.";
				mes "You'll find Alcosk in the room to the east of it.";
				next;
				mes "[Phee]";
				mes "Also, the Pila Mido dungeon can be reached by going northwest within the city of Morroc to ^0000FF Pila Mido neighborhood map ^000000.";
				mes "It's located northwest of that map.";
				mes "The coordinates are around (^0000FF56,162^000000).";
				next;
				mes "[Phee]";
				mes "And if you take five ^FF0000 clean pebbles^000000 to Alcosk, you will now meet a ^000000^FF0000 pocket sales merchant^000000 who is in ^0000FFPayon.";
				next;
				mes "[Phee]";
				mes "The pocket sales merchant is located in the southwest part of the city of Payon.";
				mes "The coordinates are around (^0000FF91,75^000000).";
				next;
				mes "[Phee]";
				mes "Then meet the pocket dealer and give him ^FF0000 one spider thread, one worm skin, and one cactus needle ^000000.";
				next;
				mes "[Phee]";
				mes "Then report to Arcosk and you will get the skill of sanding.";
				break;
			case 4:
				mes "[Phee]";
				mes "^FF0000Backstep^000000 is a skill to jump backward 5 cells and avoid enemy attacks.";
				next;
				mes "[Phee]";
				mes "^FF0000The condition to get this skill is that your Job level is 35 or higher^000000.";
				mes "Once you meet the requirements, talk to someone in the Thief guild.";
				next;
				mes "[Phee]";
				mes "The Thief Guild is located on the B1F of the Pila Mido dungeon.";
				mes "You'll find Alcosk in the room to the east of it.";
				next;
				mes "[Phee]";
				mes "Also, the Pila Mido dungeon can be reached by going northwest within the city of Morroc to ^0000FF Pila Mido neighborhood map ^000000.";
				mes "It's located northwest of that map.";
				mes "The coordinates are around (^0000FF56,162^000000).";
				next;
				mes "[Phee]";
				mes "And to Arcosk, take ^FF0000 20 ^000000 grasshopper legs ^000000 and you'll get the backstep skill.";
				break;
			default:
				mes "[Phee]";
				mes "Oh, yeah.";
				mes "If you want to ask, you're always welcome.";
				close;
			}
			next;
			mes "[Phee]";
			mes "Are there any other skills you would like to know about?";
		}
		next;
	default:
		mes "[Phee]";
		mes "With your profession, there's no special skill to acquire.";
		close;
	}
	close;
}

ac_cl_room.gat,158,48,4	script	Ruthie	92,{
	mes "[Ruthie]";
	mes "You're a new student.";
	mes "Hello.";
	mes "I'm Ruthie.";
	mes "I'm a newcomer to the first degree, and I'm teaching two things.";
	next;
	if(Job == Job_Novice){
		mes "[Ruthie]";
		mes "You're still a Novice.";
		mes "Talk to me again when you get your first job.";
		close;
	}
	mes "[Ruthie]";
	mes "For one thing, ^FF0000 recommended skills ^000000.";
	mes "It's about the skills that are more profitable to get first.";
	next;
	mes "[Ruthie]";
	mes "The other one is about ^0000FF recommended places^000000.";
	mes "I tell you where to find monsters that are easy to fight according to your profession and level.";
	mes "From the beginning, it would be very difficult if you get seriously injured fighting strong enemies.";
	next;
	mes "[Ruthie]";
	mes "Want to know about recommended skills and recommended places?";
	next;
	if(select("want to know", "not now")==2){
		mes "[Ruthie]";
		mes "I see.";
		mes "If you want to know more, you can always call me again.";
		close;
	}
	set '@jobname$,"";
	switch(Job){
	case Job_Swordman: set '@jobname$, "Swordsman"; break;
	case Job_Magician: set '@jobname$, "Magician"; break;
	case Job_Archer: set '@jobname$, "Archer"; break;
	case Job_Acolyte: set '@jobname$, "Acolyte"; break;
	case Job_Merchant: set '@jobname$, "Merchant"; break;
	case Job_Thief: set '@jobname$, "Thief"; break;
	case Job_Taekwon: set '@jobname$, "Taekwon Kid"; break;
	case Job_Ninja: set '@jobname$, "Ninja"; break;
	case Job_Gunslinger: set '@jobname$, "Gunslinger"; break;
	case Job_SuperNovice: set '@jobname$, "Supernovice"; break;
	}
	mes "[Ruthie]";
	mes "I'll give you information about your profession, " + '@jobname$ + ".";
	mes "But you have to do this!";
	mes "Not necessarily, so keep it as a reference only.";
	mes "What do you want to know?";
	while(1){
		next;
		set '@sel, select("Recommended skills:"
			+ (BaseLevel<25 ? "Recommended location (~BaseLevel25):" : "")
			+ (BaseLevel<45 ? "Recommended location (Base level 25-45):" : "")
			+ "Recommended place (Base level 45-55): still don't need to ask");
	
		if('@sel>1)
			set '@sel,'@sel+(BaseLevel>=25)+2*(BaseLevel>=45);
	
		switch('@sel){
		case 1:
			switch(Job){
			case Job_Swordman:
				mes "[Ruthie]";
				mes "Swordsman, I recommend you get the ^FF0000 HP Resiliency Improvement skill ^000000.";
				next;
				mes "[Ruthie]";
				mes "If you get HP Resilience Improvement to ^FF0000Lv10^000000, your HP will recover rapidly even if you don't have any recovery items, as long as you don't move!";
				next;
				mes "[Ruthie]";
				mes "While you get the HP recovery power improvement to Lv10, you should get about Lv1 of the ^FF0000 bash^000000 skill that gives a powerful blow to use SP efficiently, so the battle will be easier.";
				next;
				mes "[Ruthie]";
				mes "Once you get your HP resilience improvement up to lvl 10, you should get your bash up to lvl 10.";
				mes "Anything else you want to ask?";
				break;
			case Job_Magician:
				mes "[Ruthie]";
				mes "Magician, you know, I recommend you get the ^FF0000 firewall ^000000 skill.";
				next;
				mes "[Ruthie]";
				mes "But you can't get the firewall skill from the beginning.";
				mes "To get Firewall, you must first get ^FF0000 Firebolt^000000 to ^FF0000Lv4^000000.";
				next;
				mes "[Ruthie]";
				mes "Then, you can get the ^FF0000 Fireball^000000 skill, so let's get it up to ^FF0000Lv5^000000.";
				next;
				mes "[Ruthie]";
				mes "Finally, if you get the ^FF0000Site^000000 skill, you can learn Firewall.";
				break;
			case Job_Archer:
				mes "[Ruthie]";
				mes "Archer, I recommend that you first get ^FF0000 Owl's Eye, Eagle's Eye, ^000000 and ^FF0000 Double Strafing^000000 to ^FF0000Lv10^000000 each.";
				next;
				mes "[Ruthie]";
				mes "You can get the eagle's eye when you get the owl's eye to Lv3 or higher.";
				mes "If you get these skills, you can make powerful attacks from afar.";
				next;
				mes "[Ruthie]";
				mes "They are especially effective against plant-based enemies that don't move or move slowly.";
				break;
			case Job_Acolyte:
				mes "[Ruthie]";
				mes "Acolyte, you should get ^FF0000 heal ^000000 skills first.";
				next;
				mes "[Ruthie]";
				mes "First, get ^FF0000Heal^000000 to about ^FF0000Lv3^000000.";
				mes "That way you can heal the damage you've taken more efficiently.";
				mes "After that, I can raise the lvl if necessary.";
				next;
				mes "[Ruthie]";
				mes "After that, I like to get ^FF0000 speed increase ^000000 and ^FF0000 blessing ^000000 so that I can assist my friends in party play.";
				next;
				mes "[Ruthie]";
				mes "However, in order to get Blessing, you have to get ^FF0000 Divine Protection^000000 above lvl 5, you know.";
				next;
				mes "[Ruthie]";
				mes "I would also like to learn ^FF0000 Pneuma^000000.";
				mes "It can nullify most long-range physical attacks, giving you an advantage in combat against enemies with long-range physical attacks.";
				mes "You'll be able to do it.";
				next;
				mes "[Ruthie]";
				mes "To get a pneumatic, you need to get ^FF0000 Ruaf^000000 Lv1, then get ^FF0000 Teleport^000000 Lv2, then get ^FF0000 Warp Portal^000000 Lv4, so you can get a pneumatic.";
				break;
			case Job_Merchant:
				mes "[Ruthie]";
				mes "Merchants, unlike other professions, have a greater variety of skills outside of combat.";
				next;
				mes "[Ruthie]";
				mes "For example, \"I want to sell ^FF0000 items in my stall! If you want to ^000000, you get ^FF0000 pushcart ^000000 to ^FF0000Lv3^000000 and then you get ^FF0000 opening a stall ^000000.";
				mes "You can get the Lv of the stall opening to match the number of items you want to sell.";
				next;
				mes "[Ruthie]";
				mes "Also, you should get ^FF0000 discount ^000000 to ^FF0000Lv10^000000.";
				mes "Then you can buy items at a discount to the list price and sell them at the stall and make a profit on the difference.";
				next;
				mes "[Ruthie]";
				mes "I want to do another \"^FF0000 battle! If you want to ^000000, you can get ^FF0000 Memer Knight^000000 to ^FF0000Lv10^000000.";
				mes "However, Memar Knight is powerful, but it is a Zeny-consuming skill, so you'll need quite a bit of money.";
				next;
				mes "[Ruthie]";
				mes "Also, you could raise your ^FF0000 push cart ^000000 to lvl 10 and fill your cart with recovery items.";
				mes "For example, an item called Niku is restorative and inexpensive, but it's heavy and you can't inherently carry much of it.";
				next;
				mes "[Ruthie]";
				mes "But if you fill your cart with a lot of meat, you can have a lot of it.";
				mes "Moreover, when you reach Job level 35 or higher, you can get the skill ^FF0000 Cart Revolution^000000 in a quest.";
				next;
				mes "[Ruthie]";
				mes "That skill is a skill that deals more damage the heavier the cart weighs.";
				mes "You can't not use this one, can you?";
				break;
			case Job_Thief:
				mes "[Ruthie]";
				mes "Thief, you know, I recommend getting the ^FF0000 Double Attack^000000 and ^FF0000 Evasion Rate Increase^000000 skills.";
				next;
				mes "[Ruthie]";
				mes "Get both the Double Attack and Increased Evasion skills until ^FF0000Lv10^000000.";
				mes "That way, you can quickly attack your opponent twice in a row while brilliantly dodging enemy attacks.";
				next;
				mes "[Ruthie]";
				mes "But double attack is a ^FF0000 skill that only activates if you have a ^FF0000 dagger equipped, so equip your dagger.";
				break;
			case Job_Taekwon:
				mes "[Ruthie]";
				mes "Taekwon Kid, I recommend that you first get ^FF0000 Tairigi at lvl 10^000000 and then get ^FF0000 Warm Wind at lvl 7^000000.";
				next;
				mes "[Ruthie]";
				mes "Because to get the warm breeze, you need to get ^FF0000 calm rest Lv5, enjoyable rest Lv5, and fight Lv5^000000.";
				next;
				mes "[Ruthie]";
				mes "Also, just a note, once you become ^FF0000Soul Linker, you won't be able to use Taekwon Kid's Feori Chagi or kicking skills at all. ^000000By the way, you can use them in Star Gladiator.";
				next;
				mes "[Ruthie]";
				mes "So if you want to be a Soul Linker, you shouldn't get any kicking skills.";
				next;
				mes "[Ruthie]";
				mes "Don't worry, the skills I just recommended can be used by Soul Linker as well.";
				break;
			case Job_Ninja:
				mes "[Ruthie]";
				mes "Ninja, you know, ^FF0000 physical attack skills ^000000 and ^FF0000 ninjutsu skills ^000000 completely separate the skills you can get.";
				next;
				mes "[Ruthie]";
				mes "So if you don't decide in advance which skills you will take in the future, you may not be as strong as you think.";
				next;
				mes "[Ruthie]";
				mes "^FF0000Throwing training^000000 and ^FF0000Ninpo training^000000 are skills that are essential if you want to become an expert in that field.";
				mes "You can also learn the one-hit kill skill called Issen, although the conditions are more demanding.";
				break;
			case Job_Gunslinger:
				mes "[Ruthie]";
				mes "Gunslinger has different skills depending on the type of gun you have equipped.";
				next;
				mes "[Ruthie]";
				mes "So, it's more complicated to get skills than any other primary job.";
				mes "When acquiring skills, you might want to decide in advance which skills you will take in the future.";
				next;
				mes "[Ruthie]";
				mes "If you're not sure which skill to take, I recommend ^FF0000 Snake Eye^000000, which increases the range of your gun attacks and your hit rate.";
				next;
				mes "[Ruthie]";
				mes "This skill works on all guns, so it's hard to waste.";
				mes "If you already have a specific skill you want to take, though, you should prioritize that one.";
				break;
			case Job_SuperNovice:
				mes "[Ruthie]";
				mes "Supernovice is, you know, a job where you're free to do whatever you want!";
				mes " So you should feel free to try to acquire skills as well.";
				break;
			}
			break;
		case 2:
			switch(Job){
			case Job_Swordman:
			case Job_Merchant://common
			case Job_Thief://common
			case Job_Taekwon://common
			case Job_Ninja://common
			case Job_Gunslinger://common
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Prontera Underground Canal B2F^000000 until your Base level is about ^FF000025^000000.";
				mes "You can take down Taro and Spore.";
				mes "There are a lot of other monsters, so you'll level up as you beat them.";
				next;
				mes "[Ruthie]";
				mes "You can get to the Prontera Underground Canal by talking to ^FF0000, the Underground Canal Manager^000000, who is located in the center of the map Prontera Field 05, west of the city of Prontera.";
				mes "The coordinates are around (^0000FF271,211^000000).";
				next;
				mes "[Ruthie]";
				mes "However, it seems you need permission from the Prontera Knights to enter the Prontera underground canal.";
				mes "For more information, please ask the Underground Canal Control Soldier.";
				break;
			case Job_Magician:
				mes "[Ruthie]";
				mes "I'll show you the recommended locations, assuming you want to get the firewall we talked about in the recommended skills.";
				next;
				mes "[Ruthie]";
				mes "I would suggest taking down Poring and Fable until you get Firebolt Lv4. ......";
				next;
				mes "[Ruthie]";
				mes "Until your Base level is about ^FF000025^000000, you can defeat Mandragora in ^FF0000Prontera field 02^000000.";
				mes "You can get there by moving one map east and one map north from the city of Prontera.";
				next;
				mes "[Ruthie]";
				mes "If you don't have much damage to deal, you might want to increase your Int or skill lvl and come back.";
				break;
			case Job_Archer:
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon underground cave B1 floor ^000000 until your Base level is about ^FF000025^000000.";
				mes "You should be able to defeat the zombies.";
				mes "For zombies, you'd better use silver arrows.";
				next;
				mes "[Ruthie]";
				mes "The Payon Underground Caves can be reached from around northwest of Archer Village, north of the city of Payon.";
				mes "The coordinates are around (^0000FF39,131^000000).";
				next;
				mes "[Ruthie]";
				mes "Another good idea would be to defeat a non-moving monster such as a mandragora.";
				mes "Let's make the most of the fact that we can attack at long range and attack aggressively.";
				break;
			case Job_Acolyte:
				mes "[Ruthie]";
				mes "I recommend, you know, until your Base level is about ^FF000025^000000, I would recommend ^FF0000Payon underground cave 1st floor^000000.";
				mes "You should be able to defeat the zombies.";
				next;
				mes "[Ruthie]";
				mes "Use heal on undead attribute monsters such as zombies to damage them.";
				mes "You can also use Blessing and Rica Barry for unexpected effects.";
				next;
				mes "[Ruthie]";
				mes "When using support skills such as Heal on a monster, hold down the ^0000FFSHIFT key ^000000 while using the skill.";
				mes "It might be helpful to remember that.";
				next;
				mes "[Ruthie]";
				mes "The Payon Underground Caves can be reached from about northwest of Archer Village, north of the town of Payon.";
				mes "The coordinates are around (^0000FF39,131^000000).";
				break;
			case Job_SuperNovice:
				// this level is impossible.
				break;
			}
			break;
		case 3:
			switch(Job){
			case Job_Swordman:
				mes "[Ruthie]";
				mes "I'd recommend, you know, for Base level from ^FF000025 to 45^000000, I'd recommend ^FF0000Payon lost forest 02^000000.";
				mes "You should defeat Wolf.";
				mes "You can get there by moving 2 maps west from the city of Alberta.";
				next;
				mes "[Ruthie]";
				mes "Also, ^FF0000Payon lost forest 07^000000 would be nice.";
				mes "There, you can defeat the monsters around Elder Willow.";
				mes "You can get there by moving one map west and one map north from the city of Alberta.";
				break;
			case Job_Magician:
				mes "[Ruthie]";
				mes "I'll show you the recommended locations, assuming you want to get the firewall we talked about in the recommended skills.";
				next;
				mes "[Ruthie]";
				mes "As for the recommended places, I'll show you where you can get Firebolt, from Base level ^FF000025 to about 45^000000, in ^FF0000Mount Mjolnir11^000000.";
				mes "You should beat Flora, she's good.";
				next;
				mes "[Ruthie]";
				mes "You can get to Mount Mjolnir11 by moving one map east and two maps north from the city of Prontera.";
				mes "However, watch out for the appearance of the thieving insects (male) and the slow but powerful argiope.";
				break;
			case Job_Archer:
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon Lost Forest 07^000000 if your Base level is between ^FF000025 and 45^000000.";
				mes "You should defeat Wolf.";
				mes "You can get there by moving two maps west from the city of Alberta.";
				next;
				mes "[Ruthie]";
				mes "Flame arrows are very effective against Wolves.";
				mes "Flame arrows are sold near the sunken ship, which can be reached from Alberta, so you might want to buy one and give it a try.";
				break;
			case Job_Acolyte:
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon underground cave B2F^000000 for Base level from ^FF000025 to 45^000000.";
				mes "You can defeat Archer skeletons and Soldier skeletons.";
				next;
				mes "[Ruthie]";
				mes "But be careful, because if you don't use more and more skills like pneumatics and heals, you will have a hard time.";
				break;
			case Job_Merchant://common
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon Lost Forest 02^000000 for Base level from ^FF000025 to 45^000000.";
				mes "You should defeat Wolf.";
				mes "You can get there by moving 2 maps west from the city of Alberta.";
				next;
				mes "[Ruthie]";
				mes "Also, ^FF0000Payon lost forest 07^000000 would be nice.";
				mes "There, you can defeat the monsters around Elder Willow.";
				mes "You can get there by moving one map west and one map north from the city of Alberta.";
				break;
			case Job_Thief://common
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon lost forest 02^000000 for Base level from ^FF000025 to 45^000000.";
				mes "You should defeat Wolf.";
				mes "You can get there by moving 2 maps west from the city of Alberta.";
				next;
				mes "[Ruthie]";
				mes "Also, ^FF0000Payon lost forest 07^000000 would be nice.";
				mes "There, you can defeat the monsters around Elder Willow.";
				mes "You can get there by moving one map west and one map north from the city of Alberta.";
				break;
			case Job_Taekwon://common
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon Lost Forest 02^000000 for Base level from ^FF000025 to 45^000000.";
				mes "You should defeat Wolf.";
				mes "You can get there by moving 2 maps west from the city of Alberta.";
				next;
				mes "[Ruthie]";
				mes "Also, ^FF0000Payon lost forest 07^000000 would be nice.";
				mes "There, you can defeat the monsters around Elder Willow.";
				mes "You can get there by moving one map west and one map north from the city of Alberta.";
				break;
			case Job_Gunslinger://common
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon lost forest 02^000000 for Base level from ^FF000025 to 45^000000.";
				mes "You should defeat Wolf.";
				mes "You can get there by moving 2 maps west from the city of Alberta.";
				next;
				mes "[Ruthie]";
				mes "Also, ^FF0000Payon lost forest 07^000000 would be nice.";
				mes "There, you can defeat the monsters around Elder Willow.";
				mes "You can get there by moving one map west and one map north from the city of Alberta.";
				break;
			case Job_Ninja:
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Payon Lost Forest 02^000000 if your Base level is between ^FF000025 and 45^000000.";
				mes "You should defeat Wolf.";
				mes "You can get there by moving 2 maps west from the city of Alberta.";
				break;
			case Job_SuperNovice:
				// this level is impossible.
				break;
			}
			break;
		case 4:
			switch(Job){
			case Job_Swordman:
				mes "[Ruthie]";
				mes "I'd recommend, you know, a place to go until the Base level is about ^FF000045 to 55^000000, I'd say ^FF0000Sograt Desert16^000000.";
				mes "You can beat the Sandman.";
				mes "You can get there by moving 2 maps south and 2 maps east from the city of Morroc.";
				break;
			case Job_Magician:
				mes "[Ruthie]";
				mes "I'll show you the recommended locations, assuming you want to get the firewall we talked about in the recommended skills.";
				next;
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Mount Mjolnir05^000000 for Base level from ^FF000045 to 55^000000.";
				mes "There, you can defeat Argiope.";
				mes "You can get there by moving two maps south of the city of Alberta.";
				next;
				mes "[Ruthie]";
				mes "Also, ^FF0000Louyang field 01^000000 would be nice.";
				mes "There, you can defeat the earth spirit.";
				mes "You can get there by moving one map south of the city of Louyang.";
				next;
				mes "[Ruthie]";
				mes "Both of them can be taken down by making good use of firewalls and firebolts.";
				mes "It's a difficult monster to master, but you get a lot of experience out of it.";
				break;
			case Job_Archer:
				mes "[Ruthie]";
				mes "I would recommend ^FF0000Einbroch field 04^000000 for Base level of ^FF000045 to 55^000000.";
				mes "I hope you beat the geographer.";
				mes "You'd better use flaming arrows on the geographers.";
				next;
				mes "[Ruthie]";
				mes "You can get to Einbroch Field 04 by moving one map north of the city of Einbroch.";
				break;
			case Job_Acolyte:
				mes "[Ruthie]";
				mes "If your Base level is between ^FF000045 and 55^000000, I would suggest ^FF0000Amatsu dungeon 1F^000000.";
				mes "You should defeat the Gun Qi soldiers.";
				mes "But you need pneumatic skills.";
				next;
				mes "[Ruthie]";
				mes "You'll struggle with pneuma alone, but with Holy Light, which you can learn by doing quests, you can make up for the lack of offensive power that Acolyte lacks.";
				next;
				mes "[Ruthie]";
				mes "You can get to the Amatsu dungeon from the town of Amatsu.";
				mes "However, it is said that you need a \"passport\" to enter the Amatsu dungeon.";
				mes "I heard that you can get a 'handbill' from the lord of the castle in Toko Castle. ......";
				next;
				mes "[Ruthie]";
				mes "There are many powerful monsters near Amatsu, including the dungeon, so be careful.";
				mes "Be especially careful of the Kabuki Ninja in the Amatsu dungeon.";
				break;
			case Job_Merchant:
				mes "[Ruthie]";
				mes "You should defeat Metalling until your Base level is about ^FF000045 to 55^000000.";
				mes "Metalling is in ^FF0000Lighthalzen field 01, ^000000^FF0000Einbroch08^000000.";
				next;
				mes "[Ruthie]";
				mes "You can get to Lighthalzen field 01 by moving one map north of the city of Lighthalzen.";
				mes "You can get to Einbroch 08 by moving one map south of the city of Einbroch.";
				break;
			case Job_Thief:
				mes "[Ruthie]";
				mes "You can beat Metalling until your Base level is about ^FF000045 to 55^000000.";
				mes "Metalling is at ^FF0000Lighthalzen field 01, Einbroch 08^000000.";
				next;
				mes "[Ruthie]";
				mes "You can get to Lighthalzen field 01 by moving one map north of the city of Lighthalzen.";
				mes "You can get to Einbroch 08 by moving one map south of the city of Einbroch.";
				next;
				mes "[Ruthie]";
				mes "Also, I'd like ^FF0000Sograt Desert16^000000.";
				mes "There, you can take down the Sandman.";
				mes "You can get there by moving 2 maps south and 2 maps east from the city of Morroc.";
				break;
			case Job_Taekwon:
				mes "[Ruthie]";
				mes "You can beat Metalling until your Base level is about ^FF000045 to 55^000000.";
				mes "Metalling is at ^FF0000Lighthalzen field 01, Einbroch 08^000000.";
				next;
				mes "[Ruthie]";
				mes "You can get to Lighthalzen field 01 by moving one map north of the city of Lighthalzen.";
				mes "You can get to Einbroch 08 by moving one map south of the city of Einbroch.";
				break;
			case Job_Ninja:
				mes "[Ruthie]";
				mes "You should be able to beat Metalling until your Base level is about ^FF000045 to 55^000000.";
				mes "Metalling is at ^FF0000Lighthalzen field 01, Einbroch 08^000000.";
				next;
				mes "[Ruthie]";
				mes "You can get to Lighthalzen field 01 by moving one map north of the city of Lighthalzen.";
				mes "You can get to Einbroch 08 by moving one map south of the city of Einbroch.";
				break;
			case Job_Gunslinger:
				mes "[Ruthie]";
				mes "You can beat Metalling until your Base level is about ^FF000045 to 55^000000.";
				mes "Metalling is at ^FF0000Lighthalzen field 01, Einbroch 08^000000.";
				next;
				mes "[Ruthie]";
				mes "You can get to Lighthalzen field 01 by moving one map north of the city of Lighthalzen.";
				mes "You can get to Einbroch 08 by moving one map south of the city of Einbroch.";
				break;
			case Job_SuperNovice:
				mes "[Ruthie]";
				mes "I'd recommend, Base level 45+, and also Geffen field 10 if you're assuming melee attack.";
				mes "You can take down the Orc Lady.";
				break;
			}
			break;
		case 5:
			mes "[Ruthie]";
			mes "If you want to know more, you can always call on me.";
			close;
		}
		next;
		mes "[Ruthie]";
		mes "Is there anything else you want to know?";
	}
}

