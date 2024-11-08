import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class BibliotecaController {

    //CRIAMOS UMA CONTROLLER PARA A BIBLIOTECA, QUE EFETUA AS MANIPULAÇÕES NECESSÁRIAS
    private Biblioteca biblioteca;

    public BibliotecaController() {
        biblioteca = new Biblioteca();
    }

    public void registrarEmprestimo(String nomeLivro, String nomeDoUsuario, LocalDate dataEmprestimo) {
        Livro livro = new Livro(nomeLivro);
        biblioteca.registrarEmprestimo(livro, nomeDoUsuario, dataEmprestimo);
    }

    public void devolverLivro(Livro livro) {
        biblioteca.devolverLivro(livro);
    }

    public void exibirMultas() {
        System.out.println("\nMultas registradas:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }
    }

    public void consultarLivrosEmAtraso() {
        System.out.println("\nConsultando livros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.estaAtrasado()) {
                System.out.println(emprestimo);
            }
        }
    }
}
