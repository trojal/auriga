//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ���K��      by Pneuma
//------------------------------------------------------------

//----------------------------
// �����K��
//

//ac_cl_hall.gat,149,64,0	script	���K��A_WP	45,1,1,{
//	set '@novice, (BaseLevel<=25 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if(!'@novice) {
//		mes "�]�~�b�h�̒��ӏ����]";
//		mes "���̐��^FF0000Lv1�`Lv25^000000��";
//		mes "�`���Ґ�p�̎��K���ɂȂ��I";
//		mes "^FF0000�]���A2���E�ȏ�^000000�̖`���҂�";
//		mes "���K���ɂ͓���܂���B";
//		mes "�삯�o���̖`���҂�";
//		mes "�T�|�[�g���Ă����ĂˁI";
//		close;
//	}
//	warp "ac_prac_a.gat",209,47;
//	end;
//}

//ac_cl_hall.gat,151,42,0	script	���K��B_WP	45,1,1,{
//	set '@novice, (BaseLevel>=20 && BaseLevel<=35 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if(!'@novice) {
//		mes "�]�~�b�h�̒��ӏ����]";
//		mes "���̐��^FF0000Lv20�`Lv35^000000��";
//		mes "�`���Ґ�p�̎��K���ɂȂ��I";
//		mes "^FF0000�]���A2���E�ȏ�^000000�̖`���҂�";
//		mes "���K���ɂ͓���܂���B";
//		mes "�삯�o���̖`���҂�";
//		mes "�T�|�[�g���Ă����ĂˁI";
//		close;
//	}
//	warp "ac_prac_b.gat",0,0;
//	end;
//}

//ac_cl_hall.gat,182,21,0	script	���K��C_WP	45,1,1,{
//	set '@novice, (BaseLevel>=30 && BaseLevel<=45 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if(!'@novice) {
//		mes "�]�~�b�h�̒��ӏ����]";
//		mes "���̐��^FF0000Lv30�`Lv45^000000��";
//		mes "�`���Ґ�p�̎��K���ɂȂ��I";
//		mes "^FF0000�]���A2���E�ȏ�^000000�̖`���҂�";
//		mes "���K���ɂ͓���܂���B";
//		mes "�삯�o���̖`���҂�";
//		mes "�T�|�[�g���Ă����ĂˁI";
//		close;
//	}
//	warp "ac_prac_c.gat",0,0;
//	end;
//}

ac_cl_hall.gat,167,53,0	script	���茸������	111,{
	mes "�]�����ɒ��莆���\���Ă���]";
	next;
	mes "[�~�b�h�̒��ӏ���]";
	mes "�u������̎��K���͕�������܂����v";
	next;
	mes "�]�����Ɏ��K�����������悤���]";
	close;
//2010/04/13�폜
//	mes "�]���茸�������[���̂悤��";
//	mes "�Ղ�����]";
//	set '@novice, (BaseLevel>=40 && BaseLevel<=55 && Upper!=1 && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja));
//	if('@novice){
//		next;
//		mes "�����������Ă݂܂����H";
//		next;
//		if(select("�����Ă݂�","�������Ȃ�")==2){
//			mes "[" +strcharinfo(0)+ "]";
//			mes "�i�G��̂͂�߂Ă������c�c�j";
//			close;
//		}
//		mes "[" +strcharinfo(0)+ "]";
//		mes "�i�Ȃ񂾂낤�H�j";
//		mes " ";
//		mes "�]������͂����ς������Ă݂��]";
//		close2;
//		warp "ac_prac_d.gat",104,20;
//		end;
//	}
//	close;
}

