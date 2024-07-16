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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientASyncDemo {

	public static void main(String[] args) {
		// Peticiones asincronas
		try {
			HttpClient client = HttpClient.newHttpClient();
						
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
			
			CompletableFuture<HttpResponse<String>> response = client.sendAsync(request2, BodyHandlers.ofString());
			String body = response.thenApply(HttpResponse::body).get(); // Que ejecute el metodo una vez termine el hilo
			System.out.println(body);
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
