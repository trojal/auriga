//= Auriga Script ==============================================================
// Ragnarok Online Cursed Knight in Ghost Palace Script	by refis
//==============================================================================

dali02.gat,58,122,3	script	�D��S�����ȋR�m#cr	418,{
	mes "[�D��S�����ȋR�m]";
	mes "�߂��ɂ���߉q������";
	mes "���������߂�ꂽ��B";
	mes "�����ړ��@����ꂽ�Ƃ��ŁA";
	mes "�C�����Ăق����Ɨ��܂ꂽ��";
	mes "���ł͗͂ɂȂ�Ȃ������c�c�B";
	next;
	mes "[�D��S�����ȋR�m]";
	mes "�N���@�B�ɐ��ʂ��Ă�Ȃ�A";
	mes "�ނɋ��͂��Ă���Ă���B";
	mes "���������ނ����҂��A";
	mes "�����m�肽���񂾁B";
	mes "����������肻��������ˁB";
	close;
}

dali02.gat,46,135,5	script	�V�k#dk	846,{
	set '@f,countitem(6672);
	mes "[�V�k]";
	mes "�����v���͎��ɋ����͂����c�c�B";
	if('@f == 0) {
		mes "^ff0000�L���̌���^000000�������Ă�����";
		mes "���̏��Ɏ����Ă��Ȃ����B";
		mes "^ff0000���N�C�G������^000000��";
		mes "���B�����Ă����邼��B";
		close;
	}
	mes "�ނށH�@���Ȃ��c�c�B";
	mes "^ff0000�L���̌���^000000�������Ă���ȁB";
	mes "���ɓn���΂��̌��Ђ��g���āA";
	mes "���N�C�G�������ɐ��B�����Ă�낤�B";
	next;
	switch(select("���B����","�����𕷂�","��߂Ă���")) {
	case 1:
		break;
	case 2:
		mes "[�V�k]";
		mes "�L���̌��Ђ͎v���̉򂶂�B";
		mes "���̐�œ���o����";
		mes "���N�C�G��������";
		mes "�����v�����h������������B";
		next;
		mes "[�V�k]";
		mes "���̗͂��g����";
		mes "���̃��N�C�G��������";
		mes "�L���̌��Ђ�p���鎖��";
		mes "�����鐸�B�Ɠ������ʂ�";
		mes "���鎖���o����񂶂�B";
		next;
		mes "[�V�k]";
		mes "���B���������ꍇ��";
		mes "���B�������h��E����𑕔�������Ԃ�";
		mes "�L���̌��Ђ�p�ӂ���";
		mes "���ɘb�������Ȃ����B";
		mes "^ff0000�L���̌���1��1��^000000";
		mes "���B�����Ă�낤�B";
		next;
		mes "[�V�k]";
		mes "���̑��͒ʏ�̐��B�Ɠ��l����B";
		mes "^ff0000���B�Ɏ��s���Ă��܂���";
		mes "�������j�󂳂�Ă��܂�^000000�B";
		mes "�j�󂳂ꂽ������";
		mes "^ff00002�x�Ǝg���Ȃ��Ȃ�^000000����";
		mes "���ӂ���񂶂��B�ӂ��ӂ��ӂ��B";
		close;
	case 3:
		mes "[�V�k]";
		mes "���������B";
		close;
	}
	mes "[�V�k]";
	mes "�ǂ�𐸘B����񂶂�H";
	next;
	set '@menu,select(
			(getequipid(2)!=0? "^nItemID^" +getequipid(2): "��-[�������Ă��Ȃ�]"),
			(getequipid(3)!=0? "^nItemID^" +getequipid(3): "����-[�������Ă��Ȃ�]"),
			(getequipid(4)!=0? "^nItemID^" +getequipid(4): "�E��-[�������Ă��Ȃ�]"),
			(getequipid(5)!=0? "^nItemID^" +getequipid(5): "���ɂ����镨-[�������Ă��Ȃ�]"),
			(getequipid(6)!=0? "^nItemID^" +getequipid(6): "�C-[�������Ă��Ȃ�]"));
	set '@menu,'@menu+1;
	set '@refine,getequiprefinerycnt('@menu);
	switch(getequipid('@menu)) {
	case 0:
		mes "[�V�k]";
		mes "�ڂ��Ă���̂��H";
		mes "�����������Ă��Ȃ��悤���Ⴜ�B";
		close;
	case 1446:
	case 1499:
	case 1698:
	case 1840:
	case 1942:
	case 1998:
	case 2032:
	case 13458:
	case 15160:
	case 15161:
	case 16042:
	case 18136:
	case 20793:
	case 21022:
	case 22088:
	case 28013:
	case 28112:
	case 28711:
	case 28911:
		break;
	default:
		mes "[�V�k]";
		mes "����̓��N�C�G�������ł͖����B";
		mes "�����o����̂�";
		mes "���N�C�G��������������B";
		close;
	}
	if('@refine < 3 && '@f >= 4 - '@refine) {	// ���B�l��2�ȉ���+4�܂ł̕��̋L���̌��Ђ�����Ƃ�
		mes "[�V�k]";
		mes "���₨��A���̑����͂܂�";
		mes "���S�ɐ��B���\�݂������˂��B";
		mes "�����悩������";
		mes "^ff0000+4�܂ň�C�ɐ��B����^000000�����o���邯��";
		mes "�ǂ�����񂾂��H";
		next;
		switch(select("1�񂾂����B","��C�ɐ��B","��߂�")) {
		case 1:
			break;
		case 2:
			set '@num,4 - '@refine;
			mes "[�V�k]";
			mes "���Ȃ��̑����̐��B�l��^ff0000+" +'@refine+ "^000000���Ⴉ��";
			mes "^ff0000" +'@num+ "��^000000�A��C�ɐ��B���Ă����悤�B";
			mes "���B���Ă��������H";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�V�k]";
				mes "�������c�c�B";
				mes "�C���ς������";
				mes "�܂����Ă���B";
				close;
			}
			for(set '@j,0;'@j<'@num;set '@j,'@j+1)
				successrefitem '@menu;
			delitem 6672,'@num;
			mes "[�V�k]";
			mes "�����Ɋ��������悤����ȁB";
			mes "�ǂ������o�������B";
			close;
		case 3:
			mes "[�V�k]";
			mes "�������c�c�B";
			mes "�C���ς������";
			mes "�܂����Ă���B";
			close;
		}
	}
	if('@refine >= 4) {
		mes "[�V�k]";
		mes "�ق��B���̑����͊��ɂ��Ȃ�";
		mes "���B�����Ă���悤����ȁB";
		mes "���ꂩ����";
		mes "���������邩������Ȃ��B";
		mes "�����^ff00002�x�Ǝg���Ȃ��Ȃ邪^000000";
		mes "����ł��������ȁH";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�V�k]";
			mes "�������c�c�B";
			mes "�C���ς������";
			mes "�܂����Ă���B";
			close;
		}
	}
	delitem 6672,1;
	mes "[�V�k]";
	mes "����ł͍s������I";
	mes "�c�c�ӂ����I";
	if(getequippercentrefinery('@i) > rand(100)) {
		successrefitem '@menu;
		next;	// modif
		mes "[�V�k]";
		mes "�����Ɋ��������悤����ȁB";
		mes "�ǂ������o�������B";
		close;
	}
	else {
		failedrefitem '@menu;
		next;	// modif
		mes "[�V�k]";
		mes "�����c�c";
		mes "���s���Ă��܂����悤����B";
		mes "���܂Ȃ��̂��c�c�B";
		close;
	}
OnInit:
	waitingroom "���N�C�G���������B",0;
	end;
}

dali02.gat,43,129,5	script	�߉q��#dk	686,{
	if(BaseLevel < 100) {
		mes "[�߉q��]";
		mes "�c�c�N�́c�c";
		mes "���l���c�c�H";
		mes "���ɂ���N�́A�����̖��O��";
		mes "�Y�ꂽ��Ȃǂ��Ă��Ȃ�";
		mes "���낤�H";
		mes "�A�܂�����c�c�B";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�߉q��]";
		mes "����Ȏ��̘b�𕷂���";
		mes "�����̂��c�c�B";
		mes "�ڍׂ�b�������Ƃ��낾���A";
		mes "�N�͂܂��Ⴂ�悤���B";
		mes "���炭���̘b�𕷂����Ƃ����";
		mes "�����ł��Ȃ����낤�c�c�B";
		next;
		mes "[�߉q��]";
		mes "���܂Ȃ��A�������������Șb�Ȃ񂾁B";
		mes "����莄���g���A���f���Ă��邩��ˁB";
		mes "�@";
		mes "�]����ȏ�A�b�͕����Ȃ��悤���B";
		mes "�@^ff0000Base���x����100�ȏ�^000000�ɂ��Ă���";
		mes "�@�܂����Ă݂悤�c�c�]";
		close;
	}
	if(checkquest(114750) & 0x8 == 0) {
		mes "�]��l�̊Z�Őg���ł߂��j��";
		mes "�@����Ȋ�łȂɂ����Ԃ₢�Ă���]";
		next;
		mes "[�߉q��]";
		mes "���̋@�B�����߂āA�����Ă���΁c�c�B";
		mes "�N�����̋@�B�𒼂�����̂������";
		mes "�ǂ��̂����c�c�B";
		next;
		menu "����������",-;
		mes "[�߉q��]";
		mes "�c�c�N�́c�c!?";
		mes "�c�c�B";
		mes "�������A�`���҂��B";
		mes "�܂����Ƃ茾�𕷂����Ƃ�";
		mes "�p���������Ƃ����������";
		mes "���܂����ȁB";
		next;
		mes "�]��قǂ܂ł̗l�q���R�̂悤��";
		mes "�@�j�̊�ɐ��C���h�����B�]";
		next;
		mes "[�߉q��]";
		mes "�p���łɂ�����A";
		mes "�N�͂���^FF0000��ꂽ�����ړ��@^000000��";
		mes "�C�����邱�Ƃ͂ł��Ȃ����낤���H";
		mes "���炭���̋@�B�����A���̋L����";
		mes "�Ăі߂����߂ɕK�v�Ȃ��̂���";
		mes "�v���̂����c�c�B";
		next;
		menu "�L���c�c�H",-;
		mes "[�߉q��]";
		mes "���܂Ȃ��A�{���͎��ȏЉ��";
		mes "����ׂ��Ȃ̂��낤���A";
		mes "����^0000FF�L����������^000000����񂾁B";
		mes "�����̖��O�͂��납�A";
		mes "�ǂ����Ă����ɋ���̂��������g�A";
		mes "�܂������킩��Ȃ��񂾁B";
		next;
		mes "[�߉q��]";
		mes "�����A���̉�ꂽ�����ړ��@��";
		mes "�݂Ă���ƕs�ӂɋ��ɁA";
		mes "�悭�킩��Ȃ��ɂ݂�����񂾁c�c�B";
		mes "�����狰�炭���̎����ړ��@��";
		mes "�����L�����Ȃ��������R��";
		mes "����ɈႢ�Ȃ��Ǝv���ĂˁB";
		next;
		if(select("���ׂĂ݂܂��傤","�@�B�͋��Łc�c") == 2) {
			mes "[�߉q��]";
			mes "�������c�c�d���Ȃ��B";
			mes "�N�����̋@�B�ɂ���";
			mes "�ڂ����l�Ԃ��ʂ邱�Ƃ�";
			mes "�F���Ă������B";
			next;
			mes "[�߉q��]";
			mes "���܂Ȃ������B";
			mes "�b���o���������ł��ǂ������B";
			mes "���肪�Ƃ��B";
			close;
		}
		mes "[�߉q��]";
		mes "���肪�Ƃ��A�������I";
		mes "�ǂ������͂��̎�̂��̂�";
		mes "���炵���c�c�B";
		next;
		mes "^0000FF�]�����ړ��@�̑O�ɁA";
		mes "�@�A�v���V�A��";
		mes "�@���ƁA�����ړ��@���Ⴂ";
		mes "�@�N�����������Ȃ���";
		mes "�@�N�����n�߂��c�c�]^000000";
		next;
		mes "[�߉q��]";
		mes "�������ȌN�́c�c�I";
		mes "�������Ă��Ȃ��H�@����B";
		mes "���Ƃ��Ă����̋@�B���������̂�";
		mes "�N�����Ă��ꂽ���A���B";
		next;
		mes "[�߉q��]";
		mes "������������΂���̌N��";
		mes "���̂悤�Ȃ��Ƃ������̂�";
		mes "�S�ꂵ���̂����c�c�B";
		mes "�������̋@�B���g���b���̊ԁA";
		mes "�ꏏ�ɂ��Ă��炦�Ȃ����낤���H";
		next;
		mes "[�߉q��]";
		mes "�N�����Ȃ���΂��̋@�B��";
		mes "�����Ȃ��B�Ȃ�ΌN�ɂ��΂炭";
		mes "�ꏏ�ɂ��Ă��炢�A���͂Ȃ�ׂ�";
		mes "�����A�����̋L���̎肪�����";
		mes "��ɓ����悤�ɓw�߂�B";
		next;
		mes "[�߉q��]";
		mes "�c�c�ǂ����낤���H";
		mes "����ƋL���̎肪�����";
		mes "�Ȃ肻���Ȃ��̋@�B��";
		mes "�������񂾁c�c�B";
		mes "���̃`�����X���ǂ����Ă�";
		mes "���������Ȃ��񂾁B";
		next;
		if(select("�͂�݂�","�f��") == 2) {
			mes "[�߉q��]";
			mes "�c�c�������ȁA���܂Ȃ��B";
			mes "����ƋL���̎肪���肪";
			mes "���������Ɗ�сA";
			mes "�N�̓s�����l���Ă��Ȃ������B";
			next;
			mes "[�߉q��]";
			mes "���ɂ���N�����邱�Ƃ͕��������B";
			mes "��͉��Ƃ��A���̗͂ŋN������悤";
			mes "���s���낵�Ă݂悤�Ǝv���B";
			mes "�����܂łŁA�\�����B";
			mes "�{���ɂ��肪�Ƃ��B";
			close;
		}
		mes "[�߉q��]";
		mes "�{�����H";
		mes "�N�ɂ͂ǂ�قǊ��ӂ����Ă�";
		mes "����Ȃ��ȁB";
		mes "�{���ɏ������B";
		mes "";
		next;
		mes "[�߉q��]";
		mes "���āA�N�ɂ��������K�v���낤�B";
		mes "���̋@�B���g���������ł�����";
		mes "���ɘb�������Ă���邩�ȁH";
		setquest 114750;
		compquest 114750;
		close;
	}
	mes "[�߉q��]";
	mes "�N���c�c�B";
	mes "���ɉ����p�Ȃ̂��H";
	next;
	if(select("�����̋��Ԃ��J��","���ł��Ȃ�") == 2) {
		mes "[�߉q��]";
		mes "�������c�c�B";
		mes "�N�����悯���";
		mes "���̋L�������߂�";
		mes "��`�������Ă����Ə�����B";
		close;
	}
	if(checkquest(1261)) {
		if(checkquest(1261) & 0x2) {
			mes "[�߉q��]";
			mes "�ғ����邽�߂̃p���[��";
			mes "�\���A�[�d���ꂽ�悤���B";
			mes "����Ȃ�����A";
			mes "�N���͉\�Ȃ͂����B";
			delquest 1261;
			delquest 114760;
			close;
		}
		mes "[�߉q��]";
		mes "���͂܂��A�����ړ��@��";
		mes "�ғ����邽�߂̃p���[��";
		mes "����Ȃ��悤�Ȃ񂾁B";
		mes "���������҂��Ă���B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]^ff0000���ꂵ�Ă���1��ڂ̌ߑO5���ȍ~^000000";
		mes "�@����";
		mes "�@^ff0000�Ō�̓��ꂩ��1���Ԍo�ߌ�^000000";
		mes "�@�ɍēx����\�ɂȂ�܂��]";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�߉q��]";
		mes "�c�c���܂Ȃ��B";
		mes "�����ړ��@���܂��s�����";
		mes "���܂蕉�ׂ��������Ȃ��񂾁B";
		next;
		mes "[�߉q��]";
		mes "�C�����͂��肪�������A";
		mes "�����ړ��@�̋N����";
		mes "�p�[�e�B�[�ɏ������Ă���";
		mes "�p�[�e�B�[���[�_�[��";
		mes "���点�Ė���Ă���񂾁B";
		close;
	}
	mes "[�߉q��]";
	mes "���̋L�������߂����߂�";
	mes "���͂��Ă����̂��H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�߉q��]";
		mes "�������c�c�B";
		mes "���������͂ł��Ȃ�����ȁB";
		mes "����͒��߂�Ƃ��悤�B";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�߉q��]";
		mes "����A�N���o���Ȃ��悤���ȁB";
		mes "�����҂��Ă���B";
		close;
	}
	mdcreate "Cursed Knight";
	mes "[�߉q��]";
	mes "�����ړ��@���N�����������I";
	mes "�����𐮂��āA�܂��Ă��Ă���B";
	close;
