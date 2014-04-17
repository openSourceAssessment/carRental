
public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;

	private Journey			journey;
	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;
	private Service 		service;

	/**
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(0, 0);
		service = new Service(journey.getKilometers(), journey.getTotalServices());		
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(62, 75);
		service = new Service(journey.getKilometers(), journey.getTotalServices());
	}
	
	/** Jinho
	 * Class constructor 
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 * @param journey
	 * @param fuelPurchase
	 */
	public Vehicle(String manufacturer, String model, int makeYear, Journey journey, FuelPurchase fuelPurchase) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		this.journey = journey;  
		this.fuelPurchase = fuelPurchase;
		service = new Service(journey.getKilometers(), journey.getTotalServices());
	}

	/** Luna update print details
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Vehicle: " + manufacturer + " " + model + " (" + makeYear + " model)");
				
		if(journey.getKilometers() == 0){
			
			System.out.println(journey.getKilometers() + "km travelled requiring 0 litres of fuel at a cost of $0");
			System.out.println("No travel has been recorded yet.");
			System.out.println("No fuel has been purchased yet.");
			
		} else {
			
			System.out.println(journey.getKilometers() + "km travelled requiring " + fuelPurchase.getFuelLiters() 
					+ " litres of fuel at a cost of $" + fuelPurchase.getFuelCost());			
			System.out.printf("This vehicle achieved a fuel economy of %.1f litres/100km.\n", (fuelPurchase.getFuelLiters()*100)/journey.getKilometers());
			System.out.println("The vehicle shoud have undergone " + journey.getTotalServices() + " service(s).");
			System.out.printf("The average cost of fuel was $ %.2f per litre.\n", fuelPurchase.getFuelCost()/fuelPurchase.getFuelLiters());
		}		
		System.out.println();
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
		service.setCurrentKm(journey.getKilometers());
	}

	public void vehicleService(){
		service.serviceKm(journey.getTotalServices());
	}
}
