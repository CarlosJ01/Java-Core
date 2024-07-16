package synchronization.blocks;

public class DisplayMessage {
	public void sayHello(String name) throws InterruptedException {
		
		// Lo mismo pero a nivel de bloque de codigo, se pasa que nivel va a ser bloqueado class o object
		// cualquier hilo que entre al metodo puede ejecutar las lineas superiores
		// pero al momento de entrar al bloque se forma para que este este desocupado
		synchronized(DisplayMessage.class) {
			for (int i = 0; i < 10; i++) {
				System.out.println("How are you "+name);
				Thread.sleep(1000);
			}			
		}
		
	}
}
