public class Revista implements ITipoMidia {
    private String titulo;
    private int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + ", Edição: " + edicao);
    }
}