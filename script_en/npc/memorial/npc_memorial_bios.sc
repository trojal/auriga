//= Auriga Script ==============================================================
// Ragnarok Online Bios Island Script	by refis
//==============================================================================

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
moro_cav.gat,45,60,5	script	��������	419,{
	if(!(checkquest(15006) & 0x8)) {	// �����b
		mes "[��������]";
		mes "�����̓����N������h���A���R��";
		mes "�őO���ł��B";
		mes "���͒������ɂ�蔭�����ꂽ";
		mes "^ff0000���F����^000000�̒������s���Ă��܂��B";
		next;
		mes "[��������]";
		mes "�������A���F����̓����ɂ�";
		mes "���͂ȃ����X�^�[���������Ă���";
		mes "���������r��Ȕ�Q��";
		mes "�󂯂Ă��܂��܂����c�c�B";
		next;
		mes "[��������]";
		mes "�����͑��s���Ȃ���΂Ȃ�܂���";
		mes "����l�̗͂ł͒������s�Ȃ��܂���B";
		next;
		mes "[��������]";
		mes "�����ŁA�r�̗��ł��낤";
		mes "�`���҂̕��X�ɂ���`����";
		mes "���肢���Ă���̂ł��B";
		next;
		mes "[��������]";
		mes "���肢���܂��I";
		mes "���F����̓����̒�����";
		mes "���͂��Ă��������I";
		next;
		menu "���͂���",-;
		mes "[��������]";
		mes "���肪�Ƃ��������܂��I";
		mes "���F����̓����͔��Ɋ댯�ł��B";
		mes "�K���p�[�e�B�[��g��ł���";
		mes "�������s���Ă��������B";
		mes "��낵�����肢���܂��I";
		setquest 15006;
		compquest 15006;
		close;
	}
	mes "[��������]";
	mes "���F����̓����͔��Ɋ댯�ł��B";
	mes "�K���p�[�e�B�[��g��ł���";
	mes "�������s���Ă��������B";
	mes "��낵�����肢���܂��I";
	close;
}
moro_cav.gat,50,63,5	script	���F����#bios	844,{
	if(!(checkquest(15006) & 0x8)) {	// �����b
		mes "[��������]";
		mes "�����̓����N������h���A���R��";
		mes "�őO���ł��B";
		mes "���͒������ɂ�蔭�����ꂽ";
		mes "^ff0000���F����^000000�̒������s���Ă��܂��B";
		next;
		mes "[��������]";
		mes "�������A���F����̓����ɂ�";
		mes "���͂ȃ����X�^�[���������Ă���";
		mes "���������r��Ȕ�Q��";
		mes "�󂯂Ă��܂��܂����c�c�B";
		next;
		mes "[��������]";
		mes "�����͑��s���Ȃ���΂Ȃ�܂���";
		mes "����l�̗͂ł͒������s�Ȃ��܂���B";
		next;
		mes "[��������]";
		mes "�����ŁA�r�̗��ł��낤";
		mes "�`���҂̕��X�ɂ���`����";
		mes "���肢���Ă���̂ł��B";
		next;
		mes "[��������]";
		mes "���肢���܂��I";
		mes "���F����̓����̒�����";
		mes "���͂��Ă��������I";
		next;
		menu "���͂���",-;
		mes "[��������]";
		mes "���肪�Ƃ��������܂��I";
		mes "���F����̓����͔��Ɋ댯�ł��B";
		mes "�K���p�[�e�B�[��g��ł���";
		mes "�������s���Ă��������B";
		mes "��낵�����肢���܂��I";
		setquest 15006;
		compquest 15006;
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "^ff0000�]���̐�ɐi�ނɂ̓p�[�e�B�[��";
		mes "�@�������Ă���K�v������]^000000";
		close;
	}
	if((checkquest(15005)&0x2 == 0 || checkquest(118927)&0x2 == 0) && checkquest(15007)&0x2) {
		mes "�]���̐�͓��ꂵ�Ă���1��ڂ�";
		mes "�@^ff0000�ߑO5���ȍ~^000000�ɐi�s�\�ł��B";
		mes "�@�A���A�Ō�̓�������Ă���";
		mes "�@^ff00001����^000000�o�߂���܂ł�";
		mes "�@�i�s�ł��܂���̂ł����ӂ��������]";
		close;
	}
	if(checkquest(15005) & 0x2) {
		delquest 15005;
		delquest 15007;
	}
	if(checkquest(118927) & 0x2)
		delquest 118927;
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	mes "�]���F���킪����]";
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		set '@str1$,"���F����ւ̓����J��";
		set '@str2$,"���F����ɓ���";
	}
	else {
		set '@str2$,"���F����ɓ���";
	}
	next;
	switch(select('@str1$,'@str2$,"�L�����Z��")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�p�[�e�B�[���F" +'@party$;
			mes "�p�[�e�B�[���[�_�[�F" +'@leader$;
			mes "^0000ffbios_island ^000000�|�\�񎸔s";
			close;
		}
		mdcreate "bios_island";
		mes "^ff0000�]�������A���_���W������^000000";
		mes "^ff0000�@��������܂����B^000000";
		mes "^ff0000�@�ēx�N���b�N����^000000";
		mes "^ff0000�@����������ĉ������]^000000";
		close;
	case 2:
		switch(mdenter("bios_island")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[bios_island] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x1, 0x00ff99;
			setquest 96430;
			setquest 15005;
			setquest 15007;
			setquest 118927;
			donpcevent getmdnpcname("BiosControl")+ "::OnStart";
			close2;
			//warp "1@dth1.gat",17,93;
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
	case 3:
		mes "�]���F���킩�痣�ꂽ�]";
		close;
	}
OnInit:
	waitingroom "�r�I�X�̓�",0;
	end;
}

//============================================================
// �r�I�X�̓�
//------------------------------------------------------------
1@dth1.gat,84,90,0	script	#BARRICADE_bios1_1	1905,{}
1@dth1.gat,84,91,0	script	#BARRICADE_bios1_2	1905,{}
1@dth1.gat,84,92,0	script	#BARRICADE_bios1_3	1905,{}
1@dth1.gat,84,93,0	script	#BARRICADE_bios1_4	1905,{}
1@dth1.gat,84,94,0	script	#BARRICADE_bios1_5	1905,{}
1@dth1.gat,84,95,0	script	#BARRICADE_bios1_6	1905,{}
1@dth1.gat,84,96,0	script	#BARRICADE_bios1_7	1905,{}
1@dth1.gat,84,97,0	script	#BARRICADE_bios1_8	1905,{}

1@dth1.gat,1,1,0	script	BiosControl	139,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("���_�A���N#bios1");
	hideonnpc getmdnpcname("#��b�p�_�~�[1");
	hideonnpc getmdnpcname("�i�ߊ��A�W�t#bios1");
	hideonnpc getmdnpcname("�������C�O���h#bios1");
	hideonnpc getmdnpcname("�L�h#bios1");
	hideonnpc getmdnpcname("���[��#bios1");
	hideonnpc getmdnpcname("�A���R������#bios1");
	hideonnpc getmdnpcname("�����[�X��#bios1");
	hideonnpc getmdnpcname("�q���[#bios1");
	hideonnpc getmdnpcname("�w���W�k#bios1");
	hideonnpc getmdnpcname("�q�V�G#bios1");
	hideonnpc getmdnpcname("�G�C���@���g#bios1");
	hideonnpc getmdnpcname("��b�w�X�����^#bios1");
	hideonnpc getmdnpcname("�攭�����A�o�����`�F#b1");

	hideonnpc getmdnpcname("warp1#bios2");
	hideonnpc getmdnpcname("���_�A���N#bios3");

	hideonnpc getmdnpcname("�i�ߊ��A�W�t#bios3");
	hideonnpc getmdnpcname("�������C�O���h#bios3");
	hideonnpc getmdnpcname("�L�h#bios3");
	hideonnpc getmdnpcname("���[��#bios3");
	hideonnpc getmdnpcname("�����[�X��#bios3");
	hideonnpc getmdnpcname("�q���[#bios3");
	hideonnpc getmdnpcname("�w���W�k#bios3");
	hideonnpc getmdnpcname("�q�V�G#bios3");
	hideonnpc getmdnpcname("�G�C���@���g#bios3");
	hideonnpc getmdnpcname("��b�w�X�����^#bios3");
	hideonnpc getmdnpcname("�攭�����A�o�����`�F#b3");

	hideonnpc getmdnpcname("freeze#bios3");

	for(set '@i,1; '@i<=3; set '@i,'@i+1) {
		for(set '@j,1; '@j<=8; set '@j,'@j+1)
			hideonnpc getmdnpcname("���҂̃I�[�N�]���r#"+ '@i + '@j +"bi");
	}

	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,1;
	areasetcell getmdmapname("1@dth2.gat"),150,126,151,133,1;

	set '@map$,getmdmapname("1@dth1.gat");
	set '@label$,getmdnpcname("BiosControl")+ "::OnKilled";
	monster '@map$,90,94,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,90,94,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,101,125,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,101,125,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,108,156,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,108,156,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,119,59,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,119,144,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,121,69,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,124,164,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,131,101,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,131,101,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,135,50,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,135,152,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,138,132,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,138,132,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,141,143,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,143,49,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,144,164,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,145,107,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,145,107,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,153,76,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,153,76,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,156,46,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,165,84,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,165,130,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,170,67,"���҂̃}�����X�t�B�A�[",3012,2,'@label$;
	monster '@map$,184,130,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,192,145,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,194,116,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,203,131,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,203,151,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,203,162,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,203,162,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,204,112,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,205,98,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,206,169,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,210,62,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,211,88,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,212,75,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,213,151,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,214,53,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,215,109,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,217,129,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,221,166,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,223,72,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,224,62,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,225,103,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,225,54,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,225,89,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,225,152,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,227,150,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,227,150,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,227,150,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,228,124,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,232,87,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,232,69,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,233,57,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,237,80,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,240,140,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,243,106,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,244,119,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,246,71,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,246,126,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,248,81,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,249,144,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,249,155,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,252,105,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,274,104,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,297,103,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,306,103,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,316,103,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;

	donpcevent getmdnpcname("#bios2_mobdead1") +"::OnStart";
	end;
OnKilled:
	end;
}
1@dth1.gat,71,97,3	script	�W�F�C�X#bios1	467,{
	mes "[�W�F�C�X]";
	mes "�c�c�W�F�C�X���B";
	next;
	mes "[�W�F�C�X]";
	mes "�c�c�B";
	close;
}
1@dth1.gat,74,94,3	script	���_�A���N#bios1	3029,{
	end;
