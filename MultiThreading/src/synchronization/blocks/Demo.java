package synchronization.blocks;

public class Demo {
	
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		
		MyThread t1 = new MyThread(dm, "Steve");
		MyThread t2 = new MyThread(dm, "Alex");
		
		t1.start();
		t2.start();
	}
	
}
