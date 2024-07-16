package chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		try(
				ServerSocket server = new ServerSocket(9090);
				Socket socket = server.accept();
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		) {
			String messageReceved = "", messageSend = "";
			while (true) {
				messageReceved = in.readUTF();
				System.out.println("Client => " + messageReceved);
				
				// Salir del loop
				if (messageReceved != null && messageReceved.equalsIgnoreCase("exit")) {
					break;
				}
				// Lellendo la consola y enviando respuesta
				messageSend = br.readLine();				
				out.writeUTF(messageSend);
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