OnTalk1:
	unittalk "�H�H�H�H : �N�b�N�b�N�B";
	end;
OnTalk2:
	unittalk "�H�H�H�H : �悤�����r�I�X�̓��ցB";
	end;
OnTalk3:
	unittalk "���_�A���N : ���͎��_�A���N�B�����͎������o�������Ɛ��̋�Ԃł��B";
	end;
OnTalk4:
	unittalk "���_�A���N : ����͂���́A�݂Ȃ���А��������悤�ł��ˁB";
	end;
OnTalk5:
	unittalk "���_�A���N : ���ꂩ�烂���N�l�ɕ����鐶�т𒲒B���悤�Ƃ��Ă����̂ł����c�c�B";
	end;
OnTalk6:
	unittalk "���_�A���N : �܂������т��������ė���Ƃ́c�c�N�N�N�B";
	end;
OnTalk7:
	unittalk "���_�A���N : �����N�l�̗͂ɂȂ�鎖�����h�Ɏv���Ȃ����B";
	end;
OnTalk8:
	unittalk "���_�A���N : �N�N�A�А����ǂ��Č��\�ł��B�����A�}���K�v�͂���܂���B";
	end;
OnTalk9:
	unittalk "���_�A���N : �܂��͎��̐��E�ł������c�c���낮���Ƃł��B�N�N�N�N�N�B";
	end;
}
1@dth1.gat,67,97,5	script	�u���h#bios1	468,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0) || 'flag) {
		mes "[�u���h]";
		mes "���̓u���h�B";
		mes "���������N�̕�����";
		mes "�j�~���ɗ����񂾁B";
		close;
	}
	if(checkquest(201720)) {
		if(select("����}��","��b������") == 1) {
			mes "�]�N�����Ă���H�]";
			next;
			set '@menu,select(
				(ASH_6QUE == 14 || ASH_6QUE == 15? "�A�W�t�ƃC�O���h��": "�H�H�H"),
				(ASH_5QUE >= 31? "�L�h�ƃ��[����": "�H�H�H"),
				(ASH_3QUE >= 100? "�Z���U���B��": "�H�H�H"),
				(ECL_3QUE >= 33? "�q�V�G�ƃG�C���@���g��": "�H�H�H"),
				(DIC_2QUE >= 23? "�w�X�����^�ƃA�o�����`�F��": "�H�H�H"),
				"�N�����Ȃ�");
			switch('@menu) {
			case 1:
				mes "�]�A�W�t�A�C�O���h�ƍ��������]";
				set '@menu,3;
				break;
			case 2:
				mes "�]�L�h�A���[���ƍ��������]";
				set '@menu,4;
				break;
			case 3:
				mes "�]�Z���U���A�����[�X���A";
				mes "�@�q���[�A�w���W�k�ƍ��������]";
				set '@menu,5;
				break;
			case 4:
				mes "�]�q�V�G�A";
				mes "�@�G�C���@���g�ƍ��������]";
				set '@menu,6;
				break;
			case 5:
				mes "�]�w�X�����^�A";
				mes "�@�A�o�����`�F�ƍ��������]";
				set '@menu,7;
				break;
			default:
				mes "�]�N�Ƃ��������Ȃ������]";
				set '@menu,2;
				break;
			}
			close2;
			set 'flag,'@menu;
			hideonnpc getmdnpcname("�u���h#bios1");
			hideonnpc getmdnpcname("�W�F�C�X#bios1");
			donpcevent getmdnpcname("�u���h#bios1")+ "::OnStart";
			end;
		}
	}
	mes "�]������Ȃ��j����l�g������]";
	close2;
	set 'flag,1;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�u���h : ����H�@����ȂƂ���Ŗ`���҂ɉ�Ƃ́c�c";
	end;
OnTimer4000:
	unittalk "�u���h : �N�����������N�̕�����j�~���ɗ����̂��H";
	end;
OnTimer7000:
	unittalk "�u���h : ���̓v�����e�����痈���u���h�B�����́c�c";
	end;
OnTimer10000:
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : �c�c�W�F�C�X���B";
	end;
OnTimer13000:
	unittalk "�u���h : ���܂�ȁB�W�F�C�X�͐l���m��Ȃ񂾁B";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : �c�c";
	end;
OnTimer19000:
	unittalk "�u���h : ������A��납��N���ǂ������ė��Ă��邪�A�N�̒m�荇�����H";
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc getmdnpcname("#��b�p�_�~�[1");
	end;
OnStart:
	hideonnpc getmdnpcname("#BARRICADE_bios1_1");
	hideonnpc getmdnpcname("#BARRICADE_bios1_2");
	hideonnpc getmdnpcname("#BARRICADE_bios1_3");
	hideonnpc getmdnpcname("#BARRICADE_bios1_4");
	hideonnpc getmdnpcname("#BARRICADE_bios1_5");
	hideonnpc getmdnpcname("#BARRICADE_bios1_6");
	hideonnpc getmdnpcname("#BARRICADE_bios1_7");
	hideonnpc getmdnpcname("#BARRICADE_bios1_8");
	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,0;
	sleep 3000;
	announce "���_�A���N : ���A����͐�����҂݂̂ɖK��鋰�|�B���ׂĂ͂�������n�܂�̂ł��c�c", 0x9, 0xffff00;
	sleep 3000;
	announce "�u���h : �҂ăA���N�I�@�������A���ɓ������悤���ȁB�z��ǂ����I", 0x9, 0xffff00;
	end;
}
1@dth1.gat,67,97,0	script	#��b�p�_�~�[1	139,10,10,{
	mes "�]�N�����Ă���H�]";
	next;
	set '@menu,select(
		(ASH_6QUE == 14 || ASH_6QUE == 15? "�A�W�t�ƃC�O���h��": "�H�H�H"),
		(ASH_5QUE >= 31? "�L�h�ƃ��[����": "�H�H�H"),
		(ASH_3QUE >= 100? "�Z���U���B��": "�H�H�H"),
		(ECL_3QUE >= 33? "�q�V�G�ƃG�C���@���g��": "�H�H�H"),
		(DIC_2QUE >= 23? "�w�X�����^�ƃA�o�����`�F��": "�H�H�H"),
		"�N�����Ȃ�");
	switch('@menu) {
	case 1:
		if(ASH_6QUE == 14 || ASH_6QUE == 15) {
			mes "�]�U������ƁA�A�W�t�ƃC�O���h�������]";
			close2;
			set 'flag,3;
			set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),3;
			hideonnpc getmdnpcname("#��b�p�_�~�[1");
			hideoffnpc getmdnpcname("�i�ߊ��A�W�t#bios1");
			hideoffnpc getmdnpcname("�������C�O���h#bios1");
			donpcevent getmdnpcname("#��b�p�_�~�[1")+ "::OnStart";
			end;
		}
		break;
	case 2:
		if(ASH_5QUE >= 31) {
			mes "�]�U������ƁA�L�h�ƃ��[���������]";
			close2;
			set 'flag,4;
			set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),4;
			hideonnpc getmdnpcname("#��b�p�_�~�[1");
			hideoffnpc getmdnpcname("�L�h#bios1");
			hideoffnpc getmdnpcname("���[��#bios1");
			donpcevent getmdnpcname("#��b�p�_�~�[1")+ "::OnStart";
			end;
		}
		break;
	case 3:
		if(ASH_3QUE >= 100) {
			mes "�]�U������ƁA�Z���U���A�����[�X���A";
			mes "�@�q���[�A�w���W�k�������]";
			close2;
			set 'flag,5;
			set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),5;
			hideonnpc getmdnpcname("#��b�p�_�~�[1");
			hideoffnpc getmdnpcname("�����[�X��#bios1");
			hideoffnpc getmdnpcname("�q���[#bios1");
			hideoffnpc getmdnpcname("�w���W�k#bios1");
			hideoffnpc getmdnpcname("�A���R������#bios1");
			donpcevent getmdnpcname("#��b�p�_�~�[1")+ "::OnStart";
			end;
		}
		break;
	case 4:
		if(ECL_3QUE >= 33) {
			mes "�]�U������ƁA�q�V�G��";
			mes "�@�G�C���@���g�������]";
			close2;
			set 'flag,6;
			set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),6;
			hideonnpc getmdnpcname("#��b�p�_�~�[1");
			hideoffnpc getmdnpcname("�q�V�G#bios1");
			hideoffnpc getmdnpcname("�G�C���@���g#bios1");
			donpcevent getmdnpcname("#��b�p�_�~�[1")+ "::OnStart";
			end;
		}
		break;
	case 5:
		if(DIC_2QUE >= 23) {
			mes "�]�U������ƁA�w�X�����^��";
			mes "�@�A�o�����`�F�������]";
			close2;
			set 'flag,7;
			set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),7;
			hideonnpc getmdnpcname("#��b�p�_�~�[1");
			hideoffnpc getmdnpcname("��b�w�X�����^#bios1");
			hideoffnpc getmdnpcname("�攭�����A�o�����`�F#b1");
			donpcevent getmdnpcname("#��b�p�_�~�[1")+ "::OnStart";
			end;
		}
		break;
	default:
		mes "�]�U������ƁA�N�����Ȃ������B";
		mes "�@�u���h�̊��Ⴂ���낤�]";
		close2;
		set 'flag,2;
		set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),2;
		hideonnpc getmdnpcname("#��b�p�_�~�[1");
		donpcevent getmdnpcname("#��b�p�_�~�[1")+ "::OnStart";
		end;
	}
	mes "�]�U������ƁA�N�����Ȃ������B";
	mes "�@�u���h�̊��Ⴂ���낤�]";
	mes "�@";
	mes "�]�����𖞂����Ă��Ȃ�����";
	mes "�@���Ԃ��ĂԂ��Ƃ��o���܂���]";
	close;
