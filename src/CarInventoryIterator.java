
public class CarInventoryIterator implements Iterator {

	CarInventory[] inventory;
	int position = 0;
	
	public CarInventoryIterator(CarInventory[] carInventory) {
		this.inventory = carInventory;
	}
	
	public boolean hasNext() {
		if (position >= inventory.length || inventory[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		CarInventory carInventory = inventory[position];
		position = position + 1;
		return carInventory;
	}
}