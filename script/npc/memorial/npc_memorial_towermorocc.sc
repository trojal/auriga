//= Auriga Script ==============================================================
// Ragnarok Online Tower of Morocc Script	by refis
//==============================================================================

dali02.gat,134,119,5	script	���j�w�҃Z�t�B�g#tnm01	729,{
	mes "[���j�w�҃Z�t�B�g]";
	mes "����΂�́B";
	mes "���͂��̐�̓��œ���ł���";
	mes "������������Ă��܂��I";
	mes "�@";
	mes "�]^ff0000" +TNM_REFINE+ "��^000000�A���B�\�]";
	next;
	switch(select("���B������","�b�𕷂�","��b����߂�")) {
	case 1:
		break;
	case 2:
		mes "[���j�w�҃Z�t�B�g]";
		mes "���̐�ɂ���";
		mes "���_�̓��œ���ł��镐���";
		mes "���B������";
		mes "���̔\�͂𑝂��Ă�����ł��I";
		mes "�f�G�`�`�I";
		next;
		mes "[���j�w�҃Z�t�B�g]";
		mes "���E�܂Ŕ\�͂������o����";
		mes "�����N�Ȃ�Ă����ƃC�`�R���ł��I";
		next;
		mes "[���j�w�҃Z�t�B�g]";
		mes "�������������肵����";
		mes "���Ў��ɐ��B�������Ă��������I";
		mes "����̎��͂������o������";
		mes "�ƂĂ�����������܂��I";
		next;
		mes "�]^ff0000���_�̓��̒��㕔�܂�";
		mes "�@�N���A����x��3��";
		mes "�@�����Ő��B�����鎖���\�ł��B";
		mes "�@1000�񕪂܂ŁA���߂鎖���o���܂�^000000�]";
		close;
	case 3:
		mes "[���j�w�҃Z�t�B�g]";
		mes "���_�̓��ŕ������ɓ��ꂽ��";
		mes "���Ў��̏��ɗ��Ă��������I";
		close;
	}
	mes "[���j�w�҃Z�t�B�g]";
	mes "���B�ł��ˁI";
	mes "�������܂�܂����I";
	mes "���𐸘B���܂����H";
	next;
	switch(select(	(getequipid(3)!=0? "^nItemID^" +getequipid(3): "^999999����-[�������Ă��Ȃ�]^000000"),
					(getequipid(4)!=0? "^nItemID^" +getequipid(4): "^999999�E��-[�������Ă��Ȃ�]^000000"))) {
	case 1:
		set '@i,3;
		break;
	case 2:
		set '@i,4;
		break;
	}
	switch(getequipid('@i)) {
	case 2029:
	case 18131:
	case 21017:
	case 28009:
	case 28108:
	case 28707:
		break;
	case 0:
		mes "[���j�w�҃Z�t�B�g]";
		mes "����H�@�����������ĂȂ��ł���B";
		mes "���@���ė~������ł����H";
		close;
	default:
		mes "[���j�w�҃Z�t�B�g]";
		mes "������B�������Ă��镐�킪";
		mes "���_�̓��œ���ł�����̂ł�";
		mes "�����悤�ł��ˁB";
		mes "�������B�o����̂�";
		mes "���_�̓��œ���\�ȕ��킾���ł��I";
		mes "������x�A�m�F���Ă������`���B";
		close;
	}
	if(TNM_REFINE == 0) {
		mes "�]^ff0000���B�����錠��������܂���B";
		mes "�@���_�̓��̒��㕔�܂�";
		mes "�@�N���A������x��3��";
		mes "�@�����Ő��B�����鎖���\�ł�^000000�]";
		close;
	}
	set '@refine,getequiprefinerycnt('@i);
	if('@refine < 5 && TNM_REFINE >= 5 - '@refine) {	// ���B�l��4�ȉ���+5�܂ł̐��B��������Ƃ�
		mes "[���j�w�҃Z�t�B�g]";
		mes "�������I�@���̕���͂܂�";
		mes "���S�ɐ��B���\�ł��ˁI";
		mes "�����悩������";
		mes "^ff0000+5�܂ň�C�ɐ��B����^000000�����o���܂���";
		mes "�ǂ����܂����H";
		next;
		switch(select("1�񂾂����B","��C�ɐ��B","��߂�")) {
		case 1:
			break;
		case 2:
			set '@num,5 - '@refine;
			mes "[���j�w�҃Z�t�B�g]";
			mes "���Ȃ��̕���̐��B�l��^ff0000+" +'@refine+ "^000000�Ȃ̂�";
			mes "^ff0000" +'@num+ "��^000000�A��C�ɐ��B�����Ⴂ�܂��ˁI";
			mes "��낵���ł����H";
			next;
			if(select("�͂�","������") == 2) {
				mes "[���j�w�҃Z�t�B�g]";
				mes "�����ł����I";
				mes "�킩��܂����`�B";
				close;
			}
			for(set '@j,0;'@j<'@num;set '@j,'@j+1)
				successrefitem '@i;
			set TNM_REFINE,TNM_REFINE-'@num;
			mes "[���j�w�҃Z�t�B�g]";
			mes "���[��I";
			mes "�J���I �J���I �J��!!";
			mes "�@";
			mes "�͂��I�@�o���オ��܂����I";
			mes "�ǂ����`�B";
			close;
		case 3:
			mes "[���j�w�҃Z�t�B�g]";
			mes "�����ł����I";
			mes "�킩��܂����`�B";
			close;
		}
	}
	if('@refine >= 5) {
		mes "[���j�w�҃Z�t�B�g]";
		mes "�������I�@���̕���͊��ɂ��Ȃ�";
		mes "���B�����Ă܂��ˁB";
		mes "���ꂩ����";
		mes "���킪���邩������܂���B";
		mes "�����2�x�Ǝg���Ȃ��Ȃ�܂���";
		mes "����ł����v�ł����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���j�w�҃Z�t�B�g]";
			mes "�����ł����I";
			mes "�킩��܂����`�B";
			close;
		}
	}
	set TNM_REFINE,TNM_REFINE-1;
	mes "[���j�w�҃Z�t�B�g]";
	mes "���[��I";
	mes "�J���I �J���I �J��!!";
	if(getequippercentrefinery('@i) > rand(100)) {
		successrefitem '@i;
		next;
		emotion 21;
		mes "[���j�w�҃Z�t�B�g]";
		mes "�����A�ł��܂�����I";
		mes "�ǂ������ł��܂����˂��I";
		close;
	}
	else {
		failedrefitem '@i;
		next;
		emotion 23;
		mes "[���j�w�҃Z�t�B�g]";
		mes "�N�z�z�b�c�c";
		mes "���s���Ă��܂��܂����B";
		mes "�@";
		mes "���A���߂�Ȃ����c�c�B";
		mes "���͊撣��܂��I";
		close;
	}
OnInit:
	waitingroom "���_����y���B�z",0;
	end;
}

dali02.gat,141,120,3	script	���_�̓� �����ړ��@	10007,{
	if(checkquest(7577)) {
		if(checkquest(7577) & 0x2 && checkquest(118909) & 0x2) {
			mes "�]�Ē������\�ɂȂ�܂����]";
			delquest 7577;
			delquest 118909;
			close;
		}
		mes "�]���̐�͓��ꂵ�Ă���1��ڂ�";
		mes "�@^ff0000�ߑO5���ȍ~^000000�ɐi�s�\�ł��B";
		mes "�@�A���A�Ō�̓�������Ă���";
		mes "�@^ff00001����^000000�o�߂���܂ł�";
		mes "�@�i�s�ł��܂���̂ł����ӂ��������]";
		close;
	}
	mes "[���w�҃A�e�B]";
	mes "���ꂪ�����ړ��@���B";
	mes "�o�����邩�H";
	next;
	if(select("����","��߂Ă���") == 2) {
		mes "[���w�҃A�e�B]";
		mes "�������B";
		mes "�܂��A�D���ɂ��邪�����B";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[���w�҃A�e�B]";
		mes "���_�̓��̒�����";
		mes "�p�[�e�B�[�łȂ��Ƌ��ł��Ȃ��B";
		mes "�܂��͈ꏏ�ɒ���������l���W�߂�";
		mes "�p�[�e�B�[���������Ă���B";
		close;
	}
	switch(mdenter("Tower Of Morocc")) {
	case 0:	// �G���[�Ȃ�
		delquest 114800;
		delquest 114805;
		delquest 114810;
		set TNM1_QUE,0;
		setquest 7577;
		setquest 118909;
		announce "�������A���_���W����[Tower Of Morocc] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99;
		donpcevent getmdnpcname("TNMControl1")+ "::OnStart";
		//warp "1@tnm1.gat",50,104;
		end;
	case 1:	// �p�[�e�B�[������
	case 2:	// �_���W�������쐬
	default:	// ���̑��G���[
		mes "[���j�w�҃Z�t�B�g]";
		mes "�܂������ړ��@��";
		mes "�쓮�����ĂȂ��悤�ł��ˁB";
		next;
		mes "[���j�w�҃Z�t�B�g]";
		mes "���������[�_�[��";
		mes "���w�҃A�e�B�ɘb��������";
		mes "�����ړ��@��";
		mes "�쓮���Ă�����Ă��������B";
		close;
	}
}

dali02.gat,137,121,3	script	���w�҃A�e�B#tnm02	620,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[���w�҃A�e�B]";
		mes "���������H";
		mes "���_�̓��͈�l�ōs����قǊÂ��Ȃ��B";
		mes "�܂��̓��[�_�[�Ƙb�����Ă���B";
		close;
	}
	if(checkquest(7577)) {
		if(getonlinepartymember() < 1) {
			mes "[���w�҃A�e�B]";
			mes "�����u��҂��H";
			mes "����Ȃ�܂��̓p�[�e�B�[��";
			mes "�������Ă���B";
			close;
		}
		if(checkquest(7577) & 0x2 && checkquest(118909) & 0x2) {
			mes "�]�Ē������\�ɂȂ�܂����]";
			delquest 7577;
			delquest 118909;
			close;
		}
		mes "�]���̐�͓��ꂵ�Ă���1��ڂ�";
		mes "�@^ff0000�ߑO5���ȍ~^000000�ɐi�s�\�ł��B";
		mes "�@�A���A�Ō�̓�������Ă���";
		mes "�@^ff00001����^000000�o�߂���܂ł�";
		mes "�@�i�s�ł��܂���̂ł����ӂ��������]";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[���w�҃A�e�B]";
		mes "���_�̓��̒�����";
		mes "�p�[�e�B�[�łȂ��Ƌ��ł��Ȃ��B";
		mes "�܂��͈ꏏ�ɒ���������l���W�߂�";
		mes "�p�[�e�B�[���������Ă���B";
		close;
	}
	mes "[���w�҃A�e�B]";
	mes "�����ɂ��鎟���ړ��@��";
	mes "���_�̓��Ƃ������Ɍq�����Ă���B";
	mes "��X�͂��̖��_�̓���";
	mes "�������Ă���킯����";
	mes "���ɂ��郂���X�^�[�̂�����";
	mes "�v���悤�ɒ����͂͂��ǂ��Ă��Ȃ��B";
	next;
	mes "[���w�҃A�e�B]";
	mes "�����ł������čL����]�҂�����";
	mes "���_�̓��̗l�q��";
	mes "���ׂĂ��Ė���Ă���B";
	mes "�N�������s���̂ł����";
	mes "�����ړ��@���쓮�����邪�������ȁH";
	next;
	if(select("�����Ɍ�����","��߂�") == 2) {
		mes "[���w�҃A�e�B]";
		mes "�������B";
		mes "�܂��A�D���ɂ��ȁB";
		close;
	}
	mdcreate "Tower Of Morocc";
	mes "[���w�҃A�e�B]";
	mes "�����ړ��@���N���������B";
	mes "�ʘH���J������";
	mes "�����ړ��@�𒲂ׂĂ݂�B";
	close;
OnInit:
	waitingroom "���_�̓�",0;
	end;
}

1@tnm1.gat,0,0,0	script	TNMControl1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	donpcevent getmdnpcname("�������n�C��#heim0")+ "::OnStart";
	hideonnpc getmdnpcname("�������n�C��#heim");
	hideonnpc getmdnpcname("�q�����y�C�}�[#feima");
	for(set '@i,1;'@i<=7;set '@i,'@i+1)
		hideonnpc getmdnpcname("������#" +'@i);
	hideonnpc getmdnpcname("���V��#tnm01");
	hideonnpc getmdnpcname("�^�i�g�X#tnm01");
	hideonnpc getmdnpcname("�A�T�V���E�q���[#tnm01");
	hideonnpc getmdnpcname("�A�T�V���E�����[#tnm01");
	hideonnpc getmdnpcname("�A�T�V���E�f���[#tnm01");
	hideonnpc getmdnpcname("�A�T�V���E�q���[#hui02");
	hideonnpc getmdnpcname("��#tnmtop");
	hideonnpc getmdnpcname("���V��#tnm04");
	for(set '@i,1;'@i<=8;set '@i,'@i+1)
		hideonnpc getmdnpcname("#tnm�o���P�[�h" +'@i);
	areasetcell getmdmapname("1@tnm2.gat"),108,110,112,113,0;
	hideonnpc getmdnpcname("#tnm3gate01");
	hideonnpc getmdnpcname("�̎�̖�#tnm02");
	hideonnpc getmdnpcname("�̎�̖�#tnm03");
	hideonnpc getmdnpcname("#tnm3gate02");
	hideonnpc getmdnpcname("#tnm3gate03");
	hideonnpc getmdnpcname("��#tnmbosang");
	hideonnpc getmdnpcname("�̎�̖�#tnm04");
	hideonnpc getmdnpcname("���L#tnmloki02");
	hideonnpc getmdnpcname("���L�̎v�O#hidden_loki");
	hideonnpc getmdnpcname("���L#tnmloki03");
	end;
}

1@tnm1.gat,57,112,5	script	�������n�C��#heim0	691,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�������n�C��]";
		mes "�N�́H";
		mes "�����Ƃ���A���̑��̕��m�ł�";
		mes "�Ȃ��悤�����c�c�B";
		close;
	}
	stopnpctimer;
	mes "[�������n�C��]";
	mes "���݂̐틵�͂ǂ��Ȃ��Ă���H";
	unittalk "�������n�C�� : ���݂̐틵�͂ǂ��Ȃ��Ă���H";
	next;
	mes "[��@��]";
	mes "���̊K�����˔j����΍ŏ�K�ł����A";
	mes "�����̖��������܂��B";
	donpcevent getmdnpcname("��@��#tnm01")+ "::OnTalk1";
	next;
	mes "[��@��]";
	mes "���̐l���ł̓˔j��";
	mes "�s�\���Ǝv���܂��B";
	emotion 19,getmdnpcname("��@��#tnm01");
	donpcevent getmdnpcname("��@��#tnm01")+ "::OnTalk2";
	next;
	mes "[�������n�C��]";
	mes "���ݎc���Ă����͂́H";
	mes "���R�͂��ɂȂ����瓞������I";
	unittalk "�������n�C�� : ���ݎc���Ă����͂́H�@���R�͂��ɂȂ����瓞������I";
	emotion 9,getmdnpcname("�������n�C��#heim0");
	next;
	mes "[�⍲��]";
	mes "�c�c��͂Ƃ͌����Ȃ��l���ł��B";
	emotion 9,getmdnpcname("�⍲��#tnm02");
	donpcevent getmdnpcname("�⍲��#tnm02")+ "::OnTalk1";
	next;
	mes "[�⍲��]";
	mes "�B��̋~���́A";
	mes "�Ȃ�����̊K�ɂ��閂��������";
	mes "���ɍ~��Ă��Ȃ�";
	mes "�Ƃ������Ƃł��B";
	donpcevent getmdnpcname("�⍲��#tnm02")+ "::OnTalk2";
	next;
	mes "[�������n�C��]";
	mes "���̂܂܂�����";
	mes "����킯�ɂ������Ȃ����A";
	mes "�i�����邱�Ƃ��ł��Ȃ��c�c";
	mes "�Ƃ������Ƃ��B";
	mes "���������͉��̓����Ȃ��̂��H";
	unittalk "�������n�C�� : ���̂܂܂����ɂ���킯�ɂ������Ȃ����A�i�����邱�Ƃ��ł��Ȃ��c�c�Ƃ������Ƃ��B���������͉��̓����Ȃ��̂��H";
	next;
