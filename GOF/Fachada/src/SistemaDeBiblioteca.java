import java.time.LocalDate;

public class SistemaDeBiblioteca {
    public static void main(String[] args) {
        BibliotecaFachada fachada = new BibliotecaFachada();
        fachada.adicionarLivro("Teste1", "aaa");
        fachada.adicionarLivro("Teste2", "aaa123");
        fachada.adicionarRevista("National Geographic", 202);
        fachada.adicionarRevista("O Tempo", 201);
        fachada.registrarEmprestimo("O Senhor dos Anéis", "João", LocalDate.now().minusDays(5));
        fachada.calcularMultas();
    }
}