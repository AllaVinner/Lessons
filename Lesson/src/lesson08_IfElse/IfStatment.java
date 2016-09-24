package lesson08_IfElse;

import java.util.Scanner;

public class IfStatment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type your grade, number between 0 and 100: ");
		int grade = input.nextInt();
		
		if(grade >= 0 && grade <=100){
			System.out.println("You did correct");
			if(grade < 70){
				System.out.println("You did not pass");
			}else{
				System.out.printf("%d is a nice grade", grade);
			}
		}else{
			System.out.printf("You can not follow instuction, %d is not between 0 -100", grade);
		}
		input.close();
	}

}
