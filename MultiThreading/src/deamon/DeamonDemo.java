package deamon;

public class DeamonDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		
		// Los subprocesos de demonio son subprocesos de baja prioridad cuya 
		// unica función es proporcionar servicios a los subprocesos de usuario.
		// Mueren cuando todos los procesos de usuario terminan
		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());
		myThread.start();
	}
	
}
