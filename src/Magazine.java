//Observer Pattern File
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
		System.out.println("Sending the Following Vehicle Information to Our Subscribers: Manufacturer: " + manufacturer + " - Model: " + model + 
						   " - Year: "  + year + " - Price: " + price);
		System.out.println("Visit ARMAANS'S DEALERSHIP For Complete Vehicles Features List");
	}
}
