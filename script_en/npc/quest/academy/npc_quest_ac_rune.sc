//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  ���[���̈˗�
//
//                                                 by Pneuma
//------------------------------------------------------------

// ----------------------------------------------------------------------------------------
//  �~�j�}�b�v�̈�̐F
//  �F�C�ɂȂ邠�̎q
//  �ԁF��Ղ̔�
//  ��F�����b�ɂȂ������̐l��
//  �΁F�����̂���`��
//  ���F�`���҂ɂȂ肽��
// ----------------------------------------------------------------------------------------
// ���[��
ac_cl_area.gat,48,145,4	script	���[��#ac	430,{
	function GetQueLv;
	function GetQuestSelectList;
	function GetQuestName;
	function GiveExp;
	set '@novice, callfunc("AC_GetNovice");
	cutin "jpn_run01",2;
	if('@novice && AC_NOVICE_QUE==30){ //�t�F�C�̍u�K��
		set AC_NOVICE_QUE,31;
		mes "[���[��]";
		mes "�`���҃A�J�f�~�[�ւ悤�����I";
		mes "�V��������ˁB";
		mes "���������Ȃ񂾂��ǁA";
		mes "��`���ĖႢ�������Ƃ�����́B";
		mes "�ǂ̈˗�����`�������H";
		next;
		goto L_GETQUE;
	}
	if(!'@novice && !AC_NOVICE_QUE){
		mes "[���[��]";
		mes "�`���҃A�J�f�~�[�ւ悤�����I";
		mes "�V��������c�c�Ƃ����ɂ�";
		mes "���Ȃ����҂ł͂Ȃ����͋C��";
		mes "�����Ă����ˁB";
		mes "�����p������H";
	} else {
		mes "[���[��]";
		mes "����A����ɂ��́B";
		mes "�����p������H";
	}
	next;
L_MENU:
	menu "�˗��ɂ��Ęb��",L_QUEST,"�����ɂ��Ęb��",L_TEST,"���[������͉������Ă���́H",L_ABOUT,"�Ȃ�ł��Ȃ�",L_NOTHX;
L_QUEST:
	mes "[���[��]";
	mes "�˗��ɂ��ĂˁB";
	mes "���[�ƁA";
	mes "�˗��̉��̘b�Ȃ̂�����H";
	next;
	menu "�˗����󂯂�",L_GETQUE,"�˗��̊m�F",L_QUECHECK,"�˗��̕�",L_QUEREPORT,"�˗��̓��e�ɂ��Ċm�F������",L_QUEINFO,"�Ȃ�ł��Ȃ�",L_NOTHX;
L_GETQUE:
	if(AC_QUEST_LV_0+AC_QUEST_LV_1+AC_QUEST_LV_2+AC_QUEST_LV_3+AC_QUEST_LV_4==45){
		emotion 2;
		mes "[���[��]";
		mes "���A�M�����󂯂���˗��͖�����B";
		mes "����Ȃɑ�R���������ǁA";
		mes "�M������`���Ă��ꂽ�������ŁA";
		mes "�S�������Â���������A";
		mes "����������ƉɂɂȂ邩������Ȃ���B";
		mes "�����������̂ł��H�ׂɍs����������B";
		next;
		goto L_OTHER;
	}
	GetQuestSelectList 0,'@quecount,'@quelist$,'@queidlist,'@queidcount;
	if('@quecount==0 && (AC_QUEST_ST_0 || AC_QUEST_ST_1 || AC_QUEST_ST_2 || AC_QUEST_ST_3 || AC_QUEST_ST_4)){
		mes "[���[��]";
		mes "�M���͍����������Ă�˗���";
		mes "���邶��Ȃ��B";
		mes "�܂��͍��̈˗��傳��������Ă����āB";
		next;
		goto L_OTHER;
	}
	mes "[���[��]";
	mes "���A�M���������������Ƃ̏o����";
	mes "�˗���^FF0000"+ '@quecount +"^000000�ˁB";
	next;
	mes "[���[���̃����|�C���g�A�h�o�C�X]";
	mes "^008800�ΐF^000000�̈˗��̓����X�^�[�Ƃ�";
	mes "�퓬�͖����Ǝv����B";
	mes "^FF0000�ԐF^000000�̈˗��̓����X�^�[�Ƃ̐퓬��";
	mes "���邩������Ȃ��B";
	mes "�����͖��S�ɂˁB";
	mes "�ǂ�𐿂������H";
	next;
	set '@que_id, '@queidlist[select('@quelist$)-1];
	if('@que_id==99) goto L_NOTHX;
	set '@quelv,GetQueLv('@que_id);
	set '@idx,'@que_id*9+'@quelv;
	if(BaseLevel < 'QUE_REQUIRE['@idx]){
		mes "[���[��]";
		mes "���̈˗��ɂ�";
		mes "���x����^006600" + ('QUE_REQUIRE['@idx]-BaseLevel) + "^000000����Ȃ���ˁB";
		mes "����������Ɛ���������A";
		mes "�˗����ł���悤�ɂȂ��B";
		next;
		goto L_OTHER;
	}
	set '@client_id, 'QUE_CLIENT['@idx];
	mes "[���[��]";
	switch ('@client_id) {
	case 0:
		mes "����ˁH";
		mes "�˗���́A�v�����e���ݏZ�̒j��";
		mes "�n���o�[�g���񂩂�̈˗���B";
		next;
		mes "[���[��]";
		mes "�n���o�[�g���񂪂���ꏊ��";
		mes "�v�����e�������t��";
		mes "���W�ł�����(146,232)�t��";
		mes "�ɂȂ�悤�ˁB";
		break;
	case 1:
		mes "���̈˗��͂��Ɓc�c";
		mes "�t�F�C�����ݏZ�̒j��";
		mes "�W�F�����h���񂩂�ˁB";
		mes "�w�֐E�l����炵����B";
		next;
		mes "[���[��]";
		mes "�W�F�����h���񂪂���ꏊ��";
		mes "�t�F�C������������4�������ɐi��";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(144.85)�t�߂̂悤�ˁB";
		break;
	case 2:
		mes "���̈˗���";
		mes "�C�Y���[�h�ݏZ�̏���";
		mes "�X�U���k���񂩂�̂��̂ˁB";
		next;
		mes "[���[��]";
		mes "�X�U���k���񂪂���ꏊ��";
		mes "�C�Y���[�h�̒����t��";
		mes "���W�Ō�����(138,156)�t��";
		mes "�ɂȂ�悤�ˁB";
		break;
	case 3:
		mes "����ˁH";
		mes "����́A�A���x���^�ݏZ�̏���";
		mes "���C�[�[���񂩂�̂��̂ˁB";
		next;
		mes "[���[��]";
		mes "���C�[�[����̂���ꏊ��";
		mes "�A���x���^��8���̕���";
		mes "���W�Ō�����(39,46)�t��";
		mes "�ɂȂ�悤�ˁB";
		break;
	case 4:
		mes "����ˁH";
		mes "����́A�A���f�o�����ݏZ�̏���";
		mes "�~�U���[���񂩂�̂��̂ˁB";
		next;
		mes "[���[��]";
		mes "�~�U���[���񂪂���ꏊ��";
		mes "�A���f�o����4�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(231,107)�t�߂̂悤�ˁB";
		break;
	case 5:
		mes "����ˁH";
		mes "����́A�W���m�[�ݏZ�̒j��";
		mes "�}�b�Y�C���񂩂�̂��̂ˁB";
		mes "���َq�E�l����݂����B";
		next;
		mes "[���[��]";
		mes "�}�b�Y�C���񂪂���ꏊ��";
		mes "�W���m�[9�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(95,184)�t�߂̂悤�ˁB";
		break;
	case 6:
		mes "����ˁH";
		mes "����́A�t�B�Q���ݏZ�̒j��";
		mes "�^���V�[���m���񂩂�̂��̂ˁB";
		next;
		mes "[���[��]";
		mes "�^���V�[���m���񂪂���ꏊ��";
		mes "�t�B�Q��6�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(107,77)�t�߂̂悤�ˁB";
		break;
	case 7:
		mes "����ˁH";
		mes "����́A�t�B�Q���ݏZ�̒j��";
		mes "�A���������񂩂�̂��̂ˁB";
		next;
		mes "[���[��]";
		mes "�A���������񂪋���ꏊ��";
		mes "�t�B�Q��9�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(73,155)�t�߂̂悤�ˁB";
		break;
	case 8:
		mes "����ˁH";
		mes "����́A�Q�t�F���ݏZ�̏���";
		mes "�I�l�X�g���񂩂�̂��̂ˁB";
		next;
		mes "[���[��]";
		mes "�I�l�X�g���񂪋���ꏊ��";
		mes "�Q�t�F��2�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(168,170)�t�߂̂悤�ˁB";
		break;
	}
	next;
	mes "[���[��]";
	mes "�˗����e�Ɋւ��Ă�";
	mes "�˗��傩��";
	mes "�����Ă��炤���ƂɂȂ��B";
	mes "���̈˗���^FF0000"+ 'QUE_CREDITS['@quelv] +"^000000�P�ʎ擾��B";
	next;
	if(!'@novice){
		mes "[���[��]";
		mes "�M���ɂ�^0000FF�{�����e�B�A^000000��";
		mes "�Ȃ��Ă��܂���������Ȃ����ǁA";
		mes "����������H";
	}
	mes "�]���̈˗����󂯂܂����H�]";
	next;
	menu "�͂�",-,"������",L_QUECANCEL;
	if('@novice){
		mes "[���[��]";
		mes "�˗���^0000FF�w�C��^000000��";
		mes "��`���Ă�������";
		mes "�����Ă���B";
		//2011/??/??�ύX
		//mes "^0000FF�w�C��^000000�͋�������";
		//mes "2F�ɂ���Ǝv������A";
		//mes "�T���Ă��傤�����B";
		mes "^0000FF�w�C��^000000��^FF0000���̏ꏊ�����̕���";
		mes "�s������^000000�ɂ���Ǝv������A";
		mes "�T���Ă݂Ă��傤�����B";
		next;
		if('QUE_BATTLE['@que_id]){
			mes "[���[��]";
			mes "�X�̊O�ɏo��Ƃ���";
			mes "�A�C�e���̏�����";
			mes "�����Ă����Ƃ�����B";
			mes "�˗��̖������I������";
			mes "���̂Ƃ���ɖ߂��Ă��ĂˁB";
			next;
		}
		mes "[���[��]";
		mes "�A�J�f�~�[�̊֌W�҂�";
		mes "�X�̒����t�߂ɂ���Ǝv������A";
		mes "��������X�̒�����";
		mes "�s���Ă݂�Ƃ�����B";
		mes "���ꂶ��A�����Ă�����Ⴂ�I";
		next;
		mes "[���[��]";
		mes "�˗��𖳎��I������";
		mes "���̂Ƃ���ɖ߂��Ă��ĂˁB";
		next;
	}
	else {
		mes "[���[��]";
		mes "�˗��𖳎��I������";
		mes "���̂Ƃ���ɖ߂��Ă��ĂˁB";
		mes "���ꂶ��A�����Ă�����Ⴂ�I";
		next;
	}
	//�˗��擾����
	switch ('@que_id) {
	case 0: set AC_QUEST_ST_0,1; break;
	case 1: set AC_QUEST_ST_1,1; break;
	case 2: set AC_QUEST_ST_2,1; break;
	case 3: set AC_QUEST_ST_3,1; break;
	case 4: set AC_QUEST_ST_4,1; break;
	}
	mes "[�C���t�H���[�V����]";
	mes "�]�˗��̐i�s���Ƀ~�j�}�b�v��";
	mes "�w�{�x��"+'QUE_COLOR$['@que_id]+"�ŕ\�������悤��";
	mes "�Ȃ�܂����]";
	if('@novice){
		mes " ";
		mes "�]�˗��̐i�s����^FF0000�y�~�b�V�����z^000000��";
		mes "�\�����s����悤�ɂȂ�܂����]";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]^FF0000�y�~�b�V�����z^000000�ŕ\�������X��";
		mes "�A�J�f�~�[�֌W�҂̋߂���";
		mes "�ړ�����ƁA";
		mes "^FF0000���̍s���悪�~�j�}�b�v���";
		mes "�w�{�x�ŕ\������܂�^000000�]";
	}
	goto L_CLOSE;
