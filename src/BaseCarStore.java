
public class BaseCarStore extends VehicleStore {
	
	protected Vehicle createVehicle(String item) {
		Vehicle vehicle = null;
		VehicleManufacturerFactory manufacturerFactory = new BaseCarFactory();
		
		if (item.equals("Base Car")) {
			vehicle = new CarVehicle(manufacturerFactory);
			vehicle.setName("Base Model Car");
		}
		return vehicle;
	}
}
