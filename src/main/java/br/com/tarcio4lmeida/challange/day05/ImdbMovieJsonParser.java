package br.com.tarcio4lmeida.challange.day05;

import br.com.tarcio4lmeida.challange.day03.response.ImdbiApiResponse;
import br.com.tarcio4lmeida.challange.day03.Movie;
import br.com.tarcio4lmeida.challange.day06.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ImdbMovieJsonParser implements JsonParser {
    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<Movie> parse(String json) throws Exception {
        ImdbiApiResponse jsonRootItem = mapper.readValue(json, ImdbiApiResponse.class);

        return jsonRootItem
                .items()
                .stream()
                .map(Movie::new)
                .toList();
    }
}
