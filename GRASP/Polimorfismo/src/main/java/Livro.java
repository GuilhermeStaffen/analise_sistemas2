// a classe livro agora utiliza a interface de midia
public class Livro implements Interfacemidia {
    private String titulo;
    private String autor;
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    @Override
    public String Titulo() {
        return titulo;
    }
    @Override
    public void Detalhes() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }
}