//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  �ē���
//                                                  by Pneuma
//------------------------------------------------------------

ac_en_hall.gat,110,10,6	script	�ē���	837,{
	cutin "ad_ac_guide12.bmp",2;
	mes "[�G���g�����X]";
	mes "���̐�A�}����";
	close2;
	cutin "ad_ac_guide12.bmp",255;
	end;
}

ac_library.gat,30,65,6	script	�ē���	837,{
	cutin "ad_ac_guide16.bmp",2;
	mes "[�}����]";
	mes "�����͐}�����ƂȂ�܂��B";
	mes "�}�����ɂ͑����̏���������A";
	mes "���낢��Ȃ��Ƃ�";
	mes "���ׂ邱�Ƃ��o���܂��B";
	close2;
	cutin "ad_ac_guide16.bmp",255;
	end;
}

ac_library.gat,108,63,6	script	�ē���	837,{
	cutin "ad_ac_guide14.bmp",2;
	mes "[�}����]";
	mes "������n�֘A�̕���";
	close2;
	cutin "ad_ac_guide14.bmp",255;
	end;
}

ac_library.gat,109,52,6	script	�ē���	837,{
	cutin "ad_ac_guide13.bmp",2;
	mes "[�}����]";
	mes "���m���֘A�A�퓬�֘A�̕���";
	close2;
	cutin "ad_ac_guide13.bmp",255;
	end;
}

ac_library.gat,120,61,6	script	�ē���	837,{
	cutin "ad_ac_guide15.bmp",2;
	mes "[�}����]";
	mes "���R�~���j�e�B�֘A�A�����֘A�̕���";
	close2;
	cutin "ad_ac_guide15.bmp",255;
	end;
}

ac_en_hall.gat,86,10,6	script	�ē���	837,{
	cutin "ad_ac_guide11.bmp",2;
	mes "[�G���g�����X]";
	mes "���̐�A������";
	mes "��t�A�u�K���A���K���A";
	mes "�������A�������A������";
	mes "���K���A���ʎ�";
	close2;
	cutin "ad_ac_guide11.bmp",255;
	end;
}

ac_cl_hall.gat,172,71,6	script	�ē���	837,{
	cutin "ad_ac_guide07.bmp",2;
	mes "[�������z�[��]";
	mes "���̐�A������1F";
	mes "��t�A�u�K���A���K���A";
	mes "�������A�������A������";
	close2;
	cutin "ad_ac_guide07.bmp",255;
	end;
}

ac_cl_hall.gat,163,63,6	script	�ē���	837,{
	cutin "ad_ac_guide08.bmp",2;
	mes "[�������z�[��]";
	mes "�����K���E���ʎ��@����";
	mes " ";
	mes "Lv1�`55�̖`���҂̕���p";
	mes "�m�[�r�X�A�ꎟ�E�A";
	mes "����ꎟ�E�̖`���҂�";
	mes "���K���E���ʎ�";
	close2;
	cutin "ad_ac_guide08.bmp",255;
	end;
}
ac_cl_hall.gat,160,45,6	script	�ē���	837,{
	cutin "ad_ac_guide10.bmp",2;
	mes "[�������z�[��]";
	mes "�����K���E���ʎ��@����";
	mes " ";
	mes "Lv1�`55�̖`���҂̕���p";
	mes "�m�[�r�X�A�ꎟ�E�A";
	mes "����ꎟ�E�̖`���҂�";
	mes "���K���E���ʎ�";
	close2;
	cutin "ad_ac_guide10.bmp",255;
	end;
}
ac_cl_hall.gat,174,25,6	script	�ē���	837,{
	cutin "ad_ac_guide09.bmp",2;
	mes "[�������z�[��]";
	mes "�����K���E���ʎ��@����";
	mes " ";
	mes "Lv1�`55�̖`���҂̕���p";
	mes "�m�[�r�X�A�ꎟ�E�A";
	mes "����ꎟ�E�̖`���҂�";
	mes "���K���E���ʎ�";
	close2;
	cutin "ad_ac_guide09.bmp",255;
	end;
}

ac_cl_room.gat,46,29,6	script	��t�A�u�K��	837,{
	cutin "ad_ac_guide17.bmp",2;
	mes "[������1F]";
	mes "����t";
	mes "���u�K��";
	close2;
	cutin "ad_ac_guide17.bmp",255;
	end;
}

ac_cl_room.gat,156,25,4	script	���K��	837,{
	cutin "ad_ac_guide18.bmp",2;
	mes "[������1F]";
	mes "�����K��";
	close2;
	cutin "ad_ac_guide18.bmp",255;
	end;
}

// �ē���
ac_cl_area.gat,39,172,4	script	�ē���	837,{
	cutin "ad_ac_guide05.bmp",2;
	mes "[������1F]";
	mes "�����K��";
	close2;
	cutin "ad_ac_guide05.bmp",255;
	end;
}
ac_cl_area.gat,39,136,4	script	�ē���	837,1,4,{
	cutin "ad_ac_guide06.bmp",2;
	mes "[������1F]";
	mes "���u�K��";
	close2;
	cutin "ad_ac_guide06.bmp",255;
	end;
OnTouch:
	if(!(AC_HINT_02 & 0x1)){
		cutin "start_030_jp.bmp", 4;
		set AC_HINT_02, AC_HINT_02 | 0x1;
	}
}

ac_cl_area.gat,65,12,4	script	�ē���	837,{
	cutin "ad_ac_guide04.bmp",2;
	mes "[������2F]";
	mes "��������";
	mes "��������";
	mes "��������";
	mes "���u�`��";
	close2;
	cutin "ad_ac_guide04.bmp",255;
	end;
}

ac_cl_area.gat,76,60,4	script	������	837,{
	cutin "ad_ac_guide02.bmp",2;
	mes "[������]";
	mes "�����͌������ɂȂ�܂��B";
	mes "�������ł́A";
	mes "���݌��������W���ł��B";
	close2;
	cutin "ad_ac_guide02.bmp",255;
	end;
}

ac_cl_area.gat,49,53,4	script	�u�`��	837,{
	cutin "ad_ac_guide19.bmp",2;
	mes "[�u�`��]";
	mes "�����͍u�`���ɂȂ�܂��B";
	mes "���܂��܂ȍu�`���s����ꏊ�ł��B";
	close2;
	cutin "ad_ac_guide19.bmp",255;
	end;
}

ac_cl_area.gat,26,43,4	script	������	837,{
	cutin "ad_ac_guide01",2;
	mes "[������]";
	mes "�����͎������ɂȂ�܂��B";
	mes "��R�̑������Ǘ����Ă��܂��B";
	close2;
	cutin "ad_ac_guide01",255;
	end;
}
ac_cl_area.gat,76,39,4	script	������	837,{
	cutin "ad_ac_guide03.bmp",2;
	mes "[������]";
	mes "�����͎������ɂȂ�܂��B";
	mes "���܂��܂Ȏ������s����ꏊ�ł��B";
	close2;
	cutin "ad_ac_guide03.bmp",255;
	end;
}
