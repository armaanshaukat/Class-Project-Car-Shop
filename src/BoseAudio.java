//Decorator Pattern File
public class BoseAudio extends FeatureDecorator {
	
	public BoseAudio(VehicleFeatures vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	public String getDescription() {
		return vehicleFeatures.getDescription() + ", Premium Bose Audio System";
	}
	
	public double cost() {
		return 350.0 + vehicleFeatures.cost();
	}
}