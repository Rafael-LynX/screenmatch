package Aula2_Desafios;

public class IdadePessoa {
    private String nome;
    private int idade;

    // Getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade < 18) {
            System.out.println(nome + " é menor de idade.");
        } else {
            System.out.println(nome + " é maior de idade.");
        }
    }
}
