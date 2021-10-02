
public class InventoryPrinter {
	AddCarInventory addCarInventory;
	
	public InventoryPrinter(AddCarInventory addCarInventory) {
		this.addCarInventory = addCarInventory;
	}
	
	public void printInventory() {
		Iterator InventoryIterator = addCarInventory.createIterator();
		printInventory(InventoryIterator);
	}
	
	public void printInventory(Iterator iterator) {
		System.out.println("Welcome to Armaan's Car Mall");
		System.out.println("Select a car to test drive and buy");
		
		while(iterator.hasNext()) {
			CarInventory carInventory = (CarInventory)iterator.next();
			System.out.print(carInventory.getManufacturer() + " " + carInventory.getModel() + " " + carInventory.getYear() + " " +
			carInventory.getFeatures() + " ");
			System.out.println(+ carInventory.getPrice());
		}
		System.out.println();
	}
}
