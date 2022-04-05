//= Auriga Script ==============================================================
// Ragnarok Online Malangdo Town Script	by Pneuma
//==============================================================================

//============================================================
// Shop
//============================================================
-	shop	mal_callshop	-1,579
malangdo.gat,156,140,5	script	���l	495,{
	callshop "mal_callshop";
	end;
OnInit:
	waitingroom "����������",0;
	end;
}

//============================================================
// �}������ �]��NPC
//------------------------------------------------------------
-	script	�I�O�m����#mal	-1,{
	mes "�]�C�Y���[�h�̒g�������������󂯂�";
	mes "�@�C�����悳�����ɐQ�Ă���L������]";
	next;
	if(select("�ʂ�߂���","�b��������") == 1) {
		mes "�]���Ȃ��́A";
		mes "�@�L�̂��΂�ʂ�߂����]";
		close;
	}
	mes "[�I�O�m����]";
	mes "�ɂ�[�c�c";
	mes "�j�����H�@��H";
	mes "�L�̎�T�[�r�X�ɂ�B";
	mes "�L�̊y���A�}�������֍s���ɂ�H";
	next;
	if(CATHAND_POINT == 0) {
		mes "[�I�O�m����]";
		mes "�����́c�c";
		mes "^FF00001000Zeny^000000������ɂ�B";
		set '@price,1000;
	} else if(CATHAND_POINT < 60) {
		mes "[�I�O�m����]";
		mes "�L�̎�Ɖ�����l�Ԃɂ�ˁB";
		mes "������^FF0000999zeny^000000�ł����ɂ�B";
		set '@price,999;
	} else if(CATHAND_POINT < 80) {
		mes "[�I�O�m����]";
		mes "���������b�ɂȂ��Ă�ɂ�B";
		mes "������^FF0000500zeny^000000�B";
		mes "���z�ɂ�B";
		set '@price,500;
	} else {
		mes "[�I�O�m����]";
		mes "�L�̎�̉p�Y��";
		mes "�����ł����ɂ�B";
		mes "�L�̊y���ֈē�����ɂ�B";
		set '@price,0;
	}
	next;
	if(select("�}�������֍s��","��߂�") == 2) {
		mes "[�I�O�m����]";
		mes "�c�O���ɂ�B";
		mes "�c�c�ł́A�Q��ɂ�B";
		close;
	}
	if(Zeny < '@price) {
		mes "[�I�O�m����]";
		mes "�����A����ĂȂ��ɂ�B";
		mes "�c�c�ł́A�Q��ɂ�B";
		close;
	}
	mes "[�I�O�m����]";
	mes "���ꂶ�Ⴀ�A�}�������֏o���ɂ�`";
	mes "�y����ł���ɂ�B";
	close2;
	set Zeny,Zeny -'@price;
	warp "malangdo.gat",217,85;
	end;
}

izlude.gat,182,192,4	duplicate(�I�O�m����#mal)	�I�O�m����#�C�Y		554
alberta.gat,200,151,4	duplicate(�I�O�m����#mal)	�I�O�m����#�A���x	554

//============================================================
// �}������ => �C�Y���[�h�E�A���x���^ �]��NPC
//------------------------------------------------------------
malangdo.gat,219,86,4	script	�R��	545,{
	mes "[�R��]";
	mes "�}�������͊y���������ł����H";
	mes "�L�̎�T�[�r�X�ł�";
	mes "�C�Y���[�h�A�A���x���^�s���̑D�ւ�";
	mes "�^�q���Ă��܂��B";
	next;
	mes "[�R��]";
	mes "���旿���͖����ł��B";
	mes "�ǂ���̕ւɂȂ����܂����H";
	next;
	switch(select("�C�Y���[�h�s��","�A���x���^�s��","�D�ɏ��܂���")) {
	case 1:
		mes "[�R��]";
		mes "�ǂ��D�����I";
		close2;
		warp "izlude.gat",194,180;
		end;
	case 2:
		mes "[�R��]";
		mes "�ǂ��D�����I";
		close2;
		warp "alberta.gat",192,150;
		end;
	default:
		mes "[�R��]";
		mes "�����ƃ}���������y����ł��������ˁB";
		close;
	}
}

//============================================================
// ������ē�NPC
//------------------------------------------------------------
malangdo.gat,213,100,5	script	�A���j��#�}�����������	545,5,5,{
	mes "[�A���j��]";
	mes "�悤�����}�������ցI";
	mes "���̔L�B�ɂ͂�����������j���H";
	close;
OnTouch:
	if(MAL_1QUE > 1) end;
	mes "[�A���j��]";
	mes "�悤�����}�������ցI";
	mes "���͏��߂ē���K������";
	mes "���̓��̎������`������L";
	mes "�A���j���ł��I";
	next;
	mes "[�A���j��]";
	mes "���ł͂�������̔L������";
	mes "�������Ă��܂��j���B";
	mes "���X�݂͂�ȑD����";
	mes "�D�ł��������q�C���Ă����̂�����";
	mes "�F�X�����Ă����ɒH�蒅�����j���B";
	next;
	mes "[�A���j��]";
	mes "���̒��S�ɂ͍q�C���Ă�������";
	mes "�D�����̂܂܎c���Ă���";
	mes "��݂̂�Ȃ����ɏZ��ł�j���B";
	next;
	mes "[�A���j��]";
	mes "�g�[�}�X��Ƃ���";
	mes "���݁A���̓��̑��������Ă���";
	mes "��X�̃{�X�������ɂ���j���I";
	mes "�܂��͈��A�ɍs���Ƃ����j���B";
	next;
	menu "�킩��܂����A���肪�Ƃ�",-;
	mes "[�A���j��]";
	mes "���������j���`�I";
	mes "�������ō����Ă���L��������";
	mes "�����Ă����ė~�����j���B";
	mes "��낵�����肢�j��!!";
	setquest 71800;
	setquest 71820;
	set MAL_1QUE,2;
	close;
}

//============================================================
// �L�̎�T�[�r�X(����)NPC
//------------------------------------------------------------
mal_in02.gat,134,31,5	script	�������k�j�����R	505,{
	if(CATHAND_POINT == 0) {
		mes "[�������k�j�����R]";
		mes "�L�̎�T�[�r�X��";
		mes "�悤�����ł��ɂ�`";
		next;
		mes "[�������k�j�����R]";
		mes "�����ł͂��q�l�ɂ���������������";
		mes "^FF0000�}���������Y�ʋl^000000�ɉ�����";
		mes "�L�̎�M�p�|�C���g��";
		mes "�����グ�Ă���܂��ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "���񂭂�c�c";
		mes "�@";
		mes "�ɂႠ�B";
		mes "���Ȃ��͔L�̎�T�[�r�X�̂��Ƃ�";
		mes "���܂肵��ɂႢ�ł��ˁH";
		mes "�L�̂ɂ������قƂ�ǂ��܂���B";
		next;
		mes "[�������k�j�����R]";
		mes "�ɂ�̂ŁA�܂���";
		mes "�L�̎�T�[�r�X�̐�������";
		mes "�n�߂܂���`";
		next;
		menu "���肢���܂�",-;
		mes "[�������k�j�����R]";
		mes "�͂��ɂ�B";
		mes "�L�̎�T�[�r�X�ł�";
		mes "�ِ��E�ł̓]���T�[�r�X�A";
		mes "�ʒu�Z�[�u�T�[�r�X�A";
		mes "�q�ɃT�[�r�X��񋟂��Ă���ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "�c�c�ɂ��H";
		mes "���Ȃ��̌����������Ƃ�";
		mes "�킩��ɂ�B";
		mes "����ɂ�T�[�r�X��";
		mes "���łɂ�����āc�c�B";
		next;
		mes "[�������k�j�����R]";
		mes "���́A�L�̎�T�[�r�X��";
		mes "���ꂩ�甭�W���Ă���";
		mes "�T�[�r�X�Ȃ̂ɂ�I";
		next;
		mes "[�������k�j�����R]";
		mes "�L�̎�T�[�r�X�ł́A";
		mes "���q�l�̌l�M�p�x�ɂ����";
		mes "�T�[�r�X���e��";
		mes "�ω�����ł��ɂ�B";
		next;
		menu "�l�M�p�x�H",-;
		mes "[�������k�j�����R]";
		mes "��X�͂��̌l�M�p�x�̂��Ƃ�";
		mes "^FF0000�L�̎�M�p�|�C���g^000000��";
		mes "�Ă�ł��܂��ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "�����ł͂��q�l��";
		mes "^FF0000�}���������Y�ʋl^000000��";
		mes "10�������ɂȂ邲�ƂɁA";
		mes "�L�̎�M�p�|�C���g��";
		mes "1�|�C���g���܂�ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "�L�̎�M�p�|�C���g�����܂�قǁA";
		mes "���p�ł���T�[�r�X��������";
		mes "����ɓ��T���󂯂邱�Ƃ��ł���ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "�܂�A���q�l����������";
		mes "�}���������Y�ʋl�������ė����";
		mes "�󂯂�����T��";
		mes "�o���o�������Ă����̂ł��ɂ�`�I";
		next;
		mes "[�������k�j�����R]";
		mes "�}�������ȊO�ɂ�";
		mes "�L�̎�T�[�r�X�͑��݂��Ă���ɂ�B";
		mes "�L�̎�M�p�|�C���g��";
		mes "�ǂ��̔L�̎�T�[�r�X�ł�";
		mes "���ʂ̃|�C���g�ɂȂ��Ă���ɂ�I";
		next;
		mes "[�������k�j�����R]";
		mes "�����A�L�̎�M�p�|�C���g��";
		mes "���߂���@�́A�ꏊ�ɂ����";
		mes "�قȂ�ꍇ������ɂ�B";
		mes "�Ⴆ�΃~�b�h�K���h�A���R���Ԓn�ł́A";
		mes "����z�΂Œ��߂邱�Ƃ��ł���ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "�ǂ��ł����ɂ�H";
		mes "���̏��ނɖ��O�������āA";
		mes "���֗̕��ȔL�̎�T�[�r�X�̉����";
		mes "�Ȃ�Ȃ��ł����ɂ�H";
		next;
		if(select("�_�񂵂܂�","�܂����x�ɂ��܂�") == 2) {
			mes "[�������k�j�����R]";
			mes "�_�񂵂Ȃ��ɂ�H";
			mes "����ȁ`�ɂ��Ł`�H";
			mes "�߂����ɂႠ�`";
			close;
		}
		mes "�]���Ȃ��́A���ނ�";
		mes "�@���O���������]";
		next;
		mes "[�������k�j�����R]";
		mes "�ӂނӂށA";
		mes strcharinfo(0)+ "����";
		mes "�Ƃ����܂��ɂႠ�B";
		next;
		mes "[�������k�j�����R]";
		mes "���肪�Ƃ��������܂��ɂ�I";
		mes "���Ȃ��𐳎��ȉ���Ƃ���";
		mes "�o�^���܂����ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "���_�񂢂�����������ɁA";
		mes "�L�̎�M�p�|�C���g��";
		mes "5�|�C���g�����グ�܂��ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "^FF0000�}���������Y�ʋl^000000��";
		mes "10�������ɂȂ邲�ƂɁA";
		mes "�L�̎�M�p�|�C���g��";
		mes "1�|�C���g���܂�ɂ�B";
		next;
		mes "[�������k�j�����R]";
		mes "��������|�C���g���W�߂āA";
		mes "���T�o���o���ɂႠ�I";
		mes "�ɂႠ�`";
		set CATHAND_POINT,5;
		close;
	}
	mes "[�������k�j�����R]";
	mes "�L�̎�T�[�r�X��";
	mes "�悤�����ł��ɂ�`";
	next;
	mes "[�������k�j�����R]";
	mes "�����ł͂��q�l�ɂ���������������";
	mes "^FF0000�}���������Y�ʋl^000000�ɉ�����";
	mes "�L�̎�M�p�|�C���g��";
	mes "�����グ�Ă���܂��ɂ�B";
	next;
	mes "[�������k�j�����R]";
	mes "���Ȃ��̔L�̎�M�p�|�C���g�́A";
	mes "^0000FF" +CATHAND_POINT+ "^000000�|�C���g�ł��ɂ�B";
	mes "^FF0000�}���������Y�ʋl^00000010�ɂ�";
	mes "�L�̎�M�p�|�C���g��1�|�C���g";
	mes "�����グ�Ă��܂��ɂ�";
	next;
	if(select("�}���������Y�ʋl��n��","�������Ȃ�") == 2) {
		mes "[�������k�j�����R]";
		mes "�ɂ�ɂ�`";
		mes "�܂��̂����������҂����Ă܂��`";
		close;
	}
	mes "[�������k�j�����R]";
	mes "���肪�Ƃ��������܂��ɂ�B";
	mes "��x�ɂ��炤���Ƃ��ł���|�C���g��";
	mes "^FF0000�ő�10�|�C���g^000000�܂łł��ɂ�B";
	mes "���|�C���g�ق����ł����ɂႠ�H";
	mes "�������́u0�v�Ɠ��͂��Ăɂ�B";
	next;
	input '@val;
	if('@val < 1) {
		mes "[�������k�j�����R]";
		mes "�������܂����ɂ�B";
		mes "�܂��̂��z�������҂����Ă܂��`";
		close;
	}
	if('@val > 10) {
		mes "[�������k�j�����R]";
		mes "��x�ɂ��炤���Ƃ��ł���|�C���g��";
		mes "^FF0000�ő�10�|�C���g^000000�܂łł��ɂ�B";
		close;
	}
	mes "[�������k�j�����R]";
	mes '@val + "�|�C���g�ɂ�H";
	mes "�K�v�ȃ}���������Y�ʋl��";
	mes ('@val * 10) + "�ɂȂ邯��";
	mes "�������ɂ�`�H";
	next;
	if(select("�͂�","��߂�") == 2) {
		mes "[�������k�j�����R]";
		mes "�������܂����ɂ�B";
		mes "�܂��̂��z�������҂����Ă܂��`";
		close;
	}
	if(countitem(12636) < '@val * 10) {
		mes "[�������k�j�����R]";
		mes "�ɂ�ɂ�H";
		mes "�ǂ����ʋl�̐���";
		mes "����Ȃ��悤�ł��ɂႠ�`";
		mes "�����m�F���Ă��������ɂႠ�`";
		close;
	}
	delitem 12636,10 * '@val;
	set CATHAND_POINT,CATHAND_POINT+'@val;
	mes "[�������k�j�����R]";
	mes strcharinfo(0)+ "�l��";
	mes "�L�̎�M�p�|�C���g��";
	mes '@val + "�|�C���g�����āA";
	mes "^FF0000" +CATHAND_POINT+ "^000000�ɂȂ�܂����ɂ�B";
	mes "���肪�Ƃ��������܂��ɂႠ�B";
	next;
	mes "[�������k�j�����R]";
	mes "���ꂩ�����������|�C���g���W�߂āA";
	mes "���T�o���o���ɂႠ�I";
	mes "�ɂႠ�`";
	close;
OnInit:
	waitingroom "�L�̎�T�[�r�X",0;
	end;
}

//============================================================
// �q��NPC
//------------------------------------------------------------
malangdo.gat,184,139,4	script	�q�ɔԂ˂�	560,{
	mes "[�q�ɔԂ˂�]";
	mes "��ו��ɂ�H";
	mes "�q�ɊJ���ɂႠ�B";
	next;
	mes "[�q�ɔԂ˂�]";
	mes "^0000FF�}���������Y�ʋl^000000��Zeny";
	mes "��̌��ϕ��@������ɂႠ�I";
	mes "�L�̎�M�p�|�C���g��";
	mes "1000�|�C���g�ȏ�̏ꍇ��";
	mes "����̓T�[�r�X����ɂႠ�I";
	next;
	switch(select("�ʋl����----- 1��","Zeny����------- 100z","�q�ɂ��J���Ȃ�")) {
	case 1:
		if(!countitem(12636)) {
			mes "[�q�ɔԂ˂�]";
			mes "�ɂ�ɂ�ɂ�H";
			mes "�}���������Y�ʋl�A����Ȃ��ɂ�B";
			mes "�A�^�V�̂߂��ɂȂ�ɂႠ�B";
			mes "�x�����Ă���Ȃ��።��ɂ�B";
			close;
		}
		delitem 12636,1;
		openstorage;
		close;
	case 2:
		if(Zeny < 100) {
			mes "[�q�ɔԂ˂�]";
			mes "�ɂ�ɂ�ɂ�H";
			mes "��������Ȃ��ɂ�B";
			mes "�x�����Ă���Ȃ��።��ɂ�B";
			close;
		}
		set Zeny,Zeny -100;
		openstorage;
		close;
	}
	mes "[�q�ɔԂ˂�]";
	mes "���ꂶ�Ⴀ�A�q�ɂ��g�������Ȃ�����";
	mes "�܂�����Ƃ����ɂႠ�B";
	close;
OnInit:
	waitingroom "�q�ɃT�[�r�X",0;
	end;
}

//============================================================
// �]���T�[�r�XNPC
//------------------------------------------------------------
malangdo.gat,190,167,7	script	�|�^��	546,{
	if(MAL_1QUE < 36) {
		mes "[�|�^��]";
		mes "�ڂ��A�|�^���`�B";
		mes "���Ԃ�]�����Ă������`�B";
		mes "�N�͂܂��A�����߂��`�B";
		close;
	}
	mes "[�|�^��]";
	mes "���񂭂�c�c�B";
	mes "�N���璇�Ԃ̂ɂ����������I";
	next;
	mes "[�|�^��]";
	mes "�ڂ��A�|�^���B";
	mes "�ڂ����J�������\�͂ŁA";
	mes "�N�̌̋��~�b�h�K���h�嗤��";
	mes "�����Ă������`�B";
	mes "�����^FF0000�}���������Y�ʋl^000000�ł�����`�B";
	next;
	switch(select("�]�����Ă��炤","�K�v�Ȃ�","�K�v�ʋl�����m�F����")) {
	case 1:
		if(countitem(12636) < 4) {
			mes "[�|�^��]";
			mes "�}���������Y�ʋl���Ȃ���A";
			mes "����Ȃ���`�B";
			close;
		}
		switch(select("���[���~�b�h�K�b�c","�V���o���c�o���h","�A���i�x���c")) {
		case 1:
			switch(select("�v�����e��","�����N","�A���x���^","�A���f�o����","�t�F�C����","�Q�t�F��")) {
			case 1:
				mes "[�|�^��]";
				mes "�ł̓v�����e���Ɂ`�B";
				delitem 12636,4;
				close2;
				warp "prontera.gat",155,111;
				end;
			case 2:
				mes "[�|�^��]";
				mes "�ł̓����N�Ɂ`�B";
				delitem 12636,4;
				close2;
				warp "morocc.gat",159,255;
				end;
			case 3:
				mes "[�|�^��]";
				mes "�A���x���^�H";
				mes "����Ȃ�A���ɂ���D��";
				mes "�s���邶��Ȃ��`�B";
				mes "����ł������̂��ɂ�H";
				next;
				if(select("�͂�","�D�𗘗p����") == 2) {
					mes "[�|�^��]";
					mes "�D�͂��������ɂ����`�B";
					close;
				}
				mes "[�|�^��]";
				mes "�ł̓A���x���^�Ɂ`�B";
				delitem 12636,4;
				close2;
				warp "alberta.gat",95,66;
				end;
			case 4:
				mes "[�|�^��]";
				mes "�ł̓A���f�o�����Ɂ`�B";
				delitem 12636,4;
				close2;
				warp "aldebaran.gat",126,120;
				end;
			case 5:
				mes "[�|�^��]";
				mes "�ł̓t�F�C�����Ɂ`�B";
				delitem 12636,4;
				close2;
				warp "payon.gat",161,58;
				end;
			case 6:
				mes "[�|�^��]";
				mes "�ł̓Q�t�F���Ɂ`�B";
				delitem 12636,4;
				close2;
				warp "geffen.gat",120,100;
				end;
			}
			end;
		case 2:
			set '@sel,select("�A�C���u���b�N","���q�^���[��","�W���m�[","�t�B�Q��");
			if(countitem(12636) < 6) {
				mes "[�|�^��]";
				mes "�}���������Y�ʋl���Ȃ���A";
				mes "����Ȃ���`�B";
				close;
			}
			switch('@sel) {
			case 1:
				mes "[�|�^��]";
				mes "�ł̓A�C���u���b�N�Ɂ`�B";
				delitem 12636,6;
				close2;
				warp "einbroch.gat",229,196;
				end;
			case 2:
				mes "[�|�^��]";
				mes "�ł̓��q�^���[���Ɂ`�B";
				delitem 12636,6;
				close2;
				warp "lighthalzen.gat",214,150;
				end;
			case 3:
				mes "[�|�^��]";
				mes "�ł̓W���m�[�Ɂ`�B";
				delitem 12636,6;
				close2;
				warp "yuno.gat",157,220;
				end;
			case 4:
				mes "[�|�^��]";
				mes "�ł̓t�B�Q���Ɂ`�B";
				delitem 12636,6;
				close2;
				warp "hugel.gat",84,125;
				end;
			}
			end;
		case 3:
			set '@sel,select("���w��","�x�C���X");
			if(countitem(12636) < 5) {
				mes "[�|�^��]";
				mes "�}���������Y�ʋl���Ȃ���A";
				mes "����Ȃ���`�B";
				close;
			}
			switch('@sel) {
			case 1:
				mes "[�|�^��]";
				mes "�ł̓��w���Ɂ`�B";
				delitem 12636,5;
				close2;
				warp "rachel.gat",138,113;
				end;
			case 2:
				mes "[�|�^��]";
				mes "�ł̓x�C���X�Ɂ`�B";
				delitem 12636,5;
				close2;
				warp "veins.gat",212,144;
				end;
			}
			end;
		}
		end;
	case 3:
		mes "[�|�^��]";
		mes "�͂��A�ʋl�\�`�B";
		next;
		mes "[�}���������Y�ʋl�K�v���ꗗ]";
		mes "���[���~�b�h�K�b�c�����F4��";
		mes "�A���i�x���c�����F5��";
		mes "�V���o���c�o���h���a���F6��";
		next;
		mes "[�|�^��]";
		mes "�V���o���c�o���h���a����";
		mes "���@�֎~���ƂŁ`�A";
		mes "�A���i�x���c������";
		mes "�ςȎ�p�����邩��";
		mes "�ނ��������񂾂�˂��`�B";
		close;
	default:
		mes "[�|�^��]";
		mes "�������`�B";
		mes "�̋��ɋA�肽���Ȃ�����";
		mes "�ڂ��������Ă�������Ă���";
		mes "�Y��Ȃ��łˁ`�B";
		close;
	}
OnInit:
	waitingroom "�]���T�[�r�X",0;
	end;
}

//============================================================
// �p�Y�̍��Փ]���T�[�r�XNPC
//------------------------------------------------------------
malangdo.gat,135,140,5	script	�p�Y�̍��Ոē���#�}����	545,{
	if(Baselevel < 70){
		mes "[�p�Y�̍��Ոē���]";
		mes "�ɂႠ�H";
		mes "�N�͂܂��܂��セ�����ɂ�B";
		mes "���͂����Ŏ��̒ʘH�֌�����";
		mes "����`�������Ă�ɂ�B";
		mes "�������������Ȃ�����";
		mes "�܂�����Ƃ����ɂ�B";
		next;
		mes "�]^ff0000BaseLv70^000000�ȏ�̃L�����N�^�[�̂�";
		mes "�@���̒ʘH�ւ̔���";
		mes "�@�J�������o���܂��]";
		close;
	}
	if(getnpctimer(1,"���̒ʘH���[�v#malan")) {
		//������
		mes "[�p�Y�̍��Ոē���]";
		mes "���̒ʘH�ւ̔���";
		mes "�����J���Ă��܂��ɂ�B";
		close;
	}
	mes "[�p�Y�̍��Ոē���]";
	mes "�ɂႠ�I";
	mes "���͂����Ŏ��̒ʘH�֌�����";
	mes "����`�������Ă܂��ɂ�B";
	mes "�����p�ł����ɂ�H";
	next;
	switch(select("���̒ʘH�֍s������","�b�𕷂�","��b����߂�")){
	case 1:
		break;
	case 2:
		mes "[�p�Y�̍��Ոē���]";
		mes "^ff0000���̒ʘH^000000���Ēm���Ă܂��ɂ�H";
		mes "�ߋ��̉p�Y�����̘b�A";
		mes "^0000ff�p�Y�̍���^000000��̌��o����";
		mes "�s�v�c�ȏꏊ�ł��ɂ�B";
		next;
		mes "[�p�Y�̍��Ոē���]";
		mes "�������ł��ɂ�B";
		mes "�����⒲��������ɍs���Ă���";
		mes "�̌��ł���p�Y�̍��Ղ�";
		mes "�ǂ�ǂ񑝂��Ă���̂ł��ɂ�B";
		next;
		mes "[�p�Y�̍��Ոē���]";
		mes "���̒ʘH�͖`���҂�";
		mes "��������W�܂�̂ł��ɂ�B";
		mes "���Ԃ̔L������";
		mes "�����ɂ�������ł���ł��ɂ�B";
		next;
		mes "[�p�Y�̍��Ոē���]";
		mes "�����玄�͂�����";
		mes "���̒ʘH�ֈړ��ł������";
		mes "�p�ӂ��Ă���̂ł��ɂ�B";
		next;
		mes "[�p�Y�̍��Ոē���]";
		mes "���������̒ʘH�֍s�������̂Ȃ�";
		mes "^ff0000�}���������Y�ʋl5��^000000���ꂽ��";
		mes "�����J���܂��ɂ�B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]^ff0000��p���x���������J����";
		mes "�@^0000ff45�b�ԁA^ff0000�������p�\�ɂȂ�܂��B";
		mes "�@�����J���Ă���ԁA";
		mes "�@�V���ɔ����J���邱�Ƃ͏o���܂���B";
		mes "�@�J��������^0000ffBaseLv70�ȏ�^ff0000�ł����";
		mes "�@�J�����l�ȊO�ł����p�\�ł�^000000�]";
		next;
		break;
	case 3:
		mes "[�p�Y�̍��Ոē���]";
		mes "��₩���͂�߂�ɂ�I";
		mes "�H�׏I������ʋl�����邼�ɂ�I";
		close;
	}
	mes "[�p�Y�̍��Ոē���]";
	mes "^ff0000�}���������Y�ʋl5��^000000��";
	mes "���̒ʘH�ւ̔����J���܂����ɂ�H";
	next;
	if(select("�͂�","������")==2){
		mes "[�p�Y�̍��Ոē���]";
		mes "�����ł����[�B";
		mes "�s���������͐��������Ăɂ�B";
		close;
	}
	if(countitem(12636)<5){
		mes "[�p�Y�̍��Ոē���]";
		mes "�ɂ�ɂ�!?";
		mes "�}���������Y�ʋl��";
		mes "����Ȃ��ł��ɂ�B";
		mes "^ff00005��^000000�K�v�ł��ɂ�B";
		close;
	}
	mes "[�p�Y�̍��Ոē���]";
	mes "����ł͊J���܂��ɂ�B";
	mes "���[��I";
	delitem 12636,5;
	donpcevent "���̒ʘH���[�v#malan::OnStart";
	mes "����ł悵�ł��ɂ�B";
	mes "^ff0000���Ԃ��o�Ə������Ⴄ^000000�̂�";
	mes "�C��t���Ăɂ�`�B";
	mes "�����Ă�����Ⴂ�`�B";
	close;
OnInit:
	waitingroom "�p�Y�̍��Ոē�",0;
	end;
}

malangdo.gat,140,139,0	script	���̒ʘH���[�v#malan	45,2,2,{
OnTouch:
	warp "dali.gat",109,86;
	end;
OnInit:
	hideonnpc;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	announce "���̒ʘH�ւ̔����J�����I",0x9,0x9cff00,0x190,12,0,0;
OnTimer10000:
OnTimer20000:
OnTimer30000:
OnTimer40000:
	misceffect 247;
	end;
OnTimer45000:
	hideonnpc;
	announce "���̒ʘH�ւ̔����܂�܂�",0x9,0x9cff00,0x190,12,0,0;
	stopnpctimer;
	end;
}

//============================================================
// ���Y�i�̔�NPC
//------------------------------------------------------------
malangdo.gat,173,145,4	script	���l#glove	496,{
	mes "[���l]";
	mes "�ɂႠ�A��������Ⴂ�I";
	mes "���̓��ł̂ݔ̔����Ă�A�C�e����";
	mes "�~�����Ȃ��ł������q���܁I";
	next;
	if(select("�͂�","������") == 2) {
		mes "[���l]";
		mes "���肪�Ƃ��������܂����ɂ�B";
		mes "�܂��̂��������`�I";
		close;
	}
	mes "[���l]";
	mes "�����ł��傤�����ł��傤�I";
	mes "�������Ă��������ɂ�I";
	next;
	mes "[���l]";
	mes "���i�̍w����";
	mes "�}���������Y�ʋl200�ł́A";
	mes "�x���ɂȂ�܂��ɂႠ�B";
	while(1) {
		next;
		switch(select("[�L�̎�O���[�u]","[�����N���u]","�w������߂�")) {
		case 1:
			mes "[���l]";
			mes "^0000FF[�L�̎�O���[�u]^000000�ɂ�H";
			mes "�������邾���ŁA�K���ɂȂ��ɂႠ�B";
			next;
			mes "[���l]";
			mes "������̏��i�́A^dc143c�A�N�Z�T���[^000000�ł��ā`";
			mes "�h��͂�5�B";
			mes "Vit+1�AAgi+1�ADex+1�ALuk+1��";
			mes "�X�e�[�^�X�␳�����܂��ɂ�B";
			mes "����ɏڍׂ͂������ǂ�ŁI";
			next;
			mes "[�L�̎�O���[�u�ڍ�]";
			mes "�X���b�g�F1";
			mes "���B�F�s��";
			mes "�j���F���Ȃ�";
			next;
			mes "[���l]";
			mes "^0000FF[�L�̎�O���[�u]^000000��";
			mes "�}���������Y�ʋl��200�̎x������";
			mes "�Ȃ�܂��ɂႠ�I";
			set '@itemid,2873;
			break;
		case 2:
			mes "[���l]";
			mes "^0000FF[�����N���u]^000000�ɂ�H";
			mes "�݂����ɔ����āA";
			mes "�ڂ��o�߂�ɂ��ɂ�I";
			next;
			mes "[���l]";
			mes "������̏��i�́A^dc143c�݊�^000000�ł��ā`";
			mes "�����n�����X�^�[�ւ̃_���[�W+15%�B";
			mes "����ɏڍׂ͂������ǂ�ŁI";
			next;
			mes "[�����N���u�ڍ�]";
			mes "�U���́F88";
			mes "�͈́F1";
			mes "�X���b�g�F3";
			mes "���B�F�\";
			mes "�j���F���Ȃ�";
			next;
			mes "[���l]";
			mes "^0000FF[�����N���u]^000000��";
			mes "�}���������Y�ʋl��200�̎x������";
			mes "�Ȃ�܂��ɂႠ�I";
			set '@itemid,16015;
			break;
		default:
			mes "[���l]";
			mes "���肪�Ƃ��������܂����ɂ�B";
			mes "�܂��̂��������`�I";
			close;
		}
		next;
		switch(select("�}���������Y�ʋl�ōw������","�w������߂�","�ق��̏��i������")) {
		case 1:
			if(countitem(12636) < 200) {
				mes "[���l]";
				mes "�}���������Y�ʋl������Ȃ��̂�";
				mes "����Ȃ��ɂ�B";
				mes "�܂����������������ɂႠ�B";
				close;
			}
			if(!checkitemblank()) {
				mes "[���l]";
				mes "�����ƁB";
				mes "���Ȃ��̃J�o���A";
				mes "����ȏ�V������ނ̃A�C�e����";
				mes "����X�y�[�X���Ȃ������ɂ�B";
				mes "�������Ă���Ƃ����ɂႠ�B";
				close;
			}
			if(!checkweight('@itemid,1)) {
				mes "[���l]";
				mes "�����ƁB";
				mes "���Ȃ��̃J�o���A";
				mes "���������d�����ɂ�B";
				mes "����ꂿ�Ⴄ�ɂႠ�`";
				mes "�������Ă���Ƃ����ɂ�B";
				close;
			}
			mes "[���l]";
			mes "�܂��ǂ���ɂ�I";
			delitem 12636,200;
			getitem '@itemid,1;
			close;
		case 2:
			mes "[���l]";
			mes "���肪�Ƃ��������܂����ɂ�B";
			mes "�܂��̂��������`�I";
			close;
		default:
			mes "[���l]";
			mes "�ʂ̏��i���C�ɂȂ�ɂ�H";
			mes "�������Ă��������ɂ�I";
			continue;
		}
	}
	end;
OnInit:
	waitingroom "�}���������葕���̔�",0;
	end;
}

malangdo.gat,150,135,5	script	���l#bullet	495,{
	mes "[���l]";
	mes "�ɂႠ�A��������Ⴂ�I";
	mes "���̓��ł̂ݔ̔����Ă�A�C�e����";
	mes "�~�����Ȃ��ł������q���܁I";
	next;
	if(select("�͂�","������") == 2) {
		mes "[���l]";
		mes "���肪�Ƃ��������܂����ɂ�B";
		mes "�܂��̂��������`�I";
		close;
	}
	mes "[���l]";
	mes "�����ł��傤�����ł��傤�I";
	mes "�������Ă��������ɂ�I";
	mes "�����ɂ���̂́A�ǂ����̂��̂ƈႢ";
	mes "�g�p�����Ȃǂ���܂��񂩂�";
	mes "������Ƃ������������`";
	next;
	mes "[���l]";
	mes "���������A�S�Ă̏��i��";
	mes "�}���������Y�ʋl200��";
	mes "�����ł��܂��ɂ�B";
	mes "�@";
	mes "Zeny�͈����ĂȂ����璍�ӂɂ�B";
	while(1) {
		next;
		switch(select("[�g�r�E�I]","[�_���S���V]","[�X�����C�J]","[���q�g�f]","�w������߂�")) {
		case 1:
			mes "[���l]";
			mes "[�g�r�E�I]�ɂ�H";
			mes "������̏��i�́A^dc143c��������^000000�ł��ā`";
			mes "�������ŁA�U���͂�50�ɂႠ�B";
			next;
			mes "[���l]";
			mes "�ЂƔ���200�C�����Ă܂��ɂ�B";
			next;
			mes "[���l]";
			mes "^0000FF[�g�r�E�I]^000000�� ";
			mes "�}���������Y�ʋl�F200��";
			mes "�ł̎x�����ɂȂ�܂��ɂ�H";
			mes "�w������ɂ�H";
			set '@itemid,12639;
			break;
		case 2:
			mes "[���l]";
			mes "[�_���S���V]�ɂ�H";
			mes "������̏��i�́A^dc143c�e��^000000�ł��ā`";
			mes "�U�����Ɉ��m����";
			mes "�G���X�^�����܂��ɂ�B";
			mes "�������ŁA�U���͂�50�ɂႠ�B";
			next;
			mes "[���l]";
			mes "�ЂƔ���200�C�����Ă܂��ɂ�B";
			next;
			mes "[���l]";
			mes "^0000FF[�_���S���V]^000000�� ";
			mes "�}���������Y�ʋl�F200��";
			mes "�ł̎x�����ɂȂ�܂��ɂ�H";
			mes "�w������ɂ�H";
			set '@itemid,12637;
			break;
		case 3:
			mes "[���l]";
			mes "[�X�����C�J]�ɂ�H";
			mes "������̏��i�́A^dc143c��������^000000�ł��ā`";
			mes "�������ŁA�U���͂�50�ɂႠ�B";
			next;
			mes "[���l]";
			mes "�ЂƔ���200�C�����Ă܂��ɂ�B";
			mes "�����k���Ċi�[���Ă܂��ɂႠ�B";
			next;
			mes "[���l]";
			mes "^0000FF[�X�����C�J]^000000�� ";
			mes "�}���������Y�ʋl�F200��";
			mes "�ł̎x�����ɂȂ�܂��ɂ�H";
			mes "�w������ɂ�H";
			set '@itemid,12638;
			break;
		case 4:
			mes "[���l]";
			mes "[���q�g�f]�ɂ�H";
			mes "������̏��i�́A^dc143c��������^000000�ł��ā`";
			mes "�������ŁA�U���͂�110�ɂႠ�B";
			next;
			mes "[���l]";
			mes "�ЂƔ���200�C�����Ă܂��ɂ�B";
			next;
			mes "[���l]";
			mes "^0000FF[���q�g�f]^000000�� ";
			mes "�}���������Y�ʋl�F200��";
			mes "�ł̎x�����ɂȂ�܂��ɂ�H";
			mes "�w������ɂ�H";
			set '@itemid,12640;
			break;
		default:
			mes "[���l]";
			mes "���肪�Ƃ��������܂����ɂ�B";
			mes "�܂��̂��������`�I";
			close;
		}
		next;
		switch(select("�}���������Y�ʋl�ōw������","�w������߂�","�ق��̏��i������")) {
		case 1:
			if(countitem(12636) < 200){
				mes "[���l]";
				mes "�}���������Y�ʋl������Ȃ��̂�";
				mes "����Ȃ��ɂ�B";
				mes "�܂����������������ɂႠ�B";
				close;
			}
			if(!checkitemblank()) {
				mes "[���l]";
				mes "�����ƁB";
				mes "���Ȃ��̃J�o���A";
				mes "����ȏ�V������ނ̃A�C�e����";
				mes "����X�y�[�X���Ȃ������ɂ�B";
				mes "�������Ă���Ƃ����ɂႠ�B";
				close;
			}
			if(!checkweight('@itemid,1)) {
				mes "[���l]";
				mes "�����ƁB";
				mes "���Ȃ��̃J�o���A";
				mes "���������d�����ɂ�B";
				mes "����ꂿ�Ⴄ�ɂႠ�`";
				mes "�������Ă���Ƃ����ɂ�B";
				close;
			}
			mes "[���l]";
			mes "�܂��ǂ���ɂ�I";
			delitem 12636,200;
			getitem '@itemid,1;
			close;
		case 2:
			mes "[���l]";
			mes "���肪�Ƃ��������܂����ɂ�B";
			mes "�܂��̂��������`�I";
			close;
		default:
			mes "[���l]";
			mes "�ʂ̏��i���C�ɂȂ�ɂ�H";
			mes "�������Ă��������ɂ�I";
			continue;
		}
	}
	end;
OnInit:
	waitingroom "�����E�e�ۏ��i�̔�",0;
	end;
}

