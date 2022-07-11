package tsi.adapter;

public class Cliente {
    private SGBDAdapter sgbdAdapter;
    private final EnumTipoCliente tipoCliente;
    
    Cliente(EnumTipoCliente tipoCliente) {
        switch (tipoCliente) {
            case GRATUITO:
                sgbdAdapter = new ParadoxAdapter();
                break;
            case BASICO:
                sgbdAdapter = new FirebirdAdapter();
                break;
            case ULTIMATE:
                sgbdAdapter = new MySQLAdapter();
                break;
            default:
                break;
        }
        
        this.tipoCliente = tipoCliente;
    }
    
    SGBDAdapter getSGBD() {
        System.out.println("Acessando banco de um Cliente "+tipoCliente.toString());
        return sgbdAdapter;
    }
}
