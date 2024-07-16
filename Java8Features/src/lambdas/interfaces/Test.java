package lambdas.interfaces;

public class Test {
	
	public static void main(String[] args) {
		Runnable r = new MyRunnableImpl();
		Thread t = new Thread(r);
		t.start();
		
		// Implementacion con lamdas
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Lambda Thread");
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Maind Thread");
		}
		
	}
	
}
