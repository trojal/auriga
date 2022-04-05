//= Auriga Script ==============================================================
// Ragnarok Online Nightmare mode Pyramids Script	by refis
//==============================================================================

//============================================================
// �s���~�b�h�i�C�g���A �]��NPC
//------------------------------------------------------------
moc_prydb1.gat,103,54,3	script	�������L#prydn1	547,{
	if(BaseLevel < 100) {
		mes "[�������L]";
		mes "�܂����}�~�[��";
		mes "����Ă��܂��Ƃ́c�c";
		mes "�]^ff0000BaseLv100�ȏ�^000000�ɂȂ��";
		mes "�@���̏ꏊ����";
		mes "�@�s���~�b�h�_���W�����@�閧�̒n����";
		mes "�@���ꂪ�\�ƂȂ�܂��]";
		close;
	}
	mes "[�������L]";
	mes "���̐�ɍs�������̂��H";
	mes "���̐�͎��������������ʂȏꏊ���I";
	mes "�ǂ����Ă��s�������ƌ����Ȃ�";
	mes "�ʍs���Ƃ���^ff00005,000^000000Zeny�����������I";
	next;
	switch(select("5,000Zeny�𕥂��ďo��","�b�𕷂�","���̏������")) {
	case 1:
		if(Zeny < 5000) {
			// ������
			mes "[�������L]";
			mes "�ɂ�ɂ�I";
			mes "����������Ȃ��Ȃ�b�ɂȂ�Ȃ��I";
			close;
		}
		mes "[�������L]";
		mes "�悵�B���ꂶ�Ⴀ���ė��āI";
		close2;
		set Zeny,Zeny-5000;
		warp "moc_prydn1.gat",93,96;
		end;
	case 2:
		mes "[�������L]";
		mes "���܂Œ����ԁA�ςݏグ�Ă���������";
		mes "�n�ɗ����Ă��܂���������Ƃ́c�c�B";
		next;
		mes "[�������L]";
		mes "������{���ɂ��������񂾁c�c�B";
		mes "�}�~�[�̂����ɁB�@�}�~�[����!!";
		mes "����Ȃɋ����Ȃ�āI";
		next;
		if(select("�����ĕ���","��b����߂�") == 2) {
			mes "�]���Ȃ��͂��̏���������]";
			close;
		}
		mes "[�������L]";
		mes "�����B����͎������R";
		mes "�B���ʘH�̐�ɂ���A���������";
		mes "�̌@�����Ă������̎����B";
		next;
		mes "[�������L]";
		mes "��������}�~�[���ߊ���ė����񂾂�B";
		mes "��ڌ��ă}�~�[���Ƃ킩��������";
		mes "�C�ɂ�����Ƃ����Ă����񂾁B";
		mes "�}�~�[�Ȃ�Ď��̓G�ł͂Ȃ�����ˁB";
		mes "���������炾�c�c�I";
		next;
		mes "[�������L]";
		mes "�̂����ōs�����炢��";
		mes "����ȃr���^�������ꂽ��B";
		mes "���̃J���C�C�L���c�c�B";
		mes "�܂�������Ȃɋ����Ƃ́B";
		mes "�o���Ƃ���A��і�Y��!!";
		next;
		mes "[�������L]";
		mes "���̒��ɂ��郂���X�^�[�B��";
		mes "^ff0000�����ڂɘf�킳���Ȃ�^000000�B";
		mes "���܂ő����������̂���z����";
		mes "���f���Ă���ƒɂ��ڂɑ������I";
		next;
		mes "[�������L]";
		mes "�Ƃ����킯�ō̌@���o���Ȃ������";
		mes "������ʂ�`���҂���ʍs���������";
		mes "���v�𗧂Ă鎖�ɂ����B";
		mes "�L�ɂ�����������񂾂�I";
		next;
		mes "[�������L]";
		mes "���������A���ɍs���΂�����";
		mes "���Ԃ��̌@�����݂Ă邾�낤�B";
		mes "��`���Ă�����";
		mes "�ꝺ����̃`�����X��";
		mes "������邩������Ȃ����B";
		close;
	case 3:
		mes "�]���Ȃ��͂��̏���������]";
		close;
	}
OnInit:
	waitingroom "�閧�̒n����",0;
	end;
}