//----------------------------------
//���K���E���ʎ� �]�����u
ac_cl_area.gat,57,185,4		script	�]�����u#AC_PRACBD01	857,{
	set '@novice, callfunc("AC_GetNovice");
	mes "[�]�����u]";
	mes "������͎��K���E���ʎ���";
	mes "������ł��B";
	mes "�����X�^�[�Ƃ̐퓬��";
	mes "���K���������k��";
	mes "�s���Ă݂܂��傤�B";
	next;
	if(!'@novice) {
		mes "[�~�b�h�̒��ӏ���]";
		mes "���̐��^FF0000Lv1�`Lv55^000000��";
		mes "�`���Ґ�p�̎��K���ɂȂ��I";
		mes "^FF0000�]���A2���E�ȏ�^000000�̖`���҂�";
		mes "�h�������͎��K���ɂ͓���܂���B";
		mes "�삯�o���̖`���҂�";
		mes "�T�|�[�g���Ă����ĂˁI";
		close;
	}
	switch(Job){
	case Job_Novice:
		mes "�]�]�����u�Ƀ~�b�h��";
		mes "�@���ӏ����������Ă���]";
		next;
		mes "[�~�b�h�̒��ӏ���]";
		mes "���̎��K����1���E��";
		mes "�]�E���Ă�������I";
		mes "^0000FF�m�[�r�X^000000�̐��k��";
		mes "^0000FF1���E�֓]�E���Ă��悤�I^000000";
		mes "�]�E�͍u�K���́u^FF0000�t�F�C^000000�v��";
		mes "�T�|�[�g���Ă�����I";
		next;
		break;
	case Job_Gunslinger:
		mes "[�~�b�h�̒��ӏ���]";
		mes "�K���X�����K�[�̐��k��";
		mes "^0000FF�e�e^000000�̑�����";
		mes "�Y��Ȃ��łˁI";
		mes "�e�𑕔����Ă��Ă�";
		mes "^0000FF�e�e^000000�𑕔����Ă��Ȃ���";
		mes "�����X�^�[�ɍU���ł��Ȃ���I";
		next;
		mes "[�~�b�h�̒��ӏ���]";
		mes "�e�e�𑕔����Ă��Ȃ����k��";
		mes "^0000FF�u�����A�C�e���v^000000�E�B���h�E����";
		mes "^0000FF�uetc�v^000000�^�u���N���b�N���āA";
		mes "�e�e��^0000FF�u�����A�C�e���E�B���h�E�v^000000��";
		mes "�h���b�O�A���h�h���b�v����";
		mes "�������悤�ˁI";
		next;
		mes "[�~�b�h�̒��ӏ���]";
		mes "�����A^0000FF�uetc�v^000000�^�u��";
		mes "�e�e���Ȃ�������A�]�E���ɖ����";
		mes "�o���b�g�P�[�X��^0000FF�uitem�v^000000�^�u��";
		mes "���邩��A�o���b�g�P�[�X��";
		mes "�_�u���N���b�N���āA";
		mes "�e�e�i�o���b�g�j�����o���ĂˁI";
		next;
		set '@hint,1;
		break;
	}
	menu "���K���E���ʎ��ɍs��",L_PRAC,"�~�b�h�̒��ӏ�����ǂ�",L_ABOUT,"�������Ȃ�",L_CANCEL;
L_PRAC:
	mes "[�]�����u]";
	mes "�ǂ���֍s���܂����H";
	mes " ";
	mes "�]�s�����Ƃ��ł�����K���E���ʎ���";
	mes "^FF0000��^000000�A����^0000FF��^000000�ŕ\������܂��]";
	next;
	set '@list$,"";
	for(set '@i,0; '@i<8; set '@i,'@i+1){
		if(BaseLevel>='LVREQUIRE['@i]){
			set '@list$,'@list$ + 'COLORSTR$['MAPNAMECL['@i]] + 'MAPLVSTR$['@i] + 'MAPNAME$['@i] + ":";
		} else {
			set '@list$,'@list$ + "^777777" + 'MAPLVSTR$['@i] + 'MAPNAME$['@i] + ":";
		}
	}
	set '@list$,'@list$ + "^000000�܂��A�������邱�Ƃ�����";
	set '@num,select('@list$)-1;
	if('@num==8){
		mes "[" + strcharinfo(0) + "]";
		mes "�i�������Ă��悤�j";
		close;
	}
	if(BaseLevel < 'LVREQUIRE['@num]){
		mes "[�]�����u]";
		mes "���̎��K���𗘗p���邽�߂ɂ�";
		mes "^0000FFBaseLv���� " + ('LVREQUIRE['@num] - BaseLevel) + "^000000 �K�v�ł��B";
		next;
		goto L_PRAC;
	}
	savepoint "ac_cl_area.gat",53,180;
	mes "[�]�����u]";
	mes "^FF0000" + 'MAPNAME$['@num] + "^000000�֓]�����܂��B";
	mes " ";
	mes "�]^0000FF�Z�[�u�ʒu��������1F";
	mes "���K���̓�����O��^000000";
	mes "�ݒ肳��܂����]";
	close2;
	switch('@num){
	case 0: warp "ac_prac_01.gat",225,31; end;
	case 1: warp "ac_prac_02.gat",108,33; end;
	case 2: warp "ac_prac_03.gat",29,337; end;
	case 3: warp "ac_prac_04.gat",261,261; end;
	case 4: warp "ac_prac_05.gat",57,170; end;
	case 5: warp "ac_spec_01.gat",283,34; end;
	case 6: warp "ac_spec_02.gat",124,59; end;
	case 7: warp "ac_spec_03.gat",98,78; end;
	}
