package com.io.com.io.FitNesse;


public class Employee {

	private ProductsCatalog productsCatalog;
	
	public Employee() {
		
		productsCatalog = new ProductsCatalog();
	}

	public ProductsCatalog getProductsCatalog() {
		return productsCatalog;
	}

	public void setProductsCatalog(ProductsCatalog productsCatalog) {
		this.productsCatalog = productsCatalog;
	}
}
