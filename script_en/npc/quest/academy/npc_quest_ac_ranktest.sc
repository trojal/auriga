//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ��������
//                                                  by Pneuma
//------------------------------------------------------------

// -----------------------------------------------------------
// ���������֘A
// -----------------------------------------------------------

ac_cl_area.gat,85,37,4	script	�K���h	122,{

	function	show_mission;

	if(!AC_RANKTEST) goto L_OTHER;
	switch(AC_RANK){
	case 0: goto L_TEST01;
	case 1: goto L_TEST02;
	case 2: goto L_TEST03;
	case 3: goto L_TEST04;
	case 4: goto L_TEST05;
	case 5: goto L_TEST06;
	case 6: goto L_TEST07;
	}
L_TEST01:
	switch(AC_RANKTEST){
	case 1:
		mes "[�K���h]";
		mes "�您�I";
		mes "�悭�����ȁI";
		mes "���̖��O�̓K���h";
		mes "�N�B�̎�����S�������Ă�����Ă���B";
		mes "�܂��͌N�̖��O�������Ă���B";
		next;
		emotion 9;
		mes "[�K���h]";
		mes strcharinfo(0) + "�c�c";
		mes "�c�c" + strcharinfo(0) + "�B";
		mes "�ǂ�����ꎎ�����󂯂鎑�i��";
		mes "����悤���ȁB";
		next;
		mes "[�K���h]";
		mes "�������A��������Ă������A����";
		mes "�Ƃ������t�Őg�\���Ȃ��Ă��������B";
		mes "���܂ŁA�N�����������Ă���";
		mes "���[������̈˗��Ƒ卷�Ȃ�����ȁB";
		next;
		mes "[�K���h]";
		mes "���������̓��e����������Ă��炨���B";
		mes "�`���҃A�J�f�~�[�ɂ́A";
		mes "������O����";
		mes "���ȊO�ɂ����t������B";
		next;
		mes "[�K���h]";
		mes "�����A�قƂ�ǂ̋��t��";
		mes "�w���O�ŁA�����X�^�[�̐��Ԍ���";
		mes "�Ȃǂ����Ȃ��Ă���񂾁B";
		next;
		mes "[�K���h]";
		mes "�����āA����I�Ɍ���������";
		mes "��o���Ă��炢�A��������Ƃ�";
		mes "�𗧂ĂĂ��銴���Ȃ񂾁B";
		next;
		mes "[�K���h]";
		mes "�Ƃ������Ƃł��A";
		mes "����̎����̓��e�́A";
		mes "�t�F�C���������̐X03�ɐݒu����Ă���";
		mes "�z�����̌����{�b�N�X����";
		mes "�����񍐏����Ƃ��ė��邱�Ƃ��B";
		next;
		mes "[�K���h]";
		mes "���[�A����������";
		mes "�����{�b�N�X�ɂ͌����������Ă���";
		mes "�������A�C�e����";
		mes "�K�v�������C������ȁB";
		next;
		emotion 21;
		mes "[�K���h]";
		mes "�ł��A�S���t�F�C���������̐X03��";
		mes "�������郂���X�^�[����";
		mes "�擾�ł�����̂������͂����B";
		mes "���ꂶ��A��낵���ȁI";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 98:
		emotion 0;
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "�ǂ���疳���Ɍ����񍐏���";
		mes "�����Ă����悤���ȁB";
		next;
		mes "[�K���h]";
		mes "-�K���h��";
		mes "�@�z�����搶�̌����񍐏���";
		mes "�@�n����-";
		next;
	case 99:
		emotion 46;
		mes "[�K���h]";
		mes "��ꎎ���˔j���߂łƂ��I";
		mes "��́A���[���ɕ񍐂��邾�����B";
		mes "�����l�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�˗���B�������I";
		mes "���[������ɕ񍐂��ɍs�����]";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST02:
	switch(AC_RANKTEST){
	case 1:
		mes "[�K���h]";
		mes "�您�I";
		mes strcharinfo(0);
		mes "���낻�뗈�鍠���Ǝv���Ă������B";
		mes "�N�Ȃ�A��񎎌������N���N";
		mes "�N���A�ł���񂶂�Ȃ����ȁH";
		next;
		mes "[�K���h]";
		mes "���ꂶ��A";
		mes "������񎎌��̓��e�ɂ���";
		mes "�������邼�I";
		next;
		mes "[�K���h]";
		mes "������A�O�񓯗l��";
		mes "�����񍐏�������Ă���";
		mes "�ق����񂾁B";
		next;
		mes "[�K���h]";
		mes "�{���́A���̓��e�ɂ��悤��";
		mes "�v�����񂾂��A�|�����搶����";
		mes "���܂ł����Ă��񍐏���";
		mes "�����Ă��Ȃ��Ăȁc�c";
		next;
		mes "[�K���h]";
		mes "�|�����搶��";
		mes "�t�F�C���������̐X04��";
		mes "�����������Ȃ��Ă���͂��Ȃ̂���";
		mes "�����������񂾂낤���c�c";
		next;
		mes "[�K���h]";
		mes "�Ƃ����킯�ŁA";
		mes "�|�����搶���猤���񍐏���";
		mes "�Ƃ��Ă��Ă���B";
		next;
		mes "[�K���h]";
		mes "���I";
		mes "�m������I�ɋ��������X�^�[��";
		mes "�����ꏊ�������C�����邩��";
		mes "�\�����ӂ��Ă�����H";
		mes "���ꂶ��A���񂾂��B";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3: //�|�����搶�Ƀ[���s�ƂׂƉt��v�������
	case 4: //�󂫃r����v�������
		goto L_MICHOUSA; //������
	case 98:
		emotion 0;
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "�ǂ���疳���Ɍ����񍐏���";
		mes "�����Ă����悤���ȁB";
		next;
		mes "�]�K���h��";
		mes "�@�|�����搶�̌����񍐏���";
		mes "�@�n�����]";
		next;
	case 99:
		emotion 46;
		mes "[�K���h]";
		mes "��񎎌��˔j���߂łƂ��I";
		mes "��́A���[���ɕ񍐂��邾�����B";
		mes "�����l�I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "^FF0000���[��^000000�����";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST03:
	switch(AC_RANKTEST){
	case 1:
		emotion 0;
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "����Ȃ����I";
		mes "��O�������󂯂ɗ����񂾂ȁB";
		next;
		emotion 5;
		mes "[�K���h]";
		mes "�O��ڂ̎����͂��Ɓc�c";
		mes "���A����̂������񍐏���";
		mes "�Ƃ��Ă�����̂��ȁB";
		next;
		mes "[�K���h]";
		mes "�ꏊ�̓t�F�C���������̐X02���ȁB";
		mes "���̏ꏊ�́A�E���t�搶���I";
		next;
		mes "[�K���h]";
		mes "�Ƃ����킯�ŁA";
		mes "�t�F�C���������̐X02�ɂ���";
		mes "�E���t�搶���猤���񍐏���";
		mes "�Ƃ��Ă��Ă���B";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3: //�E���t�搶�Ɋ��܂ꂽ
	case 4: //�ڂ�������
		goto L_MICHOUSA; //������
	case 98:
		emotion 0;
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "�ǂ���疳���Ɍ����񍐏���";
		mes "�����Ă����悤���ȁB";
		next;
		mes "�]�K���h��";
		mes "�@�E���t�搶�̌����񍐏���";
		mes "�@�n�����]";
		next;
	case 99:
		emotion 46;
		mes "[�K���h]";
		mes "��O�����˔j���߂łƂ��I";
		mes "��́A���[���ɕ񍐂��邾�����B";
		mes "�����l�I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "^FF0000���[��^000000�����";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST04:
	switch(AC_RANKTEST){
	case 1:
		emotion 0;
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "����Ȃ����I";
		mes "��O�������󂯂ɗ����񂾂ȁB";
		next;
		mes "[�K���h]";
		mes "�l��ڂ̎����́A";
		mes "^0000FF�v�����e��^000000����A";
		mes "^0000FF�Q�t�F��^000000�܂ŕ����Ă��炤�I";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		mes "[�K���h]";
		mes "��A���e��������x���������̂��H";
		next;
		if(select("�͂�","������")==2){
			mes "[�K���h]";
			mes "�������A�撣���I";
			close;
		}
		mes "[�K���h]";
		mes "�킩�����B";
		mes "�o���؂�Ȃ�������";
		mes "����������񂾁B";
		next;
		mes "[�K���h]";
		mes "�l��ڂ̎����́A";
		mes "^0000FF�v�����e��^000000����A";
		mes "^0000FF�Q�t�F��^000000�܂ŕ����Ă��炤�I";
		next;
		show_mission;
		close;
	case 3: // �v������
	case 4: // �v��������WP��O
	case 5: // mjolnir_09 WP
	case 6: // �h���b�u�搶�ɂ��ٓ���n��
	case 7: // prt_fild00 WP
		emotion 0;
		mes "[�K���h]";
		mes "!?";
		mes "�����r���Ŗ߂��Ă��Ă��܂��Ƃ́c�c";
		mes "�܂��A�߂��Ă��Ă��܂������̂�";
		mes "�d���Ȃ��B";
		mes "������x�͂��߂��玎����";
		mes "�󂯂Ȃ����Ă��炤���B";
		next;
		cutin "quest_route001.bmp",3;
		mes "[�K���h]";
		mes "�������H";
		mes "������^0000FF�v�����e��^000000����A";
		mes "^0000FF�Q�t�F��^000000�܂ŕ����񂾁B";
		next;
		show_mission;
		next;
		mes "[�K���h]";
		mes "�Ƃ������Ƃ��B";
		mes "�撣���I";
		close2;
		set AC_RANKTEST,2;
		end;
	case 98:
		emotion 0;
		mes "[�K���h]";
		mes "�����I";
		mes strcharinfo(0);
		mes "�����ɖ߂����ȁB";
		next;
		mes "[�K���h]";
		mes "�h���b�v�搶�ɂ�";
		mes "���������";
		mes "���ٓ���n�����悤���ȁB";
		next;
	case 99:
		emotion 46;
		mes "[�K���h]";
		mes "�Ƃ������Ƃł��A";
		mes strcharinfo(0);
		mes "��l�������i���߂łƂ��I";
		mes "��̓��[���ɕ񍐂����";
		mes "�������I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "^FF0000���[��^000000�����";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST05:
	switch(AC_RANKTEST){
	case 1:
		mes "[�K���h]";
		mes "�您�I";
		mes strcharinfo(0) + "�I";
		mes "�������̂ł����A��܎������ȁB";
		mes "����̎����̓��e�͂��Ɓc�c";
		mes "�ӂށA����������񍐏���";
		mes "�Ƃ��Ă��Ă��炤�����̂悤���B";
		next;
		mes "[�K���h]";
		mes "���āA�ڍד��e�����A";
		mes "�~�����j�[���R��09�ɐݒu����Ă���";
		mes "�z�����̌����{�b�N�X����";
		mes "�����񍐏����Ƃ��Ă��Ă��炢�����B";
		next;
		mes "[�K���h]";
		mes "�z�����搶�����񍐏���";/*�̂������Ă邪�{�I�ǂ���*/
		mes "�����Ă���{�b�N�X�ɂ͂��������������Ă���B";
		mes "�m�����̏ꏊ�̂��󂯂�ɂ�";
		mes "�Í����K�v�������͂����c�c";
		next;
		mes "[�K���h]";
		mes "�Í��́A�|�X�g�ɂ��Ă���{�^����";
		mes "�������ƂŃq���g��";
		mes "����ꂽ�C������񂾂��A";
		mes "�ڂ����͖Y��Ă��܂����B";
		next;
		mes "[�K���h]";
		mes "�܂��A�Ƃ肠�������n��";
		mes "�������Ă݂Ăق����B";
		mes "���n�𒲂ׂ��";
		mes "�킩�邩������Ȃ����ȁB";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3:
	case 4:
	case 5:
	case 6:
		goto L_MICHOUSA; //������
	case 98:
		emotion 0;
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "�ǂ���疳���Ɍ����񍐏���";
		mes "�����Ă����悤���ȁB";
		next;
		mes "[�K���h]";
		mes "-�K���h��";
		mes "�@�z�����搶�̌����񍐏���";
		mes "�@�n����-";
		next;
	case 99:
		emotion 46;
		mes "[�K���h]";
		mes "��܎����˔j���߂łƂ��I";
		mes "��́A���[���ɕ񍐂��邾�����B";
		mes "�����l�I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "���[������ɕ񍐂��ɍs�����]";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_TEST06:
	switch(AC_RANKTEST){
	case 1:
		mes "[�K���h]";
		mes "�����ȁI";
		mes strcharinfo(0);
		mes "��Z�����͂Ȃ��Ȃ����";
		mes "���������I";
		next;
		mes "[�K���h]";
		mes "���܂ŁA���񂩖��O�̏o�Ă���";
		mes "�z�����搶���o���Ă��邾�낤���H";
		mes "�ނ́A�D��S�ƌ����ɑ΂���";
		mes "�^�������q��ł͂Ȃ��񂾁B";
		next;
		mes "[�K���h]";
		mes "������A";
		mes "�����̒m��Ȃ��y�n�ł����Ă��A";
		mes "�댯���Ƃ킩���Ă���ꏊ�ł����Ă�";
		mes "���̂��Ƃ��l������";
		mes "�����ɂł��s���Ă��܂��B";
		next;
		mes "[�K���h]";
		mes "�����������ƂŁA�ނ͒���I��";
		mes "���q�ɂȂ��Ă��܂��̂��I";
		mes "���������A�ނ͖������đ����Ă��邱�Ƃ�";
		mes "�����ׁA�����������ɂ�";
		mes "�m���ɂȂ��Ă��鎖�������̂��c�c";
		next;
		mes "[�K���h]";
		mes "�����ȂƂ���A";
		mes "��l�O�̖`���҂łȂ����";
		mes "�ނ�������͓̂�����낤�B";
		mes "�������I";
		mes "�t�Ɍ����΂��I";
		next;
		mes "[�K���h]";
		mes "�ނ������邱�Ƃ��ł���΁A";
		mes "��l�O�̖`���҂Ƃ����Ă�";
		mes "�ߌ��ł͂Ȃ��B";
		next;
		mes "[�K���h]";
		mes "�����������Ƃł��I";
		mes "����̎����̓z�����搶��";
		mes "�����A�~���N��n�����Ƃ��I";
		next;
		mes "[�K���h]";
		mes "���Ȃ݂ɁA�~���N��͂��邱�Ƃ�";
		mes "�d�v�ȔC���ɂȂ邩��ȁH";
		mes "�~���N�͊w�Z�̔̔�������";
		mes "��ɓ���Ă���B";
		mes "���܂ꂽ���̂���ɓ���āA���������";
		mes "�͂���̂��`���҂̊�{���B";
		next;
		mes "[�K���h]";
		mes "�Ƃ������ƂŁA�����s���Ă���񂾁I";
		mes "�ƌ��������������A";
		mes "��񂪏��Ȃ����āA";
		mes "����ł͒T���ꏊ�̍i���݂�";
		mes "�ł��Ȃ����낤�B";
		next;
		mes "[�K���h]";
		mes "��q���g�������悤�B";
		mes "�t�F�C���������̐X08 ��";
		mes "�z�����搶�����������Ƃ���";
		mes "��񂪓����Ă���B";
		mes "�����A����Ŕ������~���N��n����";
		mes "��Z�������i�ɂȂ�킯����";
		next;
		mes "[�K���h]";
		mes "���̏��͎኱�Â����ł�";
		mes "�����̏ꏊ�ɂ��邩�ǂ�����";
		mes "���ۂɌ��ɍs���Č��Ȃ���";
		mes "�킩��Ȃ��B";
		next;
		mes "[�K���h]";
		mes "���ꂶ�Ⴀ�A�C������";
		mes "�����ė���񂾂��B";
		next;
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		goto L_REPEAT;
	case 3:
		mes "[�K���h]";
		mes "�Ȃ�قǂȁB";
		mes "�z�����搶�ɉ�����̂��B";
		mes "�撣���ăz�����搶��";
		mes "�����ă~���N��n���񂾂��H";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^FF0000�z�����搶^000000�������A�~���N��n���]";
		mes "�]^0000FF�~�����j�[���R��06^000000�t�߂�";
		mes "�@�z�����搶�̌�p�����������Ƃ�";
		mes "�@��񂠂�B";
		mes "�@^0000FF�~�����j�[���R��06^000000�ւ�";
		mes "�@^0000FF�Q�t�F��^000000����������Ƌ߂��]";
		close;
	case 4:
		mes "[�K���h]";
		mes "�r�[�g���搶�ɉ�����̂��B";
		mes "��p�̓z�����搶��";
		mes "�������肾����ȁB";
		mes "�ԈႦ�Ă��d���Ȃ����낤�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^FF0000�z�����搶^000000�������A�~���N��n���]";
		mes "�]^FF0000�z�����搶^000000��";
		mes "�@^0000FF�\�O���g���� 18^000000�Ɍ�������";
		mes "�@�Ƃ̏�񂠂�B";
		mes "�@^0000FF�\�O���g���� 18^000000�ւ�";
		mes "�@^0000FF�����N^000000����������Ƌ߂��]";
		close;
	case 98:
		emotion 0;
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "���A��I";
		mes "�����Ƀz�����搶�ɂ�";
		mes "����̂����H";
		next;
		mes "�]�K���h�Ƀz�����搶�̃�����n�����]";
		next;
		mes "[�K���h]";
		mes "�Ȃ�قǁA";
		mes strcharinfo(0) + "��";
		mes "�z�����搶�̖����~�����̂��B";
		mes "����N���������󂯂Ă��Ȃ�������";
		mes "�ނ̖��͂Ȃ������Ƃ������Ƃ��ȁc�c";
		next;
		mes "[�K���h]";
		mes "���������������킹�Ă��炨��";
		mes "���肪�Ƃ��ȁI";
		mes "�ܘ_����������Ȃ��̍��i���I";
		mes "���̎���������΂��Ă����H";
		mes "���ꂶ�Ⴀ�A���[���ɕ�";
		mes "���ɍs���Ă���I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�˗���B�������I";
		mes "���[�������";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_RANKTEST,99;
		end;
	case 99: //�y�~�b�V�����z�Ɓy�˗��B���z�̈Ⴂ�́H�H�H
		mes "[�K���h]";
		mes "���������������킹�Ă��炨��";
		mes "���肪�Ƃ��ȁI";
		mes "�ܘ_����������Ȃ��̍��i���I";
		mes "���̎���������΂��Ă����H";
		mes "���ꂶ�Ⴀ�A���[���ɕ�";
		mes "���ɍs���Ă���I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "���[�������";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_TEST07:
	switch(AC_RANKTEST){
	case 1:
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "���ɑ掵�������ȁB";
		mes "����ɍ��i�����";
		mes "�N�͐���āA�`���҃A�J�f�~�[";
		mes "���ߒ��C���Ƃ������ƂɂȂ�I";
		next;
		mes "[�K���h]";
		mes "�ŏI�����ɂӂ��킵��";
		mes "���܂ł̎�������";
		mes "��ς�����ȁB";
		mes "�S���Ă�����悤�ɁB";
		next;
		mes "[�K���h]";
		mes "����ł́A";
		mes "�����̓��e�ɂ���";
		mes "���������Ă��炤���B";
		next;
		L_REP07:
		cutin "quest_route002.bmp",3;
		//�����N����O�̓����N����v�����e��6�}�b�v�ړ�
		mes "[�K���h]";
		mes "����̓��e�́A";
		mes "�t�F�C��������v�����e���܂�";
		mes "�����ē��B���邱�Ƃ��B";
		next;
		mes "[�K���h]";
		mes "�����A���ꂾ���ł͊ȒP�Ȏ�����";
		mes "�Ȃ��Ă��܂��B";
		mes "�����ŁA�����w�肷��ꏊ��ʂ�A";
		mes "�ʐ^��A�C�e���Ȃǂ�";
		mes "���łɂƂ��Ă��Ăق����B";
		next;
		mes "[�K���h]";
		mes "��ڂ́A�`���������΂̐���";
		mes "�Ƃ��ė��邱�Ƃ��B";
		mes "�����ē�ڂ́A�w��̏ꏊ��";
		mes "�B�e���Ă��邱�ƁB";
		mes "�O�ڂ́A�����̂��Ă��邱�Ƃ��B";
		next;
		mes "[�K���h]";
		mes "���Ȃ݂ɍ����񂾂��̂�";
		mes "�S�āA�t�F�C��������v�����e����";
		mes "�������Ă���r����";
		mes "��ɓ���邱�Ƃ��ł���B";
		next;
		mes "[�K���h]";
		mes "����ڂ����������邼�B";
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 2:
		mes "[�K���h]";
		mes "��A���e��������x���������̂��H";
		next;
		if(select("�͂�","������")==2){
			mes "[�K���h]";
			mes "�������A�撣���I";
			close;
		}
		mes "[�K���h]";
		mes "�킩�����B";
		mes "�o���؂�Ȃ�������";
		mes "����������񂾁B";
		next;
		goto L_REP07;
	case 3:  // ���j�N���琅�����炤
	case 4:  // �����ɕ߂܂�
	case 5:  // �ו��̏ꏊ�𕷂��o��
	case 6:  // �ו������߂���
	case 7:  // WP�O������b
	case 8:  // �p�Ђ̎ʐ^���B��
	case 9:  // WP�O������b
	case 10: // �~�V�������搶�ɘb��������
	case 11: // �����̂�
	case 12: // �΂݂���|�������o��(�ȗ��\)
	case 13: // �~�V�������搶�ɖ��@�������Ă��炤
	case 14: // WP�O������b
	case 15: // WP�O������b
	case 16: // �v���������������b
		emotion 18;
		mes "[�K���h]";
		mes "�����r���Ŗ߂��Ă��Ă��܂��Ƃ́c�c";
		mes "�܂��A�߂��Ă��Ă��܂������̂�";
		mes "�d���Ȃ��B";
		mes "������x�͂��߂��玎����";
		mes "�󂯂Ȃ����Ă��炤���B";
		next;
		mes "[�K���h]";
		mes "�ēx�ڂ����������邼";
		show_mission;
		close2;
		set AC_RANKTEST,2;
		end;
	case 98:
		emotion 0;
		mes "[�K���h]";
		mes "�����I";
		mes strcharinfo(0) + "����Ȃ����I";
		mes "�����Ԏ��Ԃ������Ă�������";
		mes "�S�z���Ă����񂾂�";
		mes "�������Ė����ɖ߂��Ă��Ă����";
		mes "���ꂵ����B";
		next;
		mes "[�K���h]";
		mes "�w�肳�ꂽ���̂�";
		mes "�����Ă��Ă��ꂽ�̂��H";
		next;
		mes "�]�K���h��";
		mes "�@^006600�򐅂����`���������΂̐�^000000��";
		mes "�@^006600���@�̂���������^000000��";
		mes "�@�n�����]";
		next;
		mes "[�K���h]";
		mes "�����I�m���Ɋm�F�������B";
		next;
	case 99:
		mes "[�K���h]";
		mes strcharinfo(0);
		mes "�{���ɐ��������ȁB";
		mes "���̎��������i�ł������_��";
		mes "�N�͈�l�O�̖`���҂��I";
		next;
		mes "[�K���h]";
		mes "���ꂶ��A�����ǂ���";
		mes "���[���ɕ񍐂��Ă���B";
		mes "���ꂩ�������΂��I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "���[�������";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_RANKTEST,99;
		end;
	}
L_MICHOUSA: //�������͂�����
L_REPEAT:
	mes "[�K���h]";
	mes "��A���e��������x���������̂��H";
	next;
	if(select("�͂�","������")==2){
		mes "[�K���h]";
		mes "�������A�撣���I";
		close;
	}
	mes "[�K���h]";
	mes "�킩�����B";
	mes "�o���؂�Ȃ�������";
	mes "����������񂾁B";
	next;
	show_mission;
	next;
	mes "[�K���h]";
	mes "�Ƃ������Ƃ��B";
	mes "�撣���I";
	close;
L_OTHER:
	switch(AC_RANK){
	case 0:
		mes "[�K���h]";
		mes "���̖��O�̓K���h";
		mes "�N�B�̎�����S�������Ă�����Ă���B";
		next;
		mes "[�K���h]";
		mes "�������󂯂邽�߂ɂ́A";
		mes "���[���̈˗������������Ȃ���";
		mes "�P�ʂ��҂��K�v�����邩��ȁB";
		mes "�P�ʂ��҂��A���[���ɂĎ�����";
		mes "�葱����������A";
		mes "������x���̂Ƃ���ɗ��Ă���I";
		next;
		mes "[�K���h]";
		mes "�܂��Ă邼�I";
		close;
	case 1:
		mes "[�K���h]";
		mes "��ꎎ�����i���߂łƂ��I";
		close;
	case 2: mes "[�K���h]";
		mes "��񎎌����i���߂łƂ��I";
		close;
	case 3: mes "[�K���h]";
		mes "��O�������i���߂łƂ��I";
		close;
	case 4:
		mes "[�K���h]";
		mes "��l�������i���߂łƂ��I";
		close;
	case 5:
		mes "[�K���h]";
		mes "��܎������i���߂łƂ��I";
		close;
	case 6:
		mes "[�K���h]";
		mes "��Z�������i���߂łƂ��I";
		close;
	case 7: case 8:
		emotion 18;
		mes "[�K���h]";
		mes "�您�I";
		mes strcharinfo(0);
		mes "�N���Ђ���q����������";
		mes "���������ȁB";
		close;
	}
	end;

OnInit:
	waitingroom "����", 0;
	end;

	function	show_mission	{
		switch(AC_RANK){
		case 0:
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "^0000FF�t�F�C���������̐X03^000000�ɂ���";
			mes "^FF0000�z�����̌����{�b�N�X^000000����";
			mes "^006600�����񍐏�^000000������Ă���B";
			mes " ";
			mes "�]^0000FF�t�F�C���������̐X03^000000�ւ́A";
			mes "�@^0000FF�A���x���^^000000���炢����]";
			break;
		case 1: mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]^0000FF�t�F�C���������̐X04^000000�ɂ���";
			mes "^FF0000�|�����搶^000000����";
			mes "^006600�����񍐏�^000000��a�����Ă���]";
			mes " ";
			mes "�]^0000FF�t�F�C���������̐X04^000000�ւ́A";
			mes "^0000FF�v�����e��^000000���炢����]";
			break;
		case 2: mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]^0000FF�t�F�C���������̐X02^000000�ɂ���";
			mes "^FF0000�E���t�搶^000000����";
			mes "^006600�����񍐏�^000000��a�����Ă���]";
			mes " ";
			mes "�]^0000FF�t�F�C���������̐X02^000000�ւ́A";
			mes "^0000FF�t�F�C����^000000���炢����]";
			break;
		case 3:
			mes "[�K���h]";
			mes "�`���҂Ƃ��đ��Ő��E������̂�";
			mes "�������d�v�Ȃ��Ƃ��B";
			mes "�����炱���ł����";
			mes "�w��ł��炤�Ƃ������Ƃ��ȁB";
			next;
			cutin "quest_route001.bmp",3;
			mes "[�K���h]";
			mes "��A�r��";
			mes "^0000FF�v�����e���t�B�[���h00 (163,244)^000000";
			mes "�t�߂ɂ���^FF0000�h���b�v�搶^000000�ɁA";
			mes "���́A���ٓ���n����";
			mes "�T�C����������Ă��Ă��Ă���B";
			next;
			mes "[�K���h]";
			mes "�������������Ƃ��s���A";
			mes "�Q�t�F���ɓ��B�������_��";
			mes "�����͍��i�ƂȂ�I";
			mes "�������A�w�肵���A�C�e����";
			mes "�������Ă��Ȃ�������A";
			mes "�w�肵�����[�g��ʂ��Ă��Ȃ���";
			next;
			mes "[�K���h]";
			mes "�����͎��s�A�S�Ă�蒼���ƂȂ�B";
			mes "��A�S�Ă��I��点��O��";
			mes "���ɘb���������ꍇ�����l��";
			mes "��蒼���ƂȂ邩��ȁB";
			mes "���ꂶ��撣���ĂȁI";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�w�肳�ꂽ���e���N���A���Ȃ���";
			mes "�w�肳�ꂽ���[�g��ʂ�";
			mes "�]^0000FF�v�����e��^000000����^0000FF�Q�t�F��^000000��ڎw���]";
			break; 
		case 4:
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]^0000FF�~�����j�[���R��09^000000�ɂ���";
			mes "^006600�z�����̌����{�b�N�X^000000����";
			mes "^FF0000�����񍐏�^000000������Ă���B";
			mes " ";
			mes "�]^0000FF�~�����j�[���R��09^000000�ւ́A";
			mes "^0000FF�v�����e��^000000���炢����]";
			break;
		case 5:
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]^FF0000�z�����搶^000000�������A�~���N��n���]";
			mes "�]^0000FF�t�F�C���������̐X08^000000��";
			mes "�@�ڌ������Ƃ�����񂪂���炵��";
			mes "�@�܂��́A���̏ꏊ�𒲂ׂĂ݂悤";
			mes "�@^0000FF�t�F�C���������̐X08^000000�ւ�";
			mes "�@^0000FF�t�F�C����^000000����s���Ƌ߂��]";
			break;
		case 6: 
			mes "^0000FF�`����������^000000�̖k���������";
			mes "^FF0000�s���l�̃��j�N^000000�Ƃ����j������B";
			mes "�����ɁA�����痊�܂ꂽ�Ƃ�����";
			mes "^006600�򐅂����`���������΂̐�^000000��";
			mes "���炤���Ƃ��o����͂����B";
			next;
			mes "[�K���h]";
			mes "��ڂ̏ڂ������������B";
			mes "^006600�\�O���g����01^000000�̓쑤��";
			mes "�u�ɂ���Α���̔p�Ђ�";
			mes "�B�e���Ă��Ă���B";
			next;
			mes "[�K���h]";
			mes "�����ĎO�ڂ̏ڂ����������B";
			mes "^0000FF�v�����e���t�B�[���h09^000000��";
			mes "�I�A�V�X�t�߂ɂ���";
			mes "^FF0000�~�V�������搶^000000�ɘb������";
			mes "^006600���@�̂���������^000000��������ė��Ăق����B";
			next;
			mes "[�K���h]";
			mes "�����������S�Ă̓��e���s��";
			mes "�v�����e����^FF0000��������^000000���B�������_�Ŏ����͍��i�ƂȂ�I";
			mes "�������A�w�肵���A�C�e����";
			mes "�������Ă��Ȃ�������A";
			mes "�w�肵�����[�g��ʂ��Ă��Ȃ���";
			next;
			mes "[�K���h]";
			mes "�����͎��s�A�S�Ă�蒼���ƂȂ�B";
			mes "��A�S�Ă��I��点��O��";
			mes "���ɘb���������ꍇ�����l��";
			mes "��蒼���ƂȂ邩��ȁB";
			mes "���ꂶ��撣���ĂȁI";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�w�肳�ꂽ���e���N���A���Ȃ���";
			mes "�w�肳�ꂽ���[�g��ʂ�";
			mes "�]^0000FF�t�F�C����^000000����^0000FF�v�����e��^000000��ڎw���]";
			break;
		}
		return;
	}
}

//��P�ے�   --------------------------------------------------------

// �~�j�}�b�v�ɒn�_�\��(ID:20�`) ���F 0xFFFF00

pay_fild03.gat,209,141,4	script	�Ŕ�	835,{
	mes "�]�k��= �v�����e������";
	mes "�]�k= �t�F�C��������";
	mes "�]��= �A���x���^";
	mes "�]��= �����N����";
	close;
}
pay_fild03.gat,209,143,4	script	�z�����̌����{�b�N�X	888,{
	if(AC_RANK || AC_RANKTEST!=2){
		mes "�]�`���҃A�J�f�~�[";
		mes "�@�z�����̌����{�b�N�X";
		mes "�@�u�S�~�͓���Ȃ��łˁI";
		mes "�@�݂�Ȃ̃z�����搶���v";
		mes "�@�Ə�����Ă���]";
		close;
	}
	if(AC_RANKTEST==98) goto L_FIN;
	mes "[�z�����̌����{�b�N�X]";
	mes " ";
	mes "�]���̃{�b�N�X���J���邽�߂ɂ�";
	mes "�@�N���[�o�[1�� �؂̍�1��";
	mes "�@�K�v�ł��]";
	next;
	if(countitem(705)>0 && countitem(902)>0){
		mes "[" + strcharinfo(0) + "]";
		mes "�A�C�e���́A�����Ă��邯��";
		mes "�ǂ����悤�B";
		next;
		if(select("�|�X�g�ɕ��荞��","�~�߂Ă���")==2) {
			mes "[" + strcharinfo(0) + "]";
			mes "�~�߂Ă������c�c";
			close;
		} else {
			mes "�]�K���K���c�c";
			mes "�@�h���h���h���c�c";
			mes "�@�����番�����m�[�g�炵�����̂�";
			mes "�@�o�Ă����]";
			next;
			L_FIN:
			mes "[" + strcharinfo(0) + "]";
			mes "�����Ɏ�ɓ���邱�Ƃ��ł����ȁB";
			mes "�`���҃A�J�f�~�[�ɖ߂낤�B";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�`���҃A�J�f�~�[�ɂ���";
			mes "�K���h�ɁA�z�����̌������ނ�n���]";
			close2;
			set AC_RANKTEST,98;
			end;
		}
	} else {
		mes "[" + strcharinfo(0) + "]";
		mes "�A�C�e��������Ȃ��悤���B";
		close;
	}
}
//��Q�ے�   --------------------------------------------------------

// �~�j�}�b�v�ɒn�_�\��(ID:20�`) ���F 0xFFFF00

pay_fild04.gat,350,330,4	script	#AC_PORING	1002,{}
pay_fild04.gat,350,329,4	script	�|�����搶	111,{
	if(AC_RANK!=1 || AC_RANKTEST<2){
		mes "[�|�����搶]";
		mes "�������������Ȃ��c�c";
		close;
	}
	switch(AC_RANKTEST){
	case 2:goto L_TEST01;
	case 3:goto L_TEST02;
	case 4:goto L_TEST03;
	case 98:goto L_TEST04;
	}
L_TEST01:
	emotion 28,"#AC_PORING";
	mes "[�|�����搶]";
	mes "�������������c�c";
	mes "�������I";
	mes "�������`�`�`�`�`�`�`�`�`!!";
	next;
	set '@dummy,select("�|�����搶�ł����H");
	emotion 1,"#AC_PORING";
	mes "[�|�����搶]";
	mes "��H";
	mes "�l�͂����ɂ��|�����搶�����ǁH";
	mes "�����p�H";
	mes "����ɂ��Ă�������������";
	mes "��ς���B";
	next;
	set '@dummy,select("������������");
	mes "[�|�����搶]";
	mes "�����񍐏�������!?";
	mes "�l�͂�����������";
	mes "�����̊�@�ɒ��ʂ��Ă���񂾁I";
	mes "�񍐏����ق������";
	mes "�H�ו��������Ă��Ă���I";
	next;
	mes "[�|�����搶]";
	mes "�b�͂��ꂩ�炾��I";
	mes "�������ȁ[�B";
	mes "�[���s�[10��";
	mes "�ׂƂׂƂ���t�� 5�ق�";
	mes "����ł��������ς��ɂȂ�͂��I";
	next;
	mes "[�|�����搶]";
	mes "����2�̂́A������ӂɂ���";
	mes "�|������h���b�v�X����";
	mes "��ɓ��邩��ˁB";
	next;
	set '@dummy,select("������ċ��H������c�c");
	mes "[�|�����搶]";
	mes "���H��������!?";
	mes "�����A���H�����I";
	mes "�ł��l�͎����̖���D�悷��˂��I";
	mes "�Ƃ����킯�ł�낵�����ނ�B";
	next;
	L_TEST01_REP:
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]^006600�[���s�[^00000010��";
	mes "^006600�ׂƂׂƂ���t��^000000��5�W�߂�";
	mes "^FF0000�|�����搶�ɓn��^000000�]";
	mes " ";
	mes "�]����2�̃A�C�e����";
	mes "�@�h���b�v�X��|�������瓾����]";
	close2;
	set AC_RANKTEST,3;
	end;
L_TEST02:
	emotion 0,"#AC_PORING";
	mes "[�|�����搶]";
	mes "���I�N�I";
	mes "�[���s�[10��";
	mes "�ׂƂׂƂ���t�̂�5�W�߂�";
	mes "�����ė��Ă��ꂽ�́H";
	next;
	if(countitem(909)<10 || countitem(938)<5){
		mes "[�|�����搶]";
		mes "�Ȃ񂾁A�����ĂȂ�����Ȃ����I";
		mes "���������Ă��Ă�I";
		next;
		goto L_TEST01_REP;
	}
	mes "[�|�����搶]";
	mes "���A�����Ă邶��Ȃ����I";
	mes "�������ՁI";
	next;
	if(select("�͂�","������")==2){
		emotion 7,"#AC_PORING";
		mes "[�|�����搶]";
		mes "�P�`�P�`�P�`�P�`�P�`!!!";
		close;
	}
	emotion 15,"#AC_PORING";
	mes "[�|�����搶]";
	mes "�킟�I ���肪�Ƃ�!!";
	mes "�c�c";
	mes "�c�c�c�c";
	mes "������ƁA�N�I";
	mes "����Ȃ����̂����邶��Ȃ����I";
	next;
	mes "[�|�����搶]";
	mes "�ׂƂׂƂ���t��";
	mes "���̂܂܂łǂ�����Ĉ��ނ񂾂�I";
	mes "�����Ƌ󂫃r�����炢";
	mes "�C�𗘂����Ă����Ă���";
	mes "����Ȃ��ƍ����I";
	mes "�܂������B";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]^006600�󂫃r��^000000��1��ɓ����";
	mes "^FF0000�|�����搶�ɓn��^000000�]";
	mes " ";
	mes "�]���̃A�C�e����";
	mes "�@�h���b�v�X��|�������瓾����]";
	close2;
	set AC_RANKTEST,4;
	end;
L_TEST03:
	mes "[�|�����搶]";
	mes "�󂫃r���͎����ė���";
	mes "���ꂽ�񂾂낤�ˁH";
	next;
	if(countitem(713)<1){
		mes "[�|�����搶]";
		mes "�Ȃ񂾁A�����ĂȂ�����Ȃ����I";
		mes "���������Ă��Ă�I";
		close;
	}
	mes "[�|�����搶]";
	mes "���A�����Ă邶��Ȃ����I";
	mes "�������ՁI";
	next;
	if(select("�͂�","������")==2){
		emotion 7,"#AC_PORING";
		mes "[�|�����搶]";
		mes "���b�J�[�[�b�I";
		mes "�����т炩�������Ȃ��";
		mes "�Ȃ�č����l���[�[���I";
		close;
	}
	mes "[�|�����搶]";
	mes "�N�A���͌��\�ǂ��z����Ȃ��H";
	mes "���肪�Ƃ��ˁB";
	next;
	mes "�]�p�N�p�N�A���V�����V��";
	mes "�@���L�����L��";
	mes "�@�S�N�S�N�]";
	next;
	mes "[�|�����搶]";
	mes "�Ӂ[���B";
	mes "�������������[�I";
	mes "�N�̎��͖Y��Ȃ���[�B";
	mes "���ꂿ��������ǋ󂫃r���͕Ԃ��ˁB";
	mes "���ꂶ�Ⴀ�ˁI";
	next;
	set '@dummy,select("���́A�����񍐏����c");
	emotion 17,"#AC_PORING";
	mes "[�|�����搶]";
	mes "�I";
	mes "�����A���߂񂲂߂�B";
	mes "��������Y��Ă��I";
	mes "��������͂��ĂˁB";
	next;
	L_TEST03_REP:
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]�`���҃A�J�f�~�[�ɂ���";
	mes "^FF0000�K���h^000000�ɁA^006600�����񍐏�^000000��n���]";
	close2;
	set AC_RANKTEST,98;
	end;
L_TEST04:
	mes "[�|�����搶]";
	mes "�����I";
	mes "�H�ו������肪�Ƃ��I";
	mes "�����񍐏��𑁂������A��������";
	mes "�����񂶂�Ȃ����ȁH";
	next;
	goto L_TEST03_REP;
}
//��R�ے�   --------------------------------------------------------

// �~�j�}�b�v�ɒn�_�\��(ID:20�`) ���F 0xFFFF00

pay_fild02.gat,105,242,4	script	#AC_WOLF	1107,{}
pay_fild02.gat,105,241,4	script	�E���t�搶	111,{
	if(AC_RANK!=2 || AC_RANKTEST<2){
		mes "[�E���t�搶]";
		mes "Zzzzz�c�c";
		close;
	}
	switch(AC_RANKTEST){
	case 2:
		emotion 36,"#AC_WOLF";
		mes "[�E���t�搶]";
		mes "�E�[�[�[�[�b";
		mes "���������I";
		mes "�K�u�b";
		next;
		set '@dummy,select("������");
		mes "�]�E���t�搶�Ɋ��܂�Ă��܂����]";
		next;
		set '@dummy,select("���������ł����I");
		emotion 0,"#AC_WOLF";
		mes "[�E���t�搶]";
		mes "!?";
		mes "����H";
		mes "���A���߂��B";
		mes "�Ă�����z�炾�Ǝv���āB";
		next;
		set '@dummy,select("�z����āH");
		mes "[�E���t�搶]";
		mes "�����A���̕ӂɏZ��ł�";
		mes "�E���t�B���B";
		mes "���������܂��Ă��܂��Ă��B";
		mes "�����炪�܂������񂶂�Ȃ�����";
		mes "�v�����񂾂�B";
		mes "�Ƃ���ŌN�́H";
		next;
		set '@dummy,select("������������");
		mes "[�E���t�搶]";
		mes "�����񍐏����c�c";
		mes "��������Y��Ă�����B";
		mes "���̔��̒��ɂ��܂����͂��B";
		mes "���o�����炿����Ƃ܂��ĂˁB";
		next;
		mes "�]�E���t�搶�����̏�Ɏ�𓖂Ă�";
		mes "�@�����������Ă���B";
		mes "�@����������������Ȃ������]";
		next;
		mes "[�E���t�搶]";
		mes "����H";
		mes "�����������ȁ[�B";
		mes "����Ŕ����󂭂͂��Ȃ񂾂��ǁc�c";
		mes "�c�c";
		mes "���I";
		mes "�킩�����c�c";
		next;
		mes "[�E���t�搶]";
		mes "�������̌��܂Ŏ��";
		mes "���䂵�Ă��܂������炾�c�c";
		mes "����������܂ł�";
		mes "�������ǂ����邱�Ƃ��ł��Ȃ��B";
		next;
		set '@dummy,select("���Ƃ��Ȃ�܂��񂩁H");
		emotion 0,"#AC_WOLF";
		mes "[�E���t�搶]";
		mes "���[��c�c";
		mes "���I ������!!";
		mes "���̓���H�ׂ�΂���";
		mes "���Ȃ�Ď������Ⴄ�͂����I";
		mes "���ƁA����Ȃ��Ƃ����낤����";
		mes "���ʂȃ^���ɒЂ�����������񂾁B";
		next;
		mes "[�E���t�搶]";
		mes "���ꂳ���H�ׂ��";
		mes "�����邱�Ƃ��o����͂��B";
		mes "�l�����o�����ƁA�����Ƃ܂�";
		mes "���܂ɂȂ����Ⴄ����B";
		mes "�����񂾂��ǌN��";
		mes "�Ƃ��Ă��Ă���Ȃ����ȁH";
		next;
		set '@dummy,select("�킩��܂���");
		mes "[�E���t�搶]";
		mes "�����A�������[�B";
		mes "�m���A���̃}�b�v��";
		mes "^0000FF�i129,186�j^000000�t�߂������Ǝv���B";
		mes "�O�̂��߈��t���Ă����ˁB";
		next;
		L_REP:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^006600�����̃^���ɒЂ�����^000000��";
		mes "��ɓ���āA";
		mes "�E���t�搶�ɓ͂���]";
		close2;
		viewpoint 1,129,186,20,0xFFFF00;
		set AC_RANKTEST,3;
		end;
	case 3:
	case 4:
		mes "[�E���t�搶]";
		mes "���A��������";
		mes "���͎����ė��Ă��ꂽ���ȁH";
		next;
		if(AC_RANKTEST!=4){
			mes "[�E���t�搶]";
			mes "�܂��A�����Ă��Ă���ĂȂ��񂾂ˁB";
			mes "�l�͂����ő҂��Ă��邩��";
			mes "���ނˁ[�B";
			next;
			goto L_REP;
		}
		mes "[�E���t�搶]";
		mes "�N���N��";
		mes "���̓����́I";
		mes "�����ė��Ă��ꂽ�񂾂ˁ[�B";
		mes "���肪�Ƃ��I";
		next;
		set '@dummy,select("����n��");
		mes "[�E���t�搶]";
		mes "�]�o�N�o�N�o�N�A�o�N�o�N�o�N";
		mes "�@�Q�u�b�]";
		next;
		misceffect 77,"#AC_WOLF";
		emotion 54,"#AC_WOLF";
		mes "[�E���t�搶]";
		mes "�������������[�[�[�[�I";
		mes "�������ŗ͂��킢�Ă�����I";
		mes "����Ŕ����󂭂͂��B";
		next;
		mes "�]�E���t�搶�����̏�Ɏ�𓖂Ă�";
		mes "�@�����������Ă���B";
		mes "�@�p�J�b�]";
		next;
		mes "[�E���t�搶]";
		mes "�悵���B";
		mes "���x�͋󂢂���[";
		mes "���ꂪ�����񍐏����B";
		next;
		mes "[�E���t�搶]";
		mes "���ꂶ��A�C�����ċA���Ă�";
		L_REP2:
		mes "���������Ă��Ă����";
		mes "���肪�Ƃ��I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�`���҃A�J�f�~�[�ɂ���";
		mes "^FF0000�K���h^000000�ɁA^006600�����񍐏�^000000��n���]";
		close2;
		set AC_RANKTEST,98;
		end;
	case 98:
		mes "[�E���t�搶]";
		goto L_REP2;
	}
}
pay_fild02.gat,129,186,0	script	�@��Ԃ����悤�Ȑ�#ACTEST03		111,{
	mes "�]�@��Ԃ����悤�Ȍオ����]"; //��Ŗ{�I�ǂ���
	if(AC_RANK!=2 || (AC_RANKTEST!=3 && AC_RANKTEST!=4)) close;
	next;
	if(AC_RANKTEST==4){
		mes "[" + strcharinfo(0) + "]";
		mes "���͂���ȏ�K�v�Ȃ��ȁB";
		next;
		goto L_REP;
	}
	set '@dummy,select("�@���Ă݂悤");
	mes "�]�@���Ă݂�ƒ�����ڂ��łĂ���";
	mes "�@�ڂ̒��ɂ͓����Ђ��Ă���]";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "�E���t�搶�̒Ђ�������";
	mes "�ԈႢ�Ȃ��ȁB";
	mes "������Ă������B";
	next;
	mes "�]��������A";
	mes "�@�ڂ𖄂߂Ȃ������]";
	next;
L_REP:
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]^FF0000�E���t�搶^000000�ɓ���͂���]";
	close2;
	viewpoint 1,105,242,20,0xFFFF00;
	set AC_RANKTEST,4;
	end;
}
//��S�ے�   --------------------------------------------------------

// �~�j�}�b�v�ɒn�_�\��(ID:20�`) ���F 0xFFFF00


// �k���N�G�X�g�̃��[�g�^�b�`

//prt_fild05.gat,367,205,0				script	AC_TEST04#ROUTE01	139,1,1,{ //�v�����Ń^�b�`
//	if(AC_RANK!=3 || AC_RANKTEST!=2) end;
//	viewpoint 1,105,381,20,0xFFFF00;
//	mes "[" + strcharinfo(0) + "]";
//	mes "�K���h��^0000FF�v�����e��^000000����^0000FF�Q�t�F��^000000��";
//	mes "�������Ƃ��Č����Ă������B";
//	mes "�r����^FF0000�h���b�v�搶^000000�ɂ��ٓ���";
//	mes "�n���Ȃ�����B";
//	mes "�܂���^FF0000�k���̕��p��^000000�����Ă������B";
//	close2;
//	set AC_RANKTEST,3; //�t���O�X�V
//	end;
//}
prt_fild05.gat,105,372,0				script	AC_TEST04#ROUTE02	139,5,4,{ //�v��������WP��O�Ń^�b�`
	if(AC_RANK!=3 || AC_RANKTEST!=3) end;
	mes "[" + strcharinfo(0) + "]";
	mes "�܂��܂���͒����B";
	mes "����΂낤�c�c";
	close2;
	set AC_RANKTEST,4; //�t���O�X�V
	end;
}
prt_fild05.gat,292,377,0				script	AC_TEST04#ROUTE03	139,5,5,{ //�v�����E��WP��O�Ń^�b�`
	if(AC_RANK!=3 || AC_RANKTEST!=3) end;
	viewpoint 1,105,381,20,0xFFFF00;
	mes "[" + strcharinfo(0) + "]";
	mes "����H";
	mes "�s������Ԉ�������ȁH";
	mes " ";
	mes "�]�K���h���猾��ꂽ���[�g���ƁA";
	mes "������^0000FF���̕�����k�Ɍ�����^000000";
	mes "�K�v������悤���]";
	close2;
	end;
}
mjolnir_09.gat,37,244,0					script	AC_TEST04#ROUTE04	139,5,5,{ //�v�������́����[�v��O�Ń^�b�`
	if(AC_RANK!=3 || AC_RANKTEST!=4) end;
	mes "[" + strcharinfo(0) + "]";
	mes "�m�����̏ꏊ��";
	mes "�h���b�u�搶�����鏊";
	mes "�̂͂����B";
	mes "����}�����B";
	close2;
	set AC_RANKTEST,5; //�t���O�X�V
	end;
}
prt_fild00.gat,152,250,0				script	�h���b�u�搶	139,4,4,{
// �K���h���h���b�v�Ƃ������A
// �h���b�u���������炵���B�i�V�[�N���b�g�X�g�[���[�ɏo�Ă��܂��j
// �C������Ȃ����߁A�K���h���Ԉ���Ă邾�����낤�c�c

	if(AC_RANK!=3 || (AC_RANKTEST!=5 && AC_RANKTEST!=6)) end;
	if(AC_RANKTEST==5){
		mes "[�h���b�u�搶]";
		mes "�����`�A�����`�B";
		mes "���͍������A���̒��Œ�������`�B";
		mes "����ȁA���ɐ��k�B�͂����Ƃ�`��";
		mes "�����Ĕ��΂މ��`�A";
		mes "���k�B�͎��_�`��";
		next;
		set '@dummy,select("�K���h�搶���炱����c�c");
		mes "[�h���b�u�搶]";
		mes "���I �K���h���炩���I";
		mes "���������Ď��ɂ������������";
		mes "�O�b�h�^�C�~���O�Ƃ�������ˁB";
		mes "���̒��ɕٓ�����蓊���Ă�I";
		mes " ";
		mes "�]�ٓ������̒��ɕ��蓊�����]";
		next;
		set '@dummy,select("���́A�T�C�����c�c");
		mes "[�h���b�u�搶]";
		mes "�T�C���I���������A";
		mes "���͂����܂ŗL���l����Ȃ���I�H";
		mes "�i�ււ��A���̂܂ɂ������l�C��";
		mes "�ɂȂ��Ă��̂��j";
		next;
		mes "[�h���b�u�搶]";
		mes "�܁A�܂��A�����܂Ō����Ȃ�";
		mes "�T�C���������悤�B";
		mes "�厖�ɂ��Ă����B";
		mes " ";
		mes "�]�K���h��������������";
		mes "�@�T�C���������Ă�������]";
		next;
		mes "[�h���b�u�搶]";
		mes "����ł́A";
		mes "�ٓ���H�ׂ�Ƃ��邩�Ȃ��B";
		next;
		L_REP:
		mes "[" + strcharinfo(0) + "]";
		mes "�i�h���b�u�搶����T�C������������B";
		mes "^FF0000�Q�t�F��^000000�֌��������I�j";
		close2;
		viewpoint 1,18,129,20,0xFFFF00;
		set AC_RANKTEST,6; //�t���O�X�V
		end;
	} else {
		mes "[�h���b�u�搶]";
		mes "�ٓ������肪�Ƃ��I";
		mes "���Ⴀ��!!";
		next;
		goto L_REP;
	}
}
prt_fild00.gat,28,124,0					script	AC_TEST04#ROUTE05	139,5,5,{
	if(AC_RANK!=3 || AC_RANKTEST<5 || AC_RANKTEST>6) end;
	//���ٓ��킽�������m�F
	if(AC_RANKTEST==5){
		//������ �B��Y��B�ł�����Ȋ���������
		mes "[" + strcharinfo(0) + "]";
		mes "�h���b�u�搶�ɂ��ٓ���n���Ȃ���B";
		close2;
		viewpoint 1,152,250,20,0xFFFF00;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "���Ə����ŃQ�t�F�����I";
	close2;
	set AC_RANKTEST,7; //�t���O�X�V
	end;
}
geffen.gat,213,119,0					script	AC_TEST04#ROUTE06	139,1,1,{
	if(AC_RANK!=3 || AC_RANKTEST!=7) end;
	mes "�����ɃQ�t�F���ɒ��������I";
	mes "�K���h����ɕ񍐂��悤�I";
	close2;
	set AC_RANKTEST,98; //�t���O�X�V
	end;
}

//��T�ے�   --------------------------------------------------------

// �~�j�}�b�v�ɒn�_�\��(ID:20�`) ���F 0xFFFF00

mjolnir_09.gat,100,365,4	script	�z�����̌����{�b�N�X	888,{
	if(AC_RANK!=4 || AC_RANKTEST<2){
		mes "�]��̌��t��������Ă���]";
		close;
	}
	switch(AC_RANKTEST){
	case 2:
		mes "[�z�����̌����{�b�N�X]";
		mes " ";
		mes "�]��ڂ̈Í�����͂��Ă��������]";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�{�^���������ƃq���g���\�������";
		mes "�Ə����Ă��������B";
		mes "�����Ƀ{�^��������̂��낤���c�c";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�c�c";
		mes "����!?";
		mes "���ꂪ�A�{�^���̂悤���ȁB";
		mes "�����Ă݂悤�c�c";
		next;
		mes "�]�K���K���K�`����";
		mes "�@�p�T�b";
		mes "�@�ꖇ�̎����łĂ����悤���]";
		next;
		mes "�]�A���S�E�n�[���u�f�~�b�c";
		mes " �X�x�e�j���E�����N�X���R�g�f�A";
		mes " �P���L���E�z�E�R�N�V����";
		mes " �e�j�C�����R�g�K�f�L�}�X�]";
		next;
		mes "[" + strcharinfo(0) + "]";
		L_REP: //�J��Ԃ��ꏊ�����������{�I�ǂ���B
		mes "�ǂ����O�̈Í�������炵���B";
		mes "�Í��̏ꏊ��������Ă���ȁB";
		mes "�Ƃ肠������ڂ���Í���";
		mes "���ɍs���Ă݂悤�B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "��ڂ̈Í��̂��肩�́c�c";
		mes "���̃}�b�v�̍��W";
		mes "�i 284,354�j���ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]��ڂ̈Í��𒲂ׂ�]";
		mes " ";
		mes "�]^0000FF�~�����j�[���R��09�i284,345�j^000000�]";
		close2;
		viewpoint 1,284,345,20,0xFFFF00;
		set AC_RANKTEST,3;
		end;
	case 3:
		mes " ";goto L_REP;
	case 4://������
		mes "[" + strcharinfo(0) + "]";
		mes "�ǂ����O�̈Í�������炵���B";
		mes "�Í��̏ꏊ��������Ă���ȁB";
		mes "��ڂ̈Í���";
		mes "^006600�z�����搶�͒j�O^000000";
		mes "�������ȁB";
		mes "��ڂ𒲂ׂɍs�����B";
		next;
	case 5:
		mes "[" + strcharinfo(0) + "]";
		mes "�ǂ����O�̈Í�������炵���B";
		mes "�Í��̏ꏊ��������Ă���ȁB";
		mes "��ڂ̈Í���";
		mes "^006600�z�����搶�͂�������^000000";
		mes "�������ȁB";
		mes "�O�ڂ𒲂ׂɍs�����B";
		next;
	case 6:
		mes "[�z�����̌����{�b�N�X]";
		mes " ";
		mes "�]��ڂ̈Í�����͂��Ă��������]";
		next;
		input '@dummy$;
		if('@dummy$!="�z�����搶�͒j�O") goto L_INPERR;
		mes "[�z�����̌����{�b�N�X]";
		mes " ";
		mes "�]�j�ڂ̈Í�����͂��Ă��������]";
		next;
		input '@dummy$;
		if('@dummy$!="�z�����搶�͂�������") goto L_INPERR;
		mes "[�z�����̌����{�b�N�X]";
		mes " ";
		mes "�]�O�ڂ̈Í�����͂��Ă��������]";
		next;
		input '@dummy$;
		if('@dummy$!="�z�����搶�͑�V��") goto L_INPERR;
		mes "�]�K���K���c�c";
		mes "�@�h���h���h���c�c";
		mes "�@�����番�����m�[�g�炵�����̂�";
		mes "�@�o�Ă����]";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�����񍐏����B";
		mes "�����Ɏ�ɓ���邱�Ƃ��ł����ȁB";
		mes "�`���҃A�J�f�~�[�ɖ߂낤�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�`���҃A�J�f�~�[�ɂ���";
		mes "�K���h�ɁA�z�����̌������ނ�n���]";
		close2;
		set AC_RANKTEST,98;
		end;
	}
L_INPERR:
	mes "[�z�����̌����{�b�N�X]";
	mes " ";
	mes "�]�Í����Ⴂ�܂��]";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "�Í����͂�";
	mes "�ԈႦ�Ă��܂����悤���B";
	mes "�ēx�m�F���ē��͂��悤�B";
	close;
}
mjolnir_09.gat,284,345,4	script	�Ŕ�#ACTEST501	858,{
	if(AC_RANK!=4 || (AC_RANKTEST!=3 && AC_RANKTEST!=4)){
		mes "�]�Ŕɂ�";
		mes "�@��̌��t��������Ă���]";
		close;
	}
	if(AC_RANKTEST==4) goto L_REP;
	mes "�]�Ŕɂ�";
	mes "�@^006600�z�����搶�͒j�O^000000";
	mes "�@�Ə�����Ă���]";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "����ȊO�Ȃɂ�������Ă��Ȃ��B";
	mes "�ǂ���炱�ꂪ�Í��̂悤���c�c";
	next;
	L_REP:
	mes "[" + strcharinfo(0) + "]";
	mes "^006600�z�����搶�͒j�O^000000���c�c";
	mes "�Ƃ肠�����A���̏ꏊ�����Ă݂悤�B";
	mes "���̍��W�́c�c";
	mes "�i309.282�j���ȁB";
	next; //�s���I�h�ł����Ă܂��E�E�E
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]��ڂ̈Í��𒲂ׂ�]";
	close2;
	viewpoint 1,309,282,20,0xFFFF00;
	set AC_RANKTEST,4;
	end;
}
mjolnir_09.gat,309,282,4	script	�Ŕ�#ACTEST502	858,{
	if(AC_RANK!=4 || (AC_RANKTEST!=4 && AC_RANKTEST!=5)){
		mes "�]�Ŕɂ�";
		mes "�@��̌��t��������Ă���]";
		close;
	}
	if(AC_RANKTEST==5) goto L_REP;
	mes "�]�Ŕɂ�";
	mes "�@^006600�z�����搶�͂�������^000000";
	mes "�@�Ə�����Ă���]";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "�c�c";
	mes "�ǂ���炱�ꂪ�Í��̂悤���ȁB";
	next;
	L_REP:
	mes "[" + strcharinfo(0) + "]";
	mes "^006600�z�����搶�͂�������^000000�c�c";
	mes "���ӏ����Ă݂悤�B";
	mes "���̍��W�́c�c";
	mes "�i100,310�j���ȁB";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]�O�ڂ̈Í��𒲂ׂ�]";
	close2;
	viewpoint 1,100,310,20,0xFFFF00;
	set AC_RANKTEST,5;
	end;
}
mjolnir_09.gat,100,310,4	script	�Ŕ�#ACTEST503	858,{
	if(AC_RANK!=4 || (AC_RANKTEST!=5 && AC_RANKTEST!=6)){
		mes "�]�Ŕɂ�";
		mes "�@��̌��t��������Ă���]";
		close;
	}
	if(AC_RANKTEST==6) goto L_REP;
	mes "�]�Ŕɂ�";
	mes "�@^006600�z�����搶�͑�V��^000000";
	mes "�@�Ə�����Ă���]";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "�c�c";
	mes "�ǂ���炱�ꂪ�Í��̂悤���ȁB";
	next;
	L_REP:
	//������ �����ȉ��̋L�^�������E�E�E�Ƃ肠�����z���ł��܂����Ƃ��܂��B
	mes "[" + strcharinfo(0) + "]";
	mes "��ڂ��A^006600�z�����搶�͒j�O^000000�A";
	mes "��ڂ��A^006600�z�����搶�͂�������^000000�A";
	mes "�O�ڂ́A^006600�z�����搶�͑�V��^000000���B";
	mes "�ǂ����Í��͑������悤���B";
	mes "�����{�b�N�X�ɓ��͂��ɍs�����B";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]^FF0000�z�����̌����{�b�N�X^000000�ɖ߂�A";
	mes "�O�̈Í�����͂���B�]";
	close2;
	viewpoint 1,100,365,20,0xFFFF00;
	set AC_RANKTEST,6;
	end;
}
//��U�ے�   --------------------------------------------------------

