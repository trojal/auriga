//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[              by Pneuma
//------------------------------------------------------------

//---------------------------------------------
// SHOP

-	shop	���Օi�̔���::ac_shop1	-1,519,517,501,506,502,504,611,601,525,645,656,610
-	shop	����̔���::ac_shop2	-1,1750,1770,1751,717
-	shop	�[��::ac_shop3	-1,1351,1354,1116,1151,1154,1451,1454,1457
-	shop	�G�[�C::ac_shop4	-1,1204,1207,1210,1213,1216,1101,1104,1107,1110,1113,1122,1601,1604,1607,1501,1504,1507,1510,1519,1301,1401,1404,1407
-	shop	�R�E::ac_shop5	-1,1701,1704,1707,1710,13150,13151,13102,13154,13155
-	shop	���[��::ac_shop6	-1,2303,2305,2328,2323,2332,2307,2309,2312,2501,2503,2505,2101,2103,2401,2403,2405,2608,2627
-	shop	�V���[��::ac_shop7	-1,2211,2208,2220,2222,2232,2216,2226,2206,2228,2230,2212,2205,2203,2201,2239,2243,2242,2218,2241

ac_cl_hall.gat,155,35,4	script	���Օi�̔���#ac	93,{/* 52611 */
	callshop "ac_shop1";
	end;
OnInit:
	waitingroom "���Օi �̔���", 0;
	end;
}
ac_cl_hall.gat,152,29,4	script	����̔���#ac	82,{/* 52612 */
	callshop "ac_shop2";
	end;
OnInit:
	waitingroom "��E�u���[�W�F�� �̔���", 0;
	end;
}
ac_cl_hall.gat,178,43,4	script	�[��#ac	752,{/* 52615 */
	callshop "ac_shop3";
	end;
OnInit:
	waitingroom "���蕐�� �̔���", 0;
	end;
}
ac_cl_hall.gat,182,39,3	script	�G�[�C#ac	815,{/* 52616 */
	callshop "ac_shop4";
	end;
OnInit:
	waitingroom "�Ў蕐�� �̔���", 0;
	end;
}
ac_cl_hall.gat,183,44,4	script	�R�E#ac	732,{/* 52617 */
	callshop "ac_shop5";
	end;
OnInit:
	waitingroom "�|�E�e �̔���", 0;
	end;
}
ac_cl_hall.gat,181,35,4	script	���[��#ac	52,{/* 52618 */
	callshop "ac_shop6";
	end;
OnInit:
	waitingroom "�h�� �̔���", 0;
	end;
}
ac_cl_hall.gat,179,31,4	script	�V���[��#ac	731,{/* 52619 */
	callshop "ac_shop7";
	end;
OnInit:
	waitingroom "������ �̔���", 0;
	end;
}

//---------------------------------------------
// �`���҃A�J�f�~�[��pLv����
//  ���]��1���E�ABaseLevel��55���� �Ȃ�ΐ^��Ԃ��B
function	script	AC_GetNovice	{
	return (BaseLevel<=55 && Upper!=1 && Job!=Job_Summoner && (Job<=6 || Job==Job_TaeKwon || Job==Job_Gunslinger || Job==Job_Ninja || Job==Job_SuperNovice));
}

//----------------------------------
// �Z�[�u�n�_�փ��[�v
// �^�[���̓]���Ɨ��p
function	script	AC_WarpTown	{
	switch(getarg(0)) {
	case 0: warp "prontera.gat",150,190; break;
	case 1: warp "izlude.gat",126,113; break;
	case 2: warp "morocc.gat",147,93; break;
	case 3: warp "alberta.gat",103,129; break;
	case 4: warp "geffen.gat",117,103; break;
	case 5: warp "payon.gat",155,203; break;
	case 6: warp "einbroch.gat",217,188; break;
	case 7: warp "amatsu.gat",148,134; break;
	case 8: warp "aldebaran.gat",138,110; break;
	}
	return;
}

//----------------------------------
// ���S�ҏC���ꂩ�烏�[�v��̕\��
//
function	script	AC_NoviceInfo	{
	if(AC_AFLIER || AC_PASSPORT) end;
	set AC_AFLIER,1;
	if(BaseLevel>10 || Job!=0 || Upper!=0) {
		mes "[" + strcharinfo(0) + "]";
		mes "��H";
		mes "�]�`���V�������Ă���]";
		next;
		menu "�`���V������",-;
		viewpoint 1, getarg(1), getarg(2), 100, 0xFF0000;
		mes "�]�`���҃A�J�f�~�[���k��W�I�]";
		mes "�]�V�������}�I�]";
		mes "�]��t�ꏊ�͂�����I�]";
		mes "�]�n�}��^FF0000�{^000000�ŏꏊ���L�ڂ��Ă���]";
		close;
	}
	mes "[�C���t�H���[�V����]";
	mes "�]���悢��s��Ȗ`���̎n�܂�ł��I";
	mes "�܂��͖`���҂��W�܂�";
	mes "�`���҃A�J�f�~�[�֍s���Ă݂܂��傤�]";
	mes "�]�V�������Ԃ������ƌ�����܂���I";
	next;
	mes "[�C���t�H���[�V����]";
	mes getarg(0);
	next;
	viewpoint 1, getarg(1), getarg(2), 100, 0xFF0000;
	mes "[�C���t�H���[�V����]";
	mes "�]�`���҃A�J�f�~�[��";
	mes "��ʉE��̃~�j�}�b�v��";
	mes "�\������Ă���^FF0000�{^000000�̏ꏊ��";
	mes "�s���Ɠ��w�ł��܂���I�]";
	mes "�]�~�j�}�b�v��^0000FFCtrl�{Tab^000000��";
	mes "�\���̐؂�ւ����ł��܂��]";
	close;
	return;
}

prontera.gat,146,51,0	script	#GT_07	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","�]�����͎�s^0000FF�v�����e��^000000�]",153,192;
}
geffen.gat,120,79,0	script	#GT_02	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","�]�����͖��@�s�s^0000FF�Q�t�F��^000000�]",116,109;
}
morocc.gat,156,94,0	script	#GT_03	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","�]�����͍����̓s�s^0000FF�����N^000000�]",147,101;
}
payon.gat,166,67,0	script	#GT_04	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","�]�����͎R�x�s�s^0000FF�t�F�C����^000000�]",159,205;
}
alberta.gat,114,58,0	script	#GT_05	139,5,5,{
OnTouch:
	callfunc "AC_NoviceInfo","�]�����͍`�X^0000FF�A���x���^^000000�]",107,132;
}

//prontera.gat,279,356,0	script	#GT_01	139,{/* 52656 */}

//----------------------------------
// �������z�[��

