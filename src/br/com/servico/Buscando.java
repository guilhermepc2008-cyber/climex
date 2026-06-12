package br.com.servico;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscando {
    private Gson gson = new Gson();
    public void buscando(String nomedaCidade) throws Exception{
        String chave = System.getenv("API");

        try {


            String end = "https://api.openweathermap.org/data/2.5/weather?q=" + nomedaCidade + "&appid=" + chave + "&units=metric&lang=pt_br";
            HttpClient carteiro = HttpClient.newHttpClient();
            HttpRequest pacote = HttpRequest.newBuilder().uri(URI.create(end)).build();
            HttpResponse<String> retorno = carteiro.send(pacote, HttpResponse.BodyHandlers.ofString());
            TransfeirDados t = gson.fromJson(retorno.body(), TransfeirDados.class);
            Cidade cid = new Cidade(t);
            System.out.println("BUSCA CONCLUÍDA, INFORMAÇÕES SOBRE O CLIMA DA CIDADE");
            System.out.println(cid.toString());
        } catch (ErronaBusca e){
            System.out.println(e.getMessage());
        }



    }
}
