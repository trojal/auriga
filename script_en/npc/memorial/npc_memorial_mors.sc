//= Auriga Script ==============================================================
// Ragnarok Online Morse Cave Script	by refis
//==============================================================================

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
moro_cav.gat,61,69,3	script	��C�ǐՑ���#a1	730,{
	if(checkquest(9319) || checkquest(118930)) {
		if(checkquest(9319)&0x2 == 0 || checkquest(118930)&0x2 == 0) {
			mes "[��C�ǐՑ���]";
			mes "�͂̉񕜂ׂ̈Ɏ�i�ƕ��@��I�΂Ȃ�";
			mes "�����N�̂��Ƃ��l���Ă�����A";
			mes "�s���Ŗ������܂���B";
			next;
			mes "[��C�ǐՑ���]";
			mes "�����ł��ˁc�c�B";
			mes "���ꂵ�Ă���1��ڂ�";
			mes "^ff0000�ߑO5���ȍ~^000000�ɂ܂����Ă��������B";
			mes "�A���A�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂��Ȃ���";
			mes "����o���Ȃ��݂����ł��B";
			close;
		}
	}
	if(checkquest(201725)) {	// �����X�N���A�ς�
		mes "[��C�ǐՑ���]";
		mes "������x�߂��ė���Ǝv���܂����B";
		next;
		mes "[��C�ǐՑ���]";
		mes "�����N�𑊎肷��ׂɂ�";
		mes "1�l�ł͂ƂĂ��댯�Ȃ̂�";
		mes "�p�[�e�B�[���Ɨ͂����킹�ĉ������B";
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�����A�Ԃ��Ԃɒʂ��铹�𗘗p����Ȃ�";
			mes "�p�[�e�B�[���[�_�[�̕���";
			mes "���ɘb��������悤�A�`���Ă��������B";
			close;
		}
		mes "����ł�";
		mes "�Ԃ��Ԃɓ����Ă݂܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[��C�ǐՑ���]";
			mes "�C���ς������";
			mes "�܂��K�˂ė��ĉ������I";
			close;
		}
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[��C�ǐՑ���]";
			mes "�܂��Ԃ��Ԃ֑�������";
			mes "�J���Ă��܂���B";
			mes "�����҂��ĉ������B";
			close;
		}
		mdcreate "mors";
		mes "[��C�ǐՑ���]";
		mes "�����A�Ԃ��Ԃ�";
		mes "�ʂ��铹���J���܂����B";
		mes "���̓����J���鎞�Ԃ�";
		mes "��������Ă���̂�";
		mes "���������ĉ������B";
		close;
	}
	mes "[��C�ǐՑ���]";
	mes "�����̓����N������h���A���R��";
	mes "�őO���ł��B";
	mes "���̓����N�̑��Ղ�ǂ��Ă��܂��B";
	next;
	if(checkquest(201720) == 0) {	// �r�I�X�̓����U��
		mes "[��C�ǐՑ���]";
		mes "���݁A���̐Ԃ��Ԃ𒲍����ł��B";
		mes "�ǂ������ׂ̗ɂ���A";
		mes "���F����Ɛ[���֌W��";
		mes "���肻���Ȃ̂ł����c�c�B";
		next;
		mes "�]^ff0000���F����^000000���ɒ������悤�]";
		close;
	}
	mes "[��C�ǐՑ���]";
	mes "����܂ł̓w�͂�����A";
	mes "���Ƀ����N�̐�����Ƃ���";
	mes "�L�͂ȏꏊ�𔭌����܂����B";
	next;
	mes "[��C�ǐՑ���]";
	mes "���ꂪ����^ff0000�Ԃ���^000000�ł��B";
	next;
	mes "[��C�ǐՑ���]";
	mes "�����A�ǐՂ���Ƃ��鎄�̗͂ł�";
	mes "��������ւ̐N����";
	mes "�댯�ł���Ɣ��f���܂����B";
	next;
	mes "[��C�ǐՑ���]";
	mes "���Ȃ���������K�ꂽ�Ƃ�������";
	mes "�����ړI�����������͎҂ł��傤�H";
	next;
	mes "[��C�ǐՑ���]";
	mes "�ǂ��ł��傤�B";
	mes "����֐N�����ă����N�ǐՂ�";
	mes "��w��؂��Ă���܂��񂩁H";
	next;
	mes "[��C�ǐՑ���]";
	mes "�A���A����Ă���Ƃ͂���";
	mes "����̓����N�ł��B";
	mes "1�l�ł͊댯�Ȃ̂�";
	mes "�K��^ff0000�p�[�e�B�[��g���^000000";
	mes "����ł��������B";
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		next;
		mes "[��C�ǐՑ���]";
		mes "�Ԃ��Ԃ֒ʂ��铹�͎����J���Ă��܂��B";
		mes "�����A��ɐi�ނ悤�ł�����";
		mes "�p�[�e�B�[���[�_�[�̕���";
		mes "���ɘb��������悤�A�`���Ă��������B";
		close;
	}
	mes "�ł͐Ԃ��Ԃɓ����Ă݂܂����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[��C�ǐՑ���]";
		mes "�C���ς������";
		mes "�܂��K�˂ė��ĉ������I";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[��C�ǐՑ���]";
		mes "�܂��Ԃ��Ԃ�";
		mes "��������";
		mes "�J���Ă��܂���B";
		mes "�����҂��ĉ������B";
		close;
	}
	mdcreate "mors";
	mes "[��C�ǐՑ���]";
	mes "�����A�Ԃ��Ԃ�";
	mes "�ʂ��铹���J���܂����B";
	mes "���̓����J���鎞�Ԃ�";
	mes "��������Ă���̂�";
	mes "���������ĉ������B";
	close;
OnInit:
	waitingroom "�����X�̓��A����",0;
	end;
}
moro_cav.gat,57,69,3	script	�Ԃ���#a1	844,{
	if(checkquest(9319) || checkquest(118930)) {
		if(checkquest(9319)&0x2 == 0 || checkquest(118930)&0x2 == 0) {
			mes "�]�Ԃ��Ԃ�������Ă���B";
			mes "�@���鎖���ł��Ȃ��������]";
			next;
			mes "�]���ꂵ�Ă���1��ڂ�";
			mes "�@^ff0000�ߑO5���ȍ~^000000�ɂ܂����Ă݂悤�B";
			mes "�@�A���A�Ō�̓�������Ă���";
			mes "�@^ff00001����^000000�o�߂��Ȃ���";
			mes "�@����o���Ȃ��悤���]";
			close;
		}
	}
	if(checkquest(201720) == 0) {	// �r�I�X�̓����U��
		mes "[��C�ǐՑ���]";
		mes "�����̓����N������h���A���R��";
		mes "�őO���ł��B";
		mes "���̓����N�̑��Ղ�ǂ��Ă��܂��B";
		mes "�@";
		mes "�]^ff0000�r�I�X�̓����U���̂���";
		mes "�@���ꂪ�o���܂���^000000�]";
		close;
	}
	mes "�]�Ԃ��Ԃ�����]";
	next;
	if(select("�Ԃ��Ԃɓ���","�Ԃ��Ԃɓ���Ȃ�") == 2) {
		mes "�]���̏����ɂ����]";
		close;
	}
	switch(mdenter("mors")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[mors] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		setquest 9319;
		setquest 9318;
		setquest 118930;
		donpcevent getmdnpcname("MorsControl")+ "::OnStart";
		close2;
		//warp "1@rev.gat",26,181;
		end;
	case 1:	// �p�[�e�B�[������
		mes "�]�p�[�e�B�[���̂݁A";
		mes "�@�������A���_���W������";
		mes "�@���ꂷ�邱�Ƃ��ł��܂��]";
		close;
	case 2:	// �_���W�������쐬
		mes "�]�p�[�e�B�[���[�_�[��";
		mes "�@�������A���_���W������";
		mes "�@�������Ă��Ȃ���Ԃł��]";
		close;
	default:	// ���̑��G���[
		close;
	}
OnTimer15000:
	initnpctimer;
	misceffect 239;
	end;
OnInit:
	initnpctimer;
	waitingroom "�����X�̓��A����",0;
	end;
}

