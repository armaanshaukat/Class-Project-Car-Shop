//Decorator Pattern File
public class LEDLights extends FeatureDecorator {
	
	public LEDLights(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", LED Headlights";
	}
	
	public double cost() {
		return 500.0 + vehicleFeatures.cost();
	}
}