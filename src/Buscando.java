public class Buscando {
    public TransfeirDados buscando(String nomedaCidade){
        String chave = System.getenv("API");
        String end = "https://api.openweathermap.org/data/2.5/weather?q=" +  nomedaCidade+  "&appid=" + chave +"&units=metric&lang=pt_br";
    }
}
