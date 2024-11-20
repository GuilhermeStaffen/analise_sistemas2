import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ITipoMidia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(ITipoMidia midia) {
        midias.add(midia);
    }

    public void exibirBiblioteca() {
        for (ITipoMidia midia : midias) {
            midia.exibirDetalhes();
        }
    }
}