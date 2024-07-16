package inmutableCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	public static void main(String[] args) {
		// Coleciones que no se pueden modificar o tener nulos, lanzan una excepcion
		List<String> list = List.of("", "abc", "xyz");
		Set<String> set = Set.of("", "abc", "xyz");
		Map<Integer, String> map = Map.of(1 , "abc", 2, "xyz");
//		Map.ofEntries(null)
	}
	
}
