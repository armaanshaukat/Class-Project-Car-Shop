//Abstract Factory Pattern File
public class EliteCarFactory implements VehicleManufacturerFactory {
	
	public Seat createSeat() {
		return new LeatherSeat();
	}

	public Wheel createWheel() {
		return new SeventeenInchRim();
	}

	public Engine createEngine() {
		return new FourCylinderEngine();
	}

	public Sunroof createSunroof() {
		return new YesSunroof();
	}
}
