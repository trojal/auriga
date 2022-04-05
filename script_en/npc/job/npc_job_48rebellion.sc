//====================================================================
//Ragnarok Online - Rebellion Jobchange Script	by refis
//
//�@�� CHANGE_RB -> 0�`4
//====================================================================

moc_fild12.gat,261,318,3	script	�������j	998,{
	if(Job == Job_Rebellion) {
		mes "[�������j]";
		mes "���O�́c�c�I";
		mes "���̊Ԃ̏܋���";
		mes "�@";
		mes "�c�c�̑��l�̋󎗁I";
		next;
		mes "[�������j]";
		mes "����A���̊Ԃ�";
		mes "�ԈႦ�Đ\����Ȃ������B";
		mes "���̌�A��������Ă����B";
		mes "���������Ă������ɂ͂��ł�";
		mes "�{���͕߂܂��Ă����ƁB";
		next;
		mes "[�������j]";
		mes "�ǂ݂̂��A���̗[�ё�ɂ�";
		mes "�Ȃ�Ȃ������Ƃ������Ƃ��ȁB";
		next;
		mes "[�������j]";
		mes "����ɂ��Ă��c�c";
		mes "���O�̓��x���I���ɂȂ����̂��I";
		next;
		mes "[�������j]";
		mes "���x���I���ɂȂꂽ�Ƃ������Ƃ�";
		mes "�������������z���A";
		mes "���R�Ɣ��t�̈ӎu��";
		mes "���ɏh�����Ƃ������ƁB";
		next;
		mes "[�������j]";
		mes "�e�̓���";
		mes "�����̔т��܂܂Ȃ��";
		mes "���������̂���";
		mes "���Ɋ撣�낤����Ȃ����I";
		close;
	}
	if(Job == Job_Gunslinger && BaseLevel >= 99 && JobLevel >= 70) {
		if(CHANGE_RB) {
			mes "[�������j]";
			mes "�������O��";
			mes "�܋���X�p�C�N�I";
			next;
			mes "[�������j]";
			mes "���̑O�͓��������Ǝv������";
			mes "�܂����ꂽ�ȁI�@���x������������I";
			next;
			switch(select("�܂��܂�������","�}������")) {
			case 1:
				mes "[�������j]";
				mes "����[�I";
				mes "������ȉ��̏܋�!!";
				mes "�@";
				break;
			case 2:
				mes "�]���Ȃ��͏e�𔲂��A";
				mes "�@�j�̎肩�畐���e����΂����]";
				soundeffect "ferus_move.wav", 0, 0;
				next;
				mes "[�������j]";
				mes "�����";
				mes "�Ȃ�Ƃ��������͂Ȃ񂾁I";
				next;
			}
			mes "�]���x������ɂ��Ă����Ȃ��B";
			mes "�@�������̐l�Ⴂ���Ȃ�Ƃ����悤�]";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�i��z���ɏ�����Ă���";
			mes "^FF0000�A�C���u���b�N�̔閧����^000000��";
			mes "�}�����j";
			next;
			mes "�]�A�C���u���b�N�̔閧�����";
			mes "�@�������܂����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]�A�C���u���b�N�֌��������]";
			close2;
			warp "einbroch.gat",48,97;
			end;
		}
		mes "[�������j]";
		mes "���Ɍ��������c�c�I";
		mes "�܋���X�p�C�N�I";
		mes "���̎�ɂ�������";
		mes "���܋��͉��̂��̂��I";
		next;
		mes "�]���Ζʂ̒j�ɏe����";
		mes "�@�˂�����ꂽ�I�]";
		next;
		switch(select("����������","�{��")) {
		case 1:
			mes "[�������j]";
			mes "�Ƃڂ��Ă����ʂ��I";
			mes "���O�̂��̉B������Ȃ�";
			mes "���̓����A�܂��ɂ��̎�z���ɂ���";
			mes "�܋���Ɠ����I";
			break;
		case 2:
			mes "[�������j]";
			mes "�ނ���R����C���I";
			mes "�����A��z���͂��łɊe�n��";
			mes "�L�����Ă���B";
			mes "�ǂ��ɂ�������͂Ȃ����I";
			break;
		}
		next;
		mes "[�������j]";
		mes "�ϔO���āA";
		mes "���̎蕿�ɂȂ��Ă��炤��!!";
		next;
		switch(select("������","�}������")) {
		case 1:
			mes "[�������j]";
			mes "�킠���I�@����������ȁI";
			mes "�@";
			mes "�]���Ȃ��͗����ӂ�����";
			mes "�@�������j�ɑ̓����肵��";
			mes "�@�����o�����]";
			soundeffect "ghoul_die2.wav", 0, 0;
			next;
			mes "�]���̎��ɒj�������Ă���";
			mes "�@������΂���āA";
			mes "�@���Ȃ��̎��E���ӂ������]";
			next;
			menu "������I",-;
			mes "�]�����͂�������z���ɂ�";
			mes "�@���Ȃ��Ɏ����l�������A";
			mes "�@������^FF0000���s�F�A�C���u���b�N�̔閧����^000000��";
			mes "�@������Ă���]";
			break;
		case 2:
			mes "�]���Ȃ��͏e�𔲂��A";
			mes "�@�j�̎肩�畐���e����΂����]";
			soundeffect "ferus_move.wav", 0, 0;
			next;
			mes "[�������j]";
			mes "�Ȃ񂾂Ɓc�c!?";
			mes "�@";
			mes "�]�r���������A�j�������̕\���";
			mes "�@���Ȃ�������]";
			next;
			mes "[�������j]";
			mes "�������̏܋���Ƃ����킯��";
			mes "�c�c����";
			next;
			switch(select("��z�����m�ۂ���","�܋���ł͂���܂���")) {
			case 1:
				mes "[�������j]";
				mes "�����I�@����I";
				mes "�Ԃ�!!";
				mes "�@";
				mes "�]���Ȃ��͒j����";
				mes "�@��z�������グ���]";
				break;
			case 2:
				mes "[�������j]";
				mes "�n�b�I�@���܂ł̏܋����";
				mes "����ȕ��ɂ���΂����ꂽ���B";
				mes "�����ȁI";
				next;
				mes "[�������j]";
				mes "���̎�z����";
				mes "^0000ff�A�C���u���b�N�̔閧����^000000��";
				mes "���s���ꂽ���K�̂��̂��I";
				mes "���������s�����o��͂����Ȃ��I";
				break;
			}
			next;
			mes "�]��z���ɂ͂��Ȃ��Ɏ����l�������A";
			mes "�@������^FF0000���s�F�A�C���u���b�N�̔閧����^000000��";
			mes "�@������Ă����]";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�i�A�C���u���b�N�c�c�j";
			break;
		}
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i��z���ɏ�����Ă���";
		mes "^FF0000�A�C���u���b�N�̔閧����^000000��";
		mes "�s���Ă݂悤�j";
		next;
		setquest 12340;
		set CHANGE_RB,1;
		mes "�]�A�C���u���b�N�̔閧�����";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�A�C���u���b�N�֌��������]";
		close2;
		warp "einbroch.gat",48,97;
		end;
	}
	mes "�]�������j��";
	mes "�@�����������L���Ă���]";
	next;
	mes "[�������j]";
	mes "�ӂ��ӂ��Ӂc�c";
	mes "���Ă邾����z����������Ă������B";
	//mes "�ܕi���߂܂���";
	mes "�܋����߂܂���";
	mes "�r�҂����Ă�邺�B";
	close;
}
einbroch.gat,54,97,3	script	�K�[�h	10062,{
	if(CHANGE_RB == 1) {
		mes "�]��z���ɏ�����Ă���";
		mes "�@^FF0000�閧����^000000��";
		mes "�@���̌����̂悤���]";
		next;
		mes "[�K�[�h]";
		mes "�����A�����̃K���X�����K�[�B";
		mes "���܂œ˂������āc�c";
		mes "�@";
		mes "���O�͏܋���X�p�C�N�I";
		next;
		menu "�Ⴂ�܂�",-,"�l�Ⴂ�ł�",-;
		mes "[�K�[�h]";
		mes "�́H";
		mes "�@";
		mes "����A�������B";
		mes "�m���ɕ߂܂����ƕ��������B";
		mes "�����O�̂��߂Ƃ������Ƃ����邵�c�c";
		next;
		menu "�����͏܋���ł͂���܂���",-,"�Ԉ���Ė��f���Ă܂�",-;
		mes "[�K�[�h]";
		mes "�Ȃ񂾂ƁH";
		mes "�@";
		mes "�]�K�[�h�͂��Ȃ��̊��";
		mes "�@�����ȕ�������W���W����";
		mes "�@���߂��]";
		next;
		mes "[�K�[�h]";
		mes "�ӂ���c�c";
		mes "�m���ɁA���Ă��邪�Ⴄ�ȁB";
		next;
		mes "[�K�[�h]";
		mes "����ŁA��z���Ɋւ���";
		mes "�b������ƁA�����������Ƃ��ȁH";
		next;
		mes "[�K�[�h]";
		mes "�������ȁA";
		mes "���Ŕ��f�ł����肶��Ȃ����������A";
		mes "���O�Ȃ�A���̓X��";
		mes "�����Ă����Ȃ����낤�B";
		next;
		mes "[�K�[�h]";
		mes "��z���̌���";
		mes "�X���ɂ���^0000FF�N���x��^000000��";
		mes "�����čs���ȁB";
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	else if(CHANGE_RB >= 2) {
		mes "[�K�[�h]";
		mes "����H�@���̑O�̓z���B";
		mes "����ɂȂ�̗p���H";
		next;
		if(select("���ɓ��肽��","����Ă݂�����") == 2) {
			mes "[�K�[�h]";
			mes "�p���Ȃ��Ȃ�A��B";
			close;
		}
		mes "[�K�[�h]";
		mes "�������B���Ŗ����N�����Ȃ�B";
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	else if(Job == Job_Rebellion) {
		mes "[�K�[�h]";
		mes "�您�A���u�B";
		mes "���q�͂ǂ����H";
		next;
		if(select("����ɓ��肽��","����Ă݂�����") == 2) {
			mes "[�K�[�h]";
			mes "�������B";
			mes "���C�����ŉ���肾�B";
			mes "���̒��q�ŏe�̓���";
			mes "�ɂ߂��B";
			close;
		}
		mes "[�K�[�h]";
		mes "�������B���Ŗ����N�����Ȃ�B";
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	else {
		// ������
	}
}

job_gun.gat,56,26,0	warp	���x���I������#1	2,2,einbroch.gat,49,97
job_gun.gat,18,10,0	warp	���x���I������#2	2,2,job_gun.gat,81,29
job_gun.gat,165,22,0	warp	���x���I������#3	2,2,job_gun.gat,197,44
job_gun.gat,197,49,0	warp	���x���I������#4	2,2,job_gun.gat,157,21

job_gun.gat,68,33,3	script	��Âȃ��x���I��	10063,{
	if(Job == Job_Rebellion) {
		if(checkquest(121920)&0x8) {
			mes "[��Âȃ��x���I��]";
			mes "�₠�A���u��B";
			mes "�e�̈����ɂ͏�ɋC��z��񂾂��B";
			mes "���̏e����X�̏ے�������ȁB";
			close;
		}
		setquest 121920;
		compquest 121920;
		mes "[��Âȃ��x���I��]";
		mes "�₠�A�V����B";
		mes "�e�̈����ɂ͏�ɋC��z��񂾂��B";
		mes "���̏e����X�̏ے�������ȁB";
		close;
	}
	mes "[��Âȃ��x���I��]";
	mes "�e�̈������͂킩���Ă�̂��H";
	close;
}

job_gun.gat,78,33,6	script	�������K���}��	731,{
	if(Job == Job_Rebellion) {
		if(checkquest(121915)&0x8) {
			mes "[�������K���}��]";
			mes "�您�A���u��B";
			mes "���R����邽�߂�";
			mes "�e�̓������߂Ă��邩�H";
			mes "�e�����ɂȃn�n�b�I";
			close;
		}
		setquest 121915;
		compquest 121915;
		mes "[�������K���}��]";
		mes "�您�A���u��B";
		mes "��y�Ƃ��Č�y�̂��O�Ɍ�����̂�";
		mes "���ꂾ�����B";
		next;
		mes "[�������K���}��]";
		mes "���̎�̏e��";
		mes "���O�̎��R�̏ے����B";
		mes "���̎��R����邽�߂Ƀ��x���I����";
		mes "�������߂�̂��B";
		mes "�e�����ɂȃn�n�b�I";
		close;
	}
	mes "[�������K���}��]";
	mes "�c�c";
	next;
	mes "[�������K���}��]";
	mes "�́H";
	mes "���͒b��Ȃ�Ă���ĂȂ��񂾂��B";
	mes "���̓K���}���B";
	mes "���R�ɐ�����K���}�������B";
	close;
}

job_gun.gat,74,24,6	script	���������̒j	887,{
	if(Job == Job_Rebellion) {
		if(checkquest(121905)&0x8) {
			mes "[���������̒j]";
			mes "�����������������c�c";
			mes "�@";
			mes "�]�j�͑傫�Ȃ��т���������";
			mes "�@�Q�����Ă���]";
			close;
		}
		setquest 121905;
		compquest 121905;
		mes "[���������̒j]";
		mes "�����̓��x���I�����W���A";
		mes "������������閧�̎��ꂾ�B";
		mes "�V�ĂȂ�N���x����";
		mes "���A���Ă����ȁB";
		next;
		mes "[���������̒j]";
		mes "���̎d���͎��̎d���ꂾ����ȁB";
		close;
	}
	mes "[���������̒j]";
	mes "���͂��̎���̓X�����I";
	mes "�@";
	mes "�c�c����H";
	next;
	mes "[���������̒j]";
	mes "���������̓X�H";
	mes "�����������͓X���Ȃ̂��c�c�H";
	mes "�@";
	mes "�]�j�͂Ђǂ������Ă���]";
	close;
}

job_gun.gat,64,33,6	script	�s���Ȓj	748,{
	if(Job == Job_Rebellion) {
		if(checkquest(121920)&0x8) {
			mes "[�s���Ȓj]";
			mes "�ނ�̏ے��͎��R�炵���ł����ǁA";
			mes "����Ȃ玄�����R�ɂ��Ă���������B";
			next;
			mes "[��Âȃ��x���I��]";
			mes "�������Ă񂾂��A���񂽁B";
			mes "���񂽂́A�X�֏o�Ă͖�����";
			mes "�����ɂ��ǂ蒅���Ă�";
			mes "�J��Ԃ��Ă�";
			mes "�����̕������s����Ȃ����B";
			next;
			mes "[�s���Ȓj]";
			mes "�c�c�������A������";
			mes "����g��ł���̂�";
			mes "������ł���B";
			close;
		}
		mes "[�s���Ȓj]";
		mes "���Ȃ������̕ςȏꏊ��";
		mes "����Ȃ�ł����H";
		mes "�ǂ�����Ώo�����ł��傤���B";
		close;
	}
	mes "[�s���Ȓj]";
	mes "�ǂ����ςȏꏊ��";
	mes "�����Ă����݂����ł��B";
	mes "���ꂶ��Ȃ���ł����ˁH";
	mes "���͋C�ς����B";
	close;
}

job_gun.gat,86,29,3	script	�N���x��	10062,{
	if(Job == Job_Rebellion) {
		if(checkquest(121910)&0x8) {
			if(checkquest(121925)&0x8 == 0) {
				setquest 121925;
				compquest 121925;
			}
			mes "[�N���x��]";
			mes "��`���`��";
			mes "���t�́@��ׂ肨�`���";
			mes "�@";
			mes "�]�N���x���̓O���X�𖁂��Ȃ���";
			mes "�@�y�����ɉ̂��]";
			next;
			mes "[�N���x��]";
			mes "�您�A���u�B";
			mes "���������C�Ƀ��x���I�����Ă邩�H";
			mes "�����̓��x���I�����W��";
			mes "���ꂾ����ȁB";
			mes "���܂ɂ͊���Ă����B";
			close;
		}
		setquest 121910;
		compquest 121910;
		mes "[�N���x��]";
		mes "���߂łƂ��B";
		mes "����ł��O����l�̃��x���I�����ȁB";
		next;
		mes "[�N���x��]";
		mes "��z���̂��Ƃ͂���[���";
		mes "�Ώ����Ă���������";
		mes "�����ǂ��񂳂�邱�Ƃ͂Ȃ����B";
		mes "���S���Ă���B";
		next;
		mes "[�N���x��]";
		mes "�ŁA������񃋃E�B�[�j��";
		mes "�V�h�����̘b�͕����Ă����ȁB";
		next;
		mes "[�N���x��]";
		mes "���x���I���ɂƂ��ďe��";
		mes "�K���X�����K�[�̂������";
		mes "�d�v�Ȃ��̂��B";
		mes "�Ȃ񂹌Ȃ̎u��";
		mes "���̏e�ɍ��߁A������";
		mes "�ؖ���������񂾂���ȁB";
		next;
		mes "[�N���x��]";
		mes "�u�͈�B";
		mes "���R�Ɣ��t�B";
		mes "���̒��ɂ͂т��鈫�ɂ�";
		mes "�e�ő΍R����񂾁B";
		mes "���̎��R��̌�����̂��B";
		next;
		mes "[�N���x��]";
		mes "����葱���邱�Ƃ͓����";
		mes "�������J�b�R�C�C�I";
		mes "����ȑ��݂ɂ��O�͂Ȃ����񂾁I";
		next;
		mes "[�N���x��]";
		mes "���i�����V�āI";
		close;
	}
	if(CHANGE_RB == 1) {
		mes "[�N���x��]";
		mes "��������Ⴂ�B";
		mes "�K���X�����K�[��";
		mes "���̔閧����ɉ��̗p�����H";
		next;
		if(select("��z���̘b������","�����𗊂�") == 2) {
			mes "[�N���x��]";
			mes "���������񂾂��H";
			mes "�h�����N�Ƀt�[�h�c�c";
			mes "�@";
			mes "��z�����ȁH";
			emotion 0,"";
			next;
		}
		mes "�]���Ȃ��̓N���x����";
		mes "�@��z����˂������]";
		next;
		mes "[�N���x��]";
		mes "�c�c����B";
		mes "����҂��āB�Ղ����c�c";
		mes "�@";
		mes "�]�N���x���̌���";
		mes "�@�������k���Ă���]";
		next;
		switch(select("�{��I","�e�Ɏ�������Ă���")) {
		case 1:
			mes "[�N���x��]";
			mes "�͂��͂��́I";
			mes "���܂񂷂܂񂿂���Ƒ҂��Ă���B";
			break;
		case 2:
			mes "[�N���x��]";
			mes "��������I";
			mes "�X���ŗ����͂��߂񂾂��B";
			mes "���̎������ȁB";
			next;
			break;
		}
		mes "�]�ЂƂ�����΂���";
		mes "�@���������̂��A�N���x����";
		mes "�@�܂��ʂ�����";
		mes "�@���Ȃ��Ɍ����������]";
		next;
		mes "[�N���x��]";
		mes "����A�܋��҂�����";
		mes "��z���܂Ŏ�ɓ����Ȃ��";
		mes "�Ȃ��Ȃ����ǂ��낪���邶��Ȃ����B";
		next;
		menu "�ǂ��������Ƃł��傤�H",-;
		mes "[�N���x��]";
		mes strcharinfo(0)+ "�A";
		mes "���O�̃K���X�����K�[�Ƃ��Ă�";
		mes "���͓͂`�������Ă��邼�B";
		mes "�@";
		mes "���O��^FF0000���x���I��^000000��";
		mes "�����Ȃ����H";
		next;
		switch(select("���x���I���H","�����Ȃ��ł�","����Ȃ��Ƃ���z���I")) {
		case 1:
			break;
		case 2:
			mes "[�N���x��]";
			mes "��������ւ����Ȃ��āB";
			mes "���O�͂Ȃ��Ȃ��ɂ��킢������ȁB";
			next;
			break;
		case 3:
			mes "[�N���x��]";
			mes "�킩���Ă邳�B";
			mes "���������Ȃ񂾂Ȃ��O�́B";
			mes "������֌W���邱�Ƃ�����";
			mes "�܂��͘b�𕷂��Ă���B";
			next;
			break;
		}
		mes "[�N���x��]";
		mes "���x���I����";
		mes "�K���X�����K�[�̏�ʐE�ł���A";
		mes "���R�ȍ��̉���҂��I";
		next;
		mes "[�N���x��]";
		mes "���Ԃɂ͂т��鈫��";
		mes "���Ă��Č��͂��������킹��B";
		mes "����Ȉ��ɑ΂��ďe���������A";
		mes "���t����̂����x���I�����B";
		mes "��������������H";
		next;
		mes "[�N���x��]";
		mes "�c�c�ŁA�����ň��";
		mes "�햾�����Ȃ񂾂��B";
		mes "���̎�z���~�X�A";
		mes "���͂킴�ƂȂ񂾂�ȁB";
		next;
		mes "[�N���x��]";
		mes "�K���X�����K�[���ɂ߂����񂽂�";
		mes "�X�J�E�g����Ɠ�����";
		mes "���̐S�����ǂ��������̂�";
		mes "�m�F�����Ă���������Ă킯���B";
		next;
		mes "[�N���x��]";
		mes "�����̈��ɂ�";
		mes "�u�����ł͔��t�ł��Ȃ��B";
		mes "�������A�ŏ��ɂ���̂�";
		mes "���s�s����u���Ȃ��A";
		mes "���t�����߂�S����I";
		next;
		mes "[�N���x��]";
		mes "���񂽂̒��ڏ�荞��";
		mes "���̈ӋC�c�c";
		mes "�@";
		mes "�C�ɓ��������I";
		next;
		mes "[�N���x��]";
		mes "���͂��񂽂𓯎u��";
		mes "�}�����ꂽ���I";
		mes "���x���I���̓������ŗ~�����I";
		mes "�S���炾���B�S�̒ꂩ�炾�I";
		next;
		mes "[�N���x��]";
		mes "���߂Č������B";
		mes "���������x���I���̈����";
		mes "�Ȃ�C�͂Ȃ����H";
		while(1) {
			next;
			switch(select("�Ȃ�","�Ȃ�Ȃ�","���ܔ����Ă�̂�")) {
			case 1:
				break;
			case 2:
				mes "[�N���x��]";
				mes "���₢��A����Ȃ��ƌ��킸�ɁB";
				mes "�K���X�����K�[�̎���";
				mes "���x���I�����ɂ߂悤����Ȃ����B";
				next;
				mes "[�N���x��]";
				mes "���߂Č������B";
				mes "���������x���I���̈����";
				mes "�Ȃ�C�͂Ȃ����H";
				continue;
			case 3:
				mes "[�N���x��]";
				mes "�c�c�����˂��B";
				mes "�@";
				mes "���ꂾ��H�@��z����";
				mes "�U���o�������Ƃɑ΂���";
				mes "���t���Ă����Ƃ́B";
				next;
				mes "[�N���x��]";
				mes "���x���I���̑f���Ƃ��Ă�";
				mes "�����\���ȏؖ����ˁB";
				next;
				mes "[�N���x��]";
				mes "�c�c�Ƃ����킯�ŁB";
				mes "���߂Č������B";
				mes "���������x���I���̈����";
				mes "�Ȃ�C�͂Ȃ����H";
				continue;
			}
			break;
		}
		mes "[�N���x��]";
		mes "�������������B";
		mes "�悭�����Ă��ꂽ�I";
		mes "���ꂶ�Ⴀ�A�C�����ς��Ȃ�������";
		mes "�]�E�����ƍs��������Ȃ����B";
		next;
		mes "[�N���x��]";
		mes "��H";
		mes "�ǂ����ē]�E���������āH";
		next;
		mes "[�N���x��]";
		mes "�܂��A���񂽂�";
		mes "�X�J�E�g���ꂽ�l�ނ����B";
		mes "�]�E�����Ń��x���I���Ƃ��Ă�";
		mes "�u��Z�p�Ȃ񂩂������Ɋw�ׂ邩�炳�B";
		mes "���Ў󂯂Ă����B���ނ�B";
		next;
		mes "[�N���x��]";
		mes "�ŏ��̎�������";
		mes "���E�B�[�j���Ă���B";
		mes "�����킩��Ǝv�����B";
		next;
		mes "[�N���x��]";
		mes "���Ⴀ�A�撣���Ă����B";
		mes "���ɉ�Ƃ��A���O��";
		mes "���x���I���ɂȂ��ĂĂ����I";
		chgquest 12340,12341;
		set CHANGE_RB,2;
		close2;
		warp "job_gun.gat",19,15;
		end;
	}
	else if(CHANGE_RB == 2) {
		mes "[�N���x��]";
		mes "�܂������̓r���̂悤���ȁB";
		mes "���E�B�[�j�̂Ƃ����";
		mes "�s�����H";
		next;
		if(select("�s��","�s���Ȃ�") == 2) {
			mes "[�N���x��]";
			mes "�킩�����A";
			mes "���ꂶ���x�݂�";
			mes "���ł�����ł������H";
			mes "�n�n�n�n�I";
			close;
		}
		mes "[�N���x��]";
		mes "�킩�����A����킹�Ă��B";
		mes "���������B";
		close2;
		warp "job_gun.gat",19,15;
		end;
	}
	else if(CHANGE_RB == 3) {
		// ������
		mes "[�N���x��]";
		mes "�܂������̓r���̂悤���ȁB";
		mes "�V�h�����̂Ƃ����";
		mes "�s�����H";
		next;
		if(select("�s��","�s���Ȃ�") == 2) {
			mes "[�N���x��]";
			mes "�킩�����A";
			mes "���ꂶ���x�݂�";
			mes "���ł�����ł������H";
			mes "�n�n�n�n�I";
			close;
		}
		mes "[�N���x��]";
		mes "�킩�����A����킹�Ă��B";
		mes "���������B";
		close2;
		warp "job_gun.gat",120,133;
		end;
	}
	else if(CHANGE_RB == 4) {
		// ������
		mes "[�N���x��]";
		mes "�����͏I������悤���ȁB";
		mes "�V�h�����̂Ƃ����";
		mes "�s�����H";
		next;
		if(select("�s��","�s���Ȃ�") == 2) {
			mes "[�N���x��]";
			mes "�킩�����A";
			mes "���ꂶ���x�݂�";
			mes "���ł�����ł������H";
			mes "�n�n�n�n�I";
			close;
		}
		mes "[�N���x��]";
		mes "�킩�����A����킹�Ă��B";
		mes "���ɉ�Ƃ��A���O��";
		mes "���x���I���ɂȂ��ĂĂ����I";
		close2;
		warp "job_gun.gat",210,132;
		end;
	}
}
job_gun.gat,19,24,3	script	���E�B�[�j#1	10063,{
	if(CHANGE_RB == 2) {
		mes "[���E�B�[�j]";
		mes "�₠�B�N��";
		mes "�N���x���̌����Ă���";
		mes "���x���I���u�]�҂��ȁH";
		mes "�@";
		mes "�]�s���ڂ����������Ȑl����";
		mes "�@���Ȃ������グ���]";
		next;
		mes "[���E�B�[�j]";
		mes "�N���x���̑ԓx�ɂ�";
		mes "�����՗�������ꂽ���Ƃ��낤�ȁB";
		mes "�c�c�܂��A�����́A���ꂾ�B";
		mes "�f���J�V�[���Ȃ���";
		mes "�l�����������Ȃ񂾁B";
		mes "�l���邾�����ʂ��B";
		next;
		mes "[���E�B�[�j]";
		mes "�c�c�S�z���B";
		mes "���āA���ꂶ�Ⴀ";
		mes "�����̑O��";
		mes "�����ɏ������Ă���B";
		next;
		mes "[���E�B�[�j]";
		mes "��X�����ӂ��邪�A";
		mes "�@�B�≊�A�S����������ȁB";
		mes "������ׂ̈��B";
		next;
		mes "�]���E�B�[�j�̍����o�������ɂ�";
		mes "�@�����҂͎����r����";
		mes "�@�����������A���������Ă�";
		mes "�@��΂ɐӔC����Ȃ����Ƃ𐾂��c�c";
		mes "�@";
		mes "�@�Ƃ��������Ƃ�������Ă����]";
		next;
		if(select("��������","�������Ȃ�") == 2) {
			mes "[���E�B�[�j]";
			mes "���������B";
			mes "���Ȃ�d�����Ȃ��ȁB";
			mes "�A���Ă������B";
			close2;
			warp "job_gun.gat",62,27;
			end;
		}
		mes "[���E�B�[�j]";
		mes "�����I��������B";
		mes "���ꂶ����ė��ȁB";
		close2;
		warp "job_gun.gat",117,41;
		end;
	}
	mes "[���E�B�[�j]";
	mes "�Ȃ񂾁H�@���ɂł��������̂��H";
	mes "�󋵂��m�F���Ă���";
	mes "������ɗ��Ȃ����B";
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,117,46,3	script	���E�B�[�j#2	10063,{
	if(checkquest(12341))
		chgquest 12341,12342;
	if(checkquest(12342)) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) == 2431) {
			mes "^0000ff�]���łɕϐg���ł��B";
			mes "�@�����ۑ�����ׂĊ���������";
			mes "�@�g�ݗ��Ď��ɍs���A";
			mes "�@���E�B�[�j��";
			mes "�@�񍐂��Ă��������]^000000";
			close;
		}
		if(countitem(6746)) {
			delitem 6746,countitem(6746);
			mes "[���E�B�[�j]";
			mes "�����ŗ]�����S�����H���͉������B";
			next;
		}
		if(countitem(6747)) {
			delitem 6747,countitem(6747);
			mes "[���E�B�[�j]";
			mes "�K�i�S�����H���������Ă���ȁB";
			mes "�����ŗ]�����S�����H���͉������B";
			next;
		}
		if(countitem(13118)) {
			delitem 13118,1;
			mes "[���E�B�[�j]";
			mes "�e�͊������Ă��邪�A";
			mes "���Ɏ��Ԑ؂�Ŏ��i���B";
			mes "�c�O�������̏e�͉�����邼�B";
			next;
		}
		mes "[���E�B�[�j]";
		mes "��x�����b���Ȃ�����";
		mes "�悭�����Ȃ����B";
		next;
		menu "�͂�",-;
		mes "[���E�B�[�j]";
		mes "�����͒����������Ă���ꏊ���B";
		mes "������Ƃ���œS�����H����";
		mes "���Y����Ă���B";
		next;
		mes "[���E�B�[�j]";
		mes "���x���I���̈�Ԃ̊�{�́A";
		mes "����ɑ΂���L���m���B";
		mes "���̎����ł́A";
		mes "�K�v�ȍޗ���I�є����A";
		mes "�Ȃ̎�Œ���";
		mes "�e���g�ݗ��Ă邱�ƂɂȂ�B";
		next;
		mes "[���E�B�[�j]";
		mes "�N�̂��ׂ����Ƃ́A";
		mes "��̏o������߂��ɂ���";
		mes "^0000FF�n�z�F����@^000000�𑀍삵��";
		mes "���o����S�����H���̒�����A";
		mes "�K�i�ɍ������̂�^FF00002��^000000�I�Ԃ��Ƃ��B";
		next;
		mes "[���E�B�[�j]";
		mes "2�S�����H�����m�ۂ�����A";
		mes "�ׂ̑g�ݗ��Ď���";
		mes "�e���g�ݗ��ĂȂ����B";
		next;
		mes "[���E�B�[�j]";
		mes "�e��g�ݗ��Ă̎��Ԃ�";
		mes "^FF00003��^000000�B";
		mes "�Z�p�ƒm���ƁA�X�s�[�h��";
		mes "�v������邼�B";
		next;
		mes "[���E�B�[�j]";
		mes "���������e��ׂ͗̕����Ŏ󂯎�낤�B";
		mes "�������Ԃ��킩��₷�����邽�߂ɁA";
		mes "�N�̊O����ς��Ă��炤���B";
		next;
		mes "[���E�B�[�j]";
		mes "���Ȃ݂ɁA�ϐg��̎p�͎��̎���B";
		mes "�X�Ō����������Ƃ�����񂾂��A";
		mes "���z�̃^�C�v�������̂łȁB";
		mes "���ꂾ�����烂�`�x�[�V������";
		mes "�����邾�낤�H";
		next;
		mes "[���E�B�[�j]";
		mes "^0000ff3���𒴂��ĕϑ����������";
		mes "�����͎��s�B�Ď���^000000���B";
		mes "����������݂��܂��B";
		viewpoint 1, 165, 18, 1, 0xFFFF00;
		sc_start SC_MONSTER_TRANSFORM,180000,2431;
		close;
	}
	mes "[���E�B�[�j]";
	mes "�Ȃ񂾁H�@���ɂł��������̂��H";
	mes "�󋵂��m�F���Ă���";
	mes "������ɗ��Ȃ����B";
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,198,39,3	script	���E�B�[�j#3	10063,{
	if(checkquest(12342)) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 2431) {
			mes "[���E�B�[�j]";
			mes "���Ԃ��߂��Ă���B���i���B";
			mes "�]�����ޗ��͂��ׂĉ������B";
			delitem 6746,countitem(6746);
			delitem 6747,countitem(6747);
			next;
			if(countitem(13118)) {
				// ������
				delitem 13118,1;
				mes "[���E�B�[�j]";
				mes "�e�͊������Ă��邪�A";
				mes "���Ɏ��Ԑ؂�Ŏ��i���B";
				mes "�c�O�������̏e�͉�����邼�B";
				next;
			}
			mes "[���E�B�[�j]";
			mes "�����A������x���B";
			mes "��݂��܂��B";
			close2;
			warp "job_gun.gat",117,41;
			end;
		}
		if(countitem(13118) == 0) {
			mes "[���E�B�[�j]";
			mes "�I��������H";
			mes "�c�c����ɂ��Ă�";
			mes "���������e����������Ȃ��悤�����H";
			close;
		}
		delitem 13118,1;
		mes "[���E�B�[�j]";
		mes "�悵�A�}���ō�����悤������";
		mes "���S�̏�Ԃł͂Ȃ����A";
		mes "�Ƃɂ������i���B";
		mes "�]�����ޗ��͂��ׂĉ������B";
		delitem 6746,countitem(6746);
		delitem 6747,countitem(6747);
		chgquest 12342,121930;
		set CHANGE_RB,3;
		next;
		mes "[���E�B�[�j]";
		mes "���ꂶ�Ⴀ�A���̃R�[�X�Ɉē����悤�B";
		mes "���̓V�h������";
		mes "�N�̋����S������B";
		close2;
		warp "job_gun.gat",120,133;
		end;
	}
	mes "[���E�B�[�j]";
	mes "�Ȃ񂾁H�@���ɂł��������̂��H";
	mes "�󋵂��m�F���Ă���";
	mes "������ɗ��Ȃ����B";
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,165,18,1	script	�n�z�F����@#1	844,{
	if(checkquest(12342)) {
		mes "�]�n�z�F���犮���������i��";
		mes "�@���o���܂����H�]";
		next;
		if(select("���o����","��߂�") == 2) {
			mes "�]��Ƃ𒆎~���A";
			mes "�@�ҋ@���[�h�ɓ]�����܂��]";
			close;
		}
		donpcevent "�n�z�F����@#2::OnStart";
		hideonnpc "�n�z�F����@#1";
		mes "�]�n�z�F����@ZX-3100�F��Ƃ��J�n�]";
		close;
	}
	mes "�]���������l�͑���ł��܂���]";
	close;
}

