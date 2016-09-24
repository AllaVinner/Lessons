package lesson13_MultiDimensionalArrays;

public class MultiDimArrayDemo {
	/*
	  x| | 
	  -+-+-
	   |w|o
	  -+-+-
	  x| |o
	 */

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		board[0][0]='x';
		board[1][1]='w';
		board[2][0]='x';
		board[1][2]='o';
		board[2][2]='o';
		
		for(int row=0; row<board.length;row++){
			for(int column=0; column<board[0].length; column++){
				System.out.printf("[%d][%d] =%s ",row, column, board[row][column]);
			}
			System.out.println();
		}
		
		
		
	}
}
