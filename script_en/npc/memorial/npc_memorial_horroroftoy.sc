//= Auriga Script ==============================================================
// Ragnarok Online Toy Factory in Nightmare Script	by refis
//==============================================================================

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
xmas.gat,237,303,3	script	�L���T�����[�[�^	10032,{
	if(BaseLevel < 110) {
		mes "[�L���T�����[�[�^]";
		mes "���I�@���́A�҂��ĉ������I";
		mes "�����͂��Ȃ��̂悤��";
		mes "�o�����󂢕������킷��ɂ�";
		mes "�댯�ȏꏊ�Ȃ̂ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ɓ��肽���̂ł���΁A";
		mes "�������������Ȃ��Ă��炪";
		mes "�ǂ����Ǝv���܂��c�c�B";
		mes "���c�c�����ł��ˁA";
		mes "��������^ff0000BaseLv110^000000���炢�����";
		mes "���v���Ȃ��Ɓc�c�B";
		close;
	}
	if(checkquest(12330) == 0) {
		mes "[�L���T�����[�[�^]";
		mes "���c�c����ȂɌ��Ȃ��ł��������B";
		mes "���͂���Ȋ�ł�����";
		mes "���X�͈Ⴄ��ł��c�c�B";
		mes "�����ƁA�ڂƂ���";
		mes "��������ł���c�c�B";
		next;
		mes "^0000ff�]�ڂ̑O�ɂ��鏭���́A";
		mes "�@���ɂ��������������Ȑ���";
		mes "�@���������Ȃ���A";
		mes "�@�{���͓����������ł��낤";
		mes "�@�󓴂����Ȃ������߂Ă�]^000000";
		next;
		menu "�ǂ����Ă���Ȋ�ɂȂ�����ł����H",-;
		mes "[�L���T�����[�[�^]";
		mes "�b���Ə��������Ȃ�܂����ǁc�c";
		mes "���v�c�c�ł��傤���H";
		next;
		menu "�b�𑱂��ĉ�����",-;
		mes "[�L���T�����[�[�^]";
		mes "�ǁc�c��������b���΂����̂��ȁB";
		mes "�X�̘b����n�߂����������̂��ȁc�c�B";
		next;
		mes "^0000ff�]��x���ߑ���f���o����������";
		mes "�@�̘b��b�����l�̂悤�Ȑ��Řb�n�߂��]^000000";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���̊X�ɂ͂�������H�ꂪ";
		mes "����܂����ǁc�c���͂��̍H��̒��ɁA";
		mes "��ƈ������m��Ȃ��ʂ̍H�ꂪ";
		mes "�����ł��B";
		mes "�����āc�c���������ɋ΂߂�";
		mes "�E���̈�l�ł����B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�͂��߂͍K���ł����B";
		mes "�d�����I���ΊX�ɂ݂�ȏW�܂��āA";
		mes "���َq�Ɖ������g�������݂Ȃ���";
		mes "������ׂ��������B";
		mes "�����A�[�����Ă��܂����B";
		next;
		menu "���̕��͋C�͂����ł��Ȃ��悤�����ǁc�c",-;
		mes "[�L���T�����[�[�^]";
		mes "�͂��c�c�B";
		mes "���܂ł�������������邾���ŁA";
		mes "�������ێ����邱�Ƃ͂ł��܂���B";
		mes "���ǁA��ƈ��͏�������";
		mes "�H�ꂩ�炢�Ȃ��Ȃ��Ă��܂��A";
		mes "�H��̌o�c�͌������Ȃ��Ă����܂����B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ǁA�Ō�܂Ŏc�����̂�";
		mes "�l�`�E�l�̂��ꂳ��ƁA";
		mes "�ނ̂��ƂŁA��q�Ƃ���";
		mes "�l�`������`����";
		mes "�����Ă����A��������";
		mes "�Ȃ�܂����c�c�B";
		next;
		mes "^0000ff�]�ޏ��̊���̔����Ȑk����";
		mes "�@�����{���h��Ă���̂���������]^000000";
		next;
		menu "�����Ęb�𕷂�",-;
		mes "[�L���T�����[�[�^]";
		mes "�H��̕������肵�����B";
		mes "�l�`�E�l�͍Ō�ɍ�����l�`��";
		mes "���𒅂��Ȃ���܂𗬂��Ă��܂����B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "��������Ől�`����邱�Ƃ�";
		mes "�i���ɂȂ��Ǝv���Ă����悤�ł��B";
		mes "�c�c���܂ł�����̂��Ƃ݂�����";
		mes "�v���o�����Ƃ��ł��܂��c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���̍Ō�̐l�`��^0000ff�Z���[�k�E�L�~^000000�Ƃ���";
		mes "���O��t���āA�l�`�E�l��";
		mes "�H��̂��ׂĂ̍�Ə��";
		mes "�~�߂܂����c�c�B";
		next;
		menu "�l�`�ɖ��O���H",-;
		mes "[�L���T�����[�[�^]";
		mes "�l�`�E�l�ɂƂ��Đl�`��";
		mes "����Ӗ��A�q���̂悤�Ȃ��́B";
		mes "���𐁂����ނ���Ő^����";
		mes "���g�݁A��i�𐶂ݏo���܂��B";
		mes "���̒��ł��A�ō����삪";
		mes "�L�~�ł��c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���A�����܂���B";
		mes "�Z���[�k�E�L�~�ł͒����̂�";
		mes "�e���݂����߁A^0000ff�L�~^000000��";
		mes "�݂�ȁA�Ă�ł����ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�l�`�E�l�͐̂��������݂�";
		mes "�L�~����肠���Ă����܂����B";
		mes "�ł���ΈȑO�̂悤�ɁA";
		mes "���̍H��ɐl���߂��Ăق����c�c�B";
		mes "�l�`�E�l�̂���ȋC�������A�L�~��";
		mes "�����𐁂����񂾂̂�������܂���B";
		next;
		menu "�l�`�������Ă�����ł����H",-;
		mes "[�L���T�����[�[�^]";
		mes "�͂��B^0000ff�ޏ�^000000�͐��������鑶�݂�";
		mes "�Ȃ�܂����B";
		mes "�Ƃ��낪�c�c�B";
		mes "�ǂ����ĂȂ̂��͕�����Ȃ��̂ł���";
		mes "�����L�~�������������A�ޏ���";
		mes "�{��Ƒ����Ɏ����Ă���A";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�ƂĂ����̐��ȂǕ�������";
		mes "�����Ȃ��Ƃ���������";
		mes "���l�̂�������H���������l";
		mes "��������Ă����̂ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "����ȃL�~�����Ă��������Ȃ�";
		mes "���������������̂ł����c�c";
		mes "���̎��A�l�`�E�l�̂��ꂳ��";
		mes "�����Ă���̂��������̂ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���͂��ꂳ��ɋ삯���A";
		mes "���������܂����������͂Ȃ�";
		mes "�̂���������₽���Ȃ��Ă���";
		mes "���؂�Ă��܂����c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����āc�c�B";
		mes "�����ē����Ȃ����̎��E��";
		mes "�L�~�̎p���f��܂����c�c�B";
		mes "���ꂳ��̖S�[�̔w��ɗ����A";
		mes "���̕\��͂Ȃɂ���炸�A";
		mes "���������Ƃ����ɋ��܂����B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���͂��̎p�����āc�c";
		mes "�Ȃ������|�������Ă��܂��c�c";
		mes "�����Ŏ��͋C�������܂����B";
		mes "�ǂꂭ�炢�������Ă����̂��A";
		mes "�ڂ��o�߂�ƍH��̊O�ɂ��āA";
		mes "���̊�͂���ȕ��ɂȂ��Ă��܂����B";
		next;
		mes "^0000ff�]�ڂ̑O�ɂ��鏭���̊�́A";
		mes "�@���炩�ɔ畆�Ȃǂ��Ȃ�";
		mes "�@�Ⴆ��Ȃ�炾����������";
		mes "�@���Ă��܂����悤�Ɍ�����]^000000";
		next;
		menu "���̊�́A�L�~�Ƃ����l�`�������H",-;
		mes "[�L���T�����[�[�^]";
		mes "���ꂪ�c�c���ɂ�������Ȃ��̂ł��B";
		mes "�L�~�̉\��������܂����A";
		mes "���Ɍ���������̂�������܂���B";
		mes "�����n�b�L�����Ă��邱�Ƃ�";
		mes "�C���������Ƃ��ɉ������������B";
		mes "���ꂾ���Ȃ̂ł��c�c�B";
		next;
		menu "�L�~���Ɛl���Ǝv���܂����H",-;
		mes "[�L���T�����[�[�^]";
		mes "�c�c�����Ɍ����΁A������Ȃ��̂ł��B";
		mes "�L�~�ł͂Ȃ��C�����܂����A";
		mes "�����Ȃ�Ƒ��ɒN���H�ƍl�����";
		mes "�v��������l���͂��܂���c�c�B";
		mes "���ƌ����āA�L�~���ƌ��ߕt����̂�";
		mes "���v�ȋC������̂ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "������A�^����m�肽����";
		mes "�v���Ă͂���̂ł����c�c�B";
		mes "�c�c�B";
		next;
		mes "^0000ff�]�ޏ��͂��������Ȃ���";
		mes "�@�����̐g�̂�������߂��]^000000";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�|����ł��c�c�B";
		mes "�s�������Ȃ���ł��c�c�B";
		mes "�܂����̍H��ɍs���΁A";
		mes "���ȏ�ɋ��낵�����Ƃ�";
		mes "�N���邩������Ȃ��c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�ł��A�^����m�肽���c�c�B";
		mes "���̊���A�\�Ȃ�߂������B";
		mes "���ꂳ��̖S�[���A�����ł͂Ȃ�";
		mes "������Ɩ������Ă��������B";
		mes "�ł���l�ł͕|���āc�c�I";
		mes "�c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�c�c�`���҂���B";
		mes "���������m�ŁA�����܂��c�c�B";
		mes "���ƈꏏ�ɁA���̍H��ɓ�����";
		mes "�L�~��T���Ă��������܂���!?";
		next;
		menu "���͂���Ɛ\���o��",-;
		mes "[�L���T�����[�[�^]";
		mes "�����c�c�ł���ˁB";
		mes "�����Ɍ��܁c�c����!?";
		mes "�ꏏ�ɍs���Ă����̂ł���!?";
		mes "�����c�c�܂�������Ȑl��";
		mes "����Ă����Ȃ�āI";
		next;
		menu "�ꏏ�ɂ��̍H��ɂ����܂��傤",-;
		mes "[�L���T�����[�[�^]";
		mes "�����A��قǂ������܂�����";
		mes "��������H��͊댯�ȏ�Ԃł��B";
		mes "���͑S���킦�Ȃ����c�c�B";
		mes "���ē����x�������ɂ��Ă�����";
		mes "����܂���c�c�B";
		next;
		mes "^0000ff�]�ޏ��͑傫���J�����܂�";
		mes "�@���͕��邱�Ƃ��犐��Ȃ�";
		mes "�@����̂��ڂ݂�������";
		mes "�@�������������Ǝv����";
		mes "�@�܂������ɂ����������";
		mes "�@�����������]^000000";
		next;
		mes "[�L���T�����[�[�^]";
		mes "����ł����͒m�肽���̂ł��B";
		mes "�{���̂��Ƃ��c�c�B";
		mes "���̂܂܂ł͉�������";
		mes "�������܂��񂵁c�c�B";
		mes "�Ȃ̂ŁA�X�������肢���܂��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����ƌ��܂�΁c�c";
		mes "����������̂ŁA�����҂��ĉ������B";
		mes "�`���җl���������ł�����";
		mes "���ɐ��������Ă��������B";
		setquest 12330;
		close;
	}
	if(checkquest(12330) != 0x8) {
		mes "[�L���T�����[�[�^]";
		mes "���҂������܂����B";
		mes "�������ł��܂����B";
		mes "�`���җl����낵���ł��傤���H";
		mes "�����炠�̓]�����u��";
		mes "�`���җl�̏���o�^��";
		mes "����\�����s���܂��B";
		compquest 12330;
		if(getonlinepartymember() < 1) {
			//
			next;
			mes "[�L���T�����[�[�^]";
			mes "���̐�͊댯�ł��B";
			mes "�p�[�e�B�[��g��ł���";
			mes "���Ă��������܂����B";
			close;
		}
	}
	else {
		mes "[�L���T�����[�[�^]";
		mes "�c�O�ł����A�L�~�̍��͂��܂���";
		mes "�ꂵ��ł���悤�ł��B";
		mes "���ꂳ������̂܂܂���";
		mes "���S�ł��Ȃ����낤���c�c�B";
		mes "���ɂȂƂ��ɂ܂��A���肢���܂��B";
		if(getonlinepartymember() < 1) {
			next;
			mes "[�L���T�����[�[�^]";
			mes "���̐�͊댯�ł��B";
			mes "�p�[�e�B�[��g��ł���";
			mes "���Ă��������܂����B";
			close;
		}
		if(checkquest(12331)) {
			next;
			if(checkquest(12331) & 0x2) {
				mes "^0000ff�]��������H�ꂪ";
				mes "�@�ғ����鎞�ԂɂȂ�܂����]^000000";
				delquest 12331;
				close;
			}
			mes "[�L���T�����[�[�^]";
			mes "�����������Ă��������܂�����";
			mes "�H�ꂪ�܂��ғ����Ԃł�";
			mes "�Ȃ��悤�ł��ˁc�c�B";
			mes "�����œ����Ă���̂�";
			mes "��������΂���Ȃ̂�";
			mes "���ԂɗZ�ʂ������Ȃ��āc�c�B";
			next;
			mes "[�L���T�����[�[�^]";
			mes "�Ȃ̂ł��߂�Ȃ����B";
			mes "�H�ꂪ�ғ�����܂�";
			mes "���ɓ��邱�Ƃ͂ł��܂���B";
			mes "�����������Ē����܂�����";
			mes "���Ԃ������Ă���ēx�A";
			mes "���������Ă��炦��Ɗ������ł��B";
			close;
		}
	}
	if(HORROR_1QUE >= 0)
		set '@str$[0],"���̍H��ɂ���";
	if(HORROR_1QUE >= 1)
		set '@str$[1],"�q�b�g���i�ɂ���";
	if(HORROR_1QUE >= 3)
		set '@str$[2],"�L���T�����[�[�^�ɂ���";
	if(HORROR_1QUE >= 5)
		set '@str$[3],"�l�`�E�l�̎����ɂ���";
	if(HORROR_1QUE >= 7)
		set '@str$[4],"�H�ꂪ�ғ����Ă��闝�R";
	if(HORROR_1QUE >= 9)
		set '@str$[5],"�L�~�ɂ���";
	if(HORROR_1QUE >= 11)
		set '@str$[6],"�L�~�̕t���i�ɂ���";
	if(HORROR_1QUE >= 13)
		set '@str$[7],"����ɂ���";
	next;
	switch(select("^0000ff��������H��̌����J����^000000","^ff0000��߂�^000000",
		'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4],'@str$[5],'@str$[6],'@str$[7])) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[�L���T�����[�[�^]";
			mes "���A���߂�Ȃ����B";
			mes "���Ȃ��̃p�[�e�B�[�̃��[�_�[��";
			mes "�b�������Ă��炦�܂����H";
			mes "��C�ɐ������������";
			mes "�������Ă��܂��̂ł��c�c�B";
			close;
		}
		mdcreate "Horror of Toy";
		mes "[�L���T�����[�[�^]";
		mes "�ȉ��̓��e�Ŏ葱�����܂��ˁB";
		mes "�p�[�e�B�[����";
		mes "^0000FF" +strcharinfo(1)+ "^000000��";
		mes "�p�[�e�B�[���[�_�[��";
		mes "^0000FF" +strcharinfo(0)+ "^000000";
		mes "���Ɓc�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�܂��Ȃ��]�����u�������Ǝv���܂��B";
		close;
	case 2:
		mes "[�L���T�����[�[�^]";
		mes "�c�c����B";
		mes "����ς��߂Ă����܂����H";
		mes "���Ȃ�܂��Ԃɍ����܂����c�c�B";
		close;
	case 3:
		mes "[�L���T�����[�[�^]";
		mes "���̊X�͈�N���A�Ⴊ�~��";
		mes "����ȋC��ƁA�����̉^�A��";
		mes "����Ƃ����n���I������������";
		mes "������Y�Ƃ��蒅���Ȃ��āc�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "��������̍H��̑n�Ǝ҂ł���";
		mes "�r�����̐l�`�E�l�ł��邨�ꂳ��";
		mes "�H���ݗ��A�������̃q�b�g���i��";
		mes "���ɑ���o�����������ŁA";
		mes "�ꎞ�����̍H�ꂾ���āA�ƂĂ�";
		mes "���C���ӂ��ꏊ��������ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����A�Ƃ��鎞��������";
		mes "����܂Ŕ���Ă������i��";
		mes "�Ȃ����킩��܂��񂪔���Ȃ��Ȃ�";
		mes "���݂̂悤�ȏ�ԂɂȂ�܂����B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���i�̐l�C�͊m���ɁA�g������܂���";
		mes "�{���ɋ}�ɔ���Ȃ��Ȃ����̂�";
		mes "������������A�N����";
		mes "���ꂳ����ׂ�邽�߂�";
		mes "�d�g��㩂������肵�āc�c�B";
		mes "�Ȃ�āA�l�������ł��ˁB";
		close;
	case 4:
		mes "[�L���T�����[�[�^]";
		mes "�H��̃q�b�g���i�ɂ���";
		mes "�m�肽���̂ł����H";
		mes "�`���җl�͍D��S��";
		mes "�ƂĂ�������ł��ˁI";
		mes "�����킩��͈͂�";
		mes "���������܂��ˁB";
		next;
		mes "[�L���T�����[�[�^]";
		mes "��ڂ�^FF0000�u�������̊֐ߐl�`�v^000000�ł��B";
		mes "�葫�����Ə_��ɓ�������";
		mes "���ɂ����āA��v�ł����B";
		mes "�N�I���e�B�ɂ��S���č���";
		mes "���ɁA���������̎q������";
		mes "��l�C�ł����c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ɁA�u�������̊֐ߐl�`�v��";
		mes "�v���[���g�����邽�߂̔��A";
		mes "^FF0000�u�v���[���g�{�b�N�X�v^000000�ł��B";
		mes "�V���v�������ǈ����₷��";
		mes "�f�U�C���ɂ��S�����{�b�N�X�ł��I";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���Ƃ́A�����ł��ˁB";
		mes "^FF0000�u�A�j�o�[�T���[�N�b�L�[�v^000000��";
		mes "^FF0000�u�A�j�o�[�T���[�W���[�X�v^000000���ȁB";
		mes "�L�O���ɑ厖�Ȑl��Ƒ��ƈ���ŐH�ׂ�";
		mes "�K���ȋC���ɂȂ��悤�ɂ�";
		mes "���ꂽ��ł���B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ɂ�����̂ł����A";
		mes "�L���ȃq�b�g���i��";
		mes "���ꂭ�炢�ł��傤���B";
		mes "���ɃN�b�L�[�ƃW���[�X��";
		mes "�l�I�ɂ������߂ł��B";
		close;
	case 5:
		mes "[�L���T�����[�[�^]";
		mes "��!?";
		mes "���ɂ��āA�ł����c�c�B";
		mes "���̂��Ƃ𕷂��Ă����܂�";
		mes "�ʔ����Ȃ��Ǝv���܂����c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���������𗣂���Ȃ����R��";
		mes "�m���ɁA���̊�̂���������܂���";
		mes "�����A�����b�ɂȂ���";
		mes "�l�`�E�l�̂��ꂳ���";
		mes "���O�A�Ȃɂ��ł��Ȃ��������炪";
		mes "�傫�������肵�܂��c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���̍H��̊֌W�҂ŁA";
		mes "���ꂳ��ɂ����b�ɂȂ�Ȃ�����";
		mes "�l�Ԃ͂��Ȃ��Ƃ����Ă�";
		mes "�ߌ��ł͂Ȃ��Ǝv���܂��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���̂��炢���̍H��ɂƂ���";
		mes "���ꂳ��́A�傫�ȑ��݂�������ł��B";
		mes "����͎������łȂ�";
		mes "���ꂳ��ɍ��ꂽ��������B��";
		mes "���l�Ɂc�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����玄�A����������ł��B";
		mes "���ꂳ��̖Y��`���ł���";
		mes "�L�~�̂��Ƃ��c�c�B";
		mes "����������܂��悯���";
		mes "���ЁA�͂�݂���";
		mes "���������ˁB";
		close;
	case 6:
		mes "[�L���T�����[�[�^]";
		mes "�c�c���ꂳ��B";
		mes "�c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�c�c�����܂���B";
		mes "���̎��̂��Ƃ��v���o��������āB";
		mes "���̍H��̑n�Ǝ҂ł���";
		mes "���r�̐l�`�E�l�ł��邱�Ƃ�";
		mes "���łɂ��b���Ă���܂���ˁB";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ꂳ��̎����́A";
		mes "��ƈ��̈�l���S�����삾��";
		mes "�b���Ă��܂������A���ۂ�";
		mes "�͂����肵��������";
		mes "�킩���Ă��Ȃ���ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ƈ�C�ɂȂ�̂��A";
		mes "���ꂳ�񂪐��O";
		mes "�S���������Ƃ����b��";
		mes "�������L����";
		mes "�Ȃ���ł���ˁc�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "����ɐS���a�Ȃ�";
		mes "������������́c�c�B";
		mes "�c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�c�c�����[��B";
		mes "�L�����͂����肵�܂���B";
		mes "�����A���̊��Ⴂ��";
		mes "���ԈႢ���Ǝv���܂���";
		next;
		mes "[�L���T�����[�[�^]";
		mes "����Ȃ��Ƃ�荡�́A";
		mes "���ꂳ��̎�����";
		mes "�͂����肵�Ȃ�������";
		mes "�L�~���H�꒷���E�����񂶂�Ȃ���";
		mes "�Ƃ����������t���Ȃ��\��";
		mes "�L�����Ă���������ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���߂āA�L�~��";
		mes "���ꂳ����E���Ă��Ȃ�";
		mes "�؋���������΂����񂾂��ǁc�c�B";
		mes "���Ԃ��o�߂��Ă��邾����";
		mes "������ł��ˁB";
		close;
	case 7:
		mes "[�L���T�����[�[�^]";
		mes "�H�꒷�̂��ꂳ�񂪂��Ȃ��̂�";
		mes "�������̍H��͉ғ����Ă��܂��ˁB";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���͂Ă�����A�L�~��";
		mes "���ꂳ��̈ӎv�����ŁA";
		mes "�H����ғ������Ă���̂���";
		mes "�v���Ă��܂����c�c�B";
		mes "�ł��L�~�̂��̊�������";
		mes "���̉\���͒Ⴂ�悤�ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���������΍�ƈ�������";
		mes "�Y�݂̐e�ł���l�`�E�l��";
		mes "���ꂳ��̂��Ƃ�";
		mes "�Ȃ����Y��Ă��܂����ˁB";
		next;
		mes "[�L���T�����[�[�^]";
		mes "������L�~�ł�";
		mes "���ꂳ��̋L�������Y�ꂳ����Ȃ��";
		mes "�ł���Ǝv��Ȃ��ł����A�����";
		mes "^FF0000�L�~�ȊO�̒N��^000000��";
		mes "�d�Ƃ̂悤�ȋC�����܂��c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����āA�L�~�Ȃ炫����";
		mes "���ꂳ��̂��Ƃ�Y��Ăق����Ȃ��";
		mes "��΂Ɏv��Ȃ��͂��ł��B";
		mes "�L�~�͒N�����A�ǓƂ̎₵����";
		mes "�m���Ă���̂ł�����c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����l����Ǝ��ɂ�";
		mes "����Ȃ��Ƃ��ł���悤��";
		mes "�l�ɐS�����肪�Ȃ��̂ŁA";
		mes "���̌��ɂ��Ă�";
		mes "������l���Ă�������";
		mes "�łȂ������ł��c�c�B";
		close;
	case 8:
		mes "[�L���T�����[�[�^]";
		mes "�{���ɁA�т�����ł��c�c�B";
		mes "�L�~�ƍŌ�ɉ����������";
		mes "�����A��ۂ��Ⴂ�܂�������B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���܂������ł��Ȃ���ł���";
		mes "�|����ɂȂ��Ă���Ƃ������c�c";
		mes "�Ȃ񂾂��O�ɂ݂��Ƃ�����";
		mes "�₵�����Ȋ��������܂����c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ƁA�L�~�͎����̂�����";
		mes "���ꂳ�񂪎��񂾂ƁA";
		mes "�v������ł���悤�ł��B";
		mes "�������Ȃ��c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����������������Ă�";
		mes "������l�̃L�~�炵������";
		mes "�����ɁA������̂������Ƃ�";
		mes "�P���Ȃ��Ă��܂����c�c�B";
		mes "�����A���̂�����l��";
		mes "�L�~�ɂ��ĂȂ̂ł���";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���ꂳ�񂪐����Ă����Ƃ��ɂ�";
		mes "���Ȃ������ƋL�����Ă��܂��B";
		mes "�����Ȃ�ƁA���̂�����l�̃L�~��";
		mes "�H��̓�̉ғ��Ɖ���";
		mes "�֌W������̂ł��傤���c�c�H";
		next;
		mes "[�L���T�����[�[�^]";
		mes "������l�̃L�~��";
		mes "�Ȃ�Ƃ��ł���΁A�L�~�̌������ł�";
		mes "��������̂Ɂc�c";
		mes "�ǂ����@���Ȃ���ł���ˁB";
		mes "���[��A�܂��܂����";
		mes "�������ł��c�c�B";
		close;
	case 9:
		mes "[�L���T�����[�[�^]";
		mes "�`���җl�B";
		mes "�����������΁A���ꂳ���";
		mes "�ȒP�ȃL�~�̎����ɂ���";
		mes "���������Ă����̂�";
		mes "�v���o������ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�ǂ������̍H��œ���ł���";
		mes "�ꕔ�̃A�C�e���̓L�~�ɕt������";
		mes "�\�肾�����A�C�e����������";
		mes "���ꍞ��ł���݂����ł��ˁB";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����A���̃A�C�e���̎�ނ�";
		mes "�����ꂽ�y�[�W�ɂ��Ă�";
		mes "�c�O�Ȃ���A������܂���ł����B";
		mes "�Ȃ̂ŁA�͂�����ƁA";
		mes "�ǂ̃A�C�e�����c�c�Ƃ�";
		mes "�����Ȃ��̂ł����B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����A�Z���[�k�̃��{���Ƃ�";
		mes "�m�[�u���N���X�����肪";
		mes "���̕t������\���";
		mes "�A�C�e���������C�����܂��B";
		mes "���ɁA�m�P��������ۂ��ł���ˁB";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����l����ƁA�L�~��";
		mes "���ꂳ��ɂƂ��Ė{����";
		mes "���̂悤�ȑ��݂�������ł��ˁB";
		mes "�L�~�������Ɖ����A";
		mes "�������悤�Ɋ����";
		mes "���ꂽ���̂ł��傤���c�c�B";
		close;
	case 10:
		mes "[�L���T�����[�[�^]";
		mes "�`���җl�Ƃ���Ȃɂ�";
		mes "�����t�������ɂȂ�Ȃ��";
		mes "�v���Ă��݂Ȃ������ł��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���܂��ɃL�~�̐����͂��܂�";
		mes "�ł��Ă��Ȃ���Ԃł����A";
		mes "����΂���͍��C�悭";
		mes "�C���ɐi�߂邵���Ȃ��ł���ˁB";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�܂��킩��Ȃ����Ƃ�������";
		mes "��ςł����ǁc�c";
		mes "���͂܂��A���߂܂���B";
		next;
		menu "�ŏ��̂���Ƃ����܂�����",-;
		mes "[�L���T�����[�[�^]";
		mes "�͂��A������`���җl��";
		mes "���ƃL�~�̂��߂ɂ�������";
		mes "�͓Y�����Ă��ꂽ���A�ł��B";
		mes "�{���Ɋ��ӂ��Ă��܂��B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "�����炱���A";
		mes "�`���җl�ɂ͂�����";
		mes "���̍H��̂��Ƃ�A�L�~�̂���";
		mes "���ꂳ��̂��Ƃ�m���Ăق����̂�";
		next;
		mes "[�L���T�����[�[�^]";
		mes "����ȏ�̂��Ƃ͕�����Ȃ��Ƃ�����";
		mes "�v���o���Ȃ��Ƃ������c�c�B";
		mes "�Ƃ肠�������̂Ƃ���";
		mes "���̂ق����炱��ȏ�A";
		mes "���b�ł�����e�͂���܂���c�c�B";
		mes "���߂�Ȃ����c�c�B";
		next;
		mes "[�L���T�����[�[�^]";
		mes "���A�ł�������B";
		mes "���A�܂��`���җl�ɓ`���Ă��Ȃ�";
		mes "��񂪂���܂����B";
		next;
		menu "�`���Ă��Ȃ����H",-;
		mes "[�L���T�����[�[�^]";
		mes "�͂��B";
		mes "�L�~�����x�ނ��Ă�";
		mes "���̍H��ɖ߂��Ă���悤��";
		mes "�����A���߂������Ƃ������Ƃł��I";
		mes "�Ȃ̂ŁA�`���җl�B";
		mes "���ꂩ����A��낵�����肢���܂��B";
		next;
		mes "^0000ff�]���������ē���������";
		mes "�@�ޏ��̊�ɂق�̈�u";
		mes "�@�Ί�̏������d�Ȃ���";
		mes "�@�������C�������]^000000";
		next;
		mes "[�L���T�����[�[�^]";
		mes "����ł́A";
		mes "�܂������`���җl��";
		mes "���b�ł��邱�Ƃ��v���o������";
		mes "������ɓ��ꂽ�ۂɂ�";
		mes "���b���܂��̂ŁA";
		mes "�y���݂ɂ��ĂĂ��������B";
		next;
		mes "^0000ff�]�L���T�����[�[�^����";
		mes "�@������b�����ׂĕ������Ƃ�";
		mes "�@�ł����悤���B";
		mes "�@����ȏ�̘b�͕����Ȃ��悤�Ȃ̂�";
		mes "�@�����Ă������]^000000";
		close;
	}
}

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
xmas.gat,233,305,4	script	�]�����u	10007,{
	if(BaseLevel < 110) {
		mes "[�]�����u]";
		mes "�]���ɕK�v�Ȕ\�͂�����܂���B";
		mes "BaseLv110�ȏ�ɂ��Ă��������B";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[�]�����u]";
		mes "���̐�ɍs���ɂ�";
		mes "�p�[�e�B�[��g�ޕK�v��";
		mes "����܂��B";
		mes "�p�[�e�B�[���������ĉ������B";
		close;
	}
	if(checkquest(12331)) {
		if(checkquest(12331) & 0x2) {
			mes "[�]�����u]";
			mes "^0000ff�]���̍��Ղ������܂����B";
			mes "�]�����u�̗��p��";
			mes "�\�ɂȂ�܂����B^000000";
			delquest 12331;
			close;
		}
		mes "[�]�����u]";
		mes "�]�����s�������Ղ��c���Ă��܂��B";
		mes "���΂炭���Ԃ������Ă��������B";
		close;
	}
	mes "[�]�����u]";
	mes "�V�X�e���`�F�b�N���c�c�B";
	next;
	mes "�]�]�����u�͐���ɋN�����Ă��܂��]";
	next;
	if(select("����","����Ȃ�") == 2) {
		mes "�]���Ȃ��͓]�����u���痣�ꂽ�]";
		close;
	}
	switch(mdenter("Horror of Toy")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[Horror of Toy] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99;
		donpcevent getmdnpcname("�L���T�����[�[�^#0") +"::OnMDInit";
		if(checkquest(96400))
			delquest 96400;
		if(checkquest(96405))
			delquest 96405;
		setquest 12331;
		//setquest 118903;
		setquest 96400;
		//warp "1@xm_d.gat",111,22;
		close;
	case 1:	// �p�[�e�B�[������
		mes "[�]�����u]";
		mes "�p�[�e�B�[����̂���Ă��܂��B";
		mes "�ēx�p�[�e�B�[��g�ݒ����Ă���";
		mes "�����t���s���Ă��������B";
		close;
	case 2:	// �_���W�������쐬
		mes "[�]�����u]";
		mes "�H��ғ����Ԃł͂Ȃ�����";
		mes "�ړ����邱�Ƃ��ł��܂���B";
		mes "�@";
		mes "�]�����t���K�v�Ȃ悤���]";
		close;
	default:	// ���̑��G���[
		close;
	}
}

//============================================================
// �z���[��������H��
//------------------------------------------------------------
1@xm_d.gat,112,20,6	script	�L���T�����[�[�^#0	10032,{
	if(sc_onparam(SC_MONSTER_TRANSFORM,1)) {
		// ������
	}
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "[�L���T�����[�[�^]";
		mes "�Ȃ�Ƃ��H��ɐ��荞�߂܂����ˁB";
		mes "�����ɂ��ďڂ���������";
		mes "�����炵�������悢�ł����H";
		unittalk "�L���T�����[�[�^ : �Ȃ�Ƃ��H��ɐ��荞�߂܂����ˁB�����ɂ��ďڂ��������������炵�������悢�ł����H";
		next;
		switch(select("�b���I����","�b�𕷂�","�����͕K�v�Ȃ��̂Ői��")) {
		case 1:
			mes "[�L���T�����[�[�^]";
			mes "�S�̏������o�����琺�������ĉ������B";
			close;
		case 2:
			donpcevent getmdnpcname("�L���T�����[�[�^#0") +"::OnStart";
			close;
		case 3:
			donpcevent getmdnpcname("�L���T�����[�[�^#0") +"::OnStart2";
			close;
		}
	}
	else {
		mes "[�L���T�����[�[�^]";
		mes "���A���߂�Ȃ����c�c�B";
		mes "���܂��R�̐l�Ɉ�C��";
		mes "�b����������Ǝ��A���������ł��B";
		mes "������\����Ȃ��̂ł���";
		mes "���Ȃ��̃p�[�e�B�[�̃��[�_�[�Ƃ̂�";
		mes "�b�������Ă��������B";
		close;
	}
OnMDInit:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("#bgm01");
	hideonnpc getmdnpcname("#bgm02");
	hideonnpc getmdnpcname("#bgm03");
	hideonnpc getmdnpcname("#bgm04");
	hideonnpc getmdnpcname("#bgm05");
	hideonnpc getmdnpcname("#bgm06");
	hideonnpc getmdnpcname("�L���T�����[�[�^#01");
	hideonnpc getmdnpcname("�L���T�����[�[�^#21");
	hideonnpc getmdnpcname("�L���T�����[�[�^#6");
	hideonnpc getmdnpcname("�Z���[�k�E�L�~#2");
	hideonnpc getmdnpcname("����ꂽ�T���^#3");
	hideonnpc getmdnpcname("����ꂽ�T���^#4");
	hideonnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#1");
	hideonnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#2");
	hideonnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#3");
	hideonnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#4");
	hideonnpc getmdnpcname("#fac1bs");
	hideonnpc getmdnpcname("#pck1");
	hideonnpc getmdnpcname("#kimion1");
	hideonnpc getmdnpcname("#fac3wp");
	hideonnpc getmdnpcname("#fac3wp2");
	hideonnpc getmdnpcname("#fac4wp");
	hideonnpc getmdnpcname("#fac4wp2");
	hideonnpc getmdnpcname("#fac5wp");
	hideonnpc getmdnpcname("#fac5wp2");
	hideonnpc getmdnpcname("#fac6wp");
	hideonnpc getmdnpcname("#jeton2");
	hideonnpc getmdnpcname("����#exwp1");
	for(set '@i,1;'@i<=10; set '@i,'@i+1)
		hideonnpc getmdnpcname("��ƈ�#xm_d"+'@i);
	hideonnpc getmdnpcname("����ꂽ�v���[���g#00");
	for(set '@i,1;'@i<=12; set '@i,'@i+1)
		hideonnpc getmdnpcname("����ꂽ�v���[���g#"+'@i);
	for(set '@i,1;'@i<=9; set '@i,'@i+1)
		hideonnpc getmdnpcname("xm_d#eff_f0"+'@i);
	donpcevent getmdnpcname("xm_d#Barricade00")+"::OnStart";
	end;
OnStart:
	initnpctimer;
	hideoffnpc getmdnpcname("#bgm01");
	hideoffnpc getmdnpcname("�L���T�����[�[�^#01");
	hideonnpc getmdnpcname("�L���T�����[�[�^#0");
	end;
OnTimer1000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk1";
	end;
OnTimer6000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk2";
	end;
OnTimer11000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk3";
	donpcevent getmdnpcname("#fac1ct") + "::OnStart";
	end;
OnTimer14000:
	announce "�H��ē����� : ��������H��̉Ƒ��݂̂Ȃ��`��B�N���ĉ����`���B�y�����J�����Ԃ�����ė��܂�����`�B",0x9,0x00ff44;
	end;
OnTimer19000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk4";
	end;
OnTimer24000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk5";
	end;
OnTimer27000:
	announce "�H��ē����� : �H����̃S�~��L�Q�Ȃ��̂�Еt���āA�����̂悤�Ɉ��S�ɍ�Ƃ��s���ĉ������B",0x9,0x00ff44;
	end;
OnTimer30000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk6";
	end;
OnTimer33000:
	announce "�H��ē����� : �������ꏊ�����A�q�������̖��Ɗ�]�ׂ̈Ƀv���[���g�����܂��傤�B",0x9,0x00ff44;
	end;
OnTimer36000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk7";
	end;
OnTimer37000:
	announce "�H��ē����� : ��1���C����Ƃ��͂��߂ĉ������B���S�w�����b�g�𒅗p���܂��傤�B",0x9,0x00ff44;
	end;
OnTimer40000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk8";
	end;
OnTimer46000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk9";
	end;
OnTimer48000:
	announce "�H��ē����� : �H����ł͍�ƈ��ؖ������ƕ��͕K�����p���܂��傤�B�������Ȃ��ƌx���̕������ɓ{���܂���`�B",0x9,0x00ff44;
	end;
OnTimer53000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk10";
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#1");
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#2");
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#3");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#1");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#2");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#3");
	end;
OnTimer59000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk11";
	end;
OnTimer64000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk12";
	end;
OnTimer69000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk13";
	end;
OnTimer74000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk14";
	end;
OnTimer78000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk15";
	end;
OnTimer84000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk16";
	announce "�]�����Ă���l�`�����Ɠ�����������{�b�N�X���~�����邽�߁A�A�i�E���X�������܂œ|���Ă��������]",0x9,0xffffff;
	end;
OnTimer90000:
	stopnpctimer;
	hideonnpc getmdnpcname("�L���T�����[�[�^#01");
	hideonnpc getmdnpcname("#bgm01");
	end;

OnStart2:
	initnpctimer;
	setnpctimer 100000;
	hideoffnpc getmdnpcname("#bgm01");
	hideoffnpc getmdnpcname("�L���T�����[�[�^#01");
	hideonnpc getmdnpcname("�L���T�����[�[�^#0");
	end;
OnTimer103000:
	donpcevent getmdnpcname("�L���T�����[�[�^#01")+"::OnTalk17";
	end;
OnTimer109000:
	hideonnpc getmdnpcname("�L���T�����[�[�^#01");
	announce "�H��ē����� : ��������H��̉Ƒ��݂̂Ȃ��`��B�݂�ȋN���ĉ������B�y�����J�����Ԃ�����ė��܂�����`�B",0x9,0x00ff44;
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#1");
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#2");
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#3");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#1");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#2");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#3");
	end;
OnTimer115000:
	announce "�H��ē����� : �H����̃S�~��L�Q�Ȃ��̂�Еt���āA�����̂悤�Ɉ��S�ɍ�Ƃ��s���ĉ������B",0x9,0x00ff44;
	end;
OnTimer121000:
	stopnpctimer;
	announce "�H��ē����� : �������ꏊ�����A�q�������̖��Ɗ�]�ׂ̈Ƀv���[���g�����܂��傤�B",0x9,0x00ff44;
	hideonnpc getmdnpcname("#bgm01");
	donpcevent getmdnpcname("#fac1ct")+ "::OnStart";
	end;
}

1@xm_d.gat,112,20,0	script	#bgm01	139,10,10,{
	musiceffect "99";
	end;
}

1@xm_d.gat,112,20,1	script	�L���T�����[�[�^#01	10032,{
	end;
OnTalk1:
	unittalk "�L���T�����[�[�^ : �����͑�1�H��ł��ˁB��Ƀv���[���g�Ƃ��ēn���O�̂��������l�`�������W�߂Ă����Ă������ꏊ�ł��B";
	end;
OnTalk2:
	unittalk "�L���T�����[�[�^ : �����A�F�X�Ǝv���o���Ă��܂����B��ƕ��𒅂Ȃ��ł��낤�낵�Ă�����A�x�����̂������񂽂��������ė��Ă悭�{���܂����c�c�B";
	end;
OnTalk3:
	unittalk "�L���T�����[�[�^ : ����Ȃ̂Ɂc�c���c�c�B";
	end;
OnTalk4:
	unittalk "�L���T�����[�[�^ : ���c�c����͂��������H�@�l�̑���ɂ��������l�`��������������Ă��܂��B�܂�ō�ƈ��̂悤�Ɂc�c�B";
	end;
OnTalk5:
	unittalk "�L���T�����[�[�^ : �ǂ���璷���ԁA�N�����Ȃ������H���N�����A�ғ������Ă���悤�ł��ˁc�c�B";
	end;
OnTalk6:
	unittalk "�L���T�����[�[�^ : �܂�ŕ������O�ɓ����Ă����l�����Ɏ������c�c�����A�����������ȑO�Ɠ����悤�ł��B�������c�c�B��̒N���c�c�H";
	end;
OnTalk7:
	unittalk "�L���T�����[�[�^ : �����ǁA���ł���ꍇ�ł͂Ȃ������ł��B�L�~���������ɍs�����߂ɂ́A�܂������̐��Y��Ƃ����ׂĒ�~�����Ȃ���΂Ȃ�܂���B";
	end;
OnTalk8:
	unittalk "�L���T�����[�[�^ : ���̂��߂ɂ��A���̐l�`�����Ɠ�����������{�b�N�X���ꎞ�I�ɁA�����Ȃ�����K�v������Ǝv���܂��B";
	end;
OnTalk9:
	unittalk "�L���T�����[�[�^ : ���H�@�����Ȃ�������@�ł����H�@�c�c�����ł��ˁB�s���̐����H���~�߂Ă��܂��Α��v���Ǝv���܂��B";
	end;
OnTalk10:
	unittalk "�L���T�����[�[�^ : ���A�x�����̖����������Ⴝ��������Ă���̂��ȁc�c�B�ʓ|�Ȃ��ƂɂȂ肻���ł������ƕ��ɒ��ւ����ق����悢��������܂���ˁB�ȑO�͂����̉������ɍ�ƕ��ɒ��ւ���{�b�N�X���������̂Ɂc�c�B";
	end;
OnTalk11:
	unittalk "�L���T�����[�[�^ : ���̌��ɂ���܂����ˁB���̐E���p�̈ߕ��{�b�N�X�������ł��B�������������ׂ̈ɁA��ƈ����ɕK�����ւ��ĉ������B���͂܂������̍�ƈ��ؖ��؂������Ă��܂����璅�ւ���K�v�͂Ȃ��̂Łc�c�B";
	end;
OnTalk12:
	unittalk "�L���T�����[�[�^ : ��1�H��̎d�����I���Ȃ��ƁA��2�H�ꂪ�����܂���B�Ƃ肠������ƕ��ɒ��ւ�����A�������Ă���l�`�����Ɠ�����������{�b�N�X�̊������~�߂Ă��������B";
	end;
OnTalk13:
	unittalk "�L���T�����[�[�^ : �b���Ă����ʂ��Ǝv���܂����A�s���̐����H�͂킩��ɂ����ꏊ�ɂ���̂ł����͐���āA�~�߂Ă��܂��܂��傤�B";
	end;
OnTalk14:
	unittalk "�L���T�����[�[�^ : ��������ł����炷���ɏC���\�ł����A������Ɨ��\�Ɉ���ꂽ���炢�ł͂����������Ȃ��̂ŉ����͂���܂���B";
	end;
OnTalk15:
	unittalk "�L���T�����[�[�^ : ���̂�������̊�������~����΁A�A�i�E���X������A��2�H��֍s�������J����������܂��񂵁B";
	end;
OnTalk16:
	unittalk "�L���T�����[�[�^ : ���͎肪���肪�Ȃ������ׂĂ��܂��B�����ɂ���l�`�Ɠ�����������{�b�N�X���~�����A������2�H��ւ̓����J������A�������ō������܂��傤�B�撣���ĉ������B";
	end;
OnTalk17:
	unittalk "�L���T�����[�[�^ : �ł́A��2�H��ւ̓����J������A���������ō������邱�Ƃɂ��܂��傤�B�撣���ĉ������B";
	end;
}

1@xm_d.gat,13,105,6	script	�E���p�̈ߕ��{�b�N�X#1	10033,{
	progressbar 1;
	sc_end SC_MONSTER_TRANSFORM;
	musiceffect "52";
	sc_start SC_MONSTER_TRANSFORM,180000,1246;
	mes "^0000ff�]��ƕ��ɒ��ւ��I���܂����B";
	mes "�@��ƒ��ɕϐg���K�v�ȏꍇ�͂�����";
	mes "�@���ł��ϐg���邱�Ƃ��o���܂��]^000000";
	close;
}

1@xm_d.gat,116,16,6	script	�E���p�̈ߕ��{�b�N�X#2	10033,{
	progressbar 1;
	sc_end SC_MONSTER_TRANSFORM;
	musiceffect "52";
	sc_start SC_MONSTER_TRANSFORM,180000,1246;
	mes "^0000ff�]��ƕ��ɒ��ւ��I���܂����B";
	mes "�@��ƒ��ɕϐg���K�v�ȏꍇ�͂�����";
	mes "�@���ł��ϐg���邱�Ƃ��o���܂��]^000000";
	close;
}

1@xm_d.gat,10,20,6	script	�E���p�̈ߕ��{�b�N�X#3	10033,{
	progressbar 1;
	sc_end SC_MONSTER_TRANSFORM;
	musiceffect "52";
	sc_start SC_MONSTER_TRANSFORM,180000,1246;
	mes "^0000ff�]��ƕ��ɒ��ւ��I���܂����B";
	mes "�@��ƒ��ɕϐg���K�v�ȏꍇ�͂�����";
	mes "�@���ł��ϐg���邱�Ƃ��o���܂��]^000000";
	close;
}

1@xm_d.gat,1,5,3	script	#fac1ct	844,{
OnStart:
	areamonster getmdmapname("1@xm_d.gat"),10,20,116,105,"�v���[���g��S����",2989,31,getmdnpcname("#fac1ct")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),10,20,116,105,"����ꂽ�{�b�N�X",2991,36,getmdnpcname("#fac1ct")+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@xm_d.gat"),getmdnpcname("#fac1ct")+ "::OnKilled");
	if('@count < 28) {
		initnpctimer;
		viewpoint 1,71,129,1,0xFF8000;
		killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("#fac1ct")+"::OnKilled";
		announce "��Ɣǒ��ē����� : ����H�@�݂�Ȃǂ��ɍs���Ă��܂�����!?",0x9,0xff8800;
	}
	end;
OnTimer3000:
	announce "��Ɣǒ��ē����� : ��ς݂̃{�b�N�X���2�H��։^�Ԃ̂ɐl�肪����Ȃ��񂾁I",0x9,0xff8800;
	end;
OnTimer5000:
	stopnpctimer;
	announce "��Ɣǒ��ē����� : �肪�󂢂Ă����͖k���ɂ��郌�[���̂Ƃ���܂ŗ��Ă���I",0x9,0xff8800;
	hideoffnpc getmdnpcname("#fac1bs");
	for(set '@i,61; '@i<=89; set '@i,'@i+1)
		hideonnpc getmdnpcname("alert#"+ '@i);
	end;
}

1@xm_d.gat,71,129,3	script	#fac1bs	10020,{
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) == 1249) {
		mes "[��Ɣǒ�]";
		mes "�����O�Y�O�Y���Ă���񂾁B";
		mes "�����ɂ����ς݂̃{�b�N�X��";
		mes "�����Ă��炻�����ɍs���񂾁I";
		close;
	}
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 1246) {
		mes "[��Ɣǒ�]";
		mes "�Ȃ�!?�@�l�Ԃ���Ȃ���!!";
		mes "�ǂ����Đl�Ԃ�!?";
		mes "�����͊֌W�҈ȊO��������֎~���I";
		mes "�x�����[�I�@�l�Ԃ��[�I";
		unittalk "��Ɣǒ� : �x�����I�@�x�����͂ǂ��ɂ���񂾁I�@�����ɐl�Ԃ��������Ă���I";
		donpcevent getmdnpcname("#alert1") +"::OnStart";
		close;
	}
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "[��Ɣǒ�]";
		mes "��ƈ������Ȃ��Ȃ��ĐS�z���Ă������B";
		mes "�܂������c�c���̓z��͂ǂ��������񂾁H";
		mes "�������ƁA���܂����I";
		mes "����Ȃ��Ƃ����Ă���ꍇ����Ȃ��A";
		mes "�q���B���v���[���g��҂��Ă�񂾁B";
		next;
		mes "[��Ɣǒ�]";
		mes "�}����^ff0000�����ɂ���";
		mes "��ς݂̃{�b�N�X^000000";
		mes "�������ă��[���̓��ɂ���";
		mes "��2�H��Ɉړ����Ă���B";
		mes "�傫������C�����ĉ^�Ԃ񂾂��B";
		unittalk "��Ɣǒ� : �}���ł����ɂ����ς݂̃{�b�N�X�������ă��[���̓��ɂ����2�H��Ɉړ����Ă���B�傫������C�����ĉ^�Ԃ񂾂��B";
		hideoffnpc getmdnpcname("#pck1");
		misceffect 247,getmdnpcname("#pck1");
		close;
	}
	else {
		mes "[��Ɣǒ�]";
		mes "���O�̔ǂ̃��[�_�[�͒N���H";
		mes "���Ԃ��Ȃ��񂾁B";
		mes "���[�_�[�Ƙb�������Ă���B";
		close;
	}
