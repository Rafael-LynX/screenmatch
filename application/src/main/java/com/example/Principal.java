package com.example;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        meuFilme.avalia(10.0);
        System.out.println("Nova Avaliação: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de Avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Média de Avaliações: " + meuFilme.pegaMedia());

    }
}
