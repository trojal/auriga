//====================================================================
//Ragnarok Online - Lasagna Town Script	by refis
//====================================================================

//============================================================
// ���Ît
//============================================================
lasagna.gat,305,242,4	script	���Ît�n��	10164,{
	set '@price,5000;

	mes "[���Ît�n��]";
	if(Job == Job_Summoner) {
		mes "�₠�B���q�͂ǂ������H";
		mes "���ÂȂ�C���Ă����B";
		if(BaseLevel < 100) {
			mes "���܂Ȃ�BaseLv100�ȉ���";
			mes "�V�ăh�����͖�����";
			mes "���Â��Ă������B";
			set '@price,0;
		}
	}
	else {
		mes "�p�[�X�^�嗤�ւ悤�����I";
		mes "���̓��U�[�j���B��̎��Ît��";
		mes "�n���ƌ����܂��B";
	}
	next;
	if(select("���S�񕜂𗊂ށ@^0000FF" +'@price+ "Zeny^000000","��߂�") == 2) {
		mes "[���Ît�n��]";
		mes "�܂��̂����p��";
		mes "���҂����Ă���܂��B";
		close;
	}
	if(Zeny < '@price) {
		mes "[���Ît�n��]";
		mes "����c�c�H";
		mes "����������Ȃ��悤�ł��ˁB";
		mes "���Âɂ���p���K�v�ł��B";
		mes "�ǂ������������c�c�B";
		close;
	}
	misceffect 7,"";
	misceffect 14,"";
	misceffect 492,"";
	percentheal 100,100;
	npcskillsupport 28,9999;
	set Zeny,Zeny - '@price;
	mes "[���Ît�n��]";
	if(Job == Job_Summoner) {
		mes "�ӂ��A�I�������B";
		mes "���Â��K�v�ɂȂ�����";
		mes "�܂����Ă��������ˁB";
	}
	else {
		mes "���Â��I���܂����B";
		mes "�܂��̂����p��";
		mes "���҂����Ă��܂��B";
	}
	close;
}

//============================================================
// �]��NPC
//============================================================
izlude.gat,181,187,3	script	�h�����D��#izlude	544,{
	mes "[�h�����D��]";
	mes "�~�b�h�K���h�嗤����";
	mes "�p�[�X�^�嗤�ցI";
	mes "�`�����U�[�j���܂�";
	mes "^0000cd500Zeny^000000�ł��ē��I";
	next;
	if(select("���U�[�j�� -> 500 z","��߂�") == 2) {
		mes "[�h�����D��]";
		mes "�킩��܂���";
		close;
	}
	if(Zeny < 500) {
		mes "[�h�����D��]";
		mes "Zeny������Ȃ���ł����H";
		mes "���������m�F���Ă��������܂����H";
		close;
	}
	set Zeny,Zeny-500;
	warp "lasagna.gat",206,297;
	end;
}

malangdo.gat,218,81,0	script	�h�����D��#malangdo	544,{
	mes "[�h�����D��]";
	mes "�}����������";
	mes "�p�[�X�^�嗤�ցI";
	mes "�`�����U�[�j���܂�";
	mes "^0000cd500Zeny^000000�ł��ē��I";
	next;
	if(select("���U�[�j�� -> 500 z","��߂�") == 2) {
		mes "[�h�����D��]";
		mes "�킩��܂���";
		close;
	}
	if(Zeny < 500) {
		mes "[�h�����D��]";
		mes "Zeny������Ȃ���ł����H";
		mes "���������m�F���Ă��������܂����H";
		close;
	}
	set Zeny,Zeny-500;
	warp "lasagna.gat",206,297;
	end;
}

lasagna.gat,203,324,5	script	�G�b�O����#do_tu02	10157,{
	mes "[�G�b�O����]";
	if(Job == Job_Summoner) {
		mes "���������由�Ƃ���";
		mes "��ʂ̎G�p�������t����ꂽ�񂾁B";
		mes "�T�{��Ȃ������Ă��Ȃ���ˁB";
	}
	else {
		mes "���[";
		mes "�ǂ��V�C���ȁ[�B";
		mes "��D�̃T�{����a���˂��B";
	}
	next;
	mes "[�G�b�O����]";
	mes "��H";
	mes "�ǂ����ɍs�������́H";
	next;
	switch(select("�C�Y���[�h -> 0 z","�}������ -> 0 z","�s���Ȃ�")) {
	case 1:
		warp "izlude.gat",194,180;
		end;
	case 2:
		warp "malangdo.gat",217,85;
		end;
	case 3:
		mes "[�G�b�O����]";
		mes "���[�����Ȃ��B";
		close;
	}
}

//============================================================
// Shop
//============================================================
lasagna.gat,312,259,5	shop	����l#lasagna	553,11602,515,567,601,602,610,656,525,611
lasagna.gat,339,248,3	shop	����i���l#lasagna	10163,744,745,2338,2206,7170,2613

