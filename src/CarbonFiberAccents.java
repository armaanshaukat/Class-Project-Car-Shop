
public class CarbonFiberAccents extends FeatureDecorator {
	
	public CarbonFiberAccents(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Carbon Fiber Accents and Trim";
	}
	
	public double cost() {
		return 200.0 + vehicleFeatures.cost();
	}
}