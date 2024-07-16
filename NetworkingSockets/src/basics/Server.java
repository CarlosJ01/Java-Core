package basics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8080);
			
			System.out.println("Waiting for the client conecction");
			
			Socket socket = server.accept();
			System.out.println("Conecction Stablish");
			
			System.out.println("Reading data");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String data = dis.readUTF();
			System.out.println(data);
			
			dis.close();
			server.close(); // Tambien cierra el socket
			System.out.println("Closing conection");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
