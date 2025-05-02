package com.example;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.example.model.Filme;
import com.example.model.Serie;
import com.example.model.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var outro = new Filme("Interestelar", 2014);
        outro.avalia(10);
        Serie lost = new Serie("Lost", 2004);

        Filme f1 = outro;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(outro);
        lista.add(lost); // Isso não compila, pois lost é uma série e não um filme
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String>buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Brad Pitt");
        buscaPorArtista.add("Tom Hanks");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de titulos ordenados por ano de lançamento");
        System.out.println(lista);




    }
}
