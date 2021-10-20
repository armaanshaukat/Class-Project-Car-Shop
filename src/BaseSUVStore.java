
public class BaseSUVStore extends VehicleStore {

	protected Vehicle createVehicle(String item) {
		Vehicle vehicle = null;
		VehicleManufacturerFactory manufacturerFactory = new BaseSUVFactory();
		
		if (item.equals("Base SUV")) {
			vehicle = new SUVVehicle(manufacturerFactory);
			vehicle.setName("Base Model SUV");
		}
		
		return vehicle;
	}
}