// �~�j�}�b�v�ɒn�_�\��(ID:20�`) ���F 0xFFFF00


pay_fild08.gat,167,332,4		script	#AC_HORONG	1129,{}
pay_fild08.gat,167,331,4		script	�z�����搶	111,{
	if(AC_RANK==5 && AC_RANKTEST==3){ mes "[�z�����搶]";goto L_REP; }
	emotion 2,"#AC_HORONG";
	mes "[�z�����搶]";
	mes "�ӂ�ӂ�`��";
	mes "���`�񌤋��͓����ˁB";
	mes "�ł��A��肭�����Ȃ��Ƃ��낪";
	mes "�����̂�˂��B";
	if(AC_RANK!=5 || AC_RANKTEST!=2)close;
	next;
	set '@dummy,select("�z�����搶!!");
	emotion 0,"#AC_HORONG";
	mes "[�z�����搶]";
	mes "!!!!?";
	mes "�т����肵����`�B";
	mes "���ɉ�������H";
	next;
	set '@dummy,select("�~���N��n���ɗ��܂����B");
	emotion 1,"#AC_HORONG";
	mes "[�z�����搶]";
	mes "????";
	mes "���H";
	mes "�~���N�������́H";
	mes "�ł��A�킽���~���N�͋��Ȃ̂��";
	mes "������C�����������������Ă�����B";
	mes "���肪�Ƃ��ˁB";
	next;
	set '@dummy,select("�������Ŏ󂯎���Ă��炤�K�v��");
	emotion 0,"#AC_HORONG";
	mes "[�z�����搶]";
	mes "�����c�c�H";
	mes "�c�c";
	mes "���������đ�Z����������H";
	next;
	set '@dummy,select("�����ł��I");
	emotion 23,"";
	mes "[�z�����搶]";
	mes "����A������Ȃ����H";
	mes "�M�����T���Ă�̂�";
	mes "�z�����搶��ˁH";
	mes "����^FF0000�z�����搶^000000��H";
	mes "�悭�ԈႦ����̂�ˁc";
	next;
	set '@dummy,select("�����[���I ���߂�Ȃ����c�c");
	mes "[�z�����搶]";
	mes "���������A�C�ɂ��Ȃ��ł��������ˁB";
	mes "��������A^FF0000�z�����搶^000000���ۂ��p��";
	mes "�����̑O���������̂�ˁB";
	mes "����������������c�c";
	mes "�Q�t�F������";
	mes "�߂��ꏊ�������񂾂��ǁc�c";
	next;
	emotion 0,"#AC_HORONG";
	mes "[�z�����搶]";
	mes "���I ��������I";
	mes "�m���A^0000FF�~�����j�[���R��06^000000�I";
	mes "�ԈႢ�Ȃ���B";
	next;
	set '@dummy,select("���肪�Ƃ��������܂��I");
	mes "[�z�����搶]";
	mes "�����`�B";
	L_REP:
	mes "�z�����搶���Ċm�؂͂Ȃ�����ˁB";
	mes "�ł��A���̌��p�̓z�����搶";
	mes "�������Ǝv����B";
	mes "���ꂶ�Ⴀ�A�����撣���ĂˁB";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]^FF0000�z�����搶^000000�������A�~���N��n���]";
	mes "�]^0000FF�~�����j�[���R��06^000000�t�߂�";
	mes "�@�z�����搶�̌�p�����������Ƃ�";
	mes "�@��񂠂�B";
	mes "�@^0000FF�~�����j�[���R��06^000000�ւ�";
	mes "�@^0000FF�Q�t�F��^000000����������Ƌ߂��]";
	close2;
	set AC_RANKTEST,3;
}
mjolnir_06.gat,226,183,4		script	#AC_BEETLE	1494,{}
mjolnir_06.gat,226,182,4		script	�r�[�g���搶	111,{
	if(AC_RANK==5 && AC_RANKTEST==4) goto L_REP;
	emotion 39,"#AC_BEETLE";
	mes "[�r�[�g���搶]";
	mes "���t�͍ō��ł��Ȃ��c�c";
	mes "���̐▭�ȊÂ݂��Ȃ�Ƃ��c�c";
	if(AC_RANK!=5 || AC_RANKTEST!=3) close;
	next;
	set '@dummy,select("�z�����搶�H");
	emotion 57,"";
	mes "[�r�[�g���搶]";
	mes "��H";
	mes "���̂��Ƃ��Ă�ł���̂��ˁH";
	mes "�l�̓r�[�g���搶�Ȃ񂾂��ǂ��H";
	mes "�ނƂ͌�p�����Ă��邩��";
	mes "�悭�Ԉ����̂���B";
	next;
	set '@dummy,select("�͂��c�c�A�܂����c�c");
	emotion 2,"#AC_BEETLE";
	mes "[�r�[�g���搶]";
	mes "���₨��A";
	mes "������������ł���悤�����c�c";
	mes "�ǂ������񂾂��H";
	next;
	set '@dummy,select("������������");
	mes "[�r�[�g���搶]";
	mes "�Ȃ�قǂȂ��c�c";
	mes "����͋C�̓łɁB";
	mes "�������A�F�X�ȍ����";
	mes "�����������Ȃ���";
	mes "�`���҂Ƃ��Đ����Ă����̂�";
	mes "�ނ��������B";
	next;
	mes "[�r�[�g���搶]";
	mes "������A�Ō�܂�";
	mes "���߂Ă͂����Ȃ���H";
	next;
	set '@dummy,select("���肪�Ƃ��������܂��B");
	emotion 11,"#AC_BEETLE";
	mes "[�r�[�g���搶]";
	mes "�����A���C���o�Ă����݂������ˁI";
	mes "�悵�A�N�ɂƂ��Ă����̏�񂾁I";
	mes "���̓z�����搶�Ƃ����̑O";
	mes "���ۂɂ������񂾂�B";
	next;
	set '@dummy,select("���ł�����!?");
	mes "[�r�[�g���搶]";
	mes "�ނ́A�����N�̒�����������";
	mes "�̂ɂǂ������e����^����̂�";
	mes "���Ă����̂𒲂ׂ�Ƃ���";
	mes "�����N�t�߂̊C�݂�";
	mes "�s�����Č����Ă��ȁB";
	next;
	mes "[�r�[�g���搶]";
	mes "�����N�t�߂̊C�݂Ƃ�����";
	mes "�������̏ꏊ�����邪�c�c";
	mes "�댯�ȃ����X�^�[��";
	mes "�������Ă���ꏊ���قƂ�ǁc�c";
	mes "�ނ̎��͂��l����Ɓc�c";
	next;
	L_REP:
	mes "[�r�[�g���搶]";
	mes "�z�����搶�͂����炭";
	mes "^0000FF�\�O���g����18^000000�ӂ��";
	mes "����̂ł͂Ȃ����Ǝv���B";
	mes "�s���Ă݂�Ƃ�����B";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]^FF0000�z�����搶^000000�������A�~���N��n���]";
	mes "�]^FF0000�z�����搶^000000��";
	mes "�@^0000FF�\�O���g���� 18^000000�Ɍ�������";
	mes "�@�Ƃ̏�񂠂�B";
	mes "�@^0000FF�\�O���g���� 18^000000�ւ�";
	mes "�@^0000FF�����N^000000����������Ƌ߂��]";
	close2;
	set AC_RANKTEST,4;
}
moc_fild18.gat,211,95,4		script	#AC_HORN	1128,{}
moc_fild18.gat,211,94,4		script	�H�H�H	111,{
	if(AC_RANK==5 && AC_RANKTEST==98) {
		mes "[�z�����搶]";
		mes "���ꂶ��A�z������";
		mes "�����𑱂��邩��";
		mes "�N�͋C�����ċA���Ă���B";
		next; //�Ȃ�����搶�����Ȃ�
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�`���҃A�J�f�~�[�ɂ���";
		mes "�K���h�ɁA�񍐂���]";
		close; //�������́u�K���h�v�����ɂȂ��Ă邪�{�I�ǂ���B
	}
	if(AC_RANK!=5 || AC_RANKTEST!=4){
		mes "[�H�H�H]";
		mes "�������������ȁc�c";
		close;
	}
	mes "[�z�����搶]";
	mes "�E�O�O�O�O�c�c";
	mes "���A���邵��";
	mes "�����͑̂Ɉ����悤���c�c";
	mes "���A���A���߁A���c�c";
	mes "�~���N�c�c";
	next;
	if(countitem(519)==0){
		//������ ��������Y��Ă�����
		mes "[" + strcharinfo(0) + "]";
		mes "���܂����B�~���N��Y��Ă��܂����B";
		mes "�������Ȃ��ƃz�����搶����Ȃ��B";
		mes "�}���Ń~���N�������Ă��悤�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^FF0000�z�����搶^000000�ɁA�~���N��n���]";
		close;
	}
	set '@dummy,select("�z�����搶�I�~���N���I");
	emotion 0,"#AC_HORN";
	mes "[�z�����搶]";
	mes "�~���N�I";
	mes "���̂ɂ����́A�~���N�I";
	mes "���A���A�N�I";
	mes "�������ɂ��̃~���N������c�c";
	mes " ";
	mes "�]�z�����搶�Ƀ~���N����n�����]";
	next;
	misceffect 77,"#AC_HORN";
	mes "[�z�����搶]";
	mes "�S�L���b�A�S�L���b�A�S�L���b";
	mes "�v�n�[�[�[�[�b";
	mes "�����Ԃ����[�[�[�[!!";
	mes "����[�A�����A�����Ē���";
	mes "���̗򈫂Ȋ��ň���";
	mes "��t�̃~���N���΂炵���I";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "�c�c";
	next;
	mes "[�z�����搶]";
	mes "�N�I";
	mes "���O�́H";
	next;
	set '@dummy,select("�����");
	mes "[�z�����搶]";
	mes strcharinfo(0) + "�N�I";
	mes "�N�͍������u�Ԃɗ����������񂾂�H";
	mes "����������Ɗ������Ă�";
	mes "�����񂶂�Ȃ����ȁH";
	mes "�ނ��늴������ׂ�����I";
	next;
	set '@dummy,select("�́A�͂��c�c");
	emotion 54,"";
	mes "[�z�����搶]";
	mes "�ӂށc�c";
	mes "�N�́A�������Ă���킯����Ȃ�����";
	mes "�킩��Ȃ��Ă����R���c�c";
	mes "�܂��A�������̊�����";
	mes "�킩��悤�ɂȂ邳�B";
	next;
	mes "[�z�����搶]";
	mes "���܂Ȃ��A�܂���Ɍ������Ƃ�";
	mes "�Y��Ă����ˁB";
	mes "�����Ă���Ă��肪�Ƃ��B";
	mes "�N���ʂ肩����Ȃ�������";
	mes "�{���Ɋ�Ȃ������c�c";
	next;
	set '@dummy,select("���́c�c");
	mes "[�z�����搶]";
	mes "�����������Ƃ������̂��A";
	mes "�N�̓A�J�f�~�[�̐��k�������̂��B";
	mes "�c�c";
	mes "���������āA�����񍐏���";
	mes "�͂��Ă��ꂽ�l���ȁH";
	mes "���O�����Ă���C������񂾂��ǁB";
	next;
	set '@dummy,select("�͂�");
	mes "[�z�����搶]";
	mes "�����I ����ς肻�����I";
	mes "�N�ɂ͐F�X�Ƃ����b�ɂȂ��Ă��܂��Ă�ˁB";
	mes "�{���ɂ��肪�Ƃ��B";
	mes "�����ƌN�͂��΂炵���`���҂�";
	mes "�Ȃ�ɈႢ�Ȃ��B";
	next;
	mes "[�z�����搶]";
	mes "���A������K���h�ɓn����";
	mes "�z������搶�Ɖ����";
	mes "�؋��ɂȂ邩��ˁB";
	mes "���ꂶ��A�z������搶��";
	mes "�����𑱂��邩��";
	mes "�N�͋C�����ċA���Ă���B";
	next;
	L_REP:
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]�`���҃A�J�f�~�[�ɂ���";
	mes "^FF0000�K���h^000000�ɁA�񍐂���]";
	close2;
	delitem 519,1;
	set AC_RANKTEST,98;
	end;
}
//��V�ے�   --------------------------------------------------------

// �~�j�}�b�v�ɒn�_�\��(ID:20�`) ���F 0xFFFF00

