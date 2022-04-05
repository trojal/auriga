//= Auriga Script ==============================================================
// Ragnarok Online Eclage Home Tree Script	by refis
//==============================================================================

ecl_hub01.gat,132,12,3	script	�R�Q�d#tl01	435,{
	if(getonlinepartymember() != 1) {
		mes "-! ���� !-";
		mes "�Y���̃N�G�X�g��^ff00001�l�p��";
		mes "�������A���_���W����^000000�ł�";
		mes "�i�s�ɂȂ�܂��B";
		mes "�p�[�e�B�[�𐶐����A���[�_�[�ȊO��";
		mes "�p�[�e�B�[�����o�[�̓p�[�e�B�[����";
		mes "�E�ނ��Ă��������B";
		close;
	}
	mes "[�V�i�C��]";
	mes "�������I�[�u���Ƃ炷���߂�";
	mes "�Ɩ����ݒu���ꂽ�ꏊ�ł��B";
	mes "�����͂�낵���ł����H";
	next;
	if(select("����J���Ă��炤","��߂Ă���") == 2) {
		mes "[�V�i�C��]";
		mes "��������������";
		mes "�܂��b�������Ă��������B";
		close;
	}
	if(getonlinepartymember() != 1) {
		mes "[�V�i�C��]";
		mes "�傪�J���ɂ͎��Ԃ�������܂��̂�";
		mes "���΂炭���҂����������B";
		mes "�܂��A���͌x������������Ă��܂��B";
		mes "������̏ꍇ�ɔ���";
		mes "���炩���ߓ��ӂ����肢���܂��B";
		close;
	}
	mdcreate "home_tree";
	mes "[�V�i�C��]";
	mes "���ɋ��镺�m�B��";
	mes "�x���S�������Ȃ��Ă��܂��B";
	mes "���܂�h�����Ȃ��悤�ɂ��Ă��������B";
	close;
}

ecl_hub01.gat,130,15,0	script	�ł������ꂽ��	844,{
	mes "�]�L��̓V�䗠�֌q����傾�B";
	mes "�@�I�[�u������������邽�߂�";
	mes "�@�Ɩ����ݒu���ꂽ�ꏊ�ł�����]";
	next;
	if(select("�����Ă݂�","��߂Ă���") == 2) {
		mes "�]��̒��ɓ���̂�";
		mes "�@��߂Ă������Ƃɂ����]";
		close;
	}
	if(getonlinepartymember() != 1) {
		mes "-! ���� !-";
		mes "�Y���̃N�G�X�g��^ff00001�l�p��";
		mes "�������A���_���W����^000000�ł�";
		mes "�i�s�ɂȂ�܂��B";
		mes "�p�[�e�B�[�𐶐����A���[�_�[�ȊO��";
		mes "�p�[�e�B�[�����o�[�̓p�[�e�B�[����";
		mes "�E�ނ��Ă��������B";
		close;
	}
	switch(mdenter("home_tree")) {
	case 0:	// �G���[�Ȃ�
		announce strcharinfo(1)+ "�p�[�e�B�[�̃��[�_�[" +strcharinfo(0)+ "�l��home_tree�ɓ��ꂵ�܂��B",0x9,0x00FF99;
		donpcevent getmdnpcname("#HomeTreeEvent") +"::OnStart";
		//warp "1@ecl.gat",60,50;
		end;
	default:	// ���̑��G���[
		mes "[�V�i�C��]";
		mes "����J���ɂ͏���";
		mes "���Ԃ������肻���ł��B";
		mes "���@�I���u���������{����Ă��āc�c";
		mes "�����ɓ��낤�Ƃ��Ȃ��ł��������B";
		close;
	}
}

1@ecl.gat,51,64,1	script	����������#HomeTree1	2375,{}
1@ecl.gat,43,67,7	script	����������#HomeTree2	2375,{}
1@ecl.gat,55,80,3	script	����������#HomeTree3	2375,{}
1@ecl.gat,60,75,3	script	����������#HomeTree4	2375,{}

