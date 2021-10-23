//Abstract Factory Pattern File
public class EliteCarStore extends VehicleStore {

	protected Vehicle createVehicle(String item) {
		Vehicle vehicle = null;
		VehicleManufacturerFactory manufacturerFactory = new EliteCarFactory();
		
		if (item.equals("Elite Car")) {
			vehicle = new CarVehicle(manufacturerFactory);
			vehicle.setName("Elite Model Car");
		}
		
		return vehicle;
	}
}
