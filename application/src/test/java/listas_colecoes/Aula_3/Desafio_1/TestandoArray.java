package listas_colecoes.Aula_3.Desafio_1;

import java.util.ArrayList;

public class TestandoArray {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        for (String elemento : lista) {
            //System.out.println(elemento);
            lista.forEach(System.out::println);
        }
    }
}
