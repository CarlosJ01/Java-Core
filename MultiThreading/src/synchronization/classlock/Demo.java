package synchronization.classlock;

public class Demo {
	
	public static void main(String[] args) {		
		MyThread t1 = new MyThread("Steve");
		MyThread t2 = new MyThread("Alex");
		
		t1.start();
		t2.start();
	}
	
}
