//= Auriga Script ==============================================================
// Ragnarok Online Izlude Dungeon Monster Spawn Script�@�@Ep 15.2
//==============================================================================

//============================================================
// �C�Y���[�h�C�ꓴ�A 1�w - iz_dun00.gat
//------------------------------------------------------------
iz_dun00.gat,0,0,0,0	monster	�q�h��		1068,50,5000,0,0
iz_dun00.gat,0,0,0,0	monster	�q�h��		1068,20,60000,0,0
iz_dun00.gat,0,0,0,0	monster	�v�����N�g��	1161,60,5000,0,0
iz_dun00.gat,0,0,0,0	monster	�N�N��		1070,20,5000,0,0
iz_dun00.gat,0,0,0,0	monster	�}���i		1141,50,5000,0,0
iz_dun00.gat,0,0,0,0	monster	�o�h��		1066,40,5000,0,0
iz_dun00.gat,0,0,0,0	monster	�������̂�	1084,5,180000,90000,1

//============================================================
// �C�Y���[�h�C�ꓴ�A 2�w - iz_dun01.gat
//------------------------------------------------------------
iz_dun01.gat,0,0,0,0	monster	�q�h��		1068,40,5000,0,0
iz_dun01.gat,0,0,0,0	monster	�N�N��		1070,20,5000,0,0
iz_dun01.gat,0,0,0,0	monster	�o�h��		1066,60,5000,0,0
iz_dun01.gat,0,0,0,0	monster	�}���X		1144,40,5000,0,0
iz_dun01.gat,0,0,0,0	monster	�I�{���k	1044,10,5000,0,0
iz_dun01.gat,0,0,0,0	monster	�J�i�g�E�X	1067,50,5000,0,1
iz_dun01.gat,0,0,0,0	monster	�������̂�	1084,10,180000,90000,1

//============================================================
// �C�Y���[�h�C�ꓴ�A 3�w - iz_dun02.gat
//------------------------------------------------------------
iz_dun02.gat,0,0,0,0	monster	�q�h��		1068,30,5000,0,0
iz_dun02.gat,0,0,0,0	monster	�N�N��		1070,10,5000,0,0
iz_dun02.gat,0,0,0,0	monster	�}���X		1144,20,5000,0,0
iz_dun02.gat,0,0,0,0	monster	�I�{���k	1044,100,5000,0,0
iz_dun02.gat,0,0,0,0	monster	�J�i�g�E�X	1067,30,5000,0,0
iz_dun02.gat,0,0,0,0	monster	�����l		1264,100,5000,0,0
iz_dun02.gat,0,0,0,0	monster	�������̂�	1084,15,180000,90000,1

//============================================================
// �C�Y���[�h�C�ꓴ�A 4�w - iz_dun03.gat
//------------------------------------------------------------
iz_dun03.gat,0,0,0,0	monster	�q�h��			1068,50,5000,0,0
iz_dun03.gat,0,0,0,0	monster	�t�F��			1158,10,5000,0,0
iz_dun03.gat,0,0,0,0	monster	�}�����X�t�B�A�[	1142,10,5000,0,0
iz_dun03.gat,0,0,0,0	monster	�\�[�h�t�B�b�V��	1069,60,5000,0,0
iz_dun03.gat,0,0,0,0	monster	�X�g���E�t		1065,20,5000,0,0
iz_dun03.gat,0,0,0,0	monster	�}���N			1045,50,5000,0,0
iz_dun03.gat,0,0,0,0	monster	�����l			1264,40,5000,0,0

iz_dun03.gat,0,0,0	script	#IzdunEVNT	-1,{
OnInit:
	set 'iz_monster,1158;
	initnpctimer;
	end;
OnTimer3600000:
	switch(rand(5)) {
		case 0: set 'iz_monster,1158; break;	//�t�F��
		case 1: set 'iz_monster,1069; break;	//�\�[�h�t�B�b�V��
		case 2: set 'iz_monster,1065; break;	//�X�g���E�t
		case 3: set 'iz_monster,1045; break;	//�}���N
		case 4: set 'iz_monster,1264; break;	//�����l
	}
	areamonster "iz_dun03.gat",0,0,0,0,"--ja--",'iz_monster,80,"#IzdunEVNT::OnKilled";
	end;
OnKilled:
	if(getnpctimer(0) > 3600000 && getnpctimer(0) < 3900000){
		areamonster "iz_dun03.gat",0,0,0,0,"--ja--",'iz_monster,1,"#IzdunEVNT::OnKilled";
	}
	end;
OnTimer3900000:
	killmonster "iz_dun03.gat","#IzdunEVNT::OnKilled";
	initnpctimer;
	end;
}

