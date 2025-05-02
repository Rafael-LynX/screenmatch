package listas_colecoes.Aula_3.Desafio_6;

import java.util.ArrayList;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

   public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria(12345, 1000.0);
    ContaBancaria conta2 = new ContaBancaria(67890, 2000.0);
    ContaBancaria conta3 = new ContaBancaria(54321, 1500.0);


    ArrayList<ContaBancaria> listaContas = new ArrayList<>();
    listaContas.add(conta1);
    listaContas.add(conta2);
    listaContas.add(conta3);

    ContaBancaria contaMaiorSaldo = listaContas.get(0);
    for (ContaBancaria conta : listaContas) {
        if (conta.saldo > contaMaiorSaldo.saldo) {
            contaMaiorSaldo = conta;
        }
    }
    System.out.println("Conta com maior saldo: " + contaMaiorSaldo.numeroConta + ", Saldo: " + contaMaiorSaldo.saldo);
}
}
