//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy
// by Pneuma
// Automatic Conversation Relations ----------------------------------------------

//------------------------------------------------------------------------------
// Minimap display (NPC name "Compass" in this mackerel)
//
// See Academy Official's OnTouch for what touches Academy Official type 1.
// OnTouch does not occur when NPCs overlap, so all of them are here!
//
// *ID is the ID used in viewpoint
// Blue 0x0000FF ID:10 (That girl I'm interested in)
// red 0xFF0000 ID:11 (miracle box)
// Orange 0xFF9900 ID:12 (To that person who helped me)
// Green 0x00FF00 ID:13 (help with experiment/dungeon rescue)
// light blue 0x00FFFFFF ID:14 (I want to be an adventurer)
// yellow 0xFFFFFF00 ID:20 (all exams)
//
//------------------------------------------------------------------------------

pay_fild03.gat,388,63,0	script	AC_TSTVP1_02	139,1,1,{ //touch at warp from city
	if(AC_RANK==0 && AC_RANKTEST==2){ //first course
		viewpoint 1,209,143,20,0xFFFFFF00;
	}
}
prt_fild08.gat,170,375,0	script	AC_TSTVP2_02	139,1,1,{ //touch in pro south
	if(AC_RANK==1 && AC_RANKTEST==2){ //second course
		viewpoint 1,233,16,20,0xFFFFFF00;
	}
	if( (AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2)|| //I want to be an adventurer2
		(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2)){ //I want to be an adventurer6
		viewpoint 1,233,16,14,0x00FFFF;
	}
}
moc_fild01.gat,238,378,0	script	AC_TSTVP2_03	139,1,1,{ //touch with child designmap
	if(AC_RANK==1 && AC_RANKTEST==2){ //second course
		viewpoint 1,379,162,20,0xFFFFFF00;
	}
	if(AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2){ //I want to be an adventurer 2
		viewpoint 1,379,162,14,0x00FFFF;
	}
	if(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2) { //I want to be an adventurer6
		viewpoint 1,322,16,14,0x00FFFF;
	}
}
pay_fild04.gat,20,165,0	script	AC_TSTVP2_04	139,1,1,{ //touch at Polin Island
	if(AC_RANK==1 && AC_RANKTEST==2){ //second course
		viewpoint 1,350,330,20,0xFFFFFF00;
	}
	if(AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2){ //I want to be an adventurer 2
		viewpoint 1,267,193,14,0x00FFFF; //shooting point 2
	}
}
pay_fild01.gat,333,356,0	script	AC_TSTVP3_02	139,1,1,{ //touch at Faye South
	if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){/// Help with experiment 4
		viewpoint 1,353,14,13,0x00FF00; // Wolf map entrance (lower right)
	}
	if(AC_RANK==2 && AC_RANKTEST==2){ //third course
		viewpoint 1,353,14,20,0xFFFFFF00;
	}
}
pay_fild02.gat,160,381,0	script	AC_TSTVP2_03	139,1,1,{ //touch on Wolf map upper right WP
	if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){/// Help with experiment 4
		viewpoint 1,52,125,13,0x00FF00; // suspicious mushrooms
	}
	if(AC_RANK==2 && AC_RANKTEST==2){ //third course
		viewpoint 1,105,242,20,0xFFFFFF00;
	}
}
pay_fild02.gat,83,382,0	script	AC_TSTVP2_04	139,1,1,{ //touch at center WP on Wolf map (not needed?)
	if(AC_RANK==2 && AC_RANKTEST==2){ //third course
		viewpoint 1,105,242,20,0xFFFFFF00;
	}
}
mjolnir_09.gat,106,34,0	script	AC_TSTVP4_03	139,1,1,{ //pro←↑touch at warp destination
	if(AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //Course 4
		viewpoint 1,30,249,20,0xFFFFFF00;
	}
	if(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //Course 5
		viewpoint 1,100,365,20,0xFFFFFF00;
	}
}
gef_fild00.gat,376,140,0	script	AC_TSTVP4_05	139,1,1,{ //geffe east
	if(AC_RANK==3 && AC_RANKTEST>=7 && AC_RANKTEST!=99){ //Course 4
		viewpoint 1,40,199,20,0xFFFFFF00;
	}
}
prt_fild00.gat,380,249,0	script	AC_TSTVP4_05	139,1,1,{ //pro ←↑← touch at warp destination
	if(AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //Course 4
		viewpoint 1,152,250,20,0xFFFFFF00;
	}
}
prt_fild05.gat,367,205,0	script	AC_TSTVP5_02	139,1,1,{ //pro west
	if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2) || //dungeon rescue 1
		(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) || // Dungeon rescue 3
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) //Assistance with experiments5
	){
		viewpoint 1,270,212,13,0x00FF00; //underground canal control soldier
	}
	if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //I want to be an adventurer4
		(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) ){ //want to be an adventurer7
		viewpoint 1,13,63,14,0x00FFFF;
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2){ //I want to be an adventurer9
		viewpoint 1,270,212,14,0x00FFFF; //underground canal control soldier
	}
	if(AC_RANK==3 && AC_RANKTEST==2){ //Course 4
		viewpoint 1,105,381,20,0xFFFFFF00;
		mes "[" + strcharinfo(0) + "]";
		mes "Did I mention that Garde is to walk from ^0000FFProntera^000000 to ^0000FFGeffen^000000?";
		mes "I have to give my lunch to ^FF0000Dr. Drapp^000000 on the way.";
		mes "Let's walk ^FF0000northwest^000000 first.";
		close2;
		set AC_RANKTEST,3; //flag update
		end;
	}
	if(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //5th course
		viewpoint 1,105,381,20,0xFFFFFF00;
	}
}
prt_fild05.gat,357,205,0	script	AC_TSTVP5_02	139,7,7,{ //Pro West (before warp)
	if(AC_RANK==6 && AC_RANKTEST==15){
		mes "[" + strcharinfo(0) + "]";
		mes "Prontera is visible.";
		mes "We're almost there!";
		close2;
		set AC_RANKTEST,16;
		end;
	}
}
pay_fild08.gat,20,74,0	script	AC_TSTVP6_02	139,1,1,{ //Faye East
	if(AC_RANK==5 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //Course 6
		viewpoint 1,167,332,20,0xFFFFFF00;
	}
}
gef_fild00.gat,46,199,0	script	AC_TSTVP6_04	139,1,1,{ //Geffen East
	if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //Course 6
		viewpoint 1,267,382,20,0xFFFFFF00;
	}
}
mjolnir_06.gat,265,32,0	script	AC_TSTVP6_05	139,1,1,{ //Mjolnir Range 06
	if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //6th course
		viewpoint 1,226,183,20,0xFFFFFF00;
	}
}
moc_fild12.gat,159,378,0	script	AC_TSTVP6_07	139,1,1,{ //Morroc South
	if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //Course 6
		viewpoint 1,118,30,20,0xFFFFFF00;
	}
	if( (AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) || //I want to be an adventurer3
		(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) ){ //I want to be an adventurer5
		viewpoint 1,118,30,14,0x00FFFF;
	}
}
moc_fild18.gat,158,379,0	script	AC_TSTVP6_07	139,1,1,{ //Sograt Desert18
	if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //Course 6
		viewpoint 1,211,95,20,0xFFFFFF00;
	}
	if(AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) { //I want to be an adventurer3
		viewpoint 1,232,217,14,0x00FFFF; //shooting point 3
	}
	if(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) { //I want to be an adventurer5
		viewpoint 1,382,305,14,0x00FFFF;
	}
}
pay_gld.gat,370,149,0	script	AC_TSTVP7_02	139,1,1,{ //chunlim lake
	if(AC_RANK==6 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //Course 7
		viewpoint 1,273,307,20,0xFFFFFF00;
	}
}
moc_fild01.gat,315,25,0	script	AC_TSTVP7_03	139,1,1,{ //Sograt Desert01
	if(AC_RANK==6 && AC_RANKTEST>=7 && AC_RANKTEST!=99){ //Course 7
		viewpoint 1,190,38,20,0xFFFFFF00;
	}
}
prt_fild09.gat,380,237,0	script	AC_TSTVP7_04	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=9 && AC_RANKTEST!=99){ //Course 7
		viewpoint 1,304,193,20,0xFFFFFF00;
	}
}
prt_fild07.gat,206,15,0	script	AC_TSTVP7_05	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=14 && AC_RANKTEST!=99){ //Course 7
		viewpoint 1,248,376,20,0xFFFFFF00;
	}
}
prt_fild05.gat,257,18,0	script	AC_TSTVP7_06	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=15 && AC_RANKTEST!=99){ //Course 7
		viewpoint 1,367,205,20,0xFFFFFF00;
	}
}
moc_ruins.gat,156,42,0	script	AC_QUEVP00_04	139,1,1,{
	if( (AC_QUEST_ST_0==2 && AC_QUEST_LV_0==2)|| //That girl I'm interested in3
		(AC_QUEST_ST_0==3 && AC_QUEST_LV_0==4)){ //That child I care about5
		viewpoint 1,114,100,10,0x0000FF; //Suzanne before Pira
	}
	if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //help with experiment2
		viewpoint 1,54,161,13,0x00FF00; //pila entrance
	}
}
comodo.gat,172,165,0	script	AC_QUEVP00_05	139,7,7,{ //Comodo Academy Official type 2
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==5){ //that girl you care about6
		viewpoint 1,165,163,10,0x0000FF; //no area
	}
	if(AC_QUEST_LV_1==7 && AC_QUEST_ST_1==2){ //box of miracles8
		viewpoint 1,113,219,11,0xFF0000; //Tanya
	}
}
prt_fild06.gat,27,193,0	script	AC_QUEVP00_06	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){ //that girl I care about6
		viewpoint 1,277,320,10,0x0000FF; //to Capitolina Monastery
	}
	if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //I want to be an adventurer1
		viewpoint 1,277,320,14,0x00FFFF;
	}
}
prt_fild02.gat,305,22,0	script	AC_QUEVP00_07	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){ //that girl I'm interested in6
		viewpoint 1,380,347,10,0x0000FF; //to Capitolina Monastery
	}
	if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //I want to be an adventurer1
		viewpoint 1,305,157,14,0x00FFFF; //shooting point 1
	}
}
prt_fild03.gat,23,249,0	script	AC_QUEVP00_08	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){ //that girl I'm interested in6
		viewpoint 1,371,256,10,0x0000FF; //to Capitolina Monastery
	}
}
rachel.gat,129,144,0	script	AC_QUEVP00_10	139,7,7,{ //Rachel Academy Official type 2
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==8){ //that girl I'm interested in9
		viewpoint 1,148,190,10,0x0000FF;
	}
}
veins.gat,197,133,0	script	AC_QUEVP00_11	139,7,7,{ //Veins Academy Official type 2
	if(AC_QUEST_ST_0==3 && AC_QUEST_LV_0==8){ //that girl I'm interested in9
		viewpoint 1,148,329,10,0x0000FF;
	}
}
amatsu.gat,121,155,0	script	#AC_QUEVP01_03	139,7,7,{ //Academy Official type 2
	if(AC_QUEST_LV_1==2 && AC_QUEST_ST_1==2){ //Miracle Box 3
		viewpoint 1,212,141,11,0xFF0000; //archibald
	}
}
gonryun.gat,174,134,0	script	#AC_QUEVP01_04	139,7,7,{ //Academy Official type 2
	if(AC_QUEST_LV_1==3 && AC_QUEST_ST_1==2){ //Miracle Box 4
		viewpoint 1,140,65,11,0xFF0000; //gason
	}
}
louyang.gat,215,118,0	script	#AC_QUEVP01_05	139,7,7,{ //Academy Official type 2
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==2){ //Miracle Box 5
		viewpoint 1,229,109,11,0xFF0000; //Donatello
	}
}
ayothaya.gat,213,193,0	script	#AC_QUEVP01_06	139,7,7,{ //Academy Official type 2
	if(AC_QUEST_LV_1==5 && AC_QUEST_ST_1==2){ //Miracle Box 6
		viewpoint 1,212,176,11,0xFF0000; //Dewey
	}
}
umbala.gat,93,154,0	script	#AC_QUEVP01_07	139,7,7,{ //Academy Official type 2
	if(AC_QUEST_LV_1==6 && AC_QUEST_ST_1==2){ //Miracle Box 7
		viewpoint 1,96,164,11,0xFF0000; //Dennis
	}
}
prt_fild04.gat,374,73,0	script	AC_QUEVP04_13	139,1,1,{
	if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //I want to be an adventurer4
		(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) ){ //I want to be an adventurer7
		viewpoint 1,17,114,14,0x00FFFF;
	}
}
gef_fild01.gat,375,111,0	script	AC_QUEVP04_14	139,1,1,{
	if(AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2){ //I want to be an adventurer4
		viewpoint 1,208,242,14,0x00FFFFF;//shooting point 4
	}
	if(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2){ //I want to be an adventurer7
		viewpoint 1,16,102,14,0x00FFFF;
	}
}
moc_fild17.gat,33,300,0	script	AC_QUEVP04_15	139,1,1,{
	if(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) { //I want to be an adventurer5
		viewpoint 1,146,145,14,0x00FFFF;//shot point 5
	}
}
moc_fild02.gat,77,338,0	script	AC_QUEVP04_19	139,1,1,{
	if(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2) { //I want to be an adventurer6
		viewpoint 1,332,19,14,0x00FFFF;
	}
}
gef_fild09.gat,368,92,0	script	AC_QUEVP04_20	139,1,1,{
	if(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) { //I want to be an adventurer7
		viewpoint 1,225,25,14,0x00FFFF;
	}
}
aldebaran.gat,134,114,0	script	AC_QUEVP04_21	139,7,7,{ //Academy Official type 2
	if( (AC_QUEST_LV_2==0 && AC_QUEST_ST_2==1) || // 1 to that person who helped me
		(AC_QUEST_LV_2==1 && AC_QUEST_ST_2==1) || // I want to deliver an apology1
		(AC_QUEST_LV_2==7 && AC_QUEST_ST_2==2) || // Delivery of sweets
		(AC_QUEST_LV_2==8 && AC_QUEST_ST_2==1)) { // I want to deliver an apology2
		if(AC_QUEST_ST_2==1) cutin "q_run_npc_05.bmp", 4;
		viewpoint 1,231,107,12,0xFF9900; //Misery house
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //I want to be an adventurer8
		viewpoint 1,168,168,14,0x00FFFF; //link santa
	}
}
aldebaran.gat,231,107,0	script	AC_QUEVP02_02	139,1,1,{ //Out of Misery building
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) {
		viewpoint 1,168,166,12,0xFF9900; //link santa
	}
}
xmas_fild01.gat,100,100,0	script	AC_QUEVP04_22	139,1,1,{
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) { // 1 to that person who helped me
		viewpoint 1,84,248,12,0xFF9900;
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //I want to be an adventurer8
		viewpoint 1,84,248,14,0x00FFFF;
	}
}
xmas.gat,149,44,0	script	AC_QUEVP04_23	139,1,1,{
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) { //1 to that person who helped me
		viewpoint 1,189,276,12,0xFF9900;
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //I want to be an adventurer8
		viewpoint 1,143,314,14,0x00FFFF;
	}
}
xmas_dun01.gat,205,16,0	script	AC_QUEVP04_24	139,1,1,{
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //I want to be an adventurer8
		viewpoint 1,129,130,14,0x00FFFF;
	}
}
prt_sewb1.gat,131,247,0	script	AC_QUEVP04_25	139,1,1,{ //pro underground canal 1
	if(AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2){ // Dungeon rescue1
		viewpoint 1,301,206,13,0x00FF00; //chislow
	} else
	if( (AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) || // Dungeon rescue 3
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) ){ // help with experiment5
		viewpoint 1,188,247,13,0x00FF00; //The entrance to the second layer
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //I want to be an adventurer9
		viewpoint 1,188,247,14,0x00FFFF;
	}
}
prt_sewb2.gat,19,19,0	script	AC_QUEVP04_26	139,1,1,{ //pro underground canal 2
	if(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2){ // Dungeon rescue 3
		viewpoint 1,159,182,13,0x00FF00; //Mercy
	} else
	if(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3){ // help with experiment5
		viewpoint 1,180,24,13,0x00FF00; //3-layer entrance
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //I want to be an adventurer9
		viewpoint 1,180,24,14,0x00FFFF;
	}
}
prt_sewb3.gat,180,169,0	script	AC_QUEVP04_27	139,1,1,{ //pro underground canal 3
	if(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3){ // help with experiment 5
		viewpoint 1,184,17,13,0x00FF00; //min ming grass
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //I want to be an adventurer9
		viewpoint 1,20,185,14,0x00FFFF;
	}
}
yuno.gat,142,176,0	script	AC_QUEVP02_05	139,7,7,{ //madsui's house
	if( (AC_QUEST_LV_2==1 && AC_QUEST_ST_2==2) || //I want to deliver an apology1
		(AC_QUEST_LV_2>=2 && AC_QUEST_LV_2<=7 && AC_QUEST_ST_2==1) //collecting ingredients for sweets 1-5, delivering sweets
	){
		viewpoint 1,95,182,12,0xFF9900;
	}
}
lighthalzen.gat,219,161,0	script	AC_QUEVP02_06	139,7,7,{ //Rich Academy Official type 2
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==2){ //collect ingredients for sweets1
		viewpoint 1,51,161,12,0xFF9900; //tree
	}
}
einbroch.gat,223,182,0	script	AC_QUEVP02_07	139,7,7,{ //Einbroch Academy Official type 2
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==3){ //collect ingredients for sweets2
		viewpoint 1,111,261,12,0xFF9900; //dob
	}
}
einbech.gat,171,137,0	script	AC_QUEVP02_08	139,7,7,{ //Einbech Academy Official type 2
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==4){ //collect ingredients for sweets3
		viewpoint 1,130,247,12,0xFF9900; //doldoy
	}
}
izlu2dun.gat,107,50,0	script	AC_QUEVP02_09	139,1,1,{ //Byran Island
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==5){ //collect ingredients for sweets4
		viewpoint 1,136,50,12,0xFF9900; //nriver
	}
	if( (AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2) || //dungeon rescue2
		(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2) ){ //dungeon rescue 4
		viewpoint 1,108,83,13,0x00FF00; // entrance to undersea cave
	}
}
alb2trea.gat,43,53,0	script	AC_QUEVP02_10	139,1,1,{ //sinking ship
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==6){ //collect ingredients for sweets5
		viewpoint 1,105,95,12,0xFF9900; //Airin
	}
}
hugel.gat,93,155,0	script	AC_QUEVP02_11	139,8,9,{ //Hugel Academy Official type 2
	if(AC_QUEST_ST_2==3 && AC_QUEST_LV_2==8){ //I want to deliver an apology2
		viewpoint 1,72,90,12,0xFF9900; //rox
	} else
	if( (AC_QUEST_LV_3==0 && AC_QUEST_ST_3==1) || //help with experiment1
		(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==1) || //experiment help 2
		(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==1) || //experiment help 3
		(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==1) || //Assist with experiment 4
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==1) //experiment help5
	){
		viewpoint 1,104,79,13,0x00FF00;
	} else
	if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==1) || //dungeon rescue1
		(AC_QUEST_LV_3==3 && AC_QUEST_ST_3==1) || // Dungeon rescue 2
		(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==1) || // Dungeon rescue 3
		(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==1) //Dungeon rescue 4
	){
		viewpoint 1,73,152,13,0x00FF00;
	}
}
gef_fild07.gat,336,187,0	script	AC_QUEVP03_01	139,1,1,{ //Geffen west
	if(AC_QUEST_LV_3==0 && AC_QUEST_ST_3==3){ // help with experiment 1
		viewpoint 1,185,249,13,0x00FF00;
	}
}
moc_pryd01.gat,192,9,0	script	AC_QUEVP03_03	139,1,1,{ //Pira Mido ground 1F
	if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //help with experiment 2
		viewpoint 1,193,193,13,0x00FF00; //lilai grass
	}
}
iz_dun00.gat,168,168,0	script	AC_QUEVP03_05	139,1,1,{ //The first layer of undersea cave
	if(AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2){/// Dungeon rescue 2
		viewpoint 1,351,45,13,0x00FF00; // Tweefler
	} else
	if(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2){/// Dungeon rescue 4
		viewpoint 1,352,341,13,0x00FF00; //2nd level entrance (upper right)
	}
}
iz_dun01.gat,253,252,0	script	AC_QUEVP03_06	139,1,1,{ //2 layers of underwater cave
	if(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2){/// Dungeon rescue 4
		viewpoint 1,129,79,13,0x00FF00; //zerpuff
	}
}
pay_arche.gat,81,22,0	script	AC_QUEVP03_07	139,1,1,{ //Archer Village entrance
	if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){/// Help with experiment 3
		viewpoint 1,36,131,13,0x00FF00; // Payon Dungeon
	}
}
pay_dun00.gat,21,183,0	script	AC_QUEVP03_08	139,1,1,{ //Payon Dungeon
	if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){/// Help with experiment 3
		viewpoint 1,154,172,13,0x00FF00; // black weird mushrooms
	}
}
