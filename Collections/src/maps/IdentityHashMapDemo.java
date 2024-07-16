package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// Admite llaves repetidas
		Map<Integer, String> map = new IdentityHashMap<Integer, String>();
		
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		
		map.put(id1, "John");
		map.put(id2, "Dosu");
		
		System.out.println(map);
	}

}