moc_prydn1.gat,94,98,3	script	�������L#prydn2	547,{
	mes "[�������L]";
	mes "�����������X�^�[��";
	mes "���悤�悵�Ă���ȁc�c�B";
	mes "���������������̏ꏊ�ɋA�낤�B";
	next;
	if(select("�߂�","�܂��c��") == 2) {
		emotion 4;
		mes "[�������L]";
		mes "�܂��c��̂��H";
		mes "�߂肽���Ȃ�����";
		mes "���������Ă���B";
		close;
	}
	mes "[�������L]";
	mes "���������A�����߂낤�B";
	close2;
	warp "moc_prydb1.gat",100,57;
	end;
}

//============================================================
// �s���~�b�h�i�C�g���A ����NPC
//------------------------------------------------------------
moc_ruins.gat,75,170,3	script	�̌@�Ɍ������L#prydn	561,{
	if(!checkquest(118850)) {
		mes "[�̌@�Ɍ������L]";
		if(strnpcinfo(2) == "prydn_out") {
			mes "���[�āA�s�����ȁB";
		}
		else {
			mes "�������A��͂胂���X�^�[�������ȁB";
		}
		mes "�@";
		if(BaseLevel < 100 || BaseLevel > 135) {
			mes "�]^ff0000BaseLv100����135�̊Ԃ̂�^000000";
			mes "�@������鎖���o����N�G�X�g�ł��]";
			close;
		}
		mes "�����A�Ȃ񂾂��O�B�`���҂��H";
		mes "�������B�������ɂ����ȁB";
		mes "������Ɖ��̎�`�������Ă���Ȃ����H";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "���͍����̕ӂɖ����Ă��邨���T����";
		mes "�̌@�����Ă���񂾁B";
		mes "�����A�̌@�ꏊ�ł̓����X�^�[��";
		mes "�ז������Ă��ĂȁB";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "�����퓬�͌�������Ȃ��񂾂�";
		mes "���͍̌@�ɏW�����������A";
		mes "������Ƃ������R�������ĂȁB";
		mes "���O�Ƀ����X�^�[��";
		mes "�|���ė��ė~�����񂾁B";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "�������A����͂͂��ނ��B";
		mes "�����X�^�[��|���ė������ɉ�����";
		mes "��������܂����V��n���Ă��B";
		mes "�ǂ����B����Ă���Ȃ����H";
		next;
		if(select("��`��","�f��") == 2) {
			mes "[�̌@�Ɍ������L]";
			mes "�����B";
			mes "�Ȃ񂾂��˂��ȁB";
			close;
		}
		mes "[�̌@�Ɍ������L]";
		mes "���肪�Ă��B";
		mes "���ꂶ�Ⴀ������x�b�������Ă���B";
		setquest 118850;
		compquest 118850;
		close;
	}
	if(checkquest(118855) & 0x2)
		delquest 118855;
	if(checkquest(118860) & 0x2)
		delquest 118860;
	mes "[�̌@�Ɍ������L]";
	mes "�����B�悭�����ȁB";
	mes "�����͂ǂ�����H";
	next;
	set '@str$,"�������󂯂�/�񍐂���";
	if(BaseLevel < 100 || BaseLevel > 135)
		set '@str$,"�񍐂���";
	switch(select('@str$,"������������߂�","�����𕷂�","��b����߂�")) {
	case 1:
		if((checkquest(118855) && checkquest(118855) & 0x2 == 0) ||
			(checkquest(118860) && checkquest(118860) & 0x2 == 0)) {
			mes "[�̌@�Ɍ������L]";
			mes "��B���O��";
			mes "���͂܂����v���B";
			mes "���܂荪�l�߂��ɂ���Ă���B";
			mes "�@";
			mes "�]���̃N�G�X�g��";
			mes "�@1���Ԃ�1��A����o���܂��]";
			close;
		}
		set '@d[0],checkquest(97000);
		set '@d[1],checkquest(97002);
		set '@d[2],checkquest(97004);
		set '@d[3],checkquest(97006);
		set '@d[4],checkquest(97008);
		set '@d[5],checkquest(97010);
		if('@d[0]+'@d[1]+'@d[2]+'@d[3]+'@d[4]+'@d[5] == 6) {
			mes "[�̌@�Ɍ������L]";
			mes "�ǂ����i�݋�́H";
			mes "���\�����狭�����낤�B";
			mes "���҂��Ă��邼�B";
			close;
		}
		if(('@d[0]+'@d[1]+'@d[2]) > 3 || ('@d[3]+'@d[4]+'@d[5]) > 3) {
			set '@cnt,'@cnt + ('@d[0]&4)? 1: 0;
			set '@cnt,'@cnt + ('@d[1]&4)? 3: 0;
			set '@cnt,'@cnt + ('@d[2]&4)? 6: 0;
			set '@cnt,'@cnt + ('@d[3]&4)? 1: 0;
			set '@cnt,'@cnt + ('@d[4]&4)? 3: 0;
			set '@cnt,'@cnt + ('@d[5]&4)? 6: 0;
			mes "[�̌@���̔L]";
			mes "�ق��B�[���ȗʂ̃����X�^�[��";
			mes "�|���ė��Ă��ꂽ�悤���ȁB";
			mes "���ꂶ�Ⴀ���O�ɂ�";
			mes "��������܂���^ff0000" +'@cnt+ "^000000�ق�";
			mes "�A�C�e����n�����Ƃɂ��悤�B";
			mes "��V���󂯎�邩�H";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�̌@���̔L]";
				mes "�Ȃ񂾁B�ו��ł������̂��H";
				mes "��V���󂯎�鏀�����o������";
				mes "�܂�����񂾂ȁB";
				close;
			}
			mes "[�̌@���̔L]";
			mes "���ꂶ�Ⴀ�n�����B";
			mes "����^ff0000���������^000000�ɂ�";
			mes "�F�X�Ȃ��̂������Ă���B";
			mes "�����o�邩�͂��O�̉^���������B";
			mes "�K�^���F��񂾂ȁB";
			next;
			if('@d[0]&4) {
				delquest 97000;
				delquest 97002;
				delquest 97004;
			}
			if('@d[3]&4) {
				delquest 97006;
				delquest 97008;
				delquest 97010;
			}
			//�_�C�������h�P�J���b�g,�_�C�������h�Q�J���b�g,�_�C�������h�R�J���b�g
			//��̎w��,���̎w��,�_�C���̎w��,����,�󔠁@1��,�󔠁@2��,�󔠁@5��
			setarray '@gain,731,732,2611,2610,2613,969,7444,7444,7444, 730;
			setarray '@num,   1,  1,   1,   1,   1,  1,   1,   2,   5,   1;
			setarray '@rate,300,100, 300, 200, 200,100, 100,  80,  50,1000;
			for(set '@i,0; '@i < '@cnt; set '@i,'@i+1) {
				for(set '@j,0; '@j < getarraysize('@gain); set '@j,'@j+1) {
					if(rand(1000) < '@rate['@j]) {
						getitem '@gain,'@num;
						break;
					}
				}
			}
			mes "[�̌@���̔L]";
			mes "�悵�B����Ȃ��񂾂ȁB";
			mes "���肪�Ƃ��ȁB";
			close;
		}
		if(BaseLevel < 100 || BaseLevel > 135) {
			// ������
			mes "�]^ff0000BaseLv100����135�̊Ԃ̂�^000000";
			mes "�@������鎖���o����N�G�X�g�ł��]";
			close;
		}
		mes "[�̌@�Ɍ������L]";
		mes "^ff0000�O���C���A�N���E�X^000000��";
		mes "^ff0000�O���C���~�m�^�E���X^000000��";
		mes "�|���Ă��Ă���B";
		if(!checkquest(118855))
			setquest 118855;
		if(!checkquest(97000)) {
			setquest 97000;
			setquest 97002;
			setquest 97004;
		}
		if(!checkquest(118860))
			setquest 118860;
		if(!checkquest(97006)) {
			setquest 97006;
			setquest 97008;
			setquest 97010;
		}
		if(checkquest(118855) && !checkquest(118860)) {
			next;
			mes "[�̌@���̔L]";
			mes "�����ƁB";
			mes "�O���C���~�m�^�E���X������";
			mes "���肢�����΂���̂悤���ȁB";
			mes "����͖����ɂ��悤�B";
			next;
			mes "[�̌@���̔L]";
		}
		else if(!checkquest(118855) && checkquest(118860)) {
			next;
			mes "[�̌@���̔L]";
			mes "�����ƁB";
			mes "�O���C���A�N���E�X������";
			mes "���肢�����΂���̂悤���ȁB";
			mes "����͖����ɂ��悤�B";
			next;
			mes "[�̌@���̔L]";
		}
		mes "���񂾂��B";
		close;
	case 2:
		if(!checkquest(97000) && !checkquest(97006)) {
			mes "[�̌@�Ɍ������L]";
			mes "��H�@�˗�����߂����H";
			mes "�����A���܂��ɂ��肢���Ă���";
			mes "�˗��͖����悤�����B";
			close;
		}
		mes "[�̌@�Ɍ������L]";
		mes "���O�ɂׂ͉��d���������H";
		mes "�܂��d���Ȃ��B";
		mes "����������߂�̂ł����";
		mes "�r���܂Ői�s�������̂��܂߂�";
		mes "�S�Ė����ɂȂ邪�{���ɗǂ����H";
		next;
		if(select("���������撣��","^ff0000�˗���������߂�^000000") == 1) {
			mes "[�̌@�Ɍ������L]";
			mes "�������B";
			mes "���ꂶ�ᗊ�񂾂��I";
			close;
		}
		mes "[�̌@�Ɍ������L]";
		mes "�������B�d���Ȃ��ȁB";
		mes "�킩������B";
		mes "���̋C�ɂȂ�����܂����Ă����ȁB";
		if(checkquest(97000)) {
			delquest 97000;
			delquest 97002;
			delquest 97004;
		}
		if(checkquest(97006)) {
			delquest 97006;
			delquest 97008;
			delquest 97010;
		}
		close;
	case 3:
		mes "[�̌@�Ɍ������L]";
		mes "�ȒP�Ȏ����B";
		mes "���̕ӂɐ������郂���X�^�[�̂���";
		mes "���ɍ̌@�̎ז��ƂȂ�";
		mes "^ff0000�O���C���~�m�^�E���X^000000��";
		mes "^ff0000�O���C���A�N���E�X^000000��";
		mes "�|���ė��ė~�����񂾁B";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "��������|���ė�����";
		mes "���������V����낤�B";
		mes "�@";
		mes "�������I";
		mes "�r�̗��`���҂�";
		mes "�������f�点�Ă�����Ă���B";
		next;
		mes "�]�C���t�H���[�V�����]";
		mes "�@^ff0000BaseLv100����135�܂ł̊�^000000";
		mes "�@������鎖���o����N�G�X�g�ł��B";
		mes "�@�񍐌�A^ff00001����^000000�͍Ď���o���܂���B";
		mes "�@BaseLv136�ȏ�ɂȂ�ƁA";
		mes "�@�i�s���̃N�G�X�g�̂�";
		mes "�@�񍐂��\�ł��B";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "���B�̂悤�ȔL�͖`���҂Ƃ̋�����";
		mes "�K�v�s�����B";
		mes "���͘r���Ղ��Ȃ炻�̕ӂ̖`���҂ɂ�";
		mes "���������͖������ǂȁB";
		mes "���Ԃ̔L�݂�Ȃ�";
		mes "���������킯����˂��B";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "�����璇�ԓ��ŏW�܂����Ƃ���";
		mes "�݂�ȂŏW�߂����̂�������̈ꕔ��";
		mes "�������̖`���҂̕⏕�����Ă�������";
		mes "�b�����Ă����̂��B";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "����Ȃ�΂Ɖ���̃��[�_�[��";
		mes "���ݍ̌@���̂��̃s���~�b�h��";
		mes "�̌@�̎ז������郂���X�^�[��";
		mes "�|���Ă����`���҂�";
		mes "��V�Ƃ����`�œn���Ă͂ǂ�����";
		mes "��Ă������񂾂�B";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "����Ȃ牴��ɂƂ��Ă�";
		mes "�肪���点�邵���b������B";
		mes "�@";
		mes "�ǂ����B�Ȃ��Ȃ����Ă���H";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "�Ƃ������Ƃŕ�V��";
		mes "���؂��Ǝv���Ă���Ă������B";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "�����A���ׂ͍����b�����łȁB";
		mes "��V�ɂ��Ă͌v�Z�̓��ӂȒ��Ԃ�";
		mes "�����ŏ����Ă�����Ă���B";
		mes "�ڂ����͂�������Ă���B";
		next;
		mes "�]���Ȃ��͂��ꂢ�ɂ����܂ꂽ";
		mes "�@�莆���󂯎��A�ڂ�ʂ����]";
		next;
		mes "[�莆]";
		mes "�@���̂��莆��ǂ�ł��邠�Ȃ��ցB";
		mes "�@��X�̍̌@�̎�`�������Ă����";
		mes "�@���肪�Ƃ��ł��ɂ�B";
		mes "�@�������`���Ă��ꂽ�ۂ�";
		mes "�@��V�ɂ��Đ������܂��ɂ�B";
		next;
		mes "[�莆]";
		mes "�@���n�������V�͎��̒ʂ�ł��ɂ�B";
		mes "�@^ff0000�O���C���~�m�^�E���X^000000�A��";
		mes "�@100�̓|���c�c��������܂̒��g^ff00001^000000��";
		mes "�@200�̓|���c�c��������܂̒��g^ff00003^000000��";
		mes "�@300�̓|���c�c��������܂̒��g^ff00006^000000��";
		next;
		mes "[�莆]";
		mes "�@^ff0000�O���C���A�N���E�X^000000�A��";
		mes "�@20�̓|���c�c��������܂̒��g^ff00001^000000��";
		mes "�@40�̓|���c�c��������܂̒��g^ff00003^000000��";
		mes "�@60�̓|���c�c��������܂̒��g^ff00006^000000��";
		next;
		mes "[�莆]";
		mes "�@^ff0000���������^000000�Ƃ�";
		mes "�@��X���̌@���ďW�߂��M�d�ȕi�X��";
		mes "�@�ꎞ�I�ɕۊǂ��Ă���܂ł��ɂ�B";
		mes "�@�_�C�������h����󔠂܂�";
		mes "�@�F�X�Ȃ��̂������Ă��܂��ɂ�B";
		mes "�@���g�͑S�ĉ��l�̂�����̂ł��ɂ�I";
		next;
		mes "[�莆]";
		mes "�@���������B";
		mes "�@��V��^ff0000�������킹��^000000�n���܂��ɂ�B";
		mes "�@�Ⴆ��200�̓|���Ă����ꍇ��";
		mes "�@100�̓|���Ă������̕�V��";
		mes "�@200�̓|���Ă������̕�V��";
		mes "�@�����n���܂��ɂ�B";
		next;
		mes "[�莆]";
		mes "�@�󒍂�����A1���ԑ҂��Ă�����";
		mes "�@���x�ł�^ff0000�J��Ԃ��o���܂�^000000�ɂ�B";
		mes "�@�����ς���`���Ă��������ɂ�B";
		mes "�@�̌@���͂��ǂ�܂��ɂ�B";
		mes "�@�ɂ���͂��́B";
		mes "�@�ȏ�ł��ɂ�I";
		next;
		mes "�]�莆�͂����܂ł̂悤���]";
		next;
		mes "[�̌@�Ɍ������L]";
		mes "�ǂ�ł��ꂽ���H";
		mes "�Ƃ����킯�ł�낵�����ނ��B";
		mes "���҂��Ă��邼�B";
		close;
	case 4:
		mes "[�̌@�Ɍ������L]";
		mes "�Ȃ񂾁B";
		mes "����������̂͗p�����鎞�ɂ��Ă���B";
		close;
	}
OnInit:
	waitingroom "�����N�G�X�g", 0;
	end;
}

moc_prydn1.gat,97,96,3	duplicate(�̌@�Ɍ������L#prydn)	�̌@���̔L#prydn_f1	561
moc_prydn2.gat,97,59,3	duplicate(�̌@�Ɍ������L#prydn)	�̌@���̔L#prydn_f2	561

moc_prydn2.gat,198,11,0	warp	pd_nightmare_2to1	1,1,moc_prydn1.gat,213,10
moc_prydn1.gat,218,9,0	warp	pd_nightmare_1to2	1,1,moc_prydn2.gat,195,11

//============================================================
// �s���~�b�h�i�C�g���A1F �B�����[�v
//------------------------------------------------------------
moc_prydn1.gat,17,186,0	script	#prydn_Secret_1-1	139,0,10,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,24,171,0	script	#prydn_Secret_1-2	139,1,1,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",219,40;
	end;
}

moc_prydn1.gat,214,31,0	script	#prydn_Secret_2-1	139,10,0,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,219,44,0	script	#prydn_Secret_2-2	139,1,1,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",24,175;
	end;
}

moc_prydn1.gat,15,58,0	script	#prydn_Secret_3-1	139,10,0,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,9,72,0	script	#prydn_Secret_3-2	139,2,1,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",220,133;
	end;
}

moc_prydn1.gat,214,157,0	script	#prydn_Secret_4-1	139,10,0,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,220,129,0	script	#prydn_Secret_4-2	139,2,1,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",9,68;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn1.gat,58,57,0	script	#prydn_Secret_5-1	139,0,10,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,72,52,0	script	#prydn_Secret_5-2	139,1,2,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",35,220;
	end;
}

moc_prydn1.gat,59,214,0	script	#prydn_Secret_6-1	139,0,10,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,31,219,0	script	#prydn_Secret_6-2	139,1,2,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",68,52;
	end;
}

moc_prydn1.gat,101,169,0	script	#prydn_Secret_7-1	139,0,10,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,87,164,0	script	#prydn_Secret_7-1	139,1,2,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",194,66;
	end;
}

