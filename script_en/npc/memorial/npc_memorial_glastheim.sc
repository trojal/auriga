//= Auriga Script ==============================================================
// Ragnarok Online Old Glastheim Script	by refis
//==============================================================================

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
glast_01.gat,204,273,3	script	�t�M��	755,{
	if(BaseLevel < 130) {
		mes "[�t�M��]";
		mes "�ӂށA�N�ł͕͗s�����ˁB";
		next;
		mes "[�t�M��]";
		mes "�������ȁc�cBaseLv130�ȏ�ɂȂ�����";
		mes "���������Ă��炦�邩�ȁH";
		close;
	}
	if(checkquest(12322))
		delquest 12322;
	if(checkquest(12317)) {
		if(!(checkquest(12317) & 0x2)) {
			mes "[�t�M��]";
			mes "������";
			mes "�N�͂܂��������s�̌��ǂ�";
			mes "�c���Ă���悤���B";
			mes "���̌N�ł͎������s�͂炢���낤�B";
			next;
			mes "[�t�M��]";
			mes "���ǂ��Ȃ��Ȃ�����";
			mes "�܂����Ă��ꂽ�܂��B";
			delquest 12318;
			delquest 12319;
			close;
		}
		mes "^0000ff�]�ẪO���X�g�w�C���̌��ǂ�^000000";
		mes "^0000ff�@�S�ď����܂����]^000000";
		delquest 12317;
		delquest 12318;
		delquest 12319;
		next;
		mes "[�t�M��]";
		mes "����H�@���ɂ��������Ƃ�����H";
		mes "�͂͂́A�l�Ⴂ�ł͂Ȃ����ȁB";
		next;
		mes "[�t�M��]";
		mes "���̖��̓t�M���B";
		mes "���ԂƎ����̋��Ԃ���������ҁc�c";
		mes "�Ƃł������Ă������B";
		next;
		mes "[�t�M��]";
		mes "�N�̓O���X�g�w�C���̉ߋ��ɂ���";
		mes "���������邩���H";
		next;
		mes "[�t�M��]";
		mes "�^����m���Ă���ߋ���";
		mes "�͂����Ď��ɂǂ̂悤��";
		mes "�����������̂��c�c�Ȃ�ĂȁB";
		next;
		mes "[�t�M��]";
		mes "�������s�͉\�ɂȂ����̂����c�c�B";
		mes "�w�҂̎��ł͂ƂĂ�����Ȃ���";
		mes "�����Ŋm�F����͕̂|���̂���B";
		next;
		mes "[�t�M��]";
		mes "�������ȁB";
		mes "�N�ɂȂ�ł��邩������Ȃ��B";
		next;
		mes "[�t�M��]";
		mes "���̑���Ɏ������s��";
		mes "���Ă݂�C�͂Ȃ����ˁH";
		next;
		if(select("�����ł���","��������܂���") == 2) {
			mes "[�t�M��]";
			mes "�������ˁH";
			mes "�܂��A����������Ƃ��ɂł�";
			mes "�܂����Ă��ꂽ�܂��B";
			close;
		}
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[�t�M��]";
			mes "�b���ʂ��鑊��ł悩������B";
			mes "�ł͂ǂ����邩�ˁH ";
			set '@str1$,"���Ԃ̘c�ݐ���";
			set '@str2$,"�ẪO���X�g�w�C���ɓ��ꂷ��";
		}
		else {
			mes "[�t�M��]";
			mes "�b���ʂ��鑊��ł悩������B";
			mes "�ł͂ǂ����邩�ˁH ";
			set '@str2$,"�ẪO���X�g�w�C���ɓ��ꂷ��";
		}
		next;
		setquest 72950;
	}
	else if(!checkquest(72950)) {
		mes "[�t�M��]";
		mes "�����́A�O���X�g�w�C����";
		mes "���̂悤�Ȏp�ł͂Ȃ������B";
		next;
		mes "[�t�M��]";
		mes "�����ƁA���l��O�ɂ���";
		mes "�܂��Ƃ茾���������Ă��܂����ȁB";
		next;
		mes "[�t�M��]";
		mes "���̖��̓t�M���B";
		mes "���ԂƎ����̋��Ԃ���������ҁc�c";
		mes "�Ƃł������Ă������B";
		next;
		menu "�w�҂��񂪂Ȃ�����ȂƂ���ɁH",-;
		mes "[�t�M��]";
		mes "�N�̓O���X�g�w�C���̉ߋ��ɂ���";
		mes "���������邩���H";
		next;
		mes "[�t�M��]";
		mes "���͎��ԂƎ����̋��Ԃ��������Ă��邪";
		mes "��������ԋC�ɂȂ�ꏊ�������̂���B";
		next;
		mes "[�t�M��]";
		mes "�͂����ăV���~�b�c����";
		mes "���[���~�b�h�K�b�c�̗��j�ʂ��";
		mes "�\�N�������̂��c�c";
		mes "����Ƃ���X�̒m��Ȃ�";
		mes "���j�̘c�Ȃ��������̂��c�c�B";
		next;
		mes "[�t�M��]";
		mes "�^����m���Ă���ߋ���";
		mes "�͂����Ď��ɂǂ̂悤��";
		mes "�����������̂��c�c�Ȃ�ĂȁB";
		next;
		if(select("���ʂ��C�ɂȂ�܂�","��������܂���") == 2) {
			mes "[�t�M��]";
			mes "�������ˁH";
			mes "�܂��A����������Ƃ��ɂł�";
			mes "�܂����Ă��ꂽ�܂��B";
			close;
		}
		mes "[�t�M��]";
		mes "���ʁc�c���B";
		mes "�������s�͉\�ɂȂ����̂����c�c�B";
		mes "�w�҂̎��ł͂ƂĂ�����Ȃ���";
		mes "�����Ŋm�F����͕̂|���̂���B";
		next;
		mes "[�t�M��]";
		mes "�������ȁB";
		mes "�N�ɂȂ�ł��邩������Ȃ��B";
		next;
		mes "[�t�M��]";
		mes "���̑���Ɏ������s��";
		mes "���Ă݂�C�͂Ȃ����ˁH";
		next;
		if(select("�����ł���","��������܂���") == 2) {
			mes "[�t�M��]";
			mes "�������ˁH";
			mes "�܂��A����������Ƃ��ɂł�";
			mes "�܂����Ă��ꂽ�܂��B";
			close;
		}
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[�t�M��]";
			mes "�b���ʂ��鑊��ł悩������B";
			mes "�ł͂ǂ����邩�ˁH ";
			set '@str1$,"���Ԃ̘c�ݐ���";
			set '@str2$,"�ẪO���X�g�w�C���ɓ��ꂷ��";
		}
		else {
			mes "[�t�M��]";
			mes "�b���ʂ��鑊��ł悩������B";
			mes "�ł͂ǂ����邩�ˁH ";
			set '@str2$,"�ẪO���X�g�w�C���ɓ��ꂷ��";
		}
		next;
		setquest 72950;
		//setquest 12316;
		//compquest 12316;
	}
	else {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[�t�M��]";
			mes "�ł͂ǂ����邩�ˁH ";
			set '@str1$,"���Ԃ̘c�ݐ���";
			set '@str2$,"�ẪO���X�g�w�C���ɓ��ꂷ��";
		}
		else {
			mes "[�t�M��]";
			mes "�ł͂ǂ����邩�ˁH ";
			set '@str2$,"�ẪO���X�g�w�C���ɓ��ꂷ��";
		}
		next;
	}
	if(getonlinepartymember() < 1) {
		mes "[�t�M��]";
		mes "1�l�ȏ�̃p�[�e�B�[��g�ނ�";
		mes "�p�[�e�B�[�ɓ�������Ԃ�";
		mes "�b�������Ă���邩�ȁH";
		close;
	}
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	switch(select('@str1$,'@str2$,"��߂�")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�p�[�e�B�[���F" +'@party$;
			mes "�p�[�e�B�[���[�_�[���F" +'@leader$;
			mes "^0000ffGlast Heim ^000000�] �\�񎸔s";
			close;
		}
		mdcreate "Glast Heim";
		mes "[�t�M��]";
		mes "���Ԃ̘c�݂��������ꂽ��";
		mes "�܂����ɘb�������Ă���B";
		close;
	case 2:
		mes "[�t�M��]";
		mes "����ł͂�낵�����ށB";
		mes "�Ȃ�����͉ߋ��̎���̐l�Ԃ��B";
		mes "����ɉ����܂�Ȃ��悤��";
		mes "^FF0000��b�̓p�[�e�B�[�̑�\�҂�";
		mes "����悤�ɂ������������B^000000";
		next;
		mes "^ff0000�]�p�[�e�B�[���[�_�[�����Ȃ���Ԃł�^000000";
		mes "^ff0000�@����ɐi�s���Ȃ��ӏ�������܂��B^000000";
		mes "^ff0000�@�����ӂ��������]^000000";
		next;
		switch(mdenter("Glast Heim")) {
		case 0:	// �G���[�Ȃ�
			announce strcharinfo(1)+ "�p�[�e�B�[��" +strcharinfo(0)+ "�p�[�e�B�[����Glast Heim�ɓ��ꂵ�܂�",0x9,0x00FF99;
			delquest 72950;
			setquest 12317;
			setquest 12318;
			donpcevent getmdnpcname("#0����")+ "::OnStart";
			//warp "1@gl_k.gat",150,20;
			end;
		case 1:	// �p�[�e�B�[������
			mes "[�t�M��]";
			mes "���Ԃ̘c�݂ɓ�����Ԃł͂Ȃ��ˁB";
			mes "�p�[�e�B�[��g�܂Ȃ���";
			mes "���Ԃ̘c�݂ɂ͓���Ȃ��̂���B";
			close;
		case 2:	// �_���W�������쐬
			mes "[�t�M��]";
			mes "�܂����Ԃ̘c�݂�";
			mes "��������ĂȂ��悤����";
			close;
		default:	// ���̑��G���[
			close;
		}
	case 3:
		mes "[�t�M��]";
		mes "�������o������܂����Ȃ����B";
		close;
	}
}

//============================================================
// �ẪO���X�g�w�C��1F
//------------------------------------------------------------
1@gl_k.gat,1,1,1	script	#0����	844,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;

	hideonnpc getmdnpcname("�o�������g#1");
	hideonnpc getmdnpcname("�o�������g#2");
	hideonnpc getmdnpcname("�n�C�����q#1");
	hideonnpc getmdnpcname("�n�C�����q#2");
	hideonnpc getmdnpcname("�n�C�����q#3");
	hideonnpc getmdnpcname("�n�C�����q#4");
	hideonnpc getmdnpcname("�q�������Y#1");
	hideonnpc getmdnpcname("�q�������Y#2");
	hideonnpc getmdnpcname("�A�R���C�g�u�]���h����#");
	hideonnpc getmdnpcname("�b�艮�f�X�g���C���[#1");

	hideonnpc getmdnpcname("#2����");
	hideonnpc getmdnpcname("#2����2");
	hideonnpc getmdnpcname("#3����");
	hideonnpc getmdnpcname("#3����2");
	hideonnpc getmdnpcname("#4����");
	hideonnpc getmdnpcname("#4����2");
	hideonnpc getmdnpcname("#2�K�����");
	hideonnpc getmdnpcname("#�q����on");

	hideonnpc getmdnpcname("�q�������Y#23");
	hideonnpc getmdnpcname("�o�������g�̌��e#1");
	hideonnpc getmdnpcname("�o�������g�̌��e#2");
	hideonnpc getmdnpcname("�o�������g�̌��e#3");
	hideonnpc getmdnpcname("�o�������g�̌��e#4");
	hideonnpc getmdnpcname("�t�M��#21");

	hideonnpc getmdnpcname("#22����");
	hideonnpc getmdnpcname("#22����2");
	hideonnpc getmdnpcname("#23����");
	hideonnpc getmdnpcname("#23����2");
	hideonnpc getmdnpcname("#24����");
	hideonnpc getmdnpcname("#24����2");

	hideonnpc getmdnpcname("�������T��#1");
	end;
}

1@gl_k.gat,2,1,0	script	#0����_bc	139,{
}

1@gl_k.gat,145,104,6	script	�J�[���b�c�o�[�O�R�m#1	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "���������Ζ����̎��ԂȂ̂ɁA";
	mes "������肪�N�����݂�����";
	mes "���̐l�����Ȃ���ł��B";
	close;
}

1@gl_k.gat,145,99,6		script	���̋R�m#3	657,{
	mes "[���̋R�m]";
	mes "�o�������g�l�ƈꏏ�ɗ������ł����H";
	mes "�i�ߊ������҂����Ă���܂��B";
	close;
}

1@gl_k.gat,145,94,6		script	�J�[���b�c�o�[�O�R�m#5	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "���̖����C�ɂȂ�܂��B";
	mes "���ꂳ�񂪖��ɏo�Ă�����ł��B";
	mes "��������̂��ȁc�c";
	close;
}

1@gl_k.gat,145,89,6		script	���̋R�m#7	657,{
	mes "[���̋R�m]";
	mes "�����ł̎���͂Ȃ�ׂ��T���ĉ������B";
	close;
}

1@gl_k.gat,145,84,6		script	�J�[���b�c�o�[�O�R�m#9	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�Ïl�ɂ��ĉ������B";
	close;
}

1@gl_k.gat,145,79,6		script	���̋R�m#11	657,{
	mes "[���̋R�m]";
	mes "����ł����A�o�������g�l�Ƃ�";
	mes "�ǂ̂悤�Ȋ֌W�ł����B";
	mes "�l�Ƃ̂����������܂莝���Ȃ�������";
	mes "�����܂������c�c�B";
	close;
}

1@gl_k.gat,145,74,6		script	�J�[���b�c�o�[�O�R�m#13	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "��̒��̋C�z������";
	mes "����������܂��񂩁H";
	mes "�����O���牽���̋C�z��";
	mes "�������C�����܂��B";
	close;
}

1@gl_k.gat,145,69,6		script	���̋R�m#15	657,{
	mes "[���̋R�m]";
	mes "�Ζ����̎����";
	mes "�D�܂�������܂���B";
	close;
}

1@gl_k.gat,145,64,6		script	�J�[���b�c�o�[�O�R�m#17	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�c�c�B";
	close;
}

1@gl_k.gat,145,59,6		script	���̋R�m#19	657,{
	mes "[���̋R�m]";
	mes "���ɉ�����p�ł����H";
	close;
}

