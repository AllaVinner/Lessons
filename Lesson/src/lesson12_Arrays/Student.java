package lesson12_Arrays;

//For lesson 17
import java.io.Serializable;

public class Student implements Serializable{
	private int grade;
	private String name;
	
	public Student(String name, int grade){
		this.name=name;
		this.grade=grade;
	}
	
	public String Name(){
		return this.name;
	}
	
	public int Grade(){
		return this.grade;
	}
	
	@Override
	public String toString(){
		return String.format("%s\t%d\n",this.name, this.grade);
	}
}
