//====================================================================
//Ragnarok Online - Summoner Script	by refis
//====================================================================

//------------------------------------------------------------
// Monstar Spawn
//------------------------------------------------------------
// do_tu01a.gat
do_tu01a.gat,100,320,75,55	monster	�G�b�O����	3495,30,5000,0,0
do_tu01a.gat,100,320,75,55	monster	�O���X�t�@�u��	3497,30,5000,0,0
//------------------------------------------------------------
// do_tu04a.gat
do_tu04a.gat,0,0,0,0	monster	�X�E�B�[�g�t���b�O	3499,40,5000,0,0
do_tu04a.gat,0,0,0,0	monster	�n���^�[�E���t	3500,30,5000,0,0
do_tu04a.gat,0,0,0,0	monster	���C���h�z�[�l�b�g	3498,30,5000,0,0
do_tu04a.gat,0,0,0,0	monster	���[�t���i�e�B�b�N	3496,40,5000,0,0
do_tu04a.gat,0,0,0,0	monster	��@�o�W�����X�N	3502,10,5000,0,0
//------------------------------------------------------------
// do_tu06a.gat
do_tu06a.gat,0,0,0,0	monster	��@�o�W�����X�N	3502,40,5000,0,0
do_tu06a.gat,0,0,0,0	monster	�g�����X�X�|�A	3501,30,5000,0,0
//------------------------------------------------------------
// do_tu07a.gat
do_tu07a.gat,0,0,0,0	monster	��@�o�W�����X�N	3502,80,5000,0,0
//------------------------------------------------------------

//------------------------------------------------------------
// �`���[�g���A��NPC
//------------------------------------------------------------
new_do1.gat,90,247,0	script	object01#new_do1	139,30,3,{
	mes "[�V�F��]";
	mes "����������Ȃ���B";
	mes "�������ɗ��Ă��傤�����B";
	set '@dummy,sleep2(1000);
	warp "new_do1.gat",95,260;
	end;
}

new_do1.gat,95,264,4	script	�V�F��#new_do1	10165,{
	if(DORAM_1QUE == 100) {
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�X�L�b�v���������s���ł��B";
		mes "�N���C�A���g���I�����Ȃ��ł��������B";
		mes "���s���ɏI�������ꍇ�A";
		mes "�ꕔ�̃A�C�e����o���l��";
		mes "�󂯎��Ȃ��ꍇ������܂��B^000000";
		next;
		mes "^ff0000�y�C���t�H���[�V�����z^000000";
		mes "^0000ff[next] ���N���b�N���Ă��������B^000000";
		next;
		mes "[�V�F��]";
		mes "�킩������B";
		mes "���ꂶ�Ⴛ�̂悤��";
		mes "��z���Ă�����B";
		mes "���Ȃ��̊���A���҂��Ă��I";
		set DORAM_1QUE,100;
		savepoint "lasagna.gat",299,239;
		warp "lasagna.gat",298,238;
		end;
	}
	//setquest 102845;
	//compquest 102845;
	mes "[�V�F��]";
	mes "�p�[�X�^�嗤�ւ悤�����I";
	mes "�V�����`���҂�����H";
	next;
	mes "[�V�F��]";
	mes "���̓V�F���B";
	mes "�O���痈��`���҂�";
	mes "�ē����Ă�́B";
	next;
	mes "[�V�F��]";
	mes "�N���N���c�c";
	mes "�ӂނӂށc�c";
	mes "���Ȃ��A^ff0000�T���i�[^000000�Ƃ��Ă̑f����";
	mes "�Ȃ��Ȃ��̂��̂������Ă��B";
	mes "�ǂ��`���҂ɂȂꂻ����B";
	next;
	mes "[�V�F��]";
	mes "�悩�����炱����";
	mes "�`���[�g���A�����󂯂āA";
	mes "�`���̊�b���w��ł����Ȃ��H";
	mes "�����Ƃ��ꂩ��̗���";
	mes "���ɗ��Ǝv����B";
	next;
	mes "[�V�F��]";
	mes "�����`���Ɏ��M������Ȃ�";
	mes "�`���[�g���A�����X�L�b�v���Ă�";
	mes "���܂�Ȃ���B";
	next;
	mes "[�V�F��]";
	mes "�ł�^0000ff���߂Ė`���ɏo��悤��";
	mes "���S�҂�������A";
	mes "�`���[�g���A���͐�΂�";
	mes "�󂯂Ă����������ǂ����B^000000";
	while(1) {
		next;
		switch(select("�����͂ǂ��H","^009eff�`���̊�b���w��(�`���[�g���A�����J�n)^000000","^ff0000�����ɖ`�����n�߂�(�`���[�g���A�����ȗ�)^000000")) {
		case 1:
			mes "[�V�F��]";
			mes "������^ff0000�p�[�X�^�嗤^000000�ɂ���";
			mes "^ff0000�`�����U�[�j���B^000000";
			mes "�ŋ߂ł̓~�b�h�K���h�Ƃ���";
			mes "�V�嗤���������ꂽ�����ŁA";
			mes "�嗤�̊e�n���炽������̃h������";
			mes "�W�܂��Ă��Ă����B";
			next;
			mes "[�V�F��]";
			mes "�����c�c�����{�ʂ�����";
			mes "�`���̊�b���ł��Ă��Ȃ�";
			mes "�h���������߂���̂�B";
			mes "�����玄��������";
			mes "�O���痈���h�������ē����Ă���́B";
			continue;
		case 2:
			mes "[�V�F��]";
			mes "���ꂶ��A";
			mes "�`���[�g���A�����ɑ����ˁB";
			mes "���Ȃ��̊���A���҂��Ă���I";
			close2;
			warp "do_tu01a.gat",29,283;
			end;
		case 3:
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "<���ׂẴ`���[�g���A����";
			mes "�X�L�b�v����>��I������ƁA";
			mes "�`���[�g���A���Ŋl���ł���";
			mes "�S�Ă̌o���l��A�C�e����";
			mes "�󂯎������ԂŁA";
			mes "���U�[�j������`�����J�n�ł��܂��B^000000";
			next;
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�������A��x�I��ł��Ă��܂���";
			mes "�`���[�g���A���̓��e��";
			mes "�ēx�m�F���邱�Ƃ͂ł��܂���B";
			mes "�`���[�g���A�����X�L�b�v���܂����H^000000";
			next;
			if(select("�����l����","^ff0000���ׂẴ`���[�g���A�����X�L�b�v����^000000") == 1) {
				mes "[�V�F��]";
				mes "�킩������B";
				mes "�ł́A�ǂ�����̂�����H";
				continue;
			}
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�X�L�b�v���������s���ł��B";
			mes "�N���C�A���g���I�����Ȃ��ł��������B";
			mes "���s���ɏI�������ꍇ�A";
			mes "�ꕔ�̃A�C�e����o���l��";
			mes "�󂯎��Ȃ��ꍇ������܂��B^000000";
			next;
			if(DORAM_1QUE <= 4){
				getitem 26135, 1;
			}
			if(DORAM_1QUE <= 32) {
				getitem 15273, 1;
				getitem 22183, 1;
			}
			if(DORAM_1QUE <= 37) {
				getitem 569, 50;
			}
			if(DORAM_1QUE <= 42) {
				getitem 19330, 1;
				getitem 28576, 1;
				getitem 15274, 1;
				getitem 22184, 1;
			}
			if(DORAM_1QUE <= 40) {
				getitem 12324, 1;
			}
			if(DORAM_1QUE == 0) {
				setquest 98400;
				delquest 98400;
				getexp 2,0;
				getexp 0,10;
			}
			if(DORAM_1QUE <= 1) {
				getexp 4,0;
				getexp 0,20;
			}
			if(DORAM_1QUE <= 2) {
				setquest 98402;
				delquest 98402;
				getexp 6,0;
				getexp 0,40;
			}
			if(DORAM_1QUE <= 3) {
				setquest 98403;
				delquest 98403;
				getexp 9,0;
				getexp 0,60;
			}
			if(DORAM_1QUE <= 6) {
				setquest 98404;
				delquest 98404;
				getexp 12,0;
				getexp 0,80;
			}
			if(DORAM_1QUE <= 8) {
				setquest 98405;
				delquest 98405;
				getexp 15,0;
				getexp 0,100;
			}
			if(DORAM_1QUE <= 10) {
				setquest 98406;
				delquest 98406;
				getexp 18,0;
				getexp 0,200;
			}
			if(DORAM_1QUE <= 12) {
				setquest 98407;
				delquest 98407;
				getexp 21,0;
				getexp 0,400;
			}
			if(DORAM_1QUE <= 14) {
				setquest 98408;
				delquest 98408;
				getexp 27,0;
				getexp 0,600;
				delitem 26135, 1;
				getitem2 26135, 1, 1, 4, 0, 0, 0, 0, 0;
			}
			if(DORAM_1QUE <= 16) {
				setquest 98409;
				delquest 98409;
				getexp 40,0;
				getexp 0,800;
			}
			if(DORAM_1QUE <= 18) {
				setquest 98410;
				delquest 98410;
				getexp 48,0;
				getexp 0,1000;
			}
			if(DORAM_1QUE <= 20) {
				setquest 98411;
				delquest 98411;
				getexp 61,0;
				getexp 0,1200;
			}
			if(DORAM_1QUE <= 20) {
				setquest 98412;
				delquest 98412;
				getexp 73,0;
				getexp 0,1400;
			}
			if(DORAM_1QUE <= 23) {
				setquest 98413;
				delquest 98413;
				getexp 87,0;
				getexp 0,1600;
			}
			if(DORAM_1QUE <= 24) {
				skill 142,1,0;
				getexp 103,0;
				getexp 0,1800;
			}
			if(DORAM_1QUE <= 25) {
				setquest 98415;
				delquest 98415;
				getexp 121,0;
				getexp 0,2000;
			}
			if(DORAM_1QUE <= 28) {
				setquest 98416;
				delquest 98416;
				getexp 140,0;
				getexp 0,2200;
			}
			if(DORAM_1QUE <= 29) {
				setquest 98417;
				delquest 98417;
				getexp 157,0;
				getexp 0,2400;
			}
			if(DORAM_1QUE <= 31) {
				setquest 98418;
				delquest 98418;
				getexp 177,0;
				getexp 0,2600;
			}
			if(DORAM_1QUE <= 32) {
				setquest 98419;
				delquest 98419;
				getexp 214,0;
				getexp 0,2800;
				getexp 239,0;
				getexp 0,3000;
			}
			if(DORAM_1QUE <= 33) {
				setquest 98421;
				delquest 98421;
				getexp 267,0;
				getexp 0,3200;
			}
			if(DORAM_1QUE <= 35) {
				setquest 98422;
				delquest 98422;
				getexp 298,0;
				getexp 0,3400;
				getexp 332,0;
				getexp 0,3600;
			}
			if(DORAM_1QUE <= 36) {
				setquest 98424;
				delquest 98424;
				getexp 389,0;
				getexp 0,3800;
			}
			if(DORAM_1QUE <= 38) {
				setquest 98425;
				delquest 98425;
				getexp 430,0;
				getexp 0,4000;
			}
			if(DORAM_1QUE <= 39) {
				setquest 98426;
				delquest 98426;
				getexp 475,0;
				getexp 0,6000;
				setquest 98427;
				delquest 98427;
				getexp 524,0;
				getexp 0,8000;
			}
			if(DORAM_1QUE <= 40) {
				setquest 98428;
				delquest 98428;
			}
			if(DORAM_1QUE <= 41) {
				getexp 577,0;
				getexp 0,10000;
			}
			if(DORAM_1QUE <= 42) {
				setquest 98429;
				delquest 98429;
				getexp 0,25000;
			}
			set DORAM_1QUE,100;
			mes "^ff0000�y�C���t�H���[�V�����z^000000";
			mes "^0000ff[next] ���N���b�N���Ă��������B^000000";
			next;
			mes "[�V�F��]";
			mes "�킩������B";
			mes "���ꂶ�Ⴛ�̂悤��";
			mes "��z���Ă�����B";
			mes "���Ȃ��̊���A���҂��Ă��I";
			savepoint "lasagna.gat",299,239;
			warp "lasagna.gat",298,238;
			end;
		}
	}
}

do_tu05a.gat,137,98,4	script	�V�F��#do_tu01a	10165,{
	mes "[�V�F��]";
	mes "����A�`���[�g���A����";
	mes "�I��������]������H";
	while(1) {
		next;
		switch(select("�����l����","^009eff�`���[�g���A���ɖ߂�^000000","^ff0000���ׂẴ`���[�g���A�����X�L�b�v����^000000")) {
		case 1:
			mes "[�V�F��]";
			mes "�킩������B";
			mes "���܂����������x�������ĂˁB";
			close;
		case 2:
			mes "[�V�F��]";
			mes "���ꂶ��A";
			mes "�`���[�g���A�����ɑ����ˁB";
			mes "���Ȃ��̊���A���҂��Ă���I";
			close2;
			if(DORAM_1QUE <= 1)
				warp "do_tu01a.gat",29,281;
			else if(DORAM_1QUE <= 24)
				warp "do_tu01a.gat",60,320;
			else if(DORAM_1QUE <= 26)
				warp "do_tu02a.gat",224,124;
			else if(DORAM_1QUE <= 34)
				warp "do_tu02a.gat",235,196;
			else if(DORAM_1QUE <= 35)
				warp "do_tu02a.gat",203,322;
			else if(DORAM_1QUE <= 37)
				warp "do_tu05a.gat",186,55;
			else if(DORAM_1QUE <= 38)
				warp "do_tu05a.gat",26,62;
			end;
		case 3:
			break;
		}
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "<���ׂẴ`���[�g���A����";
		mes "�X�L�b�v����>��I������ƁA";
		mes "�`���[�g���A���Ŋl���ł���";
		mes "�S�Ă̌o���l��A�C�e����";
		mes "�󂯎������ԂŁA";
		mes "���U�[�j������`�����J�n�ł��܂��B^000000";
		next;
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�������A��x�I��ł��Ă��܂���";
		mes "�`���[�g���A���̓��e��";
		mes "�ēx�m�F���邱�Ƃ͂ł��܂���B";
		mes "�`���[�g���A�����X�L�b�v���܂����H^000000";
		next;
		if(select("�����l����","^ff0000���ׂẴ`���[�g���A�����X�L�b�v����^000000") == 1) {
			mes "[�V�F��]";
			mes "�킩������B";
			mes "�ł́A�ǂ�����̂�����H";
			continue;
		}
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�X�L�b�v���������s���ł��B";
		mes "�N���C�A���g���I�����Ȃ��ł��������B";
		mes "���s���ɏI�������ꍇ�A";
		mes "�ꕔ�̃A�C�e����o���l��";
		mes "�󂯎��Ȃ��ꍇ������܂��B^000000";
		next;
		if(DORAM_1QUE <= 4){
			getitem 26135, 1;
		}
		if(DORAM_1QUE <= 32) {
			getitem 15273, 1;
			getitem 22183, 1;
		}
		if(DORAM_1QUE <= 37) {
			getitem 569, 50;
		}
		if(DORAM_1QUE <= 42) {
			getitem 19330, 1;
			getitem 28576, 1;
			getitem 15274, 1;
			getitem 22184, 1;
		}
		if(DORAM_1QUE <= 40) {
			getitem 12324, 1;
		}
		if(DORAM_1QUE == 0) {
			setquest 98400;
			delquest 98400;
			getexp 2,0;
			getexp 0,10;
		}
		if(DORAM_1QUE <= 1) {
			getexp 4,0;
			getexp 0,20;
		}
		if(DORAM_1QUE <= 2) {
			setquest 98402;
			delquest 98402;
			getexp 6,0;
			getexp 0,40;
		}
		if(DORAM_1QUE <= 3) {
			setquest 98403;
			delquest 98403;
			getexp 9,0;
			getexp 0,60;
		}
		if(DORAM_1QUE <= 6) {
			setquest 98404;
			delquest 98404;
			getexp 12,0;
			getexp 0,80;
		}
		if(DORAM_1QUE <= 8) {
			setquest 98405;
			delquest 98405;
			getexp 15,0;
			getexp 0,100;
		}
		if(DORAM_1QUE <= 10) {
			setquest 98406;
			delquest 98406;
			getexp 18,0;
			getexp 0,200;
		}
		if(DORAM_1QUE <= 12) {
			setquest 98407;
			delquest 98407;
			getexp 21,0;
			getexp 0,400;
		}
		if(DORAM_1QUE <= 14) {
			setquest 98408;
			delquest 98408;
			getexp 27,0;
			getexp 0,600;
			delitem 26135, 1;
			getitem2 26135, 1, 1, 4, 0, 0, 0, 0, 0;
		}
		if(DORAM_1QUE <= 16) {
			setquest 98409;
			delquest 98409;
			getexp 40,0;
			getexp 0,800;
		}
		if(DORAM_1QUE <= 18) {
			setquest 98410;
			delquest 98410;
			getexp 48,0;
			getexp 0,1000;
		}
		if(DORAM_1QUE <= 20) {
			setquest 98411;
			delquest 98411;
			getexp 61,0;
			getexp 0,1200;
		}
		if(DORAM_1QUE <= 20) {
			setquest 98412;
			delquest 98412;
			getexp 73,0;
			getexp 0,1400;
		}
		if(DORAM_1QUE <= 23) {
			setquest 98413;
			delquest 98413;
			getexp 87,0;
			getexp 0,1600;
		}
		if(DORAM_1QUE <= 24) {
			skill 142,1,0;
			getexp 103,0;
			getexp 0,1800;
		}
		if(DORAM_1QUE <= 25) {
			setquest 98415;
			delquest 98415;
			getexp 121,0;
			getexp 0,2000;
		}
		if(DORAM_1QUE <= 28) {
			setquest 98416;
			delquest 98416;
			getexp 140,0;
			getexp 0,2200;
		}
		if(DORAM_1QUE <= 29) {
			setquest 98417;
			delquest 98417;
			getexp 157,0;
			getexp 0,2400;
		}
		if(DORAM_1QUE <= 31) {
			setquest 98418;
			delquest 98418;
			getexp 177,0;
			getexp 0,2600;
		}
		if(DORAM_1QUE <= 32) {
			setquest 98419;
			delquest 98419;
			getexp 214,0;
			getexp 0,2800;
			getexp 239,0;
			getexp 0,3000;
		}
		if(DORAM_1QUE <= 33) {
			setquest 98421;
			delquest 98421;
			getexp 267,0;
			getexp 0,3200;
		}
		if(DORAM_1QUE <= 35) {
			setquest 98422;
			delquest 98422;
			getexp 298,0;
			getexp 0,3400;
			getexp 332,0;
			getexp 0,3600;
		}
		if(DORAM_1QUE <= 36) {
			setquest 98424;
			delquest 98424;
			getexp 389,0;
			getexp 0,3800;
		}
		if(DORAM_1QUE <= 38) {
			setquest 98425;
			delquest 98425;
			getexp 430,0;
			getexp 0,4000;
		}
		if(DORAM_1QUE <= 39) {
			setquest 98426;
			delquest 98426;
			getexp 475,0;
			getexp 0,6000;
			setquest 98427;
			delquest 98427;
			getexp 524,0;
			getexp 0,8000;
		}
		if(DORAM_1QUE <= 40) {
			setquest 98428;
			delquest 98428;
		}
		if(DORAM_1QUE <= 41) {
			getexp 577,0;
			getexp 0,10000;
		}
		if(DORAM_1QUE <= 42) {
			setquest 98429;
			delquest 98429;
			getexp 0,25000;
		}
		mes "^ff0000�y�C���t�H���[�V�����z^000000";
		mes "[�V�F��]";
		mes "�킩������B";
		mes "���ꂶ�Ⴛ�̂悤��";
		mes "��z���Ă�����B";
		mes "���Ȃ��̊���A���҂��Ă��I";
		set DORAM_1QUE,100;
		savepoint "lasagna.gat",299,239;
		warp "lasagna.gat",298,238;
		end;
	}
}

do_tu01a.gat,134,381,0	script	warp01#do_tu01a	45,2,2,{
	mes "^ff0000�y�C���t�H���[�V�����z";
	mes "�i�s���̃`���[�g���A������";
	mes "����Ă��܂��܂����B";
	mes "�i�s���̃`���[�g���A����";
	mes "�ꏊ�ɖ߂�܂����H^000000";
	next;
	if(select("�͂�","������") == 2) {
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A���̏ꏊ��";
		mes "�킩��Ȃ��Ȃ����ꍇ�A";
		mes "�ēx�b�������邱�Ƃ�";
		mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
		mes "�߂邱�Ƃ��ł��܂��B^000000";
		close;
	}
	if(DORAM_1QUE <= 1)
		warp "do_tu01a.gat",29,281;
	else if(DORAM_1QUE <= 22)
		warp "do_tu01a.gat",60,320;
	else
		warp "do_tu02a.gat",153,58;
	end;
}

do_tu01a.gat,29,283,0	script	object01#do_tu01a	139,1,1,{
	if(DORAM_1QUE == 0) {
		initnpctimer;
		cutin "do_su_001.bmp", 3;
		setquest 98400;
		set DORAM_1QUE,1;
	}
	end;
OnTimer1000:
	donpcevent "���x�c���A�W�F�j���[#do::OnTalk1";
	end;
OnTimer3000:
	stopnpctimer;
	donpcevent "���x�c���A�W�F�j���[#do::OnTalk2";
	end;
}

