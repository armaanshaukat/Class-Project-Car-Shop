//Iterator Pattern File
public class IteratorPatternTestDrive {
	public static void main(String[] args) {
		AddCarInventory addCarInventory = new AddCarInventory();
		AddTruckInventory addTruckInventory = new AddTruckInventory();
		
		InventoryPrinter inventoryPrinter = new InventoryPrinter(addCarInventory, addTruckInventory);
		
		inventoryPrinter.printInventory();
	}
}

// Iterator Pattern Files - AddCarInventory, AddTruckInventory, Automobile, CarInventory, CarInventoryIterator, InventoryPrinter, Iterator,
// TruckInventory, TruckInventoryIterator
