//= Auriga Script ==============================================================
// Ragnarok Online Hero in the Air Script	by refis
//==============================================================================

//============================================================
// ��p��������NPC
//------------------------------------------------------------
dali02.gat,139,87,3	script	���y�ٖD�t#refine	70,{
	mes "[���y�ٖD�t]";
	mes "���͍ٖD�t�����Ă��܂��B";
	mes "���ɔ�s�D�œ���ł��鑕����";
	mes "�n���Ē������";
	mes "�������m��g�ݍ��킹��";
	mes "���B�����邱�Ƃ��ł��܂��B";
	next;
	mes "[���y�ٖD�t]";
	mes "�����̐��B���s���܂����H";
	next;
	switch(select("��s�D�V���[�Y�𐸘B","�y�����b�N�V���[�Y�𐸘B","�����𕷂�","��߂�")) {
	case 1:
		setarray '@target,15159,20792,22087;
		break;
	case 2:
		setarray '@target,15158,20791,22086;
		break;
	case 3:
		mes "[���y�ٖD�t]";
		mes "�������A���_���W�����u��s�D�P���v�B";
		mes "�����œ���ł���";
		mes "^0000ff��s�D�V���[�Y^000000����";
		mes "^0000ff��s�D�X�[�c^000000�A^0000ff��s�D�}���g^000000�A";
		mes "^0000ff��s�D�u�[�c^000000�B";
		next;
		mes "[���y�ٖD�t]";
		mes "�����āA^ff0000�y�����b�N�V���[�Y^000000�ł���";
		mes "^ff0000�y�����b�N�̃X�[�c^000000�A";
		mes "^ff0000�y�����b�N�̃}���g^000000�A";
		mes "^ff0000�y�����b�N�̃u�[�c^000000�B";
		next;
		mes "[���y�ٖD�t]";
		mes "���̑����͒ʏ�̐��B�͂ł��܂��񂪁A";
		mes "���Ȃ�ΐ��B�ł���̂ł��I";
		mes "�����A���B�������ꍇ��";
		mes "����A�����Ă��Ă��������B";
		next;
		mes "[���y�ٖD�t]";
		mes "�����͊ȒP�I";
		mes "�܂��A���B�������Ώۑ�����";
		mes "�������Ă��������B";
		next;
		mes "[���y�ٖD�t]";
		mes "�Ώۑ�������s�D�V���[�Y�ł���΁A";
		mes "�f�ނƂ���";
		mes "��s�D�V���[�Y�̂ǂꂩ�̑���1��";
		mes "�������Ă��Ă��������B";
		mes "���̑���1������āA";
		mes "���B���č����グ�܂��傤�B";
		next;
		mes "[���y�ٖD�t]";
		mes "���Ȃ킿�A����";
		mes "��s�D�X�[�c�𐸘B�������ꍇ�́A";
		mes "��s�D�X�[�c�A��s�D�}���g�A";
		mes "��s�D�u�[�c�̂����ꂩ1�����";
		mes "���B�ł���Ƃ������Ƃł��B";
		next;
		mes "[���y�ٖD�t]";
		mes "���l�ɁA";
		mes "�Ώۑ������y�����b�N�V���[�Y�ł���΁A";
		mes "�f�ނƂ���";
		mes "�y�����b�N�V���[�Y�̂����ꂩ��";
		mes "1�����Ă��Ă��������B";
		next;
		mes "[���y�ٖD�t]";
		mes "���ӂ��Ē����������Ƃ́A";
		mes "�f�ނɂ���������^ff0000���B�l�͈����p���ꂸ";
		mes "�f�ނɑ}�����Ă����J�[�h�����ł���^000000";
		mes "�Ƃ������ł��B";
		next;
		mes "[���y�ٖD�t]";
		mes "���Ȃ݂Ɏ��A�z���O��������ƈ���āA";
		mes "^0000ff���B1���玸�s����";
		mes "�j�󂵂Ă��܂��������鏗^000000�Ȃ̂�";
		mes "�����̂Ƃ���͂��������������ˁB";
		next;
		mes "[���y�ٖD�t]";
		mes "����ł͂��ł�";
		mes "���B���ɂ��Ă��������I";
		close;
	case 4:
		mes "[���y�ٖD�t]";
		mes "�����ł����B";
		mes "�܂��A�����p�̎���";
		mes "���ł����Ă��������B";
		close;
	}
	mes "[���y�ٖD�t]";
	mes "�ǂ�𐸘B���܂����H";
	next;
	switch(select(
		(getequipid(2)!=0? "^nItemID^" +getequipid(2): "��-[�������Ă��Ȃ�]"),
		(getequipid(5)!=0? "^nItemID^" +getequipid(5): "���ɂ����镨-[�������Ă��Ȃ�]"),
		(getequipid(6)!=0? "^nItemID^" +getequipid(6): "�C-[�������Ă��Ȃ�]")
	)) {
	case 1: set '@itemid,getequipid(2); set '@menu,2; break;
	case 2: set '@itemid,getequipid(5); set '@menu,5; break;
	case 3: set '@itemid,getequipid(6); set '@menu,6; break;
	}
	if('@itemid == 0) {
		mes "[���y�ٖD�t]";
		mes "�����������Ă��܂����H";
		mes "�K���A���B������������";
		mes "����������ԂŘb�������Ă��������B";
		close;
	}
	set '@len,getarraysize('@target);
	for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
		if('@itemid == '@target['@i])
			break;
	}
	if('@i == '@len) {
		mes "[���y�ٖD�t]";
		mes "�Ώۑ����𑕔����Ă��܂���B";
		mes "�K����s�D�œ��肵��������";
		mes "�������Ă��������ˁB";
		close;
	}
	set '@refine,getequiprefinerycnt('@menu);
	if('@refine>=10) {
		mes "[���y�ٖD�t]";
		mes "����ȏ�͐����ł��܂���ˁB";
		close;
	}
	set '@card1,getequipcardid('@menu,0);
	mes "[���y�ٖD�t]";
	mes "�f�ނɂ͂ǂ���g���܂����H";
	next;
	set '@rec,select(getitemname('@target[0]),getitemname('@target[1]),getitemname('@target[2]));
	set '@req,('@itemid=='@target['@rec-1])? 2: 1;		// �Ώۑ����Ƒf�ނ������ꍇ��2�����肪�K�v
	if(countitem('@target['@rec-1]) < '@req) {
		mes "[���y�ٖD�t]";
		mes "�f�ނɂȂ鑕����";
		mes "�����Ă��Ȃ��悤�ł��B";
		mes "���莝���̑����i��";
		mes "�m�F���Ă���A";
		mes "�܂����Ă��������B";
		close;
	}
	mes "[���y�ٖD�t]";
	mes "����ł͐��B���J�n���܂���";
	mes "�f�ނɂȂ�A�C�e����";
	mes "�����������Ă���ꍇ�A";
	mes "�ǂꂪ�g�p����邩�킩��܂���B";
	next;
	mes "[���y�ٖD�t]";
	mes "�厖�ȑ������g�p����Ȃ��悤��";
	mes "�g�p�������Ȃ�������";
	mes "�K���q�ɂɗa���Ă����Ă��������B";
	next;
	mes "[���y�ٖD�t]";
	mes "����ł͐��B�����Ă�";
	mes "��낵���ł����H";
	next;
	if(select("���B����","��߂�") == 2) {
		mes "[���y�ٖD�t]";
		mes "�����ł����B";
		mes "�܂��A�����p�̎���";
		mes "���ł����Ă��������B";
		close;
	}
	mes "[���y�ٖD�t]";
	mes "�����[�I";
	mes "���������[�I";
	next;
	delequip '@menu;
	delitem '@target['@rec-1],1;
	setarray '@rate,9000,7000,5000,3000,1000,500,300,100,50,10;
	if(rand(10000) < '@rate['@refine]) {
		misceffect 154,"";
		mes "[���y�ٖD�t]";
		mes "�悵�A�����I";
		mes "�ǂ������ł��܂����I";
		getitem2 '@itemid,1,1,'@refine+1,0,'@card1,0,0,0;
		close;
	}
	else {
		misceffect 155,"";
		mes "[���y�ٖD�t]";
		mes "�N�z�z�b�c�c";
		mes "���s���Ă��܂��܂����c�c�B";
		mes "�\���󂠂�܂���c�c�B";
		close;
	}
OnInit:
	waitingroom "��s�D�����y���B�z",0;
	end;
}

