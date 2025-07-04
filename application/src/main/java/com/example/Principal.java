package com.example;

import java.util.ArrayList;

import com.example.calculos.CalculadoraDeTempo;
import com.example.model.Episodios;
import com.example.model.Filme;
import com.example.model.Serie;
import com.example.calculos.FiltroRecomendacao;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração fo filme: " + meuFilme.getDuracaoEmMinutos());	

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        meuFilme.avalia(10.0);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de Avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(25);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Total de minutos: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setTotalVisualizacoes(1);
        filtro.filtra(episodios);

        Filme favorito = new Filme("O poderoso chefão", 1972);
        favorito.setDuracaoEmMinutos(175);

        var outro = new Filme("Avatar", 2023);
        outro.setDuracaoEmMinutos(200);
        outro.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outro);

        System.out.println("Tamanho da lista: " +listaDeFilmes.size());
        System.out.println("Primeiro Filme: " +listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);


    }
}