moc_prydn1.gat,183,72,0	script	#prydn_Secret_8-1	139,10,0,{
	emotion 1,"";
	end;
}

moc_prydn1.gat,198,66,0	script	#prydn_Secret_8-2	139,1,2,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn1.gat",91,164;
	end;
}

//============================================================
// �s���~�b�h�i�C�g���A2F �B�����[�v
//------------------------------------------------------------
moc_prydn2.gat,179,99,0	script	#prydn_Secret_A	139,1,1,{
	soundeffect "complete.wav", 0, 0;
	warp "moc_prydn2.gat",195,11;
	end;
}

moc_prydn2.gat,193,16,0	script	#prydn_Secret_B-1	139,1,1,{
	showmessage "!?","";
	soundeffect "se_door02.wav", 0, 0;
	hideonnpc "#prydn_Secret_B-1";
	hideoffnpc "#prydn_Secret_B-2";
	initnpctimer;
	end;
OnTimer8000:
	stopnpctimer;
	hideonnpc "#prydn_Secret_B-2";
	hideoffnpc "#prydn_Secret_B-1";
	end;
}

moc_prydn2.gat,193,5,0	script	#prydn_Secret_B-2	139,1,1,{
	soundeffect "complete.wav", 0, 0;
	warp "moc_prydn2.gat",101,187;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,127,47,0	script	#prydn_Secret_C-1	139,1,1,{
	showmessage "!?","";
	soundeffect "se_door02.wav", 0, 0;
	hideonnpc "#prydn_Secret_C-1";
	hideoffnpc "#prydn_Secret_C-2";
	initnpctimer;
	end;
