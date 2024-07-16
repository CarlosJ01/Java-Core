package defaultmethods;

// Si en las interfaces tenemos 2 default method llamados igual no sabran cual heredar por que la clase debera
// de definir su propio methodo sobreescribiendolo
public class B implements A, X {
	
	@Override
	public void m1() {
		System.out.println("m1 => B");
	}
	
}
