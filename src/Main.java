import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Vehicle v1 = new Vehicle("Audi", "A6", 2014, new Journey(), new FuelPurchase(62, 75));
		Vehicle v2 = new Vehicle("Jaguar", "X200", 2013, new Journey(), new FuelPurchase(72, 82));
		Vehicle v3 = new Vehicle("Mercedes-Benz", "CL600 C200", 2012, new Journey(), new FuelPurchase(100, 100));		
		
		System.out.println("Original statistics:");
		System.out.println("====================");
		
		v1.printDetails();
		v2.printDetails();
		v3.printDetails();
		
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v1.addKilometers(new Random().nextInt(100));
			v2.addKilometers(new Random().nextInt(100));
			v3.addKilometers(new Random().nextInt(100));
		}
		
		System.out.println("Final statistics:");
		System.out.println("=================");
							
		//v1.vehicleService();		
		v1.printDetails();
		v2.printDetails();
		v3.printDetails();		
	}
}
