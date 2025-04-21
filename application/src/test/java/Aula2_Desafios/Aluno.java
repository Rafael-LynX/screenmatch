package Aula2_Desafios;

public class Aluno {
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    // Getters
    public String getNome() {
        return nome;
    }
    public int getNota1() {
        return nota1;
    }
    public int getNota2() {
        return nota2;
    }
    public int getNota3() {
        return nota3;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int calculaMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

}
