package listas_colecoes.Aula_3.Desafio_2;

public class Cachorro extends Animal {

    public Cachorro(String nome, String tipo) {
        super(nome, tipo);
    }
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Cachorro");
        Animal animal = (Animal) cachorro; // Casting para Animal
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Tipo: " + animal.getTipo());
    }  
}