OnStart:
	hideoffnpc getmdnpcname("#fac1bs");
	unittalk "��Ɣǒ� : �l�Ԃ����͑S���r�����ꂽ�݂������ȁc�c�H�@�ŋ߂���Ȃ��Ƃ��p�ɂɋN���Ă���B���Ȑ��̒��ɂȂ������̂��c�c�B�����ƁA�d���d�����ƁB";
	end;
}

1@xm_d.gat,65,127,6	script	#pck1	10033,{
	progressbar 1;
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) == 1249) {
		mes "^009900�]���ɕ�ς݂̃{�b�N�X��";
		mes "�@�����グ�Ă��܂��B";
		mes "�@��x��2�ȏ�͎����グ�邱�Ƃ�";
		mes "�@�ł��܂���]^000000";
		close;
	}
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 1246) {
		mes "^ff0000�]��ƈ��̎p�ł͂Ȃ��̂ŁA";
		mes "�@��ς݂̃{�b�N�X��";
		mes "�@�����グ�邱�Ƃ��ł��܂���B";
		mes "�@���ւ�����Ԃ�";
		mes "�@��ƕ��ɒ��ւ�����Ԃ�";
		mes "�@�����Ă݂܂��傤�]^000000";
		close;
	}
	sc_end SC_MONSTER_TRANSFORM;
	sc_start SC_MONSTER_TRANSFORM,180000,1249;
	mes "^0000ff�]��ς݂̃{�b�N�X��";
	mes "�@�����グ�܂����B";
	mes "�@���܂�ɂ������";
	mes "�@�O�������ƌ����܂���]^000000";
	viewpoint 2,1,1,1,0xFFFFFF;
	viewpoint 1,76,129,2,0xFF8000;
	close;
}