job_gun.gat,165,18,1	script	�n�z�F����@#2	844,{
	if(checkquest(12342)) {
		mes "�]���������S�����H����";
		mes "�@���o���s���Ă��܂��B";
		mes "�@��������܂�";
		mes "�@�C�ӂ̍�Ƃ͂ł��܂���]";
		close;
	}
	mes "�]���������l�͑���ł��܂���]";
	close;
OnStart:
	hideoffnpc "�n�z�F����@#2";
	sleep 3000;
	announce "�n�z�F����@ : �n�z�F����S�����H���̒��o���J�n���܂��B���Y���C���ɂđҋ@���Ă��������B", 0x9, 0x00ff44, 0x190, 12, 0, 0;
	sleep 500;
	for(set '@i,0; '@i<30; set '@i,'@i+1) {
		set '@r,rand(1,100);
		if('@r < 33)
			donpcevent "���M�F#3::OnStart";
		else if('@r < 66)
			donpcevent "���M�F#4::OnStart";
		else
			donpcevent "���M�F#5::OnStart";
		sleep 200;
		set '@x,rand(127,143);
		set '@y,rand(26,29);
		dropitem "job_gun.gat",'@x,'@y,6746,1,0;
		if(rand(100) < 50) {
			set '@x,rand(127,143);
			set '@y,rand(26,29);
			dropitem "job_gun.gat",'@x,'@y,6747,1,0;
		}
		sleep 500;
	}
	announce "�n�z�F����@ : ���o��Ƃ������������܂��B", 0x9, 0x00ff44, 0x190, 12, 0, 0;
	sleep 100;
	hideonnpc "�n�z�F����@#2";
	hideoffnpc "�n�z�F����@#1";
	end;
OnInit:
	hideonnpc;
	end;
}

job_gun.gat,130,31,1	script	���M�F#3	844,{
	end;
OnStart:
	misceffect 96;
	sleep 500;
	misceffect 97;
	end;
}

