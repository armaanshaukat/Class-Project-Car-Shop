
public class AbstractFactoryTest {

	public static void main(String[] args) {
		VehicleStore order1 = new BaseSUVStore();
		VehicleStore eliteSUV = new EliteSUVStore();
		VehicleStore luxurySUV = new LuxurySUVStore();
		
		VehicleStore baseCar = new BaseCarStore();
		VehicleStore eliteCar = new EliteCarStore();
		VehicleStore luxuryCar = new LuxuryCarStore();
		
		Vehicle vehicle = luxuryCar.orderVehicle("Luxury Car");
		System.out.println(vehicle);
	}
}
