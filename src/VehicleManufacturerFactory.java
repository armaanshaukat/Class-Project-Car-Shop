//Abstract Factory Pattern File
public interface VehicleManufacturerFactory {
	public Seat createSeat();
	public Wheel createWheel();
	public Engine createEngine();
	public Sunroof createSunroof();
}