OnStart:
	sleep 1000;
	if('flag == 2) {
		sleep 2000;
	}
	else if('flag == 3) {
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios1")),"�A�W�t : �݂�ȁA�������I�@������������ɂ͂������v���I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#bios1")),"�C�O���h : �Z�M�I�@�i�ߊ����O���ɏo��Ȃ�Ăǂ��������肾�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios1")),"�A�W�t : ���邳���I�@���ƁA���̎��͎i�ߊ��ƌĂׁI";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : ���񂽂�c�c�A���R�̎i�ߊ��A�W�t�Ƌ������C�O���h���I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : �c�c�ǂ����Ă���ȂƂ���ɁH";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios1")),"�A�W�t : �����ɂ͎؂肪�����ĂȁB������Ԃ��ɗ����񂾁B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#bios1")),"�C�O���h : ���������킯������A�����������������s�����ĖႤ���B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : ���񂽂炪����Ȃ�S�����I�@��낵�����ނ��I";
		sleep 3000;
	}
	else if('flag == 4) {
		unittalk getnpcid(0,getmdnpcname("�L�h#bios1")),"�L�h : �v���Ԃ肾�ȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���[��#bios1")),"���[�� : �v���Ԃ肾�ˁI�@���̎��͂��肪�Ƃ��I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�L�h#bios1")),"�L�h : ���O�ɂ͐��b�ɂȂ�������ȁB��`���Ă�낤�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �N�������N���͒m��Ȃ����A�����͊댯���I�@�A���������ǂ��I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�L�h#bios1")),"�L�h :���������ȁA����ł��r�Ɋo���͂���񂾂��H";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���[��#bios1")),"���[�� : �ƁA�����킯�Ŏ��������ꏏ�ɍs����I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : �c�c�u���h�A������A����������Ȃ��������B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �������c�c�����A���������͂��Ȃ��ł����B";
		sleep 3000;
	}
	else if('flag == 5) {
		unittalk getnpcid(0,getmdnpcname("�A���R������#bios1")),"�Z���U��: �݂Ȃ���A���v���Ԃ�ł��I�@�l�����ɂ�����`�������Ă��������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�w���W�k#bios1")),"�w���W�k : �����݂�Ȃɒ�Ă�����ł��B���b�ɂȂ�������Ԃ������āB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q���[#bios1")),"�q���[ : �܂������A������Ă��c�c�B���ꂾ����A���i�x���c�̐l�Ԃ́c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�����[�X��#bios1")),"�����[�X�� : �l�����̈ӌ����������ɏ���Ɍ��߂Ă܂�������ˁc�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q���[#bios1")),"�q���[ : �����[�X�������Ď��ɖ��f�ŉ�c�̓��������߂邯�ǂȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�w���W�k#bios1")),"�w���W�k : �q���[�����āA���[���A���Z���X���Ȃ��āA���ꂵ���ł���B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�A���R������#bios1")),"�Z���U��: 3�l�Ƃ��A����ȏꏊ�ŃP���J�͂�߂Ă��������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �c�c�N�����͂����̎��������낤�H";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �������͌���Ȃ��B�A���������ǂ��B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : �c�c�u���h�A�����畷���ĂȂ����B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �c�c�B";
		sleep 3000;
	}
	else if('flag == 6) {
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios1")),"�q�V�G : �݂�ȁA�����Ȃ悤�ŗǂ������B���ɂ���`�킹�Ă���B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�G�C���@���g#bios1")),"�G�C���@���g : ���Ⴂ����Ȃ�B���̓V�i�C����ǂ��Ă��邾�����B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios1")),"�q�V�G : ����l�ōs���ƌ������̂ɁA�ߖłڂ����ƌ����Ă��ė����񂾁B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : ���t�B�l���c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : ���t�B�l�����ǂ����Ă����ɁH";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios1")),"�q�V�G : ���܂Ȃ��A�ڂ������͔閧�Ȃ񂾁B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios1")),"�q�V�G : �������ȁA���̐l�̒��ԂƂł��v���Ă���B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �������A���Ԃ�������̂͐S�����B��낵�����ށB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�G�C���@���g#bios1")),"�G�C���@���g : �ӂ�A��ꍇ���͂����܂ł��B���o�}�����������B";
		sleep 3000;
	}
	else if('flag == 7) {
		unittalk getnpcid(0,getmdnpcname("�攭�����A�o�����`�F#b1")),"�A�o�����`�F : ���A������ɂ�������Ⴂ�܂������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios1")),"�w�X�����^ : �A�n�g�͂��̌�A�s��������܂��Ă��܂��܂����c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios1")),"�w�X�����^ : �A�n�g�̍s����ǂ��ׂɂ����s�����Ă��������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �N�����́c�c�T�t�@�����H";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�攭�����A�o�����`�F#b1")),"�A�o�����`�F : �����ɂ��A�攭�����̃A�o�����`�F�ł��B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios1")),"�w�X�����^ : ��b�̃w�X�����^�ł��B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : ��b�c�c���܂Ȃ����v�l�x��̌o���͂Ȃ��ĂˁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �����̐g�͎����Ŏ���ĖႤ���ƂɂȂ�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios1")),"�w�X�����^ : �S���Ă��܂��Ƃ��B�݂Ȃ���A��낵�����肢���܂��B";
		sleep 3000;
	}
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"�H�H�H�H : �N�b�N�b�N�B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : �c�c!!!�@�N��!?";
	sleep 3000;
	hideoffnpc getmdnpcname("���_�A���N#bios1");
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"�H�H�H�H : �悤�����r�I�X�̓��ցB";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : ���͎��_�A���N�B�����͎������o�������Ɛ��̋�Ԃł��B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �Ȃɂ�!!";
	sleep 3000;
	if('flag == 3) {
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios1")),"�A�W�t : �ւ��A�������e�ʂ��B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#bios1")),"�C�O���h : �������c�c���Ƃ͌��Ⴂ�̋����݂������ȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios1")),"�A�W�t : �S���A�C�𔲂��񂶂�Ȃ����I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : ����͂���́A�݂Ȃ���А��������悤�ł��ˁB";
		sleep 3000;
	}
	else if('flag == 4) {
		unittalk getnpcid(0,getmdnpcname("�L�h#bios1")),"�L�h : �����c�c�����ȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���[��#bios1")),"���[�� : �������ˁA���_���Ă��������̎��͂��邩�ȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�L�h#bios1")),"�L�h : �����c�c�����A�S���ł�����Ώ��ĂȂ����肶��Ȃ��B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : ����͂���́A�݂Ȃ���А��������悤�ł��ˁB";
		sleep 3000;
	}
	else if('flag == 5) {
		unittalk getnpcid(0,getmdnpcname("�����[�X��#bios1")),"�����[�X��: ���A���_!?";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q���[#bios1")),"�q���[ : ���A��������������Ȃ��ł����I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�w���W�k#bios1")),"�w���W�k : ���_���ĕ����Ă��ł��ˁI�@�A�n�n�n�n�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�A���R������#bios1")),"�Z���U�� : �݂Ȃ���A�C��t���Ă��������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : ����͂���́A�݂Ȃ���А��������悤�ł��ˁB";
		sleep 3000;
	}
	else if('flag == 6) {
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios1")),"�q�V�G : �����c�c�������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�G�C���@���g#bios1")),"�G�C���@���g : �N�N�N�A�債�����͂������Ă�悤���ȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�G�C���@���g#bios1")),"�G�C���@���g : �����̂Ƃ��ė~�����Ƃ��낾���c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios1")),"�q�V�G : ���O�͂܂�����Ȏ����c�c�I�@�݂�ȁA�C������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : ����͂���́A�݂Ȃ���А��������悤�ł��ˁB";
		sleep 3000;
	}
	else if('flag == 7) {
		unittalk getnpcid(0,getmdnpcname("�攭�����A�o�����`�F#b1")),"�A�o�����`�F : �݂Ȃ���A���C�������������I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios1")),"�w�X�����^ : ����́A���G�̂悤�ł��ˁc�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios1")),"�w�X�����^ : �ł����A��X�͑ނ��킯�ɂ͂����Ȃ��̂ł��I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : ����͂���́A�݂Ȃ���А��������悤�ł��ˁB";
		sleep 3000;
	}
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : ���ꂩ�烂���N�l�ɕ����鐶�т𒲒B���悤�Ƃ��Ă����̂ł����c�c�B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : �܂������т��������ė���Ƃ́c�c�N�N�N�B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : �����N�l�̗͂ɂȂ�鎖�����h�Ɏv���Ȃ����B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �͂��I�@�O���ɗp�͂Ȃ��I";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �N�����m��񂪁A�܂��͂��O��|���Ă���!!";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : �N�N�A�А����ǂ��Č��\�ł��B�����A�}���K�v�͂���܂���B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios1")),"���_�A���N : �܂��͎��̐��E�ł������c�c���낮���Ƃł��B�N�N�N�N�N�B";
	sleep 3000;
	hideonnpc getmdnpcname("���_�A���N#bios1");
	unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �������I�@�����₪����!!";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : ���������������N�𕜊������悤�Ƃ��Ă���̂��H";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios1")),"�u���h : �z��ǂ����I�@�W�F�C�X�}���I";
	hideonnpc getmdnpcname("�u���h#bios1");
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios1")),"�W�F�C�X : �c�c��s����B���Ƃ�����ė��Ă���B";
	sleep 1000;
	hideonnpc getmdnpcname("�W�F�C�X#bios1");
	sleep 3000;
	if('flag == 3) {
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios1")),"�A�W�t : �C�O���h�I�@���������������I";
		sleep 3000;
		hideonnpc getmdnpcname("�i�ߊ��A�W�t#bios1");
		hideonnpc getmdnpcname("�������C�O���h#bios1");
	}
	else if('flag == 4) {
		unittalk getnpcid(0,getmdnpcname("�L�h#bios1")),"�L�h : �悵�I�@���������s�����I";
		sleep 3000;
		hideonnpc getmdnpcname("�L�h#bios1");
		hideonnpc getmdnpcname("���[��#bios1");
	}
	else if('flag == 5) {
		unittalk getnpcid(0,getmdnpcname("�����[�X��#bios1")),"�����[�X�� : ���A�|�����ǁc�c�݂�ȁI�@�s���܂��傤�I";
		sleep 3000;
		hideonnpc getmdnpcname("�����[�X��#bios1");
		hideonnpc getmdnpcname("�q���[#bios1");
		hideonnpc getmdnpcname("�w���W�k#bios1");
		hideonnpc getmdnpcname("�A���R������#bios1");
	}
	else if('flag == 6) {
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios1")),"�q�V�G : ������ɍs���B�݂�Ȃ��ォ�痈�Ă���I";
		sleep 3000;
		hideonnpc getmdnpcname("�q�V�G#bios1");
		hideonnpc getmdnpcname("�G�C���@���g#bios1");
	}
	else if('flag == 7) {
		unittalk getnpcid(0,getmdnpcname("�攭�����A�o�����`�F#b1")),"�A�o�����`�F : �w�X�����^�l�I�@��X���Q��܂��傤�I";
		sleep 3000;
		hideonnpc getmdnpcname("��b�w�X�����^#bios1");
		hideonnpc getmdnpcname("�攭�����A�o�����`�F#b1");
	}
	sleep 500;
	hideonnpc getmdnpcname("#BARRICADE_bios1_1");
	hideonnpc getmdnpcname("#BARRICADE_bios1_2");
	hideonnpc getmdnpcname("#BARRICADE_bios1_3");
	hideonnpc getmdnpcname("#BARRICADE_bios1_4");
	hideonnpc getmdnpcname("#BARRICADE_bios1_5");
	hideonnpc getmdnpcname("#BARRICADE_bios1_6");
	hideonnpc getmdnpcname("#BARRICADE_bios1_7");
	hideonnpc getmdnpcname("#BARRICADE_bios1_8");
	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,0;
	sleep 2500;
	announce "���_�A���N : ���A����͐�����҂݂̂ɖK��鋰�|�B���ׂĂ͂�������n�܂�̂ł��c�c", 0x9, 0xffff00;
	sleep 3000;
	announce "�u���h : �҂ăA���N�I�@�������A���ɓ������悤���ȁB�z��ǂ����I", 0x9, 0xffff00;
	end;
}
1@dth1.gat,60,96,5	script	�i�ߊ��A�W�t#bios1	459,{
	cutin "ep13_captin_edq.bmp", 2;
	mes "[�A�W�t]";
	mes "�v���Ԃ�̑O�����B";
	mes "�b���̌��������ȁB";
	mes strcharinfo(0)+"��";
	mes "��낵�����ނ��B";
	close2;
	cutin "ep13_captin_edq.bmp", 255;
	end;
}
1@dth1.gat,60,93,5	script	�������C�O���h#bios1	751,{
	mes "[�C�O���h]";
	mes "�܂������c�c�B";
	mes "�Z�M�͉����l���Ă�񂾁B";
	close;
}
1@dth1.gat,60,96,5	script	�L�h#bios1	884,{
	mes "[�L�h]";
	mes "���������͉������邩�킩��Ȃ��B";
	mes "�C�𔲂��񂶂�Ȃ����B";
	close;
}
1@dth1.gat,60,93,5	script	���[��#bios1	885,{
	mes "[���[��]";
	mes "���̓��A�������Ȋ���������B";
	mes "�����N���邩�킩��Ȃ�����";
	mes "�C��t���ĂˁB";
	close;
}
1@dth1.gat,60,96,5	script	�A���R������#bios1	754,{
	mes "[�Z���U��]";
	mes "�فA�{���͕|���ł�����";
	mes "�������������ɂ���������ł��I";
	close;
}
1@dth1.gat,60,93,5	script	�����[�X��#bios1	748,{
	mes "[�����[�X��]";
	mes "�ǂǂǁA�ǂ����Ă���Ȃ��ƂɁc�c�B";
	mes "�����A�����o�������c�c�B";
	close;
}
1@dth1.gat,58,95,5	script	�q���[#bios1	868,{
	mes "[�q���[]";
	mes "�́A�͂́A�܂����őO���ɗ���Ƃ�";
	mes "�\�z�O�ł�����B";
	close;
}
1@dth1.gat,58,92,5	script	�w���W�k#bios1	931,{
	mes "[�w���W�k]";
	mes "��ɓ������瓇�ɏo��Ȃ��";
	mes "����Ⴀ�A�܂�����";
	mes "�Ȃ�Ă�";
	mes "�A�n�n�n�n�n�I";
	close;
}
1@dth1.gat,60,96,5	script	�q�V�G#bios1	623,{
	cutin "hisie01.bmp", 2;
	mes "[�q�V�G]";
	mes "�������Ă���Ԃɂ��J���́c�c";
	mes "����}�����I";
	close2;
	cutin "hisie01.bmp", 255;
	end;
}
1@dth1.gat,60,93,5	script	�G�C���@���g#bios1	618,{
	cutin "avant01.bmp", 2;
	mes "[�G�C���@���g]";
	mes "�N�N�N�A���ɉ����p���ȁH";
	mes "�����̂ɂȂ肽���Ȃ�";
	mes "���ł����}���邼�H";
	close2;
	cutin "avant01.bmp", 255;
	end;
}
1@dth1.gat,60,96,5	script	��b�w�X�����^#bios1	451,{
	cutin "ep13_heslanta.bmp", 2;
	mes "[�w�X�����^]";
	mes "�r���Ɋւ��Ă�";
	mes "���܂蓾�ӂł͂Ȃ��̂ł���";
	mes "�T�t�@���̑�\�Ƃ���";
	mes "�s�͒v���܂��傤�I";
	close2;
	cutin "ep13_heslanta.bmp", 255;
	end;
}
1@dth1.gat,60,93,5	script	�攭�����A�o�����`�F#b1	450,{
	mes "[�A�o�����`�F]";
	mes "���̐�ɑ҂��\����̂�";
	mes "�����̑���ł͂Ȃ��ł��傤�B";
	mes "�攭�����̖��ɂ�����";
	mes "�w�X�����^�l�͎������܂��B";
	close;
}

