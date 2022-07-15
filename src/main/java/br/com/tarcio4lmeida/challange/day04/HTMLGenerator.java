package br.com.tarcio4lmeida.challange.day04;

import br.com.tarcio4lmeida.challange.day06.Content;

import java.io.PrintWriter;
import java.util.List;

public record HTMLGenerator(PrintWriter printWriter) {

    public void generate(List<? extends Content> contents) {
        printWriter.write(getHeadBootstrap());
        contents.forEach(
                content -> printWriter.print(
                        String.format(getDivTemplate(),
                                content.title(),
                                content.type(),
                                content.image(),
                                content.title(),
                                content.rating(),
                                content.year()))
        );
    }

    private String getDivTemplate() {
        return
                """
                        <div class=\"card text-white bg-dark mb-3\" style=\"max-width: 15rem;\">
                            <h4 class=\"card-header\">%s</h4>
                            <div class=\"card-body\">
                                <p class=\"card-text mt-2\">%s</p>
                                <img class=\"card-img\" src=\"%s\" alt=\"%s\">
                                <p class=\"card-text mt-2\">Nota: %s - Ano: %s</p>
                            </div>
                        </div>
                        """;
    }

    private String getHeadBootstrap() {
        return
                """
                        <head>
                            <meta charset=\"utf-8\">
                            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">
                            <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" 
                                + "integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">					
                        </head>
                        """;
    }
}


