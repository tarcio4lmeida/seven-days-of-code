package br.com.tarcio4lmeida.challange.day04;

import br.com.tarcio4lmeida.challange.day03.Day03;
import br.com.tarcio4lmeida.challange.day03.Movie;

import java.io.PrintWriter;
import java.util.List;

public class Day04 {
    public static void main(String[] args) {
        try {
            List<Movie> movies = Day03.get250Movies(args);
            PrintWriter output = new PrintWriter("./src/main/resources/site/movies_day04.html");
            HTMLGenerator htmlGenerator = new HTMLGenerator(output);
            htmlGenerator.generate(movies);

            System.out.println("Html gerado gerado com sucesso");

            output.flush();
            output.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
