
public class AddTruckInventory implements Automobile {
	static final int MAX_INVENTORY_SPACE = 50;
	int numberOfTrucks = 0;
	TruckInventory[] truckInventory;
	
	public AddTruckInventory() {
		truckInventory = new TruckInventory[MAX_INVENTORY_SPACE];
		
		addCar("Honda", "Pilot", 2021, "Leather Seats, Moon Roof, Navigation System", 23984);
		addCar("Toyota", "Highlander", 2001, "Navigation System, Sports Mode, Bose Audio System", 98724);
		addCar("Ford", "F150", 2021, "Leather Seats and Steering Wheel, Blind Spot Cameras, Sports Mode", 234987);
		
	}
	
	public void addCar(String manufacturer, String model, int year, String features, int price) {
		TruckInventory trucksInventory = new TruckInventory(manufacturer, model, year, features, price);
		truckInventory[numberOfTrucks] = trucksInventory;
		numberOfTrucks = numberOfTrucks + 1;
	}
	
	public TruckInventory[] getTruckInventory() {
		return truckInventory;
	}

	public Iterator createIterator() {
		return  new TruckInventoryIterator(truckInventory);
	}
}
