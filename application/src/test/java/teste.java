
import Aula4_Desafios.Desafio4.ConversorTemperaturaPadrao;

public class teste {
   public static void main(String[] args) {
      ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao(); // Cria uma instância do conversor de temperatura
      double celsius = 25.0; // Define a temperatura em Celsius
      double fahrenheit = conversor.celsiusParaFahrenheit(celsius); // Converte Celsius para Fahrenheit
      System.out.println(celsius + "°C = " + fahrenheit + "°F"); // Exibe o resultado da conversão
      fahrenheit = 77.0; // Define a temperatura em Fahrenheit
      celsius = conversor.fahrenheitParaCelsius(fahrenheit); // Converte Fahrenheit para Celsius
      System.out.println(fahrenheit + "°F = " + celsius + "°C"); // Exibe o resultado da conversão
      
      

   }
}