OnTimer8000:
	stopnpctimer;
	hideonnpc "#prydn_Secret_C-2";
	hideoffnpc "#prydn_Secret_C-1";
	end;
}

moc_prydn2.gat,128,58,0	script	#prydn_Secret_C-2	139,1,1,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn2.gat",135,59;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,133,75,0	script	#prydn_Secret_C-3	139,1,1,{
	showmessage "!?","";
	soundeffect "se_door02.wav", 0, 0;
	hideonnpc "#prydn_Secret_C-3";
	hideoffnpc "#prydn_Secret_C-4";
	initnpctimer;
	end;
OnTimer8000:
	stopnpctimer;
	hideonnpc "#prydn_Secret_C-4";
	hideoffnpc "#prydn_Secret_C-3";
	end;
}

moc_prydn2.gat,133,49,0	script	#prydn_Secret_C-4	139,1,1,{
	soundeffect "se_door02.wav", 0, 0;
	warp "moc_prydn2.gat",126,51;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,29,88,0	script	#prydn_Secret_D-1	139,1,0,{
OnTouch:
	switch('flag) {
	case 0:
		showmessage "?","";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 1:
		showmessage "!?","";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0;
		hideonnpc "#prydn_Secret_D-1";
		hideoffnpc "#prydn_Secret_D-2";
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	stopnpctimer;
	hideonnpc "#prydn_Secret_D-2";
	hideoffnpc "#prydn_Secret_D-1";
	end;
}