//============================================================
// ��p��������NPC
//------------------------------------------------------------
dali02.gat,133,87,3	script	��s�D���D��#sell	755,{
	mes "[��s�D���D��]";
	mes "�����ł͔�s�D������";
	mes "�����������s���Ă��܂��B";
	mes "���A�D���Ȃ�ł��I��s�D�����I";
	next;
	switch(select("���悵�Ăق���","�������Ăق���","�����𕷂�")) {
	case 1:
		break;
	case 2:
		mes "[��s�D���D��]";
		mes "��s�D�����̌����ł��ˁB";
		mes "�������s���ꍇ��";
		mes "�K������������������";
		mes "����������Ԃ�";
		mes "�b�������ĉ������ˁI";
		next;
		mes "[��s�D���D��]";
		mes "���āA���ƌ������܂��傤���H";
		next;
		set '@menu,select("�y�����b�N�̖X�q[1]","�G�N�\�_�X�W���[�J�[XIII[1]","��߂�");
		switch('@menu) {
		case 1:
			mes "[��s�D���D��]";
			mes "�ӂށB";
			mes "�y�����b�N�̖X�q�ł��ˁB";
			next;
			mes "[��s�D���D��]";
			mes "������̃A�C�e������";
			mes "^ff0000[�ߑ�]�y�����b�N�̖X�q^000000��";
			mes "�����ł͂ǂ��ł��傤���H";
			set '@gain,19144;
			break;
		case 2:
			mes "[��s�D���D��]";
			mes "�ӂށB";
			mes "�G�N�\�_�X�W���[�J�[XIII�ł��ˁB";
			next;
			mes "[��s�D���D��]";
			mes "������̃A�C�e������";
			mes "^ff0000+7�ȏ��";
			mes "�y�����b�N�n����^000000��";
			mes "�����ł͂ǂ��ł��傤���H";
			set '@gain,28214;
			break;
		case 3:
			mes "[��s�D���D��]";
			mes "�����ł����B";
			mes "�C���ς������";
			mes "�܂����ł����Ă��������B";
			close;
		}
		next;
		mes "[��s�D���D��]";
		mes "������̒��ӂł���";
		mes "������̗v���ȏ�̃A�C�e����";
		mes "�����Ώۂɂ���Ă�������e��";
		mes "�ω��͂���܂���̂�";
		mes "�����ӂ��������B";
		next;
		mes "[��s�D���D��]";
		mes "�ł́A�ǂ�ƌ������܂��傤�H";
		next;
		switch(select(
			(getequipid(2)!=0? "^nItemID^" +getequipid(2): "��-[�������Ă��Ȃ�]"),
			(getequipid(5)!=0? "^nItemID^" +getequipid(5): "���ɂ����镨-[�������Ă��Ȃ�]"),
			(getequipid(6)!=0? "^nItemID^" +getequipid(6): "�C-[�������Ă��Ȃ�]"),
			(getequipid(12)!=0? "^nItemID^" +getequipid(12): "�ߑ��]��][�������Ă��Ȃ�]")
		)) {
		case 1: if(getequipid(2) == 15158 && '@menu == 2) set '@i,2; break;
		case 2: if(getequipid(5) == 20791 && '@menu == 2) set '@i,5; break;
		case 3: if(getequipid(6) == 22086 && '@menu == 2) set '@i,6; break;
		case 4: if(getequipid(12) == 19914 && '@menu == 1) set '@i,12; break;
		}
		if('@i == 0) {
			mes "[��s�D���D��]";
			mes "�Ώۑ����𑕔����Ă��܂���B";
			mes "�K����s�D�œ��肵��������";
			mes "�������Ă��������ˁB";
			close;
		}
		// �ȉ�������
		if('@menu == 2 && getequiprefinerycnt('@i) < 7) {
			mes "[��s�D���D��]";
			mes "�Ώۑ����̐����l������܂���ˁB";
			mes "^ff0000+7�ȏ��";
			mes "�y�����b�N�n����^000000��";
			mes "�������Ă��������B";
			close;
		}
		mes "[��s�D���D��]";
		mes "�ł́A";
		mes "^nItemID^" +getequipid('@i)+ "��";
		mes "^nItemID^" +'@gain+ "��";
		mes "�������܂��B";
		mes "��낵���ł����H";
		next;
		if(select("������","�͂�") == 1) {
			mes "[��s�D���D��]";
			mes "�����ł����B";
			mes "�c�O�ł��B";
			close;
		}
		delequip '@i;
		getitem '@gain,1;
		mes "[��s�D���D��]";
		mes "���肪�Ƃ��������܂��I";
		mes "��؂Ɏg���Ă��������ˁI";
		close;
	case 3:
		mes "[��s�D���D��]";
		mes "���͔�s�D�V���[�Y��";
		mes "�y�����b�N�V���[�Y��";
		mes "�����������������肵�Ă��܂��B";
		mes "���B�l�������ق�";
		mes "�������肳���Ă��������܂��B";
		next;
		mes "[��s�D���D��]";
		mes "�Ȃ��A������鑕����";
		mes "�J�[�h���}�����Ă����ꍇ�A";
		mes "^ff0000�J�[�h�͂��Ԃ��ł��܂���B^000000";
		mes "�܂��A�ǂ̂悤�ȃJ�[�h�ł����Ă�";
		mes "^ff0000����z�ɕύX�͂���܂���^000000�̂�";
		mes "�����ӂ��������B";
		next;
		mes "[��s�D���D��]";
		mes "���ꂪ����\�ł���I";
		next;
		mes "�]����\�]";
		mes "�@^0000ff��s�D�V���[�Y^000000�̏ꍇ�I";
		mes "�@�i��s�D�X�[�c�A��s�D�}���g";
		mes "�@��s�D�u�[�c�̂����ꂩ�j";
		mes "�@";
		mes "�@�����B�@�@10,000zeny";
		mes "�@���B�l+1�@30,000zeny";
		mes "�@���B�l+2�@90,000zeny";
		mes "�@���B�l+3�@270,000zeny";
		mes "�@���B�l+4�@810,000zeny";
		mes "�@���B�l+5�@2,430,000zeny";
		mes "�@���B�l+6�@7,290,000zeny";
		mes "�@���B�l+7�@21,870,000zeny";
		mes "�@���B�l+8�@65,610,000zeny";
		mes "�@���B�l+9�@196,830,000zeny";
		mes "�@���B�l+10�@590,490,000zeny";
		next;
		mes "�]����\�]";
		mes "�@^ff0000�y�����b�N�V���[�Y^000000�̏ꍇ�I";
		mes "�@�i�y�����b�N�X�[�c�A";
		mes "�@�y�����b�N�}���g�A";
		mes "�@�y�����b�N�u�[�c�̂����ꂩ�j";
		mes "�@";
		mes "�@�����B�@�@20,000zeny";
		mes "�@���B�l+1�@60,000zeny";
		mes "�@���B�l+2�@180,000zeny";
		mes "�@���B�l+3�@540,000zeny";
		mes "�@���B�l+4�@1,620,000zeny";
		mes "�@���B�l+5�@4,860,000zeny";
		mes "�@���B�l+6�@14,580,000zeny";
		mes "�@���B�l+7�@43,740,000zeny";
		mes "�@���B�l+8�@131,220,000zeny";
		mes "�@���B�l+9�@393,660,000zeny";
		mes "�@���B�l+10�@1,180,980,000zeny";
		next;
		mes "[��s�D���D��]";
		mes "���ƁA�����ΏۃA�C�e����";
		mes "���̎��X�őΏۂƂȂ�";
		mes "�A�C�e�����قȂ�܂��̂�";
		mes "�����ӂ��������B";
		close;
	}
	mes "[��s�D���D��]";
	mes "��s�D�����̔���ł��ˁB";
	mes "��s�D�����͐��B�l�ɂ����";
	mes "����z�������܂���B";
	next;
	mes "[��s�D���D��]";
	mes "��������ė~����������";
	mes "�K������������Ԃ�";
	mes "�b�������ĉ������ˁI";
	next;
	mes "[��s�D���D��]";
	mes "���āA�ǂ�𔃎�܂��傤���H";
	next;
	switch(select("��s�D����","�y�����b�N����","��߂�")) {
	case 1:
		setarray '@target,15159,20792,22087;
		set '@zeny,10000;
		break;
	case 2:
		setarray '@target,15158,20791,22086;
		set '@zeny,20000;
		break;
	case 3:
		mes "[��s�D���D��]";
		mes "�����ł����B";
		mes "�C���ς������";
		mes "�܂����ł����Ă��������B";
		close;
	}
	mes "[��s�D���D��]";
	mes "�ǂ�𔃎�܂��傤�H";
	next;
	switch(select(
		(getequipid(2)!=0? "^nItemID^" +getequipid(2): "��-[�������Ă��Ȃ�]"),
		(getequipid(5)!=0? "^nItemID^" +getequipid(5): "���ɂ����镨-[�������Ă��Ȃ�]"),
		(getequipid(6)!=0? "^nItemID^" +getequipid(6): "�C-[�������Ă��Ȃ�]")
	)) {
	case 1: set '@itemid,getequipid(2); set '@menu,2; break;
	case 2: set '@itemid,getequipid(5); set '@menu,5; break;
	case 3: set '@itemid,getequipid(6); set '@menu,6; break;
	}
	if('@itemid == 0) {
		mes "[��s�D���D��]";
		mes "�����������Ă��܂����H";
		mes "�K���A��������ė~����������";
		mes "����������ԂŘb�������Ă��������B";
		close;
	}
	set '@len,getarraysize('@target);
	for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
		if('@itemid == '@target['@i])
			break;
	}
	if('@i == '@len) {
		mes "[��s�D���D��]";
		mes "�Ώۑ����𑕔����Ă��܂���B";
		mes "�K����s�D�œ��肵��������";
		mes "�������Ă��������ˁB";
		close;
	}
	set '@refine,getequiprefinerycnt('@menu);
	set '@price,'@zeny * 3 ** '@refine;
	mes "[��s�D���D��]";
	mes "������̃A�C�e����";
	mes "^0000ff" +'@price+ "^000000zeny��";
	mes "����܂��B";
	mes "��낵���ł����H";
	next;
	if(select("������","�͂�") == 1) {
		mes "[��s�D���D��]";
		mes "�����ł����B";
		mes "�c�O�ł��B";
		close;
	}
	if(2147483647 - Zeny < '@price) {
		mes "[��s�D���D��]";
		mes "���������������܂��ˁB";
		mes "�������炵�Ă��痈�Ă��������B";
		close;
	}
	mes "[��s�D���D��]";
	mes "����ł͔���܂��B";
	mes "�͂��A�ǂ����B";
	delequip '@menu;
	set Zeny,Zeny+'@price;
	close;
OnInit:
	waitingroom "��s�D�����y�����E����z",0;
	end;
}

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
dali02.gat,136,79,3	script	�T���ƃ��I��#air1	945,{
	mes "[�T���ƃ��I��]";
	mes "��������������";
	mes "���̏ꏊ�𒲂ׂĂ݂����ʁA";
	mes "�����ɂ͂����s�D�̋L����";
	mes "���܂�Ă���悤���B";
	next;
	mes "[�T���ƃ��I��]";
	mes "�c�c���ꂪ�S�����B";
	mes "���ɂ�����ȏ�̎���";
	mes "�킩��Ȃ��񂾁c�c�B";
	next;
	mes "[�T���ƃ��I��]";
	mes "���ʂ��Ǝv�����A";
	mes "���ׂ����Ȃ炻���̈ړ��@��";
	mes "���ׂĂ݂���ǂ����H";
	mes "�������ׂ������ǉ���";
	mes "������Ȃ������c�c�B";
	mes "���������肾�B";
	close;
}

dali02.gat,142,81,3	script	�����ړ��@#sara	10007,{
	if(BaseLevel < 70) {
		mes "^ff0000�]BaseLv70�ȏ�̕��̂�";
		mes "�@����\�ȃ_���W�����ł��]^000000";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "^ff0000�]�����̋��Ԃɓ��ꂷ�邽�߂ɂ�";
		mes "�@�p�[�e�B�[���������Ă��������]^000000";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "^ff0000�]���̃������A���_���W������";
		mes "�@1�l�p�̃_���W�����ł��B";
		mes "�@�p�[�e�B�[���[�_�[�̂�";
		mes "�@���ꂪ�\�ł��]^000000";
		close;
	}
	if(checkquest(15050)) {
		if(!(checkquest(15050)&2) || !(checkquest(120205)&2)) {
			mes "�]���̐�͓��ꂵ�Ă���1��ڂ�";
			mes "�@^ff0000�ߑO5���ȍ~^000000�ɐi�s�\�ł��B";
			mes "�@�A���A�Ō�̓�������Ă���";
			mes "�@^ff00001����^000000�o�߂���܂ł�";
			mes "�@�i�s�ł��܂���̂ł����ӂ��������]";
			close;
		}
		delquest 15050;
		delquest 120205;
	}
	mes "�]�����ړ��@������]";
	set '@party$,strcharinfo(1);
	set '@leader$,strcharinfo(0);
	next;
	switch(select("�����̋��Ԃ̐���","��s�D�P���ɓ���","��߂�")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�]�p�[�e�B�[��";
			mes "�@"+ '@party$;
			mes "�@�p�[�e�B�[���[�_�[";
			mes "�@"+ '@leader$;
			mes "^0000ffhero_air^000000";
			mes "�����Ɏ��s���܂����]";
			close;
		}
		mdcreate "hero_air";
		mes "^ff0000�]�����̋��Ԃ𐶐����܂��]^000000";
		close;
	case 2:
		if(getonlinepartymember() != 1) {
			mes "�]�����̋��Ԃ��s����Ȃ���";
			mes "�@��l�������邱�Ƃ��ł��Ȃ��]";
			close;
		}
		if(getmercinfo(0)) {
			mes "�]�����̋��Ԃ��s����Ȃ���";
			mes "�@�b���ƈꏏ�ɓ��邱�Ƃ��ł��Ȃ��]";
			close;
		}
		switch(mdenter("hero_air")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[hero_air] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			setquest 15050;
			setquest 120205;
			set HEROAIR_1QUE,0;
			donpcevent getmdnpcname("#HeroAirManager")+ "::OnStart";
			close2;
			//warp "1@air1.gat",244,73;
			end;
		case 1:	// �p�[�e�B�[������
			mes "�]�����̋��Ԃ��s����Ȃ���";
			mes "�@��l�������邱�Ƃ��ł��Ȃ��]";
			close;
		case 2:	// �_���W�������쐬
			mes "^ff0000�]�����̋��Ԃ���������Ă��܂���B";
			mes "�@�p�[�e�B�[���[�_�[��";
			mes "�@�������邱�Ƃ��ł��܂��]^000000";
			close;
		default:	// ���̑��G���[
			close;
		}
	case 3:
		mes "�]�����ړ��@���痣�ꂽ�]";
		close;
	}
OnInit:
	waitingroom "��s�D�P��",0;
	end;
}

//============================================================
// ��s�D�P��
//------------------------------------------------------------
1@air1.gat,1,1,0	script	#HeroAirManager	139,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("���C�o�[��#air1");
	hideonnpc getmdnpcname("���C�o�[���L�b�h#1air1");
	hideonnpc getmdnpcname("���b�T�[���C�o�[��#1air");
	hideonnpc getmdnpcname("�X�J�C�W���C��#1air1");
	hideonnpc getmdnpcname("�X�J�C�W���C��#1air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#1air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#2air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#3air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#4air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#5air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#6air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#7air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#8air1");
	hideonnpc getmdnpcname("�X�J�C�O��������#1air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#2air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#3air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#4air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#5air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#6air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#7air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#8air2");

	hideonnpc getmdnpcname("�X�J�C�O��������#2aair1");
	hideonnpc getmdnpcname("�A�C���X#2air1");
	hideonnpc getmdnpcname("�P�C�I�X#2air1");
	hideonnpc getmdnpcname("���L#air2");

	hideonnpc getmdnpcname("�A�C���X#2air2");
	hideonnpc getmdnpcname("�D���y�����b�N#air2");
	hideonnpc getmdnpcname("�D���y�����b�N#2air2");
	hideonnpc getmdnpcname("�P�C�I�X#air2");
	hideonnpc getmdnpcname("warp1#air1");
	hideonnpc getmdnpcname("warp2a#air1");
	hideonnpc getmdnpcname("warp2b#air1");
	hideonnpc getmdnpcname("warp3a#air1");
	hideonnpc getmdnpcname("warp3b#air1");
	hideonnpc getmdnpcname("warp4a#air2");
	hideonnpc getmdnpcname("warp5a#air2");

	end;
}

