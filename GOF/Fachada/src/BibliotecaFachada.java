import java.time.LocalDate;
public class BibliotecaFachada {
    private GerenciadorDeLivros gerenciadorDeLivros;
    private GerenciadorDeRevistas gerenciadorDeRevistas;
    private GerenciadorDeEmprestimos gerenciadorDeEmprestimos;
    private CalculadoraDeMultas calculadoraDeMultas;
    public BibliotecaFachada() {
        this.gerenciadorDeLivros = new GerenciadorDeLivros();
        this.gerenciadorDeRevistas = new GerenciadorDeRevistas();
        this.gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();
        this.calculadoraDeMultas = new CalculadoraDeMultas();
    }
    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        gerenciadorDeLivros.adicionarLivro(livro);

    }
    public void adicionarRevista(String titulo, int edicao) {
        Revista revista = new Revista(titulo, edicao);
        gerenciadorDeRevistas.adicionarRevista(revista);
    }
    public void registrarEmprestimo(String tituloLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = buscarLivro(tituloLivro);
        if (livro != null) {
            Emprestimo emprestimo = new Emprestimo(livro,
                    nomeDoUsuario, dataDeDevolucao);
            gerenciadorDeEmprestimos.registrarEmprestimo(emprestimo);
        } else {
            System.out.println("Erro: Livro \"" + tituloLivro + "\"não encontrado.");
        }
    }
    public void calcularMultas() {
        for (Emprestimo emprestimo : gerenciadorDeEmprestimos.getEmprestimos()) {
            double multa = calculadoraDeMultas.calcularMulta(emprestimo);
            if (multa > 0) {
                System.out.println("Usuário: " +
                        emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }
    private Livro buscarLivro(String titulo) {
        for (Livro livro : gerenciadorDeLivros.getLivros()) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}