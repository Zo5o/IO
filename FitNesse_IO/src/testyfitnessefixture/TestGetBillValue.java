package testyfitnessefixture;

import fit.ColumnFixture;

public class TestGetBillValue extends ColumnFixture{
    
        double billValue;
	
	public boolean getBillValue() throws IllegalArgumentException {
                
                return SetUp.d_app.app.getBillValue(0) == billValue;
	}
}