job_gun.gat,136,31,1	script	���M�F#4	844,{
	end;
OnStart:
	misceffect 96;
	sleep 500;
	misceffect 97;
	end;
}

job_gun.gat,141,31,1	script	���M�F#5	844,{
	end;
OnStart:
	misceffect 96;
	sleep 500;
	misceffect 97;
	end;
}

job_gun.gat,214,36,1	script	�S�������~#1	844,{
	if(checkquest(12342)) {
		if(countitem(13118)) {
			mes "�]�񐳋K���[�g�Ő������ꂽ";
			mes "�@�e��̍��Ղ𔭌��B";
			mes "�@�Ǘ��҃��E�B�[�j��";
			mes "�@�񍐂��Ă��������]";
			close;
		}
		if(countitem(6747) < 2) {
			mes "�]���������l�͑���ł��܂���]";
			next;
			mes "�]�n�z�F����@���g�p����";
			mes "�@�����������i��";
			mes "�@���o���Ă��������]";
			viewpoint 1, 165, 18, 1, 0xFFFF00;
			close;
		}
		mes "�]�S�������~�ŋK�i�ɓ��Ă͂܂�";
		mes "�@�S�����H�����g�p���A";
		mes "�@�e�퐻�����s���܂����H�]";
		next;
		if(select("�J�n����","��߂�") == 2) {
			mes "�]�S�������~�̐���𒆎~���܂��]";
			close;
		}
		misceffect 101;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�S�������~���g�p���A";
		mes "�@����ȕ���𐻑������B";
		mes "�@�ϐg���ʂ�������O��";
		mes "�@�񍐂��悤�j";
		delitem 6747,2;
		getitem 13118,1;
		close;
	}
	mes "�]���������l�͑���ł��܂���]";
	close;
}

