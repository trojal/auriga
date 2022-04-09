//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- Adventurer Academy Info Board
// by Pneuma
//------------------------------------------------------------

ac_en_hall.gat,110,10,6	script	Info Board	837,{
	cutin "ad_ac_guide12.bmp",2;
	mes "[Entrance]";
	mes "Down the road, Library Room";
	close2;
	cutin "ad_ac_guide12.bmp",255;
	end;
}

ac_library.gat,30,65,6	script	Info Board	837,{
	cutin "ad_ac_guide16.bmp",2;
	mes "[Library Room]";
	mes "This is the Library Room.";
	mes "There are many books in the Library Room, and you can look up many things.";
	close2;
	cutin "ad_ac_guide16.bmp",255;
	end;
}

ac_library.gat,108,63,6	script	Info Board	837,{
	cutin "ad_ac_guide14.bmp",2;
	mes "[Library Room]";
	mes "-operation-related rooms";
	close2;
	cutin "ad_ac_guide14.bmp",255;
	end;
}

ac_library.gat,109,52,6	script	Info Board	837,{
	cutin "ad_ac_guide13.bmp",2;
	mes "[Library Room]";
	mes "-Knowledge-related and combat-related rooms";
	close2;
	cutin "ad_ac_guide13.bmp",255;
	end;
}

ac_library.gat,120,61,6	script	Info Board	837,{
	cutin "ad_ac_guide15.bmp",2;
	mes "[Library Room]";
	mes "-Community-related and living-related rooms";
	close2;
	cutin "ad_ac_guide15.bmp",255;
	end;
}

ac_en_hall.gat,86,10,6	script	Info Board	837,{
	cutin "ad_ac_guide11.bmp",2;
	mes "[Entrance]";
	mes "Beyond this, classroom buildingsReception and Training Rooms, Self-study Rooms, Research Office, Laboratory, Information RoomPractice Rooms, Special Rooms";
	close2;
	cutin "ad_ac_guide11.bmp",255;
	end;
}

ac_cl_hall.gat,172,71,6	script	Info Board	837,{
	cutin "ad_ac_guide07.bmp",2;
	mes "[Classroom Hall]";
	mes "Beyond this point, 1st floor of the Classroom BuildingReception and Training Rooms, Self-study Room, Research Office, Laboratory, Information Room";
	close2;
	cutin "ad_ac_guide07.bmp",255;
	end;
}

ac_cl_hall.gat,163,63,6	script	Info Board	837,{
	cutin "ad_ac_guide08.bmp",2;
	mes "[Classroom Hall]";
	mes "-Practice Rooms/Special Rooms Entrance Lv1-55 Adventurers Only Novice, Primary, and Special Primary Adventurers' Practice Rooms/Special Rooms";
	close2;
	cutin "ad_ac_guide08.bmp",255;
	end;
}
ac_cl_hall.gat,160,45,6	script	Info Board	837,{
	cutin "ad_ac_guide10.bmp",2;
	mes "[Classroom Hall]";
	mes "-Practice Rooms/Special Rooms Entrance Lv1-55 Adventurers Only Novice, Primary, and Special Primary Adventurers' Practice Rooms/Special Rooms";
	close2;
	cutin "ad_ac_guide10.bmp",255;
	end;
}
ac_cl_hall.gat,174,25,6	script	Info Board	837,{
	cutin "ad_ac_guide09.bmp",2;
	mes "[Classroom Hall]";
	mes "-Practice Rooms/Special Rooms Entrance Lv1-55 Adventurers Only Novice, Primary, and Special Primary Adventurers' Practice Rooms/Special Rooms";
	close2;
	cutin "ad_ac_guide09.bmp",255;
	end;
}

ac_cl_room.gat,46,29,6	script	Reception and Training Rooms	837,{
	cutin "ad_ac_guide17.bmp",2;
	mes "[Classroom Building 1F]";
	mes "-Reception-Classroom";
	close2;
	cutin "ad_ac_guide17.bmp",255;
	end;
}

ac_cl_room.gat,156,25,4	script	Self-study Room	837,{
	cutin "ad_ac_guide18.bmp",2;
	mes "[Classroom building 1F]";
	mes "-Self-study Room";
	close2;
	cutin "ad_ac_guide18.bmp",255;
	end;
}

// Info Board
ac_cl_area.gat,39,172,4	script	Info Board	837,{
	cutin "ad_ac_guide05.bmp",2;
	mes "[Classroom building 1F]";
	mes "-Self-study Room";
	close2;
	cutin "ad_ac_guide05.bmp",255;
	end;
}
ac_cl_area.gat,39,136,4	script	Info Board	837,1,4,{
	cutin "ad_ac_guide06.bmp",2;
	mes "[Classroom building 1F]";
	mes "-classroom";
	close2;
	cutin "ad_ac_guide06.bmp",255;
	end;
OnTouch:
	if(! (AC_HINT_02 & 0x1)){
		cutin "start_030_jp.bmp", 4;
		set AC_HINT_02, AC_HINT_02 | 0x1;
	}
}

ac_cl_area.gat,65,12,4	script	Info Board	837,{
	cutin "ad_ac_guide04.bmp",2;
	mes "[Classroom building 2F]";
	mes "-Information Room-Research Office-Laboratory-Lecture Room";
	close2;
	cutin "ad_ac_guide04.bmp",255;
	end;
}

ac_cl_area.gat,76,60,4	script	Research Office	837,{
	cutin "ad_ac_guide02.bmp",2;
	mes "[Research Office]";
	mes "This is the Research Office.";
	mes "The Research Office is currently recruiting researchers.";
	close2;
	cutin "ad_ac_guide02.bmp",255;
	end;
}

ac_cl_area.gat,49,53,4	script	Lecture Room	837,{
	cutin "ad_ac_guide19.bmp",2;
	mes "[Lecture Room]";
	mes "This is the Lecture Room.";
	mes "This is where various lectures are held.";
	close2;
	cutin "ad_ac_guide19.bmp",255;
	end;
}

ac_cl_area.gat,26,43,4	script	Information Room	837,{
	cutin "ad_ac_guide01",2;
	mes "[Information Room]";
	mes "This is the Information Room.";
	mes "We manage a lot of books.";
	close2;
	cutin "ad_ac_guide01",255;
	end;
}
ac_cl_area.gat,76,39,4	script	Laboratory	837,{
	cutin "ad_ac_guide03.bmp",2;
	mes "[Laboratory]";
	mes "This will be Laboratory.";
	mes "This is where various tests are conducted.";
	close2;
	cutin "ad_ac_guide03.bmp",255;
	end;
}
