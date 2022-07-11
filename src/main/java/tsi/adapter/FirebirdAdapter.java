package tsi.adapter;

public class FirebirdAdapter implements SGBDAdapter {
    private final Firebird firebird;

    public FirebirdAdapter() {
        firebird = new Firebird();
    }
    
    @Override
    public void acessarUsuario() {
        firebird.acessarUsuarioMultiplo();
    }
    
    @Override
    public void realizarTransacao() {
        firebird.realizarTransacaoUnica();
    }
}
