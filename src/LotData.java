//Observer Pattern File
import java.util.ArrayList;

public class LotData implements Subject {

	private ArrayList<Observer> subscribedObservers;
	private String manufacturer, model;
	private int year, price;
	
	public LotData() {
		subscribedObservers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		subscribedObservers.add(o);
	}

	public void removeObserver(Observer o) {
		subscribedObservers.remove(subscribedObservers.indexOf(o));
	}

	public void notifyObserver() {
		for (int i = 0; i < subscribedObservers.size(); i++ ) {
			Observer observer = (Observer)subscribedObservers.get(i);
			observer.update(manufacturer, model, year, price);
		}
	}
	
	public void addedAutomobile() {
		notifyObserver();
	}
	
	public void addedAutomobile(String manufacturer, String model, int year, int price) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.price = price;
		addedAutomobile();
	}
}