ac_cl_hall.gat,159,31,4	script	�E�җp��̔���#ac	49,{
	mes "[�E�җp��̔���]";
	mes "�₟�A����ɂ��́B";
	mes "�����ł́A�E�җp�i��";
	mes "�̔����Ă����B";
	if (BaseLevel<=55 && Job==Job_Ninja) {
		while(1) {
			next;
			mes "[�E�җp��̔���]";
			mes "�ǂ̕i�����~�����񂾂��H";
			next;
			switch(select(  "�藠��",
							"�J�_�̎藠�� <- Lv19�ȉ� �����s��",
							"�M���̎藠�� <- Lv39�ȉ� �����s��",
							"�X�M��",
							"��ΐ�",
							"�����",
							"�e���",
							"��b <- Lv19�ȉ� �����s��",
							"�w������߂�")) {
			case 1: set '@itemid,13250; set '@price,4;  break;
			case 2: set '@itemid,13251; set '@price,10;  break;
			case 3: set '@itemid,13252; set '@price,20;  break;
			case 4: set '@itemid,7522; set '@price,150;  break;
			case 5: set '@itemid,7521; set '@price,150;  break;
			case 6: set '@itemid,7523; set '@price,150;  break;
			case 7: set '@itemid,7524; set '@price,300;  break;
			case 8:
				mes "[�E�җp��̔���]";
				mes "��b��1�A10000Zeny���B";
				mes "�����̂����H";
				next;
				if(select("����Ȃ�","����")==1) {
					mes "[�E�җp��̔���]";
					mes "����H";
					mes "��b�͕K�v�Ȃ��̂��ȁH";
					continue;
				}
				if(Zeny < 10000) {
					mes "[�E�җp��̔���]";
					mes "�ǂ����";
					mes "����������Ȃ��݂�������H";
					continue;
				}
				if(checkweight(2117,1)==0) {
					mes "[�E�җp��̔���]";
					mes "�ǂ����";
					mes "����Ȃɂ��ĂȂ��݂�������H";
					continue;
				}
				mes "[�E�җp��̔���]";
				mes "�͂��A�ǂ����B";
				mes "�񑩂̏��i����B";
				set Zeny,Zeny-10000;
				getitem 2117,1;
				continue;
			default:
				mes "[�E�җp��̔���]";
				mes "�������B";
				mes "�܂��A�����K�v�ɂȂ�����";
				mes "�����ł�B";
				close;
			}
			mes "[�E�җp��̔���]";
			mes getitemname('@itemid)+ "��1�A" +'@price+ "Zeny���B";
			mes "�ǂ̂��炢�~�����񂾂��H";
			mes "1�`1000�̊ԂŁA�~��������";
			mes "���͂��Ă���B";
			mes "0����͂����";
			mes "�w������߂����B";
			next;
			input '@num;
			if('@num < 0 || '@num > 1000) {
				mes "[�E�җp��̔���]";
				mes "��x�ɍw���o����̂�";
				mes "1000�܂ł���B";
				continue;
			}
			if('@num == 0) {
				mes "[�E�җp��̔���]";
				mes "����H";
				mes getitemname('@itemid)+ "�͕K�v�Ȃ��̂��ȁH";
				continue;
			}
			if(Zeny < '@price*'@num) {
				mes "[�E�җp��̔���]";
				mes "�ǂ����";
				mes "����������Ȃ��݂�������H";
				continue;
			}
			if(checkweight('@itemid,'@num)==0) {
				mes "[�E�җp��̔���]";
				mes "�ǂ����";
				mes "����Ȃɂ��ĂȂ��݂�������H";
				continue;
			}
			mes "[�E�җp��̔���]";
			mes "�͂��A�ǂ����B";
			mes "�񑩂̏��i����B";
			set Zeny,Zeny-'@price*'@num;
			getitem '@itemid,'@num;
			continue;
		}
	} else {
		next;
		set '@novice, callfunc("AC_GetNovice");
		if ('@novice) {
			mes "[�E�җp��̔���]";
			mes "�\����Ȃ����ǁA";
			mes "�E�҈ȊO�ɂ�";
			mes "�E�җp�i��";
			mes "���邱�Ƃ͏o���Ȃ��񂾁B";
			mes "��������^��ł��Ă��āA";
			mes "�݌ɂ����Ȃ��񂾂�B";
			close;
		} else {
			mes "[�E�җp��̔���]";
			mes "�\����Ȃ����ǁA";
			mes "�n���̖`���҂ɂ�";
			mes "�E�җp�i��";
			mes "���邱�Ƃ͏o���Ȃ��񂾁B";
			mes "�삯�o���̖`���҂�";
			mes "�n�����̂��Ȃ��ƍ��邩��ˁB";
			close;
		}
	}
	end;
OnInit:
	waitingroom "�E�җp�� �̔���", 0;
	end;
}

ac_cl_hall.gat,158,34,4	script	�e�e�̔���#ac	85,{
	mes "[�e�e�̔���]";
	mes "�₟�A����ɂ��́B";
	mes "�����ł́A�e�p�̒e�ۂ�";
	mes "�̔����Ă����B";
	if (Job==Job_Gunslinger && BaseLevel<=55) {
		while(1){
			next;
			mes "[�e�e�̔���]";
			mes "�ǂ̒e�ۂ��~�����񂾂��H";
			next;
			set '@sel, select("�o���b�g","�V���o�[�o���b�g","�u���b�h�o���b�g","�w������߂�");
			mes "[�e�e�̔���]";
			switch('@sel){
			case 1:
				set '@itemid,13200;
				set '@price,1;
				mes "�o���b�g��1�A�PZeny���B"; //�S�p�����Ŗ{�ƒʂ�
				break;
			case 2:
				set '@itemid,13201;
				set '@price,15;
				mes "�V���o�[�o���b�g��1�A15Zeny���B";
				break;
			case 3:
				set '@itemid,13202;
				set '@price,30;
				mes "�u���b�h�o���b�g��1�A30Zeny���B";
				break;
			default:
				mes "�������B";
				mes "�܂��A�e�ۂ��K�v�ɂȂ�����";
				mes "�����ł�B";
				close;
			}
			mes "�ǂ̂��炢�~�����񂾂��H";
			mes "1�`1000�̊ԂŁA�~��������";
			mes "���͂��Ă���B";
			mes "0����͂����";
			mes "�w������߂����B";
			next;
			input '@num;
			if('@num < 0 || '@num > 1000) {
				mes "[�e�e�̔���]";
				mes "��x�ɍw���o����̂�";
				mes "1000�܂ł���B";
				continue;
			}
			if('@num == 0) {
				mes "[�e�e�̔���]";
				mes "����H";
				mes getitemname('@itemid)+ "�͕K�v�Ȃ��̂��ȁH";
				continue;
			}
			if(Zeny < '@price*'@num) {
				mes "[�e�e�̔���]";
				mes "�ǂ����";
				mes "����������Ȃ��݂�������H";
				continue;
			}
			if(!checkweight('@itemid,'@num)) {
				mes "�ǂ����";
				mes "����Ȃɂ��ĂȂ��݂�������H";
				continue;
			}
			mes "[�e�e�̔���]";
			mes "�͂��A�ǂ����B";
			mes "�񑩂̏��i����B";
			set Zeny,Zeny-'@price*'@num;
			getitem '@itemid,'@num;
		}
	} else {
		next;
		set '@novice, callfunc("AC_GetNovice");
		if ('@novice) {
			mes "[�e�e�̔���]";
			mes "�\����Ȃ����ǁA";
			mes "�K���X�����K�[�ȊO�ɂ�";
			mes "�e�ۂ𔄂邱�Ƃ͏o���Ȃ��񂾁B";
			close;
		} else {
			mes "[�e�e�̔���]";
			mes "�\����Ȃ����ǁA";
			mes "�n���̖`���҂̕��ɂ�";
			mes "�e�ۂ𔄂邱�Ƃ͏o���Ȃ��񂾁B";
			mes "�삯�o���̖`���҂̂��߂�";
			mes "�݌ɂ�����Ă����K�v������񂾁B";
			close;
		}
	}
	end;
OnInit:
	waitingroom "�e�e �̔���", 0;
	end;
}

//------------------------------------------------------------------------------
// ������ 1F

//�J�v���T�[�r�X�|�X�g
ac_cl_area.gat,41,145,4	script	�J�v���T�[�r�X	888,{
	mes "�](��)�J�v���T�[�r�X�́A";
	mes "�����F�l�̂��΂Ɂ]";
	mes " ";
	mes "�]�ǂ̃T�[�r�X�𗘗p����H�]";
	next;
	switch(select("�ʒu�Z�[�u�T�[�r�X","�q�ɃT�[�r�X -> 0z","���ӏ�����ǂ�","��߂�")){
	case 1:
		savepoint "ac_cl_area.gat",48,128;
		mes "�]�Z�[�u���܂����]";
		mes "�]�����p���肪�Ƃ��������܂��]";
		mes " ";
		mes "�](��)�J�v���T�[�r�X�́A";
		mes "�����F�l�̂��΂Ɂ]";
		close;
	case 2:
		if(basicskillcheck() && ((getskilllv(1) < 6 && Job != Job_Summoner) || (getskilllv(5018) < 1 && Job == Job_Summoner))) {
			mes "�]�q�ɂ͊�{�X�L�����x��6��";
			mes "�K�����Ă��痘�p�\�ƂȂ�܂��]";
			mes " ";
			mes "�](��)�J�v���T�[�r�X�́A";
			mes "�����F�l�̂��΂Ɂ]";
			close;
		}
		openstorage;
		close;
	case 3:
		mes "�]�A�J�f�~�[�̑q�ɂ�";
		mes "�����ŗ��p�ł���q�ɂł��]";
		mes "�]�q�ɂ͂��ꂢ�Ɏg���܂��傤�]";
		close;
	default:
		mes "�]���p����̂���߂��]";
		close;
	}
	end;
}

//�~�b�h
ac_cl_area.gat,45,146,4	script	�~�b�h#ac_area	429,{
	set '@novice, callfunc("AC_GetNovice");
	cutin "jpn_mid01",2;
	if(AC_PASSPORT==2){
		mes "[�~�b�h]";
		mes "����ɂ��́I";
		mes "�`���҃A�J�f�~�[��";
		mes "���w���߂łƂ��I";
		next;
		mes "[�~�b�h]";
		mes "�`���҃A�J�f�~�[��";
		mes "���E���̖`���҂̂��߂�";
		mes "�ݗ����ꂽ�w�Z�Ȃ񂾁B";
		mes "�킩��Ȃ�������������A";
		mes "��y��搶�B�ɕ����Ă݂ĂˁB";
		next;
		mes "[�~�b�h]";
		mes "���w�j�ɃL�~�Ƀv���[���g�������B";
		next;
		set AC_PASSPORT,5;
		if(!checkweight(5406,1)){
			mes "[�~�b�h]";
			mes "����H";
			mes "�ו��������ς��݂������ˁB";
			mes "��R�̎�ނ����������Ă���";
			mes "�݂������ˁB";
			mes "������Ǝ�ސ������炵�Ă��ĂˁB";
			goto L_END;
		}
		getitem 5406,1;
		set AC_PASSPORT,3; // �V�����j������
		mes "[�~�b�h]";
		mes ('@novice ?"����𑕔����āA�撣���ĂˁI":"�L�~�ɂ͕K�v�Ȃ���������Ȃ�����");
		mes "����Ŗ`���҃A�J�f�~�[�̈�����I";
		goto L_END;
	}
	if(AC_PASSPORT==5){
		mes "[�~�b�h]";
		mes "�ו��͌y�����Ă��������H";
		mes "�����A���w�j����I";
		next;
		mes "�]�����A�C�e���̎�ސ���2�ȏ��";
		mes "�󂫂����邱�Ƃ��m�F���Ă��������]";
		mes "�]�󂫂��Ȃ���ԂŁu�͂��v��";
		mes "�I�������ꍇ�́A�A�C�e����";
		mes "���X�g����\��������܂��]";
		next;
		mes "�]�󂫂��Ȃ��ꍇ�́A";
		mes "��U�u�������v��I�����A";
		mes "�A�C�e���̎�ސ���2�ȏ�";
		mes "�󂯂Ă���ēx�b�������Ă��������]";
		mes "�]�A�C�e�����󂯎��܂����H�]";
		next;
		if(select("������","�͂�")==1){
			mes "[" + strcharinfo(0) + "]";
			mes "(�A�C�e�������m�F���Ă݂悤�B)";
			close;
		}
		if(!checkweight(5406,1)){
			mes "[�~�b�h]";
			mes "����H";
			mes "�ו��������ς��݂������ˁB";
			mes "��R�̎�ނ����������Ă���";
			mes "�݂������ˁB";
			mes "������Ǝ�ސ������炵�Ă��ĂˁB";
			goto L_END;
		}
		getitem 5406,1;
		set AC_PASSPORT,3; // �V�����j������
		mes "[�~�b�h]";
		mes ('@novice ?"����𑕔����āA�撣���ĂˁI":"�L�~�ɂ͕K�v�Ȃ���������Ȃ�����");
		mes "����Ŗ`���҃A�J�f�~�[�̈�����I";
		goto L_END;
	}
	if(AC_RANK==7){ // ���S�҈ȊO�������Ȃ̂łƂ肠�������ʂł��B
		mes "[�~�b�h]";
		mes "�ꎟ�ے��C���������i���߂łƂ��I";
		mes "�ꎟ�ے��C���̂��j����";
		mes "�N�ɂ͂���������悤�I";
		next;
		if(!checkweight(2751,10)){
			mes "[�~�b�h]";
			mes "����H";
			mes "�ו��������ς��݂������ˁB";
			mes "��R�̎�ނ����������Ă���";
			mes "�݂������ˁB";
			mes "������Ǝ�ސ������炵�Ă��ĂˁB";
			goto L_END; 
		}
		getitem 2751,1;
		set AC_RANK,8;
		mes "[�~�b�h]";
		mes "���̃o�b�W��";
		mes "�ꎟ�ߒ��C���̏؂���I";
		mes "���𒣂��āA���ɂ��ĂˁI";
		next;
		mes "[�~�b�h]";
		mes "�ꎟ�ߒ��͏I���������ǁA";
		mes "�N�̖`���͂܂����ꂩ�炾�I";
		mes "���͌N�����S�҂̊F��";
		mes "�����Ă����Ԃ��ˁI";
		goto L_END;
	}
	if('@novice && AC_RANK<7){
		switch(AC_RANK){
		case 0:
			mes "[�~�b�h]";
			mes "����ɂ��́I";
			mes "�`���҃A�J�f�~�[�ɂ悤�����I";
			next;
			if(AC_CREDIT>0){
				mes "[�~�b�h]";
				mes "�N�͂܂������ĊԂ��Ȃ��悤���ˁB";
				mes "�܂��킩��Ȃ����Ƃ΂��肾�낤���ǁA";
				mes "�������o���Ă������I";
				mes "�A�J�f�~�[�̂��Ƃɂ��ĂȂ�A";
				mes "�l�ɉ��ł������Ă���Ă�����B";
				break;
			}
			// 2010/05/25 �A�J�f�~�[���v �|�����c�Q��I�Œǉ��B
			mes "[�~�b�h]";
			mes "�N�͂܂������ĊԂ��Ȃ��悤���ˁB";
			mes "�܂��������߂Ė����Ȃ�A";
			mes "^FF0000���[���̎d��^000000��";
			mes "��`�����肷��̂����������B";
			mes "�����Ȉ˗������邩��A";
			mes "���E���������Ǝv����B";
			next;
			mes "[�~�b�h]";
			mes "^FF0000���[��^000000�͖l�̂����ׂɂ���";
			mes "�s���N�F�̔���������������B";
			mes "�ڂ����b�̓��[������";
			mes "�����Ă݂ĂˁB";
			next;
			mes "[�~�b�h]";
			mes "�����Ƀ����X�^�[�Ɛ퓬���āA";
			mes "�r���߂����������Ȃ�A";
			mes "^FF0000���K������ʎ�^000000��";
			mes "�s���̂��������ȁB";
			next;
			mes "[�~�b�h]";
			mes "�킢�ɍs���Ƃ���";
			mes "��t��u�K�̎��ɓn���ꂽ";
			mes "�����i��񕜃A�C�e����";
			mes "������Y�ꂸ�ɂˁB";
			next;
			mes "[�~�b�h]";
			mes "^FF0000���K������ʎ�^000000�̓������";
			mes "�������獶��ɍs�������ɂ����B";
			mes "�߂��Ƀ|�����c�Ɩ�����Ă���";
			mes "^0000FF�~�X�e�B^000000������͂����B";
			next;
			mes "[�~�b�h]";
			mes "�܂��킩��Ȃ����Ƃ΂��肾�낤���ǁA";
			mes "�������o���Ă������I";
			mes "�A�J�f�~�[�̂��Ƃɂ��ĂȂ�A";
			mes "�l�ɉ��ł������Ă���Ă�����B";
			break;
		case 1:
			mes "[�~�b�h]";
			mes "�₟�A�N�����B";
			mes "�����A�J�f�~�[�ɂ͊��ꂽ���ȁH";
			mes "�����l�ɕ����������Ƃł�";
			mes "����̂��ȁH";
			break;
		case 2:case 3:case 4: //��������������Ȃ�
			mes "[�~�b�h]";
			mes "�₟�A�N�����B";
			mes "�N�������ԁA";
			mes "�A�J�f�~�[�ɓ����ł����ˁB";
			mes "�����l�ɕ����������Ƃł�";
			mes "����̂��ȁH";
			break;
		case 5:
			mes "[�~�b�h]";
			mes "�₟�A�N�����B";
			mes "�N�A�搶�̒��ł͐��їD�G������";
			mes "�\����B";
			mes "�����������ߒ��C�����ˁB";
			mes "�撣���ĂˁI";
			mes "�����͉����l�ɂ悤�����H";
			break;
		case 6:
			mes "[�~�b�h]";
			mes "����ɂ��́I";
			mes "�`���҃A�J�f�~�[�ɂ悤�����I";
			next;
			mes "[�~�b�h]";
			mes "���̃A�J�f�~�[�̂��ƂȂ�A�Ȃ�ł�";
			mes "�l�ɕ����Ă���I";
			mes "�c�c�Ƃ����Ă��A�����N��";
			mes "�������邱�Ƃ͂Ȃ��̂��ȁH";
			mes "���������ꎟ�ے��C�����ˁI";
			mes "�����͉����l�ɂ悤�����H";
			break;
		}
	} else {
		mes "[�~�b�h]";
		mes "�₟�A����ɂ��́I";
		mes "�����͖l�ɉ��̂悤�����H";
	}
	next;
	if('@novice){ menu "�ǂ������炢���̂�����",L_TODO,"�厖�Șb�𕷂��Ȃ���",L_IMPORTANT,"�`���҃A�J�f�~�[�ɂ���",L_ABOUT,"�w�Z���ɂ���",L_SCHOOL,"���E�n�}���݂���",L_VIEWWORLD,"�E�Ƃ̏����ق���",L_GIVEBOOK,"�G�k������",L_TALK; }
	else { menu "�`���҃A�J�f�~�[�ɂ���",L_ABOUT,"�w�Z���ɂ���",L_SCHOOL,"���E�n�}���݂���",L_VIEWWORLD,"�G�k������",L_TALK; }
L_TODO:
	// 2010/05/25 �A�J�f�~�[���v �|�����c�Q��I�Œǉ��B
	//�ǂ������炢���̂�����
	mes "[�~�b�h]";
	mes "���[�ƁA�������ȁB";
	L_REP_01:
	mes "�܂��́A�������󂯂邽�߂ɁA";
	mes "�P�ʂ��擾���邱�Ƃ��K�v���ˁB";
	next;
	mes "[�~�b�h]";
	mes "�P�ʂ��擾����ɂ�";
	mes "^0000FF���[��^000000�̎�`�������邩�A";
	mes "^000000�|�����c�̃~�X�e�B�[^000000�B��";
	mes "�菕��������Ƃ����ˁB";
	next;
	mes "[�~�b�h]";
	mes "�P�ʂ��擾�ł�����A���[������";
	mes "^FF0000���ߒ��̎���^000000���󂯂�Ƃ����B";
	mes "�����͂��������邩��A";
	mes "���ԂɃN���A���Ă������B";
	next;
	mes "[�~�b�h]";
	mes "�����āA���ߒ������ׂďC��������A";
	mes "�L�O��^FF0000�A�J�f�~�[�o�b�W[0]^000000��";
	mes "�N�Ƀv���[���g�����I";
	next;
	mes "[�C���t�H���[�V����]";
	mes "�A�J�f�~�[�o�b�W[0]��";
	mes "���ʂ��m�F���܂����H";
	next;
	if(select("�͂�","������")==1){
		mes "[�C���t�H���[�V����]";
		mes "�]�A�J�f�~�[�o�b�W[0]�]";
		mes "��1�ߒ��C���ł��炦��";
		mes "�A�J�f�~�[�̃o�b�W�B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]�A�J�f�~�[�o�b�W[0]�]";
		mes "�o�b�W�̌`�ɂ�";
		mes "��l�O�̖`���҂�";
		mes "�m����~�����̂�";
		mes "�������Ă�����悤�ɂ�";
		mes "�F�肪���߂��Ă���B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]�A�J�f�~�[�o�b�W[0]�]";
		mes "BaseLv79�ȉ��̎��A";
		mes "MaxHP + 400";
		mes "MaxSP + 200";
		mes "�n�� : ^777777�A�N�Z�T���[^000000";
		mes "�h�� : ^7777770^000000";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]�A�J�f�~�[�o�b�W[0]�]";
		mes "�d�� : ^77777710^000000";
		mes "���� : ^777777�S�Ă̐E��^000000";
		mes "@next";
		mes "[�C���t�H���[�V����]";
		mes "�]������x�~�b�h�̘b��";
		mes "�����܂����H�]";
		next;
		if(select("�͂��A������x����","�������A�K�v�Ȃ�")==1){
			mes "[�~�b�h]";
			mes "�悵�A������x�������悤�B";
			goto L_REP_01;
		}
	}
	mes "[�~�b�h]";
	mes "���ꂶ��A����΂��ĂˁB";
	mes "�킩��Ȃ����Ƃ���������A";
	mes "�l�ɉ��ł������Ă����B";
	goto L_END;
L_IMPORTANT:
	//�厖�Șb�𕷂��Ȃ���(������)
	mes "[�~�b�h]";
	mes "����H";
	mes "���A�N�ɐ������Ă�������";
	mes "���Ƃ͖����݂�������B";
	next;
	menu "��߂�";
	mes "[�~�b�h]";
	mes "���ɕ����������Ƃ���������A";
	mes "�l�ɕ����ĂˁB";
	goto L_END;
L_ABOUT:
	mes "[�~�b�h]";
	mes "�`���҃A�J�f�~�[�͖`���҂̂��߂�";
	mes "�ݗ����ꂽ�w�Z����B";
	mes "�킩��Ȃ�������������A";
	mes "��y��搶�ɕ����āA";
	mes "���낢��Ƌ�����Ă݂ĂˁB";
	next;
	mes "[�~�b�h]";
	mes "�`���҃A�J�f�~�[�ł�";
	mes "��l�O�̖`���҂ɂȂ�܂�";
	mes "���낢��ȃT�|�[�g��";
	mes "�s���Ă����B";
	next;
	mes "[�~�b�h]";
	mes "�`���҃A�J�f�~�[��";
	mes "��l�O�Ƃ��ĔF�߂���ɂ�";
	mes "����������񂾁B";
	mes "1�ABaselv56�ȏ�ɂȂ����I";
	mes "2�A2���E�ȏ�̐E�Ƃɂ����I";
	mes "3�A���܂�ς��I";
	next;
	if(!'@novice){
		mes "[�~�b�h]";
		mes "�L�~�͂�����l�O�̖`���҂��ˁI";
		mes "�`���҂̐�y�Ƃ��āA";
		mes "�삯�o���̖`���҂�";
		mes "�����Ăق����ȁI";
		goto L_END;
	}
	mes "[�~�b�h]";
	mes "�ǂꂩ��ł�������";
	mes "���Ă͂܂�΁A��l�O���I";
	mes "��l�O�ɂȂ�܂ł́A";
	mes "�F�ꏏ�̋삯�o���̖`���ҁB";
	mes "�����Œ��Ԃ������Đ��E��";
	mes "���낢�도���Ă݂�Ƃ�����I";
	goto L_END;
L_SCHOOL:
	mes "[�~�b�h]";
	mes "�ǂ̏ꏊ�ɂ��ĕ��������񂾂��H";
	next;
	switch(select("1F �u�K��","1F ���K��","1F ���K��","1F �̔�","1F �}����","2F ������","2F ������","�����������Ƃ͖���")) {
	case 1:
		mes "[�~�b�h]";
		mes "�u�K�����ˁB";
		mes "�u�K���ł͋삯�o����";
		mes "�`���҂̂��߂̍u�`��";
		mes "�s���Ă����B";
		next;
		mes "[�~�b�h]";
		mes "�v�����A�A���f�B�A�t�F������";
		mes "�`���ɕK�v�Ȋ�b�m����";
		mes "�w�Ԃ��Ƃ��o����񂾁B";
		next;
		mes "[�~�b�h]";
		mes "�u�K���͂���";
		mes "[������1F]�ׂ̗ɂ����B";
		mes "���̕����ɂ���Ŕ�T���Ă݂ĂˁB";
		next;
		goto L_SCHOOL;
	case 2:
		mes "[�~�b�h]";
		mes "���K�����ˁB";
		mes "���K���ł͂����ȃA�h�o�C�X��";
		mes "�s���Ă���񂾁B";
		mes "���������Ƃ���������A";
		mes "�s���Ă݂�Ƃ�����B";
		next;
		mes "[�~�b�h]";
		mes "���e�B�[����͐E�Ƃɂ��āA";
		mes "�t�B�[����̓N�G�X�g�X�L����";
		mes "���āA�����āA���^�����";
		mes "�]�E�N�G�X�g�ɂ��ẴA�h�o�C�X��";
		mes "������͂�����B";
		next;
		mes "[�~�b�h]";
		mes "���K���͂���[������1F]��";
		mes "�ׂɂ����B";
		mes "���̕����ɂ���Ŕ�T���Ă݂ĂˁB";
		next;
		goto L_SCHOOL;
	case 3:
		mes "[�~�b�h]";
		mes "���K���E���ʎ����ˁB";
		mes "���K���ł͗l�X�ȃ����X�^�[��";
		mes "�������Ă��āA������A";
		mes "�����X�^�[�Ƃ̐퓬���K��";
		mes "�s�����Ƃ��o����񂾁B";
		next;
		mes "[�~�b�h]";
		mes "���K���́A�N�����̋����ɂ����";
		mes "�J�������ꏊ���Ⴄ����A";
		mes "������ꏊ���o���Ă����ĂˁB";
		next;
		mes "[�~�b�h]";
		mes "���J�o���[�v���[�g��";
		mes "�`���҃A�J�f�~�[���S�Ă�";
		mes "���p�ł���A���l���ł̒�����";
		mes "�s���ׂ̎{�݂ɂȂ��B";
		next;
		//mes "[�~�b�h]";
		//mes "��l���p�[�e�B�ŗ��p����ƁA";
		//mes "�����⃂���X�^�[�Ƃ̐퓬���K��";
		//mes "�y�ɂȂ邩��A���p���Ă݂ĂˁB";
		//mes "�������A���l���p�[�e�B�ł�";
		//mes "���p�ł��邯�ǁA�l�������Ȃ��ق�";
		//mes "���ʂ��Ⴍ�Ȃ邩��C�����ĂˁB";
		//next;
		//mes "[�~�b�h]";
		//mes "lv1�`lv25�Alv20�`lv35�Alv30�`lv45";
		//mes "�p�̎��K����";
		//mes "����[������1F]�ׂ̗ɂ����B";
		//mes "���̕����ɂ���Ŕ�T���Ă݂ĂˁB";
		//next;
		//mes "[�~�b�h]";
		//mes "���ɂ��B���ꂽ���K����";
		//mes "����炵�����ǂˁB";
		//next;
		//goto L_SCHOOL;
		//2010/04/13�C��
		mes "[�~�b�h]";
		mes "�㋉�҂ɂȂ�΂Ȃ�ق�";
		mes "���J�o���[�����s���鎞��";
		mes "^FF0000�p���[���K�v^000000�ɂȂ�B";
		mes "�㋉�҂́A�p���[�̏[�d��";
		mes "���Ԃ������邩��A";
		mes "���ӂ��K�v����B";
		next;
		goto L_SCHOOL;
	case 4:
		mes "[�~�b�h]";
		mes "����[������1F]��";
		mes "�ׂɂ��鋳�����z�[���ɂ�";
		mes "���낢��ȑ�������葵���Ă���";
		mes "�̔����������Ă����B";
		next;
		mes "[�~�b�h]";
		mes "��{�I�Ȃ��̂�";
		mes "��̂�����Ă��邩��A";
		mes "���p���Ă݂ĂˁB";
		next;
		goto L_SCHOOL;
	case 5:
		mes "[�~�b�h]";
		mes "�G���g�����X�z�[���ׂ̗ɂ���";
		mes "�}�����ł́A�l�X�Ȃ��Ƃ�";
		mes "���ׂ邱�Ƃ��o�����B";
		next;
		mes "[�~�b�h]";
		mes "��{�I�ȑ�����@��������Ȃ��āA";
		mes "�X���ł悭���������b��";
		mes "�X�L���ɂ��Ă̏ڍׂȂǁA";
		mes "����Ȃ����Ƃ������";
		mes "�����ɒ��ׂ���񂾁B";
		next;
		goto L_SCHOOL;
	case 6:
		mes "[�~�b�h]";
		mes "[������2F]�ɂ�";
		mes "�������������B";
		next;
		mes "[�~�b�h]";
		mes "���[�����玎�����󂯂�悤��";
		mes "����ꂽ��A�������ɂ���";
		mes "�K���h�ɘb��������";
		mes "�������󂯂ĂˁB";
		next;
		goto L_SCHOOL;
	case 7:
		mes "[�~�b�h]";
		mes "[������2F]�ɂ�";
		mes "�������������B";
		next;
		mes "[�~�b�h]";
		mes "�������ɂ��郈���ꂳ���";
		mes "�Ƃ��Ă����m�肾����A";
		mes "���낢��ȏꏊ��m���Ă���񂾁B";
		next;
		goto L_SCHOOL;
	case 8:
		mes "[�~�b�h]";
		mes "�܂����������Ȃ�����A�����ł�B";
		goto L_END;
	}
	goto L_END;
	
L_VIEWWORLD:
	cutin "jpn_mid01",255;
	cutin "world_map_001",3;
	mes "[�~�b�h]";
	mes "���ꂪ�~�b�h�K���h�嗤������";
	mes "���E�n�}����B";
	next;
	mes "[�~�b�h]";
	mes "���E���ɂ͑����̖`���҂�";
	mes "�������Ă���B";
	mes "�����̓s�s�����݂��A";
	mes "�l�X�Ȑl�X����炵�Ă���񂾁B";
	next;
	mes "[�~�b�h]";
	mes "���̒n�}�ɏ�����Ă������";
	mes "�ȊO�ɂ����͂����B";
	mes "�V����������������A";
	mes "�`���̓r���ŗ�������Ă݂Ă�";
	mes "���������ˁB";
	close;
L_GIVEBOOK:
	//2010/04/13�ǉ�
	mes "[�~�b�h]";
	mes "�E�Ƃ̏����ق����̂����H";
	next;
	if(select("�͂�","������")==2){
		mes "[�~�b�h]";
		mes "����H";
		mes "����Ȃ��̂����B";
		mes "���������肵���̂�������A";
		mes "�l���{�����Ă��Ă邩��A";
		mes "�����邩��ˁB";
		goto L_END;
	}
	if(checkweight(11055,1)) {
		switch(Job){
			case Job_Swordman:    getitem 11025,1; break; //�\�[�h�}���̏�
			case Job_Thief:       getitem 11028,1; break; //�V�[�t�̏�
			case Job_Archer:      getitem 11031,1; break; //�A�[�`���[�̏�
			case Job_Acolyte:     getitem 11034,1; break; //�A�R���C�g�̏�
			case Job_Magician:    getitem 11037,1; break; //�}�W�V�����̏�
			case Job_Merchant:    getitem 11040,1; break; //�}�[�`�����g�̏�
			case Job_TaeKwon:     getitem 11043,1; break; //�e�R���L�b�h�̏�
			case Job_Ninja:       getitem 11046,1; break; //�E�҂̏�
			case Job_Gunslinger:  getitem 11049,1; break; //�K���X�����K�[�̏�
			case Job_SuperNovice: getitem 11052,1; break; //�X�[�p�[�m�[�r�X�̏�
			default: getitem 11055,1;
		}
		mes "[�~�b�h]";
		mes "�͂��B";
		mes "���ꂶ��A����΂��āB";
		mes " ";
		mes "�]�~�b�h���{��n���Ă��ꂽ�]";
		goto L_END;
	}
	//������
	mes "[�~�b�h]";
	mes "�N�͎�������������������";
	mes "�ق��������ˁB";
	mes "�厖�ȕ��̓J�v���T�[�r�X��";
	mes "���p���ĕۊǂ��āA";
	mes "����Ȃ����̂͏��l�ɔ���Ƃ�����B";
	goto L_END;
L_TALK:
	switch(rand(12)){
	case 0:
		mes "[�~�b�h]";
		mes "�`���҃A�J�f�~�[�̃}�[�N��";
		mes "�^�̒m�b�A���҂̐΂�\���A";
		mes "�Z䊐����炫�Ă���񂾂�B";
		goto L_END;
	case 1:
		mes "[�~�b�h]";
		mes "���̊w�Z�ɂ͍��̐}�����Ƃ�";
		mes "�Ⴄ�}����������炵����B";
		next;
		mes "[�~�b�h]";
		mes "�l���ڂ������Ƃ�";
		mes "�S���킩��Ȃ��񂾂��ǂˁB";
		goto L_END;
	case 2:
		mes "[�~�b�h]";
		mes "���邱�Ƃ������č����Ă���̂����H";
		next;
		mes "[�~�b�h]";
		mes "����Ȃ�A���[���ɘb�𕷂��Ă݂Ă�B";
		mes "�`���҃A�J�f�~�[��";
		mes "�悹����˗���";
		mes "�ڂ����������Ă�����B";
		goto L_END;
	case 3:
		mes "[�~�b�h]";
		mes "�B���ꂽ���K����";
		mes "���Ēm���Ă��邩���H";
		next;
		mes "[�~�b�h]";
		mes "�Ȃ�ł��A�������z�[���̂ǂ�����";
		mes "�̂͊J������Ă������K����";
		mes "����炵���񂾁B";
		next;
		mes "[�~�b�h]";
		mes "���̎��K���́A���ԂȂ�����";
		mes "�����ŕ��󂳂ꂽ���ĉ\����B";
		goto L_END;
	case 4:
		mes "[�~�b�h]";
		mes "���͂�������Đ搶�����Ă��邯��";
		mes "�l���͖̂`���҂������񂾁B";
		mes "���e�B�G���Ă����X�ɂ�������";
		mes "���������Ȃ��B";
		next;
		mes "[�~�b�h]";
		mes "���܂�ď��߂�";
		mes "��Ƃ������̂������񂾁B";
		mes "������Ɗ����������ǁA";
		mes "�y����������B";
		next;
		mes "[�~�b�h]";
		mes "�l�̏ꍇ��";
		mes "�A���f�o�����ɂ����T���^����";
		mes "�]�����Ă��ꂽ�񂾂��ǁB";
		mes "��������̂��ȁH";
		goto L_END;
	case 5:
		mes "[�~�b�h]";
		mes "���̃A�J�f�~�[��";
		mes "�F�̊�t�ɂ���Đ��藧���Ă���񂾁B";
		next;
		mes "[�~�b�h]";
		mes "�F�A�N�̂悤�Ȃ��΂炵���`���҂�";
		mes "�S����҂���тĂ���񂾂�B";
		goto L_END;
	case 6:
		mes "[�~�b�h]";
		mes "�N�͎��҂̐��E��M���邩���H";
		mes "�F�ɂ͐M���Ă��炦�Ȃ����ǁA";
		mes "�l�͎��҂̐��E��";
		mes "���������Ƃ�����񂾁B";
		next;
		mes "[�~�b�h]";
		mes "���҂̐��E�͖{���ɂ���񂾂�B";
		mes "����͊m���A�E���o����";
		mes "�o���W�[�W�����v�ɒ��킵����";
		mes "���������ȁc�c";
		next;
		mes "[�~�b�h]";
		mes "�ڂ������Ƃ�";
		mes "�����o���ĂȂ��񂾂��ǁA";
		mes "���̑̌��͖�����Ȃ�������";
		mes "�M���Ă���񂾁B";
		goto L_END;
	case 7:
		mes "[�~�b�h]";
		mes "���[���͂ƂĂ��������肵�Ă���";
		mes "�悤�Ɍ����邾�낤�H";
		next;
		mes "[�~�b�h]";
		mes "�ł��A���͂Ƃ��Ă�";
		mes "�Â����ɖڂ������񂾂�B";
		next;
		mes "[�~�b�h]";
		mes "�̂͂悭�A�A�C�X�N���[����";
		mes "�����炳�ꂽ�Ȃ��c�c";
		goto L_END;
	case 8:
		mes "[�~�b�h]";
		mes "�`���҃A�J�f�~�[�ł�";
		mes "��R�̖`���҂����Ă���񂾁B";
		next;
		mes "[�~�b�h]";
		mes "�N�̒m�荇���ŁA�܂�";
		mes "�A�J�f�~�[�ɓ����Ă��Ȃ��l��������A";
		mes "���ЁA���������Ă݂Ă�ˁB";
		goto L_END;
	case 9:
		mes "[�~�b�h]";
		mes "���̊w�Z�ɂ͂ƂĂ��L����";
		mes "�搶������񂾁B";
		next;
		mes "[�~�b�h]";
		mes "�����X�^�[�̌�����";
		mes "���Ă���搶�Ȃ񂾂��ǁA";
		mes "�����c�c";
		mes "���₿����Ƃ�����ĂĂˁI";
		next;
		mes "[�~�b�h]";
		mes "�ǂ��ς���Ă���̂��́A";
		mes "���ۂɉ���Ă݂��";
		mes "�����ɂ킩���I";
		goto L_END;
	case 10:
		mes "[�~�b�h]";
		mes "���������΂��̑O�A�Z����";
		mes "���̎{�݂��g������������";
		mes "�����Ă��Ȃ��B";
		next;
		mes "[�~�b�h]";
		mes "���΂炭�͖������������ǁA";
		mes "�����A�Z�ɂ��傫���Ȃ邩��";
		mes "����Ȃ��ˁB";
		goto L_END;
	case 11:
		mes "[�~�b�h]";
		mes "2�K�ɂ��郈���ꂳ��ɂ�";
		mes "���������������H";
		next;
		mes "[�~�b�h]";
		mes "�ނ́A�{���D�������āA";
		mes "�����Ǝ������ɓ���Z���Ă���񂾁B";
		next;
		mes "[�~�b�h]";
		mes "�c�c�ނ̎d���͈�̂Ȃ�Ȃ񂾂낤�H";
		goto L_END;
	}
L_END:
	close2;
	cutin "jpn_mid01",255;
	end;
OnInit:
	waitingroom "���S�҂͂������", 0;
	end;
}


//���b�h
ac_cl_area.gat,61,166,4	script	���b�h#AC	704,{
	set '@novice, callfunc("AC_GetNovice");
	if (!'@novice) {
		mes "[���b�h]";
		mes "����ɂ��́B";
		mes strcharinfo(0)+ "����";
		mes "���̗͕͂K�v�Ȃ��݂����ł��ˁB";
		mes "���ꂩ��̓A�J�f�~�[�������łȂ��A";
		mes "�����ȂƂ���𗷂��Ă݂Ă��������B";
		close;
	}
	mes "[���b�h]";
	mes strcharinfo(0)+ "����A";
	mes "���͂����ŃJ�[�g�݂̑��o����";
	mes "�s���Ă����ł���B";
	next;
	mes "[���b�h]";
	mes "�J�[�g�𗘗p���܂����H";
	mes "�����ł���B";
	next;
	switch(select("�J�[�g�𗘗p����","�J�[�g�̗��p�ɂ���","����ς��߂�")){
	case 1:
		if(Job!=Job_Merchant && Job!=Job_SuperNovice){
			mes "[���b�h]";
			mes "����H";
			mes "�J�[�g�͏��l��";
			mes "���̏�ʐE�A��������";
			mes "�X�[�p�[�m�[�r�X�łȂ���";
			mes "���p�ł��܂����B";
			close;
		}
		setcart;
		mes "[���b�h]";
		mes "�܂��K�v�ɂȂ�����";
		mes "���炵�Ă��������ˁB";
		close;
	case 2:
		mes "[���b�h]";
		mes "�J�[�g�͏��l�Ƃ��̏�ʐE�A";
		mes "����ƃX�[�p�[�m�[�r�X��";
		mes "���p�ł����ł��B";
		mes "�u�v�b�V���J�[�g�v�X�L����";
		mes "�K�����Ȃ��Ɨ��p���邱�Ƃ�";
		mes "�ł��܂����B";
		close;
	default:
		mes "[���b�h]";
		mes "���ꂶ��A�܂��B";
		close;
	}
OnInit:
	waitingroom "�J�[�g�݂̑��o��",0;
}

//�^�[��
ac_cl_area.gat,57,173,2	script	�^�[��#AC	931,{
	set '@novice, callfunc("AC_GetNovice");
	if ('@novice) {
		if(AC_RANK==0){
			mes "[�^�[��]";
			mes "���A";
			mes strcharinfo(0)+ "����";
			mes "�ł��ˁB";
			mes "�l�͂����œ]���̂���`����";
			mes "�����Ă�����Ă��ł��B";
		} else
		if(AC_RANK<3){
			mes "[�^�[��]";
			mes strcharinfo(0)+ "����";
			mes "����Ȃ��ł����B";
			mes "���������q�����݂����ł��ˁB";
		} else
		if(AC_RANK<=6){
			mes "[�^�[��]";
			mes "�劈�􂵂Ă�݂����ł��ˁB";
			mes strcharinfo(0)+ "����";
			mes "���x�A���̘b�ł��������Ă��������B";
		} else
		if(AC_RANK>=7){
			mes "[�^�[��]";
			mes "���h�ɂȂ�܂����ˁB";
			mes strcharinfo(0)+ "����";
			mes "�Ȃ�A���ł��ł������ł��ˁB";
		}
		next;
		if(Job==Job_Novice) goto L_NOVICE;
		mes "[�^�[��]";
		mes "�ǂ��ɍs���܂����H";
		mes "�A�J�f�~�[�̓o�^�n�_��";
		mes "�����ł���B";
		next;
		if('mapprice==0) {
			setarray 'mapprice,  500,400,350,300,250,200
								,400,300,250,200,150,100
								,650,600,500,400,300,200
								,750,700,600,500,400,300
								,750,700,600,500,400,300
								,650,600,500,400,300,200;
		}
		set '@rank,(AC_RANK < 5 ? AC_RANK : 5);
		set '@num, select(
			"�v�����e�� -> " +(AC_SAVE_MAP!=0 ? 'mapprice[    '@rank] : 0)+ "z",
			"�C�Y���[�h -> " +(AC_SAVE_MAP!=1 ? 'mapprice[1*6+'@rank] : 0)+ "z",
			"�����N -> "     +(AC_SAVE_MAP!=2 ? 'mapprice[2*6+'@rank] : 0)+ "z",
			"�A���x���^ -> " +(AC_SAVE_MAP!=3 ? 'mapprice[3*6+'@rank] : 0)+ "z",
			"�Q�t�F�� -> "   +(AC_SAVE_MAP!=4 ? 'mapprice[4*6+'@rank] : 0)+ "z",
			"�t�F�C���� -> " +(AC_SAVE_MAP!=5 ? 'mapprice[5*6+'@rank] : 0)+ "z",
			"����ς��߂�")-1;
		if ('@num==6) goto L_CANCEL;
		set '@price,(AC_SAVE_MAP!='@num ? 'mapprice['@num]['@rank] : 0);
		if(Zeny<'@price) {
			mes "[�^�[��]";
			mes "�����ƁA����������܂����B";
			mes "�܂����Ă��������ˁB";
			close;
		}
		mes "[�^�[��]";
		mes "���ꂶ��A�]�����܂��ˁB";
		close2;
		set Zeny,Zeny-'@price;
		callfunc "AC_WarpTown",'@num;
		end;

	} else {
		mes "[�^�[��]";
		mes "����ɂ��́B";
		mes strcharinfo(0)+ "����";
		mes "���������C�����ł��ˁB";
		next;
		mes "[�^�[��]";
		mes "���Ȃ��ɂ�";
		mes "�l�̗͕͂K�v�Ȃ��݂����ł��ˁB";
		mes "�A�J�f�~�[�̐�y�Ƃ��āA";
		mes "��y�����Ă����Ă��������B";
		mes " ";
		mes "�o�^�����X�֖߂�܂����H";
		next;
		menu "�߂�",L_RETURN,"�߂�Ȃ�",-;
		mes "[�^�[��]";
		mes "�߂肽���Ȃ�����A";
		mes "���ł������Ă��������ˁB";
		close;
	L_RETURN:
		mes "[�^�[��]";
		mes "���ꂶ��A�]�����܂��ˁB";
		close2;
		callfunc "AC_WarpTown",AC_SAVE_MAP;
		end;
	}
