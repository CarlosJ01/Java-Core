
public class StaticVaribles {
	// Variable Estatica => compartida por la clase
	static String staticVariable = "Variable estatica";
	// Variable no estica => por cada objeto
	String nonStaticVariable;
	
	public static void main(String[] args) {
		// Local variable => dentro de un metodo
		double loanInterestRate = 7.5;
		System.out.println(loanInterestRate);
		
		System.out.println(StaticVaribles.staticVariable);
		
		StaticVaribles obj = new StaticVaribles();
		obj.nonStaticVariable = "Variable no estatica";
		System.out.println(obj.nonStaticVariable);
	}
}
