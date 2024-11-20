import java.time.LocalDate;

public class Emprestimo {
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private IEstrategiaMulta estrategiaDeMulta;
    private boolean devolvido;

    public Emprestimo(String nomeDoUsuario, LocalDate dataDeDevolucao, IEstrategiaMulta estrategiaDeMulta) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.estrategiaDeMulta = estrategiaDeMulta;
        this.devolvido = false;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public double calcularMulta() {
        return estrategiaDeMulta.calcularMulta(dataDeDevolucao);
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }
}