L_ABOUT:
	mes "[�~�b�h�̒��ӏ���]";
	mes "���K���E���ʎ��ł�";
	mes "^0000FF���J�o���[�v���[�g^000000�𗘗p���悤�I";
	mes "^0000FFHP��SP����^000000�ł��邼�I";
	mes " ";
	mes "^0000FF�����t�^�̌���^000000�����邩��A";
	mes "�������ʂ̈Ⴂ���̌����Ă݂悤�I�]";
	close;
L_CANCEL:
	mes "�]�������Ȃ������]";
	close2;
	switch('@hint){
	case 1:
		cutin "start_035_jp.bmp", 4;
		break;
	}
	end;
OnInit:
	waitingroom "���K���̓����",0;
	setarray 'MAPNAME$, "���K���i�C�݁j","���K���i���j","���K���i�����j","���K���i�Y�z�j","���K���i�����j","���ʎ��i�΁j","���ʎ��i�p�Ёj","���ʎ��i�n�����j";
	setarray 'MAPLVSTR$,"Lv1�ȏ�@","Lv15�ȏ� ","Lv25�ȏ� ","Lv35�ȏ� ","Lv45�ȏ� ","Lv10�ȏ� ","Lv10�ȏ� ","Lv10�ȏ� ";
	setarray 'LVREQUIRE,1,15,25,35,45,10,10,10;
	setarray 'MAPNAMECL,0,0,0,0,0,1,1,1;
	setarray 'COLORSTR$,"^FF0000","^0000FF";
}
ac_cl_hall.gat,152,66,4		duplicate(�]�����u#AC_PRACBD01)		�]�����u#AC_PRACBD02	857
ac_cl_hall.gat,154,44,4		duplicate(�]�����u#AC_PRACBD01)		�]�����u#AC_PRACBD03	857
ac_cl_hall.gat,174,22,4		duplicate(�]�����u#AC_PRACBD01)		�]�����u#AC_PRACBD04	857
ac_cl_area.gat,57,187,0		duplicate(�]�����u#AC_PRACBD01)		WP#AC_PRACBD01	45,1,1
ac_cl_hall.gat,149,64,0		duplicate(�]�����u#AC_PRACBD01)		WP#AC_PRACBD02	45,1,1
ac_cl_hall.gat,151,42,0		duplicate(�]�����u#AC_PRACBD01)		WP#AC_PRACBD03	45,1,1
ac_cl_hall.gat,182,21,0		duplicate(�]�����u#AC_PRACBD01)		WP#AC_PRACBD04	45,1,1

//----------------------------------
// ���K�� ��������֎~�Ŕ�
function	script	stopboard_func	{
	viewpoint 1,getarg(0),getarg(1),1,0xFF0000;
	mes "�]���̐旧������֎~�]";
	mes " ";
	mes "�]�����Ă��܂������k��";
	mes "�~�j�}�b�v�́u^FF0000+^000000�v�𗊂��";
	mes "�߂��Ă��邱�Ɓ]";
	close;
}
//���K���i�C�݁j
ac_prac_01.gat,299,57,4		script	#ac_exerboard_P11	837,{ callfunc "stopboard_func",225,31; }
ac_prac_01.gat,370,93,4		script	#ac_exerboard_P12	837,{ callfunc "stopboard_func",225,31; }
ac_prac_01.gat,22,59,4		script	#ac_exerboard_P13	837,{ callfunc "stopboard_func",225,31; }
//���K���i���j
ac_prac_02.gat,111,91,4		script	#ac_exerboard_P21	837,{ callfunc "stopboard_func",108,27; }
//���K���i�����j
ac_prac_03.gat,27,241,4		script	#ac_exerboard_P31	837,{ callfunc "stopboard_func",29,343; }
ac_prac_03.gat,191,236,4	script	#ac_exerboard_P32	837,{ callfunc "stopboard_func",29,343; }
//���K���i�Y�z�j
ac_prac_04.gat,19,15,0		script	#ac_exerboard_P41	837,{ callfunc "stopboard_func",261,261; }
//���K���i�����j
ac_prac_05.gat,160,378,4	script	#ac_exerboard_P51	837,{ callfunc "stopboard_func",51,170; }
ac_prac_05.gat,380,308,4	script	#ac_exerboard_P52	837,{ callfunc "stopboard_func",51,170; }
//���ʎ��i�΁j
ac_spec_01.gat,371,345,4	script	#ac_exerboard_S11	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,35,26,4		script	#ac_exerboard_S12	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,17,172,4		script	#ac_exerboard_S13	837,{ callfunc "stopboard_func",283,34; }
ac_spec_01.gat,378,168,4	script	#ac_exerboard_S14	837,{ callfunc "stopboard_func",283,34; }
//���ʎ��i�n�����j
ac_spec_03.gat,67,278,4		script	#ac_exerboard_S31	837,{ callfunc "stopboard_func",105,78; }

