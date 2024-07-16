package threadCommunication;

public class MyThread extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child calculating the sum: ");
			for (int i = 1; i <= 100; i++) {
				total++;
			}
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.notify(); // Notifica que ya termino el proceso para que los demas sigan
		}
	}
}
