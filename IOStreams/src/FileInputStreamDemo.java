import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(
				"C:\\Users\\103412781\\Documents\\eclipce_workspace\\Core Java\\IOStreams\\src\\file.txt"
			));
			
			int i;
			while ((i=fis.read()) != -1) { // -1 cuando ya no lee datos, si no lee el caracter como unicode
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("File close");
	}
	
}
