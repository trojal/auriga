//= Auriga Script ==============================================================
// Ragnarok Online Illusion of Frozen Quest Script	by refis
//= Registry ===================================================================
// IL_FROZEN_QUE -> 0�`9
//==============================================================================
ice_dun02.gat,150,11,1	script	#tofrozen	10237,{
	if(BaseLevel < 170) {
		mes "- 170���x�������̃L�����N�^�[��";
		mes "  �i���o���܂���B -";
		close;
	}
	mes "- ���_���ڂ��肵�Ă���B";
	mes "  �܂�Ŗ��̒��ɓ���݂������B -";
	next;
	if(select("�i������","��߂�") == 2) {
		mes "���͂�߂Ă������B";
		close;
	}
	warp "ice_d03_i.gat",149,24;
	end;
}

ice_d03_i.gat,149,19,1	script	#fromfrozen	10237,{
	mes "���̏ꏊ�ɖ߂邱�Ƃ��ł���B";
	mes "�ǂ����悤���ȁH";
	next;
	if(select("�߂�","�߂�Ȃ�") == 2) {
		mes "���͂�߂Ă������B";
		close;
	}
	warp "ice_dun02.gat",150,17;
	end;
}

ice_d03_i.gat,152,43,0	script	cine1#frozen	139,13,13,{
OnTouch:
	if(IL_FROZEN_QUE <= 2) {
		cloakoffnpc "�u���h#frozen01";
		cloakoffnpc "�W�F�C�X#frozen01";
	}
	else if(IL_FROZEN_QUE == 3 || IL_FROZEN_QUE == 8) {
		cloakoffnpc "�u���h#frozen01";
		cloakoffnpc "�W�F�C�X#frozen02";
	}
	else if(IL_FROZEN_QUE == 4 || IL_FROZEN_QUE == 9) {
		cloakoffnpc "�u���h#frozen02";
		cloakoffnpc "�W�F�C�X#frozen02";
	}
	else if(IL_FROZEN_QUE == 5) {
		if(checkquest(15115)) {
			if(checkquest(15115) & 2) {
				delquest 15115;
				cloakoffnpc "�u���h#frozen01";
				cloakoffnpc "�W�F�C�X#frozen01";
			}
			end;
		}
		cloakoffnpc "�u���h#frozen01";
		cloakoffnpc "�W�F�C�X#frozen01";
	}
	else if(IL_FROZEN_QUE <= 7) {
		cloakoffnpc "�u���h#frozen01";
		cloakoffnpc "�W�F�C�X#frozen01";
	}
	end;
}

ice_d03_i.gat,150,43,5	script	�u���h#frozen01	10036,{
	if(IL_FROZEN_QUE == 3 || IL_FROZEN_QUE == 8) {
		mes "[�u���h]";
		mes "�܂����{���ɉ󂹂�Ƃ́c�c";
		mes "�����W�F�C�X�I���v���H";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

ice_d03_i.gat,150,43,5	script	�u���h#frozen02	468,{
	end;
OnInit:
	cloakonnpc;
	end;
}

