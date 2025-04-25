package Aula4_Desafios.Desafio4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double temperaturaCelsius;
    private double temperaturaFahrenheit;

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        this.temperaturaCelsius = celsius;
        this.temperaturaFahrenheit = (celsius * 9/5) + 32; // Fórmula de conversão de Celsius para Fahrenheit
        return temperaturaFahrenheit;
    }
    
    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        this.temperaturaFahrenheit = fahrenheit;
        this.temperaturaCelsius = (fahrenheit - 32) * 5/9; // Fórmula de conversão de Fahrenheit para Celsius
        return temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }
    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }
    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }
    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }


    
}
