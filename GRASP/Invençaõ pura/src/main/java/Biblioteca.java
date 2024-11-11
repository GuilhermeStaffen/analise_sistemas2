import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//biblioteca agora utilizando a classe notifica
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private Notifica notificador; //classe externa ao dominio sendo empregada
    public Biblioteca(Notifica notificador) {
        this.emprestimos = new ArrayList<>();
        this.notificador = notificador;
    }
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, String emailDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, emailDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }
    //metodo de notificar usuário delega a ação para a classe externa
    public void notificaratraso() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.calcularDiasAtraso() > 0) {
                notificador.notificar(emprestimo);
            }
        }
    }
}