do_tu01a.gat,35,288,3	script	���x�c���A�W�F�j���[#do	10162,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	switch(DORAM_1QUE) {
	case 0:
	case 1:
		if(checkquest(98400)) {
			delquest 98400;
			getexp 2,10;
		}
		mes "[���x�c���A�W�F�j���[]";
		mes "�����A�������I�@��������N���b�N�o�����ȁB";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "NPC�Ƃ̉�b���ɂ��悻1���ȏ�";
		mes "��b��i�s���Ȃ������ꍇ�A";
		mes "��b�����f���Ă��܂��܂��B";
		mes "���̏ꍇ�A�ēx�b��������";
		mes "�K�v������̂ł����ӂ��������B^000000";
		next;
		mes "�@�`���[�g���A��<�u�K��>�@1/12";
		mes "************************";
		mes "�@�ENPC�̗��p";
		mes "�@�E�N�G�X�g�E�B���h�E�̊J��";
		mes "�@�E��{�I�Ȉړ�";
		mes "�@�E���݈ʒu�̊m�F";
		mes "************************";
		next;
		switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
		case 1:
			break;
		case 2:
			getexp 4,20;
			setquest 98402;
			set DORAM_1QUE,2;
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "���݉�b����NPC�ł�";
			mes "�`���[�g���A����";
			mes "�S�ďI�����܂����B";
			mes "���̃`���[�g���A���̏ꏊ��";
			mes "�������܂����H^000000";
			next;
			switch(select("���̏ꏊ�փ��[�v����","���[�v�����ɕ����Č�����","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				warp "do_tu01a.gat",60,319;
				end;
			case 2:
				close;
			}
		case 3:
			warp "do_tu05a.gat",136,95;
			end;
		}
		mes "[���x�c���A�W�F�j���[]";
		mes "�����O�����ɘb�������Ă��ꂽ�悤��";
		mes "���̐l�ɉ�������ɂ�";
		mes "�܂��͘b��������Ɨǂ����B";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�}�E�X�̃N���b�N�ŃQ�[������";
		mes "�e��C���^�[�t�F�[�X�𑀍�o���܂��B^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "NPC�Ƃ̉�b��ړ��A�����X�^�[�ւ̍U����";
		mes "�}�E�X�̍��N���b�N���g�p���܂��B^000000";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "^009eff�V�嗤^000000�ւ̓n�q��";
		mes "��]����`���҂��ȁH";
		mes "�ŋ߂͖{���ɑ����ȁB";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "�������A";
		mes "�b�𕷂����Ƃ��͋�������B";
		mes "^009eff�~�b�h�K���h^000000�Ƃ��������ȁH";
		mes "�s���s���ɂȂ��Ă���^009eff�i�r��^000000�ƈꏏ��";
		mes "��X�Ƃ͈قȂ�푰���Z�ސV�嗤��";
		mes "�������ꂽ���Ȃ�āB";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "�������ŕӋ��̋����ɉ߂��Ȃ�����";
		mes "����^009eff���U�[�j��^000000��";
		mes "���ł͊O���炫���h�����B�ł����ς����B";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "�����A�O���痈���h����������";
		mes "���Ȃ�����N�����Ă��Ăȁc�c";
		mes "�������炳��Ă���̂��B";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "������V�嗤�ւ̓n�q�҂ɂ�";
		mes "^009eff�t�@���t�@�[�����x�c^000000�ւ�";
		mes "���c���`���t���邱�Ƃɂ����B";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "���O���V�嗤�֓n�肽���Ȃ�";
		mes "���c�e�X�g���N���A����";
		mes "���x�c�ɓ����Ă���B";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "�Ƃ͂����A";
		mes "�`���̂���͂��m��Ȃ����";
		mes "�����Ȃ莎�����ۂ�����͂��Ȃ��B";
		mes "�܂��͖`���̊�b�������Ă��B";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "�k���ɒ��Ԃ̃A���I���҂��Ă���B";
		mes "�ނɏڂ����b�͕����Ă���B";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�A�C�R�������N���b�N���邩";
		mes "^ff0000<Alt>�L�[+<U>�L�[^009eff��";
		mes "�J�����Ƃ��ł��܂��B^000000";
		next;
		cutin "do_su_003.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E�ɂ�";
		mes "�s�����ڕW�������Ă���܂��B";
		mes "����̃N�G�X�g�ɂ�";
		mes "�s���悪�����Ă���̂ŁA";
		mes "�܂��͂�����ڎw���܂��傤�I^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "��ʉE��̃}�b�v��";
		mes "�����̌��ݒn���\������܂��B";
		mes "�N�G�X�g�E�B���h�E�̏�������";
		mes "�A���I��T���܂��傤�I^000000";
		next;
		cutin "do_su_003.bmp", 255;
		viewpoint 1, 60, 322, 1, 0xFF0000;
		mes "[���x�c���A�W�F�j���[]";
		mes "^009eff�A���I^000000�̂Ƃ���ɂ܂�";
		mes "�����ɒH�蒅����悤�ɁA";
		mes "^ff0000��ʉE��̒n�}�Ɉ�����Ă������B^000000";
		mes "����Ȃ��y�n���낤����";
		mes "�C��t���Đi�ނ悤�ɁI";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "^009eff�A���I^000000��";
		mes "���̐�̖`���ɕK�v�Ȃ��Ƃ�";
		mes "�F�X�Ƌ����Ă���邩��";
		mes "�q�˂Ă݂�Ɨǂ��B";
		mes "������͈ȏゾ�B";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u���x�c���̃��N�`���[�v��";
		mes "�󒍂��܂����B";
		mes "�N�G�X�g�E�B���h�E���J����";
		mes "�m�F���Ă݂܂��傤�I^000000";
		setquest 98402;
		set DORAM_1QUE,2;
		getexp 4,20;
		close;
	case 2:
		mes "[���x�c���A�W�F�j���[]";
		mes "���͂��O�̂悤�ɐV�嗤��ڎw����";
		mes "����Ă���D��S�����ȃh�����B��";
		mes "�o�}���Ȃ���΂Ȃ�Ȃ��B";
		mes "���̐�ǂ����邩�͂������ɂ���";
		mes "^009eff�A���I^000000���畷���Ă���B";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�A�C�R�������N���b�N���邩";
		mes "^ff0000<Alt>�L�[+<U>�L�[^009eff��";
		mes "�J�����Ƃ��ł��܂��B^000000";
		next;
		cutin "do_su_003.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E�ɂ�";
		mes "�s�����ڕW�������Ă���܂��B";
		mes "����̃N�G�X�g�ɂ�";
		mes "�s���悪�����Ă���̂ŁA";
		mes "�܂��͂�����ڎw���܂��傤�I^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "��ʉE��̃}�b�v��";
		mes "�����̌��ݒn���\������܂��B";
		mes "�N�G�X�g�E�B���h�E�̏�������";
		mes "�A���I��T���܂��傤�I^000000";
		next;
		cutin "do_su_003.bmp", 255;
		viewpoint 1, 60, 322, 1, 0xFF0000;
		mes "[���x�c���A�W�F�j���[]";
		mes "�A���I�̂Ƃ���ɂ܂�";
		mes "�����ɒH�蒅����悤�ɁA";
		mes "^ff0000��ʉE��̒n�}�Ɉ�����Ă������B^000000";
		mes "����Ȃ��y�n���낤����";
		mes "�C��t���Đi�ނ悤�ɁI";
		next;
		mes "[���x�c���A�W�F�j���[]";
		mes "�A���I�͎��B";
		mes "^009eff�t�@���t�@�[�����x�c^000000�̒��ł�";
		mes "�D�G�ȓz���B";
		mes "�F�X�Ƌ����Ă���邾�낤�B";
		close;
	default:
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A������";
		mes "����Ă��܂��܂����B";
		mes "�i�s���̃`���[�g���A����";
		mes "�ꏊ�ɖ߂�܂����H^000000";
		next;
		if(select("�͂�","������") == 2) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�i�s���̃`���[�g���A���̏ꏊ��";
			mes "�킩��Ȃ��Ȃ����ꍇ�A";
			mes "�ēx�b�������邱�Ƃ�";
			mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
			mes "�߂邱�Ƃ��ł��܂��B^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
OnTalk1:
	unittalk "���x�c���A�W�F�j���[ : �����A�����̐V����I�@���������I";
	end;
OnTalk2:
	unittalk "���x�c���A�W�F�j���[ : �������ɗ��āI�@�����N���b�N����񂾁I";
	end;
}

do_tu01a.gat,60,322,3	script	���x�c���A���I#do_tu01a	10154,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	while(1) {
		switch(DORAM_1QUE) {
		case 2:
			if(checkquest(98402)) {
				delquest 98402;
				getexp 6,40;
			}
			mes "�@�`���[�g���A��<�u�K��>�@2/12";
			mes "************************";
			mes "�@�E�����X�^�[�ւ̍U��";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				setquest 98403;
				delquest 98403;
				set DORAM_1QUE,4;
				getexp 9,60;
				continue;
			}
			emotion 12;
			mes "[���x�c���A���I]";
			mes "�₠�A���C�����H";
			mes "���ꂩ��N�̈ē���S������";
			mes "�A���I�ƌ������̂��B";
			mes "�N�͍K�^����B";
			mes "���̓t�@���t�@�[�����x�c�̒��ł�";
			mes "�����ɗD�G�Ȓc��������ȁI";
			next;
			mes "[���x�c���A���I]";
			mes "��̂̎��͎����͂ɂȂ��Ǝv����B";
			mes "�܂��͌N���ǂ̒��x�o���邩";
			mes "�����Ă��炨�����ȁH";
			next;
			mes "[���x�c���A���I]";
			mes "���̏��ɗ���܂ł�";
			mes "�߂��܂₫�̂悤�Ȑ�������";
			mes "�������Ȃ��������H";
			mes "�z���^009eff�G�b�O����^000000�Ƃ���";
			mes "�����X�^�[�Ȃ񂾁B";
			next;
			mes "[���x�c���A���I]";
			mes "�r������^009eff�G�b�O����^000000��";
			mes "3�̓|���Ă����I";
			mes "�N�̎��͂����Ɍ����Ă���I";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "���N���b�N�Ń����X�^�[�֍U���ł��܂��B";
			mes "��������߂�A�G�b�O������";
			mes "���N���b�N���Ă݂܂��傤�I^000000";
			close2;
			set DORAM_1QUE,3;
			setquest 98403;
			end;
		case 3:
			if(!(checkquest(98403)&0x4)) {
				mes "[���x�c���A���I]";
				mes "�r�����ɃG�b�O������";
				mes "3�̓|���Ă����I";
				mes "�N�̎��͂����Ɍ����Ă���I";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "���N���b�N�Ń����X�^�[�֍U���ł��܂��B";
				mes "��������߂�A�G�b�O������";
				mes "���N���b�N���Ă݂܂��傤�I^000000";
				close;
			}
			mes "[���x�c���A���I]";
			mes "�����A���X�̎��͂���Ȃ����B";
			mes "�V�嗤��ڎw���Ă��邾����";
			mes "���Ƃ͂���ȁB";
			emotion 21;
			next;
			mes "[���x�c���A���I]";
			mes "�N�Ȃ炱�̐�̌��������ł�";
			mes "����Ă����邾�낤�ˁB";
			next;
			if(checkquest(98403)) {
				delquest 98403;
				set DORAM_1QUE,4;
				getexp 9,60;
			}
		case 4:
		case 5:
			mes "�@�`���[�g���A��<�u�K��>�@3/12";
			mes "************************";
			mes "�@�E�����A�C�e�����̊J����";
			mes "�@�E�A�C�e���̑������@";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				getitem 26135, 1;
				setquest 98404;
				delquest 98404;
				set DORAM_1QUE,7;
				getexp 12,80;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "�悵�A���ꂩ��̖`���ɔ�����";
			mes "�������낤�B";
			next;
			if(DORAM_1QUE == 4){
				set DORAM_1QUE,5;
				getitem 26135,1;
			}
			mes "[���x�c���A���I]";
			mes "���n�����u���S�җp�L����炵�v��";
			mes "����������";
			mes "������x���ɘb�������Ă���B";
			mes "���������玟�̌P�����e��`���悤�B";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�A���I�����������A�C�e����";
			mes "�m�F���邽�߂ɁA";
			mes "�A�C�e���E�B���h�E��";
			mes "�J���Ă݂܂��傤�I";
			next;
			cutin "do_su_004.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�A�C�e���E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<E>�L�[^009eff��";
			mes "�J�����Ƃ��ł��܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�A�C�e���E�B���h�E�̑����^�u����";
			mes "�u���S�җp�L����炵�v��";
			mes "�_�u���N���b�N���Ă݂܂��傤�B";
			mes "�������邱�Ƃ��ł��܂��B";
			next;
			cutin "do_su_005.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�������Ă���A�C�e����";
			mes "�����E�B���h�E�Ŋm�F�ł��܂��B";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<Q>�L�[^009eff��";
			mes "�J�����Ƃ��ł��܂��B^000000";
			next;
			cutin "do_su_006.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�_�u���N���b�N�ȊO�ɂ��A";
			mes "�A�C�e���E�B���h�E����";
			mes "�����������A�C�e����";
			mes "�����E�B���h�E��";
			mes "�h���b�O���h���b�v���鎖�ŁA";
			mes "������ύX���邱�Ƃ��ł��܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�������A���������J���Ă��Ȃ�����";
			mes "�h���b�O���h���b�v��";
			mes "�n�ʂ��w�肷���";
			mes "�A�C�e���𗎂Ƃ��Ă��܂��̂�";
			mes "���ӂ��Ă��������B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�h���b�v���b�N�{�^����������";
			mes "���b�N��Ԃɂ���Βn�ʂ�";
			mes "�A�C�e�����̂Ă��邱�Ƃ͂Ȃ��Ȃ�܂��B";
			mes "�S�z�Ȑl�̓��b�N��Ԃ�";
			mes "���Ă����܂��傤�B^000000";
			setquest 98404;
			set DORAM_1QUE,6;
			close2;
			cutin "do_su_002.bmp", 255;
			end;
		case 6:
			if(getequipid(4) != 26135) {
				mes "[���x�c���A���I]";
				mes "�Ⴄ���̂�g�ɂ��Ă�ȁB";
				mes "�����n�����u���S�җp�L����炵�v��";
				mes "�g�ɕt���Ă��邩������x";
				mes "�m�F���Ă����ȁB";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�A���I�����������A�C�e����";
				mes "�m�F���邽�߂ɁA";
				mes "�A�C�e���E�B���h�E��";
				mes "�J���Ă݂܂��傤�I";
				next;
				cutin "do_su_004.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�A�C�e���E�B���h�E��";
				mes "�A�C�R�������N���b�N���邩";
				mes "^ff0000<Alt>�L�[+<E>�L�[^009eff��";
				mes "�J�����Ƃ��ł��܂��B^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�A�C�e���E�B���h�E�̑����^�u����";
				mes "�u���S�җp�L����炵�v��";
				mes "�_�u���N���b�N���Ă݂܂��傤�B";
				mes "�������邱�Ƃ��ł��܂��B";
				next;
				cutin "do_su_005.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�������Ă���A�C�e����";
				mes "�����E�B���h�E�Ŋm�F�ł��܂��B";
				mes "�A�C�R�������N���b�N���邩";
				mes "^ff0000<Alt>�L�[+<Q>�L�[^009eff��";
				mes "�J�����Ƃ��ł��܂��B^000000";
				next;
				cutin "do_su_006.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�_�u���N���b�N�ȊO�ɂ��A";
				mes "�A�C�e���E�B���h�E����";
				mes "�����������A�C�e����";
				mes "�����E�B���h�E��";
				mes "�h���b�O���h���b�v���鎖�ŁA";
				mes "������ύX���邱�Ƃ��ł��܂��B^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�������A���������J���Ă��Ȃ�����";
				mes "�h���b�O���h���b�v��";
				mes "�n�ʂ��w�肷���";
				mes "�A�C�e���𗎂Ƃ��Ă��܂��̂�";
				mes "���ӂ��Ă��������B^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�h���b�v���b�N�{�^����������";
				mes "���b�N��Ԃɂ���Βn�ʂ�";
				mes "�A�C�e�����̂Ă��邱�Ƃ͂Ȃ��Ȃ�܂��B";
				mes "�S�z�Ȑl�̓��b�N��Ԃ�";
				mes "���Ă����܂��傤�B^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[���x�c���A���I]";
			mes "�Ȃ��Ȃ����݂��݂������ȁB";
			mes "�V�嗤��ڎw���Ă��邾����";
			mes "���Ƃ͂���ȁB";
			next;
			delquest 98404;
			set DORAM_1QUE,7;
			getexp 12,80;
		case 7:
			mes "�@�`���[�g���A��<�u�K��>�@4/12";
			mes "************************";
			mes "�@�E�X�e�[�^�X�̐���";
			mes "�@�E�X�e�[�^�X�̐U���";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				setquest 98405;
				delquest 98405;
				set DORAM_1QUE,9;
				getexp 15,100;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "���ꂩ��̖`����";
			mes "�N�͗l�X�Ȍo����ς�";
			mes "�������Ă������낤�B";
			next;
			mes "[���x�c���A���I]";
			mes "�N�̐i�ޓ������߂邽�߂�";
			mes "�܂��̓X�e�[�^�X�ɂ���";
			mes "������[�߂�K�v������B";
			next;
			cutin "do_su_007.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X��6��ނ���܂��B";
			mes "���ꂼ��̓�����";
			mes "��������Ɣc�����Ă����܂��傤�I^000000";
			next;
			cutin "do_su_008.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X�E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<A>�L�[^009eff��";
			mes "�ŊJ�����Ƃ��ł��܂��B";
			mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I^000000";
			next;
			cutin "do_su_009.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�����N���b�N�����";
			mes "Status Point������A";
			mes "�X�e�[�^�X���㏸���܂��B";
			mes "Status Point��BaseLv��";
			mes "�オ�邲�Ƃɑ����܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "���Ղ�";
			mes "^ff0000Str20";
			mes "Dex20^009eff";
			mes "��ڎw���ăX�e�[�^�X��";
			mes "�グ�Ă����܂��傤�B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "��x�����Status Point��";
			mes "�߂����Ƃ��ł��܂���B";
			mes "�ԈႦ�ĕʂ̃X�e�[�^�X��";
			mes "�|�C���g���g�p���Ȃ��悤��";
			mes "�C��t���܂��傤�B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�Ȃ��h�����̓`���[�g���A���I����A";
			mes "���x�c���I���I�ɘb�������Ă���";
			mes "7���ԁABaseLv70�ɂȂ�܂�";
			mes "���x�ł��X�e�[�^�X��";
			mes "���Z�b�g�ł��܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X�̏グ�������";
			mes "�����X�^�[�Ƃ̐킢����";
			mes "�傫���ς��܂��B";
			mes "�����ɍ������X�e�[�^�X��";
			mes "�T���Ă݂܂��傤�B^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[���x�c���A���I]";
			mes "�X�e�[�^�X�ɂ��Ă͗����������H";
			mes "�ł́A������^0000ffDex��";
			mes "�u10�v�ɂȂ�܂ŏグ�Ă���B^000000";
			next;
			mes "[���x�c���A���I]";
			mes "���Ȃ݂ɃX�e�[�^�X��";
			mes "�u+���v�Ƃ���������";
			mes "������JobLv�ɂ��";
			mes "�X�e�[�^�X�{�[�i�X���B";
			mes "�����^0000ff�X�e�[�^�X�{�[�i�X���܂߂��A";
			mes "Dex��10�ɂ��Ă���B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�����A�C�e�������ׂĊO����A";
			mes "�X�e�[�^�X�擾�󋵂�";
			mes "���Z�b�g����܂����B^000000";
			setquest 98405;
			resetstatus;
			unequip -1;
			set DORAM_1QUE,8;
			close2;
			cutin "do_su_002.bmp", 255;
			end;
		case 8:
			if(readparam(bDex) < 10) {
				mes "[���x�c���A���I]";
				mes "Dex���܂�����Ȃ����B";
				mes "�u10�v�ɂȂ�܂ŏグ��񂾁B";
				mes "�N�̎��͂����Ɍ����Ă���I";
				next;
				mes "[���x�c���A���I]";
				mes "���Ȃ݂ɃX�e�[�^�X��";
				mes "�u+���v�Ƃ���������";
				mes "������JobLv�ɂ��";
				mes "�X�e�[�^�X�{�[�i�X���B";
				mes "�����^0000ff�X�e�[�^�X�{�[�i�X���܂߂��A";
				mes "Dex��10�ɂ��Ă���B^000000";
				next;
				cutin "do_su_008.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�X�e�[�^�X�E�B���h�E��";
				mes "�A�C�R�������N���b�N���邩";
				mes "^ff0000<Alt>�L�[+<A>�L�[^009eff��";
				mes "�ŊJ�����Ƃ��ł��܂��B";
				mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I^000000";
				next;
				cutin "do_su_009.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�����N���b�N�����";
				mes "Status Point������A";
				mes "�X�e�[�^�X���㏸���܂��B";
				mes "Status Point��BaseLv��";
				mes "�オ�邲�Ƃɑ����܂��B^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[���x�c���A���I]";
			mes "�悵�A������Dex���グ�Ă����ȁB";
			mes "����Ń����X�^�[�ɍU����";
			mes "�������₷���Ȃ������B";
			next;
			delquest 98405;
			set DORAM_1QUE,9;
			getexp 15,100;
		case 9:
			mes "�@�`���[�g���A��<�u�K��>�@5/12";
			mes "************************";
			mes "�@�E�X�L���ɂ���";
			mes "�@�E�X�L���E�B���h�E�̊J����";
			mes "�@�E�X�L���̐U���";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				setquest 98406;
				delquest 98406;
				set DORAM_1QUE,11;
				getexp 18,200;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "�悵�A���̓X�L���ɂ���";
			mes "�w�ڂ��ł͂Ȃ����B";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�X�L���͐E�Ɩ��ɈقȂ�";
			mes "�E�Ƃ��T���i�[�̋M����";
			mes "�U����񕜁A�⏕�̃X�L����";
			mes "�o���邱�Ƃ��ł��܂��B^000000";
			next;
			cutin "do_su_010.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�X�L���E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<S>�L�[^009eff��";
			mes "�J�����Ƃ��ł��܂��B";
			mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I^000000";
			next;
			cutin "do_su_011.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�K���������X�L�������N���b�N��";
			mes "�m��{�^���������āA";
			mes "�m�F�ɓ��ӂ���ƃX�L���|�C���g��";
			mes "����ăX�L�����K�����܂��B";
			mes "�X�L���|�C���g��JobLv��";
			mes "1�オ�邲�Ƃ�1�|�C���g�����܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "��x������X�L���|�C���g��";
			mes "�߂����Ƃ��ł��܂���B";
			mes "�ԈႦ�ĕʂ̃X�L����";
			mes "�|�C���g���g�p���Ȃ��悤��";
			mes "�C��t���܂��傤�B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�Ȃ��h�����̓`���[�g���A���I����A";
			mes "���x�c���I���I�ɘb�������Ă���";
			mes "7���ԁABaseLv70�ɂȂ�܂�";
			mes "���x�ł��X�L����";
			mes "���Z�b�g�ł��܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�K������X�L�������";
			mes "�����X�^�[�Ƃ̐킢����";
			mes "�傫���ς��܂��B";
			mes "�����ɍ������X�L����";
			mes "�T���Ă݂܂��傤�B^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[���x�c���A���I]";
			mes "�X�L���ɂ��Ă͗����������H";
			mes "�ł́A������";
			mes "^0000ff�u�h������{�X�L���v^000000��";
			mes "^0000ff�u���݂��v^000000��";
			mes "���K�����Ă݂Ă���B";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�X�L���̒��ɂ͊o���邽�߂�";
			mes "������������̂�����܂��B";
			mes "�u���݂��v���K������ɂ�";
			mes "�u�h������{�X�L���vLv1��";
			mes "�K�����Ă���K�v������܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�܂��́u�h������{�X�L���v��";
			mes "�K�����Ă���";
			mes "�u���݂��v���K�����܂��傤�B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�����A�C�e�������ׂĊO����A";
			mes "�X�L���擾�󋵂�";
			mes "���Z�b�g����܂����B^000000";
			setquest 98406;
			resetskill;
			unequip -1;
			set DORAM_1QUE,10;
			close;
		case 10:
			if(getskilllv(5019) == 0) {		// ���݂��X�L��
				mes "[���x�c���A���I]";
				if(getskilllv(5018) == 0) {		// �h������{�X�L��
					mes "�ǂ���̃X�L�����܂�";
					mes "�擾�ł��Ă��Ȃ����H";
				}
				else {
					mes "���݂��̃X�L����";
					mes "�܂��擾�ł��Ă��Ȃ����B";
				}
				mes "������x�m�F���Ă���B";
				next;
				cutin "do_su_010.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�X�L���E�B���h�E��";
				mes "�A�C�R�������N���b�N���邩";
				mes "^ff0000<Alt>�L�[+<S>�L�[^009eff��";
				mes "�J�����Ƃ��ł��܂��B";
				mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I^000000";
				next;
				cutin "do_su_011.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�K���������X�L�������N���b�N��";
				mes "�m��{�^���������āA";
				mes "�m�F�ɓ��ӂ���ƃX�L���|�C���g��";
				mes "����ăX�L�����K�����܂��B^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "��x������X�L���|�C���g��";
				mes "�߂����Ƃ��ł��܂���B";
				mes "�ԈႦ�ĕʂ̃X�L����";
				mes "�|�C���g���g�p���Ȃ��悤��";
				mes "�C��t���܂��傤�B^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�Ȃ��h�����̓`���[�g���A���I����A";
				mes "���x�c���I���I�ɘb�������Ă���";
				mes "7���ԁABaseLv70�ɂȂ�܂�";
				mes "���x�ł��X�L����";
				mes "���Z�b�g�ł��܂��B^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�K������X�L�������";
				mes "�����X�^�[�Ƃ̐킢����";
				mes "�傫���ς��܂��B";
				mes "�����ɍ������X�L����";
				mes "�T���Ă݂܂��傤�B^000000";
				next;
				cutin "do_su_002.bmp", 255;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�X�L���̒��ɂ͊o���邽�߂�";
				mes "������������̂�����܂��B";
				mes "�u���݂��v���K������ɂ�";
				mes "�u�h������{�X�L���vLv1��";
				mes "�K�����Ă���K�v������܂��B^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�܂��́u�h������{�X�L���v��";
				mes "�K�����Ă���";
				mes "�u���݂��v���K�����܂��傤�B^000000";
				close;
			}
			emotion 21;
			mes "[���x�c���A���I]";
			mes "�����ƃX�L����";
			mes "�o���Ă����ȁB";
			mes "���������g�������Ȃ��Ă������H";
			next;
			delquest 98406;
			set DORAM_1QUE,11;
			getexp 18,200;
		case 11:
			mes "�@�`���[�g���A��<�u�K��>�@6/12";
			mes "************************";
			mes "�@�E�V���[�g�J�b�g�E�B���h�E";
			mes "�@�E�X�L���̎g����";
			mes "�@�E�X�L���̎����ł�";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				setquest 98407;
				delquest 98407;
				set DORAM_1QUE,13;
				getexp 21,400;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "�悵�A�ł͍��o�����X�L����";
			mes "���������g���Ă݂悤���B";
			next;
			mes "[���x�c���A���I]";
			mes "���ƁA���̑O�ɁA";
			mes "�X�L����A�C�e����o�^�ł���";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "�������悤�B";
			next;
			mes "[���x�c���A���I]";
			mes "�X�L����A�C�e����";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "�o�^���Ă����ƁA";
			mes "�f�����g�p���邱�Ƃ��ł��邼�B";
			next;
			cutin "do_su_027.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "^ff0000<Ctrl>�L�[+<F12>�L�[^009eff��";
			mes "�J�����Ƃ��ł��܂��B";
			mes "�V���[�g�J�b�g�E�B���h�E��<F12>�L�[��";
			mes "�؂�ւ��邱�Ƃ��ł��A";
			mes "�ő��4�܂œo�^�ł��܂��B";
			next;
			cutin "do_su_012.bmp", 255;
			mes "[���x�c���A���I]";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "�J�������H";
			mes "���ꂶ�᎟�̓X�L����";
			mes "�V���[�g�J�b�g�E�B���h�E�ɓo�^���B";
			next;
			cutin "do_su_012.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�X�L�����V���[�g�J�b�g�E�B���h�E��";
			mes "�o�^���܂��B";
			mes "�X�L���E�B���h�E���J���A";
			mes "�K�������u���݂��v��";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "�h���b�O���h���b�v���Ă݂܂��傤�I^000000";
			next;
			cutin "do_su_013.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�V���[�g�J�b�g�ɑΉ�����";
			mes "�t�@���N�V�����L�[��������";
			mes "�X�L���̃J�[�\�����o��̂ŁA";
			mes "�G�ɍ��킹�č��N���b�N���Ă݂܂��傤�B^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[���x�c���A���I]";
			mes "�g�����͂킩�������H";
			mes "�ł�^009eff�O���X�t�@�u��^000000��";
			mes "3�̓|�����玄�ɕ񍐂��Ă���I";
			mes "^0000ff�ΐF�̈𒎂̂悤�ȃ����X�^�[��";
			mes "�������瓌�ɍs�����Ƃ���ɂ���B^000000";
			mes "�X�L�����g�����Ȃ��΂ł���͂����I";
			close2;
			setquest 98407;
			set DORAM_1QUE,12;
			end;
		case 12:
			if(!(checkquest(98407)&0x4)) {
				mes "[���x�c���A���I]";
				mes "�ł�^009eff�O���X�t�@�u��^000000��";
				mes "3�̓|�����玄�ɕ񍐂��Ă���I";
				mes "^0000ff�ΐF�̈𒎂̂悤�ȃ����X�^�[��";
				mes "�������瓌�ɍs�����Ƃ���ɂ���B^000000";
				mes "�X�L�����g�����Ȃ��΂ł���͂����I";
				next;
				cutin "do_su_027.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�V���[�g�J�b�g�E�B���h�E��";
				mes "^ff0000<Ctrl>�L�[+<F12>�L�[^009eff��";
				mes "�J�����Ƃ��ł��܂��B";
				mes "�V���[�g�J�b�g�E�B���h�E��<F12>�L�[��";
				mes "�؂�ւ��邱�Ƃ��ł��A";
				mes "�ő��4�܂œo�^�ł��܂��B";
				next;
				cutin "do_su_012.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�X�L�����V���[�g�J�b�g�E�B���h�E��";
				mes "�o�^���܂��B";
				mes "�X�L���E�B���h�E���J���A";
				mes "�K�������u���݂��v��";
				mes "�V���[�g�J�b�g�E�B���h�E��";
				mes "�h���b�O���h���b�v���Ă݂܂��傤�I^000000";
				next;
				cutin "do_su_013.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�V���[�g�J�b�g�ɑΉ�����";
				mes "�t�@���N�V�����L�[��������";
				mes "�X�L���̃J�[�\�����o��̂ŁA";
				mes "�G�ɍ��킹�č��N���b�N���Ă݂܂��傤�B^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[���x�c���A���I]";
			mes "��邶��Ȃ����B";
			mes "�܂��V�嗤�ɍs�������Ȃ�";
			mes "���̂��炢�͂���Ă����Ȃ��ƂȁB";
			next;
			delquest 98407;
			set DORAM_1QUE,13;
			getexp 21,400;
		case 13:
			mes "�@�`���[�g���A��<�u�K��>�@7/12";
			mes "************************";
			mes "�@�E�A�C�e���̐��B";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				delitem 26135, 1;
				getitem2 26135, 1, 1, 4, 0, 0, 0, 0, 0;
				setquest 98408;
				delquest 98408;
				set DORAM_1QUE,15;
				getexp 27,600;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "�悵�A����ł͎��̍u�K���B";
			mes "����܂ŃG�b�O������";
			mes "�O���X�t�@�u���Ɛ���Ă���������A";
			mes "���ꂩ���A�����Ƌ��͂�";
			mes "�����X�^�[�Ɛ키���ƂɂȂ邾�낤�B";
			next;
			mes "[���x�c���A���I]";
			mes "���͂ȃ����X�^�[��|���ɂ�";
			mes "���͂ȑ������K�v�ɂȂ��Ă���B";
			mes "�����Ŏ����̑������������A";
			mes "���\���グ��̂�^ff0000���B^000000���B";
			next;
			mes "[���x�c���A���I]";
			mes "�����ɂ���b�艮�ɘb�������āA";
			mes "�����Ă��镐���";
			mes "���B���Ă�����Ă����B";
			next;
			mes "[���x�c���A���I]";
			mes "�{���Ȃ��p��f�ނ��K�v�Ȃ񂾂��A";
			mes "����͓��ʂɂ����͈�ؕs�v��";
			mes "����Ă����悤�Ɍ����Ă���B";
			mes "�u���S�җp�L����炵�v��";
			mes "���B�l��^ff0000+4^000000�ɂȂ�܂�";
			mes "���B���Ă���񂾁I";
			next;
			cutin "do_su_023.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�����𐸘B���邱�Ƃ�";
			mes "�����h��̐��\��";
			mes "�㏸�����邱�Ƃ��ł��܂��B";
			mes "���B�ɕK�v�Ȕ�p��f�ނ�";
			mes "�A�C�e���ɂ���ĈقȂ�܂��B^000000";
			next;
			cutin "do_su_024.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����̐��B�l�𒴂��Đ��B����ƁA";
			mes "���B�Ɏ��s���邱�Ƃ�����܂��B";
			mes "���S�Ȑ��B�l�͑����ɂ���ĈقȂ�A";
			mes "���B�Ɏ��s�����A�C�e����";
			mes "�������Ă��܂��̂�";
			mes "�C�����Ă��������I^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[���x�c���A���I]";
			mes "���B�l+4�܂łȂ�";
			mes "���B�Ɏ��s���邱�Ƃ͂Ȃ��B";
			mes "���S���čs���Ă����I";
			close2;
			setquest 98408;
			set DORAM_1QUE,14;
			end;
		case 14:
			switch(getequipid(4)) {
			case 26135:
				break;
			case 0:
				mes "[���x�c���A���I]";
				mes "���������A";
				mes "����𑕔����ĂȂ�����Ȃ����B";
				mes "�����Ƒ������Ă���";
				mes "���������Ă���B";
				close;
			default:
				mes "[���x�c���A���I]";
				mes "���������A";
				mes "�u���S�җp�L����炵�v����";
				mes "�Ȃ�����Ȃ����B";
				mes "�����Ƒ������Ă���";
				mes "���������Ă���B";
				close;
			}
			if(getequiprefinerycnt(4) < 4) {
				mes "[���x�c���A���I]";
				mes "���������A";
				if(getequiprefinerycnt(4) == 0) {
					mes "���B���Ă�����ĂȂ�����Ȃ����B";
					mes "�����Ɛ��B���Ă�����Ă���";
					mes "���������Ă���B";
				}
				else {
					mes "���B������Ȃ�����Ȃ����B";
					mes "������^ff0000+4^000000�ɂȂ�܂�";
					mes "���B���Ă��琺�������Ă���B";
				}
				next;
				mes "[���x�c���A���I]";
				mes "�����ɂ���b�艮�ɘb�������āA";
				mes "�����Ă��镐���";
				mes "���B���Ă�����Ă����B";
				mes "�u���S�җp�L����炵�v��";
				mes "���B�l��^ff0000+4^000000�ɂȂ�܂�";
				mes "���B���Ă���񂾁I";
				close;
			}
			emotion 21;
			mes "[���x�c���A���I]";
			mes "�����ȔL����炵���I";
			mes "�������V�嗤��ڎw���h�������ȁB";
			next;
			delquest 98408;
			set DORAM_1QUE,15;
			getexp 27,600;
		case 15:
			mes "�@�`���[�g���A��<�u�K��>�@8/12";
			mes "************************";
			mes "�@�E���R�񕜂ɂ���";
			mes "�@�E�d��50%��90%�ɂ���";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				setquest 98409;
				delquest 98409;
				set DORAM_1QUE,17;
				getexp 40,800;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "���x������Ă݂�";
			mes "�킩���Ă����Ǝv�����A";
			mes "�����X�^�[����U�����󂯂��";
			mes "HP������A�X�L���ōU�������";
			mes "SP������B";
			next;
			mes "[���x�c���A���I]";
			mes "�ł́A�������񕜂���ɂ�";
			mes "�ǂ����邩�H";
			mes "���ꂩ��͂����������B";
			next;
			cutin "do_su_014.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "HP��SP�͎��Ԃ��o�Ă�";
			mes "���R�ɉ񕜂��܂����A";
			mes "���邱�Ƃŉ񕜂��鑬�x��";
			mes "���߂邱�Ƃ��ł��܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�u���v�Ɓu����v��^ff0000<Insert>�L�[^009eff��";
			mes "�؂�ւ��邱�Ƃ��ł��܂��B^000000";
			next;
			cutin "do_su_015.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�Ȃ������A�C�e���̏d�ʂ�";
			mes "���d�ʂ�50%�ȏ�ɂȂ��";
			mes "���R�񕜂��������Ȃ��Ȃ�܂��B";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�����90%�ȏ�ɂȂ�ƁA";
			mes "�ʏ�U����X�L���U����";
			mes "�ł��Ȃ��Ȃ�܂��B";
			mes "���������Ȃ��Ă��܂�����";
			mes "�A�C�e�����̂Ă�";
			mes "�d�ʂ����炵�܂��傤�I^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[���x�c���A���I]";
			mes "�悵�A���ꂶ���������Ԃ�";
			mes "�b�������Ă݂�I";
			close2;
			setquest 98409;
			set DORAM_1QUE,16;
			end;
		case 16:
			if(checksit() == 0) {
				mes "[���x�c���A���I]";
				mes "���������A�����ĂȂ�����Ȃ����B";
				mes "�����ƃ����b�N�X���Ă����񂾂��B";
				next;
				cutin "do_su_014.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�����ĉ񕜂��Ă݂܂��傤�B";
				mes "HP��SP���񕜂��鑬�x��";
				mes "�����Ă��鎞���f�����񕜂���̂�";
				mes "�����ł���͂��ł��I";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�u���v�Ɓu����v��^ff0000<Insert>�L�[^009eff��";
				mes "�؂�ւ��邱�Ƃ��ł��܂��B^000000";
				next;
				cutin "do_su_015.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�Ȃ������A�C�e���̏d�ʂ�";
				mes "���d�ʂ�50%�ȏ�ɂȂ��";
				mes "���R�񕜂��������Ȃ��Ȃ�܂��B";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�����90%�ȏ�ɂȂ�ƁA";
				mes "�ʏ�U����X�L���U����";
				mes "�ł��Ȃ��Ȃ�܂��B";
				mes "���������Ȃ��Ă��܂�����";
				mes "�A�C�e�����̂Ă�";
				mes "�d�ʂ����炵�܂��傤�I^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[���x�c���A���I]";
			mes "�������A���ɂ͐i�ނ�������Ȃ��A";
			mes "�����~�܂��ċx�ނ��Ƃ��d�v�����B";
			next;
			delquest 98409;
			set DORAM_1QUE,17;
			getexp 40,800;
		case 17:
			mes "�@�`���[�g���A��<�u�K��>�@9/12";
			mes "************************";
			mes "�@�E�A�C�e���̍w�����@";
			mes "�@�E�A�C�e���̔��p���@";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				setquest 98410;
				delquest 98410;
				set DORAM_1QUE,19;
				getexp 48,1000;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "�啪�`���̊�{�͗}���Ă����ȁB";
			mes "����ł͎��̍u�K�����A";
			mes "���ꂩ�瑽���̃����X�^�[��";
			mes "����Ă������߂ɂ�";
			mes "���R�񕜂����ł͐؂蔲�����Ȃ�";
			mes "��ʂ������łĂ��邾�낤�B";
			next;
			mes "[���x�c���A���I]";
			mes "�ł́A�ǂ����邩�H";
			mes "���ꂩ��͂����������B";
			next;
			mes "[���x�c���A���I]";
			mes "�����ɂ��鏤�l����";
			mes "���S�җp�|�[�V���� 5��";
			mes "���S�җp�|�[�V���� 5��";
			mes "���w�����Ă����B";
			mes "����ł́A�҂��Ă��邼�B";
			next;
			cutin "do_su_016.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "���܂ł̐퓬�ŏE���Ă���";
			mes "�[���s�[��ȖтȂǂ̎��W�i��";
			mes "���l�ɔ��p����Zeny�ɂ��܂��傤�B";
			next;
			cutin "do_su_017.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "Zeny���l��������A";
			mes "^ff0000���S�җp�|�[�V���� 5��";
			mes "���S�җp�|�[�V���� 5��^009eff";
			mes "���w�����܂��傤�I^000000";
			close2;
			setquest 98410;
			set DORAM_1QUE,18;
			cutin "do_su_002.bmp", 255;
			end;
		case 18:
			if(countitem(569) < 5 || countitem(11518) < 5) {
				mes "[���x�c���A���I]";
				mes "�����ɂ��鏤�l����";
				mes "���S�җp�|�[�V���� 5��";
				mes "���S�җp�|�[�V���� 5��";
				mes "���w�����Ă����B";
				mes "����ł́A�҂��Ă��邼�B";
				next;
				cutin "do_su_016.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "���܂ł̐퓬�ŏE���Ă���";
				mes "�[���s�[��ȖтȂǂ̎��W�i��";
				mes "���l�ɔ��p����Zeny�ɂ��܂��傤�B";
				next;
				cutin "do_su_017.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "Zeny���l��������A";
				mes "^ff0000���S�җp�|�[�V���� 5��";
				mes "���S�җp�|�[�V���� 5��^009eff";
				mes "���w�����܂��傤�I^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21;
			mes "[���x�c���A���I]";
			mes "�����Ɣ����ė��ꂽ�悤���ȁB";
			mes "���������炢�Ȃ�";
			mes "����̕����ĂƂ��납�B";
			next;
			delquest 98410;
			set DORAM_1QUE,19;
			getexp 48,1000;
		case 19:
			mes "�@�`���[�g���A��<�u�K��>�@10/12";
			mes "************************";
			mes "�@�E���ՃA�C�e���̎g����";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				setquest 98411;
				delquest 98411;
				set DORAM_1QUE,21;
				getexp 61,1200;
				continue;
			}
			mes "[���x�c���A���I]";
			mes "�ł́A���͂��̃|�[�V������";
			mes "�g�������������̂�";
			mes "�悭�����Ă����悤�ɁB";
			next;
			cutin "do_su_018.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�A�C�e���E�B���h�E���J����";
			mes "�w�������|�[�V������";
			mes "�_�u���N���b�N���܂��傤�B";
			mes "�Ȃ��ANPC�Ɖ�b���̓A�C�e����";
			mes "�g�p�ł��Ȃ��ꍇ������̂�";
			mes "���ӂ��Ă��������I^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�܂��X�L���̎��̂悤�ɁA";
			mes "�V���[�g�J�b�g�E�B���h�E�ɓo�^���A";
			mes "�Ή������t�@���N�V�����L�[��";
			mes "�����Ă��g�p���邱�Ƃ��ł��܂��B^000000";
			next;
			cutin "do_su_002.bmp", 255;
			mes "[���x�c���A���I]";
			mes "�񕜂������ł���悤��";
			mes "HP��SP�����炵�Ă��������B";
			mes "����ł́A^0000ff�����Ă���";
			mes "�|�[�V������S�Ďg���؂�����^000000";
			mes "���������Ă���B";
			percentheal -50,-50;
			close2;
			setquest 98411;
			set DORAM_1QUE,20;
			end;
		case 20:
			if(countitem(569) > 0 || countitem(11518) > 0) {
				mes "[���x�c���A���I]";
				mes "^0000ff�����Ă���|�[�V������";
				mes "�S�Ďg���؂�����^000000";
				mes "���������Ă���B";
				mes "����ł́A�҂��Ă��邼�B";
				next;
				cutin "do_su_018.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "���������J���ă|�[�V������";
				mes "�_�u���N���b�N���܂��傤�B";
				mes "�Ȃ��ANPC�Ɖ�b���̓A�C�e����";
				mes "�g�p�ł��Ȃ��ꍇ������̂�";
				mes "���ӂ��Ă��������I^000000";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�܂��X�L���̎��̂悤�ɁA";
				mes "�V���[�g�J�b�g�E�B���h�E�ɓo�^���A";
				mes "�Ή������t�@���N�V�����L�[��";
				mes "�����Ă��g�p���邱�Ƃ��ł��܂��B^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			emotion 21, "���x�c���A���I#do_tu01a";
			mes "[���x�c���A���I]";
			mes "�A�C�e���̎g�������o�����ȁB";
			mes "�ً}���ɔ�����";
			mes "���ł��g����悤�ɂ��Ă����񂾁B";
			next;
			delquest 98411;
			set DORAM_1QUE,21;
			getexp 61,1200;
		case 21:
			mes "�@�`���[�g���A��<�u�K��>�@11/12";
			mes "************************";
			mes "�@�E�N�G�X�g�E�B���h�E��";
			mes "�@�@���ړ���A�C�e��";
			mes "************************";
			next;
			switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				break;
			case 2:
				getitem 1081, 1;
				setquest 98412;
				delquest 98412;
				getexp 73,1400;
				setquest 98413;
				set DORAM_1QUE,23;
				mes "^ff0000�y�C���t�H���[�V�����z";
				mes "���݉�b����NPC�ł�";
				mes "�`���[�g���A����";
				mes "�S�ďI�����܂����B";
				mes "���̃`���[�g���A���̏ꏊ��";
				mes "�������܂����H^000000";
				next;
				switch(select("���̏ꏊ�փ��[�v����","���[�v�����ɕ����Č�����","���ׂẴ`���[�g���A�����X�L�b�v����")) {
				case 1:
					warp "do_tu02a.gat",224,124;
					close;
				case 2:
					close;
				}
			}
			mes "[���x�c���A���I]";
			mes "�ӂށA����ł͎��́c�c";
			next;
			cloakoffnpc "����̖����q#do_tu01a";
			donpcevent "����̖����q#do_tu01a::OnTalk1";
			next;
			mes "[���x�c���A���I]";
			mes "�������₪���āA���̗p���H";
			mes "���O�A����̖����q����Ȃ����B";
			mes "����Ȋ댯�ȏꏊ�܂łǂ����ė����񂾁H";
			next;
			mes "[����̖����q]";
			mes "�]�񂾂疳������������񂾁c�c�B";
			mes "�ו��Ȃ񂾂��ǁA";
			mes "�n���Z����ɓn���悤��";
			mes "���܂�Ă��񂾂���";
			mes "�V��ł����炢�̂܂ɂ��c�B";
			next;
			mes "[����̖����q]";
			mes "�����Ă�[�A�A���I�Z����I";
			mes "�{��ꂿ�Ⴄ�I";
			next;
			mes "[���x�c���A���I]";
			mes "���Ît�n���ɔ���͂��邨�g����";
			mes "���܂ꂽ���A������ƗV��ł�����";
			mes "�]�񂾌��ɔ����������Ă��܂����A";
			mes "���Ă��Ƃŗǂ����H";
			next;
			mes "[����̖����q]";
			mes "�����I�@���̒ʂ�ł��I";
			mes "�������Z����I";
			mes "�悭�킩��܂����ˁB";
			next;
			mes "[���x�c���A���I]";
			mes "�܂��A���O�͂����X�ɋA��B";
			mes "���̌��͎����Ȃ�Ƃ�����B";
			mes "����Ə��Ζʂ̐l������O��";
			mes "����Ȓp���������������";
			mes "������߂�B";
			next;
			mes "[����̖����q]";
			mes "�Z���񂻂�Ȍ��������ƌ���Ȃ��Ł`�B";
			mes "���̓��U�[�j���̉��������q�ł���I";
			mes "�Ƃɂ����A���̌��͗��݂܂�����B";
			next;
			cloakonnpc "����̖����q#do_tu01a";
			mes "[���x�c���A���I]";
			mes "�c�c";
			mes "�͂��c�c�B";
			next;
			mes "[���x�c���A���I]";
			mes "�����Ȃ����ȏ�d���Ȃ��B";
			mes strcharinfo(0)+ "�A";
			mes "���̑{�������肢�ł��Ȃ����H";
			next;
			mes "[���x�c���A���I]";
			mes "���₠�A�D�G�ȃh�������ׂɂ���";
			mes "�{���ɗǂ������I";
			mes "�̐S�̔������A���炭��";
			mes "^009eff�G�b�O����^000000��";
			mes "�H�ׂ��̂��낤�B";
			next;
			mes "[���x�c���A���I]";
			mes "^009eff�G�b�O����^000000��";
			mes "���C���|���Δ��������邾�낤�B";
			mes "�����A���񂾂��I";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�G�b�O�������z�B�p�̖ؔ���";
			mes "���ݍ��񂾂悤�ł��B";
			mes "�T���ė��ăA���I�Ɍ����܂��傤�B";
			next;
			cutin "do_su_019.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�ʏ�A�A�C�e���̓����X�^�[��";
			mes "�|�����ۂɒn�ʂɃh���b�v���܂����A";
			mes "�N�G�X�g�ɂ���Ă͑Ώۂ̃A�C�e����";
			mes "���ڃA�C�e���E�B���h�E��";
			mes "����ꍇ������܂��B^000000";
			close2;
			setquest 98412;
			set DORAM_1QUE,22;
			cutin "do_su_002.bmp", 255;
			end;
		case 22:
			if(countitem(1081) < 1) {
				mes "[���x�c���A���I]";
				mes "^009eff�G�b�O����^000000�͂������|������";
				mes "�����ڂ͊o���Ă���ȁH";
				mes "�ǂ̌̂��ۂݍ��񂾂���";
				mes "�킩��Ȃ����A";
				mes "�Ђ��[����|���Ό�����͂����B";
				next;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�G�b�O�������z�B�p�̖ؔ���";
				mes "���ݍ��񂾂悤�ł��B";
				mes "�T���ė��ăA���I�Ɍ����܂��傤�B";
				next;
				cutin "do_su_019.bmp", 3;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "�ʏ�A�A�C�e���̓����X�^�[��";
				mes "�|�����ۂɒn�ʂɃh���b�v���܂����A";
				mes "�N�G�X�g�ɂ���Ă͑Ώۂ̃A�C�e����";
				mes "���ڃA�C�e���E�B���h�E��";
				mes "����ꍇ������܂��B^000000";
				close2;
				cutin "do_su_002.bmp", 255;
				end;
			}
			mes "[���x�c���A���I]";
			mes "�����A���ꂾ��A���̔����I";
			mes "���ꂶ�Ⴀ���͂��̔���";
			mes "�n���̂Ƃ���܂œ͂��Ă��炦�邩�H";
			next;
			mes "[���x�c���A���I]";
			mes "�X�ɂ����玡�Ît�n����";
			mes "�T���ēn���Ă���B";
			next;
			emotion 27;
			mes "[���x�c���A���I]";
			mes "���ɂ͓��Ȃ�ɖk���ɕ�����";
			mes "�����΂����B";
			mes "�����ƕ����Ă����΂����B";
			mes "�ȒP�ȓ������A�C��t�����B";
			next;
			cutin "do_su_020.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "���[�v�����N�ɐG����";
			mes "�ʂ̃}�b�v�Ɉړ��ł��܂��B";
			mes "���̃}�b�v�̖k�ɂ���";
			mes "���[�v�����N�ɐG���΁A";
			mes "���U�[�j���̒���";
			mes "�ړ����邱�Ƃ��ł��܂��B^000000";
			close2;
			viewpoint 1, 134, 381, 1, 0xFF0000;
			cutin "do_su_002.bmp", 255;
			delquest 98412;
			getexp 73,1400;
			setquest 98413;
			set DORAM_1QUE,23;
			end;
		case 23:
			mes "[���x�c���A���I]";
			mes "���Ît�̃n�����ו���";
			mes "�҂��Ă��邾�낤����";
			mes "�}���Ŏ����Ă����Ă���Ă���B";
			next;
			mes "[���x�c���A���I]";
			mes "���ɂ͓��Ȃ�ɖk���ɕ�����";
			mes "�����΂����B";
			mes "�����ƕ����Ă����΂����B";
			mes "�ȒP�ȓ������A�C��t�����B";
			next;
			mes "[���x�c���A���I]";
			mes "������ł�������";
			mes "�S�z���Ȃ��Ő^�������s����B";
			next;
			cutin "do_su_020.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "���[�v�����N�ɐG����";
			mes "�ʂ̃}�b�v�Ɉړ��ł��܂��B";
			mes "���̃}�b�v�̖k�ɂ���";
			mes "���[�v�����N�ɐG���΁A";
			mes "���U�[�j���̒���";
			mes "�ړ����邱�Ƃ��ł��܂��B^000000";
			close2;
			viewpoint 1, 134, 381, 1, 0xFF0000;
			cutin "do_su_002.bmp", 255;
			end;
		case 24:
			mes "[���x�c���A���I]";
			mes "�~�b�h�K���h�ɂ͍s�������H";
			mes "�`�ŉ�����肪�N���Ă���悤����";
			mes "���v�A�N�Ȃ�����ł��邳�B";
			close;
		default:
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�i�s���̃`���[�g���A������";
			mes "����Ă��܂��܂����B";
			mes "�i�s���̃`���[�g���A����";
			mes "�ꏊ�ɖ߂�܂����H^000000";
			next;
			if(select("�͂�","������") == 2) {
				mes "^ff0000�y�C���t�H���[�V�����z";
				mes "�i�s���̃`���[�g���A���̏ꏊ��";
				mes "�킩��Ȃ��Ȃ����ꍇ�A";
				mes "�ēx�b�������邱�Ƃ�";
				mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
				mes "�߂邱�Ƃ��ł��܂��B^000000";
				close;
			}
			if(DORAM_1QUE <= 1)
				warp "do_tu01a.gat",29,281;
			else if(DORAM_1QUE <= 24)
				warp "do_tu01a.gat",60,320;
			else if(DORAM_1QUE <= 26)
				warp "do_tu02a.gat",224,124;
			else if(DORAM_1QUE <= 34)
				warp "do_tu02a.gat",235,196;
			else if(DORAM_1QUE <= 37)
				warp "do_tu02a.gat",203,322;
			else
				warp "do_tu05a.gat",26,62;
			end;
		}
	}
}
-	shop	lasagna_callshop	-1,569:1,11518:1
do_tu01a.gat,52,323,4	script	���̍s���l#do_tu01a	10163,{
	if(DORAM_1QUE < 18) {
		mes "[���̍s���l]";
		mes "�I�C���͗��̍s���l���B";
		mes "�ł��A�L�~�ɂ͉�������Ȃ���B";
		mes "���x�c�̃A���I�����";
		mes "���������l�Ƃ��������";
		mes "������Ă���񂾁B";
		mes "���܂Ȃ��ˁB";
		close;
	}
	if(DORAM_1QUE >= 19) {
		mes "[���̍s���l]";
		mes "�V�嗤�����c�c�B";
		mes "�I�C�������x�c�ɓ�����";
		mes "�C��n�낤���Y�ނ�B";
		next;
		mes "[���̍s���l]";
		mes "�����ɂ��|�[�V�����͍�";
		mes "���炵������ĂˁB";
		mes "����镨�͉����Ȃ��񂾁B";
		close;
	}
	if(countitem(569) >= 5 && countitem(11518) >= 5) {
		mes "[���̍s���l]";
		mes "�|�[�V�����͂���";
		mes "���ꂼ��5�ȏ�";
		mes "�����Ă���悤����H";
		mes "�A���I����ɑ��������Ă����ŁB";
		close;
	}
	mes "[���̍s���l]";
	mes "�|�[�V�����𔃂���";
	mes "�����񂾂낤�H";
	mes "�A���I���񂩂�b��";
	mes "�����Ă����B";
	next;
	if(Zeny == 0) {
		mes "[���̍s���l]";
		mes "�L�~�́c�c";
		mes "�����������Ă��Ȃ�����Ȃ����B";
		mes "�����������͂܂�";
		mes "�s�v�Ȃ��̂𔄂���";
		mes "�����ɂ��Ă��甃���񂾂�B";
		next;
	}
	switch(select("����","����")) {
	case 1:
		callshop "lasagna_callshop",1;
		close;
	case 2:
		callshop "lasagna_callshop",2;
		close;
	}
}

do_tu01a.gat,62,320,3	script	����̖����q#do_tu01a	10167,{
	end;
OnTalk1:
	unittalk "����̖����q : �A�c�c�A���I�I�I�I�I�I";
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu01a.gat,66,323,4	script	���̒b�艮#do_tu01a	10163,{
	if(DORAM_1QUE < 14) {
		mes "[���̒b�艮]";
		mes "�I���͗��̒b�艮���B";
		mes "�c�O�����A���I�̌Z������";
		mes "���������Ɛ��B�͂��Ă��˂��B";
		mes "��股�ȁB";
		close;
	}
	if(DORAM_1QUE >= 15) {
		mes "[���̒b�艮]";
		mes "���܂�ς��������̋��";
		mes "�ǂ������H";
		close;
	}
	mes "[���̒b�艮]";
	mes "�A���I�̌Z����񂩂�";
	mes "�b�͕����Ă���B���B���ȁH";
	mes "�C���Ă����B";
	mes "�ǂ�𐸘B����񂾁H";
	next;
	switch(getequipid(4)) {
	case 26135:
		break;
	case 0:
		mes "[���̒b�艮]";
		mes "�������̑O�ɁA";
		mes "���B����������𑕔����Ă���B";
		mes "��������Ȃ���";
		mes "���B�̂��悤���Ȃ����B";
		close;
	default:
		mes "[���̒b�艮]";
		mes "�����ƁA";
		mes "���̃A�C�e���͐��B�ł��Ȃ��ȁB";
		mes "�u���S�җp�L����炵�v��";
		mes "�������Ă���B";
		close;
	}
	if(getequiprefinerycnt(4) >= 4) {
		mes "[���̒b�艮]";
		mes "�����ƁA";
		mes "���̕���͂������B�ς݂��ȁB";
		mes "����I�������B���Ă���̂�";
		mes "^ff0000+4^000000�܂ł��B";
		next;
		mes "[���̒b�艮]";
		mes "���������͑��̂��";
		mes "����ł���B";
		mes "�T�[�r�X�Ő��B���Ă���Ă�񂾁A";
		mes "���匾��Ȃ��ł����H";
		close;
	}
	if(select("^nItemID^"+ getequipid(4),"��߂�") == 2) {
		mes "[���̒b�艮]";
		mes "��H�@���B���Ȃ��̂��H";
		close;
	}
	successrefitem 4;
	mes "[���̒b�艮]";
	mes "�������ƁI";
	mes "�ǂ������H";
	mes "�ǂ��d�����Ă邾��H";
	close;
}

do_tu02a.gat,150,54,0	warp	warp01#do_tu02a	2,2,do_tu01a.gat,131,378
do_tu02a.gat,358,91,0	warp	warp02#do_tu02a	2,2,do_tu04a.gat,20,98
do_tu02a.gat,205,327,0	script	warp03#do_tu02a	45,2,2,{
	switch(DORAM_1QUE) {
	case 33:
		mes "�]�߂��ɍ����Ă���";
		mes "�@�D���̃h�����ɘb�������悤�]";
		close;
	default:
		if(DORAM_1QUE > 34) {
			warp "do_tu05a.gat",55,61;
			end;
		}
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A������";
		mes "����Ă��܂��܂����B";
		mes "�i�s���̃`���[�g���A����";
		mes "�ꏊ�ɖ߂�܂����H^000000";
		next;
		if(select("�͂�","������") == 2) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�i�s���̃`���[�g���A���̏ꏊ��";
			mes "�킩��Ȃ��Ȃ����ꍇ�A";
			mes "�ēx�b�������邱�Ƃ�";
			mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
			mes "�߂邱�Ƃ��ł��܂��B^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		end;
	}
}

do_tu02a.gat,153,58,0	script	object01#do_tu02a	139,3,3,{
	if(DORAM_1QUE == 23) {
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E�ɂ�";
		mes "�s�����ڕW�������Ă���܂��B";
		mes "^ff0000���Ît�n��^009eff�̏ꏊ��";
		mes "�N�G�X�g�E�B���h�E�ɏ����Ă���̂�";
		mes "������ڎw���܂��傤�I^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�A�C�R�������N���b�N���邩";
		mes "^ff0000<Alt>�L�[+<U>�L�[^009eff��";
		mes "�J�����Ƃ��ł��܂��B^000000";
		next;
		cutin "do_su_002.bmp", 255;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�܂��A��ʉE��̃}�b�v��";
		mes "�����ɂ���u+�v�u-�v��";
		mes "�}�b�v�̊g��k�����ł��܂��B";
		mes "�󋵂ɉ����ă}�b�v�̃T�C�Y��";
		mes "�ς��Ă݂܂��傤�I^000000";
		close2;
		viewpoint 1, 224, 126, 1, 0xFF0000;
		end;
	}
	end;
}

do_tu02a.gat,224,126,5	script	���Ît�n��#do_tu02a	10164,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	switch(DORAM_1QUE) {
	case 23:
		delquest 98413;
		getexp 87,1600;
		savepoint "do_tu02a.gat",224,123;
		set DORAM_1QUE,24;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�Z�[�u�|�C���g���X�V���܂����B";
		mes "�퓬�s�\�ɂȂ����ꍇ�A";
		mes "���̏ꏊ�ŕ������܂��B^000000";
		next;
	case 24:
		mes "�@�`���[�g���A��<�u�K��>�@12/12";
		mes "************************";
		mes "�@�E�N�G�X�g�X�L��";
		mes "************************";
		next;
		switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
		case 1:
			break;
		case 2:
			getexp 103,1800;
			delitem 1081, 1;
			skill 142,1,0;
			setquest 98415;
			set DORAM_1QUE,25;
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "���݉�b����NPC�ł�";
			mes "�`���[�g���A����";
			mes "�S�ďI�����܂����B";
			mes "���̃`���[�g���A���̏ꏊ��";
			mes "�������܂����H^000000";
			next;
			switch(select("���̏ꏊ�փ��[�v����","���[�v�����ɕ����Č�����","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				warp "do_tu02a.gat",235,196;
				close;
			case 2:
				close;
			}
		}
		emotion 20, "���Ît�n��#do_tu02a";
		mes "[���Ît�n��]";
		mes "���낻��ו����͂����Ȃ�ł����c�c";
		mes "�x���ȁc�c�B";
		next;
		mes "[���Ît�n��]";
		mes "����H";
		mes "���̔��́H";
		cloakoffnpc "����̖����q#do_tu02a";
		donpcevent "����̖����q#do_tu02a::OnTalk1";
		next;
		mes "[���Ît�n��]";
		mes "�����A�҂��Ă�����B";
		mes "�����͂����Ԃ�ƒx����������Ȃ����B";
		mes "�܂����A�ǂ����Ɋ�蓹����";
		mes "�V��ł��񂶂�Ȃ����낤�ȁB";
		next;
		mes "[����̖����q]";
		mes "���c�c����H�@���񂺂�H";
		mes "����Ȃ��ƂȂ��ł���H";
		mes "���̐l�͉ו����d�������������";
		mes "�e�؂ɂ����̉ו���";
		mes "�����Ă��ꂽ��ł��B";
		next;
		mes "[���Ît�n��]";
		mes "�����ł������B";
		mes "�킴�킴���肪�Ƃ��������܂��B";
		next;
		mes "[����̖����q]";
		mes "���A���ꂶ�ᎄ�͂���ŁI";
		next;
		donpcevent "����̖����q#do_tu02a::OnTalk2";
		cloakonnpc "����̖����q#do_tu02a";
		mes "[���Ît�n��]";
		mes "����A�����s���Ă��܂����B";
		mes "���������Ȏq���ˁB";
		next;
		mes "[���Ît�n��]";
		mes "�܂��A����ǂ����Ŗ�������";
		mes "�ו������Ȃ���������";
		mes "�����ė��Ă��ꂽ��ł��傤�H";
		mes "�悭���邱�ƂȂ��";
		mes "��������܂�����B";
		next;
		mes "[���Ît�n��]";
		mes "�ӂށc�c�B";
		mes "����ł����A�����Ƃ���";
		mes "�܂����ɂ͕s����Ȃ悤�ł��ˁB";
		next;
		mes "[���Ît�n��]";
		mes "�ו��������ė��Ă��ꂽ����ɁA";
		mes "���̖��ɗ��X�L��";
		mes "�u���}�蓖�v��";
		mes "�����Ă����܂��傤�B";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "���x�����グ�ďK������̂ł͂Ȃ��A";
		mes "�N�G�X�g��B�����邱�Ƃ�";
		mes "�K���ł���X�L����";
		mes "�N�G�X�g�X�L���ƌĂт܂��B^000000";
		next;
		mes "[���Ît�n��]";
		mes "���}�蓖��SP�������";
		mes "������HP���񕜂���X�L���ł��B";
		next;
		mes "[���Ît�n��]";
		mes "�񕜂���ʂ͂킸���ł����A";
		mes "�����Ƃ������ɂ͖��ɂ��ł��傤�B";
		mes "�o���Ă����đ��͂Ȃ��ł���B";
		next;
		mes "[���Ît�n��]";
		mes "�����A�����ł����H";
		mes "�悭���Ă��Ă��������B";
		next;
		mes "[���Ît�n��]";
		mes "�܂���������Ɂc�c";
		next;
		mes "[���Ît�n��]";
		mes "���͉��Ɂc�c";
		next;
		mes "[���Ît�n��]";
		mes "���E��2�񓮂����āc�c";
		next;
		mes "[���Ît�n��]";
		mes "�͂��I";
		mes "�ł��܂����I";
		misceffect 58,"";
		misceffect 234,"";
		skill 142,1,0;
		next;
		cutin "do_su_010.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�X�L���u���}�蓖�v���K�����܂����B";
		mes "�X�L���E�B���h�E���J����";
		mes "�m�F���܂��傤�B";
		mes "�N�G�X�g�X�L���̓X�L���|�C���g��";
		mes "������Ɋo���邱�Ƃ��ł��܂��B^000000";
		next;
		cutin "do_su_010.bmp", 255;
		mes "[���Ît�n��]";
		mes "�����܂ŉ��}�蓖�ł��̂ŁA";
		mes "��Ȃ����̓|�[�V�����Ȃǂ�";
		mes "�񕜂���悤�ɂ��Ă��������ˁB";
		next;
		cloakoffnpc "���x�c���A���I#do_tu02a";
		donpcevent "���x�c���A���I#do_tu02a::OnTalk1";
		mes "[���x�c���A���I]";
		mes "���A�����Ɖו���";
		mes "�͂���ꂽ�悤���ȁB";
		next;
		mes "[���x�c���A���I]";
		mes "�`���ɕK�v�Ȃ��Ƃ�";
		mes "��ʂ苳�������A";
		mes "�������Ă����Ɣz�B�̈˗���";
		mes "���Ȃ����Ƃ��ł����B";
		next;
		mes "[���x�c���A���I]";
		mes "����Ȃ�������c�e�X�g��";
		mes "����ł����v�������ȁB";
		mes "���ꂶ��A�c���̂Ƃ���Ɍ��������B";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�����l�ł����B";
		mes "�`���[�g���A��<�u�K��>��";
		mes "�ȏ�ŏI���ƂȂ�܂��B^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "������͎��ۂ̃N�G�X�g�ɋ߂����e��";
		mes "^ff0000�`���[�g���A��<���H��>^009eff��";
		mes "�n�܂�܂��B";
		mes "����܂ł̃`���[�g���A����";
		mes "�w�񂾂��Ƃ��������A";
		mes "�N�G�X�g���N���A���Ă��������I^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u���c�e�X�g�v��";
		mes "�󒍂��܂����B";
		mes "�N�G�X�g�E�B���h�E���J����";
		mes "�m�F���Ă݂܂��傤�I^000000";
		cloakonnpc "���x�c���A���I#do_tu02a";
		viewpoint 1, 235, 198, 1, 0xFF0000;
		getexp 103,1800;
		delitem 1081,1;
		setquest 98415;
		set DORAM_1QUE,25;
		cutin "do_su_002.bmp", 255;
		close;
	case 25:
		mes "[���Ît�n��]";
		mes "�c���ɉ�Ȃ�";
		mes "��낵�������Ă����Ă��������B";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u���c�e�X�g�v��";
		mes "�󒍂��܂����B";
		mes "�N�G�X�g�E�B���h�E���J����";
		mes "�m�F���Ă݂܂��傤�I^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�A�C�R�������N���b�N���邩";
		mes "^ff0000<Alt>�L�[+<U>�L�[^009eff��";
		mes "�J�����Ƃ��ł��܂��B^000000";
		close2;
		cutin "do_su_002.bmp", 255;
		viewpoint 1, 235, 198, 1, 0xFF0000;
		end;
	case 26:
		mes "[���Ît�n��]";
		mes "�c���ɂ͉���悤���ˁB";
		close;
	default:
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A������";
		mes "����Ă��܂��܂����B";
		mes "�i�s���̃`���[�g���A����";
		mes "�ꏊ�ɖ߂�܂����H^000000";
		next;
		if(select("�͂�","������") == 2) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�i�s���̃`���[�g���A���̏ꏊ��";
			mes "�킩��Ȃ��Ȃ����ꍇ�A";
			mes "�ēx�b�������邱�Ƃ�";
			mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
			mes "�߂邱�Ƃ��ł��܂��B^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu02a.gat,226,124,3	script	����̖����q#do_tu02a	10167,{
	end;
OnTalk1:
	unittalk "����̖����q : ���A���܂������܂����[�I";
	end;
OnTalk2:
	unittalk "����̖����q : �����p���肪�Ƃ��������܂����[�I";
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu02a.gat,230,127,3	script	���x�c���A���I#do_tu02a	10154,{
	end;
OnTalk1:
	unittalk "���x�c���A���I : ���傤�Ǘp�����ς񂾂悤���ȁB";
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu02a.gat,235,198,3	script	�y�����c��#do_tu02a	10152,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	switch(DORAM_1QUE) {
	case 25:
		delquest 98415;
		getexp 121,2000;
		savepoint "do_tu02a.gat",235,196;
		set DORAM_1QUE,26;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�Z�[�u�|�C���g���X�V���܂����B";
		mes "�퓬�s�\�ɂȂ����ꍇ�A";
		mes "���̏ꏊ�ŕ������܂��B^000000";
		next;
	case 26:
		mes "�@�`���[�g���A��<���H��>�@1/3";
		mes "************************";
		mes "�@�E���c�e�X�g";
		mes "************************";
		next;
		switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
		case 1:
			break;
		case 2:
			setquest 98416;
			delquest 98416;
			getexp 140,2200;
			setquest 98417;
			delquest 98417;
			getexp 157,2400;
			setquest 98418;
			delquest 98418;
			getexp 177,2600;
			setquest 98419;
			delquest 98419;
			getexp 214,2800;
			getexp 239,3000;
			viewpoint 1, 203, 324, 1, 0xFF0000;
			setquest 98421;
			set DORAM_1QUE,33;
			getitem 25046,1;	// ��D����
			getitem 15273,1;	// ����T�V���c
			getitem 22183,1;	// �؂̃X���b�p
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "���݉�b����NPC�ł�";
			mes "�`���[�g���A����";
			mes "�S�ďI�����܂����B";
			mes "���̃`���[�g���A���̏ꏊ��";
			mes "�������܂����H^000000";
			next;
			switch(select("���̏ꏊ�փ��[�v����","���[�v�����ɕ����Č�����","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				warp "do_tu02a.gat",205,323;
				close;
			case 2:
				close;
			}
		}
	case 27:
		mes "[�y�����c��]";
		mes "^ff0000���̓쓌�̏o������o����ɂ���";
		mes "���r�I���X^000000�ɍs���Ă��������B";
		next;
		mes "[�y�����c��]";
		mes "�����ĐX�̓��k���ɂ���";
		mes "^ff0000�傫�ȃg�Q�̐������}^000000��T���A";
		mes "���̎}��1����Ă��Ă��������B";
		mes "��������΍��i�ł��B";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g���󒍂��܂����B";
		mes "�N�G�X�g�E�B���h�E���J����";
		mes "�m�F���Ă݂܂��傤�I^000000";
		next;
		cutin "do_su_003.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�傫�ȃg�Q�̐������}�̏ꏊ��";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�����Ă���܂��B";
		mes "�܂��͒��̓쓌������O�ɏo�āA";
		mes "���r�I���X�ɍs���܂��傤�B^000000";
		next;
		cutin "do_su_028.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "���r�I���X�̓��U�[�j���̒���";
		mes "^ff0000�ׂ�MAP^009eff�ɂ���܂��B";
		mes "�`���b�g�E�B���h�E��";
		mes "^ff0000�u/where�v^009eff�Ɠ��͂����";
		mes "�����̂���}�b�v����";
		mes "���ׂ邱�Ƃ��ł��܂��B^000000";
		next;
		cutin "do_su_002.bmp", 255;
		mes "[�y�����c��]";
		mes "���r�I���X�ɂ�";
		mes "�U���I�ȃ����X�^�[�����܂��B";
		mes "�\���C�����Ă��������B";
		next;
		mes "[�y�����c��]";
		mes "������l�ōs���̂�����ꍇ�́A";
		mes "���̒��Ԃƈꏏ��^ff0000�p�[�e�B�[^000000��";
		mes "�g�ނ̂��ǂ��ł��傤�B";
		next;
		mes "[�y�����c��]";
		mes "���邢���Ƃł͂���܂���B";
		mes "���Ԃ��W�߂�̂����͂̂����ł��B";
		next;
		cutin "do_su_021.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�p�[�e�B�[�E�B���h�E��";
		mes "�A�C�R�������N���b�N���邩";
		mes "^ff0000<Alt>�L�[+<Z>�L�[^009eff��";
		mes "�ŊJ�����Ƃ��ł��܂��B";
		mes "�J������u�p�[�e�B�[�쐬�v��";
		mes "�p�[�e�B�[������Ă݂܂��傤�I^000000";
		next;
		cutin "do_su_022.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�p�[�e�B�[�������߂�";
		mes "�p�[�e�B�[���������A";
		mes "���̃v���C���[���E�N���b�N�����";
		mes "�u�p�[�e�B�[�����v���v��";
		mes "���邱�Ƃ��ł��܂��B^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "���肪�p�[�e�B�[�v�������F����ƁA";
		mes "�p�[�e�B�[�ɓ���邱�Ƃ��ł��܂��B";
		mes "���F�B��U���ăp�[�e�B�[��";
		mes "�g��ł݂܂��傤�I^000000";
		close2;
		viewpoint 1, 358, 91, 1, 0xFF0000;
		cutin "do_su_002.bmp", 255;
		end;
	case 28:
		emotion 21;
		mes "[�y�����c��]";
		mes "�����Ɏ}�������A��܂����ˁB";
		mes "�������ł��B";
		next;
		delquest 98416;
		getexp 140,2200;
		set DORAM_1QUE,29;
		mes "[�y�����c��]";
		mes "����ł͂��̎}��������";
		mes "���ɂ��Ă��Ă��������B";
		mes "���̃e�X�g���s���܂��B";
		close2;
		setquest 98417;
		warp "do_tu03a.gat",61,94;
		end;
	case 29:
	case 30:
	case 31:
		close;
	case 32:
		if(checkquest(98419)) {
			delquest 98419;
			getexp 214,2800;
		}
		mes "[�y�����c��]";
		mes "�����l�ł����B";
		mes "�e�X�g�͂���ŏI���ł��B";
		next;
		mes "[�y�����c��]";
		mes "���r�I���X�̉��܂ōs��";
		mes "�}������ė�����́B";
		next;
		mes "[�y�����c��]";
		mes "����������o�W�����X�N����";
		mes "���������o�����@��";
		mes "�H�蒅�������]�Ɠ��@�́B";
		next;
		mes "[�y�����c��]";
		mes "�ǂ�����D�ꂽ���̂�";
		mes "�����Ă��邱�Ƃ��킩��܂����B";
		mes "���Ȃ��̓t�@���t�@�[�����x�c��";
		mes "�ӂ��킵���l���ł��B";
		next;
		emotion 46,"";
		mes "[�y�����c��]";
		mes "���Ȃ��̓��c��F�߂܂��傤�B";
		mes "���߂łƂ��������܂��B";
		next;
		mes "[�y�����c��]";
		mes "���āA���Ȃ��͐V�嗤�ւ̓n�q��";
		mes "��]���Ă��܂����ˁB";
		next;
		mes "[�y�����c��]";
		mes "���̏�D������������";
		mes "�k�̍`�ɒ┑���Ă���D�ɍs���΁A";
		mes "���Ȃ����悹�Ă����ł��傤�B";
		mes "���������s���Ă݂Ă��������B";
		next;
		mes "[�y�����c��]";
		mes "�ӂӂӁc�c";
		mes "�����Ⴂ���͖`���ɏo��";
		mes "�����ł������Ƃ𐬂������Ă�낤��";
		mes "�������Ă������̂ł��B";
		next;
		mes "[�y�����c��]";
		mes "�ł����c�c";
		mes "���ɂ͎��Ȃ���΂Ȃ�Ȃ����̂�";
		mes "���߂��܂����B";
		next;
		mes "[�y�����c��]";
		mes "�܂��A���܂�ɂ�";
		mes "�D���������������̂�";
		mes "�`���ɏo��̂�";
		mes "��������Ƃ����̂�";
		mes "�����ł����ǂˁB";
		mes "�n�n�n�n�B";
		close2;
		set DORAM_1QUE,33;
		getitem 25046,1;	// ��D����
		getitem 15273,1;	// ����T�V���c
		getitem 22183,1;	// �؂̃X���b�p
		cutin "do_su_002.bmp", 255;
		getexp 239,3000;
		viewpoint 1, 203, 324, 1, 0xFF0000;
		setquest 98421;
		end;
	case 33:
		mes "[�y�����c��]";
		mes "���̏�D������������";
		mes "�k�̍`�ɒ┑���Ă���D�ɍs���΁A";
		mes "���Ȃ����悹�Ă����ł��傤�B";
		mes "���������s���Ă݂Ă��������B";
		close2;
		viewpoint 1, 203, 324, 1, 0xFF0000;
		end;
	default:
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A������";
		mes "����Ă��܂��܂����B";
		mes "�i�s���̃`���[�g���A����";
		mes "�ꏊ�ɖ߂�܂����H^000000";
		next;
		if(select("�͂�","������") == 2) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�i�s���̃`���[�g���A���̏ꏊ��";
			mes "�킩��Ȃ��Ȃ����ꍇ�A";
			mes "�ēx�b�������邱�Ƃ�";
			mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
			mes "�߂邱�Ƃ��ł��܂��B^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu02a.gat,203,324,5	script	�G�b�O����#do_tu02a	10157,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	switch(DORAM_1QUE) {
	case 33:
		delquest 98421;
		getexp 267,3200;
		savepoint "do_tu02a.gat",235,196;
		set DORAM_1QUE,34;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�Z�[�u�|�C���g���X�V���܂����B";
		mes "�퓬�s�\�ɂȂ����ꍇ�A";
		mes "���̏ꏊ�ŕ������܂��B^000000";
		next;
	case 34:
		mes "�@�`���[�g���A��<���H��>�@2/3";
		mes "************************";
		mes "�@�E�D���̂��肢";
		mes "************************";
		next;
		switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
		case 1:
			break;
		case 2:
			setquest 98422;
			delquest 98422;
			getexp 298,3400;
			getexp 332,3600;
			setquest 98424;
			set DORAM_1QUE,36;
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "���݉�b����NPC�ł�";
			mes "�`���[�g���A����";
			mes "�S�ďI�����܂����B";
			mes "���̃`���[�g���A���̏ꏊ��";
			mes "�������܂����H^000000";
			next;
			switch(select("���̏ꏊ�փ��[�v����","���[�v�����ɕ����Č�����","���ׂẴ`���[�g���A�����X�L�b�v����")) {
			case 1:
				warp "do_tu05a.gat",26,62;
				close;
			case 2:
				close;
			}
		}
		emotion 45;
		mes "[�G�b�O����]";
		mes "��D��]���ȁH";
		mes "�`�P�b�g�������āB";
		next;
		mes "[�G�b�O����]";
		mes "�`���ҁH�@�D�͏��߂Ă����H";
		mes "�V�嗤�ł̓h�������̖��ɒp���Ȃ�";
		mes "��������҂��Ă��B";
		mes "�撣���ĂˁB";
		next;
		mes "[�G�b�O����]";
		mes "���A�������B";
		mes "���ɓ�����łɁA";
		mes "���̐H���ɂ��闿������";
		mes "�n���ė~���������f�ނ�";
		mes "����񂾁B�������ȁH";
		next;
		menu "�͂�",-;
		mes "[�G�b�O����]";
		mes "���肪�ƁB";
		mes "�����n���ۂɁA";
		mes "������ƒ��ӂ�����񂾁B";
		next;
		menu "���ӁH",-;
		mes "[�G�b�O����]";
		mes "����B";
		mes "�������͕ς��҂�����A";
		mes "���ʂɓn�����񂶂�";
		mes "�󂯎���Ă���Ȃ��񂾁B";
		mes "�����獡���猾���ʂ��";
		mes "���񂾁B�����ˁH";
		next;
		mes "[�G�b�O����]";
		mes "�l���n�������f�ނ�";
		mes "�������̋����ɓ������āA";
		mes "^0000cd�u����^�V�l�����Ă�������I�v^000000";
		mes "�ƌ����񂾁B";
		next;
		mes "[�G�b�O����]";
		mes "���߂đD�ɏ��h�����������";
		mes "���ƍq�C����肭�s���炵���B";
		mes "��������^0000ff���܂��Ȃ�^000000�Ȃ񂾁B";
		mes "�����������ꂪ�E���ȍs�ׂ���";
		mes "�M���Ă�B";
		next;
		getitem 25047,1;		// �J���j���b�N
		set DORAM_1QUE,35;
		emotion 12, "�G�b�O����#do_tu02a";
		mes "[�G�b�O����]";
		mes "�킩�������ȁH";
		mes "���ꂶ���낵�����ނ�I";
		setquest 98422;
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u�D���̂��肢�v��";
		mes "�󒍂��܂����B";
		mes "�N�G�X�g�E�B���h�E���J����";
		mes "�m�F���Ă݂܂��傤�I^000000";
		close;
	case 35:
		mes "[�G�b�O����]";
		mes "�l���n���������f�ނ�";
		mes "�������̋����ɓ������āA";
		mes "^0000cd�u����^�V�l�����Ă�������I�v^000000";
		mes "�ƌ����񂾁B";
		next;
		mes "[�G�b�O����]";
		mes "���߂đD�ɏ��h�����������";
		mes "���ƍq�C����肭�s���炵���B";
		mes "�����������܂��Ȃ��Ȃ񂾁B";
		mes "�����������ꂪ�E���ȍs�ׂ���";
		mes "�M���Ă�B";
		next;
		emotion 12;
		mes "[�G�b�O����]";
		mes "�킩�������ȁH";
		mes "���ꂶ���낵�����ނ�I";
		close;
	case 36:
		mes "[�G�b�O����]";
		mes "�����I�@�{���ɂ����������́I";
		mes "��k�������̂ɁI";
		mes "�A�n�n�n�n�I";
		mes "�ŁH�@�ǂ��������́H";
		mes "�悭�����������ˁH";
		next;
		mes "[�G�b�O����]";
		mes "���H";
		mes "���������J���J���H";
		next;
		mes "[�G�b�O����]";
		mes "�c�c�ǂ�����B";
		close;
	default:
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A������";
		mes "����Ă��܂��܂����B";
		mes "�i�s���̃`���[�g���A����";
		mes "�ꏊ�ɖ߂�܂����H^000000";
		next;
		if(select("�͂�","������") == 2) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�i�s���̃`���[�g���A���̏ꏊ��";
			mes "�킩��Ȃ��Ȃ����ꍇ�A";
			mes "�ēx�b�������邱�Ƃ�";
			mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
			mes "�߂邱�Ƃ��ł��܂��B^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu03a.gat,59,90,5	script	�y�����c��#do_tu03e	10152,{
	switch(DORAM_1QUE) {
	case 29:
		if(checkquest(98417)) {
			delquest 98417;
			getexp 157,2400;
		}
		mes "[????]";
		mes "�c�c�B";
		next;
		mes "�]��̒����牽��������o���Ă���]";
		next;
		mes "[�y�����c��]";
		mes "���r�I���X�Ō�����������܂��񂪁A";
		mes "�����̓o�W�����X�N�Ƃ�����";
		mes "���U�[�j���̊X����";
		mes "�������ꂽ�Ƃ���ɏZ��ł��܂��B";
		next;
		mes "[�y�����c��]";
		mes "����܂ŉ����Ȃ������̂ł����A";
		mes "���̂Ƃ���}�Ƀ��U�[�j�����ӂ�";
		mes "�����N�����悤�ɂȂ��āA";
		mes "�Y�݂̎�ɂȂ��Ă��܂��B";
		next;
		mes "[�y�����c��]";
		mes "�����͍���A�X�̒��ɓ�����";
		mes "�\��悤�Ƃ��Ă����̂ŁA";
		mes "��X�ŕ߂܂�����ł����c�c";
		mes "�����̒ʂ�A��������Ȃ���ł��B";
		next;
		mes "[�y�����c��]";
		mes "�����ŁA���Ȃ��Ɏ���Ă��Ă������";
		mes "�g�Q�̐������}���g���܂��B";
		mes "�܂��͂��̎}��";
		mes "�W���h�E�ɓn���Ă��������B";
		close2;
		setquest 98418;
		set DORAM_1QUE,30;
		end;
	case 30:
		mes "[�y�����c��]";
		mes "�܂��͂��̎}��";
		mes "�W���h�E�ɓn���Ă��������B";
		close;
	case 31:
		mes "[�y�����c��]";
		mes "�����A���̓J���g����";
		mes "�o�W�����X�N�̌���";
		mes "�����Ă��������B";
		next;
		mes "�]�g�Q�̓J���g���āc�c�]";
		next;
		if(select("����","����") == 2) {
			mes "�]�{�R�I�]";
			misceffect 1, "�o�W�����X�N�ߗ�#do_tu0";
			next;
			mes "[�ߗ��̃o�W�����X�N]";
			mes "�O�n�b�I";
			next;
			emotion 23;
			mes "[�y�����c��]";
			mes "����A������ƁI";
			mes "�����Ă��ł����I";
			mes "��r�Ȑ^���͂�߂Ă��������I";
			close;
		}
		mes "�]�s�[�s�[�s�[�]";
		next;
		mes "[�ߗ��̃o�W�����X�N]";
		mes "�V���b!!";
		next;
		mes "�]�o�W�����X�N�͓J�̉���";
		mes "�@�������ĈЊd���n�߂��]";
		next;
		mes "�]�g�Q�̓J���g���āc�c�]";
		next;
		switch(select("���t����","����","�h��")) {
		case 1:
			break;
		case 2:
			mes "�]�s�[�s�[�s�[�]";
			next;
			mes "[�ߗ��̃o�W�����X�N]";
			mes "�V���b!!";
			next;
			mes "�]�o�W�����X�N�͈Њd�����܂܂��]";
			close;
		case 3:
			mes "�]�O�T�I�]";
			misceffect 4, "�o�W�����X�N�ߗ�#do_tu0";
			next;
			mes "[�ߗ��̃o�W�����X�N]";
			mes "�C�e�b�I";
			next;
			emotion 23;
			mes "[�y�����c��]";
			mes "����A������ƁI";
			mes "�����Ă��ł����I";
			mes "��r�Ȑ^���͂�߂Ă��������I";
			close;
		}
		mes "�]�v�[�v�[�s�s�[�|�[��]";
		next;
		mes "[�ߗ��̃o�W�����X�N]";
		mes "�V���[!!";
		mes "�V���b�V���b!!";
		next;
		mes "�]�o�W�����X�N�̓���";
		mes "�@�������₩��o�Ă����]";
		next;
		mes "�]�g�Q�̓J���g���āc�c�]";
		next;
		if(select("����ɉ��t����","�@��") == 2) {
			mes "�]�o���I�]";
			misceffect 3, "�o�W�����X�N�ߗ�#do_tu0";
			next;
			mes "[�ߗ��̃o�W�����X�N]";
			mes "�A�E�`�b�I";
			next;
			emotion 23;
			mes "[�y�����c��]";
			mes "����A������ƁI";
			mes "�����Ă��ł����I";
			mes "��r�Ȑ^���͂�߂Ă��������I";
			close;
		}
		mes "�]�s�[�|�[�s�[�|�[��]";
		next;
		mes "�]�o�W�����X�N��";
		mes "�@���t�ɂ��킹��";
		mes "�@���E�ɑ̂����˂点�n�߂��]";
		next;
		mes "[�ߗ��̃o�W�����X�N]";
		mes "���A�̂�����Ɂc�c�I";
		next;
		mes "[�ߗ��̃o�W�����X�N]";
		mes "��A�킽���͉����m��Ȃ��I";
		mes "���l�ɖ��߂��ꂽ�Ƃ�";
		mes "����Ȃ��Ƃ͐�΂Ȃ��I";
		next;
		mes "�]�g�Q�̓J���g���āc�c�]";
		next;
		if(select("���t��������","�a��") == 2) {
			mes "�]�U�N�I�]";
			misceffect 565, "�o�W�����X�N�ߗ�#do_tu0";
			next;
			mes "[�ߗ��̃o�W�����X�N]";
			mes "�O�t�b�I";
			next;
			emotion 23;
			mes "[�y�����c��]";
			mes "����A������ƁI";
			mes "�����Ă��ł����I";
			mes "��r�Ȑ^���͂�߂Ă��������I";
			close;
		}
		mes "�]�y�[�y�[�|�[�y�[�y�|�|�[��]";
		next;
		mes "�]�o�W�����X�N��";
		mes "�@���t�ɂ��킹��";
		mes "�@����������U������";
		mes "�@�̂����˂点�n�߂��]";
		next;
		mes "[�ߗ��̃o�W�����X�N]";
		mes "��΂Ɍ���Ȃ����I";
		mes "���̓��A�ɏZ��ł���";
		mes "�������ړI���Ȃ��";
		mes "��΂Ɍ������񂩁I";
		next;
		emotion 21;
		mes "[�y�����c��]";
		mes "�����܂ŁI";
		mes "�����\���ł��傤�B";
		mes "�������ł��I";
		next;
		mes "[�y�����c��]";
		mes "�o�W�����X�N��";
		mes "���̓J�̉��t�𒮂���";
		mes "�̂�����ɗx��o����";
		mes "�Ȃ�ł������Ă��܂���ł��B";
		next;
		mes "[�y�����c��]";
		mes "����ł̓W���h�E�A";
		mes "���Ƃ͂��肢���܂��B";
		next;
		mes "[�W���h�E]";
		mes "�킩��܂����B";
		mes "�J�͂��a���肵�܂��B";
		next;
		mes "[�y�����c��]";
		mes "���c�e�X�g�͍��i�ł��B";
		mes "�ł͖߂�܂��傤�B";
		close2;
		delitem 25043, 1;
		delquest 98418;
		getexp 177,2600;
		setquest 98419;
		set DORAM_1QUE,32;
		warp "do_tu02a.gat",235,196;
		end;
	default:
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A������";
		mes "����Ă��܂��܂����B";
		mes "�i�s���̃`���[�g���A����";
		mes "�ꏊ�ɖ߂�܂����H^000000";
		next;
		if(select("�͂�","������") == 2) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�i�s���̃`���[�g���A���̏ꏊ��";
			mes "�킩��Ȃ��Ȃ����ꍇ�A";
			mes "�ēx�b�������邱�Ƃ�";
			mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
			mes "�߂邱�Ƃ��ł��܂��B^000000";
			close;
		}
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu03a.gat,64,92,3	script	�W���h�E#do_tu03e	10159,{
	if(DORAM_1QUE == 30) {
		delitem 25044, 1;
		getitem 25043, 1;
		set DORAM_1QUE,31;
		mes "[�W���h�E]";
		mes "�f���炵���g�Q�ł��ˁB";
		mes "���̃g�Q����������āc�c";
		mes "�����A�o���܂����B";
		next;
		mes "[�W���h�E]";
		mes "���̓J���g���΁A";
		mes "�o�W�����X�N�����炸�ɂ�";
		mes "�����Ȃ��Ȃ�ł��傤�B";
		close;
	}
	else if(DORAM_1QUE == 31) {
		mes "[�W���h�E]";
		mes "���̓J���g���΁A";
		mes "�o�W�����X�N�����炸�ɂ�";
		mes "�����Ȃ��Ȃ�ł��傤�B";
		close;
	}
	mes "[�W���h�E]";
	mes "�ӂށc�c�B";
	close;
}

do_tu03a.gat,61,91,5	script	�o�W�����X�N�ߗ�#do_tu0	10158,{
	emotion 9;
	mes "[�o�W�����X�N�ߗ�]";
	mes "�c�c�B";
	close;
}

do_tu04a.gat,16,98,0	warp	warp01#do_tu04a	2,2,do_tu02a.gat,355,92
do_tu04a.gat,348,244,0	script	warp02#do_tu04a	45,2,2,{
	if(DORAM_1QUE < 38) {
		mes "�]�Ȃɂ���Ȃ����ȋC������B";
		mes "�@���͂܂���ɐi�ނ̂͂�߂悤�]";
		close;
	}
	warp "do_tu06a.gat",24,143;
	end;
}

do_tu04a.gat,20,98,0	script	object01#do_tu04a	139,3,3,{
	if(DORAM_1QUE == 27) {
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E�ɂ�";
		mes "�s�����ڕW�������Ă���܂��B";
		mes "^ff0000�傫�ȃg�Q�̐������}^009eff�̏ꏊ��";
		mes "�N�G�X�g�E�B���h�E�ɏ����Ă���̂�";
		mes "������ڎw���܂��傤�I^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�A�C�R�������N���b�N���邩";
		mes "^ff0000<Alt>�L�[+<U>�L�[^009eff��";
		mes "�J�����Ƃ��ł��܂��B^000000";
		close2;
		viewpoint 1, 340, 251, 1, 0xFF0000;
		cutin "do_su_001.bmp", 255;
		end;
	}
	end;
}

do_tu04a.gat,340,251,3	script	�傫�ȃg�Q�̐������}#do	111,{
	if(DORAM_1QUE == 27) {
		getitem 25044,1;
		set DORAM_1QUE,28;
		misceffect 5;
		mes "�]�傫�ȃg�Q�̐������}��";
		mes "�@��ɓ��ꂽ�B";
		mes "�@�y�����c���̂Ƃ���֖߂낤�]";
		next;
		if(select("�߂�","�߂�Ȃ�") == 2) {
			mes "�]�������������ɋ��悤�]";
			close;
		}
		warp "do_tu02a.gat",235,196;
		end;
	}
	else if(DORAM_1QUE == 28) {
		mes "�]�y�����c���̂Ƃ���֖߂낤�]";
		next;
		if(select("�߂�","�߂�Ȃ�") == 2) {
			mes "�]�������������ɋ��悤�]";
			close;
		}
		warp "do_tu02a.gat",235,196;
		end;
	}
	mes "�]�傫�ȃg�Q�������Ă���}���B";
	mes "�@��������Ȃ��悤�ɋC�����悤�]";
	close;
OnInit:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6;
	end;
}

do_tu05a.gat,59,62,0	warp	warp01#do_tu05a	2,2,do_tu02a.gat,205,324
do_tu05a.gat,50,60,0	script	warp02#do_tu05a	45,2,2,{
	if(DORAM_1QUE <= 35) {
		mes "�]�u�D�����v�Ə����Ă���B";
		mes "�@�܂��͐H���ɍs�����]";
		close;
	}
	warp "do_tu05a.gat",30,60;
	end;
}

do_tu05a.gat,36,60,0	warp	warp03#do_tu05a	2,2,do_tu05a.gat,54,60
do_tu05a.gat,143,60,0	warp	warp04#do_tu05a	2,2,do_tu05a.gat,165,60
do_tu05a.gat,159,60,0	warp	warp05#do_tu05a	2,2,do_tu05a.gat,138,60
do_tu05a.gat,186,57,3	script	������#do_tu05a	548,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	switch(DORAM_1QUE) {
	case 35:
		if(checkquest(98422)) {
			delquest 98422;
			getexp 298,3400;
		}
		mes "[������]";
		mes "�Ȃ񂾁H";
		mes "���͖Z���������ɂ��Ă���B";
		next;
		menu "����^�V�l�����Ă�������I",-;
		misceffect 1, "������#do_tu05a";
		emotion 9, "������#do_tu05a";
		emotion 23, "�b��#do_tu05a";
		emotion 23, "���ǎ�#do_tu05a";
		mes "[������]";
		mes "�c�c�B";
		next;
		mes "[������]";
		mes "�ق��c�c�M�l�c�c";
		mes "����ۂǘr�Ɏ��M������悤���ȁB";
		mes "�ǂ����낤�I";
		mes "���͔���ꂽ���܂͔�����`���I";
		mes "��������ȁI";
		next;
		emotion 4, "�b��#do_tu05a";
		mes "[�b��]";
		mes "�������������}�W����B";
		next;
		emotion 16, "���ǎ�#do_tu05a";
		mes "[���ǎ�]";
		mes "���ʂ�A�C�c�B";
		next;
		emotion 29, "������#do_tu05a";
		mes "[������]";
		mes "�ᑢ���������̍���D�����Ƃ�";
		mes "�����x�����I";
		mes "���̕�̎K�ɂ��Ă�����I";
		next;
		menu "����Ȃ���́c�c",-;
		mes "[������]";
		mes "���̊��ɋy��ŕ|�C�Â������I";
		mes "�������܂ł̈А��͂ǂ������I";
		next;
		emotion 0, "�b��#do_tu05a";
		mes "[�b��]";
		mes "�c�c����H";
		next;
		mes "[�b��]";
		mes "�������������̂�";
		mes "���������āc�c�H";
		next;
		mes "[�b��]";
		mes "����ς�B";
		mes "����A����������������";
		mes "�J���j���b�N����H";
		next;
		emotion 0, "������#do_tu05a";
		mes "[������]";
		mes "���c�c�H";
		next;
		mes "[������]";
		mes "�c�c�m���ɂ������B";
		mes "�ǂ����Ă����V�l�̂��O��";
		mes "�����Ă���H";
		next;
		mes "�]���Ȃ��͑D�̊O�ŉ����";
		mes "�@�h�����̂��Ƃ�b�����]";
		next;
		emotion 36, "������#do_tu05a";
		mes "[������]";
		mes "�܂��������I";
		mes "�V�l���g������ɂ��邾������Ȃ�";
		mes "����Ȉ��Y�܂ł��₪���āI";
		mes "����Ȃ����炢�܂Ōo���Ă�";
		mes "�G�b�O�����ƌĂ΂ꑱ����񂾁I";
		next;
		mes "[������]";
		mes "�������Ă��܂Ȃ������ȁB";
		mes "�ǂ���炤���̑D����";
		mes "���Y�������悤���B";
		next;
		mes "[������]";
		mes "���񂽂ɂ͈������Ƃ������ȁB";
		mes "��ɑ����ĎӍ߂����Ă��炤�B";
		next;
		mes "[������]";
		mes "��ł�ɂ��Ӎ߂����ɂ����B";
		mes "�g���u���΂���N������";
		mes "���܂Ōo���Ă����l�O��";
		mes "��莙�Ȃ񂾁B";
		next;
		emotion 15, "������#do_tu05a";
		mes "[������]";
		mes "�H�ނ�͂��Ă���Ă��肪�Ƃ��ȁB";
		mes "�D���Ȃ�D���ɓ����Ă�����";
		mes "�D�����ɂ��邩��A";
		mes "�������A���Ă��ȁB";
		close2;
		delitem 25047, 1;
		set DORAM_1QUE,36;
		getexp 332,3600;
		setquest 98424;
		end;
	case 36:
		mes "[������]";
		mes "�H�ނ�͂��Ă���Ă��肪�Ƃ��ȁB";
		mes "�D���Ȃ�D���ɓ����Ă�����";
		mes "�D�����ɂ��邩��A";
		mes "�������A���Ă��ȁB";
		close;
	default:
		if(DORAM_1QUE <= 1)
			warp "do_tu01a.gat",29,281;
		else if(DORAM_1QUE <= 24)
			warp "do_tu01a.gat",60,320;
		else if(DORAM_1QUE <= 26)
			warp "do_tu02a.gat",224,124;
		else if(DORAM_1QUE <= 34)
			warp "do_tu02a.gat",235,196;
		else if(DORAM_1QUE <= 37)
			warp "do_tu02a.gat",203,322;
		else
			warp "do_tu05a.gat",26,62;
		end;
	}
}

do_tu05a.gat,122,61,5	script	�D��#do_tu05a_01	559,{
	mes "[�D��]";
	mes "�V�嗤�͏��߂Ăł����H";
	mes "��x���s���Č������ƂȂ��ꏊ��";
	mes "�s���C���͂ǂ��ł����H";
	next;
	mes "[�D��]";
	mes "�ǂ��ǂ����܂��񂩁H";
	mes "�������߂Ă̎��͖���܂���ł����B";
	mes "���܂��ɐV�嗤�ɍs���Ƃ��ɂ�";
	mes "���������܂��B";
	close;
}

do_tu05a.gat,169,70,3	script	�D��#do_tu05a_02	545,{
	mes "[�D��]";
	mes "�~�b�h�K���h���������ꂽ���ǁA";
	mes "���ɂ����邩�ȁH";
	mes "�n�}�ɂ��Ȃ��ꏊ�B";
	mes "�܂����������s�������Ƃ��Ȃ��ꏊ�B";
	mes "";
	close;
}

do_tu05a.gat,166,68,6	script	�D��#do_tu05a_03	544,{
	mes "[�D��]";
	mes "�X�e�����[�ꓙ�q�C�m�Ȃ�";
	mes "�n�}�ɂ��Ȃ��V�嗤�ւ̍q�H��";
	mes "�܂������o�������ȋC������B";
	next;
	mes "[�D��]";
	mes "�����̏u�Ԃ������̖ڂ�";
	mes "���邽�߂ɂ��A";
	mes "����ł�����";
	mes "���̑D�ɏ���Ă��Ȃ���B";
	close;
}

do_tu05a.gat,181,61,5	script	�b��#do_tu05a	421,{
	mes "[�b��]";
	mes "�����̗������A��͂�������";
	mes "�����̘r�͊m���Ȃ񂾂��B";
	close;
}

do_tu05a.gat,181,58,3	script	���ǎ�#do_tu05a	561,{
	mes "[���ǎ�]";
	mes "�G�b�O�����̂�낤�B";
	mes "�܁[���T�{���Ă₪��ȁB";
	close;
}

do_tu05a.gat,26,64,5	script	�K���x���[�D��#do_tu05a	10153,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	switch(DORAM_1QUE) {
	case 36:
		delquest 98424;
		getexp 389,3800;
		savepoint "do_tu05a.gat",26,62;
		set DORAM_1QUE,37;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�Z�[�u�|�C���g���X�V���܂����B";
		mes "�퓬�s�\�ɂȂ����ꍇ�A";
		mes "���̏ꏊ�ŕ������܂��B^000000";
		next;
	case 37:
		mes "�@�`���[�g���A��<���H��>�@3/3";
		mes "************************";
		mes "�@�E�V�Ď��x�c���̏��d��";
		mes "************************";
		next;
		switch(select("�͂��߂�","���̃`���[�g���A�����X�L�b�v","���ׂẴ`���[�g���A�����X�L�b�v����")) {
		case 1:
			break;
		case 2:
			getitem 569, 50;
			delitem 25046, 1;
			setquest 98425;
			delquest 98425;
			getexp 430,4000;
			setquest 98426;
			delquest 98426;
			getexp 475,6000;
			setquest 98427;
			delquest 98427;
			getexp 524,8000;
			setquest 98428;
			delquest 98428;
			getexp 577,10000;
			getitem 19330, 1;
			getitem 28576, 1;
			getitem 15274, 1;
			getitem 22184, 1;
			getitem 12324, 1;
			setquest 98429;
			delquest 98429;
			getexp 0,25000;
			set DORAM_1QUE,100;
			savepoint "lasagna.gat",299,239;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�����l�ł����B";
			mes "���ׂẴ`���[�g���A����";
			mes "�I�����܂����B";
			mes "���̌�A�`�����U�[�j����";
			mes "�ړ����܂��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "���Ղ͍`�����U�[�j���ɂ���";
			mes "���x�c���I���I(���W�F323,229)����";
			mes "�󂯂���N�G�X�g��";
			mes "�v���C����̂��������߂ł��B^000000";
			next;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ł̓��O�i���N�I�����C����";
			mes "���E�����y���݂��������I^000000";
			close2;
			warp "lasagna.gat",298,238;
			end;
		}
		mes "[�K���x���[�D��]";
		mes "�N���ˁB";
		mes "�����͊֌W�҈ȊO��������֎~���B";
		mes "�����o�Ă����Ȃ����B";
		next;
		menu "��D������n��",-;
		emotion 33;
		mes "[�K���x���[�D��]";
		mes "�V�����`���҂��B";
		mes "���͂��̑D�̑D��^0000cd�K���x���[^000000�A";
		mes "�ׂ̔ނ͈ꓙ�q�C�m�̃X�e�����[���B";
		mes "�N�����}���悤�B";
		next;
		menu "�o�q�͂��ł����H",-;
		mes "[�K���x���[�D��]";
		mes "�o�q���c�c����Ȃ񂾂��A";
		mes "�������������ƂɂȂ��Ă��ĂˁB";
		mes "�O�����Ă���B";
		next;
		mes "�]�����牫�̕�������ƁA";
		mes "�@�Z�������������Ă����]";
		next;
		mes "[�X�e�����[]";
		mes "���̉��ł͂܂Ƃ��ȍq�C�͂ł��Ȃ��B";
		mes "���E�������܂őD�͏o���Ȃ���B";
		mes "����������͂����炭�c�c�B";
		next;
		mes "[�K���x���[�D��]";
		mes "�����A���Ԃ񂠂����B";
		next;
		menu "�����H",-;
		mes "[�K���x���[�D��]";
		mes "^0000ff���r�I���X�̉��ɂ��铴�A��";
		mes "�Z��ł��间^000000���B";
		mes "�������f�����������R�₵��";
		mes "���̉��ɂȂ��Ă���񂾁B";
		next;
		mes "[�K���x���[�D��]";
		mes "���i�͂��ƂȂ�������";
		mes "�Ȃ�Ƃ��Ȃ��񂾂��A";
		mes "�����ƍ��͉�����肪";
		mes "�N���Ă���񂾂낤�B";
		next;
		mes "[�K���x���[�D��]";
		mes "���̖�肪���܂�܂ŁA";
		mes "���̉��͐���Ȃ����낤�ȁB";
		next;
		mes "[�X�e�����[]";
		mes "�����č��͎肪�󂢂Ă���";
		mes "��g�������Ȃ��񂾁B";
		mes "���̗l�q�����ɍs�����Ƃ�";
		mes "�ł��Ȃ����A���̂܂�";
		mes "���������̂�";
		mes "�����Ƒ҂����Ȃ��񂾁B";
		next;
		menu "�������s���܂��傤���H",-;
		mes "[�K���x���[�D��]";
		mes "�{�����ˁI";
		mes "����͏�����B";
		next;
		mes "[�K���x���[�D��]";
		mes "��������̂�^ff0000���r�I���X��";
		mes "�k���ɂ���u���̑��v�ƌĂ΂��";
		mes "���A�̉�^000000���B";
		next;
		mes "[�K���x���[�D��]";
		mes "���̕ӂ�͍ŋ߃o�W�����X�N��";
		mes "�\��Ă��邩�璍�ӂ��Ă���B";
		mes "������x�̎��͂�������";
		mes "�ɂ��ڂɉ���B";
		next;
		mes "[�K���x���[�D��]";
		mes "�X�e�[�^�X��L�΂�����A";
		mes "�X�L�����K�����Ă��邩�H";
		mes "�X�L���u���݂��v��u�Ђ������v��";
		mes "�o�W�����X�N����ɂ��L�����B";
		next;
		cutin "do_su_009.bmp", 3;
		mes "[�K���x���[�D��]";
		mes "�u���݂��v��u�Ђ������v��";
		mes "�З͂��グ�����Ȃ�";
		mes "�X�e�[�^�X�́uStr�v���グ��񂾁B";
		mes "�U���͂��オ����";
		mes "�킢��L���ɐi�߂��邼�B";
		next;
		cutin "do_su_002.bmp", 255;
		mes "[�K���x���[�D��]";
		mes "�����X�e�[�^�X�̊���U���";
		mes "��蒼�������Ȃ�A";
		mes "^ff0000�X�e�����[^000000�Ɍ����Ă���B";
		mes "����Ɍ���A���ʂɃX�e�[�^�X��";
		mes "���Z�b�g���Ă���邾�낤�B";
		next;
		mes "[�K���x���[�D��]";
		mes "^0000ff���A�ɓ����Ă����̂Ƃ����";
		mes "���x�c��������͂����B^000000";
		mes "�܂��͔ނ��痴�̏�Ԃ�";
		mes "�ǂ��Ȃ��Ă���̂��m�F����񂾁B";
		next;
		mes "[�K���x���[�D��]";
		mes "�����ĕK�v�Ȃ�ނɋ��͂��āA";
		mes "�����f�������~�߂Ă���B";
		next;
		mes "[�K���x���[�D��]";
		mes "���̑��̓�����܂ł́c�c";
		mes "^ff0000�X�e�����[^000000�A�N���ē����Ă���邩�B";
		next;
		emotion 33, "�X�e�����[#do_tu05a";
		mes "[�X�e�����[]";
		mes "�����ł��A�D���B";
		next;
		mes "[�X�e�����[]";
		mes "�Ƃ������Ƃ��B";
		mes "�������ł����牴�ɐ��������Ă���B";
		next;
		mes "[�K���x���[�D��]";
		mes "�P�����I�����V�Ė`���҂�";
		mes "���̎��킾�B";
		mes "�C���������߂čs���Ă���B";
		next;
		mes "[�K���x���[�D��]";
		mes "�����n���Ă����B";
		mes "��Ȃ��Ȃ�����g���Ă���B";
		mes "����ł͗��񂾂��B";
		next;
		set DORAM_1QUE,38;
		getitem 569, 50;
		delitem 25046, 1;
		setquest 98425;
		mes "^009eff�]�K���x���[�D������";
		mes "�@���S�җp�|�[�V�������󂯎�����]^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u�V�Ė`���҂̏��d���v��";
		mes "�󒍂��܂����B";
		mes "�N�G�X�g�E�B���h�E���J����";
		mes "�m�F���Ă݂܂��傤�I^000000";
		close;
	case 38:
	case 39:
	case 40:
	case 41:
		mes "[�K���x���[�D��]";
		mes "��������̂�^ff0000���r�I���X��";
		mes "�k���ɂ��铴�A�̉�^000000���B";
		mes "���̕ӂ�͍ŋ߃o�W�����X�N��";
		mes "�\��Ă��邩�璍�ӂ��Ă���B";
		next;
		mes "[�K���x���[�D��]";
		mes "^0000ff���A�ɓ����Ă����̂Ƃ����";
		mes "���x�c��������͂����B^000000";
		mes "�܂��͔ނ��痴�̏�Ԃ�";
		mes "�ǂ��Ȃ��Ă���̂��m�F����񂾁B";
		next;
		mes "[�K���x���[�D��]";
		mes "���A�̓�����܂ł�";
		mes "�X�e�����[�Ɉē������悤�B";
		mes "��������������o�����Ă���B";
		next;
		mes "[�X�e�����[]";
		mes "�Ƃ������Ƃ��B";
		mes "�������ł����牴�ɐ��������Ă���B";
		close;
	case 42:
		cloakoffnpc "�b��#do_tu05a_2";
		cloakoffnpc "���ǎ�#do_tu05a_2";
		cloakoffnpc "�X�e�����[#do_tu05a";
		mes "[�K���x���[�D��]";
		mes "�����A�������������B";
		mes "�Ȃ��Ȃ��A���ė��Ȃ�����";
		mes "�N����l�q���ɍs�����悤��";
		mes "���Ă����Ƃ��낾�B";
		next;
		mes "[�K���x���[�D��]";
		mes "�ŁA�ǂ��������H";
		mes "���͉��������̂��H";
		next;
		menu "�^���g�D�[�t�B�͗������������߂���",-;
		mes "[�K���x���[�D��]";
		mes "�������A�o�W�����X�N�̂�����";
		mes "�^���g�D�[�t�B���\��Ă����̂��c�c�B";
		next;
		mes "[�K���x���[�D��]";
		mes "�����A�N���������ʂ�Ȃ�";
		mes "�������΂炭�����";
		mes "��������Ă���͂������c�c�B";
		next;
		emotion 0, "�X�e�����[#do_tu05a";
		mes "[�X�e�����[]";
		mes "�D���I";
		mes "�O�����Ă��������I";
		next;
		mes "[�K���x���[�D��]";
		mes "�������c�c";
		mes "�����c�c�B";
		next;
		mes "�]���ɏ[�����Ă����Z������";
		mes "�@����Ă����c�c";
		musiceffect "149";
		mes "�@�^���ȊC�Ɛ�������";
		mes "�@�p���������]";
		next;
		mes "[�K���x���[�D��]";
		mes "�c�c";
		mes "�c�c���������Ⴂ����B";
		next;
		emotion 27, "�K���x���[�D��#do_tu05a";
		mes "[�K���x���[�D��]";
		mes "�X�e�����[�I�@�e���ɓ`�B�I";
		mes "�o�q�̏������I";
		next;
		emotion 21, "�X�e�����[#do_tu05a";
		mes "[�X�e�����[]";
		mes "�����I";
		next;
		mes "[�X�e�����[]";
		mes "�e���ɓ`�B�I";
		mes "���̉��͐��ꂽ�I";
		mes "�������ɏo�q�̏����Ɉڂ�I";
		next;
		emotion 27, "�X�e�����[#do_tu05a";
		mes "[�X�e�����[]";
		mes "���ǎ�ƍb���I";
		mes "���܂ł����𔄂��ĂȂ��ŁA";
		mes "�������Ǝ�����֖߂�I";
		next;
		emotion 29, "�b��#do_tu05a_2";
		mes "[�b��]";
		mes "�ւ��ց[�����ƁI";
		next;
		emotion 32, "���ǎ�#do_tu05a_2";
		mes "[���ǎ�]";
		mes "�������A�҂���т����I";
		next;
		mes "[�K���x���[�D��]";
		mes "�����A�Z�����Ȃ邼�B";
		mes "����܂ł̒x������߂��񂾁I";
		next;
		misceffect 119, "�K���x���[�D��#do_tu05a";
		mes "[�K���x���[�D��]";
		mes "�Ă߂���I";
		mes "�C������Ď��|����I";
		donpcevent "�X�e�����[#do_tu05a::OnTalk1";
		donpcevent "�b��#do_tu05a::OnTalk1";
		donpcevent "���ǎ�#do_tu05a::OnTalk1";
		cloakonnpc "�X�e�����[#do_tu05a";
		cloakonnpc "�b��#do_tu05a_2";
		cloakonnpc "���ǎ�#do_tu05a_2";
		next;
		menu "���悢��o�q�ł����H",-;
		mes "[�K���x���[�D��]";
		mes "�����A�����o�q�܂ł�";
		mes "�����������Ԃ������邾�낤�B";
		mes "�N�͍��̂����Ɉ�x���ɖ߂���";
		mes "�����𐮂��ė���Ɨǂ��B";
		next;
		emotion 29, "�K���x���[�D��#do_tu05a";
		mes "[�K���x���[�D��]";
		mes "�t�t�t�c�c";
		mes "�v���Ԃ�̑D�o��";
		mes "�����M���Ȃ��Ă��܂�����B";
		next;
		mes "[�K���x���[�D��]";
		mes "��������Ė����ɏo�q�ł���̂�";
		mes "�N���^���g�D�[�t�B��";
		mes "���߂Ă��ꂽ���������B";
		mes "���肪�Ƃ��B";
		next;
		mes "[�K���x���[�D��]";
		mes "�N�̂��̗E�C�Ǝ��́A";
		mes "�ƂĂ��V�Ă̖`���҂Ƃ�";
		mes "�v���Ȃ��ȁB";
		mes "����^�V�l�Ƃ����̂�";
		mes "���Ȃ����R�ł͂Ȃ��������B";
		next;
		menu "����̓G�b�O�������c�c",-;
		emotion 18, "�K���x���[�D��#do_tu05a";
		mes "[�K���x���[�D��]";
		mes "�n�b�n�b�n�I";
		mes "�܂�������������ȁB";
		mes "���یN�͂��ꂾ���̂��Ƃ������񂾁B";
		next;
		mes "[�K���x���[�D��]";
		mes "�����Ƃ����������A";
		mes "�y�����̂����";
		mes "�a�����Ă�����̂��������񂾁B";
		next;
		mes "�]�S�\�S�\�]";
		next;
		mes "[�K���x���[�D��]";
		mes "����͈�l�O��";
		mes "�t�@���t�@�[�����x�c����";
		mes "������X�q���B";
		mes "��������悤�ɂȂ���";
		mes "���߂Đ^�̎��x�c����";
		mes "�Ȃ����ƌ�����񂾁B";
		next;
		mes "[�K���x���[�D��]";
		mes "���̑D�ɗ���V�Ď��x�c���ɁA";
		mes "�����������ēn���ė~������";
		mes "���܂�Ă�����̂Ȃ񂾂��c�c";
		mes "����Ȃɑ������̎�������Ƃ�";
		mes "�v�������Ȃ�������B";
		next;
		mes "[�K���x���[�D��]";
		mes "�����A������󂯎������";
		mes "���֖߂��ď��������Ă��Ă���B";
		mes "���̖X�q���������߂���";
		mes "�x�����Ȃ��悤�ɁB";
		mes "���܂�x���ƒu���čs����";
		mes "���܂���������񂼁B�n�b�n�b�n�I";
		close2;
		misceffect 42,"";
		misceffect 91,"";
		misceffect 68,"";
		getitem 19330, 1;
		getitem 28576, 1;
		getitem 15274, 1;
		getitem 22184, 1;
		getitem 12324, 1;
		delquest 98429;
		set DORAM_1QUE,100;
		getexp 0,25000;
		savepoint "lasagna.gat",299,239;
	case 100:
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�����l�ł����B";
		mes "���ׂẴ`���[�g���A����";
		mes "�I�����܂����B";
		mes "���̌�A�`�����U�[�j����";
		mes "�ړ����܂��B^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "���Ղ͍`�����U�[�j���ɂ���";
		mes "���x�c���I���I(���W�F323,229)����";
		mes "�󂯂���N�G�X�g��";
		mes "�v���C����̂��������߂ł��B^000000";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "����ł̓��O�i���N�I�����C����";
		mes "���E�����y���݂��������I^000000";
		close2;
		warp "lasagna.gat",298,238;
		end;
	}
}

do_tu05a.gat,24,62,5	script	�X�e�����[#do_tu05a	10156,{
	if(DORAM_1QUE < 38) {
		mes "[�X�e�����[]";
		mes "���̓X�e�����[�B";
		mes "���̑D�̍q�C�m������Ă���B";
		close;
	}
	if(DORAM_1QUE >= 42) {
		mes "[�X�e�����[]";
		mes "�����������悤���ȁB";
		close;
	}
	mes "[�X�e�����[]";
	mes "�������ł�����o�����邼�B";
	next;
	switch(select("�o������","�X�e�[�^�X��U�蒼������","������Ƒ҂���")) {
	case 1:
		mes "[�X�e�����[]";
		mes "���A�̓�����܂�";
		mes "�ē����Ă��B";
		mes "�����͂����ȁH";
		next;
		if(select("�o������","������Ƒ҂���") == 2) {
			mes "[�X�e�����[]";
			mes "�������܂�ɂ���Ȃ��񂾁B";
			mes "�������Ə������Ă����B";
			close;
		}
		mes "[�X�e�����[]";
		mes "�悵�A�s�����B";
		close2;
		warp "do_tu04a.gat",343, 244;
		end;
	case 2:
		mes "[�X�e�����[]";
		mes "�ق��B";
		mes "�X�e�[�^�X��";
		mes "���Z�b�g���Ă��������B";
		resetstatus;
		unequip -1;
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�����A�C�e�������ׂĊO����A";
		mes "�X�e�[�^�X�擾�󋵂�";
		mes "���Z�b�g����܂����B^000000";
		close;
	case 3:
		mes "[�X�e�����[]";
		mes "�������܂�ɂ���Ȃ��񂾁B";
		mes "�������Ə������Ă����B";
		close;
	}
OnTalk1:
	unittalk "�X�e�����[ : �A�C�A�C�T�[�I";
	end;
}

do_tu05a.gat,30,57,0	script	object01#do_tu05a	139,11,11,{
	if(DORAM_1QUE == 42) {
		cloakoffnpc "�b��#do_tu05a_2";
		cloakoffnpc "���ǎ�#do_tu05a_2";
	}
	end;
}

do_tu05a.gat,22,60,5	script	�b��#do_tu05a_2	421,{
	mes "[�b��]";
	mes "���Ԃ��o���߂����";
	mes "�ςׂ݉��ʖڂɂȂ����܂�����ȁB";
	mes "�������Ƃ����Ăق������񂾂��B";
	close;
OnTalk1:
	unittalk "�b�� : �A�C�A�C�T�[�I";
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu05a.gat,21,56,3	script	���ǎ�#do_tu05a_2	561,{
	mes "[���ǎ�]";
	mes "���ɂȂ�����";
	mes "�o�q�ł���̂��˂��B";
	close;
OnTalk1:
	unittalk "���ǎ� : �A�C�A�C�T�[�I";
	end;
OnInit:
	cloakonnpc;
	end;
}

do_tu06a.gat,18,143,0	warp	warp01#do_tu06a	2,2,do_tu04a.gat,344,243
do_tu06a.gat,29,146,5	script	���x�c��#do_tu06a	10162,5,5,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	if(DORAM_1QUE == 38) {
		if(checkquest(98425)) {
			delquest 98425;
			getexp 430,4000;
		}
		mes "[���x�c��]";
		mes "����A�V�Ă̖`���҂���";
		mes "����ȂƂ���ɉ��̗p�ł����H";
		next;
		mes "�]���Ȃ��̓��U�[�j���̊C��";
		mes "�@�N�����Ă��邱�Ƃ�`�����]";
		next;
		emotion 5;
		mes "[���x�c��]";
		mes "�ց`�Ȃ�قǁB";
		mes "����Ȃ��Ƃ��N���Ă���ł��ˁB";
		mes "�₯�ɂ��������牌������";
		mes "�v���Ă����炻���������Ƃł������B";
		next;
		mes "[���x�c��]";
		mes "����ł́A�ꏏ�ɗl�q��";
		mes "���ɍs���܂��傤���B";
		next;
		if(select("�͂�","���U�[�j���ɖ߂肽��") == 2) {
			mes "[���x�c��]";
			mes "����H";
			mes "�Y�ꕨ�ł����H";
			mes "���͂����ɂ���̂�";
			mes "��������ė��Ă��������ˁB";
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		mes "[���x�c��]";
		mes "�ڎw���ꏊ�͂����ł��B";
		mes "�����Ă����v�Ȃ悤�ɁA";
		mes "�n�}�Ɉ�����Ă����܂����B";
		mes "�����A�s���܂��傤�B";
		viewpoint 1, 157, 98, 1, 0xFF0000;
		close2;
		setquest 98426;
		set DORAM_1QUE,39;
		end;
	}
	if(DORAM_1QUE == 39) {
		mes "[���x�c��]";
		mes "�₯�ɂ��������牌������";
		mes "�v���Ă����炻���������Ƃł������B";
		mes "����ł́A�ꏏ�ɗl�q��";
		mes "���ɍs���܂��傤���B";
		next;
		if(select("�͂�","���U�[�j���ɖ߂肽��") == 2) {
			mes "[���x�c��]";
			mes "����H";
			mes "�Y�ꕨ�ł����H";
			mes "���͂����ɂ���̂�";
			mes "��������ė��Ă��������ˁB";
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		mes "[���x�c��]";
		mes "�ڎw���ꏊ�͂����ł��B";
		mes "�����Ă����v�Ȃ悤�ɁA";
		mes "�n�}�Ɉ�����Ă����܂����B";
		mes "�����A�s���܂��傤�B";
		viewpoint 1, 157, 98, 1, 0xFF0000;
		close;
	}
	mes "^ff0000�y�C���t�H���[�V�����z";
	mes "�i�s���̃`���[�g���A������";
	mes "����Ă��܂��܂����B";
	mes "�i�s���̃`���[�g���A����";
	mes "�ꏊ�ɖ߂�܂����H^000000";
	next;
	if(select("�͂�","������") == 2) {
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A���̏ꏊ��";
		mes "�킩��Ȃ��Ȃ����ꍇ�A";
		mes "�ēx�b�������邱�Ƃ�";
		mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
		mes "�߂邱�Ƃ��ł��܂��B^000000";
		close;
	}
	if(DORAM_1QUE <= 1)
		warp "do_tu01a.gat",29,281;
	else if(DORAM_1QUE <= 24)
		warp "do_tu01a.gat",60,320;
	else if(DORAM_1QUE <= 26)
		warp "do_tu02a.gat",224,124;
	else if(DORAM_1QUE <= 34)
		warp "do_tu02a.gat",235,196;
	else if(DORAM_1QUE <= 37)
		warp "do_tu02a.gat",203,322;
	else
		warp "do_tu05a.gat",26,62;
	end;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu06a.gat,153,103,3	script	���x�c��#do_tu06a_2	10162,5,5,{
	if(distance(getcharid(3)) > 5) {
		showmessage "�]�����Ƌ߂Â��Ă���b�������悤�]","";
		end;
	}
	if(DORAM_1QUE == 39) {
		if(checkquest(98426)) {
			delquest 98426;
			getexp 475,6000;
		}
		mes "[���x�c��]";
		mes "���킸����܂����ˁB";
		mes "���̐�ɂ��̓��A�̗��A";
		mes "^ff0000�^���g�D�[�t�B^000000�����܂��B";
		next;
		mes "[���x�c��]";
		mes "���ƂȂ�����Ȃ̂�";
		mes "�P���Ă���悤�Ȃ��Ƃ�";
		mes "�����Ǝv���܂����A";
		mes "�ꉞ�C��t���Ă����Ă��������B";
		mes "����ł͐i�݂܂��傤�B";
		next;
		if(select("�͂�","���U�[�j���ɖ߂肽��") == 2) {
			mes "[���x�c��]";
			mes "����H";
			mes "�Y�ꕨ�ł����H";
			mes "���͂����ɂ���̂�";
			mes "��������ė��Ă��������ˁB";
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		if(!checkquest(98427))
			setquest 98427;
		warp "do_tu07a.gat",190,20;
		end;
	}
	mes "^ff0000�y�C���t�H���[�V�����z";
	mes "�i�s���̃`���[�g���A������";
	mes "����Ă��܂��܂����B";
	mes "�i�s���̃`���[�g���A����";
	mes "�ꏊ�ɖ߂�܂����H^000000";
	next;
	if(select("�͂�","������") == 2) {
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�i�s���̃`���[�g���A���̏ꏊ��";
		mes "�킩��Ȃ��Ȃ����ꍇ�A";
		mes "�ēx�b�������邱�Ƃ�";
		mes "�`���[�g���A���i�s����NPC�̏ꏊ��";
		mes "�߂邱�Ƃ��ł��܂��B^000000";
		close;
	}
	if(DORAM_1QUE <= 1)
		warp "do_tu01a.gat",29,281;
	else if(DORAM_1QUE <= 24)
		warp "do_tu01a.gat",60,320;
	else if(DORAM_1QUE <= 26)
		warp "do_tu02a.gat",224,124;
	else if(DORAM_1QUE <= 34)
		warp "do_tu02a.gat",235,196;
	else if(DORAM_1QUE <= 37)
		warp "do_tu02a.gat",203,322;
	else
		warp "do_tu05a.gat",26,62;
	end;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu07a.gat,190,15,0	warp	warp01#do_tu07a	2,2,do_tu06a.gat,153,98
do_tu07a.gat,190,20,0	script	object01#do_tu07a	139,4,4,{
	if(DORAM_1QUE == 39) {
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E�ɂ�";
		mes "�s�����ڕW�������Ă���܂��B";
		mes "^ff0000�^���g�D�[�t�B^009eff�̏ꏊ��";
		mes "�N�G�X�g�E�B���h�E�ɏ����Ă���̂�";
		mes "������ڎw���܂��傤�I^000000";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�A�C�R�������N���b�N���邩";
		mes "^ff0000<Alt>�L�[+<U>�L�[^009eff��";
		mes "�J�����Ƃ��ł��܂��B^000000";
		close2;
		viewpoint 1, 162, 158, 1, 0xFF0000;
		cutin "do_su_001.bmp", 255;
		end;
	}
	end;
}

do_tu07a.gat,159,156,5	script	���x�c��#do_tu07a	10162,5,5,{
	if(DORAM_1QUE < 42) {
		mes "[���x�c��]";
		mes "�����ԃo�W�����X�N���������ȁc�c�B";
		next;
		if(select("�͂�","���U�[�j���ɖ߂肽��") == 2) {
			mes "[���x�c��]";
			mes "����H";
			mes "�Y�ꕨ�ł����H";
			mes "���͂����ɂ���̂�";
			mes "��������ė��Ă��������ˁB";
			close2;
			warp "do_tu05a.gat",26, 62;
			end;
		}
		mes "[���x�c��]";
		mes "�����ɂ���";
		mes "�����N�������Ȃ̂ŁA";
		mes "���x�c�ł�����Y�܂��Ă��܂��B";
		close;
	}
	mes "[���x�c��]";
	mes "�����l�B";
	mes "���͓����ɖ߂��B";
	next;
	mes "[���x�c��]";
	mes "����^ff0000���S�җp���̉H^000000��";
	mes "�g���ΌN�����ɖ߂�邾�낤�B";
	close;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu07a.gat,162,158,3	script	�^���g�D�[�t�B#do_tu07a	10161,5,5,{
	if(DORAM_1QUE == 39) {
		if(checkquest(98427)) {
			delquest 98427;
			getexp 524,8000;
		}
		emotion 6, "�^���g�D�[�t�B#do_tu07a";
		mes "[�^���g�D�[�t�B]";
		mes "�������A";
		mes "����������炾�ȁB";
		mes "�l�ɂȂ�̍��݂�����񂾁B";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "��������A";
		mes "���ꂳ��A";
		mes "�������c�c�B";
		next;
		mes "�]�傫�ȗ��������ꂢ�Ă���]";
		next;
		emotion 0, "�^���g�D�[�t�B#do_tu07a";
		mes "[�^���g�D�[�t�B]";
		mes "��H�@�N�H";
		mes "���߂Č���炾�ˁB";
		next;
		mes "[���x�c��]";
		mes "�₠�^���g�D�[�t�B�B";
		mes "�ނ͐V�Ă̖`���҂��B";
		mes "�D�Ń~�b�h�K���h�嗤��";
		mes "�s�����Ƃ�����A";
		mes "�N���f�����̉��̂�����";
		mes "�D���o�`�ł��Ȃ��炵���B";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "���A����͂��߂�ˁB";
		mes "�����ǂ����^ff0000�o�W�����X�N��";
		mes "����^000000�Ȃ񂾁B";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "����܂ł͂��܂ɂ����������";
		mes "�o���Ă��邾���������̂ɁA";
		mes "���̑O����ˑR";
		mes "���ꂪ�������Ȃ����񂾁B";
		next;
		mes "[���x�c��]";
		mes "���������΍ŋ߁A";
		mes "�o�W�����X�N���r��Ă�ˁB";
		mes "���������̂����H";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�l�͉������ĂȂ���B";
		mes "�u���Ԃ̍��݁I�v�Ƃ������Ă�����A";
		mes "������̒��Ԃ�";
		mes "�������ꂽ�񂶂�Ȃ����ȁB";
		mes "�߂܂��č����ڂɂ������Ƃ��B";
		next;
		mes "[���x�c��]";
		mes "�Ȃ�قǁc�c�B";
		mes "�N�͉����m���Ă��邩���H";
		next;
		menu "������",-,"�m��܂���",-,"�S������͂���܂���",-;
		mes "[���x�c��]";
		mes "��������ȁB";
		mes "�`���҂ɂȂ肽�Ă̌N��";
		mes "�m���Ă���킯�Ȃ���ȁB";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�܂��A����Ȃ킯�ŁA";
		mes "�l�����Ă�肽����";
		mes "����Ă�킯����Ȃ��񂾁B";
		next;
		emotion 0, "�^���g�D�[�t�B#do_tu07a";
		mes "[�^���g�D�[�t�B]";
		mes "�������I";
		mes "�N�����ł��̎���ɂ���";
		mes "�o�W�����X�N�𒦂炵�߂Ă�B";
		mes "�����炪��l�����Ȃ��";
		mes "�l������f�����ɍςނ��炳�B";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "���[��A�������ȁB";
		mes "^ff0000��@�o�W�����X�N��5��^000000��";
		mes "�ގ����Ă���Ώ\�����ȁB";
		mes "���肢�ˁB";
		next;
		cutin "do_su_002.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�N�G�X�g���󒍂��܂����B";
		mes "�N�G�X�g�E�B���h�E���J����";
		mes "�m�F���Ă݂܂��傤�I^000000";
		setquest 98428;
		set DORAM_1QUE,40;
		close2;
		cutin "do_su_002.bmp", 255;
		end;
	}
	if(DORAM_1QUE == 40 || DORAM_1QUE == 41) {
		if(!(checkquest(98428) & 0x4)) {
			mes "[�^���g�D�[�t�B]";
			mes "�N�����ł��̎���ɂ���";
			mes "�o�W�����X�N�𒦂炵�߂Ă�B";
			mes "�����炪��l�����Ȃ��";
			mes "�l������f�����ɍςނ��炳�B";
			next;
			mes "[�^���g�D�[�t�B]";
			mes "���[��A�������ȁB";
			mes "^ff0000��@�o�W�����X�N��5��^000000��";
			mes "�ގ����Ă���Ώ\�����ȁB";
			mes "���肢�ˁB";
			next;
			cutin "do_su_002.bmp", 3;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "�N�G�X�g���󒍂��܂����B";
			mes "�N�G�X�g�E�B���h�E���J����";
			mes "�m�F���Ă݂܂��傤�I^000000";
			close2;
			cutin "do_su_002.bmp", 255;
			end;
		}
		mes "[�^���g�D�[�t�B]";
		mes "�悤�₭�Â��ɂȂ����݂����B";
		mes "���肪�Ƃ��B";
		mes "����ł���������΂炭��";
		mes "���ƂȂ������Ă邩�ȁB";
		next;
		mes "[���x�c��]";
		mes "�V�Ė`���҂ƕ����Ă�������";
		mes "�Ȃ��Ȃ��̘r���ˁB";
		mes "������l�O�̖`���҂���B";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�N�̓~�b�h�K���h�嗤��";
		mes "�s���񂾂�ˁH";
		mes "���܂ɂ͋A���ė��āA";
		mes "�������̘b�𕷂����Ăق����ȁB";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�l�͂��������傫���Ȃ�܂�";
		mes "�����ɂ��Ȃ��Ƃ����Ȃ��񂾁B";
		mes "���R�ȌN�������܂�����B";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�Z���Ԃ��������ǂ��肪�Ƃ��B";
		mes "�A��Ȃ炱����g���Ȃ�B";
		next;
		mes "�]�^���g�D�[�t�B����";
		mes "�@������n���ꂽ�]";
		next;
		if(DORAM_1QUE == 40) {
			getitem 12324, 1;
			set DORAM_1QUE,41;
		}
		mes "[�^���g�D�[�t�B]";
		mes "�����^ff0000���S�җp���̉H^000000���B";
		mes "�g���ƈʒu�Z�[�u���ꂽ�Ƃ���܂�";
		mes "�ړ����邱�Ƃ��ł���񂾁B";
		next;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�ʒu�Z�[�u�|�C���g��";
		mes "�����NPC����ݒ肷�邱�Ƃ�";
		mes "�ł��܂��B";
		mes "���݂̈ʒu�Z�[�u�|�C���g��";
		mes "�K���x���[�D���̑O�ɂȂ��Ă��܂��B^000000";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�ق�Ƃ��͖l�������Ă����������ǁA";
		mes "���o�W�����X�N������Ă��邩";
		mes "�킩��Ȃ�����c�c�B";
		mes "����ɂ�����g���Ă�B";
		mes "���ꂶ�Ⴀ�܂��ˁB";
		close2;
		delquest 98428;
		set DORAM_1QUE,42;
		getexp 577,10000;
		setquest 98429;
		end;
	}
	mes "[�^���g�D�[�t�B]";
	mes "�N�̓~�b�h�K���h�嗤��";
	mes "�s���񂾂�ˁH";
	mes "���܂ɂ͋A���ė��āA";
	mes "�������̘b�𕷂����Ăق����ȁB";
	close;
OnTouch:
	// dummy
	end;
OnTouchNPC:
	warp "Random",0,0;
	end;
}

do_tu07a.gat,247,194,0	script	object02#do_tu07a	139,{}

do_tu02a.gat,226,181,3	script	�J�����[#do_tu02a	548,{
	mes "[�J�����[]";
	mes "�J���[�j���~���N��";
	mes "��ȍޗ���m���Ă��邩�H";
	mes "�J���[�j���Ƃ������ʂȊL��";
	mes "���y�����č�����G�b�Z���X��";
	mes "�V�N�ȋ����ō���Ă���B";
	next;
	mes "[�J�����[]";
	mes "�����K�؂ȗʂō�����B";
	mes "�����Ƀj�����_���̎����ꏏ��";
	mes "�Y����Ƃ݂�Ȃ�������";
	mes "�J���[�j���~���N�ɂȂ�񂾁B";
	close;
}

do_tu02a.gat,225,290,5	script	��Ɣǒ�#do_tu02a	421,{
	mes "[��Ɣǒ�]";
	mes "���̎d������������Ƃ���H";
	mes "�����Ɋo������ȒP�Ȏ����B";
	mes "�R���L���i���̃K���x���[�D����";
	mes "���ɏ�肩�����ȁB";
	close;
}

do_tu02a.gat,139,299,3	script	�C���V���D�D��#do_tu02a	561,{
	mes "[�C���V���D�D��]";
	mes "�C���V�Y�Ƃ�";
	mes "�ȑO��藎������ł��Ă�";
	mes "�l��͏�ɕs�����Ă���B";
	close;
}

do_tu02a.gat,263,156,5	script	���΂������#do_tu02a	554,{
	mes "[���΂������]";
	mes "�̂̃��U�[�j���͐��������B";
	mes "�����Z�����{���{���B";
	mes "�����͈Í����ƌĂ΂�Ă����B";
	next;
	mes "[���΂������]";
	mes "���鎞�A���̗V�тȂ̂�����Ȃ����A";
	mes "�������ǂ���";
	mes "���̃`���s���������X��������A��";
	mes "������莩����������������x�c��";
	mes "�L�̎�T�[�r�X�ɓ���n�߂��񂾁B";
	next;
	mes "[���΂������]";
	mes "�X���������Ȃ��z���";
	mes "�݂�ȃ��U�[�j��������A";
	mes "�V�����l�������ł݂���";
	mes "��������c�����B";
	mes "���̃��U�[�j����";
	mes "�S�����̎q������������񂾁B";
	close;
}

do_tu02a.gat,244,231,3	script	�C���V���D��#do_tu02a	544,{
	mes "[�C���V���D��]";
	mes "���̉��F���`�[�Y���ɉ�����";
	mes "�����čs���΁A";
	mes "�������̌̋��������B";
	mes "�����͖߂肽���B";
	close;
}

do_tu02a.gat,260,134,3	script	���X���X#do_tu02a	546,{
	mes "[���X���X]";
	mes "�Ԃ��ю��͌N���s�������ꏊ��";
	mes "�A��Ă����Ă���邵�A";
	mes "���F�����͌N���Ƃ�";
	mes "�A��Ă����Ă����B";
	mes "���ɖ�������Ԃ��ю���";
	mes "���čs���΂����B";
	close;
}

do_tu02a.gat,141,166,5	script	�N����#do_tu02a	555,{
	mes "[�N����]";
	mes "��������Ă���ƌ�邱�Ƃ�����B";
	mes "���̐��E�̂ǂ�����ł�";
	mes "�~�[�g�\�[�X�̓�����";
	mes "����Ƃ������Ƃ��B";
	close;
}

do_tu02a.gat,233,174,5	script	��������#do_tu02a_01	561,{
	mes "[���ݎ�]";
	mes "�J���[�j���~���N��";
	mes "������荬���Ă�����܂Ȃ���B";
	mes "�ŋ߂����ɗ�������҂�����";
	mes "�U���Ĉ���ł���݂��������ǁA";
	mes "����͂��q����܂̂�邱�Ƃ��B";
	close;
}

do_tu02a.gat,236,173,3	script	��������#do_tu02a_02	561,{
	mes "[���ݎ�]";
	mes "�J���[�j���~���N��";
	mes "�悭�U���Ă�����ނ̂���Ԃ��B";
	mes "���y���ꂽ�J���[�j����";
	mes "�����ƍ����邱�Ƃō��o�����";
	mes "�@�ׂȖ��������邱�Ƃ��ł���B";
	close;
}

do_tu02a.gat,200,278,5	script	�S�z�����ȃh����#do_tu0	559,{
	emotion 54;
	mes "[�S�z�����ȃh����]";
	mes "�ŋ߁A�s�@�ɃC���V���l�鋙�D��";
	mes "�x����ď悹����h������";
	mes "�����炵���B�|�����̒��ɂȂ����ˁB";
	mes "���x�c���{�C�ɂȂ���";
	mes "�T���܂���Ă���炵���ł���B";
	close;
}

do_tu02a.gat,202,276,5	script	�����ꂽ�h����#do_tu02a	560,{
	emotion 18;
	mes "[�����ꂽ�h����]";
	mes "������I";
	mes "���؃N���[�Y���s�������������I";
	mes "�Ȃ�ĉ^���ǂ��񂾁I";
	mes "�����W���ꏊ��";
	mes "�C���V���D�O�ɍs���Ȃ���I";
	close;
}

do_tu02a.gat,209,301,3	script	���X�^�`#do_tu02a	10167,{
	mes "[���X�^�`]";
	mes "�V�嗤�ɗ����O��";
	mes "�g�����Ȃ݂𐮂��Ă݂ẮH";
	close;
}

do_tu02a.gat,236,179,5	script	�j�����N��#do_tu02a	10163,{
	mes "[�j�����N��]";
	mes "��������������Ȃ�";
	mes "���x�c�ɗ���ł݂���H";
	close;
}

