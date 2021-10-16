
public class Magazine implements Observer, ObserverDisplay {
	private String manufacturer, model;
	private int year, price;
	private Subject lotData;
	
	public Magazine(Subject lotData) {
		this.lotData = lotData;
		lotData.registerObserver(this);
	}
	
	public void update(String manufacturer, String model, int year, int price) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.price = price;
		display();
	}
	
	public void display() {
		System.out.println("ARMAAN'S DEALERSHIP has a new vehicle available: " + manufacturer + " - " + model + " - "  + year + " - " + price);
		System.out.println("Visit ARMAANS'S DEALERSHIP for all features available with the vehicle");
	}

}
