package br.com.tarcio4lmeida.challange.day06;

import br.com.tarcio4lmeida.challange.day04.HTMLGenerator;
import br.com.tarcio4lmeida.challange.day05.client.ApiClient;

import java.io.PrintWriter;
import java.util.List;

public class Day06 {
    public static void main(String[] args) {
        try {
            List<Serie> series = getMarvelSeries(args[0]);
            PrintWriter output = new PrintWriter("./src/main/resources/site/series_day06.html");
            HTMLGenerator htmlGenerator = new HTMLGenerator(output);
            htmlGenerator.generate(series);

            System.out.println("Html gerado gerado com sucesso");

            output.flush();
            output.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static List<Serie> getMarvelSeries(String url) throws Exception {
        String response = ApiClient.getHttpResponse(url);
        return new SerieMarvelJsonParser()
                .parse(response);
    }
}
