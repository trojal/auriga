/*
 * Copyright (C) 2002-2007  Auriga
 *
 * This file is part of Auriga.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street - Fifth Floor, Boston, MA 02110-1301, USA.
 *
 */

#include <stdlib.h>

#include "mmo.h"
#include "db.h"
#include "malloc.h"
#include "sqldbs.h"
#include "utils.h"

#include "int_storage.h"
#include "chardb_sql.h"
#include "petdb_sql.h"
#include "storagedb_sql.h"

static struct dbt *storage_db  = NULL;

bool storagedb_sql_init(void)
{
	storage_db  = numdb_init();
	gstorage_db = numdb_init();
	return true;
}

const struct storage* storagedb_sql_load(int account_id)
{
	struct storage *s = (struct storage *)numdb_search(storage_db,account_id);

	if(s == NULL)
	{
		s = (struct storage *)aCalloc(1,sizeof(struct storage));
		s->account_id = account_id;
		numdb_insert(storage_db,s->account_id,s);
		s->storage_amount = chardb_sql_loaditem(s->store_item,MAX_STORAGE,account_id,TABLE_NUM_STORAGE);
	}

	return s;
}

bool storagedb_sql_save(struct storage *s2)
{
	const struct storage *s1 = storagedb_sql_load(s2->account_id);

	if(memcmp(s1,s2,sizeof(struct storage)))
	{
		struct storage *s3 = (struct storage *)numdb_search(storage_db, s2->account_id);
		chardb_sql_saveitem(s2->store_item,MAX_STORAGE,s2->account_id,TABLE_NUM_STORAGE);
		if(s3)
			memcpy(s3, s2, sizeof(struct storage));
	}

	return true;
}

int storagedb_sql_sync(void)
{
	// nothing to do
	return 0;
}

bool storagedb_sql_delete(int account_id)
{
	const struct storage *s = storagedb_sql_load(account_id);
	struct storage *s2;
	int i = 0;
	bool result = false;

	// start transaction
	if( sqldbs_simplequery(&mysql_handle, "START TRANSACTION") == false )
		return result;

	// try
	do
	{
		// ペット削除
		if( s )
		{
			for( i = 0; i < s->storage_amount; i++ )
			{
				if( s->store_item[i].card[0] == (short)0xff00 )
				{
					if( petdb_delete(*((int *)(&s->store_item[i].card[1]))) == false )
						break;
				}
			}
		}

		// fail
		if( s != NULL && i < s->storage_amount )
			break;

		// delete
		if( sqldbs_query(&mysql_handle, "DELETE FROM `" STORAGE_TABLE "` WHERE `account_id`='%d'", account_id) == false )
			break;

		// success
		result = true;

		// cache delete
		s2 = (struct storage *)numdb_search(storage_db, account_id);
		if(s2)
		{
			numdb_erase(storage_db, account_id);
			aFree(s2);
		}
	} while(0);

	// end transaction
	sqldbs_simplequery(&mysql_handle, ( result == true )? "COMMIT" : "ROLLBACK");

	return result;
}

static int storage_db_final(void *key,void *data,va_list ap)
{
	struct storage *s = (struct storage *)data;

	aFree(s);

	return 0;
}

void storagedb_sql_final(void)
{
	if(storage_db)
		numdb_final(storage_db,storage_db_final);
}

const struct guild_storage *gstoragedb_sql_load(int guild_id)
{
	struct guild_storage *s = (struct guild_storage *)numdb_search(gstorage_db,guild_id);

	if(s == NULL)
	{
		s = (struct guild_storage *)aCalloc(1,sizeof(struct guild_storage));
		s->guild_id = guild_id;
		s->last_fd  = -1;
		numdb_insert(gstorage_db,s->guild_id,s);
		s->storage_amount = chardb_sql_loaditem(s->store_item,MAX_GUILD_STORAGE,guild_id,TABLE_NUM_GUILD_STORAGE);
	}

	return s;
}

bool gstoragedb_sql_save(struct guild_storage *gs2, int easy)
{
	const struct guild_storage *gs1 = gstoragedb_sql_load(gs2->guild_id);

	if(memcmp(gs1,gs2,sizeof(struct guild_storage)))
	{
		struct guild_storage *gs3 = (struct guild_storage*)numdb_search( gstorage_db, gs2->guild_id );
		if(!easy)
			chardb_sql_saveitem(gs2->store_item,MAX_GUILD_STORAGE,gs2->guild_id,TABLE_NUM_GUILD_STORAGE);
		if(gs3)
			memcpy(gs3, gs2, sizeof(struct guild_storage));
	}

	return true;
}

int gstoragedb_sql_sync(void)
{
	// nothing to do
	return 0;
}

bool gstoragedb_sql_delete(int guild_id)
{
	const struct guild_storage *s = gstoragedb_sql_load(guild_id);
	struct guild_storage *s2;
	int i = 0;
	bool result = false;

	// start transaction
	if( sqldbs_simplequery(&mysql_handle, "START TRANSACTION") == false )
		return result;

	// try
	do
	{
		// ペット削除
		if( s )
		{
			for( i = 0; i < s->storage_amount; i++ )
			{
				if( s->store_item[i].card[0] == (short)0xff00 )
				{
					if( petdb_delete(*((int *)(&s->store_item[i].card[1]))) == false )
						break;
				}
			}
		}

		// fail
		if( s != NULL && i < s->storage_amount )
			break;

		// delete
		if( sqldbs_query(&mysql_handle, "DELETE FROM `" GUILD_STORAGE_TABLE "` WHERE `guild_id`='%d'", guild_id) == false )
			break;

		// success
		result = true;

		// cache delete
		s2 = (struct guild_storage*)numdb_search( gstorage_db, guild_id );
		if( s2 )
		{
			numdb_erase( gstorage_db, guild_id );
			aFree( s2 );
		}
	} while(0);

	// end transaction
	sqldbs_simplequery(&mysql_handle, ( result == true )? "COMMIT" : "ROLLBACK");

	return result;
}

static int gstorage_db_final(void *key,void *data,va_list ap)
{
	struct guild_storage *gs = (struct guild_storage *)data;

	aFree(gs);

	return 0;
}

void gstoragedb_sql_final(void)
{
	if(gstorage_db)
		numdb_final(gstorage_db,gstorage_db_final);
}

int storagedb_sql_config_read_sub(const char* w1,const char* w2)
{
	return 0;
}