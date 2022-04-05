//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ���[���̈˗�
//
//                                                 by Pneuma
//�`���҂ɂȂ肽��   -----------------------------------------

geffen_in.gat,110,28,4	script		�I�l�X�g	62,{
	set '@novice, callfunc("AC_GetNovice");
	function show_mission;
	if(AC_QUEST_ST_4==0) goto L_OTHER;
	switch(AC_QUEST_LV_4){
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
	switch(AC_QUEST_ST_4){
	case 1:
		mes "[�I�l�X�g]";
		mes "�₠�A�N���l�̈˗���";
		mes "�󂯂Ă����`���҂����H";
		next;
		menu "�����ł�",-;
		emotion 5;
		mes "[�I�l�X�g]";
		mes "����ς�ˁI";
		mes "�������Ǝv�����񂾂�B";
		mes "�l�͏����`���҂ɂȂ肽����";
		mes "�v���Ă��邩��B";
		mes "�N�̕������݂ăs���Ɨ����킯���B";
		next;
		mes "[�I�l�X�g]";
		mes "�ł����A�e�����邳�����Ă��B";
		mes "�l�̍΂ł��F�X�`�����Ă���l";
		mes "��R����̂ɁA";
		mes "�׋�����׋�������ĂˁB";
		next;
		mes "[�I�l�X�g]";
		mes "����ŁA�`���҂ɂȂ�ׂ�";
		mes "�׋������Ă��{���邵";
		mes "�W�߂����������Ĉ�x";
		mes "�S���̂Ă�ꂿ������񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "������A���������W�߂Ȃ����Ă���";
		mes "�Œ��Ȃ񂾂�[�B";
		mes "���̎����W�߂̎�`����";
		mes "�N�ɂ��肢�������ĂˁB";
		next;
		mes "[�I�l�X�g]";
		mes "�Ƃ����킯�ł�낵�����ނ�[�B";
		mes "����́A";
		mes "�{�X�����X�^�[��^FF0000�G�N���v�X^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�v�����e���t�B�[���h02^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "^0000FF�v�����e���t�B�[���h02^000000�ւ�";
		mes "�v�����e������������Ƌ߂��������ȁH";
		mes "��A�B�e�|�C���g�̓������Ƃ�������";
		mes "���̏ꏊ�ŗ��ނ�B";
		mes "���A�J�����͂�����g���ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�v�����e���t�B�[���h02(305,157)^000000";
		mes "�@�֍s���ʐ^���B���Ă���]";
		mes " ";
		mes "^0000FF�v�����e���t�B�[���h02^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		next;
		mes "[�I�l�X�g]";
		mes "^0000FF�v�����e���t�B�[���h02^000000�ւ�";
		mes "�v�����e������������Ƌ߂��������ȁH";
		mes "��A�B�e�|�C���g�̓������Ƃ�������";
		mes "���̏ꏊ�ŗ��ނ�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�v�����e���t�B�[���h02(305,157)^000000";
		mes "�@�֍s���ʐ^���B���Ă���]";
		mes " ";
		mes "^0000FF�v�����e���t�B�[���h02^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close;
	case 3:
		emotion 0;
		mes "[�I�l�X�g]";
		mes "�����A���\���������ˁB";
		mes "�����Ǝʂ��Ă邩";
		mes "�܂��킩��Ȃ����ǁA";
		mes "�N��������肿����";
		mes "�B�e���Ă��Ă���Ă���ۂ�����";
		mes "����ň˗��͏I���ŗǂ���B";
		next;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		mes "[�I�l�X�g]";
		if('@novice){
			mes "�������A��������������Ȃ�����";
			mes "������������B";
			mes "�}�b�v���ړ�����̂Ɋy��";
			mes "�A�C�e���Ȃ񂾁B";
		}
		mes "���ꂶ��A�܂�������������";
		mes "��낵���ˁ[�B";
		next;
		if('@novice){
			if(!checkweight(601,30)){
				mes "�]�d�ʃI�[�o�[�]";
				close;
			}
			getitem 601,30;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[�I�l�X�g]";
		mes "���肪�Ƃ��I";
		mes "����������B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST02:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 15;
		mes "[�I�l�X�g]";
		mes "�₠�₠�A���̑O�͂��肪�Ƃ��B";
		mes "�������낵�����ނ�I";
		mes "���������Ζ��O��";
		mes "�����ĂȂ�������ˁH";
		mes "�Ȃ�Ă����̌N�H";
		next;
		menu "�����",-;
		mes "[�I�l�X�g]";
		mes strcharinfo(0) + "���I";
		mes "�l�́A�I�l�X�g��낵���ˁI";
		mes "���ꂶ��A�������e�Ȃ񂾂��ǁB";
		next;
		mes "[�I�l�X�g]";
		mes "����̎B�e�ꏊ�́A";
		mes "�{�X�����X�^�[��";
		mes "^FF0000�}�X�^�[�����O^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�t�F�C���������̐X04^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "��A�B�e�|�C���g�͂��̑O�Ɠ�����";
		mes "�������Ƃ�������";
		mes "���̏ꏊ�ŗ��ނ�B";
		mes "���A�J�����͂�����g���ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�t�F�C���������̐X04(267.193)^000000";
		/*�u.�v�Ŗ{�I�ʂ�*/mes "�ɍs���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�t�F�C���������̐X04^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		next;
		mes "[�I�l�X�g]";
		mes "����̎B�e�ꏊ�́A";
		mes "�{�X�����X�^�[��";
		mes "^FF0000�}�X�^�[�����O^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�t�F�C���������̐X04^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�t�F�C���������̐X04(267.193)^000000";
		/*�u.�v�Ŗ{�I�ʂ�*/mes "�ɍs���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�t�F�C���������̐X04^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close;
	case 3:
		mes "[�I�l�X�g]";
		mes "������";
		mes strcharinfo(0) + "���ˁB";
		mes "���̑O�̎ʐ^������������Ă�����";
		mes "����̂����҂ł��������B";
		mes "�܂��������������낵���ˁB";
		next;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		if('@novice){
			mes "[�I�l�X�g]";
			mes "���I";
			mes "���ƁA��������ǂ�������";
			mes "�����čs���Ă�I";
			next;
			switch(Job){
			case Job_Swordman:
			case Job_Thief:
			case Job_Archer:
			case Job_Merchant:
			case Job_TaeKwon:
			case Job_Gunslinger:
				set '@item,2405;
				break;
			// �u�[�c[0]
				case Job_Magician:
			case Job_Acolyte:
			case Job_Ninja:
				set '@item,2403;
				break;
			// �V���[�Y[0]
				case Job_SuperNovice:
			default:
				set '@item,2416;
				break;
				// �m�[�r�X�V���[�Y[1]
			}
			if(!checkweight('@item,1)){
				mes "�]�d�ʃI�[�o�[�]";
				close;
			}
			getitem '@item,1;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[�I�l�X�g]";
		mes "���肪�Ƃ��I";
		mes "����������B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST03:
	switch(AC_QUEST_ST_4){
	case 1:
		mes "[�I�l�X�g]";
		mes "�₠" + strcharinfo(0);
		mes "�������낵�����ނ�I";
		next;
		mes "[�I�l�X�g]";
		mes "����̎B�e�ꏊ�́A";
		mes "�{�X�����X�^�[��";
		mes "^FF0000�h���S���t���C^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�\�O���g����18^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "��A�B�e�|�C���g�͂��̑O�Ɠ�����";
		mes "�������Ƃ�������";
		mes "���̏ꏊ�ŗ��ނ�B";
		mes "���A�J�����͂�����g���ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�\�O���g����18(232,217)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�\�O���g����18^000000�ւ�";
		mes "�@^0000FF�����N^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		next;
		mes "[�I�l�X�g]";
		mes "����̎B�e�ꏊ�́A";
		mes "�{�X�����X�^�[��";
		mes "^FF0000�h���S���t���C^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�\�O���g����18^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�\�O���g����18(232,217)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�\�O���g����18^000000�ւ�";
		mes "�@^0000FF�����N^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close;
	case 3:
		emotion 5;
		mes "[�I�l�X�g]";
		mes "����J���܁[�B";
		mes "����Ń{�X�����X�^�[�֘A������";
		mes "3�ɂȂ�����B";
		mes "�܂��܂��K�v�ɂȂ�Ǝv������";
		mes "�܂���낵���ˁB";
		next;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		emotion 5;
		mes "[�I�l�X�g]";
		mes "����J���܁[�B";
		mes "����Ń{�X�����X�^�[�֘A������";
		mes "3�ɂȂ�����B";
		mes "�܂��܂��K�v�ɂȂ�Ǝv������";
		mes "�܂���낵���ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST04:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[�I�l�X�g]";
		mes strcharinfo(0);
		mes "������N�������󂯂Ă����񂾂ˁB";
		mes "����[�A�������B";
		mes "�{���ɁB";
		mes "���ꂶ��A��������̈˗��ɂ���";
		mes "��������ˁB";
		next;
		mes "[�I�l�X�g]";
		mes "����̎B�e�ꏊ�́A";
		mes "�{�X�����X�^�[��";
		mes "^FF0000�g�[�h^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�Q�t�F���t�B�[���h01^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "��A�B�e�|�C���g�͂��̑O�Ɠ�����";
		mes "�������Ƃ�������";
		mes "���̏ꏊ�ŗ��ނ�B";
		mes "���A�J�����͂�����g���ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�Q�t�F���t�B�[���h01(208,242)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�Q�t�F���t�B�[���h01^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		next;
		mes "[�I�l�X�g]";
		mes "����̎B�e�ꏊ�́A";
		mes "�{�X�����X�^�[��";
		mes "^FF0000�g�[�h^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�Q�t�F���t�B�[���h01^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�Q�t�F���t�B�[���h01(208,242)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�Q�t�F���t�B�[���h01^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close;
	case 3:
		mes "[�I�l�X�g]";
		mes "�����l�I";
		mes "����[�A�������ȁ[�B";
		mes "�l�������`���҂ɂȂ���";
		mes "�F�X�ȏꏊ�֖`�����ɍs�������B";
		next;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		if('@novice){
			emotion 0;
			mes "[�I�l�X�g]";
			mes "�������I����I";
			mes "���Ӓ�̃A�C�e�����Ӓ�ł���";
			mes "�g�勾�Ȃ񂾂���";
			mes "��R���邩�炠����I";
			mes "�l�������ĂĂ��g��Ȃ����B";
			next;
			if(!checkweight(611,20)){
				mes "�]�d�ʃI�[�o�[�]";
				close;
			}
			getitem 611,20;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[�I�l�X�g]";
		mes "���肪�Ƃ��I";
		mes "����������B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST05:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[�I�l�X�g]";
		mes "���A" + strcharinfo(0);
		mes "�N�����Ă����̂�";
		mes "�S�҂��ɂ��Ă�����B";
		next;
		emotion 9;
		mes "[�I�l�X�g]";
		mes "���͎��̎B�e�ꏊ��";
		mes "������Ȃ��ꏊ�Ȃ񂾂�ˁc�c";
		mes "������A�C�����čs���Ă���";
		mes "�ق����񂾁B";
		mes "�Ȃ񂹁AMVP�{�X�����X�^�[������";
		mes "�ꏊ������ˁB";
		next;
		mes "[�I�l�X�g]";
		mes "�Ƃ������ƂŎB�e�ꏊ�Ȃ񂾂��ǁA";
		mes "MVP�{�X�����X�^�[��";
		mes "^FF0000�t���I�j^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�\�O���g����17^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "��A�B�e�|�C���g�͂����Ɠ�����";
		mes "�������Ƃ�������";
		mes "���̏ꏊ�ŗ��ނ�B";
		mes "�J�����͂�����g���ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�\�O���g����17(146,145)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�\�O���g����17^000000�ւ�";
		mes "�@^0000FF�����N^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		mes "����̏ꏊ��";
		mes "�댯������C�����ĂˁB";
		next;
		mes "[�I�l�X�g]";
		mes "�B�e�ꏊ�Ȃ񂾂��ǁA";
		mes "MVP�{�X�����X�^�[��";
		mes "^FF0000�t���I�j^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�\�O���g����17^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�\�O���g����17(146,145)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�\�O���g����17^000000�ւ�";
		mes "�@^0000FF�����N^000000����s���̂�";
		mes "�@�ǂ��炵���]";
		close;
	case 3:
		mes "[�I�l�X�g]";
		mes strcharinfo(0) + "�I";
		mes "�悩�����A�����������񂾂ˁB";
		mes "^FF0000�t���I�j^000000�ɂ��ꂿ�������";
		mes "����Ȃ����ƐS�z���Ă����񂾂�B";
		mes "�{���ɂ悩�����B";
		next;
		emotion 20;
		mes "[�I�l�X�g]";
		mes "�{���ɂ������Ȃ��c�c";
		mes "�l��" + strcharinfo(0);
		mes "�̂悤�Ȗ`���҂ɂȂ��悤��";
		mes "�撣���ĕ׋����Ȃ���B";
		mes "���ꂶ��A�܂���낵���ˁB";
		next;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		emotion 20;
		mes "[�I�l�X�g]";
		mes "�{���ɂ������Ȃ��c�c";
		mes "�l��" + strcharinfo(0);
		mes "�̂悤�Ȗ`���҂ɂȂ��悤��";
		mes "�撣���ĕ׋����Ȃ���B";
		mes "���ꂶ��A�܂���낵���ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST06:
	switch(AC_QUEST_ST_4){
	case 1:
		mes "[�I�l�X�g]";
		mes "����ɂ��́I";
		mes "��������Ă����Ǝv������B";
		mes "�N�̂������Ŗl���F�X";
		mes "�׋��ł��āA�m�������Ȃ�";
		mes "�����ԕt���Ă����񂶂�Ȃ����Ȃ�";
		mes "�������Ă���񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "�����B�e�ꏊ�Ȃ񂾂��ǁA";
		mes "����͒ʏ�̃{�X�����X�^�[";
		mes "^FF0000�����炢�T^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�\�O���g����03^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "�B�e���Ăق����̂�";
		mes "^0000FF�v�����e��^000000������������ꏊ";
		mes "�t�߂��ȁH";
		mes "������A������Ɖ����Ȃ����Ⴄ����";
		mes "�B�e�ɂ�^0000FF�v�����e��^000000����";
		mes "�s���Ăق����B";
		next;
		mes "[�I�l�X�g]";
		mes "��A�B�e�|�C���g�͂����Ɠ�����";
		mes "�������Ƃ�������";
		mes "���̏ꏊ�ŗ��ނ�B";
		mes "�J�����͂�����g���ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�\�O���g����03(70,336)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�\�O���g����03^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����������]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		next;
		mes "[�I�l�X�g]";
		mes "�����B�e�ꏊ�Ȃ񂾂��ǁA";
		mes "����͒ʏ�̃{�X�����X�^�[";
		mes "^FF0000�����炢�T^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�\�O���g����03^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�\�O���g����03(70,336)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�\�O���g����03^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����������]";
		close;
	case 3:
		mes "[�I�l�X�g]";
		mes strcharinfo(0);
		mes "�����܂ł���J�l�B";
		mes "�����ɎB�e�ł��Ă�݂������ˁB";
		next;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		if('@novice){
			emotion 21;
			mes "[�I�l�X�g]";
			mes "���ƁA����X�s�[�h�A�b�v�|�[�V����";
			mes "���Ă�����B";
			mes "�U�����x���オ��炵����B";
			mes strcharinfo(0) + "��";
			mes "�������B";
			next;
			if(!checkweight(645,10)){
				mes "�]�d�ʃI�[�o�[�]";
				close;
			}
			getitem 645,10;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[�I�l�X�g]";
		mes "�������肪�Ƃ��I";
		mes "�{���ɏ������B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST07:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[�I�l�X�g]";
		mes strcharinfo(0) + "�I";
		mes "�������肪�Ƃ��B";
		mes "�������ő�R�̎�����";
		mes "�W�߂邱�Ƃ��ł�����B";
		next;
		mes "[�I�l�X�g]";
		mes "�������낵�����ނˁI";
		next;
		mes "[�I�l�X�g]";
		mes "���āA�B�e�ꏊ�Ȃ񂾂��ǁA";
		mes "MVP�{�X�����X�^�[";
		mes "^FF0000�I�[�N���[�h^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�Q�t�F���t�B�[���h10^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "�����댯�ȏꏊ������";
		mes "�C�����ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�Q�t�F���t�B�[���h10(251,368)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�Q�t�F���t�B�[���h10^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����������]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		mes "����̏ꏊ��";
		mes "�댯������C�����ĂˁB";
		next;
		mes "[�I�l�X�g]";
		mes "�B�e�ꏊ��";
		mes "MVP�{�X�����X�^�[";
		mes "^FF0000�I�[�N���[�h^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�Q�t�F���t�B�[���h10^000000��";
		mes "�ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�Q�t�F���t�B�[���h10(251,368)^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�Q�t�F���t�B�[���h10^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����������]";
		close;
	case 3:
		emotion 21;
		mes "[�I�l�X�g]";
		mes strcharinfo(0);
		mes "��������B";
		mes "�v������葁���A���Ă����ˁ[�B";
		mes "������" + strcharinfo(0);
		mes "����B";
		next;
		mes "[�I�l�X�g]";
		mes "�����Ƃ��c�c";
		mes "�e�Ɉ�x�A�^���ɘb���Ă݂悤��";
		mes "�v���񂾁B";
		mes "�R�\�R�\�������W�߂ĂĂ�";
		mes "�������̂����΂�Ă��܂����낤���B";
		next;
		mes "[�I�l�X�g]";
		mes strcharinfo(0) + "��";
		mes "�B���Ă����ʐ^��������";
		mes "�^���ɘb���Ă݂��B";
		next;
		menu "����΂��Ă�",-;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[�I�l�X�g]";
		mes "�����Ƃ��c�c";
		mes "�e�Ɉ�x�A�^���ɘb���Ă݂悤��";
		mes "�v���񂾁B";
		mes "�R�\�R�\�������W�߂ĂĂ�";
		mes "�������̂����΂�Ă��܂����낤���B";
		next;
		mes "[�I�l�X�g]";
		mes strcharinfo(0) + "��";
		mes "�B���Ă����ʐ^��������";
		mes "�^���ɘb���Ă݂��B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[�I�l�X�g]";
		mes "�₠�A" + strcharinfo(0);
		mes "�N�̂������ł��Ȃ�";
		mes "�����������Ă���";
		mes "�l�̒m�������Ȃ�t���Ă����B";
		mes "�ŋ߁A";
		mes "���@�̕׋������������񂾂�H";
		next;
		mes "[�I�l�X�g]";
		mes "����ς�A���@��������ˁI";
		mes "�l�A�}�W�V�����ɂȂ���";
		mes "�����A�h�J�[���ƃ����X�^�[��";
		mes "��|���Ă݂��񂾁B";//�݂��񂾁H�ł����̂��c�c�H�{�I�ʂ�
		next;
		mes "[�I�l�X�g]";
		mes "���āA�B�e�ꏊ�Ȃ񂾂��ǁA";
		mes "MVP�{�X�����X�^�[";
		mes "^FF0000�X�g�[���i�C�g^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF��������H��_���W����02^000000";
		mes "�̎ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "���߂ă_���W��������";
		mes "�B�e�����肢����ˁB";
		mes "�����X�^�[�����͂Ȃ̂�";
		mes "��R����Ǝv������";
		mes "�C�����ĂˁB";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "[�I�l�X�g]";
		mes "^0000FF��������H��_���W����^000000�֍s���ɂ�";
		mes "�܂��A^0000FF�A���f�o����^000000�ɂ���A";
		mes "^FF0000�����N�T���^^000000�ɘb��������";
		mes "^0000FF���e�B�G�t�B�[���h^000000�Ɉړ�����";
		mes "�K�v�������B";
		next;
		mes "[�I�l�X�g]";
		mes "�����āA^0000FF���e�B�G�t�B�[���h^000000��";
		mes "�k�ɍs���ƊX������񂾂��ǂ�";
		mes "���̒��ɂ���͂��B";
		mes "���ꂶ���낵���ˁI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF��������H��_���W����02^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF��������H��_���W����02^000000�ւ�";
		mes "�@^0000FF�A���f�o����^000000����������]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		mes "����̏ꏊ��";
		mes "�댯������C�����ĂˁB";
		next;
		mes "[�I�l�X�g]";
		mes "^0000FF��������H��_���W����^000000�֍s���ɂ�";
		mes "�܂��A^0000FF�A���f�o����^000000�ɂ���A";
		mes "^FF0000�����N�T���^^000000�ɘb��������";
		mes "^0000FF���e�B�G�t�B�[���h^000000�Ɉړ�����";
		mes "�K�v�������B";
		next;
		mes "[�I�l�X�g]";
		mes "�����āA^0000FF���e�B�G�t�B�[���h^000000��";
		mes "�k�ɍs���ƊX������񂾂��ǂ�";
		mes "���̒��ɂ���͂��B";
		mes "���ꂶ���낵���ˁI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF��������H��_���W����02^000000";
		mes "�֍s���A�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF��������H��_���W����02^000000�ւ�";
		mes "�@^0000FF�A���f�o����^000000����������]";
		close;
	case 3:
		mes "[�I�l�X�g]";
		mes strcharinfo(0);
		mes "�����l�I";
		mes "��������H��_���W��������";
		mes "�����������Ń��N���N������";
		mes "�����������Ďʐ^����������B";
		next;
		emotion 21;
		mes "[�I�l�X�g]";
		mes "���ӏ��łƂ肠�����́A";
		mes "��������ʂ葵�����ƂɂȂ��B";
		mes "������A" + strcharinfo(0) + "��";
		mes "�撣���Ă��ꂽ����������B";
		mes "����������܂��˗��o���Ă�������";
		mes "��낵���ˁB";
		next;
		mes "�]�I�l�X�g�ɃJ������Ԃ����]";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		emotion 21;
		mes "[�I�l�X�g]";
		mes "���ӏ��łƂ肠�����́A";
		mes "��������ʂ葵�����ƂɂȂ��B";
		mes "������A" + strcharinfo(0) + "��";
		mes "�撣���Ă��ꂽ����������B";
		mes "����������܂��˗��o���Ă�������";
		mes "��낵���ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST09:
	switch(AC_QUEST_ST_4){
	case 1:
		emotion 0;
		mes "[�I�l�X�g]";
		mes "�₠�A" + strcharinfo(0);
		mes "���Ă��ꂽ�ˁB";
		mes "����ɂ��Ă��A�������̂�";
		mes "�����ˁB";
		mes "�N�Əo����Ă��炾����";
		mes "���񂶂�Ȃ����ȁH";
		next;
		mes "[�I�l�X�g]";
		mes "���ꂶ��A�����B�e�ꏊ�Ȃ񂾂���";
		mes "������_���W�����Ȃ񂾂�ˁB";
		mes "���������[���܂ōs���Ă����Ȃ���";
		mes "�����Ȃ��B";
		mes "�����댯�ȎB�e�ɂȂ�Ǝv���B";
		next;
		mes "[�I�l�X�g]";
		mes "�B�e�ꏊ�́A";
		mes "MVP�{�X�����X�^�[";
		mes "^FF0000�����^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�v�����e���n�����H4F^000000";
		mes "�̎ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "�A�N�e�B�u�ȃ����X�^�[��";
		mes "��R���邵";
		mes "�{���Ɋ댯������";
		mes "�����𐮂��Ă���������ĂˁB";
		mes "��A�n�G�̉H�������Ă������ق���";
		mes "�����Ǝv���B";
		next;
		mes "-�I�l�X�g����J�������󂯎����-";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�v�����e���n�����H4F^000000�֍s���A";
		mes "�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�v�����e���n�����H4F^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����������]";
		close2;
		set AC_QUEST_ST_4,2;
		end;
	case 2:
		mes "[�I�l�X�g]";
		mes "��A������x";
		mes "���������ق��������̂��ȁH";
		mes "����̏ꏊ��";
		mes "�댯������C�����ĂˁB";
		next;
		mes "[�I�l�X�g]";
		mes "�B�e�ꏊ�́A";
		mes "MVP�{�X�����X�^�[";
		mes "^FF0000�����^000000��";
		mes "�������Ă���}�b�v";
		mes "^0000FF�v�����e���n�����H4F^000000";
		mes "�̎ʐ^���B���Ă��Ăق����񂾁B";
		next;
		mes "[�I�l�X�g]";
		mes "�A�N�e�B�u�ȃ����X�^�[��";
		mes "��R���邵";
		mes "�{���Ɋ댯������";
		mes "�����𐮂��Ă���������ĂˁB";
		mes "��A�n�G�̉H�������Ă������ق���";
		mes "�����Ǝv���B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "-^0000FF�v�����e���n�����H4F^000000�֍s���A";
		mes "�ʐ^���B�e���Ă���]";
		mes " ";
		mes "^0000FF�v�����e���n�����H4F^000000�ւ�";
		mes "�@^0000FF�v�����e��^000000����������]";
		close;
	case 3:
		mes "[�I�l�X�g]";
		mes strcharinfo(0);
		mes "�����Ŗ߂��Ă��Ă����";
		mes "�{���ɂ悩�����B";
		mes "����͂�������";
		mes "��ς������񂶂�Ȃ��H";
		next;
		if(select("�y��������","��ς�����")==1){
			emotion 23;
			mes "[�I�l�X�g]";
			mes "�����[�[���I";
			mes "����" + strcharinfo(0) + "��";
			mes "�����`���҂������񂾂ˁI";
			mes "�������Ȃ��[�B";
			mes "�l����Ζ`���҂ɂȂ���";
			mes "�F�X�`������񂾁B";
			next;
		}
		else {
			emotion 33;
			mes "[�I�l�X�g]";
			mes "��������ˁ[�B";
			mes "�����X�^�[����R����ꏊ";
			mes "�Ȃ񂾂���B";
			mes "���[�A�����l���`���҂ɂȂ肽���I";
			next;
		}
		emotion 0;
		mes "[�I�l�X�g]";
		mes "���A�������I";
		mes "�e���N�̎B�e���Ă����ʐ^���݂�";
		mes "�l���`���҂ɂȂ邱�Ƃ�";
		mes "�F�߂Ă��ꂽ�񂾁I";
		mes "�e�͖l���B���Ă����Ɗ��Ⴂ";
		mes "���Ă������ǂ��ˁB";
		next;
		mes "[�I�l�X�g]";
		mes strcharinfo(0) + "�ɂ�";
		mes "���������񂾂��ǁA";
		mes "�e�ɂ͖l���B�e���Ă������Ă��Ƃ�";
		mes "�Ȃ��Ă��邩��A";
		mes "����͂��߂��B";
		next;
		menu "�C�ɂ��Ȃ���",-;
		mes "[�I�l�X�g]";
		mes "���肪�Ƃ��c�c";
		mes "�l���`���҂ɂȂ�����";
		mes "�N�Ƃ��ꏏ�ɖ`�����Ă݂����ȁ[�B";
		next;
		if('@novice){
			mes "�]�I�l�X�g�ɃJ������Ԃ��A";
			mes "�@�A�C�e�����󂯎�����]";
			next;
		}
		else {
			mes "�]�I�l�X�g�ɃJ������Ԃ����]";
			next;
		}
		emotion 21;
		mes "[�I�l�X�g]";
		mes "���x����`���Ă����";
		mes "�{���ɂ��肪�Ƃ��ˁB";
		mes "�܂��A������������";
		mes "�`���҃A�J�f�~�[�̕���";
		mes "�˗������������Ă��炤����";
		mes "���̂Ƃ��͐�΂�낵���ˁI";
		next;
		if('@novice){
			mes "[�I�l�X�g]";
			mes "���I����������I";
			mes "�C�O�h���V���̗t���Ă���";
			mes "�A�C�e���Ȃ񂾂���";
			mes "�|��Ă���l�������邱�Ƃ�";
			mes "�o������̂Ȃ񂾁B";
			mes "�`���ɖ𗧂ĂĂ�B";
			next;
			if(!checkweight(610,10)){
				mes "�]�d�ʃI�[�o�[�]";
				close;
			}
			getitem 610,10;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_4,99;
		end;
	case 99:
		mes "[�I�l�X�g]";
		mes "���x����`���Ă����";
		mes "�{���ɂ��肪�Ƃ��ˁB";
		mes "�܂��A������������";
		mes "�`���҃A�J�f�~�[�̕���";
		mes "�˗������������Ă��炤����";
		mes "���̂Ƃ��͐�΂�낵���ˁI";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_OTHER:
	switch(AC_QUEST_LV_4){
	case 0:
		mes "[�I�l�X�g]";
		mes "��́A���̎����Ƃ��̎�����";
		mes "�K�v���Ȃ��H";
		close;
	case 1:
	case 2:
		mes "[�I�l�X�g]";
		mes "���肪�Ƃ��I";
		mes "����������B";
		close;
	case 3:
		mes "[�I�l�X�g]";
		mes "����Ń{�X�����X�^�[�֘A������";
		mes "3�ɂȂ�����B";
		mes "�܂��܂��K�v�ɂȂ�Ǝv������";
		mes "�܂���낵���ˁB";
		close;
	case 4:
		mes "[�I�l�X�g]";
		mes "���肪�Ƃ��I";
		mes "����������B";
		close;
	case 5:
		mes "[�I�l�X�g]";
		mes "�{���ɂ������Ȃ��c�c";
		mes "�l��" + strcharinfo(0);
		mes "�̂悤�Ȗ`���҂ɂȂ��悤��";
		mes "�撣���ĕ׋����Ȃ���B";
		mes "���ꂶ��A�܂���낵���ˁB";
		close;
	case 6:
		mes "[�I�l�X�g]";
		mes "�������肪�Ƃ��I";
		mes "�{���ɏ������B";
		close;
	case 7:
		mes "[�I�l�X�g]";
		mes "�����Ƃ��c�c";
		mes "�e�Ɉ�x�A�^���ɘb���Ă݂悤��";
		mes "�v���񂾁B";
		mes "�R�\�R�\�������W�߂ĂĂ�";
		mes "�������̂����΂�Ă��܂����낤���B";
		next;
		mes "[�I�l�X�g]";
		mes strcharinfo(0) + "��";
		mes "�B���Ă����ʐ^��������";
		mes "�^���ɘb���Ă݂��B";
		close;
	case 8:
		mes "[�I�l�X�g]";
		mes "���ӏ��łƂ肠�����́A";
		mes "��������ʂ葵�����ƂɂȂ��B";
		mes "������A" + strcharinfo(0) + "��";
		mes "�撣���Ă��ꂽ����������B";
		mes "����������܂��˗��o���Ă�������";
		mes "��낵���ˁB";
		close;
	case 9:
		mes "[�I�l�X�g]";
		mes "���x����`���Ă����";
		mes "�{���ɂ��肪�Ƃ��ˁB";
		mes "�܂��A������������";
		mes "�`���҃A�J�f�~�[�̕���";
		mes "�˗������������Ă��炤����";
		mes "���̂Ƃ��͐�΂�낵���ˁI";
		close;
	}
}
prt_fild02.gat,305,157,0		script	#�B�e�|�C���gPRT02	139,5,5,{
	if(AC_QUEST_LV_4!=0) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
pay_fild04.gat,267,193,0		script	#�B�e�|�C���gPAY04	139,5,5,{
	if(AC_QUEST_LV_4!=1) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
moc_fild18.gat,232,217,0		script	#�B�e�|�C���gMOC18	139,5,5,{
	if(AC_QUEST_LV_4!=2) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂����̂��ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
gef_fild01.gat,208,242,0		script	#�B�e�|�C���gGEF01	139,5,5,{
	if(AC_QUEST_LV_4!=3) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
moc_fild17.gat,146,145,0		script	#�B�e�|�C���gMOC17	139,5,5,{
	if(AC_QUEST_LV_4!=4) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
moc_fild03.gat,70,336,0		script	#�B�e�|�C���gMOC03	139,5,5,{
	if(AC_QUEST_LV_4!=5) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
gef_fild09.gat,227,29,4		script	�ē���	835,{
	mes "[�I�[�N�̑�]";
	mes "���ӁI";
	mes "���̐�̓I�[�N���o�����܂��B";
	mes "�I�[�N�E�H���A�[��I�[�N���f�B�A";
	mes "�n�C�I�[�N�Ȃǂɂ����ӂ��������B";
	mes "�܂��A�I�[�N�q�[���[��I�[�N���[�h";
	mes "�ɂ͓��ɂ����ӂ��������B";
	close;
}
gef_fild10.gat,251,368,0		script	#�B�e�|�C���gGEF10	139,5,5,{
	if(AC_QUEST_LV_4!=6) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
xmas_dun02.gat,131,130,0		script	#�B�e�|�C���gXMS02	139,5,5,{
	if(AC_QUEST_LV_4!=7) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
prt_sewb4.gat,100,92,0		script	#�B�e�|�C���gSEW04	139,5,5,{
	if(AC_QUEST_LV_4!=8) end;
	switch(AC_QUEST_ST_4){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "�����ŎB�e����΂������ȁB";
		next;
		mes "�]�ʐ^�B�e�����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close2;
		set AC_QUEST_ST_4,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�ʐ^���B�e����K�v�͖����ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]^0000FF�Q�t�F���ɖ߂���";
		mes "^FF0000�I�l�X�g^000000�ɕ񍐂��悤�]";
		close;
	}
}