L_QUECANCEL:
	mes "[���[��]";
	mes "�킩������A�󂯂����Ȃ�����";
	mes "�܂����ɘb�������Ă��傤�����B";
	goto L_CLOSE;
L_QUECHECK:
	GetQuestSelectList 1,'@quecount,'@quelist$,'@queidlist,'@queidcount;
	if('@quecount==0) {
		mes "["+ strcharinfo(0) +"]";
		mes "(���m�F�ł���˗��͖������c�c)";
		goto L_CLOSE;
	}
	mes "[���[��]";
	mes "����A�˗���̋���ꏊ��";
	mes "������x���������̂ˁH";
	if('@quecount==1){
		next;
		set '@que_id, '@queidlist[0];
	} else {
		mes "���̈˗����m�F�������̂�����H";
		next;
		set '@que_id, '@queidlist[select('@quelist$)-1];
	}
	set '@quelv,GetQueLv('@que_id);
	set '@idx,'@que_id*9+'@quelv;
	set '@client_id, 'QUE_CLIENT['@idx];
	mes "[���[��]";
	switch ('@client_id) {
	case 0:
		mes "�˗���̒j��";
		mes "�n���o�[�g���񂪂���ꏊ��";
		mes "�v�����e�������t��";
		mes "���W�ł�����(146,232)�t��";
		mes "�ɂȂ�悤�ˁB";
		break;
	case 1:
		mes "�˗���̒j��";
		mes "�W�F�����h���񂪂���ꏊ��";
		mes "�t�F�C������������4�������ɐi��";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(144.85)�t�߂̂悤�ˁB";
		break;
	case 2:
		mes "�˗���̏���";
		mes "�X�U���k���񂪂���ꏊ��";
		mes "�C�Y���[�h�̒����t��";
		mes "���W�Ō�����(138,156)�t��";
		mes "�ɂȂ�悤�ˁB";
		break;
	case 3:
		mes "�˗���̏���";
		mes "���C�[�[����̂���ꏊ��";
		mes "�A���x���^��8���̕���";
		mes "���W�Ō�����(39,46)�t��";
		mes "�ɂȂ�悤�ˁB";
		break;
	case 4:
		mes "�˗���̏���";
		mes "�~�U���[���񂪂���ꏊ��";
		mes "�A���f�o����4�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(231,107)�t�߂̂悤�ˁB";
		break;
	case 5:
		mes "�˗���̒j��";
		mes "�}�b�Y�C���񂪂���ꏊ��";
		mes "�W���m�[9�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(95,184)�t�߂̂悤�ˁB";
		break;
	case 6:
		mes "�˗���̒j��";
		mes "�^���V�[���m���񂪂���ꏊ��";
		mes "�t�B�Q��6�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(107,77)�t�߂̂悤�ˁB";
		break;
	case 7:
		mes "�˗���̒j��";
		mes "�A���������񂪋���ꏊ��";
		mes "�t�B�Q��9�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(73,155)�t�߂̂悤�ˁB";
		break;
	case 8:
		mes "�˗���̏���";
		mes "�I�l�X�g���񂪋���ꏊ��";
		mes "�Q�t�F��2�������ɂ���";
		mes "�����̒��B";
		mes "�����̂���ꏊ�����W�Ō�����";
		mes "(168,170)�t�߂̂悤�ˁB";
		break;
	}
	next;
	mes "[�C���t�H���[�V����]";
	mes "�]^FF0000�y�~�b�V�����z^000000�ŕ\�������X��";
	mes "�A�J�f�~�[�֌W�҂̋߂���";
	mes "�ړ�����ƁA";
	mes "^FF0000���̍s���悪�~�j�}�b�v���";
	mes "�w�{�x�ŕ\������܂�^000000�]";
	next;
	mes "[���[��]";
	mes "�˗����e�Ɋւ��Ă�";
	mes "�˗��傩�璼�ڕ����Ă��傤�����ˁB";
	goto L_CLOSE;
L_QUEREPORT:
	GetQuestSelectList 2,'@quecount,'@quelist$,'@queidlist,'@queidcount;
	if('@quecount==0) {
		mes "["+ strcharinfo(0) +"]";
		mes "(���񍐂ł���˗��͖������c�c)";
		goto L_CLOSE;
	}
	mes "["+ strcharinfo(0) +"]";
	mes "(�ǂ��񍐂��悤�H)";
	next;
	set '@que_id, '@queidlist[select('@quelist$)-1];
	GetQuestName '@que_id,'@que_name$;
	if('@que_id==99) {
		emotion 1;
		mes "["+ strcharinfo(0) +"]";
		mes "(���񍐂���̂͂�߂Ă������c�c)";
		goto L_CLOSE;
	}
	set '@quelv,GetQueLv('@que_id);
	mes "[���[��]";
	mes '@que_name$ + "�̕񍐂ˁB";
	mes "���[�ƁA";
	mes "���m�F���邩�班���҂��Ăˁc�c";
	next;
	mes "[���[��]";
	mes "�m�F�ł�����B";
	mes "�����Ɉ˗��l����˗�������";
	mes "�A�������Ă���݂����B";
	if('@novice){
		if('QUE_BATTLE['@que_id]){
			mes "�M����������Ȃ��I";
			mes "�����X�^�[�����đ�ς������ł��傤�H";
			mes "�{���ɖ����ł悩������B";
		} else {
			mes "�����l�I";
		}
		next;
		mes "[���[��]";
		mes "�ケ��A������̂��J���ˁB";
		set '@pot_count, 150 + '@quelv*30;
		if(!checkweight(569,'@pot_count)){
			mes "����H";
			mes "�ו��������ς��œn���Ȃ���B";
			mes "�ו���a���Ă���A�񍐂��ĂˁB";
			goto L_CLOSE;
		}
		GiveExp '@que_id;
		getitem 569,'@pot_count;
		mes "���S�җp�|�[�V����" + '@pot_count + "�I";
		mes "�񕜗ʂ͏��Ȃ����ǁA";
		mes "�����y������`���Ŗ𗧂Ǝv����B";
		next;
		mes "[���[��]";
		mes "����ƒP�ʂ�";
		mes "���̈˗��Ŏ擾�ł���P�ʂ�";
		mes "[" + 'QUE_CREDITS['@quelv] + "]�P�ʂɂȂ��B";
		mes "���܂ł̒P�ʂƍ��v�����";
		mes "[" + AC_CREDIT + "]�P�ʂˁB";
		next;
		mes "[���[��]";
		mes "����Ŏ葱���������I";
		mes "�܂��A�p����������";
		mes "���ɘb�������Ă��傤�����ˁB";
		goto L_CLOSE;
	} else {
		next;
		mes "[���[��]";
		mes "�M���̂悤�ȏn���̖`���҂�";
		mes "��`���Ă��炦��";
		mes "�{���ɂ��ꂵ����I";
		mes "���肪�Ƃ��I";
		next;
		GiveExp '@que_id;
		mes "[���[��]";
		mes "�M���ɂ�^0000FF�{�����e�B�A^000000��";
		mes "�Ȃ��Ă��܂������ǁA";
		mes "���̈˗���[" + 'QUE_CREDITS['@quelv] + "]�P�ʎ擾��B";
		mes "���܂ł̒P�ʂƍ��v�����";
		mes "[" + AC_CREDIT + "]�P�ʁB";
		next;
		mes "[���[��]";
		mes "�܂��A�M���Ɏ�`���Ă��炦����A";
		mes "�叕����I";
		mes "����Ŏ葱���������I";
		mes "�܂��A�p����������";
		mes "���ɘb�������ĂˁB";
		goto L_CLOSE;
	}
L_QUEINFO:
	emotion 20;
	mes "[���[��]";
	mes "�˗��̓��e�ɂ��ĂˁB";
	mes "��[�A�����琶�k�Ɉ˗����e��";
	mes "�ڍׂ������邱�Ƃ͂��Ă��Ȃ��̂�B";
	mes "�����Đ��k����R����̂�";
	mes "��l��l�������Ă��玞�Ԃ�";
	mes "�����炠���Ă�����Ȃ�����Ȃ��H";
	next;
	mes "[���[��]";
	mes "�������邱�ƂƂ����΁A";
	mes "�M���B�̃��x�����m�F����";
	mes "�����ł��邩�ǂ�������";
	mes "���f���Ă�����Ă��ƁB";
	next;
	mes "[���[��]";
	mes "������A�����󂯂���˗���";
	mes "��������Ƃ�����";
	mes "�M���̃��x���ŉ����ł�������";
	mes "�˗�������������Ă��ƂɂȂ邩��";
	mes "�撣���ă��x���������Ă��炤";
	mes "�K�v�������B";
	next;
	mes "[���[��]";
	mes "�����I";
	mes "�������������I";
	mes "�F��F�I";
	mes "�˗��ɎO�̐F�����Ă�́B";
	next;
	mes "[���[��]";
	mes "���^008800�ΐF^000000�ˁB";
	mes "^008800�ΐF^000000�́A�����������������X�^�[��";
	mes "�퓬����\�������Ȃ�";
	mes "�Ǝv�������̂ˁB";
	mes "�����炿��[���Ǝh��������Ȃ�����";
	mes "����Ȃ���I";
	next;
	mes "[���[��]";
	mes "��ڂ�^FF0000�ԐF^000000�ˁB";
	mes "^FF0000�ԐF^000000���Ă��A";
	mes "�����댯�ȃC���[�W���Ȃ��H";
	next;
	mes "[���[��]";
	mes "�S�����̒ʂ�I";
	mes "�����X�^�[�Ɛ퓬����\����";
	mes "�����Ǝv������̂ɐԐF��";
	mes "���Ă���́I";
	next;
	emotion 29;
	mes "[���[��]";
	mes "�ӂӂӁA�����X�^�[��";
	mes "�Ȃ��|���A�M���M����";
	mes "�Ƃ���Ő��҂���X�����c�c";
	mes "���܂�Ȃ��킟�c�c";
	mes "���ӂӂӂ�";
	next;
	menu "�����Ɓc�c",-;
	emotion 0;
	mes "[���[��]";
	mes "�͂��I";
	mes "���A���߂񂲂߂�B";
	mes "���ƁA����b���Ă������H";
	next;
	menu "�˗��̐F�ɂ���",-;
	mes "[���[��]";
	mes "���I";
	mes "������������ˁI";
	mes "���ƁA����";
	mes "���������ɂ͏������x����";
	mes "����Ȃ��˗����e�Ȃ񂾂���";
	mes "�����^777777�D�F^000000�ɂ��Ă����B";
	next;
	mes "[���[��]";
	mes "�����͂���ȂƂ����ȁH";
	goto L_CLOSE;
L_TEST:
	///*�P�ʍČv�Z*/{
	//	set AC_CREDIT,0;
	//	for(set '@i,0; '@i<5; set '@i,'@i+1){
	//		for(set '@j,0; '@j < GetQueLv('@i); set '@j,'@j+1){
	//			set AC_CREDIT,AC_CREDIT+'QUE_CREDITS['@j];
	//		}
	//	}
	//}
	set '@chklv,(BaseLevel < 'TST_REQUIR_LV[AC_RANK]);
	set '@chkct,(AC_CREDIT < 'TST_REQUIR[AC_RANK]);
	mes "[���[��]";
	mes "�����ɂ��ĂˁB";
	mes "���[�ƁA";
	mes "�����̉��̘b�Ȃ̂�����H";
	next;
	menu "�������󂯂�",L_GETTEST,"�����̊m�F",L_CHKTEST,"�����̕�",L_REPOTEST,"�������󂯂�ɂ́H",L_ABOUTTEST,"�Ȃ�ł��Ȃ�",L_NOTHX;
