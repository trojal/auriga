//= Auriga Script ==============================================================
// Ragnarok Online Lighthalzen Dungeon Monster Spawn Script�@�@Ep 15.2
//==============================================================================

//============================================================
// ���̍H�w������ 01 - lhz_dun01.gat
//------------------------------------------------------------
lhz_dun01.gat,0,0,0,0		monster	�E�B���X		1627,30,5000,0,0
lhz_dun01.gat,0,0,0,0		monster	�����[�o�[		1682,380,5000,0,0

//============================================================
// ���̍H�w������ 02 - lhz_dun02.gat
//------------------------------------------------------------
lhz_dun02.gat,0,0,0,0		monster	�E�B���X		1627,26,5000,0,0
lhz_dun02.gat,0,0,0,0		monster	�C�O�j�[��=�Z�j�A	1652,46,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	�q���b�P�o�C��=�g���X	1653,56,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	�A���}�C�A=�f�����[	1654,56,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	�C�����h=�G�x�V		1655,46,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	�J���@�N=�C�J���X	1656,26,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	���E����=���B���_�[	1657,36,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	�C�O�j�[��=�Z�j�A	1652,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	�q���b�P�o�C��=�g���X	1653,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	�A���}�C�A=�f�����[	1654,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	�C�����h=�G�x�V		1655,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	�J���@�N=�C�J���X	1656,4,5000,0,1
lhz_dun02.gat,150,150,56,54	monster	���E����=���B���_�[	1657,4,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	�C�O�j�[��=�Z�j�A	1652,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	�q���b�P�o�C��=�g���X	1653,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	�A���}�C�A=�f�����[	1654,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	�C�����h=�G�x�V		1655,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	�J���@�N=�C�J���X	1656,10,5000,0,1
lhz_dun02.gat,150,150,105,90	monster	���E����=���B���_�[	1657,10,5000,0,1
lhz_dun02.gat,0,0,0,0		monster	�W�F�~�j-S58		1681,10,1800000,0,0
lhz_dun02.gat,0,0,0,0		monster	�C�O�j�[��=�Z�j�A	1658,1,7200000,5400000,1
//lhz_dun02.gat,0,0,0,0		monster	�E�B�b�V��=�}�X�R�b�g	2441,1,14400000,18000000,1
//lhz_dun02.gat,0,0,0,0		monster	�A�[�e�B�X=�}�X�R�b�g	2442,1,14400000,18000000,1

//============================================================
// ���̍H�w������ 03 - lhz_dun03.gat
//------------------------------------------------------------
lhz_dun03.gat,0,0,0,0	monster	�Z�C����=�E�B���U�[	1634,20,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	�G�����X=�K�C��		1635,10,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	�n���[�h=�A���g�A�C�[��	1636,10,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	�}�[�K���b�^=�\����	1637,20,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	�Z�V��=�f�B����		1638,20,20000,0,0
lhz_dun03.gat,0,0,0,0	monster	�J�g���[�k=�P�C����	1639,20,20000,0,0
lhz_dun03.gat,114,138,12,16	monster	�Z�C����=�E�B���U�[	1640,1,600000,0,1
lhz_dun03.gat,163,138,12,16	monster	�n���[�h=�A���g�A�C�[��	1642,1,600000,0,1
lhz_dun03.gat,139,158,20,11	monster	�G�����X=�K�C��		1641,1,600000,0,1
lhz_dun03.gat,139,117,20,11	monster	�Z�V��=�f�B����		1644,1,600000,0,1
lhz_dun03.gat,138,138,36,34	monster	�}�[�K���b�^=�\����	1643,1,600000,0,1
lhz_dun03.gat,138,138,36,34	monster	�J�g���[�k=�P�C����	1645,1,600000,0,1

lhz_dun03.gat,0,0,0	script	#LhzMVP3	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer6000000:
OnTimer6300000:
OnTimer6600000:
OnTimer6900000:
OnTimer7200000:
OnTimer7500000:
	if(rand(6))
		end;
OnTimer7800000:
	stopnpctimer;
	switch(rand(6)) {
	case 0: set '@x,140; set '@y,232; break;
	case 1: set '@x,75; set '@y,138; break;
	case 2: set '@x,140; set '@y,87; break;
	case 3: set '@x,205; set '@y,140; break;
	case 4: set '@x,123; set '@y,137; break;
	case 5: set '@x,157; set '@y,137; break;
	}
	monster "lhz_dun03.gat",'@x,'@y,"--ja--",1646+rand(6),1,"#LhzMVP3::OnKilled";
	end;
OnKilled:
	switch(rand(6)) {
	case 0: set '@x,183; set '@y,97; break;
	case 1: set '@x,97; set '@y,96; break;
	case 2: set '@x,47; set '@y,139; break;
	case 3: set '@x,231; set '@y,140; break;
	case 4: set '@x,139; set '@y,211; break;
	case 5: set '@x,139; set '@y,259; break;
	}
	monster "lhz_dun03.gat",'@x,'@y,"--ja--",1640+rand(6),1;
	initnpctimer;
	end;
}

//============================================================
// ���̍H�w������ 04 - lhz_dun04.gat
//------------------------------------------------------------
lhz_dun04.gat,0,0,0,0	monster	�����f��=�������X	2221,40,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	�G�~���[��=�v�����[��	2222,30,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	�Z���A=�A���f	2223,30,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	�`�F��=���E	2224,20,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	�K�[�e�B�[=�E�[	2225,20,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	�A���t�H�V�I=�o�W��	2226,10,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	�g�����e�B�[�j	2227,10,40000,0,0
lhz_dun04.gat,0,0,0,0	monster	�����f��=�������X	2228,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	�G�~���[��=�v�����[��	2229,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	�Z���A=�A���f	2230,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	�`�F��=���E	2231,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	�K�[�e�B�[=�E�[	2232,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	�A���t�H�V�I=�o�W��	2233,1,600000,0,1
lhz_dun04.gat,0,0,0,0	monster	�g�����e�B�[�j	2234,1,600000,0,1

lhz_dun04.gat,0,0,0	script	#LhzMVP4	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer6000000:
OnTimer6300000:
OnTimer6600000:
OnTimer6900000:
OnTimer7200000:
OnTimer7500000:
	if(rand(6))
		end;
OnTimer7800000:
	stopnpctimer;
	switch(rand(7)) {
	case 0: set '@x,77; set '@y,251; break;
	case 1: set '@x,147; set '@y,224; break;
	case 2: set '@x,219; set '@y,219; break;
	case 3: set '@x,244; set '@y,120; break;
	case 4: set '@x,149; set '@y,41; break;
	case 5: set '@x,53; set '@y,109; break;
	case 6: set '@x,149; set '@y,151; break;
	}
	monster "lhz_dun04.gat",'@x,'@y,"--ja--",2235+rand(7),1,"#LhzMVP4::OnKilled";
	end;
OnKilled:
	switch(rand(7)) {
	case 0: set '@x,77; set '@y,251; break;
	case 1: set '@x,147; set '@y,224; break;
	case 2: set '@x,219; set '@y,219; break;
	case 3: set '@x,244; set '@y,120; break;
	case 4: set '@x,149; set '@y,41; break;
	case 5: set '@x,53; set '@y,109; break;
	case 6: set '@x,149; set '@y,151; break;
	}
	monster "lhz_dun04.gat",'@x,'@y,"--ja--",2228+rand(7),1;
	initnpctimer;
	end;
}