//	mes "[�������n�C��]";
	mes "[��@��]";
	mes "��̊K�ŉ�����";
	mes "�N���Ă���悤�ł����c�c�B";
	donpcevent getmdnpcname("��@��#tnm01")+ "::OnTalk3";
	close2;
	donpcevent getmdnpcname("�������n�C��#heim")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("�������n�C��#heim0");
	end;
}

1@tnm1.gat,56,110,3	script	�������n�C��#heim	691,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		if(TNM1_QUE == 0) {
			mes "[�������n�C��]";
			mes "���R�Ȃ̂��H";
			mes "�Ȃ�ǂ����Ă����œ˂������Ă���I";
			close;
		}
		else if(TNM1_QUE < 8) {
			mes "[�������n�C��]";
			mes "�������̉��}���u���ŗD�悾�B";
			mes "�q�����ɋ��͂��Ă���Ă���B";
			close;
		}
		else {
			mes "[�������n�C��]";
			mes "�K���A�펀�҂͂��Ȃ��悤���B";
			mes "����ȏ㕔�������������̂�";
			mes "�ς����Ȃ��B";
			close;
		}
	}
	if(TNM1_QUE == 0) {
		stopnpctimer;
		mes "[�������n�C��]";
		mes "���R�Ȃ̂��H";
		mes "�Ȃ�ǂ����Ă����œ˂������Ă���I";
		unittalk "�������n�C�� : ���R�Ȃ̂��H�@�Ȃ�ǂ����Ă����œ˂������Ă���I";
		next;
		hideoffnpc getmdnpcname("�q�����y�C�}�[#feima");
		mes "[�q�����y�C�}�[]";
		mes "����`��I";
		mes "�������A�����Ă������`��!!";
		mes "����l����肪���܂��`��I";
		donpcevent getmdnpcname("�q�����y�C�}�[#feima")+ "::OnTalk1";
		next;
		mes "[�������n�C��]";
		mes "�c�c���̐��������������낤�H";
		unittalk "�������n�C�� : �c�c���̐��������������낤�H";
		next;
		mes "[�������n�C��]";
		mes "�܂��͕������̎��Â𗊂ށB";
		mes "�y�C�}�[���玡�Ô����󂯎��A";
		mes "������g���Ă���B";
		unittalk "�������n�C�� : �܂��͕������̎��Â𗊂ށB�y�C�}�[���玡�Ô����󂯎��A������g���Ă���B";
		next;
		mes "[�q�����y�C�}�[]";
		mes "����`�����Ă������́A";
		mes "������ɗ���";
		mes "���Ô����󂯎���Ă������`���I";
		donpcevent getmdnpcname("�q�����y�C�}�[#feima")+ "::OnTalk2";
		setpartyinmap TNM1_QUE,1;
		close;
	}
	else if(TNM1_QUE < 8) {
		mes "[�������n�C��]";
		mes "�������̉��}���u���ŗD�悾�B";
		mes "�q�����ɋ��͂��Ă���Ă���B";
		close;
	}
	else {
		mes "[�������n�C��]";
		mes "�K���A�펀�҂͂��Ȃ��悤���B";
		mes "����ȏ㕔�������������̂�";
		mes "�ς����Ȃ��B";
		close;
	}
OnStart:
	initnpctimer;
	unittalk "�������n�C�� : �����ɂ���̂͒N���H";
	hideonnpc getmdnpcname("�������n�C��#heim0");
	hideoffnpc getmdnpcname("�������n�C��#heim");
	end;
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("�������n�C��#heim");
	end;
OnTalk1:
	unittalk "�������n�C�� : �A�T�V���M���h�̎x�����I�@�悭���Ă��ꂽ!!";
	end;
OnTalk2:
	unittalk "�������n�C�� : �M�l�c�c���𒧔����Ă���̂��H";
	end;
OnTalk3:
	unittalk "�������n�C�� : �ǂ����Ă��̎����c�c�m���ɖ��������͐i�s���~�߁A������҂��Ă���l�q���B";
	end;
OnTalk4:
	unittalk "�������n�C�� : �ȁc�c����������肾�I�@����ȏ��l���ŏ�荞��ł����ʎ��ɂ��邾�������I";
	end;
OnTalk5:
	unittalk "�������n�C�� : �����l���Ă���񂾔ނ�́c�c�B���ɂ��挵�����󋵂��B�N���ނ�����삵�Ă���B";
	end;
OnTalk6:
	unittalk "�������n�C�� : �������}�����邾���ł��A�傫�ȗ͂ɂȂ�͂����B���ނ��B";
	end;
}

1@tnm1.gat,61,113,3	script	��@��#tnm01	997,{
	mes "[��@��]";
	mes "���R�Ȃ̂��H";
	mes "�󋵂��������Ă������珕��������B";
	mes "�����܂ŗ��Ă���Ă��肪�ƂȁB";
	close;
OnTalk1:
	unittalk "��@�� : ���̊K�����˔j����΍ŏ�K�ł����A�����̖��������܂��B";
	end;
OnTalk2:
	unittalk "��@�� : ���̐l���ł̓˔j�͕s�\���Ǝv���܂��B";
	end;
OnTalk3:
	unittalk "��@�� : ��̊K�ŉ������N���Ă���悤�ł����c�c�B";
	end;
}

1@tnm1.gat,61,110,3	script	�⍲��#tnm02	998,{
	mes "[�⍲��]";
	mes "���S�N���O�̍Ђ����ĂыN���낤��";
	mes "���Ă���킯����Ȃ���ȁH";
	mes "�Ȃ��}�ɖ��������ꂽ�̂��c�c�B";
	close;
OnTalk1:
	unittalk "�⍲�� : �c�c��͂Ƃ͌����Ȃ��l���ł��B";
	end;
OnTalk2:
	unittalk "�⍲�� : �B��̋~���́A�Ȃ�����̊K�ɂ��閂�����������ɍ~��Ă��Ȃ��Ƃ������Ƃł��B";
	end;
}

1@tnm1.gat,47,109,3	script	�q�����y�C�}�[#feima	696,{
	if(TNM1_QUE == 1) {
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[�q�����y�C�}�[]";
			mes "�����Ȃ����̃��[�_�[�����";
			mes "���b�����Ă��܂��̂�";
			mes "������Ƒ҂��Ă��������ˁ`�B";
			close;
		}
		mes "[�q�����y�C�}�[]";
		mes "����`�����Ă����������ł����H";
		mes "������܂��`�B";
		mes "���Ô��ŕ������݂̂Ȃ����";
		mes "���Â��Ăق����̂ł��B";
		next;
		if(select("���Â���`��","���Â��X�L�b�v����") == 2) {
			mes "�]���Ȃ��͎��Ô����󂯎��A";
			mes "�@�������ւ̎��Â��s�����]";
			next;
			mes "[�q�����y�C�}�[]";
			mes "�ӂ��c�c�B";
			mes "����łЂƂ܂�";
			mes "�����������݂����ł��B";
			mes "���肪�Ƃ��������܂��I";
			mes "������܂����`�I";
			set 'flag,1;
			setpartyinmap TNM1_QUE,8;
			for(set '@i,1;'@i<=7;set '@i,'@i+1) {
				misceffect 6,getmdnpcname("������#" +'@i+ "_1");
				hideonnpc getmdnpcname("������#" +'@i+ "_1");
				hideoffnpc getmdnpcname("������#" +'@i);
				misceffect 6,getmdnpcname("������#" +'@i);
			}
			donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
			close;
		}
		mes "[�q�����y�C�}�[]";
		mes "���ÂɎg�����Ô���";
		mes "�p�ӂ��Ă����܂��̂ŁA";
		mes "������̏������ł�����";
		mes "������x���������Ă��������`�B";
		setpartyinmap TNM1_QUE,2;
		close;
	}
	else if(TNM1_QUE >= 2 && TNM1_QUE < 9) {
		if(countitem(7641)) {
			mes "[�q�����y�C�}�[]";
			mes "���߂�Ȃ����A�⋋�̓s����";
			mes "���Ô��͈�x��1����";
			mes "�x�����Ă����ł��`�B";
			mes "�g���I������������x";
			mes "�󂯎��ɗ��Ă��炦�܂����H";
			close;
		}
		mes "[�q�����y�C�}�[]";
		mes "���̎��Ô��ŁA";
		mes "�������݂̂Ȃ����";
		mes "���Â��Ă��������B";
		mes "����Ȃɓ���Ȃ��ł���B";
		mes "�}�j���A���ʂ��";
		mes "���Â���Α��v�ł��I";
		next;
		mes "[�q�����y�C�}�[]";
		mes "����ƁA�⋋�̓s����";
		mes "���Ô��͈�x��1����";
		mes "�x�����Ă����ł��`�B";
		mes "�g���I������������x";
		mes "�󂯎��ɗ��Ă��炦�܂����H";
		getitem 7641,1;
		close;
	}
	else {
		mes "[�q�����y�C�}�[]";
		mes "�ӂ��c�c�B";
		mes "����łЂƂ܂�";
		mes "�����������݂����ł��B";
		mes "�����A�]�������Ô���";
		mes "������ŉ�����Ă����܂��ˁ`�I";
		if(countitem(7641))
			delitem 7641,1;
		next;
		if('flag) {
			mes "[�q�����y�C�}�[]";
			mes "����`�����Ă���������";
			mes "�{���ɂ��肪�Ƃ��������܂��I";
			mes "������܂����`�I";
			close;
		}
		mes "[�q�����y�C�}�[]";
		mes "����`�����Ă���������";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		mes "������܂����`�I";
		mes "���Ȃ����������ĉ��䂵�Ȃ��悤�ɁA";
		mes "�C�����Ă��������ˁ`�I";
		emotion 14,getmdnpcname("�q�����y�C�}�[#feima");
		npcskillsupport 34,10;
		sc_end SC_BLESSING;
		sc_start SC_BLESSING,240000,10;
		npcskillsupport 29,10;
		sc_end SC_INCREASEAGI;
		sc_start SC_INCREASEAGI,240000,10;
		npcskillsupport 33,10;
		sc_end 9;
		sc_start 9,300000,10;	//SC_ANGELUS
		npcskillsupport 73,10;
		sc_end 19;
		sc_start 19,120000,10;	//SC_KYRIE
		close;
	}
OnTalk1:
	unittalk "�q�����y�C�}�[ : ����`��I�@�������A�����Ă������`���B����l����肪���܂��`��I";
	end;
OnTalk2:
	unittalk "�q�����y�C�}�[ : ����`�����Ă������́A������ɗ��Ď��Ô����󂯎���Ă������`���I";
	end;
OnTalk3:
	unittalk "�q�����y�C�}�[ : ���Ⴀ�I�@�r�b�N�����܂����I�@�}�Ɍ���Ȃ��ł���������`�I";
	end;
}

1@tnm1.gat,39,114,3	script	������#1	688,{
	mes "[������]";
	mes "������܂����B";
	mes "���肪�Ƃ��������܂��B";
	close;
}
1@tnm1.gat,39,114,3	script	������#1_1	687,3,3,{
	if(countitem(7641) == 0) {
		mes "�]�����������Â���ɂ�";
		mes "�@���Ô���1�K�v�ł��]";
		close;
	}
	mes "�]�C���������܂܂��Ȃ��Ă���B";
	mes "�@���Ô����g�p����";
	mes "�@���}���Â��s���܂����H�]";
	next;
	if(select("���Â��s��","�l�q���݂�") == 2) {
		mes "�]�����������̗l�q��";
		mes "�@���邱�Ƃɂ��܂����]";
		close;
	}
	mes "�]���Ô��ɏ�����Ă�����@��";
	mes "�@���Â��s���܂��c�c";
	misceffect 72,getmdnpcname("������#1_1");
	progressbar 2;
	delitem 7641,1;
	misceffect 6,getmdnpcname("������#1_1");
	hideonnpc getmdnpcname("������#1_1");
	hideoffnpc getmdnpcname("������#1");
	misceffect 6,getmdnpcname("������#1");
	setpartyinmap TNM1_QUE,TNM1_QUE + 1;
	if(TNM1_QUE < 9) {
		announce "�q�����y�C�}�[ : �������͂���" +(9 - TNM1_QUE)+ "�l�ł�!!",0x9,0x00ff00,0x190,12,0,0;
	}
	else {
		announce "�q�����y�C�}�[ : �S�Ă̕������̎��Â��I���܂����I",0x9,0xff0000;
		donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
	}
	mes "�@���Âɐ������܂����]";
	close;
OnTouch:
	unittalk "������ : �c�c�������c�c�B";
	end;
}

1@tnm1.gat,30,120,3	script	������#2	690,{
	mes "[������]";
	mes "�����c�c�B";
	mes "����Ȃɒɂ����Â�";
	mes "��x�ƃS���������c�c�B";
	close;
}
1@tnm1.gat,30,120,3	script	������#2_1	689,{
	if(countitem(7641) == 0) {
		mes "�]�����������Â���ɂ�";
		mes "�@���Ô���1�K�v�ł��]";
		close;
	}
	mes "�]�C���������܂܂��Ȃ��Ă���B";
	mes "�@���Ô����g�p����";
	mes "�@���}���Â��s���܂����H�]";
	next;
	if(select("���Â��s��","�l�q���݂�") == 2) {
		mes "�]�����������̗l�q��";
		mes "�@���邱�Ƃɂ��܂����]";
		close;
	}
	mes "�]���Ô��ɏ�����Ă�����@��";
	mes "�@���Â��s���܂��c�c";
	misceffect 72,getmdnpcname("������#2_1");
	progressbar 2;
	delitem 7641,1;
	misceffect 6,getmdnpcname("������#2_1");
	hideonnpc getmdnpcname("������#2_1");
	hideoffnpc getmdnpcname("������#2");
	misceffect 6,getmdnpcname("������#2");
	setpartyinmap TNM1_QUE,TNM1_QUE + 1;
	if(TNM1_QUE < 9) {
		announce "�q�����y�C�}�[ : �������͂���" +(9 - TNM1_QUE)+ "�l�ł�!!",0x9,0x00ff00;
	}
	else {
		announce "�q�����y�C�}�[ : �S�Ă̕������̎��Â��I���܂����I",0x9,0xff0000;
		donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
	}
	mes "�@���Âɐ������܂����]";
	close;
OnTouch:
	unittalk "������ : �����c�c�B";
	end;
}

