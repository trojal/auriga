//= Auriga Script ==============================================================
// Ragnarok Online Flame Valley Town Script�@�@by refis
//==============================================================================

//============================================================
// Shop
//------------------------------------------------------------
moro_vol.gat,95,96,6	shop	����l	553,717,611,504,525,610,645,656,657,601,602,1065

//============================================================
// �ē��v��
//------------------------------------------------------------
moro_vol.gat,144,140,3	script	�ē���	469,{
	mes "[�ē���]";
	mes "���������N��|�����ƁA";
	mes "���̃t���C�����@���[��";
	mes "�l�ԁA�T�t�@���A���t�B�l����";
	mes "���X�ƏW�����Ă��܂��I";
	mes "�������ŘA���R�̐l����";
	mes "���������ɖc��オ���Ă��܂��I";
	next;
	mes "[�ē���]";
	mes "�����c�c���̉e���łǂ��ɒN������̂�";
	mes "�킩�炸�A�����Ă��܂��l��";
	mes "�����Ă����ł��B";
	mes "���͂���Ȑl����������";
	mes "�s����ē�����悤�������܂����B";
	mes "�N��������l�͂��܂����H";
	next;
	switch(select("�i�ߊ��A�W�t","�Q�d�A�r�_��","�������C�O���h","��b�w�X�����^","�q�V�G","���w��","���҃j�[�Y�w�b�O","���Ԓn������","���ɂ��Ȃ�")) {
	case 1:
		set '@name$,"�i�ߊ��A�W�t";
		set '@x,107;
		set '@y,85;
		break;
	case 2:
		set '@name$,"�Q�d�A�r�_��";
		set '@x,107;
		set '@y,85;
		break;
	case 3:
		set '@name$,"�������C�O���h";
		set '@x,107;
		set '@y,85;
		break;
	case 4:
		set '@name$,"��b�w�X�����^";
		set '@x,139;
		set '@y,80;
		break;
	case 5:
		set '@name$,"�q�V�G";
		set '@x,96;
		set '@y,105;
		break;
	case 6:
		set '@name$,"���w��";
		set '@x,96;
		set '@y,105;
		break;
	case 7:
		set '@name$,"���҃j�[�Y�w�b�O";
		set '@x,96;
		set '@y,105;
		break;
	case 8:
		set '@name$,"���Ԓn������";
		set '@x,131;
		set '@y,100;
		break;
	case 9:
		mes "[�ē���]";
		mes "�����ł����B";
		mes "�ē����K�v�ȂƂ���";
		mes "�����Ȃ����������Ă��������ˁB";
		close;
	}
	mes "[�ē���]";
	mes "^ff0000" +'@name$+ "^000000��";
	mes "�Ƃ���ŗǂ��ł����H";
	next;
	if(select("�͂�","����ς��߂�") == 2) {
		mes "[�ē���]";
		mes "�����ł����B";
		mes "�ē����K�v�ȂƂ���";
		mes "�����Ȃ����������Ă��������ˁB";
		close;
	}
	mes "[�ē���]";
	mes "�ł͎��ɒ����ė��Ă��������B";
	close2;
	warp "moro_vol.gat",'@x,'@y;
	end;
OnInit:
	waitingroom "�t���C�����@���[�ē�",0;
	end;
}

moro_vol.gat,91,105,1	script	�����ړ��@	10007,{
	mes "[�h�t�B]";
	mes "����̓G�N���[�W����";
	mes "�q�����Ă��鎟���ړ��@�ł��B";
	mes "���̍�킪�I���Δj�������";
	mes "���̂ł����A�Ȃ��Ȃ��֗��ł���B";
	next;
	mes "�]�����ړ��@���g���܂����H";
	mes "�@�G�N���[�W���Ɉړ����܂��]";
	next;
	if(select("�G�N���[�W���Ɉړ�","��߂�") == 2) {
		mes "�]�g�p�𒆎~���܂��]";
		close;
	}
	mes "�]�G�N���[�W���Ɉړ����܂��]";
	close2;
	warp "ecl_in01.gat",38,96;
	end;
}

moro_vol.gat,88,107,5	script	���w�҃h�t�B	440,{
	mes "[�h�t�B]";
	mes "�c�c�ق��B";
	mes "�l�Ԃł����B";
	mes "�Ƃ���ł���ȋ^��͂ǂ��ł��傤���B";
	mes "���Ȃ��Ǝ��͍��A";
	mes "���ʂɉ�b�����Ă��܂���ˁB";
	next;
	mes "[�h�t�B]";
	mes "����͉��̂��H";
	mes "���̎����̋��ԂƂ����ꏊ�B";
	mes "����������ł���Ƃ��낪�c�c";
	mes "�r�t���X�g�̗̈��";
	mes "�܂܂��Ƃ������Ƃł��B";
	next;
	mes "[�h�t�B]";
	mes "�����ł��ˁB";
	mes "�����ƊȒP�ɂ����ƁA";
	mes "�R�C���̗��ʂƂ�";
	mes "������ł��傤���B";
	mes "����Ƃ����ʏ��";
	mes "���ʉ��Ƃ����ׂ��ł��傤���B";
	next;
	mes "[�h�t�B]";
	mes "�������͎��B��";
	mes "�ʂĖ������s����������������";
	mes "�����Ă���̂ł͂Ȃ��A";
	mes "�����_���������Ă���";
	mes "�Ⴄ��Ԃ̐����";
	mes "�����Ă���̂ł��傤���H";
	next;
	mes "[�h�t�B]";
	mes "�c�c�B";
	mes "��͐[�܂�΂���ł��B";
	next;
	mes "[�h�t�B]";
	mes "�c�c�������A�d�v�Ȃ̂͂����ł��B";
	mes "�l�Ԃ̌��t�ł����Ȃ��";
	mes "���䉺�Â��A�Ƃ�";
	mes "�����ׂ��ł��傤���B";
	mes "������̖{���n��";
	mes "�r�t���X�g���̕ʂ̋�ԂȂ�c�c";
	next;
	mes "[�h�t�B]";
	mes "�������ꂽ�����͖��E�̂�!!";
	mes "���̂��߂ɓ˂����邾��!!";
	mes "�c�c�ȒP�ł��傤�H";
	close;
}

moro_vol.gat,104,86,3	script	�����[�X��	748,{
	mes "[�����[�X��]";
	mes "���A�فc�c�ْ����Ă܂��B";
	mes "�c�c�������a�͉���";
	mes "���Ȃ񂩂ɋR�m�c�̕����c�c�B";
	next;
	mes "[�����[�X��]";
	mes "���K���R�m�ł��Ȃ�";
	mes "���[�h�i�C�g��";
	mes "���[���i�C�g�N���X���c�c�I";
	mes "�������c�c���̂悤��";
	mes "���[�������ɂׂ͉��d�߂��܂��c�c�B";
	next;
	mes "[�����[�X��]";
	mes "�c�c�Ƃ肠�����͖��̕ۏ؂�";
	mes "���Ă��炦�Ă�悤�ł���";
	mes "��������΂����̂��c�c�B";
	mes "���v���ȁc�c�B";
	close;
}

moro_vol.gat,101,87,5	script	���[���~�b�h�K�b�c�R�m	468,{
	switch(rand(4)) {
	case 0: unittalk "�c�c�B"; end;
	case 1: unittalk "�����͐Â����ȁB"; end;
	case 2: unittalk "�c�c�P�����Ȃ����c�c�B"; end;
	case 3: unittalk "�c�c�܂��c�c�B"; end;
	}
}

moro_vol.gat,101,85,5	script	���[���~�b�h�K�b�c�R�m	469,{
	switch(rand(5)) {
	case 0: unittalk "�����̔C���͂�����̗v�l�x���ƂȂ�܂��I"; end;
	case 1: unittalk "���܂�|����Ȃ��ł��������B���̋��|���͑S�̂ɍL����܂��B"; end;
	case 2: unittalk "�C���B���̂��߁A����΂�܂��I"; end;
	case 3: unittalk "�c�c�͂��c�c�B"; end;
	case 4: unittalk "�܂���������܂���B"; end;
	}
}

moro_vol.gat,103,83,1	script	���[���~�b�h�K�b�c�R�m	470,{
	switch(rand(5)) {
	case 0: unittalk "�����Ɛ키�̂͋R�m�̃��}���I�@���������ƂȂ�Ɓc�c�B"; end;
	case 1: unittalk "���ْ̋����͐S�n�悢�B"; end;
	case 2: unittalk "�����[�X���A�C�������������āB"; end;
	case 3: unittalk "�c�c�����c�c�B"; end;
	case 4: unittalk "�c�c�����c�c�͂��I"; end;
	}
}

moro_vol.gat,110,83,3	script	�q���[	868,{
	mes "[�q���[]";
	mes "���ɂ͂����܂�";
	mes "�H����Ă��܂��܂����ˁB";
	mes "�܂��A�����Șb�A";
	mes "���������ޏꏊ�Ƃ��A";
	mes "�{���n�Ƃ��M�����܂��񂪁c�c�B";
	next;
	mes "[�q���[]";
	mes "���̂܂܂��Əo�����Ԃ���";
	mes "���тɉ��тāc�c";
	mes "�{���A�҂��x���Ȃ�c�c�͂��c�c�B";
	next;
	mes "[�q���[]";
	mes "����ȂƂ���͈���ł�";
	mes "�����������肽�����̂ł��B";
	mes "���̂��߂ɂ�������";
	mes "���������˂΂Ȃ�܂���ˁB";
	next;
	mes "[�q���[]";
	mes "������H";
	mes "�܂��A���̋��ɂ�";
	mes "�����Ԃ��Ƃ�����܂����A";
	mes "�����邱�Ƃ��l���ėՂނ�";
	mes "���Ă�킢�ɂ������Ă��܂��܂��B";
	next;
	mes "[�q���[]";
	mes "��X�V���o���c�o���h�͕K�������܂��B";
	close;
}

moro_vol.gat,108,81,7	script	�V���o���c�o���h���s�R	852,{
	switch(rand(5)) {
	case 0: unittalk "�A�C���u���b�N���������A��C�������Ƃ́A�����܂���ˁB"; end;
	case 1: unittalk "�c�c�ց[�����傢�I�@�@���ނ��ނ����܂��c�c�B"; end;
	case 2: unittalk "�c�c�}�X�N��1�ł������Ă���Ηǂ������B"; end;
	case 3: unittalk "��X�͕K�������܂��I"; end;
	case 4: unittalk "�V���o���c�o���h�̉h���̂��߂ɁI"; end;
	}
}

moro_vol.gat,111,80,1	script	�V���o���c�o���h���s�R	852,{
	switch(rand(5)) {
	case 0: unittalk "�V���o���c�o���h�Y������H�ׂ����c�c�B"; end;
	case 1: unittalk "�c�c�Q�Ă��Ȃ��B�ґz���Ă����������B"; end;
	case 2: unittalk "�~�b�h�K���h�̂��߂ɁI"; end;
	case 3: unittalk "��X�ɕ����̕����͂Ȃ��I"; end;
	case 4: unittalk "�V���o���c�o���h�̉h���̂��߂ɁI"; end;
	}
}

moro_vol.gat,113,81,3	script	�V���o���c�o���h���s�R	852,{
	switch(rand(5)) {
	case 0: unittalk "�����Ƃ̐퓬�ƃA�C���u���b�N�Ń}�X�N�Ȃ��Ōx��48���ԁc�c�ǂ����������ł����ˁH"; end;
	case 1: unittalk "�c�c�����܂��c�c�����ɍs���܂��B"; end;
	case 2: unittalk "����Ȃ��ƂȂ���������C����ςނׂ��������c�c�B"; end;
	case 3: unittalk "�c�c�܂���ꂻ���ł��c�c�ڂ��ɂ��āB"; end;
	case 4: unittalk "�c�c�͂����c�c�B"; end;
	}
}

moro_vol.gat,118,86,5	script	�w���W�k	931,{
	mes "[�w���W�k]";
	mes "�\�z�𗠐؂���ǂ��납";
	mes "�\�z�ȏ�ɑf���炵���I";
	mes "���̑̂Ɉ������ȋ�C�Ƃ�!";
	mes "�C���œ��肻���ȕ��͋C�Ƃ�!";
	mes "�Łc�c�H";
	mes "�̐S�̖����͂ǂ��ł��H";
	next;
	mes "[�w���W�k]";
	mes "�B�ꂽ���H�@�B�ꂽ�̂��H";
	mes "�q���n�n�n�n�n�n�I";
	close;
}

moro_vol.gat,116,84,7	script	�A���i�x���c���k�c	935,{
	switch(rand(5)) {
	case 0: unittalk "�����ɂ͎׈��Ȏ҂��Q�ꐬ���Ă��܂��ˁc�c�B"; end;
	case 1: unittalk "�c�c�B"; end;
	case 2: unittalk "�S�Ă͏��_�̌�S�̂܂܂Ɂc�c�B"; end;
	case 3: unittalk "�c�c�ْ[�̎҂Ƌ��ɂ���K�v������Ƃ́c�c�B"; end;
	case 4: unittalk "���Ȃ��ɏ��_�l�̂����삪����񂱂Ƃ��c�c�B"; end;
	}
}

moro_vol.gat,118,83,7	script	�A���i�x���c���k�c	917,{
	switch(rand(5)) {
	case 0: unittalk "�I���Ȃ��킢�قǋ��������̂͂���܂���c�c�B"; end;
	case 1: unittalk "�����̋�C�ɂ͓���߂����ɂ���܂���B"; end;
	case 2: unittalk "���_�l�A�ǂ�����X�ɂ�������c�c�B"; end;
	case 3: unittalk "�c�c�ْ[�̎҂ł���A�K�v�ł���΁c�c�B"; end;
	case 4: unittalk "���_�l�̂����삪�A���Ȃ��ƂƂ��ɂ���܂��悤�Ɂc�c�B"; end;
	}
}

moro_vol.gat,121,84,1	script	�A���i�x���c���k�c	920,{
	switch(rand(5)) {
	case 0: unittalk "�c�c���͋F�邱�Ƃ����o���܂���B"; end;
	case 1: unittalk "���_�l��������Ă��Ă����͂��c�c�B"; end;
	case 2: unittalk "�S�Ă͏��_�̌�S�̂܂܂Ɂc�c�B"; end;
	case 3: unittalk "�c�c�ْ[�҂ƍ��A�����Ă��鎞�ł͂������܂���c�c�B"; end;
	case 4: unittalk "�{���ɉ������邩�A�킩��Ȃ����̂ł��ˁc�c�B"; end;
	}
}

moro_vol.gat,119,106,3	script	�����W���P��#h_sol01	405,3,3,{
	mes "[�����W���P��]";
	mes "�A�b�V���o�L���[��������";
	mes "�\�����񂾂Ƃ��A";
	mes "�������̂悤�ȓ���";
	mes "����Ɨ\�z���Ă��܂����B";
	next;
	mes "[�����W���P��]";
	mes "�������o��͂��Ă��܂����B";
	mes "�~�b�h�K���h�嗤�̕��a�̂��߂ɁA";
	mes "���̌�����f���˂΁c�c�I";
	next;
	mes "[�����W���P��]";
	mes "�c�c��͂�|���ł��ˁB";
	mes "�ł������̕s����";
	mes "���m�������Ȃ��悤��";
	mes "����̓��������Ȃ����";
	mes "�Ȃ�Ȃ��̂ł����c�c�B";
	close;
OnTouch:
	if(!getnpctimer(1))
		initnpctimer;
	end;
OnTimer3000:
	unittalk "�W���P�� : ���N�I�@��琶�܂��������͈Ⴆ�ǁA��̎u�̂��ƁI�@�����ɏW�܂����I";
	end;
OnTimer6000:
	unittalk "�W���P�� : ���̎u�𖂑��ɂ��������悤���I";
	end;
OnTimer8000:
	unittalk "�W���P�� : �S�R�I�@�O�i����I";
	end;
OnTimer10000:
	donpcevent "�~�b�h�K���h�A���R#so01::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so05::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so09::OnTalk1";
	end;
OnTimer13000:
	donpcevent "�~�b�h�K���h�A���R#so02::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so06::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so10::OnTalk1";
	end;
OnTimer16000:
	donpcevent "�~�b�h�K���h�A���R#so03::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so07::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so11::OnTalk1";
	end;
OnTimer19000:
	donpcevent "�~�b�h�K���h�A���R#so04::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so08::OnTalk1";
	donpcevent "�~�b�h�K���h�A���R#so12::OnTalk1";
	end;
OnTimer22000:
	donpcevent "�~�b�h�K���h�A���R#so01::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so05::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so09::OnTalk2";
	end;
OnTimer25000:
	donpcevent "�~�b�h�K���h�A���R#so02::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so06::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so10::OnTalk2";
	end;
OnTimer28000:
	donpcevent "�~�b�h�K���h�A���R#so03::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so07::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so11::OnTalk2";
	end;
OnTimer31000:
	donpcevent "�~�b�h�K���h�A���R#so04::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so08::OnTalk2";
	donpcevent "�~�b�h�K���h�A���R#so12::OnTalk2";
	end;
OnTimer40000:
	stopnpctimer;
	end;
}

moro_vol.gat,117,104,1	script	�~�b�h�K���h�A���R#so01	707,{
	end;
OnTalk1:
	unittalk "���̑��z�̒��Ł`";
	end;
OnTalk2:
	unittalk "���a�ƍK�����`";
	end;
}

moro_vol.gat,117,102,1	script	�~�b�h�K���h�A���R#so02	707,{
	end;
OnTalk1:
	unittalk "��邽�߂Ɂ`";
	end;
OnTalk2:
	unittalk "�����̋��|��";
	end;
}

moro_vol.gat,117,100,1	script	�~�b�h�K���h�A���R#so03	707,{
	end;
OnTalk1:
	unittalk "����Ɂ`";
	end;
OnTalk2:
	unittalk "�����̋��|��";
	end;
}

moro_vol.gat,117,98,1	script	�~�b�h�K���h�A���R#so04	707,{
	end;
OnTalk1:
	unittalk "����グ�`";
	end;
OnTalk2:
	unittalk "�킠������!!";
	end;
}

moro_vol.gat,119,104,1	script	�~�b�h�K���h�A���R#so05	852,{
	end;
OnTalk1:
	unittalk "���Ɍ����`";
	end;
OnTalk2:
	unittalk "���т₩���`";
	end;
}

moro_vol.gat,119,102,1	script	�~�b�h�K���h�A���R#so06	852,{
	end;
OnTalk1:
	unittalk "���̏�����߂�`";
	end;
OnTalk2:
	unittalk "�����ƕ������߂Ɂ`";
	end;
}

moro_vol.gat,119,100,1	script	�~�b�h�K���h�A���R#so07	868,{
	end;
OnTalk1:
	unittalk "�\�������`";
	end;
OnTalk2:
	unittalk "�������߂Ɂ`";
	end;
}

moro_vol.gat,119,98,1	script	�~�b�h�K���h�A���R#so08	868,{
	end;
OnTalk1:
	unittalk "�ڂ��J���`";
	end;
OnTalk2:
	unittalk "�킠������!!";
	end;
}

moro_vol.gat,121,104,1	script	�~�b�h�K���h�A���R#so09	934,{
	end;
OnTalk1:
	unittalk "�̋����`";
	end;
OnTalk2:
	unittalk "������|�����߁`";
	end;
}

moro_vol.gat,121,102,1	script	�~�b�h�K���h�A���R#so10	934,{
	end;
OnTalk1:
	unittalk "�S���M���`";
	end;
OnTalk2:
	unittalk "�s�i���`";
	end;
}

moro_vol.gat,121,100,1	script	�~�b�h�K���h�A���R#so11	939,{
	end;
OnTalk1:
	unittalk "�i�ߑO�ց`";
	end;
OnTalk2:
	unittalk "�s�i���`�I";
	end;
}

moro_vol.gat,121,98,1	script	�~�b�h�K���h�A���R#so12	939,{
	end;
OnTalk1:
	unittalk "�܂������O�����ā`";
	end;
OnTalk2:
	unittalk "�킠������!!";
	end;
}

moro_vol.gat,105,97,3	script	�������A�T�V��#ass01	884,{
	mes "[�������A�T�V��]";
	mes "�c�c�Ԃ��Ȃ�";
	mes "�V�����C��������\�肾�c�c�B";
	mes "���̖ړI�͖�����";
	mes "���m�Ȉʒu������o�����Ɓc�c�B";
	next;
	mes "[�������A�T�V��]";
	mes "��s���Ă��钇�Ԃ̂��߂�";
	mes "�܂��͏��̐��������悤�B";
	next;
	mes "[�������A�T�V��]";
	mes "�c�c�c�B";
	mes "�����牓�������ƌ����Ă�";
	mes "�������𗧂Ă�̂�";
	mes "��낵���Ȃ��ȁB";
	close;
}

moro_vol.gat,103,96,5	script	�������A�T�V��#ass02	885,{
	mes "[�������A�T�V��]";
	mes "�c�c�����́c�c�������ȁc�c�B";
	mes "���̃��[�g�̒ǉ����悤�c�c�B";
	next;
	mes "[�������A�T�V��]";
	mes "�c�c�����c�c�B";
	mes "��c�����c�c��������B";
	close;
}

moro_vol.gat,105,95,1	script	�������A�T�V��#ass03	10002,{
	mes "[�������A�T�V��]";
	mes "�c�c�c�B";
	mes "�c�c�c���≴�͐V���肾����B";
	mes "��y�̘b�𕷂��Ă��邾������B";
	mes "�c�c�B";
	close;
}

moro_vol.gat,87,104,5	script	���w�҃R���p�[�i#143vol	446,{
	mes "[�R���p�[�i]";
	mes "�Ȃ�Ƃ��h�����Ƃ���";
	mes "�����܂ł͗��܂������ǁc�c";
	mes "�z���ȏ�ł��ˁI";
	mes "�΂����񂺂񖳂��Ȃ�āc�c�B";
	mes "�т�����ł���B";
	close;
}

moro_vol.gat,88,102,6	script	���w�҃}�L�A#143vol03	444,{
	mes "[�}�L�A]";
	mes "�n�߂Č��鐶�Ԍn�ł��ˁB";
	mes "�������M�����Ɍ����ĈӊO��";
	mes "�M�����Ȃ����c�c";
	mes "�s�v�c�������ς����ȁc�c�B";
	close;
}

moro_vol.gat,104,109,0	script	��m���t�B�l#sol01	447,{
	end;
OnTalk1:
	unittalk "����!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,106,109,0	script	��m���t�B�l#sol02	447,{
	end;
OnTalk1:
	unittalk "����!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,108,109,0	script	��m���t�B�l#sol03	447,{
	end;
OnTalk1:
	unittalk "����!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,104,107,0	script	��m���t�B�l#sol04	447,{
	end;
OnTalk1:
	unittalk "�ւ荂��!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,106,107,0	script	��m���t�B�l#sol05	447,{
	end;
OnTalk1:
	unittalk "�ւ荂��!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,108,107,0	script	��m���t�B�l#sol06	447,{
	end;
OnTalk1:
	unittalk "�ւ荂��!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,104,105,0	script	��m���t�B�l#sol07	447,{
	end;
OnTalk1:
	unittalk "���t�B�l��!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,106,105,0	script	��m���t�B�l#sol08	447,{
	end;
OnTalk1:
	unittalk "���t�B�l��!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,108,105,0	script	��m���t�B�l#sol09	447,{
	end;
OnTalk1:
	unittalk "���t�B�l��!!";
	end;
OnTalk2:
	unittalk "���f����!!";
	end;
}

moro_vol.gat,106,111,3	script	���w����#sol10	447,3,3,{
	mes "[���t�B�l�w����]";
	mes "�{�i�I�Ȑ퓬��O��";
	mes "�����𐮔����ł���B";
	mes "�ז��ɂȂ�̂ŗ�������悤�ɁB";
	close;
OnTouch:
	if(!getnpctimer(1))
		initnpctimer;
	end;
OnTimer3000:
	unittalk "�w���� : ���N�I�@���ɉ��̌P�����ʂ�������Ƃ����I";
	end;
OnTimer6000:
	unittalk "�w���� : ����!!";
	end;
OnTimer8000:
	donpcevent "��m���t�B�l#sol01::OnTalk1";
	donpcevent "��m���t�B�l#sol02::OnTalk1";
	donpcevent "��m���t�B�l#sol03::OnTalk1";
	end;
OnTimer9500:
	donpcevent "��m���t�B�l#sol04::OnTalk1";
	donpcevent "��m���t�B�l#sol05::OnTalk1";
	donpcevent "��m���t�B�l#sol06::OnTalk1";
	end;
OnTimer11000:
	donpcevent "��m���t�B�l#sol07::OnTalk1";
	donpcevent "��m���t�B�l#sol08::OnTalk1";
	donpcevent "��m���t�B�l#sol09::OnTalk1";
	end;
OnTimer14000:
	unittalk "�w���� : �������f����!!";
	end;
OnTimer16000:
	donpcevent "��m���t�B�l#sol01::OnTalk2";
	donpcevent "��m���t�B�l#sol02::OnTalk2";
	donpcevent "��m���t�B�l#sol03::OnTalk2";
	donpcevent "��m���t�B�l#sol04::OnTalk2";
	donpcevent "��m���t�B�l#sol05::OnTalk2";
	donpcevent "��m���t�B�l#sol06::OnTalk2";
	donpcevent "��m���t�B�l#sol07::OnTalk2";
	donpcevent "��m���t�B�l#sol08::OnTalk2";
	donpcevent "��m���t�B�l#sol09::OnTalk2";
	end;
OnTimer30000:
	stopnpctimer;
	end;
}

moro_vol.gat,101,102,0	script	���t�B�l�����t#wsol01	611,{
	switch(rand(5)) {
	case 0: unittalk "���җl�����Ă���������񂾂�c�c����΂�c�c�B"; end;
	case 1: unittalk "�c�c�G�ɁA���߂͖��p�c�c�B"; end;
	case 2: unittalk "�c�c�G�N���[�W�����������B"; end;
	case 3: unittalk "�c�c�S�����点�Ă��c�c���点�Ă��c�c�B"; end;
	case 4: unittalk "�͂��c�c�͂��c�c�B"; end;
	}
}

moro_vol.gat,103,102,0	script	���t�B�l�����t#wsol02	520,{
	switch(rand(5)) {
	case 0: unittalk "����̂������A�ӂ�ӂӁ[���"; end;
	case 1: unittalk "�c�c����A���@���ǂ��ɒu�������ȁB"; end;
	case 2: unittalk "�����c�c�Â��Ɂc�c�W���͂��r�؂��B"; end;
	case 3: unittalk "�c�c������������āA�������āc�c�B"; end;
	case 4: unittalk "�c�c���Ȃ��A�؂����؂����킠�B"; end;
	}
}

moro_vol.gat,105,102,0	script	���t�B�l�����t#wsol03	446,{
	switch(rand(5)) {
	case 0: unittalk "�c�c���B�͂��܂őҋ@�Ȃ񂾁c�c�B"; end;
	case 1: unittalk "�c�Ȃ�ŉ��͂����ɗ����񂾁c�c���̃��C�Ŗ��肽���c�c�B"; end;
	case 2: unittalk "�c�c�n�@�c�c�B"; end;
	case 3: unittalk "�c�c�����I�@�H�����������c�c�B"; end;
	case 4: unittalk "�w�����̐l�ԁc�c�C�ɐG��c�c�B"; end;
	}
}

moro_vol.gat,107,102,0	script	���t�B�l�����t#wsol04	440,{
	switch(rand(5)) {
	case 0: unittalk "�ꉞ�A�n�[�u�������Ă������ȁB"; end;
	case 1: unittalk "���܂������̂��Ȃ��A�����S�z����B"; end;
	case 2: unittalk "�c�c�ْ�����ȁc�c�B"; end;
	case 3: unittalk "�c�c�G����������c�c�t�@�C�A�c�c�B"; end;
	case 4: unittalk "�T�t�@���͓G����Ȃ��c�c�T�t�@���͓G����Ȃ��c�c�������I�@�����Ă�肽���I"; end;
	}
}

moro_vol.gat,109,102,0	script	���t�B�l�����t#wsol05	446,{
	switch(rand(5)) {
	case 0: unittalk "�c�c�ْ�����ȁc�c�B"; end;
	case 1: unittalk "����ȋْ����c�c�����Ȃ��ȁc�c�ӂӂӁc�c�B"; end;
	case 2: unittalk "�c�c�G����������c�c�����ƃ_�u���t�@�C�A�c�c�B"; end;
	case 3: unittalk "�c�c�΁A���͋��Ȃ񂾂��ǂȁB"; end;
	case 4: unittalk "�Â��́A�����Ƌ��Ȃ񂾂��ǂȁB"; end;
	}
}

//============================================================
// ����
//------------------------------------------------------------
moro_vol.gat,86,167,7	script	�O����n�E����#1	415,3,3,{
	mes "[�O����n�E����]";
	set '@type,strnpcinfo(2);
	switch('@type%10) {
	case 0:
		mes "�|���Ă��|���Ă����肪�Ȃ��ł��ˁB";
		break;
	case 1:
		mes "�����͊댯�ł��B��n�ɖ߂��ĉ������I";
		break;
	case 2:
		mes "��n�̒��ɂ͐�΂�";
		mes "����܂���B";
		break;
	case 3:
		mes "�����A���܂ł��̎d����";
		mes "���΂��񂾂낤�c�c�B";
		break;
	case 4:
		mes "�S�z���Ȃ��ŉ������B";
		mes "�����͎������܂����܂��B";
		break;
	case 5:
		mes "���͂��܂�b���ł���";
		mes "�]�T������܂���B";
		break;
	case 6:
		mes "�ނ��ĉ������B";
		mes "���E��h���ł��܂��B";
		break;
	case 7:
		mes "�G�k����]�T������Ȃ�A";
		mes "�����ł������̓G��";
		mes "�|������ǂ��ł����H";
		break;
	case 8:
		mes "�����c�c���񂾂񊦂��Ȃ��Ă������A";
		mes "�������󂢂Ă����Ȃ��B";
		mes "���I�@����͓Ƃ茾�ł��B";
		break;
	case 9:
		mes "�����͖{���ɖ����������ł��B";
		mes "�����ł��C�𔲂���";
		mes "�����ڂɑ��������ł��B";
		break;
	}
	close;
OnTouch:
	end;
