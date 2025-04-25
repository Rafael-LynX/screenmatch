package Aula4_Desafios.Desafio6;

public class Servico implements Vendavel {
    private String nome;
    private double preco;
    private int horasDeServico;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getHorasDeServico() {
        return horasDeServico;
    }
    public void setHorasDeServico(int horasDeServico) {
        this.horasDeServico = horasDeServico;
    }
    
    @Override
    public double calcularDescontoDeQuantidadeComprada() {
        if (horasDeServico <= 6) {
            return preco * 0.03; 
        } else if (horasDeServico >= 12) {
            return preco * 0.06; 
        } else {
            return 0; // Sem desconto
        }
    }

    @Override
    public double calcularPrecoTotal() {
        double desconto = calcularDescontoDeQuantidadeComprada();
        return preco - desconto;

    }
    
}