1@ecl.gat,57,65,0	script	#HomeTreeEvent	139,5,5,{
	mes "�]�E���i�ȍL�������B";
	mes "�@�����ɂ���~�`�̑��u�����";
	mes "�@�����R��Ă���]";
	next;
	mes "[����������]";
	mes "�O�����������c�c";
	next;
	mes "�]���̕s���̘A����";
	mes "�@�Ј��I�ɔ����Ă���B";
	mes "�@�ނ�͈�u�Q�Ă��悤�Ɍ�������";
	mes "�@�r�t���X�g�̈ӎu���ʂ���ɂ�";
	mes "�@������炸�ӎv�̑a�ʂ��ł��Ȃ��]";
	next;
	mes "[����������]";
	mes "�O�����c�c�O���@!!";
	next;
	mes "�]���ɂ��P���Ă������ȗl�q���B";
	mes "�@�ނ�Ƃ̐킢�͔������Ȃ��]";
	close2;
	hideonnpc getmdnpcname("����������#HomeTree1");
	hideonnpc getmdnpcname("����������#HomeTree2");
	hideonnpc getmdnpcname("����������#HomeTree3");
	hideonnpc getmdnpcname("����������#HomeTree4");
	monster getmdmapname("1@ecl.gat"),51,64,"����������",2375,1,"#HomeTreeEvent::OnKilled";
	monster getmdmapname("1@ecl.gat"),43,67,"����������",2375,1,"#HomeTreeEvent::OnKilled";
	monster getmdmapname("1@ecl.gat"),55,80,"����������",2375,1,"#HomeTreeEvent::OnKilled";
	monster getmdmapname("1@ecl.gat"),60,75,"����������",2375,1,"#HomeTreeEvent::OnKilled";
	hideonnpc getmdnpcname("#HomeTreeEvent");
	end;
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("�V�i�C��#HomeTree");
	hideonnpc getmdnpcname("����������#HomeTree5");
	hideonnpc getmdnpcname("����������#HomeTree6");
	hideonnpc getmdnpcname("����������#HomeTree7");
	hideonnpc getmdnpcname("����������#HomeTree8");
	hideonnpc getmdnpcname("#HomeTreeSNDMaster");
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@ecl.gat"),getmdnpcname("#HomeTreeEvent") +"::OnKilled");
	if('@count <= 0) {
		hideoffnpc getmdnpcname("����������#HomeTree5");
		hideoffnpc getmdnpcname("����������#HomeTree6");
		hideoffnpc getmdnpcname("����������#HomeTree7");
		hideoffnpc getmdnpcname("����������#HomeTree8");
		hideoffnpc getmdnpcname("#HomeTreeSNDMaster");
		donpcevent getmdnpcname("#HomeTreeSND_bc") +"::OnStart";
	}
	end;
}

1@ecl.gat,53,83,0	script	#HomeTreeSNDMaster	139,10,10,{
	mes "�]�Ăъ�ȑ��݂����ꂽ��";
	mes "�@��͂茾�t���ʂ��Ȃ��B";
	mes "�@���̒��̈�C�͎��ӂ�����";
	mes "�@�|��Ă��钇�Ԃ��݂�";
	mes "�@�������{���Ă���]";
	next;
	mes "�]���̎p�͂܂��";
	mes "�@�����N�̌��g�̂悤���B";
	mes "�@�I�[�u��_���Ă���̂�";
	mes "�@���������N�Ȃ̂��낤��";
	mes "�@����Ƃ����R�̈�v�Ȃ̂��]";
	next;
	mes "[�����̎艺]";
	mes "�O�������c�c";
	mes "�O���@!";
	next;
	mes "�]�퓬������邱�Ƃ��ł��Ȃ��I";
	mes "�@�z��͎����E������̂悤���]";
	close2;
	hideonnpc getmdnpcname("����������#HomeTree5");
	hideonnpc getmdnpcname("����������#HomeTree6");
	hideonnpc getmdnpcname("����������#HomeTree7");
	hideonnpc getmdnpcname("����������#HomeTree8");
	monster getmdmapname("1@ecl.gat"),42,80,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	monster getmdmapname("1@ecl.gat"),48,86,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	monster getmdmapname("1@ecl.gat"),59,82,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	monster getmdmapname("1@ecl.gat"),56,88,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	monster getmdmapname("1@ecl.gat"),39,72,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	monster getmdmapname("1@ecl.gat"),42,69,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	monster getmdmapname("1@ecl.gat"),47,64,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	monster getmdmapname("1@ecl.gat"),50,60,"�����̎艺",2375,1,getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled";
	hideonnpc getmdnpcname("#HomeTreeSNDMaster");
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@ecl.gat"),getmdnpcname("#HomeTreeSNDMaster") +"::OnKilled");
	if('@count <= 0) {
		announce "�V�i�C�� : �܂�ŁA���B��҂������Ă����݂����ł��ˁB",0x9,0xffff00;
		hideoffnpc getmdnpcname("�V�i�C��#HomeTree");
	}
	end;
}

