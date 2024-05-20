package in.jtc.beans;

public interface Vehicle {
	
	   void cleanVehicle();   //by default public&abstract
       
	   default void sesor() {
		   System.out.println("Sensor functionality Added");
	   }
	   
	  default void startVehicle() {
		   System.out.println("Vehicle Started.......!!!!");
	   }
	  
	  static void fuelCheck() {
		  System.out.println("Checking the Fuel");
	  }
}
