package game;

public interface Board {
	static final int BLANK = 0, PLAYER = 1, BLOCK = 2, TARGET = 3, OBJECT = 4;
	static final int NUMBER_BOARD = 5;
	static final int[] NUMBER_TARGET = {3, 3, 6, 6, 20};
	static final int[][][] BOARDS = {
			{
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.PLAYER, Board.BLANK, Board.BLANK, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK}
			},
			{
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.PLAYER, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK}
			},
			{
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.TARGET, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.TARGET, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.PLAYER, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.TARGET, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK}
			},
			{
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.PLAYER, Board.OBJECT, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
			},
			{
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.OBJECT, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.PLAYER, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.TARGET, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.TARGET, Board.BLANK, Board.BLOCK},
				{Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.OBJECT, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.TARGET, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.OBJECT, Board.TARGET, Board.TARGET, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.OBJECT, Board.OBJECT, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.TARGET, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.OBJECT, Board.BLANK, Board.OBJECT, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLANK, Board.BLANK, Board.BLANK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK},
				{Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK, Board.BLOCK}
			}
	};
}