1@gl_k.gat,145,54,6		script	�J�[���b�c�o�[�O�R�m#21	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�c�c�B";
	close;
}

1@gl_k.gat,154,104,3	script	�J�[���b�c�o�[�O�R�m#2	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�ӂӁA���Ƃ��b��������ł����H";
	close;
}

1@gl_k.gat,154,99,3		script	���̋R�m#4	657,{
	mes "[���̋R�m]";
	mes "�����������̎��Ԃ��Ƃ����̂�";
	mes "���̎҂����Ȃ��̂ł��B";
	mes "������肪�N�����̂ł��傤���H";
	close;
}

1@gl_k.gat,154,94,3		script	�J�[���b�c�o�[�O�R�m#6	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�o�������g�l�ƈꏏ�ɗ������ł��ˁH";
	mes "�i�ߊ������҂����Ă܂���B";
	close;
}

1@gl_k.gat,154,89,3		script	���̋R�m#8	657,{
	mes "[���̋R�m]";
	mes "�����ł̎���͍T���ĉ������B";
	close;
}

1@gl_k.gat,154,84,3		script	�J�[���b�c�o�[�O�R�m#10	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�Â��ɂ��Ȃ����B";
	close;
}

1@gl_k.gat,154,79,3		script	���̋R�m#12	657,{
	mes "[���̋R�m]";
	mes "����ł����A�o�������g�l�Ƃ�";
	mes "�ǂ̂悤�Ȋ֌W�ł����B";
	mes "�l�Ƃ̂����������܂莝���Ȃ�������";
	mes "�����܂������c�c�B";
	close;
}

1@gl_k.gat,154,74,3		script	�J�[���b�c�o�[�O�R�m#14	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "��̒��̋C�z������";
	mes "����������܂��񂩁H";
	mes "�����O���牽���̋C�z��";
	mes "�������C�����܂��B";
	close;
}

1@gl_k.gat,154,69,3		script	���̋R�m#16	657,{
	mes "[���̋R�m]";
	mes "�Ζ����̎����";
	mes "�D�܂�������܂���B";
	close;
}

1@gl_k.gat,154,64,3		script	�J�[���b�c�o�[�O�R�m#18	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�c�c�B";
	close;
}

1@gl_k.gat,154,59,3		script	���̋R�m#20	657,{
	mes "[���̋R�m]";
	mes "���ɉ�����p�ł����H";
	close;
}

1@gl_k.gat,154,54,3		script	�J�[���b�c�o�[�O�R�m#22	655,{
	mes "[�J�[���b�c�o�[�O�R�m]";
	mes "�c�c�B";
	close;
}

1@gl_k.gat,149,41,5	script	�o�������g#0	654,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		cutin "GL_BARMUND1",2;
		if(OLDGLAST_QUE >= 1) {
			mes "�]�����������j�������Ă���]";
			next;
			if(select("�}��","��b������") == 1) {
				mes "[�o�������g]";
				mes "�}���I�@�n�C�����q���̏��ɍs����";
				mes "�q�������Y�̎���m�点��B";
				mes "���������Ɍ������I";
				unittalk "�o�������g : �}���I�@�n�C�����q���̏��ɍs���� �q�������Y�̎���m�点��B���������Ɍ������I";
				close2;
				cutin "GL_BARMUND2",255;
				donpcevent getmdnpcname("�o�������g#0")+"::OnStart";
				end;
			}
		}
		mes "[�o�������g]";
		mes "^0000ff�w���R^000000���悱����";
		mes "���͎҂Ƃ����̂͌N�Ȃ̂��H";
		unittalk "�o�������g : �w���R���悱�������͎҂Ƃ����̂͌N�Ȃ̂��H";
		next;
		mes "�]�w���R�Ƃ����l�����悱����";
		mes "�@���͎҂�҂��Ă���悤���B";
		mes "�@�w���R�Ƃ����l���͒m��Ȃ���";
		mes "�@�����͘b�����킹�Ă������]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���A�͂͂́A�w���R����";
		mes "���҃o�������g�l�ɉ���Ă݂��";
		mes "�����Ă��܂����B";
		unittalk getcharid(3),strcharinfo(0)+" : ���A�͂͂́A�w���R���񂪌��҃o�������g�l�ɉ���Ă݂�ƌ����Ă��܂����B";
		next;
		cutin "GL_BARMUND2",2;
		mes "[�o�������g]";
		mes "�������B�����ň��������Ԃ��Ȃ��B";
		mes "�n�C�����q���Ƀq�������Y�̐N����";
		mes "���Ęb���Ȃ���΂Ȃ�Ȃ��̂��B";
		unittalk "�o�������g : �������B�����ň��������Ԃ��Ȃ��B�n�C�����q���Ƀq�������Y�̐N���ɂ��Ęb���Ȃ���΂Ȃ�Ȃ��̂��B";
		next;
		menu "�q�������Y�H",-;
		mes "["+strcharinfo(0)+"]";
		mes "�q�������Y�Ƃ͒N�ł����H";
		unittalk getcharid(3),strcharinfo(0)+" : �q�������Y�Ƃ͒N�ł����H";
		next;
		cutin "GL_BARMUND3",2;
		mes "[�o�������g]";
		mes "�w���R�͂���Ȃ��Ƃ�";
		mes "�����Ă���Ȃ������̂��H";
		unittalk "�o�������g : �w���R�͂���Ȃ��Ƃ������Ă���Ȃ������̂��H";
		next;
		cutin "GL_BARMUND2",2;
		mes "[�o�������g]";
		mes "���l�����߂�ҁA�S�҂̃��@���L���[�B";
		mes "�ޏ��͍������ɉB���Ă���";
		mes "���~���̐S������ɓ������肾�B";
		unittalk "�o�������g : ���l�����߂�ҁA�S�҂̃��@���L���[�B�ޏ��͍������ɉB���Ă��郆�~���̐S������ɓ������肾�B";
		next;
		mes "[�o�������g]";
		mes "�����炭�A�ړI�ׂ̈Ȃ炱�̏邲��";
		mes "�j�󂵂Ă��܂����낤�B";
		unittalk "�o�������g : �����炭�A�ړI�ׂ̈Ȃ炱�̏邲�Ɣj�󂵂Ă��܂����낤�B";
		next;
		mes "[�o�������g]";
		mes "�}���I�@�n�C�����q���̏��ɍs����";
		mes "�q�������Y�̎���m�点��B";
		mes "���������Ɍ������I";
		unittalk "�o�������g : �}���I�@�n�C�����q���̏��ɍs���� �q�������Y�̎���m�点��B���������Ɍ������I";
		close2;
		cutin "GL_BARMUND2",255;
		donpcevent getmdnpcname("�o�������g#0")+"::OnStart";
		end;
	}
	else {
		cutin "GL_BARMUND1",2;
		mes "[�o�������g]";
		mes "�N�����̑�\�҂͂ǂ��ɂ���񂾁H";
		mes "���̎҂̏������K�v���B";
		close2;
		cutin "GL_BARMUND1",255;
		end;
	}
OnStart:
	hideonnpc getmdnpcname("�o�������g#0");
	hideoffnpc getmdnpcname("�n�C�����q#1");
	end;
}

1@gl_k.gat,152,97,3	script	�o�������g#1	654,{
	end;
OnTalk1:
	unittalk "�o�������g : ��k�ł͂���܂���A�n�C�����q���B���̍l������������΁A���������ޏ��������ɗ���͂��ł��B";
	end;
OnTalk2:
	unittalk "�o�������g : ���ƈꏏ�ɗ������̎҂͐M�p�ł���l���ł��B�q�������Y�������ɂ��郆�~���̐S���̌��Ђ���ɓ����O�ɁA���S�ȏꏊ�ɉB���Ȃ���΂Ȃ�܂���B";
	end;
OnTalk3:
	unittalk "�o�������g : �M�l�A���̊ԂɁI";
	end;
OnTalk4:
	unittalk "�o�������g : �n�C�����q���A���C���������ɁB�ނ�͂��łɖ��������Ă��܂��B�ނ�Ɉ�����^���Ă��̂��i�ߊ��̖��߂ł��B";
	end;
OnTalk5:
	unittalk "�o�������g : �ނ�͂����A�l�Ԃɂ͖߂�Ȃ��̂ł��B";
	end;
OnTalk6:
	unittalk "�o�������g : ���͌N�̗͂��K�v���B��낵�����ށB";
	end;
OnTalk7:
	unittalk "�o�������g : �ł̓n�C�����q���A�}���Ńq�������Y�̌��ǂ��܂��傤�B";
	end;
}

