
public class Navigation extends FeatureDecorator {
	
	public Navigation(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Navigation System";
	}
	
	public double cost() {
		return 1000.0 + vehicleFeatures.cost();
	}
}