L_NOVICE:
	mes "[�^�[��]";
	mes "���Ȃ��̓m�[�r�X�̕��ł��ˁB";
	mes "�m�[�r�X�̕��ɂ�";
	mes "�]�E�̃T�|�[�g��";
	mes "�����ōs���Ă��܂���B";
	mes " ";
	mes "�ǂ��ɍs���܂����H";
	next;
	set '@num,select("�v�����e�� -> 0z","�C�Y���[�h -> 0z","�����N -> 0z","�A���x���^ -> 0z","�Q�t�F�� -> 0z","�t�F�C���� -> 0z","�A�C���u���b�N -> 0z","�A�}�c -> 0z","�A���f�o���� -> 0z","����ς��߂�")-1;
	if ('@num==9) goto L_CANCEL;
	mes "[�^�[��]";
	mes "���ꂶ��A�]�����܂��ˁB";
	close2;
	callfunc "AC_WarpTown",'@num;
	end;
L_CANCEL:
	mes "[�^�[��]";
	mes "�킩��܂����B";
	mes "�܂����Ă��������ˁB";
	close;
OnInit:
	waitingroom "�]���T�[�r�X",0;
}

// ----------------------------------------------
// �w�C��(���[���̈˗��̊֘A�}�b�v�ւ̓]��)
ac_cl_area.gat,57,168,4	script	�w�C��	798,{
	mes "[�w�C��]";
	mes "�₟�A����ɂ��́B";
	mes "�l�̓w�C������B";
	next;
	set '@novice, callfunc("AC_GetNovice");
	if ('@novice)	goto L_NOVICE;
	else			goto L_EXPERT;
L_NOVICE:
	if(AC_QUEST_ST_0+AC_QUEST_ST_1+AC_QUEST_ST_2+AC_QUEST_ST_3+AC_QUEST_ST_4==0){
		mes "[�w�C��]";
		mes "���[���ɉ�������ꂽ��";
		mes "�܂������ŁB";
		mes "�������炢�Ȃ�";
		mes "�l����`���Ă����邩�炳�B";
		close;
	}
	mes "[�w�C��]";
	mes "���[�����畷������B";
	mes "�l���]�����Ă����悤�B";
	mes "�ǂ��ɍs�������񂾂��H";
	mes "^0000FF�]���[���˗��E�����̐i�s���̂��߁A";
	mes "�]����ɉ�ʉE��̃~�j�}�b�v����";
	mes "�s����������w�{�x���\������܂��]^000000";
	next;
	//�N�G�X�g��Ԏ擾

	set '@warplist,0; //�}�b�v�\�������{�I�ǂ���ɂȂ�悤�ɓ����
	//�v�����e��
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==0)||	//�C�ɂȂ邠�̎q�P
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==1)||	//�C�ɂȂ邠�̎q�Q
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==2)||	//�C�ɂȂ邠�̎q�R
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==3)||	//�C�ɂȂ邠�̎q�S
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==5)||	//�C�ɂȂ邠�̎q�U
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==6)||	//�C�ɂȂ邠�̎q�V
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==7)||	//�C�ɂȂ邠�̎q�W
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==1)||	//�_���W�����~�o�P
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==5)||	//�_���W�����~�o�R
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==8)||	//�����̂���`���T
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==0)||	//�`���҂ɂȂ肽���P
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==1)||	//�`���҂ɂȂ肽���Q
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==3)||	//�`���҂ɂȂ肽���S
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==5)||	//�`���҂ɂȂ肽���U
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==8)||	//�`���҂ɂȂ肽���X
		(AC_RANK==1 && AC_RANKTEST && AC_RANKTEST<98)||				//��2�ے�����
		(AC_RANK==3 && AC_RANKTEST && AC_RANKTEST<98)||				//��4�ے�����
		(AC_RANK==4 && AC_RANKTEST && AC_RANKTEST<98)){				//��5�ے�����
		set '@warplist[getarraysize('@warplist)],1;
	}
	//�����N
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==2)||	//�C�ɂȂ邠�̎q�R
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==4)||	//�C�ɂȂ邠�̎q�T
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==2)||	//�����̂���`���Q
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==2)||	//�`���҂ɂȂ肽���R
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99 && AC_QUEST_LV_4==4)||	//�`���҂ɂȂ肽���T
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)){				//��6�ے�����
		set '@warplist[getarraysize('@warplist)],3;
	}
	//�Q�t�F��
	if( (AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==0)||	//�����̂���`���P
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==3)||	//�C�ɂȂ邠�̎q�S
		(AC_QUEST_ST_4 && AC_QUEST_ST_4<99)||						//�`���҂ɂȂ肽��(�S�G�s�\�[�h)
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)){				//��6�ے�����
		set '@warplist[getarraysize('@warplist)],5;
	}
	//�t�F�C����
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==4)||	//�C�ɂȂ邠�̎q�T
		(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==1)||	//��Ղ̔��Q
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)||	//���l�т̕i��͂������Q
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==4)||	//�����̂���`���R
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==6)||	//�����̂���`���S
		(AC_RANK==2 && AC_RANKTEST && AC_RANKTEST<98)||			//��3�ے�����
		(AC_RANK==5 && AC_RANKTEST && AC_RANKTEST<98)||			//��6�ے�����
		(AC_RANK==6 && AC_RANKTEST && AC_RANKTEST<98)){			//��7�ے�����
		set '@warplist[getarraysize('@warplist)],6;
	}
	//�A���x���^
	if( (AC_QUEST_ST_1 && AC_QUEST_ST_1<99) ||						//��Ղ̔�(�S�G�s�\�[�h)
		(AC_RANK==0 && AC_RANKTEST && AC_RANKTEST<98)){				//��1�ے�����
		set '@warplist[getarraysize('@warplist)],4;
	}
	//�C�Y���[�h
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==1)||	//�C�ɂȂ邠�̎q�Q
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==7)||	//�C�ɂȂ邠�̎q�W
		(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8)||	//�C�ɂȂ邠�̎q�X
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==5)||	//���َq�̍ޗ��W�߂S
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==6)||	//���َq�̍ޗ��W�߂T
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==3)||	//�_���W�����~�o�Q
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99 && AC_QUEST_LV_3==7)){	//�_���W�����~�o�S
		set '@warplist[getarraysize('@warplist)],2;
	}
	//�A���f�o����
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==0)||	//�����b�ɂȂ������̐l��
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==1)||	//���l�т̕i��͂������P
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==7)||	//���َq���͂�
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)){	//���l�т̕i��͂������Q
		set '@warplist[getarraysize('@warplist)],7;
	}
	//�W���m�[
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==1)||	//���l�т̕i��͂������P
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==2)||	//���َq�̍ޗ��W�߂P
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==3)||	//���َq�̍ޗ��W�߂Q
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==4)||	//���َq�̍ޗ��W�߂R
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==5)||	//���َq�̍ޗ��W�߂S
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==6)||	//���َq�̍ޗ��W�߂T
		(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==7)){	//���َq���͂�
		set '@warplist[getarraysize('@warplist)],8;
	}
	//�R���h
	if( (AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==5)||	//�C�ɂȂ邠�̎q�U
		(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==7)){	//��Ղ̔��W
		set '@warplist[getarraysize('@warplist)],10;
	}
	//���w��
	if(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8){		//�C�ɂȂ邠�̎q�X
		set '@warplist[getarraysize('@warplist)],12;
	}
	//�x�C���X
	if(AC_QUEST_ST_0 && AC_QUEST_ST_0<99 && AC_QUEST_LV_0==8){		//�C�ɂȂ邠�̎q�X
		set '@warplist[getarraysize('@warplist)],14;
	}
	//�A�C���u���b�N
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==3){		//���َq�̍ޗ��W�߂Q
		set '@warplist[getarraysize('@warplist)],19;
	}
	//�A�C���x�t
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==4){		//���َq�̍ޗ��W�߂R
		set '@warplist[getarraysize('@warplist)],20;
	}
	//�t�B�Q��
	if( (AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==8)||	//���l�т̕i��͂������Q
		(AC_QUEST_ST_3 && AC_QUEST_ST_3<99)){						//�����̂���`��(�S�G�s�\�[�h)
		set '@warplist[getarraysize('@warplist)],11;
	}
	//���q�^���[��
	if(AC_QUEST_ST_2 && AC_QUEST_ST_2<99 && AC_QUEST_LV_2==2){		//���َq�̍ޗ��W�߂P
		set '@warplist[getarraysize('@warplist)],13;
	}
	//�A�}�c
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==2){		//��Ղ̔��R
		set '@warplist[getarraysize('@warplist)],18;
	}
	//�R������
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==3){		//��Ղ̔��S
		set '@warplist[getarraysize('@warplist)],15;
	}
	//���V��
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==4){		//��Ղ̔��T
		set '@warplist[getarraysize('@warplist)],16;
	}
	//�A���^��
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==5){		//��Ղ̔��U
		set '@warplist[getarraysize('@warplist)],17;
	}
	//�E���o��
	if(AC_QUEST_ST_1 && AC_QUEST_ST_1<99 && AC_QUEST_LV_1==6){		//��Ղ̔��V
		set '@warplist[getarraysize('@warplist)],9;
	}
	set '@mapselect$,"";
	for(set '@i,0; '@i<getarraysize('@warplist); set '@i,'@i+1){
		set '@mapselect$,'@mapselect$ + 'mapname$['@warplist['@i]-1] + ":";
	}
	set '@mapselect$,'@mapselect$ + "���͕K�v�Ȃ�";
	set '@mapid, select('@mapselect$)-1;
	set '@num,'@warplist['@mapid]-1;
	if('mapname$['@num]=="") goto L_CANCEL;
	mes "[�w�C��]";
	mes "���ꂶ�Ⴀ�A�]�������B";
	mes "�@";
	mes "^0000FF�]�~�j�}�b�v�̊g��k����";
	mes "�~�j�}�b�v���E��́w�{�|�x��";
	mes "���N���b�N���邱�Ƃōs���܂��]^000000";
	next;
	mes "[�w�C��]";
	mes "�A�J�f�~�[�ɖ߂��Ă���Ƃ���";
	mes "^0000FF�w�A�J�f�~�[�̊֌W�ҁx^000000��";
	mes "^FF0000�X�̒����t��^000000�ɂ��邩��A";
	mes "��������X�̒����t�߂�";
	mes "�s���Ă݂ĂˁB";
	close2;
	warp 'gatname$['@num],'map_xy['@num*2],'map_xy['@num*2+1];
	end;
