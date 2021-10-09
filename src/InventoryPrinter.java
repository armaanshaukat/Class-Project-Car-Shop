
public class InventoryPrinter {
	AddCarInventory addCarInventory;
	AddTruckInventory addTruckInventory;
	
	public InventoryPrinter(AddCarInventory addCarInventory, AddTruckInventory addTruckInventory) {
		this.addCarInventory = addCarInventory;
		this.addTruckInventory = addTruckInventory;
	}
	
	public void printInventory() {
		Iterator carInventoryIterator = addCarInventory.createIterator();
		Iterator truckInventoryIterator = addTruckInventory.createIterator();
		printInventory(carInventoryIterator, truckInventoryIterator);
	}
	
	public void printInventory(Iterator iterator, Iterator iterator2) {
		System.out.println("WELCOME TO ARMAAN's DEALERSHIP!\n");
				
		System.out.println("CARS (SEDAN AND COUPE) INVENTORY");
		System.out.println("MAKE - MODEL - YEAR - KEY FEATURES - PRICE ($)");
		while(iterator.hasNext()) {
			CarInventory carInventory = (CarInventory)iterator.next();
			System.out.print(carInventory.getManufacturer() + " - " + carInventory.getModel() + " - " + carInventory.getYear() + " - " +
			carInventory.getFeatures() + " - ");
			System.out.println(+ carInventory.getPrice());
		}
		System.out.println();
		
		System.out.println("TRUCKS (SUV AND PICKUP)");
		System.out.println("MAKE - MODEL - YEAR - KEY FEATURES - PRICE ($)");
		while(iterator2.hasNext()) {
			TruckInventory truckInventory = (TruckInventory)iterator2.next();
			System.out.print(truckInventory.getManufacturer() + " - " + truckInventory.getModel() + " - " + truckInventory.getYear() + " - " +
			truckInventory.getFeatures() + " - ");
			System.out.println(+ truckInventory.getPrice());
		}
	}
}
