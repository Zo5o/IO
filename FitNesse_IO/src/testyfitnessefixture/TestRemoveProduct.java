package testyfitnessefixture;

import fit.ColumnFixture;

public class TestRemoveProduct extends ColumnFixture{

	int id;
	
	public boolean removeProduct() throws IllegalArgumentException {
	
		int numberOfProducts1 = numberOfProducts();
			
		boolean succeed = SetUp.d_app.app.removeProduct(id);
		
		int numberOfProducts2 = numberOfProducts();
		
		return numberOfProducts1 != numberOfProducts2 && succeed;
	}
	
	public int numberOfProducts() {
		
            return SetUp.d_app.app.getProducts().length;
	}
}
