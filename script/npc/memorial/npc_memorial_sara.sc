//= Auriga Script ==============================================================
// Ragnarok Online Memory of Sara Script	by refis
//==============================================================================

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
dali.gat,130,107,5	script	�T���ƃ��[��#sara	945,{
	if((Job <= Job_Dancer && Upper != UPPER_HIGH) ||
		Job == Job_Taekwon || Job == Job_StarGladiator || Job == Job_SoulLinker || BaseLevel < 85
	) {
		mes "[�T���ƃ��[��]";
		mes "���ށc�c�N�͂܂����n������";
		mes "������T������͓̂���B";
		mes "���������͂�t���Ă��痈�Ă���I";
		next;
		mes "�]�T���ƃ��[���ɗ͕s����";
		mes "�@�w�E���ꂽ�B";
		mes "�@^ff0000����1���E�A���2���E�A3���E�A";
		mes "�@���E�˔j�����X�[�p�[�m�[�r�X�A";
		mes "�@�e�T�A�O�A���x���I���A�h��������";
		mes "�@BaseLv85�ȏ�^000000�ɂȂ�����";
		mes "�@�܂����悤�]";
		close;
	}
	switch(checkquest(15003)) {
	case 0:
		if(SARA_1QUE == 0) {	// ����
			mes "[�T���ƃ��[��]";
			mes "�����c�c���ȊO�ɂ�";
			mes "������K�˂ė���l������Ƃ́c�c";
			mes "��������I";
			next;
			mes "[�T���ƃ��[��]";
			mes "���A����I";
			mes "���͒T���Ƃ̃��[�����B";
			next;
			mes "[�T���ƃ��[��]";
			mes "�����͖{���Ɂc�c�s�v�c�ȏꏊ���c�c";
			next;
			mes "[�T���ƃ��[��]";
			mes "�T��������΂���قǂ���ɐV�����A";
			mes "�s�v�c�Ȑ��E���L����B";
			mes "�Ⴆ�Ύ��̑O�ɂ���";
			mes "�����̋��Ԃ̂悤�ɁB";
			next;
			mes "[�T���ƃ��[��]";
			mes "���̎����̋��Ԃ�";
			mes "�ߋ��̃t�F�C�����ƌq�����Ă���悤���B";
			mes "���̗͂ł͂��܂蒲�ׂ��Ȃ��������A";
			mes "���̒��ɂ͉���������Ƃ�������";
			mes "������������B";
			next;
			mes "[�T���ƃ��[��]";
			mes "���������ɂ����āH";
			mes "���܂Ő������̏ꏊ��T�����ė���";
			mes "���̊������������Ă���̂���I";
			next;
			mes "[�T���ƃ��[��]";
			mes "����ŉ������c�c";
			mes "�N�ɂЂƂ��肢��������������B";
			next;
			mes "[�T���ƃ��[��]";
			mes "���̑���Ɏ����̋��Ԃ�";
			mes "�T�����Ă��Ă���B";
			mes "�������N���Ă���ɈႢ�Ȃ��I";
			next;
			mes "[�T���ƃ��[��]";
			mes "�����ŕ����āA��������";
			mes "���ɒm�点�Ă����΂����B";
			mes "�ƂĂ��ȒP�Ȏ�����Ȃ����I";
			mes "�����s���Ă݂Ȃ����I";
			next;
			mes "[�T���ƃ��[��]";
			mes "���Ȃ݂ɂ��̎����̋��Ԃ�";
			mes "�ƂĂ��s����ȏ�Ԃ��B";
			mes "�������ӂ��c��ł���悤�Ɍ�������";
			mes "�����O�ɏo��񂾁I";
			next;
			mes "[�T���ƃ��[��]";
			mes "�悵�A���ꂶ�Ꮐ���͂������H";
			mes "���񂾂��I";
			next;
			mes "�]�T���ƃ��[���ɖ�����藊�܂��";
			mes "�@���܂����B�܂��͂��̑O�ɂ���";
			mes "�@�����ړ��@�𒲂ׂĂ݂悤�]";
			setquest 15003;
			close;
		}
		mes "[�T���ƃ��[��]";
		mes "�܂��t�F�C���������̋��Ԃ�";
		mes "�T�����ɗ����̂��H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�T���ƃ��[��]";
			mes "�������A�܂��s�������Ȃ�����";
			mes "���������Ă���B";
			close;
		}
		mes "[�T���ƃ��[��]";
		mes "�������������邩������Ȃ��B";
		mes "�A�����玄�ɘb�𕷂����Ă���I";
		if(
			(checkquest(118900) && (!(checkquest(15002) & 0x2) || !(checkquest(118900) & 0x2)) ) ||
			(!checkquest(118900) && checkquest(15002) && !(checkquest(15002) & 0x2) )
		) {
			next;
			mes "[�T���ƃ��[��]";
			mes "�����̋��Ԃ̒T���Ɏ��s�����̂��H";
			mes "�c�񂾎��������ɖ߂�܂ł�";
			mes "���΂炭�̎��Ԃ��K�v���B";
			next;
			mes "[�T���ƃ��[��]";
			mes "������x�T�����������̂Ȃ�";
			mes "���ꂵ�Ă��玟��";
			mes "^ff0000�ߑO5���ȍ~^000000�ɗ��Ă���B";
			mes "�A���A�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂��Ȃ���";
			mes "�`�������W�o���Ȃ����B";
			close;
		}
		delquest 15002;
		delquest 118900;
		setquest 15003;
		close;
	case 8:
		if(SARA_1QUE == 0) {	// ����
			mes "[�T���ƃ��[��]";
			mes "�����̋��Ԃ̓�����T�����ė����̂��H";
			mes "����ł����͂ǂ��������񂾁H";
			mes "�������Ă���I�@�����I";
			next;
			mes "�]�����̋��Ԃ̓����Ōo����������";
			mes "�@���[���ɘb�����Ƃ������A";
			mes "�@�����������̂��܂�����";
			mes "�@�v���o���Ȃ������]";
			next;
			mes "[�T���ƃ��[��]";
			mes "���ށc�c�������c�c";
			mes "���̗l�q�������";
			mes "�����������̂�������Ȃ��ȁB";
			next;
			mes "[�T���ƃ��[��]";
			mes "�ȂɁA�������܂Ȃ��Ă����B";
			mes "�ʂ̎�����T�����Ă���񂾁B";
			mes "�L���̍������N�������Ƃ��Ă�";
			mes "�����s�v�c�Ȃ��Ƃł͂Ȃ��B";
			next;
			mes "[�T���ƃ��[��]";
			mes "�N����ꂽ���낤�B�����x��ł��Ȃ����B";
			mes "�����̋��Ԃ��ēx�T�����Ă݂���������A";
			mes "��ł܂��b�������Ă����΂����B";
			next;
			mes "[�T���ƃ��[��]";
			mes "�������c�񂾎��������ɖ߂�܂ł�";
			mes "������x�̎��Ԃ�������̂��B";
			next;
			mes "[�T���ƃ��[��]";
			mes "������x�T�����������̂Ȃ�";
			mes "���ꂵ�Ă��玟��";
			mes "^ff0000�ߑO5���ȍ~^000000�ɗ��Ă���B";
			mes "�A���A�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂��Ȃ���";
			mes "�`�������W�o���Ȃ����B";
		}
		else {
			mes "[�T���ƃ��[��]";
			mes "�t�F�C���������̋��Ԃ�";
			mes "�T�����ė����̂��H";
			mes "�ǂ��������H";
			mes "���x�͉������������o���Ă��邩�H";
			next;
			mes "�]����������v���o���Ȃ��Ɠ`�����]";
			next;
			mes "[�T���ƃ��[��]";
			mes "���ށc�c����͎c�O���B";
			mes "�Ђ���Ƃ���Ɖߋ��̃t�F�C�����ɂ�";
			mes "��������̂�������Ȃ��ȁB";
			next;
			mes "[�T���ƃ��[��]";
			mes "�܂��s�������Ȃ�����";
			mes "��Ŏ��ɘb�������Ă���B";
			next;
			mes "[�T���ƃ��[��]";
			mes "�������c�񂾎��������ɖ߂�܂ł�";
			mes "������x�̎��Ԃ�������̂��B";
			next;
			mes "[�T���ƃ��[��]";
			mes "������x�T�����������̂Ȃ�";
			mes "���ꂵ�Ă��玟��";
			mes "^ff0000�ߑO5���ȍ~^000000�ɗ��Ă���B";
			mes "�A���A�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂��Ȃ���";
			mes "�`�������W�o���Ȃ����B";
			next;
			mes "[�T���ƃ��[��]";
			mes "���āc�c�����̋��Ԃ̒T����";
			mes "�N����ꂽ���낤�A";
			mes "�����x��ł��Ȃ����B";
		}
		delquest 15003;
		set SARA_1QUE,1;
		if(Job >= Job_RuneKnight && Job <= Job_Summoner) {
			getexp 500000,0;
			getexp 500000,0;
			getexp 0,500000;
		}
		else {
			getexp 0,500000;
			getexp 0,500000;
			if(JobLevel >= 60) {
				getexp 0,500000;
				if(JobLevel >= 65)
					getexp 0,500000;
			}
		}
		close;
	default:
		if(checkquest(15002)) {
			if(
				(checkquest(118900) && (!(checkquest(15002) & 0x2) || !(checkquest(118900) & 0x2)) ) ||
				(!checkquest(118900) && !(checkquest(15002) & 0x2) )
			) {
				mes "[�T���ƃ��[��]";
				mes "�����̋��Ԃ̒T���Ɏ��s�����̂��H";
				mes "�c�񂾎��������ɖ߂�܂ł�";
				mes "���΂炭�̎��Ԃ��K�v���B";
				next;
				mes "[�T���ƃ��[��]";
				mes "������x�T�����������̂Ȃ�";
				mes "���ꂵ�Ă��玟��";
				mes "^ff0000�ߑO5���ȍ~^000000�ɗ��Ă���B";
				mes "�A���A�Ō�̓�������Ă���";
				mes "^ff00001����^000000�o�߂��Ȃ���";
				mes "�`�������W�o���Ȃ����B";
				close;
			}
			mes "[�T���ƃ��[��]";
			mes "�܂������̎����̋��Ԃ�";
			mes "�����悤�ɂȂ����悤�����B";
			mes "�����s���āA�T���̌��ʂ�";
			mes "���ɒm�点�Ă���I";
			delquest 15002;
			delquest 118900;
			close;
		}
		mes "[�T���ƃ��[��]";
		mes "�܂������̋��Ԃ̒T����";
		mes "�r���̂悤���ˁc�c";
		mes "���߂����Ȃ����猾���Ă���B";
		next;
		if(select("������","���߂�") == 1) {
			mes "[�T���ƃ��[��]";
			mes "�v������荪��������ȁB";
			mes "����ł͊撣���Ă���B";
			mes "�����T���̌��ʂ����ɒm�点�Ă���I";
			close;
		}
		mes "[�T���ƃ��[��]";
		mes "�����ɗ���ł��܂��������Ƃ������ˁB";
		mes "�C����������܂����݂𕷂��Ă���B";
		delquest 15003;
		close;
	}
	end;
