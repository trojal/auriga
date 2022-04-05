//= Auriga Script ==============================================================
// Ragnarok Online Rockridge Town Script	by refis
//==============================================================================

//============================================================
// shop
//------------------------------------------------------------
har_in01.gat,34,84,3	shop	���#rockridge00	68,611,645,656,601,602,1065
har_in01.gat,19,86,4	shop	���퉮#rockridge01	67,13154,13155,13102,13200,13221,13222,13228,13229,13230,13231,13232
-	market	rockridge_callshop	-1,2267:100000:10,2268:500000:10,2241:5000:10

har_in01.gat,16,86,4	script	�h�#rockridge02	50,{
	if(gettime(4) == 0) {	// ���j��
		mes "[�h�]";
		mes "�����͒�x���ł��B";
		mes "�����Ƃ��͓����A";
		mes "�x�ނƂ��͋x�ށA";
		mes "���������𑱂��邽�߂̊�{�ł��B";
		close;
	}
	mes "[�h�]";
	mes "�����͖h��ł��B";
	mes "������";
	switch('flag) {
	case 1:
		mes "^0000ff�^�o�R��";
		mes "�p�C�v�^�o�R��";
		mes "���Ђ�^000000��";
		break;
	case 2:
		mes "^0000ff�\���u������";
		mes "�C���f�B�A���̔�������";
		mes "�J�E�{�[�C�n�b�g^000000��";
		break;
	case 3:
		mes "^0000ff�I�[���h�X�^�[���}���X��";
		mes "�E�F�X�^���O���C�X��";
		mes "�H�іX�q^000000��";
		break;
	}
	mes "���ׂ��Ă��܂��B";
	next;
	mes "[�h�]";
	mes "�h��͖��T�^�΂�Ă���";
	mes "�ݕ��ւɗ����Ă��āA";
	mes "�݌ɂ��\���ł͂���܂���B";
	mes "���ɔ���؂ꂽ���i��";
	mes "���X�g��������Ă��܂��B";
	next;
	mes "[�h�]";
	mes "�Ȃ̂�^0000CD���������";
	mes "�񋟂���͓̂���ł��B^000000";
	mes "����ł�^0000CD��ɓ���h�����i��";
	mes "�����Ă���̂�^000000�A";
	mes "��x���Ă����Ă��������B";
	close2;
	callshop "rockridge_callshop";
	end;
OnInit:
OnWeekTime001200:
	set 'flag,rand(1,3);
	switch('flag) {
	case 1:	// �^�o�R100k�A�p�C�v�^�o�R500k�A���Ђ�5k�@�e10
		npcshopitem "rockridge_callshop",2267,100000,10, 2268,500000,10, 2241,5000,10;
		break;
	case 2:	// �\���u����700k�A�C���f�B�A���̔�����700k�A�J�E�{�[�C�n�b�g700k�@�e10
		npcshopitem "rockridge_callshop",5067,700000,10, 5071,700000,10, 5075,700000,10;
		break;
	case 3:	// �I�[���h�X�^�[���}���X500k�A�E�F�X�^���O���C�X500k�A�H�іX�q700k�@�e10
		npcshopitem "rockridge_callshop",2247,500000,10, 2248,500000,10, 5018,700000,10;
		break;
	}
	end;
}

-	shop	rockridge_callshop2	-1,580

harboro1.gat,314,211,4	script	�p�����̎�#dy	886,5,5,{
	unittalk "�p�����̎� : ���������`���B";
	callshop "rockridge_callshop2",1;
	end;
OnTouch:
	switch(rand(7)) {
	case 0: unittalk "�p�����̎� : �����Ă����p���ł��B"; end;
	case 1: unittalk "�p�����̎� : �����̌N�B�p���𔃂�Ȃ������H"; end;
	case 2: unittalk "�p�����̎� : �т����肷��قǔ��������p���𔄂��Ă��܂���B"; end;
	case 3: unittalk "�p�����̎� : ���������p���H�ׂĂ݂܂��񂩁H"; end;
	case 4: unittalk "�p�����̎� : ���������p���͂������ł����H�@�p���`�������p��������܂��`"; end;
	case 5: unittalk "�p�����̎� : �p���I�@�p���p���I�@�p���p���p���I"; end;
	default: unittalk "�p�����̎� : �p���͂���܂��񂩁`�H"; end;
	}
}

//============================================================
// warp
//------------------------------------------------------------
// ���b�N���b�W <-> �L��������01
harboro1.gat,362,206,0	script	harboro1_rockrdg1	45,1,1,{
	if(BaseLevel < 130) {
		donpcevent "���x�c��#harboro1::OnTalk";
		end;
	}
	warp "rockrdg1.gat",37,246;
	end;
}

harboro1.gat,360,209,3	script	���x�c��#harboro1	10220,{
	mes "[���x�c��]";
	mes "���̐�͊댯�ł��B";
	mes "BaseLv130�ȏ�̕��̂�";
	mes "���ʂ����Ă��܂��B";
	close;
OnTalk:
	unittalk "���x�c�� : ���̐�͊댯�ł��BBaseLv130�ȏ�̕��݂̂��ʂ����Ă��܂��B";
	end;
}

// �ۈ��������� <-> ���u��
har_in01.gat,34,28,0	script	harin01_harin01_01	45,1,1,{
	if(ROCKRIDGE_1QUE < 6) {
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "����ɓ���Ȃ��ł��������B";
		mes "�����͗��u��ł��B";
		close;
	}
	warp "har_in01.gat",99,27;
	end;
}
har_in01.gat,99,30,0	warp	harin01_harin01_02	1,1,har_in01.gat,34,31

// ���b�N���b�W <-> ���b�N���b�W�n���X
harboro1.gat,324,124,7	script	�W���[	571,{
	mes "[�W���[]";
	mes "�c�c�B";
	next;
	mes "[�W���[]";
	mes "�n���ɍs���܂����H";
	next;
	switch(select("���b�N���b�W�n���X","���b�N���b�W�n���X ���n","�s���Ȃ�")) {
	case 1:
		mes "[�W���[]";
		mes "�d�����ς񂾂�";
		mes "�����o�ė��ĉ������B";
		close2;
		warp "harboro2.gat",281,104;
		end;
	case 2:
		mes "[�W���[]";
		mes "�d�����ς񂾂�";
		mes "�����o�ė��ĉ������B";
		close2;
		warp "harboro3.gat",281,104;
		end;
	case 3:
		mes "[�W���[]";
		mes "�c�c�B";
		close;
	}
}

// �L��������02 <-> ���b�N���b�W�z�R 01
rockrdg2.gat,304,350,0	script	rockrdg2_rockmi1_01	45,1,1,{
	if(BaseLevel < 160) {
		donpcevent "���x�c��#rockrdg2::OnTalk";
		end;
	}
	mes "�]���b�N���b�W�z�R�̓������B";
	mes "�@�ǂ��ɍs���܂����H�]";
	next;
	switch(select("���b�N���b�W�z�R 01","���b�N���b�W�z�R 01 ���n","��߂�")) {
	case 1:
		warp "rockmi1.gat",247,19;
		end;
	case 2:
		warp "rockmi3.gat",247,19;
		end;
	case 3:
		mes "�]���ɓ���̂���߂��]";
		close;
	}
}

rockrdg2.gat,301,349,3	script	���x�c��#rockrdg2	10220,{
	mes "[���x�c��]";
	mes "���̐�͊댯�ł��B";
	mes "BaseLv160�ȏ�̕��̂�";
	mes "���ʂ����Ă��܂��B";
	close;
OnTalk:
	unittalk "���x�c�� : ���̐�͊댯�ł��BBaseLv160�ȏ�̕��݂̂��ʂ����Ă��܂��B";
	end;
}

//============================================================
// ����
//------------------------------------------------------------
harboro1.gat,156,215,5	script	���ق̎�#rockridge	46,{
	mes "[���ق̎�]";
	mes "��������Ⴂ�܂��B";
	mes "���فu�ӂ����t�N���E�v�ł��B";
	next;
	mes "[���ق̎�]";
	mes "�x��ł����܂����H";
	mes "�h�����5000zeny�ł��B";
	next;
	switch(select("�ʒu�Z�[�u","�x��","��߂�")) {
	case 1:
		savepoint "harboro1.gat",157,210;
		mes "[���ق̎�]";
		mes "�L�^���܂����B";
		mes "�܂����ĉ������B";
		close;
	case 2:
		if(Zeny < 5000) {
			// ������
			mes "[���ق̎�]";
			mes "���ق̗��p���� 5000z �ł��B";
			mes "�����������m���߂��������B";
			close;
		}
		mes "[���ق̎�]";
		mes "�悢���Ԃ����߂������������B";
		close2;
		set Zeny,Zeny-5000;
		percentheal 100,100;
		warp "harboro1.gat",157,210;
		end;
	case 3:
		mes "[���ق̎�]";
		mes "�܂����ĉ������B";
		close;
	}
}

//============================================================
// �嗤�ē���
//------------------------------------------------------------
//TODO
harboro1.gat,291,200,5	script	�嗤�ē���#harboro1	10218,{
	cutin "rock_cact02",2;
	mes "[�嗤�ē���]";
	mes "�₠�ٖM�l����B";
	mes "���̑嗤���ē����Ăق����̂��H";
	next;
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�嗤�ē���]";
		mes "�����\����Ȃ��B";
		mes "�ē����Ă��������̂͂�܂�܂����A";
		mes "�����c�Ƃ̝��ߎ������܂�܂ł�";
		mes "������Ɩ������ȁB";
		close2;
		cutin "rock_cact02",255;
		end;
	}
	if(BaseLevel < 130) {
		mes "[�嗤�ē���]";
		mes "�ۈ�������b�͕����Ă邪�c�c";
		mes "�\����Ȃ��B";
		mes "���̑嗤���ē�����̂�";
		mes "�ٖM�l����̎��͂ł�";
		mes "�܂������댯�Ȃ悤���B";
		next;
		mes "[�嗤�ē���]";
		mes "^ff0000BaseLv��130�ȏ�^000000�ɂȂ�����";
		mes "�܂����Ă���Ȃ����H";
		close2;
		cutin "rock_cact02",255;
		end;
	}
	if(ROCKRIDGE_1QUE == 16) {
		mes "[�嗤�ē���]";
		mes "���������A";
		mes "�ۈ�������b�͕����Ă����B";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close2;
			cutin "rock_cact02",255;
			end;
		}
		set ROCKRIDGE_1QUE,17;
		getitem 25250,10;
		mes "[�嗤�ē���]";
		mes "�����c�̘A�������";
		mes "�ЂƎd�����Ă��ꂽ�悤���ȁB";
		mes "���肪�Ƃ��B";
		mes "����͎�����̂��炾�B";
		next;
		mes "[�嗤�ē���]";
		mes "����^0000ff���b�N���b�W�R�C��^000000��";
		mes "�s���N���[�Y�Ђ�";
		mes "���s���Ă���R�C�����B";
		mes "���b�N���b�W�̔��W��";
		mes "���͂��Ă��ꂽ�l��";
		mes "�n�����ƂɂȂ��Ă���B";
		next;
		mes "[�嗤�ē���]";
		mes "�R�C�����W�߂�";
		mes "���̍L��ɂ���n���[�h�Ƃ���";
		mes "�j�ɓn���΃A�C�e����";
		mes "�������Ă���邼�B";
		next;
		mes "[�嗤�ē���]";
		mes "���ꂩ����ɕ����Ă���Ǝv�����A";
		mes "���̊J��n�ł�";
		mes "�����̖�肪�N���Ă���B";
		mes "�����ŁA�ǂ�������";
		mes "�ٖM�l����̗͂�݂��Ăق����B";
		next;
		mes "[�嗤�ē���]";
		mes "�����Ă���l�����̏ꏊ�ւ�";
		mes "�����ē����悤�B";
		mes "���e�͔ނ炩�璼�ژb��";
		mes "�����Ă����Ăق����B";
		mes "���񂾂��B";
		next;
	}
	switch(select("�]���T�[�r�X -> ����","���̎��� -> 4500zeny","�I��")) {
	case 1:
		break;
	case 2:
		mes "[�嗤�ē���]";
		mes "���̎��Â��ˁB";
		mes "���񂽂Ȃ�T�[�r�X����";
		mes "^0000ff4,500 Zeny^000000�ł������B";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�嗤�ē���]";
			mes "�܂����Ă���B";
			close2;
			cutin "rock_cact02",255;
			end;
		}
		if(Zeny < 4500) {
			// ������
			mes "[�嗤�ē���]";
			mes "Zeny������Ȃ��ȁB";
			mes "�܂����Ă���B";
			close2;
			cutin "rock_cact02",255;
			end;
		}
		set Zeny,Zeny-4500;
		percentheal 100,100;
		npcskillsupport 28,9999;
		mes "[�嗤�ē���]";
		mes "���̎��Â��I��������B";
		mes "�܂����Ă���B";
		close2;
		cutin "rock_cact02",255;
		end;
	case 3:
		mes "[�嗤�ē���]";
		mes "�܂����Ă���B";
		close2;
		cutin "rock_cact02",255;
		end;
	}
	mes "[�嗤�ē���]";
	mes "�����A�ǂ��ɍs�������񂾁H";
	mes "^FF0000<������>^000000";
	next;
	switch(select(	"�L�������� 01",
					"�L�������� 02",
					"���b�N���b�W�n���X����",
					"���b�N���b�W�z�R����",
					"[�E�B�[�N���[] �K�X�^�[�A�����M�[",
					"[�E�B�[�N���[] ������̂̃��������",
					"[�E�B�[�N���[] �����̕��Q",
					"[�E�B�[�N���[] �ԉΑ��̏���",
					"[�E�B�[�N���[] �r��̖���",
					"[�E�B�[�N���[] �H�ނ��Ȃ��I",
					"[�E�B�[�N���[] �����ێ������@����",
					"[�E�B�[�N���[] �����ێ������@�㋉",
					"[�E�B�[�N���[] �z�ǐ������",
					"[�E�B�[�N���[] �ٍ��̏��l",
					"[�E�B�[�N���[] �r���p�C�v�|��",
					"[�E�B�[�N���[] ���Z���̗���",
					"��������"
	)) {
	default:
		mes "[�嗤�ē���]";
		mes "�܂����Ă����ȁB";
		close2;
		cutin "rock_cact02",255;
		end;
	}
}

//============================================================
// �ē��v��
//------------------------------------------------------------
harboro1.gat,356,211,5	script	�ē��v��#rockridge01	10193,{
	mes "[�ۈ�������]";
	mes "�����̊�������������";
	mes "���b�N���b�W�ɂ悤�����I";
	mes "���͕ۈ��������";
	mes "���̈ē���C����Ă��܂��B";
	while(1) {
		next;
		switch(select("�J�v���E��","����","����E�h�","����X","�ۈ���������","�~�j�}�b�v�폜","�I��")) {
		case 1:
			mes "[�ۈ�������]";
			mes "^006400�J�v���E��^000000�̈ʒu��";
			mes "�~�j�}�b�v�ɕ\�����Ă����܂��ˁB";
			mes "�܂��T���Ă���ꏊ�͂���܂����H";
			viewpoint 1,291,207,1,0xFFFF33;
			continue;
		case 2:
			mes "[�ۈ�������]";
			mes "^006400����^000000�̈ʒu��";
			mes "�~�j�}�b�v�ɕ\�����Ă����܂��ˁB";
			mes "�܂��T���Ă���ꏊ�͂���܂����H";
			viewpoint 1,156,215,2,0xAAFF00;
			continue;
		case 3:
			mes "[�ۈ�������]";
			mes "^006400����E�h�^000000�̈ʒu��";
			mes "�~�j�}�b�v�ɕ\�����Ă����܂��ˁB";
			mes "�܂��T���Ă���ꏊ�͂���܂����H";
			viewpoint 1,312,193,3,0x008080;
			continue;
		case 4:
			mes "[�ۈ�������]";
			mes "^006400���^000000�̈ʒu��";
			mes "�~�j�}�b�v�ɕ\�����Ă����܂��ˁB";
			mes "�܂��T���Ă���ꏊ�͂���܂����H";
			viewpoint 1,312,193,4,0xFF1493;
			continue;
		case 5:
			mes "[�ۈ�������]";
			mes "^006400�ۈ���������^000000�̈ʒu��";
			mes "�~�j�}�b�v�ɕ\�����Ă����܂��ˁB";
			mes "�܂��T���Ă���ꏊ�͂���܂����H";
			viewpoint 1,241,218,5,0xFFCCFF;
			continue;
		case 6:
			mes "[�ۈ�������]";
			mes "�~�j�}�b�v�ɕ\���������̂�";
			mes "���ׂč폜���܂����B";
			mes "���ɉ����K�v�ł����H";
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			continue;
		case 7:
			mes "[�ۈ�������]";
			mes "���񃍃b�N���b�W��";
			mes "�y����ł����Ă��������B";
			close;
		}
	}
}
harboro1.gat,80,211,3	duplicate(�ē��v��#rockridge01)	�ē��v��#rockridge02	10193

//============================================================
// �Ŕ�
//------------------------------------------------------------
harboro1.gat,91,211,3	script	#rockno01	111,{
	mes "[�����ʂ�@�\����]";
	mes "�����ʂ�𓌂ɍs���ƁA";
	mes "���فA�ۈ����������A���X�A�L�ꂪ";
	mes "����܂��B";
	mes "����ɓ��ɍs���ƒ��̊O�ɂ�";
	mes "�L�����������L�����Ă��܂��B";
	close;
OnTouch:
	unittalk "�����ʂ�",1;
	end;
}

harboro1.gat,299,211,3	script	#rockno02	111,{
	mes "[�L��@�\����]";
	mes "���b�N���b�W�L��ł�";
	mes "�J�v���T�[�r�X�������p�ɂȂ�܂��B";
	mes "�L��̐��ɂ͕ۈ����������Ə��X���A";
	mes "����ɐ��̕��ɍs����";
	mes "���قƍ`������܂��B";
	close;
OnTouch:
	unittalk "���b�N���b�W�L��",1;
	end;
}

harboro1.gat,260,211,3	script	#rockno03	111,{
	end;
OnTouch:
	unittalk "�ۈ���������",1;
	end;
}

harboro1.gat,215,212,3	script	#rockno04	111,{
	end;
OnTouch:
	unittalk "�����F���ف@�^�@�����F�ۈ���������",1;
	end;
}

harboro1.gat,134,211,3	script	#rockno05	111,{
	end;
OnTouch:
	unittalk "�����F����",1;
	end;
}

harboro1.gat,310,201,3	script	#rockno06	111,{
	end;
OnTouch:
	unittalk "����@���퉮�@�h�",1;
	end;
}

//============================================================
// ���b�N���b�WNPC
//------------------------------------------------------------
harboro1.gat,228,170,3	script	�����̔L#rkrgtwn	553,5,5,{
	mes "[�����̔L]";
	mes "�ۈ����������Ƃ�";
	mes "���������ǂ��ɂ���񂾁I";
	mes "���̂����A�����˂��������I";
	next;
	mes "[�����̔L]";
	mes "�Ȃ�ł݂�ȃ��b�N���b�W��";
	mes "�`�����X�̓y�n�Ƃ��������āA";
	mes "�|�������c�����邱�Ƃ�";
	mes "�����Ă���Ȃ������񂾁I";
	next;
	mes "[�����̔L]";
	mes "�����c�ɂ��ׂĒD���āA";
	mes "���ݕ��𔃂���������Ȃ��c�c�B";
	emotion 28,"�����̔L#rkrgtwn";
	close;
OnTouch:
	unittalk "�����̔L : �����Ƃ����̂͂ǂ������I�I";
	end;
}

harboro1.gat,210,219,5	script	�i��#srdg01	110,{
	unittalk "�i�� : �h��������A�߂������Ƃ��������炢�ł����̏��ɗ��Ă��������B";
	sleep 1000;
	unittalk "�i�� : �݂Ȃ���͈�����邽�߂ɐ��܂ꂽ�厖�ȑ��݂Ȃ�ł��B";
	end;
}

harboro1.gat,188,123,3	script	�����Ă��闷�l#srdg02	881,{
	mes "[�����Ă��闷�l]";
	mes "���A���S�����I";
	mes "���x�c�ɓ���I";
	next;
	mes "[�����Ă���m�[�r�X]";
	mes "�����A�ǂ����ȁB";
	mes "�󂯓���Ă����́H";
	next;
	mes "[�����Ă��闷�l]";
	mes "�Ƃɂ�����x�s���Ă݂悤�Ǝv���B";
	mes "��������ĉ������Ȃ��ō����Ă����";
	mes "�̂�������������B";
	mes "�������̗���";
	mes "�����ŏI���邱�Ƃ͏o���Ȃ��I";
	close;
}

harboro1.gat,184,123,5	script	���l#srdg02	567,{
	mes "[�����Ă��闷�l]";
	mes "�z�R���z����";
	mes "�����Ɖ����܂ōs���Ă݂邩�H";
	next;
	mes "[�����Ă���m�[�r�X]";
	mes "�������҂��Ă���Ƃł��H";
	mes "�ނ���߂���";
	mes "�Ⴄ�Ƃ���ł��s���Ȃ��H";
	next;
	mes "[�����Ă��闷�l]";
	mes "������J�񂷂�񂶂�Ȃ����I";
	mes "���m�̐��E���I";
	next;
	mes "[�����Ă���m�[�r�X]";
	mes "��߂Ă����B";
	mes "�z�R�̕��ɂ͋����c�����邩��A";
	mes "������O�ɑS���D���邼�B";
	mes "���Ƃ����܂�܂ő҂Ƃ��B";
	next;
	mes "[�����Ă��闷�l]";
	mes "�����c�̂��c�c";
	mes "�{���ɂ낭�ł��Ȃ��ȁB";
	close;
}

harboro1.gat,174,125,3	script	�Z��#srdg01	53,{
	unittalk "�Z�� : �����͂�����蕗������ˁB���Ƒ����m��߂Ȃ��ƁB";
	end;
}

harboro1.gat,211,115,5	script	��Ǝ�#srdg01	808,{
	mes "[��Ǝ�]";
	mes "����Ȃ��Ƃ����肦���ł����H";
	mes "�������Ȃ��܂܉������߂����̂�";
	mes "�킩���Ă��܂����H";
	next;
	mes "[��Ǝ�]";
	mes "�����ɂ��s�����ɑ��~�߂���������";
	mes "�d��������Ȃ��Ƃ́I";
	next;
	mes "[��Ǝ�]";
	mes "�Ƃɂ����A�����d��������������";
	mes "���͂�߂܂���I";
	close;
}

harboro1.gat,213,117,3	script	��Ǝ�#srdg02	54,{
	mes "[��Ǝ�]";
	mes "�������܂���Ƃ��o���Ȃ��܂�";
	mes "�A�邱�ƂɂȂ肻���ł��B";
	next;
	mes "[��Ǝ�]";
	mes "�܂���Ԃ�ŉƂɋA�邱�ƂɁB";
	next;
	mes "[��Ǝ�]";
	mes "�����c�̂����ǂ��ɂ����Ȃ��ƁB";
	mes "���̂܂܂��Ɓc�c�B";
	close;
}

harboro1.gat,214,115,3	script	��Ǝ�#srdg03	52,{
	mes "[��Ǝ�]";
	mes "���̂��̏�Ԃ�";
	mes "��������l���͂����ł����H";
	next;
	mes "[��Ǝ�]";
	mes "�͂��c�c";
	mes "���܂Ŏw�����킦���܂܂�";
	mes "����̂ł��傤���B";
	close;
}

harboro1.gat,211,113,7	script	��Ɣǒ�#srdg01	952,{
	mes "[��Ǝ�]";
	mes "��Ƃ͂��n�܂�܂����H";
	next;
	mes "[��Ǝ�]";
	mes "���܂ŉ������Ȃ��ł����ł����H";
	next;
	mes "[��Ɣǒ�]";
	mes "���A������Ɨ��������Ă��������B";
	next;
	mes "[��Ǝ�]";
	mes "���̏�Ԃŗ���������Ƃł��H";
	mes "���܂łǂꂾ�����Ԃ�";
	mes "���ʂɂ��Ă������A";
	mes "�킩���Ă��ł����H";
	next;
	mes "[��Ɣǒ�]";
	mes "�܂��͕������������Ȃ���";
	mes "�����o���܂���B";
	next;
	mes "[��Ǝ�]";
	mes "���̕����Ƃ����̂�";
	mes "�����������ł����H";
	next;
	mes "[��Ɣǒ�]";
	mes "�������������������c��";
	mes "�D���Ă��܂����̂�";
	mes "�ǂ����邱�Ƃ��ł��܂���B";
	next;
	mes "[��Ǝ�]";
	mes "�����������o���Ȃ���΁A";
	mes "����Ȃ�̊o������Ă���������";
	mes "�����ł���I";
	close;
}

harboro1.gat,146,264,3	script	���S���W��#srdg01	896,{
	mes "[���S���W��]";
	mes "�Ȃ����S�������H";
	mes "�D�Ԃ��P��ꂽ����";
	mes "�������炢�������̂����邾�낤�H";
	next;
	mes "[���S���W��]";
	mes "����Ȃ̂܂��c���Ă�킯�Ȃ�����H";
	mes "�����Ƃ����ɏE���Ă邳�B";
	next;
	mes "[���S���W��]";
	mes "����[�A����𔄂낤�Ǝv����";
	mes "�킴�킴�����̂Ɂc�c�B";
	mes "���ꂩ��ǂ�����Ηǂ��񂾂낤�B";
	next;
	mes "[���S���W��]";
	mes "�~�b�h�K���h�嗤�ɖ߂낤���ȁH";
	next;
	mes "[���S���W��]";
	mes "����A����̓_�����I";
	mes "������҂��ŋA���";
	mes "�����@���ė����̂�";
	mes "���̂܂ܖ߂�Ɓc�c�B";
	close;
}

harboro1.gat,144,262,7	script	���S���W��#srdg02	996,{
	mes "[���S���W��]";
	mes "�ƂɋA�肽���c�c�B";
	mes "�������҂���ƕ���������";
	mes "���Ă݂��炱�̗L�l���c�c�B";
	next;
	mes "[���S���W��]";
	mes "���������҂��Ă݂悤�B";
	mes "���������܂����z����΁A";
	mes "�����҂��^�C�~���O�͂���B";
	mes "�s���`�̌�Ƀ`�����X�͕K������B";
	next;
	mes "[���S���W��]";
	mes "���܂�ɍ����s���`�߂���";
	mes "����ȏ�ς����Ȃ��B";
	mes "�����ς���ꂻ���ɂȂ��񂾂�B";
	next;
	mes "[���S���W��]";
	mes "���������A�������������҂Ƃ��B";
	next;
	mes "[���S���W��]";
	mes "�͂��c�c�ꂳ��̊炪�������B";
	close;
}

harboro1.gat,303,179,3	script	�������r#srdg01	890,{}

harboro1.gat,305,178,5	script	���т̗r#srdg01	890,{}

harboro1.gat,299,179,7	script	���C�̂Ȃ��r#srdg01	890,{}

harboro1.gat,297,178,5	script	�Q�Ă���r#srdg01	890,{}

harboro1.gat,301,175,7	script	�r����#srdg01	726,{
	emotion 28,"�r����#srdg01";
	mes "[�r����]";
	mes "�݂�Ȃ��߂�ˁc�c";
	mes "�N������������";
	mes "�A��ė���ׂ�����Ȃ�������B";
	mes "�����܂ŐH�ׂ��̂��Ȃ��Ƃ�";
	mes "�v��Ȃ������B";
	next;
	mes "[�r����]";
	mes "�������������҂��āB";
	mes "�O�ŌN�������H�ׂ��鑐��";
	mes "��ĂĂ��邩��B";
	mes "�͔|�ɐ��������";
	mes "�N�����̋�J�͏I���B";
	mes "���̂��ƐM���āB�ˁH";
	close;
}

harboro1.gat,302,175,7	script	��#srdg01	81,{
	emotion 3;
	unittalk "���������I�@�����H�@���������I";
	end;
}

harboro1.gat,104,132,5	script	�f�����q�P��#srdg01	955,{}

harboro1.gat,104,130,5	script	���#srdg01	955,{}

harboro1.gat,102,133,7	script	�f�����q�Q��#srdg01	955,{}

harboro1.gat,96,130,3	script	��#srdg01	955,{}

harboro1.gat,99,127,7	script	�q�ǂ�#srdg02	82,{
	unittalk "�q�ǂ� : �����A���O�猖�܂����H";
	end;
}

harboro1.gat,187,236,3	script	�K��q#srdg01	690,{
	mes "[�K��q]";
	mes "���H�X�ɐl�����Ȃ��ȁc�c�B";
	next;
	emotion 6,"�K��q#srdg02";
	mes "[�K��q]";
	mes "���������Ȃ�����l�����Ȃ��̂�";
	mes "������O����Ȃ����H";
	next;
	mes "[�K��q]";
	mes "�������A���̘b�͒m���Ă�H";
	mes "���̒��ň�Ԕ�������������";
	mes "�H�ׂ���̂��ǂ��Ȃ̂��B";
	next;
	emotion 1,"�K��q#srdg02";
	mes "[�K��q]";
	mes "�ǂ��Ȃ́H";
	next;
	mes "[�K��q]";
	mes "�ۈ����������炵���B";
	mes "�����̒n���̗��u��ŏo��";
	mes "�H�������Ȃ���������炵���B";
	mes "�킴�ƌy�ƍ߂�Ƃ���";
	mes "�����ɓ���l������炵����B";
	next;
	mes "[�K��q]";
	mes "����ȃo�J�ȁB";
	mes "��������������������";
	mes "�킴�킴�ƍ߂�Ƃ����H";
	mes "�ǂꂾ��������������";
	mes "�����܂ł���񂾁H";
	close;
}

harboro1.gat,182,236,5	script	�K��q#srdg02	688,{
	mes "[�K��q]";
	mes "���̌��͂ǂ����Ă�������";
	mes "���Ă�񂾁H";
	next;
	mes "[�K��q]";
	mes "�H�������炦���";
	mes "�v���Ă���񂶂�Ȃ��̂��H";
	next;
	emotion 52,"�f�r����#srdg01";
	emotion 52,"�f�r����#srdg02";
	mes "[�K��q]";
	mes "�����c�c";
	mes "�������C�ɂȂ���";
	mes "�����s�ǂɂȂ肻�����B";
	close;
}

harboro1.gat,183,241,5	script	�f�r����#srdg01	81,{
	emotion 43;
	unittalk "�i�c�����ȁc�c�c����ˁH�j";
	end;
}

harboro1.gat,182,241,5	script	�f�r����#srdg02	81,{
	emotion 43;
	unittalk "�i��������Ȃ����ȁB�j";
	end;
}

harboro1.gat,282,201,3	script	���b�N���b�W�^�C�K�[#sr	554,{
	emotion 45;
	end;
}

harboro1.gat,86,218,3	script	�E�F���`�[#rockwn01	634,5,5,{
	mes "[�E�F���`�[]";
	mes "���b�N���b�W�͏��߂Ăł����H";
	mes "���������������΂���ł��B";
	mes "���̉����S�R�Ⴂ�܂��ˁB";
	mes "�ƂĂ��y���݂ł��B";
	next;
	mes "[�E�F���`�[]";
	mes "�V�z�̌����̓����ƁA";
	mes "���������ŉ�����ł��炵�Ă���";
	mes "�������邵�c�c";
	mes "�{���Ɋ��C���ӂ�钬�ł��I";
	next;
	emotion 18,"�E�F���`�[#rockwn01";
	mes "[�E�F���`�[]";
	mes "�����Ă��邾����";
	mes "�������Ȃ��Ă��ď΂��Ă��܂��܂��B";
	mes "�͂͂͂́I";
	close;
OnTouch:
	emotion 2,"�E�F���`�[#rockwn01";
	end;
}

harboro1.gat,88,217,3	script	�C�f�B�X�E���b�`�[#rock	703,{
	emotion 19,"�C�f�B�X�E���b�`�[#rock";
	mes "[�C�f�B�X�E���b�`�[]";
	mes "���̂�������͉w�œ����Ă��܂��B";
	mes "�w�͖k�̕��ɂ���܂��B";
	mes "�傫�ȉו����^�Ԃ��������";
	mes "�{���ɂ����������ł��I";
	close;
OnTalk1:
	unittalk "�C�f�B�X�E���b�`�[ : ���邳���Ȃ��c�c�B";
	end;
}

harboro1.gat,85,208,7	script	�������h�E�E�F���L���X#	778,5,5,{
	mes "[�������h�E�E�F���L���X]";
	mes "���t�I";
	mes "�������̈̑�Ȓ��Ɋ��t�I";
	next;
	mes "[�J�������E�I�j�[��]";
	mes "�̑�ȊJ�񐸐_�Ɋ��t�I�I";
	next;
	mes "[�������L]";
	mes "�����A���t�ɂ��I�I";
	mes "�ɂ��ɂ��I�I";
	close;
OnTouch:
	if(getnpctimer(1,"�������h�E�E�F���L���X#")) {
		end;
	}
	initnpctimer;
	unittalk "�������h�E�E�F���L���X : ���b�N���b�W�ׂ̈ɁI";
	end;
OnTimer3000:
	donpcevent "�J�������E�I�j�[��#rock::OnTalk1";
	donpcevent "�������L#rockwn11::OnTalk1";
	end;
OnTimer12000:
	unittalk "�������h�E�E�F���L���X : ��͂͂́I�@��͂萴���Ȕ��������ō����I";
	end;
OnTimer13000:
	donpcevent "�J�������E�I�j�[��#rock::OnTalk2";
	end;
OnTimer14000:
	donpcevent "�������L#rockwn11::OnTalk2";
	end;
OnTimer23000:
	unittalk "�������h�E�E�F���L���X : �������́I";
	end;
OnTimer24000:
	donpcevent "�J�������E�I�j�[��#rock::OnTalk3";
	end;
OnTimer25000:
	donpcevent "�������L#rockwn11::OnTalk3";
	end;
OnTimer28000:
	stopnpctimer;
	unittalk "�������h�E�E�F���L���X : ���b�N���b�W�̊J�񖯁I";
	donpcevent "�J�������E�I�j�[��#rock::OnTalk3";
	donpcevent "�������L#rockwn11::OnTalk4";
	end;
}

harboro1.gat,84,200,5	script	�f���o�[�g�E���C�N#rock	848,{
	mes "[�f���o�[�g�E���C�N]";
	mes "�����Ő������đ����������";
	mes "�ƂɋA��񂾁I";
	mes "���܂�ɂ��������߂���";
	mes "�̌@�̏����������܂�";
	mes "�D�ɏ���Ă��܂�����I";
	next;
	mes "[�f���o�[�g�E���C�N]";
	mes "���x�����₪���邶��Ȃ����I";
	mes "�悢����I�@�悢����I";
	mes "���A��A�M�d�ȍz�΁c�c";
	mes "�S�����̃f���o�[�g�l��";
	mes "�@��o���Ă��I";
	next;
	emotion 6,"�R���X�^���X#rockwn18";
	mes "[�R���X�^���X]";
	mes "���̐l�A���v������H";
	mes "����͍z���ł͂Ȃ��A";
	mes "���`���Ƃ��Ė��ߍ��܂ꂽ���ł���I";
	mes "������͂������܂��Ă��������I";
	close;
OnTalk1:
	unittalk "�f���o�[�g�E���C�N : ���͂͂́A�S���@��o���Ă�邼�I";
	end;
}

harboro1.gat,80,204,7	script	�G���V�[#rockwn05	96,5,5,{
	mes "[�G���V�[]";
	mes "����[�I�@�������Y��I";
	next;
	emotion 1,"�G���V�[#rockwn05";
	mes "[�G���V�[]";
	mes "500��zeny�c�c";
	mes "�˂��H�@������Ăǂ̂��炢�Ȃ́H";
	next;
	mes "[���e�B�}�[]";
	mes "����͖`���Ґ�p�̉��i����B";
	mes "�������`�r������";
	mes "200zeny�ł�����B";
	close;
OnTouch:
	emotion 0,"�G���V�[#rockwn05";
	end;
}

harboro1.gat,86,210,4	script	�J�������E�I�j�[��#rock	102,{
	mes "[�J�������E�I�j�[��]";
	mes "�������͂�����ł��������ȁI";
	next;
	mes "[�������h�E�E�F���L���X]";
	mes "�����҂��Łc�c���ЂЂЁI";
	mes "����������H�ׂ悤�I";
	next;
	donpcevent "���e�B�}�[#rockwn07::OnTalk1";
	mes "[�������L]";
	mes "�`�L���������Ƃ��傤�����ɂ��I";
	mes "�`�L���I";
	mes "�`�L��������Ȃ��ɂ��I";
	close;
OnTalk1:
	unittalk "�J�������E�I�j�[�� : �ׂɁI";
	end;
OnTalk2:
	unittalk "�J�������E�I�j�[�� : ���Ԃ�����ނƂ����Ɗi�ʂ��I";
	end;
OnTalk3:
	unittalk "�J�������E�I�j�[�� : ���b�N���b�W�̊J�񖯁I";
	end;
}

harboro1.gat,81,205,1	script	���e�B�}�[#rockwn07	828,5,5,{
	mes "[���e�B�}�[]";
	mes "�L�O�i����܂��`�L�O�i�`�B";
	mes "���b�N���b�W�ɗ�����т�";
	mes "�Ƒ��A�F�B�A���l�ɂ�";
	mes "�킯�Ă����Ă��������B";
	next;
	mes "[���e�B�}�[]";
	mes "���A�`���҂���A�L�O�i�����܂����H";
	next;
	mes "[���e�B�}�[]";
	mes "�������Ƃ��܂���B";
	mes "���̉H���̑����i��200��zeny�A";
	mes "���l�̃v���[���g�ɒ��x����";
	mes "���̃n���J�`�́c�c";
	mes "�Ȃ�Ƃ�������500��zeny����I";
	close;
OnTouch:
	unittalk "���e�B�}�[ : �L�O�i����܂���`�L�O�i�`�B";
	end;
OnTalk1:
	unittalk "���e�B�}�[ : ���̐l�����͖��������Ȃ񂾂�ˁB�n�n�n�I";
	end;
}

harboro1.gat,98,211,3	script	�����b�^�[#rockwn08	641,5,5,{
	emotion 3,"�����b�^�[#rockwn08";
	mes "[�����b�^�[]";
	mes "���R�̓s�s���b�N���b�W�ł�";
	mes "��_�l�݂͂Ȃ���ƈꏏ�ɂ��܂��I";
	mes "���b�𕷂������Ȃ炢�ł�";
	mes "���炵�Ă��������B";
	next;
	mes "[�����b�^�[]";
	mes "�܂���q���͂Ȃ����ǁc�c";
	mes "�I�[�f�B���l�͌����ɂ͂��܂���B";
	mes "�������̐S�̒��ɂ��܂��B";
	mes "�ł�����ꏏ��";
	mes "���ӂ̂��F������Ȃ���c�c�B";
	next;
	emotion 16,"�h�����X#rockwn09";
	mes "[�h�����X]";
	mes "�����b�^�[�o�l�A�����ɂ��ł��B";
	mes "��_�l���S�ɂ���������Ƃ��Ă��A";
	mes "�������͌����̒��ɓ����Ă�";
	mes "�����̂ł͂���܂��񂩁B";
	next;
	mes "[�����X]";
	mes "���A�ŗ₽���������W���[�X��";
	mes "���݂����ȁc�c�B";
	next;
	mes "[�h�����X]";
	mes "����ł��A�����ł��A";
	mes "����ł���I�@�����X�Z��l�I";
	next;
	mes "[�����b�^�[]";
	mes "�ӂ��c�c";
	mes "�Ō�̑D�̓��`���I�������A";
	mes "�������W���[�X�ł�";
	mes "���C���W���[�X�ł�";
	mes "�D���ȕ��𔃂��Ă����܂���B";
	mes "�����獡�͂����������E�҂炵���c�c�B";
	next;
	emotion 14,"�h�����X#rockwn09";
	emotion 14,"�����X#rockwn10";
	donpcevent "�h�����X#rockwn09::OnTalk1";
	donpcevent "�����X#rockwn10::OnTalk1";
	mes "[�����X]";
	mes "�������W���[�X�c�c����A";
	mes "��_�l�݂͂Ȃ���Ƌ��ɂ���܂��I";
	close;
OnTouch:
	unittalk "�����b�^�[ : �I�[�f�B���l���`";
	donpcevent "�h�����X#rockwn09::OnTalk2";
	donpcevent "�����X#rockwn10::OnTalk2";
	end;
}

harboro1.gat,100,211,3	script	�h�����X#rockwn09	79,{
	mes "[�h�����X]";
	mes "��q���͐S�̒��ɂ���܂��B";
	mes "�����ǐ_�l�͒g�����x�b�h��";
	mes "���������H��ɂ�";
	mes "��������Ⴂ�܂���ˁH";
	mes "�C���������`�̑O�łȂ��Ă�";
	mes "��������Ⴂ�܂���ˁH";
	next;
	mes "[�����b�^�[]";
	mes "�����m��Ȃ��l����������";
	mes "���т��H�ׂ����Ă��炦�Ȃ����A";
	mes "�������Ƃ点�Ă��炦�Ȃ��̂���";
	mes "���Ⴂ����ł���I";
	mes "��������Ԓx���N���������Ɂc�c�B";
	next;
	emotion 19,"�h�����X#rockwn09";
	mes "[�h�����X]";
	mes "�ׁA�x�b�h�ɂ�����������";
	mes "��_�l�Ƃ��b�����Ă��������ł��I";
	mes "�����ĐQ�V�����킯����";
	mes "�Ȃ���ł���I";
	close;
OnTalk1:
	unittalk "�h�����X : �M���܂��`";
	end;
OnTalk2:
	unittalk "�h�����X : �`���җl�Ɓ`";
	end;
}

harboro1.gat,101,210,3	script	�����X#rockwn10	60,{
	mes "[�����X]";
	mes "�΂����ɂ�āA";
	mes "�O�Ō��t��`����̂�";
	mes "���񂾂�h���Ȃ��Ă��܂����B";
	mes "�����ǂ����ɗ�������";
	mes "���߂ĕ������C������";
	mes "���̒��ŕς���Ă��܂���B";
	next;
	emotion 2,"�����X#rockwn10";
	mes "[�����X]";
	mes "���̂��h���ƐS�Ɛ_��";
	mes "����₷���ł��B";
	mes "�ł�������������撣����";
	mes "�݂Ȃ���̋߂��ɂ���";
	mes "��_�l�̂����t��`���܂��I";
	close;
OnTalk1:
	unittalk "�����X : �M���܂��`";
	end;
OnTalk2:
	unittalk "�����X : ���ɂ��܂��`";
	end;
}

harboro1.gat,87,207,1	script	�������L#rockwn11	561,{
	mes "[�������h�E�E�F���L���X]";
	mes "�������́I�@���b�N���b�W�́I";
	mes "�̑�ȁI�@�J��!!�@���������I";
	next;
	mes "[�J�������E�I�j�[��]";
	mes "�z�R���I�@�@���āI";
	mes "�Ƃ��I�@���Ă�I";
	mes "�C���ƁI�@�������I";
	mes "���������~�߂Ă��`!!";
	next;
	donpcevent "�C�f�B�X�E���b�`�[#rock::OnTalk1";
	mes "[�������L]";
	mes "�ɂ��I";
	mes "�ɂ��ɂ��!!";
	mes "�ɂ�͂͂�I";
	mes "�ɂ��ɂ��ɂ�I�I";
	close;
OnTalk1:
	unittalk "�������L : �ׂɂ��`�I";
	end;
OnTalk2:
	unittalk "�������L : �`�L���͐��`�I�@�����`�`�L�����ɂ�I";
	end;
OnTalk3:
	unittalk "�������L : �E���Ł`�����܂����ɂ��I";
	end;
OnTalk4:
	unittalk "�������L : �ɂ��ɂ��ɂ�I�@�ɂ��ɂ��ɂ�ɂ�`�I�I";
	end;
}

harboro1.gat,79,224,5	script	�}�C���X�E�B�Y�i�[#rock	881,{
	mes "[�}�C���X�E�B�Y�i�[]";
	mes "�o���񂪎��̑D�ɏ���ė���̂�";
	mes "�҂��Ă���Ƃ���ł��B";
	mes "���̕�����Ɋ�Ղ������";
	mes "���ꂩ��o������ĂԂ��Ƃ�";
	mes "���Ă�����ł��B";
	next;
	mes "[�}�C���X�E�B�Y�i�[]";
	mes "��N�O�A���m��ʓy�n�ɍs������";
	mes "�o����͂��Ȃ�S�z���Ă�����ł��B";
	mes "�����玩���o�����p�������邱�Ƃ�";
	mes "�ł��ĂƂĂ��������ł��B";
	next;
	mes "[�}�C���X�E�B�Y�i�[]";
	mes "�w�͂���҂ɂ̓`�����X������I";
	mes "���ꂪ���b�N���b�W�ł��B";
	close;
}

harboro1.gat,75,211,1	script	�[���@�[�f�B�[#rockwn13	82,5,5,{
	mes "[�[���@�[�f�B�[]";
	mes "���b�N���b�W�ɂ悤�����I";
	mes "�`�����X�̒n�A���b�N���b�W��";
	mes "�f���炵�����Ԃ��߂����Ă��������I";
	close;
OnTouch:
	unittalk "�[���@�[�f�B�[ : ���b�N���b�W�ɂ悤�����I";
	misceffect 72,"�[���@�[�f�B�[#rockwn13";
	emotion 14,"�[���@�[�f�B�[#rockwn13";
	end;
}

harboro1.gat,75,219,3	script	�G�C���[��#rockwn14	96,5,5,{
	mes "[�G�C���[��]";
	mes "���b�N���b�W�ւ�����������";
	mes "�`���җl�����}���܂���`�I";
	mes "���Ȃ��ɂƂ��āA";
	mes "�������f���炵���`���̒n��";
	mes "�Ȃ�܂��悤�ɁB";
	close;
OnTouch:
	unittalk "�G�C���[�� : �`���җl�����}���܂���`�I";
	misceffect 72,"�G�C���[��#rockwn14";
	emotion 14,"�G�C���[��#rockwn14";
	end;
}

harboro1.gat,83,221,3	script	�}�t�A�J��#rockwn15	10225,{
	mes "[�}�t�A�J��]";
	mes "�������̒��ł͔ނ�J��҂�����";
	mes "�����Ă���҂����Ȃ��Ȃ��B";
	mes "�����ǃC�p���A��[�������Ă���B";
	mes "�ނ���F�A���R�̎q�ǂ������Ȃ񂾁B";
	next;
	mes "[���邢�C�p��]";
	mes "�q�ǂ������`�H";
	mes "�C�p���݂����`�H";
	next;
	mes "[�}�t�A�J��]";
	mes "�������B";
	mes "�ނ炾������Ȃ����B";
	mes "���ꂿ��񂾂��āA";
	mes "�厩�R�̑O�ł̓C�p���݂�����";
	mes "�q�ǂ��ł����Ȃ��񂾂��B";
	next;
	emotion 18,"���邢�C�p��#rockwn16";
	mes "[���邢�C�p��]";
	mes "���͂͂͂́I�@�R���`�I";
	mes "���ꂿ���͔w���������A";
	mes "�����������E������̂ɁA";
	mes "�Ȃ�ŃC�p���݂����Ȏq�ǂ��Ȃ́H";
	next;
	mes "[�}�t�A�J��]";
	mes "�C�p�����F�B��";
	mes "���ǂ�����̂Ɠ����悤�ɁA";
	mes "�݂�Ȉꏏ�ɒ��ǂ����Ȃ����A";
	mes "�ƌ������Ƃ��B";
	mes "�킩�������A�C�p���H";
	next;
	mes "[���邢�C�p��]";
	mes "����A�킩�����I";
	mes "���ꂿ���̌����ʂ�ɂ���I";
	mes "�C�p���ǂ��q������I";
	close;
}

harboro1.gat,82,221,3	script	���邢�C�p��#rockwn16	10226,5,5,{
	mes "[���邢�C�p��]";
	mes "���ꂿ���͐����J�b�R�����ł��I";
	mes "���܂ɃC�p���ɂ͂悭�킩��Ȃ��b��";
	mes "���Ă���邯�ǁc�c�B";
	next;
	emotion 2,"���邢�C�p��#rockwn16";
	mes "[���邢�C�p��]";
	mes "�C�p�������ꂿ��񂭂炢";
	mes "�傫���Ȃ�����킩��悤�ɂȂ��ˁH";
	mes "�����傫���Ȃ��āA";
	mes "���ꂿ��񂩂������x";
	mes "�������Ƃɂ��܂��I";
	close;
OnTouch:
	emotion 18,"���邢�C�p��#rockwn16";
	end;
}

harboro1.gat,93,201,1	script	���[�����h�o�[�c#rockwn	10203,{
	mes "[���[�����h�o�[�c]";
	mes "���̒��͉�X�������";
	mes "���x�c������Ă��܂��B";
	mes "���[�v�ۈ����̉���";
	mes "�������ڂ����点�Ȃ���";
	mes "�����x�����Ă��܂��B";
	next;
	emotion 16,"���[�����h�o�[�c#rockwn";
	mes "[���[�����h�o�[�c]";
	mes "��ԓ���Y�܂��Ă���̂�";
	mes "��͂苍���c�����ǁc�c";
	mes "�쐶���������ɂ�";
	mes "���Ȃ����Ă��Ă��܂��B";
	next;
	mes "[���[�����h�o�[�c]";
	mes "�����Ē��̒n���ɂ́c�c";
	mes "���A�����c�c";
	mes "����͂��܂肨�b���������Ȃ��ł��B";
	close;
}

harboro1.gat,85,195,1	script	�R���X�^���X#rockwn18	850,5,5,{
	mes "[�R���X�^���X]";
	mes "���I�@���񂽖`���҂��낤�H";
	mes "���̐l���~�߂Ă�����I";
	next;
	mes "[�R���X�^���X]";
	mes "�D����~��Ď��͂����񂵂�����";
	mes "�v������A�����Ȃ��͂���";
	mes "�@��n�߂��񂾂�I";
	next;
	emotion 7,"�R���X�^���X#rockwn18";
	mes "[�R���X�^���X]";
	mes "����͍z������Ȃ��āA";
	mes "���̐l�������͂����킹�č����";
	mes "���`���Ȃ񂾂�I";
	mes "�����z���Ȃ̂����ʂ��o���Ȃ��̂�";
	mes "�z�R�œ�������Ȃ̂����I";
	close;
OnTouch:
	donpcevent "�f���o�[�g�E���C�N#rock::OnTalk1";
	unittalk "�R���X�^���X : ������Ƃ��񂽁I�@��߂Ȃ����I";
	end;
}

harboro1.gat,73,206,5	script	�����^�[�O���[�������h#	486,{
	mes "[�����^�[�O���[�������h]";
	mes "����ȉ����܂ŗ����̂ɂ�";
	mes "�����ړI�������ł��傤�ˁH";
	mes "�ړI��S�������Ƃ��āA";
	mes "���ɉ�������΂����̂�";
	mes "�킩��Ȃ��Ȃ������ɂ́c�c";
	next;
	mes "[�����^�[�O���[�������h]";
	mes "�����̓��ɉ�����";
	mes "���̓����̓����ɍs���A";
	mes "�����������������̕���";
	mes "�s���Ă݂Ă��������B";
	next;
	mes "[�����^�[�O���[�������h]";
	mes "�����ɂ͎d���ƐH����";
	mes "�񋟂���l���������܂��B";
	mes "�������A�����Ⴄ�ׂ�";
	mes "�W�܂����l�����������ł����ǁB";
	close;
}

harboro1.gat,94,237,3	script	�R���f��#rockn01	573,{
	mes "[�R���f��]";
	mes "�D�ԉw�����Ă����";
	mes "�Ȃ����������Ȃ�܂��B";
	mes "���̏ے��݂����Ȃ��̂ł�����B";
	next;
	mes "[�R���f��]";
	mes "�͍̂z�R��������";
	mes "���Ȃ藣��Ă����̂ŁA";
	mes "�z�R�̍̌@���n�܂��Ă����";
	mes "�����ԋ�J���܂����B";
	next;
	mes "[�R���f��]";
	mes "���H��������Ă���";
	mes "���悢�惍�b�N���b�W�̔��W��";
	mes "�n�܂�񂾂Ǝv���܂����B";
	mes "�����c�����񂾂񎷝X��";
	mes "�Ȃ��Ă������ǁc�c";
	mes "���W�ɂ͋�J�������̂ł��B";
	next;
	emotion 14,"�R���f��#rockn01";
	mes "[�R���f��]";
	mes "�����Ǔ���ڂ̑O�ɂ��Ă�";
	mes "����~�߂Ȃ��̂��A";
	mes "���������b�N���b�W�̐��_�ł��I";
	close;
}

harboro1.gat,100,77,4	script	���C�x��#rockn02	102,{
	mes "[���C�x��]";
	mes "���b�N���b�W�͊C�ӂ̒��ł��B";
	mes "�̂́c�c����A";
	mes "���������ƍ����C�Ɛ���Ă��܂��B";
	next;
	mes "[���C�x��]";
	mes "���̒��̉��Ɏ��͂����ЂƂA";
	mes "�������邱�Ƃ�m���Ă��܂����H";
	mes "���X�͂�����";
	mes "���b�N���b�W��������ł��B";
	mes "�����Ǔx�X�C���������ė���̂ƁA";
	mes "�n�����̋t���ŏZ�߂Ȃ��Ȃ�܂����B";
	next;
	mes "[���C�x��]";
	mes "�R�X�e���s���̌���́A";
	mes "���̒��𖄂߂Ă��̏��";
	mes "�V�����������Ă邱�Ƃł����B";
	mes "����ňȑO�̒��͒n���ɂȂ�A";
	mes "���̏�ɍ��̒����ł�����ł��B";
	next;
	mes "[���C�x��]";
	mes "���ł����𔲂���Ƃ����Ȃ���";
	mes "�������Z�����邩�킩��܂���B";
	close;
}

harboro1.gat,229,64,3	script	���[�Y�E�����E�F�o�[#ro	850,{
	mes "[���[�Y�E�����E�F�o�[]";
	mes "���񂴂肷��C���I";
	mes "����ƌ�����C���I���Ȃ���I";
	close;
}

harboro1.gat,290,104,5	script	�G�Y�j���[#rockn04	553,{
	mes "[�G�Y�j���[]";
	mes "�����ɂ��錚���̂قƂ�ǂ�";
	mes "��K���n���ɖ��܂��ĂāA";
	mes "�n��ɏo�Ă��镔����";
	mes "���͓�K�������炵���j���B";
	close;
}

harboro1.gat,241,200,5	script	�K���}���E�|�V�[#rockn0	900,{
	mes "[�K���}���E�|�V�[]";
	mes "���킪�~�����̂��H";
	mes "�����ł͏e����舵���Ă���B";
	next;
	mes "[�K���}���E�|�V�[]";
	mes "�����A���퉮�͕܂��Ă��邼�B";
	mes "�傪�����c��ގ������";
	mes "�������ďo�čs�������A";
	mes "�����œ]��ō���ɂ߂��炵���B";
	next;
	mes "[�K���}���E�|�V�[]";
	mes "�e���~���������炱�̓������ɂ���";
	mes "���̓���ɍs���ȁB";
	mes "�����̎�̑��q������̒[���؂��";
	mes "���������Ă��邩��B";
	close;
}

harboro1.gat,311,53,5	script	�W���C�X�E���X���[#rock	90,{
	mes "[�W���C�X�E���X���[]";
	mes "���𖄂߂�O����C�݂ɋ߂��Ƃ�";
	mes "�n�Ղ��ɂ��Ȃ��Ă��܂����B";
	mes "���ǂ��̉Ƃ͂���Ȏp�Ɂc�c�B";
	next;
	mes "[�W���C�X�E���X���[]";
	mes "�����ɏZ��ł����l��";
	mes "�C�ɂȂ�܂����H";
	mes "�`���҂������m����";
	mes "�ǂ��������ł����H";
	next;
	emotion 54,"�W���C�X�E���X���[#rock";
	mes "[�W���C�X�E���X���[]";
	mes "���߂�Ȃ����A";
	mes "�{�����͂Ȃ������́B";
	mes "�����c�c���������ǂ������āc�c�B";
	close;
}

harboro1.gat,321,237,5	script	���r�i�E�A�h���[#rockn0	882,{
	emotion 2,"���r�i�E�A�h���[#rockn0";
	mes "[���r�i�E�A�h���[]";
	mes "���`��A�����Ŗ��키���Ƃ��ł���";
	mes "�H�ו��̒��ł́A";
	mes "��͂�A�K�x�W���[�X���ō��ł��ˁB";
	next;
	mes "[���r�i�E�A�h���[]";
	mes "���X�̓L���N�^�[����";
	mes "�`�������炵���ł��B";
	mes "�Â��ė₽���A�A�ɗ��܂����B";
	mes "�������Y��ɂ��Ă����C�����܂��I";
	next;
	mes "[���r�i�E�A�h���[]";
	mes "�c�c����H";
	mes "�悭������A�K�x�W���[�X�ł͂Ȃ��A";
	mes "�A�K�x�u���v�W���[�X�Ə����Ă���B";
	next;
	emotion 4,"���r�i�E�A�h���[#rockn0";
	mes "[���r�i�E�A�h���[]";
	mes "���c�c�܂����A";
	mes "�A�K�x�����͓����ĂȂ��́H";
	close;
}

harboro1.gat,280,195,3	script	���[�J�X�E���[�`#rockn0	828,{
	mes "[���[�J�X�E���[�`]";
	mes "�܂����{���ɒn������";
	mes "�H�삪�o���肵�Ȃ���ˁH";
	mes "�t�ɐ����󂪂��邩������Ȃ��B";
	next;
	mes "[���[�J�X�E���[�`]";
	mes "�����Ɛ肵�悤�Ƃ����炪";
	mes "�������\���L�����ɈႢ�Ȃ��B";
	next;
	mes "[�L�������E�p�X]";
	mes "���͍s���Ȃ��A��΍s���Ȃ��I";
	next;
	mes "[���[�J�X�E���[�`]";
	mes "���[��A�����Ă݂����������ǁA";
	mes "�ӊO�Ɩ{���ɂ��������B";
	mes "�ǂ��H�@�L�������H";
	mes "�n���Ɉ�x�~��Ă݂Ȃ��H";
	close;
OnTalk1:
	unittalk "���[�J�X�E���[�` : ��I";
	end;
}

harboro1.gat,168,216,3	script	�q�[�����A�[�h#rockn09	698,{
	mes "[�q�[�����A�[�h]";
	mes "�d��������Ȃ��̂ɂ��ւ�炸";
	mes "�`���҂Ɏd�������͕̂s������B";
	next;
	mes "[�q�[�����A�[�h]";
	mes "�Ƃ͂����`���҂������񂹂Ă��ꂽ";
	mes "�������ŗ��ق͂�����ɐ����B";
	mes "�����h���Ƃł����΂悩�����B";
	close;
}

harboro1.gat,130,237,3	script	�h�b�N��Ɗē�#rockn10	712,{
	mes "[�h�b�N��Ɗē�]";
	mes "�z�R�Ō@��o�����z����";
	mes "�D�Ԃɐς�ł����������ɉ^�ԁB";
	mes "�����čz�R�ɖ߂�D�Ԃɂ�";
	mes "�z�R�J���҂��g�p����i����";
	mes "�ς�ł����B";
	next;
	mes "[�h�b�N��Ɗē�]";
	mes "�����͂����Z�����B";
	mes "���������ł̍�Ƃ��x����";
	mes "�S�Ă̍�Ƃ��x��鎖�ɂȂ�B";
	next;
	donpcevent "�W�F�C�_�[#rockn11::OnTalk1";
	donpcevent "���R�X���`�[#rockn12::OnTalk1";
	donpcevent "�|�g�j���X#rockn13::OnTalk1";
	mes "[�h�b�N��Ɗē�]";
	mes "������v���C�h�ƐӔC����";
	mes "�����Ďd��������悤�ɁI";
	mes "����΂��茾���ĂȂ��ŁI";
	close;
}

harboro1.gat,126,236,7	script	�W�F�C�_�[#rockn11	881,{
	mes "[�W�F�C�_�[]";
	mes "���c�c���������Ȃ��B";
	mes "�S�g���o���o���ɂȂ肻�����B";
	mes "�D�Ԃ��p�ɂɗ��悤�����܂���";
	mes "�d���ʂ����̕ς��Ȃ��H";
	next;
	mes "[�h�b�N��Ɗē�]";
	mes "�w�͂�����Ȃ��񂾂�A";
	mes "�͂��c�c�킩���ĂȂ��ˁB";
	mes "�d�������邱�Ƃ���΂Ȃ��ƁI";
	next;
	emotion 54,"�W�F�C�_�[#rockn11";
	mes "[�W�F�C�_�[]";
	mes "�킠�I";
	mes "�����畷���Ă�����ł����H";
	mes "�������d��������̂͊������ł��I";
	mes "���̃W�F�C�_�[�I";
	mes "���������ɓw�͂��Ă��܂��I";
	close;
OnTalk1:
	unittalk "�W�F�C�_�[ : �������グ�Ă��ꂽ������Ɗ撣�ꂻ���ł����ǁc�c�B";
	end;
}

harboro1.gat,128,233,7	script	���R�X���`�[#rockn12	642,{
	mes "[���R�X���`�[]";
	mes "�����ŋ߁A�O����̐l�������n�߂�";
	mes "���X�Ɏd���������Ă��Ă���̂ɁA";
	mes "�Ƒ���{�����Ƃ��o����";
	mes "�{���ɏ������Ă��܂��B";
	next;
	mes "[���R�X���`�[]";
	mes "�������̂��߂ɁA";
	mes "����������������I";
	mes "�C�f�B�X�I";
	mes "��������͍������撣���Ă邼�I";
	mes "���������������������������������I";
	close;
OnTalk1:
	unittalk "���R�X���`�[ : �C�f�B�X�I�@��������撣�邼�I";
	end;
}

harboro1.gat,130,232,7	script	�|�g�j���X#rockn13	545,{
	mes "[�|�g�j���X]";
	mes "���b�N���b�W�ɗ����";
	mes "�ȒP�ɋ������ɂȂ��ƕ����āA";
	mes "�������b�N���b�W�ɗ����ɂ��I";
	next;
	mes "[�|�g�j���X]";
	mes "�����ǂ����ȏ��";
	mes "�̂���ꂽ�c�c�ɂ��c�c�B";
	mes "�����ݕ����^��ł�������";
	mes "�����ɂ��ɂ�B";
	next;
	emotion 57,"�|�g�j���X#rockn13";
	mes "[�|�g�j���X]";
	mes "���̂܂܂��Ǝ��Ô�̕���";
	mes "�������������ɂ��c�c�B";
	close;
OnTalk1:
	unittalk "�|�g�j���X : ���͂ǂ����Ă����ɂ���񂾁c�c�H";
	end;
}

harboro1.gat,74,259,3	script	�C�G���[�}�b�N�R�f�B#ro	633,{
	mes "[�C�G���[�}�b�N�R�f�B]";
	mes "�J���ƊC���A�O�ɂ���A������";
	mes "�ݕ�����邱�̎d���͎��̌ւ肾�I";
	next;
	emotion 28,"�C�G���[�}�b�N�R�f�B#ro";
	mes "[�C�G���[�}�b�N�R�f�B]";
	mes "�ŋ߂́c�c���ށB";
	mes "�����c�̂�����";
	mes "�����ւ�ɏ����c�c�B";
	close;
}

harboro1.gat,233,215,3	script	�E�H���t���[�h�Z�C�K��#	881,{
	mes "[�E�H���t���[�h�Z�C�K��]";
	mes "�ŋ߁A�����c�̂�����";
	mes "�ۈ������Z�����Ȃ�A";
	mes "���̎d���̏������x���Ȃ��Ă��܂��B";
	mes "���������ԑ҂��Ă���̂��c�c�B";
	close;
}

harboro1.gat,231,212,7	script	�G�[�f���y�s�i�[#rockn1	879,{
	mes "[�G�[�f���y�s�i�[]";
	mes "�ۈ����������ł͐l�肪���܂�ɂ�";
	mes "�s�����Ă��āA������҂��Ă�";
	mes "�񂪓����܂���B";
	mes "�Ƃ̒n������ςȉ�����������";
	mes "�s���Ȃ̂Ɂc�c�B";
	next;
	mes "[�G�[�f���y�s�i�[]";
	mes "�����̕ۈ������@�I�Ȓn�ʂ�";
	mes "�����Ă�킯�ł͂Ȃ����ǁA";
	mes "���̒��ł͂���Ȏ��ɏ�����";
	mes "���߂���̂͂�����������܂���B";
	next;
	mes "[�G�[�f���y�s�i�[]";
	mes "���̑������������A";
	mes "�����͗��������܂���ˁH";
	close;
}

harboro1.gat,278,195,5	script	�L�������E�p�X#rockn17	879,{
	mes "[�L�������E�p�X]";
	mes "�\�͕����܂����H";
	mes "�ŋߒn���Ɂc�c";
	mes "�I�o�P���o��炵���ł���I";
	next;
	mes "[�L�������E�p�X]";
	mes "�ǂ����n���𖄂߂��Ƃ��s���ہA";
	mes "�ꏏ�ɖ��߂�ꂽ�l��";
	mes "�����炵�����ǁc�c";
	mes "���̒��͏o���肷��l�������āA";
	mes "�N�����Ȃ��Ȃ��Ă�";
	mes "�Ȃ��Ȃ��C�����ɂ����ł��B";
	next;
	donpcevent "���[�J�X�E���[�`#rockn0::OnTalk1";
	mes "[�L�������E�p�X]";
	mes "�n���ɕ�C��Ƃ����ɍs�����l��";
	mes "�ς��ς��A���������c�c�Ƃ�������";
	mes "�������炵���ł��B";
	mes "����ŋ߂��Ō��Ă݂���c�c";
	mes "���Ⴀ�������������I";
	next;
	mes "[�L�������E�p�X]";
	mes "���[�J�X�I";
	mes "���O�A�{���Ɏ��ɂ����̂�!?";
	mes "�������ȁI";
	mes "���������B";
	mes "����ȏ�͘b�������Ȃ��B";
	close;
}

harboro1.gat,312,173,8	script	���܋��n���^�[#rockn18	700,{
	mes "[���܋��n���^�[]";
	mes "�������Ă�񂾁H";
	mes "�����A�����c�̂��ɂ�";
	mes "���Ȃ�̌��܋����������Ă���B";
	next;
	mes "[���܋��n���^�[]";
	mes "��炪�ݕ���Ԃ�_���n�߂��ȏ�A";
	mes "���x�c�ƕۈ����̐搶��";
	mes "�ق��Č��Ă��鎖��";
	mes "�o���Ȃ��Ȃ����񂾂�B";
	next;
	mes "[���܋��n���^�[]";
	mes "�܂��������Ƃ��Ă͂�������";
	mes "������Ƃ����҂����o����";
	mes "�����邯�ǂȁB";
	close;
}

harboro1.gat,229,212,7	script	�n�[�}���E�t�@�[�����h#	778,{
	mes "[�n�[�}���E�t�@�[�����h]";
	mes "���A�������ۈ�����������";
	mes "�ԈႢ����܂��񂩁H";
	mes "���΂Ȃ��Ƃ����Ȃ���ł����H";
	next;
	mes "[�n�[�}���E�t�@�[�����h]";
	mes "�`���҂ł���ˁH";
	mes "����Ȃ炠�̔��������΂����ł��B";
	next;
	mes "[�n�[�}���E�t�@�[�����h]";
	mes "�`���҂͕ۈ����̗��݂�";
	mes "�o���肵�Ă����ł���ˁH";
	mes "�������͕ۈ�����";
	mes "���݂������ė��Ă���̂ł�����A";
	mes "�҂̂͂��傤���Ȃ��ł��B";
	next;
	mes "[�n�[�}���E�t�@�[�����h]";
	mes "�͂��A�������ԗ����Ă�������";
	mes "�����ɂ��I";
	close;
}

harboro1.gat,130,158,3	script	�A�N�n#rockn19	10222,{
	mes "[�A�N�n]";
	mes "���ꂿ���";
	mes "�ٖM�l�̒��ɘA��čs���ꂽ��";
	mes "�����S����������������";
	mes "�����Ă�����I�@�ǂ����悤�H";
	next;
	emotion 28,"�A�N�n#rockn19";
	mes "[�A�N�n]";
	mes "���킠���`��I";
	mes "���k����`��I�@�ǂ��ɂ���́`�H";
	next;
	mes "[�i�n��]";
	mes "���v��B";
	mes "��������Ă邯�ǁA";
	mes "���񂽂̞��͂����ƕt���Ă邵�A";
	mes "���̓��ɂ��Ԃ͕t���Ă�ł��傤�H";
	next;
	mes "[�A�N�n]";
	mes "������c�c";
	mes "����c�c�Y��ɂ��Ă���B";
	next;
	mes "[�i�n��]";
	mes "��������v�I";
	mes "�����������k�����ɂ�����B";
	mes "�������ɍs���Ă݂܂��傤�B";
	next;
	emotion 16,"�A�N�n#rockn19";
	mes "[�A�N�n]";
	mes "����������Ă��ɂȂ�����";
	mes "�p���������患�c�c�B";
	close;
}

harboro1.gat,132,157,3	script	�i�n��#rockn19	10226,{
	mes "[�i�n��]";
	mes "�����͕s�v�c�Ȓ��ł��ˁB";
	mes "�ƂĂ������đ傫�Ȗ؂̉Ƃ�����B";
	mes "�C�ł��؂͈���ǁc�c";
	mes "�ǂ��������݂�ȓ����p�����Ă�I";
	next;
	mes "[�A�N�n]";
	mes "�����c�c�i�n���A";
	mes "���k�����ɓ{���邩��";
	mes "�����T������B";
	mes "���k�����S�z���Ă��B";
	next;
	mes "[�i�n��]";
	mes "�����ˁB�����ǒ��̂ǂ���";
	mes "���k����񂪂��邩�킩��Ȃ����A";
	mes "���������������Ă���s���܂��傤�B";
	mes "���̂��������邩���B";
	mes "���I�@�������ɈٖM�l��";
	mes "�������񂢂��I�@�s���Ă݂܂���I";
	next;
	emotion 28,"�A�N�n#rockn19";
	mes "[�A�N�n]";
	mes "����Ȏ������Ă�";
	mes "�ƂɋA��Ȃ��Ȃ�����";
	mes "�ǂ����悤�c�c�B";
	close;
}

harboro1.gat,274,214,5	script	�����؂̎}#rockn19	10228,5,5,{
	mes "[�����؂̎}]";
	mes "�A�N�n�����A�i�n�������c�c�B";
	mes "�ǂ��ɍs���Ă��܂����̂�����B";
	next;
	mes "[�����؂̎}]";
	mes "�����܂���A";
	mes "�L���N�^�[���̎q�ǂ���";
	mes "���܂���ł������H";
	mes "�j�̎q�Ə��̎q�̓�l�g�ł��B";
	next;
	mes "[�����؂̎}]";
	mes "�ٖM�l�̒��ɍs���Ă݂����ƌ�������";
	mes "�A��ė�����ł����A";
	mes "�l���݂̒��ł͂���Ă��܂��āc�c�B";
	close;
OnTouch:
	unittalk "�����؂̎} : �A�N�n�����`�i�n�������`�I�@�ǂ��ɂ���́`�I";
	end;
}

//============================================================
// ���b�N���b�W����NPC
//------------------------------------------------------------
har_in01.gat,24,69,3	script	���₩�ȕv�l#rockridge0	74,{
	mes "[���₩�ȕv�l]";
	mes "��M���ӂ�Ă���";
	mes "�`���җl�Ȃ̂ł��ˁB";
	close;
}

har_in01.gat,100,14,3	script	���x�c��#srdg01	10220,{
	unittalk "���x�c�� : �]�v�Ȃ��Ƃ͂��Ȃ����������ł���B";
	sleep 2000;
	unittalk "���x�c�� : ���̂��̉s���ڂ����Ă��܂���B";
	end;
}

//============================================================
// ���b�N���b�W�n���XNPC
//------------------------------------------------------------
harboro2.gat,57,239,3	script	���Ǝ�#srdg01	85,{
	mes "[���Ǝ�]";
	mes "�������̃����X�^�[��";
	mes "�����܂����H";
	mes "�r���ǂ��ǂ��ł��ł��B";
	mes "���������I�ɑ|�����Ȃ���";
	mes "�����Ȃ���ł����c�c";
	next;
	mes "[���Ǝ�]";
	mes "�����ł�������Ē��߂Ă���ƁA";
	mes "���Ԃ������ƌ����Ԃ�";
	mes "�߂��Ă�����ł��B";
	next;
	mes "[���Ǝ�]";
	mes "�����Ȃ��Ƃ����̊Ԃ�";
	mes "������Y��鎖���o���܂��B ";
	mes "�z�R�⎸�Ƃ̖����B";
	next;
	mes "[���Ǝ�]";
	mes "���͍s���Ƃ��낪�Ȃ���";
	mes "�����ɂ��܂����A";
	mes "�z�R���狍���c�����Ȃ��Ȃ��";
	mes "�܂������ɖ߂�܂��B";
	close;
}

harboro2.gat,258,117,3	script	�h���V�X�^�[#srdg02	79,{
	mes "[�h���V�X�^�[]";
	mes "�т����肵�܂������H";
	mes "����ȏ��ɐl���Z��ł��āB";
	mes "��ɏZ��ł���l������";
	mes "�����̎����C�ɂ��Ă��܂���B";
	mes "�����ɂ͒N���Z��ł��Ȃ����Ƃ�";
	mes "�Ȃ��Ă��܂�����B";
	next;
	mes "[�h���V�X�^�[]";
	mes "�m�肽�����Ȃ����A";
	mes "�m�낤�Ƃ����Ȃ���ł��B";
	mes "����ȏ��ɏZ��ł���l��";
	mes "����Ȃ�đz�������ł��傤�H";
	close;
}

harboro2.gat,67,191,5	script	�����}�j�A#srdg01	749,{
	mes "[�����}�j�A]";
	mes "���񂭂�c�c�I";
	mes "�����̓����A�ǂ��Ǝv���܂��񂩁H";
	mes "���͂�������������Ǝ����ۂ��L����";
	mes "�D���Ȃ�ł��I";
	mes "�����ɏZ�݂������炢�ł��I";
	next;
	mes "[�����}�j�A]";
	mes "�����ǁc�c���������Ȃ��";
	mes "���������Ȃ���ł��B";
	mes "�����炱�̏L���������A�����ł��I";
	close;
}

harboro2.gat,142,155,7	script	�����c#srdg01	10230,{
	mes "[�����c]";
	mes "�Ȃ񂾁H";
	mes "�����c������̂͏��߂Ă��H";
	next;
	mes "[�����c]";
	mes "����ȖڂŌ�����Ǝ₵���ȁB";
	mes "�����������āA";
	mes "���͉������Ă��Ȃ��񂾂��H";
	next;
	mes "[�����c]";
	mes "�����͉������̓꒣�肾�B";
	mes "�]�v�ȑ������N���������Ȃ����";
	mes "�������Ƃ��̕ӂ��痣���񂾂ȁB";
	next;
	mes "[�����c]";
	mes "�ʂ�߂��邭�炢�Ȃ�\��Ȃ����A";
	mes "��񑩂��B";
	mes "�������̂��Ƃ���ɂ�";
	mes "�b���Ȃ�H�@�킩�������H";
	close;
}

harboro2.gat,144,156,1	script	�����c#srdg02	10232,{
	mes "[�����c]";
	mes "�����͌����ɂ͑��݂��Ȃ����B";
	mes "���������ꕔ�̎҂�����";
	mes "�m���Ă���ꏊ�����������邪�A";
	mes "�����͂��̒��̂ЂƂ��B ";
	close;
}

harboro2.gat,125,196,3	script	�q�ǂ�#srdg01	914,{
	mes "[�q�ǂ�]";
	mes "���ꂳ��A�������͂��ɂȂ�����";
	mes "�܂���ŏZ�߂�悤�ɂȂ�́H";
	next;
	mes "[�ꂳ��]";
	mes "���������c�c";
	mes "�z�R�ɓ����悤�ɂȂ��āA";
	mes "������ƕꂳ�񂪂������҂�����A";
	mes "�܂���ŕ�炷���Ƃ��ł����B";
	next;
	mes "[�q�ǂ�]";
	mes "���ƂɋA�肽���c�c�B";
	close;
}

harboro2.gat,123,195,5	script	���ꂳ��#srdg01	53,{
	mes "[�ꂳ��]";
	mes "�����Ƃ��т�H�ׂ������̂�";
	mes "��������������c�c�B";
	next;
	mes "[�q�ǂ�]";
	mes "���ꂳ��A���͑��v����B";
	next;
	mes "[�ꂳ��]";
	mes "�������������䖝���悤�ˁH";
	mes "�����񂪐H�ו���";
	mes "�T���Ă��Ă�����B";
	close;
}

harboro2.gat,120,265,3	script	���ꂿ���#srdg01	945,{
	mes "[���ꂿ���]";
	mes "��H�@�N���H";
	mes "�`���[���[�Ȃ̂��H";
	next;
	mes "[���k�����]";
	mes "�`���[���[����������킯";
	mes "�Ȃ��ł��傤�H";
	mes "���̎q�͂��̊C�̌�������";
	mes "�Z��ł���񂾂���B";
	next;
	mes "[���ꂿ���]";
	mes "���������������H";
	mes "���������������Ȃ�ς�����ȁB";
	next;
	mes "[���k�����]";
	mes "����Ȃ킯�Ȃ��ł��傤�H";
	mes "�����𖄂߂����̂܂܂���Ȃ��B";
	next;
	mes "[���ꂿ���]";
	mes "���������������H";
	mes "�̂̂��Ƃ��v���o���x��";
	mes "�~��Ă͗��Ă��邪�A";
	mes "�ǂ����Ă����͐��Z����";
	mes "�Ȃ��Ă��܂����񂾁H";
	next;
	mes "[���k�����]";
	mes "���Z���ɂȂ��������𖄂߂�";
	mes "��ɍs�����̂��o���ĂȂ��́H";
	mes "�����Y�ꂿ������́H";
	mes "�C�����Ⴂ���炱���ɉƂ�";
	mes "���Ă��Ⴂ���Ȃ���";
	mes "����قǌ����Ă��������ɁB";
	next;
	mes "[���ꂿ���]";
	mes "����Ȃ��ƌ����Ă����H";
	close;
}

harboro2.gat,118,264,5	script	���k�����#srdg01	863,{
	mes "[���k�����]";
	mes "�����͖{���ɕς��Ȃ��ˁB";
	next;
	mes "[���ꂿ���]";
	mes "�����ɏ��߂ė������̂��Ƃ�";
	mes "�o���Ă��邩�H";
	next;
	mes "[���k�����]";
	mes "�������A�o���Ă���B";
	next;
	mes "[���ꂿ���]";
	mes "���̉Ƃ͎������̎�Ō��Ă��񂾁B";
	mes "�ꂩ�炷�ׂāB�S�����̎�ŁB";
	next;
	mes "[���k�����]";
	mes "������ꂽ�ł��傤�H";
	mes "��ɖ߂�܂��傤�B";
	next;
	mes "[���ꂿ���]";
	mes "���̈������N�������^�C���c�c�B";
	mes "�����ŃN�������^�C����";
	mes "������\�����񂾂̂Ɂc�c�B";
	next;
	mes "[���k�����]";
	mes "���͂����ɂ���ł���B";
	next;
	mes "[���ꂿ���]";
	mes "���̃N�������^�C����";
	mes "����Ȃ񂶂�Ȃ��I";
	next;
	mes "[���k�����]";
	mes "�Ȃɂ�I�@���̃N�\��I";
	close;
}

//============================================================
// �L�������� 01 NPC
//------------------------------------------------------------
rockrdg1.gat,285,96,3	script	�ɂ݂���h#rockc01	10219,{
	mes "[�ɂ݂���h]";
	mes "���Q�Ɛ���Ă����ٖM�l��";
	mes "���ǂ͉Ƃ𖾂��n�����炵���B";
	mes "���̂܂܋A��Ǝv���Ă������A";
	mes "�ȑO�̉Ƃ̏�ɓy��ςݏグ��";
	mes "�Z�ݎn�߂��B";
	mes "�܂�ŎG���̂悤��痂����B";
	close;
}

rockrdg1.gat,331,111,3	script	�t�A�j�^�X#rockc02	10222,5,5,{
	mes "[�t�A�j�^�X]";
	mes "���̓R���[�e��肪";
	mes "��ԏ�肢�`���҂��I";
	mes "100�C�߂܂���񂾁I";
	next;
	mes "[�f�����T�\��]";
	mes "��A���͖`���҂̑������I";
	mes "���̓R���[�e��1�c�c1�c�c";
	mes "101�C��߂܂���񂾁I";
	next;
	mes "[�����z�Ȏ�]";
	mes "���O�����I";
	mes "�`���҂������͂���Ȃ���";
	mes "�������ł��傤�I";
	mes "���̐l�����͗V��ł���񂶂�";
	mes "�Ȃ��񂾂�I";
	close;
OnTouch:
	donpcevent "�J�����^�X#rockc04::OnTalk";
	donpcevent "�t�A�j�^�X#rockc02::OnTalk";
	donpcevent "�f�����T�\��#rockc03::OnTalk";
	donpcevent "�����z�Ȏ�#rockc05::OnTalk";
	end;
OnTalk:
	unittalk "�t�A�j�^�X : ���ꂶ�ᎄ��200�C�I";
	end;
}

rockrdg1.gat,327,109,5	script	�f�����T�\��#rockc03	10226,{
	mes "[�f�����T�\��]";
	mes "���������`���җl�݂�����";
	mes "�R���[�e��߂܂������̂ɁB";
	next;
	mes "[�J�����^�X]";
	mes "�����̒�����l���݂�ȂŐ������";
	mes "�R���[�e��ǂ�������͂��Ȃ̂ɁI";
	next;
	mes "[�����z�Ȏ�]";
	mes "�������͂���Ȃ��Ƃ�";
	mes "�]��ł���킯�ł͂Ȃ��񂾂�B";
	mes "�L���������Ŏ�������";
	mes "�R���[�e�ƈꏏ�ɐ����Ă��s���񂾁B";
	next;
	mes "[�����z�Ȏ�]";
	mes "�����R���[�e�������������";
	mes "�������ɊQ���y�Ԃ���A";
	mes "�����h�����߂�";
	mes "�`���҂����ɏ�����v�������̂��B";
	mes "�R���[�e��łڂ������킯�ł͂Ȃ��B";
	close;
OnTalk:
	unittalk "�f�����T�\�� : ���̓R���[�e�����`���҂��I";
	end;
}

rockrdg1.gat,328,112,5	script	�J�����^�X#rockc04	10226,{
	mes "[�J�����^�X]";
	mes "�����̂��ꂳ��͖`���҂�������";
	mes "�������悭��������́I";
	mes "�����玄�������I";
	next;
	mes "[�����z�Ȏ�]";
	mes "�J�����^�X�A�N�̕ꂳ�񂪗V�т�";
	mes "��������̂��������Ƃ�����́H";
	next;
	mes "[�J�����^�X]";
	mes "���c�c���[��c�c�B";
	mes "������B";
	mes "�������є�Ɠ��𓾂邽�߂�";
	mes "����������Č����Ă��܂����B";
	next;
	mes "[�����z�Ȏ�]";
	mes "���R�������邱�Ƃ�V�тɂ��Ă�";
	mes "��΂ɑʖڂ���B";
	mes "�`���҂����Ē��̐l�����邽�߂�";
	mes "�������Ă���񂾂�B";
	next;
	mes "[�����z�Ȏ�]";
	mes "�N������𗝉��ł���悤�ɂȂ�����";
	mes "�N�̂��ꂳ���";
	mes "���������Ă����Ǝv����B";
	close;
OnTalk:
	unittalk "�J�����^�X : �l�͖`���҂̑������I�@�R���[�e��100�C�߂܂��Ă��I";
	end;
}

rockrdg1.gat,330,104,3	script	�����z�Ȏ�#rockc05	10218,{
	mes "[�����z�Ȏ�]";
	mes "�ŋ߃R���[�e�������P�����邱�Ƃ�";
	mes "�����ė����̂ŁA";
	mes "�`���҂ɓ��������肢���Ă��܂��B";
	next;
	mes "[�����z�Ȏ�]";
	mes "����������q�ǂ�������";
	mes "�}�l���ėV�Ԃ̂��S�z�ł��B";
	mes "�����ɂ��킹�āA��l������";
	mes "�����������Ă����̂�";
	mes "�������̂������B";
	next;
	mes "[�����z�Ȏ�]";
	mes "�`���҂���������p��";
	mes "�y�������Ɍ�����̂͂��傤���Ȃ��B";
	mes "�����L���N�^�[���͌����ėV�т�";
	mes "���͂��Ȃ��B";
	mes "�ŋ߂ł͂��̓_���q�ǂ�������";
	mes "�����邱�Ƃ��傫�ȏh�肾�ȁB";
	close;
OnTalk:
	unittalk "�����z�Ȏ� : ���O�����I�@�`���҂������͂���Ȃƌ������ł��傤�I";
	end;
}

rockrdg1.gat,310,48,3	script	�G���N�^�[#rockc06	10222,{
	mes "[�G���N�^�[]";
	mes "�G���N�^�[�͂ł��ˁA";
	mes "�傫���Ȃ��Ē��ň�Ԋ���";
	mes "�Ԃ����E�l�ɂȂ�܂��I";
	next;
	emotion 9,"�G���N�^�[#rockc06";
	mes "[�G���N�^�[]";
	mes "���c�c�ł���Ԋ��ȖԂ�҂ނ̂�";
	mes "���k����Ȃ񂾁c�c�B";
	next;
	emotion 2,"�G���N�^�[#rockc06";
	mes "[�G���N�^�[]";
	mes "���Ⴀ�G���N�^�[�͂ł��ˁA";
	mes "�傫���Ȃ��Ē��œ�ԖڂɊ���";
	mes "�Ԃ����E�l�ɂȂ�܂��I";
	close;
}

rockrdg1.gat,299,82,3	script	�^���A�e��#rockc07	10222,{
	mes "[�^���A�e��]";
	mes "���͗����ƂĂ��D���ł��B";
	mes "���[���~�b�h�K�b�c�嗤��";
	mes "���̎��ӂ̓s�s�Ȃǂ𗷂���̂�";
	mes "���̊y���݂ł��B";
	next;
	mes "[�^���A�e��]";
	mes "�V�����ꏊ�ɍs���Ȃ�";
	mes "���ł��劽�}�ł��B";
	mes "���̒n�̏Z�������Ƙb���A";
	mes "�����ɐ����Ă���p�����Ă����";
	mes "�C���X�s���[�V������";
	mes "���邱�Ƃ��ł��܂��B";
	next;
	unittalk "�^���A�e�� : ������ƁI�@�^�l�X�J�I�@����͒@������_���I�I";
	mes "[�^�l�X�J]";
	mes "�V�����y����劽�}�I";
	close;
}

rockrdg1.gat,297,84,7	script	�^�l�X�J#rockc08	549,{
	mes "[�^�l�X�J]";
	mes "���̊y��͂���P�̂ł�";
	mes "�f���炵���H�|�i�ł��B";
	mes "���Ȋv�̎d�グ�A";
	mes "�������قǂ̃o�����X��";
	mes "�L�x�ȉ�����鋤���ʁc�c�B";
	next;
	emotion 3,"�^�l�X�J#rockc08";
	mes "[�^�l�X�J]";
	mes "�����A�������ɒ@���Ă݂����I";
	mes "���̉��𕷂��Ă݂����ł��I";
	next;
	mes "[�^���A�e��]";
	mes "���킠�A�^�l�X�J�I";
	mes "����G���Ă͂����܂���I";
	mes "���̑O�����������Ⴀ��܂��񂩁I";
	close;
}

rockrdg1.gat,308,49,5	script	�_�炩���H��#rockc09	10228,{
	mes "[�_�炩���H��]";
	mes "�ققفc�c";
	mes "���̒��̋��Ԃɂ�";
	mes "���ׂĎ�����������Ă���́B";
	mes "���̎q�������ǂ��Ԃ�����悤��";
	mes "�Ȃ������ǁA�Ō�̎d�グ��";
	mes "�K����������Ă���񂾂�B";
	next;
	mes "[�G���N�^�[]";
	mes "�����I�@������肽���ł��I";
	mes "���k����݂�����";
	mes "�f���炵���Ԃ����d����";
	mes "�������ł��I";
	next;
	mes "[�_�炩���H��]";
	mes "�q�ǂ��͈ꏊ�����V�Ԃ��Ƃ�";
	mes "�d���Ȃ񂾂�B";
	mes "���̏_�炩���肪�d���Ȃ�����A";
	mes "���̎�����ł�����A�Ԃ�G��̂́B";
	next;
	mes "[�_�炩���H��]";
	mes "���̎��ɂȂ����炨�k�����";
	mes "�G���N�^�[�ɖԂ������@��";
	mes "�����Ă����邩��ˁB";
	mes "�����獡�͂��̑����g���āA";
	mes "�Y��Ȍ��іڂ̂��������";
	mes "�����������Ă�����B";
	next;
	mes "[�G���N�^�[]";
	mes "��[���I�@�F�B�Ɏ������悤�`�I";
	close;
}

rockrdg1.gat,287,95,3	script	���e�B�X#rockc10	10227,{
	mes "[���e�B�X]";
	mes "���ꂳ��̌����������Ƃ�";
	mes "�����͏o���܂��B���̐S���B";
	next;
	mes "[���e�B�X]";
	mes "�����Ǎ�����ꂽ����";
	mes "��������鐅��";
	mes "�����ł͂Ȃ��悤�ɁA";
	mes "�ω���������̂�";
	mes "��͂莩�R�Ȃ��ƂȂ̂ł��B";
	close;
}

rockrdg1.gat,297,111,3	script	���C�^�l��#rockc10	727,{
	mes "[���C�^�l��]";
	mes "����A�܂��L���N�^�[���̒����B";
	mes "�܂����ɖ������݂����c�c�B";
	next;
	emotion 28,"���C�^�l��#rockc10";
	mes "[���C�^�l��]";
	mes "�L���������͂��܂�ɍL��������";
	mes "�ǂ����n�`�����Ă��邩��A";
	mes "������Ƃł��悻���������";
	mes "���`���N�`�������Ă��܂��B";
	next;
	mes "[���C�^�l��]";
	mes "���Ƃǂꂾ���f�r���΂����񂾁c�c�B";
	mes "������ŗ₽�����̈�t�ł�";
	mes "���߂��Ȃ�c�c�B";
	close;
}

//============================================================
// ���b�N���b�W
//- Registry -------------------------------------------------------------------
// ROCKRIDGE_1QUE -> 0�`17
//------------------------------------------------------------
alberta.gat,240,103,5	script	�J�����v�b�`#alberta	709,3,3,{
	if(ROCKRIDGE_1QUE == 0) {
		mes "[�J�����v�b�`]";
		mes "�����̖`���҂���B";
		mes "��X�s���N���[�Y�Ђ���������";
		mes "�V�嗤�̉\�𕷂������Ƃ͂��邩���H";
		mes "�f�Ղׂ̈̍q�C����";
		mes "���R�������ꂽ�嗤�Ȃ񂾁B";
		next;
		if(BaseLevel < 70) {
			mes "[�J�����v�b�`]";
			mes "�����̑嗤�ŏ��X��肪�N���Ă���";
			mes "�x�e�����̖`���҂�T���Ă���񂾁B";
			mes "����^ff0000BaseLv70�ȏ�^000000�̒m�荇����������";
			mes "���̘b��`���Ă���Ȃ����B";
			close;
		}
		mes "[�J�����v�b�`]";
		mes "���̑嗤��";
		mes "^4d4dff���b�N���b�W^000000�Ɩ��t�����A";
		mes "�ꝺ�����_���đ����̐l��";
		mes "�����񂹂Ă��関�J�̒n�Ȃ񂾁I";
		next;
		menu "�`���҂��K�v�Ȃ�ł����H",-;
		mes "[�J�����v�b�`]";
		mes "���́c�c";
		mes "���̃��b�N���b�W�ɍ��ׂȖ�肪";
		mes "�N���Ă�񂾁B";
		mes "�{���ɍ��ׂȖ��Ȃ񂾂��ǁA";
		mes "��ʐl�ɂ͑Ώ�������炵���B";
		next;
		mes "[�J�����v�b�`]";
		mes "���b�N���b�W�͍z�R����z�΂�";
		mes "�̌@���邱�ƂŎ��v���グ�Ă���";
		mes "��������A�啔�����z�R�̘J���҂�";
		mes "���l�ō\������Ă���񂾁B";
		next;
		mes "[�J�����v�b�`]";
		mes "�����A^4d4dff�z�R��_�������c^000000��";
		mes "�ŋߖ҈Ђ�U����Ă���炵���āc�c";
		next;
		menu "�����̈˗��ł����H",-;
		mes "[�J�����v�b�`]";
		mes "����A�����������ɂȂ邩�ȁB";
		mes "�ڂ����b�̓��b�N���b�W�s����";
		mes "^4d4dff�R�X�e��^000000����ɕ����Ă���B";
		mes "���͖`���҂��ē����Ăق�����";
		mes "���܂�Ă��邾���ŁA";
		mes "�ڂ����b�͂킩��Ȃ��񂾁B";
		next;
		if(select("�킩��܂���","�������܂�") == 2) {
			mes "[�J�����v�b�`]";
			mes "�������ȁc�c";
			mes "���ꂶ�ᑼ�̖`���҂�";
			mes "�T�������Ȃ����B";
			mes "�b�𕷂��Ă���Ă��肪�Ƃ��B";
			close;
		}
		mes "[�J�����v�b�`]";
		mes "���ꂶ�Ⴭ�b�N���b�W�ֈē����悤�B";
		mes "�{���Ȃ�q�C�̗����������������A";
		mes "����͖����ő����Ă����悤�B";
		mes "�����A�o�����B";
		close2;
		setquest 7791;
		set ROCKRIDGE_1QUE,1;
		warp "harboro1.gat",70,215;
		end;
	}
	mes "[�J�����v�b�`]";
	mes "�₠�A�����������̂��B";
	mes "�ǂ����H";
	mes "��D�̃��b�N���b�W���a����";
	mes "�v��Ȃ����H";
	mes "�D���^4d4dff10,000zeny^000000���B";
	next;
	if(select("���b�N���b�W�֏o���I","�������A�����v���܂���") == 2) {
		mes "[�J�����v�b�`]";
		mes "�킩�����B";
		mes "�܂��p�����鎞�ɗ��ȁB";
		close;
	}
	if(Zeny < 10000) {
		// ������
		mes "[�J�����v�b�`]";
		mes "���������ĂȂ����B";
		close;
	}
	mes "[�J�����v�b�`]";
	mes "�D���痎���Ȃ��悤";
	mes "�肷��ɂ�������";
	mes "�͂܂��Ă�����I";
	close2;
	set Zeny,Zeny-10000;
	warp "harboro1.gat",70,215;
	end;
OnTouch:
	if(ROCKRIDGE_1QUE == 0 && BaseLevel >= 70)
		unittalk "�J�����v�b�` : ���A�����̑O�r�L�]�Ȗ`���҂���I�@������Ǝ��̘b�𕷂��Ă���Ȃ����H",1;
	end;
}

harboro1.gat,60,215,5	script	�J�����v�b�`#harboro1	709,{
	mes "[�J�����v�b�`]";
	mes "�A���x���^�ɖ߂邩�H";
	next;
	if(select("�߂�","�߂�܂���") == 2) {
		mes "[�J�����v�b�`]";
		mes "�������؍݂��Ă����Ȃ�A";
		mes "���͊�������I";
		mes "��Ђ������]��ł��邾�낤���B";
		close;
	}
	mes "[�J�����v�b�`]";
	mes "���ꂶ��s�������I";
	close2;
	warp "alberta.gat",240,96;
	end;
}

harboro1.gat,80,218,5	script	�R�X�e��#harboro1	10210,{
	switch(ROCKRIDGE_1QUE) {
	case 0:
		unittalk "�R�X�e�� : �������Ȃ��c�c�B�����ƃA���x���^�Ŗ`���҂������邩�ȁc�c�B",1;
		end;
	case 1:
		mes "[�R�X�e��]";
		mes "����I";
		mes "�т����肵���I";
		next;
		mes "[�R�X�e��]";
		mes "���A�����ł��B";
		mes "�����������b�N���b�W��";
		mes "�s���R�X�e���ł��B";
		mes "�c�c���̎���m���Ă���Ƃ́A";
		mes "�܂����c�c�B";
		next;
		menu "�J�����v�b�`����̏Љ�Łc�c",-;
		mes "[�R�X�e��]";
		mes "�����I�@�����Ȃ�ł��ˁI";
		mes "��𒷂����đ҂��Ă��܂����B";
		mes "�J�����v�b�`����";
		mes "�ǂ��܂Řb�𕷂��܂������H";
		next;
		mes "[�R�X�e��]";
		mes "�Ȃ�قǁc�c";
		mes "�����c�̘b�܂ł͕�������ł��ˁB";
		next;
		mes "[�R�X�e��]";
		mes "���Ă̒ʂ�A���̃��b�N���b�W��";
		mes "�����Ȃ��r�삩����グ�����ł��B";
		mes "������O�ł����A�J�񖯂̑唼��";
		mes "�~�b�h�K���h�嗤����n���ė����l��";
		mes "�\������Ă��܂��B";
		next;
		mes "[�R�X�e��]";
		mes "������񌴏Z�������݂��܂��B";
		mes "�߂��ɂ̓T�{�e���̎p�����Ă���";
		mes "^4d4dff�L���N�^�[��^000000�̒�������܂��B";
		next;
		mes "[�R�X�e��]";
		mes "�L���N�^�[���̋��͂�����A";
		mes "���b�N���b�W�𑢂鎖���o���܂����B";
		mes "�ނ�Ƃ͂ƂĂ��F�D�I�Ȋ֌W��";
		mes "����ł��܂��B";
		next;
		mes "[�R�X�e��]";
		mes "�����ЂƂA���̎p�����Ă���";
		mes "^4d4dff�^�E���X��^000000�����܂��B";
		mes "�^�E���X���͂ƂĂ��D��I�ŁA";
		mes "�����c���������ăL���N�^�[���̒���";
		mes "���b�N���b�W���痪�D��";
		mes "�J��Ԃ��Ă��܂��B";
		next;
		mes "[�R�X�e��]";
		mes "���񂨊肢�������̂�";
		mes "���̓����c�̂��ƂȂ̂ł��B";
		mes "�����̐l������^4d4dff�����c^000000��";
		mes "�Ă�ł��܂����c�c�B";
		next;
		mes "[�R�X�e��]";
		mes "���̋����c�̗��D�����ɓ���";
		mes "�����Ȃ��Ă��܂��B";
		mes "���x�c�ƕۈ��������ł�";
		mes "�Ώ�������Ȃ��󋵂ɂȂ�܂����B";
		next;
		mes "[�R�X�e��]";
		mes "�����Ŗ{�Ђ���";
		mes "�~�b�h�K���h�嗤�̖`���҂��ق���";
		mes "���̎�������������A�Ƃ�";
		mes "�w��������܂����B";
		mes "�����Ă��Ȃ������x�ǂ��^�C�~���O��";
		mes "���Ă��ꂽ�ƁB";
		next;
		mes "[�R�X�e��]";
		mes "�ŋ߂ł͋����c�ɍ̌@�����z�΂��^��";
		mes "^4d4dff�ݕ���Ԃ܂ŗ��D^000000����Ă��܂��B";
		mes "����ɂ͍z�R�܂ł�";
		mes "�苒����Ă��܂��܂����B";
		mes "����Ȃ̂ɖ{�Ђ͗��v���o����";
		mes "�}�����΂���c�c�B";
		next;
		mes "[�R�X�e��]";
		mes "�z�R��苒���ꂽ�����ŁA";
		mes "�ꝺ����𖲌��ė����l������";
		mes "�d���������A���͎��Ǝ҂�";
		mes "���Ă��܂��܂����B";
		next;
		mes "[�R�X�e��]";
		mes "���c�c";
		mes "�d�����Ȃ����Ƃɂ��Ă�";
		mes "�閧�ɂ��Ă��������B";
		mes "���������΂���̐l��";
		mes "�o�čs���Ă��܂�����";
		mes "����܂�����c�c�B";
		next;
		mes "[�R�X�e��]";
		mes "�Ƃɂ����A���Ȃ��ɂ͋����c��";
		mes "�Ȃ�Ƃ����Ă������������̂ł��B";
		next;
		mes "[�R�X�e��]";
		mes "�ۈ����̂Ƃ���ɍs���A";
		mes "�����c�̌��ŋ��͂��ɗ����ƌ����΁A";
		mes "���ׂ����������Ă����͂��ł��B";
		mes "�ǂ����������̉�Ёc�c";
		mes "�����A���b�N���b�W�ׂ̈�";
		mes "�͂�݂��ĉ������B";
		next;
		mes "[�R�X�e��]";
		mes "���̑傫�����ɉ����ē��̕���";
		mes "�܂������s���ƁA";
		mes "�ۈ���������������͂��ł��B";
		mes "�����̈ē�����";
		mes "�����Ă݂Ă������ł��B";
		next;
		mes "[�R�X�e��]";
		mes "�ۈ����������ɂ���̂�";
		mes "���̗B��̕ۈ�����";
		mes "^4d4dff�A�C�A�b�g�E���[�v^000000�ł��B";
		mes "����ďڂ����b�𕷂��Ă��������B";
		mes "�ǂ�����낵�����肢���܂��B";
		viewpoint 1,241,218,1,0x00FF00;
		delquest 7791;
		setquest 7792;
		set ROCKRIDGE_1QUE,2;
		close;
	case 2:
		mes "[�R�X�e��]";
		mes "���̑傫�����ɉ����ē��̕���";
		mes "�܂������s���ƁA";
		mes "�ۈ���������������͂��ł��B";
		mes "^4d4dff�A�C�A�b�g�E���[�v^000000��";
		mes "���̗B��̕ۈ����Ȃ̂�";
		mes "�ڂ����b�𕷂��Ă��������B";
		viewpoint 1,241,218,1,0x00FF00;
		close;
	case 3:
		mes "[�R�X�e��]";
		mes "�ǂ����Ă���Ȕߑs�Ȋ��";
		mes "���Ă����ł����H";
		mes "�����c�Ɖ�����������ł����H";
		mes "���H�@�z��ƌ��H";
		next;
		menu "�R�X�e������ƈ��������ɍz�΂����߂��悤�ł�",-;
		mes "[�R�X�e��]";
		mes "���������Ă����ł����H";
		mes "����Ȃ��Ƃ����蓾���";
		mes "�v���Ă��܂����H";
		mes "�����炢�悢�擪��";
		mes "���������Ȃ�n�߂܂����ˁI";
		next;
		mes "[�R�X�e��]";
		mes "���������������̖��ɗ����܂���!?";
		mes "��k�ł���ˁH";
		mes "��k���ƌ����ĉ������I";
		next;
		mes "[�R�X�e��]";
		mes "���̐Ȃɂ͎��ƃA�C�A�b�g��";
		mes "��l�����ŗ���悤�ɁH";
		next;
		mes "[�R�X�e��]";
		mes "�����c�c�A�C�A�b�g�ɂ͈����ł����A";
		mes "���͎��̒���D��������";
		mes "���b�N���b�W�𗣂�邱�Ƃɂ��܂��I";
		next;
		unittalk getcharid(3),strcharinfo(0)+" : �c�c",1;
		mes "[�R�X�e��]";
		mes "����Ȋ�Ō��Ȃ��ł��������B";
		mes "��Ђ̗��v�͂������d�v�����ǁA";
		mes "������厖�ȕ��͎��̖��Ȃ�ł��I";
		next;
		menu "��k�ł���",-;
		mes "[�R�X�e��]";
		mes "��k�H";
		mes "�c�c���ꂶ����̘b�́H";
		mes "�������k�ł����H";
		next;
		mes "[�R�X�e��]";
		mes "���c�c���͂����ł��ˁB";
		next;
		mes "[�R�X�e��]";
		mes "�c�c�ł͂��Ȃ���";
		mes "�{�Ђ���h������Ă����ӔC�҂���";
		mes "�����āA���̑���ɏo�Ă�����";
		mes "�ǂ��񂶂�Ȃ��ł����H";
		next;
		mes "[�R�X�e��]";
		mes "�܂��͗v�����e�𕷂������Ɠ`����";
		mes "���e���m���߂Ă��������B";
		next;
		mes "[�R�X�e��]";
		mes "�{�ЂɊm�F���Ȃ��ƌ���o���Ȃ�";
		mes "�ƌ����΂�����x��";
		mes "�҂��Ă����Ǝv���܂��B";
		mes "����c�c���ꂩ��c�c�B";
		next;
		unittalk getcharid(3),strcharinfo(0)+" : �c�c",1;
		mes "[�R�X�e��]";
		mes "�܂�����Ȋ�����āc�c�B";
		mes "�Ƃɂ����A�A�C�A�b�g�ƈꏏ��";
		mes "���̏�ɍs���ė��ĉ������B";
		mes "���͂����ɉB��Ă��܂�����c�c�B";
		next;
		mes "�]�R�X�e���͂ǂ����s��������";
		mes "�@���ӂ����񂵂Ă���B";
		mes "�@�Ƃ肠�����R�X�e���̈ӌ���";
		mes "�@�A�C�A�b�g�ɓ`���悤�]";
		viewpoint 1,241,218,1,0x00FF00;
		delquest 7793;
		setquest 7794;
		set ROCKRIDGE_1QUE,4;
		close;
	case 4:
	case 5:
		mes "[�R�X�e��]";
		mes "�܂��͗v���𕷂������Ɠ`���A";
		mes "���e�𒲂ׂė��ĉ������B";
		next;
		mes "[�R�X�e��]";
		mes "�{�ЂɊm�F���Ȃ��ƌ���o���Ȃ�";
		mes "�ƌ����΂�����x��";
		mes "�҂��Ă����Ǝv���܂��B";
		mes "�Ƃɂ����A�A�C�A�b�g�Ƃӂ����";
		mes "���̏�ɍs���ė��ĉ������B";
		mes "���͂����ɉB��Ă��܂�����c�c�B";
		close;
	case 6:
		mes "[�R�X�e��]";
		mes "�����c�̃{�X�A";
		mes "�W���j�[�E�W�F�C���X��";
		mes "�߂܂����炵���ł��ˁH";
		mes "�������Ɍ��̎�D��";
		mes "�o�����ƌ������Ƃł��ˁH";
		next;
		mes "[�R�X�e��]";
		mes "����A�ނ���z�΂̏ꏊ��";
		mes "�����o���΁A";
		mes "����������K�v���Ȃ������I";
		mes "�A�C�A�b�g��";
		mes "���܂�����Ă����ƐM���Ă��܂��B";
		close;
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[�R�X�e��]";
		mes "����100��zeny�o���Ă��̍z�΂�";
		mes "�������������Ă̓_���ł����ˁH";
		mes "��������Ίy�ɂȂ�̂ł́H";
		next;
		menu "��������܂����H",-;
		mes "[�R�X�e��]";
		mes "���c�c�����A���͂���܂���B";
		mes "�����ǂ��Ȃ��͎����Ă���̂ł́H";
		mes "���`�������������i��";
		mes "�����ƍl����΁c�c�B";
		next;
		mes "[�R�X�e��]";
		mes "�����܂���A���̌��͍Ђ��̌��ł��B";
		mes "���Ȃ��ƃA�C�A�b�g��";
		mes "��������������܂�";
		mes "���͐Â��ɂ����ł����Ƃ��Ă��܂��B";
		mes "�{���ł�����B";
		close;
	case 14:
	case 15:
		mes "[�R�X�e��]";
		mes "�d���͂ǂ�Ȋ����ł����H";
		mes "�A�C�A�b�g��";
		mes "�u�j���b�v�Ə΂�������";
		mes "���������Ă���Ȃ���ł��B";
		next;
		mes "[�R�X�e��]";
		mes "���ꂩ��A���Ȃ��������s�����Ƃ���";
		mes "�\���ǂ�ǂ�L�܂��Ă����ł����A";
		mes "�������������N���Ă��ł����H";
		next;
		menu "�閧�ł�",-;
		mes "[�R�X�e��]";
		mes "�閧���݂����Ȃ��̂ł����H";
		mes "���̑O�̌��̎���";
		mes "�U���݂����Ȃ��̂ł����H";
		next;
		mes "[�R�X�e��]";
		mes "���Ȃ����{���Ɏs���ɂȂ�Ȃ��Ȃ�";
		mes "����ł�����ł��B";
		mes "�Ƃɂ������͑҂��Ă����";
		mes "������ł��ˁB";
		close;
	case 16:
	case 17:
		mes "[�R�X�e��]";
		mes "���b�N���b�W�s���Ƃ��āA";
		mes "�܂��s���N���[�Y�ЂƂ���";
		mes "���Ȃ��ɂ͊��ӂ��Ă��܂��B";
		mes "�{���ɁA�S�ꊴ�ӂ��Ă���̂Ɂc�c";
		mes "�ǂ����Č��t���o�Ȃ���ł��傤�B";
		next;
		mes "[�R�X�e��]";
		mes "�Ƃ���ŋ����c�̑|����킪";
		mes "�n�܂�݂����ł��ˁB";
		mes "��͂��Ȃ��̂Ŏ��͈�������";
		mes "���̋߂��ɂ��邱�Ƃɂ��܂��B";
		next;
		mes "[�R�X�e��]";
		mes "�`���҂����������ƌĂ΂Ȃ���";
		mes "�����Ȃ����������c�c�B";
		mes "�����c�c�Z�����B�Z�����Ȃ肽���B";
		close;
	}
	end;
}

har_in01.gat,20,30,5	script	�A�C�A�b�g�E���[�v#har_	10211,{
	switch(ROCKRIDGE_1QUE) {
	case 0:
	case 1:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�V�����J�񖯂��H";
		mes "�{���ɐ₦�ԂȂ�";
		mes "�����񂹂ė�����񂾂ȁB";
		mes "�����A�����ɌN�̎d���͂Ȃ����B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�d����T���ɗ����Ȃ�";
		mes "�O�ŒT���Ȃ����B";
		mes "�s�����N���z�R�̍�ƈ��Ƃ���";
		mes "�ٗp���Ă���邩������Ȃ����낤�H";
		close2;
		cutin "rock_worp",255;
		end;
	case 2:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���̗p���H";
		mes "���͂��Ȃ荢�����m�点������";
		mes "�C���C�����Ă���񂾁B";
		mes "�ז������Ȃ��łق����B";
		next;
		menu "�����c�ɂ���",-;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�܂����R�X�e�����H";
		mes "�����c������������ׂ�";
		mes "�{�Ђ���w������������";
		mes "�����Ă������ǁA";
		mes "�`���҂��ٗp�����̂��H";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "����A��������ȏd�v�Șb�Ȃ̂�";
		mes "���̎s���̃R�X�e���͉��̗��Ȃ��H";
		mes "�����A�������B";
		mes "���ł���������悤��";
		mes "�`�ɍs���Ă���񂾂�A�����B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���͂͂͂͂��I";
		mes "�܂�����������";
		mes "���d�Ȋ��҂����Ă����ȁB";
		mes "�`���҂𑗂��Ă��ꂽ����A";
		mes "��������͎��̓ƒf��";
		mes "�i�߂�Ƃ��邩�B";
		next;
		menu "���̂��Ƃł����H",-;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�ݕ���Ԃ��P�����󂯂�";
		mes "���̒��ɂ������z�΂�";
		mes "���ׂė��D���ꂽ�b�͕��������H";
		mes "�������A���Ⴀ�z�R���苒���ꂽ�b��";
		mes "�����Ă���ȁH";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�{�Ђ��ł��Ă��鎖��";
		mes "�������Ă���B";
		mes "�z�R�ō̌@�����^4d4dff���z��^000000��";
		mes "���Ȃ荂�����l�������Ă���";
		mes "��Ђ̎�͏��i����";
		mes "���������Ƃ�����B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���������̍z�΂��@���Ĕ��邽�߂�";
		mes "���̒����o�������Ƃ�";
		mes "���ׂĂ�����Ă���B";
		mes "�����Ă���������c�̓z�炪";
		mes "���D���Ă���������";
		mes "�������󋵂ɂȂ��Ă���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����������莆����ʓ͂����B";
		mes "������D���ꂽ�z�΂�";
		mes "��������悤�Ƃ��������e���B";
		mes "����v���������Ȃ̂���";
		mes "�܂��킩��Ȃ��B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�������̓{�X��^4d4dff�W���j�[�E�W�F�C���X^000000";
		mes "�Ƃ��̂��������ŗ��邩��A";
		mes "�����������Ƃ�����l�A";
		mes "�����ł�����";
		mes "�A��čs�������񂾂��c�c�B";
		mes "��͂�R�X�e�����s���ׂ�����ȁH";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���邢�͌N���{�Ђ���h�����ꂽ";
		mes "���l���Ƃ������Ƃɂ��āA";
		mes "���ɂ��Ă��Ă���邩�H";
		next;
		menu "�R�X�e������ɕ����Ă݂܂�",-;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�ł͌N�����̘b��";
		mes "�����ė��Ă���邩�H";
		mes "������͌��ɔ�����";
		mes "��ɏ��������Ă����B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�R�X�e���͂����̂悤��";
		mes "�`�ɂ��邾�낤�B";
		mes "�܂��c�c�R�X�e�������ƌ�����";
		mes "�\�z�͏o���邪�A�ꉞ�񍐂�";
		mes "���Ă����Ȃ��ƂȁB���͂͂͂͂��I";
		delquest 7792;
		setquest 7793;
		set ROCKRIDGE_1QUE,3;
		close2;
		cutin "rock_worp",255;
		end;
	case 3:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�R�X�e���͂����̂悤��";
		mes "�`�ɂ��邾�낤�B";
		mes "�܂��c�c�R�X�e�������ƌ�����";
		mes "�\�z�͏o���邪�A�ꉞ�񍐂�";
		mes "���Ă����Ȃ��ƂȁB���͂͂͂͂��I";
		close2;
		cutin "rock_worp",255;
		end;
	case 4:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���A���x�ǂ��^�C�~���O���ȁB";
		mes "������̏����͏I������B";
		mes "�N�Ǝ��̓�l�ōs���΂������ȁH";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�ȂɁH�@�R�X�e���H";
		mes "�������s������";
		mes "�����킯�Ȃ�����B";
		mes "�ŏ�����N���s�����ƂɂȂ��";
		mes "�v���Ă�����B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���낻��w��̎��Ԃ��B";
		mes "���̓��ɂ�^4d4dff�L��������^000000��";
		mes "�L�����Ă���B";
		mes "�����̖k����^4d4dff���͉^�s���Ă��Ȃ�";
		mes "�ݕ����^000000������B";
		mes "���̗�Ԃ̑O�����̏ꏊ���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���ꂶ��A���̋����ȋ����c�̃{�X";
		mes "^4d4dff�W���j�[�E�W�F�C���X^000000�̊��";
		mes "�q�݂ɍs���Ƃ��悤���B";
		delquest 7794;
		setquest 7795;
		set ROCKRIDGE_1QUE,5;
		next;
		cutin "rock_worp",255;
		mes "�]�W���j�[�Ƃ̌���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�W���j�[�Ƃ̌��Ɍ��������]";
		close2;
		warp "rockrdg1_q.gat",157,300;
		end;
	case 5:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���̓��ɂ�^4d4dff�L��������^000000���L�����Ă���B";
		mes "�����̖k����^4d4dff���͉^�s���Ă��Ȃ�";
		mes "�ݕ����^000000������B";
		mes "���̗�Ԃ̑O�����̏ꏊ���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���ꂶ��A���̋����ȋ����c�̃{�X";
		mes "^4d4dff�W���j�[�E�W�F�C���X^000000�̊��";
		mes "�q�݂ɍs���Ƃ��悤���B";
		next;
		cutin "rock_worp",255;
		mes "�]�W���j�[�Ƃ̌���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�W���j�[�Ƃ̌��Ɍ��������]";
		close2;
		warp "rockrdg1_q.gat",157,300;
		end;
	case 6:
		cutin "rock_worp",0;
		unittalk "�c�c�ǂ��v���H",1;
		if(!sleep2(4000)) end;
		cutin "rock_iboka_all",2;
		unittalk getnpcid(0,"�C���H�J#rock01"),"�C���H�J�E�X�N�[�f�B�[ : ���̒���􂢂������ǂ��Ǝv���܂��B",1;
		if(!sleep2(4000)) end;
		cutin "rock_worp",0;
		unittalk "�A�C�A�b�g�E���[�v : ���ʂ̍���⋺���ł͌��ʂ͔������c�c�B",1;
		if(!sleep2(3000)) end;
		cutin "rock_iboka_all",2;
		unittalk getnpcid(0,"�C���H�J#rock01"),"�C���H�J�E�X�N�[�f�B�[ : �W���j�[�����Ȃ��Ȃ����Ƃ��Ă��A���ɑ�������Ȃ���΂Ȃ�Ȃ��̂́c�c",1;
		if(!sleep2(3000)) end;
		cutin "rock_worp",0;
		unittalk "�A�C�A�b�g�E���[�v : �A���o�[�g���낤�ȁB",1;
		if(!sleep2(2000)) end;
		set ROCKRIDGE_1QUE,7;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����ƁA�������B";
		mes "�N�N�N�b�A";
		mes "�����������Ă��������ł�";
		mes "���ɗ��Ƃ́A";
		mes "�N�݂����Ȑl�ނ͂Ȃ��Ȃ����Ȃ��ȁB";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�Ƃ���ŃW���j�[�E�W�F�C���X�̌���";
		mes "�v�����ȏ�Ɍł��B";
		mes "������Ƃ₻���Ƃł�";
		mes "���D�����z�΂̏ꏊ��";
		mes "�����Ă��ꂻ���ɂȂ��B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���ꂩ��A���o�[�g����";
		mes "���̘A�����͂����B";
		mes "���e�͒D�����z�΂�";
		mes "�W���j�[�̌������B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�c�c���͂��Ă�����Ă���N�ɂ�";
		mes "�b���Ă����������ǂ��������ȁB";
		mes "���͉�X�̖ړI��";
		mes "�z�΂����Ԃ����Ƃ���Ȃ��B";
		mes "^0000ff�����c�̑|��^000000���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�D��ꂽ�z�΂����Ԃ��Ă��A";
		mes "����͈ꎞ�I�ȉ����ɉ߂��Ȃ��B";
		mes "�����c�ɒD��ꂽ�z�R��";
		mes "���߂��Ȃ���΁A";
		mes "���̍��{�͉������Ȃ��B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���̂��߂ɂ͂܂������c�̐�͂�";
		mes "�킪�˂΂Ȃ�Ȃ��B";
		mes "�����ł��̃`�����X��";
		mes "�ǂ��g�������Y��ł����񂾁B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�C���H�J�͂��̒���􂱂���";
		mes "�����Ă��邪�c�c�B";
		mes "�ڂ����b�̓C���H�J����";
		mes "���ڕ����Ă���B";
		close2;
		cutin "rock_worp",255;
		end;
	case 7:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�C���H�J�͂��̒���􂱂���";
		mes "�����Ă��邪�c�c�B";
		mes "�ڂ����b�̓C���H�J����";
		mes "���ڕ����Ă���B";
		close2;
		cutin "rock_worp",255;
		end;
	case 8:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "^4d4dff�W���j�[�͒n���ɍS��^000000�����B";
		mes "�܂��̓A���o�[�g���W���j�[��";
		mes "���؂������������]�͂Ȃ��A";
		mes "�Ƃ����������ɒǂ��l�߂āA";
		mes "���܂��������悤�B";
		close2;
		cutin "rock_worp",255;
		end;
	case 9:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�A���o�[�g���Ăяo�����@�܂�";
		mes "�����������̂��H";
		mes "���������ȁI";
		mes "����ŃA���o�[�g���x���̂�";
		mes "�����Ԋy�ɂȂ����ȁB";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�悵�A���̓A���o�[�g���ȁB";
		mes "��肭�A���o�[�g��";
		mes "�W���j�[�����؂�����";
		mes "�M�����܂��Ă���Ă���I";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�������s�������Ƃ��낾���A";
		mes "�O��̌�������B";
		mes "���l�ōs������A���o�[�g��";
		mes "�x�����邾�낤�B";
		mes "���܂񂪌N��l�ōs���Ă��Ăق����B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���ꂩ��A";
		mes "�A���o�[�g�͐T�d�Ȃ���B";
		mes "^ff0000�b�����e�͗ǂ��l���đI��ł���B^000000";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����ƁA�������B";
		mes "���������΂�����^ff0000�z�R�ɂ���";
		mes "�����s���ɏd�v�Șb������^000000����";
		mes "�A���������񂾁B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����̖��O��";
		mes "^4d4dff�V���[���E�}�b�J�[�f�B^000000���B";
		mes "������o��r���ɂ���͂�������A";
		mes "�s���O�ɂ��łɘb�𕷂��Ă݂Ă���B";
		mes "��Ԃ������Ĉ����ȁB";
		delquest 7798;
		setquest 7799;
		set ROCKRIDGE_1QUE,10;
		close2;
		cutin "rock_worp",255;
		end;
	case 10:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�A���o�[�g�̂Ƃ���֍s���O�ɁA";
		mes "^4d4dff�V���[���E�}�b�J�[�f�B^000000��";
		mes "����Ęb�𕷂��Ă݂Ă���B";
		close2;
		cutin "rock_worp",255;
		end;
	case 11:
	case 12:
	case 13:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�Ȃ�قǁA����Șb���������B ";
		mes "�������̐؂�D�������z�R��";
		mes "�������ɗ����Ȃ��A";
		mes "�Ƌ����Ă��̂�";
		mes "���ʓI��������Ȃ��ȁB";
		close2;
		cutin "rock_worp",255;
		end;
	case 14:
		cutin "rock_worp",0;
		if(countitem(25247) > 0) {
			mes "[�A�C�A�b�g�E���[�v]";
			mes "�ӂށA�V���ȍz�R�̉\��";
			mes "�{���������̂��B";
			mes "���̍z�΂͂������ɓn���Ă���B";
			mes "������V���[���ɓn���Ă����B";
			delitem 25247,countitem(25247);
			next;
		}
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�ǂ��������H";
		mes "�A���o�[�g�͏�肭�x�����̂��H";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "��A��Ɏ����Ă���";
		mes "���̖т͉��Ȃ񂾁H";
		mes "�A���o�[�g�̂��Ă��݁H ";
		mes "�܂����A���o�[�g��";
		mes "������܂����̂��H";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "����`�`���҂Ƃ����̂͋��낵���ȁB";
		mes "��H";
		mes "��������Ȃ��H";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�Ȃ�قǁA";
		mes "�W���j�[���x�����߂̍ޗ����I";
		mes "�������A���͂͂͂͂��I";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���ꂶ��A�W���j�[�ɂ�����";
		mes "�������Ă���Ă���B";
		mes "�z�΂̏ꏊ���킩���";
		mes "�����������̂��̂��B";
		close2;
		cutin "rock_worp",255;
		end;
	case 15:
		cutin "rock_worp",0;
		// ������
		if(countitem(25247) > 0) {
			mes "[�A�C�A�b�g�E���[�v]";
			mes "�ӂށA�V���ȍz�R�̉\��";
			mes "�{���������̂��B";
			mes "���̍z�΂͂������ɓn���Ă���B";
			mes "������V���[���ɓn���Ă����B";
			delitem 25247,countitem(25247);
			next;
		}
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�������c�c�z�΂͍z�R�̒����B";
		mes "���Ƃ��ƍz�R��";
		mes "���Ԃ����肾��������ȁB";
		mes "�]�v�Ȏ�Ԃ��Ȃ������B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�悵�A���͂����܂ł��B";
		mes "���ꂩ�狍���c�̑|����";
		mes "�z�R�̒D�҂Ɉڂ�B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����炭����ŋ����c�̃{�X��";
		mes "�A���o�[�g�ɂȂ邾�낤�B";
		mes "�������Ƃ��ƃA���o�[�g��";
		mes "�{�X�̊킶��Ȃ��B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "����ɃW���j�[�ɏ]���Ă���";
		mes "�������܂Ƃ߂�ɂ�";
		mes "�܂��܂����Ԃ������邾�낤�B";
		mes "�����������A���ȂǉG���̏O���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�嗤����`���҂̎󂯓����";
		mes "����Ɋ��������A";
		mes "���̑|����";
		mes "��O����Ƃ��悤�B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����܂ł��Ƃ���肭�i�񂾂̂�";
		mes "�N�̂��������B���b�ɂȂ����ȁB";
		mes "��̎n���͉�X�ɔC���Ă���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�N�͂��̍��̌��J�҂��B";
		mes "�\���ȕ�V���󂯎�錠��������B";
		mes "��X�̒��̂��߂�";
		mes "�s�����Ă��ꂽ�N�ɑ���";
		mes "�v���[���g���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�h���̃��b�N���b�W�o�b�W��";
		mes "���_�̃��b�N���b�W�o�b�W�A";
		mes "�ǂ��炩��I��ł���B";
		while(1) {
			next;
			switch(select("�h���̃��b�N���b�W�o�b�W","���_�̃��b�N���b�W�o�b�W","���\�𕷂�")) {
			case 1:
				set '@gain,28557;
				break;
			case 2:
				set '@gain,28556;
				break;
			case 3:
				mes "[�A�C�A�b�g�E���[�v]";
				mes "���ꂼ��̐��\�͎��̒ʂ肾�B";
				next;
				mes "[�h���̃��b�N���b�W�o�b�W]";
				mes "�@";
				mes "�����E���@�U����";
				mes "�^����_���[�W + 6%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "5�b����HP + 50 , SP + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���_�̃��b�N���b�W�o�b�W]";
				mes "�Ƌ��ɑ������A�ǉ���";
				mes "�����E���@�U����";
				mes "�^����_���[�W + 6%";
				mes "�r������ - 10%";
				mes "�X�L���f�B���C - 5%";
				mes "5�b����HP + 100 , SP + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�h���̃��b�N���b�W�o�b�W]";
				mes "��NPC���p�A�q�ɂւ̈ړ��̂�";
				mes "�\�ł�";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : �A�N�Z�T���[(1)";
				mes "�h�� : 0";
				mes "�d�� : 10";
				mes "�v�����x�� : 100";
				mes "���� : �S�Ă̐E��";
				next;
				mes "[���_�̃��b�N���b�W�o�b�W]";
				mes "�@";
				mes "�r������ - 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�X�L���f�B���C - 5%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "5�b����HP + 50 , SP + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�h���̃��b�N���b�W�o�b�W]";
				mes "�Ƌ��ɑ������A�ǉ���";
				mes "�����E���@�U����";
				mes "�^����_���[�W + 6%";
				mes "�r������ - 10%";
				mes "�X�L���f�B���C - 5%";
				mes "5�b����HP + 100 , SP + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���_�̃��b�N���b�W�o�b�W]";
				mes "��NPC���p�A�q�ɂւ̈ړ��̂�";
				mes "�\�ł�";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : �A�N�Z�T���[(2)";
				mes "�h�� : 0";
				mes "�d�� : 10";
				mes "�v�����x�� : 100";
				mes "���� : �S�Ă̐E��";
				continue;
			}
			break;
		}
		mes "[�A�C�A�b�g�E���[�v]";
		mes getitemname('@gain)+ "��";
		mes "�����̂��H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�A�C�A�b�g�E���[�v]";
			mes "�����~�������J�҂�";
			mes "����Ȏ��ɂ͔Y�ނ̂��I";
			mes "���͂͂͂͂��I";
			mes "�܂��A�悭�l���Ă���B";
			close2;
			cutin "rock_worp",255;
			end;
		}
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close2;
			cutin "rock_cact02",255;
			end;
		}
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�󂯎���Ă���B";
		mes "�N�ɂ͂��̎��i������B";
		mes "�ւ��Ă������񂾂��H";
		delquest 7804;
		setquest 202040;
		set ROCKRIDGE_1QUE,16;
		getitem '@gain,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 0,1000000,0;
		getexp 0,1000000,0;
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����c�̖���";
		mes "���ꂩ�痎�������Ă����Ǝv�����A";
		mes "���b�N���b�W�ɂ͂܂��܂�";
		mes "��������Ă���l��";
		mes "�������񂢂�B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����ǂ�������";
		mes "�ނ����`���Ă���Ă���B";
		mes "����ɗǂ�����";
		mes "����邩������񂼁H";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�L��ɂ���^ff0000�嗤�ē���^000000�Ȃ�";
		mes "���̕ӂ̎���͏ڂ����͂����B";
		mes "��������������";
		mes "���������Ă݂Ă���B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�N�͂��̃��b�N���b�W�ɂƂ���";
		mes "�傫�ȍK�^���B";
		mes "�����̎Ⴋ�p�Y��I";
		mes "���M�������ē��X�ƕ����Ă���I";
		mes "���ꂶ�Ⴀ�ȁI";
		close2;
		cutin "rock_worp",255;
		end;
	case 16:
	case 17:
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�N�͂��̃��b�N���b�W�ɂƂ���";
		mes "�傫�ȍK�^���B";
		mes "�����̎Ⴋ�p�Y��I";
		mes "���M�������ē��X�ƕ����Ă���I";
		close2;
		cutin "rock_worp",255;
		end;
	}
}

har_in01.gat,14,24,5	script	�C���H�J�E�X�N�[�f�B�[::�C���H�J#rock01	10212,{
	switch(ROCKRIDGE_1QUE) {
	case 7:
		cutin "rock_iboka_all",2;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�W���j�[�͊�ɂ͏o���܂��񂪁A";
		mes "���g�̗��ꂪ�s���Ȃ̂�";
		mes "�ԈႢ����܂���B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "���Ԃ��ĂԂ��߂Ƃ͂����A";
		mes "�A���o�[�g�͂��̏ꂩ�瓦���܂����B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�߂܂��邱�Ƃ��ł��܂������A";
		mes "���͂킴�Ɠ���������ł��B";
		mes "����������W���j�[��";
		mes "�ǂ��������Ǝv���܂��H";
		next;
		menu "������u���ē��������؂�ҁH",-;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�܂��ɂ���ł��B";
		mes "������҂��Ă͂���ł��傤�A";
		mes "�������A�s�M�̎��";
		mes "���ɐA�������܂����B";
		mes "���Ƃ͏����͂�݂�������";
		mes "�^�S�͂��[���Ȃ�܂��B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "^0000ff�u�A���o�[�g�̓{�X�̃W���j�[�𔄂�";
		mes "�����������c�̃{�X�̍���";
		mes "�������Ƃ��Ă���B�v^000000�ƁA";
		mes "�W���j�[�Ɏv�����܂����ł��B";
		mes "�悭����b����Ȃ��ł����H";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����ăA���o�[�g�ɂ�";
		mes "^0000ff�W���j�[���ېg�̂��߂�";
		mes "���Ԃ𗠐؂���^000000�Ɠ`�����ł��B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "����ɁA�z�΂��z�R���A";
		mes "�����v��Ȃ��ƃA���o�[�g�ɓ`���A";
		mes "������̌��ޗ��ɂ�";
		mes "���l���Ȃ��Ƌ����Ă���Ă��������B";
		mes "�����Ƃ��͓��h����ł��傤�B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "����܂ŋ����c��";
		mes "�W���j�[���܂Ƃ߂Ă��܂����B";
		mes "�܂Ƃߖ������؂���������";
		mes "���������̗D�ʐ����Ȃ��Ȃ�����";
		mes "�m��΁A���R�Ƃ��̌����ɂ�";
		mes "�]�т�������͂��ł��B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����Ȃ��Ă��܂���";
		mes "�����c�ȂǉG���̏O�B";
		mes "��͏��X�ɐ�͂�����Ă�����";
		mes "���R�ƕ��󂷂�ł��傤�B";
		next;
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�Ȃ�قǂȁB";
		mes "�������W���j�[�ɉR��";
		mes "�ǂ�����ĐM�����܂���H";
		next;
		cutin "rock_iboka_all",2;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����͎��ɔC���Ă��������B";
		next;
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�킩�����A�ǂ����낤�B";
		mes "�R�X�e����������[�j�[��n����";
		mes "�z�΂𔃂���낤�A";
		mes "�Ƃ������������˂Ȃ������ȁI";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���ꂶ��A�܂��̓W���j�[�̕�����";
		mes "���|����Ƃ��邩�B";
		mes "���O�͌��̂Ă�ꂽ����A";
		mes "��]�����͖̂��ʂƓ`���Ă�낤�B";
		delquest 7796;
		setquest 7797;
		set ROCKRIDGE_1QUE,8;
		close2;
		cutin "rock_iboka_all",255;
		end;
	case 8:
		cutin "rock_iboka_all",2;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "��肭�������͂��Ȃ�����ł��B";
		mes "�W���j�[�ɍl����]�n��";
		mes "�^���Ȃ��ŉ������B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�W���j�[�͒n�����u���";
		mes "�S������Ă��܂��B";
		mes "���������܂��傤�B";
		close2;
		cutin "rock_iboka_all",255;
		end;
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		cutin "rock_iboka_all",2;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�W���j�[�ɓn�����̂�";
		mes "�����������U�̎莆�ł��B";
		mes "���l�̕M�Ղ�^����̂�";
		mes "���ӂȂ�ł��B";
		mes "�P���Ȃ���Ƃ͎v���Ă��܂������A";
		mes "��肭�����܂����ˁB";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�z�R�̑O�ɂ������O��@���̂�";
		mes "���̍��}�������ł��B";
		close2;
		cutin "rock_iboka_all",255;
		end;
	case 14:
		cutin "rock_iboka_all",2;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "���ʂ��������݂����ł��ˁI";
		mes "�����W���j�[�ɋ����Ă��܂��傤�I";
		mes "�ӂӂӂӂӁc�c�B";
		close2;
		cutin "rock_iboka_all",255;
		end;
	case 15:
	case 16:
	case 17:
		cutin "rock_iboka_all",2;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����c�����ꂩ��ǂ����邩��";
		mes "�e�Ղɑz���ł��܂��B";
		mes "���x�c�̌P�����������Ȃ���΁B";
		close2;
		cutin "rock_iboka_all",255;
		end;
	default:
		cutin "rock_iboka_all",2;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����͕ۈ����������B";
		mes "�ƍߎ҂�߂܂��Ă����ꏊ�ł��B";
		close2;
		cutin "rock_iboka_all",255;
		end;
	}
}

rockrdg1_q.gat,156,302,7	script	�C���H�J�E�X�N�[�f�B�[::�C���H�J#rock02	10212,{
	end;
OnInit:
	cloakonnpc;
	end;
}

rockrdg1_q.gat,153,303,5	script	�A�C�A�b�g�E���[�v#revt	10211,{
	if(ROCKRIDGE_1QUE != 5) {
		cutin "rock_worp",0;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "���͐������B";
		mes "�L���N�^�[��������";
		mes "�\�ȍ�킾�����B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�����R�X�e���������炱�̍���";
		mes "��肭�����Ȃ��������낤�ȁB";
		mes "�ʎ��̂Ȃ��N����������";
		mes "���̒��ӂ���������";
		mes "�W�������񂾂낤�B";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�Ƃɂ����A����ł���������̎D��";
		mes "��ɓ���邱�Ƃ��ł����B";
		mes "���Ƃ͂��̎D���ǂ��g�������ȁB";
		next;
		mes "[�A�C�A�b�g�E���[�v]";
		mes "�ł͕ۈ�����������";
		mes "�߂邱�Ƃɂ��悤�B";
		next;
		cutin "rock_worp",255;
		mes "�]�ۈ�����������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close2;
			cutin "rock_worp",255;
			end;
		}
		mes "�]���Ȃ��͕ۈ�����������";
		mes "�@���������]";
		close2;
		warp "har_in01.gat",18,18;
		end;
	}
	unittalk "�A�C�A�b�g�E���[�v : �������񑩂̏ꏊ���B���낻�뎞�Ԃ̂͂������c�c�B",1;
	if(!sleep2(3000)) end;
	cloakoffnpc "�W���j�[�E�W�F�C���X#re";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �您�A�ۈ����B�҂������܂������H",1;
	if(!sleep2(4000)) end;
	emotion 1,"�W���j�[�E�W�F�C���X#re";
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �N�������́H�@�m���z�����Ă���悤�����H",1;
	if(!sleep2(4000)) end;
	cloakoffnpc "�A���o�[�g�E�t�H�[�h#re";
	unittalk getnpcid(0,"�A���o�[�g�E�t�H�[�h#re"),"�A���o�[�g�E�t�H�[�h : �{�X�A����ȂɑO�ɍs�������Ȃ���c�c�B",1;
	if(!sleep2(4000)) end;
	unittalk getnpcid(0,"�A���o�[�g�E�t�H�[�h#re"),"�A���o�[�g�E�t�H�[�h : �R�X�e�����Ă���Ȃ�����������H",1;
	if(!sleep2(4000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �����A���͎s���̃R�X�e���ɗp������񂾁B�֌W�Ȃ��z�͎����ȁI",1;
	if(!sleep2(4000)) end;
	unittalk "�A�C�A�b�g�E���[�v : ���������W���j�[�A�����̐搶�ɑ΂��Č��̂��������Ȃ��ĂȂ����H",1;
	if(!sleep2(4000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �����A�ۈ����B�����͒N�Ȃ񂾁H�@�s���ƈꏏ�ɗ����ƌ������͂������I",1;
	if(!sleep2(6000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �z�΂ƍz�R��Ԃ��ė~�����Ȃ��̂��H�@������H",1;
	if(!sleep2(4000)) end;
	unittalk "�A�C�A�b�g�E���[�v : ����̌����̓R�X�e���ł͂Ȃ��B�����s���ł���搶�����邱�ƂɂȂ����I",1;
	if(!sleep2(6000)) end;
	emotion 5,"�W���j�[�E�W�F�C���X#re";
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �����s�����ƁH�@�R�X�e���߁A���������悤�Ƃ΂��肵�Ă���Ƃ͕��������A���ɓ����o�����̂��H�@�͂͂͂͂́I",1;
	if(!sleep2(6000)) end;
	emotion 9,"�A���o�[�g�E�t�H�[�h#re";
	unittalk getnpcid(0,"�A���o�[�g�E�t�H�[�h#re"),"�A���o�[�g�E�t�H�[�h : ������̌����Ă邱�Ƃ͖{���ł��傤���H",1;
	if(!sleep2(4000)) end;
	unittalk "�A�C�A�b�g�E���[�v : ����ȉR�����ĉ��̓�������H�@�ǂ����炳�����Ƃ������̗v���������ȁB",1;
	if(!sleep2(6000)) end;
	unittalk "�A�C�A�b�g�E���[�v : �v����{�ЂŌ������Ȃ���Ȃ��̂��B���񂽂炵�Ă�Ƃ��ɂȂ邩�킩��񂼁I",1;
	if(!sleep2(6000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �������A�G�������͂��O�̂��̐��i�͋C�ɓ����Ă邺�B�������A�������̗v���́c�c",1;
	if(!sleep2(5000)) end;
	unittalk "�A�C�A�b�g�E���[�v : �����I",1;
	if(!sleep2(500)) end;
	misceffect 563,"�W���j�[�E�W�F�C���X#re";
	cloakoffnpc "�K���}��#rock01";
	cloakoffnpc "�K���}��#rock02";
	cloakoffnpc "�K���}��#rock03";
	cloakoffnpc "�C���H�J#rock02";
	unittalk getnpcid(0,"�C���H�J#rock02"),"�C���H�J�E�X�N�[�f�B�[ : �����ȁI",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�K���}��#rock01"),"�L���N�^�[���̃K���}�� : �����ȁI",1;
	unittalk getnpcid(0,"�K���}��#rock02"),"�L���N�^�[���̃K���}�� : �N�����͊��S�ɕ�͂��ꂽ�I",1;
	unittalk getnpcid(0,"�K���}��#rock03"),"�L���N�^�[���̃K���}�� : �����ȁI",1;
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �ȁc�c�Ȃ񂾂���́I",1;
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,"�A���o�[�g�E�t�H�[�h#re"),"�A���o�[�g�E�t�H�[�h : �{�c�c�{�X�I",1;
	if(!sleep2(2000)) end;
	misceffect 563,"�W���j�[�E�W�F�C���X#re";
	unittalk getnpcid(0,"�K���}��#rock01"),"�L���N�^�[���̃K���}�� : �����ȁI",1;
	unittalk getnpcid(0,"�K���}��#rock02"),"�L���N�^�[���̃K���}�� : �����ȁI",1;
	unittalk getnpcid(0,"�K���}��#rock03"),"�L���N�^�[���̃K���}�� : �����ȁI",1;
	if(!sleep2(2000)) end;
	unittalk "�A�C�A�b�g�E���[�v : �����������c�c",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�C���H�J#rock02"),"�C���H�J�E�X�N�[�f�B�[ : �v��ʂ�I",1;
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �L���N�^�[���߁I�@�T�{�e���ɋU�����Ă����̂�!!",1;
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �A���o�[�g�I�@�ڂ����ƌ��Ă��Ȃ��ŉ��Ƃ�����I",1;
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,"�A���o�[�g�E�t�H�[�h#re"),"�A���o�[�g�E�t�H�[�h : �ȁA���Ԃ��Ă�ł��܂��I",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : ��!?",1;
	cloakonnpc "�A���o�[�g�E�t�H�[�h#re";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �����I�@�A���o�[�g!!�@������A�҂Ă�I",1;
	if(!sleep2(3000)) end;
	unittalk "�A�C�A�b�g�E���[�v : ���������W���j�[�B�@���O�̕����������Ă������H",1;
	//if(!sleep2(100)) end;
	unittalk getnpcid(0,"�C���H�J#rock02"),"�C���H�J�E�X�N�[�f�B�[ : ���S�Ɍ��̂Ă�ꂽ�悤���ȁB",1;
	if(!sleep2(3000)) end;
	unittalk "�A�C�A�b�g�E���[�v : �݂�ȁI�@�悭����Ă��ꂽ�I�@�����A�A�s���I",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�K���}��#rock01"),"�L���N�^�[���̃K���}�� : �A�s���I",1;
	unittalk getnpcid(0,"�K���}��#rock02"),"�L���N�^�[���̃K���}�� : �߂܂������I",1;
	unittalk getnpcid(0,"�K���}��#rock03"),"�L���N�^�[���̃K���}�� : ��l��������I",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �N�\�I�@���̂܂܍z�΂������Ă������̂�!?",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�K���}��#rock01"),"�L���N�^�[���̃K���}�� : ����Ȃ��Ƃ͒m���I",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�K���}��#rock02"),"�L���N�^�[���̃K���}�� : �������͂����A�s���邾�����I",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�K���}��#rock03"),"�L���N�^�[���̃K���}�� : �Â��ɂ���I",1;
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,"�W���j�[�E�W�F�C���X#re"),"�W���j�[�E�W�F�C���X : �C�e�F�I�@����A�����ƒ��J�Ɉ����I",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�C���H�J#rock02"),"�C���H�J�E�X�N�[�f�B�[ : �s�����I�@�݂�ȁI",1;
	if(!sleep2(2000)) end;
	cloakonnpc "�K���}��#rock01";
	cloakonnpc "�K���}��#rock02";
	cloakonnpc "�K���}��#rock03";
	cloakonnpc "�C���H�J#rock02";
	cloakonnpc "�W���j�[�E�W�F�C���X#re";
	if(!sleep2(2000)) end;
	unittalk "�A�C�A�b�g�E���[�v : ���͐������B���������߂낤���B",1;
	delquest 7795;
	setquest 7796;
	set ROCKRIDGE_1QUE,6;
	cutin "rock_worp",255;
	end;
}

rockrdg1_q.gat,160,306,3	script	�W���j�[�E�W�F�C���X#re	10213,{
	end;
OnInit:
	cloakonnpc;
	end;
}

rockrdg1_q.gat,156,306,5	script	�L���N�^�[���̃K���}��::�K���}��#rock01	10212,{
	end;
OnInit:
	cloakonnpc;
	end;
}

rockrdg1_q.gat,164,306,3	script	�L���N�^�[���̃K���}��::�K���}��#rock02	10212,{
	end;
OnInit:
	cloakonnpc;
	end;
}

rockrdg1_q.gat,161,302,1	script	�L���N�^�[���̃K���}��::�K���}��#rock03	10212,{
	end;
OnInit:
	cloakonnpc;
	end;
}

rockrdg1_q.gat,168,306,3	script	�A���o�[�g�E�t�H�[�h#re	10214,{
	end;
OnInit:
	cloakonnpc;
	end;
}

har_in01.gat,89,26,5	script	�W���j�[�E�W�F�C���X#ha	10213,{
	switch(ROCKRIDGE_1QUE) {
	case 8:
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�������߁I�@�n���֗�����I";
		mes "�悭�����ɖʂ��o�����ȁI";
		cloakoffnpc "�C���H�J#rock03";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����A�����̖����̎s���l�Ɍ�������";
		mes "���Ȃ񂾂��̌������́B";
		mes "�킴�킴���O�ƌ������ɂ���";
		mes "���ꂽ�񂾂��B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "����ȕ����ɂ����̂Ă��A";
		mes "�l���Ƃ��Ă����l�̂Ȃ�";
		mes "���O�ɂ����������̃`�����X��";
		mes "�����񂾁B���肪�����v���B";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "��!?";
		mes "�ǂ��������Ƃ��H";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "��X�Ƃ��Ă͂������Ƃ��O��";
		mes "�݂邵�Ă���Ă������񂾂��ˁB";
		mes "�����Ȃ񂩓V�C���ǂ������x�����B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����̎s���l�I";
		mes "����Ȃ�ɍ\���Ă��K�v��";
		mes "�Ȃ��ł���I";
		mes "�������Ƃ�����Ⴂ�܂��傤�I";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "����������킯�̂킩��񂱂Ƃ�";
		mes "�����Ă��邪�A��̉��Ȃ񂾁B";
		mes "�����������񂾁H";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�A���o�[�g���V����";
		mes "�����c�̃{�X�ɂȂ����񂾁B";
		mes "���O�͌��̂Ă�ꂽ�񂾂�B";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�́H";
		mes "�����Ȃ艽�������������Ǝv���΁c�c";
		mes "����ȋY����M�����邩�I";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�{�����Ƃ��B";
		mes "���ہA�ނ͌N�����̂Ă�";
		mes "����������Ȃ����B";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�c�c�B";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����ĒD�����z�΂𔃂�����";
		mes "�����Ă����񂾁B";
		mes "���ꂪ�A���o�[�g����̎莆���B";
		next;
		cutin "rock_iboka_all",255;
		mes "�]�C���H�J�̓W���j�[��";
		mes "�@�莆��n�����B";
		mes "�@�����������A���o�[�g�̎莆�Ƃ�";
		mes "�@�����Ⴄ�悤���]";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "����́c�c";
		mes "�m���ɃA���o�[�g�̕������B";
		mes "����ȃo�J�ȁc�c�I";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�����˂��c�c";
		mes "���̖�Y�A�Ԃ��E���Ă��I";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "����Ȃ킯�ŁA";
		mes "���O�ɐl���Ƃ��Ẳ��l��";
		mes "�����Ȃ����킯���B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "���̂܂܂����Ŗ��ʔт�";
		mes "�H�킹�Ă����̂��ܑ̂Ȃ����A";
		mes "�������ƍق����܂����A";
		mes "�Ƃ������ƂɂȂ����񂾂��c�c�B";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�c�c�B";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "���̖����̎s���l��";
		mes "���܂�ɂ�����Ȃ��O��";
		mes "�Ō�̃`�����X��";
		mes "�^���Ă��Ƃ����񂾁B";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�`�����X���Ɓc�c�H";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�������B";
		mes "�W���j�[�A";
		mes "�������O���z�΂̏ꏊ��";
		mes "�����Ă����΁A";
		mes "��X�͋��𕥂킸��";
		mes "�z�΂����߂����Ƃ��ł���B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����A�A���o�[�g����̒�Ă�";
		mes "���܂�ǂ��b�ł͂Ȃ��B";
		mes "������Ƃ��Ă�";
		mes "�o���邾�������x���킸��";
		mes "�z�΂����߂������B";
		next;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�����ĉ�X�ɋ��͂��Ă��ꂽ��";
		mes "�{���Ȃ�΍�������";
		mes "�݂邳��Ă����������Ȃ�";
		mes "���O�̍߂��y�����Ă��A";
		mes "�Ƃ������Ƃ��B�ǂ����H";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�c�c�B";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�l���Ă��鎞�Ԃ͂Ȃ��B";
		mes "�������ԓ�����B";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�c�c�B";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�킩�����c�c�B";
		mes "�����ЂƂ���������B";
		next;
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�Ȃ񂾁H";
		next;
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�A���o�[�g�c�c";
		mes "���̗��؂�҂��n�����Ă���B";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "������������o���Ƃ��A";
		mes "������������";
		mes "���̋��ꏊ���Ȃ��Ȃ����܂��B";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�B��Ƃɂ������Ăяo��";
		mes "�Í��������Ă��B";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "^4d4dff�z�R�̋߂��ɂ���";
		mes "�|�b�R���ƌ��̊J��������O��@��^000000�B";
		mes "���ꂪ���}���B";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�؋��Ƃ���^4d4dff�A���o�[�g�̂��Ă���^000000��";
		mes "�����ė��Ă���B";
		mes "�z�΂̏ꏊ��������̂͂��̌ゾ�B";
		next;
		menu "�������낤",-;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�c�c�������I";
		mes "�p���ς񂾂Ȃ炳�����ƍs���I";
		mes "�A���o�[�g���n������܂ł�";
		mes "���̊��������ȁI";
		setquest 7798;
		delquest 7797;
		set ROCKRIDGE_1QUE,9;
		close2;
		cutin "rock_james_all",255;
		end;
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�p���ς񂾂Ȃ炳�����ƍs���I";
		mes "�A���o�[�g���n������܂ł�";
		mes "���̊��������ȁI";
		close2;
		cutin "rock_james_all",255;
		end;
	case 14:
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�A���o�[�g�͂ǂ��Ȃ���!?";
		mes "���̔ڗ�ŉ������؂�҂́I";
		next;
		menu "���Ă��݂�������",-;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�c�c�ԈႢ�Ȃ��B";
		mes "����̓A���o�[�g�̂��̂��B";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "����蒷���������";
		mes "�������ނ��тɌ����Ă���";
		mes "����������A";
		mes "���ǂ͐�ɐ������܂������I";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�������낤�B�񑩒ʂ�A";
		mes "�z�΂̉B���ꏊ�������Ă��B";
		mes "�z�΂�^4d4dff�z�R�̏��~�@�̉�^000000���B";
		mes "�̏Ⴕ�����~�@�A";
		mes "���̉��ɒu���Ă���B";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "���O��݂����ȕn��Șr�ł�";
		mes "�z�΂������ċA��̂�";
		mes "��J���邾�낤�B";
		mes "�܂����������撣��񂾂ȁI";
		next;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "���ꂩ��A���̕ۈ�����";
		mes "�����Ɖ������͂������Ƃ�";
		mes "�`���Ă�����I";
		delitem 25249,1;
		setquest 7804;
		delquest 7803;
		set ROCKRIDGE_1QUE,15;
		close2;
		cutin "rock_james_all",255;
		end;
	case 15:
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�������c�c";
		mes "��������o����c�c";
		mes "���̋��J�A";
		mes "�K�����炵�Ă�邼�c�c�B";
		close2;
		cutin "rock_james_all",255;
		end;
	case 16:
	case 17:
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "���ɂȂ����牴�͎ߕ������񂾁H";
		mes "���܂�E�ϗ͂����������Ȃ����B";
		close2;
		cutin "rock_james_all",255;
		end;
	default:
		cutin "rock_james_all",2;
		mes "[�W���j�[�E�W�F�C���X]";
		mes "�������߁I�@�n���֗�����I";
		mes "�悭�����ɖʂ��o�����ȁI";
		close2;
		cutin "rock_james_all",255;
		end;
	}
}

har_in01.gat,88,22,6	script	�C���H�J�E�X�N�[�f�B�[::�C���H�J#rock03	10212,{
	if(ROCKRIDGE_1QUE == 9) {
		cutin "rock_iboka_all",0;
		mes "[�C���H�J�E�X�N�[�f�B�[]";
		mes "�i�v���Ă����ȏ��";
		mes "�@�P���ȓz�ł����ˁB";
		mes "�@�ۈ����ɕ񍐂��܂��傤�B�j";
		close2;
	}
	cloakonnpc "�C���H�J#rock03";
	cutin "rock_iboka_all",255;
	end;
OnInit:
	cloakonnpc;
	end;
}

harboro1.gat,288,193,5	script	�V���[���E�}�b�J�[�f�B#	10215,{
	switch(ROCKRIDGE_1QUE) {
	case 10:
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "���Ȃ��������s�����\�����";
		mes "�`���҂ł��ˁB";
		mes "�͂��߂܂��āI";
		mes "���͍z�R��Ɣǂ̃��[�_�[�A";
		mes "�V���[���E�}�b�J�[�f�B�ł��B";
		mes "�V���[���ƌĂ�ŉ������B";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�ۈ�������b�͕����Ă��܂���ˁH";
		mes "���ׂ̈ɂ��������s�������Ă���";
		mes "�ƕ����܂����B";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�����c�ɐ�̂��ꂽ�z�R�̂�����";
		mes "��J���Ă���悤�ł����A";
		mes "����L���ɐi�߂��镐���";
		mes "��������ł��B";
		next;
		menu "����͉��ł����H",-;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "����܂ō�Ƃ��Ă����ꏊ��";
		mes "�����c�ɐ苒����Ă��܂��܂������A";
		mes "�z�R�̕ʂ̏ꏊ�ɐV���ȍ̌@�ꏊ��";
		mes "�������܂����I";
		mes "�������A����܂ňȏ�ɑ傫�Ȍ��΂�";
		mes "���܂��Ă�����ł��I";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�������A�����c�̘A����";
		mes "���̍̌@�ꏊ�ɋC�Â��Ă��܂���B";
		mes "�V���ȍ̌@�ꏊ�͍��܂Ŏg�p���Ă���";
		mes "�z�R�̓������班�����ꂽ�ꏊ��";
		mes "�B���Ă���܂��B";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�����łȂ�ł����A";
		mes "�V���ȍ̌@�ꏊ�ōz�΂��̌@���A";
		mes "�A���o�[�g�Ɍ�������";
		mes "���܂��傤�I";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�������������Ă�邱�ƂŁA";
		mes "���̎����Ă���؂�D��";
		mes "���ɗ����Ȃ��Ȃ������Ƃւ�";
		mes "�Ռ�������ɗ^���邱�Ƃ�";
		mes "�ł���͂��ł��I";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�V���ȍz�R�̏o�������";
		mes "����܂ł̍z�R�̓�����";
		mes "��ɂ���܂��B";
		mes "�ē�����̂ňꏏ�ɍs���܂��傤�B";
		setquest 7800;
		delquest 7799;
		set ROCKRIDGE_1QUE,11;
		next;
		mes "�]�z�R�̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͍z�R�̓�����";
		mes "�@���������]";
		close2;
		warp "rockrdg2_q.gat",347,210;
		end;
	case 11:
	case 12:
	case 13:
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�V���ȍz�R�̏o�������";
		mes "����܂ł̍z�R�̓�����";
		mes "��ɂ���܂��B";
		mes "�ē�����̂ňꏏ�ɍs���܂��傤�B";
		next;
		mes "�]�z�R�̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͍z�R�̓�����";
		mes "�@���������]";
		close2;
		warp "rockrdg2_q.gat",347,210;
		end;
	case 14:
	case 15:
	case 16:
	case 17:
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�V�����z�R�̓����͐������ł��B";
		mes "�����c�ɂ΂ꂽ��܂����̂�";
		mes "��l�ŏ������i�߂Ă��܂��B";
		close;
	default:
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�����c�̂����ł��΂炭�̊ԁA";
		mes "�z�R�ł̎d���͏o���Ȃ��Ȃ�܂����B";
		mes "�������@��T���Ȃ��Ɓc�c�B";
		close;
	}
}

rockrdg2_q.gat,347,216,5	script	�V���[���E�}�b�J�[�f�B#	10215,{
	if(ROCKRIDGE_1QUE == 11) {
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "��������V�����z�R�ɓ���܂��B";
		mes "�O�̂��߁A�O�񗈂�����";
		mes "�������B���Ă����܂����B";
		mes "���ɓ���܂����H";
		next;
		if(select("���������܂��傤","���������������K�v�ł�") == 2) {
			mes "[�V���[���E�}�b�J�[�f�B]";
			mes "�����ɒ������܂�̂͊댯�ł�����A";
			mes "�����͑����ς܂��ĉ������B";
			close;
		}
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�����ɋC�����Ă��������B";
		close2;
		warp "rockmi2.gat",14,86;
		end;
	}
	if(ROCKRIDGE_1QUE == 13) {
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�z�R�̓�����";
		mes "����������������k�ɂ���܂��B";
		next;
		mes "�]�A���o�[�g������";
		mes "�@�����c�̉B��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		mes "�]�A���o�[�g�̉B��Ƃ�";
		mes "�@���������]";
		close2;
		warp "rockrdg2_q.gat",281,306;
		end;
	}
}

rockmi2.gat,10,86,5	script	�V���[���E�}�b�J�[�f�B#	10215,{
	if(ROCKRIDGE_1QUE == 11) {
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "����ł͂����ɍ�Ƃ��n�߂܂��傤���H";
		mes "���̋������ɉ����čs���΍z��������܂��B";
		mes "�����璆�ɂ���̂��z�΂�����K���ɑI���";
		mes "^4d4dff���z�΂�1��^000000�@���ė��ĉ������B";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "���͏�ɖ߂鎞�Ɏg�����Ԃ�";
		mes "�������Ă����܂��B";
		mes "�Վ��Ή��Ƃ��č�������Ȃ̂�";
		mes "���S�������������܂�����ˁB";
		setquest 7801;
		delquest 7800;
		set ROCKRIDGE_1QUE,12;
		close;
	}
	if(ROCKRIDGE_1QUE == 12) {
		if(countitem(25247) < 1) {
			mes "[�V���[���E�}�b�J�[�f�B]";
			mes "�����璆�ɂ���̂��z�΂�����K���ɑI���";
			mes "^4d4dff���z�΂�1��^000000�@���ė��ĉ������B";
			close;
		}
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "��͂�o���L�x�Ȗ`���҂�";
		mes "�Ⴂ�܂��ˁI";
		mes "�����Ă����Ȃ��̂ɁA";
		mes "����Ȃɗǎ��̍z�΂�";
		mes "�@���ė���Ȃ�āI";
		next;
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "����Ȃ�A���o�[�g�������̂�";
		mes "�\�����Ǝv���܂��B";
		mes "�����s���܂��傤�I";
		setquest 7802;
		delquest 7801;
		set ROCKRIDGE_1QUE,13;
		next;
		mes "�]�A���o�[�g������";
		mes "�@�����c�̉B��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		// ������
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "���ꂶ��オ��܂���`�B";
		close2;
		warp "rockrdg2_q.gat",348,214;
		end;
	}
	if(ROCKRIDGE_1QUE == 13) {
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "�z�΂������܂������H";
		mes "�O�ɏo�܂���H";
		next;
		if(select("�͂�","�܂��@���Ă��܂�") == 2) {
			mes "[�V���[���E�}�b�J�[�f�B]";
			mes "�����ő҂��Ă��܂��ˁB";
			close;
		}
		mes "[�V���[���E�}�b�J�[�f�B]";
		mes "���ꂶ��オ��܂���`�B";
		close2;
		warp "rockrdg2_q.gat",348,214;
		end;
	}
}

rockrdg2_q.gat,279,313,3	script	�|�b�R���ƌ��̊J������#	10042,{
	if(ROCKRIDGE_1QUE == 13) {
		mes "�]�W���j�[�������Ă���";
		mes "�@�B��Ƃ̊�̂悤���]";
		next;
		if(select("�g���g��","�g���g���g��") == 1) {
			mes "�]�����N���Ȃ������]";
			close;
		}
		cloakoffnpc "�A���o�[�g�E�t�H�[�h#ro";
		unittalk getnpcid(0,"�A���o�[�g�E�t�H�[�h#ro"),"�A���o�[�g�E�t�H�[�h : �{�X�H�@�߂�ꂽ��ł����H",1;
		close;
	}
	mes "�]���͂����ɗp�͂Ȃ��]";
	next;
	mes "�]���b�N���b�W��";
	mes "�@�߂�܂����H�]";
	next;
	if(select("�߂�","��߂�") == 2) {
		mes "�]���Ȃ���";
		mes "�@�v���Ƃǂ܂����]";
		close;
	}
	// ������
	mes "�]���Ȃ��̓��b�N���b�W��";
	mes "�@���������]";
	close2;
	warp "har_in01.gat",18,18;
	end;
}

rockrdg2_q.gat,282,310,3	script	�A���o�[�g�E�t�H�[�h#ro	10214,{
	if(ROCKRIDGE_1QUE == 13) {
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "���O�̓��b�N���b�W�́I";
		mes "���̂��̈Í���m���Ă���I";
		next;
		if(select("�b�����ɗ���","���R��") == 2) {
			mes "[�A���o�[�g�E�t�H�[�h]";
			mes "���R���ƁH";
			mes "�m���ɁA�P���ȈÍ�������";
			mes "�����������Ƃ����邩�c�c�B";
			mes "�����ƕ��G�ɂ��Ȃ��Ƃ����Ȃ��ȁB";
			next;
			cloakonnpc "�A���o�[�g�E�t�H�[�h#ro";
			mes "�]�A���o�[�g�͍l���������Ȃ���";
			mes "�@�B��Ƃɖ߂��Ă��܂����B";
			mes "�@������x�Ăт������]";
			close;
		}
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�z�΂ƃ{�X�̌����̘b���ȁH";
		mes "�����w�肵���͕̂ʂ̏ꏊ���B";
		mes "�ǂ����Ă�����m���Ă���!?";
		next;
		menu "�����z�΂͕K�v�Ȃ�",-;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "���H";
		mes "�ǂ��������Ƃ��H";
		next;
		if(select("�z�΂���������","����������������") == 2) {
			mes "[�A���o�[�g�E�t�H�[�h]";
			mes "���ꂪ�ǂ������H";
			mes "�����֌W����̂��H";
			next;
			mes "�]�����镨���ԈႦ���悤���B";
			mes "�@������x�b�������悤�]";
			close;
		}
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�Ȃ񂾂��̍z�΂́H";
		mes "�z�R�͉��������苒���Ă�̂ɁA";
		mes "�ǂ����Ă���Ȃɂ�";
		mes "�傫�ȍz�΂������Ă���H";
		next;
		menu "�V�����z�R��������",-;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "���I";
		mes "�V�����z�R���ƁI";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "���A����ȁc�c�B";
		mes "���ꂶ��z�΂��z�R���A";
		mes "�Ȃ�̖��ɂ�";
		mes "�����Ȃ�����Ȃ����c�c�B";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "���A�������I";
		mes "���ꂶ��A";
		mes "�{�X�͂ǂ��Ȃ�H";
		next;
		menu "�W���j�[�͗��؂���",-;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�ȂɁH";
		mes "�{�X�����؂������ƁH";
		mes "�ǂ��������Ƃ��I";
		next;
		mes "�]�A���o�[�g�Ɍ��̂Ă��A";
		mes "�@�l���Ƃ��Ẳ��l��";
		mes "�@�Ȃ��Ȃ������Ƃ�m�����W���j�[��";
		mes "�@���񂾍z�΂̉B���ꏊ��";
		mes "�@������̂ƈ��������ɁA";
		mes "�@��������Ă����Ɠ`�����]";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�n���ȁI";
		mes "����͒��Ԃ��Ăтɍs�����߂ŁA";
		mes "���̏�ł͍őP�̎肾�����I";
		mes "�������̏�Ɏc������";
		mes "��l�Ƃ��߂܂��Ă�������Ȃ����I";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�{�X�͉���M���Ă��Ȃ��̂��c�c�B";
		mes "����A�҂Ă�H";
		mes "�O�݂����ɂ��O�炪";
		mes "�R�������Ă���񂶂�Ȃ����H";
		mes "���ƃ{�X�̒���􂱂����āI";
		next;
		if(select("�Ăяo�����Í��̂��Ƃ�`����","����Ȃ��Ƃ͂Ȃ�") == 2) {
			mes "[�A���o�[�g�E�t�H�[�h]";
			mes "������A����Ȃ��Ƃ͂���I";
			mes "�����Ƃ����㩂��B";
			mes "���O��̌������ƂȂ��";
			mes "�M�����邩�I";
			next;
			cloakonnpc "�A���o�[�g�E�t�H�[�h#ro";
			mes "�]�A���o�[�g�͓{����";
			mes "�@�B��Ƃɖ߂��Ă��܂����B";
			mes "�@������x�Ăт������]";
			close;
		}
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�������c�c�I";
		mes "���O�͂��̈Í���m���Ă����c�c";
		mes "�Ƃ������Ƃ́I";
		mes "�܂����A�{�X���������̂��H";
		mes "�{���ɉ������𗠐؂����̂�!?";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�������̓{�X�������悤��";
		mes "���������Ă����̂ɁI";
		mes "���Ԃ�M���Ȃ��Ŏ���������";
		mes "�����̂т悤�Ƃ���Ȃ�āI";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�������傤�I";
		mes "����Ȃ�͂����{�X����Ȃ��I";
		mes "�������I�@�������I";
		next;
		mes "�]�A���o�[�g�͂��Ȃ����";
		mes "�@�n�ʂ�@���Ă���]";
		next;
		mes "�]�������ăA���o�[�g��";
		mes "�@���Ă��݂��ꕔ�؂������]";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�Ȃ񂾁H";
		mes "�G��񂶂�˂��I";
		mes "�T�������I";
		next;
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�������I";
		mes "����Ȃ��Ƃ��Ă�ꍇ����˂��B";
		mes "�����݂�Ȃɒm�点�Ȃ��ƁI";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "�]��肭�A���o�[�g��";
		mes "�@�x�����Ƃ��ł����悤���B";
		mes "�@���Ă��݂������Ē��֖߂낤�]";
		getitem 25249,1;
		setquest 7803;
		delquest 7802;
		set ROCKRIDGE_1QUE,14;
		next;
		mes "�]�ۈ�����������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͕ۈ�����������";
		mes "�@���������]";
		close2;
		warp "har_in01.gat",18,18;
		end;
	}
	if(ROCKRIDGE_1QUE == 14) {
		mes "[�A���o�[�g�E�t�H�[�h]";
		mes "�������I";
		mes "����Ȃ��Ƃ��Ă�ꍇ����˂��B";
		mes "�����݂�Ȃɒm�点�Ȃ��ƁI";
		next;
		mes "�]��肭�A���o�[�g��";
		mes "�@�x�����Ƃ��ł����悤���B";
		mes "�@���Ă��݂������Ē��֖߂낤�]";
		next;
		mes "�]�ۈ�����������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���Ȃ���";
			mes "�@�v���Ƃǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͕ۈ�����������";
		mes "�@���������]";
		close2;
		warp "har_in01.gat",18,18;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

//============================================================
// �E�B�[�N���[�N�G�X�gNPC
//------------------------------------------------------------

//=======================================================
// �r���p�C�v�|���N�G�X�gNPC
//-------------------------------------------------------
harboro1.gat,138,157,5	script	�h�m�o��	854,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�h�m�o��]";
		mes "�{�y����n���ė���";
		mes "�`���҂���ł���ˁH";
		mes "���͂����̉��������Ǘ����Ă���";
		mes "�h�m�o���ł��B";
		next;
		mes "[�h�m�o��]";
		mes "�������ɏ�����肪�������Ă���";
		mes "�l�肪�~�����Ƃ���ł����A";
		mes "��ɋ����c�̖����������Ȃ���";
		mes "����ǂ���ł͂���܂���B";
		close;
	}
	if(BaseLevel < 160) {
		mes "[�h�m�o��]";
		mes "�����c�̖���";
		mes "�������Ă��ꂽ���ł��ˁI";
		next;
		mes "[�h�m�o��]";
		mes "�������������������Ȃ���";
		mes "���̈˗��͓���ł��ˁB";
		mes "^ff0000BaseLv160^000000�ȏ�ɂȂ�����";
		mes "�܂����Ă��������B";
		close;
	}
	if(checkquest(9458)) {
		if(checkquest(9458) & 0x4) {
			mes "[�h�m�o��]";
			mes "�f�r���Y�t�B���K�[�Y��";
			mes "�����ł����݂����ł��ˁB";
			mes "���肪�Ƃ��������܂��B";
			next;
			mes "[�h�m�o��]";
			mes "�����Y��ɂȂ��Ă��Ă��A";
			mes "�������Ԃ��o�Ƃ������";
			mes "���̂܂ɂ������āA";
			mes "�p�C�v�ɂ������Ă��܂��B";
			next;
			if(!checkitemblank()) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			mes "[�h�m�o��]";
			mes "���������I�ɏ�������K�v��";
			mes "�����ł��B";
			mes "�܂��f�r���Y�t�B���K�[�Y��";
			mes "�����Ă����珜����";
			mes "��`���Ă��炦��Ə�����܂��B";
			delquest 9458;
			setquest 9459;
			getitem 25250,3;
			getexp 300000000,0,1;
			getexp 0,120000000,0;
			close;
		}
		mes "[�h�m�o��]";
		mes "��������܂��������ɐi�ނ�";
		mes "�W���[�����܂��B";
		mes "�ނ��n���܂�";
		mes "�ē����Ă����͂��ł��B";
		viewpoint 1,324,124,1,0x00FF00;
		close;
	}
	if(checkquest(9459)) {
		if(checkquest(9459) & 0x2) {
			mes "[�h�m�o��]";
			mes "�����A���x�ǂ��Ƃ����";
			mes "���Ă���܂����B";
			mes "���낻��f�r���Y�t�B���K�[�Y��";
			mes "�������鍠�������Ȃ�";
			mes "�l���Ă�����ł��B";
			next;
			if(select("���������܂�","���͂�����ƖZ�����āc�c") == 2) {
				mes "[�h�m�o��]";
				mes "���A�����Ȃ�ł����A";
				mes "���傤���Ȃ��ł��ˁB";
				mes "�ǂ������玞�Ԃ����鎞��";
				mes "�K�˂ė��ĉ������B";
				close;
			}
			mes "[�h�m�o��]";
			mes "�n���ւ̓��͊��ɂ��킩��ł���ˁH";
			mes "����ł͂�낵�����肢���܂��I";
			delquest 9459;
			setquest 9458;
			viewpoint 1,324,124,1,0x00FF00;
			close;
		}
		mes "[�h�m�o��]";
		mes "�܂��f�r���Y�t�B���K�[�Y��";
		mes "�����Ă����珜����";
		mes "��`���Ă��炦��Ə�����܂��B";
		close;
	}
	mes "[�h�m�o��]";
	mes "�����I";
	mes "�����c�̖���";
	mes "�������Ă��ꂽ���ł��ˁI";
	mes "���h�ł��I";
	next;
	mes "[�h�m�o��]";
	mes "���͂����̉��������Ǘ����Ă���";
	mes "�h�m�o���ł��B";
	next;
	mes "[�h�m�o��]";
	mes "���̒��̒n���ł͒���I��";
	mes "�n�����������o�Ă��܂��B";
	mes "���̐����O�ɔr�o���Ȃ���";
	mes "�����Z�����Ă��܂���ł��B";
	next;
	mes "[�h�m�o��]";
	mes "�����Ŏ��̓|���v�Ɖ�������";
	mes "����ɓ��삵�Ă��邩��";
	mes "�Ǘ����Ă����ł��B";
	next;
	mes "[�h�m�o��]";
	mes "�����ŋ߂͊m�F�ӏ��������Ă��܂��A";
	mes "�������ł̓`�F�b�N������Ȃ�";
	mes "�Ȃ��Ă��܂��܂����B";
	next;
	mes "[�h�m�o��]";
	mes "�����ŋ��͂����Ă��ꂻ���Ȑl��";
	mes "�T���Ă����̂ł����A";
	mes "�ǂ��ł��傤�H";
	mes "���͂��Ă��������܂��񂩁H";
	next;
	if(select("�ł́A�������܂��傤","���͂�����ƖZ�����āc�c") == 2) {
		mes "[�h�m�o��]";
		mes "���A�����Ȃ�ł����A";
		mes "���傤���Ȃ��ł��ˁB";
		mes "�ǂ������玞�Ԃ����鎞��";
		mes "�K�˂ė��ĉ������B";
		close;
	}
	mes "[�h�m�o��]";
	mes "�{���ł����I";
	mes "���肪�Ƃ��������܂��B";
	mes "����Ȃɓ�����ł͂���܂���B";
	mes "���̒n���ɂ���";
	mes "�f�r���Y�t�B���K�[�Y��";
	mes "�������Ă����΂����ł��B";
	next;
	mes "[�h�m�o��]";
	mes "�n���ɉ����ɂ�";
	mes "��������܂��������ɍs���āA";
	mes "�W���[�ɕ����Ă݂Ă��������B";
	mes "�n���ւƈē����Ă����͂��ł��B";
	next;
	mes "[�h�m�o��]";
	mes "�������̊Ԃł�";
	mes "�u�����ȃW���[�v�ƌĂ΂�Ă��܂��B";
	mes "�ł͂�낵�����肢���܂��B";
	setquest 9458;
	viewpoint 1,324,124,1,0x00FF00;
	close;
}

//=======================================================
// ������̂̃��������N�G�X�gNPC
//-------------------------------------------------------
harboro1.gat,347,65,3	script	�~�Y�E�}�b�N�t�B�[#rock	74,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "����ɂ��́B�`���҂���B";
		mes "�����c�̂����Œ��͑�ςȂ�ł��B";
		next;
		mes "�]�����c�̖�肪�������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(BaseLevel < 130) {
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "����ɂ��́B�`���҂���ł����H";
		mes "���̒n���^FF0000BaseLv��130^000000�͂Ȃ���";
		mes "�����Ǝv���܂���c�c";
		close;
	}
	if(checkquest(1329)) {
		if(checkquest(1329) & 0x2 == 0) {
			mes "[�~�Y�E�}�b�N�t�B�[]";
			mes "���͂܂����v�ł����A";
			mes "^FF0000�Ηj���̐��߂ɂȂ��^000000�N����";
			mes "�Ƃ̕��������čs�����Ⴄ��ł��B";
			mes "�`�����������A�Q�Ă��鎞��";
			mes "�܂�œV�g�݂����Ȃ̂Ɂc�c�B";
			close;
		}
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "���Ă��ꂽ�̂ł��ˁI";
		mes "�{���Ɋ��ӂ��܂��B";
		mes "�܂��`�����������";
		mes "�Ƃ̕��������čs���������";
		mes "�݂����Ȃ�ł��B";
		next;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�����T���Ă���";
		mes "���������Ȃ��ł��傤���B";
		mes "�����^0000CD���b�N���b�W�R�C��1��^000000��";
		mes "�����グ�܂��B";
		next;
		if(select("���͂���","�f��") == 2) {
			mes "[�~�Y�E�}�b�N�t�B�[]";
			mes "�`���җl�ȊO�ɗ��߂����Ȑl��";
			mes "���Ȃ���ł��c�c�B";
			mes "�����C���ς������";
			mes "�܂��K�˂ė��ĉ������B";
			close;
		}
		switch(rand(5)) {
		case 0:	set '@quest,1323; set '@name$,"�X���b�p"; break;
		case 1:	set '@quest,1324; set '@name$,"�X�v�[��"; break;
		case 2:	set '@quest,1325; set '@name$,"��Ɨp�̒��C"; break;
		case 3:	set '@quest,1326; set '@name$,"���"; break;
		case 4:	set '@quest,1327; set '@name$,"�X�q"; break;
		}
		delquest 1329;
		setquest '@quest;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "���肪�Ƃ��������܂��B";
		mes "����`����������񂪎����čs������";
		mes "^ff0000" +'@name$+ "^000000�ł��B";
		next;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�����o�Ă����̂Ƃ����";
		mes "�v������̂ŁA";
		mes "�S�����肪����ꏊ��";
		mes "�����Ă݂Ă��������B";
		mes "��낵�����肢���܂��B";
		close;
	}
	if(checkquest(1321) || checkquest(1323) || checkquest(1324) || checkquest(1325) || checkquest(1326) || checkquest(1327)) {
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�`������������";
		mes "��l�������Ă����";
		mes "�{���ɉ����̂Ɂc�c�B";
		mes "�͂��c�c�B";
		close;
	}
	if(checkquest(1328)) {
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�����ė��Ă��ꂽ��ł��ˁI";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		mes "�`�������������^���悤��";
		mes "���Ă��܂����A���񂺂񌾂����Ƃ�";
		mes "�����Ă���Ȃ���ł��B";
		next;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "����̃��b�N���b�W�R�C���ł��B";
		mes "�������̑���Ɋ댯�ȍr��܂�";
		mes "�s���Ă��炦�āA";
		mes "�{���Ɋ��ӂ��Ă��܂��B";
		next;
		delquest 1328;
		setquest 1329;
		getitem 25250,1;
		getexp 15000000,0,1;
		getexp 0,6000000,0;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "��������Ђ��肢�������̂ŁA";
		mes "�����ǂ�������A";
		mes "�Ηj���̐��߈ȍ~��";
		mes "�܂����Ă��������B";
		emotion 15;
		close;
	}
	if(checkquest(1322)) {
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�`���җl�I";
		mes "�����Ă��Ă��ꂽ��ł��ˁI";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�����₩�ł͂���܂����A";
		mes "����ɂ�����󂯎���Ă��������B";
		next;
		if(!checkitemblank()) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�����܂Őe�؂�";
		mes "���͂��Ă��ꂽ�`���җl�ɁA";
		mes "���߂Ă��̊��ӂ̋C�����ł��B";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		emotion 15;
		delquest 1322;
		setquest 1329;
		getitem 25250,1;
		getexp 30000000,0,1;
		getexp 0,12000000,0;
		next;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�����āA���́c�c�����ǂ�������";
		mes "�܂��l�q�����ɗ��Ă��������܂����H";
		mes "�������^���悤�Ƃ͂��Ă��܂����A";
		mes "�x�X�`����������񂪍r��ւ�";
		mes "���������o���Ď�ɂ����Ȃ��ł��B";
		next;
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�����͂������v���Ǝv���܂����A";
		mes "�܂���ŗ��Ă���܂����H";
		mes "���͉��������グ��ꂻ���ȕ���";
		mes "�p�ӂ��Ă����܂��B";
		close;
	}
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "�����ƌ��̖ʓ|������悤�ɂ�";
	mes "���x���������ł���I";
	emotion 6;
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "�Ȃ񂾁H�@�����������̂����H";
	emotion 1,"�~�X�^�[�E�}�b�N�t�B�[#";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "�������I�@���Ƃ����Ă�A�{���ɁI";
	mes "�`����������񂪍��x��";
	mes "��������čs�����̂��m�肽���H";
	mes "���̎w�ւ�A�w�ցI";
	next;
	if(select("���̂��Ƃ������Ă݂�","��߂�") == 2) {
		mes "[�~�Y�E�}�b�N�t�B�[]";
		mes "�˂��I�@���̘b�����Ă����!?";
		close;
	}
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "�ꂪ���m��ʓy�n�ɓn���X��";
	mes "�S�z���Ă��ꂽ�w�ւȂ̂ɁA";
	mes "���������čs���Ă��܂����̂�I";
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "���̎w�ւ��H";
	mes "���A����̓`�����������";
	mes "�����ˁB";
	emotion 4,"�~�X�^�[�E�}�b�N�t�B�[#";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "�C���A���󕨂������ēy�̏��";
	mes "�V�񂾂肷�邭�炢�Ȃ�";
	mes "�䖝�͂ł��邯�ǁc�c�w�ւ͂ǂ�!?";
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "�܂��܂����������āB";
	mes "�厖�Ɉ���Ȃ������N�ɂ�";
	mes "�ӔC������񂶂�Ȃ����ȁH";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "�Ȃ�ł����āI";
	mes "���d���ȊO�͔��g�������������I";
	mes "������ƊO�����ۂɗ��Ƃ����̂�";
	mes "�����Ă����ꂿ������̂�I";
	emotion 36;
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "���Ȃ��͎d������߂Ă���";
	mes "�񂩌����o���Ă���̂�";
	mes "�Ǝ��͈�؎�`��Ȃ��A";
	mes "���ƗV��ł΂���B";
	mes "����Ȃ猢�̋��炭�炢";
	mes "�����Ƃ��Ă����Ă�I";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "��΂Ɏw�ւ�T���Ă��āI";
	mes "������܂ł͉Ƃɓ���Ȃ�����I";
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "��!?";
	mes "������Ɩ�������I�@�{�C�H";
	mes "�O�ɔ��ł������X�q��";
	mes "�T���ɍs�������ǁA";
	mes "�����ɂ�����߂��̂�";
	mes "�m���Ă邾��I";
	emotion 19,"�~�X�^�[�E�}�b�N�t�B�[#";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "���͒m��Ȃ�����A";
	mes "���Ƃ͎����ŉ��Ƃ����āI";
	next;
	if(select("�Θb�ɓ��荞��","�ʂ�߂���") == 2) {
		mes "�]�������Ȃ������ǂ��������]";
		close;
	}
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "����A�т����肵���I";
	mes "�Ȃ�ł����H";
	next;
	if(select("�w�֒T������`���ƌ���","���A����") == 2) {
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "���A�͂��B����ɂ��́B";
		mes "�Ȃ񂩁A�ςȐl���ȁB";
		close;
	}
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "����������`���Ă�����ł����H";
	mes "�L���ł����A�������܂��B";
	mes "�������͍����グ������̂�";
	mes "�Ȃɂ�����܂���B";
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "����A�҂Ă�I";
	mes "�悭�l���Ă݂Ă���B";
	mes "���������c�̂���r���";
	mes "�T���ɍs����Ǝv���Ă�H";
	emotion 19,"�~�X�^�[�E�}�b�N�t�B�[#";
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "���ɗ��߂�l�����Ȃ����A";
	mes "����̌��͌�ōl����Ƃ��āA";
	mes "����ł݂���ǂ����낤�H";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "����͂��������ǁc�c�ӂ��c�c�B";
	emotion 9;
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "���́c�c�`���җl�A";
	mes "����Ȏ������������";
	mes "�}�X������������܂��񂪁A";
	mes "���肢�ł��܂����H";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "�`�����������͌����@����";
	mes "�����ɕ�������̂ŁA";
	mes "�r��Ō�����������";
	mes "���ɉ�������̂�";
	mes "�m�F���Ă��������B";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "���ƕv�͒��̒���T���Ă݂܂��B";
	mes "������������";
	mes "�����ɂ܂��߂��ė��ĉ������B";
	next;
	mes "[�~�Y�E�}�b�N�t�B�[]";
	mes "�˂����Ȃ��A�`���җl��";
	mes "�S�����肪����ꏊ�������Ă����āB";
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "��A����!?";
	mes "���A�����A�킩������c�c�B";
	emotion 4,"�~�X�^�[�E�}�b�N�t�B�[#";
	setquest 1321;
	close;
}

harboro1.gat,345,61,3	script	�`�����������	81,{
	if(checkquest(1329) && checkquest(1329)&2 == 0) {	// �N�[���^�C����
		mes "�]�ǂ����R���[�e�Ɏ���";
		mes "�@�p�����Ă���q��������";
		mes "�@��������Q�Ă���悤���B";
		mes "�@�����Ƃ��Ă������]";
		close;
	}
	mes "�]�ǂ����R���[�e�Ɏ���";
	mes "�@�p�����Ă���q��������]";
	next;
	mes "�]�т������ς�鎞���Ȃ̂��A";
	mes "�@�т����Ȃ�ʂ��Ă���B";
	mes "�@���̎q�����s�����Ƃ���ɂ�";
	mes "�@�����т������Ă��������]";
	close;
}

harboro1.gat,344,61,5	script	�~�X�^�[�E�}�b�N�t�B�[#	98,{
	if(checkquest(1321)) {
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�������͒��̒��𒲂ׂ܂��B";
		mes "�`���җl�͒��̊O�����肢���܂��B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "��U���̊O�܂ŗ��Ă��������B";
		mes "�������ꏊ�������܂��B";
		close;
	}
	if(checkquest(1322)) {
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�`�����������A";
		mes "�������񂪃u���b�V���O����";
		mes "�����悤���H";
		close;
	}
	if(checkquest(1332)) {
		if(checkquest(1332) & 0x2 == 0) {
			mes "[�~�X�^�[�E�}�b�N�t�B�[]";
			mes "�܂����������ł��ˁB";
			mes "�Ηj���̐��߂��߂�����";
			mes "�܂����Ă���܂����H";
			close;
		}
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "���҂����Ă��܂����B";
		mes "�`�����������̂��߂�";
		mes "�����c�𒦂炵�߂Ă��炦�܂����H";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "^ff0000�������F�������c�A";
		mes "�������������c�A�������������c��";
		mes "���ꂼ��30�l����";
		mes "���炵�߂Ă���Ă��������B";
		mes "�`���җl������M���Ă��܂��I";
		delquest 1332;
		setquest 1331;
		close;
	}
	if(checkquest(1331)) {
		if(checkquest(1331) & 0x4) {
			mes "[�~�X�^�[�E�}�b�N�t�B�[]";
			mes "�����c�̂���";
			mes "���炵�߂Ă��ꂽ��ł��ˁI";
			mes "���肪�Ƃ��������܂��I";
			next;
			mes "[�~�X�^�[�E�}�b�N�t�B�[]";
			mes "���ǁA�����c�̋K�͂��l�����";
			mes "���̒��x�ł͉��������Ȃ��ł��傤�B";
			mes "�p���I�ɒ��炵�߂Ă��K�v��";
			mes "����Ǝv���܂��B";
			next;
			mes "[�~�X�^�[�E�}�b�N�t�B�[]";
			mes "�ł��̂ł��ꂩ����A";
			mes "��T�ԂɈ����x�ŗǂ��̂ŁA";
			mes "���𒦂炵�߂�";
			mes "�s���Ă��炦�Ȃ��ł��傤���H";
			next;
			if(!checkitemblank()) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			mes "[�~�X�^�[�E�}�b�N�t�B�[]";
			mes "���ꂩ��A����͍���̂���ł��B";
			mes "�{���ɂ��肪�Ƃ��������܂��B";
			delquest 1331;
			setquest 1332;
			//achievement_update	//clear
			getitem 25250,1;
			getexp 15000000,0,1;
			getexp 0,6000000,0;
			close2;
			//achievement_update	//complete
			end;
		}
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "^ff0000�������F�������c�A";
		mes "�������������c�A�������������c��";
		mes "���ꂼ��30�l����";
		mes "���炵�߂Ă���Ă��������B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�����̈������ł��B";
		mes "�ǂ����Ă���ȉ����q����";
		mes "�e�������邱�Ƃ��ł���񂾁I";
		close;
	}
	if(checkquest(1329)) {
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�`���җl�I";
		mes "�Ȃ̎w�ւ̂��߂�";
		mes "�킴�킴�댯�ȏꏊ�܂�";
		mes "�s���Ă��������A";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�����������̂悤�Ȍ`��";
		mes "���������ƂɂȂ����̂�";
		mes "�����ЂƂ��肢��";
		mes "�����Ă��炦�Ȃ��ł��傤���B";
		next;
		if(select("�܂��͕����Ă݂�","�f��") == 2) {
			mes "[�~�X�^�[�E�}�b�N�t�B�[]";
			mes "�����ł����c�c";
			mes "���傤���Ȃ��ł��ˁB";
			close;
		}
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "���͍ŋ߁A�`�����������";
		mes "���̌�g�p�̏e��";
		mes "�|����悤�ɂȂ�����ł��B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�����炭�N����";
		mes "�`�����������̋߂��ŏe��������";
		mes "���������񂾂Ǝv���܂��B";
		mes "�e�����邾���ŕ|����悤��";
		mes "�Ȃ��Ă��܂��܂����B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�����ŋ߁A���ŏe����";
		mes "���������Ƃ͂���܂���B";
		mes "�ƂȂ�ƃ`������������";
		mes "�r��ɏo�|�������ɏe���𕷂����B";
		mes "�܂�Ɛl�͍r��ɂ���^ff0000�����c^000000��";
		mes "�ԈႢ����܂���B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�Ȃ�Ƃ����Q�������̂ł����A";
		mes "���̗͂ł͂Ȃ�Ƃ��Ȃ�܂���B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�����Ŗ`���җl�A���̑����";
		mes "�`�����������̕��Q��";
		mes "���Ă���Ȃ��ł��傤���H";
		mes "�^�_�Ƃ͌����܂���B";
		mes "����Ƀ��b�N���b�W�R�C����";
		mes "�����グ�܂��B";
		next;
		if(select("���݂𕷂������","�f��") == 2) {
			mes "[�~�X�^�[�E�}�b�N�t�B�[]";
			mes "�����ł����c�c";
			mes "���傤���Ȃ��ł��ˁB";
			close;
		}
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "���݂𕷂��Ă��炢";
		mes "���肪�Ƃ��������܂��I";
		mes "����ł�^ff0000�������F�������c�A";
		mes "�������������c�A�������������c��";
		mes "���ꂼ��30�l����";
		mes "���炵�߂Ă���Ă��������B";
		emotion 15,"�~�X�^�[�E�}�b�N�t�B�[#";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�`���җl����������ł��B";
		mes "��낵�����肢���܂��B";
		setquest 1331;
		close;
	}
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "�`�����������A";
	mes "����H�ׂ�H�@����B";
	close;
}

rockrdg1.gat,36,250,5	script	�~�X�^�[�E�}�b�N�t�B�[	98,{
	if(checkquest(1321)) {
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�Ȃ������ɂ́A";
		mes "�`�����������͉Ƃ̗�������o��";
		mes "�S��Ԃ�ʂ�";
		mes "�^������^ff0000��̕�^000000��";
		mes "�����Ă������炵���ł��B";
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�������̏��ɖ߂��ė����̂�";
		mes "����Ȃɉ����܂ōs���ĂȂ���";
		mes "�v���܂��B";
		mes "�S��Ԃɉ����čs���A";
		mes "�����т����ɗ����Ă��錊��";
		mes "�T���Ă���܂��񂩁H";
		viewpoint 1,43,145,1,0x00FF00;
		close;
	}
	if(checkquest(1322)) {
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "����������܂�����!?";
		mes "�����߂�܂��傤�I";
		close;
	}
	if(checkquest(1323) || checkquest(1324) || checkquest(1325) || checkquest(1326) || checkquest(1327)) {
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�`�����������̖т�";
		mes "�����ς�鎞���炵���A";
		mes "�ŋ߂������т��������ł��B";
		mes "�`����������񂪌@�������Ȃ�";
		mes "�߂��ɔ����т�����͂��ł��B";
		if(checkquest(1323)) viewpoint 1,100,230,1,0x00FF00;
		else if(checkquest(1324)) viewpoint 1,58,195,1,0x00FF00;
		else if(checkquest(1325)) viewpoint 1,71,149,1,0x00FF00;
		else if(checkquest(1326)) viewpoint 1,109,60,1,0x00FF00;
		else if(checkquest(1327)) viewpoint 1,191,101,1,0x00FF00;
		next;
		mes "[�~�X�^�[�E�}�b�N�t�B�[]";
		mes "�܂��c���̂ł���قǉ����ɂ�";
		mes "�s���Ă��Ȃ��Ǝv���܂��B";
		mes "�n�}�ɉ������ꏊ��";
		mes "�L�����Ă����̂ŁA";
		mes "���̕t�߂𒲂ׂĂ��������B";
		close;
	}
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "���킠�A�����c��!?";
	emotion 23;
	next;
	mes "[�~�X�^�[�E�}�b�N�t�B�[]";
	mes "�Ȃ񂾁A�`���җl����Ȃ��ł����B";
	mes "�������Ȃ��ł���������B";
	close;
}

rockrdg1.gat,170,233,3	script	��#rkdqgd1	550,{
	mes "�]��������B";
	mes "�@���ɂ͎������y�����邾�����]";
	close;
}

rockrdg1.gat,183,143,3	script	��#rkdqgd2	550,{
	mes "�]��������B";
	mes "�@���ɂ͎������y�����邾�����]";
	close;
}

rockrdg1.gat,215,72,3	script	��#rkdqgd3	550,{
	mes "�]��������B";
	mes "�@���ɂ͎������y�����邾�����]";
	close;
}

rockrdg1.gat,43,145,3	script	��#rkq1321	550,{
	set '@quest,substr(strnpcinfo(2),3,7);
	if(checkquest('@quest)) {
		mes "�]��������B";
		mes "�@���ɂ͔����т�����";
		mes "�@�ς����Ă���悤�Ɍ�����]";
		next;
		switch('@quest) {
		case 1321: mes "�]^0000ff���̎w��^000000���������B"; set '@quest2,1322; break;
		case 1323: mes "�]^0000ff�X���b�p^000000���������B"; set '@quest2,1328; break;
		case 1324: mes "�]^0000ff�X�v�[��^000000���������B"; set '@quest2,1328; break;
		case 1325: mes "�]^0000ff��Ɨp�̒��C^000000���������B"; set '@quest2,1328; break;
		case 1326: mes "�]^0000ff���^000000���������B"; set '@quest2,1328; break;
		case 1327: mes "�]^0000ff�X�q^000000���������B"; set '@quest2,1328; break;
		}
		mes "�@�m�F�̂��߂�";
		mes "�@�v�l�̂Ƃ���֎����Ă������]";
		delquest '@quest;
		setquest '@quest2;
		close;
	}
	mes "�]��������B���͋���ۂ��]";
	close;
}

rockrdg1.gat,100,230,3	duplicate(��#rkq1321)	��#rkq1323	550
rockrdg1.gat,58,195,3	duplicate(��#rkq1321)	��#rkq1324	550
rockrdg1.gat,71,149,3	duplicate(��#rkq1321)	��#rkq1325	550
rockrdg1.gat,109,60,3	duplicate(��#rkq1321)	��#rkq1326	550
rockrdg1.gat,191,101,3	duplicate(��#rkq1321)	��#rkq1327	550

//=======================================================
// �ٍ��̏��l�N�G�X�gNPC
//-------------------------------------------------------
harboro1.gat,216,262,7	script	�����̃��N�_#1	938,{}
harboro1.gat,210,262,7	script	�����̃��N�_#2	938,{}
harboro1.gat,197,262,7	script	�����̃��N�_#3	938,{}
harboro1.gat,192,262,7	script	�����̃��N�_#4	938,{}
harboro1.gat,223,261,1	script	�����̃��N�_#5	938,{}
harboro1.gat,227,263,1	script	�����̃��N�_#6	938,{}
harboro1.gat,237,256,3	script	�����̃��N�_#7	938,{}
harboro1.gat,234,259,3	script	�����̃��N�_#8	938,{}
harboro1.gat,229,258,6	script	�����̃��N�_#9	938,{}
harboro1.gat,225,257,6	script	�����̃��N�_#10	938,{}
harboro1.gat,238,258,3	script	�����̃��N�_#11	938,{}
harboro1.gat,236,252,6	script	�����̃��N�_#12	938,{}

harboro1.gat,226,255,3	script	�����̃��N�_#13	938,{
	mes "[���N�_]";
	mes "�Ԃ������c�c�B";
	close;
}

harboro1.gat,227,260,3	script	�����̃��N�_#14	938,{
	mes "[���N�_]";
	mes "�Ԃ�Ԃ�`�B";
	close;
}

harboro1.gat,232,258,6	script	�����̃��N�_#15	938,{
	mes "[���N�_]";
	mes "�Ԃ������`�`�B";
	close;
}

harboro1.gat,235,255,6	script	�����̃��N�_#16	938,{
	mes "[���N�_]";
	mes "�Ԃ�Ԃ�`�B";
	close;
}

harboro1.gat,229,256,7	script	�V�������b�g	938,{
	initnpctimer;
	unittalk "�V�������b�g : �Ԃ����`�`�`�I";
	end;
OnTimer1000:
	stopnpctimer;
	donpcevent "�A�u���n���E�t�[�f�B��::OnTalk2";
	end;
}

harboro1.gat,231,251,4	script	���l�̔�	10005,{
	donpcevent "�A�u���n���E�t�[�f�B��::OnTalk1";
	end;
}

harboro1.gat,231,254,3	script	�A�u���n���E�t�[�f�B��	58,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "���ٍ͈��̏��l�A";
		mes "�A�u���n���E�t�[�f�B���Ƃ����܂��I";
		next;
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�c�O�ł����A";
		mes "���͎���͖��������ł��`�B";
		mes "^ff0000�����c�̖�肪����^000000������";
		mes "���b���܂���`�B";
		close;
	}
	if(BaseLevel < 130) {
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "���ٍ͈��̏��l�A";
		mes "�A�u���n���E�t�[�f�B���Ƃ����܂��I";
		next;
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�c�O�ł����A���Ȃ��̎��͂ł�";
		mes "���̎���͖��������ł��`�B";
		mes "^ff0000BaseLv130�ȏ�^000000�ɂȂ�����";
		mes "���b���܂���`�B";
		close;
	}
	if(!checkquest(12410)) {
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�͂��߂܂��ā`";
		mes "���ٍ͈��̏��l�A";
		mes "�A�u���n���E�t�[�f�B���Ƃ����܂��I";
		next;
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "���Ǝ���o��������";
		mes "���������m�������Ă��܂����H";
		next;
		if(select("�ǂ�ȃ��m�ł����H","���͎���Ȃ񂩂��܂���I") == 2) {
			mes "[�A�u���n���E�t�[�f�B��]";
			mes "�����`�I";
			mes "�`���ҁA���\�ł��ˁB";
			mes "����Ȗ�؂Ȑl�Ƃ�";
			mes "����ł��܂����`�B";
			close;
		}
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�t�[�f�B���A���E������܂��B";
		mes "���������m���������񔃂��܂��B";
		mes "����͐V�嗤�̓��Y�i��";
		mes "�W�߂Ă��܂��B";
		next;
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�t�[�f�B���A���̊J��n��";
		mes "���ʂȕ������߂Ă��܂��I";
		mes "���������̃��m����ɓ��ꂽ��";
		mes "�����ė��Ă��������I";
		next;
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�t�[�f�B�����ǂ��l�i��";
		mes "���Ă����܂��B";
		mes "���ł����}���܂��I";
		setquest 12410;
		compquest 12410;
		close;
	}
	if(checkquest(12411)) {
		if(checkquest(12411) & 0x2 == 0) {
			mes "[�A�u���n���E�t�[�f�B��]";
			mes "���`���A";
			mes "���͂���ȏ������܂����`�B";
			mes "�܂���ŗ��ĉ������ˁ`�B";
			close;
		}
		delquest 12411;
	}
	mes "[�A�u���n���E�t�[�f�B��]";
	mes "�����̓t�[�f�B����";
	mes "����������܂����H";
	mes "^ff0000���Ȃ݂ɁA����ł���̂�";
	mes "��T�Ԃɂǂꂩ�ЂƂł��B";
	mes "���ӂ��đI��ł��������ˁ`�B^000000";
	next;
	switch(select("��߂�",
				"^777777�Y��ȍ��@50��^000000",
				"^777777�ғł̕��@50��^000000",
				"^777777���e���Ȓe��@50��^000000",
				"^777777�����c�X�J�[�t�@50��^000000",
				"^777777���F�̃}�t���[�@50��^000000",
				"^777777��ꂽ�V���b�g�K���@10��^000000",
				"^777777�Â����{���o�[�@10��^000000",
				"^777777���e���ȃV�~�^�[�@10��^000000",
				"^777777���n���̊k�@10��^000000",
				"^777777�����l�Y�~�̂����ہ@10��^000000"
	)) {
	case 1:
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�����c�c��߂܂����H";
		close;
	case 2:
		set '@nameid,25276;
		set '@num,50;
		break;
	case 3:
		set '@nameid,25277;
		set '@num,50;
		break;
	case 4:
		set '@nameid,25279;
		set '@num,50;
		break;
	case 5:
		set '@nameid,25278;
		set '@num,50;
		break;
	case 6:
		set '@nameid,25283;
		set '@num,50;
		break;
	case 7:
		set '@nameid,25280;
		set '@num,10;
		break;
	case 8:
		set '@nameid,25282;
		set '@num,10;
		break;
	case 9:
		set '@nameid,25281;
		set '@num,10;
		break;
	case 10:
		set '@nameid,25284;
		set '@num,10;
		break;
	case 11:
		set '@nameid,25285;
		set '@num,10;
		break;
	}
	if(countitem('@nameid) < '@num) {
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "��H";
		mes "�ǂ��ɂ���܂����H";
		mes "�t�[�f�B���ɂ�����";
		mes "�����Ă������m�I";
		close;
	}
	mes "[�A�u���n���E�t�[�f�B��]";
	mes "^0000ff" +getitemname('@nameid)+ "�@" +'@num+ "��^000000��";
	mes "^0000ff���b�N���b�W�R�C��1��^000000��";
	mes "�������܂��`�B";
	mes "����ł����ł����`�H";
	next;
	if(select("�ǂ��ł�","�s���Ȏ���ɂ͉����Ȃ�") == 2) {
		mes "[�A�u���n���E�t�[�f�B��]";
		mes "�����`�I";
		mes "�`���ҁA�����ł��ˁ`�B";
		mes "���Ƃ̎����";
		mes "�s������Ȃ��ł���`�B";
		close;
	}
	delitem '@nameid,'@num;
	setquest 12411;
	getitem 25250,1;
	getexp 10000000,0,1;
	getexp 0,4000000,0;
	mes "[�A�u���n���E�t�[�f�B��]";
	mes "���肪�Ƃ��������܂��`�B";
	mes "�ǂ��������ł����`�B";
	next;
	mes "[�A�u���n���E�t�[�f�B��]";
	mes "�����ȊO�̓y�n�ł�";
	mes "���邱�Ƃ̂ł��Ȃ�";
	mes "�ς�������m�΂���ł��B";
	mes "�t�[�f�B���ƂĂ��C�ɓ���܂����I";
	close;
OnTalk1:
	unittalk "�A�u���n���E�t�[�f�B�� : �󔠂ɏ���ɐG������_������I";
	end;
OnTalk2:
	unittalk "�A�u���n���E�t�[�f�B�� : ���̗p���A�V�������b�g�`�I";
	end;
}

//=======================================================
// �H�ނ��Ȃ��I�N�G�X�gNPC
//-------------------------------------------------------
harboro1.gat,352,199,5	script	�󕠂̘J����#1	99,5,5,{
	end;
OnTouch:
	unittalk "�󕠂̘J���� : �����A�����������B�ǂ����ė񂪂܂���������Ȃ��񂾁B";
	end;
}

harboro1.gat,352,196,5	script	�󕠂̘J����#2	98,{}
harboro1.gat,352,193,5	script	�󕠂̘J����#3	855,{}
harboro1.gat,352,190,5	script	�󕠂̘J����#4	100,{}

harboro1.gat,352,187,5	script	��������ł݂������̐l#	870,5,5,{
	end;
OnTouch:
	unittalk "��������ł݂������̐l : ����͉��̗�Ȃ񂾁H�@���������̂��H";
	end;
}

harboro1.gat,352,184,5	script	�󕠂̘J����#6	99,{}
harboro1.gat,352,181,5	script	�󕠂̘J����#7	846,{}

harboro1.gat,352,178,5	script	�󕠂̘J����#8	100,5,5,{
	end;
OnTouch:
	unittalk "�󕠂̘J���� : ���т�H�ׂ�ׂ�3���Ԃ����΂Ȃ��Ƃ����Ȃ��Ƃ́B����͍����Ȃ��H";
	end;
}

harboro1.gat,352,175,5	script	�󕠂̘J����#9	99,{}
harboro1.gat,352,172,5	script	�󕠂̘J����#10	98,{}

harboro1.gat,352,169,5	script	�󕠂̘J����#11	855,5,5,{
	end;
OnTouch:
	unittalk "�󕠂̘J���� : ����������Ŏ��̔Ԃ��I";
	end;
}

harboro1.gat,353,166,5	script	�󕠂̘J����#12	99,{}

harboro1.gat,355,164,5	script	�󕠂̘J����#13	100,5,5,{
	end;
OnTouch:
	unittalk "�󕠂̘J���� : �����I�@�݂�ȕ���ł���̂������Ȃ��̂��H�@��̌��ɕ��ׂ�I";
	end;
}

harboro1.gat,357,163,3	script	���H�S��	886,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[���H�S��]";
		mes "�����A�ז������Ȃ��ł���I";
		mes "�����c���\��Ă��邹����";
		mes "���������Z�����񂾁I";
		next;
		mes "�]�����c�̖�肪�������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(BaseLevel < 130) {
		mes "[���H�S��]";
		mes "�����A���̗񂪌����Ȃ��̂��H";
		mes "�ǂ��̒N���͒m��Ȃ����A";
		mes "�z�����󂯂����Ȃ��ɕ��ׁB";
		next;
		mes "�]��O��������Ă��܂����B";
		mes "�@^ff0000BaseLv130�ȏ�^000000�ɂȂ�����";
		mes "�@�܂����悤�]";
		close;
	}
	if(!checkquest(12381)) {	// ����
		mes "[���H�S��]";
		mes "�����A���̗񂪌����Ȃ��̂��H";
		mes "�ǂ��̒N���͒m��Ȃ����A";
		mes "�z�����󂯂����Ȃ��ɕ��ׁB";
		next;
		mes "[���H�S��]";
		mes "�z�����󂯂ɗ����񂶂�Ȃ��̂��H";
		mes "���ꂶ��Ȃ�̗p���H";
		mes "�p�������Ȃ炠�����֍s���Ă���B";
		mes "�����ł����H�����s������";
		mes "�C�������Ă���񂾁I";
		next;
		mes "[���H�S��]";
		mes "���̐l�����͉����Ԃ��҂��Ă��邪�A";
		mes "�H�ނ��͂��Ȃ�����";
		mes "�z�����ł��Ȃ��܂܂��B";
		mes "�����{���Ȃ瓞�����Ă���ׂ�";
		mes "�H�ނ������͂��Ă��Ȃ��񂾁B";
		mes "���������҂ɂ����E������B";
		next;
		menu "�O�ŐH�ނ𒲒B���Ă݂�̂́H",-;
		mes "[���H�S��]";
		mes "�����l���Ȃ������킯����Ȃ��B";
		mes "�߂��ŐH�ނ𒲒B���悤�Ǝ��݂��B";
		mes "�����O�͍��Ɛ΂����ŁA";
		mes "�ǂ��ɂ��H�ו��Ȃ񂩂Ȃ������B";
		next;
		mes "[���H�S��]";
		mes "����ȏ��ŋ��H�����^�c���悤�Ƃ��A";
		mes "�����ǂ������Ă�����B";
		next;
		mes "[�󕠂̘J����]";
		mes "���A�H�ނ��Ȃ��ƌ��������H";
		mes "�H�ו����S���Ȃ��Ȃ����̂�!?";
		next;
		mes "[���H�S��]";
		mes "����A���������B";
		mes "�����͂��̂��x��Ă��邾��������A";
		mes "�ςȂ��Ƃ͌���Ȃ��ł���I";
		next;
		menu "��`���܂��傤���H",-;
		mes "[���H�S��]";
		mes "��`���Ă����̂��H";
		mes "�������I�@���ꂶ�Ⴑ�����悤�B";
		mes "�K�v�ȐH�ނ��������邩��A";
		mes "�N�̓~�b�h�K���h�嗤�ɍs��";
		mes "�����𒲒B���Ă��Ă���B";
		mes "�ǂ����H�@��������V���p�ӂ���B";
		next;
		if(select("�����󂯂�","�f��") == 2) {
			mes "[���H�S��]";
			mes "���c�c�H";
			mes "��`���Ă����񂶂�";
			mes "�Ȃ������̂��H";
			close;
		}
		mes "[���H�S��]";
		mes "�������I�@�_�񐬗����I";
		mes "���ꂶ�ᒲ�B���Ăق����i����";
		mes "���X�g����邩��A";
		mes "������Ƒ҂��ĂĂ����B";
		next;
		mes "[���H�S��]";
		mes "�c�c�B";
		next;
		mes "[���H�S��]";
		mes "�悵�A�ł����B";
		setquest 12381;
		compquest 12381;
		next;
	}
	if(checkquest(12382)) {
		if(checkquest(12382)&2 == 0) {
			mes "[���H�S��]";
			mes "�Ƃ肠�������}�͉z�����悤���B";
			mes "�܂����ނ��B";
			close;
		}
		delquest 12382;
	}
	if(checkquest(12383)) {
		set '@quest,12383;
		set '@itemid,516;
		set '@count,160;
	}
	else if(checkquest(12384)) {
		set '@quest,12384;
		set '@itemid,517;
		set '@count,60;
	}
	else if(checkquest(12385)) {
		set '@quest,12385;
		set '@itemid,515;
		set '@count,160;
	}
	else if(checkquest(12386)) {
		//TODO
	}
	else if(checkquest(12387)) {
		set '@quest,12387;
		set '@itemid,535;
		set '@count,160;
	}
	else if(checkquest(12388)) {
		set '@quest,12388;
		set '@itemid,581;
		set '@count,60;
	}
	if('@quest) {
		if(countitem('@itemid) < '@count) {
			mes "[���H�S��]";
			mes "^0000ff" + getitemname('@itemid) + '@count + "��^000000��";
			mes "�����ė��Ă���I";
			mes "�傫�ȓs�s�Ȃ炾������";
			mes "��舵���Ă���͂����B";
			close;
		}
		delitem '@itemid,'@count;
		delquest '@quest;
		setquest 12382;
		getitem 25250,1;
		getexp 10000000,0,1;
		getexp 0,4000000,0;
		mes "[���H�S��]";
		mes "�����A����ł����H�ނ��ȁI";
		mes "�������łȂ�Ƃ��Ȃ肻�����B";
		mes "���������悠�肪�Ƃ��I";
		close;
	}
	mes "[���H�S��]";
	mes "����K�v�ȐH�ނ̃��X�g�͂��ꂾ�B";
	mes "�ł��邾�����������Ă��Ă���B";
	next;
	if(select("�����������󂯂�","���͖Z�����̂Ō�ɂ���") == 2) {
		mes "[���H�S��]";
		mes "�������B";
		mes "�݂�ȕ����󂩂��Ă���񂾁B";
		mes "�p���Еt������";
		mes "�����ɂł����Ă���B";
		close;
	}
	switch(rand(6)) {
	case 0:
		setquest 12383;
		mes "[���H�S��]";
		mes "�����̃��j���[�̓R���b�P�Ȃ񂾂��A";
		mes "���܂��ɐH�ނ��͂��Ă��Ȃ��񂾁B";
		next;
		mes "[���H�S��]";
		mes "^0000ff����160��^000000��";
		mes "�����ė��Ă���I";
		mes "�傫�ȓs�s�Ȃ炾������";
		mes "��舵���Ă���͂����B";
		close;
	case 1:
		setquest 12384;
		mes "[���H�S��]";
		mes "�H���̃��C���ł������";
		mes "�����Ȃ��Ă��܂����I";
		mes "����͍Ђ����I";
		next;
		mes "[���H�S��]";
		mes "^0000ff�ɂ�50��^000000��";
		mes "�����ė��Ă���I";
		mes "�傫�ȓs�s�Ȃ炾������";
		mes "��舵���Ă���͂����B";
		close;
	case 2:
		setquest 12385;
		mes "[���H�S��]";
		mes "���ɂ��锨�ň�ĂĂ���";
		mes "�j���W�����������H";
		mes "���܂�ɂ���������";
		mes "�w���Ǝv������B";
		next;
		mes "[���H�S��]";
		mes "�V�`���[�ɓ���悤�Ǝv������";
		mes "���܂�ɂ�����������";
		mes "�����̎w������";
		mes "���ꂻ���ɂȂ����������I";
		next;
		mes "[���H�S��]";
		mes "^0000ff�j���W��160��^000000��";
		mes "�����ė��Ă���I";
		mes "�傫�ȓs�s�Ȃ炾������";
		mes "��舵���Ă���͂����B";
		close;
	case 3:
		//TODO
	case 4:
		setquest 12387;
		mes "[���H�S��]";
		mes "�J�{�`���V�`���[����肽���̂�";
		mes "�J�{�`���������񂾁B";
		next;
		mes "[���H�S��]";
		mes "^0000ff�J�{�`��160��^000000��";
		mes "�����ė��Ă���I";
		mes "�傫�ȓs�s�Ȃ炾������";
		mes "��舵���Ă���͂����B";
		close;
	case 5:
		setquest 12388;
		mes "[���H�S��]";
		mes "���A�c���Ă���H�ނō���̂�";
		mes "�L�m�R�X�[�v���炢�Ȃ񂾂��A";
		mes "�L�m�R���Ȃ��B";
		mes "�H�p�L�m�R�������ė��Ă���Ȃ����H";
		next;
		mes "[���H�S��]";
		mes "^0000ff�H�p�L�m�R60��^000000��";
		mes "�����ė��Ă���I";
		mes "�傫�ȓs�s�Ȃ炾������";
		mes "��舵���Ă���͂����B";
		close;
	}
}

//=======================================================
// �����ێ������N�G�X�gNPC
//-------------------------------------------------------
harboro1.gat,346,157,6	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev01	732,{}
harboro1.gat,347,155,6	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev02	733,{}
harboro1.gat,349,157,6	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev03	734,{}
harboro1.gat,351,154,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev04	735,{}
harboro1.gat,348,148,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev05	753,{}
harboro1.gat,353,156,6	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev06	755,{}
harboro1.gat,347,151,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev07	732,{}
harboro1.gat,354,149,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev08	733,{}
harboro1.gat,345,149,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev09	734,{}
harboro1.gat,352,150,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev10	735,{}
harboro1.gat,350,149,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev11	753,{}
harboro1.gat,354,153,7	script	�J���ӗ~�Ɉ��鋁�E��::rockridge_ev12	732,{}

harboro1.gat,352,154,0	script	#r_q1	139,5,5,{
	//�N�G�X�g���͔������Ȃ�
	//�󒍎��Ƀ����_������
OnTouch:
	switch(rand(6)) {
	case 0: unittalk getnpcid(0,"rockridge_ev01"),"�J���ӗ~�Ɉ��鋁�E�� : ���̘r�Ȃ炷���Ɍ���ɓ����͂��Ȃ񂾂��A�Ȃ����ۂ���񂾁H"; break;
	case 1: unittalk getnpcid(0,"rockridge_ev03"),"�J���ӗ~�Ɉ��鋁�E�� : ���Q����ׂɂ����ɗ����Ƃł��v���Ă���̂��H�@�����d��������I"; break;
	case 2: unittalk getnpcid(0,"rockridge_ev05"),"�J���ӗ~�Ɉ��鋁�E�� : �����Z����A������Ɨ���Ă���Ȃ��H�@�ז�����B"; break;
	case 3: unittalk getnpcid(0,"rockridge_ev07"),"�J���ӗ~�Ɉ��鋁�E�� : �~�b�h�K���h���痈���c�Ɏ҂Ȃ̂��H�@���������������낿��낵�Ă��Ėڏ�肾�B"; break;
	case 4: unittalk getnpcid(0,"rockridge_ev09"),"�J���ӗ~�Ɉ��鋁�E�� : �ǂ����Ď��̓_���Ȃ񂾁H�@�O�ɂ���R���[�e���炢�͗]�T�œ|�����Ƃ��ł���񂾂�I"; break;
	case 5: unittalk getnpcid(0,"rockridge_ev11"),"�J���ӗ~�Ɉ��鋁�E�� : �����c�A�R���[�e�����p�[�e�B�[���W���܂��B"; break;
	}
	end;
}

harboro1.gat,357,155,3	script	�|�S���x�c������t	880,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�|�S���x�c������t]";
		mes "�ŋ߁A�����c�̊�����";
		mes "�����ɂȂ��Ă��Ă���B";
		mes "�댯�Ȃ̂ō��͎d���̈˗���";
		mes "���Ă��Ȃ��񂾁B";
		next;
		mes "�]�����c�̖�肪�������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(BaseLevel < 130) {
		mes "[�|�S���x�c������t]";
		mes "�������ǎ������ɂ�";
		mes "�������������z���K�v�Ȃ񂾁B";
		mes "BaseLv130�ȏ�͂Ȃ��ƂˁB";
		close;
	}
	if(!checkquest(12389)) {
		mes "[�|�S���x�c������t]";
		mes "�����A�����̋������Ȗ`���҂���B";
		mes "�d�������炢�ɗ����̂��H";
		next;
		mes "[�|�S���x�c������t]";
		mes "���̃��b�N���b�W�̒���";
		mes "���S���ĕ�炷���߂ɂ́A";
		mes "����I�Ɏ��ӂ̃����X�^�[��";
		mes "���炳�Ȃ���Ȃ�Ȃ��񂾁B";
		next;
		mes "[�|�S���x�c������t]";
		mes "���������ɂ���l��";
		mes "�����X�^�[��苭���l��";
		mes "���܂肢�Ȃ��B";
		mes "���ہA�قƂ�ǂ��z�R�œ������߂�";
		mes "����Ă����J���҂�����ȁB";
		next;
		mes "[�|�S���x�c������t]";
		mes "�����Ŏ��͂̂��肻���Ȗ`���҂�";
		mes "��������A���̎d�������Ȃ���";
		mes "���������Ă���킯���B";
		mes "�������������A�N�̎��͂́c�c";
		next;
		mes "[�|�S���x�c������t]";
		mes "�����A�ƂĂ������I";
		mes "���i�I�@���S�ɍ��i���I";
		next;
		mes "[�|�S���x�c������t]";
		mes "�ǂ����낤�H";
		mes "���̎d���������󂯂Ă݂Ȃ����H";
		next;
		if(select("�����ł���","�����l���Ă݂Ă���c�c") == 2) {
			mes "[�|�S���x�c������t]";
			mes "�N�ɂƂ��Ă������b����Ȃ��͂����B";
			mes "�悭�l���Ă݂Ă���B";
			close;
		}
		mes "[�|�S���x�c������t]";
		mes "�悵�A���ꂶ�Ⴓ�������d����";
		mes "�˗����悤�B";
		setquest 12389;
		compquest 12389;
		next;
	}
	if(checkquest(12390)) {
		if(checkquest(12390) & 0x2 == 0) {
			mes "[�|�S���x�c������t]";
			mes "���̈˗��܂ł͂������������肻�����B";
			mes "�܂���ŗ��Ă���B";
			close;
		}
		delquest 12390;
		mes "[�|�S���x�c������t]";
		mes "�悭���Ă��ꂽ�B";
		mes "�������������d���̈˗����B";
		next;
	}
	for(set '@i,12391; '@i <= 12394; set '@i,'@i+1)
		if(checkquest('@i))
			break;
	if('@i != 12395) {
		if(checkquest('@i) & 0x4) {
			mes "[�|�S���x�c������t]";
			mes "�N�A�����ȁI";
			mes "�����Ƃ�萋����Ƃ́c�c";
			next;
			if(checkitemblank() == 0) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			delquest '@i;
			setquest 12390;
			getitem 25250,1;
			getexp 20000000,0,1;
			getexp 0,8000000,0;
			mes "[�|�S���x�c������t]";
			mes "�{���ɂ��肪�Ƃ��B";
			mes "������낵�����ނ�B";
			close;
		}
		mes "[�|�S���x�c������t]";
		mes "�ǂ������H";
		mes "���ׂ�����Y�ꂽ�̂��H";
		next;
		if(select("�d���̓��e���m�F����","^FF0000�d�����L�����Z������^000000") == 2) {
			mes "[�|�S���x�c������t]";
			mes "�ȂɁH";
			mes "�L�����Z���������̂��H";
			mes "�L�����Z�������";
			mes "����܂ł̏󋵂͔j������邪�A";
			mes "����ł����̂��H";
			next;
			if(select("^FF0000����ł��܂�Ȃ�^000000","^0000FF��͂葱����^000000") == 2) {
				mes "[�|�S���x�c������t]";
				mes "�������A�������藊�ނ��B";
				close;
			}
			delquest '@i;
			mes "[�|�S���x�c������t]";
			mes "�d�����L�����Z���������B";
			mes "���͂����Ɨ��ނ��B";
			close;
		}
		mes "[�|�S���x�c������t]";
		mes "���ꂶ�������x�����悤�B";
		next;
		switch('@i) {
		case 12391: set '@msg$,"���C�t�������������"; break;
		case 12392: set '@msg$,"�Ԃ����ʂ����Ԃ��Ă�����"; break;
		case 12393: set '@msg$,"��т����Ă�����"; break;
		case 12394:
			mes "[�|�S���x�c������t]";
			mes "�L���N�^�[���̒��ƃ��b�N���b�W��";
			mes "����Ȃ�ɗF�D�I�Ȍ𗬂����Ă���B";
			mes "�����ŋ߁A�������ԓ���";
			mes "�R���[�e�̏P���������Ă���B";
			next;
			mes "[�|�S���x�c������t]";
			mes "�L���N�^�[���Ƃ̌𗬂�";
			mes "�R���[�e�̂����ŖW�Q�����̂�";
			mes "��肾�B";
			next;
			mes "[�|�S���x�c������t]";
			mes "������^0000ff�R���[�e^000000��";
			mes "50�C�قǓ|���Ăق����B";
			close;
		}
		mes "[�|�S���x�c������t]";
		mes "���̎��ӂň�Ԃ̋��Ђ͂�͂苍���c���B";
		mes "�c���񓹂Ȃ����ł͂Ȃ��A";
		mes "�m���������Ă���B";
		next;
		mes "[�|�S���x�c������t]";
		mes "���K�͂ȏP�����N������";
		mes "�܂�Ŏ��������ǂ��܂őς����邩";
		mes "�����Ă��邩�̂悤���B";
		next;
		mes "[�|�S���x�c������t]";
		mes "�����ł܂���ɔނ�̍s����";
		mes "�}������K�v������B";
		mes "�����c�̒�����";
		mes "^0000ff" +'@msg$+ "^000000��";
		mes "50�l�|���Ă���B";
		close;
	}
	mes "[�|�S���x�c������t]";
	mes "������d���͂��ꂾ�B";
	mes "�D���Ȃ��̂�I��ł���B";
	mes "^FF0000���Ȃ݂ɕ����̎d����";
	mes "�����Ɏ󂯂邱�Ƃ͋֎~���Ă���B";
	mes "�d���̕񍐂�������A���̉Ηj����";
	mes "���߂܂Ŏ��̎d���͎󂯂��Ȃ����B^000000";
	next;
	switch(select("���E���h���C�_�[�ގ�","�T�C�h���C�_�[�ގ�","�u���[�h���C�_�[�ގ�","�R���[�e�ގ�","��߂�")) {
	case 1:
		set '@msg$,"���C�t�������������";
		set '@quest,12391;
		break;
	case 2:
		set '@msg$,"�Ԃ����ʂ����Ԃ��Ă�����";
		set '@quest,12392;
		break;
	case 3:
		set '@msg$,"��т����Ă�����";
		set '@quest,12393;
		break;
	case 4:
		mes "[�|�S���x�c������t]";
		mes "�L���N�^�[���̒��ƃ��b�N���b�W��";
		mes "����Ȃ�ɗF�D�I�Ȍ𗬂����Ă���B";
		mes "�����ŋ߁A�������ԓ���";
		mes "�R���[�e�̏P���������Ă���B";
		next;
		mes "[�|�S���x�c������t]";
		mes "�L���N�^�[���Ƃ̌𗬂�";
		mes "�R���[�e�̂����ŖW�Q�����̂�";
		mes "��肾�B";
		next;
		mes "[�|�S���x�c������t]";
		mes "������^0000ff�R���[�e^000000��";
		mes "50�C�قǓ|���Ăق����B";
		mes "���̎d���ł������H";
		next;
		if(select("�͂�","��߂�") == 2) {
			mes "[�|�S���x�c������t]";
			mes "�������B";
			mes "�C���ς������܂����Ă���B";
			close;
		}
		setquest 12394;
		mes "[�|�S���x�c������t]";
		mes "���ꂶ��A��낵�����񂾂��B";
		switch(rand(4)) {
		case 0: unittalk getnpcid(0,"rockridge_ev02"),"�J���ӗ~�Ɉ��鋁�E�� : ���߂�����Ȃ����I"; break;
		case 1: unittalk getnpcid(0,"rockridge_ev04"),"�J���ӗ~�Ɉ��鋁�E�� : �����I�@�������͂ǂ�����ƁI"; break;
		case 2: unittalk getnpcid(0,"rockridge_ev07"),"�J���ӗ~�Ɉ��鋁�E�� : ���ɂ��d���������A�d�����I"; break;
		case 3: unittalk getnpcid(0,"rockridge_ev09"),"�J���ӗ~�Ɉ��鋁�E�� : �l��I��Ŏd����^���Ă���̂�!?"; break;
		}
		close;
	case 5:
		mes "[�|�S���x�c������t]";
		mes "�������B";
		mes "�C���ς������܂����Ă���B";
		close;
	}
	mes "[�|�S���x�c������t]";
	mes "���̎��ӂň�Ԃ̋��Ђ͂�͂苍���c���B";
	mes "�c���񓹂Ȃ����ł͂Ȃ��A";
	mes "�m���������Ă���B";
	next;
	mes "[�|�S���x�c������t]";
	mes "���K�͂ȏP�����N������";
	mes "�܂�Ŏ��������ǂ��܂őς����邩";
	mes "�����Ă��邩�̂悤���B";
	next;
	mes "[�|�S���x�c������t]";
	mes "�����ł܂���ɔނ�̍s����";
	mes "�}������K�v������B";
	mes "�����c�̒�����";
	mes "^0000ff" +'@msg$+ "^000000��";
	mes "50�l�|���Ă���B";
	mes "���̎d���ł������H";
	next;
	if(select("�͂�","��߂�") == 2) {
		mes "[�|�S���x�c������t]";
		mes "�������B";
		mes "�C���ς������܂����Ă���B";
		close;
	}
	setquest '@quest;
	mes "[�|�S���x�c������t]";
	mes "���ꂶ��A��낵�����񂾂��B";
	switch(rand(6)) {
	case 0: unittalk getnpcid(0,"rockridge_ev02"),"�J���ӗ~�Ɉ��鋁�E�� : ���߂�����Ȃ����I"; break;
	case 1: unittalk getnpcid(0,"rockridge_ev04"),"�J���ӗ~�Ɉ��鋁�E�� : �����I�@�������͂ǂ�����ƁI"; break;
	case 2: unittalk getnpcid(0,"rockridge_ev07"),"�J���ӗ~�Ɉ��鋁�E�� : ���ɂ��d���������A�d�����I"; break;
	case 3: unittalk getnpcid(0,"rockridge_ev09"),"�J���ӗ~�Ɉ��鋁�E�� : �l��I��Ŏd����^���Ă���̂�!?"; break;
	default: unittalk getnpcid(0,"rockridge_ev11"),"�J���ӗ~�Ɉ��鋁�E�� : �����c���ɋ󂫂��������玄���c�c"; break;
	}
	close;
}

harboro1.gat,357,152,3	script	�|�S���x�c�㋉��t	884,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�|�S���x�c�㋉��t]";
		mes "�ŋ߁A�����c�̊�����";
		mes "�����ɂȂ��Ă��Ă���B";
		mes "�댯�Ȃ̂ō��͎d���̈˗���";
		mes "���Ă��Ȃ��񂾁B";
		next;
		mes "�]�����c�̖�肪�������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(BaseLevel < 160) {
		mes "[�|�S���x�c�㋉��t]";
		mes "�C�����Ă����̂͂��肪�������A";
		mes "�N�̎��͂ł͏������������낤�B";
		mes "�Œ�ł�BaseLv160�ȏ�͕K�v���B";
		close;
	}
	if(!checkquest(12389)) {	// ������
		mes "[�|�S���x�c�㋉��t]";
		mes "�����A�����̋������Ȗ`���҂���B";
		mes "�d�������炢�ɗ����̂��H";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "���̃��b�N���b�W�̒���";
		mes "���S���ĕ�炷���߂ɂ́A";
		mes "����I�Ɏ��ӂ̃����X�^�[��";
		mes "���炳�Ȃ���Ȃ�Ȃ��񂾁B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "���������ɂ���l��";
		mes "�����X�^�[��苭���l��";
		mes "���܂肢�Ȃ��B";
		mes "���ہA�قƂ�ǂ��z�R�œ������߂�";
		mes "����Ă����J���҂�����ȁB";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�����Ŏ��͂̂��肻���Ȗ`���҂�";
		mes "��������A���̎d�������Ȃ���";
		mes "���������Ă���킯���B";
		mes "�������������A�N�̎��͂́c�c";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�����A�ƂĂ������I";
		mes "���i�I�@���S�ɍ��i���I";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�ǂ����낤�H";
		mes "���̎d���������󂯂Ă݂Ȃ����H";
		next;
		if(select("�����ł���","�����l���Ă݂Ă���c�c") == 2) {
			mes "[�|�S���x�c�㋉��t]";
			mes "�N�ɂƂ��Ă������b����Ȃ��͂����B";
			mes "�悭�l���Ă݂Ă���B";
			close;
		}
		mes "[�|�S���x�c�㋉��t]";
		mes "�悵�A���ꂶ�Ⴓ�������d����";
		mes "�˗����悤�B";
		setquest 12389;
		compquest 12389;
		next;
	}
	if(checkquest(12398)) {
		if(checkquest(12398) & 0x2 == 0) {
			mes "[�|�S���x�c�㋉��t]";
			mes "���̈˗��܂ł͂������������肻�����B";
			mes "�܂���ŗ��Ă���B";
			close;
		}
		delquest 12398;
		mes "[�|�S���x�c�㋉��t]";
		mes "�悭���Ă��ꂽ�B";
		mes "�������������d���̈˗����B";
		next;
	}
	for(set '@i,12395; '@i <= 12402; set '@i,'@i+1)
		if(checkquest('@i))
			break;
	if('@i != 12403) {
		if(checkquest('@i) & 0x4) {
			mes "[�|�S���x�c�㋉��t]";
			mes "�����I������̂��B";
			mes "�����r�O���ȁB";
			next;
			if(checkitemblank() == 0) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			delquest '@i;
			setquest 12398;
			getitem 25250,3;
			getexp 300000000,0,1;
			getexp 0,120000000,0;
			mes "[�|�S���x�c�㋉��t]";
			mes "����͕�V���B";
			mes "�܂���낵�����ނ�B";
			close;
		}
		mes "[�|�S���x�c�㋉��t]";
		mes "�Ȃ񂾁A�d���̓��e��Y�ꂽ�̂��H";
		next;
		if(select("�d���̓��e���m�F����","^FF0000�d�����L�����Z������^000000") == 2) {
			mes "[�|�S���x�c�㋉��t]";
			mes "�ȂɁH";
			mes "�L�����Z���������H";
			mes "�L�����Z�������";
			mes "����܂ł̏󋵂͔j������邪�A";
			mes "����ł����̂��H";
			next;
			if(select("^FF0000����ł��܂�Ȃ�^000000","^0000FF��͂葱����^000000") == 2) {
				mes "[�|�S���x�c�㋉��t]";
				mes "�������A�������藊�ނ��B";
				close;
			}
			delquest '@i;
			mes "[�|�S���x�c�㋉��t]";
			mes "�d�����L�����Z���������B";
			mes "���͂����Ɨ��ނ��B";
			close;
		}
		mes "[�|�S���x�c�㋉��t]";
		mes "�d���Ȃ��A������x�������B";
		next;
		switch('@i) {
		case 12399:
			mes "[�|�S���x�c�㋉��t]";
			mes "�����c�̒��ł��r�����̘A���̂��Ƃ�";
			mes "�G���[�g�����c�ƌĂ�ł���񂾂��A";
			mes "������ɑ΂���d�����B";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "���C�t���������������c�̒��ŁA";
			mes "^0000ff�ڂ���������^000000��";
			mes "�������Ƃ͂��邩�H";
			mes "������15�l�|���Ă���B";
			close;
		case 12400:
			mes "[�|�S���x�c�㋉��t]";
			mes "�����c�̒��ł��r�����̘A���̂��Ƃ�";
			mes "�G���[�g�����c�ƌĂ�ł���񂾂��A";
			mes "������ɑ΂���d�����B";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "�񒚌��e���g�������c�̒��ŁA";
			mes "^0000ff�΂̕��ʂ����Ԃ������^000000��";
			mes "�������Ƃ͂��邩�H";
			mes "������15�l�|���Ă���B";
			close;
		case 12401:
			mes "[�|�S���x�c�㋉��t]";
			mes "�����c�̒��ł��r�����̘A���̂��Ƃ�";
			mes "�G���[�g�����c�ƌĂ�ł���񂾂��A";
			mes "������ɑ΂���d�����B";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "�����g�������c�̒��ŁA";
			mes "^0000ff�����΂̃x�X�g�𒅂Ă�����^000000��";
			mes "�������Ƃ͂��邩�H";
			mes "������15�l�|���Ă���B";
			close;
		case 12402:
			mes "[�|�S���x�c�㋉��t]";
			mes "�z�R�̍�ƈ�����̏��Ȃ񂾂��A";
			mes "�_�o�łŐl��Ⴢ����Ă��܂�";
			mes "�K�X��̃����X�^�[������炵���B";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "�����̓K�X�^�[�ƌĂ΂�Ă��āA";
			mes "����o���Ȃ���΍U�����Ă��Ȃ��B";
			mes "�Ƃ͂����댯�Ȃ̂͊ԈႢ�Ȃ��B";
			mes "�z�R�̓����ɂ���^0000ff�K�X�^�[^000000��";
			mes "20�C�|���Ă���B";
			close;
		case 12395:
			mes "[�|�S���x�c�㋉��t]";
			mes "���̒n���œ����Ă�����ƈ���";
			mes "���đ����ɏ����Ă������B";
			mes "�����𒲍������Ƃ���A";
			mes "�����X�^�[�ɂ��ꂽ�悤���B";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "�J�j�o���E�X�Ƃ���";
			mes "�ƂĂ��������H���̃����X�^�[��";
			mes "�n���Ō̐��𑝂₵�Ă���悤�ŁA";
			mes "��ƈ�����Ƃ����ۂ��Ă���񂾁B";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "�����n���ɍs�����Ƃ�����Ȃ�";
			mes "^0000ff�J�j�o���E�X^000000��";
			mes "5�C�|���Ăق����B";
			close;
		case 12396:
			mes "[�|�S���x�c�㋉��t]";
			mes "�n���Ŏ��H����";
			mes "��ƈ��̎��̂��������A";
			mes "��Ԃ������ĂƂĂ��Ƒ���";
			mes "����������̂���Ȃ������B";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "�n���ɔɐB�����l�Y�~��";
			mes "�d�Ƃ̂悤�����A";
			mes "�����Ă���l�Ԃɂ�";
			mes "�U�����Ă���炵��";
			next;
			mes "[�|�S���x�c�㋉��t]";
			mes "�����n���ɍs�����Ƃ�����Ȃ�";
			mes "^0000ff�v���Y�}���b�g^000000��";
			mes "5�C�|���Ăق����B";
			close;
		}
	}
	mes "[�|�S���x�c�㋉��t]";
	mes "�������͏�������d�������ǁA";
	mes "����Ă݂邩�H";
	mes "^FF0000���Ȃ݂ɕ����̎d����";
	mes "�����Ɏ󂯂邱�Ƃ͋֎~���Ă���B";
	mes "�d���̕񍐂�������A���̉Ηj����";
	mes "���߂܂Ŏ��̎d���͎󂯂��Ȃ����B^000000";
	next;
	switch(select("�g�b�v���E���h���C�_�[�ގ�","�g�b�v�T�C�h���C�_�[�ގ�","�g�b�v�u���[�h���C�_�[�ގ�","�K�X�^�[�ގ�","�J�j�o���E�X�ގ�","�v���Y�}���b�g�ގ�","��߂�")) {
	case 1:
		mes "[�|�S���x�c�㋉��t]";
		mes "�����c�̒��ł��r�����̘A���̂��Ƃ�";
		mes "�G���[�g�����c�ƌĂ�ł���񂾂��A";
		mes "������ɑ΂���d�����B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "���C�t���������������c�̒��ŁA";
		mes "^0000ff�ڂ���������^000000��";
		mes "�������Ƃ͂��邩�H";
		mes "������15�l�|���Ă���B";
		set '@quest,12399;
		break;
	case 2:
		mes "[�|�S���x�c�㋉��t]";
		mes "�����c�̒��ł��r�����̘A���̂��Ƃ�";
		mes "�G���[�g�����c�ƌĂ�ł���񂾂��A";
		mes "������ɑ΂���d�����B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�񒚌��e���g�������c�̒��ŁA";
		mes "^0000ff�΂̕��ʂ����Ԃ������^000000��";
		mes "�������Ƃ͂��邩�H";
		mes "������15�l�|���Ă���B";
		set '@quest,12400;
		break;
	case 3:
		mes "[�|�S���x�c�㋉��t]";
		mes "�����c�̒��ł��r�����̘A���̂��Ƃ�";
		mes "�G���[�g�����c�ƌĂ�ł���񂾂��A";
		mes "������ɑ΂���d�����B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�����g�������c�̒��ŁA";
		mes "^0000ff�����΂̃x�X�g�𒅂Ă�����^000000��";
		mes "�������Ƃ͂��邩�H";
		mes "������15�l�|���Ă���B";
		set '@quest,12401;
		break;
	case 4:
		mes "[�|�S���x�c�㋉��t]";
		mes "�z�R�̍�ƈ�����̏��Ȃ񂾂��A";
		mes "�_�o�łŐl��Ⴢ����Ă��܂�";
		mes "�K�X��̃����X�^�[������炵���B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�����̓K�X�^�[�ƌĂ΂�Ă��āA";
		mes "����o���Ȃ���΍U�����Ă��Ȃ��B";
		mes "�Ƃ͂����댯�Ȃ̂͊ԈႢ�Ȃ��B";
		mes "�z�R�̓����ɂ���^0000ff�K�X�^�[^000000��";
		mes "20�C�|���Ă���B";
		set '@quest,12402;
		break;
	case 5:
		mes "[�|�S���x�c�㋉��t]";
		mes "���̒n���œ����Ă�����ƈ���";
		mes "���đ����ɏ����Ă������B";
		mes "�����𒲍������Ƃ���A";
		mes "�����X�^�[�ɂ��ꂽ�悤���B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�J�j�o���E�X�Ƃ���";
		mes "�ƂĂ��������H���̃����X�^�[��";
		mes "�n���Ō̐��𑝂₵�Ă���悤�ŁA";
		mes "��ƈ�����Ƃ����ۂ��Ă���񂾁B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�����n���ɍs�����Ƃ�����Ȃ�";
		mes "^0000ff�J�j�o���E�X^000000��";
		mes "5�C�|���Ăق����B";
		set '@quest,12395;
		break;
	case 6:
		mes "[�|�S���x�c�㋉��t]";
		mes "�n���Ŏ��H����";
		mes "��ƈ��̎��̂��������A";
		mes "��Ԃ������ĂƂĂ��Ƒ���";
		mes "����������̂���Ȃ������B";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�n���ɔɐB�����l�Y�~��";
		mes "�d�Ƃ̂悤�����A";
		mes "�����Ă���l�Ԃɂ�";
		mes "�U�����Ă���炵��";
		next;
		mes "[�|�S���x�c�㋉��t]";
		mes "�����n���ɍs�����Ƃ�����Ȃ�";
		mes "^0000ff�v���Y�}���b�g^000000��";
		mes "5�C�|���Ăق����B";
		set '@quest,12396;
		break;
	case 7:
		mes "[�|�S���x�c�㋉��t]";
		mes "�킩�����B";
		mes "�l�����ς������";
		mes "�܂����ɐ��������Ă���B";
		close;
	}
	mes "���̎d���ł������H";
	next;
	if(select("�͂�","��߂�") == 2) {
		mes "[�|�S���x�c�㋉��t]";
		mes "�킩�����B";
		mes "�l�����ς������";
		mes "�܂����ɐ��������Ă���B";
		close;
	}
	setquest '@quest;
	mes "[�|�S���x�c�㋉��t]";
	mes "���ꂶ��A���񂾂��B";
	switch(rand(6)) {
	default:
		if('@quest == 12402) {
			unittalk getnpcid(0,"rockridge_ev11"),"�J���ӗ~�Ɉ��鋁�E�� : �K�X�^�[���ɋ󂫂��������玄���c�c";
			break;
		}
		else if('@quest >= 12399) {
			unittalk getnpcid(0,"rockridge_ev11"),"�J���ӗ~�Ɉ��鋁�E�� : �����c���ɋ󂫂��������玄���c�c";
			break;
		}
	case 0: unittalk getnpcid(0,"rockridge_ev02"),"�J���ӗ~�Ɉ��鋁�E�� : ���߂�����Ȃ����I"; break;
	case 1: unittalk getnpcid(0,"rockridge_ev04"),"�J���ӗ~�Ɉ��鋁�E�� : �����I�@�������͂ǂ�����ƁI"; break;
	case 2: unittalk getnpcid(0,"rockridge_ev07"),"�J���ӗ~�Ɉ��鋁�E�� : ���ɂ��d���������A�d�����I"; break;
	case 3: unittalk getnpcid(0,"rockridge_ev09"),"�J���ӗ~�Ɉ��鋁�E�� : �l��I��Ŏd����^���Ă���̂�!?"; break;
	}
	close;
}

//=======================================================
// �z�ǐ�����ƃN�G�X�gNPC
//-------------------------------------------------------
harboro1.gat,347,133,2	script	���т��Ă���n���H#1	870,{}
harboro1.gat,344,133,2	script	���т��Ă���n���H#2	85,{}
harboro1.gat,340,137,3	script	���т��Ă���n���H#3	826,{}
harboro1.gat,338,132,2	script	���т��Ă���n���H#4	854,{}
harboro1.gat,343,137,3	script	���т��Ă���n���H#5	88,{}
harboro1.gat,342,135,2	script	���т��Ă���n���H#6	870,{}
harboro1.gat,344,142,3	script	���т��Ă���n���H#7	709,{}
harboro1.gat,341,131,2	script	���т��Ă���n���H#8	826,{}
harboro1.gat,338,141,3	script	���т��Ă���n���H#9	855,{}
harboro1.gat,347,137,3	script	���т��Ă���n���H#10	88,{}
harboro1.gat,341,141,3	script	���т��Ă���n���H#11	826,{}
harboro1.gat,338,136,3	script	���т��Ă���n���H#12	870,{}

harboro1.gat,341,136,0	script	#r_q2	139,5,5,{
	//�N�G�X�g���͔������Ȃ�
	//�󒍎��Ƀ����_������
OnTouch:
	switch(rand(6)) {
	case 0: unittalk getnpcid(0,"���т��Ă���n���H#2"),"���т��Ă���n���H : �n���ł͍�Ƃ��ł������ɂȂ��B"; break;
	case 1: unittalk getnpcid(0,"���т��Ă���n���H#4"),"���т��Ă���n���H : �ЊQ�⏞��������Ȃ��Ȃ炱�̎d���͂�߂�I"; break;
	case 2: unittalk getnpcid(0,"���т��Ă���n���H#6"),"���т��Ă���n���H : ����Ȃɑ傫�����͏��߂Č����B����ȏケ���Ŏd���͏o���Ȃ��B"; break;
	case 3: unittalk getnpcid(0,"���т��Ă���n���H#8"),"���т��Ă���n���H : �|�ꂽ���������̏ォ�炠���炪�����񂹂ė��āA���͉����o���Ȃ������B����ȂƂ��낾�Ȃ�ĕ����ĂȂ������B"; break;
	case 4: unittalk getnpcid(0,"���т��Ă���n���H#10"),"���т��Ă���n���H : ����ȏ��ɐl�𑗂�Ȃ炻��Ȃ�̕ی�ݔ������O�ɗp�ӂ���I"; break;
	case 5: unittalk getnpcid(0,"���т��Ă���n���H#12"),"���т��Ă���n���H : ���񂽁A�n���ɉ��肽���ƂȂ�����H�@�ǂ�ȕ��ɂȂ��Ă���̂������Ă�肽����B"; break;
	}
	end;
}

harboro1.gat,333,138,6	script	�W�F�C�~�[	861,{
	mes "[�W�F�C�~�[]";
	mes "����������o���̂�";
	mes "��߂Ă���܂��񂩁H";
	mes "���͏����̐ꑮ�鏑�Ȃ�ł���B";
	close;
}

harboro1.gat,334,135,6	script	�W�����{�݊Ǘ�����	853,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�W�����{�݊Ǘ�����]";
		mes "�����c�Ɏ{�݂��P��ꂽ��";
		mes "�ЂƂ��܂���Ȃ��B";
		mes "�ۈ����͉������Ă���񂾁I";
		next;
		mes "�]�����c�̖�肪�������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(BaseLevel < 160) {
		mes "[�W�����{�݊Ǘ�����]";
		mes "�Ȃ񂾌N�́B";
		mes "�낭�Ɏ��͂��Ȃ����";
		mes "�x���������͂Ȃ����I";
		next;
		mes "�]��O��������Ă��܂����B";
		mes "�@^ff0000BaseLv160�ȏ�^000000�ɂȂ�����";
		mes "�@�܂����悤�]";
		close;
	}
	if(!checkquest(12403)) {
		mes "[�W�����{�݊Ǘ�����]";
		mes "�����ɂ͋����D�_����������B";
		mes "�ǂ���������";
		mes "�u�ǉ��蓖�A�ǉ��蓖�v�΂���B";
		mes "����������O�Ɉ�l�O�̎d����";
		mes "����Ă݂���Ă����񂾁I";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "����ŁA�N�͂����炭��ƌ����񂾁H";
		mes "��Ɍ����Ă������A";
		mes "�ǉ��蓖�������̑O�؂��";
		mes "�Ȃ�����ȁB";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�ȂɁH�@�Ⴄ�H";
		mes "�����̒ʂ肷���肾�ƁH";
		mes "�������A����͂��܂Ȃ������ȁB";
		mes "�����C�������Ă��ĂˁB";
		next;
		menu "���ɗp�͂Ȃ��̂ŗ�������",-;
		mes "[�W�����{�݊Ǘ�����]";
		mes "��H�@������Ƒ҂��Ă���B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�����I�@�W�F�C�~�[�I";
		mes "���A�n���̐l���";
		mes "�ǂꂭ�炢�s�����Ă���H";
		next;
		mes "[�W�F�C�~�[]";
		mes "^000077���2���������̂ŁA";
		mes "���ݕs�����Ă���l����15���ł��B";
		mes "�c���Ă����ƈ����S����";
		mes "�n���ɍ~���̂��������Ă��܂��B^000000";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "���������H";
		mes "���A���̎�������";
		mes "�l�肪����Ȃ����Ƃ�";
		mes "��������Ă���񂾁B";
		next;
		menu "����ȂɐE�����߂Ă���l�������̂ɁH",-;
		mes "[�W�����{�݊Ǘ�����]";
		mes "���E�҂͑����I";
		mes "�����݂�ȂЂ��Ђ�낵�Ă��āA";
		mes "��ƂɎg���Ȃ��l�ނ΂���Ȃ񂾁B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�l�肪����Ă��Ȃ�����͂��́c�c";
		mes "������Ɓc�c�ق�̂�����Ƃ���";
		mes "�댯�Ȃ񂾂��ǁA";
		mes "�N�Ȃ�\������Ǝv���B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�ǂ����H";
		mes "��x�ꏏ�Ɏd�����Ă݂Ȃ����H";
		mes "��V�͂͂��ނ��B";
		next;
		menu "�܂��͎d���̓��e�ɂ��Đ�������",-;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�悵�A�܂��͐��������悤�B";
		mes "���̒��̒n���ɂ�";
		mes "���v�����O�̓s�s���c���Ă���B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "���������S�ɖ��v�o���Ȃ����R�́A";
		mes "���b�N���b�W��^ff0000�C���W�����{��^000000��";
		mes "�n���Ɏc���Ă��邩�炾�B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "���̎��ӂ͊������Ă��鍻���n�т��B";
		mes "�C����W���ɕς���̂�";
		mes "�����m�ۂ��邤����";
		mes "�����Ƃ����オ��Ŋm���Ȃ񂾁B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�����N���̑��݂����ɗ��݂����Ă���";
		mes "�z�ǂ͕��H���₷���āA";
		mes "��������イ���邩��";
		mes "�����ƊǗ�����K�v������񂾁B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "����܂ŊC���W�����{�݂�";
		mes "���ʂȖ��͂Ȃ������B";
		mes "�����Ǎŋ߁A�n���Ƀ����X�^�[��";
		mes "�o�v����悤�ɂȂ��Ă��܂��A";
		mes "��ƈ���������Ƃ����ۂ���悤��";
		mes "�Ȃ��Ă��܂����񂾁B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "���̂܂܂ł͂��̒��͐���";
		mes "�g���Ȃ��Ȃ邾�낤�B";
		mes "�N�������Ȃ���Ȃ�Ȃ��B";
		mes "�d���Ȃ񂾁B";
		mes "�������āA���ׂ��̂��߂�����";
		mes "�d�������Ă���킯����Ȃ��B";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�ǂ����낤�H";
		mes "��V�͎x������������󂯂Ă�";
		mes "����Ȃ����낤���B";
		mes "�����ɂƂ͌���Ȃ����B";
		next;
		mes "[�W�F�C�~�[]";
		mes "^000077�����A�n������A��������܂����B";
		mes "�����X�^�[�̏P���ɂ���āA";
		mes "��ƈ��ɔ�Q���o�������ł��B^000000";
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "����͑�ς��B";
		mes "�b�̓r���Ő\����Ȃ����A";
		mes "���̌��̑Ή������Ȃ��Ƃ����Ȃ��B";
		mes "�����d���������󂯂�C�ɂȂ�����A";
		mes "���ł�����K�˂ė��Ă���B";
		setquest 12403;
		compquest 12403;
		close;
	}
	if(checkquest(12404)) {
		if(checkquest(12404)&2 == 0) {
			mes "[�W�����{�݊Ǘ�����]";
			mes "���Ă��Ȃ��̂��H";
			mes "��������������K�v�͂Ȃ����B";
			close;
		}
		delquest 12404;
	}
	if(checkquest(12409)) {
		mes "[�W�����{�݊Ǘ�����]";
		mes "�{���ɂ���J�������B";
		mes "����ł��΂炭�͐��̐S�z��";
		mes "���Ȃ��ŕ�炷���Ƃ��ł���B";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		delquest 12405;
		delquest 12406;
		delquest 12407;
		delquest 12408;
		delquest 12409;
		setquest 12404;
		getitem 25250,3;
		getexp 200000000,0,1;
		getexp 0,80000000,0;
		mes "[�W�����{�݊Ǘ�����]";
		mes "����̕�V���B";
		mes "����I�ɐ�������K�v�����邩��A";
		mes "�܂����΂炭�����痈�Ă���B";
		close;
	}
	if(!checkquest(12405)) {
		mes "[�W�����{�݊Ǘ�����]";
		mes "�C���W�����{�݂�";
		mes "�d��������C�ɂȂ����̂��H";
		next;
		if(select("���܂�","���������l����") == 2) {
			mes "[�W�����{�݊Ǘ�����]";
			mes "�������B";
			mes "�C���ς�����炢�ł����Ă���B";
			close;
		}
		mes "[�W�����{�݊Ǘ�����]";
		mes "�킩�����B";
		mes "�n���ɂ͂��̗��̌����ɂ���";
		mes "�W���[�Ɉē����Ă�����Ă���B";
		viewpoint 1,324,124,1,0x00FF00;
		next;
		mes "[�W�����{�݊Ǘ�����]";
		mes "�N�����ׂ����Ƃ́A";
		mes "4��ނ̔z�ǂ��R�����Ȃ��悤�A";
		mes "��������ƒ��ߕt����B";
		mes "���ꂾ�����B�ȒP���낤�H";
		next;
		switch(rand(7)) {	// ������
		case 0: unittalk getnpcid(0,"���т��Ă���n���H#1"),"���т��Ă���n���H : �����I�@����������K�v��������Ă��̉��͂�߂Ă����I"; break;
		case 1: unittalk getnpcid(0,"���т��Ă���n���H#2"),"���т��Ă���n���H : �n���ł͍�Ƃ��ł������ɂȂ��B"; break;
		case 2: unittalk getnpcid(0,"���т��Ă���n���H#4"),"���т��Ă���n���H : �ЊQ�⏞��������Ȃ��Ȃ炱�̎d���͂�߂�I"; break;
		case 3: unittalk getnpcid(0,"���т��Ă���n���H#6"),"���т��Ă���n���H : ����Ȃɑ傫�����͏��߂Č����B����ȏケ���Ŏd���͏o���Ȃ��B"; break;
		case 4: unittalk getnpcid(0,"���т��Ă���n���H#8"),"���т��Ă���n���H : �|�ꂽ���������̏ォ�炠���炪�����񂹂ė��āA���͉����o���Ȃ������B����ȂƂ��낾�Ȃ�ĕ����ĂȂ������B"; break;
		case 5: unittalk getnpcid(0,"���т��Ă���n���H#10"),"���т��Ă���n���H : ����ȏ��ɐl�𑗂�Ȃ炻��Ȃ�̕ی�ݔ������O�ɗp�ӂ���I"; break;
		case 6: unittalk getnpcid(0,"���т��Ă���n���H#12"),"���т��Ă���n���H : ���񂽁A�n���ɉ��肽���ƂȂ�����H�@�ǂ�ȕ��ɂȂ��Ă���̂������Ă�肽����B"; break;
		}
		mes "[�W�����{�݊Ǘ�����]";
		mes "�z�ǂ͐F�ŋ敪����Ă��邩��A";
		mes "�����΂����ɂ킩��Ǝv���B";
		mes "�������ł�����";
		mes "��������n���֍s���Ă���B";
		setquest 12405;
		setquest 12406;
		setquest 12407;
		setquest 12408;
		close;
	}
	mes "[�W�����{�݊Ǘ�����]";
	mes "�܂��S���̐�����";
	mes "�I����Ă��Ȃ��悤���ȁB";
	mes "�����}���ł���Ȃ����H";
	close;
}

harboro2.gat,52,261,3	script	�Ԃ��z��#rockridge1	10042,{
	if(checkquest(12405)&1 && checkquest(12405)&8 == 0) {
		misceffect 101;
		progressbar 3;
		misceffect 18;
		compquest 12405;
		initnpctimer;
		hideonnpc;
		if(checkquest(12405)&8 && checkquest(12406)&8 && checkquest(12407)&8 && checkquest(12408)&8)
			setquest 12409;
		end;
	}
	mes "�]�������ꂽ�z�ǂ�����]";
	close;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end;
}

harboro2.gat,54,216,3	script	���z��#rockridge2	10043,{
	if(checkquest(12406)&1 && checkquest(12406)&8 == 0) {
		misceffect 101;
		progressbar 3;
		misceffect 18;
		compquest 12406;
		initnpctimer;
		hideonnpc;
		if(checkquest(12405)&8 && checkquest(12406)&8 && checkquest(12407)&8 && checkquest(12408)&8)
			setquest 12409;
		end;
	}
	mes "�]�������ꂽ�z�ǂ�����]";
	close;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end;
}

harboro2.gat,59,243,3	script	���F���z��#rockridge3	10044,{
	if(checkquest(12407)&1 && checkquest(12407)&8 == 0) {
		misceffect 101;
		progressbar 3;
		misceffect 18;
		compquest 12407;
		initnpctimer;
		hideonnpc;
		if(checkquest(12405)&8 && checkquest(12406)&8 && checkquest(12407)&8 && checkquest(12408)&8)
			setquest 12409;
		end;
	}
	mes "�]�������ꂽ�z�ǂ�����]";
	close;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end;
}

harboro2.gat,71,200,3	script	�����z��#rockridge4	10046,{
	if(checkquest(12408)&1 && checkquest(12408)&8 == 0) {
		misceffect 101;
		progressbar 3;
		misceffect 18;
		compquest 12408;
		initnpctimer;
		hideonnpc;
		if(checkquest(12405)&8 && checkquest(12406)&8 && checkquest(12407)&8 && checkquest(12408)&8)
			setquest 12409;
		end;
	}
	mes "�]�������ꂽ�z�ǂ�����]";
	close;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end;
}

harboro2.gat,73,102,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge5	10042
harboro2.gat,74,173,3	duplicate(���z��#rockridge2)	���z��#rockridge6	10043
harboro2.gat,86,160,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge7	10044
harboro2.gat,89,213,3	duplicate(�����z��#rockridge4)	�����z��#rockridge8	10046
harboro2.gat,89,223,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge9	10042
harboro2.gat,89,234,3	duplicate(���z��#rockridge2)	���z��#rockridge10	10043
harboro2.gat,92,124,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge11	10044
harboro2.gat,94,106,3	duplicate(�����z��#rockridge4)	�����z��#rockridge12	10046
harboro2.gat,97,209,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge13	10042
harboro2.gat,106,233,3	duplicate(���z��#rockridge2)	���z��#rockridge14	10043
harboro2.gat,108,112,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge15	10044
harboro2.gat,117,197,3	duplicate(�����z��#rockridge4)	�����z��#rockridge16	10046
harboro2.gat,120,116,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge17	10042
harboro2.gat,121,157,3	duplicate(���z��#rockridge2)	���z��#rockridge18	10043
harboro2.gat,140,115,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge19	10044
harboro2.gat,146,95,3	duplicate(�����z��#rockridge4)	�����z��#rockridge20	10046
harboro2.gat,148,128,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge21	10042
harboro2.gat,151,123,3	duplicate(���z��#rockridge2)	���z��#rockridge22	10043
harboro2.gat,158,151,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge23	10044
harboro2.gat,161,163,3	duplicate(�����z��#rockridge4)	�����z��#rockridge24	10046
harboro2.gat,169,125,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge25	10042
harboro2.gat,170,224,3	duplicate(���z��#rockridge2)	���z��#rockridge26	10043
harboro2.gat,177,134,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge27	10044
harboro2.gat,180,114,3	duplicate(�����z��#rockridge4)	�����z��#rockridge28	10046
harboro2.gat,181,155,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge29	10042
harboro2.gat,187,113,3	duplicate(���z��#rockridge2)	���z��#rockridge30	10043
harboro2.gat,207,121,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge31	10044
harboro2.gat,211,49,3	duplicate(�����z��#rockridge4)	�����z��#rockridge32	10046
harboro2.gat,221,234,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge33	10042
harboro2.gat,224,199,3	duplicate(���z��#rockridge2)	���z��#rockridge34	10043
harboro2.gat,226,69,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge35	10044
harboro2.gat,230,102,3	duplicate(�����z��#rockridge4)	�����z��#rockridge36	10046
harboro2.gat,240,83,3	duplicate(�Ԃ��z��#rockridge1)	�Ԃ��z��#rockridge37	10042
harboro2.gat,244,161,3	duplicate(���z��#rockridge2)	���z��#rockridge38	10043
harboro2.gat,266,129,3	duplicate(���F���z��#rockridge3)	���F���z��#rockridge39	10044
harboro2.gat,291,44,3	duplicate(�����z��#rockridge4)	�����z��#rockridge40	10046

//=======================================================
// �ԉΑ��̏����N�G�X�gNPC
//-------------------------------------------------------
harboro2.gat,164,80,5	script	�f����#srdg01	798,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�f����]";
		mes "�댯�����炠�����ɍs���Ă�B";
		next;
		mes "�]�����c�̖�肪�������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(checkquest(14673)) {
		if(checkquest(14673)&2 == 0) {
			mes "[�f����]";
			mes "���������́H";
			mes "���̋C�����͂��肪�������ǁA";
			mes "�܂����e������Ă���Ƃ���Ȃ񂾁B";
			next;
			mes "[�f����]";
			mes "���2�{�����Ȃ�����ȁB";
			mes "����܂葁�������ė��Ă���Ă�";
			mes "��肫��Ȃ��񂾁B";
			mes "�܂���ŗ��Ă���B";
			close;
		}
		mes "[�f����]";
		mes "���̑O�����ė��Ă��ꂽ����";
		mes "���I����ďn�����Ȃ񂾁B";
		mes "�m���Ă�H";
		mes "���C���Ɣ��e�͏n������ق�";
		mes "���ɐ[�݂��o��񂾂�H";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�Â����e�͎g���Ȃ��Ȃ�񂶂�";
		mes "�Ȃ��̂��c�c�H";
		next;
		mes "[�f����]";
		mes "���t�̂��₾��A����B";
		next;
		emotion 3;
		mes "[�f����]";
		mes "���ꂶ�፡������ނ�B";
		mes "^0000cd�ғł̕�10�A���F�Ζ�1��^000000��";
		mes "^0000cd�K�X�^�[��15�C�ގ�^000000���B";
		mes "�撣���Ă����I";
		delquest 14673;
		setquest 14672;
		close;
	}
	if(checkquest(14672)) {
		if(checkquest(14672)&4 == 0 || countitem(25277) < 10 || countitem(6213) < 1) {
			mes "[�f����]";
			mes "^0000cd�ғł̕�10�A���F�Ζ�1��^000000��";
			mes "^0000cd�K�X�^�[��15�C�ގ�^000000���B";
			mes "�킩�����ȁB";
			close;
		}
		mes "[�f����]";
		mes "�����Ȏd������Ȃ����B";
		mes "�K�X�^�[���ގ����Ă��邵�A";
		mes "�K�v�ȕ����S�������Ă�B";
		next;
		mes "[�f����]";
		mes "�悵�A����ō�Ƃ��ł��������B";
		mes "��ӂŎd�グ�邼�I";
		next;
		mes "[�f����]";
		mes "�~�b�h�i�C�g�A";
		mes "���̂����ɏ����Q�Ƃ��B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�ꏏ�ɂ�낤�B";
		mes "���̕��������I���B";
		next;
		mes "[�f����]";
		mes "�������B";
		mes "���ꂶ���Ƃ𕪒S���邩�I";
		next;
		mes "[�f����]";
		mes "�Ȃ����񂽁A";
		mes "�܂�����ł������H";
		mes "�ԉΑ����J���ɂ�";
		mes "�����Ɣ��e���K�v�Ȃ񂾁B";
		next;
		if(checkitemblank() == 0) {
			//TODO
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[�f����]";
		mes "�������x�񂾂�";
		mes "�܂����Ă���I";
		mes "���ꂶ�Ⴀ�ȁI";
		delitem 25277,10;
		delitem 6213,1;
		delquest 14672;
		setquest 14673;
		getitem 25250,3;
		getexp 150000000,0,1;
		getexp 0,80000000,0;
		close;
	}
	if(!checkquest(14672)) {
		if(BaseLevel < 160) {
			// TODO
			mes "�]BaseLevel160�ȏ�ɂȂ��Ă��炱�悤�]";
			close;
		}
		mes "[�f����]";
		mes "�悵�A���̂��炢�Ȃ���v�������B";
		mes "�����K�v���͂킩��ȁH";
		mes "�{���ɑ��v���H";
		mes "�����s�������������񂶂�Ȃ��H";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "��ɍs���΂����B�݂�ȐQ�Ă邳�B";
		next;
		mes "[�f����]";
		mes "����ł����邳�����";
		mes "�݂�ȋN���邾�낤�H";
		mes "����������邾�낤���B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "���v�B";
		mes "�������݂͂�ȓ����p���B";
		mes "�N���N�Ȃ̂��킩��Ȃ����B";
		next;
		mes "[�f����]";
		mes "�ȂɁH";
		mes "���O�����͋�ʂ����񂶂�";
		mes "�Ȃ������̂��H";
		emotion 23,"�f����#srdg01";
		next;
		menu "�������Ă����ł����H",-;
		mes "[�~�b�h�i�C�g]";
		mes "�c�c�B";
		next;
		mes "[�f����]";
		mes "�����A�����Ă���B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "����A���O�����B";
		mes "���O�ɕ����Ă邾��H";
		next;
		emotion 32,"�f����#srdg01";
		mes "[�f����]";
		mes "�����c�c�B";
		mes "�܂�����ꂿ�܂����Ȃ�d���˂��B";
		mes "���񂽁A�������킸�A";
		mes "�������̎d����";
		mes "���͂��Ă���Ȃ����H";
		next;
		if(select("�d���H","���܂���") == 2) {
			mes "[�f����]";
			mes "�������B���ꂶ�Ⴕ�傤���Ȃ��B";
			mes "���v����͍̂D������Ȃ�����ȁB";
			mes "�����Ō������Ƃ͖Y���";
			mes "�������ƋA��ȁB";
			next;
			mes "[�~�b�h�i�C�g]";
			mes "�����A�A���Ă������̂��H";
			mes "�������ꂽ����ɂ�";
			mes "�n�����Ă����Ȃ���";
			mes "�s�����񂶂�Ȃ����H";
			next;
			mes "[�f����]";
			mes "���O�͂ǂ����Ă����ɒ[�Ȃ񂾁H";
			mes "�����A�����s���Ă������B";
			mes "�����C���ς������܂�������I";
			close;
		}
		mes "[�f����]";
		mes "�������ɂ͈̑�Ȍv�悪����B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�̑�ł͂Ȃ��B";
		next;
		mes "[�f����]";
		mes "���O�A���ɉ�������ł�����̂��H";
		mes "��������C�������Ȃ�";
		mes "������Ɩق��Ă�I ";
		emotion 36,"�f����#srdg01";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�c�c�B";
		next;
		mes "[�f����]";
		mes "�������A��������^0000cd�z�R^000000���P������B";
		next;
		menu "�P���H",-;
		mes "[�~�b�h�i�C�g]";
		mes "�����A���܂��̓I�ɘb���ȁB";
		mes "�K�v�ȕ���p�ӂ����邾���ł����B";
		next;
		mes "[�f����]";
		mes "����͈Ⴄ�B";
		mes "���̐����������Ɏd�����ł��邩�H";
		mes "�����̖����������Ɨ������Ă���";
		mes "�����d�����ł���Ƃ������̂��B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "���߂ĉ�����l�������g���C�Ȃ̂��H";
		next;
		mes "[�f����]";
		mes "����A��������Ȃ��c�c";
		mes "�����玄�����������̂́A";
		mes "�̑�Ȏd�������ɐ��������悤��";
		mes "�������Ƃ��B";
		next;
		mes "[�f����]";
		mes "�b��߂����B";
		mes "���ɍz�R������̂�";
		mes "�m���Ă����ȁH";
		mes "���̍z�R���ŋ߁A";
		mes "�����c�ɐ�̂��ꂿ�܂����񂾁B";
		next;
		menu "���̘b�͕ۈ����������ŕ����܂���",-;
		emotion 14,"�f����#srdg01";
		mes "[�f����]";
		mes "���I�@���O�����u��o�g�Ȃ̂��H";
		mes "���ꂶ�ቴ�����͓��m����Ȃ����B";
		mes "����͙F�􂾁I";
		mes "���������̂��������";
		mes "���u��̏o�g�Ȃ񂾁B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "���̐΂ő���ꂽ";
		mes "���̓��������������B";
		mes "���̗₽�����G���c�c�B";
		next;
		mes "[�f����]";
		mes "�������̂��т��������������B";
		mes "���͂���܂ŎG�����тɂ�";
		mes "�����������Ȃ��������ǁA";
		mes "����ȗ��A�G�����т͍D���ɂȂ����B";
		next;
		menu "���u��ɍs�������R�́H",-;
		mes "[�f����]";
		mes "���A���ꕷ���H";
		mes "�������Ⴄ�H";
		mes "�悭�������Ă���܂����B";
		next;
		mes "[�f����]";
		mes "���͎�悪��p�Ȃ񂾁B";
		mes "����ɉԉ΂��D�����B";
		mes "���ɍœK�̐E�Ƃ͉����Ǝv���H";
		next;
		menu "�ԉΐE�l�H",-;
		mes "[�f����]";
		mes "�ɂ����I�@���ɐɂ����I";
		mes "�ԉ΂��͂����������͂ȉ����c�c";
		mes "�����A^0000cd���e^000000���B";
		mes "�����ă��b�N���b�W�ł�";
		mes "�z�R�𔭌@����Ƃ����񂾂���";
		mes "�����Ƃ��Ă���킯�ɂ����Ȃ��B";
		next;
		mes "[�f����]";
		mes "�z�R�ɂ͕K�����e���K�v���B";
		mes "���̎���������Ȃ���";
		mes "�������҂���Ǝv����";
		mes "���b�N���b�W�ɗ����񂾁B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�����ǁA�v���Ă����悤�ɂ�";
		mes "�����Ȃ������B";
		next;
		emotion 32,"�f����#srdg01";
		mes "[�f����]";
		mes "�S�����O�̂������I";
		mes "�����Ă����I�@";
		mes "������̖�A���̉\�𕷂���";
		mes "�N�����K�˂ė����B";
		mes "�����Ă����Ȃ蔚�e���񂱂���";
		mes "�����������B";
		next;
		mes "[�f����]";
		mes "����΍ŋ߈�Ԉ������������Ă���";
		mes "^0000cd�����c^000000����Ȃ����B";
		mes "���e���ǂ��g�����Ȃ��";
		mes "�e�Ղɑz���������B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "����ł��n���Ă�����B";
		next;
		mes "[�f����]";
		mes "���O������傫���z�炪";
		mes "�����񂹂ė��āA�f��邩�H";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "���Ȃ玝����������B";
		next;
		emotion 6,"�f����#srdg01";
		mes "[�f����]";
		mes "���[���΂ɖ������ˁB";
		mes "���̋��|�͂��̏�ɂ��Ȃ���";
		mes "�킩��Ȃ����B";
		next;
		mes "[�f����]";
		mes "�Ƃɂ����A���������";
		mes "�����I�Ɏ����čs�������e��";
		mes "�A����Ԃ𔚔��������񂾁B";
		mes "���ꂩ��z�R���P�������B";
		mes "�����Ăǂ��Ȃ����Ǝv���H";
		next;
		mes "[�f����]";
		mes "���e�̏o����ǂ����ۈ�����";
		mes "�K�˂ė��āA���͑ߕ߂��ꂽ�B";
		mes "�����ė��u��ɕ����߂�ꂽ�B";
		next;
		mes "[�f����]";
		mes "�������痯�u��̒���";
		mes "���̂������񂪋����񂾁B";
		mes "��Ԃ𔚔�������ۂ�";
		mes "�������܂ꂽ�炵���B";
		mes "�⌌�ȋ����c�͕���������";
		mes "���������u�����܂ܓ������B";
		next;
		mes "[�f����]";
		mes "���ꂾ������Ȃ��B";
		mes "���̕ۈ����̘A�����A";
		mes "�����炯�̂��������";
		mes "���u���Ă����񂾁B";
		next;
		mes "[�f����]";
		mes "�ڂ̑O�Ŏ��Ȃꂿ��";
		mes "�Q�o�߂��������A";
		mes "�������Â��Ă�����񂾁B";
		next;
		mes "[�f����]";
		mes "����ȗ��A���u�ꂩ��o����Ă�";
		mes "���������ɕt���܂Ƃ��悤��";
		mes "�Ȃ����񂾁B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�ӂ�c�c�B";
		next;
		menu "����ŁA���͂̓��e�́H",-;
		mes "[�f����]";
		mes "���͂��Ă����̂��H";
		mes "���Ȃ�f���Ă��ǂ��񂾂��H";
		mes "����ł����Ƃ����̂Ȃ�A";
		mes "���e�ɕK�v�ȍޗ���";
		mes "�W�߂ė��Ăق����񂾁B";
		next;
		mes "[�f����]";
		mes "�悤����ɁA^0000cd�z�R�����߂�����^000000�񂾁B";
		mes "�O���������H";
		mes "�����c���z�R���̂��Ă���A";
		mes "�����̏Z�l�͈�u�Ŏd�����������B";
		next;
		mes "[�f����]";
		mes "�d�����Ȃ��Ȃ�������";
		mes "�����҂����Ƃ��o���Ȃ��Ȃ�A";
		mes "�����Ȃ����琶���Ă����̂�";
		mes "����Ȃ����B";
		mes "����Ȏ��������Ă����킯���Ȃ��B ";
		next;
		emotion 52,"�f����#srdg01";
		mes "[�f����]";
		mes "������^0000cd�z�R�ŉԉΑ��^000000���J���āA";
		mes "^0000cd�����c�̘A����ǂ��o���Ă�낤^000000";
		mes "�Ƃ����킯���B";
		next;
		menu "�ł��~�b�h�i�C�g����́c�c",-;
		mes "[�~�b�h�i�C�g]";
		mes "�����ǂ������H";
		next;
		mes "[�f����]";
		mes "���̂�������H�@���v����B";
		mes "�����c����͊��ɑ������Ă�B";
		mes "�������̂Ă���炾�B";
		mes "�����������������B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�c�c�B";
		next;
		emotion 23,"�f����#srdg01";
		mes "[�f����]";
		mes "��H";
		mes "�܂����܂�������";
		mes "�̂Đ؂�Ă��Ȃ������Ƃ��H";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "��������Ȃ��B";
		mes "�����ɏI��点���邩";
		mes "�S�z�ɂȂ����񂾁B";
		mes "�������s�����炨�O�́c�c";
		next;
		mes "[�f����]";
		mes "�܂������c�ɎE����邩�A";
		mes "�ۈ����ɕ߂܂���";
		mes "�܂����u�ꑗ�肾�ȁB";
		mes "���̂��炢�͊o�債�Ă邳�B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "�����܂Ŋo�債�Ă���̂��B";
		next;
		mes "[�f����]";
		mes "������������΂��̎S�߂Ȑ�����";
		mes "�I���B������x�z�R�œ�������";
		mes "�ł��邶��Ȃ��B";
		next;
		mes "[�f����]";
		mes "��������N�̕����B";
		mes "�K�v�ȃA�C�e���͍z�R�ɂ���";
		mes "^ff0000�K�X�^�[^000000�������ł���";
		mes "�ғł̕��ƍ��F�Ζ򂾁B";
		mes "���v���H�@�p�ӂł��������H";
		next;
		mes "[�f����]";
		mes "^0000ff�ғł̕�^000000��10�A";
		mes "^0000ff���F�Ζ�^000000��1����΂����B";
		next;
		mes "[�f����]";
		mes "�ғł̕��͐l�Ԃɂ͒v���I�Ȗғł����ǁA";
		mes "�����c�̘A���ɂ͂Ђǂ��y���āA";
		mes "�܂ƕ@�����o�鉌�ł����Ȃ��񂾁B";
		mes "�܂������������������͂���B";
		next;
		mes "[�f����]";
		mes "���ꂩ�牴���������e��";
		mes "�ݒu���ɍs���ہA";
		mes "�~���ɍ�Ƃ��s����悤";
		mes "^ff0000�K�X�^�[�̐������炵�Ăق����B^000000";
		next;
		mes "[�f����]";
		mes "�����c�͉ԉΑ��Œǂ��o���邯�ǁA";
		mes "�K�X�^�[�͘A���������N��������A";
		mes "��ʂɂ���Ƒ�ςȂ��ƂɂȂ�B";
		mes "�Ƃ肠�����c�c";
		mes "�������ȁA�K�X�^�[10�c�c";
		mes "����A15�C�͑ގ����Ă���B";
		next;
		mes "[�f����]";
		mes "�悵�A���ꂶ�ᐮ�����邼�B";
		mes "^0000cd�ғł̕�10�A���F�Ζ�1��^000000��";
		mes "^0000cd�K�X�^�[��15�C�ގ�^000000���B";
		mes "�킩�����ȁB";
		next;
		emotion 41,"";
		mes "[�f����]";
		mes "���ꂶ��撣���I";
		mes "�����ɖ߂��Ă�����A";
		mes "����Ȃ�̕�V������Ă�邩��ȁI";
		setquest 14672;
		close;
	}
}

harboro2.gat,167,82,3	script	�~�b�h�i�C�g#srdg01	10231,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�~�b�h�i�C�g]";
		mes "�Ȃɂ����Ă���H";
		mes "����ȂƂ�������낤�낵�Ă����";
		mes "��Ȃ����B";
		mes "�������ƒ��ɋA��񂾂ȁB";
		close;
	}
	if(checkquest(14672)) {
		mes "[�~�b�h�i�C�g]";
		mes "�����s���Ă��������ǁc�c";
		mes "�����͂��Ȃ苭�����ȁB";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "���������ƁA�����̍��ɂ�";
		mes "���܂���C�ł͂Ȃ��B";
		mes "������肽���悤��";
		mes "��点�Ă�肽���B";
		next;
		mes "[�~�b�h�i�C�g]";
		mes "���͂��Ă����";
		mes "���񂽂ɂ͊��ӂ��Ă���B";
		close;
	}
	mes "[�~�b�h�i�C�g]";
	mes "�c�c�B";
	next;
	mes "[�~�b�h�i�C�g]";
	mes "�f�����c�c�ςȂ��";
	mes "���낿��낵�Ă��邪�A";
	mes "�m�荇�����H";
	next;
	mes "[�f����]";
	mes "����H�@�N���H";
	close;
}

harboro2.gat,166,80,5	script	�R���c��������#srdg01	649,{}
harboro2.gat,165,77,5	script	��Ɠ���#srdg01	10024,{}
harboro2.gat,164,78,5	script	��Ɠ���#srdg02	10025,{}
harboro2.gat,166,78,5	script	��Ɠ���#srdg03	10026,{}

//=======================================================
// ���Z���̗��݃N�G�X�gNPC
//-------------------------------------------------------
rockrdg1.gat,262,90,7	script	�������܂����n#rr	10217,{
	cutin "rock_cact01",2;
	mes "[�������܂����n]";
	mes "���q�͂ǂ����H";
	mes "���z�Ƒ�n�̏j����";
	mes "�����N�Ƌ��ɂ���񂱂Ƃ��B";
	next;
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�������܂����n]";
		mes "�N�͉������痈���ٖM�l���B";
		mes "���̓L���N�^�[���̗E���Ȑ�m�A";
		mes "�������܂����n���B";
		next;
		mes "[�������܂����n]";
		mes "�܂��N�����̒���";
		mes "�N�����Ă����肪";
		mes "��������Ă��Ȃ��ȁB";
		mes "���ׂĂ̎��ɂ͏���������B";
		mes "���ׂ����Ƃ��I��点�Ă���";
		mes "�܂��K�˂ė��Ă���B";
		close2;
		cutin "rock_cact01",255;
		end;
	}
	if(checkquest(9461)) {
		if(checkquest(9461) & 0x2 == 0) {
			mes "[�������܂����n]";
			mes "�K���A�z�΂��K�v�Ȃ��񂾁B";
			mes "�����ς���ĐV�������z��";
			mes "���񂩏�������A�܂��K�v��";
			mes "�Ȃ邩���m��Ȃ��ȁB";
			close2;
			cutin "rock_cact01",255;
			end;
		}
		mes "[�������܂����n]";
		mes "�₠�A�N���B";
		mes "���傤�Ǎz�΂�";
		mes "�����Ȃ����Ƃ���Ȃ񂾁B";
		mes "�܂�^ff0000���z�΂̌���^000000��";
		mes "�W�߂Ă��Ă���邩�H";
		next;
		if(select("�킩��܂���","���͖Z�����ł�") == 2) {
			mes "[�������܂����n]";
			mes "�ӂށc�c���傤���Ȃ��B";
			mes "���Ԃ����鎞�ł�������";
			mes "�܂����Ă���B";
			close2;
			cutin "rock_cact01",255;
			end;
		}
		mes "[�������܂����n]";
		mes "���肪�Ƃ��B";
		mes "��͂�N�͐M���ł���B";
		delquest 9461;
		setquest 9460;
		close2;
		cutin "rock_cact01",255;
		end;
	}
	if(checkquest(9460)) {
		mes "[�������܂����n]";
		mes "�����A�N���B";
		mes "�z�΂̌��Ђ͏W�܂������H";
		next;
		if(countitem(25260) < 10) {
			mes "[�������܂����n]";
			mes "�܂�����Ȃ��悤���ȁB";
			mes "�R���[�e�⋍���c������";
			mes "���炵�߂āA";
			mes "�z�΂̌��Ђ��W�߂ė��Ă���B";
			close2;
			cutin "rock_cact01",255;
			end;
		}
		if(countitem(25260) > 10) {
			mes "[�������܂����n]";
			mes "���񂾗ʂ�������";
			mes "�����ė��Ă��ꂽ�񂾂ȁB";
			mes "���ӂ͂��肪��������";
			mes "���񂾗ʂ��������";
			mes "����ŏ\���Ȃ񂾁B";
			mes "10��������Ă�����B";
			next;
		}
		delitem 25260,10;
		mes "[�������܂����n]";
		mes "���肪�Ƃ��B";
		mes "���Ȃ���������󂯎���Ă���B";
		mes "���Ŗ�������̂���";
		mes "�������ɂ͂��܂�K�v�Ȃ��񂾁B";
		delquest 9460;
		setquest 9461;
		getitem 25250,1;
		getexp 15000000,0,1;
		getexp 0,6000000,0;
		close2;
		cutin "rock_cact01",255;
		end;
	}
	mes "[�������܂����n]";
	mes "�N�͉������痈���ٖM�l���B";
	mes "���̓L���N�^�[���̗E���Ȑ�m�A";
	mes "�������܂����n���B";
	next;
	mes "[�������܂����n]";
	mes "�ǂ���璬�̖���";
	mes "���������悤���ȁB";
	mes "�N�̗E�C�ƒm�b���̎^����B";
	next;
	mes "[�������܂����n]";
	mes "�����ǂ����";
	mes "��������������`����";
	mes "����Ȃ����ȁH";
	mes "����قǓ�����ł͂Ȃ��͂����B";
	next;
	mes "[�������܂����n]";
	mes "�������͂������̋��Ƃ���";
	mes "����c�l�̑ォ��";
	mes "��������Ȃ��قǂ̒����N����";
	mes "�����܂Ő����ė����B";
	next;
	mes "[�������܂����n]";
	mes "���̊ԁA��������";
	mes "���R���Ƌ��ɐ����ė����B";
	mes "�������N�ł��̒n�ɗ����N�����́A";
	mes "�������Ƃ͈Ⴄ��������";
	mes "���Ă���̂��킩�����B";
	next;
	mes "[�������܂����n]";
	mes "�������͎��R����󂯂����m��";
	mes "���R�ɋA���A";
	mes "�K�v�łȂ����͐�΂�";
	mes "�����čs�����Ƃ͂��Ȃ��񂾁B";
	next;
	mes "[�������܂����n]";
	mes "�����ǌN�����͈�����B";
	mes "�����K�v�ȏ�Ɏ����čs�����Ƃ�";
	mes "�C�������B";
	mes "�����čs���Ă��ǂ����S��";
	mes "�g�����邱�Ƃ͂ł��Ȃ��̂ɁB";
	next;
	mes "[�������܂����n]";
	mes "�N�������z�R�̔��@���n�߂Ă���A";
	mes "�����������̐΂𓾂邱�Ƃ�";
	mes "����Ȃ��Ă��܂����B";
	next;
	mes "[�������܂����n]";
	mes "�N��ӂ߂Ă���킯�ł͂Ȃ��B";
	mes "�����N���������܂��";
	mes "�����������čs���Ă�������";
	mes "�������͕K�v�ȗʂ���";
	mes "���鎖���o���Ȃ��ł���B";
	mes "���ꂪ���Ȃ񂾁B";
	next;
	mes "[�������܂����n]";
	mes "�������̒n��`�����Ă���";
	mes "^ff0000���z�΂̌���^000000��";
	mes "��������A";
	mes "������W�߂Ď����ė��Ă���B";
	mes "�ǂ����H�@����Ă���邩�H";
	next;
	if(select("�킩��܂���","���͖Z�����ł�") == 2) {
		mes "[�������܂����n]";
		mes "�ӂށc�c���傤���Ȃ��B";
		mes "���Ԃ����鎞�ł�������";
		mes "�܂����Ă���B";
		close2;
		cutin "rock_cact01", 255;
		end;
	}
	mes "[�������܂����n]";
	mes "�����A���肪�Ƃ��B";
	mes "���z�΂̌��Ђ͍z�R�̋߂��ɂ���";
	mes "�����X�^�[�⋍���c��";
	mes "�����Ă���B";
	next;
	mes "[�������܂����n]";
	mes "�L����������z�R�Ŏ������Ă����";
	mes "��ɓ���͂����B";
	mes "^ff000010��^000000�ł�������";
	mes "�����ė��Ă���B";
	next;
	mes "[�������܂����n]";
	mes "����ł͂�낵�����ށB";
	mes "���z�Ƒ�n�̏j����";
	mes "�����N�Ƌ��ɂ���񂱂Ƃ��B";
	setquest 9460;
	close2;
	cutin "rock_cact01",255;
	end;
}

//=======================================================
// �r��̖��҃N�G�X�gNPC
//-------------------------------------------------------
rockrdg1.gat,341,133,3	script	�L���N�^�[����#rrrem01	10220,{
	if(ROCKRIDGE_1QUE < 16) {
		cutin "rock_cact03",2;
		mes "[�L���N�^�[����]";
		mes "�݂����Ȃ��ٖM�l�ˁB";
		mes "�����p������H";
		next;
		cutin "rock_cact03",255;
		mes "�]�����c�̖�肪�������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(checkquest(16079)) {
		if(checkquest(16079) & 0x2 == 0) {
			cutin "rock_cact03",2;
			mes "[�L���N�^�[����]";
			mes "�d���ɂ͕K���x�e���K�v�ł��B";
			mes "�d���ɖv�����������";
			mes "��؂Ȃ��̂��������˂܂���B";
			next;
			mes "[�L���N�^�[����]";
			mes "�����������Ă��܂��B";
			mes "�ł����͂��������x��ł��������B";
			close2;
			cutin "rock_cact03",255;
			end;
		}
		cutin "rock_cact03",2;
		mes "[�L���N�^�[����]";
		mes "�`���҂���A";
		mes "�܂����Ă��ꂽ��ł��ˁB";
		mes "�R���[�e��ގ����Ă�����ł����H";
		next;
		if(select("�����ł�","�������A������Ƙb�����ɗ��������ł�") == 2) {
			mes "[�L���N�^�[����]";
			mes "�����͏����]�T������݂����ł��ˁB";
			mes "�����ł�������";
			mes "�ꑧ�����Ԃ͂���܂��B";
			next;
			mes "[�L���N�^�[����]";
			mes "������鎖������Ƃ����̂�";
			mes "�f���炵�����Ƃł��B";
			mes "���A�ڂ��o�܂���";
			mes "��n�̉��b���󂯂Ȃ��瓭���A";
			mes "��͖��鐶���B";
			emotion 2;
			close2;
			cutin "rock_cact03",255;
			end;
		}
		mes "[�L���N�^�[����]";
		mes "�ł͍�����";
		mes "^0000CD�R���[�e��30�C^000000�ގ����Ă��������B";
		mes "�R���[�e�͖�ɂȂ��";
		mes "�Q��ňړ����Ȃ���i�����ł��B";
		mes "�܂�ŕ߂܂��Ă����ʂ����";
		mes "�����Ă���݂����ł��c�c�B";
		next;
		mes "[�L���N�^�[����]";
		mes "�����ǖ����̏����ȕω���";
		mes "�傫�ȕω����Ăъ񂹂��";
		mes "�M���Ă��܂��B";
		mes "�`���҂��񂪋��͂��Ă��ꂽ�������ŁA";
		mes "�����ȕω������܂�Ă��܂��B";
		mes "�ǂ�����낵�����肢���܂��B";
		delquest 16079;
		setquest 16080;
		close2;
		cutin "rock_cact03",255;
		end;
	}
	if(checkquest(16080)) {
		if(checkquest(16080) & 0x4) {
			cutin "rock_cact03",2;
			mes "[�L���N�^�[����]";
			mes "�����l�ł����B";
			mes "���Ă��܂��񂩁H";
			mes "�����ǂ������炱�ꂩ������肢���܂��B";
			next;
			mes "[�L���N�^�[����]";
			mes "�����₩�ł����A�󂯎���Ă��������B";
			mes "�������肪�Ƃ��������܂��B";
			delquest 16080;
			setquest 16079;
			getitem 25250,1;
			getexp 20000000,0,1;
			getexp 0,8000000,0;
			close2;
			cutin "rock_cact03",255;
			end;
		}
		cutin "rock_cact03",2;
		mes "[�L���N�^�[����]";
		mes "�R���[�e�ގ��̒��q�͂ǂ��ł����H";
		mes "��ꂽ�Ȃ�x�݂Ȃ������ĉ������B";
		mes "�`���҂���ɂ͂��܂薳������";
		mes "���炢�����͂Ȃ��ł�����B";
		close2;
		cutin "rock_cact03",255;
		end;
	}
	if(!checkquest(16078)) {
		mes "[�`�r���N�^�[]";
		mes "��[���I�@���ꂳ�񂪋A���ė����I";
		mes "�W���[�X�́H�@�W���[�X�́H";
		emotion 2,"�`�r���N�^�[#rrrem02";
		next;
		mes "[�`�r���N�^�[]";
		mes "����c�c�H";
		mes "���ꂳ��A�]�񂾂́H";
		mes "��������Ă��H";
		emotion 1,"�`�r���N�^�[#rrrem02";
		next;
		cutin "rock_cact03",2;
		mes "[�L���N�^�[����]";
		mes "�������܁B";
		mes "�ł����߂�ˁA���N�^�[�B";
		mes "�����͂����̃A�K�x�W���[�X��";
		mes "���������́B";
		emotion 9,"�L���N�^�[����#rrrem01";
		next;
		cutin "rock_cact03",255;
		mes "[�`�r���N�^�[]";
		mes "���H�@�ǂ����āH";
		mes "�ǂ����ĂȂ��́H";
		mes "�s��ɍs������ł���H";
		next;
		mes "[�`�r���N�^�[]";
		mes "�A�K�x���W���[�X�𔃂��ė������";
		mes "����������҂��Ă��̂Ɂc";
		mes "�c";
		if(!sleep2(1000)) end;
		mes "�c�c";
		if(!sleep2(1000)) end;
		mes "���킠������������I�I";
		next;
		cutin "rock_cact03",2;
		mes "[�L���N�^�[����]";
		mes "�����Ȃ��Ń��N�^�[�B";
		mes "�L���N�^�[���̎q�ǂ���";
		mes "�����ȒP�ɋ����Ȃ����̂Ȃ̂�B";
		next;
		if(select("�ǂ������܂������H","�C�ɂ��Ȃ�") == 2) {
			cutin "rock_cact03",255;
			mes "�]���Ȃ��͋C�ɂ����ʂ�߂����]";
			close;
		}
		mes "[�L���N�^�[����]";
		mes "�����c�c�����������Ƃł́c�c�B";
		mes "����H�@���Ȃ��A�ς�����i�D�ˁH";
		mes "�`���҂�����H";
		mes "�c�c����Ȃ炿����Ƙb��";
		mes "�����Ă���܂����H";
		next;
		cutin "rock_cact03",255;
		mes "[�`�r���N�^�[]";
		mes "���킠����������I";
		mes "�A�K�x���W���[�X�I";
		mes "���������`��I";
		emotion 28,"�`�r���N�^�[#rrrem02";
		next;
		cutin "rock_cact03",2;
		mes "[�L���N�^�[����]";
		mes "���̓��b�N���b�W�̎s���";
		mes "�������ɍs�����̂ł����A";
		mes "�A��r���ŉ^�����R���[�e��";
		mes "�o���킵�Ă��܂�����ł��B";
		next;
		mes "[�L���N�^�[����]";
		mes "���͕K���ɒǂ������܂����B";
		mes "�����Ĕ��������̑唼��";
		mes "���܂������A";
		mes "�A�K�x���W���[�X�~�b�N�X��";
		mes "���ׂĎ����Ă��܂��܂����B";
		next;
		menu "�A�K�x���W���[�X�~�b�N�X�H",-;
		emotion 1,"";
		mes "[�L���N�^�[����]";
		mes "�₽�����ɍ������";
		mes "�A�K�x���W���[�X���ł���";
		mes "�����̂��Ƃł��B";
		mes "�A�K�x�W���[�X�Ǝ����������āA";
		mes "�L���N�^�[���̎q�ǂ���";
		mes "�l�C�̃W���[�X�ł��B";
		next;
		mes "[�L���N�^�[����]";
		mes "�ٖM�̖`���҂���A";
		mes "�����ǂ������玄�����Ƃ��Ă��܂���";
		mes "�A�K�x���W���[�X��";
		mes "�T���Ă���܂��񂩁H";
		next;
		mes "[�L���N�^�[����]";
		mes "���ꂩ��R���[�e�����������Ȃ��悤";
		mes "^0000CD30�C^000000�ق�";
		mes "����Ăق����ł��B";
		next;
		mes "[�L���N�^�[����]";
		mes "^0000CD�A�K�x���W���[�X�~�b�N�X^000000��";
		mes "7����ł������A�S��������̂�";
		mes "����ł��傤�B";
		mes "�ł�����^0000CD5��^000000�����Ă�����";
		mes "���������ł��B";
		mes "�����₩�ł�������������グ�܂��B";
		next;
		if(select("�����󂯂܂��傤","�Z�����̂Łc�c") == 2) {
			mes "[�L���N�^�[����]";
			mes "�킩��܂����B�d���Ȃ��ł��ˁB";
			close2;
			cutin "rock_cact03",255;
			end;
		}
		mes "[�L���N�^�[����]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "^0000CD�A�K�x���W���[�X�~�b�N�X5��^000000�ƁA";
		mes "^0000CD�R���[�e30�C^000000��ގ��ł��B";
		next;
		mes "[�L���N�^�[����]";
		mes "�A�K�x���W���[�X�~�b�N�X�ł����A";
		mes "^FF0000�n�ʂɖ��܂��Ă���A";
		mes "�N���������čs������A";
		mes "����������ƃR���[�e�������Ă�";
		mes "�����m��܂���B^000000";
		next;
		mes "[�L���N�^�[����]";
		mes "�R���[�e�ގ������Ȃ���";
		mes "���ӂ��悭���ׂĂ݂Ă��������B";
		mes "��낵�����肢���܂��B";
		viewpoint 1,146,164,1,0xFFFF00;
		viewpoint 1,305,200,2,0xFFFF00;
		viewpoint 1,195,183,3,0xFFFF00;
		viewpoint 1,182,124,4,0xFFFF00;
		viewpoint 1,286,247,5,0xFFFF00;
		viewpoint 1,202,246,6,0xFFFF00;
		viewpoint 1,149,103,7,0xFFFF00;
		setquest 16078;
		close2;
		cutin "rock_cact03",255;
		end;
	}
	if(checkquest(16078)) {
		if(checkquest(16078) & 0x4 && countitem(25246) >= 5) {
			mes "[�`�r���N�^�[]";
			mes "�A�K�x���W���[�X�Ȃ́H";
			mes "�W���[�X�����ė��Ă��ꂽ�́H";
			mes "�H�ׂ�I�@���N�^�[���H�ׂ�I";
			next;
			cutin "rock_cact03",2;
			mes "[�L���N�^�[����]";
			mes "���N�^�[�A";
			mes "�`���҂���Ɋ��ӂ̈��A�����Ȃ����B";
			next;
			cutin "rock_cact03",255;
			mes "[�`�r���N�^�[]";
			mes "����I�@�ƂĂ����������I";
			mes "�ււցA���肪�Ƃ��������܂��`�I";
			emotion 18,"�`�r���N�^�[#rrrem02";
			next;
			cutin "rock_cact03",2;
			mes "[�L���N�^�[����]";
			mes "�ӂ��c�c�B";
			emotion 20,"�L���N�^�[����#rrrem01";
			next;
			mes "[�L���N�^�[����]";
			mes "�A�K�x���W���[�X��t��";
			mes "����ȂɊ�Ԃ̂����Ă�����A";
			mes "�����c���������Ɉ���ł���";
			mes "�{���̃A�K�x�W���[�X��";
			mes "�v���o���܂����B";
			next;
			mes "[�L���N�^�[����]";
			mes "�P���ɍH��ō��������";
			mes "���ɍ����Ĉ��ނ��̂ł͂���܂���B";
			mes "���ɂ͂��Ȃ��Ԃ�������A";
			mes "��؂ȓ��ɂ������ނ��Ƃ��o���Ȃ�";
			mes "���ʂȈ��ݕ��ł����B";
			next;
			mes "[�L���N�^�[����]";
			mes "�S�Ƒ����W�܂���";
			mes "�A�K�x�W���[�X�����܂����B";
			mes "���ɂ����y������������A";
			mes "�킴�킴�������痈���e�ʂƈꏏ��";
			mes "�x������y������t������c�c�B";
			next;
			mes "[�L���N�^�[����]";
			mes "�{���Ɋy���������ł��B";
			mes "�����ǂ��̎q�͂���Ȍo����";
			mes "�������Ƃ�����܂���B";
			mes "�ŋ߂݂͂�ȖZ������";
			mes "�x���̂Ŗ���߂������̂�";
			mes "�����̘̂b�ł��B";
			next;
			mes "[�L���N�^�[����]";
			mes "����ł��������͏��";
			mes "�厖�ȓ`������낤��";
			mes "�w�͂��Ă��܂��B";
			mes "�q�ǂ��������̂̂悤��";
			mes "�y�����o�����ł���悤��";
			mes "���Ă�肽���ł��B";
			next;
			mes "[�L���N�^�[����]";
			mes "���A���߂�Ȃ����B";
			mes "�]�v�Ȏ��������Ă��܂��܂����ˁB";
			mes "�Z���������ł��傤�ɁA";
			mes "�{���ɂ��肪�Ƃ��������܂��B";
			emotion 19,"�L���N�^�[����#rrrem01";
			next;
			mes "[�L���N�^�[����]";
			mes "�����������̂ł͂���܂��񂪁A";
			mes "����͂���ł��B";
			mes "�󂯎���Ă��������B";
			next;
			mes "[�L���N�^�[����]";
			mes "���ꂩ��A�����悯���";
			mes "�܂��R���[�e��ގ�����";
			mes "���Ă���܂��񂩁H";
			mes "�ŋ߃R���[�e��";
			mes "�҈Ђ�U����Ă����ł��B";
			next;
			mes "[�L���N�^�[����]";
			mes "�ނ�����R�̒��Ԃł����ǁc�c";
			mes "��������邽�߂ɂ�";
			mes "�����ɒǂ����K�v��";
			mes "����܂�����B";
			next;
			if(checkitemblank() == 0) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close2;
				cutin "rock_cact03",255;
				end;
			}
			mes "[�L���N�^�[����]";
			mes "��T�ԂɈ����x�ł��܂��܂���B";
			mes "�͂�݂��Ă����Ȃ�{���Ɋ������ł��B";
			mes "���������悢�������ł���悤�A";
			mes "���������Ɠw�͂��܂��ˁB";
			emotion 18,"�L���N�^�[����#rrrem01";
			delitem 25246,countitem(25246);
			delquest 16078;
			setquest 16079;
			delquest 16088;
			getitem 25250,1;
			getexp 40000000,0,1;
			getexp 0,16000000,0;
			close2;
			cutin "rock_cact03",255;
			end;
		}
		cutin "rock_cact03",2;
		mes "[�L���N�^�[����]";
		mes "^0000CD�A�K�x���W���[�X�~�b�N�X5��^000000�ƁA";
		mes "^0000CD�R���[�e30�C^000000��ގ��ł��B";
		mes "�ǂ�����낵�����肢���܂��B";
		if(checkquest(16088) == 0) {
			if(checkquest(16083) == 0)
				viewpoint 1,146,164,1,0xFFFF00;
			if(checkquest(16087) == 0)
				viewpoint 1,305,200,2,0xFFFF00;
			if(checkquest(16085) == 0)
				viewpoint 1,195,183,3,0xFFFF00;
			if(checkquest(16082) == 0)	// ??
				viewpoint 1,182,124,4,0xFFFF00;
			if(checkquest(16084) == 0)
				viewpoint 1,286,247,5,0xFFFF00;
			if(checkquest(16086) == 0)
				viewpoint 1,202,246,6,0xFFFF00;
			if(checkquest(16081) == 0)	// ??
				viewpoint 1,149,103,7,0xFFFF00;
		}
		close2;
		cutin "rock_cact03",255;
		end;
	}
}

rockrdg1.gat,339,134,3	script	�`�r���N�^�[#rrrem02	10222,{
	if(!checkquest(16079)) {
		mes "[�`�r���N�^�[]";
		mes "�A�K�x���W���[�X�A";
		mes "�����ė�����Č������̂Ɂc�c�B";
		close;
	}
	mes "[�`�r���N�^�[]";
	mes "�A�K�x���W���[�X���������ł��B";
	mes "�������݂����ł��B";
	next;
	mes "[�`�r���N�^�[]";
	mes "�A�K�x�W���[�X�H";
	mes "���N�^�[���D����";
	mes "�A�K�x���W���[�X�ł����H";
	close;
}

rockrdg1.gat,146,164,1	script	�r��̃L���N�^�[�s��#rr	10218,{
	mes "[�r��̃L���N�^�[�s��]";
	mes "�r�������L���N�^�[�������������H";
	mes "�����ɂ��������͖Z�����񂾁B";
	mes "�p�������Ȃ�s���Ă��������H";
	if(!checkquest(16078) || checkquest(16083) || checkquest(16088))
		close;
	next;
	menu "�A�K�x���W���[�X�ɂ��ĕ���",-;
	mes "[�r��̃L���N�^�[�s��]";
	mes "����̂��Ƃ��H";
	mes "���������Ί�̌��Ԃ�";
	mes "�����Ă����ȁB";
	next;
	mes "�]���Ȃ��͎������������]";
	next;
	mes "[�r��̃L���N�^�[�s��]";
	mes "�ٖM�l�A";
	mes "�L���N�^�[����������������";
	mes "�N�ɕԂ����R�͂Ȃ��B";
	mes "�N���R�����Ă���̂�������Ȃ��B";
	next;
	switch(select("�͂ŋ�������","���ւɐ�������")) {
	case 1:
		mes "[�r��̃L���N�^�[�s��]";
		mes "���͌����ĂԂ��ƂɂȂ�B";
		mes "�������N����O��";
		mes "���̃W���[�X��n�����B";
		mes "�����L���N�^�[�����͌N�̂悤��";
		mes "�ٖM�l�Ɉ˗��������Ƃ�";
		mes "�����ƒp���邾�낤�B";
		break;
	case 2:
		mes "[�r��̃L���N�^�[�s��]";
		mes "�킩�����B�Ԃ����B";
		mes "���������N�̌����Ă��邱�Ƃ�";
		mes "�R�������Ƃ�����A";
		mes "�L���N�^�[���𗘗p�����񂢂�";
		mes "���̐g�������Ēm�邱�Ƃ�";
		mes "�Ȃ邾�낤�B";
		break;
	}
	if(checkitemblank() == 0) {
		next;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���1�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close;
	}
	setquest 16083;
	compquest 16083;
	getitem 25246,1;
	cloakonnpc;
	viewpoint 2,1,1,1,0xFFFFFF;
	if( (
		checkquest(16081) + checkquest(16082) +
		checkquest(16083) + checkquest(16084) +
		checkquest(16085) + checkquest(16086) +
		checkquest(16087)
	) == 40) {
		next;
		mes "�]�A�K�x���W���[�X��5�������B";
		mes "�@�R���[�e��30�C����������";
		mes "�@�L���N�^�[�����ɕ񍐂��悤�]";
		delquest 16081;
		delquest 16082;
		delquest 16083;
		delquest 16084;
		delquest 16085;
		delquest 16086;
		delquest 16087;
		setquest 16088;
		compquest 16088;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		viewpoint 2,1,1,7,0xFFFFFF;
	}
	close;
}

rockrdg1.gat,305,200,3	script	�L���N�^�[����#rrem04	10226,{
	mes "[�L���N�^�[����]";
	mes "�c�c���m��ʐl�A";
	mes "�ߊ��Ȃ��ŁB�\�����B";
	emotion 7,"�L���N�^�[����#rrem04";
	if(!checkquest(16078) || checkquest(16087) || checkquest(16088))
		close;
	next;
	menu "�A�K�x���W���[�X�ɂ��ĕ���",-;
	mes "[�L���N�^�[����]";
	mes "�A�K�x���W���[�X�H";
	mes "�܂��������T���Ă�����ł����H";
	mes "���ɖ�����Ă��܂������c�c�B";
	next;
	mes "[�L���N�^�[����]";
	mes "�����ł����A";
	mes "�L���N�^�[�������񂪁c�c�B";
	mes "�킩��܂����B";
	next;
	mes "[�L���N�^�[����]";
	mes "�L���N�^�[���������";
	mes "���O��m���Ă���Ƃ������Ƃ́A";
	mes "���Ȃ��̌��t�͖{���Ȃ̂ł��傤�B";
	mes "�󂯎���Ă��������B";
	emotion 1,"�L���N�^�[����#rrem04";
	if(checkitemblank() == 0) {
		next;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���1�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close;
	}
	setquest 16087;
	compquest 16087;
	getitem 25246,1;
	cloakonnpc;
	viewpoint 2,1,1,2,0xFFFFFF;
	if( (
		checkquest(16081) + checkquest(16082) +
		checkquest(16083) + checkquest(16084) +
		checkquest(16085) + checkquest(16086) +
		checkquest(16087)
	) == 40) {
		next;
		mes "�]�A�K�x���W���[�X��5�������B";
		mes "�@�R���[�e��30�C����������";
		mes "�@�L���N�^�[�����ɕ񍐂��悤�]";
		delquest 16081;
		delquest 16082;
		delquest 16083;
		delquest 16084;
		delquest 16085;
		delquest 16086;
		delquest 16087;
		setquest 16088;
		compquest 16088;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		viewpoint 2,1,1,7,0xFFFFFF;
	}
	close;
}

rockrdg1.gat,195,183,3	script	�D��S�����ȃR���[�e#rr	3739,{}

rockrdg1.gat,195,182,0	script	#�D��S�����ȃR���[�e01	139,7,7,{
	end;
OnTouch:
	if(!checkquest(16078) || checkquest(16085) || checkquest(16088))
		end;
	mes "�]�R���[�e������������Ȃ���";
	mes "�@�V�Ԃ̂ɖ����ɂȂ��Ă���B";
	mes "�@�L���N�^�[�������񂪖�������";
	mes "�@�A�K�x���W���[�X��������Ȃ��]";
	next;
	mes "�@�傫�Ȑ��Œǂ������Ă݂悤�B";
	mes "�@�Ȃ�Ƌ��т܂����H�]";
	next;
	input '@str$;
	unittalk getcharid(3),strcharinfo(0)+" : " +'@str$+ "!";
	mes "[" +strcharinfo(0)+ "]";
	mes '@str$+ "!";
	next;
	mes "[�D��S�����ȃR���[�e]";
	mes "�L�����I";
	next;
	mes "�]�R���[�e�͋�����";
	mes "�@�ǂ����֍s���Ă��܂����B";
	mes "�@�����Ă����A�K�x���W���[�X��";
	mes "�@���Ƃ��Ă������]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���1�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close;
	}
	setquest 16085;
	compquest 16085;
	getitem 25246,1;
	cloakonnpc;
	cloakonnpc "�D��S�����ȃR���[�e#rr";
	viewpoint 2,1,1,3,0xFFFFFF;
	if( (
		checkquest(16081) + checkquest(16082) +
		checkquest(16083) + checkquest(16084) +
		checkquest(16085) + checkquest(16086) +
		checkquest(16087)
	) == 40) {
		next;
		mes "�]�A�K�x���W���[�X��5�������B";
		mes "�@�R���[�e��30�C����������";
		mes "�@�L���N�^�[�����ɕ񍐂��悤�]";
		delquest 16081;
		delquest 16082;
		delquest 16083;
		delquest 16084;
		delquest 16085;
		delquest 16086;
		delquest 16087;
		setquest 16088;
		compquest 16088;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		viewpoint 2,1,1,7,0xFFFFFF;
	}
	close;
}

rockrdg1.gat,182,124,3	script	���������R#rrem01	557,{
	if(!checkquest(16078) || checkquest(16081) || checkquest(16088)) {
		mes "�]�����܂����܂��Ă���B";
		mes "�@�����̃S�~�̂悤���]";
		close;
	}
	mes "�]�����܂����܂��Ă���B";
	mes "�@�L���N�^�[�������񂪖�������";
	mes "�@�A�K�x���W���[�X��������Ȃ��]";
	next;
	mes "�]�߂Â��Ċm�F���Ă���ƁA";
	mes "�@�A�K�x���W���[�X�̃��x����";
	mes "�@�t���Ă���B";
	mes "�@�j������͂��Ă��Ȃ��悤���]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���1�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close;
	}
	setquest 16081;
	compquest 16081;
	getitem 25246,1;
	cloakonnpc;
	viewpoint 2,1,1,4,0xFFFFFF;
	if( (
		checkquest(16081) + checkquest(16082) +
		checkquest(16083) + checkquest(16084) +
		checkquest(16085) + checkquest(16086) +
		checkquest(16087)
	) == 40) {
		next;
		mes "�]�A�K�x���W���[�X��5�������B";
		mes "�@�R���[�e��30�C����������";
		mes "�@�L���N�^�[�����ɕ񍐂��悤�]";
		delquest 16081;
		delquest 16082;
		delquest 16083;
		delquest 16084;
		delquest 16085;
		delquest 16086;
		delquest 16087;
		setquest 16088;
		compquest 16088;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		viewpoint 2,1,1,7,0xFFFFFF;
	}
	close;
}

rockrdg1.gat,286,247,3	script	���������R#rrem02	557,{
	if(!checkquest(16078) || checkquest(16084) || checkquest(16088)) {
		mes "�]�����܂����܂��Ă���B";
		mes "�@�����̃S�~�̂悤���]";
		close;
	}
	mes "�]�����܂����܂��Ă���B";
	mes "�@�L���N�^�[�������񂪖�������";
	mes "�@�A�K�x���W���[�X��������Ȃ��]";
	next;
	mes "�]�߂Â��Ċm�F���Ă���ƁA";
	mes "�@�A�K�x���W���[�X�̃��x����";
	mes "�@�t���Ă���B";
	mes "�@�j������͂��Ă��Ȃ��悤���]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���1�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close;
	}
	setquest 16084;
	compquest 16084;
	getitem 25246,1;
	cloakonnpc;
	viewpoint 2,1,1,5,0xFFFFFF;
	if( (
		checkquest(16081) + checkquest(16082) +
		checkquest(16083) + checkquest(16084) +
		checkquest(16085) + checkquest(16086) +
		checkquest(16087)
	) == 40) {
		next;
		mes "�]�A�K�x���W���[�X��5�������B";
		mes "�@�R���[�e��30�C����������";
		mes "�@�L���N�^�[�����ɕ񍐂��悤�]";
		delquest 16081;
		delquest 16082;
		delquest 16083;
		delquest 16084;
		delquest 16085;
		delquest 16086;
		delquest 16087;
		setquest 16088;
		compquest 16088;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		viewpoint 2,1,1,7,0xFFFFFF;
	}
	close;
}

rockrdg1.gat,202,246,3	script	���������R#rrem03	557,{
	if(!checkquest(16078) || checkquest(16086) || checkquest(16088)) {
		mes "�]�����܂����܂��Ă���B";
		mes "�@�����̃S�~�̂悤���]";
		close;
	}
	mes "�]�����܂����܂��Ă���B";
	mes "�@�L���N�^�[�������񂪖�������";
	mes "�@�A�K�x���W���[�X��������Ȃ��]";
	next;
	mes "�]�߂Â��Ċm�F���Ă���ƁA";
	mes "�@�A�K�x���W���[�X�̃��x����";
	mes "�@�t���Ă���B";
	mes "�@�j������͂��Ă��Ȃ��悤���]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���1�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close;
	}
	setquest 16086;
	compquest 16086;
	getitem 25246,1;
	cloakonnpc;
	viewpoint 2,1,1,6,0xFFFFFF;
	if( (
		checkquest(16081) + checkquest(16082) +
		checkquest(16083) + checkquest(16084) +
		checkquest(16085) + checkquest(16086) +
		checkquest(16087)
	) == 40) {
		next;
		mes "�]�A�K�x���W���[�X��5�������B";
		mes "�@�R���[�e��30�C����������";
		mes "�@�L���N�^�[�����ɕ񍐂��悤�]";
		delquest 16081;
		delquest 16082;
		delquest 16083;
		delquest 16084;
		delquest 16085;
		delquest 16086;
		delquest 16087;
		setquest 16088;
		compquest 16088;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		viewpoint 2,1,1,7,0xFFFFFF;
	}
	close;
}

rockrdg1.gat,149,103,3	script	���������R#rrem04	557,{
	if(!checkquest(16078) || checkquest(16082) || checkquest(16088)) {
		mes "�]�����܂����܂��Ă���B";
		mes "�@�����̃S�~�̂悤���]";
		close;
	}
	mes "�]�����܂����܂��Ă���B";
	mes "�@�L���N�^�[�������񂪖�������";
	mes "�@�A�K�x���W���[�X��������Ȃ��]";
	next;
	mes "�]�߂Â��Ċm�F���Ă���ƁA";
	mes "�@�A�K�x���W���[�X�̃��x����";
	mes "�@�t���Ă���B";
	mes "�@�j������͂��Ă��Ȃ��悤���]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���1�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close;
	}
	setquest 16082;
	compquest 16082;
	getitem 25246,1;
	cloakonnpc;
	viewpoint 2,1,1,7,0xFFFFFF;
	if( (
		checkquest(16081) + checkquest(16082) +
		checkquest(16083) + checkquest(16084) +
		checkquest(16085) + checkquest(16086) +
		checkquest(16087)
	) == 40) {
		next;
		mes "�]�A�K�x���W���[�X��5�������B";
		mes "�@�R���[�e��30�C����������";
		mes "�@�L���N�^�[�����ɕ񍐂��悤�]";
		delquest 16081;
		delquest 16082;
		delquest 16083;
		delquest 16084;
		delquest 16085;
		delquest 16086;
		delquest 16087;
		setquest 16088;
		compquest 16088;
		viewpoint 2,1,1,1,0xFFFFFF;
		viewpoint 2,1,1,2,0xFFFFFF;
		viewpoint 2,1,1,3,0xFFFFFF;
		viewpoint 2,1,1,4,0xFFFFFF;
		viewpoint 2,1,1,5,0xFFFFFF;
		viewpoint 2,1,1,6,0xFFFFFF;
		viewpoint 2,1,1,7,0xFFFFFF;
	}
	close;
}

rockrdg2.gat,295,328,5	script	�a��ȃK�X�g#rockdaily	10231,{
	if(ROCKRIDGE_1QUE < 16) {
		mes "[�K�X�g]";
		mes "�ӂ��A�������猩�邾���ł�";
		mes "�����@���y���āc�c";
		next;
		mes "[�K�X�g]";
		mes "�����Ă�񂾁I";
		mes "���̘b�𕷂����̂�!?";
		mes "���낿��낵�ĂȂ���";
		mes "�������ɍs���I";
		next;
		mes "�]�����c�̖����������Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(BaseLevel < 160) {
		mes "[�K�X�g]";
		mes "���[��ǂ�����΁c�c�B";
		next;
		mes "�]�l���������Ă���";
		mes "�@�C�Â��Ă��Ȃ��悤���B";
		mes "�@^ff0000BaseLv160^000000�ȏ�ɂȂ��Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	if(checkquest(1299)) {
		if(checkquest(1299)&2 == 0) {
			mes "[�K�X�g]";
			mes "�K�X�^�[�ގ��ɂ͂܂������������ȁB";
			mes "�p�g���[�����O��";
			mes "�ގ����Ă����Ȃ���";
			mes "���܂�Ӗ����Ȃ�����ˁB";
			close;
		}
		mes "[�K�X�g]";
		mes "�����A�悻�҂���I";
		mes "�������`���Ă����̂����H";
		next;
		if(select("���݂�","�f��") == 2) {
			mes "[�K�X�g]";
			mes "�����͖Z�����̂����H";
			close;
		}
		mes "[�K�X�g]";
		mes "���肪�Ƃ��I";
		mes "���ꂶ��A�N���Ɍ�����O��";
		mes "�����s���Ă��ĂˁB";
		delquest 1299;
		setquest 1298;
		close;
	}
	if(checkquest(1298) & 0x4) {
		mes "[�K�X�g]";
		mes "�K�X�^�[��ގ����Ă��ꂽ�̂����H";
		mes "���肪�Ƃ��I";
		mes "����͂��炾��I";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		delquest 1298;
		setquest 1299;
		getitem 25250,3;
		getexp 300000000,0,1;
		getexp 0,120000000,0;
		mes "[�K�X�g]";
		mes "�����A�܂������O��";
		mes "�������ƃp�g���[���ɍs���ė��悤�B";
		mes "�����ǂ�������A���̃p�g���[���̑O�ɂ�";
		mes "�K�X�^�[�ގ��������󂯂Ăق����ȁB";
		close;
	}
	if(!checkquest(1298)) {
		mes "[�K�X�g]";
		mes "���[��ǂ�����΂����񂾁c�c�B";
		mes "�傫����@�ł������čs�������H";
		mes "����A����Ȏ���������";
		mes "�o���Ă��܂��댯���c�c";
		mes "�N���I";
		emotion 0,"";
		next;
		mes "[�K�X�g]";
		mes "����H�@�������Ȃ��炾�ˁB";
		mes "���x�c�ł͂Ȃ����������c�c�B";
		next;
		mes "[�K�X�g]";
		mes "����҂Ă�A�悭������c�c";
		mes "�������̎ז������Ă���";
		mes "�悻�҂���Ȃ����H";
		next;
		menu "�l�Ⴂ�ł�",-;
		mes "[�K�X�g]";
		mes "��H�@�����Ȃ́H";
		mes "���̊��Ⴂ���������B";
		mes "�܂��������ȁB";
		mes "�����{�l�Ȃ炱��ȏꏊ��";
		mes "�̂��̂�����킯�Ȃ����B";
		next;
		mes "[�K�X�g]";
		mes "�c�c�Ƃ���ŁA�悻�҂���B";
		mes "�z�R��^ff0000�K�X�^�[^000000�Ƃ��������";
		mes "�������Ƃ��邩���H";
		next;
		menu "�������Ƃ���",-,"�K�X�^�[�H",-;
		mes "[�K�X�g]";
		mes "�K�X�^�[�̓K�X�̉򂾁B";
		mes "�����ɋ߂Â���";
		mes "������݂��~�܂�Ȃ��Ȃ�B";
		mes "���ꂾ������Ȃ��A�ڂ���͗܁A";
		mes "�@����͕@���܂ŏo�Ă��܂��B";
		next;
		mes "[�K�X�g]";
		mes "���������Ƃɍ��񎄂�";
		mes "�z�R�̃p�g���[�������鎖��";
		mes "�Ȃ��Ă��܂����񂾁B";
		mes "�����̕����͊��Ȃ��Ƃ������Ȃ̂�";
		mes "�݂�Ȃ̑O�ŃA�����M�[������";
		mes "�o���Ȃ��Ȃ�Č����Ȃ���B";
		next;
		mes "[�K�X�g]";
		mes "����łȂ񂾂��ǁA";
		mes "������Ə����ė~�����񂾁B";
		next;
		mes "[�K�X�g]";
		mes "�����p�g���[�����n�߂钼�O��";
		mes "^FF0000�K�X�^�[��20�C^000000�ގ����ė~�����B";
		mes "��V�͓n������A�ǂ������H";
		next;
		if(select("���͂���","�f��") == 2) {
			mes "[�K�X�g]";
			mes "��V���Ⴆ��񂾂�H";
			mes "���Ȃ��́H";
			close;
		}
		mes "[�K�X�g]";
		mes "�{�������H";
		mes "���肪�Ƃ��I";
		mes "�N���������肾��I";
		next;
		mes "[�K�X�g]";
		mes "�������A�ꉞ�����Ă������ǁA";
		mes "���Ƃ̊֌W���^���Ȃ��悤��";
		mes "��肭����Ăق����B";
		mes "������o���ł�������A";
		mes "�N�������ǂ����Ƃ͂Ȃ�����ˁB";
		mes "�C�����Ă������B";
		setquest 1298;
		close;
	}
	mes "[�K�X�g]";
	mes "�K�X�^�[�͑ގ����Ă��ꂽ�H";
	mes "���������p�g���[���̎��Ԃ�����";
	mes "����܂łɗ��ނ�B";
	mes "�悻�҂̌N����������Ȃ񂾁B";
	close;
}
