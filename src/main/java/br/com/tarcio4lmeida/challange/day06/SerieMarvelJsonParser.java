package br.com.tarcio4lmeida.challange.day06;

import br.com.tarcio4lmeida.challange.day06.response.MarvelApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class SerieMarvelJsonParser implements JsonParser {
    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<Serie> parse(String json) throws Exception {
        MarvelApiResponse marvelApiResponse = mapper.readValue(json, MarvelApiResponse.class);

        return marvelApiResponse
                .data()
                .results()
                .stream()
                .map(Serie::new)
                .toList();
    }

}
