package com.example;


public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
    }

    void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }


}
