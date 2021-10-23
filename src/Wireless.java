//Decorator Pattern File
public class Wireless extends FeatureDecorator {
	
	public Wireless(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Wireless Charger and Keyless Entry";
	}
	
	public double cost() {
		return 100.0 + vehicleFeatures.cost();
	}
}