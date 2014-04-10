public class Service {
	private double currentKm;
	private double lastServiceKm;
	private int serviceTimes;
	
	/**
	 * Class constructor
	 * @param currentKm
	 */
	public Service(double currentKm, int serviceTimes){
		this.currentKm = currentKm;	
		this.serviceTimes = serviceTimes;		
	}
	
	/**
	 * Getter, Setter
	 * 
	 */
	public double getCurrentKm() {
		return currentKm;
	}

	public void setCurrentKm(double currentKm) {
		this.currentKm = currentKm;
	}

	public double getLastServiceKm() {
		return lastServiceKm;
	}

	public void setLastServiceKm(double lastServiceKm) {
		this.lastServiceKm = lastServiceKm;
	}

	public int getServiceTimes() {
		return serviceTimes;
	}

	public void setServiceTimes(int serviceTimes) {
		this.serviceTimes = serviceTimes;
	}	
	
	
	/**
	 * Class function
	 */	
	public void serviceKm(int serviceTimes){
		lastServiceKm = currentKm;
		this.serviceTimes = serviceTimes;
	}	
}