1@ecl.gat,53,84,0	script	#HomeTreeSND_bc	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�x�� : �Ɩ����Ɉُ픭���A�ُ픭���B",0x9,0xffff00;
	end;
OnTimer4000:
	stopnpctimer;
	announce "���������� : �O���������c�c�O���@!!",0x9,0xffff00;
	end;
}

1@ecl.gat,42,80,5	script	����������#HomeTree5	2376,{}
1@ecl.gat,48,86,5	script	����������#HomeTree6	2376,{}
1@ecl.gat,58,82,3	script	����������#HomeTree7	2376,{}
1@ecl.gat,56,88,3	script	����������#HomeTree8	2376,{}

1@ecl.gat,58,69,3	script	�V�i�C��#HomeTree	435,{
	mes "[�V�i�C��]";
	mes "����͉��Ƃ������Ƃł��傤�I";
	mes "�}�����E�W�����̑����������̕��m�܂�";
	mes "��l�c�炸�|���Ă��܂��Ȃ�āc�c�B";
	next;
	menu "���c�c�H",-,"����������͉̂������I",-;
	mes "[�V�i�C��]";
	mes "�ӂӂӁc�c";
	mes "�C���͂������ł����H";
	mes "���Ȃ��̖�ڂ͂����܂łł��B";
	next;
	mes "[�V�i�C��]";
	mes "���Ȃ��͕��m���P�������؂�҂Ƃ���";
	mes "�߂ɖ����ł��傤�B";
	mes "����ł͂��悤�Ȃ�I";
	misceffect 55;
	next;
	mes "["+strcharinfo(0)+"]";
	mes "����ȁc�c�I";
	percentheal -99,0;
	misceffect 90,"";
	sc_start3 SC_BLIND,0,0,0,0,60000,10;
	close2;
	warp getmdmapname("1@ecl.gat"),146,95;
	end;
}

