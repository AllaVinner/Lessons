package lesson19_Inheritence;

public class Pants extends Product  {

	private int waist;
	private int inseam;
	
	
	
	public Pants(String name, double price, int waist, int inseam){
		super(name, price);
		this.waist = waist;
		this.inseam = inseam;
	}
	
		public int getWaist(){
			return this.waist;
		}
	
	public int getInseam(){
		return this.inseam;
	}
	
	public void setWaist(int newWaist){
		this.waist = newWaist;
	}
	
	public void setInseam(int newInseam){
		this.inseam = newInseam;
	}
	
	@Override
	public String getType(){
		return "Pants";
	}
	
	
	
}
