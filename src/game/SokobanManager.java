package game;

import javax.swing.SwingUtilities;

public class SokobanManager {
	private int[][] board = null;
	
	private SokobanGUI gui = null;
	private static SokobanManager inst = null;
	public static SokobanManager getInstance() {
		if (inst == null)
			inst = new SokobanManager();
		return inst;
	}
	private SokobanManager() {
		
	}
	
	public void start() {
		gui = SokobanGUI.getInstance();
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				gui.start();
			}
		});
		
		while (true) {
			try {
				if (gui.getStage() == Board.NUMBER_BOARD)
					break;
				board = copyBoard();
				gui.repaint();
				while (!matchAll()) {
					Thread.yield();
				}
				gui.nextStageMessage();
				gui.nextStage();
			}
			catch (ArrayIndexOutOfBoundsException ex) {  }
		}
		
		gui.endGame();
		System.exit(0);
	}
	public void restart() {
		board = copyBoard();
		gui.repaint();
	}
	public void move(KeyCode key) {
		if (isMoveEnabled(key)) {
			int x = 0, y = 0, n;
			
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if (board[i][j] == Board.PLAYER) {
						x = i; y = j;
					}
				}
			}
			
			if (key == KeyCode.UP) {
				if (board[x-1][y] == Board.OBJECT) { 
					n = board[x-1][y];
					board[x-1][y] = board[x][y];
					board[x-2][y] = n;
					board[x][y] = Board.BLANK;
				}
				else {
					board[x-1][y] = board[x][y];
					board[x][y] = Board.BLANK;
				}
			}
			else if (key == KeyCode.DOWN) {
				if (board[x+1][y] == Board.OBJECT) { 
					n = board[x+1][y];
					board[x+1][y] = board[x][y];
					board[x+2][y] = n;
					board[x][y] = Board.BLANK;
				}
				else {
					board[x+1][y] = board[x][y];
					board[x][y] = Board.BLANK;
				}
			}
			else if (key == KeyCode.LEFT) {
				if (board[x][y-1] == Board.OBJECT) {
					n = board[x][y-1];
					board[x][y-1] = board[x][y];
					board[x][y-2] = n;
					board[x][y] = Board.BLANK;
				}
				else {
					board[x][y-1] = board[x][y];
					board[x][y] = Board.BLANK;
				}
			}
			else if (key == KeyCode.RIGHT) {
				if (board[x][y+1] == Board.OBJECT) {
					n = board[x][y+1];
					board[x][y+1] = board[x][y];
					board[x][y+2] = n;
					board[x][y] = Board.BLANK;
				}
				else {
					board[x][y+1] = board[x][y];
					board[x][y] = Board.BLANK;
				}
			}
			gui.repaint();
		}
	}
	private boolean isMoveEnabled(KeyCode key) {
		int x = 0, y = 0;
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == Board.PLAYER) {
					x = i; y = j;
				}
			}
		}
		
		if (key == KeyCode.UP) {
			if (x == 0)
				return false;
			else if (board[x-1][y] == Board.BLOCK)
				return false;
			else if (board[x-1][y] == Board.OBJECT && (board[x-2][y] == Board.OBJECT || board[x-2][y] == Board.BLOCK))
				return false;
			else if (board[x-1][y] == Board.OBJECT && x == 1)
				return false;
		}
		else if (key == KeyCode.DOWN) {
			if (x == board.length-1)
				return false;
			else if (board[x+1][y] == Board.BLOCK)
				return false;
			else if (board[x+1][y] == Board.OBJECT && (board[x+2][y] == Board.OBJECT || board[x+2][y] == Board.BLOCK))
				return false;
			else if (board[x+1][y] == Board.OBJECT && x == board.length-2)
				return false;
		}
		else if (key == KeyCode.LEFT) {
			if (y == 0)
				return false;
			else if (board[x][y-1] == Board.BLOCK)
				return false;
			else if (board[x][y-1] == Board.OBJECT && (board[x][y-2] == Board.OBJECT || board[x][y-2] == Board.BLOCK))
				return false;
			else if (board[x][y-1] == Board.OBJECT && y == 1)
				return false;
		}
		else if (key == KeyCode.RIGHT) {
			if (y == board[0].length-1)
				return false;
			else if (board[x][y+1] == Board.BLOCK)
				return false;
			else if (board[x][y+1] == Board.OBJECT && (board[x][y+2] == Board.OBJECT || board[x][y+2] == Board.BLOCK))
				return false;
			else if (board[x][y+1] == Board.OBJECT && y == board[0].length-2)
				return false;
		}
		else { return false; }
		
		return true;
	}
	private boolean matchAll() throws ArrayIndexOutOfBoundsException {
		int idx = 0;
		
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				if (Board.BOARDS[gui.getStage()-1][i][j] == Board.TARGET && board[i][j] == Board.OBJECT)
					idx++;
		
		if (idx == Board.NUMBER_TARGET[gui.getStage()-1])
			return true;
		
		return false;
	}
	private int[][] copyBoard() {
		int[][] newBoard = new int[Board.BOARDS[gui.getStage()-1].length][Board.BOARDS[gui.getStage()-1][0].length];
		
		for (int i = 0; i < newBoard.length; i++)
			newBoard[i] = Board.BOARDS[gui.getStage()-1][i].clone();
		
		return newBoard;
	}
	public int[][] getBoard() { return board; }
	
	public static void main(String[] args) {
		getInstance().start();
	}
}