OnTouchNPC:
	switch(rand(4)) {
	case 0: unittalk "�O����n�E���� : �����܂ł��I�@���������ɂ͍s�����Ȃ��I"; break;
	case 1: unittalk "�O����n�E���� : ��n�ɂ͈�������ꂳ���Ȃ����I"; break;
	case 2: unittalk "�O����n�E���� : �������痣���I�@���������͉�X�̗̈悾�I"; break;
	case 3: unittalk "�O����n�E���� : �����߁I�@�Ȃ̂���ׂ��ꏊ�֊҂�I�@�������͐키���I"; break;
	}
	switch(rand(4)) {
	case 0:
		misceffect 12;
		set '@dummy,sleep2(1000);
		misceffect 90;
		break;
	case 1:
		misceffect 12;
		set '@dummy,sleep2(1000);
		misceffect 89;
		break;
	case 2:
		misceffect 12;
		set '@dummy,sleep2(1000);
		misceffect 40;
		break;
	case 3:
		misceffect 12;
		set '@dummy,sleep2(1000);
		misceffect 183;
		break;
	}
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,93,166,7	duplicate(�O����n�E����#1)	�O����n�E����#2	414,3,3
moro_vol.gat,100,165,7	duplicate(�O����n�E����#1)	�O����n�E����#3	413,3,3
moro_vol.gat,107,164,7	duplicate(�O����n�E����#1)	�O����n�E����#4	419,3,3
moro_vol.gat,114,162,7	duplicate(�O����n�E����#1)	�O����n�E����#5	420,3,3
moro_vol.gat,121,160,7	duplicate(�O����n�E����#1)	�O����n�E����#6	418,3,3
moro_vol.gat,128,158,7	duplicate(�O����n�E����#1)	�O����n�E����#7	415,3,3
moro_vol.gat,135,155,7	duplicate(�O����n�E����#1)	�O����n�E����#8	414,3,3
moro_vol.gat,142,152,7	duplicate(�O����n�E����#1)	�O����n�E����#9	413,3,3
moro_vol.gat,149,148,7	duplicate(�O����n�E����#1)	�O����n�E����#10	419,3,3
moro_vol.gat,156,144,7	duplicate(�O����n�E����#1)	�O����n�E����#11	420,3,3
moro_vol.gat,162,137,6	duplicate(�O����n�E����#1)	�O����n�E����#12	418,3,3
moro_vol.gat,168,130,6	duplicate(�O����n�E����#1)	�O����n�E����#13	415,3,3
moro_vol.gat,174,123,6	duplicate(�O����n�E����#1)	�O����n�E����#14	414,3,3
moro_vol.gat,178,116,6	duplicate(�O����n�E����#1)	�O����n�E����#15	413,3,3
moro_vol.gat,182,109,6	duplicate(�O����n�E����#1)	�O����n�E����#16	419,3,3
moro_vol.gat,185,102,6	duplicate(�O����n�E����#1)	�O����n�E����#17	420,3,3
moro_vol.gat,187,95,6	duplicate(�O����n�E����#1)	�O����n�E����#18	418,3,3
moro_vol.gat,189,88,6	duplicate(�O����n�E����#1)	�O����n�E����#19	415,3,3
moro_vol.gat,191,81,6	duplicate(�O����n�E����#1)	�O����n�E����#20	414,3,3

moro_vol.gat,114,128,1	script	�R���`�l���^���K�[�h::morovol_con01	997,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�ُ킠��܂���B"; end;
	case 1: unittalk "���C�����āB"; end;
	case 2: unittalk "�����͊댯�ł��B�������肭�������B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����͒ʂ���!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,119,130,1	script	�R���`�l���^���K�[�h::morovol_con02	998,{
	switch(rand(3)) {
	case 0: unittalk "�͂��A���̂Ƃ���ُ�͂���܂���B"; end;
	case 1: unittalk "���C�������������B"; end;
	case 2: unittalk "���܂肱���ɒ����͕s�v���Ɓc�c�댯�ł�����B"; end;
	}
}

moro_vol.gat,122,130,7	script	�R���`�l���^���K�[�h::morovol_con03	997,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�댯�ȏꏊ�ł��B���܂�O�ɏo�Ȃ��ł��������B"; end;
	case 1: unittalk "���C�����āB"; end;
	case 2: unittalk "�ُ킠��܂���B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����͒ʂ���!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,125,129,7	script	�R���`�l���^���K�[�h::morovol_con04	997,{
	switch(rand(3)) {
	case 0: unittalk "���������Ă���ł͒x���̂ŁA�������Ă��������B"; end;
	case 1: unittalk "�ǂ������C�����āB"; end;
	case 2: unittalk "�ُ�c�c����܂���B"; end;
	}
}

moro_vol.gat,127,127,7	script	�R���`�l���^���K�[�h::morovol_con05	998,{
	switch(rand(3)) {
	case 0: unittalk "�댯�ȏꏊ�ł�����A�C�𔲂��Ȃ��悤�ɂ��Ă��������B"; end;
	case 1: unittalk "���̏ꏊ�͓��Ɋ댯�ł��B�P�ƍs���͂Ȃ�ׂ����T����������"; end;
	case 2: unittalk "�ُ�Ȃ��B"; end;
	}
}

moro_vol.gat,135,123,1	script	�~�b�h�K���h�A���R::morovol_mid01	753,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�c�c�A���i�x���c�̘A���͑O�ɏo�Ȃ��̂��H"; end;
	case 1: unittalk "�ǂ�ȓz���낤�Ɠ|���Ă��I"; end;
	case 2: unittalk "�R���`�l���^���K�[�h���ċ����ȁB"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "������!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,139,124,1	script	�~�b�h�K���h�A���R::morovol_mid02	745,{
	switch(rand(3)) {
	case 0: unittalk "�c�c�t���B"; end;
	case 1: unittalk "���肪�����ȁc�c�B"; end;
	case 2: unittalk "�c�c���C�����āB"; end;
	}
}

moro_vol.gat,143,124,1	script	�~�b�h�K���h�A���R::morovol_mid03	735,{
	switch(rand(3)) {
	case 0: unittalk "�ӂ��c�c�B"; end;
	case 1: unittalk "�c�c���ҒB�̂������Ő킢�₷���ȁB"; end;
	case 2: unittalk "�c�c�������Ă��Ȃ����B"; end;
	}
}

moro_vol.gat,147,124,7	script	�~�b�h�K���h�A���R::morovol_mid04	707,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�ǂ�ȑ��肾�낤�ƁA�����܂����B"; end;
	case 1: unittalk "�c�c���A���̐킢�͏I���̂��낤���B"; end;
	case 2: unittalk "�̒��Ƃ��ɁA���܂̂Ƃ���A�ُ����肠��܂���B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G�P!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,150,121,7	script	�~�b�h�K���h�A���R::morovol_mid05	707,{
	switch(rand(3)) {
	case 0: unittalk "�Ȃ�ł����O�q�ɔz�u�����񂾂낤�c�c�B"; end;
	case 1: unittalk "�c�c���c�c����ȁI�@���āA�l���������B"; end;
	case 2: unittalk "�c�c���c�c���͂����c�c�H"; end;
	}
}

moro_vol.gat,151,119,7	script	�~�b�h�K���h�A���R::morovol_mid06	852,{
	switch(rand(3)) {
	case 0: unittalk "�����̒��ɂ͌�ォ�c�c�B"; end;
	case 1: unittalk "�c�c�����ƁA��������O�ɂ͏o�Ȃ����������B"; end;
	case 2: unittalk "�c�c�ǂ��ɂ��Ă������W���c�c�B"; end;
	}
}

moro_vol.gat,153,116,7	script	�~�b�h�K���h�A���R::morovol_mid07	852,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�����Ȃ��̂͗ǂ����A���_�I�ɔ���c�c�B"; end;
	case 1: unittalk "�c�c�����N�ʎ��������݂����B"; end;
	case 2: unittalk "���������ǂ����畦���Ă���̂��c�c�B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "��������!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,118,115,1	script	�~�b�h�K���h�A���R::morovol_mid08	735,3,3,{
	switch(rand(3)) {
	case 0: unittalk "���ْ̈[���Ęb���܂ő�����񂾁c�c�B"; end;
	case 1: unittalk "�c�c����H�@���ԗ�ԈႦ�����H"; end;
	case 2: unittalk "�c�c�Ȃ�ł���ȂƂ���Ɂc�c�B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�������ɍs��!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,121,115,1	script	�~�b�h�K���h�A���R::morovol_mid09	852,{
	switch(rand(3)) {
	case 0: unittalk "�c�c�O�q�͔��Ɋ댯�ł��B"; end;
	case 1: unittalk "�c�c���������邳���ȁB"; end;
	case 2: unittalk "�c�c�ӂ��c�c�����A�A���Ȃ�A�肽���ł��B"; end;
	}
}

moro_vol.gat,124,116,1	script	�~�b�h�K���h�A���R::morovol_mid10	852,3,3,{
	switch(rand(3)) {
	case 0: unittalk "���݂��A�C�����܂��傤�B"; end;
	case 1: unittalk "�ُ킠��܂���B"; end;
	case 2: unittalk "�c�c�����͎�蔲���܂��B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����߁I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,128,116,1	script	�~�b�h�K���h�A���R::morovol_mid11	852,{
	switch(rand(3)) {
	case 0: unittalk "�c�c�ւ��A�ُ�Ȃ������B"; end;
	case 1: unittalk "�c�c�ُ킠��₹��c�cZZz�c�c�B"; end;
	case 2: unittalk "�c�c�ˁc�c�Q�Ă₹��c�c�I"; end;
	}
}

moro_vol.gat,131,115,7	script	�~�b�h�K���h�A���R::morovol_mid12	934,{
	switch(rand(3)) {
	case 0: unittalk "�ْ[�ҋ��ƈꏏ�ɂȂ�Ƃ́c�c�B"; end;
	case 1: unittalk "�d�����Ȃ��Ƃ͂����A��͂�C���͗ǂ��Ȃ��ł��B"; end;
	case 2: unittalk "���_��A��������c�c�B"; end;
	}
}

moro_vol.gat,133,113,7	script	�~�b�h�K���h�A���R::morovol_mid13	939,{
	switch(rand(3)) {
	case 0: unittalk "���������A���܂肤����Ɗ댯���B"; end;
	case 1: unittalk "��ꂽ�ȁc�c�B"; end;
	case 2: unittalk "�c�c���͂����H"; end;
	}
}

moro_vol.gat,136,111,7	script	�~�b�h�K���h�A���R::morovol_mid14	934,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�h�q���ɂُ͈킠��܂���B"; end;
	case 1: unittalk "���C�����āB"; end;
	case 2: unittalk "�������肭�������B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G�P�I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,138,108,7	script	�~�b�h�K���h�A���R::morovol_mid15	939,{
	switch(rand(3)) {
	case 0: unittalk "���Ɉُ�͂���܂���B"; end;
	case 1: unittalk "�O���Ď����I�@�ُ�ȁ`���I"; end;
	case 2: unittalk "�c�c���_�l�̂����삪����܂��悤�Ɂc�c�B"; end;
	}
}

moro_vol.gat,93,128,1	script	��m���t�B�l#line01	461,3,3,{
	switch(rand(4)) {
	case 0: unittalk "�C�����Ă��������I"; end;
	case 1: unittalk "�댯�Ȃ̂Ō��ɉ������Ă��������I"; end;
	case 2: unittalk "�ُ�Ȃ��I"; end;
	case 3: unittalk "�͂��`�͂��`�B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G����!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,96,130,1	script	��m���t�B�l#line02	461,{
	switch(rand(4)) {
	case 0: unittalk "�댯�ȂقǂɔR���������I"; end;
	case 1: unittalk "�������A�������I"; end;
	case 2: unittalk "�ُ�́c�c����܂�������I"; end;
	case 3: unittalk "�C�����\�������I"; end;
	}
}

moro_vol.gat,99,131,1	script	��m���t�B�l#line03	461,3,3,{
	switch(rand(4)) {
	case 0: unittalk "���C������΁A���͂񂪂��܂��B"; end;
	case 1: unittalk "�c�c�o�Ԃ��������!?"; end;
	case 2: unittalk "�ُ�c�c�Ȃ��c�c�����B"; end;
	case 3: unittalk "�ӂ����c�c�B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "���c�c�����!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,102,132,7	script	��m���t�B�l#line04	447,{
	switch(rand(4)) {
	case 0: unittalk "����̎��������S�ł��B"; end;
	case 1: unittalk "��Ȃ��̂ŁA�����͂��C�����������I"; end;
	case 2: unittalk "�ُ�͂���܂���B"; end;
	case 3: unittalk "����J�l�ł��B"; end;
	}
}

moro_vol.gat,105,132,7	script	��m���t�B�l#line05	462,3,3,{
	switch(rand(4)) {
	case 0: unittalk "�ǂ����������肭�������B"; end;
	case 1: unittalk "�ْ����܂��c�c�B"; end;
	case 2: unittalk "���݂��A�C�����܂��傤�B"; end;
	case 3: unittalk "����J�l�ł��B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����͒ʂ��Ȃ��I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,108,131,7	script	��m���t�B�l#line06	461,{
	switch(rand(4)) {
	case 0: unittalk "�������Ă����ł�����A�C�����Ă��������B"; end;
	case 1: unittalk "�Ӂ[�ށc�c�B"; end;
	case 2: unittalk "�����͊댯�ł���I"; end;
	case 3: unittalk "���P��������񂾂낤���c�c�B"; end;
	}
}

moro_vol.gat,111,129,7	script	��m���t�B�l#line07	447,3,3,{
	switch(rand(4)) {
	case 0: unittalk "�ُ�͂���܂���!!"; end;
	case 1: unittalk "�ǂ����A�����͔C���Ă��������I"; end;
	case 2: unittalk "�c�c�F�A�̂񂫂��ȁB"; end;
	case 3: unittalk "�����[��c�c�B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G��!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,85,117,1	script	��m���t�B�l#line11	462,3,3,{
	switch(rand(4)) {
	case 0: unittalk "���f�͋֕��ł����I"; end;
	case 1: unittalk "�O�q�ɔ�ׂ�΃}�V�Ȃ�ł��傤���ǁc�c�B"; end;
	case 2: unittalk "���E���̉��삪����܂���[�Ɂc�c�B"; end;
	case 3: unittalk "���A�ُ킠��܂��c�c!!�@�Ђ��A���񂶂Ⴂ�܂Ђ��c�c�B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����܂ŗ���Ȃ�āI";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,89,118,1	script	��m���t�B�l#line12	447,{
	switch(rand(4)) {
	case 0: unittalk "�������Ⴞ�߂����I�@��������`�c�c�I"; end;
	case 1: unittalk "�G������������A���������āc�c�B"; end;
	case 2: unittalk "�O�̕��͑��v�ł����ˁc�c�B"; end;
	case 3: unittalk "�ُ�c�c���E��E�܁E����I"; end;
	}
}

moro_vol.gat,92,119,7	script	��m���t�B�l#line13	447,3,3,{
	switch(rand(4)) {
	case 0: unittalk "���ׂȂ��Ƃł��A�����ӂ��������I"; end;
	case 1: unittalk "�K���A��萋���܂��I"; end;
	case 2: unittalk "�O���̊F���S�z�ł��c�c���v�ł��傤���ǁB"; end;
	case 3: unittalk "�ُ�A���̂Ƃ��날��܂���I"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G�P����!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,96,119,7	script	��m���t�B�l#line14	461,{
	switch(rand(4)) {
	case 0: unittalk "�ْ������ێ�����̂́A��ςł��c�c�B"; end;
	case 1: unittalk "�݂�Ȗ����ɋA�ꂽ��ǂ��ȁc�c�B"; end;
	case 2: unittalk "�����C�Â����瑦�A���A�����܂��ˁB"; end;
	case 3: unittalk "�ُ�́A����܂���B"; end;
	}
}

moro_vol.gat,100,117,7	script	��m���t�B�l#line15	447,3,3,{
	switch(rand(4)) {
	case 0: unittalk "�O�q�̓����������Ȃ��̂��h���ł��ˁc�c�B"; end;
	case 1: unittalk "�G�̓������C�ɂȂ�܂��ˁc�c�B"; end;
	case 2: unittalk "�������N���邩�c�c�B"; end;
	case 3: unittalk "�ُ�͍��̂Ƃ��날��܂���B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�|���Ă��!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,103,118,1	script	��m���t�B�l#line16	462,{
	switch(rand(4)) {
	case 0: unittalk "�O���ɗF�l������̂ŁA�O�����C�ɂȂ�܂��B"; end;
	case 1: unittalk "�Ƃ肠�������̂Ƃ���A��������܂���B"; end;
	case 2: unittalk "���f���Ȃ��ōs���܂��傤�A�G�w�ł����B"; end;
	case 3: unittalk "�ُ�Ȃ����I"; end;
	}
}

moro_vol.gat,107,118,7	script	��m���t�B�l#line17	462,3,3,{
	switch(rand(4)) {
	case 0: unittalk "���G�P�����Ă������悤�ɁA�X�}�C���̗��K��"; end;
	case 1: unittalk "�͂Ӂ`�c�c�B"; end;
	case 2: unittalk "���f��G�I�@����c�c�H�@���f�G�΂ł��������H"; end;
	case 3: unittalk "�ُ�A����܂����"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����܁`������";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,110,117,7	script	��m���t�B�l#line18	461,{
	switch(rand(4)) {
	case 0: unittalk "�؂̋�����œn�邭�炢�A�T�d�ɍs���˂΁c�c�B"; end;
	case 1: unittalk "�����Ȃ��O�̃����o�[�ɂ����ӂ��Ă������B"; end;
	case 2: unittalk "�ǂ��ɓG������ł��邩������Ȃ����ȁc�c�B"; end;
	case 3: unittalk "�A���ł����Ԃ����A�T�t�@�������؂�Ȃ��ۏ؂��Ȃ��c�c�B"; end;
	}
}

moro_vol.gat,114,114,7	script	��m���t�B�l#line19	461,3,3,{
	switch(rand(4)) {
	case 0: unittalk "�T�t�@���̂��ƈꏏ���ƁA�����s�������c�c�B"; end;
	case 1: unittalk "���ӂ�ӂ�Ȃ��悤�ɂ���΂�����I"; end;
	case 2: unittalk "���v�����A���Ȃ������B"; end;
	case 3: unittalk "�ُ�A�Ȃ������I"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G�����I�@�G������[�I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,139,104,1	script	�}�k�N����#line01	492,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�ӂށI"; end;
	case 1: unittalk "�ُ�Ȃ��B"; end;
	case 2: unittalk "������I�@�l�ԁI"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����������I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,143,106,1	script	�}�k�N����#line02	492,3,3,{
	switch(rand(3)) {
	case 0: unittalk "���l�̖ڂ����������́A����������I"; end;
	case 1: unittalk "���ށI�@��������D�����I"; end;
	case 2: unittalk "������񂾂ȁI�@�l�ԁI"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G���I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,147,108,1	script	�}�k�N����#line03	492,{
	switch(rand(3)) {
	case 0: unittalk "�c�c�ӂ�B"; end;
	case 1: unittalk "�ُ�͂Ȃ��B"; end;
	case 2: unittalk "�ǂ����Œ��̉H������������ȁI�@���`��ƂȁI"; end;
	}
}

moro_vol.gat,152,109,1	script	�}�k�N����#line04	492,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�ُ�Ȃ��B"; end;
	case 1: unittalk "�����͖��Ȃ����I"; end;
	case 2: unittalk "�������Ă���I�@�l�ԁI"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�ʂ���!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,156,110,1	script	�}�k�N����#line05	492,{
	switch(rand(3)) {
	case 0: unittalk "�c�c�Ȃ����t�B�l���Ȃ񂩂Ɓc�c�B"; end;
	case 1: unittalk "�c�c�H�����Ƃ͈Ⴄ�̂��A�H�����Ƃ́B"; end;
	case 2: unittalk "���O�͉H���Ȃ��̂悤���ȁB"; end;
	}
}

moro_vol.gat,160,110,7	script	�}�k�N����#line06	492,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�ُ�ȁ[���I"; end;
	case 1: unittalk "���ʂ��ʁI"; end;
	case 2: unittalk "�����ɂ���Ǝז����I�@�l�ԁI"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�΂킹��ȁI";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,164,109,7	script	�}�k�N����#line07	492,{
	switch(rand(3)) {
	case 0: unittalk "���������������I"; end;
	case 1: unittalk "�ُ�H�@�Ȃ����B"; end;
	case 2: unittalk "���t�B�l���Ȃ񂼂ɕ����ʁB"; end;
	}
}

moro_vol.gat,167,107,7	script	�}�k�N����#line08	492,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�ӂ���I�@�ӂ���I�@�Ӂ[����I"; end;
	case 1: unittalk "��邱�Ƃ��Ȃ����́A�b�B�Ɍ���̂��I"; end;
	case 2: unittalk "�ӂ�A�킵�̋����ȓ��̂ɕ|�C�Â������B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G���I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,169,104,7	script	�}�k�N����#line09	492,{
	switch(rand(3)) {
	case 0: unittalk "�����ށA�莝�����������B"; end;
	case 1: unittalk "�c�c�Ȃɂ��a����̂�����B"; end;
	case 2: unittalk "�����U��񂷂Ɠ{���邾�낤���ȁc�c�B"; end;
	}
}

moro_vol.gat,171,100,5	script	�}�k�N����#line10	492,3,3,{
	switch(rand(3)) {
	case 0: unittalk "���������āA���͊�p�Ȃ̂����B"; end;
	case 1: unittalk "�������������킶��Ȃ��B�������Y�ꂸ�ɂȁB"; end;
	case 2: unittalk "����ȂЎ�ȑ̂ŁA�悭��������̂��B"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�Ȃ߂�񂶂�ˁ[��!!";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,172,95,5	script	�}�k�N����#line11	492,{
	switch(rand(3)) {
	case 0: unittalk "�������n�Y���̂悤���ȁB"; end;
	case 1: unittalk "���������x��킢�͂��n�܂�񂾁c�c�B"; end;
	case 2: unittalk "�E���ȃK���g���͑ނ��͂��Ȃ��I"; end;
	}
}

moro_vol.gat,173,89,5	script	�}�k�N����#line12	492,3,3,{
	switch(rand(3)) {
	case 0: unittalk "�̂��݂�ȁc�c�B"; end;
	case 1: unittalk "���ł����݂����C�������c�c�B"; end;
	case 2: unittalk "���̂悤�ȋ@��A�ő��ɂȂ�����ȁI"; end;
	}
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����[���I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,100,183,1	script	���Ԓn �ԑ�#bl0	417,3,3,{
	mes "[���Ԓn �ԑ�]";
	mes "�����͊댯�n��ł��B";
	mes "����ɕ�������Ă�";
	mes "����܂��B";
	close;
OnTouch:
	end;
OnTouchNPC:
	unittalk "�������֍s���I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,102,188,1	script	���Ԓn �ԑ�#bl1	417,3,3,{
	mes "[���Ԓn �ԑ�]";
	mes "�����͊댯�n��ł��B";
	mes "����ɕ�������Ă�";
	mes "����܂��B";
	close;
OnTouch:
	end;
OnTouchNPC:
	unittalk "�G�P���I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,104,193,1	script	���Ԓn �ԑ�#bl2	417,3,3,{
	mes "[���Ԓn �ԑ�]";
	mes "�����͊댯�n��ł��B";
	mes "����ɕ�������Ă�";
	mes "����܂��B";
	close;
OnTouch:
	end;
OnTouchNPC:
	unittalk "���炦�I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,95,182,1	script	���Ԓn �ԑ�#bl3	417,3,3,{
	mes "[���Ԓn �ԑ�]";
	mes "�����͊댯�n��ł��B";
	mes "����ɕ�������Ă�";
	mes "����܂��B";
	close;
OnTouch:
	end;
OnTouchNPC:
	unittalk "�����ǂ��߁I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

moro_vol.gat,90,181,7	script	���Ԓn �ԑ�#bl4	417,3,3,{
	mes "[���Ԓn �ԑ�]";
	mes "�����͊댯�n��ł��B";
	mes "����ɕ�������Ă�";
	mes "����܂��B";
	close;
OnTouch:
	end;
OnTouchNPC:
	unittalk "�ʂ��񂼁I";
	misceffect 92;
	set '@dummy,sleep2(2000);
	warp "Random",0,0;
	end;
}

//============================================================
// �t���C�����@���[�ւ̓��N�G�X�g
//- Registry -------------------------------------------------
// FVOL_1QUE -> 0�`18�A100
//------------------------------------------------------------
morocc.gat,138,238,4	script	�|��Ă���j��#ep14bs	849,{
	switch(FVOL_1QUE) {
	case 0:
		mes "�]�l���|��Ă���B�s���|�ꂾ�낤���]";
		next;
		if(BaseLevel < 140) {
			mes "�]^0000FF�t���C�����@���[�ւ̓�^000000��";
			mes "�@^FF0000BaseLv140�ȏ�^000000����";
			mes "�@�J�n���邱�Ƃ��ł���N�G�X�g�ł��]";
			close;
		}
		if(select("����������","���̂܂܂ɂ���") == 2) {
			mes "�]���̂܂ܒʂ�߂����]";
			close;
		}
		mes "[�H�H�H]";
		mes "�����c�c�B";
		next;
		mes "�]����������Ɣ������������B";
		mes "�@�ӎ��͂���悤���]";
		next;
		if(select("�h�炵�Ă݂�","���̂܂܂ɂ��Ă���") == 2) {
			mes "�]���Ȃ��͂��̏�𗧂��������]";
			close;
		}
		mes "[�H�H�H]";
		mes "���c�c���c�c";
		mes "���c�c�H�ו����c�c";
		mes "^0000FF�������̃G�T^000000�ł������̂Łc�c";
		mes "�����H�ו����c�c�B";
		next;
		mes "�]�͐s�����̂��C�₵�Ă��܂����B";
		mes "�@^0000FF�������̃G�T^000000����ɓ����";
		mes "�@�H�ׂ����Ă݂悤�]";
		set FVOL_1QUE,1;
		setquest 11349;
		close;
	case 1:
		if(countitem(528) < 1) {
			mes "�]�͐s�����̂��C�₵�Ă��܂����B";
			mes "�@^0000FF�������̃G�T^000000����ɓ����";
			mes "�@�H�ׂ����Ă݂悤�]";
			close;
		}
		mes "[�H�H�H]";
		mes "�����c�c�B";
		next;
		if(select("�������̃G�T��^����","���̂܂܂ɂ��Ă���") == 2) {
			mes "[�H�H�H]";
			mes "�����c�c�����āc�c�B";
			close;
		}
		cutin "ep143_tadir",2;
		mes "[�H�H�H]";
		mes "�������c�c";
		mes "�s�����I";
		delitem 528,1;
		set FVOL_1QUE,2;
		chgquest 11349,11350;
		next;
		mes "[�H�H�H]";
		mes "���O���O�c�c�B";
		mes "�s�����悤�c�c�B";
		mes "���O���O�c�c�B";
		next;
		mes "[�H�H�H]";
		mes "�c�c�ӂ��c�c�B";
		next;
	case 2:
		cutin "ep143_tadir",2;
		mes "[�H�H�H]";
		mes "�����Ձc�c";
		mes "�c�c���A���肪�Ƃ��������܂��B";
		mes "�������l�ł��Ȃ�ǂ��Ȃ�܂����B";
		mes "���������c�c�B";
		next;
		mes "[�H�H�H]";
		mes "�ŋߖ{���ɕs�^�����ŁA";
		mes "���͂ǂ����Ă���Ȃ�";
		mes "�^�������̂��ƒQ���Ă����Ƃ���ł��B";
		next;
		mes "[�H�H�H]";
		mes "���̂܂܎��ʂ̂��Ǝv���܂������A";
		mes "�K�^�̏��_�͂܂�����";
		mes "���̂ĂĂ��Ȃ������悤�ł��B";
		next;
		mes "[�H�H�H]";
		mes "�n�ʂɂł��Ă����Ђтɗ�����";
		mes "�F�B�Ɨ��ꗣ��ɂȂ����������A";
		mes "���̂Ђт𔲂������";
		mes "��������悤��";
		mes "�s�v�c�ȏꏊ��������ł��B";
		next;
		mes "[�H�H�H]";
		mes "�{���Ɂc�c�B���������";
		mes "�l������ꏊ�ɖ߂��ė��ꂽ�����ł�";
		mes "��Ղƌ��������c�c�B";
		next;
		mes "[�H�H�H]";
		mes "�^���ǂ������ł���B";
		mes "���ȂȂ������񂾂���B";
		mes "�͂͂́c�c�B";
		next;
		mes "[�H�H�H]";
		mes "���������΂���������";
		mes "�����̘b�΂���ŁA";
		mes "�����Ƃ��������";
		mes "�܂����Ă��Ȃ������ł��ˁB";
		next;
		mes "[�H�H�H]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�������Ŏ��Ȃ��ɂ��݂܂����B";
		mes "�����������������̃G�T��";
		mes "���ʂقǕs���������ł����B";
		next;
		mes "[�H�H�H]";
		mes "����ȕ��ɓ��[�Ŏ��ʂ̂��Ȃ�";
		mes "�v���Ă����̂ɁA�܂��܂����E��";
		mes "�̂Ă����񂶂�Ȃ��Ǝv���܂����B";
		mes "�{���Ɋ����I�ł��B";
		next;
		mes "[�^�}����]";
		mes "���̖��O��^0000FF�^�}����^000000�ƌ����܂��B";
		mes "�����̒ʂ�`���Ɓc�c";
		mes "���͂���Ȏp�ł����`���Ƃł��B";
		next;
		menu "���ȏЉ���s��",-;
		mes "[�^�}����]";
		mes strcharinfo(0)+ "�l�ł����B";
		mes "�f�G�Ȗ��O�ł��ˁB";
		next;
	case 3:
		if(FVOL_1QUE != 3) {
			mes "[�^�}����]";
			mes "���I";
			mes "����ȉ��ꂽ�p�̂܂�";
			mes "���b������̂�����ł��ˁB";
			next;
			mes "[�^�}����]";
			mes "���݂܂���A���̋߂���";
			mes "�̂�􂦂����ȏꏊ�͂���܂��񂩁H";
		}
		else {
			cutin "ep143_tadir",2;
			mes "[�^�}����]";
			mes "��͂肱��ȉ��ꂽ�p��";
			mes "���̉��l�Ƃ��b������̂�";
			mes "�S�ꂵ���ł��c�c�B";
			next;
			mes "[�^�}����]";
			mes "���̋߂���";
			mes "�̂�􂦂����ȏꏊ�͂���܂��񂩁H";
		}
		next;
		if(select("�ꏊ��������","�m��Ȃ��ƌ���") == 2) {
			mes "[�^�}����]";
			mes "��͂�A�����s�s�Ȃ̂�";
			mes "�����M�d�Ȃ̂ł��傤���H";
			set FVOL_1QUE,3;
			close2;
			cutin "ep143_tadir",255;
			end;
		}
	case 4:
		cutin "ep143_tadir",2;
		mes "[�^�}����]";
		mes "�����I";
		mes "^0000FF�k���̃s���~�b�h�߂��̐���^000000";
		mes "�̂��Ƃł��ˁH";
		mes "���ʂȐ����N���Ă���ꏊ��";
		mes "����ƕ��������Ƃ�����܂��B";
		next;
		mes "[�^�}����]";
		mes "����ȓ��ʂȏꏊ�ő̂�􂦂�Ƃ�";
		mes "���͂ƂĂ��^���ǂ��݂����ł��ˁI";
		mes "�ł͂�����Ɛ���Ă���̂�";
		mes "�҂��ĂĂ��炦�܂����H";
		next;
		mes "[�^�}����]";
		mes "�܂��̒��͖��S�ł͂���܂��񂪁A";
		mes "1�l�ŕ������Ƃ��炢�͂ł��܂��B";
		mes "������悤�ɂȂ��������ł��\���ł��I";
		mes "�͂͂́I";
		next;
		if(select("�ꏏ�ɍs��","�����") == 2) {
			mes "[�^�}����]";
			mes "����c�c�͂��c�c�ӂ���!!";
			mes "�c�c�����ƁI�@�ƂƂ��ƁI";
			mes "���v�ł��A�����オ��܂��B";
			mes "�ӂ���c�c�I�@����c�c�H";
			next;
			mes "[�^�}����]";
			mes "�������c�c�B";
			set FVOL_1QUE,4;
			close2;
			cutin "ep143_tadir",255;
			end;
		}
	case 5:
		cutin "ep143_tadir",2;
		mes "[�^�}����]";
		mes "���A������ł����H";
		mes "�����m�炸�̎��ɑ΂���";
		mes "����Ȃɐe�؂ɂ��Ă����l��";
		mes "����Ȃ�āc�c�B";
		mes "�������̒��ɂȂ�܂����ˁB";
		next;
		mes "[�^�}����]";
		mes "�ł�";
		mes "^0000FF�k�����ɂ���s���~�b�h�߂��̐���^000000��";
		mes "�ꏏ�ɍs���܂��傤�B";
		if(FVOL_1QUE != 5) {
			set FVOL_1QUE,5;
			chgquest 11350,11351;
		}
		close2;
		warp "moc_ruins.gat",106,135;
		end;
	default:
		mes "�]�����ɐQ������������B";
		mes "�@�ǂ������Ė����Ă���悤���B";
		mes "�@�����Ƃ��Ă������]";
		close;
	}
OnInit:
	waitingroom "�t���C�����@���[�ւ̓�",0;
	end;
}

moc_ruins.gat,106,140,4	script	�^�}����#ep14bs_ru	10027,{
	switch(FVOL_1QUE) {
	case 5:
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�Ղ͂��I";
		mes "�₽���ċC���������I";
		next;
		mes "[�^�}����]";
		mes "����ȍ����ő̂�􂦂�Ȃ��";
		mes "�ґ�ł͂���܂��񂩁I";
		next;
		mes "[�^�}����]";
		mes "���ɂ����Ă������������Ă��ꂽ";
		mes "�����łȂ��A���ӂ܂�";
		mes "�ē����Ă�������Ƃ́c�c";
		mes "�{���ɂ��肪�������ł��B";
		next;
		mes "[�^�}����]";
		mes "���������΂��Ȃ����`���Ƃ�";
		mes "�悤�ł��ˁB";
		next;
		mes "[�^�}����]";
		mes "�����Ă�������������Ƃ��āA";
		mes "^0000FF�^�̖`���ƂȂ狻�������悤�Șb^000000��";
		mes "�������č����グ�܂��I";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "����͈ȑO�A�����s����";
		mes "�s�v�c�ȏꏊ�̘b�ł��B";
		next;
		if(select("������������","�����Ȃ�") == 2) {
			cutin "ep143_tahuk",2;
			mes "[�^�}����]";
			mes "�����Ȃ��ł����H";
			mes "�Ȃ��Ȃ��ǂ��b����";
			mes "�v���Ă���̂ł����c�c�B";
			next;
			cutin "ep143_tasta",2;
			mes "[�^�}����]";
			mes "�ł́c�c";
			mes "�����󂯂����̑���Ƃ���";
			mes "�����グ����̂́c�c";
			mes "�������̃G�T�ł��Ԃ��܂��傤���H";
			next;
			cutin "ep143_taang",2;
			mes "[�^�}����]";
			mes "���������c�c�B";
			close2;
			cutin "ep143_taang",255;
			end;
		}
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "����ς�I";
		mes "�s�v�c�ȏꏊ�ƌ�����";
		mes "�����������Ȃ��`���Ƃ�";
		mes "���܂��񂩂�ˁI";
		next;
		mes "[�^�}����]";
		mes "���ꂩ�玄���b�����e��";
		mes "�ŋ߂̖`���ƂȂ��x�͍s���Ă݂���";
		mes "�ꏊ^0000FF�ِ��E^000000�ł̗��s����";
		mes "�n�܂�܂��I";
		next;
		mes "[�^�}����]";
		mes "�`���ƃ^�}�����͒��Ԃ����ƈꏏ��";
		mes "���m�̗̈�I";
		mes "�ِ��E�ɗ������܂����`�B";
		next;
		mes "[�^�}����]";
		mes "�s�����͌������������`";
		mes "�ނ�͗E�C������Ȃ������`�I";
		next;
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "��H�@�ǂ����ċ}��";
		mes "�ςȂ���ׂ�ɂȂ������ł����āH";
		next;
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "���������Ǝ��A�̂����ӂŁA";
		mes "�o�[�h�ɂȂ낤�ƏC�s���������̂ł���";
		mes "�F�B�ɋ����i�߂��āA";
		mes "�n���^�[�ɓ]�E�����̂ł��`�I";
		next;
		mes "[�^�}����]";
		mes "�Ȃ̂ŁA�܊p�ł���";
		mes "���̍����v���o���āA";
		mes "���ӂȉ̂��̂��Ȃ���";
		mes "�o�܂����b�����悤���Ɓ`�I";
		next;
		menu "���ʂɂ��肢���܂�",-;
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "�����ł����H";
		mes "���ʂɂ��b�������������ł����H";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�ł͕��ʂɁc�c";
		mes "���͂�����A���Ԃ�����";
		mes "�ِ��E�֖`���ɏo�邱�Ƃɂ�����ł��B";
		emotion 33,"";
		next;
		mes "[�^�}����]";
		mes "�ِ��E�͏��߂Ă������̂ŁA";
		mes "�܂��͎����̋��Ԃ�";
		mes "���ĉ���Ă����̂ł����A";
		mes "���Ԃ̈�l���������Ė\��Ă��܂��āB";
		next;
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "�\��钇�Ԃ��~�߂悤�Ƃ������́A";
		mes "�����̋��Ԃɂ���ЂтɋC�t�����A";
		mes "�������ꂻ���ɗ����Ă��܂��܂����B";
		next;
		mes "[�^�}����]";
		mes "�C�����ƒ��Ԃ̎p�͌������A";
		mes "���͌������Ƃ��Ȃ��ꏊ��";
		mes "��l�ɂȂ��Ă��܂����B";
		next;
		mes "[�^�}����]";
		mes "^0000FF��������悤�ȐԂ���n��";
		mes "��Ȍ`������";
		mes "�������Ƃ̂Ȃ��A���⍩���B";
		mes "�s�C���ȋ�C���Y���ꏊ�ł����B^000000";
		next;
		mes "[�^�}����]";
		mes "���͐S�ׂ��Ȃ��āA�N�����Ȃ�����";
		mes "����ŕ������܂����B";
		mes "�ǂ̂��炢���Ԃ��o���Ă����̂���";
		mes "�킩��܂��񂪁A���Ȃ蒷����";
		mes "��l�Ŝf�r���Ă����Ǝv���܂��B";
		next;
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "�������߂��Ă���͂��܂�ɂ�";
		mes "�������󂢂āA���낢��E�������̂�";
		mes "�H�ׂĂ����炨�����ɂ��Ȃ�";
		mes "���ʂ��Ǝv���܂����B";
		next;
		mes "[�^�}����]";
		mes "���_�I�ɂ��̗͓I�ɂ�";
		mes "���E���}���悤�Ƃ��Ă������ɁA";
		mes "�˔@��l�̃A�T�V�������ꂽ�̂ł��B";
		mes "�ނ��܂��������サ�Ă���A";
		mes "���팾�̗l��^0000FF�����N�̍��Ղ��݂���^000000��";
		mes "�Ԃ₢�Ă��܂����B";
		next;
		mes "[�^�}����]";
		mes "�ނ����ɋC�Â��A";
		mes "�����炩�C�������������悤�ŁA";
		mes "�����͌R�l���A�A�蓹��m���Ă��邩��";
		mes "���ė����ƌ����";
		mes "������ꂽ�Ԃ���n�̂Ђт�";
		mes "�̂��������݂܂����B";
		next;
		mes "[�^�}����]";
		mes "�y��῝򂪂��Ėڂ��J����ƁA";
		mes "�����͒��Ԃ����ƈꏏ�ɖK�ꂽ";
		mes "�����̋��Ԃ�������ł��B";
		mes "���������Ă��ꂽ�A�T�V���̒j����";
		mes "�͂��ꂽ�̂��A��������܂���ł����B";
		next;
		mes "[�^�}����]";
		mes "�����ĂȂ�Ƃ�";
		mes "�����N�ɒʂ��鎟���ړ��@�ɓ����āA";
		mes "���������N�ɋA���Ă����̂ł��c�c�B";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�͂��ꂽ���Ԃ������S�z�ł��c�c�B";
		mes "���ǂ��ŉ������Ă����ł��傤�c�c�B";
		next;
	case 6:
		if(FVOL_1QUE == 6)
			cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�݂�Ȃ�T���Ȃ��Ƃ����Ȃ����A";
		mes "���͂�����x�̂��񕜂�����A";
		mes "������x���̏ꏊ�֍s������ł��B";
		next;
		if(select("�ꏏ�ɍs���ƌ���","��݂̌��t������") == 2) {
			cutin "ep143_tasmi",2;
			mes "[�^�}����]";
			mes "�͂��I";
			mes "�����Ă��������āA";
			mes "�{���ɂ��肪�Ƃ��������܂����B";
			next;
			mes "[�^�}����]";
			mes "�`���Ƃ����̂�";
			mes "�{���ɑf���炵�����Ƃł��B";
			mes "����ȑf���炵���l��";
			mes "�o����Ƃ��ł���̂ł�����B";
			next;
			mes "[�^�}����]";
			mes "�����̊ԁA���͂����ŃA���o�C�g�ł�";
			mes "���Ȃ���A������x���̎x�x������";
			mes "����ł��B";
			mes "�����N�ɂ���Ԃ͂܂�����Ƃ�";
			mes "����ł��傤�B";
			set FVOL_1QUE,6;
			close2;
			cutin "ep143_tasmi",255;
			end;
		}
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "!!";
		next;
		mes "[�^�}����]";
		mes "�فA�{���ł����H�I";
		next;
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "���肪�Ƃ��������܂�!!";
		mes "���͖{���ɉ^���ǂ��ł��B";
		mes "�{���͈�l�ł��̒n�֍s���̂�";
		mes "�S�ׂ������̂Łc�c�B";
		next;
	case 7:
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�ł́A�����x��ł���";
		mes "�K�v�ȕ���p�ӂ��Ă���̂ŁA";
		mes "^0000FF�����̋���^000000�ł�����܂��傤�B";
		next;
		mes "[�^�}����]";
		mes "�����Ɏ��Ԃ������邩������Ȃ��̂ŁA";
		mes "���ɗp������Ȃ�ς܂��Ă��ĉ������B";
		if(FVOL_1QUE != 7) {
			set FVOL_1QUE,7;
			chgquest 11351,11352;
		}
		close2;
		cutin "ep143_tasmi",255;
		end;
	default:
		cutin "ep143_tasmi",2;
		mes "[�H�H�H]";
		mes "�Ղ͂��I";
		mes "�₽���ċC���������I";
		close2;
		cutin "ep143_tasmi",255;
		end;
	}
}

dali.gat,112,69,4	script	�^�}����#ep14bs_cha	10027,{
	switch(FVOL_1QUE) {
	case 7:
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes strcharinfo(0)+ "�l�A";
		mes "�����ł��A�����ł��I";
		mes "���������ł��ˁI";
		mes "����ł͑����c�c�I";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�ƌ��������Ƃ���ł����A";
		mes "���̎��͂��܂�ɂ��p�j�b�N���";
		mes "�������̂ŁA�͂�����Ƃ���";
		mes "�����̈ʒu���o���Ă��Ȃ��̂ł��B";
		mes "^0000FF���̋�Ԃ̂ǂ�����";
		mes "����͂�^000000�Ȃ̂ł����c�c�B";
		next;
		mes "[�^�}����]";
		mes "�����T���Ă݂Ă��炦�܂����H";
		mes "^0000FF���̏ꏊ�͏����ȂЂт�����̂�";
		mes "�悭�T���΂킩��͂��ł��B^000000";
		set FVOL_1QUE,8;
		chgquest 11352,11353;
		close2;
		cutin "ep143_tasta",255;
		end;
	case 8:
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "���̎��͂��܂�ɂ��p�j�b�N���";
		mes "�������̂ŁA�͂�����Ƃ���";
		mes "�����̈ʒu���o���Ă��Ȃ��̂ł��B";
		mes "^0000FF���̋�Ԃ̂ǂ�����";
		mes "����͂�^000000�Ȃ̂ł����c�c�B";
		next;
		mes "[�^�}����]";
		mes "�����T���Ă݂Ă��炦�܂����H";
		mes "^0000FF���̏ꏊ�͏����ȂЂт�����̂�";
		mes "�悭�T���΂킩��͂��ł��B^000000";
		close2;
		cutin "ep143_tasta",255;
		end;
	default:
		if(FVOL_1QUE < 7) {
			cutin "ep143_tasta",2;
			mes "[�H�H�H]";
			mes "�ʘH���瑫�𓥂݊O���Ȃ��悤��";
			mes "�C��t���Ă��������ˁB";
			close2;
			cutin "ep143_tasta",255;
			end;
		}
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes strcharinfo(0)+ "�l�A";
		mes "���̂Ђт�ʂ�ۂ�";
		mes "�ƂĂ������ĈÂ��̂ŁA";
		mes "�\���C��t���Ă��������ˁB";
		next;
		mes "[�^�}����]";
		mes "�������Ԃ�T�����߂ɉ��x��";
		mes "���̂Ђт�ʂ��Ă���̂ł����A";
		mes "�����Ă��ł����Ԃ��Ă��܂��܂��B";
		close2;
		cutin "ep143_tasta",255;
		end;
	}
}

dali.gat,64,98,0	script	�Ђ�#ep14bs	550,{
	switch(FVOL_1QUE) {
	case 8:
		mes "�]���̏ꏊ�ɂ͎�����Ȃ�";
		mes "�@�Ђт�����]";
		next;
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�ӂ��I";
		mes "����������܂����ˁB";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�ł͂��������s���܂��傤�B";
		mes "���������������̂ŋC�����ĉ������B";
		next;
		if(select("�����ɓ���","��߂�") == 2) {
			cutin "ep143_tahuk",2;
			mes "[�^�}����]";
			mes "����Ȃ���ł����H";
			close2;
			cutin "ep143_tahuk",255;
			end;
		}
		mes "�]���͈�l������ƒʂ�邭�炢�ɋ���";
		mes "�@�Â������]";
		close2;
		cutin "ep143_tasta",255;
		set FVOL_1QUE,9;
		warp "moro_vol.gat",136,135;
		end;
	default:
		mes "�]���̏ꏊ�ɂ͎�����Ȃ�";
		mes "�@�Ђт�����]";
		if(FVOL_1QUE < 8)
			close;
		next;
		if(select("�����ɓ���","��߂�") == 2) {
			mes "�]����Ȃ����Ƃɂ����]";
			close;
		}
		mes "�]���͈�l������ƒʂ�邭�炢�ɋ���";
		mes "�@�Â������]";
		close2;
		warp "moro_vol.gat",136,135;
		end;
	}
}

moro_vol.gat,137,136,0	script	�Ђ�	550,{
	mes "�]���̏ꏊ�ɂ͎�����Ȃ�";
	mes "�@�Ђт�����]";
	next;
	if(select("�����̋��Ԃɖ߂�","��߂�") == 2) {
		mes "�]�߂�Ȃ����Ƃɂ����]";
		close;
	}
	mes "�]���͈�l������ƒʂ�邭�炢�ɋ���";
	mes "�@�Â������]";
	close2;
	warp "dali.gat",64,103;
	end;
OnInit:
	waitingroom "�����̋���",0;
	end;
}

moro_vol.gat,132,140,4	script	�^�}����#ep14bs_ju	10027,{
	viewpoint 2,1,1,1,0xFFFFFF;
	switch(FVOL_1QUE) {
	case 9:
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "����[�A���̊Ԃɂ���Ȃɑ����̐l��";
		mes "�W�܂�����ł��傤�B";
		mes "�ȑO�͑S�R�l�̋C�z���Ȃ������̂ɁB";
		next;
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "���������l�����邵�c�c�B";
		mes "���������Ď��������Ă��ꂽ";
		mes "���̃A�T�V���̒j�����Ă񂾂̂��ȁH";
		mes "�Ȃ񂾂����͋C���������ł��ˁc�c�B";
		next;
		mes "[�^�}����]";
		mes "�l�̎p����Ȃ��l�i�H�j�B��";
		mes "���������܂��ˁc�c�B";
		mes "����͂���������ƁA";
		mes "�����v���Ă�������";
		mes "�����ꏊ�Ȃ̂�������܂���!!";
		next;
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "����ɁA���ꂾ�������̐l�������";
		mes "���̒��Ԃ����������l��";
		mes "���邩������܂���I";
		next;
		if(checkquest(200875)) {	// �O�����ւ̕񍐏��N�G�X�g�H
			cutin "ep13_captin_edq",2;
			mes "[�i�ߊ��A�W�t]";
			mes "���H";
			mes strcharinfo(0)+ "����Ȃ����I";
			mes "���O�����Ă��ꂽ�̂��I";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "�����͐挭���̂ЂƂ肪��������";
			mes "^0000FF���������N�����ޒn�A";
			mes "�t���C�����@���[^000000���B";
			mes "���݊e���𒲍����łȁA";
			mes "����������";
			mes "�킩���Ă������Ƃ�����B";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "�����Ƃ�������i�߂�";
			mes "�����Ƃ��ΖʁA�ƍs���������Ȃ񂾂��B";
			mes "�܂��A�ł�͋֕����ă��c���ȁB";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "�Ƃ���ł��̐l�̐������Ă���I";
			mes "�œ|�����N�̊���̉��A";
			mes "�T�t�@�������t�B�l����";
			mes "�푰�Ԃ̂킾���܂�𒴂���";
			mes "���ꂾ���̐����W�܂��Ă��ꂽ�񂾁I";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "���ꂾ���̋K�̘͂A���R��";
			mes "�������ꂽ�񂾁B";
			mes "���悢�斂�������N��";
			mes "�N�v�̔[�ߎ��A���ĂƂ����ȁI";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "���͂������琼�̕��p��";
			mes "�{�����\���Ă��邩��A";
			mes "������������K�˂Ă���Ƃ����B";
			mes "�����͊댯�ȏꏊ����������";
			mes "���܂薳���͂���Ȃ�B";
			next;
			cutin "ep13_captin_edq",255;
			mes "[�o�[�b�g]";
			mes "!?�@�����̂��Ȃ�����!!";
			mes "�������Ă����ł���!!";
			next;
			cutin "ep13_captin_edq",2;
			mes "[�i�ߊ��A�W�t]";
			mes "�����ƁI";
			mes "�|�����m�Ɍ������Ă��܂����B";
			mes "���͖{���ɖ߂�B";
			mes "���ꂮ��������͂���Ȃ�I";
			next;
			cutin "ep13_captin_edq",255;
			mes "[�o�[�b�g]";
			mes "�c�c���̂̓A�W�t�i�ߊ��H";
			mes "�S���A���𔄂��Ă���ɂ�����Ȃ�";
			mes "���������`���Ăق������̂ł��ˁI";
			mes "�����āc�c�����̂��Ȃ��B�I";
			mes "���Ȃ��B�͉������Ă���̂ł����I";
		}
		else {
			emotion 6,"�o�[�b�g#ep14bs";
			cutin "ep143_tahuk",255;
			mes "[�o�[�b�g]";
			mes "!?�@�����̂��Ȃ�����!!";
			mes "�������Ă����ł���!!";
		}
		viewpoint 1,142,131,0,0xFF0000;
		set FVOL_1QUE,10;
		chgquest 11353,11354;
		close;
	case 10:
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "���������Ύ��������Ă��ꂽ";
		mes "���̃A�T�V���̒j����";
		mes "^0000FF�����N�̍��Ղ��݂���^000000��";
		mes "�����Ă��܂����B";
		next;
		mes "[�^�}����]";
		mes "�����͉���";
		mes "�����N�Ɗ֌W����n�Ȃ̂ł��傤���B";
		next;
		cutin "ep143_tahuk",255;
		emotion 6,"�o�[�b�g#ep14bs";
		mes "[�o�[�b�g]";
		mes "�����̂��Ȃ�����!!";
		mes "������Ƃ�����ɂ��Ȃ����I";
		close;
	case 11:
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "�������藈�������΂���";
		mes "�ǂ��o����邩������܂���B";
		mes "�܂��͌����ʂ�ɂ�������";
		mes "�ǂ������ł��ˁB";
		close2;
		cutin "ep143_taang",255;
		end;
	case 12:
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�A���W�{���̏W���邾���Ȃ�A";
		mes "�����܂ő�ς����ł��Ȃ��̂�";
		mes "�������W�߂邱�Ƃɂ��܂��傤�B";
		next;
		mes "[�^�}����]";
		mes "^0000FF�\�j�A�̌s��1�W�߂���A";
		mes "�����̒����ɂ���傫�Ȋ�̑O��";
		mes "�҂����킹�Ĉꏏ�ɖ߂�܂��傤�B^000000";
		viewpoint 1,198,179,2,0xFF0000;
		set FVOL_1QUE,13;
		chgquest 11356,11357;
		close2;
		cutin "ep143_tasta",255;
		end;
	case 13:
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�A���W�{���̏W���邾���Ȃ�A";
		mes "�����܂ő�ς����ł��Ȃ��̂�";
		mes "�������W�߂邱�Ƃɂ��܂��傤�B";
		next;
		mes "[�^�}����]";
		mes "^0000FF�\�j�A�̌s��1�W�߂���A";
		mes "�����̒����ɂ���傫�Ȋ�̑O��";
		mes "�҂����킹�Ĉꏏ�ɖ߂�܂��傤�B^000000";
		viewpoint 1,198,179,2,0xFF0000;
		close2;
		cutin "ep143_tasta",255;
		end;
	case 14:
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�܂��̓o�[�b�g����ɕ񍐂��܂��񂩁H";
		close2;
		cutin "ep143_tahuk",255;
		end;
	case 15:
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "�}����^0000FF���[�Q������^000000�̏���";
		mes "�������܂��傤�I";
		mes "�ꍏ�𑈂��܂�!!";
		close2;
		cutin "ep143_tahuk",255;
		end;
	case 16:
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "^0000FF�\�j�A�̌s��";
		mes "���҂ɐH�ׂ����Ă݂܂��傤�I^000000";
		close2;
		cutin "ep143_tahuk",255;
		end;
	case 17:
		cutin "ep143_tahuk",2;
		mes "[�^�}����]";
		mes "�\�j�A�̌s�͊��҂̗l�Ԃ�";
		mes "��������������ʂ�����݂����ł��ˁB";
		mes "^0000FF���[�Q������^000000��";
		mes "�񍐂��܂��傤�B";
		close2;
		cutin "ep143_tahuk",255;
		end;
	case 18:
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�󕠂̂��܂�ɐH�ׂ�";
		mes "�A��������Ȍ`�Ŗ��ɗ��Ƃ́I";
		mes "�}���Ńo�[�b�g����ɕ񍐂��܂��傤�I";
		close2;
		cutin "ep143_tasmi",255;
		end;
	case 100:
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�����ɂ͐l���������񂢂܂����A";
		mes "��������͂�����l�ł����v�ł��B";
		mes "���܂Ŗ{���ɂ��肪�Ƃ��������܂����I";
		next;
		mes "[�^�}����]";
		mes "���������̊�ɂ���Ƃ���";
		mes "���A�ɓ��邱�Ƃ���������A";
		mes "���ɂЂƐ������Ă��������ˁB";
		close2;
		cutin "ep143_tasmi",255;
		end;
	}
}

moro_vol.gat,142,131,5	script	�o�[�b�g#ep14bs	883,{
	viewpoint 2,1,1,0,0xFFFFFF;
	switch(FVOL_1QUE) {
	case 10:
		mes "[�o�[�b�g]";
		mes "�����A���Ȃ��B�I";
		mes "�����𓥂ݍr�炳�Ȃ��ł��������I";
		mes "���������W�߂Ă������T���v����";
		mes "���`���N�`���ɂȂ��Ă��܂�������";
		mes "����܂��񂩁I";
		next;
		mes "[�o�[�b�g]";
		mes "�L�����v���̒������܂����S��";
		mes "�I���ĂȂ��̂Ɂc�c�B";
		mes "��ƒ��̒n��ł͋C��t���ĉ������I";
		mes "���̎d���𑝂₷�C�ł���!?";
		next;
		mes "[�o�[�b�g]";
		mes "����Ȃ��ƂɂȂ�Ƃ킩���Ă�����";
		mes "�����Ə����p�ӂ��ė~������";
		mes "�����ׂ��������c�c�B";
		mes "���|�I�ɐl�肪����Ȃ�����I";
		next;
		mes "[�o�[�b�g]";
		mes "�n�b�c�c!!";
		mes "���݂܂���A�Z�����̂��܂�";
		mes "��藐���Ă��܂��܂����c�c�B";
		mes "���͌R�̐挭������������";
		mes "�����A�t���C�����@���[�̒�����";
		mes "�S�����Ă���o�[�b�g�Ƃ����܂��B";
		next;
		mes "[�o�[�b�g]";
		mes "�������̌R�̐挭���̑����́A";
		mes "�����ړ��@��ʂ��āA";
		mes "���̃t���C�����@���[�ɂ��܂����B";
		next;
		mes "[�o�[�b�g]";
		mes "�������c�c�B";
		mes "��̌R���قǂ̐l���������ɏo���̂ɁA";
		mes "�߂��Ă����̂͂����������ŁA";
		mes "�������ނ�͂Ђǂ�����Ă��܂����B";
		next;
		mes "[�o�[�b�g]";
		mes "�挭���̒������ʂ�";
		mes "���������������N�Ɋ֌W����n�Ȃ̂�";
		mes "�ԈႢ�Ȃ��Ƃ̂��Ƃł������c�c�B";
		mes "�c�c���̒n�͉��������������B";
		next;
		mes "[�o�[�b�g]";
		mes "����ċA���Ă����挭���̂悤��";
		mes "�������ɂ���҂�����";
		mes "�댯�Ȗڂɂ��킷���Ƃ̂Ȃ��悤";
		mes "�}���Œ�����i�߂Ă���̂ł��B";
		next;
		mes "[�o�[�b�g]";
		mes "���������Ȃ��B�B���Ȃ���ł����A";
		mes "���邩��ɉɂ����ł��ˁB";
		mes "�T���v�����W�߂�d����";
		mes "��`���ĉ�������I";
		next;
		mes "[�o�[�b�g]";
		mes "���Ȃ��B�������p�̃T���v����";
		mes "���ݍr�炵�������ŁA";
		mes "���`���N�`���Ȃ��Ă��܂����̂�";
		mes "�ӔC������Ă����Ȃ��ƁI";
		mes "���Ƃ͌��킹�܂����I";
		next;
		mes "[�o�[�b�g]";
		mes "�܂��͒��̕W�{���W�߂Ă��������B";
		mes "���̒n��ł͕ό`���Ă��鐶����";
		mes "�������񌩂����Ă��܂����A";
		mes "���̒�����^0000FF���S�ɐV������^000000��";
		mes "�ЂƂ���������܂����B";
		next;
		mes "[�o�[�b�g]";
		mes "^0000FF�R���钎�̂悤�Ȏp�����Ă���̂ŁA";
		mes "�t���C���o�O�ƌĂ�ł��܂��B";
		mes "���̒��ɔ�ׂ�����ƕς���Ă���̂�";
		mes "�t���C���s�b�g�ƌĂ΂��΂̌���";
		mes "�Z��ł���^000000�Ƃ������ł��B";
		next;
		mes "[�o�[�b�g]";
		mes "���X�O�ɏo�Ă���z������܂����A";
		mes "�΂̌��̊O�ɏo�Ă��܂���";
		mes "��������ł��܂��܂��B";
		next;
		mes "[�o�[�b�g]";
		mes "������^0000FF�t���C���s�b�g��2�������A";
		mes "�j�󂵂���A^000000";
		mes "�t���C���o�O��T���o���ē|���A";
		mes "^0000FF�t���C���o�O�̔��1��";
		mes "�̎悵�ė��ĉ������B^000000";
		next;
		mes "[�o�[�b�g]";
		mes "�M����������Ȃ��̂�";
		mes "�\���C��t���Ă��������ˁB";
		set FVOL_1QUE,11;
		chgquest 11354,11355;
		close;
	case 11:
		if(checkquest(11355)&0x4 == 0 || countitem(6689) == 0) {
			mes "[�o�[�b�g]";
			mes "�܂��͒��̕W�{���W�߂Ă��������B";
			mes "���̒n��ł͕ό`���Ă��鐶����";
			mes "�������񌩂����Ă��܂����A";
			mes "���̒�����^0000FF���S�ɐV������^000000��";
			mes "�ЂƂ���������܂����B";
			next;
			mes "[�o�[�b�g]";
			mes "^0000FF�R���钎�̂悤�Ȏp�����Ă���̂ŁA";
			mes "�t���C���o�O�ƌĂ�ł��܂��B";
			mes "���̒��ɔ�ׂ�����ƕς���Ă���̂�";
			mes "�t���C���s�b�g�ƌĂ΂��΂̌���";
			mes "�Z��ł���^000000�Ƃ������ł��B";
			next;
			mes "[�o�[�b�g]";
			mes "���X�O�ɏo�Ă���z������܂����A";
			mes "�΂̌��̊O�ɏo�Ă��܂���";
			mes "��������ł��܂��܂��B";
			next;
			mes "[�o�[�b�g]";
			mes "������^0000FF�t���C���s�b�g��2�������A";
			mes "�j�󂵂���A^000000";
			mes "�t���C���o�O��T���o���ē|���A";
			mes "^0000FF�t���C���o�O�̔��1��";
			mes "�̎悵�ė��ĉ������B^000000";
			next;
			mes "[�o�[�b�g]";
			mes "�M����������Ȃ��̂�";
			mes "�\���C��t���Ă��������ˁB";
			close;
		}
		viewpoint 2,1,1,0,0xFFFFFF;
		mes "[�o�[�b�g]";
		mes "���I�@�A���Ă��܂����ˁI";
		mes "����J�l�ł����I";
		mes "�v���Ă������";
		mes "���������ł��ˁB";
		delitem 6689,1;
		set FVOL_1QUE,12;
		chgquest 11355,11356;
		next;
		mes "[�o�[�b�g]";
		mes "����I�@����������!!";
		mes "�Ӂ[�I�@�Ӂ[!!!!";
		mes "����͗�߂�O�ɂ��܂��ۑ�����";
		mes "�������ɑ����Ƃ��āc�c�B";
		next;
		mes "[�o�[�b�g]";
		mes "���͐A���W�{���W�߂Ă��������B";
		mes "�̎悵�Ȃ���΂Ȃ�Ȃ��A���́A";
		mes "^FF0000�\�j�A^000000�Ƃ����ƂĂ����n�I�Ȏp��";
		mes "���Ă���A���ł��B";
		next;
		mes "[�o�[�b�g]";
		mes "�p�b�ƌ��������ł͐A���Ƃ������́A";
		mes "�v���X�`�b�N�ł������z�[�X��";
		mes "�����܂����A�A���������Ă����ׂ�";
		mes "��Ԋ�{�I�ȍ\�������Ă��܂��B";
		next;
		mes "[�o�[�b�g]";
		mes "�\�j�A��|����";
		mes "^0000FF�\�j�A�̌s^000000�𗎂Ƃ��܂��B";
		mes "����^0000FF�\�j�A�̌s��2��^000000";
		mes "�����ė��ĉ������B";
		next;
		mes "[�o�[�b�g]";
		mes "�\�j�A�̕W�{���̏W�����";
		mes "�W�{���W�߂�d���͏I���Ȃ̂ŁA";
		mes "������ƒ���^0000FF���������ł�����^000000������";
		mes "�����ĉ������B";
		next;
		mes "[�o�[�b�g]";
		mes "��Ȃ���������Ȃ��̂ŁA�{���n����";
		mes "���܂艓���ɂ͍s���Ȃ��ŉ������B";
		mes "�C��t���čs���Ă��ĉ������ˁB";
		mes "��낵�����肢���܂��B";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�ӂށc�c";
		mes strcharinfo(0)+ "�l�A";
		mes "�ǂ��Ă��v�������̂�";
		mes "������Ƒ҂��ĉ������I";
		viewpoint 1,132,140,1,0xFF0000;
		close2;
		cutin "ep143_tasta",255;
		end;
	case 12:
	case 13:
		mes "[�o�[�b�g]";
		mes "���͐A���W�{���W�߂Ă��������B";
		mes "�̎悵�Ȃ���΂Ȃ�Ȃ��A���́A";
		mes "^FF0000�\�j�A^000000�Ƃ����ƂĂ����n�I�Ȏp��";
		mes "���Ă���A���ł��B";
		next;
		mes "[�o�[�b�g]";
		mes "�p�b�ƌ��������ł͐A���Ƃ������́A";
		mes "�v���X�`�b�N�ł������z�[�X��";
		mes "�����܂����A�A���������Ă����ׂ�";
		mes "��Ԋ�{�I�ȍ\�������Ă��܂��B";
		next;
		mes "[�o�[�b�g]";
		mes "�\�j�A��|����";
		mes "^0000FF�\�j�A�̌s^000000�𗎂Ƃ��܂��B";
		mes "����^0000FF�\�j�A�̌s��2��^000000";
		mes "�����ė��ĉ������B";
		next;
		mes "[�o�[�b�g]";
		mes "�\�j�A�̕W�{���̏W�����";
		mes "�W�{���W�߂�d���͏I���Ȃ̂ŁA";
		mes "������ƒ���^0000FF���������ł�����^000000������";
		mes "�����ĉ������B";
		next;
		mes "[�o�[�b�g]";
		mes "��Ȃ���������Ȃ��̂ŁA�{���n����";
		mes "���܂艓���ɂ͍s���Ȃ��ŉ������B";
		mes "�C��t���čs���Ă��ĉ������ˁB";
		mes "��낵�����肢���܂��B";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�ӂށc�c";
		mes strcharinfo(0)+ "�l�A";
		mes "�ǂ��Ă��v�������̂�";
		mes "������Ƒ҂��ĉ������I";
		viewpoint 1,132,140,1,0xFF0000;
		close2;
		cutin "ep143_tasta",255;
		end;
	case 14:
		mes "[�o�[�b�g]";
		mes "��������Ȃ����I";
		mes "�����ɖ߂����̂ł��ˁI";
		mes "�悩�����ł��B����ĂĂ��āA";
		mes "^0000FF�����ɂ����̋߂��ɍs���Ă͂Ȃ�Ȃ�^000000";
		mes "�ƌ����̂�Y��Ă��܂����B";
		next;
		mes "[�o�[�b�g]";
		mes "�O�̂��ߋ~��������z�����̂ł����A";
		mes "�����ɖ߂��ė����";
		mes "�悩�����ł��B";
		next;
		mes "[�o�[�b�g]";
		mes "�댯�ȏꏊ��`���Y���";
		mes "�{���ɂ��݂܂���B";
		mes "�E�l�I�Ȓ����X�P�W���[���ɒǂ��A";
		mes "�厖�Ȏ������O���Ă��܂����΂��肩�A";
		mes "���Ȃ������댯�ɎN���Ă��܂��܂����B";
		next;
		mes "[�o�[�b�g]";
		mes "�܂��������Ȃ���΂Ȃ�Ȃ��d����";
		mes "�R�̂悤�ɐς����Ă��邵�c�c";
		mes "�ӂ��c�c�B";
		next;
		menu "�����ɂ����ɂ��Ęb��",-;
		mes "[�o�[�b�g]";
		mes "�Ȃ�ł�����!?";
		mes "�������ɍs������ł����H";
		mes "�Ȃ�Ƃ�������!!";
		mes "�������A���ꂪ�����Ȃ�";
		mes "�Ȃ����Ȃ����͖����Ȃ̂ł����H";
		next;
		mes "[�o�[�b�g]";
		mes "���̏ꏊ�𒲍����Ă����l�͊F�A";
		mes "^0000FF�₩��o��ŃK�X�̂����ō������^000000��";
		mes "�ׂ����̂ɁI";
		next;
		mes "[�o�[�b�g]";
		mes "�ǂ����������c�c�H";
		mes "�c�c�������ʂȎ������܂������H";
		mes "�����H�ׂ��Ƃ��A���񂾂Ƃ��c�c";
		next;
		menu "�\�j�A�̌s��H�ׂ�",-;
		mes "[�o�[�b�g]";
		mes "�\�j�A�̌s��H�ׂ��H";
		mes "�Ő����Ȃ��̂͂킩���Ă����̂ł����A";
		mes "�܂��������I����Ă��Ȃ��A���̌s��";
		mes "�H�ׂđ̂ɉ����ُ�͋N���Ă��܂��񂩁H";
		next;
		menu "�Ȃ�Ƃ��Ȃ�",-;
		mes "[�o�[�b�g]";
		mes "�ȁA�Ȃ�Ƃ�������!!";
		mes "����͖{���ɑf���炵��������!!";
		next;
		mes "[�o�[�b�g]";
		mes "�����������c�c";
		mes "����A�����荡��^0000FF�̒����������҂�";
		mes "��̕��ɏW�܂��Ă���̂ŁA";
		mes "�}���Ń\�j�A�̌s��͂���̂���ł��I^000000";
		next;
		mes "[�o�[�b�g]";
		mes "�����������犳�҂̏Ǐ�";
		mes "���܂邩������܂���B";
		next;
		mes "[�o�[�b�g]";
		mes "^0000FF���[�Q������^000000���ŕa���Ă���̂�";
		mes "���̕��Ɍs��n���Ă��������B";
		mes "���̎莆�Ɏ����o�܂������Ă����̂�";
		mes "������ꏏ�ɓn���Ă��������B";
		next;
		mes "[�o�[�b�g]";
		mes "���͂�����";
		mes "�������n�߂���悤�ɂ��܂��I";
		mes "���ƁA����͉^�悭�����ł������A";
		mes "����͉��ł����ɓ��ꂽ�肵�Ȃ���";
		mes "�������ˁI";
		viewpoint 1,105,71,3,0xFFFF0000;
		set FVOL_1QUE,15;
		chgquest 11358,11359;
		close;
	case 15:
		mes "[�o�[�b�g]";
		mes "�����������c�c";
		mes "����A�����荡��^0000FF�̒����������҂�";
		mes "��̕��ɏW�܂��Ă���̂ŁA";
		mes "�}���Ń\�j�A�̌s��͂���̂���ł��I^000000";
		next;
		mes "[�o�[�b�g]";
		mes "�����������犳�҂̏Ǐ�";
		mes "���܂邩������܂���B";
		next;
		mes "[�o�[�b�g]";
		mes "^0000FF���[�Q������^000000���ŕa���Ă���̂�";
		mes "���̕��Ɍs��n���Ă��������B";
		mes "���̎莆�Ɏ����o�܂������Ă����̂�";
		mes "������ꏏ�ɓn���Ă��������B";
		next;
		mes "[�o�[�b�g]";
		mes "���͂�����";
		mes "�������n�߂���悤�ɂ��܂��I";
		mes "���ƁA����͉^�悭�����ł������A";
		mes "����͉��ł����ɓ��ꂽ�肵�Ȃ���";
		mes "�������ˁI";
		viewpoint 1,105,71,3,0xFF0000;
		close;
	case 16:
	case 17:
		mes "[�o�[�b�g]";
		mes "���[�Q�������̏��ɂ͍s���ė��܂����H";
		close;
	case 18:
		mes "[�o�[�b�g]";
		mes "�ӂӂӂӂ�!!!!";
		mes "�ǂ��ł���?!";
		mes "��͂���ʂ͂���܂�����ˁH";
		next;
		mes "[�o�[�b�g]";
		mes "�����̕������Ȃ�ǂ����ʂ�";
		mes "�o��Ǝv���܂��I";
		mes "���d�ȍs���ł������A";
		mes "�������ő����̖���";
		mes "�~�����Ƃ��ł��܂���!!";
		next;
		mes "[�o�[�b�g]";
		mes "����ł���^0000FF���������A^000000��";
		mes "��������܂Œ����ł������ł��I";
		next;
		menu "���A�H",-;
		mes "[�o�[�b�g]";
		mes "�ŃK�X���R��Ă���₪����ł��傤�H";
		mes "���̊�ɂ͓��A������̂ł��B";
		mes "^0000FF�K�X�����܂�ɂ��Z���o�߂���";
		mes "�������悭�����Ȃ���^000000�ł����B";
		next;
		mes "[�o�[�b�g]";
		mes "���������̃\�j�A�̌s�������";
		mes "�ŃK�X�ɉ����邱�Ƃ��Ȃ��A";
		mes "���A�𒲍����邱�Ƃ��ł��܂��I";
		next;
		mes "[�o�[�b�g]";
		mes "����l�����Ȃ���΁A";
		mes "�܂���������Ă������Ƃł��傤�B";
		mes "�{���ɂ��肪�Ƃ��������܂����I";
		next;
		mes "[�o�[�b�g]";
		mes "�����ɋ��͂��Ă��������";
		mes "�\�j�A�̌s��͂��Ă��������A";
		mes "���낢�날���Ĕ��Ă���ł��傤�B";
		mes "���΂炭�����ŋx��ł��Ă��������B";
		next;
		mes "[�o�[�b�g]";
		mes "���͂��̊ԂɃ��N�`���������";
		mes "�݂�Ȃɔz���Ă��܂��B";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c�c�c";
		next;
		mes "[�o�[�b�g]";
		mes "�����͋x�߂܂������H";
		next;
		mes "[�o�[�b�g]";
		mes "����l���x��ł���ԂɁA";
		mes "���N�`���𓊗^����������";
		mes "���A�ւƌ������܂����B";
		mes "��肪���������Ƃ����A����";
		mes "����܂��񂵁A���N�`���̌��ʂ�";
		mes "�����Ă���悤�ł��ˁB";
		next;
		mes "[�o�[�b�g]";
		mes "����l�͊��ɍR�̂��ł��Ă��܂�����A";
		mes "���N�`����ڎ킵�Ȃ��Ă�";
		mes "���̓��A�ɓ����ł��傤�B";
		mes "���S���Ē������Ă��Ă��������B";
		next;
		mes "[�o�[�b�g]";
		mes "���ƁA�������琼�ɍs�����ꏊ��";
		mes "��X�̖{��������܂��B";
		mes "�������������Ƃ���������";
		mes "�s���Ă݂Ă��������B";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes strcharinfo(0) + "�l�A";
		mes "��i�������悤�ł����A";
		mes "���͂��ꂩ��ʂꂽ���Ԃ�";
		mes "�T�������Ǝv���܂��B";
		next;
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�����ɂ͐l���������񂢂܂����A";
		mes "��������͂�����l�ł����v�ł��B";
		mes "���܂Ŗ{���ɂ��肪�Ƃ��������܂����I";
		next;
		mes "[�^�}����]";
		mes "���̒����̊�ɂ���Ƃ���";
		mes "���A�t�߂𒆐S�ɒT������Ȃ̂ŁA";
		mes "���A�ɓ��邱�Ƃ���������";
		mes "�ЂƐ������Ă��������ˁB";
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		getexp 1000000,0;
		set FVOL_1QUE,100;
		chgquest 11362,201705;
		close2;
		cutin "ep143_tasmi",255;
		end;
	case 100:
		mes "[�o�[�b�g]";
		mes "�{���ɂ���l�����Ȃ���΁A";
		mes "�܂���������Ă������Ƃł��傤�B";
		mes "�{���ɂ��肪�Ƃ��������܂����I";
		next;
		mes "[�o�[�b�g]";
		mes "�������琼�ɍs�����ꏊ��";
		mes "��X�̖{��������܂�����A";
		mes "�������������Ƃ���������";
		mes "�s���Ă݂Ă��������B";
		close;
	default:
		mes "[�o�[�b�g]";
		mes "�����c�c��ꂽ�B";
		mes "������}���̎d�����Ƃ��Ă��A";
		mes "��������������Ȃ����H";
		close;
	}
}

moro_vol.gat,198,179,4	script	�^�}����#ep14bs_st	10027,{
	viewpoint 2,1,1,2,0xFFFFFF;
	switch(FVOL_1QUE) {
	case 13:
		if(countitem(6690)==0) {
			cutin "ep143_tasta",2;
			mes "[�^�}����]";
			mes "^0000FF�\�j�A�̌s��1�W�߂���A";
			mes "���̑傫�Ȑ΂̑O�ő҂����킹��";
			mes "�ꏏ�ɖ߂�܂��傤^000000�B";
			close2;
			cutin "ep143_tasta",255;
			end;
		}
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "���������΂��̑O�ɗ������ɂ́A";
		mes "���̐΂͂����܂ő傫���Ȃ������悤��";
		mes "�C������񂾂��ǁc�c�B";
		mes "����ɂ����ςȐ�������";
		mes "�₯�ɐ������Ă��܂��ˁB";
		mes "^0000FF��������^000000���o�Ă��܂����c�c�B";
		next;
		mes "[�^�}����]";
		mes "����Ɂc�c";
		mes "^0000FF���̎��͕ς����������������";
		mes "����Ȃɑ����Ȃ������悤�ȁc�c^000000";
		mes "�\�j�A���������ȁA���������Ȃɑ���";
		mes "�����Ă��܂���ł����B";
		next;
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "�����ŐH�ׂ����̒��ł͓ł��Ȃ��A";
		mes "��Ԕ������������̂�";
		mes "���̃\�j�A�������̂ł����c�c";
		mes "���̎��͂����܂ő����Ȃ������̂ŁA";
		mes "�󕠂𖞂������͓��������ł��B";
		next;
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes strcharinfo(0)+ "�l���H�ׂĂ݂܂����H";
		mes "�������߂Ɏ����ė����̂Łc�c�B";
		next;
		cutin "ep143_tasmi",255;
		mes "�]�\�j�A�̖��A";
		mes "�@�g�����Ēe�͂̂���s����A";
		mes "�@�����Ȏ��R�̖����L����c�c";
		mes "�@���������]";
		next;
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "�ǂ��ł����H";
		mes "�Ȃ��Ȃ����������ł��傤�I";
		next;
		mes "[�^�}����]";
		mes "���ƁA��������n�����܂�";
		mes "�H�ׂ��Ⴂ�����Ȃ̂ŁA";
		mes "�����o�[�b�g����̂Ƃ����";
		mes "�߂�܂��傤�B";
		cutin "ep143_tasmi",2;
		set FVOL_1QUE,14;
		chgquest 11357,11358;
		viewpoint 1,142,131,0,0xFF0000;
		close2;
		cutin "ep143_tasmi",255;
		end;
	case 14:
		mes "[�^�}����]";
		mes "���ƁA��������n�����܂�";
		mes "�H�ׂ��Ⴂ�����Ȃ̂ŁA";
		mes "�����o�[�b�g����̂Ƃ����";
		mes "�߂�܂��傤�B";
		cutin "ep143_tasmi",2;
		viewpoint 1,142,131,0,0xFF0000;
		close2;
		cutin "ep143_tasmi",255;
		end;
	case 100:
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "���A" +strcharinfo(0)+ "�l�A";
		mes "���ꂾ���l��������";
		mes "�t�ɒT���̂���ςł��ˁI";
		mes "���A�ɓ���Ȃ�ē����܂��傤���H";
		next;
		if(select("����","����Ȃ�") == 2) {
			cutin "ep143_tasta",2;
			mes "[�^�}����]";
			mes "�����ł����B";
			mes "�ł͎��͒��ԒT���ɖ߂�܂��ˁB";
			close2;
			cutin "ep143_tasmi",255;
			end;
		}
		mes "[�^�}����]";
		mes "�n�ʂ��ǂ������Ȃ��̂�";
		mes "�����ɋC��t���ĉ������ˁI";
		close2;
		cutin "ep143_tasmi",255;
		warp "moro_cav.gat",59,14;
		end;
	default:
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "���ށc�c";
		mes "���͂���Ȏ������Ă���ꍇ����";
		mes "����܂���I";
		close2;
		cutin "ep143_taang",255;
		end;
	}
}

moro_cav.gat,64,13,0	warp	#ep14_3���A�o��	1,1,moro_vol.gat,198,176

moro_vol.gat,105,71,5	script	���[�Q������#ep14bs	405,{
	viewpoint 2,1,1,3,0xFFFFFF;
	switch(FVOL_1QUE) {
	case 15:
		mes "[���[�Q������]";
		mes "���v���H";
		mes "�C���������莝�񂾁B";
		next;
		mes "[���[�Q������]";
		mes "�o�[�b�g���m��";
		mes "�F�X���ׂĂ���Ă��邩��A";
		mes "�������������A�撣���Ă���c�c�B";
		next;
		if(select("�b�������Ă݂�","�[�������ɂ݂���̂ł�߂Ă���") == 2) {
			mes "[���[�Q������]";
			mes "�����������A���������̐h�����B";
			mes "�撣���Ă���c�c�B";
			close;
		}
		mes "[���[�Q������]";
		mes "�ǂ����܂������H";
		mes "�ɂ߂Ă��鏊������Ύ�t��";
		mes "�Ǐ��b���đ҂��Ă��ĉ������B";
		if(countitem(6690)==0)
			close;
		next;
		menu "�\�j�A�̌s�Ǝ莆��n��",-;
		mes "[���[�Q������]";
		mes "!!�@����͖{���ł����H";
		mes "�ȂɂȂɁA�ӂނӂށc�c";
		mes "�莆�ɂ��s�̎��������Ă���܂��I";
		mes "�����������҂�����";
		mes "�H�ׂ����Ă݂܂��傤�I";
		delitem 6690,1;
		set FVOL_1QUE,16;
		chgquest 11359,11360;
		close;
	case 16:
		mes "[���[�Q������]";
		mes "!!�@����͖{���ł����H";
		mes "�ȂɂȂɁA�ӂނӂށc�c";
		mes "�莆�ɂ��s�̎��������Ă���܂��I";
		mes "�����������҂�����";
		mes "�H�ׂ����Ă݂܂��傤�I";
		close;
	case 17:
		mes "[���[�Q������]";
		mes "�����I";
		mes "�I�g�D�I";
		mes "�ǂ����H�@���v��!?";
		next;
		mes "[�I�g�D]";
		mes "�͂��c�c���c�c";
		mes "�c�c���[�Q���c�c�����c�c";
		next;
		mes "[���[�Q������]";
		mes "�����c�c�ӎ����߂������I";
		mes "�悩�����A�{���ɗǂ�����!!";
		next;
		mes "[���[�Q������]";
		mes "�܂����S�ɉ񕜂͂��ĂȂ��悤�ł����A";
		mes "���҂̏�Ԃ�";
		mes "���Ȃ�ǂ��Ȃ����悤�ł��B";
		mes "�܂��͏Ǐ�̏d�����҂Ɍs��^���A";
		mes "�c��̓o�[�b�g���m�̌������ʂ�";
		mes "�o��̂�҂��������ǂ������ł��B";
		next;
		mes "[���[�Q������]";
		mes "���ʂ��ƂĂ��ǂ�������";
		mes "�莆�ɏ����܂����̂ŁA";
		mes "^0000FF�o�[�b�g���m^000000�ɓn���ĉ������B";
		mes "�{���ɏ�����܂����B";
		mes "���肪�Ƃ��������܂��B";
		viewpoint 1,142,131,0,0xFF0000;
		set FVOL_1QUE,18;
		chgquest 11361,11362;
		close;
	case 18:
		mes "[���[�Q������]";
		mes "�܂����S�ɉ񕜂͂��ĂȂ��悤�ł����A";
		mes "���҂̏�Ԃ�";
		mes "���Ȃ�ǂ��Ȃ����悤�ł��B";
		mes "�܂��͏Ǐ�̏d�����҂Ɍs��^���A";
		mes "�c��̓o�[�b�g���m�̌������ʂ�";
		mes "�o��̂�҂��������ǂ������ł��B";
		next;
		mes "[���[�Q������]";
		mes "���ʂ��ƂĂ��ǂ�������";
		mes "�莆�ɏ����܂����̂ŁA";
		mes "^0000FF�o�[�b�g���m^000000�ɓn���ĉ������B";
		mes "�{���ɏ�����܂����B";
		mes "���肪�Ƃ��������܂��B";
		viewpoint 1,142,131,0,0xFFFF0000;
		close;
	case 100:
		mes "[���[�Q������]";
		mes "���̒��Ԃ������������l��";
		mes "��Ԃ��ǂ��Ȃ�܂����B";
		mes "���肪�Ƃ��������܂��B";
		close;
	default:
		mes "[���[�Q������]";
		mes "���v���H";
		mes "�C���������莝�񂾁B";
		next;
		mes "[���[�Q������]";
		mes "�o�[�b�g���m��";
		mes "�F�X���ׂĂ���Ă��邩��A";
		mes "�������������A�撣���Ă���c�c�B";
		close;
	}
}

moro_vol.gat,104,70,4	script	���łɂȂ�������	887,{
	if(FVOL_1QUE > 16) {
		mes "[���łɂȂ�������]";
		mes "�ӂ��c�c�ӂ��c�c�B";
		next;
		mes "�]���͗��������Ė����Ă���]";
		close;
	}
	mes "[���łɂȂ�������]";
	mes "���c�c�����c�c";
	if(FVOL_1QUE != 16)
		close;
	next;
	mes "�]���łɂȂ������҂�";
	mes "�@�\�j�A�̌s��H�ׂ�������A";
	mes "�@��F���悭�Ȃ����]";
	set FVOL_1QUE,17;
	chgquest 11360,11361;
	close;
}

moro_vol.gat,101,72,4	script	����	585,{
	mes "[����]";
	mes "���c�c�������c�c";
	close;
}

moro_vol.gat,101,74,4	script	����	441,{
	mes "[����]";
	mes "���������c�c";
	close;
}

moro_vol.gat,103,71,6	script	����	584,{
	mes "[����]";
	mes "�����c�c�����c�c";
	close;
}

moro_vol.gat,106,69,4	script	����	585,{
	mes "[����]";
	mes "�����c�c���c�c";
	close;
}

//============================================================
// �ŖS�j�����c�N�G�X�g
//- Registry -------------------------------------------------
// FVOL_2QUE -> 0�`13
//------------------------------------------------------------
moro_vol.gat,131,103,3	script	���Ԓn������#bl	419,{
	viewpoint 2,1,1,4,0xFFFFFF;
	switch(FVOL_2QUE) {
	case 0:
		mes "[���Ԓn������]";
		mes "���Ȃ����C�t���܂������H";
		mes "�����ł��A���̎��ӂɐ������Ă���";
		mes "�����X�^�[�B�͉��������������B";
		next;
		mes "[���Ԓn������]";
		mes "�~�b�h�K���h�ł��ꕔ�n��ł���";
		mes "���鎖���o���Ȃ������X�^�[�B���A";
		mes "���炩�̌����ŕω�������Ԃ�";
		mes "���̎��ӂ𓮂�����Ă���B";
		next;
		mes "[���Ԓn������]";
		mes "����ɖ��Ȃ̂͏��X�ɂ��̐���";
		mes "�����Ă��邱�ƂȂ�ł��B";
		mes "��炪�����I�Ɋ댯�ȓ_�ȊO�ɂ��A";
		mes "�ǂ̂悤�ȊQ��^���邩��";
		mes "�������Ȃ���΂Ȃ�Ȃ��̂ł����c�c�B";
		next;
		mes "[���Ԓn������]";
		mes "�݂�ȖZ������";
		mes "���߂����Ȑl�����܂���c�c�B";
		mes "�}���̒����Ȃ̂Ɂc�c�B";
		if(BaseLevel < 140) {
			next;
			mes "�]^0000FF�ŖS�j�����c^000000��";
			mes "�@^FF0000BaseLv140�ȏ�^000000����";
			mes "�@�J�n���邱�Ƃ��ł���N�G�X�g�ł��]";
			close;
		}
		next;
		switch(select("�����N���Ă����ł����H","���ڂ������ǂ��ł����H","����`�����܂��傤���H")) {
		case 1:
			mes "[���Ԓn������]";
			mes "�����̊����s�����";
			mes "�������Ȃ��Ȃ��i�݂܂���B";
			mes "�����͌������Ƃ�����悤��";
			mes "���߂ĖK�ꂽ�悤�ȋC�����邵�A";
			mes "���ł������Ȋ낤��������Ȃ���";
			mes "�����鏊�ɖ���������������B";
			next;
			mes "[���Ԓn������]";
			mes "���Ȃ񂾁c�c";
			mes "�������������̐��͉̂����낤�c�c�B";
			close;
		case 2:
			mes "[���Ԓn������]";
			mes "�������������ǁA";
			mes "���͒����S���Ȃ̂ł��B";
			mes "�퓬�ɂ��s�����Ȃ��̂Łc�c�B";
			mes "�w�������ł��܂���B";
			emotion 4,"";
			close;
		case 3:
			mes "[���Ԓn������]";
			mes "�{���ł����H�@���肪����!!";
			mes "���Ђ��肢���܂��I�@����ł́c�c";
			mes "�����X�^�[�̒��ł��Ƃ�킯�댯������";
			mes "^0000FF�t���C���R���h��^000000�̒������������̂�";
			mes "����`�������肢�������ł��B";
			next;
			mes "[���Ԓn������]";
			mes "�t���C���R���h����";
			mes "�����炩�����o���Ȃ����";
			mes "���ƂȂ����̂ł����A";
			mes "��������΂��t���Ă���K���ɐG����";
			mes "�S���O�T�Ԃ̑�₯�ǂł��B";
			next;
			menu "�ł͂����߂܂��Ă��܂��傤���B",-;
			mes "[���Ԓn������]";
			mes "�����A�߂܂��Ă�����";
			mes "��������ςł��ˁc�c�B";
			mes "�������ړI������A";
			mes "^0000FF�t���C���R���h��^000000�̑̂ɕt���Ă���";
			mes "^FF0000�΂̂����H^000000��15�ق�";
			mes "�����Ă��Ă��������B";
			next;
			if(select("�����Z�����ł��I","�p�ӂ��ė��܂��B") == 1) {
				mes "[���Ԓn������]";
				mes "�����ł����B";
				mes "�c�O�ł��B";
				close;
			}
			mes "[���Ԓn������]";
			mes "���肪�Ƃ��������܂��I";
			mes "������Q�҂������Ă���̂�";
			mes "�ł������}���ŉ������I";
			mes "���肢���܂�!!";
			set FVOL_2QUE,1;
			setquest 1264;
			close;
		}
	case 1:
		if(countitem(6691) < 15) {
			mes "[���Ԓn������]";
			mes "���Ȃ����撣����";
			mes "^0000FF�t���C���R���h��^000000��";
			mes "^FF0000�΂̂����H^000000��15��";
			mes "�W�߂Ă��Ă����Ǝv��������A";
			mes "���������B���ً}���W����";
			mes "�����܂������c�c�B";
			next;
			mes "[���Ԓn������]";
			mes "�܂��W�܂��ĂȂ��̂ł��ˁc�c�B";
			mes "�����ł��҂����Ă��܂��̂�";
			mes "�ł������}���ŉ������I";
			mes "���肢���܂�!!";
			close;
		}
		mes "[���Ԓn������]";
		mes "^FF0000�΂̂����H^000000��";
		mes "15�W�߂Ă�����ł��ˁH";
		mes "�������ŏ\���Ȓ�����";
		mes "�i�߂���Ǝv���܂��B";
		next;
		mes "[���Ԓn������]";
		mes "�������A�΂�_���邱�Ƃ�";
		mes "�o����悤�ɂȂ������Ƃ��������ł��B";
		emotion 21;
		next;
		mes "[���Ԓn������]";
		mes "���Ȃ��c�c";
		mes "���������Ď��̕\���A";
		mes "�����������Ă���Y�݂�";
		mes "�ǂݎ��܂����ˁH";
		next;
		switch(select("���̂��Ƃł����H","�ŏ�����C�Â��Ă��܂����I")) {
		case 1:
			mes "[���Ԓn������]";
			mes "�c�c���҂��Ă��������ł�";
			mes "����܂���ł������A";
			mes "�߂����ɏ������Ă������b��";
			mes "�����܂��c�c�I";
			next;
			mes "[���Ԓn������]";
			mes "�t���C�����@���[��т��@�ɍs����";
			break;
		case 2:
			mes "[���Ԓn������]";
			mes "�f���炵���c�c�B";
			next;
			mes "[���Ԓn������]";
			mes "���́A";
			mes "�t���C�����@���[��т̒�@�ɍs����";
			break;
		}
		mes "���m���߂��Ă��Ȃ��̂ł��B";
		mes "�����N���Ă���̂�";
		mes "���ׂĂ��Ă��炦�܂��񂩁H";
		next;
		if(select("�Z�����ł�","������܂���") == 1) {
			mes "[���Ԓn������]";
			mes "�����ł����B";
			mes "�c�O�ł��B";
			close;
		}
		mes "[���Ԓn������]";
		mes "���肪�Ƃ��������܂��I";
		mes "���m�́A�k����";
		mes "�����X�^�[�����W���Ă���n���";
		mes "���������͂��ł��B";
		mes "������悭���ׂȂ����@����";
		mes "�����ĉ������B";
		delitem 6691,15;
		set FVOL_2QUE,2;
		chgquest 1264,1265;
		viewpoint 1,234,301,5,0xFF0000;
		close;
	case 2:
	case 3:
		mes "[���Ԓn������]";
		mes "��@����T���ɍs���Ă�������̂ɁA";
		mes "�ǂ����Ď��̑O��T���Ă����ł����H";
		next;
		mes "[���Ԓn������]";
		mes "������@����T���Ă��ĉ������B";
		mes "�ނ́A�k����";
		mes "�����X�^�[�����W���Ă���n���";
		mes "���������͂��ł��B";
		mes "��낵�����肢���܂��ˁB";
		viewpoint 1,234,301,5,0xFF0000;
		close;
	case 4:
		mes "[���Ԓn������]";
		mes "��@����������܂������I";
		mes "���͕������ċx��ł��邪";
		mes "���ɕʏ�͂Ȃ��A";
		mes "�p�g���[��������";
		mes "�}���ō���Ă���ƁH";
		next;
		mes "[���Ԓn������]";
		mes "�����ł����A���肪�Ƃ��������܂��B";
		mes "����ŕs���̎킪�����܂�����B";
		mes "����ɂ��Ă��A�������Ă���̂�";
		mes "�����ɓ������܂Ƃ߂Ă���Ȃ�āc�c�B";
		mes "�Ȃ�ďo���������Ȃ񂾁c�c!!";
		emotion 21;
		emotion 4,"";
		next;
		mes "[���Ԓn������]";
		mes "��@���̖��͉��������̂ŁA";
		mes "���̖��ɂ�����";
		mes "���͂��Ăق����̂ł����c�c�B";
		next;
		mes "[���Ԓn������]";
		mes "�����t���C�����@���[�ł�";
		mes "���̕s���̃����X�^�[�B��";
		mes "�����Ă��鎖�͒m���Ă��܂���ˁH";
		next;
		menu "�m���Ă���",-;
		mes "[���Ԓn������]";
		mes "��炪�O�̐��E�ɏo�Ă��܂��A";
		mes "�O�̃����X�^�[�ƐڐG����ƁA";
		mes "���\��������A";
		mes "�v���I�ȃE�B���X���L�߂���ƁA";
		mes "���͂ȓˑR�ψق��N�����A";
		mes "�[���Ȏ��ԂɊׂ�\��������܂��B";
		next;
		mes "[���Ԓn������]";
		mes "�����Ŏ��}�����Ȃ��ɂ�";
		mes "���̌̐���";
		mes "���炵�Ăق����̂ł��B";
		next;
		mes "[���Ԓn������]";
		mes "^0000FF�t���C���T���h�}��^000000��";
		mes "^0000FF�t���C���t�����h��^000000�����ꂼ��";
		mes "20�C���ގ����ĉ������B";
		next;
		if(select("���ڂ������ǂ��ł����H","�撣���ē|���܂��I") == 1) {
			mes "[���Ԓn������]";
			mes "���̑O���b�����Ǝv���܂����A";
			mes "���͒����S���Ȃ̂ł��B";
			mes "�퓬�ɂ��s�����Ȃ��̂Łc�c�B";
			mes "�w�������ł��Ȃ��̂ł��B";
			emotion 19,"";
			close;
		}
		mes "[���Ԓn������]";
		mes "�}���ł��������B";
		mes "�������Ă���Ԃɂ�";
		mes "�����X�^�[�B�͑����Ă��܂��B";
		set FVOL_2QUE,5;
		chgquest 1267,1268;
		setquest 1269;
		close;
	case 5:
		if(!(checkquest(1268) & 0x4) || !(checkquest(1269) & 0x4)) {
			mes "[���Ԓn������]";
			mes "�}���ł��������B";
			mes "�������Ă���Ԃɂ�";
			mes "�����X�^�[�B�͑����Ă��܂��B";
			next;
			mes "[���Ԓn������]";
			mes "^0000FF�t���C���T���h�}��^000000��";
			mes "^0000FF�t���C���t�����h��^000000�����ꂼ��";
			mes "20�C���ގ����ĉ������B";
			close;
		}
		mes "[���Ԓn������]";
		mes "^0000FF�t���C���T���h�}��^000000��";
		mes "^0000FF�t���C���t�����h��^000000�����ꂼ��";
		mes "20�C���|�����悤�ł��ˁB";
		next;
		mes "[���Ԓn������]";
		mes "����J�l�ł����B";
		mes "���Ȃ����撣���Ă��ꂽ��������";
		mes "������x�����̃����X�^�[�ւ�";
		mes "�Ή����@���킩���Ă��܂����B";
		next;
		mes "[���Ԓn������]";
		mes "����͎��̕���������";
		mes "���ڂ����̃����X�^�[�B��";
		mes "�������܂��B";
		mes "���Ȃ��͖k���̕��ɏW�܂��Ă���";
		mes "�������W�c�̑Ή������肢���܂��B";
		next;
		mes "[���Ԓn������]";
		mes "���̏W�c�͂��������ǂ�����";
		mes "�W�܂��ė����񂾂낤�c�c�H";
		mes "�ǂ����Ă���ȏW�c�܂�";
		mes "���������ꂵ�߂��ł��傤�B";
		emotion 28;
		set FVOL_2QUE,6;
		delquest 1268;
		delquest 1269;
		setquest 1297;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		viewpoint 1,91,197,6,0xFF0000;
		close;
	case 13:
		mes "[���Ԓn������]";
		mes "���̉������A����";
		mes "�R�̂悤�ɂ��ƂȂ����Ȃ�܂����B";
		mes "������������������ł����H";
		mes "�܂��������ŔY�݂̎킪";
		mes "�����܂����B";
		mes "���肪�Ƃ��������܂����B";
		close;
	default:
		mes "[���Ԓn������]";
		mes "�����X�^�[�����͎��B�ɔC���ĉ������B";
		mes "���Ȃ��͖k���̕��ɏW�܂��Ă���";
		mes "�������W�c�̑Ή������肢���܂��B";
		next;
		mes "[���Ԓn������]";
		mes "���̏W�c�͂��������ǂ�����";
		mes "�W�܂��ė����񂾂낤�c�c�H";
		mes "�ǂ����Ă���ȏW�c�܂�";
		mes "���������ꂵ�߂��ł��傤�B";
		emotion 28;
		viewpoint 1,91,197,6,0xFF0000;
		close;
	}
OnInit:
	waitingroom "�ŖS�j�����c",0;
	end;
}

moro_vol.gat,234,301,3	script	��@��#bl	413,{
	viewpoint 2,1,1,5,0xFFFFFF;
	switch(FVOL_2QUE) {
	case 2:
		mes "[��@��]";
		mes "�ǂ����Ă���܂����I";
		mes "���傤�Ǐ������ق����Ƃ���ł����B";
		next;
		mes "[��@��]";
		mes "���͂����Ŋ댯��`���Ă܂�";
		mes "��@���s���Ă����̂ł����A";
		mes "�����X�^�[�̏W�c����U����";
		mes "�󂯂Ă��܂��A���傤���Ȃ�";
		mes "�����ŋx��ł��܂����B";
		next;
		if(select("�ꏏ�ɖ߂�܂��傤","�x�݂̑������ǂ����I") == 2) {
			mes "[��@��]";
			mes "���������߂���̂�����";
			mes "�����܂����ˁI";
			close;
		}
		mes "[��@��]";
		mes "�߂肽���̂͂�܂�܂Ȃ̂ł����c�c�B";
		mes "����͑債�����ƂȂ��̂ł����A";
		mes "^0000FF�t���C���T���h�}��^000000��";
		mes "����^FF0000�p�g���[������^000000��";
		mes "�����čs���Ă��܂��܂����B";
		next;
		mes "[��@��]";
		mes "^FF0000�p�g���[������^000000���Ȃ���";
		mes "���Ԓn�ɖ߂��Ă��{���邵�c�c�B";
		next;
		mes "[��@��]";
		mes "�ǂ��ł����H";
		mes "���ɋ��͂��Ă��������C������";
		mes "�N���Ă����񂶂�Ȃ��ł����H";
		next;
		if(select("���͂������ł�","�ʂɁc�c") == 2) {
			mes "[��@��]";
			mes "�����ł����B";
			mes "�Ȃ炻���Ȃ�܂�";
			mes "���͂���������Ƌx�݂܂��B";
			close;
		}
		mes "[��@��]";
		mes "�����ł��傤�����ł��傤�B";
		mes "�ł�^0000FF�t���C���T���h�}��^000000����";
		mes "^FF0000�p�g���[������^000000�����߂��Ă��������B";
		next;
		mes "[��@��]";
		mes "�����͊��݂���ăo���o����";
		mes "�Ȃ��Ă��܂����̂ŁA�m�F���ł���悤��";
		mes "^FF0000�p�g���[������^00000020�����x";
		mes "�W�߂Ă��ĉ������B";
		set FVOL_2QUE,3;
		chgquest 1265,1266;
		close;
	case 3:
		if(countitem(6692) < 20) {
			mes "[��@��]";
			mes "�ł�^0000FF�t���C���T���h�}��^000000��|����";
			mes "^FF0000�p�g���[������^00000020����";
			mes "���߂��Ă��������B";
			close;
		}
		mes "[��@��]";
		mes "����^FF0000�p�g���[������^00000020����";
		mes "�S���W�߂ė�����ł����H";
		mes "����Ȃɑ����W�܂�Ȃ�";
		mes "100�����߂΂悩�������ȁB";
		next;
		mes "[��@��]";
		mes "�����Ƃ�����A������܂����B";
		mes "���肪�Ƃ��������܂��B�������A";
		mes "�߂��Ă���{���邩���ƍl����ƁA";
		mes "������Ɠ����ɂ��Ȃ��Ă��܂��ˁB";
		next;
		mes "[��@��]";
		mes "�p�g���[�������𐮗����Ă���";
		mes "�s���̂ŁA�������l�ɂ�";
		mes "�����`���ĉ������B";
		mes "�����A���������ꂽ���͓����ł���I";
		delitem 6692,20;
		set FVOL_2QUE,4;
		chgquest 1266,1267;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		viewpoint 1,131,103,4,0xFF0000;
		close;
	case 4:
		mes "[��@��]";
		mes "�p�g���[�������𐮗����Ă���";
		mes "�s���̂ŁA�������l�ɂ�";
		mes "�����`���ĉ������B";
		mes "�����A���������ꂽ���͓����ł���I";
		viewpoint 1,131,103,4,0xFF0000;
		close;
	default:
		mes "[��@��]";
		mes "�����X�^�[�𒲍����ł��B";
		mes "����Ȋ댯�ȏꏊ������l��";
		mes "�������낾�Ȃ�āA����܂肾�I";
		close;
	}
}

moro_vol.gat,91,197,3	script	�ŖS�j�����c����#bl	10021,{
	viewpoint 2,1,1,6,0xFFFFFF;
	switch(FVOL_2QUE) {
	case 6:
		mes "[�ŖS�j�����c����]";
		mes "���悢��R���̓������������I";
		mes "�ŖS�I�@�j���I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�ŁI�@�S�I�@�j�I�@���I";
		mes "�ŁI�@�S�I�@�j�I�@���I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�S�I�@�S�I�@�ŖS�ŖS�I";
		mes "���I�@���I�@�������j���I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�����������̊�̒��Ɉē�����I";
		mes "�������͐_����I�΂ꂽ�I";
		mes "�ŖS���{�i�I�Ɏn�܂���I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�������������B��I";
		mes "�j�����󂯂�I";
		mes "�ŖS�I�@�j���I";
		next;
		switch(select("�Ȃ�̐_��M���Ă����ł����H","���Ȃ��B�͒N�ł����H","�������S�ȏꏊ�Ɉړ����ĉ������I")) {
		case 1:
			mes "[�ŖS�j�����c����]";
			mes "�������͖ŖS�̐_�Ɏd���Ă���I";
			mes "���̖ŖS�ǂ��납���ׂẲF����";
			mes "�ŖS������̑�Ȑ_�ł���I";
			close;
		case 2:
			mes "[�ŖS�j�����c����]";
			mes "�������͖ŖS�j�����c���I";
			mes "������MSK�ƌĂԎ҂�����B";
			mes "�ŖS�̐_�Ɏd���Ă��āA";
			mes "�S���E�̖ŖS���F���Ă���B";
			next;
			mes "[�ŖS�j�����c����]";
			mes "���ׂĂ��ŖS���n�߂邱�Ƃ�";
			mes "�������͏j�����󂯂邱�Ƃ��ł���I";
			next;
			mes "[�ŖS�j�����c����]";
			mes "������ꏊ�Ŕ������ꂽ";
			mes "�����̋��Ԃ����ׂĂ�����Ă���I";
			mes "��{���ŗ����Ęb���L��";
			mes "�����l�c�c�B";
			next;
			mes "[�ŖS�j�����c����]";
			mes "���̂��ׂĂ��ŖS�� ";
			mes "�\�����Ă���I";
			mes "�����A�ŖS�̎��������I";
			mes "�ŖS�I�@�j���I";
			close;
		case 3:
			break;
		}
		mes "[�ŖS�j�����c����]";
		mes "�����Ȃ�A��ƁH";
		mes "�悤�₭�ŖS�̎����K���Ƃ����̂ɁI";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�������͋A��Ȃ����I";
		mes "�������̊�̒��ɓ����I";
		mes "�������͖ŖS�̐_�ɑI�΂�Ă��邩��";
		mes "�N�����ƈ���Ĉ��S�Ȃ񂾂�I";
		next;
		menu "�ؖ��ł��܂����H",-;
		mes "[�ŖS�j�����c����]";
		mes "���������^���Ƃ́I";
		mes "������ł��ؖ����Ă݂��Ă��I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "���̖ŖS�̑�n�ɎU��΂��Ă���";
		mes "^FF0000�u���X�X�g�[��^000000��40�W�߂�";
		mes "�������ɓ����Ă݂�I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�������̑̂ɓ�����u�ԁA";
		mes "�|���I�@�ƉԂт�ɕς�邾�낤�I";
		mes "�ŖS�I�@�j���I";
		next;
		menu "�ŖS�̑�n�H",-;
		mes "[���Ԓn �ԑ�]";
		mes "�����t���C�����@���[�����̎҂�����";
		mes "����ɖŖS�̑�n��";
		mes "�Ă�ł��܂��B";
		next;
		mes "[���Ԓn �ԑ�]";
		mes "^FF0000�u���X�X�g�[��^000000�Ƃ����̂�";
		mes "^0000FF�t���C���S�[����^000000�̑̂ɕt�����Ă���";
		mes "���ʂ̐΂ł��B";
		next;
		mes "[���Ԓn �ԑ�]";
		mes "�ނ�𐳋C�ɖ߂��ɂ́A����������";
		mes "�Ԉ���Ă��邱�Ƃ��킩���Ă��炤����";
		mes "�Ȃ��悤�ł��B�ނ�̌����Ƃ���A";
		mes "^0000FF�t���C���S�[����^000000��|����";
		mes "^FF0000�u���X�X�g�[��^00000040���W�߂Ă��܂����H";
		next;
		if(select("�W���Ȃ����Ƃɂ���I","�u���X�X�g�[�����W�߂悤�B") == 1) {
			mes "[�ŖS�j�����c����]";
			mes "���̂ƂĂ��Ȃ����i������";
			mes "�ŖS�̐_�̑��݂�M���Ă��܂��̂�";
			mes "�|���̂ł��ˁI�@�ނ��ĉ������I";
			mes "�ŖS�I�@�j���I";
			close;
		}
		mes "[�ŖS�j�����c����]";
		mes "�������A�ł�^FF0000�u���X�X�g�[��^000000��";
		mes "�������ɓ����Ă݂�I";
		mes "�Ԃт�ɂȂ藎����͂����I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "��Ղ�ڂ̓�����ɂ����N��";
		mes "�����ċ����𐿂��Ȃ���A";
		mes "�ŖS�j�����c�̐M�҂ɂȂ肽����";
		mes "�������낤�I";
		set FVOL_2QUE,7;
		chgquest 1297,1270;
		close;
	case 7:
		if(countitem(6693) < 40) {
			mes "[�ŖS�j�����c����]";
			mes "�����A�ŖS�̑�n�ɎU��΂��Ă���";
			mes "^FF0000�u���X�X�g�[��^000000��40�W�߂�";
			mes "�������ɓ����Ă݂�I";
			next;
			mes "[�ŖS�j�����c����]";
			mes "�������̑̂ɓ�����u�ԁA";
			mes "�|���I�@�ƉԂт�ɕς�邾�낤�I";
			mes "�ŖS�I�@�j���I";
			next;
			mes "�]^0000FF�t���C���S�[����^000000��|����";
			mes "�@^FF0000�u���X�X�g�[��^00000040���W�߂Ă��悤�]";
			close;
		}
		mes "[�ŖS�j�����c����]";
		mes "^FF0000�u���X�X�g�[��^00000040���W�߂Ă����̂��I";
		mes "�������A�������͊���";
		mes "�������ł��Ă���B";
		mes "�������̐΂𓊂��Ă݂�I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�N�����ɂ͗����ł��Ȃ���Ղ�";
		mes "�ڂ̓�����ɂ��邱�ƂɂȂ�I";
		mes "�����A�����Ă݂�I";
		mes "�v�����蓊���Ă݂�I";
		mes "�ŖS�I�@�j���I";
		next;
		mes "�q���[���I�@�q���[���I�@�q���[���I";
		mes "�q���[���I�@�q���[���I�@�q���[���I";
		next;
		mes "�q���[���I�@�q���[���I�@�q���[���I";
		mes "�q���[���I�@�q���[���I�@�q���[���I";
		mes "�q���[���I�@�q���[���I�@�q���[���I";
		mes "�q���[���I�@�q���[���I�@�q���[���I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "������I";
		emotion 19,"�ŖS�j�����c����#bl";
		emotion 19,"�ŖS�j�����c������#bl";
		emotion 28,"�ŖS�j�����c�M��#bl1";
		emotion 19,"�ŖS�j�����c�M��#bl2";
		emotion 19,"�ŖS�j�����c�M��#bl3";
		emotion 28,"�ŖS�j�����c�M��#bl4";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "������I";
		mes "���킠���I";
		emotion 19,"�ŖS�j�����c����#bl";
		emotion 19,"�ŖS�j�����c������#bl";
		emotion 28,"�ŖS�j�����c�M��#bl1";
		emotion 19,"�ŖS�j�����c�M��#bl3";
		emotion 28,"�ŖS�j�����c�M��#bl4";
		emotion 19,"�ŖS�j�����c�M��#bl6";
		emotion 28,"�ŖS�j�����c�M��#bl7";
		emotion 19,"�ŖS�j�����c�M��#bl9";
		emotion 28,"�ŖS�j�����c�M��#bl0";
		emotion 19,"�ŖS�j�����c�M��#bl12";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "���������I";
		mes "�q�C�C�A�q�C�z�[�I";
		emotion 19,"�ŖS�j�����c����#bl";
		emotion 19,"�ŖS�j�����c������#bl";
		emotion 28,"�ŖS�j�����c�M��#bl1";
		emotion 4,"�ŖS�j�����c�M��#bl2";
		emotion 19,"�ŖS�j�����c�M��#bl3";
		emotion 28,"�ŖS�j�����c�M��#bl4";
		emotion 4,"�ŖS�j�����c�M��#bl5";
		emotion 19,"�ŖS�j�����c�M��#bl6";
		emotion 28,"�ŖS�j�����c�M��#bl7";
		emotion 19,"�ŖS�j�����c�M��#bl8";
		emotion 19,"�ŖS�j�����c�M��#bl9";
		emotion 28,"�ŖS�j�����c�M��#bl0";
		emotion 19,"�ŖS�j�����c�M��#bl11";
		emotion 19,"�ŖS�j�����c�M��#bl12";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�ɂ��I";
		mes "�ƂĂ��ɂ��I";
		mes "��߂�I";
		mes "���̊�ɏƏ������킹��񂶂�Ȃ��I";
		mes "�������ɂ�߂�I";
		next;
		switch(select("�S��������","��߂�")) {
		case 1:
			mes "[�ŖS�j�����c�M��]";
			mes "�킠�I";
			mes "���̊z�I";
			mes "�����A�ӂ��I";
			emotion 19,"�ŖS�j�����c����#bl";
			emotion 19,"�ŖS�j�����c������#bl";
			emotion 28,"�ŖS�j�����c�M��#bl1";
			emotion 19,"�ŖS�j�����c�M��#bl2";
			emotion 19,"�ŖS�j�����c�M��#bl3";
			emotion 28,"�ŖS�j�����c�M��#bl4";
			next;
			mes "[�ŖS�j�����c�M��]";
			mes "�ق����I";
			mes "���̕@�I";
			mes "���Ⴀ�I�@���Ⴀ�I";
			emotion 19,"�ŖS�j�����c����#bl";
			emotion 19,"�ŖS�j�����c������#bl";
			emotion 28,"�ŖS�j�����c�M��#bl1";
			emotion 4,"�ŖS�j�����c�M��#bl2";
			emotion 19,"�ŖS�j�����c�M��#bl3";
			emotion 28,"�ŖS�j�����c�M��#bl4";
			emotion 4,"�ŖS�j�����c�M��#bl5";
			emotion 19,"�ŖS�j�����c�M��#bl6";
			emotion 28,"�ŖS�j�����c�M��#bl7";
			emotion 19,"�ŖS�j�����c�M��#bl8";
			emotion 19,"�ŖS�j�����c�M��#bl9";
			emotion 28,"�ŖS�j�����c�M��#bl0";
			emotion 19,"�ŖS�j�����c�M��#bl11";
			emotion 19,"�ŖS�j�����c�M��#bl12";
			next;
			mes "[�ŖS�j�����c����]";
			mes "�ɂ��I";
			mes "���`���N�`���ɂ��I";
			mes "�܂��������o���Ă��Ȃ��̂�";
			mes "������񂶂�Ȃ��I";
			mes "�҂��āI�@��蒼���I";
			close;
		case 2:
			mes "�]�|���I�@�ƉԂт�ɕς��ǂ��납";
			mes "�@������I�@�Ƃ����ߖ�����";
			mes "�@�ӂ�ɖ苿�����B";
			mes "�@�Γ�������߂悤�]";
			delitem 6693,40;
			set FVOL_2QUE,8;
			chgquest 1270,1271;
			close;
		}
	case 8:
		mes "[�ŖS�j�����c����]";
		mes "�Z�킽����A���������Ă���I";
		mes "�ْ[�҂��Ⴄ�΂������Ă���";
		mes "�����x�����񂾁I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "����ς�I";
		mes "����Ȃ��Ƃ��낤�Ǝv�����I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "���`";
		mes "���`";
		emotion 32,"�ŖS�j�����c����#bl";
		emotion 32,"�ŖS�j�����c������#bl";
		emotion 6,"�ŖS�j�����c�M��#bl1";
		emotion 6,"�ŖS�j�����c�M��#bl2";
		emotion 6,"�ŖS�j�����c�M��#bl3";
		emotion 6,"�ŖS�j�����c�M��#bl4";
		emotion 6,"�ŖS�j�����c�M��#bl5";
		emotion 6,"�ŖS�j�����c�M��#bl6";
		emotion 6,"�ŖS�j�����c�M��#bl7";
		emotion 6,"�ŖS�j�����c�M��#bl8";
		emotion 6,"�ŖS�j�����c�M��#bl9";
		emotion 6,"�ŖS�j�����c�M��#bl0";
		emotion 6,"�ŖS�j�����c�M��#bl11";
		emotion 6,"�ŖS�j�����c�M��#bl12";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�ْ[�҂�A�ڋ��҂�I";
		mes "������x���Ȃ��ɖ�����I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�ŖS�̑�n��f�r���Ă���";
		mes "���b�̌��������Ă��Ȃ����I";
		mes "���͂�������ނ��Ƃ�";
		mes "�󒆕��V���\�ɂȂ�B";
		mes "�����ČN��𓱂��Ă��I";
		next;
		mes "[���Ԓn �ԑ�]";
		mes "���ށc�c�����t���C�����@���[�ɂ���";
		mes "^0000FF�t���C���t�����h��^000000��";
		mes "^0000FF�t���C���T���h�}��^000000����";
		mes "^FF0000���b�̌�^000000���W�߂Ă���";
		mes "�Ƃ������Ƃł��ˁB";
		mes "30�قǂ���Ώ\���ł��傤�B";
		next;
		if(select("�W���Ȃ��悤�ɂ���I","���b�̌����W�߂悤") == 1) {
			mes "[�ŖS�j�����c����]";
			mes "��������Ǝv������I";
			mes "����ς�ŖS�̐_�̑��݂�";
			mes "�M���Ă��܂����Ƃ����낵���񂾂ȁH";
			next;
			mes "[�ŖS�j�����c����]";
			mes "�ז����Ȃ��ł������ɍs���Ă���I";
			mes "�ŖS�I�@�j���I";
			close;
		}
		mes "[�ŖS�j�����c����]";
		mes "���b�̌��𑁂������Ă��Ȃ����I";
		mes "�߂Â������őS�g���k���鋰�낵��";
		mes "^0000FF�t���C���t�����h��^000000��";
		mes "^0000FF�t���C���T���h�}��^000000��|����";
		mes "^FF0000���b�̌�^000000��30�W�߂Ă���񂾁I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�ƂĂ��댯�Ȏ��Ȃ񂾂��I";
		mes "���̂܂ܓ����Ă����";
		mes "�K���ɂ��܂�������������Ȃ��̂Ɂc�c";
		mes "�����Ȃ���������|���Ă��邵��";
		mes "�Ȃ��Ȃ��Ă��܂����ȁI";
		mes "��͂͂͂́c�c�B";
		set FVOL_2QUE,9;
		chgquest 1271,1272;
		close;
	case 9:
		if(countitem(6694) < 30) {
			mes "[�ŖS�j�����c����]";
			mes "���b�̌��𑁂������Ă��Ȃ����I";
			mes "�߂Â������őS�g���k���鋰�낵��";
			mes "^0000FF�t���C���t�����h��^000000��";
			mes "^0000FF�t���C���T���h�}��^000000��|����";
			mes "^FF0000���b�̌�^000000��30�W�߂Ă���񂾁I";
			next;
			mes "[�ŖS�j�����c����]";
			mes "�ƂĂ��댯�Ȏ��Ȃ񂾂��I";
			mes "���̂܂ܓ����Ă����";
			mes "�K���ɂ��܂�������������Ȃ��̂Ɂc�c";
			mes "�����Ȃ���������|���Ă��邵��";
			mes "�Ȃ��Ȃ��Ă��܂����ȁI";
			mes "��͂͂͂́c�c�B";
			close;
		}
		mes "[�ŖS�j�����c����]";
		mes "�ƂĂ��ɂȈْ[�҂�I";
		mes "�����^FF0000���b�̌�^000000���W�߂ė����̂��I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "��������ƌ��Ă����I";
		mes "�������������ς��ɑS�����݊�����";
		mes "�󒆕��V�ŉ񓚂��Ă�邼�I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "���������`";
		next;
		mes "[�ŖS�j�����c����]";
		mes "���������`";
		mes "���������`";
		next;
		mes "[�ŖS�j�����c����]";
		mes "���������`";
		mes "���������`";
		mes "���������`";
		next;
		mes "[�ŖS�j�����c����]";
		mes "��������c�c�B";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�Ԃ��Ԃ��c�c�B";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�c�c";
		mes "���������c�c�I";
		emotion 4,"�ŖS�j�����c����#bl";
		next;
		mes "�]�ŖS�j�����c����̊�F��";
		mes "�@�����Ȃ��čs���A�ނ���";
		mes "�@�������L���Y���Ă����c�c";
		mes "�@���傪���ق���]";
		emotion 28,"�ŖS�j�����c����#bl";
		delitem 6694,30;
		set FVOL_2QUE,10;
		chgquest 1272,1273;
		close;
	case 10:
	case 11:
		mes "�]����̑̂��爫�L������B";
		mes "�@����͉�������Ȃ��Ȃ����]";
		next;
		mes "�]�����傪����";
		mes "�@�w�������Ă���B";
		mes "�@�b�����Ă݂悤�]";
		close;
	case 12:
		mes "[�ŖS�j�����c����]";
		mes "�ӂ��c�c���ǂ܂��ŖS�͗��Ȃ������B";
		mes "�����Ƃɖ߂���";
		mes "�Y��ȕ��ɒ��ւ������c�c�B";
		next;
		mes "[�ŖS�j�����c����]";
		mes "���̓V�Вn�ς̎��ɁA������x�M�҂�";
		mes "�W�߂ĖŖS�̐_��K��";
		mes "�Ăяo���Ă��I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "����͂����ƁA�N������ۂ�";
		mes "�N�����Ă��ꂽ��������";
		mes "���̖ʖڂ��������B";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�M�ҒB�����̂��Ƃ��U�����ƌ�����";
		mes "�^���ĉ��������Ă��Ȃ������񂾁B";
		mes "�N�̂������ŏ��������A������������B";
		next;
		mes "[�ŖS�j�����c����]";
		mes "���̏W��J����鎞�ɂ�";
		mes "�N���K���Q�����āA";
		mes "�����̂悤�ȉ���ۂ�";
		mes "������x�N�����Ă���B���ނ��I";
		set FVOL_2QUE,13;
		chgquest 1275,201710;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		close;
	case 13:
		mes "[�ŖS�j�����c����]";
		mes "�N������ۂ�";
		mes "�N�����Ă��ꂽ��������";
		mes "���̖ʖڂ��������B";
		next;
		mes "[�ŖS�j�����c����]";
		mes "���̏W��J����鎞�ɂ�";
		mes "�N���K���Q�����āA";
		mes "�����̂悤�ȋC�ۈٕς�";
		mes "������x�N�����Ă���B���ނ��I";
		close;
	default:
		mes "[�ŖS�j�����c����]";
		mes "���悢��R���̓������������I";
		mes "�ŖS�I�@�j���I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�����������̊�̒��Ɉē�����I";
		mes "�������͐_����I�΂ꂽ�I";
		mes "�ŖS���{�i�I�Ɏn�܂���I";
		next;
		mes "[�ŖS�j�����c����]";
		mes "�������������B��I";
		mes "�j�����󂯂�I";
		mes "�ŖS�I�@�j���I";
		close;
	}
}

moro_vol.gat,95,195,3	script	�ŖS�j�����c������#bl	10022,{
	switch(FVOL_2QUE) {
	case 10:
		mes "[�ŖS�j�����c������]";
		mes "�ŖS�j�����c�M�ҒB��I";
		mes "���h����ȁA���������I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "�ǂ݂̂����������R�����n�܂�B ";
		mes "�������͏j�����󂯂邱�Ƃ�";
		mes "���܂��Ă���B";
		mes "�����牽���K�v���ƌ����̂��I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "�Ƃ��ɋF��A";
		mes "���̏ꏊ�ɏj���̔����Ăяo�����I";
		mes "�ŁI�@�S�I�@�ŖS�ŖS�I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�ŁI�@�S�I�@�ŖS�ŖS�I";
		mes "�ŁI�@�S�I�@�ŖS�ŖS�I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "�����A����������I�@���̗����";
		mes "^FF0000�t���C���S�[�����̊�̎�^000000��";
		mes "^FF0000�t���C���t�����h���̋݊�^000000��";
		mes "���ꂼ��30���悹��ꂽ�Ȃ�I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "�ڂ̑O�ɑ傫�ȏj���̔���";
		mes "�J���͂����I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�������`�I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "�M�ҒB��I";
		mes "�}���ł����̊댯�ȃ����X�^�[��";
		mes "�f��ŉ���|���Ă���̂ł��I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "^FF0000�t���C���S�[�����̊�̎�^000000��";
		mes "^FF0000�t���C���t�����h���̋݊�^000000��";
		mes "���ꂼ��30�����̑O��";
		mes "�����Ă��Ȃ����I";
		next;
		if(select("�ւ�肽���Ȃ�","�����W�߂Ă��܂��B") == 1) {
			mes "[�ŖS�j�����c������]";
			mes "���Ȃ����A�M�ҒB��I";
			mes "���̗⌌�Ȉْ[�҂�";
			mes "�ւ�肽���Ȃ��Ƃ����Ă���A";
			mes "����قǊ��������Ƃ͂Ȃ��B";
			next;
			mes "[�ŖS�j�����c������]";
			mes "�}���ł����ɐ������Ă��鋰�낵��";
			mes "�����X�^�[������f��œ|����";
			mes "�ޗ����W�߂Ă���̂ł��I";
			next;
			mes "[�ŖS�j�����c������]";
			mes "�|���H�@�킦�Ȃ��H";
			mes "�����J�����߂ɋ]���͂����̂ł��B";
			mes "���ꂸ�ɍs���Ȃ����I";
			emotion 19,"";
			close;
		}
		mes "[�ŖS�j�����c������]";
		mes "�����A�M�ҒB��I";
		mes "���ْ̈[�҂ɂ�����x����";
		mes "�j���̃`�����X��^���邱�Ƃɂ��悤�I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "�}����";
		mes "^FF0000�t���C���S�[�����̊�̎�^000000��";
		mes "^FF0000�t���C���t�����h���̋݊�^000000��";
		mes "���ꂼ��30�����̑O��";
		mes "�����Ă��Ȃ����I";
		set FVOL_2QUE,11;
		chgquest 1273,1274;
		close;
	case 11:
		if(countitem(6695) < 30 || countitem(6696) < 30) {
			mes "[�ŖS�j�����c������]";
			mes "�}����";
			mes "^FF0000�t���C���S�[�����̊�̎�^000000��";
			mes "^FF0000�t���C���t�����h���̋݊�^000000��";
			mes "���ꂼ��30�����̑O�܂Ŏ����Ă��Ȃ����I";
			close;
		}
		mes "[�ŖS�j�����c������]";
		mes "�����A�ŖS�j�����c�M�ҒB��I";
		mes "��ׁA�ޗ������ׂďW�܂������I";
		mes "�ŖS�I�@�ŖS�I�@�ŖS�ŖS�I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		next;
		mes "[�ŖS�j�����c������]";
		mes "�݂�ȂŋF�낤�I";
		mes "�����ɏj���̔���";
		mes "�Ăт���������Ȃ����I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�c�c";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "!!";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "���Ⴀ�����I";
		mes "�Ђ���فA�Ё[�فI";
		misceffect 183,"�ŖS�j�����c����#bl";
		misceffect 183,"�ŖS�j�����c������#bl";
		misceffect 183,"�ŖS�j�����c�M��#bl1";
		misceffect 183,"�ŖS�j�����c�M��#bl2";
		misceffect 183,"�ŖS�j�����c�M��#bl3";
		misceffect 183,"�ŖS�j�����c�M��#bl4";
		misceffect 183,"�ŖS�j�����c�M��#bl5";
		misceffect 183,"�ŖS�j�����c�M��#bl6";
		misceffect 183,"�ŖS�j�����c�M��#bl7";
		misceffect 183,"�ŖS�j�����c�M��#bl8";
		misceffect 183,"�ŖS�j�����c�M��#bl9";
		misceffect 183,"�ŖS�j�����c�M��#bl0";
		misceffect 183,"�ŖS�j�����c�M��#bl11";
		misceffect 183,"�ŖS�j�����c�M��#bl12";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "���Ⴀ�I";
		mes "�{���̖ŖS���I";
		mes "�݂�Ȏ���ł��܂��I�@���Ⴀ���I";
		misceffect 183,"�ŖS�j�����c����#bl";
		misceffect 183,"�ŖS�j�����c������#bl";
		misceffect 183,"�ŖS�j�����c�M��#bl1";
		misceffect 183,"�ŖS�j�����c�M��#bl2";
		misceffect 183,"�ŖS�j�����c�M��#bl3";
		misceffect 183,"�ŖS�j�����c�M��#bl4";
		misceffect 183,"�ŖS�j�����c�M��#bl5";
		misceffect 183,"�ŖS�j�����c�M��#bl6";
		misceffect 183,"�ŖS�j�����c�M��#bl7";
		misceffect 183,"�ŖS�j�����c�M��#bl8";
		misceffect 183,"�ŖS�j�����c�M��#bl9";
		misceffect 183,"�ŖS�j�����c�M��#bl0";
		misceffect 183,"�ŖS�j�����c�M��#bl11";
		misceffect 183,"�ŖS�j�����c�M��#bl12";
		next;
		mes "�]�ŖS�̐_�����邩�͂킩��Ȃ����A";
		mes "�@�ނ炾�����I�΂�ďj����";
		mes "�@�󂯂��̂ł͂Ȃ��������B";
		mes "�@�ŖS�j�����c�����";
		mes "�@������x�b�����Ă݂悤�]";
		delitem 6695,30;
		delitem 6696,30;
		set FVOL_2QUE,12;
		chgquest 1274,1275;
		close;
	case 12:
	case 13:
		mes "[�ŖS�j�����c������]";
		mes "�c�c�����|���c�c";
		mes "����������������";
		mes "�݂�Ȃ̖ڂ����邩�獢��ȁI";
		mes "�|������܂���";
		mes "�����悤�ɂ��悤�c";
		close;
	default:
		mes "[�ŖS�j�����c������]";
		mes "�ŖS�j�����c�M�҂�!";
		mes "�����ƋC���������߂ċF��܂��傤�I";
		mes "��I�@�]�I�@��]��]�I";
		next;
		mes "[�ŖS�j�����c�M��]";
		mes "�ŁI�@�S�I�@�ŖS�ŖS�I";
		mes "�ŁI�@�S�I�@�ŖS�ŖS�I";
		close;
	}
}

moro_vol.gat,85,196,7	script	�ŖS�j�����c�M��#bl1	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "�����`�|���I";
	mes "�ƂɋA�肽���I";
	close;
}

moro_vol.gat,87,193,7	script	�ŖS�j�����c�M��#bl2	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�S�I�@�S�I�@�ŖS�ŖS�I";
		mes "���I�@���I�@�������j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "����ȋ��낵�����Ƃ��N����Ȃ�āI";
	mes "�@�����Ă������Ɠ����Ȃ���I";
	close;
}

moro_vol.gat,90,191,7	script	�ŖS�j�����c�M��#bl3	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "����Əj�����󂯂���Ǝv��";
	mes "�S���Y������ɓn�����̂ɁI�I";
	next;
	mes "[�ŖS�j�����c�M��]";
	mes "�c�c";
	mes "���̐M�S���s�����Ă����̂��ȁc�c�H";
	close;
}

moro_vol.gat,93,189,7	script	�ŖS�j�����c�M��#bl4	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�S�I�@�S�I�@�ŖS�ŖS�I";
		mes "���I�@���I�@�������j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "���낵���I";
	mes "�Ȃ�Ă��Ƃ��I";
	close;
}