1@dth1.gat,326,103,0	script	warp1#bios1	45,1,1,{
	warp getmdmapname("1@dth2.gat"),17,93;
	end;
}

1@dth2.gat,150,126,0	script	#BARRICADE_bios2_1	1905,{}
1@dth2.gat,150,127,0	script	#BARRICADE_bios2_2	1905,{}
1@dth2.gat,150,128,0	script	#BARRICADE_bios2_3	1905,{}
1@dth2.gat,150,129,0	script	#BARRICADE_bios2_4	1905,{}
1@dth2.gat,150,130,0	script	#BARRICADE_bios2_5	1905,{}
1@dth2.gat,150,131,0	script	#BARRICADE_bios2_6	1905,{}
1@dth2.gat,150,132,0	script	#BARRICADE_bios2_7	1905,{}
1@dth2.gat,150,133,0	script	#BARRICADE_bios2_8	1905,{}

1@dth2.gat,1,1,0	script	#bios2_mobdead1	139,{
OnStart:
	monster getmdmapname("1@dth2.gat"),145,130,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),144,130,"���҂̃f�U�[�g�E���t",3014,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),143,130,"���҂̃t�F��",3015,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),103,124,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),102,124,"���҂̃f�U�[�g�E���t",3014,3,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),101,124,"���҂̃t�F��",3015,3,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),119,160,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),118,160,"���҂̃f�U�[�g�E���t",3014,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),117,160,"���҂̃t�F��",3015,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer500:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@dth2.gat"),getmdnpcname("#bios2_mobdead1")+ "::OnKilled");
	if('@count == 10)
		announce "�u���h : �܂�10�C�̃����X�^�[���c���Ă��邼�I", 0x9, 0xffff00;
	else if('@count == 5)
		announce "�u���h : �c��̃����X�^�[�͂���5�C�A�����������I", 0x9, 0xffff00;
	else if('@count == 1)
		announce "�u���h : �����X�^�[�͂���1�C���B�Ō�܂ŋC�𔲂��ȁI", 0x9, 0xffff00;
	else if('@count <= 0) {
		hideonnpc getmdnpcname("#BARRICADE_bios2_1");
		hideonnpc getmdnpcname("#BARRICADE_bios2_2");
		hideonnpc getmdnpcname("#BARRICADE_bios2_3");
		hideonnpc getmdnpcname("#BARRICADE_bios2_4");
		hideonnpc getmdnpcname("#BARRICADE_bios2_5");
		hideonnpc getmdnpcname("#BARRICADE_bios2_6");
		hideonnpc getmdnpcname("#BARRICADE_bios2_7");
		hideonnpc getmdnpcname("#BARRICADE_bios2_8");
		areasetcell getmdmapname("1@dth2.gat"),150,126,151,133,0;
		announce "�u���h : �悵�I�@���̕������Ƃ����I�@���Ɉړ����邼�I", 0x9, 0xffff00;
		sleep 2500;
		donpcevent getmdnpcname("#bios2_mobdead2")+ "::OnStart";
	}
	end;
}
1@dth2.gat,1,1,0	script	#bios2_mobdead2	139,{
OnStart:
	announce "�u���h : �������I�@���������X�^�[���炯���B�S�ē|�������Ȃ��̂��I", 0x9, 0xffff00;
	monster getmdmapname("1@dth2.gat"),203,132,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),202,132,"���҂̃f�U�[�g�E���t",3014,3,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),201,132,"���҂̃t�F��",3015,3,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),229,126,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),228,126,"���҂̃f�U�[�g�E���t",3014,4,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),227,126,"���҂̃t�F��",3015,4,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),267,104,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),268,104,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),269,104,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),270,103,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),270,104,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),272,102,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),273,102,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),273,103,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),274,102,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),275,103,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),276,103,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),278,105,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),281,104,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer500:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@dth2.gat"),getmdnpcname("#bios2_mobdead2")+ "::OnKilled");
	if('@count == 10)
		announce "�u���h : �܂�10�C�̃����X�^�[���c���Ă��邼�I", 0x9, 0xffff00;
	else if('@count == 5)
		announce "�u���h : �c��̃����X�^�[�͂���5�C�A�����������I", 0x9, 0xffff00;
	else if('@count == 1)
		announce "�u���h : �����X�^�[�͂���1�C���I", 0x9, 0xffff00;
	else if('@count <= 0) {
		announce "�u���h : �悵�A�Еt�������I�@���̓������ɐi�ނ��I", 0x9, 0xffff00;
		hideoffnpc getmdnpcname("warp1#bios2");
	}
	end;
}
1@dth2.gat,67,97,0	script	start1#bios2	139,5,5,{
	hideonnpc getmdnpcname("start1#bios2");
	donpcevent getmdnpcname("#bios2_mobdead")+ "::OnStart";
	switch(getvariableofnpc('flag,getmdnpcname("�u���h#bios1"))) {
	case 3:
		announce "�A�W�t : �ӂ�A���̒��x�̓G�A���̑��肶��˂��ȁB", 0x9, 0xffff00;
		sleep 3000;
		announce "�C�O���h : �������ČZ�M�Ɣw�����킹�Ő���Ă�Ɨb��������v���o����B", 0x9, 0xffff00;
		break;
	case 4:
		announce "�L�h : ���[���I�@���v��!?", 0x9, 0xffff00;
		sleep 3000;
		announce "���[�� : ���͑��v�B���̂܂ܐi�݂܂��傤�I", 0x9, 0xffff00;
		break;
	case 5:
		announce "�u���h : ����4�l�g�̎p�������Ȃ��ȁc�c�B", 0x9, 0xffff00;
		sleep 3000;
		announce "�u���h : ��͂�A���̐킢�ɂ͕͗s�����������c�c�B", 0x9, 0xffff00;
		break;
	case 6:
		announce "�q�V�G : �����ڂɂ�炸�c�c�����猋�\�����ȁB", 0x9, 0xffff00;
		sleep 3000;
		announce "�G�C���@���g : �N�N�N�A���Ȃ�l�̋����̎����̂ɂł����Ă�낤���H", 0x9, 0xffff00;
		break;
	case 7:
		announce "�w�X�����^ : �T�t�@���̈Ӓn�ɂ����āA�������Ȃ��̂ł��I", 0x9, 0xffff00;
		sleep 3000;
		announce "�A�o�����`�F : �w�X�����^�l�I�@�������Ȃ��炸�I", 0x9, 0xffff00;
		break;
	}
	donpcevent getmdnpcname("BC�p#bios2")+ "::OnStart";
	end;
}
1@dth2.gat,67,97,0	script	BC�p#bios2	139,{
OnStart:
	sleep 3000;
	announce "���_�A���N : �N�N�N�B�����Ȃ����l�ԁB", 0x9, 0xffff00;
	sleep 3000;
	announce "���_�A���N : �����̏I���_�Ƃ́A���Ȃ킿�[���B", 0x9, 0xffff00;
	sleep 3000;
	announce "���_�A���N : �����}���A���{�ւƗ����Ă��܂���", 0x9, 0xffff00;
	sleep 3000;
	announce "���_�A���N : ����ƈႢ�A�M���̎��������V���l�͌���Ȃ��B", 0x9, 0xffff00;
	sleep 3000;
	announce "���_�A���N : �����A���ɋ����Ȃ����B�S�����|�ɐ��ߏグ��̂ł��B", 0x9, 0xffff00;
	sleep 3000;
	announce "���_�A���N : ���|���тƂȂ�A�����N�l�͍Ăѐ��܂�ς��ł��傤�B", 0x9, 0xffff00;
	sleep 3000;
	announce "�u���h : �҂񂾃A���N!!�@�������B�܂��͎ז��ȃ����X�^�[�B��S�ē|�����I", 0x9, 0xffff00;
	end;
}
1@dth2.gat,326,103,0	script	warp1#bios2	45,1,1,{
	warp getmdmapname("1@dth3.gat"),45,68;
	end;
}

