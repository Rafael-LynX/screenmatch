package Aula3_Desafios.Desafio3;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Valor depositado: " + valor);
        System.out.println("Deposito realizado com sucesso!");
    }

    public void sacar(double valor){
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + saldo);
    }
}