//============================================================
// �C�Y���[�h�C��_�a - iz_dun04.gat
//------------------------------------------------------------
iz_dun04.gat,0,0,0,0		monster	�}���N		1045,60,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�I�{���k	1044,100,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�X�g���E�t		1065,100,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�}�[�}��		2394,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�Z�C���[��		2395,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�|�Z�C�h��		2396,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�N���[�P���x�C�r�[	2397,15,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�f�r�A�X	1108,6,5000,0,0
iz_dun04.gat,0,0,0,0		monster	�h�t��			2203,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	�Z�h��			2204,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	�X���t�H		2201,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	�L���O�h����	2198,1,120000,0,0
iz_dun04.gat,0,0,0,0		monster	�y�m���i	1216,18,300000,0,0

//============================================================
// �C�Y���[�h�C��s�s - iz_dun05.gat
//------------------------------------------------------------
iz_dun05.gat,0,0,0,0	monster	�h�t��			2203,120,5000,0,0
iz_dun05.gat,0,0,0,0	monster	�Z�h��			2204,150,5000,0,0
iz_dun05.gat,0,0,0,0	monster	�X���t�H		2201,140,5000,0,0
iz_dun05.gat,0,0,0,0	monster	�L���O�h����	2198,40,5000,0,0
iz_dun05.gat,0,0,0,0	monster	�^�N��			2205,20,60000,0,0

iz_dun05.gat,0,0,0	script	#IzdunMVP	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer7200000:
OnTimer7500000:
OnTimer7800000:
OnTimer8100000:
OnTimer8400000:
OnTimer8700000:
	if(rand(6))
		end;
OnTimer9000000:
	stopnpctimer;
	set 'kraken,5;
	set '@x,rand(55,75);
	set '@y,rand(70,90);
	set 'mob,callmonster("iz_dun05.gat",'@x,'@y,"�N���[�P��",2202,"#IzdunMVP::OnKilled");
	monster "iz_dun05.gat",15,206,"�e���^�N���X",2384,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",250,228,"�e���^�N���X",2385,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",142,18,"�e���^�N���X",2386,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",12,98,"�e���^�N���X",2387,1,"#IzdunMVP::OnKilled2";
	monster "iz_dun05.gat",196,28,"�e���^�N���X",2388,1,"#IzdunMVP::OnKilled2";
	end;
OnKilled:
	killmonster "iz_dun05.gat","#IzdunMVP::OnKilled2";
	initnpctimer;
	end;
OnKilled2:
	//�e���^�N���X��1�̓|�����ƂɃN���[�P���̗̑͂�20%����������Ǝv����
	if(getmobhp('mob)){
		setmobhp 'mob,getmobhp('mob) * 80 / 100;
		set 'kraken,'kraken-1;
		switch('kraken){
		case 0:
			announce "�����̔ߒɂȋ��т��C��ɋ������B���Ȃ����Ă���!!", 0x9, 0xff8c00, 0x190, 12, 0, 0;
			break;
		case 1:
		case 2:
			announce "�����̔ߖ���������B���Ȃ�ꂵ������������", 0x9, 0xff8c00, 0x190, 12, 0, 0;
			break;
		case 3:
		case 4:
			announce "�����̂��߂������������饥����", 0x9, 0xff8c00, 0x190, 12, 0, 0;
			break;
		}
	}
	end;
}
