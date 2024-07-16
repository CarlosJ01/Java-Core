
public class Test {
	public static void main(String[] args) {
		// Conjunto de variables
		// Si no tiene valor regresa el nombre de la constante
		PaymentType pt = PaymentType.CREDITCARD;
		System.out.println(pt);
		
		System.out.println();
		
		PaymentType[] values = PaymentType.values(); // Obtiene todos los valores
		for (PaymentType paymentType : values) {
			System.out.println(paymentType);
			System.out.println(paymentType.ordinal()); // Numero que ocupa
			System.out.println(paymentType.getFee());
		}
		
	}
}
