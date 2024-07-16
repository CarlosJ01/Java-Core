import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class VarDemo {
	
	// var string = "sda"; No se usan en atributos :(
	
	public static void main(String[] args) {
		int x = 10;
		float f = 20f;
		
		// Declarar variables, como JS pero este si mantiene su tipo de dato :)
		var y = 10;
//		y = 50.3; :(
//		var s = null; :(
		
		//Map<String, List<String>> map = new HashMap<String, List<String>>();
		var map = new HashMap<String, List<String>>();
		for (var entry : map.entrySet()) {
			var value = entry.getValue();
			System.out.println(value);
		}
		
		// No se pueden usar aqui, no veo por que lo usarias
		// var lambda :(
		Consumer<Integer> lambda = (i)->{
			System.out.println(i);
		};
		
		var list = new ArrayList<Integer>();
		list.add(123);
//		list.add("xcs"); :(
	}
	
}
