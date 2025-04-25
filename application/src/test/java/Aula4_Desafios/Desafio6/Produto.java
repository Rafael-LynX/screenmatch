package Aula4_Desafios.Desafio6;

public class Produto implements Vendavel {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularDescontoDeQuantidadeComprada() {
        if (quantidade > 10) {
            return preco * 0.1; // 10% de desconto se comprar mais de 10 unidades
        } else if (quantidade <= 10) {
            return preco * 0.05; // 5% de desconto se comprar mais de 5 unidades
        } else {
            return 0; // Sem desconto
        }
    }

    @Override
    public double calcularPrecoTotal() {
        double desconto = calcularDescontoDeQuantidadeComprada();
        return preco - desconto;

    }

}
