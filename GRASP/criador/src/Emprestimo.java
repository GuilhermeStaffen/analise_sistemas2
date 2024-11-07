// Classe que representa um empréstimo de livro
// NÃO HOUVE ALTERAÇÃO NA CLASSE PARA SOLUÇÃO DO PROBLEMA
public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    public Emprestimo(Livro livro, String nomeDoUsuario) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
    }
    @Override
    public String toString() {
        return "Livro emprestado: " + livro.getTitulo() + " para "+ nomeDoUsuario;
    }
}