// 2:�K���h���琿��������
// 3:���j�N���琅�����炤
// 4:�����ɕ߂܂�
// 5:�ו��̏ꏊ�𕷂��o��
// 6:�ו������߂���
// 7:WP�O������b
// 8:�p�Ђ̎ʐ^���B��
// 9:WP�O������b
//10:�~�V�������搶�ɘb��������
//11:�����̂�
//12:�΂݂���|�������o��(�ȗ��\)
//13:�~�V�������搶�ɖ��@�������Ă��炤
//14:WP�O������b
//15:WP�O������b
//16:�v���������������b
//98:�v��������������b
//99:�K���h�ɕ񍐊���
pay_gld.gat,273,307,4		script	�s���l���j�N	89,{
	if(AC_RANK!=6 || (AC_RANKTEST!=2 && AC_RANKTEST!=3)) {
		mes "[" + strcharinfo(0) + "]";
		mes "(�Z���������A";
		mes "�b��������̂͂�߂Ă������B)";
		close;
	}
	if(AC_RANKTEST==3){
		mes "[�s���l���j�N]";
		mes "�您�A�N���B";
		mes "�����s�����ق����������H";
		close2;
		viewpoint 1,16,276,20,0xFFFF00;
		end;
	}
	mes "[�s���l���j�N]";
	mes "����ɂ��́B";
	next;
	set '@dummy,select("�K���h���񂩂猾���Ă��܂���");
	mes "[�s���l���j�N]";
	mes "���������A�K���h�Ƃ͉��������B";
	mes "�z�͌��C�����H";
	next;
	set '@dummy,select("���C�ł���");
	mes "[�s���l���j�N]";
	mes "����́A�ǂ������B";
	mes "�Ƃ���ŁA";
	mes "�z�Ɍ����Ă����Ƃ������Ƃ�";
	mes "���ɉ����p��������񂶂�Ȃ��̂��H";
	mes "���̂悤���낤���H";
	next;
	set '@dummy,select("����������������");
	mes "[�s���l���j�N]";
	mes "���������A���傤�Ǐ�����������";
	mes "��������񂾂�B";
	mes "����������Ă����Ƃ����B";
	next;
	mes "[�s���l���j�N]";
	mes "�������A�������琼�ɍs����";
	mes "�����ɂȂ邪�A�����ł̐���";
	mes "�����M�d�Ȃ��̂ɂȂ邩��ȁB";
	mes "�����Ȃǂ��P���Ă��邩��";
	mes "����Ȃ��B";
	mes "�\���C�����ĂȁB";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "������ɓ���邱�Ƃ��ł����ȁB";
	mes "����}�����B";
	close2;
	viewpoint 1,16,276,20,0xFFFF00;
	set AC_RANKTEST,3;
}
// ���� �b���������ꍇ��{
function	script	����FUNC#AC_TST07	{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6){
		mes "[�����j]";
		mes "�Ȃ񂾂��O�H";
		mes " ";
		mes "�]�j�͂��낶��Ƃ���������Ă���]";
		close;
	}
	mes "[�����j]";
	mes "���̖�Y�I";
	mes "�����o���₪�����ȁI";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}
