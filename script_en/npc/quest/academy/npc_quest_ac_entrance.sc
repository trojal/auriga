//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ��t�E�u�K��
//                                                  by Pneuma
// 1.1 since 2019 Updata, Add �}�X�^�[�E�X�k�X by refis
//------------------------------------------------------------

// ��t��
ac_cl_room.gat,43,41,4	script	��t���G�[��#�G�[��	90,{
	function getcombathan;
	set '@novice, callfunc("AC_GetNovice");

	if(Job==Job_Summoner) {
		mes "[�G�[��]";
		mes "�h��������ł��ˁB";
		mes "�`���҃A�J�f�~�[�ւ悤�����I";
		mes "������茩�w���Ă����Ă��������ˁB";
		close;
	}
	if(AC_PASSPORT>=2){
		if(Job!=Job_Novice) {
			mes "[�G�[��]";
			mes "����ɂ��́B";
			mes strcharinfo(0)+ "����";
			mes "�����׋��M�S�ł��ˁB";
			mes "���x�A���̘b�ł��������Ă��������B";
			close;
		} else {
			if(AC_NOVICE_QUE<10){
				mes "[�G�[��]";
				mes "�܂��킩��Ȃ����Ƃ�";
				mes "�����Ǝv���܂����ǁA";
				mes "�`���҂Ƃ��Ă̓��̂��";
				mes "���ꂩ��ł���B";
				next;
				mes "[�G�[��]";
				mes "�܂��͂��̕����ɂ���";
				mes "^0000FF�v����^000000����ɘb��";
				mes "�����Ƃ����ł���B";
			}
			else if(AC_NOVICE_QUE<20){
				mes "[�G�[��]";
				mes "���낢��Ƌ�����Ă܂��H";
				mes "�V�����������Ă�������A";
				mes "�݂�Ȓ���؂��Ă�́B";
				mes "������^0000FF�A���f�B^000000���񂩂��";
				mes "�b�𕷂��Ƃ����ł���B";
			}
			else if(AC_NOVICE_QUE<30) {
				mes "[�G�[��]";
				mes "�����ɐi�߂Ă���݂����ł��ˁB";
				mes "^0000FF�t�F�C^000000���񂪏����̂��Ƃɂ���";
				mes "�����Ă����͂��ł���B";
				mes "�����̉��ɂ���^0000FF�t�F�C^000000�����";
				mes "�b�𕷂��Ă݂Ă��������ˁB";
			}
			else {
				mes "[�G�[��]";
				mes "�u�K�������I������݂����ł��ˁB";
				mes "����^FF00001���E^000000��";
				mes "�ڎw���܂��ˁB";
				mes "���̍u�K���̉��ɂ���";
				mes "^0000FF�t�F�C^000000�����";
				mes "�����Ƃ����ł���B";
				emotion 2,"";
			}
		}
	}

	if(AC_PASSPORT<2 && !checkquest(201040)){
		mes "[�G�[��]";
		mes "�V�l����ł��ˁB";
		mes "�`���҃A�J�f�~�[�ւ悤�����I";
		mes "�܂��́A���w�葱�����ς܂��܂��傤�B";
		mes "���[�Ɓc�c";
		mes strcharinfo(0)+ "����";
		mes "�ł��ˁB";
		next;
		mes "[�G�[��]";
		mes "�܂��́A���O���c�c";
		mes "�c�c���t�́A";
		next;
		mes "[�G�[��]";
		mes "�܂��́A���O���c�c";
		mes "�c�c���t�́A";
		mes "�c�c�c�c";
		mes "�e�p�́c�c";
		next;
		mes "[�G�[��]";
		mes "�܂��́A���O���c�c";
		mes "�c�c���t�́A";
		mes "�c�c�c�c";
		mes "�e�p�́c�c";
		mes (Sex ? "�J�b�R�C�C":"����")+ "���ƁB";
		mes "�c�c";
		next;
		setquest 201040;
		emotion 46,"";
		mes "[�G�[��]";
		mes "���҂����I";
		mes "���w�葱�������ł���I";
		mes "����ł��Ȃ���";
		mes "�`���҃A�J�f�~�[�̐��k�ł��I";
		next;
		mes "[�G�[��]";
		mes "�`���҃A�J�f�~�[��";
		mes "���E���̖`���҂̂��߂�";
		mes "�ݗ����ꂽ�w�Z�Ȃ́B";
		mes "�`���ҒB�̊�t�ɂ����";
		mes "���藧���Ă���w�Z�ł���B";
		next;
		mes "[�G�[��]";
		mes "�`�����n�߂��΂����";
		mes "�삯�o���̖`���҂���";
		mes "�Ë��҂̖`���҂܂ŁA";
		mes "�����Ȑl���w�т�";
		mes "����w�Z�Ȃ�ł��B";
		next;
		mes "[�G�[��]";
		mes "�`���Ɋ���Ă��Ȃ�������";
		mes "������̖`���҃A�J�f�~�[��";
		mes "�w��ł����ƁA�����Ǝv���܂���B";
		next;
		mes "[�G�[��]";
		mes "����ł͂��������A";
		mes "�`�����n�߂�ɓ������āA";
		mes "��؂Ȃ��Ƃ����������Ă����܂��ˁB";
		next;
		mes "[�G�[��]";
		mes "����́A^FF0000�N�G�X�g^000000�ɂ��Ăł��B";
		mes "�@";
		mes "^0000FF�N�G�X�g^000000�Ƃ͊ȒP�ɂ����ƁA";
		mes "�l�X�ȏꏊ����n�܂�`���ł��B";
		next;
		mes "[�G�[��]";
		mes "�N�G�X�g�̓��e��B�����邱�ƂŁA";
		mes "�o���l���V�A�l�X�ȃT�[�r�X��";
		mes "�󂯂���悤�ɂȂ����肷���ł��B";
		next;
		mes "[�G�[��]";
		mes "�N�G�X�g�͍����Ă������";
		mes "�˗����󂯂āA�Y�݂�����������A";
		mes "�����̒T�������āA����𖾂�����A";
		mes "�����X�^�[�𓢔����Ă���ȂǁA";
		mes "���܂��܂Ȃ��̂�����܂���B";
		next;
		mes "�m�G�[���n";
		mes "^FF0000Alt�{U�L�[^000000�������Ă݂Ă��������B";
		mes "���A�N�G�X�g���X�g�Ə����ꂽ";
		mes "�E�B���h�E�Ɂm�`���҃A�J�f�~�[���w�n";
		mes "�ƃN�G�X�g���\������Ă��܂��ˁB";
		cutin "jp_quest_help01.bmp", 2;
		next;
		mes "[�G�[��]";
		mes "�e�N�G�X�g��^0000FF�N�G�X�g���X�g^000000��";
		mes "�E�B���h�E�ŁA�N�G�X�g����I�����āA";
		mes "�u^FF0000view^000000�v�{�^�����������A";
		mes "�N�G�X�g����^0000FF�_�u���N���b�N^000000����ƁA";
		mes "�ڍד��e���m�F�ł����ł��B";
		next;
		mes "[�G�[��]";
		mes "�m�`���҃A�J�f�~�[���w�n�N�G�X�g��";
		mes "���w�������Ƃ�������Ă��܂��ˁB";
		mes "�N�G�X�g�̓��e�͗l�X�ł�����A";
		mes "���e���킩��Ȃ��Ȃ�����A";
		mes "^FF0000Alt�{U�L�[^000000�������Ă݂Ă��������B";
		next;
		mes "[�G�[��]";
		mes "���������A^0000FF���������N�G�X�g^000000��";
		mes "�N�G�X�g���X�g�̕\����";
		mes "^0000FF�O�����̃}�[�N^000000�ɂȂ�܂���B";
		if(!'@novice){
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[�G�[��]";
			mes "���Ȃ��̂悤�Ȍo���L���Ȑl��";
			mes "���w���Ă����Ȃ�āA";
			mes "�����͉^�������݂����B";
			next;
			mes "[�G�[��]";
			mes "�w�Z�̒����Ƃɂ��ĂȂ�A";
			mes "���̕������ł�����";
			mes "^0000FF�~�b�h^000000���񂪂���Ǝv���܂��̂ŁA";
			mes "�����Ă݂Ă��������ˁB";
			set AC_PASSPORT,2; //���w����
			set AC_AFLIER,0; //���炵�t���O�j��
			close;
		}
		if(!countitem(1243) && !countitem(2414) && !countitem(2510) && !countitem(2352) && !countitem(2112) && !countitem(5055)){
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[�G�[��]";
			mes "����͎�����̓��w�j���ł��B";
			mes "����󂯎���Ă��������B";
			//�{�Ƃł̓`�F�b�N�������Ă��Ȃ��B
			if(checkitemblank()) getitem 1243, 1;
			if(checkitemblank()) getitem 2414, 1;
			if(checkitemblank()) getitem 2510, 1;
			if(checkitemblank()) getitem 2352, 1;
			if(checkitemblank()) getitem 2112, 1;
			if(checkitemblank()) getitem 5055, 1;
		}
		if(!getskilllv(142)){	// �����b���݂̂ɕύX�H
			next;
			cutin "jp_quest_help01.bmp", 255;
			mes "[�G�[��]";
			mes "����H�@�܂��X�L���u^0000FF���}�蓖^000000�v��";
			mes "�o���Ă��Ȃ��悤�ł��ˁB";
			mes "���������Ȃ̂ŁA";
			mes "�X�L���u^0000FF���}�蓖^000000�v�������܂��ˁB";
			mes "����͉�������Ă��鎞��";
			mes "���Ȃ�𗧂X�L���ł���B";
			next;
			skill 142,1,0;
			mes "^4d4dff- �X�L���u���}�蓖�v���C�������B - ^000000";
		}
	}
	if(!checkquest(100056) && !checkquest(201036) && !checkquest(201815)){
		next;
		cutin "jp_quest_help01.bmp", 255;
		mes "[�G�[��]";
		mes "���I�@�����ł����B";
		mes "�@";
		mes "���A�삯�o���̖`���҂�";
		mes "�T�|�[�g����𗧂��A�C�e����";
		mes "�����Ŕz�z���Ă����ł��B";
		next;
		mes "[�G�[��]";
		mes "1�ڂ̃A�C�e����";
		mes "^4d4dff�������퓬����^000000�ƌ����āA";
		mes "�g�p����ƁA1���Ԃ̊ԁA";
		mes "�l���o���l�� 50%��������";
		mes "�A�C�e���Ȃ�ł��I";
		next;
		mes "[�G�[��]";
		mes "2�ڂ̃A�C�e����";
		mes "^4d4dff���x���A�b�v�{�b�N�X^000000�ƌ����āA";
		mes "���̃��x���ɒB����ƊJ���ł���{�b�N�X��";
		mes "�J������Ɨl�X�ȃA�C�e����";
		mes "����ł����ł��I";
		next;
		getcombathan;
	}
	if(checkquest(100056) && !checkquest(201036) && !checkquest(201815)){
		mes "[�G�[��]";
		mes "����ł́A^4d4dff�������퓬����^000000��";
		mes "^4d4dff���x���A�b�v�{�b�N�X^000000��";
		mes "�n���܂��ˁB";
		next;
		getcombathan;
	}
	if(AC_PASSPORT<2){
		next;
		cutin "jp_quest_help01.bmp", 255;
		mes "[�G�[��]";
		mes "���āA������̂��b�͂����܂ŁB";
		mes "�@";
		mes "�����Ɩ𗧂`���̊�{�ƂȂ邨�b��";
		mes "���̕�����^0000FF�v����^000000����A";
		mes "^0000FF�A���f�B^000000����A^0000FF�t�F�C^000000����";
		mes "�����Ă���܂���B";
		next;
		mes "[�G�[��]";
		mes "�����Ŋw�ׂΐ����Ƌ��ɁA";
		mes "�𗧂K���i��";
		mes "�����Ă����܂���B";
		mes "�@";
		mes "�܂��́A���̕����ɂ���";
		mes "^0000FF�v����^000000����ɘb�������Ă��������ˁB";
		setquest 100112;
		set AC_PASSPORT,2; //���w����
		set AC_AFLIER,0; //���炵�t���O�j��
	}
	close;

	function	getcombathan	{
		if(MaxWeight - Weight < 2000){
			mes "[�G�[��]";
			mes "����H";
			mes "�n�����Ǝv������A�ו����d�߂��āA";
			mes "���ĂȂ��݂����ł��ˁB";
			mes "�ו������炵�Ă��������ˁB";
			next;
			mes "�]�����A�C�e���̏d�ʂ���������";
			mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
			mes "�]�����A�C�e�������炵�Ă���A�ēx";
			mes "�b�������Ă��������]";
			close2;
			if(!checkquest(100056)) setquest 100056;
			cutin "jp_quest_help01.bmp", 255;
			end;
		}
		if(checkitemblank() < 3){
			mes "[�G�[��]";
			mes "����H";
			mes "�n�����Ǝv������A";
			mes "�ו�����������݂����ł��B";
			mes "�ו������炵�Ă��������ˁB";
			next;
			mes "�]�����A�C�e���̎�ސ�����������";
			mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
			mes "�]�����A�C�e�������炵�Ă���A�ēx";
			mes "�b�������Ă��������]";
			close2;
			if(!checkquest(100056)) setquest 100056;
			cutin "jp_quest_help01.bmp", 255;
			end;
		}
		cutin "jp_quest_help01.bmp", 255;
		mes "[�G�[��]";
		mes "������g���āA";
		mes "���h�Ȗ`���҂�ڎw���Ă��������I";
		getitem 25023, 1;
		getitem 12312, 10;
		getitem2 22954,1,1,0,0,0,0,0,0,1209600;
		delquest 100056;
		//setquest 201036;	// �Â��N�G�X�g
		setquest 201815;
		next;
		mes "[�G�[��]";
		mes "�{�b�N�X�̒�����l�X�ȃA�C�e����";
		mes "����ł����ł����ǁA";
		mes "�ŏ��ɂ��炦��{�b�N�X�ɂ�";
		mes "�u�h������`�P�b�g�v�Ƃ����A�C�e����";
		mes "�����Ă��܂��B";
		next;
		mes "[�G�[��]";
		mes "�`�P�b�g�̓��x���ɉ����ĐF�X�ȃA�C�e����";
		mes "�����ł���̂ł����A";
		mes "���̃A�C�e�����������Ă����̂�";
		mes "���������ɂ���";
		mes "^FF0000�u�}�X�^�[�E�X�k�X����v^000000�ł��I";
		next;
		mes "[�G�[��]";
		mes "�{�b�N�X����`�P�b�g����ɓ��ꂽ��";
		mes "�K���u�}�X�^�[�E�X�k�X����v�̂Ƃ����";
		mes "���Ă��������I";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@^FF0000�u���x���A�b�v�{�b�N�X�v��";
		mes "�@�󂯎���Ă����2�T�Ԃ�";
		mes "�@�����I�ɏ��ł��܂��B";
		mes "�@�u���x���A�b�v�{�b�N�X�v��";
		mes "�@�Ĕz�z�͍s���Ă���܂���̂�";
		mes "�@�������̊J�������肢���܂��B";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@^FF0000�܂��A�E�ҁA�K���X�����K�[�A";
		mes "�@�X�[�p�[�m�[�r�X�A";
		mes "�@�e�R���L�b�h�ɓ]�E�����ꍇ�A";
		mes "�@�]�E���Ɂu���x���A�b�v�{�b�N�X�v";
		mes "�@�y�сA�u��������`�P�b�g�v�A";
		mes "�@�u�h������`�P�b�g�v��";
		mes "�@��������Ē����܂��B";
		return;
	}
}

ac_cl_room.gat,44,16,0	script	#�u�K1_warp1	45,1,1,{
	if(AC_PASSPORT<2) {
		mes "[�G�[��]";
		mes "���w��]�҂̕��ł��ˁI";
		mes "�܂��͂������";
		mes "���w�̎葱�������肢���܂��B";
		mes " ";
		mes "�]�����̕����琺����������]";
		close;
	}
	warp "ac_cl_area.gat",40,133;
	end;
}

// �v����
ac_cl_room.gat,30,46,6	script	�v����#ac_room	750,{
	function ABOUT_QUESTWINDOW;
	function ABOUT_JOBCHANGE;
	function ABOUT_JOB;
	function ABOUT_SKILL;
	function ABOUT_STATUS;
	function ABOUT_WEAPON;

	if(AC_PASSPORT<2) {
		mes "[�v����]";
		mes "�`���҃A�J�f�~�[�ւ悤�����I";
		mes "�܂���t���ς܂��ĂȂ�";
		mes "�݂����ł��ˁB";
		mes "�܂��͎�t���ς܂��Ă��������ˁB";
		close;
	}
	set '@novice, callfunc("AC_GetNovice");
	if(AC_NOVICE_QUE>=10 || Job!=Job_Novice){
		if(Job!=Job_Novice){
			if(AC_NOVICE_QUE) {
				mes "[�v����]";
				mes "���C�ł���Ă�݂������ˁB";
				mes "���������������Ƃ�����΁A";
				mes "���������B";
				mes "�@";
				mes "���ɂ��ĕ��������񂾂��H";
			} else {
				mes "[�v����]";
				mes "����ɂ��́B";
				mes "�L�~�ɂ͕K�v�Ȃ����Ƃ���";
				mes "�m��Ȃ����ǁA";
				mes "�@";
				mes "���ɂ��ĕ��������񂾂��H";
			}
		} else if(AC_NOVICE_QUE==10){
			mes "[�v����]";
			mes "���͕����̔��Α���";
			mes "^FF0000�A���f�B^000000�������Ă�����B";
			next;
			mes "[�v����]";
			mes "1���E�Ƃɂ��Ă킩��Ȃ�����";
			mes "��������A1���E�ɂȂ����Ƃ��ɂł�";
			mes "�܂������ɂ��ĂˁB";
			mes "����Ƃ��A���ɕ����������Ƃ�";
			mes "����̂��ȁH";
		} else if(AC_NOVICE_QUE > 10 && AC_NOVICE_QUE < 20){
			mes "[�v����]";
			mes "�l�̍u�K�͏I��������B";
			mes "���͕����̔��Α���";
			mes "^0000FF�A���f�B^000000�������Ă�����B";
			mes "����Ƃ��A���ɕ����������Ƃ�";
			mes "����̂��ȁH";
		} else if(AC_NOVICE_QUE >= 20 && AC_NOVICE_QUE < 30){
			mes "[�v����]";
			mes "�l�̍u�K�͏I�����Ă�ˁB";
			mes "�Ō�͕����̉���";
			mes "^0000FF�t�F�C^000000�������Ă�����B";
			mes "����Ƃ��A���ɕ����������Ƃ�";
			mes "����̂��ȁH";
		} else if(AC_NOVICE_QUE>=30){
			mes "[�v����]";
			mes "�����S���I������݂������ˁB";
			mes "������x�A�E�Ƃɂ���";
			mes "�������Ƃ͂��邩���H";
		}
		while(1){
			next;
			switch(select("�N�G�X�g�ɂ���","�]�E�ɂ���","1���E�ɂ���","1���E�̃X�L���ɂ���","1���E�̃X�e�[�^�X�ɂ���","����ɂ���","�������Ƃ͂Ȃ�")){
			case 1:
				ABOUT_QUESTWINDOW;
				break;
			case 2:
				ABOUT_JOBCHANGE;
				break;
			case 3:
				ABOUT_JOB;
				break;
			case 4:
				ABOUT_SKILL;
				break;
			case 5:
				ABOUT_STATUS;
				break;
			case 6:
				ABOUT_WEAPON;
				break;
			default:
				mes "[�v����]";
				mes "�܂������������Ƃ���������A";
				mes "�������邩��A���ł����ĂˁB";
				close2;
				cutin "ninja_throwshurike.bmp", 255;
				end;
			}
			mes "[�v����]";
			mes "���ɕ����������Ƃ͂��邩�ȁH";
		}
	}
	
	switch(AC_NOVICE_QUE){
	case 0:
		mes "[�v����]";
		mes "�V�����̐l���ˁB";
		mes "�u�K��S������^0000FF�v����^000000����B";
		mes "�G�[������^FF0000�N�G�X�g^000000�ɂ��Ă�";
		mes "���������ȁB";
		next;
		mes "[�v����]";
		mes "���������A^FF0000�N�G�X�g�E�B���h�E^000000��";
		mes "�ڂ����b����n�߂悤�B";
		next;
		ABOUT_QUESTWINDOW;
	case 1:
		mes "[�v����]";
		mes "�N�G�X�g�E�B���h�E�ɂ��Ă�";
		mes "�킩�����悤���ˁB";
		if(AC_NOVICE_QUE < 1){
			if(BaseLevel<2 || JobLevel<2){
				mes "���j�������悤�I";
				if(checkre()) {
					if (BaseLevel<2) getexp 2,0;
					if (JobLevel<2) getexp 0,8;
				}
				else {
					if (BaseLevel<2) getexp 10,0;
					if (JobLevel<2) getexp 0,31;
				}
			}
			set AC_NOVICE_QUE,1;
		}
		mes "���́A�`���҂̊�{�m���A";
		mes "�]�E�ɂ��ċ�����ˁI";
		ABOUT_JOBCHANGE;
	case 2:
		mes "[�v����]";
		mes "�]�E�ɂ��Ă͂킩�����悤���ˁB";
		if (AC_NOVICE_QUE < 2){
			if(BaseLevel<3 || JobLevel<3){
				mes "���j�������悤�I";
				if(checkre()) {
					if (BaseLevel<3) getexp 4,0;
					if (JobLevel<3) getexp 0,10;
				}
				else {
					if (BaseLevel<3) getexp 17,0;
					if (JobLevel<3) getexp 0,44;
				}
			}
			set AC_NOVICE_QUE,2;
		}
		mes "���ꂶ��A���̓m�[�r�X����]�E�ł���";
		mes "�E�Ƃɂ��Đ��������I";
		next;
		ABOUT_JOB;
	case 3:
	case 4:
	case 5:
		mes "[�v����]";
		mes "1���E�̐E�Ƃɂ��Ă�";
		mes "�킩�����悤���ˁB";
		if(AC_NOVICE_QUE < 3){
			if(BaseLevel<5 || JobLevel<5){
				mes "���j�������悤�I";
				if(checkre()) {
					if (BaseLevel<4) getexp 5,0;
					if (JobLevel<4) getexp 0,12;
					if (BaseLevel<5) getexp 9,0;
					if (JobLevel<5) getexp 0,16;
				}
				else {
					if (BaseLevel<4) getexp 26,0;
					if (JobLevel<4) getexp 0,59;
					if (BaseLevel<5) getexp 37,0;
					if (JobLevel<5) getexp 0,77;
				}
			}
			set AC_NOVICE_QUE,3;
		}
		if(Job==Job_Novice && AC_NOVICE_QUE<5){
			next;
			mes "[�v����]";
			if(AC_NOVICE_QUE==3){
				mes "���������A�����n���Ă������I";
				next;
			} else {
				mes "�ו��͌��炵�Ă������ȁH";
				next;
				if(select("���炵�Ă���","���炵�ĂȂ�")==2){
					mes "[�v����]";
					mes "�܂��͉ו������炵�Ă��炾�ˁB";
					close;
				}
			}
			set AC_NOVICE_QUE,4;
			if(checkitemblank() == 0){
				mes "^FF0000���x����^000000";
				mes "�]�����A�C�e���̎�ސ���������";
				mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
				mes "�@�ł��܂���]";
				mes "�]�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			} else
			if(Weight>(MaxWeight/100)*90){
				mes "^FF0000���x����^000000";
				mes "�]�����A�C�e���̏d�ʂ�������";
				mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
				mes "�@�ł��܂���]";
				mes "�]�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			}
			getitem 569, 50;
			emotion 46,"";
			set AC_NOVICE_QUE,5;
			mes "[�v����]";
			mes "�`���҂̕K���i�A�񕜃A�C�e�����I";
			mes "�����X�^�[�Ƃ̐퓬�ŁA";
			mes "�������Ƃ��Ɏg���Ƃ������ȁB";
			mes "�@";
			mes "���ꂶ��A�l�̍u�K�͂���ŏI���I";
			next;
			mes "[�v����]";
			mes "���A�l���n�����A�C�e����";
			mes "^0000FF�u��{���v^000000�E�B���h�E����";
			mes "^0000FF�uitem�v^000000�{�^���������āA";
			mes "^0000FF�u�����A�C�e���v^000000�E�B���h�E��";
			mes "�\�����Ċm�F���邱�Ƃ�";
			mes "�ł��邩��ˁB";
		} else {
			mes "�@";
			mes "���ꂶ��A�l�̍u�K�͂���ŏI���I";
		}
		delquest 100112;
		setquest 100116;
		set AC_NOVICE_QUE, 10; //�v�����̍u�K����
	default:
		mes "[�v����]";
		mes "���͕����̔��Α���";
		mes "^FF0000�A���f�B^000000�������Ă�����B";
		next;
		mes "[�v����]";
		mes "1���E�Ƃɂ��Ă킩��Ȃ�����";
		mes "��������A1���E�ɂȂ����Ƃ��ɂł�";
		mes "�܂������ɂ��ĂˁB";
		close;
	}

	function	ABOUT_QUESTWINDOW	{
		while(1){
			mes "[�v����]"; mes "�N�G�X�g�E�B���h�E�̕\����"; mes "^FF0000Alt�{ U^000000�ōs�����B"; mes "�N�G�X�g�̏ڍׂ�"; mes "�N�G�X�g�����_�u���N���b�N���邩�A"; mes "�uview�v�{ �^���ŕ\���ł���B"; cutin "jp_quest_help02.bmp", 2; next; mes "[�v����]"; mes "�����āA^0000FF�N�G�X�g�ڍ׏��^000000�ɂ�"; mes "�˗����e��B�����邽�߂�"; mes "�ړI�������Ă���񂾁B"; mes "�@"; mes "��������Ηǂ��̂�������Ȃ��Ƃ���"; mes "�ڍ׏��Ŋm�F���悤�ˁI"; cutin "jp_quest_help03.bmp", 2; next; mes "[�v����]"; mes "�N�G�X�g�̒��ɂ̓����X�^�[��"; mes "���������Ă�����̂�����B"; mes "���̏ꍇ�̓E�B���h�E�̉���"; mes "�����X�^�[�̏ꏊ���݂�Ƃ����B"; mes "�ǂ̃����X�^�[�����̓|�����̂���"; mes "�킩��񂾁B"; cutin "jp_quest_help04.bmp", 2; next; mes "[�v����]"; mes "���������A���Ԃ��֌W����N�G�X�g��"; mes "�E���Ɏ��Ԃ������Ă����B"; mes "��莞�ԂŒB�����K�v�Ȃ��̂�A"; mes "�w�莞�Ԃ܂Ő����������̂́A"; mes "�����Ɏ��Ԃ������Ă��邩��A"; mes "�m�F���Ă݂�Ƃ������ȁB";
			cutin "jp_quest_help05.bmp", 2;
			next;
			cutin "jp_quest_help05.bmp", 255;
			mes "[�v����]";
			mes "�N�G�X�g�E�B���h�E�ɂ��Ă�";
			mes "�킩�������ȁH";
			mes "�@";
			mes "�N�G�X�g�E�B���h�E�̕\����";
			mes "^FF0000Alt�{U^000000�ōs���邩��ˁB";
			next;
			if(select("�킩����","�킩��Ȃ�")==1) break;
			mes "[�v����]";
			mes "���Ⴀ�A������x��������ˁB";
			next;
		}
		return;
	}

	function	ABOUT_JOBCHANGE	{
		while(1) {
			mes "[�v����]"; mes "���̐��E�̖`���҂�����"; mes "�l�X�ȐE�Ƃɂ��Ă���B"; mes "���̃L�~�̐E�Ƃ́A�m�[�r�X���B"; mes "�ǂ̖`���҂��m�[�r�X����"; mes "�n�܂�񂾁B"; next; mes "[�v����]"; mes "^0000FF�m�[�r�X^000000�����"; mes "^0000FF1���E^000000���A"; mes "����1���E�ɓ]�E���ł���"; next; mes "[�v����]"; mes "�������A�]�E�͈�x�s���Ă��܂��ƁA"; mes "���̐E�Ƃɂ͖߂�Ȃ��B"; mes "�]�E����E�Ƃ͐T�d�ɑI��łˁB"; mes "�܂��A�]�E�����E�Ƃɂ���āA"; mes "����ʂ̐E�Ƃ����܂��Ă���񂾁B"; next; mes "[�v����]"; mes "1���E�ɂȂ�ƁA�m�[�r�X�̂Ƃ��ɂ�"; mes "�g�p�ł��Ȃ��X�L����"; mes "�A�C�e�����g����悤�ɂȂ�B"; mes "�m�[�r�X�@���@1���E�@���@2���E"; mes "�ƒi�K��i���"; mes "�������Ă������Ƃ��ł����B"; next; mes "[�v����]"; mes "�l����3�l�̍u�K���I��邱��ɂ�"; mes "�L�~�͓]�E�ł���悤��"; mes "�Ȃ��Ă���͂�����B"; 
			next;
			mes "[�v����]";
			mes "�]�E�ɂ��Ă͂킩�������ȁH";
			next;
			if (select("�킩����","�킩��Ȃ�")==1) break;
			mes "[�v����]";
			mes "���Ⴀ�A������x��������ˁB";
			next;
		}
		return;
	}

	function	ABOUT_JOB_CLASS1	{
		cutin "weapon_list.bmp", 255;
		next;
		mes "[�v����]";
		mes "���E�ɂ�7�̊�{ �I��1���E��";
		mes "���̑���3�̓���1���E��";
		mes "���݂��Ă���񂾁B";
		next;
		mes "[�v����]";
		mes "��{ �I��1���E��^0000FF�\�[�h�}��^000000�A";
		mes "^0000FF�}�W�V����^000000�A^0000FF�A�R���C�g^000000�A";
		mes "^0000FF�V�[�t^000000�A^0000FF�A�[�`���[^000000�A";
		mes "^0000FF�}�[�`�����g^000000�A^0000FF�e�R���L�b�h^000000��7�E�ƁB";
		mes "����1���E��^0000FF�K���X�����K�[^000000�A^0000FF�E��^000000�A";
		mes "^0000FF�X�[�p�[�m�[�r�X^000000��3��ނ��ˁB";
		next;
		return;
	}

	function	ABOUT_JOB_FEATURE	{
	switch(select("�ڋߐ킪����","�������킪����","���@�킪����","���Ԃւ̎x��������","�ו��^�т₨���ׂ�������","�i���킪����","����ȓ����őI�т���",(AC_NOVICE_QUE2 & 0x2 ? "�E�Ƃɂ��Ă͂킩����" :
		""))) {
		case 1:
			cutin "swordman_1.bmp", 2;
			mes "[�v����]";
			mes "�ڋߐ킪���ӂȐE�ƂƂ����ƁA";
			mes "1���E��^0000FF�\�[�h�}��^000000��";
			mes "���̏�ʂ̐E�ƂƂȂ�";
			mes "�i�C�g��N���Z�C�_�[�ɂȂ邩�ȁB";
			next;
			mes "[�v����]";
			mes "�őO���ł̍U���Ȃ�i�C�g�A";
			mes "���Ȃ�N���Z�C�_�[��";
			mes "�C���邱�ƂɂȂ邾�낤�ˁB";
			mes "���̒i�̍��̐E�Ƃ��i�C�g";
			mes "�E�̐E�Ƃ��N���Z�C�_�[�ɂȂ��B";
			next;
			cutin "thief_1.bmp", 2;
			mes "[�v����]";
			mes "�܂��A�f�����U����g�y����";
			mes "�G�̍U����������Đ킦��";
			mes "1���E��^0000FF�V�[�t^000000��";
			mes "���̏�ʂ̐E�ƂƂȂ�A�T�V���A";
			mes "���[�O�Ȃǂ��O���Ő킦��E�Ƃ��ˁB";
			next;
			mes "[�v����]";
			mes "�A�T�V���⃍�[�O��";
			mes "�G�̃A�C�e����D���X�L����";
			mes "�g���邱�Ƃ������āA";
			mes "��ɓ��ꂽ�A�C�e���𔄂邱�ƂŁA";
			mes "�����𒙂߂邱�Ƃ��ł���B";
			next;
			mes "[�v����]";
			mes "���Ƀ��[�O�̃X�i�b�`���[�Ƃ���";
			mes "�X�L���͒ʏ�̍U������";
			mes "�G�̃A�C�e����D�����Ƃ�";
			mes "�ł��邽�߁A���ɋ��͂���B";
			next;
			mes "[�v����]";
			mes "���̒i�̍��̐E�Ƃ��A�T�V��";
			mes "�E�̐E�Ƃ����[�O�ɂȂ��B";
			next;
			cutin "thief_1.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]1���E�̃\�[�h�}���]";
			mes "�]�琬��Փx�F���S�Ҍ���^FF0000(����)^000000�]";
			mes "�]1���E�̃V�[�t�]";
			mes "�]�琬��Փx�F���S�Ҍ���^FF0000(����)^000000�]";
			break;
		case 2:
			cutin "archer_1.bmp", 2;
			mes "[�v����]";
			mes "�������킪���ӂȐE�ƂƂ����ƁA";
			mes "1���E��^0000FF�A�[�`���[^000000��";
			mes "���̏�ʂ̐E�ƂƂȂ�n���^�[�A";
			mes "�_���T�[��o�[�h�ɂȂ邩�ȁB";
			next;
			cutin "archer_3.bmp", 2;
			mes "[�v����]";
			mes "���Ƀn���^�[�ɂȂ�ƁA���ړI��";
			mes "�U���ł͂Ȃ��A㩂�ݒu����";
			mes "�X�L���𗘗p���āA�G��U�������";
			mes "�키�悤�Ȃ��Ƃ��o����悤�ɂȂ�B";
			next;
			cutin "archer_4.bmp", 2;
			mes "[�v����]";
			mes "�_���T�[��o�[�h��";
			mes "���Ԃƈꏏ�ɐ키�Ƃ��ȂǁA";
			mes "�L���Ȏx���X�L�����g�����Ƃ�";
			mes "�ł���ˁB";
			next;
			cutin "archer_4.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]1���E�̃A�[�`���[�]";
			mes "�]�琬��Փx�F���S�Ҍ���^FF0000(����)^000000�]";
			break;
		case 3:
			cutin "magician_1.bmp", 2;
			mes "[�v����]";
			mes "���@�킪���ӂȐE�ƂƂ����ƁA";
			mes "1���E��^0000FF�}�W�V����^000000��";
			mes "���̏�ʂ̐E�ƂƂȂ�E�B�U�[�h�A";
			mes "�Z�[�W�ȂǂɂȂ�ˁB";
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[�v����]";
			mes "�܂��A��̓��ɂȂ邩��";
			mes "�m��Ȃ�����ǁA�e�R���L�b�h��";
			mes "��ʂ̐E�ƂɂȂ�\�E�������J�[��";
			mes "�G�X�}�Ƃ������͂Ȗ��@�U����";
			mes "�g�����Ƃ��ł���ˁB";
			next;
			cutin "magician_3.bmp", 2;
			mes "[�v����]";
			mes "���͂Ȗ��@�U���ŁA";
			mes "�G��ł��|�����Ƃ��ł���̂�";
			mes "�E�B�U�[�h�B";
			mes "���͂ȍU�����o���锼�ʁA";
			mes "���ɂ͊��҂��Ȃ��ق���";
			mes "�������ȁB";
			next;
			cutin "magician_4.bmp", 2;
			mes "[�v����]";
			mes "�Z�[�W�͊e��̑����̎�_��";
			mes "�����̑ϐ����������Đ키���Ƃ�";
			mes "�ł���E�ƂɂȂ�ˁB";
			next;
			cutin "magician_4.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]1���E�̃}�W�V�����]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			break;
		case 4:
			cutin "acolyte_1.bmp", 2;
			mes "[�v����]";
			mes "���Ԃւ̎x�������ӂȐE�ƂƂ����ƁA";
			mes "1���E��^0000FF�A�R���C�g^000000��";
			mes "���̏�ʂ̐E�ƂƂȂ�v���[�X�g�A";
			mes "���̒i�̍��ɕ\������Ă���";
			mes "�E�ƂɂȂ�ˁB";
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[�v����]";
			mes "�܂��A1���E��^0000FF�e�R���L�b�h^000000��";
			mes "��ʂ̐E�ƂƂȂ�\�E�������J�[�A";
			next;
			cutin "archer_4.bmp", 2;
			mes "[�v����]";
			mes "1���E��^0000FF�A�[�`���[^000000�̏�ʂ̐E�ƂƂȂ�";
			mes "�o�[�h�A�_���T�[�Ƃ������E�Ƃ�";
			mes "�x�������ӂƂ�����ˁB";
			next;
			mes "[�v����]";
			cutin "acolyte_3.bmp", 2;
			mes "�v���[�X�g�ɂ�";
			mes "�L���G�G���C�\���Ƃ����Ώۂ�";
			mes "�o���A�[�𒣂�A���񐔎��";
			mes "�X�L����ASP�̎��R�񕜗ʂ�2�{  ��";
			mes "�Ȃ�}�O�j�t�B�J�[�g�Ȃ�";
			mes "���͂Ȏx���X�L��������B";
			next;
			cutin "taekwonkid_4.bmp", 2;
			mes "[�v����]";
			mes "�\�E�������J�[�������X�L���ɂ�";
			mes "�e�E�Ƃ��Ƃ̌��ʂ͈قȂ邯��ǁA	";
			mes "�x���Ƃ��ċ��͂ȍ��n�X�L��������B";
			next;
			cutin "archer_4.bmp", 2;
			mes "[�v����]";
			mes "�o�[�h�ɂ̓u���M�̎��Ƃ���";
			mes "�͈͓��̃v���C���[��";
			mes "�r�����Ԃ�Z�k���A";
			mes "�X�L���g�p��̍d�������炷";
			mes "���͂ȃX�L��������B";
			next;
			mes "[�v����]";
			mes "�_���T�[�ɂ�";
			mes "�T�[�r�X�t�H�[���[�Ƃ����͈͓���";
			mes "�Ώۂ̍ő�SP���㏸�����āA";
			mes "SP�̏��Ղ�}����x���X�L��������ˁB";
			next;
			cutin "archer_4.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]1���E�̃A�R���C�g�]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			mes "�]1���E�̃e�R���L�b�h�]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			mes "�]1���E�̃A�[�`���[�]";
			mes "�]�琬��Փx�F���S�Ҍ���^FF0000(����)^000000�]";
			break;
		case 5:
			cutin "merchant_1.bmp", 2;
			mes "[�v����]";
			mes "�ו��^�т₨���ׂ������ӂ�";
			mes "�E�ƂƂ����ƁA1���E��";
			mes "^0000FF�}�[�`�����g^000000��";
			mes "���̏�ʂ̐E�Ƃ̃u���b�N�X�~�X�A";
			mes "�A���P�~�X�g�ɂȂ�ˁB";
			next;
			mes "[�v����]";
			mes "�}�[�`�����g�n�̐E�Ƃɂ�";
			mes "�I�X�J�݂Ƃ������̐E�Ƃɂ�";
			mes "�Ȃ��X�L��������̂ŁA";
			mes "�A�C�e���̔����s���Ղ�����������B";
			next;
			mes "[�v����]";
			mes "���������肵���A�C�e����";
			mes "�D���Ȓl�i�Őݒ肵�āA";
			mes "���̏�Ŕ���o�����Ƃ��o����񂾁B";
			mes "�l�i�͎����Ō��߂��邩��A";
			mes "����Ŕ�����A";
			mes "�����l�i�Ŕ��邱�Ƃ��ł���B";
			next;
			cutin "merchant_1.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]1���E�̃}�[�`�����g�]";
			mes "�]�琬��Փx�F�㋉�Ҍ����]";
			break;
		case 6:
			cutin "taekwonkid_2.bmp", 2;
			mes "[�v����]";
			mes "�i���킪���ӂȐE�ƂƂ����ƁA";
			mes "1���E��^0000FF�e�R���L�b�h^000000��A";
			next;
			cutin "taekwonkid_3.bmp", 2;
			mes "[�v����]";
			mes "�e�R���L�b�h�̏�ʂ�";
			mes "�E�ƂƂȂ錝���A";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[�v����]";
			mes "���Ƃ�1���E��^0000FF�A�R���C�g^000000��";
			mes "��ʂ̐E�ƂƂȂ郂���N�ɂȂ�ˁB";
			next;
			cutin "taekwonkid_2.bmp", 2;
			mes "[�v����]";
			mes "�e�R���L�b�h�͕������؎������A";
			mes "�Ȃ݂̑̂̂Ő키�E�Ƃ��ˁB";
			mes "�g�������Ƃ����X�L���͎����ɗl�X��";
			mes "������t�^���Đ키���Ƃ��ł��邽�߁A";
			mes "����̎�_�������Ƃ��ł���B";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[�v����]";
			mes "�����N�ɂ̓X�L������X�L���ւ�";
			mes "�A�g���s���āA���͂ȃ_���[�W��";
			mes "�^���Ă�����O�i���Ȃǂ�����B";
			mes "�܂��A���C���e�����Ƃ���";
			mes "�ꌂ�K�E�̃X�L�������邩��A";
			mes "�킢���͑��ʂɂ���B";
			next;
			cutin "acolyte_4.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]1���E�̃e�R���L�b�h�]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			mes "�]1���E�̃A�R���C�g�]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			break;
		case 7:
			mes "[�v����]";
			mes "����ȐE�Ƃ́A";
			mes "�V�Ă̖`���҂ɂ�";
			mes "�]�肨���߂͂ł��Ȃ����ǁA";
			mes "�����͂����B";
			mes "�@";
			mes "���������������ȁH";
			next;
			switch(select("�E�p������","�e���g���̂�����","�m�[�r�X�Ő�������")){
			case 1:
				cutin "ninja.bmp", 2;
				mes "[�v����]";
				mes "�E�p�����ӂȐE�ƂƂ����ƁA";
				mes "����1���E��^0000FF�E��^000000�ɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "���̐E�Ƃ͏�ʂ̐E�Ƃ�";
				mes "�Ȃ����ƂƁA�������Ă����ɂ�";
				mes "���̐E�Ƃɂ͂Ȃ���J��";
				mes "���邩��A������";
				mes "�C�����Ŗڎw���Ƒ�ς���B";
				next;
				mes "[�v����]";
				mes "�E�҂͖��@�̂悤�ȍU���X�L����";
				mes "��g���Đ������A";
				mes "�������ł��镐��𗘗p����";
				mes "����������U�����邱�Ƃ��ł���B";
				next;
				mes "[�v����]";
				mes "�������A�ڋ߂��Đ������A";
				mes "������HP�ƈ���������";
				mes "���͂Ȉꌂ���J��o����M�Ƃ���";
				mes "�X�L�����o���邱�Ƃ��ł���B";
				mes "��ĕ��������ŁA";
				mes "�킢�����傫���ς��E�Ƃ��ˁB";
				next;
				cutin "ninja.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "�]����1���E�̔E�ҁ]";
				mes "�]�琬��Փx�F�㋉�Ҍ����]";
				break;
			case 2:
				cutin "gunslinger.bmp", 2;
				mes "[�v����]";
				mes "�e���g���̂����ӂƂ����ƁA";
				mes "����1���E��^0000FF�K���X�����K�[^000000��";
				mes "�Ȃ�ˁB";
				next;
				mes "[�v����]";
				mes "���̐E�Ƃ͏�ʂ̐E�Ƃ�";
				mes "�Ȃ����ƂƁA�������Ă����ɂ�";
				mes "���̐E�Ƃɂ͂Ȃ���J��";
				mes "���邩��A������";
				mes "�C�����Ŗڎw���Ƒ�ς���B";
				next;
				mes "[�v����]";
				mes "�K���X�����K�[��";
				mes "���ʂȏe���������Ƃ̂ł���E�ƂŁA";
				mes "�e�̌n���ɂ���āA";
				mes "�킢�����ς��E�ƂɂȂ�B";
				next;
				mes "[�v����]";
				mes "��{  �ƂȂ�n���h�K���A";
				mes "�͈͍U���������V���b�g�K���A";
				mes "�������U���ɓK�������C�t���A";
				mes "�f�����U�����ł���K�g�����O�A";
				next;
				mes "[�v����]";
				mes "�ꌂ�̃_���[�W���傫���O���l�[�h��";
				mes "�����Ȃ�Ɏg�����Ȃ����Ƃ�";
				mes "�K�v�ɂȂ��B";
				next;
				cutin "gunslinger.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "�]����1���E�̃K���X�����K�[�]";
				mes "�]�琬��Փx�F�㋉�Ҍ����]";
				break;
			case 3:
				cutin "super_novice.bmp", 2;
				mes "[�v����]";
				mes "����!?";
				mes "�m�[�r�X�̂܂ܐ��������H";
				mes "����ȋM�d�ȃL�~�Ɋ��߂���̂�";
				mes "����1���E��^0000FF�X�[�p�[�m�[�r�X^000000����";
				mes "�Ȃ����ȁB";
				next;
				mes "[�v����]";
				mes "�X�[�p�[�m�[�r�X�͏�ʂ̐E�Ƃ�";
				mes "�Ȃ����Ƃ�A�X�[�p�[�m�[�r�X��";
				mes "�Ȃ邽�߂ɂ�BaseLv��45�ȏ��";
				mes "���Ȃ���΂Ȃ�Ȃ����ƂȂǁA";
				mes "�������Ă����ɂ͑��̐E�Ƃɂ͂Ȃ�";
				mes "��J����R�����B";
				next;
				mes "[�v����]";
				mes "�X�[�p�[�m�[�r�X��";
				mes "����1���E�̈ꕔ����������{  �I��";
				mes "�X�L�����قƂ�Ǌo���邱�Ƃ�";
				mes "�ł��邩��A�����̎d���������ł�";
				mes "���ʂȐ킢�����o����悤��";
				mes "�Ȃ邩������Ȃ��ˁB";
				next;
				mes "[�v����]";
				mes "���̂���E�Ƃł͂��邯��ǁA";
				mes "���̐E�Ƃ�ڎw���l��";
				mes "�`���҃A�J�f�~�[�ł�";
				mes "�����M�d�ȑ��݂Ƃ�����ˁB";
				next;
				cutin "super_novice.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "�]����1���E�̃X�[�p�[�m�[�r�X�]";
				mes "�]�琬��Փx�F�㋉�Ҍ����]";
				break;
			}
		}
		next;
		cutin "swordman_2.bmp", 255;
		return;
	}

	function	ABOUT_JOB_SELECT	{
		switch(select("^0000FF�\�[�h�}��^000000","^0000FF�}�W�V����^000000","^0000FF�A�R���C�g^000000","^0000FF�V�[�t^000000","^0000FF�A�[�`���[^000000","^0000FF�}�[�`�����g^000000","^0000FF�e�R���L�b�h^000000","^0000FF����1���E^000000","�E�Ƃɂ��Ă͂킩����")){
		case 1:
			mes "[�v����]";
			mes "^0000FF�\�[�h�}��^000000���ˁB";
			mes "�Z���A�Ў茕�A���茕�A���A���A";
			mes "�݊�Ƃ����������̎�ނ̕����";
			mes "�������邱�Ƃ��ł���E�Ƃ��B";
			mes "1���E�̃\�[�h�}�������2�n����";
			mes "�]�E���\�ɂȂ��B";
			cutin "swordman_1.bmp", 2;
			next;
			mes "[�v����]";
			mes "��̒i�ɕ\������Ă���̂�";
			mes "1���E��^0000FF�\�[�h�}��^000000�B";
			mes "�\�[�h�}���͌��m��";
			mes "�Ă΂�邱�Ƃ������E�Ƃ��ˁB";
			cutin "swordman_2.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̍��ɕ\������Ă���̂��A";
			mes "�\�[�h�}���ɂȂ������";
			mes "�]�E���ĂȂ��2���E�̃i�C�g�B";
			cutin "swordman_3.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̉E�ɕ\������Ă���̂��A";
			mes "�\�[�h�}���ɂȂ�����ɓ]�E���ĂȂ��";
			mes "2���E��^0000FF�N���Z�C�_�[^000000�B";
			cutin "swordman_4.bmp", 2;
			next;
			mes "[�v����]";
			mes "�\�[�h�}���͌��Z�ɗD�ꂽ�E�Ƃ���B";
			mes "�ߐڐ퓬�ł͔��ɋ��͂ȗ͂�";
			mes "��������񂾁B";
			mes "HP�����̐E�Ƃ���";
			mes "��{ �I�ɍ����̂��������ˁB";
			cutin "swordman_2.bmp", 2;
			next;
			cutin "swordman_2.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]�\�[�h�}���]";
			mes "�]�琬��Փx�F���S�Ҍ���^FF0000(����)^000000�]";
			break;
		case 2:
			mes "[�v����]";
			mes "^0000FF�}�W�V����^000000���ˁB";
			mes "�Z���A��Ƃ�������ނ̕����";
			mes "�������邱�Ƃ��ł���E�Ƃ��B";
			mes "1���E�̃}�W�V���������2�n����";
			mes "�]�E���\�ɂȂ��B";
			cutin "magician_1.bmp", 2;
			next;
			mes "[�v����]";
			mes "��̒i�ɕ\������Ă���̂�";
			mes "1���E��^0000FF�}�W�V����^000000�B";
			cutin "magician_2.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̍��ɕ\������Ă���̂��A";
			mes "�}�W�V�����ɂȂ������";
			mes "�]�E���ĂȂ��2���E��^0000FF�E�B�U�[�h^000000�B";
			cutin "magician_3.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̉E�ɕ\������Ă���̂��A";
			mes "�}�W�V�����ɂȂ�����ɓ]�E���ĂȂ��";
			mes "2���E��^0000FF�Z�[�W^000000�B";
			cutin "magician_4.bmp", 2;
			next;
			mes "[�v����]";
			mes "^0000FF�}�W�V����^000000�͖��@�̍U���͂�";
			mes "�D�ꂽ�E�Ƃ���B";
			cutin "magician_2.bmp", 2;
			next;
			mes "[�v����]";
			mes "�̗͂��R�������Ƃ������΁A";
			mes "���̐E�Ƃƈ���āA���@�ɑ�����";
			mes "���邽�߁A��_�������U����";
			mes "�s���₷���A���͂Ȗ��@�œG��";
			mes "��|�ł��邱�Ƃ��������ˁB";
			next;
			cutin "magician_2.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]�}�W�V�����]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			break;
		case 3:
			mes "[�v����]";
			mes "^0000FF�A�R���C�g^000000���ˁB";
			mes "�݊�A��Ƃ�������ނ̕����";
			mes "�������邱�Ƃ��ł���E�Ƃ��B";
			mes "1���E�̃A�R���C�g�����2�n����";
			mes "�]�E���\�ɂȂ��B";
			cutin "acolyte_1.bmp", 2;
			next;
			cutin "acolyte_2.bmp", 2;
			mes "[�v����]";
			mes "��̒i�ɕ\������Ă���̂�";
			mes "1���E��^0000FF�A�R���C�g^000000�B";
			next;
			cutin "acolyte_3.bmp", 2;
			mes "[�v����]";
			mes "���̒i�̍��ɕ\������Ă���̂��A";
			mes "�A�R���C�g�ɂȂ������";
			mes "�]�E���ĂȂ��2���E��^0000FF�v���[�X�g^000000�B";
			next;
			cutin "acolyte_4.bmp", 2;
			mes "[�v����]";
			mes "���̒i�̉E�ɕ\������Ă���̂��A";
			mes "�A�R���C�g�ɂȂ�����ɓ]�E���ĂȂ��";
			mes "2���E��^0000FF�����N^000000�B";
			next;
			cutin "acolyte_2.bmp", 2;
			mes "[�v����]";
			mes "^0000FF�A�R���C�g^000000�͐��E�҂̊�Ղɂ���āA";
			mes "���Ԃ̔\�͂������o������A";
			mes "�����������Ԃ�������Ƃ�";
			mes "�D�ꂽ�E�Ƃ���B";
			mes "�p�[�e�B�[�ł͌������Ȃ����݂�";
			mes "�Ȃ邱�Ƃ��������ˁB";
			next;
			cutin "acolyte_2.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]�A�R���C�g�]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			break;
		case 4:
			mes "[�v����]";
			mes "^0000FF�V�[�t^000000���ˁB";
			mes "�Z���A�Ў茕�A���A�|";
			mes "�Ƃ�������ނ̕����";
			mes "�������邱�Ƃ��ł���E�Ƃ��B";
			mes "1���E��^0000FF�V�[�t^000000�����2�n����";
			mes "�]�E���\�ɂȂ��B";
			cutin "thief_1.bmp", 2;
			next;
			mes "[�v����]";
			mes "��̒i�ɕ\������Ă���̂�";
			mes "1���E��^0000FF�V�[�t^000000�B";
			cutin "thief_2.bmp", 2;
			next;
			cutin "thief_3.bmp", 2;
			mes "[�v����]";
			mes "���̒i�̍��ɕ\������Ă���̂��A";
			mes "�V�[�t�ɂȂ������";
			mes "�]�E���ĂȂ��2���E��^0000FF�A�T�V��^000000�B";
			next;
			cutin "thief_4.bmp", 2;
			mes "[�v����]";
			mes "���̒i�̉E�ɕ\������Ă���̂��A";
			mes "�V�[�t�ɂȂ�����ɓ]�E���ĂȂ��";
			mes "2���E��^0000FF���[�O^000000�B";
			next;
			cutin "thief_2.bmp", 2;
			mes "[�v����]";
			mes "^0000FF�V�[�t^000000�͐g�y���𐶂����A";
			mes "�U��������Đ퓬���s�����Ƃ�";
			mes "���ӂȐE�Ƃ��B";
			mes "�G����A�C�e���𓐂񂾂�A";
			mes "�p���������Ƃ��ł���B";
			next;
			mes "[�v����]";
			mes "�ł��g�p�����U���ȂǁA";
			mes "�ς�����킢�����������ˁB";
			next;
			cutin "thief_2.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]�V�[�t�]";
			mes "�]�琬��Փx�F���S�Ҍ���^FF0000(����)^000000�]";
			break;
		case 5:
			cutin "archer_1.bmp", 2;
			mes "[�v����]";
			mes "^0000FF�A�[�`���[^000000���ˁB";
			mes "�Z���A�|�Ƃ�������ނ̕����";
			mes "�������邱�Ƃ��ł���E�Ƃ��B";
			mes "1���E�̃A�[�`���[�����2�n����";
			mes "�]�E���\�ɂȂ��B";
			next;
			cutin "archer_2.bmp", 2;
			mes "[�v����]";
			mes "��̒i�ɕ\������Ă���̂�";
			mes "1���E��^0000FF�A�[�`���[^000000�B";
			next;
			cutin "archer_3.bmp", 2;
			mes "[�v����]";
			mes "���̒i�̍��ɕ\������Ă���̂��A";
			mes "�A�[�`���[�ɂȂ������";
			mes "�]�E���ĂȂ��2���E��^0000FF�n���^�[^000000�B";
			next;
			cutin "archer_4.bmp", 2;
			mes "[�v����]";
			mes "���̒i�̉E�ɕ\������Ă���̂��A";
			mes "�A�[�`���[�ɂȂ�����ɓ]�E���ĂȂ��";
			mes "2���E��^0000FF�o�[�h^000000��^0000FF�_���T�[^000000�B";
			mes "^0000FF�o�[�h^000000�͒j�����Ȃ�E�ƁB";
			mes "^0000FF�_���T�[^000000�͏������Ȃ�E�ƂȂ񂾁B";
			next;
			cutin "archer_2.bmp", 2;
			mes "[�v����]";
			mes "^0000FF�A�[�`���[^000000�͋|���������Ƃ�";
			mes "�D�ꂽ�E�Ƃ���B";
			mes "�������̖���g�p�����ˌ���";
			mes "����āA���͂ȍU�����J��o����B";
			mes "�ł��A����ʂɏ������邩��A";
			mes "�񕜍܂̗ʂɂ͒��ӂ��K�v���ȁB";
			next;
			cutin "archer_2.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]�A�[�`���[�]";
			mes "�]�琬��Փx�F���S�Ҍ���^FF0000(����)^000000�]";
			break;
		case 6:
			mes "[�v����]";
			mes "^0000FF�}�[�`�����g^000000���ˁB";
			mes "�Z���A�Ў茕�A���A�݊�";
			mes "�Ƃ�������ނ̕����";
			mes "�������邱�Ƃ��ł���E�Ƃ��B";
			mes "1���E�̃}�[�`�����g�����2�n����";
			mes "�]�E���\�ɂȂ��B";
			cutin "merchant_1.bmp", 2;
			next;
			mes "[�v����]";
			mes "��̒i�ɕ\������Ă���̂�";
			mes "1���E��^0000FF�}�[�`�����g^000000�B";
			mes "�}�[�`�����g��^0000FF���l^000000��";
			mes "�Ă΂�邱�Ƃ������E�Ƃ��ˁB";
			cutin "merchant_2.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̍��ɕ\������Ă���̂��A";
			mes "�}�[�`�����g�ɂȂ������";
			mes "�]�E���ĂȂ��2���E��";
			mes "^0000FF�u���b�N�X�~�X^000000�B";
			cutin "merchant_3.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̉E�ɕ\������Ă���̂��A";
			mes "�}�[�`�����g�ɂȂ������";
			mes "�]�E���ĂȂ��";
			mes "2���E��^0000FF�A���P�~�X�g^000000�B";
			cutin "merchant_4.bmp", 2;
			next;
			mes "[�v����]";
			mes "^0000FF�}�[�`�����g^000000�͕i���̈�����";
			mes "�D�ꂽ�E�Ƃ���B";
			mes "�퓬�͓��ӂł͂Ȃ�����ǁA";
			mes "�A�C�e�����ʂɎ����^�Ԃ��ƂŁA";
			mes "�����Ԃ̐퓬��A�퓬�ȊO��";
			mes "�������C�y�ɂł��邱�Ƃ��������ˁB";
			cutin "merchant_2.bmp", 2;
			next;
			mes "[�v����]";
			mes "�u���b�N�X�~�X��A���P�~�X�g��";
			mes "�Ȃ邱�ƂŁA��X�����Ȃǂ�";
			mes "�ł���悤�ɂȂ�E�Ƃ��ˁB";
			next;
			cutin "merchant_2.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]�}�[�`�����g�]";
			mes "�]�琬��Փx�F�㋉�Ҍ����]";
			break;
		case 7:
			mes "[�v����]";
			mes "^0000FF�e�R���L�b�h^000000���ˁB";
			mes "����𑕔������A";
			mes "�Ȃ̑̂Ő키�E�Ƃ��B";
			mes "1���E�̃e�R���L�b�h�����2�n����";
			mes "�]�E���\�ɂȂ��B";
			cutin "taekwonkid_1.bmp", 2;
			next;
			mes "[�v����]";
			mes "��̒i�ɕ\������Ă���̂�";
			mes "1���E��^0000FF�e�R���L�b�h^000000�B";
			cutin "taekwonkid_2.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̍��ɕ\������Ă���̂��A";
			mes "^0000FF�e�R���L�b�h^000000�ɂȂ������";
			mes "�]�E���ĂȂ��2���E��^0000FF����^000000�B";
			cutin "taekwonkid_3.bmp", 2;
			next;
			mes "[�v����]";
			mes "���̒i�̉E�ɕ\������Ă���̂��A";
			mes "�e�R���L�b�h�ɂȂ������";
			mes "�]�E���ĂȂ��";
			mes "2���E��^0000FF�\�E�������J�[^000000�B";
			cutin "taekwonkid_4.bmp", 2;
			next;
			mes "[�v����]";
			mes "^0000FF�e�R���L�b�h^000000�͏R��Z����g����";
			mes "�키���ƂɗD�ꂽ�E�Ƃ���B";
			mes "�������ؑ����ł��Ȃ�����ǁA";
			mes "���ʂȏR��Ƒf����������";
			mes "�키���Ƃ��\�Ȃ��Ƃ��������ˁB";
			cutin "taekwonkid_2.bmp", 2;
			next;
			mes "[�v����]";
			mes "�܂��A^0000FF�\�E�������J�[^000000�ɂȂ����ꍇ��";
			mes "^0000FF�e�R���L�b�h^000000�̂Ƃ��ɏK�������X�L����";
			mes "�������g���Ȃ��Ȃ�B";
			mes "�K������ۂɁA��X�̂��Ƃ��l����";
			mes "�X�L�����K�����Ă����K�v������ˁB";
			next;
			mes "[�v����]";
			mes "�����A^0000FF�e�R���L�b�h^000000�͑��̊�{ �I��";
			mes "�E��6�ƈقȂ��Ă��āA";
			mes "^0000FF����^000000�A^0000FF�\�E�������J�[^000000��";
			mes "��ʂ̐E�Ƃ͂Ȃ��񂾁B";
			mes "1���ɂ߂邱�Ƃ��l����ƁA";
			mes "��̓���������Ȃ��B";
			next;
			cutin "taekwonkid_2.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�]�e�R���L�b�h�]";
			mes "�]�琬��Փx�F�����Ҍ����]";
			break;
		case 8:
			mes "[�v����]";
			mes "����1���E�ɂ��Ă��ˁB";
			mes "���̐E�Ƃƈ���ē���1���E��";
			mes "1���E�ȏ�̏�ʐE���Ȃ�";
			mes "�E�ƂȂ񂾁B";
			mes "���������E�Ƃ͉����ȁH";
			next;
			switch(select("^0000FF�K���X�����K�[^000000","^0000FF�E��^000000","^0000FF�X�[�p�[�m�[�r�X^000000","���̐E�Ƃɂ��ĕ���")){
			case 1:
				cutin "gunslinger.bmp", 2;
				mes "[�v����]";
				mes "^0000FF�K���X�����K�[^000000���ˁB";
				mes "�e�𑕔�����B��̐E�Ƃ��B";
				mes "�e��5��ނ���B";
				mes "�n���h�K���A���C�t���A�V���b�g�K���A";
				mes "�K�g�����O�K���A�O���l�[�h�K�����B";
				next;
				mes "[�v����]";
				mes "��̒i�ɕ\������Ă���̂�";
				mes "�L�~�̍��̃m�[�r�X�̐E�ƁB";
				mes "���̒i�ɕ\������Ă���̂��A";
				mes "����1���E��^0000FF�K���X�����K�[^000000�ɂȂ��B";
				next;
				mes "[�v����]";
				mes "^0000FF�K���X�����K�[^000000�͏e����g����";
				mes "�키�E�Ƃ���B";
				mes "�퓬�͉���������̍U���ɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "5��ނ̕�����������Ƃ��ł��邩��A";
				mes "�󋵂ɍ��킹���l�X�ȍU���Z��";
				mes "����̂��������ˁB";
				next;
				cutin "gunslinger.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "�]�K���X�����K�[�]";
				mes "�]�琬��Փx�F�㋉�Ҍ����]";
				break;
			case 2:
				cutin "ninja.bmp", 2;
				mes "[�v����]";
				mes "^0000FF�E��^000000���ˁB";
				mes "�Z���A�E�ғ��A�藠���Ƃ�����";
				mes "��ނ̕���𑕔����邱�Ƃ�";
				mes "�ł���E�Ƃ��B";
				next;
				mes "[�v����]";
				mes "��̒i�ɕ\������Ă���̂�";
				mes "�L�~�̍��̃m�[�r�X�̐E�ƁB";
				mes "���̒i�ɕ\������Ă���̂��A";
				mes "����1���E��^0000FF�E��^000000�ɂȂ��B";
				next;
				mes "[�v����]";
				mes "�E�҂͉B�����̍����f����������";
				mes "���ӂƂ���E�Ƃ���B";
				mes "�E�ғ���藠���Ȃǂ̓�������A";
				mes "�E�p�Ƃ��������@�Ɏ��Ă���U����";
				mes "��g�����킢���ł��邱�Ƃ��������ˁB";
				next;
				cutin "ninja.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "�]�E�ҁ]";
				mes "�]�琬��Փx�F�㋉�Ҍ����]";
				break;
			case 3:
				cutin "super_novice.bmp", 2;
				mes "[�v����]";
				mes "^0000FF�X�[�p�[�m�[�r�X^000000���ˁB";
				mes "�Z���A�Ў茕�A���A";
				mes "�݊�A��Ƃ�������ނ̕����";
				mes "�������邱�Ƃ��ł���E�Ƃ��B";
				next;
				mes "[�v����]";
				mes "��̒i�ɕ\������Ă���̂�";
				mes "�L�~�̍��̃m�[�r�X�̐E�ƁB";
				mes "���̒i�ɕ\������Ă���̂��A";
				mes "����1���E��^0000FF�X�[�p�[�m�[�r�X^000000";
				mes "�ɂȂ��B";
				next;
				mes "[�v����]";
				mes "�X�[�p�[�m�[�r�X�͑���1���E��";
				mes "�X�L���̑������K���ł���E�Ƃ���B";
				mes "�m�[�r�X�Ƃ��Ă̐S��";
				mes "���܂ł����������邱�Ƃ�";
				mes "�ł���l�����ǂ蒅���E�Ƃ��ˁB";
				next;
				mes "[�v����]";
				mes "�����ӂ�鐬�����]�߂邱�Ƃ�";
				mes "�����ɂȂ邩�ȁB";
				next;
				cutin "super_novice.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "�]�X�[�p�[�m�[�r�X�]";
				mes "�]�琬��Փx�F�㋉�Ҍ����]";
				break;
			}
		}
		next;
		cutin "swordman_2.bmp", 255;
		return;
	}

	function	ABOUT_JOB	{
		set '@sel,1;
		set '@last,0;
		while(1){
			switch('@sel){
			case 1:
				if('@last!=1 && AC_NOVICE_QUE<3){
					mes "[�v����]";
					mes "����ł͑����̖`���҂��]�E����";
					mes "1���E�ɂ��Đ������悤�B";
				}
				ABOUT_JOB_CLASS1;
				mes "[�v����]";
				mes "�E�Ƃ̓������A�E�Ɩ�";
				mes "�ǂ���ŕ����������ȁH";
				next;
				setarray '@select, 2,3,1,4;
				if('@last==1 || AC_NOVICE_QUE>=3){
					set '@last, '@sel;
					set '@sel, '@select[select("�����ŕ���","�E�Ɩ��ŕ���","1���E�ɂ��čēx����","�E�Ƃɂ��Ă͂킩����")-1];
				} else {
					set '@last, '@sel;
					set '@sel, '@select[select("�����ŕ���","�E�Ɩ��ŕ���","1���E�ɂ��čēx����")-1];
				}
				continue;
			case 2:
				mes "[�v����]";
				if('@last!=2)
					mes "���ꂶ��A�����Ő��������悤�B";
				mes "�ǂ�ȓ������C�ɂȂ�H";
				next;
				ABOUT_JOB_FEATURE;
				mes "[�v����]";
				mes "���̓����ł����������H";
				mes "����Ƃ��E�Ƃŕ��������H";
				next;
				setarray '@select, 4,2,3,1;
				set '@last, '@sel;
				set '@sel, '@select[select("�E�Ƃɂ��Ă͂킩����","�����ŕ���","�E�Ƃŕ���","1���E�ɂ��čēx����")-1];
				continue;
			case 3:
				mes "[�v����]";
				if('@last!=3)
					mes "���ꂶ��A�E�ƂŐ��������悤�B";
				mes "�ǂꂩ�����̂���^FF0000�E��^000000�͂��邩�ȁH";
				next;
				setarray '@select, 4,3,2,1;
				ABOUT_JOB_SELECT;
				mes "[�v����]";
				mes "���̐E�Ƃ����������H";
				mes "����Ƃ��A�����ŕ��������H";
				next;
				set '@last, '@sel;
				set '@sel, '@select[select("�E�Ƃɂ��Ă͂킩����","�E�Ƃŕ���","�����ŕ���","1���E�ɂ��čēx����")-1];
				continue;
			}
			break;
		}
		return;
	}

	function	ABOUT_SKILL	{
		mes "[�v����]";
		mes "^FF0000�e�E�Ƃ̓X�L���Ƃ�������Z�\��";
		mes "�g�ɂ��邱�Ƃ��ł���B^000000";
		mes "�U���A�񕜁A�\�͂̌���A�T�|�[�g��";
		mes "�ǁA���̑��ɂ����낢��Ȍ��ʂ�";
		mes "�������X�L�������݂���񂾁B";
		next;
		mes "[�v����]";
		mes "�܂��A�X�L���ɂ���Ă�Lv��";
		mes "�グ�邱�Ƃ��ł�����̂�����B";
		mes "�ǂ̃X�L�����o���āA���������邩";
		mes "�T�d�ɑI�񂾂ق��������ˁB";
		next;
		mes "[�v����]";
		mes "^FF0000�X�L���̓X�L���|�C���g�������";
		mes "�o���邱�Ƃ��ł����B^000000";
		mes "JobLv��1�グ�邲�Ƃ�1�|�C���g��";
		mes "�X�L���|�C���g��������񂾁B";
		next;
		mes "[�v����]";
		mes "�e�E�Ƃɂ�JobLv�̏����";
		mes "���܂��Ă��āA�S�ẴX�L����";
		mes "�o������킯�ł͂Ȃ�����A";
		mes "�C�����ĂˁB";
		next;
		while(1){
			mes "[�v����]";
			mes "�ǂ̐E�Ƃ�^FF0000�X�L��^000000�ɂ��ĕ��������H";
			next;
			switch(select("^0000FF�\�[�h�}��^000000","^0000FF�}�W�V����^000000","^0000FF�A�R���C�g^000000","^0000FF�V�[�t^000000","^0000FF�A�[�`���[^000000","^0000FF�}�[�`�����g^000000","^0000FF�e�R���L�b�h^000000","^0000FF����1���E^000000","�X�L���ɂ��Ă͂킩����")){
			case 1:
				cutin "swordman_2",2;
				mes "[�v����]";
				mes "^0000FF�\�[�h�}��^000000���ˁB";
				mes "1���E�ł���\�[�h�}����";
				mes "JobLv��50�܂ŏグ�邱�Ƃ��ł����B";
				mes "�X�L���|�C���g��49�|�C���g�g�p�ł���";
				mes "���ƂɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�\�[�h�}��^000000�̃X�L���ŃI�X�X���Ȃ̂�";
				mes "^FF0000HP�񕜗͌���^000000��^FF0000�o�b�V��^000000�A";
				mes "�����^0000FF�v���{ �b�N^000000���낤�ˁB";
				next;
				cutin "swordman_provork",2;
				mes "[�v����]";
				mes "^0000FFHP�񕜗͌���^000000�͋ߐڐ퓬����ƂȂ�";
				mes "�\�[�h�}���ɂƂ��Ă͑厖�ȃX�L�����B";
				mes "^0000FF�v���{ �b�N^000000�͎w�肵���G��";
				mes "���������āA�h��͂�������X�L���B";
				mes "���������G�̍U���͂��オ���Ă��܂�";
				mes "���ǁA���͂ȃX�L�����ˁB";
				next;
				cutin "swordman_bash",2;
				mes "[�v����]";
				mes "^0000FF�o�b�V��^000000�͋��͂Ȉꌂ��";
				mes "�����X�^�[�ɗ^����X�L�����B";
				mes "���������X�^�[��|�����Ƃ�";
				mes "�������󂯂�_���[�W���}������B";
				mes "���̃X�L����Lv10�ɂ��Ă���\�[�h�}��";
				mes "�͐��m��Ȃ���B";
				next;
				mes "[�v����]";
				mes "��͏��X�g������͓������ǁA";
				mes "^0000FF�C���f���A^000000�Ƃ�����";
				mes "�U�����󂯂Ă��ړ��ƍU����";
				mes "�\�ȕ⏕�X�L��������ˁB";
				mes "��Ƀp�[�e�B��g���";
				mes "�키�ꍇ�Ɋ��􂷂�X�L������B";
				next;
				cutin "swordman_bash",255;
				break;
			case 2:
				cutin "magician_2",2;
				mes "[�v����]";
				mes "^0000FF�}�W�V����^000000���ˁB";
				mes "1���E�ł���}�W�V������";
				mes "JobLv��50�܂ŏグ�邱�Ƃ��ł����B";
				mes "�X�L���|�C���g��49�|�C���g�g�p�ł���";
				mes "���ƂɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�}�W�V����^000000�̃X�L���ŃI�X�X���Ȃ̂�";
				mes "^FF0000�t�@�C�A�[�E�H�[��^000000��";
				mes "^FF0000�t�@�C�A�[�{ ���g^000000�A^FF0000�R�[���h�{ ���g^000000�A";
				mes "^FF0000���C�g�j���O�{ ���g^000000�̊e��{ ���g�n��";
				mes "�Ȃ邾�낤�ˁB";
				next;
				cutin "magician_firewall",2;
				mes "[�v����]";
				mes "^FF0000�t�@�C�A�[�E�H�[��^000000�̓}�W�V������";
				mes "�Ƃ��Ĕ��ɑ厖�ȃX�L�����ˁB";
				mes "�����̃}�W�V���������p���閂�@����B";
				mes "HP��h��̗͂��}�W�V�����ł͓G��";
				mes "�ߊ���Ă͂ЂƂ��܂���Ȃ�����ˁB";
				next;
				cutin "magician_coldbolt",2;
				mes "[�v����]";
				mes "^FF0000�t�@�C�A�[�{ ���g^000000�A^FF0000�R�[���h�{ ���g^000000�A";
				mes "^FF0000���C�g�j���O�{ ���g^000000�̊e��{ ���g�n��";
				mes "�}�W�V�����̊�{ �Ƃ������閂�@���B";
				next;
				mes "[�v����]";
				mes "���x���̒Ⴂ�����͂���^0000FF3��ނ̂����A";
				mes "�ǂꂩ1��Lv4�ȏ�^000000�ɂ��āA";
				mes "����̎�_�i�����j�������킢��";
				mes "������Ƃ�����B";
				next;
				mes "[�v����]";
				mes "�r���������\�E���X�g���C�N�Ƃ�����";
				mes "�U�����@������ˁB";
				mes "�З͂͒�߂����ǁA";
				mes "�u���Ƀ_���[�W��";
				mes "�^�������Ƃ��ɂ͕֗�����B";
				next;
				mes "[�v����]";
				mes "�X�e�[�^�X��Dex��";
				mes "�グ�Ă��Ȃ��ꍇ��";
				mes "�r�����x���x���ׁA";
				mes "���̃X�L��������Ă����B";
				next;
				cutin "swordman_bash",255;
				break;
			case 3:
				cutin "acolyte_2",2;
				mes "[�v����]";
				mes "^0000FF�A�R���C�g^000000���ˁB";
				mes "1���E�ł���A�R���C�g��";
				mes "JobLv��50�܂ŏグ�邱�Ƃ��ł����B";
				mes "�X�L���|�C���g��49�|�C���g�g�p�ł���";
				mes "���ƂɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�A�R���C�g^000000�̃X�L���ŃI�X�X���Ȃ̂�";
				mes "^FF0000�q�[��^000000��^FF0000�u���b�V���O^000000�ɂȂ邩�ȁB";
				mes "�A�R���C�g�͑��̐E�ƂƔ�ׂĂ�";
				mes "���ɃX�L�����������E�Ƃ���B";
				mes "�X�L���̏K���͐T�d��";
				mes "�s���K�v������ˁB";
				next;
				mes "[�v����]";
				mes "^FF0000�q�[��^000000�̓A�R���C�g�̊�{  �Ƃ�������";
				mes "�񕜃X�L�����ˁB";
				mes "���̖`���҂ɑ΂��Ă�";
				mes "�g�p�ł��邱�Ƃ���A";
				mes "�����̖`���҂������邱�Ƃ�";
				mes "�ł���͂����B";
				next;
				cutin "acolyte_blessing",2;
				mes "[�v����]";
				mes "^FF0000�u���b�V���O^000000�͍U���̊�{  �ƂȂ�";
				mes "DEX�AINT�ASTR�Ƃ������X�e�[�^�X��";
				mes "�ꎞ�I�ɑ���������X�L���B";
				mes "�􂢂�Ή���ԂƂ�������Ԉُ��";
				mes "�񕜂��邱�Ƃ��ł���B";
				next;
				mes "[�v����]";
				mes "�܂��s���n�A�����n�Ƃ�����";
				mes "�����X�^�[�̑����ɑ΂��Ă�";
				mes "�􂢂̌��ʂ�t�^�ł���ȂǁA";
				mes "�܂��Ɏ����s������̃X�L�����ˁB";
				mes "�u���b�V���O��Lv10�ɂ��Ă���";
				mes "�A�R���C�g�̖`���҂͐��m��Ȃ���B";
				next;
				cutin "acolyte_holylight",2;
				mes "[�v����]";
				mes "�⏕�n�̖��@�����ł͂Ȃ��āA";
				mes "�z�[���[���C�g�Ƃ�����";
				mes "�N�G�X�g�Ŏ擾�ł���";
				mes "�U�����@�X�L��������B";
				next;
				mes "[�v����]";
				mes "�z�[���[���C�g��";
				mes "�U���̎�̂Ƃ������Ƃł͂Ȃ��āA";
				mes "�G�̋C�����炷���Ƃɂ��g����ׁA";
				mes "����o���Ă��������X�L�����ˁB";
				next;
				cutin "acolyte_holylight",255;
				break;
			case 4:
				cutin "thief_2",2;
				mes "[�v����]";
				mes "^0000FF�V�[�t^000000���ˁB";
				mes "1���E�ł���V�[�t��";
				mes "JobLv��50�܂ŏグ�邱�Ƃ��ł����B";
				mes "�X�L���|�C���g��49�|�C���g�g�p�ł���";
				mes "���ƂɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�V�[�t^000000�̃X�L���ŃI�X�X���Ȃ̂�";
				mes "^FF0000�C���x�i��^000000�A^FF0000��𗦑���^000000���ˁB";
				next;
				cutin "thief_envenom",2;
				mes "[�v����]";
				mes "^FF0000�C���x�i��^000000�͓G��ŏ�Ԃɂɂ��āA";
				mes "HP�����X�Ɍ��炵�Ă����X�L���B";
				mes "�łɂ�����₷���G�ƁA";
				mes "������ɂ����G�����邯��ǁA";
				mes "���ɗL���ȃX�L������B";
				next;
				mes "[�v����]";
				mes "^FF0000��𗦑���^000000�̓V�[�t�̑f������";
				mes "����āA�G����̍U�����������";
				mes "�m�������߂邱�Ƃ��ł���X�L�����B";
				next;
				cutin "thief_steal",2;
				mes "[�v����]";
				mes "�܂��A�X�e�B�[���Ƃ�����";
				mes "�V�[�t�炵���G����A�C�e����";
				mes "�D�����X�L��������ˁB";
				mes "�X�L�����x����Dex�������Ȃ��";
				mes "�����������܂��Ă�����B";
				next;
				cutin "thief_steal",255;
				break;
			case 5:
				cutin "archer_2",2;
				mes "[�v����]";
				mes "^0000FF�A�[�`���[^000000���ˁB";
				mes "1���E�ł���A�[�`���[��";
				mes "JobLv��50�܂ŏグ�邱�Ƃ��ł����B";
				mes "�X�L���|�C���g��49�|�C���g�g�p�ł���";
				mes "���ƂɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�A�[�`���[^000000�̃X�L���ŃI�X�X���Ȃ̂�";
				mes "^FF0000�_�u���X�g���C�t�B���O^000000�A";
				mes "^FF0000�`���[�W�A���[^000000���ˁB";
				next;
				cutin "archer_doublestraf",2;
				mes "[�v����]";
				mes "^FF0000�_�u���X�g���C�t�B���O^000000�͓�����";
				mes "2�{ �̖��ł��o���A";
				mes "�傫�ȃ_���[�W��^���邱�Ƃ�";
				mes "�ł���X�L�����ˁB";
				mes "�����̃A�[�`���[�̖`���҂�";
				mes "Lv10�ɂ����͂̃X�L���ɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^FF0000�`���[�W�A���[^000000�͓G�𐁂���΂�";
				mes "�U�����ł���X�L�����B";
				mes "���̃X�L���̓N�G�X�g�Ŏ擾����";
				mes "���Ƃ��ł���B";
				next;
				mes "[�v����]";
				mes "�`���[�W�A���[��";
				mes "���ԂɍU�����Ă���G��";
				mes "�傫��������΂����Ƃ��ł���A";
				mes "^0000FF�p�[�e�B^000000��g�񂾏ꍇ�ɗL����";
				mes "�����ꍇ�������X�L���ɂȂ��B";
				next;
				cutin "archer_arrowshower",2;
				mes "[�v����]";
				mes "���Ƃ͈������������ǁA";
				mes "�A���[�V�����[�Ƃ����͈͍U��������B";
				mes "���̃X�L���͎w�肵���͈͂�";
				mes "��ʂɖ��ł����ݍU������";
				mes "�K�E�Z���ˁB";
				mes "Lv1�`Lv5�Ŋo����l�������X�L�����B";
				next;
				cutin "archer_arrowshower",255;
				break;
			case 6:
				cutin "merchant_2",2;
				mes "[�v����]";
				mes "^0000FF�}�[�`�����g^000000���ˁB";
				mes "1���E�ł���}�[�`�����g��";
				mes "JobLv��50�܂ŏグ�邱�Ƃ��ł����B";
				mes "�X�L���|�C���g��49�|�C���g�g�p�ł���";
				mes "���ƂɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�}�[�`�����g^000000�̃X�L����";
				mes "�I�X�X���Ȃ̂�";
				mes "^FF0000�v�b�V���J�[�g^000000�A^FF0000�I�X�J��^000000���ˁB";
				next;
				mes "[�v����]";
				mes "^FF0000�v�b�V���J�[�g^000000��^0000FF�}�[�`�����g^000000��";
				mes "�Ƃ��Ĕ��ɑ厖�ȃX�L���B";
				mes "�ו����ʂɎ����߂̃J�[�g��";
				mes "�����Ƃ��ł���悤�ɂȂ�̂�";
				mes "���̃X�L���Ȃ񂾁B";
				next;
				mes "[�v����]";
				mes "�������̃X�L����Lv�����Ȃ������́A";
				mes "�J�[�g�������Ă���ƈړ����x��";
				mes "�������Ă��܂��񂾁B";
				mes "�v�b�V���J�[�g�X�L�������߂邱�ƂŁA";
				mes "�J�[�g�������Ă��Ă��ړ����x��";
				mes "���i�̏�Ԃɖ߂����Ƃ��ł���B";
				next;
				mes "[�v����]";
				mes "^FF0000�I�X�J��^000000�͎�ɓ��ꂽ�A�C�e����";
				mes "�����̍D���Ȓl�i�Ŕ��邱�Ƃ�";
				mes "�ł���X�L���B";
				mes "��ʂ̃A�C�e���������ɔ�������A";
				mes "�������ł���`���҂��C����";
				mes "�҂Ƃ��Ȃǂɏd�󂷂�ˁB";
				next;
				mes "[�v����]";
				mes "�܂�^0000FF�}�[�`�����g^000000��^FF0000���}�[�i�C�g^000000��";
				mes "^FF0000�J�[�g���{ �����[�V����^000000�Ƃ�����";
				mes "���͂ȃX�L�����o���邱�Ƃ��ł���B";
				next;
				cutin "merchant_mammonite",2;
				mes "[�v����]";
				mes "^FF0000���}�[�i�C�g^000000��Zeny������āA";
				mes "�傫�ȃ_���[�W��^���邱�Ƃ��ł���B";
				mes "�}�[�`�����g�ɂƂ��đ厖�ȃX�L���B";
				mes "Zeny������邩��A�퓬���Ƃ�";
				mes "�������Ȃ��Ȃ��Ă������ǁA�G��";
				mes "��C�ɓ|���Ƃ��Ɋ��􂷂�X�L�����B";
				next;
				cutin "merchant_cartrevol",2;
				mes "[�v����]";
				mes "^FF0000�J�[�g���{ �����[�V����^000000�̓J�[�g��";
				mes "���p���čU������͈͍U���X�L���B";
				mes "�J�[�g�̏d�ʂ����߂�قǁA";
				mes "�U���͂������Ă����}�[�`�����g��";
				mes "�퓬���x����X�L���ɂȂ��B";
				next;
				mes "[�v����]";
				mes "^FF0000�J�[�g���{ �����[�V����^000000��";
				mes "�N�G�X�g�Ŏ擾���邱�Ƃ��ł���";
				mes "�X�L�����B";
				next;
				cutin "merchant_cartrevol",255;
				break;
			case 7:
				cutin "taekwonkid_2",2;
				mes "[�v����]";
				mes "�e�R���L�b�h���ˁB";
				mes "1���E�ł���e�R���L�b�h��";
				mes "JobLv��50�܂ŏグ�邱�Ƃ��ł����B";
				mes "�X�L���|�C���g��49�|�C���g�g�p�ł���";
				mes "���ƂɂȂ�ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�e�R���L�b�h^000000�̃X�L���ŃI�X�X���Ȃ̂�";
				mes "^FF0000�^�C���M^000000��^FF0000�e�B�I�A�v�`���M^000000���ˁB";
				next;
				cutin "taekwon_sprint",2;
				mes "[�v����]";
				mes "^FF0000�^�C���M^000000�͑f�����܂���������X�L���B";
				mes "���̃X�L����Lv7�ȏ�ɂȂ�ƁA";
				mes "�g�p��ɒ����~�܂�΁A";
				mes "��莞��Str���㏸����";
				mes "�X�p�[�g��ԂƂȂ�B";
				mes "���̃X�L���̓e�R���L�b�h�̊�{ ���ˁB";
				next;
				cutin "taekwon_flyingkick",2;
				mes "[�v����]";
				mes "^FF0000�e�B�I�A�v�`���M^000000�͉������̓G��";
				mes "��C�ɐڋ߂��čU�����s��";
				mes "�ƂяR��X�L�����B";
				mes "�A�����čU�����s�����ƂŁA";
				mes "��_���[�W�ɂ��邱�Ƃ��ł���ˁB";
				next;
				mes "[�v����]";
				mes "���ƁA�G�𓦂����ƂȂ��߂炦��";
				mes "�A�v�`���I�����M���Y��Ă�";
				mes "�Ȃ�Ȃ����낤�ˁB";
				mes "�P�̂̓G����Ȃ����";
				mes "�D�G�ȗ͂𔭊��ł���͂����B";
				next;
				cutin "taekwon_flyingkick",255;
				break;
			default:
				mes "[�v����]";
				mes "����1���E�ɂ��Ă��ˁB";
				mes "�X�L���ɂ��ĕ��������E�Ƃ�";
				mes "�����ȁH";
				next;
				switch(select("^0000FF�K���X�����K�[^000000","^0000FF�E��^000000","^0000FF�X�[�p�[�m�[�r�X^000000","���̐E�Ƃɂ��ĕ���")){
				case 1:
					cutin "gunslinger",2;
					mes "[�v����]";
					mes "^0000FF�K���X�����K�[^000000���ˁB";
					mes "����1���E�ł���^0000FF�K���X�����K�[^000000��";
					mes "JobLv��70�܂ŏグ�邱�Ƃ��ł����B";
					mes "�X�L���|�C���g��69�|�C���g�g�p�ł���";
					mes "���ƂɂȂ�ˁB";
					next;
					mes "[�v����]";
					mes "^0000FF�K���X�����K�[^000000��5��ނ̏e�̂���";
					mes "�ǂ����͂ɐ���Ă������ŁA";
					mes "�K�����邷��X�L����T�d��";
					mes "�I�����Ă����K�v������B";
					next;
					mes "[�v����]";
					mes "�u�K�ł͊�{ �ƂȂ�^FF0000�n���h�K��^000000��";
					mes "�ꔭ�̈З͂�����^FF0000�V���b�g�K��^000000��";
					mes "�X�L���ɂ��Đ������悤�B";
					next;
					cutin "gunslinger_despera.bmp",2;
					mes "[�v����]";
					mes "^0000FF�n���h�K��^000000�ŕK�v�ƂȂ�̂�";
					mes "^FF0000�f�X�y���[�h^000000���ˁB";
					mes "�����̎��͂ɒe�ۂ𗐎˂���";
					mes "�X�L�����B";
					next;
					mes "[�v����]";
					mes "^0000FF�n���h�K��^000000����͂ƑI�񂾏ꍇ��";
					mes "�����͂��グ�邱�Ƃ��ł���";
					mes "^FF0000�V���O���A�N�V����^000000��";
					mes "^FF0000�X�l�[�N�A�C^000000���d�v�ɂȂ��B";
					next;
					cutin "gunslinger_fullbus",2;
					mes "[�v����]";
					mes "^0000FF�V���b�g�K��^000000�̖��͂͂���ς�";
					mes "^FF0000�t���o�X�^�[^000000�ɂȂ�ˁB";
					mes "�e�ۂ��ꋓ�ɔ��˂��ċ����";
					mes "�_���[�W��^���邱�Ƃ��ł���񂾁B";
					mes "�����ASP�̏��Ղ��������̂ŁA";
					mes "�񕜌n�̑΍􂪕K�v�ɂȂ邩�ȁB";
					next;
					cutin "gunslinger_fullbus",255;
					break;
				case 2:
					cutin "ninja",2;
					mes "[�v����]";
					mes "^0000FF�E��^000000���ˁB";
					mes "����1���E�ł���^0000FF�E��^000000��";
					mes "JobLv��70�܂ŏグ�邱�Ƃ��ł����B";
					mes "�X�L���|�C���g��69�|�C���g�g�p�ł���";
					mes "���ƂɂȂ�ˁB";
					next;
					mes "[�v����]";
					mes "^0000FF�E��^000000�̃X�L���͑傫���A^FF0000�����n^000000�A";
					mes "^FF0000�̏p�n^000000��^FF0000�E�p�n^000000��3��ނ����݂��A";
					mes "�����̎d���ɂ���Ăǂ̃X�L����";
					mes "��邩���ς���Ă���B";
					next;
					cutin "ninja_throwshurike",2;
					mes "[�v����]";
					mes "^0000FF�����n^000000��I�����Ă����ꍇ��";
					mes "^FF0000�藠������^000000�̃X�L�������";
					mes "�U����i�ƂȂ邾�낤�B";
					next;
					mes "[�v����]";
					mes "^0000FF�̏p�n^000000��I�����Ă����ꍇ��^FF0000���^000000�A";
					mes "^FF0000�e���g^000000�Ƃ����L�p�ȉ���X�L����";
					mes "�g�p�ł���悤�ɂȂ�B";
					mes "�̏p�n�ɂ͈�M�Ƃ������͂ȍU��";
					mes "�X�L�������邪�A��_�������B";
					mes "�ɂ߂�ɂ͔E�ς��K�v���낤�B";
					next;
					cutin "ninja_dragonfirefo",2;
					mes "[�v����]";
					mes "^0000FF�E�p^000000��I�����Ă����ꍇ��";
					mes "^FF0000�X�M���A�����w^000000�������₷���B";
					mes "^0000FF�X�M��^000000�͒n�ʂ���X�̑���";
					mes "�o�������āA�G���U������";
					mes "�������̍U���X�L�����B";
					next;
					mes "[�v����]";
					mes "^0000FF�����w^000000�͖ڕW���w�肵�čU������";
					mes "�͈͍U�����B";
					mes "�搧�U����������̂ł���΁A";
					mes "���Ɏg�����肪�悢�E�p�Ƃ�����B";
					next;
					cutin "ninja_dragonfirefo",255;
					break;
				case 3:
					cutin "super_novice",2;
					mes "[�v����]";
					mes "^0000FF�X�[�p�[�m�[�r�X^000000���ˁB";
					mes "����1���E�ł���^0000FF�X�[�p�[�m�[�r�X^000000��";
					mes "JobLv��99�܂ŏグ�邱�Ƃ��ł����B";
					mes "�X�L���|�C���g��98�|�C���g�g�p�ł���";
					mes "���ƂɂȂ�ˁB";
					next;
					mes "[�v����]";
					mes "^0000FF�X�[�p�[�m�[�r�X^000000�͑���1���E��";
					mes "�X�L�����o���Ă�����E�Ƃ���B";
					mes "^0000FF�q�[��^000000�A^0000FF�o�b�V��^000000�A^0000FF���}�[�i�C�g^000000�Ȃǂ�";
					mes "�g���`���҂͑����݂������ˁB";
					next;
					cutin "supernovice_firebo",2;
					mes "[�v����]";
					mes "�܂��A���@����̂ɐ키";
					mes "�X�[�p�[�m�[�r�X��ڎw���Ȃ�A";
					mes "^0000FF�t�@�C�A�[�E�H�[��^000000��A";
					mes "^0000FF�t�@�C�A�[�{ ���g^000000�Ȃǂ�";
					mes "�g�p���Ă����ق��������ˁB";
					next;
					cutin "supernovice_heal",2;
					mes "[�v����]";
					mes "^0000FF�q�[��^000000�̓X�[�p�[�m�[�r�X�ł�";
					mes "�g����񕜖��@���B";
					mes "���@�ȊO�Ő키�ꍇ�̓o�b�V���A";
					mes "���}�[�i�C�g�̂ǂ��炩��";
					mes "�I�����邱�ƂɂȂ邾�낤�ˁB";
					next;
					mes "[�v����]";
					mes "�܂��A�X�[�p�[�m�[�r�X��";
					mes "���ɑ����̃p�b�V�u�X�L����";
					mes "�K�����邱�Ƃ��ł���";
					mes "�E�Ƃł�����ˁB";
					next;
					cutin "supernovice_heal",255;
					break;
				default:
					continue;
				}
			}
			mes "[�v����]";
			mes "���̐E�Ƃ̃X�L���ɂ��ĕ��������H";
			next;
			if(select("���̐E�Ƃ̃X�L���ɂ��ĕ���","�X�L���ɂ��Ă͂킩����")==2) break;
		}
		return;
	}

	function	ABOUT_STATUS	{
		while(1){
			mes "[�v����]";
			mes "���̃X�e�[�^�X�̐�����";
			mes "���������̂��ȁH";
			next;
			switch(select("�X�e�[�^�X���̏��ɂ��ĕ���","^0000FF�\�[�h�}��^000000","^0000FF�}�W�V����^000000","^0000FF�A�R���C�g^000000","^0000FF�V�[�t^000000","^0000FF�A�[�`���[^000000","^0000FF�}�[�`�����g^000000","^0000FF�e�R���L�b�h^000000","^0000FF����1���E^000000","�X�e�[�^�X�ɂ��Ă͂킩����")){
			case 1:
				mes "[�v����]";
				mes "^0000FF�X�e�[�^�X^000000�ɂ��Ă��ˁB";
				mes "�܂��͉�ʍ���̊�{ ��񂩂�";
				mes "�X�e�[�^�X�iStatus�j�E�B���h�E��";
				mes "�\�����Ă݂悤�B";
				mes " ";
				mes "�]�V���[�g�J�b�g�́uAlt+A�v�]";
				next;
				mes "[�v����]";
				mes "^0000FF�X�e�[�^�X^000000��";
				mes "�́iStr�j�A�����iAgi�j";
				mes "�̗́iVit�j�A�m�́iInt�j";
				mes "�Z�iDex�j�A�^�iLuk�j";
				mes "���琬�藧���Ă���񂾁B";
				next;
				mes "[�v����]";
				mes "^FF0000Str^000000�͒��ړI�͍U���͂�Atk��";
				mes "�A�C�e�������Ă�ő�d�ʂ�";
				mes "�֌W���Ă���񂾁B";
				mes "�������A�|��e���g���E�Ƃ�";
				mes "�ꍇDex�̒l���U���͂ɂȂ��B";
				next;
				mes "[�v����]";
				mes "^FF0000Agi^000000�͍U�����������Flee��";
				mes "�U���̃X�s�[�hAspd��";
				mes "�֌W���Ă����B";
				next;
				mes "[�v����]";
				mes "^FF0000Vit^000000�͍ő�HP��";
				mes "��莞�Ԃ��Ƃ�HP�̉񕜗ʁA";
				mes "�󂯂��_���[�W�̌y����";
				mes "�֌W���Ă����B";
				next;
				mes "[�v����]";
				mes "^FF0000Int^000000�͍ő�SP��SP�񕜗ʁA";
				mes "Matk,Mdef�Ɋ֌W���Ă���ˁB";
				mes "Matk�͖��@�U����";
				mes "Mdef�͖��@�h��͂ɂȂ��B";
				mes "�X�L���𑽗p������A���@����g����";
				mes "�ꍇ�͏d�v�ɂȂ邩�ȁB";
				next;
				mes "[�v����]";
				mes "^FF0000Dex^000000�͖�������Hit��Aspd��";
				mes "�傫���e����^�����B";
				mes "�U���͂ɂ������̉e����^����ˁB";
				mes "�U���͂Ɋւ��Ă͍ŏ��_���[�W��";
				mes "��グ���ł����B";
				next;
				mes "[�v����]";
				mes "�܂��A^FF0000�|��e�Ƃ���������ł�";
				mes "Dex�ɂ���āA�U���͂����߂�񂾁B^000000";
				mes "�|�Əe��Str�ł͍U���͂�";
				mes "�ω����Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "^FF0000Luk^000000�̓N���e�B�J������Critical��";
				mes "��𗦂�Flee�A";
				mes "�U���͂ɑ����̉e��������ˁB";
				next;
				mes "[�v����]";
				mes "�e�X�e�[�^�X��BaseLv��";
				mes "�オ�����Ƃ��ɂ��炦��";
				mes "^0000FFStatusPoint^000000�������";
				mes "�グ�Ă������Ƃ��ł���񂾁B";
				mes "^FF0000�����̐E�Ƃ␬��������������";
				mes "���΂��Ă������Ƃ��d�v����B";
				next;
				break;
			case 2:
				cutin "swordman_2",2;
				mes "[�v����]";
				mes "���ꂶ�Ⴀ�A^0000FF�\�[�h�}��^000000��";
				mes "��\�I�ȃX�e�[�^�X�ɂ���";
				mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
				mes "��x����U��ƁA���߂�����";
				mes "�ł��Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "����ɁA���̐��E�ɂ͂܂��܂�";
				mes "�l���m��Ȃ����I�Ȑl������";
				mes "��R����񂾁B";
				mes "�����̏�������������C���[�W����";
				mes "�X�e�[�^�X�|�C���g���g�����ˁB";
				next;
				mes "[�v����]";
				mes "�\�[�h�}���͍����U���͂�";
				mes "���������߁A^FF0000Str^000000�����߂�̂�";
				mes "�I�X�X������B";
				mes "�܂��A^FF0000HP^000000�������̂�^FF0000Vit^000000�����߂�";
				mes "�ς��鎖�ɓ�������΁A�p�[�e�B��";
				mes "�O�q�A���Ƃ��đ劈��ł����B";
				next;
				mes "[�v����]";
				mes "�p�[�e�B����l���D�ނȂ�A";
				mes "^FF0000Vit^000000���^FF0000Agi^000000�����߂�̂������ˁB";
				mes "�G�̍U���������̂ɓ������A";
				mes "�����U�����x�œG�������ɓ|����B";
				next;
				mes "[�v����]";
				mes "�܂��A�X�L���𑽗p����ɂ�^FF0000Int^000000�A";
				mes "�U���𖽒������邽�߂ɂ�";
				mes "^FF0000Dex^000000���K�v����B";
				mes "�\�[�h�}���͐F��ȃX�e�[�^�X��";
				mes "����U�邽�߁A�o�����X�ɂ�";
				mes "���ӂ��ĂˁB";
				next;
				cutin "swordman_2",255;
				break;
			case 3:
				cutin "magician_2",2;
				mes "[�v����]";
				mes "���ꂶ�Ⴀ�A^0000FF�}�W�V����^000000��";
				mes "��\�I�ȃX�e�[�^�X�ɂ���";
				mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
				mes "��x����U��ƁA���߂�����";
				mes "�ł��Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "����ɁA���̐��E�ɂ͂܂��܂�";
				mes "�l���m��Ȃ����I�Ȑl������";
				mes "��R����񂾁B";
				mes "�����̏�������������C���[�W����";
				mes "�X�e�[�^�X�|�C���g���g�����ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�}�W�V����^000000�͖��@�U�����厲�Ƃ���";
				mes "�키���߁A^FF0000Int^000000�����߂�̂������ˁB";
				mes "�܂��A�r�����x�𑬂߂邽�߂�";
				mes "^FF0000Dex^000000�����߂�̂��L������B";
				next;
				mes "[�v����]";
				mes "�܂��A^0000FF�}�W�V����^000000�͑ł���ア����A";
				mes "^FF0000Vit^000000�ɏ����U����^FF0000HP^000000��";
				mes "���߂�̂������ˁA";
				mes "�������A���̕��U���ɒ�������";
				mes "^FF0000Int^000000��^FF0000Dex^000000�ɃX�e�[�^�X�|�C���g��";
				mes "�U��Ȃ��Ȃ�̂�Y��Ȃ��łˁB";
				next;
				cutin "magician_2",255;
				break;
			case 4:
				cutin "acolyte_2",2;
				mes "[�v����]";
				mes "���ꂶ�Ⴀ�A^0000FF�A�R���C�g^000000��";
				mes "��\�I�ȃX�e�[�^�X�ɂ���";
				mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
				mes "��x����U��ƁA���߂�����";
				mes "�ł��Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "����ɁA���̐��E�ɂ͂܂��܂�";
				mes "�l���m��Ȃ����I�Ȑl������";
				mes "��R����񂾁B";
				mes "�����̏�������������C���[�W����";
				mes "�X�e�[�^�X�|�C���g���g�����ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�A�R���C�g^000000�͂�͂蒇�Ԃ��x������";
				mes "�X�L�����g�����Ƃ������ˁB";
				mes "���̂��߁A^FF0000SP^000000�������Ȃ�Ȃ��悤�A";
				mes "^FF0000Int^000000�����߂�̂��I�X�X������B";
				next;
				mes "[�v����]";
				mes "�܂��A�X�L���̉r�����x��";
				mes "���߂邽�߂�^FF0000Dex^000000�����߂�̂�������B";
				mes "�O�q�̑���Ƃ��ė��悵�đO�ɏo�āA";
				mes "�p�[�e�B�̏��ƂȂ�Ȃ�";
				mes "^FF0000Vit^000000���L�����ˁB";
				next;
				cutin "acolyte_2",255;
				break;
			case 5:
				cutin "thief_2",2;
				mes "[�v����]";
				mes "���ꂶ�Ⴀ�A^0000FF�V�[�t^000000��";
				mes "��\�I�ȃX�e�[�^�X�ɂ���";
				mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
				mes "��x����U��ƁA���߂�����";
				mes "�ł��Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "����ɁA���̐��E�ɂ͂܂��܂�";
				mes "�l���m��Ȃ����I�Ȑl������";
				mes "��R����񂾁B";
				mes "�����̏�������������C���[�W����";
				mes "�X�e�[�^�X�|�C���g���g�����ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�V�[�t^000000�Ƃ����΁A�������\�͂�";
				mes "����ɋ������Ă������߁A";
				mes "^FF0000Agi^000000�����߂�̂��I�X�X������B";
				next;
				mes "[�v����]";
				mes "^FF0000Agi^000000�����߂�Ύ��R��";
				mes "�U�����x���オ�邩��A";
				mes "^FF0000Str^000000�ōU���͂����߁A";
				mes "^FF0000Dex^000000�ōU���𖽒�������悤��";
				mes "���Ă����ƃT�N�T�N�G��";
				mes "�|����悤�ɂȂ��B";
				next;
				mes "[�v����]";
				mes "���ƁA�����J�^�[���Ƃ������킪";
				mes "�����ł���A�T�V����ڎw���Ȃ�A";
				mes "^FF0000Luk^000000�����߂ăN���e�B�J���U����";
				mes "�p�ɂɏo����悤�ɂ���̂�";
				mes "������������Ȃ��ˁB";
				next;
				cutin "thief_2",255;
				break;
			case 6:
				cutin "archer_2",2;
				mes "[�v����]";
				mes "���ꂶ�Ⴀ�A^0000FF�A�[�`���[^000000��";
				mes "��\�I�ȃX�e�[�^�X�ɂ���";
				mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
				mes "��x����U��ƁA���߂�����";
				mes "�ł��Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "����ɁA���̐��E�ɂ͂܂��܂�";
				mes "�l���m��Ȃ����I�Ȑl������";
				mes "��R����񂾁B";
				mes "�����̏�������������C���[�W����";
				mes "�X�e�[�^�X�|�C���g���g�����ˁB";
				next;
				mes "[�v����]";
				mes "�A�[�`���[�̓����A�|�ł̍U����";
				mes "^FF0000Dex^000000��������قǋ��͂ɂȂ��B";
				mes "�U���͂�������x���܂�����";
				mes "��������A^FF0000Agi^000000�ōU�����x��";
				mes "���߂�̂������ˁB";
				next;
				mes "[�v����]";
				mes "�܂��A^FF0000Int^000000�����߂邱�ƂŁA";
				mes "���͂ȃX�L��";
				mes "�u�_�u���X�g���C�t�B���O�v��";
				mes "���X�ƘA�˂���̂��L������B";
				next;
				mes "[�v����]";
				mes "���������A�A�[�`���[�̏�ʐE�ł���";
				mes "�o�[�h��_���T�[�ɂȂ���";
				mes "�ΐl��Ŋ��􂷂�C������Ȃ�A";
				mes "^FF0000Vit^000000�����߂Ă����̂������ˁB";
				next;
				cutin "archer_2",255;
				break;
			case 7:
				cutin "merchant_2",2;
				mes "[�v����]";
				mes "���ꂶ�Ⴀ�A^0000FF�}�[�`�����g^000000��";
				mes "��\�I�ȃX�e�[�^�X�ɂ���";
				mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
				mes "��x����U��ƁA���߂�����";
				mes "�ł��Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "����ɁA���̐��E�ɂ͂܂��܂�";
				mes "�l���m��Ȃ����I�Ȑl������";
				mes "��R����񂾁B";
				mes "�����̏�������������C���[�W����";
				mes "�X�e�[�^�X�|�C���g���g�����ˁB";
				next;
				mes "[�v����]";
				mes "�}�[�`�����g��^FF0000Str^000000�ōU���͂����߁A";
				mes "^FF0000Agi^000000�œG�̍U�����������A";
				mes "^FF0000Vit^000000�œG�̍U����ς���̂��L������B";
				mes "�܂��A�U���𖽒������邽�߂ɂ�";
				mes "^FF0000Dex^000000��������x�K�v�ɂȂ��Ă���ˁB";
				next;
				mes "[�v����]";
				mes "�����A^0000FF�}�[�`�����g^000000�̏�ʐE�ł���";
				mes "^0000FF�u���b�N�X�~�X^000000�ɂȂ��Đ�����";
				mes "���Ă����Ȃ�A^FF0000Dex^000000��^FF0000Luk^000000���d�v��";
				mes "�Ȃ��Ă����B";
				next;
				mes "[�v����]";
				mes "�ł��A^FF0000Dex^000000��^FF0000Luk^000000�ɃX�e�[�^�X�|�C���g��";
				mes "�g��������ƁA�U���Ɍq����";
				mes "�X�e�[�^�X���Ⴍ�Ȃ�A�ʏ�̐퓬��";
				mes "���̕��h���Ȃ��Ă��܂���B";
				mes "�o�����X�ɂ͏\�����ӂ��ĂˁB";
				next;
				cutin "merchant_2",255;
				break;
			case 8:
				cutin "taekwonkid_2",2;
				mes "[�v����]";
				mes "���ꂶ�Ⴀ�A^0000FF�e�R���L�b�h^000000��";
				mes "��\�I�ȃX�e�[�^�X�ɂ���";
				mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
				mes "��x����U��ƁA���߂�����";
				mes "�ł��Ȃ����璍�ӂ��ĂˁB";
				next;
				mes "[�v����]";
				mes "����ɁA���̐��E�ɂ͂܂��܂�";
				mes "�l���m��Ȃ����I�Ȑl������";
				mes "��R����񂾁B";
				mes "�����̏�������������C���[�W����";
				mes "�X�e�[�^�X�|�C���g���g�����ˁB";
				next;
				mes "[�v����]";
				mes "^0000FF�e�R���L�b�h^000000��^FF0000Str^000000�ōU���͂����߂�A";
				mes "^FF0000Agi^000000�ōU�����x�����߂�̂��L������B";
				mes "�܂��A�U���𖽒�������ɂ�";
				mes "^FF0000Dex^000000��������x�K�v�ɂȂ��Ă���ˁB";
				next;
				mes "[�v����]";
				mes "�����A��C�����āB";
				mes "^0000FF�e�R���L�b�h^000000�̏�ʐE�ł���";
				mes "^0000FF�\�E�������J�[^000000�ɂȂ�ƁA";
				mes "^0000FF�e�R���L�b�h^000000�̎��̏펯��";
				mes "�ʗp���Ȃ��Ȃ��Ă��܂��񂾁B";
				next;
				mes "[�v����]";
				mes "^0000FF�\�E�������J�[^000000�ɂȂ�ꍇ��";
				mes "�g�p����X�L�������@�A";
				mes "�x���X�L�������S�ƂȂ��Ă������߁A";
				mes "^0000FF�e�R���L�b�h^000000�̍�����^FF0000Int^000000�ɐU����";
				mes "�����Ȃ��ƁA^FF0000SP^000000������Ȃ��Ƃ�������";
				mes "���邩������Ȃ����璍�ӂ��ĂˁB";
				next;
				cutin "taekwonkid_2",255;
				break;
			default:
				mes "[�v����]";
				mes "^0000FF����1���E^000000�ɂ��Ă��ˁB";
				mes "�X�e�[�^�X�ɂ���";
				mes "���������E�Ƃ͉����ȁH";
				next;
				switch(select("^0000FF�K���X�����K�[^000000","^0000FF�E��^000000","^0000FF�X�[�p�[�m�[�r�X^000000","���̐E��")){
				case 1:
					cutin "gunslinger",2;
					mes "[�v����]";
					mes "���ꂶ�Ⴀ�A^0000FF�K���X�����K�[^000000��";
					mes "��\�I�ȃX�e�[�^�X�ɂ���";
					mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
					mes "��x����U��ƁA���߂�����";
					mes "�ł��Ȃ����璍�ӂ��ĂˁB";
					next;
					mes "[�v����]";
					mes "����ɁA���̐��E�ɂ͂܂��܂�";
					mes "�l���m��Ȃ����I�Ȑl������";
					mes "��R����񂾁B";
					mes "�����̏�������������C���[�W����";
					mes "�X�e�[�^�X�|�C���g���g�����ˁB";
					next;
					mes "[�v����]";
					mes "^0000FF�K���X�����K�[^000000�̓����A�e�ł̍U����";
					mes "^FF0000Dex^000000��������قǋ��͂ɂȂ��B";
					mes "�U���͂�������x���܂�����";
					mes "��������A^FF0000Agi^000000�ōU�����x��";
					mes "���߂�̂������ˁB";
					next;
					mes "[�v����]";
					mes "�܂��A^FF0000HP^000000�A^FF0000SP^000000���ɏ��Ȃ��̂ŁA";
					mes "^FF0000Vit^000000��^FF0000Int^000000��������x���߂Ă���";
					mes "�̂�������B";
					next;
					mes "[�v����]";
					mes "^0000FF�K���X�����K�[^000000�͏e�̎�ނ��F�X����A";
					mes "�ǂ����͂Ƃ��Ďg���Ă������ŁA";
					mes "�퓬�X�^�C�����ω����Ă���񂾁B";
					mes "�}���ŃX�e�[�^�X�|�C���g���g�킸�A";
					mes "�܂��͐F��ȏe���g���Ă݂�Ƃ�����B";
					next;
					cutin "gunslinger",255;
					break;
				case 2:
					cutin "ninja",2;
					mes "[�v����]";
					mes "���ꂶ�Ⴀ�A^0000FF�E��^000000��";
					mes "��\�I�ȃX�e�[�^�X�ɂ���";
					mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
					mes "��x����U��ƁA���߂�����";
					mes "�ł��Ȃ����璍�ӂ��ĂˁB";
					next;
					mes "[�v����]";
					mes "����ɁA���̐��E�ɂ͂܂��܂�";
					mes "�l���m��Ȃ����I�Ȑl������";
					mes "��R����񂾁B";
					mes "�����̏�������������C���[�W����";
					mes "�X�e�[�^�X�|�C���g���g�����ˁB";
					next;
					mes "[�v����]";
					mes "^0000FF�E��^000000�͂ǂ�ȃX�L���̌n����";
					mes "����Ă����������߂邱�Ƃ��d�v����B";
					mes "��������߂���قڃX�e�[�^�X��";
					mes "�ǂ��U��̂������������Ă���B";
					next;
					mes "[�v����]";
					mes "�����n�E�̏p�n�X�L���Ȃ�A";
					mes "�U���͂��d������";
					mes "^FF0000Str^000000�A^FF0000Dex^000000�A^FF0000Agi^000000���L������B";
					mes "�E�p�n�X�L���Ȃ疂�@�U���͂�";
					mes "�r�����x���d������^FF0000Int^000000�A^FF0000Dex^000000��";
					mes "�L���Ȃ񂾁B";
					next;
					mes "[�v����]";
					mes "�������A�ǂ��炩�̃X�^�C����";
					mes "�I�񂾂�X�e�[�^�X�|�C���g��";
					mes "�g���Ă���ȏ�A";
					mes "�������Ċ���U���Ă������Ƃ�";
					mes "�������A���ӂ��ĂˁB";
					next;
					cutin "ninja",255;
					break;
				case 3:
					cutin "super_novice",2;
					mes "[�v����]";
					mes "���ꂶ�Ⴀ�A^0000FF�X�[�p�[�m�[�r�X^000000��";
					mes "��\�I�ȃX�e�[�^�X�ɂ���";
					mes "�����邯�ǁA�X�e�[�^�X�|�C���g��";
					mes "��x����U��ƁA���߂�����";
					mes "�ł��Ȃ����璍�ӂ��ĂˁB";
					next;
					mes "[�v����]";
					mes "����ɁA���̐��E�ɂ͂܂��܂�";
					mes "�l���m��Ȃ����I�Ȑl������";
					mes "��R����񂾁B";
					mes "�����̏�������������C���[�W����";
					mes "�X�e�[�^�X�|�C���g���g�����ˁB";
					next;
					mes "[�v����]";
					mes "^0000FF�X�[�p�[�m�[�r�X^000000��";
					mes "�ǂ��������X�L��������Ă������B";
					mes "��������߂���قڃX�e�[�^�X��";
					mes "�ǂ��U��̂������������Ă����B";
					next;
					mes "[�v����]";
					mes "�ߐڍU���n�Ȃ�A�U���͂�";
					mes "�d������^FF0000Str^000000�A^FF0000Dex^000000�A^FF0000Agi^000000���L������B";
					mes "���@�n�X�L���Ȃ疂�@�U���͂�";
					mes "�r�����x���d������^FF0000Int^000000�A^FF0000Dex^000000��";
					mes "�L�����ˁB";
					next;
					cutin "super_novice",255;
					break;
				default:
					continue;
				}
			}
			cutin "swordman_2.bmp", 255;
			mes "[�v����]";
			mes "���̐E�Ƃ̃X�e�[�^�X�ɂ���";
			mes "���������H";
			next;
			if(select("���̐E�Ƃ̃X�e�[�^�X�ɂ��ĕ���","�X�e�[�^�X���Ă͂킩����")==2) break;
		}
		return;
	}

	function	ABOUT_WEAPON	{
		while(1){
			mes "[�v����]";
			mes "�e�E�Ƃɂ͂��ꂼ�����������A";
			mes "�E�Ƃɂ���Ĉ����镐�킪";
			mes "�قȂ�񂾁B";
			cutin "weapon_list.bmp", 3;
			next;
			mes "[�v����]";
			mes "����̎�ނ͒Z���A�Ў茕�A���茕�A";
			mes "���A���A�݊�A��A�|�A�܁A�y��A";
			mes "�ځA�{�A�J�^�[���A�e�A�藠���ȂǁA";
			mes "�����̎�ނ������B";
			next;
			mes "[�v����]";
			mes "����ɂ��Ă�";
			mes "�킩�������ȁH";
			next;
			if(select("�킩����","�킩��Ȃ�")==1) break;
			mes "[�v����]";
			mes "���Ⴀ�A������x��������ˁB";
			next;
		}
		cutin "swordman_2.bmp", 255;
		return;
	}
}

//�A���f�B
ac_cl_room.gat,57,46,2	script	�A���f�B#ac_room	751,{
	function HOWTO_BATTLE;
	function HOWTO_MAKEMONEY;
	function ABOUT_CARD;
	function ABOUT_WORLDMAP;

	if(AC_PASSPORT<2){
		mes "[�A���f�B]";
		mes "���A�L�~�͐V�炾�ȁB";
		mes "�`���҃A�J�f�~�[�ւ悤�����I";
		mes "�܂��͎�t���ς܂��Ă���B";
		close;
	}
	set '@novice, callfunc("AC_GetNovice");
	if(AC_NOVICE_QUE >= 20 || Job!=Job_Novice){
		if(Job!=Job_Novice){
			if(AC_NOVICE_QUE) {
				mes "[�A���f�B]";
				mes "���C�����ŉ���肾�B";
				mes "�����������Ƃ���������A";
				mes "�Ȃ�ł������Ă���Ă������B";
				mes "���𕷂������񂾁H";
			} else {
				mes "[�A���f�B]";
				mes "�������Ȃ��炾���A";
				mes "�L�~�͂Ȃ��Ȃ��؂�����";
				mes "�`���҂̂悤���ȁB";
				mes "���������Ă݂������Ƃ͂��邩���H";
			}
		} else if(AC_NOVICE_QUE == 20){
			mes "[�A���f�B]";
			mes "�u�K�����悢��Ōゾ�B";
			mes "�����̉��ɂ���^FF0000�t�F�C^000000��";
			mes "�b�������Č��Ă���B";
			mes "��H";
			mes "�܂��A���ɕ����������Ƃ�";
			mes "����̂��ȁH";
		} else if(AC_NOVICE_QUE >= 30){
			mes "[�A���f�B]";
			mes "�S�Ċw��ł����悤���ȁB";
			mes "�����������Ƃ���������A";
			mes "������x�������邼�B";
			mes "���������������Ƃ͂��邩�H";
		}
		while(1){
			next;
			switch(select("�퓬�ɂ���","�����̉҂����ɂ���","�J�[�h�ɂ���","���E�n�}�ɂ���","�����������Ƃ͂Ȃ�")){
			case 1:
				HOWTO_BATTLE;
				break;
			case 2:
				HOWTO_MAKEMONEY;
				break;
			case 3:
				ABOUT_CARD;
				break;
			case 4:
				ABOUT_WORLDMAP;
				break;
			default:
				mes "[�A���f�B]";
				mes "�������B";
				mes "����ł́A�ǂ��`���҂ɂȂ邱�Ƃ�";
				mes "���҂��Ă��邼�B";
				mes "�����������Ƃ���������A";
				mes "���ł�����Ƃ����B";
				close2;
				cutin "world_map_001.bmp", 255;
				end;
			}
			mes "[�A���f�B]";
			mes "���ɕ����������Ƃ͂��邩�ȁH";
		}
	}

	if(!AC_NOVICE_QUE){
		mes "[�A���f�B]";
		mes "���I";
		mes "�L�~�͐V��̂悤���ȁB";
		mes "���̓A���f�B�B";
		mes "�u�K��S�����Ă���B";
		mes "�܂��̓v�����ɘb�������Ă݂Ă���B";
		close;
	} else if(AC_NOVICE_QUE < 10){
		mes "[�A���f�B]";
		mes "�܂��̓v�����̍u�K��";
		mes "�I��点�Ȃ��ƂȁB";
		mes "���Α��̃v�����ɘb�������āA";
		mes "�v�����̍u�K���I��点��";
		mes "���Ă���B		";
		close;
	} else if(AC_NOVICE_QUE>=10 && AC_NOVICE_QUE<20){
		switch(AC_NOVICE_QUE){
		case 10:
			mes "[�A���f�B]";
			mes "�v�����̘b���I������悤���ȁB";
			mes "���̓A���f�B���B";
			mes "��낵���B";
			mes "�@";
			mes "���āA����̐����ɂ���";
			mes "�ȒP�Ɏ����b�����B";
			next;
			while(1){
				mes "[�A���f�B]";
				mes "�`���҂Ƃ��āA��l�O�ɐ�������ɂ�";
				mes "�l�X�Ȍo�����K�v�����A";
				mes "�K���`���҃A�J�f�~�[�ɂ�";
				mes "�퓬��d������`���N�G�X�g�Ȃǂ�";
				mes "�����Ă���B";
				next;
				mes "[�A���f�B]";
				mes "�u�K��A1���E�ɓ]�E�ł�����A";
				mes "���΂炭�`���҃A�J�f�~�[��";
				mes "�o����ςނƂ������낤�B";
				next;
				mes "[�A���f�B]";
				mes "���ɐ퓬��A�����ɍ������Ƃ��ȂǁA";
				mes "�킩��Ȃ����Ƃ���������A";
				mes "�����������邩������Ȃ��B";
				mes "�킩��Ȃ��Ȃ�����A";
				mes "�܂��߂��Ă���Ƃ����B";
				next;
				if(select("�킩����","�킩��Ȃ�����")==1){
					mes "[�A���f�B]";
					mes "�ł̓L�~�̐��������҂��Ă��邼�B";
					break;
				}
				mes "[�A���f�B]";
				mes "���ꂶ�Ⴀ�A������x�b�����B";
				next;
			}
			next;
			if(checkre()) {
				if (BaseLevel<6) getexp 12,0;
				if (JobLevel<6) getexp 0,24;
			}
			else {
				if (BaseLevel<6) getexp 79,0;
				if (JobLevel<6) getexp 0,117;
			}
			set AC_NOVICE_QUE, 11;
		case 11:
			mes "[�A���f�B]";
			mes "�Ō�ɁA���̑嗤�ɂ���";
			mes "�����b���Ă������B";
			next;
			ABOUT_WORLDMAP;
			if(checkre()) {
				if (BaseLevel<7) getexp 15,0;
				if (JobLevel<7) getexp 0,38;
			}
			else {
				if (BaseLevel<7) getexp 113,0;
				if (JobLevel<7) getexp 0,181;
			}
			set AC_NOVICE_QUE, 12;
		case 12:
			mes "[�A���f�B]";
			mes "�悵�A���̑嗤�ɂ��Ă�";
			mes "�킩�����悤���ȁB";
			mes "���h�Ȗ`���҂ɂȂ邱�Ƃ�";
			mes "���҂��Ă��邼�I";
			next;
			if(checkre()) {
				if (BaseLevel<8) getexp 18,0;
				if (JobLevel<8) getexp 0,46;
			}
			else {
				if (BaseLevel<8) getexp 154,0;
				if (JobLevel<8) getexp 0,221;
			}
			set AC_NOVICE_QUE, 13;
		case 13:
		case 14:
			mes "[�A���f�B]";
			if(AC_NOVICE_QUE==13){
				mes "�������A�����n���Ă������I";
				next;
			} else {
				mes "[�A���f�B]";
				mes "�ו��͌��炵�Ă������ȁH";
				next;
				if(select("���炵�Ă���","���炵�ĂȂ�")==2){
					mes "[�A���f�B]";
					mes "�ו������炵�Ă���Ȃ���";
					mes "�n���Ȃ����B";
					close;
				}
			}
			set AC_NOVICE_QUE, 14;
			if(checkitemblank() < 2){
				mes "^FF0000���x����^000000";
				mes "�]�����A�C�e���̎�ސ���������";
				mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
				mes "�@�ł��܂���]";
				mes "�]�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			} else
			if(Weight>(MaxWeight/100)*90){
				mes "^FF0000���x����^000000";
				mes "�]�����A�C�e���̏d�ʂ�������";
				mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
				mes "�@�ł��܂���]";
				mes "�]�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			}
			getitem 569, 100;
			getitem 611, 5;
			emotion 46,"";
			set AC_NOVICE_QUE, 15;
			mes "[�A���f�B]";
			mes "�`���҂̕K���i�A�Ӓ�A�C�e�����I";
			mes "����^0000FF�g�勾^000000��^0000FF���Ӓ�^000000�̃A�C�e����";
			mes "�Ӓ肷�邱�Ƃ��ł���B";
			mes "���Ӓ�ɂȂ��Ă���A�C�e����";
			mes "��ɓ��ꂽ��g���Ƃ����B";
			mes "����ƁA�񕜃A�C�e�����n���Ă������B";
			next;
		case 15:
			delquest 100116;
			setquest 100120;
			set AC_NOVICE_QUE, 20;
			cutin "world_map_001.bmp", 255;
			mes "[�A���f�B]";
			mes "�����A�Ō��^FF0000�t�F�C^000000�̘b��";
			mes "�����Ă݂Ă���B";
			close;
		}
	}

	function	HOWTO_BATTLE	{
		mes "[�A���f�B]";
		mes "�퓬�̉��ɂ���";
		mes "���������񂾂��H";
		next;
		switch(select("�퓬�̏����ɂ���","�����X�^�[�ɂ���","�p�[�e�B�[�ɂ���","���̂��Ƃ𕷂�")){
		case 1:
			mes "[�A���f�B]";
			mes "�퓬�Ɍ������Ȃ��̂�";
			mes "�����Ɖ񕜃A�C�e�����B";
			mes "�������Ă��鑕���i��";
			mes "�������Ă��Ȃ��A�C�e������������A";
			mes "��x���������Ă݂邱�Ƃ����߂邼�B";
			next;
			mes "[�A���f�B]";
			mes "�����A�C�e����^0000FFAlt�{ Q^000000�L�[���A";
			mes "^0000FF�u��{ ���v^000000�E�B���h�E����";
			mes "^0000FF�uequip�v^000000�{ �^���������āA";
			mes "^0000FF�u�����A�C�e���v^000000�E�B���h�E��";
			mes "�\�����Ċm�F�ł���B";
			next;
			mes "[�A���f�B]";
			mes "�܂��A�����A�C�e����^0000FFAlt�{ E^000000�L�[���A";
			mes "^0000FF�u��{ ���v^000000�E�B���h�E����";
			mes "^0000FF�uitem�v^000000�{ �^���������āA";
			mes "^0000FF�u�����A�C�e���v^000000�E�B���h�E��";
			mes "�\�����Ċm�F�ł���B";
			next;
			mes "[�A���f�B]";
			mes "�A�C�e���𑕔�����ɂ�";
			mes "^0000FF�u�����A�C�e���v^000000�E�B���h�E����";
			mes "^0000FF�uequip�v^000000�^�u���N���b�N���A";
			mes "�����������A�C�e����";
			mes "�_�u���N���b�N���邱�Ƃő����ł���B";
			next;
			mes "[�A���f�B]";
			mes "���ƁA�Y�ꂿ��Ȃ�Ȃ��̂��A";
			mes "^0000FF�uetc�v^000000�^�u�̑����A�C�e�����B";
			next;
			mes "[�A���f�B]";
			mes "�A�[�`���[��A�K���X�����K�[����";
			mes "�E�Ƃł�^0000FF��^000000��^0000FF�e�e^000000�Ƃ�����";
			mes "�������U���p�̃A�C�e�����ꏏ��";
			mes "�������Ȃ��ƍU�����ł��Ȃ�";
			mes "�����A�C�e��������B";
			next;
			mes "[�A���f�B]";
			mes "�����̃A�C�e�����g�p����";
			mes "�����A�C�e����^0000FF�u�����A�C�e��";
			mes "�E�B���h�E�v^000000�։������U���p��";
			mes "�A�C�e���i���e�e�j��";
			mes "�h���b�O�A���h�h���b�v���A";
			mes "�ꏏ�ɑ�������K�v������B";
			next;
			mes "[�A���f�B]";
			mes "�������A�����ł���A�C�e����";
			mes "����΁A�ʏ�̑����A�C�e����";
			mes "�����E�B���h�E�̏�܂�";
			mes "�h���b�O�A���h�h���b�v����΁A";
			mes "�������邱�Ƃ��ł��邼�B";
			next;
			break;
		case 2:
			mes "[�A���f�B]";
			mes "�܂��̓t�B�[���h�ɐ킢�ɍs���O��";
			mes "^0000FF�����X�^�[^000000�ɂ��Ęb�����B";
			mes "^0000FF�����X�^�[^000000�ɂ͂��낢���^0000FF�푰�A";
			mes "�傫���A����^000000�����邼�B";
			next;
			mes "[�A���f�B]";
			mes "�����X�^�[��^FF0000�傫��^000000��";
			mes "^0000FF���^�A���^�A��^^000000�ɕ�����Ă���B";
			mes "^FF0000����^000000��^0000FF�������A�n�����A�������A";
			mes "�������A�Α����A�ő����A�O�����A";
			mes "�s�������A�ő����A������^000000�Ƃ���";
			mes "��ނɕ�����Ă���B";
			next;
			mes "[�A���f�B]";
			mes "�ʏ�̒��ڍU����";
			mes "���̑������Ȃ���΁A";
			mes "�������ł̍U���ƂȂ邼�B";
			next;
			mes "[�A���f�B]";
			mes "^0000FF�n�A���A���A��^000000�̑������m��";
			mes "�֌W���������Ƃ����Ȃ�B";
			mes "�n�͕��ɋ����A";
			mes "���͐��ɋ����A";
			mes "���͉΂ɋ����A";
			mes "�΂͒n�ɋ����B";
			cutin "attribute_main4.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�܂��A��{ �I�ɂ�";
			mes "^0000FF�������A�O����^000000�������āA";
			mes "���������ł͌��ʂ�";
			mes "��܂�X�������邼�B";
			next;
			mes "[�A���f�B]";
			mes "�܂��A^0000FF�ŁA�s���A�ŁA��^000000�ł�";
			mes "�ł͖������ȊO�̑��������キ�A";
			mes "�s���Ɛ��A�łƐ���";
			mes "�݂��ɋ��݂Ǝ�݂������Ă���B";
			cutin "attribute_stdk.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�܂��A^0000FF�O����^000000��^0000FF������^000000�ōU����";
			mes "����Ƃ�������������B";
			mes "�O�Ɉ�Ԍ��ʂ�����͔̂O�Ȃ̂��B";
			mes "�u�O�ɂ͔O���I�v�Ƃ������t��";
			mes "���邾�낤�c�c�B";
			mes "��H�@�Ӗ����Ⴄ���c�c�H";
			cutin "attribute_nonen.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�܂��A�����X�^�[�ɍ��킹�āA";
			mes "�����h��A�X�L���Ȃǂ�";
			mes "�����ɍ��킹�ĕύX����΁A";
			mes "���ʓI�Ȑ퓬���s����͂����B";
			next;
			break;
		case 3:
			mes "[�A���f�B]";
			mes "^0000FF�p�[�e�B�[^000000�ɂ��Ęb�����B";
			mes "��l�Ő키�����吨�ŗ͂�";
			mes "���킹�Đ키�ق���";
			mes "��葽���̓G��|���₷���Ȃ�B";
			next;
			mes "[�A���f�B]";
			mes "�`���ғ��m��^0000FF�p�[�e�B�[^000000��g���";
			mes "�키���Ƃ͐퓬�s�\�ɂȂ郊�X�N��";
			mes "������邱�Ƃɂ��Ȃ邼�I";
			next;
			mes "[�A���f�B]";
			mes "^0000FF�p�[�e�B�[^000000�̓`���b�g���͗���";
			mes "�u^FF0000/organize �p�[�e�B�[�̖��O^000000�v��";
			mes "���͂���΍�邱�Ƃ��ł���B";
			mes "�p�[�e�B�[���͎����̍D���Ȗ��O��";
			mes "���邱�Ƃ��ł��邼�I";
			cutin "tra_pary_command.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "���͌�ɔ������s���ƁA";
			mes "^0000FF�p�[�e�B�[�ݒ�E�B���h�E^000000���o������B";
			mes "�A�C�e���̎��W������";
			mes "�A�C�e�����z�������I���ł���B";
			cutin "tra_pary_item.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�A�C�e���̎��W�����Ɋւ��Ă�";
			mes "�w^0000FF�p�[�e�B�[�S�̂ŋ��L^000000�x��";
			mes "�I�������ق����������낤�B";
			mes "���̐ݒ���s�����ƂŃp�[�e�B�[��";
			mes "�����Ă���l�S�����G�����Ƃ���";
			mes "�A�C�e���������ɏE�����Ƃ��ł���I";
			next;
			mes "[�A���f�B]";
			mes "�A�C�e���̕��z������";
			mes "���m���ŕ��z��I�Ԃ��Ƃ�";
			mes "�E�����l���A�C�e����Ⴄ�̂ł͂Ȃ��A";
			mes "�p�[�e�B�[��g��ł���S����";
			mes "�����ɃA�C�e����Ⴄ���Ƃ�";
			mes "�ł���悤�ɂȂ�B";
			next;
			mes "[�A���f�B]";
			mes "^0000FF�p�[�e�B�[^000000�ݒ�ł͌o���l��";
			mes "���z���������߂邱�Ƃ��ł���B";
			mes "��x�A�C�e���ɂ��Ă̐ݒ��";
			mes "�I������A^FF0000Alt�{ Z^000000�ŕ\�������";
			mes "�p�[�e�B�[�E�B���h�E�ɂ����";
			mes "�p�[�e�B�[�̐ݒ肪�\���B";
			cutin "tra_pary_exp.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�p�[�e�B�[�ݒ��";
			mes "�p�[�e�B�[�E�B���h�E��";
			mes "���̕��ɂ���S�~����";
			mes "�悤�ȃ}�[�N�̍��ɋL�ڂ���Ă���I";
			cutin "tra_pary_window.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�o���l�̕��z�����ݒ�ł�";
			mes "�����ɕ��z�ɂ͒��ӂ��K�v���B";
			mes "^FF0000���x�������}15�͈̔͂ł̂�";
			mes "�����ݒ肪�ł���B^000000";
			mes "���x����������Ă���Ƃ��ɂ�";
			mes "�ł��Ȃ��̂Œ��ӂ��K�v�����I";
			cutin "tra_pary_exp.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�ݒ肪���񂾂�A";
			mes "�쐬�����p�[�e�B�[��";
			mes "�������Ă��炨���I";
			mes "�܂��A����̃L�����N�^�[��";
			mes "�J�[�\���������Ă����A";
			mes "�E�N���b�N�������B";
			next;
			mes "[�A���f�B]";
			mes "����ƁA�I�����j���[��";
			mes "�w^0000FF��������Ƀp�[�e�B�[�����v��^000000�x";
			mes "�ƂłĂ���B";
			mes "�����I�����āA";
			mes "���肪�p�[�e�B�[�̉�����";
			mes "��������΁A�p�[�e�B�[���g�߂�I";
			cutin "tra_pary_exp.bmp", 255;
			next;
			mes "[�A���f�B]";
			mes "�p�[�e�B�[�̉����v�����o���Ă�";
			mes "����̔������Ȃ������ꍇ�́A";
			mes "���łɑ��肪�p�[�e�B�[��";
			mes "�������Ă��Ȃ����A";
			mes "��b�E�B���h�E�Ŋm�F���悤�B";
			next;
			mes "[�A���f�B]";
			mes "���łɃp�[�e�B�[��";
			mes "�������Ă���ꍇ�́A";
			mes "��b�E�B���h�E��";
			mes "�u���̃p�[�e�B�[�ɉ������Ă��܂��B�v";
			mes "�ƃ��b�Z�[�W���\������邼�B";
			next;
			mes "[�A���f�B]";
			mes "�p�[�e�B�[�ɉ������Ă�����A";
			mes "^FF0000Alt�{ Z^000000�ŕ\�������";
			mes "�p�[�e�B�[�E�B���h�E��";
			mes "�m�F���Ă��炤�K�v������I";
			cutin "tra_pary_window.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "���łɃp�[�e�B�[�ɓ����Ă���";
			mes "�ꍇ�̓p�[�e�B�[�E�B���h�E����";
			mes "�\������Ă��閼�O���E�N���b�N����";
			mes "�w^FF0000�E�ނ���^000000�x��I��ł��炨���I";
			cutin "tra_pary_window.bmp", 255;
			next;
			mes "[�A���f�B]";
			mes "��������΁A�L�~�������";
			mes "�V�����p�[�e�B�[��";
			mes "���������邱�Ƃ��ł���I";
			next;
			mes "[�A���f�B]";
			mes "�p�[�e�B�[��^FF0000�ő��12�l^000000�܂�";
			mes "�����ł���B";
			mes "���l���Ń����X�^�[��";
			mes "�����������΁A���낢��ȏꏊ��";
			mes "�s�����Ƃ��ł��邼�I";
			next;
			break;
		}
		return;
	}

	function	HOWTO_MAKEMONEY	{
		mes "[�A���f�B]";
		mes "�����̉҂����̉��ɂ���";
		mes "���������񂾂��H";
		next;
		switch(select("���W�A�C�e���ɂ���","��������ɓ������@�ɂ���","�`���҂ւ̃A�C�e���̔�����ɂ���","���̂��Ƃ𕷂�")){
		case 1:
			mes "[�A���f�B]";
			mes "�����X�^�[�����Ƃ��A�C�e����";
			mes "���Օi�═���h��Ȃǂ̑����i�A";
			mes "���W�i�ȂǁA�l�X�Ȃ��̂����݂���B";
			next;
			mes "[�A���f�B]";
			mes "�����X�^�[�̎��W�i�̒��ɂ�";
			mes "�삯�o���̖`���҂ł��W�߂₷���A";
			mes "�����������̂����邼�B";
			mes "�|������h���b�v�X������W�ł���";
			mes "�w^FF0000�󂫃r��^000000�x���B";
			next;
			mes "[�A���f�B]";
			mes "�����A���́w^FF0000�󂫃r��^000000�x�͓����";
			mes "�����Ă�������������^0000FF�iZeny�j^000000�ɂ�";
			mes "�Ȃ�Ȃ��B";
			mes "^0000FF�����`���҂ɔ��邱�Ƃ�";
			mes "�����̂���^0000FF�iZeny�j^000000����ɓ���邱�Ƃ�";
			mes "�ł��邼�B^000000";
			next;
			break;
		case 2:
			mes "[�A���f�B]";
			mes "����^0000FF�iZeny�j^000000����ɓ������@��";
			mes "������邪�A";
			mes "�����̖`���҂̎�������";
			mes "��ɓ��ꂽ�A�C�e���𔄂邱�Ƃ��B";
			next;
			mes "[�A���f�B]";
			mes "�`���҃A�J�f�~�[���ł�";
			mes "^0000FF�������z�[��^000000�ɕ����h��A";
			mes "���Օi�Ƃ������A�C�e����";
			mes "��������Ă���铹���";
			mes "�l�B������̂ŁA�����Ŏ��";
			mes "���ꂽ�A�C�e���𔄂�Ƃ����B";
			next;
			mes "[�A���f�B]";
			mes "�A�C�e���̓����X�^�[��|�����Ƃ�A";
			mes "�N�G�X�g���s�����Ƃł�";
			mes "��ɓ���邱�Ƃ��ł���B";
			next;
			mes "[�A���f�B]";
			mes "�����A�J�[�h�Ȃǂ̃A�C�e����";
			mes "�퓬���L���ɂȂ�l�X�Ȍ��ʂ�";
			mes "���Ă��āA���ɋM�d��";
			mes "�A�C�e��������A������ł�";
			mes "����Ȃ����������B";
			next;
			mes "[�A���f�B]";
			mes "���������p���Ȃ��J�[�h�ł���΁A";
			mes "^0000FF���̖`���҂ɔ���^000000���Ƃ�";
			mes "�����̂���^0000FF�iZeny�j^000000����ɓ���邱�Ƃ�";
			mes "�ł���͂����B";
			next;
			break;
		case 3:
			while(1){
				mes "[�A���f�B]";
				mes "���ꂶ��A��ɓ��ꂽ�A�C�e����";
				mes "������ɂ��Ęb�����悤�B";
				mes "�`���ғ��m�Ŕ��蔃�������ق���";
				mes "���X�����������邱�Ƃ��������B";
				next;
				mes "[�A���f�B]";
				mes "���W����^FF0000�A�C�e����";
				mes "���̖`���҂ɔ���^000000�ɂ�";
				mes "���2�̎�i������B";
				mes "^0000FF�I�X^000000��^0000FF�`���b�g���[��^000000���B";
				next;
				mes "[�A���f�B]";
				mes "^0000FF�I�X^000000���J���ɂ͂�����xJobLv��";
				mes "�K�v���B�܂��A�I�X���g�p�ł���";
				mes "�E�Ƃ����肳��Ă���B";
				mes "�Ȃ̂ŁA���̌N�ł��ł���";
				mes "�`���b�g���[���ł̎���̎d����";
				mes "�����狳���悤�B";
				next;
				mes "[�A���f�B]";
				mes "^0000FF�`���b�g���[��^000000��^0000FF�I�X^000000�ƈႢ�A";
				mes "�Ŕ��o���Ė`���҂�҂���";
				mes "�ł���@�\���B";
				mes "����𗘗p���đ��̖`���҂�";
				mes "��b�Ŏ�����̌����s����B";
				next;
				mes "[�A���f�B]";
				mes "�܂��́A���������낤�Ƃ��Ă���";
				mes "�A�C�e�����ǂꂮ�炢�̒l�i��";
				mes "�������Ă���̂�";
				mes "�����W������K�v������B";
				next;
				mes "[�A���f�B]";
				mes "�Ȃ��ɁA�����\���Ȃ��Ă����B";
				mes "�����W�Ƃ����Ă������͊ȒP���B";
				mes "^0000FF�I�X^000000���J���Ă���`���҂�";
				mes "���X�ő�̗̂\�z��";
				mes "����΂����񂾁B";
				next;
				mes "[�A���f�B]";
				mes "^0000FF�I�X���̖`����^000000�͂��̂悤��";
				mes "Z�̃}�[�N�̑܂̊Ŕ��o���Ă���B";
				mes "����^FF0000�Ŕ��_�u���N���b�N^000000����ƁA";
				mes "�`���҂������Ă���A�C�e����";
				mes "���邱�Ƃ��ł��邼�B";
				cutin "tra_stall.bmp", 2;
				next;
				mes "[�A���f�B]";
				mes "��������^0000FF�I�X^000000�����ĉ��΁A";
				mes "�����̔��肽���A�C�e����";
				mes "���ꂪ��̂��߂Ă���͂����B";
				cutin "tra_stall_price.bmp", 2;
				next;
				mes "[�A���f�B]";
				mes "�����ǂ����Ă�������Ȃ��A";
				mes "���i���ǂ����Ă��킩��Ȃ��ꍇ�́A";
				mes "������ƗE�C���K�v����";
				mes "�߂��̖`���҂ɕ����Ă݂�̂�";
				mes "������������Ȃ��ȁB";
				next;
				mes "[�A���f�B]";
				mes "�����A���Ղɕ����̂͂��������Ȃ��B";
				mes "�܂��͎����Œ��ׂ�w�͂����Ă���B";
				mes "�l�ɕ����͍̂Ō�̎�i";
				mes "���Ƃ������Ƃ�Y���Ȃ�B";
				next;
				cutin "tra_choom_create.bmp", 2;
				mes "[�A���f�B]";
				mes "���肽���A�C�e���̑��ꂪ";
				mes "��̂킩������";
				mes "�`���b�g���[���̏o�Ԃ��B";
				mes "^FF0000Alt�{ C^000000�������΃`���b�g���[����";
				mes "�쐬���邱�Ƃ��ł���B";
				next;
				mes "[�A���f�B]";
				mes "^FF0000Title���ɔ��肽�����i����";
				mes "�l�i��������OK�{ �^�����������B^000000";
				mes "�Ⴆ�΋󂫃r��10���肽���ꍇ��";
				mes "��������ď������B";
				next;
				mes "[�A���f�B]";
				mes "Title���̓��e��b�����悤�B";
				mes "�w^0000FF����^000000�x�Ƃ͔���܂��Ƃ����Ӗ����B";
				mes "����^0000FF���肽���A�C�e����^000000�A";
				mes "���̂Ƃ�^0000FF�l�i�������Ă����ΐe��^000000���B";
				mes "�w^FF0000z^000000�x��Zeny�A�܂肨���̂��ƁB";
				next;
				mes "[�A���f�B]";
				mes "�Ō�Ɍ�������΁A";
				mes "�킩��₷���Ȃ邼�B";
				mes "�����̖`���҂͔��肽���A�C�e����";
				mes "���������ׂɁw^0000FF��^000000�x������B";
				mes "�w^0000FF��^000000�x�����̑O�ɂ��Ă����΁A";
				mes "�킩��₷���Ȃ邾�낤�B";
				next;
				mes "[�A���f�B]";
				mes "^0000FFLimit^000000�̓`���b�g���[����";
				mes "�����l�����B";
				mes "�������܂߂Ă̐��ɂȂ�ׁA";
				mes "^FF00002^000000���ɂ��Ă����΁A���ǂ����낤�B";
				next;
				mes "[�A���f�B]";
				mes "�`���b�g���[���쐬��";
				mes "�E�B���h�E���o�Ȃ��ꍇ��";
				mes "^0000FF��{ ���E�B���h�E^000000��";
				mes "^000000comm^000000�{ �^���ł��o�����Ƃ��ł��邼�B";
				next;
				cutin "tra_chatroom_enter.bmp", 2;
				mes "[�A���f�B]";
				mes "���΂炭�A�҂��Ă݂Ė`���҂�";
				mes "�����Ă�����A���A�����Ă݂悤�B";
				mes "�܂��͎��������ɂ���";
				mes "�m�F���Č����܂Ƃ߂�Ƃ������B";
				next;
				mes "[�A���f�B]";
				mes "�`���b�g���[�����ł̉�b��";
				mes "����ɂ͕������Ȃ�����A";
				mes "��R�b���Ă����f�ɂ͂Ȃ�Ȃ��B";
				mes "�����܂Ƃ܂�����A";
				mes "�`���b�g���[������悤�B";
				next;
				mes "[�A���f�B]";
				mes "�`���b�g���[���̓E�B���h�E�̉E���";
				mes "�\������Ă���w^0000FF�~^000000�x��";
				mes "���N���b�N���邩�A";
				mes "�w^0000FF/q^000000�x�Ɣ������ĕ��邱�Ƃ��ł���B";
				next;
				mes "[�A���f�B]";
				mes "�E�B���h�E�������A";
				mes "���������s�����B";
				mes "�A�C�e����Zeny����������ɂ�";
				mes "�g���[�h�E�B���h�E���g�p����B";
				cutin "tra_tradewindow.bmp", 2;
				next;
				mes "[�A���f�B]";
				mes "�g���[�h�E�B���h�E�͑����";
				mes "�E�N���b�N�����Ƃ��ɂłĂ���";
				mes "���j���[����A";
				mes "�w^0000FF��������Ɏ������v��^000000�x��";
				mes "�I������B";
				mes "������^FF0000����̖��O^000000���B";
				next;
				mes "[�A���f�B]";
				mes "���肪����������������΁A";
				mes "�g���[�h�E�B���h�E���\�������B";
				mes "^0000FFTrade �F �̉E�ɑ���̖��O��";
				mes "�\������Ă��邱�Ƃ��m�F���悤�B^000000";
				mes "�Ԉ�����l�ɓn���킯�ɂ�";
				mes "�����Ȃ�����ȁB";
				next;
				mes "[�A���f�B]";
				mes "���̃E�B���h�E�ɃA�C�e����";
				mes "�����Ă���΁A�g���[�h�E�B���h�E��";
				mes "����邱�Ƃ��ł���B";
				mes "�A�C�e���E�B���h�E��^FF0000Alt�{ E^000000���B";
				next;
				mes "[�A���f�B]";
				mes "���������e�ɊԈႢ���Ȃ����";
				mes "�w^0000FFOK^000000�x�������B";
				mes "���������肪�w^0000FFOK^000000�x�������΁A";
				mes "�����́w^0000FFTrade^000000�x��������悤�ɂȂ�B";
				mes "�Ō�Ɂw^0000FFTrade^000000�x�������΁A";
				mes "�������������I";
				next;
				cutin "tra_tradewindow.bmp", 255;
				mes "[�A���f�B]";
				mes "�`���ғ��m�ł̃A�C�e����";
				mes "���蔃���͂킩�������ȁB";
				mes "�킩��Ȃ�������A������x�b����";
				mes "�ǂ�����H";
				next;
				if(select("�킩�����̂ő��v","�킩��Ȃ�����")==1) break;
				mes "[�A���f�B]";
				mes "���ꂶ�Ⴀ�A������x�b�����B";
				next;
			}
			break;
		}
		return;
	}

	function	ABOUT_CARD	{
		while(1){
			mes "[�A���f�B]";
			mes "�󏭉��l�̍����A�C�e���A";
			mes "�J�[�h�ɂ���";
			mes "�b�����I";
			next;
			mes "[�A���f�B]";
			mes "���W�i�̒��ɂ͊󏭉��l��";
			mes "�������̂�����B";
			mes "���ꂪ�A^FF0000�����X�^�[�����Ƃ��J�[�h^000000���B";
			mes "�����X�^�[�̎�ނɂ�邪�A";
			mes "�J�[�h�ɂ���Ă͂ƂĂ��Ȃ�";
			mes "�����l�i�����Ă�����̂����邼�B";
			next;
			mes "[�A���f�B]";
			mes "^0000FF�J�[�h^000000��^0000FF�X���b�g^000000���̑����i��";
			mes "�������Ďg�p����B";
			mes "^FF0000��x��������ƃJ�[�h��";
			mes "���O���Ȃ��Ȃ�̂ŁA";
			mes "���ӂ��K�v���B^000000";
			next;
			mes "[�A���f�B]";
			mes "^FF0000�J�[�h^000000�ɂ͓�����ʂ�����A";
			mes "�����i�ɂ��̌��ʂ�";
			mes "���邱�Ƃ��ł��邽�߁A";
			mes "���ɋ��͂����I";
			next;
			mes "[�A���f�B]";
			mes "^0000FF�X���b�g�����Ă��鑕���i^000000��";
			mes "�����i���E�N���b�N����ƁA";
			mes "�����̉��Ɏl�p���g���o�Ă���B";
			mes "���̎l�p���g���ɃJ�[�h��";
			mes "���邱�Ƃ��ł���B";
			cutin "tra_slot_weapon.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�܂��A���X�Ŕ����Ă���";
			mes "�����A�C�e�����A";
			mes "�����X�^�[������W�ł��鑕���i��";
			mes "�������O�̑����i�ł��X���b�g����";
			mes "�������Ƃ����邼�I";
			next;
			mes "[�A���f�B]";
			mes "�����������X���b�g�������������i��";
			mes "�`���҂̊Ԃō��l��";
			mes "����������邱�Ƃ������B";
			mes "���X�ɔ���O�ɑ����i�̉��l��";
			mes "���ׂĎ����������ق����������B";
			next;
			mes "[�A���f�B]";
			mes "�J�[�h�ɂ��Ă�";
			mes "�킩���������H";
			cutin "tra_slot_weapon.bmp", 255;
			next;
			if(select("�킩�����̂ő��v","�킩��Ȃ�����")==1) break;
			mes "[�A���f�B]";
			mes "���ꂶ�Ⴀ�A������x�b�����B";
			next;
		}
		return;
	}

	function	ABOUT_WORLDMAP	{
		while(1){
			mes "[�A���f�B]";
			mes "�~�b�h�K���h�嗤�����鐢�E�n�}��";
			mes "���Ă݂悤�B";
			mes "���ꂪ���[���~�b�h�K�b�c������";
			mes "�n�߁A��v�ȏ������אڂ��Ă���";
			mes "^0000FF�~�b�h�K���h�嗤^000000���B";
			cutin "world_map_001.bmp", 3;
			next;
			mes "[�A���f�B]";
			mes "���E�n�}�Ɋւ��ĕ֗��ȋ@�\��";
			mes "�����Ă������B";
			mes "^0000FFAlt+.(�h�b�g)^000000�������ƁA";
			mes "���[���h�}�b�v���\���ł���B";
			cutin "jp_quest_help06.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "���[���h�}�b�v�ł�";
			mes "^0000FF�����̈ʒu^000000��A";
			cutin "jp_quest_help07.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "���[���h�}�b�v�ł�";
			mes "^0000FF�����̈ʒu^000000��A";
			mes "^0000FF�p�[�e�B�[�����o�[^000000�̈ʒu��";
			mes "�m�F�ł���B";
			cutin "jp_quest_help08.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "���̉�ʂł�^0000FF�}�E�X�̃J�[�\����";
			mes "�ړ�����^000000���ƂŁA�ǂ�ȏꏊ��";
			mes "�m�F�ł���񂾁B";
			cutin "jp_quest_help09.bmp", 2;
			next;
			mes "[�A���f�B]";
			mes "�G�[�A�R�z���b�B";
			mes "����^0000FF���[���h�}�b�v^000000�ɂ�";
			mes "^0000FF�`���҃A�J�f�~�[^000000��";
			mes "�\���͂���Ȃ����B";
			mes "�`���҃A�J�f�~�[��";
			mes "�閧�̏ꏊ�ɂ���񂾁B";
			cutin "jp_quest_help09.bmp", 255;
			next;
			mes "[�A���f�B]";
			mes "^0000FF�`���҃A�J�f�~�[^000000�ɂ�";
			mes "���[���~�b�h�K�b�c������";
			mes "^0000FF�v�����e���A�C�Y���[�h�A�A���x���^�A";
			mes "�t�F�C�����A�����N^000000����";
			mes "�]�����Ă��炤���Ƃ��ł��邼�B";
			next;
			mes "[�A���f�B]";
			mes "�����A�o�������ȁH";
			mes "���[���h�}�b�v�̕\����";
			mes "^0000FFAlt+.(�h�b�g)^000000���B";
			mes "�킩��Ȃ�������A������x�b����";
			mes "�ǂ�����H";
			cutin "jp_quest_help06.bmp", 2;
			next;
			if(select("�킩����","�킩��Ȃ�����")==1) break;
			mes "[�A���f�B]";
			mes "���ꂶ�Ⴀ�A������x�b�����B";
			next;
		}
		cutin "jp_quest_help06.bmp", 255;
		return;
	}
}

//�t�F�C
ac_cl_room.gat,44,65,4	script	�t�F�C#ac_room	828,6,6,{
	if(AC_PASSPORT<2){
		mes "[�t�F�C]";
		mes "��H";
		mes "���w��]�҂݂������ȁB";
		mes "�����Ŏ�t������΁A";
		mes "���w�ł��邺�B";
		mes "�`���҃A�J�f�~�[�ւ悤�����B";
		close;
	}
	function ABOUT_JOB;
	function GIVE_BOOK;
	set '@novice, callfunc("AC_GetNovice");
	
	if(Job!=Job_Novice){
		if(AC_NOVICE_QUE){
			if('@novice) {
				if(AC_NOVICE_QUE>30){
					mes "[�t�F�C]";
					mes "�悤�I";
					mes "�ŋ�^0000FF���[���̎d��^000000��";
					mes "��`���Ă邩���H";
					mes "�܂��A2���E�ɂ���";
					mes "�����������Ƃ���������A";
					mes "���ɕ����Ă���B";
				} else {
					mes "[�t�F�C]";
					mes "�悤�I";
					mes "���q�悳�������ȁB";
					mes "2���E�ɂ���";
					mes "�܂����������Ȃ����̂����H";
				}
			} else {
				mes "[�t�F�C]";
				mes "2���E�ɂ���";
				mes "������x���������Ȃ�A";
				mes "�������邺�B";
				mes "2���E�ɂ��ĕ��������H";
			}
		} else {
			mes "[�t�F�C]";
			mes "���܂茩�Ȃ��炾���ǁA";
			mes "�L�~�ɂ͂����Ȃ�ʂ��̂�";
			mes "������ȁB";
			mes "�����������Ƃ����邩���H";
		}
		next;
		if(AC_NOVICE_QUE>30){
			set '@sel, select("2���E�ɂ��ĕ���","���[���̎d���ɂ��ĕ���","�������Ƃ͂Ȃ�");
		} else {
			set '@sel, select("2���E�ɂ��ĕ���","�������Ƃ͂Ȃ�");
			if('@sel==2) set '@sel,3;
		}
		switch('@sel){
		case 1:
			ABOUT_JOB;
		case 3:
			mes "[�t�F�C]";
			mes "�������A�܂��m�肽���Ȃ�����A";
			mes "���ł������ɂ��Ă���B";
			mes "���Řb�����B";
			close;
		case 2:
			mes "[�t�F�C]";
			mes "�悵�I";
			mes "^FF0000���[��^000000�̂��Ƃ��ȁB";
			mes "���[���͎d������`���Ă����l��";
			mes "�T���Ă邼�B";
			mes "�L�~�̂悤�ɂ������肵�Ă���";
			mes "�`���҂Ȃ�A�����ɂȂ�͂����B";
			next;
			mes "[�t�F�C]";
			mes "���̕������o����A";
			mes "^0000FF�s���N�F�̔�����������^000000��";
			mes "�b�������Ă݂�Ƃ����B";
			mes "�L�~�̐����̎菕���ɂȂ�͂����B";
			close;
		}
	}
	if(AC_NOVICE_QUE<10){
		mes "[�t�F�C]";
		mes "���w���ς܂����݂������ȁB";
		mes "�܂��͂����ɂ���^0000FF�v����^000000����A";
		mes "�b�𕷂��Ă݂Ă���B";
		close;
	}
	if(AC_NOVICE_QUE<20){
		mes "[�t�F�C]";
		mes "�v�����̍u�K���I�����݂������ȁB";
		mes "����^0000FF�A���f�B^000000���𗧂���";
		mes "�����Ă���邼�B";
		close;
	}
	if(AC_NOVICE_QUE<30){
		mes "[�t�F�C]";
		mes "�A���f�B�̍u�K���I������悤���ȁI";
		mes "�����������ŁA�]�E�̏�����";
		mes "�����Ƃ���܂ł����ȁB";
		mes "���Ƃ͊o�傳������΁A";
		mes "�]�E���邱�Ƃ��o���邾�낤�ȁB";
		next;
		mes "[�t�F�C]";
		mes "���̐E�Ƃɓ]�E���邩�A";
		mes "���߂������H";
		next;
		switch(select("�]�E����E�Ƃ͌��߂�","��ʐE�ɂ��ĕ����Ă���")){
		case 1:
			mes "[�t�F�C]";
			mes "���łɓ]�E����E�Ƃ�";
			mes "���߂Ă����悤���ȁB";
			break;
		case 2:
			ABOUT_JOB;
			mes "[�t�F�C]";
			mes "�悵�A����ōu�K���Ōゾ�B";
		}
		if(AC_NOVICE_QUE<21){
			if (JobLevel<10 || BaseLevel<10) {
				mes "���j�������悤�I";
				if(checkre()) {
					if (BaseLevel<9) getexp 21,0;
					if (JobLevel<9) getexp 0,56;
					//if (BaseLevel<10) getexp 253,0;
					if (JobLevel<10) getexp 0,60;
				}
				else {
					if (BaseLevel<9) getexp 201,0;
					if (JobLevel<9) getexp 0,273;
					if (BaseLevel<10) getexp 253,0;
					if (JobLevel<10) getexp 0,680;
				}
			}
			set AC_NOVICE_QUE, 21;
		}
		next;
		if(AC_NOVICE_QUE==21){
			mes "[�t�F�C]";
			mes "�Ō�ɂ����n���Ă������I";
			next;
		} else {
			mes "[�t�F�C]";
			mes "�ו��͌��炵�������H";
			next;
			if(select("���炵�Ă���","���炵�ĂȂ�")==2){
				mes "[�t�F�C]";
				mes "�ו������炳�Ȃ���";
				mes "�n���Ȃ����B";
				close;
			}
		}
		set AC_NOVICE_QUE, 22;
		if(checkitemblank() < 2){
			mes "^FF0000���x����^000000";
			mes "�]�����A�C�e���̎�ސ���������";
			mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
			mes "�@�ł��܂���]";
			mes "�]�����A�C�e�������炵�Ă���A";
			mes "�@�ēx�b�������Ă��������]";
			close;
		} else
		if(Weight>(MaxWeight/100)*90){
			mes "^FF0000���x����^000000";
			mes "�]�����A�C�e���̏d�ʂ�������";
			mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
			mes "�@�ł��܂���]";
			mes "�]�����A�C�e�������炵�Ă���A";
			mes "�@�ēx�b�������Ă��������]";
			close;
		}
		set AC_NOVICE_QUE, 23;
		getitem 569, 150;
		getitem 602, 3;
		emotion 46,"";
		mes "[�t�F�C]";
		mes "�`���҂̕K���i�A���[�v�A�C�e�����I";
		mes "����^0000FF���̉H^000000��^0000FF�ʒu���Z�[�u^000000��������";
		mes "�u���Ƀ��[�v���邱�Ƃ��ł���B";
		mes "���ꂪ����΁A�댯�ȏꏊ��";
		mes "��������ł����S���B";
		mes "�񕜃A�C�e�����n���Ă������B";
		next;
		mes "[�t�F�C]";
		mes "���͖`���҃A�J�f�~�[��";
		mes "^0000FF�ʒu���Z�[�u^000000���Ă��邩��A";
		mes "�������܂�����A^FF0000���̉H^000000��";
		mes "�g���Ė߂��Ă���Ƃ������B";
		next;
		chgquest 100120,201045;
	} else {
		if(Job==Job_Novice){
			if(CHANGE_TK || CHANGE_SNV){
				emotion 21;
				mes "[�t�F�C]";
				mes "�����I";
				mes "�]�E����΂��Ă�";
				mes "�݂������ȁB";
				mes "BaseLv���グ��Ȃ�A";
				mes "������x�b�����A";
				mes "���������H";
				next;
				set '@sel, select("BaseLv���グ����","1���]�E������","2���E�ɂ��ĕ���","��b�u�b�N���ق���","�������Ƃ͂Ȃ�");
			} else
			if(CHANGE_GS || CHANGE_NJ){
				emotion 21;
				mes "[�t�F�C]";
				mes "�����I";
				mes "�]�E����΂��Ă�";
				mes "�݂������ȁB";
				mes "���̊X�ɍs���Ȃ�A";
				mes "������x�b�����A";
				mes "���������H";
				next;
				set '@sel, select("�]���T�[�r�X�ɂ��ĕ���","1���]�E������","2���E�ɂ��ĕ���","��b�u�b�N���ق���","�������Ƃ͂Ȃ�");
			} else {
				mes "[�t�F�C]";
				mes "1���]�E�������Ȃ�A";
				mes "������x�������邺�A";
				mes "���������H";
				next;
				set '@sel, select("1���]�E������","2���E�ɂ��ĕ���","��b�u�b�N���ق���","�������Ƃ͂Ȃ�")+1;
			}
		} else {
			mes "[�t�F�C]";
			mes "2���E�ɂ���";
			mes "������x���������Ȃ�A";
			mes "�������邺�B";
			mes "2���E�ɂ��ĕ��������H";
			next;
			set '@sel, select("2���E�ɂ��ĕ���","��b�u�b�N���ق���","�������Ƃ͂Ȃ�")+2;
		}
		switch('@sel){
		case 1:
			if(CHANGE_TK || CHANGE_SNV){
				mes "[�t�F�C]";
				mes "�悵�I";
				mes "BaseLv���グ�����񂾂ȁB";
				mes "�����������Ȃ�A�����";
				mes "�ςނ��Ƃ���؂��B";
				next;
				mes "[�t�F�C]";
				mes "�`���҃A�J�f�~�[����";
				mes "���K�������ʎ���";
				mes "�s���Č���Ƃ������B";
				next;
				mes "[�t�F�C]";
				mes "���K���͂��̍u�K����";
				mes "�o�Ă���A����̕���";
				mes "�s���Ƃ��邩��ȁB";
				close;
			} else {
				mes "[�t�F�C]";
				mes "�悵�I";
				mes "�]���T�[�r�X�̂��Ƃ��ȁB";
				mes "����̓^�[��������Ă邼�B";
				next;
				mes "[�t�F�C]";
				mes "���̊X�֍s���Ȃ�A";
				mes "^0000FF�u�]���T�[�r�X�v^000000�����Ă���";
				mes "�Ԃ�����^0000FF�^�[��^000000��T����";
				mes "�݂�Ƃ����B";
				next;
				mes "[�t�F�C]";
				mes "�^�[���͂��̍u�K����";
				mes "�o�Ă���A����̕��֍s����";
				mes "����͂����B";
				close;
			}
		case 2:
			break;
		case 4:
			if(!checkweight(11055,1)){
				mes "[�t�F�C]";
				mes "����H";
				mes "�ו��������݂������ȁB";
				mes "���������A�ו��̎�ސ���";
				mes "���炵�Ă��Ă���B";
				//setquest 100097; //�{�I�ł����������b�Z�[�W
				next;
				mes "[�t�F�C]";
				mes "���̕������ł��Ƃ���́A";
				mes "�J�v���T�[�r�X�őq�ɂ�";
				mes "���p�ł���B";
				mes "�����ŉו���a����Ƃ����B";
				close;
			}
			GIVE_BOOK;
			close;
		case 3:
			ABOUT_JOB;
		case 5:
			mes "[�t�F�C]";
			mes "�������A�܂��m�肽���Ȃ�����A";
			mes "���ł������ɂ��Ă���B";
			mes "���Řb�����B";
			close;
		}
	}
	mes "[�t�F�C]";
	mes "�܂��A�]�E�O�ɏ������K�v���B";
	mes "^0000FF�u��{�X�L���v�����x��9�@^000000��";
	mes "���������Ă����1���E��";
	mes "�]�E���ł���B";
	mes "���������ʂ�ɂ���Ă݂Ă���B";
	next;
	mes "[�t�F�C]";
	mes "^0000FF�u��{�X�L���v^000000�̃��x����";
	mes "^0000FF�u��{���v^000000�E�B���h�E����";
	mes "^0000FF�uSkill�v^000000�{�^������A";
	mes "^0000FF�u�X�L�����X�g�v^000000��\�����āA";
	mes "^0000FF�u�X�L���|�C���g�v^000000������";
	mes "�U�邱�ƂŁA�グ�邱�Ƃ��ł���B";
	next;
	mes "[�t�F�C]";
	mes "�Y�ꂿ��Ȃ�Ȃ��̂́A";
	mes "�X�L���̃��x�����グ��ɂ́A";
	mes "�X�L���|�C���g������U������A";
	mes "^0000FF�X�L�����X�g�E�B���h�E�̉E���ɂ���^000000";
	mes "^FF0000�u�m��v^000000�{�^���������āA";
	mes "�m�肳����K�v��������Ă��Ƃ��B";
	next;
	mes "[�t�F�C]";
	mes "���������B";
	mes "1���E�ɓ]�E����ɂ�";
	mes "^0000FF�u��{�X�L���v�����x��9�@^000000��";
	mes "����񂾁B";
	next;
	mes "[�t�F�C]";
	mes "�E�Ƃ����܂��Ă�Ȃ�A";
	mes "�]�E�ꏊ�������Ƃ����B";
	mes "�ǂ�����H";
	next;
	set '@sel,select("�]�E�ꏊ�𕷂�","�]�E�̏���������","�܂��A���܂��ĂȂ�");
	if(AC_NOVICE_QUE<30){
		mes "[�t�F�C]";
		mes "���A���������B";
		mes "�����n���Ă����Ȃ�������ȁB";
		next;
		GIVE_BOOK;
		set AC_NOVICE_QUE, 30;
		mes "[�t�F�C]";
		mes "�{�̘b�͂��̂��炢���ȁB";
		next;
	}
	switch('@sel){
	case 2:
		mes "[�t�F�C]";
		mes "^0000FF�u��{�X�L���v�����x��9�@^000000��";
		mes "����������΁A";
		mes "�\�[�h�}���A�}�W�V�����A";
		mes "�A�R���C�g�A�V�[�t�A";
		mes "�A�[�`���[�A�}�[�`�����g��";
		mes "�]�E�������ɏo���邩��ȁB";
		next;
		mes "[�t�F�C]";
		mes "1���E�ւ̓]�E���������Ȃ�����A";
		mes "���������Ă����邩��";
		mes "�܂����Ă���B";
		close2;
		cutin "start_020_jp.bmp", 4;
		setquest 100124; //state=1
		end;
	case 3:
		mes "�܂��]�E����E�Ƃ����܂���";
		mes "�Ȃ��Ȃ�A�`���҃A�J�f�~�[��";
		mes "��`��������Ă݂Ȃ����H";
		mes "���[�����d�������Ă����l��";
		mes "�T���Ă�݂����Ȃ񂾁B";
		next;
		mes "[�t�F�C]";
		mes "���[���Ȃ�A���̕������o��";
		mes "^0000FF������1F^000000�ɂ��邩��A";
		mes "�b�������Ă݂�Ƃ����B";
		next;
		mes "[�t�F�C]";
		mes "1���E�ւ̓]�E���������Ȃ�����A";
		mes "���������Ă����邩��A";
		mes "�܂����Ă���B";
		close2;
		setquest 100124;
		setquest 100128;
		end;
	}
	mes "[�t�F�C]";
	mes "�ǂ̐E�ƂɂȂ�񂾂��H";
	next;
	set '@sel,select("�\�[�h�}��^FF0000�i���S�Ҍ����j^000000","�}�W�V����^0000FF�i�����Ҍ����j^000000","�A�R���C�g^0000FF�i�����Ҍ����j^000000","�V�[�t^FF0000�i���S�Ҍ����j^000000","�A�[�`���[^FF0000�i���S�Ҍ����j^000000","�}�[�`�����g^000000�i�㋉�Ҍ����j^000000","�e�R���L�b�h^0000FF�i�����Ҍ����j^000000","�K���X�����K�[^000000�i�㋉�Ҍ����j^000000","�E��^000000�i�㋉�Ҍ����j^000000","�X�[�p�[�m�[�r�X^000000�i�㋉�Ҍ����j^000000");
	switch('@sel){
	case 1:
		mes "[�t�F�C]";
		mes "^0000FF�\�[�h�}��^000000�̏ꍇ�̓C�Y���[�h���ȁB";
		mes "^FF0000�C�Y���[�h�̐�^000000��";
		mes "^FF0000���m�M���h^000000������B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000���m�M���h^000000�܂ő����Ă�邺�B";
		mes "�]�E���Ă��邩���H";
		break;
	case 2:
		mes "[�t�F�C]";
		mes "^0000FF�}�W�V����^000000�̏ꍇ�̓Q�t�F�����ȁB";
		mes "^FF0000�Q�t�F���̖k��^000000��";
		mes "^FF0000���@�w�Z^000000������B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000���@�w�Z^000000�܂ő����Ă�邺�B";
		mes "�]�E���Ă��邩���H";
		break;
	case 3:
		mes "[�t�F�C]";
		mes "^0000FF�A�R���C�g^000000�̏ꍇ�̓v�����e�����ȁB";
		mes "^FF0000�v�����e���̖k��^000000��";
		mes "^FF0000�吹��^000000������B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000�吹��^000000�܂ő����Ă�邺�B";
		mes "�]�E���Ă��邩���H";
		break;
	case 4:
		mes "[�t�F�C]";
		mes "^0000FF�V�[�t^000000�̏ꍇ�̓����N���ȁB";
		mes "^FF0000�����N�ɍs���Ă���A";
		mes "�k���̃s���~�b�h^000000�ɍs���Ƃ����B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000�k���̃s���~�b�h^000000�܂�";
		mes "�����Ă�邺�B";
		mes "�]�E���Ă��邩���H";
		break;
	case 5:
		mes "[�t�F�C]";
		mes "^0000FF�A�[�`���[^000000�̏ꍇ�̓t�F�C�������ȁB";
		mes "^FF0000�t�F�C�����̖k��^000000��";
		mes "^FF0000�A�[�`���[�M���h^000000������B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000�A�[�`���[�M���h^000000�܂�";
		mes "�����Ă�邺�B";
		mes "�]�E���Ă��邩���H";
		break;
	case 6:
		mes "[�t�F�C]";
		mes "^0000FF�}�[�`�����g^000000�̏ꍇ�̓A���x���^���ȁB";
		mes "^FF0000�A���x���^�̓쐼^000000��";
		mes "^FF0000���l�g��^000000������B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000���l�g��^000000�܂�";
		mes "�����Ă�邺�B";
		mes "�]�E���Ă��邩���H";
		break;
	case 7:
		mes "[�t�F�C]";
		mes "^0000FF�e�R���L�b�h^000000�̏ꍇ�̓t�F�C�������ȁB";
		mes "^FF0000�t�F�C�����̒�������";
		mes "�����쐼������ɁA";
		mes "�P�����Ă����C�s��^000000��";
		mes "����͂����B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000�t�F�C�����̓쐼������^000000��";
		mes "�����Ă�邺�B";
		next;
		mes "[�t�F�C]";
		mes "�܂��A�����͂����Ă��A";
		mes "�e�R���L�b�h�ɂȂ邽�߂ɂ�";
		mes "^FF0000����������^000000�悤�����ǂȁB";
		mes "�L�~���{���ɂȂ肽���ƌ����Ȃ�A";
		mes "�~�߂͂��Ȃ��B";
		mes "�]�E���Ă��邩���H";
		break;
	case 8:
		mes "[�t�F�C]";
		mes "^0000FF�K���X�����K�[^000000�̏ꍇ��";
		mes "^FF0000�A�C���u���b�N^000000���ȁB";
		mes "^FF0000�s�s�̒����ɂ��錤����^000000��";
		mes "�s���Ƃ����B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000�s�s�̒����ɂ��錤����^000000��";
		mes "�����Ă�邺�B";
		next;
		mes "[�t�F�C]";
		mes "�܂��A�����͂����Ă��A";
		mes "�K���X�����K�[�ɂȂ邽�߂ɂ�";
		mes "^FF0000����������^000000�悤�����ǂȁB";
		mes "�L�~���{���ɂȂ肽���ƌ����Ȃ�A";
		mes "�~�߂͂��Ȃ��B";
		mes "�]�E���Ă��邩���H";
		break;
	case 9:
		mes "[�t�F�C]";
		mes "^0000FF�E��^000000�̏ꍇ�̓A�}�c���ȁB";
		mes "�s��������^FF0000�A���x���^�ɍs���Ă���A";
		mes "�D�ōs��^000000���ƂɂȂ�ȁB";
		mes "�D�オ��������A�삯�o����";
		mes "�`���҂̃L�~�ɂ�";
		mes "��ς�������Ȃ����B";
		next;
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000�A�}�c�̉��~^000000��";
		mes "�����Ă�邺�B";
		next;
		mes "[�t�F�C]";
		mes "�܂��A�����͂����Ă��A";
		mes "�E�҂ɂȂ邽�߂ɂ�";
		mes "^FF0000����������^000000�悤�����ǂȁB";
		mes "�L�~���{���ɂȂ肽���ƌ����Ȃ�A";
		mes "�~�߂͂��Ȃ��B";
		mes "�]�E���Ă��邩���H";
		break;
	case 10:
		mes "[�t�F�C]";
		mes "^0000FF�X�[�p�[�m�[�r�X^000000�̏ꍇ��";
		mes "^FF0000BaseLv��45^000000�ɂ���K�v�����邼�B";
		mes "�ꏊ�̓A���f�o�������ȁB";
		mes "^FF0000�A���f�o�����̓�̉Ɖ�^000000��";
		mes "�g�[�[�����Ă����ς����̂�";
		mes "����͂����B";
		next;
		if(BaseLevel<45) {
			mes "[�t�F�C]";
			mes "���[���Ȃ�A���̕������o��";
			mes "^0000FF������1F^000000�ɂ��邩��A";
			mes "�b�������Ă݂�Ƃ����B";
			next;
			mes "[�t�F�C]";
			mes "1���E�ւ̓]�E���������Ȃ�����A";
			mes "���������Ă����邩��A";
			mes "�܂����Ă���B";
			close;
		}
		mes "[�t�F�C]";
		mes "�������ȁA�����ɓ]�E����Ȃ�A";
		mes "����^FF0000�A���f�o�����̓�̉Ɖ�^000000��";
		mes "�����Ă�邺�B";
		next;
		mes "[�t�F�C]";
		mes "�܂��A�����͂����Ă��A";
		mes "�X�[�p�[�m�[�r�X�ɂȂ邽�߂ɂ�";
		mes "^FF0000����������^000000�悤�����ǂȁB";
		mes "�L�~���{���ɂȂ肽���ƌ����Ȃ�A";
		mes "�~�߂͂��Ȃ��B";
		mes "�]�E���Ă��邩���H";
		break;
	}
	next;
	cutin "jp_quest_help10.bmp", 255;
	if(select("�]�E���ɍs��","�܂��A�]�E���Ȃ�")==2){
		mes "[�t�F�C]";
		mes "���[���Ȃ�A���̕������o��";
		mes "^0000FF������1F^000000�ɂ��邩��A";
		mes "�b�������Ă݂�Ƃ����B";
		next;
		mes "[�t�F�C]";
		mes "1���E�ւ̓]�E���������Ȃ�����A";
		mes "���������Ă����邩��A";
		mes "�܂����Ă���B";
		close;
	}
	switch('@sel){
	case 7:
	case 8:
	case 9:
	case 10:
		mes "[�t�F�C]";
		mes "���Ƃ́A�������ȁc�c";
		mes "�]�E���邽�߂ɁA�ǂ�����";
		mes "�s�����Ƃ���������A";
		mes "��x�`���҃A�J�f�~�[�ɖ߂���";
		mes "����Ƃ����B";
		next;
		mes "[�t�F�C]";
		mes "^FF0000�`���҃A�J�f�~�[�ɂ�";
		mes "�]���̃T�[�r�X�����Ă����l��";
		mes "���邩��ȁB^000000";
		next;
		break;
	}
	mes "[�t�F�C]";
	mes "���ꂶ��A�]�����邺�B";
	close2;
	set AC_JOBCHANGE,1;
	switch('@sel){
	case 1: warp "izlude_in.gat",74,167; break;
	case 2: warp "geffen_in.gat",164,122; break;
	case 3: warp "prt_church.gat",183,37; break;
	case 4: warp "moc_prydb1.gat",45,124; break;
	case 5: warp "payon_in02.gat",63,67; break;
	case 6: warp "alberta_in.gat",57,43; break;
	case 7: warp "payon.gat",157,145; break;
	case 8: warp "que_ng.gat",150,167; break;
	case 9: warp "que_ng.gat",30,62; break;
	case 10:warp "aldebaran.gat",112,64; break;
	}
	end;

	function	ABOUT_JOB	{
		while(1){
			mes "[�t�F�C]";
			mes "�ǂ̐E�Ƃ̌n���ɂ���";
			mes "���������H";
			next;
			switch(select("�\�[�h�}���n","�}�W�V�����n","�A�R���C�g�n","�V�[�t�n","�A�[�`���[�n","�}�[�`�����g�n","�e�R���L�b�h�n","����1���E","�������Ƃ���߂�")){
			case 1:
				mes "[�t�F�C]";
				mes "�\�[�h�}���n�ɂ��Ă��ȁB";
				mes "�v������������Ƙb���Ă�";
				mes "���낤���ǁA�\�[�h�}����";
				mes "�i�C�g�ƃN���Z�C�_�[��";
				mes "�]�E�ł���悤�ɂȂ�B";
				mes "�ǂ����ɂ��ĕ��������񂾂��H";
				cutin "swordman_1.bmp", 2;
				next;
				switch(select("�i�C�g","�N���Z�C�_�[","���̑��̐E�Ƃɂ��ĕ���")){
				case 1:
					mes "[�t�F�C]";
					mes "�i�C�g�͍��������U���Ɩh��͂�";
					mes "���˔����������R�m���B";
					mes "�y�R�y�R�ɋR�悷�邱�Ƃ��ł��邽�߁A";
					mes "�����@���͂������Ƃ��\�ɂȂ�B";
					cutin "swordman_3.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�i�C�g�̐킢���͎��";
					mes "�����g�p���邩�����g�p���邩��";
					mes "�قȂ��Ă���B";
					mes "���Ȃ�u�����f�B�b�V���X�s�A";
					mes "���茕�Ȃ�{ �E�����O�o�b�V��";
					mes "�Ƃ��������͂Ȕ͈͍U�����K���ł���B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�i�C�g�̓��[�h�i�C�g�i���j��";
					mes "�N���Z�C�_�[�̓p���f�B���i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "swordman_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[�t�F�C]";
					mes "�N���Z�C�_�[�̓i�C�g�����h��͂�";
					mes "���������E�Ƃ��B";
					mes "�i�C�g�Ɠ��l�Ƀy�R�y�R��";
					mes "�R��ł��A�����@���������Ă�B";
					cutin "swordman_4.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�N���Z�C�_�[�͍����h��͂�";
					mes "���������킢���\���B";
					mes "���⏂�̃X�L�����g�����Ȃ��A";
					mes "�͈͍U���̃O�����h�N���X��";
					mes "���Ԃ����f�B�{ �[�V�����Ƃ�����";
					mes "�X�L�����K�����邱�Ƃ��ł���B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�i�C�g�̓��[�h�i�C�g�i���j��";
					mes "�N���Z�C�_�[�̓p���f�B���i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "swordman_5.bmp", 2;
					next;
					break;
				}
				cutin "swordman_5.bmp", 255;
				break;
			case 2:
				mes "[�t�F�C]";
				mes "�}�W�V�����n�ɂ��Ă��ȁB";
				mes "�v������������Ƙb���Ă�";
				mes "���낤���ǁA�}�W�V������";
				mes "�E�B�U�[�h�ƃZ�[�W��";
				mes "�]�E�ł���悤�ɂȂ�B";
				mes "�ǂ����ɂ��ĕ��������񂾂��H";
				cutin "magician_1.bmp", 2;
				next;
				switch(select("�E�B�U�[�h","�Z�[�W","���̑��̐E�Ƃɂ��ĕ���")){
				case 1:
					mes "[�t�F�C]";
					mes "�E�B�U�[�h�͍ő勉�̉Η͂�p����";
					mes "�L�͈͂̑喂�@�����͂̐E�Ƃ��B";
					mes "�ڋߐ�͋�肾���A";
					mes "�p�[�e�B�[��Ȃǂ�";
					mes "���􂵂₷���E�Ƃ��B";
					cutin "magician_3.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�E�B�U�[�h�̐킢����";
					mes "�������@�U���͂�";
					mes "�����������̂ƂȂ�B";
					mes "���e�I�X�g�[��";
					mes "�X�g�[���K�X�g�Ƃ��������͂�";
					mes "�͈͖��@����g���Đ키���Ƃ��\���B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�E�B�U�[�h�̓n�C�E�B�U�[�h�i���j��";
					mes "�Z�[�W�̓v���t�F�b�T�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "magician_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[�t�F�C]";
					mes "�Z�[�W�͖��@�ɑ΂���m����";
					mes "�[�߂邱�ƂŁA���@�ɑ΍R����";
					mes "�\�͂�g�ɂ����A�����U����";
					mes "�s���E�Ƃ��B";
					mes "�ߐڔ\�͂������A���ڍU����";
					mes "���@�U���̗�������g���Đ킦��B";
					cutin "magician_4.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�G���U�����Ɏ����ŃX�L����";
					mes "�g�p���邱�Ƃ��ł���";
					mes "�I�[�g�X�y����";
					mes "���@�r�����̈ړ����\��";
					mes "�t���[�L���X�g�Ƃ������X�L����";
					mes "�K���ł���B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�E�B�U�[�h�̓n�C�E�B�U�[�h�i���j��";
					mes "�Z�[�W�̓v���t�F�b�T�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "magician_5.bmp", 2;
					next;
					break;
				}
				cutin "magician_5.bmp", 255;
				break;
			case 3:
				mes "[�t�F�C]";
				mes "�A�R���C�g�n�ɂ��Ă��ȁB";
				mes "�v������������Ƙb���Ă�";
				mes "���낤���ǁA�A�R���C�g��";
				mes "�v���[�X�g�ƃ����N��";
				mes "�]�E�ł���悤�ɂȂ�B";
				mes "�ǂ����ɂ��ĕ��������񂾂��H";
				cutin "acolyte_1.bmp", 2;
				next;
				switch(select("�v���[�X�g","�����N","���̑��̐E�Ƃɂ��ĕ���")){
				case 1:
					mes "[�t�F�C]";
					mes "�v���[�X�g�͑��ʂȉ񕜂�";
					mes "�⏕���@���o���邱�Ƃ�";
					mes "�ł���E�Ƃ��B";
					mes "�p�[�e�B�[�̗v�Ƃ����Ă悢";
					mes "���݂ƂȂ�A�����̒��Ԃ�";
					mes "�����Đ키���Ƃ��ł���B";
					cutin "acolyte_3.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�v���[�X�g�̐킢���͎x���X�L����";
					mes "���������킢�ƂȂ�B";
					mes "�����U����h���L���G�G���C�\����";
					mes "SP�̉񕜗͂��グ��}�O�j�t�B�J�[�g�A";
					mes "�T���N�`���A���̌p���I��";
					mes "�񕜖��@���K���ł���悤�ɂȂ�B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�v���[�X�g�̓n�C�v���[�X�g�i���j��";
					mes "�����N�̓`�����s�I���i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "acolyte_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[�t�F�C]";
					mes "�����N�͓��̂�b���āA";
					mes "�Ђ����������d������";
					mes "�C�s�m�̐E�Ƃ��B";
					mes "���ڍU���𓾈ӂƂ��A�C���ɂ����";
					mes "��������C���U����";
					mes "�g�p���邱�Ƃ��ł���B";
					cutin "acolyte_4.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�����N�̐킢���͐ڋߐ��";
					mes "��Ƃ����킢�ƂȂ�B";
					mes "�����h��͂̑���ɗL���Ȕ����A";
					mes "���S�ɖh��ɓO��������A";
					mes "�ꌂ�K�E�̈��C���e�����Ȃǂ�";
					mes "�K���ł���B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�v���[�X�g�̓n�C�v���[�X�g�i���j��";
					mes "�����N�̓`�����s�I���i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "acolyte_5.bmp", 2;
					next;
					break;
				}
				cutin "acolyte_5.bmp", 255;
				break;
			case 4:
				mes "[�t�F�C]";
				mes "�V�[�t�n�ɂ��Ă��ȁB";
				mes "�v������������Ƙb���Ă�";
				mes "���낤���ǁA�V�[�t��";
				mes "�A�T�V���ƃ��[�O��";
				mes "�]�E�ł���悤�ɂȂ�B";
				mes "�ǂ����ɂ��ĕ��������񂾂��H";
				cutin "thief_1.bmp", 2;
				next;
				switch(select("�A�T�V��","���[�O","���̑��̐E�Ƃɂ��ĕ���")){
				case 1:
					mes "[�t�F�C]";
					mes "�A�T�V���͑S�E���ōő���";
					mes "�f�����œG��|�M���Ȃ���A";
					mes "�킦��E�Ƃ��B";
					mes "�񓁗�����p����̃J�^�[����";
					mes "�g�p���Ă̍U�����ł���B";
					cutin "thief_3.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�A�T�V���̐킢���͍�����𗦂�";
					mes "���������U���ƂȂ�B";
					mes "�ōU�����s����G���`�����g�|�C�Y���A";
					mes "���m���œŏ�Ԃɂ���x�i���i�C�t";
					mes "�Ƃ������X�L�����K���ł���B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�A�T�V���̓A�T�V���N���X�i���j��";
					mes "���[�O�̓`�F�C�T�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "thief_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[�t�F�C]";
					mes "���[�O�͒Z�����g�p�����퓬���ł��A";
					mes "�A�C�e���Ȃǂ�G����D�����Ƃ�";
					mes "�e�ՂȐE�Ƃ��B";
					mes "�n�ʂɗ��������c����ȂǁA";
					mes "�V�ѐS������E�ƂɂȂ�ȁB";
					cutin "thief_4.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�U�����ɓG�̃A�C�e����D��";
					mes "�X�e�B�[���𔭓��ł���";
					mes "�X�i�b�`���[��A";
					mes "�w�����邱�ƂŎg�p�\�ƂȂ�";
					mes "�o�b�N�X�^�u�̍U���X�L���͋��͂��B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�A�T�V���̓A�T�V���N���X�i���j��";
					mes "���[�O�̓`�F�C�T�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "thief_5.bmp", 2;
					next;
					break;
				}
				cutin "thief_5.bmp", 255;
				break;
			case 5:
				mes "�A�[�`���[�n�ɂ��Ă��ȁB";
				mes "�v������������Ƙb���Ă�";
				mes "���낤���ǁA�A�[�`���[�̓n���^�[��";
				mes "�o�[�h�i�j�j�������̓_���T�[�i���j";
				mes "�ɓ]�E�ł���悤�ɂȂ�B";
				mes "�ǂ����ɂ��ĕ��������񂾂��H";
				cutin "archer_1.bmp", 2;
				next;
				switch(select("�n���^�[","�o�[�h�ƃ_���T�[","���̑��̐E�Ƃɂ��ĕ���")){
				case 1:
					mes "[�t�F�C]";
					mes "�n���^�[�͉������U���Ƒ��ʂ�";
					mes "㩂œG��|�����Ƃ��ł���E�Ƃ��B";
					mes "�t�@���R�����J��o���X�L����";
					mes "�����̎�ނ�㩂����ʓI��";
					mes "�g�p���ăe�N�j�J���ɐ키���Ƃ�";
					mes "�ł��邾�낤�B";
					cutin "archer_3.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�n���^�[�̐킢���̓t�@���R����";
					mes "�g���b�v�̎擾���@�ɂ���B";
					mes "�G�̓����𕕂���A���N���X�l�A��";
					mes "�t�@���R���𗘗p�����͈͍U����";
					mes "�u���b�c�r�[�g�͘A�����ă_���[�W��";
					mes "�����邱�Ƃ��ł���X�L�����B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�n���^�[�̓X�i�C�p�[�i���j��";
					mes "�o�[�h�ƃ_���T�[��";
					mes "�N���E���ƃW�v�V�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "archer_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[�t�F�C]";
					mes "�o�[�h�i�j�j�͉̂Ɖ��t�ɂ���āA";
					mes "�_���T�[�i���j�͉ؗ�ȕ�����";
					mes "�l�X�Ȏx�����s�����Ƃ�";
					mes "���ӂƂ���E�Ƃ��B";
					cutin "archer_4.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�o�[�h�ƃ_���T�[�̓X�L����";
					mes "���ʔ͈͓��̃v���C���[��";
					mes "�x�����s����̂��������B";
					mes "�o�[�h���g�p����u���M�̎���";
					mes "�X�L���̔������Ԃƍd�����Ԃ�";
					mes "�Z�����鋭�͂ȃX�L���B";
					next;
					mes "[�t�F�C]";
					mes "�_���T�[�̃T�[�r�X�t�H�[���[��";
					mes "���ʔ͈͓��̃v���C���[��";
					mes "�ő�SP�𑝉������A";
					mes "�X�L���g�p����SP����ʂ�";
					mes "���������邱�Ƃ��ł���X�L�����B";
					next;
					mes "[�t�F�C]";
					mes "�܂��A�o�[�h�ƃ_���T�[��";
					mes "2�l�������Ƃō��t�X�L���Ƃ���";
					mes "���͂Ȏx���X�L����";
					mes "�g�p���邱�Ƃ��ł���B";
					next;
					cutin "archer_5.bmp", 2;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�n���^�[�̓X�i�C�p�[�i���j��";
					mes "�o�[�h�ƃ_���T�[��";
					mes "�N���E���ƃW�v�V�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					next;
					break;
				}
				cutin "archer_5.bmp", 255;
				break;
			case 6:
				mes "[�t�F�C]";
				mes "�}�[�`�����g�n�ɂ��Ă��ȁB";
				mes "�v������������Ƙb���Ă�";
				mes "���낤���ǁA�}�[�`�����g��";
				mes "�u���b�N�X�~�X�ƃA���P�~�X�g��";
				mes "�]�E�ł���悤�ɂȂ�B";
				mes "�ǂ����ɂ��ĕ��������񂾂��H";
				cutin "merchant_1.bmp", 2;
				next;
				switch(select("�u���b�N�X�~�X","�A���P�~�X�g","���̑��̐E�Ƃɂ��ĕ���")){
				case 1:
					mes "[�t�F�C]";
					mes "�u���b�N�X�~�X�͗͋����r�͂�";
					mes "�����i�ŕ���̐��B����ʑ�����";
					mes "�t�^���s�����Ƃ��ł���E�Ƃ��B";
					mes "�퓬��⏕����X�L���������A";
					mes "����̐�����s�����Ƃ��ł���B";
					cutin "merchant_3.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�u���b�N�X�~�X�̐킢����";
					mes "�r�͂ɗ�����̂������B";
					mes "�G�Ɉ͂܂ꂽ�Ƃ��ɔ͈͂�";
					mes "�X�^��������n���}�[�t�H�[����";
					mes "����̔j���ƈ��������ɍU���͂�";
					mes "�グ��I�[�o�[�g���X�g������B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�u���b�N�X�~�X��";
					mes "�z���C�g�X�~�X�i���j��";
					mes "�A���P�~�X�g�̓N���G�C�^�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "merchant_5.bmp", 2;
					next;
					break;
				case 2:
					mes "[�t�F�C]";
					mes "�A���P�~�X�g�͉񕜗p�|�[�V�����Ȃǂ�";
					mes "��i�����o���B���p�̐E�Ƃ��B";
					mes "�e��|�[�V�����n�̃A�C�e����";
					mes "�쐬���邱�Ƃ��ł���B";
					mes "�z�����N���X�⃂���X�^�[��";
					mes "�������Đ키���Ƃ��ł���B";
					cutin "merchant_4.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�A���P�~�X�g��";
					mes "�|�[�V�����s�b�`���[�ł̎x����";
					mes "�o�C�I�v�����g����g�����킢��";
					mes "�s�����Ƃ��ł���悤�ɂȂ�B";
					next;
					mes "[�t�F�C]";
					mes "�A���P�~�X�g�������ł���";
					mes "�z�����N���X�͈ꏏ��";
					mes "�키���Ƃ��ł���l�H�����ł�����A";
					mes "��ĂĂ����΁A���͂Ȗ�����";
					mes "�Ȃ��Ă���邾�낤�B";
					next;
					mes "[�t�F�C]";
					mes "����ɐ������āA";
					mes "�]���Ƃ����s�ׂ��s���΁A";
					mes "�u���b�N�X�~�X��";
					mes "�z���C�g�X�~�X�i���j��";
					mes "�A���P�~�X�g�̓N���G�C�^�[�i�E�j";
					mes "�Ƃ����E�ƂɂȂ�邼�I";
					cutin "merchant_5.bmp", 2;
					next;
					break;
				}
				cutin "merchant_5.bmp", 255;
				break;
			case 7:
				mes "[�t�F�C]";
				mes "�e�R���L�b�h�n�ɂ��Ă��ȁB";
				mes "�v������������Ƙb���Ă�";
				mes "���낤���ǁA�e�R���L�b�h��";
				mes "�����ƃ\�E�������J�[��";
				mes "�]�E�ł���悤�ɂȂ�B";
				mes "�ǂ����ɂ��ĕ��������񂾂��H";
				cutin "taekwonkid_1.bmp", 2;
				next;
				switch(select("����","�\�E�������J�[","���̑��̐E�Ƃɂ��ĕ���")){
				case 1:
					mes "[�t�F�C]";
					mes "�����͑��z�A���A���̉��b��";
					mes "���������E�Ƃ��B";
					mes "�{ �ɔ�߂�ꂽ�G�l���M�[��";
					mes "���ɂ��߁A�U���͂ɂ���\�͂�����B";
					mes "�܂��A�ꏊ����ɂ���Ďg�p�\��";
					mes "�X�L�����ω�����E�Ƃł�����B";
					cutin "taekwonkid_3.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�����̐킢���̓X�L����";
					mes "�o�^���郂���X�^�[��";
					mes "�ꏊ�ɂ��Ƃ��낪�傫���B";
					mes "���z�A���A���̓{ ��X�L����";
					mes "�U���͂��傫���㏸����";
					mes "���͂ȃX�L�����B";
					next;
					break;
				case 2:
					mes "[�t�F�C]";
					mes "�\�E�������J�[�̓e�R���h�[��";
					mes "����f���A�썰�̗͂�";
					mes "���݂ɑ���E�Ƃ��B";
					mes "�l�X�ȐE�Ƃ��T�|�[�g�ł���Ƌ��ɁA";
					mes "���@�ɂ��U�����s�����Ƃ��ł���B";
					cutin "taekwonkid_4.bmp", 2;
					next;
					mes "[�t�F�C]";
					mes "�\�E�������J�[�̐킢����";
					mes "�P�̖��@�Ƃ��ċ��͂ȃG�X�}��";
					mes "�E�Ƃ��Ƃ̓����𔭊����鍰�̃X�L��";
					mes "���g�p�������̂ƂȂ�B";
					mes "HP�_���[�W���󂯂�SP������A";
					mes "�񕜂��s���J�A�q�͋��͂ȃX�L�����B";
					next;
					break;
				}
				cutin "taekwonkid_4.bmp", 255;
				break;
			case 8:
				mes "[�t�F�C]";
				mes "����1���E�̃K���X�����K�[�A�E��";
				mes "�X�[�p�[�m�[�r�X�ɂ�";
				mes "��ʐE�͂Ȃ��񂾁B";
				mes "���̐E�Ƃ͖`���҂ł��H��";
				mes "�E�Ƃƌ����邩������Ȃ��ȁB";
				mes "���L���ȐE�Ƃ��B";
				next;
				break;
			case 9:
				mes "[�t�F�C]";
				mes "�������A�܂��m�肽���Ȃ�����A";
				mes "���ł������ɂ��Ă���B";
				mes "���Řb�����B";
				close;
			}
			mes "[�t�F�C]";
			mes "���̏�ʐE�ɂ��ĕ��������H";
			next;
			if(select("�킩����������v","���̐E����������")==1) break;
		}
		return;
	}

	function	GIVE_BOOK {
		if(checkitemblank() < 2){
			mes "^FF0000���x����^000000";
			mes "�]�����A�C�e���̎�ސ���������";
			mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
			mes "�@�ł��܂���]";
			mes "�]�����A�C�e�������炵�Ă���A";
			mes "�@�ēx�b�������Ă��������]";
			close;
		} else
		if(Weight>(MaxWeight/100)*90){
			mes "^FF0000���x����^000000";
			mes "�]�����A�C�e���̏d�ʂ�������";
			mes "�@�A�C�e�����󂯂Ƃ邱�Ƃ�";
			mes "�@�ł��܂���]";
			mes "�]�����A�C�e�������炵�Ă���A";
			mes "�@�ēx�b�������Ă��������]";
			close;
		}
		getitem 11055,1;
		mes "[�t�F�C]";
		mes "�`���̊�b�u�b�N���B";
		mes "�厖�Ȃ��Ƃ������Ă���B";
		mes " ";
		mes "��������������A���̖{�̎g������";
		mes "�����Ă������B";
		next;
		cutin "jp_quest_help10.bmp",2;
		mes "[�t�F�C]";
		mes "^FF0000Alt+E�L�[^000000�ŏ����A�C�e����";
		mes "�\������邩��A�`���̊�b�u�b�N��";
		mes "^FF0000�J�[�\�������킹�āA";
		mes "�E�N���b�N^000000���Ă݂Ă���B";
		mes "����ƁA�A�C�e���̏ڍ׃E�B���h�E��";
		mes "�\�������B";
		next;
		mes "[�t�F�C]";
		mes "�`���̊�b�u�b�N�̂悤��";
		mes "�{�̃A�C�e���͓ǂނ��Ƃ��ł���B";
		mes "^0000FF�E�B���h�E����̊J�����{�̃}�[�N��";
		mes "���N���b�N^000000���Ă݂Ă���B";
		mes "�J�[�\�������킹���Ƃ��Ɂu�ǂށv��";
		mes "�\�������ق����B";
		next;
		mes "[�t�F�C]";
		mes "����ƁA�{�̒���ǂނ��Ƃ��ł���B";
		mes "�`���̑�؂Ȃ��Ƃ�������Ă���";
		mes "�̂ŁA�ǂ�ł݂�Ƃ����B";
		next;
		cutin "jp_quest_help10.bmp", 255;
		return;
	}

OnTouch:
	set AC_JOBCHANGE,0;
	if(AC_NOVICE_QUE==30 && Job!=Job_Novice && !checkquest(100128)){
		mes "[�t�F�C]";
		mes "�����]�E�ł����悤���ȁB";
		mes "���߂łƂ��I";
		next;
		mes "[�t�F�C]";
		mes "���ꂶ��A�`���҃A�J�f�~�[����";
		mes "���ĉ��Ƃ����B";
		mes "�`���҃A�J�f�~�[�ɂ́A";
		mes "�퓬���o������K����";
		mes "�����Ȉ˗��ɉ�����";
		mes "�d�������邩��ȁB";
		next;
		mes "[�t�F�C]";
		mes "���������A";
		mes "^FF0000���[��^000000��";
		mes "�d������`���Ă����l��";
		mes "�T���Ă�񂾁B";
		next;
		mes "[�t�F�C]";
		mes "���̕������o����A";
		mes "^0000FF�s���N�F�̔�����������^000000��";
		mes "�b�������Ă݂�Ƃ����B";
		mes "�L�~�̐����̎菕���ɂȂ�͂����B";
		setquest 100128;
		close;
	} else
	if(AC_NOVICE_QUE==30 && Job==Job_Novice){
		if(CHANGE_SNV || CHANGE_TK || CHANGE_GS || CHANGE_NJ){
			emotion 21, "�t�F�C#ac_room"; //52725
			mes "[�t�F�C]";
			mes "�����I";
			mes "�]�E�Ɍ����Ă���΂��Ă�";
			mes "�݂������ȁI";
			next;
			if(CHANGE_TK||CHANGE_SNV){
				mes "[�t�F�C]";
				mes "BaseLv���グ�����Ȃ�A";
				mes "�`���҃A�J�f�~�[����";
				mes "���K�������ʎ���";
				mes "�s���Č���Ƃ����B";
				next;
				mes "[�t�F�C]";
				mes "���K���͂��̍u�K����";
				mes "�o�Ă���A����̕���";
				mes "�s���Ƃ��邼�B";
				close;
			} else {
				mes "[�t�F�C]";
				mes "���̊X�֍s���Ȃ�A";
				mes "^0000FF�u�]���T�[�r�X�v^000000�����Ă���";
				mes "�Ԃ�����^0000FF�^�[��^000000��T����";
				mes "�݂�Ƃ����B";
				next;
				mes "[�t�F�C]";
				mes "�^�[���͂��̍u�K����";
				mes "�o�Ă���A����̕��֍s����";
				mes "����͂����B";
				close;
			}
		}
	}
	end;
}


//����m�[�g
-	script	����m�[�g#func	-1,{
	mes "[����m�[�g]";
	mes "�]�`���ɖ𗧂��Ƃ������ꂽ�{���]";
	mes "�]�{���J���ƁA�y�[�W�̍��ڂ�";
	mes "�̂��Ă���]";
	mes "�]�ǂ̃y�[�W��ǂ�ł݂悤���]";
	next;
	switch(select("��b�̎d��","�퓬�̎d��","�ꏊ�̒��ו�","�����","���_�ύX�̎d��","�V���[�g�J�b�g�̎g����","�ǂނ̂���߂�")){
	case 1:
		mes "[��b�̎d���̃y�[�W]";
		mes "�]�����ɉ�b�Ə����ꂽ��������";
		mes "�E�B���h�E����b�E�B���h�E�ł��B";
		mes "��b�E�B���h�E�ɂ͉�b���͂��߁A";
		mes "�X�e�[�^�X�̕ω���A�C�e����";
		mes "���莞�ɂ����b�Z�[�W���\������܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]���i�E���̋󗓂Ƀ��b�Z�[�W��";
		mes "����A^0000FFEnter�L�[^000000�������ƁA";
		mes "�����ʂ̑S�v���C���[��";
		mes "��b���\������܂��B";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]���i�����̋󗓂ɃL�����N�^�[����";
		mes "���͂��邱�ƂŁA���̑����1��1��";
		mes "��b���s�����Ƃ��ł��܂��]";
		mes "�]���̋@�\���g�����ƂŁA";
		mes "��ʓ��ɑ��肪���Ȃ���Ԃł�";
		mes "���O�C�����̑���Ɖ�b���ł��܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]��b�E�B���h�E�E����";
		mes "2�́��̓��A";
		mes "�E�́����N���b�N����ƁA";
		mes "�E�B���h�E�̑傫�����ύX����A";
		mes "�\���s����ύX�ł��܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]�����́����N���b�N����ƁA";
		mes "��b���[�h�̐؂�ւ����s���܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]��b���[�h�̐؂�ւ��́A�S�́A";
		mes "�p�[�e�B�A�M���h��3��ނ�";
		mes "�Ȃ�܂��]";
		mes "�]�S�͓̂����ʓ���";
		mes "�L�����N�^�[�ɉ�b���\������܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]�p�[�e�B�̓��O�C������";
		mes "�p�[�e�B�����o�[�S����";
		mes "����������b���\������܂��B";
		mes "�p�[�e�B�����o�[�ȊO�ɂ�";
		mes "���̉�b�͌����܂���]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]�M���h�����O�C������";
		mes "�M���h�����o�[�S����";
		mes "����������b���\������܂��B";
		mes "�M���h�����o�[�ȊO�ɂ�";
		mes "���̉�b�͌����܂���]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]�܂��A�����̍ۂ�";
		mes "^0000FFCtrl�L�[����������Ԃ�";
		mes "Enter�L�[������^000000��";
		mes "�p�[�e�B�����o�[�ւ�";
		mes "��b�ɂȂ�܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]���l�ɁA�����̍ۂ�";
		mes "^0000FFAlt�L�[����������Ԃ�";
		mes "Enter�L�[������^000000��";
		mes "�M���h�����o�[�ւ�";
		mes "��b�ƂȂ�܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]�L�[�������ȊO�ɂ�";
		mes "�������e�̑O��";
		mes "�u^0000FF%^000000�v�����邱�Ƃ�";
		mes "�p�[�e�B�����o�[�ւ�";
		mes "��b�Ƃ��Ĕ������邱�Ƃ��ł��܂��]";
		mes "�]�u^0000FF%^000000�v�͔��p�ł̓��͂ƂȂ�܂��]";
		next;
		mes "[��b�̎d���̃y�[�W]";
		mes "�]���l�ɔ����̑O��";
		mes "�u^0000FF$^000000�v�����邱�ƂŁA";
		mes "�M���h�����o�[�ւ�";
		mes "��b�Ƃ��Ĕ������邱�Ƃ��ł��܂��]";
		mes " ";
		mes "�]�u^0000FF$^000000�v�͔��p�ł̓��͂ƂȂ�܂��]";
		close;
	case 2:
		mes "[�퓬�̎d���y�[�W]";
		mes "�]�����X�^�[�ւ̍U����";
		mes "�U�����郂���X�^�[��";
		mes "���N���b�N���邱�ƂŁA";
		mes "�s�����Ƃ��ł��܂��]";
		mes "�]�܂��A^0000FFCtrl�L�[^000000�𓯎��ɉ������ƂŁA";
		mes "�I�[�g���[�h�ɂȂ�܂��]";
		next;
		mes "[�퓬�̎d���y�[�W]";
		mes "�]��b�E�B���h�E����^0000FF�w/nc�x^000000�܂��́w/noctr�x��";
		mes "���͂��Ĕ�������ƁA";
		mes "Ctrl�L�[����������";
		mes "��ɃI�[�g���[�h��";
		mes "�؂�ւ��Ă������Ƃ��ł��܂��]";
		close;
	case 3:
		mes "[������̃y�[�W]";
		mes "�]��{�X�L�����x����";
		mes "Lv3�ƂȂ邱�ƂŁA���邱�Ƃ�";
		mes "�ł���悤�ɂȂ�܂��]";
		mes "�]^0000FFInsert�L�[^000000���������Ƃ�";
		mes "����A���̓����";
		mes "�s�����Ƃ��ł��܂��B";
		next;
		mes "[������̃y�[�W]";
		mes "�]��������Ԃ̎��ɂ�";
		mes "HP��SP�̎��R�񕜑��x���������܂��]";
		close;
	case 4:
		mes "[���_�ύX�̎d���̃y�[�W]";
		mes "�]�}�E�X�̉E�N���b�N�����������A";
		mes "���E�Ƀ}�E�X�𓮂����ƁA";
		mes "���_�̕ύX���ł��܂��]";
		next;
		mes "[���_�ύX�̎d���̃y�[�W]";
		mes "�]�܂��A���_��ύX������ԂŁA";
		mes "�}�E�X��^0000FF�E�{�^����";
		mes "�_�u���N���b�N^000000����ƁA";
		mes "���_�����̏�Ԃ֖߂����Ƃ�";
		mes "�ł��܂��]";
		next;
		mes "[���_�ύX�̎d���̃y�[�W]";
		mes "�]�������A�����Ȃǂ�";
		mes "����̏ꏊ�ł�";
		mes "�E�̃_�u���N���b�N��";
		mes "���_���ύX����Ȃ��ꏊ��";
		mes "����܂��]";
		next;
		mes "[�}�E�X����]";
		mes "�]�E�{�^�������������邱�ƂŁA";
		mes "�J�[�\�������E�̖��̌`��";
		mes "�ω����܂��B";
		mes "���̏�ԂŃ}�E�X���ړ��������";
		mes "���_��ύX���邱�Ƃ��o���܂��]";
		next;
		mes "[���_�ύX�̎d���̃y�[�W]";
		mes "�]^0000FF�wCtrl+�E�{�^���x^000000��";
		mes "�L�����N�^�[��";
		mes "�Y�[���C�����邱�Ƃ��o���܂��]";
		next;
		mes "[���_�ύX�̎d���̃y�[�W]";
		mes "�]^0000FF�wShift+�E�{�^���x^000000��";
		mes "���_�̊p�x��";
		mes "�ύX���邱�Ƃ��o���܂��B";
		mes "���̍�^0000FF�wCtrl�L�[�x^000000��";
		mes "�����ɉ������ƂŁA���傫��";
		mes "�p�x��ύX���邱�Ƃ��o���܂��]";
		next;
		mes "[���_�ύX�̎d���̃y�[�W]";
		mes "�]���_�̊g��k����";
		mes "^0000FF�}�E�X�̃z�C�[�����㉺��";
		mes "������^000000���Ƃł��s�����Ƃ��ł��܂��]";
		close;
	case 5:
		mes "[�V���[�g�J�b�g�̎g����]";
		mes "�]�V���[�g�J�b�g�E�B���h�E��";
		mes "^0000FFF12�L�[^000000���������Ƃ�";
		mes "�\�������邱�Ƃ��ł��܂��]";
		mes "�]�E�B���h�E�̕\������";
		mes "3�̃V���[�g�J�b�g�E�B���h�E��";
		mes "�؂�ւ��܂��]";
		next;
		mes "[�V���[�g�J�b�g�̎g����]";
		mes "�]�V���[�g�J�b�g�E�B���h�E�ɂ�";
		mes "����A�C�e����X�L���A";
		mes "�����i��o�^���邱�Ƃ��ł��܂��]";
		mes "�]�o�^��A^000000F1�`F9�L�[^000000�܂ł�";
		mes "�L�[���������ƂŁA�o�^�������̂�";
		mes "�g�p���邱�Ƃ��ł��܂��]";
		next;
		mes "[�V���[�g�J�b�g�̎g����]";
		mes "�]�V���[�g�J�b�g�������A�C�e���A";
		mes "�X�L���A�����i�̃A�C�R����";
		mes "^0000FF�V���[�g�J�b�g�E�B���h�E��";
		mes "�h���b�O^000000���邱�ƂŁA";
		mes "�o�^���邱�Ƃ��ł��܂��]";
		next;
		mes "[�V���[�g�J�b�g�̎g����]";
		mes "�]���Օi�ƂȂ�񕜃A�C�e���Ȃǂ�";
		mes "�V���[�g�J�b�g�E�B���h�E��";
		mes "�o�^���A�{�^����A�ł��Ȃ���";
		mes "�񕜂���Ƒ�ϕ֗��ł��]";
		close;
	default:
		mes "["+ strcharinfo(0) +"]";
		mes "�i�������ׂ邱�Ƃ͂Ȃ����ȁB�j";
		close;
	}
OnInit:
	if(strnpcinfo(2)=="func") end;
OnTimer3000:
	misceffect 543;
	initnpctimer;
}
ac_library.gat,110,108,0	duplicate(����m�[�g#func)	����m�[�g#_1	111
ac_library.gat,107,108,0	duplicate(����m�[�g#func)	����m�[�g#_2	111
ac_cl_room.gat,45,62,4	duplicate(����m�[�g#func)	����m�[�g#3	111
ac_cl_room.gat,33,47,4	duplicate(����m�[�g#func)	����m�[�g#4	111
ac_cl_room.gat,55,44,4	duplicate(����m�[�g#func)	����m�[�g#4_1	111

ac_cl_room.gat,37,32,4	script	�}�X�^�[�E�X�k�X	51,{
	function GetBeginnerEquip;
	if(AC_PASSPORT<2){
		mes "[�}�X�^�[�E�X�k�X]";
		mes "��H�N�͂܂��A�J�f�~�[�ł�";
		mes "���w�葱����";
		mes "�������Ă��Ȃ��悤���ˁB";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�܂��́A^FF0000�u�G�[������v^000000��";
		mes "�Ƃ���œ��w�葱����";
		mes "���܂���񂾁B";
		close;
	}
	if(checkquest(201036)) {
		mes "�]�j�͂Ȃɂ��Z�������ł���]";
		next;
		mes "�]�C���t�H���[�V�����]";
		//mes "�@^FF00002015�N5��26��";
		//mes "�@��������e�i���X�ȑO��";
		//mes "�@�u�������퓬���́v��";
		//mes "�@�󂯎���Ă���ꍇ�A";
		mes "�@�������NPC��";
		mes "�@���p���邱�Ƃ��ł��܂���]";
		close;
	}
	mes "[�}�X�^�[�E�X�k�X]";
	// ���A���򖢒���
	if(gettime(3) >= 5 && gettime(3) <= 10)
		mes "�₟�A���͂悤�B";
	else if(gettime(3) >= 11 && gettime(3) <= 17)
		mes "�₟�A����ɂ��́B";
	else
		mes "�₟�A����΂�́B";
	next;
	if(Upper == UPPER_HIGH || getbaseclass(Class) > CLASS_DC || Job >= Job_RuneKnight) {
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�`���҂Ƃ��ď\����";
		mes "�������Ă���N�ɂ�";
		mes "�l�̓����͕K�v�Ȃ����낤�B";
		mes "�l���Ƃ͌ǓƂȂ��̂��c�c";
		mes "�ǓƂ����炱���A���ԂƋ��ɕ��ގ���";
		mes "�Ȃɂ��f���炵���̂��I";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�M���h�ɓ���̂��������낤�B";
		mes "�����m�炸�̑���ƂЂƎ�";
		mes "���ɕ��ނ̂��������낤�c�c";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���ꂩ��̌N�̓���";
		mes "�f���炵�����ɂȂ鎖��";
		mes "����Ă����B";
		close;
	}
	if(AC_PASSPORT == 2) {
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���߂܂��āB";
		mes "�l�̖��̓X�k�X�c�c�c";
		mes "�}�X�^�[�E�X�k�X�ƌĂ�ł���B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�܂��́c�c�N�ׂ̈�";
		mes "^0000FF���S�җp�|�[�V����^000000��p�ӂ����񂾁B";
		mes "�ʂ͏��Ȃ����A�N�̏����ɂȂ��";
		mes "�Ǝv���ĂˁB";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "HP�������Ċ�Ȃ��Ȃ�����";
		mes "������g���ĉ񕜂���񂾁B";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@^FF0000�}�X�^�[�E�X�k�X����";
		mes "�@�񋟂���鏉�S�җp�|�[�V����";
		mes "�@�̒񋟊��Ԃ�";
		mes "�@2�T�ԂƂȂ�܂��]";
		//setquest 117475;
		//compquest 117475;
		setquest 117480;
		set AC_PASSPORT,3;
		next;
	}
	if(checkquest(117480)) {
		if(checkquest(117480)&2) {
			mes "�]�C���t�H���[�V�����]";
			mes "�@���S�җp�|�[�V�����񋟊J�n����";
			mes "�@2�T�Ԍo�߂����̂ŁA";
			mes "�@���S�җp�|�[�V�����̔z�z��";
			mes "�@�I���ƂȂ�܂��]";
			delquest 117480;
			delquest 117470;
			next;
		}
		else {
			if(!checkquest(117470) || checkquest(117470)&2) {
				if(MaxWeight - Weight < 1000) {
					mes "[�}�X�^�[�E�X�k�X]";
					mes "�c�c������Ɖו���";
					mes "�d������݂������ˁB";
					mes "�ו��𐮗����āA^FF0000�����d�ʂ�";
					mes "^FF0000���炵��^000000�����ŁB";
					mes "���߂ď��S�җp�|�[�V������";
					mes "�n���Ă������B";
				}
				else if(checkitemblank() < 3) {
					mes "[�}�X�^�[�E�X�k�X]";
					mes "�c�c������Ɖו���";
					mes "��������݂������ˁB";
					mes "�ו��𐮗����āA^FF0000������ސ���";
					mes "^FF0000���炵��^000000�����ŁB";
					mes "���߂ď��S�җp�|�[�V������";
					mes "�n���Ă������B";
				}
				else {
					setquest 117470;
					// �����򖢒���
					if(BaseLevel < 30)
						getitem 569, 100;
					else if(BaseLevel < 50)
						getitem 569, 200;
					else if(BaseLevel < 70)
						getitem 569, 300;
					else if(BaseLevel < 90)
						getitem 569, 500;
					else
						getitem 569, 1000;
					mes "[�}�X�^�[�E�X�k�X]";
					mes "�������Ԃ͂����邯��";
					mes "�܂��p�ӂ��Ă�����B";
					mes "�����n���邩�́A";
					mes "�N�G�X�g�E�B���h�E���m�F";
					mes "���Ă�����B";
				}
			}
			else {
				mes "[�}�X�^�[�E�X�k�X]";
				mes "���S�җp�|�[�V�����͂܂�";
				mes "�������Ȃ񂾁B";
				mes "�����n���邩�́A";
				mes "�N�G�X�g�E�B���h�E���m�F";
				mes "���Ă�����B";
			}
			next;
		}
	}
	else {
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�`���͏��������H";
		next;
	}
	mes "[�}�X�^�[�E�X�k�X]";
	mes "���āA���ꂶ�Ⴀ�c�c";
	next;
	if(select("�A�C�e������","��������") == 2) {
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���������H";
		mes "�܂�����Ƃ����B";
		close;
	}
	mes "[�}�X�^�[�E�X�k�X]";
	mes "�A�C�e���������ˁB";
	mes "�N�������ł���̂́c�c";
	next;
	if(AC_BEGINNER_EQUIP == 12) {
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�`�P�b�g���Ȃ��悤������A";
		mes "�N�ɂ���������̂�";
		mes "�Ȃ��������ˁc�c";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���ꂾ���̎��͂�������";
		mes "JobLv��50�ɒB���Ă���̂Ȃ�";
		mes "�N�͎��̃X�e�[�W�ɐi��";
		mes "���������񂾂낤�ˁB";
		next;
		if(countitem(25020) == 0) {
			mes "[�}�X�^�[�E�X�k�X]";
			mes "���������΁A�N��";
			mes "�u���Ə؏��v��";
			mes "�����Ă��Ȃ��悤���ˁB";
			mes "���J���̃��x���A�b�v";
			mes "�{�b�N�X������Ȃ�";
			mes "�J���Ă����Ƃ�����B";
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes "���āA�N�����悯���";
			mes "�u���e�E�X�V���v�v�Ƃ���";
			mes "�l���̂Ƃ���ֈē����悤�B";
			mes "�����Łu�]���v�̎葱����";
			mes "�i�ނ��Ƃ��\�ƂȂ�B";
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�葱�����s���ɂ�";
			mes "^FF00001,285,000Zeny^000000���K�v��";
			mes "�Ȃ�̂ŁA���ӂ��Ă�����B";
		}
		else {
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�N�����悯���";
			mes "�u���e�E�X�V���v�v�Ƃ���";
			mes "�l���̂Ƃ���ֈē����悤�B";
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�����Łu���Ə؏��v��";
			mes "�n���Ζ����Łu�]���v��";
			mes "�葱���ɐi�ނ��Ƃ�";
			mes "�\�ƂȂ�B";
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�u���Ə؏��v���Ȃ�����";
			mes "���܂��Ɓu�]���v�̎葱����";
			mes "^FF00001,285,000Zeny^000000���K�v��";
			mes "�Ȃ�̂ŁA���ӂ��Ă�����B";
		}
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���ꂶ��A";
		mes "�u���e�E�X�V���v�v�ւ��������H";
		next;
		if(select("�͂�","�܂����x�ɂ���") == 2) {
			mes "[�}�X�^�[�E�X�k�X]";
			mes "���������H";
			mes "�܂�����Ƃ����B";
			close;
		}
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���܂܂ŋ��������Ƃ�";
		mes "�Y�ꂸ�ɂ��ꂩ���";
		mes "�`�����撣���Ăق����I";
		close2;
		warp "yuno_in02.gat",90,162;
		end;
	}
	if(countitem(25018) < 1 && countitem(25019) < 1) {
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�`�P�b�g�������Ă��Ȃ�";
		mes "�݂������ˁB";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���x�����グ��";
		mes "���x���A�b�v�{�b�N�X��";
		mes "�J������A�`�P�b�g��";
		mes "��ɓ���񂾁B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�撣���ĂˁI";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@^FF0000�A�C�e��������";
		mes "�@�E�ҁA�e�R���L�b�h�A";
		mes "�@�\�E�������J�[�A�����A";
		mes "�@�K���X�����K�[�A";
		mes "�@�X�[�p�[�m�[�r�X������";
		mes "�@���]���E�Ƃ݂̂̌����ł��B";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@�܂��A�]����̐E�Ƃł�";
		mes "�@�����͎󂯕t���Ă��܂���̂�";
		mes "�@�����ӂ��������B";
		close;
	}
	if(Job == Job_Novice) {
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�`�P�b�g�͎����Ă��邯��ǁc�c";
		mes "�܂��̓e�R���L�b�h������";
		mes "�����ꂩ�̈ꎟ�E��";
		mes "�]�E���Ă���c�c���ˁB";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�]�E������A�܂������ŁB";
		mes "���̎����߂āA�`�P�b�g�ƃA�C�e����";
		mes "�������Ă����悤�B";
		close;
	}
	switch(AC_BEGINNER_EQUIP) {
	case 0:
		if(countitem(25019) == 0) close;

		mes "[�}�X�^�[�E�X�k�X]";
		mes "[�ߑ�] �r�M�i�[�X";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,1;
		delitem 25019, 1;
		getitem 20307, 1;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "[�ߑ�] �r�M�i�[�X��";
		mes "�`�����͂��߂Ă܂��Ȃ�";
		mes "�`���҂ɑ����Ă���";
		mes "�����A�C�e���ł���";
		mes "�`���҃r�M�i�[�̏؂ł�����B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���̖X�q�́A";
		mes "�������Ă��邾����";
		mes "�l�X�ȃX�e�[�^�X��";
		mes "�������Ă����B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�܂��A����𑕔����Ă����";
		mes "���̏n�������`���҂�";
		mes "���݂��Ă���邱�Ƃ�";
		mes "���邾�낤����A�������";
		mes "�g�ɒ����Ă����Ă���B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����Ɓc";
		mes "[�ߑ�] �r�M�i�[�X��";
		mes "����������Ԃ�";
		mes "�X�L���u���}�蓖�v��";
		mes "�g���΁A�l�̏���";
		mes "�߂��Ă��邱�Ƃ��o����񂾁B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "��������Ύg���Ƃ����B";
		mes "�l�͂��ł�������";
		mes "���邩��ˁB";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@^FF0000�K�����Ă���X�L�����m�F�A";
		mes "�@�g�p����ꍇ��";
		mes "�@��{����ʂ́uSkill�v��������";
		mes "�@�uAlt + S�v�ŃX�L���E�B���h�E��";
		mes "�@�Ăяo�����Ƃ��ł��܂��B";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@[[�ߑ�] �r�M�i�[�X]�́A";
		mes "�@���̐E�Ƃւ̓]�E�̍ۂ�";
		mes "�@����������Ē����܂��B";
		mes "�@�E�ҁA�K���X�����K�[";
		mes "�@�e�R���L�b�h";
		mes "�@�X�[�p�[�m�[�r�X�B";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@����ȊO�̐E�Ƃ�";
		mes "�@�u�]���v����";
		mes "�@�u3���E�]�E�v�̍ۂ�";
		mes "�@��������Ē����܂��B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�Ƃ���ŁA���̕����ɂ���l�B����";
		mes "�u�K�͑S���󂯂������H";
		mes "�����󂯂ĂȂ��悤�ł����";
		mes "������Ǝ󂯂Ă����񂾂�B";
		next;
		break;
	case 1:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		break;
	case 2:
		if(countitem(25019) == 0) close;

		mes "[�}�X�^�[�E�X�k�X]";
		mes "�t�[�h[0]";
		mes "�T���_��[0]";
		mes "�K�[�h[0]";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,3;
		delitem 25019, 1;
		getitem 2501, 1;
		getitem 2401, 1;
		getitem 2101, 1;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���ܓn�����h���";
		mes "�������邱�Ƃŏ����Ȃ�Ƃ�";
		mes "�����X�^�[�����";
		mes "�_���[�W���y������";
		mes "�������̂�����A";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�Y�ꂸ�ɑ�������";
		mes "�悤�ɂ��Ă���B";
		if(checkre()) {
			mes "�������A���ł���";
			mes "�u�K�[�h�v�͍U�����x��";
			mes "�x���Ȃ�f�����b�g��";
			mes "���邩�璍�ӂ��Ă���B";
		}
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�܂��͎����ɑ������Ă݂�";
		mes "�g�����肪�����悤�ł����";
		mes "�����ɑ�������K�v�͂Ȃ����B";
		next;
		break;
	case 3:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����n���������";
		mes "�ȑO�n�������̂���";
		mes "�U���͂��������ꂽ���킾�B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���܏������Ă��镐����";
		mes "�U���͂������悤�ł����";
		mes "����g���Ă݂Ăق����B";
		next;
		break;
	case 4:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�������ˁc�c";
			mes "�ǂꂪ�~�������A�I��ł����B";
			next;
			switch(select("�����t�F�E�X�Z�b�g","�w�����[�h�Z�b�g�@","�w�����[�h�Z�b�g�A")) {
			case 1:
				mes "[�}�X�^�[�E�X�k�X]";
				mes "�A�R���C�g�A�}�W�V�����n��";
				mes "��q�ɂ����߂̖h��ˁB";
				setarray '@itemid,5126,2518,2648,2649;
				break;
			case 2:
				mes "[�}�X�^�[�E�X�k�X]";
				mes "�O�q�ɂ����߂̖h��ˁB";
				mes "HP��SP������������";
				mes "�����X�^�[����󂯂�_���[�W��";
				mes "�y��������ʂ������Ă��邼�B";
				setarray '@itemid,5123,2353,2517,2418;
				break;
			case 3:
				mes "[�}�X�^�[�E�X�k�X]";
				mes "�O�q�ɂ����߂̖h��ˁB";
				mes "�������邱�Ƃŉ��͂�";
				mes "�񕜃A�C�e���̉񕜌��ʂ�";
				mes "����������ʂ������Ă��邼�B";
				setarray '@itemid,5123,2353,2516,2417;
				break;
			}
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes getitemname('@itemid[0])+ "[" +getiteminfo('@itemid[0],10)+ "]";
			mes getitemname('@itemid[1])+ "[" +getiteminfo('@itemid[1],10)+ "]";
			mes getitemname('@itemid[2])+ "[" +getiteminfo('@itemid[2],10)+ "]";
			mes getitemname('@itemid[3])+ "[" +getiteminfo('@itemid[3],10)+ "]";
			mes "����ɂ��邩���H";
			next;
			if(select("������","�͂�") == 2) {
				break;
			}
		}
		mes "[�}�X�^�[�E�X�k�X]";
		mes getitemname('@itemid[0])+ "[" +getiteminfo('@itemid[0],10)+ "]";
		mes getitemname('@itemid[1])+ "[" +getiteminfo('@itemid[1],10)+ "]";
		mes getitemname('@itemid[2])+ "[" +getiteminfo('@itemid[2],10)+ "]";
		mes getitemname('@itemid[3])+ "[" +getiteminfo('@itemid[3],10)+ "]";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,5;
		delitem 25019, 1;
		getitem '@itemid[0], 1;
		getitem '@itemid[1], 1;
		getitem '@itemid[2], 1;
		getitem '@itemid[3], 1;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����n�����h���";
		mes "�S�đ������邱�Ƃ�";
		mes "����Ȍ��ʂ����������";
		mes "�������h��Ȃ񂾁I";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "^FF0000�Z�b�g�����́A";
		mes "�S�Ă��������Ԃ�";
		mes "�������Ȃ���";
		mes "���ʂ𔭊����Ȃ�^000000�̂�";
		mes "��������Ƃ���";
		mes "���̂��Ƃ�Y��Ȃ��悤�ɂˁB";
		next;
		break;
	case 5:
		if(countitem(25018) == 0) close;

		GetBeginnerEquip;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����n���������";
		mes "�ȑO�n�������̂��";
		mes "�X�ɋ������ꂽ���킾�B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����ɂ���Ă�";
		mes "�X�e�[�^�X��X�L����";
		mes "�������Ă����";
		mes "��������̂�";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "���܏������Ă��镐����";
		mes "�U���͂������悤�ł����";
		mes "����g���Ă݂Ăق����B";
		next;
		break;
	case 6:
		if(countitem(25019) == 0) close;

		switch(getbaseclass(Class,2)) {
		case CLASS_KN: set '@itemid,5950; break;
		case CLASS_CR: set '@itemid,2606; break;
		case CLASS_WZ: set '@itemid,5951; break;
		case CLASS_SA: set '@itemid,5956; break;
		case CLASS_HT: set '@itemid,5952; break;
		case CLASS_BA: set '@itemid,5958; break;
		case CLASS_DC: set '@itemid,5957; break;
		case CLASS_PR: set '@itemid,5953; break;
		case CLASS_MO: set '@itemid,5959; break;
		case CLASS_BS: set '@itemid,5954; break;
		case CLASS_AM: set '@itemid,5960; break;
		case CLASS_AS: set '@itemid,5955; break;
		case CLASS_RG: set '@itemid,5961; break;
		}
		if('@itemid == 0) {	// ������
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�܂�2���E�ɓ]�E���Ă��Ȃ�";
			mes "�N�ɂ���������̂�";
			mes "�Ȃ��������ˁc�c";
			close;
		}
		mes "[�}�X�^�[�E�X�k�X]";
		mes getitemname('@itemid);
		mes "���N�ɑ݂��Ă����悤�B";
		next;
		set AC_BEGINNER_EQUIP,7;
		delitem 25019, 1;
		getitem2 '@itemid,1,1,0,0,0,0,0,0,1209600;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����n�����h���";
		mes "�������邱�Ƃ�";
		mes "����Ȍ��ʂ𔭊�����";
		mes "���ʂȖh��B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�������ʂ����Ȃ�";
		mes "������Ă���̂�";
		mes "����̓����^���Ƃ���";
		mes "�������Ŗh���n���Ă���B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����n�����h���";
		mes "���܂����2�T�Ԃ�";
		mes "�����I�ɏ��ł���̂�";
		mes "�܂��͑�������";
		mes "���̌��ʂ������Ă݂Ăق����B";
		next;
		break;
	case 7:
		if(countitem(25019) == 0) close;

		mes "[�}�X�^�[�E�X�k�X]";
		mes "�C�������O[1]";
		mes "�l�b�N���X[1]";
		mes "���U���I[1]";
		mes "�O���[�u[1]";
		mes "�u���[�`[1]";
		mes "�����O[1]";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,8;
		delitem 25019, 1;
		getitem 2622, 1;
		getitem 2623, 1;
		getitem 2626, 1;
		getitem 2624, 1;
		getitem 2625, 1;
		getitem 2621, 1;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����n�����h���";
		mes "�A�N�Z�T���[�Ƃ���";
		mes "�ꏊ�ɑ����ł���";
		mes "�h��B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�������邱�Ƃ�";
		mes "�X�e�[�^�X���㏸������";
		mes "���ʂ�����̂�";
		mes "�N�̍D�݂Ŏg���Ă݂Ăق����B";
		next;
		break;
	case 8:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�������ˁc�c";
			mes "�ǂꂪ�~�������A�I��ł����B";
			next;
			switch(select("�G�x�V���̂��˂�[1]","�N���C�g�X��n�̗􂯖�[1]","���V�E�X�ΎR�̌�����[1]","�V���s�j�n�C�̋���[1]")) {
			case 1:
				set '@elem$,"��";
				set '@itemid,2349;
				break;
			case 2:
				set '@elem$,"�n";
				set '@itemid,2351;
				break;
			case 3:
				set '@elem$,"��";
				set '@itemid,2345;
				break;
			case 4:
				set '@elem$,"��";
				set '@itemid,2347;
				break;
			}
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�Z��" +'@elem$+ "�������t�^����Ă���";
			mes "�h��ˁB";
			mes '@elem$+ "�����U�������Ă���";
			mes "�_���W������t�B�[���h��";
			mes "�L������B";
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "����ɂ��邩���H";
			next;
			if(select("������","�͂�") == 2) {
				break;
			}
		}
		mes "[�}�X�^�[�E�X�k�X]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,9;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	case 9:
		if(countitem(25019) == 0) close;

		mes "[�}�X�^�[�E�X�k�X]";
		mes "���C�[�[�̐Ԃ��C[1]";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,10;
		delitem 25019, 1;
		getitem 22068, 1;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "����n�����h���";
		mes "�������邱�Ƃ�";
		mes "[���S�җp�|�[�V����]��";
		mes "�񕜌��ʂ����߂邱�Ƃ�";
		mes "�ł���h��B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�܂����̖h���";
		mes "���B���Ă������Ƃ�";
		mes "[���S�җp�|�[�V����]��";
		mes "�񕜌��ʂ��X��";
		mes "���߂邱�Ƃ��ł��邼�B";
		next;
		mes "[�}�X�^�[�E�X�k�X]";
		mes "�������A���B���d�˂Ă�����";
		mes "���B�Ɏ��s���邱�Ƃ�������";
		mes "�h��̂��̂�������";
		mes "���܂����Ƃ����邩��";
		mes "���ӂ���悤�ɂ��Ăق����B";
		next;
		break;
	case 10:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�������ˁc�c";
			mes "�ǂꂪ�~�������A�I��ł����B";
			next;
			switch(select("�V�����[���V�[���h[1]","�t�����V�[���h[1]","�\���V�[���h[1]","�����@���V�[���h[1]","�\���u���V�[���h[1]","�����[���V�[���h[1]","�G�X�v���V�[���h[1]","�����~�G�[���V�[���h[1]","�v���]���V�[���h[1]")) {
			case 1: set '@elem$,"��";   set '@race$,"����"; set '@itemid,2159; break;
			case 2: set '@elem$,"��";   set '@race$,"����"; set '@itemid,2163; break;
			case 3: set '@elem$,"�n";   set '@race$,"���L"; set '@itemid,2165; break;
			case 4: set '@elem$,"��";   set '@race$,"����"; set '@itemid,2194; break;
			case 5: set '@elem$,"��";   set '@race$,"�s��"; set '@itemid,2164; break;
			case 6: set '@elem$,"�s��"; set '@race$,"�l��"; set '@itemid,2158; break;
			case 7: set '@elem$,"�O";   set '@race$,"�V�g"; set '@itemid,2175; break;
			case 8: set '@elem$,"��";   set '@race$,"��";   set '@itemid,2174; break;
			case 9: set '@elem$,"��";   set '@race$,"�A��"; set '@itemid,2167; break;
			}
			mes "[�}�X�^�[�E�X�k�X]";
			mes '@elem$+ "���������X�^�[����󂯂�";
			mes "�_���[�W�������y�����A";
			mes '@race$+ "�^�����X�^�[����󂯂�";
			mes "�_���[�W������������";
			mes "�����ˁB";
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "����ɂ��邩���H";
			next;
			if(select("������","�͂�") == 2) {
				break;
			}
		}
		mes "[�}�X�^�[�E�X�k�X]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,11;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	case 11:
		if(countitem(25019) == 0) close;

		while(1) {
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�������ˁc�c";
			mes "�ǂꂪ�~�������A�I��ł����B";
			next;
			switch(select("�V�����[���}���g[1]","�t�����}���g[1]","�\���}���g[1]","�����@���}���g[1]","�\���u���}���g[1]","�����[���}���g[1]","�G�X�v���}���g[1]","�����~�G�[���}���g[1]","�v���]���}���g[1]")) {
			case 1: set '@elem$,"��";   set '@race$,"����"; set '@itemid,2596; break;
			case 2: set '@elem$,"��";   set '@race$,"����"; set '@itemid,2593; break;
			case 3: set '@elem$,"�n";   set '@race$,"���L"; set '@itemid,20701; break;
			case 4: set '@elem$,"��";   set '@race$,"����"; set '@itemid,20750; break;
			case 5: set '@elem$,"��";   set '@race$,"�s��"; set '@itemid,2595; break;
			case 6: set '@elem$,"�s��"; set '@race$,"�l��"; set '@itemid,2598; break;
			case 7: set '@elem$,"�O";   set '@race$,"�V�g"; set '@itemid,20716; break;
			case 8: set '@elem$,"��";   set '@race$,"��";   set '@itemid,20705; break;
			case 9: set '@elem$,"��";   set '@race$,"�A��"; set '@itemid,20708; break;
			}
			mes "[�}�X�^�[�E�X�k�X]";
			mes '@elem$+ "���������X�^�[����󂯂�";
			mes "�_���[�W�������y�����A";
			mes '@race$+ "�^�����X�^�[����󂯂�";
			mes "�_���[�W������������";
			mes "�}���g���ˁB";
			next;
			mes "[�}�X�^�[�E�X�k�X]";
			mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
			mes "����ɂ��邩���H";
			next;
			if(select("������","�͂�") == 2) {
				break;
			}
		}
		mes "[�}�X�^�[�E�X�k�X]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "���N�ɂ����悤�B";
		next;
		set AC_BEGINNER_EQUIP,12;
		delitem 25019, 1;
		getitem '@itemid, 1;
		break;
	}
	mes "[�}�X�^�[�E�X�k�X]";
	mes "�܂��`�P�b�g�������Ă���Ȃ�";
	mes "������x�b�������Ă�����B";
	next;
	mes "�]�C���t�H���[�V�����]";
	mes "�@^FF0000�A�C�e��������";
	mes "�@���]�����݂̂̌����ł��B";
	mes "�@�]����͎󂯕t���Ă��܂���̂�";
	mes "�@�������Y��ɂ����ӂ��������]";
	close;

	function	GetBeginnerEquip	{
		switch(AC_BEGINNER_EQUIP) {
		case 1:
			switch(getbaseclass(Class)) {
			case CLASS_SM: set '@itemid,1107; break;
			case CLASS_MG: set '@itemid,1601; break;
			case CLASS_AC: set '@itemid,1704; break;
			case CLASS_AL: set '@itemid,1504; break;
			case CLASS_MC: set '@itemid,1301; break;
			case CLASS_TF: set '@itemid,1207; break;
			}
			break;
		case 3:
			switch(getbaseclass(Class)) {
			case CLASS_SM: set '@itemid,1122; break;
			case CLASS_MG: set '@itemid,1607; break;
			case CLASS_AC: set '@itemid,1710; break;
			case CLASS_AL: set '@itemid,1519; break;
			case CLASS_MC: set '@itemid,1354; break;
			case CLASS_TF: set '@itemid,1216; break;
			}
			break;
		case 5:
			switch(getbaseclass(Class)) {
			case CLASS_SM:
				if(getbaseclass(Class,2) == CLASS_KN) { set '@itemid,1163; }
				else if(getbaseclass(Class,2) == CLASS_CR) { set '@itemid,1410; }	// ���m�F
				break;
			case CLASS_MG:
				if(getbaseclass(Class,2) == CLASS_WZ) { set '@itemid,1619; }
				else if(getbaseclass(Class,2) == CLASS_SA) { set '@itemid,1551; }	// ���m�F
				break;
			case CLASS_AC:
				if(getbaseclass(Class,2) == CLASS_HT) { set '@itemid,1718; }
				else if(getbaseclass(Class,2) == CLASS_BA) { set '@itemid,1907; }
				else if(getbaseclass(Class,2) == CLASS_DC) { set '@itemid,1956; }	// ���m�F
				break;
			case CLASS_AL:
				if(getbaseclass(Class,2) == CLASS_PR) { set '@itemid,1625; }
				else if(getbaseclass(Class,2) == CLASS_MO) { set '@itemid,1807; }	// ���m�F
				break;
			case CLASS_MC:
				if(getbaseclass(Class,2) == CLASS_BS) { set '@itemid,1360; }
				else if(getbaseclass(Class,2) == CLASS_AM) { set '@itemid,1119; }
				break;
			case CLASS_TF:
				if(getbaseclass(Class,2) == CLASS_AS) { set '@itemid,1360; }	// ���m�F
				else if(getbaseclass(Class,2) == CLASS_RG) { set '@itemid,1360; }	// ���m�F
				break;
			}
			break;
		}
		if('@itemid == 0) {	// ������
			mes "[�}�X�^�[�E�X�k�X]";
			mes "�܂�2���E�ɓ]�E���Ă��Ȃ�";
			mes "�N�ɂ���������̂�";
			mes "�Ȃ��������ˁc�c";
			close;
		}
		mes "[�}�X�^�[�E�X�k�X]";
		mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]";
		mes "���N�ɂ����悤�B";
		set AC_BEGINNER_EQUIP,AC_BEGINNER_EQUIP + 1;
		delitem 25018, 1;
		getitem '@itemid, 1;
		next;
		return;
	}

OnInit:
	waitingroom "�}�X�^�[�E�X�k�X",0;
	end;
}