L_EXPERT:
	mes "[�w�C��]";
	mes "���݂��炢�ј\�̂���`���҂��ƁA";
	mes "�l�̏����͂���Ȃ�����";
	mes "����Ȃ��ȁB";
	mes "�l�͂����Ŗ��n�Ȗ`���҂�";
	mes "�菕�������Ă���񂾁B";
	next;
	if(select("�����Ȃ̂�","�Ȃ�ł����Ŏ菕�����H")==1) {
		mes "[�w�C��]";
		mes "�w�т������Ƃ�����Ȃ�A";
		mes "�A�J�f�~�[���ɐ}���������邩��A";
		mes "��x�s���Ă݂�Ƃ�����B";
		close;
	}
	mes "[�w�C��]";
	mes "�ȑO�A�ڂ��͌��m��ʖ`���҂�";
	mes "������ꂽ���Ƃ��������񂾁B";
	mes "���̂Ƃ��̂��Ƃ͍����N����";
	mes "�o���Ă����B";
	next;
	mes "[�w�C��]";
	mes "�ڂ����������ɂ�����̂��A";
	mes "���̐l�̂������Ȃ񂾁B";
	next;
	emotion 2;
	mes "[�w�C��]";
	mes "���݂��삯�o����";
	mes "�`���҂����������";
	mes "�v���o���Ă�����B";
	close;
