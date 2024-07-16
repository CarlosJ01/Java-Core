package synchronization.classlock;

public class DisplayMessage {
	
	// synchronized static => lo mismo que synchronized pero a nivel de clase
	// solo bloquea a los demas synchronized static y no a los normales o solo synchronized
	public synchronized static void sayHello(String name) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("How are you "+name);
			Thread.sleep(1000);
		}
	}
}