lasagna.gat,293,289,5	script	����l#do_su03	10162,{
	mes "[����l]";
	mes "��������Ⴂ�B";
	mes "�����̕i���͈ꋉ�i�΂��肾��B";
	mes "�������Ă����񂾂��H";
	next;
	switch(select("����","�h��","�A�N�Z�T���[","���Օi","��߂�")) {
	case 1:
		switch(select("�����^�C�v","���@�^�C�v","�x���񕜃^�C�v","��߂�")) {
		case 1:
			switch(select("�L����炵�̖͌^[1]","�傫�ȔL����炵�̖͌^[1]","�@�ׂȔL����炵�̖͌^[1]","���I�ȔL����炵�̖͌^[1]","���F���L����炵�̖͌^[0]","��߂�")) {
			case 1: set '@itemid,26133; set '@price,500000; set '@dpoint,50; break;
			case 2: set '@itemid,26127; set '@price,500000; set '@dpoint,50; break;
			case 3: set '@itemid,26134; set '@price,1500000; set '@dpoint,100; break;
			case 4: set '@itemid,26136; set '@price,15000000; set '@dpoint,150; break;
			case 5: set '@itemid,26137; set '@price,100000000; set '@dpoint,1000; break;
			case 6:
				mes "[����l]";
				mes "�킩�����B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			break;
		case 2:
			switch(select("�g���{���Ƃ܂����L����炵[1]","�g���{���Ƃ܂������Ȃ�L����炵[1]","�g���{���Ƃ܂����_���ȔL����炵[1]","�g���{���Ƃ܂������͂̔L����炵[1]","�g���{���Ƃ܂������F���L����炵[0]","��߂�")) {
			case 1: set '@itemid,26126; set '@price,500000; set '@dpoint,50; break;
			case 2: set '@itemid,26129; set '@price,500000; set '@dpoint,50; break;
			case 3: set '@itemid,26130; set '@price,1500000; set '@dpoint,100; break;
			case 4: set '@itemid,26131; set '@price,15000000; set '@dpoint,150; break;
			case 5: set '@itemid,26132; set '@price,100000000; set '@dpoint,1000; break;
			case 6:
				mes "[����l]";
				mes "�킩�����B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			break;
		case 3:
			switch(select("�����񕜂̔L����炵[1]","�L�x�ȉ񕜂̔L����炵[1]","��߂�")) {
			case 1: set '@itemid,26125; set '@price,500000; set '@dpoint,50; break;
			case 2: set '@itemid,26124; set '@price,15000000; set '@dpoint,150; break;
			case 3:
				mes "[����l]";
				mes "�킩�����B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			break;
		case 4:
			mes "[����l]";
			mes "�킩�����B";
			mes "�C���ς������܂����ĂˁB";
			close;
		}
		break;
	case 2:
		switch(select("�h�����X�[�c[1]","�����h�����X�[�c[1]","���I�h�����X�[�c[1]","�h�����V���[�Y[1]","�����h�����V���[�Y[1]","���I�h�����V���[�Y[1]","�h�����P�[�v[1]","�����h�����P�[�v[1]","���I�h�����P�[�v[1]","�h�����V�[���h[0]","��߂�")) {
		case 1: set '@itemid,15275; set '@price,1000000; set '@dpoint,100; break;
		case 2: set '@itemid,15276; set '@price,10000000; set '@dpoint,1000; break;
		case 3: set '@itemid,15277; set '@price,150000000; set '@dpoint,1500; break;
		case 4: set '@itemid,22185; set '@price,1000000; set '@dpoint,100; break;
		case 5: set '@itemid,22186; set '@price,10000000; set '@dpoint,1000; break;
		case 6: set '@itemid,22187; set '@price,150000000; set '@dpoint,1500; break;
		case 7: set '@itemid,20915; set '@price,1000000; set '@dpoint,100; break;
		case 8: set '@itemid,20916; set '@price,10000000; set '@dpoint,1000; break;
		case 9: set '@itemid,20917; set '@price,150000000; set '@dpoint,1500; break;
		case 10: set '@itemid,28948; set '@price,10000000; set '@dpoint,1000; break;
		case 11:
			mes "[����l]";
			mes "�킩�����B";
			mes "�C���ς������܂����ĂˁB";
			close;
		}
		break;
	case 3:
		switch(select("�����^�C�v","���@�^�C�v","�x���񕜃^�C�v","��߂�")) {
		case 1:
			switch(select("�V�N�ȑ��̃l�b�N���X[1]","�ۂ������~�~�Y�̂����[1]","�E�T�M�̂����[1]","�����E�T�M�̂����[1]","���I�E�T�M�̂����[1]","��߂�")) {
			case 1: set '@itemid,28577; set '@price,100000000; set '@dpoint,2000; break;
			case 2: set '@itemid,28591; set '@price,300000000; set '@dpoint,2000; break;
			case 3: set '@itemid,28586; set '@price,1000000; set '@dpoint,100; break;
			case 4: set '@itemid,28587; set '@price,10000000; set '@dpoint,1000; break;
			case 5: set '@itemid,28588; set '@price,500000000; set '@dpoint,5000; break;
			case 6:
				mes "[����l]";
				mes "�킩�����B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			break;
		case 2:
			switch(select("���͂̑��̃l�b�N���X[1]","����}�̂����[1]","�t�̂����[1]","�����t�̂����[1]","���I�t�̂����[1]","��߂�")) {
			case 1: set '@itemid,28579; set '@price,100000000; set '@dpoint,2000; break;
			case 2: set '@itemid,28589; set '@price,300000000; set '@dpoint,2000; break;
			case 3: set '@itemid,28583; set '@price,1000000; set '@dpoint,100; break;
			case 4: set '@itemid,28584; set '@price,10000000; set '@dpoint,1000; break;
			case 5: set '@itemid,28585; set '@price,500000000; set '@dpoint,5000; break;
			case 6:
				mes "[����l]";
				mes "�킩�����B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			break;
		case 3:
			switch(select("�������̃l�b�N���X[1]","�V�N�ȃ}�O���̂����[1]","�A�W�̂����[1]","�����A�W�̂����[1]","���I�A�W�̂����[1]","��߂�")) {
			case 1: set '@itemid,28578; set '@price,100000000; set '@dpoint,2000; break;
			case 2: set '@itemid,28590; set '@price,300000000; set '@dpoint,2000; break;
			case 3: set '@itemid,28580; set '@price,1000000; set '@dpoint,100; break;
			case 4: set '@itemid,28581; set '@price,10000000; set '@dpoint,1000; break;
			case 5: set '@itemid,28582; set '@price,500000000; set '@dpoint,5000; break;
			case 6:
				mes "[����l]";
				mes "�킩�����B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			break;
		case 4:
			mes "[����l]";
			mes "�킩�����B";
			mes "�C���ς������܂����ĂˁB";
			close;
		}
		break;
	case 4:
		setarray '@itemname$[1],"���������C���V 100��","�J���[�j���~���N","�o�W��","���U�[�j�����Y�ʋl","��߂�";
		set '@menu,select(printarray('@itemname$));
		switch('@menu) {
		case 1: set '@itemid,11601; set '@price,1000000; set '@dpoint,15; set '@num,100; break;
		case 2: set '@itemid,22984; set '@price,100000; set '@dpoint,5; set '@num,1; break;
		case 3: set '@itemid,22985; set '@price,100000; set '@dpoint,5; set '@num,1; break;
		case 4: set '@itemid,23705; set '@price,100000; set '@dpoint,5; set '@num,1; break;
		case 5:
			mes "[����l]";
			mes "�킩�����B";
			mes "�C���ς������܂����ĂˁB";
			close;
		}
		mes "[����l]";
		mes '@itemname$['@menu]+ "��";
		mes "Zeny���h�����|�C���g�ōw���\���B";
		if('@menu == 1) {
			mes "���Ȃ݂ɁA^0000ff���������C���V^000000������";
			mes "^0000ff100��1�Z�b�g^000000�̔̔��ɂȂ��B";
		}
		mes "^ff0000�����h�����|�C���g : " +DORAM_POINT+ "^000000";
		next;
		switch(select('@price+"Zeny�Ŕ���",'@dpoint+"�h�����|�C���g�Ŕ���","��߂�")) {
		case 1:
			set '@dpoint,0;
			break;
		case 2:
			set '@price,0;
			break;
		case 3:
			mes "[����l]";
			mes "�킩�����B";
			mes "�C���ς������܂����ĂˁB";
			close;
		}
		mes "[����l]";
		mes "���������B";
		mes '@itemname$['@menu]+ "��";
		mes "���i�Z�b�g�j�w������񂾂��H";
		mes "�~�߂����Ƃ��́u0�v�����ĂˁB";
		while(1) {
			next;
			input '@set;
			if('@set == 0) {
				mes "[����l]";
				mes "����������B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			if('@set < 0 || '@set > 1000) {
				mes "[����l]";
				mes "�\����Ȃ����ǁA1��̎����";
				mes "1000�ȉ��ɂ��Ă��炦�邩�ȁB";
				continue;
			}
			break;
		}
		mes "[����l]";
		mes "�m�F�����ǁA";
		mes '@itemname$['@menu]+ "��";
		mes '@set +"�i�Z�b�g�j";
		if('@price)
			mes ('@price*'@set) +"Zeny�Ŕ���";
		else
			mes ('@dpoint*'@set) +"�h�����|�C���g�Ŕ���";
		mes "�ŗǂ��񂾂ˁB";
		next;
		if(select("�͂�","������") == 2) {
			mes "[����l]";
			mes "�킩�����B";
			mes "�C���ς������܂����ĂˁB";
			close;
		}
		if('@price && '@price*'@set > Zeny) {
			mes "[����l]";
			mes "Zeny������Ȃ��݂�������B";
			mes "������x�m�F���Ă��炦�邩�ȁB";
			close;
		}
		if('@dpoint && '@dpoint*'@set > DORAM_POINT) {
			mes "[����l]";
			mes "�h�����|�C���g��";
			mes "����Ȃ��݂�������B";
			mes "������x�m�F���Ă��炦�邩�ȁB";
			close;
		}
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		if(checkweight('@itemid,'@num*'@set) == 0) {
			set '@weight,getiteminfo('@itemid,6)/10 * '@num * '@set + 1;
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽����";
			mes "�ו��������Ƃ��o���܂���B";
			mes '@weight +"�ȏ��";
			mes "�d�ʂ̋󂫂�����Ă��������B^000000";
			close;
		}
		if('@price)
			set Zeny,Zeny - '@price*'@set;
		if('@dpoint)
			set DORAM_POINT,DORAM_POINT - '@dpoint*'@set;
		getitem '@itemid,'@num*'@set;
		mes "[����l]";
		mes "�������グ���肪�Ƃ��������܂��B";
		mes "�܂����Ă��������ˁB";
		close;
	case 5:
		mes "[����l]";
		mes "�킩�����B";
		mes "�C���ς������܂����ĂˁB";
		close;
	}
	mes "[����l]";
	mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]��";
	mes "Zeny���h�����|�C���g�ōw���\���B";
	mes "^ff0000�����h�����|�C���g : " +DORAM_POINT+ "^000000";
	next;
	switch(select('@price+"Zeny�Ŕ���",'@dpoint+"�h�����|�C���g�Ŕ���","��߂�")) {
	case 1:
		set '@dpoint,0;
		break;
	case 2:
		set '@price,0;
		break;
	case 3:
		mes "[����l]";
		mes "�킩�����B";
		mes "�C���ς������܂����ĂˁB";
		close;
	}
	mes "[����l]";
	mes "�m�F�����ǁA";
	mes getitemname('@itemid)+ "[" +getiteminfo('@itemid,10)+ "]��";
	if('@price)
		mes '@price+"Zeny�Ŕ���";
	else
		mes '@dpoint+"�h�����|�C���g�Ŕ���";
	mes "�ŗǂ��񂾂ˁB";
	next;
	if(select("�͂�","������") == 2) {
		mes "[����l]";
		mes "�킩�����B";
		mes "�C���ς������܂����ĂˁB";
		close;
	}
	if('@price && '@price > Zeny) {
		mes "[����l]";
		mes "Zeny������Ȃ��݂�������B";
		mes "������x�m�F���Ă��炦�邩�ȁB";
		close;
	}
	if('@dpoint && '@dpoint > DORAM_POINT) {
		mes "[����l]";
		mes "�h�����|�C���g��";
		mes "����Ȃ��݂�������B";
		mes "������x�m�F���Ă��炦�邩�ȁB";
		close;
	}
	if(checkitemblank() == 0) {
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "����ȏ㑽���̎�ނ�";
		mes "�ו��������Ƃ��o���܂���B";
		mes "1�ȏ�̋󂫂�����Ă��������B^000000";
		close;
	}
	if(checkweight('@itemid,1) == 0) {
		set '@weight,getiteminfo('@itemid,6)/10 + 1;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "����ȏ㑽����";
		mes "�ו��������Ƃ��o���܂���B";
		mes '@weight +"�ȏ��";
		mes "�d�ʂ̋󂫂�����Ă��������B^000000";
		close;
	}
	if('@price)
		set Zeny,Zeny - '@price;
	if('@dpoint)
		set DORAM_POINT,DORAM_POINT - '@dpoint;
	getitem '@itemid,1;
	mes "[����l]";
	mes "�������グ���肪�Ƃ��������܂��B";
	mes "�܂����Ă��������ˁB";
	close;
}

lasagna.gat,298,289,5	script	���H�E�l#do_su03	555,{
	mes "[���H�E�l]";
	mes "��������Ⴂ�B";
	mes "�����͂ǂ������񂾂��H";
	next;
	switch(select("�A�b�v�O���[�h","�A�b�v�O���[�h�Ή��̃��X�g������","��߂�")) {
	case 1:
		mes "[���H�E�l]";
		mes "�A�b�v�O���[�h������]���ˁB";
		mes "�܂��͐����������B";
		next;
		mes "[���H�E�l]";
		mes "�N�̑������Ă��鑕����";
		mes "��i�K��̑�����";
		mes "�A�b�v�O���[�h���ēn����B";
		mes "���̍ۂ̒��ӓ_�����ǁA";
		mes "���B�l���u0�v�ɖ߂��Ă��܂�����";
		mes "�悭�l���Ă��痘�p���ĂˁB";
		next;
		mes "[���H�E�l]";
		mes "^0000ff��������Ă���J�[�h��";
		mes "�A�b�v�O���[�h��ɑΉ�����";
		mes "�X���b�g������΂��̂܂�";
		mes "�ێ��ł����B^000000���ꂪ";
		mes "�l�̒񋟂���A�b�v�O���[�h��";
		mes "�����b�g���B";
		next;
		mes "[���H�E�l]";
		mes "���Ȃ݂ɁA�A�b�v�O���[�h�����";
		mes "���̑����ɖ߂����Ƃ�";
		mes "�����Ăł��Ȃ��̂ŁA���ӂ��ĂˁB";
		next;
		mes "[���H�E�l]";
		mes "��A�A�b�v�O���[�h�̍ۂ�";
		mes "�萔���Ƃ��đ�����Zeny��";
		mes "�h�����|�C���g�𒸂���B";
		while(1) {
			next;
			mes "[���H�E�l]";
			mes "�ł́A�A�b�v�O���[�h������";
			mes "������I��ł���邩�ȁB";
			setarray '@item,15275,15276,22185,22186,20915,20916,28580,28581,28583,28584,28586,28587,26134,26125,26126,26127,26129,26130,26133;
			setarray '@gain,15276,15277,22186,22187,20916,20917,28581,28582,28584,28585,28587,28588,26136,26124,26129,26134,26130,26131,26127;
			setarray '@price,10000000,150000000,10000000,150000000,10000000,150000000,10000000,500000000,10000000,500000000,10000000,500000000,15000000,15000000,500000,1500000,1500000,15000000,500000;
			setarray '@dpoint,1000,1500,1000,1500,1000,1500,1000,5000,1000,5000,1000,5000,150,150,50,100,100,150,50;
			setarray '@pos,2,4,5,6,7,8;
			set '@len,getarraysize('@item);
			for(set '@k,0; '@k<getarraysize('@pos); set '@k,'@k+1) {
				for(set '@j,0; '@j<'@len; set '@j,'@j+1) {
					if(getequipid('@pos['@k]) == '@item['@j]) {
						set '@str$['@k],"^nItemID^"+ '@item['@j];
						break;
					}
				}
			}
			next;
			switch(select("�����l����",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4],'@str$[5],"��߂�")) {
			case 1:
				continue;
			case 2: set '@i,2; break;
			case 3: set '@i,4; break;
			case 4: set '@i,5; break;
			case 5: set '@i,6; break;
			case 6: set '@i,7; break;
			case 7: set '@i,8; break;
			case 8:
				mes "[���H�E�l]";
				mes "���������B";
				mes "�K�v�ɂȂ�����";
				mes "�܂����Ă����ȁB";
				close;
			}
			for(set '@j,0; '@j<'@len; set '@j,'@j+1) {
				if(getequipid('@i) == '@item['@j]) {
					break;
				}
			}
			if('@j=='@len) {
				mes "[���H�E�l]";
				mes "�Ώۑ�����g�ɒ����ĂȂ��ȁB";
				mes "������x�m�F���Ă���";
				mes "�܂����Ă����ȁB";
				close;
			}
			mes "[���H�E�l]";
			mes "�N�̑������Ă���";
			mes getitemname('@item['@j])+ "[" +getiteminfo('@item['@j],10)+ "]��";
			mes getitemname('@gain['@j])+ "[" +getiteminfo('@gain['@j],10)+ "]��";
			mes "�A�b�v�O���[�h�����B";
			mes "�x�������@�͂ǂ���ɂ���񂾂��H";
			mes "^ff0000�����h�����|�C���g : " +DORAM_POINT+ "^000000";
			next;
			switch(select('@price['@j]+"Zeny�𕥂�",'@dpoint['@j]+"�h�����|�C���g�𕥂�","��߂�")) {
			case 1:
				set '@price,'@price['@j];
				break;
			case 2:
				set '@dpoint,'@dpoint['@j];
				break;
			case 3:
				mes "[���H�E�l]";
				mes "���������B";
				mes "�K�v�ɂȂ�����";
				mes "�܂����Ă����ȁB";
				close;
			}
			// ������
			mes "[���H�E�l]";
			mes "�m�F�����ǁA";
			mes getitemname('@item['@j])+ "[" +getiteminfo('@item['@j],10)+ "]��";
			mes getitemname('@gain['@j])+ "[" +getiteminfo('@gain['@j],10)+ "]��";
			if('@price)
				mes '@price+"Zeny��";
			else
				mes '@dpoint+"�h�����|�C���g��";
			mes "�A�b�v�O���[�h����";
			mes "�ŗǂ��񂾂ˁB";
			next;
			if(select("�͂�","������") == 2) {
				mes "[���H�E�l]";
				mes "�킩�����B";
				mes "�C���ς������܂����ĂˁB";
				close;
			}
			if('@price && '@price > Zeny) {
				mes "[���H�E�l]";
				mes "����HZeny������Ȃ���B";
				mes "������x�m�F���Ă���";
				mes "�܂����Ă����ȁB";
				close;
			}
			if('@dpoint && '@dpoint > DORAM_POINT) {
				mes "[���H�E�l]";
				mes "����H�h�����|�C���g������Ȃ���B";
				mes "������x�m�F���Ă���";
				mes "�܂����Ă����ȁB";
				close;
			}
			if(checkitemblank() == 0) {
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "����ȏ㑽���̎�ނ�";
				mes "�ו��������Ƃ��o���܂���B";
				mes "1�ȏ�̋󂫂�����Ă��������B^000000";
				close;
			}
			if(checkweight('@gain['@j],1) == 0) {
				set '@weight,getiteminfo('@gain['@j],6)/10 + 1;
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "����ȏ㑽����";
				mes "�ו��������Ƃ��o���܂���B";
				mes '@weight +"�ȏ��";
				mes "�d�ʂ̋󂫂�����Ă��������B^000000";
				close;
			}
			if('@price)
				set Zeny,Zeny - '@price;
			if('@dpoint)
				set DORAM_POINT,DORAM_POINT - '@dpoint;
			set '@card1,getequipcardid('@menu,0);
			delequip '@i;
			getitem2 '@gain['@j],1,1,0,0,'@card1,0,0,0;
			getitem '@gain['@j],1;
			mes "[����l]";
			mes "�������グ���肪�Ƃ��������܂��B";
			mes "�܂����Ă��������ˁB";
			close;
		}
	case 2:
		mes "���A�b�v�O���[�h�����Ή����X�g��";
		mes "�h�����X�[�c[1]";
		mes "���@�����h�����X�[�c[1]";
		mes "�@";
		mes "�����h�����X�[�c[1]";
		mes "���@���I�h�����X�[�c[1]";
		mes "�@";
		mes "�h�����V���[�Y[1]";
		mes "���@�����h�����V���[�Y[1]";
		mes "�@";
		mes "�����h�����V���[�Y[1]";
		mes "���@���I�h�����V���[�Y[1]";
		mes "�@";
		mes "�h�����P�[�v[1]";
		mes "���@�����h�����P�[�v[1]";
		mes "�@";
		mes "�����h�����P�[�v[1]";
		mes "���@���I�h�����P�[�v[1]";
		mes "�@";
		mes "�A�W�̂����[1]";
		mes "���@�����A�W�̂����[1]";
		mes "�@";
		mes "�����A�W�̂����[1]";
		mes "���@���I�A�W�̂����[1]";
		mes "�@";
		mes "�t�̂����[1]";
		mes "���@�����t�̂����[1]";
		mes "�@";
		mes "�����t�̂����[1]";
		mes "���@���I�t�̂����[1]";
		mes "�@";
		mes "�E�T�M�̂����[1]";
		mes "���@�����E�T�M�̂����[1]";
		mes "�@";
		mes "�����E�T�M�̂����[1]";
		mes "���@���I�E�T�M�̂����[1]";
		mes "�@";
		mes "�@�ׂȔL����炵�̖͌^[1]";
		mes "���@���I�ȔL����炵�̖͌^[1]";
		mes "�@";
		mes "�����񕜂̔L����炵[1]";
		mes "���@�L�x�ȉ񕜂̔L����炵[1]";
		mes "�@";
		mes "�g���{���Ƃ܂����L����炵[1]";
		mes "���@�g���{���Ƃ܂������Ȃ�L����炵[1]";
		mes "�@";
		mes "�傫�ȔL����炵�̖͌^[1]";
		mes "���@�@�ׂȔL����炵�̖͌^[1]";
		mes "�@";
		mes "�g���{���Ƃ܂������Ȃ�L����炵[1]";
		mes "���@�g���{���Ƃ܂����_���ȔL����炵[1]";
		mes "�@";
		mes "�g���{���Ƃ܂����_���ȔL����炵[1]";
		mes "���@�g���{���Ƃ܂������͂̔L����炵[1]";
		mes "�@";
		mes "�L����炵�̖͌^[1]";
		mes "���@�傫�ȔL����炵�̖͌^[1]";
		close;
	case 3:
		mes "[���H�E�l]";
		mes "���������A�c�O���ˁB";
		mes "�܂��K�v�ɂȂ�����";
		mes "���������Ă�����B";
		close;
	}
}

