package sealed;

public non-sealed class FiveSeries implements BMWSeries {
	
	public int start() {
		// Local record sin metodos
		record PickupData(int pickupTime) {}
		return new PickupData(10).pickupTime();
	}
	
}
