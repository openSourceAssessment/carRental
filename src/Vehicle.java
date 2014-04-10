
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
		System.out.println("Vehicle object");
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
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
		System.out.println("Vehicle object");
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
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

	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Model: " + model);
		System.out.println("Make Year: " + makeYear);
		System.out.println("Total Kilometers Travelled: " + journey.getKilometers());
		System.out.println("Total Services: " + journey.getTotalServices());
		System.out.println();
		printServie();
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
	
	public void printServie(){
		if(journey.getKilometers() > service.getLastServiceKm()){
			System.out.println("Error: Vehicle must be serviced first");
		}
		
		System.out.println("Vehicle: " + this.manufacturer + " " + this.model + " (" + this.makeYear + " model)");
		
		if(journey.getKilometers() == 0){
			System.out.println("No travel has been recorded yet.");
			System.out.println("The vehicle has not yet been serviced.");
			
		} else {
			if(journey.getKilometers() == service.getLastServiceKm()){
				System.out.println(journey.getKilometers() + "km travelled raising " );
				System.out.println("The vehicle was last serviced at " + service.getLastServiceKm() + "km.");				
			} else {
				System.out.println(journey.getKilometers() + "km travelled raising " );
				System.out.println("The vehicle has not yet been serviced.");	
			}					
		}
		System.out.println();
	}
	
	public void vehicleService(){
		service.serviceKm(journey.getTotalServices());
	}
}
