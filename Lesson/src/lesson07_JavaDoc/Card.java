package lesson07_JavaDoc;

public class Card {
	private int suit;
	private int rank;
	
	/**
	 * Creates a new card.
	 * @param suit this integer represents the suit of the card. Ex: Dimond.
	 * @param rank this integer represent the rank of the card. Ex: 2,3.
	 */
	public Card(int suit, int rank){
		this.suit=suit;
		this.rank=rank;
	}
	
	/**
	 * Creates a new card.
	 * @param cardNumber integer represents the card. Ex: 0=2 of clubs, 13=Ace of Dimonds
	 */
	public Card(int cardNumber){
		this.rank = cardNumber%13;
		this.suit = (cardNumber/13) % 4;
	}
	
	@Override
	public String toString(){
		String ranks = "23456789TJQKA";
		String suits = "\u2663\u2666\u2665\u2660"; // "CDHS"
		return ranks.charAt(this.rank) + "" + suits.charAt(this.suit);
	}	
}
