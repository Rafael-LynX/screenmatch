package listas_colecoes;

import java.util.ArrayList;


public class Principal1 {
    public static void main(String[] args) {
        // Cria uma lista de pessoas
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Adiciona pessoas à lista
        listaDePessoas.add(new Pessoa("João", 25));
        listaDePessoas.add(new Pessoa("Maria", 30));
        listaDePessoas.add(new Pessoa("Pedro", 22));

        // Imprime a lista de pessoas
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista de pessoas: " + listaDePessoas);
    }
    
    
    



}
