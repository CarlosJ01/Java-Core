package lambdas.anonymous;

public class Test {
	
	public static void main(String[] args) {
//		Clases Anonimas
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++)
//					System.out.println("Child Thread");
//			}
//		});
//		t.start();
		
		// Lambdas
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Child Thread");
		});
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Maind Thread");
		}
		
	}
	
}
