//============================================================
// Auriga Script
//------------------------------------------------------------
// Ragnarok Online -- �`���҃A�J�f�~�[
//                                                  by Pneuma
// ������b�֌W ----------------------------------------------

//------------------------------------------------------------------------------
// �~�j�}�b�v�\��(�{�I�ł�NPC�� �u�R���p�X�v)
//
// �A�J�f�~�[�֌W�҃^�C�v�P�Ń^�b�`������̂̓A�J�f�~�[�֌W�҂�OnTouch�Q��
// NPC���d�Ȃ��OnTouch���������Ȃ��ׁA�S�Ă����ɁI
//
// *ID��viewpoint�Ŏg�p����ID
// �F 0x0000FF ID:10 (�C�ɂȂ邠�̎q)
// �ԐF 0xFF0000 ID:11 (��Ղ̔�)
// ��F 0xFF9900 ID:12 (�����b�ɂȂ������̐l��)
// �ΐF 0x00FF00 ID:13 (�����̂���`��/�_���W�����~�o)
// ���F 0x00FFFF ID:14 (�`���҂ɂȂ肽��)
// ���F 0xFFFF00 ID:20 (�S����)
//
//------------------------------------------------------------------------------

pay_fild03.gat,388,63,0	script	AC_TSTVP1_02	139,1,1,{ //�X����̃��[�v��Ń^�b�`
	if(AC_RANK==0 && AC_RANKTEST==2){ //��P�ے�
		viewpoint 1,209,143,20,0xFFFF00;
	}
}
prt_fild08.gat,170,375,0	script	AC_TSTVP2_02	139,1,1,{ //�v����Ń^�b�`
	if(AC_RANK==1 && AC_RANKTEST==2){ //��Q�ے�
		viewpoint 1,233,16,20,0xFFFF00;
	}
	if( (AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2)|| //�`���҂ɂȂ肽���Q
		(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2)){ //�`���҂ɂȂ肽���U
		viewpoint 1,233,16,14,0x00FFFF;
	}
}
moc_fild01.gat,238,378,0	script	AC_TSTVP2_03	139,1,1,{ //�q�f�U�}�b�v�Ń^�b�`
	if(AC_RANK==1 && AC_RANKTEST==2){ //��Q�ے�
		viewpoint 1,379,162,20,0xFFFF00;
	}
	if(AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2){ //�`���҂ɂȂ肽���Q
		viewpoint 1,379,162,14,0x00FFFF;
	}
	if(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���U
		viewpoint 1,322,16,14,0x00FFFF;
	}
}
pay_fild04.gat,20,165,0		script	AC_TSTVP2_04	139,1,1,{ //�|�������Ń^�b�`
	if(AC_RANK==1 && AC_RANKTEST==2){ //��Q�ے�
		viewpoint 1,350,330,20,0xFFFF00;
	}
	if(AC_QUEST_LV_4==1 && AC_QUEST_ST_4==2){ //�`���҂ɂȂ肽���Q
		viewpoint 1,267,193,14,0x00FFFF; //�B�e�|�C���g�Q
	}
}
pay_fild01.gat,333,356,0				script	AC_TSTVP3_02	139,1,1,{ //�t�F�C��Ń^�b�`
	if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){//	�����̂���`���S
		viewpoint 1,353,14,13,0x00FF00;	// �E���t�}�b�v�����(�E��)
	}
	if(AC_RANK==2 && AC_RANKTEST==2){ //��R�ے�
		viewpoint 1,353,14,20,0xFFFF00;
	}
}
pay_fild02.gat,160,381,0				script	AC_TSTVP2_03	139,1,1,{ //�E���t�}�b�v�E��WP�Ń^�b�`
	if(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==3){//	�����̂���`���S
		viewpoint 1,52,125,13,0x00FF00;	// ���₵���L�m�R
	}
	if(AC_RANK==2 && AC_RANKTEST==2){ //��R�ے�
		viewpoint 1,105,242,20,0xFFFF00;
	}
}
pay_fild02.gat,83,382,0					script	AC_TSTVP2_04	139,1,1,{ //�E���t�}�b�v�㒆��WP�Ń^�b�`(����Ȃ��H)
	if(AC_RANK==2 && AC_RANKTEST==2){ //��R�ے�
		viewpoint 1,105,242,20,0xFFFF00;
	}
}
mjolnir_09.gat,106,34,0					script	AC_TSTVP4_03	139,1,1,{ //�v���������[�v��Ń^�b�`
	if(AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��S�ے�
		viewpoint 1,30,249,20,0xFFFF00;
	}
	if(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��T�ے�
		viewpoint 1,100,365,20,0xFFFF00;
	}
}
gef_fild00.gat,376,140,0				script	AC_TSTVP4_05	139,1,1,{ //�Q�t�F��
	if(AC_RANK==3 && AC_RANKTEST>=7 && AC_RANKTEST!=99){ //��S�ے�
		viewpoint 1,40,199,20,0xFFFF00;
	}
}
prt_fild00.gat,380,249,0				script	AC_TSTVP4_05	139,1,1,{ //�v�����������[�v��Ń^�b�`
	if(AC_RANK==3 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��S�ے�
		viewpoint 1,152,250,20,0xFFFF00;
	}
}
prt_fild05.gat,367,205,0				script	AC_TSTVP5_02	139,1,1,{ //�v����
	if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2) ||	//�_���W�����~�o�P
		(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) ||	//�_���W�����~�o�R
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) 		//�����̂���`���T
	){
		viewpoint 1,270,212,13,0x00FF00;	//�n�����H�Ǘ���
	}
	if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //�`���҂ɂȂ肽���S
		(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) ){ //�`���҂ɂȂ肽���V
		viewpoint 1,13,63,14,0x00FFFF;
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2){	//�`���҂ɂȂ肽���X
		viewpoint 1,270,212,14,0x00FFFF; //�n�����H�Ǘ���
	}
	if(AC_RANK==3 && AC_RANKTEST==2){ //��S�ے�
		viewpoint 1,105,381,20,0xFFFF00;
		mes "[" + strcharinfo(0) + "]";
		mes "�K���h��^0000FF�v�����e��^000000����^0000FF�Q�t�F��^000000��";
		mes "�������Ƃ��Č����Ă������B";
		mes "�r����^FF0000�h���b�v�搶^000000�ɂ��ٓ���";
		mes "�n���Ȃ�����B";
		mes "�܂���^FF0000�k���̕��p��^000000�����Ă������B";
		close2;
		set AC_RANKTEST,3; //�t���O�X�V
		end;
	}
	if(AC_RANK==4 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��T�ے�
		viewpoint 1,105,381,20,0xFFFF00;
	}
}
prt_fild05.gat,357,205,0				script	AC_TSTVP5_02	139,7,7,{ //�v�����i���[�v�O�j
	if(AC_RANK==6 && AC_RANKTEST==15){
		mes "[" + strcharinfo(0) + "]";
		mes "�v�����e����������B";
		mes "���Ə������I";
		close2;
		set AC_RANKTEST,16;
		end;
	}
}
pay_fild08.gat,20,74,0					script	AC_TSTVP6_02	139,1,1,{ //�t�F�C��
	if(AC_RANK==5 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��U�ے�
		viewpoint 1,167,332,20,0xFFFF00;
	}
}
gef_fild00.gat,46,199,0					script	AC_TSTVP6_04	139,1,1,{ //�Q�t�F����
	if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //��U�ے�
		viewpoint 1,267,382,20,0xFFFF00;
	}
}
mjolnir_06.gat,265,32,0					script	AC_TSTVP6_05	139,1,1,{ //�~�����j�[���R��06
	if(AC_RANK==5 && AC_RANKTEST>=3 && AC_RANKTEST!=99){ //��U�ے�
		viewpoint 1,226,183,20,0xFFFF00;
	}
}
moc_fild12.gat,159,378,0				script	AC_TSTVP6_07	139,1,1,{ //�����N��
	if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //��U�ے�
		viewpoint 1,118,30,20,0xFFFF00;
	}
	if( (AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) || //�`���҂ɂȂ肽���R
		(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) ){ //�`���҂ɂȂ肽���T
		viewpoint 1,118,30,14,0x00FFFF;
	}
}
moc_fild18.gat,158,379,0				script	AC_TSTVP6_07	139,1,1,{ //�\�O���g����18
	if(AC_RANK==5 && AC_RANKTEST>=4 && AC_RANKTEST!=99){ //��U�ے�
		viewpoint 1,211,95,20,0xFFFF00;
	}
	if(AC_QUEST_LV_4==2 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���R
		viewpoint 1,232,217,14,0x00FFFF; //�B�e�|�C���g�R
	}
	if(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���T
		viewpoint 1,382,305,14,0x00FFFF;
	}
}
pay_gld.gat,370,149,0					script	AC_TSTVP7_02	139,1,1,{ //�`����������
	if(AC_RANK==6 && AC_RANKTEST>=2 && AC_RANKTEST!=99){ //��V�ے�
		viewpoint 1,273,307,20,0xFFFF00;
	}
}
moc_fild01.gat,315,25,0					script	AC_TSTVP7_03	139,1,1,{ //�\�O���g����01
	if(AC_RANK==6 && AC_RANKTEST>=7 && AC_RANKTEST!=99){ //��V�ے�
		viewpoint 1,190,38,20,0xFFFF00;
	}
}
prt_fild09.gat,380,237,0				script	AC_TSTVP7_04	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=9 && AC_RANKTEST!=99){ //��V�ے�
		viewpoint 1,304,193,20,0xFFFF00;
	}
}
prt_fild07.gat,206,15,0					script	AC_TSTVP7_05	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=14 && AC_RANKTEST!=99){ //��V�ے�
		viewpoint 1,248,376,20,0xFFFF00;
	}
}
prt_fild05.gat,257,18,0					script	AC_TSTVP7_06	139,1,1,{
	if(AC_RANK==6 && AC_RANKTEST>=15 && AC_RANKTEST!=99){ //��V�ے�
		viewpoint 1,367,205,20,0xFFFF00;
	}
}
moc_ruins.gat,156,42,0		script	AC_QUEVP00_04	139,1,1,{
	if( (AC_QUEST_ST_0==2 && AC_QUEST_LV_0==2)||	//�C�ɂȂ邠�̎q�R
		(AC_QUEST_ST_0==3 && AC_QUEST_LV_0==4)){	//�C�ɂȂ邠�̎q�T
		viewpoint 1,114,100,10,0x0000FF; //�s���O�X�U���k
	}
	if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //�����̂���`���Q
		viewpoint 1,54,161,13,0x00FF00; //�s�������
	}
}
comodo.gat,172,165,0		script	AC_QUEVP00_05	139,7,7,{ //�R���h �A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==5){		//�C�ɂȂ邠�̎q�U
		viewpoint 1,165,163,10,0x0000FF; //�m�G���A
	}
	if(AC_QUEST_LV_1==7 && AC_QUEST_ST_1==2){ //��Ղ̔��W
		viewpoint 1,113,219,11,0xFF0000; //�^�[�j��
	}
}
prt_fild06.gat,27,193,0		script	AC_QUEVP00_06	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){		//�C�ɂȂ邠�̎q�U
		viewpoint 1,277,320,10,0x0000FF; //�J�s�g�[���i�C���@��
	}
	if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //�`���҂ɂȂ肽���P
		viewpoint 1,277,320,14,0x00FFFF;
	}
}
prt_fild02.gat,305,22,0		script	AC_QUEVP00_07	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){		//�C�ɂȂ邠�̎q�U
		viewpoint 1,380,347,10,0x0000FF; //�J�s�g�[���i�C���@��
	}
	if(AC_QUEST_LV_4==0 && AC_QUEST_ST_4==2){ //�`���҂ɂȂ肽���P
		viewpoint 1,305,157,14,0x00FFFF; //�B�e�|�C���g�P
	}
}
prt_fild03.gat,23,249,0		script	AC_QUEVP00_08	139,1,1,{
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==6){		//�C�ɂȂ邠�̎q�U
		viewpoint 1,371,256,10,0x0000FF; //�J�s�g�[���i�C���@��
	}
}
rachel.gat,129,144,0		script	AC_QUEVP00_10	139,7,7,{	//���w�� �A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_ST_0==2 && AC_QUEST_LV_0==8){		//�C�ɂȂ邠�̎q�X
		viewpoint 1,148,190,10,0x0000FF;
	}
}
veins.gat,197,133,0			script	AC_QUEVP00_11	139,7,7,{	//�x�C���X �A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_ST_0==3 && AC_QUEST_LV_0==8){		//�C�ɂȂ邠�̎q�X
		viewpoint 1,148,329,10,0x0000FF;
	}
}
amatsu.gat,121,155,0	script	#AC_QUEVP01_03	139,7,7,{	//�A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_LV_1==2 && AC_QUEST_ST_1==2){ //��Ղ̔��R
		viewpoint 1,212,141,11,0xFF0000; //�A�[�`�{���h
	}
}
gonryun.gat,174,134,0	script	#AC_QUEVP01_04	139,7,7,{	//�A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_LV_1==3 && AC_QUEST_ST_1==2){ //��Ղ̔��S
		viewpoint 1,140,65,11,0xFF0000; //�Q�C�\��
	}
}
louyang.gat,215,118,0	script	#AC_QUEVP01_05	139,7,7,{	//�A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_LV_1==4 && AC_QUEST_ST_1==2){ //��Ղ̔��T
		viewpoint 1,229,109,11,0xFF0000; //�h�i�e��
	}
}
ayothaya.gat,213,193,0	script	#AC_QUEVP01_06	139,7,7,{	//�A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_LV_1==5 && AC_QUEST_ST_1==2){ //��Ղ̔��U
		viewpoint 1,212,176,11,0xFF0000; //�f���[�C
	}
}
umbala.gat,93,154,0		script	#AC_QUEVP01_07	139,7,7,{	//�A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_LV_1==6 && AC_QUEST_ST_1==2){ //��Ղ̔��V
		viewpoint 1,96,164,11,0xFF0000; //�f�j�X
	}
}
prt_fild04.gat,374,73,0			script	AC_QUEVP04_13	139,1,1,{
	if( (AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2) || //�`���҂ɂȂ肽���S
		(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) ){ //�`���҂ɂȂ肽���V
		viewpoint 1,17,114,14,0x00FFFF;
	}
}
gef_fild01.gat,375,111,0		script	AC_QUEVP04_14	139,1,1,{
	if(AC_QUEST_LV_4==3 && AC_QUEST_ST_4==2){ //�`���҂ɂȂ肽���S
		viewpoint 1,208,242,14,0x00FFFF;//�B�e�|�C���g�S
	}
	if(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2){ //�`���҂ɂȂ肽���V
		viewpoint 1,16,102,14,0x00FFFF;
	}
}
moc_fild17.gat,33,300,0		script	AC_QUEVP04_15	139,1,1,{
	if(AC_QUEST_LV_4==4 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���T
		viewpoint 1,146,145,14,0x00FFFF;//�B�e�|�C���g�T
	}
}
moc_fild02.gat,77,338,0		script	AC_QUEVP04_19	139,1,1,{
	if(AC_QUEST_LV_4==5 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���U
		viewpoint 1,332,19,14,0x00FFFF;
	}
}
gef_fild09.gat,368,92,0		script	AC_QUEVP04_20	139,1,1,{
	if(AC_QUEST_LV_4==6 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���V
		viewpoint 1,225,25,14,0x00FFFF;
	}
}
aldebaran.gat,134,114,0		script	AC_QUEVP04_21	139,7,7,{ 	//�A�J�f�~�[�֌W�҃^�C�v�Q
	if( (AC_QUEST_LV_2==0 && AC_QUEST_ST_2==1) || // �����b�ɂȂ������̐l�ɂP
		(AC_QUEST_LV_2==1 && AC_QUEST_ST_2==1) || // ���l�т̕i��͂������P
		(AC_QUEST_LV_2==7 && AC_QUEST_ST_2==2) || // ���َq���͂�
		(AC_QUEST_LV_2==8 && AC_QUEST_ST_2==1)) { // ���l�т̕i��͂������Q
		if(AC_QUEST_ST_2==1) cutin "q_run_npc_05.bmp", 4;
		viewpoint 1,231,107,12,0xFF9900; //�~�U���[�̉�
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���W
		viewpoint 1,168,168,14,0x00FFFF; //�����N�T���^
	}
}
aldebaran.gat,231,107,0				script	AC_QUEVP02_02	139,1,1,{ //�~�U���[�̌�������o��
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) {
		viewpoint 1,168,166,12,0xFF9900; //�����N�T���^
	}
}
xmas_fild01.gat,100,100,0	script	AC_QUEVP04_22	139,1,1,{
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) { // �����b�ɂȂ������̐l�ɂP
		viewpoint 1,84,248,12,0xFF9900;
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���W
		viewpoint 1,84,248,14,0x00FFFF;
	}
}
xmas.gat,149,44,0			script	AC_QUEVP04_23	139,1,1,{
	if(AC_QUEST_LV_2==0 && AC_QUEST_ST_2==2) { //�����b�ɂȂ������̐l�ɂP
		viewpoint 1,189,276,12,0xFF9900;
	}
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���W
		viewpoint 1,143,314,14,0x00FFFF;
	}
}
xmas_dun01.gat,205,16,0		script	AC_QUEVP04_24	139,1,1,{
	if(AC_QUEST_LV_4==7 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���W
		viewpoint 1,129,130,14,0x00FFFF;
	}
}
prt_sewb1.gat,131,247,0		script	AC_QUEVP04_25	139,1,1,{	//�v���n�����H�P
	if(AC_QUEST_LV_3==1 && AC_QUEST_ST_3==2){ //	�_���W�����~�o�P
		viewpoint 1,301,206,13,0x00FF00; //�`�X���[
	} else
	if( (AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2) ||	//	�_���W�����~�o�R
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3) ){	//	�����̂���`���T
		viewpoint 1,188,247,13,0x00FF00; //2�w�����
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���X
		viewpoint 1,188,247,14,0x00FFFF;
	}
}
prt_sewb2.gat,19,19,0		script	AC_QUEVP04_26	139,1,1,{	//�v���n�����H�Q
	if(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==2){ //	�_���W�����~�o�R
		viewpoint 1,159,182,13,0x00FF00; //�����V�[�����
	} else
	if(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3){ //	�����̂���`���T
		viewpoint 1,180,24,13,0x00FF00; //3�w�����
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���X
		viewpoint 1,180,24,14,0x00FFFF;
	}
}
prt_sewb3.gat,180,169,0		script	AC_QUEVP04_27	139,1,1,{	//�v���n�����H�R
	if(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==3){ //	�����̂���`���T
		viewpoint 1,184,17,13,0x00FF00; //�~���~����
	}
	if(AC_QUEST_LV_4==8 && AC_QUEST_ST_4==2) { //�`���҂ɂȂ肽���X
		viewpoint 1,20,185,14,0x00FFFF;
	}
}
yuno.gat,142,176,0					script	AC_QUEVP02_05	139,7,7,{ //�}�b�Y�C�̉�
	if( (AC_QUEST_LV_2==1 && AC_QUEST_ST_2==2) || //���l�т̕i��͂������P
		(AC_QUEST_LV_2>=2 && AC_QUEST_LV_2<=7 && AC_QUEST_ST_2==1) //���َq�̍ޗ��W�߂P�`�T�E���َq���͂�
	){
		viewpoint 1,95,182,12,0xFF9900;
	}
}
lighthalzen.gat,219,161,0			script	AC_QUEVP02_06	139,7,7,{ //���q �A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==2){ //���َq�̍ޗ��W�߂P
		viewpoint 1,51,161,12,0xFF9900;  //��
	}
}
einbroch.gat,223,182,0			script	AC_QUEVP02_07	139,7,7,{ //�A�C���u���b�N �A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==3){ //���َq�̍ޗ��W�߂Q
		viewpoint 1,111,261,12,0xFF9900; //�h�u
	}
}
einbech.gat,171,137,0			script	AC_QUEVP02_08	139,7,7,{ //�A�C���x�t �A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==4){ //���َq�̍ޗ��W�߂R
		viewpoint 1,130,247,12,0xFF9900; //�h���h�C
	}
}
izlu2dun.gat,107,50,0			script	AC_QUEVP02_09	139,1,1,{ //�o�C������
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==5){ //���َq�̍ޗ��W�߂S
		viewpoint 1,136,50,12,0xFF9900; //�����C�o
	}
	if( (AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2) || //�_���W�����~�o�Q
		(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2) ){ //�_���W�����~�o�S
		viewpoint 1,108,83,13,0x00FF00;	// �C�ꓴ�A�����
	}
}
alb2trea.gat,43,53,0	script	AC_QUEVP02_10	139,1,1,{ //���v�D
	if(AC_QUEST_ST_2==2 && AC_QUEST_LV_2==6){ //���َq�̍ޗ��W�߂T
		viewpoint 1,105,95,12,0xFF9900; //�A�C����
	}
}
hugel.gat,93,155,0	script	AC_QUEVP02_11	139,8,9,{ //�t�B�Q�� �A�J�f�~�[�֌W�҃^�C�v�Q
	if(AC_QUEST_ST_2==3 && AC_QUEST_LV_2==8){ //���l�т̕i��͂������Q
		viewpoint 1,72,90,12,0xFF9900; //���b�N�X
	} else
	if( (AC_QUEST_LV_3==0 && AC_QUEST_ST_3==1) ||	//�����̂���`���P
		(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==1) ||	//�����̂���`���Q
		(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==1) ||	//�����̂���`���R
		(AC_QUEST_LV_3==6 && AC_QUEST_ST_3==1) ||	//�����̂���`���S
		(AC_QUEST_LV_3==8 && AC_QUEST_ST_3==1)		//�����̂���`���T
	){
		viewpoint 1,104,79,13,0x00FF00;
	} else
	if( (AC_QUEST_LV_3==1 && AC_QUEST_ST_3==1) ||	//�_���W�����~�o�P
		(AC_QUEST_LV_3==3 && AC_QUEST_ST_3==1) ||	//�_���W�����~�o�Q
		(AC_QUEST_LV_3==5 && AC_QUEST_ST_3==1) ||	//�_���W�����~�o�R
		(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==1)		//�_���W�����~�o�S
	){
		viewpoint 1,73,152,13,0x00FF00;
	}
}
gef_fild07.gat,336,187,0	script	AC_QUEVP03_01	139,1,1,{ //�Q�t�F����
	if(AC_QUEST_LV_3==0 && AC_QUEST_ST_3==3){ //	�����̂���`���P
		viewpoint 1,185,249,13,0x00FF00;
	}
}
moc_pryd01.gat,192,9,0	script	AC_QUEVP03_03	139,1,1,{ //�s���~�b�h�n��1F
	if(AC_QUEST_LV_3==2 && AC_QUEST_ST_3==3){ //�����̂���`���Q
		viewpoint 1,193,193,13,0x00FF00; //���C���C��
	}
}
iz_dun00.gat,168,168,0	script	AC_QUEVP03_05	139,1,1,{ //�C�ꓴ�A1�w
	if(AC_QUEST_LV_3==3 && AC_QUEST_ST_3==2){//	�_���W�����~�o�Q
		viewpoint 1,351,45,13,0x00FF00;	// �c�C�[�t��
	} else
	if(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2){//	�_���W�����~�o�S
		viewpoint 1,352,341,13,0x00FF00;	//2�w�����(�E��)
	}
}
iz_dun01.gat,253,252,0	script	AC_QUEVP03_06	139,1,1,{ //�C�ꓴ�A2�w
	if(AC_QUEST_LV_3==7 && AC_QUEST_ST_3==2){//	�_���W�����~�o�S
		viewpoint 1,129,79,13,0x00FF00;	//�U�[�p�t
	}
}
pay_arche.gat,81,22,0	script	AC_QUEVP03_07	139,1,1,{ //�|�葺�����
	if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){//	�����̂���`���R
		viewpoint 1,36,131,13,0x00FF00;	// �t�F�C�����_���W����
	}
}
pay_dun00.gat,21,183,0	script	AC_QUEVP03_08	139,1,1,{ //�t�F�C�����_���W����
	if(AC_QUEST_LV_3==4 && AC_QUEST_ST_3==3){//	�����̂���`���R
		viewpoint 1,154,172,13,0x00FF00;	// �����ςȃL�m�R
	}
}
