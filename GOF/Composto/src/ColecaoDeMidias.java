import java.util.ArrayList;
import java.util.List;

public class ColecaoDeMidias implements ITipoMidia {
    private String nome;
    private List<ITipoMidia> midias;
    public ColecaoDeMidias(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }
    public void adicionarMidia(ITipoMidia midia) {
        midias.add(midia);
    }
    @Override
    public String getTitulo() {
        return nome;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Coleção: " + nome);
        for (ITipoMidia midia : midias) {
            midia.exibirDetalhes();
        }
    }
}