1@air1.gat,217,67,3	script	�D���y�����b�N#air1	873,{
	switch(HEROAIR_1QUE) {
	case 0:
		if(checkquest(120200)&8) {
			mes "�]�P�C�I�X�ƃA�C���X��";
			mes "�@�D���炵���l���Ƙb�����Ă���]";
			next;
			if(select("����}��","�b�𕷂�") == 1) {
				mes "�]����}�����Ƃɂ����]";
				close2;
				set HEROAIR_1QUE,1;
				hideoffnpc getmdnpcname("���C�o�[��#air1");
				hideoffnpc getmdnpcname("���C�o�[���L�b�h#1air1");
				hideoffnpc getmdnpcname("���b�T�[���C�o�[��#1air");
				hideoffnpc getmdnpcname("�X�J�C�W���C��#1air1");
				hideoffnpc getmdnpcname("�X�J�C�W���C��#1air2");
				hideoffnpc getmdnpcname("�X�J�C�O��������#1air1");
				hideoffnpc getmdnpcname("�X�J�C�O��������#2air1");
				hideoffnpc getmdnpcname("�X�J�C�O��������#3air1");
				hideoffnpc getmdnpcname("�X�J�C�O��������#4air1");
				hideoffnpc getmdnpcname("�X�J�C�O��������#5air1");
				hideoffnpc getmdnpcname("�X�J�C�O��������#6air1");
				hideoffnpc getmdnpcname("�X�J�C�O��������#7air1");
				hideoffnpc getmdnpcname("�X�J�C�O��������#8air1");
				setnpcdisplay getmdnpcname("�X�J�C�O��������#1air1"),3183;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#2air1"),3183;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#3air1"),3183;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#4air1"),3183;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#5air1"),3183;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#6air1"),3183;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#7air1"),3183;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#8air1"),3183;
				donpcevent getmdnpcname("�D���y�����b�N#air1")+ "::OnStart";
				end;
			}
		}
		cutin "h_iris02.bmp", 2;
		mes "[�A�C���X]";
		mes "���킠�`!!";
		mes "�C�����̂������[��";
		mes "�����������ł��I";
		mes "����ف`�I";
		next;
		mes "[�A�C���X]";
		mes "���@���g�킸�ɂ���ȑ傫�ȑD��";
		mes "����ԂȂ�āA";
		mes "�Ƃ��Ă��s�v�c����Ȃ��H";
		mes "�˂��A�P�C�I�X�H";
		next;
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�c�c�B";
		next;
		cutin "h_iris02.bmp", 2;
		mes "[�A�C���X]";
		mes "�c�c�H�@�P�C�I�X�H";
		next;
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�c�c�c�c�B";
		mes "�@";
		mes "^0000FF�]�P�C�I�X�͐^���Ȋ��";
		mes "�@�����̋�����߂Ă���B";
		mes "�@�����l������ł���悤���]^000000";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "�P�[�C�[�I�[�X�[!?";
		mes "���̘b�𕷂��Ȃ��Łc�c�B";
		mes "���A�{�[����";
		mes "���Ă�́c�c���!!";
		next;
		cutin "h_chaos03.bmp", 2;
		mes "[�P�C�I�X]";
		mes "������I";
		mes "�@";
		mes "^0000FF�]�A�C���X�{���";
		mes "�@�̓����肪�P�C�I�X��";
		mes "�@�w�����P����!!�]^000000";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "�ӂ�I�@�ځ[���Ƃ��Ă�����I";
		next;
		cutin "h_chaos03.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�A�A�A�C���X!!";
		mes "�����E���C����!!";
		mes "������ƍl���������Ă�";
		mes "��������!!";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "�Ӂ[�񂾁I";
		mes "���̘b�𕷂��Ȃ��P�C�I�X��";
		mes "�����񂾂���ˁI";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "����!!";
		mes "�D���Ŋ댯�Ȉ��ӂ����͋֎~��!!";
		mes "���ꂾ����l�Ԃ̓_���Ȃ񂾁B";
		mes "�s�V�������񂾂�A�s�V���I";
		mes "����ȏ�ӂ������";
		mes "���ɗ��Ƃ��Ă��܂���!!";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "���c�c�D���I";
		mes "���A���߂�I";
		mes "���߂Ĕ�s�D�ɏ��������";
		mes "�͂��Ⴂ��������c�c�B";
		next;
		cutin "h_iris02.bmp", 2;
		mes "[�A�C���X]";
		mes "�Ƃ���őD���A";
		mes "����ȑ傫�Ȕ�s�D��";
		mes "�ǂ�����ċ�ɕ����Ă�́H";
		mes "�s�v�c�ł��傤���Ȃ���B";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "��H�@�������₾�B";
		mes "��������b�ɂȂ邪";
		mes "���ʂɋ����Ă��B";
		next;
		mes "[�D���y�����b�N]";
		mes "��^�̃{�C���[�Ő��𕦂����A";
		mes "��������o����C�̈��͂�";
		mes "�s�X�g���𓮂����A���Ԃ��񂷁B";
		mes "���̗͂𗘗p���A";
		mes "�^�[�r���𓮂�����";
		mes "�v���y�����񂵂Ă���񂾁B";
		next;
		cutin "h_iris02.bmp", 2;
		mes "[�A�C���X]";
		mes "�ւ��c�c!!";
		mes "��������Ă���ȑ傫�ȑD��";
		mes "��ɕ����Ă����񂾂ˁB";
		next;
		mes "[�A�C���X]";
		mes "�����ƕs�v�c�ȗ͂�";
		mes "�����ł���Ǝv���Ă�������A";
		mes "�_��I�ȃC���[�W�͏�����������Ȃ��B";
		mes "������������炵�����u�������";
		mes "�v���Ă�������";
		mes "������Ƃ�������c�c�B";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "�قق��A�Ȃ��Ȃ��s���l�Ԃ��ȁB";
		mes "�������B���C�����ł͂���ȑ傫�ȑD��";
		mes "��ɕ����ׂ鎖�͏o���Ȃ��B";
		mes "������^FF0000���[���@��^000000�Ƃ���";
		mes "��������g�p���Ă���B";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "���[���@�ցH";
		mes "������Ĉ�́c�c�B";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "���@�̃G�l���M�[���g�p�������u���B";
		mes "�܂��A�`���ɂ���Ȃ�Ƃ��̐S����";
		mes "���ꂽ���ɏo���������Ƃ���";
		mes "���肦�Ȃ��b�����邪�c�c�B";
		next;
		mes "[�D���y�����b�N]";
		mes "�����B";
		mes "���ɂ���^0000FF���~���̗�^000000�Ƃ����΂��B";
		mes "��������C�@�ւ̂悤�ȉ^���@�ւ�";
		mes "�ڑ�����ƁA���̐΂��痬��Ă���";
		mes "���[���ŃG�l���M�[�𑝕��ł���񂾁B";
		next;
		mes "[�D���y�����b�N]";
		mes "���̐e�w���炢�̑傫���̐΂ЂƂ�";
		mes "���̑D�������Ă���ƌ����Ă�";
		mes "�ߌ��ł͂Ȃ��B";
		mes "���̂��炢���͂ȗ͂������Ă���񂾁B";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "���~���̗܁c�c�B";
		mes "���������ꂾ���̑傫����";
		mes "���̑D�𓮂����Ă�";
		mes "�Ȃ�Ă������c�c�B";
		next;
		cutin "ep14_roki02.bmp", 2;
		mes "[���L]";
		mes "���O�B�B";
		mes "���ʘb�͂����܂łɂ���B";
		mes "�c�c����������B";
		next;
		cutin "ep14_roki02.bmp", 255;
		mes "[��s�D�斱��]";
		mes "��펖��!!�@��펖��!!";
		mes "7��������";
		mes "���C�o�[���̑啔�����o��!!";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "�Ȃɂ�!?";
		mes "���C�o�[������!!";
		next;
		cutin "fly_felrock2.bmp", 255;
		mes "[��s�D�斱��]";
		mes "�X�J�C�O����������!!";
		mes "���C�o�[������X�J�C�O����������";
		mes "�~��Ă��܂����[��!!";
		set HEROAIR_1QUE,1;
		hideoffnpc getmdnpcname("���C�o�[��#air1");
		hideoffnpc getmdnpcname("���C�o�[���L�b�h#1air1");
		hideoffnpc getmdnpcname("���b�T�[���C�o�[��#1air");
		hideoffnpc getmdnpcname("�X�J�C�W���C��#1air1");
		hideoffnpc getmdnpcname("�X�J�C�W���C��#1air2");
		hideoffnpc getmdnpcname("�X�J�C�O��������#1air1");
		hideoffnpc getmdnpcname("�X�J�C�O��������#2air1");
		hideoffnpc getmdnpcname("�X�J�C�O��������#3air1");
		hideoffnpc getmdnpcname("�X�J�C�O��������#4air1");
		hideoffnpc getmdnpcname("�X�J�C�O��������#5air1");
		hideoffnpc getmdnpcname("�X�J�C�O��������#6air1");
		hideoffnpc getmdnpcname("�X�J�C�O��������#7air1");
		hideoffnpc getmdnpcname("�X�J�C�O��������#8air1");
		setnpcdisplay getmdnpcname("�X�J�C�O��������#1air1"),3183;
		setnpcdisplay getmdnpcname("�X�J�C�O��������#2air1"),3183;
		setnpcdisplay getmdnpcname("�X�J�C�O��������#3air1"),3183;
		setnpcdisplay getmdnpcname("�X�J�C�O��������#4air1"),3183;
		setnpcdisplay getmdnpcname("�X�J�C�O��������#5air1"),3183;
		setnpcdisplay getmdnpcname("�X�J�C�O��������#6air1"),3183;
		setnpcdisplay getmdnpcname("�X�J�C�O��������#7air1"),3183;
		setnpcdisplay getmdnpcname("�X�J�C�O��������#8air1"),3183;
		next;
	case 1:
		cutin "h_chaos01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�����c�c!!";
		mes "���C�o�[���ɐl�Ԃ�";
		mes "����Ă邼�c�c!!";
		next;
		cutin "h_arcana02.bmp", 2;
		mes "[�A���J�i]";
		mes "�E�t�t�t�t�I";
		mes "���炭���҂����������܂���!!";
		mes "^0000FF�V�˔��������m�A���J�i^000000�������肷��";
		mes "�󒆃����X�^�[�T�v���C�Y�V���[!!";
		next;
		cutin "h_chaos03.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�V���[����!?";
		next;
		cutin "h_arcana02.bmp", 2;
		mes "[�A���J�i]";
		mes "�����c�c�n�߂Ȃ����B";
		mes "���̂��킢���X�J�C�O���������B!!";
		mes "�y�����y����";
		mes "�V���[�^�C�����!!";
		next;
		cutin "h_arcana02.bmp", 255;
		mes "[��s�D�斱��]";
		mes "���A�D���I�@��ςł��I";
		mes "�X�J�C�O�����������D�̂���������";
		mes "�\�����Ă��܂�!!";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "�Ȃ񂾂�!!�@�X�J�C�O����������!?";
		mes "�������ɑD��������͂�����";
		mes "�D�����!!�@���������I";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "�D���B";
		mes "�����܂ŋ�������K�v��";
		mes "�Ȃ��񂶂�Ȃ��H";
		mes "�X�J�C�O���������͂����@�B��";
		mes "������������Ă邾���݂��������B";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "�o�J�Ȏ���������!!";
		mes "�����͍��x8000�̏��Ȃ񂾂�!!";
		mes "������Ƃ����̏�ł�";
		mes "�������͎��ʂ�������Ȃ��񂾁I";
		next;
		cutin "fly_felrock2.bmp", 255;
		mes "[��s�D�斱��]";
		mes "�����!!�@1�Ԍ���G���W����!!";
		mes "�c�c��ςł��I";
		mes "���@�֎��Ɍ������Ă��܂��I";
		mes "���[���@�ւ����Ȃ����!!";
		next;
		cutin "fly_felrock2.bmp", 2;
		mes "[�D���y�����b�N]";
		mes "�Ȃ񂾂�!!�@���̕���͂ǂ����c�c!!";
		mes "�����B�����̐l�Ԃ���!!";
		mes "�����D�����ŕ����T���Ă���ԁA";
		mes "���̖��҂�����H���~�߂�!!";
		next;
		mes "[�D���y�����b�N]";
		mes "��炪�@�֎��ɐi������̂�";
		mes "�h���Ȃ���΂Ȃ�Ȃ�!!";
		mes "���[���@�ւ��j�󂳂ꂽ��";
		mes "���̑D�͒ė�����!!";
		next;
		mes "[�D���y�����b�N]";
		mes "����!!";
		mes "���̕��킳������΂���ȓz��c�c!!";
		next;
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�A�C���X!!";
		mes "�������͋@�֎��̂���";
		mes "���̊K�܂ō~��邼�I";
		mes "���L�ƃt�F�������͂����𗊂ށI";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "���A����I�@���������I";
		mes "�ꏏ�ɍs����!!";
		next;
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�������A�����̂��O��";
		mes "��`���Ă���B";
		mes "�������͐�ɍs���B";
		mes "�@�֎��ŗ������������I";
		close2;
		cutin "h_chaos02.bmp", 255;
		donpcevent getmdnpcname("�D���y�����b�N#air1")+ "::OnStart";
		end;
	}
OnStart:
	initnpctimer;
	hideoffnpc getmdnpcname("warp1#air1");
	hideonnpc getmdnpcname("�D���y�����b�N#air1");
	hideonnpc getmdnpcname("�P�C�I�X#air1");
	hideonnpc getmdnpcname("�A�C���X#air1");
	end;
OnTimer1000:
	announce "�����X�^�[����s�D��j�󂵂悤�Ƃ��Ă��܂��B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer4000:
	announce "��s�D�̉��̊K�֍~��ă����X�^�[��|���Ă��������B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer7000:
	stopnpctimer;
	announce "�t���A�ɂ��郂���X�^�[�����ׂē|���Ɛ�֐i�ނ��Ƃ��ł���悤�ɂȂ�܂��B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
}

1@air1.gat,248,54,0	script	warp1#air1	45,2,2,{
	hideonnpc getmdnpcname("warp1#air1");
	donpcevent getmdnpcname("mob#air1")+ "::OnStart";
	warp getmdmapname("1@air1.gat"),91,68;
	end;
}

1@air1.gat,215,67,5	script	�A�C���X#air1	666,{
	if(HEROAIR_1QUE == 0) {
		cutin "h_iris02.bmp", 2;
		mes "[�A�C���X]";
		mes "����Ȃɍ�������ׂ�Ȃ�āA";
		mes "�Ƃ��Ă��X�e�L���Ǝv��Ȃ��H";
		close2;
		cutin "h_iris02.bmp", 255;
		end;
	}
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "�����̓t�F�������ƃ��L�ɔC����";
	mes "�}���ŋ@�֎��ɍs���Ȃ��ƁI";
	close2;
	cutin "h_iris01.bmp", 255;
	end;
}

1@air1.gat,214,66,5	script	�P�C�I�X#air1	683,{
	if(HEROAIR_1QUE == 0) {
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�c�c�c�c�B";
		mes "�@";
		mes "^0000FF�]�P�C�I�X�͐^���Ȋ��";
		mes "�@�����̋�����߂Ă���B";
		mes "�@�����l������ł���悤���]^000000";
		close2;
		cutin "h_chaos02.bmp", 255;
		end;
	}
	cutin "h_chaos02.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�������A�����̂��O��";
	mes "��`���Ă���B";
	mes "�������͐�ɍs���B";
	mes "�@�֎��ŗ������������I";
	close2;
	cutin "h_chaos02.bmp", 255;
	end;
}

1@air1.gat,235,57,5	script	�t�F������#air1	664,{
	if(HEROAIR_1QUE == 0) {
		cutin "fenrir_a.bmp", 2;
		mes "[�t�F������]";
		mes "�@�B�̗͂ŋ���ׂ�Ȃ�āc�c�B";
		mes "�Z�p�̔��W�͖{���ɑf���炵����ˁB";
		next;
		mes "[�t�F������]";
		mes "�����ǂ��̔�s�D�����";
		mes "���͂ȗ͂�������c�c�B";
		mes "���̔�s�D�����ł���̂�";
		mes "�@�B�̗͂����ł͂Ȃ��̂���";
		mes "����Ȃ���ˁc�c�B";
		close2;
		cutin "fenrir_a.bmp", 255;
		end;
	}
	cutin "fenrir_b.bmp", 2;
	mes "[�t�F������]";
	mes "���������̃����X�^�[�̑���������!!";
	mes "�P�C�I�X�A�A�C���X�ƈꏏ��";
	mes "�}���Ŕ�s�D�̉��̊K��";
	mes "�����Ē���!!";
	close2;
	cutin "fenrir_a.bmp", 255;
	end;
}

1@air1.gat,240,57,3	script	���L#air1	512,{
	if(HEROAIR_1QUE == 0) {
		cutin "ep14_roki02.bmp", 2;
		mes "[���L]";
		mes "�c�c�B";
		mes "�����͐Â��ł����B";
		close2;
		cutin "ep14_roki02.bmp", 255;
		end;
	}
	cutin "ep14_roki02.bmp", 2;
	mes "[���L]";
	mes "�c�c�����͉����h���ł����B";
	mes "��s�D�̉��̊K�ɍs���B";
	close2;
	cutin "ep14_roki02.bmp", 255;
	end;
}

