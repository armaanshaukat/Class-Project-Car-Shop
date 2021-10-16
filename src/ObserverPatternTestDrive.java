
public class ObserverPatternTestDrive {
	public static void main(String[] args) {
	
		LotData lotData = new LotData();
		
		Magazine autoTrader = new Magazine(lotData);
	
		lotData.addedAutomobile("Honda", "Accord", 2002, 16516);
	}
}

// Observer Pattern Files - Subject.java, ObserverPatternTestDrive.java, ObserverDisplay.java, Observer.java, Magazine.java, LotData.java, 