//============================================================
// �����X�̓��A
//------------------------------------------------------------
1@rev.gat,1,1,0	script	MorsControl	139,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("�������C�O���h#RZ1");
	hideonnpc getmdnpcname("�L�h#RZ1");
	hideonnpc getmdnpcname("�q�V�G#RZ1");
	hideonnpc getmdnpcname("�������C�O���h#RZ2");
	hideonnpc getmdnpcname("�L�h#RZ2");
	hideonnpc getmdnpcname("�q�V�G#RZ2");
	hideonnpc getmdnpcname("�������C�O���h#RZ3");
	hideonnpc getmdnpcname("�L�h#RZ3");
	hideonnpc getmdnpcname("�q�V�G#RZ3");
	hideonnpc getmdnpcname("�������C�O���h#RZ4");
	hideonnpc getmdnpcname("�L�h#RZ4");
	hideonnpc getmdnpcname("�q�V�G#RZ4");
	hideonnpc getmdnpcname("�������C�O���h#RZ5");
	hideonnpc getmdnpcname("�L�h#RZ5");
	hideonnpc getmdnpcname("�q�V�G#RZ5");

	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_2");
	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_3");
	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_5");
	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_6");
	hideonnpc getmdnpcname("�����X�E�����m#RZ1");
	hideonnpc getmdnpcname("#RZ�C�x���g_1");
	hideonnpc getmdnpcname("#RZ�C�x���g_1-2");

	hideonnpc getmdnpcname("#RZ�ړ�_1");
	hideonnpc getmdnpcname("#RZ�ړ�_2");
	hideonnpc getmdnpcname("#RZ�ړ�_3");
	hideonnpc getmdnpcname("#RZ�ړ�_4");
	hideonnpc getmdnpcname("#RZ�ړ�_5");
	hideonnpc getmdnpcname("#RZ�ړ�_6");
	hideonnpc getmdnpcname("#RZ�ړ�_7");
	hideonnpc getmdnpcname("#RZ�ړ�_8");
	hideonnpc getmdnpcname("#RZ�ړ�_5a");
	hideonnpc getmdnpcname("#RZ�ړ�_6a");
	hideonnpc getmdnpcname("#RZ�ړ�_7a");
	hideonnpc getmdnpcname("#RZ�ړ�_8a");

	hideonnpc getmdnpcname("#RZ�ړ�_13a");
	hideonnpc getmdnpcname("#RZ�ړ�_14a");
	hideonnpc getmdnpcname("#RZ�ړ�_15a");
	hideonnpc getmdnpcname("#RZ�ړ�_16a");
	hideonnpc getmdnpcname("#RZ�ړ�_13");
	hideonnpc getmdnpcname("#RZ�ړ�_14");
	hideonnpc getmdnpcname("#RZ�ړ�_15");
	hideonnpc getmdnpcname("#RZ�ړ�_16");

	hideonnpc getmdnpcname("#RZ�ړ�_17a");

	hideonnpc getmdnpcname("#RZ�ړ�_30");
	hideonnpc getmdnpcname("#RZ�ړ�_31");
	hideonnpc getmdnpcname("#RZ�ړ�_32");
}

1@rev.gat,27,181,0	script	#RZ�������A���X�^�[�g	139,1,1,{
OnTouch:
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
	hideonnpc getmdnpcname("#RZ�������A���X�^�[�g");
	hideoffnpc getmdnpcname("#RZ�C�x���g_1");
	end;
}

1@rev.gat,34,120,0	script	#RZ_EFFECT01	139,{
OnStart:
	initnpctimer;
	misceffect 89;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 196;
	end;
OnStop:
	stopnpctimer;
	end;
}

1@rev.gat,34,48,0	script	#RZ_EFFECT02	139,{
OnStart:
	initnpctimer;
	misceffect 89;
	misceffect 196;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 196;
	end;
OnStop:
	stopnpctimer;
	end;
}

1@rev.gat,31,181,0	script	#RZ�C�x���g_1	139,5,5,{
OnTouch:
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
	pcblockmove 1;
	set '@dummy,sleep2(3000);
	misceffect 1, getmdnpcname("#RZ�������A���X�^�[�g");
	announce "�����N : �N���H�@���̋x���̎ז�������̂́B", 0x9, 0x00ebff;
	set '@dummy,sleep2(2000);
	announce "�]�ǂ�����Ƃ��Ȃ���������B�ǂ���炱���������N�̐�����ŊԈႢ�Ȃ��悤���]", 0x9, 0x00ebff;
	set '@dummy,sleep2(4000);
	announce "�H�H�H : �҂��Ă���I", 0x9, 0x00ebff;
	set '@dummy,sleep2(2000);
	misceffect 60,""; //self
	pcblockmove 0;
	hideonnpc getmdnpcname("#RZ�C�x���g_1");
	hideoffnpc getmdnpcname("#RZ�C�x���g_1-2");
	end;
}

1@rev.gat,31,181,0	script	#RZ�C�x���g_1-2	139,5,5,{
OnTouch:
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
	mes "�]������琺����������H";
	mes "�@�N�������̂��낤���]";
	next;
	set 'menu,select(
		(ASH_6QUE == 14 || ASH_6QUE == 15? "�C�O���h": "�H�H�H"),
		(ASH_5QUE >= 31? "�L�h": "�H�H�H"),
		(ECL_3QUE >= 33? "�q�V�G": "�H�H�H"),
		"�N�����Ȃ�");
	hideonnpc getmdnpcname("#RZ�C�x���g_1-2");
	switch('menu) {
	case 1:
		if(ASH_6QUE < 14 || ASH_6QUE > 15) {
			mes "�]�������������C���������A";
			mes "�@�C�̂����������悤���]";
			mes "�]^ff0000�O�����ւ̕񍐏��N�G�X�g^000000��";
			mes "�@�N���A���Ă��Ȃ�����";
			mes "�@���Ԃ͂������܂���ł����]";
			set 'menu,0;
			donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
			close;
		}
		hideoffnpc getmdnpcname("�������C�O���h#RZ1");
		donpcevent getmdnpcname("�������C�O���h#RZ1")+ "::OnStart";
		break;
	case 2:
		if(ASH_5QUE < 31) {
			mes "�]�������������C���������A";
			mes "�@�C�̂����������悤���]";
			mes "�]^ff0000���������N�ǐՃN�G�X�g^000000��";
			mes "�@�N���A���Ă��Ȃ�����";
			mes "�@���Ԃ͂������܂���ł����]";
			set 'menu,0;
			donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
			close;
		}
		hideoffnpc getmdnpcname("�L�h#RZ1");
		donpcevent getmdnpcname("�L�h#RZ1")+ "::OnStart";
		break;
	case 3:
		if(ECL_3QUE < 33) {
			mes "�]�������������C���������A";
			mes "�@�C�̂����������悤���]";
			mes "�]^ff0000�G�N���[�W���̉��N�G�X�g^000000��";
			mes "�@�N���A���Ă��Ȃ�����";
			mes "�@���Ԃ͂������܂���ł����]";
			set 'menu,0;
			donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
			close;
		}
		hideoffnpc getmdnpcname("�q�V�G#RZ1");
		donpcevent getmdnpcname("�q�V�G#RZ1")+ "::OnStart";
		break;
	case 4:	//??
		mes "�]�������������C���������A";
		mes "�@�C�̂����������悤���]";
		set 'menu,0;
		donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
		close;
	}
	mes "�]���Ԃ���������-";
	close;
}

1@rev.gat,20,181,0	script	#�����X�����X�^�[�g	139,{
OnStart:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#�����X�����X�^�[�g")+ "::OnKilled";
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	monster '@map$,38,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,182,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,182,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,70,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,70,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,70,182,"�����X�E�O�[��",3001,1,'@label$;
	initnpctimer;
	end;
OnTimer2000:
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#�����X�����X�^�[�g")+ "::OnKilled");
	if('@count <= 0) {
		stopnpctimer;
		hideoffnpc getmdnpcname("���_�A���N#RZ�C�x���g_2");
		if('menu == 1) {
			hideonnpc getmdnpcname("�������C�O���h#RZ1");
			hideoffnpc getmdnpcname("�������C�O���h#RZ2");
		} else if('menu == 2) {
			hideonnpc getmdnpcname("�L�h#RZ1");
			hideoffnpc getmdnpcname("�L�h#RZ2");
		} else if('menu == 3) {
			hideonnpc getmdnpcname("�q�V�G#RZ1");
			hideoffnpc getmdnpcname("�q�V�G#RZ2");
		}
		donpcevent getmdnpcname("���_�A���N#RZ�C�x���g_2")+ "::OnStart";
	}
	end;
OnTimer4000:
	initnpctimer;
	end;
OnKilled:
	end;
}

1@rev.gat,25,183,5	script	�������C�O���h#RZ1	751,{
	mes "[�C�O���h]";
	mes "�C��t����I";
	mes "�G�����Ă��邼�I";
	close;
OnStart:
	initnpctimer;
	unittalk "�C�O���h : �ӂ��B�Ԃɍ������悤���ȁB";
	end;
OnTimer3000:
	donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
	unittalk "�C�O���h : �Z�c�c����A�i�ߊ��ɋ��͂�����Ă����B�ꏏ�ɉ����s�����Ă���B";
	end;
OnTimer6000:
	stopnpctimer;
	unittalk "�C�O���h : �C��t����I�@���������G�������悤�����I";
	end;
}

