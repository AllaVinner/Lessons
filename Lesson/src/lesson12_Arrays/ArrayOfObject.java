package lesson12_Arrays;

import java.util.Scanner;

public class ArrayOfObject {

	public static void main(String[] args) {
//		student [] students = new student[] {
//			new student("Tom",77),
//			new student("Ed", 84),
//			new student("Johanna", 62),
//			new student("Sara",96)
//		};
		Scanner input = new Scanner(System.in);
		Student[] students = new Student[4];
		int grade;
		String name;
		
		for(int i=0; i<students.length; i++){
			System.out.printf("Enter student name then grade for studet %d: ", i);
			name = input.next();
			grade=input.nextInt();
			students[i]=new Student(name, grade);
		}

		double averageGrade=0;
		
		System.out.printf("#\tSudent\tGrade\n");
		System.out.printf("-\t------\t-----\n");
		
		int sumGrade=0;
		for(int i=0; i<students.length; i++){
			System.out.printf("%d\t%s\t%d\n", i, students[i].Name(), students[i].Grade());
			sumGrade += students[i].Grade();
		}
		
		averageGrade=(double) sumGrade/students.length;
		System.out.printf("Class average was %3.2f\n",averageGrade);
		
		input.close();
	}

}
