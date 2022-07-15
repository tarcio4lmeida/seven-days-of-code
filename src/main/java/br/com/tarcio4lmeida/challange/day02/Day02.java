package br.com.tarcio4lmeida.challange.day02;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Day02 {
    public static void main(String[] args) throws Exception {
        String json250Movies = getJson250Movies(args);

        List<String> titles = getListParam(json250Movies, "title");
        titles.forEach(title -> System.out.print(title + ", "));
        System.out.println();

        List<String> image = getListParam(json250Movies, "image");
        image.forEach(img -> System.out.print(img + ", "));
        System.out.println();

        List<String> year = getListParam(json250Movies, "year");
        year.forEach(yyyy -> System.out.print(yyyy + ", "));
        System.out.println();

        List<String> imDbRating = getListParam(json250Movies, "imDbRating");
        imDbRating.forEach(rating -> System.out.print(rating + ", "));
    }

    private static String getJson250Movies(String[] args) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(args[0]))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    public static Stream<String> getJsonSplited(String json) {
        return Arrays.stream(json.split(","))
                .map(a -> a.replace("\"", ""));
    }

    public static List<String> getListParam(String json, String param) {
        return getJsonSplited(json)
                .map(s -> s.split(":",  2))
                .filter(s -> s[0].equals(param))
                .map(s -> s[1])
                .toList();
    }
}
