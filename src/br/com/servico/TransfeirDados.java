package br.com.servico;

import java.util.List;


public record TransfeirDados(
        String name,
        MainDados main,
        List<WeatherDetails> weather
) {
    public record MainDados(
            double temp
    ) {}

    public record WeatherDetails(
            String main,
            String description
    ) {}
}