import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        IEstrategiaMulta estrategiaLivro = new EstrategiaMultaLivro();
        IEstrategiaMulta estrategiaRevista = new EstrategiaMultaRevista();

        biblioteca.registrarEmprestimo("João", LocalDate.now().minusDays(6), estrategiaLivro);
        biblioteca.registrarEmprestimo("Maria", LocalDate.now().minusDays(1), estrategiaRevista);

        System.out.println("\nCalculando multas:");
        biblioteca.calcularMultas();
    }
}