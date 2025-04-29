package Aula3_Desafios.Desafio4;

public class GeradorPrimo extends NumeroPrimos{
    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoPrimo = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoPrimo)) {
            proximoPrimo++;
        }
        return proximoPrimo;    
    }
}