//============================================================
// ����NPC
//------------------------------------------------------------
malangdo.gat,147,117,3	script	���ق̎�#malang	554,{
	mes "�]�֎q�̏�ł��낮�L������B";
	mes "�@���͂ɂ͑��ɏZ���͂��Ȃ��B";
	mes "�@�ނ����ق̎傾�낤���H�]";
	next;
	mes "[���邻���ȔL]";
	mes "�c�c�ɂႠ�B";
	mes "���q���񂩂ɂ�H";
	mes "�@";
	mes "�]���ق̎�́A";
	mes "�@���Ă����ڂ𔼕��J����";
	mes "�@���Ȃ��������]";
	next;
	switch(select("�x�e�������ł�","�Z�[�u�������ł�","���낢�ł܂���")) {
	case 1:
		mes "[���邻���ȔL]";
		mes "�ɂႠ�c�c�B";
		mes "^FF0000�}���������Y�ʋl5��^000000";
		mes "�����Ă���ɂႠ�B";
		next;
		if(select("�ʋl��n��","�����悳�����ł���") == 2) {
			mes "[���ق̎�]";
			mes "�c�c�n�����b�N��";
			mes "�����C�����ɂႠ�B";
			mes "���������Ȃ��ɂႠ�`�B";
			mes "�@";
			mes "�]���ق̎�͂܂ǂ�݁A";
			mes "�@���̂܂ܐQ�����Ă��܂����]";
			close;
		}
		if(countitem(12636) < 5) {
			mes "[���ق̎�]";
			mes "�ɂႠ�c�c";
			mes "�Q�Ă邩����ăo�J�ɂ��Ă�ɂ�H";
			mes "�}���������Y�ʋl�̐���";
			mes "����ĂȂ��ɂ�B";
			mes "���ƂƂ�����ɂႠ�`�B";
			close;
		}
		delitem 12636,5;
		misceffect 14,"";
		percentheal 100,100;
		mes "[���ق̎�]";
		mes "�����̃n�����b�N��";
		mes "�g���Ă���ɂႠ�c�c�B";
		mes "�����������ɂႠ�`�B";
		mes "�@";
		mes "�]���ق̎�͂܂ǂ�݁A";
		mes "�@���ꂽ�����ۂ����E�ɓ��������]";
		emotion 30;
		close2;
		warp "malangdo.gat",140,121;
		end;
	case 2:
		savepoint "malangdo.gat",143,119;
		mes "[���ق̎�]";
		mes "�ɂႠ�B";
		mes "�Z�[�u�����ɂ�B";
		mes "����ň��S�ɂႠ�H";
		mes "�@";
		mes "�]���ق̎�͂܂ǂ�݁A";
		mes "�@���̂܂ܐQ�����Ă��܂����]";
		close;
	default:
		mes "[���ق̎�]";
		mes "�p���͂��ꂾ���ɂ�H";
		mes "�Z���������ɂȎ���";
		mes "�����͑ӂ���ɂႠ�c�c�B";
		mes "�@";
		mes "�]���ق̎�͂܂ǂ�݁A";
		mes "�@���̂܂ܐQ�����Ă��܂����]";
		close;
	}
OnInit:
	waitingroom "���كT�[�r�X",0;
	end;
}

//============================================================
// �}������NPC
//------------------------------------------------------------
malangdo.gat,151,120,3	script	���Q����~���X�g����	479,{
	mes "[���Q����~���X�g����]";
	mes "���Ȃ��́A�����̗��ق̎��";
	mes "�b�����܂������H";
	mes "�������܂ł܂ǂ��ł������";
	mes "������܂Ŗ����Ȃ��Ă��܂��܂���ˁB";
	close;
}

malangdo.gat,149,120,5	script	���Q���郏���_���[	485,3,3,{
	mes "[���Q���郏���_���[]";
	mes "���̓��ɏZ��ł���L������";
	mes "�ƂĂ����C�ł��ˁB";
	mes "�ǂ��h�����󂯂�";
	mes "���̗x�����D���ł���B";
	close;
OnTouch:
	switch(rand(5)) {
	case 0:
		break;
	case 1:
		soundeffect "assassin_of_sunset.wav",0,0;
		break;
	case 2:
		soundeffect "dont_forget_me_not.wav",0,0;
		break;
	case 3:
		soundeffect "humming.wav",0,0;
		break;
	case 4:
		soundeffect "ring_of_nibelungen.wav",0,0;
		break;
	}
	emotion 2;
	emotion 2,"���Q����~���X�g����";
	end;
}

malangdo.gat,216,168,3	script	�L�D���̏�	558,5,5,{
	emotion 38;
	mes "[�L�D���̏�]";
	mes "�ӂ�����炩���A���̂����ہI";
	mes "�ق�ق�Ȃ��̂����I";
	mes "�䖝�ł��Ȃ��`�I�@�����͓V����I";
	close;
OnTouch:
	emotion 52;
	end;
}

malangdo.gat,164,203,3	script	�L�D���̒j	853,5,5,{
	emotion 38;
	mes "[�L�D���̒j]";
	mes "�ӂ�����炩���A���̂����ہI";
	mes "�ق�ق�Ȃ��̂����I";
	mes "���܂�˂����`!!";
	mes "�����͖{���̋Ɋy��!!";
	close;
OnTouch:
	emotion 52;
	end;
}

mal_in02.gat,166,74,4	script	�Y��D���ȑD��	555,{
	mes "[�Y��D���ȑD��]";
	mes "�������Ă�ɂ��!?";
	mes "�������U�炩���`�����X��";
	mes "�_���Ă�̂��ɂ���I";
	next;
	mes "[�Y��D���ȑD��]";
	mes "���肢�����琮�����ڂ�";
	mes "�����������Ăق����ɂ��B";
	mes "�S�~�̓S�~���ɁB";
	mes "���R�̂��͎̂��R�̂܂܂ɁI";
	next;
	mes "[�Y��D���ȑD��]";
	mes "�L�~�̂悤�Ȑl�Ԃ�����";
	mes "����悤�ɂȂ��āA�����";
	mes "���ꂪ�Ђǂ��Ȃ����ɂ��B";
	mes "���肢�����琮�����ڂ�";
	mes "�������肵�Ăق����ɂႠ�B";
	mes "�c�c�ɂ�ӂ�B";
	close;
}

mal_in02.gat,132,95,5	script	�|���D��	561,{
	mes "[�|���D��]";
	mes "������Ƃ�����ƁA";
	mes "���l�̕�����";
	mes "����ɓ���Ȃ��ł���Ȃ����B";
	next;
	mes "[�|���D��]";
	mes "�c�c�܂������B";
	mes "�ŋ߂̎Ⴂ�z��́B";
	mes "�����Ɠ{���Ă����Ȃ�����";
	mes "�|�����̒m�炸���炯���B";
	close;
}

mal_in02.gat,109,62,4	script	���ʂȑD��	545,{
	mes "[���ʂȑD��]";
	mes "�L���͑���ȁI";
	mes "�Â��ɂ��邱�ƁI";
	mes "�����āA����֎q��";
	mes "�Ђ�������!!";
	mes "�I���̖ѕ��ɔ�Q���o��!!";
	close;
}

//============================================================
// �L�B�̒���W��N�G�X�gNPC
//- Registory ------------------------------------------------
// MAL_1QUE -> 0�`37
//------------------------------------------------------------
mal_in02.gat,28,56,5	script	�V�����G��#mal	495,{
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
		mes "[�V�����G��]";
		mes "�����ɗp������̂��ȁH";
		mes "���[��c�c�B";
		mes "�Z�����L������ˁA";
		mes "���f�������Ȃ��悤�ɂˁB";
		close;
	default:
		mes "[�V�����G��]";
		mes "�����ɗp������̂��ȁH";
		mes "���f�������Ȃ��悤�ɂˁB";
		next;
		mes "[�V�����G��]";
		mes "�c�c�ƌ��������Ƃ��낾���ǁA";
		mes "�����Z�����L������";
		mes "�����͎d���Ȃ����낤�ˁB";
		next;
		switch(select("�����̐l���𕷂�","���Ȃ̂ɑ���������̂�")) {
		case 1:
			mes "[�V�����G��]";
			mes "�����́A���̓��ɒ┑����ȑO��";
			mes "��ƌĂ΂�Ă����񂾁B";
			mes "���z�̂悤�ɋ��F�ɋP�����I";
			mes "�r���g���ɂ������A��Ɍ���Ђ�!!";
			next;
			mes "[�V�����G��]";
			mes "���͂��̂����������p�ɍ����";
			mes "�D���ɂȂ����񂾂�I";
			mes "�ނ͂��ׂĂ̔L�j�̓��ꂾ��!!";
			emotion 40;
			next;
			mes "[�V�����G��]";
			mes "�������A�����ɂȂ������݂�";
			mes "�����������܂܂��B";
			mes "����Ȃ������Ɩ���";
			mes "�����΂���L���[�e�B�N����";
			mes "����ł��܂��Ă�悤�����ǁc�c�B";
			mes "�ڂ��͐̂ƕς��Ȃ��B";
			close;
		case 2:
			mes "[�V�����G��]";
			mes "���Ő�������ɂ�������";
			mes "�����ĂԂ悤�ɔނ������Ă���񂾂�B";
			mes "���΂炭�q�C���o�������ɂȂ����ˁB";
			next;
			mes "[�V�����G��]";
			mes "�����A����ς�ނɂ�";
			mes "�������A��̕���";
			mes "�������肭��ˁB";
			mes "�g�[�}�X��B";
			mes "�������������낤�H";
			next;
			mes "[�V�����G��]";
			mes "�����Ƃ����v���Ă���̂�";
			mes "����������Ȃ��͂����B";
			close;
		}
	}
}

mal_in02.gat,22,62,3	script	�g�[�}�X#mal	556,{
	if(BaseLevel < 60) {
		mes "[�g�[�}�X����]";
		mes "�N�͒N�����H";
		mes "�\����Ȃ����A����";
		mes "�}���̎d���������Ă�񂾁B";
		mes "���Ƃɂ��Ă��ꂽ�܂���B";
		next;
		mes "�]�N�G�X�g��i�s����ɂ�";
		mes "�@���x���������Ȃ��悤�ł��B";
		mes "�@^FF0000Base���x��60^000000�ɂȂ�����";
		mes "�@�ēx�b�������Ă��������]";
		close;
	}
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
		cutin "ma_tomas02",2;
		mes "[�g�[�}�X����]";
		mes "�V�����G���I";
		mes "���̐����󋵂�񍐂���I";
		next;
		mes "[�V�����G��]";
		mes "�͂��A��I";
		mes "��قǎ󂯎�����������킹��";
		mes "�v3000�͂��łɑq�ɂ�";
		mes "�ڂ��I���Ă܂��B";
		mes "���̔���5���Ԍ�ɓ����\��ł��B";
		emotion 23,"�V�����G��#mal";
		next;
		mes "[�g�[�}�X����]";
		mes "�V�����G���I";
		mes "��ł͂Ȃ��A";
		mes "�����ƌĂԂ悤�ɂ�";
		mes "���x�������Ă��邾�낤�I";
		next;
		mes "[�V�����G��]";
		mes "���A���݂܂��񑺒��I";
		mes "���߂܂��I";
		emotion 23,"�V�����G��#mal";
		next;
		mes "[�g�[�}�X����]";
		mes "�킩��΂����B";
		mes "���̎d�����Еt������A";
		mes "���ׂ̉��͂��O��";
		mes "���̒��g�𕪗ނ��Ă����B";
		next;
		mes "[�g�[�}�X����]";
		mes "�Ȃ܂��A�ق�A�������񂿂Ⴍ�͉E�B";
		mes "���J���A���z�͉��̊K�ɁA";
		mes "���킵�Ƒ傫�����ۂ͏W��ꏊ��";
		mes "���ׂ̉́A���̋߂���";
		mes "�^��ł����悤�ɁI";
		next;
		mes "[�V�����G��]";
		mes "�͂��A�����I";
		mes "�Ȃ܂��A�ق�A�������񂿂Ⴍ�͉E�B";
		mes "���J���A�ዾ�͉��̊K�B";
		mes "���킵�Ƒ傫�����ۂ͏W��ꏊ�B";
		mes "���ׂ̉́A���̋߂��ł��ˁI";
		emotion 23,"�V�����G��#mal";
		next;
		mes "[�g�[�}�X����]";
		mes "�����ł͂Ȃ��B";
		mes "�Ȃ܂��A�ق�A�������񂿂Ⴍ�͉E�B";
		mes "���J���A���z�͉��̊K�ɁA";
		mes "���킵�Ƒ傫�����ۂ͏W��ꏊ��";
		mes "���ׂ̉́A���̋߂����B";
		emotion 9;
		next;
		mes "[�V�����G��]";
		mes "�͂��I";
		emotion 23,"�V�����G��#mal";
		next;
		mes "[�g�[�}�X����]";
		mes "���񂾂�B";
		mes "�@";
		mes "�c�c����ɂ��Ă��A";
		mes "�ЂÂ��Ă��ЂÂ��Ă�";
		mes "�d�����I���Ȃ��B";
		emotion 54;
		next;
		mes "[�g�[�}�X����]";
		mes "���[�Ɓc�c�B";
		mes "���ɗ���̂�1300�B";
		mes "���̎����c�c�B";
		next;
		if(select("����������","���������Ȃ�") == 2) {
			mes "["+strcharinfo(0)+"]";
			mes "�i�Z���������c�c�j";
			mes "�@";
			mes "�]���Ȃ��̓g�[�}�X������";
			mes "�@�b�������Ȃ������]";
			close2;
			cutin "ma_tomas01",255;
			end;
		}
		mes "[�g�[�}�X����]";
		mes "����A�N�͒N���ȁH";
		mes "�\����Ȃ����A����";
		mes "�Z�����񂾁B";
		mes "���Ƃɂ��Ă��ꂽ�܂���B";
		cutin "ma_tomas01",2;
		next;
		switch(select("�������ɂ��܂���","���̔L�ɖʉ�����߂��܂���","�܂��ɂ��܂�")) {
		case 1:
			mes "[�g�[�}�X����]";
			mes "����͂킴�킴���肪�����B";
			mes "���̓��͋C�ɓ����Ă��ꂽ���ȁB";
			next;
			mes "[�g�[�}�X����]";
			mes "�{���ł���Ύ����g�����̈ē���";
			mes "����ׂ��Ȃ̂��낤���c�c�B";
			mes "���܂Ȃ��B";
			mes "�d�������č���ł��ĂˁB";
			next;
			mes "[�g�[�}�X����]";
			mes "�c�c���������΁A";
			mes "���傤�Ǎ��A^0000FF�}����������W��^000000��";
			mes "�J����Ă��鍠�������ȁB";
			mes "�}�Șb�Ő\����Ȃ��̂����A";
			mes "������ƌ��Ă��Ă���Ȃ����ȁB";
			emotion 9;
			next;
			mes "[�g�[�}�X����]";
			mes "���̓��̏Z���������W�܂邩��";
			mes "��F���͂���̂ɂ�";
			mes "���傤�Ǘǂ����낤�B";
			next;
			mes "[�g�[�}�X����]";
			mes "�����āA���ɂ��̗l�q��";
			mes "�񍐂��Ă����Ƃ��肪�����B";
			mes "�ŋ߂͗��đ����Ɏd���Ɍ�������";
			mes "����W��Ɋ���o���Ă��Ȃ��񂾁B";
			next;
			mes "[�g�[�}�X����]";
			mes "����W��́A";
			mes "���̕����Ƃ͔��Α��̘L���̒[�ɂ���";
			mes "^0000FF�H��^000000�ŊJ�Â����͂����B";
			mes "���ꂶ�Ⴀ�A���܂Ȃ������񂾂�B";
			set MAL_1QUE,3;
			chgquest 71800,11209;
			close2;
			cutin "ma_tomas01",255;
			end;
		case 2:
			mes "[�g�[�}�X����]";
			mes "�c�c�c�c�c�c�c�c�c�c�B";
			mes "�c�c�c�c�c�c�c�c�c�c�B";
			mes "�c�c�c�c�c�c�c�c�c�c�B";
			emotion 6;
			next;
			mes "[�g�[�}�X����]";
			mes "����ȂɖZ�����Ƃ����̂�";
			mes "�ނ�ɂ����������̂��c�c�B";
			next;
			mes "[�g�[�}�X����]";
			mes "�c�c�����A����";
			mes "�C�ɂ��Ȃ��ł��ꂽ�܂��B";
			mes "���A�ɗ��Ă���Ă��肪�Ƃ��B";
			mes "���̓��͋C�ɓ����Ă��ꂽ���ȁB";
			next;
			mes "[�g�[�}�X����]";
			mes "�����͎����g�����̈ē���";
			mes "����ׂ��Ȃ̂��낤���c�c�B";
			mes "���܂Ȃ��B";
			mes "�d�������č���ł��ĂˁB";
			next;
			mes "[�g�[�}�X����]";
			mes "����Ƃ����Ă͂Ȃ񂾂��A";
			mes "���傤�Ǎ��A^0000FF�}����������W��^000000��";
			mes "�J����Ă��鍠�������B";
			mes "������ƌ��Ă��Ă���Ȃ����ȁB";
			next;
			mes "[�g�[�}�X����]";
			mes "���̓��̏Z���������W�܂邩��";
			mes "��F���͂���̂�";
			mes "���傤�Ǘǂ����낤�B";
			mes "�����āA���ɂ��̗l�q��";
			mes "�񍐂��Ă����Ƃ��肪�����ȁB";
			next;
			mes "[�g�[�}�X����]";
			mes "����W��́A";
			mes "���̕����Ƃ͔��Α��̘L���̒[�ɂ���";
			mes "^0000FF�H��^000000�ŊJ�Â���Ă��邩��ˁB";
			set MAL_1QUE,3;
			chgquest 71800,11209;
			close2;
			cutin "ma_tomas01",255;
			end;
		case 3:
			mes "[�g�[�}�X����]";
			mes "���܂Ȃ��ˁB";
			mes "���̋@��ɂ�";
			mes "�b���ł���悤�ɂ��Ă�����B";
			close2;
			cutin "ma_tomas01",255;
			end;
		}
	case 3:
		cutin "ma_tomas02",2;
		mes "[�g�[�}�X����]";
		mes "�����z�����锠��1000�A";
		mes "�⋋�i�Ƃ��Ĕz�锠��400";
		mes "����Ɓc�c�B";
		next;
		mes "[�V�����G��]";
		mes "���炵�܂��I��I";
		mes "���΂��A�u���A���������͉E����";
		mes "���J���A�܂���͉��̊K�I";
		mes "����܂͏W��ꏊ�ł悩�����ł���!?";
		emotion 23;
		next;
		mes "[�g�[�}�X����]";
		mes "�c�c�B";
		emotion 9;
		next;
		mes "[�g�[�}�X����]";
		mes "�c�c�c�c�c�c�c�c�c�c�B";
		next;
		mes "[�g�[�}�X����]";
		mes "�c�c�c�c�c�c�c�c�c�c�B";
		mes "�c�c�c�c�c�c�c�c�c�c�B";
		mes "�c�c�c�c�c�c�c�c�c�c�B";
		next;
		mes "[�g�[�}�X����]";
		mes "�Ⴄ!!";
		mes "�Ȃ��A����Ȃ��ƂɂȂ��Ă��!!";
		mes "���J�����������ĂȂ�����Ȃ���!!";
		emotion 6;
		cutin "ma_tomas03",2;
		next;
		mes "[�g�[�}�X����]";
		mes "�Ȃ܂��A�ق�A�������񂿂Ⴍ�͉E�B";
		mes "���J���A���z�͉��̊K�ɁA";
		mes "���킵�Ƒ傫�����ۂ͏W��ꏊ��";
		mes "���ׂ̉́A���̋߂�!!";
		emotion 23;
		next;
		mes "[�g�[�}�X����]";
		mes "�ǂ�������";
		mes "����ȖŒ��ꒃ�ɂȂ��!!";
		mes "�@";
		mes "�\�\�͂�!!";
		next;
		mes "[�g�[�}�X����]";
		mes "���A�N";
		mes "�����炻���ɁH";
		emotion 23;
		next;
		mes "[�g�[�}�X����]";
		mes "����W��͍s���Ȃ������̂���!?";
		mes "���w�̂��Ƃ͓`���Ă��邩��";
		mes "�S�z�Ȃ����H";
		mes "�ꏊ�͂����̔��Α��ɂ���";
		mes "^0000FF�H��^000000�����B";
		emotion 19;
		cutin "ma_tomas02",2;
		close2;
		cutin "ma_tomas02",255;
		end;
	case 4:
	case 5:
		cutin "ma_tomas02",2;
		mes "[�g�[�}�X����]";
		mes "�����A�Z�����Z�����c�c�B";
		mes "�@";
		mes "����A�N�H";
		emotion 19;
		next;
		mes "[�g�[�}�X����]";
		mes "����W��̏ꏊ��";
		mes "�킩��Ȃ��Ȃ��Ă��܂����̂��ȁB";
		mes "�����̔��Α��ɂ���";
		mes "^0000FF�H��^000000����B";
		close2;
		cutin "ma_tomas02",255;
		end;
	case 35:
		mes "�]���Ȃ��͒���W���";
		mes "�@���Ă������Ƃ��g�[�}�X������";
		mes "�@�񍐂����]";
		next;
		mes "[�g�[�}�X����]";
		mes "�ق��ق��I�@���̂悤�Ȃ��Ƃ��I";
		emotion 5;
		cutin "ma_tomas04",2;
		next;
		mes "[�g�[�}�X����]";
		mes "�Z�����Ƃ������Ƃ𗝗R��";
		mes "�W��Ɋ���o���Ȃ���";
		mes "�\����Ȃ����Ƃ����Ă��܂����ȁB";
		next;
		mes "[�g�[�}�X����]";
		mes "����A������";
		mes "�N�̂������ŐF�X�Ɖ���������";
		mes "�N���F�ƒ��ǂ��Ȃꂽ�悤����";
		mes "������芐�����肾��B";
		emotion 18;
		next;
		mes "[�g�[�}�X����]";
		mes "����Ƃ���낵�����ށB";
		mes "���������Ƃ���������";
		mes "���ł����Ȃ����B";
		next;
		if(!checkweight(12636,230)) {
			mes "[�g�[�}�X����]";
			mes "����A�ו��������ς��̂悤���B";
			mes "���������Ă���A�܂����������Ă���B";
			close2;
			cutin "ma_tomas04",255;
			end;
		}
		mes "[�g�[�}�X����]";
		mes "����͂ق�̂��炾�B";
		mes "����g���Ă���B";
		delquest 11237;
		setquest 71720;
		set MAL_1QUE,36; //����
		getitem 12636,230;
		if(checkre()) {
			for(set '@i,0;'@i<14;set '@i,'@i+1)
				getexp 5000,0,1;
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 0,5000,0;
		}
		else {
			for(set '@i,0;'@i<14;set '@i,'@i+1)
				getexp 50000,0,1;
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 0,50000,0;
		}
		misceffect 1,"";
		next;
	case 36:
		mes "[�g�[�}�X����]";
		mes "���������ΈȑO�q�C���Ă������A";
		mes "�q�C�m�Ƃ��ď����Ă���Ă���";
		mes "�s�s�G�[��������";
		mes "�w�҂ƂȂ��Ă���炵���B";
		next;
		mes "[�g�[�}�X����]";
		mes "�s�s�G�[���Ƃ��ŋߖZ������";
		mes "����Ă��Ȃ��ȁB";
		mes "�������Ԃ�����΃s�s�G�[����";
		mes "�l�q�����ė��Ă���Ȃ����B";
		close2;
		cutin "ma_tomas04",255;
		end;
	case 37:
		mes "[�g�[�}�X����]";
		mes "�͂͂́I�@�N���B";
		mes "�ŋ߂͂ǂ������H";
		mes "���������Ƃ���������";
		mes "���ł����Ȃ����B";
		emotion 18;
		cutin "ma_tomas04", 2;
		close2;
		cutin "ma_tomas04", 255;
		end;
	default:
		cutin "ma_tomas02",2;
		mes "[�g�[�}�X����]";
		mes "�����A�Z�����Z�����c�c�B";
		mes "�@";
		mes "����A�N�H";
		emotion 19;
		next;
		mes "[�g�[�}�X����]";
		mes "����W��͂ǂ����������ˁH";
		mes "�F�A�悭����Ă������ȁB";
		close2;
		cutin "ma_tomas02",255;
		end;
	}
OnInit:
	waitingroom "�L�B�̒���W��",0;
	end;
}

mal_in02.gat,182,61,3	script	�W��c��#mal	421,{
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
		mes "[�W��c��]";
		mes "���������}�������̒���W�";
		mes "�͂��܂�܂��悧�`�I";
		mes "�݂Ȃ���A�Ïl�ɁI";
		mes "�Ïl�ɂ��`�I";
		close;
	case 3:
		mes "[�W��c��]";
		mes "�݂Ȃ���A�������ł��ˁI";
		mes "����W����͂��߂܂��悧�`�I";
		next;
		mes "[�W��c��]";
		mes "�{���ŏ��̋c���";
		mes "^ff99cc�X�^�[�L�����f�B^000000�l���g����";
		mes "^0000FF����Ȍ���^000000�ɂȂ�܂��`�B";
		next;
		mes "[�W��c��]";
		mes "���݂��̃}�������ł�";
		mes "���炩���n�Ղ�������";
		mes "���������ŋT�􂪔������Ă��܂��`�B";
		next;
		mes "[�W��c��]";
		mes "���̋T��͓��̒n�����A�ɂ���";
		mes "�X�^�[�L�����f�B�l��";
		mes "���S�̂��x���Ă��邨������";
		mes "�Ȃ�Ƃ��厖�Ɏ��鎖��h���ł܂��`�B";
		next;
		mes "[�W��c��]";
		mes "�������A�̐S�̃X�^�[�L�����f�B�l��";
		mes "�q�g�f���b�����߂�";
		mes "�ӎv�a�ʂ����܂��ł��Ă��܂���`�B";
		next;
		mes "[�W��c��]";
		mes "�����̒n�����������ł�";
		mes "�K�����������B";
		mes "�ӎv�a�ʂ����Ȃ�Ȃ����Ƃ�";
		mes "�傫�Ȗ��ł��`�B";
		next;
		mes "[�W��c��]";
		mes "����ɑ΂��Ă̈ӌ���";
		mes "���肢���܂��`�B";
		next;
		mes "[�W��c��]";
		mes "�c�c�ł́A";
		mes "^6666cc�X�R�|���h^000000���񂩂�";
		mes "�ǂ������`�B";
		chgquest 11209,11210;
		set MAL_1QUE,4;
		emotion 12,"�X�R�|���h#mal";
		close;
	case 4:
		mes "[�W��c��]";
		mes "^6666cc�X�R�|���h^000000����A";
		mes "�c��ɑ΂��Ă̈ӌ���";
		mes "���肢���܂��`�B";
		emotion 12,"�X�R�|���h#mal";
		close;
	case 5:
		mes "[�W��c��]";
		mes "����ł�^6666cc�N��^000000����A";
		mes "���b�����������`�B";
		emotion 12,"�N��#mal";
		close;
	case 6:
		mes "[�W��c��]";
		mes "^6666cc�f�{�����m^000000�A";
		mes "���|�[�g�̔��\�����肢���܂��`�B";
		emotion 12,"����w�҃f�{��#mal";
		close;
	case 7:
		mes "[�W��c��]";
		mes "^6666cc�}�������m^000000�A";
		mes "���b�����������`�B";
		emotion 12,"�n���w�҃}����#mal";
		close;
	case 8:
		mes "[�W��c��]";
		mes "^6666cc�u��^000000����A";
		mes "���͏W��ł��悧�`�B";
		mes "���������Ă��������`�B";
		close;
	case 9:
		mes "[�W��c��]";
		mes "�V�����G�����񂪃��J���ƃc�i��";
		mes "�����Ă��Ă��ꂽ�̂�";
		mes "�����x�e�ɓ���܂��傤�����`�B";
		close;
	default:
		mes "[�W��c��]";
		mes "�킽�����L�̎�T�[�r�X��";
		mes "���������Ă������́A";
		mes "�ǂꂾ�������Ă����Ȃ��̗͂�";
		mes "�������������̂ł����`�B";
		next;
		mes "[�W��c��]";
		mes "�c���ɂȂ��āA�W���������";
		mes "���߂ł��˂��A�ǂ����`�B";
		mes "�N�ł��傤�����`�B";
		emotion 28;
		close;
	}
}

mal_in02.gat,178,66,5	script	�X�R�|���h#mal	422,{
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
		mes "[�X�R�|���h]";
		mes "���̏W��͂ƂĂ��d�v�ł��ɂ�B";
		mes "�����ł��ӔC�����������Ȃ��";
		mes "�Q������̂�";
		mes "���R�ƍl���܂��ɂ�ɂ�B";
		close;
	case 3:
		mes "[�X�R�|���h]";
		mes "���������W��n�܂�܂��ɂ�B";
		mes "���w�����Ȃ�";
		mes "�Â��ɂ��肢���܂��ɂ�ɂ�B";
		close;
	case 4:
		mes "[�X�R�|���h]";
		mes "�͂��A�ł͔������܂��ɂ�B";
		mes "�X�^�[�L�����f�B�l�Ƃ�";
		mes "�ӎv�a�ʂ́A���̂Ƃ���";
		mes "�K���p���l���S���Ă��܂��ɂ�B";
		next;
		mes "[�W��c��]";
		mes "�����ł��`�B";
		mes "�������A�K���p���l��";
		mes "^0000FF������̘b�͗������Ă���悤�ł���";
		mes "�����炩�狤�ʌ������ׂ鎖��";
		mes "�o���Ȃ�^000000�悤�ł��`�B";
		next;
		mes "[�W��c��]";
		mes "�X�^�[�L�����f�B�l��";
		mes "���̃}�������̑��������E����";
		mes "�d�v�Ȉʒu�ɂ���������ȏ�A";
		mes "����ێ��͌�������܂���`�B";
		mes "���炩�̑΍���l���Ă���������";
		mes "�l���Ă��܂��`�B";
		next;
		mes "[�X�R�|���h]";
		mes "�Ȃ�قǂɂ�B";
		mes "����͎������ӂ��܂��ɂ�ɂ�B";
		next;
		mes "[�W��c��]";
		mes "���肪�Ƃ��������܂��`�B";
		mes "�@";
		mes "���̓N������B";
		mes "���ӌ��ǂ������`�B";
		chgquest 11210,11211;
		set MAL_1QUE,5;
		emotion 12,"�N��#mal";
		close;
	default:
		mes "[�X�R�|���h]";
		mes "�W��͐Â��ɂł��ɂ�B";
		mes "�܂��Ă┭���҂�����Ƃ���";
		mes "������C��t����ׂ�����";
		mes "�v���܂��ɂ�ɂ�B";
		close;
	}
}

mal_in02.gat,177,58,7	script	�N��#mal	546,{
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
		mes "[�N��]";
		mes "�ǂꂾ���Z�����Ă�";
		mes "�W����͌��Ȃ��܂���B";
		mes "�܂��A�ł��d���ɍ����x���Ȃ��悤��";
		mes "���肢�������ł��ˁB";
		close;
	case 3:
		mes "[�N��]";
		mes "�����̋c��͂Ȃ�ł���܂��傤�B";
		close;
	case 4:
		mes "[�N��]";
		mes "�X�R�|���h�����";
		mes "�����M�S�Ȕ������������ł��B";
		mes "�����W��c���̗L�͌��ł��B";
		close;
	case 5:
		mes "[�N��]";
		mes "�����ƁA�f�{�����m�̌�����";
		mes "�ǂ̂��炢�i��ł����ł��傤���H";
		next;
		mes "[�W��c��]";
		mes "�����A�����ł��˂��`";
		mes "^6666cc�f�{�����m^000000�A";
		mes "���|�[�g�̔��\�����肢���܂��`";
		chgquest 11211,11212;
		set MAL_1QUE,6;
		emotion 12,"����w�҃f�{��#mal";
		close;
	default:
		mes "[�N��]";
		mes "��������ɂ͋���������܂�����";
		mes "�f�{�����m�̌������ʂ�";
		mes "�����̂������y���݂ɂ��Ă��܂��B";
		close;
	}
}