lasagna.gat,289,287,5	script	�b��E�l#lasagna	561,{
	callfunc "BlackSmith","�b��E�l",21,23;
	close;
}

//============================================================
// �Ŕ�
//============================================================
lasagna.gat,321,242,4	script	�Ŕ�#1lasagna	835,7,7,{
	unittalk "�k�����F����l�@�^�@�����F���^�ύX�E�X�y�V�����A�C�e���̔���",1;
	end;
}

lasagna.gat,312,251,4	script	�Ŕ�#2lasagna	835,7,7,{
	unittalk "�k�����F���B�E�C���E�h��������̔��E�A�b�v�O���[�h",1;
	end;
}

lasagna.gat,297,229,4	script	�`���[�g���A���f����#01	857,{
	mes "�]�`���[�g���A���Ŋw�񂾂��Ƃ�";
	mes "�@�m�F�ł���f�����B";
	mes "�@�ǂ��ǂ݂܂����]";
	while(1) {
		next;
		switch(select("��߂�","���N���b�N","�N�G�X�g�E�B���h�E","�~�j�}�b�v�ƌ��ݒn�̊m�F","�A�C�e���E�B���h�E","�A�C�e���̐��B","�X�e�[�^�X","�X�L��","�V���[�g�J�b�g�E�B���h�E","���R�񕜂Əd��","�A�C�e���̍w���Ɣ��p","�N�G�X�g�E�B���h�E�ɒ��ړ���A�C�e��","���[�v�����N","�p�[�e�B�[����","�v���C���[�Ƃ̎��","�J�v���T�[�r�X")) {
		case 1:		//��߂�
			cutin "do_su_001",255;
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		case 2:		//���N���b�N
			cutin "do_su_001",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�}�E�X�̃N���b�N�ŃQ�[������";
			mes "�e��C���^�[�t�F�[�X�𑀍�o���܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "NPC�Ƃ̉�b��ړ��A�����X�^�[�ւ̍U����";
			mes "�}�E�X�̍��N���b�N���g�p���܂��B";
			continue;
		case 3:		//�N�G�X�g�E�B���h�E
			cutin "do_su_002",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�N�G�X�g�E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<U>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			next;
			cutin "do_su_003",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�N�G�X�g�E�B���h�E�ɂ�";
			mes "�s�����ڕW�������Ă���܂��B";
			mes "�܂��͂�����ڎw���܂��傤�I";
			continue;
		case 4:		//�~�j�}�b�v�ƌ��ݒn�̊m�F
			cutin "do_su_001",255;
			mes "�y�C���t�H���[�V�����z";
			mes "��ʉE��̃~�j�}�b�v��";
			mes "�����̍�����ꏊ����W��";
			mes "�\������Ă��܂��B";
			next;
			cutin "do_su_028",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�܂��A�`���b�g�E�B���h�E��";
			mes "^ff0000�u/where�v^000000�Ɠ��͂����";
			mes "�����̂���}�b�v����";
			mes "���ׂ邱�Ƃ��ł��܂��B";
			continue;
		case 5:		//�A�C�e���E�B���h�E
			cutin "do_su_004",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�A�C�e���E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<E>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			next;
			cutin "do_su_018",3;
			mes "�y�C���t�H���[�V�����z";
			mes "���Ճ^�u�̃A�C�e����";
			mes "�_�u���N���b�N����ƁA";
			mes "�A�C�e�����g�p���邱�Ƃ�";
			mes "�ł��܂��B";
			next;
			cutin "do_su_005",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�������Ă���A�C�e����";
			mes "�����E�B���h�E�Ŋm�F�ł��܂��B";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<Q>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			next;
			cutin "do_su_006",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�����^�u�̃A�C�e����";
			mes "�_�u���N���b�N����ƁA";
			mes "�A�C�e���𑕔����邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�_�u���N���b�N�ȊO�ɂ��A";
			mes "�A�C�e���E�B���h�E����";
			mes "�����������A�C�e����";
			mes "�����E�B���h�E��";
			mes "�h���b�O���h���b�v���鎖�ŁA";
			mes "������ύX���邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�������A���������J���Ă��Ȃ�����";
			mes "�h���b�O���h���b�v��";
			mes "�n�ʂ��w�肷���";
			mes "�A�C�e���𗎂Ƃ��Ă��܂��̂�";
			mes "���ӂ��Ă��������B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�h���b�v���b�N�{�^����������";
			mes "���b�N��Ԃɂ���Βn�ʂ�";
			mes "�A�C�e�����̂Ă��邱�Ƃ͂Ȃ��Ȃ�܂��B";
			mes "�S�z�Ȑl�̓��b�N��Ԃ�";
			mes "���Ă����܂��傤�B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ��ANPC�Ɖ�b���̓A�C�e����";
			mes "�g�p�ł��Ȃ��ꍇ������̂�";
			mes "���ӂ��Ă��������I";
			continue;
		case 6:		//�A�C�e���̐��B
			cutin "do_su_023",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�����𐸘B���邱�Ƃ�";
			mes "�����h��̐��\��";
			mes "�㏸�����邱�Ƃ��ł��܂��B";
			mes "���B�ɕK�v�Ȕ�p��f�ނ�";
			mes "�A�C�e���ɂ���ĈقȂ�܂��B";
			next;
			cutin "do_su_024",3;
			mes "�y�C���t�H���[�V�����z";
			mes "����̐��B�l�𒴂��Đ��B����ƁA";
			mes "���B�Ɏ��s���邱�Ƃ�����܂��B";
			mes "���S�Ȑ��B�l�͑����ɂ���ĈقȂ�A";
			mes "^ff0000���B�Ɏ��s�����A�C�e����";
			mes "�������Ă��܂��̂�";
			mes "�C�����Ă��������I^000000";
			continue;
		case 7:		//�X�e�[�^�X
			cutin "do_su_007",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X��6��ނ���܂��B";
			mes "���ꂼ��̓�����";
			mes "��������Ɣc�����Ă����܂��傤�I";
			next;
			cutin "do_su_008",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X�E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<A>�L�[^000000��";
			mes "�ŊJ�����Ƃ��ł��܂��B";
			mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I";
			next;
			cutin "do_su_009",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�����N���b�N�����";
			mes "Status Point������A";
			mes "�X�e�[�^�X���㏸���܂��B";
			mes "Status Point��BaseLv��";
			mes "�オ�邲�Ƃɑ����܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "��x�����Status Point��";
			mes "�߂����Ƃ��ł��܂���B";
			mes "�ԈႦ�ĕʂ̃X�e�[�^�X��";
			mes "�|�C���g���g�p���Ȃ��悤��";
			mes "�C��t���܂��傤�B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X��";
			mes "�u+���v�Ƃ���������";
			mes "������JobLv�ɂ��";
			mes "�X�e�[�^�X�{�[�i�X�ł��B";
			mes "Status Point�������";
			mes "�㏸�͂����邱�Ƃ͂ł��܂���B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X�̏グ�������";
			mes "�����X�^�[�Ƃ̐킢����";
			mes "�傫���ς��܂��B";
			mes "�����ɍ������X�e�[�^�X��";
			mes "�T���Ă݂܂��傤�B";
			continue;
		case 8:		//�X�L��
			cutin "do_su_001",255;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�L���͐E�Ɩ��ɈقȂ�";
			mes "�T���i�[�̐E�Ƃ�";
			mes "�U����񕜁A�⏕�̃X�L����";
			mes "�o���邱�Ƃ��ł��܂��B";
			next;
			cutin "do_su_010",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�L���E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<S>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I";
			next;
			cutin "do_su_011",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�K���������X�L�������N���b�N��";
			mes "�m��{�^���������āA";
			mes "�m�F�ɓ��ӂ���ƃX�L���|�C���g��";
			mes "����ăX�L�����K�����܂��B";
			mes "�X�L���|�C���g��JobLv��";
			mes "1�オ�邲�Ƃ�1�|�C���g�����܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "��x������X�L���|�C���g��";
			mes "�߂����Ƃ��ł��܂���B";
			mes "�ԈႦ�ĕʂ̃X�L����";
			mes "�|�C���g���g�p���Ȃ��悤��";
			mes "�C��t���܂��傤�B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ��A�X�L���̒��ɂ͊o���邽�߂�";
			mes "������������̂�����܂��B";
			mes "�Ⴆ�΁u���݂��v���K������ɂ�";
			mes "�u�h������{�X�L���vLv1��";
			mes "�K�����Ă���K�v������܂��B";
			next;
			cutin "do_su_010",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�܂��A^ff0000�N�G�X�g��B�����邱�Ƃ�";
			mes "�K���ł���X�L��������A";
			mes "�N�G�X�g�X�L���Ƃ����܂��B^000000";
			mes "�N�G�X�g�X�L���̓X�L���|�C���g��";
			mes "������Ɋo���邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�K������X�L�������";
			mes "�����X�^�[�Ƃ̐킢����";
			mes "�傫���ς��܂��B";
			mes "�����ɍ������X�L����";
			mes "�T���Ă݂܂��傤�B";
			continue;
		case 9:		//�V���[�g�J�b�g�E�B���h�E
			cutin "do_su_027",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "^ff0000<Ctrl>�L�[+<F12>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			mes "�V���[�g�J�b�g�E�B���h�E��<F12>�L�[��";
			mes "�؂�ւ��邱�Ƃ��ł��A";
			mes "�ő��4�܂œo�^�ł��܂��B";
			next;
			cutin "do_su_012",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "�X�L����A�C�e����";
			mes "�h���b�O���h���b�v���邱�Ƃ�";
			mes "�o�^�ł��܂��B";
			next;
			cutin "do_su_013",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�o�^�����X�L����A�C�e����";
			mes "�Ή������t�@���N�V�����L�[��";
			mes "�������ƂŁA";
			mes "�������g�p���邱�Ƃ��ł��܂��B";
			continue;
		case 10:		//���R�񕜂Əd��
			cutin "do_su_014",3;
			mes "�y�C���t�H���[�V�����z";
			mes "HP��SP�͎��Ԃ��o�Ă�";
			mes "���R�ɉ񕜂��܂����A";
			mes "���邱�Ƃŉ񕜂��鑬�x��";
			mes "���߂邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�u���v�Ɓu����v��^ff0000<Insert>�L�[^000000��";
			mes "�؂�ւ��邱�Ƃ��ł��܂��B";
			next;
			cutin "do_su_015",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ������A�C�e���̏d�ʂ�";
			mes "���d�ʂ�50%�ȏ�ɂȂ��";
			mes "���R�񕜂��������Ȃ��Ȃ�܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�����90%�ȏ�ɂȂ�ƁA";
			mes "�ʏ�U����X�L���U����";
			mes "�ł��Ȃ��Ȃ�܂��B";
			mes "���������Ȃ��Ă��܂�����";
			mes "�A�C�e�����̂Ă���q�ɂɗa����";
			mes "�d�ʂ����炵�܂��傤�I";
			continue;
		case 11:		//�A�C�e���̍w���Ɣ��p
			cutin "do_su_016",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�A�C�e����NPC�ɔ��p�����";
			mes "Zeny�ɂȂ�܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���p�������A�C�e����";
			mes "�u���肽���i���v�Ɉړ����A";
			mes "���p������͂��Ă���";
			mes "[sell]���N���b�N�����";
			mes "�A�C�e���𔄋p�ł��܂��B";
			next;
			cutin "do_su_017",3;
			mes "�y�C���t�H���[�V�����z";
			mes "���l���̔����Ă���A�C�e����";
			mes "Zeny���x�������Ƃ�";
			mes "�w�����邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�w���������A�C�e����";
			mes "�u���������i���v�Ɉړ����A";
			mes "�w��������͂��Ă���";
			mes "[buy]���N���b�N�����";
			mes "�A�C�e�����w���ł��܂��B";
			continue;
		case 12:		//�N�G�X�g�E�B���h�E�ɒ��ړ���A�C�e��
			cutin "do_su_019",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�ʏ�A�A�C�e���̓����X�^�[��";
			mes "�|�����ۂɒn�ʂɃh���b�v���܂����A";
			mes "�N�G�X�g�ɂ���Ă͑Ώۂ̃A�C�e����";
			mes "���ڃA�C�e���E�B���h�E��";
			mes "����ꍇ������܂��B";
			continue;
		case 13:		//���[�v�����N
			cutin "do_su_020",3;
			mes "�y�C���t�H���[�V�����z";
			mes "���[�v�����N�ɐG����";
			mes "�ʂ̃}�b�v�Ɉړ��ł��܂��B";
			continue;
		case 14:		//�p�[�e�B�[����
			cutin "do_su_021",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�p�[�e�B�[�E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<Z>�L�[^000000��";
			mes "�ŊJ�����Ƃ��ł��܂��B";
			mes "�J������u�p�[�e�B�[�쐬�v��";
			mes "�p�[�e�B�[������Ă݂܂��傤�I";
			next;
			cutin "do_su_022",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�p�[�e�B�[�������߂�";
			mes "�p�[�e�B�[���������A";
			mes "���̃v���C���[���E�N���b�N�����";
			mes "�u�p�[�e�B�[�����v���v��";
			mes "���邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���肪�p�[�e�B�[�v�������F����ƁA";
			mes "�p�[�e�B�[�ɓ���邱�Ƃ��ł��܂��B";
			mes "���F�B��U���ăp�[�e�B�[��";
			mes "�g��ł݂܂��傤�I";
			continue;
		case 15:		//�v���C���[�Ƃ̎��
			cutin "do_su_029",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�v���C���[���m��";
			mes "�A�C�e����Zeny�̎����";
			mes "�������ꍇ�́A";
			mes "���̃v���C���[���E�N���b�N����";
			mes "�u����v���v��I��ł��������B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���肪�v���ɉ�����ƁA";
			mes "�A�C�e�������E�B���h�E��";
			mes "�J���܂��B";
			mes "����������������ɓn�����́A";
			mes "�E�������肪�����ɓn�����̂�";
			mes "�Ȃ�܂��B";
			next;
			cutin "do_su_030",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�������n���A�C�e����";
			mes "Zeny�̊z�����肵����A";
			mes "�����́uOK�v���N���b�N���܂��B";
			mes "����Ǝ����̗����D�F�ɂȂ�܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���葤���n���A�C�e����";
			mes "Zeny�̊z�����肷��ƁA";
			mes "���葤�̗����D�F�ɂȂ�܂��B";
			mes "���݂��̗����D�F�ɂȂ�����";
			mes "�����́utrade�v���N���b�N�����";
			mes "������������܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ��A���������̂��ԈႦ����A";
			mes "����̓��e���C�ɓ���Ȃ��ꍇ��";
			mes "�utrade�v�������O��";
			mes "�E���́ucancel�v��������";
			mes "����𒆎~�ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ӑ}���Ȃ��A�C�e����Zeny��";
			mes "�n���Ă��܂�Ȃ��悤�A";
			mes "������s���ۂɂ�";
			mes "�\�����ӂ��܂��傤�B";
			continue;
		case 16:		//�J�v���T�[�r�X
			cutin "kafra_01",255;
			mes "�y�C���t�H���[�V�����z";
			mes "�e�n�ɂ���J�v���T�[�r�X�ł�";
			mes "�ʒu�Z�[�u�T�[�r�X��";
			mes "�q�ɃT�[�r�X�A";
			mes "��Ԉړ��T�[�r�X�ȂǁA";
			mes "�`���ɕK�v�ȃT�|�[�g��";
			mes "�󂯂邱�Ƃ��ł��܂��B";
			next;
			cutin "do_su_025",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�q�ɃT�[�r�X�͏������Ă���";
			mes "�A�C�e����q�ɂɗa���邱�Ƃ�";
			mes "�ł��܂��B";
			mes "�a�����A�C�e���͎�ʂ��Ƃ�";
			mes "�^�u�ɕ������ĕۊǂ���܂��B";
			next;
			cutin "do_su_026",3;
			mes "�y�C���t�H���[�V�����z";
			mes "�q�ɂɗa�����A�C�e����";
			mes "�ʂ̏ꏊ�̑q�ɂ����";
			mes "���o�����Ƃ��ł��܂��B";
			mes "�܂��A�����A�J�E���g����";
			mes "�ʂ̃L�����N�^�[��";
			mes "���o�����Ƃ��ł��܂��B";
			continue;
		}
	}
}

//============================================================
// �Z��
//============================================================
lasa_fild01.gat,35,288,3	script	���x�c���A�W�F�j���[#la	10162,{
	mes "[���x�c���A�W�F�j���[]";
	if(Job == Job_Summoner) {
		mes "���A�����ɓ��c�o�������B";
		mes "���ꂩ���낵���ȁI";
	}
	else {
		mes "�V�嗤�����ȗ��A";
		mes "���U�[�j���̒��͂��Ղ葛�����B";
	}
	close;
}

lasa_fild01.gat,60,322,3	script	���x�c���A���I#lasa_fil	10154,{
	mes "[���x�c���A���I]";
	if(Job == Job_Summoner) {
		mes "�~�b�h�K���h�ɂ͍s�������H";
		mes "���v�A�N�Ȃ牽�����Ă�";
		mes "���z���Ă����邳�B";
	}
	else {
		mes "���̓A���I�B�����Ŏ��x�c�ւ�";
		mes "���c��]�҂̃��N�`���[�����Ă���B";
	}
	close;
}

lasa_dun01.gat,29,146,5	script	���x�c��#lasa_dun01	10162,{
	mes "[���x�c��]";
	if(Job == Job_Summoner) {
		mes "����A�`���҂���B";
		mes "�^���g�D�[�t�B��";
		mes "��ɗ�����ł����H";
	}
	else {
		mes "����A�V�嗤�̖`���҂���";
		mes "����ȂƂ���ɉ��̗p�ł����H";
	}
	close;
}

lasa_dun03.gat,162,158,3	script	�^���g�D�[�t�B	10161,{
	mes "[�^���g�D�[�t�B]";
	if(Job == Job_Summoner) {
		mes "�₠�A���̑O�͐��b�ɂȂ����ˁB";
		mes "�����~�b�h�K���h�ɂ�";
		mes "�s�����̂����H";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�������̓o�W�����X�N�̂�炪";
		mes "�܂������o�����݂����Ȃ񂾁B";
		mes "�܂����������Ƃ������A������B";
	}
	else {
		mes "�N�̓~�b�h�K���h�嗤�̖`���ҁH";
		mes "�ǂ�������ʔ����b�ł�";
		mes "�������Ă�B";
	}
	close;
}

lasagna.gat,235,198,5	script	�y�����c��	10152,{
	mes "[�y�����c��]";
	if(Job == Job_Summoner) {
		mes "�~�b�h�K���h�嗤��";
		mes "�ƂĂ������������B";
		mes "��������̒b�B��Y��Ȃ��悤�ɁB";
	}
	else {
		mes "���x�c�𓝊�����y�����Ɛ\���܂��B";
		mes "�����Ȃ����ł����A";
		mes "������肵�Ă����Ă��������B";
		mes "�l���̕��X�͑劽�}�ł���B";
	}
	close;
}

conch_in.gat,26,64,5	script	�K���x���[�D��	10153,{
	mes "[�K���x���[�D��]";
	if(Job == Job_Summoner) {
		mes "���낻��o�q���B";
		mes "�����͂������H";
	}
	else {
		mes "�V�嗤�̖`���҂��B";
		mes "���͂��̑D�̑D���K���x���[���B";
	}
	close;
}

conch_in.gat,24,62,5	script	�X�e�����[	10156,{
	mes "[�X�e�����[]";
	if(Job == Job_Summoner) {
		mes "�Ȃ񂾁H";
		mes "�q�C�m�̎d���ɋ���������̂��H";
	}
	else {
		mes "���̓X�e�����[�B";
		mes "���̑D�̍q�C�m������Ă���B";
	}
	close;
}

conch_in.gat,181,61,5	script	�b��	421,{
	mes "[�b��]";
	if(Job == Job_Summoner) {
		mes "�����ςׂ݉͑S���Еt�������B";
		mes "�����Ȃ����܂��O�ɁA";
		mes "�������Əo�q�Ƃ�������I";
	}
	else {
		mes "�����̗������A��͂�������";
		mes "�����̘r�͊m���Ȃ񂾂��B";
	}
	close;
}

conch_in.gat,181,58,3	script	���ǎ�	561,{
	mes "[���ǎ�]";
	if(Job == Job_Summoner) {
		mes "���悢��o�q���B";
		mes "�悤�₭���̘r�̌�������";
		mes "����Ă����ȁB";
	}
	else {
		mes "�G�b�O�����̂�낤�B";
		mes "�܁[���T�{���Ă₪��ȁB";
	}
	close;
}

conch_in.gat,186,57,3	script	������	548,{
	mes "[������]";
	if(Job == Job_Summoner) {
		mes "���������������̂��H";
		mes "�тɂ͂܂��������B";
	}
	else {
		mes "�Ȃ񂾁H";
		mes "���͖Z���������ɂ��Ă���B";
	}
	close;
}

conch_in.gat,122,61,5	script	�D��	559,{
	mes "[�D��]";
	mes "�V�嗤�ɂ͏��߂Ăł����H";
	mes "��x���s���Č������ƂȂ��ꏊ��";
	mes "�s���C���͂ǂ��ł����H";
	next;
	mes "[�D��]";
	mes "�ǂ��ǂ����܂��񂩁H";
	mes "�������߂Ă̎��͖���܂���ł����B";
	mes "���܂��ɐV�嗤�ɍs���Ƃ��ɂ�";
	mes "���������܂��B";
	close;
}

conch_in.gat,169,70,3	script	�D��	545,{
	mes "[�D��]";
	mes "�X�e�����[�ꓙ�q�C�m�Ȃ�";
	mes "�n�}�ɂ��Ȃ��V�嗤�ւ̍q�H��";
	mes "�܂������o�������ȋC������B";
	next;
	mes "[�D��]";
	mes "�����̏u�Ԃ������̖ڂ�";
	mes "���邽�߂ɂ��A";
	mes "����ł�����";
	mes "���̑D�ɏ���Ă��Ȃ���B";
	close;
}

conch_in.gat,166,68,6	script	�D��	544,{
	mes "[�D��]";
	mes "�~�b�h�K���h���������ꂽ���ǁA";
	mes "���ɂ����邩�ȁH";
	mes "�n�}�ɂ��Ȃ��ꏊ�B";
	mes "�܂����������s�������Ƃ��Ȃ��ꏊ�B";
	mes "����ȏꏊ���邩�ȁH";
	close;
}

lasagna.gat,226,181,3	script	�J�����[	548,{
	mes "[�J�����[]";
	mes "�J���[�j���~���N��";
	mes "��ȍޗ���m���Ă��邩�H";
	mes "�J���[�j���Ƃ������ʂȊL��";
	mes "���y�����č�����G�b�Z���X��";
	mes "�V�N�ȋ����ō���Ă���B";
	next;
	mes "[�J�����[]";
	mes "�����K�؂ȗʂō�����B";
	mes "�����Ƀj�����_���̎����ꏏ��";
	mes "�Y����Ƃ݂�Ȃ�������";
	mes "�J���[�j���~���N�ɂȂ�񂾁B";
	close;
}

lasagna.gat,225,290,5	script	��Ɣǒ�	421,{
	mes "[��Ɣǒ�]";
	mes "���̎d������������Ƃ���H";
	mes "�����Ɋo������ȒP�Ȏ����B";
	mes "�R���L���i���̃K���x���[�D����";
	mes "���ɏ�肩�����ȁB";
	close;
}

lasagna.gat,139,299,3	script	�C���V���D�D��	561,{
	mes "[�C���V���D�D��]";
	mes "�C���V�Y�Ƃ�";
	mes "�ȑO��藎������ł��Ă�";
	mes "�l��͏�ɕs�����Ă���B";
	close;
}

lasagna.gat,263,156,5	script	���΂������	554,{
	mes "[���΂������]";
	mes "�̂̃��U�[�j���͐��������B";
	mes "�����Z�����{���{���B";
	mes "�����͈Í����ƌĂ΂�Ă����B";
	next;
	mes "[���΂������]";
	mes "���鎞�A���̗V�тȂ̂�����Ȃ����A";
	mes "�������ǂ���";
	mes "���̃`���s���������X��������A��";
	mes "������莩����������������x�c��";
	mes "�L�̎�T�[�r�X�ɓ���n�߂��񂾁B";
	next;
	mes "[���΂������]";
	mes "�X���������Ȃ��z���";
	mes "�݂�ȃ��U�[�j��������A";
	mes "�V�����l�������ł݂���";
	mes "��������c�����B";
	mes "���̃��U�[�j����";
	mes "�S�����̎q������������񂾁B";
	close;
}

lasagna.gat,244,231,3	script	�C���V���D��	544,{
	mes "[�C���V���D��]";
	mes "���̉��F���`�[�Y���ɉ�����";
	mes "�����čs���΁A";
	mes "�������̌̋��������B";
	mes "�����͖߂肽���B";
	close;
}

lasagna.gat,260,134,3	script	���X���X	546,{
	mes "[���X���X]";
	mes "���̉��F���`�[�Y����";
	mes "���x�c�ƔL�̎�T�[�r�X��";
	mes "��������̂Ȃ񂾁B";
	mes "�p�[�X�^�嗤�̂ǂ�����ł�";
	mes "���̉��F�̃`�[�Y����H���Ă�����";
	mes "���U�[�j���֋A���ė����B";
	close;
}

lasagna.gat,141,166,5	script	�N����	555,{
	mes "[�N����]";
	mes "��������Ă���ƌ�邱�Ƃ�����B";
	mes "���̐��E�̂ǂ�����ł�";
	mes "�~�[�g�\�[�X�̓�����";
	mes "����Ƃ������Ƃ��B";
	close;
}

lasagna.gat,233,174,5	script	��������	561,{
	mes "[���ݎ�]";
	mes "�J���[�j���~���N��";
	mes "������荬���Ă�����܂Ȃ���B";
	mes "�ŋ߂����ɗ�������҂�����";
	mes "�U���Ĉ���ł���݂��������ǁA";
	mes "����͂��q����܂̂�邱�Ƃ��B";
	close;
}

lasagna.gat,236,173,3	script	��������	561,{
	mes "[���ݎ�]";
	mes "�J���[�j���~���N��";
	mes "�悭�U���Ă�����ނ̂���Ԃ��B";
	mes "���y���ꂽ�J���[�j����";
	mes "�����ƍ����邱�Ƃō��o�����";
	mes "�@�ׂȖ��������邱�Ƃ��ł���B";
	close;
}

lasagna.gat,200,278,5	script	�S�z�����ȃh����	559,{
	emotion 54,"�S�z�����ȃh����#lasagn";
	mes "[�S�z�����ȃh����]";
	mes "�ŋ߁A�s�@�ɃC���V���l�鋙�D��";
	mes "�x����ď悹����h������";
	mes "�����炵���B�|�����̒��ɂȂ����ˁB";
	mes "���x�c���{�C�ɂȂ���";
	mes "�T���܂���Ă���炵���ł���B";
	close;
}

lasagna.gat,202,276,5	script	�����ꂽ�h����	560,{
	emotion 18,"�����ꂽ�h����#lasagna";
	mes "[�����ꂽ�h����]";
	mes "������I";
	mes "���؃N���[�Y���s�������������I";
	mes "�Ȃ�ĉ^���ǂ��񂾁I";
	mes "�����W���ꏊ��";
	mes "�C���V���D�O�ɍs���Ȃ���I";
	close;
}

lasagna.gat,209,301,3	script	���X�^�`	10167,{
	mes "[���X�^�`]";
	mes "�V�嗤�ɗ����O��";
	mes "�g�����Ȃ݂𐮂��Ă݂ẮH";
	close;
}

lasagna.gat,236,179,5	script	�j�����N��	10163,{
	mes "[�j�����N��]";
	mes "��������������Ȃ�";
	mes "���x�c�ɗ���ł݂���H";
	close;
}

lasagna.gat,229,197,5	script	�g�X	10164,{
	emotion 22;
	mes "[�g�X]";
	mes "��͂�L���ȏꏊ������l�������ȁB";
	close;
}

lasagna.gat,228,193,5	script	�|���g	10163,{
	emotion 32;
	mes "[�|���g]";
	mes "�����ɗ����Ȃ�";
	mes "�J���[�j���~���N��";
	mes "����ł����Ȃ��ƂȁI";
	close;
}

lasagna.gat,226,196,5	script	�A����	10166,{
	emotion 7;
	mes "[�A����]";
	mes "����낫��낵�Ȃ��́I";
	mes "�c�ɎҊۏo������Ȃ��I";
	close;
}

lasagna.gat,227,187,1	script	���H���S��	544,{
	mes "[���H���S��]";
	mes "����ɂ��́B";
	mes "�p�u�u�I�[�u���v�ւ悤�����B";
	mes "�����͌��܂�܂������H";
	next;
	mes "[���H���S��]";
	mes "�y�����c���A�K���x���[�D���A";
	mes "�g�[�}�X�D���ɂ��";
	mes "�u�I�[�u���̐����v�̉e���ŁA";
	mes "�݂�ȃJ���[�j���~���N��";
	mes "�������܂����A��Ԗ���";
	mes "���M�̂���̂̓{�X�̗����ł��B";
	next;
	mes "[���H���S��]";
	mes "���g���ɐS�����߂Ď���ꂵ����A";
	mes "��ł����ƃC����";
	mes "�����ĂԂ��Č`�����";
	mes "�g�������̂ł��B";
	mes "�{���ɔ��������̂�";
	mes "�N���������܂���B";
	next;
	mes "[���H���S��]";
	mes "������ŋ߂͍ޗ���";
	mes "�������Ă����Ȃ��̂ŁA";
	mes "�}�Ȓ���������ƁA";
	mes "��������܂ő�����";
	mes "�����ɍs����ł��B";
	next;
	emotion 54;
	mes "[���H���S��]";
	mes "���[���A�{���ɔ��������̂Ɂc�c�B";
	close;
}

lasagna.gat,232,187,6	script	�t�F�b�g�D�`�[�j��	545,{
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�����œ����Ă���Ȃ�Ɍo���ǁA";
	mes "�����ɉ����[�Ȃ̂ŎM�􂢂�";
	mes "���ׂĎ��̒S���ł��B";
	next;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�D�ɏ��ɍs���O�Ɉ�t�A";
	mes "�����q�C���I���Ĉ�t�A";
	mes "�e�n����K�˂ė����`���҂���t�A";
	mes "���������ł���l����t�A";
	mes "����ɂ��Ĉ��݂����l����t�c�c";
	next;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�Ƃɂ������Ȃ��Ƃ����Ȃ�";
	mes "�H��̐����z���𒴂��܂��B";
	mes "���ꂾ���ł͂���܂����A";
	mes "���x�c�ƔL�̎�E�������̋������A";
	mes "�V�Ė`���҂�������̑��k���X�c�c";
	next;
	emotion 28;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "24���Ԃ��ᑫ��Ȃ��ł��B";
	mes "�]�ƈ��𑝂₹�΂����̂ɁI";
	close;
}

lasagna.gat,232,181,5	script	�����M���C�[�l	559,{
	mes "[�����M���C�[�l]";
	mes "�����͎��x�c�{���ł����A";
	mes "�`���҂���������Ă���";
	mes "�p�u�ł�����܂��B";
	mes "�e�n���牟���񂹂ė����`���҂�";
	mes "�o���k�����킵����A";
	mes "�`���̒��Ԃ�T����������܂��B";
	next;
	mes "[�����M���C�[�l]";
	mes "�ŋ߂ł͐V�嗤�ɗ����O��";
	mes "�����d����ɗ���l�������܂����B";
	next;
	mes "[�����M���C�[�l]";
	mes "�\���N�O�ɂ͕s�ǃh����������";
	mes "�X�������Ď��x�c�ɓ��c�����邽�߂�";
	mes "�ꏊ�Ƃ��Ă��g���܂����B";
	mes "����ȑO�͍r����҂̑D��肽����";
	mes "����̔�������ꏊ��������ł��B";
	next;
	mes "[�����M���C�[�l]";
	mes "�y�����c���A�K���x���[�D���A";
	mes "�g�[�}�X�D���������ŏo��܂����B";
	mes "3�l�͂����ŋ`�Z����J�����сA";
	mes "���̌�̌��J�ł������U�[�j����";
	mes "������`���ɂȂ�܂����B";
	next;
	mes "[�����M���C�[�l]";
	mes "�ނ�ɓ���Ă���Ă���";
	mes "�`���҂�������ł���B";
	close;
}

lasagna.gat,190,239,5	script	�c���j�����R#lasagna_01	559,{
	unittalk "�c���j�����R : ���͂��̗V�я�̑������ɂ�`�B";
	end;
}

lasagna.gat,180,230,7	script	�c���j�����R#lasagna_02	560,{
	unittalk "�c���j�����R : �n�@�c�c����ȗc�t�Ȃ��Ƃ͈ꏏ�ɗV�ׂȂ��ɂ�`�B";
	end;
}

lasagna.gat,192,245,7	script	�c���j�����R#lasagna_03	554,{
	unittalk "�c���j�����R : �ю��̉򂪂ЂƂA�ȂȂA�ӂ��A�ނ��c�c�����ɂ�!!";
	end;
}

