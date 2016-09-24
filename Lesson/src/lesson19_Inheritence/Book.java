package lesson19_Inheritence;

public class Book extends Product{

	private int pages;
	
	public Book(String name, double price,int pages){
		super(name, price);
		this.pages = pages;
	}
		
	public int getPages(){
		return this.pages;
	}

	public void setPages(int newPages){
		this.pages = newPages;
	}
	
	@Override
	public String getType(){
		return "Book";
	}
	
}
