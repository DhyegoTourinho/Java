package Entities;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, Cliente clienteTeste) {
        super(numero, clienteTeste);
    }
    @Override
    public void sacar(double valor) {
        super.sacar(valor + 0.05);
    }
    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.05);
    }

    @Override
    public void transferir(double valor, Conta destino) {

    }
}
