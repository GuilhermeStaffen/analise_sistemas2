import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//classe destinada ao gerenciamento de emprestimos
public class Gemprestimo {
    private final List<Emprestimo> emprestimos;
    public Gemprestimo() {
        this.emprestimos = new ArrayList<>();
    }
    //função destinada ao registro de emprestimos
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario,
                dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" +
                livro.getTitulo() + "\" para " + nomeDoUsuario);
    }
    //função destinada ao gerenciamento da devolução de emprestimos
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if
            (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) &&
                    !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");

                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }
    //classe destinada ao calculo da multa
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " +
                        emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }
}