1@xm_d.gat,76,129,0	script	#fac1wp	45,2,2,{
	set '@map$,getmdmapname("1@xm_d.gat");
	set '@label$,getmdnpcname("#fac1ct")+"::OnKilled";
	if(getmapmobs('@map$,'@label$)){
		mes "^ff0000�]�܂������̂������Ⴊ�����Ă���B";
		mes "�@�����Ɗ������Ă��邨�������";
		mes "�@��~������K�v�����肻�����]^000000";
		close;
	}
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 1249) {
		mes "[��Ɣǒ�]";
		mes "�����O�Y�O�Y���Ă���񂾁B";
		mes "�����ɂ����ς݂̃{�b�N�X��";
		mes "�����Ă��炻�����ɍs���񂾁I";
		close;
	}
	warp '@map$,88,129;
	end;
}

1@xm_d.gat,79,129,0	script	#fac1wp2	45,2,2,{
	mes "�]��Ɣǒ����l�肪���Ȃ���";
	mes "�@�՗����Ă���l�q��������B";
	mes "�@�߂�Ƃ܂��A��Ƃ�C���ꂻ�����B";
	mes "�@�p�����Ȃ��ȏ�͖߂�Ȃ�����";
	mes "�@�ǂ���������Ȃ��c�c�]";
	next;
	if(select("��1�H��ɖ߂�Ȃ�","��1�H��ɖ߂�") == 1)
		close;
	warp getmdmapname("1@xm_d.gat"),73,129;
	end;
}

