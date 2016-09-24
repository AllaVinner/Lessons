package lesson16_Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i =0;
		boolean done=false;
		
		do{
			try{
				Scanner input = new Scanner(System.in);
				System.out.print("Enter an Integer: ");
				i=input.nextInt();
				done = true;
				input.close();
			}catch (InputMismatchException e){
				System.out.println("You did not enter an integer");
			}finally{
				System.out.println("This happends allways");
			}
		}while(! done);
		
		System.out.printf("Your integer was %d", i);
	}

}
