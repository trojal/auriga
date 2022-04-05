//= Auriga Script ==============================================================
// Ragnarok Online Dynamic NPC Call Script by refis
//====================================================================

function	script	CallDynamicNPC	{
	set '@dummy,getmapxy('@map$,'@x,'@y,0);
	if(!checkmapflag('@map$,mf_town))	// Town�t���O�ȊO�ł͎g�p�s��
		return;
	set '@class,0;
	setarray '@mapname1$,	"prontera.gat","morocc.gat","payon.gat","comodo.gat","aldebaran.gat",
							"einbroch.gat","lighthalzen.gat","rachel.gat","mid_camp.gat","dicastes01.gat",
							"eclage.gat","louyang.gat","amatsu.gat","moscovia.gat","xmas.gat",
							"dewata.gat","malangdo.gat","lasagna.gat";
	for(set '@i,0;'@i<getarraysize('@mapname1$);set '@i,'@i+1) {
		if('@map$ == '@mapname1$['@i]) {
			set '@class,10145;
			break;
		}
	}
	if(!'@class) {
		setarray '@mapname2$,	"izlude.gat","geffen.gat","alberta.gat","yuno.gat","einbech.gat","hugel.gat",
								"verus04.gat","veins.gat","mora.gat","moro_vol.gat","dali","gonryun",
								"ayothaya","umbala","nif_in","brasilis","malaya","harboro1";
		for(set '@i,0;'@i<getarraysize('@mapname2$);set '@i,'@i+1) {
			if('@map$ == '@mapname2$['@i]) {
				set '@class,10146;
				break;
			}
		}
	}
	if(!'@class) {
		set '@class,10243;
	}
	if('@class == 10145)
		dynamicnpc "�W�����_�m�[�r�X#n01","",0,0,6,'@class;
	else if('@class == 10146)
		dynamicnpc "�W�����_�m�[�r�X#n02","",0,0,6,'@class;
	else
		dynamicnpc "�W�����_�o���T�~�R#do01","",0,0,6,'@class;
	return;
}

-	script	Dynamicnpc#zonda	-1,{
	set '@npcname$,"["+strnpcinfo(1)+"]";
	if(countitem(14902) < 1) {
		cutin "zonda_" +strnpcinfo(2)+ ".bmp", 2;
		mes '@npcname$;
		mes "����ɂ��́A�`���җl�B";
		mes "���̓W�����_�p�X���������̖`���җl��";
		mes "�T�|�[�g���Ă���܂��B";
		mes "�c�O�Ȃ���`���җl�́A�W�����_�p�X��";
		mes "�������Ă����Ȃ��悤�ł��B";
		next;
		mes '@npcname$;
		mes "�W�����_�p�X��";
		mes "�v�����e���Ȃǂ̊e�s�s�ɂ���";
		mes "^FF0000�X�y�V�����A�C�e���̔���^000000�ɂ�";
		mes "���w������������^FF0000�W�����_�p�X�̔�^000000����";
		mes "���o�����Ƃ��ł�����ʂȃA�C�e���ł��B";
		next;
		mes "�y^0000FFInformation^000000�z";
		mes "^006400�W�����_�p�X����������";
		mes "�W�����_�m�[�r�X�ɘb��������ƁA";
		mes "�`���ɖ𗧂T�|�[�g���@��";
		mes "���x�ł��󂯂邱�Ƃ��ł��܂��B";
		mes "�ڂ����͌����T�C�g���������������B^000000";
		next;
		mes '@npcname$;
		mes "�W�����_�p�X���������ł����";
		mes "���ЁA�����|�����������B";
		mes "�`���җl�ɂ���������������悤";
		mes "�s�͂����Ă��������܂��B";
		close2;
		cutin "zonda_n01.bmp", 255;
		end;
	}
	misceffect 7,"";
	misceffect 14,"";
	set '@class,getbaseclass(Class);
	set '@class2,getbaseclass(Class,2);
	if(BaseLevel >= 85 &&
		('@class == CLASS_SM || '@class == CLASS_MC || '@class2 == CLASS_RG || Job == Job_Mage ||
		'@class2 == CLASS_WZ || '@class == CLASS_TK || '@class == CLASS_GS)
	)
		sc_start SC_SpeedPot2,10800000,0;
	else if(BaseLevel >= 40 &&
		Job != Job_Acolyte && '@class2 != CLASS_PR && '@class2 != CLASS_BA && '@class2 != CLASS_DC
	)
		sc_start SC_SpeedPot1,10800000,0;
	else
		sc_start SC_SpeedPot0,10800000,0;
	sc_start SC_MFLEE,10800000,10;
	sc_start SC_MHIT,10800000,10;
	sc_start SC_SUPPORT_HPSP,10800000,20;
	sc_start SC_SUPPORT_SPEED,10800000,0;
	sc_start SC_SUPPORT_EXP,10800000,5;
	percentheal 100,100;
	repairitem;
	cutin "zonda_" +strnpcinfo(2)+ ".bmp", 2;
	mes '@npcname$;
	mes "���Ăтł����A" +(Sex? "����l": "����")+ "�l�B";
	mes "�W�����_�p�X���������̂悤�ł��ˁB";
	mes "�e��T�[�r�X�����p�ӂ��Ă���܂��̂�";
	mes "���D���ȃT�[�r�X��";
	mes "�����R�ɂ��I�т��������B";
	next;
	switch(select("�q�ɃT�[�r�X","�]���T�[�r�X","�����t�^�T�[�r�X","���������T�[�r�X","���p�T�[�r�X","��߂Ă���")) {
	case 1:
		mes '@npcname$;
		mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
		mes "�����p���肪�Ƃ��������܂����B";
		close2;
		openstorage;
		cutin "zonda_n01.bmp", 255;
		end;
	case 2:
		break;
	case 3:
		mes '@npcname$;
		mes "^0000FF�����t�^�T�[�r�X^000000�ł������܂��ˁB";
		mes "�w^FF0000��^000000�x�w^1E90FF��^000000�x�w^800000�n^000000�x�w^006400��^000000�x�̎l������";
		mes "�����ꂩ1�𕐊�ɕt�^�������܂��B";
		next;
		switch(select("^FF0000�Α���^000000��t�^���Ă��炤","^1E90FF������^000000��t�^���Ă��炤","^800000�n����^000000��t�^���Ă��炤","^006400������^000000��t�^���Ă��炤")) {
		case 1:
			set '@eff,255;
			set '@type,SC_FireWeapon;
			break;
		case 2:
			set '@eff,256;
			set '@type,SC_WaterWeapon;
			break;
		case 3:
			set '@eff,258;
			set '@type,SC_GroundWeapon;
			break;
		case 4:
			set '@eff,257;
			set '@type,SC_WindWeapon;
			break;
		}
		misceffect '@eff,"";
		sc_start '@type,10800000,5;
		mes '@npcname$;
		mes "�������ł��傤���A" +(Sex? "����l": "����")+ "�l�B";
		mes "���߂ăT�[�r�X�������p�̍ۂ�";
		mes "���ɂ����|�����������B";
		mes "�����p���肪�Ƃ��������܂����B";
		close2;
		cutin "zonda_n01.bmp", 255;
		end;
	case 4:
		misceffect 389,"";
		misceffect 411,"";
		unequip -2;
		mes '@npcname$;
		mes "�����A�C�e���������������܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		close2;
		cutin "zonda_n01.bmp", 255;
		end;
	case 5:
		mes '@npcname$;
		mes "�������܂�܂����B";
		mes "������ɂȂ肽�����̂�";
		mes "���I�т��������B";
		mes "^FF0000[�C���t�H���[�V����]";
		mes "�]�W�����_�m�[�r�X�A�Ҍ��";
		mes "�@�A�C�e�����p���L�����Z������܂��]^000000";
		close2;
		cutin "zonda_n01.bmp", 255;
		callshop "zonda_callshop",2;
		end;
	case 6:
		mes '@npcname$;
		mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
		mes "���߂ăT�[�r�X�������p�̍ۂ�";
		mes "���ɂ����|�����������B";
		mes "�����p���肪�Ƃ��������܂����B";
		close2;
		cutin "zonda_n01.bmp", 255;
		end;
	}
	// �ȉ��]���T�[�r�X
	while(1) {
		mes '@npcname$;
		mes "^0000FF�]���T�[�r�X^000000�ł������܂��ˁB";
		mes "�ł́A�]���̎�ނ����I�т��������B";
		next;
		switch(select("^FF0000�s�s�]��^000000","^0000FF�_���W�����]��^000000")) {
		case 1:	// �s�s�]��
			while(1) {
				mes '@npcname$;
				mes "�s�s�]���A���m�������܂����B";
				mes "�����āA�s��������I�т��������B";
				next;
				switch(select(	"^FF0000���[���~�b�h�K�b�c^000000",
								"^0000FF�V���o���c�o���h^000000",
								"^006400�A���i�x���c^000000",
								"^FF6400�ِ��E^000000",
								"^8B008B���ӓs�s^000000",
								"^8B008B�p�[�X�^�嗤^000000",
								"�J�e�S���I���ɖ߂�"
				)) {
				case 1:	// ���[���~�b�h�K�b�c
					mes '@npcname$;
					mes "^FF0000���[���~�b�h�K�b�c^000000��";
					mes "�ǂ��Ɍ������܂����H";
					next;
					switch(select(	"�v�����e��",
									"�C�Y���[�h",
									"�Q�t�F��",
									"�����N",
									"�t�F�C����",
									"�A���x���^",
									"�R���h",
									"�s�s�I���ɖ߂�"
					)) {
					case 1: set '@map$,"prontera.gat";	set '@x,118;	set '@y,80;		break;
					case 2: set '@map$,"izlude.gat";	set '@x,128;	set '@y,91;		break;
					case 3: set '@map$,"geffen.gat";	set '@x,120;	set '@y,69;		break;
					case 4: set '@map$,"morocc.gat";	set '@x,156;	set '@y,92;		break;
					case 5: set '@map$,"payon.gat";		set '@x,183;	set '@y,100;	break;
					case 6: set '@map$,"alberta.gat";	set '@x,117;	set '@y,56;		break;
					case 7: set '@map$,"comodo.gat";	set '@x,209;	set '@y,143;	break;
					case 8:
						continue;
					}
					mes '@npcname$;
					mes "���m�������܂����B";
					mes "����ł͂����肢�����܂���";
					mes "��낵���ł����H";
					next;
					if(select("�o������","��߂�") == 2) {
						mes '@npcname$;
						mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
						mes "���߂ăT�[�r�X�������p�̍ۂ�";
						mes "���ɂ����|�����������B";
						mes "�����p���肪�Ƃ��������܂����B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					misceffect 35,"";
					mes '@npcname$;
					mes "�����Ă�����Ⴂ�܂��A" +(Sex? "����l": "����")+ "�l�B";
					mes "�ǂ������C�����āB";
					close2;
					cutin "zonda_n01.bmp", 255;
					warp '@map$,'@x,'@y;
					end;
				case 2:	// �V���o���c�o���h
					mes '@npcname$;
					mes "^0000FF�V���o���c�o���h^000000��";
					mes "�ǂ��Ɍ������܂����H";
					next;
					switch(select(	"�A���f�o����",
									"�W���m�[",
									"�A�C���u���b�N",
									"�A�C���x�t",
									"���q�^���[��",
									"�t�B�Q��",
									"�E�F���X���@�n",
									"�s�s�I���ɖ߂�"
					)) {
					case 1: set '@map$,"aldebaran.gat";		set '@x,140;	set '@y,113;	break;
					case 2: set '@map$,"yuno.gat";			set '@x,157;	set '@y,196;	break;
					case 3: set '@map$,"einbroch.gat";		set '@x,242;	set '@y,197;	break;
					case 4: set '@map$,"einbech.gat";		set '@x,173;	set '@y,129;	break;
					case 5: set '@map$,"lighthalzen.gat";	set '@x,159;	set '@y,92;		break;
					case 6: set '@map$,"hugel.gat";			set '@x,96;		set '@y,160;	break;
					case 7: set '@map$,"verus04.gat";		set '@x,123;	set '@y,249;	break;
					case 8:
						continue;
					}
					mes '@npcname$;
					mes "���m�������܂����B";
					mes "����ł͂����肢�����܂���";
					mes "��낵���ł����H";
					next;
					if(select("�o������","��߂�") == 2) {
						mes '@npcname$;
						mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
						mes "���߂ăT�[�r�X�������p�̍ۂ�";
						mes "���ɂ����|�����������B";
						mes "�����p���肪�Ƃ��������܂����B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					misceffect 35,"";
					mes '@npcname$;
					mes "�����Ă�����Ⴂ�܂��A" +(Sex? "����l": "����")+ "�l�B";
					mes "�ǂ������C�����āB";
					close2;
					cutin "zonda_n01.bmp", 255;
					warp '@map$,'@x,'@y;
					end;
				case 3:	// �A���i�x���c
					mes '@npcname$;
					mes "^006400�A���i�x���c^000000��";
					mes "�ǂ��Ɍ������܂����H";
					next;
					switch(select(	"���w��",
									"�x�C���X",
									"�s�s�I���ɖ߂�"
					)) {
					case 1: set '@map$,"rachel.gat";		set '@x,139;	set '@y,134;	break;
					case 2: set '@map$,"veins.gat";			set '@x,204;	set '@y,124;	break;
					case 3:
						continue;
					}
					mes '@npcname$;
					mes "���m�������܂����B";
					mes "����ł͂����肢�����܂���";
					mes "��낵���ł����H";
					next;
					if(select("�o������","��߂�") == 2) {
						mes '@npcname$;
						mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
						mes "���߂ăT�[�r�X�������p�̍ۂ�";
						mes "���ɂ����|�����������B";
						mes "�����p���肪�Ƃ��������܂����B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					misceffect 35,"";
					mes '@npcname$;
					mes "�����Ă�����Ⴂ�܂��A" +(Sex? "����l": "����")+ "�l�B";
					mes "�ǂ������C�����āB";
					close2;
					cutin "zonda_n01.bmp", 255;
					warp '@map$,'@x,'@y;
					end;
				case 4:	// �ِ��E
					mes '@npcname$;
					mes "^FF6400�ِ��E^000000��";
					mes "�ǂ��Ɍ������܂����H";
					next;
					switch(select(	"�~�b�h�K���h�A���R���Ԓn",
									"�X�v�����f�B�b�h",
									"�}�k�N",
									"�G���f�B�J�X�e�B�X",
									"���[��",
									"�G�N���[�W��",
									"�t���C�����@���[",
									"�����̋��� ���̒ʘH01",
									"�����̋��� ���̒ʘH02",
									"�s�s�I���ɖ߂�"
					)) {
					case 1: set '@map$,"mid_camp.gat";		set '@x,46;		set '@y,120;	break;
					case 2: set '@map$,"splendide.gat";		set '@x,232;	set '@y,151;	if(ASH_1QUE < 100) set '@flag,1;	break;	// �ِ��E�N�G�X�g
					case 3: set '@map$,"manuk.gat";			set '@x,293;	set '@y,141;	if(ASH_1QUE < 100) set '@flag,1;	break;	// �ِ��E�N�G�X�g
					case 4: set '@map$,"dicastes01.gat";	set '@x,197;	set '@y,145;	break;
					case 5: set '@map$,"mora.gat";			set '@x,113;	set '@y,109;	break;
					case 6: set '@map$,"eclage.gat";		set '@x,109;	set '@y,37;		break;
					case 7: set '@map$,"moro_vol.gat";		set '@x,93;		set '@y,99;		if(FVOL_1QUE < 100) set '@flag,1;	break;	// �t���C�����@���[�ւ̓��N�G�X�g
					case 8: set '@map$,"dali.gat";			set '@x,107;	set '@y,89;		break;
					case 9: set '@map$,"dali02.gat";		set '@x,107;	set '@y,89;		break;
					case 10:
						continue;
					}
					if('@flag) {
						mes '@npcname$;
						mes (Sex? "����l": "����")+ "�l�͂܂��A�����ɍs��";
						mes "���i���������łȂ��悤�ł��B";
						mes "����]�ɓY�����Ƃ��ł���";
						mes "�\���󂠂�܂���B";
						mes "�܂��̂����p�����҂����Ă���܂��B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					mes '@npcname$;
					mes "���m�������܂����B";
					mes "����ł͂����肢�����܂���";
					mes "��낵���ł����H";
					next;
					if(select("�o������","��߂�") == 2) {
						mes '@npcname$;
						mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
						mes "���߂ăT�[�r�X�������p�̍ۂ�";
						mes "���ɂ����|�����������B";
						mes "�����p���肪�Ƃ��������܂����B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					misceffect 35,"";
					mes '@npcname$;
					mes "�����Ă�����Ⴂ�܂��A" +(Sex? "����l": "����")+ "�l�B";
					mes "�ǂ������C�����āB";
					close2;
					cutin "zonda_n01.bmp", 255;
					warp '@map$,'@x,'@y;
					end;
				case 5:	// ���ӓs�s
					mes '@npcname$;
					mes "^8B008B���ӓs�s^000000��";
					mes "�ǂ��Ɍ������܂����H";
					next;
					switch(select(	"�R������",
									"�A���^��",
									"���V��",
									"�A�}�c",
									"�E���o��",
									"�j�u���w�C��",
									"���X�R�r�A",
									"���e�B�G",
									"�u���W���X",
									"�f���^",
									"�}������",
									"�|�[�g�}����",
									"���b�N���b�W",
									"�s�s�I���ɖ߂�"
					)) {
					case 1: set '@map$,"gonryun.gat";		set '@x,161;	set '@y,117;	break;
					case 2: set '@map$,"ayothaya.gat";		set '@x,216;	set '@y,167;	break;
					case 3: set '@map$,"louyang.gat";		set '@x,218;	set '@y,114;	break;
					case 4: set '@map$,"amatsu.gat";		set '@x,109;	set '@y,149;	break;
					case 5: set '@map$,"umbala.gat";		set '@x,88;		set '@y,153;	break;
					case 6: set '@map$,"nif_in.gat";		set '@x,18;		set '@y,20;		break;
					case 7: set '@map$,"moscovia.gat";		set '@x,229;	set '@y,194;	break;
					case 8: set '@map$,"xmas.gat";			set '@x,143;	set '@y,299;	break;
					case 9: set '@map$,"brasilis.gat";		set '@x,225;	set '@y,192;	break;
					case 10: set '@map$,"dewata.gat";		set '@x,190;	set '@y,190;	break;
					case 11: set '@map$,"malangdo.gat";		set '@x,184;	set '@y,132;	break;
					case 12: set '@map$,"malaya.gat";		set '@x,242;	set '@y,211;	break;
					case 13: set '@map$,"harboro1.gat";		set '@x,297;	set '@y,203;	break;
					case 14:
						continue;
					}
					if('@flag) {
						mes '@npcname$;
						mes (Sex? "����l": "����")+ "�l�͂܂��A�����ɍs��";
						mes "���i���������łȂ��悤�ł��B";
						mes "����]�ɓY�����Ƃ��ł���";
						mes "�\���󂠂�܂���B";
						mes "�܂��̂����p�����҂����Ă���܂��B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					mes '@npcname$;
					mes "���m�������܂����B";
					mes "����ł͂����肢�����܂���";
					mes "��낵���ł����H";
					next;
					if(select("�o������","��߂�") == 2) {
						mes '@npcname$;
						mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
						mes "���߂ăT�[�r�X�������p�̍ۂ�";
						mes "���ɂ����|�����������B";
						mes "�����p���肪�Ƃ��������܂����B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					misceffect 35,"";
					mes '@npcname$;
					mes "�����Ă�����Ⴂ�܂��A" +(Sex? "����l": "����")+ "�l�B";
					mes "�ǂ������C�����āB";
					close2;
					cutin "zonda_n01.bmp", 255;
					warp '@map$,'@x,'@y;
					end;
				case 6:	// �p�[�X�^�嗤
					mes '@npcname$;
					mes "^8B008B�p�[�X�^�嗤^000000��";
					mes "�ǂ��Ɍ������܂����H";
					next;
					switch(select(	"�`�����U�[�j��",
									"�s�s�I���ɖ߂�"
					)) {
					case 1: set '@map$,"lasagna.gat";		set '@x,298;	set '@y,238;	break;
					case 2:
						continue;
					}
					mes '@npcname$;
					mes "���m�������܂����B";
					mes "����ł͂����肢�����܂���";
					mes "��낵���ł����H";
					next;
					if(select("�o������","��߂�") == 2) {
						mes '@npcname$;
						mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
						mes "���߂ăT�[�r�X�������p�̍ۂ�";
						mes "���ɂ����|�����������B";
						mes "�����p���肪�Ƃ��������܂����B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					misceffect 35,"";
					mes '@npcname$;
					mes "�����Ă�����Ⴂ�܂��A" +(Sex? "����l": "����")+ "�l�B";
					mes "�ǂ������C�����āB";
					close2;
					cutin "zonda_n01.bmp", 255;
					warp '@map$,'@x,'@y;
					end;
				default:
					break;
				}
				break;
			}
			continue;
		case 2:	// �_���W�����]��
			while(1) {
				set '@map$,"";
				mes '@npcname$;
				mes "�_���W�����]���A���m�������܂����B";
				mes "�����āA�s��������I�т��������B";
				next;
				switch(select(	"^FF0000�_���W�����y�A�s�z^000000",
								"^8B008B�_���W�����y�J�s�z^000000",
								"^0000FF�_���W�����y�T�`�^�s�z^000000",
								"^005566�_���W�����y�i�`�n�s�z^000000",
								"^006400�_���W�����y�}�`���s�z^000000",
								"^DE1039�C�����[�W�����_���W����^000000",
								"^EB5B0F�e���[�_���W����^000000",
								"^FF6400�ِ��E^000000",
								"^8B008B���̑�^000000",
								"^640000�������A���_���W����^000000",
								"�J�e�S���I���ɖ߂�"
				)) {
				case 1:	// �_���W�����y�A�s�z
					mes '@npcname$;
					mes "�������܂�܂����B";
					mes "^FF0000�_���W�����y�A�s�z^000000����n�܂�";
					mes "�_���W�����́A������ɂȂ�܂��B";
					next;
					switch(select(	"�A�r�X���C�N",
									"�A�}�c�_���W����",
									"�a�n���_���W����",
									"�A���^���_���W����",
									"�C�Y���[�h�C�ꓴ�A",
									"",						// ���F���i�[������
									"��������H��",
									"�I�[�N�n�����A",
									"�I�[�f�B���_�a",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1:
						mes '@npcname$;
						mes "^FF0000�A�r�X���C�N^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�A�r�X���C�N ����","�A�r�X���C�N�n�����A 03","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"hu_fild05.gat";	set '@x,167;	set '@y,298;	break;
						case 2: set '@map$,"abyss_03.gat";	set '@x,115;	set '@y,30;		break;
						default:
							continue;
						}
						break;
					case 2:
						mes '@npcname$;
						mes "^FF0000�A�}�c�_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�A�}�c�_���W���� 03","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"ama_dun03.gat";	set '@x,120;	set '@y,12;	if(AMA_1QUE < 6) set '@flag,1;	break;	// �ʍs��`�N�G�X�g
						default:
							continue;
						}
						break;
					case 3:
						mes '@npcname$;
						mes "^FF0000�a�n���_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�a�n���_���W���� B1F","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"anthell01.gat";	set '@x,35;	set '@y,257;	break;
						default:
							continue;
						}
						break;
					case 4:
						mes '@npcname$;
						mes "^FF0000�A���^���_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						// ������
						switch(select("�A���^���_���W���� 02","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"ayo_dun02.gat";	set '@x,23;	set '@y,26;	if(AYO_1QUE < 11) set '@flag,1;	break;	// �Ñ��ՃN�G�X�g
						default:
							continue;
						}
						break;
					case 5:
						mes '@npcname$;
						mes "^FF0000�C�Y���[�h�C�ꓴ�A^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�C�Y���[�h�C�ꓴ�A ����","�C�Y���[�h�C�ꓴ�A 3�w","�C�Y���[�h�C��_�a","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"izlu2dun.gat";	set '@x,107;	set '@y,93;		break;
						case 2: set '@map$,"iz_dun02.gat";	set '@x,340;	set '@y,324;	break;
						case 3: set '@map$,"iz_dun04.gat";	set '@x,129;	set '@y,232;	break;
						default:
							continue;
						}
						break;
					case 6:
						mes '@npcname$;
						mes "^FF0000���F���i�[������^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("���F���i�[������ A��","���F���i�[������ B��","���F���i�[������ C��","���F���i�[������ D��","�_���W�����I���֖߂�")) {
						case 1: set '@flag,1;	break;
						case 2: set '@flag,1;	break;
						case 3: set '@flag,1;	break;
						case 4: set '@flag,1;	break;
						default:
							continue;
						}
						break;
					case 7:
						mes '@npcname$;
						mes "^FF0000��������H��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("��������H��_���W���� 02","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"xmas_dun02.gat";	set '@x,134;	set '@y,129;	break;
						default:
							continue;
						}
						break;
					case 8:
						mes '@npcname$;
						mes "^FF0000�I�[�N�n�����A^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�I�[�N�n�����A ����","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"gef_fild10.gat";	set '@x,70;	set '@y,336;	break;
						default:
							continue;
						}
						break;
					case 9:
						mes '@npcname$;
						mes "^FF0000�I�[�f�B���_�a^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�I�[�f�B���_�a 01","�I�[�f�B���_�a 03","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"odin_tem01.gat";	set '@x,379;	set '@y,334;	break;
						case 2: set '@map$,"odin_tem03.gat";	set '@x,240;	set '@y,36;		break;
						default:
							continue;
						}
						break;
					default:
						continue;
					}
					break;
				case 2:	// �_���W�����y�J�s�z
					mes '@npcname$;
					mes "�������܂�܂����B";
					mes "^8B008B�_���W�����y�J�s�z^000000����n�܂�";
					mes "�_���W�����́A������ɂȂ�܂��B";
					next;
					switch(select(	"�@�B�l�`�H��",
									"�O���X�g�w�C��",
									"�Q�t�F�j�A",
									"�Q�t�F���n���_���W����",
									"�X�̓��A",
									"�R�������_���W����",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1:
						mes '@npcname$;
						mes "^FF0000�@�B�l�`�H��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�@�B�l�`�H�� ����","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"yuno_fild08.gat";	set '@x,74;	set '@y,179;	break;
						default:
							continue;
						}
						break;
					case 2:
						mes '@npcname$;
						mes "^FF0000�O���X�g�w�C��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�O���X�g�w�C�� ����","�O���X�g�w�C�� �C���@","�O���X�g�w�C�� �Ï�","�O���X�g�w�C�� �R�m�c","�O���X�g�w�C�� �n�����H02","�O���X�g�w�C�� �ŉ��w�n�����A01","�����̃O���X�g�w�C���J�^�R���x","�����̃O���X�g�w�C���Ï�2F","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"glast_01.gat";		set '@x,371;	set '@y,304;	break;
						case 2: set '@map$,"glast_01.gat";		set '@x,204;	set '@y,133;	break;
						case 3: set '@map$,"glast_01.gat";		set '@x,197;	set '@y,290;	break;
						case 4: set '@map$,"glast_01.gat";		set '@x,67;		set '@y,192;	break;
						case 5: set '@map$,"gl_sew02.gat";		set '@x,293;	set '@y,295;	break;
						case 6: set '@map$,"gl_dun01.gat";		set '@x,222;	set '@y,24;		break;
						case 7: set '@map$,"gl_chyard_.gat";	set '@x,148;	set '@y,144;	if(Job >= Job_RuneKnight) set '@flag,1;	break;
						case 8: set '@map$,"gl_cas02_.gat";		set '@x,105;	set '@y,190;	if(Job < Job_RuneKnight || (Job == Job_Summoner && BaseLevel < 90)) set '@flag,1;	break;
						default:
							continue;
						}
						break;
					case 3:
						mes '@npcname$;
						mes "^FF0000�Q�t�F�j�A^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�Q�t�F�j�A 04","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"gefenia04.gat";	set '@x,129;	set '@y,91;	break;
						default:
							continue;
						}
						break;
					case 4:
						mes '@npcname$;
						mes "^FF0000�Q�t�F���n���_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�Q�t�F���n���_���W���� B2F","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"gef_dun01.gat";	set '@x,200;	set '@y,44;	break;
						default:
							continue;
						}
						break;
					case 5:
						mes '@npcname$;
						mes "^FF0000�X�̓��A^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�X�̓��A ����","�X�̓��A 02","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"ra_fild01.gat";	set '@x,234;	set '@y,326;	break;
						case 2: set '@map$,"ice_dun02.gat";	set '@x,152;	set '@y,281;	break;
						default:
							continue;
						}
						break;
					case 6:
						mes '@npcname$;
						mes "^FF0000�R�������_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�R�������_���W���� 03","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"gon_dun03.gat";	set '@x,65;	set '@y,10;	break;
						default:
							continue;
						}
						break;
					default:
						continue;
					}
					break;
				case 3:	// �_���W�����y�T�`�^�s�z
					mes '@npcname$;
					mes "�������܂�܂����B";
					mes "^0000FF�_���W�����y�T�`�^�s�z^000000����n�܂�";
					mes "�_���W�����́A������ɂȂ�܂��B";
					next;
					switch(select(	"�W���s���X�p��",
									"",							// �N�U���ꂽ�v�����e��
									"�X�t�B���N�X�_���W����",
									"���̍H�w������",
									"",							// �펀�҂̕�
									"�^�i�g�X�^���[",
									"�^�[�g���A�C�����h",
									"���v�D�t�߂̓�",
									"�f���^�_���W����",
									"",							// ����x���n��I�[�X
									"���v��",
									"�g�[���ΎR",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1:
						mes '@npcname$;
						mes "^FF0000�W���s���X�p��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�W���s���X�p�� ����","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"jupe_cave.gat";	set '@x,140;	set '@y,51;	break;
						default:
							continue;
						}
						break;
					case 2:
						continue;
						//mes '@npcname$;
						//mes "^FF0000�N�U���ꂽ�v�����e��^000000��";
						//mes "�ǂ���Ɍ������܂����H";
						//next;
						//switch(select("�N�U���ꂽ�v�����e��","�_���W�����I���֖߂�")) {
						//case 1: set '@map$,"prt_q_jp.gat";	set '@x,153;	set '@y,324;	break;
						//default:
						//	continue;
						//}
						//break;
					case 3:
						mes '@npcname$;
						mes "^FF0000�X�t�B���N�X�_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�X�t�B���N�X�_���W���� ����","�X�t�B���N�X�_���W���� B4F","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"moc_fild19.gat";	set '@x,104;	set '@y,99;		break;
						case 2: set '@map$,"in_sphinx4.gat";	set '@x,119;	set '@y,118;	break;
						default:
							continue;
						}
						break;
					case 4:
						mes '@npcname$;
						mes "^FF0000���̍H�w������^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("���̍H�w������ 02","���̍H�w������ 04","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"lhz_dun02.gat";	set '@x,150;	set '@y,114;	if(LHZ_1QUE < 9) set '@flag,1;	break;	// �������i���N�G�X�g
						case 2: set '@map$,"lhz_dun04.gat";	set '@x,241;	set '@y,58;		if(LHZ_1QUE < 9) set '@flag,1;	break;	// �������i���N�G�X�g
						default:
							continue;
						}
						break;
					case 5:
						mes '@npcname$;
						mes "^FF0000�펀�҂̕�^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�펀�҂̕�(�v�O�̊�)","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"lhz_dun_n_c.gat";	set '@x,139;	set '@y,261;	break;
						default:
							continue;
						}
						break;
					case 6:
						mes '@npcname$;
						mes "^FF0000�^�i�g�X�^���[^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�^�i�g�X�^���[ ����","�^�i�g�X�^���[��w�� 06","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"hu_fild01.gat";	set '@x,140;	set '@y,159;	break;
						case 2: set '@map$,"tha_t06.gat";	set '@x,124;	set '@y,120;	if(THA_1QUE < 1) set '@flag,1;	break;	// �^�i�g�X�^���[�i��
						default:
							continue;
						}
						break;
					case 7:
						mes '@npcname$;
						mes "^FF0000�^�[�g���A�C�����h^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�^�[�g���A�C�����h�_���W���� 01","�^�[�g���A�C�����h�_���W���� 03","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"tur_dun02.gat";	set '@x,145;	set '@y,264;	if(TUR_1QUE < 1) set '@flag,1;	break;	// �^�[�g���A�C�����h�N�G�X�g
						case 2: set '@map$,"tur_dun04.gat";	set '@x,97;		set '@y,193;	if(TUR_1QUE < 1) set '@flag,1;	break;	// �^�[�g���A�C�����h�N�G�X�g
						default:
							continue;
						}
						break;
					case 8:
						mes '@npcname$;
						mes "^FF0000���v�D�t�߂̓�^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("���v�D ����","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"alb2trea.gat";	set '@x,63;	set '@y,68;	break;
						default:
							continue;
						}
						break;
					case 9:
						mes '@npcname$;
						mes "^FF0000�f���^�_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�C�X�^�i���A ����","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"dew_fild01.gat";	set '@x,54;	set '@y,65;	break;
						default:
							continue;
						}
						break;
					case 10:
						mes '@npcname$;
						mes "^FF0000����x���n��I�[�X^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("����x���n��I�[�X","�_���W�����I���֖߂�")) {
						case 1: set '@flag,1;	break;
						default:
							continue;
						}
						break;
					case 11:
						mes '@npcname$;
						mes "^FF0000���v��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�A���f�o�������v���n�� 2F","�A���f�o�������v���n�� 4F","�A���f�o�������v���n�� 2F","�A���f�o�������v���n�� 4F","�P���ꂽ���Ԃ̎��v�� 1�K","�P���ꂽ���Ԃ̎��v�� 2�K","�P���ꂽ���Ԃ̎��v�� 3�K","�P���ꂽ���Ԃ̎��v�� 4�K","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"c_tower2.gat";	set '@x,147;	set '@y,283;	break;
						case 2: set '@map$,"c_tower4.gat";	set '@x,183;	set '@y,41;	break;
						case 3: set '@map$,"alde_dun02.gat";	set '@x,127;	set '@y,169;	break;
						case 4: set '@map$,"alde_dun04.gat";	set '@x,79;		set '@y,269;	break;
						case 5: set '@map$,"c_tower1_.gat";	set '@x,235;	set '@y,223;	if(BaseLevel < 150) set '@flag,1;	break;	// ������
						case 6: set '@map$,"c_tower2_.gat";	set '@x,268;	set '@y,26;		if(BaseLevel < 150) set '@flag,1;	break;	// ������
						case 7: set '@map$,"c_tower3_.gat";	set '@x,65;		set '@y,147;	if(BaseLevel < 150) set '@flag,1;	break;	// ������
						case 8: set '@map$,"c_tower4_.gat";	set '@x,185;	set '@y,44;		if(BaseLevel < 150) set '@flag,1;	break;	// ������
						default:
							continue;
						}
						break;
					case 12:
						mes '@npcname$;
						mes "^FF0000�g�[���ΎR^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�g�[���ΎR ����","�g�[���ΎR�_���W���� 02","�_���W�����I���֖߂�")) {
						case 1: set '@map$,"ve_fild03.gat";	set '@x,168;	set '@y,234;	break;
						case 2: set '@map$,"thor_v02.gat";	set '@x,186;	set '@y,62;		break;
						default:
							continue;
						}
						break;
					default:
						continue;
					}
					break;
				case 4:	// �_���W�����y�i�`�n�s�z
					mes '@npcname$;
					mes "�������܂�܂����B";
					mes "^005566�_���W�����y�i�`�n�s�z^000000����n�܂�";
					mes "�_���W�����́A������ɂȂ�܂��B";
					next;
					switch(select(	"�����Ȃ���",
									"�m�[�O���[�h",
									"",						// �p���ꃋ�h�D�X
									"�s���~�b�h�_���W����",
									"�t�F�C�����n�����A",
									"�u���W���X�_���W����",
									"�t���C����_�a����",
									"�v�����e���n���č�",
									"�v�����e���n�����H",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1:
						mes '@npcname$;
						mes "^FF0000�����Ȃ���^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�����Ȃ��� ����","�C���@ 01","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"ve_fild07.gat";	set '@x,129;	set '@y,132;	break;
						case 2: set '@map$,"abbey01.gat";	set '@x,324;	set '@y,98;		if(NAME_1QUE < 17) set '@flag,1;	break;	// �����Ȃ����̔閧�N�G�X�g
						default:
							continue;
						}
						break;
					case 2:
						mes '@npcname$;
						mes "^FF0000�m�[�O���[�h^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�m�[�O���[�h 1�w","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"mag_dun01.gat";	set '@x,237;	set '@y,236;	break;
						default:
							continue;
						}
						break;
					case 3:
						mes '@npcname$;
						mes "^FF0000�p���ꃋ�h�D�X^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�p���ꃋ�h�D�X�@1�K","�p���ꃋ�h�D�X�@2�K","�p���ꃋ�h�D�X�@3�K","�_���W�����I���ɖ߂�")) {
						case 1: set '@flag,1;	break;
						case 2: set '@flag,1;	break;
						case 3: set '@flag,1;	break;
						default:
							continue;
						}
						break;
					case 4:
						mes '@npcname$;
						mes "^FF0000�s���~�b�h�_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�s���~�b�h�_���W���� ����","�s���~�b�h�_���W���� 3F","�s���~�b�h�_���W���� B3F","�閧�̒n����01","�閧�̒n����02","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"moc_ruins.gat";		set '@x,64;		set '@y,157;	break;
						case 2: set '@map$,"moc_pryd03.gat";	set '@x,20;		set '@y,187;	break;
						case 3: set '@map$,"moc_pryd06.gat";	set '@x,192;	set '@y,12;		break;
						case 4: set '@map$,"moc_prydn1.gat";	set '@x,93;		set '@y,96;		if(BaseLevel < 100) set '@flag,1;	break;
						case 5: set '@map$,"moc_prydn2.gat";	set '@x,195;	set '@y,11;		if(BaseLevel < 100) set '@flag,1;	break;
						default:
							continue;
						}
						break;
					case 5:
						mes '@npcname$;
						mes "^FF0000�t�F�C�����n�����A^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�t�F�C�����n�����A ����","�t�F�C�����n�����A B3F","�t�F�C�����n�����A B4F","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"pay_arche.gat";	set '@x,48;		set '@y,126;	break;
						case 2: set '@map$,"pay_dun02.gat";	set '@x,22;		set '@y,62;	break;
						case 3: set '@map$,"pay_dun03.gat";	set '@x,120;	set '@y,65;	break;
						default:
							continue;
						}
						break;
					case 6:
						mes '@npcname$;
						mes "^FF0000�u���W���X�_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						// ������
						switch(select("��̒��̓��A 01","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"bra_dun01.gat";	set '@x,87;	set '@y,47;	if(BRA_3QUE < 8) set '@flag,1;	break;	// �g�C���̃I�o�P�N�G�X�g
						default:
							continue;
						}
						break;
					case 7:
						mes '@npcname$;
						mes "^FF0000�t���C����_�a����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�t���C����_�a���� ����","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"ra_temin.gat";	set '@x,32;	set '@y,312;	if(RA_1QUE < 10) set '@flag,1;	break;	// �t���C����_�a�N�G�X�g
						default:
							continue;
						}
						break;
					case 8:
						mes '@npcname$;
						mes "^FF0000�v�����e���n���č�^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�v�����e���n���č� ����","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"prt_pri00.gat";	set '@x,51;	set '@y,120;	if(EP16_1QUE < 2) set '@flag,1;	break;	// �����Ƃƃ��~���̐S��
						default:
							continue;
						}
						break;
					case 9:
						mes '@npcname$;
						mes "^FF0000�v�����e���n�����H^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�v�����e���n�����H ����","�v�����e���n�����H B2F","�v�����e���n�����H B4F","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"prt_fild05.gat";	set '@x,274;	set '@y,213;	break;
						case 2: set '@map$,"prt_sewb2.gat";		set '@x,19;		set '@y,19;		if(PRT_1QUE < 1) set '@flag,1;	break;	// �v�����e���n�����H�N�G�X�g
						case 3: set '@map$,"prt_sewb4.gat";		set '@x,100;	set '@y,90;		if(PRT_1QUE < 1) set '@flag,1;	break;	// �v�����e���n�����H�N�G�X�g
						default:
							continue;
						}
						break;
					default:
						continue;
					}
					break;
				case 5:	// �_���W�����y�}�`���s�z
					mes '@npcname$;
					mes "�������܂�܂����B";
					mes "^006400�_���W�����y�}�`���s�z^000000����n�܂�";
					mes "�_���W�����́A������ɂȂ�܂��B";
					next;
					switch(select(	"�~�����j�[���p�z",
									"���{�̐X",
									"���X�R�r�A�_���W����",
									"���V��_���W����",
									"���̑�",
									"���b�N���b�W�_���W����",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1:
						mes '@npcname$;
						mes "^FF0000�~�����j�[���p�z^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�~�����j�[���p�z ����","�~�����j�[���p�z B2F","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"mjolnir_02.gat";	set '@x,83;	set '@y,356;	break;
						case 2: set '@map$,"mjo_dun02.gat";		set '@x,39;	set '@y,27;		break;
						default:
							continue;
						}
						break;
					case 2:
						mes '@npcname$;
						mes "^FF0000���{�̐X^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("���{�̐X 02","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"prt_maze02.gat";	set '@x,105;	set '@y,96;	break;
						default:
							continue;
						}
						break;
					case 3:
						mes '@npcname$;
						mes "^FF0000���X�R�r�A�_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						// ������
						switch(select("���[���X","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"mosk_dun03.gat";	set '@x,32;	set '@y,135;	if(MOSK_1QUE < 39) set '@flag,1;	break;	// �N�W�����������˂ăN�G�X�g
						default:
							continue;
						}
						break;
					case 4:
						mes '@npcname$;
						mes "^FF0000���V��_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("���V��_���W���� 03","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"lou_dun03.gat";	set '@x,165;	set '@y,40;	break;
						default:
							continue;
						}
						break;
					case 5:
						mes '@npcname$;
						mes "^FF0000���̑�^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("���̑� 01","���̑� 02","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"lasa_dun01.gat";	set '@x,24;		set '@y,143;	break;
						case 2: set '@map$,"lasa_dun02.gat";	set '@x,146;	set '@y,53;		break;
						default:
							continue;
						}
						break;
					case 6:
						mes '@npcname$;
						mes "^FF0000���b�N���b�W�_���W����^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("���b�N���b�W�z�R 01","���b�N���b�W�z�R 01 ���n","���b�N���b�W�n���X","���b�N���b�W�n���X ���n","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"rockmi1.gat";	set '@x,247;	set '@y,19;		break;
						case 2: set '@map$,"rockmi3.gat";	set '@x,247;	set '@y,19;		break;
						case 3: set '@map$,"harboro2.gat";	set '@x,281;	set '@y,104;	break;
						case 4: set '@map$,"harboro3.gat";	set '@x,281;	set '@y,104;	break;
						default:
							continue;
						}
						break;
					default:
						continue;
					}
					break;
				case 6:	// �C�����[�W�����_���W����
					mes '@npcname$;
					mes "^DE1039�C�����[�W�����_���W����^000000�ł������܂��ˁB";
					mes "����]�̏ꏊ�����I�т��������B";
					next;
					switch(select(	"����Ԃ̈���",
									"�t���[�Y���������[",
									"250 �y�[�W",
									"�߂��݂̗z����",
									"�l�W���A���鍑",
									"���z�̖k���A�������_",
									"�c�񂾖��{�̐X",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1: set '@map$,"pay_dun03.gat";		set '@x,150;	set '@y,45;	if(IL_MOON_QUE < 9) set '@flag,1; break;
					case 2: set '@map$,"ice_dun02.gat";		set '@x,150;	set '@y,16;	if(!checkquest(202080)) set '@flag,1; break;
					case 3: set '@map$,"gef_dun01.gat";		set '@x,135;	set '@y,220;	if(IL_VAMP_QUE < 16) set '@flag,1; break;
					case 4: set '@map$,"alberta.gat";		set '@x,216;	set '@y,28;	if(IL_TUR_QUE < 9) set '@flag,1; break;
					case 5: set '@flag,1; break;
					case 6: set '@flag,1; break;
					case 7: set '@flag,1; break;
					default:
						continue;
					}
					break;
				case 7:	// �e���[�_���W����
					mes '@npcname$;
					mes "^EB5B0F�e���[�_���W����^000000�ł������܂���";
					mes "����]�̏ꏊ�����I�т��������B";
					next;
					switch(select(	"�m�[�O���[�h3�w",
									"�O���X�g�w�C���A�r�X",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1: set '@flag,1;	break;
					case 2: set '@flag,1;	break;
					default:
						continue;
					}
					break;
				case 8:	// �ِ��E
					mes '@npcname$;
					mes "^FF6400�ِ��E^000000�ł������܂��ˁB";
					mes "����]�̏ꏊ�����I�т��������B";
					next;
					switch(select(	"�C�O�h���V�����S��",
									"�G�N���[�W��",
									"�J�~�_���g���l��",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1:
						mes '@npcname$;
						mes "^FF0000�C�O�h���V�����S��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�C�O�h���V�����S�� 02","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"nyd_dun02.gat";	set '@x,63;	set '@y,269;	if(YGG_2QUE < 5) set '@flag,1;	break;	// ��̎푰�N�G�X�g
						default:
							continue;
						}
						break;
					case 2:
						mes '@npcname$;
						mes "^FF0000�G�N���[�W��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�Ԃ��炫�n�߂���n","�r�t���X�g�^���[ 2�K","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"ecl_fild01.gat";	set '@x,183;	set '@y,93;	if(ASH_1QUE < 100) set '@flag,1;	break;	// �ِ��E�N�G�X�g
						case 2: set '@map$,"ecl_tdun02.gat";	set '@x,47;		set '@y,11;	if(ASH_1QUE < 100) set '@flag,1;	break;	// �ِ��E�N�G�X�g
						default:
							continue;
						}
						break;
					case 3:
						mes '@npcname$;
						mes "^FF0000�J�~�_���g���l��^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�X�J���o�_���W���� ����","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"dic_dun01.gat";	set '@x,290;	set '@y,98;	if(DIC_1QUE < 100) set '@flag,1;	break;	// �G���f�B�J�X�e�B�X�N�G�X�g
						default:
							continue;
						}
						break;
					default:
						continue;
					}
					break;
				case 9:	// ���̑�
					mes '@npcname$;
					mes "^8B008B���̑�^000000�ł������܂��ˁB";
					mes "����]�̏ꏊ�����I�т��������B";
					next;
					switch(select(	"���J�s�g�[���i�C���@",
									"�t�F�C���������̐X 04",
									"�A�T�V���M���h��",
									"�t�@���X���䓇",
									"�R�R���r�[�`",
									"�A�C���u���b�N�t�B�[���h 04",
									"�W���m�[�t�B�[���h 06",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1: set '@map$,"prt_monk.gat";		set '@x,223;	set '@y,172;	break;
					case 2: set '@map$,"pay_fild04.gat";	set '@x,24;		set '@y,169;	break;
					case 3: set '@map$,"in_moc_16.gat";		set '@x,16;		set '@y,14;		break;
					case 4: set '@map$,"cmd_fild07.gat";	set '@x,138;	set '@y,129;	break;
					case 5: set '@map$,"cmd_fild02.gat";	set '@x,219;	set '@y,372;	break;
					case 6: set '@map$,"ein_fild04.gat";	set '@x,184;	set '@y,32;		break;
					case 7: set '@map$,"yuno_fild06.gat";	set '@x,363;	set '@y,134;	break;
					default:
						continue;
					}
					break;
				case 10:	// �������A���_���W����
					mes '@npcname$;
					mes "^640000�������A���_���W����^000000�ł������܂��ˁB";
					mes "����]�̏ꏊ�����I�т��������B";
					next;
					switch(select(	"�����̃W�^�[�o�O",
									"�Í�����̋L��",
									"�ẪO���X�g�w�C��",
									"���F���i�[������������",
									"�i���̐�",
									"�p�Y�̍���",
									"�G���h���X�^���[",
									"�I�[�N�̋L��",
									"�I�[�X�񎟑{��",
									"�ߋ��̋V���̊�",
									"���̐X",
									"�֊��̌�����",
									"�󒆗v��",
									"�R���������A��",
									"�Ō�̕���",
									"���̍H�w�������̋L�^",
									"�n���r���H",
									"�`���[���X�g���H��",
									"����������",
									"�j�[�Y�w�b�O�̑�",
									"�l�R�����̔閧������",
									"�n�[�g�n���^�[�R����n",
									"�o�R�i���̐��ݏ�",
									"���󂳂ꂽ�_�a",
									"�t���C���P�C�u",
									"�u�����̑�",
									"�\�A���̓��A",
									"�z���[��������H��",
									"�^���̌���",
									"�ł̃r�����E���S�a�@",
									"�_���W�����I���ɖ߂�"
					)) {
					case 1: set '@flag,1;	break;	// �����̃W�^�[�o�O
					case 2: set '@flag,1;	break;	// �Í�����̋L��
					case 3: set '@map$,"glast_01.gat";		set '@x,200;	set '@y,264;	break;
					case 4: set '@flag,1;	break;	// ���F���i�[������������
					case 5: set '@flag,1;	break;	// �i���̐�
					case 6:
						mes '@npcname$;
						mes "^FF0000�p�Y�̍���^000000��";
						mes "�ǂ���Ɍ������܂����H";
						next;
						switch(select("�Q�t�F�����@���","�T���̋L��","�􂢂̌��m","��s�D�P��","�t�F�C�X���[���̑�","�t�F�������ƃT��","���_�̓�","�_���W�����I���ɖ߂�")) {
						case 1: set '@map$,"dali.gat";		set '@x,94;		set '@y,144;	break;
						case 2: set '@map$,"dali.gat";		set '@x,134;	set '@y,111;	break;
						case 3: set '@map$,"dali02.gat";	set '@x,46;		set '@y,129;	break;
						case 4: set '@map$,"dali02.gat";	set '@x,137;	set '@y,82;		break;
						case 5: set '@map$,"dali.gat";		set '@x,85;		set '@y,62;		break;
						case 6: set '@map$,"dali02.gat";	set '@x,91;		set '@y,140;	break;
						case 7: set '@map$,"dali02.gat";	set '@x,134;	set '@y,112;	break;
						default:
							continue;
						}
						break;
					case 7: set '@map$,"alberta.gat";		set '@x,214;	set '@y,72;		break;
					case 8: set '@map$,"gef_fild10.gat";	set '@x,240;	set '@y,197;	break;
					case 9: set '@flag,1;	break;	// �I�[�X�񎟑{��
					case 10: set '@flag,1;	break;	// �ߋ��̋V���̊�
					case 11: set '@map$,"bif_fild01.gat";	set '@x,160;	set '@y,334;	break;
					case 12: set '@map$,"lhz_dun04.gat";	set '@x,148;	set '@y,273;	break;
					case 13: set '@flag,1;	break;	// �󒆗v��
					case 14: set '@flag,1;	break;	// �R���������A��
					case 15: set '@flag,1;	break;	// �Ō�̕���
					case 16: set '@flag,1;	break;	// ���̍H�w�������̋L�^
					case 17: set '@map$,"mal_in01.gat";		set '@x,170;	set '@y,34;	break;
					case 18: set '@flag,1;	break;	// �`���[���X�g���H��
					case 19: set '@flag,1;	break;	// ����������
					case 20: set '@map$,"nyd_dun02.gat";	set '@x,94;		set '@y,192;	break;
					case 21: set '@flag,1;	break;	// �l�R�����̔閧������
					case 22: set '@flag,1;	break;	// �n�[�g�n���^�[�R����n
					case 23: set '@map$,"ma_scene01.gat";	set '@x,171;	set '@y,175;	break;
					case 24: set '@map$,"monk_test.gat";	set '@x,302;	set '@y,140;	break;
					case 25: set '@map$,"moro_cav.gat";		set '@x,45;		set '@y,66;		break;
					case 26: set '@map$,"ma_fild02.gat";	set '@x,315;	set '@y,313;	break;
					case 27: set '@map$,"mal_dun01.gat";	set '@x,152;	set '@y,231;	break;
					case 28: set '@map$,"xmas.gat";			set '@x,234;	set '@y,289;	break;
					case 29: set '@flag,1;	break;	// �^���̌���
					case 30: set '@map$,"malaya.gat";		set '@x,56;		set '@y,78;		break;
					default:
						continue;
					}
					break;
				default:
					continue;
				}
				if('@flag) {
					mes '@npcname$;
					mes (Sex? "����l": "����")+ "�l�͂܂��A�����ɍs��";
					mes "���i���������łȂ��悤�ł��B";
					mes "����]�ɓY�����Ƃ��ł���";
					mes "�\���󂠂�܂���B";
					mes "�܂��̂����p�����҂����Ă���܂��B";
					close2;
					cutin "zonda_n01.bmp", 255;
					end;
				}
				if('@map$ != "") {
					mes '@npcname$;
					mes "���m�������܂����B";
					mes "����ł͂����肢�����܂���";
					mes "��낵���ł����H";
					next;
					if(select("�o������","��߂�") == 2) {
						mes '@npcname$;
						mes "�������܂�܂����A" +(Sex? "����l": "����")+ "�l";
						mes "���߂ăT�[�r�X�������p�̍ۂ�";
						mes "���ɂ����|�����������B";
						mes "�����p���肪�Ƃ��������܂����B";
						close2;
						cutin "zonda_n01.bmp", 255;
						end;
					}
					misceffect 35,"";
					mes '@npcname$;
					mes "�����Ă�����Ⴂ�܂��A" +(Sex? "����l": "����")+ "�l�B";
					mes "�ǂ������C�����āB";
					close2;
					cutin "zonda_n01.bmp", 255;
					warp '@map$,'@x,'@y;
					end;
				}
				break;
			}
			continue;
		}
	}
}

-	shop	zonda_callshop	-1,512
-	duplicate(Dynamicnpc#zonda)	�W�����_�m�[�r�X#n01	-1
-	duplicate(Dynamicnpc#zonda)	�W�����_�m�[�r�X#n02	-1
-	duplicate(Dynamicnpc#zonda)	�W�����_�o���T�~�R#do01	-1
