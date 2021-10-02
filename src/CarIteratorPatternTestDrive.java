
public class CarIteratorPatternTestDrive {
	public static void main(String[] args) {
		AddCarInventory addCarInventory = new AddCarInventory();
		
		InventoryPrinter inventoryPrinter = new InventoryPrinter(addCarInventory);
		
		inventoryPrinter.printInventory();
	}
}
