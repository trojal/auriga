/*
 * Mechanics probe: runs mechanics fixtures inside the real map-server and writes what the server computes, for
 * TitanRO's mechanics harness (TitanRO/titanro2 tools/mechharness), which compares it with seasonro's probe.
 *
 * Only in builds made with `make MECH_PROBE=1`; normal builds don't compile it. It is #included at the end of
 * battle.c, so it can call battle_calc_attack(), which is static there.
 *
 *   ./map-server --mech-probe <fixtures file> --mech-probe-out <results file>
 *
 * Once the server has loaded its data (the end of do_init), each fixture builds a player with no client (fd 0,
 * whose dummy session takes what clif writes) and spawns its monster on a real map, then the probe records:
 * - status: the values the client's status window shows (clif_updatestatus), and MaxHP/MaxSP;
 * - min: one normal attack with every atn_rand() returning 0 (utils.h, mechprobe_rand);
 * - sample: N normal attacks with the normal generator seeded from the fixture: hit, crit and dodge counts, and the
 *   min/max/mean damage of normal and critical hits;
 * - attacks: the same min and sample for each skill in `attack=`, with its cast time and after-cast delay;
 * - mob_attacks: the monster attacking the player, for each `mob_attack=` skill (0: its normal attack);
 * - effects: for each `effect=` skill, how often its status effects land on the monster and for how long.
 * Before measuring, the player casts each `buffs=` skill on itself and uses each `use=` item.
 * Then the server exits. The fixtures and results formats are in tools/mechharness/PROBE.md in TitanRO/titanro2.
 *
 * src/map's Makefile compiles every .c file, so on its own (and in builds without MECH_PROBE) this file is empty.
 */
#ifdef MECHPROBE_IN_BATTLE_C

#include <time.h>

#define MECHPROBE_MAP "prontera.gat"
#define MECHPROBE_X 150
#define MECHPROBE_Y 150
#define MECHPROBE_MAX_LIST 24

struct mechprobe_pair {
	int a, b;
};

struct mechprobe_fixture {
	char id[128];
	int job, blv, jlv;
	int str, agi, vit, int_, dex, luk;
	struct mechprobe_pair equip[MECHPROBE_MAX_LIST];
	int equip_count;
	struct mechprobe_pair skills[MECHPROBE_MAX_LIST];
	int skill_count;
	struct mechprobe_pair attacks[MECHPROBE_MAX_LIST];
	int attack_count;
	struct mechprobe_pair mob_attacks[MECHPROBE_MAX_LIST];
	int mob_attack_count;
	struct mechprobe_pair cards[MECHPROBE_MAX_LIST];	// card:slot in the first equip= item
	int card_count;
	struct mechprobe_pair effects[MECHPROBE_MAX_LIST];	// skills whose status effects on the monster are measured
	int effect_count;
	struct mechprobe_pair buffs[MECHPROBE_MAX_LIST];	// skills the player casts on itself after equipping
	int buff_count;
	struct mechprobe_pair use[MECHPROBE_MAX_LIST];	// items (item:count) the player then uses
	int use_count;
	int mob;
	int samples;
	unsigned int seed;
	int cart, mado, falcon;	// options=: a cart, a Mado Gear, a falcon
	int cart_weight;	// cart_weight=: the cart's load (weight units)
};

static int mechprobe_parse_pairs(const char *value, struct mechprobe_pair *out, int *count)
{
	const char *p = value;
	while(*p != '\0') {
		int a = 0, b = 0, n = 0;
		if(*count >= MECHPROBE_MAX_LIST || sscanf(p, "%d:%d%n", &a, &b, &n) != 2)
			return 0;
		out[*count].a = a;
		out[*count].b = b;
		(*count)++;
		p += n;
		if(*p == ',')
			p++;
	}
	return 1;
}