job_gun.gat,95,148,10,10	monster	��ˌ��W�I	3170,3,180000,0,0
job_gun.gat,95,148,10,10	monster	�ˌ��W�I	3169,5,180000,0,0
job_gun.gat,95,110,10,15	monster	��ˌ��W�I	3170,3,180000,0,0
job_gun.gat,95,110,10,15	monster	�ˌ��W�I	3169,17,180000,0,0
job_gun.gat,140,100,15,10	monster	��ˌ��W�I	3170,13,180000,0,0
job_gun.gat,140,100,15,10	monster	�ˌ��W�I	3169,7,180000,0,0
job_gun.gat,140,150,15,10	monster	��ˌ��W�I	3170,4,180000,0,0
job_gun.gat,140,150,15,10	monster	�ˌ��W�I	3169,4,180000,0,0
job_gun.gat,115,160,10,10	monster	��ˌ��W�I	3170,8,180000,0,0
job_gun.gat,115,160,10,10	monster	�ˌ��W�I	3169,10,180000,0,0

job_gun.gat,120,138,3	script	�V�h����#1	10062,{
	if(CHANGE_RB == 3) {
		if(checkquest(12343)) {
			if(checkquest(12343)&4 && checkquest(12344)&4 == 0 && sc_onparam(SC_MONSTER_TRANSFORM,1) == 2431) {
				mes "[�V�h����]";
				mes "�ӂށA�f���炵���ȁI";
				mes "�������ȒP�ɃN���A�����Ƃ�";
				mes "�v���Ă��Ȃ�������B";
				next;
				mes "[�V�h����]";
				mes "�ŏI�����͂���ŏI��肾�B";
				mes "�N�͊O�ő҂��ĂĂ���B";
				mes "���̋����̕]�����������";
				mes "�����������ʂ�`���悤�B";
				delquest 12343;
				delquest 12344;
				setquest 12345;
				set CHANGE_RB,4;
				close2;
				warp "job_gun.gat",210,132;
				end;
			}
			mes "[�V�h����]";
			mes "���x�A�X�s�[�h�A";
			mes "����J�߂�Ƃ��낪�Ȃ��B";
			mes "�����ɑʖڂ��B";
			mes "�{���ɏe����ɐ����Ă����̂��H";
			next;
			mes "[�V�h����]";
			mes "�����ɍĎ������͂��߂�B";
			mes "���͂������蓮����B";
			delquest 12343;
			delquest 12344;
			setquest 12343;
			setquest 12344;
			sc_start SC_MONSTER_TRANSFORM,180000,2431;
			close2;
			warp "job_gun.gat",102,146;
			end;
		}
		mes "[�V�h����]";
		mes "�����I�@�悻������Ȃ�B";
		mes "�����͎��e���g���ˌ��ꂾ�B";
		mes "�����ł��C�𔲂�����A";
		mes "����ɂȂ���ꏊ�����B";
		next;
		mes "[�V�h����]";
		mes "���āB�ł͍ŏI�����ɂ���";
		mes "�������͂��߂�B";
		mes "������N�́A^FF00005�̎ˌ���^000000����";
		mes "���邱�ƂɂȂ�B";
		next;
		mes "[�V�h����]";
		mes "����͌Q�O�̒��ɂ���ڕW��";
		mes "���m�Ɍ������锻�f�͂�";
		mes "����ɑ΂���v������";
		mes "���肷�邽�߂̎������B";
		mes "��������|�����Ƃ��ړI����Ȃ����I";
		next;
		mes "[�V�h����]";
		mes "�N�͎ˌ������";
		mes "�悭����������Ă���A���̒�����";
		mes "^0000ff�ˌ��W�I^000000�Ə����ꂽ";
		mes "�W�I�݂̂�I��Ŏˌ����邱�ƁB";
		mes "�Ԉ���Ċ֌W�Ȃ����";
		mes "�������ꍇ�͎��_���B";
		next;
		mes "[�V�h����]";
		mes "�܂��A�ŏI������";
		mes "���ł̐������";
		mes "���ڌo�����������ǂ����낤�B";
		mes "^0000ff�ˌ��W�I^000000�Ƃ������O�̌��e�͐���";
		mes "�����Ă��邩�琳�m�Ɏˌ������B";
		next;
		mes "[�V�h����]";
		mes "^0000ff�������Ԃ�3�����B";
		mes "���̕ϑ�����������A";
		mes "���Ԑ؂�Ƃ݂Ȃ��Ď��i�ɂȂ�B^000000";
		mes "���̏ꍇ�͂��ƂȂ������̂Ƃ����";
		mes "�߂��Ă��Ȃ����B";
		next;
		mes "[�V�h����]";
		mes "��A���̕ϐg���C�ɂȂ�̂��H";
		mes "����ł킩�邾�낤�H";
		mes "�@";
		mes "�c�c���E�B�[�j�̎���B";
		next;
		mes "[�V�h����]";
		mes "�b��߂����B";
		mes "^0000ff�ˌ��W�I��10��";
		mes "�ˌ��ł��Ȃ�������A";
		mes "�s�K�؂ȖڕW��3��";
		mes "�ˌ����Ă����i���B^000000";
		next;
		mes "[�V�h����]";
		mes "�����͈ȏ�B";
		mes "���ꂶ�Ⴗ���͂��߂邱�Ƃɂ��悤�B";
		setquest 12343;
		setquest 12344;
		delquest 121930;
		sc_start SC_MONSTER_TRANSFORM,180000,2431;
		close2;
		warp "job_gun.gat",102,146;
		end;
	}
	if(CHANGE_RB == 4) {
		mes "[�V�h����]";
		mes "�ǂ����Ă܂������ɂ���񂾁H";
		mes "�O�ɏo�Ă���B";
		mes "�����Ɏ����s������B";
		close2;
		warp "job_gun.gat",210,132;
		end;
	}
	mes "[�V�h����]";
	mes "�Ȃ񂾁H�@���ɂł��������̂��H";
	mes "�󋵂��m�F���Ă���";
	mes "������ɗ��Ȃ����B";
	close2;
	warp "job_gun.gat",62,27;
	end;
}

