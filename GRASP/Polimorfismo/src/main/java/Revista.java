// a classe revista agora faz uso da interface de midia
public class Revista implements Interfacemidia {
    private String titulo;
    private int edicao;
    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }
    @Override
    public String Titulo() {
        return titulo;
    }
    @Override
    public void Detalhes() {
        System.out.println("Revista: " + titulo + ", Edição: " + edicao);
    }
}