//Decorator Pattern File
import java.util.Scanner;

public class DecoratorPatternTestDrive {

	public static void main(String[] args) {
		VehicleFeatures feature = new Technology();
		
		//feature = new HeatedSteeringWheel(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new LeatherGearShift(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());

		//feature = new CarbonFiberAccents(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());

		//feature = new BoseAudio(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new BodyKit(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new LEDLights(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new Tints(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new BikeRack(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new Cameras(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new Wireless(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new Sensors(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		//feature = new Navigation(feature);
		//System.out.println(feature.getDescription() + " $" + feature.cost());
		
		while (true) {
			System.out.println("\nSelect Dealership Interior Options to Add on the Stock Vehicle: ");
			System.out.println("1. Heated Leather Steering Wheel");
			System.out.println("2. Leather Gear Shift");
			System.out.println("3. Carbon Fiber Accents");
			System.out.println("4. Bose Audio System");
			System.out.println("5. Exit Interior Options");
		
			Scanner input7 = new Scanner(System.in);
			System.out.print("Selection an option: ");
			int interiorOption = input7.nextInt();
			System.out.println();
		
			if (interiorOption == 1) {
				feature = new HeatedSteeringWheel(feature);
				System.out.println(feature.getDescription() + " $" + feature.cost());
			}
			
			if (interiorOption == 2) {
				feature = new LeatherGearShift(feature);
				System.out.println(feature.getDescription() + " $" + feature.cost());
			}
			
			if (interiorOption == 3) {
				feature = new CarbonFiberAccents(feature);
				System.out.println(feature.getDescription() + " $" + feature.cost());
			}
			
			if (interiorOption == 4) {
				feature = new BoseAudio(feature);
				System.out.println(feature.getDescription() + " $" + feature.cost());
			}
			
			if (interiorOption == 5) {
				break;
		}
	}
  }
}

// Decorator Pattern File - BikeRack, BodyKit, BoseAudio, Cameras, CarbonFiberAccents, DecoratorPatternTestDrive, Exterior, FeatureDecorator, HeatedSteeringWheel,
// Interior, LeatherGearShift, LEDLights, Navigation, Sensors, Technology, Tints, VehicleFeatures, Wireless