//Decorator Pattern File
public class LeatherGearShift extends FeatureDecorator {
	
	public LeatherGearShift(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Leather Wrapped Gear Shift";
	}
	
	public double cost() {
		return 50.0 + vehicleFeatures.cost();
	}
}