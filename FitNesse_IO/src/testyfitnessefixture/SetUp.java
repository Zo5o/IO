package testyfitnessefixture;

import com.io.com.io.FitNesse.Application;

import fit.Fixture;

public class SetUp extends Fixture{
	
	static DummyApplication d_app;
	
	public SetUp() {
		
		d_app = new DummyApplication();
	}
}
