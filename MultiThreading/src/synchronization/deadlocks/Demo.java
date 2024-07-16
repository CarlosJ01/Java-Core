package synchronization.deadlocks;

public class Demo implements Runnable{
	
	FirstResource fr = new FirstResource();
	SecondResource sr = new SecondResource();
	
	public Demo() {
		new Thread(this).start();
		sr.method1(fr); // Deadlock por que el recurso 1 bloquea al 2 y vicerversa
						// Asi que nunca van a liberarce los servicios
	}
	
	public static void main(String[] args) {
		new Demo();
	}

	@Override
	public void run() {
		fr.method1(sr);
	}
	
}
