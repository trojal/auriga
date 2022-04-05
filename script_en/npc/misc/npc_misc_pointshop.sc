//==============================================================================
// Ragnarok Online PointShop Script
//==============================================================================

-	pointshop	SpecialItemShopper	-1,14904:5000,14905:15000,17290:9000,17289:5000,12913:1000,12914:1000,12918:1000,12917:1000,12927:1500,12910:500,12903:3000,12904:3000,12908:3000,12905:3000,12906:3000,12907:3000,12900:7500,16653:10000,13990:5000,12922:7500,16674:7500,12901:7000,13500:12000,12911:15000,12921:7000,12920:10000,14289:5000,14290:5000,16682:12000,17634:5000

payon.gat,153,96,4		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
alberta.gat,90,56,6		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
prontera.gat,123,68,2		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
geffen.gat,114,104,4		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
morocc.gat,169,80,2		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
aldebaran.gat,135,123,4		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
yuno.gat,167,187,3		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
einbroch.gat,242,255,3		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
lighthalzen.gat,187,304,3	substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
hugel.gat,83,150,3		substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
comodo.gat,198,149,4	substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
rachel.gat,132,144,2	substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
mid_camp.gat,59,130,4	substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73
lasagna.gat,346,244,6	substore(SpecialItemShopper)	�X�y�V�����A�C�e���̔�	73