1@xm_d.gat,179,129,0	script	#fac2wp	45,2,2,{
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 1249) {
		mes "�]��ς݂̃{�b�N�X��";
		mes "�@�����グ�Ă��Ȃ�������";
		mes "�@���[�������삵�Ȃ��B";
		mes "�@�ēx�A��ς݂̃{�b�N�X��";
		mes "�@�����ė��悤�]";
		close;
	}
	warp getmdmapname("1@xm_d.gat"),183,100;
	end;
}
1@xm_d.gat,184,109,0	warp	#fac2wp2	2,2,1@xm_d.gat,170,129

1@xm_d.gat,130,135,4	script	���W#1	858,{
	mes "�]^ff0000���x�e��^000000";
	mes "�@���x�e���̗��p�\���Ԃ�";
	mes "�@�A�i�E���X�ɂĈē���";
	mes "�@";
	mes "�@^ff0000����2�H��^000000";
	mes "�@�����[���ɉ����Ă܂��������]";
	close;
}

1@xm_d.gat,1,5,3		script	#alert1	844,{
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	hideonnpc getmdnpcname("#fac1bs");
	end;
OnTimer2000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer3000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer4000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer5000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer6000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer7000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer8000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer9000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer10000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer11000:
	areamonster getmdmapname("1@xm_d.gat"),61,118,71,128,"��������H��x����",2990,1,getmdnpcname("#alert1")+ "::OnKilled";
	end;
OnTimer60000:
	killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("#alert1")+"::OnKilled";
	donpcevent getmdnpcname("#fac1bs")+"OnStart";
	end;
OnKilled:
	end;
}

1@xm_d.gat,185,100,6	script	�L���T�����[�[�^#2	10032,{
	mes "[�L���T�����[�[�^]";
	mes "�����ɍ����ł��܂����ˁA";
	mes "�ǂ������c�c�B";
	mes "����Ƃ��A����܂��񂩁H";
	mes "�x�e�����˂āA";
	mes "�����󋵂𐮗����܂��傤���H";
	unittalk "�L���T�����[�[�^ : �����ɍ����ł��܂����ˁA�ǂ������c�c�B����Ƃ��A����܂��񂩁H�@�x�e�����˂āA�����󋵂𐮗����܂��傤���H";
	next;
	switch(select("�b����߂�","��2�H��̏��𕷂�","�����͕s�v�Ȃ̂Ői�����Ƃ���")) {
	case 1:
		mes "[�L���T�����[�[�^]";
		mes "�������o�����琺�������ĉ������B";
		close;
	case 2:
		viewpoint 1,155,98,1,0xFF8000;
		viewpoint 1,130,72,2,0xFF8000;
		viewpoint 1,134,34,3,0xFF8000;
		viewpoint 1,195,28,4,0xFF8000;
		viewpoint 1,228,30,5,0xFF8000;
		viewpoint 1,203,55,6,0xFF8000;
		viewpoint 1,132,52,7,0xFFF8000;
		viewpoint 1,162,52,8,0xFF8000;
		viewpoint 1,242,17,9,0xFF8000;
		viewpoint 1,209,15,10,0xFF8000;
		donpcevent getmdnpcname("�L���T�����[�[�^#2") +"::OnStart";
		close;
	case 3:
		viewpoint 1,155,98,1,0xFF8000;
		viewpoint 1,130,72,2,0xFF8000;
		viewpoint 1,134,34,3,0xFF8000;
		viewpoint 1,195,28,4,0xFF8000;
		viewpoint 1,228,30,5,0xFF8000;
		viewpoint 1,203,55,6,0xFF8000;
		viewpoint 1,132,52,7,0xFF8000;
		viewpoint 1,162,52,8,0xFF8000;
		viewpoint 1,242,17,9,0xFF8000;
		viewpoint 1,209,15,10,0xFF8000;
		donpcevent getmdnpcname("�L���T�����[�[�^#2") +"::OnStart2";
		close;
	}
OnStart:
	initnpctimer;
	hideoffnpc getmdnpcname("#bgm06");
	hideoffnpc getmdnpcname("�L���T�����[�[�^#21");
	hideonnpc getmdnpcname("�L���T�����[�[�^#2");
	end;
OnTimer1000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk1";
	end;
OnTimer6000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk2";
	end;
OnTimer11000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk3";
	end;
OnTimer16000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk4";
	end;
OnTimer21000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk5";
	end;
OnTimer26000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk6";
	end;
OnTimer31000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk7";
	end;
OnTimer36000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk8";
	end;
OnTimer41000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk9";
	end;
OnTimer46000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk10";
	announce "�]��ƕ��ɒ��ւ�����A�u��ƈ��v������������A�l�`�E�l�̘b�𕷂��Ă݂悤�]",0x9,0xffffff;
	end;
OnTimer52000:
	stopnpctimer;
	hideonnpc getmdnpcname("�L���T�����[�[�^#21");
	hideonnpc getmdnpcname("#bgm06");
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#4");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#4");
	for(set '@i,1; '@i<=10; set '@i,'@i+1)
		hideoffnpc getmdnpcname("��ƈ�#xm_d"+ '@i);
	donpcevent getmdnpcname("#fac2ct")+ "::OnStart";
	donpcevent getmdnpcname("#fac2wpc")+ "::OnStart";
	end;

OnStart2:
	initnpctimer;
	setnpctimer 100000;
	hideoffnpc getmdnpcname("#bgm06");
	hideoffnpc getmdnpcname("�L���T�����[�[�^#21");
	hideonnpc getmdnpcname("�L���T�����[�[�^#2");
	end;
OnTimer103000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk8";
	end;
OnTimer107000:
	donpcevent getmdnpcname("�L���T�����[�[�^#21")+"::OnTalk9";
	announce "�]��ƕ��ɒ��ւ�����A�u��ƈ��v������������A�l�`�E�l�̘b�𕷂��Ă݂悤�]",0x9,0xffffff;
	end;
OnTimer112000:
	stopnpctimer;
	hideonnpc getmdnpcname("�L���T�����[�[�^#21");
	hideonnpc getmdnpcname("#bgm06");
	hideoffnpc getmdnpcname("�E���p�̈ߕ��{�b�N�X#4");
	misceffect 247,getmdnpcname("�E���p�̈ߕ��{�b�N�X#4");
	for(set '@i,1; '@i<=10; set '@i,'@i+1)
		hideoffnpc getmdnpcname("��ƈ�#xm_d"+ '@i);
	donpcevent getmdnpcname("#fac2ct")+ "::OnStart";
	donpcevent getmdnpcname("#fac2wpc")+ "::OnStart";
	end;
}

1@xm_d.gat,185,100,0	script	#bgm06	139,10,10,{
	musiceffect "99";
	end;
}

1@xm_d.gat,185,100,6	script	�L���T�����[�[�^#21	10032,{
	end;
OnTalk1:
	unittalk "�L���T�����[�[�^ : �����͍�ƈ��������v���[���g�����ďW�߂��2�H��ł����B";
	end;
OnTalk2:
	unittalk "�L���T�����[�[�^ : �ȑO�͍H��̂�����ꏊ���l�X�œ�����Ă����̂ɁA���͂����ł��Ȃ��悤�ł��ˁc�c�B";
	end;
OnTalk3:
	unittalk "�L���T�����[�[�^ : ���A�������I�@����r���ɕ����������Ƃł����ǁA�����ɂ͂�������ł͂Ȃ��q���������p�j���Ă��܂��B";
	end;
OnTalk4:
	unittalk "�L���T�����[�[�^ : �Ȃ�Ƃ������c�c�ƂĂ��|���p�ŁB�ƂĂ��߂������Ȋ����̗썰����������������ł��B";
	end;
OnTalk5:
	unittalk "�L���T�����[�[�^ : ���̎q�������P���Ă�����c�c�c�O�ł����`���җl�̎�ŋx�܂��Ă����ĉ������c�c�B���ꂵ���A���̎q�B����������~����i�͂Ȃ��̂ł��c�c�B�Ȃ������ɂ͏P���������Ă��܂���ł������c�c�B";
	end;
OnTalk6:
	unittalk "�L���T�����[�[�^ : ���Ƃ́A�T�����Ă���r���ɍ�ƒ��̂������������������A�l�`�E�l�̘b�𕷂��Ă�����Ă������ł����H�@�ǂ����l�`�E�l�̋L����������������Ă���悤�Ȃ̂ł��c�c�B";
	end;
OnTalk7:
	unittalk "�L���T�����[�[�^ : �����l�`�E�l�ւ̋L�����v���o������A�ނ���������Ƃ��ł��邩������܂���B���ꂪ�B��̊�]�̂悤�ȋC�����܂��c�c�B";
	end;
OnTalk8:
	unittalk "�L���T�����[�[�^ : ������������A���A�����܂��B����ł́A���͉����肪���肪�Ȃ����A�ق��̏ꏊ���������Ă݂܂��ˁB";
	end;
OnTalk9:
	unittalk "�L���T�����[�[�^ : ���A���Ɓc�c��ς݂̃{�b�N�X�͂����K�v�Ȃ��͂��ł��B���̂܂܂ł͉����܂��̂ŁA���̌�Y�ꂸ�ɍ�ƕ��ɒ��ւ��Ă����Ă��������B";
	end;
OnTalk10:
	unittalk "�L���T�����[�[�^ : �����Ă΂���Łc�c�{���ɂ��݂܂���B�ł͌��������܂��傤�B";
	end;
}

1@xm_d.gat,185,94,6		script	�E���p�̈ߕ��{�b�N�X#4	10033,5,5,{
	progressbar 1;
	sc_end SC_MONSTER_TRANSFORM;
	musiceffect "128";
	sc_start SC_MONSTER_TRANSFORM,300000,1246;
	mes "^0000ff�]��ƕ��ɒ��ւ��I���܂����B";
	mes "�@��ƒ��ɕϐg���K�v�ȏꍇ�͂�����";
	mes "�@���ł��ϐg���邱�Ƃ��o���܂��]^000000";
	close;
OnTouch:
	for(set '@i,1; '@i<=10; set '@i,'@i+1)
		doevent getmdnpcname("��ƈ�#xm_d"+'@i)+ "::OnCheck";
	end;
}

1@xm_d.gat,1,5,3		script	#fac2ct	844,{
OnStart:
	areamonster getmdmapname("1@xm_d.gat"),143,36,240,120,"����ꂽ�{�b�N�X",2991,16,getmdnpcname("#fac2ct")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),143,36,240,120,"�H��x�����̍�",2992,16,getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),155,98,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),155,98,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),130,72,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),130,72,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),134,34,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),134,34,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),195,28,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),195,28,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),228,30,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),228,30,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),203,55,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),203,55,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),132,52,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),132,52,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),162,52,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),162,52,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	//monster getmdmapname("1@xm_d.gat"),242,17,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	//monster getmdmapname("1@xm_d.gat"),242,17,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),209,15,"�̂Ă�ꂽ�N�}�l�`",2995,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	monster getmdmapname("1@xm_d.gat"),209,15,"�v���[���g���Ȃ��H��",2993,rand(1,3),getmdnpcname("#fac2ct")+ "::OnKilled";
	end;
OnKilled:
	end;
}

1@xm_d.gat,130,178,0	warp	#fac3wp		2,2,1@xm_d.gat,130,193
1@xm_d.gat,130,184,0	warp	#fac3wp2	2,2,1@xm_d.gat,129,173

1@xm_d.gat,1,2,3		script	#fac2wpc	844,{
OnStart:
	set 'count,10;
	end;
