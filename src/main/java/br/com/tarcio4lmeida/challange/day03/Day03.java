package br.com.tarcio4lmeida.challange.day03;

import br.com.tarcio4lmeida.challange.day05.ImdbMovieJsonParser;
import br.com.tarcio4lmeida.challange.day05.client.ApiClient;

import java.util.List;

public class Day03 {
    public static void main(String[] args) {
        try {
            List<Movie> movies = get250Movies(args);
            movies.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Movie> get250Movies(String[] url) throws Exception {
        String response = ApiClient.getHttpResponse(url[0]);
        return new ImdbMovieJsonParser()
                .parse(response);
    }
}