lasagna.gat,184,234,5	script	�c���j�����R#lasagna_04	422,{
	unittalk "�c���j�����R : ����ǂ����ē]����Ȃ��ɂ�`�H�]����悤�ɂ��Ăɂ�`�B";
	end;
}

lasagna.gat,186,231,3	script	�c���j�����R#lasagna_05	10167,{
	emotion 28;
	unittalk "�c���j�����R : �V�[�\�[�ɏ��Ȃ���ꏏ�ɗV�т�����͏W�܂�`�B";
	end;
}

lasagna.gat,211,186,5	script	��D�ē���	559,{
	mes "[��D�ē���]";
	mes "����ɂ��́I";
	mes "�V�嗤�ɗ����D�͂�������k��";
	mes "�D������ɒ┑���Ă��܂���B";
	close;
}

lasagna.gat,222,187,3	script	�{�X	548,{
	mes "[�{�X]";
	mes "�Ȃ񂾁H";
	mes "���񂽂��J���[�j���~���N�����H";
	close;
}

lasagna.gat,202,291,3	script	���x�c�ē���	10162,{
	mes "[���x�c�ē���]";
	mes "�`�����U�[�j���ւ悤�����I";
	mes "�������K�v�Ȏ���";
	mes "���ł��t�@���t�@�[�����x�c��";
	mes "�K�˂ĉ������B";
	close;
}

lasagna.gat,174,160,3	script	���x�c�ē���	10162,{
	mes "[���x�c�ē���]";
	mes "����ɂ��́B";
	mes "�ǂ��V�C�ł��ɂ�B";
	close;
}

lasagna.gat,233,197,5	script	���x�c���I���I	10155,{
	mes "[���x�c���I���I]";
	mes "���̕��̓t�@���t�@�[�����x�c��";
	mes "�c���ł���y�����l���I";
	close;
}

lasagna.gat,77,263,5	script	�^�����[	10166,{
	mes "[�^�����[]";
	mes "�����d�����d�グ�Ȃ��Ɓc�c";
	mes "�҂����킹�ɊԂɍ���Ȃ���B";
	close;
}

lasagna.gat,191,174,3	script	�S����	547,{
	emotion 45,"�S����#lasagna";
	mes "[�S����]";
	mes "�ǂ��V�C���ɂႠ�B";
	close;
}

lasagna.gat,165,125,5	script	����l	10163,{
	mes "[����l]";
	mes "�����̑��q�͂��������ǂ��܂�";
	mes "�z�B�ɍs�������Ă����񂾁H";
	close;
}

lasagna.gat,175,209,3	script	��������	547,{
	mes "[��������]";
	mes "�݂�ȃo�[�ň���łĒN�����Ȃ��B";
	mes "�ɂ��c�c�B";
	close;
}

lasagna.gat,73,237,5	script	�������������h����	544,{
	mes "[�������������h����]";
	mes "���̕ӂ�͐Â��ł����c�c�B";
	mes "���S���͗��s�҂␌��������";
	mes "���邳���Ă��܂��B";
	close;
}

lasagna.gat,71,200,3	script	�����Ă���h����	546,{
	mes "[�����Ă���h����]";
	mes "����H";
	mes "�����͋x�݂��B";
	mes "�ǂ����悤�c�c�B";
	close;
}

lasagna.gat,61,115,3	script	�����ȃh����	560,{
	mes "[�����ȃh����]";
	mes "���͋C�ɂȂ镨��";
	mes "�Ђ��[���璲�ׂ鐫�i�Ȃ񂾁B";
	mes "���l�̉Ƃ̕�������";
	mes "�Ђ��[���璲�ׂ��Ⴄ���I";
	close;
}

lasagna.gat,88,91,3	script	���ɏo��h����	555,{
	mes "[���ɏo��h����]";
	mes "�����V�嗤�ɍs���Ȃ��ƁI";
	mes "��؍���Ă�ꍇ����˂��I";
	close;
}

lasagna.gat,186,193,3	script	�O���痈���h����	553,{
	mes "[�O���痈���h����]";
	mes "���������U�[�j�������I";
	mes "��[���A����Ă�邼�[�I";
	close;
}

lasagna.gat,103,119,5	script	�����h����	545,{
	mes "[�����h����]";
	mes "���̐��̂��ׂĂ̐����̂�";
	mes "�����������Ă���B";
	mes "�e�X�̑����̑����𗝉������";
	mes "�킢��L���ɐi�߂��邾�낤�B";
	next;
	mes "[�����h����]";
	mes "�������H";
	mes "�ق��A�����������c�c�B";
	close;
}

lasagna.gat,140,269,3	script	�@�ׂȒ���	10166,{
	mes "[�S�}�[]";
	mes "�˂��A���^�[�I";
	mes "�����ƕЂÂ��Ȃ����I";
	mes "�����Ɏ����̔j�Ђ������Ă���I";
	next;
	emotion 6;
	mes "[�S�}�[]";
	mes "�W���M�[�A";
	mes "�^���f�B��������������Ȃ��I";
	mes "�����͂����Ƃ��Ă����Ȃ��́H";
	next;
	emotion 7;
	mes "[�S�}�[]";
	mes "���������A�W���ł��Ȃ��I";
	mes "�킽���̖ʓ|�����Ă����";
	mes "����������Ƃ����Ԃɉ߂����Ⴄ��I";
	close;
}

lasagna.gat,131,269,5	script	�����Ȏ��j	555,{
	mes "[���^�[]";
	mes "��������A���ꂳ��A";
	mes "�����ɖ߂��ė��ĉ������B";
	next;
	mes "�]�ꂫ�Ȃ��牽��������Ă���]";
	close;
}

lasagna.gat,131,274,5	script	�E���ȎO�j	10164,{
	mes "[�W���M�[]";
	mes "�E�B�B�B�B���I";
	mes "�C�k�n�b�J�����̃W���M�[�����I";
	mes "������̂Ăē��~����I";
	close;
}

lasagna.gat,140,274,3	script	��C�Ȏl�j	546,{
	mes "[�^���f�B]";
	mes "���o�����͂悭�{�邯�ǁA";
	mes "�����Y��ɂ�����悤��";
	mes "�V�����m��������Ă�����ł��B";
	mes "���o�����͑�D���ł��B";
	next;
	mes "[�^���f�B]";
	mes "�Z����񂽂��͕|���ł��B";
	mes "�^���f�B����ꂽ����";
	mes "�����ƕ����悤�ɓw�͂��Ă܂��B";
	next;
	emotion 28;
	mes "[�^���f�B]";
	mes "����ł����^�[�Z������";
	mes "�Ί�������Ȃ����A";
	mes "�W���M�[�Z�����͋C��������Ȃ���";
	mes "�悭�~�~�Y�������ė����ł��B";
	mes "���������ł��c�c�B";
	close;
}

//============================================================
// ����NPC
//============================================================
lasagna.gat,200,300,3	script	��������̈ē�#wedd01	10162,{
	mes "[��������̈ē�]";
	mes "����ɂ��́I�@�����V�C�ł���ˁH";
	mes "�C�����̂����������ł��B";
	mes "����ȓ��Ɍ�������������J�b�v���́A";
	mes "�ꐶ�K���ɂȂ�C�����܂��B";
	next;
	mes "[��������̈ē�]";
	mes "^0000cd������^0000cd��";
	mes "�o�Ȃ��ɂ�������Ⴂ�܂������H";
	mes "����Ƃ�";
	mes "����̉����ɂ�������Ⴂ�܂������H";
	next;
	if(select("�������ł����H","��������̈ē������肢���܂�") == 1) {
		mes "[��������̈ē�]";
		mes "�͂��I";
		mes "������l�ƈ�b�ł������ꏏ�ɋ�������";
		mes "�v�������Ƃ̂���l�Ȃ�A";
		mes "��������ł���ˁH";
		next;
		mes "[��������̈ē�]";
		mes "���̐l�ƂȂ�ꐶ�����ɂ�����";
		mes "�Ƃ����C�������I";
		next;
		mes "[��������̈ē�]";
		mes "��������΁A�������΂ɂ����邩��";
		mes "�ǂ��ł���ˁI";
		mes "����ȊO�ɂ����ʂȃX�L�����g�p���A";
		mes "���������Ȃ������ɁA";
		mes "�����̑O�ɏ������邱�Ƃ��o���܂���B";
		next;
		mes "[��������̈ē�]";
		mes "��������Ȃ����A";
		mes "���������X�L�����g�p�ł��܂��B";
		next;
		mes "[��������̈ē�]";
		mes "���̑��ɂ��ǂ��Ƃ���͂���܂����A";
		mes "�V���̓�l�������s���郊�]�[�g�n��";
		mes "�W�����C�œ�l����̎��Ԃ��߂�����̂�";
		mes "�ō��ł��B";
		next;
		mes "[��������̈ē�]";
		mes "�܂��A�����q�����l������";
		mes "�{�q�Ƃ��Č}���A�K���ȉƒ��";
		mes "�z�����Ƃ��ł��܂��B";
		next;
		mes "[��������̈ē�]";
		mes "�����A���U�[�j���ɂ͊e�n����";
		mes "���l�Ȑl���������𐾂��������߂�";
		mes "�K��܂��B";
		next;
		mes "[��������̈ē�]";
		mes "��������������ŁA";
		mes "������l�Ƃ̌�������������̂�";
		mes "�������ł��傤���H";
		close;
	}
	mes "[��������̈ē�]";
	mes "��������֍s����܂����H";
	next;
	mes "[��������̈ē�]";
	mes "���������";
	mes "^0000cd���U�[�j���̖k���ɂ��鋴��n��^0000cd��";
	mes "�����ł�����A�T���₷���ł��B";
	next;
	mes "[��������̈ē�]";
	mes "���̐Ԃ��ю���ǂ��čs���ƁA";
	mes "���ɖ������Ƃ͂���܂���B";
	next;
	mes "[��������̈ē�]";
	mes "�ł͍K���ɁI";
	close2;
	warp "lasagna.gat",335,246;
	end;
}
lasagna.gat,163,84,3	duplicate(��������̈ē�#wedd01)	��������̈ē�#wedd02	10162

lasagna.gat,344,275,3	script	�t���[����#do_wedd	10163,{
	mes "[�t���[����]";
	mes "���Ԃ̍��肪�����ł��傤�H";
	mes "�V������o���}����";
	mes "�K���ȐV������̂��߂ɁA";
	mes "���ʏ����������ԂȂ�ł��B";
	next;
	mes "[�t���[����]";
	mes "�����ȕ��ł��A���肪�Y���܂��B";
	mes "��l�̏����ɍD�����肪";
	mes "�����ς��L�����ė~�����Ƃ́A";
	mes "���̊肢�����߂����Ԃł��B";
	close;
}

lasagna.gat,320,268,7	script	�V�g#do_wedd	10166,{
	mes "[�V�g]";
	mes "�V������o���}�����l�́A";
	mes "�����Ă��������ł��ˁB";
	next;
	mes "[�V�g]";
	mes "���������������d���͓���ł��B";
	mes "����ł��A����l��";
	mes "�K�����ɐZ���Ă��ꂽ��������ł��B";
	close;
}

lasagna.gat,319,290,1	script	����#do_wedd01	882,{
	mes "[����]";
	mes "�����l���ň�Ԃ̏o������";
	mes "�����ƕ����ꂽ��A";
	mes "�A�i�^�ƌ����������Ƃ��Ɠ������B";
	next;
	mes "[�j��]";
	mes "���͓�Ԗڂ̏o�������A";
	mes "�L�~�ƌ����������Ƃ����ǁB";
	next;
	mes "[����]";
	mes "�����H�@���Ⴀ�A��Ԗڂ́H";
	next;
	mes "[�j��]";
	mes "�L�~�ɏ��߂ďo���������A";
	mes "���̏�ŋ����������Ƃ��ˁB";
	mes "���̐l���ł��̎��قǁA";
	mes "�m�M�ɖ����������Ȃ�������B";
	emotion 31,"�j��#do_wedd01";
	misceffect 343,"�j��#do_wedd01";
	next;
	mes "[����]";
	mes "�Ȃ玄����Ԗڂ́A";
	mes "���̏�ŏ����������Ƃɂ���B";
	emotion 30,"����#do_wedd01";
	next;
	mes "[�j��]";
	mes "�������A�{���ɂ�����������ˁB";
	mes "�i���Ɉꏏ����B";
	close;
}

