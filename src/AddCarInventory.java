//Iterator Pattern File
public class AddCarInventory implements Automobile {
	static final int MAX_INVENTORY_SPACE = 50;
	int numberOfCars = 0;
	CarInventory[] carInventory;
	
	public AddCarInventory() {
		carInventory = new CarInventory[MAX_INVENTORY_SPACE];
		
		addCar("Honda", "Accord", 2021, "Leather Seats, Moon Roof, Navigation System", 23984);
		addCar("Dodge", "Viper", 2001, "Navigation System, Sports Mode, Bose Audio System", 98724);
		addCar("Totota", "Supra", 2021, "Leather Seats and Steering Wheel, Blind Spot Cameras, Sports Mode", 234987);	
	}
	
	public void addCar(String manufacturer, String model, int year, String features, int price) {
		CarInventory carsInventory = new CarInventory(manufacturer, model, year, features, price);
		carInventory[numberOfCars] = carsInventory;
		numberOfCars = numberOfCars + 1;
	}
	
	public CarInventory[] getCarInventory() {
		return carInventory;
	}

	public Iterator createIterator() {
		return  new CarInventoryIterator(carInventory);
	}
}
