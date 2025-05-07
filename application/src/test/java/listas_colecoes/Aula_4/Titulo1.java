package listas_colecoes.Aula_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Titulo1 implements Comparable<Titulo1> {
    private String nome;

    @Override
    public int compareTo(Titulo1 outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return "Titulo1{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Titulo1 t1 = new Titulo1();
        t1.nome = "A";
        Titulo1 t2 = new Titulo1();
        t2.nome = "B";
        Titulo1 t3 = new Titulo1();
        t3.nome = "C";

        ArrayList<Titulo1> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);

        Collections.sort(lista);
        for (Titulo1 titulo : lista) {
            System.out.println(titulo);
        }
        
    }

}
