/*
 * Author: Henno Kublin
 */
public class WinController {
	GameBoard myGameBoard;
	
	public WinController(GameBoard game) {
		myGameBoard = game;
	}

	/* TODO!
	 * Checks horizontal, vertical, and diagonal directions for 
	 * four like checkers in a row. Return true is winner is 
	 * found, otherwise return false.
	 */
	public boolean hasWinner() {
		int[][] board = myGameBoard.getBoard();
		
		// check for vertical win
		for(int i = 0; i < board[0].length; i++) {
			for(int j = 0; j < board.length - 3; j++) {
				int thisSlot = board[j][i];
				if(thisSlot == GameBoard.EMPTY) continue;
				
				if(thisSlot == board[j+1][i]) {
					if(thisSlot == board[j+2][i]) {
						if(thisSlot == board[j+3][i]) {
							return true;
						}
					}
				}
			}
		}
		
		// check for horizontal win
		for(int i = 0; i < board[0].length - 3; i++) {
			for(int j = 0; j < board.length; j++) {
				int thisSlot = board[j][i];
				if(thisSlot == GameBoard.EMPTY) continue;
				
				if(thisSlot == board[j][i+1]) {
					if(thisSlot == board[j][i+2]) {
						if(thisSlot == board[j][i+3]) {
							return true;
						}
					}
				}
			}
		}
		
		// check for diagonal win left to right, upwards
		for(int i = 0; i < board[0].length - 3; i++) {
			for(int j = 3; j < board.length; j++) {
				if(board[j][i] != GameBoard.EMPTY) {
					int thisSlot = board[j][i];
					
					if(board[j-1][i+1] == thisSlot) {
						if(board[j-2][i+2] == thisSlot) {
							if(board[j-3][i+3] == thisSlot) {
								return true;
							}
						}
					}
				}
			}
		}
		
		// check for diagonal win right to left, upwards
		for(int i = 3; i < board[0].length; i++) {
			for(int j = 3; j < board.length; j++) {
				if(board[j][i] != GameBoard.EMPTY) {
					int thisSlot = board[j][i];
					
					if(board[j-1][i-1] == thisSlot) {
						if(board[j-2][i-2] == thisSlot) {
							if(board[j-3][i-3] == thisSlot) {
								return true;
							}
						}
					}
				}
			}
		}
		
		return false;
	}
}
