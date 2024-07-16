import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread{
	
	// Crea una copia cuando sucede una modificacion con concurrencia, y 
	// luego la JVM une las modificaciones de la copia con la original
	public static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<String>();
	
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
		
		ArraySetProblem arrayListProblem = new ArraySetProblem();
		arrayListProblem.start();
		
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
