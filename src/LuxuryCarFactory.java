//Abstract Factor Pattern File
public class LuxuryCarFactory implements VehicleManufacturerFactory {
	
	public Seat createSeat() {
		return new LeatherHeatedSeat();
	}

	public Wheel createWheel() {
		return new NineteenInchRim();
	}

	public Engine createEngine() {
		return new SixCylinderEngine();
	}

	public Sunroof createSunroof() {
		return new YesSunroof();
	}
}
