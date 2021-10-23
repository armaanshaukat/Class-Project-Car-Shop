//Decorator Pattern File
public class Cameras extends FeatureDecorator {
	
	public Cameras(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Rearview and Dash Cameras";
	}
	
	public double cost() {
		return 150.0 + vehicleFeatures.cost();
	}
}