package lesson09_Enumurations;

public enum Direction  {
	
	
	North(0), South(180), East(90), West(270);
	private final int degrees;
	
	Direction(int degrees){
		this.degrees=degrees;
	}
	
	public int Degrees(){return this.degrees;}


}
