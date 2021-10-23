//Abstract Factory Pattern File
public class BaseSUVFactory implements VehicleManufacturerFactory {

	public Seat createSeat() {
		return new ClothSeat();
	}

	public Wheel createWheel() {
		return new SeventeenInchRim();
	}

	public Engine createEngine() {
		return new FourCylinderEngine();
	}

	public Sunroof createSunroof() {
		return new NoSunroof();
	}
}