package basics;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			// Conectando
			Socket client = new Socket("localhost", 8080);
			
			// Enviando datos
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF("Hola mundo, por sockets ;)");
			
			// Cerrando coneccion
			dos.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
