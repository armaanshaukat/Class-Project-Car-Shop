
public abstract class Vehicle {
	String name;
	
	Seat seat;
	Wheel wheel;
	Engine engine;
	Sunroof sunroof;
	
	abstract void prepare();
	
	void order() {
		System.out.println();
	}
	
	void build() {
		System.out.println();
	}
	
	void ship() {
		System.out.println();
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name);
		
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
