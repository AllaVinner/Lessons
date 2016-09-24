package lesson13_MultiDimensionalArrays;

public class Board {

	
	public Marker [] [] board;
	
	public Board(){
		this.board=new Marker [3][3];
		this.clear();
	}
	
	public Board(Marker[][] theBoard){
		this.board=theBoard;
	}
	
	public final void clear(){
		for(int row=0; row<this.board.length; row++){
			for(int column=0; column<this.board[0].length; column++){
				this.board[row][column]=Marker.EMPTY;
			}
		}
	}
	
	public void draw(){
		System.out.printf("\n  0 1 2 \n");
		for(int row=0; row<this.board.length; row++){
			System.out.printf("%s ",row);
			for(int column=0; column<this.board[0].length; column++){
				System.out.print(this.board[row][column]);
				if(column<2){
					System.out.print("|");
				}
			}
			System.out.println(" ");
			if(row<2){
				System.out.println("  -+-+-");
			}
		}
	}
	
	public boolean place(Marker theMarker, int row, int col){
		if(this.board[row][col]== Marker.EMPTY){
			this.board[row][col]=theMarker;
			return true;
		}
		return false;
	}
	
}
