//���l
-	script	NoviceExchange	-1,{
	if(Weight*100/MaxWeight >= 90) {
		mes "[���l]";
		mes "���������I";
		mes "���͂���Ȃ�������";
		mes "���ł���ȂɎ��������Ă�񂾁H";
		mes "�J�v���̑q�ɂɂł��a���Ă����B";
		close;
	}
	set '@code,strnpcinfo(5);	//���ʎq��#�ȍ~�̕�������Q�Ƃ��Đ��l�ɕϊ�
	switch('@code) {
		case 0:	//prontera
			setarray '@need,935,914,909;	//��������A�ȖсA�[���s�[
			setarray '@amount,5,10,10;	
			break;
		case 1:	//geffen
			setarray '@need,935,915,909;	//��������A���Ȃ��̔�A�[���s�[
			setarray '@amount,5,6,10;
			break;
		case 2:	//morocc
			setarray '@need,935,916,909;	//��������A���̉H�сA�[���s�[
			setarray '@amount,5,7,10;
			break;
		case 3:	//aldebaran
			setarray '@need,955,916,909;	//峂̔�A���̉H�сA�[���s�[
			setarray '@amount,1,7,10;
			break;
		case 4:	//payon
			setarray '@need,902,909;	//�؂̍��A�[���s�[�A0
			setarray '@amount,6,10;
			break;
	}
	mes "[���l]";
	mes "����ɂ��́I";
	mes "���̂��u" +getitemname('@need[0])+ "�v��u" +getitemname('@need[1])+ "�v";
	mes "�Ƃ����A�C�e���������ĂȂ����H";
	if('@code < 4)
		mes "���A�u�[���s�[�v�ł��������B";
	mes "���������Ă���A���ɏ���";
	mes "�����Ă���Ȃ����B";
	next;
	mes "[���l]";
	mes "�������A�����ł��炨���Ȃ��";
	mes "�킯����Ȃ��B�������ȁc�c";
	mes "�u" +getitemname('@need[0]) + '@amount[0]+ "�v���u" +getitemname('@need[1]) + '@amount[1]+ "�v";
	if('@code < 4)
		mes "�܂��́u�[���s�[10�v��";
	mes "�u�ԃ|�[�V����1�v��";
	mes "��������̂͂ǂ����H";
	next;
	switch (select("�����ł���I","���������Ă�C���c�c","���ł��I")) {
	case 1:
		mes "[���l]";
		mes "�u" +getitemname('@need[0])+ "�v���u" +getitemname('@need[1])+ "�v";
		if('@code < 4)
			mes "�������́u�[���s�[�v�B";
		mes "�����A�ǂ�ƌ�������񂾁H";
		next;
		if('@code<4)
			set '@talk$,"�u�[���s�[�v���u�ԃ|�[�V�����v��";
		//payon�̎���3�Ԗڂ̑I�����o�Ȃ�
		set '@i,select("�u"+getitemname('@need[0])+"�v���u�ԃ|�[�V�����v��","�u"+getitemname('@need[1])+"�v���u�ԃ|�[�V�����v��",'@talk$,"��߂Ă����܂�")-1;
		if('@i==3) {
			mes "[���l]";
			mes "�������c�c";
			mes "�܂��A�C����������܂����ȁB";
			close;
		}
		set '@have,countitem('@need['@i]);	//�����A�C�e��������
		if('@have < '@amount['@i]) {
			mes "[���l]";
			if('@code < 4 || '@i > 0)		//�t�F�C�����Ŗ؂̍���I�񂾏ꍇ�͕\������Ȃ��B(���̒n��͖�����)
				mes "�����I";
			mes getitemname('@need['@i])+ "�͂ǂ��ɂ���񂾁H";
			mes "������Ȃ�ł�" +getitemname('@need['@i])+ "��" +'@amount['@i]+ "�Ȃ���";
			mes "�ԃ|�[�V�����͓n���Ȃ����B";
			close;
		}
		mes "[���l]";
		mes "���肪�Ă��I";
		mes "���ꂶ��A���������悤���H";
		mes "���傢�ƌ����Ă݂ȁB";
		next;
		set '@max,'@have / '@amount['@i];	//�����\��
		mes "[���l]";
		mes getitemname('@need['@i])+ "��" +'@have+ "��";
		mes "����̂��c�c���������";
		mes "�ԃ|�[�V������" +'@max+ "�܂�";
		mes "�����ł��邼�B";
		next;
		mes "[���l]";
		mes getitemname('@need['@i])+ "��ԃ|�[�V�����ƌ������邩�H";
		next;
		if(select("�������܂�","����ς��߂Ă����܂�")==2) {
			mes "[���l]";
			mes "�c�c�d���˂��ȁB";
			mes "�܂��A�C���������痈�Ă����B";
			close;
		}
		mes "[���l]";
		mes "�ԃ|�[�V�����͍ő剽���炦�邩��";
		mes "����������������A�킩���Ă�ȁH";
		next;
		mes "[���l]";
		mes "��x�Ɍ����ł���ԃ|�[�V�����̐���";
		mes "�ŏ���1�A�ő��100���B";
		mes "������������C���Ȃ��Ȃ�u0�v��";
		mes "�����Ă���B";
		while(1) {
			next;
			input '@val;
			if('@val<0 || '@val>100) {
				mes "[���l]";
				mes "��x�Ɍ����ł���̂�";
				mes "100�܂ł����Č���������I";
				mes "�d���˂��ȁA������񕷂��Ă��B";
				mes "���ɂ���񂾁H";
				continue;
			}
			break;
		}
		if('@val == 0) {
			mes "[���l]";
			mes "���������A�����Ȃ�����B";
			mes "���҂����邾�������Ă����āc�c";
			mes "�d���˂��ȁB�C����������";
			mes "�܂����Ă����B";
			close;
		}
		if('@val > '@max) {
			mes "[���l]";
			mes "�����I���ꂶ�Ⴀ�A" +getitemname('@need['@i])+ "��";
			mes "����Ȃ�����H�ԃ|�[�V������";
			mes "���܂Ō����ł��邩�A�������";
			mes "�m�F���Ă��痈����B";
			close;
		}
		delitem '@need['@i],'@amount['@i]*'@val;
		getitem 501,'@val;
		mes "[���l]";
		mes "�����I���ꂪ�ԃ|�[�V�������B";
		mes "�m�F���Ă���B���肪�Ƃ�B";
		mes "���͂́[�I";
		close;
	case 2:
		mes "[���l]";
		mes "�����Ă邩�������āH���͂́[�B";
		mes "�S�R����Ȃ��Ƃ͂Ȃ��͂������B";
		mes "�ǂ��炩�ƌ����΁A���̕���";
		mes "���ɂȂ�B�܂��A���̏�����";
		mes "�C�ɂ���Ȃ��Ȃ�d���Ȃ����B";
		close;
	case 3:
		mes "[���l]";
		mes "�c�c�`�b�B�d���˂��ȁB";
		mes "�܂��C���������痈�Ă����B";
		close;
	}
}

