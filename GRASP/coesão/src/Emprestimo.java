import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

// Classe que representa um empréstimo de livro
public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate
            dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
    }

    public boolean isDevolvido() {
        return devolvido;
    }
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }
    public Livro getLivro() {
        return livro;
    }
    public double calcularMulta() {
        long diasAtraso = ChronoUnit.DAYS.between(dataDeDevolucao,
                LocalDate.now());
        double multaPorDia = 2.0;
        return diasAtraso > 0 ? diasAtraso * multaPorDia : 0.0;
    }
    public boolean estaAtrasado() {
        return LocalDate.now().isAfter(dataDeDevolucao) && !devolvido;
    }
    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " +
                nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}