OnInit:
	waitingroom "�T���̋L��",0;
	end;
}

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
dali.gat,139,118,3	script	�����ړ��@#sara	10007,{
	if((Job <= Job_Dancer && Upper != UPPER_HIGH) ||
		Job == Job_Taekwon || Job == Job_StarGladiator || Job == Job_SoulLinker || BaseLevel < 85
	) {
		mes "�]���̃_���W�����́A";
		mes "�@^ff0000����1���E�A���2���E�A3���E�A";
		mes "�@���E�˔j�����X�[�p�[�m�[�r�X�A";
		mes "�@�e�T�A�O��BaseLv85�ȏ�^000000�̂�";
		mes "�@����ł��܂��]";
		close;
	}
	if(!(checkquest(15003)&1)) {
		mes "^ff0000�]�܂��͒T���ƃ��[���ɘb�������A";
		mes "�@�T�����邱�Ƃ�`���悤�]^000000";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "^ff0000�]�����̋��Ԃɓ��ꂷ�邽�߂ɂ�";
		mes "�@�p�[�e�B�[���������Ă��������]^000000";
		close;
	}
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "�]�����ړ��@������B";
		mes "�@��������t�F�C�����̎����̋��Ԃ�";
		mes "�@�s����悤���]";
		set '@str1$,"�����̋��Ԃ̐���";
		set '@str2$,"�T���̋L���ɓ���";
		next;
	}
	else {
		set '@str2$,"�T���̋L���ɓ���";
	}
	switch(select('@str1$,'@str2$,"��߂�")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�]�p�[�e�B�[��";
			mes "�@" +'@party$;
			mes "�@�p�[�e�B�[���[�_�[";
			mes "�@" +'@leader$;
			mes "^0000ffMemory of Sara^000000";
			mes "�����Ɏ��s���܂����]";
			close;
		}
		mdcreate "Memory of Sara";
		mes "^ff0000�]�����̋��Ԃ𐶐����܂��]^000000";
		close;
	case 2:
		switch(mdenter("Memory of Sara")) {
		case 0:	// �G���[�Ȃ�
			announce "[" +strcharinfo(1)+ "]�p�[�e�B�[��[" +strcharinfo(0)+ "]��[Memory of Sara]�ɓ��ꂵ�܂�",0x9,0x00FF99;
			setquest 15002;
			setquest 118900;
			donpcevent getmdnpcname("#hugin_sara1")+ "::OnStart";
			//warp "1@sara.gat",250,155;
			end;
		case 1:	// �p�[�e�B�[������
			mes "^ff0000�]���Ȃ��̃p�[�e�B�[�ł�";
			mes "�@�����̋��Ԃɂ͓���ł��܂���]^000000";
			close;
		case 2:	// �_���W�������쐬
			mes "^ff0000�]�����̋��Ԃ���������Ă��܂���]^000000";
			close;
		default:	// ���̑��G���[
			close;
		}
	case 3:
		mes "�]�����ړ��@���痣�ꂽ�]";
		close;
	}
}

//============================================================
// �T���̋L��
//------------------------------------------------------------
1@sara.gat,246,159,3	script	#hugin_sara1	111,5,5,{
	end;
OnTouch:
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		cutin "sara_beholder",2;
		mes "[�H�H�H�H�H]";
		mes "���āc�c";
		unittalk "�H�H�H�H�H : ���āc�c";
		next;
		mes "�]�ǂ�����Ƃ��Ȃ���������";
		mes "�@������Ɍ�肩���Ă���c�c�]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�ǂ�����Ƃ��Ȃ���������������Ɍ�肩���Ă���c�c�]";
		next;
		mes "[�H�H�H�H�H]";
		mes "���đ��݂����Ƃ���";
		mes "����ȗ͂������@���L���[�A�T���B";
		mes "�ޏ������E�ɗ^�����e���́A";
		mes "���Ȃ�����܂���B";
		unittalk "�H�H�H�H�H : ���đ��݂����Ƃ�������ȗ͂������@���L���[�A�T���B�ޏ������E�ɗ^�����e���́A���Ȃ�����܂���B";
		next;
		mes "[�H�H�H�H�H]";
		mes "�ޏ��͈ł̓���i�݂܂����B";
		mes "�ł͂Ȃ��A�ޏ��͈ł̓���";
		mes "�I�񂾂̂��c�c�B";
		unittalk "�H�H�H�H�H : �ޏ��͈ł̓���i�݂܂����B�ł͂Ȃ��A�ޏ��͈ł̓���I�񂾂̂��c�c�B";
		next;
		mes "[�H�H�H�H�H]";
		mes "�T���̗c�����A���̐g�ɋN�����o������";
		mes "���Ă݂܂��傤�B";
		unittalk "�H�H�H�H�H : �T���̗c�����A���̐g�ɋN�����o���������Ă݂܂��傤�B";
		close2;
		cutin "sara_beholder",255;
		hideonnpc getmdnpcname("#hugin_sara1");
	}
	end;
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("warp01#sara0");
	hideonnpc getmdnpcname("warp12#sara1");
	hideonnpc getmdnpcname("warp56#sara5");
	hideonnpc getmdnpcname("warp67#sara6");

	hideonnpc getmdnpcname("�咷�V�A�C����#sara");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1a");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1b");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1c");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1d");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1e");
	hideonnpc getmdnpcname("�T���E�A�C����#sa2b");
	hideonnpc getmdnpcname("�T���E�A�C����#sa2c");
	hideonnpc getmdnpcname("�T���E�A�C����#sa2d");
	hideonnpc getmdnpcname("�T���E�A�C����#sa3b");
	hideonnpc getmdnpcname("�T���E�A�C����#sa3c");
	hideonnpc getmdnpcname("�T���E�A�C����#sa4b");
	hideonnpc getmdnpcname("�T���E�A�C����#sa4c");
	hideonnpc getmdnpcname("�T���E�A�C����#sa5");
	hideonnpc getmdnpcname("�咷�V�A�C����#sa5a");
	hideonnpc getmdnpcname("�咷�V�A�C����#sa5b");

	hideonnpc getmdnpcname("#oldman_a_sara1");
	hideonnpc getmdnpcname("#oldman_b_sara1");
	hideonnpc getmdnpcname("#papa_mama_sara1");
	hideonnpc getmdnpcname("#paydef_sara1");
	hideonnpc getmdnpcname("#hugin_sara2");
	hideonnpc getmdnpcname("#warp_end_sara6");
	hideonnpc getmdnpcname("bgmchg#sara0");
	hideonnpc getmdnpcname("bgmchg#sara1");
	hideonnpc getmdnpcname("navi#sara0");
	end;
}

1@sara.gat,240,145,0	warp	warp01#sara0	2,2,1@sara.gat,94,320
1@sara.gat,208,250,0	warp	warp12#sara1	2,2,1@sara.gat,230,316
1@sara.gat,226,190,0	warp	warp23#sara2	2,2,1@sara.gat,263,94
1@sara.gat,166,67,0		warp	warp34#sara3	2,2,1@sara.gat,164,81
1@sara.gat,155,180,0	script	warp45#sara4	45,2,2,{
	hideonnpc getmdnpcname("warp01#sara0");
	hideonnpc getmdnpcname("warp12#sara1");
	warp getmdmapname("1@sara.gat"),155,196;
	end;
}

1@sara.gat,250,155,0	script	bgmchg#sara0	139,1,1,{
	musiceffect "14";
	end;
}

1@sara.gat,107,326,0	script	bgmchg#sara1	139,10,10,{
	musiceffect "37";
	end;
OnStart:
	initnpctimer;
	hideoffnpc;
	end;
OnTimer3000:
	stopnpctimer;
OnInit:
	hideonnpc;
	end;
}

