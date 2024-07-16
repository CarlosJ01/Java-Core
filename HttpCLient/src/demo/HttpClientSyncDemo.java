package demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo {

	public static void main(String[] args) {
		// Peticiones HTTP desde Java
		try {
			HttpClient client = HttpClient.newHttpClient();
			
			// GET
			HttpRequest request = HttpRequest.newBuilder(
						new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities")
					).GET().build();
			
			// POST
			HttpRequest request2 = HttpRequest.newBuilder(
					new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities")
				).POST(BodyPublishers.ofString("{\r\n"
						+ "  \"id\": 0,\r\n"
						+ "  \"title\": \"string\",\r\n"
						+ "  \"dueDate\": \"2021-10-13T22:57:18.428Z\",\r\n"
						+ "  \"completed\": true\r\n"
						+ "}"))
				.header("Content-Type", "application/json")
				.build();
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());
			
			response = client.send(request2, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());
			
			// Headers
			HttpHeaders headers = response.headers();
			System.out.println(headers.map());
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
