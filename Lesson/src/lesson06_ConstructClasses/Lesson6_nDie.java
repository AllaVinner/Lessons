package lesson06_ConstructClasses;

import java.util.Random;

public class Lesson6_nDie {
	
	private int sides;
	private int value;
	private Random generator;
	
	//Constructor
	public Lesson6_nDie(int sides){
		this.sides = sides;
		generator = new Random();
		this.value= this.roll();
	}
	
	public Lesson6_nDie(int sides, int seed){
		this.sides = sides;
		generator = new Random(seed);
	}
	
	public int roll(){
		this.value = this.generator.nextInt(this.sides);
		return this.value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int getSides(){
		return this.sides;
	}

	public void setSides(int sides){
		this.sides = sides;
	}
}
