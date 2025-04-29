package Aula2_Desafios;

public class ContaBancaria {
    public String titular;
    private int numeroConta;
    private double saldo;

    //Getters
    public String getTitular() {
        return titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

