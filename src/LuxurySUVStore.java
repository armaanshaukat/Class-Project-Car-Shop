
public class LuxurySUVStore extends VehicleStore {

	protected Vehicle createVehicle(String item) {
		Vehicle vehicle = null;
		VehicleManufacturerFactory manufacturerFactory = new LuxurySUVFactory();
		
		if (item.equals("Luxury SUV")) {
			vehicle = new SUVVehicle(manufacturerFactory);
			vehicle.setName("Luxury Model SUV");
		}
		
		return vehicle;
	}
}
