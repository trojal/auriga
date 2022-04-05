// ハノイの塔	テストスクリプト
// 新しく追加した構文の使用方法が分からないと困るので作りました。

prontera.gat,160,180,1	script	ハノイの塔案内員	112,{
	// 関数宣言
	function hanoi_init;		// 円盤の初期化
	function hanoi_move;		// 円盤の移動
	function hanoi_display;		// 円盤の表示
	function hanoi_display_sub;
	function hanoi_check;		// 円盤の状態が正解かどうか確認
	function hanoi_solve;		// ハノイの塔を解く
	function hanoi_name;		// 数字→棒の名前変換

	// 円盤の枚数
	// 多くしすぎると大変な事になるので注意！
	set @level,4;

	switch(select("ハノイの塔について","遊んでみる","解答を見る","やっぱりやめる")) {
	case 1:
		// 暇な方補完お願いします。
		mes "[ハノイの塔案内員]";
		mes "ハノイの塔とは、" + @level + "枚の違う円盤を、";
		mes "別の場所に移動させるゲームです。";
		mes "円盤の大きさは数字で表されています。";
		next;
		mes "[ハノイの塔案内員]";
		mes "ルールは次の２つだけです。";
		mes "・一度に動かせるのは一枚だけ";
		mes "・小さい円盤の上に大きい円盤は重ねらない";
		next;
		mes "[ハノイの塔案内員]";
		mes "挑戦をお待ちしています。";
		close;
		break;
	case 2:
		// 円盤を初期化する
		hanoi_init;
		do {
			mes "[ハノイの塔案内員]";
			mes "今までに" + @count + "回円盤を移動しました。";
			hanoi_display;
			next;
			set @pos_a , select("円盤Ａから","円盤Ｂから","円盤Ｃから","やっぱりやめる");
			if(@pos_a == 4) { close; end; }
			switch(@pos_a) {
				case 1: set @move_count , @A_count; break;
				case 2: set @move_count , @B_count; break;
				case 3: set @move_count , @C_count; break;
			}
			if(@move_count == 0) {
				mes "[ハノイの塔案内員]";
				mes "その場所に円盤はありません。";
				next;
				continue;
			}
			set @pos_b , select("円盤Ａへ移動","円盤Ｂへ移動","円盤Ｃへ移動","やっぱりやめる");
			if(@pos_a == 4) { close; end; }
			if(hanoi_move(@pos_a,@pos_b) == 0) {
				// 移動不可能
				mes "[ハノイの塔案内員]";
				mes "移動できません。";
				next;
				continue;
			}
			set @count,@count + 1;
			if(hanoi_check()) {
				// 正解した時のご褒美
				mes "[ハノイの塔案内員]";
				mes "お見事、正解です。(" + @count + "回の円盤移動)";
				mes "賞金として100Zeny差し上げます。";
				set Zeny,Zeny + 100;
				break;
			}
		} while(1);
		close;
		break;
	case 3:
		hanoi_init;
		mes "[ハノイの塔案内員]";
		mes "では、始めます。";
		hanoi_display;
		next;
		hanoi_solve @level,@A_data,@C_data,@B_data,1,3,2;
		mes "[ハノイの塔案内員]";
		mes @count + "回の移動が最短ですね。";
		close;
	}
	// 実演
	// hanoi_solve(lv,from_array,to_array,temp_array,from_name,to_name,temp_name)
	function hanoi_solve {
		if(getarg(0) == 1) {
			// hanoi_move は値を返す関数なので、値を捨てる必要がある
			set @dummy , hanoi_move(getarg(4),getarg(5));

			// 今回の手順を表示
			set @count , @count + 1;
			mes "[ハノイの塔案内員]";
			mes "解答" + @count + " : " + hanoi_name(getarg(4)) + "の円盤を" + hanoi_name(getarg(5)) + "に移動";
			hanoi_display;
			next;
		} else {
			hanoi_solve getarg(0) - 1,getarg(1),getarg(3),getarg(2),getarg(4),getarg(6),getarg(5);

			// hanoi_move は値を返す関数なので、値を捨てる必要がある
			set @dummy , hanoi_move(getarg(4),getarg(5));

			// 今回の手順を表示
			set @count , @count + 1;
			mes "[ハノイの塔案内員]";
			mes "解答" + @count + " : " + hanoi_name(getarg(4)) + "の円盤を" + hanoi_name(getarg(5)) + "に移動";
			hanoi_display;
			next;

			hanoi_solve getarg(0) - 1,getarg(3),getarg(2),getarg(1),getarg(6),getarg(5),getarg(4);
		}
	}
	function hanoi_name {
		switch(getarg(0)) {
		case 1: return "A";
		case 2: return "B";
		case 3: return "C";
		}
		return "??";
	}
	// 初期化する
	function hanoi_init {
		cleararray @A_data,0,@level;
		cleararray @B_data,0,@level;
		cleararray @C_data,0,@level;
		set @A_data[0] , @level + 1;
		set @B_data[0] , @level + 1;
		set @C_data[0] , @level + 1;
		set @A_count , 0;
		set @B_count , 0;
		set @C_count , 0;
		for(set @i,@level ; @i > 0 ; set @i , @i - 1) {
			set @A_data[@A_count + 1] , @i;
			set @A_count , @A_count + 1;
		}
		set @count , 0;
	}
	// 内容を表示する
	function hanoi_display {
		mes "A: " + hanoi_display_sub(@A_data,@A_count);
		mes "B: " + hanoi_display_sub(@B_data,@B_count);
		mes "C: " + hanoi_display_sub(@C_data,@C_count);
	}
	function hanoi_display_sub {
		set @__ret$ , "";
		set @__max  , getarg(1);
		for(set @i , 1;@i <= @__max; set @i , @i + 1) {
			// 配列をコピーする処理が重すぎるから暫定処理
			set @__ret$ , @__ret$ + getelementofarray(getarg(0),@i);
		}
		return @__ret$;
	}
	// 円盤を移動する
	function hanoi_move {
		set @__pos_a , getarg(0);
		set @__pos_b , getarg(1);
		// まず最初に移動できるかチェック
		if(@__pos_a == @__pos_b) {
			// 同じ円盤なので移動不可
			return 0;
		}
		switch(@__pos_a) {
			case 1: set @__move_val_1,@A_data[@A_count]; break;
			case 2: set @__move_val_1,@B_data[@B_count]; break;
			case 3: set @__move_val_1,@C_data[@C_count]; break;
		}
		switch(@__pos_b) {
			case 1: set @__move_val_2,@A_data[@A_count]; break;
			case 2: set @__move_val_2,@B_data[@B_count]; break;
			case 3: set @__move_val_2,@C_data[@C_count]; break;
		}
		if(@__move_val_2 < @__move_val_1) {
			// 移動不可能（小さい円盤の上に大きい円盤を重ねようとした）
			return 0;
		}
		// 実際に移動させる
		switch(@__pos_a) {
			case 1: set @A_data[@A_count],0; set @A_count,@A_count-1; break;
			case 2: set @B_data[@B_count],0; set @B_count,@B_count-1; break;
			case 3: set @C_data[@C_count],0; set @C_count,@C_count-1; break;
		}
		switch(@__pos_b) {
			case 1: set @A_count,@A_count+1; set @A_data[@A_count],@__move_val_1; break;
			case 2: set @B_count,@B_count+1; set @B_data[@B_count],@__move_val_1; break;
			case 3: set @C_count,@C_count+1; set @C_data[@C_count],@__move_val_1; break;
		}
		// 移動可能
		return 1;
	}
	// 完成してるか確かめる
	function hanoi_check {
		for(set @i , 1; @i <= @level; set @i,@i + 1) {
			if(@B_data[@i] != @level - @i + 1) break;
		}
		if(@i == @level + 1) return 1;
		for(set @i , 1; @i <= @level; set @i,@i + 1) {
			if(@C_data[@i] != @level - @i + 1) break;
		}
		if(@i == @level + 1) return 1;
		return 0;
	}
}
