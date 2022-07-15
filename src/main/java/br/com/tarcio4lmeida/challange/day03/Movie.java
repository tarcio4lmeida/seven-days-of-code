package br.com.tarcio4lmeida.challange.day03;

import br.com.tarcio4lmeida.challange.day03.response.ImdbiApiResponse.*;
import br.com.tarcio4lmeida.challange.day06.Content;

public record Movie(
         String title,
         String image,
         String imDbRating,
         String year
) implements Content, Comparable<Movie> {

    public Movie(Item item) {
        this(item.title(), item.image(), item.imDbRating(), item.year());
    }

    @Override
    public String title() {
        return this.title;
    }

    @Override
    public String image() {
        return this.image;
    }

    @Override
    public String rating() {
        return this.imDbRating;
    }

    @Override
    public String year() {
        return this.year;
    }

    @Override
    public String type() {
        return "Movie";
    }

    @Override
    public int compareTo(Movie other) {
        return this.rating().compareTo(other.rating());
    }
}
