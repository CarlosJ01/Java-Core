package yield;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Chield Thread");
//			‎yield() ‎‎básicamente significa que el subproceso no está haciendo nada 
//			particularmente importante y si es necesario ejecutar otros subprocesos 
//			o procesos, deben ejecutarse. 
//			‎‎De otra manera‎‎, el subproceso actual seguirá ejecutinándose.‎
			Thread.yield();
		}
	}
}