1@sara.gat,261,156,5	script	����#sara0	668,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "�]�Ԃ����������������B";
		mes "�@���F�����������̐F�����������́A";
		mes "�@�������˂��悤�ȕ\������Ă���]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�Ԃ����������������B���F�����������̐F�����������́A�������˂��悤�ȕ\������Ă���]";
		next;
		if(SARA_1QUE > 0) {
			if(select("�}��","��b������") == 1) {
				mes "�]�T���̐g�ɉ���";
				mes "�@�������Ƃ��N���������B";
				mes "�@�}���ŃT����T�����]";
				unittalk getcharid(3),strcharinfo(0)+" : �]�T���̐g�ɉ����������Ƃ��N���������B�}���ŃT����T�����]";
				hideonnpc getmdnpcname("����#sara0");
				hideoffnpc getmdnpcname("warp01#sara0");
				hideoffnpc getmdnpcname("navi#sara0");
				close;
			}
		}
		mes "�]�����ɂ����������Ȃ̂���K�˂�ƁA";
		mes "�@�ɂ�����ƁA�ЂƂȂ������Ί��";
		mes "�@������������]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�����ɂ����������Ȃ̂���K�˂�ƁA�ɂ�����ƁA�ЂƂȂ������Ί�ł�����������]";
		next;
		cutin "sara_9sara1",2;
		mes "[����]";
		mes "�����̓t�F�C��������I";
		mes ((Sex)? "���Z����": "���o����")+ "�͂��̒��̐l�ł�";
		mes "�Ȃ��݂������ˁH";
		unittalk "���� : �����̓t�F�C��������I�@" +((Sex)? "���Z����": "���o����")+ "�͂��̒��̐l�ł͂Ȃ��݂������ˁH";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�N�͂��̒��̐l�H";
		mes "���̐F�������Ⴄ���ǁc�c";
		unittalk getcharid(3),strcharinfo(0)+" : �N�͂��̒��̐l�H�@���̐F�������Ⴄ���ǁc�c";
		next;
		mes "[�T��]";
		mes "����A��������I";
		mes "���̓t�F�C�����Ő��܂ꂽ�́B";
		mes "���O�̓T���A�T���E�A�C�����Ȃ́I";
		unittalk "�T�� : ����A��������I�@���̓t�F�C�����Ő��܂ꂽ�́B���O�̓T���A�T���E�A�C�����Ȃ́I";
		next;
		mes "[�T��]";
		mes "���̔��̐F�͂ˁA���ւցI";
		mes "�}�}�Ɠ����Ȃ񂾂��I";
		unittalk "�T�� : ���̔��̐F�͂ˁA���ւցI�@�}�}�Ɠ����Ȃ񂾂��I";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�����Ȃ񂾁B";
		mes "����ŁA�����ŉ������Ă����́H";
		unittalk getcharid(3),strcharinfo(0)+" : �����Ȃ񂾁B����ŁA�����ŉ������Ă����́H";
		next;
		mes "[�T��]";
		mes "�p�p��҂��Ă�́B";
		mes "�p�p�͂��̒��̑咷�V�Ȃ񂾂�I";
		unittalk "�T�� : �p�p��҂��Ă�́B�p�p�͂��̒��̑咷�V�Ȃ񂾂�I";
		next;
		mes "[�T��]";
		mes "�p�p�A�x���Ȃ��c�c";
		mes "����������Č����Ă����̂Ɂc�c";
		unittalk "�T�� : �p�p�x���Ȃ��c�c����������Č����Ă����̂Ɂc�c";
		next;
		hideoffnpc getmdnpcname("�咷�V�A�C����#sara");
		mes "[�咷�V�A�C����]";
		mes "�T���A�҂����Ă��܂����ˁB";
		donpcevent getmdnpcname("�咷�V�A�C����#sara")+"::OnTalk1";
		next;
		mes "[�T��]";
		mes "�p�p�I";
		unittalk "�T�� : �p�p�I";
		next;
		cutin "sara_elder_irine1",2;
		mes "[�咷�V�A�C����]";
		mes "���₨��A���̂��P�l�A";
		mes "�����Ԃ񂲋@�����ȁB";
		donpcevent getmdnpcname("�咷�V�A�C����#sara")+"::OnTalk2";
		next;
		cutin "sara_9sara1",0;
		mes "[�T��]";
		mes "���`�I";
		mes "����������Č������̂ɁI";
		mes "�p�p�̉R���I";
		unittalk "�T�� : ���`�I�@����������Č������̂ɁI�@�p�p�̉R���I";
		next;
		cutin "sara_elder_irine1",2;
		mes "[�咷�V�A�C����]";
		mes "�����A���߂��B";
		mes "���V�����Ƃ̉�c���v�������";
		mes "�������Ă��܂����񂾁B";
		mes "�p�p�������Ă�����B";
		donpcevent getmdnpcname("�咷�V�A�C����#sara")+"::OnTalk3";
		next;
		cutin "sara_9sara1",0;
		mes "[�T��]";
		mes "�c�c���A���̂��ꂳ��B�L���C�I";
		unittalk "�T�� : �c�c���A���̂��ꂳ��B�L���C�I";
		next;
		cutin "sara_elder_irine1",2;
		mes "[�咷�V�A�C����]";
		mes "����Ȃ��Ƃ���������_�������B";
		mes "��H�@���̕��́c�c";
		donpcevent getmdnpcname("�咷�V�A�C����#sara")+"::OnTalk4";
		next;
		mes "�]�咷�V�A�C������";
		mes "�@�W�����Ƃ�������ώ@������A";
		mes "�@�ڂň��A���Ă����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�咷�V�A�C�����̓W�����Ƃ�������ώ@������A�ڂň��A���Ă����]";
		next;
		cutin "sara_elder_irine2",2;
		mes "�]��u�G�ӂ��܂܂�Ă���悤��";
		mes "�@�������̂́A�C�̂������낤���c�c�]";
		unittalk getcharid(3),strcharinfo(0)+" : �]��u�G�ӂ��܂܂�Ă���悤�Ɋ������̂́A�C�̂������낤���c�c�]";
		next;
		mes "�]�T���͖��ʂ̏Ί�ŁA";
		mes "�@��Ɏ������Ԃ̑���";
		mes "�@�咷�V�A�C�����ɍ����o�����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T���͖��ʂ̏Ί�ŁA��Ɏ������Ԃ̑���咷�V�A�C�����ɍ����o�����]";
		next;
		cutin "sara_9sara1",0;
		mes "[�T��]";
		mes "�͂��A����I";
		unittalk "�T�� : �͂��A����I";
		next;
		cutin "sara_elder_irine1",2;
		mes "[�咷�V�A�C����]";
		mes "����́c�c";
		mes "������Y��ȉԂ���������";
		mes "����Ă������̂��ȁH";
		donpcevent getmdnpcname("�咷�V�A�C����#sara")+"::OnTalk5";
		next;
		cutin "sara_9sara1",0;
		mes "[�T��]";
		mes "����A������I";
		mes "���ւցc�c";
		mes "�p�p�̂��߂ɏW�߂��񂾂��B";
		unittalk "�T�� : ������I�@���ւցc�c�p�p�̂��߂ɏW�߂��񂾂��B";
		next;
		mes "�]�T������Ԃ������咷�V��";
		mes "�@�T���̑̂������グ��";
		mes "�@���Ԃɏ悹���]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T������Ԃ������咷�V�́A�T���̑̂������グ�Č��Ԃɏ悹���]";
		next;
		cutin "sara_elder_irine1",2;
		mes "[�咷�V�A�C����]";
		mes "�����A���̏����Ȃ��P�l�B";
		mes "���x�͂ǂ��ɍs�������H";
		donpcevent getmdnpcname("�咷�V�A�C����#sara")+"::OnTalk6";
		next;
		cutin "sara_9sara1",2;
		mes "[�T��]";
		mes "�������I";
		mes "�������̋u�܂�!!";
		unittalk "�T�� : �������I�@�������̋u�܂�!!";
		next;
		cutin "sara_elder_irine1",2;
		mes "[�咷�V�A�C����]";
		mes "��`���I�@�ł͍s�����`�I";
		donpcevent getmdnpcname("�咷�V�A�C����#sara")+"::OnTalk7";
		next;
		hideonnpc getmdnpcname("�咷�V�A�C����#sara");
		hideonnpc getmdnpcname("����#sara0");
		hideoffnpc getmdnpcname("warp01#sara0");
		hideoffnpc getmdnpcname("#oldman_a_sara1");
		hideoffnpc getmdnpcname("#oldman_b_sara1");
		cutin "sara_9sara1",255;
		mes "�]��l���u�̕��ɏ��������A";
		mes "�@�߂��������������";
		mes "�@�������Ă����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]��l���u�̕��ɏ��������A�߂���������������������Ă����]";
		next;
		mes "[�������V�lA]";
		mes "�T���̗͂��傫���Ȃ��čs���̂�";
		mes "������B";
		mes "����ȏ�A��������̂�";
		mes "���߂������͂ł��Ȃ��I";
		donpcevent getmdnpcname("#oldman_a_sara1")+"::OnTalk1";
		next;
		mes "[�������V�lB]";
		mes "�t�F�C�����̐����Ȍp���҂ł��Ȃ��A";
		mes "�ٖM�l�̌��؁c�c";
		mes "����������̔N�ɐ��܂ꂽ�q���Ƃ́I";
		donpcevent getmdnpcname("#oldman_b_sara1")+"::OnTalk1";
		next;
		mes "[�������V�lB]";
		mes "�������̒��Ɍ��̗���";
		mes "�����r��邾�낤�B";
		donpcevent getmdnpcname("#oldman_b_sara1")+"::OnTalk2";
		next;
		mes "[�������V�lA]";
		mes "�l���b���T����I������O�ɁA";
		mes "��Ɏ��ł��Ȃ���΂Ȃ�Ȃ��B";
		mes "���̎҂ɗ���ł��邩��A";
		mes "���ӂ���Ă����͂����B";
		donpcevent getmdnpcname("#oldman_a_sara1")+"::OnTalk2";
		next;
		mes "[�������V�lB]";
		mes "�N�����łɎ��ł��Ă���ƌ����̂Ȃ�";
		mes "�M���Č���邱�Ƃɂ��悤�B";
		mes "�c�c������������������B";
		mes "�悢�񍐂�҂��Ă��邼�B";
		donpcevent getmdnpcname("#oldman_b_sara1")+"::OnTalk3";
		next;
		mes "�]�Θb���I������l�̘V�l��";
		mes "�@���̊Ԃɂ����Ȃ��Ȃ��Ă����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�Θb���I������l�̘V�l�͂��̊Ԃɂ����Ȃ��Ȃ��Ă����]";
		next;
		mes "�]�T���̐g�ɉ���";
		mes "�@�������Ƃ��N���������B";
		mes "�@�}���ŃT����T�����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T���̐g�ɉ����������Ƃ��N���������B�}���ŃT����T�����]";
		close2;
		hideonnpc getmdnpcname("#oldman_a_sara1");
		hideonnpc getmdnpcname("#oldman_b_sara1");
		hideoffnpc getmdnpcname("navi#sara0");
		end;
	}
	else {
		mes "[����]";
		mes ((Sex)? "���Z����": "���o����")+ "������H";
		next;
		mes "^ff0000�]�C�x���g��i�߂�ɂ�";
		mes "�@�p�[�e�B�[���[�_�[��";
		mes "�@�b�������Ă��������]^000000";
		close;
	}
}

1@sara.gat,257,146,0	script	navi#sara0	139,10,10,{
OnTouch:
	viewpoint 1,240,145,1,0x00FF00;
	end;
}

1@sara.gat,268,158,3	script	�咷�V�A�C����#sara	684,{
	cutin "sara_elder_irine1",2;
	mes "�]�咷�V�A�C������";
	mes "�@�D������ŃT�����݂߂Ă���";
	mes "�@������ȂǊᒆ��";
	mes "�@�����Ă��Ȃ��悤���]";
	close2;
	cutin "sara_elder_irine1",255;
	end;
OnTalk1:
	unittalk "�咷�V�A�C���� : �T���A�҂����Ă��܂����ˁB";
	end;
OnTalk2:
	unittalk "�咷�V�A�C���� : ���₨��A���̂��P�l�A�����Ԃ񂲋@�����ȁB";
	end;
OnTalk3:
	unittalk "�咷�V�A�C���� : �����A���߂��B���V�����Ƃ̉�c���v������蒷�����Ă��܂����񂾁B�p�p�������Ă�����B";
	end;
OnTalk4:
	unittalk "�咷�V�A�C���� : ����Ȃ��Ƃ���������_�������B��H�@���̕��́c�c";
	end;
OnTalk5:
	unittalk "�咷�V�A�C���� : ����́c�c������Y��ȉԂ��������񂪖���Ă������̂��ȁH";
	end;
OnTalk6:
	unittalk "�咷�V�A�C���� : �����A���̏����Ȃ��P�l�B���x�͂ǂ��ɍs�������H";
	end;
OnTalk7:
	unittalk "�咷�V�A�C���� : ��`���I�@�ł͍s�����`�I";
	end;
}

1@sara.gat,255,158,3	script	#oldman_a_sara1	111,{
	end;
OnTalk1:
	unittalk "�������V�lA : �T���̗͂��傫���Ȃ��čs���̂�������B����ȏ�A��������̂����߂������͂ł��Ȃ��I";
	end;
OnTalk2:
	unittalk "�������V�lA : �l���b���T����I������O�ɁA��Ɏ��ł��Ȃ���΂Ȃ�Ȃ��B���̎҂ɗ���ł��邩��A���ӂ���Ă����͂����B";
	end;
}

1@sara.gat,260,161,3	script	#oldman_b_sara1	111,{
	end;
OnTalk1:
	unittalk "�������V�lB : �t�F�C�����̐����Ȍp���҂ł��Ȃ��A�ٖM�l�̌��؁c�c����������̔N�ɐ��܂ꂽ�q���Ƃ́I";
	end;
OnTalk2:
	unittalk "�������V�lB : �������̒��Ɍ��̗��������r��邾�낤�B";
	end;
OnTalk3:
	unittalk "�������V�lB : �N�����łɎ��ł��Ă���ƌ����̂Ȃ�M���Č���邱�Ƃɂ��悤�B�c�c������������������B�悢�񍐂�҂��Ă��邼�B";
	end;
}

