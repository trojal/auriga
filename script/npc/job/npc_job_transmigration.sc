//====================================================================
//Ragnarok Online - Transmigration NPC Script	by Blaze
//
//�@�� TRANSMIGRATE -> 0�`2
//�@   OLD_CLASS    -> �]���O�̐E�Ƃ�ۑ�
//====================================================================

//==========================================
// �Z�[�W�L���b�X��
//------------------------------------------

yuno_in02.gat,88,164,5	script	���e�E�X�V���v	742,{
	if(TRANSMIGRATE == 0) {
		if(BaseLevel < 99 || JobLevel < 50 || Class < CLASS_KN || Class > CLASS_CR2) {
			mes "[���e�E�X�V���v]";
			mes "��������Ⴂ�܂��B";
			mes "������̓V���o�C�`�F��";
			mes "���@�A�J�f�~�[�}���قł��B";
			mes "�����ɂ͋M�d�ȏ��Ђ�";
			mes "�������񂠂�܂��B";
			mes "������育���w���������B";
			close;
		}
		mes "[���e�E�X�V���v]";
		mes "��������Ⴂ�܂��B";
		mes "������̓V���o�C�`�F��";
		mes "���@�A�J�f�~�[�}���قł��B";
		mes "���񂲗��ق��ꂽ�̂́A";
		mes "�u���~���̏��v�����ǂ݂ɂȂ�";
		mes "���߂ł��傤�H";
		next;
		mes "[���e�E�X�V���v]";
		mes "���~���̏��͈�����Ƃ��Ă�";
		mes "���J���Ă���܂��B";
		mes "����ł����X�A���ړǂ݂�����";
		mes "���������������܂��c�c";
		next;
		mes "[���e�E�X�V���v]";
		mes "���������{�̏�Ԃ����܂�";
		mes "�ǂ�����܂���B";
		mes "�����ŉ{��������]�̕��ɂ́A";
		mes "��t���𒸂����Ƃɂ����";
		mes "���ʂɋ������Ă���܂��B";
		next;
		mes "[���e�E�X�V���v]";
		mes "��t����1,285,000Zeny�ł��B";
		mes "����͏��Ђ̈��S�ȕۑ���";
		mes "�Ï��Ќ����ɗ��p�����Ē����܂��B";
		mes "�\���󂠂�܂��񂪁A�{����";
		mes "����]�ł����炨�[�߂��������B";
		mes "����t�Ȃ����܂����H";
		next;
		if(select("��t����","��߂�")==2) {
			mes "[���e�E�X�V���v]";
			mes "������育���w���������B";
			mes "�y�������s�ɂȂ�Ƃ悢�ł��ˁB";
			close;
		}
		if(Zeny < 1285000) {
			mes "[���e�E�X�V���v]";
			mes "���X�������킹������Ȃ��悤�ł��ˁB";
			mes "���������ēx���m�F�Ȃ����Ă���";
			mes "���z�����������B";
			close;
		}
		set Zeny,Zeny-1285000;
		set TRANSMIGRATE,1;
		setquest 1000;
	}
	mes "[���e�E�X�V���v]";
	mes "���肪�Ƃ��������܂��B";
	mes "��t���͓��A�J�f�~�[�̌��������Ƃ���";
	mes "��؂Ɏg�킹�Ē����܂��B";
	mes "�ł́A�ǂ������ւ����肭�������B";
	close;
}

