package listas_colecoes.Aula_1;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade;
    }
}
