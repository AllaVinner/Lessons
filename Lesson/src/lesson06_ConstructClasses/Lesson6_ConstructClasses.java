package lesson06_ConstructClasses;

public class Lesson6_ConstructClasses {

	public static void main(String[] args) {	
		Lesson6_nDie die = new Lesson6_nDie(12);
		System.out.println(die.getValue());
		die.setSides(4);
		System.out.println(die.roll());
	}
}