lasagna.gat,320,291,3	script	�j��#do_wedd01	881,{
	mes "[����]";
	mes "�����̌�������A��������������ˁH";
	next;
	mes "[�j��]";
	mes "�������ȁB";
	mes "�������̎��͂���ȏꏊ�Ȃ������̂ɁB";
	mes "�Y�킾�ˁc�c�B";
	next;
	mes "[����]";
	mes "�ł��A�吹���ł������������̌�������";
	mes "�ǂ�������ˁB";
	mes "�{���A���܂ł��Y����Ȃ���B";
	emotion 30,"����#do_wedd01";
	misceffect 343,"����#do_wedd01";
	next;
	mes "[�j��]";
	mes "��������B";
	emotion 31,"�j��#do_wedd01";
	next;
	mes "[����]";
	mes "��������25���N�́A";
	mes "�����ł܂��������������悤���H";
	next;
	mes "[�j��]";
	mes "����A������!!";
	next;
	mes "[����]";
	mes "25���N�͂܂��������ǁA";
	mes "�W�����C�֍s�����̓��̑z���o��";
	mes "�U��Ԃ�̂͂����o�����ˁI";
	next;
	mes "[�j��]";
	mes "�������ˁI�@���̎��̑z���o���I";
	next;
	mes "[����]";
	mes "�������s�����I�@�͂₭�I";
	close;
}