moro_vol.gat,83,193,7	script	�ŖS�j�����c�M��#bl5	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "���킠�������I";
	mes "������A�|���I";
	close;
}

moro_vol.gat,86,190,7	script	�ŖS�j�����c�M��#bl6	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "�����`�|���I";
	mes "�}�W�ŉƂɋA�肽���I";
	close;
}

moro_vol.gat,89,188,7	script	�ŖS�j�����c�M��#bl7	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�S�I�@�S�I�@�ŖS�ŖS�I";
		mes "���I�@���I�@�������j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "�������A�|���I";
	mes "����񂶂�Ȃ������I";
	close;
}

moro_vol.gat,93,185,7	script	�ŖS�j�����c�M��#bl8	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "�����`�|���I";
	mes "�}�W�ŉƂɋA�肽���I";
	mes "����̃o�J�I";
	close;
}

moro_vol.gat,81,197,7	script	�ŖS�j�����c�M��#bl9	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�S�I�@�S�I�@�ŖS�ŖS�I";
		mes "���I�@���I�@�������j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "��������ȏ�A";
	mes "�����M���邱�Ƃ��ł��Ȃ�!!";
	mes "��������ɂȂ��Ă��I";
	close;
}

moro_vol.gat,84,201,5	script	�ŖS�j�����c�M��#bl0	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�ŖS�I�@�j���I";
		mes "�ŖS�I�@�j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "�����`�|���I";
	mes "�}�W�ŉƂɋA�肽���I";
	close;
}

moro_vol.gat,97,187,5	script	�ŖS�j�����c�M��#bl11	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�S�I�@�S�I�@�ŖS�ŖS�I";
		mes "���I�@���I�@�������j���I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "�}�W�ŕ|����I";
	mes "�M�S������Ȃ����炩�H";
	mes "�����ƌ��[�����Ȃ��ƁI";
	close;
}

moro_vol.gat,82,189,7	script	�ŖS�j�����c�M��#bl12	10023,{
	if(FVOL_2QUE < 12) {
		mes "[�ŖS�j�����c�M��]";
		mes "�����A�ŖS�̐_��I";
		mes "�����A���̎��ɖŖS���I";
		mes "���̎������ɏj�����I";
		close;
	}
	mes "[�ŖS�j�����c�M��]";
	mes "�}�W�ŕ|����I";
	mes "�M�S������Ȃ�����H";
	mes "�����ƌ��[�����Ȃ��ƁI";
	close;
}

//============================================================
// �f�C���[�N�G�X�gNPC
//------------------------------------------------------------
moro_vol.gat,95,108,7	script	�q�V�G#143hisie01	623,{
	if(ECL_3QUE < 33) {	// �G�N���[�W���̉�
		if(checkquest(201730)) {	// ���_�a�U���ς݁H
			cutin "hisie01",2;
			mes "[�q�V�G]";
			mes "�ʂ��Ă�����";
			mes "�����̎��̂�T���o�����Ƃ�";
			mes "�ł���̂��H";
			mes "�����ɂ͌������Ƃ�����";
			mes "��������������c�c�B";
			next;
			mes "[�q�V�G]";
			mes "�܂������c�c";
			mes "���Ă��Ă����C����";
			mes "�Ȃ����̂ł͂Ȃ��ȁc�c�B";
			close2;
			cutin "hisie01",255;
			end;
		}
		cutin "hisie01",2;
		mes "[�q�V�G]";
		mes "�l�ԘA������̎҂��H";
		mes "���ɘA���ɋ��͂�";
		mes "�v������悤�Ȃ��Ƃ�";
		mes "�Ȃ��Ǝv�����c�c�B";
		next;
		mes "[�q�V�G]";
		mes "�������������";
		mes "�����ɂ��鑍�i�ߊ��A";
		mes "�A�W�t�ɒm�点�悤�B";
		close2;
		cutin "hisie01",255;
		end;
	}
	switch(FVOL_3QUE) {
	case 0:
		cutin "hisie01",2;
		mes "[�q�V�G]";
		mes "�S�Ă̌�����������";
		mes "�B��Ă���Ƃ����̂��ȁH";
		mes "�c�c�y���݂��B";
		next;
		mes "[�q�V�G]";
		mes "�����c�c�B";
		mes "�Ȃ����������ɂ���̂��H";
		mes "���āA�炾�ȁB";
		mes "�J���̑���ɗ��Ă���񂾁B";
		next;
		mes "[�q�V�G]";
		mes "�J���̓I�[�u�̖��͂̑����";
		mes "���߂Ă��邩��A����";
		mes "�G�N���[�W���𗣂���Ȃ��B";
		next;
		mes "[�q�V�G]";
		mes "�����ĉ�X�ɂ����Ƃ�";
		mes "�d�v�Ȃ̂̓C�O�h���V����";
		mes "���҂̈��J���B";
		mes "����ɐ��܂ꂽ�΂����";
		mes "�}�����������킯�ɂ͂����Ȃ��B";
		next;
		mes "[�q�V�G]";
		mes "���ɂ��F�X�Ȏ�������āA";
		mes "���V�B������������";
		mes "�������̎w���������Ă��邪�c�c";
		mes "���Ă̒ʂ�A";
		mes "���|���|���̒n�ʂ��B";
		next;
		menu "�G�C���@���g�͂ǂ��Ȃ����H",-;
		cutin "hisie02",2;
		mes "[�q�V�G]";
		mes "�G�C���@���g���c�c�B";
		mes "���́A�����̒m����";
		mes "���p�����Ă�����Ă���B";
		mes "�����ȒP�Ɋ�����̂�";
		mes "�������Ƃł͂Ȃ�����ˁB";
		next;
		mes "[�q�V�G]";
		mes "����ɂ���Ӗ��A������";
		mes "�V�i�C���ɗ��p���ꂽ�����Ƃ�";
		mes "�����Ȃ��͂Ȃ��B";
		mes "�����͈˗����ꂽ";
		mes "�I�[�u�̖��͂ɂ��ċ𒼂�";
		mes "�������Ă������������ȁB";
		next;
		mes "[�q�V�G]";
		mes "����𓥂܂��āA���V��ł�";
		mes "�G�C���@���g�̔\�͂������]�����A";
		mes "�ނ�ϋɓI�Ɋ��p���������";
		mes "����������Ă���B";
		mes "����ɂȂɂ��c�c";
		next;
		mes "�]�q�V�G�͐��̃g�[������i�K���Ƃ�";
		mes "�@����ɖڂ�z��Ȃ���Ԃ₢���]";
		next;
		mes "[�q�V�G]";
		mes "�c�c�I�[�u�̖��͂�";
		mes "�D��ꂽ���Ƃ͒N�ɂ�";
		mes "�m���Ă��Ȃ��c�c�B";
		next;
		mes "[�q�V�G]";
		mes "�ނ炪�m��";
		mes "�G�C���@���g�̍߂�";
		mes "���ƃJ���̑��݂���";
		mes "������ˁB";
		next;
		mes "[�q�V�G]";
		mes "�������܂����A�����̒m����";
		mes "���̂悤�Ȍ`�ŗ��p���邱�Ƃ�";
		mes "�Ȃ�Ȃ�Ăˁc�c�B";
		mes "�܂������A����Ȃ��̂���B";
		next;
		mes "[�q�V�G]";
		mes "�����A�N�������c�c";
		mes "�G�C���@���g�ɗp������Ȃ�";
		mes "�����͍���";
		mes "�����𑱂��Ă���͂����B";
		mes "�����������Ƃ������";
		mes "���ڕ����Ƃ����B";
		close2;
		cutin "hisie01",255;
		end;
	case 1:
		if(checkquest(7593) == 0) {
			cutin "hisie02",2;
			mes "[�q�V�G]";
			mes "�I�[�u�̖��͂Ɋւ��Ă�";
			mes "�G�C���@���g���ǂ��m���Ă���B";
			mes "�c�c���ƃJ�������낢��";
			mes "�����������Ƃ�v�����Ƃ����邪";
			mes "�G�C���@���g�̎d���Ɂc�c";
			mes "�c�c�N�����͂��Ăق����B";
			next;
			mes "[�q�V�G]";
			mes "�I�[�u�̖��͉������肾���A";
			mes "�����̑��݂������ł��Ȃ��B";
			mes "����ɂ܂��݂��";
			mes "�I�[�u�̒��j���͂�";
			mes "�D�悳�ꂽ������m��Ȃ��B";
			next;
			mes "[�q�V�G]";
			mes "�����ɂ��邱�Ƃ�";
			mes "�ł��Ȃ�����������ȁc�c�B";
			mes "�N�ɂ������ނ��Ƃ��ł��Ȃ��񂾁B";
			mes "���ƃJ���̖ʎq�𗧂Ă邽�߂ɂ�";
			mes "�����Ăق����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		if(checkquest(7600)) {
			if(checkquest(7600)&0x2 == 0) {
				cutin "hisie01",2;
				mes "[�q�V�G]";
				mes "�܂��������ĂȂ�";
				mes "�I�[�u�̖��͂������B";
				mes "�܂��A�ŏ��̍�����";
				mes "�}�V�ɂȂ��Ă������c�c";
				mes "�ł���Ζ�������`���Ăق����B";
				close2;
				cutin "hisie01",255;
				end;
			}
			cutin "hisie01",2;
			delquest 7600;
			mes "[�q�V�G]";
			mes "�������_�a�ɂ܂����킷��Ȃ�";
			mes "���݂������Ƃ�����B";
			mes "�c�c�������B";
			mes "�O�ɂ���������Ƃ��B";
			mes "���͂�߂��d������B";
			next;
			mes "[�q�V�G]";
			mes "��`���C������Ȃ�";
			mes "�܂��b�������Ăق����B";
			close2;
			cutin "hisie01",255;
			end;
		}
		if(checkquest(7595)) {
			if(checkquest(7595)&0x4 == 0) {
				cutin "hisie01",2;
				mes "[�q�V�G]";
				mes "���_�a�ł����߂��Ă���";
				mes "�I�[�u�̖��͂���������A";
				mes "�@���čӂ�������";
				mes "�ȒP�Ȏd�����B";
				mes "�U��΂������͂�";
				mes "���R�Ɛ��E���ɖ߂��Ă����B";
				next;
				mes "[�q�V�G]";
				mes "���������Ĉړ��ł��Ȃ����͂�";
				mes "�z������΂����B";
				mes "�����ƐG��邾���ł�";
				mes "�z���ł���͂����B";
				next;
				mes "[�q�V�G]";
				mes "�z���������͂�";
				mes "�N�̏����ɂȂ邩������Ȃ��B";
				mes "�����𑊎�ɂ���Ƃ���";
				mes "�L���Ɏg���Ăق����B";
				close2;
				cutin "hisie01",255;
				end;
			}
			cutin "hisie04",2;
			mes "[�q�V�G]";
			mes "���������I�@�悭����Ă��ꂽ�I";
			mes "�N�����͂̌������󂵂Ă��ꂽ��������";
			mes "���͂����X�ɖ߂��Ă���̂�";
			mes "��������B";
			mes "�J���������ƁA��Ԃ��낤�I";
			next;
			cutin "hisie01",2;
			mes "[�q�V�G]";
			mes "�債�����̂ł͂Ȃ���";
			mes "�󂯎���Ăق����B";
			mes "�N�̏����ɂȂ邩������Ȃ�";
			mes "���Ɓc�c�I�[�u�̖��͂�";
			mes "�z���ȏ�ɑ傫���悤���B";
			next;
			mes "[�q�V�G]";
			mes "����������܂��N��";
			mes "���_�a�ɍs�����ƂɂȂ��";
			mes "���̎������݂����B";
			mes "�܂��͂������x��ł���B";
			setquest 7600;
			delquest 7595;
			getitem 607,1;
			close2;
			cutin "hisie01",255;
			end;
		}
		cutin "hisie01",2;
		mes "[�q�V�G]";
		mes "���_�a���c�c�B";
		mes "���łō\��Ȃ��̂����A";
		mes "�}�i�ƌ����I�[�u�̖��͂�";
		mes "�T���Ă݂ė~�����B";
		next;
		mes "[�q�V�G]";
		mes "�����āA�������������";
		mes "�@���čӂ��Ăق����B";
		mes "����ɂ��A���͂͊g�U����";
		mes "�U��΂������͂�";
		mes "���R�Ɛ��E���ɖ߂��Ă����B";
		mes "���܂�Ă���邩�H";
		next;
		if(select("��낱���","�͂ɂȂ�Ȃ�") == 2) {
			cutin "hisie02",2;
			mes "[�q�V�G]";
			mes "�������A�������邱�Ƃ͂Ȃ��B";
			mes "�C�ɂ���ȁB";
			close2;
			cutin "hisie01",255;
			end;
		}
		mes "[�q�V�G]";
		mes "���܂Ȃ��A������B";
		mes "���̓I�[�u�̖��͂����";
		mes "�ɂ����󋵂Ȃ񂾁B";
		next;
		mes "[�q�V�G]";
		mes "�ł́c�c";
		mes "^0000FF�u���P�̃}�i�v";
		mes "�u�����̃}�i�v";
		mes "�u��n�̃}�i�v^000000";
		mes "���ꂼ��3�A������Ăق����B";
		next;
		mes "[�q�V�G]";
		mes "�Ƃ͂����A�����͂��Ȃ��Ă����B";
		mes "�����ɋA�邱�Ƃ�D�悵�Ă���B";
		setquest 7595;
		close2;
		cutin "hisie01",255;
		end;
	}
