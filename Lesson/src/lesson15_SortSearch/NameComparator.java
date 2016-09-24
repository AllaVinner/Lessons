package lesson15_SortSearch;

import java.util.Comparator;

import lesson12_Arrays.Student;

public class NameComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2){
		return s1.Name().compareToIgnoreCase(s2.Name());
	}
}
