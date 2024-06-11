package Entities;



public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Dhyego", "62 996204444");
        Cliente cliente2 = new Cliente("Sara", "14 995548412");

        ContaCorrente contaCorrente = new ContaCorrente(1, cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, cliente2);

        // Testando ContaCorrente
        contaCorrente.depositar(100);
        contaCorrente.sacar(50);
        System.out.println(contaCorrente);

        // Testando ContaPoupanca
        contaPoupanca.depositar(200);
        contaPoupanca.sacar(50);
        contaPoupanca.atualizaSaldo(10);
        System.out.println(contaPoupanca);

        // Transferência
        contaCorrente.transferir(20, contaPoupanca);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
