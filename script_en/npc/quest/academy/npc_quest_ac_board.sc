//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- 冒険者アカデミー  Board
//                                                  by Pneuma
//------------------------------------------------------------

ac_en_hall.gat,110,10,6	script	Board	837,{
	cutin "ad_ac_guide12.bmp",2;
	mes "[Entrance]";
	mes "Beyond this, the library";
	close2;
	cutin "ad_ac_guide12.bmp",255;
	end;
}

ac_library.gat,30,65,6	script	Board	837,{
	cutin "ad_ac_guide16.bmp",2;
	mes "[Library]";
	mes "This will be the library." ;
	mes "There are many books in the library and you can look up many things." ;
	close2;
	cutin "ad_ac_guide16.bmp",255;
	end;
}

ac_library.gat,108,63,6	script	Board	837,{
	cutin "ad_ac_guide14.bmp",2;
	mes "[Library]";
	mes "•Operation rooms";
	close2;
	cutin "ad_ac_guide14.bmp",255;
	end;
}

ac_library.gat,109,52,6	script	Board	837,{
	cutin "ad_ac_guide13.bmp",2;
	mes "[Library]";
	mes "•Knowledge and Combat rooms";
	close2;
	cutin "ad_ac_guide13.bmp",255;
	end;
}

ac_library.gat,120,61,6	script	Board	837,{
	cutin "ad_ac_guide15.bmp",2;
	mes "[Library]";
	mes "•Community and Lifestyle rooms";
	close2;
	cutin "ad_ac_guide15.bmp",255;
	end;
}

ac_en_hall.gat,86,10,6	script	Board	837,{
	cutin "ad_ac_guide11.bmp",2;
	mes "[Entrance]";
	mes "Beyond this, classroom building, course rooms, study rooms, laboratories, examination rooms, resource laboratories, special rooms";
	close2;
	cutin "ad_ac_guide11.bmp",255;
	end;
}

ac_cl_hall.gat,172,71,6	script	Board	837,{
	cutin "ad_ac_guide07.bmp",2;
	mes "[Classroom Building]";
	mes "Beyond this, the reception area on the first floor of the classroom building, the course rooms, study rooms, laboratories, examination rooms, and reference rooms";
	close2;
	cutin "ad_ac_guide07.bmp",255;
	end;
}

ac_cl_hall.gat,163,63,6	script	Board	837,{
	cutin "ad_ac_guide08.bmp",2;
	mes "[Classroom Hall]";
	mes "•Entrance to Practice Rooms and Special Rooms";
	mes " ";
	mes "Practice Rooms and Special Rooms for Novice, Primary, and Extended jobs for Adventurers of Lvl 1-55";
	close2;
	cutin "ad_ac_guide08.bmp",255;
	end;
}
ac_cl_hall.gat,160,45,6	script	Board	837,{
	cutin "ad_ac_guide10.bmp",2;
	mes "[Classroom Hall]";
	mes "•Entrance to Practice Rooms and Special Rooms";
	mes " ";
	mes "Practice Rooms and Special Rooms for Novice, Primary, and Extended jobs for Adventurers of Lvl 1-55";
	close2;
	cutin "ad_ac_guide10.bmp",255;
	end;
}
ac_cl_hall.gat,174,25,6	script	Board	837,{
	cutin "ad_ac_guide09.bmp",2;
	mes "[Classroom Hall]";
	mes "•Entrance to Practice Rooms and Special Rooms";
	mes " ";
	mes "Practice Rooms and Special Rooms for Novice, Primary, and Extended jobs for Adventurers of Lvl 1-55";
	close2;
	cutin "ad_ac_guide09.bmp",255;
	end;
}

ac_cl_room.gat,46,29,6	script	受付、講習室	837,{
	cutin "ad_ac_guide17.bmp",2;
	mes "[1st floor of classroom building]";
	mes "•Reception";
	mes "•Course Room";
	close2;
	cutin "ad_ac_guide17.bmp",255;
	end;
}

ac_cl_room.gat,156,25,4	script	自習室	837,{
	cutin "ad_ac_guide18.bmp",2;
	mes "[1st floor of classroom building]";
	mes "•Study Room";
	close2;
	cutin "ad_ac_guide18.bmp",255;
	end;
}

// Board
ac_cl_area.gat,39,172,4	script	Board	837,{
	cutin "ad_ac_guide05.bmp",2;
	mes "[1st floor of classroom building]";
	mes "•Study Room";
	close2;
	cutin "ad_ac_guide05.bmp",255;
	end;
}
ac_cl_area.gat,39,136,4	script	Board	837,1,4,{
	cutin "ad_ac_guide06.bmp",2;
	mes "[1st floor of classroom building]";
	mes "•Course Room";
	close2;
	cutin "ad_ac_guide06.bmp",255;
	end;
OnTouch:
	if(!(AC_HINT_02 & 0x1)){
		cutin "start_030_jp.bmp", 4;
		set AC_HINT_02, AC_HINT_02 | 0x1;
	}
}

ac_cl_area.gat,65,12,4	script	Board	837,{
	cutin "ad_ac_guide04.bmp",2;
	mes "[Classroom Bldg. 2F]";
	mes "•Resource Room";
	mes "•Laboratory";
	mes "•Examination room";
	mes "•Lecture Room";
	close2;
	cutin "ad_ac_guide04.bmp",255;
	end;
}

ac_cl_area.gat,76,60,4	script	研究室	837,{
	cutin "ad_ac_guide02.bmp",2;
	mes "[Laboratory]";
	mes "This is a laboratory." ;
	mes "The laboratory is currently recruiting researchers." ;
	close2;
	cutin "ad_ac_guide02.bmp",255;
	end;
}

ac_cl_area.gat,49,53,4	script	講義室	837,{
	cutin "ad_ac_guide19.bmp",2;
	mes "[Lecture room]";
	mes "This is a lecture room." ;
	mes "This is where various lectures are held." ;
	close2;
	cutin "ad_ac_guide19.bmp",255;
	end;
}

ac_cl_area.gat,26,43,4	script	資料室	837,{
	cutin "ad_ac_guide01",2;
	mes "[Reference room]";
	mes "This is the reference room." ;
	mes "We manage a large collection of books." ;
	close2;
	cutin "ad_ac_guide01",255;
	end;
}
ac_cl_area.gat,76,39,4	script	試験室	837,{
	cutin "ad_ac_guide03.bmp",2;
	mes "[Examination room]";
	mes "This is the exam room." ;
	mes "This is where the various examinations take place." ;
	close2;
	cutin "ad_ac_guide03.bmp",255;
	end;
}