1@sara.gat,107,325,5	script	�T���E�A�C����#sa1	668,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		cutin "sara_9sara1",2;
		mes "[�T��]";
		mes "�����I";
		mes "��������" +((Sex)? "���Z����": "���o����")+ "�����I";
		mes "�Ȃɂ����p�H";
		unittalk "�T�� : �����I�@��������" +((Sex)? "���Z����": "���o����")+ "�����I�@�Ȃɂ����p�H";
		next;
		if(SARA_1QUE > 0) {
			if(select("�}��","��b������") == 1) {
				cutin "sara_9sara1",255;
				mes "�]�ˑR�T���͋��тȂ���";
				mes "�@�삯�o�����B";
				mes "�@���̊ԂɌx�������������";
				mes "�@���͂ށ]";
				unittalk getcharid(3),strcharinfo(0)+" : �]�ˑR�T���͋��тȂ���삯�o�����B���̊ԂɌx����������������͂ށ]";
				hideonnpc getmdnpcname("�T���E�A�C����#sa1");
				announce "��̕��p�ɓ������T����ǂ������悤�I",0x9,0xffff00;
				donpcevent getmdnpcname("�T���E�A�C����#sa1")+"::OnStart";
				hideoffnpc getmdnpcname("�T���E�A�C����#sa1a");
				hideoffnpc getmdnpcname("warp12#sara1");
				close;
			}
		}
		mes "[�T��]";
		mes "���A������Ƒ҂��ĂˁA";
		mes "�}�}�ɂ��Ԃ�n���́I";
		mes "���ӂӁA����̓}�}�́A";
		mes "����̓p�p��!!";
		unittalk "�T�� : ���A������Ƒ҂��ĂˁA�}�}�ɂ��Ԃ�n���́I�@���ӂӁA����̓}�}�́A����̓p�p��!!";
		next;
		mes "�]�T���͗��e�ׂ̈Ɏ����ė���";
		mes "�@�Ԃ��ꎞ�ł������n�����Ƃ���";
		mes "�@�}���ŉƂ̔����J�����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T���͗��e�ׂ̈Ɏ����ė����Ԃ��ꎞ�ł������n�����Ƃ��āA�}���ŉƂ̔����J�����]";
		next;
		mes "[�T��]";
		mes "�}�}�A�p�p�I�@���ꌩ�āI";
		mes "�����ˁc�c�I";
		unittalk "�T�� : �}�}�A�p�p�I�@���ꌩ�āI�@�����ˁc�c�I";
		next;
		musiceffect "37";
		cutin "sara_momdie",4;
		mes "�]�����ɂ͐n���Ŏh���ꂽ�̂��A";
		mes "�@���𗬂��ē|���Ă���T���̕�e�ƁA";
		mes "�@���������A�S�g�Ɍ��𗁂т�";
		mes "�@�咷�V�A�C�����������]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�����ɂ͐n���Ŏh���ꂽ�̂��A���𗬂��ē|���Ă���T���̕�e�ƁA���������A�S�g�Ɍ��𗁂т��咷�V�A�C�����������]";
		next;
		mes "[�T��]";
		mes "���c�c�c�c";
		unittalk "�T�� : ���c�c�c�c";
		next;
		mes "[�T���̕�e]";
		mes "�c�c�T���c�c�c�c";
		mes "���c�c�����́c�c��Ȃ���c�c";
		mes "�����c�c�����Ȃ����c�c�B";
		donpcevent getmdnpcname("#papa_mama_sara1")+"::OnTalk1";
		next;
		mes "[�T��]";
		mes "�I�I�I�I�I�I�I�I�I�I�I";
		unittalk "�T�� : �I�I�I�I�I�I�I�I�I�I�I";
		next;
		mes "�]�T���̕�e�������Ă����ʂ�";
		mes "�@�T���̑����܂ŗ����ē]�������B";
		mes "�@�T���͖ڂ̑O�ŋN���Ă�����i��";
		mes "�@�����ł��Ȃ��܂܁A���ӎ���";
		mes "�@�ʂ��E���]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T���̕�e�������Ă����ʂ��T���̑����܂ŗ����ē]�������B�T���͖ڂ̑O�ŋN���Ă�����i�𗝉��ł��Ȃ��܂܁A���ӎ��ŋʂ��E���]";
		next;
		mes "�]���̏u�ԁA����������";
		mes "�@�咷�V�A�C������";
		mes "�@�T���̑��݂ɋC���t���A";
		mes "�@�U��Ԃ����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]���̏u�ԁA�����������咷�V�A�C�������T���̑��݂ɋC���t���A�U��Ԃ����]";
		next;
		cutin "sara_elder_irine4",2;
		mes "[�咷�V�A�C����]";
		mes "�T���c�c";
		mes "���傤�ǂ��O��T���Ă����񂾁c�c�B";
		donpcevent getmdnpcname("#papa_mama_sara1")+"::OnTalk2";
		next;
		cutin "sara_9sara2",2;
		mes "[�T��]";
		mes "�c�c�c";
		unittalk "�T�� : �c�c�c";
		next;
		menu "�T����A��ĒE�o����",-;
		mes "�]��@�𒼊����A䩑R�Ɨ����Ă���";
		mes "�@�T����A��Ă�������";
		mes "�@�o�悤�Ƃ����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]��@�𒼊����A䩑R�Ɨ����Ă���T����A��Ă�������o�悤�Ƃ����]";
		next;
		cutin "sara_elder_irine3",2;
		mes "[�咷�V�A�C����]";
		mes "�x����!!";
		mes "�����ɍȂ��E�Q�����z������I";
		mes "������߂܂���I";
		donpcevent getmdnpcname("#papa_mama_sara1")+"::OnTalk3";
		next;
		mes "�]�咷�V���w�����o���ƁA";
		mes "�@�x�����B���W�܂��ė��鉹��";
		mes "�@�������Ă����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�咷�V���w�����o���ƁA�x�����B���W�܂��ė��鉹���������Ă����]";
		next;
		cutin "sara_9sara3",2;
		mes "[�T��]";
		mes "���킠�����I�I�I�I�I";
		unittalk "�T�� : ���킠�����I�I�I�I�I";
		next;
		cutin "sara_9sara3",255;
		mes "�]�ˑR�T���͋��тȂ���";
		mes "�@�삯�o�����B";
		mes "�@���̊ԂɌx�������������";
		mes "�@���͂ށ]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�ˑR�T���͋��тȂ���삯�o�����B���̊ԂɌx����������������͂ށ]";
		hideonnpc getmdnpcname("�T���E�A�C����#sa1");
		hideonnpc getmdnpcname("#papa_mama_sara1");
		announce "��̕��p�ɓ������T����ǂ������悤�I",0x9,0xffff00;
		donpcevent getmdnpcname("�T���E�A�C����#sa1")+"::OnStart";
		hideoffnpc getmdnpcname("�T���E�A�C����#sa1a");
		hideoffnpc getmdnpcname("warp12#sara1");
		close;
	}
	else {
		cutin "sara_9sara1",2;
		mes "[�T��]";
		mes ((Sex)? "���Z����": "���o����")+ "������H";
		next;
		cutin "sara_9sara1",255;
		mes "^ff0000�]�C�x���g��i�߂�ɂ�";
		mes "�@�p�[�e�B�[���[�_�[��";
		mes "�@�b�������Ă��������]^000000";
		close;
	}
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	stopnpctimer;
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@mob1,callmonster('@mdmap$,99,323,"�t�F�C�����x����#23sr1",2543);
	set '@mob2,callmonster('@mdmap$,99,317,"�t�F�C�����x����#24sr1",2543);
	set '@mob3,callmonster('@mdmap$,99,311,"�t�F�C�����x����#25sr1",2543);
	set '@mob4,callmonster('@mdmap$,116,323,"�t�F�C�����x����#26sr1",2543);
	set '@mob5,callmonster('@mdmap$,116,317,"�t�F�C�����x����#27sr1",2543);
	set '@mob6,callmonster('@mdmap$,116,311,"�t�F�C�����x����#28sr1",2543);
	unittalk '@mob1,"�t�F�C�����x���� : �N���҂��I";
	unittalk '@mob3,"�t�F�C�����x���� : ������߂܂���I�I";
	unittalk '@mob4,"�t�F�C�����x���� : ���������x�ɂȂ̂Ɂc�c�ǂ����āc�c";
	unittalk '@mob6,"�t�F�C�����x���� : �~�܂�I";
	hideoffnpc getmdnpcname("bgmchg#sara1");
	hideonnpc getmdnpcname("bgmchg#sara1");
	end;
}

1@sara.gat,109,327,3	script	#papa_mama_sara1	111,{
	end;
OnTalk1:
	unittalk "�T���̕�e : �c�c�T���c�c�c�c���c�c�����́c�c��Ȃ���c�c�����c�c�����Ȃ����c�c�B";
	end;
OnTalk2:
	unittalk "�咷�V�A�C���� : �T���c�c���傤�ǂ��O��T���Ă����񂾁c�c�B";
	end;
OnTalk3:
	unittalk "�咷�V�A�C���� : �x����!!�@�����ɍȂ��E�Q�����z������I�@������߂܂���I";
	end;
}

1@sara.gat,110,300,5	script	�T���E�A�C����#sa1a	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �킠�����I�I�I�I�I�I";
	hideonnpc getmdnpcname("�T���E�A�C����#sa1a");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa1b");
	announce "�T���͓�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,107,231,5	script	�T���E�A�C����#sa1b	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �킠�������I�I�I�I�I�I";
	hideonnpc getmdnpcname("�T���E�A�C����#sa1b");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa1c");
	announce "�T���͓��̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,142,229,5	script	�T���E�A�C����#sa1c	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �������c�c�}�}�c�c�}�}���c�c�B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa1c");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa1d");
	announce "�T���͓��̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,171,228,5	script	�T���E�A�C����#sa1d	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �}�}�c�c�ɂ����ȃ}�}�c�c�������c�c�B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa1d");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa1e");
	announce "�T���͖k�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,185,249,5	script	�T���E�A�C����#sa1e	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �}�}�c�c���񂶂�₾���c�c���B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa1e");
	announce "�T���͂��̐�ɓ����Ă����Ă��܂����B",0x9,0xffff00;
	viewpoint 1,208,250,1,0x00FF00;
	end;
}

1@sara.gat,112,296,0	script	callmon_a#sara1	139,11,4,{
	hideonnpc getmdnpcname("callmon_a#sara1");
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@event$,getmdnpcname("callmon_a#sara1")+"::OnKilled";
	set '@mob1,callmonster('@mdmap$,101,295,"�t�F�C�����x����#29sr1",2543,'@event$);
	set '@mob2,callmonster('@mdmap$,109,295,"�t�F�C�����x����#30sr1",2543,'@event$);
	set '@mob3,callmonster('@mdmap$,115,295,"�t�F�C�����x����#31sr1",2543,'@event$);
	set '@mob4,callmonster('@mdmap$,123,295,"�t�F�C�����x����#32sr1",2543,'@event$);
	unittalk '@mob2,"�t�F�C�����x���� : �T���l����邼�I";
	unittalk '@mob3,"�t�F�C�����x���� : ������߂܂���I�I";
	end;
OnKilled:
	end;
}

1@sara.gat,117,225,0	script	callmon_b#sara1	139,12,2,{
	hideonnpc getmdnpcname("callmon_b#sara1");
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@event$,getmdnpcname("callmon_b#sara1")+"::OnKilled";
	set '@mob1,callmonster('@mdmap$,122,217,"�t�F�C�����x����#1sr1",2543,'@event$);
	set '@mob2,callmonster('@mdmap$,122,219,"�t�F�C�����x����#2sr1",2543,'@event$);
	set '@mob3,callmonster('@mdmap$,122,221,"�t�F�C�����x����#3sr1",2543,'@event$);
	set '@mob4,callmonster('@mdmap$,122,223,"�t�F�C�����x����#4sr1",2543,'@event$);
	set '@mob5,callmonster('@mdmap$,122,225,"�t�F�C�����x����#5sr1",2543,'@event$);
	set '@mob6,callmonster('@mdmap$,122,227,"�t�F�C�����x����#6sr1",2543,'@event$);
	set '@mob7,callmonster('@mdmap$,120,217,"��l�����x����#1sara1",2545,'@event$);
	set '@mob8,callmonster('@mdmap$,120,219,"��l�����x����#2sara1",2545,'@event$);
	set '@mob9,callmonster('@mdmap$,120,221,"��l�����x����#3sara1",2545,'@event$);
	set '@mob10,callmonster('@mdmap$,120,223,"��l�����x����#4sara1",2545,'@event$);
	set '@mob11,callmonster('@mdmap$,120,225,"��l�����x����#5sara1",2545,'@event$);
	set '@mob12,callmonster('@mdmap$,120,227,"��l�����x����#6sara1",2545,'@event$);
	unittalk '@mob2,"�t�F�C�����x���� : �������I";
	unittalk '@mob4,"�t�F�C�����x���� : ������߂܂���I�I";
	unittalk '@mob4,"�t�F�C�����x���� : �������ȁI�I";
	unittalk '@mob8,"��l�����x���� : �N�D�D���c�c";
	end;
OnKilled:
	end;
}

1@sara.gat,155,233,0	script	callmon_c#sara1	139,10,8,{
	hideonnpc getmdnpcname("callmon_c#sara1");
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@event$,getmdnpcname("callmon_c#sara1")+"::OnKilled";
	set '@mob1,callmonster('@mdmap$,151,231,"�t�F�C�����x����#7sr1",2543,'@event$);
	set '@mob2,callmonster('@mdmap$,153,231,"�t�F�C�����x����#8sr1",2543,'@event$);
	set '@mob3,callmonster('@mdmap$,155,231,"�t�F�C�����x����#9sr1",2543,'@event$);
	set '@mob4,callmonster('@mdmap$,157,231,"�t�F�C�����x����#10sr1",2543,'@event$);
	set '@mob5,callmonster('@mdmap$,159,231,"�t�F�C�����x����#11sr1",2543,'@event$);
	set '@mob6,callmonster('@mdmap$,161,231,"�t�F�C�����x����#12sr1",2543,'@event$);
	unittalk '@mob2,"�t�F�C�����x���� : ���������c�I�I";
	unittalk '@mob5,"�t�F�C�����x���� : �~�܂�I";
	end;