1@tnm1.gat,25,117,5	script	������#3	693,{
	mes "[������]";
	mes "���������c�c�B";
	mes "���Ԃ����͖������ȁc�c�B";
	close;
}
1@tnm1.gat,25,117,5	script	������#3_1	692,{
	if(countitem(7641) == 0) {
		mes "�]�����������Â���ɂ�";
		mes "�@���Ô���1�K�v�ł��]";
		close;
	}
	mes "�]�C���������܂܂��Ȃ��Ă���B";
	mes "�@���Ô����g�p����";
	mes "�@���}���Â��s���܂����H�]";
	next;
	if(select("���Â��s��","�l�q���݂�") == 2) {
		mes "�]�����������̗l�q��";
		mes "�@���邱�Ƃɂ��܂����]";
		close;
	}
	mes "�]���Ô��ɏ�����Ă�����@��";
	mes "�@���Â��s���܂��c�c";
	misceffect 72,getmdnpcname("������#3_1");
	progressbar 2;
	delitem 7641,1;
	misceffect 6,getmdnpcname("������#3_1");
	hideonnpc getmdnpcname("������#3_1");
	hideoffnpc getmdnpcname("������#3");
	misceffect 6,getmdnpcname("������#3");
	setpartyinmap TNM1_QUE,TNM1_QUE + 1;
	if(TNM1_QUE < 9) {
		announce "�q�����y�C�}�[ : �������͂���" +(9 - TNM1_QUE)+ "�l�ł�!!",0x9,0x00ff00;
	}
	else {
		announce "�q�����y�C�}�[ : �S�Ă̕������̎��Â��I���܂����I",0x9,0xff0000;
		donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
	}
	mes "�@���Âɐ������܂����]";
	close;
OnTouch:
	unittalk "������ : �c�c�������c�c�������c�c�B";
	end;
}

1@tnm1.gat,19,118,4	script	������#4	695,{
	mes "[������]";
	mes "�������߂��Ǝv���Ă����̂����c�c";
	mes "���͏��������̂��ȁc�c�B";
	close;
}
1@tnm1.gat,19,118,4	script	������#4_1	694,{
	if(countitem(7641) == 0) {
		mes "�]�����������Â���ɂ�";
		mes "�@���Ô���1�K�v�ł��]";
		close;
	}
	mes "�]�C���������܂܂��Ȃ��Ă���B";
	mes "�@���Ô����g�p����";
	mes "�@���}���Â��s���܂����H�]";
	next;
	if(select("���Â��s��","�l�q���݂�") == 2) {
		mes "�]�����������̗l�q��";
		mes "�@���邱�Ƃɂ��܂����]";
		close;
	}
	mes "�]���Ô��ɏ�����Ă�����@��";
	mes "�@���Â��s���܂��c�c";
	misceffect 72,getmdnpcname("������#4_1");
	progressbar 2;
	delitem 7641,1;
	misceffect 6,getmdnpcname("������#4_1");
	hideonnpc getmdnpcname("������#4_1");
	hideoffnpc getmdnpcname("������#4");
	misceffect 6,getmdnpcname("������#4");
	setpartyinmap TNM1_QUE,TNM1_QUE + 1;
	if(TNM1_QUE < 9) {
		announce "�q�����y�C�}�[ : �������͂���" +(9 - TNM1_QUE)+ "�l�ł�!!",0x9,0x00ff00;
	}
	else {
		announce "�q�����y�C�}�[ : �S�Ă̕������̎��Â��I���܂����I",0x9,0xff0000;
		donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
	}
	mes "�@���Âɐ������܂����]";
	close;
OnTouch:
	unittalk "������ : �c�c�������c�c�B";
	end;
}

1@tnm1.gat,19,110,4	script	������#5	698,{
	mes "[������]";
	mes "�I���A���̐퓬���I�������";
	mes "�̋��ɖ߂薢����񑩂����c�����";
	mes "������\�����ނ񂾁c�c�B";
	mes "�����ƍK���ɂȂ���ȁc�c�B";
	close;
}
1@tnm1.gat,19,110,4	script	������#5_1	697,{
	if(countitem(7641) == 0) {
		mes "�]�����������Â���ɂ�";
		mes "�@���Ô���1�K�v�ł��]";
		close;
	}
	mes "�]�C���������܂܂��Ȃ��Ă���B";
	mes "�@���Ô����g�p����";
	mes "�@���}���Â��s���܂����H�]";
	next;
	if(select("���Â��s��","�l�q���݂�") == 2) {
		mes "�]�����������̗l�q��";
		mes "�@���邱�Ƃɂ��܂����]";
		close;
	}
	mes "�]���Ô��ɏ�����Ă�����@��";
	mes "�@���Â��s���܂��c�c";
	misceffect 72,getmdnpcname("������#5_1");
	progressbar 2;
	delitem 7641,1;
	misceffect 6,getmdnpcname("������#5_1");
	hideonnpc getmdnpcname("������#5_1");
	hideoffnpc getmdnpcname("������#5");
	misceffect 6,getmdnpcname("������#5");
	setpartyinmap TNM1_QUE,TNM1_QUE + 1;
	if(TNM1_QUE < 9) {
		announce "�q�����y�C�}�[ : �������͂���" +(9 - TNM1_QUE)+ "�l�ł�!!",0x9,0x00ff00;
	}
	else {
		announce "�q�����y�C�}�[ : �S�Ă̕������̎��Â��I���܂����I",0x9,0xff0000;
		donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
	}
	mes "�@���Âɐ������܂����]";
	close;
OnTouch:
	unittalk "������ : �c�c���ʂ̂́c�c���₾�B";
	end;
}

1@tnm1.gat,24,104,7	script	������#6	10001,{
	mes "[������]";
	mes "�����ňȑO���ǂ��Ȃ������c�c";
	mes "�����̂ɂ͂܂������悤���B";
	mes "�܂��A�����Ă��邾���}�V���c�c�B";
	close;
}
1@tnm1.gat,24,104,7	script	������#6_1	699,{
	if(countitem(7641) == 0) {
		mes "�]�����������Â���ɂ�";
		mes "�@���Ô���1�K�v�ł��]";
		close;
	}
	mes "�]�C���������܂܂��Ȃ��Ă���B";
	mes "�@���Ô����g�p����";
	mes "�@���}���Â��s���܂����H�]";
	next;
	if(select("���Â��s��","�l�q���݂�") == 2) {
		mes "�]�����������̗l�q��";
		mes "�@���邱�Ƃɂ��܂����]";
		close;
	}
	mes "�]���Ô��ɏ�����Ă�����@��";
	mes "�@���Â��s���܂��c�c";
	misceffect 72,getmdnpcname("������#6_1");
	progressbar 2;
	delitem 7641,1;
	misceffect 6,getmdnpcname("������#6_1");
	hideonnpc getmdnpcname("������#6_1");
	hideoffnpc getmdnpcname("������#6");
	misceffect 6,getmdnpcname("������#6");
	setpartyinmap TNM1_QUE,TNM1_QUE + 1;
	if(TNM1_QUE < 9) {
		announce "�q�����y�C�}�[ : �������͂���" +(9 - TNM1_QUE)+ "�l�ł�!!",0x9,0x00ff00;
	}
	else {
		announce "�q�����y�C�}�[ : �S�Ă̕������̎��Â��I���܂����I",0x9,0xff0000;
		donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
	}
	mes "�@���Âɐ������܂����]";
	close;
OnTouch:
	unittalk "������ : �c�c���������c�c�B";
	end;
}

1@tnm1.gat,31,110,3	script	������#7	690,{
	mes "[������]";
	mes "���肪�Ƃ��I";
	mes "���񂽂͖��̉��l���B";
	close;
}
1@tnm1.gat,31,110,3	script	������#7_1	689,{
	if(countitem(7641) == 0) {
		mes "�]�����������Â���ɂ�";
		mes "�@���Ô���1�K�v�ł��]";
		close;
	}
	mes "�]�C���������܂܂��Ȃ��Ă���B";
	mes "�@���Ô����g�p����";
	mes "�@���}���Â��s���܂����H�]";
	next;
	if(select("���Â��s��","�l�q���݂�") == 2) {
		mes "�]�����������̗l�q��";
		mes "�@���邱�Ƃɂ��܂����]";
		close;
	}
	mes "�]���Ô��ɏ�����Ă�����@��";
	mes "�@���Â��s���܂��c�c";
	misceffect 72,getmdnpcname("������#7_1");
	progressbar 2;
	delitem 7641,1;
	misceffect 6,getmdnpcname("������#7_1");
	hideonnpc getmdnpcname("������#7_1");
	hideoffnpc getmdnpcname("������#7");
	misceffect 6,getmdnpcname("������#7");
	setpartyinmap TNM1_QUE,TNM1_QUE + 1;
	if(TNM1_QUE < 9) {
		announce "�q�����y�C�}�[ : �������͂���" +(9 - TNM1_QUE)+ "�l�ł�!!",0x9,0x00ff00;
	}
	else {
		announce "�q�����y�C�}�[ : �S�Ă̕������̎��Â��I���܂����I",0x9,0xff0000;
		donpcevent getmdnpcname("���V��#tnm01")+ "::OnStart";
	}
	mes "�@���Âɐ������܂����]";
	close;
OnTouch:
	unittalk "������ : �����c�c�B";
	end;
}

1@tnm1.gat,46,105,5	script	���V��#tnm01	667,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		cutin "tnm_lucile01",2;
		mes "[���V��]";
		mes "������̉��R�̃��[�_�[��";
		mes "�ǂ̕��ł����H";
		close2;
		cutin "tnm_lucile01",255;
		end;
	}
	switch(TNM1_QUE) {
	case 9:
		stopnpctimer;
		cutin "tnm_lucile01",0;
		mes "[���V��]";
		mes "�A�T�V���M���h�̃��V���ł��B";
		mes "�����������̔C���ł����̂ŁA";
		mes "�x��܂����B";
		unittalk "���V�� : �A�T�V���M���h�̃��V���ł��B�����������̔C���ł����̂ŁA�x��܂����B";
		next;
		cutin "tnm_loki",2;
		mes "[�^�i�g�X]";
		mes "�^�i�g�X���c�c�B";
		donpcevent getmdnpcname("�^�i�g�X#tnm01")+ "::OnTalk1";
		next;
		cutin "tnm_loki",255;
		mes "[�������n�C��]";
		mes "�A�T�V���M���h�̎x�����I";
		mes "�悭���Ă��ꂽ!!";
		donpcevent getmdnpcname("�������n�C��#heim")+ "::OnTalk1";
		next;
		cutin "tnm_lucile01",0;
		mes "[���V��]";
		mes "�l�q���������A";
		mes "�F�����Ȃ��悤�ł��ˁB";
		unittalk "���V�� : �l�q���������A�F�����Ȃ��悤�ł��ˁB";
		next;
		mes "[���V��]";
		mes "���̗E�҂ȃv�����e���R�m�c�͉����ցH";
		unittalk "���V�� : ���̗E�҂ȃv�����e���R�m�c�͉����ցH";
		next;
		cutin "tnm_lucile01",255;
		mes "[�������n�C��]";
		mes "�M�l�c�c";
		mes "���𒧔����Ă���̂��H";
		donpcevent getmdnpcname("�������n�C��#heim")+ "::OnTalk2";
		next;
		cutin "tnm_lucile01",0;
		mes "[���V��]";
		mes "�܂����A����ł��B";
		mes "�������̊K��";
		mes "�����s���Ȏ����N���Ă��܂��񂩁H";
		unittalk "���V�� : �܂����A����ł��B�������̊K�ŉ����s���Ȏ����N���Ă��܂��񂩁H";
		next;
		cutin "tnm_lucile01",255;
		emotion 0,getmdnpcname("�������n�C��#heim");
		mes "[�������n�C��]";
		mes "�ǂ����Ă��̎����c�c";
		mes "�m���ɖ��������͐i�s���~�߁A";
		mes "������҂��Ă���l�q���B";
		donpcevent getmdnpcname("�������n�C��#heim")+ "::OnTalk3";
		next;
		cutin "tnm_lucile01",0;
		emotion 5,getmdnpcname("���V��#tnm01");
		mes "[���V��]";
		mes "�c�c�Ƃ������Ƃ炵���ł���B";
		mes "�l���͍ŏ�K�݂����ł����A";
		mes "�ǂ����܂��H";
		unittalk "���V�� : �c�c�Ƃ������Ƃ炵���ł���B�l���͍ŏ�K�݂����ł����A�ǂ����܂��H";
		next;
		cutin "tnm_loki",2;
		mes "[�^�i�g�X]";
		mes "�������c�c";
		mes "����Ȃ�A���͐�ɍs���B";
		donpcevent getmdnpcname("�^�i�g�X#tnm01")+ "::OnTalk2";
		next;
		cutin "tnm_lucile01",0;
		mes "[���V��]";
		mes "����A���ς�炸";
		mes "�s���������̂ł��ˁB";
		unittalk "���V�� : ����A���ς�炸�s���������̂ł��ˁB";
		hideonnpc getmdnpcname("�^�i�g�X#tnm01");
		next;
		cutin "tnm_lucile01",255;
		mes "[�������n�C��]";
		mes "�ȁc�c����������肾�I";
		mes "����ȏ��l���ŏ�荞��ł�";
		mes "���ʎ��ɂ��邾�������I";
		donpcevent getmdnpcname("�������n�C��#heim")+ "::OnTalk4";
		next;
		cutin "tnm_lucile01",0;
		mes "[���V��]";
		mes "���l�����Ȃ�āc�c";
		mes "�����ɓ����镺�m��";
		mes "���邶��Ȃ��ł����B";
		unittalk "���V�� : ���l�����Ȃ�āc�c�����ɓ����镺�m�����邶��Ȃ��ł����B";
		next;
		mes "[���V��]";
		mes "����ł͉�������肢���܂��ˁB";
		mes "�f���[�I";
		mes "��̂��Ƃ͔C���܂��B";
		unittalk "���V�� : ����ł͉�������肢���܂��ˁB�f���[�I�@��̂��Ƃ͔C���܂��B";
		next;
		cutin "tnm_lucile01",255;
		mes "[�A�T�V���E�f���[]";
		mes "���C�����������B";
		setpartyinmap TNM1_QUE,10;
		donpcevent getmdnpcname("�A�T�V���E�f���[#tnm01")+ "::OnStart";
		next;
		mes "[�������n�C��]";
		mes "�����l���Ă���񂾔ނ�́c�c�B";
		mes "���ɂ��挵�����󋵂��B";
		mes "�N���ނ�����삵�Ă���B";
		donpcevent getmdnpcname("�������n�C��#heim")+ "::OnTalk5";
		hideonnpc getmdnpcname("���V��#tnm01");
		hideonnpc getmdnpcname("�A�T�V���E�q���[#tnm01");
		hideonnpc getmdnpcname("�A�T�V���E�����[#tnm01");
		next;
		mes "[�������n�C��]";
		mes "�������}�����邾���ł��A";
		mes "�傫�ȗ͂ɂȂ�͂����B���ނ��B";
		donpcevent getmdnpcname("�������n�C��#heim")+ "::OnTalk6";
		close;
	}
OnStart:
	initnpctimer;
	hideoffnpc getmdnpcname("���V��#tnm01");
	hideoffnpc getmdnpcname("�^�i�g�X#tnm01");
	hideoffnpc getmdnpcname("�A�T�V���E�q���[#tnm01");
	hideoffnpc getmdnpcname("�A�T�V���E�����[#tnm01");
	donpcevent getmdnpcname("�q�����y�C�}�[#feima")+ "::OnTalk3";
	end;
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("���V��#tnm01");
	end;
}

1@tnm1.gat,52,104,3	script	�^�i�g�X#tnm01	494,{
	cutin "tnm_loki",2;
	mes "[�^�i�g�X]";
	mes "�c�c�B";
	close2;
	cutin "tnm_loki",255;
	end;
OnTalk1:
	unittalk "�^�i�g�X : �^�i�g�X���c�c�B";
	end;
OnTalk2:
	unittalk "�^�i�g�X : �������c�c����Ȃ�A���͐�ɍs���B";
	end;
}

1@tnm1.gat,42,104,5	script	�A�T�V���E�q���[#tnm01	10002,{
	mes "[�A�T�V���E�q���[]";
	mes "�C�����ł��B���Â��ɁB";
	close;
}