// ���� OnTouch��p
function	script	����FUNC2#AC_TST07	{
	if(AC_RANK!=6 || (AC_RANKTEST<4 && AC_RANKTEST>6)) end;
	mes "[�����j]";
	mes "�M�l���I";
	mes "�����o���₪�����ȁI";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}

//��WP�O�Ƃ������3�l�g
moc_fild02.gat,370,272,4	script	�����j#AC_TST07_03	930,10,10,{
	callfunc "����FUNC#AC_TST07";
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<3 || AC_RANKTEST>6) end;
	if(AC_RANKTEST==3){
		mes "[�����j]";
		mes "�w�b�w�b�w�B";
		mes "��l�ŉ���̓꒣���";
		mes "������Ƃ͔n���ȓz���B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�ȁA��������񂾁c�c";
		mes "�]��납�牽���ŉ���ꂽ�悤��";
		mes "�@�ӎ������̂��Ă����]";
		close2;
		warp "moc_fild02.gat",153,312;
		end;
	}
	mes "[�����j]";
	mes "�Ă߂����I";
	mes "�ǂ����瓦���o���₪�����I";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}
moc_fild02.gat,373,278,4	script	�����j#AC_TST07_01	931,{
	callfunc "����FUNC#AC_TST07";
}
moc_fild02.gat,370,279,4	script	������#AC_TST07_02	919,{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6){
		mes "[������]";
		mes "�Ȃɂ�A���^�B";
		mes " ";
		mes "�]���͂��낶��Ƃ���������Ă���]";
		close;
	}
	mes "[������]";
	mes "���̖�Y�I";
	mes "�������Ȃ���I";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}