//----------------------------------
// ���J�o���[�v���[�g
-	script	���J�o���[�v���[�g#func	-1,{
	setarray 'RECOVER_TIME,0,1,2,4,8;
	set '@time,(BaseLevel>20) * 'RECOVER_TIME[(BaseLevel-11)/10];
	mes "[���J�o���[�v���[�g]";
	if(BaseLevel>60){
		set @AC_RECOVERTIME,0;
		mes "[�~�b�h�̒��ӏ���]";
		mes "�]���̃��J�o���[�v���[�g��";
		mes "���K����^FF0000�`���Ҍ��K��^000000�ׂ̈�";
		mes "�p�ӂ��ꂽ���K�p�̋@�B���I�]";
		mes " ";
		mes "�]��l�O�̖`���҂ɂ�";
		mes "���p���邱�Ƃ��o���Ȃ��񂾁I�]";
		close;
	}
	if(gettimetick(2) < @AC_RECOVERTIME) { //�^�C�}�[�`�F�b�N
		set '@min,(((@AC_RECOVERTIME-gettimetick(2))/60) % 60);
		if('@min==0){
			mes "^FF0000���J�o���[�N�������J�n�c�c^000000";
		} else {
			mes "^FF0000�ă��J�o���[�܂ŁA���悻"+'@min+"��^000000";
		}
		mes " ";
		mes "�]�������܂����H�]";
		next;
		menu "���ӏ�����ǂ�",L_ABOUT,"�������Ȃ�",L_CANCEL;
	} else {
		set @AC_RECOVERTIME,0;
		mes "^FF0000���J�o���[�\^000000";
		mes " ";
		mes "�]�������܂����H�]";
		next;
		menu "���J�o���[���s��",-,"���ӏ�����ǂ�",L_ABOUT,"�������Ȃ�",L_CANCEL;
	}
	mes "[���J�o���[�v���[�g]";
	mes "���̑�����t�^���܂����H^FF0000";
	mes "�]�����t�^�͕���𑕔�������Ԃ�";
	mes "�s�����Ƃ��ł��܂�-^000000";
	next;
	set '@num,select("�Α�����t�^","�n������t�^","��������t�^","��������t�^","��������t�^","�ő�����t�^","������t�^���Ȃ�","�������Ȃ�");
	if('@num==8) goto L_CANCEL;
	mes "[���J�o���[�v���[�g]";
	switch('@num) {
		case 1: npcskillsupport 280,4,"","";  sc_start 90,1800000,5; mes "�]^FF0000��^000000�����̕t�^���s���܂����]";break;
		case 2: npcskillsupport 283,4,"","";  sc_start 93,1800000,5; mes "�]^FF0000�y^000000�����̕t�^���s���܂����]";break;
		case 3: npcskillsupport 282,4,"","";  sc_start 92,1800000,5; mes "�]^FF0000��^000000�����̕t�^���s���܂����]";break;
		case 4: npcskillsupport 281,4,"","";  sc_start 91,1800000,5; mes "�]^FF0000��^000000�����̕t�^���s���܂����]";break;
		case 5: npcskillsupport 425,7,"","";  sc_start 17,300000,5;  mes "�]^FF0000��^000000�����̕t�^���s���܂����]";break;
		case 6: npcskillsupport 138,10,"",""; sc_start  6,900000,5;  mes "�]^FF0000��^000000�����̕t�^���s���܂����]";break;
		case 7: break;
	}
	mes "�]HP�ASP���񕜂��܂����]";
	set @AC_RECOVERTIME,gettimetick(2) + ('@time * 60); //�^�C�}�[�Z�b�g
	misceffect 7,"";
	percentheal 100,100;
	close;
L_ABOUT:
	mes "[�~�b�h�̒��ӏ���]";
	mes "�]���̃��J�o���[�v���[�g��";
	mes "���K���̖`���҂̂��߂�";
	mes "�p�ӂ��ꂽ���K�p�̋@�B���I�]";
	next;
	mes "[�~�b�h�̒��ӏ���]";
	if('@time>0) mes "�]���̌N��^FF0000��" + '@time + "^000000��������";
	else         mes "�]���̌N��^FF0000���ł�^000000";
	mes "���J�o���[���s�����I�]";
	mes " ";
	mes "�]���J�o���[�Ƃ́H�]";
	mes "�]HP�ASP�̉񕜁A�����t�^��";
	mes "�s�����Ƃ��I�]";
	next;
	mes "[�~�b�h�̒��ӏ���]";
	mes "�]�㋉�҂ɂȂ�΂Ȃ�ق�";
	mes "���J�o���[�����s���鎞��";
	mes "^FF0000�p���[���K�v^000000�Ȃ񂾁I�]";
	mes " ";
	mes "�]�㋉�҂́A�p���[�̏[�d��";
	mes "���Ԃ�������̂Œ��ӂ��ĂˁI�]";
	next;
	mes "[�~�b�h�̒��ӏ���]";
	mes "�]�����t�^��";
	mes "�Α����A�n�����A�������A�������A";
	mes "�ő����A�������A��t�^�ł���I�]";
	next;
	mes "[�~�b�h�̒��ӏ���]";
	mes "�]�����ȑ����������Ă݂悤�I-^FF0000";
	mes "�]�����t�^�͕���𑕔�������Ԃ�";
	mes "�s�����Ƃ��ł����I-^000000";
	close;
L_CANCEL:
	mes "[���J�o���[�v���[�g]";
	mes "�]������������܂����]";
	close;
}
//���K���i�C�݁j
ac_prac_01.gat,236,51,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_01.gat,52,30,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_01.gat,322,179,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_01.gat,141,130,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_01.gat,354,34,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//���K���i���j
ac_prac_02.gat,116,58,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_02.gat,171,131,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_02.gat,58,150,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//���K���i�����j
ac_prac_03.gat,46,310,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_03.gat,132,35,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_03.gat,26,90,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_03.gat,119,174,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//���K���i�Y�z�j
ac_prac_04.gat,287,271,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_04.gat,228,78,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_04.gat,141,178,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_04.gat,12,119,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_04.gat,44,273,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_04.gat,119,32,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//���K���i�����j
ac_prac_05.gat,150,323,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_05.gat,229,288,3	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_05.gat,357,252,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_05.gat,229,204,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_05.gat,120,178,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_prac_05.gat,264,112,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//���ʎ��i�΁j
ac_spec_01.gat,261,47,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_01.gat,310,271,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_01.gat,236,337,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_01.gat,140,137,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_01.gat,123,236,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_01.gat,232,121,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//���ʎ��i�p�Ёj
ac_spec_02.gat,140,72,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_02.gat,185,40,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_02.gat,174,147,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_02.gat,72,176,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_02.gat,25,155,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_02.gat,74,72,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_02.gat,29,33,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_02.gat,120,130,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//���ʎ��i�n�����j
ac_spec_03.gat,140,168,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_03.gat,204,46,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_03.gat,73,220,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_03.gat,283,275,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_03.gat,256,81,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_03.gat,9,220,4		duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857
ac_spec_03.gat,194,179,4	duplicate(���J�o���[�v���[�g#func)	���J�o���[�v���[�g	857

//----------------------------------
-	script	�A�J�f�~�[�{�b�N�X#func		-1,{
	mes "[�A�J�f�~�[�{�b�N�X]";
	mes "�E�B�[���c�@�s�s�s�b�c";
	mes " ";
	mes "�A�J�f�~�[���k�@�m�F����";
	mes "�e��@�\�@���@�I���V�e�N�_�T�C";
	next;
	menu "�|�[�V���������T�[�r�X",L_POTION,"������]���T�[�r�X",L_TENSOU,"�A�J�f�~�[�{�b�N�X�̎����",L_HOWTO,"����ς�~�߂�",L_CANCEL;
L_POTION:
	setarray '@potname$,"���S�җp�|�[�V����","���S�җp�|�[�V����","�X�s�[�h�A�b�v�|�[�V����","�n�C�X�s�[�h�|�[�V����";
	setarray '@potid,569,11518,645,656;
	mes "[�A�J�f�~�[�{�b�N�X]";
	mes "�����V�^�C";
	mes "�|�[�V���� ��";
	mes "�I���V�e�N�_�T�C";
	next;
	set '@num,select("���S�җp�|�[�V����","���S�җp�|�[�V����","�X�s�[�h�A�b�v�|�[�V����","�n�C�X�s�[�h�|�[�V����","����ς�~�߂�")-1;
	if('@num==4) goto L_CANCEL;
	mes "[�A�J�f�~�[�{�b�N�X]";
	switch('@num){
	case 0:
		mes "���S�җp�|�[�V����";
		mes "����:HP��";
		next;
		setarray '@item,914,507,945;
		setarray '@amount,10,5,20;
		setarray '@amount2,25,50,100;
		setarray '@name$,"�Ȗ�","�ԃn�[�u","�^�k�L�̗t"; //�^�k�L�̗t�Ŗ{�I�ʂ�
		break;
	case 1:
		mes "���S�җp�|�[�V����";
		mes "����:SP��^FF0000";
		mes "���R�m�A�C�e���n �q�Ƀ��܃��A";
		mes "�@��؃m�ړ��K�o���}�Z��^000000";
		next;
		setarray '@item,1026,998,549;
		setarray '@amount,1,1,1;
		setarray '@amount2,1,2,5;
		setarray '@name$,"�ǂ񂮂�","�S","���������Ă�����";
		break;
	case 2:
		mes "�X�s�[�h�A�b�v�|�[�V����";
		mes "Lv����:1�ȏ�";
		mes "����:�U�����x�㏸�i���j";
		mes "���p�\�i1���E��:�X�x�e�m1���E";
		next;
		setarray '@item,940;
		setarray '@amount,30;
		setarray '@amount2,1;
		setarray '@name$,"�o�b�^�̑�";
		break;
	case 3:
		mes "�n�C�X�s�[�h�|�[�V����";
		mes "Lv����:40�ȏ�";
		mes "����:�U�����x�㏸�i���j";
		mes "���p�\��1���E:";
		mes "�A�R���C�g �����N �X�x�e�m1���E";
		next;
		setarray '@item,1018;
		setarray '@amount,15;
		setarray '@amount2,1;
		setarray '@name$,"�y���̒�";
		break;
	}
	mes "[�A�J�f�~�[�{�b�N�X]";
	mes '@potname$['@num] + "�������X�g";
	set '@select$,"";
	for(set '@i,0; '@i<getarraysize('@name$); set '@i,'@i+1){
		mes "�@" + '@name$['@i] + ('@amount['@i]) + "��" + '@amount2['@i] + "��";
		set '@select$,'@select$ + '@name$['@i] + ":";
	}
	set '@select$,'@select$ + '@name$['@i] + "�������Ȃ�";
	if('@num>1) mes " ";
	mes "�����X�� �A�C�e�� ��";
	mes "�I���V�e �N�_�T�C";
	next;
	set '@trade,select('@select$)-1;
	if('@trade==getarraysize('@name$)) goto L_CANCEL;
	mes "[�A�J�f�~�[�{�b�N�X]";
	mes '@name$['@trade] + ('@amount['@trade]) + "�� ��";
	mes '@potname$['@num] + ('@amount2['@trade]) + "�j";
	mes "�����V�}�X";
	mes " ";
	mes "�����V�C�f�X�J�H";
	next;
	menu "�͂�",-,"����ς�~�߂�",L_CANCEL;
	if(countitem('@item['@trade])<'@amount['@trade]){
		mes "[�A�J�f�~�[�{�b�N�X]";
		mes "�K�K�s�[�c�c�@�K�K�b�c";
		mes " ";
		mes "���� �j �K�v �i";
		mes "�A�C�e�� �K �����}�Z��";
		mes " ";
		mes "�m�F�V�e�J���䗘�p�N�_�T�C";
		close;
	}
	if(!checkweight('@potid['@num],'@amount2['@trade])){
		mes "[�A�J�f�~�[�{�b�N�X]";
		mes "�K�K�s�[�c�c�@�K�K�b�c";
		mes " ";
		mes "�d�� �K ���߃V�e�C�����E�f�X";
		mes " ";
		mes "�A�C�e�� �� �a�P���J �̃e���i�h";
		mes "�����V�e�J���䗘�p�N�_�T�C";
		close;
	}
	delitem '@item['@trade],'@amount['@trade];
	getitem '@potid['@num],'@amount2['@trade];
	mes "[�A�J�f�~�[�{�b�N�X]";
	mes "�s�s�s�b�c�s�[�b�I";
	mes " ";
	mes "�i�R�����A�R�����j";
	mes " ";
	mes "�䗘�p�A���K�g�E�S�U�C�}�V�^";
	mes "�� �m �䗘�p�I�҃`�V�e�I���}�X";
	close;