moc_prydn2.gat,44,95,0	script	#prydn_Secret_D-2	139,1,1,{
	soundeffect "se_door01.wav", 0, 0;
	warp "moc_prydn2.gat",49,95;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,45,87,0	script	#prydn_Secret_D-3	139,1,0,{
OnTouch:
	switch('flag) {
	case 0:
		showmessage "?","";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 1:
		showmessage "!?","";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0;
		hideonnpc "#prydn_Secret_D-3";
		hideoffnpc "#prydn_Secret_D-4";
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	stopnpctimer;
	hideonnpc "#prydn_Secret_D-4";
	hideoffnpc "#prydn_Secret_D-3";
	end;
}

moc_prydn2.gat,45,95,0	script	#prydn_Secret_D-4	139,1,1,{
	soundeffect "se_door01.wav", 0, 0;
	warp "moc_prydn2.gat",40,95;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,29,172,0	script	#prydn_Secret_E-1	139,1,0,{
OnTouch:
	switch('flag) {
	case 0:
		showmessage "?","";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 1:
		showmessage "!?","";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0;
		hideonnpc "#prydn_Secret_E-1";
		hideoffnpc "#prydn_Secret_E-2";
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	stopnpctimer;
	hideonnpc "#prydn_Secret_E-2";
	hideoffnpc "#prydn_Secret_E-1";
	end;
}

