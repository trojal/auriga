//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ���[���̈˗�
//
//                                                 by Pneuma
//�����b�ɂȂ������̐l��   -----------------------------------
aldeba_in.gat,171,171,4	script	�~�U���[#aldeba_in	68,{
	set '@novice, callfunc("AC_GetNovice");
	if(!AC_QUEST_ST_2)goto L_OTHER;
	switch(AC_QUEST_LV_2){
	case 0:
		goto L_QUEST01;
	case 1:
		goto L_QUEST02;
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		goto L_QUEST08;
	case 8:
		goto L_QUEST09;
	}
L_QUEST01:
	switch(AC_QUEST_ST_2) {
	case 1:
		mes "[�~�U���[]";
		mes "����ɂ��́`�B";
		next;
		menu "����ɂ���",-;
		emotion 5;
		mes "[�~�U���[]";
		mes "���A";
		mes "�M�����˗����󂯂Ă����l�Ȃ̂ˁI";
		mes "�������[�B";
		mes "�����ƁA�����";
		mes "^0000FF���e�B�G^000000�ɂ���^FF0000�g�C�[�q^000000�����";
		mes "�͂��Ăق����̂�B";
		next;
		emotion 21,"";
		mes "[�~�U���[]";
		mes "�ȑO�A^FF0000���e�B�G^000000�ɍs�������ɂˁA";
		mes "�����X�^�[�ɂ��ꂿ����āc�c";
		mes "����������Ă��������ł��B";
		mes "������A����ɂ����͂�������ł��B";
		mes "�ł��A�Z�����ē͂��邱�Ƃ�";
		mes "�ł��Ȃ������́B";
		next;
		menu "��������Ɠ͂��Ă��܂�",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^FF0000���e�B�G^000000�ɂ���^0000FF�g�C�[�q^000000����ɁA";
		mes "����̕i��͂������ƁA";
		mes "�~�U���[�ɕ񍐂���B";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[�~�U���[]";
		mes "���A�˗��̕i��";
		mes "�͂��Ă��������܂������H";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "���ꂩ��A�s���Ƃ���Ȃ�ł��B";
		next;
		emotion 21;
		mes "[�~�U���[]";
		mes "�������[�A";
		mes "�O�̂��߂�����x�͂����";
		mes "�����Ă����ˁB";
		mes "^0000FF���e�B�G^000000�ɂ���A^FF0000�g�C�[�q^000000�����";
		mes "����̕i��͂��ĂˁB";
		mes "��낵���ˁI";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���e�B�G^000000�ɂ���^FF0000�g�C�[�q^000000����ɁA";
		mes "����̕i��͂������ƁA";
		mes "�~�U���[�ɕ񍐂���B";
		close;
	case 3:
		mes "[�~�U���[]";
		mes "���A�˗��̕i��";
		mes "�͂��Ă��������܂������H";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�����A�ƂĂ����ł��܂�����B";
		mes "����ŁA�莆��a�����Ă�����ł��B";
		next;
		emotion 21;
		mes "�]�~�U���[�Ɏ莆��n�����]";
		next;
		mes "[�~�U���[]";
		mes "�莆������������Ȃ�āA�����ł��B";
		mes strcharinfo(0)+"��";
		mes "���������Ă�����Ă悩������B";
		mes "�܂��������������낵���ˁI";
		next;
		if('@novice){
			mes "[�~�U���[]";
			mes "����A�債��������Ȃ�����";
			mes "����ɂǂ����I";
			next;
			// 602 ���̉H 10��
			if(!checkweight(602,10)){
				mes "�d�ʃI�[�o�[�I";
				close;
			}
			getitem 602,10;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�~�U���[]";
		mes "���肪�Ƃ��ˁB";
		mes "�܂��������������낵���I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	}
L_QUEST02:
	switch(AC_QUEST_ST_2) {
	case 1:
		emotion 0;
		mes "[�~�U���[]";
		mes "�I";
		mes "���������āA�܂�";
		mes strcharinfo(0) + "����";
		mes "�˗����󂯂Ă�����!?";
		next;
		menu "�͂�",-;
		mes "[�~�U���[]";
		mes "����[�A�����������[�I";
		mes "��x���肢���Ă邵";
		mes "�M���Ȃ�M�p�ł����B";
		next;
		emotion 5;
		mes "[�~�U���[]";
		mes "�����˗����e�����b����ˁB";
		mes "�����ƁA�W���m�[�ɒ��������َq�����";
		mes "�E�l���񂪂���炵���́B";
		mes "���̐l�Ɉ���َq��";
		mes "����Ă��炢�����āc�c";
		mes "����ɗ���ł��Ăق����̂�B";
		next;
		mes "[�~�U���[]";
		mes "���ς�炸�Z�������āA";
		mes "���͂������瓮�����Ƃ��ł��Ȃ�����";
		mes "���肢�����B";
		mes "����A�����������炱���n����";
		mes "���傤�����B";
		next;
		menu "�܂����Ă��������I",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000�ɂ���A���َq�E�l��";
		mes "���َq�쐬�̈˗����s���A";
		mes "�~�U���[�ɕ񍐂���B";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[�~�U���[]";
		mes "���A���َq�쐬�̈˗���";
		mes "���Ă��������܂������H";
		next;
		menu "���ꂩ��s���Ƃ���ł�",-;
		emotion 11;
		mes "[�~�U���[]";
		mes "�����������̂ˁ[�B";
		mes "�O�̂��߂�����x�����Ƃ���ˁB";
		mes "^0000FF�W���m�[^000000�ɂ���A���َq�E�l��";
		mes "���َq�쐬�̈˗����s���Ă��Ă����H";
		next;
		mes "[�~�U���[]";
		mes "�˗����I�������";
		mes "���̂Ƃ���ɖ߂��Ă��ĂˁB";
		mes "���ꂶ���낵���[�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000�ɂ���A���َq�E�l��";
		mes "���َq�쐬�̈˗����s���A";
		mes "�~�U���[�ɕ񍐂���B";
		close;
	case 3:
		mes "[�~�U���[]";
		mes "���A���َq�쐬�̈˗��A";
		mes "�ǂ��ł����H";
		next;
		menu "�˗��ł��܂����I",-;
		emotion 33;
		mes "�]�˗��������ƂƁA";
		mes "�@���َq����Ɏ��Ԃ������邱��" /*�u���v�������Ă�͖̂{�I�ǂ���*/;
		mes "�@�~�U���[�ɓ`�����]";
		next;
		mes "[�~�U���[]";
		mes "���肪�Ƃ��[�A������";
		mes strcharinfo(0) + "�ˁI";
		mes "�܂������b�ɂȂ���������B";
		if('@novoce){
			mes "����A����Ɏ󂯎���āI";
		}
		next;
		if('@novoce){
			if(!checkweight(2305,1)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 2305,1;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�~�U���[]";
		mes strcharinfo(0);
		mes "���肪�Ƃ��ˁB";
		mes "�܂��������������낵���I";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_2){
	case 1:
		goto L_OTHER;
	case 2:
		mes "[�~�U���[]";
		mes "���I";
		mes strcharinfo(0) + "����";
		mes "����ɂ��́[�B";
		next;
		menu "���َq�������Ă��܂����I",-;
		emotion 0;
		mes "[�~�U���[]";
		mes "!?";
		mes "���Ɋ��������̂ˁI";
		mes "���肪�Ƃ��[�B";
		next;
		menu "���ƁA������c�c",-;
		emotion 17;
		mes "[�~�U���[]";
		mes "���A���ゾ������ˁ[�B";
		mes "��������Y��Ă���B";
		mes "���߂�Ȃ����ˁI";
		mes "�͂��A����I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000�ɂ���A^FF0000�}�b�Y�C^000000�����";
		mes "�����n���B";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[�~�U���[]";
		mes "���ӂӁA���َq��@���َq��";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000�ɂ���A^FF0000�}�b�Y�C^000000�����";
		mes "�����n���B";
		close;
	}
L_QUEST09:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[�~�U���[]";
		mes "���A����ς�";
		mes strcharinfo(0) + "����I";
		mes "�����ƋM�������Ă����"/*���Ă���Ŗ{�I�ʂ�*/;
		mes "�v������I";
		next;
		menu "����łǂ�Ȉ˗����H",-;
		mes "[�~�U���[]";
		mes "�����ƂˁA";
		mes "���̑O�͂��Ă���������َq�Ǝ莆���A";
		mes "^FF0000���b�N�X^000000����ɓ͂��Ăق����́B";
		next;
		menu "�����ɂ����ł����H",-;
		mes "[�~�U���[]";
		mes "���A����B";
		mes "���Ƃˁc�c";
		mes "���͔ށA�`���҂����Ă��Ă�";
		mes "���E���𗷂��Ă��邩��";
		mes "�������ɂ���̂��킩��Ȃ��̂�ˁc�c";
		next;
		menu "���������ł����͂���܂��񂩁H",-;
		mes "[�~�U���[]";
		mes "�����˂��c�c";
		mes "�d�����Ԃ�^FF0000���C�A�X^000000�ɂ���������";
		mes "�����Ăق����Ɠ`���Ă���񂾂���";
		mes "�A�����Ȃ����c�c";
		mes "���[��c�c";
		next;
		emotion 33;
		mes "[�~�U���[]";
		mes "��݂����ɒT���Ă��킩��Ȃ�";
		mes "���낤���A�܂���^FF0000�t�F�C����^000000�ɂ���";
		mes "�d�����Ԃ�^FF0000���C�A�X^000000��";
		mes "��񂪖����������Ă݂Ă����H";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�t�F�C����^000000�ɂ���A";
		mes "�d�����Ԃ�^FF0000���C�A�X^000000�����";
		mes "��񂪖������m�F����B";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[�~�U���[]";
		mes "����A������x���������ق���";
		mes "�悢������H";
		next;
		mes "[�~�U���[]";
		mes "��݂����ɒT���Ă��킩��Ȃ�";
		mes "���낤���A�܂���^FF0000�t�F�C����^000000�ɂ���";
		mes "�d�����Ԃ�^FF0000���C�A�X^000000��";
		mes "��񂪖����������Ă݂Ă����H";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�t�F�C����^000000�ɂ���A";
		mes "�d�����Ԃ�^FF0000���C�A�X^000000�����";
		mes "��񂪖������m�F����B";
		close;
	case 3:
		//������
		mes "[�~�U���[]";
		mes strcharinfo(0) + "����I";
		mes "������^FF0000�t�B�Q��^000000��";
		mes "�s���Ă݂Ă����H";
		mes "^FF0000���b�N�X^000000������炵������";
		mes "���C�A�X����A���������́I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�t�B�Q��^000000�֍s��";
		mes "^FF000000���b�N�X^000000�����T���B";
		close;
	case 4:
		mes "[�~�U���[]";
		mes strcharinfo(0) + "����I";
		mes "^FF0000���b�N�X^000000�͌�����܂����H";
		next;
		menu "����",-;
		mes "[�~�U���[]";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		mes "����Ŕނ͌��C�ł������H";
		next;
		menu "���C�ł���",-;
		mes "[�~�U���[]";
		mes "�ǂ�������B";
		mes "�莆����ŗ���̂ˁB";
		mes "�{���ɂ��肪�Ƃ��[�B";
		mes "�F�X�����b�ɂȂ���������B";
		next;
		menu "�`���҂��������Ƃɂ���",-;
		mes "[�~�U���[]";
		mes "����A���b�N�X�̂��";
		mes "������ׂ�ˁc�c";
		mes "�����Ȃ̂�A";
		mes "�����`���҂������́B";
		mes "�ł������̂ق����y�����Ȃ�������āB";
		next;
		mes "[�~�U���[]";
		mes "�ȑO�́A";
		mes "�ނƃR���r��g��ŐF�X��";
		mes "�_���W�����ɍs�����̂�H";
		mes "���̎��͏[������������������B";
		mes "�ł��A�Ȃ񂩂��т����̂�ˁB";
		next;
		mes "[�~�U���[]";
		mes "���x�͏�����";
		mes "�ނƃR���r��g�݂����񂾂��ǂ��c�c";
		mes "�ނ͖`���҂𑱂������݂����B";
		next;
		emotion 23,"";
		emotion 29;
		mes "[�~�U���[]";
		mes "�M�����C�Â��Ă���Ǝv������";
		mes "���̂��َq��H�ׂ���";
		mes "�`���𑱂����Ȃ��̂�";
		mes "�Ȃ�Ǝv������A";
		mes "���ʓI�Ɏ��̖ړI��";
		mes "�B�������Ǝv�����ǂˁB";
		next;
		mes "[�~�U���[]";
		mes "���A�����������������ˁc�c";
		mes "���̘b�͖Y��āB";
		next;
		mes "[�~�U���[]";
		if('@novice){
			mes "���ƁA���ꎄ�̂��Â�����";
			mes "�ǂ�������g���āB";
		}
		mes "�{���ɂ��肪�Ƃ��B";
		next;
		if('@novoce){
			if(!checkweight(2340,1)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 2340,1;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�~�U���[]";
		mes strcharinfo(0) + "����I";
		mes "���肪�Ƃ��B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_CLEAR:
	switch(AC_QUEST_LV_2){
	case 1:
	case 2:
		mes "[�~�U���[]";
		mes strcharinfo(0)+"����";
		mes "���肪�Ƃ��ˁB";
		mes "�܂��������������낵���I";
		close;
	//������
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[�~�U���[]";
		mes strcharinfo(0)+"����";
		mes "���َq�̂ق��͏����ɂ����Ă�H";
		close;
	//������
	case 7:
		mes "[�~�U���[]";
		mes strcharinfo(0)+"����";
		mes "���肪�Ƃ��ˁB";
		mes "�܂��������������낵���I";
		close;
	//������
	case 8:
	case 9:
		mes "[�~�U���[]";
		mes "���A";
		mes strcharinfo(0)+"����Ȃ��I";
		mes "�F�X�����b�ɂȂ����������ˁB";
		mes "�{���ɂ��肪�Ƃ��I";
		close;
	}
L_OTHER:
	mes "[�~�U���[]";
	mes "����ɂ��́`�B";
	close;
}
//-------------------------------------------------------
xmas_in.gat,173,171,4	script	�g�C�[�q#xmas_in	908,{
	if(AC_QUEST_LV_2==0) goto L_QUEST01;
	goto L_OTHER;
L_QUEST01:
	switch(AC_QUEST_ST_2) {
	case 2:
		mes "[�g�C�[�q]";
		mes "����ɂ��́B";
		next;
		menu "�g�C�[�q����H",-;
		mes "[�g�C�[�q]";
		mes "�l�͊m���Ƀg�C�[�q����H";
		mes "�����p���ȁH";
		next;
		menu "�o�܂��������",-;
		emotion 33;
		mes "�]�g�C�[�q�Ɍo�܂�������A";
		mes "����̕i����n�����]";
		next;
		emotion 19;
		mes "[�g�C�[�q]";
		mes "�Ȃ񂩁A";
		mes "�ޏ��ɂ͋C�����킹��";
		mes "���܂����ȁ[�c�c";
		mes "�ł��A�������ꂵ����B";
		next;
		emotion 5;
		mes "[�g�C�[�q]";
		mes "�������I";
		mes "���łɈ�莆��";
		mes "�͂��Ă���Ȃ����ȁH";
		next;
		menu "�����ł���",-;
		emotion 0;
		mes "[�g�C�[�q]";
		mes "�����I";
		mes "���肪�Ƃ��I";
		mes "���ꂶ��A";
		mes "�莆���������炿����Ƒ҂��ĂˁB";
		next;
		emotion 5;
		mes "[�g�C�[�q]";
		mes "�c�c";
		mes "�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�g�C�[�q]";
		mes "�ł����ł����I";
		mes "���ꂶ��A�������낵�����ނ�[�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A���f�o����^000000�ɂ���A";
		mes "^FF0000�~�U���[^000000�ɕ񍐂��悤�I";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[�g�C�[�q]";
		mes "����ɂ��́B";
		mes strcharinfo(0)+"����B";
		mes "�莆��͂��Ă���܂������H";
		next;
		menu "�܂��Ȃ�ł��B",-;
		mes "[�g�C�[�q]";
		mes "�莆�A��낵�����ނ�I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A���f�o����^000000�ɂ���A";
		mes "^FF0000�~�U���[^000000�ɕ񍐂��悤�I";
		close;
	}
L_OTHER:
	if(AC_QUEST_LV_2 || AC_QUEST_ST_2>3){
		mes "[�g�C�[�q]";
		mes "����ɂ��́B";
		mes strcharinfo(0)+"����B";
		close;
	}
	else {
		mes "[�g�C�[�q]";
		mes "�₠�A�����������ˁ[�B";
		close;
	}
}
//------------------------------------------------------
payon.gat,165,99,4	script	���C�A�X	807,{
	if(AC_QUEST_LV_2!=8) goto L_OTHER;
	switch(AC_QUEST_ST_2) {
	case 2:
		mes "[���C�A�X]";
		mes "��H";
		mes "�`���҂��c�c";
		next;
		menu "�~�U���[���񂩂猾���Ă��܂���",-;
		mes "[���C�A�X]";
		mes "�����A�~�U���[���炩�B";
		mes "��ŁA�Ȃ񂾂낤���H";
		next;
		menu "������������",-;
		emotion 0;
		mes "[���C�A�X]";
		mes "�I";
		mes "�����A��̐l�̌����I";
		mes "���傤�ǂ�������񂪂͂�����";
		mes "���������񂾁B";
		mes "���A^FF0000�t�B�Q��^000000�ɂ���炵�����H";
		next;
		menu "�{���ł���!?",-;
		mes "[���C�A�X]";
		mes "�����A�d�����Ԃ̏�񂾂���";
		mes "�ԈႢ����Ȃ��Ǝv�����H";
		mes "�ꉞ���̌��ɂ��āA";
		mes "�~�U���[�ɂ��`���Ă�����B";
		next;
		menu "���肪�Ƃ��������܂�",-;
		mes "["+strcharinfo(0)+"]";
		mes "�����A�t�B�Q���Ɍ������Ă݂悤�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�t�B�Q��^000000�֍s��";
		mes "^FF0000���b�N�X^000000�����T���B";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[���C�A�X]";
		mes "���A�N���B";
		mes "������^FF0000�t�B�Q��^000000��";
		mes "���������ق����ǂ����H";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�t�B�Q��^000000�֍s��";
		mes "^FF0000���b�N�X^000000�����T���B";
		close;
	}
L_OTHER:
	mes "[���C�A�X]";
	mes "��H";
	mes "�`���҂��c�c";
	close;
}
hugel.gat,72,90,4	script	���b�N�X	884,{
	if(AC_QUEST_LV_2!=8 || AC_QUEST_ST_2<3 || AC_QUEST_ST_2>4) goto L_OTHER;
	switch(AC_QUEST_ST_2) {
	case 3:
		emotion 9;
		mes "[���b�N�X]";
		mes "�c�c";
		next;
		menu "����ɂ���",-;
		emotion 9;
		mes "[���b�N�X]";
		mes "�c�c";
		next;
		menu "���́c�c�~�U���[���񂩂痊�܂��",-;
		emotion 0;
		mes "[���b�N�X]";
		mes "�I";
		mes "�~�U���[�c�c";
		mes "�����������O���ȁc�c";
		next;
		menu "�莆�Ƃ��َq��n��",-;
		mes "�]���b�N�X�͎莆��ǂ�ł���悤���]";
		next;
		emotion 4;
		mes "[���b�N�X]";
		mes "�����̒a�����Ȃ��";
		mes "�莆������܂ł�������Y��Ă����B";
		mes "����͂����Ɓc�c";
		mes "�`���҂Ȃ�Ď��߂����";
		mes "�悭������ȁc�c";
		next;
		mes "[���b�N�X]";
		mes "�������A���ŋ߂܂�";
		mes "�`���҂������񂾂��H";
		mes "�Ӂ[�A����ȓz����B";
		mes "�܂������c�c";
		next;
		mes "[���b�N�X]";
		mes "���������ΌN�̖��O��";
		mes "�����Ă��Ȃ������ȁB";
		next;
		menu "�����",-;
		mes "[���b�N�X]";
		mes strcharinfo(0) + "���B";
		mes "�F�X���f�������Ă��܂����݂�����";
		mes "���܂Ȃ������B";
		mes "^FF0000�~�U���[^000000�ɂ́A��Ŏ莆�𑗂��";
		mes "�����Ă����Ă���B";
		mes "���肪�Ƃ��B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A���f�o����^000000�ɋ���";
		mes "^FF0000�~�U���[^000000�ɕ񍐂���B";
		close2;
		set AC_QUEST_ST_2,4;
		end;
	case 4:
	case 99:
		mes "[���b�N�X]";
		mes strcharinfo(0) + "���B";
		mes "���肪�Ƃ��ȁB";
		close;
	}
L_OTHER:
	mes "[���b�N�X]";
	mes "�c�c";
	close;
}
//------------------------------------------------------
yuno_in04.gat,39,126,4	script	�}�b�Y�C	886,{
	set '@novice, callfunc("AC_GetNovice");
	switch(AC_QUEST_LV_2){
	case 0:
		goto L_OTHER;
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
		goto L_OTHER;
	}
L_QUEST02:
	switch(AC_QUEST_ST_2){
	case 0:
	case 1:
	case 99:
		goto L_OTHER;
	case 2:
		mes "[�}�b�Y�C]";
		mes "�ӂ�ӂ�ӂӂӂ�B";
		mes "�����������َq�����`";
		mes "�������������������������B";
		mes "���������[�[�[�[�[�[�[�[�[�I";
		next;
		menu "����",-;
		mes "[�}�b�Y�C]";
		mes "����A���q���񂩂ȁH";
		mes "��������Ⴂ�I";
		next;
		mes "�]�~�U���[����a������";
		mes "�@���������}�b�Y�C�ɓn�����]";
		next;
		emotion 11;
		mes "[�}�b�Y�C]";
		mes "�ӂނӂށA�N���̂��j���ɓn��";
		mes "�H�ו�������Ăق����̂��B";
		mes "��������Ȃ��َq�Ƃ́A";
		mes "��肪��������܂��ˁI";
		next;
		mes "[�}�b�Y�C]";
		mes "����ɂ��Ă���Ȃ��َq�Ƃ�����";
		mes "���ʂȍޗ����K�v�ɂȂ邩��A";
		mes "�܂��ޗ��W�߂ł��ˁI";
		mes "�C���������Ă��܂�����[�B";
		next;
		mes "[�}�b�Y�C]";
		mes "�����ƁA���炵�܂����A";
		mes "�������͏���܂�������";
		mes "�˗����ꂽ����";
		mes "�쐬�Ɏ��Ԃ������邱�Ƃ�";
		mes "���`�����������B";
		mes "���ꂶ��A��낵�����肢���܂��ˁB";
		next;
		menu "�킩��܂����I",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A���f�o����^000000�ɂ���A";
		mes "^FF0000�~�U���[^000000�ɕ񍐂��悤�I";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[�}�b�Y�C]";
		mes "�₠�A";
		mes strcharinfo(0) + "����B";
		mes "^FF0000�~�U���[^000000����ɂ͓`���Ă��ꂽ���ȁH";
		next;
		menu "�܂��Ȃ�ł��B",-;
		mes "[�}�b�Y�C]";
		mes "�����ł������B";
		mes "���ꂶ��A��낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A���f�o����^000000�ɂ���A";
		mes "^FF0000�~�U���[^000000�ɕ񍐂��悤�I";
		close;
	}
L_QUEST03:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[�}�b�Y�C]";
		mes "�ӂ�ӂ�ӂӂӂ�B";
		mes "�����������َq�����`";
		mes "�������������������������B";
		mes "���������[�[�[�[�[�[�[�[�[�I";
		next;
		menu "����",-;
		mes "[�}�b�Y�C]";
		mes "����A���̑O�̕�����Ȃ��ł����B";
		next;
		menu "�˗��̌��ł����̂ł���",-;
		mes "[�}�b�Y�C]";
		mes "�����I";
		mes "�M�������������Ă����Ƃ́A";
		mes "���̒������ł��ˁ[�B";
		mes "�˗����e�Ȃ̂ł����A";
		mes "���̑O�~�U���[���񂩂�˗����ꂽ";
		mes "���َq�̍ޗ��W�߂Ȃ�ł���B";
		next;
		emotion 11;
		mes "[�}�b�Y�C]";
		mes "��R�̒����������Ă��āA";
		mes "�ǂ����Ă������ł́A";
		mes "���ɍs�����Ƃ��ł��Ȃ��Ăˁ[�B";
		mes "�{���͎����łƂ��";
		mes "�s�����������񂾂��ǁc�c";
		mes "�ł��A�N�Ȃ���S���I";
		next;
		mes "[�}�b�Y�C]";
		mes "���ƁA^0000FF���q�^���[��^000000�ɐ����Ă���؂̗t";
		mes "���ꂪ�K�v�Ȃ񂾂�ˁB";
		mes "��������肢�������B";
		mes "�����ƁA�X�̂ǂ̕ӂ肩�́A";
		mes "���ɋL�ڂ��Ă����ˁB";
		mes "���ꂶ���낵�����肢���܂��B";
		next;
		menu "�܂����Ă��������I",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���q�^���[��^000000�ɐ����Ă���؂���";
		mes "�t���ς�����Ă���B";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[�}�b�Y�C]";
		mes "���A�����ł��ˁB";
		mes "�����Ƃ��Ă��Ă��ꂽ��ł���!?";
		next;
		menu "�܂��ł�",-;
		mes "[�}�b�Y�C]";
		mes "�����ł������B";
		mes "���ꂶ��A��낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���q�^���[��^000000�ɐ����Ă���؂���";
		mes "�t���ς�����Ă���B";
		close;
	case 3:
		mes "[�}�b�Y�C]";
		mes "�ӂ�ӂ�ӂ�[�B";
		next;
		menu "�}�b�Y�C����H",-;
		mes "[�}�b�Y�C]";
		mes "�����������َq�����`";
		next;
		menu "�t���ς�����Ă��܂�����!!!",-;
		emotion 23;
		mes "[�}�b�Y�C]";
		mes "!?!?!?!";
		mes "�c�c�c�c";
		next;
		mes "[�}�b�Y�C]";
		mes "���[�т����肵���c�c";
		mes "�܂��S�����o�N�o�N���Ă܂���B";
		next;
		mes "[�}�b�Y�C]";
		mes "���ƁA";
		mes "�t���ς������ė��Ă��ꂽ��ł��ˁB";
		mes "���肪�Ƃ��������܂��I";
		mes "�m���Ɏ󂯎��܂����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�}�b�Y�C]";
		mes "�܂��A";
		mes "�˗����鎖�����邩������Ȃ�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	}
L_QUEST04:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[�}�b�Y�C]";
		mes "���ɓ����ƁA�Ƃ낯��";
		mes "���܂��`�B";
		mes "������ƌ������т�邩���`�B";
		mes "�ӂ�ӂӂ�B";
		next;
		menu "����ɂ���",-;
		mes "[�}�b�Y�C]";
		mes "�����I";
		mes strcharinfo(0) + "����";
		mes "��͂�" + strcharinfo(0) + "����";
		mes "���Ă���܂������I";
		next;
		mes "[�}�b�Y�C]";
		mes "����̈˗����e��";
		mes "�ޗ��W�߂Ȃ�ł����ǂ��B";
		mes "����[�A���̑O�̗t���ς����ł͂�";
		mes "���S�Ȃ��͍̂��Ȃ����Ƃ�";
		mes "�킩��܂��āB";
		next;
		emotion 11;
		mes "[�}�b�Y�C]";
		mes "���ƁA���̍ޗ��́c�c";
		mes "^0000FF�A�C���u���b�N^000000�̃h�u�̓D��";
		mes "�Ƃ��Ă��Ăق����񂾁I";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "��!?";
		mes "�h�u�̓D�ł����c�c�H";
		next;
		mes "[�}�b�Y�C]";
		mes "���������A�h�u�̓D�ˁB";
		mes "��낵�����˂������܂��ˁI";
		mes "���A������ꕨ�ł��B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�܂����Ă��������I";
		mes " ";
		mes "�i�ł��A�h�u�̓D�Ȃ�ĉ���";
		mes " �g���񂾂낤�c�c�j";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A�C���u���b�N^000000�̃h�u�ɂ���";
		mes "�D������Ă���B";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[�}�b�Y�C]";
		mes "���A�����ł��ˁB";
		mes "�����Ƃ��Ă��Ă��ꂽ��ł���!?";
		next;
		menu "�܂��ł�",-;
		mes "[�}�b�Y�C]";
		mes "�����ł������B";
		mes "���ꂶ��A��낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A�C���u���b�N^000000�̃h�u�ɂ���";
		mes "�D������Ă���B";
		close;
	case 3:
		mes "[�}�b�Y�C]";
		mes "�H�ׂ�l�ɂ���Ă�";
		mes "�łɂȂ�[��������Ȃ���`";
		mes "���܂��܂��܂��܂��I";
		mes "����������`�B";
		next;
		menu "�h�u�̓D������Ă��܂����B",-;
		mes "[�}�b�Y�C]";
		mes "���A����J���܁I";
		mes "���ꂱ��A���̐F����B";
		next;
		menu "���̓D�͉��Ɏg���̂ł����H",-;
		mes "[�}�b�Y�C]";
		mes "��H";
		mes "�����āA���َq�̍ޗ���";
		mes "���܂��Ă邶��Ȃ��ł����[�B";
		mes "�g�����͔閧�ł����ǂˁB";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "���A�����ł���ˁB";
		mes "���炵�܂����B";
		mes " ";
		mes "�i���̂��َq��H�ׂ��l�͂�����";
		mes "�@��ςȂ��ƂɂȂ�񂾂낤�ȁc�c�j";
		next;
		mes "[�}�b�Y�C]";
		mes "���₢��A";
		mes "�������������܂�����B";
		mes "�܂��A�������������낵��";
		mes "���肢���܂��ˁB";
		if('@novoce){
			mes "���ƁA��������Ă����āB";
			mes "���X�ł͔����Ȃ��i�������؂ɂˁI";
		}
		next;
		if('@novoce){
			if(!checkweight(568,20)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 568,20;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";//�n�C�t������
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�}�b�Y�C]";
		mes "�܂��A";
		mes "�˗����鎖�����邩������Ȃ�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";//�n�C�t���Ȃ�
		close;
	}
L_QUEST05:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[�}�b�Y�C]";
		mes "�ւ��[�I";
		mes "���َq���͂��̂����ȁ[�B";
		mes "���̂����[�B";
		next;
		menu "����ɂ���",-;
		mes "[�}�b�Y�C]";
		mes strcharinfo(0) + "����";
		mes "�������肪�Ƃ��������܂��I";
		mes "������ޗ��W�߂Ȃ�ł��B";
		next;
		emotion 11;
		mes "[�}�b�Y�C]";
		mes "����˗��������ޗ��́A";
		mes "^0000FF�A�C���x�t^000000�Ŏ���z�΂Ȃ�ł��B";
		mes "������Ƃ��Ă��Ă�������������ł��B";
		next;
		emotion 4,"";
		mes "[" + strcharinfo(0) + "]";
		mes "�z�΁c�c";
		mes "�i�܂��ςȍޗ����c�c�j";
		next;
		mes "[�}�b�Y�C]";
		mes "^0000FF�A�C���x�t^000000�Ɏ��̒m�荇����";
		mes "^FF0000�h���h�C^000000�Ƃ����l������̂ŁA";
		mes "���̐l����z�΂����";
		mes "������Ă��Ă��������B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�i�I�[�u���Ɏg������";
		mes "�@����񂾂낤���c�c�j";
		next;
		menu "��A�킩��܂���",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A�C���x�t^000000�ɂ���";
		mes "^FF0000�h���h�C^000000����z�΂�������Ă���B";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[�}�b�Y�C]";
		mes "���A�����ł��ˁB";
		mes "�����Ƃ��Ă��Ă��ꂽ��ł���!?";
		next;
		menu "�܂��ł�",-;
		mes "[�}�b�Y�C]";
		mes "�����ł������B";
		mes "���ꂶ��A��낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A�C���x�t^000000�ɂ���";
		mes "^FF0000�h���h�C^000000����z�΂�������Ă���B";
		close;
	case 3:
		mes "[�}�b�Y�C]";
		mes "�Y���`���b�`���[";
		mes "�Y���Y���`���b�`���[";
		mes "���N���[�����`�D�ƍ����ā`�B";
		next;
		menu "�z�΂������Ă��܂���",-;
		mes "[�}�b�Y�C]";
		mes "�������A";
		mes strcharinfo(0) + "����";
		mes "�d�����{���ɑ����ł��ˁB";
		next;
		mes "[�}�b�Y�C]";
		mes "���[��A�ǂ��z�΂���B";
		mes "����ł���w�����������َq��";
		mes "����͂��ł��B";
		mes "���肪�Ƃ��I�܂�������������";
		mes "��낵�����肢���܂��I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�}�b�Y�C]";
		mes "�܂��A";
		mes "�˗����鎖�����邩������Ȃ�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	}
L_QUEST06:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[�}�b�Y�C]";
		mes "���E���E���I";
		mes "���َq�[�[�[�[!!!";
		next;
		menu "���A���́c�c",-;
		mes "[�}�b�Y�C]";
		mes "�I";
		mes "�����A�܂��Ă܂�����[�I";
		mes "����̓o�C�������܂�";
		mes "�C�������炢�ɍs���Ăق����񂾁B";
		next;
		emotion 11;
		mes "[�}�b�Y�C]";
		mes "�o�C��������";
		mes "�����C�o���Đl������̂�";
		mes "���̐l����C����";
		mes "�����Ă��Ă�����Ăق����B";
		next;
		emotion 4,"";
		mes "[" + strcharinfo(0) + "]";
		mes "�C���ł��ˁB";
		mes "�킩��܂����I";
		mes "�i���x�͏����܂Ƃ��ȍޗ����j";
		next;
		mes "[�}�b�Y�C]";
		mes "���ꂶ���낵�����ނ�I";
		next;
		menu "��A�킩��܂���",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�o�C������^000000�ɂ���";
		mes "^FF0000�����C�o^000000���񂩂�C����������Ă���B";
		mes " ";
		mes "�]�o�C�������ɂ�^0000FF�C�Y���[�h^000000";
		mes "����s����]";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
	case 3:
	//�����C�o�̃N�G�I��点���ɖ߂������̃Z���t�͖������B
	case 4:
		mes "[�}�b�Y�C]";
		mes "���A�����ł��ˁB";
		mes "�����Ƃ��Ă��Ă��ꂽ��ł���!?";
		next;
		menu "�܂��ł�",-;
		mes "[�}�b�Y�C]";
		mes "�����ł������B";
		mes "���ꂶ��A��낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�o�C������^000000�ɂ���";
		mes "^FF0000�����C�o^000000���񂩂�C����������Ă���B";
		mes " ";
		mes "�]�o�C�������ɂ�^0000FF�C�Y���[�h^000000";
		mes "����s����]";
		close;
	case 5:
		mes "[�}�b�Y�C]";
		mes "�D�������N���[����";
		mes "�z�΂̑����͔��Q���`�I";
		mes "�܂����܂����I";
		mes "���������͂��̂����ȁ`";
		mes "�w�C�I";
		mes "�����ĊC�����`�`�B";
		next;
		menu "�C���������Ă��܂�����",-;
		mes "[�}�b�Y�C]";
		mes "�����I";
		mes "�C���I";
		mes "����������x�g�������Ƃ���";
		mes "��������ł���[�B";
		mes "�܂��ɃO�b�h�^�C�~���O�ł��ˁ[�B";
		next;
		mes "[�}�b�Y�C]";
		mes "������������B";
		mes "���ɂ̂��َq��������";
		mes "�߂Â��Ă��܂��I";
		mes strcharinfo(0) + "����I";
		mes "��������肪�Ƃ��������܂����B";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�}�b�Y�C]";
		mes "�܂��A";
		mes "�˗����鎖�����邩������Ȃ�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����B";
		close;
	}
L_QUEST07:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[�}�b�Y�C]";
		mes "�C���b�n�[�I";
		mes "���َq��������������";
		mes "�C���Ɓ[�B";
		next;
		menu "����ɂ��́I",-;
		mes "[�}�b�Y�C]";
		mes "�����ƁA";
		mes "������˗���";
		mes "�����󂯂Ă��������ł���ˁH";
		next;
		menu "�����Ȃ�ł���",-;
		emotion 11;
		mes "[�}�b�Y�C]";
		mes "����͐��ł����I";
		mes "�ł��A�����̐�����Ȃ���ł���B";
		mes "�C�m�[�w�����ꂪ�ق�����ł��B";
		mes "^0000FF���v�D�t�߂̓�^000000��^0000FF�A�C����^000000�Ƃ���";
		mes "���̎q�����܂�����";
		mes "���̎q���������Ă��Ă��������B";
		next;
		mes "[�}�b�Y�C]";
		mes "���ꂶ���낵�����ނ�I";
		next;
		menu "�܂����Ă��������I",-;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���v�D�t�߂̓�^000000�ɂ���";
		mes "^FF0000�A�C����^000000���񂩂�";
		mes "�C�m�[�w����������Ă���B";
		mes " ";
		mes "�]���v�D�t�߂̓��ɂ́A";
		mes "^0000FF�A���x���^^000000����s����]";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
	case 3:
		mes "[�}�b�Y�C]";
		mes "���A�����ł��ˁB";
		mes "�����Ƃ��Ă��Ă��ꂽ��ł���!?";
		next;
		menu "�܂��ł�",-;
		mes "[�}�b�Y�C]";
		mes "�����ł������B";
		mes "���ꂶ��A��낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF���v�D�t�߂̓�^000000�ɂ���";
		mes "^FF0000�A�C����^000000���񂩂�";
		mes "�C�m�[�w����������Ă���B";
		mes " ";
		mes "�]���v�D�t�߂̓��ɂ́A";
		mes "^0000FF�A���x���^^000000����s����]";
		close;
	case 4:
		mes "[�}�b�Y�C]";
		mes "�C�m�[�w��";
		mes "�����ė��Ă��ꂽ�݂����ł��ˁI";
		mes "����[�{���ɂ�������܂��B";
		next;
		mes "[�}�b�Y�C]";
		mes "�����A����������";
		mes "���َq���𑱂��܂��ˁB";
		if('@novoce){
			mes "���A����]�蕨�ł����ǂ���";
		}
		next;
		if('@novoce){
			if(!checkweight(579,50)){
				mes "�]�d�ʃI�[�o�[�I�]";
				close;
			}
			getitem 579,50;
		}
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�}�b�Y�C]";
		mes "�܂��A";
		mes "�˗����鎖�����邩������Ȃ�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_QUEST08:
	switch(AC_QUEST_ST_2){
	case 1:
		mes "[�}�b�Y�C]";
		mes strcharinfo(0) + "����";
		mes "���I�̈�u�ł���I";
		mes "�܂��ɂ��܋��ɂ̂��َq��";
		mes "�������悤�Ƃ��Ă��܂��I";
		next;
		set '@dummy,("�����I");
		misceffect 12;
		mes "[�}�b�Y�C]";
		mes "�����A�Ō�̎d�グ�ł��I";
		next;
		emotion 28;
		mes "[�}�b�Y�C]";
		mes "�����ł��I";
		mes "���΂炵�����َq���������܂����B";
		mes "�����A�����^FF0000�~�U���[^000000�����";
		mes "�͂��Ă��������I";
		mes "��A������Y�ꂸ�Ɏ󂯎���Ă���";
		mes "���������ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A���f�o����^000000�ɂ���";
		mes "^FF0000�~�U���[^000000����ɂ��َq��͂���B";
		close2;
		set AC_QUEST_ST_2,2;
		end;
	case 2:
		mes "[�}�b�Y�C]";
		mes strcharinfo(0) + "����";
		mes "�����͂��Ă��������I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�A���f�o����^000000�ɂ���";
		mes "^FF0000�~�U���[^000000����ɂ��َq��͂���B";
		close;
	case 3:
		mes "[�}�b�Y�C]";
		mes strcharinfo(0) + "����";
		mes "���A��Ȃ����B";
		next;
		menu "�����n��",-;
		mes "[�}�b�Y�C]";
		mes "���肪�Ƃ��������܂��B";
		mes strcharinfo(0) + "����";
		mes "�ɂ͐F�X�Ƃ����b�ɂȂ���";
		mes "���܂��܂����B";
		mes "�{���ɂ��肪�Ƃ��������܂����I";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close2;
		set AC_QUEST_ST_2,99;
		end;
	case 99:
		mes "[�}�b�Y�C]";
		mes "�܂��A";
		mes "�˗����鎖�����邩������Ȃ�����";
		mes "���̂Ƃ��͂�낵�����肢���܂��ˁB";
		next;
		mes "^FF0000�y�˗��B���z^000000";
		mes "�]�˗���B�������I";
		mes "�`���҃A�J�f�~�[��";
		mes "�񍐂��ɍs�����]";
		close;
	}
