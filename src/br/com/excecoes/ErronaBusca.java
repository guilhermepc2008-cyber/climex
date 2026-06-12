package br.com.excecoes;

public class ErronaBusca extends RuntimeException {
    private String msg;
    public ErronaBusca(String message) {
        this.msg = message;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
