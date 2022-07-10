package arquivosProjeto.subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente " + nome + " salvo no sistema de CRM.");
        System.out.println("Cep " + cep + " salvo no sistema de CRM.");
        System.out.println("Cidade " + cidade + " salvo no sistema de CRM.");
        System.out.println("Estado " + estado + " salvo no sistema de CRM.");
    }
}
