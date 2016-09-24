package lesson07_JavaDoc;

public class Play_Main {

	public static void main(String[] args) {
		Card c = new Card(Suits.DIMONDS, Ranks.KING);
		Card d = new Card(13);
		System.out.println(c);
		System.out.println(d);	
	}

	
}
