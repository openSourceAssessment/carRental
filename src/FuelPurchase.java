
public class FuelPurchase {
	private double	fuelEconomy;
	private double	fuelLiters;
	private double	fuelCost;

	public FuelPurchase(double fuelCost, double fuelLiters) {
		this.fuelCost = fuelCost;
		this.fuelLiters = fuelLiters;
	}

	public double getFuelEconomy() {
		return fuelEconomy;
	}

	public void setFuelEconomy(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}
	
	/**
	 * Getter, Setter
	 * @return
	 */
	public double getFuelLiters() {
		return fuelLiters;
	}

	public void setFuelLiters(double fuelLiters) {
		this.fuelLiters = fuelLiters;
	}

	public double getFuelCost() {
		return fuelCost;
	}

	public void setFuelCost(double fuelCost) {
		this.fuelCost = fuelCost;
	}	
	
	
}
