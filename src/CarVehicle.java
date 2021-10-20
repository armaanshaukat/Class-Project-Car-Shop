
public class CarVehicle extends Vehicle {
	
	VehicleManufacturerFactory manufacturerFactory;
		
	public CarVehicle(VehicleManufacturerFactory manufacturerFactory) {
			this.manufacturerFactory = manufacturerFactory;
	}
	
	void prepare() {
		System.out.println("Preparing to Order " + name);
		seat = manufacturerFactory.createSeat();
		wheel = manufacturerFactory.createWheel();
		engine = manufacturerFactory.createEngine();
		sunroof = manufacturerFactory.createSunroof();
	}
}