OnInit:
	waitingroom "�I�[�u�̖��͉��",0;
	end;
}

moro_vol.gat,94,110,5	script	���҃j�[�Y�w�b�O#143n	510,{
	if(checkquest(201730)) {	// ���_�a�U���ς݁H
		mes "[���҃j�[�Y�w�b�O]";
		mes "�s�v�c�ł��c�c�B";
		mes "���͊m���ɔނ̎҂�";
		mes "���̐�����������������c�c�B";
		mes "�����āA���̊肢�͊����܂����c�c�B";
		mes "�c�c�ł����A�Ȃ�����Ȃɂ�";
		mes "�C���������������Ȃ��̂ł��傤�H";
		cutin "ep14_nyd02",2;
		next;
		mes "[���҃j�[�Y�w�b�O]";
		mes "������܂���c�c�B";
		mes "���҂Ƃ��Ă̖������ꉞ��";
		mes "�ʂ���������c�c�ł��傤���B";
		mes "���������܂��Ƃ܂��A������";
		mes "�����Ȃ����炩������܂���ˁc�c�B";
		cutin "ep14_nyd01",2;
		next;
		mes "[���҃j�[�Y�w�b�O]";
		mes "�ł��c�c�B";
		mes "�c�c�����Ƃ���";
		mes strcharinfo(0)+ "�l��";
		mes "�����Ă���������";
		mes "���̓��̂��Ƃ��v���o���āA";
		mes "�΂����������Ǝv���Ă��܂��B";
		cutin "ep14_nyd04",2;
		close2;
		cutin "ep14_nyd01",255;
		end;
	}
	cutin "ep14_nyd03",2;
	mes "[���҃j�[�Y�w�b�O]";
	mes "������������̓���";
	mes "����Ă��܂��B";
	mes "�x��΂��Ȃ���";
	mes "���҂Ƃ��Ă̋`����";
	mes "���s���܂��傤�B";
	next;
	cutin "ep14_nyd04",2;
	mes "[���҃j�[�Y�w�b�O]";
	mes "���͂��ĉ߂���Ƃ��Ă��܂��܂����B";
	mes "���̏����Ƃ����킯�ł͂���܂��񂪁A";
	mes "�o�������̗͂�s�����܂��傤�B";
	close2;
	cutin "ep14_nyd04",255;
	end;
}

