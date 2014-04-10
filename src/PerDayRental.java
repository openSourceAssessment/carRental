
public class PerDayRental extends PerKmRental{
	private static final int costPerDay = 100;
	private int numOfDay;
	private int totalCost;
	
	public PerDayRental(int numOfKm, int numOfDay) {
		super(numOfKm);
		this.numOfDay = numOfDay;		
	}

	public int getNumOfDay() {
		return numOfDay;
	}

	public void setNumOfDay(int numOfDay) {
		this.numOfDay = numOfDay;
	}
	
	public int calculateTotalCost(){
		totalCost = numOfDay * costPerDay;
		return totalCost;
	}
}
