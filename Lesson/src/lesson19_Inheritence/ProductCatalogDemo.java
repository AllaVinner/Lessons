package lesson19_Inheritence;

import java.util.ArrayList;

public class ProductCatalogDemo {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Book("Moby Dick", 19.99, 365));
		products.add(new Book("Harry Potter", 45.64, 941));
		products.add(new Pants("Blue Moon", 76.00, 32, 31));
		products.add(new Product("Pencil", 0.99));
		
		System.out.printf("%-10s\t%10s\t%-10s\n", "Name", "Price", "Type" );
		for(Product p : products){
			System.out.printf("%-10s\t%10s\t%-10s\n", p.getName(), p.getPrice(), p.getType());
		}	
	}
}