1@tnm1.gat,44,101,5	script	�A�T�V���E�����[#tnm01	884,{
	//mes "[�A�T�V���E�q���[]";
	mes "[�A�T�V���E�����[]";
	mes "���V���o����Ƌ��ɍs�����Ă��܂��B";
	close;
}

1@tnm1.gat,70,108,3	script	�A�T�V���E�f���[#tnm01	884,{
	mes "[�A�T�V���E�f���[]";
	mes "��̊K�܂ōs������";
	mes "�������ē��������܂��B";
	next;
	if(select("�ړ�����","�ړ����Ȃ�") == 2) {
		mes "[�A�T�V���E�f���[]";
		mes "���_�Ƃ̐퓬��";
		mes "�N����\��������܂���";
		mes "�����͑ӂ�Ȃ�����";
		mes "�����ł�����ˁB";
		mes "������܂����B";
		close;
	}
	mes "[�A�T�V���E�f���[]";
	mes "����ł́A�����^���B";
	close2;
	set TNM1_QUE,11;
	setquest 114815;
	compquest 114815;
	warp getmdmapname("1@tnm1.gat"),91,23;
	end;
OnStart:
	hideoffnpc getmdnpcname("�A�T�V���E�f���[#tnm01");
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("�A�T�V���E�f���[#tnm01");
	end;
}

1@tnm1.gat,91,23,0	script	#tnm1stepmob	139,1,1,{
OnTouch:
	initnpctimer;
	hideonnpc getmdnpcname("#tnm1stepmob");
	announce "�U�f�̖��_�̉e : �l�ԕ���c�c�B�M�l�ɑ���ꂽ�����̓��E�̒ɂ݂�m�邪�����I",0x9,0x00ff00;
	end;
OnTimer3000:
	announce "�A�T�V���E�q���[ : �o����I�@��Ȃ��I",0x9,0x00ff00;
	end;
OnTimer5000:
	announce "���V�� : ���c�c�H�@���Ⴀ�����I",0x9,0x00ff00;
	end;
OnTimer7000:
	announce "�U�f�̖��_�̉e : �܂��l�Ԃ�����悤���ȁc�c�B�������A�����瓯�l�A���Ղɂ����Ă��c�c!!",0x9,0x00ff00;
	monster getmdmapname("1@tnm1.gat"),99,24,"�U�f�̖��_�̉e",2939,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),113,21,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),113,26,"��O�̖��_�̉e",2941,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),122,27,"�U�f�̖��_�̉e",2939,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),124,26,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),126,27,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),129,25,"��O�̖��_�̉e",2941,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),136,25,"�U�f�̖��_�̉e",2939,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),136,26,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	monster getmdmapname("1@tnm1.gat"),137,25,"��O�̖��_�̉e",2941,1,getmdnpcname("#tnm1stepmob")+ "::OnKilled";
	stopnpctimer;
	end;
OnKilled:
	// dummy
	end;
}

1@tnm1.gat,158,24,0	warp	#newwarp_jp	2,2,1@tnm1.gat,124,86

1@tnm1.gat,138,96,3	script	���V��#tnm02	667,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]���̔������Ȃ��A�����Ȃ��B";
		mes "�@�܂�ŋ@�B�l�`�̂悤���]";
		mes "�@";
		mes "�]^ff0000�p�[�e�B�[���[�_�[�̂�";
		mes "�@�i�s���\�ł�^000000�]";
		close;
	}
	switch(TNM1_QUE) {
	case 11:
		cutin "tnm_lucile02",2;
		mes "[���V��]";
		mes "�����A�����ɕs�o�����A";
		mes "�_���[�W�������Ă��܂��܂����B";
		mes "�c�c�������Ƃ��ł��܂���B";
		unittalk "���V�� : �����A�����ɕs�o�����A�_���[�W�������Ă��܂��܂����B�c�c�������Ƃ��ł��܂���B";
		next;
		mes "[���V��]";
		mes "�������������A���̂܂܂ł�";
		mes "���Ə����ŉ�b���ł��Ȃ��Ȃ�܂��B";
		unittalk "���V�� : �������������A���̂܂܂ł͂��Ə����ŉ�b���ł��Ȃ��Ȃ�܂��B";
		next;
		mes "[���V��]";
		mes "�c�c�\����Ȃ��̂ł����A";
		mes "�����͂�݂��Ē����܂��񂩁H";
		unittalk "���V�� : �c�c�\����Ȃ��̂ł����A�����͂�݂��Ē����܂��񂩁H";
		next;
		mes "[���V��]";
		mes "���͂�����Ɠ���ȑ̂ŁA";
		mes "�ċN�����s�����ƂŁA";
		mes "�̂��C�����鎖��";
		mes "�ł���̂ł����c�c";
		unittalk "���V�� : ���͂�����Ɠ���ȑ̂ŁA�ċN�����s�����Ƃő̂��C�����鎖���ł���̂ł����c�c";
		next;
		mes "[���V��]";
		mes "���̊ԁA����";
		mes "���S�ɓ������Ƃ��ł��Ȃ��̂ŁA";
		mes "���肩��̍U����";
		mes "�ȒP�ɓ|��Ă��܂��܂��B";
		unittalk "���V�� : ���̊ԁA���͊��S�ɓ������Ƃ��ł��Ȃ��̂ŁA���肩��̍U���ŊȒP�ɓ|��Ă��܂��܂��B";
		next;
		mes "[���V��]";
		mes "�ł��̂ŁA�����̊Ԃ���";
		mes "���̖T�ɂ��Ă��������c�c�B";
		unittalk "���V�� : �ł��̂ŁA�����̊Ԃ������̖T�ɂ��Ă��������c�c�B";
		next;
		cutin "tnm_lucile03",2;
		mes "[���V��]";
		mes "���肢�c�c���܂��c�c�B";
		mes "�@";
		mes "�]^ff0000������x���V���ɘb������";
		mes "�@���V���̍ċN������`����^000000�]";
		unittalk "���V�� : ���肢�c�c���܂��c�c�B";
		close2;
		cutin "tnm_lucile03",255;
		setpartyinmap TNM1_QUE,12;
		hideoffnpc getmdnpcname("�A�T�V���E�q���[#hui02");
		donpcevent getmdnpcname("�A�T�V���E�q���[#hui02")+ "::OnTalk1";
		donpcevent getmdnpcname("�A�T�V���E�q���[#hui02")+ "::OnStart";
		end;
	case 12:
		mes "�]���V���̗l�q���f���B";
		mes "�@�ޏ��͐l�̎p�����Ă��邪�A";
		mes "�@�܂�œ��͂��؂ꂽ�@�B�̂悤��";
		mes "�@���@���őS�������Ȃ��B";
		mes "�@";
		mes "�@^ff0000���V���̍ċN������`���܂����H^000000�]";
		cutin "tnm_lucile03",2;
		next;
		if(select("��`��","��`��Ȃ�") == 2){
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close2;
			cutin "tnm_lucile03",255;
			end;
		}
		cutin "tnm_lucile03",255;
		mes "�]���V���̍ċN������`�����Ƃɂ����B";
		mes "�@�ޏ��̑̂���A������";
		mes "�@�����̋쓮������������c�c";
		misceffect 202,getmdnpcname("���V��#tnm02");
		progressbar 30;
		mes "�@^ff0000�V�X�e�����ċN�������B^000000";
		mes "�@�ċN���������V���ɘb�������悤�]";
		setpartyinmap TNM1_QUE,13;
		killmonster getmdmapname("1@tnm1.gat"),getmdnpcname("#tnm1stepmob")+ "::OnKilled";
		close;
	case 13:
		cutin "tnm_lucile02",2;
		mes "[���V��]";
		mes "�ӂ��c�c";
		mes "�\�z��葁���������悤�ł��B";
		mes "�����܂������H";
		mes "���ʂ̐l�Ԃ̑̂ƈ���Ė���";
		mes "���̂悤�ɏC�������Ȃ����";
		mes "�Ȃ�Ȃ���ł��B";
		unittalk "���V�� : �ӂ��c�c�\�z��葁���������悤�ł��B�����܂������H�@���ʂ̐l�Ԃ̑̂ƈ���Ė��񂱂̂悤�ɏC�������Ȃ���΂Ȃ�Ȃ���ł��B";
		next;
		mes "[���V��]";
		mes "�V������������̂ł�����";
		mes "�[�����邵������܂���B";
		mes "����͂����Ƃ��āc�c";
		mes "�����̔��������܂����H";
		unittalk "���V�� : �V������������̂ł�����[�����邵������܂���B����͂����Ƃ��āc�c�����̔��������܂����H";
		cutin "tnm_lucile01",2;
		next;
		mes "[���V��]";
		mes "���������Ȃ���";
		mes "���̐��E���댯�ł��B";
		unittalk "���V�� : ���������Ȃ��Ƃ��̐��E���댯�ł��B";
		close2;
		cutin "tnm_lucile02",255;
		setpartyinmap TNM1_QUE,14;
		initnpctimer;
		unittalk "���V�� : ����ł͎��͂���Ɏ��炵�܂��B���E���~�������̂ł���΁A�ꏏ�ɗ��ĉ������B";
		hideonnpc getmdnpcname("���V��#tnm02");
		end;
	}
OnTalk1:
	unittalk "���V�� : �c�c���҂������܂����B���̍ċN�������������悤�ł�";
	end;
OnTimer1000:
	stopnpctimer;
	donpcevent getmdnpcname("�A�T�V���E�q���[#hui02")+ "::OnTalk2";
	end;
}

1@tnm1.gat,135,99,5	script	�A�T�V���E�q���[#hui02	10002,{
	if(TNM1_QUE != 14) {
		mes "[�A�T�V���E�q���[]";
		mes "�o���񂪐S�z�ł��c�c�B";
		mes "^ff0000�@�B�ɋ߂���^000000�Ȃ�ł��B";
		mes "������";
		mes "�傫�ȕ���������Ɗ댯�Ȃ�ł��B";
		close;
	}
	mes "[�A�T�V���E�q���[]";
	mes "���̏�Ƀ^�i�g�X�l�����܂��I";
	mes "���V���o���񂪍�";
	mes "���ǂ��Ă���͂��ł��B";
	next;
	mes "[�A�T�V���E�q���[]";
	mes "���͂��Ă���������̂Ȃ�";
	mes "�����Ɍ������Ă��������܂����B";
	mes "�����ē����܂��B";
	next;
	if(select("�ړ�����","�ړ����Ȃ�") == 2) {
		mes "[�A�T�V���E�q���[]";
		mes "�c�c�����ł����B";
		close;
	}
	mes "[�A�T�V���E�q���[]";
	mes "������ł��B";
	mes "�C��t���ĉ������B";
	close2;
	warp getmdmapname("1@tnm2.gat"),90,86;
	end;
OnStart:
	areamonster getmdmapname("1@tnm1.gat"),129,91,152,114,"�U�f�̖��_�̉e",2939,5,getmdnpcname("�A�T�V���E�q���[#hui02")+ "::OnKilled";
	areamonster getmdmapname("1@tnm1.gat"),129,91,152,114,"�ȋ^�̖��_�̉e",2940,7,getmdnpcname("�A�T�V���E�q���[#hui02")+ "::OnKilled";
	areamonster getmdmapname("1@tnm1.gat"),129,91,152,114,"��O�̖��_�̉e",2941,4,getmdnpcname("�A�T�V���E�q���[#hui02")+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@tnm1.gat"),getmdnpcname("�A�T�V���E�q���[#hui02")+ "::OnKilled");
	if('@count <= 0) {
		initnpctimer;
		setpartyinmap TNM1_QUE,13;
	}
	end;
OnTimer1000:
	unittalk "�A�T�V���E�q���[ : �����̋C�z�������܂����I�@���̕ӂɂ��閂�������͑S�ē|�����悤�ł��I";
	end;
OnTimer3000:
	stopnpctimer;
	donpcevent getmdnpcname("���V��#tnm02")+ "::OnTalk1";
	end;
OnTalk1:
	unittalk "�A�T�V���E�q���[ : �o������A�C��t���ĉ������I�@�����ǂ����W�܂��Ă��܂��I";
	end;
OnTalk2:
	unittalk "�A�T�V���E�q���[ : �ˁc�c�o����c�c�B";
	end;
}

1@tnm2.gat,0,0,0	script	#tnm2topmob	128,{
OnStart:
	initnpctimer;
	set 'count,5;
	set 'stone,0;
	end;
OnTimer1000:
	announce "���_�̓���5�������疂�_�΂�����܂����B",0x9,0x00ff00;
	end;
OnTimer2000:
	monster getmdmapname("1@tnm2.gat"),68,167,"���_��#01",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	monster getmdmapname("1@tnm2.gat"),90,86,"���_��#02",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	monster getmdmapname("1@tnm2.gat"),190,86,"���_��#03",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	monster getmdmapname("1@tnm2.gat"),206,162,"���_��#04",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	monster getmdmapname("1@tnm2.gat"),142,214,"���_��#05",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer4000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),68-3,167-3,68+3,167+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),90-3,86-3,90+3,86+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),190-3,86-3,190+3,86+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),206-3,162-3,206+3,162+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),142-3,214-3,142+3,214+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	}
	end;
OnTimer5000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),68-3,167-3,68+3,167+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),90-3,86-3,90+3,86+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),190-3,86-3,190+3,86+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),206-3,162-3,206+3,162+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),142-3,214-3,142+3,214+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	}
	end;
OnTimer6000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer21000:
	announce "���V�� : ���_�΂�1��ڂ̈ړ����n�߂܂����B",0x9,0x00ff00;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer22000:
	if('stone & 0x1 == 0)
		monster getmdmapname("1@tnm2.gat"),78,165,"���_��#01",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	if('stone & 0x4 == 0)
		monster getmdmapname("1@tnm2.gat"),183,94,"���_��#03",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	if('stone & 0x10 == 0)
		monster getmdmapname("1@tnm2.gat"),140,205,"���_��#05",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer26000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer31000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer32000:
	if('stone & 0x2 == 0)
		monster getmdmapname("1@tnm2.gat"),96,95,"���_��#02",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	if('stone & 0x8 == 0)
		monster getmdmapname("1@tnm2.gat"),197,162,"���_��#04",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer34000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),78-3,165-3,78+3,165+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),96-3,95-3,96+3,95+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),183-3,94-3,183+3,94+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),197-3,162-3,197+3,162+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),140-3,205-3,140+3,205+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	}
	end;
OnTimer35000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),78-3,165-3,78+3,165+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),96-3,95-3,96+3,95+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),183-3,94-3,183+3,94+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),197-3,162-3,197+3,162+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),140-3,205-3,140+3,205+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	}
	end;
OnTimer46000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer51000:
	announce "���V�� : ���_�΂�2��ڂ̈ړ����n�߂܂����B",0x9,0x00ff00;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer52000:
	if('stone & 0x1 == 0)
		monster getmdmapname("1@tnm2.gat"),88,163,"���_��#01",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	if('stone & 0x4 == 0)
		monster getmdmapname("1@tnm2.gat"),174,103,"���_��#03",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	if('stone & 0x10 == 0)
		monster getmdmapname("1@tnm2.gat"),140,195,"���_��#05",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer61000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer62000:
	if('stone & 0x2 == 0)
		monster getmdmapname("1@tnm2.gat"),103,104,"���_��#02",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	if('stone & 0x8 == 0)
		monster getmdmapname("1@tnm2.gat"),188,161,"���_��#04",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer64000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),88-3,163-3,88+3,163+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),103-3,104-3,103+3,104+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),174-3,103-3,174+3,103+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),188-3,161-3,188+3,161+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),140-3,195-3,140+3,195+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	}
	end;
