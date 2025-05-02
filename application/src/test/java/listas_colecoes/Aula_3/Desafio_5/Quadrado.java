package listas_colecoes.Aula_3.Desafio_5;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

   
}
