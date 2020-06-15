package com.learn.java_eleven.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncHttpClientExample {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.google.com")).build();

		CompletableFuture<HttpResponse<String>> output = client.sendAsync(request,
				HttpResponse.BodyHandlers.ofString());

		System.out.println(output.get().body());
		
		
				
	}

}
