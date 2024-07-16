package threadgroups;

public class ThreadGroupMethods {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup mtg = new ThreadGroup("My Thread Group");
		
		CustomThread thread1 = new CustomThread(mtg, "Thread 1");
		CustomThread thread2 = new CustomThread(mtg, "Thread 2");
		
		thread1.start();
		thread2.start();
		
		System.out.println(mtg.activeCount()); // Numero de Threads activos
		mtg.list(); // Informacion del grupo
		
		Thread.sleep(5000);
		System.out.println(mtg.activeCount());
		mtg.list();
	}
	
}