static int mechprobe_parse(const char *line, struct mechprobe_fixture *f, char *error, size_t error_size)
{
	char key[64], value[1024];
	int n = 0;
	const char *p = line;

	memset(f, 0, sizeof(*f));
	f->blv = f->jlv = 1;
	f->str = f->agi = f->vit = f->int_ = f->dex = f->luk = 1;
	f->seed = 1;
	while(sscanf(p, " %63[^= \t\r\n]=%1023s%n", key, value, &n) == 2) {
		p += n;
		if(strcmp(key, "id") == 0) {
			strncpy(f->id, value, sizeof(f->id) - 1);
		} else if(strcmp(key, "job") == 0) f->job = atoi(value);
		else if(strcmp(key, "blv") == 0) f->blv = atoi(value);
		else if(strcmp(key, "jlv") == 0) f->jlv = atoi(value);
		else if(strcmp(key, "str") == 0) f->str = atoi(value);
		else if(strcmp(key, "agi") == 0) f->agi = atoi(value);
		else if(strcmp(key, "vit") == 0) f->vit = atoi(value);
		else if(strcmp(key, "int") == 0) f->int_ = atoi(value);
		else if(strcmp(key, "dex") == 0) f->dex = atoi(value);
		else if(strcmp(key, "luk") == 0) f->luk = atoi(value);
		else if(strcmp(key, "mob") == 0) f->mob = atoi(value);
		else if(strcmp(key, "samples") == 0) f->samples = atoi(value);
		else if(strcmp(key, "seed") == 0) f->seed = (unsigned int)strtoul(value, NULL, 10);
		else if(strcmp(key, "cart_weight") == 0) f->cart_weight = atoi(value);
		else if(strcmp(key, "options") == 0) {
			char opts[1024], *o, *save = NULL;
			snprintf(opts, sizeof(opts), "%s", value);
			for(o = strtok_r(opts, ",", &save); o != NULL; o = strtok_r(NULL, ",", &save)) {
				if(strcmp(o, "cart") == 0) f->cart = 1;
				else if(strcmp(o, "mado") == 0) f->mado = 1;
				else if(strcmp(o, "falcon") == 0) f->falcon = 1;
				else {
					snprintf(error, error_size, "unknown option %s", o);
					return 0;
				}
			}
		}
		else if(strcmp(key, "equip") == 0) {
			if(!mechprobe_parse_pairs(value, f->equip, &f->equip_count)) {
				snprintf(error, error_size, "bad equip: %s", value);
				return 0;
			}
		} else if(strcmp(key, "skills") == 0) {
			if(!mechprobe_parse_pairs(value, f->skills, &f->skill_count)) {
				snprintf(error, error_size, "bad skills: %s", value);
				return 0;
			}
		} else if(strcmp(key, "attack") == 0) {
			if(!mechprobe_parse_pairs(value, f->attacks, &f->attack_count)) {
				snprintf(error, error_size, "bad attack: %s", value);
				return 0;
			}
		} else if(strcmp(key, "cards") == 0) {
			if(!mechprobe_parse_pairs(value, f->cards, &f->card_count)) {
				snprintf(error, error_size, "bad cards: %s", value);
				return 0;
			}
		} else if(strcmp(key, "effect") == 0) {
			if(!mechprobe_parse_pairs(value, f->effects, &f->effect_count)) {
				snprintf(error, error_size, "bad effect: %s", value);
				return 0;
			}
		} else if(strcmp(key, "mob_attack") == 0) {
			if(!mechprobe_parse_pairs(value, f->mob_attacks, &f->mob_attack_count)) {
				snprintf(error, error_size, "bad mob_attack: %s", value);
				return 0;
			}
		} else if(strcmp(key, "buffs") == 0) {
			if(!mechprobe_parse_pairs(value, f->buffs, &f->buff_count)) {
				snprintf(error, error_size, "bad buffs: %s", value);
				return 0;
			}
		} else if(strcmp(key, "use") == 0) {
			if(!mechprobe_parse_pairs(value, f->use, &f->use_count)) {
				snprintf(error, error_size, "bad use: %s", value);
				return 0;
			}
		}
		// Unknown keys are left for the other server's probe or later versions.
	}
	if(f->id[0] == '\0') {
		snprintf(error, error_size, "no id");
		return 0;
	}
	return 1;
}

