package lesson17_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileHandler {
	public static void main(String[] args) {
		File myFile = new File("Joels_Testare.txt");
		
		//Write to the file
		try{
			PrintWriter output = new PrintWriter(myFile);
			output.println("Joel Ottosson");
			output.println(20);
			output.close();
		}catch (IOException ex){
			System.out.printf("Error %s", ex);
		}
		
		try{
		Scanner input = new Scanner(myFile);
		String name = input.nextLine();
		int age = input.nextInt();
		
		System.out.printf("Name: %s\nAge: %d", name, age);
		input.close();
		}catch (FileNotFoundException ex){
			System.out.println("File did not exist");
		}
		
		
	}
}
