// Una thread es un único flujo de control dentro de un programa. Que pueden
// ejecutarce en paralelos con otros, todos los programas normales corren en
// un solo hilo principal al cual se le pueden añadir secundarios

// Hereda de la clase Thread para hacer que esta clase corra un hilo
public class MultiThreaded extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt =  new MultiThreaded();
		mt.setPriority(MAX_PRIORITY); // Cambia la prioridad del hilo en escala
									// 1 - 10, donde 10 -> max, 5 => normal, 1 => min
		mt.setName("mt");
		mt.start(); // Inicia el hilo, tambien ejecuta el metodo run
		
		
		MultiThreaded mt1 =  new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
		
		
		System.out.println(Thread.currentThread().getName());
		
//		// Obtener el hilo actual
//		Thread currentThread = Thread.currentThread();
//		// Obtener el nombre del hilo
//		System.out.println("Thread name is "+ currentThread.getName()); 
		
//		for (int j = 0; j < 100; j++) {
//			System.out.print("j: "+j+"\t");
//			Thread.sleep(1000);
//		}+
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
//		Thread currentThread = Thread.currentThread();
//		currentThread.setName("Print 100 numbers"); // Cambiar el nombre
//		System.out.println("Thread name is "+ currentThread.getName());
		
//		for (int i = 0; i < 100; i++) {
//			System.out.print("i: "+i+"\t");
//			try {
//				Thread.sleep(1000); // Delay en la ejecucion en milisegundos, maneja expecciones
//			} catch (InterruptedException e) {
//				System.err.println("Child thread exiting");
//			}
//		}
		
	}
}

