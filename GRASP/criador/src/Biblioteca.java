// Classe mal projetada que gerencia a biblioteca
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    //Removida a necessidade de instanciar o objeto "EMPRESTIMO". Agora o método recebe o objeto emprestimo que é criado pela classe TesteBiblioteca.
    //Na nova implementação, o método registrarEmprestimo apenas controla a lista dos emprestimos em aberto.
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
