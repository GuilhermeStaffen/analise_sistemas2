
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Emprestimo> emprestimos;
    private IPagamento pagamentoMulta;

    public Biblioteca(IPagamento pagamentoMulta) {
        this.emprestimos = new ArrayList<>();
        this.pagamentoMulta = pagamentoMulta;
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario,LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario,dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    public void processarPagamentosDeMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()
                    && emprestimo.calcularDiasAtraso() > 0) {
                double multa = emprestimo.calcularMulta();
                pagamentoMulta.efetuarPagamento(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}
