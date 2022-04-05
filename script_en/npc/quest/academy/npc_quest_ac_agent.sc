//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[  �A�J�f�~�[�֌W��
//                                                  by Pneuma
//------------------------------------------------------------

//----------------------------------
// �n����� -- arg1=mapno, arg2=���("�ł��B"or"����B")
function	script	ac_map_info	{
	switch(getarg(0)) {
	case 0:// �v�����e��
		cutin "area_map_002",3;
		mes "�����̓��[���~�b�h�K�b�c�����̎�s�B";
		mes "^0000FF�v�����e��^000000�̊X" + getarg(1);
		close;
	case 1:// �C�Y���[�h
		cutin "area_map_006",3;
		mes "���̊X�͎�s�v�����e����";
		mes "�q���s�s^0000FF�C�Y���[�h^000000" + getarg(1);
		close;
	case 2:// �����N
		cutin "area_map_009",3;
		mes "[�A�J�f�~�[�֌W��]";
		mes "�����̓v�����e���쐼�Ɉʒu����";
		mes "�\�O���g�����ɂ���I�A�V�X�̊X�B";
		mes "^0000FF�����N^000000" + getarg(1);
		next;
		mes "[�A�J�f�~�[�֌W��]";
		mes "�Ƃ͂����A���͂��̗L�l����c�c";
		mes "�X�̃I�A�V�X�͐Ռ`���Ȃ��Ȃ����B";
		mes "���������A�X�̓�����";
		mes "���Ȃ�댯�ȏ�ԂɂȂ��Ă���B";
		mes "�v�����e����t�F�C�������ʂ�";
		mes "���͂ō������z���čs���͖̂��d���B";
		next;
		mes "[�A�J�f�~�[�֌W��]";
		mes "�ړ�������������]����";
		mes "���p���ĂˁB";
		close;
	case 3:// �A���x���^
		cutin "area_map_007",3;
		mes "�����͖`���҂̊Ԃł��b���";
		mes "�`��^0000FF�A���x���^^000000" + getarg(1);
		close;
	case 4:// �Q�t�F��
		cutin "area_map_003",3;
		mes "�����̓~�����j�[���R����";
		mes "�אڂ��Ă��閂�@�s�s^0000FF�Q�t�F��^000000" + getarg(1);
		close;
	case 5:// �t�F�C����
		cutin "area_map_007",3;
		mes "�����͗΂Ɉ͂܂ꂽ�R�x�s�s";
		mes "^0000FF�t�F�C����^000000" + getarg(1);
		close;
	case 6://�A���f�o����
		cutin "area_map_002",3;
		mes "�����̓v�����e���k�Ɉʒu����";
		mes "^0000FF�A���f�o����^000000�̊X" + getarg(1);
		close;
	case 7://�W���m�[
		cutin "area_map_005",3;
		mes "���̊X�̓V���o���c�o���h���a����";
		mes "��s^0000FF�W���m�[^000000" + getarg(1);
		close;
	case 8://�E���o��
		cutin "area_map_004",3;
		mes "�����͖؁X�������΂����A";
		mes "���R�L���Ȃ��E�[�^�����̑�"; //�{�I�ǂ���
		mes "^0000FF�E���o��^000000" + getarg(1);
		close;
	case 9://�R���h
		cutin "area_map_004",3;
		mes "�����̓��[���~�b�h�K�b�c����";
		mes "�œ�[�Ɉʒu���铴�A�s�s";
		mes "^0000FF�R���h^000000" + getarg(1);
		close;
	case 10://�t�B�Q��
		cutin "area_map_005",3;
		mes "�����̓V���o���c�o���h���a��";
		mes "�k���Ɉʒu����c���s�s";
		mes "^0000FF�t�B�Q��^000000" + getarg(1);
		close;
	case 11://���w��
		cutin "area_map_010",3;
		mes "�����̓A���i�x���c������";
		mes "��s^0000FF���w��^000000" + getarg(1);
		close;
	case 12://���q�^���[��
		cutin "area_map_010",3;
		mes "�����̓A�C���u���b�N�̓쐼��";
		mes "�ʒu�����Ɠs�s�s�s"; //�{�I�ǂ���
		mes "^0000FF���q�^���[��^000000" + getarg(1);
		close;
	case 13://�x�C���X
		cutin "area_map_010",3;
		mes "�����͌k�J�ƊR�̊Ԃɍ��ꂽ";
		mes "�s�s^0000FF�x�C���X^000000" + getarg(1);
	case 14://�R������
		mes "�����͒��ɕ����Q����̓��B";
		mes "�ό��n�Ƃ��Ă��L����^0000FF�R������^000000" + getarg(1);
		close;
	case 15://���̏�
		mes "�����͑s��Ȍ�������";
		mes "���т���Ós^0000FF���V��^000000" + getarg(1);
		close;
	case 16://�A���^��
		mes "�����͓��L�̐M��������������";
		mes "�W�܂��ĕ�炵�Ă���^0000FF�A���^��^000000" + getarg(1);
		close;
	case 17://�s���n��
		cutin "area_map_009",3;
		mes "������^0000FF�����N^000000�̖k���Ɉʒu����";
		mes "�s���~�b�h�_���W�����ɂ���";
		mes "�V�[�t�M���h" + getarg(1);
		close;
	case 18://�A�C���u���b�N
		cutin "area_map_005",3;
		mes "�����͍H�Ɠs�s^0000FF�A�C���u���b�N^000000" + getarg(1);
		close;
	case 19://�A�}�c
		mes "�����͖L���Ȑ��ƌ����ȍ��Ɉ͂܂ꂽ";
		mes "����L���ȓy�n^0000FF�A�}�c^000000" + getarg(1);
		close;
	case 20://�|�葺
		cutin "area_map_007",3;
		mes "�����͗΂Ɉ͂܂ꂽ�R�x�s�s";
		mes "^0000FF�t�F�C����^000000�ɂ���";
		mes "�|�葺" + getarg(1);
		close;
	case 21://�A�C���x�t
		cutin "area_map_005",3;
		mes "�����͍z�R���玑�����@��o�����߂�";
		mes "����ꂽ�z�v�̑��A^0000FF�A�C���x�t^000000" + getarg(1);
		close;
	}
	return;
}

