package anonymousinner;

public class AnonymousRunnable {
	
	public static void main(String[] args) {
		// Clase anonima que implementa la interface Runnable
		Thread thread = new Thread(new Runnable() {	
			@Override
			public void run() {
				System.out.println("Anonymous Runnable implemmentation");
			}
		});
		
		thread.start();
	}
	
}