lasagna.gat,316,206,5	script	����#do_wedd02	958,{
	mes "[����]";
	mes "�_�[�����͂ǂ�����";
	mes "���Ă����Ă��܂��������Ȃ�́H";
	emotion 3,"����#do_wedd02";
	next;
	mes "[���Ȃ��Ɉ�������]";
	misceffect 343,"����#do_wedd02";
	next;
	mes "[�j��]";
	mes "�����n�j�[�������Ƃ����ƌ��Ă������B";
	emotion 3,"�j��#do_wedd02";
	next;
	mes "[�j��]";
	mes "�Ƃ���ŁA";
	mes "�����܂ŗ���̂ɔ�ꂽ�肵�ĂȂ��H";
	next;
	mes "[�N�����͌���]";
	misceffect 313,"����#do_wedd02";
	next;
	mes "[����]";
	mes "�_�[���������Ă���āA�{���ɏ������B";
	emotion 30,"����#do_wedd02";
	next;
	mes "[�j��]";
	mes "�����n�j�[�̉񕜍܂�����ˁB";
	emotion 31,"�j��#do_wedd02";
	close;
}

lasagna.gat,317,205,1	script	�j��#do_wedd02	962,{
	mes "[�j��]";
	mes "��������������炵���B";
	mes "���āI�@�{�����Y�킾�B";
	emotion 3,"�j��#do_wedd02";
	next;
	mes "[����]";
	mes "���������A";
	mes "�����Ŏ��������܂��傤�I";
	emotion 3,"����#do_wedd02";
	next;
	mes "[�j��]";
	mes "���̌��t�c�c�v���|�[�Y�H";
	next;
	mes "[����]";
	mes "�����A�v���|�[�Y�Ȃ�ł��I";
	mes "���̃_�[�����B";
	emotion 30,"����#do_wedd02";
	misceffect 343,"����#do_wedd02";
	next;
	mes "[�j��]";
	mes "���A���c�c���A���A���������������āA";
	mes "���Ɓc�c���t����肭�o�Ȃ��c�c�B";
	emotion 28,"�j��#do_wedd02";
	next;
	mes "[����]";
	mes "�����̂͂�������ǁA";
	mes "�Ԏ��͂��Ȃ�����ˁB";
	next;
	mes "[�j��]";
	mes "�͂��A����܂����B";
	mes "���Ȃ��Ɖi���𐾂��܂��B";
	emotion 31,"�j��#do_wedd02";
	misceffect 343,"�j��#do_wedd02";
	close;
}

