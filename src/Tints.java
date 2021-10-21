
public class Tints extends FeatureDecorator {
	
	public Tints(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Front Window and Rear Window and Rear Windshield Tints (60%)";
	}
	
	public double cost() {
		return 425.0 + vehicleFeatures.cost();
	}
}