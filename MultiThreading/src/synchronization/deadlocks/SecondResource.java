package synchronization.deadlocks;

public class SecondResource {
	
	public synchronized void method1(FirstResource fr) {
		System.out.println("SR - M1");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Invoking FR-M2");
		fr.method2();
	}
	
	public synchronized void method2() {
		System.out.println("SR - M2");
	}
}
