import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdates {
	
	public static void main(String[] args) {
		try {
			// Escribir en un archivo y crear una archivo temporal
			Path path = Files.writeString(Files.createTempFile("temporal_file", ".txt"), "Java 11 :o");
			System.out.println(path);
			
			// Leer de un archivo
			String readString = Files.readString(path);
			System.out.println(readString);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