L_CANCEL:
	mes "[�w�C��]";
	mes "���������H";
	mes "�܂��K�v�ɂȂ�����";
	mes "�����ł�I";
	close;
OnInit:
	setarray 'gatname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat","aldebaran.gat","yuno.gat","umbala.gat","comodo.gat","hugel.gat","rachel.gat","lighthalzen.gat","veins.gat","gonryun.gat","louyang.gat","ayothaya.gat","amatsu.gat","einbroch.gat",  "einbech.gat";
	setarray 'mapname$,"�v�����e��",  "�C�Y���[�h","�����N",    "�A���x���^", "�Q�t�F��", "�t�F�C����","�A���f�o����", "�W���m�[","�E���o��",  "�R���h",    "�t�B�Q��", "���w��",    "���q�^���[��",   "�x�C���X", "�R������",   "���V��",     "�A���^��",    "�A�}�c",    "�A�C���u���b�N","�A�C���x�t";
	setarray 'map_xy,   147,190,      121,115,     147,93,      103,129,      110,103,    155,197,     138,110,        150,174,   100,154,     209,143,     90,146,     129,138,     214,156,          200,123,    160,120,      217,114,      216,175,       117,151,     217,188,         168,131;
	waitingroom "����`����",0;
	end;
}

//------------------------------------------------------------------------------
// ������ 2F