OnInit:
	waitingroom "�􂢂̌��m",0;
	end;
}

dali02.gat,40,134,5	script	�����ړ��@	10007,{
	if(BaseLevel < 100) {
		mes "[�߉q��]";
		mes "�c�c�N�́c�c�B";
		mes "�ǂ����܂��܂��A";
		mes "�����i�K�ɂ���Ƃ���";
		mes "�������ˁB";
		next;
		mes "�]^ff0000BaseLv100�ȏォ��^000000";
		mes "�@�i�s�\�ł��]";
		close;
	}
	mes "�]�����ړ��@������]";
	next;
	if(select("����","��߂Ă���") == 2) {
		mes "[�߉q��]";
		mes "�������c�c�d���Ȃ��B";
		close;
	}
	if(checkquest(1261)) {
		if(checkquest(1261) & 0x2) {
			mes "^0000ff�]�􂢂̌��m�̓��ꐧ����";
			mes "�@��������܂����B";
			mes "�@�߉q����";
			mes "�@�b��i�߂Ă��������]^000000";
			delquest 1261;
			delquest 114760;
			delquest 114765;
			close;
		}
		mes "[�߉q��]";
		mes "���͂܂��A�����ړ��@��";
		mes "�ғ����邽�߂̃p���[��";
		mes "����Ȃ��悤�Ȃ񂾁B";
		mes "���������҂��Ă���B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]^ff0000���ꂵ�Ă���1��ڂ̌ߑO5���ȍ~^000000";
		mes "�@����";
		mes "�@^ff0000�Ō�̓��ꂩ��1���Ԍo�ߌ�^000000";
		mes "�@�ɍēx����\�ɂȂ�܂��]";
		close;
	}
	switch(mdenter("Cursed Knight")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[Cursed Knight] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		donpcevent getmdnpcname("#DK_Control1")+ "::OnStart";
		setquest 1261;
		setquest 114760;
		if(checkquest(114765)&0x8)
			delquest 114765;
		close2;
		//warp "1@spa.gat",42,196;
		end;
	case 1:	// �p�[�e�B�[������
		mes "�]�������A���_���W������";
		mes "�@���������p�[�e�B�[�̃����o�[�̂݁A";
		mes "�@�������A���_���W�����ɓ���܂��]";
		close;
	case 2:	// �_���W�������쐬
		mes "^ff0000�]�����̋��Ԃ���������Ă��܂���B";
		mes "�@�p�[�e�B�[���[�_�[��";
		mes "�@�������邱�Ƃ��ł��܂��]^000000";
		close;
	default:	// ���̑��G���[
		close;
	}
}

1@spa.gat,0,0,0	script	#DK_Control1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("�S��̉��{2�K");
	hideonnpc getmdnpcname("�S��̉��{3�K");
	hideonnpc getmdnpcname("�S��̉��{4�K");
	hideonnpc getmdnpcname("�S��̉��{5�K");
	hideonnpc getmdnpcname("�׍��̉��q#dk3");
	hideonnpc getmdnpcname("�߉q��#dk3");
	hideonnpc getmdnpcname("�����^���^�m�X#dkt");
	hideonnpc getmdnpcname("�􂢂̍���#dk");
	hideonnpc getmdnpcname("���Â��߂̒j#dk");
	hideonnpc getmdnpcname("#dk_tb");
	hideonnpc getmdnpcname("#dk_sv");
	hideonnpc getmdnpcname("#dk_tv");
	hideonnpc getmdnpcname("�S��̉��{�o��");
	hideonnpc getmdnpcname("����#dk11");

	donpcevent getmdnpcname("����#dk")+ "::OnStart";
	end;
}

1@spa.gat,42,201,1	script	�߉q��#dk	686,{
	mes "�]�����������Ȃ��c�c�B";
	mes "�@�܂�Ŏ����~�܂��Ă���悤��";
	mes "�@�������ɂ��Ȃ��c�c�]";
	close;
OnTalk1:
	unittalk "�߉q�� : ���肪�����K���B�c�c���̖��ɑウ�܂��Ă��K����P������肷�邱�Ƃ�É��ƁA���̌��ɐ����܂��傤�B";
	end;
OnTalk2:
	unittalk "�߉q�� : �c�c��ӂɂ������܂��A�É��B����H�@�Ȃɂ��O�����������悤�ł��ˁB�c�c!?�@���̓����͌��̓����c�c�B";
	end;
OnTalk3:
	unittalk "�߉q�� : �É�!!�@�������N���Ă��邱�Ƃ͎����̖͗l�c�c�����ɋ��Ă͊댯�ł�!!�@�ЂƂ܂��A�������ւ��߂肭������!!";
	end;
OnTalk4:
	unittalk "�߉q�� : ��ӁB�c�c�B�P�̎�����2�K�A�}���˂΁c�c�B�@�ޏ��ɂ������̂��Ƃ�����Ύ��́c�c�B";
	end;
}

1@spa.gat,41,207,4	script	���Â��߂̒j#dkf1	685,{
	mes "�]�S�g���Â��߂�";
	mes "�@�������̒j��";
	mes "�@�傫�Ȍ�������";
	mes "�@�ڂ̑O�̓�l��";
	mes "�@���₩�Ȗڂ�";
	mes "�@���߂Ă���c�c�]";
	close;
OnTalk1:
	unittalk "��̐� : �ق��c�c����͒������B�A��������A�A�C�c�͐������l�Ԃ̂悤�����B";
	end;
OnTalk2:
	unittalk "���Â��߂̒j : �l�Ԃ��Ɓc�c�H�@�ǂ����Ă����ɐl�Ԃ�����B";
	end;
OnTalk3:
	unittalk "��̐� : �܂��҂āB���̐l�Ԃ̎n���͂��ł��\�Ȃ񂾁B�����ł�K�v���Ȃ��B����Ɂc�c�ϋq�͑����ق��������B";
	end;
OnTalk4:
	unittalk "���Â��߂̒j : �c�c�����������Ƃ炵���B�Ȃ�΁A���O�ɋ����Ă�낤�B���̐��E�͂���j�̋L�����B�䂦�ɂ��O��������Ɋ����邱�Ƃ͏o���Ȃ��B";
	end;
OnTalk5:
	unittalk "���Â��߂̒j : �����ł��̃o�J�Ȓj�̓^�������͂���Ƃ����B�������A���ł��Ȃ��̂͂��̃o�J�Ȓj�ɂ������B";
	end;
OnTalk6:
	unittalk "���Â��߂̒j : �����X�^�[�ǂ��͂��O�Ɋ����邱�Ƃ��o����B���������E����Ȃ��悤�ɂ���񂾂ȁB�N�b�N�b�N�b�N�c�c�B";
	end;
OnTalk7:
	unittalk "��̐� : �l�Ԃ͑��l�̕s�K���D���炵������ȁc�c�B���������Ղ�z�����񂾍��ɂ܂��������Ȃ����B";
	end;
}

