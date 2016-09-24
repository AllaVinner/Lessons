package lesson12_Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		int [] grades = new int[4];
		double averageGrade=0;
		
		grades[0]=77;
		grades[1]=84;
		grades[2]=62;
		grades[3]=96;
		String [] names = new String[]{"Tomr", "Ed", "Johanna", "Sara"};
		
		
		System.out.printf("#\tSudent\tGrade\n");
		System.out.printf("-\t------\t-----\n");
		
		int sumGrade=0;
		for(int i=0; i<grades.length; i++){
			System.out.printf("%d\t%s\t%d\n", i, names[i], grades[i]);
			sumGrade += grades[i];
		}
		
		averageGrade=(double) sumGrade/grades.length;
		System.out.printf("Class average was %3.2f\n",averageGrade);
	}

}