moro_vol.gat,97,110,3	script	���L#1432loki01	512,{
	cutin "ep14_roki01",2;
	mes "[���L]";
	mes "����͂܂��O���킾�B";
	mes "�����̐^�̎p�����ꂽ���B";
	mes "�������炪�{���̎n�܂肾�B";
	close2;
	cutin "ep14_roki01",255;
	end;
}

moro_vol.gat,98,107,3	script	���w��#143avt01	618,{
	if(ECL_3QUE < 33) {	// �G�N���[�W���̉�
		cutin "avant01",1;
		mes "[���w��]";
		mes "�c�c�ז����B";
		mes "���̎����ޗ��ɂȂ肽���̂��H";
		mes "��`���C�������Ȃ炱�����狎��B";
		close2;
		cutin "avant01",255;
		end;
	}
	switch(FVOL_3QUE) {
	case 0:
		cutin "avant01",1;
		mes "[�G�C���@���g]";
		mes "�����ɂ͉��̗p���H";
		mes "�N�����������΂��ɗ����̂��H";
		next;
		menu "���̂����ɁH",-;
		mes "[�G�C���@���g]";
		mes "�c�c��₾�ȁB";
		mes "����͎��̃v���C�h�̖�肾�B";
		mes "�Ƃ͂����ꑰ����@��";
		mes "���炵���������Ƃ�";
		mes "�F�߂悤�B";
		next;
		cutin "avant02",1;
		mes "[�G�C���@���g]";
		mes "����̋��͂́A";
		mes "����ɑ΂����܍߂Ƃ������邾�낤�B";
		mes "�c�c����B";
		mes "�F�͂����v���Ă���͂����I";
		mes "�n�n�n�n�n�n�n�n�I";
		next;
		mes "[�G�C���@���g]";
		mes "�����ȁI";
		mes "���̖ړI�͈Ⴄ�̂���I";
		mes "���𗘗p�����V�i�C����";
		mes "���������N�Ɏd�Ԃ���������";
		mes "�����Ȃ̂���I";
		next;
		mes "[�G�C���@���g]";
		mes "�Ō�ɏ΂��̂̓V�i�C���ł��c�c";
		mes "���������N�ł��Ȃ��I";
		mes "�Ō�ɏ΂��̂͒N���c�c�I";
		mes "���҂��邪�����I";
		mes "�n�n�n�n�n�n�n�n�I";
		set FVOL_3QUE,1;
		close2;
		cutin "avant01",255;
		end;
	case 1:
		if(checkquest(7581) == 0) {	// �ψق������g�ގ���
			cutin "avant01",1;
			mes "[�G�C���@���g]";
			mes "�c�c�ӂ�A�ɏ��̖��͂ł�";
			mes "���̂悤�ȉ^�p���\�Ƃ͂ȁc�c�B";
			mes "���񂾖��͂ŋ����Ȃ낤�Ƃ́c�c";
			mes "����킵�����߁I";
			close2;
			cutin "avant01",255;
			end;
		}
		if(checkquest(7584)) {
			if(checkquest(7584)&0x2 == 0) {
				cutin "avant01",1;
				mes "[�G�C���@���g]";
				mes "�c�c���̓����̎������ނ��B";
				close2;
				cutin "avant01",255;
				end;
			}
			cutin "avant01",1;
			mes "[�G�C���@���g]";
			mes "���������l�ԘA������";
			mes "�ēx���������ɏo��͂����B";
			mes "�o���O�ɂ����Ɋ�邪�����B";
			mes "^ff0000�}�i�N���X�^��^000000���W�߂�";
			mes "�K�v�����邩��ȁB";
			delquest 7584;
			close2;
			cutin "avant01",255;
			end;
		}
		if(checkquest(7583)) {
			if(countitem(6708) < 3) {
				cutin "avant01",1;
				mes "[�G�C���@���g]";
				mes "���O�����̋���Ȗ�����";
				mes "�|����^ff0000�}�i�N���X�^��^000000��";
				mes "����\�Ȃ͂����B";
				mes "�����������ė���񂾁B";
				mes "�Œ�3�A���������ȁH";
				mes "3�ȏゾ�B";
				close2;
				cutin "avant01",255;
				end;
			}
			cutin "avant01",1;
			mes "[�G�C���@���g]";
			mes "�c�c�t���A���ȁB";
			mes "^ff0000�}�i�N���X�^��^000000�͂��炤���B";
			delitem 6708,3;
			chgquest 7583,7584;
			getexp 1000000,0,1;
			getexp 1000000,0,1;
			getexp 1000000,0,1;
			getexp 1000000,0,1;
			getexp 1000000,0,1;
			close2;
			cutin "avant01",255;
			end;
		}
		cutin "avant01",1;
		mes "[�G�C���@���g]";
		mes "�����A���O�B";
		mes "�������A���O���B";
		mes "�������̂₯��";
		mes "�������Ȃ�炪�����邩�H";
		mes "�����Ƃ���A������";
		mes "�|���ɍs���悤�����c�c�B";
		next;
		mes "[�G�C���@���g]";
		mes "^ff0000�c�񂾃����N�̌��g";
		mes "���΂̃����N�̌��g";
		mes "��C�̃����N�̌��g^000000��";
		mes "�|����^ff0000�}�i�N���X�^��^000000��";
		mes "��ɓ���͂����B";
		next;
		mes "[�G�C���@���g]";
		mes "^ff0000�}�i�N���X�^��^000000�̓I�[�u����D�悳�ꂽ";
		mes "���͂̈ꕔ���B";
		mes "�����̕��ۂł���قǂ܂ł�";
		mes "�����Ȃ����̂�";
		mes "�I�[�u�̖��͂̂������A";
		mes "�Ƃ����킯���B";
		next;
		mes "[�G�C���@���g]";
		mes "�c�c�B";
		mes "�������������̂�������Ȃ��̂��H";
		mes "�������|����";
		mes "^ff0000�}�i�N���X�^��^000000�������Ă����B";
		mes "���O�ɂ͓��ꈵ���Ȃ����̂�����ȁA";
		mes "���̂܂܂����Ă���̂��B";
		next;
		mes "[�G�C���@���g]";
		mes "�S����3�C�A";
		mes "^ff0000�}�i�N���X�^��^000000�����R3���B";
		mes "�c�c�G�N���[�W���c�c�Ђ��Ă�";
		mes "�J���f���C�̂��߂ɂ��ȁc�c�B";
		setquest 7583;
		close2;
		cutin "avant01",255;
		end;
	}