do_tu02a.gat,229,197,5	script	�g�X#do_tu02a	10164,{
	emotion 22;
	mes "[�g�X]";
	mes "��͂�L���ȏꏊ������l�������ȁB";
	close;
}

do_tu02a.gat,228,193,5	script	�|���g#do_tu02a	10163,{
	emotion 32;
	mes "[�|���g]";
	mes "�����ɗ����Ȃ�";
	mes "�J���[�j���~���N��";
	mes "����ł����Ȃ��ƂȁI";
	close;
}

do_tu02a.gat,226,196,5	script	�A����#do_tu02a	10166,{
	emotion 7;
	mes "[�A����]";
	mes "����낫��낵�Ȃ��́I";
	mes "�c�ɎҊۏo������Ȃ��I";
	close;
}

do_tu02a.gat,227,187,1	script	���H���S��#do_tu02a	544,{
	mes "[���H���S��]";
	mes "����ɂ��́B";
	mes "�p�u�u�I�[�u���v�ւ悤�����B";
	mes "�����͌��܂�܂������H";
	next;
	mes "[���H���S��]";
	mes "�y�����c���A�K���x���[�D���A";
	mes "�g�[�}�X�D���ɂ��";
	mes "�u�I�[�u���̐����v�̉e���ŁA";
	mes "�݂�ȃJ���[�j���~���N��";
	mes "�������܂����A��Ԗ���";
	mes "���M�̂���̂̓{�X�̗����ł��B";
	next;
	mes "[���H���S��]";
	mes "���g���ɐS�����߂Ď���ꂵ����A";
	mes "��ł����ƃC����";
	mes "�����ĂԂ��Č`�����";
	mes "�g�������̂ł��B";
	mes "�{���ɔ��������̂�";
	mes "�N���������܂���B";
	next;
	mes "[���H���S��]";
	mes "������ŋ߂͍ޗ���";
	mes "�������Ă����Ȃ��̂ŁA";
	mes "�}�Ȓ���������ƁA";
	mes "��������܂ő�����";
	mes "�����ɍs����ł��B";
	next;
	emotion 54;
	mes "[���H���S��]";
	mes "���[���A�{���ɔ��������̂Ɂc�c�B";
	close;
}

