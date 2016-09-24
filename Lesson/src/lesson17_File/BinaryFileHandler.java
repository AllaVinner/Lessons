package lesson17_File;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import lesson12_Arrays.Student;

public class BinaryFileHandler {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File myFile = new File("The Studnets.txt");
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("Joel", 14));
		students.add(new Student("Sam", 15));
		students.add(new Student("Lasse", 156));
		students.add(new Student("Tomas", 33));

		//Serialize the collection of students
		
		FileOutputStream fo = new FileOutputStream(myFile);
		ObjectOutputStream output = new ObjectOutputStream(fo);
		
		for(Student s : students){
			output.writeObject(s);
		}
		
		fo.close();
		output.close();
		
		//Deserialize the collection;
		FileInputStream fi = new FileInputStream(myFile);
		ObjectInputStream input = new ObjectInputStream(fi);
		ArrayList<Student> students2 = new ArrayList<>();
		
		
		try{
			while(true){
				Student s = (Student) input.readObject();
				students2.add(s);	
			}
		}catch (EOFException ex){
		System.out.println(ex);	
		}
		
		for(Student t : students2){
			System.out.println(t);
		}
		input.close();
		
	}

}
