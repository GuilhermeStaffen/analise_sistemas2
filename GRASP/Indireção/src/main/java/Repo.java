import java.util.List;
// Interface para definir o repositório de mídias
public interface Repo {
    void adiciona(Midia midia);
    List<Midia> listar();
}