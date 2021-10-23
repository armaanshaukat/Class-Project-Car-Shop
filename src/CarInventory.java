//Iterator Pattern File
public class CarInventory {
	String manufacturer;
	String model;
	int year;
	String features;
	int price;
	
	public CarInventory(String manufacturer, String model, int year, String features, int price) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.features = features;
		this.price = price;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getFeatures() {
		return features;
	}
	
	public int getPrice() {
		return price;
	}
}
