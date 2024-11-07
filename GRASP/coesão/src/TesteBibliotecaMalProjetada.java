import java.time.LocalDate;

//calsse de teste ajustado para funcionar levando em conta a classe Gemprestimo
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Gemprestimo gemprestimo = new
                Gemprestimo();
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("1984");
        Livro livro1 = biblioteca.encontrarLivro("O Senhor dos Anéis");
                Livro livro2 = biblioteca.encontrarLivro("1984");
        if (livro1 != null) {
            gemprestimo.registrarEmprestimo(livro1, "João",
                    LocalDate.now().minusDays(5));
        }
        if (livro2 != null) {
            gemprestimo.registrarEmprestimo(livro2, "Maria",
                    LocalDate.now().minusDays(10));
        }
        System.out.println("\nMultas:");
        gemprestimo.calcularMultas();
        System.out.println("\nDevolvendo livro 1984...");
        gemprestimo.devolverLivro("1984");
        System.out.println("\nMultas após devolução:");
        gemprestimo.calcularMultas();
    }
}