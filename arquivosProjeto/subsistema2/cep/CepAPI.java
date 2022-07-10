package arquivosProjeto.subsistema2.cep;


public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String Cep){
        return "cidadeQualquer";
    }

    public String recuperarEstado(String Cep){
        return "estadoQualquer";
    }
}