//==============================================================
yuno_in02.gat,93,207,0	script	���~���̏�	111,{
	if(Upper == UPPER_HIGH) {
		mes "[���~���̏�]";
		mes "�c�c�h���̐_�a�ւ̓������";
		mes "���܂�ς�肵�ґS�ĂɊJ����Ă���B";
		mes "�p�Y�����ޓ��ւ̎菕���Ƃ���";
		mes "���E���ǂ��ł��J����Ă���B";
		next;
		mes "[���~���̏�]";
		mes "�����ł́A�ނ�ׂ̈ɂ�����";
		mes "�������Ȃ���Ă���B";
		mes "�X�Ɍ����ł͐������Ƃ��ł���";
		mes "�肢������A���̐_�a�ł�";
		mes "���A�ł���ƌ����Ă���B";
		next;
		if(select("�ǂނ̂���߂�","������ǂ�")==1) {
			mes "[���~���̏�]";
			mes "�c�c�c�c";
			close;
		}
		mes "[���~���̏�]";
		mes "��Ɉ�ԋ߂��ꏊ�B������";
		mes "���@���L���[�̐_�a�֒ʂ��铹���肫�B";
		mes "�����A���i�Ȃ��҂͉i����";
		mes "�m�邱�Ƃ͂ł��ʁB";
		close2;
		warp "valkyrie.gat",48,8;
		end;
	}
	if(TRANSMIGRATE == 0) {
		mes "[���~���̏�]";
		mes "�c�c�c�c";
		close;
	}
	mes "[���~���̏�]";
	mes "�c�c�����Đ��̊����̋Ɛт̐��X��";
	mes "���ɋ^�⎋���ꂽ���Ƃ́A�p�Y�B�ɂ�";
	mes "�s���ɔ��藈��u���v�Ƃ���";
	mes "���ł������B�p�Y�Ƃ����ǂ�";
	mes "�Ŋ��̏u�Ԃ͕K���K�����̂ł��낤�B";
	next;
	mes "[���~���̏�]";
	mes "�������ǂ�ȉp�Y�ɂ܂�鎍��";
	mes "�L�^�A�����ɂ��`���������A";
	mes "���̍Ŋ��̋L�^�͎c���Ă��Ȃ������B";
	mes "����ɑ΂�����ڂ���_������B";
	mes "����́u���O�i���N�v�ɋL�q���ꂽ";
	mes "���@���L���[�Ɋւ�����e���B";
	next;
	mes "[���~���̏�]";
	mes "�l�ԂƂ��čŏ�̎��ɍō��̎�����";
	mes "�������ҁB���̎҂͍ŏI����ɂ�����";
	mes "��m�Ƃ��Đ�����B�����Ă��̍���";
	mes "���@���L���[�̓����ɂ��A";
	mes "���@���n���֌��������悤�ł���B";
	mes "����͕��ʂ̐l�X�̍Ŋ��Ƃ͈قȂ�B";
	next;
	mes "[���~���̏�]";
	mes "�p�Y�B�͗։􂷂邱�Ƃɂ����";
	mes "�^�̉p�Y�Ƃ��Đ��܂�ς��A";
	mes "�V���Ȏ���֌������Ƃ炷�҂ƂȂ�B";
	mes "�����ē|�ꂵ���͍̂Ăёh��A";
	mes "���͐V�����\�͂𓾂�ł��낤�B";
	next;
	mes "[���~���̏�]";
	mes "�������s�K�ɂ��A���~���̐S����";
	mes "�����A�嗤�S�y�֏������Ă��܂����B";
	mes "�����Ŏ��͗l�X�ȕ��@�ɂ����";
	mes "�X�Ȃ�𖾂�ڎw�����B�����c�c";
	next;
	mes "[���~���̏�]";
	mes "�c�O�Ȃ��炱��ȏ�";
	mes "�����m�邱�Ƃ��ł��Ȃ������B";
	mes "����䂦���͂����ɋL�^���c�����B";
	next;
	mes "[���~���̏�]";
	mes "���̒N�������̋L�^�������o���A";
	mes "���̈ӎu�Ɗ�]�A����̍Ō�̌���";
	mes "���o���p�Y�Ƃ��Đ��܂�ς�邱�Ƃ��A";
	mes "�����č���x���@���L���[�̐_�a��";
	mes "�p�Y�B�𓱂��҂������邱�Ƃ�";
	mes "�؂ɑ҂��]�ށB�܂����̌�Ɂc�c";
	set TRANSMIGRATE,2;
	close;
}

//==============================================================
yuno_in05.gat,49,43,0	script	���~���̐S��	111,{
	if(TRANSMIGRATE == 2)
		warp "valkyrie.gat",48,8;
	end;
}


//==========================================
// ���@���L���[�_�a
//------------------------------------------

