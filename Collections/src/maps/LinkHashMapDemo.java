package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkHashMapDemo {
	
	public static void main(String[] args) {
		// Como un diccionario o json con clave valor => Mantiene el orden en el que se igresan
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
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
