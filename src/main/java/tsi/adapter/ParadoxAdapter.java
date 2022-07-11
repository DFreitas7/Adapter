package tsi.adapter;

public class ParadoxAdapter implements SGBDAdapter {
    private final Paradox paradox;

    public ParadoxAdapter() {
        paradox = new Paradox();
    }
    
    @Override
    public void acessarUsuario() {
        paradox.acessarUsuarioUnico();
    }
    
    @Override
    public void realizarTransacao() {
        paradox.realizarTransacaoUnica();
    }
}
