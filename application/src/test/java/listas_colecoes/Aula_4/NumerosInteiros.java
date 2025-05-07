package listas_colecoes.Aula_4;

import java.util.ArrayList;
import java.util.Collections;

public class NumerosInteiros {   
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(6);
        numeros.add(3);
        numeros.add(9);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
    }
}
