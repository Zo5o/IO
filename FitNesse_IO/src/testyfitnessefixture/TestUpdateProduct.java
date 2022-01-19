package testyfitnessefixture;

import com.io.com.io.FitNesse.Factory;
import com.io.com.io.FitNesse.Product;

import fit.ColumnFixture;
import java.util.Optional;

public class TestUpdateProduct extends ColumnFixture{

        int id;
	String[] data;
	
	public boolean updateProduct() throws IllegalArgumentException {
                
                Optional<Product> p = Optional.ofNullable(Factory.createProduct(data[0], Float.valueOf(data[1]), Integer.valueOf(data[2])));
                
                if(p.isEmpty()){
                    
                    return false;
                }
			
		boolean succeed = SetUp.d_app.app.updateProduct(id, p.get());
		
		return succeed;
	}

}