OnCount:
	set 'count,'count-1;
	if('count)
		announce "�H��ē����� : �Ζ��l�����m�F���ł��B�����ݕ���C���ɂ�" +'count+ "������ƒ��ł��B�~�X�̂Ȃ��悤�A�撣���ĉ������B",0x9,0x00ff44;
	else {
		announce "�H��ē����� : �z�����ލ�Ə�̍�ƈ��S�����Ƃɖ߂�܂����B��Ə�̓d�����Ւf���č�ƈ��x�e���̔����J���܂��B",0x9,0x00ff44;
		announce "�]�ʂ�Ȃ������x�e���̔����J�����悤���B��ς݂̃{�b�N�X���ړ����邽�߂Ɏg�������[����k�ɏオ�����ꏊ�ɋx�e�����������͂��B�s���Ă݂悤�]",0x9,0xffffff;
		for(set '@i,90; '@i<=100; set '@i,'@i+1)
			hideonnpc getmdnpcname("alert#"+ '@i);
		killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("#fac2ct")+"::OnKilled";
		hideoffnpc getmdnpcname("#fac3wp");
		hideoffnpc getmdnpcname("#fac3wp2");
	}
	end;
OnCheck:
	for(set '@i,1; '@i<=10; set '@i,'@i+1)
		doevent getmdnpcname("��ƈ�#xm_d"+'@i)+ "::OnCheck";
	end;
}

1@xm_d.gat,155,98,3		script	��ƈ�#xm_d1	10020,{
	mes "[��ƈ�]";
	mes "�ӂށH�@�V���肩���H";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�d���ŖZ�����񂾁B";
		mes "�G�k�͂��Ƃɂ��Ă���B";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �l�`�E�l�c�c�H�@���I�@���̖ꂳ�񂩁I�@���̍H��̑n�Ǝ҂Ől�`�E�l�������ȁB";
	end;
OnTimer4000:
	unittalk "��ƈ� : �����ɂ��邨������݂͂�ȁA���̖ꂳ��̎�Ő��ݏo���ꂽ�Ƃ����Ă��ߌ�����Ȃ��B���_�A�����ˁB";
	end;
OnTimer7000:
	unittalk "��ƈ� : ���ł��A�L�~�����͂��̐l�̍ō�����Ƃ�������ł��炵���B�ꂳ�񂪂����莆�ɏ����Ă��݂̂���B";
	end;
OnTimer10000:
	unittalk "��ƈ� : �Ƃ��������̖ꂳ��̂��ƖY��Ă��c�c�H�@����c�c�H";
	end;
OnTimer13000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d1");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,1,0xFFFFFF;
	end;
}

1@xm_d.gat,130,72,3		script	��ƈ�#xm_d2	10020,{
	mes "[��ƈ�]";
	mes "�ӂ��H";
	mes "���Ȃ��������Ȃ���ˁB";
	mes "�ŋ߁A�ғ��J�n�����́H";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�d���͍����������ς������ς��B";
		mes "�킽���͍������������A�d����B";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �E�l�̂��ꂿ�����L�~����񂪎E�������ĉ\������́H�@����ɂ��Ă͂܂������̏o�L�ڂ�B";
	end;
OnTimer4000:
	unittalk "��ƈ� : �E�l�̂��ꂿ���́A�킽���B�̐��݂̐e�����́B�E���Ȃ�Ă��肦�Ȃ���B";
	end;
OnTimer7000:
	unittalk "��ƈ� : �c�c�L�~�����A�����������炻�̉R��^�ɂ������肵�ĂȂ����ȁB���̎q�A����������c�c�B";
	end;
OnTimer10000:
	unittalk "��ƈ� : ���A���������Ⴂ���Ȃ��B�����E�l�̂��ꂿ���ɉ�ɍs�����B";
	end;
OnTimer13000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d2");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,2,0xFFFFFF;
	end;
}

1@xm_d.gat,134,34,1		script	��ƈ�#xm_d3	10020,{
	mes "[��ƈ�]";
	mes "�����I�@���ܖZ�����񂾁B";
	mes "�p��������Ȃ�A��Z�ɂ��Ă���B";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�������͎d���Ȃ��̂��H";
		mes "�G�k����ɂ�����Ȃ瓭����c�c�B";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �l�`�E�l�̖ꂳ��́A���̍H��̑n�Ǝ҂ł�����A�r�����̐l�`�E�l�ł˂��B";
	end;
OnTimer4000:
	unittalk "��ƈ� : ���ł���i�̂����̈�ł���A�������̊֐ߐl�`�͑�l�C�������B";
	end;
OnTimer7000:
	unittalk "��ƈ� : �������₠�A�������ғ�����̂�߂��͂��Ȃ̂ɁB�{�P�����Ȃ��c�c�B";
	end;
OnTimer10000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d3");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,3,0xFFFFFF;
	end;
}

1@xm_d.gat,195,28,3		script	��ƈ�#xm_d4	10020,{
	mes "[��ƈ�]";
	mes "�c�c�B";
	mes "����A�����p�Ȃ̂��ȁH";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�������d���B�������d���B";
		mes "�d�����Ȃ������l�`�͓{�����H";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �L�~�Ɛl�`�E�l�̂��ꂳ��������Ō�Ɍ����̂́A�x�e�����������ȁB";
	end;
OnTimer4000:
	unittalk "��ƈ� : ���������΍ŋ߁A�x�e������N���ƒN���̘b��������������̂�ˁB";
	end;
OnTimer7000:
	unittalk "��ƈ� : �l�`�E�l�̂��ꂳ��͂��Ȃ��̂ɁA�N�Ȃ񂾂��B";
	end;
OnTimer10000:
	unittalk "��ƈ� : �c�c����H�@�l�`�E�l�̂��ꂳ��̂��ƖY��Ă��I�@�����Ȃ��I";
	end;
OnTimer13000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d4");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,4,0xFFFFFF;
	end;
}

1@xm_d.gat,228,30,1		script	��ƈ�#xm_d5	10020,{
	mes "[��ƈ�]";
	mes "���[��B";
	mes "���[��B";
	mes "�c�c�Ȃ񂾂��������̒��q�������B";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�����Ǔ����ǁB";
		mes "��̕�炵�A�y�ɂȂ炸�c�c�B";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : ���[��A�L�����肩����Ȃ��񂾂��ǁc�c�B";
	end;
OnTimer4000:
	unittalk "��ƈ� : �N���ɂ��ꂳ��ɂ��āA�L���̃������[����₂��ꂽ�\��������񂾁B";
	end;
OnTimer7000:
	unittalk "��ƈ� : �l�ԁc�c�Ȃ񂾂낤���H�@�ςȏ΂�������ۂɎc���Ă邯�ǁA�悭���ڂ��ĂȂ���B";
	end;
OnTimer10000:
	unittalk "��ƈ� : �ł��������ŁA���̂��ꂳ����v���o���Ă悩�����B���肪�Ƃ��B";
	end;
OnTimer13000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d5");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,5,0xFFFFFF;
	end;
}

1@xm_d.gat,203,55,3		script	��ƈ�#xm_d6	10020,{
	mes "[��ƈ�]";
	mes "���`���q�����B";
	mes "���͌��̕s���Ȃ̂��ˁB";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�d���łւƂւƂłˁc�c�B";
		mes "�G�k�������C������Ȃ��񂾂�B";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �ȑO�́A�ό��q���吨�K���X�������񂾁B�ꂳ����A���������������ȁB";
	end;
OnTimer4000:
	unittalk "��ƈ� : �Ƃ��낪����������ɁA�ڂ������R�͂킩��Ȃ��񂾂��ǁA�ό��q�����Ȃ��Ȃ��Ă����A���̗L�l����B";
	end;
OnTimer7000:
	unittalk "��ƈ� : ���āA�ꂳ������Ȃ����A���̂܂܂��Ǝ₵������A�����Ƃ��悤���ȁB";
	end;
OnTimer10000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d6");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,6,0xFFFFFF;
	end;
}

1@xm_d.gat,132,52,1		script	��ƈ�#xm_d7	10020,{
	mes "[��ƈ�]";
	mes "�₠�B";
	mes "�l�ɂȂɂ��p���ȁB";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�d���ŖZ�����񂾁B";
		mes "�G�k�͂�߂Ă����H";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �ꂿ��񂪐����Ă�����A���܂ɐԂ����̐l�Ԃ����������Ȃ��B";
	end;
OnTimer4000:
	unittalk "��ƈ� : �ꂿ���̒m�荇���Ȃ̂��A�ڍׂ܂ł͒m��Ȃ��񂾂��ǂˁB";
	end;
OnTimer7000:
	unittalk "��ƈ� : ��͂悭�莆�������Ă���B�N�ɏ����Ă����͒m��Ȃ����ǁB";
	end;
OnTimer10000:
	unittalk "��ƈ� : �莆�����B�c�c�l���ꂿ���ɁA�莆�����������ȁB";
	end;
OnTimer13000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d7");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,7,0xFFFFFF;
	end;
}

1@xm_d.gat,162,52,1		script	��ƈ�#xm_d8	10020,{
	mes "[��ƈ�]";
	mes "���H";
	mes "���ɗp����H";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "���Z�����I�@���d������!!";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �L�~�A���Ȃ��Ȃ����B���̕ςȐl�ԁA�L�~�Ƙb���Ă�݂̂��̍Ō�B";
	end;
OnTimer4000:
	unittalk "��ƈ� : ��������������B�ł���������̗l�q�ς������B�Ȃɂ��������H�@����������A�Ȃ�ł��Ȃ��H";
	end;
OnTimer7000:
	unittalk "��ƈ� : ���A����������T���Ă���B�����Ă���B";
	end;
OnTimer10000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d8");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,8,0xFFFFFF;
	end;
}

1@xm_d.gat,242,17,5	script	��ƈ�#xm_d9	10020,{
	mes "[��ƈ�]";
	mes "����`��";
	mes "�I�H";
	mes "���́A���A�����Ă܂���!?";
	mes "�̂��Ȃ���d������ƌ��������́B";
	mes "�ł��A���͖̂Y��Ă��������I";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�c�c����A�Ȃɂ��Ȃ��Ȃ�";
		mes "�d���ɏW�������Ăق�����B";
		mes "�d�����Ă�΂Ȃɂ��l���Ȃ���";
		mes "���ނ���c�c�B";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : ����l�̂��Ƃł����c�c�H�@�L�~���������A�ڂ��J�����u�ԁA�S���a�ɂ���ēV�ɏ����ꂽ�悤�ł��B";
	end;
OnTimer4000:
	unittalk "��ƈ� : �L�~�͂ǂ����A�����̊�����Ă���l�͖S���Ȃ������̂Ǝv���Ă���悤�ł����c�c�B";
	end;
OnTimer7000:
	unittalk "��ƈ� : �����A�ǂ��������ʂł���A�L�~�͍Ō�ɂ���l�Ɖ���̂ł�����B";
	end;
OnTimer10000:
	unittalk "��ƈ� : ���H�@������ł��x���Ȃ��c�c�ł����B�c�c���ł��傤���B�����c�c�B";
	end;
OnTimer13000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d9");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,9,0xFFFFFF;
	end;
}

1@xm_d.gat,209,15,3	script	��ƈ�#xm_d10	10020,{
	mes "[��ƈ�]";
	mes "�ӂ��[���c�c�B";
	mes "�ނɂ�A�Ȃɂ��p�H";
	mes "�����񂾂��ǁc�c�B";
	next;
	if(select("�l�`�E�l�ɂ��Đq�˂�","���ł��Ȃ�") == 2) {
		mes "[��ƈ�]";
		mes "�d�����̎���͍T�������";
		mes "�����Ȃ������́[�H";
		close;
	}
	initnpctimer;
	set 'flag,1;
	doevent getmdnpcname("#fac2wpc")+ "::OnCheck";
	close;
OnTimer1000:
	unittalk "��ƈ� : �l�Ԃ̓L�~�̂��Ƃ�|���邯��ǁA�L�~�����͎������̖ʓ|���悭�݂Ă�����[�B�܂�Ő��O�̂��ꂳ��݂����ɁB";
	end;
OnTimer4000:
	unittalk "��ƈ� : �悭�L�~�����ɁA���ꂳ��ɍ���Ă���������ăA�N�Z�T���[�̃��{����P�������Ă��������[�B";
	end;
OnTimer7000:
	unittalk "��ƈ� : �Ƃ���ł��ꂳ��A�ǂ��ɂ���̂��ȁ[�c�c�B";
	end;
OnTimer10000:
	donpcevent getmdnpcname("#fac2wpc")+ "::OnCount";
	hideonnpc getmdnpcname("��ƈ�#xm_d10");
	end;
OnCheck:
	if('flag)
		viewpoint 2,1,1,10,0xFFFFFF;
	end;
}

1@xm_d.gat,131,208,0	script	#bgm04	139,{
	musiceffect "54";
	end;
}

1@xm_d.gat,131,208,0	script	#bgm05	139,{
	musiceffect "105";
	end;
}

1@xm_d.gat,113,207,5	script	���W#2	858,{
	mes "�]^ff0000��3�H��͂�����I^000000";
	mes "�@��3�H��͔z���̏�����";
	mes "�@��������܂ŗ������邱�Ƃ�";
	mes "�@�ł��܂���B";
	mes "�@���ӂ��܂��傤�]";
	close;
}

1@xm_d.gat,131,208,8	script	����ꂽ�T���^#2	718,10,10,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1)) {
			mes "�]�T���^�炵���j��";
			mes "�@���Ȃ�����u�݂��";
			mes "�@�����Řb�������Ă����]";
			next;
			mes "[����ꂽ�T���^]";
			mes "�����X�^�[�̊i�D�����Ă��邪";
			mes "�ȑO�A��������Ƃ�����ˁB";
		}
		else {
			mes "[����ꂽ�T���^]";
			mes "�c�c!?";
			mes "�܂��N�ɉ�Ƃ͎v��Ȃ�������B";
		}
		mes "�N�A���𔛂��Ă��邱�̓��";
		mes "�܂������Ă���Ȃ����낤���c�c�B";
		mes "�A���\�j�ɂ܂������";
		mes "�H����Ă��܂��Ăˁc�c�B";
		next;
		if(select("��b���΂�","�b�𑱂���") == 1) {
			mes "�]���Ȃ��͓������";
			mes "�@�ЂƂ�����b�Ɏ����X�����]";
			close2;
			donpcevent getmdnpcname("����ꂽ�T���^#3")+ "::OnStart2";
			end;
		}
		mes "[����ꂽ�T���^]";
		mes "���ށc�c�I";
		mes "���̂܂܂ł́A�q�������₠�̎q��";
		mes "�����]��z�邱�Ƃ��ł���";
		mes "�߂����v���������Ă��܂����낤�B";
		mes "�ǂ������肢���B";
		mes "���̓�������Ă���c�c�I";
		next;
		if(select("�b����߂�","�������") == 1) {
			mes "[����ꂽ�T���^]";
			mes "�������c�c�B";
			mes "�ȑO�͉����Ă��ꂽ�̂�";
			mes "����͉����Ă���Ȃ��̂��B";
			mes "�d�����Ȃ��Ƃ͂����A";
			mes "�҂������̂��ȁc�c�B";
			close;
		}
		donpcevent getmdnpcname("����ꂽ�T���^#3")+ "::OnStart";
		close;
	}
	else {
		mes "[����ꂽ�T���^]";
		mes "�N�����̃��[�_�[�͒N�����H";
		mes "���[�_�[�̐l�Ԃ�";
		mes "�b���������Ƃ�����񂾁B";
		close;
	}
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	stopnpctimer;
	unittalk "����ꂽ�T���^ : �A���\�j�A�ڂ��o�܂��I�@�����āA�������̓�������I�@���Ȃ�܂��A���O�̍߂��y���͂����I";
	end;
}

1@xm_d.gat,131,208,8	script	����ꂽ�T���^#3	718,{
	mes "[����ꂽ�T���^]";
	mes "�����獡�͂��̍H���";
	mes "�傪���Ȃ�����Ƃ�����";
	mes "����ȕ��ɂ��̏ꏊ���r�炵";
	mes "�D������ɕ��𓐂��";
	mes "�������킯���Ȃ��I";
	close;
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("����ꂽ�T���^#2");
	hideoffnpc getmdnpcname("����ꂽ�T���^#3");
	hideoffnpc getmdnpcname("#bgm04");
	end;
OnStart2:
	unittalk "����ꂽ�T���^ : �A���\�j�͑�3�H��̂ǂ����ɂ���Ǝv���B���܂Ȃ����A�q�������₱�̍H��̖����𗊂ށc�c�I";
	hideonnpc getmdnpcname("�A���\�j#1");
	hideonnpc getmdnpcname("����ꂽ�T���^#2");
	hideoffnpc getmdnpcname("����ꂽ�T���^#3");
	hideonnpc getmdnpcname("#bgm04");
	hideoffnpc getmdnpcname("#fac4wp");
	hideoffnpc getmdnpcname("#fac4wp2");
	hideoffnpc getmdnpcname("#bgm05");
	donpcevent getmdnpcname("#fac3ct")+ "::OnStart";
	donpcevent getmdnpcname("#fac3ct2")+ "::OnStart";
	donpcevent getmdnpcname("#fac3ct3")+ "::OnStart";
	end;
OnTimer2000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk1";
	end;
OnTimer4000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk2";
	end;
OnTimer6000:
	unittalk "����ꂽ�T���^ : ��Ƀv���[���g�̔z����f��ꂽ�������Ƃ͂����A���������Ǝv��Ȃ��̂��H�@�傪���Ȃ���ԂŁA�Ȃ����̍H�ꂪ�����Ă���̂��I�B";
	end;
OnTimer9000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk3";
	end;
