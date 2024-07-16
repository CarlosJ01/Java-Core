import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread{
	
	// Crea una copia cuando sucede una modificacion con concurrencia, y 
	// luego la JVM une las modificaciones de la copia con la original
	public static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayListProblem arrayListProblem = new ArrayListProblem();
		arrayListProblem.start();
		
		// Lista que maneja concurrencias
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		System.out.println(courses);
	}

}
