package Aula4_Desafios.Desafio5;

public class ProdutoFisico implements Calculavel {
    private String nome;
    private double preco;
    private boolean isProdutoFisico;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public boolean isProdutoFisico() {
        return isProdutoFisico;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setProdutoFisico(boolean isProdutoFisico) {
        this.isProdutoFisico = isProdutoFisico;
    }
    @Override
    public double calcularPrecoFinal() {
        if (isProdutoFisico) {
            return preco + (preco * 0.1); // Aumento de 10% se o preço for maior que 50
        }
        return preco;
    }

}
