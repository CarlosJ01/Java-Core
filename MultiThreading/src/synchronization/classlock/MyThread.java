package synchronization.classlock;

public class MyThread extends Thread{
	
	String name;
	
	public MyThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		try {
			DisplayMessage.sayHello(this.name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
