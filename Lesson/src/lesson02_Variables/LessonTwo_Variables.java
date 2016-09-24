package lesson02_Variables;

import java.util.Scanner;

public class LessonTwo_Variables {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = "Joel", heShe= "He", deanString;
		int age =21, daysLeft;
		double scoreAverage = 3.56;
		boolean isFemale, deansList;
		
		System.out.print("Enter studet큦 name: ");
		name= input.nextLine();
		System.out.print("Enter studet큦 age: ");
		age = input.nextInt();
		System.out.print("Enter studet큦 average Score: ");
		scoreAverage = input.nextDouble();
		System.out.print("Are you a female?: ");
		isFemale = input.nextBoolean();
		
		heShe = isFemale ? "She" : "He";
		daysLeft = 70 -age;
		
		deansList = scoreAverage > 3.2;
		deanString = deansList ? "" : "not ";
		
		System.out.printf("%s is %d years old. %s has a %4.1f scoreaverage. \n%s has %d years till retairemt \n %s is %sin dean큦 list.",
				name, age, heShe, scoreAverage, heShe, daysLeft, heShe, deanString);
		
		input.close();
	}

}