valkyrie.gat,48,86,4	script	���@���L���[	811,{
	if(Upper != UPPER_NORMAL) {
		mes "[���@���L���[]";
		mes "�h���̃��@���n���ւ悭��";
		mes "���z�����������܂����B";
		mes "�������̂��x�܂���Ƃ悢�ł��傤�B";
		mes "��m�B�Ɍ�����I";
		close;
	}
	mes "[���@���L���[]";
	mes "�h���̃��@���n���ւ悭��";
	mes "���z�����������܂����B";
	mes "���ꂩ�猻�݂܂ł̐��𐮗����A";
	mes "�V���Ȑ��𓾂邱�ƂɂȂ�܂��B";
	mes "��m�B�Ɍ�����I";
	next;
	if(Weight || checkcart() || checkfalcon() || checkriding() || sc_ison(SC_ALL_RIDING)) {
		mes "[���@���L���[]";
		mes "���Ȃ��͏������Ȃ����";
		mes "�Ȃ�Ȃ����Ƃ�����܂��B";
		mes "���΂����x�݂��������c�c";
		mes "�����āA�g�ƐS�𖳂ɂ��Ă��������B";
		mes "���_�Ƃ����͖̂��S�̎���";
		mes "�\�����̂ł�����B";
		next;
		mes "[���@���L���[]";
		mes "�A�C�e���₨���c�c���������Ȃ�";
		mes "��̏�ԂłȂ���΂Ȃ�܂���B";
		mes "�������ɂ��������B��J�[�g�Ȃǂ�";
		mes "�����čs�����Ƃ͂ł��܂���B";
		mes "����ł́c�c�p�ӂ��ł��܂�����";
		mes "���z�����������B";
		close2;
		warp "yuno_in02.gat",93,205;
		end;
	}
	mes "[���@���L���[]";
	mes "�g���S�����ɂ��܂����ˁB";
	mes "�c�c�Y��Ȃ��S�ł��B";
	mes "���S�ɂȂ������A���Ȃ���";
	mes "���_���悭�\��Ă���܂��B";
	next;
	if(SkillPoint) {
		mes "[���@���L���[]";
		mes "�c�c����������悤�ł��ˁB";
		mes "�n��֖߂�A���̖�����S��";
		mes "���̂ĂɂȂ��Ă��炨�z�����������B";
		close2;
		warp "yuno_in02.gat",93,205;
		end;
	}
	mes "[���@���L���[]";
	mes "������Ȃ����c�c";
	mes "���Ȃ��ɍ��܂�Ă���";
	mes "�ߋ��̋L���������A";
	mes "���Ȃ��̐��_��";
	mes "���݂܂ł̉h���̏؂�";
	mes "�L�������܂��B";
	next;
	mes "[���@���L���[]";
	mes "�ł́c�c";
	mes "��A�E���h�ɉߋ��̋L�����c���܂��B";
	mes "��A���F���_���f�B�Ɍ��݂�";
	mes "�h���̏u�Ԃ������Ă��炢�܂��B";
	mes "�O�A�X�N���h�ɖ����ւ̐���";
	mes "�^��������悤�ɂ��܂��B";
	next;
	mes "[���@���L���[]";
	mes "���";
	next;
	mes "[���@���L���[]";
	mes "��c�c";
	next;
	mes "[���@���L���[]";
	mes "�O�c�c";
	set OLD_CLASS,Job;
	jobchange Job_Novice,UPPER_HIGH;
	set BaseLevel,1;
	resetstatus;
	resetskill;
	setoption 0x0000;
	skill 143,1,0;
	skill 142,1,0;
	set SkillPoint,0;
	set StatusPoint,100;
	set TRANSMIGRATE,0;
	chgquest 1000,50000;
	next;
	getitem 1202,1;
	getitem 2302,1;
	mes "[���@���L���[]";
	mes "���߂łƂ��������܂��B";
	mes "�S�Ă̋V�����I���������܂����B";
	mes "������́A�V���ȓ������";
	mes "��m�ւ̂����₩�ȑ��蕨�ł��B";
	next;
	mes "[���@���L���[]";
	mes "���ꂮ����A�ߋ��̃E���h��";
	mes "�L���������Ȃ��̐������ʂ�";
	mes "�Ȃ�Ȃ��悤�ɂ��ė~�����Ǝv���܂��B";
	mes "�܂����݂̃��F���_���f�B���L������";
	mes "���Ȃ��̉h�����Č����邱�Ƃ��A";
	next;
	mes "[���@���L���[]";
	mes "�����Ė����̃X�N���h���L������";
	mes "���Ȃ��̐V���Ȑ��Ɍ����邱�Ƃ�";
	mes "�肢�܂��B";
	close2;
	switch(OLD_CLASS) {
		case Job_Knight:
		case Job_Crusader:
			warp "izlude.gat",94,103;
			break;
		case Job_Priest:
		case Job_Monk:
			warp "prontera.gat",273,354;
			break;
		case Job_Wizard:
		case Job_Sage:
			warp "geffen.gat",120,100;
			break;
		case Job_Blacksmith:
		case Job_Alchemist:
			warp "alberta.gat",116,57;
			break;
		case Job_Hunter:
		case Job_Bard:
		case Job_Dancer:
			warp "payon.gat",160,58;
			break;
		case Job_Assassin:
		case Job_Rogue:
			warp "morocc.gat",160,94;
			break;
	}
	end;
}

//==============================================================
valkyrie.gat,44,33,5	script	�e���|�[�^�[	124,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�e���|�[�^�[]";
			mes "�]�����߂łƂ��I";
			mes "��m�B�Ɍ�����I";
		}
		else {
			mes "[�e���|�[�^�[]";
			mes "�W���i�ɐG��Ȃ��ŁI";
		}
		close;
	}
	mes "[�e���|�[�^�[]";
	mes "��m�A�ǂ��֋A�肽���H";
	next;
	switch (select("�v�����e��","�����N","�t�F�C����","�Q�t�F��","�A���x���^","�C�Y���[�h","�A���f�o����","�R���h","�W���m�[")) {
		case 1: savepoint "prontera.gat",116,72; 	break;
		case 2: savepoint "morocc.gat",156,46; 		break;
		case 3: savepoint "payon.gat",160,58; 		break;
		case 4: savepoint "geffen.gat",120,39; 		break;
		case 5: savepoint "alberta.gat",117,56; 	break;
		case 6: savepoint "izlude.gat",91,105; 		break;
		case 7: savepoint "aldebaran.gat",160,109; 	break;
		case 8: savepoint "comodo.gat",209,143; 	break;
		case 9: savepoint "yuno.gat",328,101; 		break;
	}
	warp "SavePoint",0,0;
	end;
}

//==============================================================
valkyrie.gat,44,39,5	script	���[�h�i�C�g	56,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[���[�h�i�C�g]";
			mes "�]�����߂łƂ��I";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[���[�h�i�C�g]";
			mes "�F�A�N��]�����Ă���B";
			mes "�N�Ɉق�������҂͒N�����Ȃ��B";
			mes "���Ƃ͌N���g�̕]�����ȁB";
			mes "�N�̕]���́c�c";
			next;
			mes "[���[�h�i�C�g]";
			mes "�悵�A���v���ȁB";
		}
		close;
	}
	callfunc "JobChanger","���[�h�i�C�g",Job_Swordman,Job_Knight;
	mes "[���[�h�i�C�g]";
	mes "�h���̃��@���n���ւ悭�����ȁB";
	mes "���΂��x�����Ƃ肽�܂��B";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,44,42,5	script	�n�C�v���[�X�g	60,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�n�C�v���[�X�g]";
			mes "�]���̂��j����\���グ�܂��B";
			mes "�p�Y�ɏj�����I";
		}
		else {
			mes "[�n�C�v���[�X�g]";
			mes "�_��A�������ɗ��҂�";
			mes "�j���̏������炵���������B";
			mes "�����Ă��̎҂����[���ӎu��";
			mes "�n��֍L�߂�ׂ̗͂�";
			mes "���^�����������B";
		}
		close;
	}
	callfunc "JobChanger","�n�C�v���[�X�g",Job_Acolyte,Job_Priest;
	mes "[�n�C�v���[�X�g]";
	mes "�h���̃��@���n���ւ悭��";
	mes "���z�����������܂����B";
	mes "����A�x�������Ƃ肭�������B";
	mes "��m�ɏj�����I";
	close;
}

