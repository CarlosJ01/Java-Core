package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	// Throws toma la expecion y la lleva al nivel superior para que este
	// sea el encargado de manejar la expecion
	public void readFile() throws FileNotFoundException{
		FileInputStream fileInputStream = new FileInputStream("");
	}
	
	public static void main(String[] args) {
		CheckedException ce = new CheckedException();
		
		// Si no se trata en el nivel superior se puede ir lanzando hata que 
		// llegue a la JVM que lo trata como un error
		try {
			ce.readFile();
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado");
		}
	}
	
}