OnTimer12000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk4";
	end;
OnTimer16000:
	unittalk "����ꂽ�T���^ : ����͂��O�̓s�����낤�I�@����Ɏq������������ȃv���[���g���󂯎�������̋C�������l���Ă݂�I";
	end;
OnTimer20000:
	unittalk "����ꂽ�T���^ : ���K�̈˗��ō���Ȃ��������������z��ꂽ�ƒm��΁A�q�������̋C�����͂ǂ��Ȃ�!?";
	end;
OnTimer24000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk5";
	end;
OnTimer27000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk6";
	end;
OnTimer30000:
	unittalk "����ꂽ�T���^ : ���O�̂ւ肭�͕����Ă��Ȃ��I�@�������ɂł����̍H�ꂩ��o�čs���񂾁I�@�A���\�j�I";
	end;
OnTimer34000:
	announce "�H��ē����� : ��3�H��ɂĔ����������I���܂����B",0x9,0x00ff44;
	end;
OnTimer38000:
	announce "�H��ē����� : �z�����̐E�������͏��������ĉ������B",0x9,0x00ff44;
	end;
OnTimer41000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk7";
	end;
OnTimer45000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk8";
	end;
OnTimer49000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk9";
	end;
OnTimer53000:
	donpcevent getmdnpcname("�A���\�j#1")+"::OnTalk10";
	end;
OnTimer58000:
	hideonnpc getmdnpcname("�A���\�j#1");
	end;
OnTimer60000:
	unittalk "����ꂽ�T���^ : �����c�c�T���^�N���[�X�́c�c�q�������̖����́c�c�ǂ��Ȃ��Ă��܂��̂��c�c�B";
	end;
OnTimer64000:
	unittalk "����ꂽ�T���^ : �N���Ȃ������ɂ���̂��킩��Ȃ����c�c���̃A���\�j�Ƃ����z���A���͍s�g�ōH�ꂩ��ǂ��o���Ă���Ȃ����낤���B";
	end;
OnTimer68000:
	unittalk "����ꂽ�T���^ : �������͂��̍H��̐l�`�E�l����v���[���g�̔z���𗊂܂�Ă����̂����A���̃A���\�j�͐l�`�E�l�Ɍ����A�d���������ꂽ�񂾁B";
	end;
OnTimer72000:
	unittalk "����ꂽ�T���^ : ����Ȃ̂ɂ����͂�����t���݂��āA�Ȃ����傪���Ȃ��̂ɉғ����Ă������̍H��ɖڂ�t���A������䂪�����舕����Ă���񂾁B";
	end;
OnTimer76000:
	unittalk "����ꂽ�T���^ : �������������~�߂ɂ������𔛂����������A�l�`�E�l�̖��Ƃ�������l�`�����ӂ̐��O���œ��̕�������o�Ă��Ȃ��悤�Ɏd�������悤���B";
	end;
OnTimer80000:
	unittalk "����ꂽ�T���^ : �����Ȃ�Ƃ��ł���Ηǂ��̂����A�T���^�N���[�X���m�͌_��̊֌W��A����o���Ȃ��񂾁c�c�B";
	end;
OnTimer84000:
	unittalk "����ꂽ�T���^ : �A���\�j�͑�3�H��̂ǂ����ɂ���Ǝv���B���܂Ȃ����A�q�������₱�̍H��̖����𗊂ށc�c�I";
	hideonnpc getmdnpcname("#bgm04");
	hideoffnpc getmdnpcname("#fac4wp");
	hideoffnpc getmdnpcname("#fac4wp2");
	hideoffnpc getmdnpcname("#bgm05");
	donpcevent getmdnpcname("#fac3ct")+ "::OnStart";
	donpcevent getmdnpcname("#fac3ct2")+ "::OnStart";
	donpcevent getmdnpcname("#fac3ct3")+ "::OnStart";
	end;
}

1@xm_d.gat,131,213,4	script	�A���\�j#1	10019,{
	mes "[�A���\�j]";
	mes "���������B";
	mes "���ꂶ�Ⴀ�܂�ŉ��l��";
	mes "�S�������݂�������Ȃ����B";
	mes "�g���Ȃ��Ȃ����H�����������";
	mes "�L�����p���Ă邾���Ȃ̂ɁB";
	mes "�N�N�N�c�c�B";
	close;
OnTalk1:
	unittalk "�A���\�j : �悭������ꂳ��B���͂��̍H�ꂪ�C�ɓ����Ă���񂾁B";
	end;
OnTalk2:
	unittalk "�A���\�j : ���̍H��̎�͂����Ƃ����ɂ����΂��Ă��邵�A���l�̂��߂ɓ����Ă����悤�ɂ��肢���Ă������񂶂�ˁ`�H�B";
	end;
OnTalk3:
	unittalk "�A���\�j : �悭�������B�傪���Ȃ����Ă��Ƃ͒N�̂��̂ł��Ȃ����Ă��Ƃ���H�@��́A�傪���Ȃ��̂ɂȂ�ŉғ����Ă�̂��Ȃ�ĉ��l�͒m��Ȃ����A�������ˁ[��B";
	end;
OnTalk4:
	unittalk "�A���\�j : �v�͒���`������A���̍H�ꂪ�ғ����Ă��B�����炻������l���L���ɗ��p���Ă��邾���ŁA�ꂳ��ɂƂ₩�����������͂Ȃ��͂������H";
	end;
OnTalk5:
	unittalk "�A���\�j : �ցc�c�H�@�q�������̋C���������āH";
	end;
OnTalk6:
	unittalk "�A���\�j : �ʂɂ����񂶂�Ȃ��H�@���ʓI�ɂ̓v���[���g����Ȃ����B�ق�A�^���̐��荇�킹���o�b�^���u�ߕ����A���ɓ���Γ�������H�@�N�N�N�c�c�B";
	end;
OnTalk7:
	unittalk "�A���\�j : ���H�@�v���[���g���������������`�����񗭂܂��Ă���ȁB���āA�����͂ǂ�ȃv���[���g���W�܂��Ă邩��!?";
	end;
OnTalk8:
	unittalk "�A���\�j : �����ƁA�����̐l�ԁB�z���p�̂�������Ɏ���o���Ȃ���΁A���l�͐l�Ԃł��׌��ɂ��Ȃ����B�N���ƈ���āA�S���L������ȁB";
	end;
OnTalk9:
	unittalk "�A���\�j : �����ɂ��邨�������A���̏��̐l�`������o���Ȃ����ǂ����܂ł͕ۏ؂͂ł��Ȃ����ǂȁB�N�N�N�c�c�B";
	end;
OnTalk10:
	unittalk "�A���\�j : ���[�āA��3�H��̗l�q�ł����Ă��܂����ˁB";
	end;
}

1@xm_d.gat,143,209,4	script	����ꂽ�T���^#4	718,5,5,{
	if(checkquest(96405)) {
		mes "[����ꂽ�T���^]";
		mes "����͂�A���b�ɂȂ����ˁB";
		mes "�Ȃ�Ƃ���������΂悢���B";
		mes "�ޏ��́A���̉��̕�����";
		mes "��������悤���B";
		mes "�ǂ����A�ޏ��������Ă���Ă���B";
		close;
	}
	mes "[����ꂽ�T���^]";
	mes "����ł��΂炭�A�A���\�j��";
	mes "���̍H��ɂ͋߂Â��Ȃ����낤�B";
	mes "�����̎�蕿��";
	mes "�̂̏�v���ƒ��߂̈���������";
	mes "�C�ɕa�ޕK�v�͂Ȃ��B";
	next;
	mes "[����ꂽ�T���^]";
	mes "���ƁA���܂Ȃ����A";
	mes "���̏����̐l�`�ɂ����f�����������Ƃ�";
	mes "�ӂ��Ă����Ăق����B";
	next;
	mes "[����ꂽ�T���^]";
	mes "�N�ɂ͖{���ɐ��b�ɂȂ����ˁB";
	if(checkitemblank() == 0) {
		next;
		mes "[����ꂽ�T���^]";
		mes "����H�@�����Ԃ�Ɖו������������ˁB";
		mes "�����ו������炵�Ă���";
		mes "�܂�����Ƃ����B";
		close;
	}
	set '@flag,checkquest(96400);
	delquest 96400;
	if('@flag & 0x4) {
		set '@user,getmapusers("this");
		if('@user < 12)
			set '@exp,(3500000+500000*'@user) / 7;
		else
			set '@exp,10000000 / 7;
		for(set '@i,0; '@i<7; set '@i,'@i+1)
			getexp '@exp,0;
		mes "�����₩�����A����͂��炾�B";
		mes "�󂯎���Ă���B";
		getitem 7642,10;
	}
	setquest 96405;
	close;
OnTouch:
	mes "[����ꂽ�T���^]";
	mes "�����I";
	mes "�A���\�j��ǂ��o���Ă��ꂽ���I";
	mes "���ЁA�����Ƌ߂��ɗ���";
	mes "�b�𕷂����Ă���Ȃ����I";
	close;
}

1@xm_d.gat,107,208,0	warp	#fac4wp	2,2,1@xm_d.gat,87,208
1@xm_d.gat,95,208,0		warp	#fac4wp2	2,2,1@xm_d.gat,115,208

1@xm_d.gat,1,5,3		script	#fac3ct	844,{
OnStart:
	monster getmdmapname("1@xm_d.gat"),229,234,"�A���\�j",2988,1,getmdnpcname("#fac3ct")+ "::OnKilled";
	end;
OnKilled:
	killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("#fac3ct2")+"::OnKilled";
	killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("#fac3ct3")+"::OnKilled";
	donpcevent getmdnpcname("#finalbs")+"::OnStart";
	hideonnpc getmdnpcname("����ꂽ�T���^#3");
	hideoffnpc getmdnpcname("����ꂽ�T���^#4");
	hideonnpc getmdnpcname("#fac3wp");
	hideonnpc getmdnpcname("#fac3wp2");
	end;
}

1@xm_d.gat,1,5,3		script	#fac3ct2	844,{
OnStart:
	areamonster getmdmapname("1@xm_d.gat"),10,140,90,250,"�H��x�����̍�",2992,25,getmdnpcname("#fac3ct2")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),10,140,90,250,"�̂Ă�ꂽ�N�}�l�`",2995,30,getmdnpcname("#fac3ct2")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),10,140,90,250,"����ȑ����c���[",2987,30,getmdnpcname("#fac3ct2")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),10,140,90,250,"�v���[���g���Ȃ��H��",2993,30,getmdnpcname("#fac3ct2")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),10,140,90,250,"�����Ȃ������l�`",2994,30,getmdnpcname("#fac3ct2")+ "::OnKilled";
	end;
OnKilled:
	end;
}

1@xm_d.gat,1,5,3		script	#fac3ct3	844,{
OnStart:
	areamonster getmdmapname("1@xm_d.gat"),165,218,253,250,"�H��x�����̍�",2992,10,getmdnpcname("#fac3ct3")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),165,218,253,250,"�̂Ă�ꂽ�N�}�l�`",2995,15,getmdnpcname("#fac3ct3")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),165,218,253,250,"����ȑ����c���[",2987,15,getmdnpcname("#fac3ct3")+ "::OnKilled";
	areamonster getmdmapname("1@xm_d.gat"),165,218,253,250,"�v���[���g���Ȃ��H��",2993,15,getmdnpcname("#fac3ct3")+ "::OnKilled";
	end;
OnKilled:
	end;
}

1@xm_d.gat,1,5,3		script	#finalbs	844,{
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	announce "�A���\�j : �ƁA�Ƃ肠��������́A�l�ԂɖƂ��ďo�čs���Ă���I�@���΂�I�@�c�c�C�f�f�f�f�B",0x9,0x00ff44;
	end;
OnTimer4000:
	stopnpctimer;
	hideoffnpc getmdnpcname("#fac5wp");
	hideoffnpc getmdnpcname("#fac5wp2");
	announce "�L���T�����[�[�^ : ���A��ςł��I�@�L�A�L�~��������ł��I�@�x�e���ɂ���u�֌W�҈ȊO��������֎~�I�v�Ə����ꂽ�Ŕ́A���ɂ��镔���ł��I�@�́A�������Ă�������!!",0x9,0xff6666;
	end;
}

1@xm_d.gat,144,207,2	script	���W#3	858,{
	mes "�]^ff0000�֌W�҈ȊO��������֎~�I^000000";
	mes "�@���̐�̕����A���l�̋��Ȃ�";
	mes "�@�������邱�Ƃ͋֎~�����`�H";
	mes "�@BY�@�A���\�j�]";
	close;
}

1@xm_d.gat,152,208,0	warp	#fac5wp	2,2,1@xm_d.gat,167,208
1@xm_d.gat,160,208,0	warp	#fac5wp2	2,2,1@xm_d.gat,145,208

1@xm_d.gat,233,183,3	script	�Z���[�k�E�L�~#0	10034,{
	mes "[�Z���[�k�E�L�~]";
	mes "���Ȃ����ȑO�����l�Ԃ̂悤��";
	mes "�������r�炵�ɗ����́c�c�H";
	mes "�˂��A���Ȃ������͂ǂ�����";
	mes "�j�󂵂�����́H";
	close;
OnTalk1:
	unittalk "�Z���[�k�E�L�~ : �b�c�c�H�@�c�c����ȋ��낵���O�������Ă���킽���̘b�Ȃ�āA�N���������Ă���Ȃ��I�@�������������c�c�������Ⴝ�����c�c�I";
	end;
OnTalk2:
	unittalk "�Z���[�k�E�L�~ : �Ђǂ����Ƃ�����q����Ȃ��c�c�H�@���Ⴀ�A�����������͂ǂ����āA������x�ڂ��J���āA�킽�����݂Ă���Ȃ�������!?";
	end;
OnTalk3:
	unittalk "�Z���[�k�E�L�~ : �����������A�킽���̊�����Ăт����肵�����ƁA�킽�����牓�������ē����Ȃ��Ȃ����c�c�B�킽����������̂�h�����Ă��A���O�����ł������Ă���Ȃ������c�c�B";
	end;
OnTalk4:
	unittalk "�Z���[�k�E�L�~ : �����������c�c�a�C�c�c�������́c�c�H";
	end;
OnTalk5:
	unittalk "�Z���[�k�E�L�~ : �킽���c�c���c�c�킽���̊炪����Ȃ�����c�c�����������A�т����肵�ĐS�����Ƃ܂���������́c�c�H";
	end;
OnTalk6:
	unittalk "�Z���[�k�E�L�~ : ���c�c�H�@�c�c�킽���A������Ă����́c�c�H�@�킽�����������������E�����킯����Ȃ��́c�c�H�@����ꂽ�킯����Ȃ��́H";
	end;
OnTalk7:
	unittalk "�Z���[�k�E�L�~ : ��c�c�킽���c�c���ꂪ�c�c�킽���c�c�B�X���c�c�|���c�c�킽���̏X���S���̂܂܁c�c�I�@����Ȃ̂���A�݂�ȁA�݂�ȁc�c�킽�����c�c";
	end;
OnTalk8:
	unittalk "�Z���[�k�E�L�~ : �킽�������̕����ɂ��闝�R�c�c�X���킽�������낤�낵����A�݂�ȕ|����c�c��������āc�c����ꂽ�c�c�B������킽���A�����Ɂc�c�B";
	end;
OnTalk9:
	unittalk "�Z���[�k�E�L�~ : �������������c�c�킽���Ȃ񂩈����ĂȂ������c�c�I�@�Ԃ����̂��o�������A�킽�����x���āc�c�킽�����΂����̂ɂ�����肾������ł���c�c�I";
	end;
}

1@xm_d.gat,222,183,0	script	#jeton1	139,7,7,{
OnTouch:
	mes "�]�L�~���܂��\�����n�߂������]";
	mes "�@";
	mes "�]�L���T�����[�[�^�̘b��";
	mes "�@�����܂����H�]";
	next;
	switch(select("�������ɐi�߂�","�b�𕷂�")) {
	case 1:
		hideonnpc getmdnpcname("#jeton1");
		hideoffnpc getmdnpcname("#bgm03");
		donpcevent getmdnpcname("#finalbs2")+"::OnStart2";
		close;
	case 2:
		hideonnpc getmdnpcname("#jeton1");
		hideoffnpc getmdnpcname("#bgm02");
		donpcevent getmdnpcname("#finalbs2")+"::OnStart";
		close;
	}
}

1@xm_d.gat,222,183,0	script	#bgm02	139,7,7,{
	musiceffect "101";
	end;
}

