import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeEmprestimo;
    private LocalDate dataDeDevolucao;
    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeEmprestimo, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    //Entendemos que a classe EMPRESTIMO era a classe que mais tinha informações sobre o emprestimo, logo é quem seria a 
    // classe mais especializada para controlar o calculo da multa. Sendo assim, inserimos essa funcionalidade aqui.
    public double calcularMulta() {
        long diasAtraso = ChronoUnit.DAYS.between(this.getDataDeDevolucao(), LocalDate.now());
        double multaPorDia = 2.0;
        if(diasAtraso > 0) {
            return diasAtraso * multaPorDia;
        }
        return 0.0;
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
    @Override
    public String toString() {
        return "Livro emprestado: " + livro.getTitulo() + " para " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}
