package com.fernandovelazco.oracle.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public String obtenerDatos(String url) {
        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Código de estado HTTP: " + response.statusCode());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                return "Error: " + response.statusCode() + " - " + response.body();
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al realizar la solicitud: " + e.getMessage(), e);
        }
    }
}