lasagna.gat,346,237,5	script	������#do_wedd01	10164,{
	mes "[������]";
	mes "�W���W���[��!!";
	mes "�������l�̏Z��ł������U�[�j������I";
	mes "�ǂ��H";
	next;
	mes "[������]";
	mes "����H�@�ꂳ��H�@�V��H";
	mes "�݂�Ȃǂ��H";
	mes "�܂��������Ȃ������̂��ȁH";
	emotion 1,"������#do_wedd01";
	next;
	mes "[������]";
	mes "�ꂳ��`�A�͂₭���āI";
	next;
	mes "[���Ȃ��Ɉ�������]";
	next;
	mes "[������]";
	mes "�ꂳ��`�A�͂₭���āI";
	misceffect 36,"�ꂳ��#do_wedd01";
	cloakoffnpc "�ꂳ��#do_wedd01";
	next;
	mes "[�ꂳ��]";
	mes "�����A�����͂ǂ��H";
	next;
	mes "[������]";
	mes "���Ȃ�����A�l���Ă񂾂�B";
	mes "�V����Ă΂Ȃ���B";
	next;
	mes "[�V��A��������Ⴂ]";
	next;
	mes "[������]";
	mes "�V��`";
	misceffect 36,"�q�ǂ�#do_wedd01";
	cloakoffnpc "�q�ǂ�#do_wedd01";
	next;
	mes "[�ꂳ��]";
	mes "�傫�ȋ�����̂���̂�";
	mes "���Ă�Œ��������̂ɁB";
	next;
	mes "[�q�ǂ�]";
	mes "���������I�@�ʔ��������̂ɁI";
	next;
	mes "[������]";
	mes "�����H�@���߂�B";
	mes "����ɕ����񂪂����Ɩʔ������̂�";
	mes "�����Ă������B";
	next;
	mes "[�q�ǂ�]";
	mes "����I";
	mes "�ł����������Ă��̂����Ă���I";
	cloakonnpc "�q�ǂ�#do_wedd01";
	next;
	mes "[�ꂳ��]";
	mes "�������Ă��痈��ˁB";
	cloakonnpc "�ꂳ��#do_wedd01";
	next;
	mes "[������]";
	mes "�ꂳ��A�V��c�c�B";
	mes "�l���A�l���A��Ă��āc�c�B";
	emotion 28,"������#do_wedd01";
	close;
}

