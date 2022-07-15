package br.com.tarcio4lmeida.challange.day01;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Day01 {
    public static void main(String[] args) throws Exception{
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(args[0]))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
