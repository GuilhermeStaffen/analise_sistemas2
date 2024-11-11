public class Teste {
    public static void main(String[] args) {
        Repo repositorio = new Implementrepo(); // utilização do repositório em memória
        Biblioteca biblioteca = new Biblioteca(repositorio);
        Midia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Midia revista1 = new Revista("National Geographic", 202);
        biblioteca.adicionaMidia(livro1);
        biblioteca.adicionaMidia(revista1);
        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}