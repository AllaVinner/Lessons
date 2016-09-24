package lesson05_Classes;

import java.util.Scanner;

public class Lesson5_Object2 {

	public static void main(String[] args) {
	int length, width;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Ennter the Length: ");
	length = input.nextInt();
	System.out.print("Enter the width: ");
	width = input.nextInt();
	int area = rectangleArea(length, width);
	int perim = rectanglePerimeter(length, width);
	System.out.printf("The Area is %d, and det perimeter is %d.\n", area, perim);
	
	input.close();	
	}
	
	public static int rectangleArea(int length, int width){
		return length*width;
	}
	
	public static int rectanglePerimeter(int length, int width){
		return 2 * (length+width);
	}
}
