//Abstract Factory Pattern File
public class EliteSUVFactory implements VehicleManufacturerFactory {
	
	public Seat createSeat() {
		return new LeatherSeat();
	}

	public Wheel createWheel() {
		return new NineteenInchRim();
	}

	public Engine createEngine() {
		return new FourCylinderEngine();
	}

	public Sunroof createSunroof() {
		return new YesSunroof();
	}
}