1@air1.gat,213,75,5	script	���C�o�[��#air1	2146,{}
1@air1.gat,218,78,3	script	���C�o�[���L�b�h#1air1	3185,{}
1@air1.gat,208,78,5	script	���b�T�[���C�o�[��#1air	3186,{}
1@air1.gat,200,78,5	script	�X�J�C���[�^�[�W���C��::�X�J�C�W���C��#1air1	1392,{}
1@air1.gat,223,78,3	script	�X�J�C���[�^�[�W���C��::�X�J�C�W���C��#1air2	1392,{}
1@air1.gat,236,57,3	script	�X�J�C�O��������#1air1	844,{}
1@air1.gat,239,57,5	script	�X�J�C�O��������#2air1	844,{}
1@air1.gat,230,50,5	script	�X�J�C�O��������#3air1	844,{}
1@air1.gat,226,62,3	script	�X�J�C�O��������#4air1	844,{}
1@air1.gat,241,48,3	script	�X�J�C�O��������#5air1	844,{}
1@air1.gat,225,40,7	script	�X�J�C�O��������#6air1	844,{}
1@air1.gat,236,48,7	script	�X�J�C�O��������#7air1	844,{}
1@air1.gat,224,66,5	script	�X�J�C�O��������#8air1	844,{}

1@air1.gat,58,197,3	script	���s�q#1air1	887,{
	mes "[���s�q]";
	mes "�c�c�܌������Ȃ��c�cZzz�c�c�B";
	mes "�Â��ɂ��Ă���c�c�B";
	mes "�N����A���Ȃ萺�グ�Ă�́c�c�B";
	close;
}

1@air1.gat,49,169,5	script	���s�q#2air1	887,{
	mes "[���s�q]";
	mes "�c�c�������c�c�������c�c�B ";
	mes "�c�c�͂��B";
	mes "�Q���ƁA���̒����R���{�����c�c�B";
	mes "�c�c���������Ȃ��c�c�B";
	mes "�ł��N����̖ʓ|����c�c�B";
	close;
}

1@air1.gat,42,205,3	script	�����ȍ��̉�#air1	956,{
	mes "[�����ȍ��̉�]";
	mes "�c�c�����ށB ";
	mes "���΂Ɍ̋��̃x�b�g�ق�";
	mes "�Q�S�n�͂悭�Ȃ��ȁc�c�ނɂ�B";
	mes "�c�c�����c�cZzzz�c�c�B";
	close;
}

1@air1.gat,43,191,4	script	���̌�q��#1air1	105,{
	mes "[���̌�q��]";
	mes "�ǂ�Ȏ��������Ă�";
	mes "�C�����悭���x�݂ɂȂ��Ă���É���";
	mes "�N�����Ă͂Ȃ�Ȃ��I";
	close;
}

1@air1.gat,39,191,4	script	���̌�q��#2air1	105,{
	mes "[���̌�q��]";
	mes "�ǂ�Ȏ��������Ă�";
	mes "�C�����悭���x�݂ɂȂ��Ă���É���";
	mes "�Q���������I";
	close;
}

1@air1.gat,93,193,3	script	��s�D�斱��#1air1	852,{
	if(HEROAIR_1QUE < 3) {
		mes "[��s�D�斱��]";
		mes "�����͋@�֎��ɍs���������B";
		mes "�����ɓ����ė���Ȃ��悤��";
		mes "����h���ł���I";
		close;
	}
	mes "[��s�D�斱��]";
	mes "���̐N�����������̂�!?";
	mes "�����͊댯������";
	mes "�f�b�L�܂őޔ�����񂾁I";
	close;
}

1@air1.gat,22,182,7	script	��s�D�斱��#2air1	852,{
	if(HEROAIR_1QUE < 3) {
		mes "[��s�D�斱��]";
		mes "�������A�����X�^�[����������I";
		mes "���̂܂܂��Ƌ@�֎�������Ă��܂�!!";
		close;
	}
	mes "[��s�D�斱��]";
	mes "�@�֎����󂳂��Ȃ�āI";
	mes "�������c�c�B";
	close;
}

1@air1.gat,120,62,3	script	���s���̋R�m#air1	733,{
	mes "[���s���̋R�m]";
	mes "���Ȃ񂾂�����́c�c�B";
	mes "�����S���؂��Ă��܂������H";
	mes "�c�c����A���ɂ��Ȃ�Ȃ��Ȃ�";
	mes "�������K�v�͂Ȃ��ȁc�c�B";
	close2;
	emotion 54, getmdnpcname("���s���̋R�m#air1");
	end;
}

1@air1.gat,95,47,3	script	�|�ꂽ��������#air1	887,{
	mes "[�|�ꂽ��������]";
	mes "�������c�c�h���c�c�I";
	mes "�h���̂́A����";
	mes "���S�����ɂ��Ă���c�c�ނɂ�B";
	close2;
	emotion 53, getmdnpcname("�|�ꂽ��������#air1");
	end;
}

1@air1.gat,75,71,5	script	�H�����̂�������#air1_0	55,{
	mes "[�H�����̂�������]";
	mes "�ȁA�Ȃ񂾂��̉���������?!";
	mes "���̑厖�ȐH���̎��Ԃ�";
	mes "�ז�������Ƃ́I";
	mes "�{�f�B�[�K�[�h�I�@�ǂ��ɂ���I";
	close;
}

1@air1.gat,61,88,5	script	������Ԃ�����V���l#ai	51,{
	mes "[������Ԃ�����V���l]";
	mes "�S�[�W���X�`�I";
	mes "�t�@���^�X�e�B�b�N�`!!";
	mes "���̂Ȃ�Ƃ������Ȃ����i��\������";
	mes "�̎����l���Ȃ��ƁI";
	close;
}

1@air1.gat,46,61,5	script	��s�D�H���x�z�l#air1_0	61,{
	mes "[��s�D�H���x�z�l]";
	mes "�����Ȏp�����Ă��܂����A";
	mes "���̃����X�^�[������";
	mes "���̐H����K�˂ė������q���܂ł��B";
	mes "���ɂ������܂����H�@���q�l�B";
	close;
}

1@air1.gat,28,67,5	script	�M�����u���[�}�O�C�[#ai	853,{
	mes "[�M�����u���[�}�O�C�[]";
	mes "�����I�@�J�[�h�ɐG��ȁI";
	mes "���[�������I";
	next;
	mes "[�M�����u���[�}�O�C�[]";
	mes "��c�c?!";
	mes "�̂��g�܂��ė���";
	mes "���ꂩ�炾�Ǝv�����̂ɁA";
	mes "�Ȃ񂾂�I�@���̃����X�^�[������?!";
	close;
}

1@air2.gat,120,62,3	script	���s���̋R�m#air2	733,{
	mes "[���s���̋R�m]";
	mes "��������I�@��Ԃ񂾁c�c�B";
	mes "���̌������Ɍ������s�D��";
	mes "��шڂ�񂾂�����!!";
	mes "�ł��A�h��═�킪�d����";
	mes "��Ԏ��M���Ȃ��񂾂�����!!";
	close;
}

1@air2.gat,95,47,3	script	�|�ꂽ��������#air2	887,{
	mes "[�|�ꂽ��������]";
	mes "�h��ɑ����āc�c";
	mes "�Ȃ񂾂��������c�c�B";
	mes "�ǂ��Ȃ��Ă񂾁H";
	mes "�c�c�������c�cZzz�c�c�B";
	close2;
	emotion 53, getmdnpcname("�|�ꂽ��������#air2");
	end;
}

1@air2.gat,75,71,5	script	�H�����̋�����#air2	55,{
	mes "[�H�����̋�����]";
	mes "�����Ă���!!";
	mes "���Ȃ炢����ł��o���I�@���肢���I";
	mes "������������E�o�����Ă���!!";
	mes "�{�f�B�[�K�[�h��";
	mes "��̂ǂ��ɂ����?!";
	next;
	mes "[�H�����̋�����]";
	mes "����Ȃ��ƂȂ�t���R�[�X��";
	mes "���ނ񂶂�Ȃ������c�c�B";
	mes "���A�œ����x��Ă��܂����c�c�B";
	close;
}

1@air2.gat,61,88,5	script	������Ԃ�����V���l#ai	51,{
	mes "[������Ԃ�����V���l]";
	mes "�S�[�W���X�`�t�@���^�X�e�B�b�N�`��";
	mes "��������D���f���炵���`��";
	mes "�q���b�z�[�C��";
	close;
}

1@air2.gat,46,61,5	script	��s�D�H���x�z�l#air2_0	61,{
	mes "[��s�D�H���x�z�l]";
	mes "���̑D���c�c������̂��c�c";
	mes "���͂��̑D�Ɖ^�������ɂ��܂��B";
	mes "���̑D�Ǝ��́c�c�ЂƂł�����I";
	next;
	mes "[��s�D�H���x�z�l]";
	mes "�Ȃ�Ă����������Ă�";
	mes "�ꍇ����Ȃ���!!";
	mes "���A���킠�I�@�����Ă���������!!";
	close;
}

1@air2.gat,28,67,5	script	�M�����u���[�}�O�C�[#ai	853,{
	mes "[�M�����u���[�}�O�C�[]";
	mes "�M�����u���[�̌�������!!";
	mes "���āA�����c�c�{���ɔM������Ȃ���!!";
	mes "�΁c�c���Ɓc�c!?";
	mes "�Ύ���!!�@�Ύ�����������!!";
	mes "���ЂႠ�������`!!";
	close;
}

