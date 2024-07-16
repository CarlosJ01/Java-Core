package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlokingQueueTest {
	
	public static void main(String[] args) {
		//Fila usada para concurrencias, blockea automaticamente usa la capacidad
		// Bloquea / Pausa de poner mas si sobre pasa la capacidad
		// Bloquea / Pausa de sacar si no hay nada
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
		
		OrderProcucer orderProcucer = new OrderProcucer(queue);
		OrderConsumer orderConsumer = new OrderConsumer(queue);
		
		new Thread(orderProcucer).start();
		new Thread(orderConsumer).start();
	}
	
}