//==============================================================
valkyrie.gat,44,47,5	script	�n�C�E�B�U�[�h	735,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�n�C�E�B�U�[�h]";
			mes "�]�����߂łƂ��������܂��B";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�n�C�E�B�U�[�h]";
			mes "�N�������ȃn�C�E�B�U�[�h�ł�����A";
			mes "�n�C�E�B�U�[�h�炵���s����";
			mes "�S�����Ă��������B";
			mes "���B�n�C�E�B�U�[�h��";
			mes "���͂Ȗ��@�����䂦�A�T���ڂ�";
			mes "�s�����Ȃ���΂Ȃ�܂���B";
		}
		close;
	}
	callfunc "JobChanger","�n�C�E�B�U�[�h",Job_Magician,Job_Wizard;
	mes "[�n�C�E�B�U�[�h]";
	mes "�h���̃��@���n���ւ悤�����B";
	mes "���΂��x�������Ƃ肭�������B";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,44,50,5	script	�z���C�g�X�~�X	731,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�z���C�g�X�~�X]";
			mes "�]�����߂łƂ��I";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�z���C�g�X�~�X]";
			mes "�z�B����J�l�B";
			mes "�ق�"+strcharinfo(0)+"�A�̎������B";
			mes "��H�Ȃ񂾈Ⴄ�̂��B";
		}
		close;
	}
	callfunc "JobChanger","�z���C�g�X�~�X",Job_Merchant,Job_Blacksmith;
	mes "[�z���C�g�X�~�X]";
	mes "�h���̃��@���n���ɂ悭�����ȁB";
	mes "�܂��A�����x��ł�����B";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,44,55,5	script	�X�i�C�p�[	727,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�X�i�C�p�[]";
			mes "�]�����j���\���グ�܂��B";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�X�i�C�p�[]";
			mes "^6B8C21�ł́A�]�E�������n�߂܂��傤�B";
			mes "�������񂢂郂���X�^�[�̒���";
			mes "���O���u�]�E�����p�����X�^�[�v�݂̂�";
			mes "�|���Ă��������B����";
			mes "- ���Ƃ����ɋC�����Ă��������B -^000000";
			mes "��H�Ⴂ�܂������H";
		}
		close;
	}
	callfunc "JobChanger","�X�i�C�p�[",Job_Archer,Job_Hunter;
	mes "[�X�i�C�p�[]";
	mes "�h���̃��@���n���ւ悤�����B";
	mes "���񂨂��났���������B";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,44,58,5	script	�A�T�V���N���X	725,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�A�T�V���N���X]";
			mes "�]�����j���\���グ��B";
			mes "�K�^���F��I";
		}
		else {
			mes "[�A�T�V���N���X]";
			mes "�N�����ƌ������Ɓu�����̉�v�Ƃ��Ă�";
			mes "�v���C�h�͑厖�ɂ���I";
			mes "�����ăv���C�h���̂Ă�Ȃ�I";
		}
		close;
	}
	callfunc "JobChanger","�A�T�V���N���X",Job_Thief,Job_Assassin;
	mes "[�A�T�V���N���X]";
	mes "���@���n���ւ悭�����ȁB";
	mes "�����x��ł����B";
	mes "�K�^���F��I";
	close;
}

