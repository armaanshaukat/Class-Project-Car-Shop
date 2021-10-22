import java.util.Scanner;

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
		
		Scanner input6 = new Scanner(System.in);
		System.out.print("Enter your option: ");
		int trim = input6.nextInt();
		
		if (trim == 1) {
			Vehicle vehicle2 = baseCar.orderVehicle("Base Car");
		}
		
		if (trim == 2) {
			Vehicle vehicle2 = eliteCar.orderVehicle("Elite Car");
		}
		
		if (trim == 3) {
			Vehicle vehicle2 = luxuryCar.orderVehicle("Luxury Car");
		}
	}
}