OnKilled:
	end;
}

1@sara.gat,177,221,0	script	callmon_d#sara1	139,2,6,{
	hideonnpc getmdnpcname("callmon_d#sara1");
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@event$,getmdnpcname("callmon_d#sara1")+"::OnKilled";
	set '@mob1,callmonster('@mdmap$,185,214,"�t�F�C�����x����#13sr1",2543,'@event$);
	set '@mob2,callmonster('@mdmap$,185,216,"�t�F�C�����x����#14sr1",2543,'@event$);
	set '@mob3,callmonster('@mdmap$,185,218,"�t�F�C�����x����#15sr1",2543,'@event$);
	set '@mob4,callmonster('@mdmap$,185,220,"�t�F�C�����x����#16sr1",2543,'@event$);
	set '@mob5,callmonster('@mdmap$,185,222,"�t�F�C�����x����#17sr1",2543,'@event$);
	set '@mob6,callmonster('@mdmap$,185,224,"�t�F�C�����x����#18sr1",2543,'@event$);
	set '@mob7,callmonster('@mdmap$,182,214,"��l�����x����#7sara1",2545,'@event$);
	set '@mob8,callmonster('@mdmap$,182,216,"��l�����x����#8sara1",2545,'@event$);
	set '@mob9,callmonster('@mdmap$,182,218,"��l�����x����#9sara1",2545,'@event$);
	set '@mob10,callmonster('@mdmap$,182,220,"��l�����x����#10sara1",2545,'@event$);
	set '@mob11,callmonster('@mdmap$,182,222,"��l�����x����#11sara1",2545,'@event$);
	set '@mob12,callmonster('@mdmap$,182,224,"��l�����x����#12sara1",2545,'@event$);
	unittalk '@mob2,"�t�F�C�����x���� : �������I";
	unittalk '@mob4,"�t�F�C�����x���� : ���͂߁I�I";
	end;
OnKilled:
	end;
}

1@sara.gat,199,250,0	script	callmon_e#sara1	139,5,5,{
	hideonnpc getmdnpcname("callmon_e#sara1");
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@event$,getmdnpcname("callmon_e#sara1")+"::OnKilled";
	set '@mob1,callmonster('@mdmap$,190,258,"�t�F�C�����x����#19sr1",2543,'@event$);
	set '@mob2,callmonster('@mdmap$,192,258,"�t�F�C�����x����#20sr1",2543,'@event$);
	set '@mob3,callmonster('@mdmap$,194,258,"�t�F�C�����x����#21sr1",2543,'@event$);
	set '@mob4,callmonster('@mdmap$,196,258,"�t�F�C�����x����#22sr1",2543,'@event$);
	set '@mob5,callmonster('@mdmap$,198,258,"�t�F�C�����x����#33sr1",2543,'@event$);
	set '@mob6,callmonster('@mdmap$,200,258,"�t�F�C�����x����#34sr1",2543,'@event$);
	set '@mob7,callmonster('@mdmap$,205,246,"�t�F�C�����x����#35sr1",2543,'@event$);
	set '@mob8,callmonster('@mdmap$,205,256,"�t�F�C�����x����#36sr1",2543,'@event$);
	set '@mob9,callmonster('@mdmap$,205,254,"�t�F�C�����x����#37sr1",2543,'@event$);
	set '@mob10,callmonster('@mdmap$,205,252,"�t�F�C�����x����#38sr1",2543,'@event$);
	set '@mob11,callmonster('@mdmap$,205,250,"�t�F�C�����x����#39sr1",2543,'@event$);
	set '@mob12,callmonster('@mdmap$,205,248,"�t�F�C�����x����#40sr1",2543,'@event$);
	set '@mob13,callmonster('@mdmap$,205,246,"�t�F�C�����x����#41sr1",2543,'@event$);
	set '@mob14,callmonster('@mdmap$,196,256,"��l�����x����#13sara1",2545,'@event$);
	set '@mob15,callmonster('@mdmap$,196,254,"��l�����x����#14sara1",2545,'@event$);
	set '@mob16,callmonster('@mdmap$,196,252,"��l�����x����#15sara1",2545,'@event$);
	set '@mob17,callmonster('@mdmap$,196,250,"��l�����x����#16sara1",2545,'@event$);
	set '@mob18,callmonster('@mdmap$,196,248,"��l�����x����#17sara1",2545,'@event$);
	set '@mob19,callmonster('@mdmap$,196,246,"��l�����x����#18sara1",2545,'@event$);
	unittalk '@mob3,"�t�F�C�����x���� : ��Ăɂ�����I";
	unittalk '@mob8,"�t�F�C�����x���� : ���͂߁I�I";
	end;
OnKilled:
	end;
}

1@sara.gat,225,301,5	script	�T���E�A�C����#sa2a	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �c�c�͂��c�c�͂��c�c�B�c�c�������c�c�������c�c�B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa2a");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa2b");
	announce "�T���͓�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,236,274,5	script	�T���E�A�C����#sa2b	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �T���A�����q�ɂ��Ă��̂Ɂc�c�B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa2b");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa2c");
	announce "�T���͓�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,231,234,5	script	�T���E�A�C����#sa2c	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �c�c�ǂ����āH�@�}�}�A�ǂ����Ēɂ����Ȋ炵�Ă��́H";
	hideonnpc getmdnpcname("�T���E�A�C����#sa2c");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa2d");
	announce "�T���͓�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,217,200,5	script	�T���E�A�C����#sa2d	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �p�p���}�}�Ɉ������Ƃ����́H�@�ɂ����Ƃ����́H�@�c�c�Ђ����B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa2d");
	announce "�T���͂��̐�ɓ����Ă����Ă��܂����B",0x9,0xffff00;
	viewpoint 1,226,190,1,0x00FF00;
	end;
}

1@sara.gat,230,316,0	script	callmon_a#sara2	139,1,1,{
	set '@mdmap$,getmdmapname("1@sara.gat");
	monster '@mdmap$,228,312,"��l�����x����#1sara2",2545,1;
	monster '@mdmap$,227,312,"��l�����x����#2sara2",2545,1;
	monster '@mdmap$,229,319,"��l�����x����#3sara2",2545,1;
	monster '@mdmap$,221,197,"���\�Ȍx����#4sara2",2546,1;
	monster '@mdmap$,223,197,"���\�Ȍx����#5sara2",2546,1;
	monster '@mdmap$,248,290,"�t�F�C������앺#1sara2",2544,1;
	monster '@mdmap$,247,290,"�t�F�C������앺#2sara2",2544,1;
	monster '@mdmap$,249,290,"�t�F�C������앺#3sara2",2544,1;
	monster '@mdmap$,221,248,"�t�F�C������앺#4sara2",2544,1;
	monster '@mdmap$,224,248,"�t�F�C������앺#5sara2",2544,1;
	monster '@mdmap$,227,248,"�t�F�C������앺#6sara2",2544,1;
	monster '@mdmap$,230,248,"�t�F�C������앺#7sara2",2544,1;
	monster '@mdmap$,218,223,"�t�F�C������앺#8sara2",2544,1;
	monster '@mdmap$,222,223,"�t�F�C������앺#9sara2",2544,1;
	monster '@mdmap$,226,223,"�t�F�C������앺#10sara",2544,1;
	monster '@mdmap$,230,223,"�t�F�C������앺#11sara",2544,1;
	hideonnpc getmdnpcname("callmon_a#sara2");
	end;
}

1@sara.gat,232,90,5	script	�T���E�A�C����#sa3a	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �T�������̂��ꂳ�񂽂��̈��������������q������c�c�H";
	hideonnpc getmdnpcname("�T���E�A�C����#sa3a");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa3b");
	announce "�T���͓쐼�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,211,76,5	script	�T���E�A�C����#sa3b	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �p�p�͂����q����Ȃ��T���A����Ȃ��񂾂ˁc�c�B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa3b");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa3c");
	announce "�T���͐��̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,175,64,5	script	�T���E�A�C����#sa3c	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �ł��A�}�}���������p�p�́c�c�H�@���̃p�p�́A�����p�p�Ȃ́H";
	hideonnpc getmdnpcname("�T���E�A�C����#sa3c");
	announce "�T���͂��̐�ɓ����Ă����Ă��܂����B",0x9,0xffff00;
	viewpoint 1,166,67,1,0x00FF00;
	end;
}

1@sara.gat,263,94,0	script	callmon_a#sara3	139,1,1,{
	set '@mdmap$,getmdmapname("1@sara.gat");
	monster '@mdmap$,90,67,"��l�����x����#1sara3",2545,1;
	monster '@mdmap$,93,67,"��l�����x����#2sara3",2545,1;
	monster '@mdmap$,90,63,"��l�����x����#3sara3",2545,1;
	monster '@mdmap$,93,63,"��l�����x����#4sara3",2545,1;
	monster '@mdmap$,90,59,"��l�����x����#5sara3",2545,1;
	monster '@mdmap$,93,59,"��l�����x����#6sara3",2545,1;
	monster '@mdmap$,90,55,"��l�����x����#7sara3",2545,1;
	monster '@mdmap$,93,55,"��l�����x����#8sara3",2545,1;
	monster '@mdmap$,255,91,"��l�����x����#9sara3",2545,1;
	monster '@mdmap$,253,91,"��l�����x����#10sara3",2545,1;
	monster '@mdmap$,255,93,"��l�����x����#11sara3",2545,1;
	monster '@mdmap$,253,93,"��l�����x����#12sara3",2545,1;
	monster '@mdmap$,255,95,"��l�����x����#13sara3",2545,1;
	monster '@mdmap$,253,95,"��l�����x����#14sara3",2545,1;
	monster '@mdmap$,255,97,"��l�����x����#15sara3",2545,1;
	monster '@mdmap$,253,97,"��l�����x����#16sara3",2545,1;
	monster '@mdmap$,193,56,"��l�����x����#17sara3",2545,1;
	monster '@mdmap$,195,56,"��l�����x����#18sara3",2545,1;
	monster '@mdmap$,197,56,"��l�����x����#19sara3",2545,1;
	monster '@mdmap$,193,60,"��l�����x����#20sara3",2545,1;
	monster '@mdmap$,195,60,"��l�����x����#21sara3",2545,1;
	monster '@mdmap$,197,60,"��l�����x����#22sara3",2545,1;
	monster '@mdmap$,193,63,"��l�����x����#23sara3",2545,1;
	monster '@mdmap$,195,63,"��l�����x����#24sara3",2545,1;
	monster '@mdmap$,197,63,"��l�����x����#25sara3",2545,1;
	monster '@mdmap$,87,67,"�t�F�C�����x����#1sara3",2543,1;
	monster '@mdmap$,87,63,"�t�F�C�����x����#2sara3",2543,1;
	monster '@mdmap$,87,59,"�t�F�C�����x����#3sara3",2543,1;
	monster '@mdmap$,87,55,"�t�F�C�����x����#4sara3",2543,1;
	monster '@mdmap$,121,39,"�t�F�C�����x����#5sara3",2543,1;
	monster '@mdmap$,120,39,"�t�F�C�����x����#6sara3",2543,1;
	monster '@mdmap$,122,39,"�t�F�C�����x����#7sara3",2543,1;
	monster '@mdmap$,228,59,"�t�F�C�����x����#8sara3",2543,1;
	monster '@mdmap$,228,61,"�t�F�C�����x����#9sara3",2543,1;
	monster '@mdmap$,228,63,"�t�F�C�����x����#10sara",2543,1;
	monster '@mdmap$,228,65,"�t�F�C�����x����#11sara",2543,1;
	monster '@mdmap$,81,67,"���\�Ȍx����#1sara3",2546,1;
	monster '@mdmap$,84,67,"���\�Ȍx����#2sara3",2546,1;
	monster '@mdmap$,81,63,"���\�Ȍx����#3sara3",2546,1;
	monster '@mdmap$,84,63,"���\�Ȍx����#4sara3",2546,1;
	monster '@mdmap$,81,59,"���\�Ȍx����#5sara3",2546,1;
	monster '@mdmap$,84,59,"���\�Ȍx����#6sara3",2546,1;
	monster '@mdmap$,81,55,"���\�Ȍx����#7sara3",2546,1;
	monster '@mdmap$,84,55,"���\�Ȍx����#8sara3",2546,1;
	hideonnpc getmdnpcname("callmon_a#sara3");
	end;
}

