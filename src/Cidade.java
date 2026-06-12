import java.util.ArrayList;
import java.util.List;

public class Cidade implements Comparable<Cidade> {
    private String nomeDaCidade;
    private double Temp;
    private String estadoAtual;
    private  String DescritionClima;
    private static List<Cidade> listaCidade = new ArrayList<>();

    public Cidade(TransfeirDados tra) {
        this.nomeDaCidade = tra.name();
        this.Temp = tra.main().temp();
        this.estadoAtual = tra.weather().get(0).main();
        this.DescritionClima = tra.weather().get(0).description();
        listaCidade.add(this);
    }

    public void ordemTem(){
        Ordenando o = new Ordenando();
        o.OrdenaListaTemp(listaCidade);
    }

    public String getNomeDaCidade() {
        return nomeDaCidade;
    }

    public void setNomeDaCidade(String nomeDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
    }

    public double getTemp() {
        return Temp;
    }

    public void setTemp(double temp) {
        Temp = temp;
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public String getDescritionClima() {
        return DescritionClima;
    }

    public void setDescritionClima(String descritionClima) {
        DescritionClima = descritionClima;
    }

    @Override
    public int compareTo(Cidade o) {
        return this.getNomeDaCidade().compareTo(o.nomeDaCidade);
    }
}
