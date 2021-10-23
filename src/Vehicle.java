//Abstract Factory Pattern File
public abstract class Vehicle {
	String name;
	
	Seat seat;
	Wheel wheel;
	Engine engine;
	Sunroof sunroof;
	
	abstract void prepare();
	
	void order() {
		System.out.println("Order Sent to Manufacturer");
	}
	
	void build() {
		System.out.println("Order Recieved by Manufacturer and Building in Progress");
	}
	
	void ship() {
		System.out.println("Order is Complete and is Being Shipped to the Dealership");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n----- " + name + " Stock Features -----\n");
		
		if (seat != null) {
			result.append(seat);
			result.append("\n");
		}
		
		if (wheel != null) {
			result.append(wheel);
			result.append("\n");
		}
		
		if (engine != null) {
			result.append(engine);
			result.append("\n");
		}
		
		if (sunroof != null) {
			result.append(sunroof);
			result.append("\n");
		}
		
		return result.toString();
	}
}