//----------------------------------
// �A�J�f�~�[�֌W�� (���w�ē�)
// Auriga��OnTouch�d���s�ׁ̈A�R���p�XNPC�����˂�

-	script	�A�J�f�~�[�֌W��#func	-1,{
	function WARP_ACADEMY;
	function JOIN_ACADEMY;
	function DORAM_ACADEMY;

	set '@novice,callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	while ('save_gatname$['@mapnumber]!='@gatname$) set '@mapnumber,'@mapnumber+1;

	if(Job == Job_Summoner){ // �h��������p
		DORAM_ACADEMY;
		end;
	} else
	if (AC_PASSPORT==0){ // �����w
		JOIN_ACADEMY;
		end;
	} else
	if(AC_PASSPORT==1){ // �����w��
		WARP_ACADEMY;
		end;
	}

	if('@novice){
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ɂ��́B";
		mes "���q�͂ǂ��H";
		mes "�`���҃A�J�f�~�[�ɂ����̂����H";
	} else {
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ɂ��́I";
		mes "�n���̖`���҂����^0000FF1000^000000Zeny��";
		mes "��t���𒸂��Ă����ł��B";
		mes "�`���҃A�J�f�~�[��";
		mes "�]�����܂��傤���H";
	}
	next;
	switch(select("�]�����Ă��炤","���ӂɂ��Ēm�肽��","�Ȃ�ł��Ȃ�")){
	case 1:
		WARP_ACADEMY;
		end;
	case 2:
		mes "[�A�J�f�~�[�֌W��]";
		mes "���̂�����̂��Ƃɂ���";
		mes "�m�肽���񂾂ˁB";
		callfunc "ac_map_info", '@mapnumber,"����B";
		end;
	default:
		mes "[�A�J�f�~�[�֌W��]";
		mes "�������B";
		mes "���ł��A���������Ă����΁A";
		mes "�����ɑ����Ă������B";
		close;
	}

	function	WARP_ACADEMY	{
		set '@novice,callfunc("AC_GetNovice");
		if(!'@novice && AC_PASSPORT!=1){ //�����w�ς݂̏ꍇ�͖���
			set '@price,(AC_PASSPORT ? 1000 : 2000);
			if (Zeny<'@price) {
				mes "[�A�J�f�~�[�֌W��]";
				mes "����H";
				mes "����������Ȃ��݂������ˁB";
				mes "�\����Ȃ����ǁA�W�܂��Ă���";
				mes "�܂����ĂˁB";
				close;
			}
			set Zeny, Zeny - '@price;
		}
		mes "[�A�J�f�~�[�֌W��]";
		if(AC_PASSPORT==1){
			//�����w�ς݁A�]����ɒ����g�����ꍇ�̂ݕ\���B
			mes "���w���ˁB";
		}
		set AC_SAVE_MAP, '@mapnumber;
		mes "���ꂶ��A�`���҃A�J�f�~�[��";
		mes "�]������ˁB";
		mes " ";
		mes "�]�A�J�f�~�[�̋��_�n�_��";
		mes "^FF0000" +'save_mapname$[AC_SAVE_MAP]+ "^000000�ɂȂ�܂����]";
		close2;
		switch(AC_PASSPORT){
		case 0:
			set AC_PASSPORT,1; //���w����t
		case 1:
			warp "ac_cl_room.gat",44,32;
			break;
		default:
			if('@novice) warp "ac_cl_area.gat",67,155;
			else         warp "ac_en_hall.gat",97,12;
		}
		return;
	}

	function	JOIN_ACADEMY	{
		set '@novice,callfunc("AC_GetNovice");
		if ('@novice) {
			if(getarg(0)){
				mes "[�A�J�f�~�[�֌W��]";
				mes "����H";
				mes "�L�~�͐V��̐l���ˁB";
				mes "�`���҃A�J�f�~�[��";
				mes "���w���Ă݂邩���H";
			} else {
				mes "[�A�J�f�~�[�֌W��]";
				mes "����ɂ��́B";
				mes "���A�V�������W���Ă����ł���B";
				mes "�`���҃A�J�f�~�[�ɓ��w���邩���H";
			}
			next;
			menu "�`���҃A�J�f�~�[�H",-;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�`���҃A�J�f�~�[��";
			mes "�삯�o���̖`���҂���A";
			mes "�n���̖`���҂܂ŁA";
			mes "�N�ł����w�ł���`���҂̊w�Z���B";
			next;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�A�J�f�~�[�ɓ��w���邱�ƂŁA";
			mes "���낢��Ȓm�����w�ׂ�񂾁B";
			mes "�w��ł������Ƃł����ȓ��T��";
			mes "����ꂽ�肷��ˁB";
			next;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�`�����̍���Ȃł����Ƃ��A";
			mes "�A�J�f�~�[�ɂ���搶��";
			mes "��y�B�ɕ����΁A";
			mes "�����ɉ�������͂����B";
			next;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�`���ɂ͂��낢��ȍ��";
			mes "�҂��\���Ă��邩��A";
			mes "�����Ə����ɂȂ�Ǝv����B";
			mes "�ǂ������H";
			mes "�`���҃A�J�f�~�[�ɓ��w���邩���H";
		} else {
			mes "[�A�J�f�~�[�֌W��]";
			mes "����ɂ��́B";
			mes "���A�V�������W���Ă���񂾁B";
			mes "�o�����񂾏n���҂̕���";
			mes "����邯�ǁA��t���𒸂��Ă����B";
			mes "�`���҃A�J�f�~�[�ɓ��w���邩���H";
			next;
			switch(select("���w���Ȃ�","���w����","�`���҃A�J�f�~�[�Ƃ́H")){
			case 1:
				mes "[�A�J�f�~�[�֌W��]";
				mes "�������B";
				mes "�`���҃A�J�f�~�[�͂��ł�";
				mes "���w�ł��邩��ˁI";
				mes "�킩��Ȃ����Ƃ���������A";
				mes "��x���w���Ă݂邱�Ƃ����߂��B";
				close;
			case 2:
				mes "[�A�J�f�~�[�֌W��]";
				mes "�������B";
				mes "���݂͏n���̖`���҂݂������ˁB";
				mes "���w�̊�t����^0000FF2000^000000Zeny����B";
				mes "���w���邩���H";
				break;
			case 3:
				mes "[�A�J�f�~�[�֌W��]";
				mes "�`���҃A�J�f�~�[�͖`���҂�����";
				mes "�T�|�[�g���s���w�Z����B";
				mes "�`���҃A�J�f�~�[�͊�t����";
				mes "���藧���Ă���񂾁B";
				mes "�A�J�f�~�[�ɓ��w���邱�Ƃ�";
				mes "���낢��Ȓm�����w�ׂ�񂾂�B";
				next;
				mes "[�A�J�f�~�[�֌W��]";
				mes "�`�����̍���Ȃł����Ƃ��A";
				mes "�A�J�f�~�[�ɂ���搶���y�B��";
				mes "�����΁A�����ɉ�������͂����B";
				next;
				mes "[�A�J�f�~�[�֌W��]";
				mes "�Ƃ͂����Ă��A���͐V�C��";
				mes "�搶�������Ȃ�����A";
				mes "���݂̂ق��������闧���";
				mes "�Ȃ邩������Ȃ����ǂˁB";
				emotion 23,"";
				next;
				mes "[�A�J�f�~�[�֌W��]";
				mes "�`���ɕK�v�Ȃ��Ƃ��w��ł������Ƃ�";
				mes "�����ȓ��T��������񂾁B";
				mes " ";
				mes "�`���҂�S�ʓI�ɃT�|�[�g����w�Z�A";
				mes "���ꂪ�`���҃A�J�f�~�[�Ȃ̂��B";
				close;
			}
		}
		next;
		if(select("���w����","���w���Ȃ�")==2){
			mes "[�A�J�f�~�[�֌W��]";
			mes "�������B";
			mes "�`���҃A�J�f�~�[�͂��ł�";
			mes "���w�ł��邩��ˁI";
			mes "�킩��Ȃ����Ƃ���������A";
			mes "��x���w���Ă݂邱�Ƃ����߂��B";
			close;
		}
		WARP_ACADEMY;
		return;
	}

	function	DORAM_ACADEMY	{
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ɂ��́B";
		mes "���A�V�������W���Ă�񂾁B";
		mes "�h�����̌N�͖`���҃A�J�f�~�[��";
		mes "���w���邱�Ƃ͂ł��Ȃ����A";
		mes "���w����͎̂��R����B";
		mes "���w���Ă��������H";
		next;
		switch(select("���w���Ȃ�","���w����","�`���҃A�J�f�~�[�Ƃ́H")) {
		case 1:
			mes "[�A�J�f�~�[�֌W��]";
			mes "�������B";
			mes "�c�O���B";
			close;
		case 2:
			set AC_SAVE_MAP, '@mapnumber;
			mes "[�A�J�f�~�[�֌W��]";
			mes "���ꂶ��A�`���҃A�J�f�~�[��";
			mes "�]������ˁB";
			mes "�@";
			mes "�]�A�J�f�~�[�̓o�^�n�_��";
			mes "^FF0000" +'save_mapname$[AC_SAVE_MAP]+ "^000000�ɂȂ�܂����]";
			close2;
			warp "ac_cl_room.gat",44,32;
			end;
		case 3:
			mes "[�A�J�f�~�[�֌W��]";
			mes "�`���҃A�J�f�~�[�͖`���҂�����";
			mes "�T�|�[�g���s���w�Z����B";
			mes "�`���҃A�J�f�~�[�͊�t����";
			mes "���藧���Ă���񂾁B";
			mes "�A�J�f�~�[�ɓ��w���邱�ƂŁA";
			mes "���낢��Ȓm�����w�ׂ�񂾂�B";
			next;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�`�����̍���Ȃł����Ƃ��A";
			mes "�A�J�f�~�[�ɂ���搶���y�B��";
			mes "�����΁A�����ɉ�������͂����B";
			next;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�`���ɕK�v�Ȃ��Ƃ��w��ł������Ƃ�";
			mes "�����ȓ��T��������񂾁B";
			mes "�@";
			mes "�`���҂�S�ʓI�ɃT�|�[�g����w�Z�A";
			mes "���ꂪ�`���҃A�J�f�~�[�Ȃ̂��B";
			close;
		}
	}

OnTouch:
	set '@novice,callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	while ('save_gatname$['@mapnumber]!='@gatname$) set '@mapnumber,'@mapnumber + 1;

	if ('@novice && AC_PASSPORT==0) JOIN_ACADEMY 1;

	// �~�j�}�b�v�Ƀ|�C���g�\�� (���̑��G���A�� npc_quest_ac_ontouch.txt �Q��)
	switch('@mapnumber){
	case 0://�v�����e��
		if(AC_RANK==1 && AC_RANKTEST==2){ //��Q�ے�
			viewpoint 1,156,22,20,0xFFFF00;
		}
		if( (AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99)|| //��S�ے�
			(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99)){ //��T�ے�
			viewpoint 1,22,203,20,0xFFFF00;
		}
		if( (AC_QUEST_LV_0==0 && AC_QUEST_ST_0==1)||	//�C�ɂȂ邠�̎q�P
			(AC_QUEST_LV_0==1 && AC_QUEST_ST_0==1)||	//�C�ɂȂ邠�̎q�Q
			(AC_QUEST_LV_0==2 && AC_QUEST_ST_0==1)||	//�C�ɂȂ邠�̎q�R
			(AC_QUEST_LV_0==3 && AC_QUEST_ST_0==1)||	//�C�ɂȂ邠�̎q�S
			(AC_QUEST_LV_0==5 && AC_QUEST_ST_0==1)||	//�C�ɂȂ邠�̎q�U
			(AC_QUEST_LV_0==6 && AC_QUEST_ST_0==1)||	//�C�ɂȂ邠�̎q�V
			(AC_QUEST_LV_0==7 && AC_QUEST_ST_0==3)){	//�C�ɂȂ邠�̎q�W
			if(AC_QUEST_ST_0==1) cutin "q_run_npc_01.bmp", 4;
			viewpoint 1,146,232,10,0x0000FF; //�n���o�[�h
		}
		//����
		if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //�`���҂ɂȂ肽���P
			viewpoint 1,289,203,14,0x00FFFF;
		}
		//���
		if( (AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2)|| //�`���҂ɂȂ肽���Q
			(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2)){ //�`���҂ɂȂ肽���U
			viewpoint 1,156,22,14,0x00FFFF;
		}
		//����
		if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //�`���҂ɂȂ肽���S
			(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) || //�`���҂ɂȂ肽���V
			(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) ){ //�`���҂ɂȂ肽���X
			viewpoint 1,22,203,14,0x00FFFF;
		}
		if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2) ||	//�_���W�����~�o�P
			(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) ||	//�_���W�����~�o�R
			(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) ){	//�����̂���`���T
			viewpoint 1,22,203,13,0x00FF00;
		}
		end;
	case 1://�C�Y���[�h
		if(  AC_QUEST_ST_0==2 && AC_QUEST_LV_0==1){		//�C�ɂȂ邠�̎q�Q
			viewpoint 1,148,148,10,0x0000FF; //���
		} else 
		if( (AC_QUEST_LV_0==7 && AC_QUEST_ST_0==1)||	//�C�ɂȂ邠�̎q�W
			(AC_QUEST_LV_0==8 && AC_QUEST_ST_0==1)){	//�C�ɂȂ邠�̎q�X
			cutin "q_run_npc_03.bmp", 4;
			viewpoint 1,137,156,10,0x0000FF; //�X�U���k
		}
		if(  AC_QUEST_LV_2==5 && AC_QUEST_ST_2==2){		//���َq�̍ޗ��W�߂S
			viewpoint 1,201,181,12,0xFF9900; //�D��
		}
		if( (AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2) || //�_���W�����~�o�Q
			(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2) ){ //�_���W�����~�o�S
			viewpoint 1,201,181,13,0x00FF00; //�D��
		}
		end;
	case 2://�����N
		if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //��U�ے�
			viewpoint 1,160,17,20,0xFFFF00;
		}
		if( (AC_QUEST_LV_0==2 && AC_QUEST_ST_0==2)||	//�C�ɂȂ邠�̎q�R
			(AC_QUEST_LV_0==4 && AC_QUEST_ST_0==3)){	//�C�ɂȂ邠�̎q�T
			viewpoint 1,25,294,10,0x0000FF; //�s��
		}
		if( (AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) || //�`���҂ɂȂ肽���R
			(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) ){ //�`���҂ɂȂ肽���T
			viewpoint 1,160,17,14,0x00FFFF;
		}
		if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //�����̂���`���Q
			viewpoint 1,25,294,13,0x00FF00; //�s��
		}
		end;
	case 3://�A���x���^
		if(AC_RANK==0 && AC_RANKTEST==2){ //��P�ے�
			viewpoint 1,15,234,20,0xFFFF00;
		}
		if(AC_QUEST_ST_1){ //��Ղ̔� �S�G�s�\�[�h
			if(AC_QUEST_ST_1==1) cutin "q_run_npc_04.bmp", 4;
			viewpoint 1,39,46,11,0xFF0000;
		}
		end;
	case 4://�Q�t�F��
		if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //��U�ے�
			viewpoint 1,217,119,20,0xFFFF00;
		}
		if(AC_QUEST_LV_0==3 && AC_QUEST_ST_0==2){		//�C�ɂȂ邠�̎q�S
			viewpoint 1,172,174,10,0x0000FF; //�厡��̉�(�I�l�X�g�Ɠ�����)
		}
		if(AC_QUEST_ST_4==1){ //�`���҂ɂȂ肽�� �S��
			cutin "q_run_npc_09.bmp", 4;
			viewpoint 1,172,174,14,0x00FFFF;
		}
		if(AC_QUEST_LV_3==0 && AC_QUEST_ST_3==3){	//�����̂���`���P
			viewpoint 1,26,119,13,0x00FF00;
		}
		end;
	case 5://�t�F�C����
		if(AC_RANK==2 && AC_RANKTEST==2){ //��R�ے�
			viewpoint 1,122,27,20,0xFFFF00; // �t�F�C������
		}
		if(AC_RANK==5 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��U�ے�
			viewpoint 1,267,89,20,0xFFFF00; // �t�F�C������
		}
		if(AC_RANK==6 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��V�ے�
			viewpoint 1,16,143,20,0xFFFF00; // �t�F�C������
		}
		if(AC_QUEST_LV_0==4 && AC_QUEST_ST_0==1){ //�C�ɂȂ邠�̎q�T
			cutin "q_run_npc_02.bmp", 4;
			viewpoint 1,140,85,10,0x0000FF; //�W�F�����h(���)
		}
		if(AC_QUEST_LV_1==1 && AC_QUEST_ST_1==2){ //��Ղ̔��Q
			viewpoint 1,216,120,11,0xFF0000; //���C�X
		}
		if(AC_QUEST_LV_2==8 && AC_QUEST_ST_2==2){ //���l�т̕i��͂������Q
			viewpoint 1,165,99,12,0xFF9900; //���C�A�X
		}
		if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){ //�����̂���`���R
			viewpoint 1,228,330,13,0x00FF00;	// �|�葺WP
		}
		if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){//	�����̂���`���S
			viewpoint 1,122,27,13,0x00FF00;	// �t�F�C������
		}
		end;
	}
	end;
