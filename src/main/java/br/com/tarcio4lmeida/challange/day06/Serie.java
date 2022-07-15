package br.com.tarcio4lmeida.challange.day06;

import br.com.tarcio4lmeida.challange.day06.response.MarvelApiResponse.DataDTO.*;

public record Serie(
        String title,
        String thumbnail,
        String rating,
        String year
) implements Content {

    public Serie(ResultsDTO result) {
        this(result.title(),
                String.format("%s.%s", result.thumbnail().path(), result.thumbnail().extension()),
                result.rating().equals("") ? "Sem nota" : result.rating(),
                String.format("%s - %s", result.startYear(), result.endYear()));
    }

    @Override
    public String title() {
        return this.title;
    }

    @Override
    public String image() {
        return this.thumbnail;
    }

    @Override
    public String rating() {
        return this.rating;
    }

    @Override
    public String year() {
        return this.year;
    }

    @Override
    public String type() {
        return "Serie";
    }
}