mal_in02.gat,174,64,5	script	����w�҃f�{��#mal	549,{
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		mes "[����w�҃f�{��]";
		mes "����K���͏����L�ɂƂ���";
		mes "�K�v�s���ȍ˔\�ł���ɂ�B";
		mes "���t��m��˂΁A";
		mes "���������藧���Ȃ��ɂ�B";
		close;
	case 6:
		mes "[����w�҃f�{��]";
		mes "����ɂ��́A�F����B";
		mes "�X�^�[�L�����f�B�l���g����";
		mes "�q�g�f�ꌤ����S������";
		mes "����w�҃f�{���ł���ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "���̃}�������ɕY������Ɠ�����";
		mes "�J�n���ꂽ�q�g�f�ꌤ���ł����A";
		mes "�p�������Ȃ���A";
		mes "�ڗ��������ʂ��o���Ă��܂���ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "���̂Ƃ���K���p���l�̋��͂ɂ��A";
		mes "������̘b��`���鎖���o����";
		mes "�����ł���ɂ�B";
		emotion 19;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�q�g�f�͔L�̌��t���킩�邯��";
		mes "�@�L�̓q�g�f�̌��t��";
		mes "�@�킩��Ȃ��̂��c�c�B�j";
		next;
		mes "[�X�R�|���h]";
		mes "�ł́A���̊Ԕ������ꂽ�{��";
		mes "�����͂ǂ��Ȃ�܂������ɂ�H";
		mes "�ɂ�ɂ�B";
		next;
		mes "[�N��]";
		mes "�������q�g�f��ŏ����ꂽ���̂�";
		mes "��������Ă���{�ł����ˁB";
		mes "���ꂪ�{���Ȃ�A";
		mes "���ꌤ���ɖ𗧂̂ł�";
		mes "�Ȃ��ł��傤���H";
		next;
		mes "[����w�҃f�{��]";
		mes "����͂������B";
		mes "�������A���_����\���܂���";
		mes "���̐�����";
		mes "�͂��ꂾ�����悤�ł��ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "�{���A�X�^�[�L�����f�B�l��";
		mes "���Ă�������̂ł��邪";
		mes "�{�l���A����̃J���p���l�����";
		mes "�����������������B";
		mes "�c�O�Ȃ��Ƃł���ɂ�B";
		next;
		mes "[�N��]";
		mes "����͎c�O�ł��B";
		next;
		mes "[�W��c��]";
		mes "���ɁA�f�{�����m��";
		mes "���₷�邱�Ƃ͂���܂��񂩂��`�H";
		next;
		mes "[�W��c��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�W��c��]";
		mes "�Ȃ��悤�ł��˂��`";
		mes "�@";
		mes "����ł̓f�{�����m�̕񍐂�";
		mes "�����ŏI���܂��āA";
		mes "���A�n���w�҃}�������m��";
		mes "���\�ɍs�������Ǝv���܂��`";
		next;
		mes "[�W��c��]";
		mes "�}�������m";
		mes "���肢���܂��`";
		chgquest 11212,11213;
		set MAL_1QUE,7;
		emotion 12,"�n���w�҃}����#mal";
		close;
	case 20:
		mes "[����w�҃f�{��]";
		mes "�q�g�f��́A����܂Ō������Ă���";
		mes "����̂����ł��ō��̓��ł���ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "���E�̂����錾���";
		mes "�ƂĂ��������A�����̂��b�オ���邪";
		mes "���ʂ��o���Ȃ����";
		mes "�Ӗ����Ȃ��̂ł���ɂ�B";
		emotion 19;
		next;
		mes "[����w�҃f�{��]";
		mes "���̓K���p���l��";
		mes "�����炩��̘b��`���邱�Ƃ�";
		mes "�Ȃ�Ƃ��ɂ���Ă���̂ł��邪�c�c�B";
		next;
		mes "[����w�҃f�{��]";
		mes "��������!!";
		mes "�����ӂ����肾�ɂႠ!!";
		mes "�ނ炪�����肤�̂�";
		mes "���ꂾ���ł��킩��΂����̂ɁI";
		emotion 23;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��������`�����܂��傤���H";
		next;
		mes "[����w�҃f�{��]";
		mes "�ɂ�H";
		mes "���ʂ�����`���Ă����̂��ɂ�H";
		next;
		mes "[����w�҃f�{��]";
		mes "�ł́A���ʂ��ɂ̓K���p���l�̗l�q��";
		mes "���ɍs���Ă��炢�����B";
		mes "�����C�Â������Ƃ������";
		mes "�����ɋ����Ă���ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "�K���p���l�͂��̓��̒n���ɂ���";
		mes "������̎X��ʂ�";
		mes "�X�^�[�L�����f�B�l��";
		mes "�����b�����Ă���ɂ�B";
		chgquest 11225,11226;
		set MAL_1QUE,21;
		close;
	case 21:
		mes "[����w�҃f�{��]";
		mes "��������!!";
		mes "�����ӂ����肾�ɂႠ!!";
		mes "�ނ炪�����肤�̂�";
		mes "���ꂾ���ł��킩��΂����̂ɁI";
		next;
		mes "[����w�҃f�{��]";
		mes "�ɂ�H";
		mes "����ȂƂ���ŉ������Ă���ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "�����K���p���l�̗l�q��";
		mes "���ɍs���Ă��Ă���ɂ�B";
		mes "�����C�Â������Ƃ������";
		mes "�����ɋ����Ă���ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "�K���p���l�͂��̓��̒n���ɂ���";
		mes "������̎X��ʂ�";
		mes "�X�^�[�L�����f�B�l��";
		mes "�����b�����Ă���ɂ�B";
		close;
	case 22:
	case 23:
		mes "[����w�҃f�{��]";
		mes "�ɂ�񂾂Ɓc�c!?";
		mes "�X���[�Y�ɉ�b�ł����H";
		mes "�����Ă�����ɕs�����H";
		mes "�ɂ�ɂ�ɂ�c�c�B";
		mes "�܂�������ȁc�c�B";
		emotion 23;
		next;
		mes "[����w�҃f�{��]";
		mes "�킵���s���܂��I";
		mes "���̖ڂŊm���߂܂��ɂ�I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�K���p���ƃX�^�[�L�����f�B��";
		mes "�@�Ƃ���ɖ߂邱�Ƃɂ��悤�c�c�j";
		if(MAL_1QUE == 22) {
			chgquest 11227,11228;
			set MAL_1QUE,23;
		}
		close;
	case 25:
		mes "[����w�҃f�{��]";
		mes "�������c�c�܂���";
		mes "����Ȍ�����������Ă����ȂǁI";
		next;
		mes "[����w�҃f�{��]";
		mes "�������A�񓚂͌������B";
		mes "�q�g�f��̊��S��ǂ�";
		mes "�߂��ł���ɂ�I";
		emotion 21;
		close;
	case 34:
		mes "[����w�҃f�{��]";
		mes "�K���p���l��";
		mes "���̂悤�Ȃ��Ƃ�!?";
		emotion 23;
		next;
		mes "[����w�҃f�{��]";
		mes "�����c�c�B";
		mes "���ʂ������Ă���";
		mes "�Ƃ�Ƃ񔏎q��";
		mes "��肪���������̂ł���ɂ�I";
		next;
		mes "[����w�҃f�{��]";
		mes "��������ɂ�I";
		mes "�킵�͂��������K���p���l��";
		mes "����Ă��Ȃ���΁c�c�I";
		next;
		mes "[����w�҃f�{��]";
		mes "���ʂ���";
		mes "���̊�΂����j���[�X��";
		mes "�����g�[�}�X������";
		mes "�񍐂���ł���ɂ�I";
		mes "���ނł���I";
		next;
		if(!checkweight(12636,30)) {
			//�ϑz
			mes "[����w�҃f�{��]";
			mes "����ł͂�����c�c";
			mes "�ו��������ς��ł���ɂ�I";
			mes "�ו��ɋ󂫂�����Ă���";
			mes "�܂��b��������ł���I";
			close;
		}
		mes "[����w�҃f�{��]";
		mes "����͂���ł���ɂ�B";
		mes "�ǂ����󂯎���Ă���ɂ�B";
		chgquest 11236,11237;
		set MAL_1QUE,35;
		getitem 12636,30;
		if(checkre()) {
			for(set '@i,0;'@i<12;set '@i,'@i+1)
				getexp 5000,0;
			for(set '@i,0;'@i<5;set '@i,'@i+1)
				getexp 0,5000;
		}
		else {
			for(set '@i,0;'@i<12;set '@i,'@i+1)
				getexp 50000,0;
			for(set '@i,0;'@i<5;set '@i,'@i+1)
				getexp 0,50000;
		}
		close;
	default:
		if(MAL_1QUE >= 24) {
			mes "[����w�҃f�{��]";
			mes "���������͍��܂Ńq�g�f��";
			mes "�Ǝ��̃q�g�f��ŉ�b���Ă����";
			mes "�v���Ă��܂������A���ۂɂ�";
			mes "����̊֌W�ŋ��ʌ�̈ꕔ��";
			mes "�������Ă��Ȃ������悤�ł��ɂ�B";
			next;
			mes "[����w�҃f�{��]";
			mes "����͋��ʌ�����Ƃ�";
			mes "���������ł��������镔����";
			mes "�q�g�f��Ƃ��Č�����";
			mes "�����Ă����ɂ�B";
			next;
			mes "[����w�҃f�{��]";
			mes "����ɂ��q�g�f�ꌤ����";
			mes "����܂ł̂��Ƃ��R�̂悤��";
			mes "�����ł���ɂ�B";
			mes "��������ׂĂ��ʂ��̂������ɂ�I";
			emotion 15;
			close;
		}
		mes "[����w�҃f�{��]";
		mes "�q�g�f��́A����܂Ō������Ă���";
		mes "����̂����ł��ō��̓��ł���ɂ�B";
		emotion 19;
		next;
		mes "[����w�҃f�{��]";
		mes "�������������������̂ł���ɂ�B";
		mes "���̏�Ԃł́A";
		mes "�F�ɍ��킹��炪�Ȃ��ɂ�B";
		close;
	}
}

mal_in02.gat,179,57,1	script	�n���w�҃}����#mal	559,{
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[�n���w�҃}����]";
		mes "�����}�������̓y��";
		mes "���܂�ɂ����炩���c�c�B";
		mes "�G�邾���ŋC�����悭�Ȃ�܂��B";
		emotion 43;
		close;
	case 7:
		mes "[�n���w�҃}����]";
		mes "�ł́A�񍐂��܂��B";
		next;
		mes "[�n���w�҃}����]";
		mes "�F����A���łɂ������̒ʂ�A";
		mes "���̂��������Œn���ꂪ";
		mes "�������Ă��܂��B";
		next;
		mes "[�n���w�҃}����]";
		mes "����A�X�^�[�L�����f�B�l�̂�������";
		mes "������x���肵�Ă����Ԃł����A";
		mes "���X�^�[�L�����f�B�l��";
		mes "�������\���ł��܂���̂�";
		mes "��C��Ƃ͕K�{�ł��傤�B";
		next;
		mes "[�n���w�҃}����]";
		mes "�������A��ƈ���";
		mes "���|�I�ɕs�����Ă��܂��B";
		next;
		mes "[�n���w�҃}����]";
		mes "�F����A�e���̎d��������";
		mes "�Z�����Ƃ͎v���܂����A";
		mes "�T��C���͓��̐�����Ԃ̊m�ۂ�";
		mes "�����������ł��B";
		mes "�����̎x�������肢���܂��B";
		emotion 26;
		emotion 23,"�u��#mal";
		next;
		mes "[�u��]";
		mes "������Ƃ܂��Ă��������I";
		mes "�l���̂ӂ�����";
		mes "����Ȃ��邭���܂�����";
		mes "���񂾂�����Ȃ��Ƃ������܂��I";
		emotion 12,"�u��#mal";
		next;
		mes "[�u��]";
		mes "���̂������̒n�k��";
		mes "�{�N�̂��Ƃ�����̓P�K��";
		mes "������ł���I";
		next;
		mes "[�W��c��]";
		mes "�u������I";
		mes "�����̍ۂ́A";
		mes "���������Ă��肢���܂��`�B";
		chgquest 11213,11214;
		set MAL_1QUE,8;
		close;
	case 15:
		mes "[�n���w�҃}����]";
		mes "�����}�������̓y��";
		mes "���܂�ɂ����炩���c�c�B";
		mes "�G�邾���ŋC�����悭�Ȃ�܂��`���B";
		emotion 40;
		next;
		mes "[�n���w�҃}����]";
		mes "�͂��I";
		mes "�����Ȃ��B";
		mes "���Ȃ��Ƃ��b�����ł����ˁI";
		emotion 23;
		next;
		mes "[�n���w�҃}����]";
		mes "�����Ɓc�c���̓y�̂�������";
		mes "�������̑D�i�r����";
		mes "���ɏՓ˂�����";
		mes "�傫�Ȕ�Q���󂯂���";
		mes "���񂾂̂ł��B";
		next;
		mes "[�n���w�҃}����]";
		mes "�����A���̓��̓y�̓�����";
		mes "�������΂���ł͂���܂���B";
		next;
		mes "[�n���w�҃}����]";
		mes "^0000FF���炩���ׂ�";
		mes "�T�􂪑���^000000�̂ł��I";
		mes "���̎ア�n�Ղ̂�������";
		mes "�������T�􂾂炯�B";
		emotion 23;
		next;
		mes "[�n���w�҃}����]";
		mes "^0000FF�X�^�[�L�����f�B�l���x���Ă���^000000��";
		mes "�����Ă��A����ȏ�T�􂪑�������";
		mes "�ǂ��Ȃ邩�킩��܂���B";
		next;
		mes "[�n���w�҃}����]";
		mes "�ł��̂ŁA�T����C��";
		mes "�����S���ɕK�v�Ȏd���c�c�B";
		mes "�������A�l���͏�ɕs���B";
		mes "������W���Ȃ̂ł��B";
		next;
		mes "[�n���w�҃}����]";
		mes "���Ȃ����T����C��";
		mes "�����󂯂Ă���܂��񂩁H";
		next;
		if(select("�T��̕�C����`��","�܂��̋@��ɂ��܂�") == 2) {
			mes "[�n���w�҃}����]";
			mes "�����ł����B";
			mes "�ł́A�s���̗ǂ����ɐ���";
			mes "��낵�����肢���܂��B";
			emotion 14;
			close;
		}
		mes "[�n���w�҃}����]";
		mes "�{���ł����I";
		mes "�������A���肪�����ł�!!";
		mes "���Ȃ��̂悤�ȕ�d������";
		mes "�M�S�Ȏ�҂�����Ƃ������Ƃ�";
		mes "�ƂĂ����ꂵ���ł�!!";
		emotion 28;
		next;
		mes "[�n���w�҃}����]";
		mes "�ł́A�P�͋}���I";
		mes "����^6666cc����o�u^000000��";
		mes "�������󂯂Ă��������B";
		mes "�������o�āA^6666cc�E���ɂ��镔��^000000��";
		mes "�o�u�͂��܂�����B";
		set MAL_1QUE,16;
		chgquest 71700,11221;
		close;
	case 16:
		mes "[�n���w�҃}����]";
		mes "�T����C�̎d����";
		mes "�����󂯂Ă����";
		mes "���肪�Ƃ��������܂��B";
		mes "�M�S�Ȏ�҂�����Ƃ������Ƃ�";
		mes "�ƂĂ����ꂵ���ł�!!";
		emotion 28;
		next;
		mes "[�n���w�҃}����]";
		mes "�ł́A�P�͋}���I";
		mes "����^6666cc����o�u^000000��";
		mes "�������󂯂Ă��������B";
		mes "�������o�āA^6666cc�E���ɂ��镔��^000000��";
		mes "�o�u�͂��܂�����B";
		close;
	case 17:
	case 18:
		mes "[�n���w�҃}����]";
		mes "�T����C�̎d����";
		mes "�������ł��H";
		mes "���肪�����ł����A";
		mes "���N�ɂЂт��ق�";
		mes "�����͂��Ȃ��ł��������ˁB";
		close;
	case 19:
		mes "[�n���w�҃}����]";
		mes "�M�S�ɋT����C��";
		mes "���Ă����������݂����ł��ˁB";
		mes "�o�u���������Ă��܂�����B";
		emotion 21;
		next;
		mes "[����w�҃f�{��]";
		mes "�������c�c�}�������m�̂悤��";
		mes "�������ڂɌ����鐬�ʂ�";
		mes "��������΂����̂�!!";
		emotion 28,"����w�҃f�{��#mal";
		next;
		mes "[�n���w�҃}����]";
		mes "�f�{�����m�I";
		mes "�����������Ⴂ�܂����I";
		mes "����ȕ��ɍl���Ă͂����܂���B";
		emotion 23;
		next;
		mes "[�n���w�҃}����]";
		mes "�f�{�����m���q�g�f�ꌤ����";
		mes "�ǂꂾ���s�����Ă��邩";
		mes "�F�킩���Ă��܂���I";
		next;
		if(!checkweight(12636,20)) {
			mes "[�n���w�҃}����]";
			mes "�ł́A����ɂ�����c�c����B";
			mes "�ו��������ς��̂悤�ł��B";
			mes "�ו��ɋ󂫂�����Ă���";
			mes "�܂����������Ă��������B";
			close;
		}
		mes "[�n���w�҃}����]";
		mes "���āA���肪�Ƃ��������܂����B";
		mes "������͂���ɂȂ�܂��B";
		mes "��낵�����";
		mes "�f�{�����m�������Ă���悤";
		mes "�Ȃ̂Ŏ�`���Ă����Ă��������B";
		chgquest 11224,11225;
		set MAL_1QUE,20;
		getitem 12636,20;
		if(checkre()) {
			for(set '@i,0;'@i<8;set '@i,'@i+1)
				getexp 5000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,5000;
		}
		else {
			for(set '@i,0;'@i<8;set '@i,'@i+1)
				getexp 50000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,50000;
		}
		close;
	default:
		if(MAL_1QUE < 20) {
			mes "[�n���w�҃}����]";
			mes "�u���N�͏��X�����z�ł����A";
			mes "�e�F�s�҂ŕ]���̗ǂ��q�ł��B";
			emotion 18;
			next;
			mes "[�n���w�҃}����]";
			mes "���i�͕���̃��J�������";
			mes "�ƋƂ̎�`�������Ă��܂���";
			mes "���̋T����肪�������Ă����";
			mes "�M�S�ɉ�������l���Ă���Ă��܂��B";
			close;
		}
		if(MAL_1QUE < 36) {
			mes "[�n���w�҃}����]";
			mes "�T����C�̐l���";
			mes "�����s�����Ă��܂��B";
			mes "�ǂ�������`�����c�c������";
			mes "����炨�Z�����悤�ł��ˁB";
			mes "���肷���̍ۂɂ�";
			mes "���񂨎�`�����肢���܂��B";
			close;
		}
		switch(checkquest(11243)^0x4) {
		case 1:
			mes "[�n���w�҃}����]";
			mes "���������܂�";
			mes "�����̂Ƃ����";
			mes "�l�����m�ۂł��܂����B";
			mes "�ł����A��X�l��͕s�����Ă��܂��B";
			mes "����܂���`���Ă��������B";
			close;
		case 3:
			delquest 11243;
			break;
		}
		if(checkquest(11242)) {
			mes "[�n���w�҃}����]";
			mes "�M�S�ɋT����C��";
			mes "���Ă����������݂����ł��ˁB";
			mes "�o�u���������Ă��܂�����B";
			mes "�܂��d�����󂯂Ă��������";
			mes "���肪�����ł��B";
			next;
			mes "[�n���w�҃}����]";
			mes "���āA���肪�Ƃ��������܂����B";
			mes "������͂���ɂȂ�܂��B";
			mes "�܂������`���Ă��������B";
			delitem 6434,1;
			chgquest 11242,11243;
			getitem 12636,30;
			if(checkre()) {
				for(set '@i,0;'@i<2;set '@i,'@i+1)
					getexp 5000,0;
				getexp 0,4000;
			}
			else {
				for(set '@i,0;'@i<2;set '@i,'@i+1)
					getexp 50000,0;
				getexp 0,40000;
			}
			close;
		}
		mes "[�n���w�҃}����]";
		mes "�T��̕�C�ł����A";
		mes "�{���\�肵�Ă����H���܂�";
		mes "�i��ł��Ȃ��悤�ł��B";
		mes "�����͐l���̕s���A�ł��B";
		next;
		mes "[�n���w�҃}����]";
		mes "�{���̎Q����";
		mes "���肢�ł��܂���ł��傤���H";
		next;
		if(select("�T��̕�C����`��","���͂������") == 2) {
			mes "[�n���w�҃}����]";
			mes "�����ł����A�c�O�ł��c�c�B";
			mes "���̋@��ɂ͎󂯂Ă��������";
			mes "���肪�����ł��B";
			close;
		}
		if(checkquest(11240)) {
			mes "[�n���w�҃}����]";
			mes "�T����C�̏ڍׂ�";
			mes "^6666cc����o�u^000000�ɕ����Ă��������B";
			mes "�������o�āA^6666cc�E���ɂ��镔��^000000��";
			mes "�o�u�͂��܂�����B";
			close;
		}
		mes "[�n���w�҃}����]";
		mes "�T����C�̎d����";
		mes "�����󂯂Ă����";
		mes "���肪�Ƃ��������܂��B";
		mes "�M�S�Ȏ�҂�����Ƃ������Ƃ�";
		mes "�ƂĂ����ꂵ���ł�!!";
		next;
		mes "[�n���w�҃}����]";
		mes "�ł́A�P�͋}���I";
		mes "����^6666cc����o�u^000000��";
		mes "�������󂯂Ă��������B";
		mes "�������o�āA^6666cc�E���ɂ��镔��^000000��";
		mes "�o�u�͂��܂�����B";
		setquest 11240;
		close;
	}
}

mal_in02.gat,181,55,3	script	�u��#mal	545,{
	switch(MAL_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		mes "[�u��]";
		mes "�c�c���܂�";
		mes "�ނ��΂Ȃ������Ă�";
		mes "���傤���傤����Ȃ���B";
		mes "�͂��҂傤�ɁA�W�����Ă�B";
		close;
	case 8:
		mes "[�u��]";
		mes "�c�c���������̂�";
		mes "�{�N�̈ӌ���";
		mes "���炽�߂Ăׂ̂܂��B";
		next;
		mes "[�u��]";
		mes "���̃}��������";
		mes "�X�^�[�L�����f�B�l��";
		mes "�������Ă���Ă��邩��";
		mes "���܂̂������������ĂĂ��܂��B";
		next;
		mes "[�u��]";
		mes "�����ǁA�X�^�[�L�����f�B�l��";
		mes "���܂ł������ɂ��Ă����Ƃ�";
		mes "������܂���B";
		next;
		mes "[�u��]";
		mes "�X�^�[�L�����f�B�l��";
		mes "�Ȃɂ��������Ă���̂�";
		mes "�{�N�����ɂ͂킩��Ȃ��񂾂���B";
		next;
		mes "[�W��c��]";
		mes "���̂��ƂɊւ��Ắ`";
		mes "�f�{�����m�̌������ʂ�";
		mes "���҂��邵���c�c�B";
		next;
		mes "[�u��]";
		mes "���ꂢ�����̑΍��";
		mes "�Ȃ���ł���!?";
		mes "���ʂ��܂����Ȃ�āI";
		next;
		mes "[�n���w�҃}����]";
		mes "���̂Ƃ���A����܂���B";
		mes "�X�^�[�L�����f�B�l��";
		mes "�x���Ȃ��Ă����v�Ȃ悤��";
		mes "����̎x�������Ă悤��";
		mes "�l�������Ƃ�����܂����B";
		next;
		mes "[�n���w�҃}����]";
		mes "�������A���ʂ́c�c�B";
		mes "�X�^�[�L�����f�B�l��";
		mes "�����������r�[�A";
		mes "�F������������̂��̒n�k�������c�c";
		mes "��������̂����傫�ȋT��";
		mes "�o���Ă��܂����̂ł��B";
		next;
		mes "[�n���w�҃}����]";
		mes "���̓��͓y�����炩�������łȂ�";
		mes "�n���ɑ傫�ȋ󓴂�";
		mes "���݂��Ă��܂��B";
		next;
		mes "[�n���w�҃}����]";
		mes "����Ȃ��Ƃ�������";
		mes "���̓�����������̂�";
		mes "���������̂ł��B";
		next;
		mes "[�u��]";
		mes "�c�c�B";
		next;
		mes "[�V�����G��]";
		mes "���炵�܂��B";
		mes "���J���ƃc�i��";
		mes "�����Ă��܂����I";
		next;
		mes "[�W��c��]";
		mes "�������I";
		mes "���傤�ǂ����ł��`�B";
		mes "������ŋx�e�������܂��傤�`�B";
		chgquest 11214,11215;
		set MAL_1QUE,9;
		close;
	case 9:
		mes "[�u��]";
		mes "�ȂɁH";
		next;
		if(select("��������̉���ɂ���","�Ȃ�ł�����܂���") == 2) {
			mes "[�u��]";
			mes "�c�c�B";
			close;
		}
		mes "[�u��]";
		mes "��������̂��ƁH";
		mes "�c�c��������̓��J�����Ă�����";
		mes "���̓��ŐV�N�Ȏ���";
		mes "���H����ЂƂ���B";
		next;
		mes "[�u��]";
		mes "���̂������A";
		mes "�n�k�ł������P�K���Ă��܂����񂾁B";
		mes "������{�N���A";
		mes "��������̑㗝�����Ă�񂾁B";
		next;
		mes "[�u��]";
		mes "�P�K�̂����ł�������̎d����";
		mes "���܂��i��ł��Ȃ��݂����ŁB";
		mes "�͂��`�B�n�k�����Ȃ���΁c�c�B";
		next;
		mes "[�u��]";
		mes "��������̎d������`����������";
		mes "���͓��̋T������";
		mes "�͂₭�Ȃ�Ƃ����������c�c�B";
		next;
		mes "[�u��]";
		mes "�˂��A������Ƃ��������";
		mes "�d���̂悤�������Ă��Ă���Ȃ��H";
		mes "���܂�^6666cc���ɂ����^000000�ɂ��邩��B";
		chgquest 11215,11216;
		set MAL_1QUE,10;
		close;
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[�u��]";
		mes "���������";
		mes "���܂�^6666cc���ɂ����^000000�ɂ����B";
		close;
	case 14:
		mes "[�u��]";
		mes "�}�������m�I";
		mes "�{�N���T����C��";
		mes "���񂩂������ł��I";
		next;
		mes "[�n���w�҃}����]";
		mes "�C�����͂��ꂵ���ł���";
		mes "�u���N�͍��A";
		mes "��ςł��傤�H";
		mes "���J�����񂪉��������āc�c�B";
		next;
		mes "[�n���w�҃}����]";
		mes "�V�N�Ȏ��̉��H���Ƃ�";
		mes "���ɂƂ��Ă������Ȃ����̂ł��B";
		mes "���������`���Ă����Ă��������B";
		next;
		mes "[�u��]";
		mes "�c�c�B";
		next;
		mes "[�n���w�҃}����]";
		mes "�����炪������������";
		mes "�T����C�́A";
		mes "���̕�����";
		mes "���肢���������炢�Ȃ�ł�����B";
		next;
		mes "[�n���w�҃}����]";
		mes "��������";
		mes "��a�̑I�������Ă��Ƃ�";
		mes "�킩���Ă��������B";
		next;
		mes "[�u��]";
		mes "�c�c�͂��B";
		next;
		mes "[�u��]";
		mes "�\�\������A���̂܂�!?";
		next;
		mes "[�u��]";
		mes "��������̎d����";
		mes "��`���Ă��ꂽ�񂾂ˁB";
		mes "�c�c���肪�Ƃ��B";
		next;
		mes "[�u��]";
		mes "���܂͋T��̂��񂾂����C�ɂȂ邯��";
		mes "�}�������m�ɂ���������ꂽ��";
		mes "�{�N����������̎�`����";
		mes "����΂邱�Ƃɂ��܂��B";
		next;
		mes "[�u��]";
		mes "�˂��c�c���̂��A";
		mes "�c�c�B";
		mes "����ς�Ȃ�ł��Ȃ��B";
		chgquest 11220,71700;
		set MAL_1QUE,15;
		close;
	default:
		mes "[�u��]";
		mes "�c�c�B";
		mes "�@";
		mes "�]�����Ԃ�Ɩ����Ȃ悤���]";
		close;
	}
}

mal_in02.gat,140,94,0	script	�o�u	553,{
	if(MAL_1QUE == 16 || checkquest(11240)) {
		mes "[�o�u]";
		mes "�����܂��̓��������I";
		mes "�ځ[���͂ɂႠ�ɂ�ɂ�I";
		mes "������������";
		mes "�ǂ����������Ă那�`��";
		emotion 2;
		next;
		mes "[�o�u]";
		mes "�I";
		mes "�@";
		mes "���A�����Ă܂����c�c�H";
		mes "�����Ă܂�����!?";
		mes "���킠�����c�c�B";
		emotion 23;
		next;
		mes "[�o�u]";
		mes "�c�c�����A������";
		mes "�ڂ��̂Ƃ���ɗ������Ă��Ƃ�";
		mes "�T��̕�C��";
		mes "����Ă������Ă��Ƃ�";
		mes "�����Ă܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�o�u]";
			mes "���A�����ł����c�c�B";
			mes "�@";
			mes "�Ƃ������Ƃ�";
			mes "�ڂ��̉̂�";
			mes "�����ꑹ�Ƃ������Ƃł��ˁH";
			next;
			mes "[�o�u]";
			mes "�������c�c�B";
			emotion 57;
			close;
		}
		mes "[�o�u]";
		mes "�킟�������I";
		mes "�{���ł����{���ł����I";
		mes "���肪�Ƃ��������܂�!!";
		emotion 15;
		next;
		mes "[�o�u]";
		mes "��C�l��������Ȃ���";
		mes "�r���ɂ���Ă�����ł��I";
		mes "���肪�Ƃ��������܂��I";
		emotion 15;
		next;
		menu "��������",-;
		mes "[�o�u]";
		mes "�ł́A�d���̐�����";
		mes "�����Ă��������܂��ˁB";
		next;
		mes "[�o�u]";
		mes "�Ƃ����Ă�";
		mes "�T��̕�C�͊ȒP�ł��I";
		mes "^0000FF�C���p�L�b�g^000000�������";
		mes "������ł�����I";
		next;
		mes "[�o�u]";
		mes "�D�F�Ɣ��F�A";
		mes "2��ނ̔S�y�������Ăӂ����A";
		mes "�X�e�[�v���[�ŌŒ肵�Ă��������B";
		next;
		mes "[�o�u]";
		mes "���Ȃ݂ɁA�T�􂪌������ꏊ����";
		mes "���S�ɌŒ肳��Ȃ���������̂�";
		mes "���̎��͕ʂ̏ꏊ��T���Ă��������`�B";
		next;
		if(!checkweight(6434,1)) {
			mes "[�o�u]";
			mes "����A�A�C�e���������ς��̂悤�ł��B";
			mes "�ו������炵�Ă���";
			mes "�܂����������Ă��������B";
			close;
		}
		mes "[�o�u]";
		mes "���A���ƁI";
		mes "^0000FF�T����ӂł�";
		mes "�����Ȃ��悤�C��t���Ă���������^000000�I";
		mes "���܂Ƀ����X�^�[�̂���_���W������";
		mes "�����Ă��܂��l�������ł���`�B";
		if(MAL_1QUE == 16) {
			chgquest 11221,11222;
			set MAL_1QUE,17;
		}
		else
			chgquest 11240,11241;
		getitem 6434,1;
		close;
	}
	else if(MAL_1QUE == 17 || checkquest(11241)) {
		if(!checkitemblank()) {
			mes "[�o�u]";
			mes "����A�A�C�e���������ς��̂悤�ł��B";
			mes "�ו������炵�Ă���";
			mes "�܂����������Ă��������B";
			close;
		}
		mes "[�o�u]";
		mes "�T��̕�C�͊ȒP�ł��I";
		mes "^0000FF�C���p�L�b�g^000000�������";
		mes "������ł�����I";
		if(countitem(6434) == 0)
			getitem 6434,1;
		next;
		mes "[�o�u]";
		mes "�D�F�Ɣ��F�A";
		mes "2��ނ̔S�y�������Ăӂ����A";
		mes "�X�e�[�v���[�ŌŒ肵�Ă��������B";
		next;
		mes "[�o�u]";
		mes "���Ȃ݂ɁA�T�􂪌������ꏊ����";
		mes "���S�ɌŒ肳��Ȃ���������̂�";
		mes "���̎��͕ʂ̏ꏊ��T���Ă��������`�B";
		next;
		mes "[�o�u]";
		mes "���A���ƁI";
		mes "^0000FF�T����ӂł�";
		mes "�����Ȃ��悤�C��t���Ă���������^000000�I";
		mes "���܂Ƀ����X�^�[�̂���_���W������";
		mes "�����Ă��܂��l�������ł���`�B";
		close;
	}
	else if(MAL_1QUE == 18) {
		mes "[�o�u]";
		mes "�����Șr�O�ł��I";
		mes "�����ɋT����ǂ��ł��������܂����ˁI";
		emotion 21;
		next;
		mes "[�o�u]";
		mes "�K�؂ȗʂ̐ڒ��I";
		mes "���傤�Ǘǂ������̃X�e�[�v���[!!";
		next;
		mes "[�o�u]";
		mes "�����I";
		mes "�_��I";
		mes "�Ռ��ł��I";
		emotion 23;
		next;
		mes "[�o�u]";
		mes "�{���ɂ����l�ł����I";
		mes "���Ȃ��̂��Ƃ�";
		mes "�}�������m�ɂ��������";
		mes "�񍐂��Ă����܂�!!";
		delitem 6434,1;
		chgquest 11223,11224;
		set MAL_1QUE,19;
		close;
	}
	mes "[�o�u]";
	mes "�����܂��̓��������I";
	mes "�ځ[���͂ɂႠ�ɂ�ɂ�I";
	mes "������������";
	mes "�ǂ����������Ă那�`��";
	emotion 2;
	close;
}

malangdo.gat,114,157,0	script	�T��#mal1	550,{
	if(MAL_1QUE == 17 || checkquest(11241)) {
		if(!countitem(6434)) {
			mes "�]�T��̏C���ɂ�";
			mes "�@^FF0000�C���p�L�b�g^000000���K�v���]";
			close;
		}
		if(rand(5) == 0) {
			mes "�]���ꂽ�������傫���a��";
			mes "�@�Ώ�����Ԃ��Ȃ�";
			mes "�@�T��ɋz�����܂�Ă��܂����]";
			close2;
			warp "mal_dun01.gat",36,232;
			end;
		}
		mes "�]�n�ʂ��傫������Ă���B";
		mes "�@�T����C�����悤�]";
		next;
		switch(select("�ق���T��ɉ�������","�Ȃ܂����T��ɋl�߂�","�C���p�L�b�g�̔S�y��h�肱��")) {
		case 1:
			mes "�]�܂�܂�Ƒ������ق��";
			mes "�@�T��ɉ������񂾁B";
			mes "�@�ق�͋T��̒��ɗ����Ă������B";
			mes "�@�Ӗ��̂Ȃ����Ƃ������悤���c�c-";
			close;
		case 2:
			mes "�]�ʂ�ʂ�Ƃ����Ȃ܂���";
			mes "�@�T��ɉ������񂾁B";
			mes "�@�Ȃ܂��͋T��̒��ɗ����Ă������B";
			mes "�@�肪�ʂ�ʂ邷�邾����";
			mes "�@�������Ƃ͂Ȃ������c�c-";
			close;
		case 3:
			break;
		}
		mes "�]2��ނ̔S�y��";
		mes "�@�悭�܂��āA�T��ɓh�肱�񂾁]";
		next;
		menu "�C���p�L�b�g�̃X�e�[�v���[�ŌŒ肷��",-;
		mes "�]����ڂ��X�e�[�v���[��";
		mes "�@�ӂ����A�Œ肵���]";
		next;
		hideonnpc;
		donpcevent "hide_timer2#" + strnpcinfo(2) + "::OnEvent";
		if(rand(5) > 0) {
			mes "�]�������A���S�ɂ�";
			mes "�@�Œ肳��Ȃ������]";
			next;
			mes "�]���̋T���";
			mes "�@�C�����悤�]";
			close;
		}
		mes "�]����ł��̊���ڕ�����";
		mes "�@���v���낤�]";
		next;
		mes "�]���ɏC������ӏ��͂Ȃ��悤���B";
		mes "�@�߂��ĕ񍐂��悤�]";
		if(MAL_1QUE == 17) {
			chgquest 11222,11223;
			set MAL_1QUE,18;
		}
		else
			chgquest 11241,11242;
		close;
	}
	mes "�]�n�ʂɂ������T�􂪑����Ă���B";
	mes "�@�C����Ǝ҂�";
	mes "�@���ς�炸�s�����Ă���悤���]";
	close;
}

malangdo.gat,114,157,0	script	hide_timer2#mal1	-1,{
OnEvent:
	initnpctimer;
	end;
OnTimer10000:
	stopnpctimer;
	hideoffnpc "�T��#" + strnpcinfo(2);
	end;
}

