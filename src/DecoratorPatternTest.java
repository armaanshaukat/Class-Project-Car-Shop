public class DecoratorPatternTest {

	public static void main(String[] args) {
		VehicleFeatures feature = new Technology();
		
		feature = new HeatedSteeringWheel(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new LeatherGearShift(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());

		feature = new CarbonFiberAccents(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());

		feature = new BoseAudio(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new BodyKit(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new LEDLights(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new Tints(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new BikeRack(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new Cameras(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new Wireless(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new Sensors(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
		
		feature = new Navigation(feature);
		System.out.println(feature.getDescription() + " $" + feature.cost());
	}
}