do_tu02a.gat,232,187,6	script	�t�F�b�g�D�`�[�j��#do_t	545,{
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�����œ����Ă���Ȃ�Ɍo���ǁA";
	mes "�����ɉ����[�Ȃ̂ŎM�􂢂�";
	mes "���ׂĎ��̒S���ł��B";
	next;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�D�ɏ��ɍs���O�Ɉ�t�A";
	mes "�����q�C���I���Ĉ�t�A";
	mes "�e�n����K�˂ė����`���҂���t�A";
	mes "���������ł���l����t�A";
	mes "����ɂ��Ĉ��݂����l����t�c�c";
	next;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�Ƃɂ������Ȃ��Ƃ����Ȃ�";
	mes "�H��̐����z���𒴂��܂��B";
	mes "���ꂾ���ł͂���܂����A";
	mes "���x�c�ƔL�̎�E�������̋������A";
	mes "�V�Ė`���҂�������̑��k���X�c�c";
	next;
	emotion 28;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "24���Ԃ��ᑫ��Ȃ��ł��B";
	mes "�]�ƈ��𑝂₹�΂����̂ɁI";
	close;
}

do_tu02a.gat,232,181,5	script	�����M���C�[�l#do_tu02a	559,{
	mes "[�����M���C�[�l]";
	mes "�����͎��x�c�{���ł����A";
	mes "�`���҂���������Ă���";
	mes "�p�u�ł�����܂��B";
	mes "�e�n���牟���񂹂ė����`���҂�";
	mes "�o���k�����킵����A";
	mes "�`���̒��Ԃ�T����������܂��B";
	next;
	mes "[�����M���C�[�l]";
	mes "�ŋ߂ł͐V�嗤�ɗ����O��";
	mes "�����d����ɗ���l�������܂����B";
	next;
	mes "[�����M���C�[�l]";
	mes "�\���N�O�ɂ͕s�ǃh����������";
	mes "�X�������Ď��x�c�ɓ��c�����邽�߂�";
	mes "�ꏊ�Ƃ��Ă��g���܂����B";
	mes "����ȑO�͍r����҂̑D��肽����";
	mes "����̔�������ꏊ��������ł��B";
	next;
	mes "[�����M���C�[�l]";
	mes "�y�����c���A�K���x���[�D���A";
	mes "�g�[�}�X�D���������ŏo��܂����B";
	mes "�O�C�͂����ŋ`�Z����J�����сA";
	mes "���̌�̌��J�ł������U�[�j����";
	mes "������`���ɂȂ�܂����B";
	next;
	mes "[�����M���C�[�l]";
	mes "�ނ�ɓ���Ă���Ă���";
	mes "�`���҂�������ł���B";
	close;
}

