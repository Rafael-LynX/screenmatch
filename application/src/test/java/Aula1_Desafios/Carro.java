package Aula1_Desafios;
public class Carro {
    String cor;
    String modelo;
    int anoDeLancamento;
    int anoAtual;
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cor = "Preto";
        carro.modelo = "Fusca";
        carro.anoDeLancamento = 1968;
        carro.anoAtual = 2025;
        carro.exibeFichaTecnica();
        carro.idadeDoCarro();
    }
    
    void exibeFichaTecnica() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
    }

    void idadeDoCarro() {
        int idade = this.anoAtual - this.anoDeLancamento;
        System.out.println("Idade do carro: " + idade + " anos");
    }
}