moc_prydn2.gat,44,178,0	script	#prydn_Secret_E-2	139,1,1,{
	soundeffect "se_door01.wav", 0, 0;
	warp "moc_prydn2.gat",51,178;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,47,196,0	script	#prydn_Secret_E-3	139,1,0,{
OnTouch:
	switch('flag) {
	case 0:
		showmessage "?","";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 1:
		showmessage "!?","";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0;
		hideonnpc "#prydn_Secret_E-3";
		hideoffnpc "#prydn_Secret_E-4";
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	stopnpctimer;
	hideonnpc "#prydn_Secret_E-4";
	hideoffnpc "#prydn_Secret_E-3";
	end;
}

moc_prydn2.gat,47,187,0	script	#prydn_Secret_E-4	139,1,1,{
	soundeffect "se_door01.wav", 0, 0;
	warp "moc_prydn2.gat",40,187;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,156,196,0	script	#prydn_Secret_F-1	139,1,0,{
OnTouch:
	switch('flag) {
	case 0:
		showmessage "?","";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 1:
		showmessage "!?","";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0;
		hideonnpc "#prydn_Secret_F-1";
		hideoffnpc "#prydn_Secret_F-2";
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	stopnpctimer;
	hideonnpc "#prydn_Secret_F-2";
	hideoffnpc "#prydn_Secret_F-1";
	end;
}

