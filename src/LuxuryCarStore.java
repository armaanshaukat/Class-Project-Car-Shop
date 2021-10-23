//Abstract Factory Pattern File
public class LuxuryCarStore extends VehicleStore {
	
	protected Vehicle createVehicle(String item) {
		Vehicle vehicle = null;
		VehicleManufacturerFactory manufacturerFactory = new LuxuryCarFactory();
		
		if (item.equals("Luxury Car")) {
			vehicle = new CarVehicle(manufacturerFactory);
			vehicle.setName("Luxury Model Car");
		}
		
		return vehicle;
	}
}
