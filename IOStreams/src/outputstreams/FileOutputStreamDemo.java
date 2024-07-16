package outputstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String filePath = "C:\\Users\\103412781\\Documents\\eclipce_workspace\\Core Java\\IOStreams\\src";
		
		try {
			// Son Streams de bytes solo leen y escriben bytes
			fis = new FileInputStream(filePath+"\\image.png");
			fos = new FileOutputStream(filePath+"\\copyImage.png");
			
			int data;
			while ((data=fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File copy");
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
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