static void mechprobe_json_str(FILE *out, const char *s)
{
	fputc('"', out);
	for(; *s; s++) {
		if(*s == '"' || *s == '\\')
			fprintf(out, "\\%c", *s);
		else if((unsigned char)*s < 0x20)
			fprintf(out, "\\u%04x", (unsigned char)*s);
		else
			fputc(*s, out);
	}
	fputc('"', out);
}

static int mechprobe_next_id = 150000000;

static struct map_session_data *mechprobe_pc(const struct mechprobe_fixture *f, int m, char *error, size_t error_size)
{
	struct map_session_data *sd;
	int i, id = mechprobe_next_id++;
	unsigned int tick = gettick();

	sd = (struct map_session_data *)aCalloc(1, sizeof(struct map_session_data));
	sd->fd = 0;
	sd->bl.id = id;
	sd->bl.type = BL_PC;
	sd->bl.m = m;
	sd->bl.x = MECHPROBE_X + 1;
	sd->bl.y = MECHPROBE_Y;
	sd->char_id = id;
	sd->status.account_id = id;
	sd->status.char_id = id;
	strncpy(sd->status.name, f->id, 23);
	sd->status.sex = SEX_MALE;
	sd->status.class_ = f->job;
	sd->status.base_level = f->blv;
	sd->status.job_level = f->jlv;
	sd->status.str = f->str;
	sd->status.agi = f->agi;
	sd->status.vit = f->vit;
	sd->status.int_ = f->int_;
	sd->status.dex = f->dex;
	sd->status.luk = f->luk;
	sd->status.hp = sd->status.max_hp = 1;
	sd->status.sp = sd->status.max_sp = 1;

	// What pc_authok sets up, without the network and the char-server.
	sd->state.auth = 1;
	sd->weapontype1 = sd->weapontype2 = WT_FIST;
	sd->view_class = sd->status.class_;
	sd->s_class = pc_calc_base_job(sd->status.class_);
	sd->speed = DEFAULT_WALK_SPEED;
	sd->skill_item.id = -1;
	sd->skill_item.lv = -1;
	sd->invincible_timer = -1;
	sd->effect = -1;
	sd->npc_idle_timer = -1;
	sd->npc_dynamic_timer = -1;
	sd->pvp_timer = -1;
	for(i = 0; i < MAX_SPIRITBALL; i++)
		sd->spiritball.timer[i] = -1;
	for(i = 0; i < MAX_COIN; i++)
		sd->coin.timer[i] = -1;
	for(i = 0; i < MAX_ELEMENTBALL; i++)
		sd->elementball.timer[i] = -1;
	for(i = 0; i < MAX_ACTIVEITEM; i++)
		sd->activeitem_timer[i] = -1;
	for(i = 0; i < MAX_SKILL_DB; i++) {
		sd->skillstatictimer[i] = tick;
		sd->skillcooldown[i] = tick;
	}
	for(i = 0; i < MAX_EVENTTIMER; i++)
		sd->eventtimer[i] = -1;
	for(i = 0; i < EQUIP_INDEX_MAX; i++)
		sd->equip_index[i] = -1;
	sd->item_delay_tick = tick;
#ifdef DYNAMIC_SC_DATA
	sd->sc.data = dummy_sc_data;
#else
	for(i = 0; i < MAX_STATUSCHANGE; i++)
		sd->sc.data[i].timer = -1;
#endif

	for(i = 0; i < f->skill_count; i++) {
		int skill_id = f->skills[i].a;
		if(skill_id <= 0 || skill_id >= MAX_PCSKILL) {
			snprintf(error, error_size, "unknown skill %d", skill_id);
			aFree(sd);
			return NULL;
		}
		sd->status.skill[skill_id].id = skill_id;
		sd->status.skill[skill_id].lv = f->skills[i].b;
		sd->status.skill[skill_id].flag = 0;
	}
	for(i = 0; i < f->equip_count && i < MAX_INVENTORY; i++) {
		if(itemdb_exists(f->equip[i].a) == NULL) {
			snprintf(error, error_size, "unknown item %d", f->equip[i].a);
			aFree(sd);
			return NULL;
		}
		sd->status.inventory[i].nameid = f->equip[i].a;
		sd->status.inventory[i].amount = 1;
		sd->status.inventory[i].identify = 1;
		sd->status.inventory[i].refine = f->equip[i].b;
		sd->inventory_data[i] = itemdb_search(f->equip[i].a);
	}

