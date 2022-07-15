package br.com.tarcio4lmeida.challange.day03.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ImdbiApiResponse(
        @JsonProperty("items")
        List<Item> items,
        @JsonProperty("errorMessage")
        String errorMessage
) {
    public record Item(
            @JsonProperty("id") String id,
            @JsonProperty("rank") String rank,
            @JsonProperty("title") String title,
            @JsonProperty("fullTitle") String fullTitle,
            @JsonProperty("year") String year,
            @JsonProperty("image") String image,
            @JsonProperty("crew") String crew,
            @JsonProperty("imDbRating") String imDbRating,
            @JsonProperty("imDbRatingCount") String imDbRatingCount
    ) {
    }
}


