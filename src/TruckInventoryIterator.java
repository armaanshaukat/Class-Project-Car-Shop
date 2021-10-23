//Iterator Pattern File
public class TruckInventoryIterator implements Iterator {

	TruckInventory[] inventory;
	int position = 0;
	
	public TruckInventoryIterator(TruckInventory[] truckInventory) {
		this.inventory = truckInventory;
	}
	
	public boolean hasNext() {
		if (position >= inventory.length || inventory[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		TruckInventory truckInventory = inventory[position];
		position = position + 1;
		return truckInventory;
	}
}