1@spa.gat,41,204,5	script	����#dk	965,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]��قǂ̋߉q����";
		mes "�@�����炵���l���Ɖ�b�����Ă���]";
		close;
	}
	stopnpctimer;
	mes "�]��قǂ̋߉q���������̂�";
	mes "�@���������悤�Ƃ����u�ԁc�c�]";
	next;
	if(checkquest(114755)&0x8) {
		if(select("��b���ȗ�����","��l�̉�b�𕷂�") == 1) {
			mes "�]���Ԃ��u���ɗ��ꂽ�̂��������]";
			close2;
			hideonnpc getmdnpcname("����#dk");
			hideonnpc getmdnpcname("�߉q��#dk");
			hideonnpc getmdnpcname("���Â��߂̒j#dkf1");
			donpcevent getmdnpcname("#DK_NPCTimer1")+ "::OnStart";
			misceffect 904,"";
			end;
		}
	}
	mes "[��̐�]";
	mes "�ق��c�c����͒������B";
	mes "�A��������A�A�C�c�͐�����";
	mes "�l�Ԃ̂悤�����B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk1";
	next;
	mes "[���Â��߂̒j]";
	mes "�l�Ԃ��Ɓc�c�H";
	mes "�ǂ����Ă����ɐl�Ԃ�����B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk2";
	next;
	mes "�]����Ȍ��t�Ƌ���";
	mes "�@���������������������ƁA";
	mes "�@�傫�Ȍ���������";
	mes "�@��l�̍��Â��߂̒j��";
	mes "�@����������߂Ă����]";
	cutin "sakray.bmp",2;
	next;
	cutin "sakray.bmp",255;
	mes "�]���������̂��낤�B";
	mes "�@���Â��߂̒j�̊�Ɛ���";
	mes "�@���o��������C�������B";
	mes "�@�ǂ����ŉ�����悤��";
	mes "�@�C������c�c�]";
	next;
	mes "[��̐�]";
	mes "�܂��҂āB";
	mes "���̐l�Ԃ̎n���͂��ł�";
	mes "�\�Ȃ񂾁B";
	mes "�����ł�K�v���Ȃ��B";
	mes "����Ɂc�c";
	mes "�ϋq�͑����ق��������B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk3";
	next;
	mes "�]���������ƂɁA���̐���";
	mes "�@^FF0000�ЁX�����C�����U���";
	mes "�@��^000000���畷�����Ă����c�c�]";
	cutin "tartanos.bmp",3;
	next;
	cutin "tartanos.bmp",255;
	cutin "sakray.bmp",2;
	mes "[���Â��߂̒j]";
	mes "�c�c�����������Ƃ炵���B";
	mes "�Ȃ�΁A���O�ɋ����Ă�낤�B";
	mes "���̐��E�͂���j�̋L�����B";
	mes "�䂦�ɂ��O���������";
	mes "�����邱�Ƃ͏o���Ȃ��B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk4";
	next;
	mes "[���Â��߂̒j]";
	mes "�����ł��̃o�J�Ȓj��";
	mes "�^�������͂���Ƃ����B";
	mes "�������A���ł��Ȃ��̂�";
	mes "���̃o�J�Ȓj�ɂ������B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk5";
	next;
	mes "[���Â��߂̒j]";
	mes "�����X�^�[�ǂ��͂��O��";
	mes "�����邱�Ƃ��o����B";
	mes "���������E����Ȃ��悤��";
	mes "����񂾂ȁB";
	mes "�N�b�N�b�N�b�N�c�c�B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk6";
	next;
	cutin "tartanos.bmp",3;
	mes "[��̐�]";
	mes "�l�Ԃ͑��l�̕s�K��";
	mes "�D���炵������ȁc�c�B";
	mes "���������Ղ�z������";
	mes "���ɂ܂��������Ȃ����B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk7";
	next;
	cutin "tartanos.bmp",255;
	misceffect 454,getmdnpcname("���Â��߂̒j#dkf1");
	hideonnpc getmdnpcname("���Â��߂̒j#dkf1");
	mes "�]�����Ēj�̎p���������r�[�A";
	mes "�@�~�܂��Ă�������";
	mes "�@�����o�����悤�Ȋ��o��";
	mes "�@�P��ꂽ�]";
	misceffect 454,"";
	next;
	mes "[����]";
	mes "���Ȃ����䂪���A�e�B�A���P��";
	mes "�����̋߉q���Ƃ��ĔC������B";
	mes "���Ȃ��̑�z�������p�ƒ����S��M���悤�B";
	mes "�P����낵�����ށB";
	unittalk "���� : ���Ȃ����䂪���A�e�B�A���P�̒����̋߉q���Ƃ��ĔC������B���Ȃ��̑�z�������p�ƒ����S��M���悤�B�P����낵�����ށB";
	next;
	mes "[�߉q��]";
	mes "���肪�����K���B";
	mes "�c�c���̖��ɑウ�܂��Ă�";
	mes "�K����P������肷�邱�Ƃ�";
	mes "�É��ƁA���̌��ɐ����܂��傤�B";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk1";
	next;
	mes "[����]";
	mes "�K���������A���̏��";
	mes "�K��Ă���׍��̉��q��";
	mes "�䂪���Ƃ̉��k���܂Ƃ܂����B";
	mes "���̉��k���܂Ƃ܂�΁A�킪����";
	mes "��������i�����ׂł��낤�B";
	unittalk "���� : �K���������A���̏��K��Ă���׍��̉��q�Ɖ䂪���Ƃ̉��k���܂Ƃ܂����B���̉��k���܂Ƃ܂�΁A�킪���͍�������i�����ׂł��낤�B";
	next;
	mes "[����]";
	mes "�������͂��̉��k��";
	mes "���܂���C�ł͂Ȃ��悤����";
	mes "�����ƕK����A�킩���Ă�������";
	mes "����ł��낤�B";
	mes "�ꍑ�̉����Ƃ��ĂȂ��ׂ�";
	mes "���Ƃ͉����Ƃ������Ƃ��c�c�B";
	unittalk "���� : �������͂��̉��k�ɂ��܂���C�ł͂Ȃ��悤���������ƕK����A�킩���Ă�����������ł��낤�B�ꍑ�̉����Ƃ��ĂȂ��ׂ����Ƃ͉����Ƃ������Ƃ��c�c�B";
	next;
	mes "[�߉q��]";
	mes "�c�c��ӂɂ������܂��A�É��B";
	mes "����H";
	mes "�Ȃɂ��O�����������悤�ł��ˁB";
	mes "�c�c!?�@���̓����͌��̓����c�c�B";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk2";
	next;
	mes "[����]";
	mes "���̉��́A�����̉��Ȃ̂�!?";
	mes "�ǂ������I�@�Ȃɂ��N�����Ă���̂�!?";
	mes "�N���񍐂�����̂��I";
	unittalk "���� : ���̉��́A�����̉��Ȃ̂�!?�@�ǂ������I�@�Ȃɂ��N�����Ă���̂�!?�@�N���񍐂�����̂��I";
	next;
	mes "[�߉q��]";
	mes "�É�!!";
	mes "�������N���Ă��邱�Ƃ�";
	mes "�����̖͗l�c�c";
	mes "�����ɋ��Ă͊댯�ł�!!";
	mes "�ЂƂ܂��A�������ւ��߂肭������!!";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk3";
	next;
	mes "�]�������������Â��߂̒j��";
	mes "�@�����Ă��������X�^�[�Ƃ���";
	mes "�@���t���]�����߂���B";
	mes "�@����̑����Ɖ���";
	mes "�@�֌W������̂��낤���c�c�H�]";
	next;
	mes "[����]";
	mes "���̂��Ƃ͐S�z�Ȃ��B";
	mes "����������Ȃ��́A�����c�c";
	mes "�e�B�A���P������Ă���Ă���!!";
	unittalk "���� : ���̂��Ƃ͐S�z�Ȃ��B����������Ȃ��́A�����c�c�e�B�A���P������Ă���Ă���!!";
	next;
	mes "[�߉q��]";
	mes "��ӁB";
	mes "�c�c�B";
	mes "�P�̎�����2�K�A�}���˂΁c�c�B";
	mes "�ޏ��ɂ������̂��Ƃ�����Ύ��́c�c�B";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk4";
	close2;
	hideonnpc getmdnpcname("����#dk");
	hideonnpc getmdnpcname("�߉q��#dk");
	donpcevent getmdnpcname("#DK_NPCTimer1")+ "::OnStart";
	misceffect 904,"";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("����#dk");
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer1	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�Ⴂ�j�̐� : �������c�c�B�e�B�A���P�̑��Ŕޏ�����邱�ƁB���ꂾ�������̍K���A���������������B",0x9,0x7cfc00,0x190,20,0,0;
	end;
OnTimer6000:
	announce "�Ⴂ�j�̐� : �������A�ˑR�̃����X�^�[�̏P���B���ꂪ�S�Ă̔ߌ��̎n�܂肾�����c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	end;
OnTimer9000:
	stopnpctimer;
	announce "�]���Ԃ����������悤�Ȋ��o�̌�A�k�ŉ������J���悤�ȉ��������]",0x9,0xffff00,0x190,20,0,0;
	misceffect 35,getmdnpcname("�S��̉��{2�K");
	hideoffnpc getmdnpcname("�S��̉��{2�K");
	donpcevent getmdnpcname("�߉q��#dk1")+ "::OnStart";
	end;
}

1@spa.gat,41,217,0	warp	�S��̉��{2�K	2,2,1@spa.gat,114,120

1@spa.gat,135,125,3	script	�e�B�A���P#dk	640,{
	mes "�]�������������Ȃ�ł���B";
	mes "�@�ǂ����R���Ɍ�����̂�";
	mes "�@�C�̂������낤���H�]";
	close;
OnTalk1:
	unittalk "�e�B�A���P : ���̏�Ƀ����X�^�[�����荞�񂾂ƁA�������畷���܂����c�c�B����ŁA�����l�͂������Ȃ̂ł��ˁH";
	end;
OnTalk2:
	unittalk "�e�B�A���P : �c�c���ɂƂ��Ĉ��S�ň��S�ȏꏊ�͈��������܂���B����͐̂���A�����ƕς���Ă͂���܂���c�c�B";
	end;
OnTalk3:
	unittalk "�e�B�A���P : �c�c���߂�Ȃ����B�����X�^�[������P���ȂǁA���܂łȂ��������Ƃ��N���������ł���ȗ\�����ʂ����Ȃ��̂ł��c�c�B�Ȃɂ��������Ƃ����������Łc�c�B";
	end;
OnTalk4:
	unittalk "�e�B�A���P : �����X�^�[�����̏���P�������R�͒肩�ł͂���܂���B�����Ă��̂悤�Ȏ��ɁA�M���ɂ��̂悤�Ȃ��Ƃ𕷂��͕̂s�ސT��������Ȃ��̂ł����c�c�B";
	end;
OnTalk5:
	unittalk "�e�B�A���P : �c�c�����������������B���Ȃ��ɂƂ��Ă����́A����m��Ȃ��׍��̓a���ƌ����̌_������킷���Ƃ��]�݂Ȃ̂ł��傤���c�c�B���́c�c�B���̖]�݂͂��Ȃ��Ɓc�c�B";
	end;
}

1@spa.gat,132,122,7	script	�߉q��#dk1	686,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�߉q��]";
		mes "�c�c�P�l�A�������łȂɂ��ł��B";
		close;
	}
	stopnpctimer;
	mes "[�߉q��]";
	mes "�c�c�P�l�A�������łȂɂ��ł��B";
	unittalk "�߉q�� : �c�c�P�l�A�������łȂɂ��ł��B";
	next;
	if(checkquest(114755)&0x8) {
		if(select("�}��","��l�̉�b�𕷂�") == 1) {
			mes "�]���Ԃ��u���ɗ��ꂽ�̂��������]";
			close2;
			hideonnpc getmdnpcname("�߉q��#dk1");
			hideonnpc getmdnpcname("�e�B�A���P#dk");
			donpcevent getmdnpcname("#DK_NPCTimer2")+ "::OnStart";
			misceffect 904,"";
			end;
		}
	}
	mes "[�e�B�A���P]";
	mes "���̏�Ƀ����X�^�[�����荞�񂾂ƁA";
	mes "�������畷���܂����c�c�B";
	mes "����ŁA�����l�͂������Ȃ̂ł��ˁH";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk1";
	next;
	mes "[�߉q��]";
	mes "�����S���������B";
	mes "�É��͖����ł��B";
	mes "�P�l�������ł͂Ȃ�";
	mes "�����������S�ȏꏊ�ɎQ��܂��傤�B";
	mes "���̂܂܂ł�";
	mes "���댯�Ȗڂɂ������c�c�B";
	unittalk "�߉q�� : �����S���������B�É��͖����ł��B�P�l�������ł͂Ȃ������������S�ȏꏊ�ɎQ��܂��傤�B���̂܂܂ł͂��댯�Ȗڂɂ������c�c�B";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c���ɂƂ��Ĉ��S�ň��S�ȏꏊ��";
	mes "���������܂���B";
	mes "����͐̂���A�����ƕς���Ă�";
	mes "����܂���c�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk2";
	next;
	mes "[�߉q��]";
	mes "�e�B�A���P�c�c�B";
	unittalk "�߉q�� : �e�B�A���P�c�c�B";
	next;
	mes "�]�e�B�A���P�Ƌ߉q���̊Ԃ�";
	mes "�@��]�֌W�𒴂���";
	mes "�@��C�Ƌ�������������]";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c���߂�Ȃ����B";
	mes "�����X�^�[������P���ȂǁA";
	mes "���܂łȂ��������Ƃ��N����������";
	mes "����ȗ\�����ʂ����Ȃ��̂ł��c�c�B";
	mes "�Ȃɂ��������Ƃ����������Łc�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk3";
	next;
	mes "[�߉q��]";
	mes "�P�l�A�s����������̂�";
	mes "�悭�킩��܂��B";
	mes "�ł����P�l�́A����";
	mes "���̍���w�����ė������ł��B";
	mes "�ǂ����C��������������A�׍���";
	mes "���̕��́A�悫�����ɂȂ��Ă��������c�c�B";
	unittalk "�߉q�� : �P�l�A�s����������̂͂悭�킩��܂��B�ł����P�l�́A���ケ�̍���w�����ė������ł��B�ǂ����C��������������A�׍��̂��̕��́A�悫�����ɂȂ��Ă��������c�c�B";
	next;
	mes "[�e�B�A���P]";
	mes "�����X�^�[�����̏���P����";
	mes "���R�͒肩�ł͂���܂���B";
	mes "�����Ă��̂悤�Ȏ��ɁA";
	mes "�M���ɂ��̂悤�Ȃ��Ƃ𕷂��̂�";
	mes "�s�ސT��������Ȃ��̂ł����c�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk4";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c�����������������B";
	mes "���Ȃ��ɂƂ��Ă����́A����m��Ȃ�";
	mes "�׍��̓a���ƌ����̌_������킷���Ƃ�";
	mes "�]�݂Ȃ̂ł��傤���c�c�B";
	mes "���́c�c�B";
	mes "���̖]�݂͂��Ȃ��Ɓc�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk5";
	next;
	mes "[�߉q��]";
	mes "�c�c�P�l�B";
	mes "��A���́c�c�B";
	unittalk "�߉q�� : �c�c�P�l�B��A���́c�c�B";
	next;
	mes "[�߉q��]";
	mes "!?";
	mes "�������c�c�߂�!!";
	unittalk "�߉q�� : !?�@�������c�c�߂�!!";
	next;
	mes "�]�����Ɛl�X�̋��ѐ���";
	mes "�@�������ɔ����Ă���̂�";
	mes "�@���������I�]";
	next;
	mes "[�߉q��]";
	mes "�P�l�I";
	mes "���S�ȏꏊ�܂ł����肵�܂�!!";
	mes "�c�c�Q��܂��傤�I";
	unittalk "�߉q�� : �P�l�I�@���S�ȏꏊ�܂ł����肵�܂�!!�c�c�Q��܂��傤�I";
	close2;
	hideonnpc getmdnpcname("�߉q��#dk1");
	hideonnpc getmdnpcname("�e�B�A���P#dk");
	misceffect 904,"";
	donpcevent getmdnpcname("#DK_NPCTimer2")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("�߉q��#dk1");
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer2	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�Ⴂ�j�̐� : �����������ȃe�B�A���P�c�c���́c�c���́c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	end;
OnTimer6000:
	announce "�Ⴂ�j�̐� : ��킭�΋M���ƁA�i���̎����߂������������c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	end;
OnTimer9000:
	stopnpctimer;
	hideoffnpc getmdnpcname("�׍��̉��q#dk3");
	end;
}

1@spa.gat,111,133,5	script	�׍��̉��q#dk3	470,7,7,{
	mes "�]�d���Ă�ꂽ��i������";
	mes "�@���𒅂��j���A�s�C���ȏΊ��";
	mes "�@�����ׂȂ���΂��Ă���]";
	close;
