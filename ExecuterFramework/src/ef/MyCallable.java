package ef;

import java.util.concurrent.Callable;

// Calable para regresar valores del hilo
public class MyCallable implements Callable<Integer> {

	int num;
	
	public MyCallable(int num) {
		this.num = num;
	}
	
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is calculating "
				+ "the sume of all numbers up to "+num);
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
		
		return sum;
	}

}
