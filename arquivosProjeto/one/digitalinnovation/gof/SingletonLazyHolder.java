package arquivosProjeto.one.digitalinnovation.gof;

/**
 * Singleton "Lazy Holder"
 *
 * @author Pedro Carneiro
 *
 */

public class SingletonLazyHolder {

    private static class Holder { //encapsula a instancia em um holder
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }
    //Só vai instanciar se a instancia for nula
    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
}