OnTimer65000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),88-3,163-3,88+3,163+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),103-3,104-3,103+3,104+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),174-3,103-3,174+3,103+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),188-3,161-3,188+3,161+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),140-3,195-3,140+3,195+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	}
	end;
OnTimer66000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer81000:
	announce "���V�� : ���_�΂�3��ڂ̈ړ����n�߂܂����B",0x9,0x00ff00;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer82000:
	if('stone & 0x1 == 0)
		monster getmdmapname("1@tnm2.gat"),98,160,"���_��#01",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	if('stone & 0x4 == 0)
		monster getmdmapname("1@tnm2.gat"),165,112,"���_��#03",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	if('stone & 0x10 == 0)
		monster getmdmapname("1@tnm2.gat"),140,185,"���_��#05",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer86000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer91000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer92000:
	if('stone & 0x2 == 0)
		monster getmdmapname("1@tnm2.gat"),110,110,"���_��#02",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	if('stone & 0x8 == 0)
		monster getmdmapname("1@tnm2.gat"),179,158,"���_��#04",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer94000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),98-3,160-3,98+3,160+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),110-3,110-3,110+3,110+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		//areamonster getmdmapname("1@tnm2.gat"),174-3,103-3,174+3,103+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),179-3,158-3,179+3,158+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
		areamonster getmdmapname("1@tnm2.gat"),140-3,185-3,140+3,185+3,"�U�f�̖��_�̉e",2939,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2939";
	}
	end;
OnTimer95000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	if(!'first) {
		areamonster getmdmapname("1@tnm2.gat"),98-3,160-3,98+3,160+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),110-3,110-3,110+3,110+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		//areamonster getmdmapname("1@tnm2.gat"),174-3,103-3,174+3,103+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),179-3,158-3,179+3,158+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
		areamonster getmdmapname("1@tnm2.gat"),140-3,185-3,140+3,185+3,"�ȋ^�̖��_�̉e",2940,2,getmdnpcname("#tnm2topmob")+ "::OnKilled2940";
	}
	end;
OnTimer106000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer111000:
	announce "���V�� : ���_�΂�4��ڂ̈ړ����n�߂܂����B",0x9,0x00ff00;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer112000:
	if('stone & 0x1 == 0)
		monster getmdmapname("1@tnm2.gat"),108,156,"���_��#01",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	if('stone & 0x4 == 0)
		monster getmdmapname("1@tnm2.gat"),157,120,"���_��#03",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	if('stone & 0x10 == 0)
		monster getmdmapname("1@tnm2.gat"),140,173,"���_��#05",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer121000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer122000:
	if('stone & 0x2 == 0)
		monster getmdmapname("1@tnm2.gat"),116,116,"���_��#02",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	if('stone & 0x8 == 0)
		monster getmdmapname("1@tnm2.gat"),170,155,"���_��#04",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer126000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer141000:
	announce "���V�� : ���_�΂�5��ڂ̈ړ����n�߂܂����B�@���낻��댯�ł�!!",0x9,0x00ff00;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer142000:
	if('stone & 0x1 == 0)
		monster getmdmapname("1@tnm2.gat"),118,152,"���_��#01",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	if('stone & 0x4 == 0)
		monster getmdmapname("1@tnm2.gat"),147,128,"���_��#03",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	if('stone & 0x10 == 0)
		monster getmdmapname("1@tnm2.gat"),139,161,"���_��#05",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer146000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer151000:
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer152000:
	if('stone & 0x2 == 0)
		monster getmdmapname("1@tnm2.gat"),122,122,"���_��#02",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	if('stone & 0x8 == 0)
		monster getmdmapname("1@tnm2.gat"),161,152,"���_��#04",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer166000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnEventTalk";
	announce "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I",0x9,0xff0000;
	donpcevent getmdnpcname("#tnm2flamecross")+ "::OnStart";
	end;
OnTimer171000:
	announce "���V�� : ���Ȃ�댯�ȏ�Ԃł��I�@�Ȃ�Ƃ��h���ł��������I",0x9,0xff0000;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer172000:
	if('stone & 0x1 == 0)
		monster getmdmapname("1@tnm2.gat"),126,148,"���_��#01",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	if('stone & 0x4 == 0)
		monster getmdmapname("1@tnm2.gat"),143,131,"���_��#03",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	if('stone & 0x10 == 0)
		monster getmdmapname("1@tnm2.gat"),138,150,"���_��#05",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer176000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnFail1";
	announce "���������N : ���͂͂͂͂́A���l�̗͂̌��Ђ�����I�@�����ɏW��!!",0x9,0xff0000;
	end;
OnTimer178000:
	donpcevent getmdnpcname("�^�i�g�X#tnm02")+ "::OnFail1";
	announce "�^�i�g�X : ����ȏ�A�ߊ�点��ȁI�@�����Ŏ~�߂�I",0x9,0x00ff00;
	end;
OnTimer181000:
	announce "���V�� : ����ȏ�͌��E�ł�!!!",0x9,0xff0000;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer182000:
	if('stone & 0x2 == 0)
		monster getmdmapname("1@tnm2.gat"),129,130,"���_��#02",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	if('stone & 0x8 == 0)
		monster getmdmapname("1@tnm2.gat"),144,148,"���_��#04",2938,1,getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	end;
OnTimer183000:
	donpcevent getmdnpcname("�^�i�g�X#tnm02")+ "::OnFail2";
	announce "�^�i�g�X : ��������Ă���񂾁I�@��������h��!!",0x9,0x00ff00;
	end;
OnTimer184000:
	announce "�]����Ɏ��s���܂����]",0x9,0x00ff00;
	end;
OnTimer185000:
	misceffect 17,getmdnpcname("�^�i�g�X#tnm02");
	misceffect 90,getmdnpcname("�^�i�g�X#tnm02");
	end;
OnTimer186000:
	donpcevent getmdnpcname("�^�i�g�X#tnm02")+ "::OnFail2";
	announce "�^�i�g�X : �����c�c!!�@������x���I�@���x�ł����O���~�߂Ă��!!�@�Ō�܂Œ��߂�ȁI",0x9,0x00ff00;
	set 'first,1;
	set 'count,5;
	set 'stone,0;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled1";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled2";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled3";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled4";
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2topmob")+ "::OnKilled5";
	end;
OnTimer189000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnFail2";
	announce "���������N : �܂����肸�Ɏז���������肩�I�@���̒�����ǂ���!!",0x9,0xff0000;
	end;
OnTimer191000:
	donpcevent getmdnpcname("���������N#tnm01")+ "::OnFail3";
	announce "���������N : �]�ݒʂ�ɍŌ�܂ł���Ă��I�@���l�̗͂̌��Ђ�����I�@�o�ė���!!",0x9,0xff0000;
	end;
OnTimer195000:
	initnpctimer;
	announce "�]�Ăі��_�΂�����܂����B�����N�ւ̐ڋ߂�h���܂��傤!!�]",0x9,0x00ff00;
	end;
OnKilled1:
	set 'stone,'stone | 0x1;
	donpcevent getmdnpcname("#tnm2topmob")+ "::OnStoneKilled";
	end;
OnKilled2:
	set 'stone,'stone | 0x2;
	donpcevent getmdnpcname("#tnm2topmob")+ "::OnStoneKilled";
	end;
OnKilled3:
	set 'stone,'stone | 0x4;
	donpcevent getmdnpcname("#tnm2topmob")+ "::OnStoneKilled";
	end;
OnKilled4:
	set 'stone,'stone | 0x8;
	donpcevent getmdnpcname("#tnm2topmob")+ "::OnStoneKilled";
	end;
OnKilled5:
	set 'stone,'stone | 0x10;
	donpcevent getmdnpcname("#tnm2topmob")+ "::OnStoneKilled";
	end;
OnStoneKilled:
	set 'count,'count-1;
	if('count == 0) {
		announce "���V�� : ���_�΂�S�Ĕj�󂵂��悤�ł��I�@����ȗ͂��Ԃ��肠���Ă��܂�!!",0x9,0x00ff00;
		stopnpctimer;
		for(set '@i,1;'@i<=8;set '@i,'@i+1)
			hideoffnpc getmdnpcname("#tnm�o���P�[�h" +'@i);
		areasetcell getmdmapname("1@tnm2.gat"),108,110,112,113,5;
		mapwarp getmdmapname("1@tnm2.gat"),getmdmapname("1@tnm2.gat"),139,133;
		donpcevent getmdnpcname("���������N#tnm01")+ "::OnStart";
	}
	else
		announce "���V�� : ���̒��q�ł��I�@�c��̖��_�΂͂���" +'count+ "�ł�!!",0x9,0x00ff00;
	end;
OnKilled2939:
OnKilled2940:
	// dummy
	end;
}

1@tnm2.gat,144,137,3	script	���V��#tnm03	667,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[���V��]";
		mes "���[�_�[�Ƙb�����Ă��܂��B";
		mes "��������Ă��Ă��������B";
		cutin "tnm_lucile01",2;
		close2;
		cutin "tnm_lucile01",255;
		end;
	}
	if(TNM1_QUE == 14) {
		cutin "tnm_lucile01",2;
		mes "[���V��]";
		mes "���傤�Ǘǂ��^�C�~���O�ł��ˁB";
		mes "����������Ē����܂����H";
		unittalk "���V�� : ���傤�Ǘǂ��^�C�~���O�ł��ˁB����������Ē����܂����H";
		next;
		mes "[���V��]";
		mes "��͂肠�̃����N�A���B���~�߂Ȃ����";
		mes "�Ȃ�Ȃ��悤�ł��ˁc�c�B";
		mes "���M�c�c����܂����H";
		unittalk "���V�� : ��͂肠�̃����N�A���B���~�߂Ȃ���΂Ȃ�Ȃ��悤�ł��ˁc�c�B���M�c�c����܂����H";
		next;
		cutin "tnm_lucile01",255;
		mes "[���������N]";
		mes "�����Ȑl�Ԃ߁c�c!!";
		mes "���̂܂܉��l�𑫎~�߂ł���Ƃł�";
		mes "�v���Ă���̂�!!";
		donpcevent getmdnpcname("���������N#tnm01")+ "::OnTalk1";
		next;
		mes "[���������N]";
		mes "�o�ł�I�@�䂪�e������I";
		mes "�ł̗͂ɋt�炤";
		mes "���ׂĂ̕���؂荏�߁I";
		donpcevent getmdnpcname("���������N#tnm01")+ "::OnTalk2";
		next;
		mes "[�^�i�g�X]";
		mes "�ӂ��A�����ɏ��������߂�Ƃ͂ȁB";
		donpcevent getmdnpcname("�^�i�g�X#tnm02")+ "::OnTalk1";
		next;
		cutin "tnm_lucile01",2;
		mes "[���V��]";
		mes "�^�i�g�X�l�A���Ȃ��������Ƃ���";
		mes "�킯�ł��Ȃ������ł���H";
		unittalk "���V�� : �^�i�g�X�l�A���Ȃ��������Ƃ����킯�ł��Ȃ������ł���H";
		next;
		cutin "tnm_lucile01",255;
		mes "[���������N]";
		mes "������������j�ł̏u�Ԃ�";
		mes "���|���邪�悢!!";
		donpcevent getmdnpcname("���������N#tnm01")+ "::OnTalk3";
		next;
		mes "[�^�i�g�X]";
		mes "���邳���I";
		mes "�������������ɒ��߂���ǂ����I";
		mes "���O���������������o������I";
		donpcevent getmdnpcname("�^�i�g�X#tnm02")+ "::OnTalk2";
		next;
		mes "[�^�i�g�X]";
		mes "���V���I�@��𗊂񂾂��I";
		mes "���������𕕈󂷂�܂ŁI";
		donpcevent getmdnpcname("�^�i�g�X#tnm02")+ "::OnTalk3";
		next;
		cutin "tnm_lucile01",2;
		mes "[���V��]";
		mes "�������܂����B";
		unittalk "���V��: �������܂����B";
		next;
		mes "[���V��]";
		mes "�����A�݂Ȃ���B";
		mes "���B�̂��ׂ����Ƃ����܂�܂����B";
		mes "���_�΂����荞�܂Ȃ��悤�A";
		mes "���������炵�Ă��������B";
		unittalk "���V�� : �����A�݂Ȃ���B���B�̂��ׂ����Ƃ����܂�܂����B���_�΂����荞�܂Ȃ��悤�A���������炵�Ă��������B";
		setpartyinmap TNM1_QUE,15;
		setquest 7573;
		hideonnpc getmdnpcname("���V��#tnm03");
		initnpctimer;
		close2;
		cutin "tnm_lucile01",255;
		end;
	}
	end;
OnTimer2000:
	announce "���V�� : ����5�������烂���N�ɃG�l���M�[��^����ׂ̖��_�΂��߂Â��Ă��Ă��܂�!!",0x9,0x00ff00,0x190,18,0,0;
	end;
OnTimer4000:
	stopnpctimer;
	donpcevent getmdnpcname("#tnm2topmob")+ "::OnStart";
	announce "���V�� : �����N�̂��Ƃɂ��ǂ���O�ɑS�ē|���Ă��������I",0x9,0x00ff00,0x190,18,0,0;
	end;
}

1@tnm2.gat,145,144,3	script	��#tnmtop	10005,{
	setpartyinmap TNM1_QUE,17;
	misceffect 10,getmdnpcname("��#tnmtop");
	hideonnpc getmdnpcname("��#tnmtop");
	// �ޖ��_�̏�A�ޖ��_�̋|�A�ޖ��_�̗��茕�A�ޖ��_�̃J�^�[���A�ޖ��_�̃n���}�[�A�ޖ��_�̒Z��
	// ���_�̘r��1�A���_�̒m��1�A���_�̐v��1�A���_�̗̑�1�A���_�̏W��1�A���_�̍K�^1
	setarray '@gain,2029,18131,21017,28009,28108,28707,4908,4911,4914,4917,4920,4923;
	setarray '@rate,8,8,10,8,10,8,1,1,1,1,1,1;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		for(set '@j,0; '@j<'@rate['@i]; set '@j,'@j+1) {
			set '@result['@k],'@gain['@i];
			set '@k,'@k+1;
		}
	}
	set '@x,145+rand(5)-2;
	set '@y,144+rand(5)-2;
	dropitem getmdmapname("1@tnm2.gat"),'@x,'@y,'@result[rand(getarraysize('@result))],1,0;
	set '@x,145+rand(5)-2;
	set '@y,144+rand(5)-2;
	dropitem getmdmapname("1@tnm2.gat"),'@x,'@y,'@result[rand(getarraysize('@result))],1,0;
	end;
}

1@tnm2.gat,144,137,3	script	���V��#tnm04	667,{
	switch(TNM1_QUE) {
	case 15:
		if(checkquest(114805) & 0x8 == 0) {
			delquest 7573;
			mes "�]���V���ɘb�������悤�Ƃ������̎�";
			mes "�@�s�v�c�ȗ͂ɐg���܂ꂽ�B";
			misceffect 35,"";
			setquest 114805;
			compquest 114805;
			misceffect 58,"";
			mes "�@^0000ff���_�̓������Ő��B�\�Ȍ�����";
			mes "�@�o���l���l���I^000000�]";
			set TNM_REFINE,TNM_REFINE+3;
			if(TNM_REFINE > 1000)
				set TNM_REFINE,1000;
			getexp 500000,0;
			getexp 500000,0;
			getexp 0,500000;
			next;
		}
		mes "[���V��]";
		mes "�ǂ���畕��̌��E��";
		mes "�󂻂��Ƃ��Ă������_�̗͂�";
		mes "�^�i�g�X�l�ƏՓ˂����悤�ł��B";
		mes "���S�ɐ����Ƃ�";
		mes "�����Ȃ������悤�ł��ˁB";
		cutin "tnm_lucile01",2;
		next;
		mes "�]�����J�����鎖�ɂ��A";
		mes "�@�_���W�����̐i�s���\�ƂȂ�܂��]";
		close2;
		cutin "tnm_lucile01",255;
		end;
	case 16:
	case 17:
		if(checkquest(114805) & 0x8 == 0) {
			delquest 7573;
			mes "�]���V���ɘb�������悤�Ƃ������̎�";
			mes "�@�s�v�c�ȗ͂ɐg���܂ꂽ�B";
			misceffect 35,"";
			setquest 114805;
			compquest 114805;
			misceffect 58,"";
			mes "�@^0000ff���_�̓������Ő��B�\�Ȍ�����";
			mes "�@�o���l���l���I^000000�]";
			set TNM_REFINE,TNM_REFINE+3;
			if(TNM_REFINE > 1000)
				set TNM_REFINE,1000;
			getexp 500000,0;
			getexp 500000,0;
			getexp 0,500000;
			next;
		}
		mes "[���V��]";
		mes "�ǂ���畕��̌��E��";
		mes "�󂻂��Ƃ��Ă������_�̗͂�";
		mes "�^�i�g�X�l�ƏՓ˂����悤�ł��B";
		mes "���S�ɐ����Ƃ�";
		mes "�����Ȃ������悤�ł��ˁB";
		cutin "tnm_lucile01",2;
		next;
		mes "[���V��]";
		mes "���̏Ռ��Ń����N�́A";
		mes "���Ȃ�c�c��̕���";
		mes "���ōs���܂����ˁB";
		mes "�ǂ��܂����H";
		next;
		switch(select("�ǂ�","�O�ɏo��","��߂�")) {
		case 1:
			mes "[���V��]";
			mes "�ǂ������_�𖳎���";
			mes "����ł��܂��悤�Ɂc�c�B";
			mes "�����^���c�c�B";
			next;
			mes "�]�����N��ǂ��ׁA";
			mes "�@��֌��������Ƃ�����";
			mes "�@�˔@�A�����ɗ��ꂪ�������]";
			misceffect 432,"";
			misceffect 174,"";
			misceffect 899,"";
			close2;
			cutin "tnm_lucile01",255;
			warp getmdmapname("1@tnm3.gat"),21,171;
			end;
		case 2:
			mes "[���V��]";
			mes "�{���ɒǐՂ���߂Ă��܂��̂ł����H";
			cutin "tnm_lucile02",2;
			next;
			if(select("�͂�","������") == 2) {
				mes "[���V��]";
				mes "�킩��܂����B";
				mes "�o�傪���܂�܂�����";
				mes "�����Ă��������B";
				close2;
				cutin "tnm_lucile01",255;
				end;
			}
			mes "[���V��]";
			mes "�����ł����c�c�B";
			mes "�������A���Ȃ���";
			mes "���E�̂悤�ł��ˁB";
			close2;
			cutin "tnm_lucile01",255;
			warp "dali.gat",134,112;
			end;
		case 3:
			mes "[���V��]";
			mes "�킩��܂����B";
			mes "�o�傪���܂�܂�����";
			mes "�����Ă��������B";
			close2;
			cutin "tnm_lucile01",255;
			end;
		}
	}
	end;
OnTalk1:
	unittalk "���V�� : ����ɐ����c�c�����c�c�H";
	end;
}

1@tnm2.gat,136,139,5	script	���������N#tnm01	1916,{
	end;
OnTalk1:
	unittalk "���������N : �����Ȑl�Ԃ߁c�c!!�@���̂܂܉��l�𑫎~�߂ł���Ƃł��v���Ă���̂�!!";
	end;
OnTalk2:
	unittalk "���������N : �o�ł�I�@�䂪�e������I�@�ł̗͂ɋt�炤���ׂĂ̕���؂荏�߁I";
	end;
OnTalk3:
	unittalk "���������N : ������������j�ł̏u�Ԃɋ��|���邪�悢!!";
	end;
OnEventTalk:
	unittalk "���������N : �ӂ͂͂́I�@�ܔM�̉��ɏĂ���邪�悢�I";
	end;
OnFail1:
	unittalk "���������N : ���͂͂͂͂́A���l�̗͂̌��Ђ�����I�@�����ɏW��!!";
	end;
OnFail2:
	unittalk "���������N : �܂����肸�Ɏז���������肩�I�@���̒�����ǂ���!!";
	end;
OnFail3:
	unittalk "���������N : �]�ݒʂ�ɍŌ�܂ł���Ă��I�@���l�̗͂̌��Ђ�����I�@�o�ė���!!";
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	unittalk "���������N : ���c�c����Ȃ͂����I�@���������M�l�́c�c�M�l�̐��̂͂Ȃ�!!";
	end;
OnTimer6000:
	donpcevent getmdnpcname("�^�i�g�X#tnm02")+ "::OnTalk4";
	end;
OnTimer8000:
	misceffect 90,getmdnpcname("�^�i�g�X#tnm02");
	end;
OnTimer10000:
	stopnpctimer;
	hideonnpc getmdnpcname("�^�i�g�X#tnm02");
	hideonnpc getmdnpcname("���������N#tnm01");
	hideoffnpc getmdnpcname("��#tnmtop");
	hideoffnpc getmdnpcname("���V��#tnm04");
	donpcevent getmdnpcname("���V��#tnm04")+ "::OnTalk1";
	end;
}

1@tnm2.gat,142,139,3	script	�^�i�g�X#tnm02	10009,{
	if(TNM1_QUE == 14) {
		emotion 6,getmdnpcname("�^�i�g�X#tnm02");
		end;
	}
	if(TNM1_QUE == 15) {
		unittalk "�^�i�g�X : �����ȁc�c���͘b���Ă�]�T���Ȃ��񂾁B";
		end;
	}
	end;
OnTalk1:
	unittalk "�^�i�g�X : �ӂ��A�����ɏ��������߂�Ƃ͂ȁB";
	end;
OnTalk2:
	unittalk "�^�i�g�X : ���邳���I�@�������������ɒ��߂���ǂ����I�@���O���������������o������I";
	end;
OnTalk3:
	unittalk "�^�i�g�X : ���V���I�@��𗊂񂾂��I�@���������𕕈󂷂�܂ŁI";
	end;
OnTalk4:
	unittalk "�^�i�g�X : �����������܂ł���!!�@����ŏI��肾!!! ";
	end;
OnFail1:
	unittalk "�^�i�g�X : ����ȏ�A�ߊ�点��ȁI�@�����Ŏ~�߂�I";
	end;
OnFail2:
	unittalk "�^�i�g�X : ��������Ă���񂾁I�@��������h��!!";
	end;
OnFail3:
	unittalk "�^�i�g�X : �����c�c!!�@������x���I�@���x�ł����O���~�߂Ă��!!�@�Ō�܂Œ��߂�ȁI";
	end;
}

1@tnm2.gat,0,0,0	script	#tnm2flamecross	139,{
OnStart:
	initnpctimer;
	end;
OnTimer300:
	monster getmdmapname("1@tnm2.gat"),126,149," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),128,130," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),145,130," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),146,149," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),138,151," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer600:
	monster getmdmapname("1@tnm2.gat"),122,151," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),125,127," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),148,126," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),150,151," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),138,160," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer900:
	monster getmdmapname("1@tnm2.gat"),118,153," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),122,124," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),151,122," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),155,152," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,165," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer1200:
	monster getmdmapname("1@tnm2.gat"),113,154," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),118,121," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),156,120," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),148,149," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,165," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer1500:
	monster getmdmapname("1@tnm2.gat"),107,156," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),115,118," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),160,117," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),162,153," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,170," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer1800:
	monster getmdmapname("1@tnm2.gat"),101,158," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),112,115," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),164,113," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),167,154," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,176," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer2100:
	monster getmdmapname("1@tnm2.gat"),96,160," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),109,110," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),168,109," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),173,156," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,181," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer2400:
	monster getmdmapname("1@tnm2.gat"),91,161," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),106,106," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),172,105," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),179,158," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,186," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer2600:
	monster getmdmapname("1@tnm2.gat"),86,162," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),102,102," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//2
	monster getmdmapname("1@tnm2.gat"),176,101," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),185,160," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,191," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer3000:
	monster getmdmapname("1@tnm2.gat"),81,163," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//1
	monster getmdmapname("1@tnm2.gat"),99,98," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";		//2
	monster getmdmapname("1@tnm2.gat"),180,97," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//3
	monster getmdmapname("1@tnm2.gat"),191,161," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//4
	monster getmdmapname("1@tnm2.gat"),140,196," ",2960,1,getmdnpcname("#tnm2flamecross")+ "::OnKilled";	//5
	end;
