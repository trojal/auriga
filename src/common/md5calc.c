/*
 * Copyright (C) 2002-2020  Auriga
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

/***********************************************************
 * md5計算アルゴリズム
 *
 * ソースコードは以下のURLを参考にしました
 * http://www.geocities.co.jp/SiliconValley-Oakland/8878/lab17/lab17.html
 *
 * 2006/09/10 少しインターフェイスの整理と HMAC-MD5 アルゴリズム追加
 ***********************************************************/

#include <string.h>
#include <stdio.h>

#include "md5calc.h"
#include "malloc.h"

#ifndef UINT_MAX
#define UINT_MAX 4294967295U
#endif

// グローバル変数
static unsigned int *pX;

// Stirng Table
static const unsigned int T[] = {
	0xd76aa478, 0xe8c7b756, 0x242070db, 0xc1bdceee, //0
	0xf57c0faf, 0x4787c62a, 0xa8304613, 0xfd469501, //4
	0x698098d8, 0x8b44f7af, 0xffff5bb1, 0x895cd7be, //8
	0x6b901122, 0xfd987193, 0xa679438e, 0x49b40821, //12
	0xf61e2562, 0xc040b340, 0x265e5a51, 0xe9b6c7aa, //16
	0xd62f105d, 0x02441453, 0xd8a1e681, 0xe7d3fbc8, //20
	0x21e1cde6, 0xc33707d6, 0xf4d50d87, 0x455a14ed, //24
	0xa9e3e905, 0xfcefa3f8, 0x676f02d9, 0x8d2a4c8a, //28
	0xfffa3942, 0x8771f681, 0x6d9d6122, 0xfde5380c, //32
	0xa4beea44, 0x4bdecfa9, 0xf6bb4b60, 0xbebfbc70, //36
	0x289b7ec6, 0xeaa127fa, 0xd4ef3085, 0x04881d05, //40
	0xd9d4d039, 0xe6db99e5, 0x1fa27cf8, 0xc4ac5665, //44
	0xf4292244, 0x432aff97, 0xab9423a7, 0xfc93a039, //48
	0x655b59c3, 0x8f0ccc92, 0xffeff47d, 0x85845dd1, //52
	0x6fa87e4f, 0xfe2ce6e0, 0xa3014314, 0x4e0811a1, //56
	0xf7537e82, 0xbd3af235, 0x2ad7d2bb, 0xeb86d391  //60
};

// ROTATE_LEFTは x を左にnビット回転させる。これはRFCからそのまま流用
#define ROTATE_LEFT(x, n) (((x) << (n)) | ((x) >> (32-(n))))

// その他の計算に使う関数
static unsigned int F(unsigned int X, unsigned int Y, unsigned int Z)
{
	return (X & Y) | (~X & Z);
}

static unsigned int G(unsigned int X, unsigned int Y, unsigned int Z)
{
	return (X & Z) | (Y & ~Z);
}

static unsigned int H(unsigned int X, unsigned int Y, unsigned int Z)
{
	return X ^ Y ^ Z;
}

static unsigned int I(unsigned int X, unsigned int Y, unsigned int Z)
{
	return Y ^ (X | ~Z);
}

static unsigned int Round(unsigned int a, unsigned int b, unsigned int FGHI, unsigned int k, unsigned int s, unsigned int i)
{
	return b + ROTATE_LEFT(a + FGHI + pX[k] + T[i], s);
}

static void Round1(unsigned int *a, unsigned int b, unsigned int c, unsigned int d,unsigned int k, unsigned int s, unsigned int i)
{
	*a = Round(*a, b, F(b,c,d), k, s, i);
}

static void Round2(unsigned int *a, unsigned int b, unsigned int c, unsigned int d,unsigned int k, unsigned int s, unsigned int i)
{
	*a = Round(*a, b, G(b,c,d), k, s, i);
}

static void Round3(unsigned int *a, unsigned int b, unsigned int c, unsigned int d,unsigned int k, unsigned int s, unsigned int i)
{
	*a = Round(*a, b, H(b,c,d), k, s, i);
}

static void Round4(unsigned int *a, unsigned int b, unsigned int c, unsigned int d,unsigned int k, unsigned int s, unsigned int i)
{
	*a = Round(*a, b, I(b,c,d), k, s, i);
}