prontera.gat,123,102,5	duplicate(NoviceExchange)	���l::NoviceExchange#0	85
geffen.gat,173,88,5	duplicate(NoviceExchange)	���l::NoviceExchange#1	85
morocc.gat,180,259,3	duplicate(NoviceExchange)	���l::NoviceExchange#2	85
aldebaran.gat,152,63,5	duplicate(NoviceExchange)	���l::NoviceExchange#3	85
payon.gat,200,134,5	duplicate(NoviceExchange)	���l::NoviceExchange#4	85


//�y���b�N�X
//  �� @change_jellopy

alberta.gat,190,173,3	script	�y���b�N�X	85,{
	if(@change_jellopy == 0) {
		mes "[�y���b�N�X]";
		mes "�Ȃ񂾁A���ɉ����p���H";
		mes "�����畨�~�������Ȋ炵������";
		mes "�������񂼁B";
		next;
		mes "[�y���b�N�X]";
		mes "�����~�����Ȃ�d��������A�d�����I";
		mes "��H�d�����Ȃ������āH";
		mes "�d���˂��ȁc�c";
		next;
		mes "[�y���b�N�X]";
		mes "���Ⴀ�A�[���s�[��10�W�߂Ă����B";
		mes "������ƏW�߂Ă����炻�̕�V�Ƃ���";
		mes "�ԃ|�[�V��������낤�B";
		next;
		mes "[�y���b�N�X]";
		mes "10�������Ȃ�A3�ł��������B";
		mes "�[���s�[��3�W�߂Ă�����";
		mes "��������낤�B";
		next;
		mes "[�y���b�N�X]";
		mes "�[���s�[����ɓ��ꂽ��";
		mes "�܂������ɗ��ȁB";
		if(countitem(909))
			set @change_jellopy,1;
		close;
	}
	mes "[�y���b�N�X]";
	mes "�����A�[���s�[���W�߂Ă����̂��B";
	mes "�悵�I�ԃ|�[�V����������";
	mes "�ǂ����ƌ�������񂾁H";
	next;
	switch (select("�ԃ|�[�V��������������","��������������")) {
		case 1:
			set '@amount,10;
			set '@gain,501;
			break;
		case 2:
			set '@amount,3;
			set '@gain,516;
			break;
	}
	mes "[�y���b�N�X]";
	mes "�킩�����B���Ⴀ�A�����Ă�������";
	mes "�����Ă���B";
	next;
	if(countitem(909) < '@amount) {
		mes "[�y���b�N�X]";
		mes "�����I" +getitemname('@gain)+ "���~����������";
		mes "�[���s�[��" +'@amount+ "�W�߂Ă�����";
		mes "����������H";
		close;
	}
	set '@max,countitem(909) / '@amount;	//�����\��
	mes "[�y���b�N�X]";
	mes "�悵�A" +getitemname('@gain)+ "�ƌ������Ă�낤�B";
	mes getitemname('@gain)+ "�͂����~�����񂾁H";
	next;
	switch (select("�ł������~�����ł�","�����w�肵�����ł�","����ς��߂Ă����܂�")) {
	case 1:
		set '@val,'@max;
		break;
	case 2:
		mes "[�y���b�N�X]";
		mes "�Ȃ�100�ȉ��ɂ��Ă���B";
		mes "������߂�Ȃ�u0�v�ƌ����΂����B";
		mes "���O�̎����Ă鐔���Ɓc�c";
		mes "�ő�" +'@max+ "�܂�";
		mes getitemname('@gain)+ "���������邼�B";
		while(1) {
			next;
			input '@val;
			if('@val < 0 || '@val > 100) {
				mes "[�y���b�N�X]";
				mes "100��葽���Ɠn���Ȃ�����B";
				mes "������x�l���Ă���B";
				continue;
			}
			break;
		}
		if('@val == 0) {
			mes "[�y���b�N�X]";
			mes "�������B";
			mes "���Ⴀ�A�܂��C���������痈�ȁB";
			close;
		}
		if('@val > '@max) {
			mes "[�y���b�N�X]";
			mes "����H���ꂾ�ƃ[���s�[������Ȃ����B";
			mes "���������W�߂Ă��痈��񂾂ȁB";
			close;
		}
		break;
	case 3:
		mes "[�y���b�N�X]";
		mes "���Ⴀ�A�܂����x�ȁB";
		close;
	}
	delitem 909,'@amount*'@val;
	getitem '@gain,'@val;
	mes "[�y���b�N�X]";
	mes "�ق��I";
	mes "�񑩂�" +getitemname('@gain)+ "���B";
	mes "�厖�Ɏg���񂾂��B";
	close;
}

// �A�C�e���G�N�X�`�F���WNPC
prontera.gat,80,66,5	script	�C�Z�i	440,{
	mes "[�C�Z�i]";
	mes "����ɂ��́B";
	mes "�@";
	mes "���t�c�ʂ��Ă܂����H";
	next;
	mes "[�C�Z�i]";
	mes "�{���ł����H�I";
	mes "�@";
	mes "�撣���Č��t���o�����̂ł���";
	mes "�ʂ��Ȃ�������ƕs���ł����B";
	next;
	mes "[�C�Z�i]";
	mes "������ł�";
	mes "�A�C�e���G�N�X�`�F���W��";
	mes "��t���s���Ă���܂��B";
	next;
	mes "[�C�Z�i]";
	mes "�A�C�e���G�N�X�`�F���W�Ƃ�";
	mes "�`���җl�̂������̑����i��";
	mes "�����̂���ʂ̑����i��";
	mes "��������T�[�r�X�ł��B";
	next;
	mes "[�C�Z�i]";
	mes "�����Ɏ��s�͂������܂���";
	mes "�����i�ɂ��萔���ɍ��ق�";
	mes "����܂��̂ł����ӂ��������B";
	next;
	mes "[�C�Z�i]";
	mes "���āA����������";
	mes "�����i�͂���܂����H";
	next;
	switch(select("�����i��I��","�������ڂ�������","�b����߂�")) {
	case 1:
		switch(select("���C���u���C�J�[[3]","�\�[�h�u���C�J�[[3]","�����̕�[4]","�����̗[���[2]","�o�C�I���b�g�t�B�A�[[2]","�g���̃c�C���G�b�W[3]","�����̃c�C���G�b�W[3]","�u���f�B�E���C�������O[1]","�u���f�B�E�������O[1]","�u���f�B�E���u���[�`[1]","�I�E���f���[�N�̃V���N�n�b�g[1]","�I�E�����@�C�J�E���g�̃V���N�n�b�g[1]","�Z�[�t���[���j���̎��[1]","�A���h�t���[���j���̃}���g[1]","��߂�")) {
		case 1: //���C���u���C�J�[[3]
			set '@delid,13032;
			set '@getid,13031;
			break;

		case 2: //�\�[�h�u���C�J�[[3]
			set '@delid,13031;
			set '@getid,13032;
			break;

		case 3: //�����̕�[4]
			set '@delid,13035;
			set '@getid,13034;
			break;

		case 4: //�����̗[���[2]
			set '@delid,13034;
			set '@getid,13035;
			break;

		case 5: //�o�C�I���b�g�t�B�A�[[2]
			set '@delid,1185;
			setarray '@getid,13413,13412;
			break;

		case 6: //�g���̃c�C���G�b�W[3]
			set '@delid,13413;
			set '@getid,13412;
			break;

		case 7: //�����̃c�C���G�b�W[3]
			set '@delid,13412;
			set '@getid,13413;
			break;

		case 8: //�u���f�B�E���C�������O[1]
			set '@delid,2788;
			set '@getid,2789;
			break;

		case 9: //�u���f�B�E�������O[1]
			set '@delid,2789;
			set '@getid,2790;
			break;

		case 10: //�u���f�B�E���u���[�`[1]
			set '@delid,2790;
			set '@getid,2788;
			break;

		case 11: //�I�E���f���[�N�̃V���N�n�b�g[1]
			set '@delid,18866;
			set '@getid,5943;
			break;

		case 12: //�I�E�����@�C�J�E���g�̃V���N�n�b�g[1]
			set '@delid,5943;
			set '@getid,18866;
			break;

		case 13: //�Z�[�t���[���j���̎��[1]
			set '@delid,2984;
			set '@getid,20770;
			break;

		case 14: //�A���h�t���[���j���̃}���g[1]
			set '@delid,20770;
			set '@getid,2984;
			break;
		case 15: //��߂�
			//�]���⊮
			mes "[�C�Z�i]";
			mes "�킩��܂����B";
			mes "�����������킫�܂�����";
			mes "�܂����z�����������B";
			close;
		}
		mes "[�C�Z�i]";
		mes getitemname('@delid)+ " [" +getiteminfo('@delid,10)+ "]";
		mes "�ł��ˁB";
		mes "���̑����i�����������";
		mes getitemname('@getid[0])+ " [" +getiteminfo('@getid[0],10)+ "]";
		if ('@getid[1] > 1) { mes getitemname('@getid[1])+ " [" +getiteminfo('@getid[1],10)+ "]"; }
		mes "�Ɍ�������܂��B";
		next;
		mes "[�C�Z�i]";
		mes "���̑����i����������ɂ�";
		mes "^0000FF�X�v�����f�B�b�h�R�C��^000000��";
		mes "^0000FF10��^000000���������܂��B";
		next;
		mes "[�C�Z�i]";
		mes "�����āA�����ɗ��p���������i��";
		mes "�S�ĉ���v���܂��B";
		mes "���̍ۂɁA���܂܂ł�";
		mes "^FF0000���B�l�y�ё}���Ă����J�[�h����";
		mes "�������Ă��܂��܂�^000000�B";
		next;
		mes "[�C�Z�i]";
		mes "�������s���܂����H";
		next;
		if(select("^FF0000����͂�߂Ă���^000000","^0000FF���肢���܂�^000000")==1) {
			mes "[�C�Z�i]";
			mes "�킩��܂����B";
			mes "�����������킫�܂�����";
			mes "�܂����z�����������B";
			close;
		}
		if(countitem('@delid) < 1 || countitem(6081) < 10) {
			mes "[�C�Z�i]";
			mes "�ޗ����R�C��������܂���B";
			close;
		}
		delitem '@delid,1;
		delitem 6081,10;
		misceffect 83;
		mes "[�C�Z�i]";		//�]���⊮
		mes "���������ł��B";
		mes "�܂������p���������B";
		getitem '@getid[0],1;
		if ('@getid[1] > 1) {
			getitem '@getid[1],1;
		}
		close;

	case 2:
		mes "[�C�Z�i]";
		mes "�A�C�e���G�N�X�`�F���W�Ƃ́A";
		mes "�����i��ʂ̑����i��";
		mes "��������T�[�r�X�ł��B";
		mes "�g��ꂽ�ޗ��͑S�ď��ł��܂��B";
		next;
		mes "[�C�Z�i]";
		mes "�\�͂������p�����͏o���Ȃ��ׁA";
		mes "���B�E�J�[�h�E�����A";
		mes "�q�h�D���X���b�g�G���`�����g����";
		mes "�t�^���ʂ͑S�ď��ł��܂��B";
		next;
		mes "[�C�Z�i]";
		mes "�����āA�C�����Ȃ���΂Ȃ�Ȃ��_��";
		mes "�����܂��B";
		mes "�Ⴆ�΁c�c�u+7�\�[�h�u���C�J�[[3]�v��";
		mes "�����́u�\�[�h�u���C�J�[[3]�v�������āA";
		mes "���ɑ����������˗������";
		mes "�ǂ��炪�ΏۂɂȂ�Ǝv���܂����H";
		next;
		mes "[�C�Z�i]";
		mes "�����͂킩��Ȃ��c�c";
		mes "�܂�A�Ώۂ̃A�C�e����";
		mes "�ǂ������������A���͈��";
		mes "�C�ɂ����ɍ�Ƃ���Ƃ������ł��B";
		next;
		mes "[�C�Z�i]";
		mes "^FF0000�����i�̏�Ԃ́A^000000";
		mes "^FF0000��؊֌W����܂���B^000000";
		mes "^FF0000�Ⴆ���Ӓ肾�낤���A^000000";
		mes "^FF0000�j�����Ă��悤���A^000000";
		mes "^FF0000�����������s���܂��B^000000";
		next;
		mes "[�C�Z�i]";
		mes "^FF0000����̃A�C�e��������^000000";
		mes "^FF0000���������������ꍇ�A^000000";
		mes "^FF0000�������O��^000000";
		mes "^FF0000�A�C�e����q�ɂɂł�^000000";
		mes "^FF0000�a���Ă��������������ł��B^000000";
		next;
		mes "[�C�Z�i]";
		mes "���̎���Y��A�ʂ̃A�C�e����";
		mes "���������̑ΏۂɂȂ��Ă�";
		mes "���͈�ؐӔC�����܂���B";
		mes "�\���ɒ��ӂ��Ă��������B";
		next;
		mes "[�C�Z�i]";
		mes "���ɐ������鎖�͓��ɂ���܂���B";
		mes "�@";
		mes "�C�y�ɗ��p���Ă݂Ă��������B";
		close;

	default:
		mes "[�C�Z�i]";
		mes "�����ł����c�c";
		close;
	}
}
