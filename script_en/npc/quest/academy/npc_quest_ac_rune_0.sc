//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ���[���̈˗�
//
//                                                 by Pneuma
//�C�ɂȂ邠�̎q   -------------------------------------------
prontera.gat,146,232,4	script	�n���o�[�h#AC_QUE00H01	48,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_0) goto L_OTHER;
	switch(AC_QUEST_LV_0){
	case 0:
		goto L_QUEST01;
	case 1:
		goto L_QUEST02;
	case 2:
		goto L_QUEST03;
	case 3:
		goto L_QUEST04;
	case 4:
		goto L_OTHER;
	case 5:
		goto L_QUEST06;
	case 6:
		goto L_QUEST07;
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_OTHER;
	}
	goto L_OTHER;
L_QUEST01:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "�]���̐l���˗���̂悤���]";
		next;
		emotion 1;
		mes "[�n���o�[�h]";
		mes "��A�N�́H";
		next;
		select "�����";
		mes "[�n���o�[�h]";
		mes "�N���A�l�̈˗����󂯂Ă��ꂽ";
		mes strcharinfo(0) +"���I";
		mes "�����Ƒ҂��Ă�����I";
		next;
		menu "����̈˗����e�́H",-;
		mes "[�n���o�[�h]";
		mes "���Ȃ�d�v�Ȏ�����B";
		mes "�^���Ɏ��g��ŗ~�����񂾁B";
		mes "�����A����̈˗����e�́I";
		next;
		mes "[�n���o�[�h]";
		mes "�l�̗����̔Y�݂�";
		mes "�����ė~�����񂾁I";
		next;
		mes "[�n���o�[�h]";
		mes "�l�ɂ͗c����̏��̎q������񂾁B";
		mes "�ޏ��̖��O�̓X�U���k�B";
		mes "^FF0000�ޏ��̓C�Y���[�h�ɏZ��ł���B^000000";
		mes "�l�Ɣޏ��́A�a������7���Ɠ����ŁA";
		mes "�H�ו��̍D�݂������A�w�Z�������B";
		mes "�����ƁA���ǂ��ɂ��Ă����񂾁B";
		next;
		emotion 40;
		mes "[�n���o�[�h]";
		mes "�ł��ˁA�ŋ߁A�X�U���k��";
		mes "���ɑ�l���ۂ��Ȃ��Ă����񂾁c�c";
		mes "�����Ɨc����Ƃ��Ă���";
		mes "���Ă��Ȃ������񂾂��ǁA";
		mes "�ŋ߁A�ޏ�������ƁA";
		mes "�����M���Ȃ��āA�ꂵ���Ȃ�񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "�����A�l�̓X�U���k��";
		mes "�����Ă��܂����񂾁I";
		mes "�ӎ����Ă��܂��āA�ŋ߃X�U���k��";
		mes "�b�����Ƃ��o���Ȃ��񂾁c�c";
		mes "�ޏ������̒j�q�Ƙb���Ă��邾����";
		mes "�₫�������₢�Ă��܂��c�c";
		next;
		mes "[�n���o�[�h]";
		mes "�����A���̋C�������}�����Ȃ��I";
		mes "������A�ޏ��ɂ��̋C������`���悤��";
		mes "�v���񂾁I�������悤�Ǝv���񂾁I";
		mes "�N�́A���̎��ɂ��Ăǂ��v���H";
		next;
		menu "����ł����Ǝv��",-;
		emotion 4;
		mes "[�n���o�[�h]";
		mes "�ł��A�������邱�Ƃ�";
		mes "���܂ł̊֌W������񂶂�Ȃ����A";
		mes "�����Ă��܂���ł͂Ȃ����A";
		mes "�Ǝv���ƁA�}�ɐK���݂����Ⴄ�񂾁c�c";
		next;
		mes "[�n���o�[�h]";
		mes "�������A";
		mes "�݂��ɂ��Ȃ��Ă����c�c";
		mes "���������c�c";
		next;
		emotion 23;
		mes "[�n���o�[�h]";
		mes "���킟�����������I";
		mes "�{���ɒɂ��I";
		mes "���ĂĂĂĂĂāI";
		next;
		menu "���v�H",-;
		mes "[�n���o�[�h]";
		mes "�������A�������ǁc�c";
		mes "�~���N�������Ă��Ă���Ȃ��H";
		mes "�ɂ��ē����Ȃ��c�c";
		mes "�݂ɗD�����~���N���~�������I";
		next;
	L_M_01_2_REP:
		mes "[�n���o�[�h]";
		mes "�~���N�́A";
		mes "���̃v�����e���̓s�s��";
		mes "^FF0000�������l^000000�������Ă���I";
		mes "�ꏊ�́A^FF0000�쐼^000000��ւ񂾂�I";
		mes "���A����Ŕ����Ă��ā`"; // �C����P���Ɠ����ɒǉ��H
		mes "���͂������I";
		next;
		mes "�]�n���o�[�h��^0000FF50zeny^000000��n���Ă���]"; //�ǉ�
		mes "�@";
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�������l����~���N�𔃂��āA";
		mes "�n���o�[�h�ɓn���]";
		close2;
		viewpoint 1,74,134,1,0x0000FF;
		if(2147483647 - Zeny > 50) set Zeny, Zeny + 50;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		if(countitem(519)==0){
			emotion 23;
			mes "[�n���o�[�h]";
			mes "�������������c";
			mes "���肢�����I";
			mes "�~���N���c";
			mes "�~���N�������Ă��āI";
			next;
			goto L_M_01_2_REP;
		}
		mes "[�n���o�[�h]";
		mes "���A����̓~���N���I";
		mes "���肢�I";
		mes "�����l�ɂ��I";
		mes " ";
		mes "�]�~���N���n���o�[�h�ɓn�����]";
		next;
		mes "[�n���o�[�h]";
		mes "���A���肪�Ƃ��I";
		mes "�ł́A�����I";
		next;
		mes "[�n���o�[�h]";
		mes "�S�N�S�N�c�c";
		mes "�S�N�S�N�c�c";
		mes "�S�N�S�N�S�N�S�N�S�N�S�N�c�c";
		next;
		emotion 21;
		mes "[�n���o�[�h]";
		mes "�`�`�`�`�`�`���������I";
		mes "���߁`�`�`���I";
		mes "�����Ԃ����`�I";
		next;
		mes "[�n���o�[�h]";
		mes "�{���ɂ��肪�Ƃ��I";
		mes "�ɂ݂����܂�����I";
		next;
		mes "[�n���o�[�h]";
		mes "�ł��A��Ȃ����Ȃ��c�c";
		mes "�����܂ŁA�Y��ł��܂��Ƃ́c�c";
		next;
		menu "�撣��",-;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) +"�c�c";
		mes "���肪�Ƃ��B";
		mes "�����E�C���o�Ă�����B";
		next;
		mes "[�n���o�[�h]";
		mes "�������Ȃ��Ō�����邮�炢�Ȃ�A";
		mes "�s�����������āA";
		mes "����������������ˁB";
		mes " ";
		mes "�ł��������������A�ޏ��ɍ�������̂�";
		mes "���Ԃ��~�����c�c";
		next;
		mes "[�n���o�[�h]";
		mes "����͑��k�ɂ̂��Ă����";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "������������";
		mes "�܂��N�ɑ��k�����I";
		next;
		delitem 519,1;
		if('@novice){
			//���S�҂ɂ̓C�O�t3��
			if(!checkweight(610,3)){
				mes "�d�ʃI�[�o�[�I";
				close;
			}
			getitem 610,3;
		}
		set AC_QUEST_ST_0,99;
	L_M_01_3_REP:
		mes "^FF0000�y�C���B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	case 99:
		mes "[�n���o�[�h]";
		mes "�{���ɂ��肪�Ƃ��I";
		mes "�N�͖{���ɂ����l���ˁB";
		mes "�܂��N�ɑ��k�����I";
		next;
		goto L_M_01_3_REP;
	}
	goto L_OTHER;