lasagna.gat,347,235,7	script	�ꂳ��#do_wedd01	10148,{
	end;
OnInit:
	cloakonnpc;
	end;
}

lasagna.gat,349,237,1	script	�q�ǂ�#do_wedd01	10167,{
	end;
OnInit:
	cloakonnpc;
	end;
}

lasagna.gat,302,323,3	script	�W�����C�u	10159,{
	mes "[�W�����C�u]";
	mes "�V��������A�������ꂽ2�l���A";
	mes "���ł��s���錶�̃��]�[�g�n�B";
	mes "�u�W�����C�v�ɂ݂Ȃ��܂�";
	mes "���҂������܂��I";
	next;
	if(select("�W�����C�H","�W�����C�֏o���`") == 1) {
		mes "[�W�����C�u]";
		mes "�~�b�h�K���h�嗤���牓�����ꂽ";
		mes "�Ƃ���ꏊ�ɁA�ЂƂ̓�������܂��B";
		mes "���}���`�b�N�ŊÂ����Ԃ�";
		mes "�߂�����ꏊ�Ȃ�ł��B";
		next;
		mes "[�W�����C�u]";
		mes "�����̓n�l���[���ŗL���ȏꏊ�ŁA";
		mes "�������ꂽ���̂ݍs���܂��B";
		next;
		mes "[�W�����C�u]";
		mes "���̓��ʂȏꏊ�ւ̑D����";
		mes "^0000cd100,000z^000000�ɂȂ�܂��B";
		next;
		mes "[�W�����C�u]";
		mes "���ʂȐl�����炵����A";
		mes "���ɊÂ����Ԃ��߂����Ă݂�̂�";
		mes "�������ł����H";
		close;
	}
	if(!(PartnerId)) {
		mes "[�W�����C�u]";
		mes "�ǂ�����܂������H";
		mes "���̑D�́A�n�l���[���ŗL����";
		mes "�W�����C�֍s���D�ł��B";
		next;
		mes "[�W�����C�u]";
		mes "��ώc�O�Ȃ���A";
		mes "�W�����C�֍s����̂�";
		mes "�����҂݂̂ɂȂ�܂��B";
		next;
		mes "[�W�����C�u]";
		mes "����ɐS���`���̗���";
		mes "�o������͔̂@���ł����H";
		close;
	}
	if(Zeny < 100000) {
		mes "[�W�����C�u]";
		mes "�\���󂠂�܂��񂪁A";
		mes "�W�����C�s���̑D����";
		mes "^0000cd100,000z^000000�ɂȂ�܂��B";
		mes "�����������m�F���������B";
		close;
	}
	// ������
	mes "[�W�����C�u]";
	mes "�y���������s�ɂȂ�܂��悤�ɁB";
	mes "�ł́A�u�W�����C�v�֏o�����܂��I";
	close2;
	set Zeny,Zeny-100000;
	warp "jawaii.gat",245,125;
	end;
}
