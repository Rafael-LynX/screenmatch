
public class Calculadora {
    public static void main(String[] args) {
        Calculadora numero = new Calculadora();
        numero.soma(10);
    }
    
    void soma(int a) {
        System.out.println("Dobro de " + a + " é: " + (a * 2));
    }
}