	for(i = 0; i < f->card_count; i++) {
		if(f->equip_count == 0 || f->cards[i].b < 0 || f->cards[i].b >= 4 || itemdb_exists(f->cards[i].a) == NULL) {
			snprintf(error, error_size, "bad card %d:%d", f->cards[i].a, f->cards[i].b);
			aFree(sd);
			return NULL;
		}
		sd->status.inventory[0].card[f->cards[i].b] = f->cards[i].a;
	}
	unit_dataset(&sd->bl);
	map_addiddb(&sd->bl);
	pc_calc_skilltree(sd);
	status_calc_pc(sd, 1);
	for(i = 0; i < f->equip_count && i < MAX_INVENTORY; i++) {
		pc_equipitem(sd, i, sd->inventory_data[i]->equip);
		if(sd->status.inventory[i].equip == 0) {
			snprintf(error, error_size, "can't equip item %d", f->equip[i].a);
			return sd;
		}
	}
	status_calc_pc(sd, 0);
	// options=: the server's own option setters, then the cart's load
	if(f->cart)
		pc_setcart(sd, 1);
	if(f->mado)
		pc_setoption(sd, sd->sc.option | OPTION_MADOGEAR);
	if(f->falcon)
		pc_setoption(sd, sd->sc.option | OPTION_FALCON);
	if(f->cart_weight > 0)
		sd->cart_weight = f->cart_weight;
	if(f->cart || f->mado || f->falcon || f->cart_weight > 0)
		status_calc_pc(sd, 0);
	// Buffs and consumables: the server's own skill and item code, on the probe player (their timers never run:
	// the probe exits after its fixtures).
	// (each skill's status effect, as its cast starts it: the cast itself needs the player on the map)
	for(i = 0; i < f->buff_count; i++) {
		int type = GetSkillStatusChangeTable(f->buffs[i].a);
		if(type < 0) {
			snprintf(error, error_size, "skill %d has no status effect", f->buffs[i].a);
			return sd;
		}
		status_change_start(&sd->bl, type, f->buffs[i].b, 0, 0, 0, skill_get_time(f->buffs[i].a, f->buffs[i].b), 0);
	}
	for(i = 0; i < f->use_count; i++) {
		int n;
		if(itemdb_exists(f->use[i].a) == NULL) {
			snprintf(error, error_size, "unknown item %d", f->use[i].a);
			return sd;
		}
		for(n = 0; n < (f->use[i].b > 0 ? f->use[i].b : 1); n++)
			run_script(itemdb_usescript(f->use[i].a), 0, sd->bl.id, 0);
	}
	if(f->buff_count > 0 || f->use_count > 0)
		status_calc_pc(sd, 0);
	// At full HP and SP, as skills that scale with the current ones (Dragon Breath) are compared.
	sd->status.hp = sd->status.max_hp;
	sd->status.sp = sd->status.max_sp;
	return sd;
}

// A skill's crit keeps the damage type of a normal hit: battle_calc_weapon_attack sets mechprobe_skill_crit instead.
static const char *mechprobe_hit_kind(const struct Damage *d)
{
	if(d->dmg_lv == ATK_LUCKY)
		return "lucky";
	if(d->dmg_lv == ATK_FLEE)
		return "miss";
	if(d->type == 0x0a || mechprobe_skill_crit)
		return "crit";
	return "hit";
}

// The knockback of an attack: its damage's, or for skills whose cast knocks the target back on its own after the
// attack (skill_blown with skill_db's count, the damage's set to 0), the cast's.
static int mechprobe_blew(const struct Damage *d, int skill_id, int skill_lv)
{
	switch(skill_id) {
	case AC_SHOWER:
	case MA_SHOWER:
	case MC_CARTREVOLUTION:
		return d->dmg_lv == ATK_FLEE || d->dmg_lv == ATK_LUCKY ? 0 : skill_get_blewcount(skill_id, skill_lv);
	}
	return d->blewcount;
}