1@gl_k.gat,149,100,5	script	�n�C�����q#1	652,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		cutin "GL_HEINRICH2",2;
		if(OLDGLAST_QUE >= 1) {
			mes "�]�ނ��o�������g�̌����Ă���";
			mes "�@�n�C�����q�����낤�]";
			next;
			if(select("�}��","��b������") == 1) {
				for(set '@i,1; '@i<=20; set '@i,'@i+4) {
					hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#"+'@i);
					hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#"+('@i+1));
					hideonnpc getmdnpcname("���̋R�m#"+('@i+2));
					hideonnpc getmdnpcname("���̋R�m#"+('@i+3));
				}
				hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#21");
				hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#22");
				hideonnpc getmdnpcname("�q�������Y#1");
				hideonnpc getmdnpcname("�o�������g#1");
				hideonnpc getmdnpcname("�n�C�����q#1");
				initnpctimer;
				setnpctimer 200000;
				cutin "GL_HEINRICH1",255;
				close;
			}
		}
		mes "["+strcharinfo(0)+"]";
		mes "���Ȃ����n�C�����q�l�ł��ˁB";
		mes "���̏�̎��Ńo�������g�l���";
		mes "���`������܂��B";
		unittalk getcharid(3),strcharinfo(0)+" : ���Ȃ����n�C�����q�l�ł��ˁB���̏�̎��Ńo�������g�l��茾�`������܂��B";
		next;
		cutin "GL_HEINRICH2",2;
		mes "[�n�C�����q]";
		mes "���Ȃ��͊m���A�o�������g�l��";
		mes "�ꏏ�ɗ����`���҂̕��ł��ˁB";
		mes "���̏�̒��ŉ������ł��H";
		unittalk "�n�C�����q : ���Ȃ��͊m���A�o�������g�l�ƈꏏ�ɗ����`���҂̕��ł��ˁB���̏�̒��ŉ������ł��H";
		next;
		menu "���~���̐S�����_���Ă��܂�",-;
		mes "["+strcharinfo(0)+"]";
		mes "�q�������Y�Ƃ������@���L���[���A";
		mes "���̏�̒��ɉB���Ă���";
		mes "���~���̐S���̌��Ђ�_���Ă��܂��B";
		unittalk getcharid(3),strcharinfo(0)+" : �q�������Y�Ƃ������@���L���[���A���̏�̒��ɉB���Ă��郆�~���̐S���̌��Ђ�_���Ă��܂��B";
		next;
		cutin "GL_HEINRICH1",2;
		mes "[�n�C�����q]";
		mes "�͂͂́A��k�͂�߂Ă��������B";
		mes "����ȃ��m�������ɂ���킯";
		mes "�Ȃ�����Ȃ��ł����B";
		unittalk "�n�C�����q : �͂͂́A��k�͂�߂Ă��������B���̂悤�ȃ��m�������ɂ���킯�Ȃ�����Ȃ��ł����B";
		next;
		hideoffnpc getmdnpcname("�o�������g#1");
		cutin "GL_BARMUND2",2;
		mes "[�o�������g]";
		mes "��k�ł͂���܂���A�n�C�����q���B";
		mes "���̍l������������΁A";
		mes "���������ޏ��������ɗ���͂��ł��B";
		donpcevent getmdnpcname("�o�������g#1")+"::OnTalk1";
		next;
		cutin "GL_HEINRICH1",2;
		mes "[�n�C�����q]";
		mes "����̓o�������g�l�c�c�B";
		mes "������M���̗��݂Ƃ����ǁc�c";
		mes "����A�������c�c�B";
		unittalk "�n�C�����q : ����̓o�������g�l�c�c�B������M���̗��݂Ƃ����ǁc�c����A�������c�c�B";
		next;
		cutin "GL_BARMUND2",2;
		mes "[�o�������g]";
		mes "���ƈꏏ�ɗ������̎҂�";
		mes "�M�p�ł���l���ł��B";
		mes "�q�������Y�������ɂ���";
		mes "���~���̐S���̌��Ђ���ɓ����O��";
		mes "���S�ȏꏊ�ɉB���Ȃ���΂Ȃ�܂���B";
		donpcevent getmdnpcname("�o�������g#1")+"::OnTalk2";
		next;
		menu "���Ԃ�����܂���",-;
		cutin "GL_BARMUND2",255;
		mes "["+strcharinfo(0)+"]";
		mes "�M�����Ȃ������m��܂���";
		mes "���Ԃ�����܂���I";
		unittalk getcharid(3),strcharinfo(0)+" : �M�����Ȃ������m��܂��� ���Ԃ�����܂���I";
		next;
		cutin "GL_HEINRICH1",2;
		mes "[�n�C�����q]";
		mes "�c�c�m���ɁA";
		mes "���̏�ɂ̓��~���̐S���̌��Ђ�";
		mes "�B����Ă��܂��B";
		unittalk "�n�C�����q : �c�c�m���ɁA���̏�ɂ̓��~���̐S���̌��Ђ��B����Ă��܂��B";
		next;
		mes "[�n�C�����q]";
		mes "�ł����A�����l���s�݂̍��A";
		mes "���̂悤�Ȑ���������";
		mes "���~���̐S���𓮂����킯�ɂ�";
		mes "�����܂���B";
		unittalk "�n�C�����q : �ł����A�����l���s�݂̍��A���̂悤�Ȑ��������Ń��~���̐S���𓮂����킯�ɂ͂����܂���B";
		close2;
		cutin "gl_heinrich1",255;
		donpcevent getmdnpcname("�n�C�����q#1")+"::OnStart";
		end;
	}
	else {
		cutin "GL_HEINRICH2",2;
		mes "[�n�C�����q]";
		mes "���Ȃ������͒N�ł����H";
		mes "�b������̂Ȃ�A";
		mes "��\�҂���f���܂��傤�B";
		close2;
		cutin "GL_HEINRICH2",255;
		end;
	}
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("�n�C�����q#1");
	announce "�����̐� : ���[�ق��ق��فI",0x9,0xffff44;
	hideoffnpc getmdnpcname("�q�������Y#1");
	hideoffnpc getmdnpcname("�n�C�����q#2");
	end;
OnTimer1000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk1";
	end;
OnTimer4000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk1";
	end;
OnTimer9000:
	donpcevent getmdnpcname("�o�������g#1")+"::OnTalk3";
	end;
OnTimer10000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk2";
	end;
OnTimer14000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk2";
	end;
OnTimer19000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk3";
	end;
OnTimer23000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk4";
	end;
OnTimer29000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk3";
	end;
OnTimer32000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk5";
	end;
OnTimer38000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk6";
	end;
OnTimer44000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk4";
	end;
OnTimer50000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk7";
	end;
OnTimer56000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk8";
	end;
OnTimer65000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk5";
	end;
OnTimer70000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk9";
	end;
OnTimer80000:
	donpcevent getmdnpcname("�q�������Y#1")+"::OnTalk10";
	end;
OnTimer86000:
	hideonnpc getmdnpcname("�q�������Y#1");
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk6";
	end;
OnTimer92000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk7";
	end;
OnTimer98000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk8";
	end;
OnTimer100000:
	for(set '@i,1; '@i<=20; set '@i,'@i+4) {
		hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#"+'@i);
		hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#"+('@i+1));
		hideonnpc getmdnpcname("���̋R�m#"+('@i+2));
		hideonnpc getmdnpcname("���̋R�m#"+('@i+3));
	}
	hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#21");
	hideonnpc getmdnpcname("�J�[���b�c�o�[�O�R�m#22");

	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk9";

	set '@map$,getmdmapname("1@gl_k.gat");
	set '@label$,getmdnpcname("�n�C�����q#1")+"::OnKilled";
	monster '@map$,145,104,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,154,104,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,145,99,"�������̋R�m",2470,1,'@label$;
	monster '@map$,154,99,"�������̋R�m",2470,1,'@label$;
	monster '@map$,145,94,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,154,94,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,145,89,"�������̋R�m",2470,1,'@label$;
	monster '@map$,154,89,"�������̋R�m",2470,1,'@label$;
	monster '@map$,145,84,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,154,84,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,145,79,"�������̋R�m",2470,1,'@label$;
	monster '@map$,154,79,"�������̋R�m",2470,1,'@label$;
	monster '@map$,145,74,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,154,74,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,145,69,"�������̋R�m",2470,1,'@label$;
	monster '@map$,154,69,"�������̋R�m",2470,1,'@label$;
	monster '@map$,145,64,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,154,64,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,145,59,"�������̋R�m",2470,1,'@label$;
	monster '@map$,154,59,"�������̋R�m",2470,1,'@label$;
	monster '@map$,145,54,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	monster '@map$,154,54,"�􂢂̃J�[���b�c�o�[�O",2471,1,'@label$;
	end;
OnTimer105000:
	donpcevent getmdnpcname("�o�������g#1")+"::OnTalk4";
	end;
OnTimer110000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk10";
	end;
OnTimer112000:
	donpcevent getmdnpcname("�o�������g#1")+"::OnTalk5";
	end;
OnTimer116000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk11";
	end;
OnTimer120000:
	donpcevent getmdnpcname("�n�C�����q#2")+"::OnTalk12";
	end;
OnTimer126000:
	announce "�n�C�����q�̋��� : ���҂͎��҂̂���ׂ��ꏊ��",0x9,0xFFFF00;
	end;
OnTimer128000:
	announce "�n�C�����q�̋��� : �҂�I",0x9,0xFFFF00;
	end;
OnTimer128500:
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#1");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#2");
	end;
OnTimer129000:
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#1");
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#2");
	misceffect 226,getmdnpcname("���̋R�m#3");
	misceffect 226,getmdnpcname("���̋R�m#4");
	end;
OnTimer129500:
	misceffect 85,getmdnpcname("���̋R�m#3");
	misceffect 85,getmdnpcname("���̋R�m#4");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#5");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#6");
	end;
OnTimer130000:
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#5");
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#6");
	misceffect 226,getmdnpcname("���̋R�m#7");
	misceffect 226,getmdnpcname("���̋R�m#8");
	end;
OnTimer130500:
	misceffect 85,getmdnpcname("���̋R�m#7");
	misceffect 85,getmdnpcname("���̋R�m#8");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#9");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#10");
	end;
OnTimer131000:
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#9");
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#10");
	misceffect 226,getmdnpcname("���̋R�m#11");
	misceffect 226,getmdnpcname("���̋R�m#12");
	end;
OnTimer131500:
	misceffect 85,getmdnpcname("���̋R�m#11");
	misceffect 85,getmdnpcname("���̋R�m#12");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#13");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#14");
	end;
OnTimer132000:
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#13");
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#14");
	misceffect 226,getmdnpcname("���̋R�m#15");
	misceffect 226,getmdnpcname("���̋R�m#16");
	end;
OnTimer132500:
	misceffect 85,getmdnpcname("���̋R�m#15");
	misceffect 85,getmdnpcname("���̋R�m#16");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#17");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#18");
	end;
OnTimer133000:
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#17");
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#18");
	misceffect 226,getmdnpcname("���̋R�m#19");
	misceffect 226,getmdnpcname("���̋R�m#20");
	end;
OnTimer133500:
	misceffect 85,getmdnpcname("���̋R�m#19");
	misceffect 85,getmdnpcname("���̋R�m#20");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#21");
	misceffect 226,getmdnpcname("�J�[���b�c�o�[�O�R�m#22");
	end;
OnTimer134000:
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#21");
	misceffect 85,getmdnpcname("�J�[���b�c�o�[�O�R�m#22");
	hideoffnpc getmdnpcname("�n�C�����q#3");
	hideonnpc getmdnpcname("�n�C�����q#2");
	killmonster getmdmapname("1@gl_k.gat"),getmdnpcname("�n�C�����q#1")+"::OnKilled";
	end;
OnTimer143000:
	donpcevent getmdnpcname("�n�C�����q#3")+"::OnTalk1";
	end;
OnTimer146000:
	donpcevent getmdnpcname("�n�C�����q#3")+"::OnTalk2";
	end;
OnTimer150000:
	donpcevent getmdnpcname("�n�C�����q#3")+"::OnTalk3";
	end;
OnTimer154000:
	donpcevent getmdnpcname("�n�C�����q#3")+"::OnTalk4";
	end;
OnTimer158000:
	donpcevent getmdnpcname("�n�C�����q#3")+"::OnTalk5";
	end;
OnTimer162000:
	donpcevent getmdnpcname("�n�C�����q#3")+"::OnTalk6";
	end;
OnTimer166000:
	donpcevent getmdnpcname("�o�������g#1")+"::OnTalk6";
	end;
OnTimer170000:
	donpcevent getmdnpcname("�o�������g#1")+"::OnTalk7";
	end;
OnTimer174000:
	hideonnpc getmdnpcname("�n�C�����q#3");
	hideonnpc getmdnpcname("�o�������g#1");
	announce "�n�C�����q : �ŏ��͐����̃G���A���W���I�ɑ{�����Ă��������܂����H",0x9,0xffff00;
	end;
OnTimer178000:
	announce "�n�C�����q : �����͗c���q������������G���A�Ȃ̂ł��c�c�B",0x9,0xffff00;
	end;
OnTimer182000:
	stopnpctimer;
	announce "�n�C�����q : �����Ă���q�������邩������܂���B�ǂ�����낵�����肢���܂��B",0x9,0xffff00;
	hideoffnpc getmdnpcname("#2����");
	hideoffnpc getmdnpcname("#2����2");
	donpcevent getmdnpcname("#2����_mobdead")+ "::OnStart";
	end;
OnTimer202000:
	announce "�n�C�����q : �ŏ��͐����̃G���A���W���I�ɑ{�����Ă��������܂����H",0x9,0xffff00;
	end;
OnTimer206000:
	announce "�n�C�����q : �����͗c���q������������G���A�Ȃ̂ł��c�c�B",0x9,0xffff00;
	end;
OnTimer210000:
	stopnpctimer;
	announce "�n�C�����q : �����Ă���q�������邩������܂���B�ǂ�����낵�����肢���܂��B",0x9,0xffff00;
	hideoffnpc getmdnpcname("#2����");
	hideoffnpc getmdnpcname("#2����2");
	donpcevent getmdnpcname("#2����_mobdead")+ "::OnStart";
	end;
OnKilled:
	end;
}

1@gl_k.gat,149,89,1	script	�q�������Y#1	650,{
	end;
OnTalk1:
	unittalk "���� : ����A���ז�������������H�@���q�l���K�˂ė����̂ɁA�N���C�Â��Ă���Ȃ���������₵���āB";
	end;
OnTalk2:
	unittalk "�q�������Y : ���̖��O�̓��T�E�J���E�q�������Y�B���l�����߂�ҁA�S�҂̃��@���L���[�A�����Ă΂�Ă�݂����ˁB";
	end;
OnTalk3:
	unittalk "�q�������Y : ���Ȃ����n�C�����q�H�@�ւ��`�A�{���ɍ��ł��Ⴂ�p�̂܂܂Ȃ̂ˁB";
	end;
OnTalk4:
	unittalk "�q�������Y : ����ɁA�Ƃ��Ă��a�m�I�Ȃ̂ˁB�ł��A���Ȃ��̎�N�̍s���𕷂��Ă�������������Ă����邩����H";
	end;
OnTalk5:
	unittalk "�q�������Y : �C�ɂȂ�́H�@��Ȃ̋ʍ���~����������Ȃ��ŁA�i�X�Ɖ��̋A�҂�҂��Ă���̂ˁc�c�{���ɕs�v�c�Ȓj�B";
	end;
OnTalk6:
	unittalk "�q�������Y : ���̏������A��������Ȃ���B�����ƈႤ�ꏊ�ŏo��������ǂ������̂ɁB�c�O�ˁB";
	end;
OnTalk7:
	unittalk "�q�������Y : �����ˁB�����c�c���Ȃ��̂���l�́A���[���~�b�h�K�b�c���Ƃɏ��҂���Ă���̂�ˁB";
	end;
OnTalk8:
	unittalk "�q�������Y : �ł��ς���Ȃ��H�@�����o�����Ă���ǂꂾ���̎��Ԃ��o����������H";
	end;
OnTalk9:
	unittalk "�q�������Y : �����ˁ`�H�@�������������Ă����������ǁA���̗p���I��点�Ȃ��ƁB";
	end;
OnTalk10:
	unittalk "�q�������Y : ���͍g�������������Ă����B���̏�ɉB���ꂽ�ō��̍g�����c�c�ˁB";
	end;
}

1@gl_k.gat,149,97,5	script	�n�C�����q#2	652,{
	end;
OnTalk1:
	unittalk "�n�C�����q : �N���I";
	end;
OnTalk2:
	unittalk "�n�C�����q : �ق��A�����ȓ���ƈ���Ĕ��������f�B���B�ł����A�����ɂ͋M���̂��C�ɏ����悤�ȍg���͂���܂����B";
	end;
OnTalk3:
	unittalk "�n�C�����q : �c�c�����ƁH";
	end;
OnTalk4:
	unittalk "�n�C�����q : �Y�����c�c���̎�̓��[���~�b�h�K�b�c���Ƃ̏��҂ɉ������������B";
	end;
OnTalk5:
	unittalk "�n�C�����q : �c�c�M�l�c�c���̐g�ɉ����N�����I";
	end;
OnTalk6:
	unittalk "�n�C�����q : �c�c���܂����I�@�z�̓��~���̐S���̌��Ђ�����ꏊ��c�����Ă���I";
	end;
OnTalk7:
	unittalk "�n�C�����q : �J�[���b�c�o�[�O�R�m�c�Ɣ��߂̋R�m�c�͍������z��ǂ��I";
	end;
OnTalk8:
	unittalk "�n�C�����q : �c�c�����A�ǂ������I�@�Ȃ��ǂ�Ȃ��I";
	end;
OnTalk9:
	unittalk "�n�C�����q : �܁A�܂�������Ȃ��Ƃ��c�c���̕����������c�c���A���肦�Ȃ��I";
	end;
OnTalk10:
	unittalk "�n�C�����q : �c�c�B";
	end;
OnTalk11:
	unittalk "�n�C�����q : �c�c�����ł��ˁB���݂܂���c�c�B";
	end;
OnTalk12:
	unittalk "�n�C�����q : ���܂Ȃ��A���ׂĎ��̐ӔC���c�c�B���߂Ĉ��炩�ɖ����Ă���c�c�B";
	end;
}

1@gl_k.gat,149,100,5	script	�n�C�����q#3	652,{
	end;
OnTalk1:
	unittalk "�n�C�����q : �c�c�o�������g�l�̂��������ʂ�ł��B�߂���ł���ꍇ�ł͂���܂���B";
	end;
OnTalk2:
	unittalk "�n�C�����q : �`���҂̕��ɂ��肢������܂��B";
	end;
OnTalk3:
	unittalk "�n�C�����q : �܂����̎��ӂɐ����҂����邩������܂���B�����҂�T���ď����Ă����ĉ������B";
	end;
OnTalk4:
	unittalk "�n�C�����q : ���ꂩ��c�c�q�������Y�͐����Ă���l�Ԃ𖂕��ɕς���\�͂������Ă���悤�ł��B";
	end;
OnTalk5:
	unittalk "�n�C�����q : �����Ɖ������҂́A�ǂ����c�c���Ȃ��̎�Łc�c";
	end;
OnTalk6:
	unittalk "�n�C�����q : �c�c���́A�o�������g�l�Ƌ��Ƀq�������Y�̌��ǂ��܂��B";
	end;
}

1@gl_k.gat,96,80,0	warp	#2����	2,2,1@gl_k.gat,80,80
1@gl_k.gat,95,80,0	script	#2����_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("1@gl_k.gat");
	set '@label$,getmdnpcname("#2����_mobdead")+"::OnKilled";
	areamonster '@map$,6,62,11,93,"�����̒뉀�t",2464,8,'@label$;
	areamonster '@map$,30,102,36,136,"�����̒뉀�t",2464,9,'@label$;
	areamonster '@map$,9,16,15,35,"���݂̃��C�h",2465,8,'@label$;
	areamonster '@map$,47,16,56,35,"���݂̃��C�h",2465,9,'@label$;
	areamonster '@map$,76,10,87,40,"��ɂ̉Ɨ�",2466,5,'@label$;
	areamonster '@map$,76,50,87,99,"��ɂ̉Ɨ�",2466,12,'@label$;
	end;
OnKilled:
	set '@map$,getmdmapname("1@gl_k.gat");
	set '@label$,getmdnpcname("#2����_mobdead")+"::OnKilled";
	set '@count,51 - getmapmobs('@map$,'@label$);
	if('@count >= 37) {
		initnpctimer;
		viewpoint 0,17,51,0,0xFF0000;
	}
	end;
OnTimer1000:
	stopnpctimer;
	announce "�q�������Y�̖��͂Ń����X�^�[�������l�X�������Ă����c�c�t�߂̐����҂�T�����B",0x9,0xffff00;
	killmonster getmdmapname("1@gl_k.gat"),getmdnpcname("#2����_mobdead")+"::OnKilled";
	hideoffnpc getmdnpcname("�A�R���C�g�u�]���h����#");
	end;
}

1@gl_k.gat,90,80,0	warp	#2����2	2,2,1@gl_k.gat,105,80
1@gl_k.gat,80,80,0	script	#2�h�����̋���	139,1,1,{
	hideonnpc;
	initnpctimer;
	announce "�q���̐� : �N�������ā[�[�[�[!!",0x9,0xffff00;
	end;
OnTimer4000:
	announce "�q���̐� : �Α��̌��ɉB�ꂽ���ǁA���������ďo���Ȃ��悧�c�c",0x9,0xffff00;
	end;
OnTimer8000:
	stopnpctimer;
	announce "�q���̐� : �N��������|���Ă�[�[�[!!",0x9,0xffff00;
	end;
}

1@gl_k.gat,17,51,3	script	�A�R���C�g�u�]���h����#	706,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "[�A�R���C�g�u�]���h����]";
		mes "�����ĉ������I�@�����ĉ������I";
		unittalk "�A�R���C�g�u�]���h���� : �����ĉ������I�@�����ĉ������I";
		next;
		menu "���v�H",-;
		mes "["+strcharinfo(0)+"]";
		mes "���v�H";
		unittalk getcharid(3),strcharinfo(0)+" : ���v�H";
		next;
		mes "[�A�R���C�g�u�]���h����]";
		mes "�Ɨߗl���c�c�C���m�l���c�c";
		mes "�݂�ȉ����ɂȂ��Ă��܂��܂����B";
		mes "�l�͉����ł��Ȃ��āc�c�B";
		unittalk "�A�R���C�g�u�]���h���� : �Ɨߗl���c�c�C���m�l���c�c�݂�ȉ����ɂȂ��Ă��܂��܂����B�l�͉����ł��Ȃ��āc�c�B";
		next;
		mes "[�A�R���C�g�u�]���h����]";
		mes "�����A�����ɉB��Ă��邵���c�c";
		mes "�����A�����ł��܂���ł����c�c�B";
		unittalk "�A�R���C�g�u�]���h���� : �����A�����ɉB��Ă��邵���c�c�����A�����ł��܂���ł����c�c�B";
		next;
		menu "�������肵�āI",-;
		mes "["+strcharinfo(0)+"]";
		mes "�������肵�āI";
		mes "�����z�[�������Ɍ�������";
		mes "�O�ɏo���I";
		mes "���̌o�H�͈��S������I";
		unittalk getcharid(3),strcharinfo(0)+" : �������肵�āI�@�����z�[�������Ɍ������ΊO�ɏo���I�@���̌o�H�͈��S������I";
		next;
		mes "[�A�R���C�g�u�]���h����]";
		mes "�����z�[���ł����H";
		mes "�ЂƂ�ŁH�@�ǂ�����āH";
		unittalk "�A�R���C�g�u�]���h���� : �����z�[���ł����H�@�ЂƂ�ŁH�@�ǂ�����āH";
		next;
		mes "�]�ӂƑ����������";
		mes "�@�]���ƂȂ����l�̎������炵��";
		mes "�@1�{�̃��C�X���]�����Ă����]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�ӂƑ���������Ƌ]���ƂȂ����l�̎������炵��1�{�̃��C�X���]�����Ă����]";
		next;
		menu "���̃��C�X���g����",-;
		mes "["+strcharinfo(0)+"]";
		mes "���̃��C�X���g���āB";
		mes "�g����邭�炢�ɂ͎g����͂��B";
		mes "�ǂ����Ă��_���Ȃ�ڂ����";
		mes "�U��񂷂񂾁B";
		unittalk getcharid(3),strcharinfo(0)+" : ���̃��C�X���g���āB�g����邭�炢�ɂ͎g����͂��B�ǂ����Ă��_���Ȃ�ڂ���ĐU��񂷂񂾁B";
		next;
		mes "[�A�R���C�g�u�]���h����]";
		mes "�킩��܂����B";
		mes "��A����Ă݂܂��B";
		unittalk "�A�R���C�g�u�]���h���� : �킩��܂����B��A����Ă݂܂��B";
		close2;
		hideonnpc;
		announce strcharinfo(0) +" : ���̕t�߂̐����҂͑��ɂ͋��Ȃ��悤���B���x�͓����̃G���A���W���I�ɑ{�����悤�B",0x9,0xffff00;
		viewpoint 0,202,79,0,0xFF0000;
		hideoffnpc getmdnpcname("#3����");
		hideoffnpc getmdnpcname("#3����2");
		donpcevent getmdnpcname("#3����_mobdead")+ "::OnStart";
		end;
	}
	else {
		mes "[�A�R���C�g�u�]���h����]";
		mes "�����ĉ������I�@�݂�Ȃ��c�c";
		mes "�݂�Ȃ������ɂȂ��Ă��܂��āI";
		next;
		mes "�]���|�Ńp�j�b�N���N�����Ă���B";
		mes "�@�p�[�e�B�[���[�_�[�Řb��������";
		mes "�@�܂��̓h�����𗎂��������悤�]";
		close;
	}
}