malangdo.gat,284,237,0	duplicate(�T��#mal1)	�T��#mal2	550
malangdo.gat,284,237,0	duplicate(hide_timer2#mal1)	hide_timer2#mal2	-1
malangdo.gat,134,150,0	duplicate(�T��#mal1)	�T��#mal3	550
malangdo.gat,134,150,0	duplicate(hide_timer2#mal1)	hide_timer2#mal3	-1
malangdo.gat,173,199,0	duplicate(�T��#mal1)	�T��#mal4	550
malangdo.gat,173,199,0	duplicate(hide_timer2#mal1)	hide_timer2#mal4	-1
malangdo.gat,233,197,0	duplicate(�T��#mal1)	�T��#mal5	550
malangdo.gat,233,197,0	duplicate(hide_timer2#mal1)	hide_timer2#mal5	-1
malangdo.gat,137,239,0	duplicate(�T��#mal1)	�T��#mal6	550
malangdo.gat,137,239,0	duplicate(hide_timer2#mal1)	hide_timer2#mal6	-1
malangdo.gat,239,157,0	duplicate(�T��#mal1)	�T��#mal7	550
malangdo.gat,239,157,0	duplicate(hide_timer2#mal1)	hide_timer2#mal7	-1
malangdo.gat,221,155,0	duplicate(�T��#mal1)	�T��#mal8	550
malangdo.gat,221,155,0	duplicate(hide_timer2#mal1)	hide_timer2#mal8	-1
malangdo.gat,217,109,0	duplicate(�T��#mal1)	�T��#mal9	550
malangdo.gat,217,109,0	duplicate(hide_timer2#mal1)	hide_timer2#mal9	-1
malangdo.gat,162,183,0	duplicate(�T��#mal1)	�T��#mal10	550
malangdo.gat,162,183,0	duplicate(hide_timer2#mal1)	hide_timer2#mal10	-1

mal_in01.gat,114,169,5	script	���J��#mal	547,{
	if(MAL_1QUE < 10) {
		mes "[���J��]";
		mes "���[���������[�B";
		mes "���������[�[�[�B";
		emotion 45;
		close;
	}
	switch(MAL_1QUE) {
	case 10:
		mes "[���J��]";
		mes "���[���������[�B";
		mes "���������[�[�[�B";
		emotion 45;
		next;
		mes "[���J��]";
		mes "�Q�Ă��邾���ł�";
		mes "�h�����܂������Ȃ��I";
		mes "�͂₭���Ȃ���Ȃ����ȁ[�B";
		mes "�Ȃ����ā[�[�[�B";
		emotion 45;
		next;
		menu "�u���N�̂�������ł����H",-;
		mes "[���J��]";
		mes "�����";
		mes "���A�N��!!";
		mes "���̊ԂɉƂ̒��ɁI";
		emotion 23;
		next;
		menu "�u���̂��Ƃ�b��",-;
		mes "[���J��]";
		mes "�ق��I�@�u������b�𕷂������B";
		mes "�Ȃ�قǁI";
		mes "�Ȃ�Θb���Ă����悤�B";
		emotion 52;
		next;
		mes "[���J��]";
		mes "����^FF0000�V�N�Ȏ�^000000�Ƃ������̂�";
		mes "���H����d��������Ă���񂾁B";
		next;
		mes "[���J��]";
		mes "�܂��A�V�N�Ȏ���";
		mes "�䂪�̋��ł͂ǂ��ɂł�������";
		mes "�債�����̂ł͂Ȃ������񂾁B";
		next;
		mes "[���J��]";
		mes "�����A�q�C�͒���������ˁB";
		mes "���������A�������ƖO���邵";
		mes "�C���]���ŐH�ׂ鎖���ł���悤��";
		mes "�D�ɂ͂�������ς�ł������񂾂�B";
		next;
		mes "[���J��]";
		mes "������q�C���ɁA�܂Ԃ����M����";
		mes "���Ɍ��ꂽ�􂯖ڂɋz�����܂�āA";
		mes "���̓��̒��S�ɋ󂩂痎����悤��";
		mes "�Y�������킯�Ȃ񂾂���";
		mes "���̎��A�܂Ƃ܂��Ă������̂�";
		mes "�V�N�Ȏ������łˁB";
		next;
		mes "[���J��]";
		mes "�d���Ȃ��Ƃ����������";
		mes "�V�N�Ȏ���";
		mes "�������n�߂��񂾁B";
		next;
		mes "[���J��]";
		mes "�Ƃ��낪��!!";
		mes "���ꂪ����锄���I";
		next;
		mes "[���J��]";
		mes "�ǂ����C�O�h���V���̎����Ă���";
		mes "�l�Ԃ��d�󂵂Ă���A�C�e����";
		mes "���Ă���炵���ĂˁB";
		mes "�����ɕi�؂���N�����ق�";
		mes "���ꂽ�񂾁I";
		next;
		mes "[���J��]";
		mes "�����Ŏ��͍l�����񂾂�I";
		mes "�V�N�Ȏ���";
		mes "���̂܂܂���Ȃ�";
		mes "����ɗL�v�ȏ��i�ɉ��H����";
		mes "����o�����Ƃɂ����̂��B";
		next;
		mes "[���J��]";
		mes "���Ƃ��΁A";
		mes "^0000FF���������āA������^000000������Ƃ��ˁB";
		next;
		mes "[���J��]";
		mes "�������ď������n�߂�";
		mes "�����A����o�����I";
		mes "�Ƃ������Ɂc�c�B";
		next;
		mes "[���J��]";
		mes "��������Ă��܂����̂��I";
		mes "�����[�[�[����!!!!";
		emotion 23;
		next;
		mes "[���J��]";
		mes "���������킯�ŏ����̏�����";
		mes "�����Ԓx�ꂪ�������Ă�񂾁B";
		mes "�c�c������ƌN";
		mes "��`���Ă���Ȃ��H";
		next;
		if(select("��`��","��`��Ȃ�") == 2) {
			mes "[���J��]";
			mes "�������[�B";
			mes "�c�O���ȁ[�B";
			mes "��`���Ă����Ȃ�";
			mes "����������ł���̂Ɂc�c�B";
			mes "���[�c�O���ȁ[�B";
			close;
		}
		mes "[���J��]";
		mes "�������I�������Ȃ�����I";
		mes "�N�Ƃ͍��������Ζʂ�����";
		mes "�N�Ȃ炻�������Ă�����";
		mes "�v������!!";
		next;
		mes "[���J��]";
		mes "�ł́A�����������H�ɓ��邽�߂�";
		mes "�V�N�Ȏ������n���Ă���I";
		mes "���n�͊ȒP�B";
		mes "�n�ʂ��@��Ώo�Ă��邩��I";
		next;
		menu "�@��!?",-;
		mes "[���J��]";
		mes "��H";
		mes "�Ȃɂ������������Ƃ��邩���H";
		next;
		menu "���͖؂ɂȂ�̂ł́c�c",-;
		mes "[���J��]";
		mes "�ւ��[�B";
		mes "�����Ȃ́H";
		mes "�������͂���^6666cc�n�ʂ��@���Ă�^000000��B";
		emotion 23;
		next;
		mes "[���J��]";
		mes "�܂��A�����������Ƃ�����";
		mes "�V�N�Ȏ��A";
		mes "3�����Ă��Ă���B";
		mes "���H����ɂ͈�x��";
		mes "3�K�v�Ȃ񂾁B";
		chgquest 11216,11217;
		set MAL_1QUE,11;
		close;
	case 11:
		if(countitem(6435) < 3) {
			mes "[���J��]";
			mes "�V�N�Ȏ��A";
			mes "3�����Ă��Ă����B";
			mes "���H����ɂ͈�x��";
			mes "3�K�v�Ȃ񂾁B";
			close;
		}
		mes "[���J��]";
		mes "�������I";
		mes "�܂������V�N�Ȏ����ˁB";
		mes "�ł͂����������H���悤���B";
		mes "���������ɂ���@�B��";
		mes "��������Ă���B";
		chgquest 11217,11218;
		set MAL_1QUE,12;
		close;
	case 12:
		mes "[���J��]";
		mes "�������I";
		mes "�܂������V�N�Ȏ����ˁB";
		mes "�ł͂����������H���悤���B";
		mes "���������ɂ���@�B��";
		mes "��������Ă���B";
		close;
	case 13:
		mes "[���J��]";
		mes "����[�A��`���Ă���Ă��肪�Ƃ��B";
		mes "�N�̂������ň�C�ɂ͂��ǂ���";
		mes "�x�ꂪ�������ꂽ��B";
		mes "����ő��q����낱�ԂˁB";
		next;
		mes "[���J��]";
		mes "���q�́A���ɔ������Ă�";
		mes "�T��̂��Ƃ�";
		mes "�C�ɂ����Ă���悤�Ȃ񂾁B";
		next;
		mes "[���J��]";
		mes "�C�����͂킩�邪";
		mes "�������Ă΂����";
		mes "�}�������m�ɖ��f��";
		mes "�����ĂȂ���΂������ǁB";
		next;
		if(!checkweight(12636,20)) {
			mes "[���J��]";
			mes "�悵�A����͂���c�c����B";
			mes "�ו��������ς����ȁB";
			mes "�ו��ɋ󂫂�����Ă܂����Ă���B";
			close;
		}
		mes "[���J��]";
		mes "�܂��A�������q������������";
		mes "��낵�����ނ�B";
		mes "�����q�Ȃ񂾁B";
		mes "�悵�A����͂��炾�B";
		mes "�܂������`���Ă���B";
		getitem 12636,20;
		chgquest 11219,11220;
		set MAL_1QUE,14;
		if(checkre()) {
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 5000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,5000;
		}
		else {
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 50000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,50000;
		}
		close;
	case 14:
		mes "[���J��]";
		mes "���q�́A���ɔ������Ă�";
		mes "�T��̂��Ƃ�";
		mes "�C�ɂ����Ă���悤�Ȃ񂾁B";
		next;
		mes "[���J��]";
		mes "�C�����͂킩�邪";
		mes "�������Ă΂����";
		mes "�}�������m�ɖ��f��";
		mes "�����ĂȂ���΂������ǁB";
		next;
		mes "[���J��]";
		mes "�܂��A�������q������������";
		mes "��낵�����ނ�B";
		mes "�����q�Ȃ񂾁B";
		close;
	default:
		if(MAL_1QUE < 36) {
			mes "[���J��]";
			mes "���[���������[�B";
			mes "���B�N���B";
			mes "�悵�A�V�N�Ȏ��W�߂��c�c";
			mes "�Ǝv�������Z���������ȁB";
			mes "������������܂���`���Ă���B";
			close;
		}
		switch(checkquest(11239)^0x4) {
		case 1:
			mes "[���J��]";
			mes "��`���Ă����̂�";
			mes "���ꂵ���񂾂��A";
			mes "������肷���Ă�";
			mes "�Ȃ��Ȃ��Ă��܂���B";
			mes "�����A�x��ł����ŁB";
			close;
		case 3:
			delquest 11239;
			break;
		}
		if(checkquest(11238) == 0) {
			mes "[���J��]";
			mes "�܂���`���Ă����̂��H";
			next;
			if(select("������","�Ȃ�ł�����܂���") == 2) {
				mes "[���J��]";
				mes "�������[�B";
				mes "�܂��A������ɗ��Ă��ꂽ�̂��ȁB";
				close;
			}
			mes "[���J��]";
			mes "���[��A���肪�����I";
			mes "�ł͂����������ނ�B";
			mes "�V�N�Ȏ��A";
			mes "3�����Ă��Ă���B";
			mes "�n�ʂ��@��Ώo�Ă��邩��ȁB";
			setquest 11238;
			close;
		}
		if(countitem(6435) < 3) {
			mes "[���J��]";
			mes "�V�N�Ȏ��A";
			mes "���H����ɂ͈�x��";
			mes "3�K�v����B";
			close;
		}
		mes "[���J��]";
		mes "�������I";
		mes "�܂������V�N�Ȏ����ˁB";
		mes "��͂�N�͗���ɂȂ�B";
		if(!checkweight(12636,30)) {
			mes "�悵�A����͂���c�c����B";
			mes "�ו��������ς����ȁB";
			mes "�ו��ɋ󂫂�����Ă܂����Ă���B";
			close;
		}
		next;
		mes "[���J��]";
		mes "�悵�A����͂��炾�B";
		mes "�܂������`���Ă���B";
		delitem 6435,3;
		chgquest 11238,11239;
		getitem 12636,30;
		if(checkre()) {
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 5000,0;
			getexp 0,4000;
		}
		else {
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 50000,0;
			getexp 0,40000;
		}
		close;
	}
}

mal_in01.gat,116,168,0	script	�����p�@�B	563,{
	mes "�]�V�N�Ȏ���";
	mes "�@����������@�B������]";
	if(MAL_1QUE != 12 && MAL_1QUE < 36)
		close;
	next;
	if(countitem(6435) < 3) {
		mes "[���J��]";
		mes "�����������������Ȃ�A";
		mes "3���@�B�ɓ���Ă���B";
		close;
	}
	if(select("��������","����Ȃ�") == 2) {
		mes "[���J��]";
		mes "�ғ��{�^���͎���������B";
		mes "�g����������";
		mes "�����Ă���B";
		close;
	}
	mes "[���J��]";
	mes "�������҂��āI";
	mes "�{�^���͎�������!!";
	emotion 23,"���J��#mal";
	next;
	mes "�]�N���{�^�����������B";
	mes "�@�@�B���ғ�����]";
	next;
	mes "[���J��]";
	mes "��͂�����������ĂƁc�c�B";
	mes "�悤���B�����OK���I";
	delitem 6435,3;
	chgquest 11218,11219;
	set MAL_1QUE,13;
	close;
}

malangdo.gat,221,139,0	script	���������̎R#mal1	557,{
	if(MAL_1QUE != 11 && checkquest(11238) == 0) {
		mes "�]���邩���";
		mes "�@�����B�������ȍ��̎R������]";
		close;
	}
	if(rand(5) == 0) {
		if(!checkitemblank()) {
			mes "�]�A�C�e����������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(!checkweight(6435,1)) {
			mes "�]�A�C�e���̏d�ʂ��d����";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@�d�ʂ����炵�Ă���E�����]";
			close;
		}
		mes "�]���̒���";
		mes "�@�V�N�Ȏ����B����Ă����]";
		getitem 6435,1;
	}
	else {
		mes "�]���̒��Ɏ��������";
		mes "�@���������܂��Ă����悤�ȋC������B";
		mes "�@���̒��ɐV�N�Ȏ����������悤�����A";
		mes "�@���������悤���]";
		emotion 23,"";
	}
	hideonnpc;
	donpcevent "hide_timer#" + strnpcinfo(2) + "::OnEvent";
	close;
}

malangdo.gat,221,139,0	script	hide_timer#mal1	-1,{
OnEvent:
	initnpctimer;
	end;
OnTimer10000:
	stopnpctimer;
	hideoffnpc "���������̎R#" + strnpcinfo(2);
	end;
}

malangdo.gat,208,174,0	duplicate(���������̎R#mal1)	���������̎R#mal2	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal2	-1
malangdo.gat,191,223,0	duplicate(���������̎R#mal1)	���������̎R#mal3	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal3	-1
malangdo.gat,150,195,0	duplicate(���������̎R#mal1)	���������̎R#mal4	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal4	-1
malangdo.gat,116,196,0	duplicate(���������̎R#mal1)	���������̎R#mal5	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal5	-1
malangdo.gat,178,145,0	duplicate(���������̎R#mal1)	���������̎R#mal6	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal6	-1
malangdo.gat,142,120,0	duplicate(���������̎R#mal1)	���������̎R#mal7	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal7	-1
malangdo.gat,136,122,0	duplicate(���������̎R#mal1)	���������̎R#mal8	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal8	-1
malangdo.gat,152,143,0	duplicate(���������̎R#mal1)	���������̎R#mal9	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal9	-1
malangdo.gat,242,175,0	duplicate(���������̎R#mal1)	���������̎R#mal10	557
malangdo.gat,221,139,0	duplicate(hide_timer#mal1)	hide_timer#mal10	-1

mal_dun01.gat,136,120,6	script	����w�҃f�{��#mald	549,{
	end;
OnTimer60000:
	stopnpctimer;
OnInit:
	hideonnpc;
	end;
}

mal_dun01.gat,136,122,3	script	�K���p��#mal	551,{
	switch(MAL_1QUE) {
	case 22:
		mes "�]���̃q�g�f��";
		mes "�@�f�{�����m�̌����Ă���";
		mes "�@�X�^�[�L�����f�B�Ƃ̒����";
		mes "�@���Ă���K���p���Ȃ̂��낤���]";
		next;
		mes "[�K���p��]";
		mes "�͂����c�c�B";
		mes "�X�^�[�L�����f�B�l��";
		mes "�����܂ŋ]���ɂȂ��Ă���Ƃ����̂�";
		mes "������́A�ق�Ƃ��Ɂc�c�I";
		emotion 7;
		next;
		mes "[�K���p��]";
		mes "����ɂ��т��A";
		mes "����ɑ����c�c�I";
		mes "�܂������C�ɂ���Ȃ�!!";
		emotion 7;
		next;
		mes "�]�f�{�����m�̘b�Ƃ͈����";
		mes "�@�K���p���͔L�����Ɠ���";
		mes "�@���ʌ��b���Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ǂ��������Ƃ��낤���c�c�B";
		mes "�@�Ƃ肠�����A�f�{�����m��";
		mes "�@�񍐂��悤�j";
		close;
	case 23:
		mes "[�K���p��]";
		mes "�Ȃ񂾁A���O�B";
		mes "�L�Ȃ�ĘA��Ă��āI";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�킩��܂������A";
		mes "�f�{�����m�B";
		next;
		hideoffnpc "����w�҃f�{��#mald";
		initnpctimer "����w�҃f�{��#mald";
		mes "[����w�҃f�{��]";
		mes "��H";
		mes "�Ȃ�ƌ����Ă���񂾁H";
		emotion 1,"����w�҃f�{��#mald";
		next;
		mes "[�K���p��]";
		mes "�܂����I";
		mes "�Ȃ�ł킩��Ȃ��񂾁I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ʌ����";
		mes "�w�Ȃ�ł킩��Ȃ��̂��x��";
		mes "�����Ă��܂��B";
		next;
		mes "[����w�҃f�{��]";
		mes "�Ȃ�ł�����!?";
		mes "����A�������킵�ɂ�";
		mes "�܂������c�c�B";
		emotion 23,"����w�҃f�{��#mald";
		next;
		mes "[����w�҃f�{��]";
		mes "�c�c�B";
		next;
		mes "[����w�҃f�{��]";
		mes "��������������!!";
		emotion 23,"����w�҃f�{��#mald";
		next;
		mes "[�K���p��]";
		mes "�ȁA�Ȃ�!?";
		next;
		mes "[����w�҃f�{��]";
		mes "�ӓ_�ł������ɂ�I";
		mes "�킵�͎v���Ⴂ�����Ă���!!";
		emotion 23,"����w�҃f�{��#mald";
		next;
		mes "[����w�҃f�{��]";
		mes "�����ɂ͂��ꂼ��A";
		mes "���̈�Ɣ����̈悪����ɂ�B";
		next;
		mes "[����w�҃f�{��]";
		mes "�킵�����ƁA�K���p���l�A";
		mes "�X�^�[�L�����f�B�l�̂����";
		mes "�����ɂ��݂����Ă��Ȃ��̂��ɂ�!!";
		mes "�܂茾�t���킩��Ȃ��̂ł͂Ȃ��A";
		mes "�ꕔ�̐����������ĂȂ������̂ɂ�!!";
		next;
		mes "[����w�҃f�{��]";
		mes "�܂������ӓ_�B";
		mes "���ʂ������Ȃ����";
		mes "�����ƋC�Â��Ȃ������ł���ɂ�B";
		mes "����ł͂Ȃ��A���̖�肾�����̂��B";
		next;
		mes "[����w�҃f�{��]";
		mes "�������Ă�ɂ͂Ȃ��B";
		mes "�������������̕�����ς��Ȃ��ƁI";
		mes "���Ƃ͂܂�����!!";
		hideonnpc "����w�҃f�{��#mald";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�C�����Ă��c�c�I";
		next;
		mes "[����w�҃f�{��]";
		mes "���ʂ��̓K���p���l�ƑΘb�ł���I";
		mes "�ނ�̖]�ނ��Ƃ�";
		mes "������̂ł���ɂ�!!";
		chgquest 11228,11229;
		set MAL_1QUE,24;
		close;
	case 24:
		mes "[�K���p��]";
		mes "�Ȃ�Ȃ񂾁A���̔L�́c�c�I";
		mes "�܂���������Ȃ���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�K���p�������̊肢�Ƃ����Ă��c�c�B";
		mes "�@�Ƃ肠�������낢�땷���Ă݂悤�j";
		next;
		while(MAL_1QUE_SUB < 7) {
			switch(select("�X�^�[�L�����f�B�̂��Ƃ𕷂�","�K���p���̘b�𕷂�","���̘b�𕷂�")) {
			case 1:
				mes "[�K���p��]";
				mes "�X�^�[�L�����f�B�l�̖���";
				mes "�C�����ĂԂȁI";
				mes "�ޏ��͂ƂĂ��������Ȃ̂��I";
				next;
				mes "[�K���p��]";
				mes "�܂������A���ꂾ����";
				mes "���������ŉ�b�������!!";
				next;
				menu "���������H",-;
				mes "[�K���p��]";
				mes "���̂悤�ȍ��x�Ȏ푰��";
				mes "���ȂǕK�v�Ȃ��񂾁B";
				mes "���_�őΘb���\�ɂ���B";
				next;
				mes "[�K���p��]";
				mes "�����o���푰�Ȃ�";
				mes "��\�Ȃ̂��B��\�I";
				next;
				set MAL_1QUE_SUB,MAL_1QUE_SUB | 0x1;
				break;
			case 2:
				mes "[�K���p��]";
				mes "��̓X�^�[�L�����f�B�l�̕⍲�����I";
				mes "�q�g�f���̑�^�V���I";
				mes "���\�̓V�˂Ȃ̂�!!";
				emotion 52;
				next;
				mes "[�K���p��]";
				mes "�c�c�܂��A������";
				mes "������q�g�f����";
				mes "�N��肽�����m������A";
				mes "��ȂǓ������ɂ���邾�낤�ȁB";
				next;
				mes "[�K���p��]";
				mes "�X�^�[�L�����f�B�l��";
				mes "���̂悤�ȖڂɁc�c�������B";
				emotion 28;
				next;
				set MAL_1QUE_SUB,MAL_1QUE_SUB | 0x2;
				break;
			case 3:
				mes "[�K���p��]";
				mes "�c�c���͔L�̂�炪";
				mes "�䂪����ŕ����Ă��邪";
				mes "���̓��̓X�^�[�L�����f�B�l��";
				mes "�x���Ɏg���Ă����ꏊ���B";
				next;
				mes "[�K���p��]";
				mes "�X�^�[�L�����f�B�l��";
				mes "���D�����̂��������ƂɁc�c�B";
				mes "�܂�����!!";
				next;
				set MAL_1QUE_SUB,MAL_1QUE_SUB | 0x4;
				break;
			}
		}
		mes "["+strcharinfo(0)+"]";
		mes "�i����ő�̘b�͕������ȁB�j";
		chgquest 11229,11230;
		set MAL_1QUE_SUB,0;
		set MAL_1QUE,25;
		close;
	case 25:
		mes "[�K���p��]";
		mes "�c�c���܂ł����ɂ���񂾁H";
		mes "���������Ă��邾���Ȃ�";
		mes "�X�^�[�L�����f�B�l��";
		mes "���H���ł������Ă��Ă���B";
		next;
		if(select("�H���H","�ǂ����Ď������H") == 2) {
			mes "[�K���p��]";
			mes "�Ȃ�����!?";
			mes "��͂������痣����ʂ�";
			mes "���̔L�̂���";
			mes "������̌������Ƃ�";
			mes "�����ł��Ȃ����炾�I";
			next;
			mes "[�K���p��]";
			mes "�X�^�[�L�����f�B�l��";
			mes "���̓����x���Ă�����B";
			mes "����������Ȃ�";
			mes "���̂��炢�͂���Ă���B";
			close;
		}
		mes "[�K���p��]";
		mes "�X�^�[�L�����f�B�l��";
		mes "�����𓮂��Ȃ��B";
		mes "���Ƃ�����A�H����";
		mes "�����łƂ�K�v�����邾�낤�H";
		next;
		mes "[�K���p��]";
		mes "�������ȁB";
		mes "���������[���[��30��";
		mes "�����Ă��Ă���B";
		chgquest 11230,11231;
		set MAL_1QUE,26;
		close;
	case 26:
		if(countitem(12624) < 30) {
			mes "[�K���p��]";
			mes "�X�^�[�L�����f�B�l�̐H�����B";
			mes "���������[���[��30��";
			mes "�����Ă��Ă���B";
			close;
		}
		mes "[�K���p��]";
		mes "�m���ɁB";
		mes "����Ȃ�A�\�����낤�B";
		mes "���ɂ���B";
		delitem 12624,30;
		chgquest 11231,11232;
		set MAL_1QUE,27;
		next;
		mes "[�K���p��]";
		mes "�X�^�[�L�����f�B�l";
		mes "���H���ł���I";
		mes "��D���̃[���[�ł��B";
		next;
		mes "[�K���p��]";
		mes "�c�c�X�^�[�L�����f�B�l�H";
		next;
		mes "[�K���p��]";
		mes "�ǂ�����܂����H";
		mes "�H�~���Ȃ���ł����H";
		close;
	case 27:
		mes "[�K���p��]";
		mes "�����c�c��ς��I";
		mes "���̂悤�Ȓn���ɂȂǂ��邩��!!";
		next;
		menu "�ǂ������́H",-;
		mes "[�K���p��]";
		mes "����ς薳��������Ă��񂾁I";
		mes "�����Ƃ��̓���";
		mes "�x�������Ă�����A";
		mes "�����������������c�c!!";
		next;
		mes "[�K���p��]";
		mes "����!!";
		mes "����Ȃɍr����肾!!";
		mes "��΂̂悤�ɔ����������̂Ɂc�c�B";
		next;
		mes "[�K���p��]";
		mes "���ɂƂ��Ċ����͑�G�Ȃ񂾁B";
		mes "���i�͐��̒���";
		mes "��炵�Ă���킯������ȁB";
		mes "���肵����A���Ɏ���B";
		mes "�����c�c�B";
		next;
		mes "�]�X�^�[�L�����f�B�̔畆��";
		mes "�@�r�p�����n�̂悤��";
		mes "�@�Ђǂ���Ԃ��]";
		next;
		if(select("������","�����Ȃ�") == 2) {
			mes "[�K���p��]";
			mes "�����c�c�ǂ��ɂ�����";
			mes "�X�^�[�L�����f�B�l��";
			mes "�����������ɐ���^���Ȃ��Ɓc�c�B";
			close;
		}
		mes "[�K���p��]";
		mes "�{�����I";
		next;
		mes "[�K���p��]";
		mes "����Ȃ�o�P�c�ɐ��������";
		mes "�����Ă��Ăق����B";
		mes "���Ȃ�r��Ă���̂�";
		mes "������ꂽ�o�P�c���������񗊂ށI";
		next;
		mes "[�K���p��]";
		mes "�X�^�[�L�����f�B�l�̋r�I";
		mes "4���������Ɋ������Ă���悤���B";
		mes "�o�P�c��4�ȏ㏀�����Ă���I";
		next;
		mes "[�K���p��]";
		mes "���ƁA�u���V���Y����!!";
		mes "����͂�����Œ��B���Ă���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�m���i�r���̑q�ɂ�";
		mes "�|���p��������͂����B";
		next;
		mes "[�K���p��]";
		mes "���͓��̓��[�ɂ���";
		mes "�㎿�ȍ�����������ł���!!";
		mes "�X�^�[�L�����f�B�l�̂�����";
		mes "�ӂ��킵�������B";
		mes "���񂾂�!!";
		next;
		mes "[�K���p��]";
		mes "�������̃[���[��";
		mes "�ɂނƂ��������Ȃ�����";
		mes "�䂪�����������Ƃɂ��悤�B";
		chgquest 11232,11233;
		set MAL_1QUE,28;
		close;
	case 28:
		if(countitem(6433) < 1) {
			mes "[�K���p��]";
			mes "����͂ǂ������I";
			mes "�܂�����ł����肩";
			mes "�����!!";
			mes "�����p�ӂ���I";
			next;
			mes "[�K���p��]";
			mes "�o�P�c�ɐ��������";
			mes "�����Ă��Ă���I";
			mes "���ƁA�u���V���Y����!!";
			close;
		}
		if(countitem(6432) < 1) {
			mes "[�K���p��]";
			mes "�����Ă����ȁI";
			mes "���Ⴀ�A�o�P�c�ɐ�������ł����I";
			mes "�C�������A�C���B";
			next;
			mes "[�K���p��]";
			mes "���̓��[�ɂ��鍂�����|�C���g��";
			mes "���񂾐������I";
			close;
		}
		mes "[�K���p��]";
		mes "�����Ă����ȁI";
		mes "���Ⴀ�A�����������ɐ������񂾁B";
		next;
		mes "[�K���p��]";
		mes "�ڂ̑O�̈��炵���p�����łȂ��A";
		mes "���ɂ���傫�ȃq�g�f�S�̂�";
		mes "�X�^�[�L�����f�B�l�̑̂ł���B";
		next;
		mes "[�K���p��]";
		mes "�����ɂ���";
		mes "�o�T�o�T�����畆����";
		mes "�����v���ɗ��ނ��I";
		chgquest 11233,11234;
		set MAL_1QUE,29;
		close;
	case 29:
	case 30:
	case 31:
	case 32:
		mes "[�K���p��]";
		mes "�����Ă����ȁI";
		mes "���Ⴀ�A�����������ɐ������񂾁B";
		next;
		mes "[�K���p��]";
		mes "�ڂ̑O�̈��炵���p�����łȂ��A";
		mes "���ɂ���傫�ȃq�g�f�S�̂�";
		mes "�X�^�[�L�����f�B�l�̌�g�ł���B";
		next;
		mes "[�K���p��]";
		mes "�����ɂ���";
		mes "�o�T�o�T�����畆����";
		mes "�����v���ɗ��ނ��I";
		close;
	case 33:
		mes "[�K���p��]";
		mes "�����A�悩�����c�c�I";
		mes "�X�^�[�L�����f�B�l��";
		mes "�����������������ꂽ!!";
		next;
		mes "[�K���p��]";
		mes "�c�c���O�ɂ�";
		mes "���b�ɂȂ����ȁB";
		if(!checkweight(12636,120)) {
			mes "����͗�c�c�ނ�";
			mes "�ו��������ς�����Ȃ����B";
			mes "�ו��𐮗�����񂾂ȁB";
			close;
		}
		mes "����͗炾�B";
		mes "���肪�Ƃ��B";
		delitem 6431,countitem(6431);
		delitem 6432,countitem(6432);
		delitem 6433,countitem(6433);
		chgquest 11235,11236;
		set MAL_1QUE,34;
		getitem 12636,120;
		if(checkre()) {
			for(set '@i,0;'@i<10;set '@i,'@i+1)
				getexp 5000,0;
			for(set '@i,0;'@i<4;set '@i,'@i+1)
				getexp 0,5000;
		}
		else {
			for(set '@i,0;'@i<10;set '@i,'@i+1)
				getexp 50000,0;
			for(set '@i,0;'@i<4;set '@i,'@i+1)
				getexp 0,50000;
		}
		next;
		mes "[�K���p��]";
		mes "�c�c�܂��A���O��";
		mes "�𗬂��Ă�񂾁B";
		mes "�L�̂��̂��Ƃ�";
		mes "����������Ă��������ȁB";
		next;
		mes "[�K���p��]";
		mes "�킴�킴�����Ȃǂ��Ȃ��Ă�";
		mes "���O��ʂ��ĂȂ�";
		mes "�b��i�߂Ă�������";
		mes "�L�̂�ɓ`���Ă���B";
		next;
		mes "[�K���p��]";
		mes "�����A�X�^�[�L�����f�B�l��";
		mes "������������悤�Șb�͒ʂ��񂼁I";
		mes "�����Y���Ȃ�I";
		close;
	case 34:
	case 35:
		mes "[�K���p��]";
		mes "���O�ɂ͐��b�ɂȂ����ȁB";
		mes "�܂��H���̗p�ӂ�";
		mes "��`���Ă���B";
		close;
	case 36:
		switch(checkquest(11245)^0x4) {
		case 1:
			mes "[�K���p��]";
			mes "���͑��v���B";
			mes "�K�v�ɂȂ�����";
			mes "�X�^�[�L�����f�B�l��";
			mes "���������[���[�𗊂ނ��B";
			close;
		case 3:
			delquest 11245;
			break;
		}
		if(!checkquest(11244)) {
			mes "[�K���p��]";
			mes "���H���̎��Ԃ��B";
			mes "�X�^�[�L�����f�B�l��";
			mes "���������[���[�𗊂ށB";
			next;
			if(select("�킩��܂���","���͂������") == 2) {
				mes "[�K���p��]";
				mes "�Ȃ񂾂ƁI";
				mes "�����!!";
				close;
			}
			mes "[�K���p��]";
			mes "���������[���[��30��";
			mes "�����Ă��Ă���B";
			mes "�X�^�[�L�����f�B�l��";
			mes "��D���Ȃ񂾁B";
			setquest 11244;
			close;
		}
		if(countitem(12624) < 30) {
			mes "[�K���p��]";
			mes "�X�^�[�L�����f�B�l�̐H�����B";
			mes "���������[���[��30��";
			mes "�����Ă��Ă���B";
			close;
		}
		mes "[�K���p��]";
		mes "�m���ɁB";
		mes "����Ȃ�A�\�����낤�B";
		mes "���ɂ���B";
		if(!checkweight(12636,30)) {
			mes "����͗�c�c�ނ�";
			mes "�ו��������ς�����Ȃ����B";
			mes "�ו��𐮗�����񂾂ȁB";
			close;
		}
		mes "����͗炾�B";
		delitem 12624,30;
		chgquest 11244,11245;
		getitem 12636,30;
		if(checkre()) {
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 5000,0;
			getexp 0,4000;
		}
		else {
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 50000,0;
			getexp 0,40000;
		}
		next;
		mes "[�K���p��]";
		mes "�X�^�[�L�����f�B�l";
		mes "���H���ł���I";
		mes "��D���̃[���[�ł��B";
		close;
	default:
		mes "�]�����ȃq�g�f������B";
		mes "�@�ӎv�̋������Ȗڂ�";
		mes "�@���Ȃ��������]";
		close;
	}
}

mal_in02.gat,102,94,3	script	�|���p�i�S��#mal	544,{
	mes "[�|���p�i�S����]";
	mes "�|���p��K�v�ł����H";
	mes "���D���ɂǂ����ł��ɂ�I";
	next;
	switch(select("�o�P�c","�|���p�u���V","�������Ȃ�")) {
	case 1:
		set '@gain,6431;
		break;
	case 2:
		set '@gain,6433;
		break;
	case 3:
		mes "[�|���p�i�S����]";
		mes "�����p���肪�Ƃ��������܂��ɂ�I";
		close;
	}
	if(!checkitemblank()) {
		mes "[�|���p�i�S����]";
		mes "�A�C�e���̎�ސ���������";
		mes "�����Ƃ��ł��Ȃ��ł��ɂ�B";
		mes "�ו������炵�Ă���";
		mes "�܂����������Ă��������ɂ�";
		close;
	}
	if(!checkweight('@gain,1)) {
		mes "[�|���p�i�S����]";
		mes "�A�C�e���d�ʂ��d����";
		mes "�����Ƃ��ł��Ȃ��ł��ɂ�B";
		mes "�d�ʂ����炵�Ă���";
		mes "�܂����������Ă��������ɂ�B";
		close;
	}
	getitem '@gain,1;
	mes "[�|���p�i�S����]";
	mes getitemname('@gain)+ "�ł��ˁI";
	mes "�����p���肪�Ƃ��������܂��ɂ�I";
	close;
}

malangdo.gat,246,184,0	script	�������|�C���g	111,{
	mes "�]���񂾐�������]";
	next;
	if(select("��������","�������Ȃ�") == 2) {
		mes "�]�����܂肩�痣�ꂽ";
		close;
	}
	if(countitem(6431) == 0) {
		mes "�]�������ނɂ�";
		mes "�@^0000FF�o�P�c^000000���K�v���]";
		close;
	}
	if(!checkitemblank()) {
		mes "�]�A�C�e���̎�ސ���������";
		mes "�@�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���E�����]";
		close;
	}
	if(!checkweight(6432,1)) {
		mes "�]�A�C�e���d�ʂ��d����";
		mes "�@�����Ƃ��ł��Ȃ��B";
		mes "�@�d�ʂ����炵�Ă��琅���������]";
		close;
	}
	mes "�]�o�P�c�����ς��ɐ������񂾁B";
	mes "�@�ƂĂ��d���B";
	mes "�@�K���p���͂������񎝂��Ă�����";
	mes "�@�����Ă���������ő��v���낤���]";
	misceffect 211;
	delitem 6431,1;
	getitem 6432,1;
	close;
}

mal_dun01.gat,133,125,5	script	�X�^�[�L�����f�B#mal	552,{
	switch(MAL_1QUE) {
	case 21:
		mes "[�X�^�[�L�����f�B]";
		mes "�c�c�B";
		mes "�@";
		mes "�]�����͉������킸�A";
		mes "�@������������]";
		next;
		mes "[�K���p��]";
		mes "����ҁI";
		mes "����ɃX�^�[�L�����f�B�l��";
		mes "�߂Â���!!";
		next;
		mes "[�K���p��]";
		mes "�c�c��H";
		mes "�L�ł͂Ȃ��ȁB";
		mes "�N���B";
		emotion 23,"";
		next;
		mes "�]�f�{�����m�̘b�Ƃ͈����";
		mes "�@�K���p���͔L�����Ɠ���";
		mes "�@���ʌ��b���Ă���]";
		next;
		mes "[�K���p��]";
		mes "�Ȃ񂾁A�Ȃɂ������B";
		mes "��炪���t���������Ƃ�";
		mes "����Ȃɂ��������̂�!?";
		next;
		menu "����Ȃ��Ƃ́c�c",-;
		mes "[�K���p��]";
		mes "�t���c�c�B";
		mes "�Ȃ񂾁B�܂��A";
		mes "���O�͔L�̂�����";
		mes "�b���ʂ���悤���B";
		next;
		mes "[�K���p��]";
		mes "�܂�����";
		mes "������́c�c�I";
		mes "�䂪�L�̌��t��b���Ă�";
		mes "�����ł��Ȃ�������₪��I";
		next;
		mes "[�K���p��]";
		mes "���̃X�^�[�L�����f�B�l��";
		mes "�ǂ�ȂɌ�g��";
		mes "�]���ɂ���Ă��邩";
		mes "�܂������C�Â��₵�Ȃ�!!";
		emotion 7,"�K���p��#mal";
		next;
		menu "�]���H",-;
		mes "[�K���p��]";
		mes "�����炪���̓���";
		mes "�����Ă������A";
		mes "�^���ɃX�^�[�L�����f�B�l��";
		mes "�������������񂾁I";
		next;
		mes "[�K���p��]";
		mes "�����Ă��̂܂ܒn�Ղ̎ア";
		mes "���̓��������Ǝx���Ă�����I";
		mes "������̎����l���Ȃ����";
		mes "��������̂ɁI";
		emotion 7,"�K���p��#mal";
		next;
		mes "[�K���p��]";
		mes "�c�c�͂��A";
		mes "�����āA�������";
		mes "��炪�b�������Ă�";
		mes "�������邵�c�c�B";
		mes "�܂������C�ɂ���Ȃ�!!";
		emotion 7,"�K���p��#mal";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ǂ��������Ƃ��낤���c�c�B";
		mes "�@�K���p���͔L�����Ɠ����A";
		mes "�@���ʌ��b���Ă���B";
		mes "�@�Ƃ肠�����A�f�{�����m��";
		mes "�@�񍐂��悤�j";
		chgquest 11226,11227;
		set MAL_1QUE,22;
		close;
	default:
		mes "[�X�^�[�L�����f�B]";
		if(MAL_1QUE >= 34) {
			mes "�ӂӂ�";
			mes "�@";
			mes "�]�����͏��������΂񂾁]";
			cutin "ma_starcandy",2;
			close2;
			cutin "ma_starcandy",255;
			end;
		}
		mes "�c�c�B";
		mes "�@";
		mes "�]�����͉������킸�A";
		mes "�@������������]";
		close;
	}
}

mal_dun01.gat,143,137,0	script	�o�T�o�T�����畆#mal	111,{
	switch(MAL_1QUE) {
	case 29:
		if(countitem(6432) < 1 || countitem(6433) < 1) {
			mes "�]�|���p�u���V��";
			mes "�@�������ς��̃o�P�c��";
			mes "�@�K�v�ł��]";
			close;
		}
		mes "�]�o�T�o�T���Ă���畆��";
		mes "�@�����������]";
		next;
		if(select("�u���V��������","�������Ȃ�") == 2) {
			mes "�]���������͂��̂܂�";
			mes "�@�n�ʂɋz�����܂�Ă������]";
			delitem 6432,1;
			getitem 6431,1;
			close;
		}
		if(rand(5) != 0) {
			mes "�]�o�T�o�T���Ă���畆��";
			mes "�@����������";
			mes "�@�ꏊ�����u���V���������B";
			mes "�@�܂���������������Ȃ��B";
			mes "�@���̒��q�Ő��������Ă����悤�]";
			delitem 6432,1;
			getitem 6431,1;
			misceffect 109;
			close;
		}
		mes "�]�o�T�o�T���Ă���畆��";
		mes "�@����������";
		mes "�@�ꏊ�����u���V���������]";
		misceffect 109;
		next;
		delitem 6432,1;
		getitem 6431,1;
		set MAL_1QUE,30;
		if(rand(10) > 0) {
			mes "�]�o�T�o�T���Ă����畆��";
			mes "�@���邨����!!";
			mes "�@�����͂������v�������]";
			close;
		}
		else {
			mes "�]�o�T�o�T���Ă����畆��";
			mes "�@���邨�����]";
			next;
			mes "[�X�^�[�L�����f�B]";
			mes "���Ⴀ�I�@�ӂӂ�";
			mes "��������������I";
			cutin "ma_starcandy",2;
			close2;
			cutin "ma_starcandy",255;
			end;
		}
	default:
		if(MAL_1QUE >= 30) {
			mes "�]�o�T�o�T�ɂȂ����畆��";
			mes "�@���������߂����B";
			mes "�@�����͂������v�������]";
			close;
		}
		mes "�]�o�T�o�T�ɂȂ����畆��";
		mes "�@���킢�������]";
		close;
	}
}

mal_dun01.gat,131,150,0	script	�J�T�J�T�����畆#mal	111,{
	switch(MAL_1QUE) {
	case 30:
		if(countitem(6432) < 1 || countitem(6433) < 1) {
			mes "�]�|���p�u���V��";
			mes "�@�������ς��̃o�P�c��";
			mes "�@�K�v�ł��]";
			close;
		}
		mes "�]�J�T�J�T���Ă���畆��";
		mes "�@�����������]";
		next;
		if(select("�u���V��������","�������Ȃ�") == 2) {
			mes "�]���������͂��̂܂�";
			mes "�@�n�ʂɋz�����܂�Ă������]";
			delitem 6432,1;
			getitem 6431,1;
			close;
		}
		if(rand(5) != 0) {
			mes "�]�J�T�J�T���Ă���畆��";
			mes "�@����������";
			mes "�@�ꏊ�����u���V���������B";
			mes "�@�܂���������������Ȃ��B";
			mes "�@���̒��q�Ő��������Ă����悤�]";
			delitem 6432,1;
			getitem 6431,1;
			misceffect 109;
			close;
		}
		mes "�]�J�T�J�T���Ă���畆��";
		mes "�@����������";
		mes "�@�ꏊ�����u���V���������]";
		misceffect 109;
		next;
		delitem 6432,1;
		getitem 6431,1;
		set MAL_1QUE,31;
		if(rand(10) > 0) {
			mes "�]�J�T�J�T���Ă����畆��";
			mes "�@���邨����!!";
			mes "�@�����͂������v�������]";
			close;
		}
		else {
			mes "�]�J�T�J�T���Ă����畆��";
			mes "�@���邨�����]";
			next;
			mes "[�X�^�[�L�����f�B]";
			mes "�N�͖{���ɗD�����l�ԂȂ̂ˁB";
			cutin "ma_starcandy",2;
			close2;
			cutin "ma_starcandy",255;
			end;
		}
	default:
		if(MAL_1QUE >= 31) {
			mes "�]�J�T�J�T�ɂȂ����畆��";
			mes "�@���������߂����B";
			mes "�@�����͂������v�������]";
			close;
		}
		mes "�]�J�T�J�T�ɂȂ����畆��";
		mes "�@���킢�������]";
		close;
	}
}

mal_dun01.gat,116,144,0	script	���ꂽ�畆#mal	111,{
	switch(MAL_1QUE) {
	case 31:
		if(countitem(6432) < 1 || countitem(6433) < 1) {
			mes "�]�|���p�u���V��";
			mes "�@�������ς��̃o�P�c��";
			mes "�@�K�v�ł��]";
			close;
		}
		mes "�]���ꂽ�畆�ɐ����������]";
		next;
		if(select("�u���V��������","�������Ȃ�") == 2) {
			mes "�]���������͂��̂܂�";
			mes "�@�n�ʂɋz�����܂�Ă������]";
			delitem 6432,1;
			getitem 6431,1;
			close;
		}
		if(rand(5) != 0) {
			mes "�]���ꂽ�畆��";
			mes "�@����������";
			mes "�@�ꏊ�����u���V���������B";
			mes "�@�܂���������������Ȃ��B";
			mes "�@���̒��q�Ő��������Ă����悤�]";
			delitem 6432,1;
			getitem 6431,1;
			misceffect 109;
			close;
		}
		mes "�]���ꂽ�畆��";
		mes "�@����������";
		mes "�@�ꏊ�����u���V���������]";
		misceffect 109;
		next;
		delitem 6432,1;
		getitem 6431,1;
		set MAL_1QUE,32;
		if(rand(10) > 0) {
			mes "�]����Ă����畆��";
			mes "�@���邨�����B";
			mes "�@�����͂������v������-";
			close;
		}
		else {
			mes "�]����Ă����畆��";
			mes "�@���邨�����]";
			next;
			mes "[�X�^�[�L�����f�B]";
			mes "�����A�C���������c�c�B";
			mes "���܂Ŗ{���ɂ��䂩�����́B";
			cutin "ma_starcandy",2;
			next;
			cutin "ma_starcandy",255;
			mes "�]����Ă����畆��";
			mes "�@���������߂����B";
			mes "�@�����͂������v�������]";
			close;
		}
	default:
		if(MAL_1QUE >= 32) {
			mes "�]����Ă����畆��";
			mes "�@���������߂����B";
			mes "�@�����͂������v�������]";
			close;
		}
		mes "�]���ꂽ�畆��";
		mes "�@���킢�������]";
		close;
	}
}

mal_dun01.gat,120,129,0	script	�ł��畆#mal	111,{
	switch(MAL_1QUE) {
	case 32:
		if(countitem(6432) < 1 || countitem(6433) < 1) {
			mes "�]�|���p�u���V��";
			mes "�@�������ς��̃o�P�c��";
			mes "�@�K�v�ł��]";
			close;
		}
		mes "�]�ł��畆�ɐ����������]";
		next;
		if(select("�u���V��������","�������Ȃ�") == 2) {
			mes "�]���������͂��̂܂�";
			mes "�@�n�ʂɋz�����܂�Ă������]";
			delitem 6432,1;
			getitem 6431,1;
			close;
		}
		if(rand(5) != 0) {
			mes "�]�ł��畆��";
			mes "�@����������";
			mes "�@�ꏊ�����u���V���������B";
			mes "�@�܂���������������Ȃ��B";
			mes "�@���̒��q�Ő��������Ă����悤�]";
			delitem 6432,1;
			getitem 6431,1;
			misceffect 109;
			close;
		}
		mes "�]�ł��畆��";
		mes "�@����������";
		mes "�@�ꏊ�����u���V���������]";
		misceffect 109;
		next;
		delitem 6432,1;
		getitem 6431,1;
		set MAL_1QUE,33;
		chgquest 11234,11235;
		if(rand(10) > 0) {
			mes "�]�ł������畆��";
			mes "�@���邨�����B";
			mes "�@�����͂������v������-";
			close;
		}
		else {
			mes "�]�ł������畆��";
			mes "�@���邨�����]";
			next;
			mes "[�X�^�[�L�����f�B]";
			mes "�����Ȃ����Ƃ��A";
			mes "�畆�̊�������Ԃ炩�����́B";
			cutin "ma_starcandy",2;
			close2;
			cutin "ma_starcandy",255;
			end;
		}
	default:
		if(MAL_1QUE >= 33) {
			mes "�]�ł��畆��";
			mes "�@���������߂����B";
			mes "�@�����͂������v�������]";
			close;
		}
		mes "�]�ł��Ȃ����畆��";
		mes "�@���킢�������]";
		close;
	}
}

malangdo.gat,137,200,6	script	�s�s�G�[��	549,{
	switch(MAL_1QUE) {
	case 36:
		mes "[�s�s�G�[��]";
		mes "�ŋ߁A�����ɖv�����Ă���";
		mes "�g�[�}�X��ɉ���Ă��Ȃ����A";
		mes "���̕����Z�������Ă��邱�Ƃ��낤�B";
		mes "���v���낤���c�c�B";
		next;
		menu "�g�[�}�X��̎�`�������Ă��܂���",-;
		mes "[�s�s�G�[��]";
		mes "�������B";
		mes "�g�[�}�X��͂����C�̂悤���ȁB";
		mes "�悵�A��̎�`�������Ă��ꂽ";
		mes "��������悤�B";
		next;
		if(checkitemblank() < 2) {
			// ������
			mes "[�s�s�G�[��]";
			mes "���܂Ȃ��A��������Ȃ�����";
			mes "�ו��𐮗����Ă���";
			mes "�܂����Ăق����B";
			close;
		}
		mes "[�s�s�G�[��]";
		mes "���̒�ɂ́A";
		mes "�����Ŏg����҂��K�v���Ǝv���B";
		mes "�D���~�肽���������̂��Ȃ񂾂��A";
		mes "���ꂩ������̕��������Ă����Ă���B";
		mes "��낵�����ނ�B";
		set MAL_1QUE,37;
		getitem 12636,100;
		getitem 2873,1;
		delquest 71720;
		setquest 201415;
		close;
	case 37:
		mes "[�s�s�G�[��]";
		mes "���̒�ɂ́A";
		mes "�����Ŏg����҂��K�v���Ǝv���B";
		mes "�D���~�肽���������̂��Ȃ񂾂��A";
		mes "���ꂩ������̕��������Ă����Ă���B";
		mes "��낵�����ނ�B";
		close;
	default:
		mes "[�s�s�G�[��]";
		mes "�ŋ߁A�����ɖv�����Ă���";
		mes "�g�[�}�X��ɉ���Ă��Ȃ����A";
		mes "���̕����Z�������Ă��邱�Ƃ��낤�B";
		mes "���v���낤���c�c�B";
		close;
	}
}

//============================================================
// �j�����L�[�c(�s�ǖ�Ǌ���)�N�G�X�gNPC
//- Registory ------------------------------------------------
// MAL_2QUE -> 0�`12
//------------------------------------------------------------
malangdo.gat,175,206,3	script	�S�[�{��#mal	561,{
	if(BaseLevel < 60) {
		mes "[�S�[�{��]";
		mes "�c�O�����c�c";
		mes "���O�̍��̗͂ł́A";
		mes "���l�̏����ɂȂ�Ȃ����낤�B";
		mes "���Ɏc�O�����B";
		next;
		mes "�]���̃N�G�X�g��i�s����ɂ�";
		mes "�@���x���������Ȃ��悤�ł��B";
		mes "�@^FF0000Base���x��60^000000�ɂȂ�����";
		mes "�@�ēx�b�������Ă��������]";
		close;
	}
	switch(MAL_2QUE) {
	case 0:
		mes "[�S�[�{��]";
		mes "�Ȃ񂾂��O�́H";
		mes "���̉��l�ɋC��������";
		mes "������񂶂�˂��I";
		next;
		if(select("�L�������Q����ł��邯�ǁc�c�H","���A���߂�Ȃ���") == 2) {
			mes "[�S�[�{��]";
			mes "�킩������Ƃ��ƂƋ����!!";
			mes "�����I�@�܂������c�c�B";
			emotion 28;
			close;
		}
		mes "[�S�[�{��]";
		mes "�ȁc�c";
		mes "�_�A�_�W�����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A�_�W�����̂���ł́c�c";
		next;
		mes "[�S�[�{��]";
		mes "���̒��B��̕s�ǖ�ǔL�W�c�A";
		mes "^0000FF�j�����L�[�c^000000�g�b�v��";
		mes "�S�[�{���l�Ɍ������āc�c�B";
		mes "�c�c����{���Ă���킯����˂��B";
		mes "�x��������z���A���͑�D�����B";
		mes "�t�t�t�c�c������Ɩʔ����������ȁB";
		emotion 29;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�B";
		mes "�i�Ȃ񂾂��ƂĂ��p���������c�c�j";
		next;
		mes "[�S�[�{��]";
		mes "���O�̂��̓x���A";
		mes "�C�ɓ��������I";
		mes "�j�����L�[�c�ɉ��̗p���H";
		next;
		if(select("�j�����L�[�c�Ƃ́H","�݂�ȑ̒��������������ǁH") == 1) {
			mes "[�S�[�{��]";
			mes "�����A���Ă͂��O�A";
			mes "�ŋߗ����΂���̐l�Ԃ��ȁH";
			mes "����Ȃ�Βm��Ȃ��Ă�";
			mes "���傤���˂��B";
			next;
			mes "[�S�[�{��]";
			mes "�t�t�t�A�����ċ����I";
			mes "���j�����L�[�c��";
			mes "���̒��ł������ǔL�s�ׂ��s���A";
			mes "�s�ǔL�W�c���I";
			next;
			mes "[�S�[�{��]";
			mes "�����Ă��̉��l���A";
			mes "���̖��𕷂��΋����q���ق�A";
			mes "�j�����L�[�c�̃{�X";
			mes "�S�[�{���l���I";
			next;
			mes "[�S�[�{��]";
			mes "�����c�c���A�������I";
			mes "�܂������c�c�B";
			emotion 28;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���v�H";
			mes "�݂�ȑ̒��������������ǁc�c";
			next;
		}
		mes "[�S�[�{��]";
		mes "����Ȃɉ��̂��Ƃ��m�肽�����H";
		mes "�t�t�t�A���D���ȓz�߁B";
		mes "����ł͖]�ݒʂ苳���Ă�낤�I";
		next;
		mes "[�S�[�{��]";
		mes "���j�����L�[�c�́A";
		mes "���l����ʋl�𓐂񂾂̂��I";
		mes "�s�ǔL������ȁB";
		mes "�t�t�t�c�c";
		next;
		mes "[�S�[�{��]";
		mes "�����Ă���";
		mes "���񂾊ʋl��H�ׂ�";
		mes "���Ȃ����󂵂Ă��܂����̂�!!";
		mes "�t�n�n�n�n!!";
		next;
		mes "[�S�[�{��]";
		mes "�I�@����!!";
		mes "�����܂��A�́A�����c�c";
		emotion 28;
		next;
		mes "[�S�[�{��]";
		mes "���A���O��������ŗ��݂�����B";
		mes "����ȂЂł��ʋl�������Ă���";
		mes "���l�������o���āA";
		mes "���̕��Q���c�c!!";
		next;
		mes "[�S�[�{��]";
		mes "����ȏ��l�������ɂ��Ă�����";
		mes "��ʂ̔L�����ɂ�";
		mes "��Q���y�Ԃ���c�c!!";
		mes "���A�����c�c";
		next;
		if(select("�킩��܂���","����ł�") == 2) {
			mes "[�S�[�{��]";
			mes "�����A�����݈Ⴂ���������B";
			mes "��͂莩���̃P�c��";
			mes "�����Ő@�������c�c";
			mes "�����A�����c�c";
			emotion 28;
			close;
		}
		mes "[�S�[�{��]";
		mes "���肪�Ă��c�c";
		mes "���񂾊ʋl�ɂ́A�ۂ̒��Ɂu�^�v��";
		mes "�������Ƃ̂Ȃ��}�[�N��������Ă����B";
		mes "�����炭���̐H�ƂɎ������A";
		mes "�U���ʋl�������̂��B";
		next;
		mes "[�S�[�{��]";
		mes "��炪���񂾂̂́A";
		mes "�u���ɂ��鏤�l���炾�B";
		mes "�����ɍs���Ύ肪���肪";
		mes "���߂邾�낤�c�c";
		next;
		chgquest 71820,1145;
		set MAL_2QUE,1;
		mes "[�S�[�{��]";
		mes "���A���ނ��c�c�I";
		mes "����Ȋʋl�����ɍL�܂�����";
		mes "��������ςȂ��ƂɂȂ��Ă��܂��c�c�B";
		close;
	case 1:
		mes "[�S�[�{��]";
		mes "���񂾊ʋl�ɂ́A�ۂ̒��Ɂu�^�v��";
		mes "�������Ƃ̂Ȃ��}�[�N��������Ă����B";
		mes "�����炭���̐H�ƂɎ������A";
		mes "�U���ʋl�������̂��B";
		next;
		mes "[�S�[�{��]";
		mes "��炪���񂾂̂́A";
		mes "�u���ɂ��鏤�l���炾�B";
		mes "�����ɍs���Ύ肪���肪";
		mes "���߂邾�낤�c�c";
		next;
		mes "[�S�[�{��]";
		mes "���A���ނ��c�c�I";
		mes "����Ȋʋl�����ɍL�܂�����";
		mes "��������ςȂ��ƂɂȂ��Ă��܂��c�c�B";
		close;
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[�S�[�{��]";
		mes "�������c�c";
		mes "�́A�����ɂ���";
		mes "�c�c�͂��o�Ȃ�!!";
		close;
	case 7:
		if(countitem(6426) < 30) {
			mes "[�S�[�{��]";
			mes "�������c�c";
			mes "�U���ʋl�̏o���͂��߂��̂��H";
			mes "���A���ނ��c�c�I";
			emotion 28;
			close;
		}
		mes "[�S�[�{��]";
		mes "�Ԃ�Ԃ��\���}�H";
		mes "����ȓz�炪���̓��Ɂc�c�H";
		mes "�����Ă��̊ʋl���c�c�H";
		next;
		mes "[�S�[�{��]";
		mes "�����c�c�����͉��L�̊y���B";
		mes "����ȓz��ɕ����Ă��܂邩�I";
		mes "���������˂΂Ȃ�Ȃ��c�c�I";
		mes "�m�点�Ă���ė���������B";
		if(!checkweight(12636,20)) { //��������
			next;
			mes "[�S�[�{��]";
			mes "�c�O�����c�c�N�̃J�o���ɂ́A";
			mes "����ȏ���̂�����X�y�[�X�́A";
			mes "�Ȃ��������B";
			mes "�������Ă���Ƃ����B";
			close;
		}
		chgquest 1151,71750;
		set MAL_2QUE,8;
		getitem 12636,20;
		delitem 6427,1;
		delitem 6426,30;
		next;
		mes "[�S�[�{��]";
		mes "���j�����L�[�c��";
		mes "�s�ǖ�Ǎs�ׂ����邪�A";
		mes "�����ĔL�̓��͊O���˂�";
		next;
		mes "[�S�[�{��]";
		mes "�����A�z��̂�������Ƃ�";
		mes "�����O�ꂿ�܂����s�ׁA";
		mes "�������Ⴂ���˂��O���s�ׂ��I";
		next;
		mes "[�S�[�{��]";
		mes "�Ă߁[��A�C������Ă�!!";
		mes "��Ǎ����݂��Ă���!!";
		mes "�@";
		mes "���������ɂ�[!!";
		next;
		mes "[�S�[�{��]";
		mes "���I�@�������c�c";
		mes "��͂�A�܂������ɂ��B";
		mes "�������傤�c�c";
		close;
	case 8:
		mes "[�S�[�{��]";
		mes "�����A���O���B";
		mes "�����c�c�����I";
		mes "�Ȃ��Ȃ����ɂ�����˂��c�c";
		next;
		mes "[�S�[�{��]";
		mes "���O�ɗ��݂�����B";
		mes "��炪��������܂ł�";
		mes "���ɑ����ĕs�ǖ�Ǎs�ׂ�";
		mes "�s���Ăق����I";
		next;
		if(select("�����ł���","����ł�") == 2) {
			mes "[�S�[�{��]";
			mes "�������c�c";
			mes "�@";
			mes "�c�O���B";
			close;
		}
		mes "[�S�[�{��]";
		mes "���肪�����c�c�I";
		mes "���͖h�Ƒ������������ɂ��Ăȁc�c";
		mes "�����j�����L�[�c��";
		mes "���A�ł���̂��Ɓc�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�h�Ƒ����H";
		next;
		mes "[�S�[�{��]";
		mes "�h�Ƒ����͂��̓��̔ƍ߂�";
		mes "�����܂��Ă���B";
		mes "���j�����L�[�c�̓V�G���B";
		next;
		mes "[�S�[�{��]";
		mes "�t�t�t�A���̖h�Ƒ�����";
		mes "�Ȃ������������̂���";
		mes "�s�v�c�����Ȋ�����Ă���ȁB";
		next;
		mes "[�S�[�{��]";
		mes "�m���ɖh�Ƒ�����";
		mes "���j�����L�[�c�̓V�G���B";
		mes "�\�����ɂ́A�ȁB";
		next;
		mes "[�S�[�{��]";
		mes "���j�����L�[�c�́A";
		mes "�s�ǖ�Ǎs�ׂ����邱�Ƃɂ����";
		mes "���ɋْ��ƃX������^���Ă���̂��B";
		mes "���������ł́A�L�͐����Ă����Ȃ��B";
		next;
		mes "[�S�[�{��]";
		mes "�����Ă܂��A";
		mes "�ْ��ƃX���������ł�";
		mes "�����Ă����Ȃ����̂��c�c�B";
		next;
		mes "[�S�[�{��]";
		mes "��炪�s�ǖ�Ǎs�ׂɂ��";
		mes "���ɃX������^���A";
		mes "�h�Ƒ�������������܂���";
		mes "���ɕ��������߂��B";
		next;
		mes "[�S�[�{��]";
		mes "�܂��A���������킯���B";
		next;
		mes "[�S�[�{��]";
		mes "���O�Ȃ�A���Ȃ�";
		mes "���ɑ����ĕs�ǖ�Ǎs�ׂ��s����";
		mes "����邾�낤�B";
		next;
		mes "[�S�[�{��]";
		mes "�����ƌ��܂�΂��������A";
		mes "�h�Ƒ����ɂ��̂��Ƃ�";
		mes "�\�����Ă��Ă���B";
		setquest 1153;
		delquest 71750;
		set MAL_2QUE,9;
		close;
	case 9:
	case 10:
		mes "[�S�[�{��]";
		mes "�h�Ƒ����ɉ���Ă�����";
		mes "�`�����͂������H";
		close;
	case 11:
	case 12:
		if(checkquest(1152)^0x4 == 0x1) {
			mes "[�S�[�{��]";
			mes "���ނށc�c";
			mes "��͂��񂪕s�����Ă���B";
			mes "��x���_�ɖ߂�K�v������ȁB";
			mes "�����A�܂������ɗ����B";
			mes "�҂��Ă��邩��ȁB";
			close;
		}
		if(MAL_2QUE == 12) {
			if(checkquest(1154)) {
				mes "[�S�[�{��]";
				mes "������̎X��ʂɏZ��";
				mes "^0000FF���b�h�G���}^000000�ƌ��܂��Ă��Ăق����B";
				mes "�@";
				mes "^FF000020��^000000�ƌ��܂���΂����������ȁB";
				next;
				mes "[�S�[�{��]";
				mes "�I�������h�Ƒ����ɓ`���Ă���B";
				mes "��������낵�����ނ��B";
				close;
			}
			if(!checkquest(1155)) {
				mes "[�S�[�{��]";
				mes "�悭�����ȁB";
				mes "�������s�ǖ�Ǌ�����";
				mes "��`���Ă���Ȃ����H";
				next;
				if(select("�s�ǖ�Ǌ�������`��","���Ԃ��Ȃ��̂ł܂����x") == 2) {
					mes "[�S�[�{��]";
					mes "�������A�c�O���ȁB";
					mes "�ł͂܂����x���ށB";
					close;
				}
				mes "[�S�[�{��]";
				mes "�ł́A������̎X��ʂɏZ��";
				mes "^0000FF���b�h�G���}^000000�ƌ��܂��Ă��Ăق����B";
				mes "�@";
				mes "^FF000020��^000000�ƌ��܂���΂����������ȁB";
				next;
				mes "[�S�[�{��]";
				mes "�I�������h�Ƒ����ɓ`���Ă���B";
				mes "��������낵�����ނ��B";
				delquest 1152;
				setquest 1154;
				close;
			}
		}
		mes "[�S�[�{��]";
		mes "�������̑���ɕs�ǖ�Ǌ�����";
		mes "���Ă��ꂽ�̂��B";
		mes "�c�c�ӂށB";
		next;
		mes "[�S�[�{��]";
		mes "��q�𓾂��t���̋C���Ƃ����̂�";
		mes "����Ȋ����Ȃ̂��B";
		mes "�����Ȃ����B";
		emotion 4,"";
		next;
		if(!checkweight(12636,(MAL_2QUE != 12)? 200: 30) ) {
			mes "[�S�[�{��]";
			mes "�ł͕s�ǖ�Ǌ����̎����ł���낤�B";
			mes "�t���̖�ڂ�����ȁB";
			next;
			mes "[�S�[�{��]";
			mes "�c�c�c�B";
			next;
			mes "[�S�[�{��]";
			mes "�c�O�����c�c�N�̃J�o���ɂ́A";
			mes "����ȏ���̂�����X�y�[�X�́A";
			mes "�Ȃ��������B";
			mes "�������Ă���Ƃ����B";
			close;
		}
		mes "[�S�[�{��]";
		mes "�ł͕s�ǖ�Ǌ����̎����ł���낤�B";
		mes "�t���̖�ڂ�����ȁB";
		mes "���l�͂��������x�܂��Ă��炤�B";
		mes "�����A�܂������ɗ�����B";
		delquest 1155;
		setquest 1152;
		if(MAL_2QUE == 11) {
			setquest 201435;
			set MAL_2QUE,12;
			getitem 12636,200;
			if(checkre()) {
				for(set '@i,0;'@i<30;set '@i,'@i+1)
					getexp 5000,0;
				for(set '@i,0;'@i<10;set '@i,'@i+1)
					getexp 0,5000;
			}
			else {
				for(set '@i,0;'@i<30;set '@i,'@i+1)
					getexp 50000,0;
				for(set '@i,0;'@i<10;set '@i,'@i+1)
					getexp 0,50000;
			}
		}
		else {
			getitem 12636,30;
			if(checkre()) {
				for(set '@i,0;'@i<2;set '@i,'@i+1)
					getexp 5000,0;
				getexp 0,4000;
			}
			else {
				for(set '@i,0;'@i<2;set '@i,'@i+1)
					getexp 50000,0;
				getexp 0,40000;
			}
		}
		close;
	default:
		mes "[�S�[�{��]";
		mes "�Ȃ񂾂��O�́H";
		mes "���̉��l�ɋC��������";
		mes "������񂶂�˂��I";
		close;
	}
OnInit:
	waitingroom "�j�����L�[�c",0;
	end;
}

malangdo.gat,181,205,3	script	�S�u���C	547,{
	mes "[�S�u���C]";
	mes "�ނނށc�c�I";
	mes "�Ȃ����̃^�C�~���O��";
	mes "�����ɗ����̂ɂ�I";
	mes "��炪���N�Ȏ���";
	mes "�ǂ����ė��Ȃ��̂ɂ�I";
	close;
}

malangdo.gat,180,202,3	script	�S�r�����C	547,{
	mes "[�S�r�����C]";
	mes "�͂��c�c���΂炭";
	mes "�s�ǖ�Ǌ����ł��ĂȂ��Ȃ��c�c";
	mes "�͂��c�c";
	mes "���̔L�����̌���ڂ��|���Ȃ��c�c";
	close;
}

malangdo.gat,186,201,3	script	�S�V�b�L�[	547,{
	mes "[�S�V�b�L�[]";
	mes "���͂Ȃɂ����ݒ���";
	mes "�K�v�ɂ�I";
	mes "���܂��͈ݒ���������Ă���ɂ�!?";
	mes "���񂶂�[����ɂႠ���I";
	close;
}

malangdo.gat,177,202,3	script	�S�i���C	547,{
	mes "[�S�i���C]";
	mes "����j�����L�[�c�́A���̓��ɂ���";
	mes "�B��̕s�ǔL�g�D���ɂ�B";
	mes "�ӔC������񂾂ɂ�B";
	mes "���̂܂ܐQ�Ă�킯�ɂႠ";
	mes "������̂ɂ�B";
	close;
}

malangdo.gat,183,202,3	script	�S�h���C	547,{
	mes "[�S�h���C]";
	mes "�u���߂���";
	mes "�������L������ڌ������ɂ�B";
	mes "�������C�ɂȂ��āA";
	mes "���������ו��������ɂ����ɂႠ�c�c";
	close;
}

malangdo.gat,203,116,5	script	���������l	543,{
	mes "�]���l�������b�����Ă���]";
	next;
	mes "[���������l]";
	mes "!?";
	mes "�@";
	mes "���c�c�I";
	mes "���A�������ɂ��c�c";
	next;
	mes "�]���������l�́A";
	mes "�@���炩�ɉ��Z�Ƃ킩�邵������";
	mes "�@���Ȃ������������]";
	close;
}

malangdo.gat,205,116,3	script	�ƂĂ����������l	543,{
	mes "�]���l�������b�����Ă���]";
	next;
	mes "[�ƂĂ����������l]";
	mes "!?";
	mes "�@";
	mes "�c�c���A����ɂ��Ă�";
	mes "�V�C�����Ȃ��c�c";
	next;
	mes "�]���������l�́A";
	mes "�@���炩�ɂ킴�Ƃ炵��";
	mes "�@��������Ă���]";
	close;
}

malangdo.gat,197,120,5	script	�܂ʂ��ȏ��l	546,{
	mes "[�܂ʂ��ȏ��l]";
	mes "�����ɂ���ƁA";
	mes "�ǂ�ȉ\�b�ł��E����ɂ�B";
	mes "���e�͂킩��ɂႢ���ǁB";
	mes "�ɂ�ɂ�ɂႠ�B";
	close;
}

malangdo.gat,196,120,0	script	#mal_event1	139,3,3,{
	switch(MAL_2QUE) {
	case 1:
	case 2:
		mes "�]���������l������";
		mes "�@�b�����Ă���]";
		next;
		mes "[���������l]";
		mes "�c�c�����ɏP��ꂽ������";
		mes "�\������x��āc�c";
		next;
		mes "[�ƂĂ����������l]";
		mes "�u�c��^0000FF�i�r���̖k���ɂ���";
		mes "���D�J�S�߂�^000000�ɉB�����c�c";
		mes "�S�z�́c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�u�c�c�c�Ȃ�̂��Ƃ��낤�H";
		mes "���l�������Ă���";
		mes "^0000FF�i�r���̖k���ɂ��镗�D�J�S^000000";
		mes "�ߕӂ𒲂ׂĂ݂悤�j";
		if(MAL_2QUE == 1) {
			chgquest 1145,1146;
			set MAL_2QUE,2;
		}
		close;
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		mes "�]���l�������b�����Ă���]";
		next;
		mes "[���������l]";
		mes "��̃u�c�c";
		mes "�c�c���D�J�S�̋߂���";
		mes "��͂��Ȃ��c�c";
		next;
		mes "[�ƂĂ����������l]";
		mes "�S�z�����ȁB�����c�c";
		mes "�u�c�̉B���ꏊ�c�c";
		mes "�c�c^0000FF�i�r��^000000�Ɉړ����āc�c";
		mes "�f�b�L�ɂ͒��Ԃ��c�c";
		mes "���S���c�c";
		next;
		mes "[���������l]";
		mes "����Ŏc���";
		mes "�c�������̕��c�c";
		mes "�M���邵���c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�i�r���̃f�b�L�Ɉꖡ��";
		mes "���ꍞ��ł��邩������Ȃ��B";
		mes "^0000FF�i�r��^000000�𒲍����悤�j";
		if(MAL_2QUE == 3) {
			chgquest 1147,1148;
			set MAL_2QUE,4;
		}
		close;
	case 8:
	case 9:
		mes "�]���l�������b�����Ă���]";
		next;
		mes "[���������l]";
		mes "�����́A�ς�炸���N�c�c";
		mes "�ǂ������񂾂낤�H";
		next;
		mes "[�ƂĂ����������l]";
		mes "����Ȃ͂��͂Ȃ��c�c";
		mes "�U���ʋl�������Ɓc�c";
		close;
	default:
		end;
	}
}

malangdo.gat,155,179,0	script	#mal_event2	139,3,3,{
	switch(MAL_2QUE) {
	case 2:
	case 3:
		mes "�]����������Ă��鎆�������Ă���B";
		mes "�@�����̂悤���]";
		next;
		mes "�]�����ɂ�";
		mes "�@^FF0000�u��̃u�c�͈ړ������Ă������v^000000";
		mes "�@�Ə�����Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��̃u�c�c�c";
		mes "������Ȃ��悤�ɂ���ȂɐT�d��";
		mes "�Ȃ�Ȃ�ĉ������ȁB";
		mes "���������l�����̉�b��";
		mes "������x�����Ă݂悤�j";
		if(MAL_2QUE == 2) {
			chgquest 1146,1147;
			set MAL_2QUE,3;
		}
		close;
	default:
		end;
	}
}

malangdo.gat,171,163,3	script	���������l	543,{
	switch(MAL_2QUE) {
	case 4:
		mes "[���������l]";
		mes "�����̏����͏I��肾��B";
		mes "�~�������̂�����Ȃ�A";
		mes "�����������Ă���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����ł����B����͎c�O�ł��B";
		mes "���Ȃ݂ɁA������͉���";
		mes "��舵���Ă���̂ł����H";
		next;
		mes "[���������l]";
		mes "���H�@���`�Ɓc�c";
		mes "�ʋl�Ƃ��A���ȁc�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�قق��A�ʋl�ł����B";
		mes "�ʋl�Ƃ����΁A�ŋ߁A";
		mes "�i���̈����ʋl���o�����";
		mes "����݂����ł��ˁB";
		next;
		mes "[���������l]";
		mes "�c�c�������B";
		mes "����͒��ӂ��Ȃ��ƂȁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ۂ̒��Ɂu�^�v�Ə����ꂽ�}�[�N��";
		mes "�����ʋl�炵���̂ł����A";
		mes "���͎��A��قǂ���������܂��āB";
		next;
		mes "[���������l]";
		mes "�I";
		mes "�����^0000FF�i�r���̐H��^000000��";
		mes "��������B���āc�c���I";
		next;
		mes "[���������l]";
		mes "�c�c�R�z���B";
		mes "�Ƃɂ��������i�؂ꂾ����A";
		mes "�Ƃ��ƂƋA���Ă���B";
		mes "���������I";
		chgquest 1148,1149;
		set MAL_2QUE,5;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���l���������点��";
		mes "^0000FF�i�r���̐H��^000000�c�c";
		mes "�����B����Ă��邩�A���X�܂�";
		mes "���ׂĂ݂悤�j";
		close;
	case 5:
		mes "�]���������l��";
		mes "�@�ԂԂꂢ�Ă���]";
		next;
		mes "[���������l]";
		mes "������͂����Ȃ��񂾁B";
		mes "^0000FF�i�r���̐H��^000000��";
		mes "��������B��������ȁc�c";
		mes "����c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i^0000FF�i�r���̐H��^000000�c�c";
		mes "�����B����Ă��邩�A���X�܂�";
		mes "���ׂĂ݂悤�j";
		close;
	case 6:
		mes "[���������l]";
		mes "�����^0000FF�U���ʋl��^000000�c�c";
		mes "���A����Ȃ��́A���͒m��Ȃ����B";
		mes "�����Ɏ����Ă��Ȃ��ł���B";
		next;
		if(select("�m���Ղ肷��ȁI","�Ȃ����ꂪ�U���ʋl�܂��ƁH") == 1) {
			mes "[���������l]";
			mes "�͂͂́B";
			mes "����m���Ղ肷��Ƃ����̂��H";
			mes "�@";
			mes "�]����������Ă��܂����]";
			next;
			mes "[���������l]";
			mes "���������Ɏ����Ă���Ȃ�";
			mes "�������������B";
			mes "���ꂪ�Ȃ񂾂Ƃ����񂾁H";
			emotion 2;
			close;
		}
		mes "[���������l]";
		mes "���A����́c�c";
		mes "���A�����c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̓��̑�\�̂Ƃ���ɂ��̑܂�";
		mes "�����čs���A���Ȃ�����������";
		mes "�`���悤���B";
		next;
		mes "[���������l]";
		mes "�ȁI�@�g�[�}�X��̂Ƃ����?!";
		mes "�L�̓G�ɗe�͂̂Ȃ����ƂŗL���ȁc�c";
		mes "���A����͂�߂Ă���I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A���̒�ɒm�点�邼�B";
		next;
		mes "[���������l]";
		mes "����҂��āI�@�҂đ҂āI";
		mes "����́A���ɏd��ȍ��Ȃ񂾁B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���H";
		next;
		mes "[���������l]";
		mes "���A���͎���";
		mes "�u�Ԃ�Ԃ��\���}�v�̓}���łˁc�c";
		mes "����������Z�̒n���~�����񂾁B";
		next;
		mes "[���������l]";
		mes "������A�����ɏZ�ޔL������ǂ��o����";
		mes "�Ԃ�Ԃ��\���}�̖{�����c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����Ȏ��ł���Ǝv���Ă���́H";
		next;
		mes "[���������l]";
		mes "���������o�J�ɂ���̂�!?";
		mes "���Ă��I�@�K���B�����Ă��I";
		mes "���̔w���̏\���ɂ�����!!";
		next;
		mes "�]���������l���w����������";
		mes "�@�����ɂ͏\���̌`�ɔ����т�";
		mes "�@�����Ă����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�B";
		next;
		mes "[���������l]";
		mes "�t�t�t�c�c";
		mes "�v��̈�i�K�Ƃ��āA";
		mes "^0000FF������̎X���^000000��";
		mes "^0000FF�U���ʋl���ʂ�^000000";
		mes "�΂�܂��Ă�������I";
		next;
		mes "[���������l]";
		mes "���̓��̓X�^�[�L�����f�B��";
		mes "�x���Ă���B���̃X�^�[�L�����f�B��";
		mes "�U���ʋl�������ς��H�킹����c�c";
		mes "�c�c�����N���邩�킩�邩�H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���������������悤�Ƃ��Ă���H";
		next;
		mes "[���������l]";
		mes "�t�t�t�A�����ɂ킩�邳�I";
		mes "�ł��C�Â������ɂ͂�����x�ꂾ!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���ȗ\��������c�c";
		mes "^FF0000������̎X���^000000�ɍs����";
		mes "^FF0000�U���ʋl^000000��������A";
		mes "�S�[�{���ɕ񍐂��悤�j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�Ƃ肠�����A30���W�߂��";
		mes "�\�����낤���j";
		chgquest 1150,1151;
		set MAL_2QUE,7;
		close;
	case 7:
		mes "[���������l]";
		mes "�v��̈�i�K�Ƃ��āA";
		mes "^0000FF������̎X���^000000��";
		mes "^0000FF�U���ʋl���ʂ�^000000";
		mes "�΂�܂��Ă�������I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���ȗ\��������c�c";
		mes "^FF0000������̎X���^000000�ɍs����";
		mes "^FF0000�U���ʋl^000000��������悤�j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�Ƃ肠�����A30���W�߂��";
		mes "�\�����낤���j";
		close;
	case 8:
		mes "[���������l]";
		mes "��X�̌v����������ȁI";
		mes "����ɋ������ȁI";
		mes "�j�����L�[�c�̓z�炩��";
		mes "�����Ȃ��Ɓc�c�I";
		close;
	default:
		mes "[���������l]";
		mes "�����̏����͏I��肾��B";
		mes "�~�������̂�����Ȃ�A";
		mes "�����������Ă���B";
		close;
	}
}

mal_in02.gat,184,72,3	script	�S�W�����C	547,{
	mes "[�S�W�����C]";
	mes "���ɂႩ���A���ɂႩ�����c�c";
	mes "���A���܂�c�c";
	mes "�c�c�ӂ��[�̂炩�ǁ[����ɂႠ";
	close;
}

mal_in02.gat,184,77,0	script	#mal_ship_event	139,3,3,{
	switch(MAL_2QUE) {
	case 5:
		mes "�]�܂�����ł���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c����́I";
		mes "�@";
		mes "�]�܂ɂ́A�ۂ̒��Ɂu�^�v�̃}�[�N��";
		mes "�@�����ʋl���l�ߍ��܂�Ă����]";
		next;
		if(!checkweight(6427,1)) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�i����͋U���ʋl�ɈႢ�Ȃ��B";
		mes "�f�b�L�ɂ������������l��";
		mes "����̉B���ꏊ��m���Ă����c�c�B";
		mes "���������l��₢�l�߂悤�j";
		chgquest 1149,1150;
		set MAL_2QUE,6;
		getitem 6427,1;
		close;
	case 6:
		mes "�]�܂ɋU���ʋl���l�ߍ��܂��";
		mes "�@����̂𔭌������]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�f�b�L�ɂ������������l��";
		mes "����̉B���ꏊ��m���Ă����c�c�B";
		mes "���������l��₢�l�߂悤�j";
		close;
	default:
		end;
	}
}

malangdo.gat,125,147,3	script	�h�Ƒ���	545,{
	switch(MAL_2QUE) {
	case 9:
		mes "[�h�Ƒ���]";
		mes "�ɂႠ�H";
		mes "���Ȃ������ɂœ����Ȃ�";
		mes "�j�����L�[�c�̑����";
		mes "�s�ǖ�Ǌ������H";
		next;
		mes "[�h�Ƒ���]";
		mes "�c�c���ނނށA";
		mes "�s�ǖ�Ǎs�ׂ͑�ςȂ��̂ɂ�B";
		mes "���͎�������ׂ��Ǝv���̂ɂ��B";
		next;
		if(select("������ƍl���Ȃ����܂�","���ɔC���Ă��������I") == 1) {
			mes "[�h�Ƒ���]";
			mes "�킩�����ɂ��B";
			mes "�o�傪���܂�����A";
			mes "�܂�����ɂႠ�B";
			close;
		}
		mes "[�h�Ƒ���]";
		mes "�����o��ɂ�B";
		mes "�ł́A�������e��`����ɂ��B";
		next;
		mes "[�h�Ƒ���]";
		mes "�j�����L�[�c�̕s�ǖ�Ǎs�ׂ̈��";
		mes "������̎X��ʂɏZ��";
		mes "^0000FF���b�h�G���}^000000�Ƃ̌��܂�����ɂ��B";
		mes "���Ȃ��ɂ͂��������Ă��炤�ɂ�B";
		next;
		mes "[�h�Ƒ���]";
		mes "�ɂ�ɂႠ�c�c";
		mes "^FF000020��^000000�ƌ��܂���΂����������ɂႠ�B";
		mes "^0000FF���b�h�G���}^000000��20�́A";
		mes "���܂��ē|���Ă���ɂ��B";
		mes "�ł͍s���ɂ�B";
		chgquest 1153,1154;
		set MAL_2QUE,10;
		close;
	case 10:
		if(!(checkquest(1154) & 0x4)) {
			mes "[�h�Ƒ���]";
			mes "���Ȃ����j�����L�[�c�Ɠ���";
			mes "�������ł��邩�m�F�������ɂႠ�B";
			mes "������̎X��ʂɏo������";
			mes "^0000FF���b�h�G���}^00000020�̂�";
			mes "���܂��Ă��Ă��������ɂ�B";
			close;
		}
		mes "[�h�Ƒ���]";
		mes "^0000FF���b�h�G���}^000000�Ƃ�������";
		mes "���܂��Ă����ɂ�H";
		mes "���ꂪ�A�s�ǖ�Ǎs�ׂ����邱�Ƃ�";
		mes "�����ɁA�����̎h������������";
		mes "�j�����L�[�c�̎d���̈�ɂ��B";
		next;
		mes "[�h�Ƒ���]";
		mes "�ǂ����A���Ȃ��ɂ�";
		mes "��������ł������ɂႠ�B";
		mes "���i�ɂ��B";
		next;
		mes "[�h�Ƒ���]";
		mes "�����I";
		next;
		mes "�]�h�Ƒ�������b��";
		mes "�@���荞��ł����]";
		next;
		mes "[�h�Ƒ���]";
		mes "�����ĉ�炪�j�����L�[�c��";
		mes "�����܂��āA������";
		mes "���߂��̂ł��j����!?";
		emotion 28;
		emotion 28,"�h�Ƒ���#mal";
		next;
		mes "[�h�Ƒ���]";
		mes "�������Ƃ��I";
		mes "���ꂪ���̎d���ɂ�I";
		mes "�܂�厖�ɂ���ɂ�!!";
		mes "���̗܂́A�s���`�̎��ɗ����̂ɂ�I";
		emotion 28;
		emotion 28,"�h�Ƒ���#mal";
		next;
		mes "[�h�Ƒ���]";
		mes "�킩��܂����j���A�����I";
		next;
		mes "[�h�Ƒ���]";
		mes "���ށI";
		next;
		mes "[�h�Ƒ���]";
		mes "�j�����L�[�c�̑�s�҂�B";
		mes "������ł��A�ނ�������߂�";
		mes "�U���ʋl�̒��������Ă�������A";
		mes "�S�[�{���ɂ�낵���`����ɂ��B";
		mes "������A���̖��𖼏����̂Ƃ���";
		mes "��������s�ǖ�Ǎs�ׂ𖱂߂�̂ɂ�B";
		next;
		mes "�]�S�[�{���̂Ƃ���ɍs���A";
		mes "�@�s�ǖ�Ǎs�ׂ��s�������Ƃ�";
		mes "�@�񍐂��悤�]";
		delquest 1154;
		setquest 1155;
		set MAL_2QUE,11;
		close;
	case 11:
		mes "[�h�Ƒ���]";
		mes "�ł́A���̕��ł�";
		mes "�U���ʋl�̒��������Ă����܂��ɂ�B";
		mes "�j�����L�[�c�𖼏����̂Ƃ��āA";
		mes "�s�ǖ�Ǎs�ׂ����肢�ɂႠ�B";
		next;
		mes "�]�S�[�{���̂Ƃ���ɍs���A";
		mes "�@�s�ǖ�Ǎs�ׂ��s�������Ƃ�";
		mes "�@�񍐂��悤�]";
		close;
	case 12:
		if(!checkquest(1154)) {
			mes "[�h�Ƒ���]";
			mes "�ł́A���̕��ł�";
			mes "�U���ʋl�̒��������Ă����܂��ɂ�B";
			mes "�j�����L�[�c�𖼏����̂Ƃ��āA";
			mes "�s�ǖ�Ǎs�ׂ����肢�ɂႠ�B";
			close;
		}
		if(!(checkquest(1154) & 0x4)) {
			mes "[�h�Ƒ���]";
			mes "�S�[�{������b�͕����Ă�ɂ�B";
			mes "�s�ǖ�Ǎs�׊撣��ɂ�B";
			close;
		}
		mes "[�h�Ƒ���]";
		mes "�s�ǖ�Ǎs�ׂ����ɂ��B";
		mes "�S�[�{���ɂ͓`���Ă������ǁA";
		mes "���Ȃ�������񍐂����Ă���ɂ�B";
		delquest 1154;
		setquest 1155;
		next;
		mes "�]�S�[�{���̂Ƃ���ɍs���A";
		mes "�@�s�ǖ�Ǎs�ׂ��s�������Ƃ�";
		mes "�@�񍐂��悤�]";
		close;
	default:
		mes "[�h�Ƒ���]";
		mes "�ŋ߁A���̋ߕӂ�";
		mes "�U���ʋl��";
		mes "�΂�܂���Ă�炵���ɂ�B";
		mes "�C������ɂႠ�B";
		close;
	}
}

malangdo.gat,129,146,3	script	�h�Ƒ���#mal	545,{
	switch(MAL_2QUE) {
	case 11:
	case 12:
		mes "[�h�Ƒ���]";
		mes "�d��������Ƃ������Ƃ�";
		mes "���ꂵ�����Ƃł��j���I";
		mes "���ꂩ������a�I�ɕs�ǖ�Ǌ�����";
		mes "���肢���܂��j���I";
		close;
	default:
		mes "[�h�Ƒ���]";
		mes "���̖k�ɁA";
		mes "�s�ǔL�������w����Ă��ł���";
		mes "���A�ނ�͏W�c�ŕ��ɂ�";
		mes "�݂܂��Ă�炵���ł��j���B";
		mes "�ǂ����U���ʋl��";
		mes "�H�ׂĂ��܂����悤�c�c";
		next;
		mes "[�h�Ƒ���]";
		mes "�ׁA�ʂɐS�z�Ȃ�Ă��ĂȂ��j���I";
		mes "�����A���������ɂȂ����͂�������";
		mes "�ނ炪�点���Ă闝�R�����R��";
		mes "�ǂ������݂����ł��j���A�c�c";
		close;
	}
}

//============================================================
// �j�����Q�[�}�[�Y�N�G�X�gNPC
//- Registory ------------------------------------------------
// MAL_3QUE -> 0�`14
//------------------------------------------------------------
malangdo.gat,120,140,7	script	�\�D	858,{
	mes "�]�������\�D���]";
	next;
	mes "[�j�����Q�[�}�[�Y�{��]";
	mes "�]���K���萏����W���]";
	mes "�]�L�I���W���]";
	mes "�c���ɑ��k���ĉ������B";
	next;
	mes "�]�ƊȒP�ɏ����Ă���]";
	close;
}

mal_in01.gat,31,210,2	script	�c��#gamer	549,{
	if(BaseLevel < 40) {
		// �A�J�f�~�[����� 40�ȏザ�ᖳ���ƂƂ΂��Ă���Ȃ��c
		mes "�]^FF0000Base���x����40�ȏ�Ȃ����";
		mes "�@�����Ȃ��悤���B^000000";
		mes "�@40�ȏ�ɂȂ�����܂����悤�]";
		close;
	}
	switch(MAL_3QUE) {
	case 0:
		mes "�]�ӂ��悩�ȔL�����ߑ���";
		mes "�@�f���Ȃ���Ƃ茾�𒝂��Ă���]";
		next;
		mes "[�c��]";
		mes "�͂��c�c����10�A�s�Ƃ́c�c�B";
		emotion 54;
		next;
		mes "[�c��]";
		mes "�������͋C���悭�c���͂�����";
		mes "^0000FF�u�j�����Q�[�}�[�Y�v^000000�Ȃ̂Ɂc�c�B";
		mes "�ǂ�����10�A�s�Ȃ́c�c�B";
		mes "���������ǂ�����!!";
		mes "�Ȃ��A�s�������񂾁c�c�H";
		next;
		mes "[�c��]";
		mes "�A�s�̌�����������";
		mes "������𗧂ĂȂ��ƁB";
		next;
		mes "�]�j�����Q�[�}�[�Y�Ƃ�";
		mes "�@�Ȃ񂾂낤�H";
		mes "�@�����ĕ����Ă݂悤�]";
		set MAL_3QUE,1;
		close;
	case 1:
		mes "[�c��]";
		mes "�A�s�̌����c�c������!!";
		mes "���ꂩ������Ȃ��B";
		next;
		mes "[�c��]";
		mes "^DD2234���Y���������I^000000";
		mes "�����ɂ͑��������߂��邪";
		mes "�A���O�����ӎ����邠�܂�";
		mes "���Y���������Ȃ��Ă��܂��Ă���B";
		next;
		mes "[�c��]";
		mes "���́c�c���ށI";
		mes "���Y���Ƃ��֘A���邪�A";
		mes "^DD2234�A�N�Z���g���Ȃ��B^000000";
		next;
		mes "[�c��]";
		mes "���̃`�[���͏��Ă������Ǝv����";
		mes "�S�͂Ō������Ă��邪�A";
		mes "���������Ȏ����͂��܂�";
		mes "�����ɂ͂łȂ��B";
		next;
		mes "[�c��]";
		mes "�l���Ă݂�Ύ��B��";
		mes "��������Ă��Ȃ��c�c�B";
		next;
		mes "[�c��]";
		mes "����B��������R�ɂȂ�̂��ȁH";
		mes "�Ȃ���^DD2234�����̑O�ɉ��x��";
		mes "�g�C���ɏ�����I��B�B";
		mes "^000000�C�ɂ��Ă��Ȃ���������";
		mes "����������̌��ʂɉe����";
		mes "�^���Ă���\��������B";
		next;
		mes "[�c��]";
		mes "��c�c�A�s�̌����̓��Y���������A";
		mes "�A�N�Z���g���Ȃ��A";
		mes "�����̑O�ɑI�肪�g�C���ɏ�����";
		mes "���炢���ȁc�c�B";
		next;
		mes "�]�ӂ��悩�ȔL���l������";
		mes "�@�I�����悤���B";
		mes "�@�b�������Ă݂悤�]";
		set MAL_3QUE,2;
		close;
	case 2:
		mes "[�c��]";
		mes "����������������A";
		mes "���͉�����������Ȃ��ƁB";
		emotion 20;
		next;
		menu "�Ȃɂ�������ł����H",-;
		mes "[�c��]";
		if(Job==Job_Summoner) {
			mes "�ǂȂ��ł����H";
			mes "���H";
			mes "���U�[�j�����痈���H";
		}
		else {
			mes "�ǂȂ��ł����H�@����?!";
			mes "�l��??�@�l�Ԃł����H";
		}
		next;
		mes "[�c��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�c��]";
		mes "���I�@���I�@���I";
		if(Job==Job_Summoner) {
			mes "���������΍ŋ߁A";
			mes "�p�[�X�^�ƃ~�b�h�K���h��";
			mes "�q�H���������ꂽ��ł����ˁI";
			mes "���܂蓇�ł͌��Ȃ��炾�����̂�";
			mes "�˘f���Ă��܂��܂����I";
		}
		else {
			mes "�ŋ߁A�}�������ɐl�ԒB��";
			mes "�o���肵�n�߂��ƁA";
			mes "�U�������Ă���Ƃ���";
			mes "�������悤�ȋC�����܂��B";
		}
		next;
		mes "[�c��]";
		mes "���߂܂���!!";
		mes "����ł��Ă��ꂵ���ł��B";
		mes "���̓j���G�X�g���`�[��";
		mes "�u�j�����Q�[�}�[�Y�v�̒c���ł��B";
		next;
		mes "[�c��]";
		mes "�j���G�X�g���Ƃ́A";
		mes "�|�p�I�ɃQ�[����키";
		mes "�v���I��̂��Ƃł��I";
		mes "�����̃Q�[�}�[�Ƃ�";
		mes "�ЂƖ����ӂ������Ⴄ�̂ł��I";
		next;
		mes "[�c��]";
		mes "�Ƃ���ŁA���Ȃ��̂����O�́H";
		emotion 0;
		next;
		mes "["+strcharinfo(0)+"]";
		mes strcharinfo(0)+ "�ƌ����܂��B";
		next;
		mes "[�c��]";
		mes "^0000FF"+strcharinfo(0)+"^000000�l�ł��ˁB";
		mes "�Ȃɂ����p�ł��傤���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����10�A�s����";
		mes "�Y��ł���p��";
		mes "���R�݂����܂����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�A�s�̌����Ɖ�����ɂ���";
		mes "�����Ԃ�ƍl���Ă��܂����ˁB";
		next;
		mes "[�c��]";
		mes "���ށc�c�B";
		mes "�����܂Ō����Ă��܂����Ƃ́c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��_�𓰁X�ƎN����";
		mes "����͂��͂��_�ł͖����Ȃ�܂��I";
		emotion 21,"";
		next;
		mes "[�c��]";
		mes "��c�c����c�c�H";
		mes "���̌��t�Ȃ��������������ł��ˁB";
		mes "�o���Ă����Č�őI��B��";
		mes "�g���Ă݂܂��B";
		next;
		mes "[�c��]";
		mes strcharinfo(0)+ "�l�̂��Ƃ�";
		mes "�C�ɓ���܂����B";
		mes "10�A�s�����Ă���";
		mes "���B�u�j�����Q�[�}�[�Y�v��";
		mes "�����Ă���܂��񂩁H";
		next;
		if(select("���͉^�̂Ȃ�" +(Sex? "�j": "��")+ "�Ȃ̂Łc�c","���̓N�[����" +(Sex? "�j": "��")+ "�Ȃ̂ŋ��͂��܂��傤")==1){
			mes "[�c��]";
			mes "�l�I���Ԉ�����悤�ł��ˁB";
			mes "�����̌��ŉ^���Ȃ���";
			mes "�����`���҂ł́c�c�B";
			mes "�ǂ�قǉ^���Ȃ��̂�";
			mes "�킩��悤�ȋC�����܂��B";
			next;
			mes "[�c��]";
			mes "�C��t���Ă��A�艺�����B";
			emotion 20;
			close;
		}
		mes "[�c��]";
		mes "��͂�A"+strcharinfo(0)+"�l��";
		mes "�f���炵���ł��B";
		mes "����ł͑����A���肢������܂��B";
		next;
		mes "[�c��]";
		mes "�`�[���ׂ̈Ɉꏊ����";
		mes "�w�͂��Ă���Ă���ē�";
		mes "�I��B�̕��͋C�𕷂��Ă���";
		mes "����܂��񂩁B";
		setquest 5058;
		set MAL_3QUE,3;
		next;
		mes "[�c��]";
		mes "�ē͂��̌����̋߂��ɂ��܂��B";
		mes "�x���S�������ł����A";
		mes "���̂���������D���ȕςȔL�Ȃ̂ŁA";
		mes "���̂�������^����";
		mes "�x���S�������Ă��������B";
		close;
	case 3:
		mes "[�c��]";
		mes "�`�[���ׂ̈Ɉꏊ����";
		mes "�w�͂��Ă���Ă���ē�";
		mes "�I��B�̕��͋C�𕷂��Ă݂ĉ������B";
		next;
		mes "[�c��]";
		mes "�ē͂��̌����̋߂��ɂ��܂��B";
		mes "�x���S�������ł����A";
		mes "���̂���������D���ȕςȔL�Ȃ̂ŁA";
		mes "���̂�������^����";
		mes "�x���S�������Ă��������B";
		close;
	case 4:
		mes "[�c��]";
		mes "����Ŋē͍ŋ߂̕��͋C��";
		mes "�ǂ����ƌ����Ă��܂������H";
		emotion 1;
		next;
		mes "�]�ē������Ă�������";
		mes "�@���̂܂ܒc���ɓ`�����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ē������Ă����̂́c�c�B";
		next;
		mes "[�c��]";
		mes "�����Ă����̂́c�c�B";
		emotion 1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�I��L�B���c����";
		mes "�������Ƃ𗝉��ł��Ȃ�";
		mes "�݂����ł��B";
		next;
		mes "[�c��]";
		mes "���c�c�ł��Ɓc�c�H";
		emotion 23;
		next;
		mes "�]�c���͂��Ȃ�̏Ռ���";
		mes "�@�󂯂��悤���B";
		mes "�@������x�b�������悤�]";
		delquest 5059;
		setquest 5060;
		set MAL_3QUE,5;
		close;
	case 5:
		mes "[�c��]";
		mes "��c�c���̌������Ƃ�";
		mes "�����ł��Ȃ��ł��Ɓc�c�H";
		mes "���قǌ|�p�I�Ɏw�����o����";
		mes "�L���ǂ��ɂ���Ƃ����̂��B";
		emotion 28;
		next;
		mes "[�c��]";
		mes "�ǂ����āc�c���̎w���̂ǂ���";
		mes "�����ł��Ȃ��̂��B";
		mes "�c�c�܂������̑O�A���K���h����";
		mes "�����ďo�čs�����z���";
		mes "���̌������Ƃ�������";
		mes "�o�čs�����̂��H";
		emotion 19;
		next;
		mes "[�c��]";
		mes "����͂Ȃ���ˁH";
		next;
		mes "[�c��]";
		mes "����Ȃ͂��͂Ȃ��I";
		next;
		mes "[�c��]";
		mes "�{���͈Ⴄ��ˁH";
		next;
		mes "[�c��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�c��]";
		mes strcharinfo(0)+ "�l";
		mes "����`�[��������K���������ƌ�����";
		mes "�o�čs�����z�炪4�C����̂ł����A";
		mes "���̌������Ƃ������ł��Ȃ���";
		mes "�o�čs�����̂�";
		mes "�m�F���Ă���܂��񂩁H";
		emotion 1;
		next;
		mes "[�c��]";
		mes "�C�����A�X�e���[�A�P�`���b�v�A";
		mes "�C�t�A����4�C�ł��B";
		mes "�}�������̒��ɂ���͂��ł��B";
		next;
		mes "[�c��]";
		mes "���̗p���̂��łł������̂ŁA";
		mes "�T���Ă݂Ă��������B";
		mes "���A�������I�@�����Ƃ��̓X�g���[�g��";
		mes "�������ɂ��肰�Ȃ��ł��肢���܂��B";
		mes "�킩��܂���ˁH";
		mes "���肰�Ȃ��I";
		next;
		mes "[�c��]";
		mes "4�C�ɘb�𕷂�����";
		mes "���̂Ƃ���ɖ߂��Ă��Ă��������B";
		mes "���肢���܂��B";
		mes strcharinfo(0)+ "�l�`�B";
		delquest 5060;
		setquest 5061;
		set MAL_3QUE,6;
		close;
	case 6:
		mes "[�c��]";
		mes "����`�[��������K���������ƌ�����";
		mes "�o�čs�����z�炪4�C����̂ł����A";
		mes "���̌������Ƃ������ł��Ȃ���";
		mes "�o�čs�����̂�";
		mes "�m�F���Ă���܂��񂩁H";
		next;
		mes "[�c��]";
		mes "�C�����A�X�e���[�A�P�`���b�v�A";
		mes "�C�t�A����4�C�ł��B";
		mes "�����Ƃ��̓X�g���[�g�ɕ�������";
		mes "���肰�Ȃ����肢���܂��B";
		mes "�킩��܂���ˁH";
		mes "���肰�Ȃ��I";
		next;
		mes "[�c��]";
		mes "�ł͂��肢���܂��B";
		mes strcharinfo(0)+ "�l�`�B";
		close;
	case 7:
		mes "[�c��]";
		mes "�ŋ߁A���ŔL�B�𑊎��";
		mes "�R�����Ă���l�Ԃ�����Ƃ���";
		mes "�\������Ă܂����B";
		next;
		mes "[�c��]";
		mes "�����ȔL�B�����܂��Ȃ��";
		mes "�܂��������������I";
		emotion 29;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���c�c�����ł��ˁc�c�B";
		next;
		mes "[�c��]";
		mes "�C�����A�X�e���[�A�P�`���b�v�A";
		mes "�C�t�ɉ���ė�����ł��ˁB";
		mes "�����Ƒ҂��Ă��܂����B";
		mes "�����l�ł��B";
		next;
		mes "[�c��]";
		mes "�ނ�͉��ƌ����Ă��܂������H";
		mes "���̌������Ƃ������ł��Ȃ���";
		mes "�����Ă��܂������H";
		next;
		mes "�]�C�����A�X�e���[�A�P�`���b�v�A";
		mes "�@�C�t�ɉ���ĕ������b��`�����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�I����j���G�X�g���ƌĂ񂾂肵��";
		mes "�Q�[���̂��Ƃ����Ⴂ���Ă���Ɓc�c";
		mes "����ł��Ă����Ȃ��Ɓc�c�B";
		next;
		mes "[�c��]";
		mes "���c�c�ł��Ɓc�c�H";
		next;
		mes "�]�c���͂܂������Ȃ��";
		mes "�@�Ռ����󂯂��悤���B";
		mes "�@������x�b�������悤�]";
		delquest 5062;
		delquest 5063;
		delquest 5064;
		delquest 5065;
		delquest 5061;
		delquest 71500;
		setquest 5060;
		set MAL_3QUE,8;
		close;
	case 8:
		mes "[�c��]";
		mes "�c�c���c�c�����ł����c�c�B";
		mes "���͊��Ⴂ�L��������ł��ˁc�c�B";
		next;
		mes "[�c��]";
		mes "���ꂶ��_���ł���!!";
		mes "���Ⴂ���Ă���L�Ƃ���";
		mes "�C���[�W��ς��Ȃ��ƁB";
		next;
		mes "[�c��]";
		mes "�`�[���̗͂����コ����ׂɂ�";
		mes "���̃C���[�W��ς��Ȃ��ƁB";
		next;
		mes "[�c��]";
		mes "�D�G�Ȋē̏��ɍs���āA";
		mes "�C���[�W��ς��邽�߂�";
		mes "���@�𕷂��Ă݂ĉ������B";
		next;
		mes "[�c��]";
		mes "�ł́A���肢���܂��B";
		mes strcharinfo(0)+ "�l�`�B";
		delquest 5060;
		setquest 5066;
		set MAL_3QUE,9;
		close;
	case 9:
		mes "[�c��]";
		mes "�D�G�Ȋē̏��ɍs����";
		mes "���Ⴂ���Ă���L�Ƃ���";
		mes "�C���[�W��ς��邽�߂�";
		mes "���@�𕷂��Ă݂ĉ������B";
		next;
		mes "[�c��]";
		mes "�ł́A���肢���܂��B";
		mes strcharinfo(0)+ "�l�`�B";
		close;
	case 10:
		mes "[�c��]";
		mes "���܂�����!!";
		mes "����ł����̗D�G�Ȋē�";
		mes "���ƌ����Ă��܂������H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����ЂƂp�ӂ��ĉ�������";
		mes "�����Ă��܂����B";
		next;
		mes "[�c��]";
		mes "���ł��ˁB�킩��܂����B";
		mes "�������܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ɏg���̂������Ȃ���ł����H";
		next;
		mes "[�c��]";
		mes "���́c�c�B";
		mes strcharinfo(0)+ "�l���ē�";
		mes "�����ɍs���Ƃ���";
		mes "�B��Ă��Ă����܂����B";
		emotion 18;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�c�c�B";
		next;
		mes "[�c��]";
		mes "�I�肽���̊肢��������";
		mes "�����Ȃ��Ƃ����܂���ˁB";
		next;
		mes "[�c��]";
		mes "�I�肽���̊肢�𕷂���";
		mes "�ǂ�����΂����̂���";
		mes "���߂邱�Ƃɂ��܂��B";
		mes "������x���Ă��������܂��񂩁H";
		delquest 5067;
		setquest 5068;
		set MAL_3QUE,11;
		close;
	case 11:
		mes "[�c��]";
		mes "���������݂�Ȃ���";
		mes "�ӌ������Ă��܂���B";
		mes "���Ə����Ă���̂�";
		mes "�ǂ�ł݂܂��傤���B";
		next;
		mes "�]�����`�����`�]";
		next;
		mes "[�c��]";
		mes "�ǂ�ǂ�A���Ă݂悤���ȁB";
		mes "�u�c���̃o�c�c�J�c�c�v";
		emotion 6;
		next;
		mes "�]�N�V���N�V��";
		mes "�@�c���͎����N�V���N�V���ɂ���";
		mes "�@���Ɏ̂Ă��]";
		next;
		mes "[�c��]";
		mes "�N�ł��傤�˂��H";
		mes "�����o���čق��̓S�Ƃ�";
		mes "�c�c�n�b�I";
		mes "�ققف`�Ԉ�����݂����ł��B";
		mes "���̂�ǂ�ł݂܂��c�c�B";
		next;
		mes "�]�����`�����`�]";
		next;
		mes "[�c��]";
		mes "�ł͂ł́B";
		mes "�u�������������o�[�Ɨ��K������";
		mes "�@�ʔ�������܂���B";
		mes "�@�V���������o�[�����邩�A";
		mes "�@���K����������ĉ������v";
		next;
		mes "[�c��]";
		mes "������������ł��ˁB";
		mes "�O�����Ɍ������܂��B";
		mes "�ł́A���̂�ǂ�ł݂܂��傤���c�c�B";
		emotion 33;
		next;
		mes "�]�����`�����`�]";
		next;
		mes "[�c��]";
		mes "�u���������Ȃ���ł��`";
		mes "�@����������ς��������`�v";
		next;
		mes "[�c��]";
		mes "������O�����Ɍ������܂��B";
		mes "�肢�𕷂��Ƃ����̂�";
		mes "�悢���̂ł��ˁc�c�B";
		emotion 33;
		next;
		mes "�]�����`�����`�]";
		next;
		mes "[�c��]";
		mes "�ق��`�B";
		mes "�u��y�B�������߂܂��B";
		mes "�@�����ĉ������c�c�v";
		next;
		mes "[�c��]";
		mes "�����̃`�[���݂����ɉƑ��I��";
		mes "���͋C�̃`�[���͂���܂���`";
		mes "�N���̂�������ł��c�c�B";
		emotion 0;
		next;
		mes "�]�����`�����`�]";
		next;
		mes "[�c��]";
		mes "�����c�c�����Ȃ�!!";
		mes "�Ԉ���ē����Ă��܂������́A";
		mes "�������炾�������̊܂߂�";
		mes "4�������ł��ˁc�c�B";
		next;
		mes "[�c��]";
		mes "�݂�Ȗ��������I�萶����";
		mes "�������Ă���݂����ł��ˁ`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���c�c����Ȃ͂����c�c�B";
		next;
		mes "�]������ƌ����锠�̌��ɂ�";
		mes "�@��R�̎������邪�A�c����";
		mes "�@���Č��ʂӂ�����Ă���悤���]";
		next;
		mes "[�c��]";
		mes strcharinfo(0)+ "�l�A";
		mes "���������܂������H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������c�c�B";
		mes "�����ĉ������c�c�B";
		next;
		mes "[�c��]";
		mes "�I��B���v���������̂�����̂Łc�c�B";
		mes strcharinfo(0)+ "�l��";
		mes "���肢��������������܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ȁc�c�Ȃ�ł����H";
		next;
		mes "[�c��]";
		mes "������̗��K����ɂȂ��ĉ������B";
		mes strcharinfo(0)+ "�l�Ȃ�";
		mes "�M���Ă��C���ł������ł��B";
		next;
		if(select("�f��","�����󂯂�")==1){
			mes "[�c��]";
			mes "�f���ł����c�c�B";
			next;
			mes "[�c��]";
			mes "�߂����ł���`";
			mes strcharinfo(0)+ "�l���f��Ƃ́c�c�B";
			emotion 28;
			next;
			mes "[�c��]";
			mes "����܂ł̂���Ƃ��ăR�C����������";
			mes "�v���[���g���܂����B";
			mes "�ǂ����g���Ă��������B";
			if(!checkweight(6418,10)) {
				next;
				mes "[�c��]";
				mes "����H";
				mes "�ו��������ς���";
				mes "���ĂȂ��悤�ł��ˁB";
				close;
			}
			delquest 5068;
			getitem 6418,10;
			set MAL_3QUE,12;
			next;
			mes "[�c��]";
			mes strcharinfo(0)+ "�l�Ȃ炢�ł�";
			mes "�j�����Q�[�}�[�Y�̖��_����Ƃ���";
			mes "�󂯓���܂���c�c�B";
			next;
			mes "[�c��]";
			mes "�����A�C���ς������";
			mes "���̏��ɗ��ĉ������B";
			close;
		}
		//�����󂯂��ꍇ
		mes "[�c��]";
		mes "�悭�����󂯂Ă��������܂����B";
		mes "�������A�����F�߂��l�ł��ˁB";
		emotion 21;
		next;
		mes "[�c��]";
		mes "��`���Ă���Ă��肪�Ƃ��������܂��B";
		mes "������̋C�����Ƃ��ăR�C����������";
		mes "�v���[���g���܂���B";
		mes "�ǂ����g���Ă��������B";
		next;
		mes "[�c��]";
		mes "�I��B�̗��K���������";
		mes "����������̂ł�����";
		mes "�u^0000FF�j�����Q�[�}�[�Y�̏�^000000�v��";
		mes "���������܂��B";
		if(!checkweight(6418,10)) {
			next;
			mes "[�c��]";
			mes "����H";
			mes "�ו��������ς���";
			mes "���ĂȂ��悤�ł��ˁB";
			close;
		}
		delquest 5068;
		setquest 5069;
		getitem 6418,10;
		set MAL_3QUE,13;
		next;
		mes "[�c��]";
		mes "�����ɔ��s���܂��̂�";
		mes "�����������҂����������`�B";
		close;
	case 12:
		mes "[�c��]";
		mes "����!!";
		mes strcharinfo(0)+ "�l�ł͂���܂��񂩁H";
		mes "�I��B�̗��K��������Ă����";
		mes "�C�ɂȂ�����ł����H";
		next;
		if(select("�������Ă݂�","�I��B�̗��K����ɂȂ�")==1){
			mes "[�c��]";
			mes "�����ł����B";
			mes "������x�����܂�����";
			mes strcharinfo(0)+ "�l�Ȃ炢�ł�";
			mes "�u�j�����Q�[�}�[�Y�̖��_����v�Ƃ���";
			mes "�󂯓���܂��`�B";
			close;
		}
		mes "[�c��]";
		mes "���悢��!!";
		mes strcharinfo(0)+ "�l�����_����Ƃ���";
		mes "���c���Ă�����ł���!!";
		mes "�����Ɂu^0000FF�j�����Q�[�}�[�Y�̏�^000000�v��";
		mes "���Ȃ���΁B";
		emotion 2;
		next;
		mes "[�c��]";
		mes "���܁u^0000FF�j�����Q�[�}�[�Y�̏�^000000�v��";
		mes "���s���܂��ˁ`";
		mes "������x�b�������Ă��������B";
		setquest 5069;
		set MAL_3QUE,13;
		close;
	case 13:
		mes "[�c��]";
		mes "����������Əꂩ��";
		mes "���_�؂������Ă��܂����B";
		next;
		mes "[�c��]";
		mes "���̏؂͕��ʂ̏؂ł͂���܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ʂ̏؂ł͂Ȃ��c�c�B";
		next;
		mes "[�c��]";
		mes "����́c�c�B";
		next;
		mes "�]�c�����ڂ����点�Ȃ���";
		mes "�@�������Ă���]";
		next;
		mes "[�c��]";
		mes "���ꂱ���u�j�����Q�[�}�[�Y�v";
		mes "�Z�p�`�[���̓w�͂Ƌ�J�̏W���!!";
		next;
		mes "[�c��]";
		mes "���̏؂������ăQ�[���������";
		mes "���Ȃ��̂��ׂĂ̏�񂪋L�^����܂��B";
		next;
		mes "[�c��]";
		mes "������󂯎���Ċ撣���ĉ������B";
		if(!checkweight(2872,2)) {
			next;
			mes "[�c��]";
			mes "����H";
			mes "�ו��������ς���";
			mes "���ĂȂ��悤�ł��ˁB";
			close;
		}
		delquest 5069;
		setquest 201430;
		getitem 2872,1;
		getitem 12636,50;
		set MAL_3QUE,14;
		for(set '@i,0;'@i<100;set '@i,'@i+1)
			getexp 10000,0,1;
		for(set '@i,0;'@i<20;set '@i,'@i+1)
			getexp 0,5000,0;
		next;
		mes "[�c��]";
		mes "�Q�[�����s���ꍇ�ɂ́A";
		mes "�K���u^0000FF�j�����Q�[�}�[�Y�̏�^000000�v��";
		mes "�������Ă���K�v������܂��B";
		close;
	case 14:
		mes "[�c��]";
		mes "����A"+strcharinfo(0)+"�l";
		mes "�I��B�̗��K����͂ǂ��ł����H";
		emotion 1;
		next;
		switch(select("���͖Z����","���A������","�����ł�")){
		case 1:
			mes "[�c��]";
			mes "�����ł����B";
			mes "�܂����Ԃ̂��鎞�ɂł�";
			mes "�I��B�̗��K��";
			mes "���Ă���Ă��������B";
			close;
		case 2:
			mes "[�c��]";
			mes "����ɂ��́`";
			mes strcharinfo(0)+ "�l��";
			mes "��V�������ł��ˁB";
			next;
			mes "[�c��]";
			mes "�ŋ߂͔L���l�Ԃ�";
			mes "��V�������l�������Ă��܂��`�B";
			next;
			mes "[�c��]";
			mes "�u�j�����Q�[�}�[�Y�v�̑I���";
			mes "���ł���V���������Ȃ��q��";
			mes "����̂ŐS�z�ł��B";
			next;
			mes "[�c��]";
			mes strcharinfo(0)+ "�l�̂悤��";
			mes "�l�ԂƔL��������΂����ł��ˁB";
			next;
			mes "[�c��]";
			mes "���ꂩ����I��B��";
			mes "���K����ɂȂ��ĉ������B";
			mes "�I��B��"+strcharinfo(0)+"�l�̂悤��";
			mes "��V��������";
			mes "�g�ɒ����Ă����Ǝv���̂ł��B";
			next;
			mes "[�c��]";
			mes "�ł́A�撣���ĉ������`�B";
			close;
		case 3:
			mes "[�c��]";
			mes "�����l�ł����B";
			mes strcharinfo(0)+ "�l�`";
			mes "���ꂩ����撣���ĉ������B";
			emotion 15;
			close;
		}
	default:
		break;
	}
	end;
OnInit:
	waitingroom "�j�����Q�[�}�[�Y", 0;
	end;
}

mal_in01.gat,30,222,4	script	�ʐڂɗ����L#gamer	560,{
	mes "[�ʐڂɗ����L]";
	mes "�u�j�����Q�[�}�[�Y�v��";
	mes "�����ʒk�����ɗ������ǁA";
	mes "�c�����Z��������������";
	mes "�A�������������̂��ȁH";
	next;
	mes "[�ʐڂɗ����L]";
	mes "��H";
	mes "�N���ʒk�ɗ����̂����H";
	close;
}

mal_in01.gat,19,213,1	script	�ҋ@���̔L#gamer	555,{
	mes "[�ҋ@���̔L]";
	mes "�ǂ����ĉԕr���K���X�̒���";
	mes "�u�����̂��ȁH";
	mes "�c���̎�Ȃ̂��ȁH";
	next;
	mes "[�ҋ@���̔L]";
	mes "�ς������������Ă���ȁB";
	mes "�u�j�����Q�[�}�[�Y�v�ɉ�������̂�";
	mes "������x�l�����������������̂��ȁH";
	close;
}

mal_in01.gat,15,221,6	script	�\�D	858,{
	mes "[�j�����Q�[�}�[�Y�{��1�K]";
	mes "�]���n��1�K���]";
	mes "����񂯂�ɂ��I����K��";
	mes "�����������ăj���A�I����K��";
	close;
}

malangdo.gat,127,111,4	script	�ςȔL#gamer	547,{
	switch(MAL_3QUE){
	case 3:
		mes "[�ē�]";
		mes "�ɂ�`�ɂ�ɂ�`";
		mes "�ɂ��ɂ��`�B";
		next;
		mes "[�ē�]";
		mes "��H�@���̗p���ɂ��H";
		emotion 1;
		next;
		menu "�c�����I��B�̕��͋C���c�c",-;
		mes "[�ē�]";
		mes "�����Ȃ�I��B�̂��Ƃ𕷂��Ȃ��";
		mes "���₵���ɂ��I";
		mes "�N�̓X�p�C����Ȃ��̂��ɂ��H";
		emotion 7;
		next;
		switch(select("��������̂悤�ɍ\���ĕБ������ɂȂ�","�r��g��Ō��������O��ɐU��","�������������Ȃ��炠��������邮����")){
		case 1:
			mes "[�ē�]";
			mes "���₵���ɂ��I";
			mes "����ς�X�p�C�ɈႢ�Ȃ��ɂ��I";
			close;
		case 2:
			mes "[�ē�]";
			mes "�X�p�C���Ǝv��������";
			mes "�����̃w���Ȑl�Ԃɂ��B";
			mes "�m���Ղ肷��ɂ��`�B";
			close;
		case 3:
			mes "�]���Ȃ��͒c�����畷���Ă���";
			mes "�@���̂悤�ȓ��������Ȃ���";
			mes "�@������x�������]";
			next;
			menu "�c�����I��B�̗l�q���c�c",-;
			mes "�]�ē͖ڂ����点�Ă���]";
			emotion 38;
			next;
			mes "[�ē�]";
			mes "�I��B���ɂ��B";
			mes "�c���̎w���ɋ^��������Ă�ɂ��B";
			mes "�����̎��A�c���̎w���������ł�����";
			mes "�ǂ������Ă����̂���������ɂ��B";
			emotion 3;
			next;
			mes "[�ē�]";
			mes "�Ƃ���ŁA";
			mes "�������̌��̂悤�ȗx���";
			mes "������x�����Ă���Ȃ����ɂ��??";
			delquest 5058;
			setquest 5059;
			set MAL_3QUE,4;
			next;
			mes "�]�ē�����𕷂����B";
			mes "�@�c���ɓ`���悤�]";
			close;
		}
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
		mes "�]�ē͂��Ȃ���������";
		mes "�@���̂悤�ȗx���";
		mes "�@�ɂ��ɂ��ƌ����Ȃ���";
		mes "�@�^�������Ă���]";
		emotion 3;
		close;
	case 9:
		mes "�]�ē͂��Ȃ����ȑO�Ɍ�����";
		mes "�@���̂悤�ȗx���";
		mes "�@�ɂ��ɂ��ƌ����Ȃ���";
		mes "�@�����Ő^�����Ă���B";
		mes "�@�b�������Ă݂悤�]";
		emotion 3;
		next;
		switch(select("���v�ł����H","���́c�c","�܂��܂��ł���")){
		case 1:
			mes "[�ē�]";
			mes "���������Ă�̂��ɂ��`";
			mes "���������N�������Ă��ꂽ";
			mes "�x�肶��Ȃ����ɂ��B";
			emotion 6;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���̂��Ƃɂ��Ă�";
			mes "�܂����x�ɂ��܂��傤�B";
			mes "�Ƃ���ŁA�c�����c�c�B";
			next;
			mes "�]�ēɎ������������]";
			next;
			break;
		case 2:
			mes "�]�ē͉����������Ȃ������悤��";
			mes "�@���̂悤�ȗx������Ă���]";
			emotion 3;
			close;
		case 3:
			mes "[�ē�]";
			mes "����ɂ��B";
			mes "�Ɉӂ������Ăق����ɂ��`�B";
			emotion 29;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���̂��Ƃɂ��Ă�";
			mes "�܂����x�ɂ��܂��傤�B";
			mes "�Ƃ���ŁA�c�����c�c�B";
			emotion 19,"";
			next;
			mes "�]�ēɎ������������]";
			emotion 19,"";
			next;
			break;
		}
		mes "[�ē�]";
		mes "�c�c�c���ɔ����ЂƂ�";
		mes "�p�ӂ���Ɠ`����ɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���H";
		emotion 1,"";
		next;
		mes "[�ē�]";
		mes "�ڈ����ɂ��B";
		mes "�݂�Ȃ̊肢�������Ă�����āA";
		mes "���̊肢��������ɂ��!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�킩��܂����B�c���ɓ`���܂��B";
		emotion 33,"";
		delquest 5066;
		setquest 5067;
		set MAL_3QUE,10;
		close;
	case 10:
		mes "[�ē�]";
		mes "�c���ɕK������p�ӂ����";
		mes "�`����ɂ��`";
		mes "���͑I��B�ɘb���Ă����ɂ��B";
		close;
	case 11:
		mes "[�ē�]";
		mes "�I��B�����ꂵ�����Ɏ���";
		mes "�����������Ă���ɂ��B";
		mes "������������Ă���̂�";
		mes "�����C�ɂȂ�ɂ��B";
		close;
	case 12:
	case 13:
		mes "[�ē�]";
		mes "�ɂ��ɂ��`";
		mes "�c�����Z�p�`�[����";
		mes "�j�����Q�[�}�[�Y�̏؂�";
		mes "���������ƕ������ɂ��B";
		mes strcharinfo(0)+ "�̂ł͂Ȃ��ɂ��H";
		next;
		mes "[�ē�]";
		mes "���K���������ɂ�";
		mes "�u^0000FF�j�����Q�[�}�[�Y�̏�^000000�v��";
		mes "�K�����p����K�v������ɂ��`";
		mes "���ӂ���ɂ��`�B";
		close;
	case 14:
		mes "[�ē�]";
		mes "���̗p�ɂ��H";
		next;
		switch(select("����ɂ���","�g�������ȏ��͂Ȃ��H","�Q�[�����������񂾂��ǁH")){
		case 1:
			mes "[�ē�]";
			mes "����ɂ��ɂ��`�B";
			emotion 18;
			close;
		case 2:
			mes "[�ē�]";
			mes "�L�B�͎��̂悤�Ɂu�ɂ��ɂ��v��";
			mes "�Ȃ܂���g���z��������A";
			mes "�g��Ȃ��z������ɂ��B";
			close;
		case 3:
			break;
		}
		mes "[�ē�]";
		mes "�ǂ̃Q�[�����������ɂ��H";
		mes "�u�j�����Q�[�}�[�Y�v��";
		mes "�F�X�ȃQ�[���̑I���";
		mes "��ĂĂ���ɂ��`�B";
		next;
		mes "[�ē�]";
		mes "�c�������������ς��҂�����";
		mes "���̎����ɂ��`�������W�����";
		mes "�������ɂ��`�B";
		next;
		switch(select("����񂯂�ɂ��","�j�N�L���[�t�@�C�g�I","�����������ăj���A")){
		case 1:
			mes "[�ē�]";
			mes "����񂯂�ɂ���������������";
			mes "�j�����Q�[�}�[�Y�n����K��";
			mes "�p�A�ƃZ���̏��ɍs���ɂ��B";
			close;
		case 2:
			mes "[�ē�]";
			mes "�j�N�L���[�t�@�C�g�I";
			mes "�͒ɂ��������ɂ��B";
			next;
			mes "[�ē�]";
			mes "�j�N�L���[�t�@�C�g�I���������Ȃ�A";
			mes "�j�����Q�[�}�[�Y�n����K��";
			mes "�N���N���̏��ɍs���ɂ��B";
			close;
		case 3:
			mes "[�ē�]";
			mes "�����������ăj���A��";
			mes "���x�̐S���킾�ɂ��B";
			next;
			mes "[�ē�]";
			mes "�����������ăj���A���������Ȃ�";
			mes "�j�����Q�[�}�[�Y�n����K��";
			mes "�N�J�̏��ɍs���ɂ��B";
			close;
		}
	default:
		mes "[�ςȔL]";
		mes "�ɂ�`�ɂ�ɂ�`";
		mes "�ɂ��ɂ��`�B";
		next;
		mes "�]�ςȔL������]";
		close;
	}
}

malangdo.gat,161,197,4	script	�C����#gamer	876,{
	switch(MAL_3QUE){
	case 6:
	case 7:
		if(checkquest(5062)){
			mes "[�C����]";
			mes "���ށc�c�L�҂���ł͂���܂��񂩁B";
			mes "�ǂ�������ł����H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�����I";
			mes "�C���^�r���[�̓r����";
			mes "���̔L�̏��ɍs�����肪�c�c�B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�C��������̂Ƃ����";
			mes "�܂����Ă��܂����悤�ł��ˁB";
			mes "���݂܂���B";
			next;
			mes "[�C����]";
			mes "���c�c�����ł����B";
			mes "�C��t���Ă��A�艺�����B";
			close;
		}
		mes "[�C����]";
		mes "��c�c�H�@�ǂȂ��ł����H";
		next;
		switch(select("�c�����c�c","��ނ̃t�������Ęb�𕷂�","�N�͒N���H")){
		case 1:
			mes "[�C����]";
			mes "���ł������Ȃ��́B";
			mes "�������ɍs���Ă��������ɂ�B";
			mes "���͒c���Ȃ�Ēm��܂���ɂ�B";
			emotion 6;
			close;
		case 2:
			break;
		case 3:
			mes "[�C����]";
			mes "���̖��O�̓C�����ł���";
			mes "���̌�p�ł����ɂ�H";
			close;
		}
		mes "[�C����]";
		mes "��ށH";
		mes "���̎�ނɂ�H";
		mes "�V���A�G���H";
		emotion 1;
		next;
		mes "�]�C���������܂�����悤";
		mes "�@�V����G���̖��O���l����";
		mes "�@���͂��Ă��������]";
		next;
		input '@str$;
		mes "[�C����]";
		mes '@str$ +"�H";
		mes "���������ƂȂ��ɂ�B";
		mes "�����ǁA�ǂ����Ď����H";
		emotion 1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�u�Q�[��������L�B�v�Ƃ���";
		mes "�^�C�g���œ��W�L����";
		mes "�����Ă���̂ł����c�c������c�c�B";
		mes "�����������c�c�����c�c���c�c�B";
		mes "�悭�v���o���Ȃ��c�c�B";
		next;
		mes "[�C����]";
		mes "�u�����������[���Y�v�ł����H";
		mes "�u�j�����Q�[�}�[�Y�v�̏h�G�������H";
		emotion 1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���I�@����ł��I";
		mes "�u�����������[���Y�v�̑I�肩��";
		mes "�C��������𐄑E���Ă��������܂��āB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�f���炵���I�肾����";
		mes "�C���^�r���[���Ă݂������ǂ��Ɓc�c�B";
		next;
		mes "[�C����]";
		mes "���A����Ȏ��Ȃ��ł��ɂ�B";
		mes "�ߑ�]���ł��ɂ�B";
		mes "�ł��c�c";
		mes "�u�����������[���Y�v��";
		mes "�����܂Ŏ���]������I��Ȃ�";
		mes "���܂����ł��傤���ɂ�c�c�H";
		emotion 9;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���݂܂���A���񋟎҂ɂ��Ă�";
		mes "�������ł��Ȃ���ł��B";
		mes "�@";
		mes "�ł́A���������₳���Ă��������B";
		mes "�����ɏI���܂��̂�";
		mes "�ǂ��������͂��������Ȃ��ł��傤���B";
		next;
		mes "[�C����]";
		mes "�킩��܂����B";
		mes "������Ƃ����Ȃ�\���܂���ɂ�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���肪�Ƃ��������܂��B";
		mes "�@";
		mes "����ł͎���ł��B";
		mes "1���ɗ��K�͂ǂ̂��炢���܂����H";
		next;
		mes "[�C����]";
		mes "8���Ԃقǂł����c�c�B";
		mes "���̓`�[�����甲�����̂Łc�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����I";
		mes "�`�[�����甲������ł����H";
		mes "�ǂ����āH";
		next;
		mes "[�C����]";
		mes "����^0000FF�c���̎w���������ł��Ȃ��āB^000000";
		mes "�������ɃA���_���e�Ƃ��B";
		mes "�g�������Ƃ������Ă�";
		mes "�킩��Ȃ��ƌ�������c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��������c�c�H";
		next;
		mes "[�C����]";
		mes "�c�����A�����̐U�邤�^�N�g�ʂ��";
		mes "�����΂����ƌ����Ȃ���";
		mes "�{�肾���āc�c�B";
		mes "���́A�ǂ�������炢���̂�";
		mes "�킩��Ȃ��Ȃ��Ă��܂��܂����ɂ�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ȃ�قǁB";
		mes "�c���̌������Ƃ������ł��Ȃ���";
		mes "��������ł��ˁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�u�j�����Q�[�}�[�Y�v��";
		mes "�L�\�ȑI��������܂����ˁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������A���̏󋵂ł͎����";
		mes "�ł��܂���ˁB";
		mes "�����̑I��B��";
		mes "�C���^�r���[����L���Ȃ̂Łc�c�B";
		next;
		mes "[�C����]";
		mes "����c�c�B";
		mes "���ʑ��𓥂܂��Đ\���󂠂�܂���B";
		emotion 17;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ƃ�ł��Ȃ��ł��B";
		mes "�Z���������Ԃ������Ă�������";
		mes "���肪�Ƃ��������܂����B";
		mes "���͂���Ŏ��炵�܂��B";
		mes "�悢������߂����ĉ������B";
		next;
		mes "�]�C�������`�[������o��";
		mes "�@���������R���킩�����B";
		mes "�@���̔L�B��T���ɍs���Ă݂悤�]";
		setquest 5062;
		if(checkquest(5062)&&checkquest(5063)&&checkquest(5064)&&checkquest(5065)){
			setquest 71500;
			set MAL_3QUE,7;
		}
		close;
	default:
		if(MAL_3QUE >= 8) {
			mes "[�C����]";
			mes "����A�L�҂���H";
			emotion 1;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�l�Ⴂ�ł��B";
			next;
			mes "�]�C�������C�Â����悤���B";
			mes "�@�ގU���悤�]";
			close;
		}
		mes "[�C����]";
		mes "�v�����̂�������Ȃ�";
		mes "�u�j�����Q�[�}�[�Y�v";
		mes "��x�Ɩ߂�Ȃ��c�c�B";
		mes "�����N�́H";
		next;
		mes "�]�L�����{���Ă���B";
		mes "�@���͘b�������Ȃ��ł������]";
		close;
	}
}
malangdo.gat,230,197,4	script	�X�e���[#gamer	555,{

	switch(MAL_3QUE){
	case 6:
	case 7:
		if(checkquest(5063)){
			mes "[�X�e���[]";
			mes "�N�͊ʋl�̔����ł͂Ȃ����ɂ��H";
			mes "�܂��A���P�[�g�����ɗ����ɂ��H";
			emotion 1;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���݂܂���I�@�������܂��ɔL�l�B��";
			mes "��ʂł��Ȃ��āc�c���݂܂���B";
			next;
			mes "[�X�e���[]";
			mes "���������`���Ⴀ�ɂ��`�B";
			close;
		}
		mes "[�X�e���[]";
		mes "�ɂ��c�c�H�@�N�͒N���ɂ��H";
		emotion 1;
		next;
		switch(select("�u�j�����Q�[�}�[�Y�v����c�c","�ɂႨ�`","�ʋl�̔����̃t�������Ęb�𕷂�")){
		case 1:
			mes "[�X�e���[]";
			mes "���͂��łɃ`�[���𗣂ꂽ�g���ɂ��B";
			mes "��x�Ɨ��Ȃ��łق����ɂ��`�B";
			close;
		case 2:
			mes "[�X�e���[]";
			mes "�������Ȑl�ƗV���";
			mes "�����鎞�Ԃ͂Ȃ��ɂ��B";
			close;
		case 3:
			break;
		}
		mes "[�X�e���[]";
		mes "�ʋl�̔����H";
		mes "�ȂɊʋl�ɂ�H";
		next;
		mes "�]�X�e���[�����܂�����悤";
		mes "�@�u�����ʋl�v�́u�����v�ɓ���";
		mes "�@���t����͂��Ă��������]";
		next;
		input '@str$;
		mes "[�X�e���[]";
		mes "�u" +'@str$ +"�ʋl�v�ɂ��H";
		emotion 1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���������Ă��q�l�I";
		mes "�u" +'@str$ +"�ʋl�v��";
		mes "�m��Ȃ��̂ł����H";
		mes "�ʋl�͐H�ׂȂ���ł����H";
		next;
		mes "[�X�e���[]";
		mes "����`";
		mes "�ʋl�͂悭�H�ׂ�ɂ��`�B";
		emotion 3;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���I�@�Ȃ�悩�����ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���q�l�A���񂤂���";
		mes "�u" +'@str$ +"�ʋl�v��";
		mes "�a��10���N���}���܂��āA";
		mes "����ɕi���̂悢���i�����ׂ�";
		mes "�A���P�[�g�����{���ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���������₵�܂��B";
		mes "�ȒP�Ȏ���ł��B";
		next;
		mes "[�X�e���[]";
		mes "�킩�����ɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��͂�I";
		mes "�L�l�͐S���Ђ낢�ł��ˁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��T�͌��̌ڋq��������ł���";
		mes "�܂Ƃ��ɕԎ������Ă���Ȃ����c�c�B";
		mes "�͂��`�A�Ƃɂ�����ςł����B";
		next;
		mes "[�X�e���[]";
		mes "���B�͌��X������Ȋ���������ɂ�`";
		mes "�N�͓���������ڂ�����ɂ��`�B";
		emotion 33;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���q�l���肪�Ƃ��������܂��B";
		mes "�ł́A������������c�c�B";
		mes "����ł������E�Ƃ́H";
		mes "�E�Ƃ��`�F�b�N���Ȃ����";
		mes "�Ȃ�Ȃ��̂Łc�c�B";
		next;
		mes "[�X�e���[]";
		mes "�E�Ƃɂ��H";
		mes "�j���G�X�g���c�c������";
		mes "�Q�[���̃v���I�肾�����ɂ��`";
		mes "�ł����͂�߂��ɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����H�@�ǂ����Ă���߂�";
		mes "�Ȃ�����ł����H";
		mes "���q�l�������";
		mes "�V�����I�@�V�����I�@��";
		mes "�������悳�����Ɍ�����̂Ɂc�c�B";
		mes "�������܂������̂ł͂Ȃ��ł����H";
		next;
		mes "[�X�e���[]";
		mes "�ɂ��`�ɂ��`�ɂ��`��";
		mes "�����͂悩�����ɂ��B";
		mes "^0000FF�c�������s�s�Ȃ��Ƃ�";
		mes "����Ȃ����^000000";
		mes "�����Ă����ɂ��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����c���ł��ˁB";
		next;
		mes "[�X�e���[]";
		mes "�����c���ł͂Ȃ������ɂ��`�B";
		mes "�ł��A�����̌�Ƃ��A";
		mes "���Ă��鎞������ɂ��H";
		mes "�����������͏������߂�";
		mes "���K�����Ă����ɂ��B";
		next;
		mes "[�X�e���[]";
		mes "����������c�����A�t�H���e�B�b�V����";
		mes "���тȂ��猃�������K��������ɂ��B";
		mes "���ɂ͋x�݂��K�v���Ǝv���ɂ��B";
		mes "���ƁA�t�H���e�B�b�V����";
		mes "�Q�[���Ɗ֌W�Ȃ��ɂ��B";
		mes "�������߂��ɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ȃ�قǁI�@�����ł������B";
		mes "�A���P�[�g���I���܂����B";
		mes "���q�l�A";
		mes "�u" +'@str$ +"�ʋl�v�A���P�[�g��";
		mes "�����͂��肪�Ƃ��������܂����B";
		next;
		mes "[�X�e���[]";
		mes "�ɂ��H�@�����₵���ɂ��H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���܂Ŏ��₵�Ă��܂�����B";
		mes "�o���Ă��܂��񂩁H";
		next;
		mes "[�X�e���[]";
		mes "�����Ȃ̂ɂ��H";
		mes "���������ɂ��B";
		mes "��邩�����ɂ��c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����`�L�l�͌��Ɣ�ׂ�Ƌ��͓I��";
		mes "�{���ɏ�����܂��B";
		mes "�����͂��肪�Ƃ��������܂����B";
		next;
		mes "[�X�e���[]";
		mes "�����������ɂ��H";
		mes "���͌��X���B�L���_�����ɂ��`";
		mes "���������`�B�@�C��t���Ăɂ��`�B";
		next;
		mes "�]�X�e���[���`�[�����o��";
		mes "�@�s�������R���킩�����B";
		mes "�@���̔L�B��T���ɍs���Ă݂悤�]";
		setquest 5063;
		if(checkquest(5062)&&checkquest(5063)&&checkquest(5064)&&checkquest(5065)){
			setquest 71500;
			set MAL_3QUE,7;
		}
		close;
	default:
		if(MAL_3QUE >= 8) {
			mes "[�X�e���[]";
			mes "����H�@�ʋl�̔����ɂ��!!";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�l�Ⴂ�ł���B";
			next;
			mes "�]�X�e���[���C�Â����悤���B";
			mes "�@�����悤�]";
			close;
		}
		mes "[�X�e���[]";
		mes "�ɂ��ɂ��`";
		mes "�j�����Q�[�}�[�Y�Ƃ�";
		mes "�i���ɂ�����΂��ɂ��B";
		mes "���H�@�N�͒N���ɂ��c�c�H";
		next;
		mes "�]�L���P���ė��������B";
		mes "�@���͘b�������Ȃ������ǂ��������]";
		close;
	}
}
malangdo.gat,244,144,4	script	�P�`���b�v#gamer	546,{
	switch(MAL_3QUE){
	case 6:
	case 7:
		if(checkquest(5064)){
			mes "[�P�`���b�v]";
			mes "����!!�@���Ȃ��́c�c�B";
			emotion 23;
			next;
			mes "�]�P�`���b�v���������c�c�B";
			mes "�@�܂�����������Ă��܂����悤���]";
			close;
		}
		mes "[�P�`���b�v]";
		mes "�ɂ��c�c�H�@�N�͒N�ɂ��H";
		emotion 1;
		next;
		switch(select("�����`","�c�����c�c","�z������t�������Ęb�𕷂�")){
		case 1:
			mes "[�P�`���b�v]";
			mes "���������c�c�ɂႨ���`�I";
			close;
		case 2:
			mes "[�P�`���b�v]";
			mes "��������������O�ɋ���ɂ�c�c�B";
			close;
		case 3:
			break;
		}
		mes "[�P�`���b�v]";
		mes "�悭�������Ȃ������ł��ɂ�B";
		mes "�����ł��ɂ�H";
		mes "���_�����Ă���̂ł��ɂ�H";
		emotion 1;
		next;
		mes "�]�P�`���b�v�����܂�����悤";
		mes "�@�u�������v�́u�����v�ɓ���";
		mes "�@���t����͂��Ă��������]";
		next;
		input '@str$;
		mes "["+strcharinfo(0)+"]";
		mes '@str$ +"���̋�����";
		mes "�`����ׂɗ��܂����B";
		mes "���B��" +'@str$ +"�_��M���܂����H";
		next;
		mes "[�P�`���b�v]";
		mes "���������ƂȂ��ł��ɂ�B";
		mes "�}�ɂ͐M�����܂���ɂ�B";
		emotion 20;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����ł�!!";
		mes '@str$ +"�_�l�ɕs�h��";
		mes "�S�������Ă���Ƃ́I";
		mes "�������_�ɘl�т�̂ł�!!";
		next;
		mes "[�P�`���b�v]";
		mes "�c�c�c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ȃ��̖��O�̓P�`���b�v�ł��ˁH";
		mes '@str$ +"�̐_�l��";
		mes "���ׂĂ�m���Ă��܂��B";
		mes "�B�����Ƃ��Ȃ��ł�����";
		mes "���l�тȂ���!!";
		next;
		mes "[�P�`���b�v]";
		mes "�ɂႠ��?!";
		mes "�ǂ����Ď��̖��O���H";
		mes "���������Ė{���Ɂc�c�B";
		emotion 0;
		next;
		mes "[�P�`���b�v]";
		mes "���߂�Ȃ����A���߂�Ȃ����B";
		mes '@str$ +"�̐_�l�`�B";
		mes "�����ĉ������B";
		emotion 28;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ق��ɂ����l�т��ׂ����Ƃ�";
		mes "����̂ł͂Ȃ��ł����H";
		mes "���̍ہA" +'@str$ +"�_�l��";
		mes "���ׂđł������A�����𐿂��̂ł��B";
		next;
		mes "[�P�`���b�v]";
		mes "^0000FF�c�����������ɈӖ��s����";
		mes "���y�p������Ԃ̂ɕ���������^000000";
		mes "�`�[������o��Ƃ��ɔL�Ƃ���";
		mes "�������Ⴂ���Ȃ���������������";
		mes "���܂��܂����B���݂܂���B";
		emotion 28;
		next;
		mes "[�P�`���b�v]";
		mes "���ꂩ��`�@���ꂩ��`";
		mes "�c�c�c�c�B";
		emotion 9;
		next;
		mes "["+strcharinfo(0)+"]";
		mes '@str$ +"�̐_�l�������܂����B";
		mes "�P�`���b�v�̍߂������Ă��Ɓc�c�B";
		mes "���ꂩ��͈��������킸�ɐ^�ʖڂ�";
		mes "�����Ă����Ȃ�����!!";
		next;
		mes "[�P�`���b�v]";
		mes '@str$ +"�̐_�l�`";
		mes "���肪�Ƃ��������܂��B";
		mes "���ꂩ��͈���������Ȃ�";
		mes "�ǂ��L�Ƃ��Đ����Ă����܂��B";
		next;
		mes "�]�P�`���b�v���`�[������o��";
		mes "�@���R�����������B";
		mes "�@���̔L��T���ɍs���Ă݂悤�]";
		setquest 5064;
		if(checkquest(5062)&&checkquest(5063)&&checkquest(5064)&&checkquest(5065)){
			setquest 71500;
			set MAL_3QUE,7;
		}
		close;
	default:
		if(MAL_3QUE >= 8) {
			mes "[�P�`���b�v]";
			mes "����!!�@���Ȃ��́c�c�B";
			next;
			mes "�]�P�`���b�v���������]";
			close;
		}
		mes "[�P�`���b�v]";
		mes "�Ђǂ��u�j�����Q�[�}�[�Y�v";
		mes "���͖߂�Ȃ��c�c�B";
		mes "�����N�́H";
		next;
		mes "�]�L���P���ė��������B";
		mes "�@���͋߂Â��Ȃ������ǂ��������]";
		close;
	}
}
malangdo.gat,181,119,7	script	�C�t#gamer	560,{
	switch(MAL_3QUE){
	case 6:
	case 7:
		if(checkquest(5065)){
			mes "[�C�t]";
			mes "����c�c���Ȃ���!!";
			mes "�ɂ��`�������������ɂ�`�B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�����������ĂȂ��Ƃ˂��c�c�B";
			mes "����Ɠ����̘b��";
			mes "�N�ɂ������ĂȂ��ł���ˁH";
			next;
			mes "[�C�t]";
			mes "�����ĂȂ��ɂ��`�B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�ǂ������I�@���!!";
			mes "���̔L�ɒ����Ă͂����܂����I";
			close;
		}
		mes "[�C�t]";
		mes "�N�ɂႠ��`�H";
		emotion 1;
		next;
		switch(select("�ׂ��b�𑕂��Ęb�𕷂�","�ˁc�c�L??","�u�j�����Q�[�}�[�Y�v�ɂ��āc�c")){
		case 1:
			break;
		case 2:
			mes "[�C�t]";
			mes "�����A�L�ł��ɂ��`�B";
			mes "�������Ɍ����܂����ɂ��H";
			mes "�ɂႠ��`�ςȐl�ɂ��B";
			close;
		case 3:
			mes "[�C�t]";
			mes "���͂��Ȃ���";
			mes "�������߂ĉ�����̂�";
			mes "�����܂��ɂ��`�B";
			mes "�ł��A�u�j�����Q�[�}�[�Y�v��";
			mes "�b�͂��Ȃ��łق����ɂ�`�B";
			close;
		}
		mes "[�C�t]";
		mes "�������ɂႠ��`�H";
		mes "�ǂ�ȏ��i���ׂ���ɂႠ��`�H";
		emotion 1;
		next;
		mes "�]�C�t�����܂�����悤";
		mes "�@�����Ŗׂ��肻����";
		mes "�@���i������͂��Ă��������]";
		next;
		input '@str$;
		mes "["+strcharinfo(0)+"]";
		mes "�ӂӁI�@�C�ɂȂ�悤�ł��ˁB";
		mes "�ȒP�ɖׂ���b�Ƃ����̂�";
		mes "�߂����ɂȂ��̂ł����c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����̓��b�L�[�ł���B";
		mes '@str$ +"�̔��蔃����";
		mes "�����ɂȂ�Ƃ����b��";
		mes "���������Ƃ���܂���ˁH";
		next;
		mes "[�C�t]";
		mes "�����`���������Ƃ���";
		mes "�悤�ȋC������ɂႠ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���[���~�b�h�K�b�c�����̎�s�ł���";
		mes "�v�����e����m���Ă��܂����H";
		next;
		mes "[�C�t]";
		mes "�v�����e���ɂ��H";
		mes "�������m���Ă���ɂ�`�B";
		emotion 18;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̓v�����e��������������";
		mes "�����Ă���";
		mes "����" +'@str$+ "�������āc�c�B";
		next;
		mes "[�C�t]";
		mes "���c�c����Łc�c�ɂႠ��H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c���̏��͘R��Ă͂����Ȃ�";
		mes "�ɔ���Ȃ̂Łc�c�B";
		mes "�N�ɂ��b���Ȃ��Ɩ񑩂��Ă���܂����H";
		next;
		mes "[�C�t]";
		mes "��c�c���C�t�͂��т�H�ׂ鎞�ȊO��";
		mes "���܂�����J���Ȃ��L���ɂႠ��`�B";
		mes "�S�z����Ȃɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�C�t�����M���܂��B";
		mes "�K���閧�͎���ĉ������B";
		next;
		mes "[�C�t]";
		mes "�킩�����ɂ��`�B";
		emotion 33;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ԃ��Ȃ����Љ�̑啨�B��";
		mes "10,000,000,000 zeny�𓊎�����\���";
		mes '@str$ +"��";
		mes "���蕨�ŏo�Ă���܂��āc�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����" +'@str$+ "��";
		mes "���܊ʋl��1���������";
		mes "���̊ʋl���c�c�B";
		next;
		mes "[�C�t]";
		mes "���̊ʋl���c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "100��!!";
		mes "100�ɂ܂ő�����";
		mes '@str$ +"�Ȃ�ł���B";
		mes "�����{�������悻100�{�ł��B";
		mes "100�{!!";
		next;
		mes "[�C�t]";
		mes "�ʋl��100���ɂႠ��`!!";
		emotion 23;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ǂ�قǓ����\�Ȃ�ł����H";
		mes "������x�̋��z��";
		mes "�������Ă���Ȃ��ƁA";
		mes "���̓����Ƃ����ɂ�";
		mes "���f�ɂȂ�̂Łc�c�B";
		next;
		mes "[�C�t]";
		mes "�������������ǁc�c�B";
		mes "�������Ȃ��ɂ��`�B";
		emotion 28;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������Ȃ��Ȃ�Z������";
		mes "���炦�΂���!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "������������΂��悻100�{!!";
		mes "���肪100�{�ɑ�����";
		mes '@str$ +"������A";
		mes "��s����̗Z�����󂯂�";
		mes "�������Ă����͂��܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Q�[���̃v���I�肾�������ȁH";
		mes "���̐E�Ƃ͈���I��";
		mes "�ŋߗL�]�炵���āc�c�B";
		mes "���̂悤�ȐE�Ƃł����";
		mes "��s�Ŋʋl��܂�";
		mes "�Z�����\���ƕ����܂������ǁc�c�B";
		next;
		mes "[�C�t]";
		mes "�ɂ��!!�@���c�c��c�c�B";
		mes "�ɂ�`���c�c�Q�[���̃v���I��A";
		mes "�j���G�X�g��������Ă����ɂ��B";
		mes "���ǁc�c��߂�������ɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����I";
		mes "�j���G�X�g���������̂ł���?!";
		mes "�ǂ����Ă��̂悤�ȗǂ��E�Ƃ�";
		mes "��߂���ł���!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ʋl���Z�����Ă������";
		mes "����������Ɓc�c�B";
		mes "��A�\�A�S�A��A���c�c!!";
		mes "���悻�\�����c�c�B";
		mes "�ʋl���\���ł���A";
		mes "�\����!!";
		next;
		mes "[�C�t]";
		mes "���c�c�\���c�c�ɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̂悤�ȐE�Ƃ��Ȃ��c�c�B";
		mes "���������Ȃ���߂��̂��A";
		mes "���R�����ł������ĉ������B";
		next;
		mes "[�C�t]";
		mes "^0000FF�c���̌������Ƃ�";
		mes "���Ă����Ȃ��Ȃ���^000000�ɂႠ��`�B";
		mes "�I��̂��Ƃ��j���G�X�g���Ƃ�";
		mes "�ĂԂ悤�ɂȂ��āA��������������";
		mes "������ƈႤ�Ǝv���ɂ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c���̌����Ă��邱�Ƃ�";
		mes "�����ł��Ȃ��Ă�߂���ł����B";
		mes "���ꂶ�ᓊ���ł��܂���ˁc�c�B";
		mes "���Ԃ𖳑ʂɂ����Ă��܂��܂����ˁc�c�B";
		mes "�c�O�ł��B";
		next;
		mes "[�C�t]";
		mes "���A����ȂɂႠ��`�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���������c�c�J��Ԃ��ɂȂ�܂����A";
		mes "�C�t�l��M�p����";
		mes "^ff0000�C�t�l�ɂ���^000000�b�������ł��B";
		mes "�N�ɂ�����Ȃ��ł��������ˁB";
		next;
		mes "�]�C�t���`�[�����o�����R���킩�����B";
		mes "�@���̔L��T���ɍs�����]";
		setquest 5065;
		if(checkquest(5062)&&checkquest(5063)&&checkquest(5064)&&checkquest(5065)){
			setquest 71500;
			set MAL_3QUE,7;
		}
		close;
	default:
		if(MAL_3QUE >= 8) {
			mes "[�C�t]";
			mes "�ɂ��I�@�N�͓����́H";
			mes "���A�������������ɂ��`�B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�l�Ⴂ�ł��B";
			next;
			mes "�]�C�t���C�Â����悤���B�����悤�]";
			close;
		}
		mes "[�C�t]";
		mes "�ɂ��ɂ��`�B";
		mes "�u�j�����Q�[�}�[�Y�v��";
		mes "�i���Ƀo�C�o�C���ɂ��B";
		mes "�ɂႠ��c�c�����N�́H";
		next;
		mes "�]�L���P���������ė��������B";
		mes "�@���͋߂Â��Ȃ������ǂ��������]";
		close;
	}
}

//============================================================
// �S�l�������j���X�̓`���N�G�X�gNPC
//------------------------------------------------------------
// MAL_4QUE -> 0�`7
//------------------------------------------------------------
mal_in02.gat,187,58,3	script	�������j���X#malqook01	548,{/* 59700 */
	if(BaseLevel < 40) {
		mes "�]^FF0000BaseLv��40�ȏ�Ȃ����";
		mes "�@�����Ȃ��悤���B^000000";
		mes "�@40�ȏ�ɂȂ�����܂����悤�]";
		close;
	}
	switch(MAL_4QUE){
	case 0:
	case 1:
	case 2:
		mes "[�������j���X]";
		mes "�H�ނɒ����N���Ă��܂��Ȃ��";
		mes "�|�������Ă�����";
		mes "��������Ă����!!";
		emotion 6;
		next;
		if(select("�ǂ����܂����H","��������")==2){
			mes "[�������j���X]";
			mes "�q���ɂ͋C�������";
			mes "���������Ă���̂�!!";
			emotion 6;
			close;
		}
		mes "[�������j���X]";
		mes "���͂��̑D�c�ŗB��̓��������l���B";
		mes "�����Ȃ�X�[�v�ł��o����";
		mes "�q�l�����ĂȂ��Ƃ��낾���A";
		mes "�N���̕s���ӂŐH�ނɒ���";
		mes "�N���Ă��܂����񂾁I";
		emotion 6;
		next;
		mes "�]�������͓{���";
		mes "�@���Y��Ă���悤���]";
		close;
	case 3:
		mes "[�������j���X]";
		mes "���͂��̑D�c�ŗB��̓��������l���B";
		mes "���̎��ɉ��̗p���H";
		next;
		switch(select("�L�^���p���̘b������","�N���[�j�����̘b������")){
		case 1:
			mes "[�������j���X]";
			mes "���[��H�@�L�^���p���H";
			mes "�L�^���p����";
			mes "�������̖�������Ă��ꂽ";
			mes "�̑�ȐH�ו������c�c�B";
			mes "���ꂪ�ǂ������H";
			emotion 1;
			next;
			mes "�]�L�^���p����{��������";
			mes "�@�����o���b�ƂƂ���";
			mes "�@�N���[�j�����̘b����������]";
			next;
			break;
		case 2:
			mes "[�������j���X]";
			mes "�N���[�j�������ƁI";
			mes "�����͎����܂�";
			mes "�{�点�����Ȃ̂�?!";
			emotion 6;
			next;
			mes "�]�}�ɍr�X�����Ȃ闿�������߂Ȃ���";
			mes "�@�N���[�j�����ɑ΂������ƂƂ���";
			mes "�@�L�^���p���ɂ��Ď������������]";
			next;
			break;
		}
		mes "[�������j���X]";
		mes "�܂�A���̖��͑S���L�^���p����";
		mes "�����ŋN�����Ƃ����̂��H";
		mes "�����������Ƃ��ȁH";
		next;
		menu "�����������ł���",-;
		mes "[�������j���X]";
		mes "�L�^���p����e���Ɉ����Ȃ�āA";
		mes "�c�c���́c�c���m�炸�Ȃ�I";
		mes "����ɉ��H";
		mes "�ЂƂ͑D������";
		mes "�������ƌ�������?!";
		emotion 6;
		next;
		mes "[�������j���X]";
		mes "�g�[�}�X�c�c�B";
		mes "�D�������ɗ��悵�Ė͔͓I�Ȏp��";
		mes "�����Ȃ���΂Ȃ�Ȃ��n�ʂɂ���z��";
		mes "�L�^���p����e���Ɉ����Ă����񂾂ȁH";
		next;
		mes "�]�o���o���]";
		next;
		mes "[�������j���X]";
		mes "���̔L�^���p���́I";
		mes "�����q�C�̍Œ��ɁI";
		mes "���������Q�����珕���Ă��ꂽ";
		mes "���肪�����H�ו��������I";
		mes "���͂Ƃ������A�Q�����ɂ�������O��";
		mes "���������Ă��ꂽ�H�ו��Ȃ񂾁I";
		next;
		mes "[�������j���X]";
		mes "�ꂩ���ł��񂩌��ł��I";
		mes "�S���ł�������o���Ă��I";
		mes "�΂��g�����Ƃ��ł��Ȃ��󋵂ł��I";
		next;
		mes "[�������j���X]";
		mes "�L���C�̏�Ŏ������̋󕠂�";
		mes "�������Ă��ꂽ���肪����";
		mes "���݂Ȃ񂾂�I";
		next;
		mes "[�������j���X]";
		mes "���̔L�^���p������邽�߂�";
		mes "�ǂꂾ�������̗������";
		mes "�L�B����J���������I";
		next;
		mes "[�������j���X]";
		mes "���ɒ蒅��������C���������̂�?!";
		mes "��̐▽�̏󋵂�";
		mes "�����Y�ꂽ�̂�?!";
		emotion 6;
		next;
		mes "�]�������͂ƂĂ���������";
		mes "�@�{������Ԃ��B";
		mes "�@�������Ԃ₢����A�������肵��";
		mes "�@�Ⴍ�����I�ȉ����o���Ă���]";
		next;
		mes "�]���������܂ő҂���";
		mes "�@�ēx���邱�Ƃɂ��悤�]";
		delquest 7264;
		setquest 7265;
		set MAL_4QUE,4;
		close;
	case 4:
		mes "[�������j���X]";
		mes "�N���c�c�B";
		mes "�������͏X�Ԃ��N���Ă��܂����ȁB";
		mes "�N�����΂炭�Ȃ��O�����Ԃ�";
		mes "���͈���f�������B";
		next;
		mes "[�������j���X]";
		mes "���ɒ蒅���A�L���ȐH�ו��Ɍb�܂��";
		mes "���_���ӂʂ��Ă��܂����悤������";
		mes "���ꂩ�����Ɉ��͕K���L�^���p����";
		mes "�x������悤�Ƀ��j���[��ς���I";
		next;
		mes "[�������j���X]";
		mes "�������L�^���p�������ɂ�";
		mes "�������K�v�����A���̓��ł�";
		mes "���肷�邱�Ƃ��ł��Ȃ��B";
		mes "�N�̗͂�݂��Ăق����B";
		next;
		mes "[�������j���X]";
		mes "���ɂł��ė��鎖��";
		mes "�\�ȕ��Ȃ牽�ł������B";
		mes "^4d4dff����10��^000000��";
		mes "^4d4dff�W���ȃ\�[�X1�r^000000��";
		mes "�����Ă��Ăق����B";
		next;
		mes "[�������j���X]";
		mes "���n�ł͊ȒP�Ɏ�ɓ��邾�낤�H";
		mes "���ɕK�v�ȕ��͎����p�ӂ���B";
		next;
		mes "[�������j���X]";
		mes "�ʋl�Ȃ񂩂Ɏ������ꂽ";
		mes "�Â������ߒ����Ă��B";
		mes "�C�_�̓{��̂悤��";
		mes "��ɂ��v���[���g���Ă��I";
		mes "�N�t�t�t�j���j���j��!!";
		emotion 32;
		delquest 7265;
		setquest 7266;
		set MAL_4QUE,5;
		close;
	case 5:
		if(countitem(577)>=10 && countitem(7454)>=1){
			mes "[�������j���X]";
			mes "�����Ă��Ă��ꂽ���B�B";
			mes "�ӂށA���i�g���Ă���̂Ə����Ⴄ��";
			mes "���v���낤�B����������B";
			mes "�@";
			mes "�]�������̓{��͎��܂����悤���B";
			mes "�@�N���[�j�����ɕ񍐂ɂ������]";
			delitem 577, 10;
			delitem 7454, 1;
			delquest 7266;
			setquest 71450;
			set MAL_4QUE,6;
			close;
		}
		mes "[�������j���X]";
		mes "�L�^���p�������ɂ͍������K�v�����A";
		mes "���̓��ł͓��肷�邱�Ƃ��ł��Ȃ��B";
		mes "�N�̗͂�݂��Ăق����B";
		next;
		mes "[�������j���X]";
		mes "���ɂł��ė��鎖��";
		mes "�\�ȕ��Ȃ牽�ł������B";
		mes "^4d4dff����10��^000000��";
		mes "^4d4dff�W���ȃ\�[�X1�r^000000��";
		mes "�����Ă��Ăق����B";
		close;
	default:
		mes "[�������j���X]";
		mes "�N�t�t�t�j���j���j��!!";
		mes "���ꂩ�����Ɉ���";
		mes "�K���L�^���p�����x������悤��";
		mes "���j���[��ς��邼�I";
		next;
		mes "[�������j���X]";
		mes "�ʋl�Ȃ񂩂Ɏ������ꂽ";
		mes "�Â������ߒ����Ă��!!";
		close;
	}
}

mal_in02.gat,76,63,7	script	�N���[�j����#malqook02	544,{
	switch(MAL_4QUE){
	case 0:
		mes "�]�D���̔L�����������ɋ����Ă���]";
		emotion 28;
		next;
		mes "[�N���[�j����]";
		mes "�k�j���I�k�j�����I�k�j�������I";
		mes "���c�c�́c�c�p�c�c�ɂ�";
		mes "�����m��Ȃ��ɂ�c�c�B";
		emotion 28;
		next;
		mes "�]�܂Ƃ��Ɍ��t��b���Ă��Ȃ��]";
		next;
		if(select("�Ԃ߂�","��������")==2){
			mes "�]���������ɋ����Ă���";
			mes "�@�L�ɔw���������]";
			close;
		}
		mes "�]�������킸�ɗׂɗ���";
		mes "�@�����~�ނ̂�҂��Ȃ���Ԃ߂��]";
		next;
		emotion 28;
		mes "[�N���[�j����]";
		mes "���́c�c���͉������ɂ�B";
		mes "�������l�́c�c�����������{��ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "���͖{���Ɋ撣���đ|�����Ă���ɂ�B";
		mes "�����ǂǂ����猻�ꂽ���킩��Ȃ�";
		mes "�����炪�H�ނɎ��t�����ɂ�c�c�B";
		next;
		menu "������H",-;
		mes "[�N���[�j����]";
		mes "�������ɂ�B";
		mes "�����c���c�����Ă���";
		mes "�ł��������đ����ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "�����c�c�B";
		mes "�����O�l�O�l�����������ɂ�c�c�B";
		mes "�������l�͉q���ɂ͌������ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "�܂������ɂ�B�q���������B";
		mes "�����������̂͂ɂ�B";
		mes "�{���Ɉꏊ��������߂܂��Ă���ɂ�B";
		mes "�|�����撣���Ă���ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "�Ȃ̂ɒ����Ȃ��Ȃ�Ȃ��ɂ�B";
		mes "�������猻���̂�������Ȃ��ɂ�[�B";
		next;
		if(select("��������ȏ�͕����Ȃ�","�����o���ꏊ�𕷂�")==1){
			emotion 28;
			mes "[�N���[�j����]";
			mes "�c�c���̕\��͉����ɂ�H";
			mes "���Ȃ������ł��������";
			mes "�v���ăr�r�����̂��ɂ�H ";
			mes "�c�c���������Ǝv���Ă���ɂ�B";
			mes "�������ɂ�[�B";
			next;
			mes "�]�N���[�j�������ēx�����n�߂��B";
			mes "�@��l�ɂ��Ă����悤�]";
			close;
		}
		mes "[�N���[�j����]";
		mes "�N���s���Č��Ă����̂��ɂ�H";
		mes "�i�r���̂�����ꏊ��";
		mes "�ڍׂɒ������Ă����̂��ɂ�H";
		mes "���̂܂܂ł͉�������";
		mes "�ς����Ȃ��ɂ�I";
		next;
		mes "[�N���[�j����]";
		mes "�m���Ɏ����m��Ȃ�����������ɂ�B";
		mes "�ɂ�c�c���͂�����|�����Ă��邩��";
		mes "���̑���Ɍ�����������";
		mes "���ꂽ�珕����ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "�����悭�����̂�";
		mes "^FF0000�D�����A�D���̃x�b�h�̋߂��A";
		mes "�H���̒�����߂�^000000��3�����ɂ�B";
		mes "��낵�����ނɂ�B";
		setquest 7260;
		set MAL_4QUE,1;
		close;
	case 1:
		mes "[�N���[�j����]";
		mes "�i�r���̂�����ꏊ��T���Ă݂�";
		mes "�����������錴���������Ă���ɂ�B";
		mes "�N���������肾�ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "�����悭�����̂�";
		mes "^FF0000�D�����A�D���̃x�b�h�̋߂��A";
		mes "�H���̒�����߂�^000000��3�����ɂ�B";
		mes "��낵�����ނɂ�B";
		close;
	case 2:
		emotion 0;
		mes "[�N���[�j����]";
		mes "����͉��ł����ɂ�H";
		mes "�܂����L�^���p���c�c�B";
		mes "��������Ȃ���u���ꂽ�悤�ȁB";
		mes "�܂����c�c�I";
		next;
		menu "�����A���̂܂�������",-;
		emotion 9;
		mes "[�N���[�j����]";
		mes "�D���B���L�^���p����";
		mes "�B�����܂ܕ��u���āA";
		mes "�������璎���N������ł����ɂ�c�c�B";
		mes "����ȉ������Ӌ@�̂����ŗ������l��";
		mes "�����{��ꂽ�̂��ɂ�H";
		mes "���킠�����I";
		next;
		emotion 23;
		menu "�������Ӌ@�H",-;
		mes "[�N���[�j����]";
		mes "�����ɂ�B";
		mes "����͍q�C���ɕۊǂ��Ղ��l��";
		mes "�ł��Ă����p�����ɂ�B";
		mes "���������܂�ɂ��ł��ĕ��ʂɊ��񂾂�";
		mes "�����܂�Ă��܂��񂾂ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "�����ۊǂ��邱�Ƃ��l���āA";
		mes "�������ɉ���������ďĂ������̂�����";
		mes "�����������Ȃ����c�c�B";
		mes "�����c�c��������Ă���ɂ�B";
		next;
		mes "�]�N���[�j�����͔L�^���p����";
		mes "�@�n���}�[���S�i�����ˁj�𗘗p����";
		mes "�@��ɕ��������̂����ɒu���A";
		mes "�@������g���g���ƒ@�����B";
		mes "�@��������c�c�]";
		next;
		mes "[�N���[�j����]";
		mes "�c�c��������o�Ă���̂�������ɂ�H";
		mes "���ɂ�c�c�B";
		mes "�������ĔL�^���p������u�����";
		mes "�����������񔭐�����ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "�ǂ��̂ǂ����͒m��Ȃ�����";
		mes "�{���ɐH�ׂ����Ȃ������悤���ɂ�B";
		mes "�����͑������ɒ蒅���ă��j���[��";
		mes "�ς��O�ɕ��u���ꂽ���ł��ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "���ɒ蒅���Ă���͂����Ƃ����H�ނ�";
		mes "��ɓ���鎖���ł�������A";
		mes "�L�^���p���͍���ĂȂ������̂Ɂc�c�B";
		mes "�c�c�B";
		next;
		mes "[�N���[�j����]";
		mes "����𗿗����l�Ɍ����ăN���[�j������";
		mes "�{���ɑ|�����Y��ɂ��Ă�����";
		mes "�`���Ă���ɂ�B";
		mes "��c�c���͂܂��������l���|���āc�c�B";
		mes "�c�c���ނɂ�I";
		delquest 7261;
		delquest 7262;
		delquest 7263;
		delquest 7260;
		setquest 7264;
		set MAL_4QUE,3;
		next;
		mes "[�N���[�j����]";
		mes "�������A�������L�^���p����";
		mes "�܂��H�ׂ�邩��H�ׂĂ݂�ɂ�B";
		mes "�ǂ�ȕ��Ȃ̂��C�ɂȂ�Ȃ��ɂ�H";
		mes "�����ڂ͂��܂���������";
		mes "�ǂ��H���������ɂ�c�c�B";
		close;
	case 3:
		mes "[�N���[�j����]";
		mes "�������l�ɔL�^���p����������";
		mes "�������璎�����������ƌ�����";
		mes "���̌���������邾�ɂ�B";
		next;
		menu "���ڍs���΁H",-;
		mes "[�N���[�j����]";
		mes "���ꂪ�c�c��c�c���͂��܂���";
		mes "�|�������Ȃ���΂Ȃ�Ȃ�����";
		mes "�c���Ă��邵�c�c�B";
		mes "�������l�͂܂��|�����c�c";
		mes "�����玄�̑���ɍs���Ă���ɂ�B";
		close;
	case 4:
		mes "[�N���[�j����]";
		mes "�������l���{���Ă���ɂ�H";
		mes "����Ȏ��͂Ƃɂ����ӂ�ɂ�I";
		close;
	case 5:
		mes "[�N���[�j����]";
		mes "�������l�͔L�^���p����";
		mes "�����Ɠ{���Ă���H";
		mes "�ł͂������͋����Ȃ�����";
		mes "�����̂��ɂ�H";
		next;
		mes "[�N���[�j����]";
		mes "�������l���K�v�Ƃ��Ă��镨��";
		mes "���ł������čs���Ă���ɂ�`�B";
		mes "���������������݂���";
		mes "�����񂶂�Ȃ��ɂ�H";
		next;
		mes "[�N���[�j����]";
		mes "�������l��������";
		mes "���S�ɓ{�肪���܂����痈�Ă���ɂ�B";
		mes "����܂ł͕s����";
		mes "�|�����ł��Ȃ��ɂ�c�c�B";
		next;
		mes "�]�������𖞑������邽�߂ɁA";
		mes "�@�L�^���p���̍ޗ���";
		mes "�@�͂��邱�Ƃɂ��悤�]";
		close;
	case 6:
		mes "[�N���[�j����]";
		mes "�������l�̗��݂͂����ƏI�����́H";
		mes "�������ǂ����ĔL�^���p�������ɂ�H";
		next;
		menu "�N�B�̐V�����H����",-;
		mes "[�N���[�j����]";
		mes "�j���I�I�I�I��!!";
		mes "�M���A�A�I�H�H�H�H�H�I��!!";
		mes "�j���E�E�c�c�E�j���A�A�I���I";
		next;
		mes "[�N���[�j����]";
		mes "�_���ɂ�!!!!!!";
		mes "�L�^���p���������Ɠ����";
		mes "�V���������̂ɂ܂��n���ɖ߂�ɂ�!!";
		mes "�j���I���j���I���t�j���A�A�I�I�I��";
		next;
		switch(select("�����̉�����������","�@���ł�","�K��������")){
		case 1:
			mes "[�N���[�j����]";
			mes "�j���I�I�c�c�S���S���c�c�B";
			mes "�t�M���I���c�c�B";
			mes "�t�@�t�@�c�c�S���S���S���c�c�B";
			next;
			break;
		case 2:
			mes "[�N���[�j����]";
			mes "�t�M�����I";
			mes "�E�j���j���j���j���j���j�����I";
			mes "�}�ɂȂ񂾂ɂ�I";
			next;
			break;
		case 3:
			mes "[�N���[�j����]";
			mes "�t�M���A�A�A��";
			mes "�t�j�����E�j���j�����I";
			mes "�ȁc�c�Ȃ񂾂ɂ�I";
			next;
			break;
		}
		
		mes "[�N���[�j����]";
		mes "���c�c���������ɂ�B";
		mes "������������������B";
		mes "�������l�̌v���";
		mes "��`���킩�����ɂ�c�c�B";
		next;
		mes "[�N���[�j����]";
		mes "���낵�����ɂȂ�ɂ�c�c�B";
		mes "���j���[���ς���ĔL�^���p����";
		mes "�x�������Ɛ�Ό����ɂ�B";
		next;
		menu "�����H",-;
		mes "[�N���[�j����]";
		mes "�킩��Ȃ��̂��ɂ�H";
		mes "�L�^���p���𖧂��ɉB���L�B�ɂ�B";
		mes "�������l���|�����甽�R������A";
		mes "�ڂ̑O�Ŏ̂Ă��肷��z�͂��Ȃ��ɂ�B";
		next;
		mes "[�N���[�j����]";
		mes "��΂ɔL�^���p����";
		mes "�B���n�߂�Ǝv�����c�c�B";
		mes "��������Ƃ܂������o��ɂ�I";
		mes "�������l�ɂ܂��{����ɂ�I";
		next;
		mes "[�N���[�j����]";
		mes "������L�^���p�����x������閾������";
		mes "���������Ȃ��Ƃ����Ȃ��ɂ�B";
		mes "��������Z�����Ȃ�ɂႠ�`�B";
		next;
		mes "[�N���[�j����]";
		mes "���������Ă��ꂽ�l�Ԃ̌N�I";
		mes "�����͂��肪�Ƃɂ�B";
		mes "����͊��ӂ̋C�������ɂ�B";
		if(!checkweight(12636,50)) {
			next;
			mes "[�N���[�j����]";
			mes "�ɂ�`";
			mes "�ו��������ς���";
			mes "���炪�n���Ȃ��ɂ�`�B";
			close;
		}
		getitem 12636, 50;
		for(set '@i,0;'@i<10;set '@i,'@i+1)
			getexp 100000,0;
		for(set '@i,0;'@i<20;set '@i,'@i+1)
			getexp 0,5000;
		delquest 71450;
		setquest 201420;
		set MAL_4QUE,7;
		close;
	default:
		mes "[�N���[�j����]";
		mes "���͑|������L�N���[�j�����`";
		mes "�ɂ�`";
		mes "���l�̉Ƃ̔��Œ܂������ɂ�`";
		mes "�ɂ�`�H�@���������ɂ�H";
		mes "����͎����|�����鎞�̉̂��ɂ�B";
		close;
	}
OnInit:
	waitingroom "�S�l�������j���X�̓`��", 0;
	end;
}

mal_in02.gat,29,67,0	script	�D�����̂���#malqook03	844,{
	switch(MAL_4QUE){
	case 1:
	case 2:
		if(checkquest(7261)){
			mes "�]�N�������u���Ă���";
			mes "�@�L�^���p���̂����ŁA";
			mes "�@���̏Z�݉ƂɂȂ��Ă����悤���B";
			mes "�@���͂��ׂĕЕt��������";
			mes "�@���Ȃ������Ɍ�����]";
			close;
		}
		mes "�]�D�����̂��݂ɂ��炭���B��";
		mes "�@�����ς��ς����Ă���B";
		mes "�@�肪�͂��Ȃ��ꏊ�Ȃ̂�";
		mes "�@�N���[�j���������̉��܂ł�";
		mes "�@�|�����ł��Ȃ������悤���]";
		next;
		mes "[�g�[�}�X����]";
		mes "���ށH�@�N�͂����ŉ������Ă���񂾁H";
		mes "�����͐G��Ȃ��ł���I";
		cutin "ma_tomas03.bmp", 2;
		next;
		if(select("���݂܂���","�|�����Ă����܂���I")==1){
			cutin "ma_tomas01.bmp", 2;
			mes "[�g�[�}�X����]";
			mes "���t���ʂ���悤���ˁB";
			mes "�N�̂悤�Ȗ`���Ƃ�";
			mes "������T��K�v�͂Ȃ���B";
			mes "�����o�čs���Ă���B";
			close2;
			cutin "ma_tomas03.bmp", 255;
			end;
		}
		cutin "ma_tomas03.bmp", 255;
		mes "�]�~�߂�g�[�}�X�𖳎������Ɏ��";
		mes "�@�L�΂��ăK���N�^�̉��𒲂ׂČ����B";
		mes "�@����Ƃ��̎��c�c�]";
		next;
		//
		initnpctimer;
		set '@count,rand(1,3);
		monster "this",30,67,"�f���������e",1053,'@count,"�D�����̂���#malqook03::OnKilled";
		
		emotion 0,"";
		mes "�]�����e���ʂ�߂��A���̏ꏊ��";
		mes "�@������u���Ă������̂�������Ȃ�";
		mes "�@�L�^���p�����������]";
		next;
		if(!checkweight(11536,1)) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		setquest 7261;
		getitem 11536, 1;
		next;
		if(checkquest(7261)&&checkquest(7262)&&checkquest(7263)){
			mes "�]���̂��炢���ׂ��Ȃ�[�����B";
			mes "�@���u���ꂽ�L�^���p���̂�����";
			mes "�@�������������悤����";
			mes "�@�N���[�j�����ɓ`���悤�]";
			set MAL_4QUE,2;
		}else{
			mes "�]�����������Ă����ꏊ��";
			mes "�@���̈ꂩ���������悤���]";
		}
		close;
	default:
		mes "�]���͂����ɗp�͂Ȃ��]";
		close;
	}

OnKilled:
	set '@count,getmapmobs("this","�D�����̂���#malqook03::OnKilled");
	if('@count<=0)stopnpctimer;
	end;
OnTimer15000:
	stopnpctimer;
	killmonster "this","�D�����̂���#malqook03::OnKilled";
	end;
}

mal_in02.gat,183,49,0	script	���C��#malqook04	844,{
	switch(MAL_4QUE){
	case 1:
	case 2:
		if(checkquest(7263)){
			mes "�]�N�������u���Ă���";
			mes "�@�L�^���p���̂����ŁA";
			mes "�@���̏Z�݉ƂɂȂ��Ă����悤���B";
			mes "�@���͂��ׂĕЕt��������";
			mes "�@���Ȃ������Ɍ�����]";
			close;
		}
		mes "�]���ɐݒu���ꂽ���C�����B";
		mes "�@������Ƃ��Ȃ�߂��ꏊ������";
		mes "�@�ǂ����悤���ȁH�]";
		next;
		if(select("�K���ɒ��ׂĂ݂�","���C�����O���Ă݂�")==1){
			mes "�]���C���𒲂ׂČ������A";
			mes "�@���ɖ��ɂȂ肻���ȕ�����";
			mes "�@�����鎖���ł��Ȃ������]";
			close;
		}
		mes "�]�ォ�猩��Ɩ��Ȃ���";
		mes "�@�C�ɂȂ����̂ŊO���Ă݂��B";
		mes "�@���C�p�ʘH�̏��ɉ�����������B";
		mes "�@����Ƃ��̎��c�c�]";
		next;
		//
		initnpctimer;
		set '@count,rand(1,3);
		monster "this",183,49,"�f���������e",1053,'@count,"���C��#malqook04::OnKilled";
		
		mes "�]�����e���ʂ�߂��A��������";
		mes "�@���B������������Ȃ�";
		mes "�@�L�^���p�����������]";
		emotion 0,"";
		next;
		if(!checkweight(11536,1)) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		setquest 7263;
		getitem 11536, 1;
		next;
		if(checkquest(7261)&&checkquest(7262)&&checkquest(7263)){
			mes "�]���̂��炢���ׂ��Ȃ�[�����B";
			mes "�@���u���ꂽ�L�^���p���̂�����";
			mes "�@�������������悤����";
			mes "�@�N���[�j�����ɓ`���悤�]";
			set MAL_4QUE,2;
		}else{
			mes "�]�����������Ă����ꏊ��";
			mes "�@���̈ꂩ���������悤���]";
		}
		close;
	default:
		mes "�]���͂����ɗp�͂Ȃ��]";
		close;
	}

OnKilled:
	set '@count,getmapmobs("this","���C��#malqook04::OnKilled");
	if('@count<=0)stopnpctimer;
	end;
OnTimer15000:
	stopnpctimer;
	killmonster "this","���C��#malqook04::OnKilled";
	end;
}

mal_in02.gat,103,22,0	script	�x�b�h#malqook05	844,{
	switch(MAL_4QUE){
	case 1:
	case 2:
		if(checkquest(7262)){
			mes "�]�N�������u���Ă���";
			mes "�@�L�^���p���̂����ŁA";
			mes "�@���̏Z�݉ƂɂȂ��Ă����悤���B";
			mes "�@���͂��ׂĕЕt��������";
			mes "�@���Ȃ������Ɍ�����]";
			close;
		}
		mes "�]�D���B���g���Ă���x�b�h���B";
		mes "�@�т������ς������Ă��ĉ����B";
		mes "�@�x�b�h���ݒu���ꂽ�[�̕�����";
		mes "�@�肪�͂��Ȃ��ꏊ�Ȃ̂ŋC�ɂȂ�]";
		next;
		if(select("�}�b�g���X�������������Ă݂�","�x�b�h�̉��𒲂ׂĂ݂�")==2){
			mes "�]�x�b�h�̉��𒲂ׂČ������A";
			mes "�@���ɖ��ɂȂ肻���ȕ�����";
			mes "�@�����鎖���ł��Ȃ������B";
			mes "�@�N���[�j�������|����";
			mes "�@�����̂�������Ȃ����A";
			mes "�@����Ȃɉ���Ă͂��Ȃ������]";
			close;
		}
		mes "�]�ǂ̊p�̕����ɖ������Ă��镔����";
		mes "�@�������炵�Ă݂��B";
		mes "�@����Ƃ��̎��c�c�]";
		next;
		//
		initnpctimer;
		set '@count,rand(1,3);
		monster "this",103,22,"�f���������e",1053,'@count,"�x�b�h#malqook05::OnKilled";
		
		mes "�]�����e���ʂ�߂��A���̏ꏊ����";
		mes "�@���B������������Ȃ�";
		mes "�@�L�^���p�����������]";
		emotion 0,"";
		next;
		if(!checkweight(11536,1)) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		setquest 7262;
		getitem 11536, 1;
		if(checkquest(7261)&&checkquest(7262)&&checkquest(7263)){
			mes "�]���̂��炢���ׂ��Ȃ�[�����B";
			mes "�@���u���ꂽ�L�^���p���̂�����";
			mes "�@�������������悤����";
			mes "�@�N���[�j�����ɓ`���悤�]";
			set MAL_4QUE,2;
		}else{
			mes "�]�����������Ă����ꏊ��";
			mes "�@���̈ꂩ���������悤���]";
		}
		close;
	default:
		mes "�]�D���B���g�p���Ă����x�b�h�B";
		mes "�@�L�̖т������ς����Ă���]";
		close;
	}

OnKilled:
	set '@count,getmapmobs("this","�x�b�h#malqook05::OnKilled");
	if('@count<=0)stopnpctimer;
	end;
OnTimer15000:
	stopnpctimer;
	killmonster "this","�x�b�h#malqook05::OnKilled";
	end;
}

malangdo.gat,214,204,3	script	[�L�̎�`���c] ���b�V	559,{
	mes "�]�����т̎e�L��";
	mes "�@�ʔ����`�������@�B��";
	mes "�@�����ɂȂ��Ă���]";
	next;
	mes "[�����L]";
	mes "���񂤂�A���삪�ł������I";
	close;
}

malangdo.gat,215,201,3	script	[�L�̎�`���c]���N	553,{
	mes "�]�����т̎e�L��";
	mes "�@�����e�L�Ƌ���";
	mes "�@�ʔ����`�̋@�B��O��";
	mes "�@���킵�Ȃ������Ă���]";
	next;
	mes "[�����L]";
	mes "���ꂪ����������";
	mes "�����ς��V�ׂ�ˁI";
	close;
}

malangdo.gat,172,178,7	script	���T��	560,{
	cutin "mal_homnya_n",2;
	mes "[���T��]";
	mes "��H";
	mes "�ɂ�ɂႠ�c�c�������ɂ�B";
	mes "�N���ɂ�I";
	next;
	mes "[���T��]";
	mes "�܁A�܂܂܂܂����Ɛl�ɂ�!?";
	mes "�������T��ƒm��";
	mes "�Ԃ����Ƃ���Ă����ɂ�!?";
	cutin "mal_homnya_s",2;
	next;
	mes "[���T��]";
	mes "�ɁA������ɂႠ����!!!!";
	mes "�@";
	mes "[�j�����X��]";
	mes "�����邼�A�F��I";
	close2;
	cutin "mal_homnya_s",255;
	end;
}

malangdo.gat,173,177,7	script	���T��̗F	559,{
	cutin "mal_homnya_n",2;
	mes "[�j�����X��]";
	mes "���͖��T��z���j���̗F�I";
	mes "�j�����X���ł���I�@�j���I";
	next;
	mes "[�z���j��]";
	mes "�ɂႠ�`�j�����X����";
	mes "�z���j���̂ƂȂ��";
	mes "�w��������A�F��x��";
	mes "���Ƃ��������Ȃ̂ɂႠ�B";
	mes "�킩��Ȃ����Ƃ͖��T���";
	mes "�����Ăق����񂾂ɂ�B";
	next;
	mes "[�j�����X��]";
	mes "��������A�F��I";
	close2;
	cutin "mal_homnya_n",255;
	end;
}

malangdo.gat,176,165,3	script	�b���u�r	544,{
	mes "[�u�r]";
	mes "�����l�Ԃ��[�I";
	mes "�ǂ����Ă����ɗ����ɂ�H";
	mes "���������āA";
	mes "��������i�X�|�b�g����";
	mes "�C�Â���������ɂ��H";
	close;
}
