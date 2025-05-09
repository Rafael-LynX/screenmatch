package api.Aula4_Desafios;

import com.google.gson.Gson;
class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo("Fusca");
        veiculo.setMarca("Volkswagen");
        veiculo.setAno(1970);
        veiculo.setPreco(15000.00);

        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(veiculo);
        System.out.println(jsonVeiculo);
    }
}
