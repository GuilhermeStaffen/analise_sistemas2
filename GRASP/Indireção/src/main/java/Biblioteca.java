import java.util.List;

//bilbioteca agora utiliza a classe repo para acessar as midias
public class Biblioteca {
    private Repo repo;  //emprega a classe intermediária
    public Biblioteca(Repo repositorio) {
        this.repo = repositorio;
    }
    public void adicionaMidia(Midia midia) {
        repo.adiciona(midia); //adiciona midia ao diretório
    }
    public void exibirMidias() {
        List<Midia> midias = repo.listar();
        for (Midia midia : midias) {
            midia.exibirDetalhes(); //lista as midias
        }
    }
}