package Aula4_Desafios.Desafio5;

public class Livro implements Calculavel {
    private String titulo;
    private String autor;
    private double preco;
    private boolean isProdutoFisico;

    public boolean isProdutoFisico() {
        return isProdutoFisico;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPreco(double preco) {
        
        this.preco = preco;
    }
    public void setProdutoFisico(boolean isProdutoFisico) {
        this.isProdutoFisico = isProdutoFisico;
    }

    @Override
    public double calcularPrecoFinal() {
        if (isProdutoFisico){
            return preco - (preco * 0.2); // Desconto de 10% se o preço for maior que 50
         }
        return preco;
    }   


}
