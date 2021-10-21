
public class BikeRack extends FeatureDecorator {
	
	public BikeRack(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Bike Rack";
	}
	
	public double cost() {
		return 250.0 + vehicleFeatures.cost();
	}
}