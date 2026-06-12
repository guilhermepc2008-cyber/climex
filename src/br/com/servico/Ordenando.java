package br.com.servico;

import java.util.Collections;
import java.util.List;

public class Ordenando {
    public void OrdenaListaTemp(List<Cidade> listaCidade){
        Collections.sort(listaCidade);
        System.out.println(listaCidade);
    }
}