1@sara.gat,194,63,0	script	callmon_b#sara3	139,2,5,{
	hideonnpc getmdnpcname("callmon_b#sara3");
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@mob1,callmonster('@mdmap$,204,63,"���\�Ȍx����#ex1sara3",2546);
	set '@mob2,callmonster('@mdmap$,204,53,"���\�Ȍx����#ex2sara3",2546);
	unittalk '@mob1,"���\�Ȍx���� : �K�����c�c";
	end;
}

1@sara.gat,165,97,5	script	�T���E�A�C����#sa4a	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �p�p�̊�A�|�������c�c�����c�c���B����͂����ƈ����p�p�Ȃ񂾁c�c�B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa4a");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa4b");
	announce "�T���͖k�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,172,126,5	script	�T���E�A�C����#sa4b	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �����p�p�A���炢�c�c�����p�p�A����Ȃ��c�c�ł��c�c�T���́c�c�T���́c�c�����c�c�B";
	hideonnpc getmdnpcname("�T���E�A�C����#sa4b");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa4c");
	announce "�T���͖k�̕��p�ɓ����Ă������B",0x9,0xffff00;
	end;
}

1@sara.gat,162,166,5	script	�T���E�A�C����#sa4c	668,7,7,{
	end;
OnTouch:
	unittalk "�T�� : �c�c�Ђ����B�킩��Ȃ��悧�c�c�B�T���A�ǂ������炢���́A�}�}�c�c�}�}�I";
	hideonnpc getmdnpcname("�T���E�A�C����#sa4c");
	announce "�T���͂��̐�ɓ����Ă����Ă��܂����B",0x9,0xffff00;
	viewpoint 1,155,180,1,0x00FF00;
	end;
}

1@sara.gat,164,81,0	script	callmon_a#sara4	139,1,1,{
	hideonnpc getmdnpcname("callmon_a#sara4");
	set '@mdmap$,getmdmapname("1@sara.gat");
	killmonster '@mdmap$,getmdnpcname("callmon_a#sara1")+"::OnKilled";
	killmonster '@mdmap$,getmdnpcname("callmon_b#sara1")+"::OnKilled";
	killmonster '@mdmap$,getmdnpcname("callmon_c#sara1")+"::OnKilled";
	killmonster '@mdmap$,getmdnpcname("callmon_d#sara1")+"::OnKilled";
	killmonster '@mdmap$,getmdnpcname("callmon_e#sara1")+"::OnKilled";
	hideonnpc getmdnpcname("callmon_a#sara1");
	hideonnpc getmdnpcname("callmon_b#sara1");
	hideonnpc getmdnpcname("callmon_c#sara1");
	hideonnpc getmdnpcname("callmon_d#sara1");
	hideonnpc getmdnpcname("callmon_e#sara1");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1a");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1b");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1c");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1d");
	hideonnpc getmdnpcname("�T���E�A�C����#sa1e");
	hideoffnpc getmdnpcname("�T���E�A�C����#sa5");

	monster '@mdmap$,151,174,"�t�F�C�����x����#1sara4",2543,1;
	monster '@mdmap$,153,174,"�t�F�C�����x����#2sara4",2543,1;
	monster '@mdmap$,155,174,"�t�F�C�����x����#3sara4",2543,1;
	monster '@mdmap$,157,174,"�t�F�C�����x����#4sara4",2543,1;
	monster '@mdmap$,159,174,"�t�F�C�����x����#5sara4",2543,1;
	monster '@mdmap$,151,177,"�t�F�C�����x����#6sara4",2543,1;
	monster '@mdmap$,153,177,"�t�F�C�����x����#7sara4",2543,1;
	monster '@mdmap$,155,177,"�t�F�C�����x����#8sara4",2543,1;
	monster '@mdmap$,157,177,"�t�F�C�����x����#9sara4",2543,1;
	monster '@mdmap$,159,177,"�t�F�C�����x����#10sara",2543,1;
	monster '@mdmap$,173,137,"�t�F�C�����x����#11sara",2543,1;
	monster '@mdmap$,170,137,"�t�F�C�����x����#12sara",2543,1;
	monster '@mdmap$,167,137,"�t�F�C�����x����#13sara",2543,1;
	monster '@mdmap$,164,137,"�t�F�C�����x����#14sara",2543,1;
	monster '@mdmap$,173,139,"�t�F�C�����x����#16sara",2543,1;
	monster '@mdmap$,170,139,"�t�F�C�����x����#17sara",2543,1;
	monster '@mdmap$,167,139,"�t�F�C�����x����#18sara",2543,1;
	monster '@mdmap$,164,139,"�t�F�C�����x����#19sara",2543,1;
	monster '@mdmap$,153,96,"�t�F�C�����x����#20sara",2543,1;
	monster '@mdmap$,155,96,"�t�F�C�����x����#21sara",2543,1;
	monster '@mdmap$,157,96,"�t�F�C�����x����#22sara",2543,1;
	monster '@mdmap$,159,96,"�t�F�C�����x����#23sara",2543,1;
	monster '@mdmap$,151,180,"�t�F�C������앺#1sara4",2544,1;
	monster '@mdmap$,153,180,"�t�F�C������앺#2sara4",2544,1;
	monster '@mdmap$,155,180,"�t�F�C������앺#3sara4",2544,1;
	monster '@mdmap$,157,180,"�t�F�C������앺#4sara4",2544,1;
	monster '@mdmap$,159,180,"�t�F�C������앺#5sara4",2544,1;
	monster '@mdmap$,223,144,"�t�F�C������앺#6sara4",2544,1;
	monster '@mdmap$,221,144,"�t�F�C������앺#7sara4",2544,1;
	monster '@mdmap$,223,148,"�t�F�C������앺#8sara4",2544,1;
	monster '@mdmap$,221,148,"�t�F�C������앺#9sara4",2544,1;
	monster '@mdmap$,223,152,"�t�F�C������앺#10sara",2544,1;
	monster '@mdmap$,221,152,"�t�F�C������앺#11sara",2544,1;
	monster '@mdmap$,213,113,"�t�F�C������앺#12sara",2544,1;
	monster '@mdmap$,210,113,"�t�F�C������앺#13sara",2544,1;
	monster '@mdmap$,207,113,"�t�F�C������앺#14sara",2544,1;
	monster '@mdmap$,204,113,"�t�F�C������앺#15sara",2544,1;
	monster '@mdmap$,201,113,"�t�F�C������앺#16sara",2544,1;
	monster '@mdmap$,213,117,"�t�F�C������앺#17sara",2544,1;
	monster '@mdmap$,210,117,"�t�F�C������앺#18sara",2544,1;
	monster '@mdmap$,207,117,"�t�F�C������앺#19sara",2544,1;
	monster '@mdmap$,204,117,"�t�F�C������앺#20sara",2544,1;
	monster '@mdmap$,201,117,"�t�F�C������앺#21sara",2544,1;
	end;
}

1@sara.gat,155,196,0	script	callmon_a#sara300	139,{
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	stopnpctimer;
	switch('flag) {
	case 0:
		donpcevent getmdnpcname("callmon_a#sara300")+"::OnSpawn1";
		set 'flag,1;
		break;
	case 1:
		announce "�咷�V�A�C���� : �������X�ɏI��点�Ă��I",0x9,0xffff00;
		sleep 2000;
		donpcevent getmdnpcname("callmon_a#sara300")+"::OnSpawn2";
		set 'flag,2;
		break;
	case 2:
		sleep 1000;
		hideoffnpc getmdnpcname("�咷�V�A�C����#sa5b");
		break;
	}
	end;
OnSpawn1:
	set '@mdmap$,getmdmapname("1@sara.gat");
	set '@event$,getmdnpcname("callmon_a#sara300")+"::OnKilled";
	set '@mob[1],callmonster('@mdmap$,150,232,"�t�F�C������앺#1sara5",2544,'@event$);
	set '@mob[2],callmonster('@mdmap$,150,227,"�t�F�C������앺#2sara5",2544,'@event$);
	set '@mob[3],callmonster('@mdmap$,150,222,"�t�F�C������앺#3sara5",2544,'@event$);
	set '@mob[4],callmonster('@mdmap$,150,217,"�t�F�C������앺#4sara5",2544,'@event$);
	set '@mob[5],callmonster('@mdmap$,161,232,"�t�F�C������앺#5sara5",2544,'@event$);
	set '@mob[6],callmonster('@mdmap$,161,227,"�t�F�C������앺#6sara5",2544,'@event$);
	set '@mob[7],callmonster('@mdmap$,161,222,"�t�F�C������앺#7sara5",2544,'@event$);
	set '@mob[8],callmonster('@mdmap$,161,217,"�t�F�C������앺#8sara5",2544,'@event$);
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		unittalk '@mob['@i],"�t�F�C������앺 : �t�F�C�����ׂ̈�!!";
	end;
OnSpawn2:
	set '@boss,callmonster(getmdmapname("1@sara.gat"),156,228,"�咷�V�A�C����",2542,getmdnpcname("callmon_a#sara300")+"::OnKilled");
	unittalk '@boss,"�咷�V�A�C���� : �Ȃ̋w���Ƃ��Ă��I";
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@sara.gat"),getmdnpcname("callmon_a#sara300")+ "::OnKilled");
	if('count <= 0) {
		initnpctimer;
	}
	end;
}

1@sara.gat,152,233,5	script	�T���E�A�C����#sa5	668,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		cutin "sara_9sara2",2;
		mes "[�T��]";
		mes "�c�c�킩��Ȃ��c�c�T���́c�c";
		mes "�T���́c�c�Ђ����B";
		unittalk "�T�� : �c�c�킩��Ȃ��c�c�T���́c�c�T���́c�c�Ђ����B";
		next;
		if(SARA_1QUE > 0) {
			if(select("�}��","��b������") == 1) {
				cutin "sara_9sara2",255;
				mes "�]�T���͍Ăы��тȂ���A";
				mes "�@�쐼�̕��p�֓����Ă������B";
				mes "�@�咷�V�A�C�����ɘb�������悤�]";
				unittalk getcharid(3),strcharinfo(0)+" : �]�T���͍Ăы��тȂ���A�쐼�̕��p�֓����Ă������]";
				hideoffnpc getmdnpcname("�咷�V�A�C����#sa5a");
				hideonnpc getmdnpcname("�T���E�A�C����#sa5");
				close;
			}
		}
		hideoffnpc getmdnpcname("�咷�V�A�C����#sa5a");
		cutin "sara_elder_irine4",2;
		mes "[�咷�V�A�C����]";
		mes "�c�c�T���c�c";
		donpcevent getmdnpcname("�咷�V�A�C����#sa5a")+"::OnTalk1";
		next;
		cutin "sara_9sara2",2;
		mes "[�T��]";
		mes "�c�c�p�p�B";
		unittalk "�T�� : �c�c�p�p�B";
		next;
		cutin "sara_elder_irine4",2;
		mes "[�咷�V�A�C����]";
		mes "���܂����c�c�T���Ă�����A�T���c�c";
		mes "�����͂ƂĂ��댯�Ȃ񂾁B";
		mes "�����c�c�������ɂ�������Ⴂ�c�c�B";
		donpcevent getmdnpcname("�咷�V�A�C����#sa5a")+"::OnTalk2";
		next;
		cutin "sara_9sara2",2;
		mes "[�T��]";
		mes "���c�c�}�}�̌��c�c�B";
		mes "�����p�p�A�T���c�c�����c�c�B";
		mes "�ł��T���c�c�p�p�c�c�D���c�c�B";
		mes "�}�}�c�c�p�p�c�c�D���c�c�B";
		mes "�ǂ�������c�c�����c�c�́c�c�B";
		mes "�����c�c�����A���₟������!!";
		unittalk "�T�� : ���c�c�}�}�̌��c�c�B�����p�p�A�T���c�c�����c�c�B�ł��T���c�c�p�p�c�c�D���c�c�B�}�}�c�c�p�p�c�c�D���c�c�B�ǂ�������c�c�����c�c�́c�c�B�����c�c�����A���₟������!!";
		next;
		cutin "sara_elder_irine4",2;
		mes "[�咷�V�A�C����]";
		mes "�T��!!";
		donpcevent getmdnpcname("�咷�V�A�C����#sa5a")+"::OnTalk3";
		next;
		cutin "sara_9sara2",255;
		hideonnpc getmdnpcname("�T���E�A�C����#sa5");
		mes "�]�T���͍Ăы��тȂ���A";
		mes "�@�쐼�̕��p�֓����Ă������B";
		mes "�@�咷�V�A�C�����ɘb�������悤�]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T���͍Ăы��тȂ���A�쐼�̕��p�֓����Ă������]";
		close2;
		cutin "sara_elder_irine4",255;
		end;
	}
	else {
		cutin "sara_9sara2",2;
		mes "[�T��]";
		mes "�c�c�c�c�B";
		next;
		cutin "sara_9sara2",255;
		mes "^ff0000�]�p�[�e�B�[���[�_�[��";
		mes "�@�b�������Ă݂悤�]^000000";
		close;
	}
}

