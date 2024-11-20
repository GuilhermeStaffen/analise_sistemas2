public class LivrosFactory implements IMidiaFactory {
    @Override
    public ITipoMidia criarMidia(String titulo, String autor) {
        //Toda vez que uma midia de livro for criada, criaremos o objeto Livro
        return new Livro(titulo, autor); 
    }
}
