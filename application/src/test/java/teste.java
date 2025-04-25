
import Aula4_Desafios.Desafio6.Produto;
import Aula4_Desafios.Desafio6.Servico;

public class teste {
   public static void main(String[] args) {
      Produto produto = new Produto();
      produto.setNome("Produto A");
      produto.setPreco(100.0);
      produto.setQuantidade(12); 
      System.out.println("Produto: " + produto.getNome());
      System.out.println("Preço original: " + produto.getPreco());
      System.out.println("Desconto: " + produto.calcularDescontoDeQuantidadeComprada());
      System.out.println("Preço total com desconto: " + produto.calcularPrecoTotal());

      System.out.println("--------------------------");

      Servico servico = new Servico();
      servico.setNome("Serviço B");
      servico.setPreco(200.0);
      servico.setHorasDeServico(16); 
      System.out.println("Serviço: " + servico.getNome());
      System.out.println("Preço original: " + servico.getPreco());
      System.out.println("Desconto: " + servico.calcularDescontoDeQuantidadeComprada());
      System.out.println("Preço total com desconto: " + servico.calcularPrecoTotal());
      
      

   }
}
