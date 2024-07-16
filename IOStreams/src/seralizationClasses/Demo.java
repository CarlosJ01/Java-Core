package seralizationClasses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {
	
	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos; // Para escribir objetos
		
		try {
			// Tipo de archivo que tiene objetos serializados
			fos = new FileOutputStream("employees.ser");
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee(1, "John", 1000, 123456);
			oos.writeObject(emp); // Escribe un objeto en el archivo => Serelized
			System.out.println("Employee serelized");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
	
}
