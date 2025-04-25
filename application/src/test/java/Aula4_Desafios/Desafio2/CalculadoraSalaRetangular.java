package Aula4_Desafios.Desafio2;
import Aula4_Desafios.Desafio2.CalculoGeometrico; // Importa a interface CalculoGeometrico

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double largura; // Atributo para armazenar a largura da sala
    private double altura; // Atributo para armazenar o altura da sala

    @Override
    public double calcularArea() {
        return  largura * altura; // Cálculo da área
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura); // Cálculo do perímetro  
    }

    public double getLargura() {
        return largura; // Retorna a largura da sala
    }
    public void setLargura(double largura) {
        this.largura = largura; // Define a largura da sala
    }
    public double getAltura() {
        return altura; // Retorna a altura da sala
    }
    public void setAltura(double altura) {
        this.altura = altura; // Define a altura da sala
    }

}
