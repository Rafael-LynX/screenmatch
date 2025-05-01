package com.example;

import java.util.ArrayList;

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

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(outro);
        lista.add(lost); // Isso não compila, pois lost é uma série e não um filme
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item; // Isso pode lançar uma ClassCastException se o item não for um Filme
        }


    }
}
