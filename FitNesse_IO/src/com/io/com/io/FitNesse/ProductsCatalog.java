package com.io.com.io.FitNesse;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.Size2DSyntax;

public class ProductsCatalog {

	private List <Product> products;
	
	public ProductsCatalog() {
		
		this.products = new ArrayList<>();
	}
	
	public Product addProduct(Product product) {
		
		if(!productExistsWithId(product.getId())) {
			
			try {
				
                            products.add(product);
                            
                            return product;
			}
			catch(IllegalArgumentException e) {
				
				return null;
			}
		}	
		
		return null;
	}
	
	public boolean removeProduct(Integer id) {
            
            for(Product p : products) {
			
                if(p.getId() == id) {

                    return this.products.remove(p);
                }
            }
            
            return false;
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
	
	public boolean productExistsWithId(Integer id) {
		
		for(Product p : products) {
			
                    if(p.getId() == id) {

                            return true;
                    }
		}
		
		return false;
	}
	
	public List<Product> getProducts(){
		
		return products;
	}
}
