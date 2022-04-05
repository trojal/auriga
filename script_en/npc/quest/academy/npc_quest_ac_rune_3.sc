//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ���[���̈˗�
//
//                                                 by Pneuma
//�����̂���`�� / �_���W�����~�o  ---------------------------
//
//	AC_QUEST_LV_3
//	0 �����̂���`���P
//	1 �_���W�����~�o�P
//	2 �����̂���`���Q
//	3 �_���W�����~�o�Q
//	4 �����̂���`���R
//	5 �_���W�����~�o�R
//	6 �����̂���`���S
//	7 �_���W�����~�o�S
//	8 �����̂���`���T

hu_in01.gat,309,27,4	script	�^���V�[���m	923,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_3)goto L_OTHER;
	switch(AC_QUEST_LV_3){
	case 0:
		goto L_QUEST01;
	case 2:
		goto L_QUEST03;
	case 4:
		goto L_QUEST05;
	case 6:
		goto L_QUEST07;
	case 8:
		goto L_QUEST09;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST01:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[�^���V�[���m]";
		mes "���x�͂��܂�������������B";
		mes "������܂��āc�c";
		next;
		menu "����ɂ���",-;
		mes "[�^���V�[���m]";
		mes "�������}�������̂Ō��";
		mes "���Ă��ꂢ�[�B";
		next;
		menu "�˗����󂯂Ă����̂ł����B",-;
		emotion 0;
		mes "[�^���V�[���m]";
		mes "�Ȃ񂶂�ƁI";
		mes "���ʂ��������󂯂Ă����Ƃ����̂��I";
		mes "����[�A���S�Ȏ�҂���ȁI";
		next;
		mes "[�^���V�[���m]";
		mes "���ʂ��ɂ͌����ɗ��p����ޗ���";
		mes "�W�߂Ă��Ă��炢�����I";
		mes "�ڂ����́A�����l�ȏ���̃��C������";
		mes "�����̂���I";
		next;
		menu "�킩��܂���",-;
		mes "[�^���V�[���m]";
		mes "���ʂ��I";
		mes "������Ƒ҂̂���I";
		next;
		if(Sex){
			menu "�ǂ����܂������H",-;
			emotion 36;
			mes "[�^���V�[���m]";
			mes "������A����̃��C����";
			mes "���l���������";
			mes "�n�����`�Ȃ��Ƃ�������";
			mes "��邳�񂼂��I";
			mes "�킩�����ȁH";
			next;
		}
		else {
			menu "�ǂ������܂������H",-;
			mes "[�^���V�[���m]";
			mes "���ʂ������X�̔��l����";
			mes "���C���ɂ͓G���ȁB";
			next;
		}
		menu "�́A�͂��c�c",-;
		mes "[�^���V�[���m]";
		mes "���ꂶ��";
		mes "��낵�����񂾂����I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���胉�C��^000000����Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�^���V�[���m]";
		mes "���V�͋}���ł��邩��ȁH";
		mes "��������̃��C������";
		mes "�ڍׂ𕷂��̂���I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���胉�C��^000000����Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close;
	case 3:
		mes "[�^���V�[���m]";
		mes "��҂�I";
		mes "��낵�����񂾂��I";
		close;
	case 4:
		emotion 0;
		mes "[�^���V�[���m]";
		mes "�����I";
		mes "����͂܂������A^FF0000�|���|����^000000!!";
		mes "�����A����������ցB";
		next;
		menu "�|���|������n��",-;
		mes "[�^���V�[���m]";
		mes "�����A��������I";
		mes "����ŏ�肭�����Ɨǂ��̂��Ⴊ�c�c";
		next;
		misceffect 32,"#AC_BOM";
		mes "�]���m���t�̂�^0000FF�|���|����^000000��";
		mes "�@���ꂽ�u�ԁA";
		mes "�@�t�̂��A�����n�߂�";
		mes "�@�{�R�{�R�{�R�]";
		next;
		misceffect 106,"#AC_BOM";
		percentheal -90,0;
		mes "[�^���V�[���m]";
		mes "���A�C�J���I";
		mes "�������邼�[�[�[!!";
		next;
		mes "[�^���V�[���m]";
		mes "�c�c";
		mes "�N�A�����Ă��邩�c�c�H";
		next;
		menu "�ȁA���Ƃ��c�c",-;
		mes "[�^���V�[���m]";
		mes "�Ӂ[�c�c";
		mes "����Ă��܂����킢�c�c";
		mes "^FF0000�|���|����^000000�̐����Ȃ�";
		mes "������Ǝv�����񂶂Ⴊ�ȁB";
		mes "���s����킢�B";
		next;
		mes "[�^���V�[���m]";
		mes "�Ƃ肠�����A�˗����e�͂����";
		mes "�I��肶��c�c";
		if('@novice){
			mes "���������΁A���ʂ��͖`���҂��������";
			mes "�������낤�B";
			mes "�̃��V���g���Ă�����Ȃ񂾂�";
			mes "���ɗ����������B";
			next;
			// 2220 �n�b�g 1��
			if(!checkweight(2220,1)){
				mes "�d�ʃI�[�o�[�I";
				close;
			}
			getitem 2220,1;
		}
		else next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�^���V�[���m]";
		mes "�Ƃ肠�����A�˗����e�͂����";
		mes "�I��肶��c�c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	}
L_QUEST03:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[�^���V�[���m]";
		mes "��������Ƃ����Ȃ��āc�c";
		mes "����͂�A����c�c";
		next;
		menu "����ɂ���",-;
		mes "[�^���V�[���m]";
		mes "�����I";
		mes "���ʂ��́A���̑O��`���Ă��ꂽ�I";
		mes "�c�c";
		mes "�Ȃ񂶂�������H";
		next;
		menu "�����",-;
		emotion 0;
		mes "[�^���V�[���m]";
		mes "�I";
		mes "�����������";
		mes "������������I";
		mes "��������ʂ���������";
		mes "��`���Ă����Ƃ������Ƃ���ȁH";
		next;
		menu "����",-;
		mes "[�^���V�[���m]";
		mes "���΂炵���I";
		mes "�ŋ߂̎�҂ɂ��Ă͒������I";
		mes "�����˗����e�Ȃ񂶂Ⴊ";
		mes "��ɂ����^FF0000���C��^000000����";
		mes "�����Ă��ꂽ�܂��I";
		next;
		menu "�킩��܂���",-;
		mes "[�^���V�[���m]";
		mes "���ꂶ��";
		mes "��낵�����񂾂����I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "���胉�C������Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�^���V�[���m]";
		mes strcharinfo(0)+"�I";
		mes "���܂Ȃ������V�͋}���ł���̂���B";
		mes "���C���ɓ��e�������Ă��ꂢ�B";
		next;
		mes "^FF0000�y�~�b�V�����z";
		mes "���胉�C��^000000����Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close;
	case 3:
		mes "�]�����ɏW�����Ă���̂�";
		mes "�@������ɋC�Â��Ȃ��悤���]";
		close;
	case 4:
		mes "[�^���V�[���m]";
		mes strcharinfo(0);
		mes "����Ȃ����B";
		mes "���C���͖{���ɔ��l����B";
		mes "���ʂ������������������H";
		next;
		menu "�����ł���",-;
		emotion 33;
		mes "[�^���V�[���m]";
		mes "���������A���������H";
		mes "���̎����̏���Ȃ񂶂��I";
		mes "����ɂ��Ă��A���ʂ��ɉ���";
		mes "���񂾋C�������񂶂Ⴊ�c�c";
		mes "�Ȃ񂶂�������ȁH";
		next;
		menu "���C���C�����c�c",-;
		mes "[�^���V�[���m]";
		mes "�����I";
		mes "�����������!!!";
		mes "���̉t�̂�^FF0000���C���C��^000000������̂���I";
		mes "�����A���ʂ�������Ă悢���I";
		next;
		menu "��!? �����ł����c�c",-;
		misceffect 99,"#AC_BOM";
		sc_start3 SC_Blind,1,0,0,0,15000,0x8;
		mes "�]���C���C�����t�̂ɓ���������";
		mes "�@�t�̂��琦�܂��������������ꂽ�]";
		next;
		mes "[�^���V�[���m]";
		mes "�c�c";
		mes "�c�c�c�c";
		mes "�܂��A����Ȃ��Ƃ�����I";
		mes "��͂�|���|�����̂ق���";
		mes "�悩�����̂��́c�c";
		next;
		mes "[�^���V�[���m]";
		mes "�d���Ȃ��A";
		mes "�܂����̍ޗ���T���Ƃ��悤�B";
		mes "������������܂����ނ킢�B";
		if('@novice){
			mes "���ƁA����������Ƃꂢ�B";
			next;
			// 1247 �L���h�����O�_�K�[ 1��
			if(!checkweight(1247,1)){
				mes "�d�ʃI�[�o�[�I";
				close;
			}
			getitem 1247,1;
		}
		else next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�^���V�[���m]";
		mes "�d���Ȃ��A";
		mes "�܂����̍ޗ���T���Ƃ��悤�B";
		mes "������������܂����ނ킢�B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST05:
	switch(AC_QUEST_ST_3) {
	case 1:
		emotion 7;
		mes "[�^���V�[���m]";
		mes "���C���ւ̃v���[���g��";
		mes "�ǂ�������悢�̂���낤���B";
		mes "���S�͖{���ɂ킩��񂩂�̂��c�c";
		next;
		menu "�Ȃɂ���������ł����H",-;
		emotion 0;
		mes "[�^���V�[���m]";
		mes "�����I";
		mes strcharinfo(0);
		mes "����Ȃ����I";
		mes "���ʂ��͋C�ɂ��Ȃ��Ă��ǂ��̂���B";
		mes "������A����������̎�`����";
		mes "���Ă����񂶂��H";
		next;
		menu "����",-;
		mes "[�^���V�[���m]";
		mes "���̑O�̎�����";
		mes "�킩�������Ƃ������I";
		mes "���͏��F����������B";
		mes "����̓L�m�R�Ȃ񂶂��B";
		mes "�L�m�R��������Ό����͐�������";
		mes "���V�͂����l���Ă���I";
		next;
		menu "����Ƃ��֌W�Ȃ��悤�ȁc�c",-;
		mes "[�^���V�[���m]";
		mes "����Ȃ񂶂�掞��B";
		mes "����͏d�v�����H";
		mes "���s�ɏ��x��Ă̓C�J���I";
		next;
		menu "�́A�͂�",-;
		mes "[�^���V�[���m]";
		mes "���ꂶ��";
		mes "�ڍׂ����C���ɕ����Ă���I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���胉�C��^000000����Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�^���V�[���m]";
		mes strcharinfo(0)+"�I";
		mes "���܂Ȃ������V�͋}���ł���̂���B";
		mes "���C���ɓ��e�������Ă��ꂢ�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���胉�C��^000000����Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close;
	case 3:
		mes "�]�����ɏW�����Ă���̂�";
		mes "�@������ɋC�Â��Ȃ��悤���]";
		close;
	case 4:
		emotion 7;
		mes "[�^���V�[���m]";
		mes "�����I";
		mes "�܂��Ă������I";
		mes "�L�m�R�Ȃ�ΐ�������͂�����I";
		next;
		mes "[�^���V�[���m]";
		mes "���������ŁA���������������I";
		mes "��������΁A���V���c�c";
		mes "���t�t�t";
		next;
		menu "�ǂ�Ȗ������Ă����ł����H",-;
		mes "[�^���V�[���m]";
		mes "����́A��Ɣ閧�Ƃ��������ȁI";
		mes "������킯�ɂ͂�����I";
		mes "�����葁���A�L�m�R��";
		mes "���̉t�̂ɓ���Ă݂邼���I";
		next;
		misceffect 109,"#AC_BOM";
		mes "�]�����ςȃL�m�R���t�̂�";
		mes "�@�������ꂽ�B";
		mes "�@����������������Ȃ������]";
		next;
		mes "[�^���V�[���m]";
		mes "�c�c";
		mes "�c�c�c�c";
		mes "��[�A�ǂ���玸�s�̂悤����c�c";
		mes "�������A���������a����";
		mes "�Ⴄ���ʂ̖�ɂȂ��Ă��邱�Ƃ�";
		mes "�\���ɍl������B";
		next;
		mes "[�^���V�[���m]";
		mes "�Ƃ����킯�ł���I";
		mes "���ʂ��A���߂��ɂ̂�ł݂��I";
		next;
		menu "�������Ă����܂��c�c",-;
		mes "[�^���V�[���m]";
		mes "�ׂ��׌�����";
		mes "�������܂񂩂��I";
		next;
		misceffect 7,"";
		percentheal 100,100;
		mes "[�^���V�[���m]";
		mes "�ǂ�����H";
		mes "�����N���������H";
		next;
		menu "���C�ɂȂ����������܂�",-;
		mes "[�^���V�[���m]";
		mes "���������H";
		mes "���V�����X�C�Â��Ƃ����񂶂��B";
		mes "�������A�̐S�̌����͂܂���";
		mes "���s�Ƃ́c�c";
		mes "�L�m�R�̎�ނ���邩�����񂩂�";
		mes "����Ȃ����c�c";
		next;
		mes "[�^���V�[���m]";
		mes "�Ƃ肠�����́A";
		mes "����ň˗��͂���肶��B";
		mes "�܂��������������낵��";
		mes "���̂ނ����B";
		if('@novice){
			mes "���ƁA����������Ƃꂢ�B";
			next;
			// �C�O�h���V���̗t 3��
			if(!checkweight(610,3)){
				mes "�d�ʃI�[�o�[�I";
				close;
			}
			getitem 610,3;
		}
		else next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�^���V�[���m]";
		mes "�Ƃ肠�����́A";
		mes "����ň˗��͂���肶��B";
		mes "�܂��������������낵��";
		mes "���̂ނ����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST07:
	switch(AC_QUEST_ST_3) {
	case 1:
		emotion 0;
		mes "[�^���V�[���m]";
		mes strcharinfo(0)+"�I";
		mes "�܂��Ă��������I";
		mes "����������A���V�̘b�𕷂��Ă���I";
		mes "������V�̒a�����������񂶂Ⴊ�A";
		mes "�Ȃ�ƁA���C�����v���[���g��";
		mes "���ꂽ�񂶂��I";
		next;
		menu "�ǂ������ł���",-;
		mes "[�^���V�[���m]";
		mes "�����H";
		mes "�����ƃ��C���̓��V�̂��Ƃ�";
		mes "�D���Ȃ񂶂��B";
		mes "������v���[���g�����Ă��ꂽ��";
		mes "�Ⴂ�Ȃ��B";
		mes "�����v��񂩁H";
		next;
		menu "�ǂ��ł��傤���H",-;
		mes "[�^���V�[���m]";
		mes "����A�����Ɍ��܂��Ă���I";
		mes "���������V�A�p�������Ȃ���";
		mes "�����Ƃ��t��������";
		mes "�������Ƃ��Ȃ�����ȁB";
		mes "���̂��߂Ɍ���������������";
		mes "�K�v������񂶂�I";
		next;
		mes "[�^���V�[���m]";
		mes "�Ƃ������Ƃł���I";
		mes "������A�����ޗ��̎��W��";
		mes "�˗��������̂���I";
		mes "�ڂ����̓��C�����畷���̂����H";
		next;
		menu "�킩��܂���",-;
		mes "[�^���V�[���m]";
		mes "���ꂶ��";
		mes "��낵�����񂾂����I";
		mes "���������A�������b�������Ƃ�";
		mes "���C���ɕ������肵�Ă�";
		mes "�����񂼁H";
		mes "�p���������点�Ă��܂�����ȁB";
		next;
	L_REP4_1:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���胉�C��^000000����Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�^���V�[���m]";
		mes strcharinfo(0)+"�I";
		mes "���܂Ȃ������V�͋}���ł���̂���B";
		mes "���C���ɓ��e�������Ă��ꂢ�B";
		next;
		goto L_REP4_1;
	case 3:
		mes "�]�����ɏW�����Ă���̂�";
		mes "�@������ɋC�Â��Ȃ��悤���]";
		close;
	case 4:
		mes "[�^���V�[���m]";
		mes "�����I";
		mes "���ɂ��Ɋ�������ȁB";
		mes "����Ŋ�������ɈႢ�Ȃ��B";
		mes "�����A������������ɂ悱���̂���B";
		next;
		menu "���₵���L�m�R��n��",-;
		mes "[�^���V�[���m]";
		mes "�����A���I�̈�u����I";
		next;
		misceffect 70,"#AC_BOM";
		mes "�]���m���t�̂ɂ��₵���L�m�R��";
		mes "�@���荞�񂾁B";
		mes "�@����Ɖt�̂����₵���F�ɂȂ�";
		mes "�@�A�����n�߂��]";
		next;
		misceffect 106,"#AC_BOM";
		mes "[�^���V�[���m]";
		mes "������������!!!!!!!";
		mes "�Ύ�����[�[�[�[�[�I";
		mes "���������̂���!!!!!";
		mes "�A�`�`�`�`";
		next;
		menu "�ǂ�����āc�c",-;
		mes "[���C��]";
		mes "����A��ρI";
		mes "�����ɏ����Ȃ��Ă͂��߂ł��ˁB";
		mes "2�l�Ƃ�������Ɖ������Ă���";
		mes "���������ˁB";
		next;
		misceffect 89,"#AC_BOM";
		sc_start2 SC_Freeze,5000,1,10000;
		percentheal -99,0;
		mes "[���C��]";
		mes "�X�g�[���K�X�g�I";
		next;
		mes "[���C��]";
		mes "�c�c";
		mes "����c�c���߂�Ȃ����B";
		mes "������肷���Ă��܂�����c�c";
		mes "���m�A";
		mes strcharinfo(0) + "����";
		mes "���C�ł����H";
		next;
		menu "�ȁA�Ȃ�Ƃ��c�c",-;
		mes "[�^���V�[���m]";
		mes "���C���ᕽ�C����I";
		mes "���C���̈��������������I";
		mes strcharinfo(0) + "��";
		mes "�S�z�Ȃ��B";
		mes "�Ȃ����Ȃ������I";
		mes "�Ⴂ�񂶂Ⴉ��ȁI";
		next;
		mes "[�^���V�[���m]";
		mes "�ނށA����ɂ��Ă�";
		mes "���̃L�m�R�ł��_���Ƃ�����";
		mes "���ɉ��������΂悢�̂��c�c";
		mes "��͂葐�̂ق����ǂ��̂���낤���H";
		mes "�ӂށc�c";
		next;
		menu "���́c�c",-;
		if('@novice){
			mes "[�^���V�[���m]";
			mes "���܂�A���܂�B";
			mes "�Y��Ă������킢�B";
			mes "����̕�V�͂��ꂶ��";
			mes "�����Ƃꂢ�B";
			next;
			// 579 ���������� 50��
			if(!checkweight(579,50)){
				mes "�d�ʃI�[�o�[�I";
				close;
			}
			getitem 579,50;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�^���V�[���m]";
		mes "�ނށA����ɂ��Ă�";
		mes "���̃L�m�R�ł��_���Ƃ�����";
		mes "���ɉ��������΂悢�̂��c�c";
		mes "��͂葐�̂ق����ǂ��̂���낤���H";
		mes "�ӂށc�c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST09:
	switch(AC_QUEST_ST_3) {
	case 1:
		emotion 19;
		mes "[�^���V�[���m]";
		mes "�m�[�[�[�[�b";
		mes "�F�X�Ƃ�΂������B";
		mes "�ǂ�����΂悢�񂶂�I";
		mes "�悢�񂶂�[�[�[�[�[���I";
		next;
		menu "�ǂ�������ł����H",-;
		mes strcharinfo(0) + "!!!";
		mes "�c�c";
		mes "���ʂ��ɂȂ�b���Ă��悢����낤�c�c";
		mes "�����Ȑ��Ō�������";
		mes "�S���ĕ����񂶂Ⴜ�B";
		next;
		emotion 19;
		mes "[�^���V�[���m]";
		mes "�Ȃ�Ɓc�c";
		mes "������C���ƌ��m��ʒj��";
		mes "�����Ă���̂�";
		mes "�ڌ����Ă��܂����̂���c�c";
		mes "�ǂ�Ȋ֌W�Ȃ񂶂�낤���c�c";
		next;
		menu "�{�l�ɕ����Ă݂�΂悢�̂ł́H",-;
		emotion 36;
		mes "[�^���V�[���m]";
		mes "�o�J�����I";
		mes "����Ȃ��Ƃ𕷂���킯���������B";
		mes "���ށ[�A���������̂܂܂ł́c�c";
		mes "���̂̒m��Ȃ��j��";
		mes "���Ԃ炩����Ă��܂��\��������B";
		mes "�ꍏ������������������Ȃ��ẮB";
		next;
		mes "[�^���V�[���m]";
		mes "�Ƃ����킯�ŁA�}���Ō����ޗ���";
		mes "�̂��Ă��Ăق����̂���I";
		mes "���x�͂܂������Ȃ������B";
		mes "��΂���I";
		mes "�F�X���ׂ����ʉ����K�v����";
		mes "�킩�����񂶂��I";
		next;
		mes "[�^���V�[���m]";
		mes "�ڂ�����^FF0000���C��^000000���畷���̂���B";
		next;
		L_REP9_1:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^FF0000���胉�C��^000000����Ɉ˗���";
		mes "�ڍד��e�𕷂��B";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�^���V�[���m]";
		mes strcharinfo(0) + " �I";
		mes "���܂Ȃ������V���}���ł���̂���B";
		mes "���C���ɓ��e�������Ă��ꂢ�B";
		next;
		goto L_REP9_1;
	case 3:
		mes "�]�����ɏW�����Ă���̂�";
		mes "�@������ɋC�Â��Ȃ��悤���]";
		close;
	case 4:
		emotion 0;
		mes "[�^���V�[���m]";
		mes "�����I";
		mes "���ɂ���I";
		mes "���ɂ��̎��������B";
		mes "�����A�����悱���̂���I";
		next;
		menu "�~���~������n��",-;
		mes "[�^���V�[���m]";
		mes "�悵�A�܂��̓~���~���������邼���B";
		next;
		misceffect 94,"#AC_BOM";
		mes "�]���m���t�̂�";
		mes "�@�~���~��������ꂽ�u�ԁA";
		mes "�@�t�̂����͂��߂��]";
		next;
		mes "[�^���V�[���m]";
		mes "�悵���I";
		mes "��������I";
		mes "���������!!!!";
		next;
		mes "[���C��]";
		mes "���m���߂łƂ��������܂��I";
		next;
		mes "[�^���V�[���m]";
		mes "���C�����肪�Ƃ��B";
		mes "�����܂Œ��������c�c";
		next;
		mes "[���C��]";
		mes "�Ƃ���ŁA���m�c�c";
		mes "���̖�́A���̖�Ȃ̂ł����H";
		next;
		menu "�����C�ɂȂ��Ă��܂����B",-;
		emotion 29;
		mes "[�^���V�[���m]";
		mes "�t�t�t�b";
		mes "�����Ă�郏�C�B";
		mes "����͂̂��c�c";
		mes "�Ȃ�ƁA�Ȃ�������ƁI";
		mes "�����̐S���ǂ߂��Ȃ񂶂�I";
		next;
		menu "�����b!?",-;
		emotion 23,"���C��#AC";
		emotion 23,"";
		mes "[�^���V�[���m]";
		mes "�����A�����Ă��̔��������";
		mes "���߂΁I";
		mes "���C���̐S����Ɏ��悤�ɂ킩��";
		mes "�͂��Ȃ̂���I";
		next;
		mes "�]���m�͂��΂₢�����ŁA";
		mes "�@�t�̂Ƀ��C���̔��̖т�����";
		mes "�@��������݊������]";
		next;
		mes "[�^���V�[���m]";
		mes "�t�n�n�n�n�B";
		mes "�����A���C���S�����炯�o���̂���I";
		mes "���炯�o���̂���[�[�[�[�I";
		next;
		mes "[�^���V�[���m]";
		mes "�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�^���V�[���m]";
		mes "�Ȃ��A�Ȃ񂶂��!?";
		mes "�S���ǂ߂Ȃ�!?";
		mes "�ǂ��������ƂȂ񂶂�B";
		mes "���V�̌����͊����Ȃ͂��c�c";
		next;
		mes "[�^���V�[���m]";
		mes "�c�c";
		mes "�c�c�c�c";
		mes "���͂ł��ˁc�c";
		mes "���A���́c�c�c�c";
		next;
		mes "�]���C���͎����̃J�o������";
		mes "�@�J�v�Z���̂悤�Ȃ��̂����o��";
		mes "�@���ݍ��񂾁]";
		next;
		emotion 23;
		emotion 23,"";
		donpcevent "#AC_BOM::OnEvent";
		mes "[���C��]";
		mes "�j�Ȃ�ł��c�c";
		mes "���͕ϐg�̖�Ƃ����̂�";
		mes "�ȑO���܂��āc�c";
		next;
		mes "[�^���V�[���m]";
		mes "�M���[�[�[�[�b";
		mes "�c�c�c�c";
		next;
		mes "�]�^���V�[���m��";
		mes "�@���тȂ��狩�񂾌�";
		mes "�@�C�₵�Ă��܂����悤���c�c�]";
		next;
		mes "[���C��]";
		mes "�����c�c";
		mes "�C�₵�Ă��܂��܂����ˁc�c";
		next;
		mes "[���C��]";
		mes "��͎������Ƃ����Ă����܂��B";
		mes "�{���ɐF�X���肪�Ƃ��������܂����B";
		if('@novice){
			mes "���ꂪ����̕�V�ɂȂ�܂��̂�";
			mes "�����Ƃ��Ă��������ˁB";
			next;
			switch(Job){
			//���m    �F�w����[0] 1��
			case Job_Swordman:
				set '@item,2228;
				break;
			//�V�[�t  �F�L���b�v[0] 1��
			case Job_Thief:
			//���l    �F�L���b�v[0] 1��
			case Job_Merchant:
			//�A�`��  �F�L���b�v[0] 1��
			case Job_Archer:
				set '@item,2226;
				break;
			//�A�R    �F�r���^[0] 1��
			case Job_Acolyte:
				set '@item,2216;
				break;
			//�}�W    �F�ۂ��ڂ���[0] 1��
			case Job_Magician:
			//�e�R��  �F�ۂ��ڂ���[0] 1��
			case Job_TaeKwon:
			//�E��    �F�ۂ��ڂ���[0] 1��
			case Job_Ninja:
			//�K���X���F�ۂ��ڂ���[0] 1��
			case Job_Gunslinger:
				set '@item,2222;
				break;
			//�m�r    �F�X�[�p�[�m�[�r�X�X[0] 1��
			//�X�p�m�r�F�X�[�p�[�m�[�r�X�X[0] 1��
			default:
				set '@item,5112;
				break;
			}
			if(!checkweight('@item,1)){
				mes "�d�ʃI�[�o�[�I";
				close;
			}
			getitem '@item,1;
		}
		else next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "�]�^���V�[���m�͋C�������Ă���]";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_CLEAR:
	mes "[�^���V�[���m]";
	mes strcharinfo(0) + "����Ȃ����I";
	mes "�F�X��`���Ă������";
	mes "�������������������B";
	mes "�܂������������炨�肢�������I";
	close;
L_OTHER:
	mes "[�^���V�[���m]";
	mes "��������Ƃ����Ȃ��āc�c";
	mes "����͂�A����c�c";
	close;
}
hu_in01.gat,305,27,4	script	���C��#AC	69,{
	set '@novice, callfunc("AC_GetNovice");
	switch(AC_QUEST_LV_3){
	case 0:
		goto L_QUEST01;
	case 2:
		goto L_QUEST03;
	case 4:
		goto L_QUEST05;
	case 6:
		goto L_QUEST07;
	case 8:
		goto L_QUEST09;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST01:
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[���C��]";
		mes "���m����b���f���Ă���܂��B";
		mes "�˗��̏ڍד��e�ł��ˁH";
		next;
		menu "��낵�����肢���܂�",-;
		mes "[���C��]";
		mes "�����A�����炱��";
		mes "���Z�����Ƃ���˗��������󂯂�";
		mes "�������Ă�������܂���B";
		next;
		mes "[���C��]";
		mes "�˗����e�Ȃ̂ł����A";
		mes "^0000FF�Q�t�F���t�B�[���h07(185 249)^000000";
		mes "�ɐ����Ă���";
		mes "^FF0000�|���|����^000000���̂��Ă���";
		mes "���������܂����H";
		next;
		//�{�I�ǂ���i���������j
		menu "�ǂ�ȑ��Ȃ�ł����H",-;
		mes "[���C��]";
		mes "���A���߂�Ȃ����B";
		mes "�|���|�����͂ł��ˁc�c";
		next;
		mes "�]���C������|���|������";
		mes "�@�������󂯂��]";
		next;
		mes "[���C��]";
		mes "���ꂶ�Ⴀ";
		mes "��낵�����肢���܂��ˁB";
		next;
		menu "�킩��܂���",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�Q�t�F���t�B�[���h07(185 249)^000000";
		mes "�ɐ����Ă���";
		mes "^FF0000�|���|����^000000���̂��Ă�����B";
		mes " ";
		mes "�]^0000FF�Q�t�F���t�B�[���h07^000000�ւ�";
		mes "�@�Q�t�F������s���Ƌ߂��]";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[���C��]";
		mes "�˗����e��Y��Ă��܂��܂������H";
		mes "�O�̂��߂�����x���b���܂��ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�Q�t�F���t�B�[���h07(185 249)^000000";
		mes "�ɐ����Ă���";
		mes "^FF0000�|���|����^000000���̂��Ă���B";
		mes " ";
		mes "�]^0000FF�Q�t�F���t�B�[���h07^000000�ւ�";
		mes "�@�Q�t�F������s���Ƌ߂��]";
		close;
	case 4:
		mes "[���C��]";
		mes "���I";
		mes "���A��Ȃ����B";
		mes "������^FF0000�|���|����^000000��";
		mes "��ɓ����ꂽ�悤�ł��ˁ[�B";
		mes "^FF0000�|���|����^000000�͔��m�ɓn����";
		mes "���������ˁB";
		close;
	case 99:
		mes "[���C��]";
		mes "�ǂ���猤���͎��s�̂悤�ł��ˁB";
		mes "���͐�������Ɨǂ��̂ł����ǁc�c";
		mes "�˗����󂯂Ă���������";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST03:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[���C��]";
		mes "����A";
		mes strcharinfo(0) + "����";
		mes "����ɂ��́B";
		close;
	case 2:
		mes "[���C��]";
		mes "�����";
		mes strcharinfo(0) + "����";
		mes "��`���Ă����̂ł��ˁB";
		next;
		mes "[���C��]";
		mes "�˗����e�Ȃ̂ł����A";
		mes "^0000FF�s���~�b�h�_���W����1F^000000�ɐ����Ă���";
		mes "^FF0000���C���C��^000000���̂��Ă���";
		mes "���������܂����H";
		mes "���C���C���́c�c";
		next;
		menu "�킩��܂���",-;
		mes "�]���C�����烉�C���C����";
		mes "�@�������󂯂��]";
		next;
		mes "[���C��]";
		mes "�s���~�b�h�_���W������";
		mes "�����N�̋߂��ɂ���܂��̂�";
		mes "�X�ɍs���΂킩��Ǝv���܂��B";
		mes "�ꉞ���������Ă����܂��ˁB";
		mes "����ł́A��낵�����肢���܂��B";
		next;
	L_REP3_3:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�s���~�b�h�_���W����1F(193,193)^000000";
		mes "�ɐ����Ă���";
		mes "^FF0000���C���C��^000000���̂��Ă���B";
		mes " ";
		mes "�]^0000FF�s���~�b�h�_���W����1F^000000�ւ�";
		mes "�@^0000FF�����N^000000����s���Ƌ߂��]";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[���C��]";
		mes "�˗����e��Y��Ă��܂��܂������H";
		mes "�O�̂��߂�����x���b���܂��ˁB";
		next;
		mes "[���C��]";
		mes "�˗����e�Ȃ̂ł����A";
		mes "^0000FF�s���~�b�h�_���W����1F^000000�ɐ����Ă���";
		mes "^FF0000���C���C��^000000���̂��Ă���";
		mes "���������܂����H";
		next;
		goto L_REP3_3;
	case 4:
		mes "[���C��]";
		mes "�������A";
		mes strcharinfo(0) + "����ł��ˁB";
		mes "������^FF0000���C���C��^000000����ɓ���܂������B";
		mes "����ł́A���m�ɓn���Ă��������ˁB";
		close;
	case 99:
		mes "[���C��]";
		mes "�ǂ���猤���͎��s�̂悤�ł��ˁB";
		mes "���͐�������Ɨǂ��̂ł����ǁc�c";
		mes "�˗����󂯂Ă���������";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST05:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[���C��]";
		mes "����A";
		mes strcharinfo(0) + "����";
		mes "����ɂ��́B";
		close;
	case 2:
		mes "[���C��]";
		mes strcharinfo(0)+"����";
		mes "�Ɏ�`���Ă���������������";
		mes "���m�͉����V����������";
		mes "�v�������݂����ł��B";
		mes "���x�͐������邩������܂���ˁI";
		next;
		mes "[���C��]";
		mes "���������A";
		mes "�˗����e�Ȃ̂ł����A";
		mes "^0000FF�t�F�C�����_���W����1F^000000�ɐ����Ă���";
		mes "^FF0000�����ςȃL�m�R^000000���̂��Ă���";
		mes "���������܂����H";
		mes "^FF0000�����ςȃL�m�R^000000�́c�c";
		next;
		menu "�킩��܂���",-;
		mes "�]���C�����獕���ςȃL�m�R��";
		mes "�������󂯂��]";
		next;
		mes "[���C��]";
		mes "�t�F�C�����_���W������";
		mes "�t�F�C�����̋߂��ɂ���܂��̂�";
		mes "�X�ɍs���΂킩��Ǝv���܂��B";
		mes "�ꉞ�����������Ă����܂��ˁB";
		mes "����ł́A��낵�����肢���܂��B";
		next;
	L_REP4_2:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�t�F�C�����_���W����1F^000000";
		mes "�ɐ����Ă���";
		mes "^FF0000�����ςȃL�m�R^000000���̂��Ă���B";
		mes " ";
		mes "�]^0000FF�t�F�C�����_���W����1F^000000�ւ�";
		mes "^0000FF�t�F�C����^000000����s���Ƌ߂��]";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[���C��]";
		mes "�˗����e��Y��Ă��܂��܂������H";
		mes "�O�̂��߂�����x���b���܂��ˁB";
		next;
		mes "[���C��]";
		mes "�˗����e�Ȃ̂ł����A";
		mes "^0000FF�t�F�C�����_���W����1F^000000�ɐ����Ă���";
		mes "^FF0000�����ςȃL�m�R^000000���̂��Ă���";
		mes "���������܂����H";
		next;
		goto L_REP4_2;
	case 4:
		mes "[���C��]";
		mes strcharinfo(0)+"����";
		mes "��������Ȃ����B";
		mes "������^FF0000�����ςȃL�m�R^000000�����";
		mes "���ꂽ�悤�ł��ˁB";
		mes "����ł́A���m�ɓn���Ă��������ˁB";
		close;
	case 99:
		mes "[���C��]";
		mes "�܂��A���s���Ă��܂����悤�Łc�c";
		mes "���������΁A����̎��ɂ�";
		mes "����̌������e��";
		mes "�����Ă���Ȃ��̂ł����B";
		mes "���������m�ł����H";
		next;
		menu "���A�����c�c",-;
		mes "[���C��]";
		mes "��͂�ł����c�c";
		mes "�����������Ă���̂�";
		mes "�����C�ɂȂ�܂��c�c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST07:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[���C��]";
		mes strcharinfo(0) + "����";
		mes "����ɂ��́B";
		mes "�������肪�Ƃ��������܂��B";
		close;
	case 2:
		mes "[���C��]";
		mes strcharinfo(0) + "����";
		mes "����ɂ��́B";
		mes "�����A�����ӗl�ł��ˁB";
		mes "�{���ɂ��������b�ɂȂ��Ă��܂��B";
		next;
		mes "[���C��]";
		mes "�������񂨊肢����";
		mes "���W�i�ɂ��Đ����������܂��ˁB";
		mes "���Ɓc�c";
		mes "����́A^0000FF�t�F�C���������̐X 02^000000��";
		mes "�����Ă���A^FF0000���₵���L�m�R^000000��";
		mes "�̂��Ă��Ă��������B";
		next;
		mes "�]���C�����炠�₵���L�m�R��";
		mes "�@�������󂯂��]";
		next;
		mes "[���C��]";
		mes "����ł́A";
		mes "�������낵�����肢���܂��ˁB";
		next;
	L_REP5_2:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�t�F�C���������̐X 02(49,126)^000000";
		mes "�ɐ����Ă���A";
		mes "^FF0000���₵���L�m�R^000000���̂��Ă���B";
		mes "�]^0000FF�t�F�C���������̐X 02^000000�ւ�";
		mes "�@�t�F�C��������s���Ƌ߂��]";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[���C��]";
		mes "�˗����e��Y��Ă��܂��܂������H";
		mes "�O�̂��߂�����x���b���܂��ˁB";
		next;
		mes "[���C��]";
		mes "����́A^0000FF�t�F�C���������̐X 02^000000��";
		mes "�����Ă���A^FF0000���₵���L�m�R^000000��";
		mes "�̂��Ă��Ă��������ˁB";
		mes "^0000FF�t�F�C���������̐X 02^000000�ɂ�";
		mes "^0000FF�t�F�C����^000000����s���Ƃ悢�ł���B";
		mes "����ł͂�낵�����肢���܂��B";
		next;
		goto L_REP5_2;
	case 4:
		mes "[���C��]";
		mes "�������A";
		mes strcharinfo(0) + "����ł��ˁB";
		mes "������^FF0000���₵���L�m�R^000000��";
		mes "��ɓ���܂������B";
		mes "����ł́A���m�ɓn���Ă��������ˁB";
		close;
	case 99:
		mes "[���C��]";
		mes strcharinfo(0) + "����";
		mes "��قǂ͖{���ɐ\����";
		mes "����܂���ł����c�c";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�C�ɂ��Ȃ��ł��������B";
		mes "����������m�Ƀv���[���g��";
		mes "�������Ƃ��H";
		next;
		mes "[���C��]";
		mes "�����A";
		mes "���i�����b�ɂȂ��Ă��܂�����";
		mes "���a�����v���[���g���炢��";
		mes "�����グ�Ȃ��Ƃ����܂��񂵂ˁB";
		next;
		menu "�Ȃ�قǁI",-;
		mes "[���C��]";
		mes "�ӂӂӂ��B";
		mes "���ꂶ��A�܂���������܂�����";
		mes "��낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST09:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[���C��]";
		mes strcharinfo(0) + "����";
		mes "����ɂ��́B";
		mes "�������m���r��Ă����ł�";
		mes "�ǂ�������ł��傤���c�c";
		close;
	case 2:
		mes "[���C��]";
		mes "���ς�炸���m�͍r��Ă��܂��ˁc�c";
		mes "��̂ǂ�������ł��傤���c�c";
		next;
		mes "[���C��]";
		mes "�ł��A����̍ޗ��͔��m";
		mes "���Ȃ莩�M������݂����Ȃ�ł���B";
		mes "�ł��A�������邩������Ȃ��Ƃ����̂�";
		mes "������Ƃ���������ł��B";
		mes "�ł��Ă���Ƃ�����";
		mes "����Ȋ����ł��ˁc�c";
		next;
		mes "[���C��]";
		mes "���ƁA���W���Ă��������ޗ��Ȃ̂ł���";
		mes "��ڂ́A^0000FF�v�����e���n�����H3F^000000��";
		mes "�����Ă���^FF0000�~���~����^000000�ŁA";
		mes "������́c�c";
		mes "^FF0000���̔��̖�^000000!?";
		next;
		mes "[���C��]";
		mes "��[�A���̔��̖т�";
		mes "�����Ă���͉̂��łł��傤���c�c";
		next;
		mes "[���C��]";
		mes "�Ƃ肠�������̖т͎������ڔ��m��";
		mes "�n���Ă����܂��̂ŁA";
		mes strcharinfo(0) + "����́A";
		mes "������̍ޗ����̂��ė���";
		mes "���������܂����H";
		next;
		mes "[���C��]";
		mes "���ƁA^0000FF�v�����e���n�����H3F^000000��";
		mes "�����Ă���^FF0000�~���~����^000000�ł��ˁB";
		mes "����ł͂�낵�����肢���܂��B";
		next;
	L_REP9_2:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�v�����e���n�����H3F�i184,17�j";
		mes "�ɐ����Ă���^FF0000�~���~����^000000���̂��Ă���B";
		mes " ";
		mes "�]^0000FF�v�����e���n�����H3F^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���Ƌ߂��]";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[���C��]";
		mes "�˗����e��Y��Ă��܂��܂������H";
		mes "�O�̂��߂ɂ�����x���b���܂��ˁB";
		next;
		mes "[���C��]";
		mes "�˗����e�Ȃ̂ł����A";
		mes "^0000FF�v�����e���n�����H3F^000000��";
		mes "�����Ă���^FF0000�~���~����^000000��";
		mes "�̂��Ă��Ă��������B";
		next;
		goto L_REP9_2;
	case 4:
		mes "[���C��]";
		mes strcharinfo(0) + "����B";
		mes "���A��Ȃ����B";
		mes "���̖т͎�����قǓn���Ă����܂����B";
		mes "^FF0000�~���~����^000000�𔎎m�ɓn���Ă��������ˁB";
		close;
	case 99:
		mes "[���C��]";
		mes "�F�X����`������������";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		mes "���m���N������A";
		mes "�����������Ă����܂�����";
		mes "���S���Ă��������ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_CLEAR:
	mes "[���C��]";
	mes strcharinfo(0) + "����";
	mes "�F�X�Ƃ��肪�Ƃ��������܂����I";
	next;
	mes "[���C��]";
	mes "���m�A�����ϐg���Ă��邱��";
	mes "�o���Ă��Ȃ��݂����ł��B";
	mes "�ł��̂ŁA���̂܂ܔ閧�ɂ��Ă���";
	mes "���Ƃɂ��܂��ˁB";
	close;
L_OTHER:
	mes "[���C��]";
	mes "����A����ɂ��́B";
	close;
}
hu_in01.gat,308,27,4	script	#AC_BOM	139,{
OnEvent:
	disablenpc "���C��#AC";
	enablenpc "���C��#AC2";
	misceffect 744,"���C��#AC2";
	misceffect 30,"���C��#AC2";
	misceffect 72,"���C��#AC2";
	sleep 5000;
	disablenpc "���C��#AC2";
	enablenpc "���C��#AC";
}
hu_in01.gat,305,27,4	script	���C��#AC2	740,{
OnInit:
	disablenpc;
}
gef_fild07.gat,179,242,4	script	#AC_POMPOM	1083,{
}
gef_fild07.gat,179,241,4	script	�|���|����#AC	111,{
	if(AC_QUEST_LV_3!=0 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "���̑��ŊԈႢ�Ȃ��������B";
	next;
	mes "�]�|���|���������ɓ��ꂽ�]";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000�|���|����^000000��";
	mes "�͂���B";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "�]���������Ă���]";
	if(AC_QUEST_LV_3!=0 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000�|���|����^000000��";
	mes "�͂���B";
	close;
}
moc_pryd01.gat,193,193,0	script	#AC_RAIRAI	1081,{
}
moc_pryd01.gat,193,192,0	script	���C���C��#AC	111,{
	if(AC_QUEST_LV_3!=2 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "���̑��ŊԈႢ�Ȃ��������B";
	next;
	mes "�]^FF0000���C���C��^000000�����ɓ��ꂽ�]";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000���C���C��^000000��";
	mes "�͂���B";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "�]���������Ă���]";
	if(AC_QUEST_LV_3!=2 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000���C���C��^000000��";
	mes "�͂���B";
	close;
}
pay_dun00.gat,154,172,0	script	#AC_KINOKO1	1084,{
}
pay_dun00.gat,154,171,0	script	�����ςȃL�m�R#AC	111,{
	if(AC_QUEST_LV_3!=4 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "���̃L�m�R�ŊԈႢ�Ȃ��������B";
	next;
	mes "�]^FF0000�����ςȃL�m�R^000000�����ɓ��ꂽ�]";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000�����ςȃL�m�R^000000��";
	mes "�͂���B";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "�]�L�m�R�������Ă���]";
	if(AC_QUEST_LV_3!=4 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000�����ςȃL�m�R^000000��";
	mes "�͂���B";
	close;
}
pay_fild02.gat,52,125,0	script	#AC_KINOKO2	1085,{
}
pay_fild02.gat,52,124,0	script	���₵���L�m�R#AC	111,{
	if(AC_QUEST_LV_3!=6 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "���̑��ŊԈႢ�Ȃ��������B";
	next;
	mes "�]^FF0000���₵���L�m�R^000000�����ɓ��ꂽ�]";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000���₵���L�m�R^000000��";
	mes "�͂���B";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "�]�L�m�R�������Ă���]";
	if(AC_QUEST_LV_3!=6 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000���₵���L�m�R^000000��";
	mes "�͂���B";
	close;
}
prt_sewb3.gat,184,17,0	script	#AC_MINMIN	1080,{
}
prt_sewb3.gat,184,16,0	script	�~���~����#AC	111,{
	if(AC_QUEST_LV_3!=8 || AC_QUEST_ST_3!=3) goto L_OTHER;
	mes "[" + strcharinfo(0) + "]";
	mes "���̑��ŊԈႢ�Ȃ��������B";
	next;
	mes "�]^FF0000�~���~����^000000�����ɓ��ꂽ�]";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000�~���~����^000000��";
	mes "�͂���B";
	close2;
	set AC_QUEST_ST_3,4;
	end;
L_OTHER:
	mes "�]���������Ă���]";
	if(AC_QUEST_LV_3!=8 || AC_QUEST_ST_3!=4)close;
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "^FF0000�^���V�[���m^000000��^FF0000�~���~����^000000��";
	mes "�͂���B";
	close;
}
hu_in01.gat,113,313,4	script	�A������	47,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_3) goto L_OTHER;
	switch(AC_QUEST_LV_3){
	case 1:
		goto L_QUEST02;
	case 3:
		goto L_QUEST04;
	case 5:
		goto L_QUEST06;
	case 7:
		goto L_QUEST08;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST02:
	switch(AC_QUEST_ST_3) {
	case 1:
		emotion 0;
		mes "[�A������]";
		mes "���I";
		mes "�N�ł����H";
		mes "�˗��������󂯂Ă����`���҂́B";
		next;
		menu "���ƁA�`���ҋ���́H",-;
		mes "[�A������]";
		mes "���܂Ȃ��B";
		mes "���A���x��Ă��܂��܂����ˁB";
		mes "���͖`���ҋ���𓝊����Ă���";
		mes "�A�������Ƃ����܂��B";
		mes "��낵�����肢���܂��ˁB";
		next;
		mes "[�A������]";
		mes "�܂��A�`���ҋ���ǂ�Ȃ��Ƃ�";
		mes "����Ƃ���Ȃ̂������������";
		mes "���������ˁB";
		next;
		mes "[�A������]";
		mes "�`���ҋ���͊ȒP�Ɍ�����";
		mes "���ł����������{�����e�B�A����B";
		mes "�������A���ʂ̐l�ŉ�������̂�";
		mes "����Č��݈̂����Ă���B";
		next;
		mes "[�A������]";
		mes "�_���W�����̒��ɐl�����c�����";
		mes "���܂����Ƃ��A";
		mes "�`���҂���Ȃ��Ə�����̂�";
		mes "����ȏ�ԂƂ��A���������̂�";
		mes "�������肷���ł��B";
		next;
		mes "[�A������]";
		mes "����A�`���҃A�J�f�~�[���S�ʓI��";
		mes "�o�b�N�A�b�v���Ă����Ƃ������Ƃ�";
		mes "�{���ɏ������Ă����B";
		mes "���ʂɌق����炷����������";
		mes "�������Ă��܂�����ˁc�c";
		next;
		mes "[�A������]";
		mes "�Ƃ������Ƃł��B";
		mes "�����A�˗����e��";
		mes "��������ˁB";
		next;
		mes "[�A������]";
		mes "�ނނ�";
		mes "����́A";
		mes "�}���Ȃ��Ƃ܂�����������Ȃ��ȁB";
		mes "�ǂ����A�q�����_���W������";
		mes "���c����Ă���炵���B";
		next;
		mes "[�A������]";
		mes "���O�́A^FF0000�`�X���[^000000�B";
		mes "�N��10�΂̒j�̎q�������ł��B";
		mes "^0000FF�v�����e���n�����H1F^000000�ɍs���Ă���";
		mes "�Ƃ̃������c����";
		mes "����ɂȂ��Ă��A���Ă��Ȃ��������B";
		next;
		mes "[�A������]";
		mes "���Ƃ͈ꍏ�𑈂��Ƃ������B";
		mes "�����X�^�[�����邩��ˁB";
		mes "�����A^FF0000�`�X���[^000000����������";
		mes "���́A^0000FF���̉H^000000��n���Ăق����B";
		mes " ";
		mes "�]���̉H���������܂��󂯎�����]";
		next;
	L_REP2_1:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�v�����e���n�����H1F�i301,206�j^000000��";
		mes "�ɂ���^FF0000�`�X���[^000000�ɒ��̉H��n���B";
		mes " ";
		mes "�]^0000FF�v�����e���n�����H1F^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���Ƌ߂��]";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�A������]";
		mes "�}���ł����Ă��������B";
		mes "���Ƃ͈ꍏ�𑈂�����ˁB";
		next;
		goto L_REP2_1;
	case 3:
		mes "[�A������]";
		mes "���������A�˗��傩��";
		mes "����̘A������������B";
		mes strcharinfo(0)+"����";
		mes "����J�l�B";
		mes "�{���Ɏq�����A�M����������";
		mes "�ǂ������B";
		next;
		mes "[�A������]";
		mes "����ł́A�܂���������܂�����";
		mes "�A�J�f�~�[�̕��ɘA�����܂��̂�";
		mes "�����A�肪�J���Ă�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��B";
		mes "���肪�Ƃ��������܂����B";
		next;
	L_REP2_3:
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�A������]";
		mes strcharinfo(0)+"����";
		mes "���肪�Ƃ��������܂����B";
		next;
		goto L_REP2_3;
	default:
		goto L_OTHER;
	}
L_QUEST04:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[�A������]";
		mes strcharinfo(0)+"����";
		mes "������M���������󂯂�";
		mes "�����̂ł����H";
		next;
		menu "����",-;
		mes "[�A������]";
		mes "����[�A������܂���B";
		mes "����ł͑����A";
		mes "����̈˗����e�ɂ���";
		mes "���������Ă��炤��B";
		next;
		mes "[�A������]";
		mes "^0000FF�C�Y���[�h�C�ꓴ�A1F^000000��";
		mes "�������ڂ����ėV��ł���";
		mes "���̎q1�l��5���Ԃ����Ă��A";
		mes "������Ȃ��炵���B";
		next;
		mes "[�A������]";
		mes "���O�́A^FF0000�c�C�[�t���B^000000";
		mes "�N��11�΂̏��̎q���������B";
		next;
		mes "[�A������]";
		mes "^FF0000�c�C�[�t��^000000����������";
		mes "�O�񓯗l��";
		mes "���́A^0000FF���̉H^000000��n���Ăق����B";
		mes " ";
		mes "�]���̉H���������܂��󂯎�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�C�Y���[�h�C�ꓴ�A1F(351,45)^000000��";
		mes "����^FF0000�c�C�[�t��^000000�ɒ��̉H��n���B";
		mes " ";
		mes "^0000FF�]�C�Y���[�h�C�ꓴ�A^000000�ɂ�";
		mes "�C�Y���[�h����D�ł�����";
		mes "�o�C�������ɂ���]";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�A������]";
		mes "����ɂ��Ă��A���ʃ_���W������";
		mes "�V�񂾂肵�܂����ˁc�c";
		mes "�e�͂ǂ�������������Ă����";
		mes "���낤���c�c";
		mes "�Ƃ肠�����}���ł����Ă��������B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�C�Y���[�h�C�ꓴ�A1F(351,45)^000000��";
		mes "����^FF0000�c�C�[�t��^000000�ɒ��̉H��n���B";
		mes "�]^0000FF�C�Y���[�h�C�ꓴ�A^000000�ɂ�";
		mes "�C�Y���[�h����D�ł�����";
		mes "�o�C�������ɂ���]";
		close;
	case 3:
		mes "[�A������]";
		mes strcharinfo(0)+"����";
		mes "�����l�ł����B";
		mes "�����A�~�b�V�����B���ł��ˁB";
		mes "���x���A";
		mes "�˗��傩��A��������܂�����B";
		next;
		mes "[�A������]";
		mes "����ł́A�܂���������܂�����";
		mes "�A�J�f�~�[�̕��ɘA�����܂��̂�";
		mes "�����A�肪�J���Ă�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��B";
		mes "���肪�Ƃ��������܂����B";
		next;
	L_REP4_3:
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�A������]";
		mes strcharinfo(0)+"����";
		mes "���肪�Ƃ��������܂����B";
		next;
		goto L_REP4_3;
	default:
		goto L_OTHER;
	}
