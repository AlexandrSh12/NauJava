package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Task4 {
    public static void run() {
        // вариант как в Приложении А работает только на 21 Java
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/get"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.body());
            String host = root.path("headers").path("Host").asText();

            System.out.println("Host: " + host);

        } catch (Exception e) {
            System.out.println("Error in request" + e.getMessage());
        }
    }
}
