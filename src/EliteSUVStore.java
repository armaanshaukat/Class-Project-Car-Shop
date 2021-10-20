
public class EliteSUVStore extends VehicleStore {
	
	protected Vehicle createVehicle(String item) {
		Vehicle vehicle = null;
		VehicleManufacturerFactory manufacturerFactory = new EliteSUVFactory();
		
		if (item.equals("Elite SUV")) {
			vehicle = new SUVVehicle(manufacturerFactory);
			vehicle.setName("Elite Model SUV");
		}
		
		return vehicle;
	}
}