static struct Damage mechprobe_attack(int type, struct block_list *src, struct block_list *target, int skill_id, int skill_lv)
{
	mechprobe_skill_crit = 0;
	return battle_calc_attack(type, src, target, skill_id, skill_lv, 0);
}

// The attack type of a skill: skill_db's, or, for a damaging skill that has none there (its cast picks it, as Fire
// Dance's and Ice Spear's do), the type of the attack its cast makes (battle_skill_attack, which deals nothing while
// mechprobe_capture is set). The cast needs the caster on the map, next to the target.
static int mechprobe_skill_type(struct block_list *src, struct block_list *target, int skill_id, int skill_lv)
{
	int type = skill_get_skill_type(skill_id) & (BF_WEAPON | BF_MAGIC | BF_MISC);
	if(type || (skill_get_nk(skill_id) & 1))
		return type;
	src->m = target->m;
	src->x = target->x + 1;
	src->y = target->y;
	map_addblock(src);
	mechprobe_capture = 1;
	mechprobe_captured = 0;
	skill_castend_damage_id(src, target, skill_id, skill_lv, gettick(), 0);
	mechprobe_capture = 0;
	map_delblock(src);
	return mechprobe_captured;
}

struct mechprobe_dist {
	long long n, sum, min, max;
};

static void mechprobe_dist_add(struct mechprobe_dist *d, long long v)
{
	if(d->n == 0 || v < d->min) d->min = v;
	if(d->n == 0 || v > d->max) d->max = v;
	d->sum += v;
	d->n++;
}

static void mechprobe_dist_json(FILE *out, const struct mechprobe_dist *d)
{
	if(d->n == 0)
		fprintf(out, "null");
	else
		fprintf(out, "{\"n\":%lld,\"min\":%lld,\"max\":%lld,\"mean\":%.3f}", d->n, d->min, d->max, (double)d->sum / (double)d->n);
}

// `"min":{...},"sample":{...}` for one attack (normal attack: skill 0) of src on target.
static void mechprobe_measure(FILE *out, struct block_list *src, struct block_list *target, int type, int skill_id, int skill_lv, const struct mechprobe_fixture *f)
{
	struct Damage d;
	mechprobe_rng_min = 1;
	d = mechprobe_attack(type, src, target, skill_id, skill_lv);
	mechprobe_rng_min = 0;
	fprintf(out, "\"min\":{\"kind\":\"%s\",\"damage\":%lld,\"damage2\":%lld,\"div\":%d,\"blew\":%d}",
		mechprobe_hit_kind(&d), (long long)d.damage, (long long)d.damage2, d.div_, mechprobe_blew(&d, skill_id, skill_lv));
	if(f->samples > 0) {
		struct mechprobe_dist normal = {0}, crit = {0};
		long long misses = 0, lucky = 0;
		int i;
		mechprobe_srand(f->seed);
		for(i = 0; i < f->samples; i++) {
			struct Damage s = mechprobe_attack(type, src, target, skill_id, skill_lv);
			const char *kind = mechprobe_hit_kind(&s);
			if(strcmp(kind, "miss") == 0) misses++;
			else if(strcmp(kind, "lucky") == 0) lucky++;
			else if(strcmp(kind, "crit") == 0) mechprobe_dist_add(&crit, (long long)(s.damage + s.damage2));
			else mechprobe_dist_add(&normal, (long long)(s.damage + s.damage2));
		}
		fprintf(out, ",\"sample\":{\"n\":%d,\"seed\":%u,\"miss\":%lld,\"lucky\":%lld,\"hit\":", f->samples, f->seed, misses, lucky);
		mechprobe_dist_json(out, &normal);
		fprintf(out, ",\"crit\":");
		mechprobe_dist_json(out, &crit);
		fprintf(out, "}");
	}
}

