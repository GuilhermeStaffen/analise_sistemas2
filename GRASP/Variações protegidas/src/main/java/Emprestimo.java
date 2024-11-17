import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate Devolucao;
    private boolean devolvido;
    private Calculadora calculadora;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate Devolucao, Calculadora calculadora) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.Devolucao = Devolucao;
        this.devolvido = false;
        this.calculadora = calculadora; // Agora recebe uma instância de Calculadora
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public double calculadora() {
        return calculadora.calcular(Devolucao, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: " + Devolucao;
    }
}
