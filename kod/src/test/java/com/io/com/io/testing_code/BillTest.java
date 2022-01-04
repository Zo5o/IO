package com.io.com.io.testing_code;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

@Category({Cart.class})
public class BillTest {
	
	public Bill bill;
	
	public void initBill() {
		
		Cart cart = new Cart();
		cart.addProduct(new Product(1, "buty", 200, 1));
		cart.addProduct(new Product(2, "plecak", 300, 1));
		
		bill = new Bill(cart);
	}
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void shouldCalculateSumOfProducts() {
		
		initBill();
		
		assertTrue(bill.getBillValue() == 500);
	}
	
	@Test
	public void shouldntCalculateSumOfProductsFromEmptyCart() {
		
		bill = new Bill(new Cart());
		
		exception.expect(NullPointerException.class);
		
		bill.getBillValue();
	}

}
