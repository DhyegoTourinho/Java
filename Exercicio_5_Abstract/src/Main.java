import Entities.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            String numeroStr = JOptionPane.showInputDialog("Digite o número da conta (0 para sair):");
            int numero = Integer.parseInt(numeroStr);

            if (numero == 0) {
                break;
            }

            String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
            Cliente cliente = new Cliente(nome, telefone);

            String tipoContaStr = JOptionPane.showInputDialog("Digite o tipo da conta (1-Corrente, 2-Conta Salário, 3-Poupança):");
            int tipoConta = Integer.parseInt(tipoContaStr);

            Conta conta;
            if (tipoConta == 1) {
                conta = new ContaCorrente(numero, cliente);
            } else if (tipoConta == 2) {
                conta = new ContaSalario(numero, cliente);
            } else {
                conta = new ContaPoupanca(numero, cliente);
            }

            contas.add(conta);
        }

        for (Conta conta : contas) {
            JOptionPane.showMessageDialog(null, conta.toString());
        }
    }
}
