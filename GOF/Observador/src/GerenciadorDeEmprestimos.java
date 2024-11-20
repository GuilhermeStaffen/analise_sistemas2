import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEmprestimos implements IGerenciador {

    private List<Emprestimo> emprestimos;
    private List<IObservador> observadores;

    public GerenciadorDeEmprestimos() {
        this.emprestimos = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + emprestimo.getUsuario().getNome());
        notificarObservadores(emprestimo);
    }

    @Override
    public void adicionarObservador(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarObservadores(Emprestimo emprestimo) {
        for (IObservador observador : observadores) {
            observador.atualizar(emprestimo);
        }
    }

    public void verificarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() >= 0) {
                notificarObservadores(emprestimo);
            }
        }
    }
}