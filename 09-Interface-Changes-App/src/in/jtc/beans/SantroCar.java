package in.jtc.beans;

public class SantroCar implements Vehicle{
	
	public void cleanVehicle() {
		System.out.println("SantroCar is getting Cleaned");
	}
	
	 

	@Override
	public void sesor() {
		System.out.println("Overriden Sensor Method");
	}
	

}
