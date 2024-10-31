import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class TesteBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        Emprestimo emprestimo1 = new Emprestimo(livro1, "João", LocalDate.now().minusDays(10), LocalDate.now().minusDays(5));
        Emprestimo emprestimo2 = new Emprestimo(livro2, "Maria", LocalDate.now().minusDays(30), LocalDate.now().minusDays(10));
        biblioteca.registrarEmprestimo(emprestimo1);
        biblioteca.registrarEmprestimo(emprestimo2);

        System.out.println("Multas registradas:");
        biblioteca.exibirMultas();
    }
}