OnInit:
	waitingroom "�}�i�N���X�^�����",0;
	end;
}

moro_vol.gat,108,88,5	script	�i�ߊ��A�W�t#14301	459,{
	cutin "ep13_captin_edq",2;
	if(checkquest(116545)) {
		mes "[�i�ߊ��A�W�t]";
		mes "�ǂ������H";
		mes "���������N�͂������H";
		mes "�����z��|�����Ƃ��ł����̂Ȃ�";
		mes "�܂����҂̂��삳���";
		mes "�b�����Ă݂Ă���B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "���삳��͖��_�a�̓�����";
		mes "���E���Ɏ������̑O�ɂ��邩��";
		mes "�����Ă�낤�B";
		close2;
		cutin "ep13_captin_edq",255;
		warp "moro_cav.gat",41,69;
		end;
	}
	if(checkquest(7593)) {
		mes "[�i�ߊ��A�W�t]";
		mes "���_�a���������ꂽ�̂�";
		mes "�����ɂ���u�̓��A���B";
		mes "�����ɉ��̂��A��������炵���B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "���҂ƌĂ΂�Ă���";
		mes "���삳����s���������B";
		mes "���̂��삳���T���΂������낤�B";
		close2;
		cutin "ep13_captin_edq",255;
		end;
	}
	if(checkquest(7597)) {
		if(checkquest(201730)) {
			mes "[�i�ߊ��A�W�t]";
			mes "���A����������ꂳ��B";
			mes "����ŁA���_�a�̕��͂ǂ����H";
			mes "�c�c�ǂ����";
			mes "���܂��̂��̗l�q����";
			mes "���ɐi�W�͂Ȃ��݂������ȁB";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "����ł́A��V���B";
			mes "������󂯎���Ă���B";
			mes "�܂�������悩������A���ށB";
			delquest 7597;
			getitem 7444,2;
			close2;
			cutin "ep13_captin_edq.bmp", 255;
			end;
		}
		mes "[�i�ߊ��A�W�t]";
		mes "����!!";
		mes "�c�c�p�Y�̋A�҂��I";
		mes "�͂͂͂͂͂�!!";
		mes "���ɂ��̒�������";
		mes "�����̏I��肾�I";
		mes "����J������!!";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�S�l�ނɑ��肱�̉��A";
		mes "�q�o�E�A�W�t���炨�܂���";
		mes "���ӂ����킹�Ă���B";
		next;
		cutin "ep13_captin_edq",255;
		mes "[�A�r�_��]";
		mes "�{���ɑf���炵�������ł���B";
		mes "���Ȃ��͂��̐��E���~������";
		mes "���R�̈̋Ƃ𐬂��������̂ł�����B";
		mes "����Ŏ��̌��ׂ̉�";
		mes "���肻���ł��ˁc�c�B";
		next;
		cutin "ep13_captin_edq",2;
		mes "[�i�ߊ��A�W�t]";
		mes "�A�r�_��!";
		mes "�����܂ł��I";
		mes "����ȏサ��ׂ��";
		mes "�댯�ȃt���O��";
		mes "���炵�����I";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "���āA���܂������t�����ł�";
		mes "������Ȃ����낤�B";
		mes "���܂��̌��J��J����";
		mes "�����������̂�����B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����������̂���Ȃ����A";
		mes "�ǂ�������󂯎���Ă���B";
		mes "�����Ɨǂ����̂��p�ӂł����";
		mes "�ǂ������񂾂��ȁc�c�B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�������c�c";
		mes "�ӂ͂͂͂͂͂͂��I";
		mes "����ł���Ǝ�r�𖍂ɂ���Ȃ�";
		mes "���ʂɃx�b�h�̖�����������";
		mes "���ꂻ�����ȁI";
		mes "�{���ɂ悭����Ă��ꂽ�I";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����A���f�͋֕����B";
		mes "���΂炭�͈�������";
		mes "���_�a�̒��������Ă���Ȃ����H";
		mes "�܂����������N������������";
		mes "���܂�񂩂�ȁI";
		mes "��낵�����񂾂��I";
		delquest 7597;
		setquest 7598;
		setquest 201730;
		getitem 7444,2;
		close2;
		cutin "ep13_captin_edq",255;
		end;
	}
	if(checkquest(7598)) {
		if(checkquest(7598)&0x2 == 0) {
			mes "[�i�ߊ��A�W�t]";
			mes "�{�͕̂Еt�����񂾁B";
			mes "�������T�d�ɐi�߂�Ƃ��悤�B";
			mes "���̊ԁA���܂��͏����x�񂾕��������B";
			mes "�c��͂������ɂ��C���Ă���B";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "�������ȁc�c�B";
			mes "���ꂵ�Ă���1��ڂ�";
			mes "^ff0000�ߑO5���ȍ~^000000�ɗ��Ă���B";
			mes "���̎��ɉ�������Γ`���悤�B";
			next;
			mes "[�i�ߊ��A�W�t]";
			mes "�܂��A�Ō�̓�������Ă���";
			mes "^ff00001����30��^000000�o�߂���܂ł�";
			mes "�����Ȃ����낤����";
			mes "���S���ċx��ł���B";
			close2;
			cutin "ep13_captin_edq",255;
			end;
		}
		delquest 7598;
		mes "[�i�ߊ��A�W�t]";
		mes "�ւ��c�c������A";
		mes "����ɒ��񂾂΂��肾���Ă����̂�";
		mes "�Ȃ�Ƃ������݂������ȁB";
		mes "�������A�b���Ă邾������ȁB";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����܂��u�肵�Ă����Ȃ�";
		mes "���ł����ɂ����Ă���B";
		mes "�����N�͊m���ɓ|�����͂��Ȃ̂�";
		mes "�����ɂ��̖��_�a��";
		mes "���̂܂܂Ȃ̂͋C�ɂȂ�c�c�B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "������܂������̋��Ԃ�";
		mes "�Ȃ���킴�Ƃ����ׂ����ۂ����m���B";
		mes "�Ƃ͂����A���܂����K������";
		mes "���ׂɍs���K�v�͂Ȃ��B";
		mes "�������������Ȃ��ƂȁI";
		close2;
		cutin "ep13_captin_edq",255;
		end;
	}
	if(checkquest(201730)) {
		mes "[�i�ߊ��A�W�t]";
		mes "�������c�c�ǂ��l���Ă�";
		mes "������Ȃ��ȁB";
		mes "�u����v���_�ɂȂ��";
		mes "�\��o�������_����A";
		mes "���̏ꏊ�̋�C�╵�͋C��";
		mes "��]��������ȁB";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�ڂ����͂킩��Ȃ��̂���";
		mes "�ǂ�����x�˂���Ă��܂���";
		mes "�����̋ύt�͉񕜂ł��Ȃ��悤���B";
		mes "�����ő��k���I";
		mes "�u���_�a�v�ɂ�����x";
		mes "�s���Ă݂�C�͂Ȃ����H";
		next;
		if(select("�s���Ă݂�","�s���Ȃ�") == 2) {
			mes "[�i�ߊ��A�W�t]";
			mes "�������B";
			mes "���܂��͂����[��";
			mes "�撣���Ă��ꂽ���ȁB";
			mes "���ށA�d������܂��B";
			mes "���̐l�ɗ��ނƂ��悤�B";
			close2;
			cutin "ep13_captin_edq",255;
			end;
		}
		mes "[�i�ߊ��A�W�t]";
		mes "���R�ƍl���Ă����񂾂��A";
		mes "�u���_�a�v�͎��Ԃ�";
		mes "�J��Ԃ��͂�����̂���";
		mes "�����ȁc�c�B";
		mes "�v����ɁA���܂Ŋώ@���ꂽ";
		mes "�����̋��Ԃ̏�ԂƓ������B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����l����ƁA���B";
		mes "���̐��E���甲���o������";
		mes "�������Ă����ǂ̂Ƃ���A";
		mes "��_�̏��̒��Ȃ̂ł͂Ȃ�����";
		mes "�v���̂����c�c�B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "���܂Ȃ��A���ʘb�������Ȃ����B";
		mes "�T�������߂Ă��肢�������B";
		mes "�����A�ߋ���Y�ꂽ�����N��";
		mes "�܂�������ꍇ�����c�c�B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�Y�ꂽ�ߋ���";
		mes "�v���o����悤��";
		mes "�ēx�A���炵�Ă���Ă���B";
		mes "�������A����͖������B";
		mes "�C�𔲂����ɁA�Ή������B";
		mes "�ł́A�������F��B";
		if(checkquest(7593) == 0)
			setquest 7593;
		close2;
		cutin "ep13_captin_edq",255;
		end;
	}
	if(checkquest(201720) && checkquest(201725)) {	// �r�I�X�̓��A�����X�̓��A�N���A�ς�
		mes "[�i�ߊ��A�W�t]";
		mes "���傤�Ǘǂ��Ƃ���ɗ����ȁB";
		mes "���̈Â����A�ɓ���";
		mes "�ł����炵���B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����āA���̓��A�̓���i�񂾐��";
		mes "�V�����n�悪�������ꂽ�B";
		mes "���̐V�����������ꂽ�n���";
		mes "�����^FF0000���_�a^000000�ƌĂԂ��Ƃɂ����B";
		mes "�T���ōŏ��Ɍ������҂�";
		mes "�����Ă񂾂��������c�c�B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "���ۂɊm�F�����Ƃ���A";
		mes "�Ȃ�قǁA�Ƃ�����������������ȁB";
		mes "���̂܂܎g�����Ƃɂ����񂾁B";
		mes "�킩��₷�����ȁB";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����Ė{��͂������炾���c�c";
		mes "�ǂ���炻�̖��_�a�̉��[���A";
		mes "�[�w���ƌĂ΂��ꏊ��";
		mes "���������N������ł���悤�Ȃ񂾁B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�������A���R�����U�����������悤��";
		mes "�E�ݑ��Ō��������̂����c�c";
		mes "���������N�ɋC�t����Ă��܂��ĂȁB";
		mes "���������N�̐��ސ[�w����";
		mes "�H����Ȃ������񂾁B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�F�X�Ǝ����Ă݂��񂾂�";
		mes "�ǂ����Ă��吨���ƋC�t����Ă��܂��B";
		mes "���҂̂��삳��Ƃ����k�����񂾂��A";
		mes "��͂�A���l���Œ��ނ���";
		mes "���@�͂Ȃ������Ȃ񂾁B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����ł��܂��ɂ�";
		mes "���_�a�̓����ɂ���ł��낤";
		mes "���������N�̓������˗��������B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "���F�����Ԃ��Ԃł�";
		mes "���O�̊���͕����Ă���B";
		mes "���O�ȏ�ɘr�̗��҂�";
		mes "�A���R�ɂ͋��Ȃ����낤�B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "���E�̖��^�������̂�";
		mes "���O�������Ȃ��B";
		mes "�ǂ����A��낵�����ށB";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����A����͖��߂ł͂Ȃ��˗����B";
		mes "�����������Ă���댯�Ȏd�������ȁB";
		mes "���܂������߂�΂����B";
		mes "���_�A�f��������Ƃ����āA";
		mes "�N�����܂���ӂ߂���͂���B";
		next;
		if(select("�c�c���܂��I","�c�c�������܂�") == 2) {
			mes "[�i�ߊ��A�W�t]";
			mes "����͎d���Ȃ��B";
			mes "�������Ă̕��킾�B�B";
			mes "�����܂ŋ��͂��Ă��ꂽ�����ł�";
			mes "���肪�����������B";
			close2;
			cutin "ep13_captin_edq",255;
			end;
		}
		mes "[�i�ߊ��A�W�t]";
		mes "�c�c���������Ă����Ǝv�������B";
		mes "��͂肨�܂��͐M���ɒl����ȁB";
		mes "���L�Ƃ�������̌��t�ɂ��ƁA";
		mes "�����͂܂����󂪉������Ƃ��Ɏ󂯂�";
		mes "�_���[�W�����S�ɂ�";
		mes "�񕜂��Ă��Ȃ��炵���B";
		next;
		mes "[�i�ߊ��A�W�t]";
		mes "�����ɐg����߂Ă���̂�";
		mes "���̂��������m���ȁB";
		mes "�Ƃ͂����A�������ɂƂ��Ă�";
		mes "���̕����D�s���ȕ���������B";
		mes "�c�c�������F��B";
		setquest 7593;
		close2;
		cutin "ep13_captin_edq",255;
		end;
	}
	mes "[�i�ߊ��A�W�t]";
	mes "�����̌i�F�͌���҂�";
	mes "�s���ɂ�������A�C��������";
	mes "����������ȁc�c�B";
	mes "���̂ǂ����Ƀ����N��";
	mes "����ł���Ƃ������Ƃ����c�c�B";
	next;
	mes "[�i�ߊ��A�W�t]";
	mes "�m���ɖ������g���B���̂�";
	mes "�K���Ă���c�c�悤�ɂ�������ȁB";
	mes "�����ł�����Ă�����̂�";
	mes "�����N��������";
	mes "���Ԃ̗͂Ɋ������܂�c�c";
	mes "ᏋC�ɉ������ꂽ�񂾂낤�ȁB";
	next;
	mes "[�i�ߊ��A�W�t]";
	mes "�������c�c�B";
	mes "�c�c�����玟�ւƁc�c�B";
	mes "�c�c�B";
	next;
	mes "[�i�ߊ��A�W�t]";
	mes "�c�c���܂�B";
	mes "����A��s�����͖��������񂾂�";
	mes "���̓y�n�̋�C��";
	mes "�ł��ꂽ�̂��������B";
	next;
	mes "[�i�ߊ��A�W�t]";
	mes "���܂��ɂ͂܂�����";
	mes "���ނ�������Ȃ�����ȁB";
	mes "����܂Ő������тĂ����B";
	close2;
	cutin "ep13_captin_edq",255;
	end;
OnInit:
	waitingroom "���_�a",0;
	end;
}

moro_vol.gat,110,90,3	script	�Q�d�A�r�_��#14302	755,{
	if(checkquest(7599)) {
		if(checkquest(7599)&0x2 == 0) {
			mes "[�A�r�_��]";
			mes "����J�l�ł����B";
			mes "�������x��ł��������B";
			next;
			mes "�]^ff0000���_�a�����񍐂�";
			mes "�@�Ō�ɕ񍐂��Ă���A";
			mes "�@1��ڂ̌ߑO5���ȍ~�ɁA";
			mes "�@�ēx�A�󒍂��邱�Ƃ�";
			mes "�@�ł���悤�ɂȂ�܂�^000000�]";
			close;
		}
		delquest 7599;
		mes "[�A�r�_��]";
		mes "��������x�߂܂������H";
		mes "��F�Ŕ��f�����";
		mes "�悭�Ȃ����悤�ł��ˁB";
		mes "�ق��Ƃ��܂����B";
		mes "�����ɕ���ꂸ�ɘȂ�";
		mes "���_�a�ɍ����Ă����Ƃ���ł��c�c�B";
		next;
		mes "[�A�r�_��]";
		mes "�܂����_�a�ɏZ�ޖ����𓢔�������A";
		mes "���ɕ񍐂��Ă��������B";
		mes "���тɉ�������V��";
		mes "�����グ�܂��B";
		close;
	}
	if(checkquest(96435)&4 || checkquest(96436)&4 || checkquest(96437)&4 || checkquest(96438)&4) {
		mes "[�A�r�_��]";
		mes "���_�a�̖�����|���Ă����悤�ł��ˁI";
		mes "���ꂾ���̐��ʂ�����Ώ\���ł��I";
		next;
		mes "[�A�r�_��]";
		mes "���Ȃ��Ȃ������p�ӂ��Ă���܂��B";
		mes "�ł͖�����ގ����Ă����񍐏���";
		mes "�쐬���Ă��������܂����H";
		mes "�܂�^ff0000�񍐂͈�����^000000�Ɍ����Ă��܂��B";
		next;
		mes "[�A�r�_��]";
		mes "�ʓ|��������܂��񂪋K���ł��̂�";
		mes "�����������肢���܂��B";
		mes "�񍐏����쐬���܂����H";
		next;
		if(select("�쐬����","�܂��쐬���Ȃ�") == 2) {
			mes "[�A�r�_��]";
			mes "��ɂ��܂����H";
			mes "�p�ӂ��ł����琺�������Ă��������B";
			close;
		}
		mes "[�A�r�_��]";
		mes "�����l�ł����B";
		mes "�����炪��V�ƂȂ�܂��B";
		mes "�������̂��x�߂Ă��������B";
		setquest 7599;
		if(checkquest(96435)&4) {
			delquest 96435;
			set '@gain[0],1;
		}
		if(checkquest(96436)&4) {
			delquest 96436;
			set '@gain[2],'@gain[2]+1;
		}
		if(checkquest(96437)&4) {
			delquest 96437;
			set '@gain[1],'@gain[1]+1;
			set '@gain[2],'@gain[2]+1;
		}
		if(checkquest(96438)&4) {
			delquest 96438;
			set '@gain[2],'@gain[2]+1;
		}
		if('@gain[0]) {
			getitem 7228,'@gain[0];
			getitem 7229,'@gain[0];
		}
		if('@gain[1])
			getitem 22567,'@gain[1];
		if('@gain[2])
			getitem 7444,'@gain[2];
		close;
	}
	if(checkquest(7593)) {
		mes "[�A�r�_��]";
		mes "���_�a�Ɍ������̂ł����H";
		mes "��@���ɂ��ƁA���_�a�̒��ɂ�";
		mes "�����N�̕����Ǝv����A";
		mes "���܂Ō������Ƃ��Ȃ�������";
		mes "���݂��Ă����Ƃ̂��Ƃł��B";
		next;
		mes "[�A�r�_��]";
		mes "�������̖����B��ގ�������A";
		mes "���ɕ񍐂��Ă��炦�܂����B";
		mes "���тɉ�������V��";
		mes "�����グ�܂��B";
		next;
		mes "[�A�r�_��]";
		mes "������񖂉������N��";
		mes "�����ʂ������Ƃ����g���";
		mes "���ł͂Ȃ�^ff0000�A�W�t�i�ߊ�^000000��";
		mes "�񍐂��Ă��������ˁB";
		close;
	}
	mes "[�A�r�_��]";
	mes "���Ȃ���������ގ����邽�߂�";
	mes "�u�肵�Ă������ł����H";
	mes "�����̊��͕ω����������̂�";
	mes "���ӂ�ӂ�Ȃ��ł��������ˁB";
	close;
OnInit:
	waitingroom "���_�a������",0;
	end;
}

moro_vol.gat,111,87,1	script	�������C�O���h#14303	751,{
	if(checkquest(7582)) {
		if(checkquest(7582)&0x2 == 0) {
			mes "[�C�O���h]";
			mes strcharinfo(0)+ "���B";
			mes "���̋��͂Ȍ��g�̂��Ƃ����A";
			mes "���܂��ɂ����C����킯�ɂ�";
			mes "�����Ȃ�����ȁA";
			mes "���̎҂ɂ��w���������񂾁B";
			next;
			mes "[�C�O���h]";
			mes "�܂��͑̂��x�܂��Ă���B";
			mes "���͂܂��������炾�B";
			close;
		}
		mes "[�C�O���h]";
		mes "���낻�떂�����̎��Ԃ��B";
		mes "���҂ɋ����ȁI�@�͂͂́I";
		delquest 7582;
		close;
	}
	if(checkquest(7581)) {
		if(checkquest(7581)&0x4 == 0) {
			mes "[�C�O���h]";
			mes "^4d4dff�c�񂾃����N�̌��g�A";
			mes "���΂̃����N�̌��g�A";
			mes "��C�̃����N�̌��g^000000��";
			mes "�������Ă���B";
			mes "�t���C�����@���[�𒆐S��";
			mes "���ꂼ��̕��ʂɂ���͂����B";
			close;
		}
		mes "[�C�O���h]";
		mes "���҂Ɨ\�z�ʂ肾�ȁB";
		mes "�͂��������𓢔��������Ƃ�";
		mes "���̐�����������";
		mes "��܂�͂����B";
		mes "����������B";
		next;
		mes "[�C�O���h]";
		mes "�܂��͑̂��x�߂�";
		mes "�܂������ɎQ�����ė~�����B";
		mes "�A��Ƃ��ɂ݂͂�Ȉꏏ��";
		mes "�A�肽������ȁB";
		chgquest 7581,7582;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		close;
	}
	mes "[�C�O���h]";
	mes "�t���C�����@���[�Ɍ�����";
	mes "�����̒��ŁA����₢�Ă���";
	mes "���肪����B";
	mes "�����̂������ł��Ȃ�";
	mes "����ȏ󋵂Ɋׂ��Ă���񂾁B";
	next;
	mes "[�C�O���h]";
	mes "�����̓����N�̌��g��";
	mes "�����ڂ͓����Ȃ񂾂��A";
	mes "���͂ȃI�[����Z���Ă���B";
	mes "�������P�^�Ⴂ�ŁA���̂܂܂���";
	mes "�e���̔�Q������ɑ����Ă������낤�B";
	next;
	mes "[�C�O���h]";
	mes "�����ł��܂��̘r���������";
	mes "���݂�����B";
	mes "������ގ����Ă��Ă���Ȃ����H";
	mes "�댯�ȑ��肾���A";
	mes "���̂܂܂ɂ��Ă͂����Ȃ��񂾁B";
	next;
	if(select("����ł�","���܂�") == 1) {
		mes "[�C�O���h]";
		mes "�c�c�܂����f����Ƃ�";
		mes "�v��Ȃ������B";
		mes "���܂����~�b�h�K���h�̕��a�̂��߂�";
		mes "�����ɗ����̂ł͂Ȃ������̂��H";
		next;
		mes "[�C�O���h]";
		mes "���̖ڂ��Ԉ���Ă����̂��������B";
		mes "�����͑��̎҂ɔC����Ƃ��悤�B";
		close;
	}
	mes "[�C�O���h]";
	mes "�������I�@����Ă���邩�I";
	mes "�ł͐������悤�B";
	mes "�t���C�����@���[�̒����ɂ�";
	mes "�傫�Ȋ₪����B";
	mes "���̊�𒆐S�Ƃ������ʂ�";
	mes "�����͂����������W�܂��Ă���B";
	next;
	mes "[�C�O���h]";
	mes "�O�������Ȃ烂���N�߂��ł�";
	mes "�������������̉��l�Ɠ����Ȃ̂����c�c";
	mes "�����̃P�^���Ⴄ�炵���B";
	mes "���A�łȂ��Ȃ����܂��������A";
	mes "����l��������΂��肾�B";
	next;
	mes "[�C�O���h]";
	mes "�����ł��܂��ɂ͂��̖����A";
	mes "^4d4dff�c�񂾃����N�̌��g�A";
	mes "���΂̃����N�̌��g�A";
	mes "��C�̃����N�̌��g^000000��";
	mes "�������Ă��Ăق����B";
	mes "���܂񂪁A���ށB";
	setquest 7581;
	close;
OnInit:
	waitingroom "�ψق������g�ގ�",0;
	end;
}