OnTouch:
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "[�׍��̉��q]";
		mes "���̋߉q���͎g���������B";
		mes "�Ƃ肠�����ނɂ͍����";
		mes "�����X�^�[�̏P��������";
		mes "��d�҂Ƃ������ł�";
		mes "�S���Ă����������c�c�B";
		mes "�N�N�N�N�N�B";
		unittalk "�׍��̉��q : ���̋߉q���͎g���������B�Ƃ肠�����ނɂ͍���̃����X�^�[�̏P�������̎�d�҂Ƃ������ł��S���Ă����������B�N�N�N�N�N�B";
		close2;
		hideonnpc getmdnpcname("�׍��̉��q#dk3");
		announce "�]���Ԃ����������悤�Ȋ��o�̌�A�k�ŉ������J���悤�ȉ��������]",0x9,0xffff00,0x190,20,0,0;
		misceffect 35,getmdnpcname("�S��̉��{3�K");
		hideoffnpc getmdnpcname("�S��̉��{3�K");
		donpcevent getmdnpcname("����#dk1")+ "::OnStart";
	}
	end;
}

1@spa.gat,117,137,0	warp	�S��̉��{3�K	2,2,1@spa.gat,60,43

1@spa.gat,28,52,7	script	�R�m�c��#dk	418,{
	mes "�]�j�͋�a�̐F�𕂂��ׂ��\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}

1@spa.gat,25,53,7	script	���m#dk1	413,{
	mes "�]�j�͋�a�̐F�𕂂��ׂ��\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}

1@spa.gat,34,53,1	script	���m#dk2	413,{
	mes "�]�j�͌˘f���̕\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}

1@spa.gat,30,52,7	script	���m#dk3	417,{
	mes "�]�j�͌˘f���̕\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}

1@spa.gat,30,58,5	script	�߉q��#dk2	10018,{
	mes "�]���ɂ�������ƌq����A";
	mes "�@�g�������Ƃ�Ȃ��悤���]";
	close;
OnTalk1:
	unittalk "�߉q�� : ����ł��I�@�É��I�@���́c�c���͒f���ĕÉ����A���̍��𗠐؂�悤�ȍs�ׂ͂����Ȃ��Ă���܂���I";
	end;
OnTalk2:
	unittalk "�߉q�� : ���A����́c�c�B";
	end;
OnTalk3:
	unittalk "�߉q�� : �e�B�A���P�c�c�B���̎҂̂悤�Ȃ��̂̂��߂Ɂc�c�B";
	end;
}

1@spa.gat,32,54,1	script	����#dk1	965,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[����]";
		mes "�����Ƀ����X�^�[���Ăъ񂹂��̂�";
		mes "�܂������Ȃ��������Ƃ́c�c�B";
		mes "��ԐM�����Ă������Ȃ���";
		mes "�܂������؂���Ƃ́c�c�ȁB";
		close;
	}
	stopnpctimer;
	mes "[����]";
	mes "�����Ƀ����X�^�[���Ăъ񂹂��̂�";
	mes "�܂������Ȃ��������Ƃ́c�c�B";
	mes "��ԐM�����Ă������Ȃ���";
	mes "�܂������؂���Ƃ́c�c�ȁB";
	unittalk "���� : �����Ƀ����X�^�[���Ăъ񂹂��̂��܂������Ȃ��������Ƃ́c�c�B��ԐM�����Ă������Ȃ��ɂ܂������؂���Ƃ́c�c�ȁB";
	next;
	if(checkquest(114755)&0x8) {
		if(select("�}��","��l�̉�b�𕷂�") == 1) {
			mes "�]���Ԃ��u���ɗ��ꂽ�̂��������]";
			close2;
			hideonnpc getmdnpcname("����#dk1");
			hideonnpc getmdnpcname("�߉q��#dk2");
			hideonnpc getmdnpcname("�R�m�c��#dk");
			hideonnpc getmdnpcname("���m#dk1");
			hideonnpc getmdnpcname("���m#dk2");
			hideonnpc getmdnpcname("���m#dk3");
			donpcevent getmdnpcname("#DK_NPCTimer3")+ "::OnStart";
			setnpctimer 30000,getmdnpcname("#DK_NPCTimer3");
			misceffect 904,"";
			end;
		}
	}
	mes "[�߉q��]";
	mes "����ł��I�@�É��I";
	mes "���́c�c���͒f����";
	mes "�É����A���̍��𗠐؂�悤��";
	mes "�s�ׂ͂����Ȃ��Ă���܂���I";
	donpcevent getmdnpcname("�߉q��#dk2")+ "::OnTalk1";
	next;
	mes "[����]";
	mes "�������Ȃ���M�������C�����͂���B";
	mes "�������A���̕����R�������R���Ȃ��B";
	mes "����x�A�₨���B";
	mes "���Ȃ��ɁA���̗��R������ł���̂��H";
	unittalk "���� : �������Ȃ���M�������C�����͂���B�������A���̕����R�������R���Ȃ��B����x�A�₨���B���Ȃ��ɁA���̗��R������ł���̂��H";
	next;
	mes "[�߉q��]";
	mes "���A����́c�c�B";
	donpcevent getmdnpcname("�߉q��#dk2")+ "::OnTalk2";
	next;
	mes "[����]";
	mes "���Ȃ��̂���܂ł̓����ɖƂ�";
	mes "���܂ł́A�D���B";
	mes "�䂪�������̂��Ƃ𕷂��Ă���";
	mes "���ɕ�������Ԃ������Ă���B";
	mes "���Ȃ��̖���D�����ƒm���";
	mes "���𗎂Ƃ����˂Ȃ��قǂɁc�c�ȁB";
	unittalk "���� : ���Ȃ��̂���܂ł̓����ɖƂ����܂ł́A�D���B�䂪�������̂��Ƃ𕷂��Ă��珰�ɕ�������Ԃ������Ă���B���Ȃ��̖���D�����ƒm��Ζ��𗎂Ƃ����˂Ȃ��قǂɁc�c�ȁB";
	next;
	mes "[�߉q��]";
	mes "�e�B�A���P�c�c�B";
	mes "���̂悤�Ȃ��̂̂��߂Ɂc�c�B";
	donpcevent getmdnpcname("�߉q��#dk2")+ "::OnTalk3";
	close2;
	hideonnpc getmdnpcname("����#dk1");
	hideonnpc getmdnpcname("�߉q��#dk2");
	hideonnpc getmdnpcname("�R�m�c��#dk");
	hideonnpc getmdnpcname("���m#dk1");
	hideonnpc getmdnpcname("���m#dk2");
	hideonnpc getmdnpcname("���m#dk3");
	hideoffnpc getmdnpcname("�߉q��#dk3");
	hideoffnpc getmdnpcname("�����^���^�m�X#dkt");
	donpcevent getmdnpcname("#DK_NPCTimer3")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("����#dk1");
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer3	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�s�g�Ȑ� : ���̏ꏊ�ɒ������l�Ԃ������Ǝv���΁c�c�N�b�N�b�N�B�����S�����߉q����A�d��ꂽ�ȁB",0x9,0xff0000,0x190,16,0,0;
	misceffect 885,getmdnpcname("�����^���^�m�X#dkt");
	misceffect 829,getmdnpcname("�����^���^�m�X#dkt");
	end;
OnTimer6000:
	donpcevent getmdnpcname("�߉q��#dk3")+ "::OnTalk1";
	end;
OnTimer9000:
	announce "�s�g�Ȑ� : �ォ�痈���g���ŁA�����Ȃ����A���ȁB��͂��̐����x�z���邽�߂ɐ��܂ꂽ���A�^���^�m�X�B",0x9,0xff0000,0x190,16,0,0;
	end;
OnTimer12000:
	announce "�����^���^�m�X : �����M�l�����̏󋵂���̒E�p���肤�̂ł���΁A��ƌ_�������Ƃ����B������Ζ��̊댯������P�N���܂��A�����邩������ʂ��H",0x9,0xff0000,0x190,16,0,0;
	end;
OnTimer15000:
	donpcevent getmdnpcname("�߉q��#dk3")+ "::OnTalk2";
	end;
OnTimer18000:
	announce "�����^���^�m�X : ���ʂɂ���������Ă�낤�B�M�l���ׂꂽ����c�c���ꂱ���A���̗׍��̉��q���B",0x9,0xff0000,0x190,16,0,0;
	end;
OnTimer21000:
	donpcevent getmdnpcname("�߉q��#dk3")+ "::OnTalk3";
	end;
OnTimer24000:
	announce "�����^���^�m�X : �N�b�N�b�N�b�B�܂��䂪���t���M�����ʂ悤���ȁB�����������łȂ��ẮA�ʔ����Ȃ��B",0x9,0xff0000,0x190,16,0,0;
	end;
OnTimer27000:
	announce "�����^���^�m�X : �ł́A���񂾂����ʂ��B�ʔ����V���[�������Ă�낤�B�c�c�����Ɏ��B������΁A�킩�邾�낤�B",0x9,0xff0000,0x190,16,0,0;
	end;
OnTimer30000:
	announce "�Ⴂ�j�̐� : �����^���^�m�X�Ƃ��琁c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	end;
OnTimer33000:
	announce "�Ⴂ�j�̐� : ��������Ɏ�鎄�̐S�ɂ������͉̂ʂ����ĕP�ւ̑z�����A����Ƃ��c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	hideonnpc getmdnpcname("�߉q��#dk3");
	hideonnpc getmdnpcname("�����^���^�m�X#dkt");
	end;
OnTimer36000:
	stopnpctimer;
	misceffect 35,getmdnpcname("�S��̉��{4�K");
	hideoffnpc getmdnpcname("�S��̉��{4�K");
	donpcevent getmdnpcname("�߉q��#dk4")+ "::OnStart";
	announce "�]���Ԃ����������悤�Ȋ��o�̌�A�쓌�ŉ������J���悤�ȉ��������]",0x9,0xffff00,0x190,20,0,0;
	end;
}

1@spa.gat,31,57,5	script	�߉q��#dk3	10018,{
	end;
OnTalk1:
	unittalk "�߉q�� : �N���c�c�B�N�����Ɍ�肩���Ă���c�c�B���̂��Ƃ͕����Ă����Ă���c�c�B";
	end;
OnTalk2:
	unittalk "�߉q�� : �_��H�@�ǂ����āA�����_����c�c�I�@����������̂�!!�@���́A�P�Ɋ댯�������Ă���!!";
	end;
OnTalk3:
	unittalk "�߉q�� : �c�c�׍��̉��q�c�c!?�@��͂肠�̎������l�e�́c�c�I�@�c�c�N�b�c�c�I�@���̍������Ȃ���΁c�c!!";
	end;
}

1@spa.gat,35,56,5	script	�����^���^�m�X#dkt	844,{}

1@spa.gat,54,28,0	warp	�S��̉��{4�K	2,2,1@spa.gat,218,186

1@spa.gat,201,214,1	script	�����^���^�m�X#dkt1	1205,{
	end;
OnTalk1:
	unittalk "�����^���^�m�X : �c�c���̌��t�ɉR�͂Ȃ��ȁH�@�M�l�Ɖ�͂��܂��̎����獰���Ƃ��ɂ��A��͋M�l�ɗ͂�^���悤�I�@�M�l�͉�Ɍ��������̂��I";
	end;
OnTalk2:
	unittalk "�����^���^�m�X : �����̕P�N�͂ǂ����S���ɗH����Ă���悤�����B";
	end;
}

1@spa.gat,197,218,5	script	�׍��̉��q#dk	470,{
	mes "�]�s�K�ȏ΂݂𕂂���";
	mes "�@�߉q�������߂Ă���]";
	close;
OnTalk1:
	unittalk "�׍��̉��q : �����ƒx�������ˁB�N�����܂�ɂ��x�����炤������₢�l�߂Ă����l�̋`���̕��ƉƗ����E�߂錋�ʂɂȂ��Ă��܂�������Ȃ����B";
	end;
OnTalk2:
	unittalk "�׍��̉��q : �������A�l�̖��Ȃ�Ĉ������̂��B�����A�N�����̎�Ɉ����Ă��邻�̌��B���ꂵ�����^���^�m�X�ɔ�ׂ���ˁB�c�c���̍��ɂ��ꂪ����ƒm���Ă���l���ǂꂾ�����̖�����T�����߂����Ƃ��c�c�B";
	end;
OnTalk3:
	unittalk "�׍��̉��q : �N�ɕ������̂��m��Ȃ�����ǌN�̂����Ă��邱�Ƃ͊T�ː������ȁB�����A�l�����Ăł���Ζ���D���Ȃ�Ė�؂Ȃ��Ƃ͔������������񂾂�H";
	end;
OnTalk4:
	unittalk "�׍��̉��q : �������Ƃ��������̕P���߉q���̌N�͂���Ȑl����Ȃ����ċ����Ȃ���i���Ă��邵���B����܂�ɂ����邳�����炠��ꏊ�Ɉ�l�ŗ���Ԃ��Ă�����Ă����B";
	end;
OnTalk5:
	unittalk "�׍��̉��q : �Ȃ���!?�@���ꂵ�����^���^�m�X��I�@���O���d����ׂ���l�͂�������Ȃ����̖l�̂ق������������͂�!!�@�Ȃ����ꂪ�킩��Ȃ�!?";
	end;
OnTalk6:
	unittalk "�׍��̉��q : �҂Ă�!!�@�ǂ����Ėl�𖳎�����!!�@���O�B�����╃��̂悤�ɖl�𖳔\���Ǝv���Ă�񂾂�!?�@�c�c�������낤�B�l�̖{���̎p�������Ă��!!";
	end;
