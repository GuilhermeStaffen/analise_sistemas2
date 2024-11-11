import java.util.ArrayList;
import java.util.List;
// classe de biblioteca refeita para utilizar a interface criada aplicando o polimorfismo
public class Biblioteca {
    private List<Interfacemidia> midias; //implementação da interface para utilização da lista de midias existentes

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }
    public void addMidia(Interfacemidia midia) {
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.Titulo());
    }
    public void exibeMidia() {
        for (Interfacemidia midia : midias) {
            midia.Detalhes();
        }
    }
}