// The status effects whose outcome effect= records, by their name in the results (seasonro's probe uses the same).
static const struct {
	const char *name;
	int type;
} mechprobe_tracked_sc[] = {
	{"stun", SC_STUN}, {"freeze", SC_FREEZE}, {"stone", SC_STONE}, {"sleep", SC_SLEEP}, {"poison", SC_POISON},
	{"curse", SC_CURSE}, {"silence", SC_SILENCE}, {"blind", SC_BLIND}, {"bleeding", SC_BLEED},
	{"confusion", SC_CONFUSION}, {"decrease_agi", SC_DECREASEAGI}, {"lex_aeterna", SC_AETERNA},
	{"provoke", SC_PROVOKE}, {"ankle_snare", SC_ANKLE},
};
#define MECHPROBE_TRACKED (int)(sizeof(mechprobe_tracked_sc) / sizeof(mechprobe_tracked_sc[0]))

static void mechprobe_clear_tracked(struct block_list *bl)
{
	struct status_change *sc = status_get_sc(bl);
	int t;
	for(t = 0; t < MECHPROBE_TRACKED; t++) {
		if(sc && sc->data[mechprobe_tracked_sc[t].type].timer != -1)
			status_change_end(bl, mechprobe_tracked_sc[t].type, -1);
	}
}

// Starts the effects skill_additional_effect scheduled for after the attack motion (status_change_pretimer) now,
// as their timer would, so they are measured like the ones that start at once.
static void mechprobe_flush_pretimers(struct block_list *bl)
{
	struct unit_data *ud = unit_bl2ud(bl);
	struct linkdb_node *node;
	if(ud == NULL)
		return;
	for(node = ud->statuspretimer; node; node = node->next) {
		struct status_pretimer *stpt = (struct status_pretimer *)node->data;
		status_change_start(bl, stpt->type, stpt->val1, stpt->val2, stpt->val3, stpt->val4, stpt->tick, stpt->flag);
	}
	status_clearpretimer(bl);
}

// One effect= skill of src on target, `samples` seeded uses with the server's own code: a damaging skill's attack
// and, when it lands, its additional effect (skill_additional_effect); a skill that deals no damage through its cast
// on the target (skill_castend_nodamage_id). Durations: the effect's remaining time right after it started, in ms.
static void mechprobe_effect(FILE *out, struct block_list *src, struct block_list *target, int skill_id, int skill_lv, const struct mechprobe_fixture *f)
{
	int type = (skill_get_nk(skill_id) & 1) ? 0 : skill_get_skill_type(skill_id) & (BF_WEAPON | BF_MAGIC | BF_MISC);
	int n = f->samples > 0 ? f->samples : 1, landed = 0, i, t, first = 1;
	struct mechprobe_dist durations[sizeof(mechprobe_tracked_sc) / sizeof(mechprobe_tracked_sc[0])];

	memset(durations, 0, sizeof(durations));
	mechprobe_srand(f->seed);
	for(i = 0; i < n; i++) {
		unsigned int tick = gettick();
		struct status_change *sc;
		mechprobe_clear_tracked(target);
		if(type && skill_id == MG_FROSTDIVER) {
			// Its freeze is part of the cast (skill_castend_damage_id), not of the additional effect. The cast needs
			// the caster on the map, next to the target; the monster gets enough HP not to die of it, and its own
			// back afterwards.
			struct mob_data *md = BL_DOWNCAST(BL_MOB, target);
			int hp = md ? md->hp : 0;
			if(md)
				md->hp = 0x3fffffff;
			src->m = target->m;
			src->x = target->x + 1;
			src->y = target->y;
			map_addblock(src);
			skill_castend_damage_id(src, target, skill_id, skill_lv, tick, 0);
			map_delblock(src);
			landed++;  // a magic attack; its damage comes from a timer
			mechprobe_flush_pretimers(target);
			if(md)
				md->hp = hp;
		} else if(type) {
			struct Damage d = battle_calc_attack(type, src, target, skill_id, skill_lv, 0);
			if(d.dmg_lv != ATK_FLEE && d.dmg_lv != ATK_LUCKY) {
				landed++;
				skill_additional_effect(src, target, skill_id, skill_lv, type, tick);
				mechprobe_flush_pretimers(target);
			}
		} else {
			landed++;
			skill_castend_nodamage_id(src, target, skill_id, skill_lv, tick, 0);
		}
		sc = status_get_sc(target);
		for(t = 0; t < MECHPROBE_TRACKED; t++) {
			int tid;
			struct TimerData *td;
			if(sc == NULL || (tid = sc->data[mechprobe_tracked_sc[t].type].timer) == -1)
				continue;
			td = get_timer(tid);
			mechprobe_dist_add(&durations[t], td ? (long long)(int)(td->tick - tick) : -1);
		}
	}
	mechprobe_clear_tracked(target);
	fprintf(out, "{\"skill\":%d,\"lv\":%d,\"type\":\"%s\",\"n\":%d,\"landed\":%d,\"effects\":{", skill_id, skill_lv,
		type == BF_MAGIC ? "magic" : type == BF_MISC ? "misc" : type == BF_WEAPON ? "weapon" : "none", n, landed);
	for(t = 0; t < MECHPROBE_TRACKED; t++) {
		if(durations[t].n == 0)
			continue;
		fprintf(out, "%s\"%s\":", first ? "" : ",", mechprobe_tracked_sc[t].name);
		mechprobe_dist_json(out, &durations[t]);
		first = 0;
	}
	fprintf(out, "}}");
}

