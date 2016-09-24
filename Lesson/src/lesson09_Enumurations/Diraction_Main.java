package lesson09_Enumurations;
public class Diraction_Main {

	public static void main(String[] args){
		Direction d = Direction.West;
		System.out.printf("%s is at %d degrees.\n",d, d.Degrees());
		System.out.println(Direction.North);
	}
	
}