1@rev.gat,25,183,5	script	�L�h#RZ1	884,{
	mes "[�L�h]";
	mes "�G�����邼�I";
	close;
OnStart:
	initnpctimer;
	unittalk "�L�h : �Ԃɍ��������B";
	end;
OnTimer3000:
	donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
	unittalk "�L�h : ���[���ɂ͓`���Ă����B����̎����߂Â��Ă���B�����ꏏ�ɍs�����Ă���B";
	end;
OnTimer6000:
	stopnpctimer;
	unittalk "�L�h : ���������G����̂��o�܂����B�C��t����I";
	end;
}

1@rev.gat,25,183,5	script	�q�V�G#RZ1	623,{
	mes "[�q�V�G]";
	mes "�G�����Ă��邼�I";
	mes "���ӂ���I";
	close;
OnStart:
	initnpctimer;
	unittalk "�q�V�G : �Ԃɍ��������B";
	end;
OnTimer3000:
	donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
	unittalk "�q�V�G : ���낻��J���̖��͂��S�z�Ȃ񂾁B�}���K�v������B�����ꏏ�ɍs�����Ă���B";
	end;
OnTimer6000:
	stopnpctimer;
	unittalk "�q�V�G : �G�����Ă���ȁB���f����Ȃ�I";
	end;
}

1@rev.gat,60,184,5	script	�������C�O���h#RZ2	751,{
	mes "[�C�O���h]";
	mes "���_�݂Ă��Ȋ炵�₪���āI";
	close;
}

1@rev.gat,60,184,5	script	�L�h#RZ2	884,{
	mes "[�L�h]";
	mes "�ڂ̑O�̓G�ɏW������B";
	close;
}

1@rev.gat,60,184,5	script	�q�V�G#RZ2	623,{
	mes "[�q�V�G]";
	mes "���̂̂���Ȃ��z���B�C��t���悤�B";
	close;
}

1@rev.gat,64,181,4	script	���_�A���N#RZ�C�x���g_2	3029,{
	end;
OnStart:
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	announce "���_�A���N : �܂���܂����ˁB", 0x9, 0x00ebff;
	sleep 3000;
	if('menu == 1) {
		announce "�C�O���h : �����N�͂ǂ����I", 0x9, 0x00ebff;
		sleep 3000;
	}
	else if('menu == 2) {
		announce "�L�h : �����N�͂ǂ��ɂ���H", 0x9, 0x00ebff;
		sleep 3000;
	}
	else if('menu == 3) {
		announce "�q�V�G : �����N�͂ǂ����H", 0x9, 0x00ebff;
		sleep 3000;
	}
	announce "���_�A���N : ����ȂɃ����N�l�ɉ�����ł����H�@�N�N�N�B", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : �����̓����N�l�������g�̐��_�Ŏx�z����Ă����ԁB", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : �����A���ׂĂ������N�l�̐��E�ł��B", 0x9, 0x00ebff;
	sleep 3000;
	if('menu == 1) {
		announce "�C�O���h : �Ȃ񂾂ƁI", 0x9, 0x00ebff;
		sleep 3000;
	}
	else if('menu == 2) {
		announce "�L�h : �ق��B", 0x9, 0x00ebff;
		sleep 3000;
	}
	else if('menu == 3) {
		announce "�q�V�G : �ӂށB", 0x9, 0x00ebff;
		sleep 3000;
	}
	announce "���_�A���N : ���Ȃ����̎v���ʂ�ɂ͂����Ȃ��ł��傤�B", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : ���������N�l�����҂��ł��B�����N�l������ꏊ�܂ňē����܂��傤�B", 0x9, 0x00ebff;
	sleep 3000;
	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_2");
	sleep 3000;
	hideoffnpc getmdnpcname("#RZ�ړ�_30");
	hideoffnpc getmdnpcname("#RZ�ړ�_31");
	hideoffnpc getmdnpcname("#RZ�ړ�_32");
	end;
}

1@rev.gat,34,126,4	script	���_�A���N#RZ�C�x���g_3	3029,{
	end;
OnStart:
	hideoffnpc getmdnpcname("���_�A���N#RZ�C�x���g_3");
	unittalk "���_�A���N : �c�c����Ȃ��̂ł������Ȃ����̗͂́H";
	sleep 3000;
	unittalk "���_�A���N : ���]���܂�����B�����N�l�̉񕜂ɕK�v�ȃG�l���M�[���Ƃ��Ă͓���͕s���ł��ˁB";
	sleep 3000;
	unittalk "���_�A���N : �������痧������Ȃ���!!�@�������Ȃ����ɋ����͖����B";
	sleep 3000;
	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_3");
	sleep 5000;
	hideoffnpc getmdnpcname("#RZ�ړ�_5a");
	hideoffnpc getmdnpcname("#RZ�ړ�_6a");
	hideoffnpc getmdnpcname("#RZ�ړ�_7a");
	hideoffnpc getmdnpcname("#RZ�ړ�_8a");
	end;
}

1@rev.gat,34,55,4	script	���_�A���N#RZ�C�x���g_5	3029,{
	end;
OnStart:
	hideoffnpc getmdnpcname("���_�A���N#RZ�C�x���g_5");
	unittalk "���_�A���N : �c�c����Ȃ��̂ł������Ȃ����̗͂́H";
	sleep 3000;
	unittalk "���_�A���N : ���]���܂�����B�����N�l�̉񕜂ɕK�v�ȃG�l���M�[���Ƃ��Ă͓���͕s���ł��ˁB";
	sleep 3000;
	unittalk "���_�A���N : �������痧������Ȃ���!!�@�������Ȃ����ɋ����͖����B";
	sleep 3000;
	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_5");
	sleep 5000;
	hideoffnpc getmdnpcname("#RZ�ړ�_13a");
	hideoffnpc getmdnpcname("#RZ�ړ�_14a");
	hideoffnpc getmdnpcname("#RZ�ړ�_15a");
	hideoffnpc getmdnpcname("#RZ�ړ�_16a");
	end;
}

1@rev.gat,112,48,4	script	���_�A���N#RZ�C�x���g_6	3029,{}

1@rev.gat,63,181,0	warp	#RZ�ړ�_30	10,8,1@rev.gat,103,177
1@rev.gat,47,181,0	warp	#RZ�ړ�_31	10,8,1@rev.gat,103,177
1@rev.gat,31,181,0	warp	#RZ�ړ�_32	10,8,1@rev.gat,103,177
1@rev.gat,104,176,0	script	#RZ�C�x���g_3	139,1,1,{
OnTouch:
	pcblockmove 1;
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	hideonnpc getmdnpcname("#RZ�C�x���g_3");
	if('menu==1)
		hideoffnpc getmdnpcname("�������C�O���h#RZ3");
	else if('menu==2)
		hideoffnpc getmdnpcname("�L�h#RZ3");
	else if('menu==3)
		hideoffnpc getmdnpcname("�q�V�G#RZ3");
	hideoffnpc getmdnpcname("�����N??#RZ1");
	unittalk getcharid(3),strcharinfo(0)+ " : �����N!?";
	switch('menu) {
	case 0:	set 'unit_id,getcharid(3); set 'unit_name$,strcharinfo(0); break;
	case 1:	set 'unit_id,getnpcid(0,getmdnpcname("�������C�O���h#RZ3"));	set 'unit_name$,"�C�O���h"; break;
	case 2:	set 'unit_id,getnpcid(0,getmdnpcname("�L�h#RZ3"));			set 'unit_name$,"�L�h"; break;
	case 3:	set 'unit_id,getnpcid(0,getmdnpcname("�q�V�G#RZ3"));		set 'unit_name$,"�q�V�G"; break;
	}
	set '@dummy,sleep2(2500);
	unittalk 'unit_id,'unit_name$+ " : ���������c�c���ꂾ���T�d�ȃ����N������Ȃɂ������茩����Ƃ́B";
	set '@dummy,sleep2(3000);
	unittalk 'unit_id,'unit_name$+ " : �c�c�{���Ƀ����N��!?";
	misceffect 60,""; //self
	pcblockmove 0;
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnStart";
	end;
}

1@rev.gat,102,180,5	script	�������C�O���h#RZ3	751,{
	mes "[�C�O���h]";
	mes "�C��t����I";
	mes "���̃����N������Ȃɂ�������";
	mes "������Ƃ͎v���Ȃ��B";
	close;
}

1@rev.gat,102,180,5	script	�L�h#RZ3	884,{
	mes "[�L�h]";
	mes "�C��t����I";
	mes "���̃����N������Ȃɂ�������";
	mes "������Ƃ͎v���Ȃ��B";
	close;
}

1@rev.gat,102,180,5	script	�q�V�G#RZ3	623,{
	mes "[�q�V�G]";
	mes "�C��t����I";
	mes "���̃����N������Ȃɂ�������";
	mes "������Ƃ͎v���Ȃ��B";
	close;
}