L_QUEST02:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�I";
		mes "�҂��Ă�����I";
		mes "�ǂ����Ă��A";
		mes "�N�ɑ��k�������Ă��I";
		next;
		menu "�ǂ������́H",-;
		emotion 52;
		mes "[�n���o�[�h]";
		mes "�l�͌��߂��񂾁B";
		mes "�X�U���k�ɍ���������!";
		mes "�ǂ�Ȍ��ʂł�������Ȃ��B";
		next;
		mes "[�n���o�[�h]";
		mes "����ŁA";
		mes "�ޏ��ɍ�������O��";
		mes "�ޏ�����ԃv���[���g��";
		mes "�n�������񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "�����ŁA���肢�Ȃ񂾁B";
		mes "�ޏ����~�������̂𒲂ׂė~�����񂾁B";
		mes "���ږl���畷���ƁA";
		mes "�����ɂ��v���[���g���l���Ă��܂��A";
		mes "���Ċ��������炳�B";
		mes "";
		next;
		menu "�X�U���k�ɒ��ڕ����΂����H",-;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�ł�";
		mes "���ڃX�U���k�ɕ����Ă��܂��ƁA";
		mes "�����܂ꂿ�Ⴄ�����ˁB";
		mes "���`��B";
		next;
		emotion 52;
		mes "[�n���o�[�h]";
		mes "�������I���������΁A";
		mes "�ŋ߁A�X�U���k�̓C�Y���[�h��";
		mes "����ɒʂ��Ă�����ĕ��������A";
		mes "�����̓���̓X���Ȃ�";
		mes "�ޏ��̍D�݂�";
		mes "�c�����Ă��邩������Ȃ��I";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "^FF0000�C�Y���[�h�̓��^000000��";
		mes "�s���Ă݂Ă���Ȃ������H";
		next;
		menu "�킩�����I",-;
		mes "[�n���o�[�h]";
		mes "���肪�Ƃ��I";
		mes "���񂾂�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�C�Y���[�h�̓���̓X����";
		mes "�b��������]";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�I";
		mes "���񂾂�I";
		mes "^FF0000�C�Y���[�h�̓��^000000";
		mes "�ŃX�U���k�̂��Ƃ𕷂��Ă݂āI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�C�Y���[�h�̓���̓X����";
		mes "�b��������]";
		close;
	case 3:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�I";
		mes "�ǂ��������H";
		mes "�ޏ��̗~����������";
		mes "�����킩�����H";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ������́H";
		mes "�Â��炵�āc�c";
		next;
		emotion 52;
		mes "[�n���o�[�h]";
		mes "�͂͂��A�킩�������I";
		next;
		mes "[�n���o�[�h]";
		mes "�X�U���k�̗~��������";
		mes "����������ł���H";
		mes "���v�A�S�z���Ȃ��ł����I";
		mes "���̓��̂��߂ɁA";
		mes "�����͒��߂Ă����񂾂��炳�B";
		next;
		misceffect 28;
		mes "�]�C�̓ł����A�n���o�[�h��";
		mes "�C�Y���[�h�̓���ł̘b��񍐂����B";
		mes "�n���o�[�h�������Ă����̂��킩��]";
		next;
		mes "[�n���o�[�h]";
		mes "�ȁA";
		next;
		emotion 23;
		mes "[�n���o�[�h]";
		mes "�Ȃ񂾂��ā`�I";
		mes "�X�U���k�ɂ́A�����D���Ȑl��";
		mes "������Ă����̂���!!";
		mes "�������A�����N�̕�΂Ƃ��A";
		mes "����ȍ����Ȃ��̂��I";
		next;
		mes "[�n���o�[�h]";
		mes "�ЁA�Ђǂ�����`�`���I";
		mes "���͂��������I";
		next;
		mes "[�n���o�[�h]";
		mes "�c�c";
		mes strcharinfo(0) + "�A";
		mes "�ƁA�Ƃ肠�����A";
		mes "���ׂĂ���Ă��肪�Ƃ��c�c";
		if('@novice){
			mes "����͂��炾��B";
		}
		mes "������ƁA��l�ɂ����Ă���c";
		next;
		if('@novice){
			if(!checkweight(1210,1)) {
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 1210,1;
			//�_�[�N
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "���߂�A";
		mes "������ƁA��l�ɂ����Ă���c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
	goto L_OTHER;
L_QUEST03:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�v���Ԃ肾�ˁB";
		mes " ";
		mes "�S�z�b�c�c �S�z�b�I";
		next;
		mes "[�n���o�[�h]";
		mes "���A���߂�B";
		mes "�̒��������Ă��c";
		mes "�������A������񂾂���A";
		mes "�����悭�Ȃ��`";
		mes "�l�́A�ǂ����̂��キ�ĂˁB";
		next;
		mes "[�n���o�[�h]";
		mes "�{��������ƁA����A";
		mes strcharinfo(0) + "��";
		mes "�X�U���k�̍D���Ȑl��";
		mes "�ǂ������l�����ׂė~�����񂾁B";
		next;
		menu "���́H",-;
		mes "[�n���o�[�h]";
		mes "�ޏ��̗c����Ƃ��āA";
		mes "���̒j���A";
		mes "�X�U���k�ɑ��������l���ǂ���";
		mes "�m�肽���񂾂�B";
		next;
		mes "[�n���o�[�h]";
		mes "�u�c�u�c�c�c";
		mes "�i�����A�ޏ���������悤�ȓz�Ȃ�A";
		mes "�������A�l�����̎�Łc�c�j";
		next;
		menu "���A�����������H",-;
		mes "[�n���o�[�h]";
		mes "����A���������ĂȂ���B";
		next;
		menu "�{���͂܂��X�U���k�̂��Ƃ��c�c",-;
		mes "[�n���o�[�h]";
		mes "�c�c";
		mes "�{���́A�l�͔ޏ��̂��Ƃ�";
		mes "�܂������Ă����B";
		mes "�ł���̂ł���΁A";
		mes "���̋C������`�������c�c";
		next;
		menu "�`��������������",-;
		mes "[�n���o�[�h]";
		mes "����A����͂ł��Ȃ����āI";
		mes "�ޏ������f���������Ȃ��񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "�ƁA�Ƃ肠�����A�X�U���k��";
		mes "�X�U���k�̍D���Ȑl�̎���";
		mes "�����Ă݂Ă���Ȃ����ȁB";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�O�A�X�U���k�́A";
		mes "�����N�ɕ�΂�T���ɍs������";
		mes "�����Ă���ˁH";
		next;
		mes "[�n���o�[�h]";
		mes "����ŁA�����A�X�U���k�́A";
		mes "�����N�̕�Ώ���";
		mes "����ł�����΂�";
		mes "�󂯎��ɍs���炵���񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "�����ŁA����͂ǂ�Ȑl��";
		mes "�����Ă݂Ă���Ȃ������H";
		mes "�i���̑���̎�_�Ƃ��c�c�j";
		next;
		menu "���́A�ޏ����s�����Ēm���Ă���́H",-;
		mes "[�n���o�[�h]";
		mes "����́A�l��";
		mes "�����N�̕�Ώ��̏��ɐ��肵��";
		mes "���������c�c";
		mes "�S�z�b�S�z�b�A";
		mes "�܂��A���Œm���Ă��邩��";
		mes "��������Ȃ����I";
		next;
		mes "[�n���o�[�h]";
		mes "�����N�ɂ����Ώ��̂Ƃ��낾��B";
		mes "�����I ���̓s���~�b�h���ӂ�";
		mes "�L�����v�ɔ��Ă���񂾂����B";
		mes "�����N�̖k������B";
		mes "�킩�����ˁH ���񂾂�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�����N�̃s���~�b�h���ӂ�";
		mes "��Ώ��̏ꏊ�ɍs���A";
		mes "�X�U���k�ɘb��������]";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		//������
		mes "[�n���o�[�h]";
		mes "�����N�ɂ����Ώ��̂Ƃ��낾��B";
		mes "�����I ���̓s���~�b�h���ӂ�";
		mes "�L�����v�ɔ��Ă���񂾂����B";
		mes "�����N�̖k������B";
		mes "�킩�����ˁH ���񂾂�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�����N�̃s���~�b�h���ӂ�";
		mes "��Ώ��̏ꏊ�ɍs���A";
		mes "�X�U���k�ɘb��������]";
		close;
	case 3:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�I";
		mes "�ǂ��������H";
		mes "�X�U���k�̍D���Ȑl�̂���";
		mes "�킩�����H";
		next;
		mes "�]�X�U���k�Ƙb�������e��񍐂����]";
		next;
		mes "[�n���o�[�h]";
		mes "���O�͂킩��Ȃ��������`�A�c�O�B";
		mes "�ł��A���̒j�́A�ƂĂ��D�����l�ŁA";
		mes "�̂��ア�̂ɁA����";
		mes "�X�U���k����낤�Ƃ���A���B";
		next;
		mes "[�n���o�[�h]";
		mes "�܂��A�D�������Č����Ă��A";
		mes "�l�ԂȂ��Ȃ��{����";
		mes "�킩��Ȃ�����ˁB";
		mes "���̒j���ǂ������ˁB";
		next;
		mes "[�n���o�[�h]";
		mes "�����āA�̂��ア���c�c";
		mes "�ӂ�A�̂̎コ�Ȃ�";
		mes "�l�����ĕ����ĂȂ����B";
		mes "����ɖl�����ăX�U���k����낤��";
		mes "���Ă������c�c";
		next;
		emotion 28;
		mes "[�n���o�[�h]";
		mes "�������A����Ȃ̂ɂȂ��c�c";
		mes "���A����܂肾�c�c";
		mes "�������c�c";
		next;
		mes "[�n���o�[�h]";
		mes "�˂��A";
		mes strcharinfo(0) + "�A";
		mes "�Ƃ���ŁA���̒j�͂��A";
		mes "��͂ǂ̓���ʂ��ċA���Ă���Ƃ�";
		mes "�����ĂȂ����ȁH";
		next;
		mes "[�n���o�[�h]";
		mes "���A����Ȋ�Ō��Ȃ��ł�B";
		mes "�ʂɐ[���Ӗ��͂Ȃ���A";
		mes " ";
		mes "�c�c";
		mes "�S�z�b�A�S�z�S�z�b�I";
		next;
		mes "[�n���o�[�h]";
		mes "�S�z�b�A�S�z�S�z�b�I";
		mes "���A���߂�A";
		mes "�܂���������Ȃ��Ă����݂����B";
		next;
		mes "[�n���o�[�h]";
		mes "�S�z�b�A�S�z�S�z�b�I";
		mes "������ނ��炿����Ƒ҂��ĂˁB";
		mes " ";
		mes "���A�򂪂Ȃ��Ȃ肻�����ȁB";
		mes "�܂��Ⴂ�ɍs���Ȃ�����c�c";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "������F�X�A";
		mes "���ׂĂ���Ă��肪�Ƃ��ˁB";
		if('@novice){
			mes "����͂��炾��";
		}
		mes "�܂��A�������肢����������A";
		mes "��낵���ˁI";
		next;
		if('@novice){
			if(!checkweight(1010,7)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 1010,7;
			//�v���R��x7
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[�n���o�[�h]";
		mes "�S�z�b�A�S�z�S�z�b�I";
		mes "�򂪂Ȃ��Ȃ肻�����ȁB";
		mes "�܂��Ⴂ�ɍs���Ȃ�����c�c";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "������F�X�A";
		mes "���ׂĂ���Ă��肪�Ƃ��ˁB";
		mes "�܂��A�������肢����������A";
		mes "��낵���ˁI";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
	goto L_OTHER;
L_QUEST04:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�S�z�b�A�S�z�b�c�c";
		mes "�v���Ԃ肾�ˁc�c";
		next;
		mes "[�n���o�[�h]";
		mes "�̒������̒ʂ舫���Ă��B";
		mes "�򂪂���Ă��܂��āc�c";
		mes "�Ƃ�ɍs�������Ă��A";
		mes "�̂��������Ƃ𕷂��Ȃ��āA";
		mes "�Ƃ�ɂ����Ȃ��񂾁B";
		mes "�S�z�b�A�S�z�b�c�c";
		next;
		mes "[�n���o�[�h]";
		mes "�\����Ȃ����ǁA";
		mes "�l�̎厡��̂Ƃ����";
		mes "���Ⴂ�ɂ����Ă���Ȃ����ȁH";
		next;
		menu "�킩�����I",-;
		emotion 15;
		mes "[�n���o�[�h]";
		mes "�S�z�b�A�S�z�b�c�c";
		mes "���肪�Ƃ��B";
		mes "�l�̎厡��́A^FF0000�Q�t�F��^000000�ɂ���񂾁B";
		mes "���񂾂�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�Q�t�F���ɂ����҂ɘb��������]";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[�n���o�[�h]";
		mes "�S�z�b�A�S�z�b�c�c";
		mes "�l�̎厡��́A^FF0000�Q�t�F��^000000�ɂ���񂾁B";
		mes "�S�z�b�A�S�z�b�c�c";
		mes "��𗊂񂾂�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�Q�t�F���ɂ����҂ɘb��������]";
		close;
	case 3:
		emotion 15;
		mes "[�n���o�[�h]";
		mes "���A" + strcharinfo(0) + "�B";
		mes "������Ă��Ă��ꂽ�񂾂ˁI";
		mes "���肪�Ƃ��I";
		next;
		mes "�]�n���o�[�h�̑̒����悳�������B";
		mes "�o���[�搶����������";
		mes "����n���o�[�h�ɓn�����]";
		next;
		mes "[�n���o�[�h]";
		mes "���́A�������A�X�U���k��";
		mes "��������Ă��Ă��ꂽ�񂾁I";
		mes "��������񂾂���A";
		mes "�啪�A�̒����ǂ��Ȃ����񂾁`�B";
		next;
		emotion 2;
		mes "[�n���o�[�h]";
		mes "����ς�A�X�U���k�͗D�����Ȃ��B";
		mes "���������c�c";
		mes "�܂�œV�g�̂悤�������Ȃ��B";
		next;
		mes "[�n���o�[�h]";
		mes "�́A�悭�o���[�搶�̂Ƃ����";
		mes "�X�U���k��";
		mes "�t���Y���Ă�����Ă����Ȃ��B";
		mes "���̍�����ς�炸�D�����񂾂Ȃ��B";
		mes "���������c";
		next;
		mes "[�n���o�[�h]";
		mes "���͍ŋ߁A";
		mes "�X�U���k�Ƙb������̂��炭�āA";
		mes "�b���������Ă��₽�����Ă����񂾁B";
		mes "����Ȃ̂Ɂc�c";
		next;
		emotion 28;
		mes "[�n���o�[�h]";
		mes "����Ȃ̂ɁA";
		mes "�l���A�̒������̂ɋC�t���āc�c";
		mes "��������܂Ŏ����Ă��Ă����Ȃ�āB";
		mes "�������A�X�U���k�c�c";
		next;
		mes "[�n���o�[�h]";
		mes "�͂��������c�c";
		mes "���́A���̍K���ȋC������";
		mes "���킢�������B";
		next;
		menu "�X�U���k�Ɋ��ӂ��Ȃ��Ƃ�",-;
		mes "[�n���o�[�h]";
		mes "�������A�X�U���k�I";
		mes "�₽�������l�̋�������";
		mes "�����Ă������!!";
		next;
		emotion 9,"";
		mes "[�n���o�[�h]";
		mes "�������A�X�U���k�I";
		mes "�D�����I";
		mes "��D�������I";
		next;
		menu "�c�c",-;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[�n���o�[�h]";
		mes "�͂��������c�c";
		mes "���́A���̍K���ȋC������";
		mes "���킢�������B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
	goto L_OTHER;
L_QUEST06:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�v���Ԃ肾�ˁB";
		mes "���̑O�͖��͂��Ă����";
		mes "���肪�Ƃ��I";
		next;
		mes "[�n���o�[�h]";
		mes "���́A";
		mes strcharinfo(0) + "��";
		mes "�܂����肢������񂾁c�c";
		next;
		menu "�X�U���k�̂��ƁH",-;
		mes "[�n���o�[�h]";
		mes "�����A";
		mes "�X�U���k�̂��ƂȂ񂾂��ǁc";
		next;
		mes "[�n���o�[�h]";
		mes "�X�U���k���R���h�ɍs�����񂾁B";
		mes "�ԈႢ�Ȃ��A�m�G���A�ɉ����";
		mes "���Ǝv���B";
		next;
		menu "�m�G���A�H",-;
		mes "[�n���o�[�h]";
		mes "�m�G���A�́A";
		mes "�l�ƃX�U���k�̐e�F�łˁA";
		mes "�̂͂���3�l�ŗV��ł����񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "���̃m�G���A�́A";
		mes "�����O�ɁA�_���T�[�ɂȂ肽���I";
		mes "���Č��������āA";
		mes "�R���h�ɋ}�ɍs�����񂾂�B";
		next;
		menu "�m�G���A�ɉ�ɍs���̂ɉ�����肪�H",-;
		mes "[�n���o�[�h]";
		mes "�m�G���A�ɉ�ɍs���̂�";
		mes "���Ȃ񂶂�Ȃ��񂾂�B";
		mes "1�l�ŉ�ɍs�������Ƃ�";
		mes "���Ȃ񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "�l�B��3�l�Ƃ��e�F�Ȃ񂾁B";
		mes "�ȑO�A�R���h�Ƀm�G���A�ɉ��";
		mes "�s�������́A�l�ƃX�U���k��";
		mes "2�l�ōs�����񂾂�B";
		next;
		mes "[�n���o�[�h]";
		mes "�ł��A����̓X�U���k��1�l�ōs�����c";
		mes "���ꂩ�猾�����Ƃ�";
		mes "�l�̎v�����݂�������Ȃ����ǁA";
		mes "���Ԃ�A�X�U���k���D���Ȑl��";
		mes "�֌W���Ă���悤�ȋC������c�c";
		next;
		emotion 54;
		mes "[�n���o�[�h]";
		mes "�����āA��������H";
		mes "�l�������Ă������Ă��Ƃ͂����B";
		mes "�Ȃ񂩂������₵����B";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "���肢������A^FF0000�R���h^000000�ɍs����";
		mes "�l�q�����Ă��Ă���Ȃ������H";
		mes "�����牽�܂ŗ����";
		mes "�\����Ȃ����ǁA���肢����B";
		next;
		menu "�킩������",-;
		mes "[�n���o�[�h]";
		mes "���肪�Ƃ��I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�R���h�ɂ���";
		mes "�X�U���k�ƃm�G���A�̗l�q������]";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[�n���o�[�h]";
		mes "^FF0000�R���h^000000�ɍs���āA�X�U���k��";
		mes "�l�q�����Ă��Ă���Ȃ������H";
		mes "�����牽�܂ŗ����";
		mes "�\����Ȃ����ǁA���肢����B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�R���h�ɂ���";
		mes "�X�U���k�ƃm�G���A�̗l�q������]";
		close;
	case 3:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ��������H";
		next;
		mes "�]�n���o�[�h�ɁA�R���h�ł̂��Ƃ�";
		mes "�񍐂����]";
		next;
		mes "[�n���o�[�h]";
		mes "�������A";
		mes "�X�U���k���m�G���A��";
		mes "���k���Ă����񂾂ˁB";
		mes "�����āA���̑��k�͗��̑��k";
		mes "�̂悤�ł������ƁB";
		next;
		emotion 54;
		mes "[�n���o�[�h]";
		mes "�͂����������B";
		mes "���̑��k�����B";
		mes "��͂�A�V���b�N���Ȃ��B";
		next;
		mes "[�n���o�[�h]";
		mes "�ł������A�l�������Ă��ڂ�ɂ��āA";
		mes "�X�U���k�A�m�G���A�A";
		mes "�R���h�Ŋy�����V��ł��邱�Ƃ܂�";
		mes "�l���Ă�������A";
		next;
		mes "[�n���o�[�h]";
		mes "���������A���S������B";
		mes "�������A�܂��A�X�U���k��";
		mes "�������Ă��Ȃ��񂾂ˁB";
		next;
		menu "���̂܂܂ł����́H",-;
		mes "[�n���o�[�h]";
		mes "�c�c";
		next;
		menu "�X�U���k�͌N�̂��Ƃ��D�����Ǝv��",-;
		mes "[�n���o�[�h]";
		mes "�c�c";
		mes "���������Ă���Ă��肪�Ƃ��B";
		mes "�l�ɗE�C������悤�Ƃ��āB";
		mes "�ł��A����Ȃ킯�͂Ȃ���B";
		next;
		mes "[�n���o�[�h]";
		mes "�ł��A���߂���B";
		mes "�����N�΂���ɗ����āA";
		mes "�l�͉������Ă��Ȃ��c�c";
		mes "�C������`���邱�Ƃ��炵�Ă��Ȃ��I";
		next;
		mes "[�n���o�[�h]";
		mes "�N�́A�l�̂��߂�";
		mes "���낢��ȓs�s��";
		mes "�����Ă���Ă���̂Ɂc�c";
		mes "�l�͍��܂ň�́A";
		mes "�������Ă����񂾂낤�c�c";
		next;
		mes "[�n���o�[�h]";
		mes "�c�c���肪�Ƃ��B";
		mes "�N�̎p�����āA�C�t������B";
		next;
		mes "[�n���o�[�h]";
		mes "�l�A�X�U���k�ɍ��������I";
		mes "��΂ɂ��I";
		mes "�X�U���k�ɍD���Ȑl�����Ă�";
		mes "���܂�Ȃ����I";
		next;
		mes "[�n���o�[�h]";
		mes "�l�̋C������`�����!!";
		mes " ";
		mes strcharinfo(0) + "�A";
		mes "���肪�Ƃ��I";
		if('@novice){
			mes "����́A�N�ւ̂��炾��B";
		}
		next;
		if('@novice){
			if(!checkweight(1216,1)) {
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 1216,1;
			//�X�`��
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[�n���o�[�h]";
		mes "�l�A�X�U���k�ɍ��������I";
		mes "��΂ɂ��I";
		mes "�X�U���k�ɍD���Ȑl�����Ă�";
		mes "���܂�Ȃ����I";
		next;
		//������
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
	goto L_OTHER;
L_QUEST07:
	switch(AC_QUEST_ST_0) {
	case 1:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�悭���Ă��ꂽ�ˁB";
		next;
		mes "[�n���o�[�h]";
		mes "���́A�X�U���k�ɌĂяo����";
		mes "�󂯂��񂾁B";
		mes "�ꏊ�́A";
		mes "^FF0000���J�s�g�[���i�C���@�B^000000";
		next;
		mes "[�n���o�[�h]";
		mes "���Ԃ�X�U���i��";
		mes "�����ŁA�l�ɁA�D���Ȑl�̑��k��";
		mes "���悤�Ƃ��Ă���񂾂낤�ˁB";
		next;
		mes "[�n���o�[�h]";
		mes "�ł��A�l�͂��̏ꏊ�ŁA�X�U���k��";
		mes "�������悤�Ǝv���B";
		next;
		mes "[�n���o�[�h]";
		mes "�����A���̋C������}���邱�Ƃ�";
		mes "�ł��Ȃ��񂾂��I";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�ɂ�";
		mes "�����A���͂��Ă��������ˁB";
		mes "������A";
		mes "�l�̍��������͂��ė~�����񂾁B";
		next;
		menu "������",-;
		mes "[�n���o�[�h]";
		mes "���肪�Ƃ��I";
		mes "^FF0000���J�s�g�[���i�C���@^000000";
		mes "�ő҂����킹�悤�B";
		mes "�l�́A��ɍs���Ă��邩��ˁB";
		next;
		mes "[�n���o�[�h]";
		mes "���J�s�g�[���i�C���@�ւ́A";
		mes "^0000FF���̃v�����e���̊X����";
		mes "�܂�����1�}�b�v�s���āA";
		mes "�k��1�}�b�v�A�����ē���1�}�b�v";
		mes "�ړ�����΍s�����B^000000";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���J�s�g�[���i�C���@�ɍs���A";
		mes "�n���o�[�h�ɘb��������]";
		close2;
		set AC_QUEST_ST_0,2;
		viewpoint 1,289,203,11,0x0000FF;
		end;
	case 2:
		mes "[�n���o�[�h]";
		mes "���n�ő҂����킹�悤�B";
		mes "���J�s�g�[���i�C���@�ւ́A";
		mes "^0000FF���̃v�����e���̊X����";
		mes "�܂�����1�}�b�v�s���āA";
		mes "�k��1�}�b�v�A�����ē���1�}�b�v";
		mes "�ړ�����΍s�����B^000000";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���J�s�g�[���i�C���@�ɍs���A";
		mes "�n���o�[�h�ɘb��������]";
		close2;
		viewpoint 1,289,203,11,0x0000FF;
		end;
	}
	goto L_OTHER;
L_QUEST08:
	switch(AC_QUEST_ST_0) {
	case 2:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "���߂�A�l�͂�����";
		mes "�o�����Ȃ����Ⴂ���Ȃ��񂾁B";
		next;
		mes "�]�X�U���k���S�z���Ă������Ƃ�";
		mes "�`�����]";
		next;
		mes "[�n���o�[�h]";
		mes "�l���A���ꂩ�炸���ƁA";
		mes "���̃��r�[�Ɠ������炢�̃��r�[��";
		mes "�T���Ă���񂾁B";
		mes "�����N�̕�Ώ��ɕ�������A";
		mes "���́A���̃��r�[�قǂ̕�΂�";
		mes "�����Ă��Ȃ��񂾂��āB";
		next;
		mes "[�n���o�[�h]";
		mes "����́A�A���i�x���c������";
		mes "�̌@���ꂽ��΂炵���Ă��B";
		mes "�A���i�x���c�����̕���";
		mes "�ʂ��Ă���񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "�S�z�b�A�S�z�b�I";
		mes "���߂�A������Ɣ��Ă��ĂˁB";
		mes "�X�U���k�Ƃ�������";
		mes "���r�[�̃y�A�����O���~��������ˁB";
		mes "������A�撣���B";
		next;
		mes "[�n���o�[�h]";
		mes "���r�[�������āA";
		mes "����Ń����O���������c�c";
		mes "���̎��A�X�U���k�Ƀv���|�[�Y";
		mes "���悤�Ǝv���񂾁B";
		next;
		mes "[�n���o�[�h]";
		mes "���߂�A���낻��s���ˁB";
		mes "�X�U���k�ɂ́A";
		mes "�������������҂��ĂĂˁA";
		mes "�Ɠ`���Ă����ė~�����B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "(�X�U���k�ɕ񍐂��悤�B)";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�C�Y���[�h�ɂ���X�U���k��";
		mes "�񍐂��悤�]";
		close2;
		set AC_QUEST_ST_0,3;
		end;
	case 3:
		mes "[�n���o�[�h]";
		mes "���߂�A���낻��s���ˁB";
		mes "�X�U���k�ɂ́A";
		mes "�������������҂��ĂĂˁA";
		mes "�Ɠ`���Ă����ė~�����B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�C�Y���[�h�ɂ���X�U���k��";
		mes "�񍐂��悤�]";
		close;
	}
	goto L_OTHER;
L_QUEST09:
L_OTHER:
	switch(AC_QUEST_LV_0){
	case 1:
		mes "[�n���o�[�h]";
		mes "�{���ɂ��肪�Ƃ��I";
		mes "�N�͖{���ɂ����l���ˁB";
		mes "�܂��N�ɑ��k�����I";
		close;
	case 2:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "���߂�A";
		mes "������ƁA��l�ɂ����Ă���c";
		close;
	case 3:
		mes "[�n���o�[�h]";
		mes "�S�z�b�A�S�z�S�z�b�I";
		mes "�򂪂Ȃ��Ȃ肻�����ȁB";
		mes "�܂��Ⴂ�ɍs���Ȃ�����c�c";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "������F�X�A";
		mes "���ׂĂ���Ă��肪�Ƃ��ˁB";
		mes "�܂��A�������肢����������A";
		mes "��낵���ˁI";
		close;
	case 4:
	case 5:
		mes "[�n���o�[�h]";
		mes "�͂��������c�c";
		mes "���́A���̍K���ȋC������";
		mes "���킢�������B";
		close;
	case 6:
	case 7:
	case 0:
		mes "[�n���o�[�h]";
		mes "�����A�X�U���k�c�c";
		mes "�ޏ��̂��Ƃ�z����";
		mes "��������􂯂������c�c";
		close;
	case 8:
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "���߂�A�l�͂�����";
		mes "�o�����Ȃ����Ⴂ���Ȃ��񂾁B";
		close;
	case 9:
		/*���O�Ȃ��Ŗ{�I�ǂ���*/
		mes strcharinfo(0) + "�A";
		mes "�{���ɂ��肪�Ƃ��I";
		close;
	}
}
izlude_in.gat,108,55,4		script	�X��#AC_QUE02	951,{
	mes "[�}���A��]";
	mes "��������Ⴂ�܂��I";
	if(AC_QUEST_LV_0>1 && AC_QUEST_ST_0!=2) goto L_OTHER;
	if(AC_QUEST_LV_0!=1 && AC_QUEST_ST_0!=2) close;
	next;
	menu "���������������Ƃ��c",-;
	emotion 1;
	mes "[�}���A��]";
	mes "�͂��A���ł��傤�H";
	next;
	menu "�X�U���k�Ƃ���������m���Ă��܂����H",-;
	mes "[�}���A��]";
	mes "����A";
	mes "�X�U���k�̂��F�B�H";
	mes "�X�U���k��";
	mes "�悭���̂��X�ɗ�����B";
	next;
	menu "���̕i�������Ă��܂������H",-;
	mes "[�}���A��]";
	mes "�ޏ��A�����Ń����O��";
	mes "�����Ă������B";
	mes "�E�t�t�A���̎q�A";
	mes "�D���Ȑl�ɂ�����Ƃ�����";
	mes "�����Ă�����B";
	mes "���`�A�Ⴂ���Ă�����ˁ`�B";
	next;
	mes "[�}���A��]";
	mes "���̃����O�ɂ����΂�";
	mes "�����N�ɒT���ɍs������";
	mes "���������ɘb���Ă�����B";
	next;
	mes "[�}���A��]";
	mes "��������炦��ގ���";
	mes "���̎����猩�Ă������܂�����ˁB";
	mes "����ȉ����q�A�ő��ɂ��Ȃ����́B";
	next;
	menu "����̖��O���Ă킩��܂����H",-;
	mes "[�}���A��]";
	mes "���߂�Ȃ����B";
	mes "���O�܂ł͕����Ă��Ȃ��̂�B";
	mes "�܂��������Ă���킯����Ȃ��āA";
	mes "�X�U���k�̕Ўv���炵����B";
	mes "���܂������Ƃ�����ˁI";
	next;
	mes "�]�n���o�[�h�ɕ񍐂��悤�B";
	mes "�n���o�[�h�͑ς����邾�낤���H�]";
	next;
L_REP:
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]�v�����e���ɂ���";
	mes "�n���o�[�h�ɕ񍐂���]";
	close2;
	set AC_QUEST_ST_0,3;
	end;
L_OTHER:
	mes "[�}���A��]";
	mes "�X�U���k�A���܂������Ƃ�����ˁB";
	if(AC_QUEST_LV_0==1 || AC_QUEST_ST_0==3) goto L_REP;
	close;
}
function	script	��Ώ�FUNC#AC_QUE00	{
	if(AC_QUEST_ST_0==3){
		mes "[�����[�N]";
		mes "���C�ɓ��蒸���܂������H";
		next;
		if(strnpcinfo(1)=="�X�U���k"){
			emotion 33,"�X�U���k#AC_QUE00SZ01";
			//�X�U���k�ɘb���������Ƃ��ɂ����o�Ȃ�
		}
		mes "[�X�U���k]";
		mes "�͂��A�Ƃ��Ă��I";
		mes "���̃��r�[�A";
		mes "�����Ɣނ��C�ɓ����Ă�����I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�v�����e���ɂ���";
		mes "�n���o�[�h�ɕ񍐂���]";
		close;
	}
	mes "[�����[�N]";
	mes "�X�U���k����B";
	mes "���҂����Ă���܂����B";
	mes "���񑩂̕i�A�o���Ă��܂���B";
	next;
	mes "�]��Ώ��炵���j���A";
	mes "�q�炵�������Ƙb�����Ă���]";
	next;
	mes "[�����[�N]";
	mes "�X�U���k����B";
	mes "������ɂȂ�܂��B";
	next;
	mes "�]��Ώ��̒j���A";
	mes "�Q�̕�΂��X�U���k�ɓn�����]";
	next;
	//�S�p�����Ŗ{�I�ǂ���
	emotion 2,"�X�U���k#AC_QUE00SZ01";
	mes "[�X�U���k]";
	mes "�킟�c�c";
	next;
	mes "[�����[�N]";
	mes "���C�ɓ��蒸���܂������H";
	next;
	emotion 33,"�X�U���k#AC_QUE00SZ01";
	mes "[�X�U���k]";
	mes "�͂��A�Ƃ��Ă��I";
	mes "���̃��r�[�A";
	mes "�����Ɣނ��C�ɓ����Ă�����I";
	next;
	mes "�]�X�U���k�ɒN�Ƀv���[���g���邩";
	mes "�����Ă݂悤�]";
	next;
	menu "�X�e�L�ȕ�΂ł��ˁB",-;
	mes "[�X�U���k]";
	mes "���A���肪�Ƃ��B";
	next;
	menu "�v���[���g�H",-;
	mes "[�X�U���k]";
	mes "���A����c�c";
	mes "�����ƍD���������l��";
	mes "�v���[���g���悤�Ǝv���āc�c";
	next;
	mes "[�X�U���k]";
	mes "���Ɣނ́A�����a�����ŁA";
	mes "�a���΂́A���r�[�B";
	mes " ";
	mes "�����낢�̃��r�[�̃y�A�����O��";
	mes "��낤�Ǝv���́B";
	next;
	menu "���̐l�̖��O�́H",-;
	mes "[�X�U���k]";
	mes "���A���O�H";
	mes "������ƁA����͌����Ȃ���B";
	mes "���߂�Ȃ����B";
	next;
	mes "[�X�U���k]";
	mes "�ł��A�ƂĂ��D�����l�Ȃ́B";
	mes "�̂��ア�̂ɁA����";
	mes "������낤�Ƃ��Ă���āc�c";
	next;
	menu "�c�c ���܂������Ƃ����ˁB",-;
	emotion 15,"�X�U���k#AC_QUE00SZ01";
	mes "[�X�U���k]";
	mes "���肪�Ƃ��I";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "(�n���o�[�h�ɕ񍐂��悤�B)";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]�v�����e���ɂ���";
	mes "�n���o�[�h�ɕ񍐂���]";
	close2;
	set AC_QUEST_ST_0,3;
	end;
}
moc_ruins.gat,114,100,4		script	�X�U���k#AC_QUE00SZ01	90,{
	if(AC_QUEST_LV_0==2 && (AC_QUEST_ST_0==2 || AC_QUEST_ST_0==3)) callfunc "��Ώ�FUNC#AC_QUE00";
	if(AC_QUEST_LV_0==4){
		switch(AC_QUEST_ST_0){
		case 2:
			mes "[�X�U���k]";
			mes "���A���Ȃ��́c�c";
			next;
			menu "�͂��A�ǂ����B",-;
			mes "�]�a�����Ă����w�ւ������Ă��锠��";
			mes "2�A�X�U���k�ɓn�����]";
			next;
			mes "[�X�U���k]";
			mes "���Ȃ����w�ւ������Ă��Ă��ꂽ�̂ˁA";
			mes "���肪�Ƃ��B";
			next;
			emotion 40;
			mes "�]�X�U���k�́A�������Ɣ����������B";
			mes "�����Ē������āA���ߑ��������]";
			next;
			mes "[�X�U���k]";
			mes "�킟�A�Y��c�c";
			mes "�{�����Y��Ȏw�ցc�c";
			next;
			mes "[�����[�N]";
			mes "�����Ȏw�ւł��ˁB";
			mes "�������A�W�F�����h����B";
			mes "���̕��̎d���Ԃ�ɂ́A";
			mes "������������܂��B";
			next;
			emotion 40;
		case 3:
			mes "[�X�U���k]";
			mes "�{�����Y��Ȏw�ցc�c";
			mes "���̐l�A���ł���邩�ȁc�c";
			next;
			mes "�]�X�U���k�́A�w�ւ����āA";
			mes "���΂�ł���]";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�t�F�C�����̎w�֐E�l�W�F�����h��";
			mes "�񍐂���]";
			close2;
			set AC_QUEST_ST_0,3;
			end;
		}
	}
	mes "[�X�U���k]";
	mes "�����[�N����̈�����΂�";
	mes "�ƂĂ��Y��Ȃ́B";
	close;
}
moc_ruins.gat,116,100,4		script	��Ώ�#AC_QUE00	47,{
	if(AC_QUEST_LV_0==2 && (AC_QUEST_ST_0==2 || AC_QUEST_ST_0==3)) callfunc "��Ώ�FUNC#AC_QUE00";
	mes "[�����[�N]";
	mes "���A��Ώ����c��ł���";
	mes "�����[�N�Ɛ\���܂��B";
	mes "�Ȍ�A�䌩�m�肨�����B";
	close;
}
geffen_in.gat,113,104,4		script	�X�U���k#AC_QUE00SZ02	90,{
	if(AC_QUEST_LV_0==3){
		switch(AC_QUEST_ST_0){
		case 2:
			mes "�]�X�U���k����҂炵��";
			mes "�j�ɘb�������Ă���]";
			close;
		case 3:
			emotion 19;
			mes "[�X�U���k]";
			mes "���Ȃ��́A�����N�ŉ�����c�c";
			mes "���A���߂�ˁB";
			mes "�}���ŁA���̂����";
			mes "�͂��Ȃ����Ⴂ���Ȃ��́I";
			close;
		}
	}
	mes "[�X�U���k]";
	mes "����ɂ��́B";
	mes "���́A�o���[�搶�̂Ƃ���ɁA";
	mes "��������炢�ɂ����́B";
	close;
}
geffen_in.gat,113,101,4		script	���#AC_QUE00	121,{
	if(AC_QUEST_LV_0==3){
		switch(AC_QUEST_ST_0){
		case 2:
			mes "�]�X�U���k����҂ɘb�������Ă���]";
			next;
			emotion 19,"�X�U���k#AC_QUE00SZ02";
			mes "[�X�U���k]";
			mes "�搶�A";
			mes "�ށA�܂��̒���";
			mes "�����݂����Ȃ�ł��I";
			mes "����؂�Ă��܂����݂����Łc�c";
			next;
			mes "[�X�U���k]";
			mes "������A�ނ̂�����";
			mes "���Ⴂ�ɂ�����ł��B";
			next;
			mes "[�o���[]";
			mes "�������A�ł�";
			mes "�����ɖ���������悤�B";
			next;
			mes "�]��҂́A�X�U���k�ɖ��n�����]";
			next;
			mes "[�X�U���k]";
			mes "�搶�A���肪�Ƃ��������܂��I";
			mes "�}���ŁA�ނɓn���Ă��܂��I";
			next;
			mes "[�o���[]";
			mes "���ށA�}���ň��܂��Ă����Ȃ����B";
			next;
			mes "�]��҂́A�X�U���k�̑Ή����I�����";
			mes "������������]";
			next;
			mes "[�o���[]";
			mes "���ށA���̕��c�c";
			next;
			mes "�]�n���o�[�h�̌��ɂ��Ęb�����]";
			next;
			mes "[�o���[]";
			mes "�n���o�[�h�̖���Ƃ�ɗ����H";
			mes "�n���o�[�h��";
			mes "�����F�B�������ς�����悤����ȁB";
			next;
			menu "�H",-;
			mes "[�o���[]";
			mes "��𑽂������Ă��Ă�";
			mes "���邱�Ƃ��Ȃ����낤�B";
			mes " ";
			mes "�ق�A�򂾁B";
			next;
			mes "�]����󂯂Ƃ����]";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�v�����e���ɂ���";
			mes "�n���o�[�h�ɖ��n���]";
			close2;
			set AC_QUEST_ST_0,3;
			end;
		case 3:
			mes "[�o���[]";
			mes "�򂪂Ȃ��Ȃ�����A";
			mes "���ł����Ȃ����B";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�v�����e���ɂ���";
			mes "�n���o�[�h�ɖ��n���]";
			close;
		}
	}
	mes "[�o���[]";
	mes "�킵�̖��́A�o���[�B";
	mes "��҂ł���B";
	mes "���N�ɂ͋C������̂����B";
	close;
}
payon_in01.gat,6,55,4		script	�w�֐E�l#AC_QUE00	901,{
	if(AC_QUEST_LV_0==4){
		switch(AC_QUEST_ST_0){
		case 1:
			mes "[�W�F�����h]";
			mes "���A�悭���Ă��ꂽ�ȁI";
			mes "�킵���A����˗�����";
			mes "�W�F�����h����I";
			next;
			mes "[�W�F�����h]";
			mes "�w�ւ������40�N�I";
			mes "�킵�́A�w�֐E�l�����Ă�����I";
			next;
			mes "[�W�F�����h]";
			mes "�ق��A���܂�����A";
			mes "�Ȃ��Ȃ������w�����Ă���̂��B";
			mes "���̎d���Ɍ����Ă���������ȁB";
			next;
			mes "[�W�F�����h]";
			mes "���`�ށA���͎w�ւ����";
			mes "��`�����˗����悤���̂��B";
			next;
			menu "����̈˗����e�́H",-;
			mes "[�W�F�����h]";
			mes "���񂨊肢�������̂́A";
			mes "�킵�̍�����w�ւ��A";
			mes "���}�A�˗���ɓ͂��ė~�����̂���B";
			mes "�ق�A���ꂶ��B";
			next;
			mes "[�W�F�����h]";
			mes "�ǂ�����H";
			mes "�����o�������B";
			mes "���̃����O�̑����Ƃ����A";
			mes "�킵�̟Ӑg�̍�i�����B";
			next;
			mes "[�W�F�����h]";
			mes "���̃��r�[�̎w�ւ�";
			mes "2�͂��Ă���B";
			mes "�ꏊ�́A�����N�s���~�b�h���ӂ�";
			mes "��Ώ��̂Ƃ��낶��B";
			mes "�����ɁA���̎w�ւ̈˗��傪";
			mes "���Ă���͂�����B";
			next;
			emotion 0,"";
			mes "[�W�F�����h]";
			mes "�˗���̖��O�́A^FF0000�X�U���k^000000����B";
			mes "��낵�����ނ��B";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�����N�̃s���~�b�h���ӂ�";
			mes "��Ώ��̏ꏊ�ɂ���";
			mes "�X�U���k�ɉ���āA";
			mes "���r�[�̎w�ւ�n���]";
			close2;
			set AC_QUEST_ST_0,2;
			end;
		case 2:
			mes "[�W�F�����h]";
			mes "�ꏊ�́A^FF0000�����N��";
			mes "�s���~�b�h���ӂ̕�Ώ�^000000�̂Ƃ��낶��B";
			mes "�����ɁA���̎w�ւ̈˗��傪";
			mes "���Ă���͂�����B";
			mes "�˗���̖��O�́A^FF0000�X�U���k^000000����B";
			mes "��낵�����ނ��B";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "�]�����N�̃s���~�b�h���ӂ�";
			mes "��Ώ��̏ꏊ�ɂ���";
			mes "�X�U���k�ɉ���āA";
			mes "���r�[�̎w�ւ�n���]";
			close;
		case 3:
			mes "[�W�F�����h]";
			mes "�����A�͂��Ă��ꂽ���I";
			mes "���肪�Ƃ��I";
			mes "���܂�����A�d���������̂��B";
			next;
		case 99:
			mes "[�W�F�����h]";
			mes "�܂��A�������ގ������邩�������B";
			mes "���̍ۂ́A��낵�����ނ��B";
			next;
			mes "^FF0000�y�˗��B���z^000000";
			mes "�]�˗���B�������I";
			mes "�`���҃A�J�f�~�[��";
			mes "�񍐂��ɍs�����]";
			close2;
			set AC_QUEST_ST_0,99;
			end;
		}
	}
	mes "[�n���o�[�h]";
	/*�{�I�ʂ�*/mes "�킵�̖��̓W�F�����h����B";
	mes "�w�ւ������40�N�I";
	mes "�킵�́A�w�֐E�l�����Ă�����I";
	close;
}
function	script	�m�G���AFUNC#AC_QUE00	{
	mes "�]�X�U���k������B";
	mes "�X�U���k�����̐l�Ƙb�����Ă���B";
	mes "�����������ĂĂ݂�]";
	next;
	mes "[�X�U���k]";
	mes "�c�c�����Ȃ��Ă�";
	mes "�������̒��͍��܂Œʂ肾��ˁB";
	next;
	mes "[�m�G���A]";
	mes "�����A������I";
	mes "������O����Ȃ��I";
	mes "�S�z���Ȃ��ő��v����B";
	next;
	mes "[�X�U���k]";
	mes "�悩�����c�c";
	next;
	emotion 18,"�m�G���A#AC_QUE00";
	mes "[�m�G���A]";
	mes "���񂽁A����Ȃ���";
	mes "�킴�킴��������";
	mes "�m�F���ɗ���Ȃ��";
	mes "�{���ɁA���V�ˁ`�I";
	next;
	mes "[�X�U���k]";
	mes "�����āA�������e�F����Ȃ��B";
	mes "������c�c";
	next;
	emotion 18,"�m�G���A#AC_QUE00";
	mes "[�m�G���A]";
	mes "�S�z���Ȃ��A�S�z���Ȃ��I";
	mes "�������͂��܂ł����Ă��e�F��I";
	mes "����ɂ��Ă��A";
	mes "�����̂��Ƃ��D�c�c";
	next;
	emotion 0,"�m�G���A#AC_QUE00";
	//�����Ȏ��ԍ��Č��ł��邩�ȁH
	mes "�]���̎��A�b�ɔM�����Ă���2�l���A";
	mes strcharinfo(0) + "��";
	mes "���ɂ��邱�ƂɋC�t�����]";
	emotion 0,"�X�U���k#AC_QUE00SZ03";
	next;
	emotion 23,"�X�U���k#AC_QUE00SZ03";
	mes "[�X�U���k]";
	mes "�`�`�`�`�`�`�`�`��!!!!";
	mes strcharinfo(0) + "�I";
	next;
	mes "[�X�U���k]";
	mes "���A���̘b�A";
	mes "�S�����A�����Ă����́H";
	next;
	menu "�����ĂȂ���",-;
	emotion 54,"�X�U���k#AC_QUE00SZ03";
	mes "[�X�U���k]";
	mes "�͂��c�c";
	mes "�悩�����c�c";
	next;
	emotion 29,"�m�G���A#AC_QUE00";
	mes "[�m�G���A]";
	mes "����A�����ĂȂ������́H";
	mes "���Ⴀ�A���������S���b���Ă�����ˁB";
	mes "���̎q�ˁc�c";
	next;
	emotion 23,"�X�U���k#AC_QUE00SZ03";
	mes "[�X�U���k]";
	mes "������ƁA�m�G���A���I";
	mes "�{���ɂ�߂ā`�`�`�`!!";
	next;
	mes "�]�X�U���k���m�G���A�̌���";
	mes "�K���ɂӂ����ł���]";
	next;
	emotion 23,"�m�G���A#AC_QUE00";
	mes "[�m�G���A]";
	mes "���`�`�`���I";
	mes "���S���S�`�`�`�`�b!!";
	next;
	mes "[" + strcharinfo(0) + "]";
	mes "(�n���o�[�h�ɕ񍐂��悤�B)";
	next;
	mes "^FF0000�y�~�b�V�����z^000000";
	mes "�]�v�����e���ɂ���";
	mes "�n���o�[�h�ɕ񍐂���]";
	close2;
	set AC_QUEST_ST_0,3;
	end;
}
comodo.gat,165,163,4		script	�X�U���k#AC_QUE00SZ03	90,{
	if(AC_QUEST_LV_0==9) goto L_CLEAR;
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==2) callfunc "�m�G���AFUNC#AC_QUE00";
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==3) {
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�A";
		mes "�{���ɕ����ĂȂ������񂾂�ˁc�c";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�v�����e���ɂ���";
		mes "�n���o�[�h�ɕ񍐂���]";
		close;
	}