1@air1.gat,1,1,0	script	mob#air1	139,{
OnStart:
	areamonster getmdmapname("1@air1.gat"),77,57,82,65,"�X�J�C�r�z���_�[",3184,3,getmdnpcname("mob#air1")+ "::OnKilled1";
	areamonster getmdmapname("1@air1.gat"),77,57,82,65,"�X�J�C���[�^�[�W���C��",3182,2,getmdnpcname("mob#air1")+ "::OnKilled1";
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@air1.gat"),getmdnpcname("mob#air1")+ "::OnKilled1");
	if('@count > 0)
		end;
	announce "12�������ɓG�̋C�z��������!!", 0x9, 0xffff00, 0x190, 12, 0, 0;
	areamonster getmdmapname("1@air1.gat"),61,77,68,85,"�X�J�C�r�z���_�[",3184,5,getmdnpcname("mob#air1")+ "::OnKilled2";
	areamonster getmdmapname("1@air1.gat"),61,77,68,85,"�X�J�C���[�^�[�W���C��",3182,3,getmdnpcname("mob#air1")+ "::OnKilled2";
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@air1.gat"),getmdnpcname("mob#air1")+ "::OnKilled2");
	if('@count > 0)
		end;
	announce "9�������ɓG�̋C�z��������!!", 0x9, 0xffff00, 0x190, 12, 0, 0;
	areamonster getmdmapname("1@air1.gat"),20,60,28,66,"�X�J�C�r�z���_�[",3184,3,getmdnpcname("mob#air1")+ "::OnKilled3";
	areamonster getmdmapname("1@air1.gat"),20,60,28,66,"�X�J�C���[�^�[�W���C��",3182,3,getmdnpcname("mob#air1")+ "::OnKilled3";
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@air1.gat"),getmdnpcname("mob#air1")+ "::OnKilled3");
	if('@count > 0)
		end;
	announce "���̃t���A�ɂ͂��������X�^�[�̋C�z���Ȃ��悤���B���̊K�֐i�����B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("mob#air2")+ "::OnStart";
	hideoffnpc getmdnpcname("warp2a#air1");
	hideoffnpc getmdnpcname("warp2b#air1");
	end;
}

1@air1.gat,104,72,0	warp	warp2a#air1	2,2,1@air1.gat,101,200
1@air1.gat,104,52,0	warp	warp2b#air1	2,2,1@air1.gat,101,176

1@air1.gat,1,1,0	script	mob#air2	139,{
OnStart:
	areamonster getmdmapname("1@air1.gat"),108,185,114,192,"�X�J�C�O��������",3183,3,getmdnpcname("mob#air2")+ "::OnKilled1";
	areamonster getmdmapname("1@air1.gat"),108,185,114,192,"���b�T�[���C�o�[��",3186,3,getmdnpcname("mob#air2")+ "::OnKilled1";
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@air1.gat"),getmdnpcname("mob#air2")+ "::OnKilled1");
	if('@count > 0)
		end;
	announce "9�������ɓG�̋C�z��������!!", 0x9, 0xffff00, 0x190, 12, 0, 0;
	areamonster getmdmapname("1@air1.gat"),60,185,68,192,"�X�J�C�O��������",3183,3,getmdnpcname("mob#air2")+ "::OnKilled2";
	areamonster getmdmapname("1@air1.gat"),60,185,68,192,"���b�T�[���C�o�[��",3186,3,getmdnpcname("mob#air2")+ "::OnKilled2";
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@air1.gat"),getmdnpcname("mob#air2")+ "::OnKilled2");
	if('@count > 0)
		end;
	announce "9�������ɓG�̋C�z��������!!", 0x9, 0xffff00, 0x190, 12, 0, 0;
	areamonster getmdmapname("1@air1.gat"),18,185,26,191,"�X�J�C�O��������",3183,3,getmdnpcname("mob#air2")+ "::OnKilled3";
	areamonster getmdmapname("1@air1.gat"),18,185,26,191,"���b�T�[���C�o�[��",3186,3,getmdnpcname("mob#air2")+ "::OnKilled3";
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@air1.gat"),getmdnpcname("mob#air2")+ "::OnKilled3");
	if('@count > 0)
		end;
	announce "���̃t���A�ɂ͂��������X�^�[�̋C�z���Ȃ��悤���B�@�֎������֌��������B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc getmdnpcname("�A�C���X#2air1");
	hideoffnpc getmdnpcname("�P�C�I�X#2air1");
	hideoffnpc getmdnpcname("�X�J�C�O��������#2aair1");
	setnpcdisplay getmdnpcname("�X�J�C�O��������#2aair1"),3183;
	end;
}

1@air1.gat,93,188,5	script	�X�J�C�O��������#2aair1	844,{
	end;
OnStart:
OnTimer4000:
	initnpctimer;
	misceffect 106, getmdnpcname("�X�J�C�O��������#2aair1");
	end;
}

1@air1.gat,88,189,5	script	�A�C���X#2air1	666,{
	switch(HEROAIR_1QUE) {
	case 1:
		if(checkquest(120200)&8) {
			mes "�]�P�C�I�X�ƃA�C���X��";
			mes "�@�@�֎��̑O�Řb�����Ă���]";
			next;
			if(select("����}��","�b�𕷂�") == 1) {
				mes "�]����}�����Ƃɂ����]";
				close2;
				setnpcdisplay getmdnpcname("�X�J�C�O��������#2aair1"),844;
				hideonnpc getmdnpcname("�X�J�C�O��������#2aair1");
				hideoffnpc getmdnpcname("warp3a#air1");
				hideoffnpc getmdnpcname("warp3b#air1");
				hideonnpc getmdnpcname("�A�C���X#2air1");
				hideonnpc getmdnpcname("�P�C�I�X#2air1");
				announce "�����X�^�[�̋C�z������B�|���Ȃ���߂����ق����������낤�B", 0x9, 0xffff00, 0x190, 12, 0, 0;
				donpcevent getmdnpcname("�X�J�C�O��������#2aair1")+ "::OnStart";
				donpcevent getmdnpcname("firecontrol#air")+ "::OnStart";
				donpcevent getmdnpcname("mob#air3")+ "::OnStart";
				end;
			}
		}
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "�͂��c�c�͂��c�c�B";
		mes "�P�C�I�X�c�c�B";
		mes "�����X�^�[�͂���őS���H";
		next;
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�����c�c�B";
		mes "�����X�^�[�͐H���~�߂�ꂽ�悤���ȁB";
		mes "���Ƃ��@�֎��͎�肫�����݂������B";
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "���c�c�I�@�P�C�I�X!!";
		mes "��������!!";
		mes "�X�J�C�O������������C�A�@�֎���!!";
		next;
		cutin "h_chaos03.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�c�c����!!";
		mes "�����߁I";
		mes "���̃X�J�C�O�����������~�߂邼!!";
		next;
		cutin "h_chaos03.bmp", 255;
		mes "[�X�J�C�O��������]";
		mes "�L�C�C�C�c�c!!";
		mes "�@";
		mes "�]�X�J�C�O���������͒������";
		mes "�@�@�֎��ɐݒu���ꂽ�@�B��";
		mes "�@�����J���A�O�����s���܂�";
		mes "�@�������͂��߂�!!�]";
	case 2:
		if(HEROAIR_1QUE == 1) {
			set HEROAIR_1QUE,2;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#2aair1"),844;
			hideonnpc getmdnpcname("�X�J�C�O��������#2aair1");
			next;
			misceffect 183, getmdnpcname("�X�J�C�O��������#2aair1");
			mes "^ff0000�]�W�b�c�W�W�b�c�c";
			mes "�@�o�`�o�`�c�c�o�`�b�c�c";
			mes "�@";
			mes "�@�Y�K�K�K�K�[���b!!�]^000000";
		}
		else {
			misceffect 183, getmdnpcname("�X�J�C�O��������#2aair1");
			mes "�]^ff0000�c�c�h�K�K�K�c�c�b!!^000000";
			mes "�@";
			mes "�@�ǂ����炩�����������苿����!!�]";
		}
		next;
		cutin "h_iris01.bmp", 2;
		mes "[�A�C���X]";
		mes "���Ⴀ����!!";
		next;
		cutin "h_iris01.bmp", 255;
		mes "[��s�D�斱��]";
		mes "���킠�����I�@���[���@�ւ�!!";
		mes "�G���W��������������!!";
		mes "���ΔǁI�@�����΂�����!!";
		next;
		mes "[��s�D�斱��]";
		mes "�����̂��Ȃ��B!!";
		mes "�����͊댯���I�@����āI";
		mes "�f�b�L�֏オ���Ă�������!!!!";
		next;
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�_����!!�@�����͊댯���I";
		mes "�܂��͂����𗣂�悤�I";
		mes "�A�C���X�A�}��!!";
		close2;
		cutin "h_chaos02.bmp", 255;
		set HEROAIR_1QUE,3;
		donpcevent getmdnpcname("�A�C���X#2air1")+ "::OnStart";
		donpcevent getmdnpcname("�X�J�C�O��������#2aair1")+ "::OnStart";
		donpcevent getmdnpcname("firecontrol#air")+ "::OnStart";
		end;
	}
	end;
OnStart:
	hideonnpc getmdnpcname("�A�C���X#2air1");
	hideonnpc getmdnpcname("�P�C�I�X#2air1");
	hideoffnpc getmdnpcname("warp3a#air1");
	hideoffnpc getmdnpcname("warp3b#air1");
	donpcevent getmdnpcname("mob#air3")+ "::OnStart";
	announce "�����X�^�[�̋C�z��������!!�@�����X�^�[��|���Ȃ���߂낤!!", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
}

1@air1.gat,88,187,5	script	�P�C�I�X#2air1	683,{
	if(HEROAIR_1QUE == 1) {
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�A�C���X�I�@���v���H";
		mes "�������I";
		mes "�������͑����ȁc�c�B";
		close2;
		cutin "h_chaos02.bmp", 255;
		end;
	}
	cutin "h_chaos02.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�_����!!�@�����͊댯���I";
	mes "�܂��͂����𗣂�悤�I";
	mes "�A�C���X�A�}��!!";
	close2;
	cutin "h_chaos02.bmp", 255;
	end;
}

1@air2.gat,1,1,0	script	mob#air3	139,{
OnStart:
	areamonster getmdmapname("1@air2.gat"),109,59,115,66,"���C�o�[���L�b�h",3185,3,getmdnpcname("mob#air3")+ "::OnKilled1";
	areamonster getmdmapname("1@air2.gat"),109,59,115,66,"�X�J�C�r�z���_�[",3184,3,getmdnpcname("mob#air3")+ "::OnKilled1";
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@air2.gat"),getmdnpcname("mob#air3")+ "::OnKilled1");
	if('@count > 0)
		end;
	announce "6�������ɓG�̋C�z��������!!", 0x9, 0xffff00, 0x190, 12, 0, 0;
	areamonster getmdmapname("1@air2.gat"),60,35,70,45,"���C�o�[���L�b�h",3185,3,getmdnpcname("mob#air3")+ "::OnKilled2";
	areamonster getmdmapname("1@air2.gat"),60,35,70,45,"�X�J�C�r�z���_�[",3184,3,getmdnpcname("mob#air3")+ "::OnKilled2";
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@air2.gat"),getmdnpcname("mob#air3")+ "::OnKilled2");
	if('@count > 0)
		end;
	announce "9�������ɓG�̋C�z��������!!", 0x9, 0xffff00, 0x190, 12, 0, 0;
	areamonster getmdmapname("1@air2.gat"),20,60,30,70,"���C�o�[���L�b�h",3185,3,getmdnpcname("mob#air3")+ "::OnKilled3";
	areamonster getmdmapname("1@air2.gat"),20,60,30,70,"�X�J�C�r�z���_�[",3184,3,getmdnpcname("mob#air3")+ "::OnKilled3";
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@air2.gat"),getmdnpcname("mob#air3")+ "::OnKilled3");
	if('@count > 0)
		end;
	announce "���̊K�ɂ͂��������X�^�[�̋C�z���Ȃ��悤���B�f�b�L�܂ŏオ�낤�B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc getmdnpcname("warp4a#air2");
	end;
}

1@air1.gat,103,200,0	warp	warp3a#air1	2,2,1@air2.gat,104,72
1@air1.gat,103,176,0	warp	warp3b#air1	2,2,1@air2.gat,104,52

1@air2.gat,1,1,0	script	firecontrol#air	139,{
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	misceffect 106, getmdnpcname("fire1#air2");
	misceffect 106, getmdnpcname("fire8#air2");
	misceffect 106, getmdnpcname("fire21#air2");
	misceffect 106, getmdnpcname("fire29#air2");
	end;
OnTimer1500:
	misceffect 106, getmdnpcname("fire2#air2");
	misceffect 106, getmdnpcname("fire9#air2");
	misceffect 106, getmdnpcname("fire22#air2");
	misceffect 106, getmdnpcname("fire30#air2");
	end;
OnTimer2000:
	misceffect 106, getmdnpcname("fire3#air2");
	misceffect 106, getmdnpcname("fire10#air2");
	misceffect 106, getmdnpcname("fire23#air2");
	end;
OnTimer2500:
	misceffect 106, getmdnpcname("fire4#air2");
	misceffect 106, getmdnpcname("fire11#air2");
	misceffect 106, getmdnpcname("fire24#air2");
	end;
OnTimer3000:
	misceffect 106, getmdnpcname("fire5#air2");
	misceffect 106, getmdnpcname("fire12#air2");
	misceffect 106, getmdnpcname("fire25#air2");
	end;
OnTimer3500:
	misceffect 106, getmdnpcname("fire6#air2");
	misceffect 106, getmdnpcname("fire13#air2");
	misceffect 106, getmdnpcname("fire26#air2");
	end;
OnTimer4000:
	misceffect 106, getmdnpcname("fire7#air2");
	misceffect 106, getmdnpcname("fire14#air2");
	misceffect 106, getmdnpcname("fire27#air2");
	end;
OnTimer4500:
	misceffect 106, getmdnpcname("fire15#air2");
	misceffect 106, getmdnpcname("fire28#air2");
	initnpctimer;
	end;
}

1@air2.gat,113,52,0	script	fire1#air2	139,{}
1@air2.gat,115,68,0	script	fire2#air2	139,{}
1@air2.gat,96,58,0	script	fire3#air2	139,{}
1@air2.gat,90,75,0	script	fire4#air2	139,{}
1@air2.gat,92,51,0	script	fire5#air2	139,{}
1@air2.gat,77,42,0	script	fire6#air2	139,{}
1@air2.gat,69,77,0	script	fire7#air2	139,{}
1@air2.gat,50,49,0	script	fire8#air2	139,{}
1@air2.gat,44,61,0	script	fire9#air2	139,{}
1@air2.gat,31,53,0	script	fire10#air2	139,{}
1@air2.gat,24,74,0	script	fire11#air2	139,{}
1@air2.gat,43,45,0	script	fire12#air2	139,{}
1@air2.gat,73,65,0	script	fire13#air2	139,{}
1@air2.gat,53,72,0	script	fire14#air2	139,{}
1@air2.gat,82,62,0	script	fire15#air2	139,{}
1@air2.gat,234,70,0	script	fire21#air2	139,{}
1@air2.gat,247,64,0	script	fire22#air2	139,{}
1@air2.gat,230,33,0	script	fire23#air2	139,{}
1@air2.gat,200,52,0	script	fire24#air2	139,{}
1@air2.gat,227,39,0	script	fire25#air2	139,{}
1@air2.gat,223,50,0	script	fire26#air2	139,{}
1@air2.gat,208,67,0	script	fire27#air2	139,{}
1@air2.gat,208,39,0	script	fire28#air2	139,{}
1@air2.gat,238,70,0	script	fire29#air2	139,{}
1@air2.gat,238,32,0	script	fire30#air2	139,{}

1@air2.gat,88,67,0	warp	warp4a#air2	2,2,1@air2.gat,247,53

1@air2.gat,213,75,5	script	���C�o�[��#air2	2146,{}

1@air2.gat,235,59,3	script	���C�o�[��#2air2	2146,{}
1@air2.gat,235,49,3	script	���C�o�[��#3air2	2146,{}
1@air2.gat,218,78,3	script	���C�o�[���L�b�h#1air2	3185,{}
1@air2.gat,208,78,5	script	���b�T�[���C�o�[��#2air	3186,{}
1@air2.gat,200,78,5	script	�X�J�C���[�^�[�W���C��	1392,{}
1@air2.gat,223,78,3	script	�X�J�C���[�^�[�W���C��	1392,{}
1@air2.gat,236,57,3	script	�X�J�C�O��������#1air2	844,{}
1@air2.gat,239,57,5	script	�X�J�C�O��������#2air2	844,{}
1@air2.gat,230,50,5	script	�X�J�C�O��������#3air2	844,{}
1@air2.gat,226,62,3	script	�X�J�C�O��������#4air2	844,{}
1@air2.gat,241,48,3	script	�X�J�C�O��������#5air2	844,{}
1@air2.gat,225,40,7	script	�X�J�C�O��������#6air2	844,{}
1@air2.gat,236,48,7	script	�X�J�C�O��������#7air2	844,{}
1@air2.gat,224,66,5	script	�X�J�C�O��������#8air2	844,{}

1@air2.gat,229,56,5	script	���L#air2	512,{
	cutin "ep14_roki02.bmp", 2;
	mes "[���L]";
	mes "�����玟�ւƁc�c�ʓ|�Ȃ�炾�B";
	close2;
	cutin "ep14_roki02.bmp", 255;
	end;
}

1@air2.gat,229,54,5	script	�t�F������#air2	664,{
	if(checkquest(120200)&8) {
		mes "�]�t�F�������������X�^�[��";
		mes "�@����Ă���]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
			mes "�]����}�����Ƃɂ����]";
			close2;
			hideonnpc getmdnpcname("���L#air2");
			setnpcdisplay getmdnpcname("���C�o�[��#2air2"),844;
			setnpcdisplay getmdnpcname("���C�o�[��#3air2"),844;
			hideonnpc getmdnpcname("���C�o�[��#2air2");
			hideonnpc getmdnpcname("���C�o�[��#3air2");
			hideonnpc getmdnpcname("�A�C���X#air2");
			hideonnpc getmdnpcname("�t�F������#air2");
			donpcevent getmdnpcname("mob#air4")+ "::OnStart";
			end;
		}
	}
	cutin "fenrir_a.bmp", 2;
	mes "[�t�F������]";
	mes "�c�c������";
	mes "������|���Ă��L����������ˁB";
	next;
	cutin "h_guardian2.bmp", 1;
	mes "[�H�H�H�H�H]";
	mes "����ς�A���������������͂�";
	mes "�Ԉ���ĂȂ�������ˁB";
	mes "���̔g����ǂ��ĉ������܂�";
	mes "�����b�オ�������悤����I";
	next;
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "�c�c�N�Ȃ�!!";
	next;
	cutin "h_guardian2.bmp", 1;
	mes "[�H�H�H�H�H]";
	mes "�Љ�悤�c�c�B";
	next;
	cutin "h_guardian1.bmp", 1;
	mes "[�H�H�H�H�H]";
	mes "�R����Ԃ��g���[�h�}�[�N�I";
	mes "�V���@�I";
	mes "�Z���^�[�͏���Ȃ�!!";
	mes "�o�T���I";
	mes "�T���T���w�A�[�̋������ڈ��";
	mes "���N�V���~�[�I";
	next;
	mes "[�K�[�f�B�A���q���C���Y]";
	mes "�������͖��G�̃����W���[�I";
	mes "���̖����c�c";
	mes "^FF0000�K�[�f�B�A���q���C���Y!!^000000";
	next;
	cutin "h_chaos03.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�c�c�B";
	next;
	cutin "fenrir_a.bmp", 2;
	mes "[�t�F������]";
	mes "�c�c�B";
	next;
	cutin "h_guardian1.bmp", 1;
	mes "[�V���@]";
	mes "����H�@��������������ˁH";
	mes "�ǂ����Ă݂�Ȗق��Ă�́c�c�H";
	mes "���߂������Ă��Ɓc�c�H";
	next;
	mes "[�o�T��]";
	mes "�ӂӂ��A�Ⴄ�ˁB";
	mes "���܂�ɂ������������o�ꂾ��������";
	mes "�݂�ȕ��S���Ă�񂾂�B";
	next;
	mes "[���N�V���~�[]";
	mes "�����ł���B";
	mes "�p�Y�̓o��ł��̂��炢�̉��o��";
	mes "������O�ł��Ă�B";
	next;
	cutin "h_iris02.bmp", 2;
	mes "[�A�C���X]";
	mes "�Ձc�c�b�I";
	mes "�A�n�n�n�n�n�n!!!!";
	next;
	mes "[�A�C���X]";
	mes "���Ȃ́H�@���̐l�����I";
	mes "�q���C���Y�H�@�p�Y??";
	mes "���������̕�����!?";
	mes "����ߑ��̂���H";
	mes "�p�Y����Ȃ��Č|�l����Ȃ��H";
	next;
	cutin "h_guardian3.bmp", 1;
	mes "[���N�V���~�[]";
	mes "���Ȃ��A���̕��̉��l��";
	mes "�������Ȃ����炻��Ȏ���";
	mes "���Ă��܂��̂ˁH";
	mes "���ꂾ���痬�s�ɑa��������";
	mes "����܂���B";
	next;
	mes "[�o�T��]";
	mes "�݂�ȁI�@���͗I����";
	mes "������ׂ肵�Ă�ꍇ����Ȃ��I";
	mes "�������̔g����������΂����!!";
	next;
	mes "[�V���@]";
	mes "���������A�o�T���I";
	mes "���U�ŏI��点�Ă��c�c�B";
	mes "�K�E�I�@�����藠��!!";
	mes "�Z�C�b�I�@���b�I";
	next;
	cutin "h_iris02.bmp", 255;
	mes "�]^ff0000�h�K�K�K�K�b�I^000000�]";
	mes "�@";
	mes "�]^0000FF�V���@�̕����������藠����";
	mes "�@�ݔ��ɖ��������ꂽ!!^000000�]";
	donpcevent getmdnpcname("�t�F������#air2")+ "::OnEff1";
	next;
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "�ȁA���Ȃ̂�����I";
	mes "���S�ɋ����Ă�c�c�B";
	next;
	cutin "h_arcana02.bmp", 2;
	mes "[�A���J�i]";
	mes "����͂���́B";
	mes "�\�z�O�̋��͎҂����܂����ˁB";
	mes "�t�t�b�A�v���Ă����ȏ��";
	mes "�y�����p�[�e�B�[�ɂȂ肻���ł��ˁB";
	next;
	cutin "fenrir_a.bmp", 2;
	mes "[�t�F������]";
	mes "���̃p�[�e�B�[�A���̕ӂ�";
	mes "�I���ɂ��ė~������ˁB";
	mes "�M���́c�c";
	mes "�t���C���̎w���ŗ����́H";
	next;
	cutin "h_arcana02.bmp", 2;
	mes "[�A���J�i]";
	mes "�����A���ӋC�ł��˂��B";
	mes "�l�Ԃ̕��ۂŃt���C���l�̖��O��";
	mes "�y�X�������ɂ���Ƃ́c�c�B";
	next;
	cutin "fenrir_a.bmp", 2;
	mes "[�t�F������]";
	mes "����ς�c�c";
	mes "�t���C���̎��̂悤�ˁB";
	next;
	cutin "h_arcana01.bmp", 2;
	mes "[�A���J�i]";
	mes "���̂������ɂ͋C������悤��";
	mes "�����܂���ł������H";
	mes "���܂薳�炪������Ɓc�c";
	mes "�V�����󂯂邱�ƂɂȂ�܂���H";
	next;
	cutin "fenrir_b.bmp", 2;
	mes "[�t�F������]";
	mes "�c�c!!";
	donpcevent getmdnpcname("�t�F������#air2")+ "::OnEff1";
	next;
	cutin "h_arcana02.bmp", 2;
	mes "[�A���J�i]";
	mes "�ʔ������̂�";
	mes "�����ɂ���܂��傤�B";
	mes "��������ď�����";
	mes "�����₵�Ă��������ˁH";
	next;
	cutin "fenrir_b.bmp", 255;
	mes "[���C�o�[��]";
	mes "�N�I�I�I�I�c�c�b!!";
	next;
	cutin "fenrir_b.bmp", 2;
	mes "[�t�F������]";
	mes "���C�o�[���̂��̓���c�c";
	mes "�܂����u���X��!?";
	next;
	cutin "h_arcana02.bmp", 2;
	mes "[�A���J�i]";
	mes "�r�E���E�S��";
	mes "�܂��A���̑D�ɉ΂�";
	mes "������x�Ȃ炱�̉Η͂�";
	mes "���Ȃ��ł��傤�B";
	next;
	cutin "fenrir_b.bmp", 2;
	mes "[�t�F������]";
	mes "���A����!!";
	next;
	hideoffnpc getmdnpcname("���L#air2");
	misceffect 183, getmdnpcname("���L#air2");
	cutin "fenrir_b.bmp", 255;
	mes "�]���C�o�[���̉��������ꂽ";
	mes "�@���̏u�ԁc�c!!";
	mes "�@���L�������̑̂�";
	mes "�@�u���X��S�Ď󂯎~�߂�!!�]";
	next;
	cutin "fenrir_a.bmp", 2;
	mes "[�t�F������]";
	mes "�c�c?!";
	mes "���L!!";
	next;
	cutin "ep14_roki02.bmp", 2;
	mes "[���L]";
	mes "�c�c�t���B";
	mes "���̒��x�Ƃ͂ȁB";
	next;
	cutin "h_arcana02.bmp", 2;
	mes "[�A���J�i]";
	mes "����c�c�B";
	mes "���C�o�[���̃u���X��e���Ƃ́c�c�B";
	mes "�����͍��̂���l�Ԃ�����܂����ˁB";
	mes "�ł�������̑���͂ǂ��ł��傤�H";
	next;
	cutin "ep14_roki02.bmp", 255;
	mes "[���C�o�[��]";
	mes "�N�I�I�I�c�c!!";
	next;
	cutin "ep14_roki02.bmp", 2;
	mes "[���L]";
	mes "�����A�����̂��O�B";
	mes "��C�͉������������B";
	mes "���O�͂����̑�������Ă���B";
	close2;
	cutin "ep14_roki02.bmp", 255;
	hideonnpc getmdnpcname("���L#air2");
	setnpcdisplay getmdnpcname("���C�o�[��#2air2"),844;
	setnpcdisplay getmdnpcname("���C�o�[��#3air2"),844;
	hideonnpc getmdnpcname("���C�o�[��#2air2");
	hideonnpc getmdnpcname("���C�o�[��#3air2");
	hideonnpc getmdnpcname("�A�C���X#air2");
	hideonnpc getmdnpcname("�t�F������#air2");
	donpcevent getmdnpcname("mob#air4")+ "::OnStart";
	end;
OnEff1:
	misceffect 183, getmdnpcname("�X�J�C�O��������#1air2");
	sleep 1000;
	misceffect 183, getmdnpcname("�X�J�C�O��������#2air2");
	sleep 1000;
	misceffect 183, getmdnpcname("�X�J�C�O��������#3air2");
	end;
}

1@air2.gat,241,54,3	script	�A�C���X#air2	666,{
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "���������̑f�G�ȋ�̗��������̂ɁI";
	mes "�ǂ����Ă��[�Ȃ����Ⴄ���P!?";
	close2;
	cutin "h_iris01.bmp", 255;
	end;
}

1@air2.gat,232,51,5	script	�A�C���X#2air2	666,{
	if(checkquest(120200)&8) {
		mes "�]�A�C���X���X�J�C�O����������";
		mes "�@����Ă���]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
			mes "�]�D�����\��Ă���悤���B";
			mes "�@�ǂ����悤���c�c�]";
			while(1) {
				next;
				switch(select("����ė��������̂�҂�",
							"^0000ff��������(�퓬�Ȃ�)^000000",
							"^ff0000�{��̑D���Ɛ퓬�I^000000(��Փx�F^0000ff��^000000)",
							"^ff0000�\�������D���Ɛ퓬�I^000000(��Փx�F^ff0000��^000000)"
				)) {
				case 1:
					mes "�]�D���͖\�ꑱ���Ă���B";
					mes "�@�ǂ����悤���c�c�]";
					continue;
				case 2:
					mes "�]���Ȃ��͑D���ɌĂт����A";
					mes "�@���������݂��B";
					mes "�@�D���͉�ɕԂ�A�U���̎���~�߂��]";
					close2;
					set HEROAIR_1QUE,4;
					hideonnpc getmdnpcname("�D���y�����b�N#air2");
					hideonnpc getmdnpcname("�A�C���X#2air2");
					setnpcdisplay getmdnpcname("�X�J�C�O��������#1air2"),844;
					setnpcdisplay getmdnpcname("�X�J�C�O��������#2air2"),844;
					setnpcdisplay getmdnpcname("�X�J�C�O��������#3air2"),844;
					setnpcdisplay getmdnpcname("�X�J�C�O��������#4air2"),844;
					setnpcdisplay getmdnpcname("�X�J�C�O��������#5air2"),844;
					setnpcdisplay getmdnpcname("�X�J�C�O��������#6air2"),844;
					setnpcdisplay getmdnpcname("�X�J�C�O��������#7air2"),844;
					setnpcdisplay getmdnpcname("�X�J�C�O��������#8air2"),844;
					hideonnpc getmdnpcname("�X�J�C�O��������#1air2");
					hideonnpc getmdnpcname("�X�J�C�O��������#2air2");
					hideonnpc getmdnpcname("�X�J�C�O��������#3air2");
					hideonnpc getmdnpcname("�X�J�C�O��������#4air2");
					hideonnpc getmdnpcname("�X�J�C�O��������#5air2");
					hideonnpc getmdnpcname("�X�J�C�O��������#6air2");
					hideonnpc getmdnpcname("�X�J�C�O��������#7air2");
					hideonnpc getmdnpcname("�X�J�C�O��������#8air2");
					hideoffnpc getmdnpcname("�P�C�I�X#air2");
					hideoffnpc getmdnpcname("�D���y�����b�N#2air2");
					end;
				case 3:
					mes "�]���Ȃ��͕�����\���A";
					mes "�@�{��̑D���֌������čs�����I�]";
					close2;
					set HEROAIR_1QUE,5;
					cutin "h_iris01.bmp", 255;
					donpcevent getmdnpcname("�A�C���X#2air2")+ "::OnStart";
					donpcevent getmdnpcname("callboss#air")+ "::OnStart1";
					end;
				case 4:
					mes "�]���Ȃ��͕�����\���A";
					mes "�@�\�������D���֌������čs�����I�]";
					close2;
					set HEROAIR_1QUE,6;
					cutin "h_iris01.bmp", 255;
					donpcevent getmdnpcname("�A�C���X#2air2")+ "::OnStart";
					donpcevent getmdnpcname("callboss#air")+ "::OnStart2";
					end;
				}
			}
		}
	}
	mes "[�X�J�C�O��������]";
	mes "�L�C�C�C�b�c�c";
	mes "�N���A�A�A�A�`�b!!";
	next;
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "���Ⴀ���I";
	mes "������܂�����Ȃɂ���!!";
	mes "����!!";
	mes "���������!!";
	next;
	cutin "fly_felrock2.bmp", 2;
	mes "[�D���y�����b�N]";
	mes "���������I�@���̕���I";
	mes "�ӂӂӂӂ�!!";
	next;
	mes "[�D���y�����b�N]";
	mes "���̑D�ő������N�����Ƃǂ��Ȃ邩�A";
	mes "�v���m�点�Ă��I";
	next;
	mes "[�D���y�����b�N]";
	mes "���ʂɐ��삵��";
	mes "�G�N�\�_�X�W���[�J�[XIII��";
	mes "�h�D�[�����C�t���ŏI��点�Ă����!!";
	next;
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "����A������ƑD��!!";
	mes "�{���ɂ�����R�R�Ō��C�Ȃ�!?";
	next;
	cutin "fly_felrock2.bmp", 2;
	mes "[�D���y�����b�N]";
	mes "������O���I";
	mes "�ӂ͂͂͂͂͂͂͂͂́I";
	next;
	cutin "h_iris01.bmp", 255;
	mes "�]^ff0000�p���I�@�p�p���I�@�p���b�I^000000�]";
	next;
	misceffect 183, getmdnpcname("�X�J�C�O��������#1air2");
	misceffect 183, getmdnpcname("�X�J�C�O��������#2air2");
	misceffect 183, getmdnpcname("�X�J�C�O��������#3air2");
	setnpcdisplay getmdnpcname("�X�J�C�O��������#1air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#2air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#3air2"),844;
	hideonnpc getmdnpcname("�X�J�C�O��������#1air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#2air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#3air2");
	mes "[�X�J�C�O��������]";
	mes "�N�G�G�b!!";
	next;
	cutin "fly_felrock2.bmp", 2;
	mes "[�D���y�����b�N]";
	mes "���͂͂͂́I";
	mes "�ǂ����H�@���̏e�̈З͂�!!";
	mes "������͂͂͂�!!";
	next;
	cutin "h_iris01.bmp", 255;
	mes "�]^ff0000�p���I�@�p�p���I�@�p���b�I^000000�]";
	next;
	misceffect 183, getmdnpcname("�X�J�C�O��������#1air2");
	misceffect 183, getmdnpcname("�X�J�C�O��������#2air2");
	misceffect 183, getmdnpcname("�X�J�C�O��������#3air2");
	mes "[��s�D�斱��]";
	mes "�킠�����c�c�I";
	mes "�G�A�G���W�����I";
	next;
	cutin "fly_felrock2.bmp", 2;
	mes "[�D���y�����b�N]";
	mes "�Ȃ񂾂Ƃ�!!";
	mes "���c��{���Ă����";
	mes "�G���W�����U�����͂��߂���!?";
	next;
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "���Ȃ���������!!";
	mes "�D����!!";
	next;
	cutin "h_iris01.bmp", 255;
	mes "�]^ff0000�p���I�@�p�p���I�@�p���b�I^000000�]";
	next;
	misceffect 183, getmdnpcname("�X�J�C�O��������#1air2");
	misceffect 183, getmdnpcname("�X�J�C�O��������#2air2");
	cutin "fly_felrock2.bmp", 2;
	mes "[�D���y�����b�N]";
	mes "������I";
	mes "��邳��!!�@�S�ł����Ă��I";
	mes "���͂͂͂́[��!!";
	next;
	misceffect 183, getmdnpcname("�X�J�C�O��������#3air2");
	cutin "h_iris01.bmp", 2;
	mes "[�A�C���X]";
	mes "�����c�c���߁I";
	mes "�D���̂����őD�����݂����c�c�B";
	mes "�\�����Ă�D�����~�߂Ȃ���!";
	next;
	mes "[�A�C���X]";
	mes "�ǂ�����΂��������āH";
	mes "�����ˁc�c�B";
	mes "���ȂȂ����x�ɏՌ���^�����";
	mes "���C�ɖ߂邩���c�c�B";
	mes "��s�D������O�ɁA���肢�I";
	while(1) {
		next;
		switch(select("����ė��������̂�҂�",
					"^0000ff��������(�퓬�Ȃ�)^000000",
					"^ff0000�{��̑D���Ɛ퓬�I^000000(��Փx�F^0000ff��^000000)",
					"^ff0000�\�������D���Ɛ퓬�I^000000(��Փx�F^ff0000��^000000)"
		)) {
		case 1:
			mes "�]�D���͖\�ꑱ���Ă���B";
			mes "�@�ǂ����悤���c�c�]";
			continue;
		case 2:
			mes "�]���Ȃ��͑D���ɌĂт����A";
			mes "�@���������݂��B";
			mes "�@�D���͉�ɕԂ�A�U���̎���~�߂��]";
			close2;
			set HEROAIR_1QUE,4;
			hideonnpc getmdnpcname("�D���y�����b�N#air2");
			hideonnpc getmdnpcname("�A�C���X#2air2");
			setnpcdisplay getmdnpcname("�X�J�C�O��������#1air2"),844;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#2air2"),844;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#3air2"),844;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#4air2"),844;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#5air2"),844;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#6air2"),844;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#7air2"),844;
			setnpcdisplay getmdnpcname("�X�J�C�O��������#8air2"),844;
			hideonnpc getmdnpcname("�X�J�C�O��������#1air2");
			hideonnpc getmdnpcname("�X�J�C�O��������#2air2");
			hideonnpc getmdnpcname("�X�J�C�O��������#3air2");
			hideonnpc getmdnpcname("�X�J�C�O��������#4air2");
			hideonnpc getmdnpcname("�X�J�C�O��������#5air2");
			hideonnpc getmdnpcname("�X�J�C�O��������#6air2");
			hideonnpc getmdnpcname("�X�J�C�O��������#7air2");
			hideonnpc getmdnpcname("�X�J�C�O��������#8air2");
			hideoffnpc getmdnpcname("�P�C�I�X#air2");
			hideoffnpc getmdnpcname("�D���y�����b�N#2air2");
			end;
		case 3:
			mes "�]���Ȃ��͕�����\���A";
			mes "�@�{��̑D���֌������čs�����I�]";
			close2;
			set HEROAIR_1QUE,5;
			cutin "h_iris01.bmp", 255;
			donpcevent getmdnpcname("�A�C���X#2air2")+ "::OnStart";
			donpcevent getmdnpcname("callboss#air")+ "::OnStart1";
			end;
		case 4:
			mes "�]���Ȃ��͕�����\���A";
			mes "�@�\�������D���֌������čs�����I�]";
			close2;
			set HEROAIR_1QUE,6;
			cutin "h_iris01.bmp", 255;
			donpcevent getmdnpcname("�A�C���X#2air2")+ "::OnStart";
			donpcevent getmdnpcname("callboss#air")+ "::OnStart2";
			end;
		}
	}
OnStart:
	hideonnpc getmdnpcname("�D���y�����b�N#air2");
	hideonnpc getmdnpcname("�A�C���X#2air2");
	setnpcdisplay getmdnpcname("�X�J�C�O��������#1air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#2air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#3air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#4air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#5air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#6air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#7air2"),844;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#8air2"),844;
	hideonnpc getmdnpcname("�X�J�C�O��������#1air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#2air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#3air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#4air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#5air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#6air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#7air2");
	hideonnpc getmdnpcname("�X�J�C�O��������#8air2");
	end;
}

1@air2.gat,1,1,0	script	mob#air4	139,{
OnStart:
	monster getmdmapname("1@air2.gat"),235,49,"���C�o�[��",3187,1,getmdnpcname("mob#air4")+ "::OnKilled";
	end;
OnKilled:
	hideoffnpc getmdnpcname("�A�C���X#2air2");
	hideoffnpc getmdnpcname("�D���y�����b�N#air2");
	setnpcdisplay getmdnpcname("�X�J�C�O��������#1air2"),3183;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#2air2"),3183;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#3air2"),3183;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#4air2"),3183;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#5air2"),3183;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#6air2"),3183;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#7air2"),3183;
	setnpcdisplay getmdnpcname("�X�J�C�O��������#8air2"),3183;
	hideoffnpc getmdnpcname("�X�J�C�O��������#1air2");
	hideoffnpc getmdnpcname("�X�J�C�O��������#2air2");
	hideoffnpc getmdnpcname("�X�J�C�O��������#3air2");
	hideoffnpc getmdnpcname("�X�J�C�O��������#4air2");
	hideoffnpc getmdnpcname("�X�J�C�O��������#5air2");
	hideoffnpc getmdnpcname("�X�J�C�O��������#6air2");
	hideoffnpc getmdnpcname("�X�J�C�O��������#7air2");
	hideoffnpc getmdnpcname("�X�J�C�O��������#8air2");
	end;
}

1@air2.gat,1,1,0	script	callboss#air	139,{
OnStart1:
	monster getmdmapname("1@air2.gat"),247,51,"�{��̑D���y�����b�N",3188,1,getmdnpcname("callboss#air")+ "::OnKilled";
	end;
OnStart2:
	monster getmdmapname("1@air2.gat"),247,51,"�\�������D���y�����b�N",3181,1,getmdnpcname("callboss#air")+ "::OnKilled";
	end;
OnKilled:
	hideoffnpc getmdnpcname("�P�C�I�X#air2");
	hideoffnpc getmdnpcname("�D���y�����b�N#2air2");
	end;
}

1@air2.gat,247,51,3	script	�D���y�����b�N#air2	873,{
	cutin "fly_felrock2.bmp", 2;
	mes "[�D���y�����b�N]";
	mes "�D���r�炷�s�͂����̒B�߁I";
	mes "���̕���ő����Ă�낤!!";
	close2;
	cutin "fly_felrock2.bmp", 255;
	end;
}

1@air2.gat,243,58,3	script	�D���y�����b�N#2air2	873,{
	cutin "fly_felrock2.bmp", 2;
	mes "[�D���y�����b�N]";
	mes "���̑D���c�c!!";
	mes "��邹��!!!!";
	close2;
	cutin "fly_felrock2.bmp", 255;
	end;
}

1@air2.gat,239,58,5	script	�P�C�I�X#air2	683,{
	if(HEROAIR_1QUE >= 4 && HEROAIR_1QUE <= 6) {
		if(checkquest(120200)&8) {
			mes "�]�D���͐��C�����߂����悤��";
			mes "�@�P�C�I�X�Ƙb�����Ă���]";
			next;
			if(select("����}��","�b�𕷂�") == 1) {
				mes "�]����}�����Ƃɂ����]";
				close2;
				set '@skip,1;
			}
		}
		if('@skip == 0) {
			cutin "fly_felrock2.bmp", 2;
			mes "[�D���y�����b�N]";
			mes "�N�b�A���ʂɌ����߂��Ă��܂����B";
			mes "�������ŃX�J�C�O����������";
			mes "���Ȃ�������悤�����ǂȁB";
			mes "�t�t�t�t�t�t�c�c�B";
			next;
			cutin "h_iris01.bmp", 2;
			mes "[�A�C���X]";
			mes "�������!!";
			mes "��̂͑D���̂�����";
			mes "�D����ꂽ�̂�!?";
			next;
			cutin "h_arcana02.bmp", 2;
			mes "[�A���J�i]";
			mes "���̑���ɑD���󂵂Ă����";
			mes "������܂����B";
			mes "�ӂށA�܂��c�c";
			mes "���̂��炢�ł����ł��傤�B";
			next;
			mes "[�A���J�i]";
			mes "����ł́A�������͂��̕ӂŁB";
			next;
			cutin "h_guardian1.bmp", 1;
			mes "[���N�V���~�[]";
			mes "����c�c�B";
			mes "�˂��A�o�T���B";
			mes "���̐l�����A";
			mes "�P������݂����ł����H";
			next;
			mes "[�o�T��]";
			mes "�Ӂ[��B";
			mes "�z�����Ǝ������̎��͂�";
			mes "�C���t�����悤��!!";
			mes "���ققق�!!";
			next;
			mes "[�V���@]";
			mes "���ꂶ�Ⴀ�c�c";
			mes "�Ō�̕����藠�����Ă�!!";
			next;
			cutin "fly_felrock2.bmp", 255;
			mes "�]�V���b�I�@�J�J�J�J�b�I";
			mes "�@";
			mes "�@�V���@�̓����������藠����";
			mes "�@�t�F�������̋���������A";
			mes "�@���󂳂���!!�]";
			next;
			misceffect 183, getmdnpcname("�X�J�C�O��������#1air2");
			misceffect 183, getmdnpcname("�X�J�C�O��������#2air2");
			misceffect 183, getmdnpcname("�X�J�C�O��������#3air2");
			cutin "fenrir_b.bmp", 2;
			mes "[�t�F������]";
			mes "�c�c!!";
			next;
			mes "[�t�F������]";
			mes "�����c�c�I�@������b!!";
			mes "���Ə����Ȃ̂Ɏ肪�c�c";
			mes "�͂��Ȃ��c�c!!";
			next;
			mes "[�t�F������]";
			mes "�c�c�����ŏI����Ă��܂��́H";
			mes "���̎��̂悤�Ɂc�c";
			mes "�܂��͂��Ȃ��ꏊ��";
			mes "�����Ă��܂��́c�c�H";
			mes "�c�P�C�I�X�c�c�B";
			next;
			cutin "ep14_roki02.bmp", 2;
			mes "[���L]";
			mes "�c�c���b���Ă���B";
			next;
			cutin "ep14_roki02.bmp", 255;
			mes "�]���ꂪ����A";
			mes "�@�󒆂ɓ����o���ꂽ�t�F�������̎��";
			mes "�@���L�����񂾁]";
			next;
			cutin "fenrir_b.bmp", 2;
			mes "[�t�F������]";
			mes "���c�c�L�c�c�H";
			next;
			cutin "ep14_roki02.bmp", 2;
			mes "[���L]";
			mes "�������Ă���B�����A�����o��B";
			next;
			cutin "fly_felrock2.bmp", 255;
			mes "[��s�D�斱��]";
			mes "���ɂ��̑D�͒ė����܂��I";
			mes "�K���A�ė��܂ŁA�P�\������܂��̂�";
			mes "���������ĒE�o���Ă�������!!";
			next;
			cutin "fly_felrock2.bmp", 2;
			mes "[�D���y�����b�N]";
			mes "������I�@�o���Ă��!!";
			mes "�݂�ȁA�~�����ɓ��悷��񂾁I";
			mes "��q���ŗD�悾!!";
			mes "���悪���������~������";
			mes "�D����o��������!!";
			next;
			cutin "fly_felrock2.bmp", 255;
			mes "[��s�D�斱��]";
			mes "�͂��A�D��!!";
			mes "������q�݂̂Ȃ���A������ł��I";
			mes "�~�����ֈړ����Ă��������I";
			next;
			cutin "h_chaos01.bmp", 2;
			mes "[�P�C�I�X]";
			mes "���ꂪ�{����";
			mes "��肩�������D���ă��c���H";
			mes "�����X�^�[�͉����������Ƃ�����I";
			mes "�݂�ȍQ�Ă��A";
			mes "���������Ĉړ����Ă����I";
			next;
			cutin "h_guardian1.bmp", 1;
			mes "[�o�T��]";
			mes "���������X�J�C�O����������";
			mes "��������Ă���ꍇ����Ȃ��ȁB";
			next;
			mes "[�o�T��]";
			mes "����ɑ傫�Ȉ��̔g����������B";
			mes "��͂�����ɔC���鎖�ɂ��悤�B";
			mes "�݂�ȍs�����I";
			next;
			mes "[���N�V���~�[���V���@]";
			mes "����!!�@�����W���[��s�`��!!";
			next;
			cutin "h_iris01.bmp", 2;
			mes "[�A�C���X]";
			mes "����c�c�������!!";
			mes "���񂽂����D������ȏ�Ԃɂ���";
			mes "������C�Ȃ�!?";
			next;
			mes "[�A�C���X]";
			mes "���ɂǂ����ŉ������{�C��";
			mes "�����Ȃ�����o�債�Ƃ��Ȃ�����!?";
			mes "���̓c�Ɏ҂̉p�Y�C����!!";
			next;
			cutin "h_guardian3.bmp", 1;
			mes "[�K�[�f�B�A���q���C���Y]";
			mes "�c�c�c�Ɏ҂̉p�Y�C���c�c�H";
			next;
			mes "[�K�[�f�B�A���q���C���Y]";
			mes "���`�̓������Ȃ��҂Ɂc�c";
			mes "�������͐��`�̐R����";
			mes "�����Ȃ���΁A�����Ȃ��悤�ˁB";
			next;
			mes "[�K�[�f�B�A���q���C���Y]";
			mes "���}��!!�@���炦�����藠��!!";
			next;
			cutin "h_iris01.bmp", 255;
			mes "�]�V���b�I�@�J�J�J�J�b�I";
			mes "�@";
			mes "�@�K�[�f�B�A���q���C���Y��";
			mes "�@�����������藠���̓A�C���X��";
			mes "�@�������󂳂���!!�]";
			next;
			misceffect 183, getmdnpcname("�X�J�C�O��������#1air2");
			misceffect 183, getmdnpcname("�X�J�C�O��������#2air2");
			misceffect 183, getmdnpcname("�X�J�C�O��������#3air2");
			cutin "h_iris01.bmp", 2;
			mes "[�A�C���X]";
			mes "���Ⴀ��������!!";
			next;
			cutin "h_guardian1.bmp", 1;
			mes "[�K�[�f�B�A���q���C���Y]";
			mes "���͂͂͂͂͂͂͂͂�!!";
			mes "���܂��݂�!!�@�s����!!";
			next;
			cutin "h_iris01.bmp", 2;
			mes "[�A�C���X]";
			mes "���`���`�`��`!!";
			mes "�Ȃ�ă��c��Ȃ̂��I";
			next;
			cutin "h_chaos02.bmp", 2;
			mes "[�P�C�I�X]";
			mes "�A�C���X!!�@�������ɗ���!!";
			mes "����������Еt���āA";
			mes "���������E�o���邼�I";
			next;
			cutin "h_iris02.bmp", 2;
			mes "[�A�C���X]";
			mes "�m���A������������";
			mes "�u�������v���厖�Ȃ񂾂�ˁI";
			next;
			cutin "h_chaos02.bmp", 2;
			mes "[�P�C�I�X]";
			mes "�c�c���َq�H";
			mes "���͕ʂɕ��͋󂢂ĂȂ����H";
			next;
			cutin "h_iris02.bmp", 2;
			mes "[�A�C���X]";
			mes "���َq����Ȃ��āu�������v�I";
			mes "�������鎞�ɑ厖�ȍs����";
			mes "�����Ȃ��A�����Ȃ��A����ׂ�Ȃ��I";
			mes "�R�̓���������������t����B";
			mes "���������ɋ����Ȃ������H";
			next;
			cutin "h_chaos02.bmp", 2;
			mes "[�P�C�I�X]";
			mes "����Ȃ�c�c";
			mes "�����Ȃ��A�͂���Ȃ��A����ׂ�Ȃ�";
			mes "�ŁA�u���͂��v����Ȃ��������H";
			next;
			cutin "fly_felrock2.bmp", 2;
			mes "[�D���y�����b�N]";
			mes "���O�Ȃ�Ăǂ���ł��ǂ��I";
			mes "������Ȃ�����b���ɂ�����Ȃ�";
			mes "�E�o����񂾁I";
			next;
			cutin "h_chaos02.bmp", 2;
			mes "[�P�C�I�X]";
			mes "��A���������c�c�B";
			next;
		}
		if(HEROAIR_1QUE == 5) {
			cutin "fly_felrock2.bmp", 2;
			mes "[�D���y�����b�N]";
			mes "�����̌N�͂�����Ƒ҂��Ă���B";
			mes "�N�ɂ͏������Ă��܂�������ȁB";
			mes "�S�΂��肾����������Ă���B";
			next;
			mes "[�D���y�����b�N]";
			mes "�������p�ӂ����̂����A";
			mes "�ǂꂪ�������ˁH";
			mes "��I��ł���B";
			while(1) {
				next;
				switch(select("��s�D�X�[�c","��s�D�}���g","��s�D�u�[�c")) {
				case 1:
					cutin "fly_felrock2.bmp", 255;
					mes "^0000FF��s�D�X�[�c^000000";
					mes "Mdef + 10";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "MaxHP + 500";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "[��s�D�u�[�c]�A";
					mes "[��s�D�}���g]��";
					mes "���ɑ������A�ǉ���";
					mes "Def + 200 , Mdef + 20";
					mes "MaxHP + 500 , MaxSP + 50";
					mes "[��s�D�X�[�c]�A";
					mes "[��s�D�u�[�c]�A";
					mes "[��s�D�}���g]��";
					mes "���B�l���v��15�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1000";
					mes "MaxSP + 30";
					mes "���B�l���v��20�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1500";
					mes "MaxSP + 100";
					mes "���B�l���v��25�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 2000";
					mes "MaxSP + 200";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "���B�s��";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[��s�D�X�[�c]��";
					mes "NPC�u���y�ٖD�t�v�ł̂�";
					mes "���B���\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[��s�D�X�[�c]��";
					mes "NPC���p�E�q�ɂւ�";
					mes "�ړ����\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "�n�� : ^777777�Z^000000";
					mes "�h�� : ^7777770^000000";
					mes "�d�� : ^777777100^000000";
					mes "�v�����x�� : ^77777750^000000";
					mes "���� : ^777777�S�Ă̐E��^000000";
					set '@gain,15159;
					break;
				case 2:
					cutin "fly_felrock2.bmp", 255;
					mes "^0000FF��s�D�}���g^000000";
					mes "MaxHP + 300";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "[��s�D�X�[�c]�A";
					mes "[��s�D�u�[�c]��";
					mes "���ɑ������A�ǉ���";
					mes "Def + 200 , Mdef + 20";
					mes "MaxHP + 500 , MaxSP + 50";
					mes "[��s�D�X�[�c]�A";
					mes "[��s�D�u�[�c]�A";
					mes "[��s�D�}���g]��";
					mes "���B�l���v��15�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1000";
					mes "MaxSP + 30";
					mes "���B�l���v��20�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1500";
					mes "MaxSP + 100";
					mes "���B�l���v��25�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 2000";
					mes "MaxSP + 200";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "���B�s��";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[��s�D�}���g]��";
					mes "NPC�u���y�ٖD�t�v�ł̂�";
					mes "���B���\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[��s�D�}���g]��";
					mes "NPC���p�E�q�ɂւ�";
					mes "�ړ����\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "�n�� : ^777777���ɂ����镨^000000";
					mes "�h�� : ^777777100^000000";
					mes "�d�� : ^777777100^000000";
					mes "�v�����x�� : ^77777750^000000";
					mes "���� : ^777777�S�Ă̐E��^000000";
					set '@gain,20792;
					break;
				case 3:
					cutin "fly_felrock2.bmp", 255;
					mes "^0000FF��s�D�u�[�c^000000";
					mes "MaxHP + 200 , MaxSP + 20";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "[��s�D�X�[�c]�A";
					mes "[��s�D�}���g]��";
					mes "���ɑ������A�ǉ���";
					mes "Def + 200 , Mdef + 20";
					mes "MaxHP + 500 , MaxSP + 50";
					mes "[��s�D�X�[�c]�A";
					mes "[��s�D�u�[�c]�A";
					mes "[��s�D�}���g]��";
					mes "���B�l���v��15�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1000";
					mes "MaxSP + 30";
					mes "���B�l���v��20�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1500";
					mes "MaxSP + 100";
					mes "���B�l���v��25�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 2000";
					mes "MaxSP + 200";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "���B�s��";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[��s�D�u�[�c]��";
					mes "NPC�u���y�ٖD�t�v�ł̂�";
					mes "���B���\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[��s�D�u�[�c]��";
					mes "NPC���p�E�q�ɂւ�";
					mes "�ړ����\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "�n�� : ^777777�C^000000";
					mes "�h�� : ^7777770^000000";
					mes "�d�� : ^777777100^000000";
					mes "�v�����x�� : ^77777750^000000";
					mes "���� : ^777777�S�Ă̐E��^000000";
					set '@gain,22087;
					break;
				}
				next;
				cutin "fly_felrock2.bmp", 2;
				mes "[�D���y�����b�N]";
				mes "����ł������H";
				next;
				if(select("���̃A�C�e�������Ă݂�","����ɂ���") == 1) {
					mes "[�D���y�����b�N]";
					mes "�ǂ�ɂ���H";
					continue;
				}
				break;
			}
			mes "[�D���y�����b�N]";
			mes "�킩�����B";
			mes "����ł͂����n�����B";
			next;
			cutin "h_chaos02.bmp", 2;
			mes "[�P�C�I�X]";
			mes "�b�͍ς񂾂��H";
			mes "�D�̍��x���������Ă��Ă���B";
			mes "���������E�o���悤�I";
			next;
		}
		else if(HEROAIR_1QUE == 6) {
			cutin "fly_felrock2.bmp", 2;
			mes "[�D���y�����b�N]";
			mes "�����̌N�͂�����Ƒ҂��Ă���B";
			mes "�N�ɂ͏������Ă��܂�������ȁB";
			mes "�S�΂��肾����������Ă���B";
			next;
			mes "[�D���y�����b�N]";
			mes "�������p�ӂ����̂����A";
			mes "�ǂꂪ�������ˁH";
			mes "��I��ł���B";
			while(1) {
				next;
				switch(select("�y�����b�N�̃X�[�c","�y�����b�N�̃}���g","�y�����b�N�̃u�[�c")) {
				case 1:
					cutin "fly_felrock2.bmp", 255;
					mes "^ff0000�y�����b�N�̃X�[�c^000000";
					mes "Mdef + 10";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "MaxHP + 500";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "[�y�����b�N�̃u�[�c]�A";
					mes "[�y�����b�N�̃}���g]��";
					mes "���ɑ������A�ǉ���";
					mes "Def + 200 , Mdef + 20";
					mes "MaxHP + 500 , MaxSP + 50";
					mes "[�y�����b�N�̃X�[�c]�A";
					mes "[�y�����b�N�̃u�[�c]�A";
					mes "[�y�����b�N�̃}���g]��";
					mes "���B�l���v��15�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1000";
					mes "MaxSP + 30";
					mes "���B�l���v��20�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1500";
					mes "MaxSP + 100";
					mes "���B�l���v��25�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 2000";
					mes "MaxSP + 200";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "���B�s��";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[�y�����b�N�̃X�[�c]��";
					mes "NPC�u���y�ٖD�t�v�ł̂�";
					mes "���B���\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[�y�����b�N�̃X�[�c]��";
					mes "NPC���p�E�q�ɂւ�";
					mes "�ړ����\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "�n�� : ^777777�Z^000000";
					mes "�h�� : ^7777770^000000";
					mes "�d�� : ^777777100^000000";
					mes "�v�����x�� : ^77777750^000000";
					mes "���� : ^777777�S�Ă̐E��^000000";
					set '@gain,15158;
					break;
				case 2:
					cutin "fly_felrock2.bmp", 255;
					mes "^ff0000�y�����b�N�̃}���g^000000";
					mes "MaxHP + 300";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "[�y�����b�N�̃X�[�c]�A";
					mes "[�y�����b�N�̃u�[�c]��";
					mes "���ɑ������A�ǉ���";
					mes "Def + 200 , Mdef + 20";
					mes "MaxHP + 500 , MaxSP + 50";
					mes "[�y�����b�N�̃X�[�c]�A";
					mes "[�y�����b�N�̃u�[�c]�A";
					mes "[�y�����b�N�̃}���g]��";
					mes "���B�l���v��15�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1000";
					mes "MaxSP + 30";
					mes "���B�l���v��20�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1500";
					mes "MaxSP + 100";
					mes "���B�l���v��25�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 2000";
					mes "MaxSP + 200";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "���B�s��";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[�y�����b�N�̃}���g]��";
					mes "NPC�u���y�ٖD�t�v�ł̂�";
					mes "���B���\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[�y�����b�N�̃}���g]��";
					mes "NPC���p�E�q�ɂւ�";
					mes "�ړ����\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "�n�� : ^777777���ɂ����镨^000000";
					mes "�h�� : ^777777100^000000";
					mes "�d�� : ^777777100^000000";
					mes "�v�����x�� : ^77777750^000000";
					mes "���� : ^777777�S�Ă̐E��^000000";
					set '@gain,20791;
					break;
				case 3:
					cutin "fly_felrock2.bmp", 255;
					mes "^ff0000�y�����b�N�̃u�[�c^000000";
					mes "MaxHP + 200 , MaxSP + 20";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "[�y�����b�N�̃X�[�c]�A";
					mes "[�y�����b�N�̃}���g]��";
					mes "���ɑ������A�ǉ���";
					mes "Def + 200 , Mdef + 20";
					mes "MaxHP + 500 , MaxSP + 50";
					mes "[�y�����b�N�̃X�[�c]�A";
					mes "[�y�����b�N�̃u�[�c]�A";
					mes "[�y�����b�N�̃}���g]��";
					mes "���B�l���v��15�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1000";
					mes "MaxSP + 30";
					mes "���B�l���v��20�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 1500";
					mes "MaxSP + 100";
					mes "���B�l���v��25�ȏ�̎��A";
					mes "�ǉ���";
					mes "MaxHP + 2000";
					mes "MaxSP + 200";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "���B�s��";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[�y�����b�N�̃u�[�c]��";
					mes "NPC�u���y�ٖD�t�v�ł̂�";
					mes "���B���\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "^ff0000[�y�����b�N�̃u�[�c]��";
					mes "NPC���p�E�q�ɂւ�";
					mes "�ړ����\�ł��B^000000";
					mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
					mes "�n�� : ^777777�C^000000";
					mes "�h�� : ^7777770^000000";
					mes "�d�� : ^777777100^000000";
					mes "�v�����x�� : ^77777750^000000";
					mes "���� : ^777777�S�Ă̐E��^000000";
					set '@gain,22086;
					break;
				}
				next;
				cutin "fly_felrock2.bmp", 2;
				mes "[�D���y�����b�N]";
				mes "����ł������H";
				next;
				if(select("���̃A�C�e�������Ă݂�","����ɂ���") == 1) {
					mes "[�D���y�����b�N]";
					mes "�ǂ�ɂ���H";
					continue;
				}
				break;
			}
			mes "[�D���y�����b�N]";
			mes "�킩�����B";
			mes "����ł͂����n�����B";
			next;
			cutin "h_chaos02.bmp", 2;
			mes "[�P�C�I�X]";
			mes "�b�͍ς񂾂��H";
			mes "�D�̍��x���������Ă��Ă���B";
			mes "���������E�o���悤�I";
			next;
		}
		cutin "h_chaos02.bmp", 2;
		mes "[�P�C�I�X]";
		mes "���񂽂͐�ɒE�o���Ă���I";
		mes "��������������Еt������";
		mes "�����E�o����I";
		hideoffnpc getmdnpcname("warp5a#air2");
		if(HEROAIR_1QUE == 5)
			set '@num,5;
		else if(HEROAIR_1QUE == 6)
			set '@num,10;
		else
			set '@num,3;
		for(set '@i,0;'@i<'@num;set '@i,'@i+1)
			getexp 100000,0,1;
		for(set '@i,0;'@i<'@num;set '@i,'@i+1)
			getexp 0,50000,0;
		if('@gain)
			getitem '@gain, 1;
		set HEROAIR_1QUE,7;
		if(!checkquest(120200)) {
			setquest 120200;
			compquest 120200;
		}
		close2;
		cutin "h_chaos02.bmp", 255;
		end;
	}
	cutin "h_chaos02.bmp", 2;
	mes "[�P�C�I�X]";
	mes "���̑D�͊댯��!!";
	mes "���񂽂������E�o���Ă���I";
	close2;
	cutin "h_chaos01.bmp", 255;
	end;
}

1@air2.gat,244,73,0	script	warp5a#air2	45,1,1,{
	mes "�]�������玞�̒ʘH�֖߂ꂻ�����B";
	mes "�@���̒ʘH�֖߂�܂����H�]";
	next;
	if(select("�߂�Ȃ�","���̒ʘH�֖߂�") == 1) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	mes "�]���̒ʘH�֖߂�܂��]";
	close2;
	warp "dali02.gat",137,82;
	end;
}
