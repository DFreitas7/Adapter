package tsi.adapter;

public class Adapter {

    public static void main(String[] args) {
        Cliente clienteGratuito = new Cliente(EnumTipoCliente.GRATUITO);
        Cliente clienteBasico = new Cliente(EnumTipoCliente.BASICO);
        Cliente clienteUltimate = new Cliente(EnumTipoCliente.ULTIMATE);
        
        
        clienteGratuito.getSGBD().acessarUsuario();
        clienteGratuito.getSGBD().realizarTransacao();
    
        clienteBasico.getSGBD().acessarUsuario();
        clienteBasico.getSGBD().realizarTransacao();
        
        clienteUltimate.getSGBD().acessarUsuario();
        clienteUltimate.getSGBD().realizarTransacao();
    
    }
}