L_OTHER:
	mes "[�X�U���k]";
	mes "�m�G���A�ɉ��";
	mes "�v�����e�����痈���񂾁B";
	close;
L_CLEAR:
	mes "[�X�U���k]";
	mes strcharinfo(0) + "�B";
	mes "���Ȃ��ɂ�";
	mes "���ӂ��Ă����I";
	close;
}
comodo.gat,168,163,4		script	�m�G���A#AC_QUE00	724,{
	if(AC_QUEST_LV_0==9) goto L_CLEAR;
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==2) callfunc "�m�G���AFUNC#AC_QUE00";
	if(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==3) {
		mes "[�m�G���A]";
		mes "�X�U���k���ĉ�������";
		mes "���炩�������Ȃ����Ⴄ�̂�ˁ`�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�v�����e���ɂ���";
		mes "�n���o�[�h�ɕ񍐂���]";
		close;
	}
L_OTHER:
	mes "[�m�G���A]";
	mes "�����A�R���h���Ă�����ˁ`�B";
	mes "���́A�_���T�[�ɂȂ肽����";
	mes "�v�����e�����痈���񂾁B";
	mes "���Ă悩������`�B";
	close;
L_CLEAR:
	mes "[�m�G���A]";
	mes "�n���o�[�h�ƃX�U���k�����܂��������̂ˁB";
	mes "�悩������`";
	close;
}
prt_monk.gat,138,168,4		script	�n���o�[�h#AC_QUE00H02	48,{
	set '@novice, callfunc("AC_GetNovice");
	if(AC_QUEST_LV_0!=6) goto L_OTHER;
	switch(AC_QUEST_ST_0){
	case 2:
		mes "[�n���o�[�h]";
		mes "�₟�A";
		mes strcharinfo(0) + "�I";
		mes "�҂��Ă�����I";
		next;
		mes "[�n���o�[�h]";
		mes "�X�U���k�́A";
		mes "��̕��ɂ���炵���񂾁B";
		mes "�ӂ��`�A�ْ�����Ȃ��B";
		next;
		emotion 1;
		mes "[�n���o�[�h]";
		mes "�c�c";
		mes "��H";
		mes "����A���������Ă���ˁB";
		next;
		mes "�]�����Ȕ��������Ă���B";
		mes "�o��������悤�ȁc�c";
		mes "�n���o�[�h���A���̔����E�����]";
		next;
		mes "[�n���o�[�h]";
		mes "�Ȃ񂾂낤�ȁH";
		mes "�����A�w�ւ������Ă���B";
		mes "�������Y��Ȏw�ւ��c�c";
		next;
		mes "^FF0000�]�X�U���k�̎w�ւ��I�]^000000";
		next;
		mes "[�n���o�[�h]";
		mes "���Ƃ����l�͍����Ă��邾�낤�Ȃ��B";
		mes "�X�U���k�̑҂����킹���Ԃɂ́A";
		mes "�܂��������Ԃ����邩��A";
		mes "������Ǝ������T���Ă݂悤���ȁc�c";
		next;
		mes "�]�X�U���k�ɋ}����";
		mes "�����Ă݂����������ȁB";
		mes "�X�U���k�́A��̕��ɂ���炵���]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�X�U���k�Ɏw�ւ̂��Ƃ𕷂��Ă݂�B";
		mes "�X�U���k�́A���J�s�g�[���i�C���@��";
		mes "��̕��p�ɂ���]";
		close2;
		set AC_QUEST_ST_0,3;
		viewpoint 1,232,86,11,0x0000FF;
		end;
	case 3:
		mes "[�n���o�[�h]";
		mes "����ɂ��Ă������������w�ւ��Ȃ��B";
		mes "���Ƃ��傪����Ȃ�������A";
		mes "����Ă��܂������ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�X�U���k�Ɏw�ւ̂��Ƃ𕷂��Ă݂�B";
		mes "�X�U���k�́A���J�s�g�[���i�C���@��";
		mes "��̕��p�ɂ���]";
		close;
	case 4:
		mes "[�n���o�[�h]";
		mes "����ɂ��Ă������������w�ւ��Ȃ��B";
		mes "���Ƃ��傪����Ȃ�������A";
		mes "����Ă��܂������ˁB";
		next;
		menu "�����傪����������",-;
		mes "[�n���o�[�h]";
		mes "�����A�{���ɁH";
		mes "���Ⴀ�A�l���Ԃ��ɍs����B";
		mes "������̐l�͂ǂ��ɂ���񂾂��H";
		next;
		menu "�������Ԃ��ɍs����",-;
		emotion 9;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "��";
		mes "�Ԃ��ɍs�����炢�����āH";
		mes "����A���v����B";
		mes "�l���E��������A�l���͂����B";
		next;
		menu "�c�c",-;
		emotion 1;
		mes "[�n���o�[�h]";
		mes "������̐l�͂ǂ��ɂ���񂾂��H";
		mes "�˂��A���ŋ����Ă���Ȃ��́H";
		next;
		mes "�]���΂炭�̊ԁA";
		mes strcharinfo(0) + "��";
		mes "�n���o�[�h�Ɏw�ւ�n���悤��";
		mes "���������A";
		mes "�n���o�[�h�͎w�ւ�Ԃ��Ȃ������]";
		next;
		mes "�]�d���Ȃ��̂ŁA";
		mes "���̎w�ւ́A�X�U���k�̕��ł��邱��";
		mes "��b�����]";
		next;
		emotion 0;
		mes "[�n���o�[�h]";
		mes "�I";
		mes "�Ȃ�قǂˁB";
		next;
		mes "[�n���o�[�h]";
		mes "�����炭�A���̎w�ւ��A";
		mes "�X�U���k�̍D���Ȑl�ɓn�����Ƃ��Ă���";
		mes "�w�ւȂ񂾂낤�ˁc�c";
		next;
		mes "[�n���o�[�h]";
		mes strcharinfo(0) + "�A";
		mes "�l�͍��A1�̊���Ŏx�z���ꂻ�����B";
		mes "����Ȃ��Ə��߂Ă��c�c";
		next;
		emotion 7;
		mes "[�n���o�[�h]";
		mes "����̓X�U���k��������A";
		mes "�Ƃ�������B";
		mes "���Ȃ킿�A�X�U���k��";
		mes "���̒j�ɓn�������Ȃ��B�Ƃ���";
		mes "����I";
		next;
		emotion 36;
		mes "[�n���o�[�h]";
		mes "�������I";
		mes "����Ȃ��̂��I";
		next;
		mes "�]�n���o�[�h���w�ւ�";
		mes "�n�ʂɒ@�����A";
		mes "����ɗ����Ă���΂��E���A";
		mes "���̐΂��w�ւɒ@�������I�]";
		next;
		mes "^0000FF�]�����āA�n���o�[�h�́A";
		mes "�w�ւ��C�ɓ����Ă��܂����I�]";
		next;
		menu "�Ȃ�Ď������I",-;
		mes "�]" + strcharinfo(0) + "��";
		mes "�n���o�[�h�𕽎�ł������]";
		next;
		mes "[�n���o�[�h]";
		mes "�u�x�b�I";
		mes "�c�c";
		mes "�����}�����Ȃ������c�c";
		mes "���߂�B";
		next;
		mes "[�n���o�[�h]";
		mes "�l�́A�X�U���k�̂��Ƃ��c�c";
		mes "�ǂ����悤���Ȃ��A�D���Ȃ񂾁c�c";
		next;
		mes "�]�d���Ȃ��c�c";
		mes "�w�ւ̂��Ƃ��X�U���k�ɕ񍐂��悤�]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�X�U���k�Ɏw�ւ̂��Ƃ�񍐂���]";
		close2;
		viewpoint 1,232,86,11,0x0000FF;
		set AC_QUEST_ST_0,5;
		end;
	case 5:
		mes "[�n���o�[�h]";
		mes "�X�U���k�̂��Ƃ��c�c";
		mes "�ǂ����悤���Ȃ��A�D���Ȃ񂾁c�c";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�X�U���k�Ɏw�ւ̂��Ƃ�񍐂���]";
		close2;
		viewpoint 1,232,86,11,0x0000FF;
		end;
	case 6:
		emotion 23;
		mes "[�n���o�[�h]";
		mes "������������������!!";
		mes "�l�͂��I";
		mes "�Ȃ�Ď������Ă��܂����񂾂������I";
		next;
		mes "[�n���o�[�h]";
		mes "�l�́A�Ȃ�āA";
		mes "�Ȃ�ċ����Ȃ񂾂�!!";
		next;
		emotion 23;
		mes "[�n���o�[�h]";
		mes "�X�U���k�ɉ�킹��炪�Ȃ��c�c";
		mes "�����������I";
		next;
		mes "[�n���o�[�h]";
		mes "�c�c";
		mes strcharinfo(0) + "�A";
		mes "���A���߂�c�c";
		mes "��l�ōl�������񂾁c";
		mes "�F�X�ƁA���肪�Ƃ��B";
		if('@novice){
			mes "����͂��炾��c�c";
		}
		next;
		if('@novice){
			if(!checkweight(1011,6)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 1011,6;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[�n���o�[�h]";
		mes "�c�c";
		mes strcharinfo(0) + "�A";
		mes "���A���߂�c�c";
		mes "��l�ōl�������񂾁c";
		mes "�F�X�ƁA���肪�Ƃ��B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_OTHER:
	mes "[�n���o�[�h]";
	mes "����ɂ��́B";
	close;
}
prt_monk.gat,232,86,4		script	�X�U���k#AC_QUE00SZ03	90,{
	if(AC_QUEST_LV_0!=6) goto L_OTHER;
	switch(AC_QUEST_ST_0){
	case 3:
		emotion 28;
		mes "[�X�U���k]";
		mes "�ǂ����悤�A�w�ւ��Ȃ��c�c";
		mes "���Ƃ���������̂��ȁc�c";
		mes "���ꂶ��A�����ł��Ȃ���c�c";
		next;
		mes "�]�X�U���k�Ƀ��r�[�̎w�ւ�";
		mes "�����Ă������ƁA";
		mes "�n���o�[�h���E�������Ƃ�b�����]";
		next;
		emotion 0;
		mes "[�X�U���k]";
		mes "������";
		mes "�n���o�[�h���E���Ă��܂����̂��I";
		mes "���A����Ȃ��B";
		next;
		mes "[�X�U���k]";
		mes "���ɂ���āA�n���o�[�h";
		mes "�ɏE���Ă��܂��Ȃ�āc�c";
		mes "����́A";
		mes "������n���o�[�h�ɓn��";
		mes "���r�[�̎w�ւ������̂Ɂc�c";
		next;
		mes "[�X�U���k]";
		mes "�c�c";
		mes "���͂ˁA�����A�n���o�[�h��";
		mes "�������悤�Ǝv���Ă���́B";
		mes "����ŁA�ނ������֌Ăяo�����񂾁B";
		next;
		mes "[�X�U���k]";
		mes "�������A�����a����������A";
		mes "�a���΂̃��r�[��";
		mes "�����낢�̃y�A�����O��p�ӂ����́B";
		next;
		mes "[�X�U���k]";
		mes "�����n���āA���������������̂ɁB";
		mes "���ꂪ�A����Ȃ��Ƃ�";
		mes "�Ȃ��Ă��܂��Ȃ�āc�c";
		next;
		menu "�Ƃ肠�����A�w�ւ�Ԃ��Ă�����Ă����",-;
		mes "[�X�U���k]";
		mes "�c�c����A";
		mes "���肢�c�c";
		mes "������n���o�[�h�ɓn�������́c�c";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�n���o�[�h�ɘb�������A";
		mes "�w�ւ�Ԃ��Ă��炨���]";
		close2;
		set AC_QUEST_ST_0,4;
		viewpoint 1,138,168,11,0x0000FF;
		end;
	case 4:
		emotion 54;
		mes "[�X�U���k]";
		mes "�����A����";
		mes "�Ȃ�ăh�W�Ȃ񂾂낤�c�c";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�n���o�[�h�ɘb�������A";
		mes "�w�ւ�Ԃ��Ă��炨���]";
		close;
	case 5:
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�A";
		mes "�ǂ��������H";
		next;
		mes "�]�n���o�[�h���w�ւ�";
		mes "�j�󂵂Ă��܂������Ƃ�b�����]";
		next;
		mes "�]�����ăn���o�[�h��";
		mes "�X�U���k�̂��Ƃ��D���ł��邱�ƁA";
		mes "�w�ւ́A���̒j�ɂ�������̂���";
		mes "���Ⴂ���ĉ󂵂Ă��܂������Ƃ�";
		mes "�b�����]";
		next;
		emotion 1;
		mes "[�X�U���k]";
		mes "�n���o�[�h�����̂��Ƃ��D���H";
		mes "���A����ȁc�c";
		next;
		mes "[�X�U���k]";
		mes "�����āA�n���o�[�h�A";
		mes "�ŋ߂����Ǝ��ɉ���Ă���Ȃ����A";
		mes "�b�������Ă��A�₽������āc�c";
		mes " ";
		mes "���ꂪ�A�������₵���āc�c";
		next;
		mes "[�X�U���k]";
		mes "������A���r�[�̎w�ւ��c�c";
		mes "���r�[�͎��Ɣނ̐��܂ꌎ�̂V����";
		mes "�a���΂Ȃ́B";
		mes "�Ό��t���u�����v�����A";
		mes "���r�[�̎w�ւ�";
		mes "�����������Ȃ��Ďv���Ăāc�c";
		next;
		mes "�]���̎��I�]";
		next;
		mes "[�H]";
		mes "�N�b!!";
		next;
		mes "�]���A���琺�����������B";
		mes "^0000FF�n���o�[�h���I^000000";
		mes "���̉�b�𕷂��Ă����悤���]";
		next;
		mes "�]�n���o�[�h��^0000FF�ߒɂȊ�^000000������";
		mes "���苎�����I�]";
		next;
		emotion 0;
		mes "[�X�U���k]";
		mes "�n���o�[�h��!!";
		mes " ";
		mes "�]�X�U���k�̓n���o�[�h��";
		mes "�ǂ����Ƃ���]";
		next;
		if(select("�X�U���k���~�߂�","�����")==1){
			mes "�]�X�U���k���ǂ����Ƃ������A";
			mes strcharinfo(0) + "��";
			mes "������~�߂��]";
			next;
			mes "[�X�U���k]";
			mes strcharinfo(0) + "�A";
			mes "���Ŏ~�߂�̂��I";
			next;
			menu "�������s��",-;
			mes "[�X�U���k]";
			mes "�c�c";
			mes "�킩������c�c";
			mes "���肢�ˁB";
			next;
			mes "[�X�U���k]";
			mes "�c�c";
			mes "�������r�[�̎w�ւ���";
			mes "���Ƃ��Ȃ���΁c�c";
			next;
		}
		else {
			mes "�]�X�U���k���n���o�[�h��ǂ��B";
			mes strcharinfo(0) + "��";
			mes "����������]";
			next;
			mes "[�X�U���k]";
			mes "�����I";
			mes " ";
			mes "�]�X�U���k���܂������B";
			mes "���̊ԂɃn���o�[�h�̎p��";
			mes "�����Ȃ��Ȃ��Ă��܂����]";
			next;
			mes "[�X�U���k]";
			mes "�����A�n���o�[�h�c�c";
			mes "�s���Ȃ��Łc�c";
			next;
			menu "�������T���ɍs����",-;
			mes "[�X�U���k]";
			mes "�c�c";
			mes "����A���肢�c�c";
			next;
		}
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�n���o�[�h�ɘb��������]";
		close2;
		set AC_QUEST_ST_0,6;
		viewpoint 1,138,168,11,0x0000FF;
		end;
	case 6:
		mes "[�X�U���k]";
		mes "�c�c";
		mes "�������r�[�̎w�ւ���";
		mes "���Ƃ��Ȃ���΁c�c";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�n���o�[�h�ɘb��������]";
		close2;
		viewpoint 1,138,168,11,0x0000FF;
		end;
	case 99:
		mes "[�X�U���k]";
		mes "�c�c";
		mes "�������r�[�̎w�ւ���";
		mes "���Ƃ��Ȃ���΁c�c";
		next;
		//������
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_OTHER:
	mes "[�X�U���k]";
	mes "����ɂ��́B";
	mes "���A���̏ꏊ���D���Ȃ񂾁B";
	close;
}
izlude.gat,137,156,4		script	�X�U���k#AC_QUE00SZ04	90,{
	switch(AC_QUEST_LV_0){
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_QUEST09;
	case 9:
		goto L_CLEAR;
	default:
		goto L_OTHER;
	}
L_QUEST08:
	switch(AC_QUEST_ST_0){
	case 1:
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�A";
		mes "���肢������́B";
		next;
		mes "[�X�U���k]";
		mes "���ꂩ��A�n���o�[�h�̍s����";
		mes "�킩��Ȃ��́B";
		mes "���܂ɁA�v�����e���ɖ߂��Ă��Ă���";
		mes "�݂����Ȃ񂾂��ǁA";
		mes "�����ɂ��Ȃ��Ȃ��Ă��܂��́B";
		next;
		mes "[�X�U���k]";
		mes "���A�������S�z�Łc�c";
		mes "������A�n���o�[�h���ǂ��ɂ��邩�A";
		mes "�������Ă��邩���ׂė~�����́B";
		next;
		menu "�킩����",-;
		mes "[�X�U���k]";
		mes "���肪�Ƃ��I";
		next;
		mes "�]�v�����e���̃n���o�[�h��";
		mes "�������ꏊ�ɍs���Ă݂悤�]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�v�����e���̃n���o�[�h��";
		mes "�������ꏊ�ɍs���āA����T���]";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[�X�U���k]";
		mes "�n���o�[�h���ǂ��ɂ��邩�A";
		mes "�������Ă��邩���ׂė~�����́B";
		next;
		mes "�]�v�����e���̃n���o�[�h��";
		mes "�������ꏊ�ɍs���Ă݂悤�]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�v�����e���̃n���o�[�h��";
		mes "�������ꏊ�ɍs���āA����T���]";
		close;
	case 3:
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�A";
		mes "�����킩�����H";
		next;
		mes "�]�v�����e����";
		mes "�n���o�[�h�ɉ�������ƁA";
		mes "�n���o�[�h�͑���̃��r�[��";
		mes "�A���i�x���c������";
		mes "�T���ɂ����Ă��邱�Ƃ�b�����]";
		next;
		mes "[�X�U���k]";
		mes "�����A����ȁc�c";
		mes "�n���o�[�h�A�̂��ア�̂ɁA";
		mes "����ȉ����܂Łc�c";
		next;
		mes "[�X�U���k]";
		mes "���A�n���o�[�h��";
		mes "����邾���ł����̂Ɂc�c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_0,99;
		end;
	case 99:
		mes "[�X�U���k]";
		mes "�n���o�[�h�A�̂��ア�̂Ɂc�c";
		mes "�S�z�c�c";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
	goto L_OTHER;
L_QUEST09:
	switch(AC_QUEST_ST_0){
	case 1:
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�A";
		mes "��ςȂ̂��I";
		next;
		menu "�ǂ������́H",-;
		mes "[�X�U���k]";
		mes "�n���o�[�h���A���i�x���c�����ɍs���Ă���";
		mes "1�T�Ԗ߂��Ă��Ȃ��́I";
		mes "�ށA�̂��ア�̂�I";
		mes "�򂪕K�v�Ȃ̂��I";
		next;
		emotion 0,"";
		mes "[�X�U���k]";
		mes "�Q�t�F���ɂ���";
		mes "�n���o�[�h�̎厡��̐搶��";
		mes "�m�F������A1�T�ԑO��";
		mes "3��������������������炵���́B";
		next;
		menu "!!",-;
		mes "[�X�U���k]";
		mes "�����A�򂪂����";
		mes "��ςȂ��ƂɂȂ��Ă���Ǝv���́A";
		mes "���ƈꏏ�ɁA���͂���";
		mes "�A���i�x���c�����ɍs���܂��傤�I";
		next;
		menu "������񂳁I",-;
		mes "[�X�U���k]";
		mes "�܂��A���w���ɒT���ɍs�����I";
		next;
		mes "[�X�U���k]";
		mes "���w���̒����̓���k�ɍs����";
		mes "�t���C���_�a�ւ̊K�i������́B";
		mes "���̑O�ŁA���������܂��傤�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���w���֍s���A";
		mes "�����W�߂Ă���X�U���k��";
		mes "�t���C���_�a�ւ̊K�i�O�ŉ�]";
		close2;
		set AC_QUEST_ST_0,2;
		end;
	case 2:
		mes "[�X�U���k]";
		mes "�܂��A���w���ɍs���܂��傤�I";
		next;
		mes "[�X�U���k]";
		mes "���w���̒����̓���k�ɍs����";
		mes "�t���C���_�a�ւ̊K�i������́B";
		mes "���̑O�ŁA���������܂��傤�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]���w���֍s���A";
		mes "�����W�߂Ă���X�U���k��";
		mes "�t���C���_�a�ւ̊K�i�O�ŉ�]";
		close;
	}
L_OTHER:
	mes "[�X�U���k]";
	mes "����ɂ��́B";
	close;
L_CLEAR:
	mes "[�X�U���k]";
	mes strcharinfo(0) + "�B";
	mes "���Ȃ��ɂ�";
	mes "���ӂ��Ă����I";
	close;
}
rachel.gat,148,190,4		script	�X�U���k#AC_QUE00SZ05	90,{
	if(AC_QUEST_LV_0==9) goto L_CLEAR;
	if(AC_QUEST_LV_0!=8) goto L_OTHER;
	switch(AC_QUEST_ST_0){
	case 2:
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�I";
		mes "�n���o�[�h�A";
		mes "2���O�܂Ń��w����";
		mes "�z�e���ɔ��܂��Ă�����I";
		next;
		mes "[�X�U���k]";
		mes "�z�e���̐l��";
		mes "���ꂩ��A�x�C���X�ɍs������";
		mes "�����Ă����炵����B";
		next;
		mes "[�X�U���k]";
		mes "���ɁA����������ł�";
		mes "�Ȃ������݂���������A";
		mes "������ƈ��S�����c�c";
		next;
		mes "[�X�U���k]";
		mes "�ł��A�}���Ȃ�����B";
		mes "���̓x�C���X�ɍs���܂��傤�B";
		mes "�n���o�[�h�c�c";
		mes "�҂��ĂāI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�x�C���X�ɍs���A";
		mes "�n���o�[�h��T���]";
		close2;
		set AC_QUEST_ST_0,3;
		end;
	case 3:
		mes "[�X�U���k]";
		mes "���̓x�C���X�ɍs���܂��傤�B";
		mes "�n���o�[�h�c�c";
		mes "�҂��ĂāI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "�]�x�C���X�ɍs���A";
		mes "�n���o�[�h��T���]";
		close;
	}
L_OTHER:
	mes "[�X�U���k]";
	mes "����ɂ��́B";
	close;
L_CLEAR:
	mes "[�X�U���k]";
	mes strcharinfo(0) + "�B";
	mes "���Ȃ��ɂ�";
	mes "���ӂ��Ă����I";
	close;
}
veins.gat,151,330,4			script	�X�U���k#AC_QUE00SZ06	90,{
	set '@novice, callfunc("AC_GetNovice");
	if(AC_QUEST_LV_0!=8) goto L_OTHER;
	switch(AC_QUEST_ST_0) {
	case 3:
		mes "[�X�U���k]";
		mes "�n���o�[�h�I";
		next;
		emotion 0,"�n���o�[�h#AC_QUE00H03";
		mes "[�n���o�[�h]";
		mes "�X�U���k���I";
		mes "�ǂ����Ă����ɂ���񂾂��H";
		next;
		mes "[�X�U���k]";
		mes "�S�z���Ă����񂶂�Ȃ��I";
		mes "�̂͑��v�H";
		mes "��������Ă����́I";
		mes "�����A��������ł��I";
		next;
		mes "�]�X�U���k�����";
		mes "�n���o�[�h�̌��̒��ɉ������񂾁]";
		next;
		emotion 16,"�n���o�[�h#AC_QUE00H03";
		mes "[�n���o�[�h]";
		mes "�������!!";
		mes "�Q�z�b�Q�z�b�c�c";
		mes "�ꂵ�����I";
		next;
		mes "[�n���o�[�h]";
		mes "���A��́A���������񂾂���";
		mes "���v����B";
		next;
		emotion 1,"�X�U���k#AC_QUE00SZ06";
		mes "[�X�U���k]";
		mes "�Ȃ�ł��I�H";
		mes "�򂪂Ȃ��āA��ς������ł���I";
		next;
		mes "[�n���o�[�h]";
		mes "�ȑO�A";
		mes strcharinfo(0) + "��";
		mes "�����Ă��Ă��ꂽ�򂪂���������";
		mes "��������񂾂�����v���B";
		next;
		mes "[�X�U���k]";
		mes "�{���H";
		mes "�悩�����c�c";
		mes "�S�z���Ă��񂾂�c�c";
		next;
		emotion 33,"�X�U���k#AC_QUE00SZ06";
		mes "[�X�U���k]";
		mes "���Ⴀ�A���ƈꏏ�ɁA";
		mes "�����߂�܂��傤�B";
		mes " ";
		mes "�ˁH";
		next;
		mes "[�n���o�[�h]";
		mes "���߂�����I";
		mes "�܂��߂�Ȃ��I";
		next;
		emotion 1,"�X�U���k#AC_QUE00SZ06";
		mes "[�X�U���k]";
		mes "�ǂ����āH";
		mes "�ǂ����Ė߂�Ȃ��́H";
		next;
		mes "[�n���o�[�h]";
		mes "�c�c";
		mes "�N�Ƃ����낢��";
		mes "�y�A�����O����邽�߂���c�c";
		mes "���̂��߂�";
		mes "���r�[��T���Ȃ��Ⴂ���Ȃ��񂾁B";
		next;
		emotion 0,"�X�U���k#AC_QUE00SZ06";
		mes "[�X�U���k]";
		mes "�����y�A�����O�͂���Ȃ��I";
		mes "������";
		mes "�ꏏ�ɖ߂낤��B";
		next;
		mes "[�n���o�[�h]";
		mes "���߂���B";
		mes "����͖l�̎����Ȃ񂾁B";
		mes "�l�͍��܂ŁA�l�ɗ��肷���Ă����B";
		next;
		mes "[�n���o�[�h]";
		mes "�X�U���k�A�l�͌N�̂��Ƃ��D�����A";
		mes "�ł��A�l�͌N�ɂӂ���̂��|���āA";
		mes "�������邱�Ƃ��瓦����";
		mes strcharinfo(0) + "��";
		mes "�΂��藊���Ă����B";
		next;
		mes "[�n���o�[�h]";
		mes "����Ȗl�͌N�ɂӂ��킵���Ȃ���B";
		mes "�����낢�̃y�A�����O��";
		mes "�����̗͂Ŏ�ɂ���ď��߂�";
		mes "�N�ɂӂ��킵���j�ɂȂ��񂾁B";
		next;
		mes "[�X�U���k]";
		mes "����Ȃ��ƂȂ�����I";
		mes "���̂��߂ɁA�����̑̂��ڂ݂���";
		mes "��l�ł���ȂƂ���܂ŗ��āc�c";
		mes "���̋C���������ŏ\������B";
		next;
		mes "�]�n���o�[�h�͎�����ɐU�����]";
		next;
		mes "�]�X�U���k�́A��u�l�����񂾁B";
		mes "�����āA���r�[�̎w�ւ����o�����]";
		next;
		mes "[�n���o�[�h]";
		mes "�N�̕��̎w�ւ��ˁB";
		mes "�K���A�l�̕�������āA";
		mes "�����낢�ɂȂ��c�c";
		next;
		mes "�]�X�U���k�́A�����Ȃ�";
		mes "���̃��r�[�̎w�ւ�";
		mes "�R�̕��֎v���؂蓊�����I�]";
		next;
		mes "[�n���o�[�h]";
		mes "�����I";
		mes "������Ă���́I�H";
		next;
		mes "[�X�U���k]";
		mes "����Ŏ����������낢���ˁB";
		next;
		mes "[�X�U���k]";
		mes "�n���o�[�h�����r�[�̎w�ւ�";
		mes "������Ⴄ�ƁA";
		mes "�������A";
		mes "�����낢����Ȃ��Ȃ����Ⴄ��B";
		next;
		emotion 9,"�n���o�[�h#AC_QUE00H03";
		mes "[�n���o�[�h]";
		mes "�c�c";
		next;
		emotion 20,"�n���o�[�h#AC_QUE00H03";
		mes "[�n���o�[�h]";
		mes "�t�t�t";
		mes "�X�U���k�A�ꏏ�ɖ߂낤�B";
		mes "����Ȗl�����ǁA";
		mes "�N���΂ɍK���ɂ����I";
		next;
		emotion 33,"�X�U���k#AC_QUE00SZ06";
		mes "[�X�U���k]";
		mes "����I";
		next;
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�A";
		mes "�{���ɂ��肪�Ƃ��B";
		if('@novice){
			mes "����A������̋C������B";
		}
		next;
		if('@novice){
			if(!checkweight(1146,1)) {
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 1146,1;
		}
		set AC_QUEST_ST_0,99;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	case 99:
		mes "[�X�U���k]";
		mes "�n���o�[�h�c�c";
		mes "�����ƈꏏ��B";
		mes "���ꂩ��́A���ł����ɑ��k���ĂˁB";
		next;
		mes "[�n���o�[�h]";
		mes "����c�c";
		next;
		mes "[�X�U���k]";
		mes strcharinfo(0) + "�A";
		mes "�{���ɂ��肪�Ƃ��B";
		next;
		mes "[�n���o�[�h]";
		mes "�l���������܂��������̂�";
		mes strcharinfo(0) + "��";
		mes "����������B";
		mes "���肪�Ƃ��I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_OTHER:
	mes "[" + strcharinfo(0) + "]";
	mes "(2�l���y�������ɉ�b���Ă���B";
	mes "�����Ƃ��Ă������B)";
	close;
}
veins.gat,148,329,4		duplicate(�X�U���k#AC_QUE00SZ06)	�n���o�[�h#AC_QUE00H03	48

