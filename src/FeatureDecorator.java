//Decorator Pattern File 
public abstract class FeatureDecorator extends VehicleFeatures {
	VehicleFeatures vehicleFeatures;
	
	public abstract String getDescription();
}
