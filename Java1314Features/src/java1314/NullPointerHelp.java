package java1314;

public class NullPointerHelp {

	public static void main(String[] args) {
		String str = null;
		
		// Con el argumento a la hora de ejecutar -XX:+ShowCodeDetailsInExceptionMessages muestra
		// los detalles de por que se dio el error
		System.out.println(str.charAt(0));
	}

}
