package tsi.adapter;

public class MySQLAdapter implements SGBDAdapter {
    private final MySQL mysql;

    public MySQLAdapter() {
        mysql = new MySQL();
    }
    
    @Override
    public void acessarUsuario() {
        mysql.acessarUsuarioMultiplo();
    }
    
    @Override
    public void realizarTransacao() {
        mysql.realizarTransacaoMultipla();
    }
}