1@rev.gat,111,178,4	script	�����N??#RZ1	1916,{
	end;
OnStart:
	sleep 500;
	unittalk "�����N?? : �ǂ������܂ŗ����ȁA�l�Ԃ�B";
	sleep 3000;
	unittalk "�����N?? : �����A�{���Ɏ���j�~�ł���Ǝv���Ă���̂��H";
	sleep 3000;
	unittalk "�����N?? : �������낤�B�J���ɂ����܂ŗ���������������Ă�낤�B";
	sleep 3000;
	unittalk "�����N?? : ���Ƃ����S�ɗ͂��񕜂��Ă��Ȃ������Ƃ��Ă����̖����Ȃ��B";
	misceffect 169, getmdnpcname("�����N??#RZ1");
	sleep 3000;
	unittalk "�����N?? : ���̋��|��^���Ă��!!";
	misceffect 225, getmdnpcname("�����N??#RZ1");
	sleep 3000;
	initnpctimer;
	hideonnpc getmdnpcname("�����N??#RZ1");
	monster getmdmapname("1@rev.gat"),111,178,"�����N??",2998,1,getmdnpcname("�����N??#RZ1")+ "::OnKilled";
	end;
OnTimer2000:
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("�����N??#RZ1")+ "::OnKilled");
	if('@count <= 0) {
		stopnpctimer;
		donpcevent getmdnpcname("�����N??#RZ1")+ "::OnStart2";
	}
	end;
OnTimer4000:
	initnpctimer;
	end;
OnStart2:
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	hideoffnpc getmdnpcname("�����N??#RZ1");
	unittalk "�����N?? : �ӂށB�񕜂��Ă��Ȃ���Ԃł͂��̒��x�̗͂����o���ʂ��B";
	sleep 3000;
	unittalk "�����N?? : �܂��������낤�B����������������Ƃ��悤�B";
	sleep 3000;
	unittalk "�����N?? : �����l�ԋ��A��ׁB���O��̓����N�l��|�����񂾁B";
	sleep 3000;
	unittalk "�����N?? : �߂��đ��̐l�ԋ��Ə����̊�тł������������Ă�����ǂ����H�@�N�N�N�B";
	hideonnpc getmdnpcname("�����N??#RZ1");
	sleep 3000;
	if('menu==0) {
		announce "�������I�@�ǂ������悤!!", 0x9, 0x00ebff;
		sleep 3000;
	}
	else if('menu==1) {
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#RZ3")),"�C�O���h : �����I�@�҂āI�@�����₪�����ȁI";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#RZ3")),"�C�O���h : �}���Œǂ������邼�B������ɍs�����B";
		sleep 3000;
		hideonnpc getmdnpcname("�������C�O���h#RZ3");
		sleep 3000;
		announce "�C�O���h : ���A���킟���I�@�Ȃ񂾂���́c�c�B", 0x9, 0x00ebff;
		sleep 2000;
	}
	else if('menu==2) {
		unittalk getnpcid(0,getmdnpcname("�L�h#RZ3")),"�L�h : �����A�����₪�������B�������c�c�D�ɗ�����ȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�L�h#RZ3")),"�L�h : �d���Ȃ��A�ǂ������悤�B��ɍs���B";
		sleep 3000;
		hideonnpc getmdnpcname("�L�h#RZ3");
		sleep 3000;
		announce "�L�h : �Ȃ񂾂����!!�@�����c�c�I", 0x9, 0x00ebff;
		sleep 2000;
	}
	else if('menu==3) {
		unittalk getnpcid(0,getmdnpcname("�q�V�G#RZ3")),"�q�V�G : ���������c�c�B�c�c㩂��H";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#RZ3")),"�q�V�G : �ǂ�Ȃ��킯�ɂ������Ȃ����B�悵�A������ɍs�����B";
		sleep 3000;
		hideonnpc getmdnpcname("�q�V�G#RZ3");
		sleep 3000;
		announce "�q�V�G : ���A���킟���I", 0x9, 0x00ebff;
		sleep 2000;
	}
	hideoffnpc getmdnpcname("#RZ�ړ�_1");
	hideoffnpc getmdnpcname("#RZ�ړ�_2");
	hideoffnpc getmdnpcname("#RZ�ړ�_3");
	hideoffnpc getmdnpcname("#RZ�ړ�_4");
	end;
OnKilled:
	end;
}

1@rev.gat,33,120,4	script	�������C�O���h#RZ4	751,{
	mes "[�C�O���h]";
	mes "�������B���������ɂȂ��ȁc�c�B";
	close;
}

1@rev.gat,33,120,4	script	�L�h#RZ4	884,{
	mes "[�L�h]";
	mes "�����B�Ȃ񂾂���́B";
	mes "�S��������B";
	close;
}

1@rev.gat,33,120,4	script	�q�V�G#RZ4	623,{
	mes "[�q�V�G]";
	mes "�������B�͂�����Ȃ��c�c�B";
	close;
}

1@rev.gat,33,120,0	script	#��~�G�t�F�N�gRZ1	139,{
OnStart:
OnTimer10000:
	initnpctimer;
	misceffect 74;
	end;
OnStop:
	stopnpctimer;
	end;
}

/*
1@rev.gat,33,108,0	script	#2�����ڃf�o�t_1	139,{}
1@rev.gat,33,112,0	script	#2�����ڃf�o�t_2	139,{}
1@rev.gat,33,116,0	script	#2�����ڃf�o�t_3	139,{}
1@rev.gat,33,120,0	script	#2�����ڃf�o�t_4	139,{}
1@rev.gat,33,124,0	script	#2�����ڃf�o�t_5	139,{}
1@rev.gat,33,128,0	script	#2�����ڃf�o�t_6	139,{}
1@rev.gat,33,131,0	script	#2�����ڃf�o�t_7	139,{}
*/

1@rev.gat,34,120,0	script	#���G�t�F�N�g�p	139,{}

