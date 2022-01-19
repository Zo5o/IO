package com.io.com.io.FitNesse;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Wypozyczalnia sprzetu turystycznego");
                
                Application app = new Application();
                app.addProduct(Factory.createProduct("Buty", 2, 3));
                app.addProduct(Factory.createProduct("Buty", 2, 3));
                //System.out.println(app.getProducts()[0]);
	}

}