//==============================================================
valkyrie.gat,53,39,3	script	�p���f�B��	752,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�p���f�B��]";
			mes "�]���̏j����\���グ�悤�B";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�p���f�B��]";
			mes "���킪�߂Â����邱�Ƃ�������";
			mes "�Y�ꂸ�ɁA�₦���Ȃ�b���Ȃ����I";
			mes "�N�ɃI�[�f�B���̂����삪����悤�ɁI";
			mes "�����A�s���Ȃ����I";
		}
		close;
	}
	callfunc "JobChanger","�p���f�B��",Job_Swordman,Job_Crusader;
	mes "[�p���f�B��]";
	mes "�h���̃��@���n���ւ悭�������B";
	mes "�����x��ł����Ȃ����B";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,53,42,3	script	�`�����s�I��	52,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�`�����s�I��]";
			mes "�]�����߂łƂ��I";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�`�����s�I��]";
			mes "�ł͂��ꂩ�犷���D�ق̋V���s���B";
			next;
			mes "[�`�����s�I��]";
			mes "�c�c�����B���O�͊���";
			mes "�]�E���Ă邶��Ȃ����B";
		}
		close;
	}
	callfunc "JobChanger","�`�����s�I��",Job_Acolyte,Job_Monk;
	mes "[�`�����s�I��]";
	mes "�h���̃��@���n���ւ悭�����B";
	mes "�����x��ł����ȁB";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,53,47,3	script	�v���t�F�b�T�[	743,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�v���t�F�b�T�[]";
			mes "�]�����߂łƂ��B";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�v���t�F�b�T�[]";
			mes "�_���͑�؂ɕۊǂ��Ȃ����B";
			mes "�N���������厖�ȏ���������ˁB";
			mes "�������ꂪ�𗧂��Ƃ�";
			mes "����ł��傤�B";
			mes "�ǂݕԂ��ċL�����Ă����Ȃ����B";
		}
		close;
	}
	callfunc "JobChanger","�v���t�F�b�T�[",Job_Magician,Job_Sage;
	mes "[�v���t�F�b�T�[]";
	mes "�h���̃��@���n���ɂ悭�����܂����B";
	mes "���΂��̋x���𓾂Ȃ����B";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,53,58,3	script	�`�F�C�T�[	747,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�`�F�C�T�[]";
			mes "�]�����߂łƁ`�I";
			mes "�K�^���F���I";
		}
		else {
			mes "[�`�F�C�T�[]";
			mes "���������A�����t��";
			mes "^3333FF�A���K���͐��B�p�i��";
			mes "���̂��Ă��Ȃ�^000000����B";
			mes "�ȁ`��ĂˁB���͂́I";
		}
		close;
	}
	callfunc "JobChanger","�`�F�C�T�[",Job_Thief,Job_Rogue;
	mes "[�`�F�C�T�[]";
	mes "���@���n���ւ悭�����ȁ`�I";
	mes "���傢�Ƌx�݂Ȃ�B";
	mes "�K�^���F��I";
	close;
}

