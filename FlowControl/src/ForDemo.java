import java.util.Iterator;

public class ForDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i == 10) {
				break; // Rompe el ciclo y de control a los siguientes pasos
			}
			System.out.println(i);
		}
		
//		for (;;) {
//			System.out.println("ciclo infinito");
//		}
		
		//For each por cada elemento de un array
//		for (String ele : args) {
//			System.out.println(ele);
//		}
		
//		for (linea inicial ; condicion ; linea ejecutada en cada iteracion) {
//			codigo de iteracion
//		}
		
	}
}
