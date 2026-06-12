import br.com.servico.Buscando;
import br.com.servico.Cidade;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class principal {
    public static void main() throws Exception {
        Scanner leitura = new Scanner(System.in);
        String clima;
        Buscando busca = new Buscando();
        System.out.println("BEM VINDO AO SISTEMA - CLIMEX");
        while (true) {
            System.out.println("DÍGITE O NOME DA CIDADE QUE VOCÊ DESEJA BUSCAR");
            clima = URLEncoder.encode(leitura.nextLine(), StandardCharsets.UTF_8);
            if(clima.equalsIgnoreCase("sair")){
                Cidade.ordemTem();
                System.out.println("ENCERRANDO PROGRAMA");
                break;
            }
            busca.buscando(clima);


        }
    }
}