L_TENSOU:
	mes "[�A�J�f�~�[�{�b�N�X]";
	mes "�]���G�l���M�[ �j";
	mes "�[���s�[ 2 �� �K �K�v�f�X";
	mes "�G�l���M�[ �� �[�d�X���� �f";
	mes "�A�J�f�~�[����� �� �]���f�L�}�X";
	mes " ";
	mes "���p�V�}�X�J�H";
	next;
	menu "�͂�",-,"����ς�~�߂�",L_CANCEL;
	if(countitem(909)<2){
		mes "[�A�J�f�~�[�{�b�N�X]";
		mes "�K�K�s�[�c�c�@�K�K�b�c";
		mes " ";
		mes "�[���s�[ �K �s���V�e�C�� �J";
		mes "�A�C�e�� �m ��� �K ��E���E�f�X";
		mes " ";
		mes "�A�J�f�~�[�]�� �� ���~�V�}�V�^";
		close;
	}
	mes "[�A�J�f�~�[�{�b�N�X]";
	mes "�\���f�n �]���V�}�X";
	close2;
	delitem 909,2;
	warp "ac_cl_area.gat",53,181;
	end;
L_HOWTO:
	mes "�]�A�J�f�~�[�{�b�N�X�𗘗p����ׂɁA";
	mes "�e�������X�g�ɑΉ������A�C�e����";
	mes "�K�v���p�ӂ���K�v������܂�";
	mes "�܂��A�|������t�@�u����|�����Ƃ�";
	mes "�@�\��̌����邱�Ƃ��ł���ł��傤";
	mes " ";
	mes "�ƁA������ɂ͏����Ă������]";
	close;