OnTalk7:
	unittalk "�􂢂̍��� : �O�I�I�I�I�c�c�b�I�@���邪�����A���ꂪ�l�̖{���̗�!!�@�������c�c���E���c�c���ׂ�V�������E�̉��ƂȂ��!";
	end;
OnTalk8:
	unittalk "�􂢂̍��� : �ł́A������u���Ă�����!! �M�l�ɂ͕s�v�Ȃ��̂̂͂�!!�@����肻�̖������g���āA���̏��������悤�ȂǍ��X��x�ꂾ!!";
	end;
OnTalk9:
	unittalk "�􂢂̍��� : ���̏��������񂾂�b!!�@�l���������Ăэ���ł�Ƃ���������ɁA�N�ɂ�����ꂽ���Ƃ��Ȃ����̖l���������񂾁c�c���̖l���c�c�B�ڋ��҂��Ă����Ȃ��炳���c�c�H�@�����Ȃ��c�c�����Ȃ���c�c�B";
	end;
}

1@spa.gat,197,218,5	script	�􂢂̍���#dk	2959,{}

1@spa.gat,194,214,5	script	�|�ꂽ����#dk	956,{
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,211,194,3	script	�|�ꂽ�R�m�c��#dk	887,{
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}

1@spa.gat,201,198,1	script	�|�ꂽ���m#dk	849,{
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}

1@spa.gat,197,190,1	script	�|�ꂽ���m#dk1	849,{
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}

1@spa.gat,191,207,7	script	�|�ꂽ���m#dk2	849,{
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}

1@spa.gat,206,209,7	script	�|�ꂽ���m#dk3	849,{
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}

1@spa.gat,189,195,1	script	�|�ꂽ���m#dk4	849,{
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}

1@spa.gat,199,214,1	script	�߉q��#dk4	686,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]�׍��̉��q�Ƌ߉q����";
		mes "�@�b���Ă���̂�������]";
		close;
	}
	stopnpctimer;
	mes "�]�׍��̉��q�Ƌ߉q����";
	mes "�@�b���Ă���̂�������]";
	next;
	if(checkquest(114755)&0x8) {
		if(select("�}��","��l�̉�b�𕷂�") == 1) {
			mes "�]���Ԃ��u���ɗ��ꂽ�̂��������]";
			close2;
			hideonnpc getmdnpcname("�߉q��#dk4");
			hideonnpc getmdnpcname("�����^���^�m�X#dkt1");
			hideonnpc getmdnpcname("�|�ꂽ����#dk");
			hideonnpc getmdnpcname("�|�ꂽ�R�m�c��#dk");
			hideonnpc getmdnpcname("�|�ꂽ���m#dk");
			hideonnpc getmdnpcname("�|�ꂽ���m#dk1");
			hideonnpc getmdnpcname("�|�ꂽ���m#dk2");
			hideonnpc getmdnpcname("�|�ꂽ���m#dk3");
			hideonnpc getmdnpcname("�|�ꂽ���m#dk4");
			misceffect 904,"";
			donpcevent getmdnpcname("#DK_NPCTimer4")+ "::OnStart";
			end;
		}
	}
	mes "[�߉q��]";
	mes "�c�c���Ȃ����䂪��ɉR��`��";
	mes "��������̎����̎�d�҂Ƃ���";
	mes "�d���ďグ���Ƃ����͖̂{���ł����B";
	unittalk "�߉q�� : �c�c���Ȃ����䂪��ɉR��`����������̎����̎�d�҂Ƃ��Ďd���ďグ���Ƃ����͖̂{���ł����B";
	next;
	mes "[�׍��̉��q]";
	mes "�����ƒx�������ˁB";
	mes "�N�����܂�ɂ��x������";
	mes "��������₢�l�߂Ă���";
	mes "�l�̋`���̕��ƉƗ����E�߂錋�ʂ�";
	mes "�Ȃ��Ă��܂�������Ȃ����B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk1";
	next;
	mes "[�׍��̉��q]";
	mes "�������A�l�̖��Ȃ�Ĉ������̂��B";
	mes "�����A�N�����̎�Ɉ����Ă��邻�̌��B";
	mes "���ꂵ�����^���^�m�X�ɔ�ׂ���ˁB";
	mes "�c�c���̍��ɂ��ꂪ����ƒm���Ă���";
	mes "�l���ǂꂾ�����̖�����";
	mes "�T�����߂����Ƃ��c�c�B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk2";
	next;
	mes "[�߉q��]";
	mes "���̌�����ɓ���邽�߂�����";
	mes "���Ȃ��͍������x���A�����ׂ�";
	mes "���̏�Ƀ����X�^�[���Ăэ���";
	mes "��炪���E�̖���D���A";
	mes "�e�B�A���P�܂ŁA�댯�Ȗڂ�";
	mes "���킹�悤�Ƃ����̂�!?";
	unittalk "�߉q�� : ���̌�����ɓ���邽�߂����ɂ��Ȃ��͍������x���A�����ׂꂱ�̏�Ƀ����X�^�[���Ăэ��݉�炪���E�̖���D���A�e�B�A���P�܂ŁA�댯�Ȗڂɂ��킹�悤�Ƃ����̂�!?";
	next;
	mes "[�׍��̉��q]";
	mes "�N�ɕ������̂��m��Ȃ������";
	mes "�N�̂����Ă��邱�Ƃ͊T�ː������ȁB";
	mes "�����A�l�����Ăł���Ζ���D���Ȃ��";
	mes "��؂Ȃ��Ƃ͔������������񂾂�H";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk3";
	next;
	mes "[�׍��̉��q]";
	mes "�������Ƃ��������̕P��";
	mes "�߉q���̌N�͂���Ȑl����Ȃ�����";
	mes "�����Ȃ���i���Ă��邵���B";
	mes "����܂�ɂ����邳������";
	mes "����ꏊ�Ɉ�l��";
	mes "����Ԃ��Ă�����Ă����B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk4";
	next;
	mes "[�߉q��]";
	mes "�c�c�������B";
	mes "����Ŕ[�����������B";
	mes "���O�����ɂ��������Ƃ�";
	mes "�����������悤���ȁA�����^���^�m�X�B";
	mes "���߂āc�c�_�񐬗����B";
	unittalk "�߉q�� : �c�c�������B����Ŕ[�����������B���O�����ɂ��������Ƃ͐����������悤���ȁA�����^���^�m�X�B���߂āc�c�_�񐬗����B";
	next;
	cutin "tartanos.bmp",3;
	mes "[�����^���^�m�X]";
	mes "�c�c���̌��t�ɉR�͂Ȃ��ȁH";
	mes "�M�l�Ɖ�͂��܂��̎����獰���Ƃ��ɂ��A";
	mes "��͋M�l�ɗ͂�^���悤�I";
	mes "�M�l�͉�Ɍ��������̂��I";
	donpcevent getmdnpcname("�����^���^�m�X#dkt1")+ "::OnTalk1";
	next;
	cutin "tartanos.bmp",255;
	mes "[�׍��̉��q]";
	mes "�Ȃ���!?";
	mes "���ꂵ�����^���^�m�X��I";
	mes "���O���d����ׂ���l�͂����ł͂Ȃ�";
	mes "���̖l�̂ق������������͂�!!";
	mes "�Ȃ����ꂪ�킩��Ȃ�!?";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk5";
	next;
	mes "[�߉q��]";
	mes "���O�Ɏ��Ԃ�������قǁA�ɂł͂Ȃ��B";
	mes "�c�c���̓e�B�A���P��T���B";
	unittalk "�߉q�� : ���O�Ɏ��Ԃ�������قǁA�ɂł͂Ȃ��B�c�c���̓e�B�A���P��T���B";
	next;
	mes "[�����^���^�m�X]";
	mes "�����̕P�N�͂ǂ����";
	mes "�S���ɗH�����";
	mes "����悤�����B";
	donpcevent getmdnpcname("�����^���^�m�X#dkt1")+ "::OnTalk2";
	next;
	mes "[�׍��̉��q]";
	mes "�҂Ă�!!";
	mes "�ǂ����Ėl�𖳎�����!!";
	mes "���O�B�����╃��̂悤��";
	mes "�l�𖳔\���Ǝv���Ă�񂾂�!?";
	mes "�c�c�������낤�B";
	mes "�l�̖{���̎p�������Ă��!!";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk6";
	next;
	cutin "tartanos.bmp",255;
	misceffect 276,getmdnpcname("�׍��̉��q#dk");
	hideonnpc getmdnpcname("�׍��̉��q#dk");
	hideoffnpc getmdnpcname("�􂢂̍���#dk");
	mes "[�􂢂̍���]";
	mes "�O�I�I�I�I�c�c�b�I";
	mes "���邪�����A���ꂪ�l��";
	mes "�{���̗�!!";
	mes "�������c�c���E���c�c";
	mes "���ׂ�V�������E�̉��ƂȂ��!";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk7";
	next;
	mes "[�߉q��]";
	mes "�V�������E�̉����Ɓc�c�H";
	mes "�c�c������Ȃ��c�c�B";
	mes "���͂���Ȃ��́A�����͂Ȃ��B";
	mes "���S����B";
	unittalk "�߉q�� : �V�������E�̉����Ɓc�c�H�@�c�c������Ȃ��c�c�B���͂���Ȃ��́A�����͂Ȃ��B���S����B";
	next;
	mes "[�􂢂̍���]";
	mes "�ł́A������u���Ă�����!!";
	mes "�M�l�ɂ͕s�v�Ȃ��̂̂͂�!!";
	mes "����肻�̖������g���āA";
	mes "���̏��������悤�ȂǍ��X";
	mes "��x�ꂾ!!";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk8";
	next;
	mes "[�߉q��]";
	mes "�P�Ɂc�c�ޏ��Ɂc�c";
	mes "���������c�c�b!!";
	unittalk "�߉q�� : �P�Ɂc�c�ޏ��Ɂc�c���������c�c�b!!";
	next;
	mes "[�􂢂̍���]";
	mes "���̏��������񂾂�b!!";
	mes "�l���������Ăэ���ł�Ƃ���";
	mes "������ɁA�N�ɂ�����ꂽ���Ƃ��Ȃ�";
	mes "���̖l���������񂾁c�c���̖l���c�c�B";
	mes "�ڋ��҂��Ă����Ȃ��炳���c�c�H";
	mes "�����Ȃ��c�c�����Ȃ���c�c�B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk9";
	next;
	mes "[�߉q��]";
	mes "�c�c����ȓz�Ɂc�c����ȓz�Ɂc�c";
	mes "�P���c�c�������c�c�b!!";
	unittalk "�߉q�� : �c�c����ȓz�Ɂc�c����ȓz�Ɂc�c�P���c�c�������c�c�b!!";
	next;
	mes "[�߉q��]";
	mes "���̏������p�����̑O��";
	mes "�N���ȁA������c�c�I";
	unittalk "�߉q�� : ���̏������p�����̑O�ɎN���ȁA������c�c�I";
	next;
	mes "�]�߉q�����׍��̉��q��";
	mes "�@�ꑾ�����т����";
	mes "�@�׍��̉��q�͐Ռ`���Ȃ�";
	mes "�@���ł��Ă��܂����]";
	misceffect 565,getmdnpcname("�􂢂̍���#dk");
	hideonnpc getmdnpcname("�􂢂̍���#dk");
	close2;
	hideonnpc getmdnpcname("�߉q��#dk4");
	hideonnpc getmdnpcname("�����^���^�m�X#dkt1");
	hideonnpc getmdnpcname("�|�ꂽ����#dk");
	hideonnpc getmdnpcname("�|�ꂽ�R�m�c��#dk");
	hideonnpc getmdnpcname("�|�ꂽ���m#dk");
	hideonnpc getmdnpcname("�|�ꂽ���m#dk1");
	hideonnpc getmdnpcname("�|�ꂽ���m#dk2");
	hideonnpc getmdnpcname("�|�ꂽ���m#dk3");
	hideonnpc getmdnpcname("�|�ꂽ���m#dk4");
	donpcevent getmdnpcname("#DK_NPCTimer4")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("�߉q��#dk4");
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer4	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�Ⴂ�j�̐� : �����Ɨ͂�����΁A������������҂��Ă����̂��낤���c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	end;
OnTimer6000:
	announce "�Ⴂ�j�̐� : ���͎c���ȉ^�����A���s�s�Ȑ��E���A�����Ė��͂ȌȂ�����Ă����B",0x9,0x7cfc00,0x190,20,0,0;
	end;
OnTimer9000:
	stopnpctimer;
	misceffect 35,getmdnpcname("�S��̉��{5�K");
	hideoffnpc getmdnpcname("�S��̉��{5�K");
	donpcevent getmdnpcname("�e�B�A���P#dk1")+ "::OnStart";
	announce "�]���Ԃ����������悤�Ȋ��o�̌�A�쐼�ŉ������J���悤�ȉ��������]",0x9,0xffff00,0x190,20,0,0;
	end;
}

