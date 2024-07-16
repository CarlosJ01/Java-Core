package queue;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {

	// Fila para concurrencias
	BlockingQueue<String> queue;
	
	public OrderConsumer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			// Obtiene y quita el elemento
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
