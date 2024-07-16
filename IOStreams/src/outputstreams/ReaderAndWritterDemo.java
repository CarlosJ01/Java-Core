package outputstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWritterDemo {
	
	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		FileWriter fw = null;
		String filePath = "C:\\Users\\103412781\\Documents\\eclipce_workspace\\Core Java\\IOStreams\\src";
		
		// Leen caracteres
		fr = new FileReader(filePath + "\\file.txt");
		fw = new FileWriter(filePath + "\\copyFile.txt");
		
		int ch;
		while ((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("File copied");
	}

}