1@rev.gat,35,119,0	script	#�퓬_1RZ1	139,2,2,{
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	set 'cnt,0;
	hideonnpc getmdnpcname("#�퓬_1RZ1");
	hideonnpc getmdnpcname("#RZ�ړ�_30");
	hideonnpc getmdnpcname("#RZ�ړ�_31");
	hideonnpc getmdnpcname("#RZ�ړ�_32");
	if('menu==0)
		set '@mobname$,strcharinfo(0)+ "�̍�";
	else if('menu==1) {
		set '@mobname$,"�C�O���h�̍�";
		set 'name$,getmdnpcname("�������C�O���h#RZ4");
	}
	else if('menu==2) {
		set '@mobname$,"�L�h�̍�";
		set 'name$,getmdnpcname("�L�h#RZ4");
	}
	else if('menu==3) {
		set '@mobname$,"�q�V�G�̍�";
		set 'name$,getmdnpcname("�q�V�G#RZ4");
	}
	hideoffnpc 'name$;
	monster getmdmapname("1@rev.gat"),34,120,'@mobname$,3007,1,getmdnpcname("#�퓬_1RZ1")+ "::OnKilled1";
	donpcevent getmdnpcname("#�퓬_1RZ1_timer")+ "::OnStart";
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	initnpctimer;
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_1RZ1")+ "::OnKilled2");
	if('@count == 0) {
		switch('cnt) {
		case 1: setnpctimer 19900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 2: setnpctimer 34900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 3: setnpctimer 49900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 4: setnpctimer 64900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 5: setnpctimer 79900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 6: setnpctimer 94900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 7: setnpctimer 109900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 8: setnpctimer 134900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		case 9: setnpctimer 159900,getmdnpcname("#�퓬_1RZ1_timer"); break;
		}
	}
	end;
OnSpawn:
	set 'cnt,'cnt+1;
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#�퓬_1RZ1")+ "::OnKilled2";
	monster '@map$,33,128,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,42,120,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,34,111,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,25,119,"�����X�E�O�[��",3001,1,'@label$;
	if('cnt == 9)
		monster '@map$,33,111,"�����X�E�A�[�`���[",3003,1,'@label$;
	if('cnt == 10)
		monster '@map$,32,128,"�����X�E�A�[�`���[",3003,1,'@label$;
	misceffect 124, 'name$;
	misceffect 220, 'name$;
	misceffect 368, 'name$;
	misceffect 9, getmdnpcname("#���G�t�F�N�g�p");
	end;
OnKilled1:
OnKilled2:
	end;
}

1@rev.gat,35,119,0	script	#�퓬_1RZ1_timer	139,{
OnStart:
	//hideonnpc getmdnpcname("#�퓬_1RZ1");		//���̂�2��hide
	donpcevent getmdnpcname("#RZ_EFFECT01")+ "::OnStart";
	announce "���_�A���N : �N�N�N�B�܂�܂ƈ���������Ƃ͋����Ȑl�����ł��ˁB�ǂ��ł����������̂ƕ��������C���́B", 0x9, 0x00ebff;
	sleep 2000;
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	if('menu >= 1)
		donpcevent getmdnpcname("#��~�G�t�F�N�gRZ1")+ "::OnStart";
	sleep 3000;
	announce "���_�A���N : ��قǂ̃����N�l�͎������o�������e�ł��B�{���̃����N�l�͌��݋x�����Ƃ��Ă��܂��B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �������c�c�����܂ł��ă����N�l�ɉ�����Ƃ́B�l�Ԃł��邠�Ȃ����������N�l�܂ł��ǂ蒅����Ƃ͎v���܂��񂪁c�c�B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �����ł��傤�B���Ȃ����������N�l�ɉ���i�����邩�ǂ����A���������č����グ�܂��B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : ���܂莄�����]�����Ȃ��ł���������H�@�͕s���Ɣ��f�����炱�����痧�������Ă��������܂��̂Łc�c�B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �����̍Ő[���ɂ��ǂ���Ȃ��悤�Ȏ҂ȂǁA�����N�l�ɉ���i�͂���܂���B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �����A���Ȃ����̗́A�����Ă��������܂��傤�I�@�N�N�N!!", 0x9, 0x00ebff;
	initnpctimer;
	end;
OnTimer4000:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnStart";
	end;
OnTimer20000:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer35000:
	announce "���_�A���N : ���̕����B��I�@�����Ƌ��|�Ƌ�ɂ�^����̂ł��I", 0x9, 0x00ebff;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer50000:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer65000:
	announce "���_�A���N : �܂�����Ȃ��c�c�I�@�����Ƌ��|���I�@��ɂ��I�@����킹��̂ł�!!", 0x9, 0x00ebff;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer80000:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer95000:
	announce "���_�A���N : �N�N�N�c�c�B�����ł���B�����ƒ�R���Ȃ����I", 0x9, 0x00ebff;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer110000:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer135000:
	announce "���_�A���N : ���̌����񂾒ʂ�A�͂���҂̂悤�ł��ˁB�N�N�N�c�c�ʔ����I", 0x9, 0x00ebff;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer160000:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	stopnpctimer getmdnpcname("#�퓬_1RZ1");
	end;
OnTimer175000:
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_1RZ1")+ "::OnKilled2");
	if('@count >= 20) {
		//fail
		stopnpctimer;
		donpcevent getmdnpcname("#RZ_EFFECT01")+ "::OnStop";
		donpcevent getmdnpcname("#��~�G�t�F�N�gRZ1")+ "::OnStop";
		donpcevent getmdnpcname("���_�A���N#RZ�C�x���g_3")+ "::OnStart";
	}
	else
		announce "���_�A���N : �N�N�N�c�c�Ȃ��Ȃ����ԂƂ��ł��ˁI", 0x9, 0x00ebff;
	end;
OnTimer177000:
	announce "���_�A���N : �����c�c���܂ő����܂����ˁB�N�N�N�I", 0x9, 0x00ebff;
	end;
OnTimer183000:
	stopnpctimer;
	donpcevent getmdnpcname("#RZ_EFFECT01")+ "::OnStop";
	donpcevent getmdnpcname("#��~�G�t�F�N�gRZ1")+ "::OnStop";
	hideonnpc getmdnpcname("#2�����ڃf�o�t_1");
	hideonnpc getmdnpcname("#2�����ڃf�o�t_2");
	hideonnpc getmdnpcname("#2�����ڃf�o�t_3");
	hideonnpc getmdnpcname("#2�����ڃf�o�t_4");
	hideonnpc getmdnpcname("#2�����ڃf�o�t_5");
	hideonnpc getmdnpcname("#2�����ڃf�o�t_6");
	hideonnpc getmdnpcname("#2�����ڃf�o�t_7");
	hideoffnpc getmdnpcname("#RZ�ړ�_5");
	hideoffnpc getmdnpcname("#RZ�ړ�_6");
	hideoffnpc getmdnpcname("#RZ�ړ�_7");
	hideoffnpc getmdnpcname("#RZ�ړ�_8");
	end;
}

1@rev.gat,34,47,0	script	#�퓬_2RZ1	139,10,10,{
	set 'cnt,0;
	hideonnpc getmdnpcname("#�퓬_2RZ1");
	donpcevent getmdnpcname("#�퓬_2RZ1_timer")+ "::OnStart";
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	initnpctimer;
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_2RZ1")+ "::OnKilled");
	if('@count == 0) {
		switch('cnt) {
		case 1: setnpctimer 29900,getmdnpcname("#�퓬_2RZ1_timer"); break;
		case 2: setnpctimer 54900,getmdnpcname("#�퓬_2RZ1_timer"); break;
		case 3: setnpctimer 79900,getmdnpcname("#�퓬_2RZ1_timer"); break;
		case 4: setnpctimer 104900,getmdnpcname("#�퓬_2RZ1_timer"); break;
		case 5: setnpctimer 129900,getmdnpcname("#�퓬_2RZ1_timer"); break;
		case 6: setnpctimer 154900,getmdnpcname("#�퓬_2RZ1_timer"); break;
		case 7: setnpctimer 169900,getmdnpcname("#�퓬_2RZ1_timer"); break;
		}
	}
	end;
OnSpawn:
	set 'cnt,'cnt+1;
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#�퓬_2RZ1")+ "::OnKilled";
	monster '@map$,34,57,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,43,48,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,33,38,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,24,48,"�����X�E�O�[��",3001,1,'@label$;
	if('cnt == 1 || 'cnt == 7) {
		monster '@map$,27,53,"�����X�E�A�[�`���[",3003,1,'@label$;
		monster '@map$,27,41,"�����X�E�A�[�`���[",3003,1,'@label$;
	}
	else {
		monster '@map$,40,41,"�����X�E�A�[�`���[",3003,1,'@label$;
		monster '@map$,40,54,"�����X�E�A�[�`���[",3003,1,'@label$;
	}
	if('cnt >= 3 && 'cnt < 7)
		monster '@map$,27,53,"�����X�E�x���b�g",3005,1,'@label$;
	if('cnt == 7) {
		monster '@map$,40,41,"�����X�E�x���b�g",3005,1,'@label$;
		monster '@map$,40,54,"�����X�E�x���b�g",3005,1,'@label$;
	}
	if('cnt == 8) {
		monster '@map$,27,53,"�����X�E�x���b�g",3005,1,'@label$;
		monster '@map$,27,41,"�����X�E�x���b�g",3005,1,'@label$;
	}
	end;
OnKilled:
	end;
}

1@rev.gat,34,47,0	script	#�퓬_2RZ1_timer	139,{
OnStart:
	donpcevent getmdnpcname("#RZ_EFFECT02")+ "::OnStart";
	announce "���_�A���N : ���̕�����|���ĉ�����ꂽ�Ǝv���Ă���悤�ł����A���̋�Ԃ̓����N�l�̈ӎv�ɂ��i�����Ă��܂��B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �����̎��͂ł͔����o���܂����H�@�N�N�N�B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �������c�c�������B��͂肠�Ȃ����̍��̓����N�l�̉񕜂ɖ𗧂������ł��ˁB", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : ���̍��Ƌ�ɂ��тɂ��č����グ�܂��傤�B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : ���Ȃ����̍��̓����N�l�̌��ƂȂ���ƂȂ�̂ł��B����͌��h�Ȏ��ł���I�@�N�N�N!!", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �����A�s���Ȃ������̕����B��!!�@���̎҂����̓��̂ƍ��������􂫁A�����N�l�ɕ�����̂ł��I", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �������A��قǂƓ��l�A�͕s���Ɣ��f�����炱�����痧�������Ă��������܂����ˁc�c�B", 0x9, 0x00ebff;
	sleep 5000;
	announce "���_�A���N : �N�N�N�c�c���������ɂ��̗͂𔭊����Ă��������I�@�����N�l�̂��߂�!!", 0x9, 0x00ebff;
	initnpctimer;
	end;
OnTimer4000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnStart";
	end;
OnTimer30000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	announce "���_�A���N : ���̐S�n�悢���o�B�c�c�f���炵��!!", 0x9, 0x00ebff;
	end;
OnTimer55000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	announce "���_�A���N : �����N�l�ɍv���o���鎖�A���h�Ɏv���Ȃ����I", 0x9, 0x00ebff;
	end;
OnTimer80000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	announce "���_�A���N : �����Ƃł��I�����Ɨ͂�!!", 0x9, 0x00ebff;
	end;
OnTimer105000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	announce "���_�A���N : �����ł���B�N�b�N�B�����Ƒ��~���Ȃ����c�c�I", 0x9, 0x00ebff;
	end;
OnTimer130000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	end;
OnTimer155000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	announce "���_�A���N : ���ւ̋��|���Y�������N�l�̗͂ɂȂ�̂ł��I", 0x9, 0x00ebff;
	end;
OnTimer170000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	stopnpctimer getmdnpcname("#�퓬_2RZ1");
	end;
OnTimer180000:
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_2RZ1")+ "::OnKilled");
	if('@count >= 20) {
		//fail
		stopnpctimer;
		donpcevent getmdnpcname("#RZ_EFFECT02")+ "::OnStop";
		donpcevent getmdnpcname("���_�A���N#RZ�C�x���g_5")+ "::OnStart";
	}
	else
		announce "���_�A���N : �قق��c�c�����܂őς��܂����I�@�������A���̐��ւ̎����A�����Ď��ւ̋��|�ŃG�l���M�[�͏[���~�����܂����I", 0x9, 0x00ebff;
	end;

OnTimer187000:
	announce "���_�A���N : �����N�l������тɂȂ�I�@�f���炵���c�c�I", 0x9, 0x00ebff;
	end;
OnTimer190000:
	stopnpctimer;
	donpcevent getmdnpcname("#RZ_EFFECT02")+ "::OnStop";
	hideoffnpc getmdnpcname("#RZ�ړ�_13");
	hideoffnpc getmdnpcname("#RZ�ړ�_14");
	hideoffnpc getmdnpcname("#RZ�ړ�_15");
	hideoffnpc getmdnpcname("#RZ�ړ�_16");
	end;
}

