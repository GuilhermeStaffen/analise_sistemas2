import java.time.LocalDate;
// Interface do serviço de emprestimo de livros
public interface Semprestimo {
    void registrarEmprestimo(String tituloDoLivro, String
            nomeDoUsuario, LocalDate dataDeDevolucao);
    void devolverLivro(String tituloDoLivro);
    void calcularMultas();
}