//���B�Ƃ������
moc_fild02.gat,270,268,4	script	�����j#AC_TST07_04	930,3,5,{
	callfunc "����FUNC#AC_TST07";
OnTouch:
	callfunc "����FUNC2#AC_TST07";
}
//�쐼���[�g�Ƃ������
moc_fild02.gat,91,98,4	duplicate(�����j#AC_TST07_04)	�����j#AC_TST07_05	930,5,10
//�ו����[�g�Ƃ������
moc_fild02.gat,203,290,4	duplicate(�����j#AC_TST07_04)	�����j#AC_TST07_06	934,10,5

//�k�����[�g�Ƃ������
moc_fild02.gat,78,210,4		script	�����j#AC_TST07_07	930,10,5,{
	if(AC_RANK==6 && AC_RANKTEST==6){
		mes "[�����j]";
		mes "�ނɂ�ނɂ�c�c";
		close;
	}
	callfunc "����FUNC#AC_TST07";
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>5) end;
	callfunc "����FUNC2#AC_TST07";
}

//�߂܂����Ƃ��̏ꏊ�i������b�p�j
moc_fild02.gat,153,312,0	script	#AC_TST07_08	139,3,3,{
OnTouch:
	if(AC_RANK!=6) end;
	switch(AC_RANKTEST){
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�c�c";
		mes "�c�c�c�c";
		mes "(�����͉������c�c�H)";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "(�����̎p��������ȁc�c";
		mes "�C�������āA���̏ꏊ��";
		mes "��Ă���ꂽ�炵���B)";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "(�c�c�ǂ���琅�Ɖו���";
		mes "�����Ă��܂����悤���B)";
		next;
		set AC_RANKTEST,4;
	case 4:
		viewpoint 1,160,302,20,0xFFFF00;
		mes "[" + strcharinfo(0) + "]";
		mes "�i^FF0000�����Ɍ�����Ȃ��悤��";
		mes "�ړ����āA�ו��̂��肩��T�����I^000000�j";
		close;
	case 5:
		viewpoint 1,234,314,20,0xFFFF00;
		mes "[" + strcharinfo(0) + "]";
		mes "�i�߂܂��Ă��܂����c�c";
		mes "�����Ɍ�����Ȃ��悤�ɁA";
		mes "^0000FF�\�O���g����02(234,314)�t��^000000";
		mes "�Ɉړ����A�ו����Ƃ肩�������I�j";
		close;
	}
	end;
}
//���ݕ���������b
moc_fild02.gat,147,302,0	script	#AC_TST07_09	139,5,5,{
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST!=4) end;
	viewpoint 1,160,302,20,0xFFFF00;
	mes "[" + strcharinfo(0) + "]";
	mes "�i�����쓌�̕����琺������c�c";
	mes "�쓌�̕��ɂ����Ă݂悤�B�j";
	close;
}

