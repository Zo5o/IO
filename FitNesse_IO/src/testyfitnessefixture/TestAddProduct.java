package testyfitnessefixture;

import com.io.com.io.FitNesse.Factory;
import com.io.com.io.FitNesse.Product;

import fit.ColumnFixture;
import java.util.Optional;

public class TestAddProduct extends ColumnFixture{

	String[] data;
	
	public boolean addProduct() throws IllegalArgumentException {
	
		int numberOfProducts1 = numberOfProducts();
                
                Optional<Product> p = Optional.ofNullable(Factory.createProduct(data[0], Float.valueOf(data[1]), Integer.valueOf(data[2])));
                
                if(p.isEmpty()){
                    
                    return false;
                }
			
		boolean succeed = SetUp.d_app.app.addProduct(p.get());
		
		int numberOfProducts2 = numberOfProducts();
		
		return numberOfProducts1 != numberOfProducts2 && succeed;
	}
	
	public int numberOfProducts() {
		
		return SetUp.d_app.app.getProducts().length;
	}

}
