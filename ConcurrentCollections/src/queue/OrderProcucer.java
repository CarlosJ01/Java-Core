package queue;

import java.util.concurrent.BlockingQueue;

public class OrderProcucer implements Runnable {

	// Fila para concurrencias
	BlockingQueue<String> queue;
	
	public OrderProcucer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			queue.put("Mac book pro");
			queue.put("Dell laptop");
			queue.put("Iphone");
			queue.put("Mac book pro");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
