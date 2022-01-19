package com.io.com.io.FitNesse;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	
	private Employee employee;
	private ProductsCatalog productsCatalog;
	private ArrayList<Customer> customers;
	
	public Application() {
		
		customers = new ArrayList<>();
		
		customers.add(new Customer("a", "b"));
		
		productsCatalog = new ProductsCatalog();
	}
        
        public boolean removeProduct(int id){
            
            return productsCatalog.removeProduct(id);
        }
	
	public boolean addProduct(Product product) {
		
		return productsCatalog.addProduct(product) != null;
	}
        
        public boolean addProductToCart(int customerId, Product product){
            
            return customers.get(customerId).getCart().addProduct(product) != null;
        }
        
        public boolean updateProduct(int index, Product product) {
		
		return productsCatalog.updateProduct(index, product) != null;
	}
        
        public double getBillValue(int customerId){
            
            Bill bill = new Bill(customers.get(customerId).getCart());
            
            return bill.getBillValue();
        }
        
        public double getValueOfAllProduct(){
            
            return productsCatalog.getValueOfAllProduct();
        }
        
        public Cart getCustomerCart(int customerId){
            
            return customers.get(customerId).getCart();
        }
	
	public Object[] getProducts() {
		
		return productsCatalog.getProducts().toArray();
	}
	
	public void employeeInterface() {
		
		System.out.println("Interfejs pracownika");
		employee = new Employee();
		employee.setProductsCatalog(productsCatalog);
	}
	
	public void loginInterface() {
		
		System.out.println("Logowanie");
		
		customers.add(new Customer("c", "d"));
	}
	
	public void registerInterface() {
		
		System.out.println("Logowanie");
	}
	
	public void consoleMenu() {
		
		Scanner in = new Scanner(System.in);
		
		String menu = "Menu:\n" +
					  "1 - Interfejs pracownika\n" +
					  "2 - Logowanie klienta\n" +
					  "3 - Rejestracja klienta\n"+
					  "4 - Zamknij\n";
					  
		String input;
		
		while(true) {
			
			input = in.next();
			
			switch(input) {
			
				case "1":
					employeeInterface();
					break;
					
				case "2":
					loginInterface();
					break;
					
				case "3":
					registerInterface();
					break;
					
				default: System.out.println("Podano nieprawid�ow� komend�");
			}
		}
		
	}
}
