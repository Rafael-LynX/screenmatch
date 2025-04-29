package Aula3_Desafios.Desafio4;

public class VerificarPrimo extends NumeroPrimos{
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
    
}
