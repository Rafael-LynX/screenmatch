package listas_colecoes.Aula_4;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class Lista {
    public static void main(String[] args) {
        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>(); // ou LinkedList
        listaPolimorfica.add("A");
        listaPolimorfica.add("B");
        listaPolimorfica.add("C");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>(); // ou ArrayList
        listaPolimorfica.add("A");
        listaPolimorfica.add("B");
        listaPolimorfica.add("C");
        System.out.println("LinkedList: " + listaPolimorfica);

        

    }

}