moro_vol.gat,136,84,3	script	��b�w�X�����^#ep143	451,{
	switch(FVOL_4QUE) {
	case 0:
		if(DIC_2QUE < 23) {
			cutin "ep13_heslanta",2;
			mes "[�w�X�����^]";
			mes "�T�t�@����\�Ƃ��Đ���";
			mes "�w�������w�X�����^�Ɛ\���܂��B";
			mes "���ꂩ�炠�Ȃ��B�l�Ԃ�";
			mes "�퓬�����ɂ��܂��̂ŁA";
			mes "�����m�肨�����B";
			close2;
			cutin "ep13_heslanta",255;
			end;
		}
		cutin "ep13_heslanta",2;
		mes "[�w�X�����^]";
		mes "����͂���́A���v���Ԃ�ł��B";
		mes "�����o���Ă��܂����H";
		mes "�f�B�G���ɂĉ�b��";
		mes "���킵�����Ƃ�";
		mes "���͊o���Ă��܂���B";
		next;
		menu "�����ɂ͉��́H",-;
		mes "[�w�X�����^]";
		mes "���̎咣��ʂ��ČR�𗦂��Ă��܂����B";
		mes "���Ȃ��̐����ǂ���A";
		mes "�A�n�g�c�c�ނ�";
		mes "�T�t�@���ł͂Ȃ������̂ł��B";
		next;
		mes "[�w�X�����^]";
		mes "�c�c�������A���̎�����";
		mes "�m���Ă���͎̂���l�ł��B";
		next;
		mes "[�w�X�����^]";
		mes "�ނɑ΂���ʂĖ����^�₪";
		mes "���ʓI�Ɏ������܂����B";
		mes "�A�n�g�͋����ׂ��Î��\�͂���g���A";
		mes "���̎p������܂����̂ł��B";
		next;
		mes "[�w�X�����^]";
		mes "���̌�A���͖��������ޒn��";
		mes "��X���������ׂ����Ǝ咣���܂����B";
		mes "���̃T�t�@���ɂ͎푰��";
		mes "���J�̂��߂ɂ͔h�����ׂ��łȂ���";
		mes "�Ҕ��΂���܂������c�c�B";
		next;
		mes "[�w�X�����^]";
		mes "�T�t�@���͓��������񂾒��Ԃ�";
		mes "��@�Ɋׂ�̂�ق���";
		mes "���߂�������͂��܂���B";
		mes "�ł����玄���E���ȃK���g���𗦂���";
		mes "�����ɗ��邱�ƂɂȂ����̂ł��B";
		next;
		mes "[�w�X�����^]";
		mes "�b�������Ȃ�܂����ˁB";
		mes "�����A�����Ԃ�����悤�ł�����";
		mes "���̎d����";
		mes "��`���Ă������������̂ł��B";
		next;
		mes "[�w�X�����^]";
		mes "�`�F�V���[�͒m���Ă��܂��ˁH";
		mes "�`�F�V���[�Ɗ֘A����d���Ȃ̂�";
		mes "���̐l�ɂ͔C�����Ȃ��̂ł��B";
		mes "�܂��d�������鏀����";
		mes "�����Ă��܂��񂪁c�c�B";
		next;
		mes "[�w�X�����^]";
		mes "�`�F�V���[�Ɋւ�������W�߂����";
		mes "�{�i�I�Ɏd����";
		mes "�i�߂悤�Ǝv���܂��B";
		mes "����܂ł͂��C�����āB";
		set FVOL_4QUE,1;
		close2;
		cutin "ep13_heslanta",255;
		end;
	case 1:
		cutin "ep13_heslanta",2;
		mes "[�w�X�����^]";
		mes "�ȑO�A�`�F�V���[�Ɋւ���b��";
		mes "�������Ƃ��o���Ă��܂����H";
		mes "�������ł��̂Łc�c�B";
		mes "���̃T�t�@���ɂ͂ǂ����Ă�";
		mes "�b���܂���ł����B";
		mes "�����ő��k�ł����c�c";
		next;
		mes "[�w�X�����^]";
		mes "���̐����������Ă��邩";
		mes "�m�F���������̂ł����A";
		mes "��`���Ă��炦�܂����H";
		next;
		menu "�ǂ�Ȃ��Ƃł���",-;
		mes "[�w�X�����^]";
		mes "�����c�c�t���C�����@���[��";
		mes "�ƂĂ�������Ȃ��c�c";
		mes "�Ƃ����̂��A";
		mes "���������͂킩��܂��񂪁c�c";
		mes "�������ł���̂ł��B";
		next;
		mes "[�w�X�����^]";
		mes "ᏋC�ɐ��܂莩��";
		mes "�ړ�����\�s�̔��c�c�ł��B";
		mes "�ł�������͂܂�Łc�c";
		next;
		menu "�܂�Łc�H",-;
		mes "[�w�X�����^]";
		mes "�G���f�B�J�X�e�B�X��";
		mes "�u���f�B�E���̔���";
		mes "���Ɏ��Ă����ł��B";
		mes "���k�͂�������ł��B";
		mes "���̔���ގ�����";
		mes "���̂𒲂ׂ����̂ł��B";
		next;
		mes "[�w�X�����^]";
		mes "����̓`�F�V���[��";
		mes "�������莝���o�����Ƃ���";
		mes "�u���f�B�E���̔�����";
		mes "���͂ɂ��ł��܂��B";
		next;
		mes "[�w�X�����^]";
		mes "���������Ȃ�A�����Ńu���f�B�E����";
		mes "������Ďg�����ƂŁA";
		mes "�⋋�̕��S�������͌���܂��B";
		next;
		mes "[�w�X�����^]";
		mes "����̉����͎��̓ƒf��";
		mes "�߂��`�ōs��ꂽ�̂�";
		mes "�⋋���F��������܂���B";
		mes "�܂��͔��̐��̂�";
		mes "�\�����Ƃ���n�܂�܂��B";
		next;
		mes "[�w�X�����^]";
		mes "����ގ��������o�Ă����̂�";
		mes "�����Ă��������B";
		mes "���҂����Ă��܂��B";
		set FVOL_4QUE,2;
		setquest 7578;
		close2;
		cutin "ep13_heslanta",255;
		end;
	case 2:
		if(checkquest(7578)&0x4 == 0 || countitem(6392) == 0) {
			cutin "ep13_heslanta",2;
			mes "[�w�X�����^]";
			mes "^4d4dff�\�s�̔�^000000��ގ����Ċl���������̂�";
			mes "�����A���Ă��Ă��������B";
			close2;
			cutin "ep13_heslanta",255;
			end;
		}
		cutin "ep13_heslanta",2;
		mes "[�w�X�����^]";
		mes "����́c�c�\�z�ʂ�ł͂���܂����c�c";
		mes "���@���ł��锠���ǂ������";
		mes "�������肵���̂��͕�����܂���c�c�B";
		mes "�����̖��͂̂����ł��傤���B";
		next;
		mes "[�w�X�����^]";
		mes "�ł����A����Ŋm�M�����Ă܂����B";
		mes "�t���C�����@���[�̔��͑S��";
		mes "�G���f�B�J�X�e�B�X��";
		mes "�u���f�B�E���̔��Ƃ������Ƃ��B";
		next;
		mes "[�w�X�����^]";
		mes "���萔�������邱�ƂɂȂ�܂����A";
		mes "���̎d���͌p���I�ɂ��肢���܂��B";
		mes "�܂������ɂ͐M������l��";
		mes "���܂肢�܂���B";
		next;
		mes "[�w�X�����^]";
		mes "�K���g���͗E���ł����A";
		mes "�u���f�B�E���̔������̂悤�ȏꏊ��";
		mes "�����邱�Ƃɋ^������ł��傤�B";
		mes "���̋^�₪�^�f�ɕς��O��";
		mes "����������ɂ͘b��";
		mes "�����Ȃ肷���܂��B";
		next;
		menu "����ł�����n�߂�΁H",-;
		mes "[�w�X�����^]";
		mes "�����ł��ˁA�ł͑������肢���܂��B";
		mes "^4d4dff�\�s�̔�^000000��ގ����A";
		mes "^4d4dff�u���f�B�E���̔���10���^000000���Ă��������B";
		delitem 6392,1;
		set FVOL_4QUE,3;
		chgquest 7578,7579;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		close2;
		cutin "ep13_heslanta",255;
		end;
	case 3:
		if(checkquest(7579)&0x4 == 0 || countitem(6392) < 10) {
			cutin "ep13_heslanta",2;
			mes "[�w�X�����^]";
			mes "�\�s�̔��͂���Ȃ�";
			mes "�댯�ł͂Ȃ��ł����c�c";
			mes "�ꏊ���ꏊ�Ȃ̂�";
			mes "�C�����Ă��������B";
			next;
			mes "[�w�X�����^]";
			mes "�ł͂�낵�����肢���܂��B";
			close2;
			cutin "ep13_heslanta",255;
			end;
		}
		cutin "ep13_heslanta",2;
		mes "[�w�X�����^]";
		mes "�����l�ł��B";
		mes "���肪�Ƃ��������܂����B";
		mes "�W�߂��u���f�B�E���̔���";
		mes "������ŉ���������܂��B";
		next;
		mes "[�w�X�����^]";
		mes "�����Ɓc�c����̎���������܂��ˁB";
		mes "�ł͂܂����肢���܂��B";
		delitem 6392,countitem(6392);
		set FVOL_4QUE,4;
		chgquest 7579,7580;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		close2;
		cutin "ep13_heslanta",255;
		end;
	case 4:
		if(checkquest(7579)) {
			if(checkquest(7579)&0x4 == 0 || countitem(6392) < 10) {
				cutin "ep13_heslanta",2;
				mes "[�w�X�����^]";
				mes "�\�s�̔��͂���Ȃ�";
				mes "�댯�ł͂Ȃ��ł����c�c";
				mes "�ꏊ���ꏊ�Ȃ̂�";
				mes "�C�����Ă��������B";
				next;
				mes "[�w�X�����^]";
				mes "�ł͂�낵�����肢���܂��B";
				close2;
				cutin "ep13_heslanta",255;
				end;
			}
			cutin "ep13_heslanta",2;
			mes "[�w�X�����^]";
			mes "�����l�ł��B";
			mes "���肪�Ƃ��������܂����B";
			mes "�W�߂��u���f�B�E���̔���";
			mes "������ŉ���������܂��B";
			next;
			mes "[�w�X�����^]";
			mes "�����Ɓc�c����̎���������܂��ˁB";
			mes "�ł͂܂����肢���܂��B";
			delitem 6392,countitem(6392);
			chgquest 7579,7580;
			getexp 1000000,0;
			getexp 1000000,0;
			getexp 1000000,0;
			getexp 1000000,0;
			getexp 1000000,0;
			close2;
			cutin "ep13_heslanta",255;
			end;
		}
		if(checkquest(7580)) {
			if(checkquest(7580)&0x2 == 0) {
				cutin "ep13_heslanta",2;
				mes "[�w�X�����^]";
				mes "�ӂӂӁc�c�܂��܂��]�T������܂��ˁB";
				mes "�`�F�V���[�͎����������߂�";
				mes "�u���f�B�E�����r����";
				mes "�������Ă��邱�Ƃ�";
				mes "�m���Ă���ł��傤���H";
				next;
				mes "[�w�X�����^]";
				mes "���̂��킢�����ȔL�ɂ́c�c";
				mes "��ŉ����G�T��^����Ƃ��܂��傤�B";
				mes "�����A�܂����x";
				mes "�u���f�B�E���̔��̉����";
				mes "���肢���܂��B";
				close2;
				cutin "ep13_heslanta",255;
				end;
			}
			cutin "ep13_heslanta",2;
			mes "[�w�X�����^]";
			mes "���������΂�������Ȏ��Ԃł��ˁB";
			mes "�܂����̉�������肢���܂��B";
			delquest 7580;
			next;
			if(select("�킩��܂���","�܂����") == 2) {
				mes "[�w�X�����^]";
				mes "�͂��A�}���ł͂Ȃ��̂ŁA";
				mes "���Ԃ��]�����Ƃ��ō\���܂���B";
				next;
				mes "[�w�X�����^]";
				mes "�������肪�Ƃ��������܂��B";
				mes "����ł͂܂��B";
				close2;
				cutin "ep13_heslanta",255;
				end;
			}
		}
		cutin "ep13_heslanta",2;
		mes "[�w�X�����^]";
		mes "�����łɂȂ�܂������B";
		mes "�c�c�ł́A���������肢���Ă��H";
		next;
		if(select("���܂�","�܂����") == 2) {
			mes "[�w�X�����^]";
			mes "�͂��A�}���ł͂Ȃ��ł�����B";
			mes "���Ԃ��]�����Ƃ��ł����̂ŁB";
			next;
			mes "[�w�X�����^]";
			mes "�������肪�Ƃ��������܂��B";
			mes "����ł͂܂��B";
			close2;
			cutin "ep13_heslanta",255;
			end;
		}
		mes "[�w�X�����^]";
		mes "����ł͍�������낵�����肢���܂��B";
		mes "^4d4dff�\�s�̔�^000000��ގ����A";
		mes "^4d4dff�u���f�B�E���̔���10���^000000���Ă��������B";
		setquest 7579;
		close2;
		cutin "ep13_heslanta",255;
		end;
	}
OnInit:
	waitingroom "�\�s�̔�",0;
	end;
}

moro_vol.gat,134,83,5	script	�r�n�k�X#ep143	451,{
	mes "[�r�n�k�X]";
	mes "���Ȃ��������ɗ��܂������B";
	mes "�c�c���������΂����ł�";
	mes "�w�ւ̗͂������Ă�";
	mes "���t���ʂ��܂��ˁH";
	next;
	mes "[�r�n�k�X]";
	mes "�r�t���X�g�̈ӎv��";
	mes "�ǂ��ɂ܂œ͂��̂ł��傤���c�c�B";
	mes "���Ђ��̋@��Ƀ��t�B�l���Ƃ�";
	mes "�Ђ��������Ęb���������̂ł��B";
	next;
	mes "[�r�n�k�X]";
	mes "����͂��Ă����A";
	mes "�w�X�����^�l�͂������ł��ȁB";
	mes "���t�B�l���ƕs����ȓ�����";
	mes "���񂾂ɂ��ւ�炸�A";
	mes "���Ɏ��畋���Ă���킯�ł�����B";
	next;
	mes "[�r�n�k�X]";
	mes "�Ƃ����ꃉ�t�B�l����";
	mes "���C���������Ƃ��肢�܂��B";
	close;
}

moro_vol.gat,138,84,3	script	�⍲���e�B�G��#ep143	453,{
	mes "[�e�B�G��]";
	mes "�f�B�G���ɂ���������";
	mes "�[���[�g�ƃj�b�g�́A";
	mes "�w�X�����^�l�̎咣��";
	mes "�a�X�A��������܂����B";
	next;
	mes "[�e�B�G��]";
	mes "�ł����A���̓w�X�����^�l�̈ӌ���";
	mes "�S�ʓI�ɓ������Ă��܂��B";
	mes "�푰�𕪂��Đ키�ȑO�ɁA";
	mes "�����Ƃ������ʂ̓G��|�����߂ɂ�";
	mes "�͂����킹��ׂ��ł��B";
	next;
	mes "[�e�B�G��]";
	mes "�ւ��Ȃ��Ă����c�c�ł͂Ȃ��A";
	mes "���ɐ��Ȃ��ƍ��̕��a�Ȑ�����";
	mes "�o�Ɖ������ƂɂȂ肩�˂܂��񂩂�B";
	next;
	mes "[�e�B�G��]";
	mes "�����������Ƃł��̂ŁA";
	mes "�l�Ԃ̊F������A";
	mes "�ǂ����撣���Ă��������B";
	close;
}

moro_vol.gat,134,87,1	script	�攭�����A�o�����`�F#ep	450,{
	mes "[�A�o�����`�F]";
	mes "�Ⴆ���͏��Ȃ��Ƃ�";
	mes "��X�K���g�������͐��s���̐��s���B";
	mes "�l�Ԃ̐�m��B";
	mes "���ɐ키���̓������͑҂��Ă����̂��I";
	next;
	mes "[�A�o�����`�F]";
	mes "��͉䂪���������ċ���";
	mes "������ł��|�����Ƃ𐾂��I";
	close;
}

moro_vol.gat,131,86,1	script	�K���g��#gal01	492,{
	mes "[�K���g��]";
	mes "�퓬�͂����I";
	mes "���n�܂�̂��I";
	next;
	mes "[�K���g��]";
	mes "���̏����ȃ��t�B�l����";
	mes "�������˂΂Ȃ�ʂƂ́c�c�B";
	mes "���͂܂��߂����肵�퓬��";
	mes "�U���Ă�������F�����̂��Ƃ�";
	mes "�Y��ĂȂǂ��Ȃ��Ƃ����̂ɁB";
	close;
}

moro_vol.gat,138,87,7	script	�K���g��#gal02	492,{
	mes "[�K���g��]";
	mes "�䂪�C����";
	mes "�[���[�g�E�w�X�����^�l�̌�q�B";
	mes "�������痧�����邪�����B";
	mes "�G�Ƃ݂Ȃ��O�ɂȁI";
	close;
}

moro_vol.gat,140,97,1	script	���s����#gal11	492,{}
moro_vol.gat,143,97,1	script	���s����#gal12	492,{}
moro_vol.gat,146,97,1	script	���s����#gal13	492,{}
moro_vol.gat,140,94,1	script	���s����#gal14	450,{}
moro_vol.gat,143,94,1	script	���s����#gal15	450,{}
moro_vol.gat,146,94,1	script	���s����#gal16	450,{}

moro_vol.gat,150,86,1	script	���s����#gal21	492,{}
moro_vol.gat,153,86,1	script	���s����#gal22	492,{}
moro_vol.gat,156,86,1	script	���s����#gal23	492,{}
moro_vol.gat,150,83,1	script	���s����#gal24	450,{}
moro_vol.gat,153,83,1	script	���s����#gal25	450,{}
moro_vol.gat,156,83,1	script	���s����#gal26	450,{}

moro_cav.gat,34,65,5	script	�o���Y#morocav	49,{
	if(!(checkquest(116510) & 0x8)) {
		mes "[�o���Y]";
		mes "�N�A���������āA";
		mes "�����ɂ���Ƃ������́c�c";
		mes "�����N�����֌������`���҂��ȁI";
		mes "���̓����N�����֌������`���҂�";
		mes "�x�������Ă���񂾁B";
		next;
		mes "[�o���Y]";
		mes "�����N�͔��ɋ��G���B";
		mes "�̖͂������̂�";
		mes "�߂Â����Ƃ�������Ȃ��B";
		mes "�c�O�Ȃ���c�c";
		mes "�����߂Â��Ȃ��҂�1�l���B";
		next;
		mes "[�o���Y]";
		mes "�����玄�͂����ł�������";
		mes "^ff0000�E�҂̎w��^000000��";
		mes "�����N�����֌������`���ҒB��";
		mes "�n���Ă���B";
		mes "���̎w�ւ͈ꌩ�A���̔\�͂��Ȃ��B";
		mes "�������I";
		next;
		mes "[�o���Y]";
		mes "���ɂ͓��Z�������ĂˁB";
		mes "�����͂��{�����Ƃł��̎w�ւ�";
		mes "�l�̖����Ă���\�͂������o��";
		mes "�傫�ȗ͂𓾂鎖���ł���B";
		next;
		mes "[�o���Y]";
		mes "�E�҂̎w�ւ������Ă���";
		mes "�\�͂������o���΁A";
		mes "�����N�����̑傫�ȏ�����";
		mes "�Ȃ邾�낤�B";
		mes "�ǂ����A�󂯎���Ă������H";
		next;
		if(select("�w�ւ��󂯎��","�w�ւ��󂯎��Ȃ�") == 2) {
			mes "[�o���Y]";
			mes "�������B";
			mes "�~�����Ȃ����痈�Ă���B";
			close;
		}
		mes "[�o���Y]";
		mes "�ق�B���ꂾ�B";
		mes "���̎w�ւ̗͂�";
		mes "�����ƌN�̖��ɗ��͂����B";
		setquest 116510;
		compquest 116510;
		getitem 2981,1;
		next;
		mes "[�o���Y]";
		mes "������2�ڈȍ~��~�����ꍇ��";
		mes "^ff0000�E�҂̏�^000000��^0000ff30^000000��";
		mes "�����Ă��Ă���B";
		mes "�������悤�B";
		close;
	}
	mes "[�o���Y]";
	mes "�E�҂̎w�ւ̗͂��ő����";
	mes "�����o�����Ƃ��ł���΁A";
	mes "����̐킢�ő傢�ɖ��ɗ����낤�B";
	mes "�����͉��̗v�����H";
	next;
	switch(select("�w�ւɂ��ĕ���","�w�ւ���������","�G���`�����g���s��","�G���`�����g������������","�������Ȃ�")) {
	case 1:
		mes "[�o���Y]";
		mes "���̗E�҂̎w�ւ�";
		mes "�ꌩ���̔\�͂��Ȃ��B";
		next;
		mes "[�o���Y]";
		mes "�������I";
		mes "�����͂��{�����Ƃł��̎w�ւ�";
		mes "�l�̖����Ă���\�͂������o��";
		mes "�傫�ȗ͂𓾂鎖���ł���B";
		next;
		mes "[�o���Y]";
		mes "�E�҂̎w�ւ������Ă���";
		mes "�\�͂������o���΁A";
		mes "�����N�����̑傫�ȏ�����";
		mes "�Ȃ邾�낤�B";
		close;
	case 2:
		mes "[�o���Y]";
		mes "�E�҂̎w�ւ�";
		mes "�E�҂̏�30�Ō����\���B";
		mes "�������邩���H";
		next;
		if(select("�������Ȃ�","��������") == 1) {
			mes "[�o���Y]";
			mes "�������B";
			close;
		}
		if(countitem(6684) < 30) {
			mes "[�o���Y]";
			mes "^006400�E�҂̏�^00000030��";
			mes "�����Ă��Ȃ����H";
			mes "���ꂶ�Ⴀ�A�������邱�Ƃ�";
			mes "�ł��Ȃ��ȁB";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[�o���Y]";
			mes "�A�C�e���̎�ސ����������B";
			mes "�����ו������炵�Ă����B";
			close;
		}
		delitem 6684,30;
		getitem 2981,1;
		mes "[�o���Y]";
		mes "^006400�E�҂̏�^00000030��";
		mes "^006400�E�҂̎w��^0000001��";
		mes "�����������B";
		close;
	case 3:
		if(checkitemblank() == 0) {
			mes "[�o���Y]";
			mes "����������������悤���B";
			mes "�ו��ɋ󂫂�����Ă��Ă���B";
			close;
		}
		mes "[�o���Y]";
		mes "�G���`�����g����ɂ͗E�҂̎w�ւ�";
		mes "�������Ă���K�v������B";
		mes "�ǂ����ɑ������Ă���w�ւ�";
		mes "�G���`�����g����񂾁H";
		next;
		switch(select(
				(getequipid(7)!=0? "^nItemID^" +getequipid(7): "�A�N�Z�T���[[1]�]�������Ă��Ȃ�"),
				(getequipid(8)!=0? "^nItemID^" +getequipid(8): "�A�N�Z�T���[[2]�]�������Ă��Ȃ�"))
		) {
		case 1: set '@itemid,getequipid(7); set '@menu,7; break;
		case 2: set '@itemid,getequipid(8); set '@menu,8; break;
		}
		if('@itemid == 0) {
			mes "[�o���Y]";
			mes "�G���`�����g���������ꍇ�́A";
			mes "�E�҂̎w�ւ𑕔����Ă����Ă����B";
			close;
		}
		if('@itemid != 2981) {
			mes "[�o���Y]";
			mes "�E�҂̎w�ւ𑕔����Ă���B";
			mes "���̃A�N�Z�T���[�͈����Ȃ��B";
			close;
		}
		if(getequipcardid('@menu,0)) {
			mes "[�o���Y]";
			mes "���ɃG���`�����g����Ă���";
			mes "�E�҂̎w�ւ́A�������������";
			mes "�ăG���`�����g���\���B";
			close;
		}
		setarray '@table1$,"Str","Agi","Vit","Int","Dex","Luk";
		setarray '@table2$,"Atk","Matk";
		setarray '@table3$,"MaxHP","MaxSP";
		setarray '@table4$,"Def","Mdef";
		mes "[�o���Y]";
		mes "��Ԗڂ̃X���b�g�ɂ�";
		mes "�ǂ�Ȕ\�͂�t�^����񂾁H";
		next;
		set '@socket1,select("Str","Agi","Vit","Int","Dex","Luk")-1;
		switch('@socket1) {
		case 0: setarray '@bonus1, 4700, 4701, 4702, 4703, 4704; break;
		case 1: setarray '@bonus1, 4730, 4731, 4732, 4733, 4734; break;
		case 2: setarray '@bonus1, 4740, 4741, 4742, 4743, 4744; break;
		case 3: setarray '@bonus1, 4710, 4711, 4712, 4713, 4714; break;
		case 4: setarray '@bonus1, 4720, 4721, 4722, 4723, 4724; break;
		case 5: setarray '@bonus1, 4750, 4751, 4752, 4753, 4754; break;
		}
		mes "[�o���Y]";
		mes "��Ԗڂ̃X���b�g�ɂ�";
		mes "�ǂ�Ȕ\�͂�t�^����񂾁H";
		next;
		set '@socket2,select("Atk","Matk")-1;
		switch('@socket2) {
		case 0: setarray '@bonus2, 4882, 4766, 4767, 4894, 4895; break;
		case 1: setarray '@bonus2, 4883, 4896, 4897, 4898, 4899; break;
		}
		mes "[�o���Y]";
		mes "�O�Ԗڂ̃X���b�g�ɂ�";
		mes "�ǂ�Ȕ\�͂�t�^����񂾁H";
		next;
		set '@socket3,select("MaxHP","MaxSP")-1;
		switch('@socket3) {
		case 0: setarray '@bonus3, 4861, 4862, 4867, 4868, 4900; break;
		case 1: setarray '@bonus3, 4800, 4870, 4871, 4801, 4802; break;
		}
		mes "[�o���Y]";
		mes "�l�Ԗڂ̃X���b�g�ɂ�";
		mes "�ǂ�Ȕ\�͂�t�^����񂾁H";
		next;
		set '@socket4,select("Def","Mdef")-1;
		switch('@socket4) {
		case 0: setarray '@bonus4, 4791, 4792, 4793, 4794, 4893; break;
		case 1: setarray '@bonus4, 4890, 4786, 4891, 4787, 4892; break;
		}
		mes "[�o���Y]";
		mes "��Ԗڂ̃X���b�g��" +'@table1$['@socket1]+ "�A";
		mes "��Ԗڂ̃X���b�g��" +'@table2$['@socket2]+ "�A";
		mes "�O�Ԗڂ̃X���b�g��" +'@table3$['@socket3]+ "�A";
		mes "�l�Ԗڂ̃X���b�g��" +'@table4$['@socket4]+ "�A";
		mes "�{���ɂ����񂾂ȁH";
		next;
		if(select("������","�͂�") == 1) {
			mes "[�o���Y]";
			mes "�����ƌ��߂Ă���";
			mes "������x�b�����Ă���I";
			close;
		}
		mes "[�o���Y]";
		mes "�悵�A�G���`�����g���n�߂�I";
		mes "�ǂ�Ȍ��ʂ��o�邩��";
		mes "���ɂ��킩��Ȃ��B�K�^���F�낤�I";
		next;
		mes "[�o���Y]";
		mes "�ӂ����c�c�I";
		next;
		misceffect 182,"";
		misceffect 205,"";
		misceffect 102,"";
		misceffect 104,"";
		set '@card[0],'@bonus1[rand(getarraysize('@bonus1))];
		set '@card[1],'@bonus2[rand(getarraysize('@bonus2))];
		set '@card[2],'@bonus3[rand(getarraysize('@bonus3))];
		set '@card[3],'@bonus4[rand(getarraysize('@bonus4))];
		delequip '@menu;
		getitem2 2981,1,1,0,0,'@card[0],'@card[1],'@card[2],'@card[3];
		mes "[�o���Y]";
		mes "�G���`�����g�������������I";
		close;
	case 4:
		mes "[�o���Y]";
		mes "�E�҂̎w�ւɕt�^���ꂽ";
		mes "�G���`�����g������������ɂ�";
		mes "^FF0000�E�҂̏�3��^000000���K�v�ɂȂ�B";
		next;
		mes "[�o���Y]";
		mes "�����A���F����A�Ԃ��Ԃ�";
		mes "�������������Ă����z�ɂ�";
		mes "^ff0000����^000000�ŏ����������Ă�낤�B";
		mes "�����̒��������������2�񖳗����B";
		next;
		mes "^ff0000�]�����̏������͌J��Ԃ��\�ł��B";
		mes "�@�A���񐔂̃X�g�b�N�͏o���܂���B�]^000000";
		next;
		if(!checkquest(116513) && !checkquest(116514) && countitem(6684) < 3) {
			mes "[�o���Y]";
			mes "�c�O�����N�͗E�҂̏؂�";
			mes "����Ȃ��悤���ȁB";
			close;
		}
		mes "[�o���Y]";
		mes "����������ɂ͗E�҂̎w�ւ�";
		mes "�������Ă���K�v������B";
		mes "�ǂ����ɑ������Ă���w�ւ�";
		mes "����������񂾁H";
		next;
		switch(select(
				(getequipid(7)!=0? "^nItemID^" +getequipid(7): "�A�N�Z�T���[[1]�]�������Ă��Ȃ�"),
				(getequipid(8)!=0? "^nItemID^" +getequipid(8): "�A�N�Z�T���[[2]�]�������Ă��Ȃ�"))
		) {
		case 1: set '@itemid,getequipid(7); set '@menu,7; set '@str$,"��"; break;
		case 2: set '@itemid,getequipid(8); set '@menu,8; set '@str$,"�E"; break;
		}
		if('@itemid == 0) {
			mes "[�o���Y]";
			mes "�G���`�����g���������ꍇ�́A";
			mes "�E�҂̎w�ւ𑕔����Ă����Ă����B";
			close;
		}
		if('@itemid != 2981) {
			mes "[�o���Y]";
			mes "�E�҂̎w�ւ𑕔����Ă���B";
			mes "���̃A�N�Z�T���[�͈����Ȃ��B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[�o���Y]";
			mes "����������������悤���B";
			mes "�ו��ɋ󂫂�����Ă��Ă���B";
			close;
		}
		set '@card1,getequipcardid('@menu,0);
		if('@card1 == 0) {
			mes "[�o���Y]";
			mes "����͂��łɏ���������Ă���";
			mes "�w�ւ���Ȃ����H";
			close;
		}
		mes "[�o���Y]";
		mes '@str$+ "�ɑ��������E�҂̎w�ւ��ȁB";
		mes "�������������ꍇ�A����ꂽ�\�͂�";
		mes "�߂����͕s�\�����B";
		mes "^ff0000�E�҂̎w�ւ�2�������Ă���ꍇ��";
		mes "���ɋC��t���Ă���B^000000";
		mes "����ł����̂��H";
		next;
		if(select("������","�͂�") == 1) {
			mes "[�o���Y]";
			mes "�������A�܂��ǂ��l����񂾂ȁB";
			close;
		}
		if(checkquest(116513) || checkquest(116514)) {
			mes "[�o���Y]";
			mes "����A�N�͖����ŏ�������";
			mes "���邱�Ƃ��ł���悤���ˁB";
			while(1) {
				mes "�ǂ�����g�p���āA";
				mes "����������񂾂��H";
				if(checkquest(116513))
					set '@str1$,"���F���튮��";
				else
					set '@str1$,"���F���튮��(���B��)";
				if(checkquest(116514))
					set '@str2$,"�Ԃ��Ԋ���";
				else
					set '@str2$,"�Ԃ��Ԋ���(���B��)";
				next;
				switch(select('@str1$,'@str2$)) {
				case 1:
					if(!checkquest(116513)) {
						mes "[�o���Y]";
						mes "���F����̒�����";
						mes "�������Ă��Ȃ��悤�����B";
						next;
						mes "[�o���Y]";
						continue;
					}
					set '@type,116513;
					break;
				case 2:
					if(!checkquest(116514)) {
						mes "[�o���Y]";
						mes "�Ԃ��Ԃ̒�����";
						mes "�������Ă��Ȃ��悤�����B";
						next;
						mes "[�o���Y]";
						continue;
					}
					set '@type,116514;
					break;
				}
				break;
			}
			mes "[�o���Y]";
			mes "�킩�����A�ł͍����^ff0000����^000000��";
			mes "�����������悤�B";
			mes "�����҂��Ă���B";
			next;
			setquest '@type;
			delquest '@type;
		}
		else {
			mes "[�o���Y]";
			mes "�킩�����A�N�̌���𑸏d���悤�B";
			mes "����ł͏����҂��Ă���B";
			next;
			delitem 6684,3;
		}
		misceffect 182,"";
		misceffect 205,"";
		misceffect 338,"";
		delequip '@menu;
		getitem 2981,1;
		mes "[�o���Y]";
		mes "�����������������B";
		mes "�G���`�����g���K�v�Ȃ�";
		mes "�܂��b�����Ă���B";
		close;
	case 5:
		mes "[�o���Y]";
		mes "�E�҂̎w�ւ������Ă�����";
		mes "�G���`�����g�����Ă�邼�B";
		close;
	}
OnInit:
	waitingroom "�E�҂̎w��",0;
	end;
}

moro_cav.gat,32,73,5	script	�`�F�C�R#1	482,{
	mes "[�`�F�C�R]";
	mes "^ff0000���_�G���`�����g^000000����";
	mes "�m���Ă�H";
	mes "����A�h��̂ǂ̃J�[�h�X���b�g�ɂ�";
	mes "�}�������\�ȕs�v�c�ȃA�C�e����B";
	mes "���͂���Ɋւ��钲�������Ă���́B";
	mes "�����p������H";
	next;
	switch(select("�A�b�v�O���[�h���˗�����","�����𕷂�","�b����߂�")) {
	case 1:
		mes "[�`�F�C�R]";
		mes "�A�b�v�O���[�h�̒���ˁB";
		mes "�킩������B";
		mes "����͎��s����ꍇ��������B";
		mes "^ff0000���s�����ꍇ�A���p�����A�C�e����";
		mes "�S�Ė����Ȃ�^000000���ǂ���ł������H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�`�F�C�R]";
			mes "���킵�������ɂ܂����āB";
			close;
		}
		break;
	case 2:
		mes "[�`�F�C�R]";
		mes "���̂Ƃ���A���_�G���`�����g�ɂ�";
		mes "�e�\��6�̎�ނƁA���ꂼ��";
		mes "3�i�K�̃O���[�h�����鎖��";
		mes "�킩���Ă����B";
		next;
		mes "[�`�F�C�R]";
		mes "���Ƃ���^ff0000���_�̘r��2^000000�ƌ�����";
		mes "��(Str)�Ɋւ���A�C�e����";
		mes "�O���[�h�Ƃ��Ă�2�i�K�ڂƂ������ˁB";
		next;
		mes "[�`�F�C�R]";
		mes "�������炪�厖�Șb��B";
		mes "���̖��_�G���`�����g�A";
		mes "^ff0000�����O���[�h�œ�����ނ̃A�C�e����";
		mes "�����g���ăA�b�v�O���[�h���o����́B^000000";
		mes "�����̐��ʂ�B�@�������Ȃ��H";
		next;
		mes "[�`�F�C�R]";
		mes "�������A���s����ꍇ�������B";
		mes "���s�����ꍇ�A^ff0000���p�����A�C�e����";
		mes "�S�ď������Ă��܂��B^000000";
		mes "�����ǁA��3�i�K�̖��_�G���`�����g��";
		mes "�����󏭂����������l�͂���Ǝv����B";
		next;
		mes "[�`�F�C�R]";
		mes "�����c�c�A�b�v�O���[�h��";
		mes "������ށE�i�K�̂��̂łȂ���";
		mes "�o���Ȃ��݂����B";
		mes "�W�߂�A�C�e���̎�ނ��������A";
		mes "�Ⴄ��ނւ̃A�b�v�O���[�h��";
		mes "�o���Ȃ�������B";
		next;
		mes "[�`�F�C�R]";
		mes "�����͂����܂ł�B";
		mes "���������킵�����ꍇ��";
		mes "���̕���p�ӂ��Ă����ɂ��āB";
		mes "���̌����������ł������N������";
		mes "�����ɂȂ�΍K������B";
		next;
		mes "[�A�b�v�O���[�h]";
		mes "��1�i�K�@���@��2�i�K";
		mes "������ނ̑�1�i�K�̖��_�G���`�����g";
		mes "^ff00003��^000000";
		next;
		mes "[�A�b�v�O���[�h]";
		mes "��2�i�K�@���@��3�i�K";
		mes "������ނ̑�2�i�K�̖��_�G���`�����g";
		mes "^ff00005��^000000";
		close;
	case 3:
		mes "[�`�F�C�R]";
		mes "���_�G���`�����g�Ɋւ���";
		mes "�b���������炢�ł����āB";
		close;
	}
	while(1) {
		mes "[�`�F�C�R]";
		mes "���ꂶ�Ⴀ�A�b�v�O���[�h������";
		mes "�A�C�e���̎�ނ������Ă����H";
		next;
		set '@menu,select("���_�̘r��(Str)","���_�̐v��(Agi)","���_�̗̑�(Vit)","���_�̒m��(Int)","���_�̏W��(Dex)","���_�̍K�^(Luk)","��߂�")-1;
		switch('@menu) {
		case 0:
			set '@upstate$,"���_�̘r��";
			set '@need,4908;
			break;
		case 1:
			set '@upstate$,"���_�̐v��";
			set '@need,4914;
			break;
		case 2:
			set '@upstate$,"���_�̗̑�";
			set '@need,4917;
			break;
		case 3:
			set '@upstate$,"���_�̒m��";
			set '@need,4911;
			break;
		case 4:
			set '@upstate$,"���_�̏W��";
			set '@need,4920;
			break;
		case 5:
			set '@upstate$,"���_�̍K�^";
			set '@need,4923;
			break;
		case 6:
			mes "[�`�F�C�R]";
			mes "���킵�������ɂ܂����āB";
			close;
		}
		mes "[�`�F�C�R]";
		mes "�ǂ̒i�K�̃A�b�v�O���[�h��";
		mes "���킷��H";
		next;
		switch(select("��1�i�K�@���@��2�i�K","��2�i�K�@���@��3�i�K","��߂�")) {
		case 1:
			set '@upgrade$,"��1�i�K�@���@��2�i�K";
			set '@amount,3;
			set '@rate,6500;
			break;
		case 2:
			set '@upgrade$,"��2�i�K�@���@��3�i�K";
			set '@need,'@need+1;
			set '@amount,5;
			set '@rate,2500;
			break;
		case 3:
			mes "[�`�F�C�R]";
			mes "���킵�������ɂ܂����āB";
			close;
		}
		mes "[�`�F�C�R]";
		mes "���Ȃ����I�񂾂̂́c�c";
		mes '@upstate$;
		mes '@upgrade$;
		mes "�c�c����ł���������H";
		next;
		switch(select("�͂�","������x�I�тȂ���","����ς��߂�")) {
		case 1:
			break;
		case 2:
			continue;
		case 3:
			mes "[�`�F�C�R]";
			mes "���킵�����Ȃ����痈�āB";
			close;
		}
		break;
	}
	if(countitem('@need) < '@amount) {
		mes "[�`�F�C�R]";
		mes getitemname('@need)+ "������Ȃ���B";
		mes '@amount+ "�A�K�v��B";
		close;
	}
	mes "[�`�F�C�R]";
	mes "���ꂶ�Ⴀ�s����B";
	mes "���܂������悤�F���ĂˁB";
	next;
	mes "[�`�F�C�R]";
	mes "�������c�c�`�F�C�`�F�C�I";
	mes "�@";
	mes "�]�ڂ���ĉ��������n�߂��]";
	misceffect 72;
	next;
	mes "[�`�F�C�R]";
	mes "���傢��[!!!";
	misceffect 8;
	next;
	if(rand(10000) < '@rate) {
		misceffect 182;
		mes "[�`�F�C�R]";
		mes "��c�c������[�I�@���������I";
		mes "�ˁH�@�������ł���B";
		mes "�����A���ꂪ�A�C�e����B";
		mes "�܂����킵���������痈�ĂˁB";
		delitem '@need,'@amount;
		getitem '@need+1,1;
		close;
	}
	else {
		misceffect 183;
		mes "[�`�F�C�R]";
		mes "�����A�������c�c�B";
		mes "���s�����c�c�I";
		mes "���߂�Ȃ����B";
		mes "�������͐��������邩��";
		mes "�܂������Ă��Ă��������c�c�B";
		delitem '@need,'@amount;
		close;
	}
OnInit:
	waitingroom "���_�G���`�����g",0;
	end;
}

moro_cav.gat,36,57,5	script	�挭�����m#moro	707,{
	if(BIOS_1QUE == 0 || MORS_1QUE == 0) {
		mes "[���m]";
		mes "���̓����N�����Ɍ�����";
		mes "�`���ҒB����";
		mes "�F�X�ȏ������W���Ă��܂��B";
		next;
		mes "[���m]";
		mes "^ff0000���F����^000000��";
		mes "^ff0000�Ԃ���^000000��";
		mes "���������Ă��Ă��������B";
		mes "�����̒������ʂ�񍐂��Ă��ꂽ��";
		mes "����Ɍo���l�����n�����܂��B";
		next;
		mes "[���m]";
		mes "�����ł������̏�񂪗~�����ł��B";
		mes "���x�񍐂��Ă��������Ă��\���܂���B";
		mes "�����͂�낵�����肢���܂��B";
		mes "�@";
		mes "�]^ff0000�J��Ԃ��\�Ȉ˗��ł��B^000000�]";
		close;
	}
	set '@count,BIOS_1QUE + MORS_1QUE;
	mes "[���m]";
	mes "�����A^ff0000���F����^000000��^ff0000�Ԃ���^000000��";
	mes "�������I���܂������B";
	mes "����^ff0000" +'@count+ "�l^000000��";
	mes "�������Ă��ꂽ�̂ł��ˁB";
	mes "���肪�Ƃ��������܂��B";
	mes "�������e��񍐂��Ă��炦�܂����H";
	next;
	if(select("�񍐂���","�܂��񍐂��Ȃ�") == 2) {
		mes "[���m]";
		mes "�������e���܂Ƃ܂�����";
		mes "���������Ă��������B";
		close;
	}
	mes "[���m]";
	mes "�Ȃ�قǁA���ł͂���Ȃ��Ƃ��c�c�B";
	mes "�񍐂��肪�Ƃ��������܂��B";
	next;
	mes "[���m]";
	mes "�܂����ɉ������邩������܂���B";
	mes "�����񍐂͈��������󂯕t���܂��̂ŁA";
	mes "^ff0000���F����^000000��^ff0000�Ԃ���^000000��";
	mes "�������I�����玄�ɕ񍐂��Ă��������B";
	set '@base,1250000 * '@count;
	set '@job,500000 * '@count;
	set BIOS_1QUE,0;
	set MORS_1QUE,0;
	getexp '@base,0,1;
	getexp 0,'@job,0;
	close;
OnInit:
	waitingroom "�r�I�X�̓��E�����X�̓��A��V",0;
	end;
}

moro_vol.gat,0,0,0	script	moro_vol_mon	-1,{
OnTimer10000:
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob1);
	if('@x < 292-15 || '@x > 292+15 || '@y < 201-15 || '@y > 201+15) {
		set 'mob1call,1;
		unittalk 'mob1,"���̕��̖��߂��B������֖߂�Ȃ���΁c�c�B";
	}
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob2);
	if('@x < 277-15 || '@x > 277+15 || '@y < 238-15 || '@y > 238+15) {
		set 'mob2call,1;
		unittalk 'mob2,"���̕��̖��߂��B������֖߂�Ȃ���΁c�c�B";
	}
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob3);
	if('@x < 216-15 || '@x > 216+15 || '@y < 245-15 || '@y > 245+15) {
		set 'mob3call,1;
		unittalk 'mob3,"���̕��̖��߂��B������֖߂�Ȃ���΁c�c�B";
	}
	end;
OnTimer15000:
	if('mob1dead > 0) {
		set 'mob1dead,'mob1dead - 1;
		if('mob1dead <= 0) {
			set 'mob1,callmonster("moro_vol.gat",rand(288,296),rand(197,205),"���΂̃����N�̌��g",3039,"moro_vol_mon::OnKilled1");
		}
	}
	else if('mob1call > 0) {
		set 'mob1call,0;
		set '@mob1hp,getmobhp('mob1);
		set '@dummy,removemonster('mob1);
		set 'mob1,callmonster("moro_vol.gat",rand(288,296),rand(197,205),"���΂̃����N�̌��g",3039,"moro_vol_mon::OnKilled1");
		setmobhp 'mob1,'@mob1hp;
	}
	if('mob2dead > 0) {
		set 'mob2dead,'mob2dead - 1;
		if('mob2dead <= 0) {
			set 'mob2,callmonster("moro_vol.gat",rand(273,281),rand(234,242),"�c�񂾃����N�̌��g",3040,"moro_vol_mon::OnKilled2");
		}
	}
	else if('mob2call > 0) {
		set 'mob2call,0;
		set '@mob2hp,getmobhp('mob2);
		set '@dummy,removemonster('mob2);
		set 'mob2,callmonster("moro_vol.gat",rand(273,281),rand(234,242),"�c�񂾃����N�̌��g",3040,"moro_vol_mon::OnKilled2");
		setmobhp 'mob2,'@mob2hp;
	}
	if('mob3dead > 0) {
		set 'mob3dead,'mob3dead - 1;
		if('mob3dead <= 0) {
			set 'mob3,callmonster("moro_vol.gat",rand(212,220),rand(241,249),"��C�̃����N�̌��g",3041,"moro_vol_mon::OnKilled3");
		}
	}
	else if('mob3call > 0) {
		set 'mob3call,0;
		set '@mob3hp,getmobhp('mob3);
		set '@dummy,removemonster('mob3);
		set 'mob3,callmonster("moro_vol.gat",rand(212,220),rand(241,249),"��C�̃����N�̌��g",3041,"moro_vol_mon::OnKilled3");
		setmobhp 'mob3,'@mob3hp;
	}
	initnpctimer;
	end;
