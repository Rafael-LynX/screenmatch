package com.example.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Recomendado");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Talvez Recomendado");
        } else {
            System.out.println("Não Recomendado");
        }
    }
}
