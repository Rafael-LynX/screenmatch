package Aula2_Desafios;

public class Produto {
    private String nome;
    private double preco;

    // Getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem) {
        this.preco -= this.preco * (porcentagem / 100);
    }
}
