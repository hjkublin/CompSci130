/*
 * Author: Henno Kublin
 */
public class SequentialPlayer extends Player{
	public SequentialPlayer() {
		myName = "Sequential";
	}
	public int ai (GameBoard gb) {
		int[][] board = gb.getBoard();
		int drop = 0;
		
		// loop through each column
		for(int i = 0; i < board[0].length; i++) {
			// if the top of each column is empty, drop
			if(board[0][i] == GameBoard.EMPTY) {
				drop = i;
				break;
			}
		}
		
		return drop;
	}


}
