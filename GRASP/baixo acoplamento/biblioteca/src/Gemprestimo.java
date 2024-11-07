import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//classe que implementa  o serviço de emprestimo
public class Gemprestimo implements Semprestimo {
    private List<Emprestimo> emprestimos;
    private Biblioteca biblioteca;
    public Gemprestimo(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.emprestimos = new ArrayList<>();
    }
    @Override
    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao)
    { Livro livro = biblioteca.encontrarLivro(tituloDoLivro);
        if (livro != null) {
            Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: Livro \"" + tituloDoLivro + "\" para " + nomeDoUsuario);}
        else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\"  não encontrado.");}
    }
    @Override
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if
            (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) &&
                    !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\"  devolvido com sucesso.");
                return;}
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não  ncontrado ou devolvido.");}
    @Override
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);}
        }
    }
}