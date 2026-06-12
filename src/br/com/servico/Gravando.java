package br.com.servico;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.List;

public class Gravando {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public void Gravar(List<Cidade> c) throws  Exception{
        gson.toJson(c);
        FileWriter escrita = new FileWriter("cidades.json");
        escrita.write(gson.toJson(c));
        escrita.close();

    }
}