ac_cl_area.gat,63,81,0	script	3�KWP	45,1,1,{
	mes "[3�K]";
	mes "3�K�͈�ʊw���̗��������";
	mes "�֎~���Ă��܂��B";
	close;
}

//�������Ǘ��l
ac_cl_area.gat,41,38,4	script	�������Ǘ��l	75,{
	mes "[�������Ǘ��l]";
	mes "�����͎������ɂȂ�܂��B";
	mes "�����Ȏ�����������";
	mes "�W�߂Ă��ł���B";
	mes "�����͂ǂ̂悤�ȗp�ł����H";
	next;
	if(select("�������ꂳ��͂��܂����H","�Ȃ�ł��Ȃ�")==2) {
		mes "[�������Ǘ��l]";
		mes "�����ł����B";
		mes "����������������A";
		mes "�܂����Ă��������ˁB";
	} else {
		mes "[�������Ǘ��l]";
		mes "�������ꂳ���";
		mes "�������̒��ɂ���Ǝv���܂���B";
		mes "�{����D���Ȃ���������ł�����B";
	}
	close;
}

//�������ꂳ��
ac_cl_area.gat,39,23,4	script	����#ac_cl_area	766,{
	set '@novice, callfunc("AC_GetNovice");
	if(AC_RANK>0) goto L_TENSOU;
	if (!'@novice) {
		mes "[����]";
		mes "�ӂ����ӂ����ӂ��B";
		mes "���S�A���S�B";
		mes "����̂悤�ȗ��h�Ȗ`���҂�";
		mes "������Ƃ����̂��B";
		next;
		mes "[����]";
		mes "���̐��k�B���F�A";
		mes "����̂悤�ɂȂ���";
		mes "�킵�����S���āA";
		mes "���ނł���񂶂Ⴊ�̂��B";
		mes "�ӂ����ӂ����ӂ��B";
		close;
	}
	mes "[����]";
	mes "�ӂ����ӂ����ӂ��B";
	mes "����͖ʔ����{��";
	mes "�����邱�Ƃ��ł����킢�B";
	mes "�c�c�Ӂ[�ށc�c�c";
	mes "���̒I�ɂ͉��̎�����u�������̂��B";
	mes "�c�c";
	next;
	mes "[����]";
	mes "��H";
	mes "������{�Ɋ֐S������悤����́B";
	mes "�{���D���Ȃ̂��H";
	next;
	if (select("�D��","�D������Ȃ�")==2) {
		mes "[����]";
		mes "�������B";
		mes "���݂������Ƃ���́`�B";
		mes "�{�͂����Ȑ��E�������邱�Ƃ�";
		mes "�ł���ǂ����̂���āB";
		mes "���������邱�Ƃ���A�����Ȗ{��";
		mes "�ǂ�ł݂�Ƃ������B";
		next;
		mes "[����]";
		mes "�A�J�f�~�[�ɂ��}����������łȁB";
		mes "��x�����Ă݂Ă͂ǂ�����B";
		mes "�����͎U�炩���Ă��āA";
		mes "�ǂ߂��Ԃ���Ȃ��̂łȁB";
		mes "�ӂ����ӂ����ӂ��B";
		close;
	}
	mes "[����]";
	mes "�ӂ����ӂ����ӂ��B";
	mes "�֐S�֐S�B";
	mes "�����Ȗ{��ǂނ��Ƃ͗ǂ����Ƃ���B";
	mes "�{�͂����Ȓm���������Ă���邵�́B";
	mes " ";
	mes "�]������������͂��ꂵ���悤���]";
	next;
	mes "[����]";
	mes "�܊p���Ⴉ��A�{�Œm����";
	mes "�킵�̂��C�ɓ���̏ꏊ��";
	mes "�����悤���́B";
	mes " ";
	mes "�����Ă݂邩�H";
	next;
	if(select("�s��","�s���Ȃ�")==2) {
		mes "[����]";
		mes "�������B";
		mes "�c�O����́`�B";
		mes "�킵�̂��C�ɓ���̏ꏊ�Ȃ񂶂Ⴊ�B";
		mes "�����ł����鏀���͂��Ă��邼�B";
		close;
	}
	mes "[����]";
	mes "���ꂶ��A���邼���B";
	mes "�̂ǂ��ȏꏊ���Ⴊ�A";
	mes "�����X�^�[�ɂ�";
	mes "�C������񂶂Ⴜ�`�B";
	close2;
	warp "prt_fild07.gat",78,287;
	end;