ice_d03_i.gat,155,43,3	script	�W�F�C�X#frozen01	10035,{
	if(IL_FROZEN_QUE == 0 || IL_FROZEN_QUE == 5) {
		if(IL_FROZEN_QUE == 5) {
			mes "^ff0000�ނ�͈ȑO�A�X����~�o�������Ȃ̂�";
			mes "�ǂ������󂩂܂��X�Ђ��ɂ���Ă���B^000000";
			next;
		}
		mes "[�W�F�C�X]";
		mes "�ӂ��c�c���̃o�J��Y�̏��ׂ�";
		mes "����Ȗڂɍ����āc�c�B";
		next;
		mes "[�u���h]";
		mes "������z����Ȃ����A�����B";
		mes "�܊p�����Ă�낤��";
		mes "��������L�ׂĂ�����̂�";
		mes "������������ȕ��ɂ���Ƃ́I";
		mes "������Q�҂����I";
		next;
		mes "[�W�F�C�X]";
		mes "�����̂ǂ������z�Ɍ����邩";
		mes "�S������������c�c�B";
		mes "�e�Ɋp�A��������ǂ������";
		mes "�E�o���邩���l���Ȃ�����ȁB";
		mes "���������c�c�B";
		next;
		emotion 28, "�W�F�C�X#frozen01";
		mes "[�u���h]";
		mes "���̕X�A�ŉ߂��Đg���������Ȃ��B";
		mes "��������������A";
		mes "��������o��͓̂�������ȁB";
		mes "�߂��ɏ����Ă��ꂻ���Ȑl�́c�c";
		mes "���I�����̌N�I";
		next;
		menu "���ł����H",-;
		mes "[�u���h]";
		mes "�N�ȊO�Ɏ��R�ɓ�����l�����邩�H";
		mes "���Ă̒ʂ�A�������͕X�Ђ��ɂ����";
		mes "���������Ă�񂾂�B";
		mes "���̂����Ȃ����̂����āH";
		mes "��������ƒ����Ȃ邩��";
		mes "�悸�͏����Ă���B";
		next;
		menu "�ǂ�����΂����H",-;
		mes "[�u���h]";
		mes "�f���炵�����₾�I";
		mes "���������Ă����ȁA�W�F�C�X!";
		next;
		mes "[�W�F�C�X]";
		mes "���ǁA���C���Ȃ̂��B";
		mes "�c�c�΂��g�������Ȃ��ȁB";
		next;
		mes "[�u���h]";
		mes "�΂��ƁH";
		mes "���͔M���̂����Ȃ񂾂�I";
		mes "�Ă����ʂ��������I";
		next;
		mes "[�W�F�C�X]";
		mes "�X��n�������x�̉΂Ȃ�";
		mes "���v����A�����B";
		mes "�����炳�A���ށc�c�V�����F��c�c�B";
		next;
		mes "[�W�F�C�X]";
		mes "���܂Ȃ����A���̕X�̓��A�ɂ���";
		mes "�y����̒�����^ff0000�������؂̎}^000000��";
		mes "�W�߂Ă���Ȃ����H";
		mes "10���炢�Ȃ炢�������ȋC������B";
		next;
		mes "[�u���h]";
		mes "�����c������2�l�Ƃ��Ď����邼�`�B";
		setquest 15110;
		if(IL_FROZEN_QUE == 5) {
			set IL_FROZEN_QUE,6;
			next;
			mes "^ff0000�ނ�͈ȑO���킵����b��";
			mes "�J��Ԃ��Ă���B";
			mes "�����Ă�����̂��Ƃ�";
			mes "�S�R�o���Ă��Ȃ��悤���B^000000";
			next;
			mes "^ff0000�΂��g���Ă�";
			mes "�ǂ��ɂ��Ȃ�Ȃ��̂͒m���Ă��邪�A";
			mes "�e�Ɋp�A�ނ�̊肢��";
			mes "������Ƃ��悤�B^000000";
			close;
		}
		set IL_FROZEN_QUE,1;
		close;
	}
	else if(IL_FROZEN_QUE == 1 || IL_FROZEN_QUE == 6) {
		if(countitem(25309) < 10) {
			mes "[�W�F�C�X]";
			mes "�������؂̎}��10�K�v���B";
			mes "���A���Ɋ������y���肪";
			mes "���锤������";
			mes "������T���Ă݂Ă���B";
			close;
		}
		delitem 25309,10;
		if(IL_FROZEN_QUE == 1) {
			set '@flag,0;
			chgquest 15110,15111;
			set IL_FROZEN_QUE,2;
		}
		else {
			set '@flag,rand(4);
			switch('@flag) {
			case 0: chgquest 15110,15111; break;
			case 1: chgquest 15110,15117; break;
			case 2: chgquest 15110,15118; break;
			case 3: chgquest 15110,15119; break;
			}
			set IL_FROZEN_QUE,7;
		}
		mes "[�W�F�C�X]";
		mes "�c�c�������؂̎}��";
		mes "�����Ă��Ă��ꂽ�̂��B";
		mes "���������΂��݂�";
		mes "���ȏЉ���܂��������ȁB";
		mes "���̓W�F�C�X�A�����Ă�����́c�c";
		next;
		mes "[�u���h]";
		if(IL_FROZEN_QUE == 1) {
			mes "�����c�c";
			mes "������2�l�Ƃ��Ď����邼�c�c�B";
		}
		else {
			mes "�����c������2�l�Ƃ��Ď����邼�c";
		}
		next;
		mes "[�W�F�C�X]";
		mes "�c�c�ӂ��A������̓u���h�B";
		mes "�N�̖��͉��Ƃ����H";
		next;
		menu strcharinfo(0)+"�ł��B",-;
		mes "[�W�F�C�X]";
		mes strcharinfo(0)+"�c�������O���B";
		mes "�悸�����Ă����������؂̎}��";
		mes "�΂�t���X��n�����Ă݂邩�B";
		mes "��ɂ����Ŏ����̂����������B";
		next;
		mes "[�u���h]";
		mes "���킟�����I���̈����߁I";
		mes "���͐�΂��Ȃ����I";
		mes "�����������E���I";
		next;
		mes "[�W�F�C�X]";
		mes "�c�܂������B�������Ɏ������B";
		mes "�������؂̎}�ɉ΂�t���āA";
		mes "���̋߂��ɒu���Ă���Ȃ����H";
		mes "�O�̂��߂ɐ�Ɍ����Ă�����";
		mes "�΂��ߕt���߂���Ȃ�B";
		next;
		mes "- ^ff0000�������؂̎}�ɉ΂�t�����B";
		mes "  ���΂炭�o������";
		mes "  �X�͗n����C�����Ȃ��B^000000 -";
		next;
		mes "[�W�F�C�X]";
		mes "���@�œ��点�����ׂ�";
		mes "�S�R�n���Ȃ��ȁB";
		mes "�u���h�A���O���ڂ����Ƃ��Ȃ���";
		mes "�������@���l���Ă݂�I";
		next;
		mes "[�u���h]";
		mes "�����c�c";
		mes "�N�����͓����ł��񂾂�B";
		mes "�X�ɂ͉΁B���ʂɍl����΂����Ȃ�B";
		mes "���������ɂ͔��z�̓]�����K�v���B";
		mes "�X���ǂ��ӂ������āH";
		mes "��ɂ͊���I�X�ɂ͕X���I";
		next;
		mes "[�u���h]";
		mes "�����ɂ��郂���X�^�[�̗�C��";
		mes "��肭���p�����";
		mes "�X�͍ӂ��U�邩���m��Ȃ��I";
		mes "�c�c�����B";
		next;
		mes "[�W�F�C�X]";
		mes "�c�c�������̏펯�n�Y���Ȕ��z��";
		mes "��������C��";
		mes "�ǂ����p������肾��H";
		next;
		mes "[�u���h]";
		mes "�����ċ����I";
		switch('@flag) {
		case 0:
			mes "�u���h�E���|�[�g�I";
			mes "�{��̃A�C�X�^�C�^���̊��I";
			next;
			mes "[�u���h]";
			mes "���̒����ɂ���";
			mes "�{��̃A�C�X�^�C�^����";
			mes "�{���o�̂悤�ɏ�����";
			mes "�������������X�^�[�������B";
			next;
			mes "[�u���h]";
			mes "�������A���̓��A��";
			mes "���������邱�Ƃ�";
			mes "�̂̕X�����݂�����";
			mes "�傫���Ȃ����炵���B";
			next;
			mes "[�u���h]";
			mes "���ꂶ��s�ւŊ�����ˁI";
			mes strcharinfo(0);
			mes "�N�́A�z��̑̂��y���Ȃ�悤";
			mes "�̂ɕt���Ă�X������Ă���B";
			break;
		case 1:
			mes "�u���h�E���|�[�g�I�{��̃Q�C�Y�e�B�̊��I";
			next;
			mes "[�u���h]";
			mes "���̒����ɂ��ƁA�{��̃Q�C�Y�e�B�͖{��";
			mes "�������傫���̕X�̋��l�������B";
			mes "�������A���̕X�̓��A�̂��Ƃ�";
			mes "�ǂ����悤���Ȃ��C�ɂȂ�A";
			mes "���A�ɓ����������ݒ���`�����񂾂񂾁B";
			next;
			mes "[�u���h]";
			mes "���̍ۂɎ񂪐܂�Ă��܂��A";
			mes "�����̑̂�T������";
			mes "���A�̒���f�r�������Ă�炵���B";
			next;
			mes "[�u���h]";
			mes "�Ȃ񂩕|���Ȃ����H���܂ɓ��A����";
			mes "�ʂ�߂���z������x";
			mes "�u���̑̂�Ԃ��`�v�ƌ����Ă�悤��";
			mes "���������c�c�����B";
			next;
			mes "[�u���h]";
			mes strcharinfo(0);
			mes "�N�́A����ȏ�z�炪";
			mes "�̂�T���K�v�̂Ȃ��悤��";
			mes "�����Ă����ė~�����B";
			break;
		case 2:
			mes "�u���h�E���|�[�g�I�{��̃X�m�E�A�[�̊��I";
			next;
			mes "[�u���h]";
			mes "���̒����ɂ���";
			mes "�{��̃X�m�E�A�[�͖{��";
			mes "�S�L���őf���ȓz���";
			mes "�������z�悭���A�����Ă����B";
			next;
			mes "[�u���h]";
			mes "�������N�����A��Ԃ��Ȃ�����";
			mes "���ɗ��Ă��܂��A����Ȍ�";
			mes "���A������U�肵��";
			mes "������U������悤�ɂȂ����炵���B";
			mes "�{���ɐS�ɂގ����c�c�B";
			next;
			mes "- �����𕷂��Ă�����A";
			mes "  ���ꂽ��Ńu���h�����߂�";
			mes "  �W�F�C�X�̎�����������ꂽ�B -";
			next;
			mes "[�u���h]";
			mes strcharinfo(0);
			mes "�N�́A�z�炪�܂�";
			mes "�f���ɂȂ��悤��";
			mes "�^���Ă���B";
			break;
		case 3:
			mes "�u���h�E���|�[�g�I";
			mes "�s���A�C�V�N���̊��I";
			next;
			mes "[�u���h]";
			mes "���̒����ɂ��ƁA";
			mes "���̕X�̓��A�ɂ���";
			mes "�ł��X���ɂ���";
			mes "�[���������񂾂���c�c";
			next;
			menu "�X���ɂǂ�Ȏ���H",-;
			mes "[�u���h]";
			mes "�ǂ�Ȏ������̂����āH";
			mes "����͂ȁc�c���������B";
			next;
			mes "^ff0000�Z���X�萺�������Ȃ���";
			mes "���΂炭�̊ԁA������";
			mes "�[���l�����񂾃u���h��";
			mes "�₪�ė�ÂȈꌾ��f���o�����B^000000";
			next;
			mes "[�u���h]";
			mes "�X���͂����̕X������B";
			mes "�����Ɏ�����N�\��������񂩁B";
			mes "��������H";
			next;
			mes "[�W�F�C�X]";
			mes "�u���h�A���O����Ɛ��C�ɖ߂����̂��B";
			next;
			mes "[�u���h]";
			mes strcharinfo(0);
			mes "�N�́A����̖����z���";
			mes "����o����悤�A�����Ă���B";
			next;
			mes "[�W�F�C�X]";
			mes "��u�ł����C�ɖ߂����Ǝv����";
			mes "�����o�J�������B";
			break;
		}
		next;
		mes "[�u���h]";
		mes "��������Ɠz��̏o����C��";
		mes "�N�Ɉڂ肻�̗�C�̗͂ŕX�Ђ��ɂ��ꂽ";
		mes "������������Ă��ꂽ��";
		mes "��C�̗͂ŕX�͍ӂ��U�邾��B";
		mes "�ǂ����H������������Ȃ����H";
		next;
		mes "[�W�F�C�X]";
		mes "�S�R�����Ƃ��A�����͎v���Ȃ��񂾂��B";
		mes "��̂��O�̃u���h�E���|�[�g�Ƃ����̂��A";
		mes "�o���̕�����Ȃ�";
		mes "�M�����Ȃ����΂��肾���c�c�B";
		next;
		mes "[�W�F�C�X]";
		mes "�͂��c�c���͑��̕��@��";
		mes "�v�������΂Ȃ����Ƃ���ȁB";
		mes "�����̘b�����s���Ă݂邵���Ȃ��������B";
		switch('@flag) {
		case 0: mes "�{��̃A�C�X�^�C�^��10�̂�ގ���"; break;
		case 1: mes "�{��̃Q�C�Y�e�B10�̂�ގ���"; break;// TODO
		case 2: mes "�{��̃X�m�E�A�[10�̂�ގ���"; break;
		case 3: mes "�s���A�C�V�N��10�̂�ގ���"; break;// TODO
		}
		mes "�����ɖ߂��Ă���Ȃ����H";
		next;
		mes "[�u���h]";
		mes "����͑ގ��ł͂Ȃ��B";
		mes "�l�����Ȃ񂾂�!!";
		next;
		mes "[�W�F�C�X]";
		mes "����͂ǂ��ł������B";
		mes "�e�Ɋp�A���ށB";
		close;
	}
	else if(IL_FROZEN_QUE == 2 || IL_FROZEN_QUE == 7) {
		if(checkquest(15111)) {
			if(checkquest(15111) & 4 == 0) {
				mes "[�W�F�C�X]";
				mes "�{��̃A�C�X�^�C�^����";
				mes "10�̑ގ����Ă��Ă���B";
				close;
			}
			set '@quest,15111;
		}
		else if(checkquest(15117)) {
			if(checkquest(15117) & 4 == 0) {
				mes "[�W�F�C�X]";
				mes "�{��̃Q�C�Y�e�B��";
				mes "10�̑ގ����Ă��Ă���B";
				close;
			}
			set '@quest,15117;
		}
		else if(checkquest(15118)) {
			if(checkquest(15118) & 4 == 0) {
				mes "[�W�F�C�X]";
				mes "�{��̃X�m�E�A�[��";
				mes "10�̑ގ����Ă��Ă���B";
				close;
			}
			set '@quest,15118;
		}
		else if(checkquest(15119)) {
			if(checkquest(15119) & 4 == 0) {
				mes "[�W�F�C�X]";
				mes "�s���A�C�V�N����";
				mes "10�̑ގ����Ă��Ă���B";
				close;
			}
			set '@quest,15119;
		}
		mes "[�u���h]";
		mes "�����A����ώ��̌������ʂ肾��H";
		mes "�����I�S�g�����ꂾ��";
		mes "���܂�����C���I";
		next;
		emotion 79,"";
		mes "[�W�F�C�X]";
		mes "�c�����Đk���Ă�悤�ɂ��������Ȃ����c";
		next;
		mes "[�u���h]";
		mes "�����I���̗�C���ȂĎ��������c�c";
		mes "���Ƃ������ɕ������߂Ă���I";
		mes "��������s�J�b�ƌ���o����";
		mes "��Ղ̂悤�ɕX������邾��B";
		mes "����Ȃ��ƁA���Ƃ��b�Ƃ���";
		mes "�悭���邾��H";
		next;
		emotion 52,"";
		emotion 78, "�u���h#frozen01";
		mes "- �u���h�̗��ݒʂ�ɁA";
		mes "  �ނ�����߂��X��������߂��B -";
		mes "";
		mes "�s�J�b�I ";
		mes "�ƌ���o�����C���������A�C�̏��ׂ������B";
		mes "�����N����Ȃ������B";
		next;
		mes "[�u���h]";
		mes "���c�c�����B���������I";
		mes "�������������I";
		next;
		mes "[�W�F�C�X]";
		mes "����Ⴛ�����B�����";
		mes "���������܂���ʂ��Ȃ�����I";
		mes "���Ƃ͂��O�̂����";
		mes "�o�J�����b��M����";
		mes "���̓��A�ɗ������Ǝ��̂�";
		mes "�S�Ă̍Г�̎n�܂肾�����񂾁I";
		next;
		if(IL_FROZEN_QUE == 7)
			set '@str$,"�����m���Ă�񂾂���ق��Ă��悤";
		if(select("�o�J�����b�H",'@str$) == 2) {
			mes "[�u���h]";
			mes "�o�J�����b���ƁH�I";
			mes "�������q�ׂ��������I";
		}
		else {
			mes "[�u���h]";
			mes "�o�J�����b���ƁH";
			mes "�������q�ׂ��������I";
			mes "�u���h�E���|�[�g�I";
			mes "�X�̓��A�̓�̊�!!";
			next;
			mes "[�W�F�C�X]";
			mes "�͂��c�c";
			next;
			mes "[�u���h]";
			mes "���̒����ɂ��ƁA�����͐�";
			mes "�n�����E�̉����������炵���B";
			mes "���A�̑S�Ă������ŏo���Ă�";
			mes "�����ꏊ�������B";
			mes "�G���h���h�[�I";
			next;
			mes "- �����ŃW�F�C�X�������ɂȂ�����";
			mes "  �u���h�͍\�킸�b�𑱂����B -";
			next;
			mes "[�u���h]";
			mes "���_���O���̐N���҂�";
			mes "������΂���c�c�B";
			mes "�Y�މ��l�̑O�ɂ����";
			mes "�����̊O���痈���E�҂����ꂽ�B";
			next;
			mes "[�u���h]";
			mes "�E�҂͈�l�ŐN���҂�����";
			mes "�S���R�U�炵���B";
			mes "���l�͑��т��A�����̖��ƗE�҂�";
			mes "�����������炵���B";
			next;
			mes "[�u���h]";
			mes "���������̗E�҂����_�����}�̈�l��";
			mes "�����̎�����������������Ƃ����B";
			next;
			mes "[�u���h]";
			mes "���؂�ꌃ�{�������l��";
			mes "���A��S�ĕX�Ђ��ɂ��Ă��܂�";
			mes "�N���N���o���Ȃ��悤";
			mes "���낵�������X�^�[������������B";
			mes "����Ȕ߂����`��������񂾁B";
			next;
			mes "[�u���h]";
			mes "���c�c������񎄂�";
			mes "���_���Ă����ɗ����̂ł͂Ȃ����B";
			mes "�ʂ�߂�����ł�";
			mes "�C�ɂȂ��ē��������������B";
			next;
			mes "[�W�F�C�X]";
			mes "���̑O�A���ɘb�����̂�";
			mes "���e�������Ⴄ�񂾂��B";
			mes "���O�̃o�J�����b��";
			mes "�L�ۂ݂�����ł͂Ȃ������";
			mes "�D��S�œ��肱��Ȗڂɍ����Ƃ͂ˁB";
		}
		next;
		mes "[�u���h]";
		mes "�͂��͂��I";
		mes "�ǂ���ɂ��Ă������";
		mes "�c�������͈�����Ȃ��I";
		mes "����͂ȁc�c�B";
		next;
		mes "[�W�F�C�X]";
		mes "�܂������悤�ȃo�J�Ȃ܂˂�";
		mes "�c���Ă��̂��I";
		next;
		mes "[�u���h]";
		mes "�ⓚ���p�I�ӂ��U��܂ŉ��葱������A";
		mes "�X�������Ȃ�񂶂�Ȃ��H";
		mes "������悸�W�F�C�X�̕X�̕�����";
		mes "�v�������藊�ނ��I";
		next;
		mes "[�W�F�C�X]";
		mes "���Ǘ͔C�����I";
		mes "�����������悾�Ƃ́c�c�ڋ��ȓz�I";
		mes "�ӂ��A�d�����Ȃ��B";
		mes "�������c�c����A�͂����ς��ŗ��ށI";
		next;
		mes "- �W�F�C�X�𕢂��X��";
		mes "  �͂����ς���������I -";
		chgquest '@quest,15112;
		if(IL_FROZEN_QUE == 2)
			set IL_FROZEN_QUE,3;
		else
			set IL_FROZEN_QUE,8;
		cloakonnpc "�W�F�C�X#frozen01";
		cloakoffnpc "�W�F�C�X#frozen02";
		misceffect 135, "�W�F�C�X#frozen02";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

ice_d03_i.gat,155,43,3	script	�W�F�C�X#frozen02	467,{
	if(IL_FROZEN_QUE == 3 || IL_FROZEN_QUE == 8) {
		mes "[�W�F�C�X]";
		mes "�܂����Ǝv������";
		mes "�{���ɒ@���čӂ��Ƃ́B";
		next;
		mes "[�u���h]";
		mes "���̓V�˓I�Ȕ��z�̂������I";
		mes "���ӂ����A�W�F�C�X�B";
		next;
		mes "[�W�F�C�X]";
		mes "�ӂ��������Ɍ��";
		mes "�Ƃ��낶��Ȃ��낤�Ɂc";
		mes strcharinfo(0);
		mes "����ȓz�͒u���Ƃ���";
		mes "������������������o�悤�B";
		next;
		mes "[�u���h]";
		mes "���c�c���H";
		mes "�҂đ҂đ҂āI";
		mes "����͂Ȃ�����A�W�F�C�X�I";
		mes "�������̗F��͂���Ȃ��̂������̂��H";
		next;
		mes "[�W�F�C�X]";
		mes "�ӂ��B�ł���Ȃ炱����";
		mes "�̂Ăčs�������Ƃ��낾���d���Ȃ��B";
		mes "���͂܂��̂�Ⴢ�邩��";
		mes "����ɂ��������ށB";
		next;
		mes "- �u���h�𕢂��X��";
		mes "  �͂����ς���������I -";
		chgquest 15112,15113;
		if(IL_FROZEN_QUE == 3)
			set IL_FROZEN_QUE,4;
		else
			set IL_FROZEN_QUE,9;
		cloakonnpc "�u���h#frozen01";
		cloakoffnpc "�u���h#frozen02";
		misceffect 135,"�u���h#frozen02";
		close;
	}
	else if(IL_FROZEN_QUE == 4 || IL_FROZEN_QUE == 9) {
		mes "[�u���h]";
		mes "�����I�����ŏ��������I";
		mes "���\�Ȏ��͎҂Ȃ񂾂�";
		mes "���肪�Ƃ��A" +strcharinfo(0)+ "�I";
		next;
		mes "[�W�F�C�X]";
		mes "������������o�悤�B";
		mes "��x�Ɠ����ڂɍ��������Ȃ��B";
		next;
		mes "[�u���h]";
		mes "����͂�A���Q���ʂ����������Ă�";
		mes "�E�҂Ƃ͌����񂼁I";
		mes "������������Ȗڂɍ��킹���z�ɕ��Q���I";
		next;
		mes "[�W�F�C�X]";
		mes "���Q���āc�c���O";
		mes "�܂��X�Ђ��ɂ��ꂽ���̂��H";
		next;
		menu "���Q�H",-;
		mes "[�W�F�C�X]";
		mes "�ӂ��c�c���̃o�J��";
		mes "����o���Ă͂����Ȃ������";
		mes "�G��Ă��܂��ĂȁB";
		next;
		mes "[�u���h]";
		mes "����͂�A�P�ӂɂ��s����";
		mes "����������Ǝ₵�����I";
		next;
		mes "[�W�F�C�X]";
		mes "�P�ӂ��Ă��O��";
		mes "�N�����Ă������";
		mes "����o���Ă͂����Ȃ���������B";
		next;
		mes "[�u���h]";
		mes "�����A�������Ȃ����B";
		mes "�u���h�E���|�[�g�I�s�v�c�ȃg�J�Q�̊��I";
		next;
		mes "[�u���h]";
		mes "�O���b�������Ƃ���";
		mes "���̕X�̓��A���܂���������������";
		mes "���l���������Ă�";
		mes "�y�b�g�̃g�J�Q�������炵���B";
		next;
		mes "[�u���h]";
		mes "�������l���{��o���Ĉȗ�";
		mes "���̃g�J�Q�����l�̎􂢂��󂯁A";
		if(IL_FROZEN_QUE == 4) {
			mes "�X���X�̃g�J�Q�ɂȂ��Ă��܂����Ƃ����B";
		}
		else {
			mes "�X���X�̃g�J�Q��";
			mes "�Ȃ��Ă��܂����Ƃ����B";
		}
		next;
		mes "[�u���h]";
		mes "������̈���ɋQ���A";
		mes "���T�����ߓ��A����f�r���Ă�B";
		mes "���z�����H";
		mes "����ȓz�𕏂łĂ�����ׂɋ߂Â���";
		mes "���̗D�������A�ԈႢ���ƌ��������̂�!?";
		next;
		mes "[�W�F�C�X]";
		mes "����Ȗ󕪂���Ȃ�";
		mes "�u���h�E���|�[�g�݂����Șb��";
		mes "����������������d����Ă��Ă�񂾁B";
		mes "�������A�����x�ɘb��";
		mes "�����ς���Ă�悤�����B";
		next;
		mes "[�W�F�C�X]";
		mes "�͂��c�c�e�Ɋp�A";
		mes "����ȃg�J�Q��";
		mes "���̓��A�ɂ��邩��C��t���Ă���B";
		next;
		mes "[�W�F�C�X]";
		mes "�z�͋������A�N�݂�����";
		mes "���͎҂��p�[�e�B�[��g�߂�";
		mes "�|���邾�낤�B";
		next;
		mes "[�W�F�C�X]";
		mes "�N�Əo��Ă悩�����B";
		mes strcharinfo(0);
		mes "�@�����΁A�܂�����B";
		next;
		mes "- ����Ȃ���������u��";
		mes "  �ނ�͂܂�Ŗ��̂悤��";
		mes "  ���������čs�����B";
		mes "  �܂�Ŏn�߂���";
		mes "  ���݂��Ȃ��������̂悤�ɁB";
		mes "  ���܂Ŗ��ł����Ă����񂾂낤���H -";
		if(IL_FROZEN_QUE == 4) {
			delquest 15113;
			setquest 15115;
			//setquest 15116;
			//compquest 15116;
			setquest 202080;
			set IL_FROZEN_QUE,5;
			getitem 25271,10;
			getexp 300000000,0,1;
			getexp 0,60000000,0;
		}
		else {
			next;
			mes "- �������A���񓯂��J��Ԃ��ł͂Ȃ�";
			mes "  �������󋵂��ς��̂��݂��";
			mes "  ����Ԃ��c��ł����̂ł͂Ȃ����낤���B";
			mes "  ����ȋ^���O�ɂ��������悤�ȁc�c�B";
			mes "  ������Ȃ��B�S�Ă��s�K����";
			mes "  �J��ւ�����Ă�B���̍l���������c�c�B -";
			delquest 15113;
			setquest 15115;
			set IL_FROZEN_QUE,5;
			getitem 25271,2;
			getexp 100000000,0,1;
			getexp 0,20000000,0;
		}
		cloakonnpc "�u���h#frozen02";
		cloakonnpc "�W�F�C�X#frozen02";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

ice_d03_i.gat,64,231,3	script	�������y����#frozen1	557,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ����������߁A";
		mes "�@�A�C�e�����E�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���܂����ׂ悤�]";
		close;
	}
	if(IL_FROZEN_QUE != 1 && IL_FROZEN_QUE != 6) {
		mes "- ���ɉ����Ȃ��悤���B -";
		close;
	}
	if(countitem(25309) >= 10) {
		mes "�������؂̎}�͑S���������B";
		mes "�W�F�C�X�����̂Ƃ���֖߂낤�B";
		close;
	}
	mes "^006400�������؂̎}^000000��T������";
	mes "�y����Ɏ��˂����񂾁B";
	next;
	progressbar 2;
	hideonnpc;
	initnpctimer;
	if(rand(10)) {
		getitem 25309,1;
		mes "^006400�������؂̎}^000000����ɓ��ꂽ�B";
	}
	else
		mes "�������y����̒��ɂ́A�������������B";
	close;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end;
}

ice_d03_i.gat,100,246,3	duplicate(�������y����#frozen1)	�������y����#frozen2	557
ice_d03_i.gat,46,206,3	duplicate(�������y����#frozen1)	�������y����#frozen3	557
ice_d03_i.gat,84,208,3	duplicate(�������y����#frozen1)	�������y����#frozen4	557
ice_d03_i.gat,70,184,3	duplicate(�������y����#frozen1)	�������y����#frozen5	557
ice_d03_i.gat,112,188,3	duplicate(�������y����#frozen1)	�������y����#frozen6	557
ice_d03_i.gat,110,150,3	duplicate(�������y����#frozen1)	�������y����#frozen7	557
ice_d03_i.gat,238,231,3	duplicate(�������y����#frozen1)	�������y����#frozen8	557
ice_d03_i.gat,196,246,3	duplicate(�������y����#frozen1)	�������y����#frozen9	557
ice_d03_i.gat,252,206,3	duplicate(�������y����#frozen1)	�������y����#frozen10	557
ice_d03_i.gat,214,208,3	duplicate(�������y����#frozen1)	�������y����#frozen11	557
ice_d03_i.gat,228,184,3	duplicate(�������y����#frozen1)	�������y����#frozen12	557
ice_d03_i.gat,186,188,3	duplicate(�������y����#frozen1)	�������y����#frozen13	557
ice_d03_i.gat,150,187,3	duplicate(�������y����#frozen1)	�������y����#frozen14	557
ice_d03_i.gat,238,64,3	duplicate(�������y����#frozen1)	�������y����#frozen15	557
ice_d03_i.gat,219,90,3	duplicate(�������y����#frozen1)	�������y����#frozen16	557
ice_d03_i.gat,230,111,3	duplicate(�������y����#frozen1)	�������y����#frozen17	557
ice_d03_i.gat,186,44,3	duplicate(�������y����#frozen1)	�������y����#frozen18	557
ice_d03_i.gat,171,72,3	duplicate(�������y����#frozen1)	�������y����#frozen19	557
ice_d03_i.gat,189,112,3	duplicate(�������y����#frozen1)	�������y����#frozen20	557
ice_d03_i.gat,187,149,3	duplicate(�������y����#frozen1)	�������y����#frozen21	557
ice_d03_i.gat,65,70,3	duplicate(�������y����#frozen1)	�������y����#frozen22	557
ice_d03_i.gat,86,87,3	duplicate(�������y����#frozen1)	�������y����#frozen23	557
ice_d03_i.gat,70,113,3	duplicate(�������y����#frozen1)	�������y����#frozen24	557
ice_d03_i.gat,126,73,3	duplicate(�������y����#frozen1)	�������y����#frozen25	557
ice_d03_i.gat,111,45,3	duplicate(�������y����#frozen1)	�������y����#frozen26	557
ice_d03_i.gat,112,111,3	duplicate(�������y����#frozen1)	�������y����#frozen27	557
ice_d03_i.gat,150,104,3	duplicate(�������y����#frozen1)	�������y����#frozen28	557
ice_d03_i.gat,137,38,3	duplicate(�������y����#frozen1)	�������y����#frozen29	557
ice_d03_i.gat,160,48,3	duplicate(�������y����#frozen1)	�������y����#frozen30	557

ice_d03_i.gat,0,0,0	script	#IllFrozen	-1,{
OnInit:
	setarray 'moblist,3792,3794,3795;
	for(set '@i,0;'@i<10;set '@i,'@i+1)
		areamonster "ice_d03_i.gat",0,0,0,0,"--ja--",'moblist[rand(3)],1,strnpcinfo(0)+"::OnSummon";
	end;

OnKilled:
	set 'mob,0;
OnSummon:
	if('mob == 0 && rand(100) == 0) {
		// �b��
		setarray '@x,211,89,87,209,121,122,178,178;
		setarray '@y,92,94,206,209,122,177,177,121;
		set 'mob,callmonster("ice_d03_i.gat",'@x[rand(getarraysize('@x))],'@y[rand(getarraysize('@y))],"���������`����",3765,strnpcinfo(0)+"::OnKilled");
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		mobuseskillpos 'mob,21,10,'@x,'@y,0,0;	// �T���_�[�X�g�[��
		mobuseskill 'mob,730,1,0,0,0,1;	// M�����w
		unittalk 'mob,"���������`���� : ���Ȃ��͖����ɘf�킳��Ă���I�l���~���Ă����܂��傤�I";
	}
	else {
		areamonster "ice_d03_i.gat",0,0,0,0,"--ja--",'moblist[rand(3)],1,strnpcinfo(0)+"::OnSummon";
	}
	end;
}