1@spa.gat,178,186,0	warp	�S��̉��{5�K	2,2,1@spa.gat,186,57

1@spa.gat,213,42,7	script	�߉q��#dk5	686,{
	mes "�]�e�B�A���P������������Ă���A";
	mes "�@���̕\��͌����Ȃ��c�c�]";
	close;
OnTalk1:
	unittalk "�߉q�� : �e�B�A���P�c�c!!�@�����ɁA�r�̗ǂ����Ïp�t������͂��ł��c�c!!�@�C��������������Ă��������c�c�B";
	end;
OnTalk2:
	unittalk "�߉q�� : �P�c�c����Ȃ������c�c�B���̂ɏ��܂��c�c�B";
	end;
OnTalk3:
	unittalk "�߉q�� : ����ȁc�c�g�ɂ��܂邨���t�ł��c�c�B����Ɏ��́A�����ɑ΂����ӂ͂���ǁA���ނ��ƂȂǂ��ꂩ����������܂���B�ł����炲���S���������B";
	end;
OnTalk4:
	unittalk "�߉q�� : �P�c�c�����c�c�����c�c�b�I�@�N��!!�@�N�����Ȃ��̂�!?�@�����c�c�����P���c�c�P�̎��Â��c�c�b�I�@���肢�c�c���c�c�B";
	end;
OnTalk5:
	unittalk "�߉q�� : ���i�Ȃ�!!�@�����Ŕ������P�l�قǉ����ɑ������������͂���܂���c�c�B�����c�c�����g�����킫�܂����S�䂩�ꂽ�̂́A����ȕP�l�����炱���Ȃ̂ł��c�c�B";
	end;
OnTalk6:
	unittalk "�߉q�� : �c�c�P�H�@�e�B�A���P�c�c�H�@�c�c���́c�c���́c�c���̂����c�c���c�c�B�������Ȃ������c�c�B�����c�c����Ă���΁c�c!";
	end;
OnTalk7:
	unittalk "�߉q�� : �c�c�B����A�����Ƃ���͈��������c�c�B���Ȃ񂾁c�c�����Ȃ킯���Ȃ��c�c�B�����A�P�l�B�N���Ă��������B����ȂƂ���ŐQ�Ă͂��̂ɍ������܂��B";
	end;
OnTalk8:
	unittalk "�߉q�� : �P�l�H�@�e�B�A���P�c�c�H�@�ǂ����āc�c�ǂ����Ėڂ��J���Ă���Ȃ��̂ł����b!?�@���́A�΂��Ă���Ȃ��̂ł����c�c!?�ǂ����āc�c�ǂ����āc�c�ǂ����c�c�āc�c�B";
	end;
}

1@spa.gat,216,43,3	script	�e�B�A���P#dk1	640,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]�e�B�A���P�Ƌ߉q����";
		mes "�@�b���Ă���̂�������]";
		close;
	}
	stopnpctimer;
	if(checkquest(114755)&0x8) {
		mes "�]�e�B�A���P�Ƌ߉q����";
		mes "�@�b���Ă���̂�������]";
		next;
		if(select("�}��","��l�̉�b�𕷂�") == 1) {
			mes "�]���Ԃ��u���ɗ��ꂽ�̂��������]";
			close2;
			hideonnpc getmdnpcname("�e�B�A���P#dk1");
			hideonnpc getmdnpcname("�߉q��#dk5");
			misceffect 904,"";
			donpcevent getmdnpcname("#DK_BattleAnnounce")+ "::OnStart";
			end;
		}
	}
	mes "[�e�B�A���P]";
	mes "�M���̘r�ɕ���������";
	mes "����Ȃ�āc�c";
	mes "���ł͂Ȃ��̂ł��ˁB";
	mes "�S�z�A�S�z�b�c�c�B";
	unittalk "�e�B�A���P : �M���̘r�ɕ�������������Ȃ�āc�c���ł͂Ȃ��̂ł��ˁB�S�z�A�S�z�b�c�c�B";
	next;
	mes "[�߉q��]";
	mes "�e�B�A���P�c�c!!";
	mes "�����ɁA�r�̗ǂ����Ïp�t��";
	mes "����͂��ł��c�c!!";
	mes "�C��������������Ă��������c�c�B";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk1";
	next;
	mes "�]�e�B�A���P�̊�ɐ��C�͂Ȃ��A";
	mes "�@�����ȑ������{���ꂽ";
	mes "�@�h���X�̓h�X�������݂�";
	mes "�@���܂��Ă����c�c�]";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c�ǂ����Ă��M���ɁA";
	mes "�`���������Ƃ��������̂ł��c�c�B";
	mes "�S�z�A�S�z�b�c�c�B";
	mes "�c�c�����āc�c����c�c";
	mes "�܂����c�c�H";
	unittalk "�e�B�A���P : �c�c�ǂ����Ă��M���ɁA�`���������Ƃ��������̂ł��c�c�B�S�z�A�S�z�b�c�c�B�c�c�����āc�c����c�c�܂����c�c�H";
	next;
	mes "[�߉q��]";
	mes "�P�c�c����Ȃ������c�c�B";
	mes "���̂ɏ��܂��c�c�B";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk2";
	next;
	mes "[�e�B�A���P]";
	mes "���v�ł��c�c�B";
	mes "�����畷���āc�c���������c�c�B";
	mes "�ǂ����A�߂���Ƃ���";
	mes "���̕��������Ă��������B";
	mes "�����{�S�ł́A�M���̂��Ƃ�";
	mes "�M���Ă����͂��ł��B";
	unittalk "�e�B�A���P : ���v�ł��c�c�B�����畷���āc�c���������c�c�B�ǂ����A�߂���Ƃ������̕��������Ă��������B�����{�S�ł́A�M���̂��Ƃ�M���Ă����͂��ł��B";
	next;
	mes "[�߉q��]";
	mes "����ȁc�c�g�ɂ��܂邨���t�ł��c�c�B";
	mes "����Ɏ��́A�����ɑ΂�";
	mes "���ӂ͂���ǁA���ނ��ƂȂ�";
	mes "���ꂩ����������܂���B";
	mes "�ł����炲���S���������B";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk3";
	next;
	mes "[�e�B�A���P]";
	mes "�M���͖{���ɗD�����̂ł��ˁc�c�B";
	mes "�����������񂾂Ƃ���h���Ƃ�";
	mes "�����M���͖T�ɂ��ĈԂ߂Ă��ꂽ�B";
	mes "�����ƁA����ȋM���ƕ��Ƃ��̍���";
	mes "��炵�Ă����������̂Ɂc�c�S�z�b�B";
	unittalk "�e�B�A���P : �M���͖{���ɗD�����̂ł��ˁc�c�B�����������񂾂Ƃ���h���Ƃ������M���͖T�ɂ��ĈԂ߂Ă��ꂽ�B�����ƁA����ȋM���ƕ��Ƃ��̍��ŕ�炵�Ă����������̂Ɂc�c�S�z�b�B";
	next;
	mes "[�߉q��]";
	mes "�P�c�c�����c�c�����c�c�b�I";
	mes "�N��!!�@�N�����Ȃ��̂�!?";
	mes "�����c�c�����P���c�c";
	mes "�P�̎��Â��c�c�b�I";
	mes "���肢�c�c���c�c�B";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk4";
	next;
	mes "[�e�B�A���P]";
	mes "�����āc�c����̂ł��c�c���H";
	mes "�c�c�M���ɓ��ʂȋC������";
	mes "�����Ă��܂��������ǂ����A";
	mes "�S�z�S�z�c�c�����Ă��������c�c�B";
	mes "����ʋC�����ƕ������Ă����̂Ɂc�c�B";
	mes "���͉������i�ł��c�c�ˁc�c�B";
	unittalk "�e�B�A���P : �����āc�c����̂ł��c�c���H�@�c�c�M���ɓ��ʂȋC����������Ă��܂��������ǂ����A�S�z�S�z�c�c�����Ă��������c�c�B����ʋC�����ƕ������Ă����̂Ɂc�c�B���͉������i�ł��c�c�ˁc�c�B";
	next;
	mes "[�߉q��]";
	mes "���i�Ȃ�!!�@�����Ŕ�����";
	mes "�P�l�قǉ����ɑ�������������";
	mes "����܂���c�c�B";
	mes "�����c�c�����g�����킫�܂���";
	mes "�S�䂩�ꂽ�̂́A����ȕP�l������";
	mes "�����Ȃ̂ł��c�c�B";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk5";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c�B";
	mes "�c�c���肪�Ƃ��B";
	mes "���̌��t���M�����畷���c�c";
	mes "���͍��A�N�����c�c�B";
	unittalk "�e�B�A���P : �c�c�B�c�c���肪�Ƃ��B���̌��t���M�����畷���c�c���͍��A�N�����c�c�B";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c�c�c�B";
	unittalk "�e�B�A���P : �c�c�c�c�B";
	next;
	cutin "b-tiara.BMP",3;
	mes "[�߉q��]";
	mes "�c�c�P�H�@�e�B�A���P�c�c�H";
	mes "�c�c���́c�c���́c�c";
	mes "���̂����c�c���c�c�B";
	mes "�������Ȃ������c�c�B";
	mes "�����c�c����Ă���΁c�c!";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk6";
	next;
	mes "[�߉q��]";
	mes "�c�c�B";
	mes "����A�����Ƃ���͈��������c�c�B";
	mes "���Ȃ񂾁c�c�����Ȃ킯���Ȃ��c�c�B";
	mes "�����A�P�l�B�N���Ă��������B";
	mes "����ȂƂ���ŐQ�Ă͂��̂�";
	mes "�������܂��B";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk7";
	next;
	mes "[�߉q��]";
	mes "�P�l�H�@�e�B�A���P�c�c�H";
	mes "�ǂ����āc�c";
	mes "�ǂ����Ėڂ��J���Ă���Ȃ��̂ł����b!?";
	mes "���́A�΂��Ă���Ȃ��̂ł����c�c!?";
	mes "�ǂ����āc�c�ǂ����āc�c";
	mes "�ǂ����c�c�āc�c�B";
	donpcevent getmdnpcname("�߉q��#dk5")+ "::OnTalk8";
	next;
	mes "[��̐�]";
	mes "���߂�B";
	mes "����͌������B";
	mes "�M�l�ɂ͕K�v�������P��";
	mes "���̐��E�ɂƂ��ẮA";
	mes "�s�v�������񂾂�B";
	mes "�����玀�񂾁B";
	announce "��̐� : ���߂�B����͌������B�M�l�ɂ͕K�v�������P�����̐��E�ɂƂ��ẮA�s�v�������񂾂�B�����玀�񂾁B",0x9,0xff0000,0x190,20,0,0;
	next;
	mes "[��̐�]";
	mes "����Ȃ̂Ɉ���ŁA";
	mes "����ł����܂�ς�����ҁB";
	mes "���E�̗͂̋ύt���ێ�����";
	mes "�Ƃ�����`�����ŁA�^����M�ԎҁB";
	mes "����ȗ͂������Ȃ���A";
	mes "�������~�̂��߂Ɏg���ҁc�c�B";
	announce "��̐� : ����Ȃ̂Ɉ���ŁA����ł����܂�ς�����ҁB���E�̗͂̋ύt���ێ�����Ƃ�����`�����ŁA�^����M�ԎҁB����ȗ͂������Ȃ���A�������~�̂��߂Ɏg���ҁc�c�B",0x9,0xff0000,0x190,20,0,0;
	next;
	mes "[��̐�]";
	mes "���̐��E�͂���ȕs�𗝂ň��";
	mes "�������Ă���񂾁B";
	mes "�ǂ����H�@���̂悤�Ȑ��E�A";
	mes "���݂���Ӗ��͂Ȃ��B";
	mes "�������낤�H";
	announce "��̐� : ���̐��E�͂���ȕs�𗝂ň�ꂩ�����Ă���񂾁B�ǂ����H�@���̂悤�Ȑ��E�A���݂���Ӗ��͂Ȃ��B�������낤�H",0x9,0xff0000,0x190,20,0,0;
	close2;
	cutin "b-tiara.BMP",255;
	hideonnpc getmdnpcname("�e�B�A���P#dk1");
	hideonnpc getmdnpcname("�߉q��#dk5");
	donpcevent getmdnpcname("#DK_BattleAnnounce")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("�e�B�A���P#dk1");
	end;
}

