public class Livro implements ITipoMidia {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}