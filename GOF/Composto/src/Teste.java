public class Teste {
    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    // Adicionando mídias individuais
    ITipoMidia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
    ITipoMidia revista1 = new Revista("National Geographic", 202);
    biblioteca.adicionarMidia(livro1);
    biblioteca.adicionarMidia(revista1);

    ITipoMidia livro2 = new Livro("asdasd", "asdasda");
    ITipoMidia revista2 = new Revista("aaaaa", 201);
     ColecaoDeMidias colecao = new ColecaoDeMidias("Coleção Fantasia");
    colecao.adicionarMidia(livro2);
    colecao.adicionarMidia(revista2);
    biblioteca.adicionarMidia(colecao);

    System.out.println("\nBiblioteca:");
    biblioteca.exibirBiblioteca();
    }
}