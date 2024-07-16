package functions;

import java.util.function.Function;

public class FuncionTest {
	
	public static void main(String[] args) {
		// Como los predicados las Funciones pueden resivir y regresar cualquier tipo <Ingresa,Resive>, igual
		// se puede usar con lambdas
		Function<String, Integer> f = s -> s.length();
		
		System.out.println(f.apply("sdadas"));
		System.out.println(f.apply("sda"));
		System.out.println(f.apply("sdadas adas"));
	}
	
}
