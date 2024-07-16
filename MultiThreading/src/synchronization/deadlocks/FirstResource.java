package synchronization.deadlocks;

public class FirstResource {
	
	public synchronized void method1(SecondResource sr) {
		System.out.println("FR - M1");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Invoking SR-M2");
		sr.method2();
	}
	
	public synchronized void method2() {
		System.out.println("FR - M2");
	}
}