L_GETTEST:
	if(AC_RANK>=7){
		emotion 2;
		mes "[���[��]";
		mes "�M���͈ꎟ�ے����C�����Ă���̂ˁB";
		mes "���͎������s���ĂȂ���B";
		mes "�M���͕׋��M�S�Ȃ̂ˁB";
		mes "���̋C�������삯�o���̖`���҂ɂ�";
		mes "�`���Ăق�����B";
	}
	if(AC_RANKTEST){
		mes "[���[��]";
		mes "�M���͍��������󂯂Ă����B";
		mes "���̎������󂯂邽�߂ɂ́A";
		mes "���̎�������萋����K�v�������B";
		mes "�܂��́A���̎�����";
		mes "��萋���Ă��傤�����B";
		goto L_CLOSE;
	}
	if('@chklv || '@chkct){
		mes "[���[��]";
		mes "�M�������󂯂��鎎���͖�����B";
		if('@chklv && '@chkct){
			mes "Base���x����^FF0000" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000";
			mes "�P�ʂ�^FF0000" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000����Ȃ��݂����B";
			mes "Base���x�����グ�A";
		} else
		if('@chklv){
			mes "�������󂯂邽�߂̒P�ʂ�";
			mes "�擾���Ă��邯�ǁA";
			mes "Base���x������^FF0000" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000����Ȃ��݂����B";
			mes "Base���x�����グ����";
			mes "������x���Ɍ����Ă���邩����B";
			goto L_CLOSE;
		} else
		if('@chkct){
			mes "���x���͑���Ă�񂾂���";
			mes "�P�ʂ���^FF0000" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000����Ȃ��݂����B";
		}
		mes "�˗������Ȃ��ĒP�ʂ��擾������";
		mes "������x���Ɍ����Ă��傤�����B";
		goto L_CLOSE;
	}
	set AC_RANKTEST,1; //������t���� ���t���O���Ă�ꏊ�����ł����Ă܂��B���̂��Ƃ̉�b�Ń����O���Ă���t��������Ă܂��B

	switch(AC_RANK){
	case 0:
		mes "[���[��]";
		mes "��ꎎ�����󂯂�̂ˁB";
		mes "�����Ɋւ��Ă�";
		mes "�K���h���ꊇ�ł����Ȃ��Ă����B";
		next;
		break;
	case 1: 
		mes "[���[��]";
		mes "��񎎌��ˁH";
		mes "�����Ɋւ��Ă̓K���h��";
		mes "�����Ȃ��Ă����B";
		next;
		break;
	case 2:
		mes "[���[��]";
		mes "������Ɗm�F�����ˁB";
		mes "���Ǝ��́A��O�����̂悤�ˁH";
		mes "�����Ɋւ��Ă͍��܂łǂ���";
		mes "�K���h����";
		mes "�󂯂Ă��炤���ƂɂȂ��B";
		next;
		break;
	case 3:
		mes "[���[��]";
		mes "��l�����I";
		mes "�M����������Ȃ�";
		mes "���̎����ɍ��i�����";
		mes "�c��͎O�B";
		mes "�タ����Ƃ�I";
		next;
		break;
	case 4:
		mes "[���[��]";
		mes "��܎����ˁB";
		mes "���̒i�K�܂ŗ���ƁA";
		mes "�����Ԏ����̓�Փx��";
		mes "�オ���Ă��Ă�Ǝv���́B";
		mes "�ł����܂Ŋ撣���Ă����M���Ȃ�";
		mes "�����ƍ��i�ł����I";
		next;
		break;
	case 5: emotion 0;
		mes "[���[��]";
		mes "�M���́c�c��Z����!?";
		mes "�M������΂�������Ȃ��I";
		mes "�c��̎����͓��I ��I";
		mes "�葱���������Ȃ������B";
		next;
		break;
	case 6: 
		emotion 29;
		mes "[���[��]";
		mes "�掵�����B";
		mes "���ߒ��Ō�̎����ɂȂ�킯������";
		mes "��Փx�����������͂���B";
		mes "�ӂӂӂ�";
		mes "�����ċA���Ă����̂�����H";
		next;
		mes "[���[��]";
		mes "�����A";
		mes "�K���h�̂Ƃ����GO�I��";
		mes "GO�I";
		mes "�w����2F�̎�������";
		mes "�����Ă�����Ⴂ�I";
		goto L_CLOSE;
	}
	mes "[���[��]";
	mes "�K���h�͊w����2F";
	mes "�������ɂ��邩��";
	mes "�s���Ă݂Ă��傤�����ˁB";
	goto L_CLOSE;
