//Decorator Pattern File
public class Sensors extends FeatureDecorator {
	
	public Sensors(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Front and Rear Collision Senors and Blindspot Sensors";
	}
	
	public double cost() {
		return 325.0 + vehicleFeatures.cost();
	}
}