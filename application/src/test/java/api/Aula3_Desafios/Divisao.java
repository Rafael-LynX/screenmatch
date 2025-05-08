package api.Aula3_Desafios;

import java.util.Scanner;

public class Divisao {
    Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = leitura.nextInt();
        
        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            leitura.close();
        }
    }
}
