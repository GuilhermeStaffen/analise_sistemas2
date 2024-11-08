
import java.time.LocalDate;

public class TesteBiblioteca {

    public static void main(String[] args) {

        ServicoPagamentoExterno servicoExterno = new ServicoPagamentoExterno();
        IPagamento adaptadorPagamento = new AdaptadorPagamento(servicoExterno);

        Biblioteca biblioteca = new Biblioteca(adaptadorPagamento);
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");
        biblioteca.registrarEmprestimo(livro1, "João",LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria",LocalDate.now().minusDays(10));
        System.out.println("\nProcessando pagamentos de multas:");
        biblioteca.processarPagamentosDeMultas();
    }
}
