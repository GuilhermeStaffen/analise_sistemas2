import java.util.ArrayList;
import java.util.List;
// Implementa o respositório para uso em memória
public class Implementrepo implements Repo {
    private List<Midia> midias;
    public Implementrepo() {
        this.midias = new ArrayList<>();
    }
    @Override
    public void adiciona(Midia midia) {
        midias.add(midia);
        System.out.println(midia.getTitulo() + " Adicionada ao repositório");
    }
    @Override
    public List<Midia> listar() {
        return midias;
    }
}