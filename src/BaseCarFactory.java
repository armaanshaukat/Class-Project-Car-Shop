
public class BaseCarFactory implements VehicleManufacturerFactory {
	
	public Seat createSeat() {
		return new ClothSeat();
	}

	public Wheel createWheel() {
		return new SixteenInchRim();
	}

	public Engine createEngine() {
		return new SixCylinderEngine();
	}

	public Sunroof createSunroof() {
		return new YesSunroof();
	}
}
