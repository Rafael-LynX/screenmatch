package Aula2_Desafios;

public class Livro {
    private String autor;
    private String titulo;

    // Getters
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    // Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Autor: " + this.autor);
        System.out.println("Título: " + this.titulo);
    }

}
