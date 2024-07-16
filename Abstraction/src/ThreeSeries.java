
// Si una clase final hereda de una abstracta tiene que implementar todos los 
// metodos abstractos del padre
public final class ThreeSeries extends BMW {

	@Override
	void accelerate() {
		System.out.println("Inside ThreeSeries Acelerate");
	}
	
}
