package lesson14_ArrayList;

import java.util.ArrayList;
import lesson12_Arrays.Student;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Student> na12b = new ArrayList<>();
		
		//Adding the students
		na12b.add(new Student("Joel", 18));
		na12b.add(new Student("Elli", 17));
		na12b.add(new Student("Sam", 16));
		na12b.add(new Student("Madde", 16));
		
		//Printing the collection
		printStudents(na12b);
		Student tmp= na12b.remove(0);
		printStudents(na12b);
		na12b.add(tmp);
		printStudents(na12b);
		na12b.add(new Student("Johanna", 17));
		printStudents(na12b);
		swapInArrayList(na12b, 4,2);
		printStudents(na12b);
	}
	
	public static void printStudents(ArrayList<Student> team){
		System.out.printf("Name\tGrade\n");
		for(Student s : team){
			System.out.print(s);
		}
		System.out.println();
	}

	public static void swapInArrayList(ArrayList<Student> team, int idx1, int idx2){
		Student temp=team.get(idx1);
		team.set(idx1, team.get(idx2));
		team.set(idx2, temp);
	}
}
