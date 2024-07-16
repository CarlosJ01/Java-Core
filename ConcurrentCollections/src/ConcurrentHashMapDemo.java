import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread{
	
	// Crea una copia cuando sucede una modificacion con concurrencia, y 
	// luego la JVM une las modificaciones de la copia con la original
	public static ConcurrentHashMap<String, String> courses = new ConcurrentHashMap<String,String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.put("0","Kubernetes");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentHashMapDemo arrayListProblem = new ConcurrentHashMapDemo();
		arrayListProblem.start();
		
		courses.put("1", "Java");
		courses.put("2", "Python");
		courses.put("3", "AWS");
		courses.put("4", "Docker");
		
		Iterator<String> iterator = courses.keySet().iterator();
		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String course = (String) iterator.next();
			System.out.println(courses.get(course));
		}
		
		System.out.println(courses);
	}

}
