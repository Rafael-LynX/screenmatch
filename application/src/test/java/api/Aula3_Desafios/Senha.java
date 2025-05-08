package api.Aula3_Desafios;

import java.util.Scanner;

public class Senha {
    Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite a senha: ");
            String senha = leitura.nextLine();
            
            try {
                if (senha.equals("123456")) {
                    System.out.println("Senha correta!");
                } else if (senha.length() < 6) {
                    throw new SenhaInvalidaException("Senha inválida! A senha deve ter pelo menos 6 caracteres.");
                } else {
                    throw new SenhaInvalidaException("Senha inválida! A senha deve ser '123456'.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Programa finalizado.");
            }
        }
    }
}