1@gl_k.gat,224,82,3		script	���₦���j#1	849,5,5,{
	if(sc_ison(4) || sc_ison(5) || sc_ison(119) || sc_ison(402) || sc_ison(438))
		end;
	set '@num,rand(3,7);
	set '@dummy,getmapxy('@map$,'@x,'@y,1);
	misceffect 124;
	hideonnpc;
	monster '@map$,'@x,'@y,"�}�S�b�g",2467,'@num;
	end;
}

1@gl_k.gat,233,123,4	duplicate(���₦���j#1)	���₦���j#2	849,5,5
1@gl_k.gat,258,150,2	duplicate(���₦���j#1)	���₦���j#3	849,5,5
1@gl_k.gat,255,157,5	duplicate(���₦���j#1)	���₦���j#4	849,5,5
1@gl_k.gat,280,167,4	duplicate(���₦���j#1)	���₦���j#5	849,5,5
1@gl_k.gat,293,161,2	duplicate(���₦���j#1)	���₦���j#6	849,5,5
1@gl_k.gat,249,101,3	duplicate(���₦���j#1)	���₦���j#7	849,5,5
1@gl_k.gat,241,86,6		duplicate(���₦���j#1)	���₦���j#8	849,5,5
1@gl_k.gat,246,62,8		duplicate(���₦���j#1)	���₦���j#9	849,5,5
1@gl_k.gat,240,43,7		duplicate(���₦���j#1)	���₦���j#10	849,5,5
1@gl_k.gat,271,19,1		duplicate(���₦���j#1)	���₦���j#11	849,5,5
1@gl_k.gat,282,48,5		duplicate(���₦���j#1)	���₦���j#12	849,5,5
1@gl_k.gat,285,81,7		duplicate(���₦���j#1)	���₦���j#13	849,5,5
1@gl_k.gat,276,106,8	duplicate(���₦���j#1)	���₦���j#14	849,5,5
1@gl_k.gat,261,164,8	duplicate(���₦���j#1)	���₦���j#15	849,5,5
1@gl_k.gat,269,173,8	duplicate(���₦���j#1)	���₦���j#16	849,5,5
1@gl_k.gat,252,120,8	duplicate(���₦���j#1)	���₦���j#17	849,5,5
1@gl_k.gat,225,63,8		duplicate(���₦���j#1)	���₦���j#18	849,5,5
1@gl_k.gat,227,39,8		duplicate(���₦���j#1)	���₦���j#19	849,5,5
1@gl_k.gat,226,27,8		duplicate(���₦���j#1)	���₦���j#20	849,5,5
1@gl_k.gat,223,17,9		duplicate(���₦���j#1)	���₦���j#21	849,5,5
1@gl_k.gat,230,50,10	duplicate(���₦���j#1)	���₦���j#22	849,5,5
1@gl_k.gat,235,16,11	duplicate(���₦���j#1)	���₦���j#23	849,5,5
1@gl_k.gat,226,96,12	duplicate(���₦���j#1)	���₦���j#24	849,5,5
1@gl_k.gat,222,119,13	duplicate(���₦���j#1)	���₦���j#25	849,5,5
1@gl_k.gat,251,20,14	duplicate(���₦���j#1)	���₦���j#26	849,5,5

1@gl_k.gat,202,79,0		warp	#3����	2,2,1@gl_k.gat,215,79
1@gl_k.gat,202,80,0		script	#3����_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("1@gl_k.gat");
	set '@label$,getmdnpcname("#3����_mobdead")+"::OnKilled";
	areamonster '@map$,235,20,255,55,"�����Ă����b�艮",2464,4,'@label$;
	areamonster '@map$,275,55,293,60,"�����Ă����b�艮",2464,5,'@label$;
	areamonster '@map$,234,82,280,180,"�����Ă����b�艮",2464,24,'@label$;
	areamonster '@map$,235,25,255,55,"�����Ȑ��B�t",2466,4,'@label$;
	areamonster '@map$,275,55,293,60,"�����Ȑ��B�t",2466,5,'@label$;
	areamonster '@map$,234,82,280,180,"�����Ȑ��B�t",2466,24,'@label$;
	end;
OnKilled:
	set '@count,66 - getmapmobs(getmdmapname("1@gl_k.gat"),getmdnpcname("#3����_mobdead")+"::OnKilled");
	if('@count >= 56) {
		initnpctimer;
		viewpoint 0,291,145,0,0xFF0000;
	}
	end;
OnTimer1000:
	stopnpctimer;
	announce "�q�������Y�̖��͂Ń����X�^�[�������l�X�������Ă����c�c�t�߂̐����҂�T�����B",0x9,0xffff00;
	killmonster getmdmapname("1@gl_k.gat"),getmdnpcname("#3����_mobdead")+"::OnKilled";
	hideoffnpc getmdnpcname("�b�艮�f�X�g���C���[#1");
	end;
}

1@gl_k.gat,206,79,0		warp	#3����2	2,2,1@gl_k.gat,195,79

1@gl_k.gat,215,79,0		script	#3�f�X�g���C���[�̋���	139,1,1,{
	hideonnpc;
	initnpctimer;
	announce "�����̐� : ������ƁI�@�ߊ��Ȃ��ł�I",0x9,0xffff00;
	end;
OnTimer4000:
	announce "�����̐� : ����ł���炦���I�@�ǂ��`�`�`�`��!!!",0x9,0xffff00;
	end;
OnTimer8000:
	stopnpctimer;
	announce "�����̐� : ������[�A���������I�@�d���Ȃ��A���������Ȃ��Ȃ�܂ŉB��邩�c�c",0x9,0xffff00;
	end;
}

1@gl_k.gat,291,145,3	script	�b�艮�f�X�g���C���[#1	726,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "[�b�艮�f�X�g���C���[]";
		mes "���₠���I�@���Ȃ��ŁI";
		misceffect 102;
		unittalk "�b�艮�f�X�g���C���[ : ���₠���I�@���Ȃ��ŁI";
		next;
		menu "���S���ĉ�����",-;
		mes "["+strcharinfo(0)+"]";
		mes "���S���ĉ������I�@�l�Ԃł��B";
		mes "���ЂƂ�ł����H";
		mes "���̐����҂͂��܂��񂩁H";
		unittalk getcharid(3),strcharinfo(0)+" : ���S���ĉ������I�@�l�Ԃł��B���ЂƂ�ł����H�@���̐����҂͂��܂��񂩁H";
		next;
		mes "[�b�艮�f�X�g���C���[]";
		mes "�����c�����͎̂������ł��c�c�B";
		unittalk "�b�艮�f�X�g���C���[ : �����c�����͎̂������ł��c�c�B";
		next;
		menu "�����͊댯�ł�",-;
		mes "["+strcharinfo(0)+"]";
		mes "�����͊댯�ł��B";
		mes "�����z�[���ɍs�����͉���܂����H";
		mes "�g�d�ȑ̂̂悤�ł����c�c�B";
		mes "���������ł����H";
		unittalk getcharid(3),strcharinfo(0)+" : �����͊댯�ł��B�����z�[���ɍs�����͉���܂����H�@�g�d�ȑ̂̂悤�ł����c�c���������ł����H";
		next;
		mes "[�b�艮�f�X�g���C���[]";
		mes "�͂��A�����܂��B";
		mes "���̎q�ׂ̈ɂ����������Ȃ�����B";
		unittalk "�b�艮�f�X�g���C���[ : �͂��A�����܂��B���̎q�ׂ̈ɂ����������Ȃ�����B";
		next;
		menu "�ǂ�����������",-;
		mes "["+strcharinfo(0)+"]";
		mes "�����ɂ��̎q�Ƃ�������";
		mes "�����o���邱�Ƃ��F���Ă��܂��B";
		mes "���ɍs���Ȃ��Đ\���󂠂�܂���B";
		unittalk getcharid(3),strcharinfo(0)+" : �����ɂ��̎q�Ƃ������甲���o���邱�Ƃ��F���Ă��܂��B���ɍs���Ȃ��Đ\���󂠂�܂���B";
		next;
		mes "[�b�艮�f�X�g���C���[]";
		mes "�������A�{���ɏ�����܂����B";
		mes "���肪�Ƃ��������܂��B";
		unittalk "�b�艮�f�X�g���C���[ : �������A�{���ɏ�����܂����B���肪�Ƃ��������܂��B";
		close2;
		hideonnpc;
		announce strcharinfo(0) +" : ���̕t�߂̐����҂͑��ɂ͋��Ȃ��悤���B���x�͖k���̃G���A���W���I�ɑ{�����悤�B",0x9,0xffff00;
		viewpoint 0,227,216,0,0xFF0000;
		hideoffnpc getmdnpcname("#4����");
		hideoffnpc getmdnpcname("#4����2");
		donpcevent getmdnpcname("#4����_mobdead")+ "::OnStart";
		end;
	}
	else {
		mes "[�b�艮�f�X�g���C���[]";
		mes "���A����H�@�l�c�c�Ȃ́H";
		mes "���A���������B";
		mes "���ȊO�̐l�͂����c�c�B";
		mes "���Ȃ����̂������ŏ�����܂����B";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�b�艮�f�X�g���C���[]";
		mes "�Ƃ���ŁA���Ȃ����̑�\�҂�";
		mes "�ǂ��ɂ��܂����H";
		mes "��\�҂̕��Ƃ�";
		mes "���b�������̂ł����c�c�B";
		close;
	}
}

1@gl_k.gat,215,216,0	script	#4�q�������Y�̚���	139,1,1,{
	hideonnpc;
	initnpctimer;
	announce "�q�������Y : �����܂ŗ���Ȃ�āA�Ȃ��Ȃ���邶��Ȃ��B",0x9,0xffff00;
	end;
OnTimer4000:
	announce "�q�������Y : �ł��A�܂�����Ȃ���c�c�B",0x9,0xffff00;
	end;
OnTimer8000:
	stopnpctimer;
	announce "�q�������Y : �ӂӂӁA����߂炦�����̂Ȃ�A���̎q������|���Ă݂Ȃ����B",0x9,0xffff00;
	end;
}

1@gl_k.gat,227,216,0	warp	#4����	2,2,1@gl_k.gat,215,216

1@gl_k.gat,202,80,0		script	#4����_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("1@gl_k.gat");
	set '@label$,getmdnpcname("#4����_mobdead")+"::OnKilled";
	areamonster '@map$,64,229,209,255,"���s�������m",2468,26,'@label$;
	areamonster '@map$,64,229,209,255,"�p�j����|��",2469,30,'@label$;
	areamonster '@map$,24,192,84,225,"�삦�����m",2468,16,'@label$;
	areamonster '@map$,24,192,55,270,"���\�ȋ|��",2469,20,'@label$;
	end;
OnKilled:
	set '@count,92 - getmapmobs(getmdmapname("1@gl_k.gat"),getmdnpcname("#4����_mobdead")+"::OnKilled");
	if('@count >= 86) {
		initnpctimer;
	}
	end;
OnTimer1000:
	killmonster getmdmapname("1@gl_k.gat"),getmdnpcname("#4����_mobdead")+"::OnKilled";
	announce "�q�������Y : �Ȃ��Ȃ���邶��Ȃ��B�����܂Ő����c��Ȃ�āA�ӊO����B",0x9,0xffff00;
	end;
OnTimer5000:
	stopnpctimer;
	announce "�q�������Y : ����߂������̂ł��傤�H�@2�K�ɑ����k���̑�K�i�O�܂ŗ���Ƃ�����B",0x9,0xffff00;
	hideoffnpc getmdnpcname("#�q����on");
	hideoffnpc getmdnpcname("�q�������Y#2");
	end;
}

1@gl_k.gat,222,216,0	warp	#4����2	2,2,1@gl_k.gat,235,216

1@gl_k.gat,150,257,0	script	#�q����on	139,6,6,{
	if(OLDGLAST_QUE >= 1) {
		mes "�]��K�i�̑O�ɂ�";
		mes "�@�]�T�̏΂݂𕂂��ׂ�";
		mes "�@�q�������Y�������]";
		next;
		if(select("�}��","��b������") == 1) {
			hideonnpc;
			hideonnpc getmdnpcname("�q�������Y#2");
			initnpctimer;
			setnpctimer 36000;
			close;
		}
		close2;
	}
	hideonnpc;
	initnpctimer;
	end;
OnTimer1000:
	donpcevent getmdnpcname("�q�������Y#2")+"::OnTalk1";
	end;
OnTimer6000:
	hideoffnpc getmdnpcname("�n�C�����q#4");
	hideoffnpc getmdnpcname("�o�������g#2");
	donpcevent getmdnpcname("�n�C�����q#4")+"::OnTalk1";
	end;
OnTimer7000:
	donpcevent getmdnpcname("�q�������Y#2")+"::OnTalk2";
	end;
OnTimer10000:
	donpcevent getmdnpcname("�n�C�����q#4")+"::OnTalk2";
	end;
OnTimer15000:
	donpcevent getmdnpcname("�q�������Y#2")+"::OnTalk3";
	end;
OnTimer19000:
	donpcevent getmdnpcname("�o�������g#2")+"::OnTalk1";
	end;
OnTimer23000:
	donpcevent getmdnpcname("�n�C�����q#4")+"::OnTalk3";
	end;
OnTimer24000:
	donpcevent getmdnpcname("�q�������Y#2")+"::OnTalk4";
	end;
OnTimer29000:
	donpcevent getmdnpcname("�q�������Y#2")+"::OnTalk5";
	end;
OnTimer32000:
	hideonnpc getmdnpcname("�q�������Y#2");
	end;
OnTimer33000:
	donpcevent getmdnpcname("�n�C�����q#4")+"::OnTalk4";
	end;
OnTimer35000:
	donpcevent getmdnpcname("�n�C�����q#4")+"::OnTalk5";
	end;
OnTimer37000:
	hideonnpc getmdnpcname("�n�C�����q#4");
	hideonnpc getmdnpcname("�o�������g#2");
	end;
OnTimer40000:
	announce "�R�m�c�̉�����s�C���Ȃ����܂��߂Â��ė��܂��B",0x9,0xffff00;
	end;
OnTimer45000:
	donpcevent getmdnpcname("#�{�X����")+"::OnStart";
	stopnpctimer;
	end;
}

1@gl_k.gat,150,257,3	script	�q�������Y#2	650,{
	cutin "GL_HIMEL2",2;
	mes "[�q�������Y]";
	mes "����ȕs���Ȋ�Ŏ������߂�";
	mes "�K�v�͂Ȃ���B";
	mes "���������y�ɂȂ�̂�����c�c�B";
	close2;
	cutin "GL_HIMEL2",255;
	end;
OnTalk1:
	unittalk "�q�������Y : �����܂ŒH����Ȃ�āA�^��������ˁB����Ƃ��A���ꂾ���̗͂������Ă����̂�����B";
	end;
OnTalk2:
	unittalk "�q�������Y : ���`��A�ǂ����ꂿ�������B�ł��A�����܂ŗ���̂ɐ�����J�����݂����ˁ`�A���قفB";
	end;
OnTalk3:
	unittalk "�q�������Y : ���ӂӁA���Ȃ��̋ꂵ�ގp�c�c�{���ɁA�悩������B��`�A�ł��ˁA�y���݂͂܂��n�܂����΂���Ȃ̂�B";
	end;
OnTalk4:
	unittalk "�q�������Y : ������l�ŗ����Ǝv���Ă���́H�@���قفA���ꂶ�Ⴀ�A���Ȃ������͎��̃I���`���ƗV��ł��Ȃ����B";
	end;
OnTalk5:
	unittalk "�q�������Y : �ł͎��͂���ŁB�n�C�����q�c�c���Ȃ��Ƃ͂�����x�������B�܂��@�����΁A�ˁB";
	end;
}

1@gl_k.gat,144,258,6	script	�n�C�����q#4	652,{
	cutin "GL_HEINRICH1",2;
	mes "[�n�C�����q]";
	mes "�q�������Y�c�c";
	mes "���̕�����������ɂ������߁A";
	mes "��΂ɋ����񂼁I";
	close2;
	cutin "GL_HEINRICH1",255;
	end;
OnTalk1:
	unittalk "�n�C�����q : �q�������Y�I�@�M�l�A�����ɂ������I";
	end;
OnTalk2:
	unittalk "�n�C�����q : �悭�������������c�c���̍߁A���������ď����Ă��炤�I";
	end;
OnTalk3:
	unittalk "�n�C�����q : ���c�c����́I";
	end;
OnTalk4:
	unittalk "�n�C�����q : �҂āI�@�q�������Y!!";
	end;
OnTalk5:
	unittalk "�n�C�����q : �`���҂̕����͂�݂��ĉ������B���ƃo�������g���̓q�������Y��ǂ��܂��I";
	end;
}

1@gl_k.gat,156,258,3	script	�o�������g#2	654,{
	if(checkquest(12318) & 0x4) {
		cutin "GL_BARMUND1",2;
		mes "[�o�������g]";
		mes "���̋��͂ȃ����X�^�[�𑊎��";
		mes "�悭�����ł��Ă��ꂽ�B";
		next;
		mes "[�o�������g]";
		mes "�q�������Y��ǂ���";
		mes "2�K�ɐi�񂾂̂����A";
		mes "�ǂ����q�������Y�ɏ��׍H��";
		mes "�M���ꂽ�悤���B";
		next;
		mes "[�o�������g]";
		mes "�Ƃɂ����A�N���}����2�K��";
		mes "���Ă���B";
		next;
		mes "[�o�������g]";
		mes "���ꂩ��A�퓬�̂������t�߂�";
		mes "�����̂悤�ȕ����E���Ă������B";
		mes "�����炭�A�����X�^�[�����Ƃ���";
		mes "���Ȃ̂��낤�B";
		next;
		mes "[�o�������g]";
		mes "���̌����͕s�v�c�ȋC�𔭂��Ă���B";
		mes "��������𑀂��l�ɏo�������";
		mes "�K���N�̖��ɗ����낤�B";
		mes "�����Ă����Ɨǂ�";
		if(checkitemblank() < 2) {
			next;
			mes "[�o�������g]";
			mes "�����i�̎�ނ������悤���ȁB";
			mes "�����i�̎�ނ����炵�����";
			mes "�܂����Ȃ����B";
			close;
		}
		delquest 12318;
		setquest 12319;
		getitem 6607,1;
		getitem 6608,1;
		set OLDGLAST_QUE,1;
		close2;
		cutin "GL_BARMUND1",255;
		end;
	}
	if(checkquest(12319)) {
		cutin "GL_BARMUND1",2;
		mes "[�o�������g]";
		mes "�����k�ɂ���K�i����";
		mes "2�K�ɍs�����B";
		mes "�ӂ������ԓx�����A�q�������Y��";
		mes "���@���L���[�̈�l�B";
		mes "���f����Ȃ�B";
		close2;
		cutin "GL_BARMUND1",255;
		end;
	}
	if(checkquest(12322)) {
		cutin "GL_BARMUND1",2;
		mes "[�o�������g]";
		mes "�c�c�B";
		next;
		mes "^0000ff�]�o�������g�͎��Ԃ��~�܂���^000000";
		mes "^0000ff�@���邩�̂悤�ɔ������ɂ��Ȃ��]^000000";
		close2;
		cutin "GL_BARMUND1",255;
		end;
	}
	cutin "GL_BARMUND1",2;
	mes "[�o�������g]";
	mes "�ӂ������ԓx�����A�q�������Y��";
	mes "���@���L���[�̈�l�B";
	mes "���f����Ȃ�B";
	close2;
	cutin "GL_BARMUND1",255;
	end;
OnTalk1:
	unittalk "�o�������g : �n�C�����q���I�@�����A����ȗ͂�������Ɍ������ė��Ă��܂��I";
	end;
OnTalk2:
	unittalk "�o�������g : ���v���H�@�������������Ɩ�肪�����Ăȁc�c�܂��͎��ɘb�������Ă���B";
	end;
}

1@gl_k.gat,3,1,1	script	#�{�X����	844,{
OnStart:
	monster getmdmapname("1@gl_k.gat"),150,259,"�U���̖���#1",2475,1,getmdnpcname("#�{�X����")+"::OnKilled";
	end;
OnKilled:
	hideoffnpc getmdnpcname("#2�K�����");
	hideoffnpc getmdnpcname("�o�������g#2");
	donpcevent getmdnpcname("�o�������g#2")+"::OnTalk2";
	donpcevent getmdnpcname("#22����_mobdead")+"::OnStart";
	donpcevent getmdnpcname("#23����_mobdead")+"::OnStart";
	end;
}

1@gl_k.gat,150,284,0	script	#2�K�����	45,2,2,{
	if(checkquest(12318) & 0x4) {
		mes "[�o�������g]";
		mes "�����A�ǂ��֍s���񂾁B";
		mes "�܂��͎��ɏڂ����b��";
		mes "�������Ă���Ȃ����H";
		close;
	}
	warp getmdmapname("2@gl_k.gat"),150,46;
	end;
}
1@gl_k.gat,103,203,0	warp	#�閧�����o�����	2,2,1@gl_k.gat,103,227

1@gl_k.gat,269,267,3	script	�������T��#1	844,{
	if(checkquest(12322)) {
		mes "�]�T��̉��ɉB���ʘH��";
		mes "�@�������]";
		close2;
		warp getmdmapname("1@gl_k.gat"),149,198;
		end;
	}
	mes "�]�������T�􂪂���]";
	close;
OnInit:
	initnpctimer;
	end;
OnTimer5000:
	misceffect 14;
	initnpctimer;
	end;
}

1@gl_k.gat,165,136,3	script	�K���X�P�[�X#2	844,{
	if(checkquest(12322)) {
		initnpctimer;
		misceffect 234;
		hideonnpc getmdnpcname(strnpcinfo(0));
	}
	end;
OnTimer1000:
	// �A���W�X�g�A�Ìł��ꂽ���́A���؂Ȍ��A����A�d���ȑ匕
	setarray '@gain,719,719,719,719,719,719,6608,6611,7228,21007;
	setarray '@rate,300,300,300,300,300,300,1000, 200, 200,   50;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,165+rand(5)-2;
		set '@y,136+rand(5)+2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@gl_k.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	stopnpctimer;
	end;
}

1@gl_k.gat,159,136,3	script	�K���X�P�[�X#3	844,{
	if(checkquest(12322)) {
		initnpctimer;
		misceffect 234;
		hideonnpc getmdnpcname(strnpcinfo(0));
	}
	end;
OnTimer1000:
	// �A�N�A�}�����A�Ìł��ꂽ���́A���؂Ȍ��A���A���I�ȊZ
	setarray '@gain,720,720,720,720,720,720,6608,6611,7229,15066;
	setarray '@rate,300,300,300,300,300,300,1000, 200, 200,   50;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,159+rand(5)-2;
		set '@y,136+rand(5)+2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@gl_k.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	stopnpctimer;
	end;
}

1@gl_k.gat,153,136,3	script	�K���X�P�[�X#4	844,{
	if(checkquest(12322)) {
		initnpctimer;
		misceffect 234;
		hideonnpc getmdnpcname(strnpcinfo(0));
	}
	end;
OnTimer1000:
	// �G�������h�A�Ìł��ꂽ���́A���A�����̉�A���׍H�̒Z��
	setarray '@gain,721,721,721,721,721,721,6608,7229,7230,13086;
	setarray '@rate,300,300,300,300,300,300,1000, 200, 200,   50;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,153+rand(5)-2;
		set '@y,136+rand(5)+2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@gl_k.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	stopnpctimer;
	end;
}

1@gl_k.gat,147,136,3	script	�K���X�P�[�X#5	844,{
	if(checkquest(12322)) {
		initnpctimer;
		misceffect 234;
		hideonnpc getmdnpcname(strnpcinfo(0));
	}
	end;
OnTimer1000:
	// �^��A�Ìł��ꂽ���́A���݂̂����A�h��ȃu���[�`
	setarray '@gain,722,722,722,722,722,722,6608,6612,6613;
	setarray '@rate,300,300,300,300,300,300,1000, 200, 200;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,147+rand(5)-2;
		set '@y,136+rand(5)+2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@gl_k.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	stopnpctimer;
	end;
}

1@gl_k.gat,141,136,3	script	�K���X�P�[�X#6	844,{
	if(checkquest(12322)) {
		initnpctimer;
		misceffect 234;
		hideonnpc getmdnpcname(strnpcinfo(0));
	}
	end;
OnTimer1000:
	// �T�[�h�I�j�L�X�A�Ìł��ꂽ���́A���؂Ȍ��A����A�V���p�̌�
	setarray '@gain,725,725,725,725,725,725,6608,6611,7228,13440;
	setarray '@rate,300,300,300,300,300,300,1000, 200, 200,   50;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,141+rand(5)-2;
		set '@y,136+rand(5)+2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@gl_k.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	stopnpctimer;
	end;
}

1@gl_k.gat,135,136,3	script	�K���X�P�[�X#7	844,{
	if(checkquest(12322)) {
		initnpctimer;
		misceffect 234;
		hideonnpc getmdnpcname(strnpcinfo(0));
	}
	end;
OnTimer1000:
	// �T�t�@�C�A�A�Ìł��ꂽ���́A���A�X�^�b�t�I�u�Q�t�F��
	setarray '@gain,726,726,726,726,726,726,6608,7229,2022;
	setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,135+rand(5)-2;
		set '@y,136+rand(5)+2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@gl_k.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	stopnpctimer;
	end;
}

1@gl_k.gat,129,136,3	script	�K���X�P�[�X#8	844,{
	if(checkquest(12322)) {
		initnpctimer;
		misceffect 234;
		hideonnpc getmdnpcname(strnpcinfo(0));
	}
	end;
OnTimer1000:
	// �I�p�[���A�Ìł��ꂽ���́A���؂Ȍ��A����A��׍H�̃u���X���b�g
	setarray '@gain,727,727,727,727,727,727,6608,6611,7228,2949;
	setarray '@rate,300,300,300,300,300,300,1000, 200, 200,  10;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,129+rand(5)-2;
		set '@y,136+rand(5)+2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@gl_k.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	stopnpctimer;
	end;
}

//============================================================
// �ẪO���X�g�w�C��2F
//------------------------------------------------------------
2@gl_k.gat,149,32,0	warp	#1����	2,2,1@gl_k.gat,150,270

2@gl_k.gat,150,66,0	script	#�n�C��on	139,10,10,{
	if(OLDGLAST_QUE >= 2) {
		mes "�]�n�C�����q�ƃo�������g��";
		mes "�@�����b�����Ă���]";
		next;
		if(select("�}��","��b������") == 1) {
			hideonnpc;
			hideonnpc getmdnpcname("�n�C�����q#21");
			hideonnpc getmdnpcname("�o�������g#21");
			initnpctimer;
			setnpctimer 76000;
			close;
		}
		close2;
	}
	hideonnpc;
	initnpctimer;
	end;
OnTimer3000:
	donpcevent getmdnpcname("�n�C�����q#21")+"::OnTalk1";
	end;
OnTimer6000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk1";
	end;
OnTimer9000:
	donpcevent getmdnpcname("�n�C�����q#21")+"::OnTalk2";
	end;
OnTimer12000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk2";
	end;
OnTimer15000:
	donpcevent getmdnpcname("�n�C�����q#21")+"::OnTalk3";
	end;
OnTimer18000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk3";
	end;
OnTimer22000:
	misceffect 90,getmdnpcname("�o�������g#21");
	end;
OnTimer25000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk4";
	end;
OnTimer27000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk5";
	end;
OnTimer30000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk6";
	end;
OnTimer34000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk7";
	end;
OnTimer37000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk8";
	end;
OnTimer41000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk9";
	end;
OnTimer46000:
	donpcevent getmdnpcname("�n�C�����q#21")+"::OnTalk4";
	end;
OnTimer49000:
	donpcevent getmdnpcname("�n�C�����q#21")+"::OnTalk5";
	end;
OnTimer52000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk10";
	end;
OnTimer55000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk11";
	end;
OnTimer57000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk12";
	end;
OnTimer60000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk13";
	end;
OnTimer64000:
	donpcevent getmdnpcname("�n�C�����q#21")+"::OnTalk6";
	end;
OnTimer68000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk14";
	end;
OnTimer72000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk15";
	end;
OnTimer75000:
	donpcevent getmdnpcname("�o�������g#21")+"::OnTalk16";
	end;
OnTimer78000:
	hideonnpc getmdnpcname("�n�C�����q#21");
	hideonnpc getmdnpcname("�o�������g#21");
	announce "�o�������g : �܂��͌��E����ꂽ�����̃G���A���炾�B�����ʘH����ړ��ł���B",0x9,0xffff00;
	end;
OnTimer82000:
	stopnpctimer;
	announce "�o�������g : ������r�ł��Ă����΁A���̒��Ɍ��E�΂����������̂�����͂����B",0x9,0xffff00;
	hideoffnpc getmdnpcname("#22����");
	hideoffnpc getmdnpcname("#22����2");
	end;
}

2@gl_k.gat,148,67,1	script	�n�C�����q#21	652,{
	cutin "GL_HEINRICH1",2;
	mes "[�n�C�����q]";
	mes "���͂��q�������Y�̌��E��";
	mes "������Ă���̂��c�c�B";
	close2;
	cutin "GL_HEINRICH1",255;
	end;
OnTalk1:
	unittalk "�n�C�����q : �c�c�����A���̌��E�́A���̌��ł͂ǂ�����Ă��j��ł��Ȃ��̂��c�c�B";
	end;
OnTalk2:
	unittalk "�n�C�����q : �ނ��c�c�����A�`���҂̕��B�悭���������ŁB";
	end;
OnTalk3:
	unittalk "�n�C�����q : ���E�Ɏז�����A��ɐi�ނ��Ƃ��ł��Ȃ��̂ł��B";
	end;
OnTalk4:
	unittalk "�n�C�����q : ����Ȃ��ƁA�������͂����Ȃ����낤�I";
	end;
OnTalk5:
	unittalk "�n�C�����q : ���͂��łɑ����̕��������̎�ɂ������B�܂��A�߂��Ȃ��҂��a��Ƃ����̂��I";
	end;
OnTalk6:
	unittalk "�n�C�����q : �c�c�B";
	end;
}

2@gl_k.gat,151,71,7	script	�o�������g#21	654,{
	cutin "GL_BARMUND2",2;
	mes "[�o�������g]";
	mes "���������A���͂���Ȃ��Ƃ�";
	mes "���x�J��Ԃ����̂��c�c";
	mes "���ł����\��͌J��Ԃ�����";
	mes "�ꏊ�Ɗ��o�c�c�B";
	close2;
	cutin "GL_BARMUND2",255;
	end;
OnTalk1:
	unittalk "�o�������g : �q�������Y�̌��E�́A�����I�ȃ_���[�W���󂯕t���Ȃ��悤�ł��ˁB";
	end;
OnTalk2:
	unittalk "�o�������g : �q�������Y�ɂ���č��ʂ����K�i�̎��󂪘c�߂��A�����ɏo���̂����c�c�B";
	end;
OnTalk3:
	unittalk "�o�������g : ���̖��@������1�x�����Ă݂܂��B�n�C�����q���A�������Ă��������B";
	end;
OnTalk4:
	unittalk "�o�������g : ���E�̈ꕔ�͉��܂������A��͂肱��ȏ�͖����Ȃ悤�ł��ˁB";
	end;
OnTalk5:
	unittalk "�o�������g : ���́A�ȑO�ɂ����̂悤�Ȍ��E���������Ƃ�����̂ł����c�c";
	end;
OnTalk6:
	unittalk "�o�������g : ���̎��A�q�������Y�̓A���f�b�h�������l�̒��ɖ��ߍ��񂾌��E�΂Ō��E���ێ����Ă��܂����B";
	end;
OnTalk7:
	unittalk "�o�������g : �����炭�A���̌��E����������Ĉێ�����Ă���̂ł��傤�B";
	end;
OnTalk8:
	unittalk "�o�������g : ���̌��E���󂷂ɂ͔ނ�̒����猋�E�΂��������҂�|����������܂���B";
	end;
OnTalk9:
	unittalk "�o�������g : �������A�������ɂ͂�����������邱�Ƃ͂ł��Ȃ��B�܂茩���������̂��ׂĂ��򉻂��Ă�����������܂���c�c�B";
	end;
OnTalk10:
	unittalk "�o�������g : �n�C�����q���c�c�B";
	end;
OnTalk11:
	unittalk "�o�������g : ���Ȃ��͗D���߂��܂��B";
	end;
OnTalk12:
	unittalk "�o�������g : ������������ɂ��鑶�݂́A���łɐl�Ԃł͂���܂���B";
	end;
OnTalk13:
	unittalk "�o�������g : �ނ炪�����ł��鎖��ے肵������Ƃ����āA�ނ炪�Ăѐl�Ԃɖ߂邱�Ƃ͂���܂���B";
	end;
OnTalk14:
	unittalk "�o�������g : �N����͂𐮂�����A�������ɂ��Ă��Ă���B";
	end;
OnTalk15:
	unittalk "�o�������g : �����̃G���A��T�����Č��E�΂�������������|�����B";
	end;
OnTalk16:
	unittalk "�o�������g : �h���킢�ɂȂ邾�낤���c�c���񂾂��B";
	end;
}

2@gl_k.gat,145,123,0	warp	#22����		2,2,2@gl_k.gat,126,123
2@gl_k.gat,136,122,0	warp	#22����2	2,2,2@gl_k.gat,150,116

2@gl_k.gat,118,141,0	script	#2-1	139,5,5,{
OnStart:
OnTouch:
	setarray 'x[1],116,126,129, 87, 62, 60, 36;
	setarray 'y[1],139, 79, 52, 46,115, 80,136;
	set '@map$,getmdmapname("2@gl_k.gat");
	set '@id,substr(strnpcinfo(2),2,3);
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"���s�������m",2468,1,getmdnpcname("#22����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"�p�j����|��",2469,1,getmdnpcname("#22����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"�������̋R�m",2470,1,getmdnpcname("#22����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"���O�̃J�[���b�c�o�[�O",2471,1,getmdnpcname("#22����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"���ꂽ�R�m",2472,1,getmdnpcname("#22����_mobdead")+"::OnKilled"+'@id;
	hideonnpc;
	end;
}

2@gl_k.gat,128,81,0	duplicate(#2-1)	#2-2	139,5,5
2@gl_k.gat,131,54,0	duplicate(#2-1)	#2-3	139,5,5
2@gl_k.gat,89,48,0	duplicate(#2-1)	#2-4	139,5,5
2@gl_k.gat,64,117,0	duplicate(#2-1)	#2-5	139,5,5
2@gl_k.gat,62,82,0	duplicate(#2-1)	#2-6	139,5,5
2@gl_k.gat,38,138,0	duplicate(#2-1)	#2-7	139,5,5

2@gl_k.gat,1,1,0	script	#22����_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("2@gl_k.gat");
	set '@label$,getmdnpcname("#22����_mobdead")+"::OnKilled";
	setarray 'x[1],116,126,129, 87, 62, 60, 36;
	setarray 'y[1],139, 79, 52, 46,115, 80,136;
	areamonster '@map$,31,20,124,162,"���s�������m",2468,8,'@label$;
	areamonster '@map$,31,20,124,162,"�p�j����|��",2469,8,'@label$;
	areamonster '@map$,31,20,124,162,"�������̋R�m",2470,8,'@label$;
	areamonster '@map$,31,20,124,162,"���O�̃J�[���b�c�o�[�O",2471,8,'@label$;
	areamonster '@map$,31,20,124,162,"���ꂽ�R�m",2472,8,'@label$;
	for(set '@i,1; '@i<=7; set '@i,'@i+1)
		donpcevent getmdnpcname("#2-"+'@i)+"::OnStart";
	end;
OnKilled:
	set '@map$,getmdmapname("2@gl_k.gat");
	set '@label$,getmdnpcname("#22����_mobdead")+"::OnKilled";
	switch(rand(5)) {
	case 0: areamonster '@map$,31,20,124,162,"���s�������m",2468,1,'@label$; break;
	case 1: areamonster '@map$,31,20,124,162,"�p�j����|��",2469,1,'@label$; break;
	case 2: areamonster '@map$,31,20,124,162,"�������̋R�m",2470,1,'@label$; break;
	case 3: areamonster '@map$,31,20,124,162,"���O�̃J�[���b�c�o�[�O",2471,1,'@label$; break;
	case 4: areamonster '@map$,31,20,124,162,"���ꂽ�R�m",2472,1,'@label$; break;
	}
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#22����_mobdead")+"::OnKilled1");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x1)) {
		set 'area,'area|0x1;
		hideoffnpc getmdnpcname("#2-1");
	}
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#22����_mobdead")+"::OnKilled2");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x2)) {
		set 'area,'area|0x2;
		hideoffnpc getmdnpcname("#2-2");
	}
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#22����_mobdead")+"::OnKilled3");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x4)) {
		set 'area,'area|0x4;
		hideoffnpc getmdnpcname("#2-3");
	}
	end;
OnKilled4:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#22����_mobdead")+"::OnKilled4");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x8)) {
		set 'area,'area|0x8;
		hideoffnpc getmdnpcname("#2-4");
	}
	end;
OnKilled5:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#22����_mobdead")+"::OnKilled5");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x10)) {
		set 'area,'area|0x10;
		hideoffnpc getmdnpcname("#2-5");
	}
	end;
OnKilled6:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#22����_mobdead")+"::OnKilled6");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x20)) {
		set 'area,'area|0x20;
		hideoffnpc getmdnpcname("#2-6");
	}
	end;
OnKilled7:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#22����_mobdead")+"::OnKilled7");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x40)) {
		set 'area,'area|0x40;
		hideoffnpc getmdnpcname("#2-7");
	}
	end;
OnTimer1000:
	stopnpctimer;
	if('spawn)
		end;
	set 'spawn,1;

	set '@r,rand(1,7);
	areamonster getmdmapname("2@gl_k.gat"),'x['@r],'y['@r],'x['@r]+5,'y['@r]+5,"��ɂ̃��C�����i�C�g",2473,1,getmdnpcname("#22����_mobdead")+"::OnKilled8";
	announce "�o�������g : ���̎׈��ȋC�́c�c�I�@����ȗ͂��������������߂��ɂ��邼�I",0x9,0xffff44,0x190,15;
	end;
OnKilled8:
	hideonnpc;
	hideoffnpc getmdnpcname("#23����");
	hideoffnpc getmdnpcname("#23����2");
	announce "�o�������g : �悵�A�����̌��E����ꂽ�悤���B�����ʘH���瓌���̃G���A�Ɉړ����邼�B",0x9,0xffff00;
	end;
}

2@gl_k.gat,154,101,0	warp	#23����		2,2,2@gl_k.gat,174,101
2@gl_k.gat,165,101,0	warp	#23����2	2,2,2@gl_k.gat,150,111

2@gl_k.gat,171,120,0	script	#3-1	139,5,5,{
OnStart:
OnTouch:
	setarray 'x[1],169,230,254,210,241,227,179;
	setarray 'y[1],118,131,147,104, 71, 24, 32;
	set '@map$,getmdmapname("2@gl_k.gat");
	set '@id,substr(strnpcinfo(2),2,3);
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"���s�������m",2468,1,getmdnpcname("#23����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"�p�j����|��",2469,1,getmdnpcname("#23����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"�������̋R�m",2470,1,getmdnpcname("#23����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"���O�̃J�[���b�c�o�[�O",2471,1,getmdnpcname("#23����_mobdead")+"::OnKilled"+'@id;
	areamonster '@map$,'x['@id],'y['@id],'x['@id]+5,'y['@id]+5,"���ꂽ�R�m",2472,1,getmdnpcname("#23����_mobdead")+"::OnKilled"+'@id;
	hideonnpc;
	end;
}

2@gl_k.gat,232,133,0	duplicate(#3-1)	#3-2	139,5,5
2@gl_k.gat,256,149,0	duplicate(#3-1)	#3-3	139,5,5
2@gl_k.gat,212,106,0	duplicate(#3-1)	#3-4	139,5,5
2@gl_k.gat,243,73,0		duplicate(#3-1)	#3-5	139,5,5
2@gl_k.gat,229,26,0		duplicate(#3-1)	#3-6	139,5,5
2@gl_k.gat,181,34,0		duplicate(#3-1)	#3-7	139,5,5

2@gl_k.gat,2,1,0	script	#23����_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("2@gl_k.gat");
	set '@label$,getmdnpcname("#23����_mobdead")+"::OnKilled";
	setarray 'x[1],169,230,254,210,241,227,179;
	setarray 'y[1],118,131,147,104, 71, 24, 32;
	areamonster '@map$,175,18,265,163,"���s�������m",2468,8,'@label$;
	areamonster '@map$,175,18,265,163,"�p�j����|��",2469,8,'@label$;
	areamonster '@map$,175,18,265,163,"�������̋R�m",2470,8,'@label$;
	areamonster '@map$,175,18,265,163,"���O�̃J�[���b�c�o�[�O",2471,8,'@label$;
	areamonster '@map$,175,18,265,163,"���ꂽ�R�m",2472,8,'@label$;
	for(set '@i,1; '@i<=7; set '@i,'@i+1)
		donpcevent getmdnpcname("#3-"+'@i)+"::OnStart";
	end;
OnKilled:
	if('spawn)
		end;
	set '@map$,getmdmapname("2@gl_k.gat");
	set '@label$,getmdnpcname("#23����_mobdead")+"::OnKilled";
	switch(rand(5)) {
	case 0: areamonster '@map$,175,18,265,163,"���s�������m",2468,1,'@label$; break;
	case 1: areamonster '@map$,175,18,265,163,"�p�j����|��",2469,1,'@label$; break;
	case 2: areamonster '@map$,175,18,265,163,"�������̋R�m",2470,1,'@label$; break;
	case 3: areamonster '@map$,175,18,265,163,"���O�̃J�[���b�c�o�[�O",2471,1,'@label$; break;
	case 4: areamonster '@map$,175,18,265,163,"���ꂽ�R�m",2472,1,'@label$; break;
	}
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#23����_mobdead")+"::OnKilled1");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x1)) {
		set 'area,'area|0x1;
		hideoffnpc getmdnpcname("#3-1");
	}
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#23����_mobdead")+"::OnKilled2");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x2)) {
		set 'area,'area|0x2;
		hideoffnpc getmdnpcname("#3-2");
	}
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#23����_mobdead")+"::OnKilled3");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x4)) {
		set 'area,'area|0x4;
		hideoffnpc getmdnpcname("#3-3");
	}
	end;
OnKilled4:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#23����_mobdead")+"::OnKilled4");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x8)) {
		set 'area,'area|0x8;
		hideoffnpc getmdnpcname("#3-4");
	}
	end;
OnKilled5:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#23����_mobdead")+"::OnKilled5");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x10)) {
		set 'area,'area|0x10;
		hideoffnpc getmdnpcname("#3-5");
	}
	end;
OnKilled6:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#23����_mobdead")+"::OnKilled6");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x20)) {
		set 'area,'area|0x20;
		hideoffnpc getmdnpcname("#3-6");
	}
	end;
OnKilled7:
	set '@count,getmapmobs(getmdmapname("2@gl_k.gat"),getmdnpcname("#23����_mobdead")+"::OnKilled7");
	set 'flag,'flag+1;
	if(!rand(35) || 'flag >= 35)
		initnpctimer;
	if('@count <= 0 && !('area&0x40)) {
		set 'area,'area|0x40;
		hideoffnpc getmdnpcname("#3-7");
	}
	end;
OnTimer1000:
	stopnpctimer;
	if('spawn)
		end;
	set 'spawn,1;

	set '@r,rand(1,7);
	areamonster getmdmapname("2@gl_k.gat"),'x['@r],'y['@r],'x['@r]+5,'y['@r]+5,"���ꂽ���C�����i�C�g",2474,1,getmdnpcname("#23����_mobdead")+"::OnKilled8";
	announce "�o�������g : ���̎׈��ȋC�́c�c�I�@����ȗ͂��������������߂��ɂ��邼�I",0x9,0xffff44,0x190,15;
	end;
OnKilled8:
	hideoffnpc getmdnpcname("#24����");
	hideoffnpc getmdnpcname("#24����2");
	announce "�o�������g : �悵�A���ׂĂ̌��E����ꂽ�悤���B�����ʘH���牜�ɐi�ނ��I",0x9,0xffff00;
	end;
}

2@gl_k.gat,153,214,3	script	���s��������#20	849,5,5,{
	if(sc_ison(4) || sc_ison(5) || sc_ison(119) || sc_ison(402) || sc_ison(438))
		end;
	set '@num,rand(3,7);
	set '@dummy,getmapxy('@map$,'@x,'@y,1);
	misceffect 124;
	hideonnpc;
	initnpctimer;
	killmonster getmdmapname("2@gl_k.gat"),getmdnpcname(strnpcinfo(0))+"::OnKilled";
	monster '@map$,'@x,'@y,"�}�S�b�g",2467,'@num,getmdnpcname(strnpcinfo(0))+"::OnKilled";
	end;
OnTimer60000:
	stopnpctimer;
	hideoffnpc;
	end;
}

2@gl_k.gat,155,195,4	duplicate(���s��������#20)	���s��������#21	849,5,5
2@gl_k.gat,154,188,2	duplicate(���s��������#20)	���s��������#22	849,5,5
2@gl_k.gat,143,195,5	duplicate(���s��������#20)	���s��������#23	849,5,5
2@gl_k.gat,132,214,4	duplicate(���s��������#20)	���s��������#24	849,5,5
2@gl_k.gat,125,208,2	duplicate(���s��������#20)	���s��������#25	849,5,5
2@gl_k.gat,114,210,3	duplicate(���s��������#20)	���s��������#26	849,5,5
2@gl_k.gat,137,182,6	duplicate(���s��������#20)	���s��������#27	849,5,5
2@gl_k.gat,138,246,8	duplicate(���s��������#20)	���s��������#28	849,5,5
2@gl_k.gat,132,260,7	duplicate(���s��������#20)	���s��������#29	849,5,5
2@gl_k.gat,128,251,1	duplicate(���s��������#20)	���s��������#30	849,5,5
2@gl_k.gat,179,260,3	duplicate(���s��������#20)	���s��������#31	849,5,5
2@gl_k.gat,170,261,4	duplicate(���s��������#20)	���s��������#32	849,5,5
2@gl_k.gat,177,219,2	duplicate(���s��������#20)	���s��������#33	849,5,5
2@gl_k.gat,190,214,5	duplicate(���s��������#20)	���s��������#34	849,5,5
2@gl_k.gat,201,214,4	duplicate(���s��������#20)	���s��������#35	849,5,5
2@gl_k.gat,143,260,4	duplicate(���s��������#20)	���s��������#1	849,5,5
2@gl_k.gat,145,236,4	duplicate(���s��������#20)	���s��������#2	849,5,5
2@gl_k.gat,141,222,2	duplicate(���s��������#20)	���s��������#3	849,5,5
2@gl_k.gat,147,203,5	duplicate(���s��������#20)	���s��������#4	849,5,5
2@gl_k.gat,167,225,4	duplicate(���s��������#20)	���s��������#5	849,5,5
2@gl_k.gat,172,233,2	duplicate(���s��������#20)	���s��������#6	849,5,5
2@gl_k.gat,176,244,3	duplicate(���s��������#20)	���s��������#7	849,5,5
2@gl_k.gat,184,248,6	duplicate(���s��������#20)	���s��������#8	849,5,5
2@gl_k.gat,193,228,8	duplicate(���s��������#20)	���s��������#9	849,5,5
2@gl_k.gat,206,250,7	duplicate(���s��������#20)	���s��������#10	849,5,5
2@gl_k.gat,130,249,1	duplicate(���s��������#20)	���s��������#11	849,5,5
2@gl_k.gat,122,236,5	duplicate(���s��������#20)	���s��������#12	849,5,5
2@gl_k.gat,130,228,7	duplicate(���s��������#20)	���s��������#13	849,5,5
2@gl_k.gat,106,226,8	duplicate(���s��������#20)	���s��������#14	849,5,5
2@gl_k.gat,104,245,8	duplicate(���s��������#20)	���s��������#15	849,5,5
2@gl_k.gat,131,187,8	duplicate(���s��������#20)	���s��������#16	849,5,5
2@gl_k.gat,121,197,8	duplicate(���s��������#20)	���s��������#17	849,5,5
2@gl_k.gat,107,194,8	duplicate(���s��������#20)	���s��������#18	849,5,5
2@gl_k.gat,92,187,8		duplicate(���s��������#20)	���s��������#19	849,5,5

2@gl_k.gat,150,163,0	warp	#24����		2,2,2@gl_k.gat,150,179
2@gl_k.gat,150,167,0	warp	#24����2	2,2,2@gl_k.gat,150,149

2@gl_k.gat,150,180,0	script	#�Q��on	139,1,1,{
	hideonnpc;
	announce "�H�H�H : ���Ȃ��ŉ������I�@���͂�㩂��c�c�����I",0x9,0xff7777;
	set '@map$,getmdmapname("2@gl_k.gat");
	monster '@map$,70,172,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,90,172,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,110,172,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,37,265,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,57,265,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,77,265,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,97,265,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,117,265,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,88,214,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";

	monster '@map$,170,172,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,190,172,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,210,172,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,230,172,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,188,264,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,208,264,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,220,219,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	monster '@map$,240,219,"�j�ł̉Ή�",2337,1,getmdnpcname("#�Q��on")+ "::OnKilled";
	end;
}

2@gl_k.gat,158,252,1	script	�q�������Y#22	650,3,3,{
	if(OLDGLAST_QUE >= 2) {
		mes "�]�n�C�����q�B�Ƌ���";
		mes "�@�q�������Y�ɒǂ������]";
		next;
		if(select("�}��","��b������") == 1) {
			hideonnpc;
			hideonnpc getmdnpcname("�n�C�����q#23");
			hideonnpc getmdnpcname("�o�������g#23");
			initnpctimer;
			setnpctimer 88000;
			close;
		}
		close2;
	}
	hideonnpc getmdnpcname("�q�������Y#22");
	hideoffnpc getmdnpcname("�q�������Y#23");
	initnpctimer;
	end;
OnTimer1000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk1";
	end;
OnTimer3000:
	donpcevent getmdnpcname("�Q���n���g#23")+"::OnTalk1";
	end;
OnTimer7000:
	donpcevent getmdnpcname("�n�C�����q#23")+"::OnTalk1";
	end;
OnTimer10000:
	donpcevent getmdnpcname("�Q���n���g#23")+"::OnTalk2";
	end;
OnTimer13000:
	donpcevent getmdnpcname("�n�C�����q#23")+"::OnTalk2";
	end;
OnTimer16000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk2";
	end;
OnTimer19000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk3";
	end;
OnTimer23000:
	donpcevent getmdnpcname("�Q���n���g#23")+"::OnTalk3";
	end;
OnTimer28000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk4";
	end;
OnTimer34000:
	donpcevent getmdnpcname("�n�C�����q#23")+"::OnTalk3";
	end;
OnTimer38000:
	donpcevent getmdnpcname("�n�C�����q#23")+"::OnTalk4";
	end;
OnTimer42000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk5";
	end;
OnTimer46000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk6";
	end;
OnTimer49000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk7";
	end;
OnTimer51000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk8";
	end;
OnTimer55000:
	donpcevent getmdnpcname("�n�C�����q#23")+"::OnTalk5";
	end;
OnTimer57000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk9";
	end;
OnTimer60000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk10";
	end;
OnTimer65000:
	donpcevent getmdnpcname("�q�������Y#23")+"::OnTalk11";
	end;
OnTimer67000:
	misceffect 63,getmdnpcname("�Q���n���g#23");
	end;
OnTimer69000:
	misceffect 231,getmdnpcname("�Q���n���g#23");
	end;
OnTimer71000:
	misceffect 247,getmdnpcname("�Q���n���g#23");
	end;
OnTimer73000:
	hideonnpc getmdnpcname("�q�������Y#23");
	misceffect 273,getmdnpcname("�Q���n���g#23");
	end;
OnTimer75000:
	donpcevent getmdnpcname("�n�C�����q#23")+"::OnTalk6";
	end;
OnTimer78000:
	hideonnpc getmdnpcname("�n�C�����q#23");
	donpcevent getmdnpcname("�o�������g#23")+"::OnTalk1";
	end;
OnTimer80000:
	misceffect 231,getmdnpcname("�Q���n���g#23");
	misceffect 247,getmdnpcname("�Q���n���g#23");
	end;
OnTimer81000:
	announce "�Q���n���g�̑̂��ς���Ă����c�c!!",0x9,0xffffff;
	end;
OnTimer84000:
	hideonnpc getmdnpcname("�o�������g#23");
	announce "�o�������g : ���̌��e�����ɂ��퓬����`�킹��B�@���e�̎w���ɏ]���񂾁B",0x9,0xffff00,0x190,15;
	misceffect 90,getmdnpcname("�Q���n���g#23");
	end;
OnTimer87000:
	stopnpctimer;
	hideonnpc getmdnpcname("�Q���n���g#23");
	donpcevent getmdnpcname("#�A���_����")+"::OnStart";
	donpcevent getmdnpcname("#2�{�X����")+"::OnStart";
	end;
OnTimer90000:
	announce "�Q���n���g�̑̂��ς���Ă����c�c!!",0x9,0xffffff;
	end;
OnTimer93000:
	misceffect 90,getmdnpcname("�Q���n���g#23");
	end;
OnTimer96000:
	stopnpctimer;
	hideonnpc getmdnpcname("�Q���n���g#23");
	donpcevent getmdnpcname("#�A���_����")+"::OnStart";
	donpcevent getmdnpcname("#2�{�X����")+"::OnStart";
	end;
}

2@gl_k.gat,153,250,8	script	�n�C�����q#23	652,{
	cutin "GL_HEINRICH1",2;
	mes "[�n�C�����q]";
	mes "�������ł���̂��A�q�������Y�I";
	close2;
	cutin "GL_HEINRICH1",255;
	end;
OnTalk1:
	unittalk "�n�C�����q : �Q���n���g!";
	end;
OnTalk2:
	unittalk "�n�C�����q : �Q���n���g�ɉ��������I�@�q�������Y�I";
	end;
OnTalk3:
	unittalk "�n�C�����q : �q�������Y�I�@���~���̐S���̌��Ђ��������Ȃ�΁A���������ɗp�͖����͂����I";
	end;
OnTalk4:
	unittalk "�n�C�����q : �Q���n���g�𗣂��I�@����ȏ�̋]���͕K�v�Ȃ����낤�I";
	end;
OnTalk5:
	unittalk "�n�C�����q : �q�������Y�I�@�M�l�A��΂ɋ����񂼁I";
	end;
OnTalk6:
	unittalk "�n�C�����q : ���̂܂ܓ������Ƃł��v���Ă���̂��I�@�q�������Y!!";
	end;
}

2@gl_k.gat,162,250,1	script	�o�������g#23	654,{
	cutin "GL_BARMUND2",2;
	mes "[�o�������g]";
	mes "���̍S������͉i����";
	mes "�����o�����͂ł��Ȃ��̂��낤���c�c�B";
	close2;
	cutin "GL_BARMUND2",255;
	end;
OnTalk1:
	unittalk "�o�������g : �n�C�����q���I�@�c�c�d���Ȃ��A�c���������������ŃA���_���C�X���~�߂Ȃ���΁I";
	end;
}

2@gl_k.gat,158,255,1	script	�Q���n���g#23	651,{
	mes "[�Q���n���g]";
	mes "�����c�c�����I";
	mes "�i�ߊ���A��āc�c";
	mes "�����������瓦���ĉ������I";
	close;
OnTalk1:
	unittalk "�Q���n���g : �����I�@�����ĉ������I�@����ȏ�͑ς����܂���I";
	end;
OnTalk2:
	unittalk "�Q���n���g : �i�ߊ��c�c�}���ł������瓦���c�c�B";
	end;
OnTalk3:
	unittalk "�Q���n���g : �ǂ�قǎ��̑̂��������Ƃ��A���̍��܂ŉ�����Ǝv���Ȃ�I�@�q�������Y�I";
	end;
}

2@gl_k.gat,158,252,4	script	�q�������Y#23	650,{
	cutin "GL_HIMEL2",2;
	mes "[�q�������Y]";
	mes "�f���炵����A�����܂ŗ���Ȃ�āB";
	mes "�h�ӂ𕥂�Ȃ��Ƃ����Ȃ���ˁB";
	close2;
	cutin "GL_HIMEL2",255;
	end;
OnTalk1:
	unittalk "�q�������Y : �f���炵���I�@�����܂ŗ����Ƃ͎v���Ă��Ȃ�������B";
	end;
OnTalk2:
	unittalk "�q�������Y : �ӂӂӁA���~���̐S���̌��Ђ͂��łɌ��������B�n�C�����q�B";
	end;
OnTalk3:
	unittalk "�q�������Y : �ނ̎ז������Ȃ���΂����Ƒ��������̂�����ǁB";
	end;
OnTalk4:
	unittalk "�q�������Y : �{���ɂ����v���Ă���́H�@�����B�҂Ȃ͉̂������m���ς��Ȃ��̂ˁc�c�B";
	end;
OnTalk5:
	unittalk "�q�������Y : ����B";
	end;
OnTalk6:
	unittalk "�q�������Y : �ނ��Ō�̕����Ȃ�ł��傤�H";
	end;
OnTalk7:
	unittalk "�q�������Y : �ށA���Ȃ�̘r�O��������B";
	end;
OnTalk8:
	unittalk "�q�������Y : ���̐V�����A���_���C�X�̑f�̂ɂ҂�����Ȓ��ɂˁB";
	end;
OnTalk9:
	unittalk "�q�������Y : ���`��|���B";
	end;
OnTalk10:
	unittalk "�q�������Y : �܂��A���Ȃ��Ƃ͂��������b���������Ƃ����邵�A���̋@��ɂ܂���܂��傤�B";
	end;
OnTalk11:
	unittalk "�q�������Y : ���ǁA���͐��܂�ς���������Ƃ�����ł����Ă��Ȃ����B";
	end;
}

2@gl_k.gat,150,247,5	script	�o�������g�̌��e#�o�t1::�o�������g�̌��e#1	654,3,3,{
	end;
OnTouch:
	sc_start SC_GLASTHEIM_STATE,30000,25;		//SI_GLASTHEIM_STATE
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	unittalk "�o�������g�̌��e : �A���_���C�X�����͂Ȗ��@���g�p���邼�I�@���̋߂��܂ŉ�����I";
	end;
OnTimer12000:
	stopnpctimer;
	hideonnpc;
	end;
}

2@gl_k.gat,165,247,3	script	�o�������g�̌��e#�o�t2::�o�������g�̌��e#2	654,3,3,{
	end;
OnTouch:
	sc_start SC_GLASTHEIM_STATE,30000,25;		//SI_GLASTHEIM_STATE
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	unittalk "�o�������g�̌��e : ���͍U���̃`�����X���I�@���̋߂��ɗ��ċ������󂯂�񂾁I";
	end;
OnTimer12000:
	stopnpctimer;
	hideonnpc;
	end;
}

2@gl_k.gat,150,232,8	script	�o�������g�̌��e#�o�t3::�o�������g�̌��e#3	654,3,3,{
	end;
OnTouch:
	sc_start SC_GLASTHEIM_STATE,30000,25;		//SI_GLASTHEIM_STATE
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	unittalk "�o�������g�̌��e : �A���_���C�X�̏������������ɂ����O�ɁA���̋߂��ɗ��đԐ��𗧂Ē����񂾁I";
	end;
OnTimer12000:
	stopnpctimer;
	hideonnpc;
	end;
}

2@gl_k.gat,165,232,2	script	�o�������g�̌��e#�o�t4::�o�������g�̌��e#4	654,3,3,{
	end;
OnTouch:
	sc_start SC_GLASTHEIM_STATE,30000,25;		//SI_GLASTHEIM_STATE
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	unittalk "�o�������g�̌��e : �A���_���C�X�̗͂ɂ��ꂽ���Ȃ���΁A���̋߂��ŕ⏕���󂯂�񂾁I";
	end;
OnTimer12000:
	stopnpctimer;
	hideonnpc;
	end;
}

2@gl_k.gat,3,1,0	script	#2�{�X����	844,{
OnStart:
	initnpctimer;
	end;
OnTimer32000:
	set '@map$,getmdmapname("2@gl_k.gat");
	set '@label$,getmdnpcname("#2�{�X����")+"::OnKilled";
	donpcevent getmdnpcname("#�A���_����")+"::OnCasting";
	donpcevent getmdnpcname("#2�{�X����_bc")+"::OnStart";
	if(rand(2))
		areamonster '@map$,150,232,165,247,"#�_�[�N",2495,rand(2,5),'@label$;
	switch(rand(4)) {
	case 0:
		areamonster '@map$,150,232,165,247,"���s�������m",2468,1,'@label$;
		areamonster '@map$,150,232,165,247,"�p�j����|��",2469,1,'@label$;
		areamonster '@map$,150,232,165,247,"�������̋R�m",2470,1,'@label$;
		areamonster '@map$,150,232,165,247,"���O�̃J�[���b�c�o�[�O",2471,1,'@label$;
		areamonster '@map$,150,232,165,247,"���ꂽ�R�m",2472,1,'@label$;
		break;
	case 1:
		areamonster '@map$,150,232,165,247,"���s�������m",2468,rand(2,5),'@label$;
		break;
	case 2:
		areamonster '@map$,150,232,165,247,"�p�j����|��",2469,rand(2,5),'@label$;
		break;
	case 3:
		areamonster '@map$,150,232,165,247,"�������̋R�m",2470,rand(2,5),'@label$;
		break;
	case 4:
		areamonster '@map$,150,232,165,247,"���O�̃J�[���b�c�o�[�O",2471,rand(2,5),'@label$;
		break;
	case 5:
		areamonster '@map$,150,232,165,247,"���ꂽ�R�m",2472,rand(2,5),'@label$;
		break;
	}
	end;
OnTimer62000:
	killmonster getmdmapname("2@gl_k.gat"),getmdnpcname("#2�{�X����")+"::OnKilled";
	initnpctimer;
	end;
OnKilled:
	end;
}

2@gl_k.gat,4,1,0	script	#2�{�X����_bc	844,{
OnStart:
	if(rand(2)) {
		donpcevent getmdnpcname("�o�������g�̌��e#2")+"::OnStart";
		donpcevent getmdnpcname("�o�������g�̌��e#3")+"::OnStart";
	}
	else {
		donpcevent getmdnpcname("�o�������g�̌��e#1")+"::OnStart";
		donpcevent getmdnpcname("�o�������g�̌��e#4")+"::OnStart";
	}
	end;
}

2@gl_k.gat,5,1,0	script	#�A���_����	844,{
OnStart:
	set 'mob,callmonster(getmdmapname("2@gl_k.gat"),158,255,"�A���_���C�X#1",2476,getmdnpcname("#�A���_����")+"::OnKilled");
	set 'maxhp,getmobhp('mob);
	end;
OnCasting:
	set '@hp,getmobhp('mob) / 'maxhp * 100;
	if('@hp < 20) {
		announce "�o�������g�̌��e : ��̗͎̑͂c��킸�����I�@�Ō�܂Ŗ��f����ȁI",0x9,0x70dbdb;
	} else if('@hp < 50) {
		announce "�o�������g�̌��e : �������I�@��͂����Ԏ���Ă��Ă��邼�I",0x9,0x70dbdb;
	} else if('@hp < 70) {
		announce "�o�������g�̌��e : �����������݂����悤���A���̒��q�ł������I",0x9,0x70dbdb;
	} else {
		announce "�o�������g�̌��e : �܂��܂���ɂ͗]�T�����肻�����B�C������I",0x9,0x70dbdb;
	}
	end;
OnKilled:
	killmonster getmdmapname("2@gl_k.gat"),getmdnpcname("#�Q��on")+"::OnKilled";
	hideoffnpc getmdnpcname("�t�M��#21");
	hideoffnpc getmdnpcname("�������T��#1");
	for(set '@i,1; '@i<=35; set '@i,'@i+1)
		hideonnpc getmdnpcname("���s��������#"+'@i);
	end;
}

2@gl_k.gat,158,241,1	script	�t�M��#21	755,{
	if(checkquest(12319)) {
		if(checkquest(12319) & 0x4) {
			if(checkitemblank() < 2) {
				mes "[�t�M��]";
				mes "�n�������������������A";
				mes "�ו�����ꂻ�����ȁB";
				mes "�������̎�ނ����炵�Ă���";
				mes "������x�b�������Ă���B";
				close;
			}
			if(!(checkquest(12321) & 0x8)) {
				delquest 12319;
				setquest 12322;
				mes "[�t�M��]";
				mes "���߂Ăɂ��Ă�";
				mes "�ǂ�����Ă��ꂽ�ˁB";
				mes "����̂���͂͂������B";
				mes "�N�͂��ꂩ���";
				mes "���ɗ�������������ˁB";
				mes "�󂯎���Ă���B";
				setquest 12321;
				compquest 12321;
				getitem 6607,5;
				getitem 6608,5;
				getexp 350000,0;
				getexp 0,250000;
				set OLDGLAST_QUE,2;
			}
			else {
				delquest 12319;
				setquest 12322;
				mes "[�t�M��]";
				mes "�悭����Ă��ꂽ�B";
				mes "���҂����ʂ肾�B";
				mes "����͂��炾�B";
				mes "�󂯎���Ă���B";
				getitem 6607,1;
				getitem 6608,1;
				set OLDGLAST_QUE,2;
			}
		}
		else {
			mes "[�t�M��]";
			mes "����A��킵���悤���ˁB";
			mes "���ɂƂ��Ă͏\���Ȍ��ʂ����B";
			next;
			mes "[�t�M��]";
			mes "�o�������g�̎��Ԃ͎����~�߂��B";
			mes "���̈���Ȏ��Ԃ̗��l�́A";
			mes "�i���ɂ��̃O���X�g�w�C���̔ߌ���";
			mes "�~�߂悤�Ƃ��邾�낤�B";
			next;
			mes "[�t�M��]";
			mes "�����A��X���Ԃ̒����҂�";
			mes "�ނ̍s�����Ď���������B";
			mes "���ꂩ����i���Ɂc�c";
			next;
			mes "[�t�M��]";
			mes "���ꂩ��N�̋L�����������Ă��炤�B";
			mes "���Ɏ��ɉ�����Ƃ��Ă��A";
			mes "�����o���Ă͂��Ȃ����낤�B";
			next;
			mes "[�t�M��]";
			mes "�܂����̂��߂�";
			mes "�����Ă���邱�Ƃ�";
			mes "���҂��Ă����B";
			mes "�ӂӂӁc�c";
			delquest 12319;
			//setquest 72955;
			//compquest 72955;
			close;
		}
		next;
		mes "[�t�M��]";
		mes "�o�������g�̎��Ԃ͎����~�߂��B";
		mes "���̈���Ȏ��Ԃ̗��l�́A";
		mes "�i���ɂ��̃O���X�g�w�C���̔ߌ���";
		mes "�~�߂悤�Ƃ��邾�낤�B";
		next;
		mes "[�t�M��]";
		mes "�����A��X���Ԃ̒����҂�";
		mes "�ނ̍s�����Ď���������B";
		mes "���ꂩ����i���Ɂc�c";
		next;
		mes "[�t�M��]";
		mes "���ꂩ��N�̋L�����������Ă��炤�B";
		mes "���Ɏ��ɉ�����Ƃ��Ă��A";
		mes "�����o���Ă͂��Ȃ����낤�B";
		next;
		mes "[�t�M��]";
		mes "�܂����̂��߂�";
		mes "�����Ă���邱�Ƃ�";
		mes "���҂��Ă����B";
		mes "�ӂӂӁc�c";
		next;
		mes "[�t�M��]";
		mes "�����A�L�����c���Ă�����";
		mes "^FF00001�K�̒뉀�𒲂ׂĂ݂�Ƃ����B^000000";
		mes "�c�c�o���Ă�����΂ȁB";
		misceffect 134,"";
		close2;
		warp getmdmapname("2@gl_k.gat"),159,245;
		end;
	}
	mes "[�t�M��]";
	mes "�����������Ԃ̋��Ԃ��c�Ȃ���";
	mes "�����͕���Ă��܂��I";
	mes "�}���ł�������o�Ȃ���΁B";
	mes "�����������ɗ��Ă���I";
	next;
	menu "�O�ɉ�������Ƃ�����C������c�c",-;
	mes "[�t�M��]";
	mes "�c�c����A�N�Ƃ͏��Ζʂ̂͂����B";
	mes "����Ȃ��Ƃ��A";
	mes "�����������Ԃ̋��Ԃ��������B";
	mes "�}���ł�������o�邼�B";
	next;
	if(select("��������������������Ă���s���܂�","�O�ɏo���ĉ�����") == 1) {
		mes "[�t�M��]";
		mes "�������H";
		mes "�����͂������������A";
		mes "�}���ł���B";
		close;
	}
	mes "[�t�M��]";
	mes "�}�����B";
	close2;
	warp "glast_01.gat",204,270;
	end;
}
