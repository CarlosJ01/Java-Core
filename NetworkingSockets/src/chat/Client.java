package chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		try(
				Socket client = new Socket("localhost", 9090);
				DataInputStream in = new DataInputStream(client.getInputStream());
				DataOutputStream out = new DataOutputStream(client.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		) {
			String messageReceved = "", messageSend = "";
			while (true) {
				// Enviando mensaje
				messageSend = br.readLine();
				out.writeUTF(messageSend);
				out.flush();
				
				if (messageSend.equalsIgnoreCase("exit")) {
					break;
				}
				
				messageReceved = in.readUTF();
				System.out.println("Server => " + messageReceved);	
			}
			
			br.close();
			out.close();
			in.close();
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
