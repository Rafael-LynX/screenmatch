import Aula3_Desafios.Desafio4.GeradorPrimo;
import Aula3_Desafios.Desafio4.NumeroPrimos;
import Aula3_Desafios.Desafio4.VerificarPrimo;


public class teste {
   public static void main(String[] args) {
        VerificarPrimo verificador = new VerificarPrimo();
        verificador.verificarSeEhPrimo(7); // Exemplo de uso
        verificador.verificarSeEhPrimo(17); // Exemplo de uso

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17); // Exemplo de uso
        System.out.println("Próximo primo após 17: " + proximoPrimo);

        NumeroPrimos numerosPrimos = new NumeroPrimos();
        numerosPrimos.listarPrimos(50); // Exemplo de uso

   }
}
