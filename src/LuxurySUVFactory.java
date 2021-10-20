
public class LuxurySUVFactory implements VehicleManufacturerFactory {

	public Seat createSeat() {
		return new LeatherHeatedSeat();
	}

	public Wheel createWheel() {
		return new TwentyTwoInchRim();
	}

	public Engine createEngine() {
		return new SixCylinderEngine();
	}

	public Sunroof createSunroof() {
		return new YesSunroof();
	}
}
