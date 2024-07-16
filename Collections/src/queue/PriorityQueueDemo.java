package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// Es una cola desordenada
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		q.offer(0);
		for (int i = 100; i < 110; i++) {
			q.offer(i); // Agregar a la cola
		}
		q.offer(1);
		
		System.out.println(q);
		
		// Obtener el primer elemento de la cola
		System.out.println(q.peek()); // Si no hay => null
		System.out.println(q.element()); // Si no hay Exception
		System.out.println(q);
		
		// Obtener y quitar el primer elemento
		System.out.println(q.poll()); // Si no hay => null
		System.out.println(q.remove()); // Si no hay Exception
		System.out.println(q);
	}
	
}
