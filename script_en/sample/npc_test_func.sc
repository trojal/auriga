// 値を返さない関数
function	script	func001	{
	mes "ユーザー定義関数";
	next;
	return;		// 省略できない
}

// 値を返す関数
function	script	func002	{
	return "ユーザー定義関数２";
}

// 関数の呼び出しとサブルーティンのテスト
prontera.gat,168,189,1	script	関数テスト	112,{
	callfunc "func001";		// ユーザー定義関数は文字列で指定
	mes callfunc("func002");
	next;
	callsub L_SUB001;	// サブルーティンはラベルを直接指定
	close;
	end;

L_SUB001:
	mes "サブルーティン";
	return;		// 省略できない
}