1@spa.gat,1,1,0	script	#DK_BattleAnnounce	139,{
OnStart:
	announce "�₽���� : �P�����Ȃ��߉q���Ƃ́B����܂ł̒p���ȁB",0x9,0xadd8e6,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : ��߂�A��߂Ă���!!�@�������āc�c�������Ă���ł��c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	set '@map$,getmdmapname("1@spa.gat");
	set '@label$,getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled1";
	areamonster '@map$,196,42,198,45,"���~�̉��g",2955,4,'@label$;
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@spa.gat"),getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled1");
	if('@count > 0) end;
	announce "�₽���� : �������ɁA���E�𑞂ނ̂��H�@�����̂͑S�āA�ア���O���B",0x9,0xadd8e6,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : ���́A���́c�c�A�����A�����A�ޏ��Ɓc�c�B",0x9,0x7cfc00,0x190,20,0,0;
	set '@map$,getmdmapname("1@spa.gat");
	set '@label$,getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled2";
	areamonster '@map$,196,27,198,29,"�����݂̉�",2953,2,'@label$;
	areamonster '@map$,196,27,198,29,"���߂��ʈ�",2954,2,'@label$;
	areamonster '@map$,196,52,198,54,"�����݂̉�",2953,2,'@label$;
	areamonster '@map$,196,52,198,54,"���߂��ʈ�",2954,2,'@label$;
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@spa.gat"),getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled2");
	if('@count > 0) end;
	announce "�₽���� : ���܂Ŗ����Ȃǂɂ��Ԃ炩����A�������瓦��������H",0x9,0xadd8e6,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : ����Ȃ�!!�@���̌�����F�߂Ă��܂��΁A�ޏ��́c�c�F�́c�c�{���Ɂc�c!!",0x9,0x7cfc00,0x190,20,0,0;
	set '@map$,getmdmapname("1@spa.gat");
	set '@label$,getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled3";
	areamonster '@map$,202,39,204,41,"�ڋ��ȐS",2950,2,'@label$;
	areamonster '@map$,202,39,204,41,"���i�̉�",2951,2,'@label$;
	areamonster '@map$,189,39,191,41,"�ڋ��ȐS",2950,2,'@label$;
	areamonster '@map$,189,39,191,41,"���i�̉�",2951,2,'@label$;
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@spa.gat"),getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled3");
	if('@count > 0) end;
	announce "�₽���� : �ق��H�@���̉R�̂��߂ɁA�ʂ̖����]���ɂȂ��Ă������Ƃ����̂��H",0x9,0xadd8e6,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : �c�c���A����́c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	set '@map$,getmdmapname("1@spa.gat");
	set '@label$,getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled4";
	areamonster '@map$,183,48,185,49,"���a�ȐS",2948,2,'@label$;
	areamonster '@map$,183,48,185,49,"�A�]����e",2958,2,'@label$;
	areamonster '@map$,194,38,195,40,"���a�ȐS",2948,2,'@label$;
	areamonster '@map$,194,38,195,40,"�A�]����e",2958,2,'@label$;
	areamonster '@map$,178,39,178,39,"���a�ȐS",2948,2,'@label$;
	areamonster '@map$,178,39,178,39,"�A�]����e",2958,2,'@label$;
	areamonster '@map$,201,41,202,42,"���a�ȐS",2948,2,'@label$;
	areamonster '@map$,201,41,202,42,"�A�]����e",2958,2,'@label$;
	end;
OnKilled4:
	set '@count,getmapmobs(getmdmapname("1@spa.gat"),getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled4");
	if('@count > 0) end;
	announce "�₽���� : ���O�͐l���E�߂�B�����^���^�m�X�Ƃ�����`���������ɂ��āc�c�ȁB",0x9,0xadd8e6,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : �c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	set '@map$,getmdmapname("1@spa.gat");
	set '@label$,getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled5";
	areamonster '@map$,198,28,200,30,"�����݂̉�",2953,3,'@label$;
	areamonster '@map$,198,28,200,30,"���߂��ʈ�",2954,3,'@label$;
	areamonster '@map$,201,51,203,53,"�����݂̉�",2953,3,'@label$;
	areamonster '@map$,201,51,203,53,"���߂��ʈ�",2954,3,'@label$;
	areamonster '@map$,197,48,198,49,"�����݂̉�",2953,3,'@label$;
	areamonster '@map$,197,48,198,49,"���߂��ʈ�",2954,3,'@label$;
	areamonster '@map$,183,35,185,37,"�����݂̉�",2953,3,'@label$;
	areamonster '@map$,183,35,185,37,"���߂��ʈ�",2954,3,'@label$;
	areamonster '@map$,188,22,190,24,"�����݂̉�",2953,3,'@label$;
	areamonster '@map$,188,22,190,24,"���߂��ʈ�",2954,3,'@label$;
	end;
OnKilled5:
	set '@count,getmapmobs(getmdmapname("1@spa.gat"),getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled5");
	if('@count > 0) end;
	announce "��̐� : �c�c�v���o��!!�@�M�l�̐S�̒ꂩ�畦�������鑞����!!",0x9,0xff0000,0x190,20,0,0;
	sleep 1000;
	announce "�Ⴂ�j�̐� : �c�c�c�c�B",0x9,0x7cfc00,0x190,20,0,0;
	set '@map$,getmdmapname("1@spa.gat");
	set '@label$,getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled6";
	areamonster '@map$,184,50,185,51,"���~�̉��g",2955,2,'@label$;
	areamonster '@map$,184,50,185,51,"�}�������j��Փ�",2956,2,'@label$;
	areamonster '@map$,184,33,185,34,"�����݂̉�",2953,2,'@label$;
	areamonster '@map$,184,33,185,34,"�B���ꂽ�����S",2957,2,'@label$;
	areamonster '@map$,200,45,202,47,"���߂��ʈ�",2954,2,'@label$;
	areamonster '@map$,200,45,202,47,"�}�����Ȃ����{",2949,2,'@label$;
	areamonster '@map$,198,40,199,42,"���a�ȐS",2948,2,'@label$;
	areamonster '@map$,198,40,199,42,"���~�̉��g",2955,2,'@label$;
	areamonster '@map$,197,24,198,25,"�ڋ��ȐS",2950,2,'@label$;
	areamonster '@map$,197,24,198,25,"�ǓƂȖ�",2952,2,'@label$;
	areamonster '@map$,206,41,208,42,"���i�̉�",2953,2,'@label$;
	areamonster '@map$,206,41,208,42,"�A�]����e",2954,2,'@label$;
	end;
OnKilled6:
	set '@count,getmapmobs(getmdmapname("1@spa.gat"),getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled6");
	if('@count > 0) end;
	announce "�₽���� : ������B�����^���^�m�X���~���錌�B�{���́c�c���O���~���Ă���񂶂�Ȃ����H",0x9,0xadd8e6,0x190,20,0,0;
	sleep 3000;
	announce "��̐� : �{���!!�@������!!�@����͑S�čŏ����猈�߂��Ă������Ɓc�c�I",0x9,0xff0000,0x190,20,0,0;
	sleep 3000;
	announce "��̐� : �M�l�Ƌ��ɁA���̐������Ő��߂邽�߂Ɂc�c��!!",0x9,0xff0000,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : �c�c�ہB�^���^�m�X�ȂǁA���܂育�ƂȂǊ֌W�Ȃ��c�c���́c�c���̈ӎv�Łc�c�E���̂��B",0x9,0x7cfc00,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : �v���o�����c�c���͎􂢂̌��m�T�N���C�B����̈ӎv�ł��̐��E�𑞂݁A�j�󂷂���́B",0x9,0x7cfc00,0x190,20,0,0;
	sleep 3000;
	announce "�Ⴂ�j�̐� : �P�C�I�X���A���L���A�T�����c�c���̎ז���������͎̂E���������B",0x9,0x7cfc00,0x190,20,0,0;
	monster getmdmapname("1@spa.gat"),197,41,"�􂢂̍���",2959,1,getmdnpcname("#DK_BattleAnnounce")+ "::OnKilled7";
	end;
OnKilled7:
	hideoffnpc getmdnpcname("���Â��߂̒j#dk");
	donpcevent getmdnpcname("���Â��߂̒j#dk")+ "::OnStart";
	end;
}

1@spa.gat,196,44,5	script	���Â��߂̒j#dk	685,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]���Â��߂̒j�����X����";
		mes "�@����Ў�ɗ����Ă���]";
		close;
	}
	stopnpctimer;
	if(checkquest(114755)&0x8) {
		mes "�]���Â��߂̒j�����X����";
		mes "�@����Ў�ɗ����Ă���]";
		next;
		if(select("�}��","��l�̉�b�𕷂�") == 1) {
			mes "�]���Ԃ��u���ɗ��ꂽ�̂��������]";
			close2;
			hideonnpc getmdnpcname("���Â��߂̒j#dk");
			announce "�]���ӂ̕��i���c�ݎn�߂��B���Ԃ���o�Ȃ���΂Ȃ�Ȃ��悤���]",0x9,0xffff00,0x190,20,0,0;
			misceffect 904,"";
			misceffect 35,getmdnpcname("�S��̉��{�o��");
			hideoffnpc getmdnpcname("�S��̉��{�o��");
			hideoffnpc getmdnpcname("����#dk11");
			end;
		}
	}
	mes "[���Â��߂̒j]";
	mes "�܂����̂Ă��͂��̂��̂�";
	mes "�ēx�܂����̐��E�ւ�";
	mes "�m�R�m�R�����߂��Ă���Ƃ͂ȁB";
	mes "���̂܂܂��ƂȂ���";
	mes "�f�r���Ă���΂悢���̂��B";
	unittalk "���Â��߂̒j : �܂����̂Ă��͂��̂��̂��ēx�܂����̐��E�ւƃm�R�m�R�����߂��Ă���Ƃ͂ȁB���̂܂܂��ƂȂ����f�r���Ă���΂悢���̂��B";
	next;
	cutin "cry-b.bmp",2;
	mes "[���Â��߂̒j]";
	mes "����őS�ĂƂ����킯�ł�";
	mes "�Ȃ����������c�c�܂������B";
	mes "�ǂ����H�@�����^���^�m�X�B";
	mes "��]�Ƌ��|�ɂ܂݂ꃂ���X�^�[��";
	mes "�ϖe�����҂����̌��́B";
	unittalk "���Â��߂̒j : ����őS�ĂƂ����킯�ł͂Ȃ����������c�c�܂������B�ǂ����H�@�����^���^�m�X�B��]�Ƌ��|�ɂ܂݂ꃂ���X�^�[�֕ϖe�����҂����̌��́B";
	next;
	cutin "cry-b.bmp",255;
	mes "[�����^���^�m�X]";
	mes "��₾�ȁA�T�N���C�B";
	mes "�䂪���߂錌�͂����Ƃ�����";
	mes "���ƈŁA���Ǝ����o������";
	mes "�[�g�Ȃ�Ô��Ȍ����c�c�B";
	unittalk "�����^���^�m�X : ��₾�ȁA�T�N���C�B�䂪���߂錌�͂����Ƃ����ƌ��ƈŁA���Ǝ����o�������[�g�Ȃ�Ô��Ȍ����c�c�B";
	next;
	mes "[�����^���^�m�X]";
	mes "�c�c�N�N�N�N�N�B";
	mes "�����Ă܂�������ȁA�l�ԁB";
	mes "���l�̕s�K�̖��͂ǂ����H";
	mes "�������A�悢�]���ɂȂ��";
	mes "�����܂Ō������Ă������c�c";
	mes "���낻��䖝�̌��E���B";
	unittalk "�����^���^�m�X : �c�c�N�N�N�N�N�B�����Ă܂�������ȁA�l�ԁB���l�̕s�K�̖��͂ǂ����H�@�������A�悢�]���ɂȂ�Ƃ����܂Ō������Ă������c�c���낻��䖝�̌��E���B";
	next;
	mes "[�����^���^�m�X]";
	mes "���̐l�Ԃ̌����c�c";
	mes "��ɕ�����̂��I�@�T�N���C�B";
	mes "�����܂ŋɏ�̍��肪����";
	mes "���̓�����Y�킹���l�Ԃ�";
	mes "���Ȃ蒿�����c�c�I";
	unittalk "�����^���^�m�X : ���̐l�Ԃ̌����c�c��ɕ�����̂��I�@�T�N���C�B�����܂ŋɏ�̍��肪���錌�̓�����Y�킹���l�Ԃ͂��Ȃ蒿�����c�c�I";
	next;
	mes "[�T�N���C]";
	mes "�^���^�m�X�����������l�ԁc�c�B";
	mes "������������j�����Ă݂����A";
	mes "�����܂ł̂悤���ȁB";
	mes "�c�c";
	mes "���O�́c�c�B";
	unittalk "�T�N���C : �^���^�m�X�����������l�ԁc�c�B������������j�����Ă݂����A�����܂ł̂悤���ȁB�c�c���O�́c�c�B";
	next;
	mes "[�T�N���C]";
	mes "�c�c���̊�B";
	mes "�������A���O���A����";
	mes "���̐��E�ւƓ�����";
	mes "���l�悵�̖`���҂������̂��B";
	unittalk "�T�N���C : �c�c���̊�B�������A���O���A�������̐��E�ւƓ��������l�悵�̖`���҂������̂��B";
	next;
	menu "�܂����c�c",-;
	mes "[�T�N���C]";
	mes "�����A���̎��̋߉q���������B";
	mes "���m�ɂ́A���̒�����ǂ��o����";
	mes "����Ƃ������̂�����Ȃ����݁B";
	mes "���̋L���̎c��̂悤�Ȃ��́B";
	mes "���ꂪ���O�̎����";
	mes "�ǂ������킯���A���ꂽ�炵���B";
	unittalk "�T�N���C : �����A���̎��̋߉q���������B���m�ɂ́A���̒�����ǂ��o��������Ƃ������̂�����Ȃ����݁B���̋L���̎c��̂悤�Ȃ��́B���ꂪ���O�̎���ɂǂ������킯���A���ꂽ�炵���B";
	next;
	mes "[�T�N���C]";
	mes "�����ċ͂��Ɏc����������Ȃ�";
	mes "���`�����炨�O�ɏ��������߁A";
	mes "�����ɖ߂��Ă����悤����";
	mes "����͍��A������荞�ݏ��ł����B";
	mes "���ǂ��O�̂�������Ƃ́A";
	mes "���ʂɏI������Ƃ������Ƃ��B";
	unittalk "�T�N���C : �����ċ͂��Ɏc����������Ȃ����`�����炨�O�ɏ��������߁A�����ɖ߂��Ă����悤��������͍��A������荞�ݏ��ł����B���ǂ��O�̂�������Ƃ́A���ʂɏI������Ƃ������Ƃ��B";
	next;
	mes "[�����^���^�m�X]";
	mes "�T�N���C�B";
	mes "���ʘb�����Ă���ɂ�����Ȃ�";
	mes "���̎҂̌��𑁂��c�c";
	mes "������ɕ�����̂��c�c�I";
	unittalk "�����^���^�m�X : �T�N���C�B���ʘb�����Ă���ɂ�����Ȃ炠�̎҂̌��𑁂��c�c������ɕ�����̂��c�c�I";
	next;
	mes "[�T�N���C]";
	mes "�ł�ȁA�^���^�m�X��B";
	mes "�c�c���O�ɖ₢�������Ƃ�����B";
	mes "��قǁA���O���P���������X�^�[�B";
	mes "����͂��̍��ɏZ��ł���";
	mes "���m�Ȃǂ̌��l�ԁB";
	mes "�������a�������z�͂ǂ����H";
	unittalk "�T�N���C : �ł�ȁA�^���^�m�X��B�c�c���O�ɖ₢�������Ƃ�����B��قǁA���O���P���������X�^�[�B����͂��̍��ɏZ��ł������m�Ȃǂ̌��l�ԁB�������a�������z�͂ǂ����H";
	next;
	switch(select("�����Ȃ�","������")) {
	case 1:
		mes "[�T�N���C]";
		mes "�ق��H";
		mes "������C�͂Ȃ��̂��B";
		mes "�����A���ʂ͕ς��Ȃ��B";
		mes "�����X�^�[�ł���A���l�ł���A";
		mes "����D�����Ƃ��������͂�!!";
		mes "���ɂ���c�c";
		unittalk "�T�N���C : �ق��H�@������C�͂Ȃ��̂��B�����A���ʂ͕ς��Ȃ��B�����X�^�[�ł���A���l�ł���A����D�����Ƃ��������͂�!!�@���ɂ���c�c";
		break;
	case 2:
		mes "[�T�N���C]";
		mes "�ق��A���O�͂����������̂��B";
		mes "����͖ʔ����B";
		mes "�����A���ʂ͕ς��Ȃ��B";
		mes "�����X�^�[�ł���A���l�ł���A";
		mes "����D�����Ƃ��������͂ȁB";
		mes "���ɂ���c�c";
		unittalk "�T�N���C : �ق��A���O�͂����������̂��B����͖ʔ����B�����A���ʂ͕ς��Ȃ��B�����X�^�[�ł���A���l�ł���A����D�����Ƃ��������͂ȁB���ɂ���c�c";
		break;
	}
	next;
	mes "[�T�N���C]";
	mes "���̉^���͑��̒N�ł��Ȃ��B";
	mes "�����ォ�����䂦�̌��ʁB";
	mes "�����Ă��̎コ���A���O��";
	mes "���̎��Ԃ̂��̏ꏊ��";
	mes "�������ꂽ�̂��낤�c�c�B";
	unittalk "�T�N���C : ���̉^���͑��̒N�ł��Ȃ��B�����ォ�����䂦�̌��ʁB�����Ă��̎コ���A���O�����̎��Ԃ̂��̏ꏊ�ɏ������ꂽ�̂��낤�c�c�B";
	next;
	menu "�͂��߂��狭���l�Ԃ͂��Ȃ�",-;
	mes "[�T�N���C]";
	mes "���̒ʂ肾�B";
	mes "�����炱�����́A�ߋ��̎����̎コ��";
	mes "�f���؂邽�߁A�����ɗ����̂��B";
	mes "�������A���͂��̂��A�Ŏ��͂悢���Ƃ�";
	mes "�v�������Ƃ��ł����̂�����A";
	mes "���O�ɂ͂ЂƂ܂��A���ӂ��悤�B";
	unittalk "�T�N���C : ���̒ʂ肾�B�����炱�����́A�ߋ��̎����̎コ��f���؂邽�߁A�����ɗ����̂��B�������A���͂��̂��A�Ŏ��͂悢���Ƃ��v�������Ƃ��ł����̂�����A���O�ɂ͂ЂƂ܂��A���ӂ��悤�B";
	next;
	mes "[�����^���^�m�X]";
	mes "�T�N���C�A�M�l�Ȃɂ��c�c�B";
	unittalk "�����^���^�m�X : �T�N���C�A�M�l�Ȃɂ��c�c�B";
	next;
	mes "[�T�N���C]";
	mes "�^���^�m�X��B�z�̌���";
	mes "�ɏ�̍��肾�Ƃ������ȁH";
	mes "�Ȃ�΂����Ƃ��̍���̎����A";
	mes "�ō��̏�ԂŖ�����Ă݂�����";
	mes "�v��Ȃ����c�c�H";
	unittalk "�T�N���C : �^���^�m�X��B�z�̌��͋ɏ�̍��肾�Ƃ������ȁH�Ȃ�΂����Ƃ��̍���̎����A�ō��̏�ԂŖ�����Ă݂����Ǝv��Ȃ����c�c�H";
	next;
	mes "[�����^���^�m�X]";
	mes "�ق��c�c�H";
	mes "�M�l�ɂ͂����Ȃ�ڎZ��";
	mes "����Ƃ������ƂȂ̂��ȁH";
	mes "�ǂ����낤�B";
	mes "�M�l�̊�݂ɏ���Ă�낤�B";
	unittalk "�ق��c�c�H�@�M�l�ɂ͂����Ȃ�ڎZ������Ƃ������ƂȂ̂��ȁH�@�ǂ����낤�B�M�l�̊�݂ɏ���Ă�낤�B";
	next;
	mes "[�T�N���C]";
	mes "�����ł��O���E���Ă�";
	mes "���̈Ӗ���������B";
	mes "�䂦�ɍ���͌��������Ƃɂ���B";
	mes "���O�͌��m��ʎ҂̂��߂ɁA";
	mes "�m�R�m�R�Ǝ��Ԉړ��܂ł���";
	mes "�����悤�Ƃ����قǂ��B";
	unittalk "�T�N���C : �����ł��O���E���Ă͂��̈Ӗ���������B�䂦�ɍ���͌��������Ƃɂ���B���O�͌��m��ʎ҂̂��߂ɁA�m�R�m�R�Ǝ��Ԉړ��܂ł��ď����悤�Ƃ����قǂ��B";
	next;
	mes "[�T�N���C]";
	mes "�����Ɛ��E��m��A���̐���";
	mes "�s�𗝂ȗ��ɐ�]���邪�����B";
	mes "�����Đl�̗̖͂��͂�������";
	mes "��]�������c�c���O�̌���";
	mes "�����A�z����₷��قǊÔ��Ȗ���";
	mes "�Ȃ邾�낤�B";
	unittalk "�T�N���C : �����Ɛ��E��m��A���̐��̕s�𗝂ȗ��ɐ�]���邪�����B�����Đl�̗̖͂��͂���������]�������c�c���O�̌��͂����A�z����₷��قǊÔ��Ȗ��ƂȂ邾�낤�B";
	next;
	mes "�]���ꂾ��������";
	mes "�@�T�N���C�͉����Ȃ�";
	mes "�@�ł̒��ɏ������B";
	mes "�@���̎p�ɍ��������A";
	mes "�@��l�̕P����낤�Ƃ���";
	mes "�@�߉q���̖ʉe�͂Ȃ������c�c�]";
	close2;
	hideonnpc getmdnpcname("���Â��߂̒j#dk");
	hideoffnpc getmdnpcname("#dk_tb");
	hideoffnpc getmdnpcname("#dk_sv");
	hideoffnpc getmdnpcname("#dk_tv");
	donpcevent getmdnpcname("#dk_tb")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9,getmdnpcname("���Â��߂̒j#dk");
	end;
}

1@spa.gat,196,46,1	script	#dk_tb	844,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	unittalk "�D������ : ���͊��ӂ��Ă��܂��B�M���ɉ�����Ƃ��c�c�B";
	end;
OnTimer8000:
	donpcevent getmdnpcname("#dk_sv")+ "::OnTalk1";
	end;
OnTimer13000:
	donpcevent getmdnpcname("#dk_tv")+ "::OnTalk1";
	end;
OnTimer17000:
	donpcevent getmdnpcname("#dk_tv")+ "::OnTalk2";
	end;
OnTimer22000:
	donpcevent getmdnpcname("#dk_sv")+ "::OnTalk2";
	end;
OnTimer25000:
	donpcevent getmdnpcname("#dk_sv")+ "::OnTalk3";
	end;
OnTimer28000:
	stopnpctimer;
	hideonnpc getmdnpcname("#dk_tb");
	hideonnpc getmdnpcname("#dk_sv");
	hideonnpc getmdnpcname("#dk_tv");
	announce "�]���ӂ̕��i���c�ݎn�߂��B���Ԃ���o�Ȃ���΂Ȃ�Ȃ��悤���]",0x9,0xffff00,0x190,20,0,0;
	misceffect 35,getmdnpcname("�S��̉��{�o��");
	hideoffnpc getmdnpcname("�S��̉��{�o��");
	hideoffnpc getmdnpcname("����#dk11");
	end;
}

1@spa.gat,198,43,1	script	#dk_sv	844,{
	end;
OnTalk1:
	unittalk "�Ⴂ�j�̐� : �����S���������B���ꂩ��͂����ƁA�P�l�̖T�ɂ���܂��B������l�ɂ͂��܂���c�c�B";
	end;
OnTalk2:
	unittalk "�Ⴂ�j�̐� : �Ă���ɂ͋y�΂Ȃ��B��x���킵���_���Y�����̂��B";
	end;
OnTalk3:
	unittalk "�Ⴂ�j�̐� : �䂪���̓T�N���C�B�䂪������߂�ߖY���ȁB�ĂсA����������܂łȁc�c�B";
	end;
}

