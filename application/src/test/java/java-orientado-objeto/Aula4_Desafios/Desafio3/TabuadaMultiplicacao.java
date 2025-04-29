package Aula4_Desafios.Desafio3;


public class TabuadaMultiplicacao implements Tabuada {
    int numero; // Atributo para armazenar o número da tabuada
    int resultado; // Atributo para armazenar o resultado da multiplicação

    @Override
    public int mostratTabuada() {
        for (int i = 1; i <= 10; i++) { // Loop para calcular a tabuada de 1 a 10
            resultado = numero * i; // Calcula o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + resultado); // Exibe o resultado da multiplicação
        }
        return resultado; // Retorna o último resultado calculado
    }
    public int getNumero() { // Método para obter o número da tabuada
        return numero; // Retorna o valor do atributo numero
    }
    public void setNumero(int numero) { // Método para definir o número da tabuada
        this.numero = numero; // Atribui o valor do parâmetro ao atributo numero
    }
    public int getResultado() { // Método para obter o resultado da multiplicação
        return resultado; // Retorna o valor do atributo resultado
    }
    public void setResultado(int resultado) { // Método para definir o resultado da multiplicação
        this.resultado = resultado; // Atribui o valor do parâmetro ao atributo resultado
    }



}
