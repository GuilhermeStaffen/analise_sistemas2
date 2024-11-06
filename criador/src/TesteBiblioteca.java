import java.util.List;

public class TesteBiblioteca {
    public static void main(String[] args) {
        List<Emprestimo> emprestimos;

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        //Entendemos que o objeto EMPRESTIMO deveria ser criado nesta classe. Criamos um objeto para cada livro emprestado
        // e comunicamos a classe BIBLIOTECA que este emprestimo ocorreu.
        Emprestimo emprestimo1 = new Emprestimo(livro1, "João");
        Emprestimo emprestimo2 = new Emprestimo(livro2, "Maria");
        biblioteca.registrarEmprestimo(emprestimo1);
        biblioteca.registrarEmprestimo(emprestimo2);

        System.out.println("Empréstimos registrados");

        biblioteca.exibirEmprestimos();
    }
}   
