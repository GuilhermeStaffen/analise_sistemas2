import java.time.LocalDate;
public class Teste {
    public static void main(String[] args) {
        Notifica notificador = new Notifica();
        Biblioteca biblioteca = new Biblioteca(notificador);
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");
        biblioteca.registrarEmprestimo(livro1, "João", "joao@email.com", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", "maria@email.com", LocalDate.now().minusDays(10));
        System.out.println("\nNotificando usuários com atraso:");
        biblioteca.notificaratraso();
    }
}