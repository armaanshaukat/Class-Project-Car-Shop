//Abstract Factory Pattern File
import java.util.Scanner;

public class AbstractFactoryPatternTestDrive {

	public static void main(String[] args) {
		VehicleStore order1 = new BaseSUVStore();
		VehicleStore eliteSUV = new EliteSUVStore();
		VehicleStore luxurySUV = new LuxurySUVStore();
		
		VehicleStore baseCar = new BaseCarStore();
		VehicleStore eliteCar = new EliteCarStore();
		VehicleStore luxuryCar = new LuxuryCarStore();
		
		Vehicle vehicle = luxuryCar.orderVehicle("Luxury Car");
		System.out.println(vehicle);
		
		
		while (true) {
			Scanner input6 = new Scanner(System.in);
			System.out.print("Enter your option: ");
			int trim = input6.nextInt();
			
			if (trim == 1) {
				Vehicle vehicle2 = baseCar.orderVehicle("Base Car");
				System.out.println(vehicle2);
			}
			
			if (trim == 2) {
				Vehicle vehicle3 = eliteCar.orderVehicle("Elite Car");
				System.out.println(vehicle3);
			}
			
			if (trim == 3) {
				Vehicle vehicle4 = luxuryCar.orderVehicle("Luxury Car");
				System.out.println(vehicle4);
			}
			
			if (trim == 4 ) {
				break;
			}
		}
	}
}

// Abstract Factory Pattern Files - AbstractFactoryPatternTestDrive, BaseCarFactory, BaseCarStore, BaseSUVFactory, BaseSUVStore, EliteCarFactory, EliteCarStore,
// EliteSUVFactory, EliteSUVStore, LuxuryCarFactory, LuxuryCarStore, LuxurySUVFactory, LuxurySUVStore, Seat, ClothSeat, LeatherSeat, LeatherHeatedSeat, CarVehicle,
// Engine, FourCylinderEngine, SixCylinderEngine, NineteenInchRim, SixteenInchRim, SeventeenInchRim, TwentyTwoInchRim, Wheel, Sunroof, YesSunroof, NoSunroof,SUVVehicle,
// Vehicle, VehicleManufacturerFactory, VehicleStore