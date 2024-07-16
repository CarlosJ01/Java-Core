package seralizationClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesarizationDemo {
	
	public static void main(String[] args) {
		try {
			// Leen objetos
			FileInputStream fis = new FileInputStream("employees.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// Leer el objeto y convertirlo
			Object obj = ois.readObject();
			Employee emp = (Employee) obj;
			
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.nss);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
