package lesson13_MultiDimensionalArrays;

public class Play_TickTacToe {

	public static void main(String[] args) {
		Board game = new Board();
		
		game.draw();
		
		game.place(Marker.X, 1, 1);
		game.place(Marker.O, 2, 0);
		game.draw();
		game.place(Marker.X, 2, 0);
		

	}

}