1@xm_d.gat,222,183,6	script	�L���T�����[�[�^#5	10032,{
	mes "[�L���T�����[�[�^]";
	mes "���c�c�C��t���ĉ������I";
	mes "�L�~�͕��ʂ̏�Ԃ���Ȃ������ł��B";
	mes "���������Ă���̂ł���";
	mes "�ǂ����l�q�����������āc�c�B";
	mes "�ꏏ�ɐ��������Ă��������I";
	close;
OnTalk1:
	unittalk "�L���T�����[�[�^ : �L�~�I�@���̘b�𕷂��āB���Ƃ��̐l�́A�������r�炷���߂ɗ����킯�ł͂Ȃ��I�@���Ȃ��Ƙb���������́B";
	end;
OnTalk2:
	unittalk "�L���T�����[�[�^ : ���́c�c���Ȃ����Ђǂ����Ƃ�����q����Ȃ����ĐM���Ă�B�@�����狳���āA�L�~�B�����������́H�@���̂��̊�͂��Ȃ��̂����Ȃ́H";
	end;
OnTalk3:
	unittalk "�L���T�����[�[�^ : !?�@��́A�N�������Ă�́c�c�B�L�~�ȊO�ɐ����c�c�B";
	end;
OnTalk4:
	unittalk "�L���T�����[�[�^ : �L�~�c�c�I�@���̐��Ɏ����X���Ȃ��ŁI�@���ꂳ��͂��Ȃ��̖��O���ĂԑO�ɁA�a�C�̂����Łc�c";
	end;
OnTalk5:
	unittalk "�L���T�����[�[�^ : �����I�@�a�C����I�@���𐁂����܂ꂽ���Ȃ������������̏u�ԁA���ꂳ��͂��܂�̊�тɁc�c�B";
	end;
OnTalk6:
	unittalk "�L���T�����[�[�^ : �L�~�A����͈Ⴄ�I�@���Ȃ��͂��ꂳ����E���ĂȂ񂩂��Ȃ��I�@���ꂳ����A���Ȃ��ɎE���ꂽ�Ȃ�Ďv���Ă��Ȃ�!!";
	end;
OnTalk7:
	unittalk "�L���T�����[�[�^ : ���A�Ⴄ�I�@�c�c�ʖڂ���B�L�~�̎��䂪���􂵂Ă��܂��I�@���̂܂܂ɂ��Ă����Ɗ댯�ł��c�c�I�@�d������܂���c�c���̎q���A�~�߂Ă��������I";
	end;
OnTalk8:
	unittalk "�L���T�����[�[�^ : �͂Â��ō\���܂���B�L�~����ꂽ��c�c�����c�c�����Ȃ�Ƃ����Ă݂��܂��B�Ȃ̂ŁA�`���җl�͎����̈��S��D�悵�Ă��������I";
	end;
OnTalk9:
	unittalk "�L���T�����[�[�^ : �H��̋�C�����������c�c�B�`���җl�I�@���̓L�~���~�߂邽�߂̎肪���肪�Ȃ����T���Ă��܂��I";
	end;
OnTalk10:
	unittalk "�L���T�����[�[�^ : �L�~�̎��䂪���􂵂Ă��܂��I�@���̂܂܂ɂ��Ă����Ɗ댯�ł��c�c�I�@���̎q���A�~�߂Ă��������I";
	end;
}

1@xm_d.gat,216,193,3	script	xm_d#eff_f01	844,{
OnStart:
	misceffect 343;
	end;
}
1@xm_d.gat,226,193,3	duplicate(xm_d#eff_f01)	xm_d#eff_f02	844
1@xm_d.gat,236,193,3	duplicate(xm_d#eff_f01)	xm_d#eff_f03	844
1@xm_d.gat,216,183,3	duplicate(xm_d#eff_f01)	xm_d#eff_f04	844
1@xm_d.gat,226,183,3	duplicate(xm_d#eff_f01)	xm_d#eff_f05	844
1@xm_d.gat,236,183,3	duplicate(xm_d#eff_f01)	xm_d#eff_f06	844
1@xm_d.gat,216,173,3	duplicate(xm_d#eff_f01)	xm_d#eff_f07	844
1@xm_d.gat,226,173,3	duplicate(xm_d#eff_f01)	xm_d#eff_f08	844
1@xm_d.gat,236,173,3	duplicate(xm_d#eff_f01)	xm_d#eff_f09	844

1@xm_d.gat,2,2,3		script	#bear	844,{
	end;
OnStart:
	if(rand(5))
		end;
	if(getmapmobs(getmdmapname("1@xm_d.gat"),getmdnpcname("#bear")+ "::OnKilled") >= 10)
		end;
	set '@user,getmapusers("this");
	if('@user >= 6)
		set '@num,3;
	else if('@user >= 3)
		set '@num,2;
	else
		set '@num,1;
	areamonster getmdmapname("1@xm_d.gat"),213,173,243,193,"�̂Ă�ꂽ�N�}�l�`",2995,'@num,getmdnpcname("#bear")+ "::OnKilled";
	end;
OnKilled:
	// dummy
	end;
}

1@xm_d.gat,233,183,0	script	#kimion1	139,7,7,{
OnTouch:
	initnpctimer;
	hideonnpc getmdnpcname("#kimion1");
	end;
OnTimer5000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#2")+"::OnTalk";
	misceffect 247,getmdnpcname("�Z���[�k�E�L�~#2");
	end;
OnTimer10000:
	stopnpctimer;
	hideonnpc getmdnpcname("�Z���[�k�E�L�~#2");
	hideoffnpc getmdnpcname("#bgm03");
	hideonnpc getmdnpcname("�Z���[�k�E�L�~#0");
	hideonnpc getmdnpcname("�L���T�����[�[�^#5");
	donpcevent getmdnpcname("xm_d#heal_c")+"::OnStart";
	end;
}

1@xm_d.gat,233,183,3	script	�Z���[�k�E�L�~#2	10034,{
	mes "[�Z���[�k�E�L�~]";
	mes "�c�c�킽���͏X���B";
	mes "�c�c�킽���͕|���B";
	mes "�c�c�݂�Ȗ{���͂킽���������Ă�B";
	mes "�c�c�������������A����������B";
	mes "�c�c���Ȃ����A�����ł���H";
	close;
OnTalk:
	unittalk "�Z���[�k�E�L�~ :  ���Ȃ����c�c�킽�����E���ɗ����́H�@���Ȃ����c�c�킽�����΂��ɗ����́H�@���Ȃ����c�c�킽�����X�����Ďv���́H���Ȃ����c�c�킽�����������Č����́H";
	end;
}

1@xm_d.gat,228,183,0	script	#bgm03	139,7,7,{
	musiceffect "101";
	end;
}

1@xm_d.gat,1,5,3		script	#finalbs2	844,{
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk1";
	end;
OnTimer5000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk1";
	end;
OnTimer7000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk2";
	end;
OnTimer12000:
	announce "�L�~�̌��e : �M����H�@�c�c�E�\���I",0x9,0xff8800;
	end;
OnTimer13000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk2";
	end;
OnTimer18000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk3";
	end;
OnTimer20000:
	announce "�L�~�̌��e : �\�E�_���A�L�~�I�@���̐l�̓A�i�^�̂��Ƃ����ċ����Ă������I�@�A�i�^������Ă�����_���c�c�B�J���C�\�E�ȃL�~�c�c�B",0x9,0xff8800;
	end;
OnTimer23000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk3";
	end;
OnTimer26000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk4";
	end;
OnTimer29000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk4";
	end;
OnTimer32000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk5";
	end;
OnTimer34000:
	announce "�L�~�̌��e : �\�E�I�@�����_��I�@�����������܂ꂽ�A�i�^�����������̏u�ԁA�I�ꂳ��͂��܂�̏X���j�c�c�����āA�S�����g�}�b�e���񂶂���^�́B",0x9,0xff8800;
	end;
OnTimer37000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk5";
	end;
OnTimer39000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk6";
	end;
OnTimer42000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk6";
	end;
OnTimer44000:
	announce "�L�~�̌��e : �Y�ꂽ�m�H�@�L�~�B���̐l�K�����Ă���^���g�m�p���A�ēx���Ă݂Ȃ��C�B�������e�A�h�E�H",0x9,0xff8800;
	end;
OnTimer47000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk7";
	end;
OnTimer49000:
	announce "�L�~�̌��e : �˃G�A�L�~�B��̂��ꂳ�񂪃L�~�������Ă��i���A�Ȃ�f�A����ȏX����ɂ����́H�@���l�`�͊炪���Ȃ̂ɁB�N�X�N�X�c�c�B",0x9,0xff8800;
	end;
OnTimer52000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk8";
	end;
OnTimer55000:
	donpcevent getmdnpcname("�Z���[�k�E�L�~#0")+"::OnTalk9";
	end;
OnTimer56000:
	misceffect 247,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer57000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk7";
	end;
OnTimer60000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk8";
	end;
OnTimer61000:
	misceffect 247,getmdnpcname("�Z���[�k�E�L�~#0");
	misceffect 72,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer63000:
	announce "�L�~�̌��e : �{��ȃT�C�B�߂��݂ȃT�C�B�_�����L�~�̖����Ȃ�Ă��Ȃ���_���B�N�X�N�X�N�X�N�X�c�c�B",0x9,0xff8800;
	misceffect 72,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer64000:
	misceffect 72,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer66000:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk9";
	misceffect 72,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer67000:
	hideonnpc getmdnpcname("�L���T�����[�[�^#5");
	misceffect 72,getmdnpcname("�Z���[�k�E�L�~#0");
	misceffect 30,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer68000:
	misceffect 72,getmdnpcname("�Z���[�k�E�L�~#0");
	misceffect 30,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer69000:
	announce "�L�~�̌��e : ���킢�����I�@�J���C�\�E�ȏX���L�~�I",0x9,0xff8800;
	misceffect 30,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer70000:
	misceffect 30,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer72000:
	misceffect 90,getmdnpcname("�Z���[�k�E�L�~#0");
	end;
OnTimer75000:
	stopnpctimer;
	hideonnpc getmdnpcname("�Z���[�k�E�L�~#0");
	hideonnpc getmdnpcname("#bgm02");
	hideoffnpc getmdnpcname("#bgm03");
	hideonnpc getmdnpcname("�Z���[�k�E�L�~#0");
	hideonnpc getmdnpcname("�L���T�����[�[�^#5");
	donpcevent getmdnpcname("xm_d#heal_c")+"::OnStart";
	end;
OnStart2:
	donpcevent getmdnpcname("�L���T�����[�[�^#5")+"::OnTalk10";
	hideonnpc getmdnpcname("�Z���[�k�E�L�~#0");
	hideonnpc getmdnpcname("�L���T�����[�[�^#5");
	donpcevent getmdnpcname("xm_d#heal_c")+"::OnStart";
	end;
}

1@xm_d.gat,1,5,3		script	xm_d#heal_c	844,{
OnStart:
	initnpctimer;
	set 'mob1,callmonster(getmdmapname("1@xm_d.gat"),232,180,"�Z���[�k�E�L�~",2996,getmdnpcname("xm_d#heal_c")+"::OnKilled1");
	set 'mob2,callmonster(getmdmapname("1@xm_d.gat"),226,190,"�L�~�̌��e",2997,getmdnpcname("xm_d#heal_c")+"::OnKilled2");
	end;
OnTimer5000:
	donpcevent getmdnpcname("#bear")+"::OnStart";
	end;
OnCheck:
OnTimer10000:
	if('mob1) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob1);
		if('@x < 212 || '@y > 201 || '@y < 166) {
			stopnpctimer;
			announce "�Z���[�k�E�L�~ : �_���I�@���̏ꏊ���痣�ꂿ��_���b�I",0x9,0xff6666;
			set 'mob1,0;
			killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("xm_d#heal_c")+"::OnKilled1";
			set 'mob2,0;
			killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("xm_d#heal_c")+"::OnKilled2";
			hideoffnpc getmdnpcname("#kimion1");
			hideoffnpc getmdnpcname("�Z���[�k�E�L�~#2");
			end;
		}
	}
	if('mob1 && 'mob2) {
		set 'mob1hp,getmobhp('mob1);
		set 'mob2hp,getmobhp('mob2);
		if('mob1hp - 'mob2hp > 100000) {
			unittalk 'mob1,"�Z���[�k�E�L�~ : �킽���Ƃ��Ȃ��͕\����́B�킽�������Ȃ����񕜂���́c�c�B";
			set '@diff,'mob1hp - 'mob2hp;
		} else if('mob2hp - 'mob1hp > 100000) {
			unittalk 'mob2,"�L�~�̌��e : ���^�V���L�~���񕜂������c�c�B";
			set '@diff,'mob2hp - 'mob1hp;
		} else {
			switch(rand(10)) {
			case 0: unittalk 'mob1,"�Z���[�k�E�L�~ : �킽���ɂƂ��Ă̋��ꏊ�͂��������Ȃ��̂Ɂc�c�Ȃ��A�����Ă����Ă���Ȃ��́c�c�B"; break;
			case 1: unittalk 'mob1,"�Z���[�k�E�L�~ : ���Ȃ�Ă���Ȃ��c�c�K�v�Ȃ��c�c�B�킽���ɂ͕K�v�Ȃ��c�c�B"; break;
			case 2: unittalk 'mob1,"�Z���[�k�E�L�~ : �킽����1�l�ł��Ȃ��Ⴂ���Ȃ��c�c�B�����Ȃ����l�`�́A�N�ɂ��K�v�Ƃ���Ȃ��c�c�B"; break;
			case 3: unittalk 'mob1,"�Z���[�k�E�L�~ : �킽���Ɠ����A�X����ɂȂ낤��c�c�B�c�c���ԂɂȂ낤��B"; break;
			case 4: unittalk 'mob1,"�Z���[�k�E�L�~ : ���񂶂Ⴆ�c�c�B"; break;
			case 5: unittalk 'mob1,"�Z���[�k�E�L�~ : �₾��c�c�|����c�c�����������c�c�B�Ȃ�ŁA�����ɋ��Ă���Ȃ��́c�c�I"; break;
			case 6: unittalk 'mob1,"�Z���[�k�E�L�~ : �����B�����c�c�I�@�������ɂ����āI"; break;
			default: break;
			}
			initnpctimer;
			end;
		}
		set 'healhp,('mob1hp+'mob2hp)/2 + '@diff;
		setmobhp 'mob1,'healhp;
		setmobhp 'mob2,'healhp;
		set 'healhp,getmobhp('mob1);
		for(set '@i,1;'@i<=9;set '@i,'@i+1)
			misceffect 343,getmdnpcname("xm_d#eff_f0"+'@i);
	}
	else
		initnpctimer;
	end;
OnTimer11000:
	announce "�L���T�����[�[�^ : �Z���[�k�E�L�~�ƃL�~�̌��e�̗̑͂������ɂ����" +'healhp+ " �ɂȂ�܂����I�@�C�����Ă��������I",0x9,0xff6666;
	end;
OnTimer15000:
	announce "�L���T�����[�[�^ : �`���җl�I�@���ɂ͕�����̂ł����A�Z���[�k�E�L�~�ƌ��e�̗̑͂ɑ傫����������ƁA���������������ێ����u�̊����������ɂȂ��Ă���悤�ł��B�c�c�Ȃ�ׂ��ψ�ɍU����������������������܂���I",0x9,0xff6666;
	end;
OnTimer21000:
	initnpctimer;
	donpcevent getmdnpcname("xm_d#heal_c")+"::OnCheck";
	end;
OnKilled1:
	set 'mob1,0;
	if('mob2 == 0) {
		donpcevent getmdnpcname("#finalbs_e")+"::OnStart";
	}
	end;
OnKilled2:
	set 'mob2,0;
	if('mob1 == 0) {
		donpcevent getmdnpcname("#finalbs_e")+"::OnStart";
	}
	end;
}

1@xm_d.gat,1,5,3		script	#finalbs_e	844,{
OnStart:
	announce "�Z���[�k�E�L�~ : �킽����|���Ă����ʂ���c�c�B�܂��킽���͂��̍H��ɂ��ǂ��Ă���񂾂���c�c�B",0x9,0xff6666,0x190,15;
	set '@user,getmapusers("this");
	hideoffnpc getmdnpcname("#fac6wp");
	hideoffnpc getmdnpcname("#jeton2");
	hideoffnpc getmdnpcname("�L���T�����[�[�^#6");
	hideoffnpc getmdnpcname("����ꂽ�v���[���g#00");
	killmonster getmdmapname("1@xm_d.gat"),getmdnpcname("#bear")+"::OnKilled";
	donpcevent getmdnpcname("����ꂽ�v���[���g#00")+"::OnStart";
	setarray '@box,0,7,10,4,9,5,1,12,2,8,6,11,3;
	for(set '@i,1;'@i<='@user; set '@i,'@i+1) {
		hideoffnpc getmdnpcname("����ꂽ�v���[���g#"+'@box['@i]);
	}
	sleep 6000;
	announce "�L���T�����[�[�^ : !?�@�L�~��ނ�����ł���!?�@�����c�c�B�Ƃ肠�����A���̕����̓쐼�ɂ���ʘH����A��������ꏊ�ւ��Ă��������I",0x9,0xffff00,0x190,12;
	end;
}

1@xm_d.gat,205,159,0	warp	#fac6wp	2,2,1@xm_d.gat,205,147

1@xm_d.gat,218,145,0	script	#jeton2	139,5,5,{
	initnpctimer;
	hideonnpc getmdnpcname("#jeton2");
	end;
OnTimer1000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk1";
	end;
OnTimer4000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk2";
	end;
OnTimer6000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk3";
	end;
OnTimer9000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk4";
	end;
OnTimer12000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk5";
	end;
OnTimer16000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk6";
	end;
OnTimer22000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk7";
	end;
OnTimer27000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk8";
	end;
OnTimer32000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk9";
	end;
OnTimer37000:
	donpcevent getmdnpcname("�L���T�����[�[�^#6")+"::OnTalk10";
	end;
OnTimer40000:
	stopnpctimer;
	hideonnpc getmdnpcname("�L���T�����[�[�^#6");
	hideoffnpc getmdnpcname("����#exwp1");
	announce "�L���T�����[�[�^ : �������J�����܂����B������u���Ă����܂����̂ŁA��������O�ɏo�ĉ������ˁB",0x9,0xffff00;
	end;
}

