import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ITipoMidia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(IMidiaFactory fabrica, String titulo, String detalhe) {
        ITipoMidia midia = fabrica.criarMidia(titulo, detalhe);
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    public void exibirMidias() {
        for (ITipoMidia midia : midias) {
            midia.exibirDetalhes();
        }
    }
}