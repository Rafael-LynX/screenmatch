package com.example.calculos;
import com.example.model.Filme;
import com.example.model.Serie;
import com.example.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    // }
    // public void inclui(Filme f) {
    //     tempoTotal += f.getDuracaoEmMinutos();
    // }

    // public void inclui(Serie s) {
    //     tempoTotal += s.getDuracaoEmMinutos();
    // }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando o título: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
