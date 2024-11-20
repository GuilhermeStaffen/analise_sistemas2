public class RevistaFactory implements IMidiaFactory {

    @Override
    public ITipoMidia criarMidia(String titulo, String edicao) {
        //Toda vez que uma midia de revista for criada, criaremos o objeto Revista
        return new Revista(titulo, Integer.parseInt(edicao));
    }
}