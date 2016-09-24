package lesson19_Inheritence;

public class Product {

	private String name;
	private double price;
	
	public Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}

	public double getPrice(){
		return this.price;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public void setPrice(double newPrice){
		this.price = newPrice;
	}
	
	public String getType(){
		return "Product";
	}
	
}