OnInit:
	if(strnpcinfo(2)!="func") waitingroom "�A�J�f�~�[�֌W��",0;
	setarray 'save_gatname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat";
	setarray 'save_mapname$,"�v�����e��","�C�Y���[�h","�����N","�A���x���^","�Q�t�F��","�t�F�C����";
}

prontera.gat,153,192,4	duplicate(�A�J�f�~�[�֌W��#func)	�A�J�f�~�[�֌W��::AC_PRO	750,8,8
izlude.gat,126,118,4	duplicate(�A�J�f�~�[�֌W��#func)	�A�J�f�~�[�֌W��::AC_IZL	750,8,8
geffen.gat,116,109,4	duplicate(�A�J�f�~�[�֌W��#func)	�A�J�f�~�[�֌W��::AC_GEF	750,8,8
morocc.gat,147,101,4	duplicate(�A�J�f�~�[�֌W��#func)	�A�J�f�~�[�֌W��::AC_MOR	750,8,8
payon.gat,159,205,4		duplicate(�A�J�f�~�[�֌W��#func)	�A�J�f�~�[�֌W��::AC_PAY	750,8,8
alberta.gat,107,132,4	duplicate(�A�J�f�~�[�֌W��#func)	�A�J�f�~�[�֌W��::AC_ALB	750,8,8

//-----------------------------------------
// ���[���̃N�G�X�g�⏕��

-	script	�A�J�f�~�[�֌W��#func2	-1,{
	set '@novice, callfunc("AC_GetNovice");
	set '@gatname$,getmapname("");
	for(set '@i,0; 'mapname$['@i]!='@gatname$; set '@i,'@i+1){}
	set '@mapnumber,'@i;

	if(AC_PASSPORT==0){
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ɂ��́B";
		mes "�l�͖`���҃A�J�f�~�[�̕⏕���ł��B";
		mes "�����l�ɗp�ł����H";
		next;
		if(select("�`���҃A�J�f�~�[�ɂ���","���ɗp�͖���")==2){
			mes "[�A�J�f�~�[�֌W��]";
			mes "�����ł����A";
			mes "�܂��A�l�ɗp�������";
			mes "���Ă��������ˁB";
			close;
		}
		mes "[�A�J�f�~�[�֌W��]";
		mes "�`���҃A�J�f�~�[��";
		mes "�`���҂̂��߂̊w�Z�ł��B";
		mes "�A�J�f�~�[�ɓ��w���邱�ƂŁA";
		mes "���낢��Ȓm�����w�ׂ�񂾁B";
		mes "�w��ł������Ƃł����ȓ��T��";
		mes "������̂ł��B";
		next;
		mes "[�A�J�f�~�[�֌W��]";
		mes "�`�����̍���Ȃł����Ƃ��A";
		mes "�A�J�f�~�[�ɂ���搶��";
		mes "��y�B�ɕ����΁A";
		mes "�����ɉ�������͂��ł���B";
		next;
		mes "[�A�J�f�~�[�֌W��]";
		mes "�`���҃A�J�f�~�[��";
		mes "���w�������ꍇ�́A";
		mes "�v�����e���A�����N�A�Q�t�F���A";
		mes "�t�F�C�����A�A���x���^�A�C�Y���[�h";
		mes "�ɂ���A�J�f�~�[�֌W�҂�";
		mes "�b�������Ă��������ˁB";
		close;
	}
	mes "[�A�J�f�~�[�֌W��]";
	mes "����ɂ��́B";
	mes "�`���҃A�J�f�~�[�̐��k�̕����ˁB";

	//�]���`�F�b�N
	set '@warpflag,0;
	if('@novice) {
		// �N�G�i�s���Ŋ��A�˗��l�̋���}�b�v�łȂ���
		// �A�J�f�~�[�ֈړ������Ă���Ȃ��B
		switch('@mapnumber){
		case 6: //�A���f�o����
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==0)||	//�����b�ɂȂ������̐l��
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==1)||	//���l�т̕i��͂������P
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==7)||	//���َq���͂�
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==8);	//���l�т̕i��͂������Q
			break;
		case 7: //�W���m�[
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==1)||	//���l�т̕i��͂������P
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==2)||	//���َq�̍ޗ��W�߂P
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==3)||	//���َq�̍ޗ��W�߂Q
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==4)||	//���َq�̍ޗ��W�߂R
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==5)||	//���َq�̍ޗ��W�߂S
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==6)||	//���َq�̍ޗ��W�߂T
							(AC_QUEST_ST_2 && AC_QUEST_LV_2==7);	//���َq���͂�
			break;
		case 8: //�E���o��
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==6);	//��Ղ̔��V
			break;
		case 9: //�R���h
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==5)||	//�C�ɂȂ邠�̎q�U
							(AC_QUEST_ST_1 && AC_QUEST_LV_1==7);	//��Ղ̔��W
			break;
		case 10: //�t�B�Q��
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==8)||	//���l�т̕i��͂������Q
							(AC_QUEST_ST_3);						//�����̂���`��(�S�G�s�\�[�h)
			break;
		case 11: //���w��
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==8);	//�C�ɂȂ邠�̎q�X
			break;
		case 12: //���q�^���[��
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==2);	//���َq�̍ޗ��W�߂P
			break;
		case 13: //�x�C���X
			set '@warpflag, (AC_QUEST_ST_0 && AC_QUEST_LV_0==8);	//�C�ɂȂ邠�̎q�X
			break;
		case 14: //�R������
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==3);	//��Ղ̔��S
			break;
		case 15: //���V��
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==4);	//��Ղ̔��T
			break;
		case 16: //�A���^��
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==5);	//��Ղ̔��U
			break;
		case 18: //�A�}�c
			set '@warpflag, (AC_QUEST_ST_1 && AC_QUEST_LV_1==2);	//��Ղ̔��R
			break;
		case 19: //�A�C���u���b�N
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==3);	//���َq�̍ޗ��W�߂Q
			break;
		case 21: //�A�C���x�t
			set '@warpflag, (AC_QUEST_ST_2 && AC_QUEST_LV_2==4);	//���َq�̍ޗ��W�߂R
			break;
		}
	}
	if('@warpflag){
		mes "�����A���[���̗p���͂��񂾂̂��ȁH";
		mes "�p�������񂾂̂Ȃ�A";
		mes "�`���҃A�J�f�~�[�ɓ]������";
		mes "�������B";
		next;
		set '@sel, select("�]�����Ă��炤","���ӂɂ��Ēm�肽��","���ɗp�͖���");
	} else {
		mes "�����l�ɗp������̂��ȁH";
		next;
		set '@sel, select("���ӂɂ��Ēm�肽��","���ɗp�͖���")+1;
	}
	switch('@sel){
	case 1:
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ł͂�����I";
		close2;
		warp "ac_cl_area.gat",67,155;
		end;
	case 2:
		mes "[�A�J�f�~�[�֌W��]";
		mes "���̂�����̂��Ƃɂ���";
		mes "�m�肽���񂾂ˁB";
		callfunc "ac_map_info", '@mapnumber, "����B";
		end;
	default:
		mes "[�A�J�f�~�[�֌W��]";
		mes "���������H";
		mes "�܂��A�l�ɗp�������";
		mes "���ĂˁB";
		close;
	}