OnTimer8000:
	stopnpctimer;
	killmonster getmdmapname("1@tnm2.gat"),getmdnpcname("#tnm2flamecross")+ "::OnKilled";
	end;
}

1@tnm2.gat,109,113,0	script	#tnm�o���P�[�h1	1905,{}
1@tnm2.gat,110,112,0	script	#tnm�o���P�[�h2	1905,{}
1@tnm2.gat,111,111,0	script	#tnm�o���P�[�h3	1905,{}
1@tnm2.gat,112,110,0	script	#tnm�o���P�[�h4	1905,{}
1@tnm2.gat,108,113,0	script	#tnm�o���P�[�h5	1905,{}
1@tnm2.gat,109,112,0	script	#tnm�o���P�[�h6	1905,{}
1@tnm2.gat,110,111,0	script	#tnm�o���P�[�h7	1905,{}
1@tnm2.gat,111,110,0	script	#tnm�o���P�[�h8	1905,{}

1@tnm3.gat,21,171,0	script	#tnm3event01	139,1,1,{
	hideonnpc getmdnpcname("#tnm3event01");
	announce "���̎q�̋��� : ���Ⴀ�����I�@��������!!�@�N��������!!",0x9,0x00ff00;
	donpcevent getmdnpcname("���̎q#tnm01")+ "::OnStart";
	end;
}

1@tnm3.gat,43,175,3	script	���̎q#tnm01	941,{
	set '@count,getmapmobs(getmdmapname("1@tnm3.gat"),getmdnpcname("���̎q#tnm01")+ "::OnKilled");
	if('@count > 0) {
		mes "[���̎q]";
		mes "�ǂ����ď�̒��ɖ����������c�c�B";
		mes "�����ĉ�����!!";
		close;
	}
	if(TNM1_QUE == 17) {
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[���̎q]";
			mes "�c�c�����Ȃ薂���������";
			mes "�{���ɕ|��������ł��B";
			close;
		}
		mes "[���̎q]";
		mes "�����Ȃ�ǂ�����";
		mes "��ɖ��������ꂽ�񂾂낤�c�c�B";
		mes "�x�����̂������񂽂���";
		mes "�����ς������������������c�c�B";
		unittalk "���̎q : �����Ȃ�ǂ����ď�ɖ��������ꂽ�񂾂낤�c�c�B�x�����̂������񂽂��������ς������������������c�c�B";
		next;
		menu "�����͉����Ȃ́H",-;
		unittalk getcharid(3),strcharinfo(0)+" : �����͉����Ȃ́H";
		mes "[���̎q]";
		mes "�H";
		mes "�����̓����N�ł��B";
		mes "�����Ă��̏�̓����N��ł���B";
		unittalk "���̎q : �H�@�����̓����N�ł��B�����Ă��̏�̓����N��ł���B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�����N��H";
		unittalk getcharid(3),strcharinfo(0)+" : �����N��H";
		next;
		mes "[���̎q]";
		mes "�����ł���B";
		mes "���̃p�p�̓����N�̗̎�l�Ȃ̂ł��B";
		unittalk "���̎q : �����ł���B���̃p�p�̓����N�̗̎�l�Ȃ̂ł��B";
		next;
		mes "�]���V�����������ォ��";
		mes "�@�����Ԏ��Ԃ��o�߂��Ă���悤���]";
		unittalk getcharid(3),strcharinfo(0)+" : �]���V�����������ォ�炾���Ԏ��Ԃ��o�߂��Ă���悤���]";
		next;
		mes "[�̎�̖�]";
		mes "�ǂ���������";
		mes "�N���Ă���悤�Ȃ�ł��c�c�B";
		mes "�n��������ςȉ���";
		mes "�����������āc�c�B";
		unittalk "�̎�̖� : �ǂ����������N���Ă���悤�Ȃ�ł��c�c�B�n��������ςȉ��������������āc�c�B";
		next;
		mes "[�̎�̖�]";
		mes "�������𒅂����Z���񂽂���";
		mes "���ɓ��������ǁA�߂��Ă��܂���B";
		mes "���̏�ŉ����N���Ă����ł����H";
		unittalk "�̎�̖� : �������𒅂����Z���񂽂������ɓ��������ǁA�߂��Ă��܂���B���̏�ŉ����N���Ă����ł����H";
		next;
		mes "[�̎�̖�]";
		mes "�p�p�c�c�B";
		mes "�p�p�͖����ł���̂��ȁc�c�B";
		unittalk "�̎�̖� : �p�p�c�c�B�p�p�͖����ł���̂��ȁc�c�B";
		next;
		mes "[�̎�̖�]";
		mes "�������Ɍ�����{�I�̌��ɂ���";
		mes "�ʘH���炳��ɉ��̕��܂�";
		mes "�~��čs�����Ƃ��ł��܂��I";
		mes "�����A��čs���ĉ������I";
		mes "���肢���܂��I";
		unittalk "�̎�̖� : �������Ɍ�����{�I�̌��ɂ���ʘH���炳��ɉ��̕��܂ō~��čs�����Ƃ��ł��܂��I�@�����A��čs���ĉ������I�@���肢���܂��I";
		setpartyinmap TNM1_QUE,18;
		misceffect 35,getmdnpcname("#tnm3gate01");
		hideoffnpc getmdnpcname("#tnm3gate01");
		close;
	}
	mes "[�̎�̖�]";
	mes "�������Ɍ�����{�I��";
	mes "�閧�̒ʘH�ƌq�����Ă��܂��B";
	mes "�ꏏ�ɘA��čs���ĉ������B";
	mes "���肢���܂��c�c�B";
	mes "�p�p���c�c�S�z�Ȃ̂ł��c�c�B";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	monster getmdmapname("1@tnm3.gat"),37,175,"�U�f�̖��_�̉e",2939,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),39,173,"�U�f�̖��_�̉e",2939,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),41,171,"�U�f�̖��_�̉e",2939,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	end;
OnTimer2000:
	monster getmdmapname("1@tnm3.gat"),32,176,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),30,178,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),32,180,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	end;
OnTimer5000:
	monster getmdmapname("1@tnm3.gat"),30,173,"��O�̖��_�̉e",2941,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),32,175,"��O�̖��_�̉e",2941,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),34,173,"��O�̖��_�̉e",2941,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	end;
OnTimer6000:
	set 'flag,1;
	stopnpctimer;
	monster getmdmapname("1@tnm3.gat"),30,184,"��O�̖��_�̉e",2941,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),32,182,"��O�̖��_�̉e",2941,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),34,180,"��O�̖��_�̉e",2941,1,getmdnpcname("���̎q#tnm01")+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@tnm3.gat"),getmdnpcname("���̎q#tnm01")+ "::OnKilled");
	if('flag && '@count <= 0) {
		unittalk "���̎q : ���肪�Ƃ��������܂��c�c�B�����ǂǂ����Ė������c�c�B";
	}
	end;
}

1@tnm3.gat,50,176,0	warp	#tnm3gate01	1,1,1@tnm3.gat,85,178

