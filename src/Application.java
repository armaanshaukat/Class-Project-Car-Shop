import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		//Iterator Pattern to Print Current Dealer Inventory
		AddCarInventory addCarInventory = new AddCarInventory();
		AddTruckInventory addTruckInventory = new AddTruckInventory();
		InventoryPrinter inventoryPrinter = new InventoryPrinter(addCarInventory, addTruckInventory);
		inventoryPrinter.printInventory();
		
		//Observer Pattern Objects Created
		LotData lotData = new LotData();
		Magazine autoTrader = new Magazine(lotData);
		
		//Abstract Factory Pattern Product Objects Created
		VehicleStore baseSUV = new BaseSUVStore();
		VehicleStore eliteSUV = new EliteSUVStore();
		VehicleStore luxurySUV = new LuxurySUVStore();
		VehicleStore baseCar = new BaseCarStore();
		VehicleStore eliteCar = new EliteCarStore();
		VehicleStore luxuryCar = new LuxuryCarStore();
		
		//Decorator Pattern Object Created
		VehicleFeatures feature = new Technology();
		
		while (true) {
			System.out.println("\nSelect an option:");
			System.out.println("1. Buy a Vehicle on the Lot");
			System.out.println("2. Sell Your Vehicle to Us");
			System.out.println("3. Buy a Car from the Manufacturer");
			System.out.println("4. Buy a SUV from the Manufacturer");
			System.out.println("5. Quit Application");
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your option: ");
			int option =input.nextInt();
		
			if (option == 1) {
				System.out.println("Please wait for a sales representative");
			}
			
			//Observer Pattern to send updates about new vehicle available for sale to magazines subscribed
			if (option == 2) {
				Scanner input2 = new Scanner(System.in);
				Scanner input3 = new Scanner(System.in);
				Scanner input4 = new Scanner(System.in);
				Scanner input5 = new Scanner(System.in);
			
				System.out.print("Enter the manufacturer for your vehicle: ");
				String mfgName = input2.next();
				System.out.print("Enter the model of your vehicle: ");
				String modelName = input3.next();
				System.out.print("Enter the year of your vehicle: ");
				int mfgYear = input4.nextInt();
				System.out.print("Enter the wanted price of sale for your vehicle: ");
				int salePrice = input5.nextInt();
			
				lotData.addedAutomobile(mfgName, modelName, mfgYear, salePrice);
			}
		
			//Abstract Factory Pattern to Create a New Car 
			if (option == 3) {
				System.out.println("Select a trim: ");
				System.out.println("1. Base Trim Car");
				System.out.println("2. Elite Trim Car");
				System.out.println("3. Luxury Trim Car");
			
				Scanner input6 = new Scanner(System.in);
				System.out.print("Enter your option: ");
				int trim = input6.nextInt();
			
				if (trim == 1) {
					Vehicle vehicle = baseCar.orderVehicle("Base Car");
					System.out.println(vehicle);
				}
			
				if (trim == 2) {
					Vehicle vehicle = eliteCar.orderVehicle("Elite Car");
					System.out.println(vehicle);
				}
			
				if (trim == 3) {
					Vehicle vehicle = luxuryCar.orderVehicle("Luxury Car");
					System.out.println(vehicle);
				}
			
			//Decorator Pattern to Select Interior Features
				while (true) {
					System.out.println("Select Dealership Interior Options to Add on the Stock Vehicle: ");
					System.out.println("1. Heated Leather Steering Wheel");
					System.out.println("2. Leather Gear Shift");
					System.out.println("3. Carbon Fiber Accents");
					System.out.println("4. Bose Audio System");
					System.out.println("5. Exit Interior Options");
			
					Scanner input7 = new Scanner(System.in);
					System.out.print("Selection an option: ");
					int interiorOption = input7.nextInt();
				
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
			
				//Decorator Pattern to Select Exterior Features 
				while (true) {
					System.out.println("Select Dealership Exterior Options to Add on the Stock Vehicle: ");
					System.out.println("1. Body Kit");
					System.out.println("2. LED Head Lights");
					System.out.println("3. Window Tints (60%)");
					System.out.println("4. Bike Rack");
			
					Scanner input8 = new Scanner(System.in);
					System.out.print("Selection an option: ");
					int exteriorOption = input8.nextInt();
			
					if (exteriorOption == 1) {
						feature = new BodyKit(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
				
					if (exteriorOption == 2) {
						feature = new LEDLights(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}	
				
					if (exteriorOption == 3) {
						feature = new Tints(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
				
					if (exteriorOption == 4) {
						feature = new BikeRack(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
				
					if (exteriorOption == 5) {
						break;
					}
				}
			
				//Decorator Pattern to Select Technology Features 
				while (true) {
					System.out.println("Select Dealership Technology Options to Add on the Stock Vehicle: ");
					System.out.println("1. Camera Systems");
					System.out.println("2. Wireless Charger and Connectivity");
					System.out.println("3. Proximity Sensors");
					System.out.println("4. Navigation System");
				
					Scanner input9 = new Scanner(System.in);
					System.out.print("Selection an option: ");
					int technologyOption = input9.nextInt();
			
					if (technologyOption == 1) {
						feature = new Cameras(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
				
					if (technologyOption == 2) {
						feature = new Wireless(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
				
					if (technologyOption == 3) {
						feature = new Sensors(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
				
					if (technologyOption == 4) {
						feature = new Navigation(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
				
					if (technologyOption == 5) {
						break;
					}
				}
			}
		
			//Abstract Factory Pattern to Create a New SUV
			if (option == 4) {
				System.out.println("Select a trim: ");
				System.out.println("1. Base Trim SUV");
				System.out.println("2. Elite Trim SUV");
				System.out.println("3. Luxury Trim SUV");
			
				Scanner input10 = new Scanner(System.in);
				System.out.print("Enter your option: ");
				int trim = input10.nextInt();
			
				if (trim == 1) {
					Vehicle vehicle = baseSUV.orderVehicle("Base SUV");
					System.out.println(vehicle);
				}
				
				if (trim == 2) {
					Vehicle vehicle = eliteSUV.orderVehicle("Elite SUV");
					System.out.println(vehicle);
				}
				
				if (trim == 3) {
					Vehicle vehicle = luxurySUV.orderVehicle("Luxury SUV");
					System.out.println(vehicle);
				}
			
				//Decorator Pattern to Select Interior Features 
				while (true) {
					System.out.println("Select Dealership Interior Options to Add on the Stock Vehicle: ");
					System.out.println("1. Heated Leather Steering Wheel");
					System.out.println("2. Leather Gear Shift");
					System.out.println("3. Carbon Fiber Accents");
					System.out.println("4. Bose Audio System");
					System.out.println("5. Exit Interior Options");
				
					Scanner input11 = new Scanner(System.in);
					System.out.print("Selection an option: ");
					int interiorOption = input11.nextInt();
				
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
			
				//Decorator Pattern to Select Exterior Features 
				while (true) {
					System.out.println("Select Dealership Exterior Options to Add on the Stock Vehicle: ");
					System.out.println("1. Body Kit");
					System.out.println("2. LED Head Lights");
					System.out.println("3. Window Tints (60%)");
					System.out.println("4. Bike Rack");
				
					Scanner input12 = new Scanner(System.in);
					System.out.print("Selection an option: ");
					int exteriorOption = input12.nextInt();
				
					if (exteriorOption == 1) {
						feature = new BodyKit(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (exteriorOption == 2) {
						feature = new LEDLights(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (exteriorOption == 3) {
						feature = new Tints(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (exteriorOption == 4) {
						feature = new BikeRack(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (exteriorOption == 5) {
						break;
					}
				}
				
				//Decorator Pattern to Select Technology Features 
				while (true) {
					System.out.println("Select Dealership Technology Options to Add on the Stock Vehicle: ");
					System.out.println("1. Camera Systems");
					System.out.println("2. Wireless Charger and Connectivity");
					System.out.println("3. Proximity Sensors");
					System.out.println("4. Navigation System");
					
					Scanner input13 = new Scanner(System.in);
					System.out.print("Selection an option: ");
					int technologyOption = input13.nextInt();
				
					if (technologyOption == 1) {
						feature = new Cameras(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (technologyOption == 2) {
						feature = new Wireless(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (technologyOption == 3) {
						feature = new Sensors(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (technologyOption == 4) {
						feature = new Navigation(feature);
						System.out.println(feature.getDescription() + " $" + feature.cost());
					}
					
					if (technologyOption == 5) {
						break;
					}
				}
				
			}
			
			if (option == 5) {
				break;
			}
		}	
	}
}