1@dth3.gat,62,80,3	script	���҂̃I�[�N�]���r#11bi	3016,{}
1@dth3.gat,64,80,3	script	���҂̃I�[�N�]���r#12bi	3016,{}
1@dth3.gat,66,80,3	script	���҂̃I�[�N�]���r#13bi	3016,{}
1@dth3.gat,68,80,3	script	���҂̃I�[�N�]���r#14bi	3016,{}
1@dth3.gat,72,80,3	script	���҂̃I�[�N�]���r#15bi	3016,{}
1@dth3.gat,74,80,3	script	���҂̃I�[�N�]���r#16bi	3016,{}
1@dth3.gat,76,80,3	script	���҂̃I�[�N�]���r#17bi	3016,{}
1@dth3.gat,78,80,3	script	���҂̃I�[�N�]���r#18bi	3016,{}
1@dth3.gat,62,86,3	script	���҂̃I�[�N�]���r#21bi	3016,{}
1@dth3.gat,64,86,3	script	���҂̃I�[�N�]���r#22bi	3016,{}
1@dth3.gat,66,86,3	script	���҂̃I�[�N�]���r#23bi	3016,{}
1@dth3.gat,68,86,3	script	���҂̃I�[�N�]���r#24bi	3016,{}
1@dth3.gat,72,86,3	script	���҂̃I�[�N�]���r#25bi	3016,{}
1@dth3.gat,74,86,3	script	���҂̃I�[�N�]���r#26bi	3016,{}
1@dth3.gat,76,86,3	script	���҂̃I�[�N�]���r#27bi	3016,{}
1@dth3.gat,78,86,3	script	���҂̃I�[�N�]���r#28bi	3016,{}
1@dth3.gat,62,92,3	script	���҂̃I�[�N�]���r#31bi	3016,{}
1@dth3.gat,64,92,3	script	���҂̃I�[�N�]���r#32bi	3016,{}
1@dth3.gat,66,92,3	script	���҂̃I�[�N�]���r#33bi	3016,{}
1@dth3.gat,68,92,3	script	���҂̃I�[�N�]���r#34bi	3016,{}
1@dth3.gat,72,92,3	script	���҂̃I�[�N�]���r#35bi	3016,{}
1@dth3.gat,74,92,3	script	���҂̃I�[�N�]���r#36bi	3016,{}
1@dth3.gat,76,92,3	script	���҂̃I�[�N�]���r#37bi	3016,{}
1@dth3.gat,78,92,3	script	���҂̃I�[�N�]���r#38bi	3016,{}

