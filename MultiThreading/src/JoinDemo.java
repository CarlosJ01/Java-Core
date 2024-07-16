import java.util.Scanner;

public class JoinDemo extends Thread{
	
	static int n, sum = 0;
	
	// Hilo principal
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); // Optener el tiempo actual en milisegundos
		
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a value");
		
		Scanner scanner =  new Scanner(System.in);
		
		JoinDemo.n = scanner.nextInt();
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join(); // Une el hilo secundario al principal cuando este termina
						// El hilo principal espera la muerte del secudario para continuar
						// Enlaza el hilo actual con el final del secundario o el invocado
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Hilo Principal");
		System.out.println("Sum of first "+ JoinDemo.n + " Number is " 
				+ JoinDemo.sum);
		
		long end = System.currentTimeMillis();
		System.out.println("The total time taken: " + (end - start)/1000 + "s");
	}
	
	// Hilo secundario
	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++)
			JoinDemo.sum += i;
		System.out.println("Finish tread 5s");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
