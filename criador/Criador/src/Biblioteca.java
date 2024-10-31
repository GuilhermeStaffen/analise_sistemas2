// Classe mal projetada que gerencia a biblioteca
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Emprestimo emprestimo)
    {
        emprestimos.add(emprestimo);
    }
    
    public void exibirEmprestimos() {

        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }
}