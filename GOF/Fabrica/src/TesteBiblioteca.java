
public class TesteBiblioteca {
    public TesteBiblioteca() {
    }
 
    public static void main(String[] var0) {
       Biblioteca var1 = new Biblioteca();
       LivrosFactory var2 = new LivrosFactory();
       RevistaFactory var3 = new RevistaFactory();
       var1.adicionarMidia(var2, "Teste Livro", "abbb");
       var1.adicionarMidia(var3, "Teste Revista", "111");
       var1.adicionarMidia(var3, "Teste Revista 2", "222");
       System.out.println("\n Midias na biblioteca:");
       var1.exibirMidias();
    }
 }
 