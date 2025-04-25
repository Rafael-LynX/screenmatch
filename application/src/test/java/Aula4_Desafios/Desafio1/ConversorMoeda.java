package Aula4_Desafios.Desafio1;
import Aula4_Desafios.Desafio1.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorDolar;
    private double valorReal;
    
    public double getValorDolar() {
        return valorDolar;
    }
    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }
    
    @Override
    public double converterDolarParaReal() {
        return valorDolar * 5.25; // Exemplo de taxa de conversão
    }
    
    public double getValorReal() {
        return valorReal;
    }
    
    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;


    }
}
