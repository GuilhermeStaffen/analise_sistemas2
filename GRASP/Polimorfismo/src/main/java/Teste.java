public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Interfacemidia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Interfacemidia revista1 = new Revista("National Geographic", 202);
        Interfacemidia livro2 = new Livro("1984", "George Orwell");
        biblioteca.addMidia(livro1);
        biblioteca.addMidia(revista1);
        biblioteca.addMidia(livro2);
        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibeMidia();
    }
}