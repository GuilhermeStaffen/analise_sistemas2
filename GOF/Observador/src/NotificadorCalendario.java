
public class NotificadorCalendario implements IObservador {
    @Override
    public void atualizar(Emprestimo emprestimo) {
        System.out.println("Registrando no calendário de " +
                emprestimo.getUsuario().getNome() +
                ": Devolução do livro \"" +
                emprestimo.getLivro().getTitulo() + "\" em " +
                emprestimo.getDataDeDevolucao());
    }
}