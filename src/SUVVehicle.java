//Abstract Factory Pattern File
public class SUVVehicle extends Vehicle {
	VehicleManufacturerFactory manufacturerFactory;
	
	public SUVVehicle(VehicleManufacturerFactory manufacturerFactory) {
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