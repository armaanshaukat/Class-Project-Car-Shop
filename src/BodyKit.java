
public class BodyKit extends FeatureDecorator {
	
	public BodyKit(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Body Kit (front and rear bumpers, side molds and spoiler)";
	}
	
	public double cost() {
		return 1200.0 + vehicleFeatures.cost();
	}
}