job_gun.gat,88,144,0	warp	�ˌ���#1	2,2,job_gun.gat,93,123
job_gun.gat,105,97,0	warp	�ˌ���#2	2,2,job_gun.gat,125,98
job_gun.gat,156,115,0	warp	�ˌ���#3	2,2,job_gun.gat,157,137
job_gun.gat,152,154,0	warp	�ˌ���#4	2,2,job_gun.gat,135,154
job_gun.gat,130,146,0	warp	�ˌ���#5	2,2,job_gun.gat,120,130

job_gun.gat,220,132,3	script	�V�h����#2	10062,{
	if(Job == Job_Rebellion) {
		mes "[�V�h����]";
		mes "�₠�B���q�͂ǂ����ȁH";
		mes "���R��̌����邽�߂�";
		mes "���ɔ��t�̈������������̂�";
		mes "��ς����A��肪���͂��邾�낤�B";
		close;
	}
	if(CHANGE_RB != 4) {
		mes "[�V�h����]";
		mes "�Ȃ񂾁H�@���ɂł��������̂��H";
		mes "�󋵂��m�F���Ă���";
		mes "������ɗ��Ȃ����B";
		close2;
		warp "job_gun.gat",62,27;
		end;
	}
	if(Job == Job_Gunslinger) {
		mes "[�V�h����]";
		mes "����܂ł̐��т𑍍����āA";
		mes "�N���x���A���E�B�[�j�A";
		mes "�����Ď��V�h������";
		mes "�N�̃��x���I���]�E�ɑ΂���";
		mes "�]�������肵���B";
		next;
		mes "[�V�h����]";
		mes "���ʂ́c�c";
		next;
		mes "[�V�h����]";
		mes "����̐��т��ۂ���������A";
		mes "�s���Ȃ��B";
		next;
		mes "[�V�h����]";
		mes "�������B";
		mes "�N�����������x���I���̈���Ƃ���";
		mes "�󂯓���邱�ƂɌ��肵���B";
		mes "���߂łƂ��I";
		next;
		if(SkillPoint) {
			mes "[�V�h����]";
			mes "�N�A^ff0000�X�L���|�C���g��";
			mes "�܂��c���Ă��邼�B^000000";
			mes "�܂������A���̂��炢��";
			mes "�����Ń`�F�b�N���Ƃ��Ă����B";
			close;
		}
		if(Weight) {
			mes "[�V�h����]";
			mes "����炢�낢�뎝���Ă���ȁB";
			mes "�ז�������^ff0000�J�����b�N�X^000000��";
			mes "�a�����Ă��炦�B";
			mes "�ނ́A�����߂��ɂ��邩��";
			mes "�킩�邾�낤�H";
			close;
		}
		if(sc_ison(SC_ALL_RIDING)) {
			// ������
			mes "[�V�h����]";
			mes "�R�搶������~��Ă���B";
			mes "�C�����͂킩�邪";
			mes "��ɂӂ��킵���Ȃ�����H";
			close;
		}
		resetstatus;
		resetskill;
		setoption 0;
		jobchange Job_Rebellion;
		set CHANGE_RB,0;
		chgquest 12345,201860;
		getitem 13119,1;
		mes "�]���Ȃ���";
		mes "�@^FF0000���t�̏ے����x���I��^000000��";
		mes "�@�]�E���܂����I�]";
		next;
		mes "[�V�h����]";
		mes "�����I";
		mes "�Ȃ��Ȃ��ɂ��܂��Ă邶��Ȃ����B";
		mes "���������B��y�I";
		next;
		mes "[�V�h����]";
		mes "���A�N�ɓn�����e��";
		mes "���E�B�[�j������";
		mes "�N�ɂƗp�ӂ������̂��B";
		mes "���Ȃ�C�������Ė����Ă������B";
		mes "�厖�Ɏg���Ȃ����B";
		next;
		mes "[�V�h����]";
		mes "���ꂶ��܂�����B";
		close2;
		warp "job_gun.gat",81,29;
		end;
	}
	mes "[�V�h����]";
	mes "�ǂ����Ă����ɂ���񂾁H";
	mes "�O�ɏo�Ă���B";
	close2;
	warp "job_gun.gat",210,132;
	end;
}

job_gun.gat,220,138,4	shop	������̋@	564,13200:1

job_gun.gat,216,138,4	script	�J�����b�N�X	47,{
	mes "[�J�����b�N�X]";
	mes "�]�E�O�ɕs�v�ȕ���a����܂��B";
	next;
	if(select("�q�ɂ��J��","��߂�") == 2) {
		mes "[�J�����b�N�X]";
		mes "�����p���������A";
		mes "���肪�Ƃ��������܂��B";
		mes "�����A���x���I����";
		mes "�]�E���܂��傤�B";
		close;
	}
	mes "[�J�����b�N�X]";
	mes "�q�ɂ��J���܂��B";
	close2;
	openstorage;
	end;
}
