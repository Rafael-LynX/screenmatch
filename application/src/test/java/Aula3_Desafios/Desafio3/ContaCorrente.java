package Aula3_Desafios.Desafio3;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de: " + tarifaMensal + " cobrada com sucesso! Saldo atual: " + saldo);
    }
}
