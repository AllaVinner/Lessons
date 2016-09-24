package lesson01_HelloWorld;

import java.util.Scanner;

public class LessonOne {

	/*Learn Programming in Java - Lesson 01 : Java Programming Basics
	 * https://www.youtube.com/watch?v=uYnY_7V_l6I
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is you name");
		String yourName = input.nextLine();
		System.out.printf("Hello, %s !!!! \n", yourName);
		input.close();
	}

}
