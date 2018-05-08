/*
 * Author: Matthew Holland
 */
public class KublinPlayer extends Player{
	public KublinPlayer() {
		myName = "Kublin";
	}

	public int ai (GameBoard gb) {
		int[][] board = gb.getBoard();

		// look for our own vertical win
		for(int i = 0; i < board[0].length; i++) {
			for(int j = board.length - 1; j > 2; j--) {

				// if we have 3 in a row vertically, drop in that column
				if(board[j][i] == myColor) {
					if(board[j-1][i] == myColor) {
						if(board[j-2][i] == myColor) {

							if(gb.isLegalMove(i) && board[j-3][i] == GameBoard.EMPTY) {
								return i;
							}
						}
					}
				}
			}
		}

		// look for our own horizontal win - right
		for(int i = 0; i < board[0].length - 3; i++) {
			for(int j = 0; j < board.length; j++) {

				// if we have 3 in a row horizontally, drop in the next spot to the right
				if(board[j][i] == myColor) {
					if(board[j][i+1] == myColor) {
						if(board[j][i+2] == myColor) {

							if(gb.isLegalMove(i+3) && board[j][i+3] == GameBoard.EMPTY) {
								// looking at bottom row
								if(j == board.length-1) {
									return i + 3;
								} else if(board[j+1][i+3] != GameBoard.EMPTY) {
									return i + 3;
								}
							}
						}
					}
				}
			}
		}

		// look for our own horizontal win - left
		for(int i = board[0].length - 1; i > 2; i--) {
			for(int j = 0; j < board.length; j++) {

				// if we have 3 in a row horizontally, drop in the next spot to the left
				if(board[j][i] == myColor) {
					if(board[j][i-1] == myColor) {
						if(board[j][i-2] == myColor) {

							if(gb.isLegalMove(i-3) && board[j][i-3] == GameBoard.EMPTY) {
								// looking at bottom row
								if(j == board.length-1) {
									return i - 3;
								} else if(board[j+1][i-3] != GameBoard.EMPTY) {
									return i - 3;
								}
							}
						}
					}
				}
			}
		}

		// look for our own diagonal win upwards, left to right
		for(int i = 0; i < board[0].length - 3; i++) {
			for(int j = 3; j < board.length; j++) {

				// if opponent has 3 in a row diagonally upwards, left to right, block
				if(board[j][i] == myColor) {
					if(board[j-1][i+1] == myColor) {
						if(board[j-2][i+2] == myColor) {

							if(gb.isLegalMove(i+3) && board[j-3][i+3] == GameBoard.EMPTY) {
								if(board[j-2][i+3] != GameBoard.EMPTY) {
									return i + 3;
								}
							}
						}
					}
				}
			}
		}

		// look for our own diagonal win upwards, right to left
		for(int i = 3; i < board[0].length; i++) {
			for(int j = 3; j < board.length; j++) {

				// if opponent has 3 in a row diagonally upwards, right to left, block
				if(board[j][i] == myColor) {
					if(board[j-1][i-1] == myColor) {
						if(board[j-2][i-2] == myColor) {

							if(gb.isLegalMove(i-3) && board[j-3][i-3] == GameBoard.EMPTY) {
								if(board[j-2][i-3] != GameBoard.EMPTY) {
									return i - 3;
								}
							}
						}
					}
				}
			}
		}

		// if we can't find a way to win this turn, look to block the opponent

		// block vertical win
		for(int i = 0; i < board[0].length; i++) {
			for(int j = board.length - 1; j > 2; j--) {

				// if the opponent has 3 in a row vertically, drop in that column
				if(board[j][i] != myColor && board[j][i] != GameBoard.EMPTY) {
					if(board[j-1][i] != myColor && board[j-1][i] != GameBoard.EMPTY) {
						if(board[j-2][i] != myColor && board[j-2][i] != GameBoard.EMPTY) {

							if(gb.isLegalMove(i) && board[j-3][i] == GameBoard.EMPTY) {
								return i;
							}
						}
					}
				}
			}
		}

		// block horizontal win - right
		for(int i = 0; i < board[0].length - 3; i++) {
			for(int j = 0; j < board.length; j++) {

				// if the opponent has 3 in a row horizontally, drop in next spot to the right
				if(board[j][i] != myColor && board[j][i] != GameBoard.EMPTY) {
					if(board[j][i+1] != myColor && board[j][i+1] != GameBoard.EMPTY) {
						if(board[j][i+2] != myColor && board[j][i+2] != GameBoard.EMPTY) {

							if(gb.isLegalMove(i+3) && board[j][i+3] == GameBoard.EMPTY) {
								// looking at bottom row
								if(j == board.length-1) {
									return i + 3;
								} else if(board[j+1][i+3] != GameBoard.EMPTY) {
									return i + 3;
								}
							}
						}
					}
				}
			}
		}

		// block horizontal win - left
		for(int i = board[0].length - 1; i > 2; i--) {
			for(int j = 0; j < board.length; j++) {

				// if the opponent has 3 in a row horizontally, drop in the next spot to the left
				if(board[j][i] != myColor && board[j][i] != GameBoard.EMPTY) {
					if(board[j][i-1] != myColor && board[j][i-1] != GameBoard.EMPTY) {
						if(board[j][i-2] != myColor && board[j][i-2] != GameBoard.EMPTY) {

							if(gb.isLegalMove(i-3) && board[j][i-3] == GameBoard.EMPTY) {
								// looking at bottom row
								if(j == board.length-1) {
									return i - 3;
								} else if(board[j+1][i-3] != GameBoard.EMPTY) {
									return i - 3;
								}
							}
						}
					}
				}
			}
		}

		// block diagonal win upwards, left to right
		for(int i = 0; i < board[0].length - 3; i++) {
			for(int j = 3; j < board.length; j++) {

				// if opponent has 3 in a row diagonally upwards, left to right, block
				if(board[j][i] != myColor && board[j][i] != GameBoard.EMPTY) {
					if(board[j-1][i+1] != myColor && board[j-1][i+1] != GameBoard.EMPTY) {
						if(board[j-2][i+2] != myColor && board[j-2][i+2] != GameBoard.EMPTY) {

							if(gb.isLegalMove(i+3) && board[j-3][i+3] == GameBoard.EMPTY) {
								if(board[j-2][i+3] != GameBoard.EMPTY) {
									return i + 3;
								}
							}
						}
					}
				}
			}
		}

		// block diagonal win upwards, right to left
		for(int i = 3; i < board[0].length; i++) {
			for(int j = 3; j < board.length; j++) {

				// if opponent has 3 in a row diagonally upwards, right to left, block
				if(board[j][i] != myColor && board[j][i] != GameBoard.EMPTY) {
					if(board[j-1][i-1] != myColor && board[j-1][i-1] != GameBoard.EMPTY) {
						if(board[j-2][i-2] != myColor && board[j-2][i-2] != GameBoard.EMPTY) {

							if(gb.isLegalMove(i-3) && board[j-3][i-3] == GameBoard.EMPTY) {
								if(board[j-2][i-3] != GameBoard.EMPTY) {
									return i - 3;
								}
							}
						}
					}
				}
			}
		}

		// if we can't win this turn, and we can't stop the opponent from winning this turn, drop randomly
		int random = (int)(Math.random() * board[0].length);

		while(!gb.isLegalMove(random)) {
			random = (int)(Math.random() * board[0].length);
		}

		return random;
	}
}