//============================================================
// �f�t�H���g�J���[�`�P�b�g, �G�N�X�g���J���[�`�P�b�g
//------------------------------------------------------------
prontera.gat,123,62,5	script	�������F�t	97,{
	// Job�ɑΉ������t�@�C������Ԃ�
	function ExcolorSample {
		switch(getarg(0)) {
		case Job_Novice:	return "excolor_novice.bmp";
		case Job_Swordman:	return "excolor_swordman.bmp";
		case Job_Magician:	return "excolor_magician.bmp";
		case Job_Archer:	return "excolor_archer.bmp";
		case Job_Acolyte:	return "excolor_acolyte.bmp";
		case Job_Merchant:	return "excolor_merchant.bmp";
		case Job_Thief:		return "excolor_thief.bmp";
		case Job_Knight:
			if(Upper == UPPER_HIGH)
				return "excolor_loadknight.bmp";
			else
				return "excolor_knight.bmp";
		case Job_Priest:
			if(Upper == UPPER_HIGH)
				return "excolor_highpriest.bmp";
			else
				return "excolor_priest.bmp";
		case Job_Wizard:
			if(Upper == UPPER_HIGH)
				return "excolor_highwizard.bmp";
			else
				return "excolor_wizard.bmp";
		case Job_Blacksmith:
			if(Upper == UPPER_HIGH)
				return "excolor_whitesmith.bmp";
			else
				return "excolor_blacksmith.bmp";
		case Job_Hunter:
			if(Upper == UPPER_HIGH)
				return "excolor_sniper.bmp";
			else
				return "excolor_hunter.bmp";
		case Job_Assassin:
			if(Upper == UPPER_HIGH)
				return "excolor_assassincross.bmp";
			else
				return "excolor_assassin.bmp";
		case Job_Crusader:
			if(Upper == UPPER_HIGH)
				return "excolor_paladin.bmp";
			else
				return "excolor_crusader.bmp";
		case Job_Monk:
			if(Upper == UPPER_HIGH)
				return "excolor_champion.bmp";
			else
				return "excolor_monk.bmp";
		case Job_Sage:
			if(Upper == UPPER_HIGH)
				return "excolor_professor.bmp";
			else
				return "excolor_sage.bmp";
		case Job_Rogue:
			if(Upper == UPPER_HIGH)
				return "excolor_chaser.bmp";
			else
				return "excolor_rogue.bmp";
		case Job_Alchemist:
			if(Upper == UPPER_HIGH)
				return "excolor_creator.bmp";
			else
				return "excolor_alchemist.bmp";
		case Job_Bard:
		case Job_Dancer:
			if(Upper == UPPER_HIGH)
				return "excolor_clown_gypsy.bmp";
			else
				return "excolor_bard_dancer.bmp";
		case Job_SuperNovice:
		case Job_ExpandedSuperNovice:	return "excolor_supernovice.bmp";
		case Job_Taekwon:		return "excolor_taekwon.bmp";
		case Job_Star:			return "excolor_kwonsung.bmp";
		case Job_Linker:		return "excolor_soullinker.bmp";
		case Job_Gunslinger:	return "excolor_gunslinger.bmp";
		case Job_Ninja:			return "excolor_ninja.bmp";
		case Job_RuneKnight:	return "excolor_runeknight.bmp";
		case Job_Warlock:		return "excolor_warlock.bmp";
		case Job_Ranger:		return "excolor_ranger.bmp";
		case Job_ArchBishop:	return "excolor_archbishop.bmp";
		case Job_Mechanic:
			if(getlook(13) == 0)
				return "excolor_mechanic.bmp";
			else
				return "excolor_mechanic2.bmp";
		case Job_Guillotine:
			if(getlook(13) == 0)
				return "excolor_guillotinecross.bmp";
			else
				return "excolor_guillotinecross2.bmp";
		case Job_RoyalGuard:
			if(getlook(13) == 0)
				return "excolor_royalguard.bmp";
			else
				return "excolor_royalguard2.bmp";
		case Job_Sorcerer:		return "excolor_sorcerer.bmp";
		case Job_Minstrel:
		case Job_Wanderer:		return "excolor_minstrel_wanderer.bmp";
		case Job_Shura:			return "excolor_sura.bmp";
		case Job_Genetic:
			if(getlook(13) == 0)
				return "excolor_genetic.bmp";
			else
				return "excolor_genetic2.bmp";
		case Job_ShadowChaser:	return "excolor_shadowchaser.bmp";
		case Job_Kagerou:
		case Job_Oboro:			return "excolor_kagerou_oboro.bmp";
		case Job_Summoner:		return "excolor_do_summoner.bmp";
		}
	}

	mes "[�������F�t]";
	mes "����ɂ��́I";
	mes "���͊F�l�Ɍ��I�ȃX�^�C����";
	mes "�񋟂��ׂ��A�F�l�̂���������";
	mes "���������F�����Ē����ׂɎQ��܂����I";
	next;
	mes "[�������F�t]";
	mes "^0000FF�G�N�X�g���J���[�`�P�b�g^000000��";
	mes "������������΁A";
	mes "���Ȃ��̕��̐F��";
	mes "�G�N�X�g���J���[�ɕύX�ł��܂��I";
	next;
	mes "[�������F�t]";
	mes "�܂��A���̃J���[�ɖ߂��ꍇ�́A";
	mes "^FF0000�f�t�H���g�J���[�`�P�b�g^000000��";
	mes "�K�v�ƂȂ�܂��B";
	next;
	mes "[�������F�t]";
	mes "���݁A�p�ӂ��ꂽ�G�N�X�g���J���[��";
	mes "^FF0000�e�E�Ƃ�2���^000000��";
	mes "�Ȃ��Ă���܂��B";
	next;
	mes "[�������F�t]";
	mes "���āA�����͈ȏ�ł��B";
	mes "���Ȃ��̖]�ރT�[�r�X��";
	mes "�I�����Ă��������B";
	next;
	switch(select("^006400�J���[�T���v��^000000������","^0000FF�G�N�X�g���J���[^000000�ɕύX����","^FF0000�f�t�H���g�J���[^000000�ɖ߂�","��߂�")) {
	case 1:
		mes "[�������F�t]";
		mes "�T���v���������ɂȂ�̂ł��ˁH";
		mes "���[�ƁA���Ȃ��̐E�Ƃł��Ɓc�c";
		mes "������ł��ˁB";
		next;
		cutin ExcolorSample(Job),4;
		mes "[�������F�t]";
		mes "���񂲎Q�l�Ɋ肢�܂��B";
		mes "1�Ԃ�2�ԁA���ԈႦ�̂Ȃ��悤";
		mes "�悭���m�F���������ˁB";
		close;
	case 2:
		set '@num,getlook(7);
		if('@num != 0) {
			set '@num,'@num-1;
			if('@num == 1)
				set '@excolor,2;
			else if('@num == 2)
				set '@excolor,1;
			mes "[�������F�t]";
			mes "����H";
			mes "���Ȃ��͊���";
			mes "^FF0000" +'@num+ "��^000000�̐F��";
			mes "���F����Ă���悤�ł����c�c";
			mes "�������ނ�^0000FF" +'@excolor+ "��^000000�̐F��";
			mes "���߂Ȃ��������̂ł����H";
			next;
			if(select("��߂Ă���","^0000FF" +'@excolor+ "��^000000�ɐ��F����") == 1) {
				mes "[�������F�t]";
				mes "�����ł����B";
				mes "�܂��̋@������҂����Ă���܂��B";
				close;
			}
			if(countitem(6046) < 1) {
				mes "[�������F�t]";
				mes "����H";
				mes "�G�N�X�g���J���[�`�P�b�g��";
				mes "�������ł͂Ȃ��H";
				mes "�p�ӏo���܂�����A�܂������ŉ������B";
				close;
			}
			mes "[�������F�t]";
			mes "�������܂�܂����B";
			mes "����ł͑������F�����ɂ�����܂��I";
			mes "�G�C�b�I";
			next;
			mes "[�������F�t]";
			mes "�����ł��I";
			mes "�ǂ��ł��H�@�Y��ł��傤�H";
			mes "�����F�Ɍ����т炩��������";
			mes "�d���Ȃ��񂶂�Ȃ��ł����H";
			delitem 6046,1;
			setlook 7,'@excolor+1;
			close;
		}
		if(countitem(6046) < 1) {
			mes "[�������F�t]";
			mes "����H";
			mes "�G�N�X�g���J���[�`�P�b�g��";
			mes "�������ł͂Ȃ��H";
			mes "�p�ӏo���܂�����A�܂������ŉ������B";
			close;
		}
		while(1) {
			mes "[�������F�t]";
			mes "�G�N�X�g���J���[��";
			mes "^FF00001��^000000��^0000FF2��^000000��2��ނ������܂���";
			mes "�ǂ���̐F����]����܂����H";
			next;
			switch(select("^FF00001��^000000","^0000FF2��^000000","^006400�J���[�T���v��^000000������","��߂�")) {
			case 1:
				set '@excolor,1;
				break;
			case 2:
				set '@excolor,2;
				break;
			case 3:
				mes "[�������F�t]";
				mes "�T���v���������ɂȂ�̂ł��ˁH";
				mes "���[�ƁA���Ȃ��̐E�Ƃł��Ɓc�c";
				mes "������ł��ˁB";
				next;
				cutin ExcolorSample(Job), 4;
				mes "[�������F�t]";
				mes "���F����܂����H";
				next;
				if(select("�͂�","������") == 2) {
					mes "[�������F�t]";
					mes "�����ł����c�c";
					mes "�܂��̋@������҂����Ă���܂��B";
					close;
				}
				continue;
			case 4:
				mes "[�������F�t]";
				mes "�����ł����c�c";
				mes "�܂��̋@������҂����Ă���܂��B";
				close;
			}
			mes "[�������F�t]";
			mes "^FF0000" +'@excolor+ "��^000000��";
			mes "�ԈႢ����܂��񂩁H";
			next;
			if(select("������Ƒ҂���","^FF0000" +'@excolor+ "��^000000�ɐ��F����") == 1)
				continue;
			mes "[�������F�t]";
			mes "�������܂�܂����B";
			mes "����ł͑������F�����ɂ�����܂��I";
			mes "�G�C�b�I";
			next;
			mes "[�������F�t]";
			mes "�����ł��I";
			mes "�ǂ��ł��H�@�Y��ł��傤�H";
			mes "�����F�Ɍ����т炩��������";
			mes "�d���Ȃ��񂶂�Ȃ��ł����H";
			delitem 6046,1;
			setlook 7,'@excolor+1;
			close;
		}
	case 3:
		if(getlook(7) == 0) {
			mes "[�������F�t]";
			mes "����H";
			mes "���Ɍ��̐F�̂悤�ł����H";
			close;
		}
		if(countitem(6047) < 1) {
			mes "[�������F�t]";
			mes "����H";
			mes "�f�t�H���g�J���[�`�P�b�g��";
			mes "�������ł͂Ȃ��H";
			mes "�p�ӏo���܂�����A�܂������ŉ������B";
			close;
		}
		mes "[�������F�t]";
		mes "�悭���o�傳��܂����B";
		mes "����ł͑������F�����ɂ�����܂��I";
		mes "�{���Ɍ��̐F�ɖ߂��܂���H";
		next;
		if(select("����ς��߂�","���肢���܂�") == 1) {
			mes "[�������F�t]";
			mes "�����ł����c�c";
			mes "�܂��̋@������҂����Ă���܂��B";
			close;
		}
		mes "[�������F�t]";
		mes "�����ł��I";
		mes "���肪�Ƃ��������܂����B";
		delitem 6047,1;
		setlook 7,0;
		close;
	case 4:
		mes "[�������F�t]";
		mes "�����ł����c�c";
		mes "�܂��̋@������҂����Ă���܂��B";
		close;
	}
}

//============================================================
// �R��p��j
//------------------------------------------------------------
prontera.gat,125,62,4	script	�R�拦��L���	832,{
	if(countitem(12622) > 0) {
		mes "[�R�拦��L��S����]";
		mes "�₟�A����ɂ��́B";
		mes "����^0000FF�~�b�h�K���h�R�拦��^000000��";
		mes "�L����Ƃ��Ċ������Ă���҂ł��B";
		next;
		mes "[�R�拦��L���]";
		mes "�M���͉�X�̋���̌_��҂ł��ˁI";
		next;
		mes "[�R�拦��L���]";
		mes "���������R�搶���̂�����";
		mes "��낵�����肢���܂��I";
		close;
	}
	mes "[�R�拦��L��S����]";
	mes "�₟�A����ɂ��́B";
	mes "����^0000FF�~�b�h�K���h�R�拦��^000000��";
	mes "�L����Ƃ��Ċ������Ă���҂ł��B";
	next;
	mes "[�R�拦��L���]";
	mes "��X�́w��邱�Ɓx�ɓ�������";
	mes "�����̔����A���ǁA�񋟂�";
	mes "��Ɩ��Ƃ��Ă���g�D�ł��B";
	next;
	mes "[�R�拦��L���]";
	mes "��X�̒񋟂���^FF0000�R�搶��^000000��";
	mes "�T���v���J�^���O��p�ӂ��Ă���܂��B";
	mes "���Ă݂܂��񂩁H";
	next;
	if(select("^006400�R��T���v��^000000������","��߂Ă���") == 2) {
		mes "[�R�拦��L���]";
		mes "�����ł����A";
		mes "�����K�v�ɂȂ�܂�����";
		mes "�܂������ł��������B";
		close;
	}
	mes "[�R�拦��L��S����]";
	mes "�T���v���������ɂȂ�̂ł��ˁH";
	mes "���[�ƁA���Ȃ��̐E�Ƃł��Ɓc�c";
	mes "������ł��ˁB";
	next;
	switch(Job) {
	case Job_Novice:	set '@name$,"riding_novice.bmp"; break;
	case Job_Swordman:	set '@name$,"riding_swordman.bmp"; break;
	case Job_Magician:	set '@name$,"riding_magician.bmp"; break;
	case Job_Archer:	set '@name$,"riding_archer.bmp"; break;
	case Job_Acolyte:	set '@name$,"riding_acolyte.bmp"; break;
	case Job_Merchant:	set '@name$,"riding_merchant.bmp"; break;
	case Job_Thief:		set '@name$,"riding_thief.bmp"; break;
	case Job_Knight:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_loadknight.bmp";
		else
			set '@name$,"riding_knight.bmp";
		break;
	case Job_Priest:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_highpriest.bmp";
		else
			set '@name$,"riding_priest.bmp";
		break;
	case Job_Wizard:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_highwizard.bmp";
		else
			set '@name$,"riding_wizard.bmp";
		break;
	case Job_Blacksmith:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_whitesmith.bmp";
		else
			set '@name$,"riding_blacksmith.bmp";
		break;
	case Job_Hunter:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_sniper.bmp";
		else
			set '@name$,"riding_hunter.bmp";
		break;
	case Job_Assassin:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_assassincross.bmp";
		else
			set '@name$,"riding_assassin.bmp";
		break;
	case Job_Crusader:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_paladin.bmp";
		else
			set '@name$,"riding_crusader.bmp";
		break;
	case Job_Monk:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_champion.bmp";
		else
			set '@name$,"riding_monk.bmp";
		break;
	case Job_Sage:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_professor.bmp";
		else
			set '@name$,"riding_sage.bmp";
		break;
	case Job_Rogue:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_chaser.bmp";
		else
			set '@name$,"riding_rogue.bmp";
		break;
	case Job_Alchemist:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_creator.bmp";
		else
			set '@name$,"riding_alchemist.bmp";
		break;
	case Job_Bard:
	case Job_Dancer:
		if(Upper == UPPER_HIGH)
			set '@name$,"riding_clown_gypsy.bmp";
		else
			set '@name$,"riding_bard_dancer.bmp";
		break;
	case Job_SuperNovice:
	case Job_ExpandedSuperNovice:	set '@name$,"riding_supernovice.bmp"; break;
	case Job_Taekwon:		set '@name$,"riding_taekwon.bmp"; break;
	case Job_Star:			set '@name$,"riding_kwonsung.bmp"; break;
	case Job_Linker:		set '@name$,"riding_soullinker.bmp"; break;
	case Job_Gunslinger:	set '@name$,"riding_gunslinger.bmp"; break;
	case Job_Ninja:			set '@name$,"riding_ninja.bmp"; break;
	case Job_RuneKnight:	set '@name$,"riding_runeknight.bmp"; break;
	case Job_Warlock:		set '@name$,"riding_warlock.bmp"; break;
	case Job_Ranger:		set '@name$,"riding_ranger.bmp"; break;
	case Job_ArchBishop:	set '@name$,"riding_archbishop.bmp"; break;
	case Job_Mechanic:		set '@name$,"riding_mechanic.bmp"; break;
	case Job_Guillotine:	set '@name$,"riding_guillotinecross.bmp"; break;
	case Job_RoyalGuard:	set '@name$,"riding_royalguard.bmp"; break;
	case Job_Sorcerer:		set '@name$,"riding_sorcerer.bmp"; break;
	case Job_Minstrel:
	case Job_Wanderer:		set '@name$,"riding_minstrel_wanderer.bmp"; break;
	case Job_Shura:			set '@name$,"riding_sura.bmp"; break;
	case Job_Genetic:		set '@name$,"riding_genetic.bmp"; break;
	case Job_ShadowChaser:	set '@name$,"riding_shadowchaser.bmp"; break;
	case Job_Kagerou:
	case Job_Oboro:			set '@name$,"riding_kagerou_oboro.bmp"; break;
	case Job_Summoner:		set '@name$,"riding_doram.bmp"; break;
	}
	cutin '@name$,4;
	mes "[�R�拦��L��S����]";
	mes "���Ȃ��̕����̐F�ɉ�����";
	mes "�R�搶���̐F�������I��";
	mes "�T���v���ƈႤ���Ƃ��������܂��B";
	mes "�悭���m�F���������ˁB";
	close;
}

//============================================================
// �R�X�`���[���`�F���W�`�P�b�g
//------------------------------------------------------------
prontera.gat,127,62,4	script	�t�@�b�V�����f�U�C�i�[	573,{
	mes "[�t�@�b�V�����f�U�C�i�[]";
	mes "�������ق�I";
	mes "���͖`���҂̃t�@�b�V�����ɂ���";
	mes "���錤���Ɛ�����s���Ă���҂��B";
	mes "�ߑ������╞�̐��F���ǂ����A";
	mes "�����E�Ƃł������̂��̂�ύX����";
	mes "���݂ɒ��킵�Ă���̂��B";
	next;
	if(Job == Job_Summoner) {
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�����h�������̕��ɂ��Ă�";
		mes "�܂��܂���������";
		mes "�񋟂��邱�Ƃ��ł��Ȃ��񂾁B";
		mes "�\����Ȃ��B";
		close;
	}
	if(Job < Job_RuneKnight || Job > Job_ShadowChaser) {
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "���x�ƂȂ����s������d�ˁA";
		mes "�V�������c�c�����A";
		mes "^0000FF�Z�J���h�R�X�`���[��^000000��";
		mes "���������̂��I";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�Z�J���h�R�X�`���[����";
		mes "�f�U�C���������łȂ��A";
		mes "3���E�Ȃ�ł͂̌������퓬�ɂ�";
		mes "�ς�����@�\���A�ϋv���ɗD�ꂽ";
		mes "�������̈�i�ɂȂ��Ă���B";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�N�̐E�Ƃ̕���";
		mes "�܂��������Ă��Ȃ��Đ\����Ȃ��B";
		mes "���ݒ񋟂��Ă���E�Ƃ�";
		mes "�������m�F���ė~�����B";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "���Ԃ������Ă��镪�A";
		mes "�����ƒ��Ă������Ǝv����悤��";
		mes "�ǂ������d���Ă���悤��";
		mes "�S�͂�s�������Ă��炤��I";
		next;
		if(select("�񋟍ςݐE�Ƃ��m�F����","��߂�") == 2) {
			mes "[�t�@�b�V�����f�U�C�i�[]";
			mes "����ł́A�܂��B";
			close;
		}
		mes "�]�Z�J���h�R�X�`���[���񋟍ςݐE�Ɓ]";
		mes "�E���[���i�C�g^FF0000NEW!!^000000";
		mes "�E�C��";
		mes "�E�\�[�T���[";
		mes "�E�V���h�E�`�F�C�T�[";
		mes "�E�~���X�g����";
		mes "�E�����_���[";
		mes "�E�E�H�[���b�N";
		mes "�E�����W���[";
		mes "�E�A�[�N�r�V���b�v";
		mes "�E���C�����K�[�h";
		mes "�E���J�j�b�N";
		mes "�E�M���`���N���X";
		mes "�E�W�F�l�e�B�b�N";
		mes "�@";
		mes "�ȏ�";
		close;
	}
	if(getlook(13) == 0) {
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "���傤�Ǘǂ������I";
		mes "�N�̐E�Ƃ̐V�������c�c";
		mes "�Z�J���h�R�X�`���[����";
		mes "�������Ă��邼!!";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "^0000FF�R�X�`���[���`�F���W�`�P�b�g^000000��";
		mes "�����Ă���΁A�N�̕���";
		mes "��u�Œ��ւ������Ă����悤�B";
		mes "���A��u������";
		mes "�p���������邱�Ƃ͂Ȃ����I";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�Ȃ��A���̕��c�c";
		mes "�f�t�H���g�R�X�`���[���ɖ߂��ꍇ���A";
		mes "^0000FF�R�X�`���[���`�F���W�`�P�b�g^000000��";
		mes "�����̂ŁA���ӂ��Ăق����B";
	}
	else {
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�����I";
		mes "�N�A��͂�ǂ��������Ă����I";
		mes "�ǂ����ˁA�����ς���";
		mes "�C�������ς�邾�낤�H";
		mes "�t�@�b�V�����́A�l��ς���";
		mes "�͂�����̂���B";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "���āA�{���̂��p���͉����ȁH";
		mes "���̕��c�c";
		mes "�f�t�H���g�R�X�`���[����";
		mes "�������Ȃ����Ȃ�΁A";
		mes "^0000FF�R�X�`���[���`�F���W�`�P�b�g^000000��";
		mes "���ւ������Ă����悤�B";
	}
	next;
	mes "[�t�@�b�V�����f�U�C�i�[]";
	mes "�ǂ�ȕ��Ȃ̂��A";
	mes "����ς������̃G�N�X�g���J���[��";
	mes "�ǂ�ȐF�Ȃ̂��A";
	mes "����ς�����ɔ��^�┯�F��ς�����";
	mes "�ǂ��Ȃ邩�A�C�ɂȂ�Ȃ�";
	mes "^0000FF�h���X���[��^000000������Ƃ����B";
	next;
	mes "[�t�@�b�V�����f�U�C�i�[]";
	mes "���āA�ǂ�����H";
	mes "�N���]�ރT�[�r�X��";
	mes "�I�����Ă��ꂽ�܂��B";
	next;
	switch(select("^FF69B4�h���X���[��^000000������","^0000FF�R�X�`���[����ύX^000000����","��߂�")) {
	case 1:
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�h���X���[��������̂��ˁH";
		mes "�h���X���[�����J���ƁA";
		mes "�Z�J���h�R�X�`���[�������łȂ�";
		mes "���̐F�A���^�A���F�Ȃǂ�";
		mes "�ύX�����Ƃ��̃C���[�W���m�F�ł���B";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�����܂ł��C���[�W���m�F�ł���";
		mes "�����Ȃ̂ŁA�h���X���[����";
		mes "�e��ύX�����ۂɂł���킯�ł�";
		mes "�Ȃ��̂Œ��ӂ��Ăق����B";
		next;
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "����ł́A���������B";
		mes "�h���X���[���������܂�";
		mes "�����̒��E��R����o���邼�B";
		next;
		mes "�]�h���X���[���E�B���h�E�́A";
		mes "�@�J�����܂܈ړ����\�ł��B";
		mes "�@[Esc]�L�[���A�E��́~�{�^����";
		mes "�@�E�B���h�E����邱�Ƃ�";
		mes "�@�ł��܂��]";
		opendressroom;
		close;
	case 2:
		if(getlook(13) == 0) {
			mes "[�t�@�b�V�����f�U�C�i�[]";
			mes "�N�̕����͌���";
			mes "^FF0000�f�t�H���g�R�X�`���[��^000000���ˁB";
			mes "^0000FF�Z�J���h�R�X�`���[��^000000��";
			mes "�ύX���邩�ˁH";
			set '@style,1;
		}
		else {
			mes "[�t�@�b�V�����f�U�C�i�[]";
			mes "�N�̕����͌���";
			mes "^FF0000�Z�J���h�R�X�`���[��^000000���ˁB";
			mes "^0000FF�f�t�H���g�R�X�`���[��^000000��";
			mes "�ύX���邩�ˁH";
			set '@style,0;
		}
		next;
		if(select("��߂Ă���","^0000FF�ύX����^000000") == 1) {
			mes "[�t�@�b�V�����f�U�C�i�[]";
			mes "�������ˁB";
			mes "�ł́A�܂��̋@��ɁB";
			close;
		}
		if(countitem(6959) == 0) {
			mes "[�t�@�b�V�����f�U�C�i�[]";
			mes "����H";
			mes "�R�X�`���[���`�F���W�`�P�b�g��";
			mes "�����Ă��Ȃ��悤���ˁH";
			mes "�p�ӏo������A�܂����Ă��ꂽ�܂��B";
			close;
		}
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "����ł͑����A���𒅑ւ�������";
		mes "�����悤�B";
		mes "�c�c�c�c�ނ������[�[�[��!!";
		next;
		misceffect 414,"";
		misceffect 262,"";
		misceffect 273,"";
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�Ă₟����!!";
		mes "�ǂ����ˁH";
		mes "���܂����������낤!!";
		mes "���̕��ŋC�����V����";
		mes "�y�����߂����Ă��ꂽ�܂�!!";
		delitem 6959,1;
		setlook 13,'@style;
		close;
	case 3:
		mes "[�t�@�b�V�����f�U�C�i�[]";
		mes "�������ˁB";
		mes "�ł́A�܂��̋@��ɁB";
		close;
	}
}

//============================================================
// �W�F���~�[�̔��e�N�[�|��
//------------------------------------------------------------
izlude.gat,136,122,6	script	�V�j�A�X�^�C���X�g	878,{
	set '@doram,(Job==Job_Summoner? 1: 0);
	set '@sex$,(Sex)? "m": "f";

	mes "[�V�j�A�X�^�C���X�g]";
	mes "����ɂ��́A" +((Sex)? "�N��B": "�킵�̃��f�B�[�B");
	mes "���̓~�b�h�K���h�Ńg�b�v���x����";
	mes "�V�j�A�X�^�C���X�g�A";
	mes "�W�F���~�[���B";
	next;
	mes "[�W�F���~�[]";
	mes "^FF0000�W�F���~�[�̔��e�N�[�|��^000000��";
	mes "�������Ȃ�΁A";
	mes "�F�X�ȃw�A�X�^�C��������Ă��悤�B";
	next;
	mes "[�W�F���~�[]";
	mes "������Ăł���̂͒j�����ꂼ��";
	mes ('@doram? 6: 25)+ "��ނ̃w�A�X�^�C���ƂȂ邪�c�c";
	mes "��x�T���v�������Ă݂Ȃ����H";
	while(1) {
		next;
		switch(select("���ʃT���v��������","�ʏ�T���v��������","�w�A�X�^�C����ύX����","��߂Ă���")) {
		case 1:
			if('@doram) {
				mes "[�W�F���~�[]";
				mes "�h�������ɓ��ʃT���v���͂Ȃ��񂾁B";
				mes "�ʏ�T���v������";
				mes "�I��ł���邩�H";
				continue;
			}
			mes "[�W�F���~�[]";
			mes "�ǂ���̃T���v�������������ȁH";
			set '@hairstr1$,(Sex)? "�V���o���G�X�y�V����": "�{�����[���}�W�b�N�X�y�V����";
			set '@hairstr2$,(Sex)? "�g���l�[�h�o���J���X�^�C��": "�h���C�V�[�Y���t�H�[";
			next;
			switch(select('@hairstr1$,'@hairstr2$,"��߂Ă���")) {
			case 1:
				cutin "hair_" +'@sex$+ "_28",4;
				mes "[�W�F���~�[]";
				mes '@hairstr1$+ "��";
				mes "����Ȋ����ɂȂ�ȁB";
				mes "���āA�ǂ�����H";
				continue;
			case 2:
				cutin "hair_" +'@sex$+ "_29",4;
				mes "[�W�F���~�[]";
				mes '@hairstr2$+ "��";
				mes "����Ȋ����ɂȂ�ȁB";
				mes "���āA�ǂ�����H";
				continue;
			case 3:
				cutin "hair_" +'@sex$+ "_01",255;
				mes "[�W�F���~�[]";
				mes "���������H";
				mes "�܂��������N�����痈�Ă����B";
				close;
			}
		case 2:
			set '@max_hair,('@doram? 6: 23);
			mes "[�W�F���~�[]";
			mes "�T���v����1�ԁ`" +'@max_hair+ "�Ԃ܂�";
			mes "�p�ӂ��Ă��邩��A";
			mes "�������w�A�X�^�C����";
			mes "�ԍ�����͂��Ă���B";
			mes "���Ɍ��������^���Ȃ����";
			mes "0�Ԃ�I��ł����΂�����B";
			next;
			input '@hair;
			if('@hair == 0) {
				cutin "hair_" +'@sex$+ "_01", 255;
				mes "[�W�F���~�[]";
				mes "���������H";
				mes "�܂��������N�����痈�Ă����B";
				close;
			}
			if('@hair < 0 || '@hair > '@max_hair) {
				cutin "hair_" +'@sex$+ "_01", 255;
				mes "[�W�F���~�[]";
				mes "����H";
				mes "1�`" +'@max_hair+ "�̔ԍ�����͂��Ă���Ȃ����H";
				close;
			}
			switch('@hair) {
			case 1:
				set '@hair$,"01";
				if('@doram) set '@hairstr$,(Sex)? "�_�b�V���J�b�g": "�ӂ݂ӂ݃p�[�}";
				else		set '@hairstr$,(Sex)? "���񂾐U��X�^�C��": "���}�蓖�X�^�C��";
				break;
			case 2:
				set '@hair$,"02";
				if('@doram) set '@hairstr$,(Sex)? "�L���������^�r�[": "�}�V���}���J�b�g";
				else		set '@hairstr$,(Sex)? "���茕�C���X�^�C��": "�o�b�V���X�^�C��";
				break;
			case 3:
				set '@hair$,"03";
				if('@doram) set '@hairstr$,(Sex)? "�`���^�����O�J�b�g": "�O���[�~���O�X�g���[�g";
				else		set '@hairstr$,(Sex)? "�i�p�[���r�[�g�X�^�C��": "�t���X�g�_�C�o�[�X�^�C��";
				break;
			case 4:
				set '@hair$,"04";
				if('@doram) set '@hairstr$,(Sex)? "�x���J�b�g": "�ɂ��ɂ��e�[��";
				else		set '@hairstr$,(Sex)? "�_�u���X�g���C�t�B���O�X�^�C��": "�A���[�V�����[�X�^�C��";
				break;
			case 5:
				set '@hair$,"05";
				if('@doram) set '@hairstr$,(Sex)? "�`���R�X�^�C��": "�~���N�X�^�C��";
				else		set '@hairstr$,(Sex)? "�G���W�F���X�X�^�C��": "�q�[���X�^�C��";
				break;
			case 6:
				set '@hair$,"06";
				if('@doram) set '@hairstr$,(Sex)? "�J�v�`�[�m�^�r�[": "�N�b�L�[���N���[���J�b�g";
				else		set '@hairstr$,(Sex)? "�v�b�V���J�[�g�X�^�C��": "�I�X�J�݃X�^�C��";
				break;
			case 7:
				set '@hair$,"07";
				set '@hairstr$,(Sex)? "�C���x�i���X�^�C��": "�_�u���A�^�b�N�X�^�C��";
				break;
			case 8:
				set '@hair$,"08";
				set '@hairstr$,(Sex)? "�{�E�����O�o�b�V���X�^�C��": "�O�����A�X�^�C��";
				break;
			case 9:
				set '@hair$,"09";
				set '@hairstr$,(Sex)? "�x�i���_�X�g�X�^�C��": "SP�񕜗͌���X�^�C��";
				break;
			case 10:
				set '@hair$,"10";
				set '@hairstr$,(Sex)? "�^�[���A���f�b�h�X�^�C��": "�t�H�[�}�V�[�X�^�C��";
				break;
			case 11:
				set '@hair$,"11";
				set '@hairstr$,(Sex)? "�h���S�m���W�[�X�^�C��": "�O�����h�N���X�X�^�C��";
				break;
			case 12:
				set '@hair$,"12";
				set '@hairstr$,(Sex)? "���C�X�C���X�^�C��": "�N���[���X�L���X�^�C��";
				break;
			case 13:
				set '@hair$,"13";
				set '@hairstr$,(Sex)? "�T���_�[�X�g�[���X�^�C��": "�C�D�X�^�C��";
				break;
			case 14:
				set '@hair$,"14";
				set '@hairstr$,(Sex)? "�A���R�[���X�^�C��": "�T�[�r�X�t�H�[���[�X�^�C��";
				break;
			case 15:
				set '@hair$,"15";
				set '@hairstr$,(Sex)? "�O�����g�D�[�X�X�^�C��": "�I�[�g�J�E���^�[�X�^�C��";
				break;
			case 16:
				set '@hair$,"16";
				set '@hairstr$,(Sex)? "�u���b�c�r�[�g�X�^�C��": "�A���N���X�l�A�X�^�C��";
				break;
			case 17:
				set '@hair$,"17";
				set '@hairstr$,(Sex)? "�z�Δ����X�^�C��": "�n���}�[�t�H�[���X�^�C��";
				break;
			case 18:
				set '@hair$,"18";
				set '@hairstr$,(Sex)? "�t�@�C�A�s���[�X�^�C��": "���s�e���T���_�[�X�^�C��";
				break;
			case 19:
				set '@hair$,"19";
				set '@hairstr$,(Sex)? "���C���e�����X�^�C��": "�o�C�I�����g�Q�C���X�^�C��";
				break;
			case 20:
				set '@hair$,"20";
				set '@hairstr$,(Sex)? "�v�e�B�b�g�X�^�C��": "�X�v�����O���r�b�g�X�^�C��";
				break;
			case 21:
				set '@hair$,"21";
				set '@hairstr$,(Sex)? "�G�N�X�L���[�V���i�[�X�^�C��": "�n�[�s�[�X�^�C��";
				break;
			case 22:
				set '@hair$,"22";
				set '@hairstr$,(Sex)? "�v�����X�X�^�C��": "���f���[�T�X�^�C��";
				break;
			case 23:
				set '@hair$,"23";
				set '@hairstr$,(Sex)? "�f�r�A�X�X�^�C��": "�C�V�X�X�^�C��";
				break;
			}
			cutin "hair_" +(('@doram)? "dr_": "")+'@sex$+ "_"+'@hair$,4;
			mes "[�W�F���~�[]";
			mes '@hairstr$+ "��";
			mes "����Ȋ����ɂȂ�ȁB";
			mes "���āA�ǂ�����H";
			continue;
		case 3:
			 if(countitem(6707) < 1) {
				cutin "hair_" +(('@doram)? "dr_": "")+'@sex$+ "_01", 255;
				mes "[�W�F���~�[]";
				mes "�������Ȃ��ẮI";
				mes "�c�c�Ǝv�������A";
				mes "^FF0000�W�F���~�[�̔��e�N�[�|��^000000��";
				mes "�������ł͂Ȃ��悤���ˁB";
				mes "�c�O�����܂��̋@��ɂƂ������ƂŁB";
				close;
			}
			mes "[�W�F���~�[]";
			mes "�������Ȃ��ẮI";
			mes "�ł́A�ǂ̃w�A�X�^�C����";
			mes "���D�݂��ȁH";
			next;
			switch(select("���ʃw�A�X�^�C������I��","�ʏ�w�A�X�^�C������I��","��߂Ă���")) {
			case 1:
				if('@doram) {
					mes "[�W�F���~�[]";
					mes "�h�������ɓ��ʃw�A�X�^�C���͂Ȃ��񂾁B";
					mes "�ʏ�w�A�X�^�C������";
					mes "�I��ł���邩�H";
					continue;
				}
				set '@hairstr1$,(Sex)? "�V���o���G�X�y�V����": "�{�����[���}�W�b�N�X�y�V����";
				set '@hairstr2$,(Sex)? "�g���l�[�h�o���J���X�^�C��": "�h���C�V�[�Y���t�H�[";
				next;
				switch(select('@hairstr1$,'@hairstr2$,"��߂Ă���")) {
				case 1:
					set '@hair,28;
					set '@hair$,"28";
					set '@hairstr$,(Sex)? "�V���o���G�X�y�V����": "�{�����[���}�W�b�N�X�y�V����";
					break;
				case 2:
					set '@hair,29;
					set '@hair$,"29";
					set '@hairstr$,(Sex)? "�g���l�[�h�o���J���X�^�C��": "�h���C�V�[�Y���t�H�[";
					break;
				case 3:
					cutin "hair_" +'@sex$+ "_01",255;
					mes "[�W�F���~�[]";
					mes "���������H";
					mes "�܂��������N�����痈�Ă����B";
					close;
				}
				break;
			case 2:
				set '@max_hair,('@doram? 6: 23);
				mes "[�W�F���~�[]";
				mes "���ꂶ��A��]�̃X�^�C����";
				mes "�����Ă���B";
				mes "�f�G�ȃw�A�X�^�C����";
				mes "�d�グ�Č����悤�B";
				mes "�w�A�X�^�C����";
				mes "1�ԁ`" +'@max_hair+ "�Ԃ܂ł��邼�B";
				next;
				input '@hair;
				if('@hair == 0) {
					cutin "hair_" +'@sex$+ "_01", 255;
					mes "[�W�F���~�[]";
					mes "���������H";
					mes "�܂��������N�����痈�Ă����B";
					close;
				}
				if('@hair < 0 || '@hair > '@max_hair) {
					cutin "hair_" +'@sex$+ "_01", 255;
					mes "[�W�F���~�[]";
					mes "����H";
					mes "1�`" +'@max_hair+ "�̔ԍ�����͂��Ă���Ȃ����H";
					close;
				}
				switch('@hair) {
				case 1:
					set '@hair$,"01";
					if('@doram) set '@hairstr$,(Sex)? "�_�b�V���J�b�g": "�ӂ݂ӂ݃p�[�}";
					else		set '@hairstr$,(Sex)? "���񂾐U��X�^�C��": "���}�蓖�X�^�C��";
					break;
				case 2:
					set '@hair$,"02";
					if('@doram) set '@hairstr$,(Sex)? "�L���������^�r�[": "�}�V���}���J�b�g";
					else		set '@hairstr$,(Sex)? "���茕�C���X�^�C��": "�o�b�V���X�^�C��";
					break;
				case 3:
					set '@hair$,"03";
					if('@doram) set '@hairstr$,(Sex)? "�`���^�����O�J�b�g": "�O���[�~���O�X�g���[�g";
					else		set '@hairstr$,(Sex)? "�i�p�[���r�[�g�X�^�C��": "�t���X�g�_�C�o�[�X�^�C��";
					break;
				case 4:
					set '@hair$,"04";
					if('@doram) set '@hairstr$,(Sex)? "�x���J�b�g": "�ɂ��ɂ��e�[��";
					else		set '@hairstr$,(Sex)? "�_�u���X�g���C�t�B���O�X�^�C��": "�A���[�V�����[�X�^�C��";
					break;
				case 5:
					set '@hair$,"05";
					if('@doram) set '@hairstr$,(Sex)? "�`���R�X�^�C��": "�~���N�X�^�C��";
					else		set '@hairstr$,(Sex)? "�G���W�F���X�X�^�C��": "�q�[���X�^�C��";
					break;
				case 6:
					set '@hair$,"06";
					if('@doram) set '@hairstr$,(Sex)? "�J�v�`�[�m�^�r�[": "�N�b�L�[���N���[���J�b�g";
					else		set '@hairstr$,(Sex)? "�v�b�V���J�[�g�X�^�C��": "�I�X�J�݃X�^�C��";
					break;
				case 7:
					set '@hair$,"07";
					set '@hairstr$,(Sex)? "�C���x�i���X�^�C��": "�_�u���A�^�b�N�X�^�C��";
					break;
				case 8:
					set '@hair$,"08";
					set '@hairstr$,(Sex)? "�{�E�����O�o�b�V���X�^�C��": "�O�����A�X�^�C��";
					break;
				case 9:
					set '@hair$,"09";
					set '@hairstr$,(Sex)? "�x�i���_�X�g�X�^�C��": "SP�񕜗͌���X�^�C��";
					break;
				case 10:
					set '@hair$,"10";
					set '@hairstr$,(Sex)? "�^�[���A���f�b�h�X�^�C��": "�t�H�[�}�V�[�X�^�C��";
					break;
				case 11:
					set '@hair$,"11";
					set '@hairstr$,(Sex)? "�h���S�m���W�[�X�^�C��": "�O�����h�N���X�X�^�C��";
					break;
				case 12:
					set '@hair$,"12";
					set '@hairstr$,(Sex)? "���C�X�C���X�^�C��": "�N���[���X�L���X�^�C��";
					break;
				case 13:
					set '@hair$,"13";
					set '@hairstr$,(Sex)? "�T���_�[�X�g�[���X�^�C��": "�C�D�X�^�C��";
					break;
				case 14:
					set '@hair$,"14";
					set '@hairstr$,(Sex)? "�A���R�[���X�^�C��": "�T�[�r�X�t�H�[���[�X�^�C��";
					break;
				case 15:
					set '@hair$,"15";
					set '@hairstr$,(Sex)? "�O�����g�D�[�X�X�^�C��": "�I�[�g�J�E���^�[�X�^�C��";
					break;
				case 16:
					set '@hair$,"16";
					set '@hairstr$,(Sex)? "�u���b�c�r�[�g�X�^�C��": "�A���N���X�l�A�X�^�C��";
					break;
				case 17:
					set '@hair$,"17";
					set '@hairstr$,(Sex)? "�z�Δ����X�^�C��": "�n���}�[�t�H�[���X�^�C��";
					break;
				case 18:
					set '@hair$,"18";
					set '@hairstr$,(Sex)? "�t�@�C�A�s���[�X�^�C��": "���s�e���T���_�[�X�^�C��";
					break;
				case 19:
					set '@hair$,"19";
					set '@hairstr$,(Sex)? "���C���e�����X�^�C��": "�o�C�I�����g�Q�C���X�^�C��";
					break;
				case 20:
					set '@hair$,"20";
					set '@hairstr$,(Sex)? "�v�e�B�b�g�X�^�C��": "�X�v�����O���r�b�g�X�^�C��";
					break;
				case 21:
					set '@hair$,"21";
					set '@hairstr$,(Sex)? "�G�N�X�L���[�V���i�[�X�^�C��": "�n�[�s�[�X�^�C��";
					break;
				case 22:
					set '@hair$,"22";
					set '@hairstr$,(Sex)? "�v�����X�X�^�C��": "���f���[�T�X�^�C��";
					break;
				case 23:
					set '@hair$,"23";
					set '@hairstr$,(Sex)? "�f�r�A�X�X�^�C��": "�C�V�X�X�^�C��";
					break;
				}
				break;
			case 3:
				cutin "hair_" +'@sex$+ "_01",255;
				mes "[�W�F���~�[]";
				mes "���������H";
				mes "�܂��������N�����痈�Ă����B";
				close;
			}
			cutin "hair_" +(('@doram)? "dr_": "")+'@sex$+ "_"+'@hair$,4;
			mes "[�W�F���~�[]";
			mes '@hairstr$+ "��";
			mes "����Ȋ����ɂȂ邪�A";
			mes "�������ȁH";
			next;
			if(select("����ς��߂�","���肢���܂�") == 1) {
				cutin "hair_" +'@sex$+ "_01",255;
				mes "[�W�F���~�[]";
				mes "���������H";
				mes "�܂��������N�����痈�Ă����B";
				close;
			}
			mes "[�W�F���~�[]";
			mes "�ꏏ�ɃJ���[�����Ă����悤�B";
			mes "�ǂ̐F���������ȁH";
			next;
			set '@color,select("���F","���F","�g�F","�ΐF","�F","���F","���F","�ԐF","��߂�");
			if('@color == 9) {
				cutin "hair_" +'@sex$+ "_01",255;
				mes "[�W�F���~�[]";
				mes "���������H";
				mes "�܂��������N�����痈�Ă����B";
				close;
			}
			mes "�]�V���b�V���b�V���b�V��";
			mes "�@�`���L�`���L�`���L";
			mes "�@�T�b�T�b�T�A�T�b�T�b�T";
			mes "�@�u�H�[�[�[�[�[�[�[�[�[�[�[���]";
			next;
			cutin "hair_" +'@sex$+ "_01",255;
			mes "[�W�F���~�[]";
			mes "�悵�A�ł����I";
			mes "����A�悭�������Ă�B";
			mes "�C����ς������Ȃ�����";
			mes "����܂����p���Ă���B";
			setlook 1,'@hair;
			setlook 6,'@color;
			delitem 6707, 1;
			close;
		case 4:
			cutin "hair_" +'@sex$+ "_01",255;
			mes "[�W�F���~�[]";
			mes "���������H";
			mes "�܂��������N�����痈�Ă����B";
			close;
		}
	}
}
