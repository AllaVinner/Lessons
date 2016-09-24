package lesson16_Exeptions;

public class IntegerOutOfRangeException extends Exception {
	
	private int falseInt;
	
	public IntegerOutOfRangeException(){
	}
	
	public IntegerOutOfRangeException(int i){
		this.falseInt=i;
	}
	
	public int getfalseInt(){
		return this.falseInt;
	}
	
}
