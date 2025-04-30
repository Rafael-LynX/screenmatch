package listas_colecoes.Aula_2;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco; 
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Preço: " + this.preco + ", Quantidade: " + this.quantidade;
    }


    public static void main(String[] args) {
        // Cria uma lista de produtos
        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
        // Adiciona produtos à lista
        listaDeProdutos.add(new Produto("Produto A", 10.0, 5));
        listaDeProdutos.add(new Produto("Produto B", 20.0, 3));
        listaDeProdutos.add(new Produto("Produto C", 15.0, 8));

        // Imprime a lista de produtos
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Primeiro Produto: " + listaDeProdutos.get(0));
        System.out.println("Lista de produtos: " + listaDeProdutos);

        System.out.println();
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto Perecível", 5.0, 10, "2023-12-31");
        System.out.println("Produto Perecível: " + produtoPerecivel);

        
    }
}
