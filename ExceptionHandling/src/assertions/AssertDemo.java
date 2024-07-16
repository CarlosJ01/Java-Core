package assertions;

public class AssertDemo {
	
	public static void main(String[] args) {
		int withdrawlAmount = 100;
		int currentBalance = 00;
		
		// Assert que se usa un expresion que da un booleano a cambio, para hacer
		// testing (estan desactivados por default), si falla lanza un java.lang.AssertionError
		assert(withdrawlAmount < currentBalance) : "Withdrawl amount is more thant current balance"; // Mensaje para la expeccion
	}

}
