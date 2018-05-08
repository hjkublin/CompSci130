import java.util.Scanner;

public class TicTacToe {

    public static void printBoard(char[][] board) {
   	 	int rows = board.length;
   	 	int cols = board[0].length;
   	 
   	 for(int i = 0; i<rows; i++) {
   		 for(int j = 0; j<cols; j++) {
   			 System.out.print(board[i][j]+" ");
   		 }
   		 System.out.println();
   	 }
    }
    
    public static char [][] initBoard(char[][]board) {
   	 	int rows= board.length;
   	 	int cols = board[0].length;
   	 
   	 	for(int i = 0; i<rows; i++) {
   	 		for(int j=0; j<cols; j++) {
   	 			board[i][j] = '-';
   		 }
   	 }
   	 	return board;
    }
    
    public static boolean checkWinHorizontal(char[][] board, boolean gameOver){
    	int numXr0 = 0;
    	int numXr1 = 0;
    	int numXr2 = 0;
    	int numOr0 = 0;
    	int numOr1 = 0;
    	int numOr2 = 0;
    	for(int i = 0; i < board.length; i++){
        		if(board[0][i] == 'X'){
        			numXr0 ++;
        			if (numXr0 == 3){	
        				gameOver = true;
        			}
        		}
        		if(board[1][i] == 'X'){
        			numXr1 ++;
        			if (numXr1 == 3){	
        				gameOver = true;
        			}
        		}
        		if(board[2][i] == 'X'){
        			numXr2 ++;
        			if (numXr2 == 3){	
        				gameOver = true;
        			}
        		}
        		if(board[0][i] == 'O'){
        			numOr0 ++;
        			if (numOr0 == 3){
        				gameOver = true;
        			}
        		}
        		if(board[1][i] == 'O'){
        			numOr1 ++;
        			if (numOr1 == 3){	
        				gameOver = true;
        			}
        		}
        		if(board[2][i] == 'O'){
        			numOr2 ++;
        			if (numOr2 == 3){	
        				gameOver = true;
        			}
        	}
    	}
		return gameOver;
    }
    
    public static boolean checkWinVertical(char[][] board, boolean gameOver){
    	int numXc0 = 0;
    	int numXc1 = 0;
    	int numXc2 = 0;
    	int numOc0 = 0;
    	int numOc1 = 0;
    	int numOc2 = 0;
    	for(int i = 0; i < board.length; i++){
        		if(board[i][0] == 'X'){
        			numXc0 ++;
        			if (numXc0 == 3){	
        				gameOver = true;
        			}
        		}
        		if(board[i][1] == 'X'){
        			numXc1 ++;
        			if (numXc1 == 3){	
        				gameOver = true;
        			}
        		}
        		if(board[i][2] == 'X'){
        			numXc2 ++;
        			if (numXc2 == 3){	
        				gameOver = true;
        			}
        		}
        		if(board[i][0] == 'O'){
        			numOc0 ++;
        			if (numOc0 == 3){
        				gameOver = true;
        			}
        		}
        		if(board[i][1] == 'O'){
        			numOc1 ++;
        			if (numOc1 == 3){
        				gameOver = true;
        			}
        		}
        		if(board[i][2] == 'O'){
        			numOc2 ++;
        			if (numOc2 == 3){	
        				gameOver = true;
        			}
        	}
    	
	}
		return gameOver;
    }
    
    public static boolean checkWinDiagonal(char[][] board, boolean gameOver){
    	int numX = 0;
    	int numY = 0;
    	for(int i = 0; i < board.length; i++){
    		if(board[i][i] == 'X'){
    			numX ++;
    			if (numX == 3){
    				gameOver = true;
    			}
    		}
    		if(board[i][i] == 'O'){
    			numY ++;
    			if (numY == 3){
    				gameOver = true;
    			}
    		}
	}
    	if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X' || board[2][0] == 'Y' && board[1][1] == 'Y' && board[0][2] == 'Y'){
    		gameOver = true;
    	}
		return gameOver;
    }
    
    
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);  
   	 	final int BOARD_SIZE=3;
   	 	int playerTurn = 1;
   	 	boolean gameOver= false;
   	 	int userRow=0;
   	 	int userCol = 0;
   	 	int winner = 0;
   	 	char [][] gameBoard= new char[BOARD_SIZE][BOARD_SIZE];
   	 
   	 	gameBoard =initBoard(gameBoard);
   	 	printBoard(gameBoard);
   	 
   	 	while(gameOver==false) {
   	 		gameOver = checkWinHorizontal(gameBoard,gameOver);
   	 		gameOver = checkWinVertical(gameBoard,gameOver);
   	 		gameOver = checkWinDiagonal(gameBoard,gameOver);

   	 		if (gameOver == true){
				System.out.println("Winner winner chicken dinner! Player "+ winner +" wins!!!");
   	 			break;
   	 		}
   	 		else if (playerTurn == 1){
   	 			System.out.println("Where will you place an X? [Answer as: Row Column] ");
   	 			int row = scnr.nextInt();
   	 			int column = scnr.nextInt();
   	 			gameBoard[row - 1][column - 1] = 'X';
   	 			playerTurn = 2;
   	 			winner = 1;
   	    	 	printBoard(gameBoard);
   	    	 	
   	 		}
   	 		else if (playerTurn == 2){
   	 			System.out.println("Where will you place an O? [Answer as: Row Column] ");
   	 			int row = scnr.nextInt();
	 			int column = scnr.nextInt();
   	 			gameBoard[row - 1][column - 1] = 'O';
   	 			playerTurn = 1;
   	 			winner = 2;
   	    	 	printBoard(gameBoard);
   	 		}
   	 		else{
   	 			System.out.println("Error in loop");
   	 		}
   	 	}	
   	    
   	    	
   	    }
   	 	
    }