1@sara.gat,156,236,3	script	�咷�V�A�C����#sa5a	684,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		cutin "sara_elder_irine3",2;
		mes "[�咷�V�A�C����]";
		mes "�M�l�́c�c";
		mes "���̎E�l�Ƃ߁I�@�܂������Ă����̂��I";
		unittalk "�咷�V�A�C���� : �M�l�́c�c���̎E�l�Ƃ߁I�@�܂������Ă����̂��I";
		while(1) {
			next;
			switch(select("�ǂ����邩�l����","^0000ff�����͎E�l�Ƃł͂Ȃ��Ɛ�������i�퓬�Ȃ��j^000000","^ff0000�咷�V��͂ł˂�������i�퓬����j^000000")) {
			case 1:
				mes "[�咷�V�A�C����]";
				mes "�ǂ������I";
				mes "������������ǂ����I";
				unittalk "�咷�V�A�C���� : �ǂ������I�@������������ǂ����I";
				continue;
			case 2:
				cutin "sara_elder_irine3",255;
				mes "�]�����͎E�l�Ƃł͂Ȃ����Ƃ�";
				mes "�@�咷�V�A�C�����ɐ��������]";
				unittalk getcharid(3),strcharinfo(0)+" : �]�����͎E�l�Ƃł͂Ȃ����Ƃ�咷�V�A�C�����ɐ��������]";
				next;
				cutin "sara_elder_irine3",2;
				mes "[�咷�V�A�C����]";
				mes "�c�c�Ƃڂ�����肩�H";
				unittalk "�咷�V�A�C���� : �c�c�Ƃڂ�����肩�H";
				next;
				cutin "sara_elder_irine3",255;
				hideoffnpc getmdnpcname("#paydef_sara1");
				mes "[�t�F�C������앺]";
				mes "�咷�V�l�I";
				donpcevent getmdnpcname("#paydef_sara1")+"::OnTalk1";
				next;
				cutin "sara_elder_irine3",2;
				mes "[�咷�V�A�C����]";
				mes "��앺�I";
				mes "�E�l�Ƃ͂������I";
				mes "�������͂���!!";
				unittalk "�咷�V�A�C���� : ��앺�I�@�E�l�Ƃ͂������I�@�������͂���!!";
				next;
				cutin "sara_elder_irine3",255;
				mes "[�t�F�C������앺]";
				mes "�咷�V�l�A���ꂪ�c�c";
				donpcevent getmdnpcname("#paydef_sara1")+"::OnTalk2";
				next;
				cutin "sara_elder_irine3",2;
				mes "[�咷�V�A�C����]";
				mes "�ǂ������H";
				mes "���ً̋}���ԂɁI";
				unittalk "�咷�V�A�C���� : �ǂ������H�@���ً̋}���ԂɁI";
				next;
				cutin "sara_elder_irine3",255;
				mes "�]�咷�V�A�C�����́A�삯�t����";
				mes "�@�t�F�C������앺�Ɖ����";
				mes "�@�b���n�߂��B";
				mes "�@������x�A�咷�V�A�C������";
				mes "�@�b�������Ă݂悤�]";
				unittalk getcharid(3),strcharinfo(0)+" : �]�咷�V�A�C�����́A�삯�t�����t�F�C������앺�Ɖ����b���n�߂��]";
				close2;
				hideonnpc getmdnpcname("�咷�V�A�C����#sa5a");
				hideonnpc getmdnpcname("#paydef_sara1");
				hideoffnpc getmdnpcname("�咷�V�A�C����#sa5b");
				set getvariableofnpc('flag,getmdnpcname("�咷�V�A�C����#sa5b")),1;
				end;
			case 3:
				cutin "sara_elder_irine3",255;
				mes "�]�T����ǂ��̂��͂΂ނ��߁A";
				mes "�@�咷�V�A�C�����̑O��";
				mes "�@�����͂��������]";
				unittalk getcharid(3),strcharinfo(0)+" : �]�T����ǂ��̂��͂΂ނ��߁A�咷�V�A�C�����̑O�ɗ����͂��������]";
				next;
				cutin "sara_elder_irine3",2;
				mes "[�咷�V�A�C����]";
				mes "�����I";
				mes "�������͂���!!";
				unittalk "�咷�V�A�C���� : �����I�@�������͂���!!";
				close2;
				cutin "sara_9sara2",255;
				hideonnpc getmdnpcname("�咷�V�A�C����#sa5a");
				hideonnpc getmdnpcname("#paydef_sara1");
				set getvariableofnpc('flag,getmdnpcname("�咷�V�A�C����#sa5b")),2;
				donpcevent getmdnpcname("callmon_a#sara300")+"::OnStart";
				end;
			}
		}
	}
	else {
		cutin "sara_elder_irine4",2;
		mes "[�咷�V�A�C����]";
		mes "�c�c�c�c�B";
		next;
		cutin "sara_elder_irine4",255;
		mes "^ff0000�]�p�[�e�B�[���[�_�[��";
		mes "�@�b�������Ă݂悤�]^000000";
		close;
	}
OnTalk1:
	unittalk "�咷�V�A�C���� : �c�c�T���c�c";
	end;
OnTalk2:
	unittalk "�咷�V�A�C���� : ���܂����c�c�T���Ă�����A�T���c�c�����͂ƂĂ��댯�Ȃ񂾁B �����c�c�������ɂ�������Ⴂ�c�c�B";
	end;
OnTalk3:
	unittalk "�咷�V�A�C���� : �T��!!";
	end;
}

1@sara.gat,156,236,3	script	�咷�V�A�C����#sa5b	684,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		if('flag == 1) {
			cutin "sara_elder_irine4",2;
			mes "[�咷�V�A�C����]";
			mes "���������������A";
			mes "�N�������̌���Ƃ͗��ꂽ�ꏊ��";
			mes "������������炵���c�c�B";
			unittalk "�咷�V�A�C���� : ���������������A�N�������̌���Ƃ͗��ꂽ�ꏊ�Ō�����������炵���c�c�B";
		}
		else if('flag == 2) {
			cutin "sara_elder_irine4",2;
			mes "[�咷�V�A�C����]";
			mes "�������c�c";
			mes "����قǋ�����������Ƃ́B";
			unittalk "�咷�V�A�C���� : �������c�c����قǋ�����������Ƃ́B";
			next;
			mes "[�咷�V�A�C����]";
			mes "�N�̎w�����󂯂Ă���Ȏ����I";
			mes "�Ȃ����łȂ��A�T���܂ő_���Ƃ�!!";
			unittalk "�咷�V�A�C���� : �N�̎w�����󂯂Ă���Ȏ����I�@�Ȃ����łȂ��A�T���܂ő_���Ƃ�!!";
		}
		next;
		if(SARA_1QUE > 0) {
			if(select("�}��","��b������") == 1) {
				mes "[�咷�V�A�C����]";
				mes "���͂��o���ăT����T���o�����B";
				mes "�N���T�����������玄�̏���";
				mes "�A��ė��Ă���B";
				mes "������T���ɂ��ׂĂ��������c�c�B";
				unittalk "�咷�V�A�C���� : ���͂��o���ăT����T���o�����B�N���T�����������玄�̏��ɘA��ė��Ă���B������T���ɂ��ׂĂ��������c�c�B";
				announce strcharinfo(0) + " : �T���������čs�����쐼�̕����ɍs���Ă݂悤�B",0x9,0xffff00;
				cutin "sara_elder_irine4",255;
				hideonnpc getmdnpcname("�咷�V�A�C����#sa5b");
				hideoffnpc getmdnpcname("warp56#sara5");
				close;
			}
		}
		menu "�E�l�Ƃ͂��Ȃ��ł͂Ȃ��̂��H",-;
		cutin "sara_elder_irine4",255;
		mes "[" + strcharinfo(0) + "]";
		mes "�����炩��͂��Ȃ����T���̕�e��";
		mes "�E�����悤�Ɍ����܂����B";
		unittalk getcharid(3),strcharinfo(0)+" : �����炩��͂��Ȃ����T���̕�e���E�����悤�Ɍ����܂����B";
		next;
		cutin "sara_elder_irine4",2;
		mes "[�咷�V�A�C����]";
		mes "�����Ȃ��E��������!?";
		unittalk "�咷�V�A�C���� : �����Ȃ��E��������!?";
		next;
		mes "[�咷�V�A�C����]";
		mes "�����Ȃ̕����ɓ��������ɂ́A";
		mes "�Ȃ͂��łɎh�q�����ɂ���āc�c�B";
		mes "�T���������Ă����̂́A";
		mes "�������̎h�q������|�������ゾ�I";
		unittalk "�咷�V�A�C���� : �����Ȃ̕����ɓ��������ɂ́A�Ȃ͂��łɎh�q�����ɂ���āc�c�B�T���������Ă����̂́A�������̎h�q������|�������ゾ�I";
		next;
		cutin "sara_momdie",4;
		mes "�]�咷�V�A�C�����̘b�𕷂��A������";
		mes "�@�󋵂�������x�v���o���Ă݂��]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�咷�V�A�C�����̘b�𕷂��A�����̏󋵂�������x�v���o���Ă݂��]";
		next;
		mes "�]�m���ɁA�咷�V�A�C�����̎��ӂɂ�";
		mes "�@�T���̕�e�̂ق��ɁA�������𒅂�";
		mes "�@�N�����|��Ă����悤�ȁc�c�]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�m���ɁA�咷�V�A�C�����̎��ӂɂ̓T���̕�e�̂ق��ɁA�������𒅂��N�����|��Ă����悤�ȁc�c�]";
		next;
		cutin "sara_elder_irine4",2;
		mes "[�咷�V�A�C����]";
		mes "�h�q�ł͂Ȃ��Ȃ�A�N�͂��������N���H";
		mes "�ǂ����ăT���ƈꏏ�ɂ����܂ŗ����H";
		unittalk "�咷�V�A�C���� : �h�q�ł͂Ȃ��Ȃ�A�N�͂��������N���H�@�ǂ����ăT���ƈꏏ�ɂ����܂ŗ����H";
		next;
		mes "�]���R�������V�l�̉�b�𕷂��A";
		mes "�@�T���̐g���S�z�ɂȂ������߁A";
		mes "�@�ǂ������Ă������Ƃ�`�����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]���R�������V�l�̉�b�𕷂��A�T���̐g���S�z�ɂȂ������߁A�ǂ������Ă������Ƃ�`�����]";
		next;
		mes "[�咷�V�A�C����]";
		mes "�������V�l�c�c�H";
		mes "�N�̘b���{���Ȃ�A";
		mes "�傫�ȊԈႢ��Ƃ��Ă��܂����悤���B";
		mes "�����A�����ČN���c�c";
		unittalk "�咷�V�A�C���� : �������V�l�c�c�H�@�N�̘b���{���Ȃ�A�傫�ȊԈႢ��Ƃ��Ă��܂����悤���B�����A�����ČN���c�c";
		next;
		mes "[�咷�V�A�C����]";
		mes "���͌N���Ȃ��E�����h�q�̒��Ԃ���";
		mes "��������A�N�͎����Ȃ��E������";
		mes "��������Ă����̂��B";
		unittalk "�咷�V�A�C���� : ���͌N���Ȃ��E�����h�q�̒��Ԃ��ƌ�������A�N�͎����Ȃ��E�����ƌ�������Ă����̂��B";
		next;
		mes "[�咷�V�A�C����]";
		mes "���̕s���̘V�l�����c�c";
		mes "��͂蒷�V�����̎d�ƂȂ̂��c�c�B";
		unittalk "�咷�V�A�C���� : ���̕s���̘V�l�����c�c��͂蒷�V�����̎d�ƂȂ̂��c�c�B";
		next;
		mes "[�咷�V�A�C����]";
		mes "�I";
		mes "�܂����T�����A�����Ȃ�";
		mes "�E�����ƍl���Ă���̂�?!";
		unittalk "�咷�V�A�C���� : �I�@�܂����T�����A�����Ȃ��E�����ƍl���Ă���̂�?!";
		next;
		mes "[�咷�V�A�C����]";
		mes "����ŃT���͎�������";
		mes "�����Ă����̂��H";
		mes "��������E�����Ǝv���āc�c";
		unittalk "�咷�V�A�C���� : ����ŃT���͎������ċ����Ă����̂��H�@��������E�����Ǝv���āc�c";
		next;
		mes "[�咷�V�A�C����]";
		mes "�����A�T���I";
		mes "���O�̐�]�͂ǂ�قǂ��낤�c�c�B";
		unittalk "�咷�V�A�C���� : �����A�T���I�@���O�̐�]�͂ǂ�قǂ��낤�c�c�B";
		next;
		mes "[�咷�V�A�C����]";
		mes "���͂��o���ăT����T���o�����B";
		mes "�N���T�����������玄�̏���";
		mes "�A��ė��Ă���B";
		mes "������T���ɂ��ׂĂ��������c�c�B";
		unittalk "�咷�V�A�C���� : ���͂��o���ăT����T���o�����B�N���T�����������玄�̏��ɘA��ė��Ă���B������T���ɂ��ׂĂ��������c�c�B";
		close2;
		announce strcharinfo(0) + " : �T���������čs�����쐼�̕����ɍs���Ă݂悤�B",0x9,0xffff00;
		cutin "sara_elder_irine4",255;
		hideonnpc getmdnpcname("�咷�V�A�C����#sa5b");
		hideoffnpc getmdnpcname("warp56#sara5");
		end;
	}
	else {
		mes "^ff0000�]�C�x���g�̐i�s��";
		mes "�@�p�[�e�B�[���[�_�[�̂݉\�ł��]^000000";
		close;
	}
}