1@rev.gat,112,48,4	script	�����X�E�����m#RZ1	10029,{
	end;
OnStart:
	sleep 3000;
	hideoffnpc getmdnpcname("���_�A���N#RZ�C�x���g_6");
	unittalk getnpcid(0,getmdnpcname("���_�A���N#RZ�C�x���g_6")),"���_�A���N : ����͂���́c�c�B�����߂��Ă���O�ɓ|���Ă��܂��Ƃ́B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#RZ�C�x���g_6")),"���_�A���N : �܂������ł��傤�B���Ȃ����̃G�l���M�[�̓����N�l�ɂ�����Ƃ��n�����܂����B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#RZ�C�x���g_6")),"���_�A���N : �������������N�l�����S�ɉ񕜂���܂��I�@�����Ȃ�΂��Ȃ����̖��������܂łł��I";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#RZ�C�x���g_6")),"���_�A���N : �܂�������܂��傤�B���̎����Ȃ����͎��̂ł��傤���ǂˁB�N�N�N�N�N�B";
	sleep 3000;
	hideonnpc getmdnpcname("���_�A���N#RZ�C�x���g_6");
	hideoffnpc getmdnpcname("#RZ�ړ�_17a");
	misceffect 30,getmdnpcname("�����X�E�����m#RZ1");
	sleep 1000;
	misceffect 90,getmdnpcname("�����X�E�����m#RZ1");
	end;
}