static void mechprobe_run_fixture(FILE *out, const struct mechprobe_fixture *f)
{
	char error[256] = "";
	struct map_session_data *sd;
	struct mob_data *md = NULL;
	int m = map_mapname2mapid(MECHPROBE_MAP);

	fprintf(out, "{\"fixture\":");
	mechprobe_json_str(out, f->id);
	fprintf(out, ",\"server\":\"auriga\"");
	if(m < 0) {
		fprintf(out, ",\"error\":\"map " MECHPROBE_MAP " not loaded\"}\n");
		return;
	}
	mechprobe_rng_min = 0;
	sd = mechprobe_pc(f, m, error, sizeof(error));
	if(sd == NULL || error[0] != '\0') {
		fprintf(out, ",\"error\":");
		mechprobe_json_str(out, error);
		fprintf(out, "}\n");
		return;
	}
	// The status window, as clif_updatestatus fills it in (renewal).
	fprintf(out, ",\"status\":{\"atk1\":%d,\"atk2\":%d,\"matk1\":%d,\"matk2\":%d,\"def1\":%d,\"def2\":%d,\"mdef1\":%d,\"mdef2\":%d,"
		"\"hit\":%d,\"flee1\":%d,\"flee2\":%d,\"cri\":%d,\"amotion\":%d,\"max_hp\":%d,\"max_sp\":%d,"
		"\"str\":%d,\"agi\":%d,\"vit\":%d,\"int\":%d,\"dex\":%d,\"luk\":%d}",
		sd->base_atk, sd->watk + sd->watk_ + sd->watk2 + sd->watk_2 + sd->plus_atk, sd->matk1 + sd->plus_matk, sd->matk2,
		sd->def2, sd->def, sd->mdef2, sd->mdef,
		sd->hit, sd->flee, sd->flee2 / 10, sd->critical / 10, sd->amotion, sd->status.max_hp, sd->status.max_sp,
		sd->paramc[0], sd->paramc[1], sd->paramc[2], sd->paramc[3], sd->paramc[4], sd->paramc[5]);
	// What atk2 adds up from, to tell which part differs.
	fprintf(out, ",\"raw\":{\"watk\":%d,\"watk_\":%d,\"watk2\":%d,\"watk_2\":%d,\"plus_atk\":%d,\"base_atk\":%d}",
		sd->watk, sd->watk_, sd->watk2, sd->watk_2, sd->plus_atk, sd->base_atk);

	if(f->mob > 0) {
		int id = mob_once_spawn(NULL, m, MECHPROBE_X, MECHPROBE_Y, "--ja--", f->mob, 1, "");
		md = map_id2md(id);
		if(md == NULL) {
			fprintf(out, ",\"error\":\"can't spawn mob %d\"}\n", f->mob);
			return;
		}
	}
	if(md != NULL) {
		int i;
		fprintf(out, ",");
		mechprobe_measure(out, &sd->bl, &md->bl, BF_WEAPON, 0, 0, f);
		if(f->attack_count > 0) {
			fprintf(out, ",\"attacks\":[");
			for(i = 0; i < f->attack_count; i++) {
				int id = f->attacks[i].a, lv = f->attacks[i].b;
				int type = mechprobe_skill_type(&sd->bl, &md->bl, id, lv);
				fprintf(out, "%s{\"skill\":%d,\"lv\":%d,\"type\":\"%s\",\"cast\":%d,\"delay\":%d,", i ? "," : "", id, lv,
					type == BF_MAGIC ? "magic" : type == BF_MISC ? "misc" : type == BF_WEAPON ? "weapon" : "none",
					skill_castfix(&sd->bl, id, skill_get_cast(id, lv), skill_get_fixedcast(id, lv)), skill_delayfix(&sd->bl, id, lv));
				if(type)
					mechprobe_measure(out, &sd->bl, &md->bl, type, id, lv, f);
				else
					fprintf(out, "\"min\":null");
				fprintf(out, "}");
			}
			fprintf(out, "]");
		}
		// Status effects of the player's skills on the monster.
		if(f->effect_count > 0) {
			fprintf(out, ",\"effects\":[");
			for(i = 0; i < f->effect_count; i++) {
				if(i)
					fprintf(out, ",");
				mechprobe_effect(out, &sd->bl, &md->bl, f->effects[i].a, f->effects[i].b, f);
			}
			fprintf(out, "]");
		}
		// The monster attacking the player: its normal attack (skill 0) and skills.
		if(f->mob_attack_count > 0) {
			fprintf(out, ",\"mob_attacks\":[");
			for(i = 0; i < f->mob_attack_count; i++) {
				int id = f->mob_attacks[i].a, lv = f->mob_attacks[i].b;
				int type = id == 0 ? BF_WEAPON : skill_get_skill_type(id) & (BF_WEAPON | BF_MAGIC | BF_MISC);
				fprintf(out, "%s{\"skill\":%d,\"lv\":%d,\"type\":\"%s\",", i ? "," : "", id, lv,
					type == BF_MAGIC ? "magic" : type == BF_MISC ? "misc" : type == BF_WEAPON ? "weapon" : "none");
				if(type)
					mechprobe_measure(out, &md->bl, &sd->bl, type, id, lv, f);
				else
					fprintf(out, "\"min\":null");
				fprintf(out, "}");
			}
			fprintf(out, "]");
		}
		unit_free(&md->bl, 0);
	}
	fprintf(out, "}\n");
}