static void MD5_Round_Calculate(const unsigned char *block, unsigned int *A2, unsigned int *B2, unsigned int *C2, unsigned int *D2)
{
	//create X 必要なので
	unsigned int X[16]; //512bit 64byte
	int j,k;

	//Save A as AA, B as BB, C as CC, and D as DD (A,B,C,Dの保存)
	unsigned int A=*A2, B=*B2, C=*C2, D=*D2;
	unsigned int AA = A,BB = B,CC = C,DD = D;

	//ラウンドの計算の為に仕方なく大域変数を。。。 for Round1...4
	pX = X;

	//Copy block(padding_message) i into X
	for (j=0,k=0; j<64; j+=4,k++)
		X[k] = ( (unsigned int )block[j] )	// 8byte*4 -> 32byte 変換
			| ( ((unsigned int )block[j+1]) << 8 ) // RFCでいうDecodeという関数
			| ( ((unsigned int )block[j+2]) << 16 )
			| ( ((unsigned int )block[j+3]) << 24 );

	//Round 1
	Round1(&A,B,C,D,  0, 7,  0); Round1(&D,A,B,C,  1, 12,  1); Round1(&C,D,A,B,  2, 17,  2); Round1(&B,C,D,A,  3, 22,  3);
	Round1(&A,B,C,D,  4, 7,  4); Round1(&D,A,B,C,  5, 12,  5); Round1(&C,D,A,B,  6, 17,  6); Round1(&B,C,D,A,  7, 22,  7);
	Round1(&A,B,C,D,  8, 7,  8); Round1(&D,A,B,C,  9, 12,  9); Round1(&C,D,A,B, 10, 17, 10); Round1(&B,C,D,A, 11, 22, 11);
	Round1(&A,B,C,D, 12, 7, 12); Round1(&D,A,B,C, 13, 12, 13); Round1(&C,D,A,B, 14, 17, 14); Round1(&B,C,D,A, 15, 22, 15);

	//Round 2
	Round2(&A,B,C,D,  1, 5, 16); Round2(&D,A,B,C,  6, 9, 17); Round2(&C,D,A,B, 11, 14, 18); Round2(&B,C,D,A,  0, 20, 19);
	Round2(&A,B,C,D,  5, 5, 20); Round2(&D,A,B,C, 10, 9, 21); Round2(&C,D,A,B, 15, 14, 22); Round2(&B,C,D,A,  4, 20, 23);
	Round2(&A,B,C,D,  9, 5, 24); Round2(&D,A,B,C, 14, 9, 25); Round2(&C,D,A,B,  3, 14, 26); Round2(&B,C,D,A,  8, 20, 27);
	Round2(&A,B,C,D, 13, 5, 28); Round2(&D,A,B,C,  2, 9, 29); Round2(&C,D,A,B,  7, 14, 30); Round2(&B,C,D,A, 12, 20, 31);

	//Round 3
	Round3(&A,B,C,D,  5, 4, 32); Round3(&D,A,B,C,  8, 11, 33); Round3(&C,D,A,B, 11, 16, 34); Round3(&B,C,D,A, 14, 23, 35);
	Round3(&A,B,C,D,  1, 4, 36); Round3(&D,A,B,C,  4, 11, 37); Round3(&C,D,A,B,  7, 16, 38); Round3(&B,C,D,A, 10, 23, 39);
	Round3(&A,B,C,D, 13, 4, 40); Round3(&D,A,B,C,  0, 11, 41); Round3(&C,D,A,B,  3, 16, 42); Round3(&B,C,D,A,  6, 23, 43);
	Round3(&A,B,C,D,  9, 4, 44); Round3(&D,A,B,C, 12, 11, 45); Round3(&C,D,A,B, 15, 16, 46); Round3(&B,C,D,A,  2, 23, 47);

	//Round 4
	Round4(&A,B,C,D,  0, 6, 48); Round4(&D,A,B,C,  7, 10, 49); Round4(&C,D,A,B, 14, 15, 50); Round4(&B,C,D,A,  5, 21, 51);
	Round4(&A,B,C,D, 12, 6, 52); Round4(&D,A,B,C,  3, 10, 53); Round4(&C,D,A,B, 10, 15, 54); Round4(&B,C,D,A,  1, 21, 55);
	Round4(&A,B,C,D,  8, 6, 56); Round4(&D,A,B,C, 15, 10, 57); Round4(&C,D,A,B,  6, 15, 58); Round4(&B,C,D,A, 13, 21, 59);
	Round4(&A,B,C,D,  4, 6, 60); Round4(&D,A,B,C, 11, 10, 61); Round4(&C,D,A,B,  2, 15, 62); Round4(&B,C,D,A,  9, 21, 63);

	// Then perform the following additions. (加算しましょう)
	*A2 = A + AA;
	*B2 = B + BB;
	*C2 = C + CC;
	*D2 = D + DD;

	//機密情報のクリア
	memset(pX, 0, sizeof(X));
}

//-------------------------------------------------------------------
// 外部用関数