1@sara.gat,162,233,1	script	#paydef_sara1	2544,{
	end;
OnTalk1:
	unittalk "�t�F�C������앺 : �咷�V�l�I";
	end;
OnTalk2:
	unittalk "�t�F�C������앺 : �咷�V�l�A���ꂪ�c�c";
	end;
}

1@sara.gat,88,188,0	warp	warp56#sara5	2,2,1@sara.gat,89,175

1@sara.gat,39,142,3	script	�T���E�A�C����#sa6	668,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		hideoffnpc getmdnpcname("#hugin_sara2");
		if(SARA_1QUE > 0) {
			mes "�]�T�����������]";
			next;
			if(select("�}��","��b������") == 1) {
				mes "�]�T�����������̂Ɠ����Ɏ��ӂ�";
				mes "�@���i���c�ݎn�߂��B";
				mes "�@�T���Ƃ̃��[�����b���Ă����悤�ɁA";
				mes "�@���Ԃ���o�Ȃ���΂Ȃ�Ȃ��悤���]";
				unittalk getcharid(3),strcharinfo(0)+" : �]�T�����������̂Ɠ����Ɏ��ӂ̕��i���c�ݎn�߂��B�T���Ƃ̃��[�����b���Ă����悤�ɁA���Ԃ���o�Ȃ���΂Ȃ�Ȃ��悤���]";
				close2;
				hideonnpc getmdnpcname("�T���E�A�C����#sa6");
				hideoffnpc getmdnpcname("#warp_end_sara6");
				hideoffnpc getmdnpcname("warp67#sara6");
				end;
			}
		}
		mes "�]�T���ɐ��������悤�Ƃ���";
		mes "�@�u�ԁA�w�ォ�狭���P������";
		mes "�@���ꗎ�����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T���ɐ��������悤�Ƃ����u�ԁA�w�ォ�狭���P�����󂯕��ꗎ�����]";
		next;
		cutin "sara_beholder",2;
		mes "[�H�H�H�H�H]";
		mes "���Ԃ̗��l�̊��͂����܂łł��B";
		mes "���Ȃ��͎��B���ޏ����}������邽�߂�";
		mes "�����������Ԃ̒��̂ЂƂł���";
		mes "����܂���B";
		donpcevent getmdnpcname("#hugin_sara2")+"::OnTalk1";
		next;
		mes "[�H�H�H�H�H]";
		mes "���낻�날�Ȃ����Z��ł������Ԃ�";
		mes "�߂������������ł��傤�B";
		donpcevent getmdnpcname("#hugin_sara2")+"::OnTalk2";
		next;
		mes "[�H�H�H�H�H]";
		mes "���ꂩ�炠�Ȃ��̋L���͏������Ă��炢�܂��B";
		mes "���̎��ԂɋA�鍠�ɂ͂����ŋN���������Ƃ͉����o���Ă��Ȃ��ł��傤�B";
		donpcevent getmdnpcname("#hugin_sara2")+"::OnTalk3";
		misceffect 134,"";
		next;
		mes "�]���̕s���̒j�����|�ꂽ����";
		mes "�@�u�����܂܃T���ɋߊ�����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]���̕s���̒j�����|�ꂽ����u�����܂܃T���ɋߊ�����]";
		next;
		mes "[�H�H�H�H�H]";
		mes "���؂�Ɛ�]�A";
		mes "�����ɐk���Ă��鏭����c�c";
		mes "�N������ׂ��ꏊ�ɓ����Ă��c�c�B";
		donpcevent getmdnpcname("#hugin_sara2")+"::OnTalk4";
		next;
		cutin "sara_9sara2",2;
		mes "[�T��]";
		mes "�c�c�c�c�B";
		unittalk "�T�� : �c�c�c�c�B";
		next;
		cutin "sara_beholder",2;
		mes "[�H�H�H�H�H]";
		mes "�T���E�A�C�����A���ɂ��ė��Ȃ����B";
		mes "���̕������O���]�ޖ�����^���Ă���邾�낤�B";
		donpcevent getmdnpcname("#hugin_sara2")+"::OnTalk5";
		next;
		cutin "sara_beholder",255;
		mes "�]���̕s���̒j�����g�̃}���g��";
		mes "�@�T���𕢂��킹���u�ԁA�T�����܂�";
		mes "�@�O�l�̎p�����Ղ��c������";
		mes "�@�������]";
		unittalk getcharid(3),strcharinfo(0)+" : �]���̕s���̒j�����g�̃}���g�ŃT���𕢂��킹���u�ԁA�T�����܂񂾎O�l�̎p�����Ղ��c�����ɏ������]";
		hideonnpc getmdnpcname("�T���E�A�C����#sa6");
		next;
		mes "�]�T�����������̂Ɠ����Ɏ��ӂ�";
		mes "�@���i���c�ݎn�߂��B";
		mes "�@�T���Ƃ̃��[�����b���Ă����悤�ɁA";
		mes "�@���Ԃ���o�Ȃ���΂Ȃ�Ȃ��悤���]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�T�����������̂Ɠ����Ɏ��ӂ̕��i���c�ݎn�߂��B�T���Ƃ̃��[�����b���Ă����悤�ɁA���Ԃ���o�Ȃ���΂Ȃ�Ȃ��悤���]";
		close2;
		hideoffnpc getmdnpcname("#warp_end_sara6");
		hideoffnpc getmdnpcname("warp67#sara6");
		end;
	}
	else {
		mes "[�T��]";
		mes "�N�c�c�H";
		next;
		mes "^ff0000�]�T���͋����Ă���悤���B";
		mes "�@�p�[�e�B�[���[�_�[��";
		mes "�@�b�������Ă݂悤�]^000000";
		close;
	}
}

1@sara.gat,36,144,3	script	#hugin_sara2	111,{
	end;
OnTalk1:
	unittalk "�H�H�H�H�H : ���Ԃ̗��l�̊��͂����܂łł��B���Ȃ��͎��B���ޏ����}������邽�߂ɏ����������Ԃ̒��̂ЂƂł�������܂���B";
	end;
OnTalk2:
	unittalk "�H�H�H�H�H : ���낻�날�Ȃ����Z��ł������Ԃɖ߂������������ł��傤�B";
	end;
OnTalk3:
	unittalk "�H�H�H�H�H : ���ꂩ�炠�Ȃ��̋L���͏������Ă��炢�܂��B���̎��ԂɋA�鍠�ɂ͂����ŋN���������Ƃ͉����o���Ă��Ȃ��ł��傤�B";
	end;
OnTalk4:
	unittalk "�H�H�H�H�H : ���؂�Ɛ�]�A�����ɐk���Ă��鏭����c�c�N������ׂ��ꏊ�ɓ����Ă��c�c�B";
	end;
OnTalk5:
	unittalk "�H�H�H�H�H : �T���E�A�C�����A���ɂ��ė��Ȃ����B���̕������O���]�ޖ�����^���Ă���邾�낤�B";
	end;
}

1@sara.gat,36,144,0	script	#warp_end_sara6	139,30,5,{
OnTouch:
	compquest 15003;
	warp "dali.gat",134,111;
	end;
}

1@sara.gat,16,143,0	script	warp67#sara6	45,2,2,{
OnTouch:
	compquest 15003;
	warp "dali.gat",134,111;
	end;
}

1@sara.gat,107,252,0	script	sara_exmob1	139,3,3,{
OnTouch:
	if('flag > 0)
		end;
	set 'flag,1;
	monster getmdmapname("1@sara.gat"),106,255,"�t�F�C�����x����#ex1sar",2543,1;
	monster getmdmapname("1@sara.gat"),108,255,"�t�F�C�����x����#ex2sar",2543,1;
	monster getmdmapname("1@sara.gat"),106,246,"�t�F�C�����x����#ex3sar",2543,1;
	monster getmdmapname("1@sara.gat"),108,246,"�t�F�C�����x����#ex4sar",2543,1;
	end;
}

1@sara.gat,82,259,0	script	sara_exmob2	139,3,3,{
OnTouch:
	if('flag > 0)
		end;
	set 'flag,1;
	monster getmdmapname("1@sara.gat"),81,265,"�t�F�C�����x����#ex1sar",2543,1;
	monster getmdmapname("1@sara.gat"),82,265,"�t�F�C�����x����#ex2sar",2543,1;
	monster getmdmapname("1@sara.gat"),81,252,"�t�F�C�����x����#ex3sar",2543,1;
	monster getmdmapname("1@sara.gat"),82,252,"�t�F�C�����x����#ex4sar",2543,1;
	end;
}