moc_prydn2.gat,156,187,0	script	#prydn_Secret_F-2	139,1,1,{
	soundeffect "se_door01.wav", 0, 0;
	warp "moc_prydn2.gat",163,187;
	end;
OnInit:
	hideonnpc;
	end;
}

moc_prydn2.gat,174,172,0	script	#prydn_Secret_F-3	139,1,0,{
OnTouch:
	switch('flag) {
	case 0:
		showmessage "?","";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 1:
		showmessage "!?","";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0;
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0;
		hideonnpc "#prydn_Secret_F-3";
		hideoffnpc "#prydn_Secret_F-4";
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	stopnpctimer;
	hideonnpc "#prydn_Secret_F-4";
	hideoffnpc "#prydn_Secret_F-3";
	end;
}

moc_prydn2.gat,159,178,0	script	#prydn_Secret_F-4	139,1,1,{
	soundeffect "se_door01.wav", 0, 0;
	warp "moc_prydn2.gat",152,178;
	end;
OnInit:
	hideonnpc;
	end;
}

//============================================================
// �s���~�b�h�i�C�g���AMVP
//------------------------------------------------------------
moc_prydn2.gat,102,182,4	script	�A�����z�e�v�̊�#prydn	801,{}

moc_prydn2.gat,0,0,0	script	#moc_prydn2MVP	-1,{
	end;
OnInit:
	initnpctimer;
	end;
OnTimer18000000:
OnTimer19800000:
OnTimer21600000:
OnTimer23400000:
OnTimer25200000:
OnTimer27000000:
OnTimer28800000:
OnTimer30600000:
	if(rand(8))
		end;
OnTimer32400000:
	stopnpctimer;
	hideonnpc "�A�����z�e�v�̊�#prydn";
	areamonster "moc_prydn2.gat",0,0,0,0,"��n�̎���",1098,15,"#moc_prydn2MVP::OnKilled2";
	monster "moc_prydn2.gat",102,85,"�A�����z�e�v",2362,1,"#moc_prydn2MVP::OnKilled";
	end;
OnKilled:
	initnpctimer;
	hideoffnpc "�A�����z�e�v�̊�#prydn";
	end;
OnKilled2:
	end;
}
