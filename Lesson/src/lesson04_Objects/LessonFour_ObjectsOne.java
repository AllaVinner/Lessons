package lesson04_Objects;

import java.util.Random;
import java.util.Scanner;

public class LessonFour_ObjectsOne {
/*
 * Use already existing packages
 */
	
	
	public static void main(String[] args) {
		// Example 1:
		System.out.println("Example 1");
		Random generator = new Random(1); // int is seed number
		int i = generator.nextInt(10);
		System.out.println(i);
		i = generator.nextInt(10);
		System.out.println(i);
		i = generator.nextInt(10);
		System.out.println(i);
		
		// Example 2:
		String forward = "This is a string";
		StringBuilder sb = new StringBuilder();
		sb.append(forward);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
		
		//Example 3
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle radius: ");
		double radius = input.nextDouble();
		
		double circ = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.printf("The circumferece of the circle is %3.2f m.\nAnd the area is %3.2f m.", circ, area);
		
		input.close();
	}

}
