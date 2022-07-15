package br.com.tarcio4lmeida.challange.day07;

import br.com.tarcio4lmeida.challange.day03.Day03;
import br.com.tarcio4lmeida.challange.day03.Movie;
import br.com.tarcio4lmeida.challange.day04.HTMLGenerator;
import br.com.tarcio4lmeida.challange.day06.Content;
import br.com.tarcio4lmeida.challange.day06.Day06;
import br.com.tarcio4lmeida.challange.day06.Serie;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Stream;

public class Day07 {
    public static void main(String[] args) {
        try {
            List<Movie> movies = Day03.get250Movies(args);
            ArrayList<Movie> moviesSortedByRating = getSortedListByRatingUsingComparable(movies);

            List<Movie> moviesSortedByTitle = getMoviesSortedByTitle(moviesSortedByRating);

            List<Serie> series = Day06.getMarvelSeries(args[1]);

            ArrayList<? extends Content> shuffleMixedList = getShuffledMixedList(moviesSortedByTitle, series);
            generateHtmlPage(shuffleMixedList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<? extends Content> getShuffledMixedList(List<Movie> moviesSortedByTitle, List<Serie> series) {
        List<? extends Content> mixedList = Stream.of(series, moviesSortedByTitle)
                .flatMap(Collection::stream).toList();

        ArrayList<? extends Content> shuffleMixedList = new ArrayList<>(mixedList);
        Collections.shuffle(shuffleMixedList);
        return shuffleMixedList;
    }

    private static void generateHtmlPage(List<? extends Content> list) throws FileNotFoundException {
        PrintWriter output = new PrintWriter("./src/main/resources/site/mixedlist_day07.html");
        HTMLGenerator htmlGenerator = new HTMLGenerator(output);
        htmlGenerator.generate(list);

        System.out.println("Html gerado gerado com sucesso");

        output.flush();
        output.close();
    }

    private static List<Movie> getMoviesSortedByTitle(List<Movie> moviesSortedByRating) {
        ArrayList<Movie> moviesSortedByTitle = new ArrayList<>(moviesSortedByRating);
        moviesSortedByRating.sort(Comparator.comparing(Movie::title));
        return moviesSortedByTitle;
    }

    private static ArrayList<Movie> getSortedListByRatingUsingComparable(List<Movie> movies) {
        ArrayList<Movie> moviesModified = new ArrayList<>(movies);
        Collections.sort(moviesModified);
        return moviesModified;
    }
}
