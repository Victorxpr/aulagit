package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("ENTER PRODUCT DATA: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
	
		 Product product = new Product(name,price);
		 
		 
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("enter the number of products to be added in stock: ");
	    int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Upadate data: " + product);

		System.out.println();
		System.out.println("Remove product: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("remove product at data: " + product);

		sc.close();
	}

}