//��������ɘb�������Ă�l
moc_fild02.gat,163,294,7	script	�����j#AC_TST07_11	943,9,9,{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6){
		mes "[" + strnpcinfo(1) + "]";
		mes "�Ȃ񂾂��O�H";
		mes " ";
		mes "�]�j�͂��낶��Ƃ���������Ă���]";
		close;
	}
	mes "�]" + strnpcinfo(1) + "�͂悾��𐂂炵�āA";
	mes "�ڂ��[���Ƃ��Ă���]";
	close;
OnTouch:
	if(AC_RANK!=6 || (AC_RANKTEST!=4 && AC_RANKTEST!=5)) end;
	switch(AC_RANKTEST){
	case 4:
		mes "[" + strcharinfo(0) + "]";
		mes "(�����̘b����������A";
		mes "�����ɉB��悤�c�c)";
		mes " ";
		mes "�]" + strcharinfo(0) + "��";
		mes "�؂̗��ɉB�ꂽ�]";
		next;
		mes "[�����j]";
		mes "�������炟�[�A�n���Ȗ`���҂�";
		mes "���������Ă��₪��₵��";
		mes "���΂��Ă��₵���B";
		next;
		mes "[��������]";
		mes "���������I";
		mes "���Ƃ͂܂������Ȃ��̂�";
		mes "�����Ă�������ˁ[���B";
		mes "����ŁA���̐��͉����ɂ���񂾁H";
		next;
		mes "[�����j]";
		mes "�ւ��ւ��ցB";
		mes "���Ȃ�^0000FF�\�O���g����02(234,314)^000000";
		mes "�t�߂ɉB���Ă���₷�B";
		mes "������񌩒��������";
		mes "����₷������S�ł����B";
		next;
		mes "[��������]";
		mes "�������ł������I";
		mes "�悵�A����͊F��";
		mes "����������Ȃ����I";
		mes "�ւ��ւ��ցc�c";
		mes " ";
		mes "�]��������͂悾��𐂂炵�Ă���]";
		next;
		mes "[�����j]";
		mes "�����ł₷�ˁI";
		mes "�ւ��ւ��ցc�c";
		mes " ";
		mes "�]�����j�͂悾��𐂂炵�Ă���]";
		close2;
		viewpoint 1,234,314,20,0xFFFF00;
		set AC_RANKTEST,5;
		end;
	case 5:
		mes "[��������]";
		mes "�����ƁA���������΁c�c";
		mes "���[���Ɓc�c";
		mes "����H";
		mes "���͉����ɉB���Ă���񂾁H";
		next;
		mes "[�����j]";
		mes "�₾�Ȃ��A��������I";
		mes "�B���ꏊ�́A";
		mes "^0000FF�\�O���g����02(234,314)^000000";
		mes "�t�߂ł���₷�B";
		next;
		mes "[��������]";
		mes "�������I";
		mes "���������ς���ċ���";
		mes "���Ȃ��ƂȂ��B";
		mes "�ւ��ւ��ցc�c";
		mes " ";
		mes "�]��������͂悾��𐂂炵�Ă���]";
		next;
		mes "[�����j]";
		mes "�����ł₷�ˁI";
		mes "�ւ��ւ��ցc�c";
		mes " ";
		mes "�]�����j�͂悾��𐂂炵�Ă���]";
		close2;
		viewpoint 1,234,314,20,0xFFFF00;
		end;
	}
}
moc_fild02.gat,165,294,4	duplicate(�����j#AC_TST07_11)	��������#AC_TST07_12	939

function	script	����FUNC3#AC_TST07	{
	mes "[�����j]";
	mes "�������Ƃ�񂶂�I";
	mes "���̌x���Ԃ�����������Ƃ́c�c";
	mes "�Ȃ��Ȃ���肨��킢�B";
	mes "�����������I �킵�̖ڂ����������́A";
	mes "�ו��ɂ͎w��{�ӂꂳ����I";
	close2;
	if(AC_RANKTEST>5) set AC_RANKTEST,5;
	warp "moc_fild02.gat",153,312;
	end;
}