do_tu02a.gat,190,239,5	script	�c���j�����R#do_tu02a_0	559,{
	unittalk "�c���j�����R : ���͂��̗V�я�̑������ɂ�`�B";
	end;
}

do_tu02a.gat,180,230,7	script	�c���j�����R#do_tu02a_0	560,{
	unittalk "�c���j�����R : �n�@�c�c����ȗc�t�Ȃ��Ƃ͈ꏏ�ɗV�ׂȂ��ɂ�`�B";
	end;
}

do_tu02a.gat,192,245,7	script	�c���j�����R#do_tu02a_0	554,{
	unittalk "�c���j�����R : �ыʂ̉򂪂ЂƂA�ȂȂA�ӂ��A�ނ��c�c�����ɂ�!!";
	end;
}

do_tu02a.gat,184,234,5	script	�c���j�����R#do_tu02a_0	422,{
	unittalk "�c���j�����R : �V�[�\�[�ɏ��Ȃ���ꏏ�ɗV�т�����͏W�܂�`�B";
	end;
}

do_tu02a.gat,186,231,3	script	�c���j�����R#do_tu02a_0	10167,{
	emotion 28;
	unittalk "�c���j�����R : ����ǂ����ē]����Ȃ��ɂ�`�H�]����悤�ɂ��Ăɂ�`�B";
	end;
}

