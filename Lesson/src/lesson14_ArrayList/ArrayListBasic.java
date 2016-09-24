package lesson14_ArrayList;

import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
			
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(90);
		grades.add(85);
		grades.add(75);
		
		for(int i=0; i<grades.size(); i++){
			System.out.printf("grad number %d == %d\n", i, grades.get(i));
		}
		
		grades.remove(1); //renumbers the other indices
		
	}

}