L_QUEST06:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[�A������]";
		mes "���҂����Ă���܂�����B";
		mes strcharinfo(0)+"����";
		mes "����̈˗����e��";
		mes "�L�T���ł��I";
		next;
		menu "�L�ł���!?",-;
		mes "[�A������]";
		mes "�����A�ǂ���琔���O����";
		mes "�˗���̔L����������Ȃ�";
		mes "�炵���B";
		mes "����ŁA�L�̋��ꏊ��";
		mes "�˂��~�߂Ăق��������Ȃ�ł��B";
		next;
		mes "[�A������]";
		mes "���̖`���҂���A";
		mes "�v�����e���n�����H2F��";
		mes "�L�炵���p�������Ƃ�������";
		mes "���Ă��܂��̂ŁA";
		mes "^FF0000�v�����e���n�����H2F^000000��";
		mes "�{�������肢�ł��܂����H";
		next;
		mes "[�A������]";
		mes "�L�̖��O�́A^FF0000�����V�[^000000�����";
		mes "���N��2�΂������ł��B";
		mes "�������̗ǂ��L�炵���A";
		mes "^008800���̉H^000000��n���Ă������";
		mes "�����ŋA���ė���邻�����B";
		next;
		mes "[�A������]";
		mes "�Ȃ̂Ń����V�[������";
		mes "��������";
		mes "�O�񓯗l�ɒ��̉H��";
		mes "�n���Ă��������ȁB";
		mes " ";
		mes "�]���̉H���������܂��󂯎�����]";
		next;
	L_REP6_1:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�v�����e���n�����H2F(159,182)^000000";
		mes "�ɂ���^FF0000�����V�[^000000������";
		mes "���̉H��n���B";
		mes " ";
		mes "^0000FF�]�v�����e���n�����H2F^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000���炢����]";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�A������]";
		mes "���ꂶ�Ⴈ�肢���܂��ˁB";
		next;
		goto L_REP6_1;
	case 3:
		emotion 4;
		emotion 23,"";
		mes "[�A������]";
		mes strcharinfo(0)+"����";
		mes "^FF0000�����V�[�����^000000������";
		mes "�߂��Ă��������ł���B";
		mes "�ł��c�c�܂������ɍs���s����";
		mes "�Ȃ����Ƃ��c�c";
		next;
		menu "�����ł����c�c",-;
		mes "[�A������]";
		mes "�Ƃ肠�����˗��͏I���ł��B";
		mes "����ł́A�܂���������܂�����";
		mes "�A�J�f�~�[�̕��ɘA�����܂��̂�";
		mes "�����A�肪�󂢂Ă�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��B";
		mes "���肪�Ƃ��������܂����B";
		next;
	L_REP6_3:
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�A������]";
		mes strcharinfo(0)+"����";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_QUEST08:
	switch(AC_QUEST_ST_3) {
	case 1:
		mes "[�A������]";
		mes "����ɂ��́A";
		mes strcharinfo(0) + "����";
		mes "�����˗����e�����������";
		mes "���������܂��ˁB";
		next;
		mes "[�A������]";
		mes "�V�Ă̖`���҂��y�A��";
		mes "�`�������Ă����炵���̂ł���";
		mes "�����X�^�[�Ɉ͂܂�Ă��܂�";
		mes "��l�������Ȃ��󋵂�";
		mes "�Ȃ��Ă��܂��Ă���悤�ł��B";
		next;
		mes "[�A������]";
		mes "�y�A��g��ł������������";
		mes "��������Ă���炵���A";
		mes "�����ɏ����ɍs�����Ƃ��ł��܂�";
		mes "�Ƃ̂��ƁB";
		mes "�Ƃ������Ƃō���̈˗���";
		mes "���̐V�Ė`���҂̋~�o�ƂȂ�܂��B";
		next;
		mes "[�A������]";
		mes "���O��^FF0000�U�[�p�t^000000�B";
		mes "�N���20�΂̒j���ł��B";
		mes "�����������^008800���̉H^000000��";
		mes "����^008800����^000000��n���Ă����Ă��������B";
		mes "�]���̉H�Ə���";
		mes "�@�������܂��󂯎�����]";
		next;
	L_REP8_1:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�C�Y���[�h�C�ꓴ�A2F(129,79)^000000";
		mes "�ɂ���^FF0000�U�[�p�t^000000��";
		mes "^008800���̉H^000000��^008800����^000000��n���B";
		mes " ";
		mes "�]^0000FF�C�Y���[�h�C�ꓴ�A2F^000000�ւ�";
		mes "�@^0000FF�C�Y���[�h^000000����D�ōs���]";
		close2;
		set AC_QUEST_ST_3,2;
		end;
	case 2:
		mes "[�A������]";
		mes "���ꂶ�Ⴈ�肢���܂��ˁB";
		next;
		goto L_REP8_1;
	case 3:
		mes "[�A������]";
		mes strcharinfo(0) + "����";
		mes "�������ł������H";
		next;
		menu "������������",-;
		emotion 4;
		mes "[�A������]";
		mes "�Ȃ�Ɓc�c";
		mes "�܁A�܂��A�����ł悩�����ł���ˁI";
		mes "�������A����ȏꏊ�ŐQ�Ă�Ƃ�";
		mes "�ǂꂾ���A";
		mes "�̂̂�����Ă���l";
		mes "�Ȃ�ł��傤���c�c";
		next;
		mes "[�A������]";
		mes "�Ƃ肠�����A";
		mes "�~�b�V���������Ƃ������ƂŁc�c";
		mes strcharinfo(0) + "����";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close2;
		set AC_QUEST_ST_3,99;
		end;
	case 99:
		mes "[�A������]";
		mes strcharinfo(0)+"����";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[�A������]";
	mes "����ɂ��́B";
	close;
L_CLEAR:
	mes "[�A������]";
	mes strcharinfo(0)+"����";
	mes "�M���͂ق�Ƃɂ��΂炵��";
	mes "�`���҂ł��B";
	mes "�܂��A��������܂�����";
	mes "��낵�����肢���܂��ˁB";
	close;
}
prt_sewb1.gat,301,206,4	script	�`�X���[#AC	896,{
	if(AC_QUEST_LV_3!=1) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[�`�X���[]";
		mes "����[��A����[��B";
		mes "���̉H�킷��āA";
		mes "�A��Ȃ��Ȃ����������[";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�`�X���[�N";
		mes "�����ɗ�����B";
		next;
		emotion 0;
		mes "[�`�X���[]";
		mes "!?";
		mes "�O�X�b�A�O�X�b";
		mes "���肪�Ƃ��c�c";
		mes "����ŉƂɋA���B";
		next;
		emotion 15;
		mes "[�`�X���[]";
		mes "��[�[���I";
		mes "���̉H������Ε��C����";
		mes "����������ƒT�����Ă������ƁI";
		mes "���肪�Ƃ��ˁI";
		next;
	L_REP01:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�����ɒ��̉H��n�������Ƃ�";
		mes "^FF0000�A������^000000�ɕ񍐂���B";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[�`�X���[]";
		mes "�킴�킴���Ă���Ă��肪�Ƃ��ˁB";
		mes "�l�͏����T��������";
		mes "�A�邩����S���āI";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[�`�X���[]";
	mes "�T���T�����̂����ȁ[�B";
	close;
}
iz_dun00.gat,351,45,4	script	�c�C�[�t��#AC	96,{
	if(AC_QUEST_LV_3!=3) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[�c�C�[�t��]";
		mes "�c�c";
		next;
		menu "�c�C�[�t�������H",-;
		mes "[�c�C�[�t��]";
		mes "�V�[�b";
		mes "���܂������ڂ��Ă���񂾂���";
		mes "�b�������Ȃ��ł�ˁI";
		mes "�S�ɂ΂ꂿ�Ⴄ�I";
		next;
		menu "������������",-;
		mes "[�c�C�[�t��]";
		mes "�����Đ����I";
		mes "����Ȃ��ƂɂȂ�ق�";
		mes "�킩��Ȃ������̂ˁ[�B";
		mes "�������ږ��l�H";
		mes "�t�t�t�b";
		next;
		mes "[�c�C�[�t��]";
		mes "�ł��A�킴�킴���Ă���Ă��肪�ƁB";
		mes "�����ƉƂɋA��悤�ɂ���I";
		mes "���ꂶ�Ⴀ�ˁ[�B";
		next;
	L_REP01:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�����ɒ��̉H��n�������Ƃ�";
		mes "^FF0000�A������^000000�ɕ񍐂���B";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[�c�C�[�t��]";
		mes "�����ƌ�ŋA�邩��";
		mes "�S�z���Ȃ��ŁI";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[�c�C�[�t��]";
	mes "�c�c";
	close;
}
prt_sewb2.gat,159,182,4	script	�����V�[�����#AC	876,{
	if(AC_QUEST_LV_3!=5) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[�����V�[�����]";
		mes "�j���[�j���[";
		next;
		menu "�����V�[�����H",-;
		mes "[�����V�[�����]";
		mes "�j���[�j���[�j���[";
		next;
		menu "������������",-;
		mes "[" + strcharinfo(0) + "]";
		mes "�i�ǂ���烁���V�[�����̂悤���B";
		mes "�@���̉H��n�����B";
		mes "�@�{���ɂ���ŕ��C�Ȃ񂾂낤��";
		mes "�@�c�c�j";
		next;
	L_REP01:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�����ɒ��̉H��n�������Ƃ�";
		mes "^FF0000�A������^000000�ɕ񍐂���B";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[�����V�[�����]";
		mes "�j���[�I";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[�����V�[�����]";
	mes "�j���[�j���[";
	close;
}
iz_dun01.gat,129,79,4	script	�U�[�p�t#AC	887,{
	if(AC_QUEST_LV_3!=7) goto L_OTHER;
	switch(AC_QUEST_ST_3) {
	case 2:
		mes "[�U�[�p�t]";
		mes "Zzzzz�c�c";
		next;
		menu "�U�[�p�t����H",-;
		mes "[�U�[�p�t]";
		mes "�����H";
		mes "���j�����j���c�c";
		mes "�����H�ׂ��Ȃ���c�c";
		next;
		menu "�U�[�p�t����I",-;
		emotion 23;
		mes "[�U�[�p�t]";
		mes "�ǂ킟�������I";
		mes "�Ȃ񂾂Ȃ񂾁H";
		next;
		menu "������������",-;
		mes "[�U�[�p�t]";
		mes "�Ȃ�قǁA�����������Ƃ������̂��A";
		mes "�ł����C����I";
		mes "���Q�Ă邾��������B";
		mes "����[�A���������Ă�";
		mes "�����A�₽���ċC���������񂾂�ˁB";
		next;
		menu "�c�c",-;
		mes "[�U�[�p�t]";
		mes "�ł��A���肪����";
		mes "^008800����^000000��^008800���̉H^000000�͂�����Ă�����B";
		mes "���ꂶ��I";
		next;
	L_REP01:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�����ɒ��̉H��n�������Ƃ�";
		mes "^FF0000�A������^000000�ɕ񍐂���B";
		close2;
		set AC_QUEST_ST_3,3;
		end;
	case 3:
		mes "[�U�[�p�t]";
		mes "Zzzzz�c�c";
		next;
		goto L_REP01;
	default:
		goto L_OTHER;
	}
L_OTHER:
	mes "[�U�[�p�t]";
	mes "Zzzzz�c�c";
	close;
}
