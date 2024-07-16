import java.util.Iterator;

public class OddNumbers {
	public static void main(String[] args) {
		for (int i=0; i<10;i++) {
			if (i%2 == 0) {
				continue; // Salta a la siguiente iteraccion
			}
			System.out.println(i);
		}
	}
}
