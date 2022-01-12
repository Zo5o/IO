package com.io.com.io.FitNesse;

import java.util.List;

public class Bill {

	private Cart cart;
	
	public Bill(Cart cart) {
		
		this.cart = cart;
	}
	
	public float getBillValue() throws NullPointerException{
		
		List <Product> selectedProducts = cart.getSelectedProducts();
		
		int numberOfProducts = selectedProducts.size();
		
		if(numberOfProducts == 0) {
			
			throw new NullPointerException("Podany koszyk jest pusty");
		}
		
		float billValue = 0;
		
		for(Product product : cart.getSelectedProducts()) {
			
			billValue += product.getValue()*product.getQuantity();
		}
		
		return billValue;
	}
}
