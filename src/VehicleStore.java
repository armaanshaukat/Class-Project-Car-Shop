//Abstract Factory Pattern File
public abstract class VehicleStore {
	
	protected abstract Vehicle createVehicle(String item);
	
	public Vehicle orderVehicle(String type) {
		Vehicle vehicle = createVehicle(type);
		vehicle.prepare();
		vehicle.order();
		vehicle.build();
		vehicle.ship();
		return vehicle;
	}
}