L_OTHER:
	mes "[�}�b�Y�C]";
	mes "�ӂ�ӂ�ӂӂӂ�B";
	mes "�����������َq�����`";
	mes "�������������������������B";
	mes "���������[�[�[�[�[�[�[�[�[�I";
	close;
}
//---------------------------------------------------------------
lighthalzen.gat,51,161,0	script		��#AC_QUE02	111,{
	mes "�]�؂ɑ�R�̗t���ς������Ă���]";
	if(AC_QUEST_LV_2==2 && (AC_QUEST_ST_2==2 || AC_QUEST_ST_2==3)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "���̗t���ςŗǂ��̂��ȁH";
		mes "�Ƃ肠�����ꖇ�Ƃ��Ă������B";
		next;
		mes "�]�؂���ꖇ�t���Ƃ����]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�t���ς�͂���B";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�t���ς͓��肵�Ă邵�A";
		mes "����^FF0000�}�b�Y�C^000000����ɓ͂��悤�B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�t���ς�͂���B";
		close;
	}
}
einbroch.gat,111,261,0	script	�h�u�̓D#AC_QUE02	111,{
	mes "�]�h�u�̒��ɂ��������";
	mes "�D���l�܂��Ă���]";
	if(AC_QUEST_LV_2==3 && (AC_QUEST_ST_2==2 || AC_QUEST_ST_2==3)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[" + strcharinfo(0) + "]";
		mes "����A�{���ɂ��َq�̍ޗ���";
		mes "�Ȃ�񂾂낤���c�c";
		mes "����ɂ��Ă������L�����c�c";
		next;
		mes "�]�h�u�̓D��e��ɋl�߂��]";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�D��͂���B";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "�D�͎�ɓ��ꂽ���A";
		mes "����^FF0000�}�b�Y�C^000000����ɓ͂��悤�A";
		next;
		//�Ǔ_�Ŗ{�I�ʂ�
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�t���ς�͂���B";
		close;
	}
}
einbech.gat,130,247,3	script	�h���h�C#AC_QUE02	848,{
	mes "[�h���h�C]";
	mes "�������d�����Ȃ̂ŁA";
	mes "�b�������Ȃ��ł��炦�邩���H";
	if(AC_QUEST_LV_2==4 && (AC_QUEST_ST_2==2 || AC_QUEST_ST_2==3)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 2:
		menu "�}�b�Y�C���񂩂�̈˗��Łc�c",-;
		mes "[�h���h�C]";
		mes "�����A�����̒m�荇�����[�B";
		mes "����ŁA�����͉������āH";
		next;
		menu "�o�܂��������",-;
		mes "[�h���h�C]";
		mes "�Ȃ�قǂȁA�z�΂��K�v�Ɓc�c";
		mes "�z����A";
		mes "����炢�Ȃ��邳�B";
		next;
		mes "[�h���h�C]";
		mes "���������΁A�O����C�ɂȂ��Ă��񂾂���";
		mes "�����́A�z�΂����َq����";
		mes "���ɂ����Ă���񂾂낤���H";
		mes "���񂽂͒m���Ă邩���H";
		mes "�����Ă��������Ă���Ȃ����Ă�I";
		next;
		menu "����c�c",-;
		mes "[�h���h�C]";
		mes "�ӂށ[�A��͂肩�c�c";
		mes "�����Ă������Ă���Ȃ��񂾂�ȁB";
		mes "�܂��A������B";
		mes "���ꂶ��A���͎d���ɖ߂��B";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�z�΂�͂���B";
		close2;
		set AC_QUEST_ST_2,3;
		end;
	case 3:
		mes "[�h���h�C]";
		mes "��A���񂽂܂������̂��B";
		mes "�����͂��Ȃ��Ă����̂��H";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�z�΂�͂���B";
		close;
	}
}
izlu2dun.gat,136,50,4	script	�����C�o#AC_QUE02	88,{
	if(AC_QUEST_LV_2!=5 || AC_QUEST_ST_2<2 || AC_QUEST_ST_2>5) goto L_OTHER;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[�����C�o]";
		mes "���[��A�������������B";
		next;
		menu "�C�����������I",-;
		mes "[�����C�o]";
		mes "��H";
		mes "���܂Ȃ���";
		mes "����ǂ��낶��Ȃ��񂾁c�c";
		mes "���z�𗎂Ƃ��Ă��܂��ĂˁB";
		next;
		menu "�o�܂��������",-;
		mes "[�����C�o]";
		mes "�����������ƂȂ̂��c�c";
		mes "�悵�I";
		mes "���Ⴀ�A�����C��������Ă���Ԃ�";
		mes "�N�͖l�̍��z��{���Ă���Ȃ����H";
		mes "���z�������鍠�ɂ�";
		mes "�C�������Ă���Ǝv����B";
		next;
		menu "�킩��܂����I",-;
		mes "[�����C�o]";
		mes "�T���L���[�I";
		mes "�����ƁA�����k�̕��ŗ��Ƃ���";
		mes "�Ǝv���񂾂�ˁc�c";
		mes "��낵�����񂾂�B";
		close2;
		set AC_QUEST_ST_2,3;
		viewpoint 1,58,165,32,0xFF9900;
		//ID�ʂ������̂œK����
		end;
	case 3:
		mes "[�����C�o]";
		mes "���z���ނ��I";
		mes "���͊C���Ƃ��Ă邩�炳�B";
		close2;
		viewpoint 1,58,165,32,0xFF9900;
		end;
	case 4:
		mes "[�����C�o]";
		mes "�����A����́I";
		mes "���̍��z����Ȃ����I";
		mes "�����Ă��ꂽ�񂾂ȁ[�I";
		mes "�T���L���[�I";
		next;
		mes "[�����C�o]";
		mes "�����ƁA���ꂪ�񑩂�";
		mes "�C�����I";
		mes "��ꂽ�΂��肾����V�N�����I";
		mes "�����ɓ͂��Ă���I";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�C����͂���B";
		close2;
		set AC_QUEST_ST_2,5;
		end;
	case 5:
		mes "[�����C�o]";
		mes "���z�������Ă����";
		mes "���肪�Ƃ��ȁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�C����͂���B";
		close;
	}
