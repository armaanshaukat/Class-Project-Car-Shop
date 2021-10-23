//Decorator Pattern File
public class HeatedSteeringWheel extends FeatureDecorator {
	
	public HeatedSteeringWheel(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Heated Steering Wheel";
	}
	
	public double cost() {
		return 100.0 + vehicleFeatures.cost();
	}
}