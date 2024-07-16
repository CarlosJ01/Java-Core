package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		// Como un diccionario o json con clave valor => No mantiene el orden
		// No admite llaves repetidas se queda con el ultimo igual
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// Añadir elementos key, value
		map.put("carlos", 70);
		map.put("Tom", 60);
		map.put("Lee", 100);
		map.put("Brand", 80);
		
		System.out.println(map);
		
		// Regresa todas las key
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		// Regresa todos los valores
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		for(String key: keySet) {
			// Obtener un valor por la key
			System.out.println(map.get(key));
		}
	}
	
}