1@tnm3.gat,85,178,0	script	#tnm3event02ect	139,1,1,{
	hideonnpc getmdnpcname("#tnm3event02ect");
	hideoffnpc getmdnpcname("�̎�̖�#tnm02");
	donpcevent getmdnpcname("�̎�̖�#tnm02")+ "::OnStart";
	end;
}

1@tnm3.gat,89,179,4	script	�̎�̖�#tnm02	941,{
	mes "[�̎�̖�]";
	mes "�ǂ����ċ}�ɂ���Ȃ�";
	mes "��������̖����������c�c�B";
	close;
OnStart:
	initnpctimer;
	unittalk "�̎�̖� : �����������ĉ������I�@����������܂����I�@���ꂶ���̒����������炯�ɂȂ肻���ł��I";
	monster getmdmapname("1@tnm3.gat"),97,173,"�U�f�̖��_�̉e",2939,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),96,170,"�U�f�̖��_�̉e",2939,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),94,164,"�U�f�̖��_�̉e",2939,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	end;
OnTimer1000:
	monster getmdmapname("1@tnm3.gat"),100,170,"�U�f�̖��_�̉e",2939,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),102,166,"�U�f�̖��_�̉e",2939,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	end;
OnTimer3000:
	monster getmdmapname("1@tnm3.gat"),101,171,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),102,172,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),105,178,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),104,177,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),106,173,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	end;
OnTimer5000:
	monster getmdmapname("1@tnm3.gat"),110,167,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),111,165,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),113,165,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),104,168,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	end;
OnTimer8000:
	set 'flag,1;
	stopnpctimer;
	monster getmdmapname("1@tnm3.gat"),121,170,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),122,171,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),123,170,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),125,173,"��O�̖��_�̉e",2941,1,getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@tnm3.gat"),getmdnpcname("�̎�̖�#tnm02")+ "::OnKilled");
	if('flag && '@count <= 0) {
		stopnpctimer;	//custom
		unittalk "�̎�̖� : ���̘L�����Ō�܂ōs���Ƃ���ɒn���܂ōs����������܂��I";
		announce "�̎�̖� : ���̘L�����Ō�܂ōs���Ƃ���ɒn���܂ōs����������܂��I",0x9,0x00ff00;
		hideonnpc getmdnpcname("�̎�̖�#tnm02");
		hideoffnpc getmdnpcname("�̎�̖�#tnm03");
		hideoffnpc getmdnpcname("#tnm3gate02");
	}
	end;
}

1@tnm3.gat,128,164,3	script	�̎�̖�#tnm03	941,{
	mes "[�̎�̖�]";
	mes "��������͎����ڂ�������܂���B";
	mes "�����ƊK�i�������܂��ˁc�c�B";
	mes "����قǂɖ����������̂������";
	mes "�p�p���댯�Ȃ͂��ł��I";
	mes "�ǂ����p�p��";
	mes "�����ĉ������c�c�B";
	close;
}

1@tnm3.gat,134,156,0	warp	#tnm3gate02	1,1,1@tnm3.gat,169,165

1@tnm3.gat,179,172,3	script	��O�̖��_�̉e#tnm3	2941,10,10,{
	end;
OnTouch:
	if(TNM1_QUE == 18) {
		initnpctimer;
		setpartyinmap TNM1_QUE,19;
	}
	end;
OnTimer3000:
	unittalk "��O�̖��_�̉e : �܂����A���̏�ɔE�э��ޖ��m�炸������Ƃ͂ȁc�c�B";
	end;
OnTimer6000:
	unittalk "��O�̖��_�̉e : �ǂ�����ē����ė����̂��͒m��Ȃ����A�_���ȋV���͎ז������񂼁B";
	end;
OnTimer9000:
	unittalk "��O�̖��_�̉e : �o�ł�I�@�䂪�Z�킽����!!";
	hideonnpc getmdnpcname("��O�̖��_�̉e#tnm3");
	monster getmdmapname("1@tnm3.gat"),179,172,"��O�̖��_�̉e",2941,1,getmdnpcname("#tnm3mobdead")+ "::OnKilled";
	end;
OnTimer10000:
	monster getmdmapname("1@tnm3.gat"),177,175,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("#tnm3mobdead")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),179,170,"�ȋ^�̖��_�̉e",2940,1,getmdnpcname("#tnm3mobdead")+ "::OnKilled";
	end;
OnTimer11000:
	stopnpctimer;
	donpcevent getmdnpcname("#tnm3mobdead")+ "::OnStart";
	monster getmdmapname("1@tnm3.gat"),182,172,"�U�f�̖��_�̉e",2939,1,getmdnpcname("#tnm3mobdead")+ "::OnKilled";
	monster getmdmapname("1@tnm3.gat"),182,170,"�U�f�̖��_�̉e",2939,1,getmdnpcname("#tnm3mobdead")+ "::OnKilled";
	end;
}
1@tnm3.gat,1,1,0	script	#tnm3mobdead	139,{
	end;
OnStart:
	set 'flag,1;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@tnm3.gat"),getmdnpcname("#tnm3mobdead")+ "::OnKilled");
	if('flag && '@count <= 0) {
		misceffect 35,getmdnpcname("#tnm3gate03");
		hideoffnpc getmdnpcname("#tnm3gate03");
	}
	end;
}

1@tnm3.gat,183,177,0	warp	#tnm3gate03	1,1,1@tnm3.gat,97,6

1@tnm3.gat,97,18,3	script	�U�f�̖��_�̉e#tnm3	2939,12,12,{
	end;
OnTouch:
	if(TNM1_QUE == 19) {
		initnpctimer;
		setpartyinmap TNM1_QUE,20;
	}
	end;
OnTimer1000:
	unittalk "�U�f�̖��_�̉e : ���O���������̑����̌������H";
	end;
OnTimer4000:
	unittalk "�U�f�̖��_�̉e : �܂��A�������Ă����B���O�����͂����Ŏ��ʂ̂��B";
	end;
OnTimer7000:
	unittalk "�U�f�̖��_�̉e : ���O�����̌��𖂐_�ɕ����鎖�ɂ���!!";
	hideonnpc getmdnpcname("�U�f�̖��_�̉e#tnm3");
	monster getmdmapname("1@tnm3.gat"),97,18,"�U�f�̖��_�̉e",2939,1;
	end;
OnTimer8000:
	set '@map$,getmdmapname("1@tnm3.gat");
	monster '@map$,95+rand(5),16+rand(5),"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,95+rand(5),16+rand(5),"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,112,18,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,112,20,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,112,22,"��O�̖��_�̉e",2941,1;
	monster '@map$,113,23,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,114,13,"��O�̖��_�̉e",2941,1;
	monster '@map$,115,11,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,119,20,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,113,20,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,117,19,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,77,18,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,82,18,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,78,14,"��O�̖��_�̉e",2941,1;
	monster '@map$,71,18,"��O�̖��_�̉e",2941,1;
	monster '@map$,69,16,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,67,19,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,63,42,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,63,43,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,60,46,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,60,49,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,62,50,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,56,50,"��O�̖��_�̉e",2941,1;
	monster '@map$,75,67,"��O�̖��_�̉e",2941,1;
	monster '@map$,78,71,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,77,71,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,78,72,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,60,73,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,57,73,"��O�̖��_�̉e",2941,1;
	monster '@map$,62,73,"��O�̖��_�̉e",2941,1;
	monster '@map$,79,73,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,64,74,"�ȋ^�̖��_�̉e",2940,1;
	monster '@map$,60,75,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,60,77,"�U�f�̖��_�̉e",2939,1;
	monster '@map$,80,67,"��O�̖��_�̉e",2941,1;
	stopnpctimer;
	end;
}

1@tnm3.gat,93,52,4	script	�����N�̗̎�#moclord01	106,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�����N�̗̎�]";
		mes "�l�Y�~�̐��̂̓A�T�V�����H";
		mes "�c�c���ɂ�����悤���ȁB";
		mes "���тɂȂ�ׂɗ����̂��H";
		close;
	}
	mes "[�����N�̗̎�]";
	mes "�l�Y�~�̐��̂̓A�T�V�����H";
	mes "�c�c���ɂ�����悤���ȁB";
	mes "���тɂȂ�ׂɗ����̂��H";
	unittalk "�����N�̗̎� : �l�Y�~�̐��̂̓A�T�V�����H�c�c���ɂ�����悤���ȁB���тɂȂ�ׂɗ����̂��H";
	next;
	mes "[���L]";
	mes "����x��̕��������_�Ȃ񂩂�";
	mes "�ĂыN�����Ăǂ�������肾�H";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk1";
	cutin "ep14_roki01",2;
	next;
	mes "[���L]";
	mes "�������ŉ����܂�����͂߂�";
	mes "�Ȃ����܂�������˂����B";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk2";
	next;
	mes "[�����N�̗̎�]";
	mes "�ǂ��������Ƃ��c�c�H";
	mes "�A�T�V���M���h�̌N�����́A";
	mes "���E�̗͂̋ύt���ێ����鎖��";
	mes "��ڂł͂Ȃ��̂��H";
	unittalk "�����N�̗̎� : �ǂ��������Ƃ��c�c�H�@�A�T�V���M���h�̌N�����́A���E�̗͂̋ύt���ێ����鎖����ڂł͂Ȃ��̂��H";
	cutin "ep14_roki01",255;
	next;
	mes "[�����N�̗̎�]";
	mes "�͂̋ύt��ۂׂɂ�";
	mes "���_�̕������K�v�Ȃ̂��I�A";
	mes "���l�܂ł��_�X�̃I���`����";
	mes "�Ȃ��Ă��܂������̐��E�Ɂc�c�B";
	unittalk "�����N�̗̎� : �͂̋ύt��ۂׂɂ͖��_�̕������K�v�Ȃ̂��I�@���l�܂ł��_�X�̃I���`���ɂȂ��Ă��܂������̐��E�Ɂc�c�B";
	next;
	mes "[�����N�̗̎�]";
	mes "�_�́c�c";
	mes "���������ǂ��������Ȃ̂��A";
	mes "�m���Ă���̂��H";
	unittalk "�����N�̗̎� : �_�́c�c���������ǂ��������Ȃ̂��m���Ă���̂��H";
	next;
	mes "[�����N�̗̎�]";
	mes "�z��͌��A�����A���`�Ƃ������ڂ̉���";
	mes "�l�Ԃ��c�c����A���̐��E�S�̂��c�c�B";
	unittalk "�����N�̗̎� : �z��́c�c���A�����A���`�Ƃ������ڂ̉��ɐl�Ԃ��c�c����A���̐��E�S�̂��c�c�B";
	next;
	mes "[���L]";
	mes "�ق�I";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk3";
	cutin "ep14_roki01",2;
	next;
	mes "[���L]";
	mes "�_�X���ǂ��ł���A";
	mes "�������ǂ��ł���c�c";
	mes "���O�͂����Ŏ��ʁB";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk4";
	next;
	mes "[���L]";
	mes "���ꂪ���̔C��������ȁB";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk5";
	next;
	mes "[�����N�̗̎�]";
	mes "����Łc�c���̂�����Ȃ��C����";
	mes "�ʂ����Ă݂���ƁH";
	unittalk "�����N�̗̎� : ����Łc�c���̂�����Ȃ��C�����ʂ����Ă݂���ƁH";
	cutin "ep14_roki01",255;
	next;
	mes "[���L]";
	mes "���_!!";
	cutin "ep14_roki01",2;
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk6";
	misceffect 55,getmdnpcname("���L#tnmloki01");
	next;
	mes "[���L]";
	mes "�}�C���h�u���X�^�[!!";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk7";
	next;
	mes "[�̎�̖�]";
	mes "��߂ĉ������I";
	mes "�p�p���E���Ȃ���!!";
	cutin "ep14_roki01",255;
	misceffect 135,getmdnpcname("�̎�̖�#tnm04");
	donpcevent getmdnpcname("�̎�̖�#tnm04")+ "::OnTalk1";
	hideoffnpc getmdnpcname("�̎�̖�#tnm04");
	next;
	mes "[���L]";
	mes "�Ȃ��c�c!?";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk8";
	cutin "ep14_roki01",2;
	next;
	mes "[�����N�̗̎�]";
	mes "����͂���̓t�t�t�c�c";
	mes "�悭�_��Ȃ��Ƃ˂��`�A";
	mes "�A�T�V���搶�B";
	unittalk "�����N�̗̎� : ����͂���̓t�t�t�c�c�悭�_��Ȃ��Ƃ˂��`�A�A�T�V���搶�B";
	cutin "ep14_roki01",255;
	next;
	mes "[�̎�̖�]";
	mes "�����c�c�����́c�c";
	mes "�ԈႢ����c�c�B";
	donpcevent getmdnpcname("�̎�̖�#tnm04")+ "::OnTalk2";
	next;
	mes "[�̎�̖�]";
	mes "�p�p�́c�c�{���́c�c";
	mes "����Ȃ��Ƃ��c�c����悤�ȁA";
	mes "�l�ł́c�c�Ȃ��c�c�́c�c�B";
	donpcevent getmdnpcname("�̎�̖�#tnm04")+ "::OnTalk3";
	next;
	mes "[���L]";
	mes "�Ȃ����΂���!?";
	mes "�l�Ԃ͎��܁A����s�\�ȍs�����N�����B";
	mes "���ꂪ�S�Ƃ������̂Ȃ̂��H";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk9";
	cutin "ep14_roki01",2;
	next;
	mes "[�����N�̗̎�]";
	mes "����s�\���c�c�m���ɂ������ȁB";
	mes "�����l�Ԃ͋]���ƌĂԁB";
	unittalk "�����N�̗̎� : ����s�\���c�c�m���ɂ������ȁB�����l�Ԃ͋]���ƌĂԁB";
	cutin "ep14_roki01",255;
	next;
	mes "[�����N�̗̎�]";
	mes "�����������I";
	mes "����Ȃ��̂ɂ͉��̈Ӗ���";
	mes "�Ȃ��񂾂悧�`�I";
	mes "�E�n�n�n�n�n�b�b!!";
	unittalk "�����N�̗̎� : �����������I�@����Ȃ��̂ɂ͉��̈Ӗ����Ȃ��񂾂悧�`�I�@�E�n�n�n�n�n�b�b!!";
	next;
	mes "[�����N�̗̎�]";
	mes "���҂ǂ��߂�!!";
	mes "�����ŋ����邪����!!";
	mes "���_�̕����͎ז������񂼁[�[�[��!!";
	mes "�N�A�A�A�A�A�b�b!!";
	unittalk "�����N�̗̎� : ���҂ǂ��߂�!!�@�����ŋ����邪����!!�@���_�̕����͎ז������񂼁[�[�[��!!�@�N�A�A�A�A�A�b�b!!";
	misceffect 225,getmdnpcname("�����N�̗̎�#moclord01");
	next;
	mes "[���L]";
	mes "�c�c���������f�肾�B";
	donpcevent getmdnpcname("���L#tnmloki01")+ "::OnTalk10";
	cutin "ep14_roki01",2;
	close2;
	cutin "ep14_roki01",255;
	hideonnpc getmdnpcname("�����N�̗̎�#moclord01");
	hideonnpc getmdnpcname("�̎�̖�#tnm04");
	hideonnpc getmdnpcname("���L#tnmloki01");
	hideoffnpc getmdnpcname("���L#tnmloki02");
	end;
}

1@tnm3.gat,95,50,4	script	�̎�̖�#tnm04	941,{
	end;
OnTalk1:
	unittalk "�̎�̖� : ��߂ĉ������I�@�p�p���E���Ȃ���!!";
	end;