OnKilled1:
	set 'mob1call,0;
	set 'mob1dead,6;
	end;
OnKilled2:
	set 'mob2call,0;
	set 'mob2dead,6;
	end;
OnKilled3:
	set 'mob3call,0;
	set 'mob3dead,6;
	end;
OnInit:
	initnpctimer;
	set 'mob1,callmonster("moro_vol.gat",rand(288,296),rand(197,205),"���΂̃����N�̌��g",3039,"moro_vol_mon::OnKilled1");
	set 'mob2,callmonster("moro_vol.gat",rand(273,281),rand(234,242),"�c�񂾃����N�̌��g",3040,"moro_vol_mon::OnKilled2");
	set 'mob3,callmonster("moro_vol.gat",rand(212,220),rand(241,249),"��C�̃����N�̌��g",3041,"moro_vol_mon::OnKilled3");
	end;
}

//============================================================
// �G�N���[�W���ǉ�NPC
//------------------------------------------------------------
ecl_in01.gat,38,98,1	script	�����ړ��@#143_1	10007,{
	mes "[�G�N���[�W���K�[�h]";
	mes "�ŋߔ������ꂽ�����̉B��ƁA";
	mes "^FF0000�t���C�����@���[^000000��";
	if(FVOL_1QUE < 9) {
		mes "�ړ��ł��鎟���ړ��@�ł��B";
		mes "���A���ݒ������ł��̂�";
		mes "���p���邱�Ƃ��ł��܂���B";
		next;
		mes "�]���̎����ړ��@�𗘗p����ɂ�";
		mes "�@�t���C�����@���[�ւ̓��N�G�X�g��";
		mes "�@�r���܂Ői�߂�K�v������܂��]";
		close;
	}
	mes "�q�����Ă��鎟���ړ��@�ł��B";
	mes "���p���܂����H";
	next;
	if(select("�t���C�����@���[�Ɉړ�","��߂�") == 2) {
		mes "�]�ړ��@���g���̂���߂��]";
		close;
	}
	mes "�]�����ړ��@���g����";
	mes "�@�t���C�����@���[�Ɉړ����܂��]";
	close2;
	warp "moro_vol.gat",91,102;
	end;
}

ecl_in01.gat,35,89,6	script	���w�҃A�}���f�B�[#143_	620,{
	mes "[�A�}���f�B�[]";
	mes "�����̋��ԂƂ������̂�";
	mes "���̐��E�ɑ傫�ȑŌ���";
	mes "�^���Ȃ���΂����̂ł����B";
	mes "����ɂ��Ă����΃G�C���@���g�ł��ˁB";
	next;
	mes "[�����j�[]";
	mes "�c�c���͂��̎҂��������B";
	next;
	mes "[�A�}���f�B�[]";
	mes "����ł����͂͂��Δ����Ă����";
	mes "�v���܂���H";
	next;
	mes "[�����j�[]";
	mes "�����ړ��@�Ȃ�Ă��̂�";
	mes "�ȒP�ɍ���Ă��܂��Ƃ͂ȁB";
	mes "���͔͂F�߂邪�c�c�B";
	mes "�Ƃ���ŁA���̃G�C���@���g��";
	mes "�ˑR�}�����̗͂ɂȂ�Ȃ�āA";
	mes "�ǂ��������̐����񂵂Ȃ񂾁H";
	next;
	mes "[�A�}���f�B�[]";
	mes "����ƂȂ������Ă݂���";
	mes "�ߖłڂ��Ƃ��Ȃ�Ƃ��c�c�B";
	mes "�}�����̏o���Ɋւ���";
	mes "���ł͂Ȃ����Ǝv���܂����A";
	mes "�ڂ�������͂킩��܂���ˁB";
	next;
	mes "[�A�}���f�B�[]";
	mes "�ڂ����������Ƃ�����A";
	mes "���̂��Ƃ��o�J�ɂ���";
	mes "�͂��炩����܂����B";
	mes "�����c�c�ǂ����Ă���Ȃ̂�";
	mes "���w�̓V�˂Ȃ񂾁c�c�B";
	next;
	mes "[�����j�[]";
	mes "�c�c�������Ǝv���Ȃ�׋�����B";
	mes "�׋��͎����ׂ̈ɂȂ�c�c�B";
	close;
}

ecl_in01.gat,37,90,3	script	���w�҃����j�[#143_3	611,{
	mes "[�����j�[]";
	mes "����̌����S���̔��͓ǂ񂾂��H";
	mes "�G�C���@���g���V���������";
	mes "�����ړ��@�̌������ڂ��Ă����炵���B";
	next;
	mes "[�A�}���f�B�[]";
	mes "�ǂ݂܂�����B";
	mes "��b���������f�ڂ���Ă��܂����B";
	mes "�����Ɍ����ƌ��Ă�";
	mes "�C�}�C�`������Ȃ������ł��B";
	next;
	mes "[�����j�[]";
	mes "�ӂށc�c";
	mes "�G�C���@���g�͍���̎d��������������";
	mes "��X�I�Ɍ���������";
	mes "�n�߂悤�Ƃ��Ă���̂�������Ȃ��ȁB";
	next;
	mes "[�����j�[]";
	mes "��H�@�l�Ԃ���Ȃ����H";
	mes "���B�̘b�𓐂ݕ��������̂��H";
	mes "�܂��A�ʂɗǂ����c�c";
	next;
	mes "[�����j�[]";
	mes "���O���������ɍs���̂��H";
	mes "�ŋ߁A�����̋��Ԃ���������{�l�ł���";
	mes "�����̉B��Ƃ���������";
	mes "�݂�ȑ����ł��邼�B";
	next;
	mes "[�����j�[]";
	mes "�C�ɂȂ�Ȃ炨�O��";
	mes "���̈ړ��@���g���Ă݂�Ƃ����B";
	mes "���X�悢���̂������邩��B";
	mes "������񖽂܂ŕۏ؂͂ł��Ȃ����ǂˁB";
	mes "����͂͂͂́I";
	next;
	mes "[�A�}���f�B�[]";
	mes "�����j�[�c�c";
	mes "�N�͂��̐��i�Ȃ�Ƃ����Ȃ��ƁB";
	mes "�͂����c�c�B";
	close;
}

ecl_in01.gat,44,99,1	script	���t�B�l���m#143_4	461,{
	mes "[���t�B�l���m]";
	mes "�c�c�ْ����Ă��܂����ˁB";
	close;
OnTalk1:
	unittalk "���[�I";
	end;
OnTalk2:
	unittalk "�c�c";
	end;
}

ecl_in01.gat,46,99,1	script	���t�B�l���m#143_5	461,{
	mes "[���t�B�l���m]";
	mes "�����ɖ߂��ė����邩�ȁB";
	close;
OnTalk1:
	unittalk "���[�I";
	end;
OnTalk2:
	unittalk "�c�c���c�c";
	end;
}

ecl_in01.gat,48,99,1	script	���t�B�l���m#143_6	461,{
	mes "[���t�B�l���m]";
	mes "�ӂށc�c�B";
	close;
OnTalk1:
	unittalk "���[�I";
	end;
OnTalk2:
	unittalk "�c�c";
	end;
}

ecl_in01.gat,44,97,1	script	���t�B�l���m#143_7	462,{
	mes "[���t�B�l���m]";
	mes "�Â��ɁB";
	close;
OnTalk1:
	unittalk "�����I";
	end;
OnTalk2:
	unittalk "�����������`";
	end;
}

ecl_in01.gat,46,97,1	script	���t�B�l���m#143_8	462,{
	mes "[���t�B�l���m]";
	mes "����Ǝ����D��Ă��邱�Ƃ�";
	mes "����������`�����X���������B";
	close;
OnTalk1:
	unittalk "���[�I";
	end;
OnTalk2:
	unittalk "�c�c";
	end;
}

ecl_in01.gat,48,97,1	script	���t�B�l���m#143_9	462,{
	mes "[���t�B�l���m]";
	mes "�����ǂ����ĕ��m�Ɏu�肵����";
	mes "�킩��܂����H";
	mes "���������Ƒ̂��g�������Ȃ���ł��B";
	mes "�S���̔��ɓ���̂�";
	mes "�ǂ����Ă���Ȃɓ���񂾁c�c�B";
	close;
OnTalk1:
	unittalk "���[�I";
	end;
OnTalk2:
	unittalk "�c�c";
	end;
}

ecl_in01.gat,46,102,6	script	�w�������t�B�l#143_10	447,5,5,{
	mes "[�w�������t�B�l]";
	mes "�ł̎�͔���������";
	mes "�����Ă��܂����ق��������ł��B";
	mes "���Ƃ����Ȃ��B�̃~�b�h�K���h�嗤����";
	mes "���ŗ����ٕς��Ƃ��Ă��c�c�B";
	next;
	mes "[�w�������t�B�l]";
	mes "���̎����Ɛ��E���ɉe����^����";
	mes "���Ƃ��Ĕ��f�����΁A������O�ł���";
	mes "���B���t�B�l�͈��̍���ׂ̈ɐ킢�܂��B";
	close;
OnTouch:
	if(!getnpctimer(1))
		initnpctimer;
	end;
OnTimer3000:
	unittalk "�w���� : ���N�I�@���悢���X���P���̐��ʂ������鎞�������I";
	end;
OnTimer5000:
	donpcevent "���t�B�l���m#143_4::OnTalk1";
	donpcevent "���t�B�l���m#143_5::OnTalk1";
	donpcevent "���t�B�l���m#143_6::OnTalk1";
	donpcevent "���t�B�l���m#143_7::OnTalk1";
	donpcevent "���t�B�l���m#143_8::OnTalk1";
	donpcevent "���t�B�l���m#143_9::OnTalk1";
	end;
OnTimer8000:
	unittalk "�w���� : �Ȃ񂾁H�@�r���ɕςȐ����������Ă������H";
	end;
OnTimer11000:
	unittalk "�w���� : �O����n�X�v�����f�B�b�h�̐�F�B�Ɉ������Ƃ�Ȃ��p�������Ȃ���΂Ȃ�Ȃ��B";
	end;
OnTimer14000:
	unittalk "�w���� : �C����������������߂�I�@�������͖����ɉ�ɍs����!!";
	end;
OnTimer16000:
	donpcevent "���t�B�l���m#143_7::OnTalk2";
	end;
OnTimer18000:
	donpcevent "���t�B�l���m#143_4::OnTalk2";
	donpcevent "���t�B�l���m#143_5::OnTalk2";
	donpcevent "���t�B�l���m#143_6::OnTalk2";
	donpcevent "���t�B�l���m#143_8::OnTalk2";
	//donpcevent "���t�B�l���m#143_9::OnTalk2";
	end;
OnTimer21000:
	unittalk "�w���� : ����c�c�Ȃ����H�@�ǂ����ċ}�ɂ��ƂȂ����Ȃ��Ă��܂��񂾁c�c�H";
	end;
OnTimer24000:
	stopnpctimer;
	end;
}

ecl_in01.gat,40,96,3	script	�G�N���[�W���K�[�h	447,{
	mes "[�G�N���[�W���K�[�h]";
	mes "�Ȃ�̗p�ł����H";
	next;
	switch(select("���̈ړ��@�͉��ł����H","�ǂ����Đl�������W�܂��Ă����ł����H","�����̉B��ƁH","�撣���ĉ�����")) {
	case 1:
		mes "[�G�N���[�W���K�[�h]";
		mes "�c�c���������N���B��Ă��邱�Ƃ�";
		mes "���炩�ɂȂ����n��Ɉړ��ł���";
		mes "�����ړ��@�ł��B";
		mes "�����̋��Ԃƌq�����Ă����ł����A";
		mes "�����̖��ɐ��m�ȏꏊ�܂�";
		mes "�s����悤�ɂȂ����̂ł��B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "���ɑ����̕��m������";
		mes "�����̉B��Ƃɍs���܂����B";
		mes "���������݂����Ԃ�";
		mes "���E���̋��ЂɂȂ邩���m��Ȃ��̂ŁA";
		mes "���������ɎQ������\��ł��B";
		close;
	case 2:
		mes "[�G�N���[�W���K�[�h]";
		mes "�~�b�h�K���h�嗤���瓦����";
		mes "���������N�̉B��Ƃ�";
		mes "�T���o��������ł��B";
		mes "�������c�c";
		mes "��������ǂ��o���Ȃ���΂Ȃ�܂���B";
		mes "���E����i���ɖ߂��ė���Ȃ��悤�B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "���Ȃ���������ގ�����ׂ�";
		mes "�����ɎQ������̂ł���΁A";
		mes "�����ɂ��鎟���ړ��@�𗘗p���ĉ������B";
		mes "�����c�̂���ꏊ��";
		mes "�ړ����邱�Ƃ��ł��܂��B";
		close;
	case 3:
		mes "[�G�N���[�W���K�[�h]";
		mes "�����̋��Ԃ͒m���Ă��܂���ˁH";
		mes "�ŋ߁A�����̋��Ԃ̓�����";
		mes "�����̒ʘH�ɂȂ��Ă��邱�Ƃ�";
		mes "���炩�ɂȂ�܂����B";
		mes "����𗘗p���āA�����̋��ԓ�����";
		mes "�T���ł���悤�ɂȂ����̂ł��B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "���Ƃ��Ǝ����̋��Ԃ�";
		mes "���������N�����g���B������";
		mes "������ے��ɍ�������̂Ȃ̂ŁA";
		mes "���Ԃ𒲍����Ă���΂�����";
		mes "���������N�𔭌��ł��邾�낤��";
		mes "�l���Ă��܂����B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "�����Ă��ɖ����̉B��Ƃ�";
		mes "���������n��������A";
		mes "^FF0000�t���C�����@���[^000000�Ɩ��t���܂����B";
		mes "�c�c�����̍��ՂƁc�c���������c�c";
		mes "���̒����ɂ��鋐��ȍ�𒆐S��";
		mes "����Ă��܂��B";
		next;
		mes "[�G�N���[�W���K�[�h]";
		mes "�ڂ������e�͂��Ԃ񌻏�̕���";
		mes "�m���Ă���ł��傤�B";
		mes "�����ړ��@���g���A�ړ����Ă��������B";
		close;
	case 4:
		mes "[�G�N���[�W���K�[�h]";
		mes "���Ȃ��ɂ�";
		mes "���E���̉��삪����܂��悤�ɁB";
		close;
	}
}

ecl_in01.gat,47,106,6	script	�J���f���C#14301	624,{
	end;
OnHour01: OnHour03: OnHour05:
OnHour07: OnHour09: OnHour11:
OnHour13: OnHour15: OnHour17:
OnHour19: OnHour21: OnHour23:
	initnpctimer;
	hideoffnpc "�J���f���C#14301";
	announce "�J���f���C : �G�N���[�W���̂��ׂĂ̖���B",0x9,0x00ff00;
	end;
OnTimer3000:
	announce "�J���f���C : ���E���C�O�h���V���̎��҂Ƃ��ăI�[�u�̖��͂�������ė͂������B",0x9,0x00ff00;
	end;
OnTimer6000:
	hideoffnpc "#ecl_orb_buff";
	hideoffnpc "#ecl_buff_N";
	hideoffnpc "#ecl_buff_E";
	hideoffnpc "#ecl_buff_S";
	hideoffnpc "#ecl_buff_W";
	end;
OnTimer9000:
	announce "�J���f���C : �C�O�h���V���̗͂Ŏ����̋��Ԃ𗐂��Ă���łƐ���Ă��������B",0x9,0x00ff00;
	hideonnpc "#ecl_buff_N";
	hideonnpc "#ecl_buff_E";
	hideonnpc "#ecl_buff_S";
	hideonnpc "#ecl_buff_W";
	end;
OnTimer12000:
	announce "�J���f���C : �I�[�u�̖��͂͂��΂炭������Ă����܂��B",0x9,0x00ff00;
	end;
OnTimer15000:
	announce "�J���f���C : �^�̕��a���c�c",0x9,0x00ff00;
	end;
OnTimer600000:
	announce "�J���f���C : ������Ă����I�[�u�̖��͂𕕈󂵂܂��B",0x9,0x00ff00;
	end;
OnTimer603000:
	hideonnpc "#ecl_orb_buff";
	end;
OnTimer606000:
	announce "�J���f���C : �ł�ǂ������܂Łc�c�ǂ����ǂ���������܂��悤�Ɂc�c�B",0x9,0x00ff00;
	end;
OnTimer609000:
	stopnpctimer;
	misceffect 313,"�J���f���C#14301";
	hideonnpc "�J���f���C#14301";
	end;
}

ecl_in01.gat,48,67,0	script	#ecl_orb_buff	139,10,10,{
OnTouch:
	misceffect 313,"";
	sc_start SC_BLESSING,240000,10;
	sc_start SC_MSTR,5400000,6;
	sc_start SC_MAGI,5400000,6;
	sc_start SC_MVIT,5400000,6;
	sc_start SC_MINT,5400000,6;
	sc_start SC_MDEX,5400000,6;
	sc_start SC_MLUK,5400000,6;
	sc_start SC_ATKPOTION,5400000,24;
	sc_start SC_MATKPOTION,5400000,24;
	percentheal 100,100;
	misceffect 362,"";
	end;
}

ecl_in01.gat,48,67,0	script	�I�[�u#orb	844,{
	if(ECL_3QUE < 33 || FVOL_1QUE < 100) {
		mes "�]�I�[�u�̖��͂���������]";
		close;
	}
	if(checkquest(116540) == 0) {
		mes "�]�I�[�u�ɐG���Ɠ��̒���";
		mes "�@�J���f���C�̐��������Ă����]";
		next;
		mes "[�J���f���C]";
		mes strcharinfo(0)+"�A";
		mes "���̐����������邩���H";
		next;
		mes "[�J���f���C]";
		mes "���̃I�[�u�ɂ͓��ʂȖ��͂�";
		mes "���߂��Ă���񂾁B";
		mes "���̖��͂��󂯂��҂�";
		mes "���͂ȗ͂𓾂邱�Ƃ��ł���B";
		next;
		mes "[�J���f���C]";
		mes "�{���͎����������";
		mes "�F�ɕ����^���Ă�����̂����A";
		mes "���̃G�N���[�W���̂��߂�";
		mes "�͂�s�����Ă��ꂽ�N�ɂ́A";
		mes "���ʂɂ��̃I�[�u�̖��͂�";
		mes "���R�Ɏg����悤�ɂ��Ă����悤�B";
		next;
		mes "[�J���f���C]";
		mes "�����A�������ɌN��l��";
		mes "�Ɛ肳����킯�ɂ͂����Ȃ�����ˁB";
		mes "�I�[�u�̖��͂��g���̂�";
		mes "�قǂقǂɂ��Ă����Ă���B";
		next;
		mes "[�J���f���C]";
		mes "���ƁA���܂ɂ͊�������āA";
		mes "���̘b������ɂȂ��Ă����B";
		mes "�ӂӁc�c";
		mes "�C�O�h���V���̏j�����N�̂��΂Ɂc�c�B";
		next;
		mes "�]�I�[�u�̖��͂��󂯂邱�Ƃ�";
		mes "�@�ł���悤�ɂȂ�܂����B";
		mes "�@�I�[�u�̖��͂�^ff000018���Ԃ�1��^000000";
		mes "�@�󂯂邱�Ƃ��ł��܂��]";
		setquest 116540;
		compquest 116540;
		close;
	}
	if(checkquest(116541)) {
		if(checkquest(116541)&2 == 0) {
			mes "�]�I�[�u�̖��͂�^ff000018���Ԃ�1��^000000";
			mes "�@�󂯂邱�Ƃ��ł��܂��]";
			close;
		}
		delquest 116541;
	}
	mes "�]�I�[�u�̖��͂�^ff000018���Ԃ�1��^000000";
	mes "�@�󂯂邱�Ƃ��ł��܂��B";
	mes "�@�I�[�u�̖��͂��󂯂܂����H�]";
	next;
	if(select("�󂯂�","�󂯂Ȃ�") == 2) {
		mes "�]���Ȃ��̓I�[�u���痣�ꂽ�]";
		close;
	}
	misceffect 313,"";
	sc_start SC_BLESSING,240000,10;
	sc_start SC_MSTR,5400000,6;
	sc_start SC_MAGI,5400000,6;
	sc_start SC_MVIT,5400000,6;
	sc_start SC_MINT,5400000,6;
	sc_start SC_MDEX,5400000,6;
	sc_start SC_MLUK,5400000,6;
	sc_start SC_ATKPOTION,5400000,24;
	sc_start SC_MATKPOTION,5400000,24;
	percentheal 100,100;
	misceffect 362,"";
	setquest 116541;
	close;
}

ecl_in01.gat,47,92,0	duplicate(#ecl_orb_buff)	#ecl_buff_N	139,10,10
ecl_in01.gat,71,67,0	duplicate(#ecl_orb_buff)	#ecl_buff_E	139,10,10
ecl_in01.gat,48,44,0	duplicate(#ecl_orb_buff)	#ecl_buff_S	139,10,10
ecl_in01.gat,23,68,0	duplicate(#ecl_orb_buff)	#ecl_buff_W	139,10,10

ecl_in01.gat,58,101,3	script	�ē���	837,{
	mes "[�J���f���C�l��";
	mes " ���z���ɂȂ��鎞��]";
	mes "^FF0000  1:00 ,  3:00 ,  5:00";
	mes "  7:00 ,  9:00 , 11:00";
	mes "13:00 , 15:00 , 17:00";
	mes "19:00 , 21:00 , 23:00^000000";
	close;
}