1@xm_d.gat,218,150,5	script	����#exwp1	10007,{
	mes "�]��������H��̊O�ɏo�܂����H�]";
	next;
	if(select("��������������Ă݂�","�O�ɏo��") == 1) {
		mes "�]�����̍쓮�𒆎~���܂��]";
		close;
	}
	if(checkitemblank() == 0) {
		mes "�]�A�C�e���̎�ސ���������";
		mes "�@��V�������Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���";
		mes "�@�O�ɏo�悤�]";
		close;
	}
	if(checkquest(96405) & 0x4) {
		delquest 96405;
		getitem 7642,30;
	}
	if(HORROR_1QUE < 13)
		set HORROR_1QUE,HORROR_1QUE + 1;
	warp "xmas.gat",233,300;
	end;
}

1@xm_d.gat,218,145,5	script	�L���T�����[�[�^#6	10032,{
	end;
OnTalk1:
	unittalk "�L���T�����[�[�^ : �c�c�����܂ł���Α��v�Ȃ͂��ł��B";
	end;
OnTalk2:
	unittalk "�L���T�����[�[�^ : ���ǁA�肪����������炸�A�댯�Ȗڂɂ��킹�Ă����܂���c�c�B";
	end;
OnTalk3:
	unittalk "�L���T�����[�[�^ : �ł��A�Ō�ɏ����͎��̐l�`�E�l���K���Ƃ��Ă̖ڂ����ɂ������݂����ŁA�ǂ������ł��B";
	end;
OnTalk4:
	unittalk "�L���T�����[�[�^ : ����ɂ��Ă��A���e�̐��Ƃ������̂̐��͉̂���������ł����ˁH�@�ǂ����ăL�~�ɂ���ȍ������Ƃ��c�c�B";
	end;
OnTalk5:
	unittalk "�L���T�����[�[�^ : �����Ǝ��̊�̎􂢂����̐��̕s���̐����Ɛl�ł͂Ȃ����Ǝv���Ă��܂��B�m�؂͂Ȃ��̂ł����c�c�B";
	end;
OnTalk6:
	unittalk "�L���T�����[�[�^ : ���ǁA���ꂳ��̋C�����͂�����ƃL�~�ɓ͂��Ă��Ȃ������̂ł��ˁc�c�B�c�O�ł��c�c�B";
	end;
OnTalk7:
	unittalk "�L���T�����[�[�^ : ���ɂ���A�L�~�̍����܂��߂��ė��Ă������悤�ɁA�����͂�������Ǘ����Ă����������ǂ������ł��B";
	end;
OnTalk8:
	unittalk "�L���T�����[�[�^ : �ł����͂܂��A������߂Ă��܂���B�^�����܂��͂����肵�Ă��Ȃ����B������܂��ǂ���΁A�͂�݂��Ă��������B";
	end;
OnTalk9:
	unittalk "�L���T�����[�[�^ : �O�ɏo��o���͊J���Ă����܂��B������ɍs���̂ł��Ă��Ă��������B";
	end;
OnTalk10:
	unittalk "�L���T�����[�[�^ : �c�c�����L�~�ɂ��A���ꂳ���݂�Ȃ̋C�����������Ɠ͂���ꂽ�炢���ȁB";
	end;
}

1@xm_d.gat,148,218,5	script	�E�o��#001	10007,{
	mes "�]�ǂ����ً}�p�̒E�o����";
	mes "�@�����̔��q�ō쓮�����悤�ł��B";
	mes "�@���̒E�o������";
	mes "�@�X�ɖ߂��悤�ł���";
	mes "�@�܂��H��ɗp��������Ȃ�";
	mes "�@�o�Ȃ������ǂ��ł��傤�]";
	next;
	if(select("�܂��o�Ȃ�","�O�ɏo��") == 1) {
		mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
		close;
	}
	warp "xmas.gat",233,300;
	end;
}

1@xm_d.gat,1,1,0		script	xm_d#Barricade00	139,{
OnStart:
	areasetcell getmdmapname("1@xm_d.gat"),218,154,220,165,1;
	areasetcell getmdmapname("1@xm_d.gat"),218,202,220,213,1;
	end;
}
1@xm_d.gat,218,154,1	script	#Barricade1	1905,{}
1@xm_d.gat,218,155,1	script	#Barricade2	1905,{}
1@xm_d.gat,218,156,1	script	#Barricade3	1905,{}
1@xm_d.gat,218,157,1	script	#Barricade4	1905,{}
1@xm_d.gat,218,158,1	script	#Barricade5	1905,{}
1@xm_d.gat,218,159,1	script	#Barricade6	1905,{}
1@xm_d.gat,218,160,1	script	#Barricade7	1905,{}
1@xm_d.gat,218,161,1	script	#Barricade8	1905,{}
1@xm_d.gat,218,162,1	script	#Barricade9	1905,{}
1@xm_d.gat,218,163,1	script	#Barricade10	1905,{}
1@xm_d.gat,218,164,1	script	#Barricade11	1905,{}
1@xm_d.gat,218,165,1	script	#Barricade12	1905,{}
1@xm_d.gat,218,202,1	script	#Barricade13	1905,{}
1@xm_d.gat,218,203,1	script	#Barricade14	1905,{}
1@xm_d.gat,218,204,1	script	#Barricade15	1905,{}
1@xm_d.gat,218,205,1	script	#Barricade16	1905,{}
1@xm_d.gat,218,206,1	script	#Barricade17	1905,{}
1@xm_d.gat,218,207,1	script	#Barricade18	1905,{}
1@xm_d.gat,218,208,1	script	#Barricade19	1905,{}
1@xm_d.gat,218,209,1	script	#Barricade20	1905,{}
1@xm_d.gat,218,210,1	script	#Barricade21	1905,{}
1@xm_d.gat,218,211,1	script	#Barricade22	1905,{}
1@xm_d.gat,218,212,1	script	#Barricade23	1905,{}
1@xm_d.gat,218,213,1	script	#Barricade24	1905,{}

1@xm_d.gat,10,24,0	script	alert#61	139,10,10,{
OnTouch:
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 1246) {
		initnpctimer;
		musiceffect "125";
		misceffect 124;
		hideonnpc;
		set '@dummy,getmapxy('@map$,'@x,'@y,1,getmdnpcname(strnpcinfo(0)));
		areamonster '@map$,'@x-5,'@y-5,'@x+5,'@y+5,"��������H��x����",2990,6,getmdnpcname(strnpcinfo(0))+"::OnKilled";
	}
	end;
OnTimer1000:
	switch(rand(10)) {
	default:announce "�H��ē����� : �x�����̏o�����K�v�ł��B�������ɊO���̎҂𐧈����ĉ������B",0x9,0x00ffff; break;
	case 1:announce "�H��ē����� : �N���҂��l�ԂłȂ����Ƃ��F��܂��B����������l�Ԃ������ꍇ�͂������ɔr�����ĉ������B",0x9,0x00ffff; break;
	case 2:announce "�x�������� : ��ƈ��ł͂Ȃ��O���̎҂͂������ɍH��̊O�ɏo�ĉ������B",0x9,0xffff00; break;
	case 3:announce "�H��ē����� : ���܂�������Ȃ����m�点�ł��B�O���̐����̂����m����܂����B�������Ɍx�����͏o�����ĉ������B",0x9,0x00ff88; break;
	case 4:announce "�x�� : �H�꒷�l�����@�ɎQ��܂��B�O���̎҂𑁂���������悤�ɂ��܂��傤�B",0x9,0xff4444; break;
	case 5:announce "�H��ē����� : �N���҂̑��݂����ʂ���܂����B����R�[�hAX0829�B�`�ԁA�l�ԁA�r�������肢���܂��B",0x9,0x00ffff; break;
	case 6:announce "�x�������� : �N���҂𔭌������I�@�l�Ԃ��Ǝv����I�@�����ɔr������I",0x9,0xffff00; break;
	case 7:announce "�H��ē����� : �O���̎҂͍�����������グ�ē��~���ĉ������B�]��Ȃ��ꍇ�͔��C���܂��B",0x9,0x00ffff; break;
	}
	end;
OnTimer4000:
	announce "�L���T�����[�[�^ : ���̊��D�ł͂΂�Ă��܂��܂��I�@������ƕ��ɒ��ւ��Ă��������I",0x9,0xff6666;
	end;
OnTimer60000:
	hideoffnpc;
	stopnpctimer;
	killmonster getmdmapname("1@xm_d.gat"),getmdnpcname(strnpcinfo(0))+"::OnKilled";
	end;
OnKilled:
	end;
}
1@xm_d.gat,30,24,0	duplicate(alert#61)	alert#62	139,10,10
1@xm_d.gat,50,24,0	duplicate(alert#61)	alert#63	139,10,10
1@xm_d.gat,70,24,0	duplicate(alert#61)	alert#64	139,10,10
1@xm_d.gat,90,24,0	duplicate(alert#61)	alert#65	139,10,10
1@xm_d.gat,10,44,0	duplicate(alert#61)	alert#66	139,10,10
1@xm_d.gat,30,44,0	duplicate(alert#61)	alert#67	139,10,10
1@xm_d.gat,50,44,0	duplicate(alert#61)	alert#68	139,10,10
1@xm_d.gat,70,44,0	duplicate(alert#61)	alert#69	139,10,10
1@xm_d.gat,90,44,0	duplicate(alert#61)	alert#70	139,10,10
1@xm_d.gat,110,44,0	duplicate(alert#61)	alert#71	139,10,10
1@xm_d.gat,10,64,0	duplicate(alert#61)	alert#72	139,10,10
1@xm_d.gat,30,64,0	duplicate(alert#61)	alert#73	139,10,10
1@xm_d.gat,50,64,0	duplicate(alert#61)	alert#74	139,10,10
1@xm_d.gat,70,64,0	duplicate(alert#61)	alert#75	139,10,10
1@xm_d.gat,90,64,0	duplicate(alert#61)	alert#76	139,10,10
1@xm_d.gat,110,64,0	duplicate(alert#61)	alert#77	139,10,10
1@xm_d.gat,10,84,0	duplicate(alert#61)	alert#78	139,10,10
1@xm_d.gat,30,84,0	duplicate(alert#61)	alert#79	139,10,10
1@xm_d.gat,50,84,0	duplicate(alert#61)	alert#80	139,10,10
1@xm_d.gat,70,84,0	duplicate(alert#61)	alert#81	139,10,10
1@xm_d.gat,90,84,0	duplicate(alert#61)	alert#82	139,10,10
1@xm_d.gat,110,84,0	duplicate(alert#61)	alert#83	139,10,10
1@xm_d.gat,10,104,0	duplicate(alert#61)	alert#84	139,10,10
1@xm_d.gat,30,104,0	duplicate(alert#61)	alert#85	139,10,10
1@xm_d.gat,50,104,0	duplicate(alert#61)	alert#86	139,10,10
1@xm_d.gat,70,104,0	duplicate(alert#61)	alert#87	139,10,10
1@xm_d.gat,90,104,0	duplicate(alert#61)	alert#88	139,10,10
1@xm_d.gat,110,104,0	duplicate(alert#61)	alert#89	139,10,10
1@xm_d.gat,155,20,0		duplicate(alert#61)	alert#90	139,10,10
1@xm_d.gat,180,50,0		duplicate(alert#61)	alert#91	139,10,10
1@xm_d.gat,205,80,0		duplicate(alert#61)	alert#92	139,10,10
1@xm_d.gat,230,110,0	duplicate(alert#61)	alert#93	139,10,10
1@xm_d.gat,180,20,0		duplicate(alert#61)	alert#94	139,10,10
1@xm_d.gat,180,50,0		duplicate(alert#61)	alert#95	139,10,10
1@xm_d.gat,180,80,0		duplicate(alert#61)	alert#96	139,10,10
1@xm_d.gat,205,20,0		duplicate(alert#61)	alert#97	139,10,10
1@xm_d.gat,205,50,0		duplicate(alert#61)	alert#98	139,10,10
1@xm_d.gat,205,80,0		duplicate(alert#61)	alert#99	139,10,10
1@xm_d.gat,205,110,0	duplicate(alert#61)	alert#100	139,10,10
1@xm_d.gat,230,20,0		duplicate(alert#61)	alert#101	139,10,10
1@xm_d.gat,230,50,0		duplicate(alert#61)	alert#102	139,10,10
1@xm_d.gat,230,80,0		duplicate(alert#61)	alert#103	139,10,10
1@xm_d.gat,230,110,0	duplicate(alert#61)	alert#104	139,10,10

1@xm_d.gat,217,140,3	script	����ꂽ�v���[���g#1	10005,{
	// �_�C�������h�P�J���b�g�A�_�C�������h�Q�J���b�g�A�_�C�������h�R�J���b�g�A����A���A�����̉�A���h��ꂽ�Ö؂̎}
	setarray '@gain,730,730,730,730,731,731,732,732,7228,7229,7230,12103;
	setarray '@rate,800,500,300,300,500,200,300,100, 250, 250, 250,   10;
	set '@dummy,getmapxy('@map$,'@x,'@y,1,getmdnpcname(strnpcinfo(0)));
	misceffect 10;
	hideonnpc;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@xs,'@x+rand(5)-2;
		set '@ys,'@y+rand(5)-2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@xm_d.gat"),'@xs,'@ys,'@gain['@i],1,0;
	}
	end;
}
1@xm_d.gat,220,143,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#2	10005
1@xm_d.gat,225,144,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#3	10005
1@xm_d.gat,227,139,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#4	10005
1@xm_d.gat,226,135,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#5	10005
1@xm_d.gat,223,132,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#6	10005
1@xm_d.gat,217,128,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#7	10005
1@xm_d.gat,211,132,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#8	10005
1@xm_d.gat,208,135,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#9	10005
1@xm_d.gat,207,139,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#10	10005
1@xm_d.gat,209,144,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#11	10005
1@xm_d.gat,214,143,3	duplicate(����ꂽ�v���[���g#1)	����ꂽ�v���[���g#12	10005

1@xm_d.gat,217,135,3	script	����ꂽ�v���[���g#00	10005,{
	// ���h��ꂽ�R�C���A�����ꂽ�S�̔�
	// ���h��ꂽ�Ö؂̎}�A�Â��m�P�A���X�����o���A�V���h�E�E�H�[�J�[[1]�A�Ԃ������^���A�������S�A�D�����S
	setarray '@gain,12103,13442,18848,2486,2976,2977,2978;
	setarray '@rate,   10,   15,   25,  25,  10,   5,   5;
	stopnpctimer;
	misceffect 10;
	hideonnpc;
	if(rand(100) < 50)
		set '@gain2,7642;
	else
		set '@gain2,22534;
	dropitem getmdmapname("1@xm_d.gat"),217+rand(5)-2,135+rand(5)-2,'@gain2,1,0;
	for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
		set '@x,217+rand(5)-2;
		set '@y,135+rand(5)-2;
		if(rand(1000) < '@rate['@i])
			dropitem getmdmapname("1@xm_d.gat"),'@x,'@y,'@gain['@i],1,0;
	}
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	misceffect 100;
	end;
}
