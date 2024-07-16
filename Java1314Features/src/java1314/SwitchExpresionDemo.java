package java1314;

public class SwitchExpresionDemo {
	
	public static void main(String[] args) {
		var key = 1;
		
		// Usar un switch para dar valor a la variable
		String result = switch (key) {
			case 1: {
				yield "Choice 1"; // Return para que se le asigne a la variable
			}
			default:
				yield "Invalid choice";
		};
		System.out.println(result);
		
		// Con lambda Expresion
		key = 3;
		String response = switch (key) {
			case 1 -> {
				yield "You have zero balance";
			}
			case 2 -> {
				yield "You can get a loan";
			}
			case 3 -> "Are you sure have money"; // Expresion con lambda
			default -> throw new IllegalArgumentException("Unexpected value: " + key);
		};
		System.out.println(response);
	}
}
