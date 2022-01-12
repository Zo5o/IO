package com.io.com.io.FitNesse;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Wypozyczalnia sprzetu turystycznego");
                
                Application app = new Application();
                app.addProduct(new Product(1, "Buty", 2, 3));
                app.getProducts();
	}

}
