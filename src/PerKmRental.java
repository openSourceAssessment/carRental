
public class PerKmRental {
	private static final int costPerKm = 1;
	private int numOfKm;
	private int totalCost;
	
	public PerKmRental(int numOfKm){
		this.numOfKm = numOfKm;
	}
	
	public int getNumOfKm() {
		return numOfKm;
	}

	public void setNumOfKm(int numOfKm) {
		this.numOfKm = numOfKm;
	}
	
	public int calculateTotalCost(){
		totalCost = numOfKm * costPerKm;
		return totalCost;
	}
}