1@spa.gat,196,41,1	script	#dk_tv	844,{
	end;
OnTalk1:
	unittalk "��̐� : �Y���ȁA�T�N���C�B���ƌ��킵�����̌_����B";
	end;
OnTalk2:
	unittalk "��̐� : ���𖞑������錌��������܂ŁA�M�l�̍��͎��̃��m���B�N�N�N�N�N�N�c�c�B";
	end;
}

1@spa.gat,204,29,1	script	����#dk11	965,{
	if(checkquest(114765)&0x8){
		mes "[����]";
		mes "�ǂ����T�N���C��";
		mes "�~���Ă���Ă���c�c�B";
		close;
	}
	mes "[����]";
	mes "�c�c������ʁB";
	mes "���̋L���͎��̂��̂Ȃ̂��H";
	mes "����Ƃ��A�T�N���C�̋L���ɂ��";
	mes "�`�����낤���ĕۂ��Ă���";
	mes "�����̑��݂Ȃ̂��c�c�B";
	next;
	mes "[����]";
	mes "���̑��݂ɂȂ��Ă���";
	mes "�����L�����Ă�����̂��A";
	mes "�����g�̋L���Ȃ̂��A";
	mes "�T�N���C���g�̋L���Ȃ̂��c�c";
	mes "�L�����������Ă���A";
	mes "������Ȃ���ԂȂ̂��c�c�B";
	next;
	mes "[����]";
	mes "����ł�������͂������";
	mes "�����邱�Ƃ�����Ƃ���΁A";
	mes "�T�N���C�̌��t��M�����A";
	mes "�䂪���̖{�S���������Ȃ�����";
	mes "�Ԕ����́A���̒N�ł��Ȃ�";
	mes "�����g�Ƃ������Ƃ��B";
	next;
	mes "[����]";
	mes "���̂悤�Ȑg�䂦�A";
	mes "�����o���鎖�͌����Ă��܂����A";
	mes "�����ł��T�N���C�Ɖ䂪���ւ�";
	mes "�ߖłڂ��ɂȂ�̂ł���΁A";
	mes "���͂͐ɂ��܂Ȃ��c�c�B";
	next;
	mes "[����]";
	mes "���̋�ԂŐ����c�����Ƃ�������";
	mes "���Ȃ����r�Ɋo��������ƌ�����B";
	mes "���ށA�ǂ����T�N���C���~���Ă���B";
	next;
	mes "[����]";
	mes "�����o���鎖�͏��Ȃ��B";
	mes "�S�΂���ł͂��邪";
	mes "�䂪���ɕۊǂ���Ă���";
	mes "�����������悤�B";
	next;
	mes "[����]";
	mes "����ƁA���̋L���̌��Ђ�";
	mes "�����Ă����Ȃ����B";
	next;
	mes "[����]";
	mes "���̋L���̌��Ђɂ�";
	mes "�L���̗͂��h���Ă���B";
	mes "�L���̌��Ђ��g�p���邱�Ƃ�";
	mes "�䂪���ɕۊǂ���Ă���������";
	mes "���B���鎖���ł��邾�낤�B";
	next;
	mes "[����]";
	mes "���āA���ꂪ���Ȃ��Ɏ����鑕�����B";
	mes "�����A�䂪���Ɏc���ꂽ��͏��Ȃ��B";
	mes "�K���������Ȃ���^ff0000�~��������";
	mes "�n����Ƃ͌���Ȃ�^000000�̂��B";
	mes "���܂�ȁc�c�B";
	next;
	mes "[����]";
	mes "����ł͂��̑�����";
	mes "���Ȃ��Ɏ����悤�B";
	mes "�ǂ����T�N���C��";
	mes "�~���Ă���Ă���c�c�B";
	if(!checkquest(114755)) {
		setquest 114755;
		compquest 114755;
	}
	setquest 114765;
	compquest 114765;
	getitem 6672,3;
	setarray '@gain,1446,1499,1698,1840,1942,1998,2032,13458,15160,15161,16042,18136,20793,21022,22088,28013,28112,28711,28911;
	getitem '@gain[rand(getarraysize('@gain))],1;
	set '@user,getmapusers("this");
	if('@user <= 1) {
		set '@bexp,400000;
		set '@jexp,400000;
	}
	else if('@user <= 5) {
		set '@bexp,500000 * '@user;
		set '@jexp,300000 + 100000 * '@user;
	}
	else {
		set '@bexp,3000000;
		set '@jexp,1000000;
	}
	getexp '@bexp,0,1;
	getexp 0,'@jexp,0;
	close;
}

1@spa.gat,210,28,0	script	�S��̉��{�o��	45,2,2,{
	mes "�]�c�c�i�F���h�炢�ł���B";
	mes "�@���낻��L���̒��̐��E����";
	mes "�@����鎞�Ԃ̂悤���]";
	close2;
	warp "dali02.gat",46,129;
	end;
}
