import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        GerenciadorDeEmprestimos gerenciador = new GerenciadorDeEmprestimos();

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        NotificadorCalendario notificadorCalendario = new NotificadorCalendario();

        gerenciador.adicionarObservador(notificadorEmail);
        gerenciador.adicionarObservador(notificadorCalendario);

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R.Tolkien");
        Usuario usuario = new Usuario("João", "joao@email.com");
        Emprestimo emprestimo = new Emprestimo(livro, usuario,LocalDate.now().plusDays(3));
        gerenciador.registrarEmprestimo(emprestimo);
        
    }
}