1@dth3.gat,72,74,3	script	�W�F�C�X#bios3	467,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 10) {
		mes "[�W�F�C�X]";
		mes "�c�c�������������B";
		mes "�������Ő[���̂悤���B";
		close;
	}
	if('@flag < 30) {
		mes "[�W�F�C�X]";
		mes "�����A�̂��c�c�B";
		close;
	}
	mes "[�W�F�C�X]";
	mes "�c�c�ǂ���牴�����́A";
	mes "�����̗͂��ߐM���Ă����悤���B";
	next;
	mes "[�W�F�C�X]";
	mes "�c�c�������Ŗ��E����������B";
	mes "���肪�Ƃ��B";
	close;
}
1@dth3.gat,70,67,3	script	���_�A���N#bios3	3029,{}
1@dth3.gat,64,74,5	script	�u���h#bios3	468,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 10) {
		if(getnpctimer(1)) {
			mes "[�u���h]";
			mes "�����ł悩�����B";
			mes "�������Ő[���̂悤����";
			mes "���̎��_�̎p�������Ȃ��ȁB";
			close;
		}
		if(checkquest(201720)) {
			if(select("����}��","��b������") ==1) {
				donpcevent getmdnpcname("#bios3_talkshow")+ "::OnStart";
				close;
			}
		}
		initnpctimer;
		close;
	}
	if('@flag < 30) {
		mes "[�u���h]";
		mes "�����A�̂��c�c�I";
		mes "�����܂Łc�c�Ȃ̂��c�c�I";
		close;
	}
	mes "[�u���h]";
	mes "���܂Ȃ��ȁA����������B";
	mes "���������ŏE��������";
	mes "^ff0000�E�҂̏�^000000��";
	mes "�N�ɂ������������A�C�e�����B";
	mes "����󂯎���Ă���B";
	next;
	mes "[�u���h]";
	mes "�����A�������̋C���̈����ꏊ����";
	mes "�o�悤��!!";
	close2;
	if(checkitemblank() == 0) {
		mes "�]�A�C�e���̎�ސ���������";
		mes "�@�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���󂯎�낤�]";
		close;
	}
	if(checkquest(96430) & 0x4) {
		compquest 96430;
		if(BaseLevel < 160) {
			set '@base,7500000 + 500000 * 'users;
			if('users >= 12) set '@base,'@base + 500000;
		}
		else {
			set '@base,20000000 + 2000000 * 'users;
			if('users >= 12) set '@base,'@base + 2000000;
		}
		set '@job,3000000 + 200000 * 'users;
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
	if(checkquest(116513)==0) {
		setquest 116513;
		compquest 116513;
	}
	if(checkquest(96430) & 0x8)
		getitem 6684, 1;
	if(checkquest(201720)==0)
		setquest 201720;
	if(BIOS_1QUE==0)
		set BIOS_1QUE,'users;
	warp "moro_cav.gat",45,63;
	end;
OnTimer1000:
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �����A�N�����������B";
	end;
OnTimer4000:
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �C�ɂȂ�ȁc�c�B";
	end;
OnTimer7000:
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : ��H�@�ǂ������W�F�C�X�H";
	end;
OnTimer10000:
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �����X�^�[���A�������������Ă����B����ɁA��������ɈÂ��Ȃ��Ă��Ă���B";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : ���Ԃ̌o�߂����������B�A���N�������Ă������Ɖ����֌W������̂��c�c�B";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �m���Ɂc�c�I";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �x�����K�v���B";
	end;
OnTimer22000:
	hideoffnpc getmdnpcname("���_�A���N#bios3");
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �N�N�N�N�c�c�B";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �o���ȋM�l�b�I�@�������Ƃ������֗����I";
	end;
OnTimer28000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����A�����͎����J�鐶�̐��E�B";
	end;
OnTimer31000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����N�l�͎����}���A���_�ւƓ]���Ȃ���ׂ��т�~���Ă���̂ł��B";
	end;
OnTimer34000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����N�l���~�����тƂ͉����c�c�C�ɂȂ�܂����H";
	end;
OnTimer37000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �N�N�N�c�c�o�ł�I�@���̕����B��I";
	misceffect 35,getmdnpcname("���_�A���N#bios3");
	end;
OnTimer40000:
	for(set '@i,1; '@i<=3; set '@i,'@i+1) {
		for(set '@j,1; '@j<=8; set '@j,'@j+1)
			hideoffnpc getmdnpcname("���҂̃I�[�N�]���r#"+ '@i + '@j +"bi");
	}
	end;
OnTimer43000:
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : ����͂����I�@�����[�̑���Ȃǂ��Ă����邩�I";
	end;
OnTimer46000:
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �������ڂ��O��|���Ă��I";
	end;
OnTimer49000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �N�N�N�B�А����ǂ��ł��ˁB�������c�c�c�O�Ȃ��炨�ʂ�̎��Ԃł��B";
	end;
OnTimer52000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���̐g�Ɏ���������鋰�|���c�c�Ƃ��Ɩ��킢�Ȃ����I";
	end;
OnTimer55000:
	misceffect 89,getmdnpcname("���_�A���N#bios3");
	misceffect 134,getmdnpcname("�W�F�C�X#bios3");
	misceffect 134,getmdnpcname("�u���h#bios3");
	misceffect 51,getmdnpcname("�W�F�C�X#bios3");
	misceffect 51,getmdnpcname("�u���h#bios3");
	setnpcdisplay getmdnpcname("�u���h#bios3"),10036;
	setnpcdisplay getmdnpcname("�W�F�C�X#bios3"),10035;
	hideoffnpc getmdnpcname("freeze#bios3");
	set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
	end;
OnTimer58000:
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �Ȃ��A�Ȃ�!?�@�̂��c�c�̂������Ȃ�?!";
	end;
OnTimer61000:
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �c�c!!�@�̂��c�c�I";
	end;
OnTimer64000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �ǂ��ł����C���́B�N�N�N�N�N�B";
	end;
OnTimer67000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����܂ł��Ȃ��B�͎��̕����B���}���ɐ�������p�������ł��傤�B";
	end;
OnTimer70000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����Ȃ����A�������ɂ��镔���B���B";
	end;
OnTimer73000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �ނ�͎����}���A���̍��̓����N�l���]������ׂ��тƂȂ�̂ł��B";
	end;
OnTimer76000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���₨��A���̏p�������Ƃ́c�c�v���������悤�ł��ˁB";
	end;
OnTimer79000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �܂��A�����ł��傤�B���́c�c���Ȃ��B�̔Ԃł��B";
	end;
