package subsistema2.cep;

import javax.swing.text.PlainView;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {

        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Cidade recuperada";
    }

    public String recuperarEstado(String cep) {
        return "Estado recuperado";
    }
}
