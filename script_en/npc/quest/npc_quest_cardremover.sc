//= Auriga Script ==============================================================
// Ragnarok Online Card Remover NPC Script	by refis
//==============================================================================

izlude.gat,116,129,4	script	�c�[�j��#01	555,{
	function PowerOfDHA {
		for(set '@i,0; '@i<20; set '@i,'@i+1){
			if('@i < 10)
				set '@progress1$,'@progress1$+ (DHA_POWER > '@i? "��": "��");
			else
				set '@progress2$,'@progress2$+ (DHA_POWER > '@i? "��": "��");
		}
		mes "DHA�p���[:(" +DHA_POWER+ " / 20)";
		mes '@progress1$;
		mes '@progress2$;
	}

	if(@talk == 0 && DHA_POWER == 0) {
		emotion 16;
		mes "[�c�[�j��]";
		mes "�����������j���c�c";
		mes "�`���҂̂����ɗ��������̂�";
		mes "�͂��o�Ȃ��j���c�c";
		next;
		mes "[�c�[�j��]";
		mes "�ł��O�����ȃl�R��";
		mes "�J���J���Ȃ񂩐H�ׂȂ��j���c�c";
		mes "�͂��c�c^FF0000���I�l�R��(�}�O��)^000000";
		mes "����͔������������j���`�B";
		next;
		if(select("����������","��������") == 2) {
			emotion 28;
			mes "[�c�[�j��]";
			mes "�������󂫉߂���";
			mes "�쐶���ڊo�߂Ȃ��j���c�c";
			close;
		}
		mes "[�c�[�j��]";
		mes "�͂��A�`���҂���j���I";
		mes "�����ɗ��j��!!";
		next;
		menu "�����o����́H",-;
		mes "[�c�[�j��]";
		mes "�����h��ɑ��������J�[�h�𕪗�����";
		mes "���茳�ɖ߂����Ƃ��ł���j���I";
		mes "�������A�����h��͂��̂܂�";
		mes "�c��j��!!";
		next;
		mes "[�c�[�j��]";
		mes "�����A�J�[�h�𕪗�����ɂ�";
		mes "���ʂȗ́c�c�u^FF0000DHA�p���[^000000�v��";
		mes "�K�v�j���B";
		next;
		mes "[�c�[�j��]";
		mes "���ꂪ�L�x�Ɋ܂܂�Ă���";
		mes "�u^FF0000���I�l�R��(�}�O��)^000000�v";
		mes "����������΁A�����ɗ��Ă�j���I";
		mes "�����Ă�����H�ׂ����ė~�����j���B";
		set @talk,1;
		next;
	}
	mes "[�c�[�j��]";
	mes "��������j���H";
	PowerOfDHA;
	next;
	switch(select("���I�l�R��(�}�O��)��������","�J�[�h����","�����o����́H","��������")) {
	case 1:
		mes "^FF0000�]�C���t�H���[�V�����]";
		mes "�EDHA�p���[�͍ő�20�܂Œ��߂��܂��B";
		mes "�E���߂�DHA�p���[�͌��݃��O�C������";
		mes "�@�L�����N�^�[��p�ł��B";
		mes "�@���̃L�����N�^�[�Ŏg�p���鎖��";
		mes "�@�ł��܂���B";
		mes "�EDHA�p���[���g�������L�����N�^�[��";
		mes "�@���I�l�R��(�}�O��)��";
		mes "�@�^���ĉ������B";
		next;
		if(countitem(25308) < 1) {
			mes "[�c�[�j��]";
			mes "������j���I�@�����̃j���H";
			mes "���Ď����ĂȂ��j���H";
			mes "�c�c���A�C�W��������̂�";
			mes "��߂�̃j���`�`�I";
			close;
		}
		emotion 37;
		mes "[�c�[�j��]";
		mes "�{���ɂ����̃j���H";
		next;
		if(select("������","�͂�") == 1) {
			emotion 28;
			mes "[�c�[�j��]";
			mes "�����������j���[�I";
			close;
		}
		if(DHA_POWER >= 20) {	// ������
			emotion 28;
			mes "[�c�[�j��]";
			mes "���͂�����Ƃ��Ȃ���t�j��";
			mes "DHA�p���[���^���j���`�I";
			close;
		}
		if(countitem(25308) < 1) {
			mes "[�c�[�j��]";
			mes "������j���I�@�����̃j���H";
			mes "���Ď����ĂȂ��j���H";
			mes "�c�c���A�C�W��������̂�";
			mes "��߂�̃j���`�`�I";
			close;
		}
		delitem 25308,1;
		set DHA_POWER,DHA_POWER + 1;
		emotion 38;
		mes "[�c�[�j��]";
		mes "�������������~���`�`���I";
		mes "���������j���I";
		mes "�K�����j���`�I";
		next;
		mes "[�c�[�j��]";
		mes "DHA�p���[���[�U����Ă����j���I";
		PowerOfDHA;
		next;
		emotion 32;
		mes "[�c�[�j��]";
		mes "���y���l�j���B";
		mes "�J�[�h����������Ȃ�";
		mes "���ł������ăj���I";
		close;
	case 2:
		mes "[�c�[�j��]";
		mes "�������Ă���A�C�e���̒���";
		mes "�J�[�h�𕪗����������̂�";
		mes "�I�ԃj���I";
		next;
		set '@part,select(
				getequipid(1)? "^nItemID^"+getequipid(1): "",
				getequipid(2)? "^nItemID^"+getequipid(2): "",
				getequipid(3)? "^nItemID^"+getequipid(3): "",
				getequipid(4)? "^nItemID^"+getequipid(4): "",
				getequipid(5)? "^nItemID^"+getequipid(5): "",
				getequipid(6)? "^nItemID^"+getequipid(6): "",
				getequipid(7)? "^nItemID^"+getequipid(7): "",
				getequipid(8)? "^nItemID^"+getequipid(8): "",
				getequipid(9)? "^nItemID^"+getequipid(9): "",
				getequipid(10)? "^nItemID^"+getequipid(10): "",
				"����ς��߂�");
		if('@part == 11) {
			mes "[�c�[�j��]";
			mes "�܂�����j���B";
			close;
		}
		set '@max,getiteminfo(getequipid('@part),10);
		if('@max == 0) {
			emotion 1;
			mes "[�c�[�j��]";
			mes "���̃A�C�e����";
			mes "�X���b�g�͖����j����H";
			close;
		}
		set '@slot,0;
		if('@max > 1) {
			set '@slot,select(
				"�~�߂�",
				'@max>=1? "�X���b�g1": "",
				'@max>=2? "�X���b�g2": "",
				'@max>=3? "�X���b�g3": "",
				'@max>=4? "�X���b�g4": "")-2;
			if('@slot < 0) {
				mes "[�c�[�j��]";
				mes "�܂�����j���B";
				close;
			}
		}
		set '@cardid,getequipcardid('@part,'@slot);
		if('@cardid == 0) {
			emotion 1;
			mes "[�c�[�j��]";
			mes "�����ɃJ�[�h�͖����j����H";
			next;
			mes "[�c�[�j��]";
			mes "�܂�����j���B";
			close;
		}
		set '@cost,1;
		// �{�X�J�[�h��`
		setarray '@special1,4121,4123,4128,4131,4132,4134,4135,4137,4142,4143,
							4144,4145,4146,4147,4148,4168,4236,4263,4276,4302,
							4305,4318,4324,4330,4342,4352,4357,4359,4361,4363,
							4365,4367,4372,4374,4376,4386,4399,4403,4407,4408,
							4419,4425,4430,4441,4451,4456,4457,4507,4509,4520,
							4525,4526,4527,4528,4529,4534,4556,4560,4561,4562,
							4563,4564,4565,4566,4578,4580,4590,4591,4592,4601,
							4603,4625,4652;
		setarray '@special2,27007,27008,27009,27031,27032,27035,27039,27040,27055,27056,
							27057,27058,27059,27060,27061,27062,27063,27064,27065,27066,
							27067,27081,27087,27088,27089,27092,27104,27105,27113,27127,
							27128,27141,27143,27146,27228,27237,27242,27247,27248,27301,
							27321,27326,27327,27344,27345,27369,27376,27380,31003,31005;
		for(set '@i,0; '@i<getarraysize('@special1); set '@i,'@i+1) {
			if('@cardid == '@special1['@i]) {
				set '@cost,5;
				break;
			}
		}
		for(set '@i,0; '@i<getarraysize('@special2); set '@i,'@i+1) {
			if('@cardid == '@special2['@i]) {
				set '@cost,5;
				break;
			}
		}
		mes "[�c�[�j��]";
		mes "���̃J�[�h�j����c�c";
		mes "DHA�p���[[^FF0000" +'@cost+ "^000000]�ŕ����ł���j���I";
		mes "��邩�j���H";
		PowerOfDHA;
		next;
		if(select("�~�߂�","��������") == 1) {
			mes "[�c�[�j��]";
			mes "�܂�����j���B";
			close;
		}
		if(DHA_POWER < '@cost) {
			emotion 17;
			mes "[�c�[�j��]";
			mes "DHA�p���[������Ȃ��j���c�c";
			mes "���̂܂܂ł̓J�[�h�𕪗��ł��Ȃ��j���B";
			mes "���߂�Ȃ������j���c�c";
			close;
		}
		emotion 52;
		mes "[�c�[�j��]";
		mes "�܂�����j���I";
		next;
		set DHA_POWER,DHA_POWER-'@cost;
		successremovecards '@part,'@slot+1;
		misceffect 567,"";
		mes "[�c�[�j��]";
		mes "�ӂ��`";
		mes "�����d�������j���I";
		close;
	case 3:
		mes "[�c�[�j��]";
		mes "DHA�p���[�������";
		mes "�����i�ɑ��������J�[�h��";
		mes "�������Ă�����j���I";
		next;
		switch(select("DHA�p���[�H","�����i�H","�J�[�h�H","��������")) {
		case 1:
			mes "[�c�[�j��]";
			mes "�����̉h�{�������Ղ�l�܂���";
			mes "�L�̊��͌��j���B";
			mes "�K�b�`���������Ă���";
			mes "�J�[�h�𕪗�����̂�";
			mes "�������Ȃ��p���[�j���B";
			next;
			mes "[�c�[�j��]";
			mes "^FF0000���I�l�R��(�}�O��)^0000001��";
			mes "^0000FFDHA�p���[^000000��[1]���܂�j���I";
			mes "�����āA���܂���^0000FFDHA�p���[^000000��";
			mes "����āA�J�[�h�𕪗�����j���I";
			next;
			mes "^FF0000�]�C���t�H���[�V�����]";
			mes "�EDHA�p���[�͍ő�20�܂Œ��߂��܂��B";
			mes "�E���߂�DHA�p���[�͌��݃��O�C������";
			mes "�@�L�����N�^�[��p�ł��B";
			mes "�@���̃L�����N�^�[�Ŏg�p���鎖��";
			mes "�@�ł��܂���B";
			mes "�EDHA�p���[���g�������L�����N�^�[��";
			mes "�@���I�l�R��(�}�O��)��";
			mes "�@�^���ĉ������B";
			close;
		case 2:
			mes "[�c�[�j��]";
			mes "���A�������Ă��鑕���i��";
			mes "�J�[�h���������Ă��鑕���i�Ȃ�";
			mes "����ł��h��ł��A�N�Z�T���[�ł�";
			mes "OK�j���I";
			next;
			mes "[�c�[�j��]";
			mes "���������J�[�h�ƈꏏ�ɁA";
			mes "�J�[�h�𕪗����������i��";
			mes "����t�����ɂ��Ԃ�����j����I";
			mes "�����c�c��舵���Ȃ������i��";
			mes "����j���c�c�c";
			next;
			mes "^FF0000�]�C���t�H���[�V�����]";
			mes "�E�c�[�j���ɘb������������";
			mes "�@�������Ă��鑕���i��";
			mes "�@�ΏۂƂȂ�܂��B";
			mes "�E�X���b�g�̕\�L���Ȃ������i��";
			mes "�@�ΏۊO�ƂȂ�܂��B";
			mes "�E�����i�̐��B�l�A";
			mes "�@���̃X���b�g�̃J�[�h�A";
			mes "�@�G���`�����g�A�����_���I�v�V������";
			mes "�@���̏�Ԃ��ێ�����܂��B";
			close;
		case 3:
			switch(select("�����𕷂�","�K�vDHA�p���[������","��������")) {
			case 1:
				mes "[�c�[�j��]";
				mes "DHA�p���[�������";
				mes "���A�������Ă��鑕���i����";
				mes "�J�[�h�𕪗�����j���I";
				mes "���������J�[�h�͑����i�ƈꏏ��";
				mes "���Ԃ�����j����I";
				next;
				mes "[�c�[�j��]";
				mes "�����c�c��T�̃J�[�h��";
				mes "DHA�p���[[1]�����";
				mes "�����ł���j������";
				mes "���ɂ͔S���͂�������";
				mes "DHA�p���[���R�����";
				mes "�J�[�h������j���c�c";
				next;
				mes "^FF0000�]�C���t�H���[�V�����]";
				mes "�E�c�[�j���ɘb������������";
				mes "�@�������Ă��鑕���i��";
				mes "�@��������Ă���J�[�h��";
				mes "�@�ΏۂƂȂ�܂��B";
				mes "�E�����ł���̂�[�J�[�h]�݂̂ƂȂ�";
				mes "�@[�G���`�����g]�͕����ł��܂���B";
				mes "�@�A�C�e���̏ڍׂ̒���";
				mes "�@[�n��]���J�[�h�ƋL�ڂ���Ă���";
				mes "�@�A�C�e���͕����̑ΏۂƂȂ�܂��B";
				mes "�E[�J�[�h]�ɂ���āA�����";
				mes "�@DHA�p���[�̗ʂ��قȂ�܂��B";
				close;
			case 2:
				mes "�]�K�vDHA�p���[�]";
				mes "�w����[^FF00005^000000]���X�g�x";
				mes "�ERSX-0806�J�[�h";
				mes "�ES�EJ�E�A�[�l�X�g�E���t�J�[�h";
				mes "�ET W O�J�[�h";
				mes "�E�A�[�N�r�V���b�v�}�[�K���b�^(MVP)�J�[�h";
				mes "�E�A�g���X�J�[�h";
				mes "�E�A���_���C�X�J�[�h";
				mes "�E�A�����z�e�v�J�[�h";
				mes "�E�A�������[�J�[�h";
				mes "�E�A���t�H�V�I=�o�W���iMVP�j�J�[�h";
				mes "�E�C�O�j�[��=�Z�j�A�iMVP�j�J�[�h";
				mes "�E�C�t���[�g�J�[�h";
				mes "�E���F�X�p�[�J�[�h";
				mes "�E���F���[�u�u�J�[�h";
				mes "�E�E�H�[���b�N�J�g���[�k(MVP)�J�[�h";
				mes "�E�G�h�K�J�[�h";
				mes "�E�G�~���[��=�v�����[���iMVP�j�J�[�h";
				mes "�E�G�����X=�K�C���iMVP�j�J�[�h";
				mes "�E�G���g���@�C�G���J�[�h";
				mes "�E�I�[�N�q�[���[�J�[�h";
				mes "�E�I�[�N���[�h�J�[�h";
				mes "�E�I�V���X�J�[�h";
				mes "�E�K�[�e�B�[=�E�[�iMVP�j�J�[�h";
				mes "�E�J�g���[�k=�P�C�����iMVP�j�J�[�h";
				mes "�E�L�G��-D-01�J�[�h";
				mes "�E�M���`���N���X�G�����X(MVP)�J�[�h";
				mes "�E�N�g�����i�b�N�X�J�[�h";
				mes "�E�N���[�P���J�[�h";
				mes "�E�O���[���A���_�[�i�C�g�J�[�h";
				mes "�E�W�F�l�e�B�b�N�G�~���[��(MVP)�J�[�h";
				mes "�E�V���h�E�`�F�C�T�[�K�[�e�B�[(MVP)�J�[�h";
				mes "�E�X�g�[���i�C�g�J�[�h";
				mes "�E�Z�C����=�E�B���U�[�iMVP�j�J�[�h";
				mes "�E�Z�V��=�f�B�����iMVP�j�J�[�h";
				mes "�E�Z���A=�A���f�iMVP�j�J�[�h";
				mes "�E�Z���[�k�E�L�~�J�[�h";
				mes "�E�\�[�T���[�Z���A(MVP)�J�[�h";
				mes "�E�_�[�N���[�h�J�[�h";
				mes "�E�^�[�g���W�F�l�����J�[�h";
				mes "�E�^�C���z���_�[�J�[�h";
				mes "�E�^�I�O���J�J�[�h";
				mes "�E�`�F��=���E�iMVP�j�J�[�h";
				mes "�E�`���[���X�g��3���J�[�h";
				mes "�E�f�[�^���U�E���X�J�[�h";
				mes "�E�h�b�y���Q���K�[�J�[�h";
				mes "�E�h���L�����J�[�h";
				mes "�E�h���C�N�J�[�h";
				mes "�E�g�����e�B�[�j�iMVP�j�J�[�h";
				mes "�E�i�n�g�Y�B�[�K�[�J�[�h";
				mes "�E�j�[�Y�w�b�O�̉e�J�[�h";
				mes "�E�o�R�i���J�[�h";
				mes "�E�n�e�B�[�J�[�h";
				mes "�E�o�t�H���b�g�J�[�h";
				mes "�E�n���[�h=�A���g�A�C�[���iMVP�j�J�[�h";
				mes "�E�r�W���E�J�[�h";
				mes "�E�r�����E���S�J�[�h";
				mes "�E�t�@���I�J�[�h";
				mes "�E�t�F�������J�[�h";
				mes "�E�t���I�j�J�[�h";
				mes "�E�u�����J�[�h";
				mes "�E�y�N�\�W���J�[�h";
				mes "�E�}�[�K���b�^=�\�����iMVP�j�J�[�h";
				mes "�E�}���[�J�[�h";
				mes "�E�~�X�g���X�J�[�h";
				mes "�E�~���X�g�����A���t�H�V�I(MVP)�J�[�h";
				mes "�E���J�j�b�N�n���[�h(MVP)�J�[�h";
				mes "�E�����f��=�������X�iMVP�j�J�[�h";
				mes "�E�����h�O���X�J�[�h";
				mes "�E���[���i�C�g�Z�C����(MVP)�J�[�h";
				mes "�E���f�B�[�^�j�[�J�[�h";
				mes "�E�����b�N�J�[�h";
				mes "�E�����W���[�Z�V��(MVP)�J�[�h";
				mes "�E���C�����K�[�h�����f��(MVP)�J�[�h";
				mes "�E���[�h�I�u�f�X�J�[�h";
				mes "�E�����_���[�g�����e�B�[�j(MVP)�J�[�h";
				mes "�E�Í��̃V�[���J���X�J�[�h";
				mes "�E�ٌ`�̃V�[���J���X�J�[�h";
				mes "�E����ԃJ�[�h";
				mes "�E����峃J�[�h";
				mes "�E������_���q�o���J�[�h";
				mes "�E���앐�m�J�[�h";
				mes "�E���M�҃q�����G���J�[�h";
				mes "�E���։��J�[�h";
				mes "�E�U���̖���J�[�h";
				mes "�E�E�C�̖���J�[�h";
				mes "�E�C���`�F��(MVP)�J�[�h";
				mes "�E���R�f�q�����J�[�h";
				mes "�E�����X�J���o�J�[�h";
				mes "�E����X�J���o�J�[�h";
				mes "�E���̃^�R�J�[�h";
				mes "�E�ψق̃V�[���J���X�J�[�h";
				mes "�E�\�s�̃V�[���J���X�J�[�h";
				mes "�E����̃A���_���C�X�J�[�h";
				mes "�E�����m�^�i�g�X�̎v�O�̃J�[�h";
				mes "�E�����߂ȃW�I�C�A�J�[�h";
				mes "�E���{�̃h���L�����J�[�h";
				mes "�E���{�̃o�t�H���b�g�J�[�h";
				mes "�E�S�҂̎��҃J�f�X�J�[�h";
				mes "�E�É��O���[�U�J�[�h";
				mes "�E�[�w�̌É��O���[�U�J�[�h";
				mes "�E�C�[�u���J�[�h";
				mes "�ECUTIE�J�[�h";
				mes "�E���F�m���L�����J�[�h";
				mes "�E�����t�F�C�X���[���J�[�h";
				mes "�Efff�E�W�^�[�o�O�J�[�h";
				mes "�E�T���̌��e�J�[�h";
				mes "�E�r�b�O�G�b�O�����J�[�h";
				mes "�E���{�̃h�b�y���Q���K�[�J�[�h";
				mes "�E�o���N�g�����i�b�N�X�J�[�h";
				mes "�E�{��̌���ԃJ�[�h";
				mes "�E�{��̃h���L�����J�[�h";
				mes "�E�{�~�J�[�h";
				mes "�E�s�g�ȃ^�[�g��G�J�[�h";
				mes "�E�����W�����g�J�[�h";
				mes "�E�×��W�����g�J�[�h";
				mes "�E��]�̐_�����N�J�[�h";
				mes "�E�����X�E�l�N���}���T�[�J�[�h";
				mes "�E���_�A���N�J�[�h";
				mes "�E�P���x�A�h�[���J�[�h";
				mes "�E�Ẫ^�I�O���J�J�[�h";
				mes "�E�ẪE�[�^���K�[�h�J�[�h";
				mes "�ER48-85-�x�X�e�B�A�J�[�h";
				mes "�E�~�O�G���J�[�h";
				mes "�EEL-A17T�J�[�h";
				next;
				mes "�w����[1]���X�g�x";
				mes "�E���̑��̃J�[�h";
				close;
			case 3:
				mes "[�c�[�j��]";
				mes "�����s�����Ⴄ�̂��j���c�c";
				mes "�܁A�܂�����Ƃ����j���I";
				close;
			}
		case 4:
			mes "[�c�[�j��]";
			mes "�����s�����Ⴄ�̂��j���c�c";
			mes "�܁A�܂�����Ƃ����j���I";
			close;
		}
	case 4:
		mes "[�c�[�j��]";
		mes "�����s�����Ⴄ�̂��j���c�c";
		mes "�܁A�܂�����Ƃ����j���I";
		close;
	}
}