L_CANCEL:
	mes "�]�A�J�f�~�[�{�b�N�X��";
	mes "����𒆎~�����]";
	close;
}
//���K���i�C�݁j
ac_prac_01.gat,236,56,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_01.gat,52,35,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_01.gat,141,125,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_01.gat,317,174,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_01.gat,354,40,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888

//���K���i���j
ac_prac_02.gat,111,58,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_02.gat,171,126,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_02.gat,56,145,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888

//���K���i�����j
ac_prac_03.gat,42,306,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_03.gat,137,41,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_03.gat,26,85,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_03.gat,114,174,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888

//���K���i�Y�z�j
ac_prac_04.gat,279,279,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_04.gat,223,88,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_04.gat,145,177,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_04.gat,19,119,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_04.gat,49,269,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_04.gat,116,27,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888

//���K���i�����j
ac_prac_05.gat,154,323,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_05.gat,223,288,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_05.gat,357,247,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_05.gat,225,204,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_05.gat,117,168,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_prac_05.gat,256,103,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888

//���ʎ��i�΁j
ac_spec_01.gat,265,52,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_01.gat,310,277,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_01.gat,240,333,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_01.gat,134,144,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_01.gat,128,236,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_01.gat,236,117,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888

//���ʎ��i�p�Ёj
ac_spec_02.gat,140,68,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_02.gat,180,40,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_02.gat,180,147,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_02.gat,69,178,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_02.gat,38,155,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_02.gat,70,76,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_02.gat,29,38,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_02.gat,123,133,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888

//���ʎ��i�n�����j
ac_spec_03.gat,140,163,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_03.gat,207,46,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_03.gat,251,81,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_03.gat,282,280,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_03.gat,73,216,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_03.gat,9,216,4		duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
ac_spec_03.gat,194,184,4	duplicate(�A�J�f�~�[�{�b�N�X#func)	�A�J�f�~�[�{�b�N�X	888
