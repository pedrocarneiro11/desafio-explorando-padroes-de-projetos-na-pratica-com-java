package arquivosProjeto.one.digitalinnovation.gof;

/**
 * Singleton "preguiçoso"
 *
 * @author Pedro Carneiro
 *
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }
//Só vai instanciar se a instancia for nula
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
