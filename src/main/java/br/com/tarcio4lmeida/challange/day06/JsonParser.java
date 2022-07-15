package br.com.tarcio4lmeida.challange.day06;

import java.util.List;

public interface JsonParser{
    public List<? extends Content> parse(String json) throws Exception;
}
