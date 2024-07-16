package trywithresources;

// AutoCloseable => para que se cierre el recurso automatico en el try
public class MyWorker implements AutoCloseable{
	
	public MyWorker() {
		System.out.println("Creating");
	}
	
	public void doSomething() {
		System.out.println("Something");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing");
	}

}
