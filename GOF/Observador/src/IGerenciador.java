public interface IGerenciador {
    void adicionarObservador(IObservador observador);
    void notificarObservadores(Emprestimo emprestimo);
}