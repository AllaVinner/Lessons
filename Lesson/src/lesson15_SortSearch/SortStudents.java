package lesson15_SortSearch;

import java.util.ArrayList;
import java.util.Collections;

import lesson12_Arrays.Student;
import lesson14_ArrayList.ArrayListExample;

public class SortStudents {

	public static void main(String[] args) {
	ArrayList<Student> na12b = new ArrayList<>();
		
		//Adding the students
		na12b.add(new Student("Joel", 18));
		na12b.add(new Student("Elli", 17));
		na12b.add(new Student("Sam", 16));
		na12b.add(new Student("Madde", 16));
		
		ArrayListExample.printStudents(na12b);
		
		Collections.sort(na12b, new NameComparator());
		ArrayListExample.printStudents(na12b);
		
		Collections.sort(na12b, new GradeComparator());
		ArrayListExample.printStudents(na12b);


	}

}
