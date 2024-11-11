//classe de gerenciamento de notificações
public class Notifica {
    // notifica a respeito do atraso
    public void notificar(@org.jetbrains.annotations.NotNull Emprestimo emprestimo) {
        String email = emprestimo.getEmailDoUsuario();
        String tituloLivro = emprestimo.getLivro().getTitulo();
        long diasAtraso = emprestimo.calcularDiasAtraso();
        double valorMulta = diasAtraso * 2.0;
// simula e-mail
        Email(email, "Multa", "Você tem uma multa de R$ " + valorMulta + " referente ao livro \"" + tituloLivro + "\".");
    }
    // envia o e-mail
    private void Email(String email, String assunto, String mensagem) {
        System.out.println("Destinatário: " + email);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}