OnTalk2:
	unittalk "�̎�̖� : �����c�c�����́c�c�ԈႢ����c�c�B";
	end;
OnTalk3:
	unittalk "�̎�̖� : �p�p�́c�c�{���́c�c����Ȃ��Ƃ��c�c����悤�ȁA�l�ł́c�c�Ȃ��c�c�́c�c�B";
	end;
}

1@tnm3.gat,98,47,3	script	���L#tnmloki01	512,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[���L]";
		mes "�{���ɐg����ȓz���ȁB";
		cutin "ep14_roki01",2;
		close2;
		cutin "ep14_roki01",255;
		end;
	}
	end;
OnTalk1:
	unittalk "���L : ����x��̕��������_�Ȃ񂩂��ĂыN�����Ăǂ�������肾�H";
	end;
OnTalk2:
	unittalk "���L : �������ŉ����܂�����͂߂ɂȂ����܂�������˂����B";
	end;
OnTalk3:
	unittalk "���L : �ق�I";
	end;
OnTalk4:
	unittalk "���L : �_�X���ǂ��ł���A�������ǂ��ł���c�c���O�͂����Ŏ��ʁB";
	end;
OnTalk5:
	unittalk "���L : ���ꂪ���̔C��������ȁB";
	end;
OnTalk6:
	unittalk "���L : ���_!!";
	end;
OnTalk7:
	unittalk "���L : �}�C���h�u���X�^�[!!";
	end;
OnTalk8:
	unittalk "���L : �Ȃ��c�c!?";
	end;
OnTalk9:
	unittalk "���L : �Ȃ����΂���!?�@�l�Ԃ͎��܁A����s�\�ȍs�����N�����B���ꂪ�S�Ƃ������̂Ȃ̂��H";
	end;
OnTalk10:
	unittalk "���L : �c�c���������f�肾�B";
	end;
}

1@tnm3.gat,0,0,0	script	#tnm3finalmob	139,{
OnStart:
	set 'mob,callmonster(getmdmapname("1@tnm3.gat"),97,75,"���_�̋��e",2942,getmdnpcname("#tnm3finalmob")+"::OnKilled");
	end;
OnCrossEff:
	if('mob) {
		getmapxy '@map$,'@x,'@y,3,'mob;
		unittalk 'mob,"���_�̋��e : �ǂ����I�@�n���̉���!!";
		for(set '@i,3;'@i<=12;set '@i,'@i+3) {
			set '@effmob['@j+0],callmonster(getmdmapname("1@tnm3.gat"),'@x+'@i,'@y+'@i," ",2960);
			set '@effmob['@j+1],callmonster(getmdmapname("1@tnm3.gat"),'@x+'@i,'@y-'@i," ",2960);
			set '@effmob['@j+2],callmonster(getmdmapname("1@tnm3.gat"),'@x-'@i,'@y+'@i," ",2960);
			set '@effmob['@j+3],callmonster(getmdmapname("1@tnm3.gat"),'@x-'@i,'@y-'@i," ",2960);
			set '@j,'@j+4;
			sleep 300;
		}
		sleep 5000;
		for(set '@i,0;'@i<='@j;set '@i,'@i+4) {
			if('@effmob['@i+0])
				set '@dummy,removemonster('@effmob['@i+0]);
			if('@effmob['@i+1])
				set '@dummy,removemonster('@effmob['@i+1]);
			if('@effmob['@i+2])
				set '@dummy,removemonster('@effmob['@i+2]);
			if('@effmob['@i+3])
				set '@dummy,removemonster('@effmob['@i+3]);
			sleep 300;
		}
	}
	end;
OnCircleEff:
	if('mob) {
		getmapxy '@map$,'@x,'@y,3,'mob;
		unittalk 'mob,"���_�̋��e : ����͂͂͂͂�!!";
		setarray '@dx,-3,3,9,9,6, 0,-12,-12,-9,-3,6;
		setarray '@dy,3,6,0,-3,-9,-12,-3, 3,9,15,18;
		for(set '@i,0;'@i<getarraysize('@dx);set '@i,'@i+1) {
			set '@effmob['@i],callmonster(getmdmapname("1@tnm3.gat"),'@x+'@dx['@i],'@y+'@dy['@i]," ",2960);
			sleep 300;
		}
		sleep 5000;
		for(set '@i,0;'@i<getarraysize('@dx);set '@i,'@i+1) {
			if('@effmob['@i])
				set '@dummy,removemonster('@effmob['@i]);
			sleep 300;
		}
	}
	end;
OnKilled:
	set 'mob,0;
	announce "���_�̋��e : ���c�c����Ȃ��Ƃ��c�c���̗͂́c�c�܁c�c�܂����c�c���Ȃ��́c�c���́c�c�B",0x9,0xff0000,0x190,12,0,0;
	viewpoint 0,98,47,0,0xFF0000;
	donpcevent getmdnpcname("#tnm3finaltimer")+ "::OnStop";
	hideonnpc getmdnpcname("���L#tnmloki02");
	hideonnpc getmdnpcname("���L�̎v�O#hidden_loki");
	hideoffnpc getmdnpcname("���L#tnmloki03");
	hideoffnpc getmdnpcname("��#tnmbosang");
	end;
}

1@tnm3.gat,0,0,0	script	#tnm3finaltimer	139,{
OnStart:
	initnpctimer;
	donpcevent getmdnpcname("#tnm3finalmob")+ "::OnCrossEff";
	end;
OnTimer40000:
	donpcevent getmdnpcname("#tnm3finalmob")+ "::OnCircleEff";
	end;
OnTimer80000:
	initnpctimer;
	donpcevent getmdnpcname("#tnm3finalmob")+ "::OnCrossEff";
	end;
OnStop:
	stopnpctimer;
	end;
}

1@tnm3.gat,98,47,3	script	���L#tnmloki02	512,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[���L]";
		mes "���͂��O�����̃��[�_�[�Ƙb���Ă���B";
		cutin "ep14_roki01",2;
		close2;
		cutin "ep14_roki01",255;
		end;
	}
	if(getmercinfo(0)) {
		mes "[���L]";
		mes "�c�c�Q�����ȁB";
		mes "���Ƌ��ɃA�C�c��|�������Ȃ�";
		mes "����^4d4dff�ٗp���ł���b���Ƃ̌_���";
		mes "�������Ă���B^000000";
		cutin "ep14_roki01",2;
		close2;
		cutin "ep14_roki01",255;
		end;
	}
	if(TNM1_QUE < 21) {
		mes "[���L]";
		mes "�c�c";
		mes "���O�����͂��������ǂ����猻�ꂽ�H";
		mes "�܂������B";
		mes "�̎�͂��łɐl�Ԃł͂Ȃ��Ȃ��Ă���B";
		mes "�A�C�c��|���̂����̔C�����B";
		mes "��`���Ă���I";
		cutin "ep14_roki01",2;
		if(getmercinfo(0)) {
			next;
			mes "[���L]";
			mes "�c�c";
			close2;
			cutin "ep14_roki01",255;
			end;
		}
		hideonnpc getmdnpcname("���L#tnmloki02");
		setquest 114800;
		compquest 114800;
		setpartyinmap TNM1_QUE,21;
		makemerc 2937,900;
		donpcevent getmdnpcname("#tnm3finalmob")+ "::OnStart";
		donpcevent getmdnpcname("���L#tnmloki02")+ "::OnStart";
		hideoffnpc getmdnpcname("���L�̎v�O#hidden_loki");
		close2;
		cutin "ep14_roki01",255;
		end;
	}
	if(checkquest(114800) & 0x8) {
		mes "[���L]";
		mes "�c�c�B";
		mes "�ǂ������A����������߂�̂��H";
		cutin "ep14_roki01",2;
		next;
		mes "[���L]";
		mes "�A�C�c�͓|���˂΂Ȃ�Ȃ��G���B";
		mes "���̂܂ܕ����Ă����킯�ɂ͂����Ȃ��B";
		mes "����������x���B";
		mes "�������ׂ��ꏊ�֊҂����B";
		next;
		hideonnpc getmdnpcname("���L#tnmloki02");
		makemerc 2937,900;
		mes "^4d4dff�]�A�T�V���M���h�̃M���`���N���X";
		mes "�@���L�����Ԃɍ������܂����B";
		mes "�@���L���g���X�L��";
		mes "�@�u�}�C���h�u���X�^�[�v���g�p�����";
		mes "�@�����ɕϖe���������N�̗̎��";
		mes "�@�_���[�W��^���邱�Ƃ�";
		mes "�@�ł���悤�ɂȂ�܂��]^000000";
		cutin "ep14_roki01",255;
		close2;
		hideoffnpc getmdnpcname("���L�̎v�O#hidden_loki");
		end;
	}
	// ������
	mes "[���L]";
	mes "�c�c�B";
	cutin "ep14_roki01",2;
	close2;
	cutin "ep14_roki01",255;
	end;
OnStart:
	initnpctimer;
	announce "���_�̋��e : ������̂悤�ȓz��߁I",0x9,0x00ff00;
	end;
OnTimer2000:
	announce "���_�̋��e : ���̎������O����тɂ��Ė��_���ĂыN�����Ă��!!",0x9,0x00ff00;
	end;
OnTimer5000:
	announce "���L : �z�͍��A�����N�̉���ŕs���g���B",0x9,0x00ff00,0x190,16,0,0;
	end;
OnTimer8000:
	announce "���L : ����������}�C���h�u���X�^�[�Œf���؂�!!",0x9,0x00ff00,0x190,16,0,0;
	end;
OnTimer11000:
	announce "���L : ���̌��Ɉ�C�ɍU������񂾁I",0x9,0x00ff00,0x190,16,0,0;
	end;
OnTimer14000:
	announce "���L�̎��X�L���u�}�C���h�u���X�^�[�v���g�p����Ɩ��_�̋��e�Ƀ_���[�W��^���邱�Ƃ��ł���悤�ɂȂ�܂��B",0x9,0x00ffff,0x190,16,0,0;
	end;
OnTimer22000:
	stopnpctimer;
	donpcevent getmdnpcname("#tnm3finaltimer")+ "::OnStart";
	end;
}

1@tnm3.gat,98,47,3	script	���L�̎v�O#hidden_loki	10043,{
	if(checkquest(114800) & 0x8 == 0) {
		mes "�]^ff0000���L�ƌ_�񂵂�";
		mes "�@�ŏ��̃p�[�e�B�[���[�_�[�̂�";
		mes "�@���L���ĂьĂяo�������\�ł�^000000�]";
		close;
	}
	if(getmercinfo(0)) {
		mes "[�C���t�H���[�V����]";
		mes "�@���L�̎c�e���E�N���b�N���A";
		mes "�@�u��ԕ\���v��I���B";
		mes "�@�uSKILL�v���������ۂɕ\�������";
		mes "�@�X�L���u�}�C���h�u���X�^�[�v��";
		mes "�@���_�̋��e�Ɍ������Ďg�p�����";
		mes "�@�_���[�W��^������悤�ɂȂ�B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�@�܂��A���L�̎c�e��";
		mes "�@���Ȃ��Ȃ����ꍇ";
		mes "�@�ŏ��Ƀ��L�ƌ_�������";
		mes "�@�p�[�e�B�[���[�_�[�ł����";
		mes "�@�Ăт�����";
		mes "�@���Ԃɂ��邱�Ƃ��\�B";
		close;
	}
	hideonnpc getmdnpcname("���L�̎v�O#hidden_loki");
	hideoffnpc getmdnpcname("���L#tnmloki02");
	end;
}

1@tnm3.gat,98,47,3	script	���L#tnmloki03	512,{
	if(checkquest(114810) & 0x8 == 0) {
		mes "�]���L�ɘb�������悤�Ƃ������̎�";
		mes "�@�s�v�c�ȗ͂ɐg���܂ꂽ�B";
		misceffect 35,"";
		setquest 114810;
		compquest 114810;
		misceffect 58,"";
		mes "�@^0000ff�o���l���l���I^000000�]";
		getexp 500000,0;
		getexp 500000,0;
		getexp 0,500000;
		next;
	}
	mes "[���L]";
	mes "�c�c���������B";
	mes "���_�̕����V���͎��s�ɏI������B";
	mes "����œ����͖��Ȃ����낤�B";
	cutin "ep14_roki01",2;
	next;
	mes "[���L]";
	mes "�������c�c���񂾗̎�̖��B";
	mes "�ǂ����Ă���Ȏ����ł���H";
	mes "���Ƃ��Ă͗����o���Ȃ��s�����B";
	next;
	if(TNM1_QUE < 23) {
		mes "�]�����J�����鎖�ɂ��A";
		mes "�@�_���W�����̐i�s���\�ƂȂ�܂��]";
		close;
	}
	mes "�]�l������ł��郍�L�ɁA";
	mes "�@���������̂��Ƃ�b���A";
	mes "�@�A����@�𕷂��Ă݂��]";
	cutin "ep14_roki01",255;
	next;
	mes "[���L]";
	mes "�������B���O������";
	mes "���̎���̐l�Ԃ���Ȃ��̂��B";
	mes "���̂܂܂����ɋ�������̂��H";
	mes "���̎���ɖ߂肽���Ȃ瑗���Ă�邼�B";
	cutin "ep14_roki01",2;
	next;
	if(select("��������o��","������������") == 2) {
		mes "[���L]";
		mes "���Ԃ̗��ꂪ���ꂽ�����ɂ�";
		mes "�������Ȃ����������B";
		close2;
		cutin "ep14_roki01",255;
		end;
	}
	mes "[���L]";
	mes "�����܂�������";
	mes "���邩������Ȃ��ȁB";
	if(getmercinfo(0)) {
		next;
		mes "[���L]";
		mes "���̈ӎ��̈ꕔ�͏����̊�";
		mes "�c���Ă������Ƃɂ��悤�B";
		mes "�c�c�S�A����Ƃ����̂��c�c";
		mes "��������@�������Ȃ����ȁB";
		setquest 114800;
		compquest 114800;
	}
	close2;
	cutin "ep14_roki01",255;
	warp "dali02.gat",134,112;
	end;
}

1@tnm3.gat,92,47,3	script	��#tnmbosang	10005,{
	setpartyinmap TNM1_QUE,23;
	misceffect 10,getmdnpcname("��#tnmbosang");
	hideonnpc getmdnpcname("��#tnmbosang");
	// �ޖ��_�̏�A�ޖ��_�̋|�A�ޖ��_�̗��茕�A�ޖ��_�̃J�^�[���A�ޖ��_�̃n���}�[�A�ޖ��_�̒Z��
	// ���_�̘r��1�A���_�̒m��1�A���_�̐v��1�A���_�̗̑�1�A���_�̏W��1�A���_�̍K�^1�A���_�̘r��2�A���_�̒m��2�A���_�̐v��2�A���_�̗̑�2�A���_�̏W��2�A���_�̍K�^2
	setarray '@gain,2029,18131,21017,28009,28108,28707,4908,4911,4914,4917,4920,4923,4909,4912,4915,4918,4921,4924;
	setarray '@rate,10,10,10,10,10,10,4,4,4,4,4,4,1,1,1,1,1,1;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		for(set '@j,0; '@j<'@rate['@i]; set '@j,'@j+1) {
			set '@result['@k],'@gain['@i];
			set '@k,'@k+1;
		}
	}
	set '@x,92+rand(5)-2;
	set '@y,47+rand(5)-2;
	dropitem getmdmapname("1@tnm3.gat"),'@x,'@y,'@result[rand(getarraysize('@result))],1,0;
	set '@x,92+rand(5)-2;
	set '@y,47+rand(5)-2;
	dropitem getmdmapname("1@tnm3.gat"),'@x,'@y,'@result[rand(getarraysize('@result))],1,0;
	end;
}