moc_fild02.gat,234,314,4	script	�����j#�ו���	945,5,5,{
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6) end; //���b�Z�[�W�Ȃ��Ŗ{�I�ǂ���
	if(getvariableofnpc('flag,"�ו�#AC_TST07")<3){
		mes "[�����j]";
		mes "���j�����j���c�c";
		mes "Zzzzz";
		next;
		if(AC_RANKTEST==6){
			mes "[" + strcharinfo(0) + "]";
			mes "�ו��͎��߂����ȁc�c";
			mes "�����Ɍ�����Ȃ��悤�ɁA";
			mes "���̏ꏊ�Ɍ��������c�c";
			close2;
			viewpoint 1,80,342,20,0xFFFF00;
			end;
		}
		mes "[" + strcharinfo(0) + "]";
		mes "�����Ă���";
		mes "���Ȃ�΂ꂸ��";
		mes "���Ɖו������Ԃ��������B";
		close;
	}
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6 || getvariableofnpc('flag,"�ו�#AC_TST07")<3) end;
	callfunc "����FUNC3#AC_TST07";
}
moc_fild02.gat,234,313,4	script	�ו�#AC_TST07	111,{
	if(AC_RANK!=6 || (AC_RANKTEST!=5 && AC_RANKTEST!=6)){
		mes "�]��������̉ו����u���Ă���c�c�]";
		close;
	}
	if(AC_RANKTEST==6){
		mes "[" + strcharinfo(0) + "]";
		mes "�ו��͎��߂����ȁc�c";
		mes "�����Ɍ�����Ȃ��悤�ɁA";
		mes "���̏ꏊ�Ɍ��������c�c";
		close2;
		viewpoint 1,80,342,20,0xFFFF00;
		end;
	}
	if('flag<3){
		mes "�]�D��ꂽ�ו��Ɛ��𔭌������]";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�悵�A�����Ɍ�����Ȃ��悤";
		mes "���̏ꏊ�Ɍ��������c�c";
		close2;
		viewpoint 1,80,342,20,0xFFFF00;
		set AC_RANKTEST,6;
		end;
	}
	callfunc "����FUNC3#AC_TST07";
	end;
OnInit:
OnTimer3000:
	switch('flag){
		case 0: misceffect 197,"�����j#�ו���"; break;
		case 1: misceffect 197,"�����j#�ו���"; break;
		case 2: misceffect 197,"�����j#�ו���"; break;
		case 3: emotion 23,"�����j#�ו���"; break;
		case 4: emotion 20,"�����j#�ו���"; break;
		case 5: emotion  9,"�����j#�ו���"; break;
		case 6: emotion 45,"�����j#�ו���"; break;
	}
	set 'flag,('flag<6)*('flag+1);
	initnpctimer;
}
moc_fild02.gat,67,337,0		script	#AC_TST07_13	139,11,5,{
OnTouch:
	if(AC_RANK!=6 || AC_RANKTEST<4 || AC_RANKTEST>6) end;
	if(AC_RANKTEST==6){
		mes "[" + strcharinfo(0) + "]";
		mes "���낢�날�������ǁA";
		mes "�����܂ŗ��邱�Ƃ��ł����c�c";
		mes "����}���Ȃ��Ắc�c";
		close2;
		set AC_RANKTEST,7;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "�߂��āA�ו������Ԃ��Ȃ��Ɓc�c";
	close2;
	if(AC_RANKTEST==3 || AC_RANKTEST==4)
		viewpoint 1,163,294,20,0xFFFF00;
	else
		viewpoint 1,234,314,20,0xFFFF00;
	end;
}
moc_fild02.gat,92,337,0		duplicate(#AC_TST07_13)	#AC_TST07_14	139,11,5

moc_fild01.gat,190,38,0		script	#AC_TSTVP7_15	139,8,8,{
	if(AC_RANK!=6 || (AC_RANKTEST!=7 && AC_RANKTEST!=8)) end;
	if(AC_RANKTEST==8){
		mes "[" + strcharinfo(0) + "]";
		mes "���ɎB�e�͏I�������ȁB";
		mes "����}�����B";
		close2;
		viewpoint 1,22,242,20,0xFFFF00;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "�B�e����̂͂����ŊԈႢ�Ȃ��������B";
	next;
	mes "�]���i���B�e�����]";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "��肭�B�ꂽ�悤���ȁB";
	mes "����}�����B";
	close2;
	set AC_RANKTEST,8;
	viewpoint 1,22,242,20,0xFFFF00;
	end;
}
moc_fild01.gat,28,242,0		script	#AC_TSTVP7_16	139,5,2,{
	if(AC_RANK!=6 || (AC_RANKTEST!=7 && AC_RANKTEST!=8)) end;
	if(AC_RANKTEST==7){
		mes "[" + strcharinfo(0) + "]";
		mes "�B�e�����Ȃ�����B";
		close2;
		viewpoint 1,190,38,20,0xFFFF00;
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "�܂��΂������Ă����B";
	mes "�悤�₭�������z������̂��낤���H";
	close2;
	set AC_RANKTEST,9;
	end;
}
prt_fild09.gat,304,193,4	script	�~�V�������搶	101,{
	if(AC_RANK!=6 || AC_RANKTEST<9 || AC_RANKTEST>13) {
		mes "[�~�V�������搶]";
		mes "����ɂ��́B";
		close;
	}
	switch(AC_RANKTEST){
	case 9:
		emotion 1;
		mes "[�~�V�������搶]";
		mes "����ɂ��́B";
		mes "�������ɗp������H";
		next;
		set '@dummy,select("������������");
	case 10:
		emotion 33;
		mes "[�~�V�������搶]";
		mes "���@�̂������������K�v�Ȃ̂ˁB";
		mes "�������炱�̃}�b�v�ɐ����Ă���";
		mes "^FF0000��^000000���Ƃ��Ă��Ă����H";
		mes "���������炻��ɖ��@��";
		mes "�����Ă����邩��B";
		next;
		viewpoint 1,39,255,21,0xFFFF00;
		mes "[�~�V�������搶]";
		mes "�ڂ����ꏊ�Ȃ񂾂��ǂˁA";
		mes "�i39,255�j�t�߂��������ȁH";
		mes "����A���̂�����ɐ����Ă���͂��B";
		mes "���ꂶ��s���Ă�����Ⴂ�ˁB";
		close2;
		set AC_RANKTEST,10;
		end;
	case 11:
	case 12:
		misceffect 17;
		mes "[�~�V�������搶]";
		mes "���A��Ȃ����I";
		mes "�����ɑ����Ƃ��Ă����悤�ˁB";
		mes "���ꂶ��A�������@���������B";
		next;
		mes "[�~�V�������搶]";
		mes "���܂���������B";
		mes "���ꂶ��";
		mes "�����̑�������΂��Ăˁ[�B";
		next;
		mes "�]�~�V����������";
		mes "�@���@�̂������������󂯎�����]";
		next;
		mes "[�~�V�������搶]";
		mes "�S�[���܂ł������������ǁA";
		mes "�C�����߂��Ⴞ�߂���B";
		close2;
		set AC_RANKTEST,13;
		viewpoint 1,224,380,20,0xFFFF00;
		end;
	case 13:
		mes "[�~�V�������搶]";
		mes "�����̑�������΂��Ăˁ[�B";
		close2;
		viewpoint 1,224,380,20,0xFFFF00;
		end;
	}
}
prt_fild09.gat,39,255,0		script	#AC_TSTVP7_17	1080,{}
prt_fild09.gat,39,254,0		script	��#AC_TSTVP7_18	111,{
	mes "�]���������Ă���]";
	if(AC_RANK!=6 || AC_RANKTEST!=10) close;
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "���̑��Ŗ��Ȃ��悤���B";
	mes "�����Ă������B";
	next;
	mes "�]������ɓ��ꂽ�]";
	close2;
	viewpoint 1,304,193,20,0xFFFF00;
	set AC_RANKTEST,11;
	end;
}
prt_fild09.gat,227,368,0		script	#AC_TSTVP7_19	139,7,7,{
	if(AC_RANK!=6 || AC_RANKTEST<9 || AC_RANKTEST>13) end;
	if(AC_RANKTEST!=13){
		mes "[" + strcharinfo(0) + "]";
		mes "���@�̂�����������";
		mes "��ɓ���Ȃ��ƂȁB";
		close2;
		if(AC_RANKTEST==9 || AC_RANKTEST>=11)
			viewpoint 1,304,193,20,0xFFFF00; //�~�V�������搶
		else
			viewpoint 1,39,255,21,0xFFFF00; //��
		end;
	}
	mes "[" + strcharinfo(0) + "]";
	mes "�v�����e���܂ł��Ə������B";
	mes "����΂낤�I";
	close2;
	set AC_RANKTEST,14;
	end;
}
prt_fild09.gat,50,260,0		script	#AC_TSTVP7_20	139,10,10,{
	if(AC_RANK!=6 || AC_RANKTEST!=11) end;
	mes "�]�΂݂��特����������c�c�]";
	next;
	mes "�]�΂݂��烂���X�^�[�����ꂽ�I�]";
	close2;
	set '@dummy, getmapxy('@dummy$,'@x,'@y,0);
	areamonster "prt_fild09.gat",'@x-3,'@y-3,'@x +3,'@y+3,"--ja--",1002,3;
	set AC_RANKTEST,12;
	end;
}
prt_fild07.gat,248,370,0	script	#AC_TSTVP7_21	139,5,5,{
	if(AC_RANK!=6 || AC_RANKTEST!=14) end;
	mes "[" + strcharinfo(0) + "]";
	mes "�m�����̐悪�v�����e���̐���������";
	mes "�C������B";
	mes "���Ə������I";
	close2;
	set AC_RANKTEST,15;
	end;
}

// �~�j�}�b�v�\�������̂Ƃ���Ɉړ��B
//prt_fild05.gat,367,205,0	script	#AC_TSTVP7_22	139,5,5,{ //�v�����������O
//	if(AC_RANK!=6 || AC_RANKTEST!=15) end;
//	mes "[" + strcharinfo(0) + "]";
//	mes "�v�����e����������B";
//	mes "���Ə������I";
//	close2;
//	set AC_RANKTEST,16;
//	end;
//}

// �������B �ʂ낤�Ƃ���ƒǂ��Ԃ��炵���B
prt_fild05.gat,371,123,4	script	�K���̈������Ȓj	943,{
	mes "[�K���̈������Ȓj]";
	mes "�����[�B";
	mes "�����[�B";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "�i�j���Q�Ă���悤���B�j";
	close;
}

prontera.gat,26,203,0	script	#AC_TSTVP7_22	139,5,5,{ //�v������
	if(AC_RANK!=6 || AC_RANKTEST!=16) end;
	mes "[" + strcharinfo(0) + "]";
	mes "�v�����e���ɓ��������I";
	mes "��́A�K���h����ɕ�";
	mes "����Ύ����������I";
	close2;
	set AC_RANKTEST,98;
	end;
}
