//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ���[���̈˗�
//
//                                                 by Pneuma
//��Ղ̔�   -------------------------------------------------

// �ԐF 0xFF0000
alberta.gat,39,46,5		script	���C�[�[	726,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_1) goto L_OTHER;
	switch(AC_QUEST_LV_1){
	case 0:
		goto L_QUEST01;
	case 1:
		goto L_QUEST02;
	case 2:
		goto L_QUEST03;
	case 3:
		goto L_QUEST04;
	case 4:
		goto L_QUEST05;
	case 5:
		goto L_QUEST06;
	case 6:
		goto L_QUEST07;
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_QUEST09;
	}
L_QUEST01:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes "���I�N�A�N��";
		next;
		menu "�H",-;
		mes "[���C�[�[]";
		mes "�N�ł���!?";
		mes "�`���҃A�J�f�~�[����";
		mes "���̈˗����󂯂��l���āB";
		next;
		mes "[���C�[�[]";
		mes "�킽�����A";
		mes "�˗��҂�I";
		mes "���C�[�[���Č����́B";
		mes "��낵���ˁB";
		next;
		menu "�ǂ����Ă킩������ł����H",-;
		emotion 1,"";
		mes "[���C�[�[]";
		mes "�킽���A�������c��ł��ĂˁA";
		mes "�����Ȑl�����Ă����́B";
		mes "�����ԁA���������Ă�����";
		mes "�i�X�ƂˁA��ڌ���ƁA";
		mes "��́A���̐l�͉�����Ă���l��";
		mes "�킩��悤�ɂȂ����̂�B";
		next;
		mes "[���C�[�[]";
		mes "�A�J�f�~�[����������";
		mes "�`���҂�������ĕ����Ă�����A";
		mes "�N�����āA���̎q���Ȃ���";
		mes "�s���Ƃ����́B";
		next;
		menu "�c�c�@�˗����e�́H",-;
		mes "[���C�[�[]";
		mes "�˗��́A���̔��̎������";
		mes "�T���̂���`���ė~�����́B";
		next;
		mes "[���C�[�[]";
		mes "���͂킽���A�A���x���^��";
		mes "�����z���Ă����΂���Ȃ̂�B";
		next;
		mes "[���C�[�[]";
		mes "����ł��A";
		mes "�Ƃ̒낪���܂�ɂ�";
		mes "�E���i�Ȃ��̂�����A";
		mes "��̐A�؂�A���邽�߂�";
		mes "�����@���Ă������A";
		mes "���̔����o�Ă����킯�B";
		next;
		mes "[���C�[�[]";
		mes "�����J������莆�������Ă��񂾂��ǁA";
		mes "���A���̎莆��ǂ��";
		mes "���̂����`�����A������������āc�c";
		next;
		mes "[���C�[�[]";
		mes "�������A���t������ƁA���̎莆��";
		mes "^FF000050�N�ȏ�O^000000�ɏ����ꂽ�莆�Ȃ́B";
		mes " ";
		mes "�킽���A�ǂ����Ă�";
		mes "���̎莆�̎������T�������́B";
		next;
		mes "[���C�[�[]";
		mes "�ł��A50�N�O�̎莆���������āA";
		mes "���̂������ɂ�ł��܂��Ă��āA";
		mes "�����Ƒ���������̕�����";
		mes "�ǂ߂Ȃ��̂�B";
		next;
		mes "[���C�[�[]";
		mes "����łˁA";
		mes "�b�ŕ������񂾂��ǁA";
		mes "���̃A���x���^�̓��̕���";
		mes "����y���̐��Ƃ�";
		mes "����炵���́B";
		next;
		mes "[���C�[�[]";
		mes "�����ŁA���Ȃ���";
		mes "���̐��Ƃ�T���Ă�����āA";
		mes "���̐l��";
		mes "�����Ƒ���������̕�����";
		mes "���ׂė~�����̂�B";
		next;
		mes "[���C�[�[]";
		mes "�͂��A�莆�ƕ�����n���Ă����ˁB";
		mes "�����������A���������������肪";
		mes "������Ă���ӏ���B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A���x���^�̓��̕��p�ɂ���";
		mes "����y���̐��Ƃɉ�]";
		close2;
		viewpoint 1,234,98,11,0x0000FF;
		//�Ȃ�����
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[���C�[�[]";
		mes "�������b�ł́A";
		mes "���̃A���x���^�̓��̕���";
		mes "����y���̐��Ƃ�";
		mes "����炵���́B";
		next;
		mes "[���C�[�[]";
		mes "�����ŁA���Ȃ���";
		mes "���̐��Ƃ�T���Ă�����āA";
		mes "���̐l��";
		mes "�����Ƒ���������̕�����";
		mes "���ׂė~�����̂�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A���x���^�̓��̕��p�ɂ���";
		mes "����y���̐��Ƃɉ�]";
		close2;
		viewpoint 1,234,98,11,0x0000FF;
		end;
	case 3:
		mes "�]���C�[�[�ɕ񍐂��A";
		mes "�莆�̕�����n�����]";
		next;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "����傪^FF0000�m���[�N^000000�ŁA";
		mes "���������肪^FF0000�^�[�j��^000000";
		mes "���Č����̂�!!";
		next;
		emotion 2;
		mes "[���C�[�[]";
		mes "�ނӂӁc�c";
		mes "���̖��O�����Ă͂߂�";
		mes "�������莆��ǂ݂Ȃ�������!";
		next;
	case 99:
		mes "[���C�[�[]";
		mes strcharinfo(0)+"�A";
		mes "���肪�Ƃ��ˁI";
		if('@novice && AC_QUEST_ST_1!=99){
			mes "����͂����B";
			mes "�󂯎���ĂˁB";
		}
		next;
		if('@novice && AC_QUEST_ST_1!=99){
			// 645 �X�s�[�h�A�b�v�|�[�V���� 10��
			if(!checkweight(645,10)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 645,10;
		}
		mes "^FF0000�y�C���B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST02:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�v���Ԃ�I";
		mes "���C�����ˁB";
		next;
		emotion 2;
		mes "[���C�[�[]";
		mes "���̑O�́A";
		mes "�莆�̒������Ă������";
		mes "���肪�Ƃ��ˁI";
		mes "���ꂩ��";
		mes "^FF0000�m���[�N^000000��^FF0000�^�[�j��^000000�ւ̎莆�A";
		mes "������ǂ݂Ȃ�����������B";
		next;
		mes "[���C�[�[]";
		mes "���̂ˁA�����";
		mes "�t�F�C�����ɂ��郍�C�X���Đl��";
		mes "���̉ו���͂��ė~�����́B";
		mes "�z���W�̎q�����䂵�������";
		mes "�^�ׂȂ��Ȃ�������āB";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��B";
		mes "���肢�ˁI";
		mes " ";
		mes "�]" + strcharinfo(0) + "��";
		mes "�ו���a�������]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�t�F�C�����ɍs��";
		mes "���C�X�ɉ���ĉו���n���]";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[���C�[�[]";
		mes "�t�F�C�����ɂ���";
		mes "���C�X���Đl��";
		mes "���̉ו���͂��ė~�����́B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�t�F�C�����ɍs��";
		mes "���C�X�ɉ���ĉו���n���]";
		close;
	case 3:
		mes "�]���C�[�[�ɕ񍐂����]";
		next;
	case 99:
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "����������I";
		mes "�܂��������������́A";
		mes strcharinfo(0) + "��";
		mes "���ނ�ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST03:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�v���Ԃ�I";
		mes "���C�����ˁB";
		next;
		mes "[���C�[�[]";
		mes "���������A���肢���������Ƃ�����́B";
		mes " ";
		mes "�A�}�c�ɂ���A�[�`�{���h";
		mes "���Đl����}�Ȓ����������Ă��A";
		mes "���}���̉ו���͂��ė~�����́B";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��B";
		mes "���肢�ˁI";
		mes " ";
		mes "�]" + strcharinfo(0) + "��";
		mes "�ו���a�������]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A�}�c�ɍs��";
		mes "�A�[�`�{���h�ɉ���ĉו���n���]";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[���C�[�[]";
		mes "�A�}�c�ɂ���A�[�`�{���h";
		mes "���Đl����}�Ȓ����������Ă��A";
		mes "���}���̉ו���͂��ė~�����́B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A�}�c�ɍs��";
		mes "�A�[�`�{���h�ɉ���ĉו���n���]";
		close;
	case 3:
		mes "�]���C�[�[�ɕ񍐂����]";
		next;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "����������I";
		mes "�܂��������������́A";
		mes strcharinfo(0) + "��";
		mes "���ނ�ˁB";
		next;
		mes "[���C�[�[]";
		mes "�莆�̎��Ƃ����A";
		mes "�N�ɂ͊��ӂ��Ă����B";
		next;
		menu "�莆�c�c�������A�m���[�N�̂��ƁI",-;
		mes "�]�A�[�`�{���h���m���[�N�̂��Ƃ�";
		mes "�b���Ă������Ƃ����C�[�[�ɘb�����]";
		next;
		mes "�]���C�[�[�͐��b�ԁA";
		mes "�����~�܂����悤�ɓ������~�܂����B";
		mes "�����āA���񂾁]";
		next;
		emotion 0;
		mes "[���C�[�[]";
		mes "����������������!!";
		mes "�{���ɂ��I";
		mes "�{���ɂ��I�H";
		next;
		mes "[���C�[�[]";
		mes "�m���[�N�c�c";
		mes "�m���[�N����͖{���ɂ����񂾂ˁB";
		next;
		mes "�]���C�[�[�͂��̎莆�̂��Ƃ�";
		mes "�b���������]";
		next;
		mes "[���C�[�[]";
		mes "���̎莆�ˁA";
		mes "�m���[�N���^�[�j�����Đl��";
		mes "�v���|�[�Y����莆�Ȃ́B";
		mes " ";
		mes "�m���[�N�͗b���łˁA";
		mes "�^�[�j���͖��Ƃ̂���l�Ȃ́B";
		next;
		mes "[���C�[�[]";
		mes "�����́A�b���ŁA�N�Ƃ͕s�ލ���";
		mes "��������Ȃ����A";
		mes "�N���ꐶ�K���ɂ���A";
		mes "�Ƃ��������ŏ����Ă����āB";
		mes "�^�[�j���ւ̎v���Ƃ��D�����Ƃ���";
		mes "�܂��Ă��āc�c";
		next;
		emotion 40;
		mes "[���C�[�[]";
		mes "���̎莆��ǂ�ŁA";
		mes "�킽���A�����������M���Ȃ�������āB";
		mes "����Ȃ��Ƃ������Ă݂����ȁA";
		mes "���Ďv����������肵�Ă��c�c";
		next;
		mes "[���C�[�[]";
		mes "�܁A�܂��A����͂����Ƃ��Ă��I";
		mes " ";
		mes "����2�l���K���ɂȂ��Ă���̂��A";
		mes "���̂��̎莆�����܂��Ă����̂��A";
		mes "�Ƃ��ǂ����Ă��m�肽���́B";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�{���ɂ��肪�Ƃ��ˁI";
		mes "�ו����^��ł���������";
		mes "�����������b����������I";
		if('@novice && AC_QUEST_ST_1!=99){
			mes "����͋C������B";
		}
		next;
		if('@novice && AC_QUEST_ST_1!=99){
			if(!checkweight(2101,1)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 2101,1;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[���C�[�[]";
		mes "�A�[�`�{���h���񂪗b���c��";
		mes "�ꏏ���������Č����Ă���̂ˁc�c";
		close2;
		//close �Ȃ̂Ɏ��y�[�W���\�������B�{�I�ǂ���B
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST04:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�v���Ԃ�I";
		mes "���C�����ˁB";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "��";
		mes "���肢������񂾂�B";
		mes "�m���[�N�̂��ƂȂ񂾂��ǁc�c";
		next;
		mes "[���C�[�[]";
		mes "�O��A�A�[�`�{���h����";
		mes "�m���[�N�Ɠ����b���c�ɂ���";
		mes "���Ă����b������������Ȃ��B";
		next;
		mes "[���C�[�[]";
		mes "���͂ˁA���̌�A";
		mes "�ǂ����Ă��A�ǂ��`�`�����Ă��A";
		mes "�m���[�N�̂��Ƃ������痣��Ȃ���";
		mes "�A�[�`�{���h����̂Ƃ����";
		mes "�s�����̂�B";
		next;
		mes "[���C�[�[]";
		mes "����������ˁA";
		mes "�A�[�`�{���h�����";
		mes "�퓬�ŉ�������āA����������";
		mes "�b���c�����߂Ă��܂����񂾂��āB";
		mes "���̌�A�m���[�N�Ɖ�Ȃ��Ȃ���";
		mes "���M�s�ʂȂ񂾂��āB";
		next;
		mes "[���C�[�[]";
		mes "�ł��ˁA���̗b���c����";
		mes "���͂����Ȃ��炵���񂾂��ǁA";
		mes "�R�����������_�ɂ��Ă�������";
		mes "�R�������ɍs����";
		mes "�����킩�邩������Ȃ��A";
		mes "���Č���ꂽ�́B";
		next;
		mes "[���C�[�[]";
		mes "�����ŁA���肢�Ȃ񂾁I";
		mes "�R�������ɍs���āA";
		mes "�b���c�̏��A�m���[�N�̏���";
		mes "�W�߂ė~�����́B";
		next;
		mes "[���C�[�[]";
		mes "�{���́A";
		mes "�킽�����s�������Ƃ��낾���ǁc�c";
		mes "���͂ˁA";
		mes "�����A�[�`�{���h����̂Ƃ����";
		mes "�s�������Č���������Ȃ��H";
		next;
		emotion 4;
		mes "[���C�[�[]";
		mes "�ł��ˁA";
		mes "���̓��A�厖�ȏ��k���������́B";
		mes "����������ۂ�����";
		mes "�s�������̂�����A���q�����";
		mes "���Ȃ�M�p�Ȃ����Ă��܂��āc�c";
		next;
		menu "�ǂ����Ă����܂Łc�c",-;
		mes "[���C�[�[]";
		mes "�m���[�N�ƃ^�[�j���̂��Ƃ�";
		mes "���������痣��Ȃ��̂�c�c";
		mes "�m���[�N�̎莆�Ɏ��̐S��";
		mes "�D���Ă��܂����Ƃ������c�c";
		next;
		mes "[���C�[�[]";
		mes "�ł�����ȏ�A";
		mes "���q����ɐM�p�Ȃ�����";
		mes "���̃��C�[�[���X��";
		mes "�X���Ă��܂��c�c";
		next;
		mes "[���C�[�[]";
		mes "������A";
		mes strcharinfo(0) + "�A";
		mes "���肢�I�R�������ɍs���āA";
		mes "�b���c�̏��A�m���[�N�̏���";
		mes "�W�߂āB";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "�b���c���������ӏ��͂�����B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�R�������ɍs��";
		mes "�b���c�̖{���n���������ꏊ�ɍs���A";
		mes "����T���]";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "�b���c���������ӏ���";
		mes "������ւ�炵����B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�R�������ɍs��";
		mes "�b���c�̖{���n���������ꏊ�ɍs���A";
		mes "����T���]";
		close;
	case 3:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ��������H";
		next;
		mes "�]���C�[�[�ɕ񍐂����]";
		next;
		mes "[���C�[�[]";
		mes "�Q�C�\��������Đl����";
		mes "�A��������̂ˁB";
		mes "�킩������B";
		next;
		emotion 2;
		mes "[���C�[�[]";
		mes "�m���[�N�ɋ߂Â��Ă���";
		mes "�����������˂��I";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�������肪�ƂˁB";
		mes "�{���͎�����A�s�������񂾂��ǁc�c";
		mes "�d���̂����Œ��X�s���Ȃ��Ă��B";
		next;
	case 99:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�ɁA";
		mes "�܂����肢���邱�Ƃ�";
		mes "����Ǝv�����ǁA";
		mes "���̎��͂�낵���ˁB";
		mes "����ɂ��Ă�����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST05:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�v���Ԃ�I";
		next;
		mes "[���C�[�[]";
		mes "���̂ˁA";
		mes "�R�������̃Q�C�\�����񂩂�";
		mes "�A���������񂾂��I";
		next;
		mes "[���C�[�[]";
		mes "�b���c�ɂ������Đl�́A";
		mes "�h�i�e�����Đl�炵���񂾂��ǁA";
		mes "���A���V��ɂ���񂾂��āB";
		next;
		mes "[���C�[�[]";
		mes "������ˁA";
		mes strcharinfo(0) + "�A";
		mes "���肢�I";
		mes "���V��ɍs���āA�h�i�e�������";
		mes "�m���[�N�̂��ƕ����ė~�����񂾁B";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		next;
		mes "[���C�[�[]";
		mes "�E�t�t�A�����";
		mes "�m���[�N�̋��ꏊ���킩�邩���ˁB";
		mes " ";
		mes "�m���[�N�ƃ^�[�j���͍�";
		mes "�K���ɂ���Ă�̂�����B";
		next;
		mes "[���C�[�[]";
		mes "���̗\�z�I";
		mes "�m���[�N�̓^�[�j����";
		mes "�K�ɂ�����Ă���B";
		next;
	case 2:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "���肢�ˁI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���V��ɂ���h�i�e���ɉ�A";
		mes "�m���[�N�ɂ��ĕ����]";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 3:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ��������H";
		mes "�m���[�N�̂��Ƃ킩�����H";
		mes "�����ċ����āB";
		next;
		menu "�c�c",-;
		mes "�]���C�[�[�Ƀm���[�N��";
		mes "50�N�O�A�펀���Ă������Ƃ�񍐂����]";
		next;
		emotion 9;
		mes "[���C�[�[]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[���C�[�[]";
		mes "�]���C�[�[��";
		mes "�����~�܂����悤�ɁA";
		mes "�������~�܂����B";
		mes "�����ĐÂ��ɁA�������Ƙb�����]";
		next;
		mes "[���C�[�[]";
		mes "�R�c�c";
		mes "�ł���H";
		next;
		mes "[���C�[�[]";
		mes "�����āc�c";
		mes "�^�[�j���Ɓc�c";
		mes "�K���ɕ�炵�Ă���񂶂�Ȃ��́H";
		next;
		menu "�^�[�j���ƌ������Ă��Ȃ�����",-;
		emotion 9;
		mes "[���C�[�[]";
		mes "�c�c�c�c";
		next;
		mes "�]���C�[�[�͍������Ă���c�c�]";
		next;
		mes "[���C�[�[]";
		mes "���Ⴀ�A���́c�c";
		mes "�莆�c�c�́H";
		next;
		mes "�]�����炭�A���̎莆�̓m���[�N��";
		mes "�^�[�j���ɏ��������̂ɂ�";
		mes "�ԈႢ�Ȃ����낤�B�������A�m���[�N��";
		mes "�莆���^�[�j���ɓn�����ƂȂ��A";
		mes "�킢�̏�ŎU���Ă������c�c";
		mes strcharinfo(0) + "��";
		mes "�����v�����]";
		next;
		mes "[���C�[�[]";
		mes "����Ȃ̂��āc�c";
		next;
		mes "[���C�[�[]";
		mes "�ł��A�^�[�j���c�c";
		mes "�^�[�j����";
		mes "�����Ă���񂾂�ˁc�c";
		next;
		mes "[���C�[�[]";
		mes "�^�[�j���ɉ���āc�c";
		mes "�b�𕷂������c�c";
		if('@novice){
			mes strcharinfo(0) + "�A";
			mes "����A���ׂĂ����������c�c";
		}
		next;
		if('@novice){
			if(!checkweight(2503,1)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 2503,1;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[���C�[�[]";
		mes "�ł��A�^�[�j���c�c";
		mes "�^�[�j����";
		mes "�����Ă���񂾂�ˁc�c";
		mes "�^�[�j���ɉ���āc�c";
		mes "�b�𕷂������c�c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST06:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�����ĕ����āI";
		next;
		mes "[���C�[�[]";
		mes "�^�[�j���̋��ꏊ�����������̂�I";
		next;
		mes "[���C�[�[]";
		mes "���͂ˁA���ꂩ��";
		mes "�^�[�j���̂��Ƃ��C�ɂȂ��āA";
		mes "�����ƒ��ׂĂ����́B";
		next;
		mes "[���C�[�[]";
		mes "�莆���Ɩ��Ƃ��Ă��邩��A";
		mes "������������m���Ă���l�����邩���A";
		mes "���Ďv���Ă��B";
		next;
		mes "[���C�[�[]";
		mes "��������ˁA";
		mes "���̎���̂���l��";
		mes "�m���Ă���l�������̂���I";
		mes "�^�[�j���́A^FF0000�^�[�j���E�O�����J^000000";
		mes "���Ă������O�炵���́B";
		next;
		mes "[���C�[�[]";
		mes "^FF0000�O�����J��^000000���āA���܂�A";
		mes "�\����ɂ͏o�Ȃ��񂾂��ǁA";
		mes "���̐��E�ł�";
		mes "���Ȃ�m���Ă���񂾂��āB";
		next;
		menu "���̐��E�c�c",-;
		mes "[���C�[�[]";
		mes "����ŁA���̐l��";
		mes "�ǂ����Ă��^�[�j����";
		mes "��������ė��ݍ��񂾂�ˁA";
		mes "���̐l�A�O�����J�Ƃ̐l��";
		mes "�`���Ă���Ă��́B";
		next;
		mes "[���C�[�[]";
		mes "�����āA";
		mes "�O�����J�Ƃ̐l����";
		mes "�A���������̂��I";
		next;
		mes "[���C�[�[]";
		mes "�A���^���ŁA";
		mes "�܂��鏑�ɉ���ė~�����񂾂��āB";
		mes "�^�[�j���ɉ���߂ɂ́A";
		mes "�F�X�ƃ`�F�b�N��";
		mes "�K�v�炵���̂�B";
		next;
		mes "[���C�[�[]";
		mes "������A";
		mes "���������A�A���^���ɍs����I";
		mes "���Č��������Ƃ���Ȃ񂾂��ǁc�c";
		next;
		menu "�d���ł���",-;
		mes "[���C�[�[]";
		mes "�����Ȃ̂�c�c";
		mes "���Ԃ��Ȃ��āA�ƂĂ�����Ȃ����ǁA";
		mes "�A���^���Ȃ�čs���Ȃ��̂�B";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "���̑㗝�ŁA�A���^���ɍs����";
		mes "���̔鏑�̐l�ɉ���ė~�����́B";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "���肪�Ƃ��I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A���^���ɍs���A";
		mes "�O�����J�Ƃ̔鏑�ɉ�]";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "���̑㗝�ŁA�A���^���ɍs����";
		mes "���̔鏑�̐l�ɉ���ė~�����́B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A���^���ɍs���A";
		mes "�O�����J�Ƃ̔鏑�ɉ�]";
		close;
	case 3:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ��������H";
		next;
		mes "�]���C�[�[�ɕ񍐂����]";
		next;
		mes "[���C�[�[]";
		mes "�킩������B";
		mes "�܂��������炽�߂�";
		mes "���ɘA��������̂ˁB";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "���̑����";
		mes "�A���^���܂ōs���Ă������";
		mes "���肪�ƂˁI";
		next;
		menu "�����A�|�������c�c",-;
		mes "[���C�[�[]";
		mes "�|���������āH";
		mes "�N�A����Ȃ���";
		mes "�����Ă��Ⴞ�߂�����B";
		mes "�������`�����x����";
		mes "�厖�Ȃ񂾂���B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "���̑����";
		mes "�A���^���܂ōs���Ă������";
		mes "���肪�ƂˁI";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST07:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�v���Ԃ�I";
		next;
		mes "[���C�[�[]";
		mes "����́A�E���o���ɂ���";
		mes "�f�j�X���Đl��";
		mes "���̉ו���͂��ė~�����́B";
		mes "�z���W�̎q���܂����������";
		mes "�^�ׂȂ��Ȃ�������āB";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��B";
		mes "���肢�ˁI";
		mes " ";
		mes "�]" + strcharinfo(0) + "��";
		mes "�ו���a�������]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�E���o���ɍs���A";
		mes "�f�j�X�ɉ���ĉו���n���]";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		mes "[���C�[�[]";
		mes "�E���o���ɂ���";
		mes "�f�j�X���Đl��";
		mes "���̉ו���͂��ė~�����́B";
		mes "�z���W�̎q���܂����������";
		mes "�^�ׂȂ��Ȃ�������āB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�E���o���ɍs���A";
		mes "�f�j�X�ɉ���ĉו���n���]";
		close;
	case 3:
		mes "�]���C�[�[�ɕ񍐂����]";
		next;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "����������I";
		mes strcharinfo(0) + "��";
		mes "����ς藊��ɂȂ��ˁI";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�b�͕ς�邯�ǁA";
		mes "�܂��^�[�j������";
		mes "�A�������Ȃ��̂�B";
		next;
		emotion 40;
		mes "[���C�[�[]";
		mes "�����͘A�������ĂȂ����ȁA";
		mes "���ĕ��ɖ����A�h�L�h�L���Ȃ���";
		mes "�߂����Ă���́B";
		if('@novice) {
			mes " ";
			mes "����A����̂��炾��B";
		}
		next;
		if('@novice) {
			if(!checkweight(610,6)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "����������I";
		mes strcharinfo(0) + "��";
		mes "����ς藊��ɂȂ��ˁI";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�b�͕ς�邯�ǁA";
		mes "�܂��^�[�j������";
		mes "�A�������Ȃ��̂�ˁB";
		mes "�A��������̂��҂���������B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�I";
		mes "�҂��Ă����̂�I";
		next;
		emotion 40;
		mes "[���C�[�[]";
		mes "�����̂�A�����̂�I";
		mes "�^�[�j������莆�������̂���B";
		mes " ";
		mes "�^�[�j���́A";
		mes "���R���h�̕ʑ��ɂ���炵����B";
		next;
		mes "[���C�[�[]";
		mes "����A�V�тɗ��ė~��������";
		mes "�����Ă���́B";
		mes " ";
		mes "�����A�������ɂł��s�������c�c";
		mes "�s���āA�^�[�j���̎���";
		mes "�F�X����������B";
		next;
		mes "[���C�[�[]";
		mes "�ł��A���ˁA";
		mes "�d���ō��A�R���h�ɍs���Ȃ�āA";
		mes "��΂ɖ����Ȃ̂�c�c";
		mes " ";
		mes "�͂����A�炢�c�c";
		next;
		mes "[���C�[�[]";
		mes "�c�c";
		mes "������";
		mes strcharinfo(0) + "�A";
		mes "���肢�A���̑����";
		mes "�R���h�ɍs���Ă���Ȃ����ȁH";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "���Ⴀ�A";
		mes strcharinfo(0) + "��";
		mes "�����n���ˁB";
		next;
		mes "�]���C�[�[����";
		mes "�m���[�N�̎莆����ꂽ��";
		mes "���󂯂Ƃ����]";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�^�[�j���ɐF�X�ƕ����ė~�������ǁA";
		mes "�C�������ĕ����ė~�����́B";
		mes "�m���[�N�͂������Ȃ��킯�����A";
		mes "�����ƁA�^�[�j���ɂ́A";
		mes "���̒U�߂��񂪂���Ǝv���́B";
		next;
		mes "[���C�[�[]";
		mes "�����炳�A�^�[�j���Ƃ��Ă͂��A";
		mes "���܂�ߋ��ɐG��Ăق����Ȃ���";
		mes "��������Ȃ����c�c";
		next;
		mes "[���C�[�[]";
		mes "������A����ȕ��͋C��������A";
		mes "���̔���n���Ȃ��ŁA";
		mes "�����ċA���Ă��ĂˁB";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "���肢�ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�R���h�ɍs���A";
		mes "�^�[�j���ɉ�]";
		close2;
		set AC_QUEST_ST_1,2;
		end;
	case 2:
		//������ �Y��Ă��E�E�E
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�^�[�j���ɐF�X�ƕ����ė~�������ǁA";
		mes "�C�������ĕ����ė~�����́B";
		mes "�m���[�N�͂������Ȃ��킯�����A";
		mes "�����ƁA�^�[�j���ɂ́A";
		mes "���̒U�߂��񂪂���Ǝv���́B";
		next;
		mes "[���C�[�[]";
		mes "�����炳�A�^�[�j���Ƃ��Ă͂��A";
		mes "���܂�ߋ��ɐG��Ăق����Ȃ���";
		mes "��������Ȃ����c�c";
		next;
		mes "[���C�[�[]";
		mes "������A����ȕ��͋C��������A";
		mes "���̔���n���Ȃ��ŁA";
		mes "�����ċA���Ă��ĂˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�R���h�ɍs���A";
		mes "�^�[�j���ɉ�]";
		close;
	case 3:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ��������H";
		next;
		mes "�]���C�[�[��";
		mes "�m���[�N�������Ă������ƁA";
		mes "�m���[�N�ƃ^�[�j����";
		mes "�������čK���ɂȂ��Ă��邱��";
		mes "�Ȃǂ�񍐂����]";
		next;
		mes "�]���C�[�[��";
		mes "�ڂɂ����ς��̗܂�";
		mes "���߂Ȃ��畷���Ă���]";
		next;
		mes "[���C�[�[]";
		mes "�m���[�N�����������񂾂ˁc�c";
		mes "�������A�^�[�j���ƌ�������";
		mes "�K���ɂȂ��Ă����񂾂ˁc�c";
		next;
		mes "[���C�[�[]";
		mes "�悩�����c�c";
		mes "�{���ɂ悩�����悧�B";
		next;
		mes "[���C�[�[]";
		mes "�������A�����n����������";
		mes "�A�N�Z�T�����o�Ă��āc�c";
		mes "2�l�����ł����";
		mes "�悩�����c�c";
		mes "���̂�������ƁA";
		mes "�Ӗ����������񂾂ˁc�c";
		next;
	case 99:
		mes "[���C�[�[]";
		mes "�c�c�@�O�X��";
		mes "���A�d����������������A";
		mes "��΂Ƀm���[�N�ƃ^�[�j����";
		mes "��ɍs���ˁc�c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	}
L_QUEST09:
	switch(AC_QUEST_ST_1) {
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�҂��Ă����B";
		next;
		mes "[���C�[�[]";
		mes "�{���Ɏ莆�̌��ł�";
		mes "���肪�ƂˁB";
		mes "�����ŁA�����";
		mes "���肢�Ȃ񂾂��ǁc�c";
		next;
		mes "[���C�[�[]";
		mes "���͂��A";
		mes "�m���[�N�ƃ^�[�j���̎莆�ɂˁA";
		mes "���̂�����������������āB";
		mes "���\�N�O�̎v�����A";
		mes "���͂��݂����Ȃ̂������`�B";
		next;
		mes "[���C�[�[]";
		mes "����łˁA";
		mes "�����莆��������";
		mes "�ǂ����ɖ��߂����̂�B";
		mes "���\�N��ɓ͂��悤�ɂ˂��I";
		next;
		mes "[���C�[�[]";
		mes "�c�c";
		mes "�ł��ˁA�v�����������肪���Ȃ��́c";
		mes "�d����؂̎��ɍD���Ȑl�Ȃ�āc�c";
		next;
		mes "[���C�[�[]";
		mes "�����ŁA�N������I";
		mes "�N�ɂ��莆�������ė~�����񂾂�B";
		mes "�����ƁA";
		mes "�ʂɌN�̎����D��������";
		mes "�����Ă�킯����Ȃ���B";
		next;
		mes "[���C�[�[]";
		mes "�m���[�N�ƃ^�[�j���̊�Ղɂ���";
		mes "���ɑ̌����āA�������킩��������";
		mes "�Ƃ����Ӗ��ŁA";
		mes "�N�ɏ����ė~�����񂾂�B";
		next;
		mes "[���C�[�[]";
		mes "���́A�N���ĂɎ莆�������A";
		mes "�N�́A�����ĂɎ莆�������A";
		mes "�Ȃ�ł��������炳�A";
		mes "�����Ă݂悤��B";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "���Ⴀ���A";
		mes "�A���x���^�̒��ł��A";
		mes "���߂�ꏊ�����ׂė~�����񂾁B";
		next;
		menu "�킩����",-;
		mes "[���C�[�[]";
		mes "���肪�Ƃ��I";
		mes "���Ⴀ�A���肢�ˁB";
		mes "��̂��̂����肪���߂�̂�";
		mes "�������ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A���x���^�̒���";
		mes "���𖄂߂�̂�";
		mes "�K���ȏꏊ��T���]";
		close2;
		set AC_QUEST_ST_1,2;
		viewpoint 1,107,59,11,0x0000FF;
		//�Ȃ�����
		end;
	case 2:
		mes "[���C�[�[]";
		mes "�A���x���^�̒��ł��A";
		mes "�莆�𖄂߂�ꏊ��";
		mes "���ׂė~�����񂾁B";
		mes "��̂��̂����肪���߂�̂�";
		mes "�������ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�A���x���^�̒���";
		mes "���𖄂߂�̂�";
		mes "�K���ȏꏊ��T���]";
		close2;
		viewpoint 1,107,59,11,0x0000FF;
		//�Ȃ�����
		end;
	case 3:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ��������H";
		next;
		mes "�]�������ꏊ���������]";
		next;
		mes "[���C�[�[]";
		mes "���Ⴀ�A�����ɖ��߂܂��傤�B";
		mes "���̂ق��́A";
		mes "�N�ւ̎莆�����������B";
		mes "�N�����A�����ĂˁB";
		next;
		mes "�]�K���ɂ��낢��Ə������B";
		mes "�Ō�ɁA���C�[�[�ɂ��āA";
		mes "�v���Ă��鎖��";
		mes "���̂܂ܐ����ɏ������]";
		next;
		mes "�]�悵�A����Ŋ����B";
		mes "�莆�����C�[�[�ɓn�����]";
		next;
		mes "[���C�[�[]";
		mes "���A�����Ă��ꂽ�̂ˁI";
		mes "���肪�Ƃ��B";
		mes "��ŁA�����莆�𔠂ɓ����";
		mes "���߂Ă�����ˁB";
		next;
		mes "[���C�[�[]";
		mes "50�N�͂������ɒ�������A";
		mes "���`��A�����˂��B";
		mes "10�N��I";
		mes "10�N��Ɍ@��N�����܂��傤�B";
		next;
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "10�N��Ɍ@��N�����܂��傤�B";
		mes "�񑩂���B";
		if('@novice){
			mes "����A������̋C�����B";
			mes "�������肪�Ƃ��ˁB";
		}
		next;
		if('@novice){
			switch(Job){
			case Job_Swordman:
				set '@item,2105;
				set '@ammount,1;
				break;
			// �V�[���h[0] 1��
				case Job_Archer:
			case Job_Magician:
			case Job_TaeKwon:
				set '@item,568;
				set '@ammount,50;
				break;
			// ������ 50��
			case Job_Acolyte:
			case Job_Thief:
			case Job_Merchant:
				set '@item,2103;
				set '@ammount,1;
				break;
			// �o�b�N���[[0] 1��
			case Job_Gunslinger:
				set '@item,12151;
				set '@ammount,10;
				break;
			// �V���o�[�o���b�g�P�[�X 10��
			case Job_Ninja:
				set '@item,2119;
				set '@ammount,1;
				break;
			// ��b��[0] 1��
			case Job_SuperNovice:
			default:
				set '@item,2113;
				set '@ammount,1;
				break;
				// �m�[�r�X�V�[���h[1] 1��
			}
			if(!checkweight('@item,'@ammount)){
				mes "�]�d�ʃI�[�o�[�]";
				close;
			}
			getitem '@item,'@ammount;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_1,99;
		end;
	case 99:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "10�N��Ɍ@��N�����܂��傤�B";
		mes "�񑩂���B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_CLEAR:
	mes "[���C�[�[]";
	mes "��`���I";
	mes "�撣���Ďd������";
	mes "�����A�m���[�N�ƃ^�[�j����";
	mes "��ɍs�����I";
	close;
L_OTHER:
	switch(AC_QUEST_LV_1){
	case 0:
		mes "[���C�[�[]";
		mes "����ɂ��́I";
		mes "�킽���̓��C�[�[�B";
		mes "�ŋ߁A�A���x���^��";
		mes "�����z���Ă����񂾁B";
		mes "��낵���ˁI";
		close;
	case 1:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�莆�̒������Ă������";
		mes "���肪�ƂˁI";
		close;
	case 2:
		mes "[���C�[�[]";
		mes "�莆�̎��Ƃ����A";
		mes "�N�ɂ͊��ӂ��Ă����B";
		close;
	case 3:
		mes "[���C�[�[]";
		mes "�A�[�`�{���h���񂪗b���c��";
		mes "�ꏏ���������Č����Ă���̂ˁc�c";
		close;
	case 4:
		mes "[���C�[�[]";
		mes "�Q�C�\��������Đl����";
		mes "�A��������̂ˁB";
		mes "�킩������B";
		close;
	case 5:
		mes "[���C�[�[]";
		mes "�^�[�j���ɉ���āc�c";
		mes "�b�𕷂������c�c";
		close;
	//������
	case 6:
		mes "[���C�[�[]";
		mes "�܂��^�[�j������";
		mes "�A�������Ȃ��̂�ˁB";
		mes "�A��������̂��҂���������B";
		close;
	//������
	case 7:
		mes "[���C�[�[]";
		mes strcharinfo(0) + "�A";
		mes "�莆�̒������Ă������";
		mes "���肪�ƂˁI";
		close;
	case 8:
	case 9:
		mes "[���C�[�[]";
		mes "��`���I";
		mes "�撣���Ďd������";
		mes "�����A�m���[�N�ƃ^�[�j����";
		mes "��ɍs�����I";
		close;
	}
}
alberta.gat,234,98,3	script	�E�l	847,{
	if(AC_QUEST_LV_1!=0) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		goto L_MISSION;
	case 3:
		goto L_CLEAR;
	case 99:
		goto L_REPORT;
	default:
		goto L_OTHER;
	}
L_MISSION:
	mes "[�E�l]";
	mes "�c�c";
	next;
	menu "�����܂���",-;
	mes "[�E�l]";
	mes "�c�c";
	mes " ";
	mes "���ށA";
	mes " ";
	mes "�Ȃ񂶂�c�c";
	next;
	menu "���Ȃ�������y���ɏڂ������ł����H",-;
	mes "[�E�l]";
	mes "�c�c";
	mes " ";
	mes "���A";
	next;
	mes "[�E�l]";
	mes "��������c�c";
	mes " ";
	mes "���̓��c�c";
	mes " ";
	mes " ";
	mes "80�N�c�c����c�c";
	next;
	mes "�]�莆�̕�����n���A";
	mes "�������������]";
	next;
	mes "�]�E�l�́A��������Ɏ��A";
	mes "���̂܂܂��΂炭�����Ȃ��]";
	next;
	menu "���̂��c�c",-;
	mes "[�E�l]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	next;
	menu "���̂��A�����܂���c�c",-;
	mes "[�E�l]";
	mes "�c�c���A";
	mes "����";
	mes "�����c�c������Ƃ�B";
	mes "����";
	mes "�c�c�󂯎���";
	next;
	mes "�]�I";
	mes "�E�l����莆���󂯎��B";
	mes "�莆�̕����ɂ́A";
	mes "����傪^FF0000�m���[�N^000000";
	mes "���葊���^FF0000�^�[�j��^000000";
	mes "�Ə����Ă���I";
	mes "���̂܂Ɂc�c�]";
	next;
	mes "[�E�l]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	next;
	set AC_QUEST_ST_1,3;
	/////////
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]���C�[�[�ɕ񍐂���]";
	close;
L_CLEAR:
	mes "[�E�l]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	next;
	mes "�]���ɓ����ɂ߂��l�������]";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]���C�[�[�ɕ񍐂���]";
	close;
L_REPORT:
	mes "[�E�l]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	close;
L_OTHER:
	mes "[�E�l]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	next;
	mes "�]�V�l�����������߂Ă���B";
	mes "�����Ƃ��Ă������]";
	close;
}
payon.gat,216,120,4		script	���C�X	928,{
	if(AC_QUEST_LV_1!=1) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "[���C�X]";
		mes "���ɗp�����H";
		next;
		mes "�]���C�[�[����a�������ו���n�����]";
		next;
	case 3:
		emotion 0;
		mes "[���C�X]";
		mes "�����A����Ɠ͂������I";
		mes "���肪�Ƃ�I";
		mes "���C�[�[�ɂ�낵��";
		mes "�����Ă����Ă���I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	}
L_OTHER:
	mes "[���C�X]";
	mes "�悤�I";
	mes "���̓��C�X���Č����񂾁B";
	mes "�����������V�C�ōō������I";
	close;
}
amatsu.gat,212,141,4	script	�A�[�`�{���h	120,{
	if(AC_QUEST_LV_1==2 && AC_QUEST_ST_1==3) goto L_REP;
	if(AC_QUEST_LV_1>=8) goto L_CLEAR;
	mes "[�A�[�`�{���h]";
	mes "�킵�̖��̓A�[�`�{���h����B";
	mes "�킵�͍ŋ߂̎�҂̗�V�̂Ȃ�";
	mes "�ɓ{���Ƃ�I";
	mes "�ŋ߂̎Ⴂ�҂͔N���̘b��";
	mes "�S��������I";
	if(AC_QUEST_LV_1!=2 || AC_QUEST_ST_1!=2) close;
	next;
	menu "�ו���n��",-;
	mes "�]�A�[�`�{���h�ɁA���C�[�[���";
	mes "�a�������ו���n�����]";
	next;
	mes "[�A�[�`�{���h]";
	mes "�����A�����͂������I";
	mes "���܂�����������ȁI";
	mes "���C�[�[���X�c�c";
	mes "���ꂩ�������݂ɂ������̂��B";
	next;
	menu "����ł́A�܂�",-;
	mes "[�A�[�`�{���h]";
	mes "�܂��A�҂āB";
	mes "������������B";
	mes "������肵�Ă������悢�B";
	mes "�킵�̘b�𕷂��Ă���񂩂̂��B";
	mes "�킵�̎Ⴂ���̘b����B";
	mes "�킵���Ⴂ���c�c";
	next;
	emotion 54,"";
	mes "^FF0000�]30���o�߁]^000000";
	next;
	mes "[�A�[�`�{���h]";
	mes "�킵�́A50�N�ȏ�O�A";
	mes "�b���c�ɂ����񂶂��I";
	mes "���̂���A�킵�̓q�[�������ӂł̂��B";
	mes "�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c";
	mes "�F�A�킵�𑸌h���Ă������c�c";
	next;
	emotion 54,"";
	mes "^FF0000�]1���Ԍo�߁]^000000";
	mes " ";
	mes "�]�b�������Ă炢�c�c�]";
	next;
	mes "[�A�[�`�{���h]";
	mes "�����łȂ��A�킵��";
	mes "�����Ă�����񂶂�I";
	mes "����������A�z�͉��ƌ������Ǝv���H";
	mes "�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c";
	mes "���n�n�n�n�n!! �c�c�c�c";
	next;
	emotion 54,"";
	mes "^FF0000�]2���Ԍo�߁]^000000";
	mes " ";
	mes "�]�b�������Ė{���ɂ炢�c�c�]";
	next;
	mes "[�A�[�`�{���h]";
	mes "����ł̂��A";
	mes "�킵������Ȃ�ɏ��q�ɂ��ĂĂ̂��B";
	mes "�������A�d�h�Ȃ킵�Ƃ��Ắc�c";
	mes "�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c";
	next;
	mes "^FF0000�]3���Ԍo�߁]^000000";
	mes " ";
	mes "�]���̎��I�c�c�]";
	next;
	mes "[�A�[�`�{���h]";
	mes "�b���c�ɂ�^FF0000�m���[�N^000000�Ƃ���";
	mes "�킵�̖���̐e�F�������Ă̂��B";
	mes "���������킢�B";
	mes "^FF0000�m���[�N^000000�Ƃ܂��A";
	mes "�����ނ݂��킵�����킢�B";
	next;
	mes "�]^FF0000�m���[�N^000000�H";
	mes "�ǂ����ŕ������悤�ȁ]";
	next;
	mes "^FF0000�]5���Ԍo�߁]^000000";
	next;
L_REP:
	mes "[�A�[�`�{���h]";
	mes "���낻�남�Ђ炫�ɂ��邩�̂��B";
	mes "���܂������";
	mes "���΂炵����҂���B";
	mes "�ŋ߂̎�҂ɂ�";
	mes "���܂�����݂����Ȃ��";
	mes "����񂶂�̂��B";
	next;
	menu "�c�c",-;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]���C�[�[�ɕ񍐂���]";
	close2;
	set AC_QUEST_ST_1,3;
	end;
L_CLEAR:
	mes "�]�m���[�N���R���h�Ō��C�ɂ��Ă���";
	mes "���Ƃ�`�����]";
	next;
	mes "[�A�[�`�{���h]";
	mes "�����A�{�����I";
	mes "�m���[�N�̂�A";
	mes "�R���h�Ō��C�ł���Ă������I";
	mes "�Ȃ�΁A���x�A����������";
	mes "�R���h�ɂ������̂��B";
	mes "�y���݂���̂��I";
	close;
}
gonryun.gat,140,65,4	script	�Q�C�\��	777,{
	if(AC_QUEST_LV_1==3 && AC_QUEST_ST_1==3) goto L_REP;
	mes "[�Q�C�\��]";
	mes "�́A������ւ�ɂȂ��B";
	mes "�����ȗb���c�������񂶂��B";
	mes "�ނ�́A�����X�^�[����";
	mes "��������Ă��ꂽ�񂶂�B";
	if(AC_QUEST_LV_1!=3 || AC_QUEST_ST_1!=2) close;
	next;
	menu "�ڂ��������Ă���܂���",-;
	mes "[�Q�C�\��]";
	mes "�b���c�ɋ���������̂��B";
	mes "�����m�肽���񂶂�H";
	next;
	menu "�m���[�N�Ƃ����l�͂��܂���ł������H",-;
	mes "[�Q�C�\��]";
	mes "�m���[�N�c�c";
	mes "���܂ʂ��A���߂ĕ������O����B";
	mes "�킵�́A���̗b���c�̗b��������";
	mes "���ۂɒm���Ă��邪�A";
	mes "�m���[�N�Ƃ����j�͒m��ʂ�B";
	next;
	mes "[�Q�C�\��]";
	mes "�������ɁA�킵���S����";
	mes "�m���Ă���킯�ł͂Ȃ�����̂��B";
	next;
	menu "�����ł����c�c",-;
	mes "[�Q�C�\��]";
	mes "����ȔߒɂȊ������ł���B";
	mes "�c�c�c�c";
	mes "���̊炩�炷��ƁA";
	mes "�Ȃɂ��������悤����ȁB";
	next;
	mes "[�Q�C�\��]";
	mes "�킩�����B";
	mes "�킵�ɏ������Ԃ�����ʂ��H";
	mes " ";
	mes "���́A�킵�̒m�荇���ɁA���ۂ�";
	mes "���̗b���c�ɂ����j������񂶂�B";
	mes "����ɕ����΂�������낤�B";
	next;
	mes "[�Q�C�\��]";
	mes "�����A�����";
	mes "�킵�Ɠ����悤�ȔN�Ȃ̂ɁA";
	mes "���̑嗤���u���u���Ɨ����Ă����ĂȁB";
	mes "�s����͂ނ̂ɁA���X���Ԃ�������B";
	next;
	menu "���肪�Ƃ��������܂��I",-;
	mes "[�Q�C�\��]";
	mes "�������킩������";
	mes "�킵�̕�����A������킢�B";
	mes "�ǂ��ɘA������΂�����";
	mes "�����Ă���Ȃ����̂��B";
	next;
	mes "�]���C�[�[�̏Z�����������]";
	next;
L_REP:
	mes "[�Q�C�\��]";
	mes "�����莟��A�A�������B";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]���C�[�[�ɕ񍐂���]";
	close2;
	set AC_QUEST_ST_1,3;
	end;
}
louyang.gat,229,109,4	script	�V�l	866,{
	if(AC_QUEST_LV_1!=4 || AC_QUEST_ST_1!=2) goto L_OTHER;
	emotion 52;
	mes "[�V�l]";
	mes "�ق��A����͐�i����킢�B";
	mes " ";
	mes "�]�V�l���ׂɂ��鏗����";
	mes "���߂Ă���]";
	next;
	mes "[�V�l]";
	mes "���̐��E�ɂ́A";
	mes "�܂��܂�����Ȕ��l�����邩��";
	mes "���͂�߂��Ȃ��񂶂�c�c";
	mes "�͂��������A���Ƃ��c�c";
	mes "�u�c�u�c�c�c";
	next;
	menu "�h�i�e������ł����H",-;
	mes "[�h�i�e��]";
	mes "�������A�Ȃ񂶂�I";
	mes "�c�c";
	mes "�}�ɘb��������ł������B";
	mes "�т����肵���킢�B";
	next;
	menu "�������Ă�����ł����H",-;
	mes "[�h�i�e��]";
	mes "���ށA���ɂ��鏗����";
	mes "�����ƌ��Ă����񂶂��B";
	mes "���̂��������l�ł̂��B";
	mes "�����ɂ���񂩂����B";
	mes "���E�ł��A���X����Ȕ��l�͂����B";
	next;
	emotion 0,"����#AC_QUE01";
	mes "[����]";
	mes "�I";
	next;
	mes "[�h�i�e��]";
	mes "���E�ł��A���X����Ȕ��l�͂����B";
	mes "�킵�͂���Ȕ��l�ɏ��荇�����߂�";
	mes "�嗤���𗷂��Ă���񂶂�B";
	mes "�Ƃ���ŁA�킵�ɉ����p���̂��H";
	next;
	emotion 9;
	mes "�]�h�i�e���ɁA";
	mes "�b���c�ɂ��ĕ������B";
	mes "�����āA���̗b���c�Ƀm���[�N��";
	mes "�������������B";
	mes " ";
	mes "�h�i�e���̊炪�����������Ȃ����]";
	next;
	mes "[�h�i�e��]";
	mes "�b���c�̘b���A";
	mes "�����̘̂b����ȁB";
	mes "���܂����肽���b�ł��Ȃ����c";
	mes "�c�c";
	mes "�m���[�N�ɂ��Ēm�肽���̂��H";
	next;
	menu "�͂��B",-;
	mes "[�h�i�e��]";
	mes "�������c�c";
	mes "�悩�낤�B";
	mes "�m���[�N�̂��Ƃ͊o���Ă��邼�B";
	mes "���`���������A�D�����j��������B";
	next;
	menu "���A�ǂ��ɂ��邩�m���Ă��܂����H",-;
	mes "[�h�i�e��]";
	mes "�c�c�c�c";
	next;
	emotion 0,"";
	mes "[�h�i�e��]";
	mes "�m���[�N��50�N�O�A";
	mes "�����X�^�[�Ƃ̐킢��";
	mes "�펀���Ă��܂�����c�c";
	mes "�c�O���Ⴊ�B";
	next;
	menu "���H",-;
	mes "[�h�i�e��]";
	mes "���̐킢�ɂ́A";
	mes "�킵���Q�������񂶂�B";
	mes "�c�c�c�c";
	mes "�m���[�N�������X�^�[�ɂ����p���A";
	mes "�킵�͂��̖ڂŌ����c�c";
	mes "��u��������B";
	next;
	menu "�c�c���l�̃^�[�j����m���Ă��܂����H",-;
	mes "[�h�i�e��]";
	mes "�^�[�j���H";
	mes "�����������Ȃ��B";
	mes "�m���[�N�́A���܂肻�������b��";
	mes "���Ȃ���������̂��B";
	mes "�����A�m���[�N��";
	mes "�����͂��Ă��Ȃ��������B";
	next;
	mes "�]���Ƃ������Ƃ��낤�c�c";
	mes "���C�[�[�ɕ񍐂���̂��炢�B";
	mes "�h�i�e���ɁA";
	mes "�炢�ߋ��̘b��";
	mes "�����Ă��܂������Ƃ�̂т��]";
	/*�u�l�т��v�ł͂Ȃ��B�{�I�ʂ�*/ next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]���C�[�[�ɕ񍐂���]";
	close2;
	set AC_QUEST_ST_1,3;
	end;
L_OTHER:
	if(AC_QUEST_LV_1<4){
		mes "[�V�l]";
		mes "�킵�̉��ɂ��鏗���A";
		mes "�Y�킶��̂��B";
		mes "���܂�Ȃ��킢�c�c";
		close;
	}
	mes "[�h�i�e��]";
	mes "���̍��́A";
	mes "�b���ɂ͔߂�������b��";
	mes "�����񂶂��c�c";
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==3){
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close;
	}
	if(AC_QUEST_LV_1<8) close;
	next;
	mes "�]�h�i�e���ɁA�m���[�N��";
	mes "�����Ă������Ƃ��������]";
	next;
	mes "[�h�i�e��]";
	mes "�Ȃ�Ƃ��I";
	mes "�m���[�N�͐����Ă��������I";
	mes "�{�������I�H";
	next;
	menu "�͂��B",-;
	mes "[�h�i�e��]";
	mes "�������c�c";
	mes "���x�́A�R���h�ɍs����";
	mes "���50�N�Ԃ�̎���";
	mes "�ނ݌��킷���I";
	close;
}
louyang.gat,233,109,4	script	����#AC_QUE01	66,{
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==3){
		mes "[����]";
		mes "�����܂ŁA�͂����茾���l��";
		mes "��������ˁc�c";
		mes "������邯�ǁB";
		mes "�܂��A���𐢊E�̔��l��";
		mes "�����Ă��ꂽ�̂͊��������ȁB";
		close;
	}
	mes "[����]";
	mes "����������A���ɂ��邨���������";
	mes "���̕����W���W�����Ă���悤�ȁc�c";
	mes " ";
	mes "�C�̂�����ˁB";
	close;
}
ayothaya.gat,212,176,4		script	�f���[�C	109,{
	if(AC_QUEST_LV_1!=5) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "�]�ꌩ�A�a�m�̂悤�Ɍ����邪�A";
		mes "���̂��������݂�����B";
		mes "���Ȃ�̏C������������Ă����̂�";
		mes "������]";
		next;
		menu "���C�[�[�̑㗝�ŗ��܂����B",-;
		mes "�]�f���[�C�ɁA";
		mes "���܂ł̌o�܂�b�����B";
		mes "�b���Ă���ԁA";
		mes "���܁A�f���[�C�̊�����s������]";
		next;
		mes "[�f���[�C]";
		mes "�c�c";
		mes "�c�c";
		mes "�Ȃ�قǁB";
		next;
		mes "[�f���[�C]";
		mes "������Ă�����̎莆����";
		mes "�^�[�j���l�̂Ƃ���܂�";
		mes "���ǂ�����̂ł��ˁB";
		next;
		mes "[�f���[�C]";
		mes "�c�c";
		mes "�킩��܂����B";
		mes "����ł́A���̕�����";
		mes "�^�[�j���l�ɂ��`�����܂��傤�B";
		next;
		mes "[�f���[�C]";
		mes "�������炽�߂āA";
		mes "�����炩��A���x���^��";
		mes "���C�[�[�l�ɂ��A���������܂��B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		mes "[�f���[�C]";
		mes "�^�[�j���l�ɂ��`�����Ă����܂��B";
		mes "�������炽�߂āA";
		mes "�����炩��A���x���^��";
		mes "���C�[�[�l�ɂ��A���������܂��B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close;
	}
L_OTHER:
	mes "[�f���[�C]";
	mes "����ɂ��́B";
	mes "���͂����ŁA";
	mes "�l�Ƒ҂����킹�����Ă���܂��B";
	close;
}
umbala.gat,96,164,4		script	�f�j�X	89,{
	if(AC_QUEST_LV_1!=6) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "[�f�j�X]";
		mes "����ɂ��́B";
		next;
		mes "�]���C�[�[����a�������ו���n�����]";
		next;
		emotion 0;
		//����Ȃ��H
		mes "[�f�j�X]";
		mes "�I";
		mes "���肪�Ƃ���!!";
		mes "�������g���m�F�����Ă��炤��I";
		mes " ";
		mes "�]�K�T�K�T�K�T�K�T�b�b�I�]";
		next;
		emotion 21;
		mes "[�f�j�X]";
		mes "�t�H�H�H�H�H�H�H�H�H�H�H�H�H�b�I";
		mes "���ꂾ��A����I";
		mes " ";
		mes "����Ǝ�ɓ����������I";
		next;
		mes "[�f�j�X]";
		mes "�{���ɂ��肪�Ƃ��I";
		mes "�������A���C�[�[����I";
		mes "���ꂩ����A���C�[�[�����";
		mes "���p���邩��ˁI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		emotion 21;
		mes "[�f�j�X]";
		mes "�����˂��I";
		mes "�{���ɂ����I";
		mes " ";
		mes "���ɂ��̊p�x���猩��Ɓc�c";
		mes "�͂��������A���܂�Ȃ���I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close;
	}
L_OTHER:
	mes "[�f�j�X]";
	mes "����ɂ��́B";
	close;
}
comodo.gat,113,219,4	script	�V�k#ac_comodo	918,{
	if(AC_QUEST_LV_1!=7) goto L_OTHER;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "�V�v�w���y�����ɘb�����Ă���B";
		next;
		menu "�^�[�j������ł����H",-;
		mes "[�^�[�j��]";
		mes "����c�c";
		mes "����ɂ��́B";
		mes "���ɉ����p������B";
		next;
		menu "���C�[�[�̑㗝�ŗ��܂����B",-;
		mes "[�^�[�j��]";
		mes "���Ȃ����A";
		mes strcharinfo(0) + "�ˁI";
		mes "�҂��Ă������B";
		mes "�ł����C�[�[����͗���Ȃ��̂ˁB";
		next;
		mes "[�^�[�j��]";
		mes "�m���ɁA���C�[�[����͍��A";
		mes "�����������ŋ}�������Ă�����̂ˁB";
		mes "�c�O�����ǁA�d���Ȃ���B";
		next;
		emotion 0,"";
		mes "[�m���[�N]";
		mes "����ɂ��́B";
		mes "�킵�̓m���[�N����B";
		mes "�^�[�j������b�͕����Ă����B";
		mes "�莆���������񂾂��ĂˁH";
		next;
		menu "�I�I �m���[�N�I�H",-;
		mes "[�m���[�N]";
		mes "�ȁA�Ȃ񂶂�H";
		mes "�킵�̊�����Ă���ȋ����Ƃ́B";
		mes "�킵�������킢�B";
		next;
		mes "�]�莆�������Ă���A";
		mes "��l�̂��Ƃ������ƒ��ׂĂ������Ƃ�";
		mes "�m���[�N���펀������";
		mes "�v���Ă������ƂȂ�";
		mes "���܂ł̌o�܂�b�����]";
		next;
		mes "[�m���[�N]";
		mes "���́A���񂾂͂��̂킵��";
		mes "�����ɂ��邩�A";
		mes "���́A���̎莆�����܂��Ă������A";
		mes "���́A�킵�ƃ^�[�j�����ꏏ��";
		mes "�Ȃ��Ă��邩�A";
		mes "�F�X�ƒm�肽���悤����̂��B";
		next;
		mes "[�m���[�N]";
		mes "���Ⴀ�A";
		mes "���̎莆�𖄂߂����{�l�ł���";
		mes "�킵���ꂩ��b�������̂��B";
		next;
		mes "�]�m���[�N�́A�P���������A";
		mes "�����Ԃ���������A�b���������]";
		next;
		mes "[�m���[�N]";
		mes "�����A�킵�ƃ^�[�j����";
		mes "�����𐾂��������������񂶂�B";
		mes " ";
		mes "�킵�́A���̍��A�b���c�̈���łȁA";
		mes "���X�A�����X�^�[����X����邽�߁A";
		mes "�킢�ɂ�������Ă����񂶂�B";
		next;
		mes "[�m���[�N]";
		mes "����A�^�[�j����";
		mes "���Ƃ̂���l�łȁA";
		mes "���R�A�^�[�j���̐e�ވꓯ�A";
		mes "�킵��̌����ɔ��΂��Ă����񂶂��B";
		next;
		mes "[�m���[�N]";
		mes "�������A�킵�͂̂��A";
		mes "�����̖����킩��ʗb���ŁA";
		mes "�g���̍������邱�Ƃ��Ă�";//�u�Ɂv�������Ă��邪�{�I�ǂ���
		mes "�����ڂ������Ă͂������A";
		mes "�^�[�j�����K���ɂł���̂́A";
		mes "�����������Ȃ��A�ƐM���Ă����񂶂�B";
		next;
		mes "[�m���[�N]";
		mes "����ŁA�^�[�j���Ɍ�����\����������";
		mes "���̎莆���������񂶂�B";
		next;
		mes "[�m���[�N]";
		mes "�������A���̎莆���^�[�j���ɓn������";
		mes "�v���Ă������A";
		mes "�����X�^�[���}�ɊX���U�߂Ă��ĂȁA";
		mes "�����X�^�[�Ƃ̐킢���������񂶂�B";
		next;
		mes "[�m���[�N]";
		mes "�c�c";
		mes "�����ŁA�킵�̒��Ԃ̂ЂƂ肪";
		mes "�����X�^�[�ɂ���āA";
		mes "���������Ă��܂����B";
		next;
		mes "[�m���[�N]";
		mes "���̒��Ԃɂ́A����҂������񂶂�B";
		mes "���̍���҂́A���Ԃ̖S�[�̑O�ŁA";
		mes "�������Ă������B";
		mes "���ꂩ��c���ꂽ�킽����";
		mes "�ǂ�����΂����́A�ƂȁB";
		next;
		mes "[�m���[�N]";
		mes "�킵�́A���Ă������Ă�";
		mes "�����Ȃ��Ȃ����B";
		mes "�Ȃ��Ȃ�A���̎p���A";
		mes "�߂�������";
		mes "�킵�ƃ^�[�j���̎p�Ɍ����ĂȁB";
		next;
		mes "[�m���[�N]";
		mes "�������A�^�[�j���̂��߂�";
		mes "�b������߂悤�Ǝv�����B";
		mes "�������c�c";
		mes "�U��Ԃ�΁A";
		mes "�킵�炪������X�̐l������";
		mes "�����ɂ������B";
		next;
		mes "[�m���[�N]";
		mes "�F���킵��ɁA��������񂶂��B";
		mes "�킵�炪�����������ŏ��������A�ƂȁB";
		mes "�킵�����āA�u�傫���Ȃ�����";
		mes "�킵�݂����ȗb���ɂȂ肽���v��";
		mes "����P�����Ȃ��猾���q�����������B";
		next;
		mes "[�m���[�N]";
		mes "�킵�́A���̓��ɁA";
		mes "�^�[�j���Əo������ꏊ�ɁA";
		mes "�莆�𖄂߂��񂶂�B";
		next;
		mes "[�m���[�N]";
		mes "�킵�́A";
		mes "�^�[�j�����K���ɂł��Ȃ��A";
		mes "�ƌ���ĂȁB";
		next;
		mes "[�^�[�j��]";
		mes "�c�c";
		next;
		mes "[�^�[�j��]";
		mes "�c�c";
		mes "���̌��f�����鎞�A";
		mes "���k���ė~����������c�c";
		mes "��������Ɂc�c";
		next;
		mes "[�m���[�N]";
		mes "�c�c";
		next;
		mes "[�m���[�N]";
		mes "�c�c";
		mes "���ꂩ�琔�N��A";
		mes "�킵�͗b���Ƃ��āA";
		mes "���X�A�����X�^�[�Ƃ̐킢��";
		mes "��������Ă����B";
		next;
		mes "[�m���[�N]";
		mes "�����Ă�����A";
		mes "���͂ȃ����X�^�[�̏W�c��";
		mes "�o����Ă��܂��ĂȁB";
		next;
		mes "[�m���[�N]";
		mes "�킵�́A���̐퓬��";
		mes "�m���̏d���𕉂��Ă��܂����B";
		next;
		mes "[�m���[�N]";
		mes "���Ԃ̕��������";
		mes "���f����Ă��܂��āA�킵�ЂƂ肶��B";
		mes "�킵�́A�ӎ����r�؂ꂻ���ɂȂ�̂�";
		mes "�K���ɂ��炦�āA�G���瓦�������B";
		next;
		mes "[�m���[�N]";
		mes "�������A�A�킵�̓����X�^�[��";
		mes "�͂܂�Ă��܂����񂶂�B";
		mes "�C�t���Ȃ��ԂɂȁB";
		mes "�����키�͂��A�����͂��Ȃ��c�c";
		mes "�킵�͂��̏�ɓ|�ꂱ�݁A";
		mes "���̊o��������B";
		next;
		mes "[�m���[�N]";
		mes "�����X�^�[���킵�̖ڂ̑O�܂ŗ��āA";
		mes "���̒܂��킵�ɐU�艺�낻���Ƃ����B";
		mes "�����ŁA�킵�͈ӎ��������Ă��܂����B";
		next;
		mes "[�m���[�N]";
		mes "�ǂꂭ�炢���Ԃ�";
		mes "���������킩��Ȃ����A";
		mes "�킵�͖ڂ��o�܂����񂶂�B";
		next;
		mes "[�m���[�N]";
		mes "����o�܂��ƁA�ڂ̑O��";
		mes "�M�����Ȃ����Ƃ����A";
		mes "�^�[�j�����������񂶂�B";
		mes "�����ȂƎv�������A";
		mes "�ԈႢ�Ȃ��^�[�j����";
		mes "�ŕa���Ă���Ă����񂶂��B";
		next;
		mes "[�m���[�N]";
		mes "�b�𕷂��ƁA�킵�������X�^�[��";
		mes "��͂���Ă���̂�";
		mes "�^�[�j����";
		mes "�~���o���Ă���Ă����񂶂�B";
		next;
		mes "[�m���[�N]";
		mes "�^�[�j���́A�킵�ɘb���Ă��ꂽ�B";
		mes "���̓��A�킵�������Ă���̂��Ƃ��B";
		mes " ";
		mes "���̓��A�킵�������Ă���";
		mes "�^�[�j���͉Ƃ��яo����";
		mes "�킵��T�������Ă�����������B";
		next;
		mes "[�m���[�N]";
		mes "���Ƃ��ƁA�O�����J�Ƃ�";
		mes "�ł̐��E�Ŗ��Ƃ������炵���Ă̂��B";
		mes "�̂���A���Ȃ�P����";
		mes "��ł�����������B";
		mes "�킵��T�����ɏo�Ă���A";
		mes "����ɘr���オ���āA";
		next;
		mes "[�m���[�N]";
		mes "^FF0000�A�T�V���N���X^000000�Ƃ����E��";
		mes "�ɂȂ��Ă������B";
		mes " ";
		mes "�킵���͂�ł��������X�^�[��";
		mes "��u�œ|������������c�c";
		next;
		mes "[�m���[�N]";
		mes "��������āA�킵���";
		mes "�Ăяo��A�������Ă���B";
		mes "�^�[�j���̔M�ӂ�";
		mes "�^�[�j���̐e�ނ��܂�Ă���Ă̂��B";
		next;
		mes "[�^�[�j��]";
		mes "�����ˁB";
		mes "�m���[�N�ƈꏏ�ɂȂ��";
		mes "�ƂĂ��K����������B";
		next;
		menu "����n����",-;
		mes "[�^�[�j��]";
		mes "����ˁI";
		mes "50�N�ȏソ���āA";
		mes "����Ǝ��̂Ƃ���ɓ͂����̂ˁB";
		next;
		mes "[�m���[�N]";
		mes "���A���̔��́c�c";
		mes "�������A�v���o�����B";
		mes "�^�[�j���̂��߂Ɂc";
		mes "���̔���2�d��ɂ��Ă����C������I";
		next;
		mes "�]�m���[�N�͔��������āA";
		mes "����������n�߂��B";
		mes "���́A�J�`���b�Ɖ����o����";
		mes "���̒ꂪ�J���A";
		mes "������l�b�N���X���o�Ă����]";
		next;
		mes "[�m���[�N]";
		mes "�������A";
		mes "������^�[�j���Ƀv���[���g���悤�ƁA";
		mes "�т����肳���悤�ƁA";
		mes "�����Ɏd�|�������Ă������񂾁c�c";
		next;
		mes "[�m���[�N]";
		mes "�����A50�N�ȏ�n���̂�";
		mes "�x��Ă��܂������ǁc�c";
		mes " ";
		mes "�]�m���[�N�͂��̃l�b�N���X���Ƃ��āA";
		mes "�^�[�j���ɂ������]";
		next;
		mes "[�^�[�j��]";
		mes "�n���̂��x��������c�c";
		mes "�c�c";
		mes "�ł��c�c";
		mes "�������A��������c�c";
		mes "�]�^�[�j���̖ڂ���܂����ӂ�o��]";
		next;
		mes "�]�^�[�j���͍������ȃA�N�Z�T���[��";
		mes "����������Ă��邪�A";
		mes "�m���[�N���v���[���g����";
		mes "�l�b�N���X����ԋP���Ă���悤��";
		mes "�������]";
		next;
		mes "�]���̃l�b�N���X��50�N�O����";
		mes "�P���������Ă��Ȃ��悤�ɁA";
		mes "�m���[�N�ƃ^�[�j���̈���";
		mes "50�N�O����P�������Ă���̂��낤�B";
		mes strcharinfo(0) + "��";
		mes "�����v�����]";
		next;
		mes "[�^�[�j��]";
		mes "�m���[�N�A�{���Ɋ�������B";
		mes "���́A���Ȃ��ƈꏏ�ɂȂ�āA";
		mes "�{���ɍK����B";
		next;
		mes "[�m���[�N]";
		mes "�킵������B";
		mes " ";
		mes strcharinfo(0) + "�A";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "���̔���͂��Ă���āB";
		mes "���C�[�[�ɂ����`���ė~�����B";
		next;
		mes "[�^�[�j��]";
		mes "�����A�{����B";
		mes "���C�[�[�����";
		mes "��������悤�ɓ`���āB";
		mes "���̊��ӂ̋C�����𒼐ړ`��������B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close2;
		set AC_QUEST_ST_1,3;
		end;
	case 3:
		mes "[�^�[�j��]";
		mes "���C�[�[����ɂ�";
		mes "����A�d����������������";
		mes "�����ɗ���悤�ɓ`���Ă��傤�����B";
		next;
		mes "[�^�[�j��]";
		mes "���܂藈�Ȃ��悤��������A";
		mes "�d�����Ȃ��Ȃ�悤��";
		mes "��z���Ă��܂����A�Ƃ�";
		mes "�`���Ă����Ă��傤�����B";
		next;
		mes "[�m���[�N]";
		mes "���A�^�[�j���A";
		mes "��k���߂��邼�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close;
	}
L_OTHER:
	mes "�V�v�w���y�����ɘb�����Ă���B";
	mes "�ז������Ȃ��ł������B";
	close;
}
comodo.gat,116,219,4	duplicate(�V�k#ac_comodo)	�V�l#ac_comodo	55
//�����̍��͎�����b�ł͂Ȃ��A�N���b�N����������
alberta.gat,107,59,0	script		���߂�ꏊ#AC_QUE01		139,2,2,{
	if(AC_QUEST_LV_1!=8 || (AC_QUEST_ST_1!=2 && AC_QUEST_ST_1!=3)) end;
	mes "�]�����̏ꏊ��";
	mes "���߂�̂ɍœK���Ǝv���]";
	next;
	switch(AC_QUEST_ST_1){
	case 2:
		mes "�]���C�[�[�ɕ񍐂��悤�]";
		next;
	case 3:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���C�[�[�ɕ񍐂���]";
		close2;
		set AC_QUEST_ST_1,3;
		viewpoint 1,39,46,11,0x0000FF;
		end;
	}
}
