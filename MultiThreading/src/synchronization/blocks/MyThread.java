package synchronization.blocks;

public class MyThread extends Thread{
	
	DisplayMessage dm;
	String name;
	
	public MyThread(DisplayMessage dm, String name) {
		super();
		this.dm = dm;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			dm.sayHello(this.name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
