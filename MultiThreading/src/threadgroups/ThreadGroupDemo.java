package threadgroups;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		// Obtener el grupo del thread y su nombre
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		// Obtener el grupo padre
		System.out.println(Thread.currentThread().getThreadGroup().getParent()
				.getName());
		
		System.out.println("-------------------------------------------------");
		
		
		// Crear un grupo de hilos
		ThreadGroup parent = new ThreadGroup("Parent");
		System.out.println(parent.getName());
		
		// Crear un grupo hijo de otro
		ThreadGroup child = new ThreadGroup(parent, "child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());
		
		System.out.println("-------------------------------------------------");
		

		// Crear un hilo que pertenece a un  grupo
		Thread thread1 = new Thread(child, "Hilo 1");
		Thread thread2 = new Thread(child, "Hilo 2");
		System.out.println(thread1.getPriority());
		
		// Cambiar la prioridad maxima del grupo solo a los nuevos
		child.setMaxPriority(4);
		Thread thread3 = new Thread(child, "Hilo 3");
		System.out.println(thread3.getPriority());
	}
	
}
