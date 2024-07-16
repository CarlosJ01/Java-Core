package threadCommunication;

public class MainThread {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		synchronized (t) {
			System.out.println("Main Thread is going to wait");
			t.wait(); // Va a esperar hasta que el hilo lo notifique que termino
						// El hilo principal va estar en espera hasta que lo notifiquen
			System.out.println("Main Thread notified");
			System.out.println(t.total);			
		}
	}
	
}
