public class NotificadorEmail implements IObservador {
    @Override
    public void atualizar(Emprestimo emprestimo) {
        System.out.println("Enviando e-mail para: " +
                emprestimo.getUsuario().getEmail() +
                " - Lembrete: devolução do livro \"" +
                emprestimo.getLivro().getTitulo() + "\" em breve.");
    }
}