/*
 * Runs every fixture in `in` and writes one JSON record per line to `out` (stdout when empty); returns the exit status.
 */
int mechprobe_run(const char *in_path, const char *out_path)
{
	FILE *in, *out;
	char line[8192];
	int count = 0;
	struct timespec start, end;

	if((in = fopen(in_path, "r")) == NULL) {
		printf("mechprobe: can't read %s\n", in_path);
		return 1;
	}
	out = (out_path[0] == '\0') ? stdout : fopen(out_path, "w");
	if(out == NULL) {
		printf("mechprobe: can't write %s\n", out_path);
		fclose(in);
		return 1;
	}
	clock_gettime(CLOCK_MONOTONIC, &start);
	while(fgets(line, sizeof(line), in) != NULL) {
		struct mechprobe_fixture f;
		char error[256] = "";
		if(line[0] == '#' || line[strspn(line, " \t\r\n")] == '\0')
			continue;
		if(!mechprobe_parse(line, &f, error, sizeof(error))) {
			fprintf(out, "{\"fixture\":null,\"server\":\"auriga\",\"error\":");
			mechprobe_json_str(out, error);
			fprintf(out, "}\n");
		} else {
			mechprobe_run_fixture(out, &f);
		}
		count++;
	}
	clock_gettime(CLOCK_MONOTONIC, &end);
	fclose(in);
	fflush(out);
	if(out != stdout)
		fclose(out);
	printf("mechprobe: %d fixtures in %.3f s\n", count,
		(double)(end.tv_sec - start.tv_sec) + (double)(end.tv_nsec - start.tv_nsec) / 1e9);
	return 0;
}

#endif /* MECHPROBE_IN_BATTLE_C */