OnTimer82000:
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ����ł́A�����Ȗ`���җl�B���{�ւ̗��H�ɗJ�������悤�c�c�B�N�N�N�B";
	hideonnpc getmdnpcname("freeze#bios3");
	end;
OnTimer85000:
	stopnpctimer;
	for(set '@i,1; '@i<=3; set '@i,'@i+1) {
		for(set '@j,1; '@j<=8; set '@j,'@j+1)
			hideonnpc getmdnpcname("���҂̃I�[�N�]���r#"+ '@i + '@j +"bi");
	}
	hideonnpc getmdnpcname("���_�A���N#bios3");
	donpcevent getmdnpcname("#bios3_mobdead")+ "::OnStart";
	end;
}
1@dth3.gat,66,72,0	script	#bios3_mobdead	139,{
OnStart:
	set '@mdmap$,getmdmapname("1@dth3.gat");
	set '@mdnpc$,getmdnpcname("#bios3_mobdead")+ "::OnKilled1";
	for(set '@y,80;'@y<=92;set '@y,'@y+6) {
		for(set '@x,62;'@x<=78;set '@x,'@x+2) {
			if('@x != 70)
				monster '@mdmap$,'@x,'@y,"���҂̃I�[�N�]���r",3016,1,'@mdnpc$;
		}
	}
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@dth3.gat"),getmdnpcname("#bios3_mobdead")+ "::OnKilled1");
	if('@count > 0) end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �����ȁI�@�S���|�����̂��H";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �܂����c�c�C��t����I";
	sleep 1000;
	set '@mdmap$,getmdmapname("1@dth3.gat");
	set '@mdnpc$,getmdnpcname("#bios3_mobdead")+ "::OnKilled2";
	for(set '@y,80;'@y<=92;set '@y,'@y+6) {
		for(set '@x,62;'@x<=78;set '@x,'@x+2) {
			if('@x != 70)
				monster '@mdmap$,'@x,'@y,"���҂̃x���b�g",3017,1,'@mdnpc$;
		}
	}
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@dth3.gat"),getmdnpcname("#bios3_mobdead")+ "::OnKilled2");
	if('@count > 0) end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : ���x�����S���|�����񂾂�ȁH";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �c�O�Ȃ���܂��̂悤���c�c�I";
	sleep 1000;
	set '@mdmap$,getmdmapname("1@dth3.gat");
	set '@mdnpc$,getmdnpcname("#bios3_mobdead")+ "::OnKilled3";
	for(set '@y,80;'@y<=92;set '@y,'@y+6) {
		for(set '@x,62;'@x<=78;set '@x,'@x+2) {
			if('@x != 70)
				monster '@mdmap$,'@x,'@y,"���҂̃��K���h��",3018,1,'@mdnpc$;
		}
	}
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@dth3.gat"),getmdnpcname("#bios3_mobdead")+ "::OnKilled3");
	if('@count > 0) end;
	//hideonnpc "#bios3_mobdead";
	hideoffnpc getmdnpcname("���_�A���N#bios3");
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag == 13) {
		hideoffnpc getmdnpcname("�i�ߊ��A�W�t#bios3");
		hideoffnpc getmdnpcname("�������C�O���h#bios3");
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios3")),"�A�W�t : �悤�₭�ǂ��������A���O�疳�����I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#bios3")),"�C�O���h : �������ƕЕt���悤���I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios3")),"�A�W�t : �����������������I";
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#bios3")),"�C�O���h : �͂��������������I";
		misceffect 12,getmdnpcname("�i�ߊ��A�W�t#bios3");
		misceffect 12,getmdnpcname("�������C�O���h#bios3");
		sleep 1500;
		misceffect 226,getmdnpcname("���_�A���N#bios3");
		misceffect 245,getmdnpcname("���_�A���N#bios3");
		sleep 3000;
		announce "�]���_�A���N�̗̑͂��傫�����������]", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����c�c�܂����A���̎��Ɏ菝�𕉂킹��Ƃ́c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����ł��ˁc�c���Ȃ����ɂ͂��������̂͂������ł��傤�B";
		sleep 3000;
		misceffect 23,getmdnpcname("�i�ߊ��A�W�t#bios3");
		misceffect 23,getmdnpcname("�������C�O���h#bios3");
		set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�i�ߊ��A�W�t#bios3")),"�A�W�t : �̂������Ȃ�!?�@���A�����c�c�I";
		sleep 1000;
		unittalk getnpcid(0,getmdnpcname("�������C�O���h#bios3")),"�C�O���h : �̂��c�c�΂ɁI";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �N�N�N�A������ʐ΂ƂȂ�A�Ȃ̖��͂��i���ɒQ�������Ȃ����B";
		sleep 4000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���āA�����̖`���҂̂��Ȃ��B";
	}
	else if('@flag == 14) {
		hideoffnpc getmdnpcname("�L�h#bios3");
		hideoffnpc getmdnpcname("���[��#bios3");
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�L�h#bios3")),"�L�h : �x���Ȃ��Ă��܂Ȃ��I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���[��#bios3")),"���[�� : �L�h�A�s����I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�L�h#bios3")),"�L�h : �����������������I";
		unittalk getnpcid(0,getmdnpcname("���[��#bios3")),"���[�� : �͂��������������I";
		misceffect 12,getmdnpcname("�L�h#bios3");
		misceffect 12,getmdnpcname("���[��#bios3");
		sleep 3000;
		announce "�]���_�A���N�̗̑͂��傫�����������]", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����c�c�܂����A���̎��Ɏ菝�𕉂킹��Ƃ́c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����ł��ˁc�c���Ȃ����ɂ͂��������̂͂������ł��傤�B";
		sleep 3000;
		misceffect 23,getmdnpcname("�L�h#bios3");
		misceffect 23,getmdnpcname("���[��#bios3");
		set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�L�h#bios3")),"�L�h : ���A�̂��΂Ɂc�c�I�@���[���I�@���v��!?";
		sleep 1000;
		unittalk getnpcid(0,getmdnpcname("���[��#bios3")),"���[�� : �����c�c�����c�c�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �N�N�N�A������ʐ΂ƂȂ�A�Ȃ̖��͂��i���ɒQ�������Ȃ����B";
		sleep 4000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���āA�����̖`���҂̂��Ȃ��B";
	}
	else if('@flag == 15) {
		announce "�Z���U�� : �H�炦���������������I", 0x9, 0xffff00;
		sleep 3000;
		misceffect 106,getmdnpcname("���_�A���N#bios3");
		misceffect 107,getmdnpcname("���_�A���N#bios3");
		set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
		sleep 3000;
		announce "�]���_�A���N�̗̑͂��傫�����������]", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����c�c��̉����ł����I";
		sleep 3000;
		announce "�w���W�k : ���A�������I", 0x9, 0xffff00;
		sleep 3000;
		announce "�����[�X�� : �������h�����X����ɍ���Ă�������A�V�^����I", 0x9, 0xffff00;
		sleep 3000;
		announce "�q���[ : �h�����X���Α�^�����X�^�[���e�������H", 0x9, 0xffff00;
		sleep 3000;
		announce "�Z���U�� : �����I�@���̂����ɓ����܂���I", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ����Ă���܂����ˁc�c�܂������ł��傤�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���̕������͌�ł������菈������Ƃ��܂��B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���āA�����̖`���҂̂��Ȃ��B";
	}
	else if('@flag == 16) {
		hideoffnpc getmdnpcname("�q�V�G#bios3");
		hideoffnpc getmdnpcname("�G�C���@���g#bios3");
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios3")),"�q�V�G : �悵�A�ǂ��ɂ��Ԃɍ������݂������ȁB";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�G�C���@���g#bios3")),"�G�C���@���g : �܂��Еt���ĂȂ������̂��B�c�c�܂������A���̗͂������Ă�낤�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios3")),"�q�V�G : �����������������I";
		unittalk getnpcid(0,getmdnpcname("�G�C���@���g#bios3")),"�G�C���@���g : �͂��������������I";
		misceffect 12,getmdnpcname("�q�V�G#bios3");
		misceffect 12,getmdnpcname("�G�C���@���g#bios3");
		sleep 1500;
		misceffect 30,getmdnpcname("���_�A���N#bios3");
		misceffect 89,getmdnpcname("���_�A���N#bios3");
		sleep 3000;
		announce "�]���_�A���N�̗̑͂��傫�����������]", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����c�c�܂����A���̎��Ɏ菝�𕉂킹��Ƃ́c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����ł��ˁc�c���Ȃ����ɂ͂��������̂͂������ł��傤�B";
		sleep 3000;
		misceffect 23,getmdnpcname("�q�V�G#bios3");
		misceffect 23,getmdnpcname("�G�C���@���g#bios3");
		set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�q�V�G#bios3")),"�q�V�G : �̂������Ȃ��c�c!?�@���A�����c�c�B";
		sleep 1000;
		unittalk getnpcid(0,getmdnpcname("�G�C���@���g#bios3")),"�G�C���@���g : �����A�Ή����c�c���������^�����c�c�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �N�N�N�A������ʐ΂ƂȂ�A�Ȃ̖��͂��i���ɒQ�������Ȃ����B";
		sleep 4000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���āA�����̖`���҂̂��Ȃ��B";
	}
	else if('@flag == 17) {
		hideoffnpc getmdnpcname("��b�w�X�����^#bios3");
		hideoffnpc getmdnpcname("�攭�����A�o�����`�F#b3");
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios3")),"�w�X�����^ : �݂Ȃ���A�������ł�����!?";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�攭�����A�o�����`�F#b3")),"�A�o�����`�F : �攭�����A�o�����`�F�A�Q��܂��I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios3")),"�w�X�����^ : �͂��������������I";
		unittalk getnpcid(0,getmdnpcname("�攭�����A�o�����`�F#b3")),"�A�o�����`�F : �ʂ��������������I";
		misceffect 12,getmdnpcname("��b�w�X�����^#bios3");
		misceffect 12,getmdnpcname("�攭�����A�o�����`�F#b3");
		sleep 1500;
		misceffect 17,getmdnpcname("���_�A���N#bios3");
		misceffect 79,getmdnpcname("���_�A���N#bios3");
		sleep 3000;
		announce "�]���_�A���N�̗̑͂��傫�����������]", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����c�c�܂����A���̎��Ɏ菝�𕉂킹��Ƃ́c�c�B";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����ł��ˁc�c���Ȃ����ɂ͂��������̂͂������ł��傤�B";
		sleep 1000;
		misceffect 23,getmdnpcname("��b�w�X�����^#bios3");
		misceffect 23,getmdnpcname("�攭�����A�o�����`�F#b3");
		set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("��b�w�X�����^#bios3")),"�w�X�����^ : �̂��΂Ɂc�c!?�@���܂Łc�c�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("�攭�����A�o�����`�F#b3")),"�A�o�����`�F : �a�̐i�s�c�c�H�@����A��c�c�I";
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �N�N�N�A������ʐ΂ƂȂ�A�Ȃ̖��͂��i���ɒQ�������Ȃ����B";
		sleep 4000;
		unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���āA�����̖`���҂̂��Ȃ��B";
	}
	else
		set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���Ȃ��͋v���Ԃ�Ɋy���߂����ȕ��ł��ˁB";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ���ʂɁA�������ڂ����肵�܂��傤!!";
	sleep 1500;
	hideonnpc getmdnpcname("���_�A���N#bios3");
	set 'mob_id,callmonster(getmdmapname("1@dth3.gat"),70,67,"���_�A���N",3029,getmdnpcname("#bios3_mobdead")+ "::OnBossKilled");
	if('@flag >= 13) {
		set '@mobhp,getmobhp('mob_id);
		set '@mobhp,'@mobhp - ('@mobhp * 20 / 100);
		setmobhp 'mob_id,'@mobhp;
	}
	donpcevent getmdnpcname("talkshow#bios3")+ "::OnStart";
	end;
OnBossKilled:
	stopnpctimer getmdnpcname("talkshow#bios3");
	sleep 1500;
	hideoffnpc getmdnpcname("���_�A���N#bios3");
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����c�c�Ȃ�قǁB�l�Ԃɂ́c�c�����҂�����̂ł��ˁB";
	sleep 2000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �������c�c����ŏI��肾�Ǝv��Ȃ����������ł���B";
	sleep 1000;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : �����N�l�̕����͖ڂ̑O�܂ŗ��Ă���̂ł�!!�@�N�N�N�c�c!!";
	sleep 2000;
	hideonnpc getmdnpcname("���_�A���N#bios3");
	misceffect 135, getmdnpcname("�u���h#bios3");
	misceffect 135, getmdnpcname("�W�F�C�X#bios3");
	setnpcdisplay getmdnpcname("�u���h#bios3"),468;
	setnpcdisplay getmdnpcname("�W�F�C�X#bios3"),467;
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �c�c����!!�@����Ƒ̂��I";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �����c�c�B";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �ӂ��c�c���̎��_�̖��͎͂��ƃW�F�C�X�ł͑����ł��ł��Ȃ��قǋ��͂������B";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : �N�����Ȃ���Ή����ł��Ȃ��܂܂���Ă������낤�B";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : ���ӂ̋C�����Ƃ��ēn��������������B�󂯎�鏀�����o������b�������Ă���B";
	set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),30;
	set getvariableofnpc('users,getmdnpcname("�u���h#bios3")),getmapusers(getmdmapname("1@dth3.gat"));
	end;
}
1@dth3.gat,66,72,0	script	#bios3_talkshow	139,{
OnStart:
	setnpcdisplay getmdnpcname("�W�F�C�X#bios3"),10035;
	setnpcdisplay getmdnpcname("�u���h#bios3"),10036;
	hideoffnpc getmdnpcname("���_�A���N#bios3");
	set getvariableofnpc('flag,getmdnpcname("�u���h#bios1")),getvariableofnpc('flag,getmdnpcname("�u���h#bios1")) + 10;
	sleep 1500;
	unittalk getnpcid(0,getmdnpcname("���_�A���N#bios3")),"���_�A���N : ����ł́A�����Ȗ`���җl�B���{�ւ̗��H�ɗJ�������悤�c�c�B�N�N�N�B";
	sleep 3000;
	hideonnpc getmdnpcname("���_�A���N#bios3");
	donpcevent getmdnpcname("#bios3_mobdead")+ "::OnStart";
	end;
}
1@dth3.gat,66,72,5	script	�i�ߊ��A�W�t#bios3	459,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 20) {
		cutin "ep13_captin_edq.bmp", 2;
		mes "[�A�W�t]";
		mes "�C�O���h�I";
		mes "��C�ɏ��������߂邼�I";
		close2;
		cutin "ep13_captin_edq.bmp", 255;
		end;
	}
	if('@flag < 30) {
		mes "�]�A�W�t�͐Ή����Ă���]";
		close;
	}
	cutin "ep13_captin_edq.bmp", 2;
	mes "[�A�W�t]";
	mes "�i�ߊ��̎d������������";
	mes "�r���݂����܂������c�c�B";
	next;
	mes "[�A�W�t]";
	mes "���������͂����܂ł݂������B";
	mes "�i�ߊ��������ԁA���_�𗯎��";
	mes "����킯�ɂ������Ȃ����ȁB";
	next;
	mes "[�A�W�t]";
	mes strcharinfo(0)+ "�B";
	mes "���Ƃ͔C�������B";
	mes "��������P�����Ă����B";
	close2;
	cutin "ep13_captin_edq.bmp", 255;
	end;
}
1@dth3.gat,66,72,5	script	�L�h#bios3	884,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 10) {
		cutin "moc2_kid02.bmp", 2;
		mes "[�L�h]";
		mes "����ȂƂ����";
		mes "�����~�܂��Ă��邩�I";
		mes "���̈ꌂ��H�炦�I";
		close2;
		cutin "moc2_kid05.bmp", 255;
		end;
	}
	if('@flag < 30) {
		mes "�]�L�h�͐Ή����Ă���]";
		close;
	}
	cutin "moc2_kid03.bmp", 2;
	mes "[�L�h]";
	mes "���܂Ȃ��c�c�B";
	mes "��������肪";
	mes "�t�ɏ������Ă��܂����ȁB";
	next;
	mes "[�L�h]";
	mes "���[��������������݂�����";
	mes "����ȏ�̓��s�͓���炵���c�c";
	mes "�I�������ł��ꏏ�ɂ������";
	mes "�����񂾂��ǁc�c�B";
	next;
	cutin "moc2_kid05.bmp", 2;
	mes "[�L�h]";
	mes "�Ƃɂ����A����͏��������B";
	mes "�{���ɂ��肪�Ƃ��B";
	close2;
	cutin "moc2_kid05.bmp", 255;
	end;
}
1@dth3.gat,66,72,5	script	�q�V�G#bios3	623,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 20) {
		cutin "hisie01.bmp", 2;
		mes "[�q�V�G]";
		mes "���̓J���ׂ̈ɂ�";
		mes "����}���Ȃ���Ȃ�Ȃ��I";
		mes "�������A�ꌂ�ŏI��点��I";
		close2;
		cutin "hisie01.bmp", 255;
		end;
	}
	if('@flag < 30) {
		mes "�]�q�V�G�͐Ή����Ă���]";
		close2;
		cutin "hisie01.bmp", 255;
		end;
	}
	cutin "hisie01.bmp", 2;
	mes "[�q�V�G]";
	mes "���肪�Ƃ��B";
	mes "����������B";
	next;
	mes "[�q�V�G]";
	mes "�������A�G�̖{���n�B";
	mes "�育�킢�G�΂��肾�c�c�B";
	next;
	mes "[�q�V�G]";
	mes "�����A�������Ă�Ԃɂ�";
	mes "�J���͊撣���Ă���񂾁B";
	mes "��C�ɂȂ�����_�����ȁB";
	next;
	mes "[�q�V�G]";
	mes "�A���҂݂�Ȃׂ̈ɂ�";
	mes "����}�����B";
	close2;
	cutin "hisie01.bmp", 255;
	end;
}
1@dth3.gat,66,72,5	script	��b�w�X�����^#bios3	451,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 20) {
		cutin "ep13_heslanta.bmp", 2;
		mes "[�w�X�����^]";
		mes "�T�t�@�̖��̂��߁A";
		mes "�Q��܂��I";
		close2;
		cutin "ep13_heslanta.bmp", 255;
		end;
	}
	if('@flag < 30) {
		mes "�]�w�X�����^�͐Ή����Ă���]";
		close;
	}
	cutin "ep13_heslanta.bmp", 2;
	mes "[�w�X�����^]";
	mes "�����c�c�B";
	mes "��͂莄�ł͕͗s���ł������B";
	next;
	mes "[�w�X�����^]";
	mes "�߂ނ𓾂܂���B";
	mes "���͖߂鎖�ɂ��܂��B";
	mes "����ȏ�́A����܂Ƃ���";
	mes "�Ȃ肩�˂܂��񂩂�c�c�B";
	next;
	mes "[�w�X�����^]";
	mes "���ꂩ���́A����Ɍ�����";
	mes "�킢�ƂȂ�ł��傤�B";
	mes "�ǂ����A���C�����āB";
	close2;
	cutin "ep13_heslanta.bmp", 255;
	end;
}
1@dth3.gat,70,72,3	script	�������C�O���h#bios3	751,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 20) {
		mes "[�C�O���h]";
		mes "�ɒB�ɗb���͂���ĂȂ����I";
		mes "���̈ꌂ�A�H�炢�ȁI";
		close;
	}
	if('@flag < 30) {
		mes "�]�C�O���h�͐Ή����Ă���]";
		close;
	}
	mes "[�C�O���h]";
	mes "�ǂ����Z�M�́B";
	mes "���_�ɖ߂�炵���ȁB";
	next;
	mes "[�C�O���h]";
	mes "�����H";
	mes "���͂����������ꏏ�ɍs�����B";
	mes "���̎��_�������Ă����Ȃ����ȁB";
	next;
	mes "[�C�O���h]";
	mes "�Z�M�̕�����������키����";
	mes "����ɂ��Ă����ȁI";
	close;
}
1@dth3.gat,70,72,3	script	���[��#bios3	885,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 20) {
		cutin "moc2_rin01.bmp", 2;
		mes "[���[��]";
		mes "�������āA�킦��̂�I";
		mes "�L�h�A�s����I";
		close2;
		cutin "moc2_rin03.bmp", 255;
		end;
	}
	if('@flag < 30) {
		mes "�]���[���͐Ή����Ă���]";
		close;
	}
	cutin "moc2_rin03.bmp", 2;
	mes "[���[��]";
	mes "�ɂ��B";
	mes "�܂����A���������Ȃ��";
	mes "�P��������Ȃ��������ȁB";
	next;
	mes "[���[��]";
	mes "���͈�U�߂鎖�ɂ����B";
	mes "�ꏏ�ɍs���Ȃ��Ă��߂�ˁB";
	close2;
	cutin "moc2_rin03.bmp", 255;
	end;
}
1@dth3.gat,70,72,3	script	�G�C���@���g#bios3	618,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 20) {
		cutin "avant01.bmp", 2;
		mes "[�G�C���@���g]";
		mes "�M�l��́c�c";
		mes "�M�l��̂����Ŏ��́I";
		close2;
		cutin "avant01.bmp", 255;
		end;
	}
	if('@flag < 30) {
		mes "�]�G�C���@���g�͐Ή����Ă���]";
		close2;
		cutin "avant01.bmp", 255;
		end;
	}
	cutin "avant01.bmp", 2;
	mes "[�G�C���@���g]";
	mes "�r���͋��Ƃ͂���";
	mes "�����܂ŃR�P�ɂ����Ƃ͂ȁc�c";
	mes "�܂������A�����������B";
	next;
	mes "[�G�C���@���g]";
	mes "���͈�U�߂邱�Ƃɂ��悤�B";
	mes "����ł��ɂł͂Ȃ��̂łˁB";
	next;
	cutin "avant02.bmp", 2;
	mes "[�G�C���@���g]";
	mes "�N���v�������A����Ă���Ɨǂ��B";
	mes "�����|��Ă��܂����Ƃ��Ă�";
	mes "���̎����ޗ��Ƃ���";
	mes "�𗧂���ȁA�N�N�N�B";
	close2;
	cutin "avant01.bmp", 255;
	end;
}
1@dth3.gat,70,72,3	script	�攭�����A�o�����`�F#b3	450,{
	set '@flag,getvariableofnpc('flag,getmdnpcname("�u���h#bios1"));
	if('@flag < 20) {
		mes "[�A�o�����`�F]";
		mes "�w�X�����^�l�ɂ�";
		mes "�w��{�G�ꂳ���񂼁I";
		close;
	}
	if('@flag < 30) {
		mes "�]�A�o�����`�F�͐Ή����Ă���]";
		close;
	}
	mes "[�A�o�����`�F]";
	mes "�����w�X�����^�l�̌�q�̈�";
	mes "��x�߂�܂��B";
	next;
	mes "[�A�o�����`�F]";
	mes "�Ō�܂ŏ��͂ł���";
	mes "�\���󂠂�܂���B";
	mes "�ǂ����A�����^���B";
	close;
}

