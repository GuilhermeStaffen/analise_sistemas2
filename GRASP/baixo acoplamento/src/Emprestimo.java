import java.time.LocalDate;

// Classe que representa o emprestimo
public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
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
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}