L_CHKTEST:
	if(AC_LANC>=7){
		mes "[���[��]";
		mes "���A�M�����󂯂��鎎���͖�����B";
		mes "�ꎟ�ߒ��C���Ȃ�Đ�������Ȃ��B";
		mes "�����撣��Ȃ�����ˁB";
		emotion 2, "���[��#ac"; //54752
		goto L_CLOSE;
	}
	if(AC_RANKTEST==1){
		mes "[���[��]";
		mes "�����̂��Ƃ̓K���h�ɔC���Ă����B";
		mes "�K���h�͊w����2F";
		mes "�������ɂ��邩��";
		mes "�s���Ă݂Ă��傤�����ˁB";
		goto L_CLOSE;
	}
	if(AC_RANKTEST){
		mes "[���[��]";
		mes "�M���͎������̂悤�ˁB";
		mes "�����̏ڂ������Ƃ�";
		mes "�K���h�ɔC���Ă���́B";
		mes "��������2F�̎������ɃK���h��";
		mes "����͂�������A�m�F���Ă݂ĂˁB";
		goto L_CLOSE;
	}
	mes "[���[��]";
	mes "���[���Ɓc�c������Ƃ܂��ĂˁB";
	mes "����H";
	mes "�M���͎������󂯂ĂȂ��݂����ˁB";
	goto L_CLOSE;
