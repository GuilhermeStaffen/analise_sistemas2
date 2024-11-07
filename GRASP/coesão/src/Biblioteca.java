import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

// Classe biblioteca sem as funções irrelevantes para a mesma.
public class Biblioteca {
    private List<Livro> livros; // Gerencia os livros
    private List<Emprestimo> emprestimos; // Gerencia os empréstimos
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }
    // Função para adicionar um livro
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    // Função para encontrar um livro pelo título
    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}