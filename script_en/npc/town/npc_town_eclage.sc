//= Auriga Script ==============================================================
// Ragnarok Online Eclage Town Script	by refis
//==============================================================================

//============================================================
// Shop
//------------------------------------------------------------
-	shop	ecl_callshop	-1,519
ecl_in01.gat,65,85,5	script	�������l#ecl	559,{
	callshop "ecl_callshop";
	end;
OnInit:
	waitingroom "�������������̔����j���I",0;
	end;
}

ecl_in01.gat,66,95,3	script	�h��l�i�p��	436,{
	mes "[�h��l]";
	mes "����ɂ��́B";
	mes "�����i�����I���Ĉ����h��ł��B";
	mes "�����K�v�ł����H";
	next;
	set '@menu,select("�͂̃O���[�u[0]","�m�͂̃O���[�u[0]","�q���̃O���[�u[0]","�̗͂̃O���[�u[0]","��p���̃O���[�u[0]","�K�^�̃O���[�u[0]")-1;
	switch('@menu) {
	case 0:
		mes "[�h��l]";
		mes "^3131FF�͂̃O���[�u[0]^000000�A";
		mes "�ł��ˁB";
		mes "���\�͈ȉ��ł��B";
		next;
		mes "[�͂̃O���[�u[0]]";
		mes "^3131FFMaxHP+100 ,MaxSP+20^000000";
		mes "^3131FF������Str+10���Ƃ�Atk+1^000000";
		mes "^3131FF������Str��110�ȏ�̎��A�ǉ���^000000";
		mes "^3131FF�����U���ŗ^����_���[�W+1%^000000";
		mes "^3131FF�X���b�g��:0^000000";
		next;
		mes "[�͂̃O���[�u[0]]";
		mes "^3131FF�n��:�A�N�Z�T��^000000";
		mes "^3131FF�h��:0^000000";
		mes "^3131FF�d��:10^000000";
		mes "^3131FF�v�����x��:100^000000";
		mes "^3131FF�S�Ă̐E��^000000";
		break;
	case 1:
		mes "[�h��l]";
		mes "^3131FF�m�͂̃O���[�u[0]^000000�A";
		mes "�ł��ˁB";
		mes "���\�͈ȉ��ł��B";
		next;
		mes "[�m�͂̃O���[�u[0]]";
		mes "^3131FFMaxHP+100 , MaxSP+20^000000";
		mes "^3131FF������Int+10���Ƃ�Matk+1^000000";
		mes "^3131FF������Int��110�ȏ�̎�^000000";
		mes "^3131FF�ǉ���Matk+1%^000000";
		mes "^3131FF�X���b�g��:0^000000";
		next;
		mes "[�m�͂̃O���[�u[0]]";
		mes "^3131FF�n��:�A�N�Z�T��^000000";
		mes "^3131FF�h��:0^000000";
		mes "^3131FF�d��:10^000000";
		mes "^3131FF�v�����x��:100^000000";
		mes "^3131FF�S�Ă̐E��^000000";
		break;
	case 2:
		mes "[�h��l]";
		mes "^3131FF�q���̃O���[�u[0]^000000�A";
		mes "�ł��ˁB";
		mes "���\�͈ȉ��ł��B";
		next;
		mes "[�q���̃O���[�u[0]]";
		mes "^3131FFMaxHP+100 , MaxSP+20^000000";
		mes "^3131FF������Agi+10���Ƃ�Flee+1^000000";
		mes "^3131FF������Agi��110�ȏ�̎�^000000";
		mes "^3131FF�ǉ��Ŋ��S���+1^000000";
		mes "^3131FF�X���b�g��:0^000000";
		next;
		mes "[�q���̃O���[�u[0]]";
		mes "^3131FF�n��:�A�N�Z�T��^000000";
		mes "^3131FF�h��:0^000000";
		mes "^3131FF�d��:10^000000";
		mes "^3131FF�v�����x��:100^000000";
		mes "^3131FF�S�Ă̐E��^000000";
		break;
	case 3:
		mes "[�h��l]";
		mes "^3131FF�̗͂̃O���[�u[0]^000000�A";
		mes "�ł��ˁB";
		mes "���\�͈ȉ��ł��B";
		next;
		mes "[�̗͂̃O���[�u[0]]";
		mes "^3131FFMaxHP+100 , MaxSP+20^000000";
		mes "^3131FF������Vit+10���Ƃ�MaxHP+50^000000";
		mes "^3131FF������Vit��110�ȏ�̎�^000000";
		mes "^3131FF�ǉ���MaxHP+1%^000000";
		mes "^3131FF�X���b�g��:0^000000";
		next;
		mes "[�̗͂̃O���[�u[0]]";
		mes "^3131FF�n��:�A�N�Z�T��^000000";
		mes "^3131FF�h��:0^000000";
		mes "^3131FF�d��:10^000000";
		mes "^3131FF�v�����x��:100^000000";
		mes "^3131FF�S�Ă̐E��^000000";
		break;
	case 4:
		mes "[�h��l]";
		mes "^3131FF��p���̃O���[�u[0]^000000�A";
		mes "�ł��ˁB";
		mes "���\�͈ȉ��ł��B";
		next;
		mes "[��p���̃O���[�u[0]]";
		mes "^3131FFMaxHP+100 , MaxSP+20^000000";
		mes "^3131FF������Dex+10���Ƃ�Hit+1^000000";
		mes "^3131FF������Dex��110�ȏ�̎��A�ǉ���^000000";
		mes "^3131FF�����������U���ŗ^����_���[�W+1%^000000";
		mes "^3131FF�X���b�g��:0^000000";
		next;
		mes "[��p���̃O���[�u[0]]";
		mes "^3131FF�n��:�A�N�Z�T��^000000";
		mes "^3131FF�h��:0^000000";
		mes "^3131FF�d��:10^000000";
		mes "^3131FF�v�����x��:100^000000";
		mes "^3131FF�S�Ă̐E��^000000";
		break;
	case 5:
		mes "[�h��l]";
		mes "^3131FF�K�^�̃O���[�u[0]^000000�A";
		mes "�ł��ˁB";
		mes "���\�͈ȉ��ł��B";
		next;
		mes "[�K�^�̃O���[�u[0]]";
		mes "^3131FFMaxHP+100 , MaxSP+20^000000";
		mes "^3131FF������Luk+10���Ƃ�Cri+1^000000";
		mes "^3131FF������Luk��110�ȏ�̎��A�ǉ���^000000";
		mes "^3131FF�N���e�B�J���U���ŗ^����_���[�W+1%^000000";
		mes "^3131FF�X���b�g��:0^000000";
		next;
		mes "[�K�^�̃O���[�u[0]]";
		mes "^3131FF�n��:�A�N�Z�T��^000000";
		mes "^3131FF�h��:0^000000";
		mes "^3131FF�d��:10^000000";
		mes "^3131FF�v�����x��:100^000000";
		mes "^3131FF�S�Ă̐E��^000000";
		break;
	}
	next;
	mes "[�h��l]";
	mes "�w���ɂ�";
	mes "�X�v�����f�B�b�h�R�C��10��";
	mes "�K�v�ł��B�����܂����H";
	next;
	if(select("����","����Ȃ�") == 2) {
		mes "[�h��l]";
		mes "�����ł����B";
		mes "���p������܂�����A";
		mes "�܂����z�����������B";
		close;
	}
	if(countitem(6081) < 10) {
		mes "[�h��l]";
		mes "�R�C��������܂���B";
		close;
	}
	if(checkweight(2917,1) == 0) {
		mes "[�h��l]";
		mes "�����ƁA�ו��������ς��̂悤�ł��B";
		mes "�����i�����炵�Ă���";
		mes "�܂����z�����������B";
		close;
	}
	mes "[�h��l]";
	mes "���x�A���肪�Ƃ��������܂��B";
	delitem 6081,10;
	getitem 2917+'@menu,1;
	close;
OnInit:
	waitingroom "�h�",0;
	end;
}

ecl_in01.gat,64,97,5	script	�X���b�g���ƃi�g�D��	436,{
	mes "[�X���b�g����]";
	mes "���̓i�g�D���B";
	mes "�X���b�g�̐��Ƃł��B";
	mes "�X�v�����f�B�b�h�R�C��5��";
	mes "���̃i�p��������i����";
	mes "�X���b�g��1�J���܂���B";
	next;
	if(select("�X���b�g������������","��߂�") == 2) {
		mes "[�X���b�g����]";
		mes "��߂�̂ł��ˁB";
		mes "�܂��̂��z����";
		mes "���҂����Ă���܂���B";
		close;
	}
	mes "[�X���b�g����]";
	mes "�X���b�g�̊�������";
	mes "���ɓ����ƂȂ̂ł��B";
	mes "�ڂ��Â炵�Ȃ���T�d�ɍ�Ƃ��Ă�";
	mes "�ȒP�Ɏ��s����ꍇ������܂���B";
	next;
	mes "[�X���b�g����]";
	mes "���s�����ꍇ�A�g�p�����R�C����";
	mes "�A�C�e���͖����Ȃ��Ă��܂��܂��B";
	mes "����ł���낵���ł����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�X���b�g����]";
		mes "��߂�̂ł��ˁB";
		mes "�܂��̂��z����";
		mes "���҂����Ă���܂���B";
		close;
	}
	mes "[�X���b�g����]";
	mes "�ǂ̃A�C�e���̃X���b�g��";
	mes "���������܂����H";
	next;
	set '@menu,select("�͂̃O���[�u[0]","�m�͂̃O���[�u[0]","�q���̃O���[�u[0]","�̗͂̃O���[�u[0]","��p���̃O���[�u[0]","�K�^�̃O���[�u[0]")-1;
	mes "[�X���b�g����]";
	mes "����ł́A�m�F�������܂��B";
	mes "���Ȃ����I������������ ";
	mes getitemname(2917+'@menu)+ "[0]";
	mes "�ł�낵���ł����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�X���b�g����]";
		mes "�m�F��ɂ܂������������������B";
		close;
	}
	progressbar 3000;
	if(countitem(2917+'@menu) < 1) {
		mes "[�X���b�g����]";
		mes "�A�C�e�����������łȂ��悤�ł���B";
		mes "�����i���m�F���Ă��������܂��B";
		close;
	}
	if(countitem(6081) < 5) {
		mes "[�X���b�g����]";
		mes "�X�v�����f�B�b�h�R�C��������Ȃ���B";
		mes "�X���b�g�������ɂ�5���A�K�v�ł��B";
		close;
	}
	set '@rand,rand(100);
	if('@rand >= 51 && '@rand < 60) {
		emotion 21;
		delitem 6081,5;
		delitem 2917+'@menu,1;
		getitem 2923+'@menu,1;
		mes "[�X���b�g����]";
		mes "�������A�Ȃ�Ƃ������Ƃł��傤�I";
		mes "�������܂����I";
		mes "���߂łƂ��������܂��I";
		mes "�X���b�g������������܂�����B";
		close;
	}
	else {
		emotion 9;
		delitem 6081,5;
		delitem 2917+'@menu,1;
		mes "[�X���b�g����]";
		mes "�����A�Ȃ�Ƃ������Ƃł��傤�B";
		mes "���s���Ă��܂��܂����c�c�B";
		mes "���͂����Ɛ������܂��I";
		mes "�������́c�c�B";
		close;
	}
}

ecl_in01.gat,33,98,5	script	�򑐏��l�t���C�t�B�[�i	443,{
	mes "[�򑐏��l]";
	mes "��������Ⴂ�܂��`�����I";
	mes "�V�N�Ȑ��򑐂��������Ă���";
	mes "�t���C�t�B�[�i�̖򑐏��X�`�����I";
	mes "�������T���������H";
	next;
	switch(select("�X�m�[�t���b�v","�s�I�j�[�}�~�[","�҂����n�[�u","���E���̂ق���","�b���I����")) {
	case 1:
		mes "[�򑐏��l]";
		mes "�X�m�[�t���b�v�����ˁB";
		mes "���̏��i�͂͂�ς˂������B";
		mes "����Ȍ��ʂ�����܂��B";
		next;
		mes "[�X�m�[�t���b�v]";
		mes "^3131FF���΁A�o���A�[������A";
		mes "����^000000�����Â���B";
		mes "�Ďg�p�ҋ@����5�b�B";
		mes "�d��:1";
		next;
		mes "[�򑐏��l]";
		mes "�X�v�����f�B�b�h�R�C�� 5��1��";
		mes "�w�����o���܂����B";
		mes "����A�����܂����H";
		set '@gain,12812;
		set '@cost,5;
		break;
	case 2:
		mes "[�򑐏��l]";
		mes "�s�I�j�[�}�~�[�����ˁB";
		mes "�������ׂ�������I";
		mes "����Ȍ��ʂ�����܂��B";
		next;
		mes "[�s�I�j�[�}�~�[]";
		mes "^3131FF�����A�Ⓚ�A�X��^000000��";
		mes "���Â���B";
		mes "�Ďg�p�ҋ@����5�b�B";
		mes "�d��:1";
		next;
		mes "[�򑐏��l]";
		mes "�X�v�����f�B�b�h�R�C��5��1��";
		mes "�w�����o��������B";
		mes "����A�����܂����H";
		set '@gain,12813;
		set '@cost,5;
		break;
	case 3:
		mes "[�򑐏��l]";
		mes "�҂����n�[�u�����ˁB";
		mes "���������q�l�A���т�那�����I";
		mes "����Ȍ��ʂ�����܂��B";
		next;
		mes "[�҂����n�[�u]";
		mes "^3131FF�X�^���A���|�A�����A���o^000000��";
		mes "���Â���B";
		mes "�Ďg�p�ҋ@����5�b�B";
		mes "�d��:1";
		next;
		mes "[�򑐏��l]";
		mes "�X�v�����f�B�b�h�R�C��1��1��";
		mes "�w���o��������B";
		mes "����A�����܂����H";
		set '@gain,12814;
		set '@cost,1;
		break;
	case 4:
		mes "[�򑐏��l]";
		mes "���E���̂ق�������ˁB";
		mes "���q�l�A���߂߂����������I";
		mes "������͂���Ȍ��ʂ�����܂��B";
		next;
		mes "[���E���̂ق���]";
		mes "^3131FF�Ή��A�Í��A�􂢁A�ŁA���x����";
		mes "���o�[�X�I�[�L�b�V��^000000��";
		mes "���Â���B";
		mes "�Ďg�p�ҋ@����5�b�B";
		mes "�d��:1";
		next;
		mes "[�򑐏��l]";
		mes "�X�v�����f�B�b�h�R�C��1��1��";
		mes "�w�����o���܂��B";
		mes "����A�����܂����H";
		set '@gain,12815;
		set '@cost,1;
		break;
	case 5:
		mes "[�򑐏��l]";
		mes "�܂��̂��z�������҂����Ă܂����I";
		close;
	}
	next;
	switch(select("1�w��","10�w��","�w�����Ȃ�")) {
	case 1:
		set '@num,1;
		break;
	case 2:
		set '@num,10;
		break;
	case 3:
		mes "[�򑐏��l]";
		mes "��߂�������H";
		mes "�ł́A�܂��̂��z����";
		mes "���҂����Ă���܂����I";
		close;
	}
	mes "[�򑐏��l]";
	mes getitemname('@gain)+ "��" +'@num+ "�w�����܂����H";
	next;
	if(select("�w������","��߂�") == 2) {
		mes "[�򑐏��l]";
		mes "��߂�������H";
		mes "�ł́A�܂��̂��z����";
		mes "���҂����Ă���܂����I";
		close;
	}
	if(countitem(6081) < '@cost*'@num) {
		mes "[�򑐏��l]";
		mes "�R�C��������Ȃ������B";
		close;
	}
	if(checkweight('@gain,'@num) == 0) {
		mes "[�򑐏��l]";
		mes "�����ƁA�ו��������ς��ł��I";
		mes "�ו��𐮗����Ă���";
		mes "�܂����Ă������������B";
		close;
	}
	mes "[�򑐏��l]";
	mes "���x�A���肪�Ƃ��������܂����I";
	delitem 6081,'@cost*'@num;
	getitem '@gain,'@num;
	close;
OnInit:
	waitingroom "�򑐏��l",0;
	end;
}

ecl_in01.gat,67,39,4	script	�����̐��ƃp���c	445,{
	emotion 3;
	mes "[�p���c]";
	mes "��������Ⴂ�܂��B���q�l�B";
	mes "�ӂӂ��B";
	mes "������p�ł����H";
	next;
	switch(select("�p�͖���","�b�𕷂�","�������̕��������肢����")) {
	case 1:
		mes "[�p���c]";
		mes "�ӂ��B";
		mes "���͂��ł������ɂ��܂��B";
		mes "�܂��K��Ă��������B";
		close;
	case 2:
		mes "[�p���c]";
		mes "�ӂ��ӂ��ӁB";
		mes "�����������Ă��邩���āH";
		mes "�G�N���[�W���Ŏ��قǖ��͐����";
		mes "�����Ă���l�͂��Ȃ��ł��傤�ˁB";
		next;
		mes "[�p���c]";
		mes "���͐�������݂�l�͑吨���܂����A";
		mes "���قǓI�m�����x��";
		mes "�\�͂��g�����Ȃ��l�͂��Ȃ��ł���B";
		mes "�ӂӂӁB";
		next;
		menu "�ŁA�������Ă����ł����H",-;
		emotion 21;
		mes "[�p���c]";
		mes "��A�����Ȃ�܂������B";
		mes "�Ȃ��Ȃ��A�X�g���[�g�Ȑ��i�ł��ˁB";
		if(Sex)
			mes "�ӂӁB���Z����A�C�ɓ���܂�����B";	// ������
		else
			mes "�ӂӁB���o����A�C�ɓ���܂�����B";
		next;
		mes "[�p���c]";
		mes "���͍ŋߐV�����Z�p���m�����܂����B";
		mes "���ɂ���F�X�ȑ����B";
		mes "�������ȖX�q�A�f�G�ȉ���";
		mes "�����ԏ���A���ꓙ�X�c�c�B";
		mes "���Ȃ����������񂨎����ł��傤�B";
		next;
		emotion 1;
		mes "[�p���c]";
		mes "�����A�������őf�G�ȑ�����";
		mes "�\�͂̊֌W�Ŏg���邱�ƂȂ�";
		mes "�q�ɂɖ������܂܁c�c�Ȃ�Čo��";
		mes "�ӂ��c�c�B";
		mes "���Ȃ�����x���炢��";
		mes "����񂶂�Ȃ��ł����H �ǂ��ł��H";
		next;
		menu "�͂�",-,"������",-;
		emotion 18;
		mes "[�p���c]";
		mes "�ԈႢ�Ȃ�����͂��ł��B";
		mes "�����������Ǝv�����̂�����";
		mes "�����Ɍ��܂��Ă��܂���B�ӂӁB";
		next;
		mes "[�p���c]";
		mes "�����Ŏ��͍l�����̂ł��B";
		mes "���������������̔\�͂�";
		mes "���̎����͐���̗͂ŗ}���鎖��";
		mes "�����ڂ������y���߂�悤��";
		mes "�����𕡐����鎖��";
		mes "�o����񂶂�Ȃ����ƂˁB";
		next;
		mes "[�p���c]";
		mes "����A�ӂӁB���������̔\�́B";
		mes "^0571B0�ߑ�����^000000�ƌĂ΂��";
		mes "�����ڂ�����ύX����A�C�e����";
		mes "�������鎖���o���܂�����B";
		mes "�ǂ��ł��B�~�����ł��傤�H";
		next;
		menu "�쐬�ɂ͉����K�v�Ȃ́H",-;
		mes "[�p���c]";
		mes "�ǂ�����ł��B�K�v�ȍޗ���";
		mes "�ӂ��B�ȉ��ł��B";
		next;
		mes "[�p���c]";
		mes "�����ڂ𕡐����錳��^0571B0������^000000";
		mes "^E1281E������4�A�d���̖��@�̕�1��^000000";
		mes "^0000FF�G�������h�A���r�[�A�T�t�@�C�A";
		mes "�g�p�[�Y�A�W���R���@�e10����^000000";
		mes "�X�v�����f�B�b�h�R�C�� 50��";
		next;
		emotion 22;
		mes "[�p���c]";
		mes "�ǂ��ł����B";
		mes "�K�v�ȍޗ��������ł����H";
		mes "�t�ɂ��ꂾ���̍ޗ����g�p���ĂȂ��A";
		mes "���͐���������Ȃ����̏o���鎄��";
		mes "�����ɗD��Ă��邩�A�Ƃ������ł��B";
		mes "�Ӂ[���ӂ��ӁB�ӂӁ[���ӂ��ӁB";
		next;
		menu "�ŁA�����\�ȓ������́H",-;
		mes "[�p���c]";
		mes "�Ӂ[�ӂ��c�c���c�c�Q�t�b�Q�t�b�B";
		mes "�����ƁA�Y��Ă��܂����B";
		mes "���Ȃ���قǂ��璆�X�s���ł��ˁB";
		mes "�킩��܂����B���������܂��傤�B";
		mes "���������\�ȑ����͌��݁A";
		mes "�ȉ���8��ނł��B";
		next;
		mes "[�p���c]";
		mes "^0571B0�Ԃт�A�}�W�F�X�e�B�b�N�S�[�g[0]";
		mes "�ق��g�A���@���L���[�w����[1]";
		mes "�A�T�V���}�X�N�A�d���̎�";
		mes "�V�l�̉��ʁA�w���X[0]^000000";
		next;
		mes "[�p���c]";
		mes "���āA�ǂ����܂����H";
		mes "�ޗ����������";
		mes "���ł�����Ă��������܂���B";
		next;
		if(select("�K�v�Ȃ�","�������̕��������肢����") == 1) {
			mes "[�p���c]";
			mes "�ӂ��c�c�B";
			mes "���ł����͂����ɂ��܂��B";
			mes "�C����������܂����z�����������B";
			close;
		}
	case 3:
		break;
	}
	while(1) {
		mes "[�p���c]";
		mes "�킩��܂����B�ł́A�����̑O��";
		mes "���ӎ��������`�����܂��B�ӂӂ��B";
		mes "���������Ȃ�܂����A";
		mes "�厖�Ȃ̂ł悭�����Ă��������B";
		next;
		mes "[�p���c]";
		mes "^FF0000�܂��A�������s���ƁA";
		mes "�����Ɏg�p�������̓�������";
		mes "�����Ȃ�܂��B���ׁ̈A";
		mes "���B�l�A�J�[�h�A�G���`�����g�Ƃ�����";
		mes "�������ɓK�p����Ă������̂�";
		mes "�S�ď����܂��̂Œ��ӂ��Ă��������B^000000";
		next;
		mes "[�p���c]";
		mes "^FF0000���ɁA����̕������̓�������";
		mes "�����A�����i�Ɏ����Ȃ��ł��������B^000000";
		mes "���������������������Ă���ꍇ";
		mes "�������Ɏg�p���铪������";
		mes "�����g�ł͑I���ł��܂���̂ŁA";
		mes "���ӂ��Ă��������B";
		next;
		mes "[�p���c]";
		mes "�킩��Â炢�ł����H";
		mes "�����ł��ˁB�Ⴆ�΂��Ȃ���";
		mes "���@���L���[�w����[1]��";
		mes "���@���L���[�w�����I�u�����[�h[1]";
		mes "�̂Q�������Ă����Ƃ��܂��傤�B";
		mes "�ӂӁB�Ⴆ�΂̘b�ł���B";
		next;
		mes "[�p���c]";
		mes "���̏�ԂŁA�������Ɏg����������";
		mes "���@���L���[�w�����I�u�����[�h[1]";
		mes "�ɂȂ��Ă��܂�����A��S���ł��傤�B";
		mes "�ł�����A�g���\��̓���������";
		mes "�����Ă���悤�ɂ��Ă��������B";
		next;
		mes "[�p���c]";
		mes "�܂��A^FF0000�������Ɏg����������";
		mes "���������A�����i�Ɏ�������Ԃ�";
		mes "���������Ă��������B^000000";
		mes "�ӂӁB";
		mes "�ł�Ȃ��Ă��A�ޗ���������";
		mes "�����ɂ���肵�܂�����B";
		next;
		mes "[�p���c]";
		mes "�Ō�ɁA���������Ȃ��������̕����́A";
		mes "100���������܂��B";
		mes "�ӂӁB���h���܂������H";
		mes "�����ł��B�K�����������ł��B";
		mes "���S���Ă��C�����������B";
		next;
		mes "[�p���c]";
		mes "���ӓ_�͈ȏ�ł��B";
		mes "�����ł��ˁB�ǂ��ł��B";
		mes "���v�����ł����H";
		next;
		if(select("�킩����","������x���ӎ����𕷂�") == 1)
			break;
	}
	mes "[�p���c]";
	mes "���āA�ł͂ǂ̓�������";
	mes "�������܂����H";
	next;
	setarray '@reqlist$,"�Ԃт�(^777777�ޗ��s��^000000)","�}�W�F�X�e�B�b�N�S�[�g[0](^777777�ޗ��s��^000000)","�ق��g(^777777�ޗ��s��^000000)","���@���L���[�w����[1](^777777�ޗ��s��^000000)","�A�T�V���}�X�N(^777777�ޗ��s��^000000)","�d���̎�(^777777�ޗ��s��^000000)","�V�l�̉���(^777777�ޗ��s��^000000)","�w���X[0](^777777�ޗ��s��^000000)";
	if(countitem(6081) >= 50 && countitem(747) >= 4 && countitem(6395) >= 1 && countitem(721) >= 10 && countitem(723) >= 10 && countitem(726) >= 10 && countitem(728) >= 10 && countitem(729) >= 10) {
		setarray '@equiplist,2269,2256,5040,5171,5054,2286,5176,5016;
		for(set '@i,0; '@i<getarraysize('@equiplist); set '@i,'@i+1) {
			if(countitem('@equiplist['@i]) >= 1) {
				set '@reqlist$['@i],getitemname('@equiplist['@i]) + "(^2502FD�����\^000000)";
				set '@material['@i],1;
			}
		}
	}
	setarray '@itemlist,19552,19549,19550,19546,19553,19551,19554,19545;
	set '@menu,select(printarray('@reqlist$))-1;
	mes "[�p���c]";
	mes "^0571B0" +getitemname('@itemlist['@menu])+ "^000000�ł��ˁH";
	next;
	if('@material['@i] == 0 || countitem('@equiplist['@menu]) < 1) {
		emotion 28;
		mes "[�p���c]";
		mes "����c�c�A�C�e��������Ȃ��悤�ł��B";
		next;
		mes "[�p���c]";
		mes "^0571B0" +getitemname('@equiplist['@menu])+ "^000000��";
		mes "^E1281E�X�v�����f�B�b�h�R�C��50��";
		mes "������4�A�d���̖��@�̕�1��^000000";
		mes "^0000FF�G�������h�A���r�[�A�T�t�@�C�A";
		mes "�g�p�[�Y�A�W���R��10����^000000";
		mes "�����ė��Ă��������B";
		close;
	}
	emotion 1;
	mes "[�p���c]";
	mes "�ӂށB�ޗ��͑���Ă���悤�ł��B";
	mes "�ӂӂӁB";
	mes "�ł́A�������܂���H";
	next;
	if(select("�͂�","������") == 2) {
		emotion 23;
		mes "[�p���c]";
		mes "����H�@���ꂠ��!?";
		mes "��߂Ă��܂���ł����c�c�B";
		mes "�ӂ��B�܂������ł��傤�B";
		mes "�~�����Ȃ�����܂����Ă��������B";
		close;
	}
	emotion 29;
	mes "[�p���c]";
	mes "�킩��܂����B";
	mes "�v���Ԃ��";
	mes "���͂𔭊����鎞�����܂����ˁB";
	mes "�ӂӂ��B�ӂӂӂӂӁI";
	next;
	emotion 9;
	mes "[�p���c]";
	mes "�ӂ��B";
	mes "�c�c";
	mes "�c�c�c�c";
	mes "�ł́c�c";
	next;
	emotion 9;
	mes "[�p���c]";
	mes "�n�A�@�@�A�A";
	mes "�c�c";
	mes "�t�D�D�D";
	mes "�c�c�c";
	mes "�c�c�܂����c�c�c";
	mes "�n�@�@�A�I";
	next;
	mes "[�p���c]";
	mes "�t�D�D�D�D�H�H�I�I";
	mes "�c�c";
	mes "�c�c�I�@�c�c����!!";
	mes "�p�@�A���b�c!!";
	mes "�p�p�p�p�@�A���b�c!!";
	mes "�A�C���p�@���b�c�I";
	misceffect 12;
	progressbar 1;
	misceffect 54;
	progressbar 1;
	misceffect 55;
	progressbar 1;
	misceffect 56;
	progressbar 1;
	misceffect 68;
	next;
	delitem 6081,50;
	delitem 747,4;
	delitem 6395,1;
	delitem 721,10;
	delitem 723,10;
	delitem 726,10;
	delitem 728,10;
	delitem 729,10;
	delitem '@equiplist['@menu],1;
	getitem '@itemlist['@menu],1;
	mes "[�p���c]";
	mes "�ӂ��B�����ł��B";
	mes "�����Ȍ��ʂ��o�܂����ˁB";
	mes "�܂��������Ăق���������";
	mes "���ł��K�˂Ă��������B";
	mes "���͂��ł������ɂ��܂��B�ӂӁB";
	close;
OnInit:
	waitingroom "�ߑ������쐬",0;
	end;
}

//============================================================
// �L�̎�E���]��
//------------------------------------------------------------
-	script	�L�̎�E��#eclage	-1,{
	mes "[�L�̎�E��]";
	mes "�ǂ����ł��ɂ�`���q����B";
	mes "�������o���l�̋@������邽�߂Ȃ�";
	mes "���ɔ������΂鎖���S�O��Ȃ��B";
	mes "�ߌ��ȔL�̎��Ԉړ��T�[�r�X��";
	mes "�悤�����ł��ɂ�`�B";
	next;
	mes "[�L�̎�E��]";
	mes "�䂪�L�̎��Ԉړ��T�[�r�X��";
	mes "����܂Œ~�ς��ė���";
	mes "�ِ��E�̏�������";
	mes "��ԕʈړ��T�[�r�X��";
	mes "�s���Ă��܂��ɂ�B";
	next;
	mes "[�L�̎�E��]";
	mes "�����̓}���������Y�ʋl��";
	mes "Zeny�Ŏ󂯕t���Ă��邩��";
	mes "���Ђ����p���������ɂ�`�B";
	next;
	set '@menu$[0],"��߂�";
	switch(strnpcinfo(2)) {
	case 1:	// �G�N���[�W��
		setarray '@menu$[1],"���[��(�ʋl3��)","���[��(3,000Zeny)";
		set '@map$,"mora.gat";
		set '@x,130;
		set '@y,75;
		set '@cost,3;
		break;
	case 2:	// �X�v�����f�B�b�h
		setarray '@menu$[1],"���[��(�ʋl20��)","���[��(20,000Zeny)","�~�b�h�K���h�A�����Ԓn(�ʋl2��)","�~�b�h�K���h�A�����Ԓn(2,000Zeny)";
		setarray '@map$,"mora.gat","mid_camp.gat";
		setarray '@x,130,207;
		setarray '@y,75,227;
		setarray '@cost,20,2;
		break;
	case 3:	// ���[��
		setarray '@menu$[1],"�G�N���[�W��(�ʋl3��)","�G�N���[�W��(3,000Zeny)","�X�v�����f�B�b�h(����)";
		setarray '@map$,"eclage.gat","splendide.gat";
		setarray '@x,109,365;
		setarray '@y,37,244;
		setarray '@cost,3,0;
		break;
	case 4:	// �~�b�h�K���h�A�����Ԓn
		setarray '@menu$[1],"�X�v�����f�B�b�h(�ʋl2��)","�X�v�����f�B�b�h(2,000Zeny)","�}�k�N(�ʋl3��)","�}�k�N(3,000Zeny)";
		setarray '@map$,"splendide.gat","manuk.gat";
		setarray '@x,365,110;
		setarray '@y,244,342;
		setarray '@cost,2,3;
		break;
	case 5:	// �}�k�N
		setarray '@menu$[1],"�~�b�h�K���h�A�����Ԓn(�ʋl3��)","�~�b�h�K���h�A�����Ԓn(3,000Zeny)","�G���f�B�J�X�e�B�X(�ʋl20��)","�G���f�B�J�X�e�B�X(20,000Zeny)";
		setarray '@map$,"mid_camp.gat","dicastes01.gat";
		setarray '@x,207,189;
		setarray '@y,227,67;
		setarray '@cost,3,20;
		break;
	case 6:	// �G���f�B�J�X�e�B�X
		setarray '@menu$[1],"�}�k�N(�ʋl3��)","�}�k�N(3,000Zeny)";
		set '@map$,"manuk.gat";
		set '@x,110;
		set '@y,342;
		set '@cost,3;
		break;
	}
	set '@i,select(printarray('@menu$))-2;
	if('@i == -1) {
		mes "[�L�̎�E��]";
		mes "�ɂ�ɂ�`";
		mes "�܂��̂����������҂����Ă܂��ɂ�`�B";
		close;
	}
	if('@i%2) {
		set '@price,'@cost*1000;
		if(Zeny < '@price) {
			// ������
			mes "[�L�̎�E��]";
			mes "�ɂ�ɂ�H";
			mes "Zeny������Ȃ��ɂ�`�B";
			mes "�\���󂠂�܂���";
			mes "�����ł͍���܂��ɂ�`�B";
			close;
		}
		mes "[�L�̎�E��]";
		mes "�����Ă�����Ⴂ�ɂ�`�B";
		close2;
		set Zeny,Zeny-'@price;
	}
	else {
		if(countitem(12636) < '@cost) {
			mes "[�L�̎�E��]";
			mes "�ɂ�ɂ�H";
			mes "�ʋl�̐�������Ȃ��ɂ�`�B";
			mes "�\���󂠂�܂���";
			mes "�����ł͍���܂��ɂ�`�B";
			close;
		}
		mes "[�L�̎�E��]";
		mes "�����Ă�����Ⴂ�ɂ�`�B";
		close2;
		delitem 12636,'@cost;
	}
	warp '@map$['@i/2],'@x['@i/2],'@y['@i/2];
	end;
OnInit:
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$�ȊO�̓_�~�[
	if('@map$ == "-")					//duplicate���͉������Ȃ�
		end;
	waitingroom "�L�̎��Ԉړ��T�[�r�X",0;
	end;
}

eclage.gat,117,40,4		duplicate(�L�̎�E��#eclage)	�L�̎�E��#1	421
splendide.gat,373,240,4	duplicate(�L�̎�E��#eclage)	�L�̎�E��#2	421
mora.gat,136,76,4		duplicate(�L�̎�E��#eclage)	�L�̎�E��#3	421
mid_camp.gat,207,234,4	duplicate(�L�̎�E��#eclage)	�L�̎�E��#4	421
manuk.gat,108,350,4		duplicate(�L�̎�E��#eclage)	�L�̎�E��#5	421
dicastes01.gat,189,68,4	duplicate(�L�̎�E��#eclage)	�L�̎�E��#6	421

eclage.gat,98,26,0	script	�o��#eclage	45,1,1,{
	if(ASH_1QUE < 100) {	//�ِ��E�N�G�X�g���N���A
		mes "["+strcharinfo(0)+"]";
		mes "�i�Ȃ����O�ւ̓���";
		mes "�Ւf����Ă��āA";
		mes "�O�ɏo�邱�Ƃ��o���Ȃ��c�c�j";
		next;
		mes "�]^FF0000�ِ��E�N�G�X�g^000000���N���A���Ȃ���";
		mes "�@�G�N���[�W���̊O��";
		mes "�@�o�邱�Ƃ��ł��܂���]";
		next;
		mes "[��̗d��]";
		mes "�����̂��Ȃ��B";
		mes "�@";
		mes "�]�N�����b�������Ă����B";
		mes "�@�U������ƈ�C�̗d��������]";
		next;
		mes "[��̗d��]";
		mes "���ɖ����܂������H";
		mes "��낵����΁A�����v�����e����";
		mes "�����肵�܂��傤�B";
		next;
		if(select("���肢���܂��I","���������ł�") == 2) {
			mes "[��̗d��]";
			mes "�����ł����B";
			mes "�]�v�Ȃ����b�ł����ˁB";
			close;
		}
		mes "[��̗d��]";
		mes "����ł͂����肵�܂��B";
		close2;
		warp "prontera.gat",116,72;
		end;
	}
	warp "ecl_fild01.gat",99,317;
	end;
}

//============================================================
// �ē���
//------------------------------------------------------------
eclage.gat,177,56,3	script	�G�N���[�W���ē���#01	462,{
	mes "[�G�N���[�W���ē���]";
	mes "����ɂ��͖`���҂���B";
	mes "���t�B�l���̒��͑��̎푰�̕��ɂ�";
	mes "���������ɂ����ł��傤�B";
	mes "�ǂ������玄���s����ē����܂���B";
	mes "�ǂ����s�������ꏊ�͂���܂����H";
	next;
	set '@type,strnpcinfo(2);
	if('@type != 1)	viewpoint 1,177,56,0,0xFF0000;
	if('@type != 2)	viewpoint 1,302,256,1,0xFF8000;
	if('@type != 3)	viewpoint 1,267,155,2,0x000000;
	if('@type != 4)	viewpoint 1,184,191,3,0x32CD32;
	if('@type != 5)	viewpoint 1,288,288,4,0xFF00EE;
	if('@type != 6)	viewpoint 1,184,123,5,0x0000FF;
	if('@type != 7)	viewpoint 1,96,70,6,0xC000C0;
	setarray '@str$,"�암^FF0000(177,56)^000000",
			"�k��^FF8000(302,256)^000000",
			"����^000000(267,155)^000000",
			"������^32cd32(184,191)^000000",
			"�z�[���c���[�O^ff00ee(288,288)^000000",
			"�q�G�[���̌������t��^0000FF(184,123)^000000",
			"�o���t��^C000C0(96,70)^000000",
			"��߂�";
	set '@str$['@type-1],"";
	switch(select(printarray('@str$))) {
	case 1:
		set '@x,175;
		set '@y,54;
		break;
	case 2:
		set '@x,302;
		set '@y,253;
		break;
	case 3:
		set '@x,268;
		set '@y,158;
		break;
	case 4:
		set '@x,182;
		set '@y,189;
		break;
	case 5:
		set '@x,285;
		set '@y,287;
		break;
	case 6:
		set '@x,182;
		set '@y,121;
		break;
	case 7:
		set '@x,96;
		set '@y,67;
		break;
	case 8:
		mes "[�G�N���[�W���ē���]";
		mes "�킩��܂����B";
		mes "�ē����K�v�ɂȂ�����";
		mes "�C�y�ɘb�������Ă��������B";
		close2;
		viewpoint 2,1,1,0,0xFFFFFF;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		end;
	}
	mes "[�G�N���[�W���ē���]";
	mes "����ł͂�����ւǂ����B";
	close2;
	warp "eclage.gat",'@x,'@y;
	end;
OnInit:
	waitingroom "�G�N���[�W���ē�",0;
	end;
}

eclage.gat,302,256,3	duplicate(�G�N���[�W���ē���#01)	�G�N���[�W���ē���#02	462
eclage.gat,267,155,3	duplicate(�G�N���[�W���ē���#01)	�G�N���[�W���ē���#03	462
eclage.gat,184,191,3	duplicate(�G�N���[�W���ē���#01)	�G�N���[�W���ē���#04	462
eclage.gat,288,288,3	duplicate(�G�N���[�W���ē���#01)	�G�N���[�W���ē���#05	462
eclage.gat,184,123,3	duplicate(�G�N���[�W���ē���#01)	�G�N���[�W���ē���#06	462
eclage.gat,96,70,3		duplicate(�G�N���[�W���ē���#01)	�G�N���[�W���ē���#07	462

ecl_in01.gat,48,60,5	script	�G�N���[�W���K�[�h	447,{
	mes "[�G�N���[�W���K�[�h]";
	mes "�`���҂�A���}���܂��B";
	mes "�����͈̑�Ő_���Ȗ�";
	mes "�z�[���c���[�̓����ɂ���L��ł��B";
	mes "���ɂ��Ēm�肽���ł����H";
	next;
	switch(select("���{","�I�[�u","���X","�č�","���Ï�","��ʏZ��","��b����߂�")) {
	case 1:
		mes "[�G�N���[�W���K�[�h]";
		mes "�������̈̑�ȉ����܂߂ėE�҂ȏ��Z";
		mes "�̂��w�ҒB�͊F�A���{�̒���";
		mes "��������Ⴂ�܂��B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "���{�̓z�[���c���[�̏�w�ɂ���܂��B";
		mes "�������͂��̂܂ܔ�ׂΗǂ��̂ł���";
		mes "���Ȃ��͉H���Ȃ��̂ŁA�E���̓�����";
		mes "��w�֓o���Ă��������B";
		close;
	case 2:
		mes "[�G�N���[�W���K�[�h]";
		mes "���̗���ɂ���I�[�u��";
		mes "���������t�B�l���̏ے��Ɠ����ł��B";
		mes "�_��ŗ͋������͂������Ă��܂��B";
		mes "���t�B�l���͊F���̃I�[�u���������";
		mes "��؂ɕی삵�Ă��܂��B";
		close;
	case 3:
		mes "[�G�N���[�W���K�[�h]";
		mes "�����̓z�[���c���[�̍L��ł��B";
		mes "�K�v�Ȃ��̂�����܂�����A";
		mes "���̎��ӂœ���\�ł��傤�B";
		close;
	case 4:
		mes "[�G�N���[�W���K�[�h]";
		mes "�č��͍߂�Ƃ����l�X��";
		mes "�����߂邽�߂̏ꏊ�ł��B";
		mes "�����̖`���҂ł��邠�Ȃ���";
		mes "����ȏꏊ�ɉ��̗p����";
		mes "����̂ł����H";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "�^�₪�c��܂���";
		mes "�ꉞ�ʒu�͂��m�点�������܂��B";
		mes "�����̓����~��čs���΂���܂��B";
		mes "�������A���ɓ��邱�Ƃ͊ȒP�ł�";
		mes "�Ȃ��ł��傤�B";
		close;
	case 5:
		mes "[�G�N���[�W���K�[�h]";
		mes "���R�ɗD������܂�邻�̒��ł�";
		mes "���ׂĂ̔����ɂ݂�";
		mes "�����Ă��܂��܂��B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "���Ï��ł��Ȃ��̔�ꂽ�S�g��";
		mes "���Â��Ă݂����Ȃ�";
		mes "�����̓����~��Ă��������B";
		close;
	case 6:
		mes "[�G�N���[�W���K�[�h]";
		mes "�����ɗ���ԂɃ��t�B�l�����\����";
		mes "���������C�����܂���ł������H";
		mes "�z�[���c���[�̊O�ɏo�Ă݂Ă��������B";
		mes "�����Ɏ��B�̏Z��������܂��B";
		close;
	case 7:
		mes "[�G�N���[�W���K�[�h]";
		mes "���������Ƃ���������";
		mes "���ł������Ă��������B";
		mes "����ł́A�ǂ������B";
		close;
	}
}

//============================================================
// �N�G�X�g�ē���
//------------------------------------------------------------
eclage.gat,279,293,3	script	�s�v�c�ȏ㋉���t�B�l	435,{
	mes "[�s�v�c�ȏ㋉���t�B�l]";
	mes "�c�c�s�v�c�ȕ��������Ă��܂��B";
	mes "�ǂ���炠�Ȃ���";
	mes "���𐁂����悤�Ƃ��Ă���悤�ł��ˁB";
	mes "����A�C�O�h���V�������Ȃ���";
	mes "�����Ă���̂�������܂���B";
	next;
	mes "[�s�v�c�ȏ㋉���t�B�l]";
	mes "���Ȃ������̃G�N���[�W����";
	mes "������������̂��A";
	mes "���������܂��傤�B";
	mes "�C�O�h���V���̉�����c�c�B";
	setarray '@str$,"(^ff0000�i�s�s��^000000)","(^0000ff�i�s�\^000000)","(^008000�i�s��^000000)","(^808080�N���A��^000000)";
	set '@story[0],ECL_1QUE==3?  3: (ECL_1QUE>0? 2: 1);
	set '@story[1],ECL_2QUE==28? 3: (ECL_2QUE>0? 2: (ECL_1QUE<3 || BaseLevel<99? 0: 1));
	set '@story[2],ECL_3QUE==33? 3: (ECL_3QUE>0? 2: (BaseLevel<99? 0: 1));
	set '@story[3],ECL_4QUE==24? 3: (ECL_4QUE>0? 2: (BaseLevel<99? 0: 1));
	set '@story[4],ECL_5QUE==23? 3: (ECL_5QUE>0? 2: (BaseLevel<99? 0: 1));
	set '@story[5],ECL_6QUE==41? 3: (ECL_6QUE>0? 2: (ECL_3QUE<5 || BaseLevel<99? 0: 1));
	set '@story[6],ECL_7QUE==8?  3: (ECL_7QUE>0? 2: (BaseLevel<99? 0: 1));
	set '@story[7],ECL_8QUE>=3?  3: (ECL_8QUE>0? 2: (ECL_2QUE<2 || BaseLevel<99? 0: 1));
	set '@story[8],ECL_8QUE>=5?  3: (ECL_8QUE>2? 2: (ECL_8QUE<3 || BaseLevel<99? 0: 1));
	set '@story[9],ECL_8QUE>=10? 3: (ECL_8QUE>4? 2: (ECL_8QUE<5 || BaseLevel<99? 0: 1));
	set '@story[10],ECL_9QUE==10?3: (ECL_9QUE>0? 2: (BaseLevel<99? 0: 1));
	while(1) {
		next;
		set '@menu,select(
			"�`���ҒB�Ƃ̏o��@" +'@str$['@story[0]],
			"�������Ɓ@" +'@str$['@story[1]],
			"�G�N���[�W���̉��@" +'@str$['@story[2]],
			"�������̑㏞�@" +'@str$['@story[3]],
			"�d�������̎�����@" +'@str$['@story[4]],
			"�I�v�Ȃ��J�@" +'@str$['@story[5]],
			"�G�N���[�W���̈��Y�L�b�Y�@" +'@str$['@story[6]],
			"���t�B�l���K�[�f�j���O�@" +'@str$['@story[7]],
			"���ɒ��񂾖`���ҒB�@" +'@str$['@story[8]],
			"���̒��̖`���ҁ@" +'@str$['@story[9]],
			"�v���t�F�b�T�[���[���̋L���@" +'@str$['@story[10]],
			"��߂�")-1;
		if('@menu == 11) {
			mes "[�s�v�c�ȏ㋉���t�B�l]";
			mes "�C�O�h���V���̉�����c�c�B";
			close;
		}
		switch('@story['@menu]){
		case 0:
			mes "[�s�v�c�ȏ㋉���t�B�l]";
			mes "�����c�c�N���Ȃ��c�c�B";
			mes "���̂��Ȃ��ɂ�";
			mes "�܂�����Ȃ����̂�����悤�ł��B";
			mes "�@";
			mes "^0000ff�]�����������Ȃ��ׁA";
			mes "�@���݂��̃N�G�X�g�͏o���܂���]^000000";
			break;
		case 1:
			mes "[�s�v�c�ȏ㋉���t�B�l]";
			mes "�c�c�����܂��B";
			mes "���Ȃ����c�c�N���������c�c�B";
			next;
			mes "[�s�v�c�ȏ㋉���t�B�l]";
			mes "����]�ł����炻�̏ꏊ�܂�";
			mes "�����肵�܂��傤�B";
			next;
			if(select("�����Ă��炤","��߂Ă���") == 2)
				break;
			mes "[�s�v�c�ȏ㋉���t�B�l]";
			mes "����ł͂����肵�܂��傤�B";
			mes "�@";
			mes "���Ȃ��ɃC�O�h���V���̉�����B";
			close2;
			switch('@menu) {
			case 0: warp "ecl_fild01.gat",94,320; break;	// �`���ҒB�Ƃ̏o�
			case 1: warp "eclage.gat",102,30; break;		// ��������
			case 2: warp "ecl_in01.gat",32,49; break;		// �G�N���[�W���̉�
			case 3: warp "eclage.gat",282,254; break;		// �������̑㏞
			case 4: warp "eclage.gat",156,53; break;		// �d�������̎�����
			case 5: warp "ecl_in02.gat",133,114; break;		// �I�v�Ȃ��J
			case 6: warp "ecl_in01.gat",26,87; break;		// �G�N���[�W���̈��Y�L�b�Y
			case 7: warp "ecl_fild01.gat",190,92; break;	// ���t�B�l���K�[�f�j���O
			case 8: warp "ecl_fild01.gat",190,92; break;	// ���ɒ��񂾖`���ҒB
			case 9: warp "ecl_fild01.gat",190,92; break;	// ���̒��̖`����
			case 10: warp "ecl_tdun04.gat",26,38; break;	// �v���t�F�b�T�[���[���̋L��
			}
			end;
		case 2:
			mes "[�s�v�c�ȏ㋉���t�B�l]";
			mes "�����c�c�����Ă���B";
			mes "���c�c���Ȃ��́c�c";
			mes "���̒��S�ɂ���c�c�B";
			next;
			mes "^0000ff�]�i�s���̃N�G�X�g��";
			mes "�@�N�G�X�g���X�g����m�F���鎖��";
			mes "�@�\�ł��]^000000";
			break;
		case 3:
			mes "[�s�v�c�ȏ㋉���t�B�l]";
			mes "�c�c�Î₪�c�c";
			mes "�K��Ă��܂��c�c�B";
			mes "�@";
			mes "^ff0000�]�N���A�ς̃N�G�X�g�ł��]^000000";
			break;
		}
		next;
		mes "[�s�v�c�ȏ㋉���t�B�l]";
		mes "�����m�F���܂����H";
	}
OnInit:
	waitingroom "�N�G�X�g�ē�",0;
	end;
}

//============================================================
// �Z��
//------------------------------------------------------------
ecl_fild01.gat,92,316,5	script	���s��	545,{
	mes "[���s��]";
	mes "����Ȃɂ����ς��҂��Ă���Ƃ́c�c�B";
	mes "���͂��ɂȂ��������邩�ȁH";
	emotion 28;
	close;
}

ecl_fild01.gat,106,312,5	script	���s��	525,{
	mes "[���s��]";
	mes "���͂������ނ��o��������";
	mes "�����̉Ԕ����ƂĂ��C�ɓ�����";
	mes "�����ɋ������Ă��܂��B";
	emotion 14;
	next;
	mes "[���s��]";
	mes "��͐Q�܂őς����܂��I";
	mes "�x�����̌������Ă���";
	mes "�����ȊO�́c�c�B";
	emotion 4,"�x����#ep14_2";
	emotion 4,"�x����#ep14_2_2";
	close;
}

ecl_fild01.gat,108,320,7	script	���s��	941,{
	mes "[���s��]";
	mes "�G�N���[�W���͂ǂ�قǔ�����";
	mes "�s�s�Ȃ̂ł��傤���H";
	mes "�l���邾���Ńh�L�h�L���܂��B";
	emotion 3;
	close;
}

ecl_fild01.gat,105,320,2	script	���s��	436,{
	mes "[���s��]";
	mes "�Ⴄ�A���͗��s�҂ł͂Ȃ�";
	mes "�G�N���[�W���̏Z���Ȃ񂾂�I";
	emotion 6;
	next;
	mes "[���s��]";
	mes "���s�҂�����������";
	mes "�������ɓ���Ȃ��Ƃ����͉̂����I";
	emotion 23;
	close;
}

ecl_fild01.gat,103,319,5	script	���s��	900,{
	mes "[���s��]";
	mes "�����̃h���O���͊Â��Ĕ��������B";
	next;
	mes "[���s��]";
	mes "���̃h���O���Ȃ炱�̐��ň��";
	mes "�����������������邩������Ȃ��B";
	emotion 21;
	close;
}

ecl_fild01.gat,110,316,3	script	���s��	896,{
	mes "[���s��]";
	mes "���s�����鎞�͉ו���";
	mes "���Ȃ߂ɂ������������ł��B";
	next;
	mes "[���s��]";
	mes "���s������Ɖו���������������";
	mes "�d���Ȃ�܂�����B";
	next;
	mes "[���s��]";
	mes "���ꂪ�l���̏d�ʂȂ̂ł����ˁH";
	emotion 38;
	close;
}

ecl_fild01.gat,92,318,5	script	���s��	517,{
	mes "[���s��]";
	mes "�����c�c�B";
	close;
}

ecl_fild01.gat,93,318,5	script	���s��	107,{
	mes "[���s��]";
	mes "�����c�c�����c�c�B";
	next;
	mes "[���s��]";
	mes "�܂��Ȃ̂��c�c��������c�c";
	mes "�����󕠂Ō��E���c�c";
	close;
}

ecl_fild01.gat,94,313,5	script	���s��	715,{
	mes "[���s��]";
	mes "��I�@�N���~�b�h�K���h�o�g�Ȃ̂��H";
	next;
	mes "[���s��]";
	mes "�ŋ߂ɂȂ��ă~�b�h�K���h�o�g�̐l��";
	mes "���������Ċ�������B";
	emotion 44;
	close;
}

ecl_fild01.gat,101,320,5	script	���s��	522,{
	mes "[���s��]";
	mes "�͂��c�c�����ɂ��B";
	mes "����ƃr�t���X�g��n���ė����̂�";
	mes "�܂��҂ĂƁI";
	emotion 6;
	close;
}

ecl_fild01.gat,88,315,5	script	���s��	98,{
	mes "[���s��]";
	mes "�����c�c";
	mes "�ǂ����Ă���Ȃɐl�������񂾁c�c�B";
	next;
	mes "[���s��]";
	mes "�ЂƂ�ɂȂ肽���c�c�B";
	emotion 57;
	close;
}

ecl_in01.gat,54,91,3	script	�_���f�B#ecl	443,{
	mes "[�_���f�B]";
	mes "���̑f���炵���������Ă݂ȁI";
	mes "�ǂ����H �������������낤�H";
	next;
	mes "[�_���f�B]";
	mes "���t�B�l�Ȃ�N�ł����R���݂ɕ���";
	mes "�ω��ł��邯�ǁA�N�ł�����Ȃ�";
	mes "�����������킯�ł͂Ȃ��񂾁I";
	next;
	emotion 32,"���t�B�L#ecl";
	mes "[���t�B�L]";
	mes "�N�͉��������Ă���񂾁H";
	mes "�N�����Ă����̋��ň�Ԃ�";
	mes "�I�V��������͎��Ȃ񂾁I";
	close;
}

ecl_in01.gat,53,92,4	script	���t�B�L#ecl	444,{
	mes "[���t�B�L]";
	mes "���������̃Z���X�͑f���炵���B";
	next;
	emotion 14;
	mes "[���t�B�L]";
	mes "����ɂ��́`�B";
	mes "���̑f���炵���̂����`�B";
	mes "���̖тЂƂЂƂ܂Ŕ������ˁI";
	next;
	emotion 29,"�_���f�B#ecl";
	mes "[�_���f�B]";
	mes "�您�A�_�T�C�N�B";
	mes "�����͂��������_�T���ȁI";
	close;
}

eclage.gat,101,130,5	script	�E�^�|�A	435,{
	mes "[�E�^�|�A]";
	mes "���͐e�ƈꏏ�ɏZ��ł������ǁA";
	mes "�ŋ߈�l��炵���n�߂��̂ł�!!";
	mes "�����̃��C�����悤�ɂȂ���";
	mes "�{���ɂ��ꂵ���ł��I";
	next;
	mes "[�E�^�|�A]";
	mes "�G�N���[�W���ň�ԉؗ��";
	mes "���������C�ɂ������ł��I";
	next;
	emotion 18;
	mes "[�E�^�|�A]";
	mes "�����A���ꂵ���Ȃ��I";
	mes "���ꂵ���Ȃ�!!";
	close;
}

ecl_in01.gat,55,25,3	script	�~�U�j	520,{
	mes "[�~�U�j]";
	mes "�يE���痈�����ł��ˁH";
	mes "���}���܂��B";
	next;
	mes "[�~�U�j]";
	mes "�������A���Ȃ����G�N���[�W����";
	mes "���������Ȃ���΂̘b�ł����B";
	close;
}

eclage.gat,106,61,4	script	�}�R�T	444,{
	mes "[�}�R�T]";
	mes "�����يE�ɍs���Č������ł��B";
	next;
	mes "[�}�R�T]";
	mes "���ǁA�يE�̐l�����͂���ȃJ���C�C";
	mes "�������Č��ʂӂ肪�ł��܂����ˁH";
	next;
	emotion 32;
	mes "[�}�R�T]";
	mes "�͂����A�����ɍs���Ă�";
	mes "�����č���񂾂�ȁc�c�B";
	close;
}

ecl_in02.gat,168,41,3	script	�p���{	438,{
	mes "[�p���{]";
	mes "������͍̂D���ł����H";
	next;
	emotion 14;
	mes "[�p���{]";
	mes "���͂ƂĂ��D�������ǁI";
	next;
	mes "[�p���{]";
	mes "�s�J�s�J�`�s�J�s�J�`��";
	next;
	mes "[�p���{]";
	mes "�s�J�s�J�`�s�J�s�J�`��";
	mes "�s�J�s�J�`�s�J�s�J�`��";
	next;
	mes "[�p���{]";
	mes "�s�J�s�J�`�s�J�s�J�`��";
	mes "�s�J�s�J�`�s�J�s�J�`��";
	mes "���͂͂́`�͂͂́`�ЂЁ`��";
	mes "�ււց`�ӂӂЁ`�قف`��";
	mes "���킠���`�ւ��`�ՂՁ`��";
	next;
	emotion 28;
	mes "[�p���{]";
	mes "�c�c�B";
	mes "�����ǁA�����ɂ͌��镨��";
	mes "����܂���c�c�B";
	close;
}

ecl_fild01.gat,134,109,6	script	�����I	446,{
	mes "[�����I]";
	mes "���`�A�������󂢂����ǁA";
	mes "�����͉���H�ׂ悤���ȁH";
	next;
	mes "[�����I]";
	mes "���������ΈيE�̐l�͉��̖���";
	mes "����̂��C�ɂȂ�ȁH";
	next;
	emotion 29;
	mes "[�����I]";
	mes "���͂́A";
	mes "��k�ł���A�������I";
	close;
}

ecl_in01.gat,38,37,4	script	�Ђ��܂��������N	441,{
	mes "[�Ђ��܂��������N]";
	mes "�ǂ����Ă���ȕ��ɂ���";
	mes "����̂��C�ɂȂ��ł����H";
	next;
	mes "[�Ђ��܂��������N]";
	mes "�ŏ��͂������ʂ�";
	mes "�����Ă����̂ł��B";
	mes "�������A�����ԍ����Ă�����";
	mes "�G���̂΂����Ƃ��ł��Ȃ�";
	mes "�Ȃ��Ă��܂��܂����B";
	next;
	emotion 28;
	mes "[�Ђ��܂��������N]";
	mes "�̂΂����Ƃ��Ă������ƂĂ�Ⴢ��!!";
	mes "���̂܂܂Ђ��܂�������Ԃ�";
	mes "�����Ȃ���΂Ȃ�Ȃ���ł��傤���H";
	close;
}

ecl_fild01.gat,183,190,4	script	�P�C�^����	447,{
	emotion 18;
	mes "[�P�C�^����]";
	mes "��͂͂́I ����ɂ���I";
	mes "�����ɍs���ɂ͒��x�������ł���ˁH";
	next;
	emotion 16;
	mes "[�P�C�^����]";
	mes "�����ɍs���������ǁA���ٓ��������";
	mes "�����čs���̂��ʓ|�������ł����H";
	next;
	emotion 21;
	mes "[�P�C�^����]";
	mes "�����S�z���Ȃ��ő��v�ł��I";
	next;
	emotion 0;
	mes "[�P�C�^����]";
	mes "�G�N���[�W���̃��X������";
	mes "���������Ȃ���W�߂�";
	mes "�h���O���ō����";
	mes "���������g�ݍ��킹�I";
	next;
	emotion 8;
	mes "[�P�C�^����]";
	mes "���؂Ȃ��ٓ��Z�b�g���Ȃ��";
	mes "2,999�R�C��!!";
	next;
	emotion 23;
	mes "[�P�C�^����]";
	mes "�{���ɔj�i�I�ȉ��i�I";
	next;
	emotion 3;
	mes "[�P�C�^����]";
	mes "���A�������Ē����ƕS��g�p���Ă�";
	mes "�����V�i�̂悤�Ȏg���̂ăt�H�[�N��";
	mes "�����グ�܂��I";
	next;
	mes "[�P�C�^����]";
	mes "���H �يE�̕���";
	mes "����ȂɃh���O����";
	mes "�H�ׂȂ���ł����H";
	next;
	mes "[�P�C�^����]";
	mes "�m��܂���ł����c�c�B";
	close;
}

ecl_in01.gat,41,103,1	script	�o���O������	439,{
	mes "[�o���O������]";
	mes "���̏�ɂ���o���R�j�[��";
	mes "�����܂����H";
	mes "�����ł͏d�v�ȍs�����s����x��";
	mes "�}�����E�W�����l��������ł��I";
	next;
	emotion 14;
	mes "[�o���O������]";
	mes "�{���ɂ����������ł�!!";
	mes "���Ⴀ�������`��";
	close;
}

ecl_in01.gat,52,102,4	script	�����c�c��	442,{
	mes "[�����c�c��]";
	mes "�������̓G�N���[�W���؂̉H�����c�`��";
	mes "�V��̃n�[���j�[�𕷂����܂��傤�`��";
	next;
	mes "[�����c�c��]";
	mes "�يE�̐l��A���Ȃ��ɂ��`��";
	next;
	emotion 2;
	mes "[�����c]";
	mes "���`��";
	next;
	emotion 2,"�����c�c��#ecl01";
	mes "[�����c]";
	mes "���`�`��";
	mes "���`��";
	next;
	emotion 2,"�����c�c��#ecl02";
	mes "[�����c]";
	mes "���`�`�`��";
	mes "���`�`��";
	mes "���`��";
	next;
	emotion 2,"�����c�c��#ecl03";
	mes "[�����c]";
	mes "���`�`�`�`��";
	mes "���`�`�`��";
	mes "���`�`��";
	mes "���`��";
	next;
	emotion 2,"�����c�c��#ecl04";
	mes "[�����c]";
	mes "���`�`�`�`�`��";
	mes "���`�`�`�`��";
	mes "���`�`�`��";
	mes "���`�`��";
	mes "���`��";
	next;
	emotion 2,"�����c�c��#ecl05";
	mes "[�����c]";
	mes "���`�`�`�`�`�`��";
	mes "���`�`�`�`�`��";
	mes "���`�`�`�`��";
	mes "���`�`�`��";
	mes "���`�`��";
	mes "���`��";
	next;
	emotion 2;
	emotion 2,"�����c�c��#ecl01";
	emotion 2,"�����c�c��#ecl02";
	emotion 2,"�����c�c��#ecl03";
	emotion 2,"�����c�c��#ecl04";
	emotion 2,"�����c�c��#ecl05";
	mes "[�����c]";
	mes "�����`��";
	mes "�����Č��܂��傤�`";
	mes "�����悤�ȃ����f�B���`��";
	next;
	mes "[�����c�c��]";
	mes "�ǂ��ł���!!";
	mes "�������̃n�[���j�[!!";
	close;
}

ecl_in01.gat,51,103,4	script	�����c�c��#ecl01	442,{
	emotion 2;
	mes "[�����c�c��]";
	if(strnpcinfo(2) == "ecl05")
		mes "����`��";
	else
		mes "���`��";
	close;
}
ecl_in01.gat,53,103,4	duplicate(�����c�c��#ecl01)	�����c�c��#ecl02	442
ecl_in01.gat,50,104,4	duplicate(�����c�c��#ecl01)	�����c�c��#ecl03	442
ecl_in01.gat,52,104,4	duplicate(�����c�c��#ecl01)	�����c�c��#ecl04	442
ecl_in01.gat,54,104,4	duplicate(�����c�c��#ecl01)	�����c�c��#ecl05	442

ecl_tdun03.gat,50,47,4	script	�Ŕ�	837,{
	mes "�]4�K�ւ̓��������Ă��邽�߁A";
	mes "�@��������͏オ��܂���B";
	mes "�@�p��������͓��̓����ɂ���";
	mes "�@�ē��l�ɘb�������Ă��������]";
	close;
}

ecl_in02.gat,96,22,3	script	���ĎD	835,{
	mes "[�k] �č�";
	mes "[��] ���Ï�";
	close;
}

ecl_in01.gat,8,71,5	script	�G�N���[�W���K�[�h	447,{
	mes "[�G�N���[�W���K�[�h]";
	mes "������̓z�[���c���[�̉��w��";
	mes "�~��铹�Ɍq�����Ă��܂��B";
	mes "�܂��A�č��Ǝ��Ï�������܂��B";
	close;
}

ecl_in01.gat,76,89,4	script	�q�ɔԃ��t�B�l	437,{
	mes "[�q�ɔԃ��t�B�l]";
	mes "�q�Ɏg���܂����`�H";
	mes "1��^FF0000 100 Zeny^000000�ɂȂ�܂��`�B";
	next;
	if(select("�g��","�g��Ȃ�") == 2) {
		mes "[�q�ɔԃ��t�B�l]";
		mes "�g���Ƃ��͉����Ȃ�";
		mes "�����Ă��������`�B";
		close;
	}
	if(Zeny < 100) {
		mes "[�q�ɔԃ��t�B�l]";
		mes "�ǂ���炨��������Ȃ��悤�ł��B";
		close;
	}
	mes "[�q�ɔԃ��t�B�l]";
	mes "�q�ɂ��J���܂��B";
	close2;
	set Zeny,Zeny-100;
	openstorage;
	end;
OnInit:
	waitingroom "�q��",0;
	end;
}

ecl_in02.gat,164,56,3	script	���Ï���t��	437,{
	mes "[���Ï���t��]";
	mes "����ɂ��́B";
	mes "�����̓G�N���[�W�����Ï��ł��B";
	next;
	switch(select("�ʒu�Z�[�u","�x��","��b����߂�")) {
	case 1:
		mes "[���Ï���t��]";
		mes "�Z�[�u���܂����B";
		mes "�ł����A���Ï��ŃZ�[�u��";
		mes "��������Ƃ�����";
		mes "���܂��������Ȃ��ł��������ˁB";
		savepoint "ecl_in02.gat",163,49;
		close;
	case 2:
		mes "[���Ï���t��]";
		mes "�z�[���c���[�̐��炩�ȃG�l���M�[��";
		mes "��t�Ȏ��Ï��Ŕ�ꂽ�S�g��";
		mes "�񕜂��Ă݂܂��񂩁H";
		mes "�{���̓X�v�����f�B�b�h�R�C����";
		mes "1�����܂����A ���q�l�Ɍ�����";
		mes "5,000Zeny�ɃT�[�r�X���Ă����܂���B";
		next;
		switch(select("�X�v�����f�B�b�h�R�C�����g�p","Zeny���g�p","��߂�")) {
		case 1:
			if(countitem(6081) < 1) {
				mes "[���Ï���t��]";
				mes "�X�v�����f�B�b�h�R�C����";
				mes "�����Ă��Ȃ��݂����ł��B";
				mes "�悭�m�F���Ă��������B";
				close;
			}
			mes "[���Ï���t��]";
			mes "�������x��ł��������B";
			close2;
			delitem 6081,1;
			percentheal 100,100;
			warp "ecl_in02.gat",167,49;
			end;
		case 2:
			if(Zeny < 5000) {
				mes "[���Ï���t��]";
				mes "������������Ȃ��悤�ł��B";
				mes "�悭�m�F���Ă��������B";
				close;
			}
			mes "[���Ï���t��]";
			mes "�������x��ł��������B";
			close2;
			set Zeny,Zeny-5000;
			percentheal 100,100;
			warp "ecl_in02.gat",167,49;
			end;
		case 3:
			mes "[���Ï���t��]";
			mes "��ꂽ���͂��ł������p���������B";
			mes "�܂��̂��z�������҂����Ă��܂��B";
			close;
		}
	case 3:
		mes "[���Ï���t��]";
		mes "��ꂽ���͂��ł������p���������B";
		mes "�܂��̂��z�������҂����Ă��܂��B";
		close;
	}
}

ecl_in02.gat,135,45,5	script	���������t�B�l	441,{
	mes "[���������t�B�l]";
	mes "�����c�c�B";
	mes "�����́c�c�ǂ��ł����c�c?";
	next;
	mes "[���Ï����t�B�l]";
	mes "���Ï��ł�������S���Ă��������B";
	mes "�~���܂��g���܂�����";
	mes "�������@���{���܂����B";
	mes "�o�����Ђǂ��đ�ςȎ���";
	mes "�Ȃ�Ƃ��낾������ł���B";
	next;
	mes "[���������t�B�l]";
	mes "�c�c�B";
	mes "���́A�L�����S�R�Ȃ��̂ł����c�c�B";
	mes "���͂ǂ������̂ł����H";
	next;
	mes "[���Ï����t�B�l]";
	mes "�c�c��̓�����ǂ��낪�����āB";
	next;
	mes "[���������t�B�l]";
	mes "�c�c���̘b�ł����H";
	next;
	mes "[���Ï����t�B�l]";
	mes "���C�ɂȂ�����\���グ�悤��";
	mes "�v���Ă����̂ł����c�c�B";
	mes "�悭�����Ă��������B";
	next;
	mes "[���Ï����t�B�l]";
	mes "���Ȃ��͂��ꂩ��";
	mes "���C�����邱�Ƃ��ł��܂���B";
	mes "�H�ɉ�������Ă��܂����̂ł��B";
	mes "�H�̈�ԏd�v�ȕ�����";
	mes "��ђʂ��Ă��܂��āc�c�B";
	next;
	mes "[���������t�B�l]";
	mes "����ȁc�c�B";
	mes "���߂�Ȃ����c�c�B";
	mes "���߂�Ȃ����c�c���Ȃ��c�c�B";
	mes "���킠���[��!!";
	close;
}

ecl_in02.gat,137,44,3	script	���Ï����t�B�l	442,{
	mes "[���������t�B�l]";
	mes "�����c�c�B";
	mes "�����́c�c�ǂ��ł����c�c?";
	next;
	mes "[���Ï����t�B�l]";
	mes "���Ï��ł�������S���Ă��������B";
	mes "�~���܂��g���܂�����";
	mes "�������@���{���܂����B";
	mes "�o�����Ђǂ��đ�ςȎ���";
	mes "�Ȃ�Ƃ��낾������ł���B";
	next;
	mes "[���������t�B�l]";
	mes "�c�c�B";
	mes "���́A�L�����S�R�Ȃ��̂ł����c�c�B";
	mes "���͂ǂ������̂ł����H";
	next;
	mes "[���Ï����t�B�l]";
	mes "�c�c��̓�����ǂ��낪�����āB";
	next;
	mes "[���������t�B�l]";
	mes "�c�c���̘b�ł����H";
	next;
	mes "[���Ï����t�B�l]";
	mes "���C�ɂȂ�����\���グ�悤��";
	mes "�v���Ă����̂ł����c�c�B";
	mes "�悭�����Ă��������B";
	next;
	mes "[���Ï����t�B�l]";
	mes "���Ȃ��͂��ꂩ��";
	mes "���C�����邱�Ƃ��ł��܂���B";
	mes "�H�ɉ�������Ă��܂����̂ł��B";
	mes "�H�̈�ԏd�v�ȕ�����";
	mes "��ђʂ��Ă��܂��āc�c�B";
	next;
	mes "[���������t�B�l]";
	mes "����ȁc�c�B";
	mes "���߂�Ȃ����c�c�B";
	mes "���߂�Ȃ����c�c���Ȃ��c�c�B";
	mes "���킠���[��!!";
	close;
}

//============================================================
// �`���ҒB�Ƃ̏o��N�G�X�g
//- Registry -------------------------------------------------
// ECL_1QUE -> 0�`3
//------------------------------------------------------------
ecl_fild01.gat,97,322,0	script	#ep14_2�����	45,3,3,{
	if(ECL_1QUE < 3) {
		mes "[�x����]";
		mes "���҂����������B";
		mes "���߂ăG�N���[�W����K������";
		mes "���ꂷ�邽�߂̏��ނ�";
		mes "�L�����Ă��������B";
		close;
	}
	warp "eclage.gat",100,28;
	end;
}

ecl_fild01.gat,94,322,5	script	�x����#ep14_2	447,{
	switch(ECL_1QUE) {
	case 0:
		mes "[�x����]";
		mes "���߂ăG�N���[�W����K������";
		mes "���ꂷ�邽�߂̏��ނ�";
		mes "�L�����Ă��������B";
		next;
		mes "[�x����]";
		mes "�ŋ߁A�r�t���X�g��ʂ���";
		mes "�~�b�h�K���h�嗤����K���l��";
		mes "�����Ȃ��Ă��܂��A";
		mes "���̂悤�Ȏ葱�����Ƃ�悤��";
		mes "�Ȃ�܂����B";
		next;
		mes "[�x����]";
		mes "�������A�L�����Ă������������ނ�";
		mes "�G�N���[�W���̏o�����v�Ɏg�p���ꂽ��";
		mes "���d�ɕۊǂ������܂��̂�";
		mes "�����S���������B";
		next;
		if(select("���ނ��쐬����","��߂�") == 2) {
			mes "[�x����]";
			mes "���ނɋL�����Ȃ��ƃG�N���[�W����";
			mes "���ꂷ�邱�Ƃ��ł��Ȃ��̂�";
			mes "���ӂ��Ă��������B";
			close;
		}
		mes "[�x����]";
		mes "�ł́A���̏��ނ�";
		mes "���O�ƐE�Ƃ������Ă��������B";
		next;
		mes "�]��n���ꂽ���ނ�";
		mes "�@�K�v�������L�������]";
		next;
		mes "[�x����]";
		mes "���ނ̋L�����������܂�����";
		mes "�������ɂ���o�����Ǘ��҂�";
		mes "��o���Ă��������B";
		set ECL_1QUE,1;
		setquest 11310;
		close;
	case 1:
		mes "[�x����]";
		mes "���ނɖ��O�ƐE�ƁA���x������������";
		mes "�������ɂ���o�����Ǘ��҂�";
		mes "��o���Ă��������B";
		close;
	case 2:
		mes "[�x����]";
		mes "���ނ̍쐬�����������悤�ł��ˁB";
		mes "���t�B�l�̎�s�G�N���[�W����";
		mes "�悤�����I";
		next;
		mes "[�x����]";
		mes "�G�N���[�W���̓r�t���X�g��";
		mes "�e�����ɂ���̂�";
		mes "�푰�Ԃł̎��R�Ȉӎv�a�ʂ�";
		mes "�\�ł��B";
		next;
		mes "[�x����]";
		mes "�ł�����A�ʓr�̒ʖ�@���K�v�Ȃ�";
		mes "���s�푰�̂��߂̋���";
		mes "�\���ɐ�������Ă���̂�";
		mes "�y���������߂�����ł��傤�B";
		next;
		mes "[�x����]";
		mes "�܂��A�G�N���[�W���̉��ɂ�";
		mes "�̑�Ő_���Ȗ�";
		mes "^FF0000�z�[���c���[^000000������܂��B";
		mes "�����ɂ����鎖���ł��܂��̂�";
		mes "���ЁA��������肭�������B";
		set ECL_1QUE,3;
		chgquest 11311,201565;
		close2;
		warp "eclage.gat",100,28;
		end;
	default:
		mes "[�x����]";
		mes "���t�B�l�̎�s�G�N���[�W����";
		mes "�悤�����I";
		next;
		mes "[�x����]";
		mes "�G�N���[�W���̓r�t���X�g��";
		mes "�e�����ɂ���̂�";
		mes "�푰�Ԃł̎��R�Ȉӎv�a�ʂ�";
		mes "�\�ł��B";
		next;
		mes "[�x����]";
		mes "�ł�����A�ʓr�̒ʖ�@���K�v�Ȃ�";
		mes "���s�푰�̂��߂̋���";
		mes "�\���ɐ�������Ă���̂�";
		mes "�y���������߂�����ł��傤�B";
		next;
		mes "[�x����]";
		mes "�܂��A�G�N���[�W���̉��ɂ�";
		mes "�̑�Ő_���Ȗ�";
		mes "^FF0000�z�[���c���[^000000������܂��B";
		mes "�����ɂ����鎖���ł��܂��̂�";
		mes "���ЁA��������肭�������B";
		close;
	}
OnInit:
	if(strnpcinfo(2) == "ep14_2_2")
		waitingroom "�G�N���[�W������",0;
	end;
}
ecl_fild01.gat,100,323,3	duplicate(�x����#ep14_2)	�x����#ep14_2_2	447

ecl_fild01.gat,111,320,3	script	�o�����Ǘ���	445,{
	switch(ECL_1QUE) {
	case 0:
		mes "[�o�����Ǘ���]";
		mes "���̗p�ł����H";
		mes "���Ă̒ʂ�A���͍��ƂĂ��Z�����̂�";
		mes "�}���̗p���łȂ��Ȃ�";
		mes "�W���}�����Ȃ��Œ����܂����H";
		emotion 6;
		close;
	case 1:
		mes "[�o�����Ǘ���]";
		mes "�ӂ��c�c���҂�������";
		mes "�\���󂠂�܂���B";
		mes "�ŋ߁A���s�҂������āc�c�B";
		emotion 16;
		next;
		mes "[�o�����Ǘ���]";
		mes "����ł͋L���������ނ�������ɁB";
		next;
		mes "[�H�H�H]";
		mes "�����I�@���ޑS�����������I";
		mes "����ŊԈႢ�Ȃ���ȁH";
		mes "�������ɓ���Ă����I";
		cutin "bu_du1",2;
		emotion 23,"";
		next;
		cutin "bu_du1",255;
		mes "[�o�����Ǘ���]";
		mes "���́c�c���q�l�A���Ԃɏ��ނ�";
		mes "�������Ă��܂��̂�";
		mes "���΂炭���҂����������B";
		emotion 4;
		next;
		mes "[�H�H�H]";
		mes "���������Ă�񂾁I";
		mes "�������������ɗ����񂾁I";
		cutin "bu_du3",2;
		next;
		cutin "bu_du3",255;
		mes "[�o�����Ǘ���]";
		mes "���q�l�����ނ��L�����Ă���Ԃ�";
		mes "���̕������ނ��o���܂����̂�";
		mes "���q�l�̏��Ԃ����ɉ�������";
		mes "���܂����̂ł��B";
		emotion 7;
		next;
		mes "[�H�H�H]";
		mes "��!?�@��ɗ������Ԃŏ������Ă�����";
		mes "����������Ȃ���!!";
		cutin "bu_du5",2;
		next;
		cutin "bu_du5",255;
		mes "[�o�����Ǘ���]";
		mes "����͂����ł����c�c�B";
		next;
		mes "�]�͂����I�]";
		next;
		mes "[�H�H�H]";
		mes "�ɂ��I�@�Ȃ�ŉ���񂾂�I";
		cutin "bu_du4",2;
		next;
		mes "[�H�H�H]";
		mes "���݂܂���B";
		mes "�����̃o�J�����f�������܂����B";
		cutin "bu_mark3",0;
		next;
		mes "[�H�H�H]";
		mes "�N���o�J����I";
		cutin "bu_du5",2;
		next;
		mes "[�H�H�H]";
		mes "�ŏ��ɂ��O�����O���Ԉ����";
		mes "���������炶��Ȃ����B";
		mes "����ȃo�J�Ȃ��Ƃ����Ȃ����";
		mes "�����܂ő҂�����Ȃ������͂�����I";
		cutin "bu_mark3",0;
		next;
		mes "[�H�H�H]";
		mes "�}�[�N�C�V�����}�h���h����������I";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�S�R�Ⴄ�I";
		mes "�ǂ�����15�N���ꏏ�ɂ���";
		mes "�F�B�̖��O���ԈႦ��񂾁I";
		cutin "bu_mark4",0;
		next;
		mes "[�H�H�H]";
		mes "�ԈႦ���񂶂�Ȃ��I";
		mes "�킴�Ƃ�����񂾁I";
		mes "�}�h���h�ŏ\������I";
		mes "�}�h���h�ŁI";
		cutin "bu_du3",2;
		next;
		cutin "bu_du3",255;
		mes "[�}�[�N�C�V��]";
		mes "�ӂ��c�c�o�J�ȗF�l�ł��݂܂���B";
		mes "�������̂��Ƃ͋C�ɂ��Ȃ���";
		mes "���d���𑱂��Ă��������B";
		cutin "bu_mark3",0;
		next;
		mes "[�H�H�H]";
		mes "���킠�������I";
		mes "��������I";
		mes "�����������܂ő҂Ă΂����񂾁I";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�Â��ɂ���!!";
		mes "���݂܂���A���݂܂���B";
		cutin "bu_mark3",0;
		next;
		cutin "bu_mark3",255;
		mes "[�o�����Ǘ���]";
		mes "�͂��c�c���܂��ˁB";
		mes strcharinfo(0)+ "�l��";
		mes "��s�̏��ޏ������������܂����B";
		mes "�x�����ɘb�������";
		mes "�s�s�ɓ��邱�Ƃ��ł��܂��B";
		emotion 27;
		next;
		mes "[�H�H�H]";
		mes "�c�c";
		cutin "bu_oliver0",0;
		next;
		cutin "bu_oliver0",255;
		mes "["+strcharinfo(0)+"]";
		mes "(���A�N�������悤�ȁc�c�H)";
		next;
		mes "[�o�����Ǘ���]";
		mes "�����āA�e���[���A���l�̈�s��";
		mes "���邳���̂ő������ɘA���";
		mes "�����Ă��������B";
		emotion 6;
		next;
		mes "[�e���[���A��]";
		mes "���͂͂�!!";
		mes "������!!";
		mes "���ǂ͉��̂������ő������邱�Ƃ�";
		mes "�ł�������I";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���O�̂����œ���̂��x�ꂽ��c�c�B";
		cutin "bu_mark4",0;
		next;
		mes "[�e���[���A��]";
		mes "�^�̒j�Ƃ͉ߋ��̎���";
		mes "�U��Ԃ�Ȃ����Ƃ��I";
		mes "���ގ�t�͉����x�ꂽ���ǁI";
		mes "�G�N���[�W������͕������Ȃ��I";
		mes "���͂͂͂�!!";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c�͂��B";
		mes "�{���ɐ\���󂠂�܂���B";
		cutin "bu_mark2",0;
		next;
		mes "[�H�H�H]";
		mes "���́c�c�}�[�N����B";
		mes "�e���[�������݂��܂���B";
		cutin "bu_maggi3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���c�c�B";
		cutin "bu_mark3",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����ɂ��c�c�B";
		emotion 19,"";
		set ECL_1QUE,2;
		chgquest 11310,11311;
		close2;
		cutin "bu_mark3",255;
		end;
	case 2:
		mes "[�o�����Ǘ���]";
		mes "�͂��`���܂��B";
		mes strcharinfo(0)+ "�l��";
		mes "��s�̏��ޏ������������܂����B";
		mes "�x�����ɘb�������";
		mes "�s�s�ɓ��邱�Ƃ��ł��܂��B";
		emotion 27;
		close;
	default:
		mes "[�o�����Ǘ���]";
		mes "�͂��c�c���܂��B";
		mes strcharinfo(0)+ "�l��";
		mes "��s�̏��ޏ������������܂����B";
		mes "�x�����ɘb�������";
		mes "�s�s�ɓ��邱�Ƃ��ł��܂��B";
		emotion 27;
		close;
	}
OnInit:
	waitingroom "�o�����Ǘ���",0;
	end;
}

//============================================================
// �������ƃN�G�X�g
//- Registry -------------------------------------------------
// ECL_2QUE -> 0�`28
//------------------------------------------------------------
eclage.gat,101,29,0	script	#ep14_2��	139,5,5,{
	if(ECL_1QUE == 3 && ECL_2QUE == 0) {
		mes "�]�X�̉��ւƎ������������";
		mes "�@����Ȗ؂��������B";
		mes "�@���ꂪ^FF0000�z�[���c���[^000000�̂悤���]";
		next;
		mes "[�d����H]";
		mes "���I";
		mes "�����C��t���Ă��������I";
		emotion 23,"�d����H#ep14_2";
		set ECL_2QUE,1;
		//setquest 72600;
		//compquest 72600;
		close;
	}
	if(ECL_2QUE == 4) {
		mes "�]�������Ă��āA�ƂĂ��댯���B";
		mes "�@���������������ǂ����낤�]";
		set ECL_2QUE,5;
		//setquest 72605;
		//compquest 72605;
		close;
	}
	end;
}

eclage.gat,102,32,4	script	�d����H#ep14_2	443,{
	switch(ECL_2QUE) {
	case 0:
	case 1:
		mes "[�d����H]";
		mes "���̈ꕔ�����Ă���̂�";
		mes "�C��t���Ă��������B";
		mes "���ɗ����Ă��܂��܂���B";
		next;
		switch(select("�d���̓��e","������ꂽ���R","��߂�")) {
		case 1:
			mes "[�d����H]";
			mes "���Ă̒ʂ��H�̎d�������Ă��܂��B";
			mes "�ŋ߂̓G�N���[�W���ɗ��s�҂�������";
			mes "�ȑO��苴����邱�Ƃ�";
			mes "�͂����Ă��܂��B";
			next;
			mes "[�d����H]";
			mes "���t�B�l�͔�ׂ邩�狴��u��";
			mes "�K�v�͂���܂���";
			mes "�؂ɓo�����肵�ė����闷�s�҂�����";
			mes "�����ċ�������Ă��܂��B";
			close;
		case 2:
			mes "[�d����H]";
			mes "�����قǁA�l�Ԃ����̏��";
			mes "�����Ă���r���A�o�����X�������";
			mes "�����Ă��܂����̂ł���";
			mes "���̎��ɋ��̌s��؂���";
			mes "���܂����悤�ł��B";
			emotion 6;
			next;
			mes "[�H�H�H]";
			mes "���[���I�@�����Ă���[�I";
			next;
			mes "[�d����H]";
			mes "��������ł͉�������";
			mes "�����グ���܂���I";
			mes "���𒼂��܂ő҂��Ă��Ă��������I";
			next;
			mes "[�H�H�H]";
			mes "���O��͋���ׂ邾�낤�B";
			mes "���ł��ĉ��������グ�Ă���I";
			next;
			mes "[�d����H]";
			mes "�����ł���B";
			mes "���ŏ����ɍs�����ɂ�";
			mes "�̂̑傫�����Ⴂ�߂���";
			mes "�����グ���܂���I";
			next;
			mes "[�H�H�H]";
			mes "�Ȃ񂾂�!?";
			mes "�킩�����A�������𒼂���";
			mes "�����Ă���I";
			next;
			mes "[�d����H]";
			mes "�͂��c�c";
			mes "�^����������̋߂��Ȃ̂�";
			mes "�����C�������Ȃ��ƁB";
			next;
			mes "[�d����H]";
			mes "�������A�댯���ƒm�点��W����";
			mes "�ݒu���āA���𒼂��ޗ����󂯎����";
			mes "�������Ăтɍs���āc�c�B";
			mes "�����A����D�悵�悤�c�c�B";
			next;
			if(select("��`��","��߂�") == 2) {
				mes "[�d����H]";
				mes "�����C������܂ł͊댯�Ȃ̂�";
				mes "���ӂ��ēn���Ă��������B";
				close;
			}
			mes "[�d����H]";
			mes "�{���ł����I";
			mes "��`���Ă�����ł����H";
			mes "�c�c��c�c�D�����c�c�B";
			emotion 23;
			next;
			mes "[�d����H]";
			mes "�܂����̐��̒��ɂ���ȂɗD��������";
			mes "�c���Ă���Ƃ́c�c�ڂ��犾���c�c�B";
			emotion 28;
			next;
			mes "[�d����H]";
			mes "�ł́A�킽���̑���ɏC���Ɏg��";
			mes "�V�������̍ޗ���";
			mes "�����ė��Ă���܂��񂩁H";
			mes "���̕������������痎����";
			mes "����ł��������ςȂ̂�";
			mes "���͖��@�g���ċ����ێ������Ă��܂��I";
			next;
			mes "[�d����H]";
			mes "���ƁA�C���ɕK�v�ȋ��̍ޗ���";
			mes "�����v�Z���܂��̂ŁA";
			mes "������x�b�������Ă�����Ă�";
			mes "�����ł����H";
			emotion 27;
			set ECL_2QUE,2;
			setquest 11312;
			close;
		case 3:
			mes "[�d����H]";
			mes "�����C������܂ł͊댯�Ȃ̂�";
			mes "���ӂ��ēn���Ă��������B";
			close;
		}
	case 2:
		mes "[�d����H]";
		mes "���߂�Ȃ����B";
		mes "���A�}���ŏC�����܂��̂ŁA";
		mes "���̏C������������܂�";
		mes "�������҂����������B";
		next;
		menu "���@�ŏC��������H",-;
		mes "[�d����H]";
		mes "�����A�C���͕s�\�ł͂Ȃ��ł���";
		mes "�����n���Ɋ֘A���閂�@�͖��͂�";
		mes "���Ղ����Ⴄ�̂ŏ���Ɏg�p���Ă�";
		mes "�����Ȃ���ł��B";
		next;
		mes "[�d����H]";
		mes "�ȑO�͋��̍ޗ���K�v�ȕ�����";
		mes "��������΂悩��������";
		mes "�ŋ߂͑�ʐ��Y���Ă���";
		mes "�����i���g�p���Ă����ł��B";
		next;
		mes "[�d����H]";
		mes "���̑ϋv�x�̂��߂ɂ͋��̍ޗ���";
		mes "�ؒf������A�����̍ޗ���";
		mes "�q���Ȃ������������ǁA";
		mes "�����i�͑傫�������܂��Ă���̂�";
		mes "�d���Ȃ��ł��ˁB";
		next;
		mes "[�d����H]";
		mes "��ꂽ�����c�c�������炠�����܂�";
		mes "19���[�g�����炢�Ȃ�ł��B";
		mes "���̍ޗ��́c�c";
		emotion 19;
		next;
		mes "[�d����H]";
		mes "����c�c�B";
		emotion 19;
		next;
		mes "[�d����H]";
		mes "����ł́A���̍ޗ���2�{";
		mes "����Ă��Ă��������B";
		emotion 5;
		next;
		mes "[�d����H]";
		mes "�s�s�̊O���̃^���[�߂���";
		mes "�����Ă���^0000FF�S����^000000�ɘb�������";
		mes "�V�������̍ޗ��������͂��ł��B";
		set ECL_2QUE,3;
		chgquest 11312,11313;
		close;
	case 3:
		mes "[�d����H]";
		mes "�s�s�̊O���̃^���[�߂���";
		mes "�����Ă���m�S�����n�ɘb�������";
		mes "�V�������̍ޗ��������͂��ł��B";
		close;
	case 4:
	case 5:
		mes "[��H�t�H��]";
		mes "�{���ɂ��܂��ɂ���Ȃ��Ƃ�";
		mes "�Y��ł����ł����B";
		mes "�{���ɐ^�ʖڂł��ˁc�c�B";
		next;
		mes "[��H�t�H��]";
		mes "���I�@����Ȃ��Ƃ����Ă���";
		mes "�ꍇ����Ȃ������A";
		mes "�}���ŋ����C�����ĉ��ɗ������l��";
		mes "�����g���Ȃ��ƁB";
		next;
		mes "[�H�H�H]";
		mes "���[���I�@�������Ă���I";
		next;
		mes "[�e���[���A��]";
		mes "�ӂ��I";
		mes "���������I";
		emotion 23,"";
		emotion 23;
		cutin "bu_du2",2;
		next;
		mes "[�e���[���A��]";
		mes "�؂̎}�Ɉ���������Ȃ���";
		mes "���o�������ȁB";
		next;
		mes "[�}�[�N�C�V��]";
		mes "������A�����C��t�����";
		mes "����������Ȃ����I";
		mes "���������ǂ�قǂ̖��f��";
		mes "���������Ǝv���Ă���񂾁H";
		cutin "bu_mark3",0;
		next;
		cutin "bu_mark3",255;
		mes "[��H�t�H��]";
		mes "�c�c";
		emotion 4;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c";
		emotion 4,"";
		next;
		mes "[�e���[���A��]";
		mes "����I";
		mes "�������̂����炶��Ȃ����I";
		mes "���O�炪���𒼂��̂���`�����̂��H";
		mes "�Ȃ��Ȃ���邶��Ȃ����I";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���݂܂���B";
		mes "��قǂ��瑱���Ă݂��Ƃ��Ȃ�";
		mes "�p�΂��茩���Ă��܂��āB";
		cutin "bu_mark1",0;
		next;
		cutin "bu_mark1",255;
		mes "[��H�t�H��]";
		mes "����͌��Ȃ��������Ƃ�";
		mes "���܂�����";
		mes "���ɋ����󂵂���";
		mes "�č��ɓ���܂�����ˁI";
		mes "�����ɂł͂Ȃ��̂ł�����B";
		emotion 6;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���݂܂���B";
		mes "���̕�����\���ɒ��ӂ����Ă����̂�";
		mes "�S�z���Ȃ��ł��������B";
		cutin "bu_mark1",0;
		next;
		mes "[�e���[���A��]";
		mes "�����ǁA���������������Ȃ̂�";
		mes "��������Ȃ�āc�c";
		mes "�ϋv�x�ɖ�肪����񂶂�Ȃ����H";
		mes "���ꂶ�Ⴀ���l�����̓G�N���[�W����";
		mes "���邱�Ƃ��c�c�B";
		cutin "bu_du3",2;
		next;
		cutin "bu_du3",255;
		mes "�]�e���[���A�������̎肷���";
		mes "�@���u�����u�ԁB";
		mes "�@�肷�肪�^�����";
		mes "�@����������Ă��܂����]";
		emotion 23;
		emotion 23,"";
		next;
		mes "[��H�t�H��]";
		mes "�c�c";
		emotion 57;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���c�c�B";
		cutin "bu_mark4",0;
		next;
		mes "[�H�H�H]";
		mes "���c�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�e���[���A��]";
		mes "�͂��c�c�B";
		cutin "bu_du1",2;
		next;
		mes "[�e���[���A��]";
		mes "�Ⴄ�I�@����͖{���Ɍ�����I";
		mes "���������I";
		mes "�����̈ē��ɂ����̏�ł͊�Ȃ�����";
		mes "�肷��ɂ��܂��Ă���������";
		mes "�����Ă��邶��Ȃ����B";
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "���͌y�����u���������Ȃ񂾂�I";
		mes "���͈����Ȃ��I";
		next;
		cutin "bu_du5",255;
		mes "[��H�t�H��]";
		mes "�c�c";
		emotion 9;
		next;
		mes "[��H�t�H��]";
		mes "���c�c";
		emotion 6;
		next;
		mes "[��H�t�H��]";
		mes "�����������c�c";
		mes "�c�c�B";
		emotion 23;
		next;
		mes "[��H�t�H��]";
		mes "�����s�����̃g���u�����[�J�[�I";
		emotion 23;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�{���ɂ��݂܂���B";
		mes "���̌�ɂ������������ɂ����Ă���";
		mes "�d������`���ɗ��܂��B";
		cutin "bu_mark1",0;
		next;
		cutin "bu_mark3",255;
		mes "[��H�t�H��]";
		mes "����ȁI";
		mes "������x�Ɨ���ȁI";
		emotion 23;
		next;
		mes "[��H�t�H��]";
		mes "���`���c�c";
		mes "���������d�����I��点�ėF�B��";
		mes "��ɍs�����Ǝv���Ă��̂Ɂc�c�B";
		mes "�������O��m�肶��Ȃ���";
		emotion 57;
		next;
		mes "[��H�t�H��]";
		mes "�������Ă͂Ȃ�����";
		mes "���Ƃ��C���͏o���邯�ǁc�c�B";
		mes "�͂��c�c�B";
		emotion 28;
		next;
		mes "[��H�t�H��]";
		mes strcharinfo(0)+ "�l��";
		mes "����^FF0000�z�[���c���[^000000�ɍs���Ă��������B";
		mes "���̓����܂������s�s�̕���";
		mes "�������Ėk�����ɍs���Β����܂��B";
		emotion 54;
		next;
		mes "[��H�t�H��]";
		mes "�z�[���c���[�ɓ���Ƃ����ڂ̑O��";
		mes "�L�ꂪ�ł邯�ǁA�����ɂ͐l�X��";
		mes "�����ς��W�܂��Ă���̂�";
		mes "���𓾂�ɂ͂����Ǝv���܂��B";
		next;
		mes "[��H�t�H��]";
		mes "�����āA�z�[���c���[�̓����ɂ���";
		mes "�F�B�̃O���V�X�ɍ����͂����Ȃ���";
		mes "�`���Ă���܂��񂩁H";
		next;
		mes "[��H�t�H��]";
		mes "���������F�B�̒a�����Ȃ̂�";
		mes "�݂�ȂŏW�܂邱�Ƃ�";
		mes "�Ȃ��Ă����̂ł���";
		mes "�F�B��҂�����킯�ɂ�";
		mes "�����܂��񂩂�c�c";
		mes "���肢���܂��B";
		emotion 17;
		delitem 6553,2;
		viewpoint 1,283,275,0,0xFF0000;
		set ECL_2QUE,6;
		chgquest 11314,11315;
		close;
	case 6:
		mes "[��H�t�H��]";
		mes "�z�[���c���[�̓����ɂ���";
		mes "�F�B�̃O���V�X�ɍ����͂����Ȃ���";
		mes "�`���Ă���܂��񂩁H";
		next;
		mes "[��H�t�H��]";
		mes "���������F�B�̒a�����Ȃ̂�";
		mes "�݂�ȂŏW�܂邱�Ƃ�";
		mes "�Ȃ��Ă����̂ł���";
		mes "�F�B��҂�����킯�ɂ�";
		mes "�����Ȃ��̂ł��肢���܂��B";
		viewpoint 1,283,275,0,0xFF0000;
		emotion 17;
		close;
	default:
		mes "[��H�t�H��]";
		mes "�����F�B�ɉ�����ł��B";
		emotion 28;
		close;
	}
OnInit:
	waitingroom "��������",0;
	end;
}

ecl_fild01.gat,201,91,4	script	�S����	442,{
	switch(ECL_2QUE) {
	case 3:
		mes "[�S����]";
		mes "�����͎��R�����o����";
		mes "�ł������������ł���A";
		mes "���́A��葽���̐�����";
		mes "���邽�߂̂��̂��Ƃ����B";
		next;
		mes "[�S����]";
		mes "���@�ō͔|���ꂽ���̎��";
		mes "�����͂���̂��낤���B";
		mes "���@�ň�Ă��������Ă�";
		mes "���ƌĂׂ�̂��낤���B";
		next;
		mes "[�S����]";
		mes "�������Ԃ������Ď�����";
		mes "��������ė�����";
		mes "�ȒP�ɍ���ȒP�ɉ���";
		mes "���̋��̎p�͎���Y�܂���B";
		next;
		mes "[�S����]";
		mes "������܂�����̗���Ȃ̂��c�c�B";
		mes "�Ȃ����͂��̂悤�ȉ^��������������";
		mes "���o�����̂��낤�B";
		next;
		mes "[�S����]";
		mes "���̎�͎��̖��O���Ƃ���";
		mes "�m�S�����A�b�g]�ƌĂ�ł���B";
		next;
		mes "[�S����]";
		mes "�y�ɐA����Ɠ�̌s��";
		mes "�ЂƂ̗t���ς��o��Ƃ���";
		mes "�s�v�c�Ȏp�Ő������邩��";
		mes "���̍ޗ��Ƃ��ė��p���Ă���";
		mes "�A���Ȃ̂��B";
		next;
		mes "[�S����]";
		mes "�S�����A�b�g�̂����ŋ��̍ޗ���";
		mes "����Ȃ����͉������ꂽ��";
		mes "���R�̗͂𖳎����Ă��܂����B";
		mes "���̖��@���������낵�����ʂ�";
		mes "�����̂ł͂Ȃ����ƐS�z���Ă���B";
		next;
		mes "[�S����]";
		mes "�ŋ߂̓t�B���[�l�̎d������`���Ȃ���";
		mes "���������C�����߂��Ă͂��邪";
		mes "�����͂��̊ԈႢ��";
		mes "�����Ă�������Ȃ񂾁B";
		next;
		mes "[�S����]";
		mes "�N���S�g�����Ă��鎞��";
		mes "�t�B���[�l�Ƙb�����Ă݂邪����";
		mes "�V���������𓾂邱�ƂɂȂ邩��B";
		mes "�����āc�c���ށc�c�B";
		mes "������Ƙb���Ă���Ԃ�";
		mes "���̍ޗ������������悤���B";
		next;
		mes "[�S����]";
		mes "�ł́A���̋��̍ޗ���";
		mes "�t�H���ɓn���Ă���Ă���B";
		mes "���ƁA��ςȂ͕̂����邯��";
		mes "������������厖�ɂ��Ă����";
		mes "�`���Ă���Ȃ����H";
		next;
		if(checkitemblank() == 0) {
			mes "[�S����]";
			mes "����A�����Ԃ�Ɖו��������ȁB";
			mes "�܂��͉ו������炵�Ă���";
			mes "����Ȃ����H";
			close;
		}
		mes "[�S����]";
		mes "�����t�B���[�l�̎d����";
		mes "����`�����Ă���̂�";
		mes "�p�ɂɋ�������Ƒ̂������Ȃ���B";
		getitem 6553,2;
		set ECL_2QUE,4;
		chgquest 11313,11314;
		close;
	case 4:
	case 5:
		mes "[�S����]";
		mes "�ł́A���̋��̍ޗ���";
		mes "�t�H���ɓn���Ă���Ă���B";
		mes "���ƁA��ςȂ͕̂����邯��";
		mes "������������厖�ɂ��Ă����";
		mes "�`���Ă���Ȃ����H";
		next;
		mes "[�S����]";
		mes "�����t�B���[�l�̎d����";
		mes "����`�����Ă���̂�";
		mes "�p�ɂɋ�������Ƒ̂������Ȃ��Ȃ�B";
		close;
	default:
		mes "[�S����]";
		mes "��{�̃G���_�[�E�B���[����Ă邽�߂�";
		mes "�t����y�R�y�R�͋������悤���B";
		next;
		mes "[�S����]";
		mes "��{�̃G���_�[�E�B���[����Ă邽�߂�";
		mes "�A���[���͎��v���̒��ŋ������悤���B";
		next;
		mes "[�S����]";
		mes "�~�b�h�K���h���痈���o�[�h��";
		mes "�������Ă��ꂽ�̂Ȃ񂾂�B";
		next;
		mes "[�S����]";
		mes "�����A�N���m���Ă���̂�����Ȃ�";
		mes "���Е����Č������B";
		close;
	}
}

eclage.gat,283,275,4	script	�O���V�X	438,{
	switch(ECL_2QUE) {
	case 6:
		mes "[�O���V�X]";
		mes "���`��c�c�B";
		mes "�݂�Ȓx���ȁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̂��݂܂���c�c�B";
		next;
		mes "[�O���V�X]";
		mes "�͂��H";
		next;
		mes "[�O���V�X]";
		mes "�͂��`�c�c";
		next;
		mes "[�O���V�X]";
		mes "���́c�c";
		mes "���������͍̂���܂��c�c�B";
		emotion 16,"";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ⴂ�܂��B��������Ȃ��āc�c�B";
		emotion 4,"";
		next;
		mes "[�O���V�X]";
		mes "�͂��c�c�B";
		mes "���ɂ͂��t���������Ă����";
		mes "���܂�����c�c�B";
		next;
		mes "[�O���V�X]";
		mes "�������ĊO�ɏo���";
		mes "�������̔��e�̗��ɂȂ����j��";
		mes "����Ă���̂�ˁc�c�B";
		mes "������O�ɏo��̂͌��Ȃ̂Ɂc�c�B";
		mes "������������č߂Ȃ̂ˁB";
		mes "�����A�Ȃ�ĉ������Ȏ��c�c�B";
		emotion 6;
		emotion 19,"";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��������Ȃ��āc�c�B";
		mes "�t�H�����񂪓O��ŗ���Ȃ��Ǝv���̂�";
		mes "�����`���Ă���Ɓc�c�B";
		next;
		mes "[�O���V�X]";
		mes "�c�c";
		emotion 9;
		next;
		mes "[�O���V�X]";
		mes "���A�͂��c�c�B";
		next;
		mes "[�O���V�X]";
		mes "��������������肽���c�c�B";
		emotion 9;
		next;
		mes "[�O���V�X]";
		mes "�c�c������";
		mes "����͖{���ł����H";
		mes "�t�H��������Ȃ���ł����H";
		emotion 23;
		next;
		mes "[�O���V�X]";
		mes "�������̒a���������������Ȃ̂�";
		mes "����Ȃɂ݂�Ȃ��W�܂�Ȃ���";
		mes "�{���ɍň��̒a�����p�[�e�B��";
		mes "�Ȃ邩������܂���B";
		next;
		mes "[�O���V�X]";
		mes "�������̒a�����������";
		mes "�X�v�����f�B�b�h������ł���";
		mes "���b�u������̂Ɂc�c�B";
		mes "����A���������΃��b�u��";
		mes "�����ɍs�����̂�����B";
		emotion 23;
		next;
		mes "[�O���V�X]";
		mes "�����̉Ƃ̑O�ŏW�܂낤��";
		mes "�����Ă����̂ɁI";
		mes "���߂āA���Ȃ��Ȃ�O�ɉƂ̔���";
		mes "�J���Ă����Ă���Ȃ��ƁI";
		emotion 23;
		next;
		mes "[�O���V�X]";
		mes "���̗F�B�����邩���m��܂��񂩂�";
		mes "���͂����𓮂��܂���B";
		mes "�����`���җl���~�J���̂ւ��̂悤��";
		mes "�������Ă���d��������������";
		mes "�O���V�X���T���Ă����";
		mes "�`���Ă��������B";
		next;
		mes "[�O���V�X]";
		mes "�����āA���������J���Ă���Ȃ���";
		mes "�ւ�������Ă��܂��Ɠ`���Ă��������B";
		next;
		mes "[�e���[���A��]";
		mes "�킩�����I";
		mes "���̗��݁I";
		mes "�����͂ɂȂ��Ă��I";
		emotion 23;
		emotion 23,"";
		cutin "bu_du1",2;
		next;
		cutin "bu_du1",255;
		mes "["+strcharinfo(0)+"]";
		mes "�H�H�H";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����I�@���l�̘b��";
		mes "����Ɋ��荞�ނȂƌ���������I";
		cutin "bu_mark3",0;
		next;
		mes "[�e���[���A��]";
		mes "���������Ă���񂾁I";
		mes "�������K�v�Ȃ�ꏊ��I�΂���";
		mes "���ōs���̂��E�҂̎d�����I";
		cutin "bu_du2",2;
		next;
		mes "[�e���[���A��]";
		mes "�����āA���O�I";
		mes "����������悭�����";
		mes "�����̉���������ȁI";
		cutin "bu_du1",2;
		next;
		mes "[�e���[���A��]";
		mes "�悵�I�@���߂��I ";
		cutin "bu_du2",2;
		next;
		mes "[�e���[���A��]";
		mes "���i�͊ȒP�ɔF�߂��肵�Ȃ��񂾂���";
		mes "���O�͉��̃��C�o���Ƃ��ĔF�߂Ă��I";
		mes "����̏����́I";
		mes "�����ɂ���`�r�d���̃O���c�X��";
		mes "��`���̂��I";
		next;
		cutin "bu_du2",255;
		mes "[�O���V�X]";
		mes "�N���`�r�ł����c�c�B";
		mes "����ɖ��O��";
		mes "�Ԉ���Ă邶��Ȃ��c�c�B";
		emotion 6;
		next;
		mes "[�e���[���A��]";
		mes "�Ƃɂ����I";
		mes "��Ƀ��b�u�Ƃ������̂�";
		mes "�A��Ă��������������I";
		mes "�킩�����ȁI";
		cutin "bu_du2",2;
		next;
		mes "[�e���[���A��]";
		mes "�ł́I";
		mes "�~�J���̂ւ���T���ɏo�����I";
		mes "�݂�ȁA�s�����I";
		next;
		mes "[�H�H�H]";
		mes "�c�c�i�������j";
		cutin "bu_alp1",0;
		next;
		mes "[�H�H�H]";
		mes "�����Ȃ�l�̘b�Ɋ��荞�ނ̂�";
		mes "�ǂ����Ǝv���܂����ǁc�c";
		mes "�l�����ɂȂ�Ȃ�^���ł��I";
		cutin "bu_maggi2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�܂������c�c";
		mes "���O�Ȃ�Ől�̘b��";
		mes "�������Ƃ��Ȃ��񂾁B";
		cutin "bu_mark4",0;
		next;
		mes "[�H�H�H]";
		mes "���́A�}�[�N����B";
		mes "�e���[����ɍs�����Ⴂ�܂����c�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����c�c�B";
		mes "�d���Ȃ��A�����ǂ������邼�I";
		cutin "bu_mark3",0;
		next;
		cutin "bu_mark3",255;
		mes "[�O���V�X]";
		mes "�c�c�s���Ă��܂��܂����ˁB";
		mes "�܂��A�����ł��B";
		mes "�������b�u��A��Ă��ĉ������ˁB";
		viewpoint 2,283,275,0,0xFF0000;
		viewpoint 1,191,200,0,0xFF0000;
		set ECL_2QUE,7;
		chgquest 11315,11316;
		close;
	case 7:
		mes "[�O���V�X]";
		mes "���̗F�B�����邩���m��܂��񂩂�";
		mes "���͂����𓮂��܂���B";
		mes "�����`���җl���~�J���̂ւ��̂悤��";
		mes "�������Ă���d��������������";
		mes "�O���V�X���T���Ă����";
		mes "�`���Ă��������B";
		next;
		mes "[�O���V�X]";
		mes "�����āA���������J���Ă���Ȃ���";
		mes "�ւ�������Ă��܂��Ɠ`���Ă��������B";
		emotion 23;
		viewpoint 1,191,200,0,0xFF0000;
		close;
	case 8:
		mes "[�O���V�X]";
		mes "��c�c";
		mes "�������̍΂ł����H";
		next;
		mes "[�O���V�X]";
		mes "���`��A����30�΂��炢";
		mes "�����������Ǝv�����ǁc�c�B";
		emotion 20;
		next;
		menu "�ł́A�O���V�X�̍΂́H",-;
		mes "[�O���V�X]";
		mes "�����ɍ΂𕷂��͎̂���ł��I";
		mes "�~�����[�Ȃ烂�����̍΂�";
		mes "�킩�邩������܂��񂩂�";
		mes "�~�����[�ɕ����Ă��������B";
		emotion 23;
		next;
		mes "[�O���V�X]";
		mes "�~�����[�̓G�N���[�W���̍L��ɂ��܂��B";
		viewpoint 2,283,275,0,0xFF0000;
		viewpoint 1,299,309,0,0xFF0000;
		set ECL_2QUE,9;
		chgquest 11317,11318;
		close;
	case 9:
		mes "[�O���V�X]";
		mes "�����ɍ΂𕷂��͎̂���ł��I";
		mes "�~�����[�Ȃ烂�����̍΂�";
		mes "�킩�邩������܂��񂩂�";
		mes "�~�����[�ɕ����Ă��������B";
		emotion 23;
		next;
		mes "[�O���V�X]";
		mes "�~�����[�̓G�N���[�W���̍L��ɂ��܂��B";
		viewpoint 1,299,309,0,0xFF0000;
		close;
	case 10:
		mes "[�O���V�X]";
		mes "�V�����͊X�̓��̕��ɏZ��ł��܂��B";
		mes "���Ԃ�A�Ƃ̋߂��ɂ���͂��ł��B";
		viewpoint 1,265,166,0,0xFF0000;
		close;
	case 11:
		mes "[�O���V�X]";
		mes "�^�g�͊X�̐��ɂ��܂��B";
		viewpoint 1,137,169,0,0xFF0000;
		close;
	case 12:
		mes "[�O���V�X]";
		mes "�G�N���[�W���ɂ͉��l���Z��ł��܂��B";
		mes "�{���ɂ�����������ł���B";
		mes "�ӂӂ�";
		emotion 40;
		close;
	case 13:
		mes "[�O���V�X]";
		mes "���������΃t�H���ƃS�����̏���";
		mes "�s���Č��Ȃ��Ƃ����Ȃ��Ȃ̂Ɂc�c�B";
		mes "��ōs���Ă݂܂��B";
		close;
	case 14:
		mes "[�O���V�X]";
		mes "���I";
		mes "���̃��E�\�N��S�đ}�����߂ɂ�";
		mes "�ƂĂ��傫�ȃP�[�L���K�v�ł��ˁc�c�B";
		emotion 23;
		next;
		mes "[�O���V�X]";
		mes "���`��c�c";
		mes "�ł́A�݂�ȖZ�������Ȃ̂�";
		mes "�݂�Ȃ��W�߂�̂͒��߂�";
		mes "���̓��E�\�N�ɂ���������";
		mes "�P�[�L�ł��Ă��ɂ����܂��B";
		next;
		mes "[�O���V�X]";
		mes "���̓��������";
		mes "�������̉Ƃ�����̂�";
		mes "�����ق����������邩";
		mes "�����Ă��Ă��������B";
		next;
		mes "[�H�H�H]";
		mes "���[���I";
		next;
		mes "[�O���V�X]";
		mes "����A�N�����������Ɍ�������";
		mes "�����Ă��܂��ˁB";
		next;
		mes "[�O���V�X]";
		mes "���I�@���̐l�����́c�c�B";
		next;
		mes "[�e���[���A��]";
		mes "�`�r���삳��I";
		mes "�������b�u�Ƃ����z�������ė����I";
		emotion 23;
		emotion 23,"";
		cutin "bu_du2",2;
		next;
		mes "[�H�H�H]";
		mes "�͂��͂��c�c";
		mes "�e���[�A����̑�����c�c�B";
		cutin "bu_maggi4",0;
		next;
		mes "[�H�H�H]";
		mes "�c�c";
		cutin "bu_alp2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�͂��c�c";
		mes "�܂������b�u������������u��";
		mes "���b�u����������";
		mes "���肾���Ȃ�āc�c�B";
		cutin "bu_mark3",0;
		next;
		cutin "bu_mark3",255;
		mes "[�O���V�X]";
		mes "�c�c";
		emotion 9;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c";
		emotion 9,"";
		next;
		mes "[���b�u]";
		mes "�����A���̃o�J�́I";
		mes "�����I�������낹�I";
		cutin "war_y1",2;
		next;
		cutin "war_y1",255;
		mes "[�O���V�X]";
		mes "���̗F�B���ו��������Ȃ��ł����H";
		mes "����ɁA�����x���ł��I";
		emotion 6;
		next;
		mes "[�e���[���A��]";
		mes "��!?";
		mes "�������͓�l����Ȃ����I";
		mes "���̕����s�����I";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�������͎l�l�����c�c�B";
		cutin "bu_mark2",0;
		next;
		cutin "bu_mark2",255;
		mes "["+strcharinfo(0)+"]";
		mes "��l�H";
		emotion 1,"";
		next;
		mes "[�e���[���A��]";
		mes "���������Ă���񂾁B";
		mes "�s�s�̓������炠�̃`�r��";
		mes "�A��Ă�������B";
		cutin "bu_du1",2;
		next;
		cutin "bu_du1",255;
		mes "["+strcharinfo(0)+"]";
		mes "��!?";
		emotion 1,"";
		next;
		mes "[�e���[���A��]";
		mes "�����������ǉ������ɂ�";
		mes "�}�M�����邩�畉���Ȃ��I";
		mes "�}�M�͐�����������ȁI";
		cutin "bu_du3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�c�c";
		cutin "bu_maggi1",2;
		next;
		cutin "bu_maggi1",255;
		mes "[�H�H�H]";
		mes "�c�c";
		cutin "bu_oliver0",0;
		next;
		mes "[�H�H�H]";
		mes "�l��������H";
		emotion 23,"";
		cutin "bu_oliver3",0;
		next;
		mes "[�e���[���A��]";
		mes "���������Ă���񂾁I";
		mes "����Ȃɖڗ����𒅂Ă��邭���ɁB";
		mes "�ǂ��Ŕ������I";
		cutin "bu_du1",2;
		next;
		mes "[�H�H�H]";
		mes "���c�c�B";
		mes "�l�͌����Ȃ��Ǝv�����̂�";
		mes "������̂��ȁH";
		cutin "bu_oliver2",0;
		next;
		mes "[�e���[���A��]";
		mes "�����Ȃ��킯�Ȃ�����B";
		mes "�����̃A���v��������";
		mes "�N���[�L���O�ł��g���Ȃ�ʂ����ǁI";
		mes "�M���`���N���X�����������m��Ȃ�����";
		mes "�A���v�̓X�L�����g���Ă��Ȃ��Ă�";
		mes "�{���Ɍ����Ȃ��悤�ȋC������񂾁I";
		cutin "bu_du2",2;
		next;
		cutin "bu_du2",255;
		mes "[�O���V�X]";
		mes "�������݊����Ȃ���������Ȃ��H";
		emotion 9;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���������Ή�������";
		mes "������������c�c�B";
		mes "�������������c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�H�H�H]";
		mes "�����c�c";
		mes "����ȂɃ��A���Ȗ��͎n�߂Ă��c�c�B";
		cutin "bu_oliver2",0;
		next;
		mes "[�e���[���A��]";
		mes "��͂͂͂͂́I";
		mes "�������Ă��I";
		mes "�����A�܂�������";
		mes "���߂ĂȂ��݂��������I";
		mes "�{���ɉ����ȁI";
		mes "���������A��ĕ�������_�����H";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������Ă���񂾁I";
		mes "����ɐG��ȁI";
		cutin "bu_mark3",0;
		next;
		mes "[�I���o�[]";
		mes "�����`�����`�B";
		mes "����ɖl�̓`�r�ł��Ȃ��I";
		mes "�I���o�[�Ƃ������h�Ȗ��O������I";
		cutin "bu_oliver5",0;
		next;
		mes "[�e���[���A��]";
		mes "��������f��ꂽ�c�c�B";
		mes "�}�M�ƈꏏ�ɂ����";
		mes "����w�����͂��Ȃ̂ɁB";
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "�d���Ȃ��B";
		mes "��������T���ɍs�����I";
		mes "���x���������Ȃ�����ȁI";
		mes "�o���I";
		delitem 6555,128;
		set ECL_2QUE,15;
		chgquest 11323,11324;
		next;
		cutin "bu_du5",255;
		mes "[�O���V�X]";
		mes "���Ȃ̂����炠�̐l�����c�c�B";
		mes "���b�u�����̂܂ܘA��čs����";
		mes "���܂��Ă邶��Ȃ��c�c�B";
		emotion 4;
		next;
		mes "[�O���V�X]";
		mes "�܂��c�c����̓��b�u��";
		mes "���Ƃ�����ł��傤���ǁB";
		mes "�Ƃɂ����c�c���̓��������";
		mes "�������̉Ƃ�����̂�";
		mes "�����ق����������邩";
		mes "�����Ă��Ă���܂��񂩁H";
		viewpoint 2,283,275,0,0xFF0000;
		viewpoint 1,266,216,0,0xFF0000;
		close;
	case 15:
		mes "[�O���V�X]";
		mes "���Ȃ̂����炠�̐l�����c�c�B";
		mes "���b�u�����̂܂ܘA��čs����";
		mes "���܂��Ă邶��Ȃ��c�c�B";
		emotion 4;
		next;
		mes "[�O���V�X]";
		mes "�܂��c�c����̓��b�u��";
		mes "���Ƃ����邾�낤���ǁB";
		mes "�Ƃɂ����c�c���̓��������";
		mes "�������̉Ƃ�����̂�";
		mes "�����ق����������邩";
		mes "�����Ă��Ă���܂��񂩁H";
		close;
	case 16:
	case 17:
	case 18:
	case 19:
	case 20:
		mes "[�O���V�X]";
		mes "���`��A�N���[���̓`���R���������ȁH";
		mes "���N���[�����������ȁH";
		emotion 40;
		next;
		mes "�]�P�[�L���ɖ����ɂȂ��Ă���B";
		mes "�@�W���}�͂��Ȃ��悤�ɂ��悤�]";
		close;
	case 21:
		mes "[�O���V�X]";
		mes "���`��A�N���[���̓`���R���������ȁH";
		mes "���N���[�����������ȁH";
		emotion 40;
		next;
		mes "[�O���V�X]";
		mes "����A���A��Ȃ����B";
		mes "������������~�������Ă���̂�";
		mes "�킩��܂������H";
		next;
		mes "[�O���V�X]";
		mes "�c�c";
		emotion 9;
		next;
		mes "[�O���V�X]";
		mes "������!?";
		mes "����Ȓ��̓`��!?";
		mes "�������ƒm�荇����100�N�߂�����";
		mes "����Șb�͕��������ƂȂ���I";
		emotion 23;
		next;
		mes "[�O���V�X]";
		mes "�o���O�ɑ��ʃp�[�e�B��";
		mes "���Ȃ��Ƃ����Ȃ����c�c�B";
		mes "�����ɂł��o������Ȃ�";
		mes "�����~�߂Ȃ��ƁI";
		next;
		mes "[�O���V�X]";
		mes "����ȋ}�Ɂc�c";
		mes "���̓������̘b�����������Ă݂�̂�";
		mes "���b�u�ɂ����k���Ă݂Ă���܂��񂩁H";
		mes "�����T�����̂�����ƌ�����";
		mes "�Ƃɓ����Ă������̂�";
		mes "�܂����ɂ���͂��ł��B";
		emotion 19;
		viewpoint 2,283,275,0,0xFF0000;
		viewpoint 1,292,265,0,0xFF0000;
		set ECL_2QUE,22;
		chgquest 11330,11331;
		close;
	case 22:
		mes "[�O���V�X]";
		mes "�o���O�ɑ��ʃp�[�e�B��";
		mes "���Ȃ��Ƃ����Ȃ����c�c�B";
		mes "�����ɂł��o������Ȃ�";
		mes "�����~�߂Ȃ��ƁI";
		next;
		mes "[�O���V�X]";
		mes "����ȋ}�Ɂc";
		mes "���̓������̘b�����������Ă݂�̂�";
		mes "���b�u�ɂ����k���Ă݂Ă���܂��񂩁H";
		mes "�����T�����̂�����ƌ�����";
		mes "�Ƃɓ����Ă����̂�";
		mes "�܂����ɂ���͂��ł��B";
		emotion 19;
		close;
	case 23:
		mes "[�O���V�X]";
		mes "���������~�b�h�K���h�ɍs���̂�";
		mes "�����₵���ł��c�c�B";
		mes "���b�u���X�v�����f�B�b�h������";
		mes "�s����������ȋC���������̂Ɂc�c�B";
		next;
		mes "[�O���V�X]";
		mes "�܂��͂��y�Y��";
		mes "���𔃂��Ă��ĖႤ��";
		mes "���߂悤�Ǝv���܂��I";
		emotion 21;
		close;
	default:
		mes "[�O���V�X]";
		mes "���`��c�c�B";
		mes "�݂�Ȓx���ȁB";
		mes "�ŋ߁A�G�N���[�W���ɓ����ė���";
		mes "�l�̐l�������݂Ă�";
		mes "�Z�����̂͗\�z�ł��邯�ǁc�c�B";
		next;
		mes "[�O���V�X]";
		mes "���͂Ȃ�ŉɂȂ񂾂�c�c�B";
		mes "�ǂ����Ď������H";
		emotion 23;
		close;
	}
}

eclage.gat,191,200,4	script	���b�u	446,{
	switch(ECL_2QUE) {
	case 7:
		mes "�]�R�\�R�\�]";
		next;
		mes "�]�O���V�X���b���Ă����d���̂悤���]";
		next;
		mes "[���b�u]";
		mes "��H�@�N���I";
		emotion 23;
		cutin "war_y1",2;
		next;
		menu "�O���V�X�̘b��`����B",-;
		mes "[���b�u]";
		mes "�a�����̃��E�\�N�����ޗ���";
		mes "�����ɍs���ƌ������̂�";
		mes "��͂蕷���ĂȂ������悤���ȁB";
		mes "�����͋������Ă����";
		mes "���������Ȃ��Ȃ邩��ȁB";
		emotion 54;
		cutin "war_y3",2;
		next;
		mes "[���b�u]";
		mes "���������΃������͉��΂��������ȁB";
		mes "�I����132�΂�����";
		mes "�I�����͎Ⴉ�����Ǝv������";
		mes "�v���o���Ȃ��c�c�B";
		next;
		mes "[���b�u]";
		mes "�����A�O���V�X�̏��ɖ߂���";
		mes "�����J���Ă����ł�";
		mes "�������̍΂������Ă��Ă���Ȃ����H";
		viewpoint 2,191,200,0,0xFF0000;
		viewpoint 1,283,275,0,0xFF0000;
		set ECL_2QUE,8;
		chgquest 11316,11317;
		close2;
		cutin "war_y3",255;
		end;
	case 8:
		mes "[���b�u]";
		mes "���������΃������͉��΂��������ȁB";
		mes "�I����132�΂�����";
		mes "�I�����͎Ⴉ�����Ǝv������";
		mes "�v���o���Ȃ��c�c�B";
		next;
		mes "[���b�u]";
		mes "�����A�O���V�X�̏��ɖ߂���";
		mes "�����J���Ă����ł�";
		mes "�������̍΂������Ă��Ă���Ȃ����H";
		cutin "war_y3",2;
		viewpoint 2,191,200,0,0xFF0000;
		viewpoint 1,283,275,0,0xFF0000;
		close2;
		cutin "war_y3",255;
		end;
	case 9:
		mes "[���b�u]";
		mes "�~�����[�H";
		mes "�~�����[�̓G�N���[�W���̍L���";
		mes "����͂����B";
		cutin "war_y4",2;
		viewpoint 1,299,309,0,0xFF0000;
		close2;
		cutin "war_y4",255;
		end;
	case 10:
		mes "[���b�u]";
		mes "�V�����H";
		mes "�V�����͊X�̓����ɂ���͂����B";
		cutin "war_y4",2;
		viewpoint 1,265,166,0,0xFF0000;
		close2;
		cutin "war_y4",255;
		end;
	case 11:
		mes "[���b�u]";
		mes "�^�g�H";
		mes "�^�g�͊X�̐����ɂ���͂����B";
		cutin "war_y4",2;
		viewpoint 1,137,169,0,0xFF0000;
		close2;
		cutin "war_y4",255;
		end;
	case 12:
		mes "[���b�u]";
		mes "�͂�!?";
		mes "�݂�ȃ����������΂Ȃ̂�";
		mes "�m��Ȃ��̂�!?";
		emotion 23;
		cutin "war_y3",2;
		next;
		mes "[���b�u]";
		mes "���`��A����ł��݂�Ȃ���";
		mes "�������b���܂Ƃ߂Č���Ɓc�c�B";
		next;
		mes "[���b�u]";
		mes "132�΂̃I�����N����";
		mes "98�΂̃~�����[���N��B";
		mes "�O���V�X�Ƃ�30�Έ���āA";
		mes "�O���V�X�̓V������2�ΔN���B";
		mes "�V�����̓^�g���14�ΔN���";
		mes "�^�g��146�΂��Ƃ������Ƃ��ȁH";
		emotion 9;
		emotion 9,"";
		cutin "war_y2",2;
		next;
		mes "[���b�u]";
		mes "132 > ������";
		mes "������ > 98";
		mes " |������ - �O���V�X| = 30";
		mes "�O���V�X = �V���� - 2";
		mes "�V���� = �^�g + 14";
		mes "�^�g = 146";
		next;
		mes "[���b�u]";
		mes "���Ă��Ƃ���ȁH";
		mes "���ꂾ�Ɖ��΂ɂȂ�񂾁H";
		emotion 1;
		cutin "war_y3",2;
		next;
		input '@str$;
		if('@str$ != "128") {
			mes "[���b�u]";
			mes "��`�Ⴄ�񂶂�Ȃ����H";
			mes "�����Ɨǂ��l���Č���B";
			cutin "war_y2",2;
			close2;
			cutin "war_y2",255;
			end;
		}
		mes "[���b�u]";
		mes "�����I";
		mes "���ꂾ�I";
		mes "���A�v���o�����I";
		mes "�����������悤�ȋC������B";
		emotion 5;
		cutin "war_y4",2;
		next;
		mes "[���b�u]";
		mes "�܂胍�E�\�N��100�ȏ�";
		mes "���Ȃ��Ƃ����Ȃ��̂��c�c�B";
		emotion 16;
		cutin "war_y3",2;
		next;
		mes "[���b�u]";
		mes "���O�A�ɂȂ烍�E�\�N���Ɏg��";
		mes "�ق���̉�������W�߂ė��Ă����B";
		mes "�������Ă���ق���̉򂾂�����";
		mes "����Ȃ��񂾁B";
		mes "�������ȁc�c^FF00008��^000000�����";
		mes "����邩�ȁB";
		next;
		mes "[���b�u]";
		mes "�ق���̉�̓r�t���X�g�^���[�̒��ɂ���";
		mes "^FF0000�`�F�l��^000000��|���Ǝ�ɓ��邩��ȁB";
		mes "��낵�����񂾂��B";
		set ECL_2QUE,13;
		chgquest 11321,11322;
		close2;
		cutin "war_y3",255;
		end;
	case 13:
		if(countitem(6561) < 8) {
			mes "[���b�u]";
			mes "���O�A�ɂȂ烍�E�\�N���Ɏg��";
			mes "�ق���̉�������W�߂ė��Ă����B";
			mes "�������Ă���ق���̉򂾂�����";
			mes "����Ȃ��񂾁B";
			mes "�������ȁc�c^FF00008��^000000�����";
			mes "����邩�ȁB";
			cutin "war_y3",2;
			next;
			mes "[���b�u]";
			mes "�ق���̉�̓r�t���X�g�^���[�̒��ɂ���";
			mes "^FF0000�`�F�l��^000000��|���Ǝ�ɓ��邩��ȁB";
			mes "��낵�����񂾂��B";
			close2;
			cutin "war_y3",255;
			end;
		}
		mes "[���b�u]";
		mes "�ց[�I";
		mes "�����S���W�߂ė����̂��B";
		mes "�I�������E�\�N�̐c��";
		mes "�S�����I������Ƃ��낾�I";
		emotion 2;
		cutin "war_y4",2;
		next;
		if(checkitemblank() == 0) {
			mes "[���b�u]";
			mes "�����Ԃ�Ɖו��������ȁB";
			mes "�����ו������炵�Ă���";
			mes "�܂�������B";
			close2;
			cutin "war_y4",255;
			end;
		}
		delitem 6561,8;
		getitem 6555,128;
		set ECL_2QUE,14;
		chgquest 11322,11323;
		mes "[���b�u]";
		mes "�ق���̉���������Đc���h���ƁI";
		mes "�o���オ��I";
		next;
		mes "[���b�u]";
		mes "����őS���������I";
		mes "������O���V�X�ɓn���Ă���B";
		next;
		mes "[���b�u]";
		mes "���Ɓc�c";
		mes "��`���Ă��ꂽ���";
		mes "�I���̉Ƃ�݂��Ă���I";
		mes "�G�N���[�W���ɂ���Ԃ�";
		mes "�D���Ȃ����g���Ă��������B ";
		emotion 21;
		next;
		mes "[���b�u]";
		mes "�I���̓X�v�����f�B�b�h��";
		mes "�d�������Ă��邩��";
		mes "�G�N���[�W���ɖ߂��ė��邱�Ƃ�";
		mes "���Ȃ����ȁB";
		next;
		mes "[���b�u]";
		mes "�m���A���͌����������Ă���͂�������";
		mes "���O���O���V�X�Ƙb���Ă���Ԃ�";
		mes "�����J���Ă����Ă���B";
		mes "���Ⴀ�A���񂾂��B";
		viewpoint 2,191,200,0,0xFF0000;
		viewpoint 1,283,275,0,0xFF0000;
		viewpoint 1,292,265,1,0x00FF00;
		close2;
		cutin "war_y4",255;
		end;
	case 14:
		mes "[���b�u]";
		mes "�ǂ�������?!";
		mes "�������̃��E�\�N��";
		mes "�O���V�X�ɓn���Ă���B";
		viewpoint 1,283,275,0,0xFF0000;
		close2;
		cutin "war_y4",255;
		end;
	case 15:
	case 16:
	case 17:
		mes "[���b�u]";
		mes "���g�D���w�C���ɍs���Č������H";
		mes "�����͂ƂĂ��傫�ȋ��l������";
		mes "�Z��ł���񂾁B";
		cutin "war_y4",2;
		close2;
		cutin "war_y4",255;
		end;
	default:
		mes "�]�R�\�R�\�]";
		next;
		mes "�]���������Ă���B";
		mes "�@�W���}���Ȃ��悤�ɂ��悤�]";
		close;
	}
}

ecl_in01.gat,73,51,4	script	�~�����[	442,{
	switch(ECL_2QUE) {
	case 9:
		mes "[�~�����[]";
		mes "�������̍΂ł����H";
		mes "���m�ɂ͕�����܂��񂪁c�c�B";
		mes "�����͔N��ł���B";
		next;
		mes "[�~�����[]";
		mes "���̍΂ł����H";
		mes "����98�΂ł��B";
		next;
		mes "[�~�����[]";
		mes "�������I�@�V�����ɕ����Ă݂���";
		mes "�����邩������܂���B";
		next;
		mes "[�~�����[]";
		mes "�V�����̉Ƃ͊X�̓����̉��ɂ���܂��B";
		emotion 52;
		set ECL_2QUE,10;
		chgquest 11318,11319;
		close;
	case 10:
		mes "[�~�����[]";
		mes "�V�����̉Ƃ͊X�̓����̉��ɂ���܂��B";
		emotion 52;
		close;
	default:
		mes "[�~�����[]";
		mes "���`��c�c�����v���[���g�����";
		mes "�����Ɖ\����邩�ȁH";
		emotion 52;
		close;
	}
}

eclage.gat,265,166,4	script	�V����	443,{
	switch(ECL_2QUE) {
	case 10:
		mes "[�V����]";
		mes "�������̍΁H";
		mes "���`��A���΂��������낤�B";
		mes "�΂͐����Ȃ��Ȃ���";
		mes "���Ȃ莞�Ԃ��o���Ă��邩��B";
		mes "�O���V�X�������2��";
		mes "�Ⴉ�����̂͊o���Ă����B";
		emotion 20;
		next;
		mes "[�V����]";
		mes "������������c�c";
		mes "�^�g�Ȃ�o���Ă���񂶂�Ȃ����ȁH";
		next;
		mes "[�V����]";
		mes "�^�g�͊X�̐��ɏZ��ł��邩��";
		mes "�s���ĕ����Č��āB";
		viewpoint 1,137,169,0,0xFF0000;
		set ECL_2QUE,11;
		chgquest 11319,11320;
		close;
	case 11:
		mes "[�V����]";
		mes "�^�g�͊X�̐��ɏZ��ł��邩��";
		mes "�s���ĕ����Č��āB";
		viewpoint 1,137,169,0,0xFF0000;
		close;
	default:
		mes "[�V����]";
		mes "���t�B�l�͔��������C�����Ă邱�Ƃ�";
		mes "�����̖��������邭�炢�ɑ厖����";
		mes "�l���Ă���B";
		mes "�������t�B�l������";
		mes "�������ɂ��������Ȃ񂾁B";
		close;
	}
}

eclage.gat,137,169,4	script	�^�g	439,{
	switch(ECL_2QUE) {
	case 11:
		mes "[�^�g]";
		mes "����������̍΂ł����H";
		mes "���̓���������ƒ��ǂ��Ȃ����̂�";
		mes "�ŋ߂Ȃ̂ł悭�m��܂���B";
		next;
		mes "[�^�g]";
		mes "�ł��A�V�����̍΂Ȃ�킩��܂��I";
		mes "�����14�Ώ�Ȃ�ł���I";
		emotion 23;
		next;
		menu "�^�g�̍΂́H",-;
		mes "[�^�g]";
		mes "����146�΂ł��B";
		emotion 23,"";
		next;
		mes "�]�������̍΂ɑ΂���m���ȏ���";
		mes "�@���鎖�͂ł��Ȃ���������";
		mes "�@�܂��̓��b�u�̏��ɖ߂낤�]";
		viewpoint 2,137,169,0,0xFF0000;
		viewpoint 1,191,200,0,0xFF0000;
		set ECL_2QUE,12;
		chgquest 11320,11321;
		close;
	case 12:
		mes "�]�������̍΂ɑ΂���m���ȏ���";
		mes "�@���鎖�͂ł��Ȃ���������";
		mes "�@�܂��̓��b�u�̏��ɖ߂낤�]";
		viewpoint 1,191,200,0,0xFF0000;
		close;
	default:
		mes "[�^�g]";
		mes "�F�B���X�v�����f�B�b�h������";
		mes "�u�肵���ƌ����Ă��܂����B";
		mes "���g�D���w�C���͂ƂĂ������ꏊ����";
		mes "�����Ă���̂�";
		mes "���C�ɂ��Ă��邩�S�z�ł��B";
		close;
	}
}

eclage.gat,266,216,4	script	������	444,{
	switch(ECL_2QUE) {
	case 15:
		mes "[������]";
		mes "�G�N���[�W���͖{���ɏZ�݈Ղ��ꏊ���B";
		mes "�����Ԃ��炢�Ă��邵";
		mes "�C����g��������B";
		next;
		mes "[������]";
		mes "�����ɔ���������ꂽ";
		mes "�������̃��C�������";
		mes "���ꂱ���{���̃p���_�C�X�I";
		emotion 40;
		next;
		mes "[�I���o�[]";
		mes "���̊ۂ��Ƃ����C���Ă����̂��B";
		cutin "bu_oliver2",0;
		next;
		cutin "bu_oliver2",255;
		mes "[������]";
		mes "���C�͗��Ƃ����Ӗ��������Ă���B";
		mes "����Ƀ��t�B�l�ɂƂ���";
		mes "���C�͉ƈȏ�̈Ӗ���";
		mes "�����Ă����������c";
		next;
		mes "[������]";
		mes "�����ǁA���̐l���������Ă��ǂ��قǂ�";
		mes "�����̎��ԂƓw�͂𒍂����񂾃��C��";
		mes "���ǋU���ɉ߂��Ȃ��B";
		emotion 6;
		next;
		mes "[������]";
		mes "���Ƃ������O��������";
		mes "���̂悤�Ȏp�����Ă��邯��";
		mes "����͗�����Ȃ��񂾁I";
		mes "����͂����̗��̂悤��";
		mes "�����ɉ߂��Ȃ��I";
		emotion 23;
		next;
		mes "[������]";
		mes "�����āA�悭����ƌN�I";
		mes "���������ă~�b�h�K���h����";
		mes "�����̂�!?";
		next;
		if(select("������","�Ⴄ") == 2) {
			mes "[������]";
			mes "�������c�c�B";
			mes "�~�b�h�K���h���痈��";
			mes "�l�Ԃ̂悤�Ɍ���������";
			mes "���ԈႦ���悤���B";
			close;
		}
		mes "[������]";
		mes "��͂肻���Ȃ̂��I";
		mes "��������ƃ~�b�h�K���h��";
		mes "�Z��ł���Ƃ����`���̒��Ɋւ���";
		mes "�m���Ă��邩�H";
		next;
		mes "[������]";
		mes "�ǂ�������b�𕷂����Ă���Ȃ����H";
		mes "���Ԃ̂��鎞�ō\��Ȃ�����";
		mes "������x�A���ɘb�������Ă���I";
		set ECL_2QUE,16;
		chgquest 11324,11325;
		close;
	case 16:
		mes "[������]";
		mes "������ӂ̖`���҂���";
		mes "�������������b�����ǁB";
		mes "�\�ɂ��ƃ~�b�h�K���h�ɂ�";
		mes "�Ƃ��炢�̗����Y�߂�قǂ�";
		mes "����Ȓ��̓`��������ƕ������񂾁B";
		next;
		mes "[������]";
		mes "���̓`�������߂ĕ���������";
		mes "�Q�鎖���ł��Ȃ��ق�";
		mes "�������Ă�����B";
		next;
		mes "[������]";
		mes "�����ǁA���Ԃ��o���č΂��d�˂��";
		mes "����Ȃ��Ƃ͏��X�ɖY��Ă��܂�����B";
		mes "�c������̖��Ȃ�Ă���Ȃ��̂���H ";
		emotion 28;
		next;
		mes "[������]";
		mes "�������A�~�b�h�K���h����";
		mes "�����Ƃ݂���`���҂�����ȉH��";
		mes "�����Ă����Ƃ����b��";
		mes "�L��ŉ�����l�ɕ������񂾁B";
		next;
		mes "[������]";
		mes "���̘b�𕷂����ォ��";
		mes "�d������ɂ��Ȃ��񂾂�B";
		mes "��͂�A���̓`���͖{���������̂��ȁH";
		emotion 54;
		next;
		mes "[������]";
		mes "���������Ƃ��̘b�𕷂���";
		mes "�����ɊX������Ă݂�����";
		mes "����ȉH���������l��";
		mes "�����邱�Ƃ͂ł��Ȃ������c�c�B";
		next;
		mes "[������]";
		mes "�N�͊m���A���̂ق�������";
		mes "�����ɗ����񂾂����ˁB";
		mes "�����������̒a����������ȁB";
		mes "�����炭�F�l�̒N���ɗ��܂��";
		mes "�����ɗ����̂��낤���c�c�B";
		next;
		mes "[������]";
		mes "���������̂Ƃ���c�O�����ǁA";
		mes "���̎��͑��݂��邩���킩��Ȃ�";
		mes "�`���̒��̗��ɂ����������Ȃ��񂾁B";
		next;
		mes "[������]";
		mes "�����āA����̓v���[���g�ł͂Ȃ�";
		mes "�����̗͂Ŏ�ɓ��ꂽ���Ǝv���Ă���B";
		mes "�����A�`�����{���Ȃ��";
		mes "�������ɂł��~�b�h�K���h�嗤��";
		mes "�������肾�B";
		next;
		mes "[������]";
		mes "������A�F�l�����ɂ�";
		mes "�������ɉ������Ă�����";
		mes "����ŏ\�����Ɠ`���Ă���Ȃ����B";
		next;
		mes "[������]";
		mes "���ǁA��Ȃ����Ƃ�";
		mes "�^����m��̂������|���B";
		mes "�������b���R��������Ǝv����";
		mes "�������S�����Ȃ��񂾁B";
		emotion 16;
		next;
		mes "[�H�H�H]";
		mes "���͂͂́I";
		mes "�b�͕������Ė�����I";
		next;
		mes "�]���̂�����֐U��Ԃ��";
		mes "�@�e���[���A���B�̎p���������]";
		next;
		mes "[�e���[���A��]";
		mes "�������A���������́I";
		mes "�j�Ȃ�����ȁI";
		mes "���X�Ɨ����������āI";
		mes "�����Đ키�񂾁I";
		emotion 23;
		emotion 23,"";
		cutin "bu_du2",2;
		next;
		cutin "bu_du2",255;
		mes "[������]";
		mes "�키�c�c�B";
		emotion 9;
		next;
		mes "[�e���[���A��]";
		mes "�����A�{���̎���m��̂��|���Ȃ�";
		mes "�������̍L��ɂ�����";
		mes "�b�𕷂��Ă���m�点�Ă��I";
		mes "�������A���̓`�����R��������";
		mes "����Ȃ�����S�z����ȁI";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�Ȃ��A���ނ���";
		mes "���ɂł����˂����ނ̂�";
		mes "�T���Ă���Ȃ����c�c�B";
		cutin "bu_mark3",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�������A�������̂悤�ȓ`����";
		mes "���������Ƃ͂Ȃ��ł��ˁB";
		mes "�m���ɕ��ʂ̃��t�B�l�Ȃ�";
		mes "�������̂悤�ȑ債�����ƂȂ����ł�";
		mes "����Ɋ����邩������܂��񂪁c�c�B";
		cutin "bu_mark1",0;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�������������ƂȂ��ł��B";
		mes "����Ȃɋ���Ȓ��Ȃ��";
		mes "�{���ɂ����ł��傤���H";
		cutin "bu_maggi1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�����A�~�b�h�K���h�嗤�͍L���B";
		mes "�����������������ƂȂ��`����";
		mes "����̂��������c�c�B";
		cutin "bu_alp3",2;
		next;
		mes "[�e���[���A��]";
		mes "��͂�L��Řb��";
		mes "�����Ă݂邵���Ȃ��ȁI";
		cutin "bu_du1",2;
		next;
		mes "[�e���[���A��]";
		mes "�悵�A���ꂶ�Ⴀ";
		mes "�����c�c";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c";
		cutin "bu_mark3",0;
		next;
		mes "[�e���[���A��]";
		mes "�c�c�Ǝv��������";
		mes strcharinfo(0)+ "�I";
		mes "����͂��O�ɂ��Ă������I";
		mes "���O�̎��͂��m���߂Ă��I";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������ł����܂���B";
		mes "�ז��͂��Ȃ��悤�ɂ��܂��̂�";
		mes "��낵�����肢���܂��B";
		cutin "bu_mark1",0;
		next;
		mes "[�}�M�X�e�B��]";
		mes strcharinfo(0)+ "����";
		mes "�܂��͍L��ɍs����";
		mes "�b�𕷂��Ă݂܂��傤�B";
		cutin "bu_maggi2",2;
		next;
		mes "[������]";
		mes "�b�𕷂����Ă��ꂽ�l��";
		mes "�����L��ɂ���I�[�u�̋߂���";
		mes "�v���o�ɂӂ����Ă��邩��";
		mes "�����ɂ킩��Ǝv����B";
		cutin "bu_maggi2",255;
		viewpoint 2,266,216,0,0xFF0000;
		viewpoint 1,299,309,0,0xFF0000;
		set ECL_2QUE,17;
		chgquest 11325,11326;
		close;
	case 17:
		mes "[������]";
		mes "�����������b�͉R�������̂���";
		mes "�����Y���ꂽ�`�����Ǝv���Ă�������";
		mes "���͎����Ȃ̂��R�Ȃ̂�";
		mes "�^����m��̂������|���B";
		next;
		mes "[�e���[���A��]";
		mes "�����L��ɍs����";
		mes "���������b�𕷂��Ă݂悤���I";
		cutin "bu_du1",2;
		viewpoint 1,299,309,0,0xFF0000;
		close2;
		cutin "bu_du1",255;
		end;
	case 18:
	case 19:
		mes "[������]";
		mes "�����������b�͉R�������̂���";
		mes "�����Y���ꂽ�`�����Ǝv���Ă�������";
		mes "���͎����Ȃ̂��R�Ȃ̂�";
		mes "�^����m��̂������|���B";
		close;
	case 20:
		mes "[������]";
		mes "����͖{���Ȃ̂��H";
		mes "����Ȓ��̓`�����^���������Ƃ́c�c�B";
		next;
		mes "[������]";
		mes "�c�c";
		mes "���̂܂܂ł̓_�����B";
		mes "�����ו�����������";
		mes "�~�b�h�K���h�֗��ɏo��I";
		next;
		mes "�]�������������ɂł����ɏo��C��";
		mes "�@�O���V�X�ɒm�点�Ă������ق���";
		mes "�@�ǂ��������]";
		viewpoint 1,283,275,0,0xFF0000;
		set ECL_2QUE,21;
		chgquest 11329,11330;
		close;
	case 21:
		mes "[������]";
		mes "����͖{���Ȃ̂��H";
		mes "����Ȓ��̓`�����^���������Ƃ́c�c�B";
		emotion 38;
		next;
		mes "[������]";
		mes "�c�c";
		mes "���̂܂܂ł̓_�����B";
		mes "�����ו�����������";
		mes "�~�b�h�K���h�֗��ɏo��I";
		emotion 23;
		emotion 23,"";
		next;
		mes "�]�������������ɂł����ɏo��C��";
		mes "�@�O���V�X�ɒm�点�Ă������ق���";
		mes "�@�ǂ��������]";
		viewpoint 1,283,275,0,0xFF0000;
		close;
	case 22:
	case 23:
		mes "[������]";
		mes "�F�B�ƒa�����p�[�e�B��";
		mes "���ʉ���I�������";
		mes "�~�b�h�K���h�ɗ������肾�B";
		next;
		mes "[������]";
		mes "�F�B�ɉ��������";
		mes "�Ȃ�ׂ������߂��ė����B";
		close;
	default:
		mes "[������]";
		mes "�G�N���[�W���͖{���ɏZ�݈Ղ��ꏊ���B";
		mes "�����Ԃ��炢�Ă��邵";
		mes "�C����g��������B";
		next;
		mes "[������]";
		mes "�����ɔ���������ꂽ";
		mes "�������̃��C�������";
		mes "���ꂱ���{���̃p���_�C�X�I";
		next;
		mes "[������]";
		mes "���C�͗��Ƃ����Ӗ��������Ă���B";
		mes "����Ƀ��t�B�l�ɂƂ���";
		mes "���C�͉ƈȏ�̈Ӗ���";
		mes "�����Ă����������c�c";
		emotion 40;
		close;
	}
}

ecl_in01.gat,60,71,4	script	�v���o�ɂӂ��郉�t�B�l	443,{
	switch(ECL_2QUE) {
	case 17:
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ӂӂ�";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ŋ߂͕ς�������q����";
		mes "�������ȁc�c�B";
		mes "�ِ͈̂��E�ɍs�����߂ɂ�";
		mes "���������Ȃ���΂Ȃ�Ȃ������̂ɁB";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "���͎����̋��ԂƂ������̂�";
		mes "�{���Ɋy�ɂȂ��Ă���B";
		mes "����ɓ]���Ƃ����̂��g����";
		mes "���ōs���`����";
		mes "���̃��}��������񂾁c�c�B";
		emotion 32;
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ŋ߂̖`���҂͂�����̗���";
		mes "�ǂ�Ȗ������킩��Ȃ����낤�B";
		emotion 32;
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�[���s�[���W�߂ăc���M��";
		mes "�����Ă����̂�����̂悤���B";
		mes "����Ȃɑ厖�ɂ��Ă����c���M��";
		mes "���͎g���邱�Ƃ��Ȃ�";
		mes "�q�ɂɂ��܂��Ă���B";
		emotion 28;
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "���Ԃ͖{���ɂ͂��Ȃ������ȁc�c�B";
		mes "����Ȃɂ͂��Ȃ��Ƃ킩���Ă�����";
		mes "���̎��ɂ��������c�c�B";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�����̌N�c�c�B";
		mes "���C�g�X�e���_�[�h�Ƃ���";
		mes "�p�Y��m���Ă��邩�H";
		next;
		switch(select("������Ȃ�","�m���Ă���")) {
		case 1:
			mes "[�v���o�ɂӂ��郉�t�B�l]";
			mes "�ӂӂӂӁc�c�B";
			mes "�ŋ߂̖`���҂��m��킯�Ȃ���";
			mes "���Ȃ�̂̉p�Y������ȁc�c�B";
			mes "���͂قƂ�ǖY����Ă���̂����ȁB";
			break;
		case 2:
			mes "[�v���o�ɂӂ��郉�t�B�l]";
			mes "�ӂӂӂӁc�c�B";
			mes "�ŋ߂̖`���҂��ނ�m���Ă���Ƃ�";
			mes "�s�v�c���ȁc�c";
			mes "���͂قƂ�ǖY����Ă����";
			mes "�v���Ă������B";
			break;
		}
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ނ͏㋉���t�B�l�ł��Ȃ�";
		mes "�����ȑ̂łƂĂ��傫�ȉ���������";
		mes "����ď��������B";
		mes "�`���Ƃ͔ނ̂��߂ɂ���";
		mes "���t�̂悤�������B";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ނ̕��E�`�͏����Ȏq�������܂�";
		mes "�̂ɂ��Ă��܂��قǗL���������B";
		mes "�����A���O�i���N���߂���";
		mes "���a������Ɣނ�";
		mes "�ˑR���ނ��Ă��܂�����B";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�����āA�u���Ԃɐl�X����";
		mes "�Y����Ă��܂����c�c�B";
		mes "�ނ͋��͂ȗ͂Ƒf���炵���m����";
		mes "�����Ă����B";
		mes "�����A�ނɂ͑���Ȃ������������B";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ނɑ���Ȃ���������";
		mes "�����킩�邩�ˁH";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "���̂悤�ȗF�B����c�c�B";
		mes "�ނ̂��΂Ɏ��̂悤��";
		mes "�M������F�������Ȃ�c�c�B";
		next;
		mes "[�e���[���A��]";
		mes "�Ƃ���ŁA���񂽂�";
		mes "�~�b�h�K���h�ɐ������Ă���Ƃ���";
		mes "�傫�Ȓ��̓`����m��Ȃ����H";
		emotion 23,"";
		cutin "bu_du1",2;
		next;
		cutin "bu_du1",255;
		mes "�]�e���[���A���̂��킪�Ȃ��]��";
		mes "�@���߂Ă��肪�����������]";
		emotion 40,"";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ق��A�����";
		mes "�~�b�h�K���h�嗤�̋��咹��";
		mes "�ւ���`���̂��Ƃ��H";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "����Ȃ炱�̃G�N���[�W���̒���";
		mes "�����ڂ����҂͂��Ȃ����낤�B";
		emotion 52;
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "���C�g�X�e���_�[�h��";
		mes "�~�b�h�K���h�嗤�ɓ�������";
		mes "�Ԃ��Ȃ����̘b���B";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ނ̓~�b�h�K���h�嗤�ɍs���O�ɂ�";
		mes "�����Ԗ`�������Ă������A";
		mes "����قǂ̑傫�Ȓ���";
		mes "���߂Ă݂��ƌ����Ă����B";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "���͎��������܂ŋ���Ȓ���";
		mes "����Ƃ͍l�����Ȃ������B";
		mes "���̊O�ɎU��ɍs��������";
		mes "���̓����łƂĂ��傫�ȉH��";
		mes "�����Ă��闷�l������܂ł́c�c�B";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "���̉H��������";
		mes "���C�g�X�e���_�[�h���b���Ă����b��";
		mes "�S�Ė{���������ƁB";
		next;
		mes "[�e���[���A��]";
		mes "���`��c�c�B";
		mes "���������������X�̒��ł�";
		mes "���Ȃ������ƌ����Ă�������A";
		mes "�܂��O�ɂ���̂��H";
		cutin "bu_du1",2;
		next;
		mes "[�e���[���A��]";
		mes "�}���ōs���Ă݂悤�I";
		cutin "bu_du2",2;
		next;
		cutin "bu_du2",255;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�����s���̂��I";
		mes "�܂��~�b�h�K���h�ŏo�����";
		mes "�ǂ�ȋ������󂷉��l�Ɋւ���";
		mes "�b�����ĂȂ��̂ɁI";
		emotion 23;
		next;
		mes "[�e���[���A��]";
		mes "����͂܂���ŕ����ɗ����I";
		cutin "bu_du2",2;
		set ECL_2QUE,18;
		chgquest 11326,11327;
		close2;
		cutin "bu_du2",255;
		end;
	case 18:
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ق��A�l�����ς�����̂��H";
		mes "�ł́A���C�g�X�e���_�[�h��";
		mes "���ɂ����b���Ă��ꂽ�A";
		mes "�~�b�h�K���h�̐[���X�̒��ŏo�����";
		mes "��΂�H�ׂ�����ɂ���";
		mes "�b���Ă��I";
		next;
		mes "[�}�M�X�e�B��]";
		mes "���́c�c";
		mes "�e���[����ɑ�����";
		mes "�s�����Ⴂ�܂�����B";
		mes "��l�ōs������Ƃ܂�����";
		mes "�����N���������c�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���̓����Ɍ������Ȃ�";
		mes "�e���[���󂵂�����ʂ�Ȃ���";
		mes "�����Ȃ����ǁc�c";
		mes "���������Ă邩�Ȃ��H";
		close2;
		cutin "bu_maggi3",255;
		end;
	default:
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�قق�";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ŋ߂͕ς�������q����";
		mes "�������ȁc�c�B";
		mes "�ِ͈̂��E�ɍs�����߂ɂ�";
		mes "���������Ȃ���΂Ȃ�Ȃ������̂ɁB";
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "���͎����̋��ԂƂ������̂�";
		mes "�{���Ɋy�ɂȂ��Ă���B";
		mes "����ɓ]���Ƃ����̂��g����";
		mes "���ōs���`����";
		mes "���̃��}��������񂾁c�c�B";
		emotion 32;
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�ŋ߂̖`���҂͂�����̗���";
		mes "�ǂ�Ȗ������킩��Ȃ����낤�B";
		emotion 32;
		next;
		mes "[�v���o�ɂӂ��郉�t�B�l]";
		mes "�[���s�[���W�߂ăc���M��";
		mes "�����Ă����̂�����̂悤���B";
		mes "����Ȃɑ厖�ɂ��Ă����c���M��";
		mes "���͎g���邱�Ƃ��Ȃ�";
		mes "�q�ɂɂ��܂��Ă���B";
		emotion 28;
		close;
	}
}

ecl_fild01.gat,97,315,4	script	���l	732,{
	switch(ECL_2QUE) {
	case 18:
		mes "[���l]";
		mes "�N���H";
		mes "���߂Ă݂�炾����";
		next;
		mes "[���l]";
		mes "���������Ă܂��A�H�ɂ���";
		mes "�����ɗ����̂��H";
		mes "�����̑����i�Ȃ񂾂�";
		mes "�݂�Ȃǂ������񂾁H";
		emotion 52;
		next;
		mes "[���l]";
		mes "�����Ă��炤����Ȃ�";
		mes "��߂Ƃ�������������B";
		mes "�����痊�܂�Ă�����C�͂Ȃ�����B";
		next;
		mes "[���l]";
		mes "���̉H�́A�N�炪�v���Ă���悤��";
		mes "���ʂ̉H�ł͂Ȃ��B";
		next;
		mes "[���l]";
		mes "�������c�c�B";
		mes "�܂��A��������قǂ�";
		mes "���Ƃ���Ȃ��񂾂��c�c�B";
		next;
		mes "[���l]";
		mes "���̃A�[���u�w�C���ɗ��ĊԂ��Ȃ�����";
		mes "����Ȑ����z�Əo������̂�";
		mes "�^�������񂾂낤�ȁB";
		next;
		mes "[���l]";
		mes "�����͖{���ɐ��������B";
		mes "���̋���Ȑg�̂𓮂���������";
		mes "�H�������Ă����̂�����B";
		next;
		mes "[���l]";
		mes "�����A���̒��x�Œ��߂鎄�ł͂Ȃ��I";
		mes "�v���Ζ{���ɒ����퓬��������B";
		emotion 40;
		next;
		mes "[�e���[���A��]";
		mes "���������ȁA�������̕������b�ł�";
		mes "�~�b�h�K���h�嗤�Ō�����";
		mes "�����Ă����ǁH";
		emotion 23;
		cutin "bu_du1",2;
		next;
		cutin "bu_du1",255;
		mes "[���l]";
		mes "�͂�!?";
		mes "���A����Ȃ͂��́c�c";
		mes "���͊m���ɃA�[���u�w�C���Ō����B";
		emotion 19;
		next;
		mes "[���l]";
		mes "����Ȃ��̂܂Ō����悤�Ƃ�";
		mes "�l���Ă��Ȃ��������ǁA";
		mes "���̉��䂪���̏؋����B";
		mes "�{���ɐ����������Ă�";
		mes "�퓬���������B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "��c�c�B";
		mes "�����ŋ߂̐퓬�ł̉���Ƃ��Ă�";
		mes "���Ȃ�Â����̂Ɍ����܂��ˁB";
		mes "����ɉ���������";
		mes "���@�Ŏ��Â������̂ɂ�";
		mes "�����Ȃ����c�c�B";
		emotion 23;
		cutin "bu_mark4",0;
		next;
		cutin "bu_mark4",255;
		mes "[���l]";
		mes "�������I";
		mes "���A�l���Č�����ŋ߂ł͂Ȃ�";
		mes "���Ȃ�O�̂��Ƃ������悤�ȁB";
		mes "�험�i�����܂�ɂ�������";
		mes "�S���o����̂��������ȁI";
		emotion 19;
		next;
		mes "[�I���o�[]";
		mes "�����ǁA�܂��G�N���[�W���ɂ����ꂸ��";
		mes "�����ɋ���N�������ǂ�����";
		mes "���̒n��ɍs�����́H";
		emotion 23;
		cutin "bu_oliver2",0;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���̋߂��Ɍ���Ă����Ȃ�";
		mes "�����̐l���������Ė���";
		mes "�킯���Ȃ�����Ȃ��c�c�B";
		emotion 23;
		cutin "bu_maggi1",2;
		next;
		cutin "bu_maggi1",255;
		mes "[���l]";
		mes "�����I�@���̒ʂ肾�I";
		emotion 19;
		next;
		mes "[���l]";
		mes "�����ِ��E�ɗ����̂�";
		mes "���񂪏��߂Ăł͂Ȃ��B";
		mes "�ȑO�A���Ԃ̒������i��ł��鎞��";
		mes "���܂��ܑ��̒n��ɂ��������Ƃ�����B";
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�������̉H�B";
		mes "�悭����Ɖ����������ȁB";
		emotion 23;
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "������蕨�̂悤�ȋC�����Ȃ����H";
		emotion 23;
		cutin "bu_alp4",2;
		next;
		cutin "bu_alp4",255;
		mes "[���l]";
		mes "������!?";
		mes "�������I�@�����Č���I";
		mes "����A�{�����I";
		mes "���̔L�c�c";
		mes "���ɋU���𔄂�₪������!?";
		emotion 23;
		next;
		mes "[�e���[���A��]";
		mes "���c�c�������񂾂ȁH";
		emotion 9,"";
		cutin "bu_du2",2;
		next;
		mes "[�I���o�[]";
		mes "�������ˁH";
		cutin "bu_oliver5",0;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�������Ƃ��Ă�";
		mes "�f���炵���r���ȁB";
		mes "�����܂Ŗ{���炵�����Ƃ́B";
		cutin "bu_alp1",2;
		next;
		cutin "bu_alp1",255;
		mes "[���l]";
		mes "�c�c";
		mes "�������͍��������o����";
		mes "�������̂ɁI";
		emotion 23;
		next;
		mes "[���l]";
		mes "�����A�N������";
		mes "�G�N���[�W���ɓ�����ȁH";
		mes "���ɂ���𔄂����L���l��";
		mes "�L��ŏ��������Ă���B";
		next;
		mes "[���l]";
		mes "���������̋��������ē�����c�c";
		mes "����c�c�B";
		mes "���̔�Q�҂��o��O��";
		mes "�߂܂��Ă���I";
		next;
		mes "[���l]";
		mes "���̎����G�N���[�W���ɓ���܂ŁI";
		mes "���ށI";
		mes "���肢���I";
		emotion 28;
		set ECL_2QUE,19;
		chgquest 11327,11328;
		close;
	case 19:
		mes "[���l]";
		mes "�����A�N������";
		mes "�G�N���[�W���ɓ�����ȁH";
		mes "���ɂ���𔄂����L���l��";
		mes "�L��ŏ��������Ă���B";
		next;
		mes "[���l]";
		mes "���������̋��������ē�����c�c";
		mes "����c�c�B";
		mes "���̔�Q�҂��o��O��";
		mes "�߂܂��Ă���I";
		next;
		mes "[���l]";
		mes "���̎����G�N���[�W���ɓ���܂ŁI";
		mes "���ށI";
		mes "���肢���I";
		emotion 28;
		close;
	case 20:
		mes "[���l]";
		mes "�����A���̋��c�c�B";
		mes "�U���������Ƃ́c�c�B";
		mes "�����c�c�B";
		emotion 28;
		close;
	default:
		mes "[���l]";
		mes "�N���H";
		mes "���߂Ă݂�炾����";
		next;
		mes "[���l]";
		mes "���������Ă܂��A�H�ɂ���";
		mes "�����ɗ����̂��H";
		mes "�����̑����i�Ȃ񂾂�";
		mes "�݂�Ȃǂ������񂾁H";
		next;
		mes "[���l]";
		mes "�����Ă��炤����Ȃ�";
		mes "��߂Ƃ�������������B";
		mes "�����痊�܂�Ă�����C�͂Ȃ�����B";
		next;
		mes "[���l]";
		mes "���̉H�́A�N�炪�v���Ă���悤��";
		mes "���ʂ̉H�ł͂Ȃ��B";
		close;
	}
}

ecl_in01.gat,70,88,4	script	�s���l	495,{
	switch(ECL_2QUE) {
	case 19:
		mes "[�s���l]";
		mes "�ɂ��H";
		mes "����ɂ��ɂ�`��";
		mes "�����`���̕󂠂�ɂ��B";
		mes "���Ă݂�ɂ��B";
		mes "��������ɂ�`��";
		next;
		menu "�H�ɂ��Ęb��",-;
		mes "[�s���l]";
		mes "�ɂ�ɂ�!?";
		mes "�H����蕨�ɂ�!?";
		mes "����Ȃ��ƂȂ��ɂ��I";
		mes "�{�����ɂ��I";
		emotion 23;
		next;
		mes "[�s���l]";
		mes "����͊m���Ƀ~�b�h�K���h��";
		mes "��ɓ��ꂽ�����ɂ��B";
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���̂��ɂ͂��̕������c�c�B";
		cutin "bu_alp1",2;
		next;
		cutin "bu_alp1",255;
		mes "[�s���l]";
		mes "�ɂ�ɂ��I";
		mes "���c�c�����ɋC���t���Ƃ͂ɂ��c�c�B";
		emotion 23;
		next;
		mes "[�s���l]";
		mes "���́c�c�B";
		mes "���̉H�����̉H�Ȃ͖̂{���ɂ��B";
		mes "�����ǎ��������������ɂ��c�c�B";
		next;
		mes "[�s���l]";
		mes "���܂�ɂ��傫���Ď��������Ȃ�����";
		mes "�������؂����ɂ��B";
		mes "��������΂�������̐l�ɔ����";
		mes "�������ƍl�����ɂ��I";
		mes "�����ǁA�`�����������Ȃ�������";
		mes "����������ꂽ�ɂ��B";
		next;
		mes "[�}�M�X�e�B��]";
		mes "�؂����H";
		mes "�Ȃ�A���͂ǂ̂��炢";
		mes "�傫���H�������́H";
		cutin "bu_maggi2",2;
		next;
		cutin "bu_maggi2",255;
		mes "[�s���l]";
		mes "��c�c�B";
		mes "�������炠�����܂ł�";
		mes "�����������ɂ��B";
		next;
		mes "[�s���l]";
		mes "��������������̂�";
		mes "�����ɂ��c�c�B";
		next;
		mes "[�e���[���A��]";
		mes "�����I";
		mes "���̂��炢�Ȃ�P�̗���";
		mes "�������Ă�������ȁI";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����͖������Ǝv�����ǁc�c";
		mes "�Ƃɂ�������������ɓ��ꂽ����";
		mes "����������ɒm�点�Ă���������";
		mes "�悳�������ˁB";
		cutin "bu_mark1",0;
		set ECL_2QUE,20;
		chgquest 11328,11329;
		close2;
		cutin "bu_mark1",255;
		end;
	case 20:
		mes "[�}�[�N�C�V��]";
		mes "�Ƃɂ�������������ɓ��ꂽ����";
		mes "����������ɒm�点�Ă���������";
		mes "�悳�������ˁB";
		cutin "bu_mark1",0;
		close2;
		cutin "bu_mark1",255;
		end;
	default:
		mes "[�s���l]";
		mes "�ɂ��H";
		mes "����ɂ��ɂ�`��";
		mes "�����`���̕󂠂�ɂ��B";
		mes "���Ă݂�ɂ��B";
		mes "��������ɂ�`��";
		close;
	}
}

eclage.gat,292,266,4	script	#���b�u�̉�	844,{
	if(ECL_2QUE < 15) {
		mes "�]�����܂��Ă���悤���]";
		close;
	}
	mes "�]���b�u�̉Ƃ��]";
	next;
	if(select("���b�u�̉Ƃɓ���Ȃ�","���b�u�̉Ƃɓ���") == 1) {
		mes "�]���Ȃ��̓��b�u�̉Ƃ���ɂ����]";
		close;
	}
	mes "�]���b�u�̉Ƃɓ���܂��]";
	close2;
	if(ECL_2QUE < 27)
		warp "ecl_in04.gat",180,226;
	else
		warp "ecl_in04.gat",226,232;
	end;
OnInit:
	waitingroom "���b�u�̉�",0;
	end;
}

ecl_in04.gat,181,222,4	script	���b�u�̉Əo��	844,{
	mes "�]���b�u�̉Ƃ̌��ւ��]";
	next;
	if(select("���b�u�̉Ƃ���o�Ȃ�","���b�u�̉Ƃ���o��") == 1) {
		mes "�]�������������ɂ��邱�Ƃɂ����]";
		close;
	}
	mes "�]�O�ɏo�܂��]";
	close2;
	warp "eclage.gat",289,260;
	end;
}

ecl_in04.gat,222,232,4	script	���b�u�̉Əo��	844,{
	mes "�]���b�u�̉Ƃ̌��ւ��]";
	next;
	if(select("���b�u�̉Ƃ���o�Ȃ�","���b�u�̉Ƃ���o��") == 1) {
		mes "�]�������������ɂ��邱�Ƃɂ����]";
		close;
	}
	mes "�]�O�ɏo�܂��]";
	close2;
	warp "eclage.gat",289,260;
	end;
}

ecl_in04.gat,182,224,4	script	���b�u	446,{
	switch(ECL_2QUE) {
	case 22:
		mes "[���b�u]";
		mes "����Ȓ��̓`���H";
		mes "����Ȃ��Ƃ�b���Ă����悤��";
		mes "�C������c�c�B";
		mes "�I���͓`����M���Ă��Ȃ�����";
		mes "�������������ǂȁB";
		emotion 55;
		cutin "war_y3",2;
		next;
		mes "[���b�u]";
		mes "�O���V�X�ɂ͘b���ĂȂ��̂��H";
		next;
		mes "[���b�u]";
		mes "�܂��A�O���V�X�̃��C�́c�c�B";
		mes "�I���͋T������߂Č����Ƃ���";
		mes "�O���V�X�̃��C���v���o������B";
		emotion 53;
		cutin "war_y2",2;
		next;
		mes "[���b�u]";
		mes "�Ƃɂ�������Ȓ��̗���";
		mes "�v���[���g�œn�������";
		mes "���ڒT���ɍs�������񂾂�H";
		cutin "war_y3",2;
		next;
		mes "[���b�u]";
		mes "���Ⴀ�A�p�[�e�B�̏�����";
		mes "�}���Ȃ���ȁB";
		mes "�܂��̓X�v�����f�B�b�h��";
		mes "�ו��𑗂��Ă���c�c�B";
		next;
		mes "[���b�u]";
		mes "��𔠂ɓ����̂�";
		mes "�����ْ�����ȁc�c�B";
		mes "��u�̃~�X��";
		mes "�Ƃ�ł��Ȃ����ɂȂ�B";
		emotion 52;
		cutin "war_y2",2;
		next;
		mes "[���b�u]";
		mes "�����A���ꂩ�H";
		mes "�X�v�����f�B�b�h�ɂ���}�X�^�[����";
		mes "����悤�ɗ��܂�Ă��镨���Ȃ񂾁B";
		next;
		mes "[���b�u]";
		mes "�{���ɑ厖�ȍ�Ƃ�����";
		mes "�����҂��Ă�B";
		set ECL_2QUE,23;
		chgquest 11331,11332;
		close2;
		cutin "war_y2",255;
		end;
	case 23:
		mes "[���b�u]";
		mes "�ӂ�";
		mes "�S���I������c�c�B";
		mes "���̑O����������";
		mes "�~�X���Ă��ׂĎg���Ȃ�";
		mes "�Ȃ��Ă��܂��ē{��ꂽ����c�c�B";
		emotion 28;
		cutin "war_y3",2;
		next;
		mes "[���b�u]";
		mes "���Ⴀ�A������L��ɂ���z�B����";
		mes "�n���ė��Ă���B";
		mes "�z�B�����瑗��悤�ɂ�";
		mes "�}�X�^�[���猾��ꂽ����ȁB";
		next;
		mes "[���b�u]";
		mes "�����ɑ���Ȃ���";
		mes "�{����c�c�B";
		emotion 9;
		cutin "war_y2",2;
		set ECL_2QUE,24;
		chgquest 11332,11333;
		close2;
		cutin "war_y2",255;
		end;
	case 24:
		mes "[���b�u]";
		mes "�ӂ�";
		mes "�S���I������c�c�B";
		mes "���̑O����������";
		mes "�~�X���Ă��ׂĎg���Ȃ�";
		mes "�Ȃ��Ă��܂��ē{��ꂽ����c�c�B";
		emotion 28;
		cutin "war_y3",2;
		next;
		mes "[���b�u]";
		mes "���Ⴀ�A������L��ɂ���z�B����";
		mes "�n���ė��Ă���B";
		mes "�z�B�����瑗��悤�ɂ�";
		mes "�}�X�^�[���猾��ꂽ����ȁB";
		next;
		mes "[���b�u]";
		mes "�����ɑ���Ȃ���";
		mes "�{����c�c�B";
		emotion 9;
		cutin "war_y2",2;
		close2;
		cutin "war_y2",255;
		end;
	case 25:
		mes "[���b�u]";
		mes "����ƃ}�X�^�[����";
		mes "���܂ꂽ���Ƃ��I�������";
		mes "���낻��p�[�e�B�̏����ł�";
		mes "��`�����Ƃɂ��邩�B";
		cutin "war_y4",2;
		next;
		mes "[���b�u]";
		mes "�I���͏����o�����Ă��邩��";
		mes "�x��łȁB";
		emotion 18;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�C��t���čs���Ă��ĂˁB";
		cutin "bu_maggi2",2;
		next;
		mes "[�e���[���A��]";
		mes "�����ǁA�����牽������񂾁H";
		mes "�}�[�N������A�����Ȃ����H";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ȃɕ�������Ĕ��ĂȂ����H";
		mes "�����x�ނ��Ƃɂ��悤�B";
		cutin "bu_mark4",0;
		next;
		mes "[�I���o�[]";
		mes "����c�c�B";
		mes "�l�A�����󂢂��B";
		cutin "bu_oliver3",0;
		next;
		mes "[�I���o�[]";
		mes "�h���O���I";
		mes "�X�̊O�Ƀh���O����";
		mes "�������񂠂����̂������I";
		mes "�H�ׂ����I";
		cutin "bu_oliver4",0;
		next;
		mes "[�e���[���A��]";
		mes "�h���O���H";
		mes "������������̂��H";
		cutin "bu_du1",2;
		next;
		mes "[�e���[���A��]";
		mes "���ꂶ��h���O���ł�";
		mes "�l��ɍs���Č��悤���I";
		mes "���������Ă���I";
		cutin "bu_du2",2;
		next;
		mes "[�I���o�[]";
		mes "�ɂ��I";
		mes "�ق��؂���������Ȃ��ŁI";
		cutin "bu_oliver7",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����m��Ȃ��ȁc�c�B";
		mes "�ł́A���݂͂�ȂƋx��ł��邩��";
		mes "�s���ė���Ƃ����B";
		cutin "bu_mark2",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������B";
		mes "��ʂ̂ǂ񂮂�́A�G�N���[�W����";
		mes "�����t�߂ɐ������Ă���^FF0000�y�^��^000000�Ƃ���";
		mes "�����X�^�[��|���Ǝ�ɓ���炵���B";
		next;
		mes "[�e���[���A��]";
		mes "������t�߂ɂ���^FF0000�y�^��^000000���ȁI";
		mes "�킩�����A�s�����I";
		mes strcharinfo(0)+ "!";
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		set ECL_2QUE,26;
		chgquest 11334,11335;
		end;
	case 26:
		mes "[���b�u]";
		mes "����ƃ}�X�^�[����";
		mes "���܂ꂽ���Ƃ��I�������";
		mes "���낻��p�[�e�B�̏����ł�";
		mes "��`�����Ƃɂ��邩�B";
		cutin "war_y4",2;
		next;
		mes "[���b�u]";
		mes "�I���͏����o�����Ă��邩��";
		mes "�x��łȁB";
		emotion 18;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�C��t���čs���Ă��ĂˁB";
		cutin "bu_maggi2",2;
		next;
		mes "[�e���[���A��]";
		mes "�����ǁA�����牽������񂾁H";
		mes "�}�[�N������A�����Ȃ����H";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ȃɕ�������Ĕ��ĂȂ����H";
		mes "�����x�����B";
		cutin "bu_mark4",0;
		next;
		mes "[�I���o�[]";
		mes "����c�c�B";
		mes "�l�A�����󂢂��B";
		emotion 37,"�I���o�[#ep14_2";
		cutin "bu_oliver3",0;
		next;
		mes "[�I���o�[]";
		mes "�h���O���I";
		mes "�X�̊O�Ƀh���O����";
		mes "�����������񂠂����̂������I";
		mes "�H�ׂ����I";
		emotion 43,"�I���o�[#ep14_2";
		cutin "bu_oliver4",0;
		next;
		mes "[�e���[���A��]";
		mes "�h���O���H";
		mes "������������̂��H";
		cutin "bu_du1",2;
		next;
		mes "[�e���[���A��]";
		mes "���ꂶ��h���O���ł�";
		mes "�̂�ɍs���Č��悤���I";
		mes "���������Ă���I";
		cutin "bu_du2",2;
		next;
		mes "[�I���o�[]";
		mes "�ɂ��I ";
		mes "�ق��؂���������Ȃ��ŁI";
		emotion 6,"�I���o�[#ep14_2";
		cutin "bu_oliver7",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ƃ������Ƃ�m��Ȃ��ȁc�c�B";
		mes "�ł́A���݂͂�ȂƋx��ł��邩��";
		mes "�s���ė���Ƃ����B";
		cutin "bu_mark2",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������B";
		mes "��ʂ̂ǂ񂮂�́A�G�N���[�W����";
		mes "�����t�߂ɐ������Ă���^FF0000�y�^��^000000�Ƃ���";
		mes "�����X�^�[��|���Ǝ�ɓ���炵���B";
		next;
		mes "[�e���[���A��]";
		mes "������t�߂ɂ���^FF0000�y�^��^000000���ȁI";
		mes "�킩�����A�s�����I";
		mes strcharinfo(0)+ "!";
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		end;
	default:
		mes "[���b�u]";
		mes "�����̉Ƃ��Ǝv����";
		mes "������肵�Ă�����B";
		cutin "war_y4",2;
		close2;
		cutin "war_y4",255;
		end;
	}
}

ecl_in04.gat,179,226,4	script	�I���o�[#ep14_2	626,{
	switch(ECL_2QUE) {
	case 26:
		if(countitem(6558) < 1) {
			mes "[�I���o�[]";
			mes "�h���O���`�`�I";
			mes "�h���O���������ς�";
			mes "�����ė�����Č������̂Ɂ`�I";
			emotion 28;
			cutin "bu_oliver7",0;
			next;
			mes "[�e���[���A��]";
			mes "�s�����I�@" +strcharinfo(0)+ "!";
			cutin "bu_du2",2;
			close2;
			cutin "bu_du2",255;
			end;
		}
		mes "[�I���o�[]";
		mes "���킠���A";
		mes "�����������ȃh���O�����I";
		mes "���肪�Ƃ��A���������H�ׂ��I";
		emotion 43;
		cutin "bu_oliver4",0;
		next;
		mes "[�I���o�[]";
		mes "���������I";
		mes "�}�M�́H";
		next;
		mes "[�}�M�X�e�B��]";
		mes "���������c�c�I";
		cutin "bu_maggi2",2;
		next;
		mes "[�I���o�[]";
		mes "���[�I�@�������������I";
		mes "���������ς����B";
		mes "�ӂ��c�c�B";
		emotion 30;
		cutin "bu_oliver81",0;
		next;
		mes "[�e���[���A��]";
		mes "�I���o�[�A�����ƐH�ׂāB";
		mes "�����ς��H�ׂȂ���";
		mes "�傫���Ȃ�Ȃ��񂾂��I";
		cutin "bu_du1",2;
		next;
		mes "[�I���o�[]";
		mes "�ӂ������c�c";
		mes "���������ς��c�c�B";
		mes "�����c�c�B";
		emotion 45;
		cutin "bu_oliver82",0;
		next;
		mes "[�e���[���A��]";
		mes "�I���o�[�A�H�ׂĂ������ɂȂ��";
		mes "���邼�c�c�B";
		cutin "bu_du2",2;
		next;
		mes "[�I���o�[]";
		mes "�����ǁA�ƂĂ������B";
		cutin "bu_oliver83",0;
		next;
		mes "[�I���o�[]";
		mes "�l�͂��ꂪ�����Ǝv��������";
		mes "����Ȃɖ����Ȃ��";
		mes "������Ȃ��݂������ˁB";
		cutin "bu_oliver84",0;
		next;
		mes "[�I���o�[]";
		mes "�h���O���������������c�c�B";
		mes "�c";
		cutin "bu_oliver85",0;
		next;
		mes "[�I���o�[]";
		mes "�c�c";
		emotion 9,"";
		cutin "bu_oliver86",0;
		next;
		mes "[�e���[���A��]";
		mes "�c�c";
		cutin "bu_du1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		cutin "bu_alp2",2;
		next;
		mes "[�e���[���A��]";
		mes "���A�������c�c";
		mes "���킠�������I ";
		emotion 23,"";
		cutin "bu_du5",2;
		delitem 6558,1;
		set ECL_2QUE,27;
		chgquest 11335,11336;
		close2;
		cutin "bu_du5",255;
		warp "eclage.gat",289,260;
		end;
	default:
		mes "[�I���o�[]";
		mes "�����c�c�B";
		mes "�l�͏����Q�邩��";
		mes "�o��Ƃ��ɋN�����āc�c�B";
		mes "�l���������čs������";
		mes "�_��������ˁ`";
		emotion 45;
		cutin "bu_oliver6",0;
		close2;
		cutin "bu_oliver6",255;
		end;
	}
}

ecl_in01.gat,44,53,4	script	�z�B��	513,{
	switch(ECL_2QUE) {
	case 24:
		mes "[�z�B��]";
		mes "���ꂪ�ו��ł����H";
		mes "���S�ɔz������̂�";
		mes "�����S���������B";
		next;
		mes "[�z�B��]";
		mes "�X�v�����f�B�b�h����";
		mes "�G�N���[�W���ɗ��铹��";
		mes "�ƂĂ��������̂ł����A";
		mes "���̎����̓G�N���[�W����";
		mes "������������ł��B";
		next;
		mes "[�z�B��]";
		mes "�|�����̒Ђ����Ȃ��";
		mes "�����ŏ���������ĐH�ׂ�΂����̂�";
		mes "�ǂ����Ď����z�B������񂾁c�c�B";
		mes "�����A�C���������B";
		emotion 28;
		set ECL_2QUE,25;
		chgquest 11333,11334;
		close;
	default:
		mes "[�z�B��]";
		mes "�ӂ��c�c�B";
		mes "���܂������Ԃ܂łɓ������邽�߂ɂ�";
		mes "�����o�����Ȃ��ƂȁB";
		next;
		mes "[�z�B��]";
		mes "����c�c";
		mes "�t�ɒx���s�����������������c�c";
		mes "�q�ɂɔz�B���Ȃ���΂Ȃ�Ȃ�";
		mes "�|�����Ђ��̔���";
		mes "���Ȃ肠�����悤�ȋC���c�c�B";
		emotion 28;
		close;
	}
}

ecl_in04.gat,226,231,4	script	�e���[���A��#ep14_2in2	628,{
	if(ECL_2QUE == 27) {
		mes "[�e���[���A��]";
		mes "�ǁA�ǂ��ɏ������񂾂�c�c�B";
		mes "�܂����H��!?";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���@���g�����悤�ȋC�z��";
		mes "�������Ȃ��������ǁc�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���A�����̏��ɃI���o�[��";
		mes "����Ă����t�[�h���c�c�B";
		emotion 23,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�����c�c�|���悧�c�c�����悧�c�c";
		emotion 28,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�v���o�����c�c�B";
		mes "�I���o�[�c�c�B";
		emotion 52,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		mes "�I���o�[�q���x���g�c�c�B";
		mes "���݂鏬���ƂƂ��Ă΂��";
		mes "�L���ȏ����Ƃ��c�c�B";
		emotion 9,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ɂ��̖{�c�c�B";
		mes "�ǂ����ăI���o�[�����鎞�ɂ�";
		mes "�v���o���Ȃ������񂾂�c�c�B";
		cutin "bu_alp5",2;
		next;
		mes "[�e���[���A��]";
		mes "�����c�c";
		mes "���O�A�����̖{���ӂƂ��납��";
		mes "�o�������H";
		emotion 9,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�t�@��������c�c�B";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�ӂƂ���ɓ���Ď��������قǂȂ̂�";
		mes "�Ȃ�Ŋo���Ă��Ȃ��񂾁c�c�B";
		mes "���̑O�ɂ�����t�@���ł�";
		mes "���ʂɂӂƂ���ɓ���Ă܂�";
		mes "���������̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�����A���O�ȁc�c�B";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������c�c���̖{�̃^�C�g�����c�c";
		mes "�m�d���̓s�s�n�����ǁH";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		cutin "bu_mark4",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ɂc�c";
		mes "���s����ĉ��N���o�����{�����c�c�B";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		next;
		mes "[�e���[���A��]";
		mes "�c�c�ǂ��������Ƃ��H";
		mes "�I���o�[�͗H�삶��Ȃ��̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�I���o�[�͍ŏ��Ɍ����Ă������낤�B";
		mes "�����̎p��������͂����Ȃ��B";
		mes "����ȃ��A���Ȗ��͏��߂Ă��ƁB";
		cutin "bu_mark1",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������������A�I���o�[�ɂƂ���";
		mes "�����͖��̐��E�������̂����m��Ȃ��B";
		next;
		mes "[�}�M�X�e�B��]";
		mes "�܂�A�I���o�[�ɂƂ���";
		mes "�����ł̏o�����͖��ŁA";
		mes "�{���̐g�̖̂ڂ��o�߂�����";
		mes "������̃I���o�[�̎p��";
		mes "�����Ă��܂�����ł����H";
		cutin "bu_maggi1",2;
		next;
		mes "[�e���[���A��]";
		mes "���������A����Ȃ���";
		mes "���肦��̂��H";
		mes "���A�������͖�����Ȃ���";
		mes "���݂��邶��Ȃ����B";
		cutin "bu_du1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A����Ȃ���낪�����B";
		mes "�I���o�[�̎���Y��Ă�������";
		mes "�s�v�c�ȗ͂������Ă����Ƃ���";
		mes "�v���Ȃ����c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�����������݂���Ƃ����̂�";
		mes "�I���o�[�������𖲂���";
		mes "�v������ł��������ɂ����Ȃ��B";
		next;
		mes "[�e���[���A��]";
		mes "�Ȃ�قǂȁc�c�B";
		mes "�^���͂킩��Ȃ�����";
		mes "�I���o�[�������Ȃ炻��ł������B";
		mes "�����A�����������ȁI";
		mes "�ǂ��v���o���o�����I";
		cutin "bu_du2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����̏����Ƃɉ�Ċ������c�c�B";
		cutin "bu_alp4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�ꏏ�ɐH�ׂ��ǂ񂮂�B";
		mes "�������������ł��B";
		cutin "bu_maggi2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "��ςȂ��Ƃ����������c�c�B";
		mes "���Ԃ��������݂����Ŋy����������B";
		cutin "bu_mark2",0;
		next;
		mes "[�e���[���A��]";
		mes strcharinfo(0)+ "��";
		mes "���낢�돕���������I";
		mes "�ЂƂ܂��͂����ł��ʂꂾ�B";
		mes "���肪�Ƃ��ȁI";
		cutin "bu_du1",2;
		next;
		if(checkitemblank() == 0) {
			mes "[�e���[���A��]";
			mes "���̃I���o�[�̔���Ă����t�[�h�c�c";
			mes "���O�Ɏ����Ă��ĖႨ�����Ǝv��������";
			mes "�ו������������ȁB";
			mes "�����ו������炵�Ă���";
			mes "�܂����Ă���Ȃ����B";
			close2;
			cutin "bu_du1",255;
			end;
		}
		getitem 19543,1;
		getexp 5000000,0;
		getexp 0,2500000;
		set ECL_2QUE,28;
		chgquest 11337,201570;
		close2;
		cutin "bu_du1",255;
		end;
	}
	mes "[�e���[���A��]";
	mes "�Ƃ���ŁA����1������Ȃ���";
	mes "���ɂ�����̂��ȁH";
	emotion 9,"�e���[���A��#ep14_2in2";
	cutin "bu_du1",2;
	next;
	mes "[�A���v�I�J�[�g]";
	mes "3���Ŋ����Ȃ񂾁B";
	emotion 21,"�A���v�I�J�[�g#ep14_2in";
	cutin "bu_alp1",2;
	next;
	mes "[�e���[���A��]";
	mes "�ǂ����ĂӂƂ��납��";
	mes "�������ł�񂾁c�c";
	mes "�Ƃ������A�Ȃ��";
	mes "�S�����������Ă�񂾂�c�c�B";
	emotion 23,"�e���[���A��#ep14_2in2";
	cutin "bu_du5",2;
	close2;
	cutin "bu_du5",255;
	end;
}

ecl_in04.gat,224,234,4	script	�}�[�N�C�V��#ep14_2in2	616,{
	if(ECL_2QUE == 27) {
		mes "[�e���[���A��]";
		mes "�ǁA�ǂ��ɏ������񂾂�c�c�B";
		mes "�܂����H��!?";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���@���g�����悤�ȋC�z��";
		mes "�������Ȃ��������ǁc�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���A�����̏��ɃI���o�[��";
		mes "����Ă����t�[�h���c�c�B";
		emotion 23,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�����c�c�|���悧�c�c�����悧�c�c";
		emotion 28,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�v���o�����c�c�B";
		mes "�I���o�[�c�c�B";
		emotion 52,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		mes "�I���o�[�q���x���g�c�c�B";
		mes "���݂鏬���ƂƂ��Ă΂��";
		mes "�L���ȏ����Ƃ��c�c�B";
		emotion 9,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ɂ��̖{�c�c�B";
		mes "�ǂ����ăI���o�[�����鎞�ɂ�";
		mes "�v���o���Ȃ������񂾂�c�c�B";
		cutin "bu_alp5",2;
		next;
		mes "[�e���[���A��]";
		mes "�����c�c";
		mes "���O�A�����̖{���ӂƂ��납��";
		mes "�o�������H";
		emotion 9,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�t�@��������c�c�B";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�ӂƂ���ɓ���Ď��������قǂȂ̂�";
		mes "�Ȃ�Ŋo���Ă��Ȃ��񂾁c�c�B";
		mes "���̑O�ɂ�����t�@���ł�";
		mes "���ʂɂӂƂ���ɓ���Ă܂�";
		mes "���������̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�����A���O�ȁc�c�B";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������c�c���̖{�̃^�C�g�����c�c";
		mes "�m�d���̓s�s�n�����ǁH";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		cutin "bu_mark4",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ɂc�c";
		mes "���s����ĉ��N���o�����{�����c�c�B";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		next;
		mes "[�e���[���A��]";
		mes "�c�c�ǂ��������Ƃ��H";
		mes "�I���o�[�͗H�삶��Ȃ��̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�I���o�[�͍ŏ��Ɍ����Ă������낤�B";
		mes "�����̎p��������͂����Ȃ��B";
		mes "����ȃ��A���Ȗ��͏��߂Ă��ƁB";
		cutin "bu_mark1",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������������A�I���o�[�ɂƂ���";
		mes "�����͖��̐��E�������̂����m��Ȃ��B";
		next;
		mes "[�}�M�X�e�B��]";
		mes "�܂�A�I���o�[�ɂƂ���";
		mes "�����ł̏o�����͖��ŁA";
		mes "�{���̐g�̖̂ڂ��o�߂�����";
		mes "������̃I���o�[�̎p��";
		mes "�����Ă��܂�����ł����H";
		cutin "bu_maggi1",2;
		next;
		mes "[�e���[���A��]";
		mes "���������A����Ȃ���";
		mes "���肦��̂��H";
		mes "���A�������͖�����Ȃ���";
		mes "���݂��邶��Ȃ����B";
		cutin "bu_du1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A����Ȃ���낪�����B";
		mes "�I���o�[�̎���Y��Ă�������";
		mes "�s�v�c�ȗ͂������Ă����Ƃ���";
		mes "�v���Ȃ����c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�����������݂���Ƃ����̂�";
		mes "�I���o�[�������𖲂���";
		mes "�v������ł��������ɂ����Ȃ��B";
		next;
		mes "[�e���[���A��]";
		mes "�Ȃ�قǂȁc�c�B";
		mes "�^���͂킩��Ȃ�����";
		mes "�I���o�[�������Ȃ炻��ł������B";
		mes "�����A�����������ȁI";
		mes "�ǂ��v���o���o�����I";
		cutin "bu_du2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����̏����Ƃɉ�Ċ������c�c�B";
		cutin "bu_alp4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�ꏏ�ɐH�ׂ��ǂ񂮂�B";
		mes "�������������ł��B";
		cutin "bu_maggi2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "��ςȂ��Ƃ����������c�c�B";
		mes "���Ԃ��������݂����Ŋy����������B";
		cutin "bu_mark2",0;
		next;
		mes "[�e���[���A��]";
		mes strcharinfo(0)+ "��";
		mes "���낢�돕���������I";
		mes "�ЂƂ܂��͂����ł��ʂꂾ�B";
		mes "���肪�Ƃ��ȁI";
		cutin "bu_du1",2;
		next;
		if(checkitemblank() == 0) {
			mes "[�e���[���A��]";
			mes "���̃I���o�[�̔���Ă����t�[�h�c�c";
			mes "���O�Ɏ����Ă��ĖႨ�����Ǝv��������";
			mes "�ו������������ȁB";
			mes "�����ו������炵�Ă���";
			mes "�܂����Ă���Ȃ����B";
			close2;
			cutin "bu_du1",255;
			end;
		}
		getitem 19543,1;
		getexp 5000000,0;
		getexp 0,2500000;
		set ECL_2QUE,28;
		chgquest 11337,201570;
		close2;
		cutin "bu_du1",255;
		end;
	}
	mes "[�}�[�N�C�V��]";
	mes "�������A�s�v�c�Ȏ���������̂��B";
	mes "������������A�������Ă���̂�";
	mes "�������̕��������肵�ĂȁB";
	emotion 23,"�e���[���A��#ep14_2in2";
	cutin "bu_mark1",0;
	next;
	mes "[�e���[���A��]";
	mes "�ɂ��I";
	mes "�ǂ����ĉ�������񂾂�I";
	mes "�ɂ����낤�I";
	emotion 19,"�e���[���A��#ep14_2in2";
	cutin "bu_du4",2;
	next;
	mes "[�}�[�N�C�V��]";
	mes "�����A�ǂ���疲����Ȃ��炵���B";
	emotion 6,"�e���[���A��#ep14_2in2";
	cutin "bu_mark2",0;
	close2;
	cutin "bu_mark2",255;
	end;
}

ecl_in04.gat,223,234,4	script	�}�M�X�e�B��#ep14_2in2	612,{
	if(ECL_2QUE == 27) {
		mes "[�e���[���A��]";
		mes "�ǁA�ǂ��ɏ������񂾂�c�c�B";
		mes "�܂����H��!?";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���@���g�����悤�ȋC�z��";
		mes "�������Ȃ��������ǁc�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���A�����̏��ɃI���o�[��";
		mes "����Ă����t�[�h���c�c�B";
		emotion 23,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�����c�c�|���悧�c�c�����悧�c�c";
		emotion 28,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�v���o�����c�c�B";
		mes "�I���o�[�c�c�B";
		emotion 52,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		mes "�I���o�[�q���x���g�c�c�B";
		mes "���݂鏬���ƂƂ��Ă΂��";
		mes "�L���ȏ����Ƃ��c�c�B";
		emotion 9,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ɂ��̖{�c�c�B";
		mes "�ǂ����ăI���o�[�����鎞�ɂ�";
		mes "�v���o���Ȃ������񂾂�c�c�B";
		cutin "bu_alp5",2;
		next;
		mes "[�e���[���A��]";
		mes "�����c�c";
		mes "���O�A�����̖{���ӂƂ��납��";
		mes "�o�������H";
		emotion 9,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�t�@��������c�c�B";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�ӂƂ���ɓ���Ď��������قǂȂ̂�";
		mes "�Ȃ�Ŋo���Ă��Ȃ��񂾁c�c�B";
		mes "���̑O�ɂ�����t�@���ł�";
		mes "���ʂɂӂƂ���ɓ���Ă܂�";
		mes "���������̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�����A���O�ȁc�c�B";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������c�c���̖{�̃^�C�g�����c�c";
		mes "�m�d���̓s�s�n�����ǁH";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		cutin "bu_mark4",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ɂc�c";
		mes "���s����ĉ��N���o�����{�����c�c�B";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		next;
		mes "[�e���[���A��]";
		mes "�c�c�ǂ��������Ƃ��H";
		mes "�I���o�[�͗H�삶��Ȃ��̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�I���o�[�͍ŏ��Ɍ����Ă������낤�B";
		mes "�����̎p��������͂����Ȃ��B";
		mes "����ȃ��A���Ȗ��͏��߂Ă��ƁB";
		cutin "bu_mark1",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������������A�I���o�[�ɂƂ���";
		mes "�����͖��̐��E�������̂����m��Ȃ��B";
		next;
		mes "[�}�M�X�e�B��]";
		mes "�܂�A�I���o�[�ɂƂ���";
		mes "�����ł̏o�����͖��ŁA";
		mes "�{���̐g�̖̂ڂ��o�߂�����";
		mes "������̃I���o�[�̎p��";
		mes "�����Ă��܂�����ł����H";
		cutin "bu_maggi1",2;
		next;
		mes "[�e���[���A��]";
		mes "���������A����Ȃ���";
		mes "���肦��̂��H";
		mes "���A�������͖�����Ȃ���";
		mes "���݂��邶��Ȃ����B";
		cutin "bu_du1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A����Ȃ���낪�����B";
		mes "�I���o�[�̎���Y��Ă�������";
		mes "�s�v�c�ȗ͂������Ă����Ƃ���";
		mes "�v���Ȃ����c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�����������݂���Ƃ����̂�";
		mes "�I���o�[�������𖲂���";
		mes "�v������ł��������ɂ����Ȃ��B";
		next;
		mes "[�e���[���A��]";
		mes "�Ȃ�قǂȁc�c�B";
		mes "�^���͂킩��Ȃ�����";
		mes "�I���o�[�������Ȃ炻��ł������B";
		mes "�����A�����������ȁI";
		mes "�ǂ��v���o���o�����I";
		cutin "bu_du2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����̏����Ƃɉ�Ċ������c�c�B";
		cutin "bu_alp4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�ꏏ�ɐH�ׂ��ǂ񂮂�B";
		mes "�������������ł��B";
		cutin "bu_maggi2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "��ςȂ��Ƃ����������c�c�B";
		mes "���Ԃ��������݂����Ŋy����������B";
		cutin "bu_mark2",0;
		next;
		mes "[�e���[���A��]";
		mes strcharinfo(0)+ "��";
		mes "���낢�돕���������I";
		mes "�ЂƂ܂��͂����ł��ʂꂾ�B";
		mes "���肪�Ƃ��ȁI";
		cutin "bu_du1",2;
		next;
		if(checkitemblank() == 0) {
			mes "[�e���[���A��]";
			mes "���̃I���o�[�̔���Ă����t�[�h�c�c";
			mes "���O�Ɏ����Ă��ĖႨ�����Ǝv��������";
			mes "�ו������������ȁB";
			mes "�����ו������炵�Ă���";
			mes "�܂����Ă���Ȃ����B";
			close2;
			cutin "bu_du1",255;
			end;
		}
		getitem 19543,1;
		getexp 5000000,0;
		getexp 0,2500000;
		set ECL_2QUE,28;
		chgquest 11337,201570;
		close2;
		cutin "bu_du1",255;
		end;
	}
	mes "[�}�M�X�e�B��]";
	mes "�I���o�[�c�c";
	emotion 28,"�}�M�X�e�B��#ep14_2in2";
	cutin "bu_maggi4",2;
	next;
	mes "[�e���[���A��]";
	mes "�}�M�A���v���H";
	emotion 19,"�e���[���A��#ep14_2in2";
	cutin "bu_du1",2;
	close2;
	cutin "bu_du1",255;
	end;
}

ecl_in04.gat,223,230,4	script	�A���v�I�J�[�g#ep14_2in	615,{
	if(ECL_2QUE == 27) {
		mes "[�e���[���A��]";
		mes "�ǁA�ǂ��ɏ������񂾂�c�c�B";
		mes "�܂����H��!?";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���@���g�����悤�ȋC�z��";
		mes "�������Ȃ��������ǁc�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���A�����̏��ɃI���o�[��";
		mes "����Ă����t�[�h���c�c�B";
		emotion 23,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�����c�c�|���悧�c�c�����悧�c�c";
		emotion 28,"�}�M�X�e�B��#ep14_2in2";
		cutin "bu_maggi4",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�v���o�����c�c�B";
		mes "�I���o�[�c�c�B";
		emotion 52,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		mes "�I���o�[�q���x���g�c�c�B";
		mes "���݂鏬���ƂƂ��Ă΂��";
		mes "�L���ȏ����Ƃ��c�c�B";
		emotion 9,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ɂ��̖{�c�c�B";
		mes "�ǂ����ăI���o�[�����鎞�ɂ�";
		mes "�v���o���Ȃ������񂾂�c�c�B";
		cutin "bu_alp5",2;
		next;
		mes "[�e���[���A��]";
		mes "�����c�c";
		mes "���O�A�����̖{���ӂƂ��납��";
		mes "�o�������H";
		emotion 9,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�t�@��������c�c�B";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�ӂƂ���ɓ���Ď��������قǂȂ̂�";
		mes "�Ȃ�Ŋo���Ă��Ȃ��񂾁c�c�B";
		mes "���̑O�ɂ�����t�@���ł�";
		mes "���ʂɂӂƂ���ɓ���Ă܂�";
		mes "���������̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c";
		emotion 40,"�A���v�I�J�[�g#ep14_2in";
		cutin "bu_alp4",2;
		next;
		mes "[�e���[���A��]";
		mes "�����A���O�ȁc�c�B";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������c�c���̖{�̃^�C�g�����c�c";
		mes "�m�d���̓s�s�n�����ǁH";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		cutin "bu_mark4",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ɂc�c";
		mes "���s����ĉ��N���o�����{�����c�c�B";
		emotion 23,"�}�[�N�C�V��#ep14_2in2";
		next;
		mes "[�e���[���A��]";
		mes "�c�c�ǂ��������Ƃ��H";
		mes "�I���o�[�͗H�삶��Ȃ��̂��H";
		emotion 23,"�e���[���A��#ep14_2in2";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�I���o�[�͍ŏ��Ɍ����Ă������낤�B";
		mes "�����̎p��������͂����Ȃ��B";
		mes "����ȃ��A���Ȗ��͏��߂Ă��ƁB";
		cutin "bu_mark1",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������������A�I���o�[�ɂƂ���";
		mes "�����͖��̐��E�������̂����m��Ȃ��B";
		next;
		mes "[�}�M�X�e�B��]";
		mes "�܂�A�I���o�[�ɂƂ���";
		mes "�����ł̏o�����͖��ŁA";
		mes "�{���̐g�̖̂ڂ��o�߂�����";
		mes "������̃I���o�[�̎p��";
		mes "�����Ă��܂�����ł����H";
		cutin "bu_maggi1",2;
		next;
		mes "[�e���[���A��]";
		mes "���������A����Ȃ���";
		mes "���肦��̂��H";
		mes "���A�������͖�����Ȃ���";
		mes "���݂��邶��Ȃ����B";
		cutin "bu_du1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A����Ȃ���낪�����B";
		mes "�I���o�[�̎���Y��Ă�������";
		mes "�s�v�c�ȗ͂������Ă����Ƃ���";
		mes "�v���Ȃ����c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�����������݂���Ƃ����̂�";
		mes "�I���o�[�������𖲂���";
		mes "�v������ł��������ɂ����Ȃ��B";
		next;
		mes "[�e���[���A��]";
		mes "�Ȃ�قǂȁc�c�B";
		mes "�^���͂킩��Ȃ�����";
		mes "�I���o�[�������Ȃ炻��ł������B";
		mes "�����A�����������ȁI";
		mes "�ǂ��v���o���o�����I";
		cutin "bu_du2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����̏����Ƃɉ�Ċ������c�c�B";
		cutin "bu_alp4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�ꏏ�ɐH�ׂ��ǂ񂮂�B";
		mes "�������������ł��B";
		cutin "bu_maggi2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "��ςȂ��Ƃ����������c�c�B";
		mes "���Ԃ��������݂����Ŋy����������B";
		cutin "bu_mark2",0;
		next;
		mes "[�e���[���A��]";
		mes strcharinfo(0)+ "��";
		mes "���낢�돕���������I";
		mes "�ЂƂ܂��͂����ł��ʂꂾ�B";
		mes "���肪�Ƃ��ȁI";
		cutin "bu_du1",2;
		next;
		if(checkitemblank() == 0) {
			mes "[�e���[���A��]";
			mes "���̃I���o�[�̔���Ă����t�[�h�c�c";
			mes "���O�Ɏ����Ă��ĖႨ�����Ǝv��������";
			mes "�ו������������ȁB";
			mes "�����ו������炵�Ă���";
			mes "�܂����Ă���Ȃ����B";
			close2;
			cutin "bu_du1",255;
			end;
		}
		getitem 19543,1;
		getexp 5000000,0;
		getexp 0,2500000;
		set ECL_2QUE,28;
		chgquest 11337,201570;
		close2;
		cutin "bu_du1",255;
		end;
	}
	mes "[�A���v�I�J�[�g]";
	mes "���A����Ȃ��Ƃ��c�c�B";
	mes "�ǂ����Ďv���o���Ȃ������񂾁c�c�B";
	emotion 23,"�A���v�I�J�[�g#ep14_2in";
	cutin "bu_alp5",2;
	next;
	mes "[�A���v�I�J�[�g]";
	mes "�T�C�����c�c";
	mes "�T�C������Ȃ��Ƃ����Ȃ��̂ɁI";
	emotion 23,"�A���v�I�J�[�g#ep14_2in";
	close2;
	cutin "bu_alp5",255;
	end;
}

//============================================================
// �G�N���[�W���̉��N�G�X�g
//- Registry -------------------------------------------------
// ECL_3QUE -> 0�`
//------------------------------------------------------------
ecl_hub01.gat,98,32,3	script	�G�N���[�W���K�[�h	461,{
	if(ECL_3QUE < 5) {
		mes "[�G�N���[�W���K�[�h]";
		mes "���̂��߂ɓ����҂ł͂���܂���ˁB";
		mes "�������܂��B���̐��";
		mes "�֌W�҈ȊO�̕��͓���ł��܂���B";
		next;
		mes "�]�G�N���[�W���̉��̂��߂ɓ�����";
		mes "�@�łȂ��ƁA���̐�ɐi�߂Ȃ��悤���]";
		next;
		mes "^FF0000�]���̐�ɐi�ނɂ�";
		mes "�@�N�G�X�g�u�G�N���[�W���̉��v��";
		mes "�@�i�߂�K�v������܂��]^000000";
		close;
	}
	mes "[�G�N���[�W���K�[�h]";
	mes "���̂��߂ɓ����ҁc�c�ł��ˁB";
	mes "�������̒ʒm������܂����̂�";
	mes "�o����������܂��B";
	mes "������ւǂ����B";
	close2;
	warp "ecl_in02.gat",126,115;
	end;
}

eclage.gat,112,40,3	script	�G�N���[�W���K�[�h	461,{
	switch(ECL_3QUE) {
	case 5:
		if(ECL_3QUE_sub & 0x1) {
			mes "[���I]";
			mes "�ʎ��W�����ƃn�`����";
			mes "�{���ɑf���炵�����ł����I";
			mes "�O����n�̂��A";
			mes "����Ȃɔ�����������";
			mes "�H�ׂĂ�����ł���!!";
			next;
			mes "[���I]";
			mes "���Ȃ��ɂ���`���������������Ƃ�";
			mes "��w���ɓ`���Ă����܂����I";
			mes "�܂�������܂��傤!!";
			close;
		}
		if(checkquest(7420)) {
			if(countitem(12344) < 3 || countitem(12345) < 3) {
				mes "[���I]";
				mes "^FF0000�s���M�L�����̉ʎ��W����3��^000000��";
				mes "^FF0000���V�I�����F�X�p�̃n�`��3��^000000�ł��B";
				mes "�X�v�����f�B�b�h�O����n��";
				mes "���Y�i�ł��B";
				mes "���肢���܂��I";
				close;
			}
			mes "[���I]";
			mes "�����������A���̎�ɂ��镨��!!";
			mes "�s���M�L�����̉ʎ��W������!!!";
			mes "���V�I�����F�X�p�̃n�`��!!!";
			mes "������܂���!!!";
			next;
			mes "[���I]";
			mes "�}�����E�W�����l��";
			mes "����ς�l������ڂ�����܂��ˁB";
			next;
			delitem 12344,3;
			delitem 12345,3;
			set ECL_3QUE_sub,ECL_3QUE_sub|1;
			delquest 7420;
			getexp 200000,0;
			getexp 0,200000;
			if(ECL_3QUE_sub & 0x7 == 0x7) {
				mes "[�G�N���[�W���K�[�h]";
				mes "�����ɂ��܂������B";
				mes "�}�����E�W��������A���Ȃ���T���悤";
				mes "�w������܂����B";
				mes "���I�̗��݂������Ă��ꂽ��ł����H";
				cutin "minuel01",4;
				next;
				mes "[�G�N���[�W���K�[�h]";
				mes "�����ł����B";
				mes "�ł́A���̕�����̓`����";
				mes "���`�����܂��B";
				next;
				mes "[�G�N���[�W���K�[�h]";
				mes "���Ȃ��̓G�N���[�W���̂��߂�";
				mes "��������̎d�������Ă��ꂽ�B";
				mes "�����\������Ă��ꂽ�Ǝv���Ă���B";
				next;
				mes "[�G�N���[�W���K�[�h]";
				mes "�Ƃ̂��Ƃł��B";
				mes "���̂悤�ɓ`����Ε�����͂����ƁB";
				mes "����ł͎��͂���Ŏ��炵�܂��B";
				set ECL_3QUE,6;
				set ECL_3QUE_sub,0;
				chgquest 7417,7421;
				next;
				cutin "minuel01",255;
				mes "[���I]";
				mes "�ǂ��������Ƃł��傤�ˁB";
				mes "�d�����˗���������ł���Ȃ��Ƃ�";
				mes "�����̂�����Ȃ�ł����A";
				mes "���̓}�����E�W�������ǂ�����";
				mes "���Ȃ��ɂ���Ȃ��Ƃ������Ă���̂�";
				mes "�����ł��܂���B";
				next;
				mes "[���I]";
				mes "�c�c�}�����E�W������";
				mes "�������������l���Ă���̂��c�c";
				next;
				mes "[���I]";
				mes "�܁A�Ƃɂ����I";
				mes "���Ȃ��ɂ���`���������������Ƃ�";
				mes "��w���ɂ�������Ɠ`�B����";
				mes "�����܂��ˁI";
				next;
				mes "�]�}�����E�W�����@�J���f���C��";
				mes "�@�Ă�ł���炵���B";
				mes "�@���{�ɂ���J���f���C�ɉ��";
				mes "�@�s�����]";
				close;
			}
			mes "[���I]";
			mes "���Ȃ��ɂ���`���������������Ƃ�";
			mes "��w���ɂ�������Ɠ`�B����";
			mes "�����܂��ˁI";
			close;
		}
		mes "[���I]";
		mes "����ɂ��́I";
		emotion 0,"�G�N���[�W���K�[�h#reo";
		next;
		mes "[���I]";
		mes "�{���ɂ���ɂ��́I";
		next;
		mes "[���I]";
		mes "�c�c";
		next;
		if(select("�Ȃ�ł����H","�ςȗd����") == 2) {
			mes "[���I]";
			mes "����I�@�Ⴂ�܂��B";
			mes "���͕ςȃ��t�B�l�ł͂���܂���B";
			mes "����ł���A����c�c";
			close;
		}
		mes "[���I]";
		mes "�}�����E�W�������A���Ȃ���";
		mes "���t�B�l�ƃG�N���[�W���̂��߂�";
		mes "�ǂ�Ȃ��Ƃ����Ă����͂�����";
		mes "�����Ă��܂����B";
		next;
		mes "[���I]";
		mes "����ō���Ԃɏ������Ȃ����";
		mes "�Ȃ�Ȃ��Č����������Ă��炨���Ɓc�c";
		next;
		if(select("��������΂����H","�f��I") == 2) {
			mes "[���I]";
			mes "���Ȃ��̈ӎv�ɔC���Ȃ�����";
			mes "����ꂽ���ǁA��͂肱�̂悤��";
			mes "�Ȃ��Ă��܂���ł��ˁc�c�B";
			mes "�߂����ł��B";
			close;
		}
		mes "[���I]";
		mes "���݂����̂�";
		mes "�X�v�����f�B�b�h�O����n�ō����";
		mes "�s���M�L�����̉ʎ��W������";
		mes "���V�I�����F�X�p�̃n�`��������";
		mes "�p�ӂ��Ăق�����ł��B";
		next;
		mes "[���I]";
		mes "���̐X�Ƃ����ǂ��ǂ����Ă�";
		mes "�z�����Ȃ��āc�c";
		next;
		menu "���}�ȈČ��ł͂Ȃ��́H",-;
		mes "[���I]";
		mes "�����I";
		mes "�����H�ׂȂ��Ǝ��ɂ����Ȃ�ł���!!";
		mes "���}�Ȃ�ł�!!!!";
		next;
		mes "[���I]";
		mes "�X�v�����f�B�b�h���s��������";
		mes "����񂶂�Ȃ���ł����H";
		mes "����Ƃ��ɂ��傱���Ǝ����ė���";
		mes "�����΁A���͏������ł��I";
		mes "��x�Ɠ������肢�͂��܂��񂩂�B";
		next;
		mes "[���I]";
		mes "�ł͂��肢���܂��ˁI";
		mes "^FF0000�s���M�L�����̉ʎ��W����3��^000000��";
		mes "^FF0000���V�I�����F�X�p�̃n�`��3��^000000�ł��`";
		mes "�X�v�����f�B�b�h�O����n��";
		mes "�̔����Ă��܂��B";
		next;
		mes "[���I]";
		mes "����2����ɓ���邽�߂ɂ�";
		mes "�X�v�����f�B�b�h�R�C����";
		mes "�K�v�ɂȂ�͂��ł��B";
		mes "�R�C���̓X�v�����f�B�b�h��";
		mes "���������Ɖ҂��܂���I";
		next;
		mes "[���I]";
		mes "�X�v�����f�B�b�h�̎d����";
		mes "��`���Ƃ������Ƃ́A";
		mes "�G�N���[�W���̂��߂ł�����܂��B";
		mes "�����A�撣���Ă��������I";
		setquest 7420;
		close;
	case 6:
	case 7:
		mes "[���I]";
		mes "�ʎ��W�����ƃn�`����";
		mes "�{���ɑf���炵�����ł����I";
		mes "�O����n�̂��A";
		mes "����Ȃɔ�����������";
		mes "�H�ׂĂ�����ł���!!";
		next;
		mes "[���I]";
		mes "���Ȃ��ɂ���`���������������Ƃ�";
		mes "��w���ɓ`���Ă����܂����I";
		mes "�܂�������܂��傤!!";
		close;
	case 8:
		if(checkquest(7423)) {
			mes "�]���I�́A���������̉��ł���";
			mes "�@�J���f���C���A����قǐM������";
			mes "�@���Ȃ��悤���B";
			mes "�@���̃��t�B�l������b��";
			mes "�@�����Ă݂悤�]";
			close;
		}
		mes "[���I]";
		mes "�d�����˗���������ł���Ȃ��Ƃ�";
		mes "�����̂�����Ȃ�ł����A";
		mes "���̓}�����E�W�������ǂ�����";
		mes "���Ȃ��Ƀ��t�B�l�̎�`����";
		mes "�������̂��A�����ł��܂���B";
		next;
		mes "[���I]";
		mes "�c�c�}�����E�W������";
		mes "�������������l���Ă���̂��c�c";
		next;
		menu "���������Ȃ́H",-;
		emotion 9,"�G�N���[�W���K�[�h#reo";
		mes "[���I]";
		mes "�������I�@�܂����I";
		mes "�����c�c�����ł��ˁc�c";
		mes "�߂Â��ɂ����A�M�����Ȃ��c�c";
		mes "�܂��A����Ȋ����ł��B";
		next;
		mes "[���I]";
		mes "�����������Ƃ����Ă��Ȃ��̂�";
		mes "�x������K�v���{���Ȃ�";
		mes "�Ȃ���ł����ǁc�c";
		next;
		mes "[���I]";
		mes "�O�Ⴊ�Ȃ��킯�ł͂���܂��񂪁A";
		mes "���Ȃ���ʂȉ��ł��̂Łc�c";
		mes "�F�X�ƋC�ɂȂ��ł���ˁB";
		next;
		mes "[���I]";
		mes "�����ƁI";
		mes "�O���̐l�ł��邠�Ȃ���";
		mes "������Ƙb���߂��Ă��܂��܂����B";
		mes "���̘b�́A�ǂ����I";
		mes "�ǂ����Y��Ă��������I";
		next;
		setquest 7423;
		if(checkquest(7423) && checkquest(7424) && checkquest(7425) && checkquest(7426)) {
			// ������
			mes "�]���R�ɂ��ẮA";
			mes "�@�J���f���C�ɒ��ڕ�����";
			mes "�@�݂�̂����������]";
			set ECL_3QUE,9;
			setquest 7427;
			delquest 7423;
			delquest 7424;
			delquest 7425;
			delquest 7426;
			delquest 72253;
			close;
		}
		mes "�]���I�́A���������̉��ł���";
		mes "�@�J���f���C���A����قǐM������";
		mes "�@���Ȃ��悤���B";
		mes "�@���̃��t�B�l������b��";
		mes "�@�����Ă݂悤�]";
		close;
	case 9:
		mes "[���I]";
		mes "�}�����E�W�����ɂ��Ă̘b��";
		mes "������߂܂��傤�B";
		mes "���Ȃ��͍��̎d��������";
		mes "�W�����Ă��������I";
		next;
		mes "�]���܂ŕ������b����A";
		mes "�@�J���f���C�ɂ��ă��t�B�l��";
		mes "�@�ΊO�I�ɂ͍D�ӂ������Ă��邪�A";
		mes "�@����Ƃ͂܂������t��";
		mes "�@�s����s�M�����������Ă���悤���]";
		next;
		mes "�]���R�ɂ��ẮA";
		mes "�@�J���f���C�ɒ��ڕ�����";
		mes "�@�݂�̂����������]";
		close;
	case 10:
		if(checkquest(7433)) {
			if(checkquest(7433) & 0x2) {
				delquest 7433;
				mes "[���I]";
				mes "�����X�^�[������C�z�͂Ȃ�����";
				mes "�p�g���[�������邱�ƂŁA";
				mes "���l��������̃N���[����";
				mes "��������܂��B";
				next;
				mes "[���I]";
				mes "���Ԃɗ]�T������΁A";
				mes "�܂��p�g���[���ɂ����܂��傤�B";
				close;
			}
			mes "[���I]";
			mes "�����X�^�[�͔���m��Ȃ��̂��c�c";
			mes "���l��������A���ӂ̈��S�ɂ���";
			mes "�N���[�������o���Ă��܂��B";
			mes "�{���Ɂc�c�������z��ł��B";
			next;
			mes "[���I]";
			mes "���̃p�g���[���̎���";
			mes "���񂨊肢���܂��B";
			mes "�͂����c�c";
			close;
		}
		if(checkquest(7432)) {
			if(checkquest(7432) & 0x4) {
				mes "[���I]";
				mes "������ǂ����ʂł��I";
				mes "�����A����̎d���ɑ΂���";
				mes "��V�ł��B";
				next;
				if(checkitemblank() == 0) {
					mes "[���I]";
					mes "�ނށI";
					mes "��������n�����悤�Ǝv���܂�����";
					mes "����������������悤�ł��B";
					mes "�������𐮗����Ă���A";
					mes "������x�b�������Ă��������B";
					close;
				}
				mes "[���I]";
				mes "�܂��p�g���[������`���Ă����";
				mes "�̂ł���΁A�������Ă��������I";
				mes "���Ȃ��̕��̘g�́A";
				mes "���̕��ŗp�ӂ��Ă����܂��B";
				mes "�͂͂́I";
				chgquest 7432,7433;
				getitem 6081,1;
				close;
			}
			mes "[���I]";
			mes "�����u���b�c�ƃy�^�����e5�̂��B";
			mes "��낵�����肢���܂��I";
			next;
			mes "[���I]";
			mes "�������A�����ȂƂ���A";
			mes "�����u���b�c�����Y��ł���ˁH";
			mes "����Ȃ̂ɂǂ����Ă��̂悤��";
			mes "�Ȃ��Ă��܂����̂��c�c�B";
			next;
			mes "[���I]";
			mes "�������t�B�l�H";
			mes "����A����̓��t�B�l�ł�";
			mes "����܂���B";
			next;
			mes "[���I]";
			mes "�y�^�����Ȃ��c�c";
			mes "�y�^�����{���ɂ��킢���ł��B";
			mes "���C��1�C������";
			mes "�����������炢�ł��B";
			mes "�����ǁc�c";
			next;
			mes "[���I]";
			mes "������͉Ԓd���󂵂܂��I";
			mes "�Ȃ̂ŁA�������Ƃ͂ł��Ȃ���";
			mes "���u���Ă������Ƃ�";
			mes "�ł��Ȃ���ł��c�c�B";
			close;
		}
		mes "[���I]";
		mes "����ɂ��́I";
		mes "�����Ƃ���ɗ��܂����B";
		mes "�Ԃ��炢����n�̃����u���b�c��";
		mes "�y�^����ގ����ɍs���܂��傤�I";
		next;
		mes "[���I]";
		mes "���l����A������ɖ��f��";
		mes "�������Ă���Ƃ����N���[����";
		mes "�����ς������ė��Ă��܂��B";
		mes "�ꏏ�ɂ���Ă݂܂��񂩁H";
		next;
		switch(select("�s���I�@���I�@�������I","�����̓_���I","�ʎ��W�����ƃn�`���͕K�v�Ȃ��́H")) {
		case 1:
			mes "[���I]";
			mes "��ӂ�R�₵�Ă��܂��ˁI";
			mes "�����ł��ˁA�s���܂��傤�I";
			mes "�������I�@���Ȃ������I";
			mes "���l�������C�W������A";
			mes "�Ԓd���󂵂Ă��郁���u���b�c��";
			mes "�y�^���𒦂炵�߂ɁB";
			next;
			mes "[���I]";
			mes "�����u���b�c�A�y�^�����e5�C";
			mes "�ގ����Ă��Ă��������B";
			mes "�G�N���[�W���O�A";
			mes "�r�t���X�g�^���[�̂���";
			mes "�Ԃ��炢����n��";
			mes "�W�܂��Ă���͂��ł��B";
			setquest 7432;
			close;
		case 2:
			mes "[���I]";
			mes "�Ȃ񂾁c�c���Ȃ���ł����c�c�B";
			mes "���Ⴀ�A�ЂƂ�ł��B";
			mes "�ЂƂ�₵���c�c";
			close;
		case 3:
			mes "[���I]";
			mes "�����A�ʎ��W�����ƃn�`���c�c�B";
			mes "����͓����H�ׂȂ����Ƃɂ��܂����B";
			mes "�D���Ȃ����H�ׂĂ�����A";
			mes "�������󂵂Ă��܂��܂��āB";
			mes "�c�c�߂����b�ł��B";
			close;
		}
	default:
		mes "[���I]";
		mes "�A�[���u�w�C���֖̊�ł���A";
		mes "���t�B�l�̎�s�G�N���[�W����";
		mes "�悤�����I";
		mes "�����y����ł��������I";
		close;
	}
}

ecl_tdun04.gat,32,35,3	script	�q�V�G#tlord	623,{
	switch(ECL_3QUE) {
	case 12:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "���l��A���̗p���H";
		next;
		mes "�]�ڂ̑O�ɗ����Ă��郉�t�B�l��";
		mes "�@�傫�Ȕw�ɔZ���F�̔畆�A";
		mes "�@�����ȉH�������Ă���B";
		mes "�@�܂�ŏ㋉���t�B�l�E�h�i��";
		mes "�@�������t�B�l�E�p�p����";
		mes "�@���܂��������킹���悤���]";
		next;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�������낶�댩�Ă���H";
		mes "���̎p�ɑ΂��ĕi�]����̂�";
		mes "�ړI�Ȃ̂��H";
		mes "�N�͂��������N���H";
		next;
		menu "�J���f���C�̌Z��m��܂��񂩁H",-;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ӂށc�c�J���͂��܂�ڂ���";
		mes "���̂��Ƃ�b���Ȃ������悤���ȁB";
		mes "���O��e�p���������ɁA";
		mes "�����u�͂��v�ƌ����ė����̂��H";
		next;
		mes "[�q�V�G]";
		mes "�����J���̌Z�̃q�V�G���B";
		mes "�J���Ƃ͑o�q�����c�c";
		mes "�܂��A���̐F��牽���A";
		mes "���낢��Ⴄ����A�˘f���̂��킩��B";
		next;
		mes "[�q�V�G]";
		mes "���̎�Ɏ����Ă���莆��";
		mes "�n���ɗ����̂��낤�H";
		next;
		mes "[�q�V�G]";
		mes "�ȑO��������莆�ɋq���K��邩����";
		mes "�����Ă��������A���̂��Ƃ������̂��B";
		mes "�莆��ǂނ��班���҂��Ă���B";
		next;
		mes "�]�J���f���C�̌Z�A�q�V�G��";
		mes "�@�J���f���C����̎莆��n�����B";
		mes "�@������x�q�V�G�ɘb�������悤�]";
		set ECL_3QUE,13;
		chgquest 7434,7435;
		close2;
		cutin "hisie01",255;
		end;
	case 13:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�҂����Ĉ��������B";
		mes "�莆�͑S���ǂ񂾁B";
		mes "�F�B�̂��Ƃ�������Ă������A";
		mes "���ꂪ�N�Ȃ̂��B";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�N�Ɏ��̂��Ƃ�";
		mes "�ڂ����`���Ȃ������̂́A";
		mes "�킴�Ƌ������邽�߂������悤���B";
		mes "���ς�炸�̂悤���ȁB";
		next;
		mes "[�q�V�G]";
		mes "���̎p���ς���Ă���̂�";
		mes "���łɂ킩���Ă���Ƃ͎v�����A";
		mes "�h�i�ƃp�p���̍��������炾�B";
		next;
		mes "[�q�V�G]";
		mes "�b���ƕ��G�����A�N���m���Ă���";
		mes "�K�v�����肻�����B";
		mes "�莆�ɂ͌N�̏Љ�̂ق��ɁA";
		mes "�����ЂƂ�����Ă����B";
		next;
		mes "[�q�V�G]";
		mes "�������c�c";
		mes "���ɂȂ��ăG�C���@���g��";
		mes "�T���Ă��闝�R�͉����c�c�H";
		next;
		if(select("�G�C���@���g�H","�����ЂƂH") == 2) {
			mes "[�q�V�G]";
			mes "�G�C���@���g��T���Ăق����������B";
			mes "�N���傫�ȗ͂ɂȂ��Ă����炵�����H";
			next;
		}
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�G�C���@���g�͖��w�҂ł���c�c";
		mes "�����āc�c���ƃJ���̕��e���B";
		mes "���ǂǂ����ČN�ɗ��񂾂񂾁H";
		mes "���̐l�ɘb���Â炢�Ȃ�A";
		mes "���ɗ���ł��������낤�ɁB";
		next;
		mes "[�q�V�G]";
		mes "�܂��Ƃɂ����A�G�C���@���g��";
		mes "���ǂ��ɂ���̂��͎����m��Ȃ��B";
		mes "���܂�m�肽�����Ȃ����A";
		mes "�����Ɍ����ƃJ�����T���Ă���̂�";
		mes "�~�߂������c�c";
		next;
		menu "��������ł��傤�H",-;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "���������w�I�ɕ��e���Ƃ������Ƃ��B";
		mes "���ۂɂ͎������͔ނ̎����̂�";
		mes "�߂��Ȃ��B";
		mes "�������͔ނ̉������ؖ����邽�߂�";
		mes "���ꂽ���݂�����B";
		next;
		mes "[�q�V�G]";
		mes "�����畃�q�Ԃ̏�݂������̂͂Ȃ��B";
		mes "�J���̓G�C���@���g���������߂�";
		mes "�T���Ă���̂�������Ȃ��c�c�B";
		next;
		menu "�����H�@�����H",-,"���ꂽ���݁H",-;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�����Ȃ���}�����ɂȂ���";
		mes "�Z�l�X�ɂ��Ă͒m���Ă��邩�H";
		mes "�G�C���@���g�͏����ł͂Ȃ�";
		mes "�����̃h�i�ł��A�}�����ɑI�΂��";
		mes "���Ƃ�����Ƃ������Ƃɋ�����";
		mes "�������炵���B";
		next;
		mes "[�q�V�G]";
		mes "�����Ă������̉����𗧂Ă�";
		mes "������ؖ����邽�߂Ɏ������s�����B";
		mes "�J���͓O��I�Ɍv�Z������ꂽ";
		mes "�G�C���@���g�̍�i���B";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "���͎����ɔ����\�z�O�̎��̂�";
		mes "���܂ꂽ�c�c�B";
		mes "�Ƃɂ����J���͉��ɂȂ�����";
		mes "���g�̐l���͎����Ă��܂����B";
		mes "�G�C���@���g�ɑ΂��鑞���݂�";
		mes "�ς���Ă��Ȃ����낤�B";
		next;
		mes "[�q�V�G]";
		mes "���̃J�����G�C���@���g��";
		mes "�T���Ă���c�c�H";
		mes "�����S���ɕω������������A";
		mes "���邢�́A�����l��������񂾂ȁB";
		mes "�}�����ɂȂ��Ă��̊Ԃɂ��A";
		mes "���̋��������傫���Ȃ����悤���B";
		next;
		menu "�������H",-;
		mes "[�q�V�G]";
		mes "��k���Ǝv�����H";
		mes "�N�̒m���Ă���J���f���C��";
		mes "���M�ɂ��ӂ�Ă��邩�炩�H";
		next;
		cutin "hisie04",0;
		mes "[�q�V�G]";
		mes "�܂��A��������ȁB";
		mes "�}�����ɂȂ��Ă���";
		mes "�J���̐��i�͑傫���ς�����悤���B";
		mes "��������ۂɈ�x���Ă݂����������B";
		next;
		menu "���ډ�ɍs���΁H",-;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�����G�N���[�W���ɓ�������";
		mes "�����ȃ��t�B�l�������r�b�N������B";
		mes "���̓h�i�ł��p�p���ł��Ȃ��B";
		mes "�ǂ���ɂ������Ă��Ȃ��B";
		next;
		mes "[�q�V�G]";
		mes "���̐̂Ƀv�������X�����悤�Ƃ���";
		mes "�������������ƁB";
		mes "�ނ����߂Ă����̂����̂悤��";
		mes "�҂Ȃ̂ł͂Ȃ����c�c�B";
		next;
		menu "�v�������X�H",-;
		mes "[�q�V�G]";
		mes "�\�N�Ɩ������������Z�l�X�B";
		mes "���̕��e���v�������X���c�c�B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�Ƃɂ����G�C���@���g��T���Ȃ��ƁB";
		mes "���̂ӂ��������������V��ɂ΂��";
		mes "�p���B�����̂����\�N�O���B";
		mes "�����Ƃǂ����Ŏ��g�̎���������������";
		mes "���ł���񂾂낤�B";
		mes "�ނ͂��̂悤�Ȑl�����B";
		next;
		mes "[�q�V�G]";
		mes "���̓G�N���[�W���ɓ���Ȃ�����A";
		mes "�G�N���[�W�������̒T���͌N�ɔC���B";
		mes "�J���ȊO�ɁA�N����񂪏W�܂肻����";
		mes "�n�ʂɂ���m�荇���͂��Ȃ����H";
		mes "��������Ȃ�A�b�𕷂��Ă݂Ă���B";
		next;
		mes "[�q�V�G]";
		mes "���͎��Ȃ�ɃG�N���[�W���̊O��";
		mes "���ׂĂ݂�B";
		mes "���Ղł��c���Ă���΂������c�c�B";
		mes "�����A�T���ɍs�����I";
		next;
		cutin "hisie01",255;
		mes "�]��񂪏W�܂肻���Ȓn�ʂɂ���";
		mes "�@�l������b�𕷂��Ă���悤��";
		mes "�@����ꂽ�B";
		mes "�@�R�Q�d�V�i�C���͂����";
		mes "�@���Ă͂܂肻�����]";
		next;
		mes "�]�R�Q�d�V�i�C������";
		mes "�@�b�𕷂��Ă݂悤�]";
		set ECL_3QUE,14;
		chgquest 7435,7436;
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 14:
	case 15:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�G�N���[�W�������̑{���𗊂ށB";
		mes "�J���ȊO�ɁA�N����񂪏W�܂肻����";
		mes "�n�ʂɂ���m�荇���͂��Ȃ����H";
		mes "��������Ȃ�A�b�𕷂��Ă݂Ă���B";
		next;
		cutin "hisie01",255;
		mes "�]��񂪏W�܂肻���Ȓn�ʂɂ���";
		mes "�@�l������b�𕷂��Ă���悤��";
		mes "�@����ꂽ�B";
		mes "�@�R�Q�d�V�i�C���͂����";
		mes "�@���Ă͂܂肻�����]";
		next;
		mes "�]�R�Q�d�V�i�C������";
		mes "�@�b�𕷂��Ă݂悤�]";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 16:
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�R�Q�d�����w�҂̎x�������Ă����̂��H";
		mes "�c�c�������ȁB";
		mes "�f���炵���������ʂ��o���Ă��甭�\��";
		mes "�݂�Ȃ������������Ƃ����Ȃ�킩�邪";
		mes "�V�i�C���͂��̂悤�Ȑ��i�ł͂Ȃ��B";
		mes "�������낤�H";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "����ɁA�^���̔��̕ς��҂�����";
		mes "���g�̌����Ƀv���C�h�������Ă���B";
		mes "������A�u���ɂ��Ă̌����Ȃ̂��v��";
		mes "�B���͍̂D�܂Ȃ��X��������B";
		next;
		mes "[�q�V�G]";
		mes "���̖��w�҂͉�������ȁB";
		mes "���ׂČ������������B";
		mes "���w�҂��N�Ȃ̂�������Ȃ��Ȃ�A";
		mes "�V�i�C���̓����𒲂ׂĂ݂�񂾁B";
		next;
		mes "[�q�V�G]";
		mes "������ӂ͌N�ɔC������B";
		mes "�����C�ɂȂ��Ă��邱�Ƃ������ĂȁB";
		mes "������m�F���ė���B";
		mes "�ł́A�悢�m�点��҂��Ă��邼�B";
		next;
		cutin "hisie03",255;
		mes "�]�R�Q�d�V�i�C���������ƒ��ׂ�";
		mes "�@�K�v������B";
		mes "�@�������{���ӂ����Ă���l���c�c";
		mes "�@�G�N���[�W���K�[�h�E�~�j���G���Ȃ�";
		mes "�@�����m���Ă��邩������Ȃ��]";
		set ECL_3QUE,17;
		chgquest 7438,7439;
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 17:
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�R�Q�d�����w�҂̎x�������Ă����̂��H";
		mes "�c�c�������ȁB";
		mes "�f���炵���������ʂ��o���Ă��甭�\��";
		mes "�݂�Ȃ������������Ƃ����Ȃ�킩�邪";
		mes "�V�i�C���͂��̂悤�Ȑ��i�ł͂Ȃ��B";
		mes "�������낤�H";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "����ɁA�^���̔��̕ς��҂�����";
		mes "���g�̌����Ƀv���C�h�������Ă���B";
		mes "������A�u���ɂ��Ă̌����Ȃ̂��v��";
		mes "�B���͍̂D�܂Ȃ��X��������B";
		next;
		mes "[�q�V�G]";
		mes "���̖��w�҂͉�������ȁB";
		mes "���ׂČ������������B";
		mes "���w�҂��N�Ȃ̂�������Ȃ��Ȃ�A";
		mes "�V�i�C���̓����𒲂ׂĂ݂�񂾁B";
		next;
		mes "[�q�V�G]";
		mes "������ӂ͌N�ɔC������B";
		mes "�����C�ɂȂ��Ă��邱�Ƃ������ĂȁB";
		mes "������m�F���ė���B";
		mes "�ł́A�悢�m�点��҂��Ă��邼�B";
		next;
		cutin "hisie03",255;
		mes "�]�R�Q�d�V�i�C���������ƒ��ׂ�";
		mes "�@�K�v������B";
		mes "�@�������{���ӂ����Ă���l���c�c";
		mes "�@�G�N���[�W���K�[�h�E�~�j���G���Ȃ�";
		mes "�@�����m���Ă��邩������Ȃ��]";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 18:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "���ʂ͂������̂��H";
		next;
		mes "�]�~�j���G�����瓾������`�����]";
		next;
		mes "[�q�V�G]";
		mes "�ӂށc�c";
		mes "�V�i�C�����x�����閂�w�҂��N�Ȃ̂�";
		mes "���ڍs���Ċm�F���邵���Ȃ��ȁB";
		next;
		mes "[�q�V�G]";
		mes "���̘b�Ɗ֌W���邩�킩��Ȃ����A";
		mes "���ɂ��铴�A�Ō����p�̃��C��";
		mes "1���������񂾁B";
		next;
		mes "[�q�V�G]";
		mes "���ʂ̃��C�ł͂Ȃ��A";
		mes "�ȒP�Ȍ����p�̌����Ƃ��āA";
		mes "�������Ă��郄�C���B";
		mes "�閧������������A";
		mes "�G�C���@���g���B�ꂽ��";
		mes "�ł���ꏊ�ł͂Ȃ����������c�c�B";
		next;
		mes "[�q�V�G]";
		mes "����ł��A���Ɏ�|����Ȃ����ȁB";
		mes "�܂��͂�����K�˂Ă݂�";
		mes "�N������̂����ڊm�F���Ă݂悤�B";
		next;
		mes "[�q�V�G]";
		mes "�������ȁc�c";
		mes "�悵�A���̌v��ōs�����B";
		next;
		mes "[�q�V�G]";
		mes "�N���ق���̉�Ɨ����t�̂������";
		mes "�V�i�C���ɗ��܂ꂽ�Ƃ���10������";
		mes "�V�i�C���ɔz�B�𗊂܂ꂽ����";
		mes "�����ă��C�ɐڋ߂���񂾁B";
		next;
		mes "[�q�V�G]";
		mes "���͏������ꂽ�Ƃ���ɉB���";
		mes "���C����o�Ă���̂�";
		mes "�G�C���@���g�Ȃ̂��m�F����B";
		mes "�܂��A�N���o�Ă��Ȃ��\����";
		mes "���邪�c�c";
		mes "�Ƃɂ�������Ă݂悤�B";
		next;
		mes "[�q�V�G]";
		mes "���͖ڗ����Ȃ��悤��";
		mes "�G�N���[�W���ɐN��������肾�B";
		next;
		mes "[�q�V�G]";
		mes "�G�N���[�W���̍L��ɓ���";
		mes "��O�̓��ŉ���B";
		mes "�����ޗ��͖Y�ꂸ��";
		mes "�����ė���悤�ɂȁB";
		next;
		cutin "hisie03",255;
		mes "�]�q�V�G�����̕��p�Ŕ����������C���A";
		mes "�@�V�i�C���̎x�����閂�w�҂�������";
		mes "�@�s���Ă��郄�C�̉\��������]";
		next;
		mes "�]�V�i�C���ɔz�B�𗊂܂ꂽ�悤��";
		mes "�@�����ă��C��K�ˁA���C�ɂ���l����";
		mes "�@�m�F���邱�Ƃɂ����]";
		next;
		mes "�]�܂��͂ق���̉�Ɨ����t�̂������";
		mes "�@10�����āA�q�V�G�Ɨ��������\���";
		mes "�@�G�N���[�W���L��O�ɍs�����]";
		set ECL_3QUE,19;
		chgquest 7440,7441;
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�Ƃ肠�����G�N���[�W���̓����܂�";
		mes "�ꏏ�ɂ��������H";
		next;
		if(select("���肢����","�܂���邱�Ƃ�����̂Œf��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			mes "�ł��邾�������ς܂��Ă����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 19:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "���R�ɐڋ߂��邽�߂ɂ́A";
		mes "�����ޗ����K�v�ɂȂ�B";
		mes "�����ޗ�����ɓ����";
		mes "�V�i�C���ɔz�B�𗊂܂ꂽ�悤��";
		mes "�����Đڋ߂���񂾁B";
		next;
		mes "[�q�V�G]";
		mes "�������ق���̉��";
		mes "�����t�̂�����10����";
		mes "��������ȁH";
		next;
		cutin "hisie03",255;
		mes "�]�ق���̉�Ɨ����t�̂������";
		mes "�@10�����āA�q�V�G�Ɨ��������\���";
		mes "�@�G�N���[�W���L��O�ɍs�����]";
		close;
	case 20:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "���̖т̐F���ς���Ă������A";
		mes "�m���ɃG�C���@���g�������B";
		mes "����ȏ��ɂ����Ƃ́c�c";
		next;
		mes "[�q�V�G]";
		mes "�J���ɂ��̎�����m�点�Ȃ���΁B ";
		mes "�}���I";
		next;
		cutin "hisie01",255;
		mes "�]�R�Q�d�V�i�C�����x�����Ă���";
		mes "�@���w�҂́A�G�C���@���g�������B";
		mes "�@�}���ŃJ���f���C�ɕ񍐂ɍs�����]";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 21:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�G�C���@���g�������������Ă���̂�";
		mes "�m���߂Ă݂悤�B";
		mes "�}�����I";
		next;
		cutin "hisie01",255;
		mes "�]�G�C���@���g�����̌��������Ă�����";
		mes "�@�m�F���邽�߁A�G�C���@���g�̃��C��";
		mes "�@�ēx���ׂɍs�����]";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 22:
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�G�C���@���g�̌���������";
		mes "�����J���Ɏ����čs���񂾁I";
		next;
		cutin "hisie01",255;
		mes "�]�G�C���@���g�̌���������";
		mes "�@�J���f���C�ɓ͂��悤�]";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 23:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�I�[�u�ɑ΂���x����";
		mes "��������͓̂��R���Ƃ��āc�c";
		mes "�����Y��Ă���悤�ȋC���c�c";
		next;
		switch(select("�G�C���@���g�ɂ���","�R�Q�d�V�i�C���ɂ���")) {
		case 1:
			mes "[�q�V�G]";
			mes "�z�͂����ւ�ւ�΂��Ȃ���";
			mes "�ٔ邵�Ă���B";
			mes "��������������Ă���󋵂�";
			mes "�y����ł���̂�������Ȃ��B";
			next;
			mes "[�q�V�G]";
			mes "���̂������ȓz�Ƃ͎v���Ă������c�c";
			mes "�����̐��i���v���Ԃ��";
			mes "�Ċm�F���������ŃC���C������B";
			next;
			cutin "hisie03",0;
			mes "[�q�V�G]";
			mes "����ɍ��ɂȂ��Ă܂�";
			mes "���̑̂ɋ������N�����悤�ŁA";
			mes "�Ζʂ��邽�тɔ��΂�";
			mes "���낢�뎿�₳��Č��ɂȂ�B";
			next;
			mes "[�q�V�G]";
			mes "�����҂������܂ő傫�������������Ƃ�";
			mes "�������o���񂾂낤�B";
			mes "���͂��̂悤�Ȏ҂�";
			mes "���e���Ƃ������Ƃ����ʂ܂ŔF�߂Ȃ��B";
			close2;
			cutin "hisie03",255;
			end;
		case 2:
			cutin "hisie03",0;
			mes "[�q�V�G]";
			mes "�c�c�I";
			mes "�������I�@�V�i�C���I";
			mes "�ǂ����Ă����Y��Ă����񂾁H";
			mes "���܂�ɂ��G�C���@���g�΂����";
			mes "�C������Ă��āA�Y��Ă�����B";
			next;
			cutin "hisie01",0;
			mes "[�q�V�G]";
			mes "�V�i�C���͎��������G�C���@���g��";
			mes "�߂������Ƃ��܂��m��Ȃ��B";
			mes "�ޏ����G�C���@���g�̎x����";
			mes "�ł���Ȃ�A�����s���ɂȂ���";
			mes "���邱�Ƃ��낤�c�c";
			next;
			menu "�s���Ē��ׂĂ݂܂��傤���H",-;
			mes "[�q�V�G]";
			mes "�{�����H";
			mes "�������Ă����̂ł���Ώ�����B";
			mes "����J�������ڏo��̂�";
			mes "���͔������ق����ǂ�����������ȁB";
			next;
			cutin "hisie02",0;
			mes "[�q�V�G]";
			mes "���ɃJ���͕ςȌ��������₷���B";
			mes "����ςƂ����̂͂ƂĂ��|������B";
			next;
			mes "[�q�V�G]";
			mes "���ꂶ��A��낵�����ށB";
			mes "���ꂮ����C�����ĂȁB";
			next;
			cutin "hisie03",255;
			mes "�]�R�Q�d�V�i�C������";
			mes "�@�b�𕷂��ė��悤�]";
			set ECL_3QUE,24;
			chgquest 72268,7445;
			next;
			cutin "hisie01",0;
			mes "[�q�V�G]";
			mes "�ǂ�������G�N���[�W���̓����܂�";
			mes "���낤���H";
			next;
			if(select("���肢����","�f��") == 2) {
				mes "[�q�V�G]";
				mes "�������B�킩�����B";
				close2;
				cutin "hisie01",255;
				end;
			}
			mes "[�q�V�G]";
			mes "���ꂶ��s�������B";
			close2;
			warp "ecl_fild01.gat",101,315;
			end;
		}
	case 24:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�N�̓V�i�C���Ɖ��x���ڂ��Ă��邩��";
		mes "�ڋ߂���͓̂���Ȃ��͂��B";
		mes "�J���͊m���Ƀ}�����ł͂��邪�A";
		mes "���Ԃ���̃}�����̒���";
		mes "��Ԍ��͂������Ă��Ȃ��}����������B";
		next;
		mes "[�q�V�G]";
		mes "�唼�̃��t�B�l�̓J�������}������";
		mes "�����������̂܂ܕۊǂ���";
		mes "�Â��Ɏ��ɏ��邱�Ƃ�����Ă���B";
		mes "���������悤�Ƃ����";
		mes "�����������炵���B";
		next;
		mes "[�q�V�G]";
		mes "�J���ɂ͖��������Ȃ��B";
		mes "������N���͂ɂȂ��Ăق����B";
		mes "�V�i�C���ɂ��Ă͌N�ɔC����B";
		next;
		mes "[�q�V�G]";
		mes "�����킩������A�J���̏���";
		mes "�s���Ă���B";
		next;
		mes "[�q�V�G]";
		mes "�ǂ�������G�N���[�W���̓����܂�";
		mes "���낤���H";
		next;
		if(select("���肢����","�f��") == 2) {
			mes "[�q�V�G]";
			mes "�������B�킩�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���ꂶ��s�������B";
		close2;
		warp "ecl_fild01.gat",101,315;
		end;
	case 25:
	case 26:
	case 27:
	case 28:
	case 29:
	case 30:
	case 31:
	case 32:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�G�N���[�W���ɍs�����B";
		mes "�J�����܂߂Ęb������";
		mes "�K�v�����肻�����B";
		close2;
		cutin "hisie01",255;
		end;
	case 33:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ŋ߂͂������{�a��";
		mes "��������悤�ɂȂ����B";
		mes "�������I�[�u���̊j�ɑ�����";
		mes "���͂𑗂��Ă��邩��c�c";
		next;
		cutin "hisie04",0;
		mes "[�q�V�G]";
		mes "�N�ɂ͊��ӂ��Ă���B";
		mes "���ׂĂ̂��Ƃ��I��������A";
		mes "�b���Ȃ��������Ƃ�b�����炢���Ȃ�";
		mes "�v���Ă���B";
		close2;
		cutin "hisie01",255;
		end;
	default:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�D��S�ł����܂œo���ė����Ȃ�A";
		mes "�����~�肽�����������B";
		mes "�ŋ߃v���t�F�b�T�[�̒��q��";
		mes "�C�}�C�`������ȁB";
		close2;
		cutin "hisie01",255;
		end;
	}
}

mora.gat,103,74,5	script	��������#tl01	946,{
	mes "[��������]";
	mes "�G�N���[�W���Ɉ�x�s���Ă݂����āA";
	mes "�A���R�̒��Ԓn���疶�̐X��ʂ���";
	mes "�����܂ŗ������ǁc�c";
	mes "���̐X�͓G����������A";
	mes "������x�Ɠ��肽���Ȃ��I";
	next;
	mes "[��������]";
	mes "�����c�c";
	mes "�G�N���[�W���ɍs������A";
	mes "�ǂ�����Ē��Ԓn��";
	mes "�߂�΂����񂾁c�c";
	next;
	switch(select("�G�N���[�W���H","�s�v�c�Ȏ�ɂ��ċ�����","�撣����")) {
	case 1:
		mes "[��������]";
		mes "����H�@�܂��m��Ȃ��̂��H";
		mes "�G�N���[�W���̓��t�B�l�̎�s���B";
		mes "�����̉^���ȂǂŃG�N���[�W������";
		mes "���[���ɗ��郉�t�B�l�Ɨ��l������";
		mes "�������ǁc�c";
		next;
		mes "[��������]";
		mes "�N�������܂ŗ����Ȃ�";
		mes "��x�K�₵�Č��Ȃ����B";
		mes "�܂��A�ό�����A�ό��I";
		mes "�r�t���X�g����k��";
		mes "�܂������i�߂΂����B";
		close;
	case 2:
		mes "[��������]";
		mes "���ށH";
		mes "���̐X�ō̎悵���s�v�c�Ȏ��";
		mes "�g���Ĕ��ōs���΁c�c";
		mes "�X�v�����f�B�b�h�̋߂��܂�";
		mes "�s����̂��H";
		next;
		mes "[��������]";
		mes "���̂悤�ȕ��@�������Ƃ́B";
		mes "�͂́B���肪�Ƃ��B";
		close;
	case 3:
		mes "[��������]";
		mes "�����܂��Ă���Ă�̂��H";
		mes "�D�����񂾂ˁc�c�B";
		close;
	}
}

ecl_in01.gat,32,52,5	script	���l�|��#tl01	515,3,3,{
	if(ECL_3QUE == 1 || ECL_3QUE == 2) {
		mes "[�|��]";
		mes "�G�N���[�W���K�[�h�����Ȃ���";
		mes "�T���Ă��܂�����B";
		mes "�����̏o������ɂ���悤�ł����A";
		mes "�s���Ȃ��̂ł����H";
		next;
		mes "[�|��]";
		mes "���J�ȗ��ݕ��ň����C���ɂ�";
		mes "�Ȃ�Ȃ������񂶂�Ȃ��ł����H";
		mes "�����ł��I";
		mes "�G�N���[�W���̃��t�B�l������";
		mes "���l�ɂ����D������ł��B";
		close;
	}
	if(ECL_3QUE == 8) {
		if(checkquest(7424)) {
			mes "[�|��]";
			mes "�����Ɖ���������܂��B";
			mes "�����ώ@���Ă݂����ʂƂ��ẮA";
			mes "�ނ�͉��̒a������тȂ����";
			mes "�s��������Ă��܂����B";
			close;
		}
		mes "[�|��]";
		mes "���܂Ń��t�B�l�̉��l�̂��߂�";
		mes "�����Ă����̂ł���?!";
		mes "�ǂ����Ď��Ɉꌾ��";
		mes "�����Ă���Ȃ�������ł����H";
		mes "�|�������l�ɂ܂�������ł��B";
		next;
		mes "[�|��]";
		mes "�j���̏�ň�x���A��������";
		mes "�������̂ŁA���܂�b�����邱�Ƃ�";
		mes "�ł��܂���ł����c�c�B";
		mes "�{���ɔ��������������Ƃ���";
		mes "�o���Ă��܂���B";
		next;
		mes "[�|��]";
		mes "����ǁA���t�B�l������";
		mes "���������̉������܂����";
		mes "�󂯓���Ă͂��Ȃ��悤�ł��B";
		mes "�ǂ����Ăł��傤���H";
		mes "���������ĉ����m���Ă����ł����H";
		next;
		mes "[�|��]";
		mes "�����ɕ������Ⴄ��";
		mes "���t�B�l�����̎����S��";
		mes "�h�����Ă��܂������ŕ����܂���B";
		next;
		setquest 7424;
		if(checkquest(7423) && checkquest(7424) && checkquest(7425) && checkquest(7426)) {
			mes "�]���܂ŕ������b����A";
			mes "�@�J���f���C�ɂ��ă��t�B�l��";
			mes "�@�ΊO�I�ɂ͍D�ӂ������Ă��邪�A";
			mes "�@����Ƃ͂܂������t��";
			mes "�@�s����s�M�����������Ă���悤���]";
			next;
			mes "�]���R�ɂ��ẮA";
			mes "�@�J���f���C�ɒ��ڕ�����";
			mes "�@�݂�̂����������]";
			set ECL_3QUE,9;
			setquest 7427;
			delquest 7423;
			delquest 7424;
			delquest 7425;
			delquest 7426;
			delquest 72253;
			close;
		}
		mes "�]�|���̘b�������[���������B ";
		mes "�@�M������Ă��Ȃ����c�c";
		mes "�@���̃��t�B�l��������";
		mes "�@�����Ƙb�𕷂��Č��悤�]";
		close;
	}
	if(ECL_3QUE == 9) {
		mes "[�|��]";
		mes "���낻�뎟�̒n��܂ňړ�����";
		mes "�v������Ă܂��B";
		mes "���̂܂ܖ߂邩�A�����łȂ����";
		mes "���[���܂ōs�����c�c�Y�݂܂��ˁB";
		close;
	}
	if(ECL_3QUE >= 3) {
		mes "[�|��]";
		mes "���Ȃ��͖Z�������ł��ˁB";
		mes "���Ȃ��̖��O������������";
		mes "�����ς������܂����B";
		mes "�������t�B�l������";
		mes "�F�B�ɂȂ�܂����ˁI";
		close;
	}
	if(checkquest(7411) && checkquest(7412) && checkquest(7413)) {
		doevent "�G�N���[�W���K�[�h#tl01::OnStart";
	}
	mes "[�|��]";
	mes "���Ȃ��A�~�b�h�K���h�̕��ł����?!";
	mes "���Ȃ��̎p�A����ɂ��̕����I";
	mes "�G�N���[�W���̋߂��ɂ́A";
	mes "���Ȃ��̂悤�Ȋi�D�̐l������";
	mes "�Z��ł��܂���B";
	next;
	mes "[�|��]";
	mes "���̓A�[���u�w�C���̒������痈��";
	mes "�|���ƌ����܂��B";
	mes "�{���c�c�G�N���[�W���ɗ���";
	mes "�悩�����c�c�B";
	mes "�����Ń~�b�h�K���h�̐l��";
	mes "�o���Ƃ́B";
	next;
	mes "[�|��]";
	mes "�G�N���[�W���ɂ͗��l��";
	mes "�����ς��W�܂邯�ǁA�ŋ߂܂ł�";
	mes "�A�[���u�w�C���o�g���唼�ł�������A";
	mes "�ƂĂ��������ł��B";
	next;
	switch(select("���l���������R","�G�N���[�W���̖����́H")) {
	case 1:
		mes "[�|��]";
		mes "���l���������R�c�c";
		mes "��ڂ̗��R�́A�����ł͒N�ł�";
		mes "�ȒP�ɃR�~���j�P�[�V������";
		mes "�Ƃ�邩��ł��傤�B";
		next;
		mes "[�|��]";
		mes "�G�N���[�W���̓r�t���X�g�Ƌ��ɂ���A";
		mes "�r�t���X�g�̈ӎv�ł��ׂĂ̐l��Ƃ�";
		mes "���t�̕ǂ��Ȃ��Ȃ��Ă��܂��B";
		mes "���̎��Ƃ��Ȃ��̂悤�ɁB";
		next;
		mes "[�|��]";
		mes "��ڂ̗��R�́A�G�N���[�W����";
		mes "�A�[���u�w�C���̏I���Ŏn�܂��";
		mes "�֖�c�c���g�D���w�C���ɍs����";
		mes "�B��̒ʘH������ł��B";
		next;
		mes "[�|��]";
		mes "�����ăG�N���[�W���ɗ��l��";
		mes "�W�܂��Ԃ̑傫�ȗ��R��!!!";
		next;
		menu "���R��?!",-;
		emotion 56;
		mes "[�|��]";
		mes "�ŋ߂����ɐV����";
		mes "^0000FF�}�����E�W����^000000���a����������ł�!!!!";
		next;
		menu "�}���}���H",-;
		mes "[�|��]";
		mes "�������A^0000FF�}�����E�W����^000000�ł��B";
		mes "���t�B�l�ōł��ʂ̍����ҁc�c";
		mes "�u���v�ł��B";
		mes "���l�ł��I�@���l���a��������ł�!!";
		next;
		mes "[�|��]";
		mes "����̉��l�͂ƂĂ��c���̂�";
		mes "�}�����E�W�����ɂȂ����̂ł��B";
		mes "���t�B�l�̉��l�炵���A";
		mes "�ƂĂ��������ł��B";
		next;
		menu "����͂��̘b�ł����H",-;
		mes "[�|��]";
		mes "10�N���炢�O���ȁc�c�H";
		mes "����A5�N�H�@15�N�c�c�H";
		mes "�@";
		mes "�c�c�Ƃɂ����A100�N�O�ł�";
		mes "�Ȃ������Ǝv���܂��B";
		next;
		setquest 7411;
		if(checkquest(7411) && checkquest(7412) && checkquest(7413)) {
			doevent "�G�N���[�W���K�[�h#tl01::OnStart";
		}
		mes "�]�|���Ƃ������l�̓��t�B�l���ɂ���";
		mes "�@�I���Ȃ����葱���Ă���B";
		mes "�@���̐l�͋C�ɂ��Ȃ��Ŏ���������";
		mes "�@���E�ɓ��荞��ł��āA";
		mes "�@����b���Ă���̂�������Ȃ��B";
		mes "�@���̗��l�Ƙb���Ă݂悤�]";
		close;
	case 2:
		mes "[�|��]";
		mes "�G�N���[�W���̖����ł����H";
		mes "����͖ܘ_�A�r�t���X�g�^���[�ł��I";
		mes "�����Ɍ����ƃG�N���[�W��������";
		mes "�����ł͂���܂��񂯂ǁI";
		mes "���͂͂͂�";
		next;
		mes "[�|��]";
		mes "�����ǁA���͂܂��A";
		mes "���ɍs���Ă��܂���c�c�B";
		mes "�ӂ����A�|���āB";
		next;
		mes "[�|��]";
		mes "�r�t���X�g�^���[�́c�c";
		mes "���A�������B";
		mes "���g���b�v�����";
		mes "�s���ė��܂�����ˁH";
		mes "���g���b�v���񂩂�b���Ă��������I";
		next;
		mes "�]�r�t���X�g�^���[�ɂ��Ă�";
		mes "�@���g���b�v�Ƃ������l��";
		mes "�@�悭�m���Ă���悤���]";
		close;
	}
OnTouch:
	if(ECL_3QUE == 0 && BaseLevel >= 99) {
		mes "�]���t�B�l�ł͂Ȃ�������";
		mes "�@�A�[���u�w�C���̗��l��";
		mes "�@��b�����Ă���]";
		emotion 56,"���l�|��#tl01";
		emotion 56,"���l���g���b�v#tl02";
		emotion 56,"���l�`�[�o�[#tl03";
		next;
		if(select("�ꏊ��ς���","�b���̗ւɓ����Ă݂�") == 1) {
			mes "�]���l�B��";
			mes "�@���܂�C�ɂ��Ă��Ȃ��悤���]";
			close;
		}
		mes "�]���肰�Ȃ��ߊ������";
		mes "�@��b���~�߂���A�Ȃ������Ă��ꂽ�B";
		mes "�@�b�����Ă݂悤�]";
		//set ECL_3QUE,1;
		close;
	}
	end;
OnInit:
	waitingroom "�G�N���[�W���̉�",0;
	end;
}

ecl_in01.gat,32,51,7	script	���l���g���b�v#tl02	513,{
	if(ECL_3QUE == 1) {
		mes "[���g���b�v]";
		mes "�����Ƃ���A���t�B�l������";
		mes "�N�ɗp������悤���ȁB";
		mes "�����̏o������܂ŗ��Ă����";
		mes "�����Ă������B";
		mes "�s���Ă݂Ȃ����B";
		close;
	}
	if(ECL_3QUE == 2) {
		mes "[���g���b�v]";
		mes "����H";
		mes "�N�͓����̏o�������";
		mes "�N���Ɖ�񑩂����Ă��Ȃ��������H";
		close;
	}
	if(ECL_3QUE == 8) {
		mes "[���g���b�v]";
		mes "�V���������a��������オ���Ă���";
		mes "���͋C�������������悤���B";
		mes "�����ǁA�Ȃ����l�X�̕��͋C��";
		mes "�����ς��ȁc�c�B";
		next;
		mes "[���g���b�v]";
		mes "�Ȃ����낤�H";
		mes "�C�̂����Ȃ炢�����c�c";
		close;
	}
	if(ECL_3QUE == 9) {
		mes "[���g���b�v]";
		mes "���̓`�[�o�[�N�Ƃ�����x";
		mes "�^���[�ɒ��킵�Ă݂���肾�B";
		mes "�W�]�������炵������Ȃ����B";
		mes "�^���ǂ���΃��[���܂Ō����邾��B";
		close;
	}
	if(ECL_3QUE >= 3) {
		mes "[���g���b�v]";
		mes "���̑O�A���̃K�[�h�ɌĂ΂ꂽ��A";
		mes "������Ƃ���ŌN�̘b��";
		mes "�����悤�ɂȂ�����B";
		mes "�d�v�ȉ����ɂ�������Ă���̂��H";
		mes "�N�̔F�m�x�͂��Ȃ�̂��̂���B";
		close;
	}
	if(checkquest(7411) && checkquest(7412) && checkquest(7413)) {
		doevent "�G�N���[�W���K�[�h#tl01::OnStart";
	}
	if(checkquest(7412)) {
		mes "[���g���b�v]";
		mes "���̘b�����ł͖ʔ����Ȃ�����B";
		mes "�|�������ƃ`�[�o�[�N�����";
		mes "�b�𕷂��Ă݂Ȃ����B";
		next;
		mes "[���g���b�v]";
		mes "�����āA�r�t���X�g�^���[�̔閧��";
		mes "�������玄�ɂ������Ă���B";
		mes "�N�ɂ͊��҂��Ă����A�͂͂́B";
		next;
		mes "�]���̗��l�Ƃ��b�����Ă݂悤�]";
		close;
	}
	mes "[���g���b�v]";
	mes "�ق����A����͂܂����������l�ł��ȁB";
	mes "�������ɂ�������Ⴂ�B";
	mes "���̖��O�̓��g���b�v���B";
	next;
	mes "[���g���b�v]";
	mes "�N�̓��[�����痈���񂾂ˁH";
	mes "�Ȃ�A����r����";
	mes "�r�t���X�g�^���[����������H";
	next;
	switch(select("�O���猩�������ł�","���ɓ����Ă݂�")) {
	case 1:
		mes "[���g���b�v]";
		mes "�������H�@�c�O���ȁB";
		mes "�܂��A���̃^���[�̒��ɂ�";
		mes "���낵�������X�^�[���������邩��ȁB";
		mes "���ʂɒ��킵�Ė����������͂����B";
		break;
	case 2:
		mes "[���g���b�v]";
		mes "�������A������������H";
		mes "����ł������̂�";
		mes "�ƂĂ������������W�]��Ƃ���";
		mes "�g��ꂽ�^���[�Ȃ񂾁B";
		next;
		mes "[���g���b�v]";
		mes "���͋��낵�������X�^�[������";
		mes "�Z�݉ƂɂȂ��Ă��邯�ǂȁB";
		mes "���̃^���[�ɓ����Ė�����";
		mes "�o�Ă����Ƃ��������ƁA";
		mes "�N�͑����Ȏ��͂������Ă���悤���ˁB";
		break;
	}
	next;
	mes "[���g���b�v]";
	mes "�^���[�̈�ԏ�ɂ�^0000FF�������B���p�t^000000��";
	mes "����Ƃ����\������B";
	mes "�Ȃ������ɂ���̂��͕�����Ȃ����A";
	mes "���Ȃ�̂��炢��炵���B";
	next;
	mes "[���g���b�v]";
	mes "�������̘B���p�t��";
	mes "���������Ă���̂ł���΁A";
	mes "�ނ͂��̑��݂�����";
	mes "���������j�ƌĂׂ邾�낤�B";
	next;
	mes "[���g���b�v]";
	mes "���̘B���p�t�ƃ^���[�ƃr�t���X�g��";
	mes "�G�N���[�W���������O����";
	mes "���݂��Ă����炵������ȁB";
	next;
	mes "[���g���b�v]";
	mes "���������̐l������";
	mes "�r�t���X�g�̓`����m��ׂ�";
	mes "�^���[�ɒ��킵�Ă��邪�A";
	mes "�܂����̉\�̐^����������������";
	mes "�҂͂��Ȃ��B";
	next;
	menu "���t�B�l�����́H",-;
	mes "[���g���b�v]";
	mes "��A���t�B�l�����H";
	mes "�ނ�͂Ȃ���������Ȃ����A";
	mes "�r�t���X�g�^���[���̂�";
	mes "���܂苻���������Ă��Ȃ��B";
	mes "�����̎��R���̂ЂƂƂ���";
	mes "�F�����Ă���悤�Ȃ񂾁B";
	next;
	mes "[���g���b�v]";
	mes "���������Ɣނ�̔\�͂ł���΁A";
	mes "�\���ɔ閧���������Ƃ�";
	mes "�ł���̂��낤���c�c";
	mes "�r�t���X�g�^���[���̂�";
	mes "���d���Ă���悤�Ȋ���������B";
	next;
	mes "[���g���b�v]";
	mes "�����A�^���[�ɒ��킵�Ă���҂�";
	mes "�~�߂��肵�Ă��Ȃ��̂�����ƁA";
	mes "�����l���Ă͂��Ȃ��̂����ȁH";
	mes "�N���C�ɂȂ�Ȃ璧�킵��";
	mes "�^���[�̔閧�������Ă݂Ȃ����B";
	next;
	setquest 7412;
	if(checkquest(7411) && checkquest(7412) && checkquest(7413)) {
		doevent "�G�N���[�W���K�[�h#tl01::OnStart";
	}
	mes "[���g���b�v]";
	mes "�����Ă����A�N���r�t���X�g�^���[��";
	mes "�閧���������Ƃ��ł�����A";
	mes "���ɋ����Ă���B";
	mes "�N�͏\���ɋ�������^���[��";
	mes "�T���ł��邾��B";
	mes "���ɂ�1�K�����E��������A�͂͂́B";
	next;
	mes "[���g���b�v]";
	mes "�������A���̗F�B�Ƃ��b���Ă݂����H";
	mes "�|�������ƃ`�[�o�[�N��";
	mes "����Ȃ�̏���";
	mes "�����Ă���͂�������";
	mes "�����Č��Ȃ����B";
	mes "��͂藷�l�ɏd�v�Ȃ̂͏�񂾂��I";
	next;
	mes "�]���̗��l�Ƃ��b�����Ă݂悤�]";
	close;
}

ecl_in01.gat,35,51,3	script	���l�`�[�o�[#tl03	514,{
	if(ECL_3QUE == 1) {
		mes "[�`�[�o�[]";
		mes "���A�G�N���[�W���K�[�h��";
		mes "�N��T���Ă�������H";
		mes "�����N���������Ȃ���΁A";
		mes "�ő�����t�B�l������";
		mes "���d����̂��������낤�B";
		mes "��������̊�{������B";
		close;
	}
	if(ECL_3QUE == 2) {
		mes "[�`�[�o�[]";
		mes "�G�N���[�W���K�[�h��";
		mes "�������ɍs�����񂶂�Ȃ����������H";
		mes "�r���œ��ɖ������̂ł����";
		mes "�����̏o������ɂ���K�[�h��";
		mes "�b���Ă݂Ȃ�B";
		mes "�ē����Ă����͂����B";
		close;
	}
	if(ECL_3QUE >= 8) {
		mes "[�`�[�o�[]";
		mes "�ނ��c�c���̐X�ɒ��킵�Ă݂悤���ȁH";
		mes "�������ȁH�@�������낤�ȁc�c";
		mes "�ӂށA���Ⴀ���g���b�v�����";
		mes "�^���[�ł��s���ė��邱�Ƃɂ��悤�B";
		close;
	}
	if(ECL_3QUE >= 3) {
		mes "[�`�[�o�[]";
		mes "�N�͕��ʂ̗��l�ł�";
		mes "�Ȃ������݂������ȁI";
		close;
	}
	if(checkquest(7411) && checkquest(7412) && checkquest(7413)) {
		doevent "�G�N���[�W���K�[�h#tl01::OnStart";
	}
	if(checkquest(7413)) {
		mes "[�`�[�o�[]";
		mes "���t�B�l�̉��ʌp���ɂ���";
		mes "��������ȋV�����K�v�Ȃ̂�";
		mes "�m���Ă��邯�ǁc�c";
		mes "��̓I�ɂǂ̂悤�ȋV���Ȃ̂���";
		mes "�����ǂ��m��Ȃ��񂾁B";
		next;
		mes "[�`�[�o�[]";
		mes "�����Ƒ������Ă���Ή��ʌp���Ƃ���";
		mes "���j�I�ȏu�Ԃɗ����������";
		mes "�m��Ȃ����ǁA";
		mes "���͈ꑫ�x�������񂾁c�c�B";
		next;
		mes "[�`�[�o�[]";
		mes "�}�����E�W�����̎�����";
		mes "���Ȃ蒷������A";
		mes "�����ڂ���@��͂Ȃ����낤�ȁB";
		mes "�͂͂́c�c";
		next;
		mes "�]���̗��l�Ƃ��b�����Ă݂悤�]";
		close;
	}
	mes "[�`�[�o�[]";
	mes "�~�b�h�K���h�̐l�Ԃ��ˁB";
	mes "�`�[�o�[�ł��B";
	mes "���Ă̒ʂ莄�����Ȃ��Ɠ���";
	mes "���l�Ȃ񂾁B";
	next;
	mes "[�`�[�o�[]";
	mes "��������ۂɈ�ԏd�v�Ȃ̂́A";
	mes "��͂茻�n�̏�񂾂ƍl���Ă���B";
	mes "���Ȃ��������v�����낤�H";
	next;
	if(NYD_1QUE >= 131) {
		mes "[�`�[�o�[]";
		mes "�������b�ł̓��g�D���w�C���ւ̓���";
		mes "�W���Ă���T����Ƃ������������";
		mes "�ʂ铹���ł����炵�����ǁc�c";
		mes "�{���ɂ��̖��̐X��ʂ��Ă���̂��ȁH";
		next;
		switch(select("�����ł�","���@�ŗ��܂���")) {
		case 1:
			mes "[�`�[�o�[]";
			mes "�Ȃ�قǁA�~�b�h�K���h��";
			mes "�l�Ԃ͋����񂾂ȁB";
			mes "���[���ŕ������b�ł�";
			mes "���̐X�̓����X�^�[������";
			mes "���H�҂������ƕ��������c�c";
			break;
		case 2:
			mes "[�`�[�o�[]";
			mes "�Ȃ�قǁc�c";
			mes "��Ƀ��[���ɓ�������";
			mes "�~�b�h�K���h�̐l������";
			mes "���@�Ŏx������Ƃ������Ƃ��H";
			mes "�������@���B";
			break;
		}
		next;
		mes "[�`�[�o�[]";
		mes "�����Ă���Ă��肪�Ƃ��B";
		mes "����ɋ����[���b��";
		mes "�����Ă����悤�B";
		mes "�A�[���u�w�C���ł�";
		mes "�N�ł��m���Ă��邯�ǁA";
		mes "�N�����͒m��Ȃ��͂����B";
	}
	else {
		mes "[�`�[�o�[]";
		mes "�T�t�@���ƃ��t�B�l���̐푈�ɂ��Ă�";
		mes "���Ȃ����m���Ă���ˁH";
		next;
		mes "[�`�[�o�[]";
		mes "�T�t�@���̍s���u���f�B�E���̌@���A";
		mes "���t�B�l���̎�삷��C�O�h���V����";
		mes "���������Ă���Ƃ������R�ŁA";
		mes "���t�B�l������d�|����ꂽ�푈���B";
		next;
		mes "[�`�[�o�[]";
		mes "�������c�c���͐M�����Ȃ��b��";
		mes "�������񂾁B";
		next;
		mes "�]�`�[�o�[�́A�����Ђ��߂đ������]";
		next;
		mes "[�`�[�o�[]";
		mes "���́A�T�t�@���̍̌@���C�O�h���V����";
		mes "���������Ă���Ƃ����̂́A";
		mes "���t�B�l���̊��Ⴂ�������c�c�B";
		mes "�T�t�@���ƃ��t�B�l���̐푈�́A";
		mes "���t�B�l���̊��Ⴂ��";
		mes "�n�܂����炵���񂾁B";
		emotion 0,"";
		next;
		mes "[�`�[�o�[]";
		mes "���̔������݂�Ɓc�c";
		mes "�����������Ȃ��悤���ˁB";
		mes "�^����T�蓖�Ă��̂��~�b�h�K���h��";
		mes "�l�Ԃ��ƕ����Ă����̂ŁA";
		mes "�����m���Ă���̂ł́A";
		mes "�Ǝv�����̂����c�c�B";
		next;
		mes "[�`�[�o�[]";
		mes "�܂��A�����B";
		mes "���̕��������e�����b�����悤�B";
		next;
		mes "[�`�[�o�[]";
		mes "�C�O�h���V���ɂ̓j�[�Y�w�b�O�Ƃ���";
		mes "���҂�����̂����A";
		mes "�ǂ������̃j�[�Y�w�b�O�Ɉٕς�";
		mes "�������炵���񂾁B";
		next;
		mes "[�`�[�o�[]";
		mes "�C�O�h���V���̐����́A";
		mes "�T�t�@���̍̌@�������ł͂Ȃ��A";
		mes "���҃j�[�Y�w�b�O�ٕ̈ς�";
		mes "�����������c�c�B";
		next;
		mes "[�`�[�o�[]";
		mes "������~�b�h�K���h�̐l�Ԃ��˂��~�߁A";
		mes "�T�t�@���ƃ��t�B�l���̂���Ȃ��";
		mes "�n�ʂ̎҂ɓ`�����炵���̂����c�c";
		mes "���̂Ƃ���A�푈���I������l�q��";
		mes "�Ȃ��񂾂�ȁc�c�B";
		next;
		mes "[�`�[�o�[]";
		mes "�����Ɉ����Ȃ��Ȃ��Ă���̂��A";
		mes "���邢�͐^���𕷂����҂�";
		mes "���̏d�傳�Ɉ��|����āA�^����";
		mes "����Ԃ��I�������Ă��܂����̂��A";
		mes "����͂킩��Ȃ��B";
		next;
		menu "���̘b�͖{���ł����H",-;
		mes "[�`�[�o�[]";
		mes "�������Ȃ��ɂ��`�������̂́A";
		mes "�u���v���B";
		mes "���́u���v��M���邩�M���Ȃ����A";
		mes "����̍s���Ɋ������ׂ���";
		mes "����Ƃ��e������Ȃ��ׂ����A";
		mes "��������߂�̂͂��Ȃ����g���B";
		next;
		mes "[�`�[�o�[]";
		mes "�������̂��Ȃ��ɁA��������߂�";
		mes "�ޗ����Ȃ��Ƃ����̂Ȃ�A";
		mes "���̍ޗ����W�߂�Ƃ����̂��A";
		mes "���̗L���Ȏg�������Ǝv�����B";
		next;
		mes "[�`�[�o�[]";
		mes "�������������A�G�N���[�W���ł����";
		mes "�����Ɗm���ȏ�񂪓�����̂ł�";
		mes "�Ȃ����Ǝv���āA�K�ꂽ�̂����A";
		mes "���̂Ƃ���͎��n�Ȃ�����B";
		mes "�͂͂́c�c";
		next;
		mes "[�`�[�o�[]";
		mes "�������B";
		mes "���Ȃ��͂����ɗ����΂��肾�낤�H";
		mes "���t�B�l���ɂ��āA";
		mes "�����Ɗ�{�I�ȏ���";
		mes "���������悤�B";
		next;
		mes "[�`�[�o�[]";
		mes "�A�[���u�w�C���ł�";
		mes "�N�ł��m���Ă��邯�ǁA";
		mes "�N�����͒m��Ȃ��͂����B";
	}
	next;
	mes "[�`�[�o�[]";
	mes "���t�B�l�����̒��ŁA���ɔw���傫���A";
	mes "���邢�畆�̐F�����Ă��āA";
	mes "�傫���h��ȉH�������Ă���";
	mes "���t�B�l�������݂����Ƃ����邾��H";
	next;
	mes "[�`�[�o�[]";
	mes "�ނ��^0000FF�u�h�i�v^000000�Ƃ����񂾁B";
	mes "��ʓI�ȏ����ȑ̂̃��t�B�l��";
	mes "�ނ�̌��t��^0000FF�u�p�p���v^000000�Ƃ����B";
	mes "�c�c�����ςȖ��̂�����";
	mes "���d���Ă�낤����Ȃ����B";
	next;
	mes "[�`�[�o�[]";
	mes "�h�i�����͑傫���ؗ�ȏ�ɁA";
	mes "���A���͂������Ď����������B";
	mes "���̂��߁A�̐��͏��Ȃ����A";
	mes "�قƂ�ǂ��v�E�œ����Ă���B";
	next;
	mes "[�`�[�o�[]";
	mes "����ɁA�h�i�����ɂ�";
	mes "�傫�Ȗ���������B";
	mes "����́A�G�N���[�W���ɂƂ���";
	mes "�����Ƃ��d�v�Ȃ��Ɓc�c";
	mes "�ނ�͂��ׂāA�}�����̌��A";
	mes "�������̌��Ȃ񂾁B";
	next;
	mes "[�`�[�o�[]";
	mes "���ʁA���Ƃ����΁A�e����q��";
	mes "�p���������̂����A";
	mes "���t�B�l�̉��͈Ⴄ�B";
	mes "�}�����E�W������^0000FF�h�i�̒�����A";
	mes "�����ɂ�����炸�����B^000000";
	next;
	mes "[�`�[�o�[]";
	mes "���̉�����C��";
	mes "���ʂ�����`���ł͂Ȃ��B";
	mes "�����[���b����H";
	next;
	mes "[�`�[�o�[]";
	mes "�P���Ƀh�i���㋉�ŁA�p�p����������";
	mes "���������̕��ނł͂Ȃ��B";
	mes "�C���ꂽ�����ŁA�͂������";
	mes "��ʂ���Ă���񂾁B";
	next;
	mes "[�`�[�o�[]";
	mes "�����A���t�B�l�̉��ʌp���ɂ���";
	mes "��������ȋV�����K�v�Ȃ̂�";
	mes "�m���Ă��邪�c�c";
	mes "��̓I�ɂǂ̂悤�ȋV���Ȃ̂���";
	mes "�����ǂ��m��Ȃ��񂾁B";
	next;
	mes "[�`�[�o�[]";
	mes "�����Ƒ������Ă���΁A���t�B�l��";
	mes "���ʌp���Ƃ������j�I�ȏu�Ԃ�";
	mes "������������m��Ȃ����A";
	mes "���͈ꑫ�x�������񂾁c�c�B";
	next;
	mes "[�`�[�o�[]";
	mes "�}�����E�W�����̎�����";
	mes "���Ȃ蒷������A";
	mes "�����ڂ���@��͂Ȃ����낤�ȁB";
	mes "�͂͂́c�c";
	next;
	setquest 7413;
	if(checkquest(7411) && checkquest(7412) && checkquest(7413)) {
		doevent "�G�N���[�W���K�[�h#tl01::OnStart";
	}
	mes "�]�`�[�o�[����";
	mes "�@���t�B�l�Ɋւ�����𓾂��B";
	mes "�@���̗��l�Ƃ��b�����Ă݂悤�]";
	close;
}

ecl_in01.gat,31,49,7	script	�G�N���[�W���K�[�h#tl01	447,{
	mes "[�G�N���[�W���K�[�h]";
	mes "���A�}���Ō��̏ꏊ�ɖ߂�Ȃ���";
	mes "���炵�܂��B";
	close2;
	hideonnpc "�G�N���[�W���K�[�h#tl01";
	end;
OnStart:
	hideoffnpc "�G�N���[�W���K�[�h#tl01";
	cutin "minuel01",4;
	mes "[�G�N���[�W���K�[�h]";
	mes "������ƁA���炵�܂��B";
	mes "�݂Ȃ���̒��Ƀ~�b�h�K���h����";
	mes "�������͂��܂��񂩁H";
	next;
	menu "���ł����H",-;
	mes "[�G�N���[�W���K�[�h]";
	mes "�����A���Ȃ��ł����I";
	mes "���Ȃ��ɂ���������Ƃ�������";
	mes "����܂��̂ŁA���������Ԃ�";
	mes "���������܂��񂩁H";
	next;
	mes "[�G�N���[�W���K�[�h]";
	mes "���������ł͂���܂��񂵁A";
	mes "��Q�������邱�Ƃ�����܂���B";
	mes "���b�𕷂����������ł��̂�";
	mes "�X�������肢���܂��B";
	next;
	mes "[�G�N���[�W���K�[�h]";
	mes "��낵�����";
	mes "�������ē��������܂���B";
	next;
	if(select("������܂���","���͂���ȗ]�T���Ȃ�") == 2) {
		mes "[�G�N���[�W���K�[�h]";
		mes "���A�����ł����H";
		mes "�d���Ȃ��ł��ˁB";
		mes "���ł��\���܂���̂�";
		mes "���Ԃ����鎞��";
		mes "����K�˂ė��Ă��������B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "�L��̓����ɂ���o������ɂ��܂��B";
		mes "�K���K�˂ė��Ă��������B";
		mes "���肢���܂��B";
		next;
		mes "�]�����ɉ�����ƌ����Ă���";
		mes "�@�l��������炵���B";
		mes "�@�G�N���[�W���K�[�h���ē���";
		mes "�@���Ă����炵���̂ŁA";
		mes "�@�G�N���[�W���K�[�h�̂Ƃ����";
		mes "�@�s���Ă݂悤�]";
		set ECL_3QUE,1;
		delquest 7411;
		delquest 7412;
		delquest 7413;
		setquest 7414;
		close2;
		hideonnpc "�G�N���[�W���K�[�h#tl01";
		cutin "minuel01",255;
		end;
	}
	mes "[�G�N���[�W���K�[�h]";
	mes "�ł́A�s���܂��傤�B";
	close;
	set ECL_3QUE,2;
	delquest 7411;
	delquest 7412;
	delquest 7413;
	setquest 7415;
	hideonnpc "�G�N���[�W���K�[�h#tl01";
	warp "ecl_in03.gat",244,89;
	end;
OnInit:
	hideonnpc "�G�N���[�W���K�[�h#tl01";
	end;
}

ecl_in01.gat,82,70,3	script	�G�N���[�W���K�[�h#tl02	447,{
	switch(ECL_3QUE) {
	case 0:
		cutin "minuel01",2;
		mes "[�G�N���[�W���K�[�h]";
		mes "�悤�����A�G�N���[�W���ցB";
		mes "�ό����y����ł��������B";
		close2;
		cutin "minuel01",255;
		end;
	case 1:
		cutin "minuel01",2;
		mes "[�G�N���[�W���K�[�h]";
		mes "���A���܂����ˁB";
		mes "���Ȃ��ɂ���������Ƃ������̏���";
		mes "�ē����Ă������ł����H";
		next;
		if(select("�s���܂��傤","���͂���ȗ]�T���Ȃ�")) {
			mes "[�G�N���[�W���K�[�h]";
			mes "���c�c�����ł����H";
			mes "�ł́A�����������҂����܂��B";
			next;
			cutin "minuel02",2;
			mes "[�G�N���[�W���K�[�h]";
			mes "���̂��Ƃ͋C�ɂ��Ȃ��ł��������B";
			mes "��N�ł��ꖜ�N�ł�������";
			mes "���҂����Ă���܂��̂ŁB";
			mes "���ꂪ�d���Ȃ̂ł��B";
			close2;
			cutin "minuel01",255;
			end;
		}
		mes "[�G�N���[�W���K�[�h]";
		mes "�ł́A�s���܂��傤�B";
		close2;
		set ECL_3QUE,2;
		chgquest 7414,7415;
		warp "ecl_in03.gat",244,89;
		end;
	case 2:
		cutin "minuel01",2;
		mes "[�G�N���[�W���K�[�h]";
		mes "�܂��p�����I����Ă��܂����ˁH";
		mes "������x���ē����܂��傤���H";
		next;
		if(select("���肢���܂�","�K�v����܂���") == 2) {
			mes "[�G�N���[�W���K�[�h]";
			mes "�����ł����H";
			mes "������܂����A�K�v�ł����";
			mes "���ł��K�˂ė��Ă��������B";
			close2;
			cutin "minuel02",255;
			end;
		}
		mes "[�G�N���[�W���K�[�h]";
		mes "�ł́A�s���܂��傤�B";
		close2;
		warp "ecl_in03.gat",244,89;
		end;
	case 3:
		cutin "minuel01",2;
		mes "[�G�N���[�W���K�[�h]";
		mes "�ǂ�������܂��ˁB";
		mes "�R�Q�d��������邽�߂�";
		mes "�\�������Ă������̂́A";
		mes "���łɒʒm���󂯂Ēm���Ă��܂��B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "�������ē����Ă�";
		mes "���v�Ȏ��Ԃ̂悤�ł��B";
		mes "���������ē����܂��傤���H";
		next;
		if(select("���肢���܂�","�܂����܂�") == 2) {
			mes "[�G�N���[�W���K�[�h]";
			mes "���D���Ȃ悤�ɂ��Ă��������B";
			mes "�ł��A���܂�ɂ��҂������";
			mes "�}�����E�W������";
			mes "�{�邩������܂��񂪁c�c";
			close2;
			cutin "minuel02",255;
			end;
		}
		mes "[�G�N���[�W���K�[�h]";
		mes "�ł́A���ē����܂��B";
		set ECL_3QUE,4;
		chgquest 7416,72280;
		close2;
		warp "ecl_in03.gat",54,83;
		end;
	case 4:
		cutin "minuel01",2;
		mes "[�G�N���[�W���K�[�h]";
		mes "�~�[�e�B���O���[����";
		mes "���ē����܂��傤���H";
		next;
		if(select("���肢���܂�","���v�ł�") == 2) {
			mes "[�G�N���[�W���K�[�h]";
			mes "���肪�Ƃ��������܂��B";
			mes "���܂�ɂ��p�ɂɂ���������̂ŁA";
			mes "���̂��Ƃ���ԓ]���S����";
			mes "�Ԉ���Ă���̂��Ǝv���܂����B";
			close2;
			cutin "minuel02",255;
			end;
		}
		mes "[�G�N���[�W���K�[�h]";
		mes "�ł́A���ē����܂��B";
		close2;
		warp "ecl_in03.gat",54,83;
		end;
	case 5:
		if(ECL_3QUE_sub & 0x2) {
			cutin "minuel01",2;
			mes "[�~�j���G��]";
			mes "���C�������X�^�[�f�ނŏ�������A";
			mes "���ӂ̔���������������ł��I";
			mes "������������A���ꂪ���s��";
			mes "�����N������������܂���B";
			close2;
			cutin "minuel01",255;
			end;
		}
		if(checkquest(7418)) {
			if(countitem(6032) < 5 || countitem(6023) < 5 || countitem(944) < 5) {
				cutin "minuel01",2;
				mes "[�~�j���G��]";
				mes "�q���X���I���̊p�A���͂̊p�A";
				mes "�n�̂ЂÂ߂��e5�����肢���܂��B";
				mes "���͂̊p�̓X�v�����f�B�b�h��";
				mes "�ߕӂɂ���R���k�X����";
				mes "���肷�邱�Ƃ��ł��܂��B";
				next;
				mes "�]�q���X���I���̊p�A���͂̊p�A";
				mes "�@�n�̂ЂÂ߂��e5���W�߁A";
				mes "�@�~�j���G���ɓ͂��悤�]";
				close2;
				cutin "minuel01",255;
				end;
			}
			cutin "minuel01",2;
			mes "[�~�j���G��]";
			mes "�������߂�ɂȂ�܂������H";
			mes "�i�����m�F�������܂��B";
			mes "���[�Ɓc�c";
			next;
			mes "[�~�j���G��]";
			mes "������x�L�Y������̂�";
			mes "���̕��A�쐫�����o�܂��ˁB";
			mes "�f���炵���ł��A����J�l�ł����B";
			cutin "minuel02",2;
			next;
			delitem 6032,5;
			delitem 6023,5;
			delitem 944,5;
			set ECL_3QUE_sub,ECL_3QUE_sub|2;
			delquest 7418;
			getexp 200000,0;
			getexp 0,200000;
			if(ECL_3QUE_sub & 0x7 == 0x7) {
				mes "[�~�j���G��]";
				mes "���������΁A���ȊO��";
				mes "���t�B�l�������痊�܂ꂽ�d�����A";
				mes "�����ɂ��Ȃ��������ł��ˁB";
				mes "�����������v�Ȃ̂ŁA";
				mes "�}�����E�W�����̏���";
				mes "�s���Ă��������B";
				cutin "minuel01",2;
				next;
				mes "[�~�j���G��]";
				mes "�ǂ��^�C�~���O�ł��̕��̈ӎv��";
				mes "�`����̂����̎d���B";
				mes "���͂��ꂪ�����ƍl���Ă���܂��B";
				set ECL_3QUE,6;
				set ECL_3QUE_sub,0;
				chgquest 7417,7421;
				next;
				mes "[�~�j���G��]";
				mes "����ɂ��Ă��A���܂�ɂ��p�ɂ�";
				mes "��������̂ŁA��ڂ���";
				mes "�Ƃ��������Ƃ������c�c";
				mes "�܂��A���ꂾ���̂��Ƃł����B";
				close2;
				cutin "minuel01",255;
				end;
			}
			mes "[�~�j���G��]";
			mes "���̂����ǂ��m�点������Ǝv���܂��B";
			mes "���҂��Ă��Ă������ł���B";
			close2;
			cutin "minuel01",255;
			end;
		}
		cutin "minuel01",2;
		mes "[�G�N���[�W���K�[�h]";
		mes "���A�܂�������܂����ˁB";
		mes "���̂悤�ɕp�ɂɂ�������";
		mes "�킩���Ă�����A";
		mes "�n�߂��炫����ƈ��A��";
		mes "���Ēu���΂悩�����ł��B";
		next;
		mes "[�~�j���G��]";
		mes "���̓~�j���G���ƌ����܂��B";
		mes "�悭���閼�O�ł��B";
		mes "���̈Ӗ�������̂��͂킩��܂���B";
		mes "���Ԃ�A���e���Ăт₷�����O��";
		mes "�����񂾂Ǝv���܂��B";
		next;
		mes "[�~�j���G��]";
		mes "���������΁A�\�𕷂��܂����B";
		mes "�G�N���[�W���œ����悤�ɂȂ����Ɓc�c";
		cutin "minuel02",2;
		next;
		if(select("�f�^������","���݂������Ƃ͂���H") == 1) {
			mes "[�~�j���G��]";
			mes "���H�@�����Ȃ�ł����H";
			mes "���Ȃ��Ƀs�b�^���̎d����";
			mes "�������̂Ɏc�O�ł��ˁB";
			mes "��A������܂����B";
			close2;
			cutin "minuel01",255;
			end;
		}
		mes "[�~�j���G��]";
		mes "���������Ǝ��͏�ɂ����ɂ���̂�";
		mes "�l�I�Ȏ��Ԃ������s�����Ă��܂��B";
		mes "�������ł͂Ȃ��A���̊֘A�̎d����";
		mes "���Ă��郉�t�B�l�����݂͂��";
		mes "�������Ǝv���܂����ǁc�c�B";
		cutin "minuel01",2;
		next;
		mes "[�~�j���G��]";
		mes "�Ȃ̂ŁA���C�����邽�߂̍ޗ���";
		mes "�W�߂鎞�Ԃ��Ȃ��̂ł��B";
		mes "�������ʂ����f�R���[�V������";
		mes "�{�������Ǝv���Ă���̂Ɂc�c";
		next;
		mes "[�~�j���G��]";
		mes "�����ŁA����������グ�܂��̂�";
		mes "���C���f�R���[�V��������";
		mes "�ޗ����W�߂Ă���܂��񂩁H";
		next;
		if(select("�킩����","���₾") == 2) {
			mes "[�~�j���G��]";
			mes "�����A�f���ł����H";
			mes "�ł������ƁA���Ȃ��͂���";
			mes "���������ɗ��Ă����͂��ł��B";
			mes "����܂ł��҂����Ă��܂��B";
			cutin "minuel02",2;
			close2;
			cutin "minuel02",255;
			end;
		}
		mes "[�~�j���G��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�K�v�ȍޗ��́A";
		mes "^0000ff�q���X���I���̊p�A���͂̊p�A";
		mes "�n�̂ЂÂ߂��e5����^000000�ł��B";
		next;
		mes "[�~�j���G��]";
		mes "�ޗ��͎����s�����Ƃ̂ł��Ȃ�";
		mes "�X�v�����f�B�b�h�̋߂��ɂ���";
		mes "�����X�^�[����邱�Ƃ�";
		mes "����ł��镨�̒����猈�߂܂����B";
		next;
		mes "[�~�j���G��]";
		mes "���̍ޗ����g���ă��C���A";
		mes "�쐫���̒��ɂ���������";
		mes "����悤�ɏ����Ă݂����ł��B";
		next;
		mes "[�~�j���G��]";
		mes "�q���X���I���͉\�ŕ�������ł����A";
		mes "�r�t���X�g�k����";
		mes "�T�t�@�̗̈�Ō������邱�Ƃ�";
		mes "�ł��邻���ł��B";
		mes "���̊p�ƁA�����̃R���k�X�̖��͂̊p�B";
		mes "�����Ĕn�̂ЂÂ߂Ƃ������B";
		next;
		mes "[�~�j���G��]";
		mes "�n�̂ЂÂ߂Ɋւ��Ă�";
		mes "����肠�Ȃ����ڂ����Ǝv���܂��B";
		mes "�ł́A�X�������肢���܂��B";
		next;
		mes "�]�q���X���I���̊p�A���͂̊p�A";
		mes "�@�n�̂ЂÂ߂��e5���W�߁A";
		mes "�@�~�j���G���ɓ͂��悤�]";
		setquest 7418;
		close2;
		cutin "minuel02",255;
		end;
	case 6:
		cutin "minuel01",2;
		mes "[�~�j���G��]";
		mes "�}�����E�W���������Ăтł��B";
		mes "���͂����܂ňē����Ă�������";
		mes "�]�T���Ȃ��̂ŁA����͌�����";
		mes "�������������܂��B";
		next;
		mes "[�~�j���G��]";
		mes "���̏o������o�čs���ĎU������";
		mes "�i���2�K��ɂ������";
		mes "�~�[�e�B���O���[���̓����ł��B";
		mes "������ɍs���Ă݂Ă��������B";
		close2;
		cutin "minuel01",255;
		end;
	case 7:
		cutin "minuel01",2;
		mes "[�~�j���G��]";
		mes "�܂�������܂����ˁB";
		mes "�Q�d�ł����H";
		next;
		mes "[�~�j���G��]";
		mes "�܂��A�U������ʂ��ď�̊K��";
		mes "�s���܂��B";
		mes "���������̉E��ɉ�c�ꂪ";
		mes "����܂��̂ŁA";
		mes "�����ɂ�������Ⴂ�܂��B";
		close2;
		cutin "minuel01",255;
		end;
	case 16:
	case 17:
		cutin "minuel01",2;
		mes "[�~�j���G��]";
		mes "���������{�Ɋ���ė�����ł����H";
		next;
		menu "�V�i�C�����x�����Ă��閂�w�҂ɂ��ĕ���",-;
		mes "[�~�j���G��]";
		mes "�R�Q�d�����w�҂�";
		mes "�x�����Ă����̂ł����H";
		mes "�܂������m��܂���ł����c�c";
		mes "�c�c����A���������΁c�c";
		mes "���c�c����Łc�c";
		next;
		menu "�S������𕷂�",-;
		mes "[�~�j���G��]";
		mes "�A��̍ۂɁA";
		mes "���̕����ɂ悭�s����Ă��܂����B";
		mes "�R�Q�d�̃��C�͔��Ε����Ȃ̂ɁB";
		next;
		mes "[�~�j���G��]";
		mes "����ŁA�N���Ɖ���Ă���̂��Ȃ�";
		mes "�v���Ă��܂����B";
		mes "���̘b�𕷂�����ōl����ƁA";
		mes "���ꂪ���Ԃ�A�x�����Ă���Ƃ���";
		mes "���w�҂ł́H";
		next;
		mes "[�~�j���G��]";
		mes "�������A�����ł����c�c";
		mes "�܁A���̂悤�Ȃ��Ƃł�";
		mes "�͂ɂȂ��̂ł����";
		mes "�������ł��B";
		next;
		mes "�]�R�Q�d�V�i�C���́A";
		mes "�@���g�̃��C������̂Ƃ͔��Ε�����";
		mes "�@���̕��p�ɁA�悭�s���Ă���炵���B";
		mes "�@��x�q�V�G�ɕ񍐂����悤�]";
		cutin "minuel02",2;
		set ECL_3QUE,18;
		chgquest 7439,7440;
		close2;
		cutin "minuel02",255;
		end;
	default:
		if(checkquest(7428)) {
			cutin "minuel01",2;
			mes "[�~�j���G��]";
			mes "�p�ӂ��ė��Ăق����̂�";
			mes "�q���X���I���̊p�A���͂̊p�A";
			mes "�n�̂ЂÂ߂��e10����";
			mes "���肢���܂��B";
			next;
			mes "�]�q���X���I���̊p�A���͂̊p�A";
			mes "�@�n�̂ЂÂ߂��e10���W�߁A";
			mes "�@�~�j���G���ɓ͂��悤�]";
			close2;
			cutin "minuel02",255;
			end;
		}
		cutin "minuel01",2;
		mes "[�~�j���G��]";
		mes "���������Ԃ���܂����H";
		mes "���̑O���肵�Ă���������";
		mes "�����X�^�[�̍ޗ����F�B�̊Ԃ�";
		mes "���s���Ă��܂��܂��āc�c";
		mes "����������ɓ���Ăق�����ł����A";
		mes "���肢�ł��܂����H";
		next;
		if(select("�����󂯂�","�f��") == 2) {
			mes "[�~�j���G��]";
			mes "�c�O�ł��ˁc�c";
			mes "�܂����x���肢���܂��B";
			close2;
			cutin "minuel02",255;
			end;
		}
		mes "[�~�j���G��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���̑O�p�ӂ��Ă��ꂽ";
		mes "�q���X���I���̊p�A���͂̊p�A";
		mes "�n�̂ЂÂ߂��e10����";
		mes "���肢���܂��B";
		next;
		mes "[�~�j���G��]";
		mes "�F�B�̊Ԃł����C���h�ȏ��肪";
		mes "���s���Ă��܂��܂����B";
		mes "�͂͂́c�c";
		mes "�ł́A���͂����ł��҂����܂��B";
		next;
		mes "�]�q���X���I���̊p�A���͂̊p�A";
		mes "�@�n�̂ЂÂ߂��e10���W�߁A";
		mes "�@�~�j���G���ɓ͂��悤�]";
		setquest 7428;
		close2;
		cutin "minuel02",255;
		end;
	}
}

ecl_in03.gat,245,93,5	script	�R�Q�d	435,{
	switch(ECL_3QUE) {
	case 2:
		mes "[�R�Q�d]";
		mes "�G�N���[�W���ɂ悤�����B";
		mes "���}���܂��B";
		mes "�������Ȃ������Ăт��܂����B";
		next;
		mes "[�V�i�C��]";
		mes "�X�v�����f�B�b�h�O����n�ɑ�����";
		mes "���ׂĂ̌R���i��S�����Ă��܂��B";
		mes "�V�i�C���Ɛ\���܂��B";
		next;
		mes "[�V�i�C��]";
		mes "���[���ɑ������������̕⋋�i���c�c";
		mes "���ށc�c���c�c";
		mes "���݂܂���B";
		mes "�ŋ߁A���ɂ��p�ɂɋN���Ă��āc�c";
		next;
		mes "[�V�i�C��]";
		mes "�����܂��傤�B";
		mes "���[������⋋�i�𖶂̐X��ʉ߂���";
		mes "�X�v�����f�B�b�h�܂ő����";
		mes "�z�B���Ă���Ă���҂����������";
		mes "�����܂����B";
		next;
		if(BIF_1QUE >= 181) {	// �r�t���X�g�N�G�X�g�B���ς�? ���m�F
			mes "[�V�i�C��]";
			mes "���̂悤�ɒ��ڂ���ł���";
			mes "�������ł��B";
			mes "���Ȃ��ȊO�ɂ��A�z�B����`���Ă��ꂽ";
			mes "���X���ꑫ��ɃG�N���[�W����";
			mes "���炵�Ă��āA�����悤�ɂ�����";
			mes "���܂����B";
		}
		else {
			mes "[�V�i�C��]";
			mes "����̓~�b�h�K���h���痈��";
			mes "�l�Ԃ����Ƃ̂��ƁB";
			mes "����ŁA�G�N���[�W����K�ꂽ";
			mes "�~�b�h�K���h�̕��������A";
			mes "���̂悤�ɂ���������";
			mes "���b���f���Ă���܂��B";
		}
		next;
		mes "[�V�i�C��]";
		mes "�c�c���A���ނށc�c";
		next;
		mes "[�V�i�C��]";
		mes "�c�c���A�������ςȕ\��������̂�";
		mes "���ɂ̂����ł��B";
		mes "������Ȃ��ł��������B";
		mes "�ƁA�Ƃɂ����b�𑱂��܂��c�c";
		next;
		mes "[�V�i�C��]";
		mes "���낻��{��ɓ���܂��B";
		mes "�������Ȃ��ɉ�����������R�ł��B";
		next;
		mes "[�V�i�C��]";
		mes "���łɂ������̂Ƃ���A";
		mes "�r�t���X�g�ɔ�������";
		mes "����ȋT��̂����ŁA";
		mes "�X�v�����f�B�b�h�Ƃ̌𗬂�";
		mes "�r�₦�Ă��܂��B";
		next;
		if(NYD_1QUE >= 131) {
			mes "[�V�i�C��]";
			mes "�X�v�����f�B�b�h�́A";
			mes "�C�O�h���V������邽�߁A";
			mes "��X�����g�D���w�C���ɍ����";
			mes "�O����n�ł��B";
			mes "�T�t�@���ɑ΍R���邽�߂ɔ���";
			mes "�d�v�ȏꏊ�ł��B";
			next;
			mes "[�V�i�C��]";
			mes "�������A�r�t���X�g�ɔ�������";
			mes "�T��ɂ��A�X�v�����f�B�b�h��";
			mes "�󋵂��m�F���邱�Ƃ��ł��Ȃ��Ȃ���";
			mes "���܂����̂ł��B";
			next;
			mes "[�V�i�C��]";
			mes "�����ŁA�~�b�h�K���h��";
			mes "���l�����Ăт��āA";
			mes "�ŋ߂̃X�v�����f�B�b�h��";
			mes "���g�D���w�C���̏󋵂ɂ���";
			mes "���b�𕷂��Ă���܂��B";
			next;
			mes "[�V�i�C��]";
			mes "�����X�v�����f�B�b�h�ߕӂł�";
			mes "�T�t�@���Ƃ̑Η��ɂ��āA";
			mes "�������������ƁA�m���Ă��邱�Ƃ�";
			mes "����܂��񂩁H";
			next;
			mes "�]�j�[�Y�w�b�O�̑��ł�";
			mes "�@�o�������v���o���Ă����B";
			mes "�@�C�O�h���V���̐����́A";
			mes "�@�T�t�@���̍̌@�������ł͂Ȃ��A";
			mes "�@���҃j�[�Y�w�b�O�ٕ̈ς�";
			mes "�@�����������]";
			next;
			mes "�]�R�Q�d�V�i�C���ɁA���̂��Ƃ�";
			mes "�@�`����Ă���̂��낤���B";
			mes "�@�m�F���Ă݂�̂��ǂ��������]";
		}
		else {
			mes "[�V�i�C��]";
			mes "���t�B�l�͖��̐X�ƃr�t���X�g��";
			mes "�ӎv�ɂ͋t�炦�܂���B";
			mes "����̓A�[���u�w�C���̂��ׂĂ̗d����";
			mes "���ʂ���b�ł��B";
			mes "���̂��߁A��X�ł̓X�v�����f�B�b�h��";
			mes "�󋵂��m�F���邱�Ƃ��ł����c�c�B";
			next;
			mes "[�V�i�C��]";
			mes "�����ŁA���Ȃ����~�b�h�K���h��";
			mes "���l����A�ŋ߂̃X�v�����f�B�b�h��";
			mes "���g�D���w�C���̏󋵂ɂ���";
			mes "���b�𕷂��Ă���܂��B";
			next;
			mes "[�V�i�C��]";
			mes "�������b���ƁA���݂̓T�t�@���Ƃ�";
			mes "�Η��󋵂́A�x��ɋ߂�";
			mes "���N��Ԃ炢�����ł����c�c";
			mes "����͉�X�̕����̎x����������߂�";
			mes "���̂悤�ɂȂ����̂ł��傤���H";
			next;
			mes "�]�V�i�C���̎���ɑ΂��A";
			mes "�@�L�����Ă�������";
			mes "�@�����݂̏�Ԃ���������]";
			next;
			mes "[�V�i�C��]";
			mes "�Ȃ�قǁc�c";
			next;
			mes "�]���t�B�l���ƃT�t�@���Ƃ�";
			mes "�@�Η��ɂ��āA���l�`�[�o�[����";
			mes "�@�������b���v���o�����B";
			mes "�@�R�Q�d�V�i�C���́A���̓��e��";
			mes "�@�m���Ă���̂��낤���B";
			mes "�@�m�F���Ă݂�̂��ǂ��������]";
		}
		next;
		menu "���������΁c�c",-;
		mes "[�V�i�C��]";
		mes "�͂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ȃ������ƃT�t�@���Ƃ̐푈�̌�����";
		mes "�T�t�@�����C�O�h���V���𐊂�������";
		mes "���Ƃ��������ƂȂ��ċN����";
		mes "�C�O�h���V�����푈����";
		mes "�����Ă��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "���̒ʂ�ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������A�����m���Ă���^����";
		mes "����Ƃ͂�����ƈႢ�܂��B";
		next;
		mes "�]�V�i�C���̕\��킸����";
		mes "�@�c�񂾁B";
		mes "�@����͓��ɂɂ����̂ł�";
		mes "�@�Ȃ��������]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�\�ʓI�Ȍ����͊m���ɃT�t�@����";
		mes "�̌@�ɂ��C�O�h���V����";
		mes "�����ł����c�c";
		next;
		mes "[�V�i�C��]";
		mes "���҂����������B";
		next;
		mes "�]�V�i�C���ɁA�������q��";
		mes "�@���t���Ղ�ꂽ�]";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�V�i�C��]";
		mes "���̐푈�͐���ł��B";
		mes "�C�O�h���V�������Ƃ���";
		mes "��X�̎g��������������c�c";
		mes "���������������̃v���C�h��";
		mes "�����čs���Ă���푈�Ȃ̂ł��B";
		next;
		mes "[�V�i�C��]";
		mes "���Ȃ����������Ƃ��Ă��邱�ƁA";
		mes "����ɂ���Ĉ����N����g��B";
		mes "���Ȃ��͂��̐ӔC����邱�Ƃ�";
		mes "�ł��܂����H";
		next;
		mes "[�V�i�C��]";
		mes "�����ӔC����邱�Ƃ��ł��Ȃ��Ȃ�";
		mes "�����b���Ȃ��ł��������B";
		next;
		menu "�^�����B���Ă���̂ł����H",-;
		mes "[�V�i�C��]";
		mes "�c�c�c�c�B";
		next;
		mes "�]�V�i�C���͔��Ԃɂ�����񂹁A";
		mes "�@�[���l������ł���]";
		next;
		menu "�V�i�C������H",-;
		mes "[�V�i�C��]";
		mes "�c�c���Ȃ��̌����Ƃ��Ă��邱�ƁA";
		mes "����͐��E���C�O�h���V����";
		mes "���҂̖��ł��B";
		next;
		mes "[�V�i�C��]";
		mes "����������̂͂����܂łł��B";
		mes "���Ȃ��������Ă���^��ɂ́A";
		mes "���͂��������鎖���ł��܂���B";
		next;
		mes "[�V�i�C��]";
		mes "���Ȃ��̘b�𕷂��͎̂��ł͂Ȃ�";
		mes "��X�̉��}�����E�W�����łȂ��Ă�";
		mes "�Ȃ�܂���B";
		next;
		mes "[�V�i�C��]";
		mes "�}�����E�W�����ɂ���ł�����";
		mes "�p�ӂ��܂��傤�B";
		next;
		mes "�]�V�i�C���͉�b�̓r����";
		mes "�@�ēx���ɂ��n�܂����悤��";
		mes "�@��������߂��B";
		mes "�@���ɂ����܂����悤�ŕ\�";
		mes "�@���ɖ߂�����A�b�𑱂����]";
		next;
		mes "[�V�i�C��]";
		mes "������񂠂Ȃ����M���Ă���";
		mes "���̐^���́A�b���鎞�Ԃ�����܂�";
		mes "�N�ɂ��b���Ȃ��Ɩ񑩂��Ă��������B";
		next;
		if(select("�񑩂���","�f��") == 2) {
			while(1) {
				mes "[�V�i�C��]";
				mes "����܂����ˁB";
				mes "���Ȃ����Ύ�ɂȂ邱�Ƃ�";
				mes "�]��ł��܂���B";
				next;
				mes "[�V�i�C��]";
				mes "�}�����E�W�����Ƙb�������O��";
				mes "����Ȃ��Ƃ����̂�����ق�";
				mes "����ł����H";
				next;
				if(select("����Ȃ��l�ɂ���","���") == 1) {
					mes "[�V�i�C��]";
					mes "�����ł����B";
					next;
					break;
				}
				mes "[�V�i�C��]";
				mes "�ނ��c�c";
				mes "����ł͂��Ȃ����g�̗��ꂪ";
				mes "�����Ȃ邾���ł���c�c";
				next;
			}
		}
		mes "[�V�i�C��]";
		mes "���Ȃ��̂��Ƃ�";
		mes "�}�����E�W�����ɓ`���A";
		mes "��ꏊ��p�ӂ��Ă����܂��B";
		next;
		mes "[�V�i�C��]";
		mes "���Ȃ��������܂ňē������K�[�h��";
		mes "�`���Ă����܂��B";
		mes "�ނɂ��Ȃ����ē������܂��傤�B";
		next;
		mes "[�V�i�C��]";
		mes "�ł́A�G�N���[�W����";
		mes "�y����ł��������B";
		mes "�L��܂ő����č��������܂��B";
		mes "�������A���Ȃ����ē�����K�[�h��";
		mes "�L��̓��̏o���ɂ��܂��B";
		mes "�Y��Ȃ��ł��������B";
		next;
		mes "�]�V�i�C���̓��t�B�l���̉�";
		mes "�@�}�����E�W�����Ƙb����悤";
		mes "�@��z���Ă����炵���B";
		mes "�@�G�N���[�W���L��̓����o���ɂ���";
		mes "�@�G�N���[�W���K�[�h�Ɉē�����";
		mes "�@���炨���]";
		set ECL_3QUE,3;
		chgquest 7415,7416;
		close2;
		warp "ecl_in01.gat",47,28;
		end;
	case 3:
		mes "[�V�i�C��]";
		mes "�ē��̓K�[�h�ɔC���Ă��܂��B";
		mes "���݂܂��񂪁A���̎���";
		mes "�Ȃ��O�����Ƃ��ł��܂���B";
		next;
		mes "[�V�i�C��]";
		mes "�G�N���[�W���L��̓����̏o������";
		mes "�K�[�h�����܂��B";
		mes "�ނɘb�����Ă����܂����̂�";
		mes "�ē����Ă�����Ă��������B";
		close;
	case 4:
		mes "[�V�i�C��]";
		mes "���Ȃ��̍l�����}�����E�W������";
		mes "�`���邱�Ƃ͂ł��܂������H";
		mes "����͂��̕�������ł��傤�B";
		next;
		mes "[�V�i�C��]";
		mes "����c�c�H";
		mes "�܂��̂悤�ł��ˁB";
		mes "�K�[�h�Ɉē������Ă�����Ă��������B";
		close;
	case 5:
		mes "[�V�i�C��]";
		mes "���Ȃ��ɂ��Ă̘b�͕����܂����B";
		mes "�G�N���[�W���̂��߂ɓ������Ƃ�";
		mes "�����悤�ł��ˁH";
		next;
		mes "[�V�i�C��]";
		mes "�r�t���X�g�ւ̓�����";
		mes "���C�Ƃ����`�߂��҂��Ă���͂��ł��B";
		next;
		mes "[�V�i�C��]";
		mes "�X�v�����f�B�b�h�ƒ���I�ȘA����";
		mes "���邽�߂ɑ������`�߂Ȃ�ł����A";
		mes "�܂��ނł͖����������悤�ł��B";
		next;
		mes "[�V�i�C��]";
		mes "���͂��Ă��ꂽ��A";
		mes "�����̃��t�B�l������";
		mes "���Ȃ��̂��Ƃ�F�߂�Ǝv���܂��B";
		close;
	case 6:
		mes "�]�V�i�C���͓����ɂ�����";
		mes "�@�Ў�ł��߂��݂��������Ă���]";
		next;
		mes "[�V�i�C��]";
		mes "�ŋ߂ɂȂ��ē��ɂ������";
		mes "�����Ȃ�܂����B";
		mes "�c�c�����͉��̂��p�ł����H";
		mes "���Ȃ��̂��Ƃ��}�����E�W������";
		mes "�Ă�ł����Ǝv���܂����B";
		mes "���̕��̏��ɍs���Ă݂Ă��������B";
		close;
	case 7:
		mes "[�V�i�C��]";
		mes "�悤�����B";
		mes "�}�����E�W�����ɔF�߂�ꂽ";
		mes "�ٖM�l��B";
		next;
		menu "�����󂯎���čs���悤�ɂƌ���ꂽ���ǁc�c",-;
		mes "[�V�i�C��]";
		mes "�͂��A�}�����E�W��������";
		mes "���Ȃ��ւ̑��蕨��a�����Ă��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "����Ȃɑ債�����ł͂���܂��񂪁A";
		mes "�N�ɂł��g������������Ă���";
		mes "���ł͂���܂���B";
		mes "�y���U��ƁA���ł��G�N���[�W����";
		mes "���邱�Ƃ��ł��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "���̂��߂ɓ����ҁA";
		mes "���Ȃ��ɂӂ��킵�����ł��B";
		next;
		if(checkitemblank() == 0) {
			mes "[�V�i�C��]";
			mes "����c�c";
			mes "����������������悤�ł��B";
			mes "�������𐮗����Ă���A";
			mes "������x�b�������Ă��������B";
			close;
		}
		mes "�]���蕨���󂯎�������A";
		mes "�@�܂��J���f���C�������l����";
		mes "�@����̂��A���肩�˂镔��������B";
		mes "�@�����߂��ɂ���x�e���̃��t�B�l��";
		mes "�@���l�|���A���ɂ���b���̃��t�B�l�A";
		mes "�@�G�N���[�W���K�[�h�E���I����A";
		mes "�@���ɂ��Ă̏����W�߂Ă݂悤�]";
		set ECL_3QUE,8;
		chgquest 7422,72253;
		getitem 2916,1;
		close;
	case 8:
	case 9:
	case 10:
	case 11://?
	case 12://?
	case 13://?
		mes "[�V�i�C��]";
		mes "�ŋ߁A�F��Ȏd����";
		mes "��`���Ă���݂����ł��ˁH";
		mes "��ςł��ˁB";
		close;
	case 14:
		mes "[�V�i�C��]";
		mes "�����A�悤�₭�������B";
		mes "�ŋ߁A�r�t���X�g�^���[��";
		mes "�s���Ă���炵���ł��ˁH";
		mes "�����ŁA�ЂƂ��肢������";
		mes "���Ƃ�����܂��B";
		next;
		mes "[�V�i�C��]";
		mes "�����x�����Ă��閂�w�҂�����̂ł���";
		mes "�����ޗ��Ƃ��Ă���������Ȃ�����";
		mes "����炵���B";
		mes "������r�t���X�g�^���[�Ŏ�ɓ����";
		mes "�ق�����ł��B";
		next;
		mes "[�V�i�C��]";
		mes "���肢���Ă������ł����H";
		mes "�������A����Ȃ�̂����";
		mes "�p�ӂ������܂��B";
		next;
		if(select("������܂���","�f��܂�") == 2) {
			mes "[�V�i�C��]";
			mes "�}�Ȃ��肢�ł�������ˁB";
			mes "�܂��A�d�����Ȃ��ł��ˁB";
			mes "���̕��ɗ���ł݂܂��B";
			close;
		}
		mes "[�V�i�C��]";
		mes "�}�Ȃ��肢�ň����󂯂Ă��炦�邩";
		mes "�s���������̂ł����A���������󂯂�";
		mes "���������A���肪�Ƃ��������܂��B";
		mes "�ł́A���ꂩ�猾������";
		mes "�W�߂Ă��������B";
		next;
		mes "[�V�i�C��]";
		mes "^0000ff�ق���̉�A�����t�̂�����^000000�ł��B";
		mes "�r�t���X�g�^���[�œ���ł��܂��B";
		mes "^0000ff���ꂼ��10����^000000���肢���܂��B";
		next;
		mes "�]�r�t���X�g�^���[�ŁA�ق���̉�A";
		mes "�@�����t�̂������10���W�߁A";
		mes "�@�V�i�C���ɓ͂��悤�]";
		set ECL_3QUE,15;
		chgquest 7436,7437;
		close;
	case 15:
		if(countitem(6560) < 10 || countitem(6561) < 10) {
			mes "[�V�i�C��]";
			mes "^0000ff�ق���̉�A�����t�̂������";
			mes "�e10����^000000�ł��B";
			mes "�r�t���X�g�^���[�œ���ł��܂��B";
			next;
			mes "�]�r�t���X�g�^���[�ŁA�ق���̉�A";
			mes "�@�����t�̂������10���W�߁A";
			mes "�@�V�i�C���ɓ͂��悤�]";
			close;
		}
		mes "[�V�i�C��]";
		mes "��ɓ���ė��܂����ˁI";
		mes "���肪�Ƃ��������܂��B";
		mes "���̂��炢����Γ�����";
		mes "���Ȃ��Ǝv���܂��B";
		next;
		menu "�x�����Ă��閂�w�҂ɂ��ĕ���",-;
		mes "[�V�i�C��]";
		mes "�����l�I�Ɏx�����Ă��邾���ł��B";
		mes "�^���̔��ɑ������w�҂�B���p�t������";
		mes "�����ȊO�����낻���ɂ������ł��B";
		mes "��{�I�Ȑ����͂Ȃǁc�c";
		mes "�����x�����Ă��閂�w�҂��A";
		mes "���̂悤�ȕ��Ȃ̂ł��B";
		next;
		menu "����Ă݂����ł�",-;
		mes "[�V�i�C��]";
		mes "����͍���܂��B";
		mes "�ƂĂ��x���S�������̂ŁA";
		mes "�O���̐l�ƐڐG����̂��D�݂܂���B";
		next;
		mes "[�V�i�C��]";
		mes "����ɁA�����ނ̌l�I�Ȃ��Ƃ�";
		mes "���Ȃ��ɋ�����`���Ȃǂ͂���܂���B";
		mes "�����ł��傤�H";
		mes "�ł��̂ŁA����ȏ�F������̂�";
		mes "��߂Ă��������B";
		next;
		menu "�G�C���@���g�ɂ���",-;
		mes "[�V�i�C��]";
		mes "�G�C���@���g�H";
		mes "���������Ƃ�����悤�ȁc�c�B";
		mes "���w�҂Ȃ�ł����H";
		mes "�����������m���Ă��閂�w�҂̒���";
		mes "���̂悤�Ȗ��O�̕��͂��܂����B";
		next;
		mes "�]�V�i�C���́A�x�����Ă���";
		mes "�@���w�҂ɂ��āA�����b����";
		mes "�@����Ȃ������B";
		mes "�@�����Ə����W�߂�K�v������]";
		next;
		mes "�]�������{���ӂ����Ă���l���c�c";
		mes "�@�G�N���[�W���K�[�h�E�~�j���G������";
		mes "�@�b���𕷂��Ă݂悤�]";
		delitem 6561,10;
		delitem 6560,10;
		set ECL_3QUE,16;
		chgquest 7437,7438;
		getexp 150000,0;
		getexp 0,150000;
		close;
	case 16:
	case 17:
	case 18:
	case 19:
	case 20:
	case 21:
		mes "[�V�i�C��]";
		mes "�G�C���@���g�c�c";
		mes "�v���o���܂����B";
		mes "���\�N�O�܂ł͓V�˖��w�҂��������A";
		mes "�s�K�؂Ȏ��������čs��������܂���";
		mes "�l���ł͂���܂��񂩁H";
		next;
		mes "[�V�i�C��]";
		mes "�ǂ��ł��̎҂̏��𓾂�����";
		mes "�m��܂��񂪁A���߂����������B";
		mes "������͖̂����ł���B";
		close;
	case 22:
		mes "[�V�i�C��]";
		mes "�����Ɏ����x�����Ă���w�҂�";
		mes "�C�ɂȂ��ł����H";
		mes "�c�O�ł����A���̊w�҂�";
		mes "�}�Ɏp�������܂����B";
		next;
		mes "[�V�i�C��]";
		mes "�ނ��l�Ԃł��邠�Ȃ��ɋ�����";
		mes "�����Ă����̂ŁA��l�����킹��";
		mes "�݂悤�ƍl���Ă����̂ł����B";
		mes "�ǂ����ċ}�ɂ��Ȃ��Ȃ����̂��c�c";
		close;
	case 23:
		mes "[�V�i�C��]";
		mes "�I�[�u�̌x�������������";
		mes "�}�����E�W�����̎w��������܂����B";
		mes "���R�͕�����܂��񂪁A";
		mes "���Ȃ������ӂ��Ă��������B";
		mes "���̂��߂ɓ����Ă���҂ł��傤�H";
		next;
		mes "[�V�i�C��]";
		mes "����Ƃ��A�����Ɏ����x�����Ă���";
		mes "���w�҂��C�ɂȂ��ł����H";
		next;
		menu "�ނ��s���Ă��������ɂ��Ēm���Ă���̂�",-;
		mes "[�V�i�C��]";
		mes "�m��܂���B";
		mes "�������x�����Ă�����";
		mes "�]��ł��邱�Ƃ������Ă�����";
		mes "�����Ă��܂����B";
		next;
		mes "[�V�i�C��]";
		mes "����ȏエ�b���ł��邱�Ƃ�";
		mes "����܂���B";
		mes "�ނ��}�ɂ��Ȃ��Ȃ莄���@����";
		mes "���܂�悭����܂���B";
		close;
	case 24:
		mes "[�V�i�C��]";
		mes "�͂��c�c�����ɂ��Ȃ��Ă����B";
		mes "�}�����l�����̗��R���������Ȃ���";
		mes "�I�[�u�����l���𑝂₹��";
		mes "�����Ă��邵�c�c";
		next;
		mes "[�V�i�C��]";
		mes "���w�҂͏����Ă��܂������c�c�B";
		mes "�܂����c�c";
		mes "���ꂪ�b�ŕ������H������!?";
		next;
		menu "���������Ă�������",-;
		mes "[�V�i�C��]";
		mes "���������܂����";
		mes "�͂����c�c���͍��\�ɂ������̂ł�";
		mes "�Ȃ����Ǝv���Ă��܂��B";
		mes "�����������Ԏx�����Ă��ꂽ��";
		mes "�������߂Ă��錤�������Ă�����";
		mes "�񑩂��Ă��܂����B";
		next;
		switch(select("�ǂ�Ȏx�������Ă�����ł����H","���̌�����v��������������ł����H")) {
		case 1:
			mes "[�V�i�C��]";
			mes "�ނ̗v���͒P���ł����B";
			mes "�Q�H����ь������ł���ꏊ�̒񋟁B";
			mes "�����˗����錤���ɂ��Ă�";
			mes "�ޗ���̂��ׂĂ�񋟁B";
			next;
			mes "[�V�i�C��]";
			mes "�H����񋟂������A";
			mes "�ޗ����^�����̂�";
			mes "���ɂȂ��Ăǂ�����";
			mes "�������̂ł��傤���H";
			mes "�����т����肵�Ă��܂��B";
			next;
			mes "[�V�i�C��]";
			mes "�c�c�l���Ă݂�ƁA���̂��Ƃ�";
			mes "���āA�b���鑊������Ȃ������B";
			mes "�ŏ��͓��ɔ閧�ɂ����������킯�ł�";
			mes "�Ȃ������̂Ɂc�c";
			next;
			mes "[�V�i�C��]";
			mes "�s����T���Ă݂悤�Ƃ�����A";
			mes "�^���̔��̊w�҂�����";
			mes "�m��Ȃ��ƌ������c�c";
			next;
			mes "[�V�i�C��]";
			mes "����A���̐X�ɂ��Ă̌�����";
			mes "�C���悤�Ǝv���Ă����̂Ɂc�c";
			mes "���̊w�҂������Ă݂܂��B";
			break;
		case 2:
			mes "[�V�i�C��]";
			mes "�r�t���X�g�^���[�ɂ���";
			mes "���������Ă���Ɨv�����܂����B";
			next;
			mes "[�V�i�C��]";
			mes "�����w�������̂͂��ꂾ���ł��A";
			mes "����ȊO�͒m��܂���B";
			mes "���̌����I�������A���̎���";
			mes "���̐X�ɂ��Ă��˗����悤��";
			mes "�v���Ă܂����B";
			next;
			mes "[�V�i�C��]";
			mes "�����ǁA����Ȏ�������Ȑl���Ƃ́B";
			mes "�x����܂�����A���́c�c�I";
			next;
			mes "[�V�i�C��]";
			mes "���ɏ������ǂ��w�҂�T����";
			mes "�˗����邱�Ƃɂ��܂��B";
			break;
		}
		next;
		mes "[�V�i�C��]";
		mes "�܂��A�Ƃɂ�������́A";
		mes "���̌l�I�Ȏ���B";
		mes "�����艤�̂��߂ɓ����҂�B";
		mes "�ŋ߁A�}�����E�W������";
		mes "�����l���Ă���̂�";
		mes "�m���Ă��܂����H";
		next;
		mes "[�V�i�C��]";
		mes "�}�����E�W�����͂��̑��ݎ��̂�";
		mes "���t�B�l�ꑰ�Ƌ��ɂȂ��Ă�";
		mes "�Ȃ�܂���B";
		mes "�l�I�ɉ��������悤�Ƃ���̂́A";
		mes "������邱�Ƃł͂���܂���B";
		next;
		menu "����Ȃ��Ƃ͂Ȃ�",-,"�����C�ɂȂ��ł����H",-;
		mes "[�V�i�C��]";
		mes "�c�c�I�[�u�ɂ��āB";
		mes "�I�[�u�����l����";
		mes "���₹�ƌ����܂����B";
		next;
		mes "[�V�i�C��]";
		mes "�Ȃ�̐����������ɓˑR�ł��B";
		mes "���Ȃ��͗��R��m���Ă��܂����H";
		next;
		switch(select("���R��b���Ă��","�����m��Ȃ�")) {
		case 1:
			mes "�]�ǂ��܂Řb�����H�]";
			next;
			switch(select("�S��������","�K���ɘb��")) {
			case 1:
				mes "[�V�i�C��]";
				mes "���ł����āH";
				mes "�����x�����Ă������w�҂�";
				mes "���̃G�C���@���g��������";
				mes "������ł����H";
				mes "�{���ł���!?";
				next;
				menu "�x�����Ă����҂̖��O���m��Ȃ�����ł����H",-;
				mes "[�V�i�C��]";
				mes "�c�c���c�c��Ȃ͂��́c�c";
				mes "���ɂ͈Ⴄ���O��";
				mes "������Ă܂������c�c�B";
				next;
				mes "[�V�i�C��]";
				mes "�c�c���Ȃ��̘b���{���Ȃ��ςł��B";
				mes "�������p���ꂽ��c�c";
				next;
				mes "[�V�i�C��]";
				mes "�������A�������Ă�������ł́A";
				mes "���̎҂Ɖ���Ă���悤�Ȃ��Ƃ�";
				mes "�Ȃ������ł����B";
				next;
				mes "[�V�i�C��]";
				mes "�ނ̐��i���炵�āA";
				mes "�����Ɏg�p����ړI�ł͂Ȃ��A";
				mes "�P�ɍD��S���猤�����Ă���";
				mes "�\���������ł��B";
				mes "����c�c�����ł��邱�Ƃ�";
				mes "�肤��������܂���B";
				next;
				mes "[�V�i�C��]";
				mes "�X�v�����f�B�b�h�̂��Ƃ����ł�";
				mes "�����ɂ��̂Ɂc�c";
				mes "��肪�����đ�ςł��B";
				next;
				mes "[�V�i�C��]";
				mes "�c�c���Ȃ��͈ٖM�l�����A";
				mes "�I�[�u�����Ȃ���΂Ȃ�Ȃ�";
				mes "�`��������܂��B";
				mes "���Ƃ̂��ׂĂ�m���Ă��܂���";
				mes "�̂ł�����B";
				next;
				mes "[�V�i�C��]";
				mes "�������̎��́c�c";
				mes "�ǂ����͂ɂȂ��Ă��������B";
				next;
				mes "[�V�i�C��]";
				mes "���͕��͂̔z�u��";
				mes "���������C���g���悤�ɂ������܂��B";
				next;
				mes "�]�V�i�C���́A�x�����Ă������w�҂�";
				mes "�@�G�C���@���g�ł���ƒm��Ȃ�����";
				mes "�@�悤���B";
				mes "�@�J���f���C�ɕ񍐂ɍs�����]";
				set ECL_3QUE,25;
				chgquest 7445,7446;
				close;
			case 2:
				mes "[�V�i�C��]";
				mes "�ނ��c�c";
				mes "�P�Ƀ}�����E�W������";
				mes "�I�[�u�̌x���ɕs�����������̂ŁA";
				mes "����Ōx���̋������w�������H";
				next;
				mes "[�V�i�C��]";
				mes "�c�c�܂��A���m���܂����B";
				mes "�w�����ꂽ�̂ł��܂��B";
				mes "�}�����E�W����������I�Ȏv�l��";
				mes "���������߂��ƐM���܂��B";
				break;
			}
			break;
		case 2:
			mes "[�V�i�C��]";
			mes "�ӊO�ł��ˁB";
			mes "�}�����E�W��������ԐM�����Ă���̂�";
			mes "���Ȃ����Ǝv���Ă��܂����B";
			next;
			mes "[�V�i�C��]";
			mes "���R�͂Ƃ������A�}�����E�W������";
			mes "����I�Ȏv�l�ŉ��������߂���";
			mes "�M���邵������܂���B";
			break;
		}
		next;
		menu "�]�������Ȃ���ł����H",-;
		mes "[�V�i�C��]";
		mes "����Ȃ��Ƃ���܂���B";
		mes "���������������}�����E�W������";
		mes "���f�͂܂ő����̂ł͂Ȃ�����";
		mes "�S�z���Ă��邾���ł��B";
		next;
		mes "[�V�i�C��]";
		mes "�c�c�������́A���̃}�����E�W������";
		mes "�����ʂ�߂��镗�̂悤�Ȃ��̂�";
		mes "�����Ăق����ƋF���Ă��܂��B";
		mes "�����͈�x�ŏ\���ł�����B";
		next;
		mes "[�V�i�C��]";
		mes "���Ȃ��̓}�����E�W������";
		mes "���Ȃ�M���Ă���悤�ł��ˁB";
		mes "�������������Ă���";
		mes "�s�����Ƃ͈���āB";
		next;
		mes "[�V�i�C��]";
		mes "�}�����E�W�������I�[�u�Ɏ������Ă���";
		mes "���R�͕�����܂��񂪁A";
		mes "���Ȃ����K�ꂽ��Ɍ��肵���̂�";
		mes "����ƁA���Ȃ����傫�ȉe����";
		mes "�^�����̂ł͂Ȃ��ł����H";
		next;
		mes "[�V�i�C��]";
		mes "����͊��̈���o�Ȃ��l���ł����c�c";
		mes "���͂��Ȃ����A�������ꑰ��";
		mes "�����ɂ�����錈���";
		mes "�֗^���Ă���̂ł͂Ȃ�����";
		mes "�v���Ă��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "���������ł���Ȃ�c�c";
		mes "��X�̖������ǂ��Ȃ�̂��B";
		mes "���������t�B�l�̌ւ�ł���A";
		mes "�����ł���I�[�u���ǂ��Ȃ�̂��B";
		mes "�ǂ����ڂ����炳���A�Ō�܂�";
		mes "���͂��Ă��������B";
		next;
		mes "�]�V�i�C���́A�x�����Ă������w�҂�";
		mes "�@���̌��������Ă������A";
		mes "�@�m��Ȃ������悤���B";
		mes "�@�J���f���C�ɕ񍐂ɍs�����]";
		set ECL_3QUE,25;
		chgquest 7445,7447;
		close;
	case 25:
		mes "[�V�i�C��]";
		mes "�����܂Œm���Ă��܂�������ɂ́A";
		mes "���Ȃ��ɂ͍���̌��ɑ΂���";
		mes "�Ō�܂ŕt�������ӔC������܂��B";
		next;
		mes "[�V�i�C��]";
		mes "���Ȃ����������M����}�����E�W������";
		mes "���������f���������̂��A";
		mes "�Ō�܂Ō��͂������ł��傤�H";
		next;
		menu "���̕��͐���ł�",-;
		mes "[�V�i�C��]";
		mes "����łȂ��Ƃ����������܂��B";
		mes "�������A�Z�l�X�̂悤�ɂ���";
		mes "�l�I�Ȗ�]�����������ʂ̂�";
		mes "�x���͕K�v�ł��B";
		next;
		mes "[�V�i�C��]";
		mes "�}�����E�W�����Ƃ������݂�";
		mes "���̑��݂����ŁA�h�ӂ𕥂�˂�";
		mes "�Ȃ�Ȃ����́B";
		mes "�ł��̂ŁA��������";
		mes "���̕��̔��f�ɏ]���A";
		mes "�^��Ȃ���΂Ȃ�܂���B";
		next;
		mes "[�V�i�C��]";
		mes "����͖�����̂��߂ł��B";
		mes "�����]��ł���̂͂����ЂƂB";
		next;
		mes "[�V�i�C��]";
		mes "�I�[�u���߂����ċN���Ă���";
		mes "�}�����E�W�����̈�A�̎w�����A";
		mes "�{���ɃI�[�u�ƃ��t�B�l��";
		mes "���߂ł��邱�ƁB";
		next;
		mes "[�V�i�C��]";
		mes "���̐S�z���X�J�ł�������";
		mes "�ؖ����Ăق��������ł��B";
		close;
	case 26:
		mes "[�V�i�C��]";
		mes "���Ȃ��̓I�[�u�ɂ���";
		mes "�ǂ�قǂ������ł����H";
		next;
		mes "[�V�i�C��]";
		mes "���͂��ÏW���ꂽ�����A";
		mes "���ׂẴ��t�B�l�̌ւ�c�c";
		mes "�������������ۓI�Ȃ��̂ł͂Ȃ��A";
		mes "�I�[�u���ǂ̂悤�ɊǗ�����Ă��邩";
		mes "���̍\���I�Ȃ��̂������Ă��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "�I�[�u�������Ă���L��̓V���";
		mes "���グ�����Ƃ͂���܂����H";
		next;
		mes "[�V�i�C��]";
		mes "�Ȃ��ł��傤�B";
		mes "���́A���グ���Ƃ��Ă�";
		mes "�܂Ԃ������ŉ��������Ȃ���ł��B";
		next;
		menu "�ǂ����Ă���Ȃ��Ƃ�b����ł����H",-;
		mes "�]�V�i�C���͏������΂��������ŁA";
		mes "�@����ɂ͓������A�������]";
		next;
		mes "[�V�i�C��]";
		mes "�I�[�u�͏�ɍL��ɒu����A";
		mes "�N�ɂł������悤�A";
		mes "�I�o����Ă��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "�����āA�V��ɂ̓I�[�u��";
		mes "�ڗ������邽�߂̏Ɩ���";
		mes "�ݒu����Ă��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "�����A����͕\�����̗��R�ŁA";
		mes "�{���͌x���̏󋵂��O���ɘR��Ȃ��悤";
		mes "�ڂ���܂��̖�����S���Ă��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "�I�[�u����镺�m�����́A";
		mes "���̏Ɩ����ݒu���ꂽ�V�䂩��";
		mes "�����낵�A�x�����s����";
		mes "����̂ł��B";
		next;
		mes "[�V�i�C��]";
		mes "������ł͏Ɩ����܂Ԃ����āA";
		mes "�x���̐l����z�u���c���ł��܂���B";
		mes "������I�[�u�Ɋ�@���������ꍇ�ł��A";
		mes "�L���Ɍx�����邱�Ƃ��ł��܂��B";
		next;
		mes "[�V�i�C��]";
		mes "�t�Ɍ����΁A";
		mes "���̓V��̌x���𖳗͉��������";
		mes "�I�[�u�ɊQ��^���₷���Ȃ��";
		mes "�������Ƃł��B";
		next;
		mes "[�V�i�C��]";
		mes "�ǂ�������Ԃ��c�����邽�߂ɂ�";
		mes "��x�A�s���Ă݂܂��񂩁H";
		mes "���Ȃ��Ȃ���v�ł��傤�B";
		mes "���Ȃ��͉����Ԉ�������f��";
		mes "�������̂������ł͂Ȃ��̂���";
		mes "�����`�����������l�Ԃł�����B";
		next;
		mes "[�V�i�C��]";
		mes "�ē����܂��B";
		mes "���̎�������Ă��������B";
		next;
		mes "�]�ǂ����悤�H�]";
		next;
		switch(select("�J���f���C�ɐ�ɒm�点��","�������")) {
		case 1:
			mes "[�V�i�C��]";
			mes "���Ԃ��ق����̂ł����H";
			mes "�َ푰�ɑ΂��Ă��̂悤��";
			mes "�D�ӂ��������̂ɁB";
			mes "�܂�������܂����B";
			mes "�S�̐������ł�����";
			mes "���Ă��������B";
			next;
			mes "�]��������J���f���C��";
			mes "�@�񍐂ɍs�����]";
			set ECL_3QUE,27;
			chgquest 7448,7449;
			close;
		case 2:
			mes "�]�V�i�C���̎��͂ނƁA";
			mes "�@��u�`�N�b�Ƃ���ɂ݂��������B";
			mes "�@�}���Ŏ����������A";
			mes "�@���ُ̈���Ȃ��]";
			next;
			menu "�C�̂������c�c�H",-;
			mes "[�V�i�C��]";
			mes "�ǂ����܂����H";
			mes "����ł͍s���܂���B";
			set ECL_3QUE,29;
			chgquest 7448,7450;
			close2;
			warp "ecl_hub01.gat",129,12;
			end;
		}
	case 27:
	case 28:
	case 29:
		mes "�]�V�i�C������̔��΂݂������Ȃ���";
		mes "�@���L�΂��Ă����]";
		next;
		if(select("�܂��������ł��Ă��Ȃ�","�������") == 1) {
			mes "[�V�i�C��]";
			mes "�َ푰�ɑ΂��Ă��̂悤��";
			mes "�D�ӂ��������̂ɁB";
			mes "�܂�������܂����B";
			mes "�S�̐������ł�����";
			mes "���Ă��������B";
			close;
		}
		mes "�]�V�i�C���̎��͂ނƁA";
		mes "�@��u�`�N�b�Ƃ���ɂ݂��������B";
		mes "�@�}���Ŏ����������A";
		mes "�@���ُ̈���Ȃ��]";
		next;
		menu "�C�̂������c�c�H",-;
		mes "[�V�i�C��]";
		mes "�ǂ����܂����H";
		mes "����ł͍s���܂���B";
		close2;
		set ECL_3QUE,29;
		warp "ecl_hub01.gat",129,12;
		end;
	case 30:
	case 31:
	case 32:
	case 33:
		mes "[���m��ʃ��t�B�l]";
		mes "�ǂ������H�@�V�i�C���H";
		mes "�c�O�����A�ޏ��͋}�ɂ��Ȃ��Ȃ���";
		mes "�����V�����C�����ꂽ�B";
		mes "�Ɩ����Ȃ̂ŁA�p�����Ȃ��Ȃ�";
		mes "�W���}�����Ȃ��łق����B";
		close;
	default:
		mes "[�R�Q�d]";
		mes "�\���󂲂����܂��񂪁A";
		mes "�֌W�҈ȊO�o�����邱�Ƃ͂ł��܂���B";
		close;
	}
}

ecl_in03.gat,41,90,5	script	�J���f���C	624,{
	switch(ECL_3QUE) {
	case 4:
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "�G�N���[�W���ɗ������Ƃ����}����B";
		mes "�ٖM�l��B";
		next;
		mes "[�J���f���C]";
		mes "�������痈���ٖM�l�B";
		mes "���Ȃ������ɓ`���悤�Ƃ��Ă���";
		mes "�^��������ƕ��������c�c";
		next;
		mes "[�J���f���C]";
		mes "���ꂪ�{���Ȃ�c�c";
		mes "���ꂩ�炻�Ȃ��́A";
		mes "�ƂĂ��Z�����Ȃ邾�낤�B";
		next;
		menu "�ǂ������Ӗ��ł����H",-;
		mes "[�J���f���C]";
		mes "���Ȃ��̒m���Ă���^����";
		mes "���ƌ��V��A�����Đ�������";
		mes "���t�B�l���������Ƃ����̂Ȃ�c�c";
		mes "��X�̐M���𓾂邽�߁A";
		mes "�����̓w�͂��K�v���B";
		next;
		mes "[�J���f���C]";
		mes "�������A���͂��Ȃ��̌��t���󂯂āA";
		mes "�s�����N���������ł���B";
		next;
		mes "[�J���f���C]";
		mes "�������A���c�c�B";
		mes "�ٖM�l�̈ꌾ�œ��������A";
		mes "���̃��t�B�l�������󂯓����";
		mes "�����Ǝv�����H";
		next;
		cutin "kardui03",1;
		mes "[�J���f���C]";
		mes "���ɂ��ꂪ���ƂȂ�΁c�c";
		next;
		mes "[�J���f���C]";
		mes "�c�c�c�c�B";
		next;
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "�ӂ�c�c�܂��A�����B";
		mes "���̌����������Ƃ͂킩�������H";
		mes "���Ȃ��͂��̃G�N���[�W����";
		mes "�����������̖������ޕK�v��";
		mes "����Ƃ������Ƃ��B";
		next;
		if(select("���𗧂Ă�ƁH","�C�O�h���V���Ɋւ���b�ł���") == 1) {
			cutin "kardui01",1;
			mes "[�J���f���C]";
			mes "�ӂӁc�c";
			mes "�����Ɨ��������悤���ȁB";
			next;
			menu "�C�O�h���V���Ɋւ���b�ł���",-;
		}
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "���ށc�c";
		mes "�������Ă���B";
		mes "���Ȃ��Ɍ�����܂ł��Ȃ��A�ȁB";
		next;
		mes "[�J���f���C]";
		mes "�����܂ŋ����Ȃ��Ă������B";
		mes "���������Ă����̎���";
		mes "���t�B�l�̗��j�ł��萸�_�A";
		mes "�����ăC�O�h���V����";
		mes "�܂��قȂ���ҁB";
		next;
		mes "[�J���f���C]";
		mes "�C�O�h���V���̈ӎv���p����������";
		mes "�����m��Ȃ��Ǝv���Ă����̂��H";
		mes "���t�B�l�̉��������т�łȂ��B";
		next;
		mes "[�J���f���C]";
		mes "�܂��A���Ȃ��͂܂��A���̒n�ɂ���";
		mes "�ڂ����m��Ȃ��̂��낤�B";
		mes "����ȏ�͖��Ȃ��悤�ɂ��悤�B";
		next;
		mes "[�J���f���C]";
		mes "�c�c���g�D���w�C���̐푈��";
		mes "�����Ȃ������ɏI������͂����B";
		mes "�N���[�����Ȃ��悤��";
		mes "�������s���I���ł͂Ȃ��A";
		mes "�F�̖]�ނƂ���̏I�����B";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "������ٖM�l��B";
		mes "�푈�̂��Ƃ͋C�ɂ���ȁB";
		mes "������A�G�N���[�W���̂��߂�";
		mes "�d�������Ă݂Ȃ����H";
		next;
		menu "�Ȃ��^���ƌ�������Ȃ���ł����H",-;
		cutin "kardui02",1;
		mes "[�J���f���C]";
		mes "���ށc�c";
		mes "���̘b�𑱂���̂ł���΁A";
		mes "�Ȃ�����G�N���[�W���̂��߂�";
		mes "�����Ă����˂΂Ȃ�Ȃ��ȁB";
		next;
		mes "[�J���f���C]";
		mes "�������ł��낤�H";
		mes "���t�B�l�̉��A�}�����E�W�������鎄��";
		mes "�ӌ�����̂ł���΁A";
		mes "�܂��͉�X�̐M���𓾂邽�߂�";
		mes "�w�͂��K�v���B";
		next;
		mes "[�J���f���C]";
		mes "�l���Ă݂��܂��B";
		mes "���̂悤�ȏd�v�Șb���A";
		mes "�������߂ĉ�����΂����";
		mes "���Ȃ��ɘb���`���͂Ȃ��B";
		mes "�������낤�H";
		next;
		menu "�c�c�c�c",-;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "���Ȃ��ɂ��Ă͎������ƌ��V��A";
		mes "�����Ă��ׂẴK�[�h�ɘb���Ă����B";
		mes "���ꂩ��A���̃G�N���[�W����";
		mes "���̂��߂ɓ����҂�";
		mes "���������𓾂邱�ƂɂȂ�B";
		next;
		mes "[�J���f���C]";
		mes "�ꑰ�̉��ł��鎄�Ɛe���ɂȂ��̂��B";
		mes "�������ꂪ�����Ƃ����̂Ȃ�c�c";
		mes "����Ȃ�Ύ������̒���";
		mes "���̂��炢�ł����Ȃ���";
		mes "�������Ƃ��B";
		next;
		menu "�������͂ǂ�Ȓ��Ȃ�ł����H",-;
		mes "[�J���f���C]";
		mes "�������̒����H";
		mes "�ӂށA�������ȁc�c";
		mes "���ꂩ�炨�݂��ɔ閧�����L���钇�A";
		mes "�Ƃ������Ƃ��납�H";
		next;
		mes "[�J���f���C]";
		mes "�c�c�͂́c�c�ʔ����Ȃ����H";
		mes "�ȒP�Ɍ����΁A���̗F�ɂȂ�A";
		mes "�Ƃ������Ƃ��B";
		mes "���t�B�l�̉��ƗF�ɂȂ��̂��B";
		mes "��Ԃ��悢�B";
		next;
		mes "[�J���f���C]";
		mes "�܂��A�Ƃɂ������Ȃ��̖K���";
		mes "���ł�������B";
		next;
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "�����A���𖞑������邱�Ƃ�";
		mes "�ł��Ȃ���Ή������邱�Ƃ�";
		mes "�ł��Ȃ����낤�B";
		mes "���ɉ�����y���݂ɂ��Ă���B";
		mes "�ٖM�l�ł���Ȃ���F�ɂȂ�҂�B";
		next;
		cutin "kardui04",255;
		mes "�]�}�����E�W�����@�J���f���C��";
		mes "�@����ȏ㓥�ݍ��񂾘b������ɂ́A";
		mes "�@�G�N���[�W���ō����Ă���l�������A";
		mes "�@�M���𓾂�ق��Ȃ��悤���]";
		set ECL_3QUE,5;
		chgquest 72280,7417;
		close;
	case 5:
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "�����A���̂��߂ɓ����ҁI";
		mes "���̂��߂Ɉꐶ���������Ă݂�I";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�c�c�Ƃ����̂͏�k�ŁB";
		next;
		mes "[�J���f���C]";
		mes "�G�N���[�W���ŗL���ɂȂ�̂�";
		mes "��ς��낤���A";
		mes "�������Ȃ��̖����L�����Ă���҂�";
		mes "���Ȃ����������������͂����c�c";
		next;
		cutin "kardui01",255;
		mes "�]�}�����E�W�����@�J���f���C��";
		mes "�@���ݍ��񂾘b������ɂ́A";
		mes "�@�G�N���[�W���ō����Ă���l�������A";
		mes "�@�M���𓾂�ق��Ȃ��悤���]";
		close;
	case 6:
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "���C�������悤���ȁB";
		next;
		menu "�������l��",-;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "���t�B�l�̂��߂ɁA";
		mes "�悭�����Ă��ꂽ�������ȁB";
		mes "�b�͕����Ă��邼�B";
		next;
		mes "[�J���f���C]";
		mes "�����킴�Ƃ��Ȃ��ɖʓ|�Ȃ��Ƃ�";
		mes "�������ƍl���Ă���񂾂ȁH";
		mes "�ӂӂӁc�c�܂������炸�c�c";
		mes "�������A���ʂƂ��āA��X��";
		mes "�M���͓���ꂽ�B";
		mes "�������낤�H";
		next;
		mes "[�J���f���C]";
		mes "�ӂӁc�c���āc�c";
		mes "�������Ȃ��������ɌĂяo�����̂�";
		mes "�ȑO�A���ׂĘb���Ȃ��������Ƃ�";
		mes "�b�����߂��B";
		mes "�䂪�ꑰ�̂��߂ɓ����Ă��ꂽ";
		mes "���Ȃ��ւ̗炾�B";
		next;
		menu "�b���Ȃ��������ƁH",-;
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "���Ȃ��͈ȑO�A���ɃC�O�h���V����";
		mes "�߂���Η��ɂ��Ęb�����Ƃ��Ă����B";
		mes "���x�͎������̂��Ƃ��ǂ������";
		mes "�m���Ă����̂��𓚂��悤�B";
		next;
		mes "[�J���f���C]";
		mes "�C�O�h���V���̎��҂���";
		mes "���t�B�l�̉��}�����E�W������";
		mes "�C�O�h���V���ƌq�����Ă��āA";
		mes "������x�̑a�ʂ��\���B";
		next;
		mes "[�J���f���C]";
		mes "�C�O�h���V���ɔ��������ُ팻�ۂ́A";
		mes "�T�t�@���̍̌@�������ł͂Ȃ��A";
		mes "�Ƃ������Ƃ��c�c";
		mes "���̓C�O�h���V����ʂ��Ēm���Ă���B";
		next;
		menu "�Ȃ̂ɂǂ����āH",-;
		mes "[�J���f���C]";
		mes "�^��Ɏv���̂����R���ȁB";
		mes "�������A�C�O�h���V���Ɉُ팻�ۂ�";
		mes "�����������A���R�͕�����Ȃ���";
		mes "�C�O�h���V���Ƒa�ʂ��邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ����̂��B";
		next;
		mes "[�J���f���C]";
		mes "����ŁA�ُ팻�ۂ𒲂ׂ邽��";
		mes "�����c�𑗂����B";
		next;
		mes "[�J���f���C]";
		mes "�����c�̒������ʂ́A";
		mes "�T�t�@���ɂ�閳���ȍ̌@��";
		mes "�����̂��Ƃ����񍐂��������B";
		mes "�c�c���̌�͂��Ȃ����m����";
		mes "���邾�낤�B";
		next;
		menu "���̓C�O�h���V���Ƃ̑a�ʂ́H",-;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "���Ȃ��a�ʂł��Ă���B";
		mes "�������̏ꏊ�ɍ����āA";
		mes "���ׂĂ̐^�����������Ă���B";
		next;
		mes "[�J���f���C]";
		mes "�푈���n�܂�A��߂�ł��Ȃ���Ԃ�";
		mes "�Ȃ��Ă���A�ēx�C�O�h���V����";
		mes "�q���邱�Ƃ��ł���悤�ɂȂ����B";
		next;
		cutin "kardui02",1;
		mes "[�J���f���C]";
		mes "����܂Łc�c�C�O�h���V���Ƃ̑a�ʂ�";
		mes "�ēx�s����悤�ɂȂ�܂ŁA";
		mes "���܂Ŋ��������̂Ȃ�";
		mes "�ƂĂ������ȋC���������B";
		next;
		mes "[�J���f���C]";
		mes "����ȂƂ��ɁA���̎��ҁA";
		mes "�j�[�Y�w�b�O���A";
		mes "���g�̋`���𓊂��̂Ă��B";
		mes "���̓����͉����N���Ă����̂�";
		mes "�m�鎖���ł��Ȃ��������B";
		next;
		mes "[�J���f���C]";
		mes "�����A�C�O�h���V���ƌq���肪";
		mes "�؂ꂽ���̃}�����E�W�����́A";
		mes "���̌�A�����ȋC�ɑς��鎖��";
		mes "�o���Ȃ��܂܉��ʌp�����ꂽ�B";
		next;
		mes "[�J���f���C]";
		mes "����Œa�������̂��A";
		mes "���݂̃}�����E�W�����ł��鎄���B";
		next;
		cutin "kardui03",1;
		mes "[�J���f���C]";
		mes "�o��������A���͕��G�ɂȂ��Ă��܂���";
		mes "�^�����ǂ̂悤�ɉ����΂����̂��A";
		mes "�ƂĂ��c�c�ƂĂ������ԁA�Y�񂾁B";
		mes "�܂��A����ȊO�ɂ��l�I�Ȗ�肪";
		mes "�����Ăȁc�c�B";
		next;
		mes "[�J���f���C]";
		mes "�c�c�c�c�B";
		next;
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "���҂̑��Ɗ֘A��������Ə򉻂�";
		mes "�Q�������҂����ɂ͉���Ă݂����H";
		mes "�����Ȃ��^����m���Ă���҂������B";
		next;
		mes "[�J���f���C]";
		mes "�����A�ނ�������Ă����B";
		mes "�푈���~�߂�̂́A���łɒx���ƁB";
		mes "���̐푈�͂ƂĂ�������";
		mes "�����Ă��܂��āA�����Ƃ�����ɂ�";
		mes "�v���C�h�������Ȃ��ƁB";
		next;
		mes "[�J���f���C]";
		mes "�������A�l�������Ȃ�������3�̐��͂�";
		mes "�����ė���悤�ɂȂ����B";
		mes "���ꂪ���Ȃ������l�Ԃ��B";
		next;
		mes "[�J���f���C]";
		mes "���Ȃ������̓o��ŃT�t�@�ƃ��t�B�l";
		mes "�����̎��������Ȃ������Ɍ������B";
		mes "���͂�����@�ɁA���������t�B�l��";
		mes "�l����ς��Ă������Ƃ��Ă���̂��B";
		next;
		mes "[�J���f���C]";
		mes "���g�D���w�C���̋��l�A";
		mes "�T�t�@���������łɒm���Ă���B";
		mes "�������͂��݂��G�ł͂Ȃ����Ƃ��B";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "������A�����܂ŐS�z���Ȃ��Ă�";
		mes "���v���B";
		mes "����ɂ���̓}�����E�W�����ɂȂ���";
		mes "���������Ȃ���΂Ȃ�Ȃ����B";
		mes "���Ƃ��ĕK����������Ɩ񑩂��悤�B";
		next;
		mes "[�J���f���C]";
		mes "����ŏ����͈��S�ł������H";
		mes "����Ƃ��A���ς�炸�S�z���H";
		mes "�������A���Ȃ��̍l���͂Ƃ�����";
		mes "�^��͂�����x�����������낤�H";
		next;
		mes "[�J���f���C]";
		mes "�܂��A�^�₪�Ȃ��Ȃ��Ă�";
		mes "���X�����܂ő����^��ł���B";
		mes "�}�����E�W�����Ƃ����͖̂Z��������";
		mes "�����邾�낤���A���͊��ƉɂȂ񂾁B";
		mes "�͂͂͂͂́c�c";
		next;
		mes "[�J���f���C]";
		mes "�������A�R�Q�d�ɓn���Ă���������";
		mes "���邩��A�K���󂯎��悤�ɁB";
		mes "�����ȁH";
		next;
		cutin "kardui01",255;
		mes "�]�R�Q�d�̃V�i�C������";
		mes "�@�������炦��炵���B";
		mes "�@�󂯎��ɍs�����]";
		set ECL_3QUE,7;
		delquest 7421;
		getexp 200000,0;
		getexp 0,200000;
		setquest 7422;
		close;
	case 7:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "���Ȃ��ɓn���v���[���g��";
		mes "�p�ӂ��Ă���������A";
		mes "�R�Q�d�������Ă���B";
		mes "���ꂩ�炻�Ȃ��̖��ɗ����낤�B";
		next;
		cutin "kardui01",255;
		mes "�]�R�Q�d�̃V�i�C������";
		mes "�@�������炦��炵���B";
		mes "�@�󂯎��ɍs�����]";
		close;
	case 8:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "���̃u���[�`�A�ƂĂ��������낤�H";
		mes "�g�p����΂��ł��G�N���[�W����";
		mes "�߂邱�Ƃ��ł���B";
		mes "���͂��Ȃ��ɓn����̂�";
		mes "���̂��炢�����Ȃ��ȁB";
		close2;
		cutin "kardui01",255;
		end;
	case 9:
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "�v���Ԃ肾�ȁB";
		mes "���ɉ����p�ł�����̂��H";
		next;
		switch(select("�A���Ƃ͉��ł����H","�\�N�炵���ł��ˁH","�s�K�̎�I")) {
		case 1:
			cutin "kardui02",1;
			mes "[�J���f���C]";
			mes "�A���H�@���̂��Ƃ��H";
			mes "�����Ȃ��ꂪ������Ă��鎿��ł́A";
			mes "�����玄�ł�������Ȃ����c�c�B";
			break;
		case 2:
			cutin "kardui01",1;
			mes "[�J���f���C]";
			mes "���̎����\�N�H";
			mes "��͂͂͂͂͂́I";
			mes "�ō��̏�k���B";
			mes "���͍��܂Ŗ\�����s�������Ƃ��A";
			mes "�������s�������Ƃ��Ȃ����B";
			break;
		case 3:
			cutin "kardui02",1;
			mes "[�J���f���C]";
			mes "�s�K�H�@�s�K�̎�c�c";
			mes "���Ɍ����Ă���̂��H";
			break;
		}
		next;
		menu "�\�ɂ��Ęb��",-;
		cutin "kardui02",1;
		mes "[�J���f���C]";
		mes "���Ȃ��̘b�ł́A�ꑰ���������̂��Ƃ�";
		mes "���܂�M���Ă��炸�A�s���Ɏv���Ă���";
		mes "�Ƃ������Ƃ��ȁH";
		next;
		mes "[�J���f���C]";
		mes "�͂͂́c�c";
		mes "���łɕ������Ă������Ƃ����c�c";
		mes "���ށA�킴�킴���̂��߂ɁA";
		mes "�`���ɗ��Ă��ꂽ���Ƃ͊��ӂ����B";
		next;
		mes "[�J���f���C]";
		mes "�������A������͘b�ɗ���O��";
		mes "��x�l���Ă݂��ق����������B";
		mes "���̂悤�Șb���o���ł́A";
		mes "������ƊԈႦ�΁A���݂��̊֌W��";
		mes "�����������˂Ȃ��B";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "������ɂ��Ă��A���Ȃ��̐S�̒��Ŏ���";
		mes "���łɗF�B�ɂȂ��Ă���悤���ȁB";
		mes "�������낤�H";
		mes "�F�B�łȂ���΁A���̂悤�ȉ\��";
		mes "�S�z����͂����Ȃ��B";
		next;
		mes "[�J���f���C]";
		mes "�c�c�c�c�B";
		next;
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "�ȑO�A�����b�������Ƃ��o���Ă��邩�H";
		mes "�������͂��ꂩ��閧�����L����悤��";
		mes "�Ȃ钇���ƌ��������Ƃ��B";
		mes "�F�B�ɂȂ����L�O�Ƃ��Ă��̎���";
		mes "�閧���ЂƂb���Ă�낤�B";
		next;
		mes "[�J���f���C]";
		mes "�}�����E�W�����Ƃ́A��シ�ׂĂ�";
		mes "���̋L�����p�����ꂽ�҂��B";
		mes "����}�����E�W��������A";
		mes "�����O�̐��}�����E�W�����܂ł�";
		mes "���ׂĂ̋L���B";
		next;
		mes "[�J���f���C]";
		mes "����͋���ȏ��̏W���̂ŁA";
		mes "�����銴��̏W�܂�ł�����B";
		mes "�܂��A���t�B�l�ɂƂ��Ẵh�i��";
		mes "���ݗ��R�ł�����B";
		mes "�h�i�͏������ꂽ��̂悤�ȕ����B";
		next;
		mes "[�J���f���C]";
		mes "������A���ɉ�����������";
		mes "�}�Ɏ���ł��܂����Ƃ��悤�B";
		mes "��������ƁA�h�i�����̒��̂ЂƂ��";
		mes "���ׂĂ̋L�����p������A";
		mes "���̎҂��V�����}�����E�W�����A";
		mes "�܂�A���ɂȂ�B";
		next;
		menu "�������b�����ǁA���ꂪ���̊֌W���H",-;
		mes "[�J���f���C]";
		mes "���͂ȁB";
		mes "�h�i�ƃp�p���̍����Ȃ񂾁B";
		mes "�}�����E�W�����̊�ł���";
		mes "�h�i�̌�������邱�ƁA";
		mes "���t�B�l�̈ꑰ�͂��������Ă���B";
		next;
		mes "[�J���f���C]";
		mes "���������ƍ����̉��Ƃ����̂�";
		mes "�������߂Ăł͂Ȃ��B";
		mes "���̐��Ƃ����̂��A�ŏ��̍�������";
		mes "�����āc�c�����Ȗ\�N�������񂾁B";
		next;
		cutin "kardui02",1;
		mes "[�J���f���C]";
		mes "�����Ƃ��������ł����Ȃ̂ɁA";
		mes "�������̗��\�ȋC����";
		mes "�󂯌p����������Ȃ��c�c�B";
		mes "�ꑰ�������Ă���s���͗����ł���B";
		next;
		mes "[�J���f���C]";
		mes "��̍������̖��̓Z�l�X�Ƃ������B";
		mes "�Z�l�X�̋L�����󂯌p�������A";
		mes "���͔߂����āA�h�������B";
		mes "�}�����ɂȂ�ƖY�p�Ƃ����@�\��";
		mes "�����Ă��܂�����A";
		mes "�Y��邱�Ƃ��ł��Ȃ��B";
		next;
		mes "[�J���f���C]";
		mes "�������Z�l�X�́A";
		mes "���g���������Ƃ�����������";
		mes "�􂢂Ȃ���A�����A�j�ł��Ă������B";
		next;
		mes "[�J���f���C]";
		mes "���A�ꑰ�������S�z���Ă���󋵂�";
		mes "����Ȃ񂾁B";
		mes "�}�����E�W�������`�����ʂ�����";
		mes "�����Ă��܂����Ɓc�c";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�͂͂́c�c";
		mes "�܂��A�݂�Ȃ��s���ɂȂ��Ă���̂Ȃ�";
		mes "���͂���Ɉꏊ��������΂邵���Ȃ��B";
		next;
		mes "[�J���f���C]";
		mes "�����ᔻ����鍬�����Ƃ��Ă��A";
		mes "���͎������Ȃ���΂Ȃ�Ȃ�";
		mes "�`�����ʂ����B";
		mes "�����āc�c�Z�l�X�̂悤��";
		mes "�^�����瓦����������Ȃ��B";
		mes "������A�S�z���Ȃ��Ă����v���B";
		next;
		cutin "kardui02",1;
		mes "[�J���f���C]";
		mes "�c�c�����A�������ȁc�c";
		mes "���Ȃ����A����ł�����";
		mes "�S�z�����Ă����Ƃ����̂Ȃ�c�c";
		next;
		mes "[�J���f���C]";
		mes "���̖{���̗F�ɂȂ��Ăق����c�c�B";
		next;
		mes "[�J���f���C]";
		mes "�c�c�c�c�B";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�b�������Ȃ��Ă��܂����ȁB";
		mes "���̂悤�Ȃ��Ƃ�b���鑊�肪";
		mes "���邱�Ƃ́A���������Ƃ��B";
		mes "���܂ł́A�����ς��Ă�������ȁB";
		next;
		mes "[�J���f���C]";
		mes "���������΂��Ȃ��̋^���";
		mes "�ӂ��������Ă��܂����ȁB";
		mes "���͂��̎؂��Ԃ���悤��";
		mes "�`�����X��^���Ă�邩��A";
		mes "���҂��Ă��邪�悢�B";
		next;
		cutin "kardui01",255;
		mes "�]�J���f���C�́A���t�B�l�̈ꑰ����";
		mes "�@�������ǂ̂悤�Ɏv���Ă���̂�";
		mes "�@���łɒm���Ă����B";
		mes "�@�����Ă�������z���A���Ƃ��Ă�";
		mes "�@��ڂ��ʂ������Ƃ��Ă���]";
		next;
		mes "�]�������A�F�ɂȂ��Ăق����ƌ���";
		mes "�@�J���f���C�̕\��ɂ́A";
		mes "�@�d���ɋꂵ�ޔނ̑f�炪";
		mes "�@�ɂ���ł����]";
		next;
		mes "�]������x�A�J���f���C��";
		mes "�@�b�������Ă݂悤�]";
		set ECL_3QUE,10;
		chgquest 7427,72258;
		getexp 200000,0;
		getexp 0,1000000;
		getexp 0,1000000;
		getexp 0,1000000;
		getexp 0,1000000;
		getexp 0,400000;
		close;
	case 10:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�G�N���[�W���̐����͂ǂ����H";
		mes "�N��̂��߂ɓ�������Ă͂������A";
		mes "�N��͉H�������Ă��Ȃ�����c�c";
		next;
		mes "[�J���f���C]";
		mes "���A�������B";
		mes "���͌N�ɑ΂��Ĉ̂�����";
		mes "�b���̂͂�߂悤�ƍl���Ă���B";
		mes "�}�����ɂ͂Ȃ������A���܂ɂ�";
		mes "���̔N��ɍ����悤�ȍs����";
		mes "���Ă݂����̂łȁB";
		next;
		mes "[�J���f���C]";
		mes "�}�����Ƃ����̂͏I���Ȃ�����";
		mes "�O���̎��Ԃ̂悤�ȕ��B";
		mes "�p�����ꂽ�L�������ŁA";
		mes "���S��̐l���𐶂����̂Ɠ����Ȃ񂾁B";
		next;
		mes "[�J���f���C]";
		mes "�c�c���̋L���Ɋ������܂�āA";
		mes "���̊Ԃɂ����́A����N�𐶂��Ă���";
		mes "�N���̂悤�ɂȂ��Ă��܂��Ă����B";
		next;
		mes "[�J���f���C]";
		mes "���܂ɂ̓}�����E�W������";
		mes "�J���f���C�ł͂Ȃ��A";
		mes "���ʂ̃J���f���C�ł��Ă�";
		mes "�����񂶂�Ȃ����ȂƁc�c�v�����񂾁B";
		mes "�������A���H�Ɉڂ��̂͏��߂Ă��B";
		next;
		cutin "kardui02",1;
		mes "[�J���f���C]";
		mes "����Ɂc�c";
		next;
		mes "[�J���f���C]";
		mes "�c�c�Z�l�X�ɂ��S����b����悤��";
		mes "���肪�����Ȃ�A";
		mes "�����͕ς���Ă����̂ł͂Ɓc�c";
		mes "���̂悤�Ȃ��Ƃ��A���܂ɍl����B";
		next;
		mes "[�J���f���C]";
		mes "�c�c�c�c�B";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�܁A���������킯������I";
		mes "���ꂩ�玄�����̒���";
		mes "����ɐe���ɂ��čs�����ł͂Ȃ����B";
		next;
		cutin "kardui01",255;
		mes "�]�̂����ɘb���̂͂�߂��";
		mes "�@�����Ȃ�����A���Ƃ��Ă̘b������";
		mes "�@���݂��Ă��܂��Ă���̂��A";
		mes "�@���̌����͂ǂ����������Ȃ��]";
		next;
		mes "�]������x�J���f���C����";
		mes "�@�b�𕷂����]";
		set ECL_3QUE,11;
		chgquest 72258,72263;
		close;
	case 11:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�r�t���X�g�^���[�ɂ�";
		mes "�s���Ă݂����H";
		next;
		if(select("�s���Ă݂�","�s���Ă݂�\�肾","�܂������l���Ă��Ȃ�") == 3) {
			mes "[�J���f���C]";
			mes "����͎c�O���ȁB";
			mes "�G�N���[�W���̖����̒���";
			mes "�ЂƂȂ̂Ɂc�c";
			close2;
			cutin "kardui01",255;
			end;
		}
		mes "[�J���f���C]";
		mes "�ł͈��S���Ďd���𗊂ނ��Ƃ��ł���B";
		mes "�@";
		mes "������̖��߂��I";
		mes "�r�t���X�g�^���[�ɂ��邠��l����";
		mes "���̎莆��n���Ă����I";
		next;
		menu "�c�c",-;
		mes "[�J���f���C]";
		mes "�c�c�c�c�B";
		next;
		mes "[�J���f���C]";
		mes "�ӂӁA��k���B";
		mes "�莆��n����������͎��̌Z�łȁB";
		mes "�l�I�Ȃ��Ƃ�����";
		mes "�F�B�ɗ��ނ��Ƃɂ����񂾁B";
		mes "����Ă�����ȁH";
		mes "���̋@��ɑ݂���Ԃ��Ă����B";
		next;
		mes "[�J���f���C]";
		mes "�r�t���X�g�^���[�̍ŏ�K��";
		mes "�s���Ɖ��B";
		mes "�Z����͂����ŕ�炵�Ă���B";
		mes "�����n���Ă���B";
		next;
		cutin "kardui01",255;
		mes "�]�J���f���C����莆���󂯎�����B";
		mes "�@�r�t���X�g�^���[�ŏ�K�ɂ���Ƃ���";
		mes "�@�J���f���C�̌Z�ɓn���ɍs�����]";
		set ECL_3QUE,12;
		chgquest 72263,7434;
		close;
	case 12:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�r�t���X�g�^���[�̍ŏ�K�ɍs����";
		mes "���̌Z����ɂ��̎莆��n���Ă���B";
		mes "�܂��A�s���Ă݂�΂킩��B";
		next;
		mes "�]�J���f���C����̎莆��";
		mes "�@�r�t���X�g�^���[�ŏ�K�ɂ���Ƃ���";
		mes "�@�J���f���C�̌Z�ɓn���ɍs�����]";
		close2;
		cutin "kardui01",255;
		end;
	case 13:
	case 14:
	case 15:
	case 16:
	case 17://?
	case 18://?
	case 19://?
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�f���炵���Z���񂾂�������H";
		mes "���̐��̒��ŗB�ꎄ�̍l����";
		mes "�������Ă���Ă���l�Ȃ񂾁B";
		mes "�����Ԃ߂Ă��ꂽ�̂��A";
		mes "���̑�����}���Ă��ꂽ�̂�";
		mes "���ׂČZ���񂾁B";
		next;
		mes "[�J���f���C]";
		mes "�����Z���񂪂��Ȃ�������A";
		mes "�����Z�l�X�̂悤�ɂȂ��Ă�������";
		mes "����Ȃ��c�c�B";
		next;
		mes "[�J���f���C]";
		mes "�����A���̂�����̗��݂�";
		mes "�Z���񂩂畷��������H";
		mes "������ƂĂ��d�v�Ȃ񂾁B";
		mes "��낵�����ނ�B";
		close2;
		cutin "kardui01",255;
		end;
	case 20:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�������ʂ͂��������H";
		mes "�c�c�H";
		mes "������H";
		mes "�Z����!?";
		next;
		cutin "hisie04",0;
		mes "[�q�V�G]";
		mes "��������Ē��ډ���Ęb���̂�";
		mes "�v���Ԃ肾�ȁB";
		next;
		menu "�ǂ�����ē����ė�����ł����H",-;
		mes "[�q�V�G]";
		mes "�ȑO���x����";
		mes "�ɂ�ł���񂶂�Ȃ����H";
		mes "�ȒP�ɓ����ė��邱�Ƃ��ł������B";
		next;
		cutin "kardui05",2;
		mes "[�J���f���C]";
		mes "���̂悤�ł��B";
		mes "�x�����������";
		mes "�Z����ɂ��ł����́H";
		mes "����Ȃ�΁A���ꂩ���";
		mes "���̏�Ԃ��ێ����Ȃ��ƁB";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�������A�Z����I";
		mes "�����ŕ�炵�Ă��������B";
		mes "�^���[�ɖ߂�Ȃ��Łc�c";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�������Ă�肽�����A";
		mes "����ł͂��O�������Ă��܂��B";
		mes "����ɕp�ɂɗ���悤�ɂ���B";
		mes "����ł�������H";
		next;
		cutin "kardui02",2;
		mes "[�J���f���C]";
		mes "�����c�c�ł��ˁc�c";
		next;
		cutin "kardui01",255;
		menu "���낻��{��ɓ��낤",-;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�c�c��H";
		mes "�����A���������I";
		mes "�N������̂�Y��Ă�����B";
		mes "�v���Ԃ�̍ĉ�ŁA";
		mes "�C�������Ԃ��Ă��܂����񂾁B";
		next;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "�������ȁc�c";
		mes "������ҁA�Z�Ƃ͂����A";
		mes "�����ꂴ��q�̗��K��";
		mes "���ł͂����Ȃ��c�c";
		next;
		mes "[�J���f���C]";
		mes "�N�̌����������Ƃ͂悭�킩�����B";
		mes "��x�Ƃ���Ȃ��Ƃ��Ȃ��悤�ɁA";
		mes "�����Z����Ƃ͉��Ȃ��B";
		mes "����ł����񂾂낤�H";
		next;
		menu "����ȈӖ��ł͂���܂���I",-;
		cutin "kardui05",2;
		mes "[�J���f���C]";
		mes "�ӂӂӁc�c�B";
		mes "��k���A�{��ȁB";
		mes "�������A���̐^���ԂȊ�c�c";
		mes "�ӂӂӁc�c���͂͂͂͂́I";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�c�c�B";
		mes "���O�ɂ͂ǂ̂悤��";
		mes "�������邩�킩��Ȃ����c�c";
		next;
		mes "[�q�V�G]";
		mes "���͂��O���}�����ɂȂ���";
		mes "�ǂ������Ǝv���Ă����B";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "���H";
		mes "�Z����A����͂ǂ������Ӗ��ł����H";
		mes "��k�ł��c�c";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "���̂悤�ɁA���邭�O�����ɂȂ���";
		mes "���O�̎p�����邱�Ƃ��ł���";
		mes "�������Ƃ������Ƃ���B";
		next;
		mes "[�q�V�G]";
		mes "�����̑��݂��􂢁A";
		mes "�ꑰ������ł₢�Ȃ�����";
		mes "�����ƐS�z�������c�c�B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�����ƁA����ȏ�b�𑱂���ƁA";
		mes "���O�̗F�l�ɂ܂��{���Ă��܂��B";
		next;
		mes "[�q�V�G]";
		mes "����Ŗ{�肾���c�c�B";
		mes "�G�C���@���g�̋��ꏊ���������B";
		mes "�G�N���[�W���ŕ�炵�Ă���B";
		mes "����Ɖ����̌��������Ă���悤���B";
		next;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "�܂����A�܂��ςȂ��̂�";
		mes "�������Ă���̂ł́H";
		mes "����c�c�����łȂ������Ƃ��Ă�";
		mes "�ז������Ă�肽���Ȃ�B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�������B";
		mes "������ɂ���A�����̌��������Ȃ̂�";
		mes "�c�����Ă����K�v�͂��邾�낤�B";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�G�C���@���g�͌v��O�̂��Ƃ�";
		mes "�������邱�Ƃ��A�ƂĂ�������";
		mes "���܂�����ˁH";
		mes "�Ȃ�΁A�����ς��v���[���g����";
		mes "�����Ă��������B";
		mes "���̌v��O�̏󋵂��B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "���ށB";
		mes "�J���̗F�l��B";
		mes "�}���ŏ������Ă���B";
		next;
		cutin "hisie01",255;
		mes "�]�G�C���@���g�̌������e��";
		mes "�@���ׂ邽�߁A�ނ̃��C�Ɍ��������]";
		set ECL_3QUE,21;
		chgquest 7442,7443;
		close;
	case 21:
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�G�C���@���g�̌������ɍs���A";
		mes "�ނ������������Ă���̂�";
		mes "���ׂĂ��Ăق����B";
		mes "���łɌ����̎ז���";
		mes "���Ă���̂������B";
		next;
		mes "[�J���f���C]";
		mes "�ӂӂӁc�c";
		mes "�z�����邾���ŋC�����ǂ��Ȃ�B";
		mes "��������Z������T�|�[�g����悤�ɁB";
		next;
		cutin "kardui01",255;
		mes "�]�G�C���@���g�̌������e��";
		mes "�@���ׂ邽�߁A�ނ̃��C�Ɍ��������]";
		close;
	case 22:
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�����͖����I�������悤���ˁB";
		next;
		cutin "kardui05",2;
		mes "[�J���f���C]";
		mes "�N�̘b�͌Z���񂩂畷������B";
		mes "���̃G�C���@���g��";
		mes "�|������������Ȃ����H";
		mes "�ӂӂӂӁc�c";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�������A�B��ĉ������Ă���̂���";
		mes "�v���Ă������A����ȕ���";
		mes "�������Ă����Ƃ́B";
		next;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�I�[�u�̖��͂������I��";
		mes "���o���邽�߂̌����̂悤���ȁB";
		mes "�z�̓������������̂́A";
		mes "�����̂��ς��Ȃ��悤���B";
		next;
		cutin "kardui03",2;
		mes "[�J���f���C]";
		mes "�܂��c�c���̂������ŁA";
		mes "�������Z�킪�����ł����B";
		mes "�����A�C���C������B";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�����c�c�������ȁB";
		mes "�Ƃɂ�������̌����͂��߂����B";
		mes "�ˑR�G�C���@���g��T����";
		mes "�����Ă����̂́A�����\�z����";
		mes "��������Ȃ̂��H";
		next;
		cutin "kardui02",2;
		mes "[�J���f���C]";
		mes "�����ł��B";
		mes "�C�O�h���V�����牽���s�C���ȁc�c";
		mes "�s���̂悤�Ȃ��̂��������̂ŁB";
		mes "���m�ɉ����͕�����Ȃ��������ǁA";
		mes "���̒��ɕ����񂾂̂�";
		mes "�G�C���@���g�������c�c";
		next;
		menu "�I�[�u�Ƃ́H",-;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�I�[�u�͎������ꑰ�A���t�B�l��";
		mes "���ׂĂ̖��́B";
		mes "�ƂĂ��Ȃ����͂��W�܂��Ă���B";
		next;
		mes "[�J���f���C]";
		mes "������G�C���@���g�̌����ʂ��";
		mes "�I�[�u�̖��͂������I�ɒ��o����";
		mes "�g�p���邱�Ƃ��ł����Ȃ�c�c";
		mes "���낵������ȗ͂𓾂邱�ƂɂȂ�B";
		next;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "���Ƃ��ΒN���������Ӑ}��";
		mes "�I�[�u�̖��͂𓐂�ŁA";
		mes "���̗͂��ӂ邢�n�߂���c�c";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�Ƃ�ł��Ȃ��Г�B";
		mes "�����̐i�s���ʂ������";
		mes "�قڍŌ�̒i�K�܂ŗ��Ă���B";
		mes "���̌������ʂ�������������";
		mes "�m���Ă���Ȃ�ǂ����c�c";
		next;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "�����ꑼ�̎҂����̂��Ƃ�";
		mes "�m���Ă�����I�[�u���댯�ł��B";
		mes "�I�[�u�̌x�����������܂��B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ł͎��̓G�C���@���g��";
		mes "���������ǋy���Ă݂悤�B";
		next;
		cutin "kardui05",2;
		mes "[�J���f���C]";
		mes "�Z����A���肪�Ƃ��B";
		mes "�I�[�u�̂��Ƃ͎��ɔC���āB";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes strcharinfo(0)+ "�A";
		mes "����͌N�ւ̃v���[���g���B";
		mes "���̖��͂��N�̐�����";
		mes "�傫�ȗ͂ɂȂ�΂�";
		mes "�v���Ă���B";
		misceffect 83,"";
		delitem 6541,1;
		getexp 400000,0;
		getexp 0,300000;
		set ECL_3QUE,23;
		chgquest 7444,72268;
		next;
		cutin "kardui01",255;
		mes "�]�q�V�G�̓G�C���@���g�ɂ���";
		mes "�@�����������ׂ�炵���B";
		mes "�@�r�t���X�g�^���[�ŏ�K�ɍs���A";
		mes "�@�q�V�G����b�𕷂��Ă݂悤�]";
		close;
	case 23:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�I�[�u�̌x������������悤��";
		mes "�w�����Ă���B";
		mes "�}�Ȍx����������������";
		mes "�݂�ȋ����Ă����悤�����c�c";
		next;
		mes "[�J���f���C]";
		mes "�I�[�u�͂ƂĂ���؂Ȃ��̂��B";
		mes "�������邱�ƂȂ񂾂���";
		mes "�]�����낤�B";
		next;
		cutin "kardui01",255;
		mes "�]�r�t���X�g�^���[�ŏ�K�ɍs���A";
		mes "�@�G�C���@���g�ɂ��Ĉ�������";
		mes "�@���ׂĂ���q�V�G����";
		mes "�@�b�𕷂��Ă݂悤�]";
		close;
	case 24:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�V�i�C���ɂ��āA";
		mes "�Z����Ƃ��̂悤�Șb�������̂��B";
		mes "���������Ίm���ɃG�C���@���g��";
		mes "�x�����Ă�����ȁB";
		next;
		mes "[�J���f���C]";
		mes "����A���m�ɘb���ƁA";
		mes "�ޏ��͎������x�����Ă����̂�";
		mes "���w�҂̃G�C���@���g���������Ƃ�";
		mes "�m��Ȃ������̂��B";
		mes "�l�I�Ȏx���܂Ŏ������������邱�Ƃ�";
		mes "�ł��Ȃ��B";
		next;
		mes "[�J���f���C]";
		mes "�Z���񂪘b���Ă����悤��";
		mes "�N�����͂��Ă����Ȃ�A";
		mes "���Ƃ��Ă����}����B";
		mes "��낵�����ށB";
		close2;
		cutin "kardui01",255;
		end;
	case 25:
		mes "[�J���f���C]";
		mes "�Z���񂩂���b�𕷂�����B";
		mes "�G�C���@���g�ɋC������߂��āA";
		mes "�V�i�C���̂��Ƃ��Y��ɖY��Ă����B";
		cutin "kardui01",1;
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�������ʂł��������̂��H";
		mes "����܂ł̈�ۂ��ƁA";
		mes "�V�i�C�������Ŏ��������Ă����Ƃ�";
		mes "�l���Â炢�B";
		next;
		mes "[�q�V�G]";
		mes "�x�����Ă������w�҂Ƃ��A";
		mes "���R�o������悤�����ȁB";
		next;
		if(checkquest(7446)) {
			menu "�V�i�C���ɂ��ׂē`����",-;
			mes "[�J���f���C]";
			mes "���w�҂��G�C���@���g�������̂�";
			mes "�b�����̂��H";
			mes "�ނ��������Ă������e�ɂ��Ă��H";
			cutin "kardui01",2;
			next;
			cutin "hisie01",0;
			mes "[�q�V�G]";
			mes "���������ǂ̓V�i�C����";
			mes "���g���㉟�����Ă������w�҂�";
			mes "���̂�l�����ɂ��Ă�";
			mes "�m��Ȃ������Ƃ������Ƃ��ȁH";
			next;
			cutin "hisie02",0;
			mes "[�q�V�G]";
			mes "�����A����͒m��Ȃ��ӂ��";
			mes "���Ă��邾���̉\��������B";
			mes "��͂�A�l���Ȃ��ɐڐG���邾���ł́A";
			mes "���ׂĂ�m�邱�Ƃ͂ł��Ȃ����c�c�B";
			next;
		}
		mes "[�q�V�G]";
		mes "���ɂ͉��������Ă������H";
		next;
		menu "�V�i�C���Ƃ̉�b���e��`����",-;
		cutin "hisie02",255;
		mes "�]�V�i�C�����ق��̃��t�B�l�Ɠ��l�ɁA";
		mes "�@�J���f���C�ɕs��������Ă���";
		mes "�@���ƂȂǁA��b�̓��e��S�ē`�����]";
		next;
		cutin "kardui02",2;
		mes "[�J���f���C]";
		mes "�V�i�C���c�c";
		mes "���̊��������Ƃ͈����";
		mes "�Ό��Ȃ��Őڂ��Ă���Ă����";
		mes "�M���Ă����̂Ɂc�c";
		mes "���ꂪ�R�������Ƃ́c�c";
		next;
		mes "[�J���f���C]";
		mes "���Ȃ�ɓw�͂͂������肾�������ǁA";
		mes "�s�M�����Ȃ����ɂ͎���Ȃ��̂��c�c�B";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�C�ɂ���ȁB";
		mes "�ǂ��v���Ă��悤���A";
		mes "���O�͂��O�̐M�O�ʂ��";
		mes "���Ƃ�����΂����B";
		next;
		mes "[�q�V�G]";
		mes "���v���B";
		mes "�����݂�Ȃ����O�̂��Ƃ�";
		mes "�F�߂Ă�����������B";
		mes "�����Ƒ����Ђ��߂ĉ߂�����̂�";
		mes "�҂Ώۂł͂Ȃ��A";
		mes "�^�̃}�����ł���Ƃ������Ƃ��B";
		next;
		mes "[�J���f���C]";
		mes "�����c�c�ł��ˁB";
		mes "�ꎞ�̊���ɘf�킳�ꂽ�̂ł�";
		mes "�Z�l�X�ƕς��Ȃ��ł���ˁH";
		cutin "kardui01",2;
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "������V�i�C�����c�c�B";
		mes "�G�C���@���g�̌����Ɋւ���Ă����҂�";
		mes "��͂�V�i�C������������Ȃ��񂾁B";
		mes "�����͂����Ɖ������B���Ă���B";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes strcharinfo(0)+ "�A";
		mes "�N�ɂ͂�������Ȃ��Ƃ���";
		mes "�����Ȃ����c�c�B";
		mes "��������̗͂ɂȂ��Ă���B";
		next;
		menu "�킩��܂���",-;
		mes "[�J���f���C]";
		mes "�V�i�C�����Ȃ��A�G�C���@���g��";
		mes "�����Ɋւ���Ă����̂��c�c�B";
		mes "�����Ɖ������R������͂��B";
		next;
		mes "[�J���f���C]";
		mes "�s�������₦�ԂȂ��P���Ă���B";
		mes "����̓C�O�h���V���������Ă���";
		mes "�x���̃��b�Z�[�W�Ȃ̂��낤���H";
		next;
		mes "[�J���f���C]";
		mes "�c�c�傫�ȃJ�M�Ƃ�����N��";
		mes "���̖����ŏ���������B";
		mes "�V�i�C���̐^�ӂ͂킩��Ȃ���";
		mes "�����������̎҂ɂ���";
		mes "���ׂĂ݂Ă���B";
		next;
		mes "[�J���f���C]";
		mes "���ށB";
		cutin "kardui04",2;
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "���������̊Ԃ͂����ɋ���\�肾�B";
		mes "�����킩�����炱���܂ŗ��Ă���B";
		mes "���ނ��B";
		set ECL_3QUE,26;
		chgquest 7446,7448;
		chgquest 7447,7448;
		close2;
		cutin "hisie01",255;
		end;
	case 26:
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "�s�������₦�ԂȂ��P���Ă���B";
		mes "���̕s���̐��̂����Ȃ̂��m�肽���B";
		mes "����̓C�O�h���V���������Ă���";
		mes "�x���̃��b�Z�[�W�Ȃ̂��낤���H";
		next;
		mes "[�J���f���C]";
		mes "�V�i�C���̂��Ƃ͌N�ɔC����B";
		mes "���͌��͂������Ȃ��}�������B";
		mes "�N�̗͂ɂȂ邱�Ƃ͂ł��Ȃ��B";
		mes "�����ȁA���񗊂�ł΂���ŁB";
		cutin "kardui02",2;
		close2;
		cutin "kardui02",255;
		end;
	case 27:
		mes "[�J���f���C]";
		mes "�����[���Ȃ��ė����ȁI";
		mes "���������ǂ����Ă��H";
		mes "�V��ɂ���Ɩ����u��";
		mes "���t�B�l�Ȃ�݂�Ȃ��m���Ă���B";
		cutin "kardui04",2;
		next;
		mes "[�J���f���C]";
		mes "�������A�m���Ă���̂Ƃ킴��";
		mes "�m�点��̂ł́A�傫�ȈႢ������B";
		mes "���������Ȃ��A�킴�킴�N��";
		mes "�I�[�u�̌x���ɂ��Ęb�����񂾁H";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�ł�Ȃ��Ă����B";
		mes "�܂��������N�����킯�ł͂Ȃ��B";
		mes "�V�i�C�����ǂ����Ă��̂悤��";
		mes "�ԓx�ɏo�Ă��邩���ׂ�";
		mes "���ꂩ��̂��Ƃ�";
		mes "�l���Ȃ��Ƃ����Ȃ�����H";
		next;
		menu "�q�V�G�̌����ʂ肾�B",-;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "�c�c���A�ł��邱�Ɓc�c";
		mes strcharinfo(0)+ "�A";
		mes "�N���V�i�C���̌����ʂ�ɓ�����";
		mes "�^���𒲂ׂ邱�Ɓc�c���炢���H";
		next;
		cutin "kardui03",2;
		mes "[�J���f���C]";
		mes "�킩�����B";
		mes "������̂��߂ɒǉ����͂�";
		mes "����悤��z����B";
		mes "�N�̓V�i�C�������߂Ă���ʂ��";
		mes "�����Ă݂�B";
		next;
		mes "[�J���f���C]";
		mes "���͂����V�i�C����";
		mes "�{���ɏ����ȈӐ}�ł��������Ɓc�c";
		mes "�M���邵���Ȃ��B";
		next;
		mes "�]�R�Q�d�V�i�C���̂Ƃ���ɍs���A";
		mes "�@�Ɩ����Ɉē����Ă��炨���]";
		set ECL_3QUE,28;
		chgquest 7449,7450;
		close2;
		cutin "kardui03",255;
		end;
	case 28:
	case 29:
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "�V�i�C�����N���I�[�u�ƏƖ�����";
		mes "�������Ƃ��闝�R��";
		mes "�������Ȃ���΂Ȃ�Ȃ��B";
		next;
		mes "[�J���f���C]";
		mes "�c�c���A�ł��邱�Ɓc�c";
		mes strcharinfo(0)+ "�A";
		mes "�N���V�i�C���̌����ʂ�ɓ�����";
		mes "�^���𒲂ׂ邱�Ɓc�c���炢���H";
		next;
		cutin "kardui03",2;
		mes "[�J���f���C]";
		mes "�킩�����B";
		mes "������̂��߂ɒǉ����͂�";
		mes "����悤��z����B";
		mes "�N�̓V�i�C�������߂Ă���ʂ��";
		mes "�����Ă݂�B";
		next;
		mes "[�J���f���C]";
		mes "���͂����V�i�C����";
		mes "�{���ɏ����ȈӐ}�ł��������Ɓc�c";
		mes "�M���邵���Ȃ��B";
		next;
		mes "�]�R�Q�d�V�i�C���̂Ƃ���ɍs���A";
		mes "�@�Ɩ����Ɉē����Ă��炨���]";
		close2;
		cutin "kardui03",255;
		end;
	case 30:
		cutin "kardui02",2;
		mes "[�J���f���C]";
		mes "���ɗ͂��Ȃ��΂���Ɂc�c";
		mes "��J�������Ă��܂����B";
		mes "���܂Ȃ��c�c�B";
		next;
		menu "�I�[�u�̊j���D��ꂽ�ƕ����܂���",-;
		mes "[�J���f���C]";
		mes "���ށc�c";
		mes "���͈ꑰ�ɋC�Â���Ȃ��悤�A";
		mes "���ƌZ����̖��͂��W�߂�";
		mes "�����I�ɃI�[�u�ɋ������Ă���B";
		next;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "�ڂ���܂����x�����c�c";
		mes "�������Z��͖��͂���������";
		mes "�K���܂��C�Â���Ă��Ȃ��B";
		mes "�͂́c�c����̓G�C���@���g��";
		mes "���ӂ����炢���̂��H";
		next;
		mes "[�J���f���C]";
		mes "�����������2�A3�{����B";
		mes "���͂������Ă���������";
		mes "�����C���ł͂Ȃ��ȁB";
		mes "���̈��閂�͂��W�߂�";
		mes "�ēx�I�[�u�̊j�𖄂߂邱�Ƃ�";
		mes "�ł��邩�ȁH";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�c�c��������ȁB";
		mes "�����玄�����͂��Ă����";
		mes "�����Ă����͂̌��E�͂���B";
		next;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "���̂��Ƃ͂��̎���������";
		mes "�l����悤�ɂ��܂��傤��B";
		next;
		mes "[�J���f���C]";
		mes "������c�c";
		mes "�j�[�Y�w�b�O�l���畷�����B";
		mes "�V�i�C���́A�����N�̎艺��";
		mes "�����Ă����炵������Ȃ����H";
		next;
		cutin "kardui02",2;
		mes "[�J���f���C]";
		mes "�ǂ����ċC�Â��Ȃ������񂾂낤�B";
		mes "�c�c�{���Ɏ��́c�c";
		mes "�l�`�̂悤�ȃ}�������c�c";
		next;
		mes "[�J���f���C]";
		mes "�������A�I�[�u��V�i�C���̂��Ƃ�";
		mes "�厖�����A����Ԃ̖���";
		mes strcharinfo(0)+ "�̂��Ƃ��B";
		cutin "kardui01",2;
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�������ȁB";
		mes "���V��̃��t�B�l������";
		mes "�Ɩ����ł̖\�s�̎�ƂƂ���";
		mes "�N�ɒ��ڂ��Ă����Ԃ��B";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "���V�����ɂ͎�����";
		mes "�I�[�u�͖������Ƙb���Ă���B";
		mes "�ނ炪�C�ɂ��Ă���̂�";
		mes "���m�����̉����";
		mes "�V�i�C���̍s�����B";
		next;
		menu "�G�C���@���g�ɂ��Ęb���B",-;
		mes "[�J���f���C]";
		mes "�����������A�N�������č��ɂ�";
		mes "�G�C���@���g�������ȁB";
		mes "���ׂĂ̂��Ƃ̌�����";
		mes "�Y���Ƃ��낾�����B";
		next;
		mes "�]�č��ŃG�C���@���g��";
		mes "�@���킵����b�ɂ��Ęb�����]";
		next;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�c�c�B";
		mes "���ǂ̓G�C���@���g�A���A�V�i�C���A";
		mes "�N�������ɗ��p����Ă����̂��B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ēx�b��߂���";
		mes strcharinfo(0)+ "�̖�肾���c�c�B";
		mes "�N�����͂��Ă������t�B�l������";
		mes "�N�̖����ɂȂ��Ă����悤���B";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "����͏�����܂��ˁB";
		mes "����ǐ����h�q��F�߂Ă�";
		mes "�\�ʓI�Ȃ����œ��S�ł́c�c";
		next;
		menu "�V�i�C����ǐՂ��܂��I",-;
		mes "["+strcharinfo(0)+"]";
		mes "�����h�q���Ƃ��Ă�����";
		mes "���m���������䂳�����͎̂����ł��B";
		mes "���ɐӔC���Ƃ�`�����X�����������B";
		mes "���ׂĂ̌����ł���V�i�C����";
		mes "�T���܂��B";
		mes "���łɃI�[�u���T���܂���I";
		next;
		mes "[�J���f���C]";
		mes "�c�c���̂悤�ɍl���Ă���Ȃ�N�ɁA";
		mes "����̎����̐ӔC����邽�߂�";
		mes "�V�i�C����T���A�Ɩ����������B";
		next;
		mes "[�J���f���C]";
		mes "�I�[�u���T�����炢�����A";
		mes "������̂��߂̏��������Ă���";
		mes "�K�v�����肻�����ȁB";
		mes "�G�C���@���g�Ƙb�����Ă݂�B";
		next;
		cutin "kardui04",2;
		mes "[�J���f���C]";
		mes "�c�c�E����ǂ��`�����X�������̂ɁB";
		mes "�c�O���B";
		mes "����͂����炩�痊�ނ����Ȃ��B";
		next;
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "�J���A���ׂĂ��܂������͂����B";
		mes "�ł�K�v�͂Ȃ��B";
		mes "���҂������W�܂����񂾂�B";
		mes "�����Ƃ��܂������B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ł́A�\�ʓI�Ȃ��Ƃ̓J�����s���A";
		mes "�V�i�C���̒ǐՂ�";
		mes strcharinfo(0)+ "�ɔC����B";
		mes "�����I�[�u�ɖ��͂𒍂��Ȃ����";
		mes "�Ȃ�Ȃ��̂ŃJ���̂��΂Ɏc��B";
		next;
		cutin "kardui01",2;
		mes "[�J���f���C]";
		mes "���肪�Ƃ��������܂��A�Z����B";
		next;
		mes "[�J���f���C]";
		mes "�ł́A�N�̍s���̎��R��";
		mes "�������Ƃ����邩��A";
		mes "�V�i�C���̂��Ƃ͗��񂾂��B";
		mes "�Z����̘b�ł�^4d4dff�r�t���X�g��";
		mes "�������Ŏ肪������݂��邱�Ƃ�";
		mes "�ł���͂�^000000�Ƃ̂��Ƃ��B";
		set ECL_3QUE,31;
		chgquest 7451,7452;
		close2;
		cutin "kardui01",255;
		end;
	case 31:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�Ɩ����ł�����������";
		mes "�����h�q���Ɨ��؂��ꂽ�B";
		mes "�s���ɐ��񂪂��������肷�邱�Ƃ�";
		mes "�Ȃ��Ȃ��Ă���B";
		next;
		mes "[�J���f���C]";
		mes "�V�i�C���̂��Ƃ͗��񂾂��B";
		mes "�Z����̘b�ł�^4d4dff�r�t���X�g��";
		mes "�������Ŏ肪������݂��邱�Ƃ�";
		mes "�ł���͂�^000000�Ƃ̂��Ƃ��B";
		close2;
		cutin "kardui01",255;
		end;
	case 32:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "���̊J�������̂��c�c";
		mes "�R�Q�d�ł���ޏ���";
		mes "���p����Ă����񂾂ȁB";
		next;
		cutin "kardui02",1;
		mes "[�J���f���C]";
		mes "�ǂ����ĒN���C�Â��Ȃ�������";
		mes "���낤�c�c�B";
		mes "���f��ӑĂ��Ăъ񂹂����ƂȂ̂��H";
		next;
		mes "[�J���f���C]";
		mes "����A�C�O�h���V���Ƒa�ʂł���";
		mes "�����C�Â��Ă��ׂ�";
		mes "�������̂��c�c�B";
		next;
		mes "[�J���f���C]";
		mes "�c�c�c�c�B";
		next;
		cutin "kardui04",1;
		mes "[�J���f���C]";
		mes "�܂��͎����������肵�Ȃ��Ă�";
		mes "�����Ȃ��ȁB";
		mes "�V�i�C���̎��́A���̈ӎu��";
		mes "�т����߂̗͂ɂȂ邾�낤�B";
		next;
		mes "[�J���f���C]";
		mes "���ꂩ��͖�����";
		mes "����ɂ��邽�߂̏���������B";
		mes "���ꂪ���̎����ł���";
		mes "�őP�̂��Ƃ�����B";
		next;
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "�N�ɂ͂���܂Ŗ{���ɐ��b�ɂȂ����ȁB";
		mes "���ꂩ����F�Ƃ��ė͂�݂��Ăق����B";
		next;
		mes "[�J���f���C]";
		mes "�C�O�h���V���̏j�����N�̂��΂Ɂc�c";
		misceffect 83,"";
		set ECL_3QUE,33;
		chgquest 7453,201615;
		getitem 6081,75;
		getexp 8450000,0;
		getexp 0,400000;
		close2;
		cutin "kardui01",255;
		end;
	case 33:
		switch(rand(3)) {
		case 0:
			cutin "kardui01",1;
			mes "[�J���f���C]";
			mes "���̒������Ȃ荬�ׂƂ��Ă���B";
			mes "���X�������̈ӎ��������荇����";
			mes "�悤�Ȃ��̂��}�����̓��̒������c�c";
			mes "����͂���𒴂���B";
			next;
			mes "[�J���f���C]";
			mes "�����A���������˂����̂�";
			mes "�Z����͉����ɍs�����񂾁H";
			mes "�ӂӁA���̂悤�Ȏ��̎p��";
			mes "���̃��t�B�l������������";
			mes "�����񂾂낤�ȁH";
			next;
			cutin "kardui05",1;
			mes "[�J���f���C]";
			mes "���͂͂͂͂�";
			mes "��N�̒m�����ꖜ�N�̒m����";
			mes "�S������Ȃ��C������B";
			next;
			cutin "kardui03",1;
			mes "[�J���f���C]";
			mes "���̃}�����̋L���������";
			mes "�T���Ă���̂�����ǁA";
			mes "�����ɑ΍R������@�Ȃǂ͂Ȃ��c�c�B";
			next;
			cutin "kardui01",1;
			mes "[�J���f���C]";
			mes "��͂肱�̕����͐��Ƃ�";
			mes "�C���邵���Ȃ��悤���ȁc�c�B";
			close2;
			cutin "kardui01",255;
			end;
		case 1:
			cutin "kardui03",1;
			mes "[�J���f���C]";
			mes "�S�g���猌�𔲂����C���Ƃ����̂�";
			mes "����Ȋ����Ȃ̂��ȁH";
			mes "���͂������Ă����C���́c�c";
			mes "���߂�A������ꂽ�c�c";
			close2;
			cutin "kardui03",255;
			end;
		case 2:
			cutin "hisie02",0;
			mes "[�q�V�G]";
			mes "���̂܂܂ɂ��Ă����Ă��c�c";
			mes "���������Q���Ƃ��낾�B";
			mes "�I�[�u�̏��������͂��[����̂�";
			mes "������ꂽ�悤���B";
			next;
			mes "[�q�V�G]";
			mes "�C�ɓ���Ȃ����A�G�C���@���g��";
			mes "�I�[�u���̊j�̑���ɂȂ�悤��";
			mes "�V������������Ă���Œ����B";
			mes "��������΁A����J�������͂�";
			mes "��������K�v���Ȃ��Ȃ邾�낤�B";
			next;
			mes "[�q�V�G]";
			mes "�{���c�c�����ɓ���";
			mes "�����邱�ƂɂȂ�Ƃ͂ȁB";
			mes "�c�c�c�c�B";
			close2;
			cutin "hisie02",255;
			end;
		}
	default:
		cutin "kardui01",1;
		mes "[�J���f���C]";
		mes "���ށc�c";
		mes "�ǂ��̒N���͒m��Ȃ����A";
		mes "���͌Ă�łȂ����H";
		close2;
		cutin "kardui01",255;
		end;
	}
}

ecl_fild01.gat,205,86,3	script	�G�N���[�W���`�߃��C	461,{
	switch(ECL_3QUE) {
	case 5:
		if(ECL_3QUE_sub & 0x4) {
			mes "[���C]";
			mes "���͗X�֕���͂��ɍs���܂��̂ŁB";
			mes "���肪�Ƃ��A����J�l�ł����B";
			close;
		}
		if(checkquest(7419)) {
			if(countitem(6552) < 1) {
				mes "[���C]";
				mes "������x�������܂��B";
				mes "�X�v�����f�B�b�h�O����n�ɍs���āA";
				mes "����A���S���Ɖ���āI";
				next;
				mes "[���C]";
				mes "�d�v�ł��Ȃ�ł��Ȃ��A";
				mes "�N���̃��u���^�[�����m��Ȃ��I";
				mes "�X�֕����󂯎���āA";
				mes "���̏��܂Ŏ����Ă��Ă��������B";
				close;
			}
			mes "[���C]";
			mes "���̔��ŊԈႢ����܂���B";
			mes "�����Ǝ󂯎���ė��܂����ˁB";
			next;
			mes "[���C]";
			mes "����ɂ��Ă��c�c���Ă��������B";
			mes "�債�����e���Ȃ����̂΂���B";
			mes "�l�I�Ȉ��A���x�̎莆��";
			mes "�唼�ł��ˁB";
			next;
			delitem 6552,1;
			set ECL_3QUE_sub,ECL_3QUE_sub|4;
			delquest 7419;
			getexp 200000,0;
			getexp 0,200000;
			if(ECL_3QUE_sub & 0x7 == 0x7) {	// ������
				mes "[�G�N���[�W���K�[�h]";
				mes "�����ɂ��܂������B";
				mes "�}�����E�W��������A���Ȃ���T���悤";
				mes "�w������܂����B";
				mes "���C�̗��݂������Ă��ꂽ��ł����H";
				cutin "minuel01",4;
				next;
				mes "[�G�N���[�W���K�[�h]";
				mes "�����ł����B";
				mes "�ł́A���̕�����̓`����";
				mes "���`�����܂��B";
				next;
				mes "[�G�N���[�W���K�[�h]";
				mes "���Ȃ��̓G�N���[�W���̂��߂�";
				mes "��������̎d�������Ă��ꂽ�B";
				mes "�����\������Ă��ꂽ�Ǝv���Ă���B";
				next;
				mes "[�G�N���[�W���K�[�h]";
				mes "�Ƃ̂��Ƃł��B";
				mes "���̂悤�ɓ`����Ε�����͂����ƁB";
				mes "����ł͎��͂���Ŏ��炵�܂��B";
				set ECL_3QUE,6;
				set ECL_3QUE_sub,0;
				chgquest 7417,7421;
				next;
				cutin "minuel01",255;
				mes "�]�}�����E�W�����@�J���f���C��";
				mes "�@�Ă�ł���炵���B";
				mes "�@���{�ɂ���J���f���C�ɉ��";
				mes "�@�s�����]";
				close;
			}
			mes "[���C]";
			mes "���͂��̗X�֕���͂��ɍs���܂��̂ŁB";
			mes "���肪�Ƃ��A����J�l�ł����B";
			close;
		}
		mes "[���C]";
		mes "����܂����B";
		mes "�{�����ɍ���܂����c�c�B";
		next;
		mes "[���C]";
		mes "�l����΍l����قǁA";
		mes "����̓V�i�C���̌����点���Ƃ���";
		mes "�v���Ȃ��ł��B";
		emotion 0;
		next;
		mes "[���C]";
		mes "����Ȑ▭�ȃ^�C�~���O��";
		mes "���ꂽ���Ȃ��B";
		mes "���̐X��ʂ��ė������Ȃ���";
		mes "�_�̏j���ł��󂯂Ă����ł����H";
		next;
		mes "[���C]";
		mes "�v���C�h�𖳂�������";
		mes "���񂾂����R�Ǝv���Ă���";
		mes "���t�B�l�ł����A�d�����Ȃ��B";
		mes "���͎��̖����厖�Ȃ̂ŁB";
		next;
		mes "[���C]";
		mes "�\���󂠂�܂��񂪁A";
		mes "�ЂƂ��肢���܂��B";
		next;
		if(select("�����H","�f��") == 2) {
			mes "[���C]";
			mes "���c�c";
			mes "�l�������Ȃ��ŋ��ۂ���Ȃ�āB";
			mes "�������c�c";
			next;
			mes "[���C]";
			mes "���͍��̋L���𖕏����܂��I";
			mes "��������΍ēx���肢���邱�Ƃ�";
			mes "�ł��܂�����I";
			mes "���͂͂͂́I";
			mes "�͂́c�c�͂��c�c";
			close;
		}
		mes "[���C]";
		mes "���������t�B�l�ɂ͓�����A";
		mes "���Ȃ������ɂ͊ȒP�Ȃ��Ƃł��B";
		mes "�X�v�����f�B�b�h����莆��";
		mes "����Ă��Ăق�����ł��I";
		next;
		mes "[���C]";
		mes "�{���͎����w�����ꂽ";
		mes "�d���Ȃ̂ł����c�c";
		mes "���͖��͂��������ł͂Ȃ��̂ŁB";
		next;
		mes "[���C]";
		mes "�X�v�����f�B�b�h�O����n��";
		mes "����A���S��������X�֕���";
		mes "����Ă��邾���ł��B";
		next;
		mes "[���C]";
		mes "���ɋɔ镶���ł��Ȃ��̂�";
		mes "���Ȃ��ɂ����߂܂��B";
		mes "�X�֕��ЂƂ����Ă��邱�Ƃ��炢";
		mes "���Ȃ��ɂ͊ȒP�ł��傤�H";
		next;
		if(select("���ɔC����","����ł�") == 2) {
			mes "[���C]";
			mes "���킠�A����𕷂��Ƃ��Ēf��Ƃ́B";
			mes "�c�c�܂��A�����͌����Ă��c�c";
			mes "�ǂ������Ȃ��͂܂�����͂��I";
			next;
			mes "[���C]";
			mes "�ӂӂӁA���͒m���Ă��܂��B";
			mes "����Ȗ�������";
			mes "�����I�΂ꂽ�̂́A";
			mes "�ڂɌ����Ȃ��傫�ȗ͂�";
			mes "�e�����Ƃ������Ƃ�!!!";
			close;
		}
		mes "[���C]";
		mes "���肪�Ƃ��������܂��I";
		mes "�X�v�����f�B�b�h�O����n�ɍs���āA";
		mes "����A���S���Ɖ���āI";
		next;
		mes "[���C]";
		mes "���̏d�v�ł��Ȃ�ł��Ȃ��A";
		mes "�N���̃��u���^�[�����m��Ȃ��I";
		mes "�X�֕����󂯎���āA";
		mes "���̏��܂Ŏ����Ă��Ă��������B";
		setquest 7419;
		next;
		mes "[���C]";
		mes "���͂����ł��Ȃ������̗X�֕���";
		mes "�����Ė߂�̂��A�����Ƒ҂������܂��B";
		close;
	case 6:
		mes "[���C]";
		mes "�G�N���[�W���K�[�h�̘b����";
		mes "�}�����E�W���������Ȃ��ɉ��������";
		mes "����悤�ł����ǁH";
		mes "�����ɂ��Ă����v�ł����H";
		close;
	case 7:
		mes "[���C]";
		mes "���ǂ͎������d���͓`�߂ł͂Ȃ��A";
		mes "�X�֔z�B�ł��B";
		mes "�c�c����Ȃ��̂ł���B";
		close;
	default:
		if(ECL_3QUE >= 8) {
			if(checkquest(7431)) {
				if(checkquest(7431) & 0x2) {
					mes "[���C]";
					mes "���낻��X�֔���";
					mes "�����ς��ɂȂ鍠���ȁB";
					delquest 7431;
					close;
				}
				mes "[���C]";
				mes "�Ȃ�����Ȃɖ��ʂȎ莆�������̂��B";
				mes "�����ĉ��������u���^�[�̊����̍����I";
				mes "�ǂ����ē`�߂̎���";
				mes "���l�̗����ɋ��͂��Ă����Ȃ����";
				mes "�����Ȃ���ł��傤���H";
				next;
				mes "[���C]";
				mes "���h�ȌR�l�ɂȂ낤��";
				mes "�v���Ă����̂Ɂc�c";
				mes "�O����n���u�肵���̂�";
				mes "�`�ߒS���ɂȂ��āA";
				mes "�����č��́c�c";
				next;
				mes "[���C]";
				mes "���A���������΁A";
				mes "�܂����Ԃ��o�Ă�";
				mes "���u���^�[�����܂�͂��ł��B";
				next;
				mes "[���C]";
				mes "����������ė���̂͂��Ȃ��A";
				mes "�����z��͎̂��B";
				mes "���������J�b�v���ł��ˁI";
				mes "���u���^�[�z�B�J�b�v���I";
				next;
				mes "�]���C�̕\��₵��������]";
				close;
			}
			if(checkquest(7430)) {
				if(countitem(6552) < 1) {
					mes "[���C]";
					mes "�X�v�����f�B�b�h�O����n�ɂ���";
					mes "����A��������X�֕���";
					mes "�󂯎���Ă��Ă��������B";
					mes "�ȒP�ł��傤�H";
					close;
				}
				mes "[���C]";
				mes "���ށc�c���ς�炸�ǂ��ł������莆��";
				mes "�b�̊p�̂悤�ȕ��������Ă��܂��ˁB";
				mes "����J�l�ł����B";
				next;
				mes "[���C]";
				mes "�����Ȃ��Ă��܂����ȏ��";
				mes "�����G�N���[�W���̔z�B���ɂȂ邩�B";
				mes "�c�c����I�Ɉꏏ�ɓ����܂��傤�B";
				mes "�ǂ��ł����H";
				next;
				if(checkitemblank() == 0) {
					mes "[���C]";
					mes "����H";
					mes "���̐��ӂ��������Ǝv���܂�����";
					mes "����������������悤�ł��B";
					mes "�������𐮗����Ă���A";
					mes "������x�b�������Ă��������B";
					close;
				}
				mes "[���C]";
				mes "���肢�ł��A���Ў������ƈꏏ��";
				mes "�����ƌ����Ă��������B";
				mes "����͎�����̏����Ȑ��ӂł��B";
				mes "�ł́A���҂����Ă���܂��I";
				delitem 6552,1;
				chgquest 7430,7431;
				getitem 6081,1;
				close;
			}
			mes "[���C]";
			mes "���́A���݂܂��񂪍�����";
			mes "�s���ė��Ă��������܂����H";
			mes "�X�v�����f�B�b�h�ɁA";
			mes "�X�֕������Ɂc�c";
			next;
			if(select("�킩����","�����͖���") == 2) {
				mes "[���C]";
				mes "�͂����c�c";
				mes "�����܂ŊȒP�ɒf����Ƃ�";
				mes "�v���Ă����܂���ł����c�c�B";
				close;
			}
			mes "[���C]";
			mes "�ł́A��낵�����肢���܂��B";
			mes "����A��������X�֕���";
			mes "�󂯎���Ă��Ă��������B";
			next;
			mes "[���C]";
			mes "�G�N���[�W�����瑗��X�֕��́A";
			mes "�⋋�����ƈꏏ�ɓ͂��Ă��܂��B";
			mes "�����A���������炱�����";
			mes "����̂�������āc�c�B";
			next;
			mes "[���C]";
			mes "����I�ɂ��Ȃ���΂Ȃ�Ȃ��̂ŁA";
			mes "���Ȃ������͂��Ă����";
			mes "��Ϗ������Ă��܂��B";
			mes "�ł́A���͂����ő҂��Ă��܂��ˁB";
			setquest 7430;
			close;
		}
		mes "[���C]";
		mes "���[���܂ł͍s����B";
		mes "�����ǁA���̐X�͂ǂ�����΂����H";
		mes "���ЂƂ�Łc�c";
		next;
		mes "[���C]";
		mes "�����c�c���݂܂���B";
		mes "�����̈�l���ł��B";
		mes "�C�ɂ��Ȃ��ł��������B";
		close;
	}
}

splendide.gat,267,368,3	script	����A����	446,{
	if(ECL_3QUE >= 6) {
		if(countitem(6552) > 0) {
			mes "[����A����]";
			mes "�ł́A�������낵�����肢���܂��B";
			mes "���C�ɓn���Ă��������B";
			close;
		}
		if(checkquest(7430)) {
			mes "[����A����]";
			mes "�������X�֕������ɗ�����ł����H";
			mes "���傤�ǂЂƔ����W�܂����Ƃ���";
			mes "�Ȃ�ł���B";
			next;
			if(select("�X�֕����󂯎��","�󂯎��Ȃ�") == 2) {
				mes "[����A����]";
				mes "���c�c�����ł����B";
				mes "�c�O�ł��ˁB";
				mes "�܂��c�c���傤���Ȃ��ł��ˁB";
				close;
			}
			if(checkitemblank() == 0) {
				mes "[����A����]";
				mes "����H";
				mes "�A�C�e���̎�ސ�����������";
				mes "�悤�ł���B";
				mes "��ސ������炵�Ă���";
				mes "������x�b�������Ă��������B";
				close;
			}
			mes "[����A����]";
			mes "�ł͎󂯎���Ă��������B";
			mes "��n���݂̂�Ȃ��ƂĂ����ł��܂��B";
			getitem 6552,1;
			next;
			mes "[����A����]";
			mes "�r���ŏd������Ƃ����āA";
			mes "�̂Ă��肵�Ȃ��ł��������ˁI";
			close;
		}
		mes "[����A����]";
		mes "�G�N���[�W�����炱����ɗ���";
		mes "�X�֕��́A�⋋�����ƈꏏ��";
		mes "�͂��Ă��܂��B";
		mes "�����A��������������ɑ��邱�Ƃ�";
		mes "���������ł��B";
		next;
		mes "[����A����]";
		mes "�d�v�Ȃ��̂͂������D��I��";
		mes "�͂�����̂ł����A���I�Ȃ��̂�";
		mes "�Ȃ�������ɂ��ꂪ���Łc�c";
		mes "���Ȃ��̂�������";
		mes "���ꂪ�����ł��ď������Ă��܂��B";
		close;
	}
	if(ECL_3QUE_sub & 0x4) {
		mes "[����A����]";
		mes "�������͖��̐X��ʂ�Ȃ��āc�c";
		mes "�T��̂����œ��͓r�₦�Ă��܂����A";
		mes "�{���ɑ�ςł��B";
		close;
	}
	if(countitem(6552) > 0) {
		mes "[����A����]";
		mes "���̔��̓��C�ɓn���Ă��������B";
		mes "��낵�����肢���܂��B";
		close;
	}
	mes "[����A����]";
	mes "����A����ɂ��́B";
	mes "�ӂӂӁc�c�ǂ��ł��A��肢�ł��傤�H";
	mes "�ŋߐl�Ԃ̕��Ɖ�@��������̂ŁA";
	mes "�撣���Č��t���o������ł���B";
	mes "���t���ʂ��Ȃ��ƕs�ւł�����ˁB";
	next;
	if(checkquest(7419)) {
		mes "[����A����]";
		mes "���A�G�N���[�W�����痈���̂ł����H";
		mes "��H�@���C�H";
		mes "�����A�����������Ƃł����B";
		mes "�҂��Ă��܂�����B";
		next;
		if(checkitemblank() == 0) {
			mes "[����A����]";
			mes "����H";
			mes "�A�C�e���̎�ސ�����������";
			mes "�悤�ł���B";
			mes "��ސ������炵�Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		mes "[����A����]";
		mes "�����ɗ���͓̂�����낤�Ȃ�";
		mes "�v���Ă�����ł���B";
		mes "���Ȃ�������ɗ��Ă����";
		mes "������܂����B";
		mes "���C�ɂ��̔���n���Ă��������B";
		getitem 6552,1;
		next;
		mes "[����A����]";
		mes "�܂��A�l�I�Ȏ莆���唼�ł����B";
		mes "��낵�����肢���܂��B";
		close;
	}
	mes "[����A����]";
	mes "�G�N���[�W���ɂ͍s���Ă݂܂������H";
	mes "���[���܂ōs�����Ȃ�G�N���[�W����";
	mes "�K�₵�Ă݂Ă��������B";
	mes "�{���ɔ������Ƃ���ł��B";
	close;
}

eclage.gat,274,294,5	script	�b���̃��t�B�l#tl01	436,3,3,{
	if(ECL_3QUE >= 9) {
		mes "[���t�B�l����]";
		mes "�������A���͉����b���Ă��Ȃ���I";
		mes "�m���Ɏ��͂����肾���ǁA";
		mes "���ł��b���킯�ł͂Ȃ��́B";
		next;
		mes "[���t�B�l����]";
		mes "�����玄���牽���𕷂��o�����Ƃ�";
		mes "�v��Ȃ��ł�A�ٖM�l�I";
		close;
	}
	mes "�]���t�B�l�̒j���������b���Ă���B";
	mes "�@�������A��������ӎ����Ă���悤��";
	mes "�@�����Ɍ�������B";
	mes "�@��b�̃W���}�������悤���]";
	close;
OnTouch:
	if(ECL_3QUE == 8 && !checkquest(7426)) {
		mes "�]���t�B�l�̒j�����b���Ă���B";
		mes "�@�����Ђ��߂Ă͂��邪�A";
		mes "�@������Ԃ��Ă��邽�߂��A";
		mes "�@�b���Ă�����e���������Ă���]";
		next;
		emotion 6,"�b���̃��t�B�l#tl01";
		mes "[���t�B�l����]";
		mes "�ǂ����Ă���ȁA����������";
		mes "������̂�I";
		mes "�������͂����ƁA�_�o���Ȃ��炢�A";
		mes "���̃}�����ɒ��ӂ𕥂�Ȃ��Ă�";
		mes "�����Ȃ��͂���I";
		next;
		mes "�]���t�B�l�̒j���́A";
		mes "�@�J���f���C�ɂ���";
		mes "�@�b���Ă���悤���]";
		next;
		mes "[���t�B�l�j��]";
		mes "���[���[��[�I";
		mes "�����ς���Ă��獡�܂ŁA";
		mes "���Ƃ��Ȃ���������H";
		mes "����Ȃ̂ɁA�Ȃ�ŋ}�ɂ���Ȃ�";
		mes "�s���ɂȂ��Ă���̂���";
		mes "�킩��Ȃ����Č����Ă�񂾂�B";
		next;
		mes "[���t�B�l����]";
		mes "�ŋ߁A�ٖM�l�ƕp�ɂɉ���Ă���";
		mes "�炵������Ȃ�?!";
		mes "�����Ɖ������ł���̂�c�c";
		next;
		emotion 54,"�G�N���[�W���Z��#tl02";
		mes "[���t�B�l�j��]";
		mes "�͂��c�c�v�����݂����������c�c";
		mes "�َ푰�Ƃ̐ڌ��Ȃ�āA";
		mes "���܂ł̃}�����l������";
		mes "���Ă�������Ȃ����B";
		next;
		emotion 7,"�b���̃��t�B�l#tl01";
		mes "[���t�B�l����]";
		mes "���Ȃ����āA�{���Ƀo�J�ˁB";
		mes "�A�[���u�w�C���̕ʎ푰�Ɖ�̂ƁA";
		mes "�~�b�h�K���h�̎푰�Ɖ�̂Ƃł́A";
		mes "�킯���Ⴄ�ł���?!";
		next;
		mes "[���t�B�l�j��]";
		mes "����Ȃ��񂩂˂��B";
		next;
		emotion 6,"�b���̃��t�B�l#tl01";
		mes "[���t�B�l����]";
		mes "����Ȃ���Ȃ́I";
		mes "�����A�\�N�̍ė���c�c";
		next;
		mes "[���t�B�l�j��]";
		mes "�c�c�Z�l�X�̂悤��";
		mes "�\�����Ă���킯�ł��Ȃ��̂Ɂc�c";
		next;
		mes "[���t�B�l����]";
		mes "���Ă��炶��x���ł���I";
		mes "���Ȃ�̂̂��ƂƂ͂����A";
		mes "�܂��������ƂɂȂ�Ȃ��Ƃ�";
		mes "�����؂�Ȃ�����Ȃ��I";
		next;
		mes "[���t�B�l�j��]";
		mes "����͂��������ǁc�c";
		next;
		mes "[���t�B�l����]";
		mes "�Z�l�X�̖\���́c�c";
		mes "���ۂɎ����o�������킯����Ȃ����ǁA";
		mes "�b�ŕ��������ŋ��낵���āc�c";
		next;
		mes "[���t�B�l����]";
		mes "���̎���Ɏ������Ȃ������̂�";
		mes "�ǂ������Ǝv���قǂ����́B";
		mes "����ς�}�����́c�c";
		mes "��������Ȃ��ƂˁH";
		next;
		mes "[���t�B�l�j��]";
		mes "����ł�����ς�A";
		mes "�V�����}�����������Ȃ��";
		mes "���܂����킯����Ȃ��B";
		mes "����ɌN���A�V�����}�������a������";
		mes "�ǂ������Ǝv���Ă���񂾂낤�H";
		next;
		mes "[���t�B�l����]";
		mes "�܂��A�����c�c�����ǁc�c";
		mes "�ǂ����Ă��A�����c�c";
		mes "�A�������Ȃ���΁A���ɋC�ɂ��邱�Ƃ�";
		mes "�Ȃ��̂Ɂc�c";
		next;
		mes "�]�����[�������Ă������Ƃ�";
		mes "�@���t�B�l�̒j���ɋC�Â��ꂽ�]";
		next;
		mes "[���t�B�l�j��]";
		mes "�c�c���̂��炢�ɂ��Ȃ�B";
		mes "�ٖM�l�ɕ��������B";
		next;
		if(select("���łɕ����������ǁA���������ڂ���������","���̘b�������H") == 1) {
			emotion 4,"�G�N���[�W���Z��#tl02";
			mes "[���t�B�l�j��]";
			mes "����A����͍���܂��B ";
			mes "�͂͂́c�c";
			mes "����͎������푰�̖��ł��B";
			next;
		}
		mes "[���t�B�l����]";
		mes "�َ푰�̐l���m��K�v�̂Ȃ��b�Ȃ́B";
		mes "�l�̘b�Ȃ񂩂ɋ�������������";
		mes "�����̂��Ƃ��C�ɂ��Ȃ����B";
		next;
		mes "�]�}�����Ɩ\�N�H";
		mes "�@�Z�l�X�Ƃ͉����H";
		mes "�@�Ƃɂ������݂̃}�����ł���";
		mes "�@�J���f���C�ɂ��āA�ƂĂ�";
		mes "�@�s���Ɏv���Ă���悤���]";
		next;
		setquest 7425;
		if(checkquest(7423) && checkquest(7424) && checkquest(7425) && checkquest(7426)) {
			mes "�]���R�ɂ��ẮA";
			mes "�@�J���f���C�ɒ��ڕ�����";
			mes "�@�݂�̂����������]";
			set ECL_3QUE,9;
			setquest 7427;
			delquest 7423;
			delquest 7424;
			delquest 7425;
			delquest 7426;
			delquest 72253;
			close;
		}
		mes "�]���̐l������������Ƙb��";
		mes "�@�����Č��悤�]";
		close;
	}
	end;
}

eclage.gat,275,294,3	script	�G�N���[�W���Z��#tl02	445,{
	switch(ECL_3QUE) {
	case 8:
		if(checkquest(7426)) {
			mes "[���t�B�l�j��]";
			mes "�َ푰�̂��Ƃ�";
			mes "���܂�֗^���Ȃ����Ƃł��B";
			mes "���ƂɊւ��鎖���Ȃ���ɁB";
			next;
			mes "�]���̐l������������Ƙb��";
			mes "�@�����Č��悤�]";
			close;
		}
		mes "�]���t�B�l�̒j�����b���Ă���B";
		mes "�@�����Ђ��߂Ă͂��邪�A";
		mes "�@������Ԃ��Ă��邽�߂��A";
		mes "�@�b���Ă�����e���������Ă���]";
		next;
		emotion 6,"�b���̃��t�B�l#tl01";
		mes "[���t�B�l����]";
		mes "�ǂ����Ă���ȁA����������";
		mes "������̂�I";
		mes "�������͂����ƁA�_�o���Ȃ��炢�A";
		mes "���̃}�����ɒ��ӂ𕥂�Ȃ��Ă�";
		mes "�����Ȃ��͂���I";
		next;
		mes "�]���t�B�l�̒j���́A";
		mes "�@�J���f���C�ɂ���";
		mes "�@�b���Ă���悤���]";
		next;
		mes "[���t�B�l�j��]";
		mes "���[���[��[�I";
		mes "�����ς���Ă��獡�܂ŁA";
		mes "���Ƃ��Ȃ���������H";
		mes "����Ȃ̂ɁA�Ȃ�ŋ}�ɂ���Ȃ�";
		mes "�s���ɂȂ��Ă���̂���";
		mes "�킩��Ȃ����Č����Ă�񂾂�B";
		next;
		mes "[���t�B�l����]";
		mes "�ŋ߁A�ٖM�l�ƕp�ɂɉ���Ă���";
		mes "�炵������Ȃ�?!";
		mes "�����Ɖ������ł���̂�c�c";
		next;
		emotion 54,"�G�N���[�W���Z��#tl02";
		mes "[���t�B�l�j��]";
		mes "�͂��c�c�v�����݂����������c�c";
		mes "�َ푰�Ƃ̐ڌ��Ȃ�āA";
		mes "���܂ł̃}�����l������";
		mes "���Ă�������Ȃ����B";
		next;
		emotion 7,"�b���̃��t�B�l#tl01";
		mes "[���t�B�l����]";
		mes "���Ȃ����āA�{���Ƀo�J�ˁB";
		mes "�A�[���u�w�C���̕ʎ푰�Ɖ�̂ƁA";
		mes "�~�b�h�K���h�̎푰�Ɖ�̂Ƃł́A";
		mes "�킯���Ⴄ�ł���?!";
		next;
		mes "[���t�B�l�j��]";
		mes "����Ȃ��񂩂˂��B";
		next;
		emotion 6,"�b���̃��t�B�l#tl01";
		mes "[���t�B�l����]";
		mes "����Ȃ���Ȃ́I";
		mes "�����A�\�N�̍ė���c�c";
		next;
		mes "[���t�B�l�j��]";
		mes "�c�c�Z�l�X�̂悤��";
		mes "�\�����Ă���킯�ł��Ȃ��̂Ɂc�c";
		next;
		mes "[���t�B�l����]";
		mes "���Ă��炶��x���ł���I";
		mes "���Ȃ�̂̂��ƂƂ͂����A";
		mes "�܂��������ƂɂȂ�Ȃ��Ƃ�";
		mes "�����؂�Ȃ�����Ȃ��I";
		next;
		mes "[���t�B�l�j��]";
		mes "����͂��������ǁc�c";
		next;
		mes "[���t�B�l����]";
		mes "�Z�l�X�̖\���́c�c";
		mes "���ۂɎ����o�������킯����Ȃ����ǁA";
		mes "�b�ŕ��������ŋ��낵���āc�c";
		next;
		mes "[���t�B�l����]";
		mes "���̎���Ɏ������Ȃ������̂�";
		mes "�ǂ������Ǝv���قǂ����́B";
		mes "����ς�}�����́c�c";
		mes "��������Ȃ��ƂˁH";
		next;
		mes "[���t�B�l�j��]";
		mes "����ł�����ς�A";
		mes "�V�����}�����������Ȃ��";
		mes "���܂����킯����Ȃ��B";
		mes "����ɌN���A�V�����}�������a������";
		mes "�ǂ������Ǝv���Ă���񂾂낤�H";
		next;
		mes "[���t�B�l����]";
		mes "�܂��A�����c�c�����ǁc�c";
		mes "�ǂ����Ă��A�����c�c";
		mes "�A�������Ȃ���΁A���ɋC�ɂ��邱�Ƃ�";
		mes "�Ȃ��̂Ɂc�c";
		next;
		mes "�]�����[�������Ă������Ƃ�";
		mes "�@���t�B�l�̒j���ɋC�Â��ꂽ�]";
		next;
		mes "[���t�B�l�j��]";
		mes "�c�c���̂��炢�ɂ��Ȃ�B";
		mes "�ٖM�l�ɕ��������B";
		next;
		if(select("���łɕ����������ǁA���������ڂ���������","���̘b�������H") == 1) {
			emotion 4,"�G�N���[�W���Z��#tl02";
			mes "[���t�B�l�j��]";
			mes "����A����͍���܂��B ";
			mes "�͂͂́c�c";
			mes "����͎������푰�̖��ł��B";
			next;
		}
		mes "[���t�B�l����]";
		mes "�َ푰�̐l���m��K�v�̂Ȃ��b�Ȃ́B";
		mes "�l�̘b�Ȃ񂩂ɋ�������������";
		mes "�����̂��Ƃ��C�ɂ��Ȃ����B";
		next;
		mes "�]�}�����Ɩ\�N�H";
		mes "�@�Z�l�X�Ƃ͉����H";
		mes "�@�Ƃɂ������݂̃}�����ł���";
		mes "�@�J���f���C�ɂ��āA�ƂĂ�";
		mes "�@�s���Ɏv���Ă���悤���]";
		next;
		setquest 7425;
		if(checkquest(7423) && checkquest(7424) && checkquest(7425) && checkquest(7426)) {
			mes "�]���R�ɂ��ẮA";
			mes "�@�J���f���C�ɒ��ڕ�����";
			mes "�@�݂�̂����������]";
			set ECL_3QUE,9;
			setquest 7427;
			delquest 7423;
			delquest 7424;
			delquest 7425;
			delquest 7426;
			delquest 72253;
			close;
		}
		mes "�]���̐l������������Ƙb��";
		mes "�@�����Č��悤�]";
		close;
	case 9:
		mes "[���t�B�l�j��]";
		mes "�َ푰�̂��Ƃ�";
		mes "���܂�֗^���Ȃ����Ƃł��B";
		mes "���ƂɊւ��鎖���Ȃ���ɁB";
		close;
	default:
		mes "[���t�B�l�j��]";
		mes "�G�N���[�W����K�ꂽ���q�l�ł��ˁB";
		mes "�G�N���[�W�����y����ł��������ˁB";
		close;
	}
}

ecl_in03.gat,244,57,5	script	�x�e���̃��t�B�l	440,3,3,{
	if(ECL_3QUE >= 9) {
		mes "[�x�e���̃��t�B�l]";
		mes "�َ푰�̓����ɁA";
		mes "���܂�ɂ������������߂��ł�";
		mes "����܂��񂩁B";
		close;
	}
	mes "�]���t�B�l2�l��";
	mes "�@������b���Ă���B";
	mes "�@1�l�͎d�������Ă���悤���B";
	mes "�@�b����������̂�";
	mes "�@�����������Ă���]";
	next;
	mes "�]������ɋC�Â���";
	mes "�@�������ɍs����";
	mes "�@�����Ŏw�����ꂽ�]";
	close;
OnTouch:
	if(ECL_3QUE == 8 && !checkquest(7426)) {
		mes "[�x�e���̃��t�B�l]";
		mes "�ǂ����Ă���ȂɈ������Ƃ�";
		mes "���đ����ɋN����̂��ȁc�c�B";
		next;
		mes "[�x�e���̃��t�B�l]";
		mes "�}�����̓C�O�h���V���Ƃ̑a�ʂ�";
		mes "�؂�Ă��܂��āA���̂�����";
		mes "�p�����邱�ƂɂȂ����B";
		mes "�X�v�����f�B�b�h�ւ̓��ɂ�";
		mes "�T�􂪂ł��Ă��܂������c�c�B";
		next;
		mes "[�x�e���̃��t�B�l]";
		mes "�b�ɂ��ƁA�T��͖�����";
		mes "��������Ȃ񂾂��āH";
		mes "�T�t�@������Y�܂��Ă���炵���ˁB";
		mes "����ɐV�����p�����ꂽ�}������";
		mes "���ƌ����Ă��c�c�A�������ȁc�c";
		next;
		mes "�]�A���H";
		mes "�@�A���Ƃ͉����낤�H�]";
		next;
		mes "[�x�e���̃��t�B�l]";
		mes "����͂��������Đ��E���łт�";
		mes "�O�G��ł͂Ȃ��̂��H";
		mes "����Ƃ��A�ȑO�ɂ�����Ȃ���";
		mes "�������̂��H";
		mes "�N�͂ǂ��v���H";
		next;
		mes "[�������̃��t�B�l]";
		mes "�c�c�d�����Ă���񂾂���";
		mes "�W���}����Ȃ�B";
		mes "�����ł����T��̂�����";
		mes "�X�v�����f�B�b�h�ւ̕⋋��";
		mes "��肪�������Ă��ē����ɂ��񂾂�B";
		next;
		mes "[�x�e���̃��t�B�l]";
		mes "���A���������΃~�b�h�K���h����";
		mes "�����Ƃ����l�Ԃ̂��ƂȂ񂾂��ǁB";
		mes "�}�����͉����l���Ă��邩";
		mes "������Ȃ����ǁA���̐l�Ԃ��Ă��";
		mes "�F�X�Ƃ�点�Ă���炵����B";
		next;
		mes "[�x�e���̃��t�B�l]";
		mes "����̃}�����͗�O�I�ɎႭ�A";
		mes "�����āc�c�A�������c�c";
		mes "�����A�ǂ����ĈٖM�l�ƕp�ɂ�";
		mes "����Ă���񂾂낤�c�c";
		mes "�����l���Ă���̂��ȁH";
		next;
		mes "[�������̃��t�B�l]";
		mes "���ٖ̈M�l�Ƃ́A���������̘b��";
		mes "�����������Ă��邠���̂��Ƃ��ȁB";
		mes "�}�������ŋߕp�ɂɉ���Ă���l�����B";
		next;
		mes "[�x�e���̃��t�B�l]";
		mes "�����!?";
		mes "�����炱���ɂ�����ł���!!";
		mes "�����͊O���̐l����������Ă�";
		mes "�����Ȃ��ꏊ�ł�!!";
		next;
		menu "�A���Ƃ����͉̂��ł����H",-;
		mes "[�������̃��t�B�l]";
		mes "���Ȃ����m��K�v�͂���܂���B";
		mes "�ǂ��ł������b�Ȃ̂�";
		mes "�C�ɂ��Ȃ��ł��������B";
		mes "�����A���q�l�͂��낻��";
		mes "��������o�Ă��������B";
		next;
		setquest 7426;
		if(checkquest(7423) && checkquest(7424) && checkquest(7425) && checkquest(7426)) {
			// ������
			mes "�]���R�ɂ��ẮA";
			mes "�@�J���f���C�ɒ��ڕ�����";
			mes "�@�݂�̂����������]";
			set ECL_3QUE,9;
			setquest 7427;
			delquest 7423;
			delquest 7424;
			delquest 7425;
			delquest 7426;
			delquest 72253;
			close;
		}
		mes "�]���t�B�l�̘b�������[���������B";
		mes "�@�A���Ƃ͉��Ȃ̂��c�c";
		mes "�@���̃��t�B�l��������";
		mes "�@�����Ƙb�𕷂��Č��悤�]";
		close;
	}
	end;
}

ecl_in03.gat,245,54,2	script	�������̃��t�B�l	439,{
	switch(ECL_3QUE) {
	case 8:
		if(!checkquest(7426)) {
			mes "[�x�e���̃��t�B�l]";
			mes "�ǂ����Ă���ȂɈ������Ƃ�";
			mes "���đ����ɋN����̂��ȁc�c�B";
			next;
			mes "[�x�e���̃��t�B�l]";
			mes "�}�����̓C�O�h���V���Ƃ̑a�ʂ�";
			mes "�؂�Ă��܂��āA���̂�����";
			mes "�p�����邱�ƂɂȂ����B";
			mes "�X�v�����f�B�b�h�ւ̓��ɂ�";
			mes "�T�􂪂ł��Ă��܂������c�c�B";
			next;
			mes "[�x�e���̃��t�B�l]";
			mes "�b�ɂ��ƁA�T��͖�����";
			mes "��������Ȃ񂾂��āH";
			mes "�T�t�@������Y�܂��Ă���炵���ˁB";
			mes "����ɐV�����p�����ꂽ�}������";
			mes "���ƌ����Ă��c�c�A�������ȁc�c";
			next;
			mes "�]�A���H";
			mes "�@�A���Ƃ͉����낤�H�]";
			next;
			mes "[�x�e���̃��t�B�l]";
			mes "����͂��������Đ��E���łт�";
			mes "�O�G��ł͂Ȃ��̂��H";
			mes "����Ƃ��A�ȑO�ɂ�����Ȃ���";
			mes "�������̂��H";
			mes "�N�͂ǂ��v���H";
			next;
			mes "[�������̃��t�B�l]";
			mes "�c�c�d�����Ă���񂾂���";
			mes "�W���}����Ȃ�B";
			mes "�����ł����T��̂�����";
			mes "�X�v�����f�B�b�h�ւ̕⋋��";
			mes "��肪�������Ă��ē����ɂ��񂾂�B";
			next;
			mes "[�x�e���̃��t�B�l]";
			mes "���A���������΃~�b�h�K���h����";
			mes "�����Ƃ����l�Ԃ̂��ƂȂ񂾂��ǁB";
			mes "�}�����͉����l���Ă��邩";
			mes "������Ȃ����ǁA���̐l�Ԃ��Ă��";
			mes "�F�X�Ƃ�点�Ă���炵����B";
			next;
			mes "[�x�e���̃��t�B�l]";
			mes "����̃}�����͗�O�I�ɎႭ�A";
			mes "�����āc�c�A�������c�c";
			mes "�����A�ǂ����ĈٖM�l�ƕp�ɂ�";
			mes "����Ă���񂾂낤�c�c";
			mes "�����l���Ă���̂��ȁH";
			next;
			mes "[�������̃��t�B�l]";
			mes "���ٖ̈M�l�Ƃ́A���������̘b��";
			mes "�����������Ă��邠���̂��Ƃ��ȁB";
			mes "�}�������ŋߕp�ɂɉ���Ă���l�����B";
			next;
			mes "[�x�e���̃��t�B�l]";
			mes "�����!?";
			mes "�����炱���ɂ�����ł���!!";
			mes "�����͊O���̐l����������Ă�";
			mes "�����Ȃ��ꏊ�ł�!!";
			next;
			menu "�A���Ƃ����͉̂��ł����H",-;
			mes "[�������̃��t�B�l]";
			mes "���Ȃ����m��K�v�͂���܂���B";
			mes "�ǂ��ł������b�Ȃ̂�";
			mes "�C�ɂ��Ȃ��ł��������B";
			mes "�����A���q�l�͂��낻��";
			mes "��������o�Ă��������B";
			next;
			setquest 7426;
			if(checkquest(7423) && checkquest(7424) && checkquest(7425) && checkquest(7426)) {
				// ������
				mes "�]���R�ɂ��ẮA";
				mes "�@�J���f���C�ɒ��ڕ�����";
				mes "�@�݂�̂����������]";
				set ECL_3QUE,9;
				setquest 7427;
				delquest 7423;
				delquest 7424;
				delquest 7425;
				delquest 7426;
				delquest 72253;
				close;
			}
			mes "�]���t�B�l�̘b�������[���������B";
			mes "�@�A���Ƃ͉��Ȃ̂��c�c";
			mes "�@���̃��t�B�l��������";
			mes "�@�����Ƙb�𕷂��Č��悤�]";
			close;
		}
		end;
	case 9:
		mes "[�Ζ����̃��t�B�l]";
		mes "�������̉��ɂ��Ēm�肽����ł����H";
		mes "����ǐl�Ԃ̉��Ǝ������̃}������";
		mes "��r���s�\�ł��B";
		mes "�l�ԑ��̊T�O��K�p����";
		mes "�l���Ȃ��ł��������B";
		next;
		mes "[�Ζ����̃��t�B�l]";
		mes "���ꂩ��c�c����ȏ�";
		mes "�َ푰�̓����ɍD��S��";
		mes "�����Ȃ��łق����ł��B";
		mes "��������������������܂������H";
		close;
	default:
		mes "[�Ζ����̃��t�B�l]";
		mes "�����͌��������邽�߂̏ꏊ�ł��B";
		mes "�o�����T���Ă��������B";
		close;
	}
}

eclage.gat,280,290,0	script	#�q�V�G01	139,3,3,{
	if(ECL_3QUE == 19) {
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�ړI�n�͂��̋߂����B";
		mes "�����p�̃��C������ꏊ���A";
		mes "�N�̎����Ă���n�}�ɂ�";
		mes "�L���Ă��B";
		viewpoint 1,307,237,0,0x0A82FF;
		next;
		mes "[�q�V�G]";
		mes "�����ޗ��͎����ė������H";
		mes "�V�i�C���ɗ��܂ꂽ���ɁA";
		mes "���R�ɐڋ߂���̂��厖���B";
		mes "�����A�s�����I";
		close2;
		cutin "hisie01",255;
		end;
	}
	end;
}

eclage.gat,307,237,0	script	�����p�̃��C#tllb	844,{
	if(ECL_3QUE == 19) {
		if(countitem(6560) < 10 || countitem(6561) < 10) {
			cutin "hisie01",0;
			mes "[�q�V�G]";
			mes "�ق���̉�Ɨ����t�̂������";
			mes "��������Ȃ��񂶂�Ȃ����H";
			mes "������������B";
			mes "���ꂪ����Ή����܂�Ȃ��ςށB";
			close2;
			cutin "hisie01",255;
			end;
		}
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "���̃��C���B";
		mes "���܂�����Ă����B";
		mes "�����̊O�ɏo��悤��";
		mes "���R�ɗU������񂾁B";
		next;
		cutin "avn_labo",4;
		mes "�]�q�V�G���g���B�����̂��m�F��";
		mes "�@���C�̔���@�����]";
		next;
		mes "�]����@���ƁA���̌���������";
		mes "�@�l�̋C�z�����A";
		mes "�@���ɐݒu���ꂽ�̂��������J�����]";
		next;
		cutin "avn_labo",255;
		mes "[�����畷�����鐺]";
		mes "�c�c�N���H";
		mes "�l�ԁH�@�Ȃ̂��H";
		mes "�قق��A�������B";
		next;
		cutin "avant01",1;
		mes "�]���C�̔����J���A�����������";
		mes "�@�㋉���t�B�l���o�Ă����B";
		mes "�@�ނ͋����[���ɂ�����̑S�g��";
		mes "�@���ߎn�߂��]";
		next;
		mes "[�����̖��w��]";
		mes "�ӂ�A�l�ԁc�c";
		mes "��͂�債�����Ƃ̂Ȃ��푰���ȁB";
		mes "�������Ȃ��l�Ԃ��K�˂Ă����H";
		mes "�܂�Ȃ����Ƃŗ����̂ł����";
		mes "�o�債�������������B";
		next;
		menu "��z���c�c",-,"�V�i�C���̈˗��Łc�c",-;
		mes "[�����̖��w��]";
		mes "���H�@�V�i�C���ɗ��܂ꂽ�̂��H";
		mes "�ق���̉�Ɨ����t�̂����肩�B";
		mes "�����Ŏ����Ă��Ȃ��Ƃ́A";
		mes "��肭�ǂ����Ƃ��c�c";
		next;
		mes "[�����̖��w��]";
		mes "�����A�l�ԁB";
		mes "����Ȃ��̂��A";
		mes "���O�̂ق��ɋ���������B";
		mes "�ǂ����H";
		mes "���̎����ޗ��ɂȂ�Ȃ����H";
		next;
		cutin "avant02",1;
		mes "[�����̖��w��]";
		mes "��V�͋�ɂ̂Ȃ��������B";
		mes "�ǂ���������H";
		mes "�c�c�N�N�N";
		next;
		mes "[�����̖��w��]";
		mes "�����\���";
		mes "�����̂ɂȂ�C���Ȃ��Ȃ�";
		mes "��x�Ƃ����ɂ͋ߊ��ȁB";
		next;
		cutin "avant01",255;
		mes "�]���w�҂͂����΂��悤�ȕ\���";
		mes "�@�����ޗ���D���ă��C�̒���";
		mes "�@�߂��Ă��܂����B";
		mes "�@�ނ����C�̒��ɓ�������A";
		mes "�@�؂̌�납��q�V�G���p���������]";
		next;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�ԈႢ�Ȃ��c�c";
		mes "�����̓G�C���@���g���B";
		mes "���̖т̐F�͕ς���Ă������A";
		mes "���̑����炵���b������";
		mes "�ς���Ă��Ȃ������B";
		next;
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�V�i�C���͂����̂��Ƃ�";
		mes "�m���Ă��Ďx�����Ă���̂��H";
		mes "�Ƃɂ����A�܂��͂�̋��ꏊ��";
		mes "�J���ɒm�点�邱�Ƃɂ��悤�B";
		next;
		cutin "hisie01",255;
		mes "�]�����p�̃��C�ɂ����̂́A";
		mes "�@���w�҃G�C���@���g�������B";
		mes "�@�J���f���C�ɕ񍐂��悤�]";
		set ECL_3QUE,20;
		delitem 6561,10;
		delitem 6560,10;
		chgquest 7441,7442;
		close;
	}
	if(ECL_3QUE == 20) {
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�z���C�Â��O��";
		mes "�}���ł��̏ꂩ�痣��悤�B";
		mes "�J���ɂ��̎�����m�点��̂��悾�B";
		next;
		cutin "hisie01",255;
		mes "�]�����p�̃��C�ɂ����̂́A";
		mes "�@���w�҃G�C���@���g�������B";
		mes "�@�J���f���C�ɕ񍐂��悤�]";
		close;
	}
	if(ECL_3QUE == 21) {
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�G�C���@���g�̃��C������";
		mes "�����d�|�����{����Ă��邩��";
		mes "����Ȃ��B";
		mes "�l�q���݂Ă�����邱�Ƃɂ��悤�B";
		next;
		if(select("����������","�����������̗͂l�q���݂�B") == 2) {
			cutin "hisie03",0;
			mes "[�q�V�G]";
			mes "�������@�I�Ȏd�|����������ȁc�c";
			mes "��͂�A�������s���Ă���̂�";
			mes "���̃��C�ł͂Ȃ��������B";
			mes "���Ԃ�A���̃��C����ʂ̋�Ԃ�";
			mes "�q�����Ă���̂��낤�B";
			next;
			cutin "hisie01",0;
			mes "[�q�V�G]";
			mes "�T�d�ɐi�����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		if(getnpctimer(1,"#tltimer")) {
			cutin "hisie01",0;
			mes "[�q�V�G]";
			mes "�Â��ɁB";
			mes "������l�̋C�z����������B";
			mes "���������҂��āA";
			mes "�z���Ȃ��͂��������ɓ��낤�B";
			next;
			mes "�]���̃v���C���[���g�p���ł��B";
			mes "�@���΂炭�܂��Ă���";
			mes "�@���������������]";
			close2;
			cutin "hisie01",255;
			end;
		}
		cutin "hisie01",255;
		warp "que_avan01.gat",26,26;
		end;
	}
	if(ECL_3QUE >= 22) {
		cutin "avn_labo",4;
		mes "�]���w�҂̔閧�����{�݂�";
		mes "�@�q�����Ă��郄�C���B";
		mes "�@���w�҃G�C���@���g��";
		mes "�@�A�s����Ă����ɂ͂��Ȃ��]";
		close2;
		cutin "avn_labo",255;
		end;
	}
	cutin "avn_labo",4;
	mes "�]���t�B�l������";
	mes "�@�Z��ł��郄�C���B";
	mes "�@�����܂��Ă���";
	mes "�@���邱�Ƃ��ł��Ȃ��]";
	close2;
	cutin "avn_labo",255;
	end;
OnInit:
	waitingroom "�����p�̃��C",0;
	end;
}

que_avan01.gat,26,26,0	script	#tltimer	139,1,1,{
	mes "�]�m���ɏ����ȃ��C�ɓ������̂ɁA";
	mes "�@�ڂ܂��̌�ɋC���t����";
	mes "�@�傫�ȋ�Ԃ����ꂽ�]";
	hideonnpc "#tltimer";
	hideonnpc "�q�V�G#tlhunt";
	hideonnpc "���w�҃G�C���@���g#tlac";
	hideonnpc "�G�C���@���g�̏�����#01";
	hideonnpc "�G�C���@���g�̏�����#02";
	hideonnpc "�G�C���@���g�̏�����#03";
	hideonnpc "�G�C���@���g�̏�����#04";
	initnpctimer;
	next;
	cutin "hisie01",0;
	mes "[�q�V�G]";
	mes "���}�ȃ��C��閧��������";
	mes "�q���Ă����悤���B";
	mes "���܂�����Ă���ȁc�c�B";
	mes "�Ƃɂ������ׂĂ݂悤�B";
	hideoffnpc "�q�V�G#tlspt";
	close2;
	cutin "hisie01",255;
	end;
OnTimer5000:
	announce "���A��Ȃ����A�G�C���@���g�l�c�c�g�p�ҔF�ؑҋ@����5���ł��B",0x9,0xa8a8a8;
	end;
OnTimer300000:
	announce "�x�� : �����ԔF�؂��s���Ă��Ȃ������̂Ŋ֌W�҈ȊO�̏o���֎~���@�������Ŕ������܂��B",0x9,0xa8a8a8;
	end;
OnTimer303000:
	announce "�����������ɋ�Ԃ̘c�݂��������܂����B",0x9,0x7b68ee;
	end;
OnTimer306000:
	stopnpctimer;
	mapwarp "que_avan01.gat","eclage.gat",265,275;
	end;
}

que_avan01.gat,18,38,0	script	�f�X�N#tl01	844,{
	if(ECL_3QUE == 22) {
		mes "�]�G�C���@���g�̌���������";
		mes "�@���łɎ�ɓ��ꂽ�B";
		mes "�@�f�X�N�ɂ���ȏ�̗p�͂Ȃ��]";
		close;
	}
	if(!checkquest(72278)) {
		mes "�]�e���������Ǝ�����";
		mes "�@�u����Ă���f�X�N���B";
		mes "�@�ǂ�����H�]";
		cutin "avn_desk01",4;
		next;
		if(select("�f�X�N�𒲂ׂ�","��������") == 2) {
			mes "�]���̏ꏊ�𒲂ׂ邱�Ƃɂ����]";
			close2;
			cutin "avn_desk03",255;
			end;
		}
		mes "�]�f�X�N��ɍL�����Ă������̂�";
		mes "�@��̐��������]";
		cutin "avn_desk02",4;
		set '@flag,checkquest(72273);
		next;
		while(1) {
			if(!'@flag)
				cutin "avn_desk02",4;
			else
				cutin "avn_desk04",4;
			mes "�]���𒲂ׂ�H�]";
			next;
			switch(select("�u���Ă��������ނ𒲂ׂ�","�f�X�N��̑��u�𒲂ׂ�","�{�I�̖{�𒲂ׂ�","�����H�ׂĂ݂�","�Ɩ����u�𒲂ׂ�")) {
			case 1:
				mes "�]����������Ă���̂��A";
				mes "�@�܂�����������Ȃ��B";
				mes "�@�q�V�G�Ɍ����悤�]";
				next;
				cutin "hisie01",0;
				mes "[�q�V�G]";
				mes "�^���̔���������c�c";
				mes "�c�c����Ȃ��ȁB";
				next;
				cutin "hisie01",255;
				continue;
			case 2:
				if(!'@flag) {
					mes "�]�������ꂽ�f�X�N�̏��";
					mes "�@���u�炵�����̂�������B";
					mes "�@���u�𑀍�ł���q���g��";
					mes "�@�������ɂ���͂����]";
					next;
					continue;
				}
				mes "�]�������ꂽ�f�X�N�̏��";
				mes "�@���u�炵�����̂�������B";
				mes "�@�����ɂ͏����Ȑ�����";
				mes "�@�����ꂽ������B";
				mes "�@5���܂œ��͂ł���悤���]";
				next;
				if(select("��������͂���","���̕����𒲂ׂĂ݂�") == 2) {
					mes "�]���̕����𒲂ׂĂ݂邱�Ƃɂ����]";
					next;
					continue;
				}
				input '@num;
				if('@num != 31425) {
					mes "�]�������Ԉ�����悤���]";
					next;
					continue;
				}
				mes "�]��������͂���Ɠ�̉��������B";
				mes "�@�J�����Ƃ��ł��������]";
				chgquest 72273,72278;
				next;
				break;
			case 3:
				if('@flag) {
					mes "�]�{��z�u����ƁA�w�\���̖�l��";
					mes "�@�ЂƂ̊G�ɂȂ����B";
					mes "�@�{�͍�����";
					mes "�@^0000FF3���A1���A4���A2���A5��^000000";
					mes "�@�̏��Ԃɕ���ł���B";
					mes "�@�������ʂȈӖ�������̂��c�c�H�]";
					cutin "avn_book01",4;
					next;
					continue;
				}
				mes "�]5���̖{������ł���B";
				mes "�@�ς������l���C�ɂȂ�]";
				cutin "avn_book02",4;
				next;
				switch(select("�{�̔z���ς��Ă݂�","�l����","��߂�")) {
				case 1:
					set '@book,0;
					setarray '@books$,"1�Ԗ�","2�Ԗ�","3�Ԗ�","4�Ԗ�","5�Ԗ�";
					for(set '@i,1; '@i<5; set '@i,'@i+1){
						if('@i<=1)
							mes "�]1�������Ԗڂɔz�u����H�]";
						else
							mes "�]" +'@i+ "���͉��Ԗڂɔz�u����H�]";
						next;
						set '@menu,select(printarray('@books$))-1;
						if('@i<=3) {
							mes '@i+ "����" +'@books$['@menu]+ "�ɔz�u�����B";
							set '@books$['@menu],"";
						}
						else {
							mes "4����" +'@books$['@menu]+ "�ԖڂɁA";
							set '@books$['@menu],"";
							mes "5����" +printarray('@books$)+ "�Ԗڂɔz�u�����B";
						}
						if(('@i==1 && '@menu==2) || ('@i==2 && '@menu==0) || ('@i==3 && '@menu==3) || ('@i==4 && '@menu==1)) {
							set '@book,'@book+10;
						}
						next;
					}
					if('@book < 40) {
						mes "�]�{�̔z�u��ς��Ă݂����A";
						mes "�@���̐��ʂ��Ȃ������]";
						cutin "avn_desk02",4;
					} else {
						mes "�]�{��z�u����ƁA�w�\���̖�l��";
						mes "�@�ЂƂ̊G�ɂȂ����B";
						mes "�@�{�͍�����";
						mes "�@^0000FF3���A1���A4���A2���A5��^000000";
						mes "�@�̏��Ԃɕ���ł���B";
						mes "�@�������ʂȈӖ�������̂��낤���H�]";
						setquest 72273;
						set '@flag,1;
						cutin "avn_book01",4;
					}
					next;
					continue;
				case 2:
					mes "�]�{���悭�ώ@�����";
					mes "�@�w�\���̕��l���s�����Ȏ���";
					mes "�@�C�Â����B";
					mes "�@�w�\���̕��l�ɂ��킹��";
					mes "�@���ёւ���Ƃ��������낤���]";
					next;
					switch(rand(1,5)) {
					case 1:
						mes "�]�ǂ����^FF00001����2�Ԗ�^000000��";
						mes "�@�z�u����Ɨǂ��������]";
						break;
					case 2:
						mes "�]�ǂ����^FF00002����4�Ԗ�^000000��";
						mes "�@�z�u����Ɨǂ��������]";
						break;
					case 3:
						mes "�]�ǂ����^FF00003����1�Ԗ�^000000��";
						mes "�@�z�u����Ɨǂ��������]";
						break;
					case 4:
						mes "�]�ǂ����^FF00004����3�Ԗ�^000000��";
						mes "�@�z�u����Ɨǂ��������]";
						break;
					case 5:
						mes "�]�ǂ����^FF00005����5�Ԗ�^000000��";
						mes "�@�z�u����Ɨǂ��������]";
						break;
					}
					next;
					continue;
				case 3:
					mes "�]���̕����𒲂ׂĂ݂邱�Ƃɂ����]";
					next;
					continue;
				}
			case 4:
				mes "�]���̏�ɗ���Ă��鎎���";
				mes "�@�w�ł������Ė��������B";
				mes "�@����Ȓɂ݂��̂��P�����]";
				percentheal -50,0;
				next;
				continue;
			case 5:
				mes "�]���}�ȉ~�`�̏Ɩ����u�ł���B";
				mes "�@���ʂȋ@�\�⑕�u�͂Ȃ��]";
				next;
				continue;
			}
			break;
		}
	}
	mes "�]���̒��̔閧��Ԃɂ�";
	mes "�@���������̈ꕔ�������Ă����B";
	mes "�@���e���킩��Ȃ��B";
	mes "�@�q�V�G�Ɍ����邱�Ƃɂ����]";
	cutin "avn_desk03",4;
	next;
	mes "[�q�V�G]";
	mes "�������������̂��H";
	mes "��H�@����́c�c";
	mes "�ꂳ��̎ʐ^���ȁB";
	mes "�z���ǂ����Ă����";
	mes "�����Ă���񂾁H";
	cutin "hisie01",0;
	next;
	switch(select("���l�ł���","���̕��������Ă��������I")) {
	case 1:
		cutin "hisie02",0;
		mes "[�q�V�G]";
		mes "���ƃJ���̔��̖т�";
		mes "�ꂳ�񂩂�󂯌p�����񂾁B";
		mes "�J���ɂƂ��ẮA";
		mes "�B��c���Ă���ꂳ���";
		mes "���Ղł�����c�c";
		next;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "������ׂɂ��邱�̕����́c�c";
		mes "���ꂪ�z�̌��������Ȃ̂��B";
		mes "�ǂ�ǂ�c�c";
		mes "�ށA����́c�c";
		mes "�܂����c�c�M�����Ȃ��I";
		break;
	case 2:
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "���A�����B�����������ȁB";
		mes "�ǂ�ǂ�c�c";
		mes "�ށA����́c�c";
		mes "�܂����c�c�M�����Ȃ��I";
		break;
	}
	next;
	mes "[�q�V�G]";
	mes "�G�C���@���g�͂���Ȃ��̂�";
	mes "�������Ă����̂�!?";
	mes "����Ȃ̂����Ɏg���񂾁H";
	next;
	menu "���ł����H",-;
	cutin "hisie01",0;
	mes "[�q�V�G]";
	mes "����̓I�[�u�ɂ��Ă̌����������B";
	mes "�G�N���[�W���̏ے��ł���A";
	mes "�ꑰ�̖��͂��W�܂��Ă���I�[�u�I ";
	mes "�I�[�u�̖��͂��ǂ��������Ȃ񂾁H";
	next;
	mes "[�q�V�G]";
	mes "���̌����͊댯���B";
	mes "�V�i�C���͂��̌������e��m���Ă���";
	mes "�x�����Ă���̂��H";
	mes "�����J���ɒm�点�Ȃ��ƁI";
	next;
	cutin "avant01",1;
	mes "[���w�҃G�C���@���g]";
	mes "����A����͍���B";
	mes "����ȓz�炾�ȁB";
	mes "�g����ȍs���͂����܂ł��I";
	hideoffnpc "���w�҃G�C���@���g#tlac";
	hideoffnpc "�G�C���@���g�̏�����#01";
	hideoffnpc "�G�C���@���g�̏�����#02";
	hideoffnpc "�G�C���@���g�̏�����#03";
	hideoffnpc "�G�C���@���g�̏�����#04";
	next;
	cutin "hisie01",0;
	mes "[�q�V�G]";
	mes "���̌��������𗊂ށB";
	mes "�G�C���@���g�͎����߂܂���B";
	next;
	switch(select("����A�����͎���","�q�V�G�ɔC����")) {
	case 1:
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�c�c���������B";
		mes "�G�C���@���g���Ăяo����";
		mes "�z�炳���|���΂����͂����B";
		mes "���͌�납�片�삷��B";
		mes "�������K�v�Ȏ���";
		mes "���̋߂��܂ŉ�����񂾁B";
		if(checkitemblank() == 0) {
			next;
			mes "[�q�V�G]";
			mes "��?!";
			mes "�ו����������āA";
			mes "�G�C���@���g�̌���������";
			mes "���ĂȂ����I";
			mes "�����������炵��";
			mes "������x�b�������Ă���I";
			close;
			close2;
			cutin "hisie01",255;
			warp "eclage.gat",265,275;
			end;
		}
		getitem 6541,1;
		set ECL_3QUE,22;
		delquest 7443;
		delquest 72278;
		setquest 7444;
		close2;
		donpcevent "#avt�Ǘ���::OnStart1";
		cutin "hisie01",255;
		end;
	case 2:
		cutin "hisie04",0;
		mes "[�q�V�G]";
		mes "�ォ�玄���s���B";
		mes "�������J���ɓn���Ă���I";
		if(checkitemblank() == 0) {
			next;
			mes "[�q�V�G]";
			mes "��?!";
			mes "�ו����������āA";
			mes "�G�C���@���g�̌���������";
			mes "���ĂȂ����I";
			mes "�����������炵��";
			mes "������x�b�������Ă���I";
			close2;
			cutin "hisie01",255;
			warp "eclage.gat",265,275;
			end;
		}
		set ECL_3QUE,22;
		delquest 7443;
		delquest 72278;
		setquest 7444;
		getitem 6541,1;
		close2;
		warp "eclage.gat",294,240;
		end;
	}
}

que_avan01.gat,1,1,0	script	#avt�Ǘ���	844,{
OnStart1:
	hideonnpc "�G�C���@���g�̏�����#01";
	hideonnpc "�G�C���@���g�̏�����#02";
	hideonnpc "�G�C���@���g�̏�����#03";
	hideonnpc "�G�C���@���g�̏�����#04";
	monster "que_avan01.gat",22,40,"�G�C���@���g�̏�����",1198,1,"#avt�Ǘ���::OnKilled1";
	monster "que_avan01.gat",29,40,"�G�C���@���g�̏�����",1198,1,"#avt�Ǘ���::OnKilled1";
	monster "que_avan01.gat",16,40,"�G�C���@���g�̏�����",1198,1,"#avt�Ǘ���::OnKilled1";
	monster "que_avan01.gat",29,36,"�G�C���@���g�̏�����",1198,1,"#avt�Ǘ���::OnKilled1";
	monster "que_avan01.gat",29,32,"�G�C���@���g�̏�����",1198,1,"#avt�Ǘ���::OnKilled1";
	end;
OnStart2:
	initnpctimer;
	end;
OnTimer1000:
	misceffect 55,"���w�҃G�C���@���g#tlac";
	end;
OnTimer2000:
	monster "que_avan01.gat",26,38," ",2337,1,"#avt�Ǘ���::OnKilled2";
	end;
OnTimer4000:
	announce "�q�V�G : ��΂��I",0x9,0x7b68ee;
	end;
OnTimer8000:
	stopnpctimer;
	killmonster "que_avan01.gat","#avt�Ǘ���::OnKilled2";
	end;
OnKilled1:
	set '@count,getmapmobs("que_avan01.gat","#avt�Ǘ���::OnKilled1");
	if('@count <= 0) {
		announce "�q�V�G : �����܂ł��I�@�G�C���@���g�I",0x9,0x7b68ee;
		hideonnpc "�q�V�G#tlspt";
		hideoffnpc "�q�V�G#tlhunt";
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�\��Ȃ������������B";
		mes "�]�v�Ȃ��Ƃ͂���Ȃ�B";
		next;
		cutin "avant02",2;
		mes "[�G�C���@���g]";
		mes "���f�N���ɖO�����炸�A";
		mes "���x�͝f�v���H";
		mes "�Ⴂ�z��͂��ꂾ����c�c";
		mes "�܂��A�D���ɂ���B";
		next;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�c�c�������ł���H";
		mes "����Ȃ�������ƕ߂܂�z�ł�";
		mes "�Ȃ����낤�H";
		next;
		cutin "avant02",2;
		mes "[�G�C���@���g]";
		mes "�N�N�N�c�c";
		mes "�v���Ԃ�ɑ��q��";
		mes "��ɗ����̂��������ĂȁB";
		next;
		cutin "hisie03",0;
		mes "[�q�V�G]";
		mes "�ӂ�����ȁc�c";
		mes strcharinfo(0)+ "�I";
		mes "�����Ƃ���ȏ�b���K�v��";
		mes "�Ȃ����낤�H";
		mes "��������͎����������邩��A";
		mes "�N�͐�ɏo�����Ă���B";
		close2;
		cutin "hisie01",255;
		warp "eclage.gat",294,240;
		end;
	}
	end;
OnKilled2:
	end;
}

que_avan01.gat,26,41,3	script	���w�҃G�C���@���g#tlac	618,{
	cutin "avant02",1;
	mes "[�G�C���@���g]";
	mes "���̂��炾�Ɏ������Ƃ�";
	mes "���ɂ����ē�����������";
	mes "�Ȃ����񂾂ȁA�ᑢ�I";
	mes "�肢�ʂ�ɂ��Ă��!!";
	close2;
	cutin "avant01",255;
	donpcevent "#avt�Ǘ���::OnStart2";
	end;
}

que_avan01.gat,22,40,3	script	�G�C���@���g�̏�����#01	1198,{}
que_avan01.gat,29,40,3	script	�G�C���@���g�̏�����#02	1198,{}
que_avan01.gat,29,36,3	script	�G�C���@���g�̏�����#03	1198,{}
que_avan01.gat,29,32,3	script	�G�C���@���g�̏�����#04	1198,{}

que_avan01.gat,23,34,2	script	�q�V�G#tlspt	623,3,3,{
	if(ECL_3QUE == 22) {
		cutin "hisie01",0;
		mes "[�q�V�G]";
		mes "�B��Ă���Ȃ��̂�";
		mes "�������Ă����Ƃ́c�c";
		close2;
		cutin "hisie01",255;
		end;
	}
	cutin "hisie01",0;
	mes "[�q�V�G]";
	mes "�ǂ����ɏd�v��";
	mes "��������������͂����B";
	close2;
	cutin "hisie01",255;
	end;
OnTouch:
	if(ECL_3QUE == 22) {
		switch(rand(4)) {
		case 0:
			npcskillsupport 28,1672;
			heal 1672,0;
			break;
		case 1:
			npcskillsupport 28,9999;
			heal 9999,0;
			npcskillsupport 34,0;
			sc_start 10,240000,10;	//SC_BLESSING
			npcskillsupport 29,0;
			sc_start 12,240000,10;	//SC_INCREASEAGI
			break;
		case 2:
			npcskillsupport 34,0;
			sc_start 10,240000,10;	//SC_BLESSING
			break;
		case 3:
			npcskillsupport 29,0;
			sc_start 12,240000,10;	//SC_INCREASEAGI
			break;
		}
	}
	end;
}

que_avan01.gat,25,41,5	script	�q�V�G#tlhunt	623,{}

bif_fild02.gat,311,91,3	script	����ȉԂ̂ڂ�	613,{
	if(ECL_3QUE == 31) {
		mes "�]���t�B�l�̎��̂��B";
		mes "�@�p���݂�ƁA���S���Ă���";
		mes "�@���܂莞�Ԃ��o���Ă��Ȃ��悤���]";
		next;
		mes "�]�ڂ������ׂĂ݂�ƁA";
		mes "�@���̎��̂͏������V�i�C�����I";
		mes "�@���Ǝv���镔���Ɍ����J���Ă���]";
		next;
		mes "�]�����痬�ꂽ������";
		mes "�@��̕����Ɍ����Ă���B";
		mes "�@�����������̂悤�ȕ���";
		mes "�@�ʂ����悤�ȐՂ��]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���������̕����Ƃ����΁c�c";
		mes "�T�􂾂ȁB";
		mes "�c�c�T��ɓ������̂��B";
		next;
		mes "�]�V�i�C���ɂƂ���Ă������݂�";
		mes "�@�T��ɓ������悤���]";
		next;
		mes "�]����ȏ㓾������͂Ȃ��B";
		mes "�@���̎������}���ŃJ���f���C��";
		mes "�@�m�点�������ǂ��������]";
		set ECL_3QUE,32;
		chgquest 7452,7453;
		close;
	}
	if(ECL_3QUE == 32) {
		mes "�]�R�Q�d�V�i�C���̎��̂��B";
		mes "�@�V�i�C�����x�z���Ă����{�̂�";
		mes "�@���łɔ����o���Ă���]";
		close;
	}
	mes "�]����ȉԂ̂ڂ݂̂悤��";
	mes "�@�`�����Ă��鐳�̕s����";
	mes "�@���̂�����]";
	close;
}

//============================================================
// �������̑㏞�N�G�X�g
//- Registry -------------------------------------------------
// ECL_4QUE -> 0�`24
//------------------------------------------------------------
eclage.gat,282,255,4	script	�E�n��	620,{
	switch(ECL_4QUE) {
	case 0:
		mes "[�E�n��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�E�n��]";
		mes "���߂Č���p�c�c�B";
		mes "���Ȃ��A���̐��E�̏Z�l�ł�";
		mes "����܂���ˁH";
		next;
		mes "[�E�n��]";
		mes "�c�c���`��I";
		mes "���m��ʐ��E�ɂ܂ň�l��";
		mes "���邱�Ƃ��ł���E�C�ƒm���I";
		mes "������������̂��Ȃ��Ȃ�A";
		mes "�����ƌo�����L�x�Ȃ̂ł��傤�B";
		next;
		mes "[�E�n��]";
		mes "���̓E�n���B";
		mes "�w�҂����Ă���܂��B";
		mes "�n���̖`���җl�A���Ȃ���";
		mes "�����O�������������������I";
		next;
		menu "�����",-;
		emotion 3;
		emotion 40,"";
		mes "[�E�n��]";
		mes "�킠�I";
		mes "���������O�ł��ˁA";
		mes "�����������ł��I";
		mes "���������F��ȏC�����";
		mes "�o�����ė����̂ł��傤�H";
		next;
		mes "[�E�n��]";
		mes "�c�c�c�c�B";
		mes strcharinfo(0)+ "�l�c�c�B";
		mes "�����������Ȃ��ɁA";
		mes "1���肢������܂��B";
		mes "�����Ă��������܂��񂩁H";
		next;
		if(select("�b���𕷂�","���͖Z����") == 2) {
			mes "[�E�n��]";
			mes "�����ł����B";
			mes "�c�O�ł��c�c�B";
			next;
			emotion 28;
			mes "[�E�n��]";
			mes "�W���}�����Ă��݂܂���ł����B";
			close;
		}
		emotion 18;
		mes "[�E�n��]";
		mes "���肪�Ƃ��������܂�!!!";
		next;
		mes "[�E�n��]";
		mes "���ɂ�^0000cd�Z^000000����l���܂��B";
		next;
		mes "[�E�n��]";
		mes "�����A�Z���c�c�B";
		mes "�����͖��̒m��ꂽ�w�҂ł��B";
		mes "�Z�́A�������N���Ƃɕ���������";
		mes "�����̂ŁA���Ԃ�����Y�����";
		mes "���܂��܂������c�c�B";
		next;
		mes "[�E�n��]";
		mes "���͂����ȂƂ����";
		mes "�����̎�`����u���Ȃǂ�";
		mes "�o�����Ă��܂��B";
		next;
		mes "[�E�n��]";
		mes "�����ł͂���܂��񂪁A";
		mes "�������Ɠ����悭�ĐF��ȏ�����";
		mes "�Ă΂���ł��B�ււցB";
		next;
		mes "[�E�n��]";
		mes "����ŁA�ŋߒ����ԁA�Ƃ𗣂��";
		mes "�����̂ł����A���̊ԂɌZ��";
		mes "�p�������Ă��܂����̂ł��B";
		next;
		mes "[�E�n��]";
		mes "�Ƃ��󂯂Ă���Ԃ��A�Z�Ƃ͎莆��";
		mes "�A�������Ă����̂ł����A�}�ɘA����";
		mes "�r�₦�āc�c�B";
		next;
		mes "[�E�n��]";
		mes "�S�z�ɂȂ��ċ}���ŉ�ɗ�����";
		mes "^0000cd�Z���č��ɘA��čs���ꂽ^000000";
		mes "�Ƃ������Ⴀ��܂��񂩁I";
		next;
		mes "[�E�n��]";
		mes "�莆�ŁA�ŋ߉����������s���Ă���";
		mes "�悤�Ȃ��Ƃ������Ă��܂������A";
		mes "�ڂ����b�͒m��܂���B";
		mes "�����A�č��ɘA��čs�����悤��";
		mes "���Ƃ��Z������Ȃ�ĐM�����Ȃ��āB";
		next;
		mes "[�E�n��]";
		mes "���ڕ����������ǁA���̐g���ł�";
		mes "�č��ɍs�����Ƃ��ł��Ȃ��̂Łc�c�B";
		next;
		mes "[�E�n��]";
		mes strcharinfo(0)+ "�l��";
		mes "^0000cd���̑���Ɋč��ɂ���Z�ɉ����^000000";
		mes "�����������̂��A�b�𕷂��Ă���";
		mes "����܂��񂩁H";
		next;
		if(select("�����󂯂�","�č��ɂȂ�čs�������Ȃ�") == 2) {
			mes "[�E�n��]";
			mes "�����c�c�ł���ˁc�c�B";
			mes strcharinfo(0)+ "�l��";
			mes "��������邱�Ƃ��悭�킩��܂��B";
			mes "�Z�����̂ɖ����ȗ��݂�������";
			mes "���݂܂���ł����c�c�B";
			set ECL_4QUE,1;
			close;
		}
		emotion 3;
		mes "[�E�n��]";
		mes "�{���ł���!?";
		mes "���肪�Ƃ��������܂��I";
		mes "��͂�A�n���̖`���җl��";
		mes "�D�ꂽ�l�i�����������c�c�B";
		next;
		mes "[�E�n��]";
		mes "�Z�̖��O�̓E�t���Ƃ����܂��B";
		mes "����ł͖`���җl���Z�Ɩʉ��ƁA";
		mes "�G�N���[�W���K�[�h�ɓ`���Ă����܂��B";
		next;
		mes "[�E�n��]";
		mes "�����č��ɂ́A^FF0000���̂��߂ɓ�����^000000";
		mes "�łȂ���Γ���Ȃ������ł��B";
		mes "�܂��A��čs���ꂽ�č��́A";
		mes "�z�[���c���[�̒��ɂ���܂����A";
		mes "��̓I�ȏꏊ��";
		mes "���ɂ͂킩��܂���c�c�B";
		next;
		mes "[�E�n��]";
		mes "���������I�@�Z��";
		mes "^0000cd�m��Ȃ��l����b���������Ă��A";
		mes "�������Ă��܂�^000000���Ƃ������āc�c�B";
		mes "�������ق��������Ƃ��������Ă���";
		mes "�̂ł����A��������Ƃ��Ƃ��ƂĂ�";
		mes "�l���m�肷�鐫�i�Ȃ��̂Łc�c�B";
		next;
		mes "[�E�n��]";
		mes "�Ȃ̂ŁA�����Ƙb�𕷂��Ă����܂�";
		mes "���C���K�v�ɂȂ�Ǝv���܂��B";
		mes "�Z�ɉ���炱��^0000cd�莆^000000��";
		mes "�K���n���Ă��������B";
		next;
		emotion 27;
		mes "[�E�n��]";
		mes "����ł́A��낵�����肢���܂��I";
		mes "���Ƃ��T���o���Ă��������I";
		next;
		if(checkitemblank() == 0) {
			mes "[�E�n��]";
			mes "�ו��������ēn���܂���ˁB";
			mes "��ސ������炵�Ă��Ă��炦�܂����H";
			close;
		}
		mes "�]�z�[���c���[�̊č��ɘA���";
		mes "�@�s���ꂽ�E�t���ɉ�ɍs�����]";
		set ECL_4QUE,2;
		setquest 14118;
		getitem 6546,1;
		close;
	case 1:
		mes "[�E�n��]";
		mes strcharinfo(0)+ "�l�A";
		mes "�ǂ����܂������H";
		mes "��قǂ͖Z�����Ɓc�c�B";
		next;
		if(select("��`���ɗ���","���ɗp�͂Ȃ�") == 2) {
			mes "[�E�n��]";
			mes "�����ł����c�c�B";
			mes "���̗͂ł͂ǂ����邱�Ƃ�";
			mes "�ł��Ȃ��āc�c���ł́c�c�B";
			close;
		}
		emotion 18;
		mes "[�E�n��]";
		mes "�ł́A�Z�ɉ�ɍs����";
		mes "������ł����H";
		mes "���肪�Ƃ��������܂��I";
		next;
		mes "[�E�n��]";
		mes "�Z�̖��O�̓E�t���Ƃ����܂��B";
		mes "����ł͖`���җl���Z�Ɩʉ��ƁA";
		mes "�G�N���[�W���K�[�h�ɓ`���Ă����܂��B";
		next;
		mes "[�E�n��]";
		mes "�����č��ɂ́A^FF0000���̂��߂ɓ�����^000000";
		mes "�łȂ���Γ���Ȃ������ł��B";
		mes "�܂��A��čs���ꂽ�č��́A";
		mes "�z�[���c���[�̒��ɂ���܂����A";
		mes "��̓I�ȏꏊ��";
		mes "���ɂ͂킩��܂���c�c�B";
		next;
		mes "[�E�n��]";
		mes "���������I�@�Z��";
		mes "^0000cd�m��Ȃ��l����b���������Ă��A";
		mes "�������Ă��܂�^000000���Ƃ������āc�c�B";
		mes "�������ق��������Ƃ��������Ă���";
		mes "�̂ł����A��������Ƃ��Ƃ��ƂĂ�";
		mes "�l���m�肷�鐫�i�Ȃ��̂Łc�c�B";
		next;
		mes "[�E�n��]";
		mes "�Ȃ̂ŁA�����Ƙb�𕷂��Ă����܂�";
		mes "���C���K�v�ɂȂ�Ǝv���܂��B";
		mes "�Z�ɉ���炱��^0000cd�莆^000000��";
		mes "�K���n���Ă��������B";
		next;
		emotion 27;
		mes "[�E�n��]";
		mes "����ł́A��낵�����肢���܂��I";
		mes "���Ƃ��T���o���Ă��������I";
		next;
		if(checkitemblank() == 0) {
			mes "[�E�n��]";
			mes "�ו��������ēn���܂���ˁB";
			mes "��ސ������炵�Ă��Ă��炦�܂����H";
			close;
		}
		mes "�]�z�[���c���[�̊č��ɘA���";
		mes "�@�s���ꂽ�E�t���ɉ�ɍs�����]";
		set ECL_4QUE,2;
		setquest 14118;
		getitem 6546,1;
		close;
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[�E�n��]";
		mes "�Z�ɉ�܂������H";
		next;
		if(select("�莆��Y�ꂽ","�܂���Ă��Ȃ�") == 2) {
			mes "[�E�n��]";
			mes "�����ł����c�c�B";
			mes "�Z�����ǂ�ȏ󋵂��킩�炸�A";
			mes "�s���ł����ς��ł��B";
			next;
			mes "[�E�n��]";
			mes "���肢���闧��ł���Ȃ��Ƃ�";
			mes "�����Ă͂����Ȃ��̂ł��傤���A";
			mes "�}���ł��������Ȃ��ł��傤���H";
			next;
			mes "[�E�n��]";
			mes "�Z���{���ɐS�z�Ȃ�ł��c�c�B";
			close;
		}
		if(countitem(6546) < 1) {
			if(checkitemblank() == 0) {
				mes "[�E�n��]";
				mes "�ו��������ēn���܂���ˁB";
				mes "��ސ������炵�Ă��Ă��炦�܂����H";
				close;
			}
			mes "[�E�n��]";
			mes "����Ȃ炢����ł������܂���I";
			mes strcharinfo(0)+ "�l�̋�J��";
			mes "��ׂ��炱��Ȃ��Ƃ�";
			mes "�Ȃ�ł�����܂���I";
			getitem 6546,1;
			close;
		}
		mes "[�E�n��]";
		mes "���́c�c" +strcharinfo(0)+ "�l�A";
		mes "�����ɂ������Ȃ̂́A�����n����";
		mes "�莆�̂悤�Ɍ����܂����ǁc�c�H";
		close;
	case 7:
		mes "[�E�n��]";
		mes "���A" +strcharinfo(0)+ "�l�I";
		mes "�Z�ɉ���Ƃ͂ł��܂������H";
		mes "�b���͕����܂������H";
		next;
		menu "�E�t���̘b��`����",-;
		mes "[�E�n��]";
		mes "�c�c�B";
		next;
		mes "[�E�n��]";
		mes "�ǂ����Ă���Ȗ��d�Ȃ��Ƃ��c�c�B";
		next;
		menu "���Ȃ��͑̂̏������ɕs���͂���܂��񂩁H",-;
		mes "[�E�n��]";
		mes "�͂��A���͓��ɕs���͎����Ă��܂���B";
		next;
		mes "[�E�n��]";
		mes "�Z�́A�g�̏������s���Ȃ�";
		mes "���ł��ǂ��Ȃ���΂Ȃ�Ȃ��ƌ����āA";
		mes "�c�������玄�ɐF�X��";
		mes "�����Ă���܂����B";
		next;
		mes "[�E�n��]";
		mes "���̂������ŁA";
		mes "�w�҂Ƃ��Ă��т�H�ׂĂ�����A";
		mes "���̎�������̂ł��B";
		next;
		mes "[�E�n��]";
		mes "����Ɂc�c�B";
		mes "�̂�����������";
		mes "��l�ɂȂ��Ă����̐l������";
		mes "���킢�����Ă��ꂽ�肵�܂��B";
		next;
		emotion 18;
		mes "[�E�n��]";
		mes "���̂����Ŕ����������̂�";
		mes "�����ς����������܂����B";
		mes "�ււցB";
		next;
		mes "[�E�n��]";
		mes "�c�c�B";
		next;
		mes "[�E�n��]";
		mes "�����c�c�����ł��ˁc�c�B";
		mes "�������ɁA�Z�͐��܂����";
		mes "�̂̏������ɗ򓙊�������Ă��܂����B";
		mes "�傫���Ĕ������Ȃ��Ȃ�A";
		mes "�Ȃ�ł����Ƃ����c�c�B";
		next;
		mes "[�E�n��]";
		mes "�c�c�Z�̑̂�߂����@��";
		mes "�K�������o���Ȃ��ƁI";
		mes "�̂�߂��āA�č������";
		mes "�o���Ă����Ȃ��Ƃ����܂���B";
		next;
		mes "[�E�n��]";
		mes "�����ŁA�Ȃ�ł����c�c�B";
		mes "^0000cd���݂�������^000000������܂��B";
		next;
		mes "[�E�n��]";
		mes "�Z�̑̂����ɖ߂����߂ɁA";
		mes "�܂��A�č��ɘA��čs���ꂽ����";
		mes "�󋵂𐳊m�ɒm�肽����ł��B";
		next;
		mes "[�E�n��]";
		mes "�Z���������Ă������̂�";
		mes "�����c����Ă����";
		mes "�����̂ł����c�c�B";
		mes "�Z�̘b�𕷂��Ă��A��̓I�ɂ�";
		mes "�悭������Ȃ��ł����c�c�B";
		next;
		if(select("�����󂯂�","�f��") == 2) {
			mes "[�E�n��]";
			mes "��͂�A�Z�����ł���ˁB";
			mes "���݂܂���B";
			mes "�Z�ɉ���Ă��ꂽ���Ƃ����ł�";
			mes "�{���ɂ��肪�Ƃ��������܂��B";
			set ECL_4QUE,8;
			chgquest 14123,14124;
			close;
		}
		mes "[�E�n��]";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		mes "[�E�n��]";
		mes "����ł́A^0000cd���̓����̂��Ƃ�";
		mes "�悭�m���Ă������ȕ�����^000000��";
		mes "�b���𕷂��Ă��Ă��������I";
		next;
		mes "[�E�n��]";
		mes "�܂��̓}�V�I�l����ɕ�����";
		mes "����̂������Ǝv���܂��B";
		next;
		mes "[�E�n��]";
		mes "���肢���܂��B";
		mes "���͍��܂ŌZ���b���Ă������Ƃ�";
		mes "������x�l���Ă݂܂��B";
		viewpoint 1,200,272,0,0xFF0000;
		set ECL_4QUE,9;
		chgquest 14123,14125;
		close;
	case 8:
		mes "[�E�n��]";
		mes "�����A�Z����c�c�B";
		mes "���ꂩ��ǂ�����΂����񂾂낤�c�c�B";
		next;
		if(select("�͂ɂȂ�","�m��Ȃ��ӂ������") == 2) {
			mes "[�E�n��]";
			mes "�͂����`�B";
			mes "�N���͂ɂȂ��Ă���Ȃ����ȁ`�`�B";
			close;
		}
		mes "[�E�n��]";
		mes "�{���ł���!?";
		mes "���肪�Ƃ��������܂��I";
		next;
		mes "[�E�n��]";
		mes "����ł́A^0000cd���̓����̂��Ƃ�";
		mes "�悭�m���Ă������ȕ�����^000000��";
		mes "�b���𕷂��Ă��Ă��������I";
		next;
		mes "[�E�n��]";
		mes "�܂��̓}�V�I�l����ɕ�����";
		mes "����̂������Ǝv���܂��B";
		next;
		mes "[�E�n��]";
		mes "���肢���܂��B";
		mes "���͍��܂ŌZ���b���Ă������Ƃ�";
		mes "������x�l���Ă݂܂��B";
		viewpoint 1,200,272,0,0xFF0000;
		set ECL_4QUE,9;
		chgquest 14124,14125;
		close;
	case 9:
	case 10:
	case 11:
		mes "[�E�n��]";
		mes "^0000cd���̓����̂��Ƃ�";
		mes "�悭�m���Ă������ȕ�����^000000��";
		mes "�b���𕷂��Ă��Ă��������I";
		next;
		mes "[�E�n��]";
		mes "���肢���܂��B";
		mes "���͍��܂ŌZ���b���Ă������Ƃ�";
		mes "������x�l���Ă݂܂��B";
		close;
	case 12:
		viewpoint 2,1,1,0,0xFFFFFF;
		mes "[�E�n��]";
		mes "�ǂ��ł������H";
		mes "�����������������ł��܂������H";
		next;
		menu "�X�x������󂯎��������n��",-;
		mes "[�E�n��]";
		mes "��c�c�H";
		next;
		if(countitem(6547) < 1) {
			mes "[�E�n��]";
			mes "���́c�c���������ė�����";
			mes "������ł����c�c�H";
			next;
			mes "�]�X�x������󂯎���������Ȃ��B";
			mes "�@�Ȃ����Ă��܂����ꍇ�A";
			mes "�@������x�X�x���̂Ƃ���ɍs�����]";
			close;
		}
		mes "[�E�n��]";
		mes "����́c�c^0000cd������^000000�H";
		mes "�Z�͂�������āc�c�B";
		next;
		mes "[�E�n��]";
		mes "�������c�c����́c�c�B";
		mes "�ǂ���猤�����̈ꕔ�݂̂̂悤�ł��B";
		mes "���̕����͂���܂���ł������H";
		next;
		menu "����܂���ł���",-;
		mes "[�E�n��]";
		mes "�c�c�����ł����B";
		mes "�ł́A�������x���͂��Ă݂܂��B";
		mes "����^0000cd����^000000�����������B";
		next;
		mes "�]�E�n�������͂��n�߂��悤���B";
		mes "�@������x�b�������݂悤�]";
		delitem 6547,1;
		set ECL_4QUE,13;
		chgquest 14128,14131;
		close;
	case 13:
		mes "[�E�n��]";
		mes "�����A���҂������܂����B";
		next;
		mes "[�E�n��]";
		mes "�������ł����A��ʂ�ڂ�ʂ��A";
		mes "�����Ă��邱�Ƃ͗������܂����B";
		mes "�������A�茳�ɂ���̂���������";
		mes "�ꕔ�����ł��̂ŁA��͂茤����";
		mes "�S�e��c������܂łɂ͎��炸�c�c�B";
		next;
		mes "[�E�n��]";
		mes "�����ɗp����ޗ���������";
		mes "����̂ł����A�p�ӂ���̂�";
		mes "������̂������āc�c�B";
		mes "����ɁA�����̍ۂ̊����⏇���ɂ�";
		mes "�����ł��Ȃ�����������܂��c�c�B";
		next;
		mes "[�E�n��]";
		mes "���`��c�c�B";
		mes "���������A�㋉���t�B�l�̉H�̌��Ђ�";
		mes "�T�t�@���̔��̖т͂ǂ�����";
		mes "�g���Ă���񂾂낤�H";
		next;
		mes "[�E�n��]";
		mes strcharinfo(0)+ "�l�̘b�ł�";
		mes "�Z�̎p�́A�T�t�@���̂悤��";
		mes "����������A�̊i���傫���A";
		mes "�H�����ʂ̏㋉���t�B�l�̃��m���";
		mes "�傫���T�C�Y�������̂ł���ˁH";
		next;
		mes "[�E�n��]";
		mes "�����Ȃ�ƁA�����̓��e�́c�c�B";
		mes "^0000cd2�̎푰�̓�����Z��������@^000000";
		mes "�c�c�Ȃ̂��H";
		next;
		mes "[�E�n��]";
		mes "�������A�㋉���t�B�l�̉H�̌��Ђ�";
		mes "�T�t�@���̔��̖т́A�ǂ������";
		mes "�p�ӂ����̂��낤�H";
		next;
		mes "[�E�n��]";
		mes "�Z�����������������N���̉H��";
		mes "���̖т��g��ꂽ�͂������ǁc�c�B";
		mes "�Z���܂����c�c�B";
		next;
		menu "�����̍ޗ��͈˗��҂��p�ӂ��Ă���",-;
		mes "[�E�n��]";
		mes "�Z�����������Ă����̂ł����H";
		mes "�����ł����c�c�B";
		next;
		mes "[�E�n��]";
		mes "�������A����Ό���قǂ��̌�����";
		mes "�ƂĂ��c�c�g�̖т��悾���܂��B";
		mes "���̂悤�Ȃ��Ƃ��v����������";
		mes "���̂��c�c�B";
		next;
		mes "[�E�n��]";
		mes "�����ǌZ�̑̂�߂����߂ɂ́A";
		mes "�����܂��A�������������Ȃ����";
		mes "�Ȃ�܂���B";
		next;
		mes "[�E�n��]";
		mes "�����c�c���������ڍׂȓ��e��";
		mes "������Ă���Ηǂ������̂ɁB";
		next;
		menu "������x�E�t���ɕ����ė��悤���H",-;
		mes "[�E�n��]";
		mes "����́c�c���ʂ��Ǝv���܂��B";
		mes "�Z�����̌����������Ɏ��������A";
		mes "�����Ď��s�����B";
		mes "�����炠�Ȃ������������悤��";
		mes "�p�ɂȂ��Ă��܂����̂ł��傤�B";
		next;
		mes "[�E�n��]";
		mes "��������A���������e�𐳊m��";
		mes "�c������Ȃ�^0000cd���̕��@��������";
		mes "���t�B�l��T�����ق����ǂ�����^000000�ł��B";
		next;
		if(select("���t�B�l��T���Ă݂܂�","����͖�����") == 2) {
			mes "[�E�n��]";
			mes "����������Ƃ͂킩���Ă��܂��B";
			mes "�悭�킩���Ă��邩��";
			mes strcharinfo(0)+ "�l��";
			mes "����ł���̂ł��B";
			next;
			mes "[�E�n��]";
			mes strcharinfo(0)+ "�l��";
			mes "�o���������Ď��͂�������ł�����B";
			next;
			mes "[�E�n��]";
			mes "�ł��A��͂薳���ł���ˁH";
			mes "�����ł���ˁc�c�B";
			emotion 28;
			set ECL_4QUE,14;
			chgquest 14131,14132;
			close;
		}
		mes "[�E�n��]";
		mes "�����˗������������̂�����ł�!!";
		mes "�������`��͂�o���L�x�Ȗ`���җl��";
		mes "���ł������ʂ��ł���!!";
		next;
		mes "[�E�n��]";
		mes "�ł́A�\���󂠂�܂���";
		mes "���肢���܂��I";
		next;
		mes "[�E�n��]";
		mes "���̃��t�B�l��T���đ̂�߂����@��";
		mes "���������Č��Ă��������B";
		mes "�����ĉ��̈Ӑ}�ł��̂悤�ȃ��m��";
		mes "�Z�ɓn�����̂����B";
		next;
		mes "[�E�n��]";
		mes "���ۂɂ��̏㋉���t�B�l�������l��";
		mes "����悤�ł�����A^0000cd���̕�������^000000";
		mes "�����Č���̂��������ł��B";
		next;
		mes "�]�X�x������A�E�t���ƈꏏ�ɂ���";
		mes "�@���t�B�l�̘b�𕷂����]";
		viewpoint 1,170,195,0,0xFF0000;
		set ECL_4QUE,15;
		chgquest 14131,14133;
		close;
	case 14:
		mes "[�E�n��]";
		mes strcharinfo(0)+ "�l�A";
		mes "�͂�݂��Ă�����ł����H";
		next;
		if(select("���݂��ɏ�������Ȃ���","����������ʂ��������ł�") == 2) {
			mes "[�E�n��]";
			mes "�����ł����H";
			mes "���݂܂��񂪍��͏����Z�����ł��B";
			close;
		}
		mes "[�E�n��]";
		mes "�{���ɂ��肪�Ƃ��������܂�!!";
		mes "��͂�A�_�l�͌Z�̂��Ƃ�";
		mes "���̂ĂĂ��Ȃ������c�c�B";
		next;
		mes "[�E�n��]";
		mes "�ł́A�\���󂠂�܂���";
		mes "���肢���܂��I";
		next;
		mes "[�E�n��]";
		mes "�Z�Ɍ�������n�������t�B�l��";
		mes "�T���āA�̂�߂����@�𕷂��o����";
		mes "���������B";
		mes "�����ĉ��̈Ӑ}�ł��̂悤�ȃ��m��";
		mes "�Z�ɓn�����̂����B";
		next;
		mes "[�E�n��]";
		mes "���ۂɂ��̏㋉���t�B�l�������l��";
		mes "����悤�ł�����A^0000cd���̕�������^000000";
		mes "�����Č���̂��������ł��B";
		next;
		mes "�]�X�x������A�E�t���ƈꏏ�ɂ���";
		mes "�@���t�B�l�̘b�𕷂����]";
		set ECL_4QUE,15;
		chgquest 14132,14133;
		close;
	case 15:
	case 16:
	case 17:
	case 18:
	case 19:
	case 20:
	case 21:
		mes "[�E�n��]";
		mes "�Z�Ɍ�������n����";
		mes "�㋉���t�B�l��";
		mes "������܂������H";
		close;
	case 22:
		mes "[�E�n��]";
		mes "�Z�Ɍ�������n����";
		mes "�㋉���t�B�l��";
		mes "������܂������H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂪ�c�c���̃��t�B�l��";
		mes "^0000cd���łɎ���ł��܂����B^000000";
		next;
		mes "[�E�n��]";
		mes "�͂��H";
		mes "����ł���H";
		next;
		mes "�]�E�t���̘b�͂��Ȃ������ǂ��������]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ō�ɖڌ����ꂽ������";
		mes "�s���Ă݂��炷�łɎ���ł��܂����B";
		mes "�댯�Ȍ����ɋC�Â�����w����";
		mes "���m�𑗂����̂łȂ��ł��傤���H";
		next;
		mes "[�E�n��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�E�n��]";
		mes "�����ǂǂ����Ă����̌Z��";
		mes "���̌�����C�����̂ł��傤�H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����ȑ̂ɗ򓙊��������Ă���";
		mes "���������āA�E�t������̓��]��";
		mes "���p���悤�Ƃ����̂ł�";
		mes "�Ȃ��ł��傤���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������������Ă�����A";
		mes "���̉������t�B�l�ɑ΂���";
		mes "���p����Ă�����������܂���B";
		next;
		mes "[�E�n��]";
		mes "�����A�{���ɋ��낵���b�ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�E�t������̌��������s����";
		mes "�ǂ������̂�������܂���B";
		mes "�E�t������ɂ͈����ł����c�c�B";
		next;
		mes "[�E�n��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�E�n��]";
		mes "����ł��������@������͂��ł��B";
		mes "���ЂƂ�łł����Ƃ�����";
		mes "�Z�̑̂����̎p�ɖ߂��܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "������`���邱�Ƃ͂���܂����H";
		next;
		mes "[�E�n��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�������ꂪ�Ō�̗��݂��Ǝv���܂��B";
		next;
		mes "[�E�n��]";
		mes "���̌������ɏ����ꂽ^0000cd�ޗ�����^000000��";
		mes "���̗͂ł͎�ɓ���邱�Ƃ�";
		mes "������Ȃ̂�";
		mes strcharinfo(0)+ "�l��";
		mes "����؂肽���ł��B";
		next;
		mes "[�E�n��]";
		mes "�K�v�ȍޗ���^0000cd���t�B�l�̉H�̈ꕔ�A";
		mes "�������̖сA�J���{�[�f�B���A";
		mes "�������ꂽ�u���f�B�E���A";
		mes "�ł̃��[���A�^���Ԃȃ��[����";
		mes "�e1����^000000�ł��B";
		mes "�������W�߂ė��Ă��������B";
		next;
		mes "[�E�n��]";
		mes "���A�����M������̂�";
		mes strcharinfo(0)+ "�l�����ł��B";
		mes "���肢���܂��B";
		next;
		mes "�]^0000cd���t�B�l�̉H�̈ꕔ^000000�̓W���j��";
		mes "�@�����b���ēn���Ă��炨���B";
		mes "�@^0000cd�������̖�^000000�̓����f�B���J�̈�̂�";
		mes "�@�߂���T���Ă݂悤�]";
		set ECL_4QUE,23;
		chgquest 14140,14141;
		close;
	case 23:
		mes "[�E�n��]";
		mes "�ޗ��͂��ׂďW�܂�܂������H";
		next;
		if(select("���ׂďW�߂܂���","�ޗ���������x�����ĉ�����") == 2) {
			mes "[�E�n��]";
			mes "�K�v�ȍޗ���^0000cd���t�B�l�̉H�̈ꕔ�A";
			mes "�������̖сA�J���{�[�f�B���A";
			mes "�������ꂽ�u���f�B�E���A";
			mes "�ł̃��[���A�^���Ԃȃ��[����";
			mes "�e1����^000000�ł��B";
			next;
			mes "�]^0000cd���t�B�l�̉H�̈ꕔ^000000�̓W���j��";
			mes "�@�����b���ēn���Ă��炨���B";
			mes "�@^0000cd�������̖�^000000�̓����f�B���J�̈�̂�";
			mes "�@�߂���T���Ă݂悤�]";
			close;
		}
		if(countitem(6548) < 1 || countitem(6545) < 1 || countitem(972) < 1 ||
			countitem(6090) < 1 || countitem(7511) < 1 || countitem(7563) < 1) {
			mes "[�E�n��]";
			mes "���́c�c" +strcharinfo(0)+ "�l�H";
			mes "�A�C�e���͉����ɂ����ł����H";
			mes "���ꂶ�።��܂��B";
			close;
		}
		mes "[�E�n��]";
		mes "�p�ӂ���̂͑�ς������ł��傤�H";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		mes "[�E�n��]";
		mes "����łǂ��ɂ�������i�߂Ă݂܂��B";
		next;
		mes "[�E�n��]";
		mes "���܂ł��낢��Ɨ͂ɂȂ��Ă����";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�E�n��]";
		mes "����͎�����̋C�����ł��B";
		next;
		if(checkitemblank() == 0) {
			mes "[�E�n��]";
			mes "�ו��������ēn���܂���ˁB";
			mes "��ސ������炵�Ă��Ă��炦�܂����H";
			close;
		}
		mes "[�E�n��]";
		mes strcharinfo(0)+ "�l��";
		mes "���̐�A�K�^���K��񂱂Ƃ�";
		mes "����Ă��܂��B";
		delitem 6548,1;
		delitem 6545,1;
		delitem 972,1;
		delitem 6090,1;
		delitem 7511,1;
		delitem 7563,1;
		set ECL_4QUE,24;
		chgquest 14141,201595;
		getexp 5000000,0;
		getitem 6081,25;
		close;
	case 24:
		mes "[�E�n��]";
		mes "�����͂܂��i�s���ł��B";
		mes "�����ł���]������̂Ȃ�A";
		mes "���͎��ʋC�Ŋ撣��܂�";
		close;
	}
OnInit:
	waitingroom "�������̑㏞",0;
	end;
}

ecl_in02.gat,149,117,4	script	�E�t��	619,{
	switch(ECL_4QUE) {
	case 0:
	case 1:
		mes "[��̒j]";
		mes "�c�c�B";
		close;
	case 2:
		mes "[��̒j]";
		mes "�c�c�B";
		next;
		mes "�]�b�������Ă��A�܂������������Ȃ��B";
		mes "�@���C�����b��������K�v��";
		mes "�@���肻�����]";
		set ECL_4QUE,3;
		setquest 14119;
		close;
	case 3:
		mes "[��̒j]";
		mes "�c�c�B";
		next;
		mes "�]��̒j�́A������̘b�ɓ�����C��";
		mes "�@�Ȃ������Ɍ�����B";
		mes "�@�C����������������K�v��";
		mes "�@���肻�����]";
		set ECL_4QUE,4;
		chgquest 14119,14120;
		close;
	case 4:
		mes "[��̒j]";
		mes "�c�c�B";
		next;
		menu "�E�n������̎莆��������",-;
		if(countitem(6546) < 1) {
			mes "[��̒j]";
			mes "�����c�c����ƌ�����ł����H";
			next;
			mes "�]�E�n������󂯎�����莆��";
			mes "�@�ǂ��ɂ���������Ȃ��B";
			mes "�@�Ȃ����Ă��܂����ꍇ�A�E�n����";
			mes "�@������x�莆�������ĖႨ���]";
			close;
		}
		mes "[��̒j]";
		mes "����c�c�́c�c�H";
		next;
		mes "�]��̒j���A���߂Ă�����̘b��";
		mes "�@�������������B";
		mes "�@�莆�ɂ��Đ��������悤�]";
		set ECL_4QUE,5;
		chgquest 14120,14121;
		close;
	case 5:
		if(countitem(6546) < 1) {
			mes "[��̒j]";
			mes "�����c�c����ƌ�����ł����H";
			next;
			mes "�]�E�n������󂯎�����莆��";
			mes "�@�ǂ��ɂ���������Ȃ��B";
			mes "�@�Ȃ����Ă��܂����ꍇ�A�E�n����";
			mes "�@������x�莆�������ĖႨ���]";
			close;
		}
		mes "[��̒j]";
		mes "��c�c���c�c�H";
		next;
		menu "���Ȃ����E�t������ł��ˁH",-;
		mes "[�E�t��]";
		mes "�����c�c�ł����ǁc�c�H";
		next;
		menu "�E�n�����񂩂炠�Ȃ��ւ̎莆�ł�",-;
		mes "[�E�t��]";
		mes "�c�c�킩��H";
		mes "���肪�Ƃ��������܂��c�c�B";
		next;
		mes "�]�E�t���ɃE�n������̎莆��";
		mes "�@�n�����B";
		mes "�@������x�b�������Ă݂悤�]";
		delitem 6546,1;
		set ECL_4QUE,6;
		setquest 14122;
		delquest 14118;
		delquest 14121;
		close;
	case 6:
		mes "�]�E�t���͎莆��";
		mes "�@�ǂݏI�����悤���]";
		next;
		mes "[�E�t��]";
		mes "�c�c�莆��͂��Ă���āA";
		mes "���肪�Ƃ��������܂��B";
		mes "�E�n���͌��C�ɉ߂����Ă����ł����H";
		next;
		menu "���Ȃ��̐S�z�����Ă��܂���",-;
		mes "[�E�t��]";
		mes "�����ł����c�c�B";
		next;
		mes "[�E�t��]";
		mes "�����A���͂����������Ă��Ƃ�";
		mes "���Ă��܂����񂾁c�c�B";
		next;
		mes "�]�E�t���́A���������";
		mes "�@��Y���Ă���]";
		next;
		menu "�����������̂ł����H",-;
		mes "[�E�t��]";
		mes "�c�c���Ȃ��Ɏ莆���������";
		mes "�������Ƃ́A��͂��Ȃ���";
		mes "�M�p�����Ƃ������Ƃł��傤�ˁB";
		mes "�����͐l������ڂ����邩��c�c�B";
		mes "�킩��܂����B���b���܂��B";
		next;
		mes "[�E�t��]";
		mes "�E�n���������番����Ǝv���܂����A";
		mes "���͌��X�͂���Ȏp�ł�";
		mes "����܂���ł����B";
		mes "���ƒ�͉������t�B�l�̒��ł�";
		mes "^0000cd���ɑ̂������������̂ł��B^000000";
		next;
		mes "[�E�t��]";
		mes "���������d�����郉�t�B�l�̒��ł�";
		mes "�������͏�ɑa�O���������Ă��܂����B";
		next;
		mes "[�E�t��]";
		mes "�������A�g�̓I�ȓ����͂ǂ����悤��";
		mes "�Ȃ����Ɓc�c�B";
		mes "�������͗���Ă��镔����₤���߁A";
		mes "�K���ɕ׋������A�������Ől����";
		mes "�����Ȃ邱�Ƃ��ł��܂����B";
		next;
		mes "[�E�t��]";
		mes "�w��Ő������A�����m���n�߂�";
		mes "���̂Ƃ���ɁA�����";
		mes "^0000cd�����f�B���J^000000�Ƃ�����l��";
		mes "�㋉���t�B�l������K�˂ė��܂����B";
		next;
		mes "[�E�t��]";
		mes "�����f�B���J�́A���錤�����ɏ�������";
		mes "�������ŁA���̌��������閧����";
		mes "�s���Ă��錤�����A���Ɏ�`����";
		mes "�ق����ƌ����܂����B";
		next;
		mes "[�E�t��]";
		mes "���̌����Ƃ́A^0000cd���t�B�l�ꑰ��";
		mes "����ɋ����������Ȃ��悤��";
		mes "�g�̂����������錤��^000000";
		mes "�������̂ł��B";
		next;
		mes "[�E�t��]";
		mes "���͊��ň����󂯂܂����B";
		mes "���̊w�҂Ƃ��Ă̔\�͂�F�߂Ă��ꂽ";
		mes "���Ƃ����ꂵ�������B";
		mes "����ɑ̂��傫���Ȃ��Ȃ�c�c�B";
		next;
		mes "[�E�t��]";
		mes "�����f�B���J����A";
		mes "�������e�͒N�ɂ��b���Ȃ��悤�ɂ�";
		mes "�����Ă܂����̂ŁA���������Ƃ�";
		mes "�M�����Ă����̃E�n���ɂ��A";
		mes "�ڂ����b�͂��܂���ł����B";
		next;
		mes "[�E�t��]";
		mes "���͉ƂɈ���������A";
		mes "�����ɖv�����܂����B";
		mes "�����ɕK�v�Ȃ��̂�";
		mes "�����f�B���J���p�ӂ��Ă���܂����B";
		next;
		mes "[�E�t��]";
		mes "�����Ă��̌����̖��ɁA";
		mes "�����܂ł��ƈ���Ƃ����Ƃ���܂�";
		mes "�H�蒅���܂����B";
		next;
		mes "[�E�t��]";
		mes "�������A���̍Ō�̈�����A";
		mes "���ł����B";
		mes "�Ō�̈���c�c����͂܂�A";
		mes "���ۂɃ��t�B�l�̑̂��g�����A";
		mes "�l�̎����ł��B";
		next;
		mes "[�E�t��]";
		mes "�ǂ̂悤�Ȍ��ʂ��\��邩�킩��Ȃ�";
		mes "�����ɁA���֌W�̐l����������";
		mes "�킯�ɂ͂����Ȃ��c�c�B";
		mes "����Ŏ��͎����g�������Ώۂ�";
		mes "���錈�S�����܂����B";
		next;
		mes "[�E�t��]";
		mes "���ʂ͌��Ă̒ʂ�c�c�B";
		next;
		mes "[�E�t��]";
		mes "�����f�B���J�͎��������s�����";
		mes "�ǂ����ւƓ����Ă��܂��܂����B";
		mes "����Ŏ��͈�l�ŉ��Ƃ����悤��";
		mes "�����̂ł����c�c�B";
		mes "����ȂƂ���ɘA��ė�����";
		mes "���܂��āc�c�B";
		next;
		mes "[�E�t��]";
		mes "�c�c���̂悤�Ȏp�ɂȂ��āA";
		mes "�ȑO�̏����������̂�";
		mes "�ƂĂ����������v���܂��B";
		mes "���̏������������̑̂�";
		mes "�߂肽���c�c�B";
		next;
		mes "[�E�t��]";
		mes "���̎��͉������c�c�B";
		next;
		mes "[�E�t��]";
		mes "����ȃ��m��]�񂾂킯�ł�";
		mes "�Ȃ������̂Ɂc�c�B";
		mes "�~����߂����̂ł��傤�ˁB";
		next;
		mes "[�E�t��]";
		mes "���݂܂���A�b���������܂����ˁB";
		mes "�܂��A���͂�������o�鎖��";
		mes "������ł��B";
		next;
		mes "[�E�t��]";
		mes "�����A���Ȃ�����������o�鎖��";
		mes "�o����Ȃ�A�E�n���Ɍ��̎p��";
		mes "�߂���@��K�������Ă����";
		mes "�`���Ă��������B";
		mes "���肢���܂��B";
		next;
		mes "�]�E�n���̂Ƃ���ɖ߂�A";
		mes "�@�E�t���̏󋵂�`���悤�]";
		set ECL_4QUE,7;
		chgquest 14122,14123;
		close;
	case 7:
	case 8:
		mes "[�E�t��]";
		mes "�{���ɂ��肢���܂��B";
		next;
		mes "�]�E�n���̂Ƃ���ɖ߂�A";
		mes "�@�E�t���̏󋵂�`���悤�]";
		close;
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
	case 18:
	case 19:
	case 20:
		mes "[�E�t��]";
		mes "�E�n���ɉ�܂������H";
		mes "�ǂ������ł��B";
		mes "����ŘS���̐����ł�";
		mes "�������S�ł��܂����B";
		next;
		mes "[�E�t��]";
		mes "�����͊č����ƂĂ��g����";
		mes "�������܂��B";
		close;
	case 21:
		mes "[�E�t��]";
		mes "�ǂ����܂����H";
		mes "�����ǂ��m�点�ł�����܂����H";
		next;
		menu "�����Ń��t�B�l�̎��̂����܂���",-;
		mes "[�E�t��]";
		mes "�c�c���t�B�l�̎��̂ł����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "^0000cd�㋉���t�B�l�̎��̂ł��B^000000";
		mes "���Ȃ��Ɍ������˗����Ă���";
		mes "�����f�B���J�̂悤�ł����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂩ��A���Ȃ����߂܂�O�ɁA";
		mes "�����ő傫�ȑ̂��������t�B�l��";
		mes "�㋉���t�B�l��ǂ��p��";
		mes "�����҂����܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����Ĕނ͎E�Q����܂����B";
		next;
		mes "[�E�t��]";
		mes "��������������ł����H";
		mes "�E�Q�����̂������ƌ���������ł����H";
		next;
		menu "�{���}�����Ȃ������̂ł����H",-;
		mes "[�E�t��]";
		mes "�c�c�c�c�B";
		mes "�����E�����Ɩ���������c�c�B";
		mes "�����ς��̂ł����B";
		next;
		mes "[�E�t��]";
		mes "����Ȃ��Ƃ����Ă�";
		mes "���̑̂͂��̂܂܂ł��c�c�B";
		next;
		mes "[�E�t��]";
		mes "�����͎����x�����̂ł�!!!";
		next;
		mes "[�E�t��]";
		mes "���ɂ͂��ׂẴ��t�B�l����";
		mes "����ɔ����������Ȃ�̂�";
		mes "�����̖ړI���ƌ����āA";
		mes "���������Ώۂɂ܂ł����Ă����āI";
		next;
		mes "[�E�t��]";
		mes "�����̊댯����ޗ��̌��؂Ȃǂ�";
		mes "���Ă��܂���ł����B";
		mes "�����Ď����Ɏ��s�����r�[�A";
		mes "�����͓����o�����̂ł�!!!";
		next;
		mes "[�E�t��]";
		mes "�c�c�����f�B���J�͎��ʑO��";
		mes "�{���̌����̖ړI��b���܂����B";
		next;
		mes "[�E�t��]";
		mes "������F�߂Ă���Ȃ�������w����";
		mes "^0000cd�����̔\�͂��ؖ����邱�Ƃ�";
		mes "�{���̖ړI^000000�������ƁI";
		mes "���������ꂾ���̂��߂Ɂc�c�B";
		mes "���������ꂾ���́c�c�B";
		next;
		mes "[�E�t��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�E�t��]";
		mes "��w���������̎������e��m��A";
		mes "���������āA�ꏏ�Ɏ����ɎQ������";
		mes "����߂܂��܂����B";
		next;
		mes "[�E�t��]";
		mes "�����Ƃ����߂͉��ł����H";
		next;
		mes "[�E�t��]";
		mes "���͂����A�����̗~�]�ɗ��p���ꂽ";
		mes "����ɂ����܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����f�B���J�����������n�߂����R��";
		mes "���Ȃ��������̒�Ăɗ����ꂽ���R��";
		mes "�����悤�ȋC�����܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������Q�҂��Ƃ��Ă����Ȃ���";
		mes "�Ƃ����߂𐳓��������邱�Ƃ�";
		mes "�ł��܂���c�c�B";
		mes "�����A�������ɕ����߂�ꂽ���Ȃ���";
		mes "�p������ƁA���łɍ߂̑Ή���";
		mes "�x�����Ă���悤�ɂ݂��܂��B";
		next;
		mes "[�E�t��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�E�t��]";
		mes "�E�n���ɂ́c�c�b���Ȃ��ł��������B";
		mes "���肢���܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���͂����ɂ͗��Ȃ��������Ƃɂ��܂��B";
		next;
		mes "[�E�t��]";
		mes "���肪�Ƃ��������܂��c�c�B";
		mes "�Ō�܂Ő��b�ɂȂ�܂��ˁc�c�B";
		next;
		mes "�]�E�n���Ƙb�����悤�]";
		set ECL_4QUE,22;
		chgquest 14139,14140;
		close;
	case 22:
		mes "[�E�t��]";
		mes "�c�c�c�c�B";
		close;
	}
}

eclage.gat,200,272,4	script	�}�V�I�l	437,{
	if(ECL_4QUE == 9) {
		viewpoint 2,1,1,0,0xFFFFFF;
		emotion 23;
		mes "[�}�V�I�l]";
		mes "����I�@�т����肵���I";
		mes "�ȂȂȁA�Ȃ�ł����H";
		mes "�����Ȃ茻��āI";
		mes "���ɉ������悤�ƁI";
		next;
		menu "�E�t���ɂ��ĕ�������",-;
		mes "[�}�V�I�l]";
		mes "�����A�E�n���Ɍ����Ă����̂ˁH";
		mes "�E�t���ɂ��āA�˂��c�c�B";
		mes "���`��A�����������N�����炵��";
		mes "���Ă��Ƃ����m��Ȃ��āc�c�B";
		next;
		mes "[�}�V�I�l]";
		mes "�����͋���̂����Ȃ��̂�";
		mes "������Ȃ����炢�ɂ��ƂȂ����l��";
		mes "�ǂ����Ċč��ɘA��čs���ꂽ�̂��B";
		next;
		mes "[�}�V�I�l]";
		mes "���A���������΃E�t����";
		mes "�A��čs���ꂽ����";
		mes "^0000cd�ƂĂ��傫�Ȕߖ�^000000�𕷂�����B";
		mes "�������������āA�|���āc�c�B";
		next;
		mes "[�}�V�I�l]";
		mes "���̂�����ƌゾ������ˁB";
		mes "��������̐l���ˑR�W�܂��Ă��āA";
		mes "�E�t����߂܂��čs�����́B";
		next;
		mes "[�}�V�I�l]";
		mes "�A��čs����鎞�ɁA�����Ԃ��";
		mes "�Ƃ̊O�ɏo���E�t����������B";
		mes "���̎��́A�E�t���̎p���c�c�B";
		mes "�p���c�c�B";
		next;
		mes "[�}�V�I�l]";
		mes "�c�c���̎�^0000cd�S�e�B^000000���ꏏ��";
		mes "���Ă����́B";
		mes "�����^���Ɍ��Ă������瑼�ɉ�����";
		mes "�o���Ă��邩������Ȃ���B";
		mes "��x�b���𕷂��Ă݂�Ƃ������B";
		viewpoint 1,163,228,0,0xFF0000;
		set ECL_4QUE,10;
		chgquest 14125,14126;
		close;
	}
	emotion 23;
	mes "[�}�V�I�l]";
	mes "����I�@�т����肵���I";
	mes "�ȂȂȁA�Ȃ�ł���!?";
	mes "�����Ȃ茻��Ȃ��ł���܂��񂩁H";
	next;
	mes "[�}�V�I�l]";
	mes "���͋����₷���̎��Ȃ�ł���I";
	close;
}

eclage.gat,163,228,4	script	�S�e�B	438,{
	if(ECL_4QUE == 10) {
		viewpoint 2,1,1,0,0xFFFFFF;
		mes "[�S�e�B]";
		mes "�ǂ����܂����H";
		next;
		menu "�}�V�I�l����̏Љ�Łc�c",-;
		mes "[�S�e�B]";
		mes "�}�V�I�l�Ɍ����ė�����ł����H";
		mes "���̗p�ł��H";
		next;
		menu "�E�t���ɂ��ĕ���",-;
		mes "[�S�e�B]";
		mes "�E�t���̂��Ƃł����H";
		mes "��������قǒm���Ă���킯�ł�";
		mes "����܂��񂪁c�c�B";
		next;
		mes "[�S�e�B]";
		mes "�����ł��ˁc�c�B";
		mes "�č��ɘA��čs���ꂽ�����";
		mes "�����Ԃ�O�ɂȂ�܂����A";
		mes "�E�t����^0000cd���m��ʐl�ƈꏏ��^000000";
		mes "����̂����܂����B";
		next;
		mes "[�S�e�B]";
		mes "�E�t���̂��Ƃ͐̂���m���Ă��܂����A";
		mes "���̂悤�ɖ��邢��ŏ΂��̂�";
		mes "���߂Č��܂����ˁB";
		next;
		mes "[�S�e�B]";
		mes "�����������ł��������̂��ƕ�������A";
		mes "�����Ă���^0000cd��^000000��U��Ȃ���";
		mes "�u����Ŏ���������ςȎp�ɂȂ��v";
		mes "�Ɓc�c�B";
		next;
		mes "[�S�e�B]";
		mes "�ꏏ�ɂ����l�́A�������Ⴞ�߂�";
		mes "�������Ȋ����̃W�F�X�`���[��";
		mes "���Ă��܂����B";
		next;
		mes "[�S�e�B]";
		mes "���͏����s�����������ǁA";
		mes "�E�t�������ł���p�����āA";
		mes "���������Ȃ�������ł��B";
		next;
		menu "�E�t���̎����Ă������ɂ��ĕ���",-;
		mes "[�S�e�B]";
		mes "���ł����H";
		mes "�����ł��ˁc�c�B";
		mes "���[��A���͉����ɂ�������";
		mes "�悭�����܂���ł����c�c�B";
		next;
		mes "[�S�e�B]";
		mes "�������A������^0000cd�U�߂̃X�x��^000000��";
		mes "�����Ă݂Ă��������B";
		mes "�E�t���ƒ��ǂ����Ă����̂�";
		mes "�����m���Ă��邩������܂���B";
		viewpoint 1,170,195,0,0xFF0000;
		set ECL_4QUE,11;
		chgquest 14126,14127;
		close;
	}
	if(ECL_4QUE == 16) {
		mes "[�S�e�B]";
		mes "�㋉���t�B�l�c�c�H";
		mes "���`�A�o���Ă��܂���B";
		next;
		mes "[�S�e�B]";
		mes "���̑O���Ȃ��ɂ��b�������A";
		mes "�E�t���ƈꏏ�ɂ����l�A";
		mes "���̐l���㋉���t�B�l�ł����B";
		mes "���̐l�̂��Ƃ������Ă����ł����H";
		next;
		mes "[�S�e�B]";
		mes "���̃��t�B�l�Ȃ�E�t����";
		mes "�����ꏏ�ɂ�����A";
		mes "�ǂ����ւƍs���Ă��܂��܂����B";
		next;
		mes "[�S�e�B]";
		mes "���ǁA���̃��t�B�l�A";
		mes "^0000cd�H���傫�������������̂�";
		mes "�㋉�Ƃ�����ۂ͂�������ł����A";
		mes "�ڂ��s���āA�ǂ���������^000000";
		mes "���������܂����B";
		next;
		menu "���ɉ����o���Ă��܂��񂩁H",-;
		mes "[�S�e�B]";
		mes "���`�A����������^0000cd�|���y����";
		mes "�Ԃ̍炢����n�ŏ㋉���t�B�l��";
		mes "�������瓦���Ă���̂�";
		mes "�ڌ�����^000000�Ƙb���Ă܂����B";
		next;
		mes "[�S�e�B]";
		mes "���̃��t�B�l��^0000cd�H���傫����";
		mes "�����������炵��^000000�ł��B";
		next;
		mes "[�S�e�B]";
		mes "�ڂ����m�肽���Ȃ�A";
		mes "�|���y�����K�˂Ă݂Ă��������B";
		viewpoint 1,126,151,0,0xFF0000;
		set ECL_4QUE,17;
		chgquest 14134,14135;
		close;
	}
	mes "[�S�e�B]";
	mes "���������ăz�[���c���[��";
	mes "�s���Ă݂܂����H";
	mes "�������̃��C�Ƃ͔�r�ł��Ȃ����炢";
	mes "�������炵�����ǁc�c�B";
	next;
	mes "[�S�e�B]";
	mes "��͂莄�����̂悤�ȉ�����";
	mes "���t�B�l�́A�������邵��";
	mes "�ł��Ȃ���ł��傤�˂��B";
	close;
}

eclage.gat,170,195,4	script	�X�x��	443,{
	if(ECL_4QUE == 11) {
		viewpoint 2,1,1,0,0xFFFFFF;
		mes "[�X�x��]";
		mes "���ɉ����p�ł�����̂��H";
		next;
		menu "�E�t���������Ă������ɂ���",-;
		mes "[�X�x��]";
		mes "�����`�A";
		mes "�������[����A�E�t�������̂悤�ȕ���";
		mes "�����Ă����ƕ��������ǁc�c�B";
		mes "�������ꂪ���Ȃ̂��ǂ��m��Ȃ���H";
		next;
		mes "[�X�x��]";
		mes "����ɁA�N�͂��������N�Ȃ񂾁H";
		next;
		menu "�E�n���ɗ��܂ꂽ���Ƃ�b��",-;
		mes "[�X�x��]";
		mes "�ق��A�E�n���ɁH";
		mes "�E�n���c�c�B";
		mes "�����I�@���܂����A�Y��Ă��I";
		next;
		mes "[�X�x��]";
		mes "�E�t����������^0000cd�莆^000000��";
		mes "�E�`�̑��Ɏh�����Ă����񂾁I";
		mes "�č��ɘA��Ă�����钼�O��";
		mes "���������̂��낤�B";
		next;
		mes "[�X�x��]";
		mes "�莆�ɂ́A�������ꂽ^0000cd����^000000��";
		mes "��ɕK���n���Ă����";
		mes "������Ă����񂾁B";
		next;
		mes "[�X�x��]";
		mes "������!!!";
		next;
		mes "[�X�x��]";
		mes "���́A�Ȃ񂾁c�c�B";
		mes "�Z�����āA�E�n���ɓn��";
		mes "�^�C�~���O���A�ȁI";
		mes "�͂͂́c�c�B";
		next;
		mes "[�X�x��]";
		mes "���́A�������ꂽ����������������";
		mes "�E�`�̏��[���b���Ă������Ȃ̂��ȁH";
		mes "����́c�c�ǂ��ɂ���������c�c�B";
		next;
		mes "[�X�x��]";
		mes "�����A�������������I";
		mes "������E�n���ɓn���Ă���Ă���B";
		next;
		mes "[�X�x��]";
		mes "�������Ȃ������";
		mes "��낵�����ނ�B";
		next;
		mes "[�X�x��]";
		mes "�^�ʖڂȎq������";
		mes "�ǂ����Ă���Ȃ��Ƃ�";
		mes "�Ȃ����܂����̂��ˁc�c�B";
		next;
		if(checkitemblank() == 0) {
			mes "[�X�x��]";
			mes "�ו��������ēn���Ȃ��ȁB";
			mes "��ސ������炵�Ă��Ă���邩���H";
			close;
		}
		mes "�]�X�x�����牘�ꂽ��������";
		mes "�@�a�������B�E�n���ɓn�����]";
		viewpoint 1,282,255,0,0xFF0000;
		getitem 6547,1;
		set ECL_4QUE,12;
		chgquest 14127,14128;
		close;
	}
	if(ECL_4QUE == 12 && countitem(6547) < 1) {
		mes "[�X�x��]";
		mes "���͂ǂ����ČN��������";
		mes "�������𕪂����Ă���!!";
		next;
		mes "[�X�x��]";
		mes "����𗎂Ƃ��čs�����ȁH";
		next;
		if(checkitemblank() == 0) {
			mes "[�X�x��]";
			mes "�����ƁA�ו��������ēn���Ȃ��ȁB";
			mes "��ސ������炵�Ă��Ă���邩���H";
			close;
		}
		mes "[�X�x��]";
		mes "�Ⴂ�񂾂���A";
		mes "���������������肵�Ȃ����B";
		getitem 6547,1;
		close;
	}
	if(ECL_4QUE == 15) {
		viewpoint 2,1,1,0,0xFFFFFF;
		mes "[�X�x��]";
		mes "��H�@�Ȃ񂾁H";
		mes "���ɂ����ɗp������̂��H";
		next;
		menu "�E�t���ƈꏏ�ɂ����㋉���t�B�l�͒N�ł����H",-;
		mes "[�X�x��]";
		mes "�㋉���t�B�l�H";
		mes "���`��A���ꂪ�Ȃ��c�c�B";
		mes "���ɂ��N�Ȃ̂��悭������Ȃ��񂾂�B";
		next;
		mes "[�X�x��]";
		mes "�������߂Č��郉�t�B�l�������B";
		mes "�����āA���̎��ȍ~�A";
		mes "��x�����̎p�����Ă��Ȃ��񂾁B";
		next;
		mes "[�X�x��]";
		mes "�������Ȃ��B";
		mes "���̏��[�̏��ɍs���Č��ȁH";
		mes "�ꏏ�Ɍ��Ă�����B";
		next;
		mes "[�X�x��]";
		mes "���̏��[�͋L���͂���������";
		mes "�����̗͂ɂȂ邩���ȁB";
		next;
		mes "�]�X�x���̉�����A�S�e�B��";
		mes "�@�㋉���t�B�l�ɂ��ĕ����Ă݂悤�]";
		viewpoint 1,163,228,0,0xFF0000;
		set ECL_4QUE,16;
		chgquest 14133,14134;
		close;
	}
	mes "[�X�x��]";
	mes "���̏��[�̖��̓z�[���c���[��";
	mes "�s�����ƂȂ񂾁B";
	next;
	mes "[�X�x��]";
	mes "�����Ȃ�Ƃ����Ă�肽�����ǁA";
	mes "�����ᖳ��������ȁB";
	mes "�������̐g���ł́c�c�B";
	close;
}

eclage.gat,126,151,4	script	�|���y	444,{
	if(ECL_4QUE == 17) {
		viewpoint 2,1,1,0,0xFFFFFF;
		mes "[�|���y]";
		mes "�������I �т����肵���I";
		mes "��H ���񂽒N�H";
		next;
		menu "�S�e�B�ɏЉ�ꂽ���Ƃ�`����",-;
		mes "[�|���y]";
		mes "�ށc�c�B";
		mes "�����Ō����A";
		mes "�㋉���t�B�l�̂��Ƃ��c�c�B";
		next;
		mes "[�|���y]";
		mes "���͂��̖�A�����ŁA���́c�c";
		mes "���您���Ă��܂��ĂȁB";
		mes "�p�𑫂���ꏊ��T���Ă����񂾁B";
		next;
		mes "[�|���y]";
		mes "�ŁA�܂��A���낤�낵�Ă�����A";
		mes "�����Ȃ荕���e��2�̌��ꂽ�񂾁B";
		next;
		mes "[�|���y]";
		mes "�ŏ��Ɍ��ꂽ�̂�^0000cd�㋉���t�B�l^000000�������B";
		mes "���������ł������̕���";
		mes "�����čs�����񂾁B";
		mes "^0000cd�H���傫�����Y�킾����^000000�Ȃ��B";
		mes "����c�c�B";
		next;
		mes "[�|���y]";
		mes "�ŁI�@���̌�A������!!";
		mes "�����������!!!";
		next;
		mes "[�|���y]";
		mes "�ŏ��͑傫�ȉ�Ɍ��������c�c�B";
		mes "���������t�B�l�������B";
		mes "^0000cd�̂��ƂĂ��傫�ȃ��t�B�l^000000��";
		mes "�㋉���t�B�l��ǂ��Ă����񂾁B";
		next;
		mes "[�|���y]";
		mes "�������Ă�������ȁB";
		mes "�^���ÂŒN�������̂���";
		mes "�킩��Ȃ������B";
		next;
		mes "[�|���y]";
		mes "���������A���ɂ͋C�Â��Ȃ�����";
		mes "�悤���ȁB";
		mes "������Ɨp�����̂��߂ɁA";
		mes "�΂݂̒��ɂ�������ȁB";
		next;
		mes "[�|���y]";
		mes "���̌�A���͉ƂɋA�����񂾂��ǁA";
		mes "�܂��ɉƂɓ��낤�Ƃ������̎��A";
		mes "������h���Ԃ�قǂ̑傫�Ȕߖ�";
		mes "���������񂾁B";
		mes "�{���ɋ��낵���ߖ������B";
		next;
		mes "[�|���y]";
		mes "���ꂩ�炵�΂炭�́A�|���đ�����";
		mes "�߂Â����Ƃ��ł����ɂ�����B";
		next;
		mes "[�|���y]";
		mes "�����O�ɁA����Ƒ�����";
		mes "�s�����Ƃ��o�����񂾂��A";
		mes "�������̕��ɑ傫��^0000cd����^000000��";
		mes "�������񂾁I";
		mes "���ӂɂ�^0000cd�������؂̎}^000000��";
		mes "��R�����Ă����I";
		next;
		mes "[�|���y]";
		mes "�܁A�܂��A�|���ċ߂��܂ł�";
		mes "�s���ĂȂ����ǂȁc�c�B";
		next;
		menu "���́H",-;
		mes "[�|���y]";
		mes "�����I�@���̂��I";
		mes "�ǂ����Ă��͂킩��񂪁A";
		mes "^0000cd�傫�ȉH���j����Ă����B";
		mes "�����ǂ��Ă���̂������A";
		mes "�㋉���t�B�l�̎���^000000���Ǝv����B";
		next;
		mes "[�|���y]";
		mes "�͂��c�c�B";
		mes "�ǂ����Ă���Ȃ��Ƃ��c�c�B";
		next;
		mes "[�|���y]";
		mes "�㋉���t�B�l�Ȃ疂�͂������͂������A";
		mes "���̂悤�ɊȒP�ɎE���ꂽ�̂������";
		mes "�傫�����t�B�l�͂���ȏ�̗͂�";
		mes "�����Ă���񂾂낤�ȁc�c�B";
		next;
		mes "[�|���y]";
		mes "�����c�c�B";
		mes "�������������Ă��āA";
		mes "���̑傫�ȑ̂��������t�B�l��";
		mes "�P��ꂽ��ǂ����悤!?";
		next;
		mes "[�|���y]";
		mes "�Ƃ̎q�������͂܂��������̂�";
		mes "���e�̉����������ꂽ�獢�邾��!?";
		next;
		mes "[�|���y]";
		mes "����ŁA�����ɍs���̂��|���񂾂�B";
		mes "���񂽂��C�����������������I";
		next;
		mes "[�|���y]";
		mes "���������΍ŋ߁A�l��T����";
		mes "�����֍s�������t�B�l��";
		mes "�����񂾂�B";
		mes "�������W���j�Ƃ������O���������ȁB";
		next;
		mes "[�|���y]";
		mes "���񂽂��T���Ă郉�t�B�l��";
		mes "�����֌W������̂�������Ȃ����A";
		mes "���������Ŕޏ�������������A";
		mes "��Ȃ��ƒ��ӂ��Ă���Ă���Ȃ����H";
		next;
		mes "�]�W���j�Ƃ������t�B�l��";
		mes "�@�Ԃ��炫�n�߂���n�ɍs�����悤���B";
		mes "�@����Ęb�𕷂��Ă݂悤�]";
		set ECL_4QUE,18;
		chgquest 14135,14136;
		close;
	}
	mes "[�|���y]";
	mes "�����c�c�B";
	mes "�����ɍs���͕̂|���Ȃ��c�c�B";
	close;
}

ecl_fild01.gat,70,285,4	script	�W���j	611,{
	switch(ECL_4QUE) {
	case 18:
		mes "[�W���j]";
		mes "���́I�@���݂܂���I";
		mes "���Z�����Ƃ��낷�݂܂���I";
		mes "�������b���ł��܂����H";
		next;
		mes "[�W���j]";
		mes "��قǂ��猩�Ă���Ɖ�����";
		mes "�T���Ă���悤�ł��ˁI";
		mes "�Ⴂ�܂����H";
		mes "�����ł��傤�H";
		next;
		mes "[�W���j]";
		mes "�����ŁI";
		mes "�ЂƂ�^0000cd���^000000������܂��I";
		next;
		menu "���������Ȃ�",-;
		mes "[�W���j]";
		mes "�����b�ł͂���܂���I";
		mes "���͎������̋߂���";
		mes "^0000cd�T���Ă���l^000000�����܂��B";
		next;
		mes "[�W���j]";
		mes "�T���Ă���̂́A���̕��ł��B";
		mes "�����O����ƂɋA��Ȃ��Ăł��ˁB";
		mes "����ŕ��̎d�����";
		mes "�s���Ă݂��̂ł����A";
		mes "�u�����ŋ߂͗��Ă��Ȃ��v";
		mes "�ȁ`��Č����܂��āB";
		next;
		mes "[�W���j]";
		mes "�������킸�ɂ��Ȃ��Ȃ�l�ł�";
		mes "�Ȃ��̂ŁA�Ȃ񂩂������̂��ȁ[��";
		mes "�v���āA������������������";
		mes "�܂������ł��B";
		next;
		mes "[�W���j]";
		mes "����������A���̕ӂŕ���";
		mes "�ڌ������Ƃ����b�����ɂ��āB";
		mes "����ŁA�����O���炱�̎��ӂ�";
		mes "�T���Ă����ł����A";
		mes "����������Ȃ��āc�c�B";
		next;
		menu "�{�����˗��������������̂ł́H",-;
		mes "[�W���j]";
		mes "����́A���łɂ��܂����I";
		mes "�����ǁA���̐��ʂ��Ȃ��A�ł��āB";
		next;
		mes "[�W���j]";
		mes "�����Ȃ�Ƃ����A";
		mes "���̐g�ɉ����������̂ł́I";
		mes "�ƁA�S�z�ŐS�z�ŁB";
		mes "���Ă������Ă�����ꂸ�A";
		mes "�������ڒT���ɂ����܂�";
		mes "�����킯�ł��B";
		next;
		mes "[�W���j]";
		mes "�ǂ��ł��傤!?";
		mes "���͕���T�����ł�";
		mes "���Ȃ����T�����̂��T���I";
		mes "�����悤�ɁA���Ȃ��͎���";
		mes "�T�����̂����łɒT���I";
		next;
		mes "[�W���j]";
		mes "�ˁH �����Ăł���H";
		mes "��l�ŒT������l�ŒT��������";
		mes "�����I�Ɍ��܂��Ă܂��I";
		next;
		menu "�ǂ�Ȋ����̂�������ł����H",-;
		mes "[�W���j]";
		mes "�����ł��˂��B";
		mes "���͎��Ǝ��Ă���A���ȁH";
		mes "^0000cd�H���傫���đS�̓I��";
		mes "�Ԃ��F�����Ă��܂��B^000000";
		next;
		mes "[�W���j]";
		mes "���O��^0000cd�����f�B���J^000000�ƌ����܂��B";
		next;
		menu "�����f�B���J�H",-;
		mes "[�W���j]";
		mes "�H";
		mes "�ǂ������܂������H";
		mes "�Ђ���Ƃ��āA������������!?";
		next;
		menu "�����T���Ă���l�Ɠ����ł�",-;
		mes "[�W���j]";
		mes "�Ȃ�Ɓ`!!";
		mes "���A���H�@�{���ɁH";
		mes "����`�A����ȋ��R���Ă���񂾂��I";
		next;
		mes "[�W���j]";
		mes "�܂��A";
		mes "��������̑��������ǂ��";
		mes "�����ɍs��������A";
		mes "���肦�Ȃ��b����Ȃ����I";
		next;
		mes "[�W���j]";
		mes "�ł��A";
		mes "���Ȃ��͂ǂ����Ă��������";
		mes "�T���Ă���́H";
		next;
		mes "[�W���j]";
		mes "������I ���̘b�͌�łɂ��悤�I";
		mes "���Ȃ������������";
		mes "�T���Ă���̂Ȃ�A";
		mes "�b����������ˁI";
		mes "�ꏏ�ɂ��������T���`!!";
		next;
		mes "[�W���j]";
		mes "����A������������";
		mes "�����ɏW���ˁI";
		next;
		mes "[�W���j]";
		mes "����΂�`�I";
		mes "�����������[!!";
		next;
		mes "�]�Ԃ��炫�n�߂���n��";
		mes "�@�����f�B���J��T�����]";
		set ECL_4QUE,19;
		chgquest 14136,14137;
		close;
	case 19:
		mes "[�W���j]";
		mes "���������������ȁH";
		mes "������������";
		mes "�����ɏW�����܂���I";
		next;
		mes "[�W���j]";
		mes "����΂�`�I";
		mes "�����������[!!";
		close;
	case 20:
		mes "[�W���j]";
		mes "���������������ȁH";
		next;
		mes "[�W���j]";
		mes "�������͉����c�c�B";
		mes "�����A���ɗ����Ȃ���";
		mes "���߂�Ȃ����c�c�B";
		next;
		if(countitem(6548) < 1) {
			mes "[�W���j]";
			mes "��H";
			mes "�ǂ����܂����H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "����H �ǂ��ɂ���񂾁H";
			mes "���Ƃ����̂��ȁH";
			close;
		}
		mes "�]�����Ō������̂̂��Ƃ�`���A";
		mes "�@�E���ė������t�B�l�̉H�̌��Ђ�";
		mes "�@�������]";
		next;
		mes "[�W���j]";
		mes "�c�c���H";
		mes "���A���c�c����́c�c�B";
		next;
		mes "[�W���j]";
		mes "����́c�c�������ɂ�������́c�c�B";
		mes "�ǂ����āc�c�ǂ��������ƂȂ́c�c�H";
		next;
		menu "�ꏏ�ɂ�������̂Ƃ���ɍs�������H",-;
		mes "�]���������l�q�̃W���j���A";
		mes "�@��傫�Ȑ[�ċz�������]";
		next;
		mes "[�W���j]";
		mes "�c�c�c�B";
		next;
		mes "[�W���j]";
		mes "���肪�Ƃ��B";
		mes "�ł��A���v�ł��B";
		mes "���ЂƂ�ōs���܂��B";
		next;
		mes "[�W���j]";
		mes "���̑O�ɁA�����Ă������ł����H";
		mes "���Ȃ��͂ǂ����Ď��̕���";
		mes "�T���Ă����̂ł����H";
		next;
		mes "�]�E�t���̌����̘b��";
		mes "�@�����Ă������]";
		next;
		mes "[�W���j]";
		mes "�������񂪂���Ȍ������c�c�H";
		mes "�ŋ߉����ꏊ�����Ɍ�����";
		mes "���Ă������Ƃ͒m���Ă������ǁc�c�B";
		next;
		mes "[�W���j]";
		mes "�����I�@���������ǂ����āI";
		mes "�N���c�c���̂悤�Ȃ��Ƃ��c�c�B";
		mes "���̗D��������������c�c�B";
		next;
		mes "�]�W���j�͌�����";
		mes "�@�܂����炦�Ă���]";
		next;
		mes "[�W���j]";
		mes "�E�t���l�ɉ����";
		mes "���̂��Ƃ�`���Ă��������B";
		next;
		mes "[�W���j]";
		mes "���ƈꏏ�Ɍ��������Ă������A";
		mes "�����ĕ��̌����̋]���ɂȂ���";
		mes "���܂������c�c�B";
		mes "���̂��Ƃ�m�点�Ă����Ȃ���";
		mes "�����܂���B";
		next;
		if(checkitemblank() == 0) {
			mes "[�W���j]";
			mes "��������������Ă��ꂽ";
			mes "������������̂ł����A";
			mes "�ו��̎�ނ������悤�ł��B";
			mes "��ސ������炵�Ă��Ă��炦�܂����H";
			close;
		}
		mes "[�W���j]";
		mes "��������������Ă����";
		mes "���肪�Ƃ��������܂����c�c�B";
		mes "����Ƃ����قǂ̕��ł͂���܂��񂪁A";
		mes "�󂯎���Ă��������B";
		delitem 6548,1;
		set ECL_4QUE,21;
		chgquest 14138,14139;
		getexp 100000,0;
		getitem 617,1;
		close;
	case 21:
	case 22:
		mes "[�W���j]";
		mes "��������c�c�B";
		close;
	case 23:
		mes "[�W���j]";
		mes "�������p�ł����H";
		next;
		menu "��������̉H�̌��Ђ��K�v�ł��B",-;
		if(countitem(6548) > 0) {
			mes "[�W���j]";
			mes "��Ɏ����Ă���̂�";
			mes "��������̉H�̌��Ђł�";
			mes "����܂��񂩁H";
			close;
		}
		mes "[�W���j]";
		mes "��������̉H�̌��Ђ��ǂ����āc�c�B";
		next;
		mes "�]�E�t���̘b�������������Ă��]";
		next;
		mes "[�W���j]";
		mes "�����ł����c�c�B";
		mes "��������Ƃ̌����Łc�c�B";
		next;
		mes "[�W���j]";
		mes "�ł́A�����グ�܂��B";
		mes "�����A��������������";
		mes "�]��ł���ł��傤�B";
		next;
		if(checkitemblank() == 0) {
			mes "[�W���j]";
			mes "��������̉H�̌��Ђ�";
			mes "�����グ�����̂ł����A";
			mes "�ו��̎�ނ������悤�ł��B";
			mes "��ސ������炵�Ă��Ă��炦�܂����H";
			close;
		}
		mes "[�W���j]";
		mes "�������邱�Ƃ��肤��";
		mes "�`���ĉ������B";
		getitem 6548,1;
		close;
	case 24:
		mes "[�W���j]";
		mes "��������ɉ���ė��܂����B";
		next;
		mes "[�W���j]";
		mes "���͂����ł��������";
		mes "���������ꏏ�ɂ��܂��B";
		close;
	default:
		mes "[�W���j]";
		mes "�ǂ��ɂ���񂾂낤�B";
		mes "���̕ӂ��Ǝv���񂾂��ǁc�c�B";
		close;
	}
}

ecl_fild01.gat,269,165,4	script	����ȉԂ̂ڂ�	613,{
	if(ECL_4QUE == 19) {
		mes "�]�|���y���b���Ă���";
		mes "�@���t�B�l�̎��̂̂悤���]";
		next;
		mes "�]�H�̌`�������^0000cd�E�t���ƃW���j��";
		mes "�@�b���Ă����A�㋉���t�B�l��";
		mes "�@�����f�B���J�Ǝp����v^000000����]";
		next;
		mes "�]�̂̂����鏊�ɂ���L�Y�������";
		mes "�@��R�̖���^0000cd�E�Q���ꂽ�悤��^000000������]";
		next;
		mes "�]�̂̑傫�ȏ㋉���t�B�l��";
		mes "�@�͂ŉ����؂��Ă���B";
		mes "�@�㋉���t�B�l���^0000cd����ɑ̂��傫��";
		mes "�@�l���ɂ��ꂽ^000000�悤���]";
		next;
		if(checkitemblank() == 0) {
			mes "�]�΂�܂��ꂽ�H�̌��Ђ�";
			mes "�@�����Ă������Ƃ������A";
			mes "�@�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���󂯎�낤�]";
			close;
		}
		mes "�]�΂�܂��ꂽ�H�̌��Ђ��W�߂�";
		mes "�@�W���j�ɕ񍐂��悤�]";
		set ECL_4QUE,20;
		chgquest 14137,14138;
		getitem 6548,1;
		close;
	}
	if(ECL_4QUE == 20) {
		if(countitem(6548) < 1) {
			if(checkitemblank() == 0) {
				mes "�]�΂�܂��ꂽ�H�̌��Ђ�";
				mes "�@�����Ă������Ƃ������A";
				mes "�@�A�C�e���̎�ސ���������";
				mes "�@�����Ƃ��ł��Ȃ��B";
				mes "�@��ސ������炵�Ă���󂯎�낤�]";
				close;
			}
			mes "�]�΂�܂���Ă������t�B�l��";
			mes "�@�H�̌��Ђ��W�߂��]";
			getitem 6548,1;
			close;
		}
		mes "�]�㋉���t�B�l�̎��̂��]";
		close;
	}
	if(ECL_4QUE == 23) {
		mes "�]���̂̎��ӂɖ؂̎}�̂悤�Ɍ�����A";
		mes "�@�T�t�@���̔��̖т�����]";
		next;
		if(countitem(6545) < 1) {
			if(checkitemblank() == 0) {
				mes "�]�T�t�@���̔��̖т�";
				mes "�@�����Ă������Ƃ������A";
				mes "�@�A�C�e���̎�ސ���������";
				mes "�@�����Ƃ��ł��Ȃ��B";
				mes "�@��ސ������炵�Ă���󂯎�낤�]";
				close;
			}
			mes "�]�����ޗ��炵������";
			mes "�@���������čs�����]";
			getitem 6545,1;
			close;
		}
		mes "�]�㋉���t�B�l�̎��̂��]";
		close;
	}
	mes "�]����ȉԂ̂ڂ݂̂悤��";
	mes "�@�`�����Ă��鐳�̕s����";
	mes "�@���̂�����]";
	close;
}

eclage.gat,156,51,0	script	#hidden_eclage	139,{}

//============================================================
// �d�������̎�����N�G�X�g
//- Registry -------------------------------------------------
// ECL_5QUE -> 0�`
//------------------------------------------------------------
ecl_in04.gat,81,106,0	script	#hidden2_eclage	139,2,2,{
	if(ECL_5QUE == 1) {
		mes "[���[�G��]";
		mes "����͂�������";
		mes "�����������́c�c�H";
		next;
		mes "[�f�C���X]";
		mes "�Ƃ̒����Œ��ꒃ����Ȃ����c�c�B";
		mes "�D�_���������̂��H";
		next;
		mes "[���T]";
		mes "�l�b�N���X�c�c�B";
		mes "���̑厖�ȃl�b�N���X���Ȃ���I";
		mes "���܂ꂽ�ɈႢ�Ȃ���!!";
		next;
		mes "[�|�s]";
		mes "��������!!�@��������!!";
		mes "�����I�@�����I";
		next;
		mes "[���[�G��]";
		mes "�|�s�A��l�������āI";
		mes "���̐l�͈����l����Ȃ�����";
		mes "�i���Ȃ��ł����̂�B";
		next;
		mes "[���T]";
		mes "������A�˒���̊m�F�����悤��";
		mes "���x������������Ȃ�!!";
		mes "����͉Ƃ̂��Ƃ��C�ɂ��Ȃ�";
		mes "���Ȃ��̐ӔC��B";
		next;
		mes "[�f�C���X]";
		mes "�����c�c�B";
		mes "�����������Ă����̂����H";
		mes "�Ƒ��S�������������������ł�";
		mes "�ǂ���������Ȃ���!?";
		next;
		mes "[���T]";
		mes "���������Ă���̂�H";
		mes "�{���ɂ��Ȃ��͂���!!";
		next;
		mes "[���[�G��]";
		mes "���c�c�B";
		mes "���̐l�A�N�����݂����I";
		mes "���́A���v�ł����H";
		sc_end SC_BLIND;
		next;
		menu "�����ƂĂ��ɂ��ł��c�c",-;
		mes "[���T]";
		mes "�N�����̂Ȃ�A�������ƋA���āI";
		mes "�ƂɓD�_�������đ�ςȂ̂�";
		mes "���Ȃ��̖ʓ|�݂Ă���]�T�͂Ȃ���I";
		next;
		mes "[���[�G��]";
		mes "���ꂳ��A���̐l������";
		mes "��������Ă���̂Ɂc�c�B";
		next;
		mes "[���[�G��]";
		mes "���݂܂���B";
		mes "���Ȃ����Ƃ̑O�œ|��Ă����̂�";
		mes "���̕����ɉ^�񂾂̂ł��B";
		mes "�ł��A�ǂ����Ă���ȂƂ���ɁH";
		next;
		menu "���҂��ɓ�������ꂽ�Ɠ�����",-;
		mes "[���[�G��]";
		mes "�c�c����Ȃ��Ƃ��I";
		mes "���Ȃ����P�����l��";
		mes "�D�_�������̂�������܂���ˁB";
		next;
		mes "[���T]";
		mes "�҂��Ȃ����I";
		mes "�����œ���ł�����";
		mes "�R�����Ă��邩������Ȃ���B";
		mes "���̐l�̎������𒲂ׂĂ݂āI";
		next;
		mes "[�f�C���X]";
		mes "���������񂾁B";
		mes "�������͒ǂ��o�����Ƃ���";
		mes "���x�͎������𒲂ׂ�Ȃ��";
		mes "�������Ɏ��炶��Ȃ����B";
		mes "����ɁA�D�_�Ȃ�Ƃ̑O��";
		mes "�|��Ă���Ȃ�Ă����������낤�H";
		next;
		mes "[���T]";
		mes "���������ӂ��Ɏv�킹��";
		mes "���������x���Ă��邩������Ȃ���B";
		mes "�������Ƃ����Ȃ�A�^�Ɛl��";
		mes "�A��ė��Ă����Ȃ����I";
		next;
		mes "[���[�G��]";
		mes "�c�c���݂܂���B";
		mes "��͓��h���Ă���݂����Ȃ̂�";
		mes "�C�ɂ��Ȃ��ł��������B";
		next;
		switch(select("�^�Ɛl��{���Ė������ؖ�����","�l�b�N���X��T���̂���`��")) {
		case 1:
			mes "[���[�G��]";
			mes "��̌������ƂȂ�";
			mes "�C�ɂ��Ȃ��ł��������B";
			mes "���́A���Ȃ����Ɛl���Ƃ�";
			mes "�v���Ă��܂��񂩂�c�c�B";
			next;
			mes "[���[�G��]";
			mes "�������A�Ɛl��{���Ă����Ȃ�";
			mes "������܂����ǁc�c�B";
			break;
		case 2:
			mes "[���[�G��]";
			mes "���������Ă��炦��ƁA������܂��B";
			mes "�ł��A���܂�댯�Ȃ��Ƃ�";
			mes "���Ȃ��ł��������ˁB";
			mes "�܂����������Ă�����܂�����B";
			break;
		}
		next;
		menu "���������{�����J�n����",-,"�{���ւ̋��͂����߂�",-;
		mes "[���[�G��]";
		mes "�c�c�����ł����B";
		mes "�킩��܂����B";
		next;
		mes "[���T]";
		mes "�M�p�ł��Ȃ���c�c�B";
		next;
		mes "[�f�C���X]";
		mes "�D�_��߂܂��܂��傤�B";
		next;
		mes "[���[�G��]";
		mes "�܂��́A�����炨�b�����܂��傤���H";
		mes "���ł킩�邱�ƂȂ�";
		mes "���������܂����ǁH";
		set ECL_5QUE,2;
		chgquest 9225,9226;
		close;
	}
	end;
}

ecl_in04.gat,78,108,5	script	���[�G��	437,{
	switch(ECL_5QUE) {
	case 1:
		mes "[���[�G��]";
		mes "����͂�������";
		mes "�����������́c�c�H";
		next;
		mes "[�f�C���X]";
		mes "�Ƃ̒����Œ��ꒃ����Ȃ����c�c�B";
		mes "�D�_���������̂��H";
		next;
		mes "[���T]";
		mes "�l�b�N���X�c�c�B";
		mes "���̑厖�ȃl�b�N���X���Ȃ���I";
		mes "���܂ꂽ�ɈႢ�Ȃ���!!";
		next;
		mes "[�|�s]";
		mes "��������!!�@��������!!";
		mes "�����I�@�����I";
		next;
		mes "[���[�G��]";
		mes "�|�s�A��l�������āI";
		mes "���̐l�͈����l����Ȃ�����";
		mes "�i���Ȃ��ł����̂�B";
		next;
		mes "[���T]";
		mes "������A�˒���̊m�F�����悤��";
		mes "���x������������Ȃ�!!";
		mes "����͉Ƃ̂��Ƃ��C�ɂ��Ȃ�";
		mes "���Ȃ��̐ӔC��B";
		next;
		mes "[�f�C���X]";
		mes "�����c�c�B";
		mes "�����������Ă����̂����H";
		mes "�Ƒ��S�������������������ł�";
		mes "�ǂ���������Ȃ���!?";
		next;
		mes "[���T]";
		mes "���������Ă���̂�H";
		mes "�{���ɂ��Ȃ��͂���!!";
		next;
		mes "[���[�G��]";
		mes "���c�c�B";
		mes "���̐l�A�N�����݂����I";
		mes "���́A���v�ł����H";
		next;
		menu "�����ƂĂ��ɂ��ł��c�c",-;
		mes "[���T]";
		mes "�N�����̂Ȃ�A�������ƋA���āI";
		mes "�ƂɓD�_�������đ�ςȂ̂�";
		mes "���Ȃ��̖ʓ|�݂Ă���]�T�͂Ȃ���I";
		next;
		mes "[���[�G��]";
		mes "���ꂳ��A���̐l������";
		mes "��������Ă���̂Ɂc�c�B";
		next;
		mes "[���[�G��]";
		mes "���݂܂���B";
		mes "���Ȃ����Ƃ̑O�œ|��Ă����̂�";
		mes "���̕����ɉ^�񂾂̂ł��B";
		mes "�ł��A�ǂ����Ă���ȂƂ���ɁH";
		next;
		menu "���҂��ɓ�������ꂽ�Ɠ�����",-;
		mes "[���[�G��]";
		mes "�c�c����Ȃ��Ƃ��I";
		mes "���Ȃ����P�����l��";
		mes "�D�_�������̂�������܂���ˁB";
		next;
		mes "[���T]";
		mes "�҂��Ȃ����I";
		mes "�����œ���ł�����";
		mes "�R�����Ă��邩������Ȃ���B";
		mes "���̐l�̎������𒲂ׂĂ݂āI";
		next;
		mes "[�f�C���X]";
		mes "���������񂾁B";
		mes "�������͒ǂ��o�����Ƃ���";
		mes "���x�͎������𒲂ׂ�Ȃ��";
		mes "�������Ɏ��炶��Ȃ����B";
		mes "����ɁA�D�_�Ȃ�Ƃ̑O��";
		mes "�|��Ă���Ȃ�Ă����������낤�H";
		next;
		mes "[���T]";
		mes "���������ӂ��Ɏv�킹��";
		mes "���������x���Ă��邩������Ȃ���B";
		mes "�������Ƃ����Ȃ�A�^�Ɛl��";
		mes "�A��ė��Ă����Ȃ����I";
		next;
		mes "[���[�G��]";
		mes "�c�c���݂܂���B";
		mes "��͓��h���Ă���݂����Ȃ̂�";
		mes "�C�ɂ��Ȃ��ł��������B";
		next;
		switch(select("�^�Ɛl��{���Ė������ؖ�����","�l�b�N���X��T���̂���`��")) {
		case 1:
			mes "[���[�G��]";
			mes "��̌������ƂȂ�";
			mes "�C�ɂ��Ȃ��ł��������B";
			mes "���́A���Ȃ����Ɛl���Ƃ�";
			mes "�v���Ă��܂��񂩂�c�c�B";
			next;
			mes "[���[�G��]";
			mes "�������A�Ɛl��{���Ă����Ȃ�";
			mes "������܂����ǁc�c�B";
			break;
		case 2:
			mes "[���[�G��]";
			mes "���������Ă��炦��ƁA������܂��B";
			mes "�ł��A���܂�댯�Ȃ��Ƃ�";
			mes "���Ȃ��ł��������ˁB";
			mes "�܂����������Ă�����܂�����B";
			break;
		}
		next;
		menu "���������{�����J�n����",-,"�{���ւ̋��͂����߂�",-;
		mes "[���[�G��]";
		mes "�c�c�����ł����B";
		mes "�킩��܂����B";
		next;
		mes "[���T]";
		mes "�M�p�ł��Ȃ���c�c�B";
		next;
		mes "[�f�C���X]";
		mes "�D�_��߂܂��܂��傤�B";
		next;
		mes "[���[�G��]";
		mes "�܂��́A�����炨�b�����܂��傤���H";
		mes "���ł킩�邱�ƂȂ�";
		mes "���������܂����ǁH";
		set ECL_5QUE,2;
		chgquest 9225,9226;
		close;
	case 2:
		mes "[���[�G��]";
		mes "�����炨�b�����܂��傤���H";
		mes "���ł킩�邱�ƂȂ�";
		mes "���������܂��B";
		next;
		menu "�����̑O�ɉ������Ă����̂�����",-;
		mes "[���[�G��]";
		mes "���͉Ԃ��炫�n�߂���n��";
		mes "�U������Ă��܂����B";
		mes "���������Ȃ���Ǐ���������c�c�B";
		next;
		mes "[���[�G��]";
		mes "���������Ă���ꏊ�ɂ����";
		mes "�C�����ǂ��Ȃ���";
		mes "�Ƃ̂��ƂƂ�";
		mes "�Y�ݎ�������������ł��B";
		next;
		menu "�������l�����Ă��Ȃ�������",-;
		mes "[���[�G��]";
		mes "�������l�ł����H";
		next;
		mes "[���[�G��]";
		mes "�c�c���������΁I";
		mes "�Ԃ��ĒZ�����̐l��";
		mes "�����ŕ����Ă���̂����܂����B";
		mes "�����}���ł���̂��ȁ[����";
		mes "�l���Ă����̂��o���Ă܂��B";
		next;
		mes "[���[�G��]";
		mes "���܂茩�����Ȃ����̐F�������̂�";
		mes "���������N�Ȃ񂾂낤����";
		mes "���΂炭���Ă��܂����B";
		next;
		switch(select("���̐l�ɂ��ďڂ�������","�m�荇���ɐԂ��ĒZ�����̐l�����邩����")) {
		case 1:
			mes "[���[�G��]";
			mes "����ȏ�́c�c�B";
			mes "������Ƃ킩��܂���B";
			mes "�j�̐l�������̂�";
			mes "����Ƃ����������̂��c�c�H";
			next;
			mes "[���[�G��]";
			mes "�̊i�͒j�̐l�̂悤��";
			mes "�����܂������ǁc�c�B";
			mes "���^�͏��̐l�̂悤�ɂ�";
			mes "�����܂������c�c�B";
			next;
			mes "[���[�G��]";
			mes "�����A�Ȃ�ƂȂ�";
			mes "�ǂ����Ō������Ƃ�����悤��";
			mes "�C�����܂����B";
			mes "�c�c�L���Ⴂ��������܂��񂯂ǁB";
			break;
		case 2:
			mes "[���[�G��]";
			mes "�����c�c�B";
			mes "���̔��̐F�A���^�c�c�B";
			mes "�������Ƃ��Ȃ��ł��B";
			next;
			mes "[���[�G��]";
			mes "���Ȃ��Ƃ��A���̒m�l�ɂ�";
			mes "��΂ɂ��܂���B";
			mes "���ꂾ���͎��M�������Ēf���ł��܂��I";
			break;
		}
		next;
		switch(select("�|��Ă��鎩���𔭌������̂͒N������","���̌�A���̐l������������")) {
		case 1:
			mes "[���[�G��]";
			mes "�����A���Ă����Ƃ�";
			mes "���Ȃ��͉Ƃ̑O�ɓ|��Ă��܂����B";
			next;
			mes "[���[�G��]";
			mes "����ł���̂��Ǝv����";
			mes "�ƂĂ������܂��������";
			mes "�ċz���Ă��̂ɋC�Â�����ł��B";
			next;
			mes "[���[�G��]";
			mes "���̌�A�Ƃɂ������Â̂��߂�";
			mes "�Ƃɓ���悤�Ǝv�����̂ł���";
			mes "�Ƃ̒����r�炳��Ă���";
			mes "�܂������܂����c�c�B";
			next;
			mes "[���[�G��]";
			mes "�Ƃ̒��ɂ͂��ꂳ�񂪂�����ł��B";
			mes "�Ƃɖ߂��Ă����Ȃ�";
			mes "�Ƃ̑O�ɐl���|��Ă���̂�";
			mes "���Ă���͂��ł����ǁc�c�B";
			mes "�ǂ����ĉ������Ȃ������̂�����H";
			next;
			mes "[���[�G��]";
			mes "���Ԃ�A�|��Ă��邠�Ȃ���";
			mes "�ŏ��Ɍ������̂�";
			mes "���ꂳ��̂͂��ł��B";
			break;
		case 2:
			mes "[���[�G��]";
			mes "�������A�����̂͂��̎������ł��B";
			mes "�A���Ă���Ƃ���";
			mes "��������̗F�B�̃o���~����";
			mes "�Ƃ̑O������Ă���̂�";
			mes "�������܂����B";
			next;
			mes "[���[�G��]";
			mes "�������炾�����̂�";
			mes "�悭�����܂���ł�������";
			mes "�}���ł���l�q�ł����B";
			next;
			mes "[���[�G��]";
			mes "�Ƃ̑O��ʂ����Ȃ�";
			mes "�|��Ă��邠�Ȃ���";
			mes "���Ă���͂��ł�����";
			mes "���̂܂ܒʂ�߂��Ă��܂����̂�����H";
			break;
		}
		next;
		menu "���[�G���ւ̕������݂��I����",-;
		mes "[���[�G��]";
		mes "�ǂ����Ă���Ȃ��ƂɁc�c�B";
		mes "���݂܂���A�����������Ă��܂���";
		mes "�ׂ��Ȃ��Ƃ܂ł͊o���Ă��܂���B";
		next;
		mes "[���[�G��]";
		mes "��������c�c�f�C���X�ɂ�";
		mes "�b�𕷂��Ă݂Ă��������B";
		set ECL_5QUE,3;
		chgquest 9226,9227;
		setquest 9240;
		close;
	case 3:
		mes "[���[�G��]";
		mes "��������c�c�f�C���X�ɂ�";
		mes "�b�𕷂��Ă݂Ă��������B";
		close;
	case 4:
		mes "[���[�G��]";
		mes "���ꂳ��c�c���T�ɂ�";
		mes "�b�𕷂��Ă݂Ă��������B";
		close;
	case 5:
		mes "[���[�G��]";
		mes "�����A���b���ł��邱�Ƃ�";
		mes "�����������`�������Ǝv���܂��B";
		next;
		mes "�]�Ƒ��ւ̕������݂�";
		mes "�@�I������]";
		next;
		mes "�]���𐮗����Ă݂悤�B";
		mes "�@�܂��́c�c�]";
		next;
		mes "�]���[�G�����Ԃ��ĒZ�����̐l��";
		mes "�@�����Ƃ����B";
		mes "�@�j���������킩��Ȃ���";
		mes "�@�������Ƃ�����C�������";
		mes "�@�����Ă����]";
		next;
		mes "�]���[�G���͉Ƃ̑O��";
		mes "�@�l���|��Ă���̂ɋC�Â�����";
		mes "�@��ɉƂ̒��ɂ̓��T��";
		mes "�@�A���Ă��Ă����B";
		mes "�@�����āc�c�]";
		next;
		mes "�]�f�C���X�͗F�B�̃o���~����";
		mes "�@��ɍs���Ă����B";
		mes "�@�f�C���X�̓o���~�������";
		mes "�@�؋��̐\�������f���Ă����]";
		next;
		mes "�]���܂ꂽ�l�b�N���X��";
		mes "�@�f�C���X���v���[���g�������̂�";
		mes "�@���T�͂����ЂƂ�";
		mes "�@�l�b�N���X��~�������Ă����]";
		next;
		mes "�]�f�C���X�̓��T��";
		mes "�@�Ɛl�ł͂Ȃ����Ƌ^���Ă���悤���B";
		mes "�@�����āc�c�]";
		next;
		mes "�]���T�͔������ɏo�����Ă����B";
		mes "�@�Ƃ͍r�炳��Ă�����";
		mes "�@�l�b�N���X�������Ȃ����ȊO��";
		mes "�@�ς�����Ƃ���͂Ȃ������]";
		next;
		mes "�]�Ƃ̒��ɍ����Ȃ��̂͂Ȃ������B";
		mes "�@���܂ꂽ�l�b�N���X��";
		mes "�@�ƂĂ���؂ɂ��Ă����悤����";
		mes "�@���ނقǂ̉��l�͂Ȃ������悤���]";
		next;
		mes "�]�ǂ����ĔƐl��";
		mes "�@�����ł��Ȃ��l�b�N���X��";
		mes "�@���񂾂̂��H�]";
		next;
		mes "�]�܂��킩��Ȃ����Ƃ������B";
		mes "�@�����Ə����W�߂悤�]";
		next;
		mes "�]���́A�Ƃ̒��𒲂ׂĂ݂悤�B";
		mes "�@�܂��͌��̃|�s���炾�]";
		set ECL_5QUE,6;
		chgquest 9229,9230;
		close;
	case 6:
		mes "[���[�G��]";
		mes "���ꌟ�؂ł����H ";
		mes "�܂��́c�c�����ł��ˁB";
		mes "���̃|�s�������Ɨ���Ԃ�";
		mes "���Ă����͂��ł��B";
		close;
	case 7:
		mes "[���[�G��]";
		mes "���ꌟ�؂ł����H ";
		mes "���́c�c�����ł��ˁB";
		mes "�{�I���r�炳��Ă��܂��ˁc�c�B";
		close;
	case 8:
		mes "[���[�G��]";
		mes "���ꌟ�؂ł����H ";
		mes "���́c�c�����ł��ˁB";
		mes "�{�I�̉��̊��̖{��";
		mes "�j���Ă��܂��ˁc�c�B";
		close;
	case 9:
		mes "[���[�G��]";
		mes "���ꌟ�؂ł����H ";
		mes "���́c�c�����ł��ˁB";
		mes "�h�����N�����{�I�̘e��";
		mes "����܂����ǁc�c�B";
		close;
	case 10:
		mes "[���[�G��]";
		mes "���ꌟ�؂ł����H ";
		mes "���́c�c�����ł��ˁB";
		mes "�r�炳�ꂽ�e�[�u����";
		mes "�������邩������܂���ˁB";
		close;
	case 11:
		mes "[���[�G��]";
		mes "���ꌟ�؂ł����H ";
		mes "��́c�c�����ł��ˁB";
		mes "���̎��W�����炢�ł��傤���c�c�B";
		close;
	case 12:
		mes "[���[�G��]";
		mes "�Ƃ̒��̒������I�������ł��ˁB";
		mes "�����킩��܂������H";
		next;
		mes "[���[�G��]";
		mes "���́c�c�B";
		mes "�l�b�N���X�͓��܂ꂽ�̂ł͂Ȃ�";
		mes "�ǂ����ɗ����Ă����Ƃ�";
		mes "�����������Ƃ͂Ȃ��ł��傤���H";
		next;
		if(select("�s���w�E��","�K���Ɛl�͑��݂���") == 1) {
			mes "�]�m���Ƀl�b�N���X�͌����������";
			mes "�@�Ɛl���킩��܂ł�";
			mes "�@�閧�ɂ��Ă������]";
			next;
		}
		mes "[���[�G��]";
		mes "�c�c�����ł����B";
		mes "�����܂Œ��ׂĂ���������";
		mes "�����\���ł��B";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "[���T]";
		mes "���������Ă���́H";
		mes "�K���Ɛl��߂܂���";
		mes "���̃l�b�N���X��";
		mes "���߂��̂�I";
		next;
		mes "�]�p�^�p�^�]";
		next;
		mes "�]�N�����Ƃɓ����ė����̂�";
		mes "�@�����ɉH���������]";
		next;
		mes "[�N���C�A��]";
		mes "����l�`�I�@�����l�`�I";
		mes "���ł��I�@�N���C�A���ł��I";
		mes "�c�c����!!";
		mes "�Ƃ̒����Œ��ꒃ�Ɂc�c�H";
		mes "�D�_�ɓ���ꂽ��ł���!?";
		hideoffnpc "�N���C�A��#event";
		next;
		mes "[���T]";
		mes "���Ȃ��ɂ���l�Ȃǂ�";
		mes "�Ă΂�邢���͂���܂���I";
		mes "���ɋ߂Â��Ȃ�";
		mes "���x�����������ˁH";
		mes "�����Ƃ���o�čs���Ȃ����I";
		next;
		mes "[�N���C�A��]";
		mes "����l!!";
		mes "���܂ꂽ���̂Ȃ�";
		mes "�K�������T���o���܂��I";
		mes "����M���Ă��������I";
		next;
		mes "[���T]";
		mes "������������";
		mes "�����Ƃ���o�čs���Ȃ����I";
		hideonnpc "�N���C�A��#event";
		next;
		mes "�]���̂����[�G���̗��l���낤���H";
		mes "�@���T�ɂ͐M�p����Ă��Ȃ��݂������]";
		next;
		mes "[���[�G��]";
		mes "�N���C�A���ł����H";
		mes "�����A���t���������Ă��܂��B";
		mes "�c�c�ނ́A�{���͂����l�Ȃ�ł��B";
		mes "�����́A���̉Ƃ��o��";
		mes "�����k���̂�����ɂ��܂��B";
		next;
		mes "�]����܂ł̒�����";
		mes "�@���l���b�𕷂��Ă݂���";
		mes "�@�l�����łĂ����B";
		mes "�@�܂��́A�N���C�A����";
		mes "�@�b�𕷂��ɍs�����]";
		set ECL_5QUE,13;
		delquest 9252;
		delquest 9253;
		delquest 9254;
		delquest 9255;
		delquest 9256;
		delquest 9257;
		delquest 9230;
		setquest 9231;
		setquest 9258;
		close;
	case 13:
		mes "[���[�G��]";
		mes "�������݂ł����H ";
		mes "�N���C�A���Ȃ�";
		mes "���̉Ƃ��o�ď����k���ɐi�񂾂������";
		mes "��������̂�";
		mes "�b�𕷂��Ă����Ă��������B";
		close;
	case 14:
		mes "[���[�G��]";
		mes "�������݂ł����H ";
		mes "�o���~������Ȃ�";
		mes "�Ԃ��炫�n�߂���n��";
		mes "����Ǝv���܂��B";
		close;
	case 15:
		mes "[���[�G��]";
		mes "�������݂ł����H ";
		mes "�X�s�[�h�A�b�v�|�[�V������";
		mes "��舵���Ă��鏤�l�ł����H";
		mes "���[��A����������Ȃ�";
		mes "�X�̒����Ǝv���܂����ǁc�c�B";
		close;
	case 16:
		mes "[���[�G��]";
		mes "�������݂͏I�������ł��ˁB";
		mes "�����킩��܂������H";
		next;
		if(select("���ꂩ�琄�����܂�","�������𐮗����܂�") == 2) {
			mes "[���[�G��]";
			mes "�c�c�����ł����B";
			next;
			mes "�]�Ђƒʂ�֌W�҂ɘb�͕������B";
			mes "�@�����ł����烋�[�G����";
			mes "�@������b�����]";
			close;
		}
		mes "[���[�G��]";
		mes "�����c�c�I";
		mes "�Ɛl���킩�����̂ł����H";
		next;
		mes "[���T]";
		mes "�܂��A�{���Ȃ�!?";
		next;
		mes "[�f�C���X]";
		mes "�Ȃ�ƁI";
		mes "����Ȃɑ���������Ƃ́c�c�B";
		mes "���������֌W�҂��W�߂܂��B";
		close2;
		set ECL_5QUE,17;
		chgquest 9234,9235;
		warp "ecl_in04.gat",206,195;
		end;
	case 17:
		mes "[���[�G��]";
		mes "�݂Ȃ��񂪂��҂��ł��B";
		next;
		if(select("���ꂩ�琄�����܂�","�������𐮗����܂�") == 2) {
			mes "[���[�G��]";
			mes "�c�c�����ł����B";
			next;
			mes "�]�Ђƒʂ�֌W�҂ɘb�͕������B";
			mes "�@�����ł����烋�[�G����";
			mes "�@�b�������悤�]";
			close;
		}
		mes "[���[�G��]";
		mes "�ł́A������ւǂ����B";
		close2;
		warp "ecl_in04.gat",206,195;
		end;
	case 18:
		mes "[���[�G��]";
		mes "���Ȃ��ɂ͖��f�������Ă��܂���";
		mes "���݂܂���ł����B";
		next;
		mes "[���[�G��]";
		mes "�N���C�A�����������Ƃ�";
		mes "�������Ƃł������";
		mes "�{�l�����Ȃ��Ă���̂ŁA";
		mes "���ꂩ��͓�l�ŗ͂����킹��";
		mes "�������Ǝv���܂��B";
		next;
		mes "[���[�G��]";
		mes "�{���ɁA���肪�Ƃ��������܂����B";
		if(checkitemblank() < 3) {
			next;
			mes "[���[�G��]";
			mes "��������悤�Ǝv�����̂ł������";
			mes "����ȏ㎝�ĂȂ��݂����ł��ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		set ECL_5QUE,19;
		chgquest 9236,9237;
		getitem 6081,1;
		getexp 300000,0;
		getexp 0,150000;
		next;
		mes "[���[�G��]";
		mes "��������A�f�C���X��";
		mes "������������������Ȃ̂�";
		mes "�b�������Ă����Ă��������B";
		close;
	case 19:
	case 20:
	case 21:
		mes "[���[�G��]";
		mes "���肪�Ƃ��������܂����B";
		mes "���ꂳ��ɃN���C�A���Ƃ̌��ۂ�";
		mes "�F�߂Ă��炦��悤";
		mes "��l�ŗ͂����킹��";
		mes "�������Ǝv���܂��B";
		close;
	}
}

ecl_in04.gat,85,110,3	script	�f�C���X	447,{
	switch(ECL_5QUE) {
	case 2:
		mes "[�f�C���X]";
		mes "�D�_��߂܂��邽�߂Ȃ�";
		mes "���͂͐ɂ��݂܂����B";
		mes "�������Ă����܂��̂�";
		mes "��ɖ�����b�𕷂��Ă��������B";
		close;
	case 3:
		mes "[�f�C���X]";
		mes "�D�_��߂܂��邽�߂Ȃ�";
		mes "���͂͐ɂ��݂܂����B";
		next;
		menu "�����̑O�ɉ������Ă����̂�����",-;
		mes "[�f�C���X]";
		mes "���͗F�l�Ɖ���Ă��܂����B";
		mes "�o���~���Ƃ������O�ł��B";
		next;
		mes "[�f�C���X]";
		mes "���̘b�c�c�B";
		mes "�Ȃ̘b��c�c�B";
		mes "���Ԙb�����āc�c�B";
		next;
		mes "[�f�C���X]";
		mes "�A���Ă������ɂ�";
		mes "�Ƃ̒��͂߂��Ⴍ����ŁA";
		mes "�ȂƖ��͕�R�Ƃ��Ă�����";
		mes "���Ȃ��͓|��Ă��܂����c�c�B";
		next;
		switch(select("�F�B�ɂ��ĕ���","�F�B�ƃg���u�����Ȃ�����������")) {
		case 1:
			mes "[�f�C���X]";
			mes "���Ɉ������Ƃ�����悤��";
			mes "�l�ł͂���܂���B";
			next;
			mes "[�f�C���X]";
			mes "�܂��A�΂�����Ă�";
			mes "�����q���̂悤�ȁc�c�B";
			mes "���������̂Ȃ�A�܂���l��";
			mes "�Ȃ肫���Ă��Ȃ��l�ł��B";
			break;
		case 2:
			mes "[�f�C���X]";
			mes "���́c�c�B";
			mes "���̗F�l������";
			mes "������݂��Ăق�����";
			mes "�����Ă������Ƃ�����܂����B";
			next;
			mes "[�f�C���X]";
			mes "�݂���悤�Ȃ���������܂���ł�����";
			mes "�F�B���m�ł����݂̑��؂��";
			mes "�ǂ��Ȃ��Ǝv�����̂�";
			mes "�f�����̂ł����c�c�B";
			next;
			mes "[�f�C���X]";
			mes "����ȊO�ɂ�";
			mes "���������Ƃ��Ȃ���";
			mes "����������悤�Ȑl�ł�����܂���B";
			break;
		}
		next;
		switch(select("�����ɂ��Ďv�������邱�Ƃ𕷂�","�l�b�N���X�ɂ��ĕ���")) {
		case 1:
			mes "[�f�C���X]";
			mes "���܂�l�������͂Ȃ��̂ł����c�c�B";
			mes "���͍Ȃ��������Ǝv���Ă��܂��B";
			mes "�ŋ߁A�s���𗭂߂���ł����悤�Ȃ̂�";
			next;
			mes "[�f�C���X]";
			mes "����b���Ă�";
			mes "�_�����A���₾�Ȃǂ�";
			mes "�����Ƃ������R���Ȃ�";
			mes "���ɔ��΂��邱�Ǝ��̂�";
			mes "�ړI�ɂȂ��Ă���悤�ł����c�c�B";
			next;
			mes "[�f�C���X]";
			mes "�ŋ߂͂��ꂱ�ꔃ���Ă����";
			mes "�����Ă��邱�Ƃ���������";
			mes "���˂���A�{�����肷�邱�Ƃ�������";
			mes "�܂������c�c���܂��c�c�B";
			break;
		case 2:
			mes "[�f�C���X]";
			mes "���܂ꂽ�̂�";
			mes "�Ȃ̃l�b�N���X�ł��ˁc�c�B";
			mes "�Ⴂ���A����������";
			mes "�v���[���g�������̂ł��B";
			next;
			mes "[�f�C���X]";
			mes "�D�_�ɓ���ꂽ�ƕ���������";
			mes "��ς��Ǝv���܂������A";
			mes "�l�b�N���X�����܂ꂽ�ƕ�����";
			mes "�ȑO�ɍȂƘb�������Ƃ�";
			mes "�v���o���܂����B";
			next;
			mes "[�f�C���X]";
			mes "�l�b�N���X�������ЂƂ�";
			mes "�����Ăق����ƌ���ꂽ�̂ł��B";
			mes "�Ȃ̎��̒a�����ɔ�����";
			mes "�񑩂����̂ł���";
			mes "�Ȃ͕s�������ł����B";
			next;
			mes "[�f�C���X]";
			mes "�܂����Ƃ͎v���܂���";
			mes "�l�b�N���X�𓐂�ꂽ���Ƃɂ����";
			mes "�V�������̂����������^�����";
			mes "�l�����̂ł͂Ȃ����Ɓc�c�B";
			mes "���̍l�������ł��傤���H";
			break;
		}
		next;
		menu "�f�C���X�ւ̕������݂��I����",-;
		mes "[�f�C���X]";
		mes "�����A�Ƒ��̂�����";
		mes "���Ȃ�������������̂Ȃ�";
		mes "�{���ɐ\���󂠂�܂���B";
		next;
		mes "[�f�C���X]";
		mes "�Ȃ̃��T�ɂ������Ă݂Ă��������B";
		mes "�c�c�����A�v�����݂�";
		mes "�ςȂ��Ƃ���������";
		mes "�R�������肷�邩������܂���B";
		set ECL_5QUE,4;
		chgquest 9227,9228;
		setquest 9247;
		close;
	case 4:
		mes "[�f�C���X]";
		mes "�Ȃ̃��T�ɂ������Ă݂Ă��������B";
		mes "�c�c�����A�v�����݂�";
		mes "�ςȂ��Ƃ���������";
		mes "�R�������肷�邩������܂���B";
		close;
	case 5:
		mes "[�f�C���X]";
		mes "�����Ƒ��S���̘b��";
		mes "�����I���܂������H";
		close;
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�f�C���X]";
		mes "���ꌟ�؂Ƃ����킯�ł����B";
		mes "��������Ɛl�ɍr�炳��Ă��܂���";
		mes "���������̂ł��B";
		close;
	case 13:
		mes "[�f�C���X]";
		mes "�N���C�A���ł����H";
		mes "���Ƃ̌��ۂ̂��Ƃ�";
		mes "�Ȃɔ��΂���Ă��܂��ˁB";
		mes "���Ԃ�A�X�ɂ���Ǝv���܂���B";
		close;
	case 14:
		mes "[�f�C���X]";
		mes "�o���~���ł����H";
		mes "�Ԃ��炫�n�߂���n��";
		mes "�������Ă���͂��ł��B";
		close;
	case 15:
		mes "[�f�C���X]";
		mes "�X�s�[�h�A�b�v�|�[�V������";
		mes "�����Ă��鏤�l�ł����H";
		mes "�����c�c�Ƃ肠����";
		mes "�X�̒���T���Ă݂ẮH";
		close;
	case 16:
	case 17:
		mes "[�f�C���X]";
		mes "�����킩��܂������H";
		close;
	case 18:
		mes "[�f�C���X]";
		mes "���[�G�������ӂ��Ă��܂����B";
		mes "�b�������Ă����Ă��������B";
		close;
	case 19:
		mes "[�f�C���X]";
		mes "�����̐^����m����";
		mes "�������G�ȋC���ł��B";
		next;
		mes "[�f�C���X]";
		mes "���ꂩ��̂��Ƃ�";
		mes "�Ƒ��Řb��������";
		mes "���߂悤�Ǝv���܂��B";
		next;
		mes "[�f�C���X]";
		mes "���Ȃ��ɂ͊��ӂ��Ă��܂��B";
		mes "���肪�Ƃ��������܂����B";
		if(checkitemblank() < 3) {
			next;
			mes "[�f�C���X]";
			mes "��������悤�Ǝv���܂�����";
			mes "����ȏ㎝�ĂȂ��悤�ł��ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		set ECL_5QUE,20;
		chgquest 9237,9238;
		getitem 607,1;
		getexp 300000,0;
		getexp 0,150000;
		next;
		mes "[�f�C���X]";
		mes "���������B";
		mes "���T�������p�ӂ��Ă����݂����ł��B";
		mes "�b�������Ă���Ă��������B";
		close;
	case 20:
	case 21:
		mes "[�f�C���X]";
		mes "�����b�ɂȂ�܂����B";
		mes "���ꂩ��̂��Ƃ�";
		mes "�Ƒ��Řb��������";
		mes "���߂悤�Ǝv���܂��B";
		close;
	default:
		mes "[�f�C���X]";
		mes "�ƂɓD�_������̂�";
		mes "���߂Ă̂��Ƃ��c�c�B";
		close;
	}
}

ecl_in04.gat,77,104,5	script	���T	520,{
	switch(ECL_5QUE) {
	case 2:
	case 3:
		mes "[���T]";
		mes "���Ȃ����Ɛl�ł͂Ȃ��Ƃ����́H";
		mes "�c�c�킩������B";
		mes "���͂��Ă���������";
		mes "�������������܂ő҂��āB";
		mes "��ɖ��Ǝ�l�ɘb�𕷂��Ă����āB";
		close;
	case 4:
		mes "[���T]";
		mes "�l�b�N���X�̂��߂�";
		mes "���ł킩�邱�ƂȂ�b���܂��B";
		mes "���Ȃ��̂��Ƃ�";
		mes "�M�p�����킯�ł͂Ȃ����I";
		next;
		menu "�����̑O�ɉ������Ă����̂�����",-;
		mes "[���T]";
		mes "�߂��̂��X��";
		mes "�������ɍs���Ă�����B";
		next;
		mes "[���T]";
		mes "���ɂ������̂͂Ȃ���";
		mes "���̂܂܉ƂɋA���ė������ǁc�c�B";
		mes "���ꂾ����B";
		next;
		switch(select("�Ƃ̑O�œ|��Ă����l�𖳎��������R�𕷂�","�Ƃ̒��ŋC�Â������Ƃɂ��ĕ���")) {
		case 1:
			mes "[���T]";
			mes "�Ƃ̑O�ł��Ȃ����|��Ă���̂�����";
			mes "�ƂĂ���������B";
			mes "�����悤�Ǝv��������";
			mes "�Q�ĂĂ��܂���";
			mes "���ЂƂ�ł͂ǂ����Ă�����";
			mes "�킩��Ȃ������́I";
			next;
			mes "[���T]";
			mes "����ŁA��l�������A���Ă��Ȃ�����";
			mes "�Ƃ̒��ɓ����Ă݂���";
			mes "�������r�炳��Ă��āc�c�B";
			next;
			mes "[���T]";
			mes "�Ƃ̑O�ɂ͓|��Ă���l�I";
			mes "�Ƃ̒��͍r�����I";
			mes "���͋��|�ŋC�����]����";
			mes "�����s�������Ƃ����ł��Ȃ�������I";
			set '@str$,"�l�b�N���X�ȊO�ɖ����Ȃ������̂��Ȃ�������";
			break;
		case 2:
			mes "[���T]";
			mes "�D�_�ɍr�炳�ꂽ������";
			mes "�U�炩���Ă�������";
			mes "�l�b�N���X�ȊO��";
			mes "�Ȃ��Ȃ������͂Ȃ��݂����c�c�B";
			next;
			mes "[���T]";
			mes "�ǂ����Ď��̑�؂�";
			mes "�l�b�N���X���c�c�H";
			mes "���ɗ����Ȃ����̌��ł�";
			mes "�A��čs���΂����̂ɁI";
			next;
			mes "[���T]";
			mes "�c�c�B";
			mes "�c�c�c�c�B";
			mes "���߂�Ȃ����B";
			mes "���֌W�Ȃ��Ȃ���";
			mes "�{���Ă��܂��āc�c�B";
			next;
			mes "[���T]";
			mes "�����ˁc�c�B";
			mes "����ς�A���ɕς�����Ƃ����";
			mes "�Ȃ�������B";
			set '@str$,"�{���ɑ��ɖ����Ȃ������̂��Ȃ�������";
			break;
		}
		next;
		switch(select("�Ɛl�̐S������𕷂�",'@str$)) {
		case 1:
			mes "[���T]";
			mes "�S������ƌ����Ă��c�c�B";
			mes "��l�͂��܂�C�������Ȃ�����";
			mes "�����l�ł͂Ȃ��̂�B";
			mes "���͗��l�ƕʂ��悤�Ɍ����Ă�";
			mes "�����Ȃ����ǁA�D�����q����c�c�B";
			next;
			mes "[���T]";
			mes "���̉Ƃɍ����Ȃ��̂�";
			mes "����킯�ł��Ȃ����c�c�B";
			mes "�B��A������؂ɂ��Ă���";
			mes "�l�b�N���X���c�c�I";
			next;
			mes "[���T]";
			mes "�Ƒ��Ȃ�A�����ǂꂾ��";
			mes "�l�b�N���X��厖�ɂ��Ă�����";
			mes "�킩���Ă���͂��I";
			mes "������A�Ƒ��ȊO�̒N����";
			mes "���񂾂ɈႢ�Ȃ���!!";
			break;
		case 2:
			mes "[���T]";
			mes "�U�炩���Ă��Ă悭�킩��Ȃ������";
			mes "���ɓ����č���悤��";
			mes "���ڂ̂��̂͂Ȃ���B";
			next;
			mes "[���T]";
			mes "���̃l�b�N���X��";
			mes "����قǍ����Ȃ��̂ł͂Ȃ��́B";
			mes "�ł��A���ɂƂ��Ă�";
			mes "�ƂĂ���؂Ȃ��̂Ȃ́c�c�B";
			next;
			mes "[���T]";
			mes "�����ڂ��n������";
			mes "�ǂ����āA���܂ꂽ�̂�����c�c�H";
			mes "�܂������킩��Ȃ���B";
			break;
		}
		next;
		menu "���T�ւ̕������݂��I����",-;
		mes "[���T]";
		mes "���̃l�b�N���X�c�c�B";
		mes "��l�ɔ����Ă������";
		mes "��؂Ȃ��̂Ȃ́c�c�B";
		next;
		mes "�]�Ƒ��ւ̕������݂�";
		mes "�@�Ђƒʂ�s�����B";
		mes "�@��x���𐮗����悤�]";
		set ECL_5QUE,5;
		chgquest 9228,9229;
		setquest 9251;
		close;
	case 5:
		mes "[���T]";
		mes "���̒m���Ă��邱�Ƃ�";
		mes "���b�����܂�����B";
		close;
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[���T]";
		mes "����ȂɎU�炩�����";
		mes "�Еt����̂���ς���I";
		close;
	case 13:
		mes "[���T]";
		mes "�N���C�A���ł����H";
		mes "���Ƃ̌��ۂ�F�߂�����";
		mes "����܂���I";
		close;
	case 14:
		mes "[���T]";
		mes "�o���~������ł����H";
		mes "��l�̗F�l�ł���ˁB";
		close;
	case 15:
		mes "[���T]";
		mes "�X�s�[�h�A�b�v�|�[�V������";
		mes "�����Ă��鏤�l�ł����H";
		mes "�c�c�����s�����X�ł�";
		mes "�����Ă��܂����ˁB";
		close;
	case 16:
	case 17:
		mes "[���T]";
		mes "�l�b�N���X�͌��������̂�����H";
		close;
	case 18:
		mes "[���T]";
		mes "�l�b�N���X�������Ă����";
		mes "���肪�Ƃ��I";
		mes "�܂��̓��[�G���ɘb�������āB";
		close;
	case 19:
		mes "[���T]";
		mes "�l�b�N���X�������Ă����";
		mes "���肪�Ƃ��I";
		mes "�f�C���X���������������������B";
		mes "��l�Ƙb���Ă���Ԃ�";
		mes "���������p�ӂ����B";
		mes "��ł܂����Ă��傤�����B";
		close;
	case 20:
		mes "[���T]";
		mes "�N���C�A���̂��Ƃ͑���ۂ���";
		mes "�D���ɂȂ�Ȃ��āc�c�B";
		mes "����̎����̂��Ƃ�";
		mes "�v�����ʂ肾�������āc�c�B";
		next;
		mes "[���T]";
		mes "����ɁA���ɗ��؂�ꂽ�悤��";
		mes "�C���ɂ��Ȃ��āA�ƂĂ��h��������B";
		next;
		mes "[���T]";
		mes "�c�c�ł��A�N���C�A����";
		mes "�������V�т���߂�";
		mes "�܂��߂ɂȂ�������";
		mes "��������������";
		mes "�b�𕷂��Ă����Ă���΁c�c�B";
		next;
		mes "[���T]";
		mes "����Ȃ��Ƃɂ͂Ȃ�Ȃ���������";
		mes "����Ȃ���";
		mes "�c�c����ȋC������́B";
		next;
		mes "[���T]";
		mes "���Ȃ��ɂ��A�ŏ��ɍ������Ƃ�������";
		mes "���߂�Ȃ����ˁB";
		mes "�����āA�l�b�N���X�������Ă����";
		mes "���肪�Ƃ��B";
		if(checkitemblank() < 3) {
			next;
			mes "[���T]";
			mes "��������悤�Ǝv��������";
			mes "����ȏ㎝�ĂȂ��悤�ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������ĂˁB";
			close;
		}
		set ECL_5QUE,21;
		chgquest 9238,9239;
		getitem 6081,1;
		getitem 607,1;
		getexp 300000,0;
		getexp 0,150000;
		next;
		mes "[���T]";
		mes "�N���C�A�������Ȃ����݂����ˁB";
		mes "���Ȃ��ɂ��炪��������������B";
		mes "��ɍs���Ă����Ȃ����B";
		mes "�c�c������Ƃ����āA";
		mes "���Ƃ̌��ۂ�F�߂�킯�ł�";
		mes "����܂��񂯂ǂˁB";
		close;
	case 21:
		mes "[���T]";
		mes "�l�b�N���X�������Ă����";
		mes "���肪�Ƃ��B";
		close;
	default:
		mes "[���T]";
		mes "�Ƃ̒��ɓD�_������Ȃ��";
		mes "�z�������Ă��Ȃ�������!!";
		close;
	}
}

ecl_in04.gat,80,103,3	script	�N���C�A��#event	442,{
	mes "[�N���C�A��]";
	mes "����͂��������c�c�H";
	close;
OnInit:
	hideonnpc "�N���C�A��#event";
	end;
}

eclage.gat,164,102,3	script	�N���C�A��	442,{
	switch(ECL_5QUE) {
	case 0:
		mes "[�N���C�A��]";
		mes "���[�G���c�c�B";
		mes "���������A�F�߂Ă��炤��B";
		close;
	case 1:
	case 2:
	case 3:
	case 4:
		mes "[�N���C�A��]";
		mes "�ǂ����悤�c�c�B";
		mes "����Ȃ��肶��Ȃ������̂ɁB";
		close;
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�N���C�A��]";
		mes "����l�̃l�b�N���X��";
		mes "�K�����������Ă݂���I";
		close;
	case 13:
		mes "[�N���C�A��]";
		mes "���Ȃ��́c�c�H";
		mes "�����A���[�G���̉Ƃɂ���";
		mes "�l�Ԃł��ˁB";
		next;
		mes "[�N���C�A��]";
		mes "�l�b�N���X�Ȃ�";
		mes "�K�����������Ă݂��܂��I";
		next;
		switch(select("���[�G���̂��Ƃɂ��ĕ���","�l�b�N���X�̂��Ƃ��ǂ��Œm����������")) {
		case 1:
			mes "[�N���C�A��]";
			mes "���[�G���̂��Ƃ�";
			mes "�ƂĂ���؂ɂ��Ă��܂��B";
			mes "����l�Ɍ��ۂ𔽑΂���Ă��܂�����";
			mes "�K���A�F�߂Ă��炤����ł��I";
			next;
			mes "[�N���C�A��]";
			mes "�������ɁA���[�G���Əo���������";
			mes "���͂�����V�т��D����";
			mes "�s�܂��߂Ȓj�Ɍ�������������܂���B";
			next;
			mes "[�N���C�A��]";
			mes "�ł��A���ۂ�F�߂Ă��炤���߂�";
			mes "�ŋ߂͂܂��߂ɂ��Ă��܂��B";
			break;
		case 2:
			mes "[�N���C�A��]";
			mes "��H";
			mes "���[�G���̉Ƃɍs�����Ƃ��ł���B";
			mes "���Ȃ������̏�ɂ����͂��ł��B";
			next;
			mes "[�N���C�A��]";
			mes "�l�b�N���X�̘b�͏o�Ȃ��������āH";
			mes "����Ȃ��Ƃ͂Ȃ��Ǝv���܂����ǁc�c�B";
			next;
			mes "[�N���C�A��]";
			mes "�c�c�ׂ��ȉ�b�̓��e�܂�";
			mes "�o���Ă͂��܂��񂯂ǁA";
			mes "�������ɁA���̎��������͂��ł��B";
			break;
		}
		next;
		menu "�����̑O�ɉ������Ă����̂�����",-;
		mes "[�N���C�A��]";
		mes "�A���o�C�����Ƃ�����ł����H";
		mes "�����ł���B";
		next;
		mes "[�N���C�A��]";
		mes "�����͉Ԃ��炫�n�߂���n��";
		mes "�����X�^�[��|���Ă��܂����B";
		mes "�����^���ɂȂ�܂���";
		mes "�����X�^�[�������č����Ă���";
		mes "�Ƃ���ł������B";
		next;
		mes "[�N���C�A��]";
		mes "�A���Ă���Ƃ���";
		mes "�����l�̗F�l�̃o���~�������܂����B";
		mes "���������΁A";
		mes "�Ȃɂ��}���ł���l�q���������ȁc�c�H";
		next;
		mes "[�N���C�A��]";
		mes "���̌�A���[�G���ɉ���Ǝv����";
		mes "�ޏ��̉Ƃɍs������ł��B";
		mes "�c�c����Ȃ��ƂɂȂ��Ă���";
		mes "�����܂������ǁc�c�B";
		next;
		mes "[�N���C�A��]";
		mes "���������B";
		mes "����̓����X�^�[��|���Ă��鎞��";
		mes "��ɓ��ꂽ�험�i�ł��B";
		mes "�悩������A�ЂƂǂ����B";
		if(checkitemblank() < 3) {
			next;
			mes "[�N���C�A��]";
			mes "�c�c�Ǝv������";
			mes "����ȏ㎝�ĂȂ��݂����ł��ˁB";
			mes "�ו��̎�ސ������炵�Ă���";
			mes "�܂����Ă��������B";
			close;
		}
		getitem 645,1;
		set ECL_5QUE,14;
		chgquest 9231,9232;
		setquest 9259;
		next;
		mes "[�N���C�A��]";
		mes "���̃X�s�[�h�A�b�v�|�[�V������";
		mes "���̃A���o�C���ؖ����Ă���܂��B";
		mes "�c�c����ł����ł��傤�H";
		next;
		mes "�]�O�̂��߁A�N���C�A����";
		mes "�@�A���o�C����������";
		mes "�@�Ԃ��炫�n�߂���n��";
		mes "�@�����X�^�[��|����";
		mes "�@�X�s�[�h�A�b�v�|�[�V������";
		mes "�@����ł��邩�m���߂悤�]";
		next;
		mes "�]�����u���b�c��5�̂�";
		mes "�@�y�^����30�̂قǓ|���΂������낤�]";
		next;
		mes "�]�Ԃ��炫�n�߂���n�ɂ�";
		mes "�@�f�C���X�̗F�l�̃o���~����";
		mes "�@����͂����B";
		mes "�@������������";
		mes "�@�N���C�A���ɂ���";
		mes "�@���������邩������Ȃ��]";
		next;
		mes "�]�����X�^�[�𓢔�������";
		mes "�@�Ԃ��炫�n�߂���n�ɂ���";
		mes "�@�o���~����T���Ęb�������悤�]";
		close;
	case 14:
		mes "[�N���C�A��]";
		mes "���̃X�s�[�h�A�b�v�|�[�V������";
		mes "���̃A���o�C���ؖ����Ă���܂��B";
		next;
		mes "�]�O�̂��߁A�N���C�A����";
		mes "�@�A���o�C����������";
		mes "�@�Ԃ��炫�n�߂���n��";
		mes "�@�����X�^�[��|����";
		mes "�@�X�s�[�h�A�b�v�|�[�V������";
		mes "�@����ł��邩�m���߂悤�]";
		next;
		mes "�]�����u���b�c��5�̂�";
		mes "�@�y�^����30�̂قǓ|���΂������낤�]";
		next;
		mes "�]�Ԃ��炫�n�߂���n�ɂ�";
		mes "�@�f�C���X�̗F�l�̃o���~����";
		mes "�@����͂����B";
		mes "�@������������";
		mes "�@�N���C�A���ɂ���";
		mes "�@���������邩������Ȃ��]";
		next;
		mes "�]�����X�^�[�𓢔�������";
		mes "�@�Ԃ��炫�n�߂���n�ɂ���";
		mes "�@�o���~����T���Ęb�������悤�]";
		close;
	case 15:
	case 16:
		mes "[�N���C�A��]";
		mes "����l�̃l�b�N���X��";
		mes "�K�����������Ă݂���I";
		next;
		mes "�]�Ɛl���킩��܂ł̊Ԃ�";
		mes "�@�l�b�N���X�������������Ƃ�";
		mes "�@�����Ă������]";
		close;
	case 17:
		mes "[�N���C�A��]";
		mes "�����킩��܂������H";
		mes "�����A���Ȃ��������ł��Ȃ��Ă�";
		mes "����l�̃l�b�N���X��";
		mes "�����T���o���܂��I";
		next;
		mes "�]�Ɛl���킩��܂ł̊Ԃ�";
		mes "�@�l�b�N���X�������������Ƃ�";
		mes "�@�����Ă������]";
		close;
	case 18:
	case 19:
	case 20:
		mes "[�N���C�A��]";
		mes "���Ȃ��ɂ͂����f�����������܂����B";
		mes "����͂�����";
		mes "���[�G���̉Ƃɍs���Ȃ���";
		mes "�����̂ł����H";
		close;
	case 21:
		mes "[�N���C�A��]";
		mes "���Ȃ��������Ȃ����";
		mes "�����������܂��������̂Ɂc�c�B";
		next;
		mes "[�N���C�A��]";
		mes "�c�c�Ƃ����͉̂R�ł��B";
		mes "�������ǂꂾ�������Ȃ��Ƃ�";
		mes "�����̂��A�킩���Ă��܂��B";
		next;
		mes "[�N���C�A��]";
		mes "�K���A���[�G���ɂ�";
		mes "����؂��Ȃ��悤�Ȃ̂�";
		mes "���x�����ޏ����K���ɂł���悤";
		mes "����΂����ł��B";
		next;
		mes "[�N���C�A��]";
		mes "���Ȃ��ɂ͂����f�����������܂����B";
		mes "���ƁA�l�b�N���X��";
		mes "�����Ă���������";
		mes "���肪�Ƃ��������܂��B";
		if(checkitemblank() < 3) {
			next;
			mes "[�N���C�A��]";
			mes "��������悤�Ǝv�����̂ł���";
			mes "����ȏ㎝�ĂȂ��悤�ł��ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		set ECL_5QUE,22;
		chgquest 9239,9262;
		getitem 608,1;
		getexp 300000,0;
		getexp 0,150000;
		next;
		mes "[�N���C�A��]";
		mes "���]���Ă��Ƃ͂����A�o���~�������";
		mes "�^���̖ڂ�������悤�Ȃ��Ƃ܂�";
		mes "�����Ă��܂��āA�p���������ł��B";
		mes "�o���~�������";
		mes "���x�N���C�A�������l�тɍs����";
		mes "�`���Ă��������B";
		close;
	case 22:
		mes "[�N���C�A��]";
		mes "���]���Ă��Ƃ͂����A�o���~�������";
		mes "�^���̖ڂ�������悤�Ȃ��Ƃ܂�";
		mes "�����Ă��܂��āA�p������������ł��B";
		mes "�����o���~������̂Ƃ���ɍs������";
		mes "���x�N���C�A�������l�тɍs����";
		mes "�`���Ă��������B";
		close;
	case 23:
		mes "[�N���C�A��]";
		mes "���x�������[�G�����K���ɂł���悤";
		mes "����΂����ł��B";
		close;
	}
}

ecl_fild01.gat,98,299,5	script	�o���~��	461,{
	switch(ECL_5QUE) {
	case 14:
		if(!(checkquest(9259) & 0x4)) {
			mes "[�o���~��]";
			mes "�����p���ˁH";
			mes "���܂Ȃ����A���͂�����ƖZ�����B";
			mes "�����X�^�[������Ă���񂾁B";
			mes "�N�����̓r���̂悤�����ǁc�c�B";
			mes "��肪�I����Ă���";
			mes "������x���Ă���B";
			close;
		}
		mes "�]���̐l�́A�f�C���X�̗F�B��";
		mes "�@�o���~�����ȁH";
		mes "�@���[�G���ƃN���C�A����";
		mes "�@�X�Ō��������ƌ����Ă����]";
		next;
		mes "[�o���~��]";
		mes "����A���Ȃ��́H";
		mes "�c�c�Ȃ�ƁA�f�C���X�̉Ƃ�";
		mes "�����ł��ƁI";
		next;
		menu "�����̑O�ɉ������Ă����̂�����",-;
		mes "[�o���~��]";
		mes "�����͒����炱���ɂ��܂����B";
		mes "�����X�^�[��|����";
		mes "�험�i�������Ɋ������ł��B";
		next;
		mes "[�o���~��]";
		mes "��x�f�C���X������ė���";
		mes "���Ԙb�����܂����B";
		mes "���̎��͓��ɕς�����l�q��";
		mes "�Ȃ������̂ł����c�c�B";
		mes "�ƂɋA���ċ������ł��傤�ˁc�c�B";
		next;
		switch(select("�f�C���X�̉Ƃɍs����������","�N���C�A���Ɖ����������")) {
		case 1:
			mes "[�o���~��]";
			mes "����A���������������ʂ�";
			mes "�����͂����Ƃ����ɂ��܂�����B";
			next;
			mes "�]���������[�G����";
			mes "�@�Ƃ̑O��ʂ�o���~����";
			mes "�@���ڂɌ����ƌ����Ă����͂����B";
			mes "�@���ԈႢ���A����Ƃ��ǂ��炩��";
			mes "�@�R�����Ă���̂��낤���H�]";
			break;
		case 2:
			mes "[�o���~��]";
			mes "�����A�f�C���X������ė����ȊO�ɂ�";
			mes "�N���������Ă��܂���ȁB";
			next;
			mes "�]�N���C�A���͎��̋A���";
			mes "�@�o���~���������ƌ����Ă����B";
			mes "�@�C�Â��Ȃ������������A";
			mes "�@����Ƃ��A�ǂ��炩��";
			mes "�@�R�����Ă���̂��낤���H�]";
			break;
		}
		next;
		mes "�]���̕t�߂ł̎��̐험�i�Ƃ���";
		mes "�@�X�s�[�h�A�b�v�|�[�V������";
		mes "�@����ł�����";
		mes "�@�N���C�A���͌����Ă����]";
		next;
		menu "�X�s�[�h�A�b�v�|�[�V�����ɂ��ĕ���",-;
		mes "[�o���~��]";
		mes "�X�s�[�h�A�b�v�|�[�V�����c�c�H";
		mes "�����̃����X�^�[��";
		mes "����Ȃ��͎̂����ĂȂ����B";
		mes "�N���������܂Ŏ������Ă����Ȃ�";
		mes "�킩�邾�낤�H";
		next;
		mes "[�o���~��]";
		mes "������ɓ����Ƃ�����";
		mes "���l���甃���Ƃ��H";
		mes "�c�c�����ǁA���̂������";
		mes "�X�s�[�h�A�b�v�|�[�V������";
		mes "�����Ă��鏤�l�Ȃ�Ă������ȁH";
		next;
		mes "[�o���~��]";
		mes "�����͂����ɂ��Ă܂������ȁH";
		mes "�Ƃɂ����A�F�l�̂��߂�";
		mes "�K���D�_��߂܂��Ă��������B";
		next;
		mes "�]�o���~���̋��q��";
		mes "�@�N���C�A���̌����Ă������Ƃ�";
		mes "�@�������Ă���]";
		next;
		switch(select("�o���~�����R�����Ă���","�N���C�A�����R�����Ă���")) {
		case 1:
			mes "�]�N���C�A�����������悤��";
			mes "�@���̕t�߂ł̎��̐험�i�Ƃ���";
			mes "�@�X�s�[�h�A�b�v�|�[�V������";
			mes "�@����ł���Ȃ�A�o���~����";
			mes "�@�R�����Ă���Ƃ������ƂɂȂ�]";
			next;
			mes "�]�����A���ۂɃ����X�^�[��|���Ă�";
			mes "�@�X�s�[�h�A�b�v�|�[�V������";
			mes "�@����ł��Ȃ������c�c�]";
			break;
		case 2:
			mes "�]���̂�����̃����X�^�[����";
			mes "�@�X�s�[�h�A�b�v�|�[�V������";
			mes "�@���肷�邱�Ƃ͂ł��Ȃ������]";
			break;
		}
		next;
		mes "�]�X�s�[�h�A�b�v�|�[�V������";
		mes "�@��舵���Ă��鏤�l�����Ȃ���";
		mes "�@�T���Ă݂悤�]";
		set ECL_5QUE,15;
		delquest 9232;
		delquest 9259;
		setquest 9233;
		close;
	case 15:
		mes "[�o���~��]";
		mes "���̂������";
		mes "�X�s�[�h�A�b�v�|�[�V������";
		mes "�����Ă��鏤�l�Ȃ�Ă������ȁc�c�H";
		next;
		mes "�]�X�s�[�h�A�b�v�|�[�V������";
		mes "�@��舵���Ă��鏤�l�����Ȃ���";
		mes "�@�T���Ă݂悤�]";
		close;
	case 16:
	case 17:
		mes "[�o���~��]";
		mes "�F�l�̂��߂ɂ�";
		mes "�����������������Ă��������B";
		close;
	case 18:
	case 19:
	case 20:
		mes "[�o���~��]";
		mes "����A���Ȃ��ł����B";
		mes "�f�C���X�B�̂Ƃ���ɂ��Ȃ���";
		mes "�����̂ł����H";
		close;
	case 21:
		mes "[�o���~��]";
		mes "����A���Ȃ��ł����B";
		mes "�N���C�A���͎Ⴂ�̂�";
		mes "�܂��܂���蒼����ł��傤�B";
		mes "�ނȂ�A�X�ɂ���Ǝv���܂���B";
		close;
	case 22:
		mes "[�o���~��]";
		mes "�l�Ԃ̒T�コ��ł͂���܂��񂩁B";
		mes "�N���C�A���͎Ⴂ�̂�";
		mes "�܂��܂���蒼����ł��傤�B";
		next;
		mes "[�o���~��]";
		mes "�F�l�̖����������Ă����";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "[�o���~��]";
		mes "���������험�i���炢����";
		mes "�����Ă��܂���";
		mes "�󂯎���Ă��������B";
		if(checkitemblank() < 3) {
			next;
			mes "[�o���~��]";
			mes "�c�c�Ǝv�����̂ł���";
			mes "����ȏ㎝�ĂȂ��悤�ł��ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		set ECL_5QUE,23;
		chgquest 9262,201610;
		getitem 6558,20;
		getitem 6081,25;
		getexp 3800000,0;
		getexp 0,1900000;
		next;
		mes "[�o���~��]";
		mes "����ɂ��Ă�";
		mes "�݂��ƂȐ����ł����ȁB";
		mes "���ꂩ��̖`����";
		mes "�K�^������悤��";
		mes "�F���Ă���܂���B";
		close;
	case 23:
		mes "[�o���~��]";
		mes "���ꂩ��̖`����";
		mes "�K�^������悤��";
		mes "�F���Ă���܂���B";
		close;
	default:
		mes "[�o���~��]";
		mes "���܂Ȃ����A���͂�����ƖZ�����B";
		mes "�����X�^�[������Ă���񂾁B";
		close;
	}
}

eclage.gat,222,131,3	script	���Q���l	807,{
	switch(ECL_5QUE) {
	case 15:
		mes "�]�l�Ԃ̏��l���B";
		mes "�@���Ԃ����������ł���̂�";
		mes "�@���������c�c�]";
		next;
		mes "[���Q���l]";
		mes "�₠�A��������Ⴂ�`�B";
		mes "�������i�����ׂ��Ă��`�B";
		next;
		switch(select("�Ԃ����̒j��","�h�����N���̎�r���Ȃ��Ȃ��Ă���")) {
		case 1:
			mes "�]���������΁A���[�G����";
			mes "�@�Ԃ����̐l����������";
			mes "�@�����Ă����c�c�]";
			break;
		case 2:
			mes "�]���������΁A�Ƃ̒���";
			mes "�@��r������������";
			mes "�@�r�炳��Ă����c�c�]";
			break;
		}
		next;
		mes "�]�O�̂���";
		mes "�@�b�𕷂��Ă݂悤�]";
		next;
		mes "[���Q���l]";
		mes "����H�@�������Ă��邩���āH";
		mes "�������`�B";
		mes "���������Ă���񂾂�`�B";
		next;
		mes "[���Q���l]";
		mes "���Ȃ�1��10000Zeny��";
		mes "�X�s�[�h�A�b�v�|�[�V������";
		mes "�����邭����̔����Ă����`�I";
		next;
		mes "[���Q���l]";
		mes "�^���ǂ���΁A1���2��";
		mes "�X�s�[�h�A�b�v�|�[�V������";
		mes "�����邩������Ȃ���`�B";
		next;
		switch(select("�l�i����������","�����������Ă݂�(10,000Zeny)")) {
		case 1:
			mes "[���Q���l]";
			mes "����ς肻�����ȁ`�H";
			mes "���܂ɂ�������Ȃ��񂾂�`�B";
			break;
		case 2:
			mes "�]�X�s�[�h�A�b�v�|�[�V������";
			mes "�@�����ƈ�������ł����悤��";
			mes "�@�C������B";
			mes "�@����ł��A�����������܂����H�]";
			next;
			if(select("����ς��߂�","����ł�����������(10,000Zeny)") == 1) {
				mes "[���Q���l]";
				mes "�����ł����`�B";
				mes "�܂����x���Ă��������ˁ`�B";
				break;
			}
			while(1) {
				mes "[���Q���l]";
				mes "�悵�I";
				mes "�����o�邩�ȁ`�H";
				next;
				if(Zeny < 10000) {
					mes "[���Q���l]";
					mes "����H";
					mes "����������Ȃ��݂������ˁ`�B";
					close;
				}
				if(checkitemblank() < 3) {
					mes "[���Q���l]";
					mes "����H";
					mes "����ȏ㎝�ĂȂ��݂������ˁ`�B";
					mes "�A�C�e���̎�ސ������炵�Ă���";
					mes "�܂����Ăˁ`�B";
					close;
				}
				set '@rand,rand(1,2);
				misceffect 9,"";
				set Zeny,Zeny -10000;
				getitem 645,'@rand;
				mes "[���Q���l]";
				mes "���ʂ́c�c";
				mes "^006400�X�s�[�h�A�b�v�|�[�V����^000000" +'@rand+ "�ł��`�B";
				mes "1���" +'@rand+ "�o�܂����ˁB";
				next;
				mes "[���Q���l]";
				mes "������x�A����Ă݂Ȃ������H";
				mes "���x�͂����Ƃ������̂�";
				mes "�o�邩������Ȃ���`�B";
				next;
				if(select("���������Ȃ�","����1�񂭂��������Ă݂�(10,000Zeny)") == 1) {
					mes "[���Q���l]";
					mes "�����ł����`�B";
					mes "�܂����x���Ă��������ˁ`�B";
					break;
				}
			}
		}
		next;
		mes "[���Q���l]";
		mes "���c�c�ޓ������H";
		mes "�Ⴄ��A���̂����̓��t�B�l����";
		mes "�������񂾂�`�B";
		next;
		mes "�]���̏��l����";
		mes "�@�X�s�[�h�A�b�v�|�[�V������";
		mes "�@����ł���悤���]";
		next;
		mes "�]���ꂾ���킩��΂������낤�B";
		mes "�@���[�G���̂Ƃ���ɖ߂낤�]";
		set ECL_5QUE,16;
		delquest 9233;
		setquest 9234;
		setquest 9260;
		close;
	case 16:
	case 17:
		mes "[���Q���l]";
		mes "������x�A�����������Ă݂邩���H";
		next;
		mes "�]���̏��l����";
		mes "�@�X�s�[�h�A�b�v�|�[�V������";
		mes "�@����ł���悤���]";
		next;
		mes "�]���ꂾ���킩��΂������낤�B";
		mes "�@���[�G���̂Ƃ���ɖ߂낤�]";
		close;
	case 18:
		mes "[���Q���l]";
		mes "����`�B";
		mes "�Ȃ��Ȃ������Ȑ����������ˁ`�B";
		mes "���̉Ƃ̐l������";
		mes "����ň��S���ˁ`�B";
		close;
	default:
		mes "[���Q���l]";
		mes "���[��A�������~�����B";
		mes "���݂�����`�B";
		close;
	}
}

ecl_in04.gat,85,104,3	script	�|�s	81,{
	switch(ECL_5QUE) {
	case 6:
		mes "�]���̌��́A�����������Ԃ�";
		mes "�@�Ƃɂ����͂����]";
		next;
		switch(select("���̌����Ɛl�Ƃ������Ƃ����蓾��","���̌����Ɛl��ڌ����Ă��邩������Ȃ�")) {
		case 1:
			mes "�]�悭������ꂽ���ł�";
			mes "�@���ɂ͉Ƃ��U�炩�����Ƃ�����";
			mes "�@�Ȃ��Ƃ͂����Ȃ��B";
			mes "�@���łɃl�b�N���X��";
			mes "�@�ǂ����Ɏ����čs������������Ȃ��]";
			next;
			mes "�]�c�c������Ƃ�����";
			mes "�@�����𕷂��Ă���Ă����l�Ԃ�";
			mes "�@�C�Â��ꂸ�ɍ��|�����邱�Ƃ�";
			mes "�@�ł��邾�낤���H�]";
			next;
			mes "�]�������ɁA�������";
			mes "�@����������悤�ȋC������]";
			next;
			mes "�]�Ɛl��ڌ����Ă���\���Ȃ�";
			mes "�@�\���ɂ��肻�������ǁc�c�]";
			next;
		case 2:
			break;
		}
		mes "�]���̌����Ɛl��ڌ����Ă����Ƃ���";
		mes "�@�Ɛl�̎�|����𕷂��Ă�";
		mes "�@�����Ă����킯�ł��Ȃ����c�c�]";
		next;
		if(select("�����ώ@���Ă݂�","��߂�") == 2) {
			mes "�]���ɂ��i���������Ă��������B";
			mes "�@��ł܂��ώ@���悤�]";
			close;
		}
		mes "[�|�s]";
		mes "�E�E�E�E�c�c��������!!";
		mes "�O�������I";
		next;
		mes "�]�낤�����݂����Ƃ��낾�����B";
		mes "�@�l���m�肷�錢�Ȃ̂�������Ȃ��]";
		next;
		mes "�]���ꂾ�����C�Ȍ��Ȃ�";
		mes "�@�Ɛl��ڌ����Ă�����";
		mes "�@�i������������";
		mes "�@�������Ȃ��̂����ǁc�c�H�]";
		next;
		switch(select("�Ɛl�͌�����Ȃ�����̂���肢�H","�Ɛl�͕��i����Ƃɂ悭����l���H")) {
		case 1:
			mes "�]�Ɛl�͌�����Ȃ�����̂�";
			mes "�@��肢�l�����A";
			mes "�@���i���炱�̉Ƃɂ悭����l��";
			mes "�@�Ƃ����\��������]";
			break;
		case 2:
			mes "�]�Ɛl�͕��i���炱�̉Ƃ�";
			mes "�@�悭����l�����A";
			mes "�@������Ȃ�����̂���肢�l��";
			mes "�@�Ƃ����\��������]";
			break;
		}
		next;
		mes "�]�Ƃ͂����A����I�ȏ؋��ł͂Ȃ��B";
		mes "�@���͖{�I�𒲂ׂĂ݂悤�]";
		set ECL_5QUE,7;
		setquest 9252;
		close;
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "�]���ꂾ�����C�Ȍ��Ȃ�";
		mes "�@�Ɛl��ڌ����Ă�����";
		mes "�@�i������������";
		mes "�@�������Ȃ��̂����ǁc�c�H�]";
		next;
		mes "�]�Ɛl�͌�����Ȃ�����̂�";
		mes "�@��肢�l�����A";
		mes "�@���i���炱�̉Ƃɂ悭����l��";
		mes "�@�Ƃ����\��������]";
		close;
	default:
		if(ECL_5QUE >= 18) {
			mes "[�|�s]";
			mes "�����`�I";
			close;
		}
		mes "[�|�s]";
		mes "�E�E�E�E�c�c��������!!";
		mes "�O�����I";
		close;
	}
}

ecl_in04.gat,80,112,3	script	�r�炳�ꂽ�{�I	111,{
	if(ECL_5QUE >= 18)
		end;
	switch(ECL_5QUE) {
	case 6:
		mes "�]�I�̖{���|�ꂽ��";
		mes "�@�{�����ɗ������肵�Ă���]";
		next;
		mes "�]�܂��͌����ώ@���Ă݂悤�]";
		break;
	case 7:
		mes "�]�I�̖{���|�ꂽ��";
		mes "�@�{�����ɗ������肵�Ă���]";
		next;
		if(select("���ׂĂ݂�","��߂�") == 2) {
			mes "�]��ł܂����ׂĂ݂悤�]";
			close;
		}
		mes "�]�����̖{�c�c�Ȋw�̖{�c�c";
		mes "�@�����c�c�]";
		next;
		mes "�]�T����l�̃��t�B�l�c�c";
		mes "�@����͂�������̂��ȁH�]";
		next;
		mes "�]���L���c�c";
		mes "�@�������͖�����̂��̂��c�c�]";
		next;
		mes "�]�l�̓��L��������̂�";
		mes "�@�����C�������邯��";
		mes "�@���������̎�|���肪";
		mes "�@���邩������Ȃ��B";
		mes "�@�c�c����A����́H�]";
		next;
		mes "�]���ꂳ�񂪔ނƂ̌��ۂ�";
		mes "�@�F�߂Ă���Ȃ��B";
		mes "�@�ނ����ꂳ��ɐM�������";
		mes "�@�悢���@�͂Ȃ����ȁc�c�]";
		next;
		switch(select("���[�G���͔Y�݂�����Ă����H","���[�G���͕�e�ɔ����������Ă����H")) {
		case 1:
			mes "�]�c�c���[�G����";
			mes "�@����ȔY�݂�����Ă����̂��]";
			break;
		case 2:
			mes "�]���l�̂��Ƃ�";
			mes "�@���[�G���ƕ�e�Ƃ̊Ԃ�";
			mes "�@�Η����������̂�������Ȃ��]";
			break;
		}
		next;
		mes "�]�l�b�N���X�̌��ɂ�";
		mes "�@�֌W�Ȃ���������Ȃ������";
		mes "�@�O�̂��߁A�o���Ă������B";
		mes "�@���͔j��ꂽ�{�𒲂ׂĂ݂悤�]";
		set ECL_5QUE,8;
		setquest 9253;
		close;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "�]���[�G���́A���l�Ƃ̌��ۂ�";
		mes "�@��e�ɔF�߂Ă��炦�Ȃ������悤���]";
		next;
		mes "�]�l�b�N���X�̌��ɂ�";
		mes "�@�֌W�Ȃ���������Ȃ������";
		mes "�@�O�̂��߁A�o���Ă������]";
		close;
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mes "�]���[�G���́A���l�Ƃ̌��ۂ�";
		mes "�@��e�ɔF�߂Ă��炦�Ȃ������悤���]";
		close;
	default:
		mes "�]�I�̖{���|�ꂽ��";
		mes "�@�{�����ɗ������肵�Ă���]";
		close;
	}
}

ecl_in04.gat,78,111,3	script	�j��ꂽ�{	111,{
	if(ECL_5QUE >= 18)
		end;
	mes "�]���̏�̖{��";
	mes "�@�r���r���Ɉ����􂩂�Ă���]";
	switch(ECL_5QUE) {
	case 6:
		next;
		mes "�]�܂��͌����ώ@���Ă݂悤�]";
		break;
	case 7:
		next;
		mes "�]��ɖ{�I�𒲂ׂĂ݂悤�]";
		break;
	case 8:
		next;
		if(select("���ׂĂ݂�","��߂�") == 2) {
			mes "�]��ł܂����ׂĂ݂悤�]";
			close;
		}
		mes "�]��y�������낤���c�c�H";
		mes "�@���ɉ��l�̂���悤��";
		mes "�@�󏭖{�Ƃ����킯�ł͂Ȃ��������]";
		next;
		mes "�]�j�������������";
		mes "�@�����Ԃ������Ƃ������";
		mes "�@�l�דI�Ɉ����􂩂ꂽ�悤��";
		mes "�@������]";
		next;
		mes "�]�킴�킴�{��j�闝�R�Ƃ́c�c�H�]";
		next;
		switch(select("�D�_���������悤�Ɏv�킹���������H","�l�b�N���X���ړI�ƋC�Â���Ȃ��悤�ɁH")) {
		case 1:
			mes "�]�����ɂ��D�_���N������";
			mes "�@�Ƃ��r�炵���悤�Ɍ����邯��";
			mes "�@����͔Ɛl�̐��̂��B�����߂�";
			mes "�@�U���H�삩������Ȃ��]";
			break;
		case 2:
			mes "�]�����ɂ����ڂ̂��̂Ȃ�";
			mes "�@�Ȃ�ł���������T��������悤��";
			mes "�@�����邯���";
			mes "�@�l�b�N���X��_���Ă�����";
			mes "�@�v���Ȃ����߂�";
			mes "�@�U���H�삩������Ȃ��]";
			break;
		}
		next;
		mes "�]�����A�������Ƃ�����";
		mes "�@�Ɛl�͉Ƒ����A�Ƒ��Ɛg�߂�";
		mes "�@�l���Ƃ����\��������]";
		next;
		mes "�]�c�c����A�܂����̏؋����Ȃ��B";
		mes "�@�v�����݂͊ԈႢ�̂��Ƃ��B";
		mes "�@�ł��A�\���̈�Ƃ���";
		mes "�@���̂��Ƃ͐S�ɗ��߂Ă������B";
		mes "�@���̓h�����N���𒲂ׂĂ݂悤�]";
		set ECL_5QUE,9;
		setquest 9254;
		close;
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mes "�]���̏�̖{�͐l�דI��";
		mes "�@�����􂩂ꂽ�悤�Ɍ�����]";
		next;
		mes "�]�����ɂ��D�_���N������";
		mes "�@�Ƃ��r�炵���悤�Ɍ����邯��";
		mes "�@����͔Ɛl�̋U���H�삩������Ȃ��]";
		close;
	}
	close;
}

ecl_in04.gat,83,111,3	script	�h�����N��	111,{
	if(ECL_5QUE >= 18)
		end;
	switch(ECL_5QUE) {
	case 6:
		mes "�]���ݕ��̕r�������Ă���";
		mes "�@�������U�炩���Ă���悤���]";
		next;
		mes "�]�܂��͌����ώ@���Ă݂悤�]";
		close;
	case 7:
		mes "�]���ݕ��̕r�������Ă���";
		mes "�@�������U�炩���Ă���悤���]";
		next;
		mes "�]��ɖ{�I�𒲂ׂĂ݂悤�]";
		close;
	case 8:
		mes "�]���ݕ��̕r�������Ă���";
		mes "�@�������U�炩���Ă���悤���]";
		next;
		mes "�]��Ɋ��̏�̖{�𒲂ׂĂ݂悤�]";
		close;
	case 9:
		mes "�]���ݕ��̕r�������Ă���";
		mes "�@�������U�炩���Ă���悤���]";
		next;
		if(select("���ׂĂ݂�","��߂�") == 2) {
			mes "�]��ł܂����ׂĂ݂悤�]";
			close;
		}
		mes "�]���̈��ݕ��͉����낤�H�]";
		next;
		mes "[�f�C���X]";
		mes "�����A����͂����ł��B";
		mes "���t�B�l���̂����Ƃ��Ă�";
		mes "��ʓI�Ȃ��̂ł��B";
		mes "�����i����Ȃ��ł���B";
		next;
		mes "[�f�C���X]";
		mes "�܂�15�{�ق�";
		mes "���ɂ������Ǝv���܂��B";
		next;
		mes "�]�O�̂��߁A�����Ă݂��";
		mes "�@�����̕r��13�{�������]";
		next;
		switch(select("�Ɛl�����񂾁H","�f�C���X�̋L���Ⴂ�H","�r�͕���ɂ��Ȃ�H")) {
		case 1:
			mes "�]�����ł��Ȃ������𓐂ނȂ��";
			mes "�@�Ɛl�͂������D���Ȃ̂��낤���H�]";
			next;
			mes "�]�r�������ē�����͖̂ڗ�����";
			mes "�@���񂾂����Ŏ����ɍs��������";
			mes "�@�ǂ������ȋC�����邯��ǁc�c�]";
			break;
		case 2:
			mes "�]���ꂾ��������������";
			mes "�@���m�Ȗ{�����o���Ă��Ȃ��Ă�";
			mes "�@���������͂Ȃ��]";
			next;
			mes "�]�킴�킴�R�����悤�Ȃ��ƂƂ�";
			mes "�@�v���Ȃ������";
			mes "�@�f�C���X�̋L���Ⴂ��������Ȃ��]";
			break;
		case 3:
			mes "�]���̕r�Ől����������";
			mes "�@����ꂽ����";
			mes "�@�����ł͍ς܂Ȃ����낤�]";
			next;
			mes "�]�r�̕�������Ă��܂�����";
			mes "�@����Ȃ����c�c�ǂ����";
			mes "�@�j�ЂȂǂ͌�������Ȃ��悤���B";
			mes "�@����Ƃ��Ďg�p���ꂽ���ǂ�����";
			mes "�@�킩��Ȃ��]";
			break;
		}
		next;
		mes "�]�Ƃ������A�h�����N����";
		mes "�@�r���U�炩���Ă��邱�Ƃ�";
		mes "�@�O�̂��߂Ɋo���Ă������]";
		next;
		mes "�]���̓e�[�u���𒲂ׂĂ݂悤�]";
		set ECL_5QUE,10;
		setquest 9255;
		close;
	case 10:
	case 11:
	case 12:
		mes "�]�����̕r�������Ă���";
		mes "�@�������U�炩���Ă���悤���]";
		next;
		mes "�]�Ɛl���r�𓐂񂾂̂�";
		mes "�@����Ƃ��A�[���Ӗ��ȂǂȂ��̂��H�]";
		close;
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mes "�]�����̕r�������Ă���";
		mes "�@�������U�炩���Ă���悤���]";
		close;
	default:
		mes "�]���ݕ��̓������r�������Ă���";
		mes "�@�������U�炩���Ă���悤���]";
		close;
	}
}

ecl_in04.gat,76,107,3	script	�r�炳�ꂽ�e�[�u��	111,{
	if(ECL_5QUE >= 18)
		end;
	mes "�]�e�[�u���̏���r�炳��Ă���]";
	switch(ECL_5QUE) {
	case 6:
		next;
		mes "�]�܂��͌����ώ@���Ă݂悤�]";
		break;
	case 7:
		next;
		mes "�]��ɖ{�I�𒲂ׂĂ݂悤�]";
		break;
	case 8:
		next;
		mes "�]��Ɋ��̏�̖{�𒲂ׂĂ݂悤�]";
		break;
	case 9:
		next;
		mes "�]��Ƀh�����N���𒲂ׂĂ݂悤�]";
		break;
	case 10:
		next;
		if(select("���ׂĂ݂�","��߂�") == 2) {
			mes "�]��ł܂����ׂĂ݂悤�]";
			close;
		}
		mes "�]�U�炩�����e�[�u���̏��";
		mes "�@�ώ@����ƁA�Y��ȏ������������]";
		next;
		mes "[���T]";
		mes "����͕�Δ�����B";
		mes "���܂ꂽ�l�b�N���X��";
		mes "���̒��ɓ���Ă������́B";
		next;
		mes "[���T]";
		mes "����������Ȃ��̂���Ȃ�����";
		mes "��Δ��Ƃ��ẮA��������B";
		mes "�l�b�N���X�Ɠ������炢�ɂ�";
		mes "���l������񂶂�Ȃ�������H";
		next;
		mes "�]�Ȃ��A�Ɛl�̓l�b�N���X��";
		mes "�@���񂾂Ƃ��A��Δ�����";
		mes "�@�����Ă����Ȃ������̂��낤�H�]";
		next;
		mes "�]���ڂ̂��̂��~�����̂Ȃ�";
		mes "�@�l�b�N���X�����łȂ�";
		mes "�@��Δ��������Ă����͂����]";
		next;
		mes "�]�l�b�N���X���̂�";
		mes "�@����قǍ����Ȃ��̂ł͂Ȃ��]";
		next;
		menu "�Ɛl�̖ړI�͂����ł͂Ȃ��H",-,"�l�b�N���X�̎�����ɑ΂��郁�b�Z�[�W�H",-;
		mes "�]���T����؂ɂ��Ă����Ƃ���";
		mes "�@�l�b�N���X�c�c�]";
		next;
		mes "�]����𓐂ނ��Ƃ�";
		mes "�@�ǂ�ȈӖ�������̂��낤�c�c�H�]";
		next;
		mes "�]���͌��̎��W����";
		mes "�@���ׂĂ݂悤�]";
		set ECL_5QUE,11;
		setquest 9256;
		close;
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mes "�]�e�[�u���̏�ɂ�";
		mes "�@�l�b�N���X�����Ă���";
		mes "�@��Δ����c���Ă���]";
		next;
		mes "�]��Δ������l������悤����";
		mes "�@�Ȃ����ɓ����Ă����l�b�N���X������";
		mes "�@���܂ꂽ�̂��낤�H�]";
		close;
	}
	close;
}

ecl_in04.gat,80,105,3	script	���̎��W��	557,{
	if(ECL_5QUE >= 18)
		end;
	switch(ECL_5QUE) {
	case 6:
		mes "�]���̎��W�����낤���H";
		mes "�@�G���ȕ����d�˂��Ă���]";
		next;
		mes "�]�܂��͌����ώ@���Ă݂悤�]";
		close;
	case 7:
		mes "�]���̎��W�����낤���H";
		mes "�@�G���ȕ����d�˂��Ă���]";
		next;
		mes "�]��ɖ{�I�𒲂ׂĂ݂悤�]";
		close;
	case 8:
		mes "�]���̎��W�����낤���H";
		mes "�@�G���ȕ����d�˂��Ă���]";
		next;
		mes "�]��Ɋ��̏�̖{�𒲂ׂĂ݂悤�]";
		close;
	case 9:
		mes "�]���̎��W�����낤���H";
		mes "�@�G���ȕ����d�˂��Ă���]";
		next;
		mes "�]��Ƀh�����N���𒲂ׂĂ݂悤�]";
		close;
	case 10:
		mes "�]���̎��W�����낤���H";
		mes "�@�G���ȕ����d�˂��Ă���]";
		next;
		mes "�]��ɍr�炳�ꂽ�e�[�u����";
		mes "�@���ׂĂ݂悤�]";
		close;
	case 11:
		mes "�]���̎��W�����낤���H";
		mes "�@�G���ȕ����d�˂��Ă���B";
		mes "�@���������̎�|���肪";
		mes "�@���邾�낤���H�]";
		next;
		if(select("���ׂĂ݂�","��߂�") == 2) {
			mes "�]��ł܂����ׂĂ݂悤�]";
			close;
		}
		mes "�]�T���_���A��K�A�o�P�c�c�c";
		mes "�@�K���N�^�̂悤�Ȃ��̂�";
		mes "�@�ςݏd�Ȃ��Ă���]";
		next;
		mes "�]�c�c����H";
		mes "�@����́c�c�]";
		next;
		mes "�]�܂����A���܂ꂽ�͂���";
		mes "�@�l�b�N���X�H�]";
		next;
		mes "�]�ǂ����Ă���ȂƂ���ɁH";
		mes "�@�܂����A�����^�Ɛl�Ȃ̂��H�]";
		next;
		menu "�Ɛl�͌��ł͂Ȃ�",-,"�܂����ׂ邱�Ƃ�����",-;
		mes "�]����A�������P�����̂�";
		mes "�@���̑����������Ƃ͎v���Ȃ��B";
		mes "�@����ɁA�j��ꂽ�{�̗􂯖ڂ�";
		mes "�@�l�דI�Ȃ��̂������]";
		next;
		mes "�]������������A�l�b�N���X��";
		mes "�@�����ɉB�����̂͌���������Ȃ��B";
		mes "�@�ł��A�Ƃ��r�炵���l����";
		mes "�@���ɂ���͂����]";
		next;
		mes "�]�߂��ɔƐl�����邩������Ȃ��̂�";
		mes "�@�l�b�N���X�����������Ƃ�";
		mes "�@�Ɛl���킩��܂ł̊Ԃ�";
		mes "�@�����Ă������]";
		next;
		mes "�]�Ƃ̒��͂Ђƒʂ蒲�ׂ��B";
		mes "�@��x���[�G���Ƙb���Ă݂悤�]";
		set ECL_5QUE,12;
		setquest 9257;
		close;
	case 12:
		mes "�]������������A�l�b�N���X��";
		mes "�@�����ɉB�����̂͌���������Ȃ��B";
		mes "�@�ł��A�Ƃ��r�炵���l����";
		mes "�@���ɂ���͂����]";
		next;
		mes "�]�Ƃ̒��͂Ђƒʂ蒲�ׂ��B";
		mes "�@��x���[�G���Ƙb���Ă݂悤�]";
		close;
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mes "�]������������A�l�b�N���X��";
		mes "�@�����ɉB�����̂͌���������Ȃ��B";
		mes "�@�ł��A�Ƃ��r�炵���l����";
		mes "�@���ɂ���͂����]";
		next;
		mes "�]�����Ƀl�b�N���X�����邱�Ƃ�";
		mes "�@�Ɛl���킩��܂ł̊Ԃ�";
		mes "�@�����Ă������]";
		close;
	default:
		mes "�]���̎��W�����낤���H";
		mes "�@�G���ȕ����d�˂��Ă���]";
		close;
	}
}

ecl_in04.gat,209,200,3	script	���Q���l	807,{
	if(ECL_5QUE >= 18) {
		mes "[���Q���l]";
		mes "���`��c�c�B";
		mes "�܂����A���̏��i���A���o�C��";
		mes "���p����Ă���Ƃ͂ˁ`�B";
		close;
	}
	mes "[���Q���l]";
	mes "�}�ɌĂ΂ꂽ����";
	mes "�����n�܂�̂��ȁ`�H";
	close;
}

ecl_in04.gat,203,199,5	script	�o���~��	461,{
	if(ECL_5QUE >= 18) {
		mes "[�o���~��]";
		mes "�Ȃ�قǁA�����������Ƃ������̂��B";
		mes "�����������ėǂ������B";
		next;
		mes "[�o���~��]";
		mes "�Ȃ��Ȃ������Ȑ����ł����B";
		mes "�A��O�ɉԂ��炫�n�߂���n��";
		mes "���Ă��������B";
		close;
	}
	mes "[�o���~��]";
	mes "�ӂށc�c�B";
	mes "�����̂��Ƃŉ����킩�����̂��ȁH";
	close;
}

ecl_in04.gat,205,198,5	script	�N���C�A��	442,{
	if(ECL_5QUE >= 18) {
		mes "[�N���C�A��]";
		mes "���[�G���͈�������܂���B";
		mes "���ׂĎ��������̂ł��c�c�B";
		next;
		mes "[�N���C�A��]";
		mes "�c�c��ŁA���̂Ƃ����";
		mes "���Ă��������B";
		mes "�O�ɉ�����ꏊ�ő҂��Ă��܂��B";
		close;
	}
	mes "[�N���C�A��]";
	mes "����l�̃l�b�N���X��";
	mes "���������Ă݂��܂��I";
	close;
}

ecl_in04.gat,210,197,3	script	���T	520,{
	if(ECL_5QUE >= 18) {
		mes "[���T]";
		mes "�܂����c�c�B";
		mes "����Ȃ��Ƃ��āc�c�B";
		close;
	}
	mes "[���T]";
	mes "���̃l�b�N���X�͌��������́H";
	mes "���������Ă��傤�����I";
	close;
}

ecl_in04.gat,203,196,5	script	�f�C���X	447,{
	if(ECL_5QUE >= 18) {
		mes "[�f�C���X]";
		mes "���[��A�܂�������Ȃ��ƂŁc�c�B";
		mes "�Ȃ�ɂ���A�������Ă�������";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "[�f�C���X]";
		mes "��ł�������܂��̂�";
		mes "�������o����";
		mes "�Ƒ��ɘb�������Ă��������B";
		close;
	}
	mes "[�f�C���X]";
	mes "�����A�����������������Ă��������B";
	close;
}

ecl_in04.gat,208,194,3	script	���[�G��	437,{
	if(ECL_5QUE != 17) {
		mes "[���[�G��]";
		mes "�F�X�Ƃ��肪�Ƃ��������܂����B";
		mes "��͎��ƃN���C�A����";
		mes "���Ƃ����܂��B";
		next;
		if(select("��������o��","�������������ɂ���") == 2) {
			mes "[���[�G��]";
			mes "�O�ɏo�鎞��";
			mes "���������Ă��������B";
			close;
		}
		mes "�]��������o�܂��]";
		close2;
		warp "ecl_in04.gat",77,107;
		end;
	}
	mes "[���[�G��]";
	mes "�ǂ����܂����H";
	next;
	switch(select("��������","���������l����","��������O�ɏo��")) {
	case 1:
		break;
	case 2:
		mes "�]�l�����܂Ƃ܂�����";
		mes "�@������x���[�G����";
		mes "�@�b�������悤�]";
		close;
	case 3:
		mes "�]��������o�܂��]";
		close2;
		warp "ecl_in04.gat",77,107;
		end;
	}
	mes "�]����̎����B";
	mes "�@�Ƃ̒��ŕ���������";
	mes "�@���̗l�q�����悤�Ƃ�����";
	mes "�@�w�ォ��Ռ����󂯂�";
	mes "�@���|������ꂽ�]";
	next;
	mes "�]�C���t���ƁA�Z�l�ɉ������Ă���";
	mes "�@�Ƃ̒��͍r�炳��";
	mes "�@�����񂪑厖�ɂ��Ă���";
	mes "�@�l�b�N���X�������Ȃ��Ă����]";
	next;
	mes "�]�����Ɋ֌W����l����6���B";
	mes "�@���̉Ƃ̎�l�f�C���X";
	mes "�@�Ȃ̃��T";
	mes "�@���̃��[�G��";
	mes "�@�f�C���X�̗F�l�o���~��";
	mes "�@���[�G���̗��l�N���C�A��";
	mes "�@�Ԃ����̕��Q���l�]";
	next;
	mes "�]�܂��A�Ɛl�̖ړI����";
	mes "�@�������Ă݂悤�]";
	while(1) {
		next;
		switch('@succsess) {
		case 0:
			switch(select("���ڂ̂��̂��~��������","���T�̃l�b�N���X���ړ��Ă�����")) {
			case 1:
				mes "�]�Ɛl�͋��ڂ̂��̂��~������";
				mes "�@�ƂɐN�����A���T�̃l�b�N���X��";
				mes "�@���񂾁]";
				next;
				mes "�]�c�c�ł��A�l�b�N���X�Ɠ������炢";
				mes "�@���l�̂�������Δ���";
				mes "�@���܂�Ă��Ȃ������B";
				mes "�@���ڂ̂��̂��ړ��ĂȂ�";
				mes "�@�킴�킴��Δ�����l�b�N���X����";
				mes "�@�������̂͂��������]";
				next;
				mes "�]������x�l���Ă݂悤�]";
				continue;
			case 2:
				mes "�]�Ɛl�͋��ڂ̂��̂Ȃ�";
				mes "�@�Ȃ�ł������Ƃ����킯�ł͂Ȃ�";
				mes "�@���T�̃l�b�N���X��";
				mes "�@���ݏo���K�v���������]";
				next;
				mes "�]�Ƃ̒��̖{�������􂩂�Ă�����";
				mes "�@��Δ������܂�Ă��Ȃ��������Ƃ�";
				mes "�@�l���Ă��A�킴�킴";
				mes "�@�D�_���������悤�Ɍ�����";
				mes "�@�{���̖ړI���U�����Ă����]";
				next;
				mes "�]�������A���ۂɂ�";
				mes "�@�l�b�N���X�͌��̎��W���̒���";
				mes "�@���ꍞ��ł����]";
				set '@succsess,'@succsess + 1;
				continue;
			}
		case 1:
			switch(select("�l�b�N���X�𓐂ލۂɃg���u����������","���͌����Ɛl������")) {
			case 1:
				mes "�]�Ɛl����Δ�����l�b�N���X��";
				mes "�@���o��������";
				mes "�@���炩�̃g���u����������";
				mes "�@���݂Ɏ��s�����̂�������Ȃ��]";
				break;
			case 2:
				mes "�]�l�b�N���X���B�����̂�";
				mes "�@����������Ȃ���";
				mes "�@��Δ�����l�b�N���X��";
				mes "�@���ݏo�����l��������͂����]";
				break;
			}
			next;
			mes "�]�ȏ�̏�񂩂�";
			mes "�@�Ɛl�ɂ���";
			mes "�@�����ł��邱�Ƃ́H�]";
			set '@succsess,'@succsess + 1;
			continue;
		case 2:
			switch(select("�Ɛl�͂��̉Ƃ̉Ƒ������̒m�l","�Ɛl�̓��T�ɍ��݂�����")) {
			case 1:
				mes "�]�D�_���������悤��";
				mes "�@�U������Ƃ������Ƃ�";
				mes "�@�Ɛl�ɂ͕ʂ̖ړI����������";
				mes "�@�����ł���]";
				next;
				mes "�]�Ƃ������Ƃ�";
				break;
			case 2:
				mes "�]���T�̑厖�ɂ��Ă���";
				mes "�@�l�b�N���X���_��ꂽ�Ƃ������Ƃ�";
				mes "�@�Ɛl�����T�ɍ��݂������Ă���";
				mes "�@�\��������]";
				next;
				mes "�]�������A�ʂ̗��R�Ńl�b�N���X��";
				mes "�@�K�v�ƔƐl���l�����\����";
				mes "�@�ے�ł��Ȃ��]";
				next;
				mes "�]������ɂ��Ă�";
				break;
			}
			mes "�@�l�b�N���X�̎�����ł��郍�T��";
			mes "�@���̉Ƒ��ɉ��炩�̌`��";
			mes "�@�֘A���Ă���l����";
			mes "�@�����ɐ[����������Ă���";
			mes "�@�\���������]";
			next;
			mes "�]�܂�c�c";
			mes "�@�Ɛl�́A���̒��ɂ���]";
			next;
			mes "�]���́A����6�l�ɂ���";
			mes "�@�������Ă݂悤�]";
			next;
			mes "�]6�l�ɘb�𕷂����Ƃ�";
			mes "�@�݂��ɖ����������q�����Ă���";
			mes "�@�l��������]";
			set '@succsess,'@succsess + 1;
			continue;
		case 3:
			switch(select("�f�C���X�ƃ��T","���[�G���ƕ��Q���l","�o���~���ƃN���C�A��")) {
			case 1:
				mes "�]�f�C���X�̓��T���Ɛl����";
				mes "�@�^���Ă����B";
				mes "�@����ŁA���T�͉Ƒ��ȊO�̒N����";
				mes "�@�Ɛl�ɈႢ�Ȃ��ƌ����Ă����]";
				next;
				mes "�]�Ƃ͂����A�����2�l�Ƃ�";
				mes "�@�m���ȏ؋����Ȃ�";
				mes "�@�����Ō����Ă����������]";
				next;
				mes "�]������x�l���Ă݂悤�]";
				continue;
			case 2:
				mes "�]���[�G���͐Ԃ��ĒZ�����̐l����";
				mes "�@���������ƌ����Ă����B";
				mes "�@���Q���l�̓��[�G���̂��Ƃ�";
				mes "�@�����悤�ȗl�q�͂Ȃ��������c�c�]";
				next;
				mes "�]����́A�P���Ƀ��[�G����";
				mes "�@����I�ɕ��Q���l��";
				mes "�@��������������������Ȃ���";
				mes "�@������������";
				mes "�@�ʂ̐l���������̂�������Ȃ��]";
				next;
				mes "�]������x�l���Ă݂悤�]";
				continue;
			case 3:
				mes "�]�o���~���͉Ԃ��炫�n�߂���n��";
				mes "�@�����X�^�[����";
				mes "�@�X�s�[�h�A�b�v�|�[�V������";
				mes "�@�����Ȃ��ƌ����Ă�����";
				mes "�@�N���C�A����";
				mes "�@�X�s�[�h�A�b�v�|�[�V������";
				mes "�@���肵�Ă����]";
				next;
				mes "�]����2�l�̋��q�͖������Ă���B";
				mes "�@���̐l�̋��q�ŁA�ǂ��炪��������";
				mes "�@�킩����̂��������͂����]";
				set '@succsess,'@succsess + 1;
				continue;
			}
		case 4:
			switch(select("���[�G���̋��q","�f�C���X�̋��q","���Q���l�̋��q")) {
			case 1:
				mes "�]���[�G���͋A���Ă����Ƃ���";
				mes "�@�Ƃ̑O��ʂ�o���~����������";
				mes "�@�����Ă����B";
				mes "�@���̎��ԁA�o���~����";
				mes "�@�Ԃ��炫�n�߂���n��";
				mes "�@�����X�^�[������Ă����]";
				next;
				mes "�]�o���~���̋��q��";
				mes "�@���[�G���ƃN���C�A����";
				mes "�@2�l�̋��q�Ɩ�������]";
				next;
				mes "�]�o���~�����R�����Ă���";
				mes "�@�؋��ɂ͂Ȃ�Ȃ���";
				mes "�@���̂��Ƃ͊o���Ă������]";
				continue;
			case 2:
				mes "�]�f�C���X�̓o���~����";
				mes "�@�؋��𗊂܂ꂽ���Ƃ��������B";
				mes "�@���̎��͒f������������";
				mes "�@�o���~���Ƀl�b�N���X��_��";
				mes "�@���@���������ƍl������]";
				next;
				mes "�]�������A�o���~���̓����X�^�[��";
				mes "�@�|���Ă܂��߂ɓ����Ă�����";
				mes "�@�Ȃɂ��A��قǔƐl�̖ړI��";
				mes "�@���ڂ̕��ł͂Ȃ���";
				mes "�@���������΂��肾�]";
				next;
				mes "�]������x�l���Ă݂悤�]";
				continue;
			case 3:
				mes "�]���Q���l�̔̔����Ă�����������";
				mes "�@�X�s�[�h�A�b�v�|�[�V������";
				mes "�@���肷�邱�Ƃ��ł����]";
				next;
				mes "�]�������A���ۂ�";
				mes "�@�Ԃ��炫�n�߂���n��";
				mes "�@�����X�^�[��|���Ă�";
				mes "�@�X�s�[�h�A�b�v�|�[�V������";
				mes "�@��ɓ���Ȃ������]";
				next;
				mes "�]�܂�A�ƍs������";
				mes "�@�Ԃ��炫�n�߂���n�ɂ����Ƃ���";
				mes "�@�l���̋��q�͉R�ł͂Ȃ����낤���H�]";
				next;
				mes "�]���̐����͂���Ȃ��̂��낤���B";
				mes "�@����I�ȏ؋��͂Ȃ���";
				mes "�@���炩�ɉ������l������l����]";
				set '@succsess,'@succsess + 1;
				continue;
			}
		case 5:
			switch(select("�f�C���X","���T","���[�G��","�o���~��","�N���C�A��","���Q���l","������x�n�߂���l����")) {
			case 1:
				mes "[�f�C���X]";
				mes "�����H";
				mes "���ł����c�c�H";
				mes "�ǂ����āA�����l�b�N���X��";
				mes "���܂Ȃ���΂����Ȃ��̂ł����H";
				next;
				switch(select("�ԈႦ��","���T�ɕs�������������Ƃ��w�E����")) {
				case 1:
					mes "[�f�C���X]";
					mes "�������Ȃ��ł��������B";
					continue;
				case 2:
					mes "[�f�C���X]";
					mes "�c�c�������ɁA������";
					mes "�ȂƂ��܂������Ȃ����Ƃ�����܂����B";
					mes "�ł��A����Ŏ����Ɛl�Ƃ����̂�";
					mes "���܂�ɂ��Z���I�ł��B";
					next;
					mes "[�f�C���X]";
					mes "���������A�����Ɛl��������";
					mes "�Ȃɑ΂���s���������Ă�";
					mes "���̂��Ƃ��B����";
					mes "�^���Ȃ��悤�ɂ��܂���I";
					next;
					mes "�]�f�C���X���Ɛl�Ƃ���������";
					mes "�@����������悤���B";
					mes "�@������x�l���Ă݂悤�]";
					continue;
				}
			case 2:
				mes "[���T]";
				mes "�Ȃ�ł����āI";
				mes "�����Ɛl���ƌ�����!?";
				mes "�ӂ����Ȃ��ł��傤�����I";
				next;
				switch(select("�ԈႦ��","�V�����l�b�N���X��~�������Ă������Ƃ��w�E����")) {
				case 1:
					mes "[���T]";
					mes "���R����I";
					mes "�����Ɛl�̂킯���Ȃ���B";
					continue;
				case 2:
					mes "[���T]";
					mes "�V�����l�b�N���X��";
					mes "�����Ă��炤���߂�";
					mes "�厖�ɂ��Ă����l�b�N���X��";
					mes "�B�����Ƃł�������!?";
					next;
					mes "[���T]";
					mes "���̃l�b�N���X�͎�l�ɂ������";
					mes "�v���o�̕i���Ȃ̂�B";
					mes "�V�������̂��~�����ƌ������̂�";
					mes "�������Đl�Ɍ����������Ƃ�";
					mes "�����������Ƃł͂Ȃ���I";
					next;
					mes "[���T]";
					mes "�����A�ŋߎ�l��";
					mes "���ɖ��֐S�ȗl�q����������";
					mes "�����s��������������I";
					next;
					mes "�]���T���Ɛl�Ƃ���������";
					mes "�@����������悤���B";
					mes "�@������x�l���Ă݂悤�]";
					continue;
				}
			case 3:
				mes "[���[�G��]";
				mes "�������I";
				mes "��A���ł����c�c�H";
				next;
				switch(select("�ԈႦ��","�o���~�������������Ƃ������q�ɂ��Ďw�E����")) {
				case 1:
					mes "[���[�G��]";
					mes "�����ł����c�c�B";
					mes "�т����肵�܂����B";
					continue;
				case 2:
					mes "[���[�G��]";
					mes "�����H�@�o���~�������";
					mes "�����ƉԂ��炫�n�߂���n��";
					mes "�����̂ł����H";
					next;
					mes "[���[�G��]";
					mes "�c�c�Ƃ̑O�Ńo���~�������";
					mes "���������Ƃ����̂�";
					mes "���Ԃ�A���̋L���Ⴂ�ł��B";
					mes "�Ԃ��炫�n�߂���n��";
					mes "�����������A������������";
					mes "�ʂ̐l�ƊԈႦ���̂�������܂���B";
					next;
					mes "[���[�G��]";
					mes "�ł��A���͔Ɛl���Ⴀ��܂���I";
					mes "��̃l�b�N���X�𓐂ޗ��R�Ȃ��";
					mes "����܂��񂩂�B";
					next;
					mes "�]���[�G�����Ɛl�łȂ���";
					mes "�@�ؖ��ł���ޗ��͂Ȃ��B";
					mes "�@�������A���͂����Ɖ������l����";
					mes "�@����͂����B";
					mes "�@������x�l���Ă݂悤�]";
					continue;
				}
			case 4:
				mes "[�o���~��]";
				mes "�����D�_���ƌ����̂��ˁH";
				next;
				switch(select("�ԈႦ��","���q�̖������w�E����")) {
				case 1:
					mes "[�o���~��]";
					mes "���ށB";
					mes "�킩���Ă����΁A�����̂��B";
					continue;
				case 2:
					mes "[�o���~��]";
					mes "�N���C�A���̋��q�Ɩ������邾�ƁH";
					mes "���̐l���������������m��Ȃ���";
					mes "���͎����������܂܂�";
					mes "���q�������肾�B";
					next;
					mes "[�o���~��]";
					mes "���������āA�N���C�A���̕���";
					mes "�R�����Ă���Ƃ������Ƃ�";
					mes "�Ȃ��̂��ˁH";
					next;
					mes "�]�o���~���̋��q�͉R�ł͂Ȃ������B";
					mes "�@�^���ׂ��l���͑��ɂ���͂����B";
					mes "�@������x�l���Ă݂悤�]";
					continue;
				}
			case 5:
				mes "[�N���C�A��]";
				mes "�����Ɛl���Ƃ����̂ł����H";
				mes "�ł��A���ɂ̓A���o�C�������";
				mes "�����܂�����ˁH";
				next;
				switch(select("�ԈႦ��","���q�̉R���w�E����")) {
				case 1:
					mes "[�N���C�A��]";
					mes "�����ł���ˁB";
					mes "���ɂ̓A���o�C������܂�����B";
					continue;
				case 2:
					mes "[�N���C�A��]";
					mes "�����H";
					mes "�X�s�[�h�A�b�v�|�[�V������";
					mes "�Ԃ��炫�n�߂���n��";
					mes "�����X�^�[�����";
					mes "����ł��Ȃ����āH";
					next;
					mes "[�N���C�A��]";
					mes "�c�c��������";
					mes "�X�s�[�h�A�b�v�|�[�V������";
					mes "�����ɂ�����Q���l�̂�����";
					mes "���肵�܂����B";
					next;
					mes "[�N���C�A��]";
					mes "�ł��A����͎���";
					mes "�Ԃ��炫�n�߂���n��";
					mes "���Ȃ������Ƃ���������";
					mes "�����Ɛl���Ƃ����؋��ł�";
					mes "����܂����ˁH";
					next;
					mes "[�N���C�A��]";
					mes "���������Ɛl���Ƃ����Ȃ�";
					mes "���̂��Ƃ��ؖ�����悤�ȉ�����";
					mes "�����Ă��������I";
					set '@succsess,'@succsess + 1;
					continue;
				}
			case 6:
				mes "[���Q���l]";
				mes "�����Ɛl�����āH";
				mes "������Ƒ҂��Ă����I";
				next;
				switch(select("�ԈႦ��","��r�������Ȃ��Ă������Ƃ��w�E����")) {
				case 1:
					mes "[���Q���l]";
					mes "��������ȁB";
					mes "�����Ɛl�̂킯���Ȃ��I";
					continue;
				case 2:
					mes "[���Q���l]";
					mes "�����͂���������ł��������";
					mes "����͎����ŉ҂��������Ŕ�����";
					mes "���̂���B";
					next;
					mes "[���Q���l]";
					mes "���H";
					mes "�d�����ɂ��������ނ̂�";
					mes "�ǂ��Ȃ����āc�c�H";
					mes "�傫�Ȃ����b����B";
					next;
					mes "�]���Q���l�̔������C�ɂȂ邪";
					mes "�@�Ƃ肠�����A���͂�����";
					mes "�@�������l��������͂����B";
					mes "�@������x�l���Ă݂悤�]";
					continue;
				}
			case 7:
				mes "�]���Ȃ��́A������x";
				mes "�@�n�߂���l���邱�Ƃɂ����]";
				close;
			}
		case 6:
			switch(select("�ƍs�����������Ă���������","�l�b�N���X�̂������ꏊ�𖾂���","�l�b�N���X��T���ƈӋC����ł������Ƃ��w�E����","���[�G���Ƃ̌��ۂ�ے肳��Ă������Ƃ��w�E����")) {
			case 1:
				mes "[�N���C�A��]";
				mes "�X�ɂ��܂�����B";
				mes "�ؖ��ł���l�͂��܂��񂪁B";
				next;
				mes "�]�N���C�A���͊J��������";
				mes "�@�R�����Ă���悤��";
				mes "�@�����邪�A�{���̂��Ƃ�";
				mes "�@�����o�������ɂȂ��B";
				mes "�@������x�l���Ă݂悤�]";
				continue;
			case 2:
				mes "[�N���C�A��]";
				mes "�l�b�N���X�͌��̎��W���̒���";
				mes "��������ł����B";
				mes "�܂����A����ȂƂ���ɂ���Ƃ�";
				mes "�����܂����B";
				next;
				mes "[�N���C�A��]";
				mes "�Ƃ������Ƃ�";
				mes "�����Ɛl�Ƃ����؋��ɂ�";
				mes "�Ȃ�܂����ˁH";
				next;
				mes "�]�N���C�A���̌����ʂ肾�B";
				mes "�@������x�l���Ă݂悤�]";
				continue;
			case 3:
				mes "[�N���C�A��]";
				mes "�����A�Ɛl�����񂾃l�b�N���X��";
				mes "���Ԃ����Ǝv������ł��B";
				mes "�����Ɛl�Ȃ�A����Ȃ��Ƃ�";
				mes "�l���Ȃ��ł��傤�H";
				next;
				menu "�l�b�N���X�����܂ꂽ���Ƃ��ǂ��Œm����������",-;
				mes "[�N���C�A��]";
				mes "���[�G���ɕ������̂ł��B";
				mes "����l�������Ă���Ǝv����";
				mes "�}���ŋ삯�t�����̂ł��I";
				next;
				menu "�N���C�A��������܂Ń��[�G���͉Ƃ��o�Ă��Ȃ�",-;
				mes "[�N���C�A��]";
				mes "�����H";
				mes "���A����́c�c�B";
				next;
				mes "[�N���C�A��]";
				mes "���Ԃ�A���̊��Ⴂ�ł��B";
				mes "���[�G���ȊO�̒N����";
				mes "�������̂��Ǝv���܂��B";
				next;
				mes "[���[�G��]";
				mes "�c�c�N���C�A���B";
				mes "�����A��߂悤��B";
				next;
				mes "[�N���C�A��]";
				mes "���[�G���I";
				mes "���������Ă�񂾁H";
				next;
				mes "[���[�G��]";
				mes "�l�b�N���X�����܂ꂽ���Ƃ�";
				mes "�m���Ă����̂́A���Ɨ��e��";
				mes "�l�Ԃ̒T�コ��Ɓc�c�B";
				mes "���Ƃ́A�������Ƃ����{�l�����B";
				next;
				mes "[���[�G��]";
				mes "���ɂ����āA���̂��炢�̂��Ƃ�";
				mes "�킩���B";
				mes "�c�c�����A���܂�������Ȃ���B";
				next;
				mes "[�N���C�A��]";
				mes "�c�c���[�G���c�c�B";
				next;
				mes "[�N���C�A��]";
				mes "�c�c�����ł��B";
				mes "�����l�b�N���X��";
				mes "�������Ƃ��܂����B";
				next;
				mes "[���T]";
				mes "����ς�A���Ȃ��������̂ˁI";
				mes "������V�т����łȂ�";
				mes "���݂܂œ����Ȃ�āI";
				next;
				mes "[�N���C�A��]";
				mes "���̂��Ƃɂ��Ă�";
				mes "�\����Ȃ��v���Ă��܂��B";
				mes "�c�c����l�����点������";
				mes "�Ȃ������̂ł��B";
				next;
				mes "[���T]";
				mes "���������Ă����!?";
				mes "��؂ɂ��Ă�����̂𓐂܂ꂽ��";
				mes "����Ɍ��܂��Ă��邶��Ȃ��I";
				mes "����ƁA���̂��Ƃ�";
				mes "����l�ƌĂԂ͎̂~�߂Ȃ����I";
				next;
				mes "[���[�G��]";
				mes "�҂��āI";
				mes "�N���C�A���Ɉ��C�͂Ȃ������́B";
				mes "���߂āA�b�𕷂��Ă����āB";
				next;
				mes "[�N���C�A��]";
				mes "�c�c�����O�܂�";
				mes "���͂�����M�����u�����D����";
				mes "�����A�V�т܂���Ă��܂����B";
				next;
				mes "[�N���C�A��]";
				mes "���[�G���Əo�����";
				mes "���ꂩ��͂܂��߂ɂȂ낤��";
				mes "������ς����̂ł��B";
				next;
				mes "[�N���C�A��]";
				mes "�ł��A����l�Ɍ��ۂ�F�߂Ă��炦��";
				mes "�ƂĂ��Y�݂܂����B";
				next;
				mes "[�f�C���X]";
				mes "�ӂށc�c�������ɍȂɂ�";
				mes "��łȂƂ��낪����B";
				mes "������Ƃ����āA�l�b�N���X��";
				mes "���ނ��Ƃ͂Ȃ����낤�B";
				next;
				mes "[�N���C�A��]";
				mes "�����A�����ł͂Ȃ��̂ł��B";
				mes "�c�c���́A�Ȃ�Ƃ�����";
				mes "����l�̐M����������낤��";
				mes "���̕��@�ɂ���";
				mes "���낢��l���܂����B";
				next;
				mes "[�N���C�A��]";
				mes "�����āc�c�킴��";
				mes "����l�̃l�b�N���X�𓐂��";
				mes "������������������Ƃɂ����";
				mes "����l���F�߂Ă�������̂ł͂Ȃ�����";
				mes "�v�����̂ł��B";
				next;
				mes "[�N���C�A��]";
				mes "�c�c�������";
				mes "���ƂȂ��ẮA�o�J�ȍl����������";
				mes "���Ȃ��Ă��܂��B";
				next;
				mes "[�N���C�A��]";
				mes "�l�b�N���X�����o���Ƃ����";
				mes "���[�G���Ɍ�������";
				mes "�~�߂悤�Ƃ���ޏ���";
				mes "�Ԃ��������Ƀl�b�N���X��";
				mes "�ǂ����ɗ��Ƃ���";
				mes "������Ȃ��Ȃ��Ă��܂����c�c�B";
				next;
				mes "[�N���C�A��]";
				mes "�Ƃ̓������";
				mes "���m��ʐl�������Ă��܂�";
				mes "�|���Ȃ��ē����o�����Ƃ���";
				mes "�ł��܂���ł����c�c�B";
				next;
				mes "[���[�G��]";
				mes "�����A�|���Ȃ���";
				mes "�����o���Ă��܂����͓̂����ł��B";
				next;
				mes "[���[�G��]";
				mes "����ǂ��납";
				mes "�{���̂��Ƃ������o����";
				mes "�N���C�A����݂����߂�";
				mes "�R�����Ă��܂��āc�c�B";
				mes "�{���ɂ��߂�Ȃ����B";
				next;
				mes "[�N���C�A��]";
				mes "����A���[�G���͈����Ȃ��I";
				mes "�S�Ď��������̂ł��B";
				next;
				mes "[�N���C�A��]";
				mes "�ق�Ƃ��ɐ\���󂠂�܂���ł����B";
				next;
				mes "�]�����̔Ɛl�̓N���C�A���������B";
				mes "�@�{�l�����Ȃ��Ă���悤�Ȃ̂�";
				mes "�@�����V���Ȕ�Q��";
				mes "�@�o�邱�Ƃ͂Ȃ����낤�]";
				next;
				mes "[���[�G��]";
				mes "�l�Ԃ̒T�コ��A";
				mes "����������Ă��܂��Ă��߂�Ȃ����B";
				mes "���������������Ƃ�";
				mes "�ǂ��Ȃ����Ƃł����ǁA";
				mes "���Ȃ��āA��蒼�����Ǝv���܂��B";
				next;
				mes "[���[�G��]";
				mes "���Ȃ���������";
				mes "�������Ă���Ȃ�������";
				mes "���߂����C�����̂܂�";
				mes "�������Ǝv���܂��B";
				next;
				mes "[���[�G��]";
				mes "�ق�Ƃ��ɁA���肪�Ƃ��������܂����B";
				mes "������������̂�";
				mes "�������o���������x";
				mes "�b�������Ă��������ˁB";
				set ECL_5QUE,18;
				delquest 9240;
				delquest 9244;
				delquest 9247;
				delquest 9248;
				delquest 9251;
				delquest 9258;
				delquest 9260;
				delquest 9235;
				setquest 9236;
				close2;
				warp "ecl_in04.gat",77,107;
				end;
			case 4:
				mes "[�N���C�A��]";
				mes "�������ɁA����l�ɂ�";
				mes "���ۂɔ��΂���Ă��܂����B";
				next;
				mes "[�N���C�A��]";
				mes "������Ƃ�����";
				mes "����l���厖�ɂ��Ă���";
				mes "�l�b�N���X�𓐂�ł�";
				mes "���ۂ�F�߂���킯�ł�";
				mes "�Ȃ��ł��傤�H";
				next;
				mes "�]�N���C�A���̌����ʂ肾�B";
				mes "�@������x�l���Ă݂悤�]";
				continue;
			}
		}
	}
	next;
	close;
}

eclage.gat,156,56,3	script	���Ɠ����#eclage	844,3,3,{
	switch(ECL_5QUE) {
	case 0:
		mes "�]���Ƃ�����B";
		mes "�@���͕܂��Ă���悤���]";
		close;
	default:
		mes "�]������̂��������Ƃ��]";
		next;
		if(select("���Ƃɓ���Ȃ�","���Ƃɓ���") == 1) {
			mes "�]���Ȃ��͖��Ƃ���ɂ����]";
			close;
		}
		mes "�]���Ƃɓ���܂��]";
		close2;
		warp "ecl_in04.gat",77,107;
		end;
	}
OnTouch:
	if(ECL_5QUE == 0) {
		mes "�]�J�T�J�T�c�c�J�T�J�T�c�c";
		mes "�@�h���h���h�J���h�J���c�c";
		mes "�@�J���J��!!�@�J���I�]";
		next;
		mes "�]�Ƃ̒����畨��������]";
		next;
		if(select("�C�ɂ����ʂ�߂���","���������Ă݂�") == 1) {
			mes "�]�������C�ɂ����A";
			mes "�@���Ȃ��͐���}�����Ƃɂ����]";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "���ɒN�����܂����H";
		mes "���v�ł����H";
		next;
		mes "�]�s�ӂɎ��E���h�ꂽ�B";
		mes "�@�ǂ����㓪����";
		mes "�@�Ռ����󂯂��悤���B";
		mes "�@�͂������A���E��������ł����]";
		misceffect 0,"";
		sc_start3 SC_BLIND,0,0,0,0,60000,10;
		next;
		mes "�]���������A�����c�c�H";
		mes "�@�c�c�N���ɉ���ꂽ�H";
		mes "�@�����A���߂��c�c�]";
		close2;
		set ECL_5QUE,1;
		setquest 9225;
		warp "ecl_in04.gat",80,108;
		end;
	}
	end;
OnInit:
	waitingroom "���Ɠ����",0;
	end;
}

ecl_in04.gat,81,102,3	script	���Əo��#eclage	844,{
	mes "�]���Ƃ̌��ւ��]";
	next;
	if(select("���Ƃ���o�Ȃ�","���Ƃ���o��") == 1) {
		mes "�]�������������ɂ��邱�Ƃɂ����]";
		close;
	}
	mes "�]�O�ɏo�܂��]";
	close2;
	warp "eclage.gat",156,53;
	end;
}

//============================================================
// �I�v�Ȃ��J�N�G�X�g
//- Registry -------------------------------------------------
// ECL_6QUE -> 0�`
//------------------------------------------------------------
ecl_in02.gat,133,115,0	script	#pa0829�Ŏ玩��	139,3,3,{
	if(ECL_6QUE > 0)
		end;
	mes "[�N�����@�[]";
	mes "���[���A�Ŏ�`�B���[���B";
	mes "������Ɗ����������Ă��B";
	mes "�����J�T�J�T�ɂȂ����Ⴄ��`�B";
	mes "���`���I";
	mes "�������Ⴄ�ȁ`�B���[���I";
	mes "�����A�Ŏ�`�H�����Ă���̂��H";
	next;
	mes "[�Ŏ�]";
	mes "�c�c";
	next;
	mes "^000099�]�Ŏ�͔�ꂫ�����ʎ�����";
	mes "�@�č��̒��ɂ�����l�����߂Ă���]^000000";
	next;
	mes "[�Ŏ�]";
	mes "�N�����@�[�l�A�ꌾ���������܂��B";
	mes "���̂��Ȃ��͂����ł͎��l�̐g�ł��B";
	mes "���Ȃ̎��Ԃ����悤";
	mes "���߂���Ă����Ԃł��B";
	next;
	mes "[�N�����@�[]";
	mes "����A���������B����͕��������B";
	mes "������}���ł����̎��x��";
	mes "���Ƃ����Ă���Ȃ����B";
	mes "�����������ăJ�T�J�T����񂾂�B";
	next;
	mes "[�Ŏ�]";
	mes "�܂��A���̌��t�̈Ӗ���";
	mes "�������Ă��܂��񂩁H";
	mes "�������������ɋC���g���Ă�������";
	mes "�z�����Ă�����킯�ɂ�";
	mes "�����Ȃ���ł���B";
	next;
	mes "[�N�����@�[]";
	mes "������";
	mes "�������ȁc�c�B";
	next;
	mes "[�Ŏ�]";
	mes "�܂������B";
	mes "�͂��c�c�B";
	next;
	mes "^000099�]�Ŏ�͉����������������A";
	mes "�@���̂܂ܐȂɖ߂����B";
	mes "�@���̐l�͉��́A";
	mes "�@�߂܂��Ă���̂��낤���B";
	mes "�@�Ŏ�ɘb�������Ă݂悤�]^000000";
	set ECL_6QUE,1;
	setquest 12280;
	close;
}

ecl_in02.gat,146,114,4	script	�N�����@�[	622,{
	switch(ECL_6QUE) {
	case 0:
	case 1:
		mes "[�N�����@�[]";
		mes "��A�����A�N�́B";
		mes "�Ŏ�ɋ����������H";
		mes "�����킸�ɘb���Ɠ{����񂾁B";
		mes "�ʉ�͊Ŏ��ʂ��Ă���B";
		close;
	case 2:
		mes "[�N�����@�[]";
		mes "���A�������B";
		mes "�����c�c�B";
		mes "���͌N�Ƃ͏��߂ĉ�C������ȁB";
		mes "���̗p�Ŗʉ�ɗ����H";
		next;
		if(select("���ɗp�͂���܂���","���̂����ɁH") == 1) {
			mes "[�N�����@�[]";
			mes "�����ɂ����񂾌N�́c�c�B";
			close;
		}
		mes "[�N�����@�[]";
		mes "��B";
		mes "�������̍߂ŕ߂炦��ꂽ�̂��A";
		mes "�C�ɂȂ���āH";
		mes "����Șb�𕷂��Ăǂ�����񂾁H";
		next;
		mes "[�N�����@�[]";
		mes "�������Ƃ������l������";
		mes "�ʉ�v�������Ă�������A";
		mes "�������ʂȎ�������Ǝv�����̂ɁA";
		mes "�N�ɂ͂������肾��B";
		mes "���`�����Ŏ炢���߂ɉ̂ł��̂����`�B";
		mes "���J�`���J�`�`�I";
		next;
		mes "^000099�]�N�����@�[���̂��n�߂����A";
		mes "�@�Ŏ�̐�]�Ƌ��|�̂���Ⴄ�\�";
		mes "�@���ڂɉf�肱�񂾁]^000000";
		next;
		mes "[�Ŏ�]";
		mes "���肢���܂��B";
		mes "���Ƃ��N�����@�[�l��";
		mes "�ق点�ĉ������c�c�B";
		mes "����1�N�������Ă���";
		mes "���_�I�Ɍ��E�Ȃ�ł��c�c�B";
		mes "����킯�ɂ������Ȃ����B";
		set ECL_6QUE,3;
		setquest 72552;
		delquest 72550;
		close;
	case 3:
		mes "[�N�����@�[]";
		mes "�����̌N�`�A����`";
		mes "�悻������ȁ`";
		mes "���̎��l�͌���ȁ`";
		mes "���A�����������Ă���`���`";
		mes "�����ƌ��Ă���`���܂��݂�`";
		next;
		menu "������Ƒ҂��Ă��������I",-;
		mes "[�N�����@�[]";
		mes "��H�@�Ȃ񂾁H";
		mes "�Ȃ񂩖ʔ����b�ł�����̂��H";
		while(1) {
			next;
			if(select("�����Ă݂�","���̘b������","�~�b�h�K���h�嗤�̘b������","�H�ׂ������𕷂��Ă݂�") == 4)
				break;
			mes "[�N�����@�[]";
			mes "�ӂށc�c";
			mes "�i�����l���Ă���j";
			next;
			mes "[�N�����@�[]";
			mes "���ށB";
			next;
			mes "[�N�����@�[]";
			mes "���܂Ȃ��ȁB";
			mes "����ς�̂��̂������y������I";
			next;
			mes "�]���܂������Ȃ������B";
			mes "�@�ǂ����悤�H�]";
		}
		mes "[�N�����@�[]";
		mes "����B�H�ׂ������H";
		mes "���ށc�c�����Ă݂�΁c�c";
		mes "�����Ɠ����H��������A";
		mes "�H�ׂ������͂����ς�����ȁB";
		mes "�������A���АH�ׂ��������������B";
		next;
		mes "[�N�����@�[]";
		mes "�����������l�Ԃ̗��l��";
		mes "�v���[���g���ƌ����Ȃ���A";
		mes "^000099�u�h�E�ʏ`����n�[�u�e�B�[^000000�Ƃ���";
		mes "���ݕ������ꂽ�񂾁B";
		mes "�����������肵�ĂƂĂ��������������B";
		mes "������x���������ł݂����ȁB";
		next;
		mes "[�N�����@�[]";
		mes "�N�����̂��߂�";
		mes "^000099�u�h�E�ʏ`����n�[�u�e�B�[^000000��1�t";
		mes "�����ė��Ă��ꂽ��A";
		mes "���͂���Ƃ��Đ̘b�����Ă�낤�B";
		next;
		if(select("�����Ă���","�����Ă��Ȃ�") == 2) {
			mes "[�N�����@�[]";
			mes "�������B����Ȃ炢���񂾁B";
			mes "���͉̂ł��̂����Ƃɂ����B";
			close;
		}
		mes "[�N�����@�[]";
		mes "�ق����`�������B";
		mes "�ł́A���͂���܂�";
		mes "���Q�ł����Ă�Ƃ����B";
		mes "���Ⴀ���񂾂�B";
		set ECL_6QUE,4;
		delquest 72552;
		setquest 12281;
		close;
	case 4:
		if(countitem(12046) < 1) {
			mes "[�N�����@�[]";
			mes "���������c�c";
			mes "���₷��c�c�B";
			next;
			mes "^000099�]�u�h�E�ʏ`����n�[�u�e�B�[��";
			mes "�@�p�ӂ��ė���܂ł�";
			mes "�@�Q�Ă���悤���]^000000";
			close;
		}
		mes "[�N�����@�[]";
		mes "����A�{���Ɏ����ė����̂��B";
		mes "������N�A�����ɓ��鎞��";
		mes "�ʉ�\���͂������H";
		mes "�����`�Ŏ�I�@�Ŏ�`�`�I";
		mes "���̐l�̖ʉ�\�����ς�ł��邩";
		mes "�m�F���Ȃ��Ă������̂��H";
		next;
		mes "[�Ŏ�]";
		mes "�����ł��I�@���v�ł��I";
		mes "���Ȃ��ł��I";
		next;
		mes "^000099�]�Ŏ炪�C����������";
		mes "�@�������狩��ł���]^000000";
		next;
		mes "[�N�����@�[]";
		mes "�ӂ���c�c�B�ʉ�͖��Ȃ����Ă��B";
		mes "����A�ꉞ�m�F�����Ȃ��ƂˁB";
		mes "��ŉ��������邩�킩��Ȃ����炳�B";
		mes "�悵�B���ꂶ�႟�܂���";
		mes "�����Ă��Ă��ꂽ�W���[�X��";
		mes "���肪���������Ƃ��悤�B";
		next;
		mes "[�N�����@�[]";
		mes "���Ă킩��Ǝv�����ǁA���͎��l���B";
		mes "���ɂ������镨���Ȃ��B";
		mes "���̑���A�N�ɏj��������悤";
		mes "�F���Ă����悤�B";
		delitem 12046,1;
		set ECL_6QUE,5;
		delquest 12281;
		setquest 12282;
		getexp 120000,0;
		getexp 0,80000;
		close;
	case 5:
		mes "[�N�����@�[]";
		mes "�ӂ��`�B�������������B";
		mes "����[���肪�Ƃ��B";
		mes "�����ɕ����߂�ꂽ1�N�̊Ԃ�";
		mes "�K�˂ė����ʉ�q�̒���";
		mes "��ԋC�ɓ�������B";
		next;
		menu "�G�N���[�W���̘̐b�𕷂�",-;
		mes "[�N�����@�[]";
		mes "�����A�������ȁB";
		mes "�m���ɂ��̂悤�Ȗ񑩂������ȁB";
		mes "�悵�B���Ⴀ�b���Ƃ��悤�B";
		next;
		mes "[�N�����@�[]";
		mes "�������ȁc�c������b�������B";
		mes "�Z�l�X���̂��ƁH";
		mes "����Ƃ��R�Q�d�̂��Ƃ��A";
		mes "�c�c���ɂ͎����̋��ԂƂ�";
		mes "�F�X���邩��A";
		mes "�����������̂������Ă���B";
		while(1) {
			next;
			switch(select("�Z�l�X���̕�","�Z�l�X��","�R�Q�d�V�i�C��","�����̋���")) {
			case 1:
				mes "[�N�����@�[]";
				mes "����͐̂̂��鉤�Ɗ֘A�����\�b���B";
				mes "�́A�v�������X�Ƃ���";
				mes "1���ƍߎ҂������B";
				mes "�ނ�1���ƍߎ҂ł���Ȃ���A";
				mes "�Z�l�X�Ƃ����G�N���[�W���̃}�����A";
				mes "�����鉤�l���ȁA�̕��������񂾁B";
				next;
				mes "[�N�����@�[]";
				mes "���̍߂�Ƃ��������āH";
				mes "�͂͂́A����͒N���m��Ȃ��񂾁B";
				mes "�����ǂ��̃G�N���[�W���ŁA";
				mes "�v�������X�Ƃ������O�����ɂ���̂�";
				mes "^000099������֎~^000000����Ă���B";
				next;
				mes "[�N�����@�[]";
				mes "�N���C��t���鎖���ȁB";
				mes "����������ɂ���ƁA";
				mes "���ׂ̗ɗ��鎖�ɂȂ邩������Ȃ��B";
				mes "�͂͂́B";
				break;
			case 2:
				mes "[�N�����@�[]";
				mes "�v�������X�̎q�ł���";
				mes "�Z�l�X���Ɋւ���b������B";
				mes "�ƍߎ҂̕������������l";
				mes "�Ƃ��������������������A";
				mes "�ߌ��Ȑ����X���������Ă����B";
				next;
				mes "[�N�����@�[]";
				mes "���͐��_�a�������Ƃ����\������B";
				mes "�Z�l�X��������C�O�h���V���̌s��";
				mes "���ݍӂ��ĐH�ׂ����Ƃ�����炵���B";
				next;
				mes "[�N�����@�[]";
				mes "�N�A�z���ł��邩�H";
				mes "�}�������C�O�h���V����";
				mes "�Q���y�ڂ��s�ׂ�";
				mes "�ǂ�ȈӖ������̂����B";
				next;
				mes "[�N�����@�[]";
				mes "���ǂ͂��������s�ׂɂ����";
				mes "�C�O�h���V���Ƃ̌q�����";
				mes "�r�؂�Ă��܂����񂾁c�c�B";
				next;
				mes "[�N�����@�[]";
				mes "�ނ͏��X�ɕa��ł����Ȃ���A";
				mes "�ŏI�I�ɂ͎���̑̂ɉ΂�t����";
				mes "���������Ƃ����\���B";
				next;
				mes "[�N�����@�[]";
				mes "�������A���̘b�͐̂̉\�b���B";
				mes "�^�U�̒��͉��Ƃ������Ȃ��B";
				mes "�����A��m���Ȃ̂́A�Z�l�X����";
				mes "^000099�C�O�h���V���Ƃ̊֌W��؂���";
				mes "�ŏ��̃}����^000000";
				mes "�ł��������Ƃ͊m�����B";
				next;
				mes "[�N�����@�[]";
				mes "���̎��ɂ���ăG�N���[�W���ɂ�";
				mes "��ςȊ�@���K���B";
				mes "�������A";
				mes "����͂܂��ʂ̘b���B";
				break;
			case 3:
				mes "[�N�����@�[]";
				mes "�ӂӁB������˔��q�������\�b����B";
				mes "�G�N���[�W���ɏZ�ޖw�ǂ̃��t�B�l��";
				mes "�킩���Ă��Ȃ��b���B";
				mes "�R�Q�d�̃V�i�C���̖{����";
				mes "�V�i�C���ł͂Ȃ��񂾁B";
				next;
				mes "[�N�����@�[]";
				mes "�����ǁA�ޏ��̖{�������������̂���";
				mes "������o���Ă��Ȃ��B�����������B";
				mes "�܂�ŋ���ȏ����S����";
				mes "�S���̋L���̈ꕔ���������悤�ɂˁB";
				next;
				mes "[�N�����@�[]";
				mes "�m���Ȃ͔̂ޏ��̖{����";
				mes "��΃V�i�C���ł͂Ȃ��Ƃ������������B";
				mes "�����Ŏ��͖ʔ��������𗧂Ă��B";
				mes "�N�͏W�c�Q�O����Ƃ����b��";
				mes "���������Ƃ��Ȃ����ˁH";
				next;
				mes "[�N�����@�[]";
				mes "���͂ȌQ�O����\�͂������Ă����";
				mes "���g�̖{���A���̊�A��������";
				mes "���̎����ł͂Ȃ��A���̎������{������";
				mes "�M�������邱�Ƃ��ł���A�炵���B";
				next;
				mes "[�N�����@�[]";
				mes "�V�i�C���͂��̂悤�ȗ͂�";
				mes "�����Ă����̂��B";
				mes "���邢�́c�c���̂悤�ȗ͂�";
				mes "���̒N���ɂ���������ꂽ�̂��c�c�B";
				next;
				mes "[�N�����@�[]";
				mes "�܂��c�c";
				mes "�\����B�\�B";
				break;
			case 4:
				mes "[�N�����@�[]";
				mes "�����̐g�ł���Ȃ񂾂��c�c";
				mes "���͌��X���͗��j�w�҂Ȃ̂���B";
				mes "���̃A�[���u�w�C����";
				mes "�ߋ����猻�݂܂ł̒n���A�����A�l�Êw";
				mes "�������������̂��ꏏ�Ɍ������Ă����B";
				mes "�ܘ_�A�������Ă����B";
				next;
				mes "[�N�����@�[]";
				mes "����ŁA�ŋ߂̘b�ɂȂ�񂾂��ˁB";
				mes "���̕t�߂ŋT�􂪔������ꂽ�񂾁B";
				mes "���R�A���̎��̏󋵂ł�";
				mes "���n�Ɍ��ɍs�����͏o���Ȃ��������A";
				mes "�킽���̓����������c�Ƃ��ĎQ����";
				mes "�����𓾂Ė߂��ė����悤�Ȃ񂾁B";
				next;
				menu "�����H",-;
				mes "[�N�����@�[]";
				mes "�������B���Ԃ̍z�΂������ė����B";
				mes "�N�͒m���Ă��邩�H";
				mes "�����̋��Ԃ𗘗p�����";
				mes "����⎟���̕ǂ��z����";
				mes "�ړ����鎖���\�Ȃ񂾁B";
				next;
				mes "[�N�����@�[]";
				mes "���`�������A�Y��Ă�����B";
				mes "�N�̓~�b�h�K���h�嗤����";
				mes "���ŗ������l�������ȁB";
				mes "���Ԃ̑��݂͒m���Ă��ē��R���B";
				next;
				mes "[�N�����@�[]";
				mes "�܂��Ƃɂ����A�Z�p�҂�Ȋw�ҒB��";
				mes "�d�g�݂��̉𖾂Ɍ���";
				mes "�F�X�������d�˂Ă��鏊���낤�B";
				next;
				mes "[�N�����@�[]";
				mes "���ށB�������y���݂��ȁB";
				mes "�ߋ��Ƃ̘A�����\�ɂȂ�";
				mes "����Ȃ��Ƃ�������������Ƃ�����";
				mes "�N�Ȃ牽�����邩�ˁH";
				mes "�ӂӁB";
				next;
				mes "[�N�����@�[]";
				mes "���āA��������ׂ�߂����悤���B";
				mes "�n�[�u�e�B�[��t�̑Ή��Ƃ��Ă�";
				mes "�[���������񂶂�Ȃ����ȁB";
				mes "���͏����x�ނ��Ƃɂ����B";
				next;
				mes "[�N�����@�[]";
				mes "���A���������B";
				mes "��قǂ̋��Ԃ̍z�΂̘b����";
				mes "�ڂ����m�肽���̂ł���΁A";
				mes "���̗F�l^000099�q�G�[��^000000��";
				mes "�K�˂Č���Ƃ����B";
				next;
				mes "[�N�����@�[]";
				mes "�ނ̉Ƃ́A�X�̓�̕��ɂ���B";
				mes "���Ǝ��Ă��邪�A�����z�ł͂Ȃ��B";
				mes "�܂��Ɍ����҂̒��̌����҂���B";
				next;
				mes "[�N�����@�[]";
				mes "�v�X�Ɏ��̂���b���o���Ċy���������B";
				mes "���i�͊Ŏ瑊��ɂӂ������̂�";
				mes "�̂��Ă�΂��肾����ȁB�͂́c�c�B";
				mes "�����͂��肪�Ƃ��B";
				mes "�����x�ގ��ɂ���B";
				next;
				set ECL_6QUE,6;
				delquest 12282;
				setquest 12283;
				mes "�]�N�����@�[�͐[������ɂ����B";
				mes "�@�܂��͊Ŏ�ɖʉ�I����";
				mes "�@�񍐂��悤�]";
				close;
			}
			next;
			mes "[�N�����@�[]";
			mes "���ɂ����邼�B";
		}
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mes "^000099�]�N�����@�[�͂�������Q�Ă���B";
		mes "�@�N�����Ȃ��l�ɋC��t���悤�]^000000";
		close;
	case 18:
		mes "[�N�����@�[]";
		mes "��`����`�B";
		mes "�悭�Q������C���������ȁ`�B";
		mes "�ӂ�ӂ�ӂ�`�B�ӂӂӁ`�B";
		next;
		mes "[�N�����@�[]";
		mes "����A�N�͊m���A";
		mes "�u�h�E�ʏ`����n�[�u�e�B�[��";
		mes "���ꂽ�l����Ȃ����B";
		mes "�͂͂́B�ǂ������񂾂��B";
		next;
		if(select("�������܂���","�ʂ�߂���") == 2) {
			mes "[�N�����@�[]";
			mes "�Ȃ񂾁H�@��������̂��H";
			mes "�₵�����񂾂ȁB";
			close;
		}
		mes "[�N�����@�[]";
		mes "��H�@�Ȃ񂾂��āI";
		mes "�҂��Ă���c�c�B";
		mes "�����Ȑ��ł�����x�����Ă���";
		next;
		menu "���Ԃ̍z�΂̔����ɐ������܂���",-;
		mes "[�N�����@�[]";
		mes "�M�����Ȃ��B�N�����͂����̂��H";
		mes "����A����͂������B";
		mes "��̂ǂ�����ĉ\�ɂ�����!?";
		next;
		mes "[�N�����@�[]";
		mes "���Ԃ̍z�΂���������Ƃ�";
		mes "�G�}�̎���ɂ͔���p��";
		mes "�펯�𒴂���͂����o�����B";
		mes "�悭�m���Ă��鎖���B";
		mes "������ǂ����������Ƃ����񂾁H";
		next;
		menu "�o�܂�b��",-;
		mes "[�N�����@�[]";
		mes "�������A�K�v�ȍޗ����N���W�߂�";
		mes "�Z�p�I�Ȗ���";
		mes "�q�G�[�������Ƃ������Ƃ��������B";
		mes "�ł́A������ɉ������ʂȎ���";
		mes "�N�������낤�H";
		next;
		mes "[�N�����@�[]";
		mes "���̌����Ăł͉ߋ��Ƃ̒ʐM��";
		mes "�\�ɂȂ�͂��Ȃ񂾁I";
		mes "�����N�����H";
		mes "�N�����������̂������Ă���B";
		next;
		menu "�����܂ł̏o������b��",-;
		mes "[�N�����@�[]";
		mes "�ȂɁH�@�z�[���c���[�̘b�����Ă���";
		mes "��l�̃��t�B�l���o�Ă����H";
		mes "�Ƃ������Ƃ́A";
		mes "�ߋ��Ƃ̒ʐM�ɐ��������̂�!?";
		mes "���Ƃ��������I�@���ɂ�������I";
		mes "��������l�c�c�H�@�z�[���c���[�H";
		next;
		mes "[�N�����@�[]";
		mes "�ӂށc�c";
		mes "������Ƒ҂��Ă���B";
		mes "�v��������߂�����B";
		mes "�ߋ��̕�����T���Ă��邩��";
		mes "�����ő҂��Ă��Ă���B";
		next;
		mes "�]�N�����@�[�����j����T���Ă���B";
		mes "�@������x�b�������Ă݂悤�]";
		set ECL_6QUE,19;
		delquest 12289;
		setquest 12290;
		close;
	case 19:
		mes "[�N�����@�[]";
		mes "���������B�������������O��";
		mes "�֐S�������Ă������삪���ꂾ�B";
		mes "�G�N���[�W���̒a���Ɋւ�����j�B";
		mes "���F�̗��j���ɂ�";
		mes "�L�^����Ă��Ȃ����e���܂߂�";
		mes "���S�ł̗��j���B";
		next;
		menu "���S�ŁH",-;
		mes "[�N�����@�[]";
		mes "�傫�ȋƐт��������ɂ�������炸";
		mes "�����̗��j���ɂ͊܂܂�Ȃ���������B";
		next;
		mes "[�N�����@�[]";
		mes "^000099�h�i�Ԃ̐��͑���^000000";
		mes "^000099�h�i�Ԃ̎E������^000000";
		mes "�Ⴆ�΂������������̂�";
		mes "�����̗��j���ɂ͍ڂ�Ȃ��B";
		next;
		menu "�h�i�H",-;
		mes "[�N�����@�[]";
		mes "�h�i�͏㋉�̃��t�B�l�B�̎����B";
		mes "�M���Ƃ����̂��ˁB";
		mes "�p�p���ƌĂ΂���ʑw�̏�ʂ��B";
		mes "�}�����A�܂艤�l�͂��̃h�i����";
		mes "��l�I�΂�Ă���񂾂�B";
		next;
		menu "�Ȃ�ق�",-;
		mes "[�N�����@�[]";
		mes "���ށB������ނ�ɂ�";
		mes "�L�܂�Ɠs���̈����b�Ƃ����̂�";
		mes "������ł�����B";
		mes "�����������e�́A�����̗��j���ɂ�";
		mes "�c��Ȃ��񂾂�B";
		next;
		menu "�łɑ��苎����H",-;
		mes "[�N�����@�[]";
		mes "����A���j�͗��j������ȁB";
		mes "�Ⴆ�����ɂ͎c����Ȃ��Ă�";
		mes "���̂悤�Ȋw�ҒB��";
		mes "�����ċL�^��`�����Ă���";
		mes "������̗��j��������B";
		next;
		mes "[�N�����@�[]";
		mes "�������A�h�i���͂̒��ł�";
		mes "���ɏ㋉�̎ҒB�ɂƂ��Ă�";
		mes "�s���̈������e���B";
		mes "�����I�ȖړI�Řc�Ȃ��ꂽ���̂������B";
		mes "������Ζ��̊댯���炠�邾�낤�B";
		next;
		mes "[�N�����@�[]";
		mes "��l�̊w�ҒB�͑�X";
		mes "���������댯���ڂ݂���";
		mes "�R�U��Ȃ��^�̗��j����";
		mes "�󂯌p���ł��Ă��ꂽ�킯���B";
		next;
		mes "[�N�����@�[]";
		mes "���͂��̈ӎu�������p���A";
		mes "�B���ꂽ�^����\���A";
		mes "�R�U��Ȃ����j��";
		mes "�q���ōs������V�E�Ƃ��Ă���B";
		next;
		menu "�܂荡�A�č��ɂ��闝�R�́c�c",-;
		mes "[�N�����@�[]";
		mes "����B";
		mes "���͗����������ĕ߂܂����������B";
		next;
		menu "�c�c�c�c",-;
		mes "[�N�����@�[]";
		mes "�ӂӁB�b��߂����B";
		mes "���A�N���������Ƃ����G�N���[�W����";
		mes "�z�[���c���[�Ɋւ���b�����A";
		mes "��X�̎����j���ɂ�";
		mes "������̗��j�Ƃ��Ďc���Ă���B";
		next;
		mes "[�N�����@�[]";
		mes "�N�����������Z�������Ƃ����ҁB";
		mes "����͋��炭^ff0000�G�X����^000000�Ƃ������O��";
		mes "�h�i���Ǝv���B";
		mes "�G�N���[�W���̂��߂ɁA";
		mes "�r�t���X�g�̉񕜂��ŗD���";
		mes "�咣�����҂��B";
		next;
		mes "[�N�����@�[]";
		mes "�����Ē����̎҂�^ff0000���x��^000000�Ƃ������O��";
		mes "�h�i�ɊԈႢ�Ȃ����낤�B";
		mes "�r�t���X�g�̉񕜂�ۗ��ɂ��A";
		mes "�z�[���c���[�̑n�����ŗD�悷�鎖��";
		mes "�咣�������͂̃��[�_�[���B";
		next;
		mes "[�N�����@�[]";
		mes "������̗��j���ɂ���";
		mes "�ޓ���l�̑Η������[���Ƃ������R��";
		mes "�G�N���[�W���̒a����";
		mes "�傫�ȍv���������ɂ��ւ�炸�A";
		mes "�����̋L�^�ɂ�";
		mes "�c��Ȃ������悤���B";
		next;
		mes "[�N�����@�[]";
		mes "�������c�c";
		mes "���̎������A���������e��";
		mes "�N�̊�ɂ͂ǂ̂悤�ɉf�����H";
		mes "���̂��̃G�N���[�W���͂ƂĂ����a���B";
		mes "�㋉�E�̃h�i�����̑�����";
		mes "�������ɂ��Ă͕��a������B";
		next;
		switch(select("���a�ɂ݂͂��Ȃ�","���a�ɂ݂���")) {
		case 1:
			mes "[�N�����@�[]";
			mes "�������H�@�����A���Ȃ��Ƃ�";
			mes "�����̃z�[���c���[�͂ǂ����H";
			mes "���Ȃ������Ă���I";
			mes "�����Ă��̃r�t���X�g�̐A��������";
			mes "�������Ȃ������Ă���c�c�I";
			break;
		case 2:
			mes "[�N�����@�[]";
			mes "�����A�N�̌����ʂ肾�B";
			mes "�����̃z�[���c���[�͐����Ă���B";
			mes "�����Ă��̃r�t���X�g�̐A��������";
			mes "�������Ȃ������Ă���B";
			break;
		}
		next;
		mes "[�N�����@�[]";
		mes "�{���ɑ������������̂��H";
		mes "�����̗��j���ɋL�^����Ȃ�����";
		mes "�傫�ȑΗ��������������̂Ȃ�΁A";
		mes "���̃G�N���[�W���ƃr�t���X�g��";
		mes "��΂ɍ��̂悤�ȕ��a�Ȏp��";
		mes "�Ȃ��Ă���͂��͂Ȃ��Ǝv���񂾁B";
		next;
		mes "[�N�����@�[]";
		mes "�ʖڂ��B�����ɂ��镨�����ł�";
		mes "�ǂ��ɂ������������B";
		mes "�����҂��Ă���B";
		mes "���E���������Ђ�����B";
		mes "���ɏꏊ����������A";
		mes "���ڍs���Ċm���߂Ă݂Ă���B";
		next;
		mes "�]�N�����@�[�̏����Ă��ꂽ";
		mes "�@�����������";
		mes "�@�z�[���c���[�̐}���ق�";
		mes "�@�s���K�v������悤���]";
		set ECL_6QUE,20;
		delquest 12290;
		setquest 12291;
		close;
	case 20:
	case 21:
		mes "[�N�����@�[]";
		mes "���ɏ������ꏊ�ɍs���āA";
		mes "���ڊm���߂Ă݂Ă���B";
		close;
	case 22:
		mes "[�N�����@�[]";
		mes "���A�߂������B";
		next;
		menu "�ǂ�ł��܂���",-;
		mes "[�N�����@�[]";
		mes "�������B�G���͂ǂ��������H";
		mes "3���G�����ƌ����Ă��邯�ǁA";
		mes "���͗��j�������ڂ������e��";
		mes "���m�ɏ�����Ă���񂾁B";
		next;
		mes "[�N�����@�[]";
		mes "3���Ƃ������󂳂�Ă��邩��ȁB";
		mes "���{���Ȃ����A���������M���Ȃ���";
		mes "���傤�ǂ����񂾁B";
		mes "�ŁA�������������H";
		while(1) {
			next;
			if(select("���ɂȂ�","���₪����") == 2)
				break;
			mes "[�N�����@�[]";
			mes "�������B";
			mes "�ڂ̗������l���Ǝv���Ă������A";
			mes "���̊ԈႢ���B";
		}
		mes "[�N�����@�[]";
		mes "�ق��B���ł������Ă���B";
		while(1) {
			next;
			switch(select("�p�p���ɂ���","���V��ɂ���","�G�X�����ƃ��x���ɂ���","�}�����E�W�����ɂ���")) {
			case 1:
				mes "[�N�����@�[]";
				mes "�p�p���͈�ʂ̃��t�B�l�B�̎����B";
				mes "�S�̂�90%�����̃p�p�����B";
				mes "�h�i�͏㗬�K���̋M�����B";
				mes "���݂��ɑ��d�������Ă��āA";
				mes "�Η��Ȃǂ����������j��";
				mes "��{�I�ɂ͖����B";
				next;
				mes "[�N�����@�[]";
				mes "�p�p���͐��������̂�";
				mes "�������̏W�c������B";
				mes "���������W�c�̒��B��";
				mes "����I�ɏW�܂��ďW������Ă���B";
				mes "�����Ō��V��ƑΗ����Ă����̂�";
				mes "���炭���������W�c�̎����낤�B";
				continue;
			case 2:
				mes "[�N�����@�[]";
				mes "���V��B";
				mes "����̃h�i�B�ō\�����ꂽ�A";
				mes "�W�܂�̎����B";
				mes "���t�B�l�̓`���⌌���̓`����";
				mes "�Ǘ�������A��鎖��ړI�Ƃ���";
				mes "�ŏ��͌������ꂽ�悤���B";
				next;
				mes "[�N�����@�[]";
				mes "�������A���Ԃ��o�ɂ�";
				mes "�����鐭���I����";
				mes "������������悤�ɂȂ��Ă������B";
				next;
				mes "[�N�����@�[]";
				mes "����������Ǘ�������A";
				mes "�`���̕ی�𑱂��邤����";
				mes "�������e���͂��������񂾂낤�B";
				mes "���t�B�l�͎�������������ȁB";
				continue;
			case 3:
				mes "[�N�����@�[]";
				mes "�G�X�����ƃ��x���̘b��ǂ񂾂��B";
				mes "���������Ƒ唼�̃��t�B�l�B��";
				mes "���̒n�������̋M�����͂ł���";
				mes "���V��̂������Ő��藧���Ă����";
				mes "�v���Ă���B";
				next;
				mes "[�N�����@�[]";
				mes "�������A���ۂ̗��j��";
				mes "�Ⴂ���t�B�l�����̋]����";
				mes "���藧���Ă���B";
				mes "���߂͗��j�w�҂ł��鎄��";
				mes "�ɂ킩�ɂ͐M�����Ȃ������B";
				next;
				mes "[�N�����@�[]";
				mes "�����Ĕ�������������̎�����";
				mes "�Ⴋ��l�̃��t�B�l�Ɋւ���L�q��";
				mes "���ɋ�̓I�ɏ�����Ă���B";
				mes "�ǂ�����Đ������j����{������";
				mes "�󂯓���邱�Ƃ��ł���񂾁H";
				next;
				mes "[�N�����@�[]";
				mes "�����玄�͊֘A����_����������";
				mes "��x���\���Ă݂��񂾂�B";
				mes "���ʂ́c�c";
				mes "�F�߂Ă��炦�Ȃ������B";
				next;
				mes "[�N�����@�[]";
				mes "�Ⴂ�w�҂����j�̐^����i���Ă�";
				mes "�N���U������Ă���Ȃ�������B";
				next;
				mes "[�N�����@�[]";
				mes "����Ŏ��͘_���̔��\���";
				mes "�G�N���[�W���ɂ���ǖʂ̂������";
				mes "�u�����΂ꌳ�V��̉R�����I�v";
				mes "�ƃX�v���[�����Ă�����";
				mes "�߂܂��Ă��܂����񂾁B";
				mes "��肭���������������񂾂��ȁB";
				next;
				set ECL_6QUE,23;
				delquest 12292;
				setquest 72566;
				mes "[�N�����@�[]";
				mes "������Ƒ҂����I";
				mes "�Ŏ炪�������C�ɂ��Ă���悤���B";
				mes "�����b���ς��悤�B";
				close;
			case 4:
				mes "[�N�����@�[]";
				mes "�}�����E�W�����H";
				mes "�����Ղ��l�ɉ��l�ƌĂ�ł���B";
				mes "���B�̊Ԃł̓A�C�h���̂悤�ȑ��݂��B";
				next;
				mes "[�N�����@�[]";
				mes "�������A���ƃq�G�[���̂悤��";
				mes "�w�҂͓��ɋ����͂Ȃ��B";
				mes "���͌����̐��E��";
				mes "�����������Ă��Ȃ�����ȁB";
				continue;
			}
		}
	case 23:
		mes "[�N�����@�[]";
		mes "�Ŏ炪�������C�ɂ��Ă���悤���B";
		mes "�����b���ς��悤�B";
		close;
	case 24:
		mes "[�N�����@�[]";
		mes "��H�@���ł��Ȃ��������B";
		mes "���͂Ă�����";
		mes "�N�Ƃ̉�b���������Ă���̂�";
		mes "�Ŏ炪�������Ă���̂��Ɓc�c�B";
		next;
		mes "^000099�]�����΂��]^000000";
		next;
		mes "[�N�����@�[]";
		mes "����ŉ������c�c";
		mes "��������̓��e��";
		mes "����܂ŒN�ɂ��b���Ă��Ȃ�";
		mes "�閧���܂܂�Ă���B";
		next;
		mes "[�N�����@�[]";
		mes "�����ꂱ�ꂩ�玄���b�����e��";
		mes "���������Ȃ��̂ł���΁A";
		mes "���܂ł̘b�͂Ȃ��������Ƃɂ��Ă���B";
		next;
		mes "[�N�����@�[]";
		mes "�����A��������̘b�ɋ���������A";
		mes "���㋦�͂��Ă����Ƃ����̂ł���΁A";
		mes "���ꂩ�畷���b�͑S�Ĕ铽��";
		mes "��΂ɑ������Ȃ��悤�ɂ��Ăق����B";
		next;
		mes "[�N�����@�[]";
		mes "�ǂ����낤�H�@�񑩂ł��邩�H";
		next;
		if(select("�񑩂���","�񑩏o���Ȃ�") == 2) {
			mes "[�N�����@�[]";
			mes "�c�O���B";
			mes "�����܂Ŏ��̘b�𕷂��Ă��ꂽ���l��";
			mes "�N�����߂Ă������̂ɁB";
			mes "�܂��A�l�����ς������";
			mes "���ł�����K�˂ė��Ă���B";
			close;
		}
		mes "[�N�����@�[]";
		mes "�f���炵���B���肪�Ƃ��B";
		mes "�ł͎���������ȁB";
		mes "�܂��͌N�̍D�ӂɊ��ӂ��A";
		mes "�z�[���c���[�ɉ�����F��Ƃ���B";
		set ECL_6QUE,25;
		delquest 72568;
		setquest 72570;
		getexp 120000,0;
		getexp 0,80000;
		close;
	case 25:
		mes "[�N�����@�[]";
		mes "�悵�B�ł͑�����b�����B";
		mes "�����閧�ƌ����Ă����͂ȁA";
		mes "�N�͊��Ɉ�x";
		mes "���Ă���͂��Ȃ񂾁B";
		next;
		mes "[�N�����@�[]";
		mes "�q�G�[�������Ԃ̍z�΂̌�����";
		mes "���Ă������낤�B";
		mes "�ނ����Ɠ����ړI��";
		mes "���������Ă����񂾁B";
		next;
		mes "[�N�����@�[]";
		mes "^000099��Ԃ𒴉z���ߋ��̃��t�B�l�Ƃ�";
		mes "��M���s��^000000�Ƃ��������B";
		next;
		mes "[�N�����@�[]";
		mes "���͗��j�̎�����m��ׂɁA";
		mes "�q�G�[���̓z�[���c���[�̓����݌v��";
		mes "�m�邽�߂ɁB";
		next;
		menu "�Ȃ�ق�",-;
		mes "[�N�����@�[]";
		mes "���ށB�����č���A";
		mes "�N����M�ɕK�v�ȍޗ���";
		mes "�p�ӂ��Ă��ꂽ���ɂ����";
		mes "�Ƃ��Ƃ����������������킯���B";
		next;
		mes "[�N�����@�[]";
		mes "���炭�A���Ƃ������Ęb���Ă���Ԃɂ�";
		mes "�q�G�[���͋��Ԃ̍쓮���@�Ȃ�";
		mes "���p���Ɍ����Ē������Ă���͂����B";
		next;
		mes "[�N�����@�[]";
		mes "����������Ɗ���";
		mes "�ߋ��̃��t�B�l�B�Ƃ̌�M��";
		mes "���肵�ďo���邩������Ȃ��B";
		mes "����ł��܂Ȃ��񂾂��c�c";
		next;
		mes "[�N�����@�[]";
		mes "�q�G�[���ɉ���āA�ߋ��̃G�X�����B��";
		mes "�ʐM�����݂Ă��Ă���Ȃ����B";
		mes "�{���͎����s�������񂾂��c�c�B";
		next;
		mes "[�N�����@�[]";
		mes "�����ĂȂ�ł���������";
		mes "�ނ�̘b��S�ċL�^����";
		mes "���ɒm�点�Ă���B���肢���B";
		mes "���񂾂��I";
		set ECL_6QUE,26;
		delquest 72570;
		setquest 12293;
		close;
	case 26:
	case 27:
	case 28:
	case 29:
	case 30:
	case 31:
	case 32:
	case 33:
	case 34:
	case 35:
	case 36:
	case 37:
		mes "[�N�����@�[]";
		mes "�q�G�[���ɉ���āA�ߋ��̃G�X�����B��";
		mes "�ʐM�����݂Ă��Ă���Ȃ����B";
		next;
		mes "[�N�����@�[]";
		mes "�����ĂȂ�ł���������";
		mes "�ނ�̘b��S�ċL�^����";
		mes "���ɒm�点�Ă���B���肢���B";
		mes "���񂾂��I";
		close;
	case 38:
		mes "[�N�����@�[]";
		mes "�����B�߂������B";
		next;
		mes "[�N�����@�[]";
		mes "����ŁA�ǂ��������H";
		mes "�q�G�[���̌�����";
		mes "�������񂾂��H";
		next;
		menu "����܂ł̘b��`����",-;
		mes "[�N�����@�[]";
		mes "�������[�B�������������B";
		mes "��͂�A�G�X�����ƃ��x���A";
		mes "�Ⴂ��l�̃h�i�̋]���ɂ����";
		mes "�G�N���[�W���͐��藧���Ă����񂾂ȁB";
		mes "�������j���̓��e�͊ԈႢ�������B";
		next;
		mes "[�N�����@�[]";
		mes "�{���ɂ���J�������B";
		mes "���肪�Ƃ��A" +strcharinfo(0)+ "";
		mes "�N�����Ȃ�������A";
		mes "�č��ŕ����߂�ꂽ�g�̂܂܁A";
		mes "����i�܂Ȃ��������낤�B";
		next;
		mes "[�N�����@�[]";
		mes "�������c�c��l�̊o��͐����ȁB";
		mes "���`�ށB";
		mes "�Ȃ��A�N�͂ǂ��v���H";
		mes "���̓�l�͍ĂсA";
		mes "������ł����Ǝv�����H";
		next;
		switch(select("��Ȃ�����","���","�ǂ����ł�����")) {
		case 1:
			mes "[�N�����@�[]";
			mes "�c�c�N�̓����͂������B";
			mes "�ł��m���ɁA";
			mes "���̉\������ԍ��������B";
			mes "�����A�c�O�ȋC�����邪�c�c�B";
			break;
		case 2:
			mes "[�N�����@�[]";
			mes "�Ȃ����낤�ȁB�N�����������Ă����";
			mes "���g���Ă��鎩��������񂾁B";
			mes "���N�̋^�₪��������������";
			mes "�C�����������A";
			mes "�ɂ񂾂̂�������Ȃ��ȁc�c�B";
			break;
		case 3:
			mes "[�N�����@�[]";
			mes "�c�c�ǂ����ł����ƁA���B";
			mes "�N�͈ӊO�ƃ��}���`�X�g���ȁB";
			mes "���̂ǂ���������";
			mes "���̒n�A�G�N���[�W���ł��邱�Ƃ�";
			mes "�肤�΂��肾�B";
			break;
		}
		next;
		mes "[�N�����@�[]";
		mes "�ǂ���ɂ���c�c�B";
		mes "���������A�m��R���Ȃ��b���B";
		next;
		mes "[�N�����@�[]";
		mes "�Ȃɂ͂Ƃ�����A";
		mes "����͋v�X�ɖ����������ʂ��o���I";
		mes "�悩�����B�悩�����B";
		next;
		cutin "EP14_etran1",1;
		mes "^000099�]�΂��Ă���N�����@�[�̊��";
		mes "�@�G�X�����̉e���d�˂Č������]^000000";
		next;
		cutin "EP14_etran1",255;
		mes "[�N�����@�[]";
		mes "����A���̎�Ɏ����Ă���";
		mes "�����͂Ȃ񂾁H";
		next;
		menu "�G�X��������Ⴂ�܂���",-;
		mes "[�N�����@�[]";
		mes "�Ȃ񂾂��āH";
		mes "������ƌ����Ă���Ȃ����B";
		mes "�ǂ�ǂ�c�c�B";
		next;
		mes "[�N�����@�[]";
		mes "�����B����́A�������B";
		mes "��߂�ꂽ�\�͂�����悤���ȁB";
		mes "�q�G�[���̂��ƂɎ����Ă�����";
		mes "���̗͂�����ł���Ǝv�����B";
		mes "��x�K��Ă݂�Ƃ����B";
		next;
		mes "[�N�����@�[]";
		mes "�������N�ɂ�";
		mes "�{���ɐ��b�ɂȂ����B";
		mes "�����Ԃ��肪�Ƃ��B";
		mes "�������ŏo����ɏ������j����";
		mes "���M���ׂ����e����C�ɑ�������B";
		next;
		mes "[�N�����@�[]";
		mes "�Ō�ɌN�̕��ޓ��ɏj��������悤�A";
		mes "�F�点�Ă��炤�Ƃ����B";
		mes "���C�łȁI";
		mes "���͑������M��Ƃɓ��点�Ă��炤��B";
		next;
		mes "[�N�����@�[]";
		mes "����ƁA����͂����₩�Ȃ��炾�B";
		mes "�󂯎���Ă���B";
		next;
		if(checkitemblank() == 0) {
			mes "[�N�����@�[]";
			mes "�Ǝv�������ǁA�ו���������";
			mes "����ȏ㎝�ĂȂ��悤���ȁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close;
		}
		mes "�]�N�����@�[�͎��M���n�߂��B";
		mes "�@���̂��Ƃ��q�G�[���ɓ`���悤�]";
		set ECL_6QUE,39;
		delquest 72578;
		setquest 72580;
		getexp 4060000,0;
		getexp 0,1880000;
		getitem 6081,50;
		close;
	case 39:
	case 40:
	case 41:
		mes "^000099�]�فX�ƕM�L�p��ŉ�����";
		mes "�@�ꏊ�����ɏ����Ă���B";
		mes "�@�������M���Ă���悤���]^000000";
		close;
	}
}

ecl_in04.gat,109,215,3	script	�q�G�[��	621,{
	switch(ECL_6QUE) {
	case 7:
		mes "[�q�G�[��]";
		mes "�Ӂ[�ށc�c�B";
		mes "�����̐������Ⴄ�̂��ȁB";
		mes "��A�҂Ă�B";
		mes "���S�Ɍ��藝�ɂ��΂����́c�c";
		next;
		menu "����ɂ���",-;
		mes "[�q�G�[��]";
		mes "��H�@���̗p���ł����H";
		mes "�����͏���ɓ����ė����Ⴂ���܂���B";
		next;
		menu "�Љ���󂯂ė��܂����B",-;
		mes "[�q�G�[��]";
		mes "�Љ�H�@�ǂ��̒N����̏Љ�ł����B";
		mes "�����Ă��������B";
		next;
		input '@str$;
		if('@str$ != "�N�����@�[") {
			mes "[�q�G�[��]";
			mes '@str$+ "���ƁH";
			mes "���͂��̂悤�Ȑl�͒m��Ȃ��I";
			mes "�������z���ȁB�o�čs���I";
			close2;
			warp "eclage.gat",152,91;
			end;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�N�����@�[����̏Љ�ŗ���";
		mes strcharinfo(0)+ "�Ƃ����܂��B";
		next;
		mes "[�q�G�[��]";
		mes "�����A�N�����@�[�̏Љ�ł����B";
		mes "����͂���́B�킩��܂����B";
		mes "�r����������Ƃ��I��点��̂�";
		mes "�����҂��ĂĂ��������B";
		next;
		mes "�]�r���̍�Ƃ�Еt���Ă����悤���B";
		mes "�@������x�A�b�������悤�]";
		set ECL_6QUE,8;
		delquest 72554;
		setquest 72556;
		close;
	case 8:
		mes "[�q�G�[��]";
		mes "���҂������܂����B";
		mes "�������ς��҂̂��̃N�����@�[��";
		mes "�悭���ʂɉ�b���o���܂����ˁB";
		mes "����ۂǍD���ꂽ�̂��A";
		mes "���Ȃ����ς��҂Ȃ̂��B�͂́B";
		mes "����A����B����ł����͉��āH";
		while(1) {
			next;
			switch(select("��b����߂�","�Z�l�X���̕��ɂ���","�Z�l�X���ɂ���","�R�Q�d�V�i�C���ɂ���","�����̋��Ԃɂ���")) {
			case 1:
				mes "[�q�G�[��]";
				mes "���A�͂��H�@�킴�킴�K�˂Ă����̂ɁH";
				mes "��͂肠���Ɠ�����";
				mes "�Ƃ񂾕ς��҂ł��ˁB";
				mes "���͖Z������ł��B";
				mes "�p���������Ȃ�A���ĉ������B";
				close;
			case 2:
				mes "[�q�G�[��]";
				mes "���͂����̉����Ɋւ���\��";
				mes "����������܂���B";
				continue;
			case 3:
				mes "[�q�G�[��]";
				mes "�ǂ��ł������b�ł��ˁB";
				continue;
			case 4:
				mes "[�q�G�[��]";
				mes "���̖��O���{������Ȃ��H";
				mes "������ǂ�������ł����H";
				continue;
			case 5:
				break;
			}
			break;
		}
		mes "[�q�G�[��]";
		mes "���`�B���̘b�𕷂�����ł����B";
		mes "���Ȃ��͌���ڂ�����悤�ł��ˁB";
		mes "�N�����@�[�������Ă����Ǝv���܂����A";
		mes "���̕����ɂ͋��Ԃ��玝���ė���";
		mes "���Ԃ̍z�΂�����܂��B�����ł���B";
		mes "����͂ˁc�c";
		next;
		mes "^000099�]���������ƃq�G�[���͊���������";
		mes "�@���Ԃ̍z�΂����������������Ȃ���A";
		mes "�@��30���ԁA�x�܂��ɘb�𑱂����]^000000";
		next;
		mes "^000099�]����́c�c�N�����@�[�Ƃ͈Ⴄ�Ӗ���";
		mes "�@����^�C�v�̂悤���B";
		mes "�@�Ȃ�Ƃ��b��؂�Ȃ��Ɓc�c";
		mes "�@���������炩��b��U�낤�]^000000";
		while(1) {
			next;
			switch(select("���Ԃ̍z�΂̗p�r�𕷂�","���Ԃ̍z�΂̓�����@�𕷂�","���Ԃ̍z�΂̎��p���ɂ��ĕ���")) {
			case 1:
				mes "[�q�G�[��]";
				mes "�͂��B�܂��ɂ��̓_���������ł��B";
				mes "���̋��Ԃ̍z�΂��g���ƁA";
				mes "�ߋ��Ɩ����̋�ԊT�O�𒴂���";
				mes "�����Ԃ̕ǂ��󂵂Ă����Ƃ������Ƃ�";
				mes "�������Ă��܂��B";
				next;
				mes "[�q�G�[��]";
				mes "�܂�ǂ����������Ƃ����ƁA";
				mes "���Ԃ̍z�΂���肭���p����ƁA";
				mes "^000099�ߋ��̐l���ɉ��^000000��";
				mes "�o����悤�ɂȂ�\���������ł��B";
				continue;
			case 2:
				mes "[�q�G�[��]";
				mes "�ŋ߁A�����̋߂���";
				mes "����ȋT�􂪏o���܂����B";
				mes "���̓��t�B�l�̕��m�����̊Ď��ɂ��";
				mes "����֎~�ɂȂ��Ă��܂����A";
				mes "���������͒����̂��߂ɁA";
				mes "�������̂悤�Ȍ����҂����ꂽ��ł��B";
				next;
				mes "[�q�G�[��]";
				mes "���̎��ɂЂƂ����ė��Ă��܂��B";
				mes "������񌩂����";
				mes "���͊č��s���ł��B";
				mes "��΂ɑ����͂��Ȃ��ŉ������B";
				mes "�N�����@�[�̏Љ�̂��Ȃ������炱��";
				mes "�M�p���Ă��b���Ă��܂��B";
				continue;
			case 3:
				break;
			}
			break;
		}
		mes "[�q�G�[��]";
		mes "���p���c�c�ł����B";
		mes "�c�c�B";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�q�G�[��]";
		mes "���́A�F�X�Ȏ�i���g���Ă����ł���";
		mes "�͂́c�c�B";
		mes "���̋��Ԃ̍z�΂��ˁc�c�Ȃ��Ȃ��B";
		next;
		mes "[�q�G�[��]";
		mes "�������𕷂��Ă���Ȃ���ł��B";
		mes "�����A";
		mes "��������������܂���B";
		mes "�͂��c�c�B";
		next;
		mes "[�q�G�[��]";
		mes "���͂ˁA�����Ƃ��Ẵ��[���𖳎�����";
		mes "�������Ƃ��Ăׂ邱�̍z�΂��A";
		mes "��̂ǂ�Ȕ������݂���̂�";
		mes "�����āA���̎������N����̂��c�c";
		mes "�K���I�@�K����I";
		next;
		mes "[�q�G�[��]";
		mes "���̖ڂŊm���߂Ă݂�����ł���B";
		mes "�����A��������ł��B";
		mes "���ꂾ���ł��B";
		next;
		mes "[�q�G�[��]";
		mes "���ǁA���ʂȎx��������킯�ł��Ȃ��A";
		mes "�肪���肪����킯�ł��Ȃ��B";
		mes "��l�܂�̏�Ԃł���B�͂́B";
		next;
		mes "[�q�G�[��]";
		mes "��B���������΁c�c";
		mes "���Ȃ��̂������E�ł́A";
		mes "���łɋ��Ԃ̍z�΂Ɣ������镨����";
		mes "�����ɐ��������ƕ��������ǁA";
		mes "���̔L�̘b�͖{���������̂��ȁB";
		next;
		menu "�L�H",-;
		mes "[�q�G�[��]";
		mes "���͔L�̎�T�[�r�X�̏o�g���Ƃ����L��";
		mes "�~�b�h�K���h�嗤�A������l�ԊE��";
		mes "�����ꂽ�Ƃ����{��";
		mes "�̔����ɗ������Ƃ������ł��B";
		next;
		mes "[�q�G�[��]";
		mes "���̎��ɔL�͂��������܂����B";
		mes "�����������Ă�����e�Ɋւ���";
		mes "�L�Ӌ`�ȓ��e�������ꂽ�{������A�ƁB";
		mes "�������e��m���Ă���͂��͂Ȃ����A";
		mes "���܂�ɓ˔��q�������b�������̂�";
		mes "�ǂ��o���Ă��܂����̂ł��B";
		next;
		menu "�L�͋����ւ��b�ɂ͐����ł�",-;
		mes "[�q�G�[��]";
		mes "������������ł��ˁB";
		mes "��������Ɩ{���������̂��B";
		mes "���������̎��̌������c�c�B";
		mes "�܂����̎��͂����Ƃ��܂��傤�B";
		mes "������ł��B";
		next;
		mes "[�q�G�[��]";
		mes "���̂悤�Ȃ��Ƃ𗊂ނ̂�";
		mes "�\����Ȃ��̂ł����A";
		mes "���߂Ă��̔L��������";
		mes "���Ԃ̍z�΂Ɋւ������";
		mes "���ׂė��Ă��炦�܂��񂩁H";
		next;
		mes "[�q�G�[��]";
		mes "�������ڍs���΂����̂ł��傤���A";
		mes "���Ă̒ʂ茤���𑱂��Ȃ��Ă�";
		mes "�����Ȃ����̂ł�����c�c�B";
		mes "���肢���܂��B�ǂ��ł��傤���H";
		next;
		if(select("��`��","�f��") == 2) {
			mes "[�q�G�[��]";
			mes "�����ł����c�c�B";
			mes "����ς�A�����ł����B";
			mes "����Ȃ炵�傤���Ȃ��ł��ˁB";
			set ECL_6QUE,9;
			close;
		}
		mes "[�q�G�[��]";
		mes "�����I�@�{���ɂ��肪�Ƃ��������܂��I";
		mes "���̉��͌������ʂ��o���ꍇ��";
		mes "�K�����Ԃ����܂��I";
		mes "�ł͂��̊ԁA���͕���������";
		mes "���������Ă����܂��B";
		next;
		mes "[�q�G�[��]";
		mes "�~�b�h�K���h�A���R���Ԓn��";
		mes "�V�G���r�[�Ƃ����L������͂��ł��B";
		mes "���肢���܂��B";
		set ECL_6QUE,10;
		delquest 72556;
		setquest 12284;
		close;
	case 9:
		mes "[�q�G�[��]";
		mes "����A���̗��݂𕷂��Ă���܂����H";
		mes "�L���狷�Ԃ̍z�΂Ɋւ������";
		mes "���ׂė��Ă��炦�܂����H";
		next;
		if(select("��`��","�f��") == 2) {
			mes "[�q�G�[��]";
			mes "�����ł����c�c�B";
			mes "����ς�A�����ł����B";
			mes "����Ȃ킴�킴�b�ɗ��āA";
			mes "�܂��f��Ȃ��Ă��c�c�B";
			close;
		}
		mes "[�q�G�[��]";
		mes "�����I�@���肪�Ƃ��������܂��I";
		mes "���̉��͌������ʂ��o���ꍇ��";
		mes "�K�����Ԃ����܂��I";
		mes "�ł͂��̊ԁA���͕���������";
		mes "���������Ă����܂��B";
		next;
		mes "[�q�G�[��]";
		mes "�~�b�h�K���h�A���R���Ԓn��";
		mes "�V�G���r�[�Ƃ����L������͂��ł��B";
		mes "���肢���܂��B";
		set ECL_6QUE,10;
		delquest 72556;
		setquest 12284;
		close;
	case 10:
	case 11:
	case 12:
		mes "[�q�G�[��]";
		mes "�L�̎�T�[�r�X�́A";
		mes "���[������G���f�B�J�X�e�B�X�̊Ԃ܂�";
		mes "�F�X�ȏꏊ�ɂ��܂��B";
		mes "���炭�̓~�b�h�K���h�A���R���Ԓn��";
		mes "����͂��ł����c�c�B";
		close;
	case 13:
		mes "[�q�G�[��]";
		mes "�����A�ǂ��ł������B";
		mes "�������ʂ�����܂������H";
		next;
		menu "�L���畷�����b��`����",-;
		mes "[�q�G�[��]";
		mes "�����ł������B";
		mes "�ł̔j�ЂɃW�F���X�g�[���A���B";
		mes "�ǂ�������߂ĕ������O�ł��B";
		mes "�����ɂ͖������Ȃ�ł��傤�B";
		mes "�����s�����Ƃ���������";
		mes "�s�\�ɋ߂����������̂��c�c�B";
		next;
		if(countitem(7798) > 0 && countitem(715) > 1 && countitem(716) > 1 && countitem(717) > 1) {
			set '@flag,1;
		}
		switch(select("���߂܂��傤",'@flag? "�K�v�ȕ����W�߂Ă���": "�K�v�ȕ����W�߂Ă݂�")) {
		case 1:
			mes "[�q�G�[��]";
			mes "��͂蕨���̌����ɔ�����s����";
			mes "�s�\����ȁc�c�B";
			close;
		case 2:
			if(!'@flag) {
				mes "[�q�G�[��]";
				mes "�{���ł����H�@���񂨊肢���܂��B";
				mes "������������܂��I";
				mes "���͂����ő҂��Ă��܂��B";
				close;
			}
			break;
		}
		mes "[�q�G�[��]";
		mes "�����A���ꂪ���̗�́A";
		mes "�ł̔j�ЂƃW�F���X�g�[���ł����B";
		mes "���ꂳ������Ύ�����";
		mes "�����邱�Ƃ��ł��܂��B";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		if(select("�p�ӂ�������n��","�p�ӂ͂������n���Ƃ͌����ĂȂ�") == 2) {
			mes "[�q�G�[��]";
			mes "�������I�@�������Ă��ꂽ�̂�";
			mes "�n���Ă���Ȃ���ł����c�c�B";
			mes "����ȁB";
			close;
		}
		mes "[�q�G�[��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���̌�������������΁A";
		mes "���t�B�l�Ȋw�j��";
		mes "�傫�ȍv��������ł��傤�B";
		mes "���Ȃ��̂������ł��B";
		mes "�z�[���c���[�̏j��������܂��悤�ɁB";
		delitem 7798,1;
		delitem 715,2;
		delitem 716,2;
		delitem 717,2;
		set ECL_6QUE,14;
		delquest 12286;
		setquest 12287;
		getexp 120000,0;
		getexp 0,80000;
		close;
	case 14:
		mes "[�q�G�[��]";
		mes "���āA���ꂶ�Ⴀ���ۂɂ�����g����";
		mes "�����ɒu���Ă������āA�Ɓc�c�B";
		mes "����c�c�ς��ȁH";
		mes "�m���ɖ{�ɏ�����Ă���ʂ��";
		mes "�z��ɂȂ��Ă���͂��Ȃ񂾂��B";
		mes "�ǂ����Ĕ������Ȃ��񂾁B";
		next;
		mes "[�q�G�[��]";
		mes "���`��";
		mes "��������΂����̂��ȁH";
		mes "����A�Ⴄ�ȁB";
		mes "���������I";
		mes "����A�������H";
		mes "�c�c�c�c";
		next;
		mes "[�q�G�[��]";
		mes "�ǂ����ă_���Ȃ񂾂�I";
		mes "�������𕷂���!!";
		mes "���̂悤�ɔz�񂵂���";
		mes "���������������Ԃ��Ă���ׂ����낤�I";
		mes "���̂Ȃ񂾁I";
		next;
		mes "^000099�]�v���ʂ�i�܂��A�\���q�G�[���B";
		mes "�@���q�Ɏ肩��ł̔j�Ђ��]���������B";
		mes "�@���̂܂܂ł͈ł̔j�Ђ��c�c�I�]^000000";
		next;
		menu "���L�΂��ł̔j�Ђ�͂�",-;
		mes "^000099�]���ɗ��������Ȉł̔j�Ђ�";
		mes "�@����ł̏��Œ͂ݎ��A";
		mes "�@�q�G�[�����ׂ̂Ă����z��̒���";
		mes "�@�����Ɩ߂����]^000000";
		next;
		mes "�]���̏u�ԁI�]";
		next;
		sc_start3 SC_BLIND,0,0,0,0,60000,10;
		mes "^000099�]�ڂ̑O���Â��Ȃ�";
		mes "�@�������炩�����������Ă����]^000000";
		next;
		cutin "EP14_etran0",1;
		mes "[�H�H�H�H]";
		mes "�Ⴆ�΁A�N���b���Ă����ʂ�";
		mes "�z�[���c���[��";
		mes "��Ɋ����������Ƃ��悤�B";
		mes "�����A���̌�͂ǂ�����H";
		mes "�z���z�����ދ���ȃG�l���M�[��";
		mes "�ǂ�����Ƃ����񂾁H";
		next;
		cutin "EP14_robert0",1;
		mes "[�H�H�H�H]";
		mes "�m���ɂ��̒ʂ肾�B";
		mes "�z�[���c���[�𐶂��Ԃ点��ɂ́A";
		mes "�z�����͂邩�ɒ����鐶���͂��K�v���B";
		mes "�����A����ł��z�[���c���[��";
		mes "�����Ԃ点�Ȃ��Ƒʖڂ��B";
		mes "�K���K�v���B";
		next;
		cutin "EP14_etran0",1;
		mes "[�H�H�H�H]";
		mes "���̊ԂɎ���ł���";
		mes "���̐����̂����͂ǂ�����B";
		mes "�z�[���c���[�̊����̂��߂�";
		mes "���\�N�A���S�N�ԂƂ������ԁA";
		mes "�z�[���c���[�E�G��";
		mes "�s�т̒n�ɂȂ邩���m��Ȃ��񂾂��I";
		next;
		mes "[�H�H�H�H]";
		mes "����A�ԈႢ�Ȃ��Ȃ�I";
		mes "�z�[���c���[�ȊO�̐����͑S�ł��B";
		mes "�z�[���c���[�͖���������ׂ̕����I";
		mes "���ꂶ�Ⴀ�{���]�|����Ȃ���?!";
		next;
		cutin "EP14_robert0",1;
		mes "[�H�H�H�H]";
		mes "�z�[���c���[�����ɐ������ێ����Ă��A";
		mes "�ǂ��������͎����Ȃ��񂾁B";
		mes "������x�̋]���͊o�債�Ȃ��Ƒʖڂ��B";
		mes "����͒N�������O��";
		mes "�m���Ă��邾�낤�I";
		next;
		cutin "EP14_etran0",1;
		mes "[�H�H�H�H]";
		mes "��͂�z�[���c���[������������";
		mes "���̗͂𗘗p���鎖�ŕ��s����";
		mes "��n�𐶂��Ԃ点��A�Ƃ������@��";
		mes "��ԑ������A�V���v�����낤�B";
		next;
		mes "[�H�H�H�H]";
		mes "�����A������ɂ��悱�̌��f��";
		mes "��X�̖��^��傫�����E����̂�";
		mes "�ԈႢ�Ȃ������c�c�B";
		mes "�ʂ����Ă���Ȍ�������X��";
		mes "����񂾂낤���c�c�I";
		next;
		mes "[�H�H�H�H]";
		mes "�z�[���c���[�𐶂�������";
		mes "�{���ɐ��������Ȃ̂��H";
		mes "�������E����悤�Ȍ����Ȃ�";
		mes "�N�����ׂ��ł͂Ȃ��񂶂�Ȃ����H";
		next;
		cutin "EP14_robert0",1;
		mes "[�H�H�H�H]";
		mes "�ӂӁB�ǂ��������Ă���ȁA�G�X�����B";
		mes "�K���I���͕K�v���B";
		mes "���ꂪ������Ƃ��������B";
		mes "�N�������߂Ȃ���΂����Ȃ��B";
		next;
		mes "[�H�H�H�H]";
		mes "�܂��A��������l�����Řb���Ă�";
		mes "�����J���Ȃ����낤�B";
		mes "���͌��V��̌���ɏ]�����Ƃɂ����B";
		set ECL_6QUE,15;
		delquest 12287;
		setquest 72560;
		close2;
		cutin "EP14_robert0",255;
		sc_end SC_BLIND;
		end;
	case 15:
		mes "[�q�G�[��]";
		mes "���A���́I�@���A�������܂����H";
		mes "�����������I";
		mes "��̂ǂ����������I";
		mes "�����ɐ��������̂��H";
		next;
		menu "�����������e��`����",-;
		mes "[�q�G�[��]";
		mes "���Ɠ������e�ł��ˁB";
		mes "���̘b�������񂾂낤�B";
		mes "�z�[���c���[�̑n���H";
		mes "����Șb�͕��������Ƃ��Ȃ��B";
		next;
		mes "[�q�G�[��]";
		mes "�����b�𕷂����Ƃ�������";
		mes "���̑��u�̎d�Ƃ��c�c�B";
		mes "�H��łȂ��̂Ȃ�A";
		mes "������x��邩������Ȃ��B";
		mes "������Ɗm�F�����Ă݂܂��B";
		next;
		mes "^000099�]���������ƃq�G�[���́A";
		mes "�@�Ăь����ɔz��𓮂����n�߂��]^000000";
		next;
		mes "^000099�]����������ɋ��Ԃ̍z�΂�";
		mes "�@�����������Ȃ��]^000000";
		next;
		mes "[�q�G�[��]";
		mes "�ӂ��B�ʖڂ��B";
		mes "�����������Ă��������Ȃ��ł��B";
		mes "��x����Ă݂܂����H";
		set ECL_6QUE,16;
		delquest 72560;
		setquest 12288;
		close;
	case 16:
		mes "[�q�G�[��]";
		mes "�����������Ă��������Ȃ��ł��B";
		mes "��x����Ă݂܂����H";
		close;
	case 17:
		mes "[�q�G�[��]";
		mes "��͂肱��͗�I�ȓ��e�ł͂Ȃ��A";
		mes "���݂����󋵂��f���Ă���悤�ł��ˁB";
		mes "�ߋ��ɂ��������o�����ł��傤�B";
		next;
		mes "[�q�G�[��]";
		mes "���j�̈ꕔ�����Ă���̂��c�c";
		mes "����͐����������B";
		next;
		menu "��قǂ̐��͒N�ł����H",-;
		mes "[�q�G�[��]";
		mes "���݂܂���B";
		mes "���͗��j�ɂ͏ڂ�������܂���B";
		mes "�����A���̕��ʂȂ��l";
		mes "�{���ɍō��Ƃ����l�ނ����܂��B";
		mes "���Ȃ����悭�������̕��ł���B";
		next;
		menu "���������āA�N�����@�[�H",-;
		mes "[�q�G�[��]";
		mes "�������I";
		mes "�m���ɑ����ȕς��҂ł����A";
		mes "�l�Êw����j�Ɋւ���m����";
		mes "�ԈႢ����܂���B";
		next;
		mes "[�q�G�[��]";
		mes "��قǂ̉�b�𒲂ׂ�̂ł����";
		mes "�N�����@�[��K�˂Ă݂Ă��������B";
		mes "���͂����̔z������������A";
		mes "�ڂ����������Č��邱�Ƃɂ��܂��B";
		set ECL_6QUE,18;
		delquest 72562;
		setquest 12289;
		close;
	case 18:
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
	case 24:
	case 25:
		mes "[�q�G�[��]";
		mes "��قǂ̉�b�𒲂ׂ�̂ł����";
		mes "�N�����@�[��K�˂Ă݂Ă��������B";
		mes "���͂����̔z������������A";
		mes "�ڂ����������Č��邱�Ƃɂ��܂��B";
		close;
	case 26:
		mes "[�q�G�[��]";
		mes "�����A����ɂ��́B�����Ƃ���ɁB";
		mes "���͂��Ȃ������Ȃ��Ԃ�";
		mes "�����^�щ\�Ȍg�їp�����ʐM�@��";
		mes "����Ă݂���ł����c�c";
		mes "������肪����܂��āc�c�B";
		next;
		menu "���H",-;
		cutin "EP14_robert5",1;
		mes "[�H�H�H�H]";
		mes "�N�͒N���I";
		mes "�ǂ����Ď��Ɠ����p�����Ă���H";
		mes "������I�@���V��̍�������!?";
		next;
		cutin "EP14_robert5",255;
		mes "[�q�G�[��]";
		mes "���������Ď��̘b�𕷂��ĉ������B";
		mes "���̓q�G�[���Ƃ����܂��B";
		next;
		mes "[�q�G�[��]";
		mes "�����A���G�Ȏ���F�X�d�Ȃ��Ă��āA";
		mes "���́A���ƌ����΂����̂��c�c�B";
		next;
		mes "^000099�]�q�G�[���ƂƂĂ������h�i��";
		mes "�@�q�G�[�����ɂ�ł���B";
		mes "�@���̃h�i�͉����낤�H�]^000000";
		next;
		menu "���O�𕷂�",-;
		cutin "EP14_robert5",1;
		mes "[�H�H�H�H]";
		mes "�����H�@���̖��O��^000099���x��^000000�B";
		mes "�㋉�����p�t���B";
		mes "�ڂ̑O�ɂ��鎄��������ȓz��";
		mes "�N�͂ǂ������֌W�Ȃ񂾁H";
		next;
		mes "^000099�]�ނ��ǂ���烍�x���̂悤���]^000000";
		next;
		menu "���܂ł̏󋵂��������",-;
		cutin "EP14_robert1",1;
		mes "[���x��]";
		mes "�Ȃ񂾂ƁI";
		mes "�܂荡�b���Ă���N�B��";
		mes "�����ɏZ�ގ҂��Ƃ������ƂȂ̂��H";
		mes "����Ȏ����\�Ȃ̂�!?";
		next;
		mes "[���x��]";
		mes "�ɂ킩�ɂ͔[���ł��Ȃ��b���ȁB";
		mes "�c�c";
		mes "�c�c�����ɂ��Ȃ��Ă����B";
		next;
		cutin "EP14_robert1",255;
		mes "["+strcharinfo(0)+"]";
		mes "���̑��u�͂����ɂ���";
		mes "�q�G�[�����p�ӂ������̂ł��B";
		next;
		cutin "EP14_robert1",1;
		mes "[���x��]";
		mes "�Ȃ�قǁB";
		next;
		cutin "EP14_robert1",255;
		mes "[�q�G�[��]";
		mes "�͂��B�܂��͍��̏󋵂�����v���܂��B";
		next;
		mes "^000099�]�q�G�[���͍��܂ł̎������e��";
		mes "�@�ǉ��Ő������n�߂��B";
		mes "�@���x���̓q�G�[���̘b�Ɏ����X��";
		mes "�@���x�����Ȃ����Ă����]^000000";
		next;
		mes "[�q�G�[��]";
		mes "����͂�����������ȏ��ł��B";
		mes "���݂܂���A�ƂĂ��������Ă���";
		mes "�S�𗎂��������邱�Ƃ�����ł��B";
		mes "���x���l���{���ɑ��݂��Ă����Ƃ́B";
		next;
		mes "[�q�G�[��]";
		mes "���x���l�͎����������҂ɂƂ��Ă�";
		mes "�`���̂悤�ȕ��ł��B";
		mes "���݂��Ă��������M�����Ȃ����ł��B";
		next;
		mes "[�q�G�[��]";
		mes "���̋���ȃz�[���c���[�Ƃ��������̂�";
		mes "��n�A���Z�n�ƗZ�������č\�z����";
		mes "���̔��z�Ǝ�@��";
		mes "�ƂĂ��f���炵�����ł��B";
		next;
		cutin "EP14_robert3",1;
		mes "[���x��]";
		mes "�z�[���c���[�B";
		mes "���܂�������̂��c�c�B";
		mes "�����\���͔����ƍl���Ă����񂾂��A";
		mes "����Ȗ����ɂ܂Ŗ��ɗ����Ă���Ƃ́B";
		mes "�������B";
		next;
		mes "[���x��]";
		mes "�������{���Ȃ̂��H";
		next;
		menu "�����ł�",-;
		cutin "EP14_robert1",1;
		mes "[���x��]";
		mes "�s�\���Ǝv���Ă����B";
		mes "���߂Ȃ��Ă悩�������c�c";
		mes "�ǂ����������N����B";
		mes "������Ƃ��܂Ȃ����A����������";
		mes "�z�[���c���[�̑O�܂ňē����Ă���I";
		mes "�R����Ȃ����������Ă���I";
		set ECL_6QUE,27;
		delquest 12293;
		setquest 12294;
		close2;
		cutin "EP14_robert1",255;
		end;
	case 27:
		mes "[�q�G�[��]";
		mes "�z�[���c���[�͒����L��ɂ���܂��B";
		close;
	case 28:
		mes "[�q�G�[��]";
		mes "���[�ށc�c��͂肱�����B";
		mes "�o�͂�����Ȃ��񂾂ȁB";
		mes "�ƂȂ�Ɓc�c������c�c";
		next;
		mes "[�q�G�[��]";
		mes "���A���x���l�͂ǂ��ł������B";
		mes "�z�[���c���[������";
		mes "���������Ă��܂������B";
		next;
		menu "�r���ŏ����Ă��܂��܂���",-;
		mes "[�q�G�[��]";
		mes "�����ł������c�c�B";
		mes "���̌g�їp�����ʐM�@��";
		mes "�܂��o�͂��悭�Ȃ���ł��B";
		mes "�܂�g����͈͂�������ł��B";
		next;
		mes "[�q�G�[��]";
		mes "���x���l�Ƃ̌�M���s�����߂�";
		mes "���̋@�B�̔N��L���g����";
		mes "��قǔ������������ŌŒ肵�܂����B";
		mes "���炭����œ��������";
		mes "���x���l�ɌJ��Ԃ����͂��ł��B";
		next;
		mes "[�q�G�[��]";
		mes "�����c�c����̏ꏊ�݂̂ł���";
		mes "��Ȃ��Ƃ�����肪����܂��B";
		next;
		menu "�ꏊ��ς���ΐF�X���H",-;
		mes "[�q�G�[��]";
		mes "�m���ł͂���܂��񂪁A";
		mes "���̗\�z�ł͂����Ȃ�܂��B";
		mes "���������������݂̏ꍇ�A";
		mes "�ʐM�@�͈̔͂��痣����";
		mes "������Ƃ̌�M���f�₳���悤�ł��B";
		next;
		mes "[�q�G�[��]";
		mes "^000099�i�ƂĂ��Â��y�������Ȃ���j^000000";
		mes "���x���l�Ƃ̘A���͓r�؂�܂������A";
		mes "���̕��������Ă����y����";
		mes "�ق�B�c���Ă���ł��傤�B";
		next;
		menu "�G�X�����ɂ�������ł���H",-;
		mes "[�q�G�[��]";
		mes "���_��͂����ł��ˁB";
		mes "�������A�G�X�����l�ɉ�ɂ�";
		mes "�G�X�����l�ɉ��ꏊ��T����";
		mes "�����ɍs���Ȃ���΂Ȃ�܂���B";
		next;
		mes "[�q�G�[��]";
		mes "�o�͂�啝�ɍL����";
		mes "�����͈͂��L�����";
		mes "�\�����m��܂��񂪁A";
		mes "�܂��s����Ȃ̂Łc�c�B";
		next;
		menu "���ɂ��̒ʐM�@��݂��Ă�������",-;
		mes "[�q�G�[��]";
		mes "�܂��������������";
		mes "���ӂ�T������C�ł����H";
		mes "�����ł���I�@�O�͊댯�ł��I";
		while(1) {
			next;
			if(select("���͑��v�ł�","���Ȃ��̗��_���m���߂����ł��傤") == 1)
				break;
			mes "[�q�G�[��]";
			mes "���₢��A";
			mes "���Ȃ��̐S�z�͂��Ă��܂���B";
			mes "���̑厖�ȒʐM�@��";
			mes "����̂��S�z�Ȃ�ł��B";
		}
		mes "[�q�G�[��]";
		mes "���c�c";
		next;
		mes "[�q�G�[��]";
		mes "���������c�c";
		next;
		mes "�]�q�G�[���͂������Y��ł���]";
		next;
		mes "[�q�G�[��]";
		mes "�����c�c�m���ɁB";
		mes "�댯�͂��Ȃ肠��܂���";
		mes "���Ȃ��̌����Ƃ���ł��B";
		mes "�m���߂����I�@���ʂ�m�肽���I";
		mes "�Ȋw�҂Ƃ��Ă̐����c�c�B";
		next;
		mes "[�q�G�[��]";
		mes "�c�c���傤���Ȃ��B";
		mes "��΂ɉ󂳂Ȃ��ŉ������I";
		mes "������\���̒ʐM�@�͍��܂�����";
		mes "�������ς�ł���̂͂��ꂾ���ł��B";
		mes "��΂ɖ������Ȃ��ł���������!!!";
		next;
		mes "^000099�]�q�G�[������";
		mes "�@�����ʐM�@���؂肽�B";
		mes "�@�ʐM�@����o�Ă���G�l���M�[��";
		mes "�@�j���̗͂ƂȂ��đ̂ɓ����Ă����]";
		set ECL_6QUE,29;
		delquest 12295;
		setquest 12296;
		getexp 120000,0;
		getexp 0,80000;
		next;
		mes "[�q�G�[��]";
		mes "�G�X�����l�̋��ꏊ�ň�ԗL�͂ȏꏊ��";
		mes "�r�t���X�g�^���[�ł��B";
		mes "�r�t���X�g�^���[�͊X�̊O�A";
		mes "�Ԃ��炫�n�߂���n�̓�ɂ���܂��B";
		mes "���ꂮ����A�C��t���Ă��������B";
		close;
	case 29:
	case 30:
	case 31:
		mes "[�q�G�[��]";
		mes "�C�����Ďg�p���ĉ������B";
		mes "�������ғ����\�Ȃ̂�";
		mes "�����䂵���Ȃ���ł��B";
		close;
	case 32:
		mes "[�q�G�[��]";
		mes "���A��Ȃ����B�ӂӂ�";
		mes strcharinfo(0)+ "���񂪂��Ȃ��Ԃ�";
		mes "�ʐM�@�ɐF�X�ȋ@�\��";
		mes "�ǉ����Ă����܂�����B";
		next;
		mes "[�q�G�[��]";
		mes "����ł��Ȃ�L�͈͂�";
		mes "���Ԃɔ������鎖���\�ɂȂ�܂����B";
		mes "���āc�c����̖��O�͉��ɂ��邩�B";
		next;
		menu "�z�[���c���[�̗t���~������ł���",-;
		mes "[�q�G�[��]";
		mes "�����H�@�}�ɉ���������ł����B";
		mes "�����ʐM�@�̐��\��������悭�Ă�";
		mes "�z�[���c���[�܂őn�����邱�Ƃ�";
		mes "�o���܂����B����͌�M�@�Ȃ�ł��B";
		next;
		menu "�G�X�����Ƃ̖񑩂��������",-;
		mes "[�q�G�[��]";
		mes "�Ȃ�قǁB";
		mes "�����������ł����B";
		mes "�����c�c";
		next;
		mes "[�q�G�[��]";
		mes "����ł��ˁB";
		mes "�z�[���c���[������ɑ�������s�ׂ́A";
		mes "�G�N���[�W���ł͕s�@�s�ׂł��B";
		mes "���Ǖ�����܂��B";
		next;
		mes "[�q�G�[��]";
		mes "�܂��A�͂ꂽ�z�[���c���[�̗t��";
		mes "�n�ʂɗ����Ȃ���ł��B";
		mes "�������Ɛ����G�l���M�[�ɕς��";
		mes "���̂܂܎��ɋz������܂��B";
		mes "�����t�Ƃ��ďE�������s�\�Ȃ�ł��B";
		next;
		mes "[�q�G�[��]";
		mes "���[��c�c�������@���Ȃ����ȁB";
		next;
		mes "[�q�G�[��]";
		mes "���[�ށc�c��c�c�H";
		next;
		mes "[�q�G�[��]";
		mes "������c�c";
		mes "������ł���B";
		next;
		mes "[�q�G�[��]";
		mes "�z�[���c���[�̑n���傪";
		mes "�z�[���c���[�̗t��";
		mes "�n���Ă����Ƃ�����";
		mes "����͕s�@�s�ׂł͂Ȃ��Ǝv���܂��B";
		next;
		menu "���x���H",-;
		mes "[�q�G�[��]";
		mes "�����ł��B";
		mes "��������B���ꂪ��Ԃ����I";
		mes "���x���l���n���Ă����΁A";
		mes "�󂯎�邱�Ƃ��ł��܂��B";
		next;
		mes "[�q�G�[��]";
		mes "�}���Ń��x���l�ƌ�M���Ă݂܂��傤�B";
		next;
		mes "[�q�G�[��]";
		mes "�����ƌ��܂�Α����A";
		mes "��M���n�߂܂��傤���B";
		mes "�ʐM�@�Ɏ��u���ĉ������B";
		set ECL_6QUE,33;
		delquest 12298;
		setquest 12299;
		close;
	case 33:
		mes "[�q�G�[��]";
		mes "�����ʐM�@�ɏW�����ĉ������B";
		close;
	case 34:
		mes "[�q�G�[��]";
		mes "���x���l�c�c";
		mes "�{���Ɏ����ɂ������肾�ȁB";
		next;
		menu "�i���i�͂܂�Ŏ��Ă��Ȃ����c�c�j",-;
		mes "[�q�G�[��]";
		mes "�܂���x��������Ă��Ȃ����ǁA";
		mes "�ƂĂ��e�ߊ����N���܂��B";
		mes "���̊����A���Ɛ�������΂����̂��B";
		next;
		mes "[�q�G�[��]";
		mes "�����ƁB";
		mes "�ʐM�@����ڂ𗣂��Ȃ��ŉ������B";
		mes "��M���q�����Ă����Ԃł��B";
		set ECL_6QUE,35;
		delquest 72574;
		setquest 72576;
		close;
	case 35:
		mes "[�q�G�[��]";
		mes "�܂���M���q�����Ă����Ԃł��B";
		mes "�ʐM�@���m�F���Ă݂Ă��������B";
		close;
	case 36:
		mes "[�q�G�[��]";
		mes "�ʐM�͏I���܂������B";
		mes "�ǂ��ł������B";
		next;
		mes "[�q�G�[��]";
		mes "�����c�c���ꂪ�c�c�B";
		mes "�ŏ��ɍ��ꂽ";
		mes "�z�[���c���[�̗t�ł����B";
		mes "���`��A�P�����������B";
		next;
		mes "[�q�G�[��]";
		mes "������G�X�����l�ɓ͂����ł��ˁB";
		mes "�����~�����Ƃ���ł����c�c";
		mes "�䖝�䖝�B";
		mes "�����A�����͂��Ă��Ă��������B";
		close;
	case 37:
		mes "[�q�G�[��]";
		mes "���[�A���A��Ȃ����B";
		mes "������̉��ǂ��قڏo���܂�����B";
		next;
		mes "[�q�G�[��]";
		mes "�ʐM�@�͈̔͂�";
		mes "���̃G�N���[�W���𒴂���";
		mes "�r�t���X�g�S�n��܂�";
		mes "����ł���悤�ɂȂ�܂����B";
		next;
		mes "[�q�G�[��]";
		mes "������������������";
		mes "�N��L�܂Ŏ��R���݂�";
		mes "�I���\�ɂȂ肻���ł��B";
		next;
		menu "�G�X�����̌��t��`����",-;
		mes "[�q�G�[��]";
		mes "�����A�{���ł����H�@����͗ǂ������B";
		mes "�����c�c�����G�X�����l�ƃ��x���l��";
		mes "���̒ʐM�@��ʂ���";
		mes "������x�ĉ�ł���悤��";
		mes "�͂ɂȂ鎖���o����΁c�c�B";
		next;
		cutin "EP14_robert1",1;
		mes "^000099�]��u�A�q�G�[���̏Ί炩��";
		mes "�@���x���̎p���d�Ȃ��Č������]^000000";
		next;
		cutin "EP14_robert1",255;
		mes "[�q�G�[��]";
		mes "�������B�Ō�ɃN�����@�[�ɂ�";
		mes "����s����񍐂��Ă�������";
		mes "�ǂ��ł����H";
		mes "����������Ǝv���܂���B";
		set ECL_6QUE,38;
		delquest 12301;
		setquest 72578;
		close;
	case 38:
		mes "[�q�G�[��]";
		mes "�N�����@�[�ɂ�";
		mes "����s����񍐂��Ă�������";
		mes "�ǂ��ł����H";
		mes "����������Ǝv���܂���B";
		close;
	case 39:
		mes "[�q�G�[��]";
		mes "�����ł����A�N�����@�[��";
		mes "����ȂƂ���ł����M���n�߂܂������B";
		mes "�����炵���ł��ˁB";
		next;
		mes "[�q�G�[��]";
		mes "�o�����Ă�������낢���";
		mes "�����N�����Ă��ꂻ���ł��B";
		next;
		mes "�]�q�G�[���͂����Ƃ�����������";
		mes "�@��΂����]";
		next;
		mes "[�q�G�[��]";
		mes "�Ƃ���Ŏ����ʐM�@�ł����A";
		mes "����ɉ��ǂ��Ă݂܂����B";
		mes "�`�����l����F�X�������Ă݂��̂�";
		mes "�����o�邩�͎����m��܂��񂪁A";
		mes "�ǂ�������g���Ă݂Ă��������B";
		next;
		mes "�]�q�G�[���͎����ʐM�@��";
		mes "�@����ɉ��ǂ����炵���B";
		mes "�@�����ʐM�@�𒲂ׂĂ݂悤�]";
		set ECL_6QUE,40;
		delquest 72580;
		setquest 72582;
		close;
	case 40:
		mes "[�q�G�[��]";
		mes "�����ł����A�N�����@�[��";
		mes "����ȂƂ���ł����M���n�߂܂������B";
		mes "�����炵���ł��ˁB";
		next;
		mes "[�q�G�[��]";
		mes "�o�����Ă�������낢���";
		mes "�����N�����Ă��ꂻ���ł��B";
		next;
		mes "�]�q�G�[���͂����Ƃ�����������";
		mes "�@��΂����]";
		next;
		mes "[�q�G�[��]";
		mes "�Ƃ���Ŏ����ʐM�@�ł����A";
		mes "����ɉ��ǂ��Ă݂܂����B";
		mes "�`�����l����F�X�������Ă݂��̂�";
		mes "�����o�邩�͎����m��܂��񂪁A";
		mes "�ǂ�������g���Ă݂Ă��������B";
		next;
		mes "�]�q�G�[���͎����ʐM�@��";
		mes "�@����ɉ��ǂ����炵���B";
		mes "�@�����ʐM�@�𒲂ׂĂ݂悤�]";
		close;
	case 41:
		mes "[�q�G�[��]";
		mes "���ꂩ��F�X�Ƃ�鎖�������āA";
		mes "���������ς�炸�Z�����ł��B";
		next;
		if(select("�G�k������","�G�X�����̎����ɂ��ĕ���") == 1) {
			mes "[�q�G�[��]";
			mes "�����ʐM�@�ł����H";
			mes "���̏��A��ʂ�̉��ǂ͏I���܂����B";
			mes strcharinfo(0)+ "�l�ɂ�";
			mes "�F�X�Ƃ����b�ɂȂ�܂�������";
			mes "�D���Ȃ����g�p�ł���悤��";
			mes "���Ă���܂���B";
			next;
			mes "[�q�G�[��]";
			mes "���ł��D���Ȏ��ɗ���";
			mes "�g���Ă݂ĉ������B";
			mes "�`�����l����F�X�������Ă݂��̂�";
			mes "�����o�邩�͎����m��܂���B";
			close;
		}
		mes "[�q�G�[��]";
		mes "�G�X�����l�̎����ł����H";
		mes "����Ȗ��͐΂Ō��ʂ�";
		mes "�t�^���鎖���ł��܂��B";
		mes "���������͐΂̍쐬��p�Ƃ���";
		mes "�X�v�����f�B�b�h�R�C����10��";
		mes "�K�v�ł��B";
		next;
		mes "^ff0000�]�G�X�����̎����𕡐��������Ă���";
		mes "�@�ꍇ�A�ǂ̎����Ɍ��ʂ�t�^���邩";
		mes "�@�I�Ԃ��Ƃ͂ł��܂���̂ŁA";
		mes "�@�����ӂ��������B";
		mes "�@���ʂ�t�^�����������݂̂�";
		mes "�@����������ԂŘb�������Ă��������]^000000";
		while(1) {
			next;
			switch(select("����͂�߂Ă���","���ʓ��e�𕷂�","���ʂ�t�^���ĖႤ")) {
			case 1:
				mes "[�q�G�[��]";
				mes "�͂��A���x�R�C�����p�ӂł�����";
				mes "�܂��K�˂ė��ĉ������B";
				close;
			case 2:
				mes "[�q�G�[��]";
				mes "�t�^�������ʂ�4��ނ̒�����";
				mes "���R�ɑI�����鎖���o���܂��B";
				mes "�K����������̂ň��S���Ă��������B";
				mes "���ɂ����\�͂�ύX�������ꍇ��";
				mes "�㏑������`�ŕύX���\�ł��B";
				mes "���ʂ̏ڍׂ𕷂��܂����H";
				while(1) {
					next;
					switch(select("�����\�͕t�^�ɂ���","���@�\�͕t�^�ɂ���","�������\�͕t�^�ɂ���","�񕜔\�͕t�^�ɂ���","��߂�")) {
					case 1:
						mes "[�q�G�[��]";
						mes "�����\�͂�t�^����ƁA";
						mes "�ȉ��̔\�͂����܂��B";
						next;
						mes "[��s1]";
						mes "Cri + 6";
						mes "Hit + 2";
						next;
						mes "[Atk2]";
						mes "�����U����";
						mes "�^����_���[�W + 2%";
						next;
						mes "[�q�G�[��]";
						mes "���������܂����H";
						continue;
					case 2:
						mes "[�q�G�[��]";
						mes "���@�\�͂�t�^����ƁA";
						mes "�ȉ��̔\�͂����܂��B";
						next;
						mes "[����3]";
						mes "Matk + 12";
						mes "�r������ - 8%";
						next;
						mes "[Matk1]";
						mes "Matk + 1%";
						mes "�Œ�r������ - 1%";
						next;
						mes "[�q�G�[��]";
						mes "���������܂����H";
						continue;
					case 3:
						mes "[�q�G�[��]";
						mes "�������\�͂�t�^����ƁA";
						mes "�ȉ��̔\�͂����܂��B";
						next;
						mes "[��s1]";
						mes "Cri + 6";
						mes "Hit + 2";
						next;
						mes "[���|1]";
						mes "�����������U����";
						mes "�^����_���[�W + 2%";
						next;
						mes "[�q�G�[��]";
						mes "���������܂����H";
						continue;
					case 4:
						mes "[�q�G�[��]";
						mes "�񕜔\�͂�t�^����ƁA";
						mes "�ȉ��̔\�͂����܂��B";
						next;
						mes "[�_�u����i��1]";
						mes "[�q�[��]";
						mes "[�T���N�`���A��]";
						mes "[�|�[�V�����s�b�`���[]";
						mes "[�n�C�l�X�q�[��]";
						mes "[�R���Z�I�q�[��]";
						mes "�g�p���AHP�񕜗� + 6%";
						next;
						mes "[�q�G�[��]";
						mes "���������܂����H";
						continue;
					case 5:
						break;
					}
					break;
				}
				mes "[�q�G�[��]";
				mes "�킩��܂����B";
				mes "���ɉ�������܂����H";
				continue;
			case 3:
				break;
			}
			break;
		}
		mes "[�q�G�[��]";
		mes "�킩��܂����B";
		mes "��啪��ł͂Ȃ��̂�";
		mes "�����ْ����܂��ˁc�c�B";
		mes "�ǂ̔\�͂�t�^���܂����H";
		next;
		switch(select("�����\�͕t�^","���@�\�͕t�^","�������\�͕t�^","�񕜔\�͕t�^","����ς��߂�")) {
		case 1:
			set '@slot[3],4818;
			set '@slot[4],4766;
			break;
		case 2:
			set '@slot[3],4813;
			set '@slot[4],4760;
			break;
		case 3:
			set '@slot[3],4818;
			set '@slot[4],4832;
			break;
		case 4:
			set '@slot[3],4805;
			set '@slot[4],4805;
			break;
		case 5:
			mes "[�q�G�[��]";
			mes "�킩��܂����B";
			mes "���ʂ�t�^�������Ȃ�����";
			mes "�܂����Ă��������B";
			close;
		}
		if(countitem(6081) < 10) {
			mes "[�q�G�[��]";
			mes "�X�v�����f�B�b�h�R�C����";
			mes "�s�����Ă���悤�ł��B";
			mes "1���10���A�K�v�ł��B";
			mes "�p�ӏo������܂����Ă��������B";
			close;
		}
		delitem 2915,1;
		delitem 6081,10;
		getitem2 2915,1,1,0,0,0,0,'@slot[3],'@slot[4];
		mes "[�q�G�[��]";
		mes "�ӂ��B";
		mes "���܂����ʂ��t�^����܂����B";
		close;
	default:
		mes "[�q�G�[��]";
		mes "�؂̗t�ꖇ�̒�����X�A";
		mes "���ϒl��M�A�����l��N";
		mes "�Łc�c�ƁA";
		mes "���U��L�ł��鐳�K���zP�́c�c";
		mes "�ӂނӂށA�Ȃ�قǁB";
		mes "�Ƃ������Ƃ́c�c";
		next;
		mes "^0000ff�]������Ȍv�Z�����Ă���]^000000";
		close;
	}
}

mid_camp.gat,173,257,5	script	�V�G���r�[	545,{
	switch(ECL_6QUE) {
	case 10:
		mes "[�V�G���r�[]";
		mes "�ӂ�B";
		mes "�L�̎�T�[�r�X���󂯂����̂Ȃ�A";
		mes "���ł͂Ȃ��A�L�̎�E����";
		mes "�K�˂�����������B";
		next;
		menu "���@���΂߂ł���",-;
		mes "[�V�G���r�[]";
		mes "�Ȃ񂾁H";
		mes "���C�ȔL��e�؂ȔL�����Ă���������";
		mes "�����ςɌ����邩�H";
		next;
		mes "[�V�G���r�[]";
		mes "�ɂ�`�A�ǂ������ɂ��`�H";
		mes "���A�{���ɔL�ʋl��D�����ɂ��`�I";
		mes "�c�c";
		mes "����Ȕ�����]��ł������H";
		next;
		mes "[�V�G���r�[]";
		mes "�L���N�ł������";
		mes "�P���ȓz�΂��肾�Ǝv���ŗ~�����ȁB";
		mes "����Ɏ��͍��ƂĂ��@���������񂾁B";
		mes "�����p������Ȃ�A";
		mes "���̔L��T���Č�����ǂ����ˁB";
		next;
		menu "�����̋��Ԃɂ��ĕ����Ă݂�",-;
		mes "[�V�G���r�[]";
		mes "�͂́A�L�ɂ���Ȃ��Ƃ𕷂����B";
		mes "�������ɂƂ��āA�Ȋw�Ƃ��������";
		mes "�܂�ŏd�v�ł͂Ȃ��񂾂�B";
		mes "�����������B";
		mes "�厖�Ȃ̂͏��ƂƋ��Ƃ�2�������B";
		mes "�����c�c";
		next;
		mes "[�V�G���r�[]";
		mes "�����Ƃ��Ĉ�����l�^�Ȃ񂩂�";
		mes "�׋�������d���ꂽ�������B";
		mes "�����̋��ԁH";
		mes "�m���ɏ�񂪖����킯�ł͂Ȃ��B";
		mes "�����Ǎ��͋@���������񂾁B";
		mes "�����ɂ��邻�̃|�[�h�̂����łˁI";
		next;
		mes "[�V�G���r�[]";
		mes "�܂������A�����͐H�ׂ鎖����";
		mes "���ɖ����̂��c�c�B";
		mes "������ƕ�V���x�ꂽ���x��";
		mes "�ԂԂԂԂA���܂ł��c�c";
		mes "���[���邳���z�߁I";
		mes "�������Ė���ĂȂ��񂾂�A�܂��I";
		next;
		mes "[�V�G���r�[]";
		mes "�Ƃ����킯�łˁB";
		mes "�c�O�����ǁA";
		mes "���̓z�ł��T���Ă݂���ǂ����H";
		set ECL_6QUE,11;
		delquest 12284;
		setquest 72558;
		close;
	case 11:
		mes "[�V�G���r�[]";
		mes "�c�O�����ǁA";
		mes "���̓z�ł��T���Ă݂���ǂ����H";
		close;
	case 12:
		if(countitem(12636) < 10 && countitem(6049) < 2 && countitem(6039) < 10) {
			mes "^000099�]�V�G���r�[�͑����ɖ����ł��B";
			mes "�@�Ȃ�Ƃ����Ď~�߂Ȃ��Ɓc�c�]^000000";
			next;
			mes "^000099�]�}���������Y�ʋl10��";
			mes "�@�܂�����2��";
			mes "�@���̂͂�����10��";
			mes "�@�ǂꂩ��n����";
			mes "�@���������������]^000000";
			close;
		}
		mes "^000099�]�����ɖ����ȃV�G���r�[��";
		mes "�@�p�ӂ����H�����������]^000000";
		next;
		mes "[�V�G���r�[]";
		mes "���H�@����́c�c�H";
		mes "�N�̎�ɂ��邻�̐H�ו���";
		mes "�ǂ������񂾁H";
		next;
		if(select("�����ŐH�ׂ镪�ł�","���Ȃ��B�ɓn�����߂Ɏ����Ă��܂���") == 1) {
			mes "[�V�G���r�[]";
			mes "�͂��H�@�l�ԂȂ̂ɁH";
			mes "�L�p�̐H�����H";
			mes "������킴�킴�����ɗ����̂��B";
			mes "�܂������l�Ԃ��Ă̂́c�c";
			next;
			mes "[�|�[�h]";
			mes "�V�G���r�[���悻�݂��Ă�I";
			mes "�|�[�h�̓`�����X�����Ȃ��I";
			mes "�@";
			mes "�{�b�J�[��";
			next;
			mes "[�V�G���r�[]";
			mes "���ĂĂĂ��I";
			mes "�c�c�c�c";
			mes "����̃o�J�L�߁I";
			mes "����������I�@����������!!!";
			next;
			mes "^000099�]�����͂܂��܂��������Ȃ����]^000000";
			close;
		}
		mes "[�V�G���r�[]";
		mes "�ӂ�B";
		mes "�{�����c�c�H";
		mes "�{���ɂ�����Ă����̂��H";
		next;
		if(select("���Ȃ玝���ċA��܂�","�ǂ��������܂���") == 1) {
			mes "[�V�G���r�[]";
			mes "���₢��B�҂��Ă���I";
			mes "�~�����I�@�m���ɗ~�����I";
			next;
		}
		mes "[�V�G���r�[]";
		mes "�ł́A���肪�����B";
		mes "�ӂ�B��������ƑΉ����K�v���ȁB";
		mes "�����~�����񂾁H";
		mes "��͂�A�ȑO�b���Ă���";
		mes "�����̋��ԂɊւ�����e���H";
		next;
		menu "�͂��A�������Ă�������",-;
		mes "[�V�G���r�[]";
		mes "�ӂ�B��͂�A���̌����B";
		mes "�ȑO�A�G�N���[�W���ł��̌���";
		mes "�������Ă�҂�����Ƃ�������";
		mes "�������ċ�J���ē��肵���񂾁B";
		mes "���̎��͓k�J�ɏI��������c�c";
		mes "����Ȍ`�Ŗ��ɗ��Ƃ͂ȁB";
		next;
		mes "[�V�G���r�[]";
		mes "�~�b�h�K���h�̊w�҂�����";
		mes "�\�ɏ������J���Ă��Ȃ��ĂˁB";
		mes "�܂���X�̏��Ԃ���g�����";
		mes "�ǂ��Ƃł��Ȃ�񂾂��ǂȁB";
		next;
		mes "[�V�G���r�[]";
		mes "�ł͋����悤�B";
		next;
		mes "[�V�G���r�[]";
		mes "�����̋��Ԃ̍z�΂�������������ɂ�";
		mes "�G�}�ɂȂ�^000099�ł̔j��^000000��1��";
		mes "�K�v�ƂȂ�B";
		next;
		mes "[�V�G���r�[]";
		mes "���Ԃ̓����N�̑̂�";
		mes "��������悤�łˁB";
		mes "�G�}���ގ����镨���K�v�炵���B";
		next;
		mes "[�V�G���r�[]";
		mes "�ł̌����̂�����΁A";
		mes "��苭�͂Ȍ��ʂ𔭊�����炵�����A";
		mes "�c�O�Ȃ��炻�̒������@��";
		mes "����ł��Ȃ������B";
		next;
		mes "[�V�G���r�[]";
		mes "����Ɉł̔j�Ђɉ�����";
		mes "�u���[�A�C�G���[�A���b�h�A";
		mes "�e�W�F���X�g�[����2���K�v���B";
		next;
		menu "�W�F���X�g�[���H",-;
		mes "[�V�G���r�[]";
		mes "�ł̔j�Ђ��G�}�ɂȂ���";
		mes "���Ԃ̍z�΂Ɣ������鎞�A";
		mes "���ӂɂ͂ƂĂ��傫�ȂЂ��݂��o����B";
		mes "�����̔����J���͂̔���p�̂悤���B";
		mes "���̎��A����p�𑊎E����͂�������";
		mes "�ǂ��Ȃ�H";
		next;
		mes "[�V�G���r�[]";
		mes "�N��������������񂶂�Ȃ����B";
		mes "�����N�Ŕ������������̋��Ԃ̂悤��";
		mes "���̎��ӂ͕���Ă��܂��B";
		mes "�����h���ׂɕK�v�Ȃ��̂�";
		mes "�W�F���X�g�[���A�Ƃ������炵���B";
		next;
		mes "[�V�G���r�[]";
		mes "����Ő����͊T�ˏI��肾�B";
		mes "�K�v�ȕ���������x������";
		mes "^000099�ł̔j��^000000��1��";
		mes "^000099�e�W�F���X�g�[��^000000��2����";
		mes "�ȏゾ�B";
		next;
		mes "[�V�G���r�[]";
		mes "�������A���Ԃ̍z�΂̂悤�ȕ���";
		mes "���������Ăǂ�����񂾁H";
		mes "�������낵�����ł����ł���̂��B";
		mes "�ӂ�B�܂��L�ɂ͊֌W�Ȃ������B";
		next;
		switch(select(
			((countitem(12636) >= 10)? "��������A�ʋl��n��": ""),
			((countitem(6049)  >=  2)? "��������A�܂�������n��": ""),
			((countitem(6039)  >= 10)? "��������A���̂͂������n��": "")
		)) {
		case 1:
			set '@itemid,12636;
			set '@num,10;
			break;
		case 2:
			set '@itemid,6049;
			set '@num,2;
			break;
		case 3:
			set '@itemid,6039;
			set '@num,10;
			break;
		}
		mes "[�V�G���r�[]";
		mes "���肪�����B�ӂ�B";
		mes "����ŐH���̐S�z�͂Ȃ��Ȃ����B";
		mes "�N���i�ޓ��ɔL�̐_����";
		mes "�j�������邱�Ƃ��F���Ă��B";
		delitem '@itemid,'@num;
		set ECL_6QUE,13;
		delquest 12285;
		setquest 12286;
		getexp 120000,0;
		getexp 0,80000;
		next;
		mes "�]�V�G���r�[���������肵���B";
		mes "�@�q�G�[���̂Ƃ���֖߂낤�]";
		close;
	derfault:
		if(ECL_6QUE < 13) {
			mes "[�V�G���r�[]";
			mes "�ӂ�B";
			mes "�L�̎�T�[�r�X���󂯂����̂Ȃ�A";
			mes "���ł͂Ȃ��A�L�̎�E����";
			mes "�K�˂�����������B";
			close;
		}
		mes "[�V�G���r�[]";
		mes "�������ɕK�v�ȍޗ���";
		mes "^000099�ł̔j��^000000��1��";
		mes "^000099�e�W�F���X�g�[��^000000��2����";
		mes "������ȁB�Y���Ȃ�B";
		close;
	}
}

mid_camp.gat,179,258,4	script	�|�[�h	544,{
	switch(ECL_6QUE) {
	case 11:
		mes "[�|�[�h]";
		mes "�����Ƃ��Ďx�������͂���";
		mes "^000099�}���������Y�ʋl^000000��";
		mes "�܂�������Ă��Ȃ��I";
		mes "�|�[�h�A�߂����B�����������c�c�B";
		mes "�������ɂ���^000099�V�G���r�[^000000��";
		mes "�s�@�������c�c�B";
		next;
		mes "[�|�[�h]";
		mes "�挎����������Ȃ������I";
		mes "������A�����";
		mes "^000099�}���������Y�ʋl^000000��10��";
		mes "�Ⴆ����Č����Ă����̂Ɂc�c�I";
		mes "�S�R���Ȃ��B�����������B";
		mes "�߂����B";
		next;
		mes "[�V�G���r�[]";
		mes "���������ɂ���A�|�[�h�I";
		mes "�����ɕ���������܂ł�";
		mes "���Ԃ�������Ɖ��x�������Ă邾�낤�I";
		next;
		menu "���́A�����̋��Ԃɂ��āc�c",-;
		mes "[�|�[�h]";
		mes "���H�@�Ȃ�??";
		mes "�|�[�h�͓�����Ƃ͒m��Ȃ��B";
		mes "�|�[�h�A�C���V�̎��͂悭�m���Ă���I";
		mes "�T�o���悭�m���Ă���I";
		mes "�����c�c���Ƃ���";
		mes "�V�G���r�[���悭�m���Ă���I";
		next;
		mes "[�|�[�h]";
		mes "�����ǁc�c";
		mes "�V�G���r�[���s�@�������A";
		mes "^000099�}���������Y�ʋl^000000�����炦�Ȃ����A";
		mes "���������������c�c�I";
		mes "�����m��Ȃ��I";
		mes "�d�����Ȃ��I�@�d�����Ȃ��I";
		next;
		mes "[�V�G���r�[]";
		mes "�����A�|�[�h�I";
		mes "���������ɂ���ƌ����Ă邾��I";
		mes "���̂�낤�I";
		next;
		mes "^000099�]2�C�̔L���s��ȑ������n�߂��B";
		mes "�@���̂܂܂ł͘b�𕷂������ɂȂ��B";
		mes "�@�����̃}���������Y�ʋl�̎���";
		mes "�@���߂Ă���悤���]^000000";
		set ECL_6QUE,12;
		delquest 72558;
		setquest 12285;
		close;
	case 12:
		mes "^000099�]�|�[�h�͑����ɖ����ł��B";
		mes "�@�Ȃ�Ƃ����Ď~�߂Ȃ��Ɓc�c�]^000000";
		close;
	derfault:
		if(ECL_6QUE < 13) {
			mes "[�|�[�h]";
			mes "�x�������͂���";
			mes "^000099�}���������Y�ʋl^000000��";
			mes "�܂�������Ă��Ȃ��I";
			mes "�|�[�h�A�߂����B�����������c�c�B";
			mes "�������ɂ���^000099�V�G���r�[^000000��";
			mes "�s�@�������c�c�B";
			close;
		}
		mes "[�|�[�h]";
		mes "�������Ƀv���[���g���ꂽ�I";
		mes "���肪�Ƃ��I�@�����l�I";
		mes "�V�G���r�[�����ł���I";
		mes "����ŐH�ו��ɍ���Ȃ��Ȃ����I";
		close;
	}
}

ecl_in02.gat,133,115,7	script	�Ŏ�#pa0829	461,3,3,{
	switch(ECL_6QUE) {
	case 0:
		mes "[�Ŏ�]";
		mes "����ɂ��́B";
		mes "����A���̎��Ԃ͖ʉ��";
		mes "���ɗ\��͖����悤�ł��ˁB";
		mes "�N���Ƃ̖ʉ������]�ł����H";
		next;
		if(select("�������ĉ�肽��","�O�ɏo���ĉ�����") == 1) {
			mes "[�Ŏ�]";
			mes "�킩��܂����B";
			mes "���A��̍ۂ͂����|�����������B";
			close;
		}
		mes "[�Ŏ�]";
		mes "�킩��܂����B";
		mes "�C��t���Ă��A�肭�������B";
		close2;
		warp "ecl_in02.gat",98,29;
		end;
	case 1:
		mes "[�Ŏ�]";
		mes "����ɂ��́B";
		mes "����A���̎��Ԃ͖ʉ��";
		mes "���ɗ\��͖����悤�ł��ˁB";
		mes "�N���Ƃ̖ʉ������]�ł����H";
		next;
		if(select("�N�����@�[","�O�ɏo���ĉ�����") == 2) {
			mes "[�Ŏ�]";
			mes "�킩��܂����B";
			mes "�C��t���Ă��A�肭�������B";
			close2;
			warp "ecl_in02.gat",98,29;
			end;
		}
		mes "[�Ŏ�]";
		mes "�N�����@�[�l�ł���!?";
		mes "����́c�c";
		next;
		mes "[�N�����@�[]";
		mes "���H�@�����H�@���ɖʉ�H";
		mes "������`�I�@�ʉ�I�@�ʉ�I�@�ʉ�I";
		mes "�������`�B";
		next;
		mes "[�Ŏ�]";
		mes "�����c�c�B";
		next;
		mes "^000099�]�Ŏ�̊�F���ς���Ă����B";
		mes "�@�N�����@�[�Ƃ������l��";
		mes "�@��قǌ��Ȗڂɂ����Ă���悤���]^000000";
		next;
		mes "[�Ŏ�]";
		mes "���[��c�c�B";
		mes "�ʉ�\�薼��ɁA";
		mes "�\��͓����Ă��Ȃ��̂ł����c�c�B";
		next;
		mes "[�N�����@�[]";
		mes "���`���B�Ŏ�`�I�@�������Ă���񂾁H";
		mes "���������J�����I�@�ʉ�Ȃ񂾂�I";
		mes "���̖ʉ���ז������";
		mes "���O�̋Ζ����Ԃɉ̂��̂����I";
		mes "�����̂��H�@��H�@��H";
		next;
		mes "[�N�����@�[]";
		mes "�������A�ǂ����Ȃ�";
		mes "�������̂��̂������Ȃ��ȁB";
		mes "���[�I�@����I�@���J���J�`�`�I";
		mes "�悤���B�̂����Ⴈ�����ȁ`�B";
		next;
		mes "^000099�]�Ŏ�̊�F������Ɉ����Ȃ�B";
		mes "�@�Ŏ�͉��������S�����悤�Ȋ����";
		mes "�@������Ɍ����Ȃ������]^000000";
		next;
		mes "[�Ŏ�]";
		mes "����B����ɂ͂Ȃ�����ǁA";
		mes "����͉����̊ԈႢ�ł��傤�B";
		mes "�����Ǝ�Ⴂ�Ŗ���ɋL�ڂ�";
		mes "�����������Ǝv���܂��̂�";
		mes "�ʉ�������܂��B";
		mes "���Ԃ́A�����ł��ˁc�c�B";
		next;
		mes "[�Ŏ�]";
		mes "���D���Ȃ����g���č\���܂���B";
		mes "�ł́A�ǂ������������B";
		set ECL_6QUE,2;
		setquest 72550;
		delquest 12280;
		close;
	case 3:
		mes "[�Ŏ�]";
		mes "���肢���܂��B";
		mes "���̃N�����@�[�l�̂��邳������";
		mes "���Ƃ����ĉ������c�c�I";
		mes "���̂P�N�Ԃ����Ƃ���Ȓ��q�ŁA";
		mes "�������������Ȃ肻���ł��B";
		next;
		if(select("�������ĉ�肽��","�O�ɏo���ĉ�����") == 1) {
			mes "[�Ŏ�]";
			mes "�킩��܂����B";
			mes "���A��̍ۂ͂����|�����������B";
			close;
		}
		mes "[�Ŏ�]";
		mes "�킩��܂����B";
		mes "�C��t���Ă��A�肭�������B";
		close2;
		warp "ecl_in02.gat",98,29;
		end;
	case 6:
		mes "[�Ŏ�]";
		mes "�Ȃ�Ă��Ƃ��I�@���Ȃ��̂������ł��I";
		mes "�N�����@�[�l���Q��Ƃ�������";
		mes "���ꂩ�琔���̂�����";
		mes "���a�Ȏ��Ԃ��K���Ƃ������ł��I";
		mes "��x����Ƃ��΂炭�N���Ȃ���ł��B";
		next;
		mes "[�Ŏ�]";
		mes "���̂悤�Ȏ��Ԃ�";
		mes "�Ăю��Ă�悤�ɂȂ�Ƃ́I";
		mes "�ǂ������Ȃ���";
		mes "�z�[���c���[�̏j����";
		mes "����܂��悤�ɁB";
		set ECL_6QUE,7;
		delquest 12283;
		setquest 72554;
		getexp 100000,0;
		getexp 0,60000;
		next;
		mes "�]�Ŏ�Ɋ��ӂ��ꂽ�B";
		mes "�@���̓q�G�[���ɉ�ɍs�����B";
		mes "�@�N�����@�[�ɂ���";
		mes "�@�q�G�[���̉Ƃ�";
		mes "�@�X�̓�̕��ɂ���悤���]";
		close;
	case 23:
		mes "[�Ŏ�]";
		mes "����" +strcharinfo(0)+ "�l�I";
		mes "�������A��ł����H";
		mes "���킠�`����ƐÂ��ɂȂ����̂ɁI";
		next;
		menu "���낻�뎞�ԂȂ̂��Ȃ�",-;
		mes "[�Ŏ�]";
		mes "��������������ł����H";
		mes "����Ȃ��̂͏���ł���B";
		mes "�����ł����H�@�����ɒ��낪����܂��B";
		mes "1�̉E�ɂ܂�������Ă������āA�ƁB";
		mes "�͂��B6���ԉ������܂����I";
		next;
		mes "^000099�]��ۂ悭�����񂵂Ă���B";
		mes "�@�{���ɊŎ�Ȃ񂾂낤���c�c�B";
		mes "�@�����A�N�����@�[�̎��͕��C�������B";
		mes "�@�N�����@�[�̌��ɖ߂낤�]^000000";
		set ECL_6QUE,24;
		delquest 72566;
		setquest 72568;
		close;
	default:
		mes "[�Ŏ�]";
		mes "���ɂ��p��������܂��H";
		next;
		if(select("�������ĉ�肽��","�O�ɏo���ĉ�����") == 1) {
			mes "[�Ŏ�]";
			mes "�킩��܂����B";
			mes "���A��̍ۂ͂����|�����������B";
			close;
		}
		mes "[�Ŏ�]";
		mes "�킩��܂����B";
		mes "�C��t���Ă��A�肭�������B";
		close2;
		warp "ecl_in02.gat",98,29;
		end;
	}
OnTouch:
	if(ECL_6QUE == 0) {
		mes "[�N�����@�[]";
		mes "���[���A�Ŏ�`�B���[���B";
		mes "������Ɗ����������Ă��B";
		mes "�����J�T�J�T�ɂȂ����Ⴄ��`�B";
		mes "���`���I";
		mes "�������Ⴄ�ȁ`�B���[���I";
		mes "�����A�Ŏ�`�H�����Ă���̂��H";
		next;
		mes "[�Ŏ�]";
		mes "�c�c";
		next;
		mes "^000099�]�Ŏ�͔�ꂫ�����ʎ�����";
		mes "�@�č��̒��ɂ�����l�����߂Ă���]^000000";
		next;
		mes "[�Ŏ�]";
		mes "�N�����@�[�l�A�ꌾ���������܂��B";
		mes "���̂��Ȃ��͂����ł͎��l�̐g�ł��B";
		mes "���Ȃ̎��Ԃ����悤";
		mes "���߂���Ă����Ԃł��B";
		next;
		mes "[�N�����@�[]";
		mes "����A���������B����͕��������B";
		mes "������}���ł����̎��x��";
		mes "���Ƃ����Ă���Ȃ����B";
		mes "�����������ăJ�T�J�T����񂾂�B";
		next;
		mes "[�Ŏ�]";
		mes "�܂��A���̌��t�̈Ӗ���";
		mes "�������Ă��܂��񂩁H";
		mes "�������������ɋC���g���Ă�������";
		mes "�z�����Ă�����킯�ɂ�";
		mes "�����Ȃ���ł���B";
		next;
		mes "[�N�����@�[]";
		mes "������";
		mes "�������ȁc�c�B";
		next;
		mes "[�Ŏ�]";
		mes "�܂������B";
		mes "�͂��c�c�B";
		next;
		mes "^000099�]�Ŏ�͉����������������A";
		mes "�@���̂܂ܐȂɖ߂����B";
		mes "�@���̐l�͉��́A";
		mes "�@�߂܂��Ă���̂��낤���B";
		mes "�@�Ŏ�ɘb�������Ă݂悤�]^000000";
		set ECL_6QUE,1;
		setquest 12280;
		close;
	} else if(ECL_6QUE == 18) {
		mes "[�Ŏ�]";
		mes "���I�@���Ȃ��͂��̎��́I";
		mes "�悭���Ă���܂����I";
		mes "�܂������Ă���܂��񂩁c�c�B";
		mes "���ɂ͂ƂĂ��肪�����܂���B";
		next;
		mes "[�N�����@�[]";
		mes "�����̌N�A�悻������ȁ`";
		mes "���̎��l�͌���ȁ`";
		mes "���A�����������Ă���`";
		mes "�������΂ɋ��邤���Ɂ`���`";
		next;
		mes "^000099�]�N�����@�[���܂��吺�ŉ̂��Ă���";
		mes "�@�Ŏ炪�؎��Ȃ܂Ȃ����ŁA";
		mes "�@�i�������Ă���]^000000";
		next;
		menu "�ʉ�̎��O�\�������Ă��Ȃ��̂ł����c�c",-;
		mes "[�Ŏ�]";
		mes "�ʉ�̎��O�\���L�^�ł����H";
		mes "�������A����Ȃ��͕̂K�v����܂���B";
		mes "�N�����@�[�l�̖ʉ�ł��ˁB";
		mes "�ق�A�����ɂ��傿�傢�Ɓc�c�B";
		mes "���ĉ������B����ɂ���܂����B";
		mes "�ǂ��������肭�������B";
		next;
		mes "^000099�]�ڂ̑O�Ŗ���ɖ��O�������Ă��ꂽ�]^000000";
		close;
	} else if(ECL_6QUE == 22) {
		mes "[�Ŏ�]";
		mes "�����A����ɂ��́B";
		mes "�������肪�Ƃ��������܂��B";
		mes "�������������ł��ˁB";
		mes strcharinfo(0)+ "�l���ǂ�Ȏ��";
		mes "�g�����̂��z�������܂��񂪁A";
		mes "�N�����@�[�l���Â��ɂȂ�܂����B";
		next;
		menu "�ʉ���������̂ł����\�񂪁c�c",-;
		mes "[�Ŏ�]";
		mes "��������������ł���!!";
		mes strcharinfo(0)+ "�l�̖ʒk�ł�����";
		mes "���ł����}�ł��B";
		mes "���ɃN�����@�[�l�̖ʒk�Ȃ�";
		mes "����������ł�����������񂵂܂��I";
		next;
		mes "^000099�]�Ŏ�ɖʉ�̋��������]^000000";
		close;
	} else if(ECL_6QUE == 23) {
		mes "[�Ŏ�]";
		mes "����" +strcharinfo(0)+ "�l�I";
		mes "�������A��ł����H";
		mes "���킠�`����ƐÂ��ɂȂ����̂ɁI";
		next;
		menu "���낻�뎞�ԂȂ̂��Ȃ�",-;
		mes "[�Ŏ�]";
		mes "��������������ł����H";
		mes "����Ȃ��̂͏���ł���B";
		mes "�����ł����H�@�����ɒ��낪����܂��B";
		mes "1�̉E�ɂ܂�������Ă������āA�ƁB";
		mes "�͂��B6���ԉ������܂����I";
		next;
		mes "^000099�]��ۂ悭�����񂵂Ă���B";
		mes "�@�{���ɊŎ�Ȃ񂾂낤���c�c�B";
		mes "�@�����A�N�����@�[�̎��͕��C�������B";
		mes "�@�N�����@�[�̌��ɖ߂낤�]^000000";
		set ECL_6QUE,24;
		delquest 72566;
		setquest 72568;
		close;
	} else if(ECL_6QUE == 38) {
		mes "[�Ŏ�]";
		mes "�����`�`���܂�����!!";
		mes "�҂��Ă��܂����I";
		next;
		menu "����ɂ���",-;
		mes "[�Ŏ�]";
		mes "���̓N�����@�[�l���A�ςȎ�����";
		mes "�����Ȃ���ԂԂ����Ă����ł��B";
		mes "���S�Ɍ����点�ł��B���肢���܂��I";
		mes "�Ȃ�Ƃ������Ă��������B";
		next;
		mes "[�Ŏ�]";
		mes "�܂��͂������������̂�";
		mes "�ʉ��ɗ\����L�^���Ă����܂��ˁB";
		next;
		mes "^000099�]�Ŏ�͂܂��������Ȃ������悤��";
		mes "�@�\�񖼕�������񂵂Ă��ꂽ�B";
		mes "�@���͂�\�񐧂̕K�v�������Ȃ��c�c�]^000000";
		close;
	}
	end;
OnInit:
	waitingroom "�I�v�Ȃ��J",0;
	end;
}

ecl_in01.gat,82,80,4	script	�����G�N���[�W��	111,{
	if(ECL_6QUE >= 20) {
		mes "^990000�\�\�\�����G�N���[�W���\�\�\^000000";
		mes "^999900�Ռ��I�@�G�N���[�W���a����b���W^000000";
		next;
		mes "^000099�]�N�����@�[���m�点�Ă��ꂽ�{���B";
		mes "�@���j���ɂ͌����Ȃ����c�c";
		mes "�@�{�̖ڎ���ǂ�ł݂�]^000000";
		next;
		switch(select("�{�����","��]�̑�n�\�\�\�\7P","���V��̉A�d�\�\�\�\48P","�i���̕ʂ�\�\�\�\132P","�i�Â��Ȃ��Č����Ȃ������j")) {
		case 1:
			mes "^000099�]�{������]^000000";
			close;
		case 2:
			mes "^000099��1�߁B��]�̑�n^000000";
			mes "�@";
			mes "�C�O�h���V���Ɉُ킪����̂��낤���B";
			mes "���a�ɉ߂����Ă������̒n��";
			mes "���̋C�z������n�߂��B";
			next;
			mes "�������ꂽ�����A�͂ꂽ��n�A";
			mes "�ˑR�ψق������������̍U���B";
			mes "���t�B�l�����̐�����";
			mes "���ɓ��ɕω���]�V�Ȃ����ꂽ�B";
			next;
			mes "^000099�]�ꕔ�����h���Ă��ēǂ߂Ȃ��]^000000";
			next;
			mes "�p�p���̒��B��";
			mes "���̃G�N���[�W���Ƃ����ꏊ��";
			mes "�C�O�h���V������삷�邽�߂�";
			mes "�œK�ł��邱�Ƃ͋^�⎋���Ă��Ȃ��B";
			mes "���̍l���͍��ł��ω��������悤���B";
			next;
			mes "�������A�x�d�Ȃ錳�V��̈��͂�";
			mes "���X�L�����Q�ɂ��A";
			mes "�p�p���A��ʎs��������";
			mes "����������ɓ���Ȃ��Ă��Ă���B";
			next;
			mes "��̓I�ȑ΍���������܂�Ȃ��B";
			mes "����Ƃ��������ʂ��Ȃ��܂܁A";
			mes "�a�C��ψِ�������̍U�����󂯁A";
			mes "���Ԃ�Ƒ����S���Ȃ��Ă����B";
			mes "�ǂ�����΁B��̂ǂ�����΁c�c�B";
			next;
			mes "^000099�]���������͉���Ă��ēǂ߂Ȃ��]^000000";
			close;
		case 3:
			mes "^000099��2�߁B���V��̉A�d^000000";
			mes "�@";
			mes "���V��͒���������Q�̐ӔC��";
			mes "�p�p���̒��B�̂����ɂ��Ă����B";
			mes "���X�A���Z����n��̑I�肪";
			mes "�Ԉ���Ă����Ƃ����b���B";
			next;
			mes "�ނ�͂��쑤�̐X�̒���";
			mes "��s���ړ]����v���";
			mes "���V������Ō���̂���";
			mes "�p�p���̒��B�ɒʍ����Ă����B";
			next;
			mes "^000099�]�j�ꂽ�y�[�W�͔�΂����]^000000";
			next;
			mes "��̕��ɒ�@�Ɍ�������";
			mes "�������̏󋵂͐[���������B";
			mes "����Ȗ��{�̂悤�ȐX�B";
			mes "���S�ȏꏊ�͂ǂ��ɂ��Ȃ��B";
			mes "�w�ǂ͖��{�̒��ŏo�����������";
			mes "��ł������Ă��܂����B";
			next;
			mes "����ł��A���V��͋��s���������B";
			mes "�������ׂ��ŗD�掖���Ƃ������R������";
			mes "����Ȃ钲�����̔h����v�������B";
			mes "���d�Ƃ��������悤���Ȃ����A";
			mes "���ɉ�����������Ȃ���ʎs���B��";
			mes "���̎w���ɏ]�킴��𓾂Ȃ������B";
			next;
			mes "�p�p���̒��B�Ƃ��Ă�";
			mes "���V��̖��d�ȗv���𒵂ˏ�����";
			mes "���{�I�ȑŊJ�􂪕K�v�������B";
			mes "���̂܂܌��V��̕��j�ɏ]���Ă��Ă�";
			mes "��n�ɂ���ĖłԂ̂Ƒ卷�������B";
			next;
			mes "����Ȑ܁A��l�̎Ⴋ�h�i��";
			mes "��̈Ă����V��ɒ�o�����B";
			next;
			mes "^000099�G�X�����A���x��^000000";
			mes "�����Ɋւ��錤���Ҍ��Z�p�҂�";
			mes "���t�B�l�̒��ł��ō��̓��]������";
			mes "�Ⴋ�G�[�X���B";
			mes "�ނ炪��K�͑�n�h���Ɋւ���";
			mes "�񍐏����o�����̂ł���B";
			next;
			mes "�Ⴂ��l�̃h�i�̒�Ă͒P���������B";
			mes "^000099�C�O�h���V���ƒ��ڋ�������";
			mes "����ȃz�[���c���[��n�����A";
			mes "��n��h�点��^000000";
			mes "�Ƃ������e���B";
			next;
			mes "�z�[���c���[��n�����鎖�ɂ��A";
			mes "���R���������͂��ɓx�Ɋ�������";
			mes "���肵���n�ɕς���Ɠ����ɁA";
			mes "�C�O�h���V���̕ی�������Ȃ��Ƃ���";
			mes "�l���ł���B";
			next;
			mes "�������A���̒�Ăɂ͖����������B";
			mes "^000099�z�[���c���[����ׂɂ�";
			mes "��n�̐����͂��z������K�v��";
			mes "���������炾�B^000000";
			mes "�ŏ��ɏ[���ȗʂ̉h�{���m�ۂ��Ȃ���";
			mes "�͂𔭊��ł��Ȃ��̂ł���B";
			next;
			mes "���V��͔ނ��l�̒�Ă�َE�����B";
			mes "�z�[���c���[�̑n����";
			mes "��n�̉h�{��K�v�Ƃ���Ȃ�";
			mes "��n�̍Đ��ƃz�[���c���[�̑n����";
			mes "�����ɏo����킯�������A";
			mes "�Ƃ����̂��\�����̗��R���B";
			next;
			mes "�������ĎႫ��l�̕񍐂́A";
			mes "�낭�ɋc�_����邱�ƂȂ��A";
			mes "��������B";
			mes "���V��͕ς�炸�A";
			mes "��ւ̈ړ]���咣���������B";
			next;
			mes "�ŏ�����ނ�̖ڕW��";
			mes "��ւ̈ړ]�ɂ������̂��B";
			mes "����́A";
			next;
			mes "^000099�]���̐�̃y�[�W�͔j���Ă���]^000000";
			if(ECL_6QUE == 20) {
				set ECL_6QUE,21;
				chgquest 12291,72564;
			}
			close;
		case 4:
			mes "^000099�]���ׂẴy�[�W��";
			mes "�@�Ӑ}�I�ɉ������C���N�̌オ����]^000000";
			close;
		case 5:
			mes "^000099�]���ׂẴy�[�W��";
			mes "�@�Ӑ}�I�ɉ������C���N�̌オ����]^000000";
			if(ECL_6QUE == 20) {
				close;
			}
			next;
			menu "�܂�Ă��镔����������",-;
			mes "^000099�]���܂��L�����";
			mes "�@�܂��Ă����������̓��e��";
			mes "�@�ǂގ����ł��������]^000000";
			next;
			menu "�L���ēǂ�ł݂�",-;
			mes "^000099�]�{��ǂ񂾃��t�B�l�B��";
			mes "�@���z��������Ă���]^000000";
			next;
			mes "^990000RE:^000000";
			mes "�N������Ȃ��Ƃ������񂾁I";
			mes "���̈�����Ō�Ȃ̂ɉ���ēǂ߂Ȃ��I";
			mes "�\�\�\�\�\�\�\�\�\";
			mes "^990000RE-RE:^000000";
			mes "���́A���ʔł������Ă���̂ŁA";
			mes "�悩������A���c���ĉ������B";
			next;
			mes "^990000RE:^000000";
			mes "�����A���O�炱��ǂ��������Ƃ��H";
			mes "�����ɂ͌��V��̓z�[���c���[�n����";
			mes "���΂����Ə�����Ă���B";
			mes "�������A�����̗��j���ɂ͌��V�";
			mes "�z�[���c���[��n�������Ə����Ă���B";
			mes "�ǂ������������񂾁H";
			next;
			mes "^990000RE:^000000";
			mes "�H�̒���180�ȏ�̃��t�B�l��";
			mes "��x�t�������Č������ł��B";
			mes "�\�\�\�\�\�\�\�\�\";
			mes "�킽���A�A�i�C�X�l���D���ł��B";
			mes "�\�\�\�\�\�\�\�\�\";
			next;
			mes "^990000RE:^000000";
			mes "���e���畷�����񂾂��ǁA";
			mes "�G�X�����ƃ��x���̓�l��";
			mes "���V��̈ړ]�Ă��~�߂悤�Ƃ���";
			mes "^000099�d�g��Ō��V��̑O�ő������炵������^000000";
			mes "������Ė{���Ȃ́H";
			next;
			mes "^990000RE-RE:^000000";
			mes "�������̘b�������B";
			mes "�΂�Ȃ��悤�ɓ�l��^990000�������O����A";
			mes "�����ݍ����U������Ă����炵����^000000�B";
			mes "�܂����̕ӂ͗��j�L�^�҂̊Ԃň�ԁA";
			mes "���ߏ�̘_�������������炵�����B";
			next;
			mes "^990000RE:^000000";
			mes "���������A";
			mes "����Ȃ̐M���Ă���z����̂��B";
			mes "���̌����G�N���[�W����";
			mes "�S�V�b�v��厏�����B";
			mes "���j�����႟�Ȃ��񂾂���B";
			mes "���ɂ߂�悻�̕ӂ́B";
			next;
			mes "^990000RE-RE:^000000";
			mes "�����ł����B";
			if(ECL_6QUE == 21) {
				next;
				set ECL_6QUE,22;
				chgquest 72564,12292;
				mes "^000099�]�G�X�����ƃ��x���A";
				mes "�@��l�̃h�i�Ɋւ���b��ǂ񂾁B";
				mes "�@�N�����@�[�̌��ɖ߂낤�]^000000";
			}
			close;
		}
	}
	mes "^000099�]���ʂ̎G���ɂ݂���B";
	mes "�@�S�V�b�v����ɍڂ��Ă���悤���]^000000";
	close;
}

ecl_tdun01.gat,60,56,4	script	#pa0829�G�X��������	111,{
	if(ECL_6QUE == 29 || ECL_6QUE == 30 || ECL_6QUE == 36) {
		mes "�]�����̔������������I�]";
		close2;
		warp "ecl_tdun01a.gat",60,51;
		end;
	}
	if(ECL_6QUE == 31) {
		mes "^000099�]���ɐV���������͂Ȃ��]^000000";
		close;
	}
	if(ECL_6QUE == 37) {
		mes "^000099�]�G�X�����ƌ�M�ł����ꏊ���]^000000";
		close;
	}
	mes "^000099�]�^���[�Ɏ�����Ȃ���n������B";
	mes "�@��΂��Â��ĒN�̕����͔���Ȃ��]^000000";
	close;
}

ecl_tdun01.gat,60,56,0	script	#pa0829�G�X���������^�b	139,5,5,{
	if(ECL_6QUE == 29) {
		mes "�]�����̔������������I�]";
		close2;
		warp "ecl_tdun01a.gat",60,51;
		end;
	}
	end;
}

ecl_tdun01a.gat,60,56,4	script	#pa0829�G�X��������copy	111,{
	if(ECL_6QUE == 30) {
		cutin "EP14_etran01",1;
		mes "[�H�H�H�H]";
		mes "��H�@����͉����H";
		mes "���ł��݂Ă���̂��H";
		next;
		menu "�G�X�����ł����H",-;
		cutin "EP14_etran3",1;
		mes "[�G�X����]";
		mes "���̎��̖��O���H";
		mes "�N���H";
		next;
		menu "������������",-;
		cutin "EP14_etran5",1;
		mes "[�G�X����]";
		mes "�Ȃ񂾂��āH";
		mes "�y����̖������痈���H";
		mes "���������Ă���񂾂��N�́H";
		next;
		menu "�ʐM�@�̐���������",-;
		cutin "EP14_etran5",255;
		mes "["+strcharinfo(0)+"]";
		mes "�������痈���̂ł͂Ȃ��A";
		mes "�����̊Ԃ����ߋ��Ɩ����̌�M��";
		mes "�\�ɂȂ�����Ԃł��B";
		mes "��������������������܂��B";
		next;
		cutin "EP14_etran4",1;
		mes "^000099�]����������";
		mes "�@�G�X�����̓N�����@�[�Ƃ������肾�B";
		mes "�@�N�����@�[�ƃq�G�[����";
		mes "�@�G�X�����ƃ��x����";
		mes "�@���܂�ς��c�c�H�]^000000";
		next;
		while(1) {
			switch(select("���V��ɂ���","���x���Ƃ̌��������ɂ���","��n������Ƃ̐i���ɂ���")) {
			case 1:
				cutin "EP14_etran8",1;
				mes "[�G�X����]";
				mes "���V��c�c�{���ɕ������g�D���B";
				mes "���΂̂悤�ȑ��݂���B";
				next;
				mes "[�G�X����]";
				mes "�R�̓����A�����A�����ɂ܂�";
				mes "���ׂāA�����悤�Ƃ��Ă���B";
				mes "����ɂ͎������̐����Ɋւ��";
				mes "��s�Č��ɂ����˂�����ł���B";
				next;
				mes "[�G�X����]";
				mes "���̒n��Ŏ�s�𕜋����悤�Ƃ���";
				mes "�Ⴂ���t�B�l�����̍����I�ȑI����";
				mes "�ނ�͖������悤�Ƃ��Ă���B";
				mes "��s�Č��͎����������S�Ői�܂Ȃ���";
				mes "�C���ς܂Ȃ��炵���B";
				next;
				mes "[�G�X����]";
				mes "����Ŗ��������Ăł�";
				mes "�쑤�̐X�̕��𒓓Ԓn�ɂ���Ƃ���";
				mes "�ӂ������v���i�߂Ă��₪��B";
				next;
				cutin "EP14_etran4",1;
				mes "[�G�X����]";
				mes "�Ⴂ���t�B�l������";
				mes "��΂ɂ�������������ł��Ȃ��B";
				mes "����Ŏ��ƃ��x����";
				mes "�������Č����鎖���\�Ɠ`���A";
				mes "��̕��Ɉړ]����̂��Ƃǂ߂Ă���B";
				mes "�������c�c";
				next;
				mes "[�G�X����]";
				mes "����A���@�͖ܘ_�l���Ă���񂾁B";
				mes "�����A���������ꍇ�̘b���B";
				mes "�����������s����ƁA";
				mes "����ɑ����̃��t�B�l�B��";
				mes "�쑤�Ɍ����킳��邾�낤�B";
				next;
				mes "[�G�X����]";
				mes "����ȏ�A���V��̎�ɂ����";
				mes "�Ⴂ���t�B�l�B��";
				mes "�]���𑝂₷���͂ł��Ȃ��B";
				next;
				cutin "EP14_etran4",255;
				continue;
			case 2:
				cutin "EP14_etran5",1;
				mes "[�G�X����]";
				mes "�����A��������l��";
				mes "���V��̑O�ő����Ă��������B";
				mes "�������c�c�悭�m���Ă���ȁB";
				mes "���̂��鐢�E����y�����";
				mes "�����Ȃ񂾂낤�����́H";
				next;
				mes "[�G�X����]";
				mes "���̎��A�������͌��V��̉����";
				mes "�ǂ�����Ėh�����l���Ă����B";
				mes "�z��͓�̐X�ւ̈ړ]��";
				mes "�K�������o���Ă��邾�낤����ȁB";
				mes "�����ŉ�X�͂킴�ƑΗ������񂾁B";
				next;
				mes "[�G�X����]";
				mes "�z�[���c���[�̑n����D�悷�邩�B";
				mes "��n�̕�����D�悷�邩�B";
				mes "���̈Ăɘb���W������΁A";
				mes "�ǂ��炪�I�����ꂽ�Ƃ��Ă�";
				mes "�悩�����񂾁B";
				next;
				mes "[�G�X����]";
				mes "�b���o�����i�K�Ŋ���";
				mes "���ƃ��x���ŕ��s���č�Ƃ�i�߂鎖��";
				mes "�o�債�Ă�������ȁB";
				mes "��3�̈āA�Ƃ����̂�ׂ�������������";
				mes "�����������@���Ƃ����񂾂�B";
				next;
				cutin "EP14_etran4",1;
				mes "[�G�X����]";
				mes "���ʓI�ɂ͎v���ʂ�ɂȂ����B";
				mes "�����Ƃ��A��̐X�Ɉړ]����Ƃ���";
				mes "���V��̌v���";
				mes "���̎������̎Ⴂ���t�B�l�B��";
				mes "�]��������������������";
				mes "���y����邱�Ƃ͂Ȃ������B";
				next;
				mes "[�G�X����]";
				mes "�������x���ɂ�����x���Ȃ�";
				mes "���̎��̘b���������Ȃ��B";
				next;
				cutin "EP14_etran4",255;
				continue;
			case 3:
				cutin "EP14_bif01",3;
				mes "[�G�X����]";
				mes "�i�����c�c�B";
				mes "���������āA���M���Ȃ��ȁB";
				mes "���̂��̃r�t���X�g��";
				mes "���܂�ɂ����󂵉߂��Ă���B";
				mes "�����琶���͂𒍂��ł����肪�Ȃ��B";
				next;
				mes "[�G�X����]";
				mes "��n�Ƃ͕ʂ̖�������B";
				mes "�z�[���c���[�������z�肵�Ă������";
				mes "�G�l���M�[�����Ȃ�H���B";
				mes "�z������̈���L�����x�������񂾁B";
				next;
				mes "[�G�X����]";
				mes "�܂��A���̓_��";
				mes "���x�����w�͂��Ă���Ă��邾�낤�B";
				mes "��x�A���E���Ɍq�������z�[���c���[��";
				mes "�炿����܂Ŏ��ӂ���ŏ�Ԃɂ�����B";
				mes "���炭�����A�\�����ŏ����ɗ}�����";
				mes "���������Ă��邾�낤�B";
				next;
				cutin "EP14_etran5",1;
				mes "[�G�X����]";
				mes "�󋵂��c���ł��������H";
				mes "���A�������̔C���͕�����Ă���B";
				mes "�r�t���X�g�ő�n�ɖ��𐁂����ގ��B";
				mes "�z�[���c���[�̖\�����~�߂郍�x���B";
				mes "��x�n�߂��炱�̍�Ƃ�";
				mes "��x�Ɨ���鎖���o���Ȃ��B";
				next;
				mes "[�G�X����]";
				mes "�����A�ǂ��炩������Ă��܂�����";
				mes "�݂��̋ύt������A";
				mes "�r�t���X�g���z�[���c���[��";
				mes "���|�ꂵ�Ă��܂��B";
				next;
				mes "[�G�X����]";
				mes "���肪���x�������炱���c�c";
				mes "�M�����Ă���e�F�����炱��";
				mes "�ł����ƂȂ񂾁B";
				next;
				mes "[�G�X����]";
				mes "�������A���̏󋵂��{����";
				mes "�����������ɐi��ł���̂��A";
				mes "���������Ȃ��񂾂�S���B";
				mes "�s���ɂ��Ȃ邳�c�c�B";
				mes "�܂��A��������M����";
				mes "��Ƃ𑱂��邵���Ȃ����ǂȁB";
				next;
				menu "�K�����܂������܂�",-;
				cutin "EP14_etran5",255;
				mes "["+strcharinfo(0)+"]";
				mes "���Ȃ��̂������ォ��y�������̍��A";
				mes "�r�t���X�g�͖؁A�ԁA��";
				mes "�����������n�ɂȂ��Ă��܂��B";
				next;
				cutin "EP14_etran3",1;
				mes "[�G�X����]";
				mes "�ȂɁc�c�H�@�Ƃ������Ƃ́c�c";
				mes "�����A��������̂�!?";
				mes "�������Ă���Ƃ����̂������ŁH";
				next;
				menu "�ꏏ�ɊO�ɏo�Ă݂܂��񂩁H",-;
				mes "[�G�X����]";
				mes "��A�悵�B�@�킩�����B";
				mes "�ڂŊm�F���悤�B���čs���B";
				set ECL_6QUE,31;
				chgquest 12297,72572;
				close2;
				cutin "EP14_etran3",255;
				warp "ecl_fild01.gat",183,92;
				end;
			}
		}
	}
	if(ECL_6QUE == 36) {
		cutin "EP14_etran01",1;
		mes "[�G�X����]";
		mes "�ށH�@���̊����́B";
		mes "���������ĈȑO�A";
		mes "���̖������痈�����l���H";
		next;
		cutin "EP14_etran1",1;
		mes "[�G�X����]";
		mes "�����A���Ă��ꂽ�̂��I";
		next;
		mes "[�G�X����]";
		mes "����A�N���K�˂ė��Ă����";
		mes "�d������ɂȂ�Ȃ��Ȃ�����B";
		mes "���̐�ɐ�������������Ƃ킩���";
		mes "����Ȃɂ��Ⴄ���̂Ȃ񂾂ȁB";
		mes "�����͂𒲐߂���̂��A";
		mes "�y�������Ă���B";
		next;
		cutin "EP14_etran3",1;
		mes "[�G�X����]";
		mes "�������B������A";
		mes "���x���Ɏ�����";
		mes "�n���Ă��ꂽ���H";
		mes "�t�͂ǂ������H";
		mes "�z�[���c���[�̗t�́H";
		next;
		menu "�����ƃz�[���c���[�̗t��n��",-;
		if(countitem(6539) < 1 || countitem(6540) < 1) {
			cutin "EP14_etran3",1;
			mes "[�G�X����]";
			mes "��H";
			mes "�������x������󂯎�����̂����H";
			mes "������x�m�F��������";
			mes "�����񂶂�Ȃ����H";
			close;
			cutin "EP14_etran01",255;
			warp "ecl_tdun01.gat",60,51;
			end;
		}
		cutin "EP14_etran1",1;
		mes "[�G�X����]";
		mes "�z�[���c���[��������Ƃ�������";
		mes "�������������I";
		mes "�悩�����A�{���ɗǂ�������I";
		next;
		cutin "EP14_etran6",1;
		mes "[�G�X����]";
		mes "�������A������";
		mes "�󂯂Ƃ��Ă���Ȃ��������c�c";
		next;
		menu "���x���̌��t��`����",-;
		cutin "EP14_etran1",1;
		mes "[�G�X����]";
		mes "��͂�A���x����";
		mes "���ƈ���ċ����ȁB";
		mes "�܂����ꂪ���x���̒����Ȃ񂾁B";
		next;
		mes "[�G�X����]";
		mes "�ӂӁB���������͂������B";
		mes "�㉹��f�����������B";
		mes "�����͋����ȁc�c�B";
		next;
		cutin "EP14_etran1",255;
		mes "["+strcharinfo(0)+"]";
		mes "���x���͍Ō��";
		mes "���̌��t���`���Ă����";
		mes "�����Ă��܂����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�u���Ƌ��ɕ���ł����";
		mes "�@���肪�Ƃ��B";
		mes "�@������x�Ɖ����";
		mes "�@����Ȃ������m��Ȃ����A";
		mes "�@�S�͂������ɂ���B�v";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�u���O������M���Ă��邭�炢";
		mes "�@^000099�������O��M�����Ă���^000000�B�v";
		next;
		cutin "EP14_etran3",1;
		mes "[�G�X����]";
		mes "�Ȃ񂾂��āI�@���x�����H";
		mes "�����b���Ă����̂��H";
		mes "�{���ɁH";
		next;
		cutin "EP14_etran6",1;
		mes "[�G�X����]";
		mes "�������Ɏd�������Ă������A";
		mes "���߂ĕ������悻��Ȍ��t�́B";
		mes "�M�����Ă���Ă����̂��I�@�������c�c";
		mes "�͂́c�c�������ȁB";
		mes "�������I�@�������c�c�B";
		next;
		mes "^000099�]��X��������k�킹�Ă���]^000000";
		next;
		cutin "EP14_etran4",1;
		mes "[�G�X����]";
		mes "����B����A";
		mes "�F�X�{���ɂ��肪�Ƃ��B";
		mes "�������痈���l�B";
		next;
		cutin "EP14_etran1",1;
		mes "[�G�X����]";
		mes "�N�����Ȃ�������";
		mes "�s����������܂܍�Ƃ𑱂�";
		mes "�S���܂�Ă��܂��Ă������낤�B";
		next;
		mes "[�G�X����]";
		mes "�����āA�����";
		mes "���x���̑z�����m���߂�ꂽ�B";
		mes "�ƂĂ���ɂȂ�Ƃ͎v���Ȃ����B";
		mes "���̎������󂯎���Ă���Ȃ����B";
		next;
		cutin "EP14_etran01",1;
		mes "[�G�X����]";
		mes "�ł́A���͂���Ŏ��炷��B";
		mes "����Ƃ��̕s�v�c�ȋ@�B��";
		mes "������l�ɂ��`���Ăق����B";
		mes "���肪�Ƃ��A�ƁB";
		next;
		if(checkitemblank() < 3) {
			mes "[�G�X����]";
			mes "�c�c�Ǝv�������ǁA";
			mes "����ȏ�A���ĂȂ��݂����ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close2;
			cutin "EP14_etran01",255;
			warp "ecl_tdun01.gat",60,51;
			end;
		}
		cutin "EP14_etran01",255;
		delitem 6540,1;
		delitem 6539,1;
		set ECL_6QUE,37;
		chgquest 12300,12301;
		getitem 2915,1;
		mes "�]�G�X�����̎�������ɓ��ꂽ�B";
		mes "�@�����P���Ă��镔��������B";
		mes "�@^ff0000�B���ꂽ�͂�����̂��낤���B^000000";
		mes "�@�܂��̓q�G�[���̌��ɖ߂낤�]";
		close2;
		warp "ecl_tdun01.gat",60,51;
		end;
	}
	if(ECL_6QUE == 37) {
		mes "^000099�]�G�X�����ƌ�M�ł����ꏊ���]^000000";
		close2;
		warp "ecl_tdun01.gat",60,51;
		end;
	}
	// ������
	mes "^000099�]���ɐV���������͂Ȃ��]^000000";
	close2;
	warp "ecl_tdun01.gat",60,51;
	end;
}

ecl_tdun01a.gat,60,56,0	script	#pa0829�G�X���������^�b	139,5,5,{
	if(ECL_6QUE == 29) {
		cutin "EP14_etran0",1;
		mes "[�H�H�H�H]";
		mes "��ς��B";
		mes "�z�[���c���[���z�����ރG�l���M�[��";
		mes "�v�������傫�����B";
		mes "���x���̓z��������x��";
		mes "�������Ă���邾�낤���c�c";
		mes "��͂薳���������̂�!?";
		next;
		mes "^000099�]�G�X�����炵�������������I";
		mes "�@���������߂��ɍs���Ă݂悤�]^000000";
		set ECL_6QUE,30;
		chgquest 12296,12297;
		close2;
		cutin "EP14_etran0",255;
		end;
	}
	end;
}

ecl_fild01.gat,183,94,0	script	#pa0829�G�X�������O�^�b	139,3,3,{
	if(ECL_6QUE == 31) {
		cutin "EP14_etran1",1;
		mes "[�G�X����]";
		mes "�����c�c���ꂪ�I";
		next;
		cutin "EP14_bif02",3;
		mes "[�G�X����]";
		mes "���ꂪ�c�c";
		mes "�{���ɖ��ł͂Ȃ��񂾂ȁH";
		next;
		menu "�͂�",-;
		mes "["+strcharinfo(0)+"]";
		mes "���A���Ȃ������Ă��邱�����A";
		mes "����A�����̃��t�B�l�B��������";
		mes "�����̒n�A�r�t���X�g�ł��B";
		next;
		cutin "EP14_etran7",1;
		mes "[�G�X����]";
		mes "�����A�����c�c�{���ɁA";
		mes "�{���ɗǂ������B";
		mes "���͊Ԉ���ĂȂ������B";
		mes "�Ԉ���Ă��Ȃ������񂾎��́I";
		next;
		mes "^000099�]�G�X�����͊������Ȃ���A";
		mes "�@�ނ̋�J�̌��ʂ����߂Ă����B";
		mes "�@�����ĉ������v���o�����悤��";
		mes "�@��������Ă����]^000000";
		next;
		cutin "EP14_etran5",1;
		mes "[�G�X����]";
		mes "���x���́H";
		mes "�z�[���c���[�͂ǂ������H";
		next;
		menu "�z�[���c���[���������Ă��܂�",-;
		cutin "EP14_etran1",1;
		mes "[�G�X����]";
		mes "�������I�@���������I";
		mes "�������B�������I";
		mes "�����̋�J�����ꂽ���B";
		mes "�ǂ������B";
		mes "�Ԉ���Ă��Ȃ������񂾂ȁc�c�B";
		next;
		mes "[�G�X����]";
		mes "����z�[���c���[�����Ă݂����ȁB";
		mes "�z�[���c���[�̂���ꏊ��";
		mes "�A��čs���Ă���Ȃ����H";
		next;
		menu "����͖����ł��c�c",-;
		cutin "EP14_etran1",255;
		mes "["+strcharinfo(0)+"]";
		mes "�ʐM�@�̉��͈͂̊֌W�ŁA";
		mes "�����܂ňē����鎖��";
		mes "�o���Ȃ���ł��B";
		next;
		cutin "EP14_etran6",1;
		mes "[�G�X����]";
		mes "�����c�c�������B�������A";
		mes "�{���Ƀ��x�������������̂��H";
		mes "���̂��߂ɉR�����Ă���񂶂�";
		mes "�Ȃ����낤�ȁH";
		next;
		menu "�z�[���c���[�̗t�������Ă��܂�",-;
		cutin "EP14_etran1",1;
		mes "[�G�X����]";
		mes "�����A�z�[���c���[�̗t���B";
		mes "�m���ɂ������B";
		mes "�z�[���c���[��������������̂Ȃ�A";
		mes "�����Ƃ��̗t�������Ȃ��̂��낤�B";
		mes "���̐A���ł͌��鎖���ł��Ȃ��A";
		mes "���ʂȋP��������͂����B";
		next;
		cutin "EP14_etran1",255;
		mes "["+strcharinfo(0)+"]";
		mes "�ǂ�Ȍ`�����Ă����ł����H";
		next;
		cutin "EP14_etran3",1;
		mes "[�G�X����]";
		mes "�����������Ƃ͂Ȃ�����ȁB";
		mes "�����A���_��ł����ƁA";
		mes "�����͂��L�x�ɂȂ����z�[���c���[��";
		mes "�����̂悤�Ȍ�����͂��Ȃ񂾁B";
		next;
		mes "[�G�X����]";
		mes "����ȊO�ɒm���Ă��鎖���͂Ȃ��B";
		mes "�����A�{���̃z�[���c���[�̗t�Ȃ�";
		mes "�K����ڌ���΂킩��͂����B";
		mes "�z�[���c���[�̗t����o��";
		mes "���������͂ƂĂ���������ȁB";
		next;
		cutin "EP14_etran4",1;
		mes "[�G�X����]";
		mes "�����A�N�����������z�[���c���[�̗t��";
		mes "�����ė��Ă����Ȃ�A";
		mes "���͐�΂�����߂Ȃ��B";
		mes "���x���̐�����";
		mes "���ʂɂ͂ł��Ȃ�����ȁI";
		next;
		mes "[�G�X����]";
		mes "�������B���x���̏��ɂ����̂Ȃ�";
		mes "��������݂������Ƃ�����B";
		next;
		mes "�]���������ƃG�X������";
		mes "�@���������Ȃ����̌��ɗ������";
		mes "�@�t���Ă����A�N�Z�T���[��������]";
		next;
		cutin "EP14_bif03",3;
		mes "[�G�X����]";
		mes "���̎������c�c";
		mes "���x���ɓn���Ă���B";
		mes "���͐�Β��߂Ȃ��ƁB";
		mes "������x�Ɖ�Ȃ���������Ȃ���";
		mes "�ړI���ʂ����܂Łc�c";
		next;
		cutin "EP14_etran01",1;
		mes "^000099�]�G�X�����̎p���ڂ₯�n�߂�B";
		mes "�@�ʐM�@�̗͂��キ�Ȃ����悤���]^000000";
		next;
		cutin "EP14_etran0",1;
		mes "^000099�]�G�X�����̎p��������ƁA";
		mes "�@�����͖΂݂ɗ������]^000000";
		next;
		if(checkitemblank() < 3) {
			mes "�]�A�C�e���������ς��̂悤���B";
			mes "�@�A�C�e���̎�ސ������炵�Ă���";
			mes "�@������x���悤�]";
			cutin "EP14_bif03",255;
			close;
		}
		cutin "EP14_bif03",3;
		mes "^000099�]�Â����t�B�l�̎�����";
		mes "�@��ɓ��ꂽ�]^000000";
		set ECL_6QUE,32;
		chgquest 72572,12298;
		getitem 6539,1;
		getexp 120000,0;
		getexp 0,80000;
		next;
		mes "^000099�]�G�l���M�[���̂ɖ����Ă���B";
		mes "�@�q�G�[���̂Ƃ���֖߂낤�]^000000";
		cutin "EP14_bif03",255;
		close;
	}
	end;
}

eclage.gat,291,301,0	script	#pa0829���x�����O�^�b�`	139,3,3,{
	if(ECL_6QUE == 27) {
		cutin "EP14_robert1",1;
		mes "[���x��]";
		mes "���c�c���ꂪ�B";
		next;
		menu "���ꂪ�z�[���c���[�ł�",-;
		cutin "EP14_robert3",1;
		mes "[���x��]";
		mes "�����܂ŗ��h�Ɂc�c�B";
		mes "�c�c";
		next;
		mes "[���x��]";
		mes "�������Ǝv���Ă����B";
		mes "�G�X�����Ƃ̖񑩂�����";
		mes "�S�̎x���������B";
		mes "�������A����Ȃɂ��B";
		mes "�����c�c�B";
		next;
		mes "^000099�]���x���́A����������";
		mes "�@�z�[���c���[�𒭂߂Ȃ���";
		mes "�@�܂𗬂����B";
		mes "�@���̎��A";
		mes "�@���x���̑̂��ڂ₯�n�߂��]^000000";
		next;
		cutin "EP14_robert01",1;
		mes "[���x��]";
		mes "��H�@�����H";
		mes "�����N���Ă���H";
		next;
		cutin "EP14_robert0",1;
		mes "[���x��]";
		mes "�����A���̐����������邩�H";
		mes "����" +strcharinfo(0)+ "�I";
		mes "���Ȃ��̂�?!";
		mes "�����c�c�I�@��͂薲�Ȃ̂��H";
		next;
		cutin "EP14_robert0",255;
		mes "^000099�]������������";
		mes "�@���x���̎p�������Ă��܂����B";
		mes "�@�܂��̓q�G�[���̏��ɖ߂���";
		mes "�@�󋵂�c������K�v�����肻�����]^000000";
		set ECL_6QUE,28;
		chgquest 12294,12295;
		close;
	}
	end;
}

ecl_fild01.gat,110,240,0	script	#pa0829�����@1	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H�H]";
			mes "���킠�`�΂̉��������I�@������I";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "���킠������!!";
			mes "�����猾��������Ȃ���!!";
			break;
		case 2:
			mes "[�H�H�H�H]";
			mes "���͂܂��Ă��Ă��Ȃ��̂��H";
			mes "���͑����H�ׂ����c�c�B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,110,198,0	script	#pa0829�����@2	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H�H]";
			mes "���́c�c���͂���Ă��܂����B";
			mes "�֎~���ꂽ�̈�I";
			mes "�����āA�z��ɒD���Ă��܂����B";
			mes "����300�O�����B";
			next;
			mes "[�H�H�H�H]";
			mes "�I�[�u���̑O�ł�";
			mes "����͋֎~�ł���B";
			mes "�I�����A���w���B";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "���c�c���̎҂�";
			mes "�{���ɐ��C�Ȃ�ł����H";
			break;
		case 2:
			mes "[�H�H�H�H]";
			mes "�����̂��������";
			mes "���B�֘A�̕i�����������Ȃ��";
			mes "���Ă��Ȃ���I";
			next;
			mes "[�H�H�H�H]";
			mes "���邳���I";
			mes "�N�����ƌ����Ă��N�̂��������";
			mes "���B�֘A�̕i��������������";
			mes "�ڋ��҂��B";
			mes "�����������炢�ł��K�˂ė����B";
			next;
			mes "[�H�H�H�H]";
			mes "�����c�c����";
			mes "���O�̓��𐸘B���Ă��B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,165,158,0	script	#pa0829�����@3	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H�H]";
			mes "�˂��A���Ȃ��B";
			mes "�����ǂ����ē{���Ă���̂�";
			mes "�{���ɂ킩���Ă�́H�@�˂��H";
			next;
			mes "[�H�H�H�H]";
			mes "���������A����������B";
			next;
			mes "[�H�H�H�H]";
			mes "�����H";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "�����������I";
			mes "�����������ȏĂ���!!";
			break;
		case 2:
			mes "[�H�H�H�H]";
			mes "���q��A�������Ă���񂾁H";
			next;
			mes "[�H�H�H�H]";
			mes "�h��̎���ꒆ�ł��B��������B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,237,166,0	script	#pa0829�����@4	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H]";
			mes "1�c�c2�c�c3�c�c4�c�c5�c�c6�c�c";
			mes "�����c�c�B";
			mes "���������c�c�B";
			mes "1�����c�c�B";
			mes "���̓��g���A1�����I";
			break;
		case 1:
			mes "[�H�H�H]";
			mes "���͂��������Ȃ�n�߂Ă���B";
			mes "���̃w�b�h�t�H����";
			mes "���̑S�Ă��X���那�����I";
			next;
			mes "[�H�H�H]";
			mes "���y���������̍���";
			mes "�B��F�߂��Ă��閃�򂾂���c�c�B";
			break;
		case 2:
			mes "[�H�H�H]";
			mes "�����Q�鎖�ɂ��悤�B";
			mes "�����A�N������";
			mes "���ׂĂ��I����Ă���";
			mes "�����������킪";
			mes "���a�ɖK���͂����B";
			mes "�����[�N���X�}�X�B";
			next;
			mes "^000099�]�ʐM�@�����삵���B";
			mes "�@�Ȃ����߂����C�����ɂȂ����]^000000";
			close;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,230,206,0	script	#pa0829�����@5	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H]";
			mes "1�c�c2�c�c3�c�c4�c�c5�c�c6�c�c";
			mes "�����c�c�B";
			mes "���������c�c�B";
			mes "1�����c�c�B";
			mes "���̓��g���A1�����I";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "�˂��A���Ȃ��B";
			mes "�����ǂ����ē{���Ă���̂�";
			mes "�{���ɂ킩���Ă�́H�@�˂��H";
			next;
			mes "[�H�H�H�H]";
			mes "���������A����������B";
			next;
			mes "[�H�H�H�H]";
			mes "�����H";
			break;
		case 2:
			mes "[�H�H�H]";
			mes "������ƉE�ɉ���ĉ������`�B";
			mes "����������ƍ��Ɂ`�B�͂��B";
			mes "�����z���ā`�A�͂��I�䖝���ā`�I";
			mes "�J�V���b�I";
			mes "�͂��A����f���ĉ������`�B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,234,266,0	script	#pa0829�����@6	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H�H]";
			mes "���킠�`�΂̉��������I�@������I";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "���킠������!!";
			mes "�����猾��������Ȃ���!!";
			break;
		case 2:
			mes "[�H�H�H�H]";
			mes "���͂܂��Ă��Ă��Ȃ��̂��H";
			mes "���͑����H�ׂ����c�c�B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,179,125,0	script	#pa0829�����@7	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H�H]";
			mes "���́c�c���͂���Ă��܂����B";
			mes "�֎~���ꂽ�̈�I";
			mes "�����āA�z��ɒD���Ă��܂����B";
			mes "����300�O�����B";
			next;
			mes "[�H�H�H�H]";
			mes "�I�[�u���̑O�ł�";
			mes "����͋֎~�ł���B";
			mes "�I�����A���w���B";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "���c�c���̎҂�";
			mes "�{���ɐ��C�Ȃ�ł����H";
			break;
		case 2:
			mes "[�H�H�H�H]";
			mes "�����̂��������";
			mes "���B�֘A�̕i�����������Ȃ��";
			mes "���Ă��Ȃ���I";
			next;
			mes "[�H�H�H�H]";
			mes "���邳���I";
			mes "�N�����ƌ����Ă��N�̂��������";
			mes "���B�֘A�̕i��������������";
			mes "�ڋ��҂��B";
			mes "�����������炢�ł��K�˂ė����B";
			next;
			mes "[�H�H�H�H]";
			mes "�����c�c����";
			mes "���O�̓��𐸘B���Ă��B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,179,179,0	script	#pa0829�����@8	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H�H]";
			mes "�˂��A���Ȃ��B";
			mes "�����ǂ����ē{���Ă���̂�";
			mes "�{���ɂ킩���Ă�́H�@�˂��H";
			next;
			mes "[�H�H�H�H]";
			mes "���������A����������B";
			next;
			mes "[�H�H�H�H]";
			mes "�����H";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "�����������I";
			mes "�����������ȏĂ���!!";
			break;
		case 2:
			mes "[�H�H�H�H]";
			mes "���q��A�������Ă���񂾁H";
			next;
			mes "[�H�H�H�H]";
			mes "�h��̎���ꒆ�ł��B��������B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,187,243,0	script	#pa0829�����@9	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H]";
			mes "1�c�c2�c�c3�c�c4�c�c5�c�c6�c�c";
			mes "�����c�c�B";
			mes "���������c�c�B";
			mes "1�����c�c�B";
			mes "���̓��g���A1�����I";
			break;
		case 1:
			mes "[�H�H�H]";
			mes "���͂��������Ȃ�n�߂Ă���B";
			mes "���̃w�b�h�t�H����";
			mes "���̑S�Ă��X���那�����I";
			next;
			mes "[�H�H�H]";
			mes "���y���������̍���";
			mes "�B��F�߂��Ă��閃�򂾂���c�c�B";
			break;
		case 2:
			mes "[�H�H�H]";
			mes "�����Q�鎖�ɂ��悤�B";
			mes "�����A�N������";
			mes "���ׂĂ��I����Ă���";
			mes "�����������킪";
			mes "���a�ɖK���͂����B";
			mes "�����[�N���X�}�X�B";
			next;
			mes "^000099�]�ʐM�@�����삵���B";
			mes "�@�Ȃ����߂����C�����ɂȂ����]^000000";
			close;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

ecl_fild01.gat,159,278,0	script	#pa0829�����@10	139,3,3,{
	if(ECL_6QUE == 29) {
		switch(rand(3)) {
		case 0:
			mes "[�H�H�H]";
			mes "1�c�c2�c�c3�c�c4�c�c5�c�c6�c�c";
			mes "�����c�c�B";
			mes "���������c�c�B";
			mes "1�����c�c�B";
			mes "���̓��g���A1�����I";
			break;
		case 1:
			mes "[�H�H�H�H]";
			mes "�˂��A���Ȃ��B";
			mes "�����ǂ����ē{���Ă���̂�";
			mes "�{���ɂ킩���Ă�́H�@�˂��H";
			next;
			mes "[�H�H�H�H]";
			mes "���������A����������B";
			next;
			mes "[�H�H�H�H]";
			mes "�����H";
			break;
		case 2:
			mes "[�H�H�H]";
			mes "������ƉE�ɉ���ĉ������`�B";
			mes "����������ƍ��Ɂ`�B�͂��B";
			mes "�����z���ā`�A�͂��I�䖝���ā`�I";
			mes "�J�V���b�I";
			mes "�͂��A����f���ĉ������`�B";
			break;
		}
		next;
		mes "^000099�]�ʐM�@�͓��삵�����A";
		mes "�@�G�X�����Ƃ͊֌W�Ȃ��������]^000000";
		close;
	}
	end;
}

eclage.gat,155,91,4	script	#pa0829�q�G�[����10	836,{
	mes "[�f����]";
	mes "�q�G�[���̌������B";
	mes "���̖���";
	mes "�p�p���A�����A�T�t�@����";
	mes "�o�����֎~���܂��B";
	next;
	if(select("��������","���ɓ���") == 1)
		close;
	warp "ecl_in04.gat",107,213;
	end;
OnInit:
	waitingroom "�q�G�[���̌�����",0;
	end;
}

ecl_in04.gat,109,212,0	warp	ecl_in04_exit	1,1,eclage.gat,152,91

ecl_in04.gat,105,216,4	script	�q�G�[���̍�Ƒ�	111,{
	switch(ECL_6QUE) {
	case 14:
		// ������
		mes "[�q�G�[��]";
		mes "���āA���ꂶ�Ⴀ���ۂɂ�����g����";
		mes "�����ɒu���Ă������āA�Ɓc�c�B";
		mes "����c�c�ς��ȁH";
		mes "�m���ɖ{�ɏ�����Ă���ʂ��";
		mes "�z��ɂȂ��Ă���͂��Ȃ񂾂��B";
		mes "�ǂ����Ĕ������Ȃ��񂾁B";
		next;
		mes "[�q�G�[��]";
		mes "���`��";
		mes "��������΂����̂��ȁH";
		mes "����A�Ⴄ�ȁB";
		mes "���������I";
		mes "����A�������H";
		mes "�c�c�c�c";
		next;
		mes "[�q�G�[��]";
		mes "�ǂ����ă_���Ȃ񂾂�I";
		mes "�������𕷂���!!";
		mes "���̂悤�ɔz�񂵂���";
		mes "���������������Ԃ��Ă���ׂ����낤�I";
		mes "���̂Ȃ񂾁I";
		next;
		mes "^000099�]�v���ʂ�i�܂��A�\���q�G�[���B";
		mes "�@���q�Ɏ肩��ł̔j�Ђ��]���������B";
		mes "�@���̂܂܂ł͈ł̔j�Ђ��c�c�I�]^000000";
		next;
		menu "���L�΂��ł̔j�Ђ�͂�",-;
		mes "^000099�]���ɗ��������Ȉł̔j�Ђ�";
		mes "�@����ł̏��Œ͂ݎ��A";
		mes "�@�q�G�[�����ׂ̂Ă����z��̒���";
		mes "�@�����Ɩ߂����]^000000";
		next;
		mes "�]���̏u�ԁI�]";
		next;
		sc_start3 SC_BLIND,0,0,0,0,60000,10;
		mes "^000099�]�ڂ̑O���Â��Ȃ�";
		mes "�@�������炩�����������Ă����]^000000";
		next;
		cutin "EP14_etran0",1;
		mes "[�H�H�H�H]";
		mes "�Ⴆ�΁A�N���b���Ă����ʂ�";
		mes "�z�[���c���[��";
		mes "��Ɋ����������Ƃ��悤�B";
		mes "�����A���̌�͂ǂ�����H";
		mes "�z���z�����ދ���ȃG�l���M�[��";
		mes "�ǂ�����Ƃ����񂾁H";
		next;
		cutin "EP14_robert0",1;
		mes "[�H�H�H�H]";
		mes "�m���ɂ��̒ʂ肾�B";
		mes "�z�[���c���[�𐶂��Ԃ点��ɂ́A";
		mes "�z�����͂邩�ɒ����鐶���͂��K�v���B";
		mes "�����A����ł��z�[���c���[��";
		mes "�����Ԃ点�Ȃ��Ƒʖڂ��B";
		mes "�K���K�v���B";
		next;
		cutin "EP14_etran0",1;
		mes "[�H�H�H�H]";
		mes "���̊ԂɎ���ł���";
		mes "���̐����̂����͂ǂ�����B";
		mes "�z�[���c���[�̊����̂��߂�";
		mes "���\�N�A���S�N�ԂƂ������ԁA";
		mes "�z�[���c���[�E�G��";
		mes "�s�т̒n�ɂȂ邩���m��Ȃ��񂾂��I";
		next;
		mes "[�H�H�H�H]";
		mes "����A�ԈႢ�Ȃ��Ȃ�I";
		mes "�z�[���c���[�ȊO�̐����͑S�ł��B";
		mes "�z�[���c���[�͖���������ׂ̕����I";
		mes "���ꂶ�Ⴀ�{���]�|����Ȃ���?!";
		next;
		cutin "EP14_robert0",1;
		mes "[�H�H�H�H]";
		mes "�z�[���c���[�����ɐ������ێ����Ă��A";
		mes "�ǂ��������͎����Ȃ��񂾁B";
		mes "������x�̋]���͊o�債�Ȃ��Ƒʖڂ��B";
		mes "����͒N�������O��";
		mes "�m���Ă��邾�낤�I";
		next;
		cutin "EP14_etran0",1;
		mes "[�H�H�H�H]";
		mes "��͂�z�[���c���[������������";
		mes "���̗͂𗘗p���鎖�ŕ��s����";
		mes "��n�𐶂��Ԃ点��A�Ƃ������@��";
		mes "��ԑ������A�V���v�����낤�B";
		next;
		mes "[�H�H�H�H]";
		mes "�����A������ɂ��悱�̌��f��";
		mes "��X�̖��^��傫�����E����̂�";
		mes "�ԈႢ�Ȃ������c�c�B";
		mes "�ʂ����Ă���Ȍ�������X��";
		mes "����񂾂낤���c�c�I";
		next;
		mes "[�H�H�H�H]";
		mes "�z�[���c���[�𐶂�������";
		mes "�{���ɐ��������Ȃ̂��H";
		mes "�������E����悤�Ȍ����Ȃ�";
		mes "�N�����ׂ��ł͂Ȃ��񂶂�Ȃ����H";
		next;
		cutin "EP14_robert0",1;
		mes "[�H�H�H�H]";
		mes "�ӂӁB�ǂ��������Ă���ȁA�G�X�����B";
		mes "�K���I���͕K�v���B";
		mes "���ꂪ������Ƃ��������B";
		mes "�N�������߂Ȃ���΂����Ȃ��B";
		next;
		mes "[�H�H�H�H]";
		mes "�܂��A��������l�����Řb���Ă�";
		mes "�����J���Ȃ����낤�B";
		mes "���͌��V��̌���ɏ]�����Ƃɂ����B";
		set ECL_6QUE,15;
		chgquest 12287,72560;
		close2;
		cutin "EP14_robert0",255;
		sc_end SC_BLIND;
		end;
	case 15:
		mes "^000099�]�q�G�[��������Ă��ꂽ";
		mes "�@�����ʐM�@�̏����@������B";
		mes "�@�G��ƍ쓮�������Ȋ���������]^000000";
		close;
	case 16:
		sc_start3 SC_BLIND,0,0,0,0,60000,10;
		mes "^000099�]�q�G�[�������ׂĂ���z��̒�����";
		mes "�@�ł̔j�Ђ�u�����u�ԁA";
		mes "�@�ڂ̑O���Â��Ȃ�A";
		mes "�@�����������Ă����]^000000";
		next;
		cutin "EP14_robert0",1;
		mes "[�H�H�H�H]";
		mes "�񍐂��܂��B�����ɂ���";
		mes "�z�[���c���[�̑n���ɂ����鎞�Ԃ�";
		mes "���Ȃ��Ƃ�200�N�B";
		mes "���̊ԁA���̑�n�ɐ����鐶���̂�";
		mes "��80%����ł��܂��B";
		next;
		mes "[�H�H�H�H]";
		mes "�z�[���c���[�𐶂��Ԃ点�Ȃ��ꍇ";
		mes "�������̋��������X�Ɍ����čs���ׁA";
		mes "��400�N�Ő����̂͑S�Đ�ł��܂��B";
		next;
		mes "[�H�H�H�H]";
		mes "200�N�̊Ԃɑ����̋]�����o�債�A";
		mes "���{�𗧂Ē����A�������a���y���ނ��B";
		mes "400�N�ԁA�������Í��Y�����炵�Ȃ���";
		mes "����ł����̂��B";
		mes "��Ɉ�ł��B";
		next;
		mes "[�H�H�H�H]";
		mes "�ǂ����A���V��̌����Ȕ��f��";
		mes "���肢���܂��B";
		mes "�ȏ�ł��B";
		next;
		cutin "EP14_robert0",255;
		mes "[�Ⴂ��]";
		mes "���ށB���肪�Ƃ��B";
		mes "�񍐏��͎󂯎�点�Ă��������B";
		next;
		mes "[�Ⴂ��]";
		mes "�ł́A���\����B";
		mes "��X�A���V��̌���́c�c";
		next;
		mes "^000099�]���Ƀm�C�Y������Ȃ���A";
		mes "�@���̐��E�ɖ߂����]^000000";
		set ECL_6QUE,17;
		chgquest 12288,72562;
		sc_end SC_BLIND;
		close;
	case 17:
		mes "^000099�]�q�G�[��������Ă��ꂽ";
		mes "�@�����ʐM�@�̏����@������B";
		mes "�@���͐G���Ă������Ȃ��]^000000";
		close;
	case 33:
		cutin "EP14_robert01",1;
		mes "[���x��]";
		mes "��H";
		mes "����́c�c�H";
		mes "���̑O�̂����炩�H";
		mes "��͂薲�ł͂Ȃ������̂��B";
		next;
		cutin "EP14_robert5",1;
		mes "[���x��]";
		mes "�����A" +strcharinfo(0)+ "�I";
		mes "���Ȃ����͋}�ɂ��Ȃ��Ȃ����ȁB";
		mes "���̎��̏o������";
		mes "�����Ǝv���Ă�����B";
		next;
		mes "^000099�]���x�����N���Ȏp�œo�ꂵ���]";
		next;
		menu "�o�܂��������",-;
		cutin "EP14_robert1",1;
		mes "[���x��]";
		mes "�Ȃ�قǁB";
		mes "�܂��@�B�̒��q���ǂ��Ȃ������̂��B";
		mes "�������c�c";
		mes "�Z�p�̐i���Ƃ����̂�";
		mes "�������₦�Ȃ��ȁB";
		next;
		mes "[���x��]";
		mes "��H�@�N�̉E��ɂ���";
		mes "���̎����͂Ȃ񂾁H";
		while(1) {
			next;
			if(select("�s��Ŕ����܂���","���݂܂���","�G�X�����Ɖ���ė��܂���") == 3)
				break;
			cutin "EP14_robert5",1;
			mes "[���x��]";
			mes "���������B";
			mes "�����x�����Ƃ͂ł��Ȃ����A";
			mes "�����ɘb���Ă���B";
			mes "���̎����͂ǂ��Ŏ�ɓ��ꂽ�H";
		}
		cutin "EP14_robert5",255;
		mes "["+strcharinfo(0)+"]";
		mes "�G�X�����̎����ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�G�X�����́A";
		mes "���Ȃ���Ă���悤�Ɍ����܂����B";
		mes "�����Ńr�t���X�g�̌��݂̎p��";
		mes "���Ă��炢�܂����B";
		next;
		cutin "EP14_robert3",1;
		mes "[���x��]";
		mes "�ӂށB";
		next;
		cutin "EP14_robert3",255;
		mes "["+strcharinfo(0)+"]";
		mes "�r�t���X�g�̑�n��";
		mes "���������߂����p���݂āA";
		mes "�G�X���������ł��܂����B";
		next;
		cutin "EP14_robert3",1;
		mes "[���x��]";
		mes "�������I";
		mes "���������ē|��Ă��Ȃ���";
		mes "�S�z���Ă����̂���";
		mes "���C�����߂����悤��";
		mes "���S������B";
		next;
		mes "[���x��]";
		mes "�G�X�������A�����̓w�͂�";
		mes "���ꂽ�p������";
		mes "�����A�������������낤�B";
		mes "���������������B";
		next;
		cutin "EP14_robert3",255;
		mes "["+strcharinfo(0)+"]";
		mes "�G�X�����́A���̎�����";
		mes "���Ȃ��ɓn���Ă���ƁB";
		mes "���g�̖ڂŌ��������̃r�t���X�g�ׂ̈�";
		mes "��΂ɂ�����߂Ȃ��œw�͂���ƁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�G�X�����͂��Ȃ���";
		mes "�E�C�������̂�S�z���Ă��܂����B";
		mes "���Ȃ��̃z�[���c���[��";
		mes "���܂�������̂�";
		mes "���ڊm�F�ł��Ȃ��󋵂������̂ŁB";
		next;
		cutin "EP14_robert3",1;
		mes "[���x��]";
		mes "����͂��傤���Ȃ��B";
		mes "���������A��n�ɐ�����t�^����ԁA";
		mes "�p�t�͐�΂ɗ�����Ȃ�����ȁB";
		mes "�������A�Ȃ�Ƃ����ăG�X�����ɂ�";
		mes "���̌i�F�����������������̂����c�c�B";
		next;
		menu "�z�[���c���[�̗t���~����",-;
		cutin "EP14_robert4",1;
		mes "[���x��]";
		mes "�����A�Ȃ�قǁI";
		mes "�G�X�����Ƀz�[���c���[�̗t��";
		mes "�����悤�Ƃ��������ȁB";
		next;
		cutin "EP14_robert2",1;
		mes "[���x��]";
		mes "���傤�ǎ��̃z�[���c���[��";
		mes "���߂Ă̗t�𐶐�������Ԃ��B";
		mes "�����҂��Ă���B";
		cutin "EP14_robert2",255;
		set ECL_6QUE,34;
		chgquest 12299,72574;
		close;
	case 34:
		mes "^000099�]�܂����x���̔������Ȃ��B";
		mes "�@�t���̎����Ă���悤���]^000000";
		close;
	case 35:
		cutin "EP14_robert2",1;
		mes "[���x��]";
		mes "�҂������ȁB";
		next;
		mes "[���x��]";
		mes "���ꂪ�z�[���c���[�̗t���B";
		mes "�󂯎���Ă���B";
		next;
		cutin "EP14_robert4",1;
		mes "[���x��]";
		mes "���A����Ɛ�قǌN���n���Ă��ꂽ";
		mes "����肾���A";
		mes "�G�X�����ɕԂ��Ă���Ă���B";
		next;
		mes "[���x��]";
		mes "�����̏����i��";
		mes "���g�����������Ă����Ȃ��";
		mes "�C���������B�͂́B";
		next;
		cutin "EP14_robert2",1;
		mes "[���x��]";
		mes "�����A�Ō��1��";
		mes "�����Ɉꌾ";
		mes "�`�������肢�������B";
		next;
		cutin "EP14_robert01",1;
		mes "[���x��]";
		mes "���Ƌ��ɕ���ł����";
		mes "���肪�Ƃ��B";
		mes "������x�Ɖ����";
		mes "����Ȃ������m��Ȃ���";
		mes "�S�͂������ɂ���ƁB";
		next;
		mes "[���x��]";
		mes "�����āc�c";
		mes "���O������M���Ă��邭�炢";
		mes "^000099�������O��M�����Ă���^000000�ƁB";
		next;
		if(checkitemblank() < 3) {
			mes "[���x��]";
			mes "�ו��������ς��̂悤���ȁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x���Ă���B";
			close2;
			cutin "EP14_robert01",255;
			end;
		}
		cutin "EP14_robert01",255;
		mes "^000099�]���x���͂��̌��t���c���A";
		mes "�@�ʐM�@�̒��Ɏp���������B";
		mes "�@��ɂ̓��x�����n���Ă��ꂽ";
		mes "�@�z�[���c���[�̗t��";
		mes "�@�G�X�����̎���肪�c�����]^000000";
		set ECL_6QUE,36;
		chgquest 72576,12300;
		getitem 6540,1;
		getexp 120000,0;
		getexp 0,80000;
		close;
	case 36:
		if(countitem(6540) < 1 || countitem(6539) < 1) {
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "�z�[���c���[�̗t�Ǝ�����";
			mes "�G�X�����ɓn���Ă���B";
			if(checkitemblank() < 3) {
				next;
				mes "[���x��]";
				mes "�ו��������ς��̂悤���ȁB";
				mes "�A�C�e���̎�ސ������炵�Ă���";
				mes "������x���Ă���B";
				close2;
				cutin "EP14_robert01",255;
				end;
			}
			if(countitem(6540) < 1)
				getitem 6540,1;
			if(countitem(6539) < 1)
				getitem 6539,1;
			close;
		}
		mes "^000099�]�����ʐM�@���u����Ă���B";
		mes "�@�������g�����͂Ȃ��������]^000000";
		close;
	case 37:
	case 38:
		mes "^000099�]�����ʐM�@���u����Ă���B";
		mes "�@�������g�����͂Ȃ��������]^000000";
		close;
	case 39:
		mes "^000099�]�ŐV�̎����ʐM�@���B";
		mes "�@����𗘗p���鎖�ŉߋ��▢���A";
		mes "�@�܂��A���̎����̉f����";
		mes "�@�`�����ނ��Ƃ��ł��������B";
		mes "�@�C�ɂȂ鎞�Ɏg���Č��悤�]^000000";
		set ECL_6QUE,41;
		chgquest 72580,201575;
		close;
	case 40:
		mes "^000099�]�ŐV�̎����ʐM�@���B";
		mes "�@����𗘗p���鎖�ŉߋ��▢���A";
		mes "�@�܂��A���̎����̉f����";
		mes "�@�`�����ނ��Ƃ��ł��������B";
		mes "�@�C�ɂȂ鎞�Ɏg���Č��悤�]^000000";
		set ECL_6QUE,41;
		chgquest 72582,201575;
		close;
	case 41:
		switch(rand(3)) {
		case 0:
			mes "^000099�]�I�v�Ȃ��J�]^000000";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "���`���A���x���`�I";
			mes "���x���`�I";
			mes "�ו��͂���Ȃ��̂ő��v���ȁH";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "���������A���O�̉ו��͂킩����B";
			mes "���߂ɗp�ӂ��Ă�����B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�͂́B������������B";
			next;
			cutin "EP14_etran4",1;
			mes "[�G�X����]";
			mes "�c�c";
			next;
			mes "[�G�X����]";
			mes "���悢�悾�ȁA���x���B";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�������ȁB";
			next;
			cutin "EP14_etran4",1;
			mes "[�G�X����]";
			mes "���܂��c�c";
			mes "�����Ƃ����ȁB";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�������ȁB";
			next;
			mes "[���x��]";
			mes "���_��G�l���M�[�͑���Ă���B";
			mes "�z�[���c���[�̑n�����ɔ�������";
			mes "��n�̕��s��";
			mes "������x�}���鎖�����ł����";
			mes "�z�[���c���[�͊�������͂����B";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "�܂�͂��O����Ƃ��������B";
			next;
			cutin "EP14_etran3",1;
			mes "[�G�X����]";
			mes "�܂���������āI";
			mes "�������A�S�͂͐s�������B";
			next;
			cutin "EP14_etran5",1;
			mes "[�G�X����]";
			mes "�ł�����ς�s���Łc�c�B";
			mes "�@";
			mes "�c�c";
			mes "���x���͕ς��Ȃ���ȁ`�{���ɁB";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�����ł��Ȃ����B";
			mes "���O�����������Ȃ����񂶂�Ȃ����B";
			next;
			cutin "EP14_etran5",1;
			mes "[�G�X����]";
			mes "�������Ȃ��B";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "���낻��o���̎��Ԃ��B";
			next;
			cutin "EP14_etran4",1;
			mes "[�G�X����]";
			mes "��������Ȏ��Ԃ��B";
			next;
			mes "[�G�X����]";
			mes "�Ȃ��A���x���B";
			mes "�܂��A���Ƃ����ȁB";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "���̎��́A���O�̍D����";
			mes "�u���[�x���[�p�C��";
			mes "�����������Ă�낤�B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�{���ɁI�@������I";
			mes "��΂����B";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�܂��A���݂��̏󋵂͂�����";
			mes "���̃G�N���[�W���̑�n��";
			mes "�����Ă���邾�낤�B";
			mes "���������T�d�ɐi�߂悤�B";
			next;
			mes "[���x��]";
			mes "���āc�c";
			mes "�s�����B";
			next;
			cutin "EP14_etran6",1;
			mes "[�G�X����]";
			mes "���x���`�B";
			next;
			cutin "EP14_etran4",1;
			mes "[�G�X����]";
			mes "�撣�낤�ȁI";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "�����B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "���ꂶ��I";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "�����B";
			close2;
			cutin "EP14_robert4",255;
			end;
		case 1:
			mes "^000099�]��������郍�x���]^000000";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "����A�����������B";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "�G�X���������������߂鍠���ȁB";
			mes "�������߂鍠�ɂ�";
			mes "���������ɏo���オ���Ă��邾�낤�B";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "��`���B���܂��Ă����B";
			mes "���̂�����Ƃ���p�C���n�B";
			mes "�������ǂ��B";
			mes "����B��Ȃ���ǂ��ł����ȁB";
			mes "���āc�c������ƐH�ׂĂ݂邩�ȁB";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "�ӂށc�c����B";
			mes "�G�X�������Ƃɖ߂��Ă��鍠���B";
			mes "�����čs���Ĉꏏ�ɐH�ׂ邩�ȁB";
			next;
			cutin "EP14_robert2",255;
			mes "^000099�]�p�C�������ăG�X�����̉Ƃ�";
			mes "�@�K�˂郍�x���B�]^000000";
			next;
			cutin "EP14_etran2",1;
			mes "[�G�X�����̈ē���]";
			mes "�����͎��A�G�X�����̉Ƃł��I";
			mes "�����A���̓r�t���X�g�ɍs���Ă��܂��I";
			mes "�A��͒x���Ȃ肻���ł��B";
			mes "�v���[���g�͌��ւɒu���ĉ������B";
			next;
			cutin "EP14_etran2",1;
			mes "[�G�X�����̈ē���]";
			mes "���A�ł��c�c�ǂ��l������";
			mes "�v���[���g�Ȃ�Ď����ė��Ă����l";
			mes "���Ȃ����I";
			mes "�܂������x�����p�C���Ă���";
			mes "���Ă����͂����Ȃ����B";
			mes "�͂͂͂́I";
			next;
			cutin "EP14_robert5",1;
			mes "[���x��]";
			mes "�����ė��Ă��Ȃ��I";
			mes "�p�C�Ȃ�ďĂ��Ď����ė��Ă��Ȃ��I";
			mes "��x�Ǝ����Ă�����̂��I";
			close2;
			cutin "EP14_robert5",255;
			end;
		case 2:
			mes "^000099�]�G�X�����ƃ��x���̗c������P�]^000000";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "�ǂ������H�@�Ȃ������Ă���H";
			next;
			cutin "EP14_etran7",1;
			mes "[�G�X����]";
			mes "�������B���̎���w����������";
			mes "�݂��Ƃ��Ȃ��Ɠ����N���X�̓z�炪";
			mes "�����߂Ă���c�c�B";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "�Ȃ񂾁B";
			mes "����Ȃ��Ƃŋ����Ă���̂��B";
			mes "������ƌ����Ă��O�̔w��";
			mes "�}�ɍ����Ȃ�킯�ł͂Ȃ����낤�B";
			next;
			mes "[���x��]";
			mes "�������A�������";
			mes "���O�������Ă���p������ׂ�";
			mes "�킴�Ƃ����߂Ă���񂾁B";
			mes "���܂ł������Ă�����";
			mes "����̎v���܂܂��낤�B";
			mes "���������̂͂�߂�B";
			next;
			cutin "EP14_etran7",1;
			mes "[�G�X����]";
			mes "������B";
			next;
			cutin "EP14_robert3",1;
			mes "[���x��]";
			mes "�����c�c�B";
			mes "�{���ɋ��������ȁB";
			next;
			cutin "EP14_etran5",1;
			mes "[�G�X����]";
			mes "������ȃ��x���͔w���������c�c�B";
			mes "�������x���̂悤��";
			mes "�N�[���ɂȂ肽���B";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "�c�c";
			next;
			cutin "EP14_robert4",255;
			mes "^000099�]�����Ԍ�]^000000";
			next;
			cutin "EP14_robert3",1;
			mes "[���x��]";
			mes "^FF0000���̕ӂ肩�B^000000";
			next;
			cutin "EP14_robert3",255;
			mes "^000099�]�G�X�����������߂Ă���";
			mes "�@���t�B�l�����͂��̖�A";
			mes "�@�S�����T�Ԃ̉���𕉂����B�]^000000";
			close2;
			cutin "EP14_etran1",255;
			end;
		case 3:
			mes "^000099�]�G�X�����ƃ��x���̗c������Q�]^000000";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "���`���A���x���`�I";
			mes "���x���`�I";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�Ȃ񂾁B�G�X�����B";
			mes "�������C����Ȃ���";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�ӂӂӁB����";
			mes "���̊Ԏ��������߂Ă��Ă��z�炪";
			mes "�����肵�Ă�����Č����Ă����񂾁I";
			mes "���߂�Ȃ������Ďӂ�Ȃ���I";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "�������B�悩��������Ȃ����B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�����Ȃ񂾂�B�ӂӁB";
			mes "������ˁA���������Ă�����񂾁I";
			next;
			cutin "EP14_etran2",1;
			mes "[�G�X����]";
			mes "���邳��!!";
			mes "���O�����݂�����";
			mes "���C�Ől�̈����������z��";
			mes "�F�B�ɂȂ�C�͖����I";
			mes "���ĂˁI";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "����[���̌シ��������ꂽ��I";
			mes "�ł����B";
			mes "�Ȃ񂩔ނ����������Ă���";
			mes "���������������񂾁B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�ǂ��������x���I";
			mes "�����͒j�炵���Ȃ������낤�����I";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "�͂́B";
			mes "�͂͂͂́I";
			mes "�G�X�����B";
			mes "���O�͖ʔ����Ȃ�͂�B";
			close2;
			cutin "EP14_robert4",255;
			end;
		case 4:
			mes "^000099�]�G�X�����̋�Y�]^000000";
			next;
			cutin "EP14_etran4",1;
			mes "[�G�X����]";
			mes "�������I";
			mes "�܂����B";
			mes "�}�ɑ�n�̔j�󑬓x���c�c�B";
			next;
			mes "[�G�X����]";
			mes "�͂��`�B";
			mes "���x���͑�n��ʂ���";
			mes "���݂��̏󋵂��m�F�o�������";
			mes "�����Ă������ǁc�c�B";
			next;
			cutin "EP14_etran5",1;
			mes "[�G�X����]";
			mes "�����̗͂��キ�Ȃ��Ă���̂�";
			mes "��n�̗͂������Ȃ��Ă���̂�";
			mes "����������Ƃ����Ă����";
			mes "�S�R�킩��Ȃ��Ȃ��Ă����c�c�B";
			next;
			mes "[�G�X����]";
			mes "�{���ɏ�肭�����Ă�̂��Ȃ���c�c�B";
			close2;
			cutin "EP14_etran5",255;
			end;
		case 5:
			mes "^000099�]�������G�X�����ƃ��x����";
			mes "�@���l�ƊŎ炾������H�]^000000";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�Ŏ�`�����͊����������Ă����B";
			mes "����ł͎��̔畆���S��";
			mes "�J�T�J�T�ɂȂ��Ă��܂���`�B";
			mes "����ł������Ƃ����̂��H�@��H";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "���􂦁B";
			next;
			cutin "EP14_etran5",1;
			mes "[�G�X����]";
			mes "�����A�͂��c�c�B";
			close2;
			cutin "EP14_etran5",255;
			end;
		case 6:
			mes "^000099�]�����̓S�l���x���]^000000";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "������p�C�����B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�{���I�@�{����!?";
			mes "���������ău���[�x���[�������H";
			mes "�������I�@��D���Ȃ񂾂�I";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "�������A�����B";
			mes "�����āA�����̒���Ŏ�ɓ��ꂽ";
			mes "�傫�ȃC�`�S���悹��B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�ȁA�Ȃ񂾂��āH";
			mes "�C�A�C�`�S�܂�!?";
			mes "���Ƃ��������I";
			mes "����Ȏ��������Ă����̂��I";
			mes "�l���邾���œ������������Ȃ�I";
			next;
			mes "[�G�X����]";
			mes "���A����ł�������";
			mes "�����Ă�����Ȃ񂾂��H";
			mes "2�H�@����A�҂Ă�c�c";
			mes "2�ł͑���Ȃ��Ȃ��H";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "1�Ă��B";
			mes "�N�̂͂Ȃ��B";
			next;
			cutin "EP14_etran6",1;
			mes "[�G�X����]";
			mes "���������������������������I";
			mes "������邵�Ȃ��ł�I";
			mes "���������������Ă����񂾂�I";
			close2;
			cutin "EP14_etran6",255;
			end;
		case 7:
			mes "^000099�]�z�[���c���[�]^000000";
			next;
			cutin "EP14_robert2",1;
			mes "[���x��]";
			mes "���ށB";
			mes "�������ȁB";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�����c�c";
			mes "�v������萬���������B";
			next;
			mes "[���x��]";
			mes "�\����ǂ��y�[�X��";
			mes "�������Ă��ꂻ�������A";
			mes "��肭�R���g���[�����Ȃ���";
			mes "��n�̕����c�c�B";
			mes "��̓G�X�������B";
			next;
			mes "[���x��]";
			mes "��肭�����������Ă�����";
			mes "�����񂾂��c�c�B";
			close2;
			cutin "EP14_robert1",255;
			end;
		case 8:
			mes "^000099�]���f�]^000000";
			next;
			cutin "EP14_etran8",1;
			mes "[�G�X����]";
			mes "�������I";
			mes "�Ȃ�Ȃ񂾂挳�V��̓z��I";
			mes "�Ȃ�ł������Ȃ�";
			mes "�r�t���X�g�ւ̈ڏZ��i�߂�񂾁B";
			mes "�������������Ă킩�邾�낤�I";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�АM��ۂƂ��ƕK���Ȃ񂾂낤�B";
			mes "���������s���Ă���̂͊ԈႢ�Ȃ��B";
			mes "���イ�܂����������݂����Ȃ��B";
			next;
			mes "[���x��]";
			mes "�����A���������肵���i�K�ł�";
			mes "�I�����Ƃ��đÓ��������̂��������B";
			next;
			cutin "EP14_etran8",1;
			mes "[�G�X����]";
			mes "����͂��������ǁB�ł���!!";
			mes "���̂܂܂����Q�������邾������B";
			mes "����莄�������v�悵�Ă���";
			mes "�z�[���c���[�̑n���ɂ�";
			mes "�e�����o�Ă��܂��B";
			next;
			cutin "EP14_robert1",1;
			mes "[���x��]";
			mes "�������ȁc�c�B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�������B���x���I";
			mes "�ǂ������l�������B";
			mes "������������Ă��c�c";
			mes "���ɂ傲�ɂ�c�c";
			next;
			cutin "EP14_robert3",1;
			mes "[���x��]";
			mes "�Ȃ�قǁB";
			mes "������Ȃ��c�c���A�ĊO�������ȁB";
			mes "���܂��������������B";
			next;
			cutin "EP14_etran1",1;
			mes "[�G�X����]";
			mes "�ł���I";
			mes "��肭�����Ǝv���ȁB";
			next;
			cutin "EP14_robert3",1;
			mes "[���x��]";
			mes "�����̂��H";
			mes "���܂���������";
			mes "�{���Ɍ�߂�͂ł��Ȃ����B";
			next;
			cutin "EP14_etran4",1;
			mes "[�G�X����]";
			mes "�c�c";
			mes "�c�c�c�c";
			next;
			mes "[�G�X����]";
			mes "����B";
			next;
			mes "[�G�X����]";
			mes "�������Ȃ���";
			mes "���ǑʖڂɂȂ��Ă��܂��񂾂낤�B";
			mes "�o��͌��߂邳�I";
			mes "���x���������C�Ȃ̂�!?";
			next;
			cutin "EP14_robert4",1;
			mes "[���x��]";
			mes "�ӂӁB";
			mes "�������B���͕��C����B";
			mes "���O���S�z�������������B";
			next;
			cutin "EP14_etran5",1;
			mes "[�G�X����]";
			mes "������";
			mes "�܂���������āB";
			mes "�@";
			mes "���Ⴀ���A���́c�c";
			mes "�@";
			mes "�]�ʐM�͂����œr�؂ꂽ�]";
			close2;
			cutin "EP14_etran5",255;
			end;
		case 9:
			mes "[�H�H�H]";
			mes "�s�[�[�[AND!?";
			mes "�`�`�s�[�s�[�`";
			mes "OH�@MY�@SHOULDER!!";
			next;
			mes "^000099�]�����ƕ����]^000000";
			close;
		case 10:
			mes "[�H�H�H]";
			mes "��1��B��1�񐬌������";
			mes "����܂ł̕������`�����ɂȂ�B";
			mes "����̓`�����X�Ȃ񂾁I";
			mes "�����B���������������I";
			next;
			mes "[�H�H�H]";
			mes "���ށI";
			next;
			mes "�]�������r�؂ꂽ�]";
			close;
		case 11:
			mes "[�H�H�H]";
			mes "���̈̑傳��m��Ȃ����Ȃ���";
			mes "���킢�����ł�!!";
			next;
			mes "[�H�H�H]";
			mes "�c�c";
			close;
		case 12:
			mes "^000099�]�m�C�Y���������Ă���悤���B";
			mes "�@���g���𒲐߂���";
			mes "�@������x���p���Ă݂悤�]^000000";
			close;
		}
	default:
		if(ECL_6QUE >= 18 && ECL_6QUE <= 32) {
			mes "^000099�]�q�G�[���������ɉ��ǂ��Ă���B";
			mes "�@����ɂ����Ȃ��ł������]^000000";
			close;
		}
		mes "^000099�]�F��ȃK���N�^������Ă���B";
		mes "�@�����̍�Ƒ�̂悤���]^000000";
		close;
	}
}

//============================================================
// �G�N���[�W���̈��Y�L�b�Y�N�G�X�g
//- Registry -------------------------------------------------
// ECL_7QUE -> 0�`
//------------------------------------------------------------
ecl_in02.gat,160,36,4	script	�A�C����#nk	441,{
	switch(ECL_7QUE) {
	case 4:
		if(checkquest(4258)) {
			mes "[�A�C����]";
			mes "���H�@�ŋߖ{��ǂ񂾂����āH";
			mes "�{�͑�D������B�����ǂ�ł��B";
			mes "���Ï��ŉɂȂ񂾂���B";
			next;
			mes "[�A�C����]";
			mes "���A���������΍ŋߖ{������؂肽��B";
			mes "�~�b�h�K���c�H�@�~�b�h�J�b�g�H";
			mes "����c�c�~�b�h�K���h�H�@�Y�ꂽ�I";
			mes "���Ȃ��������ꏊ�̖{��B";
			mes "�ʔ��������ȁ[�B";
			mes "�����ǂ��ꂪ�ǂ������́H";
			next;
			mes "[�A�C����]";
			mes "�Z�V���A������";
			mes "�����Ȃ�ǂ������̂��ȁB";
			mes "�����{���D���Ȃ��Ƃ�";
			mes "���łɕ������Ă���͂��Ȃ̂Ɂ[�B";
			mes "�Ƃɂ������̂悤�ɓ`���ĂˁB";
			delquest 4258;
			close;
		}
		mes "[�A�C����]";
		mes "�Z�V���A������";
		mes "�����Ȃ�ǂ������̂��ȁB";
		mes "�����{���D���Ȃ��Ƃ�";
		mes "���łɕ������Ă���͂��Ȃ̂Ɂ[�B";
		next;
		mes "[�A�C����]";
		mes "�����A���̘b����������";
		mes "�܂������ĂˁB";
		mes "�ǂ����Ă���Ȃ��Ƃ𕷂��̂���";
		mes "�����Č��āB";
		close;
	case 5:
	case 6:
		mes "[�A�C����]";
		mes "�Z�V���A�������𒲍����Ă���H";
		mes "�����Ȃ́H�@����H�@����H";
		mes "����ł���ŁH�@����H";
		mes "�܂����ׂĂ�́H�@����H";
		mes "�C�ɂȂ�I�@�������ׂāI";
		close;
	case 7:
		switch(ECL_7QUE1) {
		case 0:
			mes "[�A�C����]";
			mes "���I�@����A����H";
			mes "�������I�@�����������������́I";
			mes "�h�~�j�N�̂�������̂�����";
			mes "�ŋ߂����Ƃ��Ȃ����ɂ������̂ˁI";
			mes "��A�����Ȃ��I";
			next;
			mes "[�A�C����]";
			mes "�悧���B�d�Ԃ����Ă��I";
			mes "�H�ɂ͉H��G�p�ɂ͐G�p����I";
			mes "�ӂ��������ɂ͂ӂ��������ŕԂ��̂�";
			mes "�������̃��[���Ȃ񂾂���B";
			next;
			mes "[�A�C����]";
			mes "�ǂ����悤�B�������炢�����ȁB";
			mes "�h�~�j�N�͖{������Ă���񂾂�ˁB";
			mes "��������{�I���U�炩������";
			mes "�����邩�ȁH";
			next;
			mes "[�A�C����]";
			mes "��[���I�@�������悤�I";
			mes "�킽���̖��@�̗͂�";
			mes "�{�I���U�炩���Ă��I";
			next;
			mes "[�A�C����]";
			mes "�˂��A���肢�B";
			mes "^FF0000�A���̌s�Ɨ΃n�[�u��1����^000000";
			mes "�����ė��Ă����H";
			mes "�킽���A���@�̏������邩��B";
			next;
			if(select("��`��","�f��") == 2) {
				mes "[�A�C����]";
				mes "���[�I�@�������c�c�B";
				mes "�߂����l���ˁB";
				close;
			}
			mes "[�A�C����]";
			mes "���肪�ƁI";
			mes "1�������ȒP����ˁB";
			mes "���͂����ŏ��������Ă��邩��";
			mes "�������肢�ˁB";
			set ECL_7QUE1,1;
			setquest 4261;
			delquest 72515;
			close;
		case 1:
			if(countitem(511) < 1 || countitem(905) < 1) {
				mes "[�A�C����]";
				mes "�˂��A�܂��`�H";
				mes "�͂��A�҂̔�ꂽ�`�B";
				mes "���������A�}���ł���Ȃ����ȁB";
				mes "��������͂������Ȃ��ƁI";
				mes "^FF0000�A���̌s�Ɨ΃n�[�u1����^000000";
				mes "���������Ă��ā`�B";
				close;
			}
			if(checkitemblank() == 0) {
				mes "[�A�C����]";
				mes "�����Ă��Ă��ꂽ�́H�@���肪�ƁI";
				mes "�ł��c�c";
				mes "�ו��������ς��݂����B";
				mes "�����������ė��āI";
				close;
			}
			mes "[�A�C����]";
			mes "�����Ă��Ă��ꂽ�́H�@���肪�ƁI";
			mes "�������������͊���������B";
			mes "��[�����Ⴀ��邼�[�B";
			mes "�ӂӂ��B������������āc�c";
			mes "�����ɗ΃n�[�u�����܂������āc�c";
			mes "����ł悵���ƁI";
			delitem 511,1;
			delitem 905,1;
			set ECL_7QUE1,2;
			chgquest 4261,4262;
			getitem 6563,1;
			misceffect 305;
			next;
			mes "[�A�C����]";
			mes "����`��I�@�o���オ��`�B";
			mes "�N�ł��g���鏢������I";
			mes "���̖����`";
			next;
			mes "[�A�C����]";
			mes "^ff0000�G���I^000000";
			next;
			mes "[�A�C����]";
			mes "�����Ł[���I";
			next;
			menu "�c�c�G���H",-;
			mes "[�A�C����]";
			mes "��������B�G������I";
			mes "�����������";
			mes "�h�~�j�N���厖�Ɏ���Ă���";
			mes "�{�I�̎��ӂɂ������薄�߂ė��āB";
			next;
			mes "[�A�C����]";
			mes "�����|���ő�ςȂ̂�";
			mes "�}�ɖ{�I�ׂ̗ɑ��������Ă�����c�c";
			mes "�ӂӂӂ��I�@����͂́I";
			mes "��΂��₾��ˁH�@�ˁH";
			next;
			mes "[�A�C����]";
			mes "�����A�����s���Ă��āI";
			mes "�����������͂������Ȃ��ƁI";
			close;
		case 2:
			mes "[�A�C����]";
			mes "�ӂ��Ӂ[�y���݁`�B";
			mes "�����A�����h�~�j�N�̖{�I�ɍs����";
			mes "�������薄�߂ė��āB";
			close;
		case 3:
			mes "[�A�C����]";
			mes "���A�s���Ă��Ă��ꂽ�̂ˁB";
			mes "�˂��˂��A�ǂ��������H";
			mes "�������Ă��H�@����ς肨�����Ă��H";
			next;
			mes "[�A�C����]";
			mes "���`�A�ܑ̂Ȃ��Ȃ�";
			mes "���̏�ʂ𒼐ڌ����������ȁB";
			mes "���x�A����������x����Ă݂悤�B";
			next;
			mes "�]�c�c�c�c";
			mes "�@�܂�Ō��ʂ������������Ƃ�";
			mes "�@����Ȃ��ł������]";
			close;
		}
	case 8:
		mes "[�A�C����]";
		mes "���A�s���Ă��Ă��ꂽ�̂ˁB";
		mes "�˂��˂��A�ǂ��������H";
		mes "�������Ă��H�@����ς肨�����Ă��H";
		next;
		mes "[�A�C����]";
		mes "���`�A�ܑ̂Ȃ��Ȃ�";
		mes "���̏�ʂ𒼐ڌ����������ȁB";
		mes "���x�A����������x����Ă݂悤�B";
		next;
		mes "�]�c�c�c�c";
		mes "�@�܂�Ō��ʂ������������Ƃ�";
		mes "�@����Ȃ��ł������]";
		close;
	default:
		switch(ECL_7QUE1) {
		case 0:
			if(!checkquest(72500))
				setquest 72500;
			mes "[�A�C����]";
			mes "�����A���������c�c";
			mes "���Ȃ����ƂĂ��ɂ��B";
			mes "��B�Ȃ��ɁH";
			mes "���낶�댩�Ȃ��ŁB";
			next;
			mes "[�A�C����]";
			mes "�����c�c";
			mes "�ʂɕς������̂Ȃ��";
			mes "�H�ׂĂ��Ȃ��̂�";
			mes "�ǂ����Ă���Ȃ�";
			mes "���Ȃ����ɂ��Ȃ�񂾂낤�c�c�B";
			next;
			mes "[�A�C����]";
			mes "�Ȃ��ɁA�܂������ɂ���́H";
			mes "���B�������I";
			mes "������Ƃ��肢���Ă��������ȁH";
			next;
			mes "[�A�C����]";
			mes "���̂ˁB���Ȃ��ɗǂ����������";
			mes "��낤�Ƃ����񂾂��ǁA";
			mes "����ɕK�v�ȍޗ����ЂƂ�";
			mes "�q�ɂɂȂ������́c�c�B";
			next;
			mes "[�A�C����]";
			mes "�����ς������Ă���������";
			mes "�܂�����Ǝv�����̂ɁB";
			mes "������ˁA�΃n�[�u��10��";
			mes "�����Ă��Ă���Ȃ��H";
			next;
			if(select("�킩����","�����ǂ����āH") == 2) {
				mes "[�A�C����]";
				mes "���Ⴀ�Ȃ�Řb�����Ă���́B";
				mes "�Ӗ��킩��Ȃ��c�c�B";
				close;
			}
			mes "[�A�C����]";
			mes "������I�@���肪�Ƃ��B";
			mes "^ff0000�΃n�[�u10��^000000�ˁB";
			mes "���c�c���Ȃ����܂��c�c�����B";
			mes "�����c�c��c�c���[�[�I�@�������I";
			mes "�˂��A�G�N���[�W�������̐���";
			mes "�����ς��ɂȂ�O�ɂ��肢�I";
			set ECL_7QUE1,1;
			setquest 4254;
			close;
		case 1:
			mes "[�A�C����]";
			mes "���������A���Ȃ����ɂ���B";
			mes "�ǂ����Ă���ȃ^�C�~���O��";
			mes "�΃n�[�u�̍݌ɂ��Ȃ��́c�c�B";
			mes "��Ύ������Ă������͂��Ȃ̂ɁB";
			mes "�����c�c�����c�c�B";
			next;
			if(select("�n�[�u��n��","���̏������") == 2)
				close;
			if(countitem(511) < 10) {
				mes "[�A�C����]";
				mes "�n�[�u�c�c�B";
				mes "����Ȃ���H�@10����B";
				close;
			}
			mes "[�A�C����]";
			mes "���I�@�΃n�[�u���I";
			mes "�����ė��Ă���Ă��肪�Ƃ��B";
			mes "���Ⴀ�킽����";
			mes "���������Ĉ��ގ��ɂ���ˁB";
			mes "����ł��Ȃ����悭�Ȃ�Ƃ����ȁB";
			next;
			mes "[�A�C����]";
			mes "���������A���򔠂�T���Ă������";
			mes "�킽���Ƃ͊֌W�̂Ȃ�����";
			mes "�������������́B";
			mes "���������ɂ������[�B";
			next;
			delitem 511,10;
			set ECL_7QUE1,2;
			delquest 4254;
			getexp 100000,0;
			getitem 12812,1;
			getitem 12813,1;
			getitem 12814,1;
			getitem 12815,1;
			mes "[�A�C����]";
			mes "���̕ӂłƂ��ޗ���";
			mes "�������Ȃ񂾂��āB";
			mes "�����������݂����B";
			mes "���̖`���Ƃ����͊��ł�����[�B";
			close;
		case 2:
			mes "[�A�C����]";
			mes "�����c�c�������c�c�B";
			mes "��������񂾂ɂ�������炸";
			mes "���Ȃ����܂��ɂ��c�c�C������c�c�B";
			mes "����͒P���Ȓɂ݂ł͂Ȃ��̂��ȁB";
			mes "����������Ƃ��ꂪ�c�c";
			next;
			mes "[�A�C����]";
			mes "���̕a�H";
			emotion 1;
			close;
		}
	}
OnInit:
	waitingroom "�G�N���[�W���̈��Y�L�b�Y",0;
	end;
}

ecl_in03.gat,175,69,4	script	�o���{��#nk	444,{
	switch(ECL_7QUE) {
	case 4:
		if(checkquest(4259)) {
			mes "[�o���{��]";
			mes "���A������ˑR�H�@�{�H";
			mes "�{�͓ǂނ�B�ƂĂ��D�����B";
			mes "���ɊG�̑����{���ǂ��ˁB";
			mes "�ŋ߂̓~�b�h�K���h�Ɋ֘A����{��";
			mes "��ʂɓ����ė�������ǂ�ł�����B";
			next;
			mes "[�o���{��]";
			mes "�����G�N���[�W���ɂ�";
			mes "�~�b�h�K���h���痈��l��";
			mes "����������ˁB";
			next;
			mes "[�o���{��]";
			mes "����[�~�b�h�K���h��";
			mes "�Ȃ��Ȃ��ʔ������ȏꏊ���˂��B";
			mes "������ƏZ��ł݂����͂Ȃ����ǁA";
			mes "�V�тɍs�������Ȃ�����B";
			delquest 4259;
			close;
		}
		mes "[�o���{��]";
		mes "�ŋ߃G�N���[�W���ɂ�";
		mes "�~�b�h�K���h���痈��l��";
		mes "����������ˁB";
		next;
		mes "[�o���{��]";
		mes "����ŋ������䂩�ꂽ���";
		mes "�~�b�h�K���h�֌W�̖{��";
		mes "�������؂�ēǂ񂾂�B";
		mes "�V�����{�ł��o�Ă��Ȃ����ȁB";
		mes "�܂����ɂ����Ă݂邩�[�B";
		close;
	case 5:
	case 6:
		mes "[�o���{��]";
		mes "�ȂɂȂɁH�@���I�@�܂��ŁH";
		mes "�Ƃ������Ƃ́c�c�ǂ��������Ƃ��H";
		mes "�䂪�[�܂��Ă����ˁB";
		close;
	case 7:
		switch(ECL_7QUE2) {
		case 0:
			mes "[�o���{��]";
			mes "�ȁA�Ȃɂ��I�@�h�~�j�N�̎d�ƁH";
			mes "�ƁA�Ƃ������Ƃ͂�͂�";
			mes "�h�~�j�N�ƃ����u���b�c��";
			mes "�����Ƃ������Ƃ��������`�B";
			next;
			menu "�Ⴂ�܂�",-;
			mes "[�o���{��]";
			mes "��A�����Ȃ��ȁI";
			mes "�患���B�����Ȃ����牴���{�C��";
			mes "�o�������Ȃ��悤���ȁB";
			mes "�Ƃ��Ƃ��{�C���o������";
			mes "���Ă��܂����悤���ȁI";
			next;
			mes "[�o���{��]";
			mes "�悧�����B�h�~�j�N�̂��";
			mes "��Ԍ����Ȃ��Ƃ��l���Ă݂悤�c�c�B";
			mes "���̖��̓o���{��";
			mes "���܂�Ȃ���̓V�˃C�^�Y��Boy�B";
			mes "�Ȃ߂�Ȃ�I";
			next;
			mes "[�o���{��]";
			mes "�����c�c�������I�@������������";
			mes "�������đf�����āA�J�T�J�T���Ă���";
			mes "���F���āA�Â��Ƃ���ɐ��ނ��";
			mes "�匙���ƌ����Ă����ȁB";
			mes "�ǂ��l���Č��Ă�����́c�c";
			next;
			mes "[�o���{��]";
			mes "�l�Y�~�c�c����ȁH";
			next;
			menu "�Ⴄ�Ǝv���܂�",-;
			mes "[�o���{��]";
			mes "����A�l�Y�~�����l�����Ȃ���I";
			mes "�l�Y�~�ɂ��悤�B����I";
			mes "�����ăl�Y�~�����ϊ��ł��Ȃ����B";
			mes "�患���B�l�Y�~��p�ӂ���";
			mes "�����̂���ꏊ�ɕ����Ă�낤�B";
			mes "�ӂ��ӂ��ӁA���Ă�����B";
			next;
			mes "[�o���{��]";
			mes "�����ƌ��܂�΃l�Y�~���K�v���ȁB";
			mes "�����ɂ͂��Ȃ��񂾁B����Ă��Ȃ��ƁB";
			mes "���͏������K�v������c�c";
			mes "��`���Ă����l���c�c����ˁA����B";
			next;
			if(select("��`��","�f��") == 2) {
				mes "[�o���{��]";
				mes "�ǂ����Ă��H�@�ق�[���H";
				mes "�N�ɂ͕������Ȃ������H";
				mes "���̐S���h�����̂悤��";
				mes "�h���h���Ɩ苿���Ă���̂��B";
				mes "���ނ�I�@�N���K�v�Ȃ񂾁I";
				close;
			}
			mes "[�o���{��]";
			mes "�������I�@���肪�Ƃ��I";
			mes "�N�ɂ����Ɠ���";
			mes "�C�^�Y���̌�������Ă���񂾂ˁB";
			mes "��������B�f���炵���B";
			next;
			mes "[�o���{��]";
			mes "�悵�I�@�ڂ����b�͂��Ƃ��B";
			mes "^ff0000�˂��݂̐K��^000000��2��";
			mes "�p�ӂ��Ď����Ă��ė~�����B";
			mes "�����A���̕ӂ�ɂ͂��Ȃ�����ȁB";
			mes "�F�X�������ĒT���Ă��Ă���B";
			next;
			mes "[�o���{��]";
			mes "���͂��̊Ԃɐ��_�W�����邩��";
			mes "�p�ӂ��I���܂ł́A";
			mes "���܂�b�������Ȃ��ł����ȁI";
			mes "��낵�����񂾂�I";
			set ECL_7QUE2,1;
			chgquest 72520,4263;
			close;
		case 1:
			if(countitem(1016) < 2) {
				mes "[�o���{��]";
				mes "���������A�����A���������B";
				mes "�C�^�Y���̋C���S�g��";
				mes "�N������ĂƂ܂�Ȃ��I";
				mes "����炭�C�^�Y���G�i�W�[�I�@�t�H�H�I";
				mes "�ӂ��c�c�܂����c�c���͏����̍��B";
				mes "���܂�c�c���̃n�[�g�c�c�B";
				next;
				menu "�c�c",-;
				mes "[�o���{��]";
				mes "����I�@�����̌N�H�@�����Ă�`�B";
				mes "���A�W�����Ă�񂾂�B";
				mes "���H�@�������悩�������āH";
				mes "�͂́B�Ƃ��ȁB������c�c";
				mes "�˂��݂̐K���܂��H";
				mes "2����B�X�������ނ�I";
				close;
			}
			mes "[�o���{��]";
			mes "�����A�҂��Ă�����I";
			mes "�����������傤�Ǐ�����";
			mes "���ׂďI������񂾁I";
			mes "�����A�����K��������B";
			next;
			mes "[�o���{��]";
			mes "�����A���Ⴀ�n�߂悤�B";
			mes "�c�c�u�c�u�c�c�c";
			next;
			mes "[�o���{��]";
			mes "�S�m�S�\�̏����ȐK����c�c";
			mes "���O�̏I���͑s��Őj���Ȃ��";
			mes "�˂��݂Ƃ��Ă̐���S�������͂���";
			mes "�_��I�ȗ͂����̂��̉E���Ɍ��サ";
			mes "����Ƃ����鐶���̗͂��h����";
			next;
			mes "�]�ǂ��킩��Ȃ������������Ă���]";
			next;
			mes "[�o���{��]";
			mes "^ff0000�ŏI�I�Ƀz�C�I^000000";
			misceffect 12;
			next;
			if(checkitemblank() == 0) {
				mes "[�o���{��]";
				mes "�悧�����A���Ă���H";
				mes "�ו��������ς�����N�I";
				mes "�䖳������I�@���ނ�I";
				mes "�ו��𐮗����Ă��痈�Ă���B";
				close;
			}
			delitem 1016,2;
			set ECL_7QUE2,2;
			chgquest 4263,4264;
			getitem 6562,1;
			misceffect 21;
			mes "[�o���{��]";
			mes "�悵�A�ł����B�S���ł������B";
			mes "�ꕔ�������ԈႦ�ĂЂ���Ƃ�����";
			mes "�ŏI�I�ɂ��܂���������B";
			next;
			mes "[�o���{��]";
			mes "�����A������N�ɓn����B";
			mes "������h�~�j�N�ׂ̗ɓ������";
			mes "�˂��݂ɉ�����";
			mes "��̎���𑖂邾�낤�B";
			mes "����ŃC�^�Y���͊��E���I";
			mes "�����A�s�����s�����I";
			next;
			menu "�����H",-;
			mes "[�o���{��]";
			mes "�����������[���A���ނ�`�I";
			mes "���͍��̂���ڂ���H";
			mes "������̂͌N�̖�ڂ��낤�H";
			mes "�ǂ������񂾋}�ɁI";
			next;
			mes "[�o���{��]";
			mes "�ӂӁB���[�y���݂��ȂƂĂ��I";
			mes "�����Ă���񂾂��H";
			mes "�������I�@���ނ�I";
			mes "�^�C���C�Y�[�j�[����I";
			next;
			mes "�]�o���{�����疳����肢�������";
			mes "�@��`���𗊂܂ꂽ�B";
			mes "�@�h�~�j�N�̌��֍s���Ă݂悤�]";
			close;
		case 2:
			mes "[�o���{��]";
			mes "�����A���������������";
			mes "�h�~�j�N�ɓ������Ă��Ă���B";
			mes "������Ƃ˂��݂ɉ�����";
			mes "�z�̎��ӂ𑖂�܂��͂������B";
			next;
			mes "[�o���{��]";
			mes "�ӂӂӁc�c";
			mes "�y���݂���[�I";
			mes "�����Ă�́H�@�����I�@���΂₭�I";
			close;
		case 3:
			mes "[�o���{��]";
			mes "�����A�s���Ă����H�@�ǂ��������H";
			mes "���܂��˂��݂͕ϐg�������H";
			mes "����[�h�~�j�N�Q�Ă����낤�Ȃ��B";
			mes "���[�͂��́B";
			next;
			mes "[�o���{��]";
			mes "��������o�Ȃ������ł���B";
			mes "�匙�����Č����Ă�����ˁI";
			mes "�����ʂ��Ȃ񂾂�!!�@�͂͂��I";
			next;
			mes "[�o���{��]";
			mes "�C�^�Y���Ȃ炱�������ゾ�Ƃ�������";
			mes "��������킩�点�Ȃ��ƂˁB";
			mes "���[�������肵���B";
			mes "���������I�@���肪�ƂȁI";
			next;
			mes "�]���ʂ������������Ƃ�";
			mes "�@����Ȃ��ł������c�c�]";
			close;
		}
	case 8:
		mes "[�o���{��]";
		mes "�����A�s���Ă����H�@�ǂ��������H";
		mes "���܂��˂��݂͕ϐg�������H";
		mes "����[�h�~�j�N�Q�Ă����낤�Ȃ��B";
		mes "���[�͂��́B";
		next;
		mes "[�o���{��]";
		mes "��������o�Ȃ������ł���B";
		mes "�匙�����Č����Ă�����ˁI";
		mes "�����ʂ��Ȃ񂾂�!!�@�͂͂��I";
		next;
		mes "[�o���{��]";
		mes "�C�^�Y���Ȃ炱�������ゾ�Ƃ�������";
		mes "��������킩�点�Ȃ��ƂˁB";
		mes "���[�������肵���B";
		mes "���������I�@���肪�ƂȁI";
		next;
		mes "�]���ʂ������������Ƃ�";
		mes "�@����Ȃ��ł������c�c�]";
		close;
	default:
		switch(ECL_7QUE2) {
		case 0:
			if(!checkquest(72500))
				setquest 72500;
			mes "[�o���{��]";
			mes "�����������ȁ[�B";
			next;
			menu "�ǂ����܂����H",-;
			mes "[�o���{��]";
			mes "����A�Ȃ񂩂�";
			mes "�ŋ߂Ȃ����킩��Ȃ�����";
			mes "�����悭�����Ȃ�񂾂�c�c�B";
			mes "�|�P�b�g�ɂ���������";
			mes "�����Ɛ������Ēu���������B";
			next;
			mes "[�o���{��]";
			mes "�����I�@������c�c�B";
			mes "�������������I";
			mes "�͂��͂��B";
			mes "�������[�������[�B";
			mes "�����������ˁB";
			next;
			menu "�Ȃ�ł���",-;
			mes "[�o���{��]";
			mes "����͂����ƊO�ɂ���";
			mes "�C�^�Y����D���Ȃ���";
			mes "�d�Ƃ���B";
			mes "�����O�ɏo�����ɂ����炪";
			mes "���̕��������Ă������B";
			mes "�����ɈႢ�Ȃ��I";
			next;
			mes "[�o���{��]";
			mes "�������[������߁B";
			mes "���炵�߂Ă�肽������";
			mes "�d���������Ȃ��B";
			next;
			mes "[�o���{��]";
			mes "������ƌN���A�����񂾂��ǂ�";
			mes "���̂�����";
			mes "�O�ɂ��邠�����";
			mes "���炵�߂Ă���Ȃ��H";
			next;
			if(select("�����ǂ����āH","��`��") == 1) {
				mes "[�o���{��]";
				mes "���[��A�܂�����Ⴛ�����B";
				mes "���ɉɂȐl��T���Ă݂邩�c�c�B";
				close;
			}
			mes "[�o���{��]";
			mes "�����A�{���H�@���肪�Ƃ��B";
			mes "���႟���肢�����B";
			mes "�O�ɏo�ă����u���b�c��20�C";
			mes "������Ă��Ă���B";
			mes "��������Γz�������邾�낤�B";
			next;
			menu "�{���ɂ�����̎d�ƂȂ�ł����H",-;
			mes "[�o���{��]";
			mes "���H�@�{���ɂ����炩���āH";
			mes "�ԈႢ�Ȃ���I�@�����B";
			mes "���̊��͂��܂ɂ�����񂾁B";
			next;
			mes "[�o���{��]";
			mes "�����u���b�c�͊O�ɏo���";
			mes "�����Ɍ�����Ǝv������";
			mes "��낵�����񂾂�`�I";
			set ECL_7QUE2,1;
			setquest 4255;
			close;
		case 1:
			if(checkquest(4255) & 0x4) {
				mes "[�o���{��]";
				mes "�����A���炵�߂Ă��Ă��ꂽ���B";
				mes "��[���悵�I�@���肪�Ƃ��I";
				mes "����[����������B";
				mes "�c�c�ƌ���������������";
				next;
				mes "[�o���{��]";
				mes "���͉������ĂȂ��񂾂�ˁB";
				mes "�N�������u���b�c��";
				mes "�|���ɍs���Ă���Ԃɂ�";
				mes "�����ǂ��g���Ă����y����";
				mes "�����Ȃ���������񂾁c�c�B";
				next;
				menu "����ς�Ⴄ�l���Ɛl�������̂ł�",-;
				mes "[�o���{��]";
				mes "����͂���������Ɓc�c";
				mes "�Ɛl�́c�c";
				mes "��������H";
				next;
				menu "����A�����Ɛl���Ⴄ�����ł́c�c",-;
				mes "[�o���{��]";
				mes "�Ղ��́[�I�@����I";
				mes "�������ɕ����l����͓���I";
				mes "�Ɛl���肪����ł�ȁ[�������B";
				mes "�@";
				mes "�����Ƃ������B��������Ȃ��ƂȁB";
				next;
				mes "[�o���{��]";
				mes "�悵�A����������悤�B";
				mes "�g���Ă���I";
				delquest 4255;
				getexp 100000,0;
				getitem 6081,2;
				set ECL_7QUE2,2;
				set ECL_7QUE3,3;
				chgquest 72500,72505;
				next;
				mes "�]3�l�̔Y�݂����������B";
				mes "�@�Z�V���A�̂Ƃ���֍s�����]";
				close;
			}
			mes "[�o���{��]";
			mes "�����u���b�c��20�C�A";
			mes "������Ă��ĂˁI";
			mes "�����u���b�c�͊O�ɏo���";
			mes "�����Ɍ�����Ǝv������";
			mes "��낵�����񂾂�`�I";
			close;
		case 2:
			mes "[�o���{��]";
			mes "���������ȁc�c�B";
			mes "��͂�Ɛl�́c�c��������H";
			mes "�����u���b�c�𒦂炵�߂Ă���Ԃɂ��A";
			mes "�����ǂ��g���Ă����y����";
			mes "�����Ȃ��Ă��܂����B";
			mes "����c�c���̖��͓���B";
			close;
		}
	}
OnInit:
	waitingroom "�G�N���[�W���̈��Y�L�b�Y",0;
	end;
}

ecl_in01.gat,26,88,5	script	�Z�V���A#nk	440,{
	switch(ECL_7QUE) {
	case 0:
		if(!checkquest(72500))
			setquest 72500;
		mes "[�Z�V���A]";
		mes "���[��c�c�ǂ����悤������B";
		next;
		mes "[�Z�V���A]";
		mes "���x����ׂĂ݂Ă�";
		mes "��͂�A��������Ȃ���B";
		mes "�������A������Ƃ���������Ȃ��B";
		mes "�ŋ߁A������K�����̂�";
		mes "�����Ă���ƕ�������A";
		mes "������̎d�ƂȂ̂��c�c�B";
		next;
		emotion 0;
		mes "[�Z�V���A]";
		mes "��H�@����I";
		mes "������Ɓ`�A������Ƃ����I";
		mes "�����̂��Ȃ��I�@���Ȃ���B";
		mes "���𓐂ݕ������Ă���́H";
		mes "�����b��������";
		mes "�S�������Ă����ł��傤�H";
		next;
		switch(select("�͂�","������")) {
		case 1:
			mes "[�Z�V���A]";
			mes "�f���ł�낵����B";
			break;
		case 2:
			mes "[�Z�V���A]";
			mes "�R�����񂶂�Ȃ��I";
			break;
		}
		next;
		mes "[�Z�V���A]";
		mes "���͂ˁA�����Ǘ����Ă����⋋�i��";
		mes "������Ƃ��Ȃ��Ȃ��Ă���̂�B";
		mes "���܂ł���Ȃ��Ƃ͖��������̂ɁB";
		mes "�ǂ��l���Ă�";
		mes "����͊O�����痈���l�̎d�Ƃ��B";
		mes "�����v��Ȃ��H";
		next;
		mes "[�Z�V���A]";
		mes "����A����łˁB";
		mes "�܂��Ɛl���N���͂����̂�B";
		mes "����Ȏ��͏d�v�ł͂Ȃ��́B";
		next;
		menu "�Ȃ�ق�",-;
		mes "[�Z�V���A]";
		mes "�⋋�i�������Ȃ����Ƃ���������";
		mes "�N���m���Ă��邩�A�Ƃ������Ȃ̂�B";
		mes "�Ӗ��킩��H�@���ƔƐl��";
		mes "���Ȃ��B�����A���Ȃ�����ˁB";
		next;
		mes "[�Z�V���A]";
		mes "������A���Ȃ����D�_�ł��I";
		mes "���������������ɂȂ�܂��B";
		mes "�D�_�Ƃ��ĔF��I";
		mes "�͂��D�_�I�@���̓D�_��낤�I";
		next;
		mes "[�Z�V���A]";
		mes "�ǂ�ڂ���������!!";
		emotion 26;
		misceffect 458,"";
		next;
		menu "���H",-;
		mes "[�Z�V���A]";
		mes "���Ȃ��͓D�_�Ȃ̂Ŕƍߎ҂ł��B";
		mes "���Ȃ��͖@��㗝�l�𗧂Ă邱�Ƃ��ł�";
		mes "���Ȃ��ɂ͖ٔ錠������܂��B";
		mes "�܂��A���Ȃ��́c�c";
		next;
		mes "[�Z�V���A]";
		mes "��c�c�܂��A�ׂ������͂������B";
		mes "�����p�ꂪ�o�Ă��܂��̂�B";
		mes "���߂�Ȃ����ˁB";
		next;
		mes "[�Z�V���A]";
		mes "�����A�����炠�Ȃ��D�_�ł�����";
		mes "���A�ǂ�Ȃ��C�����H";
		next;
		switch(select("�����Ȃ�ǂ�������ł����H","�c�c")) {
		case 1:
			mes "[�Z�V���A]";
			mes "�l���͒����ł��傤�B";
			mes "������ˑR�A�g�Ɋo���̂Ȃ�";
			mes "�Г�ɂ݂܂�ꂽ�肷����̂ł��B";
			mes "���Ȃ��ɂƂ��Ă�";
			mes "���������̓��̂悤�ˁB";
			next;
			mes "[�Z�V���A]";
			mes "�����A�Ō�̃`�����X����I";
			mes "�����S����Ȃ��B";
			mes "���݂����K���ɂȂ邢�����@��";
			mes "�l���Ă���̂�B";
			mes "�ǂ��A��x�����Ă݂�H";
			break;
		case 2:
			mes "[�Z�V���A]";
			mes "�ق��A�����ٔ錠���Ă�B";
			mes "�f�l���Ⴀ�Ȃ���ˁB";
			mes "�����A�c�O�����ǎ����v���Ȃ́B";
			mes "���݂����K���ɂȂ邢�����@��";
			mes "�p�ӂ��Ă���킯�B";
			mes "�ǂ��A������ƕ����Ă݂�H";
			break;
		}
		next;
		if(select("���₾�I","�킩����") == 1) {
			mes "[�Z�V���A]";
			mes "�Ȃ�A���傤���Ȃ��B";
			mes "���Ȃ���Ɛl�Ɏd���ďグ��";
			mes "���͖������Ă������Ƃɂ����I";
			mes "�d�����Ȃ߂��Ⴂ���Ȃ����B";
			mes "�؋��Ȃ�č��΂������B";
			next;
			mes "[�Z�V���A]";
			mes "�����A�؋��͂��������B";
			mes "3�l���炢�d���������";
			mes "�C�O�h���V���ł�����񂾂�B";
			mes "�ϔO���鎖���ˁI";
			next;
			mes "�]�ˑR�d���ɓD�_�������ꂽ�B";
			mes "�@�ЂƂ܂����̏�𗣂�悤�]";
			close2;
			warp "eclage.gat",296,306;
			end;
		}
		mes "[�Z�V���A]";
		mes "�f���炵�����f�ˁB";
		mes "�b�͋ɂ߂ăV���v����B";
		mes "����́c�c";
		next;
		mes "[�Z�V���A]";
		mes "�����Ȃ����⋋�i��";
		mes "���Ȃ����W�߂Ă���Ƃ������B";
		mes "���͑q�ɂ�����Ă��邩��";
		mes "����ɓ������Ƃ��ł��Ȃ����B";
		next;
		mes "[�Z�V���A]";
		mes "�ǂ�������H";
		mes "�D�_�̔G��߂����Ԃ����";
		mes "�����񂶂�Ȃ��Ǝv�����ǁH";
		next;
		menu "���������i���W�߂�΂����̂ł���",-;
		mes "[�Z�V���A]";
		mes "���������A�����ȁc�c�Ⴄ���I";
		mes "�Ȃ����ĂȂ����B���܂ꂽ�́I";
		mes "�������D�_�͂��Ȃ��Ȃ�ł����ǁB";
		mes "���������܂����ł���H";
		mes "���͂��Ȃ��̔G��߂𐰂炻����";
		mes "�e�؂Ō����Ă�̂�B��́c�c";
		next;
		menu "�i���������Ă�������",-;
		mes "[�Z�V���A]";
		mes "�����c�c�����Ɓc�c�K�v�ȕi���́A";
		mes "^FF0000��ʂ̂ǂ񂮂�10��";
		mes "�Â��{�̃y�[�W10��";
		mes "�Ō�ɃJ�r�̕�10��^000000";
		mes "3��ށA10����B";
		set ECL_7QUE,1;
		setquest 4256;
		next;
		mes "[�Z�V���A]";
		mes "���āA����Ŏ��Ƃ��Ȃ���";
		mes "�����D�ɏ�����悤�Ȃ��̂ˁB";
		mes "�������p��Ły���Ɓz���Ă����́B";
		next;
		mes "[�Z�V���A]";
		mes "������Ɠ������������H";
		mes "�ӂӁB���ł��m���Ă�̂掄�́B";
		next;
		mes "[�Z�V���A]";
		mes "�����I�@�C��t���čs���ė��āB";
		mes "3�Ƃ����̕ӂœ���ł���͂���B";
		close;
	case 1:
		mes "[�Z�V���A]";
		mes "���[���I";
		mes "�N���Ɍ����ĂȂ��H";
		mes "�ł́A�����ė��������݂��āB";
		next;
		if(countitem(6558) < 10 || countitem(1097) < 10 || countitem(7001) < 10) {
			mes "[�Z�V���A]";
			mes "�Ӂ[�悩�����B����Œ��K��";
			mes "����Ȃ��c�c����Ȃ��c�c�B";
			mes "����ĂȂ����I�@���̓D�_��낤�I";
			next;
			mes "[�Z�V���A]";
			mes "�K�v�ȕi���́A";
			mes "^FF0000��ʂ̂ǂ񂮂�10��";
			mes "�Â��{�̃y�[�W10��";
			mes "�Ō�ɃJ�r�̕�10��^000000��B";
			mes "2�x�ƊԈႦ�Ȃ��ŁB�}���ŁI";
			close;
		}
		mes "[�Z�V���A]";
		mes "�Ӂ[�悩�����B����Œ��K��������B";
		mes "�v�������D�G�Ȃ̂ˁB";
		mes "�����Ŏ������Ȃ�������������B";
		next;
		mes "[�Z�V���A]";
		mes "�܂��A���Ƃ�������";
		mes "����͌���Ȃ��Ă��������ˁB";
		next;
		mes "[�Z�V���A]";
		mes "���肪�Ƃ��B";
		next;
		mes "[�Z�V���A]";
		mes "���͂܂������Ȃ��������Ȃ���";
		mes "�m�F�����Ă݂��B";
		next;
		mes "[�Z�V���A]";
		mes "���傤��10�����������";
		mes "�D�_�ɂ��떳�������ɂ���";
		mes "������Ƃ����������B";
		mes "������������܂���`���āB";
		delitem 6558,10;
		delitem 1097,10;
		delitem 7001,10;
		set ECL_7QUE,2;
		delquest 4256;
		getexp 300000,0;
		next;
		mes "[�Z�V���A]";
		mes "���������΁c�c";
		mes "�A�C�����ƃo���{����";
		mes "�ŋߍ��������Ƃ��������";
		mes "�����Ă�����ˁB";
		mes "�悩������b�𕷂��Ă����āB";
		close;
	case 2:
		mes "[�Z�V���A]";
		mes "���������ȁc�c";
		mes "�������萮�����Ă������̂ɁA";
		mes "�Ȃ��A�U�炩���Ă���́B";
		mes "���������Ď��A";
		mes "�N���Ɍ����Ă���̂��ȁB";
		mes "���i�̍s���͂������ǂ��̂Ɂc�c�B";
		emotion 4,"";
		next;
		mes "[�Z�V���A]";
		mes "����B�ǂ������̓D�_����B";
		mes "�A�C�����ƃo���{���̏��ɂ�";
		mes "�s���Ă݂�������H";
		mes "�悩������b�𕷂��Ă����āB";
		close;
	case 3:
		mes "[�Z�V���A]";
		mes "����A���Ȃ��B";
		mes "�A�C�����ƃo���{����2�l��";
		mes "����Ă��ꂽ�炵������Ȃ��B";
		next;
		mes "[�Z�V���A]";
		mes "�A�C�����͂�����ɂ߂Ă��������A";
		mes "�o���{���͏����i���Ȃ��Ȃ���";
		mes "�����Ă�������";
		mes "�ǂ���������Ă��ꂽ�ƕ��������ǁB";
		next;
		mes "[�Z�V���A]";
		mes "����ɂ��Ă����������đ�����";
		mes "���ׂȃg���u�����N����Ȃ�āc�c";
		next;
		mes "�]�������l������ł���Z�V���A�]";
		next;
		mes "[�Z�V���A]";
		mes "���������c�c";
		mes "�����͖������ǁc�c";
		mes "�Ȃɂ����������B";
		next;
		mes "[�Z�V���A]";
		mes "�ȑO�Ȃ��������Ƃ��N����̂�";
		mes "�V��������������͂�����B";
		next;
		mes "[�Z�V���A]";
		mes "�������ʍ��c�c���������ȁB";
		mes "���Ȃ����l���Ă���Ȃ��H";
		mes "�~�b�h�K���h���痈���̂�ˁB";
		mes "�������̒m���Łc�c��H";
		next;
		mes "[�Z�V���A]";
		mes "�~�b�h�K���h�I�@�������I";
		mes "�{�I�@�ŋߖ{���؂肽��B";
		next;
		mes "[�Z�V���A]";
		mes "����2�l���m���{���D����������";
		mes "����͍l�������I";
		mes "������Ƃ��Ȃ��B";
		mes "���肢�I";
		next;
		mes "[�Z�V���A]";
		mes "�A�C�����ƃo���{���ɉ����";
		mes "�ŋ߁A�~�b�h�K���h�֌W�̖{��";
		mes "�؂肽��ǂ񂾂肵�Ă��Ȃ���";
		mes "�����ė��Ă݂āB";
		set ECL_7QUE,4;
		set ECL_7QUE1,0;
		set ECL_7QUE2,0;
		delquest 72505;
		setquest 4257;
		setquest 4258;
		setquest 4259;
		close;
	case 4:
		if(checkquest(4258) || checkquest(4259)) {
			mes "[�Z�V���A]";
			mes "�A�C�����ƃo���{���ɉ����";
			mes "�ŋ߁A�~�b�h�K���h�֌W�̖{��";
			mes "�؂肽��ǂ񂾂肵�Ă��Ȃ���";
			mes "�����ė��Ă݂āB";
			close;
		}
		mes "�]�A�C�����A�o���{���Ƙb�������e��";
		mes "�@�Z�V���A�ɓ`�����]";
		next;
		mes "[�Z�V���A]";
		mes "����ς�I";
		next;
		mes "[�Z�V���A]";
		mes "����2�l���{���؂�ēǂ�ł����̂ˁB";
		mes "�K��҂�����������A";
		mes "�����~�b�h�K���h�̎����m�肽���āA";
		mes "�����Ȃ����{���؂肽�́B";
		next;
		mes "[�Z�V���A]";
		mes "�A�C�����A�o���{���Ǝ���";
		mes "�ŋ߁A�{��ǂ񂾂Ƃ���";
		mes "���ʓ_�������Ă���B";
		mes "�Ƃ������Ƃ́c�c";
		next;
		mes "[�Z�V���A]";
		mes "����ς�{�I���Ǘ����Ă���";
		mes "�h�~�j�N���������I";
		mes "������m���Ă��邩�A�������́c�c�B";
		mes "������ƃh�~�j�N�̏��ɍs����";
		mes "�b�𕷂��Ă��āI";
		set ECL_7QUE,5;
		chgquest 4257,72510;
		getexp 50000,0;
		close;
	case 5:
		mes "[�Z�V���A]";
		mes "�A�C�����A�o���{���Ǝ���";
		mes "�ŋ߁A�{��ǂ񂾂Ƃ���";
		mes "���ʓ_�������Ă���B";
		mes "�Ƃ������Ƃ́c�c";
		next;
		mes "[�Z�V���A]";
		mes "����ς�{�I���Ǘ����Ă���";
		mes "�h�~�j�N���������I";
		mes "������m���Ă��邩�A�������́c�c�B";
		close;
	case 6:
		mes "[�Z�V���A]";
		mes "���A�h�~�j�N�̏���";
		mes "�s���ė��Ă��ꂽ�́H";
		mes "�ǂ��l���Ă��{�I���Ǘ����Ă���";
		mes "�������������Ǝv���񂾂��ǁc�c";
		next;
		menu "�h�~�j�N�̘b��`����",-;
		mes "[�Z�V���A]";
		mes "�c�c";
		next;
		mes "[�Z�V���A]";
		mes "����ς肻���B";
		mes "�����̎d�Ƃ������̂ˁB";
		mes "�h�~�j�N�̓z�A�ȑO����";
		mes "�������Ȃ��Ǝv���Ă����̂�B";
		next;
		mes "[�Z�V���A]";
		mes "������Ȃ��ŁB";
		mes "�G�N���[�W���̏Z���̑唼�́A";
		mes "����A�قڑS�Ă̏Z����";
		mes "�O������̐l�����ʂ�����͂��Ȃ���B";
		next;
		menu "�D�_��������܂����c�c",-;
		mes "[�Z�V���A]";
		mes "�����c�c";
		mes "����Ȃ��Ƃ��������́B";
		next;
		mes "[�Z�V���A]";
		mes "������ƍ��厖�Șb�����Ă邩��";
		mes "�ق��ĂāI";
		emotion 23,"";
		next;
		mes "[�Z�V���A]";
		mes "�����H";
		mes "�݂�ȗǂ��l�����΂���Ȃ̂�B";
		mes "�h�~�j�N�̂�����ʂ�";
		mes "�������������Ȃ́B";
		mes "�ςȕΌ��͎����Ȃ��ŁB���肢�B";
		next;
		mes "[�Z�V���A]";
		mes "����͂����Ɓc�c";
		mes "�����������������������Ă���Ȃ�";
		mes "���������������l����K�v�������ˁB";
		next;
		mes "[�Z�V���A]";
		mes "�����v�悵�Ă݂悤���ȁB";
		mes "�A�C�����ƃo���{���ɂ�";
		mes "������A�����Ă�����B";
		mes "2�l�̏��Ɉ�x�s���Ă݂āB";
		set ECL_7QUE,7;
		delquest 4260;
		setquest 72515;
		setquest 72520;
		getexp 100000,0;
		close;
	case 7:
		if(ECL_7QUE1 < 3 || ECL_7QUE2 < 3) {
			mes "[�Z�V���A]";
			mes "�����������������������Ă���Ȃ�";
			mes "���������������l����K�v�������ˁB";
			next;
			mes "[�Z�V���A]";
			mes "�A�C�����ƃo���{���̌v���";
			mes "�i��ł��邩����H";
			mes "�����A�܂�2�l�ɕ����ĂȂ��Ȃ�";
			mes "��x�s���Ă݂āB";
			close;
		}
		mes "[�Z�V���A]";
		mes "���Ȃ��ɂ͐F�X�����Ă��������ˁB";
		mes "������������Ȃ��Ɓc�c�B";
		mes "�������I�@����܂ł̂����";
		mes "���ɂ̖{���{���\�ɂ��Ă�����B";
		next;
		menu "�{�H",-;
		mes "[�Z�V���A]";
		mes "������B�������ځA";
		mes "��w���ɋ����Ƃ��Ă�����B";
		mes "�h�~�j�N���Ǘ����鏑�ɂ̖{��";
		mes "�D���Ȃ������鎖���o������B";
		mes "�ǂ��B�������ł���H";
		next;
		if(select("������","�������Ȃ�") == 2) {
			mes "[�Z�V���A]";
			mes "�����H�@���������ĕ|���H";
			next;
		}
		mes "[�Z�V���A]";
		mes "�ӂӁB�����̂打�����Ȃ��ŁI";
		mes "���A���ɂŐl�C�������̂́A";
		mes "���Ȃ����Z��ł���ꏊ�A";
		mes "�~�b�h�K���h�Ɋւ���{��B";
		next;
		mes "[�Z�V���A]";
		mes "�ǂ�ł݂�Ɩʔ����Ǝv����B";
		mes "�������ς��ƕ]�����ς�邩��B";
		mes "�����������Ă��鎋����";
		mes "�~�b�h�K���h��T�K���Ă݂āB";
		next;
		if(checkitemblank() == 0) {
			mes "[�Z�V���A]";
			mes "��������悤�Ǝv��������";
			mes "�ו��������ς��ˁB";
			mes "�����������Ă��痈�Ȃ����B";
			close;
		}
		mes "[�Z�V���A]";
		mes "����ƁA������������B";
		mes "�������ł���H";
		set ECL_7QUE,8;
		set ECL_7QUE1,0;
		set ECL_7QUE2,0;
		delquest 72525;
		//setquest 4265;
		//compquest 4265;
		setquest 201600;
		getitem 6081,20;
		close;
	case 8:
		mes "[�Z�V���A]";
		mes "���ꂩ��͍L��̖{�I�ɂ���";
		mes "�{���D���Ȃ����������B";
		mes "�y�������Ԃ��G�N���[�W����";
		mes "�߂�����Ǝv���B";
		next;
		mes "[�Z�V���A]";
		mes "�Ȃ񂾂��A���b�ɂȂ����������ˁB";
		mes "�F�X�Ɓc�c�{���ɂ��肪�Ƃ��B";
		mes "���̂ˁc�c�B";
		next;
		mes "[�Z�V���A]";
		mes "���c�c���߂Ă��Ȃ��ɉ�����Ƃ�";
		mes "���́c�c���Ȃ����A";
		mes "�D�_��΂�肵�Ă��܂������ǁc�c";
		mes "�����c�c";
		next;
		emotion 21;
		mes "[�Z�V���A]";
		mes "�������A�����I���������Ǝv���B";
		mes "�����ŐF�X�����Ă��炦�����B";
		next;
		emotion 9,"";
		menu "�c�c�c",-;
		mes "[�Z�V���A]";
		mes "�������A�����Ċ�����ˁB";
		mes "���肪�Ƃ��D�_����I";
		mes "���Ɓc�c���߂�ˁB";
		next;
		mes "[�Z�V���A]";
		mes "���Ă��ƁI";
		mes "���ꂶ�Ⴀ���͎d�������邩��";
		mes "����ȏ�b�������Ȃ��łˁI";
		close;
	}
OnInit:
	waitingroom "�G�N���[�W���̈��Y�L�b�Y",0;
	end;
}

ecl_in01.gat,80,77,5	script	�h�~�j�N#nk	445,3,3,{
	switch(ECL_7QUE) {
	case 5:
		mes "[�h�~�j�N]";
		mes "��B���̗p�ł��H";
		mes "�G�N���[�W����������̂� ";
		mes "�~�߂���͂��܂��񂪁A";
		mes "���̎ז��͂��Ȃ��ł��������܂����B";
		next;
		menu "�Z�V���A���畷�����b������",-;
		mes "[�h�~�j�N]";
		mes "��������H�@�����B";
		mes "�������B�C�Â��܂������B";
		mes "�Ȃ��Ȃ���邶��Ȃ��ł����B";
		mes "�΂�Ă��܂����Ⴀ���傤���Ȃ��B";
		next;
		mes "[�h�~�j�N]";
		mes "�m���ɁA�����G�N���[�W���̏Z����";
		mes "���m��ʎ҂ɑ΂��ĕΌ��������܂���B";
		mes "�����ƌ�����ł��傤�B";
		mes "�������ł��B";
		mes "�������Ă����Ӓn�̈�������";
		mes "���Ă���킯�ł͂���܂���B";
		next;
		mes "[�h�~�j�N]";
		mes "�������I";
		mes "����͘b���ʂł��B";
		next;
		mes "[�h�~�j�N]";
		mes "���͂ˁB�~�b�h�K���h�̘b��";
		mes "�����G�N���[�W���Řb��ɂȂ�̂�";
		mes "�ƂĂ����Ȃ�ł��B�s���Ȃ�ł���B";
		mes "�킩��܂����H";
		next;
		mes "[�h�~�j�N]";
		mes "�G�N���[�W���͂ƂĂ����a�ł��B";
		mes "���X���s���R�Ȃ���炵�Ă��܂��B";
		next;
		mes "[�h�~�j�N]";
		mes "�ɂ��ւ�炸�A����";
		mes "�����炱���Ȃ̂�������܂���ˁB";
		mes "�G�N���[�W���̏Z���͊F�A";
		mes "�ٍ��̒n�ɋ����������͂��߂Ă���B";
		next;
		mes "[�h�~�j�N]";
		mes "�ܘ_�A�ŏ��̂����͂����ł��傤�B";
		mes "�������Ă��Ȃ����K��Ă���悤��";
		mes "�𗬂����X�ɐi��ł����킯�ł��B";
		mes "����Ƃǂ��Ȃ�܂����B";
		next;
		mes "[�h�~�j�N]";
		mes "�ǂ����΂���ł͂Ȃ��ł��傤�B";
		mes "�K���A�ǂ�����";
		mes "���������Ȃ�������";
		mes "�����̎�͐��܂��ł��傤�B";
		next;
		mes "[�h�~�j�N]";
		mes "�����玄�͂���Ȏ��ɂȂ�O��";
		mes "�G�N���[�W���̏Z���̋�����";
		mes "���Ɉڂ������ƍl������ł���B";
		next;
		mes "[�h�~�j�N]";
		mes "���������킯��";
		mes "�~�b�h�K���h�֘A�̖{���؂��l��";
		mes "���������������ł��B";
		mes "���ꂽ�{�Ȃ�Ă����\���L�܂��";
		mes "�听����������ł����ǂˁB";
		next;
		mes "[�h�~�j�N]";
		mes "�܂��A�ǂ����B";
		mes "�b���Ȃ�b���Ă��������B";
		mes "�ЂƂ��|������܂���B";
		mes "���͎��̐M���铹����ނ����ł��B";
		next;
		mes "�]�ŋߋN���Ă������g���u����";
		mes "�@�h�~�j�N�̎d�Ƃ������悤���B";
		mes "�@�Z�V���A�ɘb��`���ɍs�����]";
		set ECL_7QUE,6;
		chgquest 72510,4260;
		close;
	case 6:
		mes "[�h�~�j�N]";
		mes "�ǂ����B";
		mes "�b���Ȃ�b���Ă��������B";
		mes "���͎��̐M���铹����ނ����ł��B";
		close;
	case 7:
	case 8:
		mes "[�h�~�j�N]";
		mes "�ӂށB����������������ȁB";
		close;
	default:
		mes "[�h�~�j�N]";
		mes "��B���̗p�ł��H";
		mes "�G�N���[�W����������̂� ";
		mes "�~�߂���͂��܂��񂪁A";
		mes "���̎ז��͂��Ȃ��ł��������܂����B";
		close;
	}
OnTouch:
	if(ECL_7QUE == 7 && ECL_7QUE2 == 2) {
		mes "�]�h�~�j�N�̂��΂܂ŗ����B";
		mes "�@���̕ӂȂ�C�Â���Ȃ����낤�B";
		mes "�@�˂��݂̐K���𓊂��܂����H�]";
		next;
		if(select("�����Ȃ�","������") == 1)
			close;
		mes "�]�˂��݂̐K���𓊂����B";
		mes "�@�{�����b�I";
		mes "�@�������u�ԁA�K���͂˂��݂ɉ������]";
		delitem 6562,1;
		set ECL_7QUE2,3;
		chgquest 4264,72525;
		initnpctimer;
		monster "ecl_in01.gat",80,77,"�˂���",1175,1,"�h�~�j�N#nk::OnKilled";
		getexp 300000,0;
		next;
		mes "[�h�~�j�N]";
		mes "����c�c�����A����͂�����";
		mes "���ꂪ�˂��݂Ƃ����z���B";
		mes "�G�N���[�W���ɂ͂��Ȃ��͂��Ȃ̂ɁB";
		mes "���K�҂̉ו��ɂł�����Ă����̂��ȁB";
		mes "�s���ȂƂ�����D�ނ�";
		mes "�����܂������c�c�B";
		next;
		mes "[�h�~�j�N]";
		mes "�ӂނӂށB�v�����������ȁB";
		mes "���炵�����������������Ƃ�";
		mes "��Ⴂ���B";
		mes "���`��A�������������ꂽ�ȁB";
		next;
		mes "�]�������������ꂽ��";
		mes "�@���ł���c�c�]";
		close;
	}
	end;
OnKilled:
	end;
OnTimer15000:
	stopnpctimer;
	killmonster "ecl_in01.gat","�h�~�j�N#nk::OnKilled";
	end;
}

ecl_in01.gat,79,84,0	script	#ecl_kusa	139,3,3,{
	if(ECL_7QUE == 7 && ECL_7QUE1 == 2) {
		mes "�]���̕ӂ肪����A����ɂ�";
		mes "�@���傤�ǂ悳�������]";
		next;
		if(select("���Ȃ�","����Ă݂�") == 1)
			close;
		mes "�]�h�~�j�N�Ɍ�����ʂ悤��";
		mes "�@�p�ӂ����G�����T�����]";
		delitem 6563,1;
		set ECL_7QUE1,3;
		delquest 4262;
		initnpctimer;
		monster "ecl_in01.gat",79,84,"�G��",1080,1,"#ecl_kusa::OnKilled";
		getexp 300000,0;
		next;
		mes "[�h�~�j�N]";
		mes "������ƁI�@���Ȃ��I";
		mes "�����ŉ������Ă����ł��H";
		next;
		mes "[�h�~�j�N]";
		mes "��H�@���ł�������́B";
		mes "���H�@�G�����B";
		mes "�ǂ����Ă���ȂƂ���ɁH";
		next;
		mes "[�h�~�j�N]";
		mes "�܂��A�����ł��傤�B";
		mes "���X�΂̑����ꏊ�ł����A";
		mes "�{�ɉe���͂Ȃ��ł��ˁB";
		mes "�����A���Ȃ��B�����������܂�";
		mes "���낤�낵�Ȃ��悤�ɂ��肢���܂���B";
		next;
		mes "�]�G���͂�����Ɖ萁������";
		mes "�@�h�~�j�N�͋C�ɂ��ĂȂ��悤���]";
		close;
	}
OnKilled:
	end;
OnTimer15000:
	stopnpctimer;
	killmonster "ecl_in01.gat","#ecl_kusa::OnKilled";
	end;
}

ecl_in01.gat,80,86,4	script	�~�b�h�K���h�T���j#book	111,{
	if(ECL_7QUE < 8) {
		mes "�]�ǂ߂����Ȗ{������B";
		mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
		mes "�@�I�Ɏ���̂΂��Ă݂��]";
		next;
		mes "[�h�~�j�N]";
		mes "������ƁA���Ȃ��I";
		mes "����Ɏ����Ă����Ȃ��ł��������I";
		mes "�\����Ȃ��ł����A�����̖{��";
		mes "�G�N���[�W���Z���̕��ȊO��";
		mes "�݂��o���ł��܂����B";
		close;
	}
	mes "�]�ǂ߂����Ȗ{������B";
	mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
	mes "�@�I�Ɏ���̂΂��Ă݂��]";
	next;
	mes "�]�~�b�h�K���h�T���j����1�]";
	while(1) {
		next;
		if(select("�{��ǂ�","�ǂނ̂���߂�") == 2) {
			mes "�]��Ɏ�����{��{�I�ɖ߂����]";
			close;
		}
		switch(rand(10)) {
		case 0:
			mes "�����N�͖��������N��";
			mes "�Q�Ă���Ɠ`�����Ă���ꏊ���B";
			next;
			mes "�����Ȃ������ɐ��H�A�΂����Ƃ�";
			mes "�l�Ԃ炵���Ȃ��Z���X���B";
			next;
			mes "���Ă̎w���҂������Ă��錚������";
			mes "�����X�^�[���o��悤�ɂȂ�O��";
			mes "���a�ȏꏊ�������񂾂낤�B";
			continue;
		case 1:
			mes "�A���x���^�̓��[���~�b�h�K�b�c��";
			mes "�l�X���A�����ɗ������߂�";
			mes "�悭�K�˂�ꏊ���B";
			next;
			mes "�����ɂ͑����̑D����������Ă���";
			mes "����ŗ��s������悤���B";
			next;
			mes "�{���ɐl�Ԃ����̔\�͂Ƃ́c�c";
			mes "���]���Ă��܂��B";
			mes "�Ȃ����[�v�|�[�^�����g��Ȃ��̂��B";
			continue;
		case 2:
			mes "�X�̒��ɂ̓t�F�C�����Ƃ����X������B";
			mes "�{�a�ƌĂ΂�Ă���ꏊ�炵����";
			mes "�p�r�͂悭�킩��Ȃ��B";
			next;
			mes "���[���~�b�h�K�b�c�̎�s��";
			mes "�v�����e���ɂȂ�O��";
			mes "�g�p����Ă����ꏊ�Ȃ̂��낤���c�c�B";
			continue;
		case 3:
			mes "�����ɂ͑����̐�m������";
			mes "���݂��ɋ��������Ȃ���";
			mes "�ꏊ�����ɑ�������A";
			mes "���o�̂悤�Ȃ��Ƃ�����ꏊ������B";
			next;
			mes "�킢�̏��҂͏ܕi���Ⴆ��悤�����A";
			mes "�ŋ߂͂��܂藬�s���Ă��Ȃ��炵���B";
			continue;
		case 4:
			mes "�l�Ԃ�������͂苏�Z�n�̋��E���ɂ�";
			mes "�����������ĂĂ����B";
			mes "���̕ӂ͂ǂ����ς��Ȃ��炵���B";
			mes "���ꂪ���̊X�A�A���f�o�������B";
			next;
			mes "�X�̒����ɂ��鎞�v���ɂ�";
			mes "���v�̎p�����Ă��郂���X�^�[��";
			mes "�o�v���Ă����B";
			mes "���́A�X�̒��ɂ��铃��";
			mes "�����X�^�[���o������̂���";
			mes "�����s���ŕs���ł���B";
			next;
			mes "�����A���v���Ƃ������O�̊��ɂ�";
			mes "���v�ɂ��Ȃ񂾃����X�^�[�͏��Ȃ��B";
			mes "���̓��ɂ��Ė`���҂ɘb�𕷂���";
			mes "���|�I�ɍ����������V���̘b��";
			mes "���������B�u�k�v�Ƃ����炵���B";
			continue;
		case 5:
			mes "�q���s�s�C�Y���[�h�B";
			mes "�v�����e���̌��֌��̂悤�ȏꏊ���B";
			mes "�l�Ԃ͋���ׂȂ��̂�";
			mes "�傫�Ȕ��A�D�ƌĂ΂�镨�ňړ�����B";
			next;
			mes "�D�ƌĂ΂��傫�Ȕ���";
			mes "�ނ�̕������W�ɑ傫�ȍv����";
			mes "�ʂ����Ă���悤���B";
			mes "�^�U�̂قǂ͒肩�ł͂Ȃ��B";
			continue;
		case 6:
			mes "�}�W�V�����̏W���X�A�Q�t�F��";
			mes "�����ɂ��铃�������I���B";
			next;
			mes "�X�̒����ɃV���{�������Ă�̂�";
			mes "���s���Ă���̂��낤���c�c�B";
			mes "�v�����e���ɂ͕������A";
			mes "�A���f�o�����ɂ͎��v�����A";
			mes "�Q�t�F���ɂ̓^���[������B";
			next;
			mes "��͂�l�Ԃ����̓s�s�v��ɂ�";
			mes "�Z���X���s�����Ă���ƍl������B";
			continue;
		case 7:
			mes "���[���~�b�h�K�b�c�̎�s�v�����e��";
			mes "�����͖Ȗ��Ȍv��Ō��Ă�ꂽ";
			mes "�Y��Ȍ������������񂠂�B";
			next;
			mes "�����ɂ͔ނ炪�u���v�ƌĂ�ł���";
			mes "�w���҂��Z��ł���悤���B";
			continue;
		case 8:
			mes "�v�����e���ɂ͒��l�I�ȗ͂�";
			mes "�������l���Z��ł���悤��";
			mes "���ʂȒ��ӂ��K�v�炵���B";
			next;
			mes "�ނ́A������{�̃n���}�[���g�p����";
			mes "�ǂ�ȕ���A�h��ł�����@��������";
			mes "�j�󂵂Ă��܂��Ƃ̎����B";
			mes "���낵���͂̎�����ł���B";
			next;
			mes "����ł��`���Ƃ�����";
			mes "���g�̑�����������";
			mes "�ނ̂��Ƃ�K���炵���B";
			mes "�M�����Ȃ����Ƃł���B";
			continue;
		case 9:
			mes "���[���~�b�h�K�b�c��";
			mes "���ɊC�A��ɍ����A�����ɐX�A�k�ɎR";
			mes "���A���ꂼ�ꂠ��B";
			next;
			mes "���m�ȕ\���ł͂Ȃ����A";
			mes "�����炭�q�����G��`����";
			mes "�����ނ˂����`�����낤�B";
			next;
			mes "�ꌩ���Ƀo�����X�̂��������͂��邪";
			mes "�嗤�Ƃ��ďZ�݂₷�����Ƃ�����";
			mes "�ǂ������̂悤�ɂ͊������Ȃ��B";
			mes "�Z�݊��ꂽ�̋���";
			mes "��ׂĂ��܂����炾�낤���B";
			continue;
		}
	}
}

ecl_in01.gat,82,84,4	script	�~�b�h�K���h�T���j#book	111,{
	if(ECL_7QUE < 8) {
		mes "�]�ǂ߂����Ȗ{������B";
		mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
		mes "�@�I�Ɏ���̂΂��Ă݂��]";
		next;
		mes "[�h�~�j�N]";
		mes "������ƁA���Ȃ��I";
		mes "����Ɏ����Ă����Ȃ��ł��������I";
		mes "�\����Ȃ��ł����A�����̖{��";
		mes "�G�N���[�W���Z���̕��ȊO��";
		mes "�݂��o���ł��܂����B";
		close;
	}
	mes "�]�ǂ߂����Ȗ{������B";
	mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
	mes "�@�I�Ɏ���̂΂��Ă݂��]";
	next;
	mes "�]�~�b�h�K���h�T���j����2�]";
	while(1) {
		next;
		if(select("�{��ǂ�","�ǂނ̂���߂�") == 2) {
			mes "�]��Ɏ�����{��{�I�ɖ߂����]";
			close;
		}
		switch(rand(10)) {
		case 0:
			mes "�l�Ԃ́A�s�m��Ȗ����ɐg���ς�";
			mes "���ʂɈ���J���Ȃ����";
			mes "���̎��ɑ΂���";
			mes "��т�������ꍇ������炵���B";
			next;
			mes "����Ȑl���W�܂�ꏊ������";
			mes "�R���h�ł���B";
			continue;
		case 1:
			mes "�������j�ł������̕�����";
			mes "�z�������Ă����l�Ԃ����B";
			mes "�Ƃ��낪�A�ނ�̒m����";
			mes "�ς�����̂ł͂Ȃ��A";
			mes "�������ڂ邾���̂悤���B";
			next;
			mes "�ނ�͊��ɁA���ꂼ��̖؁A����";
			mes "���������Ȃ��Ȃ��Ă���B";
			next;
			mes "�����łȂ���΁A���ʂ̐X��";
			mes "���{�̐X�ȂǂƌĂԂ킯���Ȃ��I";
			mes "������������������Ƃ�����";
			mes "�X�ɕςȖ��O��t����Ƃ́I";
			continue;
		case 2:
			mes "�������d�����~�b�h�K���h�ɗ��鎖��";
			mes "�����������̂͐l�ԂɌ���Ȃ�����";
			mes "�`������Ǝv���Ă����B";
			mes "�܂��A���̎����͑�ςȋ����ƏՌ���";
			mes "�����炷���낤�Ƃ��l���Ă����B";
			next;
			mes "�Ƃ��낪�ł���B";
			mes "����2�{���ŗ��킯�̂킩��Ȃ��L��";
			mes "�l�ԎЉ�ɂ��܂�������";
			mes "���������Ă���B";
			mes "����΂��肩痂��������̔L�B��";
			mes "�����܂ŉc��ł���B�Ȃ�Ƃ��������B";
			next;
			mes "���̒m��Ȃ�����������c�c�B";
			continue;
		case 3:
			mes "�����~�b�h�K���h�嗤�̓���ɂ�";
			mes "�R���h�ȊO�ɒ��͂Ȃ��B";
			mes "���������A���̂��߂�";
			mes "�t�@���X���䓇��";
			mes "���݂��Ă���̂��낤�H";
			next;
			mes "�K��Ă݂����̂�";
			mes "���ʂ̑D�������邾���ŁA";
			mes "�����g�D�┽�Љ�W�c�Ȃǂ�";
			mes "���݂�����͓���ł��Ȃ������B";
			mes "�����A�������肻���ȋC������B";
			mes "�ǂ��ďڂ������������Ă݂����B";
			continue;
		case 4:
			mes "�܂��͐l�Ԃ̃`�������W���_��";
			mes "�h�ӂ�\���āA���̒��̋L�^�������B";
			next;
			mes "����Ȗ؂��ЂƂ̒��ɂȂ����E���o��";
			mes "�����ɂ́A�l�X�ȗ��R��";
			mes "�����؂����э~���l������B";
			mes "�������M�����Ȃ����Ƃ�";
			mes "������������э~���̂ł���B";
			next;
			mes "���������ǂ��������Ƃ��낤���B";
			mes "�؂����э~���s�ׂ�";
			mes "�j���ɂƂ��Đ��l�̏ؖ��ł����";
			mes "�����Ă����̂����c�c�B";
			mes "���̗��R������̂��낤���B";
			continue;
		case 5:
			mes "�v�����e���̂悤�ȑ�s�s�ł�";
			mes "�����̊m�ۂ��d�v���B";
			next;
			mes "�l�Ԃ͐���������3���Ƃ����Ȃ��Ƃ���";
			mes "�ア���݂̂��߁A���ɐ����̊m�ۂ�";
			mes "�d�v������Ă���悤�ł���B";
			next;
			mes "�����ŏ㉺�����{�݂Ƃ��āA";
			mes "����Ȍ��z�������Ă��悤�Ȃ̂����c�c";
			next;
			mes "���̓�������s�s�����ɂȂ��񂾁H";
			mes "�ʓ|��������������Ȃ��̂��c�c�H";
			mes "���z�\����̖��Ȃ̂��A";
			mes "�ۈ���̈Ӑ}�ł��̂悤�ɂȂ����̂��A";
			mes "�l�Ԃ̍s���͗������Â炢���̂������B";
			continue;
		case 6:
			mes "�R���h�͊��y�ƊC�݂̓s�s�A";
			mes "�F��ȗV�т�����ꏊ���Ƃ������c�c";
			mes "���͂��܂肻���������͋C�͂Ȃ��B";
			next;
			mes "���̒��ɂ͐l�X���琒�߂���";
			mes "���������݂���悤���B";
			next;
			mes "�l�X�͔ޏ���";
			mes "�_�C�������h�Ƃ�����΂������B";
			mes "�����͂���Ƃ���";
			mes "�_����̃v���[���g��^����B";
			mes "�������A�{���ɗ~����";
			mes "�v���[���g��Ⴆ��̂�";
			mes "�^�Ɍb�܂ꂽ�l�݂̂̂悤���B";
			continue;
		case 7:
			mes "���͍����A�Ռ��I�Ȏ�����ڌ������B";
			mes "����Ȏ����������̂��낤���B";
			next;
			mes "�v�����e������قǂȂ��ꏊ�ɂ���";
			mes "�C���@�B�_�̓��ɐi�����Ƃ���";
			mes "��҂������K���n�ł���";
			next;
			mes "�Ȃ�Ƃ����ł́A";
			mes "�_����ڎw����҂��x����";
			mes "���X�ƃL�m�R�̎����������A";
			mes "���点���肵�Ă���悤���c�c�B";
			mes "�M�����Ȃ����ł���B";
			continue;
		case 8:
			mes "����ȏ�̈�ՁA�O���X�g�w�C���B";
			next;
			mes "�������ǂ����Ă��̂悤�ɂȂ������A";
			mes "���̎���������̂���";
			mes "�܂����炩�ɂȂ��Ă��Ȃ��B";
			next;
			mes "���݂ł�10��ނ𒴂��鐔������";
			mes "�����X�^�[�̐��ݏ��ƂȂ��Ă���B";
			mes "������c�c";
			next;
			mes "���A�����͂ǂ̕ӂ�ɂ���̂�";
			mes "�N�������Ă���Ȃ����̂��c�c�B";
			continue;
		case 9:
			mes "�C�Y���[�h����D�ɏ������A";
			mes "�o�C�������̒n���ɂ͓��A�����݂���B";
			next;
			mes "���̒n����";
			mes "���̂悤�ɒ������A�����݂���̂�";
			mes "�_��Ƃ��������悤���Ȃ��B";
			mes "���A�̐�ɂ͐_�a��s�s�Ȃǂ�";
			mes "���݂��������ꑱ���Ă���Ƃ����B";
			mes "�Ñ�̕������������낤���B";
			continue;
		}
	}
}

ecl_in01.gat,83,84,4	script	�~�b�h�K���h�T���j#book	111,{
	if(ECL_7QUE < 8) {
		mes "�]�ǂ߂����Ȗ{������B";
		mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
		mes "�@�I�Ɏ���̂΂��Ă݂��]";
		next;
		mes "[�h�~�j�N]";
		mes "������ƁA���Ȃ��I";
		mes "����Ɏ����Ă����Ȃ��ł��������I";
		mes "�\����Ȃ��ł����A�����̖{��";
		mes "�G�N���[�W���Z���̕��ȊO��";
		mes "�݂��o���ł��܂����B";
		close;
	}
	mes "�]�ǂ߂����Ȗ{������B";
	mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
	mes "�@�I�Ɏ���̂΂��Ă݂��]";
	next;
	mes "�]�~�b�h�K���h�T���j����3�]";
	while(1) {
		next;
		if(select("�{��ǂ�","�ǂނ̂���߂�") == 2) {
			mes "�]��Ɏ�����{��{�I�ɖ߂����]";
			close;
		}
		switch(rand(10)) {
		case 0:
			mes "��ɍ��ꂽ���A�x�C���X��";
			mes "���Ȃ肤�܂��݌v����Ă���B";
			next;
			mes "���藐��鍂�፷���I�݂ɗ��p����";
			mes "������Ԃ��m�ۂ��Ă���悤���B";
			next;
			mes "�����A�s�������ꏊ��";
			mes "�v���悤�ɍs���Ȃ��̂�";
			mes "���ɂ��炢�炷��B";
			continue;
		case 1:
			mes "�c���s�s�ł���t�B�Q����";
			mes "�܂�œ암�n��̃R���h�̂悤���B";
			next;
			mes "�������̃~�j�Q�[��������Ȃ���A";
			mes "���̕��i���q�̓I�Ŗ������B";
			next;
			mes "�����A���̂悤�Ȍ�y�{�݂�";
			mes "���̒��S�ɂ���ׂ����Ǝv�����c�c�B";
			continue;
		case 2:
			mes "�A�C���u���b�N��";
			mes "�@�B�����C���ɂȂ��Ă���s�s���B ";
			next;
			mes "�������ԍH��ł�����������";
			mes "���Y����Ă���̂��낤�B";
			mes "�����ĉ��̂��߂ɐl�X��";
			mes "�����Ă���̂��낤�B";
			next;
			mes "�����̔��W�͕K������";
			mes "�L���Ȑl���ɂ͌q����Ȃ��B";
			mes "�����m��B�Ƃ������t��";
			mes "�ނ�ɕ��������B";
			continue;
		case 3:
			mes "�A���i�x���c�n���";
			mes "�������ɂƂĂ������ꏊ��";
			mes "����炵���c�c�B";
			next;
			mes "�����̔M�C�Ŏ��̉H��";
			mes "�S���R�₳�ꂻ�����B";
			mes "�����������̏Z����";
			mes "�F�D�I�ł͂Ȃ��炵���B";
			next;
			mes "�ȏ�̗��R��";
			mes "���̒n�̒T���͒��f���邵���Ȃ������B";
			mes "�����ǂ�ł��邠�Ȃ�������";
			mes "�߂Â��Ȃ��悤���ӂ��ꂽ���B";
			next;
			mes "�K�[�f�B�A�����|���킯�ł�";
			mes "�Ȃ��B";
			continue;
		case 4:
			mes "�A���i�x���c�̎�s�A���w���ɂ�";
			mes "�������Ĕ����p�����Ă���";
			mes "�v�j���v�j�����ăJ���C�C����������B";
			next;
			mes "�V���}��z���������Ȃ��͊Ԉ���Ă�B";
			mes "�}�[�����ł��Ȃ��B";
			next;
			mes "�����͎w���҂ƍՎi�̏��̎q���B";
			continue;
		case 5:
			mes "�A�C���u���b�N�ŗ�Ԃɏ���";
			mes "�A�C���x�t�Ƃ������֍s����B";
			next;
			mes "���ɂƂ��ė�Ԃ�";
			mes "�ł������Ȍ�ʎ�i����";
			mes "�ቿ�i�ׁ̈A�l�Ԃɂ͕֗��������B";
			next;
			mes "�����c�c��C����������B";
			mes "�������̏Z�ޏꏊ�ł͂Ȃ��c�c�B";
			continue;
		case 6:
			mes "���q�^���[���ɂ͌����҂��������Ă�";
			mes "����Ȍ���������B";
			mes "���̒��ŉ������Ă��邩��";
			mes "�O����͂��������m��Ȃ����A";
			mes "�ǂ����ǂ��Ȃ��\������悤���B";
			next;
			mes "���̊X�ł͂ƂĂ�";
			mes "�n�x�̍����������悤�Ɍ�����B";
			mes "���̂�����ɉ����A���̌�����";
			mes "����ł����肷��̂��낤���c�c�B";
			continue;
		case 7:
			mes "�W���m�[�Ƃ����s�s�͋�ɕ����Ă���B";
			mes "�f���炵���͂ł͂Ȃ����B";
			next;
			mes "�����Ă����ł͖��H��E�o�ł����l��";
			mes "�V�����͂�񋟂���ꏊ������悤���B";
			next;
			mes "�l�Ԃ����̗͖͂{���ɖ��m�����B";
			mes "��ɑ�n�𕂂����͂�����Ǝv����";
			mes "�V�����͂̉����";
			mes "�킯�̂킩��Ȃ����H���K�v�ƂȂ�B";
			continue;
		case 8:
			mes "���悢��l�Ԃ�����";
			mes "�D�𐅏�Ŏg�����ɖO�����炸";
			mes "��̏�ł̗��p���J�n�����悤���B";
			next;
			mes "�����������͉����ɂ����񂾁H";
			mes "�n�ʂ̉��H�@���ԂƋ�Ԃ𒴉z�H";
			next;
			mes "������ߋ��ɗ��s���ė���Ȃ�Ď���";
			mes "������O�ɂȂ�̂�������Ȃ��B";
			mes "�l�ނ̋Z�p���W�ɂ͒��ӂ��K�v���B";
			continue;
		case 9:
			mes "�A�E�h���������ɂ�";
			mes "�����̐H���A���Ə��������Z��ł���B";
			next;
			mes "�l����������ƏP���Ă���̂�";
			mes "���������Ɩ��f���Ȃ��ق��������B";
			next;
			mes "������ނ炪���H���Ƃ�����";
			mes "����H�ׂĐ����Ă���񂾂낤�H";
			continue;
		}
	}
}

ecl_in01.gat,83,81,4	script	�~�b�h�K���h�T���j#book	111,{
	if(ECL_7QUE < 8) {
		mes "�]�ǂ߂����Ȗ{������B";
		mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
		mes "�@�I�Ɏ���̂΂��Ă݂��]";
		next;
		mes "[�h�~�j�N]";
		mes "������ƁA���Ȃ��I";
		mes "����Ɏ����Ă����Ȃ��ł��������I";
		mes "�\����Ȃ��ł����A�����̖{��";
		mes "�G�N���[�W���Z���̕��ȊO��";
		mes "�݂��o���ł��܂����B";
		close;
	}
	mes "�]�ǂ߂����Ȗ{������B";
	mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
	mes "�@�I�Ɏ���̂΂��Ă݂��]";
	next;
	mes "�]�~�b�h�K���h�T���j����4�]";
	while(1) {
		next;
		if(select("�{��ǂ�","�ǂނ̂���߂�") == 2) {
			mes "�]��Ɏ�����{��{�I�ɖ߂����]";
			close;
		}
		switch(rand(8)) {
		case 0:
			mes "�A���x���^�����";
			mes "�ȉ��̂悤�ȏꏊ�ɍs�������o�����B";
			next;
			mes "�_�̍��A�}�c�A�y���̂悤�ȃR�������A";
			mes "���p�̒B�l������Ƃ������m��A";
			mes "�傫�Ȓ���������A���^���ȂǂȂǁB";
			next;
			mes "���݂��₦�ԂȂ��e������";
			mes "�O�������A�������ɗ��Ă���炵���B";
			mes "���ꂩ������Ƒ����̒n���";
			mes "�s����悤�ɂȂ��Ă����̂��낤�B";
			continue;
		case 1:
			mes "���̑嗤�ŐM����_�̂���";
			mes "�ł��L���Ȃ̂̓I�[�f�B���̂悤���B";
			mes "�I�[�f�B���𐒂߂Ă���";
			mes "�_�a�����݂���B";
			next;
			mes "���������Ȃ̂Ŏ����K��Ă݂����A";
			mes "�ƂĂ��₽������ꂽ�B";
			mes "���Ȃ����B";
			continue;
		case 2:
			mes "�A���x���^����D�ɏ���";
			mes "�F��ȏꏊ�ɒH�蒅�����Ƃ��ł���B";
			next;
			mes "�����������U���Ă������Ǝv���̂���";
			mes "���֐����l���Ă̎���������Ȃ��B";
			mes "�������ŕ֗��Ɏg�������o����B";
			continue;
		case 3:
			mes "�x�C���X�̉����ɓn���ꂪ����B";
			mes "�ŏ����́A�����ɂ���D��";
			mes "�ǂ��Ɍ������̂�������Ȃ������B";
			next;
			mes "�����ŉB��ėl�q�����Ă����Ƃ���";
			mes "�Ռ��I�Ȃ��̂�ڌ����Ă��܂����c�c�B";
			next;
			mes "�����I�Ȗ���";
			mes "�������܂��\��������̂ŁA";
			mes "�b�͂���ŏI��点�����Ǝv���B";
			continue;
		case 4:
			mes "�A���x���^����s����ꏊ�̒��ɂ�";
			mes "��j�D�܂ł���B";
			next;
			mes "���łɂ��̑D�͉������ҒB��";
			mes "��̂���Ă���B";
			continue;
		case 5:
			mes "���v���̂���X��";
			mes "1�N���A�Ԃ����������𒅂Ă���";
			mes "�q�Q�̒������ꂳ�񂪂���B";
			mes "�ނɗ��ނƔN����̍~��ς���X��";
			mes "�s�����Ƃ��o����B";
			next;
			mes "�����͕��͋C���ō��ɂ悩�����B";
			mes "���́A���Ƃ����F��";
			mes "����Ȃɂ��������̂��낤�B";
			mes "�S�Ă�ۂݍ��ނ悤�ł���";
			mes "���̑S�Ă���������B";
			next;
			mes "���̓��L�������Ă���ƖO���Ă���B";
			mes "���܂ɂ͔����������y�[�W�������Ă�";
			mes "�����񂶂�Ȃ����낤���B";
			continue;
		case 6:
			mes "�D�ɏ���čs����ꏊ�̒��ŁA";
			mes "�L���ȃo�J���X�n������悤���B";
			next;
			mes "�����A��l�ł͍s���Ȃ��ق���";
			mes "�����炵���B����̃}�X�^�[��";
			mes "�����Ȃ��狳���Ă��ꂽ�B";
			continue;
		case 7:
			mes "�A���x���^����s����ꏊ�̒���";
			mes "�J������ʂɏo�v����Ƃ�����������B";
			next;
			mes "����D������킯�ł͂Ȃ����A";
			mes "������߂Ȃ������̖��A";
			mes "�����ɑ����Ă����D�������鎖����";
			mes "�m�鎖���ł����B";
			next;
			mes "���ۂɍs���Č����";
			mes "�₽���J���A�M���J���A�E�҃J���Ȃ�";
			mes "�������Ƃ��Ȃ��J�����������񂢂��B";
			mes "���������T�͂͂��߂Ă݂��B";
			continue;
		}
	}
}

ecl_in01.gat,82,78,4	script	�G��#01	111,{
	if(ECL_7QUE < 8) {
		mes "�]�ǂ߂����Ȗ{������B";
		mes "�@�~�b�h�K���h�Ɋւ�����e�̂悤���B";
		mes "�@�I�Ɏ���̂΂��Ă݂��]";
		next;
		mes "[�h�~�j�N]";
		mes "������ƁA���Ȃ��I";
		mes "����Ɏ����Ă����Ȃ��ł��������I";
		mes "�\����Ȃ��ł����A�����̖{��";
		mes "�G�N���[�W���Z���̕��ȊO��";
		mes "�݂��o���ł��܂����B";
		close;
	}
	mes "�������[���~�b�h�K�b�c10����";
	next;
	mes "���W�I�@�v�����e���̗L���l�I";
	mes "�Ɛ�C���^�r���[�ɐ���!!";
	next;
	if(select("�����ēǂ�","�ǂނ̂���߂�") == 2)
		close;
	mes "[�L��]";
	mes "�݂Ȃ���A����ɂ��́B";
	mes "�����̃C���^�r���[��";
	mes "10�N�Ƃ����������ԁA";
	mes "�`���҂̑����𐸘B�������A";
	mes "���݂��Ȃ������ł��鐸�B�̒B�l";
	mes "�z���O�����搶�ł��I";
	next;
	mes "[�L��]";
	mes "����A�y���݂ł��ˁ`�B";
	mes "��낵�����肢���܂��B";
	mes "����ɂ��́I�@�z���O�����搶�I";
	next;
	mes "[�z���O����]";
	mes "�͂��A����ɂ��́B";
	next;
	mes "[�L��]";
	mes "�ł́A���������̎���ł��B";
	mes "10�N�ȏ�̊ԁA";
	mes "���B�𑱂��Ă��Ă���搶�ł����A";
	mes "���B���n�߂����R�͉��ł����H";
	next;
	mes "[�z���O����]";
	mes "����B���������v�[���ɍs���������B";
	mes "�j�������܂��悭�킩��Ȃ��̂�";
	mes "���ɗǂ��������񂾂�B";
	mes "���̎����ˁB���A����͍˔\����ȂƁB";
	next;
	mes "[�z���O����]";
	mes "���ꂪ���������ŁA";
	mes "���B������悤�ɂȂ����񂾁B";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "[�L��]";
	mes "��c�c�H�����ƁA";
	mes "���ɗǂ�����������H";
	mes "����!???";
	mes "���ɕ����͕̂��ʂł����A";
	mes "����ɁA�������Ă���̂�";
	mes "���B���n�߂����R�ł���H";
	next;
	mes "[�z���O����]";
	mes "���Ȃ��͐��̒��Ő��B���������Ƃ�";
	mes "����܂����H";
	mes "�������ƂȂ��Ȃ番����Ȃ����낤�B";
	mes "�܂������c�c�I";
	next;
	mes "[�L��]";
	mes "�������H�@����c�c�́A�͂��B";
	next;
	mes "[�L��]";
	mes "�m���ɐ��B�͂�����������܂���";
	mes "���̒��Ȃ�Ȃ�����ł��B";
	next;
	mes "[�L��]";
	mes "�����ł����c�c�B";
	mes "�����搶�ɂ����킩��Ȃ�";
	mes "�V�[���������A��";
	mes "�������Ȃ�ł��傤���ˁc�c�B";
	next;
	mes "[�L��]";
	mes "���A���`��B�A";
	mes "��l���ꂵ�����o���M���܂��B";
	mes "�ƁA�Ƃ肠�����A";
	mes "���̎���Ɉڂ�܂��傤�B";
	next;
	mes "[�L��]";
	mes "�\�ł͐������Z��";
	mes "�����Ă���ƕ������̂ł����A";
	mes "����͂Ȃɂ������Ă��炦�܂����H";
	next;
	mes "[�z���O����]";
	mes "����B";
	mes "���͖ڂ���Đ��B���ł���񂾁B";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "[�L��]";
	mes "�͂��H";
	mes "���₢�₢��I";
	mes "���������̂ł͂���܂��񂩁H";
	mes "�����Ă��ł����H";
	next;
	mes "[�z���O����]";
	mes "���邳���I";
	mes "���Ȃ��́A�ڂ���Đ��B���������Ƃ�";
	mes "����܂����H";
	mes "�������ƂȂ��Ȃ番����Ȃ����낤�B";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "[�L��]";
	mes "�������I�@������ƁI";
	mes "����A�������͂Ȃ��ł����ǁc�c�B";
	mes "������B���Z�c�c���Z�ł����B";
	mes "�͂��B";
	next;
	mes "[�L��]";
	mes "�搶�̂��Ƃ֊�]������ĖK���";
	mes "�`���҂̊F�����";
	mes "���̂悤�ȓ��e�������肵��";
	mes "�������̂��c�c�^�₪�c��܂����A";
	next;
	mes "[�L��]";
	mes "���Ԃ�����܂��̂�";
	mes "���̕ӂň�x�A���ۂɐ��B���A";
	mes "�����Ă������������Ǝv���܂��B";
	mes "���肢���܂��B";
	next;
	mes "[�L��]";
	mes "����ł͐搶�A�܂��ŏ���";
	mes "������̃i�C�t���炢���܂����H";
	next;
	mes "[�z���O����]";
	mes "�i�C�t���c�c�B";
	mes "�����͑ʖڂ��B";
	mes "���������̃C���^�r���[���낤�B";
	mes "�Œ�ł����x��4���킶��Ȃ��ƁB";
	next;
	mes "[�L��]";
	mes "�����A�搶�H�@�ǂ�������ł����B";
	mes "���肢���܂��B";
	mes "��k�ł���ˁH";
	next;
	mes "[�z���O����]";
	mes "���͏�k���������I";
	mes "�����A�Ȃ񂾁I";
	mes "+9���������Ă��邶��Ȃ����B";
	mes "�ǂ����킶��Ȃ����B";
	mes "�悵�B+10�ɂ��Ă�낤�B";
	mes "�����A�n���Ă݂ȁB";
	next;
	mes "[�L��]";
	mes "���₢��A�搶����́c�c���I";
	mes "������ƁI�@������Ƒ҂��Ă��������B";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "�]�J���I�@�J���I�@�J��!!�]";
	mes "[�z���O����]";
	mes "�N�z�z�z�z�c�c";
	next;
	mes "[�L��]";
	mes "���������I";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "[�z���O����]";
	mes "�͂͂͂́A�����͒��q�������̂��ȁB";
	mes "�������I�@�����͓��j������ȁH";
	mes "���j���͕��퐸�B��";
	mes "���܂������Ȃ������Ƃ�������";
	mes "��������Y��Ă�����B";
	mes "�h��B�h��Ȃ���v�B";
	next;
	mes "�]�L�҂̊Z��E�����z���O�����]";
	next;
	mes "[�z���O����]";
	mes "���X�悢�h���Ȃ����B";
	mes "+6�n�C���X�N���@���L���[�A�[�}�[��";
	mes "�����A+7�̕������N���ǂ��ȁB";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "�]�J���I�@�J���I�@�J��!!�]";
	mes "[�z���O����]";
	mes "�N�z�z�z�z�c�c";
	next;
	mes "[�L��]";
	mes "�����I�@�����Ă��ł����I";
	mes "�������B��؂ȁc�c�Z���c�c�B";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "[�z���O����]";
	mes "�Ȃ񂾁B�����͋����̓����B";
	mes "�������������B���������Ǝv������B";
	mes "�����݂����ȓ��͊Z�͑ʖڂȂ񂾁B";
	mes "�����A�����������͌C�������񂾁B";
	mes "�C�B����������B";
	mes "�N�A�����E���Ȃ����B";
	next;
	mes "[�L��]";
	mes "�����c�c������ƁI";
	next;
	mes "�]�����ɋL�҂̌C��E�����A";
	mes "�@�z���O�����]";
	next;
	mes "[�z���O����]";
	mes "�悵���ƁB";
	mes "��H";
	mes "�������������B";
	mes "+8�݉��̍��v�̃u�[�c�Ƃ͂Ȃ񂾁B";
	mes "����+8�Ȃ񂾁H�@�Ӗ����������B";
	mes "�d���Ȃ��B������Ƒ҂��Ă���B";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "�]�J���I�@�J���I�@�J��!!�]";
	mes "[�z���O����]";
	mes "�����A�o���オ������I";
	mes "�v�X�ɗǂ������ł����B";
	mes "��������Ȃ��ČN������������H";
	next;
	mes "[�L��]";
	mes "�����I";
	mes "�����I�@�܂�����������Ƃ́I";
	mes "���ꂶ�ᑁ���c�c";
	next;
	mes "[�z���O����]";
	mes "���������Ă�񂾁H";
	mes "�܂���1��c���Ă��邾�낤�B";
	mes "���̑Ë�����񂾁I";
	mes "+9�݉��̍��v�̃u�[�c�Ȃ��";
	mes "���ɂ��������邾�낤!!";
	mes "��Ԃ�ڎw����I�@���߂�Ȃ�I";
	next;
	mes "[�L��]";
	mes "�����A�����[���ł��B";
	mes "�[���ł����āI�@�����I";
	mes "�҂���!!!!!";
	mes "�����A�z���O�����I";
	mes "�҂Ă���I�@�҂��āI�@���肢�I";
	mes "����!!!!!!!!�@���������I";
	next;
	mes "[�z���O����]";
	mes "�N�z�z�z�z�c�c";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "[�L��]";
	mes "�����c�c�����c�c";
	mes "�������c�c�������c�c";
	next;
	mes "[�z���O����]";
	mes "�͂́B�͂́c�c�������ȁc�c�B";
	mes "�������c�c����H�@�������I";
	mes "�����͑厖�Ȗ񑩂���������B";
	mes "�����͑厖�Ȗ񑩂�";
	mes "��������I";
	next;
	mes "[�z���O����]";
	mes "����A�}�ɂ��܂Ȃ��ˁB";
	mes "�C���^�r���[�͂����܂łɂ��悤�B";
	next;
	if(select("�����ēǂ�","��߂�") == 2)
		close;
	mes "�@����ɂ��";
	mes "�@�C���^�r���[�����f�v���܂�������";
	mes "�@���l�ѐ\���グ�܂��B";
	mes "�@�]�ҏW���ꓯ�]";
	close;
}

//============================================================
// ���t�B�l���K�[�f�j���O�N�G�X�g
//- Registry -------------------------------------------------
// ECL_8QUE -> 0�`
//------------------------------------------------------------
ecl_fild01.gat,190,93,5	script	�t�B���[	617,{
	switch(ECL_8QUE) {
	case 0:
		if(ECL_2QUE < 2) {	// �������ƃN�G�X�g����
			mes "[�t�B���[]";
			mes "���̔��������������Ă���B";
			mes "�������t�A�؂̎}�ЂƂЂƂ�";
			mes "�̂��Ă���̂��������Ȃ����B";
			close;
		}
		mes "[�t�B���[]";
		mes "���̔��������������Ă���B";
		mes "�������t�A�؂̎}�ЂƂЂƂ�";
		mes "�������Ă���񂾁B";
		next;
		mes "[�t�B���[]";
		mes "�����A�ǂ������킯��";
		mes "�ŋ߁A���C���Ȃ��݂����Ȃ񂾁B";
		mes "�����ŏ����ȃ��t�B�l�������W�߂�";
		mes "��n�ɉ̂𕷂�������";
		mes "�����T�����肵�Ă���񂾁B";
		next;
		mes "[�t�B���[]";
		mes "���t�B�l�̎d���ɋ���������Ȃ�";
		mes "������x�b�������Ă���B";
		set ECL_8QUE,1;
		setquest 72450;
		close;
	case 1:
		mes "[�t�B���[]";
		mes "���̓��t�B�l�̃t�B���[�Ƃ����B";
		mes "�G�N���[�W���œ����Ă���񂾁B";
		mes "�c�c�L�~�́A�`���҂̂悤���ˁB";
		next;
		mes "[�t�B���[]";
		mes "���t�B�l�̎d���ɋ���������̂����H";
		mes "�����悯��΁A�������̎d����";
		mes "��`���Ă���Ȃ����H";
		next;
		if(select("�����󂯂�","�f��") == 2) {
			mes "[�t�B���[]";
			mes "�����Ȃ̂��c�c�c�O���B";
			mes "�C���ς������A�܂����Ă���B";
			close;
		}
		mes "[�t�B���[]";
		mes "�L�~�ɗ��݂����̂�";
		mes "�ƂĂ��ȒP�Ȃ��Ƃ��B";
		mes "�����ɂ��郉�t�B�l������";
		mes "�����̍�Ƃ��n�߂�悤��";
		mes "�`���Ă���B";
		next;
		mes "[�t�B���[]";
		mes "���̑����ł́A���t�B�l������";
		mes "�̂��A�x��A�������A";
		mes "�Ǝ��̕��@�Ŗ؂Ƒ��ƕ�";
		mes "�����ēy�ɗ͂�^���Ă���񂾁B";
		next;
		mes "[�t�B���[]";
		mes "���X�͎��ЂƂ�ł���Ă���";
		mes "�d���Ȃ̂����A";
		mes "�������䂵�Ă��܂���";
		mes "���͑��̃��t�B�l������";
		mes "����Ă�����Ă���񂾁B";
		next;
		mes "[�t�B���[]";
		mes "4�l�̃��t�B�l��";
		mes "�����ɂ���͂����B";
		mes "�n�}�Ɉ�����Ă�������A";
		mes "�����ɍs���Ă���B";
		mes "����ł́A���񂾂�B";
		set ECL_8QUE,2;
		delquest 72450;
		setquest 72465;
		setquest 13051;
		setquest 13052;
		setquest 13053;
		setquest 13054;
		viewpoint 1,222,290,0,0xFF0000;
		viewpoint 1,83,263,1,0xFF0000;
		viewpoint 1,163,196,2,0xFF0000;
		viewpoint 1,237,181,3,0xFF0000;
		close;
	case 2:
		if(checkquest(13051) || checkquest(13052) || checkquest(13053) || checkquest(13054)) {
			mes "[�t�B���[]";
			mes "��Ƃ��s�����t�B�l��4������B";
			mes "�S���ɍ�Ƃ��n�߂�悤";
			mes "�`���Ă���B";
			next;
			mes "[�t�B���[]";
			mes "�݂�ȑ����̂ǂ�����";
			mes "�������Ă���͂����B";
			viewpoint 1,222,290,0,0xFF0000;
			viewpoint 1,83,263,1,0xFF0000;
			viewpoint 1,163,196,2,0xFF0000;
			viewpoint 1,237,181,3,0xFF0000;
			close;
		}
		mes "[�t�B���[]";
		mes "�ǂ����A�݂�ȍ�Ƃ�";
		mes "�n�߂��悤���ˁB";
		mes "���������𐁂��Ԃ��Ă����B";
		mes "���̑����ɂ͂��������";
		mes "���ꂪ����񂾁B";
		next;
		mes "[�t�B���[]";
		mes "�ԂƖ؂ƃ��t�B�l��";
		mes "������S������Ȃ�A";
		mes "�ǂ����Řb�𕷂��邩������Ȃ���B";
		next;
		if(checkitemblank() == 0) {
			mes "[�t�B���[]";
			mes "��������悤�Ǝv��������";
			mes "����ȏ㎝�ĂȂ��悤���ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close;
		}
		mes "[�t�B���[]";
		mes "�����̍�Ƃ͏I�����ȁB";
		mes "���肪�Ƃ��I";
		mes "�c�c�����悯��΁A";
		mes "^FF0000�����ЂƂA��`���Ă��炢����";
		mes "��Ƃ����邩��A";
		mes "������x�A�b�������Ă���Ȃ����H^000000";
		set ECL_8QUE,3;
		delquest 72465;
		setquest 72490;
		setquest 201580;
		getitem 6081,1;
		getexp 300000,0;
		getexp 0,300000;
		close;
	case 3:
		mes "[�t�B���[]";
		mes "���̃r�t���X�g�^���[��";
		mes "�y���Ȑ̂��炠�����Ƃ����B";
		next;
		mes "[�t�B���[]";
		mes "�����炩�����X�^�[�����݂�";
		mes "�o������ւ����̂����c�c";
		next;
		mes "[�t�B���[]";
		mes "���l�����͊댯���ƕ�����";
		mes "�]�v�ɓ��肽����悤���B";
		emotion 54;
		next;
		mes "[�t�B���[]";
		mes "���̑O��^FF00003���̖`����^000000��";
		mes "�r�t���X�g�^���[�ɓ����Ă������B";
		mes "���܂Ōo���Ă�";
		mes "�o�Ă���C�z���Ȃ��̂��c�c�B";
		next;
		mes "[�t�B���[]";
		mes "�����������߂Ȃ��������Ƃ�";
		mes "�����ł���c�c�B";
		mes "�ނ炪�����Ȃ̂��A";
		mes "���ɍs���Ă���Ȃ����H";
		next;
		if(select("�C���Ă��������I","���͖����ł�") == 2) {
			mes "[�t�B���[]";
			mes "�������B";
			mes "�����C���ς������";
			mes "�܂����Ă���B";
			close;
		}
		mes "[�t�B���[]";
		mes "���������ˁB";
		mes "�r�t���X�g�^���[�ɓ�����";
		mes "�`���҂�3������B";
		next;
		mes "[�t�B���[]";
		mes "1�l�͏����O�ɓ������΂��肾�B";
		mes "�܂����܂艓���܂�";
		mes "�s���ĂȂ��Ǝv���B";
		next;
		mes "[�t�B���[]";
		mes "2�l�ڂ̖`���҂�";
		mes "�^�ʖڂ����Ȃ��삳�񂾂����B";
		mes "�������ǂ����C�ɂȂ��Ă���B";
		next;
		mes "[�t�B���[]";
		mes "3�l�ڂ̖`���҂���肾�B";
		mes "�c�c�������Ă���̂��킩��Ȃ���";
		mes "���ɓ�����1�����قǌo���Ă���񂾁B";
		next;
		mes "[�t�B���[]";
		mes "�y��������Ĉ�ȍ���Ă����";
		mes "�����Ă����̂����c�c";
		mes "���ށA�T���Ă���B";
		set ECL_8QUE,4;
		delquest 72490;
		setquest 72470;
		setquest 13056;
		setquest 13057;
		setquest 13058;
		close;
	case 4:
		if(!checkquest(72455)) {
			mes "[�t�B���[]";
			mes "�r�t���X�g�^���[����";
			mes "�o�Ă��Ȃ��`���҂�3�l����B";
			mes "�S���̈��ۂ��m�F���Ă���B";
			close;
		}
		mes "[�t�B���[]";
		mes "�S���������ň��S������B";
		mes "�������A���ɂȂ�����";
		mes "�o�Ă������Ȃ񂾁c�c�H";
		mes "���������ĂȂ����������H";
		next;
		menu "��̓I�ɂ͉����c�c",-;
		mes "[�t�B���[]";
		mes "�c�c�������B";
		mes "�������ˁB";
		mes "���ɂł��邱�Ƃ������";
		mes "�����̂����c�c�B";
		emotion 9;
		next;
		menu "���ɂ���`���҂��������󂩂��Ă��܂�",-;
		mes "[�t�B���[]";
		mes "����Ȃ��ƂȂ�";
		mes "�����o�Ă���΂����̂ɁB";
		mes "�c�c���܂Ȃ���";
		mes "�����H�ו�������΁A���̖`���҂�";
		mes "���������Ă���Ă���Ȃ����H";
		next;
		mes "[�t�B���[]";
		mes "�c�c�������͂��ꂵ�������ĂȂ���";
		mes "�����A�܂��`���҂̗l�q��";
		mes "���ɍs���Ȃ�";
		mes "�����čs���Ă���B";
		next;
		mes "[�t�B���[]";
		mes "���ꂩ��͒���I��";
		mes "�`���҂����̖������m�F���悤�B";
		mes "�悩�����疾�����܂����Ă���B";
		if(checkitemblank() < 2) {
			next;
			mes "[�t�B���[]";
			mes "��������悤�Ǝv��������";
			mes "����ȏ㎝�ĂȂ��悤���ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close;
		}
		set ECL_8QUE,5;
		delquest 72470;
		delquest 72455;
		setquest 13059;
		setquest 13060;
		setquest 72460;
		setquest 201585;
		getexp 300000,0;
		getexp 0,300000;
		getitem 517,10;
		getitem 6081,1;
		close;
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
		mes "[�t�B���[]";
		mes "���݂Ă��������������ˁB";
		mes "�Ԃ��炫�͂��߂���n�Ƃ�������";
		mes "�{���Ɏ�������B";
		emotion 2;
		next;
		switch(select("��b����","��n�̗l�q�𕷂�","�`���҂����̈���")) {
		case 1:
			switch(rand(3)) {
			case 0:
				mes "[�t�B���[]";
				mes "�ԂƑ�n��������S�������Ă����";
				mes "���݂��ɑ������肷�邱�Ƃ�";
				mes "�Ȃ��͂��Ȃ̂ɁB";
				close;
			case 1:
				mes "[�t�B���[]";
				mes "�r�t���X�g�^���[�͊댯�Ȃ̂�";
				mes "�p���Ȃ��Ȃ����Ȃ��ł���B";
				mes "���łɓ����Ă��܂����`���҂�����";
				mes "�ǂ����邱�Ƃ��ł��Ȃ���B";
				close;
			case 2:
				mes "[�t�B���[]";
				mes "�G�N���[�W���͂ǂ������H";
				mes "�{���ɑf���炵���ꏊ���낤�B";
				close;
			}
		case 2:
			if(checkquest(13059) & 0x2) {
				mes "[�t�B���[]";
				mes "�悭���Ă��ꂽ�ˁB";
				mes "��Ƃ̎��Ԃ��B";
				mes "��`���Ă���邩���H";
				next;
				if(select("���ɔC���āI","���݂܂���A�܂����") == 2) {
					mes "[�t�B���[]";
					mes "���X�ɏ������Ȃ��Ă���";
					mes "��n�̐����������邩���H";
					mes "�����͋C�����悭�Ȃ��݂������B";
					next;
					mes "[�t�B���[]";
					mes "����Ȏ������A��n�̂��߂�";
					mes "�����K�v������񂾁I";
					close;
				}
				mes "[�t�B���[]";
				mes "�{���ɂ��肪�Ƃ��I";
				mes "���t�B�l�B�ɍ�ƊJ�n��";
				mes "�`���Ă���I";
				delquest 13059;
				setquest 13050;
				setquest 13051;
				setquest 13052;
				setquest 13053;
				setquest 13054;
				viewpoint 1,222,290,0,0xFF0000;
				viewpoint 1,83,263,1,0xFF0000;
				viewpoint 1,163,196,2,0xFF0000;
				viewpoint 1,237,181,3,0xFF0000;
				close;
			}
			if(checkquest(13050)) {
				if(checkquest(13051) || checkquest(13052) || checkquest(13053) || checkquest(13054)) {
					mes "[�t�B���[]";
					mes "��Ƃ��s�����t�B�l��4�l���B";
					mes "�݂�Ȃɍ�ƊJ�n����悤";
					mes "�`���Ă���B";
					viewpoint 1,222,290,0,0xFF0000;
					viewpoint 1,83,263,1,0xFF0000;
					viewpoint 1,163,196,2,0xFF0000;
					viewpoint 1,237,181,3,0xFF0000;
					close;
				}
				mes "[�t�B���[]";
				mes "��n�̉̐������������B";
				mes "�݂�Ȃɓ`���Ă��ꂽ�񂾂ˁB";
				mes "���肪�Ƃ��B";
				next;
				mes "[�t�B���[]";
				mes "���������ĉԂƖ؂��x�鉹�c�c";
				mes "�����A�L�~�ɂ��������邾�낤�B";
				emotion 3;
				if(checkitemblank() < 2) {
					next;
					mes "[�t�B���[]";
					mes "��������悤�Ǝv��������";
					mes "����ȏ㎝�ĂȂ��悤���ˁB";
					mes "�A�C�e���̎�ސ������炵�Ă���";
					mes "�܂����Ă���B";
					close;
				}
				delquest 13050;
				setquest 13059;
				getitem 6081,1;
				close;
			}
			mes "[�t�B���[]";
			mes "���͑�n�̋@����";
			mes "�����ǂ��݂������ˁB";
			mes "�x��ł��Ă����v��������B";
			close;
		case 3:
			if(checkquest(13060) & 0x2) {
				mes "[�t�B���[]";
				mes "�܂��`���҂����͏o�ė��Ȃ��񂾁B";
				mes "�ނ炪�������ǂ���";
				mes "���������ɍs���Ă���Ȃ����H";
				next;
				mes "[�t�B���[]";
				mes "�킴�킴���̐��E���痈�Ă��ꂽ";
				mes "�`���҂���������ł�������";
				mes "��n���߂��ނ�c�c�B";
				next;
				if(select("��`���܂��I","�����͔��Ă��邩��A���߂�Ȃ���") == 2) {
					mes "[�t�B���[]";
					mes "�������B";
					mes "�c�c�S�z����B";
					mes "���ɉ̂��̂��Ă����`���҂��c�c�B";
					close;
				}
				mes "[�t�B���[]";
				mes "���肪�Ƃ��B";
				mes "3�l�̖`���҂�������";
				mes "���ė��Ă���I";
				delquest 13060;
				setquest 13055;
				setquest 13056;
				setquest 13057;
				setquest 13058;
				close;
			}
			if(checkquest(13055)) {
				if(!checkquest(72475)) {
					mes "[�t�B���[]";
					mes "3�l�̖`���҂�";
					mes "�܂��r�t���X�g�^���[����";
					mes "�o�ė��Ȃ��񂾁B";
					mes "���ꂼ�ꎖ��͂��邾�낤����";
					mes "�S�z����B";
					next;
					mes "[�t�B���[]";
					mes "�`���҂����������Ȃ̂�";
					mes "���ɍs���Ă���B";
					close;
				}
				mes "[�t�B���[]";
				mes "�S�������������̂��B";
				mes "�c�c�����o�Ă���΂����̂ɁB";
				mes "�Ƃɂ�������������I";
				emotion 54;
				if(checkitemblank() < 2) {
					next;
					mes "[�t�B���[]";
					mes "��������悤�Ǝv��������";
					mes "����ȏ㎝�ĂȂ��悤���ˁB";
					mes "�A�C�e���̎�ސ������炵�Ă���";
					mes "�܂����Ă���B";
					close;
				}
				delquest 13055;
				delquest 72475;
				setquest 13060;
				getitem 6081,1;
				close;
			}
			mes "[�t�B���[]";
			mes "�ꉞ�݂�Ȗ�����";
			mes "�悩�����ƌ����ׂ����ȁc�c�B";
			emotion 9;
			close;
		}
	}
OnInit:
	waitingroom "���t�B�l���K�[�f�j���O",0;
	end;
}

ecl_fild01.gat,222,290,5	script	�̂����t�B�l	436,{
	if(ECL_8QUE == 2) {
		if(checkquest(13051)) {
			mes "[�̂����t�B�l]";
			mes "�t�B���[�l�̂������ł����H";
			mes "�ł́A�̂��܂��ˁI";
			next;
			mes "[�̂����t�B�l]";
			mes "���̉̂��̂����āH";
			mes "���̉̂͂��̑�n��";
			mes "���炬��^���邱�Ƃ��ł����ł���B";
			next;
			mes "�]���t�B�l�̉̂��n�܂����B";
			mes "�@�S���g�܂�悤�ȉ̂��]";
			emotion 2;
			delquest 13051;
			close;
		}
		mes "[�̂����t�B�l]";
		mes "���͑�n�ƉԂ̂��߂ɉ̂��Ă��܂��B";
		close;
	}
	if(ECL_8QUE == 3) {
		mes "[�̂����t�B�l]";
		mes "��n�̂��߂ɉ̂����Ƃ�";
		mes "�ƂĂ��������Ƃ��Ǝv���܂��B";
		close;
	}
	if(ECL_8QUE >= 5) {
		if(!checkquest(13059)) {
			if(checkquest(13051)) {
				mes "[�̂����t�B�l]";
				mes "��ƊJ�n�̎��Ԃł��ˁI";
				mes "�S�z���Ȃ��ł��������B";
				mes "���̐��͕K����n�ɓ͂��܂�����B";
				emotion 2;
				next;
				mes "�]���t�B�l�̉̂��n�܂����B";
				mes "�@�S���g�܂�悤�ȉ̂��]";
				emotion 2;
				delquest 13051;
				close;
			}
			mes "[�̂����t�B�l]";
			mes "���͑�n�ƉԂ̂��߂ɉ̂��Ă��܂��B";
			close;
		}
		mes "[�̂����t�B�l]";
		mes "�̂��߂����݂�����";
		mes "�̂ǂ������܂����B";
		mes "����Ȏ��ɂ͗₽�����ݕ���";
		mes "�~�����Ȃ�܂��B";
		emotion 53;
		close;
	}
	mes "[�̂����t�B�l]";
	mes "��n�̐����������܂����H";
	mes "���͔߂���ł�݂����Ȃ�ł��c�c�B";
	close;
}

ecl_fild01.gat,83,263,5	script	����^���Ă��郉�t�B�l	444,{
	if(ECL_8QUE == 2) {
		if(checkquest(13052)) {
			mes "[����^���Ă��郉�t�B�l]";
			mes "��Ƃ��n�܂��Ă����ł����H";
			mes "�ł́A���͑�n�ɐ���^���܂��B";
			delquest 13052;
			close;
		}
		mes "[����^���Ă��郉�t�B�l]";
		mes "���ƉԂт炪�����Ԃ鉹��";
		mes "�������܂����H";
		mes "��������";
		mes "����^���Ă��邩��Ȃ�ł���I";
		mes "�ււ��I";
		close;
	}
	if(ECL_8QUE == 3) {
		mes "[����^���Ă��郉�t�B�l]";
		mes "��n�ɐ���^����̂�";
		mes "���̎d���ł��B";
		close;
	}
	if(ECL_8QUE >= 5) {
		if(!checkquest(13059)) {
			if(checkquest(13052)) {
				mes "[����^���Ă��郉�t�B�l]";
				mes "�������������񐅂�^���܂��B";
				mes "��������΁A�͂ꂽ�ԂƑ���";
				mes "�����Ԃ�܂�����I";
				mes "�ււ��I";
				delquest 13052;
				close;
			}
			mes "[����^���Ă��郉�t�B�l]";
			mes "�������������ɐ���^���Ă��܂��B";
			mes "���Ȃ������C���Ȃ�����";
			mes "�������ނƂ����ł���`�B";
			close;
		}
		mes "[����^���Ă��郉�t�B�l]";
		mes "�����̐�����͂��̂��炢�ɂ��܂��B ";
		mes "�����������Ă��ǂ��Ȃ��ł���";
		mes "�����̐��̗p�ӂ����Ȃ���";
		mes "�����Ȃ��̂ŁB";
		close;
	}
	mes "[����^���Ă��郉�t�B�l]";
	mes "��n�̌��C���Ȃ��c�c";
	mes "�͂�Ă����悤�Ɍ����܂��B";
	close;
}

ecl_fild01.gat,163,196,5	script	�x�郉�t�B�l	438,{
	if(ECL_8QUE == 2) {
		if(checkquest(13053)) {
			mes "[�x�郉�t�B�l]";
			mes "�t�B���[�l����Ƃ��n�߂Ȃ�����";
			mes "��������ł����H";
			mes "�ł��A�ǂ����Ă��Ȃ������̂��Ƃ��H";
			next;
			mes "[�x�郉�t�B�l]";
			mes "�t�B���[�l�ɐV�����x���";
			mes "������@������̂ɁI";
			next;
			mes "[�x�郉�t�B�l]";
			mes "�����͑O�ɗx���Ă����x��ɂ��܂��B";
			mes "�V�����x��̓t�B���[�l��";
			mes "��ԍŏ��Ɍ��������ł�����B";
			next;
			menu "�x��H",-;
			mes "[�x�郉�t�B�l]";
			mes "���̒n�ɏZ��ł��郉�t�B�l������";
			mes "���̑�n�Ɛ����̂����̋C������";
			mes "������邱�Ƃ��ł��܂��B";
			next;
			mes "[�x�郉�t�B�l]";
			mes "��������Ă����";
			mes "��n�����C�ɂȂ�̂�";
			mes "�킩������ł���B";
			mes "������A���͖����x���Ă��܂��B";
			next;
			mes "[�x�郉�t�B�l]";
			mes "���Ȃ����`�������Ă��邤����";
			mes "��n�̋C�������킩��悤��";
			mes "�Ȃ邩������Ȃ���B";
			mes "�����A�n�߂܂���B";
			delquest 13053;
			close;
		}
		mes "[�x�郉�t�B�l]";
		mes "�����̓t�B���[�l��";
		mes "���Ă��ꂽ�炢���ȁB";
		close;
	}
	if(ECL_8QUE == 3) {
		mes "[�x�郉�t�B�l]";
		mes "���ɗh���Ă��鑐�����Ă����";
		mes "�܂�ŗx���Ă���݂�������";
		mes "�v���܂��񂩁H";
		close;
	}
	if(ECL_8QUE >= 5) {
		if(!checkquest(13059)) {
			if(checkquest(13051)) {
				mes "[�x�郉�t�B�l]";
				mes "���������Ȃ��ł����c�c�B";
				mes "������Ƃ�����΂��Ă����";
				mes "�t�B���[�l�ɓ`���Ă��������ˁI";
				mes "�����A�����I";
				emotion 32;
				delquest 13053;
				close;
			}
			mes "[�x�郉�t�B�l]";
			mes "���ڂ����肵�Ȃ��̂�";
			mes "�S�z���Ȃ��ł��������B";
			close;
		}
		mes "[�x�郉�t�B�l]";
		mes "���̓t�B���[�l��";
		mes "���Ă��ꂽ�炢���ȁc�c";
		close;
	}
	mes "[�x�郉�t�B�l]";
	mes "�����A�ɁA����A���c�c";
	mes "�x��O�ɑ̂��ق������Ƃ��d�v�ł��B";
	mes "����Ȋ����ɂˁI";
	close;
}

ecl_fild01.gat,237,181,5	script	�J���C�C���t�B�l	446,{
	if(ECL_8QUE == 2) {
		if(checkquest(13054)) {
			mes "[�J���C�C���t�B�l]";
			mes "�����p�ł����H";
			next;
			menu "�t�B���[�̗��݂ŗ���",-;
			mes "[�J���C�C���t�B�l]";
			mes "��Ƃ̊J�n���Ԃ�m�点�ɗ����́H";
			mes "���Ⴀ�A�V�l����ˁI";
			next;
			menu "�Ⴄ",-;
			mes "[�J���C�C���t�B�l]";
			mes "���A�p����������Ȃ��ł�����B";
			mes "�����ŋߍ�Ƃ��n�߂��΂��肾���B";
			mes "���ǁA������y������ˁI";
			next;
			menu "�c�c",-;
			mes "[�J���C�C���t�B�l]";
			mes "�݂�Ȃ��낢��ȕ��@��";
			mes "��n��������C������";
			mes "�\������񂾂��ǁA";
			mes "�N�͉����ł���́H";
			next;
			mes "[�J���C�C���t�B�l]";
			mes "���������ł́c�c";
			mes "������Ƃ킩��Ȃ��񂾂��ǁH";
			next;
			menu "�N�͉����H",-;
			mes "[�J���C�C���t�B�l]";
			mes "���Ă킩��Ȃ����ȁ`�B";
			mes "�����ăI�V�����ŃJ���C�C�ł��傤�H";
			next;
			mes "[�J���C�C���t�B�l]";
			mes "���͑�n�ɔ��΂݂�";
			mes "�����Ă�����d�������Ă���́B";
			mes "����ȕ��ɑ�n�Ɍ����Ĕ��΂ނ�";
			mes "�����Ƒ�n���C�����ǂ��Ȃ�͂���I";
			next;
			menu "�c�c",-;
			mes "[�J���C�C���t�B�l]";
			mes "�Ƃɂ����A�N����n�̂��߂�";
			mes "�ł���d�����A���������ĂˁI";
			mes "���Ⴀ�A���͍�Ƃ��n�߂邩��B";
			next;
			mes "�]�J���C�C���t�B�l�͔��΂ݎn�߂��]";
			emotion 18;
			delquest 13054;
			close;
		}
		mes "[�J���C�C���t�B�l]";
		mes "�ςɌ����邩������Ȃ�����";
		mes "��ɑ�n�ɔ��΂ނ��Ƃ�";
		mes "����������ςȂ́B";
		close;
	}
	if(ECL_8QUE == 3) {
		mes "[�J���C�C���t�B�l]";
		mes "�y�������������v���o���Ȃ���";
		mes "�y�����΂�ł݂�́B";
		close;
	}
	if(ECL_8QUE >= 5) {
		if(!checkquest(13059)) {
			if(checkquest(13051)) {
				mes "[�J���C�C���t�B�l]";
				mes "�V�l����ˁB";
				mes "��Ƃ��n�߂��B";
				emotion 18;
				delquest 13054;
				close;
			}
			mes "[�J���C�C���t�B�l]";
			mes "�ςɌ����邩������Ȃ�����";
			mes "��ɑ�n�ɔ��΂ނ��Ƃ�";
			mes "����������ςȂ́B";
			emotion 18;
			close;
		}
		mes "[�J���C�C���t�B�l]";
		mes "��n�ɔ��΂݂�^���邽�߂�";
		mes "�������X�����𖁂��Ă��܂��B";
		mes "�����ƃJ���C�C������n��";
		mes "�������ɈႢ�Ȃ��ł�����I";
		close;
	}
	mes "[�J���C�C���t�B�l]";
	mes "�ԍ炭��n�ɗ����̂͏��߂āH";
	mes "�����������ł���I";
	close;
}

ecl_fild01.gat,98,47,5	script	���V#0��	893,{
	mes "�]�^�ʖڂ����ȏ���������]";
	close2;
	warp "ecl_tdun01a.gat",98,44;
	end;
}

ecl_tdun01a.gat,98,47,5	script	���V#1��	893,{
	if(ECL_8QUE == 4) {
		if(checkquest(13057)) {
			mes "[���V]";
			mes "����A�т����肵���I";
			mes "���Ȃ��́c�c�H";
			next;
			menu "�󋵂��������",-;
			mes "[���V]";
			mes "�����ł����c�c�B";
			mes "�S�z����Ă���Ƃ͒m��܂���ł����B";
			mes "�����ǁA�܂��߂鎖�͂ł��܂���B";
			mes "���͋L�҂ł��B";
			next;
			mes "[���V]";
			mes "�����u���K���Ƃ����G����";
			mes "�`���Ҍ����̋L���������Ă��܂��B";
			next;
			mes "[���V]";
			mes "����Ƃ����܂ŗ�������";
			mes "�܂����_�l��������Ȃ���ł��B";
			mes "�����ɉ�������ƋL�҂̊���";
			mes "�����Ă���̂ɁI";
			next;
			mes "[���V]";
			mes "�Ƃɂ������͖����Ȃ̂�";
			mes "�S�z�̕K�v�͂Ȃ��Ɠ`���Ă��������B";
			next;
			if(checkquest(13056) || checkquest(13058)) {
				mes "�]���V�͖����Ȃ悤���B";
				mes "�@���̖`���҂̈��ۂ��m�F���悤�]";
				delquest 13057;
				close2;
				warp "ecl_tdun01.gat",98,44;
				end;
			}
			mes "�]3�l�Ƃ������̂悤���B";
			mes "�@�t�B���[�ɕ񍐂��悤�]";
			setquest 72455;
			delquest 13057;
			close2;
			warp "ecl_tdun01.gat",98,44;
			end;
		}
		mes "[���V]";
		mes "���v�ł��B";
		mes "�����Ɠ��_�l�������܂�����I";
		close2;
		warp "ecl_tdun01.gat",98,44;
		end;
	}
	if(ECL_8QUE >= 5) {
		if(checkquest(13057)) {
			mes "[���V]";
			mes "�܂��A���Ȃ��ˁB";
			mes "�O�ɂ�����������";
			mes "���_�l��������܂�";
			mes "���͂�������o�܂��񂩂�I";
			next;
			if(checkquest(13056) || checkquest(13058)) {
				mes "�]���V�͖����Ȃ悤���B";
				mes "�@���̖`���҂̈��ۂ��m�F���悤�]";
				delquest 13057;
				close2;
				warp "ecl_tdun01.gat",98,44;
				end;
			}
			mes "�]3�l�Ƃ������̂悤���B";
			mes "�@�t�B���[�ɕ񍐂��悤�]";
			setquest 72475;
			delquest 13057;
			close2;
			warp "ecl_tdun01.gat",98,44;
			end;
		}
		mes "[���V]";
		mes "�S�z���Ȃ��ł��������B";
		mes "�����̐g�͎����Ŏ��܂�����I";
		close2;
		warp "ecl_tdun01.gat",98,44;
		end;
	}
	mes "[���V]";
	mes "���_�l���K�v�ł��I";
	mes "�`���҂����̐S��";
	mes "�͂ނ��Ƃ��ł���悤�Ȃ��̂��B";
	close2;
	warp "ecl_tdun01.gat",98,44;
	end;
}

ecl_tdun01.gat,11,62,5	script	�E���`���E#0��	896,{
	mes "�]�Ⴂ�`���ҕ��̒j��������]";
	close2;
	warp "ecl_tdun01a.gat",13,61;
	end;
}

ecl_tdun01a.gat,11,62,5	script	�E���`���E#1��	896,{
	if(ECL_8QUE == 4) {
		if(checkquest(13056)) {
			mes "[�E���`���E]";
			mes "���Ȃ����`���҂ł����H";
			mes "�����͎������ׂĂ���̂�";
			mes "�������ׂ����Ȃ�";
			mes "���̌�ɂ��Ă��������B";
			next;
			menu "�󋵂��������",-;
			mes "[�E���`���E]";
			mes "�`���҂̈��ۂ�S�z����Ƃ�";
			mes "�ɂȃ��t�B�l�ł��ˁB";
			mes "�܂��āA�����͖`�����ɂȂ�j��";
			mes "�S�z�Ȃǖ��p�ł��B";
			next;
			menu "�`�����H",-;
			mes "[�E���`���E]";
			mes "�����c�c������ꏊ��T����";
			mes "����������ǂ����ɉB������ł��B";
			mes "�₪�Ė`���҂�����";
			mes "���̑��Ղ�ǂ����ƂɂȂ�ł��傤�B";
			next;
			mes "[�E���`���E]";
			mes "�T�C�����Ă����܂��傤���H";
			mes "������A�ꐶ�H�ׂ�̂ɍ���Ȃ�";
			mes "����ɂȂ邩������܂����B";
			next;
			menu "��������",-;
			mes "[�E���`���E]";
			mes "�c�c�l������ڂ��Ȃ��ł��ˁB";
			mes "���͂܂������𒲂ׂ�̂�";
			mes "���t�B�l�ɂ͑��v����";
			mes "�`���Ă����Ă��������B";
			next;
			if(checkquest(13057) || checkquest(13058)) {
				mes "�]�E���`���E�͖����Ȃ悤���B";
				mes "�@���̖`���҂̈��ۂ��m�F���悤�]";
				delquest 13056;
				close2;
				warp "ecl_tdun01.gat",13,61;
				end;
			}
			mes "�]3�l�Ƃ������̂悤���B";
			mes "�@�t�B���[�ɕ񍐂��悤�]";
			setquest 72475;
			delquest 13056;
			close2;
			warp "ecl_tdun01.gat",13,61;
			end;
		}
		mes "[�E���`���E]";
		mes "���v�ł��B";
		mes "���͖`�����ɂȂ�j�ł�����B";
		close2;
		warp "ecl_tdun01.gat",13,61;
		end;
	}
	if(ECL_8QUE >= 5) {
		if(checkquest(13056)) {
			mes "[�E���`���E]";
			mes "�S�z���p�ł��B";
			mes "�T�����I���Ώo�čs���̂�";
			mes "���t�B�l�ɂ͖������Ɠ`���Ă��������B";
			next;
			mes "[�E���`���E]";
			mes "�ʂ̏ꏊ�𒲂ׂɍs���܂��̂�";
			mes "����Ŏ���B";
			next;
			if(checkquest(13057) || checkquest(13058)) {
				mes "�]�E���`���E�͖����Ȃ悤���B";
				mes "�@���̖`���҂̈��ۂ��m�F���悤�]";
				delquest 13056;
				close2;
				warp "ecl_tdun01.gat",13,61;
				end;
			}
			mes "�]3�l�Ƃ������̂悤���B";
			mes "�@�t�B���[�ɕ񍐂��悤�]";
			setquest 72475;
			delquest 13056;
			close2;
			warp "ecl_tdun01.gat",13,61;
			end;
		}
		mes "[�E���`���E]";
		mes "���̃T�C�����~�����̂ł����H";
		mes "�����łȂ��Ȃ�";
		mes "�ז������Ȃ��ł��������B";
		close2;
		warp "ecl_tdun01.gat",13,61;
		end;
	}
	mes "[�E���`���E]";
	mes "���̋��X�܂ŒT�����Ă��܂��B";
	mes "��ژ^�������Ƃ��ɍ���Ȃ��悤�ɁB";
	close2;
	warp "ecl_tdun01.gat",13,61;
	end;
}

ecl_tdun01.gat,51,103,3	script	�j���I�[�Y#0	625,{
	mes "�]�h��Ȋi�D�������j��������]";
	close2;
	warp "ecl_tdun01a.gat",53,103;
	end;
}

ecl_tdun01a.gat,51,103,3	script	�j���I�[�Y#1	625,{
	if(ECL_8QUE == 4) {
		if(checkquest(13058)) {
			cutin "nines04",2;
			mes "[�j���I�[�Y]";
			mes "���������āc�c�l�ԂȂ̂��H";
			next;
			menu "���ۂ��m�F���ɗ���",-;
			mes "[�j���I�[�Y]";
			mes "�������ƌ�����̂��ȁc�c�H";
			mes "��������Ȃ���������Ȃ��B";
			next;
			mes "[�j���I�[�Y]";
			mes "�����������H�ׂĂȂ��񂾁c�c�B";
			mes "���ɂ��|�ꂻ������B";
			next;
			mes "[�j���I�[�Y]";
			mes "�Ƃ肠����^FF0000����^000000�����Ă���c�c�B";
			mes "���ǁA���܂ŕۂ��c�c�B";
			mes "�����A�����Ȃ��Ă����c�c�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�O�ɂ���c�c�B";
			mes "�ؓ����t�B�l���������ȁH";
			mes "�H�ו��𕪂��Ă���Ɠ`���Ă���B";
			mes "�����Q�����ʑO�ɁB";
			next;
			if(checkquest(13056) || checkquest(13057)) {
				mes "�]�j���I�[�Y�͖����Ȃ悤���B";
				mes "�@���̖`���҂̈��ۂ��m�F���悤�]";
				delquest 13058;
				close2;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			mes "�]3�l�Ƃ������̂悤���B";
			mes "�@�t�B���[�ɕ񍐂��悤�]";
			setquest 72455;
			delquest 13058;
			close2;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
		cutin "nines04",2;
		mes "[�j���I�[�Y]";
		mes "���܂ł͖]�܂Ȃ��B";
		mes "���肢�����牽���H�ו����c�c�B";
		mes "�͂�����Ȃ��āA���������Ȃ��B";
		close2;
		warp "ecl_tdun01.gat",53,103;
		end;
	}
	if(ECL_8QUE == 5) {
		cutin "nines04",2;
		mes "[�j���I�[�Y]";
		mes "�����{���ɏI���̂悤���c�c�B";
		mes "����ł����̐l���y���������ȁc�c�B";
		next;
		mes "[�j���I�[�Y]";
		mes "�����������Ď��ʂ̂��B";
		mes "�����p�����������ǁc�c�B";
		mes "���܂ł��肪�Ƃ��B";
		mes "�����鎄�̃M���h��������B";
		next;
		menu "�t�B���[����ɂ������ė�����I",-;
		mes "[�j���I�[�Y]";
		mes "���A�ɂ���D������I";
		mes "�ł���؂͂Ȃ��̂��H";
		next;
		mes "[�j���I�[�Y]";
		mes "��؂���Ȃ��Ă��A�ɂ��ƈꏏ��";
		mes "�H�ׂ���悤�ȕ�����B";
		mes "�ɂ�����������Ȃɂ����ς�";
		mes "�H�ׂ��Ȃ���B";
		next;
		mes "[�j���I�[�Y]";
		mes "�������ȁc�c�ɂ���������Ȃ��āA";
		mes "���̊O�ɂ���y�^���������Ă���";
		mes "^FF0000��ʂ̂ǂ񂮂�^000000��";
		mes "10�����Ă��Ă���Ȃ������H";
		mes "���񂾂�B";
		set ECL_8QUE,6;
		setquest 13061;
		delquest 72460;
		close2;
		warp "ecl_tdun01.gat",53,103;
		end;
	}
	if(ECL_8QUE == 6) {
		if(countitem(517) < 10 || countitem(6558) < 10) {
			cutin "nines04",2;
			mes "[�j���I�[�Y]";
			mes "���ꂪ���n���Ƃ������̂Ȃ̂��c�c�B";
			mes "�ނ����̎v���o���c�c";
			mes "�v�����e����̖�߂��ł�";
			mes "�y�����ЂƂƂ��c�c�B";
			close2;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
		cutin "nines02",2;
		mes "[�j���I�[�Y]";
		mes "�ɂ����A���ɂ��I";
		mes "������D���Ȃ��ɂ��I";
		next;
		mes "[�j���I�[�Y]";
		mes "���������A���������B";
		next;
		mes "[�j���I�[�Y]";
		mes "��������A���̖�����B";
		next;
		mes "[�j���I�[�Y]";
		mes "�����A���������I";
		mes "���ꂱ�������ɂ��̖��B";
		next;
		mes "[�j���I�[�Y]";
		mes "�O�ɏo����ؓ����t�B�l��";
		mes "�̂̂ЂƂ�����Ă����Ȃ��ƁB";
		next;
		mes "[�j���I�[�Y]";
		mes "���c�c�o���邩";
		mes "�킩��Ȃ����ǁc�c�B";
		next;
		menu "�����ɂ��闝�R�𕷂�",-;
		mes "[�j���I�[�Y]";
		mes "���[��A�Ȃ�ƌ����΂������c�c�B";
		mes "�C�������炱�̓��ɓ�����";
		mes "���ɖ����Ă����񂾁B";
		next;
		mes "[�j���I�[�Y]";
		mes "����2�N�O��";
		mes "���ɖ��������Ƃ�������";
		mes "����ȍ~�͋C�������܂܂�";
		mes "���s���Ă���񂾁B";
		next;
		mes "[�j���I�[�Y]";
		mes "���̓����������낻��������";
		mes "�����Ă݂��񂾂��ǁA";
		mes "�o���Ȃ��č����Ă��܂����񂾁B";
		next;
		if(checkitemblank() == 0) {
			mes "[�j���I�[�Y]";
			mes "��������悤�Ǝv��������";
			mes "����ȏ㎝�ĂȂ��݂������ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close2;
			cutin "nines04",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
		mes "[�j���I�[�Y]";
		mes "�Ƃ������A����ŏ���������B";
		mes "���肪�Ƃ��B";
		mes "���܂Ȃ����A�����ЂƂ�";
		mes "�����Ă���Ȃ����H";
		mes "�悩������A������x�b�������Ă���B";
		delitem 517,10;
		delitem 6558,10;
		set ECL_8QUE,7;
		delquest 13061;
		getexp 300000,0;
		getexp 0,300000;
		getitem 6081,1;
		setquest 72480;
		close2;
		cutin "nines02",255;
		end;
	}
	if(ECL_8QUE == 7) {
		if(checkquest(13063)) {
			if(!(checkquest(13063) & 0x4)) {
				cutin "nines03",2;
				mes "[�j���I�[�Y]";
				mes "�܂������ł��Ȃ��̂����H";
				mes "�����O�ɏo��������";
				mes "�}���ł����Ə�����B";
				mes "�쎌�ł����Ȃ���҂����Ă��炤��B";
				close2;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			cutin "nines02",2;
			mes "[�j���I�[�Y]";
			mes "�I������񂾂ˁI";
			mes "����ł��������T�����y�����";
			mes "�c�c�Ⴄ�I";
			mes "���낻��O�ɏo�Ă݂悤���ȁB";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c�Ǝv�������ǁA";
			mes "�������������܂ŗ�������";
			mes "�����L�O�ɂȂ���̂ł��Ȃ���";
			mes "���s�ɗ����Ӗ����Ȃ���ˁH";
			next;
			mes "[�j���I�[�Y]";
			mes "���́c�c�B";
			mes "���y�Y���Ȃ���";
			mes "�F�B���{��񂶂�Ȃ����ƁB";
			next;
			mes "[�j���I�[�Y]";
			mes "�F�B���{��Ȃ��Ŋ�т�����";
			mes "�L�O�i�ɂ��������Ȃ����ȁH";
			emotion 1;
			next;
			switch(select("�[���s�[","�K�^�̗�","���Ӄ����X�^�[�̐험�i")) {
			case 1:
				mes "[�j���I�[�Y]";
				mes "�[���s�[���������ǁc�c�B";
				mes "���܂�ɂ��������Ȃ����c�c�B";
				mes "���ɉ����Ȃ����ȁH";
				next;
				if(select("�o�t�H���b�g�J�[�h","���Ӄ����X�^�[�̐험�i") == 2)
					break;
				cutin "nines04",2;
				mes "[�j���I�[�Y]";
				mes "���A�����c�c�B";
				mes "����ȕ��͂�����";
				mes "��ɓ�����Ȃ���B";
				emotion 19;
				next;
				menu "���Ӄ����X�^�[�̐험�i ",-;
				break;
			case 2:
				mes "[�j���I�[�Y]";
				mes "��H�@����͉��Ɏg�����Ȃ񂾁H";
				mes "���s�����Ă���Ԃ�";
				mes "�����V���������o���悤���ˁB";
				emotion 1;
				next;
				mes "[�j���I�[�Y]";
				mes "�����킩��Ȃ����ǁA���ɂȂ����ȁH";
				next;
				if(select("�Â��J�[�h��","���Ӄ����X�^�[�̐험�i") == 2)
					break;
				mes "[�j���I�[�Y]";
				mes "�Â��J�[�h�����c�c�B";
				mes "�n�Y���ɂȂ邩������Ȃ�����";
				mes "�F�B�ɓn�����Ƃ͂ł��Ȃ���B";
				mes "���ɂȂ����ȁH";
				next;
				menu "���Ӄ����X�^�[�̐험�i",-;
				break;
			case 3:
				break;
			}
			cutin "nines01",2;
			mes "[�j���I�[�Y]";
			mes "���Ӄ����X�^�[�̐험�i���c�c�B";
			mes "���ꂢ���ˁI";
			emotion 0;
			next;
			mes "[�j���I�[�Y]";
			mes "�����ƗF�B��";
			mes "�����܂ł͗������Ƃ͂Ȃ����낤��";
			mes "�����ł�����ɓ���Ȃ����̂Ȃ�";
			mes "�s�v�c�Ɍ����邾�낤�ˁB";
			next;
			mes "[�j���I�[�Y]";
			mes "�������s���Ă����ꏊ��";
			mes "�`����̂ɂ��𗧂��낤�B";
			next;
			if(checkitemblank() == 0) {
				mes "[�j���I�[�Y]";
				mes "��������悤�Ǝv��������";
				mes "����ȏ㎝�ĂȂ��݂������ˁB";
				mes "�A�C�e���̎�ސ������炵�Ă���";
				mes "�܂����Ă���B";
				close2;
				cutin "nines04",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			mes "[�j���I�[�Y]";
			mes "�����l�����B";
			mes "�ł́A�����W�߂邩�l���Ă݂邩��";
			mes "������x�b�������Ă���B";
			set ECL_8QUE,8;
			delquest 13063;
			setquest 72485;
			getexp 300000,0;
			getexp 0,300000;
			getitem 6081,1;
			close2;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
		cutin "nines01",2;
		mes "[�j���I�[�Y]";
		mes "���������Ă����񂾂ˁA���肪�Ƃ��B";
		mes "�����f�r���Ă���̂́A";
		mes "�������������s�Ƃ����̂����邯��";
		mes "���ɂ����R������B";
		next;
		cutin "nines04",2;
		mes "[�j���I�[�Y]";
		mes "�������ɂ����炪�����邩�H";
		mes "��炪��������o��̂�";
		mes "�ז����Ă���悤�Ȃ̂���B";
		next;
		menu "���������Ȃ�",-;
		mes "[�j���I�[�Y]";
		mes "�������茩�Ă���B";
		mes "�������ɂ���z�R���݂����ȓz�炪";
		mes "���̎�����W���}���Ă���B";
		mes "���삪�ڂ₯�ė���Ɩ����Ȃ邵";
		mes "�����������Ă���c�c�B";
		emotion 16;
		next;
		menu "�C�̂�������",-;
		cutin "nines03",2;
		mes "[�j���I�[�Y]";
		mes "����Ȃ��Ƃ͂Ȃ��B";
		mes "����20�C�قǓ|���Ă�����";
		mes "��������o��ꂻ���Ȃ񂾁B";
		mes "���肢����B";
		next;
		mes "�]�j���I�[�Y�������邽�߂ɁA";
		mes "�@^FF0000�`�F�l����20�C^000000�|�����]";
		delquest 72480;
		setquest 13063;
		close2;
		warp "ecl_tdun01.gat",53,103;
		end;
	}
	if(ECL_8QUE == 8) {
		cutin "nines02",2;
		mes "[�j���I�[�Y]";
		mes "�l���Ă݂����ǁI";
		mes "^FF0000�����t�̂�����^000000�Ȃ�";
		mes "�F�B����ԂƎv����I";
		next;
		mes "[�j���I�[�Y]";
		mes "���̓��Ō�������Ï��̊Ԃ�";
		mes "�����肪���܂��Ă�����B";
		mes "�N�����ǂ݂����Ȃ̂�������Ȃ�����";
		mes "�������y�Y�ɂȂ��B";
		emotion 52;
		next;
		mes "[�j���I�[�Y]";
		mes "���傤��^FF0000���������f�B^000000�������񂾂���";
		mes "���͉̂�����B";
		mes "�N�͂��y�Y���W�߂Ă��Ă���B";
		next;
		mes "�]�j���I�[�Y�̂��y�Y��";
		mes "�@^FF0000�����t�̂������10��^000000�W�߂悤�B";
		mes "�@�����t�̂�����͂��̓��ɂ���";
		mes "�@�ʑ����ꂽ�Ï��������Ă���悤���]";
		set ECL_8QUE,9;
		delquest 72485;
		setquest 13065;
		close2;
		warp "ecl_tdun01.gat",53,103;
		end;
	}
	if(ECL_8QUE == 9) {
		if(countitem(6560) < 10) {
			cutin "nines03",2;
			mes "[�j���I�[�Y]";
			mes "�S�z���Ȃ��Ă�����B";
			mes "�̂̕������܂��i��ł���B";
			next;
			mes "[�j���I�[�Y]";
			mes "^FF0000�L�O�i���W�߂ė��鍠^000000�ɂ�";
			mes "�����������Ă���Ǝv����B";
			close2;
			cutin "nines04",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
		cutin "nines02",2;
		mes "[�j���I�[�Y]";
		mes "�����t�̂�������W�߂��񂾂�!?";
		mes "�v�����ʂ�̋L�O�i����B";
		mes "�݂�Ȋ�Ԃ�B";
		next;
		mes "[�j���I�[�Y]";
		mes "���傤�ǉ̂����������񂾁B";
		mes "��x�����Ă݂�H";
		next;
		mes "[�j���I�[�Y]";
		mes "^D96E26�܂��A���̓��Əo������`";
		mes "�f�r�������ā`^000000";
		next;
		mes "[�j���I�[�Y]";
		mes "^D96E26����񂾃_���W�����`";
		mes "�����X�^�[�ł����ς��`";
		mes "���H�Ǝ��̋󕠁`^000000";
		next;
		mes "[�j���I�[�Y]";
		mes "^D96E26�����o�����Ƃ������Ɂ`";
		mes "�����X�^�[�͂��Ȃ��ėǂ��������ǁ`^000000";
		next;
		mes "[�j���I�[�Y]";
		mes "^D96E26���������������Ł`";
		mes "�ڂ܂����`";
		mes "�������󂢂ē|�ꂽ";
		mes "���̎��̂��̏ꏊ^000000";
		next;
		mes "[�j���I�[�Y]";
		mes "�����܂ł����ǁA�ǂ��H";
		mes "������ł��傤�H";
		next;
		switch(select("���Ȃ���","���̋Ȃ�^�������悤�ȋC�����邯�ǁH")) {
		case 1:
			mes "[�j���I�[�Y]";
			mes "���肪�Ƃ��I";
			mes "�����`�����X�������";
			mes "�N�ɏ����Ă���������Ƃ�";
			mes "�̂ɂ����I";
			break;
		case 2:
			cutin "nines04",2;
			mes "[�j���I�[�Y]";
			mes "���͂͂͂́c�c�B";
			mes "����ς肻������ˁH";
			mes "���ۉ̂��Ă݂���";
			mes "����Ȋ��������邵�c�c�B";
			mes "�܂����x��蒼����B";
			break;
		}
		next;
		cutin "nines01",2;
		mes "[�j���I�[�Y]";
		mes "�T�����قڏI�������";
		mes "�����ɂȂ������c�c�B";
		mes "���낻�듃����o�Ȃ��ƂˁB";
		next;
		if(checkitemblank() == 0) {
			mes "[�j���I�[�Y]";
			mes "��������悤�Ǝv��������";
			mes "����ȏ㎝�ĂȂ��݂������ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close2;
			cutin "nines01",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
		cutin "nines02",2;
		mes "[�j���I�[�Y]";
		mes "�{���ɂ��肪�Ƃ��I";
		mes "�ǂ����ł܂���邱�Ƃ��肤��B";
		delitem 6560,10;
		set ECL_8QUE,10;
		delquest 13065;
		setquest 13062;
		setquest 13064;
		setquest 13066;
		setquest 201590;
		getexp 300000,0;
		getexp 0,300000;
		getitem 6081,1;
		close2;
		cutin "nines01",255;
		warp "ecl_tdun01.gat",53,103;
		end;
	}
	if(ECL_8QUE == 10) {
		if((checkquest(13062) && checkquest(13062) & 0x2 == 0) && (checkquest(13064) && checkquest(13064) & 0x2 == 0) && (checkquest(13066) && checkquest(13066) & 0x2 == 0)) {
			cutin "nines02",2;
			mes "[�j���I�[�Y]";
			mes "�S�z���Ȃ��Ă�����I";
			mes "^FF0000���x�͕K���O�ɏo�邩��I^000000";
			mes "���܂܂ł��肪�Ƃ��I";
			mes "���ɉ����������������̂ł�";
			mes "�������������B";
			emotion 15;
			close2;
			cutin "nines02",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
		cutin "nines01",2;
		mes "[�j���I�[�Y]";
		mes "�܂��A������ˁI";
		next;
		switch(select("�������m�F���ɗ���","�H���⋋","�z�R������","�F�B�ւ̂��y�Y")) {
		case 1:
			mes "[�j���I�[�Y]";
			mes "�ؓ����t�B�l�Ɍ�����";
			mes "�����񂾂ˁH";
			mes "�S�D�������t�B�l����ˁB";
			mes "�S�z�Ȃ��Ɠ`���Ă���B";
			if((!checkquest(13061) && !checkquest(13062)) || checkquest(13062) & 0x2) {
				next;
				cutin "nines04",2;
				mes "[�j���I�[�Y]";
				mes "�Ƃ���Łc�c�B";
				mes "�󕠂œ����Ȃ��񂾁B";
				mes "�����Ă���Ȃ����ȁH";
				emotion 16;
			}
			else if((!checkquest(13063) && !checkquest(13064)) || checkquest(13064) & 0x2) {
				next;
				mes "[�j���I�[�Y]";
				mes "���̑O���W���}����z�R����";
				mes "���Ƃ�����Α��v�������ȁc�c�B";
			}
			else if((!checkquest(13065) && !checkquest(13066)) || checkquest(13066) & 0x2) {
				next;
				mes "[�j���I�[�Y]";
				mes "����������������";
				mes "������o��͓̂���Ȃ��ˁB";
				mes "���Ƃ͂��y�Y�����p�ӂ���΁c�c�B";
			}
			if(checkquest(13055)) {
				next;
				if(checkquest(13056) || checkquest(13057)) {
					mes "�]�j���I�[�Y�͖����Ȃ悤���B";
					mes "�@���̖`���҂̈��ۂ��m�F���悤�]";
					delquest 13058;
					close2;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
				mes "�]3�l�Ƃ������̂悤���B";
				mes "�@�t�B���[�ɕ񍐂��悤�]";
				setquest 72475;
				delquest 13058;
				close2;
				cutin "nines01",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			close2;
			cutin "nines01",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		case 2:
			if(checkquest(13062)) {
				if(checkquest(13062) & 0x2 == 0) {
					cutin "nines02",2;
					mes "[�j���I�[�Y]";
					mes "�N���p�ӂ��Ă��ꂽ�ɂ���";
					mes "�{���ɔ�������������B";
					mes "���t�������������������ǁc�c�B";
					close2;
					cutin "nines01",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
			}
			if(checkquest(13061)) {
				if(countitem(517) < 10 || countitem(6558) < 10) {
					cutin "nines04",2;
					mes "[�j���I�[�Y]";
					mes "�H�ו��c�c�H�ו����K�v����c�c�B";
					mes "�ڂ܂�������c�c�B";
					next;
					mes "[�j���I�[�Y]";
					mes "�Ɂc�c�ɂ��B���ɂ��c�c�ɂ��c�c�B";
					next;
					mes "�]�ǂ����󕠂œ����Ȃ��悤��";
					mes "�@�ɂ��Ƒ�ʂ̂ǂ񂮂��10����";
					mes "�@�����Ă��Ă����悤�]";
					close2;
					cutin "nines01",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
				cutin "nines02",2;
				mes "[�j���I�[�Y]";
				mes "�v���Ԃ�̐H������I";
				mes "�ɂ����I�@�ɂ��I";
				mes "������߂Ă��邯�ǂɂ�����I";
				emotion 15;
				next;
				mes "[�j���I�[�Y]";
				mes "���킠�A�{���ɂ��肪�Ƃ��I";
				mes "�N�͖{���ɂ����l���ˁB";
				emotion 21;
				next;
				if(checkitemblank() == 0) {
					mes "[�j���I�[�Y]";
					mes "��������悤�Ǝv��������";
					mes "����ȏ㎝�ĂȂ��݂������ˁB";
					mes "�A�C�e���̎�ސ������炵�Ă���";
					mes "�܂����Ă���B";
					close2;
					cutin "nines02",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
				mes "[�j���I�[�Y]";
				mes "����ŏo����T���ɍs�����B";
				mes "����͊O�ɏo�鎖���ł��������I";
				delitem 517,10;
				delitem 6558,10;
				delquest 13061;
				setquest 13062;
				getitem 6081,1;
				close2;
				cutin "nines01",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			cutin "nines02",2;
			mes "[�j���I�[�Y]";
			mes "�����c�c����������c�c";
			mes "�܂��N�ɉ�āB";
			next;
			mes "[�j���I�[�Y]";
			mes "����������Ƃœ�����";
			mes "�o�邱�Ƃ��ł���Ǝv�����̂�";
			mes "���̊Ԃɂ������ꏊ��";
			mes "�߂��Ă��܂��񂾁c�c";
			next;
			mes "[�j���I�[�Y]";
			mes "������������A���̓��ɂ�";
			mes "�􂢂̂悤�Ȃ��̂�";
			mes "�������Ă��邩������Ȃ��B";
			next;
			menu "���Ȃ��������ԈႦ�������ł́H",-;
			cutin "nines04",2;
			mes "[�j���I�[�Y]";
			mes "�c�c������������Ȃ��B";
			mes "�Ƃ������A��������ċ󕠂Ȃ񂾁B";
			mes "���܂Ȃ����H�ו���";
			mes "�����Ă��Ă���Ȃ����H";
			next;
			if(select("�����󂯂�","�f��") == 2) {
				mes "[�j���I�[�Y]";
				mes "�������c�c�킩�����B";
				mes "�O�̋ؓ����t�B�l�ɂ�";
				mes "���̂��Ƃ͒��߂Ă����";
				mes "�`���Ă���c�c�B";
				emotion 16;
				close2;
				cutin "nines04",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			mes "[�j���I�[�Y]";
			mes "���肪�Ƃ��B";
			mes "�ł���΁A�ɂ��������ȁB";
			mes "���Ƒ�ʂ̂ǂ񂮂肪";
			mes "�ɂ��ƍ����Ǝv�����ǁc�c�B";
			next;
			menu "�܂��͉��ł���������H�ׂ������c�c",-;
			mes "[�j���I�[�Y]";
			mes "�����Ȃ񂾂��ǁA";
			mes "���������H�ׂ�Ȃ�";
			mes "�����������̂���������Ȃ��H";
			mes "�������Ǘ��ނ�B";
			emotion 43;
			delquest 13062;
			setquest 13061;
			close2;
			cutin "nines04",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		case 3:
			if(checkquest(13064)) {
				if(checkquest(13064) & 0x2 == 0) {
					cutin "nines02", 2;
					mes "[�j���I�[�Y]";
					mes "���͑��v����B";
					mes "���̂��炢�Ȃ���Ȃ�����ˁB";
					close2;
					cutin "nines02",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
			}
			if(checkquest(13063)) {
				if(checkquest(13063) & 0x4 == 0) {
					mes "[�j���I�[�Y]";
					mes "��������Ȃ�炾�B";
					mes "���c�c������肽���Ȃ�����";
					mes "����ł���킯�ł͂Ȃ���B";
					mes "�͂͂́c�c�B";
					emotion 22;
					close2;
					cutin "nines01",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
				cutin "nines02",2;
				mes "[�j���I�[�Y]";
				mes "�����|�������̂����H";
				mes "�N�͂Ȃ��Ȃ��D�G���ˁB";
				mes "�C�ɓ�������B";
				emotion 52;
				next;
				if(checkitemblank() == 0) {
					mes "[�j���I�[�Y]";
					mes "��������悤�Ǝv��������";
					mes "����ȏ㎝�ĂȂ��݂������ˁB";
					mes "�A�C�e���̎�ސ������炵�Ă���";
					mes "�܂����Ă���B";
					close2;
					cutin "nines02",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
				mes "[�j���I�[�Y]";
				mes "��͎��ЂƂ�łȂ�Ƃ������B";
				mes "�������Ă΂���Ƃ����̂�";
				mes "�������ˁB";
				delquest 13063;
				setquest 13064;
				getitem 6081,1;
				close2;
				cutin "nines02",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			cutin "nines03",2;
			mes "[�j���I�[�Y]";
			mes "�������I";
			mes "�ЂƂ�œ�����o�悤�Ƃ�������";
			mes "������ƌi�F�ɋC������Ă�����";
			mes "�܂���炪�c�c�B";
			next;
			cutin "nines04",2;
			mes "[�j���I�[�Y]";
			mes "���������������邪";
			mes "���܂蓮���Ƃ܂��󕠂ɂȂ邵�c�c�B";
			emotion 9;
			next;
			if(select("�z�R���̏�������`��","��`��Ȃ�") == 2) {
				mes "[�j���I�[�Y]";
				mes "�������c�c�B";
				mes "�킽���ЂƂ�ł���Ă݂悤�B";
				mes "������������A";
				mes "�|��Ă��܂���������Ȃ����c�c";
				close2;
				cutin "nines04",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			cutin "nines02",2;
			mes "[�j���I�[�Y]";
			mes "�@���������ˁB���������I";
			mes "���x�A���̃M���h��";
			mes "�����悤�ɂ��Ă������I";
			emotion 33;
			next;
			mes "[�j���I�[�Y]";
			mes "�ł́A�`�F�l����20�C�|���Ă���B";
			mes "�����ς��|���K�v�͂Ȃ���B";
			mes "������邩��B";
			delquest 13064;
			setquest 13063;
			close2;
			cutin "nines04",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		case 4:
			if(checkquest(13066)) {
				if(checkquest(13066) & 0x2 == 0) {
					// ������
				}
				close2;
				cutin "nines04",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			if(checkquest(13065)) {
				if(countitem(6560) < 10) {
					cutin "nines01",2;
					mes "[�j���I�[�Y]";
					mes "�����͂���Ȃ��B";
					mes "�ł��A���������~�����ȁB";
					close2;
					cutin "nines01",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
				cutin "nines02", 2;
				mes "[�j���I�[�Y]";
				mes "���肪�Ƃ��I";
				mes "�{���ɌN�͑f���炵���I";
				next;
				mes "[�j���I�[�Y]";
				mes "�~�b�h�K���h�嗤�ł܂�����I";
				mes "�ꏏ�ɖ`�������������B";
				next;
				if(checkitemblank() == 0) {
					mes "[�j���I�[�Y]";
					mes "��������悤�Ǝv��������";
					mes "����ȏ㎝�ĂȂ��݂������ˁB";
					mes "�A�C�e���̎�ސ������炵�Ă���";
					mes "�܂����Ă���B";
					close2;
					cutin "nines01",255;
					warp "ecl_tdun01.gat",53,103;
					end;
				}
				mes "[�j���I�[�Y]";
				mes "�F�B�ɂ��y�Y��n���Ƃ���";
				mes "�N�̂��Ƃ��b���Ă�����B";
				emotion 15;
				delitem 6560,10;
				delquest 13065;
				setquest 13066;
				getitem 6081,1;
				cutin "nines02",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			cutin "nines03",2;
			mes "[�j���I�[�Y]";
			mes "���̊Ԃɂ��A�W�߂Ă��ꂽ���y�Y��";
			mes "�Ȃ��Ȃ��Ă����񂾁B";
			mes "�����Ɖו��ɓ���Ă������̂Ɂc�c�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�\����Ȃ�����";
			mes "������x�����Ă���Ȃ����H";
			mes "�F�B�ɉ�킹��炪�Ȃ���B";
			next;
			if(select("��`��","��`��Ȃ�") == 2) {
				cutin "nines04",2;
				mes "[�j���I�[�Y]";
				mes "�������c�c�������Ȃ��B";
				mes "�ЂƂ�ŒT���Ă݂��B";
				mes "���܂ł����邩�킩��Ȃ�����";
				mes "�����̃~�X������ˁc�c�B";
				close2;
				cutin "nines04",255;
				warp "ecl_tdun01.gat",53,103;
				end;
			}
			mes "[�j���I�[�Y]";
			mes "�����t�łł���������B";
			mes "�ǂ����������������������B";
			mes "�����ƗF�B�����ł����͂��c�c�B";
			delquest 13066;
			setquest 13065;
			close2;
			cutin "nines03",255;
			warp "ecl_tdun01.gat",53,103;
			end;
		}
	}
	cutin "nines04",2;
	mes "[�j���I�[�Y]";
	mes "���ɔ��A��t�`";
	mes "�����ɔ��A��t�`";
	mes "�������Ȃ��ɖ����c�c";
	mes "�������󂫂�����";
	mes "����ȏ�̂��Ȃ��c�c�B";
	close2;
	cutin "nines04",255;
	warp "ecl_tdun01.gat",53,103;
	end;
}

//============================================================
// �v���t�F�b�T�[���[���̋L���N�G�X�g
//- Registry -------------------------------------------------
// ECL_9QUE -> 0�`
//------------------------------------------------------------
ecl_fild01.gat,196,93,5	script	���̈ē��l#biftower	443,{
	mes "[���̈ē��l]";
	mes "���A3�K����4�K�͒ʍs�~�߂łˁB";
	mes "������A���̓���4�K�ɍs�������Ȃ�";
	mes "�{�N�̓]�����u�𗘗p���Ȃ���";
	mes "^ff00004�K�ɂ͍s���Ȃ�^000000���璍�ӂ��ĂˁB";
	mes "�]�����u��4�K�ɍs������?";
	next;
	if(select("�]�����u���g��","�]���͕K�v�Ȃ�") == 2) {
		mes "[���̈ē��l]";
		mes "�킩������B";
		mes "3�K����4�K�̊K�i�͍�";
		mes "���Ă��Ēʍs�ł��Ȃ�������";
		mes "3�K�̓����X�^�[����������";
		mes "�s���Ȃ�C�����ĂˁB";
		close;
	}
	mes "[���̈ē��l]";
	mes "�{�N��4�K�ȊO�͗p�����Ȃ���";
	mes "�����X�^�[�������Ċ댯�Ȃ񂾂�ˁB";
	mes "���ꂶ��]������ˁB";
	close2;
	warp "ecl_tdun04.gat",26,24;
	end;
OnInit:
	waitingroom "4�K�]��",0;
	end;
}

ecl_tdun04.gat,23,27,5	script	�o���ē��l#biftower	443,{
	mes "[�o���ē��l]";
	mes "�c�O�����ǁA��������";
	mes "3�K�ɂ͍~����Ȃ���B";
	mes "�������̓�����o�����Ȃ�";
	mes "�I�����]�����u��";
	mes "���̊O�ɒ��ڑ����B";
	next;
	if(select("������o����","���R�𕷂�") == 2) {
		mes "[�o���ē��l]";
		mes "�o�����������X�^�[���󂵂ĂˁB";
		mes "�C�����Ă��C�����Ă��󂷂���";
		mes "���͕��u��ԂȂ񂾁B";
		mes "�������̓�����o�����Ȃ�";
		mes "�ēx�A�I���ɐ��������ĂˁB";
		close;
	}
	mes "[�o���ē��l]";
	mes "���ꂶ��A���̊O�Ɉړ������B";
	mes "���̊O������A�P���Ă�";
	mes "����͌���Ȃ��ł����B";
	close2;
	warp "ecl_fild01.gat",182,92;
	end;
OnInit:
	waitingroom "�����]��",0;
	end;
}

ecl_tdun04.gat,26,39,1	script	�v���t�F�b�T�[���[��	627,{
	switch(ECL_9QUE) {
	case 0:
		mes "[�v���t�F�b�T�[���[��]";
		mes "�Z�����A�Z������I�@���[�Z�����B";
		mes "�����X�^�[���A";
		mes "�����X�^�[�����Ȃ��ƁI";
		mes "�댯���A��������";
		mes "�P�����ė��邩������Ȃ��I";
		mes "�킠�������I";
		next;
		switch(select("���A������","�������Ă��邩����","�r�t���X�g�ɂ��ĕ���")) {
		case 1:
			break;
		case 2:
			mes "[�v���t�F�b�T�[���[��]";
			mes "������₾�B";
			mes "���Ȃ���΂����Ȃ���������̂�";
			mes "�o���Ă���񂾂��A";
			mes "�������Ȃ���΂����Ȃ���";
			mes "�v���o���Ȃ��񂾁B";
			next;
			mes "[�v���t�F�b�T�[���[��]";
			mes "�ЂƂ܂��͍�����Ă��邱�Ƃ�";
			mes "�����邵���Ȃ��B";
			mes "�����X�^�[������Ēu�����Ƃ��B";
			close;
		case 3:
			mes "[�v���t�F�b�T�[���[��]";
			mes "�r�t���X�g�H�@�����Ă����B";
			mes "�������薰���Ă���B";
			next;
			mes "[�v���t�F�b�T�[���[��]";
			mes "�c�c";
			next;
			mes "[�v���t�F�b�T�[���[��]";
			mes "�����c�c���͎��̔ԂɂȂ�̂��I";
			mes "���߂��I";
			mes "���̂܂܂����킯�ɂ͂����Ȃ��B";
			mes "�����X�^�[��";
			mes "�����X�^�[�������ƍ��Ȃ��ƁI";
			close;
		}
		mes "[�v���t�F�b�T�[���[��]";
		mes "���Ⴀ���I�@���A���A�N���I";
		mes "�����܂łǂ�����ēo���ė���!?";
		mes "�^���[�ɂ͑����̃����X�^�[��";
		mes "�z�u���Ă������̂ɁI";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�N���҂������ė��邱�Ƃ�";
		mes "���肦�Ȃ��͂������I";
		mes "��͂�A���c�c�N�́I";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "��������������X�^�[���ȁH";
		mes "��͂�A�������I";
		next;
		if(select("���̃^���[�͂Ȃ�ł���","���Ȃ������Ɍ����܂�") == 1) {
			mes "[�v���t�F�b�T�[���[��]";
			mes "�^���[���ƁI�@��A�^���[�H";
			mes "�����^���[���āH";
			mes "�Ȃ��A�����^���[�̒��ɂ���񂾁H";
			mes "���������A�����v���o����c�c�B";
			mes "�ǂ�����Ă����ɗ����̂����́B";
			close;
		}
		mes "[�v���t�F�b�T�[���[��]";
		mes "���H�@���������Ă���񂾁B";
		mes "�Ȃ��A�������Ȃ񂾁I";
		mes "���O���������X�^�[�̂����ɁI";
		mes "�����K���ɍ����������";
		mes "���̕����K���Ȃ悤����!!";
		mes "�܂������A���������񂾁c�c�B";
		next;
		mes "�]�����Ŗj�𕏂ł�";
		mes "�@�v���t�F�b�T�[���[���]";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c�ȁA�Ȃ񂾂���́B";
		mes "�Ȃ�Ƃ������Ƃ��c�c�B";
		mes "�񖇖ڂ��������̊炪���̊Ԃ�";
		mes "����ȕ��Ɂc�c";
		mes "���̖��O�A���̖��O�́c�c";
		next;
		menu "�v���t�F�b�T�[���[���H",-;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�������I�@�������c�c����";
		mes "���������ǁA��������Ȃ��񂾁c�c�B";
		mes "�Ⴄ���O���������͂��Ȃ񂾁B";
		mes "�Ȃ񂾂������ȁc�c";
		mes "����A���O���o�Ă��Ȃ��I";
		mes "�������B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "��������炾�I�@��I";
		mes "�Ȃ�����Ȓ��݂����Ȋ��";
		mes "�Ȃ��Ă��܂����Ƃ����񂾁c�c�B";
		mes "�����N���Ă���񂾂��������c�c";
		next;
		emotion 1;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�������I�@�ё��悾�B";
		mes "�ȑO�A�L���ȉ�Ƃɏ����Ă������";
		mes "�ё��悪�ǂ����ɂ������͂����B";
		mes "���ꂪ����ΐ̂̊炪";
		mes "�킩��ȁA����B��[�[���B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����A�N���I";
		mes "�����ځ[���Ɨ����Ă���񂾁I";
		mes "���̘b�����Ă������낤�B";
		mes "�Ƃ肠�������}��";
		mes "���̏ё����T���Ă��Ă����I";
		next;
		if(select("��`��","�f��") == 2) {
			mes "[�v���t�F�b�T�[���[��]";
			mes "�����A�N�I";
			mes "�ɂ����炱���܂�";
			mes "�o���ė����񂾂낤�I";
			mes "���������Ă���񂾁I";
			close;
		}
		mes "[�v���t�F�b�T�[���[��]";
		mes "�悵�B�����q���B";
		mes "��������������������񂾂낤�B";
		mes "�ё���������";
		mes "�����ߋ��̋L����";
		mes "�v���o����������Ȃ��B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���̕����̖{�I�ɂ���{�̂ǂ�����";
		mes "���̏ё��悪���܂��Ă���͂����B";
		mes "���񂾂��I";
		set ECL_9QUE,1;
		setquest 1214;
		close;
	case 1:
		mes "[�v���t�F�b�T�[���[��]";
		mes "���̕����̖{�I�ɂ���{�̂ǂ�����";
		mes "���̏ё��悪���܂��Ă���͂����B";
		mes "���񂾂��I";
		close;
	case 2:
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����A�����Ă��Ă��ꂽ���B";
		mes "���肪�Ƃ��B";
		mes "�ǂ�ǂ�B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c";
		cutin "ep14_pro_worm",3;
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���ꂩ�c�c���̌��̎p�B";
		mes "�c�c";
		mes "�������ɁA�����B";
		mes "�������A�ǂ����Ă����܂�";
		mes "�ς���Ă��܂����񂾁H";
		mes "��c�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�������牽�����A";
		mes "������Łc�c�����悤�ȁc�c";
		mes "���̎��̓V�C�A�����ĕ��i�c�c";
		mes "�����A�Ԃ��炫�n�߂���n�Łc�c";
		mes "�������W�߂Ă����c�c�B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����c�c";
		mes "�������I";
		mes "^FF0000���͗l�L�m�R^000000���W�߂Ă����񂾁I";
		cutin "ep14_pro_worm",255;
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���̃L�m�R���W�߂Ă����񂾂낤�c�c�B";
		mes "�����A�N�B";
		mes "������ƉԂ��炫�n�߂���n�ɍs����";
		mes "^FF0000���͗l�L�m�R^000000���W�߂ė��Ă���Ȃ����B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���͗l�L�m�R������΁A";
		mes "�L�����߂�C������񂾁I";
		next;
		if(select("�킩����","���₾") == 2) {
			mes "[�v���t�F�b�T�[���[��]";
			mes "���͖��O�����Y��Ă���񂾂��I";
			mes "�Ȃ�Ƃ���`�����Ƃ͎v���̂��I";
			close;
		}
		mes "[�v���t�F�b�T�[���[��]";
		mes "�Ԃ��炫�n�߂���n��";
		mes "^FF0000���͗l�L�m�R^000000��20�W�߂ė���񂾁B";
		mes "�������񂠂������������B";
		mes "^FF0000���͗l�L�m�R^000000��";
		mes "�y�^���������Ă���͂����B";
		mes "���񂾂��I";
		next;
		mes "^FF0000�]���͗l�L�m�R�́A���̃N�G�X�g��";
		mes "�@�󂯂Ă����ԂőΏۃ����X�^�[��";
		mes "�@�������邱�ƂŎ����I�ɓ��肵�܂��B";
		mes "�@�����A�C�e���̏d�ʂƎ�ސ���";
		mes "�@�\���ȗ]�T��������";
		mes "�@�������Ă��������]^000000";
		next;
		mes "^FF0000�]�܂��A�p�[�e�B�[�����o�[��";
		mes "�@�Ώۃ����X�^�[�𓢔������ꍇ�ł�";
		mes "�@���͗l�L�m�R����肷�邱�Ƃ�";
		mes "�@�ł��܂��]^000000";
		set ECL_9QUE,3;
		chgquest 1215,1216;
		close;
	case 3:
		if(countitem(6542) < 20) {
			mes "[�v���t�F�b�T�[���[��]";
			mes "^FF0000���͗l�L�m�R^000000������Ȃ����I";
			mes "���̎��A���͉��������邽�߂�";
			mes "20���W�߂Ă����B";
			mes "��������Ȃ��ƁA";
			mes "������ł�����e��";
			mes "���R�Ƃ��Ă��܂��񂾁I";
			next;
			mes "[�v���t�F�b�T�[���[��]";
			mes "^FF0000���͗l�L�m�R^000000��";
			mes "�Ԃ��炫�n�߂���n�ɂ�����Ă���";
			mes "�y�^�������ɓ���邱�Ƃ�";
			mes "�ł��邩��ȁB";
			close;
		}
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����A^FF0000���͗l�L�m�R^000000��20��";
		mes "�W�߂ė��Ă��ꂽ���B���肪�����B";
		next;
		misceffect 72;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����c�c�L����";
		mes "�߂��ė���c�c���Ă���I";
		mes "�c�c";
		mes "������ޗ��ɂ��āc�c";
		mes "�����c�c";
		mes "�������I�@�������Ă����񂾁I";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����A�ǂ����Ƃ̂��߂�";
		mes "����Ă����킯�ł�";
		mes "�Ȃ������C������ȁB";
		mes "��́c�c";
		mes "�����A���ɂ��ޗ����������ȁB";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�悵�I";
		mes "�Y���O�Ƀ�������낤�B";
		mes "����������ΖY��Ȃ����B";
		mes "�������ȁB�ǂɂł��c�c";
		mes "��H";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�Ȃ񂾂����!!!";
		mes "���������炯����Ȃ����B";
		mes "�N������Ȃɂ���������";
		mes "�������Ă����񂾁I";
		mes "���H";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���܂���!?�@�����X�^�[���";
		mes "���܂����������̂��I�H";
		next;
		menu "���Ȃ��̖��O������܂���c�c",-;
		emotion 23;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����I";
		mes "���̕���������́I";
		mes "�������B�ߋ��̎��������悤��";
		mes "����������Ă����̂��B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�͂͂��B�͂͂́c�c";
		mes "�ǂ̗����������Ă�";
		mes "����������Ă������Ƃ���";
		mes "�v���o���Ȃ��Ƃ́c�c�B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���܂񂪌N�A";
		mes "�ǂɏ�����Ă�����e��ǂ��";
		mes "���ɋ����Ă���Ȃ����B";
		mes "����ȏ�Ԃł́A";
		mes "���܂����ɓ����Ă��Ȃ��B";
		next;
		mes "�]�ǂ̂�����ꏊ��";
		mes "�@�v���t�F�b�T�[���[���̗�������";
		mes "�@�c����Ă���B";
		mes "�@�����𒲂ׂ��";
		mes "�@�^���[��r�t���X�g�Ɋւ������";
		mes "�@���鎖���ł��������]";
		next;
		mes "�]^FF0000�ǂɏ����ꂽ��������S�Ē��ׂ悤�B";
		mes "�@�S����5����悤��^000000�]";
		delitem 6542,20;
		set ECL_9QUE,4;
		chgquest 1216,1217;
		close;
	case 4:
		if(ECL_9QUE_sub & 0x1F == 0x1F) {
			mes "[�v���t�F�b�T�[���[��]";
			mes "�������̓��e��S�Ē��������̂��H";
			next;
			mes "�]�v���t�F�b�T�[���[����";
			mes "�@�����������e��񍐂����]";
			next;
			mes "[�v���t�F�b�T�[���[��]";
			mes "�������A������𐻑�����";
			mes "�r�t���X�g�𖰂点���̂��B";
			mes "�����Ďp�����ɕς��A";
			mes "�ǂ�ǂ�L���͂���������ƁB";
			mes "�ӂށB";
			next;
			mes "[�v���t�F�b�T�[���[��]";
			mes "���肪�Ƃ��B";
			mes "�������c�c���[�ށB";
			mes "�����l���鎞�Ԃ�����Ȃ����B";
			next;
			mes "�]�����l���Ă���悤���B";
			mes "�@������x�b�������Ă݂悤�]";
			set ECL_9QUE,5;
			set ECL_9QUE_sub,0;
			close;
		}
		mes "[�v���t�F�b�T�[���[��]";
		mes "�ǂ̐F��ȏ��ɗ�����������B";
		mes "�ǂ����S�Ď����������悤���B";
		mes "�ǂ�5�����قǒ�������";
		mes "�������̓��e�����ɕ񍐂��Ă���B";
		mes "�C�ɂȂ�A�ƂĂ��C�ɂȂ��ċL����";
		mes "�S���Ԃ���т�������B";
		close;
	case 5:
		mes "[�v���t�F�b�T�[���[��]";
		mes "���₵����";
		mes "���������̍���������X�^�[���ȁB";
		mes "�����X�^�[��A�N�̂�����";
		mes "�L�����������ł͂��邪";
		mes "�߂��ė��Ă���悤�Ɋ������B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����A�܂��܂���͑����B";
		mes "���̎��́A";
		mes "�^���[�ɕ����߂�ꂽ�܂܂Ȃ񂾁H";
		mes "���̎��́A";
		mes "�r�t���X�g�𖰂点���񂾁H";
		mes "���̂Ȃ񂾁H�@��H";
		next;
		menu "����𕷂�������ł��I",-;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���邳���I�@���邳�����邳���I";
		mes "�����c�c�����c�c";
		mes "�����j�􂵂������B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�������A���o���Ă��邱�Ƃ�";
		mes "�ǂɏ����c���Ă������B";
		mes "����c�c��H�@����c�c";
		next;
		menu "�c�c�c�c",-;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���A�����A�������������B";
		mes "��������N�ɒ��ׂĂ�������񂾂ȁB";
		mes "���v���B";
		emotion 4,"";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "����Ȃ�Ό�́c�c";
		mes "���L�A���B";
		mes "�������I";
		mes "�������������L���������I";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "����������́c�c";
		next;
		menu "�����Ă�������",-;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���ꂪ�c�c��ʂ̃m�[�g�ł͂Ȃ�";
		mes "^0000FF���L�J�G��^000000�Ƃ����^���p�̃J�G����";
		mes "�ʂ��Ę^�����Ă����񂾂�B";
		mes "����������Ƃȁc�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "����A���̓C���C�����邽�т�";
		mes "�ۂ�ۂ񓊂���΂��Ă��������ŁA";
		mes "�F�X�ȏꏊ�ɎU��U���";
		mes "�Ȃ��Ă��܂��Ă���񂾁c�c�B";
		next;
		menu "�c�c",-;
		mes "[�v���t�F�b�T�[���[��]";
		mes "����A�J�G���ɂ͈��������������A";
		mes "���傤���Ȃ������񂾁B";
		mes "�X�g���X���U����I";
		mes "�������N�����̗���Ȃ�";
		mes "�J�G�������ł͂Ȃ��A���ׂĂ�";
		mes "�����o���Ă������낤��B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�Ƃ������ƂłЂƂ܂����̃J�G����";
		mes "�T���Ă��ė~�����̂����A";
		mes "�����l�����������Ă�������ȁc�c�B";
		mes "�J�G�����g��������邾�낤���B";
		mes "�Ӂ[�ށB";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�������A1�K��";
		mes "���L�J�G�����ŋߓ������ȁB";
		mes "2�C���炢�������C�����邪�c�c";
		mes "���܂Ȃ��B���܂�o���Ă��Ȃ��B";
		mes "�܂��͂�����T���Ă��Ă���Ȃ����B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�N�������ė���Ԃ�";
		mes "���͑��̃J�G�����ǂ��ɓ�������";
		mes "�v���o�����Ƃɂ����B";
		mes "���܂Ȃ�����낵�����񂾂�B";
		set ECL_9QUE,6;
		chgquest 1217,1223;
		close;
	case 6:
	case 7:
		mes "[�v���t�F�b�T�[���[��]";
		mes "1�K�ɓ��L�J�G����";
		mes "���C���������ȁc�c2�C���炢";
		mes "���������L��������B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "����[����͂����������B";
		mes "���낱���";
		mes "�悭�]�����Ă�����B";
		close;
	case 8:
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����A2�C�����������B";
		mes "���܂Ȃ��ȁB";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�m������1�c�c";
		mes "�͂����ς����������L�J�G����";
		mes "�傫�����Ń^���[�̊O��";
		mes "�����Ă������C������B";
		mes "�����A�^���[�̎��ӂɂ���͂����B";
		close;
	case 9:
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����A�߂������B���肪�Ƃ��B";
		mes "���ށB";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�v���o����̂͂����܂ł��B";
		mes "��͎v���o�������ɂȂ��B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�悵�B";
		mes "�����܂ŏW�܂������𐮗����邩�B";
		mes "�ǂ�ǂ�c�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���̕��̓r�t���X�g�̑�n�̎��͂�";
		mes "����Ă����B";
		mes "�����Ŏ��ɖ��߂���";
		mes "�r�t���X�g�𖰂点�鎖�ɂ����B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���͖��߂ɏ]���Đ��͗l�L�m�R�Ȃǂ�";
		mes "�ޗ����W�߂Ė�����A";
		mes "�r�t���X�g�𖰂点�鎖�ɐ��������B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�����Ă��΂炭�̊ԁA";
		mes "���̒n�r�t���X�g�^���[��";
		mes "�l�q������鎖�ɂ����B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�F�X�s���Ȏ����N�����̂�";
		mes "���̎����炾�B";
		mes "���ł͎��̎p�͒��̂悤�ɂȂ�";
		mes "���������҂Ȃ̂��A";
		mes "�v���o���̂����ڂ��Ȃ��B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�c�c";
		mes "���̕��c�c���B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���������A�ʖڂ�!!!";
		mes "�ʖڂ��ʖڂ��ʖڂ��ʖڂ��I";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�S���v��������I";
		mes "���]�ɂ͎��M���������񂾂��A";
		mes "�������͂ȗ͂ɑj�܂�Ă���C�����B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�������A�������B";
		mes "��΂ɂ�����߂Ȃ����B";
		mes "�����Ȃ�����Ƃ��Ƃ񏟕����Ă��B";
		mes "���ēV�˂ƌĂ΂ꂽ����";
		mes "��͂������Ă��!!!!";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�N�A�����܂Ŗ{����";
		mes "���܂Ȃ������ȁB";
		mes "�����������Ȃ��������A";
		mes "�������C�����߂����Ƃ��o�����B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "���ꂩ��͐F�X�΍����鎖�ɂ���B";
		mes "�Y��Ă��܂��������Ȃ�";
		mes "���߂ĕ����Ă��킩��悤��";
		mes "�ꂩ�烁�������悤�ɂ��邳�B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�K������������肾�B";
		mes "�i�W���������ꍇ��";
		mes "�܂��͂��؂�邩������Ȃ��B";
		mes "���̎��͐��񗊂ނ�B";
		next;
		mes "[�v���t�F�b�T�[���[��]";
		mes "�b�������Ȃ��Ă��܂����ȁB";
		mes "�����΂��肾������������悤�B";
		mes "���肪�Ƃ��B";
		if(checkitemblank() == 0) {
			next;
			mes "[�v���t�F�b�T�[���[��]";
			mes "�����ƁA�ו��������ς����ȁB";
			mes "�����ו��𐮗����Ă���A";
			mes "�܂��b�������Ă���B";
			close;
		}
		set ECL_9QUE,10;
		chgquest 1228,201605;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 0,1000000;
		getexp 0,1000000;
		getexp 0,1000000;
		getexp 0,1000000;
		getexp 0,1000000;
		getitem 6081,25;
		close;
	case 10:
		mes "[�v���t�F�b�T�[���[��]";
		mes "�L����߂��@�����������";
		mes "�܂����肢���鎖�����邾�낤����";
		mes "���̎��ɂ܂��͂ɂȂ��Ă���B";
		close;
	}
OnInit:
	waitingroom "�v���t�F�b�T�[���[���̋L��",0;
	end;
}

ecl_tdun04.gat,21,41,0	script	#pf	139,2,2,{
	if(ECL_9QUE == 1) {
		mes "�]�ё�����������I�]";
		next;
		cutin "ep14_pro_worm",3;
		mes "�]���Ƃ͂܂������Ⴄ�p���B";
		mes "�@���ɗ͂������Ă���B";
		mes "�@���M�Ɉ���}�W�V�����̂悤���B";
		mes "�@�����É߂��邹����";
		mes "�@���O�͏����Ă���]";
		next;
		mes "�]�v���t�F�b�T�[���[���Ɍ����悤�]";
		cutin "ep14_pro_worm",255;
		set ECL_9QUE,2;
		chgquest 1214,1215;
		close;
	}
	if(ECL_9QUE == 2) {
		cutin "ep14_pro_worm",3;
		mes "�]�v���t�F�b�T�[���[���̏ё����";
		mes "�@�������ꏊ���]";
		next;
		mes "�]�����v���t�F�b�T�[���[����";
		mes "�@�����ɂ������]";
		cutin "ep14_pro_worm",255;
		close;
	}
	end;
}

ecl_tdun04.gat,37,21,0	duplicate(#pf)	#pf3	139,2,2

ecl_tdun04.gat,39,23,4	script	�ǂɏ����ꂽ����#1	844,{
	if(ECL_9QUE == 4) {
		if(ECL_9QUE_sub & 0x1F == 0x1F) {
			mes "�]�S�Ă̕ǂ��`�F�b�N�����B";
			mes "�@�v���t�F�b�T�[���[���̌��ɖ߂낤�]";
			close;
		}
		if(ECL_9QUE_sub & 0x1) {
			mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
			mes "�@��A4�A�c���Ă���]";
			next;
			mes "�@������x�ǂ�ł݂悤���]";
			next;
			if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
				mes "�]���̏����ɂ����]";
				close;
			}
			mes "[�ǂ̋L�^1]";
			mes "�r�t���X�g��Q�����邱�Ƃɐ��������B";
			mes "���̘r�͂�͂�f���炵���I";
			mes "�����ǁA�Ȃ����܂ł�������";
			mes "�c��Ȃ���΂����Ȃ��񂾁H";
			close;
		}
		mes "�]�ǂ����菑���Ŗ��ߐs������Ă���B";
		mes "�@�ꕔ���e���ǂݎ�ꂻ�����]";
		next;
		if(select("�ǂ�","�ǂ܂Ȃ�") == 2) {
			mes "�]�ǂ܂��ɂ��̏����ɂ����]";
			close;
		}
		mes "�]���菑����ǂ�ł݂��]";
		next;
		mes "[�ǂ̋L�^1]";
		mes "�r�t���X�g��Q�����邱�Ƃɐ��������B";
		mes "���̘r�͂�͂�f���炵���I";
		mes "�����ǁA�Ȃ����܂ł�������";
		mes "�c��Ȃ���΂����Ȃ��񂾁H";
		set ECL_9QUE_sub,ECL_9QUE_sub | 0x1;
		//setquest 1218;
		//compquest 1218;
		close;
	}
	if(ECL_9QUE == 5) {
		mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
		mes "�@������x�ǂ�ł݂悤���]";
		next;
		if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
			mes "�]���̏����ɂ����]";
			close;
		}
		mes "[�ǂ̋L�^1]";
		mes "�r�t���X�g��Q�����邱�Ƃɐ��������B";
		mes "���̘r�͂�͂�f���炵���I";
		mes "�����ǁA�Ȃ����܂ł�������";
		mes "�c��Ȃ���΂����Ȃ��񂾁H";
		close;
	}
	mes "�]�ǂɗ������������Ă���]";
	close;
}

ecl_tdun04.gat,35,31,4	script	�ǂɏ����ꂽ����#2	844,{
	if(ECL_9QUE == 4) {
		if(ECL_9QUE_sub & 0x1F == 0x1F) {
			mes "�]�S�Ă̕ǂ��`�F�b�N�����B";
			mes "�@�v���t�F�b�T�[���[���̌��ɖ߂낤�]";
			close;
		}
		if(ECL_9QUE_sub & 0x2) {
			mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
			mes "�@��A4�A�c���Ă���]";
			next;
			mes "�@������x�ǂ�ł݂悤���]";
			next;
			if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
				mes "�]���̏����ɂ����]";
				close;
			}
			mes "[�ǂ̋L�^2]";
			mes "�^���[�ɕ��������Ă���";
			mes "�܂�����قǌo�߂��Ă��Ȃ��Ƃ����̂�";
			mes "�ǂ�ǂ�̂̎���Y��Ă���c�c�B";
			mes "�����Ɩ�������ۂ���r�t���X�g��";
			mes "�����ӎu��";
			mes "���ɉe����^���Ă���񂾂낤�B";
			next;
			mes "[�ǂ̋L�^2]";
			mes "���̂܂܂ł͎����̖��O�܂�";
			mes "�Y��Ă��܂��̂ł͖�������";
			mes "�s���ɂȂ�c�c�B";
			close;
		}
		mes "�]�ǂ����菑���Ŗ��ߐs������Ă���B";
		mes "�@�ꕔ���e���ǂݎ�ꂻ�����]";
		next;
		if(select("�ǂ�","�ǂ܂Ȃ�") == 2) {
			mes "�]�ǂ܂��ɂ��̏����ɂ����]";
			close;
		}
		mes "�]���菑����ǂ�ł݂��]";
		next;
		mes "[�ǂ̋L�^2]";
		mes "�^���[�ɕ��������Ă���";
		mes "�܂�����قǌo�߂��Ă��Ȃ��Ƃ����̂�";
		mes "�ǂ�ǂ�̂̎���Y��Ă���c�c�B";
		mes "�����Ɩ�������ۂ���r�t���X�g��";
		mes "�����ӎu��";
		mes "���ɉe����^���Ă���񂾂낤�B";
		next;
		mes "[�ǂ̋L�^2]";
		mes "���̂܂܂ł͎����̖��O�܂�";
		mes "�Y��Ă��܂��̂ł͖�������";
		mes "�s���ɂȂ�c�c�B";
		set ECL_9QUE_sub,ECL_9QUE_sub | 0x2;
		//setquest 1219;
		//compquest 1219;
		close;
	}
	if(ECL_9QUE == 5) {
		mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
		mes "�@������x�ǂ�ł݂悤���]";
		next;
		if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
			mes "�]���̏����ɂ����]";
			close;
		}
		mes "[�ǂ̋L�^2]";
		mes "�^���[�ɕ��������Ă���";
		mes "�܂�����قǌo�߂��Ă��Ȃ��Ƃ����̂�";
		mes "�ǂ�ǂ�̂̎���Y��Ă���c�c�B";
		mes "�����Ɩ�������ۂ���r�t���X�g��";
		mes "�����ӎu��";
		mes "���ɉe����^���Ă���񂾂낤�B";
		next;
		mes "[�ǂ̋L�^2]";
		mes "���̂܂܂ł͎����̖��O�܂�";
		mes "�Y��Ă��܂��̂ł͖�������";
		mes "�s���ɂȂ�c�c�B";
		close;
	}
	mes "�]�ǂɗ������������Ă���]";
	close;
}

ecl_tdun04.gat,28,43,4	script	�ǂɏ����ꂽ����#3	844,{
	if(ECL_9QUE == 4) {
		if(ECL_9QUE_sub & 0x1F == 0x1F) {
			mes "�]�S�Ă̕ǂ��`�F�b�N�����B";
			mes "�@�v���t�F�b�T�[���[���̌��ɖ߂낤�]";
			close;
		}
		if(ECL_9QUE_sub & 0x4) {
			mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
			mes "�@��A4�A�c���Ă���]";
			next;
			mes "�@������x�ǂ�ł݂悤���]";
			next;
			if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
				mes "�]���̏����ɂ����]";
				close;
			}
			mes "�]���菑����ǂ�ł݂��]";
			next;
			mes "[�ǂ̋L�^3]";
			mes "���̎p���ω����Ă���I";
			mes "����I�@�畆���I�@�����c�c�I";
			mes "����͊ԈႢ�Ȃ��A���̎p���I";
			mes "�������ɕς���Ă��܂��Ƃ́A";
			mes "�ǂ����Ă���Ȃ��Ƃ��B";
			next;
			mes "[�ǂ̋L�^3]";
			mes "������r�t���X�g�̂����Ȃ̂��H";
			mes "���点���񕜂Ƃ��Ď���";
			mes "���̂悤�Ȏ􂢂��������̂��H";
			mes "�[������ɗ������܂܁H";
			mes "����Ȃ��Ƃ͂��肦�Ȃ��c�c�B";
			mes "�܂�������Ȃ��Ƃ��I";
			close;
		}
		mes "�]�ǂ����菑���Ŗ��ߐs������Ă���B";
		mes "�@�ꕔ���e���ǂݎ�ꂻ�����]";
		next;
		if(select("�ǂ�","�ǂ܂Ȃ�") == 2) {
			mes "�]�ǂ܂��ɂ��̏����ɂ����]";
			close;
		}
		mes "�]���菑����ǂ�ł݂��]";
		next;
		mes "[�ǂ̋L�^3]";
		mes "���̎p���ω����Ă���I";
		mes "����I�@�畆���I�@�����c�c�I";
		mes "����͊ԈႢ�Ȃ��A���̎p���I";
		mes "�������ɕς���Ă��܂��Ƃ́A";
		mes "�ǂ����Ă���Ȃ��Ƃ��B";
		next;
		mes "[�ǂ̋L�^3]";
		mes "������r�t���X�g�̂����Ȃ̂��H";
		mes "���点���񕜂Ƃ��Ď���";
		mes "���̂悤�Ȏ􂢂��������̂��H";
		mes "�[������ɗ������܂܁H";
		mes "����Ȃ��Ƃ͂��肦�Ȃ��c�c�B";
		mes "�܂�������Ȃ��Ƃ��I";
		set ECL_9QUE_sub,ECL_9QUE_sub | 0x4;
		//setquest 1220;
		//compquest 1220;
		close;
	}
	if(ECL_9QUE == 5) {
		mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
		mes "�@������x�ǂ�ł݂悤���]";
		next;
		if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
			mes "�]���̏����ɂ����]";
			close;
		}
		mes "[�ǂ̋L�^3]";
		mes "���̎p���ω����Ă���I";
		mes "����I�@�畆���I�@�����c�c�I";
		mes "����͊ԈႢ�Ȃ��A���̎p���I";
		mes "�������ɕς���Ă��܂��Ƃ́A";
		mes "�ǂ����Ă���Ȃ��Ƃ��B";
		next;
		mes "[�ǂ̋L�^3]";
		mes "������r�t���X�g�̂����Ȃ̂��H";
		mes "���点���񕜂Ƃ��Ď���";
		mes "���̂悤�Ȏ􂢂��������̂��H";
		mes "�[������ɗ������܂܁H";
		mes "����Ȃ��Ƃ͂��肦�Ȃ��c�c�B";
		mes "�܂�������Ȃ��Ƃ��I";
		close;
	}
	mes "�]�ǂɗ������������Ă���]";
	close;
}

ecl_tdun04.gat,38,37,4	script	�ǂɏ����ꂽ����#4	844,{
	if(ECL_9QUE == 4) {
		if(ECL_9QUE_sub & 0x1F == 0x1F) {
			mes "�]�S�Ă̕ǂ��`�F�b�N�����B";
			mes "�@�v���t�F�b�T�[���[���̌��ɖ߂낤�]";
			close;
		}
		if(ECL_9QUE_sub & 0x8) {
			mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
			mes "�@��A4�A�c���Ă���]";
			next;
			mes "�@������x�ǂ�ł݂悤���]";
			next;
			if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
				mes "�]���̏����ɂ����]";
				close;
			}
			mes "[�ǂ̋L�^4]";
			mes "�r�t���X�g�̓����L�ё����Ă���B";
			mes "�o�J�ȁI�@����Ȃ��Ƃ͂��肦��c�c�B";
			mes "�����^���[�̍����𒴂��Ă���I";
			mes "�ǂ��������ƂȂ񂾁B";
			next;
			mes "[�ǂ̋L�^4]";
			mes "����ɂ��Ȃ������ޏ���";
			mes "�����̃��b�Z�[�W�Ȃ̂��낤���B";
			mes "�܂���䂪�������B";
			close;
		}
		mes "�]�ǂ����菑���Ŗ��ߐs������Ă���B";
		mes "�@�ꕔ���e���ǂݎ�ꂻ�����]";
		next;
		if(select("�ǂ�","�ǂ܂Ȃ�") == 2) {
			mes "�]�ǂ܂��ɂ��̏����ɂ����]";
			close;
		}
		mes "�]���菑����ǂ�ł݂��]";
		next;
		mes "[�ǂ̋L�^4]";
		mes "�r�t���X�g�̓����L�ё����Ă���B";
		mes "�o�J�ȁI�@����Ȃ��Ƃ͂��肦��c�c�B";
		mes "�����^���[�̍����𒴂��Ă���I";
		mes "�ǂ��������ƂȂ񂾁B";
		next;
		mes "[�ǂ̋L�^4]";
		mes "����ɂ��Ȃ������ޏ���";
		mes "�����̃��b�Z�[�W�Ȃ̂��낤���B";
		mes "�܂���䂪�������B";
		set ECL_9QUE_sub,ECL_9QUE_sub | 0x8;
		//setquest 1221;
		//compquest 1221;
		close;
	}
	if(ECL_9QUE == 5) {
		mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
		mes "�@������x�ǂ�ł݂悤���]";
		next;
		if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
			mes "�]���̏����ɂ����]";
			close;
		}
		mes "[�ǂ̋L�^4]";
		mes "�r�t���X�g�̓����L�ё����Ă���B";
		mes "�o�J�ȁI�@����Ȃ��Ƃ͂��肦��c�c�B";
		mes "�����^���[�̍����𒴂��Ă���I";
		mes "�ǂ��������ƂȂ񂾁B";
		next;
		mes "[�ǂ̋L�^4]";
		mes "����ɂ��Ȃ������ޏ���";
		mes "�����̃��b�Z�[�W�Ȃ̂��낤���B";
		mes "�܂���䂪�������B";
		close;
	}
	mes "�]�ǂɗ������������Ă���]";
	close;
}

ecl_tdun04.gat,24,31,4	script	�ǂɏ����ꂽ����#5	844,{
	if(ECL_9QUE == 4) {
		if(ECL_9QUE_sub & 0x1F == 0x1F) {
			mes "�]�S�Ă̕ǂ��`�F�b�N�����B";
			mes "�@�v���t�F�b�T�[���[���̌��ɖ߂낤�]";
			close;
		}
		if(ECL_9QUE_sub & 0x10) {
			mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
			mes "�@��A4�A�c���Ă���]";
			next;
			mes "�@������x�ǂ�ł݂悤���]";
			next;
			if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
				mes "�]���̏����ɂ����]";
				close;
			}
			mes "[�ǂ̋L�^5]";
			mes "�ʖڂ��c�c�B";
			mes "���ɔ�Q���󂯂�̂�";
			mes "���ȊO�l�����Ȃ��c�c�B";
			mes "�����ǂ����ŒN����";
			mes "�����Ă���C������B";
			next;
			mes "[�ǂ̋L�^5]";
			mes "���̂܂ܖق���";
			mes "�����킯�ɂ͂����Ȃ��B";
			mes "�����X�^�[���c�c�B";
			mes "��������Ă���郂���X�^�[��";
			mes "���Ȃ���΁B";
			mes "�����ƁA�����ƁB��C�ł������I";
			close;
		}
		mes "�v���t�F�b�T�[���[���̋L�^���ǂ�";
		mes "���߂Ă���B";
		mes "�ꕔ���e��ǂݎ�ꂻ�����B";
		next;
		if(select("�ǂ�","�ǂ܂Ȃ�") == 2) {
			mes "�]�ǂ܂��ɂ��̏����ɂ����]";
			close;
		}
		mes "�L�^��ǂނ��Ƃɂ���B";
		next;
		mes "[�ǂ̋L�^5]";
		mes "�ʖڂ��c�c�B";
		mes "���ɔ�Q���󂯂�̂�";
		mes "���ȊO�l�����Ȃ��c�c�B";
		mes "�����ǂ����ŒN����";
		mes "�����Ă���C������B";
		next;
		mes "[�ǂ̋L�^5]";
		mes "���̂܂ܖق���";
		mes "�����킯�ɂ͂����Ȃ��B";
		mes "�����X�^�[���c�c�B";
		mes "��������Ă���郂���X�^�[��";
		mes "���Ȃ���΁B";
		mes "�����ƁA�����ƁB��C�ł������I";
		set ECL_9QUE_sub,ECL_9QUE_sub | 0x10;
		//setquest 1222;
		//compquest 1222;
		close;
	}
	if(ECL_9QUE == 5) {
		mes "�]���̕ǂ̉��菑���͈�x�ǂ񂾁B";
		mes "�@������x�ǂ�ł݂悤���]";
		next;
		if(select("�ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
			mes "�]���̏����ɂ����]";
			close;
		}
		mes "[�ǂ̋L�^5]";
		mes "�ʖڂ��c�c�B";
		mes "���ɔ�Q���󂯂�̂�";
		mes "���ȊO�l�����Ȃ��c�c�B";
		mes "�����ǂ����ŒN����";
		mes "�����Ă���C������B";
		next;
		mes "[�ǂ̋L�^5]";
		mes "���̂܂ܖق���";
		mes "�����킯�ɂ͂����Ȃ��B";
		mes "�����X�^�[���c�c�B";
		mes "��������Ă���郂���X�^�[��";
		mes "���Ȃ���΁B";
		mes "�����ƁA�����ƁB��C�ł������I";
		close;
	}
	mes "�]�ǂɗ������������Ă���]";
	close;
}

ecl_tdun01.gat,27,80,5	script	���L�J�G��3��#worm	614,{
	if(ECL_9QUE == 6) {
		mes "�]�J�G��������B";
		mes "�@�v���t�F�b�T�[���[���̓�����";
		mes "�@�J�G���̂悤���B";
		mes "�@�b�𕷂��Ă݂悤�]";
		close2;
		warp "ecl_tdun01a.gat",29,80;
		end;
	}
	if(ECL_9QUE >= 7) {
		mes "�]������x";
		mes "�@�J�G���̘b�𕷂��܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]��߂Ă������]";
			close;
		}
		mes "�]�b�𕷂����Ƃɂ����]";
		close2;
		warp "ecl_tdun01a.gat",29,80;
		end;
	}
	mes "[���L�J�G��3��]";
	mes "�v���t�F�b�T�[���[����";
	mes "���������ɓ����܂����B";
	mes "�@���������Ǝ�������";
	mes "���蓊�����ł��B";
	close;
}

ecl_tdun01a.gat,27,80,5	script	���L�J�G��3��#copyworm	614,{
	if(ECL_9QUE == 6) {
		mes "[���L�J�G��3��]";
		mes "�v���t�F�b�T�[���[����";
		mes "���������ɓ����܂����B";
		mes "�@���������Ǝ�������";
		mes "���蓊�����ł��B";
		next;
		menu "���L�J�G���ł����H",-;
		mes "[���L�J�G��3��]";
		mes "�؂ō��ꂽ�^���p�̃J�G���ł��B";
		mes "�v���t�F�b�T�[���[���̍�i�ł��B";
		mes "�Ɍ��̎₵�������̂悤�Ȕ����i��";
		mes "�a����������ł��B";
		mes "�ӊO�ȍ˔\�ł��B";
		next;
		menu "�^�����e�𕷂����Ă�������",-;
		mes "[���L�J�G��3��]";
		mes "�킩��܂����B�������Ă����܂��ˁB";
		mes "�v���t�F�b�T�[���[���̐���";
		mes "�^�����Ȃ��Ƃ����Ȃ�����";
		mes "�܂��͂̂ǂ𒲐����Ȃ��Ɓc�c";
		mes "�A�[�A�A�[�c�c���[�B";
		next;
		mes "[3�����������Ă������L���e]";
		mes "�c�c���̕��́A���̕���";
		mes "�r�t���X�g������Ă����񂾁I";
		mes "�����͎��g���Њd����͂�����";
		mes "�������Ȃ��Ƃ����Ȃ��ƌ����Ă�����I";
		next;
		mes "[3�����������Ă������L���e]";
		mes "���̕����A���̕����I�������`�B";
		mes "�����c�c���̕����v���o���Ȃ��c�c";
		next;
		mes "[���L�J�G��3��]";
		mes "�ۑ����ꂽ�L�^�͂����܂łł��B";
		set ECL_9QUE,7;
		chgquest 1223,1224;
		close2;
		warp "ecl_tdun01.gat",29,80;
		end;
	}
	if(ECL_9QUE >= 7) {
		mes "[���L�J�G��3��]";
		mes "���L���e���C�ɂȂ�܂����B";
		mes "������x�����܂����H";
		while(1) {
			next;
			switch(select("���̓��L�J�G���̎��𕷂�","���L���e��������x����","���̓��e������������","�����p�͖���")) {
			case 1:
				mes "[���L�J�G��3��]";
				mes "�����̓��L�J�G��6����";
				mes "����������ꂽ���";
				mes "�����ɓ������Ă��܂����B";
				break;
			case 2:
				mes "[���L�J�G��3��]";
				mes "�킩��܂����B�������Ă����܂��ˁB";
				mes "�v���t�F�b�T�[���[���̐���";
				mes "�^�����Ȃ��Ƃ����Ȃ�����";
				mes "�܂��͂̂ǂ𒲐����Ȃ��Ɓc�c";
				mes "�A�[�A�A�[�c�c���[�B";
				next;
				mes "[3�����������Ă������L���e]";
				mes "�c�c���̕��́A���̕���";
				mes "�r�t���X�g������Ă����񂾁I";
				mes "�����͎��g���Њd����͂�����";
				mes "�������Ȃ��Ƃ����Ȃ��ƌ����Ă�����I";
				next;
				mes "[3�����������Ă������L���e]";
				mes "���̕����A���̕����I�������`�B";
				mes "�����c�c���̕����v���o���Ȃ��c�c";
				next;
				mes "[���L�J�G��3��]";
				mes "�ۑ����ꂽ�L�^�͂����܂łł��B";
				break;
			case 3:
				mes "[���L�J�G��3��]";
				mes "�{���͂����Ƃ���܂����B";
				mes "�����A�L���͎��̔R���ɕۑ�������";
				mes "���̏��͂����̒��ɏ����܂����B";
				mes "�����čs�����߂Ȃ̂�";
				mes "�ǂ����邱�Ƃ��ł��܂���B";
				emotion 19,"";
				break;
			case 4:
				mes "[���L�J�G��3��]";
				mes "�����ł����B";
				close2;
				warp "ecl_tdun01.gat",29,80;
				end;
			}
		}
	}
}

ecl_tdun01.gat,23,79,4	script	���L�J�G��6��#worm	614,{
	if(ECL_9QUE == 7) {
		mes "�]�J�G��������B";
		mes "�@�v���t�F�b�T�[���[���̓�����";
		mes "�@�J�G���̂悤���B";
		mes "�@�b�𕷂��Ă݂悤�]";
		close2;
		warp "ecl_tdun01a.gat",29,80;
		end;
	}
	if(ECL_9QUE >= 8) {
		mes "�]������x";
		mes "�@�J�G���̘b�𕷂��܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]��߂Ă������]";
			close;
		}
		mes "�]�b�𕷂����Ƃɂ����]";
		close2;
		warp "ecl_tdun01a.gat",29,80;
		end;
	}
	mes "[���L�J�G��6��]";
	mes "�v���t�F�b�T�[���[����";
	mes "���������ɓ������₪�����I";
	mes "�����X�^�[�����邱��ȏꏊ�ɁI";
	close;
}

ecl_tdun01a.gat,23,79,4	script	���L�J�G��6��#copyworm	614,{
	if(ECL_9QUE == 7) {
		if(checkquest(1225)) {
			if(checkquest(1225) & 0x4) {
				mes "[���L�J�G��6��]";
				mes "�����B";
				mes "^FF0000���@�b�T�[�E���q�e����^000000��15�C";
				mes "�ގ����Ă��Ă��ꂽ���B";
				mes "����ł���ƈ��S�ł���B";
				mes "�񑩂����ʂ���L�𕷂����Ă�낤�I";
				next;
				mes "[���L�J�G��6��]";
				mes "�v���t�F�b�T�[���[���̐���";
				mes "�^�����Ȃ��Ƃ����Ȃ�����";
				mes "�܂��͂̂ǂ𒲐����Ȃ��Ɓc�c";
				mes "�ӂ�c�c�ӂ�ӂ�I";
				next;
				mes "[6�����������Ă������L���e]";
				mes "���̕��͂�����ꂽ�B";
				mes "�r�t���X�g��Q���������";
				mes "�����Ɏc�肻�̗l�q��������Ȃ����ƁB";
				mes "�����ċN���Ă��܂�ʂ悤�Ď�����ƁB";
				mes "�r���ŋN�����玄�̐ӔC���ƁB";
				next;
				mes "[6�����������Ă������L���e]";
				mes "���̌��t�����������Ă���";
				mes "�������łɐ��\�N�A";
				mes "�o���Ă��܂����c�c�B";
				next;
				mes "[6�����������Ă������L���e]";
				mes "�c�c�B";
				mes "�c�c�c�c�B";
				mes "�������A�{�肪�N���Ă���I";
				mes "�C���C������!!!";
				mes "���̎�����������Ȏ���";
				mes "�����Ă��Ȃ��Ƃ����Ȃ��񂾁I";
				next;
				mes "[6�����������Ă������L���e]";
				mes "�����I�@�N�����Ă�肽���I";
				mes "�������c�c�I�@�����c�����!!";
				mes "�N�����Ă��c�c�N�����āc�c";
				mes "��c�c�N�����Ăǂ�����񂾁H";
				mes "��A���������N���N�����񂾁H";
				next;
				mes "[6�����������Ă������L���e]";
				mes "��������́B�J�G���c�c";
				mes "�������N�����̂��H�@����c�c";
				mes "�����c�c�����c�c�I";
				mes "��������!!!";
				mes "�Ƃ肠�������̃J�G����";
				mes "�ǂ��������ɓ������Ă��I";
				next;
				mes "[���L�J�G��6��]";
				mes "���L�͂����܂ł��B";
				mes "�����āA���������܂�";
				mes "������΂��Ă��܂����񂾁B";
				next;
				mes "[���L�J�G��6��]";
				mes "���̓��L�J�G���͂����炭";
				mes "�^���[�̊O���̂ǂ����ɂ��邾�낤�B";
				mes "�N���������Ă������肵�Ă��Ȃ����";
				mes "���������鎖���ł��邾�낤�B";
				set ECL_9QUE,8;
				chgquest 1225,1226;
				close2;
				warp "ecl_tdun01.gat",29,80;
				end;
			}
			mes "[���L�J�G��6��]";
			mes "^FF0000���@�b�T�[�E���q�e����^000000��15�C";
			mes "�ގ����ė�����A";
			mes "�v���t�F�b�T�[���[���̓��L��";
			mes "�������Ă���B";
			close2;
			warp "ecl_tdun01.gat",29,80;
			end;
		}
		mes "[���L�J�G��6��]";
		mes "�������O�́B���̗p���B";
		next;
		mes "[���L�J�G��6��]";
		mes "�Ȃ񂾂ƁH";
		mes "�v���t�F�b�T�[���[����";
		mes "����T���Ă����H�@�΂��ȁB";
		mes "�K�v�Ȃ��Ȃ�������̂Ă��񂾂낤�I";
		mes "�����������蓊����΂����掄���I";
		next;
		menu "����͖��������ł���",-;
		mes "[���L�J�G��6��]";
		mes "����̖�肶��Ȃ���!!!";
		mes "�N���̂Ă����";
		mes "���̋C�����𗝉��ł��邾�낤�ˁI";
		mes "�ŁA���̗p�Ȃ񂾂��H";
		next;
		menu "���L�̓��e�𕷂����ė~����",-;
		mes "[���L�J�G��6��]";
		mes "������H";
		mes "���l�̓��L�ɂȂ�����������񂾁H";
		next;
		mes "[���L�J�G��6��]";
		mes "�������B�������悤�B";
		mes "���̗��݂𕷂��Ă��ꂽ��";
		mes "���L�𕷂����Ă����邺�B";
		next;
		mes "[���L�J�G��6��]";
		mes "���͈�����Ă��鎖������B";
		mes "������܂������̂����Ȃ񂾂��A";
		mes "�v���t�F�b�T�[���[�����΂�܂���";
		mes "�����X�^�[������";
		mes "���Ɋ��݂��Ă���񂾁B";
		next;
		mes "[���L�J�G��6��]";
		mes "���ł�^FF0000���@�b�T�[�E���q�e����^000000�Ƃ���";
		mes "�����X�^�[��";
		mes "�悭����Ă��č����Ă�񂾂�B";
		next;
		mes "[���L�J�G��6��]";
		mes "���݂͂킩��ȁH";
		mes "�������ގ����Ă��Ăق����񂾁B";
		mes "^FF0000���@�b�T�[�E���q�e����^000000��15�C";
		mes "�ގ����ė��Ă��ꂽ��";
		mes "�C�����悭���L�𕷂����Ă���B";
		next;
		if(select("�ގ�����`��","�f��") == 1) {
			mes "[���L�J�G��6��]";
			mes "�ӂ�B���������B";
			mes "����Ȃ�A�������L�Ɋւ��Ă�";
			mes "�ꌾ������Ȃ��l�ɂ����Ă��炤�B";
			close2;
			warp "ecl_tdun01.gat",29,80;
			end;
		}
		mes "[���L�J�G��6��]";
		mes "�您���A���Ⴀ�����s���ė��Ă���B";
		mes "�������Ă����ˁH";
		mes "�L���͎��̔R����";
		mes "�ۑ�����Ă���Ƃ��������B";
		mes "�����I�@�}���őގ����Ă��Ă���I";
		chgquest 1224,1225;
		close2;
		warp "ecl_tdun01.gat",29,80;
		end;
	}
	if(ECL_9QUE >= 8) {
		mes "[���L�J�G��6��]";
		mes "���L�̓��e���܂������������H";
		mes "�����X�^�[��ގ����Ă��ꂽ����ȁI";
		mes "������ł��������Ă���B";
		next;
		switch(select("���̓��L�J�G���̎��𕷂�","���L���e��������x����")) {
		case 1:
			mes "[���L�J�G��6��]";
			mes "���̓��L�J�G���͂����炭";
			mes "�^���[�̊O���̂ǂ����ɂ��邾�낤�B";
			mes "�N���������Ă������肵�Ă��Ȃ���΁A";
			mes "���������鎖���ł��邾�낤�B";
			close;
		case 2:
			mes "[���L�J�G��6��]";
			mes "�悧���A�C���Ă����B";
			mes "�v���t�F�b�T�[���[���̐���";
			mes "�^�����Ȃ��Ƃ����Ȃ�����";
			mes "�܂��͂̂ǂ𒲐����Ȃ��Ɓc�c";
			mes "�ӂ�c�c�ӂ�ӂ�I";
			next;
			mes "[6�����������Ă������L���e]";
			mes "���̕��͂�����ꂽ�B";
			mes "�r�t���X�g��Q���������";
			mes "�����Ɏc�肻�̗l�q��������Ȃ����ƁB";
			mes "�����ċN���Ă��܂�ʂ悤�Ď�����ƁB";
			mes "�r���ŋN�����玄�̐ӔC���ƁB";
			next;
			mes "[6�����������Ă������L���e]";
			mes "���̌��t�����������Ă���";
			mes "�������łɐ��\�N�A";
			mes "�o���Ă��܂����c�c�B";
			next;
			mes "[6�����������Ă������L���e]";
			mes "�c�c�B";
			mes "�c�c�c�c�B";
			mes "�������A�{�肪�N���Ă���I";
			mes "�C���C������!!!";
			mes "���̎�����������Ȏ���";
			mes "�����Ă��Ȃ��Ƃ����Ȃ��񂾁I";
			next;
			mes "[6�����������Ă������L���e]";
			mes "�����I�N�����Ă�肽���I";
			mes "�������c�c�I�@�����c�����!!";
			mes "�N�����Ă��c�c�N�����āc�c";
			mes "��c�c�N�����Ăǂ�����񂾁H";
			mes "��A���������N���N�����񂾁H";
			next;
			mes "[6�����������Ă������L���e]";
			mes "��������́B�J�G���c�c";
			mes "�������N�����̂��H����c�c";
			mes "�����c�c�����c�c�I";
			mes "��������!!!";
			mes "�Ƃ肠�������̃J�G����";
			mes "�ǂ��������ɓ������Ă��I";
			next;
			mes "[���L�J�G��6��]";
			mes "���L�͂����܂ł��B";
			mes "�����āA���������܂�";
			mes "�����Ƃ΂��Ă��܂����񂾁B";
			close2;
			warp "ecl_tdun01.gat",29,80;
			end;
		}
	}
	mes "[���L�J�G��6��]";
	mes "�������O�́B���̗p���B";
	mes "���͍������Ă���񂾁B";
	mes "�A��A��B";
	close2;
	warp "ecl_tdun01.gat",29,80;
	end;
}

ecl_fild01.gat,173,95,7	script	���L�J�G��30��#worm	614,{
	if(ECL_9QUE == 8) {
		if(checkquest(1227)) {
			if(countitem(6542) < 10) {
				mes "[���L�J�G��30��]";
				mes "^FF0000���͗l�L�m�R^000000��10��";
				mes "�W�߂Ă��Ă��������B";
				mes "�Ԃ��炫�n�߂���n�ɂ���";
				mes "�y�^������";
				mes "��ɓ���邱�Ƃ��ł��܂��B";
				close;
			}
			mes "[���L�J�G��30��]";
			mes "^FF0000���͗l�L�m�R^000000��10��";
			mes "�W�߂Ă��ꂽ��ł��ˁB";
			mes "���肪�Ƃ��������܂��B";
			mes "�܂��͎��Â��s���܂��̂�";
			mes "���̂܂܁A�����҂��ĉ������B";
			next;
			mes "[���L�J�G��30��]";
			mes "�]���݂���";
			mes "�@�ׂ��ׂ��]";
			next;
			mes "[���L�J�G��30��]";
			mes "�����A�̂̒��q���悭�Ȃ�܂����B";
			mes "���S�ɂ悭�Ȃ�܂����B";
			mes "�S���Ȃ���܂����B";
			mes "����Ȃǂ��Ă��Ȃ��������̂悤�ł��B";
			mes "�������A";
			next;
			mes "[���L�J�G��30��]";
			mes "����Ȃǂ��Ă��܂���ł����B";
			next;
			mes "[���L�J�G��30��]";
			mes "���Ƃ��Ɖ���Ȃǂ��Ă��Ȃ������̂�";
			mes "���Â����Ă��܂���ˁB";
			mes "���͗l�L�m�R�Ȃ�Ė���Ă��܂���B";
			next;
			mes "[���L�J�G��30��]";
			mes "�ȁ[�񂾁A�S���������������̂��B";
			mes "�����A�悩�����悩�����B";
			mes "�������܂����B";
			next;
			menu "�h�݂͂ɂ��ĕ��蓊����",-,"�v��������R���΂�",-;
			mes "[���L�J�G��30��]";
			mes "�����A�҂��Ă��������B";
			mes "��k�ł��A��k�ł��B";
			mes "����Ȃɓ{��Ȃ��ł��������B";
			mes "�����ɓ��L�̓��e���Đ����܂��̂�";
			mes "������Ƃ��܂����������B";
			next;
			mes "[���L�J�G��30��]";
			mes "�v���t�F�b�T�[���[���̐���";
			mes "�^�����Ȃ��Ƃ����Ȃ��̂ŁA";
			mes "�܂��͂̂ǂ𒲐����Ȃ��Ɓc�c";
			mes "����c�c����[�c�c�񂪂��I";
			next;
			mes "[30�����������Ă������L���e]";
			mes "�������I�@��������!!!";
			mes "���̓��ɂ͐����閧���B����Ă����I";
			mes "�����A�������B�{���ɋ������I";
			mes "���S�N�ɂ����Ď���Ă����閧��";
			mes "���͉����Ă��܂����I";
			mes "�������Ă��܂����I";
			next;
			mes "[30�����������Ă������L���e]";
			mes "�����A���܂�ɂ��Ռ��I�ȓ��e��";
			mes "�S���^�����ɖY��Ă��܂����I";
			next;
			mes "[30�����������Ă������L���e]";
			mes "���̃J�G���I";
			mes "�C���C�����ė�������";
			mes "�܂��������Ⴄ�I�@������";
			next;
			mes "�]����ȏ�̓��L�W�߂�";
			mes "�@�Ӗ����Ȃ��������B";
			mes "�@�v���t�F�b�T�[���[����";
			mes "�@�񍐂ɂ������]";
			delitem 6542,10;
			set ECL_9QUE,9;
			chgquest 1227,1228;
			close;
		}
		mes "[���L�J�G��30��]";
		mes "���Ă̒ʂ莄��";
		mes "��ꂽ���L�J�G���ł��B";
		mes "�v���t�F�b�T�[���[����";
		mes "���������܂œ����܂����B";
		mes "���Ɉ������Ƃ����Ă��Ȃ��̂ɁI";
		next;
		menu "���v�ł���",-;
		mes "[���L�J�G��30��]";
		mes "���v����Ȃ��ł��B";
		mes "���������������C���ł܂���B";
		mes "�����ŔR�����s����̂�҂����ł��B";
		next;
		menu "�������킸���L�̓��e�𕷂����ĉ�����",-;
		mes "[���L�J�G��30��]";
		mes "�����o���ꂽ���ɉ�������܂����B";
		mes "���������ł��B";
		mes "���L��ǂޗ͂��o���܂���B";
		mes "�ǂ����悤������܂���B";
		next;
		mes "[���L�J�G��30��]";
		mes "�����A���������Ȃ���";
		mes "���Â̂��߂ɉԂ��炫�n�߂���n��";
		mes "^FF0000���͗l�L�m�R^000000��10��";
		mes "�W�߂ė��Ă����̂ł����";
		mes "���C�ɂȂ邩������܂���B";
		next;
		if(select("�W�߂Ă���","����������L���e�𕷂����Ă���") == 2) {
			mes "[���L�J�G��30��]";
			mes "�����ł����c�c�B";
			mes "����ł͎������Ȃ���";
			mes "�������Ă�������̂�";
			mes "���ѐ������Ȃ������ł��ˁB";
			next;
			mes "[���L�J�G��30��]";
			mes "���킠����������";
			mes "��������������";
			mes "����������";
			mes "��������";
			mes "������";
			close;
		}
		mes "[���L�J�G��30��]";
		mes "^FF0000���͗l�L�m�R^000000��";
		mes "�Ԃ��炫�n�߂���n�ɂ���";
		mes "�y�^�������ɓ���邱�Ƃ��ł��܂��B";
		next;
		mes "[���L�J�G��30��]";
		mes "�������Ă��܂���ˁH";
		mes "���̔R���͋L�����Ƃ������ƁB";
		mes "�߂肪�x���Ǝ��̋���������";
		mes "�����Ȃ��Ȃ�܂���B";
		next;
		mes "^FF0000�]���͗l�L�m�R�́A���̃N�G�X�g��";
		mes "�@�󂯂Ă����ԂőΏۃ����X�^�[��";
		mes "�@�������邱�ƂŎ����I�ɓ��肵�܂��B";
		mes "�@�����A�C�e���̏d�ʂƎ�ސ���";
		mes "�@�\���ȗ]�T��������";
		mes "�@�������Ă��������]^000000";
		next;
		mes "^FF0000�]�܂��A�p�[�e�B�[�����o�[��";
		mes "�@�Ώۃ����X�^�[�𓢔������ꍇ�ł�";
		mes "�@���͗l�L�m�R����肷�邱�Ƃ�";
		mes "�@�ł��܂��]^000000";
		chgquest 1226,1227;
		close;
	}
	if(ECL_9QUE >= 9) {
		mes "[���L�J�G��30��]";
		mes "�܂������̂ł����B";
		mes "������x���L�̓��e�𕷂��܂����H";
		next;
		switch(select("���̓��L�J�G���̎��𕷂�","���L���e��������x����")) {
		case 1:
			mes "[���L�J�G��30��]";
			mes "����ȏ�c���Ă���J�G����";
			mes "���Ȃ��Ǝv���܂��B";
			mes "�����X�^�[�ɐH�ׂ�ꂽ���A";
			mes "������ꂽ���ɉ��Ă��܂��܂����B";
			close;
		case 2:
			mes "[���L�J�G��30��]";
			mes "�����ɓ��L�̓��e���Đ����܂��̂�";
			mes "������Ƃ��܂����������B";
			next;
			mes "[���L�J�G��30��]";
			mes "�v���t�F�b�T�[���[���̐���";
			mes "�^�����Ȃ��Ƃ����Ȃ��̂ŁA";
			mes "�܂��͂̂ǂ𒲐����Ȃ��Ɓc�c";
			mes "����c�c����[�c�c�񂪂��I";
			next;
			mes "[30�����������Ă������L���e]";
			mes "�������I�@��������!!!";
			mes "���̓��ɂ͐����閧���B����Ă����I";
			mes "�����A�������B�{���ɋ������I";
			mes "���S�N�ɂ����Ď���Ă����閧��";
			mes "���͉����Ă��܂����I";
			mes "�������Ă��܂����I";
			next;
			mes "[30�����������Ă������L���e]";
			mes "�����A���܂�ɂ��Ռ��I�ȓ��e��";
			mes "�S���^�����ɖY��Ă��܂����I";
			next;
			mes "[30�����������Ă������L���e]";
			mes "���̃J�G���I";
			mes "�C���C�����ė�������";
			mes "�܂��������Ⴄ�I�@������";
			next;
			mes "�]����ȏ�̓��L�W�߂�";
			mes "�@�Ӗ����Ȃ��������B";
			mes "�@�v���t�F�b�T�[���[����";
			mes "�@�񍐂ɂ������]";
			close;
		}
	}
	mes "[���L�J�G��30��]";
	mes "���Ă̒ʂ莄��";
	mes "��ꂽ���L�J�G���ł��B";
	mes "�v���t�F�b�T�[���[����";
	mes "���������܂œ����܂����B";
	mes "���Ɉ������Ƃ����Ă��Ȃ��̂ɁI";
	close;
}
