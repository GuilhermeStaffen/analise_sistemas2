import java.time.LocalDate;

//classe de teste utilizando a implementação da interface de gerenciamento de emprestimos
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Semprestimo gerenciador = new Gemprestimo(biblioteca);
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("1984");
        gerenciador.registrarEmprestimo("O Senhor dos Anéis", "João",
                LocalDate.now().minusDays(5));
        gerenciador.registrarEmprestimo("1984", "Maria",
                LocalDate.now().minusDays(10));
        System.out.println("\nMultas:");
        gerenciador.calcularMultas();
        System.out.println("\nDevolvendo livro 1984...");
        gerenciador.devolverLivro("1984");
        System.out.println("\nMultas após devolução:");
        gerenciador.calcularMultas();
    }
}