1@rev.gat,104,47,0	script	#�퓬_3RZ1	139,5,5,{
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	hideonnpc getmdnpcname("#�퓬_3RZ1");
	if('menu==0)
		set '@mobname$,strcharinfo(0)+ "�̍�";
	else if('menu==1)
		set '@mobname$,"�C�O���h�̍�";
	else if('menu==2)
		set '@mobname$,"�L�h�̍�";
	else if('menu==3)
		set '@mobname$,"�q�V�G�̍�";
	hideoffnpc 'name$;
	monster getmdmapname("1@rev.gat"),112,48,'@mobname$,3007,1,getmdnpcname("#�퓬_3RZ1")+ "::OnKilled1";
	announce "���_�A���N : ������܂�����F����B�������Ń����N�l�̉񕜂ɏ[���ȃG�l���M�[�����܂�܂����B", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : ���̓����N�l�ɂ��̃G�l���M�[�����サ�ė���Ƃ��܂��傤�B", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : ���āc�c��͕Еt�����K�v�ł��ˁc�c�ӂށB�������Ƃ��v�����܂�����B", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : ���̗]�����G�l���M�[�Ɏ��̗͂ł��Ă߂�Ƃ��܂��傤�B", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : �F����A�G�l���M�[�������ł����߂�������ΑS�͂Ő키���ł��B�N�N�N�B", 0x9, 0x00ebff;
	sleep 3000;
	announce "���_�A���N : ���������オ�ꖂ���m��I�@���̎ҒB�ɖ{���̋��|�������Ă��Ȃ����I", 0x9, 0x00ebff;
	sleep 3000;
	hideoffnpc getmdnpcname("�����X�E�����m#RZ1");
	killmonster getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ1")+ "::OnKilled1";
	sleep 3000;
	misceffect 130,getmdnpcname("�����X�E�����m#RZ1");
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : ������܂����A�A���N�l!!";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �L�L�L�c�c���O��̍��ɏh��G�l���M�[�̓����N�l�̉񕜂ɗ��p�����̂��I";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �������A���N�l�́A�]�����G�l���M�[�ł������Ď��܂Ő��ݏo���Ă����������I�@�L�L�L�I";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �����Ȗ`���҂�A�������O��ɗp�͂Ȃ��I�@�������̗͂ő��苎���Ă�낤!!";
	misceffect 54,getmdnpcname("�����X�E�����m#RZ1");
	sleep 3000;
	hideonnpc getmdnpcname("�����X�E�����m#RZ1");
	monster getmdmapname("1@rev.gat"),112,48,"�����X�E�����m",2999,1,getmdnpcname("#�퓬_3RZ1")+ "::OnKilled2";
	initnpctimer;
	end;
OnKilled1:
OnKilled2:
	end;
OnTimer2000:
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ1")+ "::OnKilled2");
	if('@count <= 0) {
		stopnpctimer;
		donpcevent getmdnpcname("#�퓬_3RZ2")+ "::OnStart";
	}
	end;
OnTimer4000:
	initnpctimer;
	end;
}

1@rev.gat,108,51,5	script	�������C�O���h#RZ5	751,{
	mes "[�C�O���h]";
	mes "�͂��c�c�͂��c�c";
	mes "�����N���c�c�����N�͂ǂ����c�c�B";
	close;
}

1@rev.gat,108,51,5	script	�L�h#RZ5	884,{
	mes "[�L�h]";
	mes "�����N���c�c";
	mes "�������c�c";
	mes "�����[���B";
	close;
}

1@rev.gat,108,51,5	script	�q�V�G#RZ5	623,{
	mes "[�q�V�G]";
	mes "�ӂ��c�c�����c�c";
	mes "�����[���ȁc�c�B";
	close;
}

1@rev.gat,106,60,0	script	#�퓬_3RZ2	139,{
OnStart:
	hideoffnpc getmdnpcname("�����X�E�����m#RZ1");
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �L�L�B������Ƃ͂ł���悤���ȁB����ł��������N�l�̐��тɂӂ��킵���B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : ���������낻��I��肾�I�@�c�c���̖{���̗͂��݂��Ă�낤�I";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : ���O��̖��́A���̎��̎蒆�ɂ���Ƃ������Ƃ��v���m�邪����!!";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �L�L�L�I";
	sleep 3000;
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	if('menu >= 1) {
		announce "�҂�!!!", 0x9, 0x00ebff;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �Ȃɂ�!?";
		if('menu==1) {
			hideoffnpc getmdnpcname("�������C�O���h#RZ5");
			unittalk getnpcid(0,getmdnpcname("�������C�O���h#RZ5")),"�C�O���h : �����N�͂ǂ�����!!!";
		}
		else if('menu==2) {
			hideoffnpc getmdnpcname("�L�h#RZ5");
			unittalk getnpcid(0,getmdnpcname("�L�h#RZ5")),"�L�h : �����N�b!!�@�����N�͂ǂ����b�I";
		}
		else if('menu==3) {
			hideoffnpc getmdnpcname("�q�V�G#RZ5");
			unittalk getnpcid(0,getmdnpcname("�q�V�G#RZ5")),"�q�V�G : �����N�͂ǂ������I";
		}
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �ق��A�܂������Ă����̂��B���ԂƂ��ȁB�L�L�L�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : ���S����B�����N�l�͂��O��̂������ŏ����ɉ񕜂��Ă����B�L�L�L�L�L�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : ��͂�����莄�����肵�Ă�邩����S���Ď��ʂ��悢�I";
		sleep 3000;
		if('menu==1) {
			unittalk getnpcid(0,getmdnpcname("�������C�O���h#RZ5")),"�C�O���h : �ӂ����₪����!!�@�������������I";
			misceffect 12,getmdnpcname("�������C�O���h#RZ5");
			sleep 1500;
			misceffect 245,getmdnpcname("�����X�E�����m#RZ1");
			sleep 1500;
			unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �����I�@���͂��I";
		}
		else if('menu==2) {
			unittalk getnpcid(0,getmdnpcname("�L�h#RZ5")),"�L�h : �����I�@�����܂ł��c�c�B��������������!!";
			misceffect 12,getmdnpcname("�L�h#RZ5");
			sleep 1500;
			misceffect 129,getmdnpcname("�����X�E�����m#RZ1");
			sleep 1500;
			unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : ���͂����I";
		}
		else if('menu==3) {
			unittalk getnpcid(0,getmdnpcname("�q�V�G#RZ5")),"�q�V�G : �����c�c�B���߂āc�c!!�@����������!!";
			misceffect 12,getmdnpcname("�q�V�G#RZ5");
			sleep 1500;
			misceffect 30,getmdnpcname("�����X�E�����m#RZ1");
			sleep 1500;
			unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �����͂����I";
		}
		sleep 1500;
		announce "�]�G��Hp�����������]", 0x9, 0x00ebff;
		sleep 3000;
		if('menu==1) {
			unittalk getnpcid(0,getmdnpcname("�������C�O���h#RZ5")),"�C�O���h : �������c�c�I�@��́c�c���ށI";
			hideonnpc getmdnpcname("�������C�O���h#RZ5");
		}
		else if('menu==2) {
			unittalk getnpcid(0,getmdnpcname("�L�h#RZ5")),"�L�h : ���͂��I�@��͗��ނ�!!";
			hideonnpc getmdnpcname("�L�h#RZ5");
		}
		else if('menu==3) {
			unittalk getnpcid(0,getmdnpcname("�q�V�G#RZ5")),"�q�V�G : ��́c�c���ށc�c�I";
			hideonnpc getmdnpcname("�q�V�G#RZ5");
		}
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : �L�L�L�c�c�I�@�͐s���ċC�����������B�����ȓz�߁B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�����m : ���O����n��������A������������肢���Ԃ��Ďn�����Ă�낤�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�l�N���}���T�[ : �܂��͂��O�炩�炾�c�c�B�����A���̐^�̎p�����ċ�����I";
	}
	else {
		unittalk getnpcid(0,getmdnpcname("�����X�E�����m#RZ1")),"�����X�E�l�N���}���T�[ : �����A���̐^�̎p�����ċ�����I";
	}
	hideonnpc getmdnpcname("�����X�E�����m#RZ1");
	set 'mob_id,callmonster(getmdmapname("1@rev.gat"),112,48,"�����X�E�l�N���}���T�[",3000,getmdnpcname("#�퓬_3RZ2")+ "::OnKilled");
	if('menu >= 1) {
		set '@mobhp,getmobhp('mob_id);
		set '@mobhp,'@mobhp - ('@mobhp * 20 / 100);
		setmobhp 'mob_id,'@mobhp;
	}
	donpcevent getmdnpcname("#�퓬_3RZ3")+ "::OnStart";
	initnpctimer;
	set 'cnt,0;
	end;
OnTimer1000:
	set 'cnt,'cnt+1;
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ2")+ "::OnKilled");
	if('@count <= 0) {
		stopnpctimer;
		set getvariableofnpc('users,getmdnpcname("#RZ�ړ�_17a")),getmapusers(getmdmapname("1@rev.gat"));
		donpcevent getmdnpcname("#�퓬_3RZ3")+ "::OnStop";
		donpcevent getmdnpcname("�����X�E�����m#RZ1")+ "::OnStart";
		donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStop";
		donpcevent getmdnpcname("#�퓬_3RZ5")+ "::OnStop";
		donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStop";
		donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStop";
		end;
	}
	else if('cnt == 150) {
		set getvariableofnpc('flag, getmdnpcname("#�퓬_3RZ3")),1;
		set 'cnt,0;
	}
	initnpctimer;
	end;
OnKilled:
	end;
}

1@rev.gat,120,60,0	script	#�퓬_3RZ3	139,{
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer7000:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#�퓬_3RZ3")+ "::OnKilled";
	donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStop";
	donpcevent getmdnpcname("#�퓬_3RZ5")+ "::OnStop";
	donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStop";
	donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStop";
	set '@mob_id,getvariableofnpc('mob_id, getmdnpcname("#�퓬_3RZ2"));
	set '@count,getmapmobs('@map$,'@label$);
	if('flag) {
		unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����A�i���̖���ɂ�������!!";
	}
	else if('@count < 10) {
		set '@r,rand(1,100);
		if(('@r < 11) && ('@r > 0)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���O��͂����ŋ�����̂��I";
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
		}
		else if(('@r < 21) && ('@r > 10)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �ǂ�Ȃɖ]��ł������ȂǂȂ����I";
			monster '@map$,112,57,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ5")+ "::OnStart";
		}
		else if(('@r < 31) && ('@r > 20)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���O��͂����ŋ�����̂��I";
			monster '@map$,112,57,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStart";
		}
		else if(('@r < 41) && ('@r > 30)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����ă����N�l�̖]�񂾐��E�̗ƂƂȂ�I";
			monster '@map$,112,57,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
		}
		else if(('@r < 51) && ('@r > 40)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����ă����N�l�̖]�񂾐��E�̗ƂƂȂ�I";
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
		}
		else if(('@r < 61) && ('@r > 50)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���O��͂����ŋ�����̂��I";
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,104,40,"�����X�E�x���b�g",3005,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
		}
		else if(('@r < 71) && ('@r > 60)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �ǂ�Ȃɖ]��ł������ȂǂȂ����I";
			monster '@map$,112,57,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,104,40,"�����X�E�x���b�g",3005,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ5")+ "::OnStart";
		}
		else if(('@r < 81) && ('@r > 70)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����ꂵ�߁I�@���~���I";
			monster '@map$,112,57,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,119,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,104,40,"�����X�E�x���b�g",3005,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStart";
		}
		else if(('@r < 91) && ('@r > 80)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����ꂵ�߁I�@���~���I";
			monster '@map$,112,57,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
		}
		else if(('@r < 101) && ('@r > 90)) {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���O��͂����ŋ�����̂��I";
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
		}
		else {
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����ꂵ�߁I�@���~���I";
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
		}
	}
	else if('@count < 15) {
		set '@r,rand(1,60);
		if(('@r < 11) && ('@r > 0)) {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
			donpcevent getmdnpcname("#�퓬_3RZ5")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����N�l�̌����ƂȂ�邱�Ƃ����h�Ɏv���I";
		}
		else if(('@r < 21) && ('@r > 10)) {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,119,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
			donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���̓����N�l�̒����Ȃ����ׁI";
		}
		else if(('@r < 31) && ('@r > 20)) {
			monster '@map$,112,38,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ4")+ "::OnStart";
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����N�l�̂��߁A���̎ҒB�ɉi���̖�����I";
		}
		else if(('@r < 41) && ('@r > 30)) {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ5")+ "::OnStart";
			donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���̗͂ɋ��|���邪�����I";
		}
		else if(('@r < 51) && ('@r > 40)) {
			monster '@map$,112,57,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,119,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ5")+ "::OnStart";
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���̗͂ɋ��|���邪�����I";
		}
		else if(('@r < 61) && ('@r > 50)) {
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStart";
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����N�l�̂��߁A���̎ҒB�ɉi���̖�����I";
		}
		else {
			monster '@map$,121,47,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,119,40,"�����X�E�x���b�g",3005,1,'@label$;
			monster '@map$,104,40,"�����X�E�A�[�`���[",3003,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStart";
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���̗͂ɋ��|���邪�����I";
		}
	}
	else if('@count < 20) {
		set '@r,rand(1,40);
		if(('@r < 11) && ('@r > 0)) {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,120,54,"�����X�E���[�h",3006,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ6")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �������琶���ċA�鎖�͂ł��Ȃ��I";
		}
		else if(('@r < 21) && ('@r > 10)) {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,119,40,"�����X�E���[�h",3006,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �������琶���ċA�鎖�͂ł��Ȃ��I";
		}
		else if(('@r < 31) && ('@r > 20)) {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,104,40,"�����X�E���[�h",3006,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			//cmdothernpc g_event_9 "talk_19"
		}
		else if(('@r < 41) && ('@r > 30)) {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,104,54,"�����X�E���[�h",3006,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���O��̗͂Ȃ��A���̑O�ł͖��Ӗ��������Ƃ������Ƃ��v���m�������I";
		}
		else {
			monster '@map$,102,48,"�����X�E�O�[��",3001,1,'@label$;
			monster '@map$,104,40,"�����X�E���[�h",3006,1,'@label$;
			donpcevent getmdnpcname("#�퓬_3RZ7")+ "::OnStart";
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���O��̗͂Ȃ��A���̑O�ł͖��Ӗ��������Ƃ������Ƃ��v���m�������I";
		}
	}
	else if('@count < 40) {
		set '@r,rand(1,100);
		if(('@r < 11) && ('@r > 0)) {
			monster '@map$,120,54,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			//cmdothernpc g_event_9 "talk_21"
		}
		else if(('@r < 21) && ('@r > 10)) {
			monster '@map$,120,54,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����܂őς������͖J�߂Ă�邼�I";
		}
		else if(('@r < 31) && ('@r > 20)) {
			monster '@map$,120,54,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,119,40,"�����X�E���C�X",3004,1,'@label$;
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���ɂ����΍R�ł��Ȃ��҂��A�����N�l�ɐn���ނ���Ƃ͏Ύ~�I";
		}
		else if(('@r < 41) && ('@r > 30)) {
			monster '@map$,119,40,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �������������O����I��肾�B�y�ɂ��Ă�낤�I";
		}
		else if(('@r < 61) && ('@r > 50)) {
			monster '@map$,119,40,"�����X�E���[�h",3006,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,104,54,"�����X�E���C�X",3004,1,'@label$;
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : ���ɂ����΍R�ł��Ȃ��҂��A�����N�l�ɐn���ނ���Ƃ͏Ύ~�I";
		}
		else {
			monster '@map$,119,40,"�����X�E���[�h",3006,1,'@label$;
			monster '@map$,104,40,"�����X�E���C�X",3004,1,'@label$;
			monster '@map$,104,54,"�����X�E���C�X",3004,1,'@label$;
			unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����܂őς������͖J�߂Ă�邼�I";
		}
	}
	else {
		unittalk '@mob_id,"�����X�E�l�N���}���T�[ : �����A�i���̖���ɂ�������!!";
	}
	end;