L_REPOTEST:
	if(AC_RANKTEST!=99){
		mes "[" + strcharinfo(0) + "]";
		mes "(���񍐂ł��鎎���͖������c�c)";
		goto L_CLOSE; 
	}
	emotion 46;
	switch(AC_RANK){
	case 0:
		mes "[���[��]";
		mes "��ꎎ���˔j���߂łƂ��I";
		mes "���߂Ă̎����ْ͋������ł���H";
		mes "�܂��P�ʂ��擾����";
		mes "���̒i�K�ɒ��킵�ĂˁB";
		next;
		emotion 5;
		mes "[���[��]";
		mes "�������I";
		mes "�M�����̎��������i�ł����񂾂�";
		mes "���낻��A�A�J�f�~�[�O��";
		mes "�����X�^�[�Ƃ������";
		mes "�݂����񂶂�Ȃ��H";
		mes "��`�����˂�";
		next;
		mes "[���[��]";
		mes "��������A��������2F��";
		mes "�����Ƃ������������񂪂��邩��";
		mes "�b�������Ă݂�Ƃ������B";
		next;
		mes "[���[��]";
		mes "����ƁA�^�[��������Č���";
		mes "�]���T�[�r�X���s���Ă����l";
		mes "�����Ă�H";
		mes "�ނ͂ˁA�A�J�f�~�[�ɗ���";
		mes "���������Ă�����Ȃ̂�B";
		next;
		mes "[���[��]";
		mes "���̑O�A�ނƐH����������";
		mes "�A�J�f�~�[�̂��Ƃ��ڂ��������ꂽ����";
		mes "�삯�o���̖`���҂�";
		mes "�撣���Ă��邱�Ƃ�b�����̂�B";
		mes "����������A�ނ����͂���������";
		mes "�����Ă��ꂽ�́B";
		next;
		mes "[���[��]";
		mes "�Ȃ�ƁI �삯�o���̖`���҂�";
		mes "�����ɍ��i������";
		mes "�]���T�[�r�X���������Ă������āI";
		mes "�������A��̎����ɍ��i�����";
		mes "�ǂ�ǂ񊄈����͏オ��̂�H";
		mes "�������ł���I";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 415,225;
		mes "[���[��]";
		mes "�͂��A�����؂ˁB";
		mes "�������Ȃ��悤�ɋC�����āI";
		break;
	case 1:
		mes "[���[��]";
		mes "��񎎌��˔j���߂łƂ��I";
		mes "�K���h���畷������A";
		mes "�����͑掵�����܂�";
		mes "����炵������A";
		mes "���̎���������΂��āI";
		next;
		mes "[���[��]";
		mes "���������A��������������";
		mes "�V�����ꏊ�ɓ]�����Ă�������";
		mes "�����Ă�����";
		mes "�����Ɍ����Ă݂���H";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 810,798;
		mes "[���[��]";
		mes "���ƁA�^�[������̓]���T�[�r�X";
		mes "���������X�V���Ă�����ˁB";
		mes "����ŁA�����Ɗ�������";
		mes "������͂���B";
		break;
	case 2:
		mes "[���[��]";
		mes "��O�����˔j���߂łƂ��I";
		mes "���������΁A�E���t�搶�͌��C�������H";
		mes "���̐搶�A���킢�炵������";
		mes "����̂�ˁ`�B";
		next;
		mes "[���[��]";
		mes "�������A��l�ɂȂ�Ƃ��邳�����āB";
		mes "�������������Ă��ł���H";
		mes "���̎������M���Ȃ�撣�ꂻ���ˁB";
		next;
		mes "[���[��]";
		mes "���������A��������������";
		mes "�V�����ꏊ�ɓ]�����Ă�������";
		mes "�����Ă�����";
		mes "�����Ɍ����Ă݂���H";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 1475,2295;
		mes "[���[��]";
		mes "���ƁA�^�[������̓]���T�[�r�X";
		mes "���������X�V���Ă�����ˁB";
		mes "����ŁA�����Ɗ�������";
		mes "������͂���B";
		break;
	case 3:
		mes "[���[��]";
		mes "��l�����˔j���߂łƂ��I";
		mes "�K���h���畷�������ǁA";
		mes "�����������񂾂��āH";
		mes "��������Ȃ�!!";
		mes "�M���Ȃ�A�ǂ��ł�������Ǝv����B";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 3998,5672;
		mes "[���[��]";
		mes "���ƁA�^�[������̓]���T�[�r�X";
		mes "���������X�V���Ă�����ˁB";
		mes "����ŁA�����Ɗ�������";
		mes "������͂���B";
		break;
	case 4:
		mes "[���[��]";
		mes "��܎����˔j���߂łƂ��I";
		mes "�񍐏����K���h�ɓ͂��邱�Ƃ�";
		mes "�ł����悤�ˁB";
		mes "�����ŉ���肾��B";
		next;
		mes "[���[��]";
		mes "���������A��������������";
		mes "�V�����ꏊ�ɓ]�����Ă�������";
		mes "�����Ă�����";
		mes "�����Ɍ����Ă݂���H";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 5213,7943;
		mes "[���[��]";
		mes "���ƁA�^�[������̓]���T�[�r�X";
		mes "���������X�V���Ă�����ˁB";
		mes "����ŁA�����Ɗ�������";
		mes "������͂���B";
		break;
	case 5:
		mes "[���[��]";
		mes "��Z�����˔j���߂łƂ��I";
		mes "�z�����搶��������Ȃ�āA";
		mes strcharinfo(0) + "����A��������I";
		mes "�������Ȃ��l���������Č����̂ɁB";
		mes "���E���𗷂��Ă݂�̂�";
		mes "������������Ȃ���B";
		next;
		mes "[���[��]";
		mes "���������A��������������";
		mes "�V�����ꏊ�ɓ]�����Ă�������";
		mes "�����Ă�����";
		mes "�����Ɍ����Ă݂���H";
		next;
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 7888,12499;
		mes "[���[��]";
		mes "���ƁA�^�[������̓]���T�[�r�X";
		mes "���������X�V���Ă�����ˁB";
		mes "����ŁA�����Ɗ�������";
		mes "������͂���B";
		break;
	case 6:
		mes "[���[��]";
		mes "�掵�����˔j���߂łƂ��I";
		mes "�������I";
		mes "���ɑ��ߒ��S�Ă�";
		mes "�����ɍ��i������ˁI";
		next;
		mes "[���[��]";
		mes "����ŋM������l�O�̖`���҂�";
		mes "����߂Â�����ˁB";
		mes "�����܂ŐF�X��ς������Ǝv�����ǁA";
		mes "�M�����s���Ă������Ƃ�";
		mes "�����Ƃ��ꂩ��̖`����";
		mes "���ɗ��͂���B";
		next;
		mes "[���[��]";
		mes "����΂��Ă���" + strcharinfo(0) + "�����";
		mes "������A�n���������̂������B";
		mes strcharinfo(0) + "����͂����܂�";
		mes "�悭�撣���Ă�����ˁB";
		next;
		mes "[���[��]";
		mes "����̓A�J�f�~�[��";
		mes "�ꎟ�ے��C���̏؁B";
		mes "�A�J�f�~�[���C���X�q��I";
		if(!checkweight(5407,1)){ //���߂�Ȃ����������B����͑z���ł��B
			mes "����H";
			mes "�ו��������ς��œn���Ȃ���B";
			mes "�ו���a���Ă���A�񍐂��ĂˁB";
			goto L_CLOSE;
		}
		set AC_RANK,AC_RANK+1;
		set AC_RANKTEST,0;
		getexp 17106,25183;
		getitem 5407,1;
		mes "���ꂩ������낢��Ȑl��";
		mes "�����Ă����Ă��傤�����ˁB";
		next;
		mes "[���[��]";
		mes "���A�������I";
		mes "�~�b�h������n���������̂�";
		mes "����݂���������";
		mes "�b���Ă݂�Ƃ������B";
		break;
	}
	goto L_CLOSE;
