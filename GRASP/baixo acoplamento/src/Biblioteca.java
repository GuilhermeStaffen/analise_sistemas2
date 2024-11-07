import java.util.ArrayList;
import java.util.List;
//classe bliblioteca sem as funções de gerenciamento de impréstimo diretamente
public class Biblioteca {
    private List<Livro> livros;
    public Biblioteca() {this.livros = new ArrayList<>();}
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");}
    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;}
        }
        return null;}
}