OnTimer25000:
	initnpctimer;
	end;
OnKilled:
	end;
OnStop:
	stopnpctimer;
	killmonster getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ3")+ "::OnKilled";
	end;
}

1@rev.gat,120,61,0	script	#�퓬_3RZ4	139,{
OnStart:
	set 'mob,callmonster(getmdmapname("1@rev.gat"),112,57,"�����X�E�I�V���X#1",3002,getmdnpcname("#�퓬_3RZ4")+ "::OnKilled");
	initnpctimer;
	end;
OnTimer4500:
	if(getmobhp('mob) > 0) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		monster getmdmapname("1@rev.gat"),'@x,'@y,"�����X�E�v�����N�g��#1",3008,1,getmdnpcname("#�퓬_3RZ4")+ "::OnKilled";
	}
	initnpctimer;
	end;
OnKilled:
	end;
OnStop:
	stopnpctimer;
	killmonster getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ4")+ "::OnKilled";
	end;
}

1@rev.gat,120,62,0	script	#�퓬_3RZ5	139,{
OnStart:
	set 'mob,callmonster(getmdmapname("1@rev.gat"),121,47,"�����X�E�I�V���X#2",3002,getmdnpcname("#�퓬_3RZ5")+ "::OnKilled");
	initnpctimer;
	end;
OnTimer4500:
	if(getmobhp('mob) > 0) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		monster getmdmapname("1@rev.gat"),'@x,'@y,"�����X�E�v�����N�g��#2",3008,1,getmdnpcname("#�퓬_3RZ5")+ "::OnKilled";
	}
	initnpctimer;
	end;
OnKilled:
	end;
OnStop:
	stopnpctimer;
	killmonster getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ5")+ "::OnKilled";
	end;
}

1@rev.gat,120,63,0	script	#�퓬_3RZ6	139,{
OnStart:
	set 'mob,callmonster(getmdmapname("1@rev.gat"),112,38,"�����X�E�I�V���X#3",3002,getmdnpcname("#�퓬_3RZ6")+ "::OnKilled");
	initnpctimer;
	end;
OnTimer4500:
	if(getmobhp('mob) > 0) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		monster getmdmapname("1@rev.gat"),'@x,'@y,"�����X�E�v�����N�g��#3",3008,1,getmdnpcname("#�퓬_3RZ6")+ "::OnKilled";
	}
	initnpctimer;
	end;
OnKilled:
	end;
OnStop:
	stopnpctimer;
	killmonster getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ6")+ "::OnKilled";
	end;
}

1@rev.gat,120,58,0	script	#�퓬_3RZ7	139,{
OnStart:
	set 'mob,callmonster(getmdmapname("1@rev.gat"),102,48,"�����X�E�I�V���X#4",3002,getmdnpcname("#�퓬_3RZ7")+ "::OnKilled");
	initnpctimer;
	end;
OnTimer4500:
	if(getmobhp('mob) > 0) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		monster getmdmapname("1@rev.gat"),'@x,'@y,"�����X�E�v�����N�g��#4",3008,1,getmdnpcname("#�퓬_3RZ7")+ "::OnKilled";
	}
	initnpctimer;
	end;
OnKilled:
	end;
OnStop:
	stopnpctimer;
	killmonster getmdmapname("1@rev.gat"),getmdnpcname("#�퓬_3RZ7")+ "::OnKilled";
	end;
}

1@rev.gat,106,183,0	warp	#RZ�ړ�_1	10,10,1@rev.gat,33,117
1@rev.gat,106,172,0	warp	#RZ�ړ�_2	10,10,1@rev.gat,33,117
1@rev.gat,117,172,0	warp	#RZ�ړ�_3	10,10,1@rev.gat,33,117
1@rev.gat,117,183,0	warp	#RZ�ړ�_4	10,10,1@rev.gat,33,117
1@rev.gat,28,125,0	warp	#RZ�ړ�_5	10,10,1@rev.gat,31,50
1@rev.gat,28,114,0	warp	#RZ�ړ�_6	10,10,1@rev.gat,31,50
1@rev.gat,39,114,0	warp	#RZ�ړ�_7	10,10,1@rev.gat,31,50
1@rev.gat,39,125,0	warp	#RZ�ړ�_8	10,10,1@rev.gat,31,50
1@rev.gat,28,125,0	warp	#RZ�ړ�_5a	10,10,moro_cav.gat,59,63
1@rev.gat,28,114,0	warp	#RZ�ړ�_6a	10,10,moro_cav.gat,59,63
1@rev.gat,39,114,0	warp	#RZ�ړ�_7a	10,10,moro_cav.gat,59,63
1@rev.gat,39,125,0	warp	#RZ�ړ�_8a	10,10,moro_cav.gat,59,63

1@rev.gat,28,53,0	warp	#RZ�ړ�_13a	10,10,moro_cav.gat,59,63
1@rev.gat,28,42,0	warp	#RZ�ړ�_14a	10,10,moro_cav.gat,59,63
1@rev.gat,39,42,0	warp	#RZ�ړ�_15a	10,10,moro_cav.gat,59,63
1@rev.gat,39,53,0	warp	#RZ�ړ�_16a	10,10,moro_cav.gat,59,63
1@rev.gat,28,53,0	warp	#RZ�ړ�_13	10,10,1@rev.gat,104,48
1@rev.gat,28,42,0	warp	#RZ�ړ�_14	10,10,1@rev.gat,104,48
1@rev.gat,39,42,0	warp	#RZ�ړ�_15	10,10,1@rev.gat,104,48
1@rev.gat,39,53,0	warp	#RZ�ړ�_16	10,10,1@rev.gat,104,48

1@rev.gat,112,56,3	script	#RZ�ړ�_17a	723,{
	mes "�]^ff0000��������ޏo���鎖��";
	mes "�@��V���󂯎�鎖���o���܂��B^000000";
	mes "�@�O�ɏo�܂����H�]";
	next;
	if(select("������","�͂�") == 1) {
		mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
		close;
	}
	mes "�]���Ȃ��͊O�ɏo���]";
	close2;
	if(checkitemblank() == 0) {
		mes "�]�A�C�e���̎�ސ���������";
		mes "�@�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���󂯎�낤�]";
		close;
	}
	if(checkquest(9318) & 0x4) {
		compquest 9318;
		if(BaseLevel < 160) {
			set '@base,9500000 + 500000 * 'users;
			if('users >= 12) set '@base,'@base + 500000;
		}
		else {
			set '@base,28000000 + 2000000 * 'users;
			if('users >= 12) set '@base,'@base + 2000000;
		}
		set '@job,3800000 + 200000 * 'users;
		if('users >= 12) set '@job,'@job + 200000;
		while('@base > 0) {
			if('@base >= 10000000) {
				getexp 10000000,0,1;
				set '@base,'@base - 10000000;
			}
			else {
				getexp '@base,0,1;
				set '@base,0;
			}
		}
		getexp 0,'@job,0;
	}
	if(checkquest(116514)==0) {
		setquest 116514;
		compquest 116514;
	}
	if(checkquest(9318) & 0x8)
		getitem 6684,1;
	if(checkquest(201725)==0)
		setquest 201725;
	if(MORS_1QUE==0)
		set MORS_1QUE,'users;
	warp "moro_cav.gat",59,63;
	end;
}
