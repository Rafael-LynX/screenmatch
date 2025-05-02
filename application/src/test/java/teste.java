import java.util.ArrayList;

import listas_colecoes.Aula_3.Desafio_5.Forma;
import listas_colecoes.Aula_3.Desafio_5.Circulo;
import listas_colecoes.Aula_3.Desafio_5.Quadrado;

public class teste {
  
     public static void main(String[] args) {
          Circulo circulo = new Circulo(5.0);
          Quadrado quadrado = new Quadrado(4.0);

          ArrayList<Forma> listaFormas = new ArrayList<>();
          listaFormas.add(circulo);
          listaFormas.add(quadrado);

          for (Forma forma : listaFormas) {
              System.out.println("Área: " + forma.calcularArea());
          }

     }
  
      

   
}
