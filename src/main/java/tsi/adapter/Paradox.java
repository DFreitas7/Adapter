package tsi.adapter;

public class Paradox {
    public void acessarUsuarioUnico() {
        System.out.println("Paradox: Acessando MySQL no modo usuário único");
    }
    public void realizarTransacaoUnica() {
        System.out.println("Paradox: Realizando transações no MySQL no modo de transação única");
    }
}