L_TENSOU:
	mes "[����]";
	mes strcharinfo(0) + "���B";
	mes "���낻�뗈�邱�낾�Ǝv���Ƃ�����B";
	mes "�����Ɏ��������Ȃ��Ă���悤����́B";
	mes " ";
	mes "�]�����������񂪒n�}�������Ă����]";
	next;
	cutin "support_map001.bmp",3;
	//�ꎟ�ߒ��C���ł��Z���t�ς�炸
	mes "[����]";
	mes "����ɑE�߂悤�Ǝv���Ƃ�ꏊ��";
	mes "���ꂾ������B";
	mes "�K���h�a�̘b�𕷂�����A";
	mes "�S���͂ނ肶���B";
	mes "����Ȃ炱�̂��炢�܂ł��́B";
	mes "�ǂ��ɍs�������񂶂�H";
	next;
	set '@select$,"";
	for(set '@i,0; '@i<13; set '@i,'@i+1){
		set '@select$,'@select$ + (AC_RANK >= 'REQUIRE['@i] ? 'MAPNAME$['@i] : "^FF0000�s��^000000") + ":";
	}
	set '@select$,'@select$ + "����ς�s���Ȃ�";
	set '@num,select('@select$);
	if(AC_RANK < 'REQUIRE['@num-1]){
		mes "[����]";
		mes "�c�O���Ⴊ";
		mes "���̂���ɂ͑E�߂���̂���B";
		mes "�ʂ̏ꏊ�ɂ��Ă����񂶂�B";
		close;
	}
	if('@num==10){
		mes "[����]";
		mes "�����ށc�c�����͂̂��A";
		mes "�O�̓\�O���g���� 08�Ƃ���";
		mes "�ꏊ���������̂��Ⴊ�c�c";
		mes "���͂��������Ă̂��A�����";
		mes "�����ɑ��邱�Ƃ͏o���ʂ̂���B";
		mes "�ʂ̏ꏊ�ɂ��Ă����񂶂�B";
		close;
	}
	if('@num==14){
		mes "[����]";
		mes "�������B";
		mes "�s�������Ȃ�����A";
		mes "���ł������Ȃ���B";
		mes "�܂��Ƃ�łȁB";
		close;
	}
	mes "[����]";
	mes "�]����ɃA�C��������͂����Ⴉ��A";
	mes "�߂鎞�̓A�C���Ɍ����Ȃ���B";
	mes "�����X�^�[�ɂ͋C������񂶂Ⴜ�B";
	mes "���ꂶ��A���邼���B";
	mes "�ӂ����ӂ����ӂ��B";
	close2;
	switch('@num){
	case 1: warp "prt_sewb2.gat",70,100; end;
	case 2: warp "prt_fild07.gat",78,287; end;
	case 3: warp "pay_fild02.gat",135,172; end;
	case 4: warp "pay_dun00.gat",108,24; end;
	case 5: warp "pay_fild09.gat",218,289; end;
	case 6: warp "iz_dun00.gat",237,166; end;
	case 7: warp "gef_fild03.gat",32,55; end;
	case 8: warp "pay_dun01.gat",231,74; end;
	case 9: warp "gef_fild11.gat",369,294; end;
	case 11: warp "gef_fild12.gat",125,184; end;
	case 12: warp "mjolnir_05.gat",170,280; end;
	case 13: warp "gef_dun01.gat",247,231; end;
	}
	end;
OnInit:
	setarray 'MAPNAME$,"�v�����e���n�����H B2F","�v�����e���t�B�[���h 07","�t�F�C���������̐X 02","�t�F�C�����n�����A B1F","�t�F�C���������̐X 09","�C�Y���[�h�C�ꓴ�A 1�w","�Q�t�F���t�B�[���h 03","�t�F�C�����n�����A B2F","�Q�t�F���t�B�[���h 11","^8C008C����^000000","�Q�t�F���t�B�[���h 12","�~�����j�[���R�� 05","�Q�t�F���n���_���W���� B2F";
	setarray 'REQUIRE,1,1,1,1,2,2,3,4,4,0,5,6,7;
}

//------------------------------------------------------------------------------
// �A�C���̎x��
// �⑫�F�A���[��}�j�s�Ȃǂ�PT�x���n�́A1�l���s���΃p�[�e�B�S���ɂ�����ׁA
//       ���������G�ɂȂ��Ă��܂��B

