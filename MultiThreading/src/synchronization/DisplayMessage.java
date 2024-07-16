package synchronization;

public class DisplayMessage {
	
	// synchronized => Hace que solo un hilo a la vez tenga acceso al metodo
	// los demas deberan esperar a que este desocupado, como una cola, tmabie
	// deniega el acceso a los demas metodos synchronized cuando uno esta ocupado
	// todo sobre el mismo objeto no la clase
	public synchronized void sayHello(String name) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("How are you "+name);
			Thread.sleep(1000);
		}
	}
}
