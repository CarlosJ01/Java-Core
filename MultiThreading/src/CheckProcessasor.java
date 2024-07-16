
// Implementar la interface Runnable para hacer hilos (Preferibles)
public class CheckProcessasor implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Processed the checks");
	}
	
	public static void main(String[] args) {

		// Los hilos con esta forma se crean manualmente
		CheckProcessasor cp = new CheckProcessasor();
		Thread t = new Thread(cp);
		t.start();
	}
	
}