-	script	�A�C��ACFUNC	-1,{
	function	abs		{ return getarg(0)*(getarg(0)<0 ? -1 : 1); }
	set '@novice, callfunc("AC_GetNovice");
	if(AC_PASSPORT){
		if(!'@novice){
			mes "[�A�C��]";
			mes "�����A�L�~�ɂ͎��̗͂�";
			mes "�K�v�Ȃ����낤�B";
			mes "�L�~�͎��̗\�z��y���ɒ����āA";
			mes "���h�ɐ��������B";
			mes "�����̐l�������Ă���Ă���B";
			close;
		}
		mes "[�A�C��]";
		mes "�L�~�̓A�J�f�~�[�̐��k���ȁB";
		mes "���܂薳���͂��Ȃ��ق��������B";
		mes "���ԂƋ��ɐ���Ă������Ƃ��A";
		mes "�������̃R�c���B";
		mes " ";
		mes "�����b���������Ƃ�����̂��H";
		next;
		menu "�x�����󂯂���",L_SHIEN,"�`���҃A�J�f�~�[�ɖ߂肽��",L_WARP,"�������Ă���́H",L_WHAT,"�Ȃ�ł��Ȃ�",L_CANCEL;
	} else {
		if(!'@novice){
			mes "[�A�C��]";
			mes "�c�c";
			mes "���̎҂��B";
			mes "���ɉ����p���H";
			next;
			if(select("���ł��Ȃ�","�������Ă���́H")==1){
				mes "[�A�C��]";
				mes "������ӂɂ������X�^�[��";
				mes "�Z�ݒ����Ă���B";
				mes "���ɂ͋C�����邱�Ƃ��B";
				mes "�ǂ������B";
				close;
			}
			mes "[�A�C��]";
			mes "���͂����Ŗ`���҃A�J�f�~�[��";
			mes "���k�̖ʓ|�����Ă���B";
			mes "�삯�o���̖`���҂�";
			mes "��`�������Ă���񂾁B";
			mes "�L�~���`���҃A�J�f�~�[��";
			mes "��x�s���Ă݂�Ƃ����B";
			close;
		}
		mes "[�A�C��]";
		mes "�c�c";
		mes "�L�~�͖`���҂̂悤���ȁB";
		mes "���͂��̏ꏊ�Ŗ`���҂̎菕����";
		mes "�s���Ă���B";
		mes "��x�`���҃A�J�f�~�[��";
		mes "�s���Ă݂�Ƃ����B";
		next;
		menu "�`���҃A�J�f�~�[�H",-;
		mes "[�A�C��]";
		mes "�`���҂̂��߂̊w�Z�̂悤�Ȃ��̂��B";
		mes "���w�̎葱���͂������";
		mes "�s�����Ƃ��ł���B";
		mes "�L�~���]�ނȂ�A�`���҃A�J�f�~�[��";
		mes "���邪�A�ǂ�����H";
		next;
		if(select("�����Ă��炤","�f��")==2){
			mes "[�A�C��]";
			mes "�������B";
			mes "�`���ɍ��������Ƃ���������A";
			mes "��x�s���Č���Ƃ����B";
			mes "�X�̒����ӂ�ɂ��A�J�f�~�[��";
			mes "�֌W�҂�����͂�������B";
			close;
		}
		mes "[�A�C��]";
		mes "�킩�����B";
		mes "���ꂶ��A�]�����邼�B";
		close2;
		warp "ac_cl_room.gat",44,32;
		end;
	}
L_WARP:
	mes "[�A�C��]";
	mes "�`���҃A�J�f�~�[�ɖ߂肽���̂��H";
	next;
	if(select("�͂�","������")==2){
		mes "[�A�C��]";
		mes "�������B";
		mes "�����͋֕������B";
		mes "��Ȃ��Ȃ�����A�߂��Ă���Ƃ����B";
		close;
	}
	mes "[�A�C��]";
	mes "��������x�e���ȁB";
	mes "���ꂶ��A�]�����邼�B";
	close2;
	warp "ac_cl_area.gat",67,155;
	end;
L_SHIEN:
	mes "[�A�C��]";
	mes "�����琄�E���󂯂����̂ł����Ă��A";
	mes "�����Ƃ����킯�ł͂Ȃ��B";
	mes "Zeny�͕K�v�����B";
	mes " ";
	mes "�ǂ̎x�����󂯂����H";
	next;
	switch(select(
				"^0000FF��{�Z�b�g^000000 - 10Zeny",
				(AC_RANK>3 ? "^FF0000�⏕�Z�b�g�T^000000" : "^777777�H�H�H�H�H�T^000000") + " - 50Zeny",
				(AC_RANK>3 ? "^006600�⏕�Z�b�g�U^000000" : "^777777�H�H�H�H�H�U^000000") + " - 50Zeny",
				"�Z�b�g�̐����𕷂�","��߂�"))
	{
	case 1:
		if(Zeny<10) goto L_NOMONEY;
		mes "[�A�C��]";
		mes "�悵�B";
		mes "���ꂶ��A�C�����Đ키�񂾂��B";
		close2;
		set Zeny,Zeny-10;
		npcskillsupport 34,0;
		sc_end 10;
		sc_start 10,'BLESS[AC_RANK],'BASIC_LV[AC_RANK];	//SC_BLESSING
		npcskillsupport 29,0;
		sc_end 12;
		sc_start 12,'BLESS[AC_RANK],'BASIC_LV[AC_RANK];	//SC_INCREASEAGI
		if(!getcharid(1)){
			npcskillsupport 33,0,"","";
			sc_end 9;
			sc_start 9,'ANGEL[AC_RANK],'BASIC_LV[AC_RANK];	//SC_ANGELUS
			if(AC_RANK>=7){
				npcskillsupport 74,0,"","";
				sc_end 20;
				sc_start 20,90000,5;	//SC_MAGNIFICAT
			}
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; }  //�}�b�v�`�F�b�N
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //�͈̓`�F�b�N
					npcskillsupport 33,0,"","";
					sc_end 9;
					sc_start 9,'ANGEL[AC_RANK],'BASIC_LV[AC_RANK];	//SC_ANGELUS
					if(AC_RANK>=7){
						npcskillsupport 74,0,"","";
						sc_end 20;
						sc_start 20,90000,5;	//SC_MAGNIFICAT
					}
					detachrid;
				}
			}
			if(!attachrid('@chid)) end; //�A�^�b�`���Ȃ���
		}
		npcskillsupport 73,0,"","";//�L���G������肭�Č��ł��Ȃ��̂͂Ȃ�ł��E�E�E
		sc_end 110;
		sc_end 19;
		sc_start 19,120000,'BASIC_LV[AC_RANK];	//SC_KYRIE
		end;
	case 2:
		if(AC_RANK<4) goto L_FEWLANC;
		if(Zeny<50) goto L_NOMONEY;
		mes "[�A�C��]";
		mes "�悵�B";
		mes "���ꂶ��A�C�����Đ키�񂾂��B";
		close2;
		set Zeny,Zeny-50;
		npcskillsupport 66,0;
		sc_end 15;
		sc_start 15,60000,'SUP1_LV[AC_RANK];	//SC_IMPOSITIO
		if(!getcharid(1)){
			npcskillsupport 383,0,"","";
			sc_end 116;
			sc_start 116,'WINDW[AC_RANK],'SUP2_LV[AC_RANK];	//SC_WINDWALK
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; }  //�}�b�v�`�F�b�N
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //�͈̓`�F�b�N
					npcskillsupport 383,0,"","";
					sc_end 116;
					sc_start 116,'WINDW[AC_RANK],'SUP2_LV[AC_RANK];	//SC_WINDWALK
					detachrid;
				}
			}
		}
		end;
	case 3:
		if(AC_RANK<4) goto L_FEWLANC;
		if(Zeny<50) goto L_NOMONEY;
		mes "[�A�C��]";
		mes "�悵�B";
		mes "���ꂶ��A�C�����Đ키�񂾂��B";
		close2;
		set Zeny,Zeny-50;
		if(!getcharid(1)){
			npcskillsupport 112,0,"","";
			sc_end 24;
			sc_start 24,'WEAPF[AC_RANK],'SUP1_LV[AC_RANK];	//SC_WEAPONPERFECTION
			npcskillsupport 113,0,"","";
			sc_end 25;
			sc_start 25,'OVERT[AC_RANK],'SUP1_LV[AC_RANK];	//SC_OVERTHRUST
		} else {
			set '@chid,getcharid(3);
			getpartymember getcharid(1);
			set '@dummy,getmapxy('@map$,'@x,'@y,0);
			for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
				if(attachrid(getcharid(3,$@partymembername$['@i]))){
					set '@dummy, getmapxy('@pmmap$,'@pmx,'@pmy,0);
					if('@pmmap$ != '@map$) { detachrid; continue; }  //�}�b�v�`�F�b�N
					if(abs('@x-'@pmx) > 14 || abs('@y-'@pmy)>14) { detachrid; continue; } //�͈̓`�F�b�N
					npcskillsupport 112,0,"","";
					sc_end 24;
					sc_start 24,'WEAPF[AC_RANK],'SUP1_LV[AC_RANK];	//SC_WEAPONPERFECTION
					npcskillsupport 113,0,"","";
					sc_end 25;
					sc_start 25,'OVERT[AC_RANK],'SUP1_LV[AC_RANK];	//SC_OVERTHRUST
					detachrid;
				}
			}
		}
		end;
	case 4:
		mes "[�A�C��]";
		if(AC_RANK<4){
			mes "���̃L�~�ɂ�";
			mes "^0000FF��{�Z�b�g^000000�̎x�����ł���B";
		} else {
			mes "�L�~�ɂ�3��ނ̎x�����ł���B";
			mes "�܂�^0000FF��{�Z�b�g^000000�����A";
		}
		mes "�u���b�V���O�A���x�����A";
		mes "�G���W�F���X�A�L���G�G���C�\�����B";
		mes "�L�~�����������Ȃ����Ƃ�";
		mes "�x���X�L���̃��x�����グ�邼�B";
		next;
		mes "[�A�C��]";
		mes "�ŏI�I�ɂ͊�{�Z�b�g��";
		mes "��قǂ�4�̃X�L����";
		mes "Lv10�Œ񋟂���̂ɉ���";
		mes "���܂��Ń}�O�j�t�B�J�[�gLv5��";
		mes "���Ă�낤�B";
		if(AC_RANK<4){
			mes "�����͈ȏゾ�B";
			close;
		}
		next;
		mes "[�A�C��]";
		mes "������^FF0000�⏕�Z�b�g�T^000000�ł�";
		mes "�C���|�V�e�B�I�}�k�X��";
		mes "�E�B���h�E�H�[�N�A";
		mes "^006600�⏕�Z�b�g�U^000000�ł�";
		mes "�E�F�|���p�[�t�F�N�V������";
		mes "�I�[�o�[�g���X�g��������B";
		next;
		mes "[�A�C��]";
		mes "�������L�~�̐�����";
		mes "�����ă��x�������߂悤�B";
		mes "��肭���p���ė~�����B";
		close;
	default:
		goto L_CANCEL;
	}
	close;
L_FEWLANC:
	mes "[�A�C��]";
	mes "�c�O����";
	mes "���̃L�~�ɂ͂��̎x����";
	mes "�s�����Ƃ͏o���Ȃ��B";
	mes "�����������������Ȃ���";
	mes "�C����ςނƂ����B";
	close;
L_NOMONEY:
	mes "[�A�C��]";
	mes "��H";
	mes "����������Ȃ����B";
	mes "���낻��A�`���҃A�J�f�~�[��";
	mes "�߂����ق��������񂶂�Ȃ����H";
	close;
L_WHAT:
	mes "[�A�C��]";
	mes "�~�b�h�ƃ��[������L�~�̘b��";
	mes "�����Ă���B";
	mes "�L�~������؂肸�ɐ킦��悤��";
	mes "�Ȃ�܂ŁA���΂炭������";
	mes "�T�|�[�g���悤�B";
	next;
	mes "[�A�C��]";
	mes "�`���҃A�J�f�~�[��";
	mes "�L�~�������𐋂����";
	mes "������قǁA";
	mes "���������̃T�|�[�g���s�����B";
	next;
	mes "[�A�C��]";
	mes "���܂ł��Ƃ����킯�ɂ�";
	mes "�����Ȃ����A�L�~�����h��";
	mes "�����𐋂���܂ł͕t���������B";
	close;
L_CANCEL:
	mes "[�A�C��]";
	mes "�������B";
	mes "�C�����čs���Ȃ����B";
	close;
OnInit:
	//�X�L�����x��
	setarray 'BASIC_LV,3,4,5,6,7,8,9,10;
	setarray 'SUP1_LV, 0,0,0,0,2,3,4,5;
	setarray 'SUP2_LV, 0,0,0,0,4,6,8,10; //�E�C���h�E�H�[�N�p
	//�X�L����������
	setarray 'BLESS,100000,120000,140000,160000,180000,200000,220000,240000;//IA���p
	setarray 'ANGEL,90000,120000,150000,180000,210000,240000,270000,300000;
	setarray 'WINDW,0,0,0,0,220000,280000,340000,400000;
	setarray 'WEAPF,0,0,0,0,20000,30000,40000,50000;
	setarray 'OVERT,0,0,0,0,40000,60000,80000,100000;
	//�L���G 120000 �}�j�s 90000 IMP 60000
}
prt_fild07.gat,78,290,4		duplicate(�A�C��ACFUNC)		�A�C��#PRTF07	747
prt_sewb2.gat,70,103,4		duplicate(�A�C��ACFUNC)		�A�C��#PRTSB2	747
pay_fild02.gat,135,175,4	duplicate(�A�C��ACFUNC)		�A�C��#PAYF02	747
pay_dun00.gat,108,26,4		duplicate(�A�C��ACFUNC)		�A�C��#PAYD00	747
pay_fild09.gat,218,292,4	duplicate(�A�C��ACFUNC)		�A�C��#PAYF09	747
iz_dun00.gat,237,169,4		duplicate(�A�C��ACFUNC)		�A�C��#IZLD00	747
gef_fild03.gat,32,58,4		duplicate(�A�C��ACFUNC)		�A�C��#GEFF03	747
pay_dun01.gat,231,77,4		duplicate(�A�C��ACFUNC)		�A�C��#PAYD01	747
gef_fild11.gat,369,297,4	duplicate(�A�C��ACFUNC)		�A�C��#GEFF11	747
gef_fild12.gat,125,187,4	duplicate(�A�C��ACFUNC)		�A�C��#GEFF12	747
mjolnir_05.gat,170,285,4	duplicate(�A�C��ACFUNC)		�A�C��#MJOL05	747
gef_dun01.gat,247,234,4		duplicate(�A�C��ACFUNC)		�A�C��#GEFD01	747