L_OTHER:
	mes "[" + strcharinfo(0) + "]";
	mes "�Z���������B";
	mes "�b��������͎̂~�߂悤�B";
	close;
}
izlu2dun.gat,58,165,0	script	������#AC_QUE02	111,{
	mes "�]���z�炵�����̂������Ă���]";
	if(AC_QUEST_LV_2==5 && (AC_QUEST_ST_2==3 || AC_QUEST_ST_2==4)) next;
	else close;
	switch(AC_QUEST_ST_2){
	case 3:
		mes "[" + strcharinfo(0) + "]";
		mes "^FF0000�����C�o^000000���񂪒T���Ă����̂�";
		mes "���ꂩ�ȁH";
		mes "�Ƃ肠�����͂��Ă݂悤�B";
		next;
	case 4:
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�쓌^000000�ɂ���";
		mes "^FF0000�����C�o^000000����ɍ��z��͂���B";
		close2;
		set AC_QUEST_ST_2,4;
		viewpoint 1,136,50,12,0xFF9900;
		end;
	}
}
alb2trea.gat,105,95,4	script	�A�C����#AC_QUE02	96,{
	if(AC_QUEST_LV_2!=6 || AC_QUEST_ST_2<2 || AC_QUEST_ST_2>4) goto L_OTHER;
	switch(AC_QUEST_ST_2){
	case 2:
		mes "[�A�C����]";
		mes "����ɂ��́[�B";
		mes "�������p������H";
		next;
		menu "������������",-;
		mes "[�A�C����]";
		mes "^FF0000�}�b�Y�C^000000���񂩂�̈˗��Ȃ�ł��ˁB";
		mes "�����グ�Ă��ǂ��ł���B";
		mes "�ł��A������������I";
		next;
		menu "�����Ƃ́H",-;
		mes "[�A�C����]";
		mes "�A�����炩��Ȃ̂�ˁB";
		mes "������A^0000FF���̓��ɂ��铹��l^000000����";
		mes "^FF0000�ԃ|�[�V����^000000��1������";
		mes "�����ė��Ăق����́B";
		next;
		menu "�킩��܂����I",-;
		mes "[�A�C����]";
		mes "�����肪������ˁI";
		mes "���͂����ő҂��Ă��邩��";
		mes "�Ȃ�ׂ������ˁ[�A";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "����l����^FF0000�ԃ|�[�V����^000000��";
		mes "1�����Ă��ăA�C�����ɓn���B";
		close2;
		set AC_QUEST_ST_2,3;
		viewpoint 1,87,65,32,0xFF9900;
		end;
	case 3:
		if(countitem(501)==0){//������
			mes "[�A�C����]";
			mes "�A�����炩��Ȃ̂�ˁB";
			mes "���͂����ő҂��Ă��邩��";
			mes "�Ȃ�ׂ������ˁ[�A";
			next;
			mes "^FF0000�y�~�b�V�����z^000000";
			mes "����l����^FF0000�ԃ|�[�V����^000000��";
			mes "1�����Ă��ăA�C�����ɓn���B";
			close2;
			viewpoint 1,87,65,32,0xFF9900;
			end;
		}
		set AC_QUEST_ST_2,4;
		delitem 501,1;
		mes "[�A�C����]";
		mes "���肪�Ƃ��B";
		mes "�����ė��Ă��ꂽ�݂����ˁI";
		mes "��������������I";
		next;
		mes "�]�S�N�b�S�N�b";
		mes "�@�A�C�������ԃ|�[�V������";
		mes "�@���݊������]";
		next;
		mes "����A�񑩂̕i�ˁI";
		mes "�M�d�Ȃ񂾂���A�C������";
		mes "�����ċA���Ă�ˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�C�m�[�w����͂���B";
		close;
	case 4:
		mes "[�A�C����]";
		mes "�����͂��Ă����ĂˁB";
		next;
		mes "^FF0000�y�~�b�V�����z^000000";
		mes "^0000FF�W���m�[^000000��^FF0000�}�b�Y�C^000000�����";
		mes "�C�m�[�w����͂���B";
		close;
	}
L_OTHER:
	mes "[�A�C����]";
	mes "�c�c";
	close;
}