do_tu02a.gat,211,186,5	script	��D�ē���#do_tu02a	559,{
	mes "[��D�ē���]";
	mes "����ɂ��́I";
	mes "�V�嗤�ɗ����D�͂�������k��";
	mes "�D������ɒ┑���Ă��܂���B";
	close;
}

do_tu02a.gat,222,187,3	script	�{�X#do_tu02a	548,{
	mes "[�{�X]";
	mes "�Ȃ񂾁H";
	mes "���񂽂��J���[�j���~���N�����H";
	close;
}

do_tu02a.gat,202,291,3	script	���x�c�ē���#do_tu02a01	10162,{
	mes "[���x�c�ē���]";
	mes "�`�����U�[�j���ւ悤�����I";
	mes "�������K�v�Ȏ���";
	mes "���ł��t�@���t�@�[�����x�c��";
	mes "�K�˂ĉ������B";
	close;
}

do_tu02a.gat,174,160,3	script	���x�c�ē���#do_tu02a02	10162,{
	mes "[���x�c�ē���]";
	mes "����ɂ��́B";
	mes "�ǂ��V�C�ł��ɂ�B";
	close;
}

do_tu02a.gat,233,197,5	script	���x�c���I���I#do_tu02a	10155,{
	mes "[���x�c���I���I]";
	mes "���̕��̓t�@���t�@�[�����x�c��";
	mes "�c���ł���y�����l���I";
	close;
}

do_tu02a.gat,77,263,5	script	�^�����[#do_tu02a	10166,{
	mes "[�^�����[]";
	mes "�����d�����d�グ�Ȃ��Ɓc�c";
	mes "�҂����킹�ɊԂɍ���Ȃ���B";
	close;
}

do_tu02a.gat,191,174,3	script	�S����#do_tu02a	547,{
	emotion 45;
	mes "[�S����]";
	mes "�ǂ��V�C���ɂႠ�B";
	close;
}
