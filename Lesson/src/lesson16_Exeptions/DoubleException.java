package lesson16_Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleException {

	public static void main(String[] args) {
		
		int i;
		String catchString;
		boolean done=false;
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Enter an integer between 1 and 10: ");
			try{
				i=input.nextInt();
				if(i<1 || 10<i) throw new IntegerOutOfRangeException(i);
				System.out.printf("Your number was %d", i);
				done = true;
			}catch (InputMismatchException ex){
				catchString = input.nextLine();
				System.out.printf("You did not enter an integer.\nYou entered \"%s\".\nPlease try again.\n", catchString);
				System.out.println(ex);
			}catch (IntegerOutOfRangeException ex){
				System.out.println("You're number was not between 1 and 10.");
				System.out.printf("You entered %d.\nPlease try again.\n",ex.getfalseInt());
				System.out.println(ex);
			}
			System.out.println();
		}while(! done);
		input.close();
	}
}