1@dth3.gat,69,67,0	script	freeze#bios3	139,30,30,{
	sc_start SC_Freeze,17500,1;
	end;
}

1@dth3.gat,1,1,0	script	talkshow#bios3	139,{
OnStart:
	initnpctimer;
	set 'mob_id,getvariableofnpc('mob_id,getmdnpcname("#bios3_mobdead"));
	end;
OnTimer3000:
	initnpctimer;
	switch(rand(50)) {
	case 0:	unittalk 'mob_id,"���_�A���N : ���̋��|��������̂ł��c�c�B"; break;
	case 1: unittalk 'mob_id,"���_�A���N : �����N�l�̕�����������������܂���B"; break;
	case 2: unittalk 'mob_id,"���_�A���N : ���̒��x�̂��̂ł����H�@�l�Ԃ̗͂Ƃ����̂́c�c�B"; break;
	case 3: unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h : ��΂��c�c�̂��c�c�B"; break;
	case 4: unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h :  �����c�c���܂Ȃ��c�c���̗͂ɂ��Ȃ�Ȃ��c�c�B"; break;
	case 5: unittalk getnpcid(0,getmdnpcname("�u���h#bios3")),"�u���h :  �������̕��܂Ŋ撣���Ă���I"; break;
	case 6: unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �����c�c���̗͂͂���Ȃ��̂��c�c�B"; break;
	case 7: unittalk getnpcid(0,getmdnpcname("�W�F�C�X#bios3")),"�W�F�C�X : �c�c�댯�Ȋ���������B�������Z���g���o�����炻�̏ꂩ�痣���񂾁I"; break;
	}
	end;
}
