package RunTimeBilding;

import Interfaces.AppleLaptop;

public class Test {
	public static void main(String[] args) {
		AppleLaptop laptop1 = new MackBookAir(); // Upcasting Padre => Hijo
		laptop1.start();
		laptop1.shutdown();
//		laptop1.mba(); no se pueden usar los metodos del hijo si la referencia
						// es un padre
		
		AppleLaptop laptop2 = new MackBookPro();
		laptop2.start();
		laptop2.shutdown();
		
		MackBookAir laptop3 = (MackBookAir) laptop1; // Downcasting Hijo => Padre
		laptop3.start();
		laptop3.shutdown();
		laptop3.mba();
	}
}
