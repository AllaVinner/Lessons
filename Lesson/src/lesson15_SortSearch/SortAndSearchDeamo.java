package lesson15_SortSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class SortAndSearchDeamo {

	public static void main(String[] args) {
		Random generator = new Random(1);
		int found = -1;
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i< 20; i++){
			numbers.add(generator.nextInt(100)+1);
		}
		
		System.out.println("Unsorted");
		printNumbers(numbers);
		found = Find(numbers, 90);
		System.out.printf("The number %d was %s", 90, found<0 ? "not found.\n":"found on place " +found+"\n");
	
		Collections.sort(numbers, new IntegerComparator());
		System.out.println("Sorted");
		printNumbers(numbers);
		
		found = Collections.binarySearch(numbers, 90, new IntegerComparator());
		System.out.printf("The number %d was %s", 90, found<0 ? "not found.\n":"found on place " +found+"\n");
		printNumbers(numbers);
		
	}
	
	public static void printNumbers(ArrayList<Integer> collection){
		for(Integer i : collection){
			System.out.println(i);
		}
	}
	
	public static int Find(ArrayList<Integer> list, int target){
		int found =-1;
		for(int i=0; i<list.size(); i++){
			if(list.get(i)==target){
				found =i;
				break;
			}
		}
		return found;
	}

}
