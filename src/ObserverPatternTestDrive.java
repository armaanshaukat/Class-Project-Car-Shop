//Observer Pattern File
import java.util.Scanner;

public class ObserverPatternTestDrive {
	public static void main(String[] args) {
	
		LotData lotData = new LotData();
		Magazine autoTrader = new Magazine(lotData);
	
		lotData.addedAutomobile("Honda", "Accord", 2002, 16516);
		System.out.println();
		
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		
		System.out.print("Enter the manufacturer for your vehicle: ");
		String mfgName = input2.next();
		System.out.print("Enter the model of your vehicle: ");
		String modelName = input3.next();
		System.out.print("Enter the year of your vehicle: ");
		int mfgYear = input4.nextInt();
		System.out.print("Enter the wanted price of sale for your vehicle: ");
		int salePrice = input5.nextInt();
		System.out.println();
		
		lotData.addedAutomobile(mfgName, modelName, mfgYear, salePrice);
	}
}

// Observer Pattern Files - Subject, ObserverPatternTestDrive, ObserverDisplay, Observer, Magazine, LotData 