package com.io.com.io.FitNesse;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

public class Cart {

	private List <Product> selectedProducts;
	
	public Cart() {
		
		selectedProducts = new ArrayList<>();
	}

	public List<Product> getSelectedProducts() {
		return selectedProducts;
	}

	public void setSelectedProducts(List<Product> selectedProducts) {
		this.selectedProducts = selectedProducts;
	}
	
	public Product addProduct(Product product) {
		
		if(!productExists(product)) {
			
			selectedProducts.add(product);
			
			return product;
		}
		
		return null;
	}
	
	public boolean removeProduct(int index) {
		
		int numberOfProducts = selectedProducts.size();
		
		if(index < numberOfProducts && index >= 0) {
			
			selectedProducts.remove(index);
		}
		
		return false;
	}
	
	public Product updateProductQuantity(int index, int quantity) {
		
		int numberOfProducts = selectedProducts.size();
		
		if(index < numberOfProducts && index >= 0 && quantity > 0) {
			
			Product product = selectedProducts.get(index);
			
			product.setQuantity(quantity);
			
			return selectedProducts.get(index);
		}
		
		return null;
	}
	
	public boolean productExists(Product product) {
		
		return selectedProducts.contains(product);
	}
	
	public Product getProduct(int index) {
		
		return selectedProducts.get(index);
	}
}
