import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<String> livros;
    private ConfiguracaoBiblioteca configuracaoBiblioteca;

    public Biblioteca(String horario, double multa) {
        this.livros = new ArrayList<>();
        this.configuracaoBiblioteca = ConfiguracaoBiblioteca.definirConfiguracoes(horario, multa);
    }

    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void exibirConfiguracoes() {
        System.out.println(configuracaoBiblioteca.toString());
    }
}