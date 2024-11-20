import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(String nomeDoUsuario, LocalDate dataDeDevolucao, IEstrategiaMulta estrategia) {
        Emprestimo emprestimo = new Emprestimo(nomeDoUsuario, dataDeDevolucao, estrategia);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + nomeDoUsuario);
    }

    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                if (multa > 0) {
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
                }
            }
        }
    }
}