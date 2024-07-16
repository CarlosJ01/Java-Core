package random;

import java.util.Random;

public class RandomDemo {
	
	public static void main(String[] args) {
		// Generar numeros random
		Random random =  new Random();
		int x = random.nextInt();
		System.out.println(x);
		
		// Generar numero random hasta el numero 100
		int y = random.nextInt(100);
		System.out.println(y);
	}
	
}