OnInit:
	setarray 'mapname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat","aldebaran.gat","yuno.gat","umbala.gat","comodo.gat","hugel.gat","rachel.gat","lighthalzen.gat","veins.gat","gonryun.gat","louyang.gat","ayothaya.gat","moc_prybd1.gat","amatsu.gat","einbroch.gat","pay_arche.gat","einbech.gat";
	if(strnpcinfo(2)!="func2") waitingroom "�A�J�f�~�[�֌W��",0;
}
aldebaran.gat,134,114,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#ALD	883
yuno.gat,142,176,4			duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#YNO	883
umbala.gat,93,154,4			duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#UBR	883
comodo.gat,172,165,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#CMD	883
hugel.gat,93,155,4			duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#HGL	883
rachel.gat,129,144,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#RCL	883
lighthalzen.gat,219,161,4	duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#LTZ	883
veins.gat,197,133,4			duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#VNS	883
amatsu.gat,121,155,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#AMA	883
gonryun.gat,174,134,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#GON	883
louyang.gat,215,118,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#LOU	883
ayothaya.gat,213,193,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#AYO	883
einbroch.gat,223,182,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#EIN	883
einbech.gat,171,137,4		duplicate(�A�J�f�~�[�֌W��#func2)	�A�J�f�~�[�֌W��#EIB	883

//----------------------------------
// �ꎟ�]�E�T�|�[�g

-	script	�A�J�f�~�[�T�|�[�g#func	-1,{
L_START:
	set '@novice, callfunc("AC_GetNovice");
	if     ("SWD"==strnpcinfo(2)) set '@job$,"�\�[�h�}��";
	else if("MGI"==strnpcinfo(2)) set '@job$,"�}�W�V����";
	//else if("ACO"==strnpcinfo(2)) set '@job$,"�A�R���C�g";
	else if("ARC"==strnpcinfo(2)) set '@job$,"�A�[�`���[";
	else if("SHF"==strnpcinfo(2)) set '@job$,"�V�[�t";
	//else if("MRC"==strnpcinfo(2)) set '@job$,"�}�[�`�����g";
	else if("TKW"==strnpcinfo(2)) set '@job$,"�e�R���L�b�h";
	else if("GUN"==strnpcinfo(2)) set '@job$,"�K���X�����K�[";
	else if("NIN"==strnpcinfo(2)) set '@job$,"�E��";
	else if("SNV"==strnpcinfo(2)) set '@job$,"�X�[�p�[�m�[�r�X";
	if('@job$==""){
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ɂ��́B";
		mes "�l�͖`���҃A�J�f�~�[��";
		mes "�V�Ė`���ҒS���ŁA";
		mes "�����ŋ삯�o���̖`���҂�";
		mes "�]�E����̂ɖ���Ȃ��悤��";
		mes "�T�|�[�g���Ă���񂾂�B";
	}
	else {
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ɂ��́B";
		mes "�l�͖`���҃A�J�f�~�[��";
		mes "�V�Ė`���ҒS���ŁA"+'@job$+"��";
		mes "�Ȃ낤�Ƃ��Ă���`���҂�";
		mes '@job$+"�ɂȂ肽�Ă�";
		mes "�`���҂��T�|�[�g���Ă����ł��B";
	}
	if(!'@novice){
		next;
		mes "[�A�J�f�~�[�֌W��]";
		mes "�N�͂����n���`���҂��ˁB";
		mes "�l�̃T�|�[�g�͕K�v�Ȃ��݂������B";
		close;
	}
	next;
	menu "�A�J�f�~�[�ɓ]�����Ă��炤",L_WARP,"���ӂɂ��Ēm�肽��",L_WHERE,"�E�Ƃ̏����~����",L_GIVEBOOK,"�Ȃ�ł��Ȃ�",L_CANCEL;
L_WARP:
	mes "[�A�J�f�~�[�֌W��]";
	mes "�]�������B";
	close2;
	warp "ac_cl_room.gat",44,59; end;
L_WHERE:
	set '@gatname$,getmapname("");
	for(set '@i,0; 'mapname$['@i]!='@gatname$; set '@i,'@i+1){}
	set '@mapnumber,'@i;
	mes "���̂�����̂��Ƃɂ���";
	mes "�m�肽����ł��ˁB";
	callfunc "ac_map_info", '@mapnumber, "�ł��B";
	end;
L_GIVEBOOK:
	mes "[�A�J�f�~�[�֌W��]";
	mes "�E�Ƃ̏����ˁB";
	mes "�͂��A�ǂ����B";
	mes "�K�v�ɂȂ�����";
	mes "���ł������ĂˁB";
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
		close;
	}
	next;
	mes "[�A�J�f�~�[�֌W��]";
	mes "�c�c";
	mes "����A�N�̉ו��������ς���";
	mes "�E�Ƃ̏���n���Ȃ���B";
	mes "�ו��̎�ސ������炵�Ă���";
	mes "�܂��b�������ĂˁB";
	close;
L_CANCEL:
	mes "[�A�J�f�~�[�֌W��]";
	mes "�������B";
	mes "���ł��A���������Ă����΁A";
	mes "�����ɑ����Ă������B";
	close;
OnTouch:
	if(AC_JOBCHANGE){
		set AC_JOBCHANGE,0;
		if(!callfunc("AC_GetNovice")) end;
		mes "[�A�J�f�~�[�֌W��]";
		mes "����ɂ��́B";
		mes "�l�͖`���҃A�J�f�~�[��";
		mes "�V�Ė`���ҒS���ŁA";
		mes "�����ŋ삯�o���̖`���҂�";
		mes "�]�E����̂ɖ���Ȃ��悤��";
		mes "�T�|�[�g���Ă���񂾂�B";
		next;
		if(BaseLevel<=55 && Job==Job_Novice && Upper!=1){
			mes "[�A�J�f�~�[�֌W��]";
			mes "����H";
			mes "�]�E�ł��Ȃ������悤���ˁB";
			mes "�@";
			mes "1���E�֓]�E����ɂ�";
			mes "^0000FF�u��{�X�L���v�̃��x����9�@^000000��";
			mes "����K�v�������B";
			emotion 0;
			next;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�]�E���Ă��邩���H";
			mes "����Ƃ��A�`���҃A�J�f�~�[��";
			mes "�߂邩���H";
			next;
			if(select("1���E�֓]�E���Ă���","�A�J�f�~�[�ɖ߂�")==2){
				mes "[�A�J�f�~�[�֌W��]";
				mes "���ꂶ��A�`���҃A�J�f�~�[��";
				mes "�]�������B";
				close2;
				warp "ac_cl_room",44,59;
				end;
			}
		} else {
			mes "[�A�J�f�~�[�֌W��]";
			mes "�N�̂��Ƃ̓G�[������";
			mes "��������B";
			mes "�����A�]�E�ł���";
			mes "�悤���ˁB";
			mes "���߂łƂ��I";
			emotion 46;
			next;
			mes "[�A�J�f�~�[�֌W��]";
			mes "�`���҃A�J�f�~�[��";
			mes "�삯�o���̖`���҂�";
			mes "��������ɂ͗ǂ�������B";
			mes "�@";
			mes "�����`���҃A�J�f�~�[��";
			mes "�߂邩���H";
			next;
			if(select("�A�J�f�~�[�ɖ߂�","�A�J�f�~�[�ɖ߂�Ȃ�")==1){
				mes "[�A�J�f�~�[�֌W��]";
				mes "���ꂶ��A";
				mes "�`���҃A�J�f�~�[��";
				mes "�]�������B";
				close2;
				warp "ac_cl_room",44,59;
				end;
			}
		}
		mes "[�A�J�f�~�[�֌W��]";
		mes "���ł�";
		mes "�`���҃A�J�f�~�[�܂�";
		mes "���邩��A�]�E������A";
		mes "�܂����ĂˁB";
		close;
	}
	end;
OnInit:
	setarray 'mapname$,"prontera.gat","izlude.gat","morocc.gat","alberta.gat","geffen.gat","payon.gat","aldebaran.gat","yuno.gat","umbala.gat","comodo.gat","hugel.gat","rachel.gat","lighthalzen.gat","veins.gat","gonryun.gat","louyang.gat","ayothaya.gat","moc_prybd1.gat","einbroch.gat","amatsu.gat","pay_arche.gat";
	if(strnpcinfo(2)!="func") waitingroom "�ꎟ�]�E�T�|�[�g",0;
}
izlude.gat,56,139,4			duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#SWD	750,5,5
geffen.gat,65,170,4			duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#MGI	750,5,7
prontera.gat,238,313,4		duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#ACO	750,5,5
pay_arche.gat,141,165,4		duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#ARC	750,5,5
moc_prydb1.gat,52,132,4		duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#SHF	750
alberta.gat,46,46,4			duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#MRC	750,5,5
payon.gat,161,135,4			duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#TKW	750
einbroch.gat,131,196,4		duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#GUN	750,5,5
amatsu.gat,151,139,4		duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#NIN	750,5,5
aldebaran.gat,108,70,4		duplicate(�A�J�f�~�[�T�|�[�g#func)	�A�J�f�~�[�T�|�[�g#SNV	750,5,5
