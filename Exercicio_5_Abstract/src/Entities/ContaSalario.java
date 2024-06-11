package Entities;

public class ContaSalario extends ContaCorrente {

    public ContaSalario(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + 0.01);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.01);
    }
}