/** stringは符号化したい文字列でoutputは符号化されたバイナリ */
void MD5_Binary(const char * string, int len, char * output)
{
	//var
	/* 8bit */
	unsigned char padding_message[64];	// 拡張メッセージ 512bit 64byte
	unsigned char *pstring;			// 現在走査注中のstringの位置を保持
	//unsigned char digest[16];
	/* 32bit */
	unsigned int string_byte_len;	// stringのバイト長を保持
	unsigned int string_bit_len;	// stringのビット長を保持
	unsigned int copy_len;		// 1-3で使う残ったバイト数
	unsigned int msg_digest[4];	// メッセージダイジェスト 128bit 4byte
	unsigned int *A = &msg_digest[0];	// RFCに則ったメッセージダイジェスト（のリファレンス）
	unsigned int *B = &msg_digest[1];
	unsigned int *C = &msg_digest[2];
	unsigned int *D = &msg_digest[3];
	int i;

	// prog
	// Step 3. Initialize MD Buffer (A,B,C,Dの初期化;ステップ３ですが仕方なく先頭に)
	*A = 0x67452301;
	*B = 0xefcdab89;
	*C = 0x98badcfe;
	*D = 0x10325476;

	// Step 1. Append Padding Bits (符号ビットの拡張)
	//1-1
	string_byte_len = len;	// 文字列のバイト長を取得
	pstring = (unsigned char *)string;	// 現在の文字列の位置をセット

	// 1-2 長さが６４バイト未満になるまで計算を繰り返す
	for (i=string_byte_len; 64<=i; i-=64,pstring+=64)
		MD5_Round_Calculate(pstring, A,B,C,D);

	// 1-3
	copy_len = string_byte_len % 64;	// 残ったバイト数を算出
	strncpy((char *)padding_message, (char *)pstring, copy_len);	// 拡張ビット列へメッセージをコピー
	memset(padding_message+copy_len, 0, 64 - copy_len);	// 拡張ビット長になるまで0で埋める
	padding_message[copy_len] |= 0x80;	// メッセージの次は1

	// 1-4
	// 残りが56バイト以上（６４バイト未満）ならば６４バイトに拡張して計算
	if (56 <= copy_len) {
		MD5_Round_Calculate(padding_message, A,B,C,D);
		memset(padding_message, 0, 56);	// 新たに５６バイトを０で埋める
	}

	//Step 2. Append Length (長さの情報を追加)
	string_bit_len = string_byte_len * 8;	// バイト長からビット長へ（下位３２バイト）
	memcpy(&padding_message[56], &string_bit_len, 4);	// 下位３２バイトをセット

	// 下位３２バイトだけではビット長を表現できないときは上位に桁上げ
	if (UINT_MAX / 8 < string_byte_len) {
		unsigned int high = (string_byte_len - UINT_MAX / 8) * 8;
		memcpy(&padding_message[60], &high, 4);
	} else {
		memset(&padding_message[60], 0, 4);	// この場合は上位には０でよい
	}

	// Step 4. Process Message in 16-Word Blocks (MD5の計算)
	MD5_Round_Calculate(padding_message, A,B,C,D);

	// Step 5. Output (出力)
	memcpy(output,msg_digest,16);
	//memcpy(digest, msg_digest, 16);	// 8byte*4 <- 32byte 変換 RFCでいうEncodeという関数

	/*
	sprintf(output,
		"%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x",
		digest[ 0], digest[ 1], digest[ 2], digest[ 3],
		digest[ 4], digest[ 5], digest[ 6], digest[ 7],
		digest[ 8], digest[ 9], digest[10], digest[11],
		digest[12], digest[13], digest[14], digest[15]);
	*/
}

/** stringは符号化したい文字列でoutputは符号化された文字列 */
void MD5_String(const char * string, char * output)
{
	unsigned char digest[16];

	MD5_String2binary(string, digest);
	sprintf(output,
		"%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x",
		digest[ 0], digest[ 1], digest[ 2], digest[ 3],
		digest[ 4], digest[ 5], digest[ 6], digest[ 7],
		digest[ 8], digest[ 9], digest[10], digest[11],
		digest[12], digest[13], digest[14], digest[15]);
}

// 以前との互換性のため
void MD5_String2binary( const char * string, char * output)
{
	MD5_Binary(string, (int)strlen(string), output);
}

// HMAC-MD5
#define KEYLENGTH		64
#define DIGESTLENGTH	16
#define STRMAXLENGTH	192

void HMAC_MD5_Binary( const char *key, int keylen, const char *str, int len, char *output )
{
	char hmackey2[ KEYLENGTH + STRMAXLENGTH ];
	char* hmackey = hmackey2;
	char temp[ KEYLENGTH + DIGESTLENGTH ];
	int i;

	// 文字列が長いのでメモリを確保
	if( len > STRMAXLENGTH )
		hmackey = (char*)aMalloc( KEYLENGTH+len + 16 );

	// 鍵の計算
	memset( hmackey, 0, KEYLENGTH );
	if( keylen <= KEYLENGTH )	memcpy( hmackey, key, keylen );
	else						MD5_Binary( key, keylen, hmackey );

	// 鍵のコピー
	memcpy( temp, hmackey, KEYLENGTH );

	// 鍵の XOR
	for( i=0; i<KEYLENGTH; i+=4 )
	{
		*((unsigned int*)(hmackey+i)) ^= 0x36363636;	// ipad
		*((unsigned int*)(temp+i)) ^= 0x5c5c5c5c;		// opad
	}

	// str の結合
	memcpy( hmackey+KEYLENGTH, str, len );

	// 中間文字列生成
	MD5_Binary( hmackey, KEYLENGTH+len, temp+KEYLENGTH );

	// 計算結果生成
	MD5_Binary( temp, KEYLENGTH+DIGESTLENGTH, output );

	// 必要ならメモリを解放
	if( hmackey != hmackey2 )
		aFree(hmackey);
}
