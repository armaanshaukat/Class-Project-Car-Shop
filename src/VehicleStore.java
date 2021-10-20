
public abstract class VehicleStore {
	
	protected abstract Vehicle createVehicle(String item);
	
	public Vehicle orderVehicle(String type) {
		Vehicle vehicle = createVehicle(type);
		System.out.println("VehicleStore");
		vehicle.prepare();
		vehicle.order();
		vehicle.build();
		vehicle.ship();
		return vehicle;
	}
}
