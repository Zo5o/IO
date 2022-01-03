package com.io.com.io.testing_code;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.Size2DSyntax;

public class ProductsCatalog {

	private List <Product> products;
	
	public ProductsCatalog() {
		
		this.products = new ArrayList<>();
	}
	
	public Product addProduct(Product product) {
		
		this.products.add(product);
		
		return product;
	}
	
	public boolean removeProduct(Product product) {
		
		return this.products.remove(product);
	}
	
	public Product updateProduct(int index, Product product) {
		
		int numberOfProducts = products.size();
		
		if(index >= 0 && index < numberOfProducts && product != null) {
			
			Product foundProduct = products.get(index);
			
			foundProduct.setName(product.getName());
			foundProduct.setValue(product.getValue());
			
			return products.set(index, product);
		}
		
		return null;
	}
	
	public Product getProduct(int index) {
		
		return products.get(index);
	}
}
