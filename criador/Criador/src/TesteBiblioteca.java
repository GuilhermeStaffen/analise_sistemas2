import java.util.List;

public class TesteBiblioteca {
    public static void main(String[] args) {
        List<Emprestimo> emprestimos;

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        Emprestimo emprestimo1 = new Emprestimo(livro1, "João");
        Emprestimo emprestimo2 = new Emprestimo(livro2, "Maria");
        biblioteca.registrarEmprestimo(emprestimo1);
        biblioteca.registrarEmprestimo(emprestimo2);

        System.out.println("Empréstimos registrados");

        biblioteca.exibirEmprestimos();
    }
}   