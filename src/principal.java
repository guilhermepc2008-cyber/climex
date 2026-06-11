import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class principal {
   public static void main() throws Exception {
       Scanner leitura = new Scanner(System.in);
       String clima;
       System.out.println("BEM VINDO AO SISTEMA - CLIMEX");
       System.out.println("DÍGITE O NOME DA CIDADE QUE VOCÊ DESEJA BUSCAR");
       clima = URLEncoder.encode(leitura.nextLine(), StandardCharsets.UTF_8);
       Buscando busca = new Buscando();
       busca.buscando(clima);


    }
}