1@ecl.gat,148,97,3	script	�G�C���@���g	618,{
	cutin "avant01",1;
	mes "[�G�C���@���g]";
	mes "����A�ǂȂ����ȁc�c�H";
	mes "�@";
	mes "�N�͑��q�̗F�l�ł͂Ȃ����I";
	mes "����ȂƂ���ŉ�Ȃ��";
	mes "�ʔ�������������̂��ȁB";
	sc_end SC_BLIND;
	next;
	mes "[�G�C���@���g]";
	mes "�����������B";
	mes "��قǔ����Ȗ��͂̋�������������";
	mes "���̒���A�N�������֕��荞�܂ꂽ�B";
	next;
	if(select("���ׂĂ��Ȃ��̂������I","�V�i�C�����c�c") == 1) {
		mes "[�G�C���@���g]";
		mes "���������Ȃ����B";
		mes "�������������̂��킩��Ȃ��B";
		mes "�Z���̌����A�N���]���Ƃ������t��";
		mes "�m���Ă��邩�H";
		next;
	}
	mes "[�G�C���@���g]";
	mes "�ق��c�c�B";
	mes "�V�i�C�����I�[�u��_�����B";
	mes "����́c�c�H";
	next;
	mes "[�G�C���@���g]";
	mes "�ӂӂӂӁc�c�͂͂͂͂��͂͂�";
	mes "����͂���́A�������ꂽ�H";
	mes "���̎��A�G�C���@���g���H";
	mes "�͂͂́I";
	cutin "avant02",1;
	next;
	menu "�ǂ��������ƁH",-;
	mes "[�G�C���@���g]";
	mes "�I�[�u�̖��͂ɂ��Ă̌�����";
	mes "������񎩔��I�ɍs���Ă����B";
	mes "�������A�V�i�C���͖{���ɔS�苭��";
	mes "�ޏ��̖]�ޓ��ւ�";
	mes "���𓱂��Ă�������B";
	cutin "avant01",1;
	next;
	mes "[�G�C���@���g]";
	mes "�ŏ��̓I�[�u�������������";
	mes "�y���������n�߂��B";
	next;
	mes "[�G�C���@���g]";
	mes "���͂͂ǂꂾ���W�܂��Ă���̂��B";
	mes "�����������͂̌b�݂��󂯂�̂�";
	mes "�ǂ�Ȍ������낤�H";
	mes "�m�肽���Ȃ����H";
	mes "�ƌ����Ȃ���c�c�B";
	next;
	mes "[�G�C���@���g]";
	mes "���t�B�l�Ȃ�܂��";
	mes "��C�␅�Ɠ����悤��";
	mes "������O�ɋ��󂵂Ă���";
	mes "�I�[�u����̖��͂�";
	mes "��������l����҂�";
	mes "���̎҂����߂Ă�������B";
	next;
	mes "[�G�C���@���g]";
	mes "�����c�c�V�i�C���B";
	mes "�ޏ��͎��̍D��S���h���������B";
	next;
	mes "[�G�C���@���g]";
	mes "��C�Ɛ����ӎ����Ȃ������҂�";
	mes "�h����^�������ĔF��������B";
	mes "�����ĒT��������I";
	mes "�ʔ����Ƃ͎v��Ȃ����ˁH";
	cutin "avant02",1;
	next;
	mes "[�G�C���@���g]";
	mes "�́c�c�͂͂́c�c";
	mes "�c�c�z�ɗ��p���ꂽ���Ƃ�";
	mes "��������Ƃ���������";
	mes "�ꑰ�ɑ傫�ȍ߂�����Ă��܂����B";
	mes "�Ƃ񂾘��S���掄�́B";
	mes "���ɕ����������I";
	next;
	menu "���Ȃ��ɗǐS���������́H",-;
	mes "[�G�C���@���g]";
	mes "�N�͎��̂��Ƃ������Ǝv���Ă���񂾁H";
	mes "�܂��A���q���玄�̘b�𕷂��Ă���Ȃ�";
	mes "�������Ȃ��b���B";
	cutin "avant01",1;
	next;
	mes "[�G�C���@���g]";
	mes "�c�c�ӂ�B";
	mes "�ʔ����Ȃ��B";
	mes "�N�Ɏ����Ă����������������B";
	next;
	mes "[�G�C���@���g]";
	mes "�c�c";
	mes "�q�������悤���ȁB";
	next;
	cutin "minuel01",4;
	mes "[�~�j���G��]";
	mes strcharinfo(0)+ "�l�B";
	mes "�Ɩ����ōs��ꂽ�\���̔Ɛl�Ɩڂ���";
	mes "�����ŗ��u����Ă��܂������A";
	mes "���Ȃ��̖��߂��ؖ�����l�X��";
	mes "����܂����B";
	next;
	mes "[�~�j���G��]";
	mes "�ǂ��Ȃ邩�͂킩��܂���";
	mes "�������Ȃ����������ƐM���Ă��܂��B";
	mes "�ꉞ�A�����܂��Ђǂ��悤�ł��̂�";
	mes "���Î��Ɉڂ��܂��ˁB";
	next;
	mes "[�~�j���G��]";
	mes "�債�����Ƃ͂Ȃ��͂��ł��B";
	mes "�c�c���Ԃ�B";
	mes "�s���܂��傤�B���ē��������܂��B";
	close2;
	cutin "minuel01",255;
	warp getmdmapname("1@ecl.gat"),146,24;
	end;
}

1@ecl.gat,148,29,3	script	���L	512,{
	mes "[���L]";
	mes "�ׂɂ���ނ��N�Ɍ����������Ƃ�";
	mes "����悤���B";
	mes "�܂��A�ނɐ������Ă���Ȃ����B";
	close;
}

