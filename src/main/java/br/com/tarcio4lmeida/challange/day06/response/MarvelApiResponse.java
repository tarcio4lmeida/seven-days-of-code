package br.com.tarcio4lmeida.challange.day06.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record MarvelApiResponse(
        @JsonProperty("code")
        Integer code,
        @JsonProperty("status")
        String status,
        @JsonProperty("copyright")
        String copyright,
        @JsonProperty("attributionText")
        String attributionText,
        @JsonProperty("attributionHTML")
        String attributionHTML,
        @JsonProperty("etag")
        String etag,
        @JsonProperty("data")
        DataDTO data) {

    public record DataDTO(
            @JsonProperty("offset")
            Integer offset,
            @JsonProperty("limit")
            Integer limit,
            @JsonProperty("total")
            Integer total,
            @JsonProperty("count")
            Integer count,
            @JsonProperty("results")
            List<ResultsDTO> results) {

        public record ResultsDTO(
                @JsonProperty("id")
                Integer id,
                @JsonProperty("title")
                String title,
                @JsonProperty("description")
                Object description,
                @JsonProperty("resourceURI")
                String resourceURI,
                @JsonProperty("urls")
                List<UrlsDTO> urls,
                @JsonProperty("startYear")
                Integer startYear,
                @JsonProperty("endYear")
                Integer endYear,
                @JsonProperty("rating")
                String rating,
                @JsonProperty("type")
                String type,
                @JsonProperty("modified")
                String modified,
                @JsonProperty("thumbnail")
                ThumbnailDTO thumbnail,
                @JsonProperty("creators")
                CreatorsDTO creators,
                @JsonProperty("characters")
                CharactersDTO characters,
                @JsonProperty("stories")
                StoriesDTO stories,
                @JsonProperty("comics")
                ComicsDTO comics,
                @JsonProperty("events")
                EventsDTO events,
                @JsonProperty("next")
                Object next,
                @JsonProperty("previous")
                Object previous) {


            public record ThumbnailDTO(
                    @JsonProperty("path")
                    String path,
                    @JsonProperty("extension")
                    String extension) {
            }

            public record CreatorsDTO(
                    @JsonProperty("available")
                    Integer available,
                    @JsonProperty("collectionURI")
                    String collectionURI,
                    @JsonProperty("items")
                    List<ItemsDTO> items,
                    @JsonProperty("returned")
                    Integer returned) {

                public record ItemsDTO(
                        @JsonProperty("resourceURI")
                        String resourceURI,
                        @JsonProperty("name")
                        String name,
                        @JsonProperty("role")
                        String role) {
                }
            }

            public record CharactersDTO(
                    @JsonProperty("available")
                    Integer available,
                    @JsonProperty("collectionURI")
                    String collectionURI,
                    @JsonProperty("items")
                    List<?> items,
                    @JsonProperty("returned")
                    Integer returned) {
            }

            public record StoriesDTO(
                    @JsonProperty("available")
                    Integer available,
                    @JsonProperty("collectionURI")
                    String collectionURI,
                    @JsonProperty("items")
                    List<ItemsDTO> items,
                    @JsonProperty("returned")
                    Integer returned) {


                public record ItemsDTO(
                        @JsonProperty("resourceURI")
                        String resourceURI,
                        @JsonProperty("name")
                        String name,
                        @JsonProperty("type")
                        String type) {
                }
            }

            public record ComicsDTO(
                    @JsonProperty("available")
                    Integer available,
                    @JsonProperty("collectionURI")
                    String collectionURI,
                    @JsonProperty("items")
                    List<ItemsDTO> items,
                    @JsonProperty("returned")
                    Integer returned) {

                public record ItemsDTO(
                        @JsonProperty("resourceURI")
                        String resourceURI,
                        @JsonProperty("name")
                        String name) {
                }
            }

            public record EventsDTO(
                    @JsonProperty("available")
                    Integer available,
                    @JsonProperty("collectionURI")
                    String collectionURI,
                    @JsonProperty("items")
                    List<?> items,
                    @JsonProperty("returned")
                    Integer returned) {
            }

            public record UrlsDTO(
                    @JsonProperty("type")
                    String type,
                    @JsonProperty("url")
                    String url
            ) {
            }
        }
    }
}
