package listas_colecoes.Aula_3.Desafio_4;


import java.util.ArrayList;

public class Produto2 {
    private String nome;
    private double preco;
    private double media;

    public Produto2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        ArrayList<Produto2> produtos = new ArrayList<>();
        produtos.add(new Produto2("Produto 1", 10.0));
        produtos.add(new Produto2("Produto 2", 20.0));
        produtos.add(new Produto2("Produto 3", 30.0));

        double soma = 0;
        for (Produto2 produto : produtos) {
            soma += produto.getPreco(); // Soma os preços dos produtos        
        }

        double media = soma / produtos.size(); // Calcula a média dos preços
        System.out.println("A média dos preços é: " + media);
    }
}