1@ecl.gat,147,30,3	script	�j�[�Y�w�b�O	510,{
	mes "[�j�[�Y�w�b�O]";
	mes "�܂��̓q�V�G����Ƙb���̂�";
	mes "��ł͂���܂��񂩁H";
	close;
}

1@ecl.gat,144,27,5	script	�q�V�G	623,{
	cutin "hisie01",0;
	mes "[�q�V�G]";
	mes "���͑��v���H";
	mes "���̎��A�����������̂�";
	mes "�����ł��邩�H";
	next;
	menu "�����X�^�[�Ɛ����",-;
	cutin "hisie03",0;
	npcskillsupport 28,1672;
	heal 1672,0;
	mes "[�q�V�G]";
	mes "�����X�^�[�H�@�����N�̎艺�H";
	mes "���O��������̂�";
	mes "���t�B�l�̕��m���I";
	mes "��̉����������񂾁H";
	next;
	cutin "hisie01",255;
	mes "[���L]";
	mes strcharinfo(0)+ "��";
	mes "����ȏ�Ԃł͂Ȃ������񂾂낤�B";
	mes "���ꂪ�V�䗠�ɗ����Ă����B";
	mes "�����炭�V�i�C���̎d�Ƃ��B";
	next;
	mes "�]���L�̎�̂Ђ�̏�ɂ�";
	mes "�@���ɏ������ג�������";
	mes "�@������тĂ����]";
	next;
	cutin "hisie03",0;
	npcskillsupport 28,1672;
	heal 1672,0;
	mes "[�q�V�G]";
	mes "�R�Q�d�̃V�i�C���H";
	mes "���̞��ƃV�i�C���ɉ��̊֌W��";
	mes "�����ł����H";
	next;
	menu "���������΁c�c",-;
	cutin "hisie01",255;
	mes "["+strcharinfo(0)+"]";
	mes "�����ɗ���O�A�V�i�C�����o�����";
	mes "�������Ƃ��ɉ����h�����������������B";
	mes "�C�̂������Ǝv���Ă�������";
	mes "�܂����A���̎��ɁH";
	next;
	mes "[�j�[�Y�w�b�O]";
	mes "���Ԃ�A�����ł��傤�B";
	mes "���̞������Ȃ��̗�����";
	mes "�܂点�Ă����͂��ł��B";
	mes "�����Ă��Ȃ��̓��t�B�l�̕��m��";
	mes "�����X�^�[�ƍ��o������ꂽ�c�c";
	mes "�@���ȍ����𒣂�l�ł��ˁB";
	next;
	cutin "hisie03",0;
	npcskillsupport 28,1672;
	heal 1672,0;
	mes "[�q�V�G]";
	mes "�܂�A"+strcharinfo(0)+"��";
	mes "�V�i�C���ɖd���Ă������Ă��Ƃ��H";
	mes "�V�i�C���͌ÎQ�̃��t�B�l���I";
	mes "����Ȃ��Ƃ���킯���c�c�B";
	next;
	cutin "hisie01",255;
	mes "[���L]";
	mes "�V�i�C���̓����N�̎艺�̈�l���B";
	mes "�{�l���C�Â��Ȃ�������";
	mes "�x�z����Ă����񂾂낤�B";
	next;
	mes "[���L]";
	mes "�z�͎����̐g�̂̈ꕔ�𗘗p����";
	mes "����̓��̂𒼐ڑ��삵����";
	mes "���_�Ɋ�����\�͂������Ă���B";
	mes "����͂���𗘗p�����̂��낤�B";
	next;
	if(checkquest(201370)) {	// �����N�G�X�g���C��
		mes "[���L]";
		mes "�Ƃɂ������̎����̔Ɛl��";
		mes "�����ł͂Ȃ��B";
		mes "�����ۏ؂���B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�����ł��ˁB";
		mes strcharinfo(0)+ "�l�����";
		mes "���ӂ������܂���B";
		mes "�ȑO�A�����~���ĉ�����������";
		mes "�������͋C���܂Ƃ��Ă��܂��B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�����C�O�h���V���̎��҂�";
		mes "���ɂ����ĕۏ؂��܂��B";
		mes strcharinfo(0)+ "�l��";
		mes "�����Ă��̂悤�ȕ��ł͂���܂���B";
	}
	else if(checkquest(201410)) {	// �m���[�L�A���[�g
		mes "[���L]";
		mes "�Ƃɂ������̎����̔Ɛl��";
		mes "�����ł͂Ȃ��B";
		mes "�����ۏ؂���B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�����C�O�h���V���̎��҂�";
		mes "���ɂ����ĕۏ؂��܂��B";
		mes strcharinfo(0)+ "�l��";
		mes "�����Ă��̂悤�ȕ��ł͂���܂���B";
	}
	else {	// ���N���A?
		mes "[���L]";
		mes "�����̓V�i�C����";
		mes "㩂ɛƂ߂��Ă��������ŁA";
		mes "�����̈ӎu�Ŏ�����";
		mes "�N�������񂶂�Ȃ��B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�����ł��ˁB";
		mes strcharinfo(0)+ "�l�����";
		mes "���ӂ������܂���B";
		mes "�ȑO�A�����~���ĉ�����������";
		mes "�������͋C���܂Ƃ��Ă��܂��B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�C�O�h���V���̎��҂�";
		mes "���ɂ����ĕۏ؂��܂��B";
		mes strcharinfo(0)+ "�l��";
		mes "���̂悤�ȕ��ł͂���܂���B";
	}
	next;
	cutin "hisie02",0;
	mes "[�q�V�G]";
	mes "�͂��c�c";
	mes "�������A�b�������Ԃ��";
	mes "�傫���Ȃ��Ă��܂����ȁB";
	mes "����Ȃ��ƂɂȂ�Ȃ�āB";
	next;
	menu "�I�[�u�́H",-;
	npcskillsupport 28,1672;
	heal 1672,0;
	mes "[�q�V�G]";
	mes "���j���D��ꂽ�B";
	mes "�����A�I�[�u�̓��j���D��ꂽ����";
	mes "�܂��N���m��Ȃ��񂾁B";
	mes "���̏�ɃJ�������Ȃ��̂�";
	mes "���̂��߂��c�c�B";
	next;
	mes "[�q�V�G]";
	mes "�I�[�u���I�[�u����";
	mes "�N�̂Ƃ���ɂ͑吨�̕��m��";
	mes "����ꂽ�B";
	mes "�K�����S�҂͂��Ȃ���";
	mes "�����̕��m���d�ǂ𕉂��Ă���B";
	mes "���܂�D�܂����󋵂ł͂Ȃ��ȁB";
	next;
	cutin "hisie01",255;
	mes "[���L]";
	mes "�N�����ӔC�𕉂����ɂȂ邾�낤�B";
	mes "�����Ă����炭�����";
	mes strcharinfo(0);
	mes "�N�ɂȂ邾�낤�B";
	next;
	cutin "hisie02",0;
	npcskillsupport 28,1672;
	heal 1672,0;
	mes "[�q�V�G]";
	mes "�c�c�I�[�u�ɑ΂���^����";
	mes "��l���������Ă��ꂽ��";
	mes "�J�������Ȃ����ӔC��Ƃ��";
	mes "���Ȃ����낤�B";
	mes "�����āA�V�i�C����";
	mes "�߂܂��Ȃ���΂Ȃ�Ȃ��B";
	next;
	cutin "hisie01",0;
	mes "[�q�V�G]";
	mes "�K�x�ɉ񕜂�����ړ����邼�B";
	mes "�J�����҂��Ă��邩��ȁB";
	mes "��l�͂ǂ�����H";
	next;
	cutin "hisie01",255;
	mes "[���L]";
	mes "���B�ɋC���g���ȁB";
	mes "���B�̖ړI�͖��������N���B";
	mes "������Ŏ肪����������������ł�";
	mes "�\�����B";
	next;
	cutin "hisie01",0;
	mes "[�q�V�G]";
	mes "�����Ă���Ă��肪�Ƃ��B";
	mes "����ł͐�ɍs���Ă݂��B";
	mes "�����A�s�����B";
	mes strcharinfo(0)+ "�B";
	set ECL_3QUE,30;
	chgquest 7450,7451;
	close2;
	cutin "hisie01",255;
	warp "ecl_in03.gat",57,76;
	end;
}