//==============================================================
valkyrie.gat,53,50,3	script	�N���G�C�^�[	122,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�N���G�C�^�[]";
			mes "�]�����߂łƂ��B";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�N���G�C�^�[]";
			mes "�ˑR�����A���₾�B";
			mes "�h��l����w����5��";
			mes "�f�B�X�J�E���g24%�Ŕ������ꍇ��";
			mes "�f�B�X�J�E���g20%�Ŕ������ꍇ��";
			mes "���z�̍��͂����炩�H";
			mes "�ǂ����H����Ȃ̊ȒP����B";
		}
		close;
	}
	callfunc "JobChanger","�N���G�C�^�[",Job_Merchant,Job_Alchemist;
	mes "[�N���G�C�^�[]";
	mes "�h���̃��@���n���ւ悤�����I";
	mes "���������ŋx��ł����ȁB";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,53,54,3	script	�N���E��	741,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�N���E��]";
			mes "�]�����j���\���グ�܂��B";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�N���E��]";
			mes "���ƈꏏ�ɉ̂��Ă݂܂��傤�B";
			mes "���̋ȂȂ񂩂ǂ��ł��H";
		}
		close;
	}
	callfunc "JobChanger","�N���E��",Job_Archer,Job_Bard;
	mes "[�N���E��]";
	mes "�h���̃��@���n���ւ悤�����B";
	mes "���������ŋx�����Ƃ�Ƃ悢�ł��傤�B";
	mes "��m�Ɍ�����I";
	close;
}

//==============================================================
valkyrie.gat,53,56,3	script	�W�v�V�[	101,{
	if(Upper != UPPER_HIGH) {
		if(rand(3)) {
			mes "[�W�v�V�[]";
			mes "�]�����߂łƂ��I";
			mes "��m�Ɍ�����I";
		}
		else {
			mes "[�W�v�V�[]";
			mes "�͂����A�݁[�� : [��]";
			mes "�c�c�c�c";
		}
		close;
	}
	callfunc "JobChanger","�W�v�V�[",Job_Archer,Job_Dancer;
	mes "[�W�v�V�[]";
	mes "�h���̃��@���n���ւ悤�����I";
	mes "�����x��ł���A��Ȃ����ȁB";
	mes "��m�Ɍ�����I";
	close;
}


//==========================================
// �]���񎟓]�E�t�@���N�V����
//	callfunc "JobChanger","Name",1stClass,2ndClass
//------------------------------------------

function	script	JobChanger	{
	if(JobLevel < 40 || Job != getarg(1) || OLD_CLASS != getarg(2))
		return;
	mes "["+getarg(0)+"]";
	mes "�{���̎p�����߂��A";
	mes "���E�ɐV���Ȍ��������炷";
	mes "�����K��܂����B";
	mes "�V���Ȏp�ł��Ȃ��̓���";
	mes "����ł��������B";
	next;
	mes "["+getarg(0)+"]";
	mes getarg(0)+"��";
	mes "�]�E�Ȃ����܂����H";
	next;
	if(select("������","�͂�")==1) {
		mes "["+getarg(0)+"]";
		mes "�������ł��܂�����A";
		mes "�ēx�������K�˂��������B";
		mes "�p�Y�ɏj�����I";
		close;
	}
	if(SkillPoint) {
		mes "["+getarg(0)+"]";
		mes "�܂��w�΂Ȃ���΂Ȃ�Ȃ����Ƃ�";
		mes "������̂悤�ł��ˁB";
		mes "�X�L���|�C���g��S�ď���Ă���";
		mes "���z�����������B";
		close;
	}
	unequip;
	jobchange getarg(2),UPPER_HIGH;
	if(getbaseclass(Class,2) == CLASS_AM && SKILL_BIOETHICS == 13) {
		skill 238,1,0;
		set SKILL_BIOETHICS,0;
	}
	mes "["+getarg(0)+"]";
	mes "���j���\���グ�܂��B";
	mes "�n��֖߂�A���Ȃ��̂��͂�";
	mes "�l�X�����������������B";
	close;
}