package arquivosProjeto.one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author Pedro Carneiro
 *
 */

public class SingletonEager {
//Já comeca instanciado
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
        }
    }

