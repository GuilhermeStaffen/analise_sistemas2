import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class TesteBiblioteca {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        // Funcionalidade 1: Registrar empréstimos
        controller.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        controller.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));

        // Funcionalidade 3: Exibir multas
        controller.exibirMultas();

        // Funcionalidade 2: Devolver um livro
        System.out.println("\nDevolvendo livro 1984...");
        controller.devolverLivro(livro2);

        // Funcionalidade 3: Exibir multas novamente
        controller.exibirMultas();

        // Funcionalidade 4: Consultar livros em atraso
        controller.consultarLivrosEmAtraso();
    }

}