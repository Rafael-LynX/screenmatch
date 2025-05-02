package listas_colecoes.Aula_3.Desafio_3;

import listas_colecoes.Aula_3.Desafio_2.Animal;
import listas_colecoes.Aula_3.Desafio_2.Cachorro;

public class ModificandoCachorro extends Animal{
    public ModificandoCachorro(String nome, String tipo) {
        super(nome, tipo);
    }
    public static void main(String[] args) {
        Animal animal = new Cachorro("Rex", "Cachorro");
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal; // Casting para Cachorro
            System.out.println("Nome: " + cachorro.getNome());
            System.out.println("Tipo: " + cachorro.getTipo());
        } else {
            System.out.println("O objeto não é um cachorro.");
        }
    }
}
