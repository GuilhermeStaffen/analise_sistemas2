import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    public Biblioteca() {
        this.emprestimos = new ArrayList < > ();
    }
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
    // Método mal projetado que calcula a multa diretamente

    public void exibirMultas() {
        for(Emprestimo emprestimo: emprestimos) {
            double multa = emprestimo.calcularMulta();
            System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
        }
    }
}