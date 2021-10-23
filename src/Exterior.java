//Decorator Pattern File 
public class Exterior extends VehicleFeatures {

	public Exterior() {
		description = "Exterior Features:";
	}
	
	public double cost() {
		return 0;
	}
}