L_ABOUTTEST:
	if(AC_RANK>=7){
		mes "[���[��]";
		mes "���ߒ��͏C�����Ă��ˁB";
		mes "�����͎b��������B";
		mes "�K���h��������Ɣ�ꂽ�̂�����B";
		mes "�������܂��󂯂����Ȃ�āA";
		mes "�M���͕׋��M�S�Ȃ̂ˁB";
		next;
		mes "[���[��]";
		mes "���̖`���҂̊F�����Ă�����";
		mes "����Ă�����������B";
		mes "�M���Ȃ炢���Ȃ��Ƃ�";
		mes "��������Ǝv����B";
		emotion 2, "���[��#ac"; //54752
		goto L_CLOSE;
	}
	if('@chklv || '@chkct){
		mes "[���[��]";
		mes "�������󂯂�ɂ͒P�ʂ�";
		mes "Base���x�������ȏ�K�v��B";
		mes "�P�ʂ͈˗����󂯂Ă������Ƃ�";
		mes "�C���ł����B";
	} else {
		mes "[���[��]";
		mes "�������󂯂�ɂ͒P�ʂ��K�v��B";
		mes "�P�ʂ͈˗����󂯂Ă������Ƃ�";
		mes "�C���ł����B";
	}
	next;
	//�|�����c�����ɂ��ǉ�
	if(AC_QUEST_LV_6 != 16){
		mes "[���[��]";
		mes "�ł��ŋ߁A";
		mes "���K���̕��֌����������k�̒P�ʂ�";
		mes "�����Ă�悤�ȋC������̂�ˁB";
		mes "���ނɂ͕s���͌�������Ȃ�";
		mes "�̂�����ǁc�c";
		mes "�܂��A�C�̂�����ˁB";
	} else {
		//�N���A����ƃZ���t���ω�
		mes "[���[��]";
		mes "�������A�|�����c����";
		mes "��������P�ʂ��L����B";
	}
	if('@chklv || '@chkct){
		if('@chklv && '@chkct){
			next;
			mes "[���[��]";
			mes "����^FF0000" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000�̒P�ʂ��C�����āA";
			mes "���x����^FF0000" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000�ɂȂ�΁A";
		} else
		if('@chklv){
			mes "����^FF0000" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000�̒P�ʂ��C�����āA";
			mes "���x����^FF0000" + ('TST_REQUIR_LV[AC_RANK]-BaseLevel) + "^000000�ɂȂ�΁A";
		} else
		if('@chkct){
			mes "����^FF0000" + ('TST_REQUIR[AC_RANK]-AC_CREDIT) + "^000000�̒P�ʂ��C������΁A";
		}
		mes "���̎������󂯂邱�Ƃ��ł�����B";
	} else {
		mes "[���[��]";
		mes "�M���͎��̎����ɏ\���ȒP�ʂ�";
		mes "�C�����Ă����B";
		mes "���ł��������󂯂邱�Ƃ�";
		mes "�ł�����B";
	}
	goto L_CLOSE;
L_ABOUT:
	if(AC_QUEST_LV_0+AC_QUEST_LV_1+AC_QUEST_LV_2+AC_QUEST_LV_3+AC_QUEST_LV_4<=15) {
		mes "[���[��]";
		mes "�����ł́A�e�n����W�߂�ꂽ";
		mes "�˗��𐿂��������Ƃ��o�����B";
		mes "�����Ĉ˗����������邱�Ƃ�";
		mes "�P�ʂ����炤���Ƃ��o����킯�B";
		mes "�v����ɂ��̈˗������Ƃ��Ă��ƂˁB";
		next;
		emotion 5;
		mes "[���[��]";
		mes "�����������A���ȏЉ";
		mes "�܂���������ˁB";
		mes "���̖��O�̓��[��";
		mes "�˗��̊Ǘ��������Ȃ��Ă����B";
		mes "�����A�˗����󂯂���������";
		mes "���ɐ��������ĂˁB";
		next;
		mes "[���[��]";
		mes "���������A�����Y��Ă�������";
		mes "�P�ʂ�t�^����̂���������";
		mes "�����ɂ͒��ӂ���悤�ɁB";
		goto L_CLOSE;
	} else
	if(AC_QUEST_LV_0+AC_QUEST_LV_1+AC_QUEST_LV_2+AC_QUEST_LV_3+AC_QUEST_LV_4<=30) {
		emotion 9;
		mes "[���[��]";
		mes "�c�c";
		mes "���Ă킩��Ȃ��H";
		mes "�d�������Ă�̂�I";
		mes "�d���I";
		mes "�͂��c�c";
		next;
		menu "������������ł����H",-;
		emotion 36;
		mes "[���[��]";
		mes "�����Ă�I";
		mes "����~�b�h�ƃv�����e���̂��X��";
		mes "�H���ɍs���񑩂����Ă����̂�";
		mes "�d�����Z�����������";
		mes "�h�^�L�������ꂽ�̂�I";
		mes "�����Ǝv��Ȃ��H";
		next;
		if(select("����","�����Ȃ�")==1){
			emotion 29;
			mes "[���[��]";
			mes "�Ђǂ����˂��c�c";
			mes "���������y���݂ɂ��Ă��̂ɁB";
			mes "���x�s���Ƃ��͐��";
			mes "�S�z�����点�Ă���I";
			mes "��s�𕷂��Ă���Ă��肪�Ƃ��B";
			mes "�������肵����I";
			goto L_CLOSE;
		} else {
			emotion 6;
			mes "[���[��]";
			mes "?!";
			mes "�m���Ɏd���͑�؂�����";
			mes "�񑩂�j��̂͂ǂ����Ǝv����I";
			mes "���[�A���������C���C�����Ă����c�c";
			goto L_CLOSE;
		}
	} else {
		emotion 18;
		mes "[���[��]";
		mes "���Ă킩��Ƃ͎v������";
		mes "�˗��̊Ǘ������Ă���̂�[";
		mes "�M�����󂯂���";
		mes "�˗������邩������Ȃ�����";
		mes "�˗����󂯂��������猾���ĂˁB";
		next;
		menu "�@�����悳�����ł���",-;
		emotion 43;
		mes "[���[��]";
		mes "���ӂӂӂ��A�킩��H";
		mes "���x�A�~�b�h�̂������";
		mes "�L���ȍ��������X�ɍs�����Ƃ�";
		mes "�Ȃ����̂�[";
		mes "�����Ɛ������������̂�c�c";
		next;
		menu "���[������悾��I",-;
		emotion 40;
		mes "[���[��]";
		mes "����!?";
		mes "���Ƃ������Ƃ��c�c";
		mes "�p���������c�c";
		mes "�ςȎp�݂�ꂿ�������ˁB";
		next;
		emotion 52;
		mes "[���[��]";
		mes "���̂��Ƃ͑��̐l�ɂ�";
		mes "�����ɂ��ĂˁB";
		mes "�����b������c�c";
		mes "��ςȂ��ƂɂȂ���I";
		goto L_CLOSE;
	}
L_OTHER:
	mes "[���[��]";
	mes "���ɉ����b���������Ƃ͂���H";
	next;
	menu "�͂�",L_MENU,"������",L_NOTHX;
L_NOTHX:
	mes "[���[��]";
	mes "�b�����Ƃ���������A";
	mes "���������Ă��傤�����ˁB";
	goto L_CLOSE;
L_CLOSE:
	close2;
	cutin "jpn_run01",255;
	end;
OnInit:
	setarray 'QUE_NAMES$,"�C�ɂȂ邠�̎q","��Ղ̔�","�����b�ɂȂ������̐l��","���l�т̕i��͂�����","���َq�̍ޗ��W��","���َq���͂�","�����̂���`��","�_���W�����~�o","�`���҂ɂȂ肽��";
	setarray 'QUE_CHAP$,"","�@","�A","�B","�C","�D","�E","�F","�G","�H";
	setarray 'QUE_NAMEIDS, 0,0,0,0,0,0,0,0,0, 1,1,1,1,1,1,1,1,1, 2,3,4,4,4,4,4,5,3, 6,7,6,7,6,7,6,7,6, 8,8,8,8,8,8,8,8,8;
	setarray 'QUE_CHAPTERS,1,2,3,4,5,6,7,8,9, 1,2,3,4,5,6,7,8,9, 0,1,1,2,3,4,5,0,2, 1,1,2,2,3,3,4,4,5, 1,2,3,4,5,6,7,8,9;
	setarray 'QUE_REQUIRE,1,12,15,18,21,24,27,30,33, 1,13,16,19,22,25,28,31,34, 1,14,17,20,23,26,29,32,35, 1,14,17,20,23,26,29,32,35, 1,12,15,18,21,24,27,30,33;
	setarray 'QUE_BATTLE,0,0,0,1,1;
	setarray 'QUE_CREDITS,1,1,2,2,3,3,4,4,5;
	setarray 'QUE_CLIENT, 0,0,0,0,1,0,0,2,2, 3,3,3,3,3,3,3,3,3, 4,4,5,5,5,5,5,5,4, 6,7,6,7,6,7,6,7,6, 8,8,8,8,8,8,8,8,8;
	setarray 'QUE_COLOR$,"^0000FF�F^000000","^FF0000�ԐF^000000","^FF9900��F^000000","^00FF00�ΐF^000000","^00FFFF���F^000000";
	setarray 'QUE_EXP,160,293,485,710,995,1475,2237,4587,6984, 193,350,560,810,1180,1713,3445,5213,7888, 245,415,630,930,1252,1967,3997,5874,8839, 245,415,630,930,1252,1967,3997,5874,8839, 160,293,485,710,995,1475,2237,4587,6984;
	setarray 'QUE_JOB,104,160,334,608,1252,2294,3711,7295,10471, 121,190,387,798,1403,3058,4639,7936,12488, 140,225,445,1114,1823,3375,5663,8599,15614, 140,225,445,1114,1823,3375,5663,8599,15614, 104,160,334,608,1252,2294,3711,7295,10471;
	setarray 'TST_REQUIR,5,10,15,20,30,40,45;
	setarray 'TST_REQUIR_LV,14,19,24,29,31,34,39;
	waitingroom "���[���̈˗�", 0;
end;

	// function �N�G�X�gLv�擾  -----------------------------
	function	GetQueLv	{
		switch (getarg(0)) {
		case 0: set '@quelv,AC_QUEST_LV_0; break;
		case 1: set '@quelv,AC_QUEST_LV_1; break;
		case 2: set '@quelv,AC_QUEST_LV_2; break;
		case 3: set '@quelv,AC_QUEST_LV_3; break;
		case 4: set '@quelv,AC_QUEST_LV_4; break;
		}
		return '@quelv;
	}

	// function �N�G�X�g�I���ꗗ�擾(����(0) 0:�������� 1:�m�F 2:��  -----------------------------
	function	GetQuestSelectList	{
		set '@arg,getarg(0);
		set '@quelist$, "";
		set '@quecount, 0;
		setarray '@queidlist,0;
		set '@queidcount,0; //0����n�܂�̂�getarraysize���g���Ȃ�
		for(set '@i,0; '@i<5; set '@i,'@i+1) {
			//�N�G�X�gLv�ƃX�e�[�^�X�擾
			switch ('@i) {
			case 0: set '@quelv,AC_QUEST_LV_0; set '@quest,AC_QUEST_ST_0; break;
			case 1: set '@quelv,AC_QUEST_LV_1; set '@quest,AC_QUEST_ST_1; break;
			case 2: set '@quelv,AC_QUEST_LV_2; set '@quest,AC_QUEST_ST_2; break;
			case 3: set '@quelv,AC_QUEST_LV_3; set '@quest,AC_QUEST_ST_3; break;
			case 4: set '@quelv,AC_QUEST_LV_4; set '@quest,AC_QUEST_ST_4; break;
			}
			if( //���Ɏ󂯂Ă���˗��͕\�����Ȃ�
				('@arg==0 && '@quest>0) ||
				//�󂯂ĂȂ��˗��͕\�����Ȃ�
				('@arg==1 && '@quest==0) ||
				//�������Ă��Ȃ�
				('@arg==2 && '@quest!=99) ||
				//�N���A�ς͕\�����Ȃ�
				'@quelv==9
			) {
				continue;
			}
			set '@idx,'@i*9+'@quelv;
			//�����F����
			if(
				//Lv������Ȃ����̂͊D�F
				('@arg==0)*(BaseLevel>='QUE_REQUIRE['@idx] && '@quest==0) ||
				//�󂯂Ă���˗�
				('@arg==1) ||
				//�񍐂ł���˗�
				('@arg==2)
			){
				if('QUE_BATTLE['@i]) set '@color$,"^FF0000";
				else 				 set '@color$,"^008800";
				set '@quecount,'@quecount+1;
			} else {
				set '@color$,"^777777";
			}
			if('@arg==0) set '@quelist$,'@quelist$ + '@color$ +"Lv"+ 'QUE_REQUIRE['@idx] +"�ȏ� "+ 'QUE_NAMES$['QUE_NAMEIDS['@idx]] + 'QUE_CHAP$['QUE_CHAPTERS['@idx]] +" "+ 'QUE_CREDITS['@quelv] + "�P��^000000:";
			else		 set '@quelist$,'@quelist$ + '@color$ +'QUE_NAMES$['QUE_NAMEIDS['@idx]] + 'QUE_CHAP$['QUE_CHAPTERS['@idx]] +"^000000" + ('@arg==2 || '@i<4 ? ":" : "");
			set '@queidlist['@queidcount],'@i;
			set '@queidcount,'@queidcount+1;
		}
		set '@quelist$,'@quelist$ + ('@arg==0 ? "�˗����󂯂Ȃ�" : ('@arg==2 ? "�񍐂��Ȃ�" : "") );
		set '@queidlist['@queidcount],99;

		set getarg(1),'@quecount;
		set getarg(2),'@quelist$;
		copyarray getarg(3),'@queidlist, '@queidcount+1;
		set getarg(4),'@queidcount;
		return;
	}

	// function �N�G�X�g���̎擾  -----------------------------
	function	GetQuestName	{
		set '@queid,getarg(0);
		set '@quelv, GetQueLv('@queid);
		set '@idx,'@queid*9+'@quelv;
		//�����F����
		if(BaseLevel>='QUE_REQUIRE['@idx]){
			if('QUE_BATTLE['@queid]) set '@color$,"^FF0000";
			else 					 set '@color$,"^008800";
		} else {
			set '@color$,"^777777";
		}
		set '@que_name$,'@color$ + 'QUE_NAMES$['QUE_NAMEIDS['@idx]] + 'QUE_CHAP$['QUE_CHAPTERS['@idx]] + "^000000";
		set getarg(1),'@que_name$;
		return;
	}

	// function �o���l/JOB�o���n �t�^  -----------------------------
	function	GiveExp	{
		set '@que_id,getarg(0);
		set '@quelv, GetQueLv('@que_id);
		set '@idx,'@queid*9+'@quelv;
		getexp 'QUE_EXP['@idx],'QUE_JOB['@idx];
		set AC_CREDIT,AC_CREDIT+'QUE_CREDITS['@quelv];
		switch ('@que_id) {
		case 0: set AC_QUEST_LV_0,AC_QUEST_LV_0+1; set AC_QUEST_ST_0,0; break;
		case 1: set AC_QUEST_LV_1,AC_QUEST_LV_1+1; set AC_QUEST_ST_1,0; break;
		case 2: set AC_QUEST_LV_2,AC_QUEST_LV_2+1; set AC_QUEST_ST_2,0; break;
		case 3: set AC_QUEST_LV_3,AC_QUEST_LV_3+1; set AC_QUEST_ST_3,0; break;
		case 4: set AC_QUEST_LV_4,AC_QUEST_LV_4+1; set AC_QUEST_ST_4,0; break;
		}
		return;
	}
}
