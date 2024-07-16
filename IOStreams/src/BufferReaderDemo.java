import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReaderDemo {

	public static void main(String[] args) {
		
		try(
			FileReader fr = new FileReader("lorem.txt");
			BufferedReader br = new BufferedReader(fr); // Lee lineas				
		) {
			
			String line;
			StringTokenizer st = null;
			int count = 0;
			
			while ((line=br.readLine()) != null) {
				st = new StringTokenizer(line); // Separa cadenas
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			
			System.out.println("Total: "+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
