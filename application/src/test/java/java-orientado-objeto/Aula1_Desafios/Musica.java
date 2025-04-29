package Aula1_Desafios;
public class Musica {
    public String artista;
    public String titulo;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.artista = "Caetano Veloso";
        musica.titulo = "Sozinho";
        musica.anoDeLancamento = 1990;
        musica.avaliacao = 9.5;
        musica.numAvaliacoes = 1000;
        musica.exibeFichaTecnica();
    }
    
    void exibeFichaTecnica() {
        System.out.println("Artista: " + this.artista);
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("Número de Avaliações: " + this.numAvaliacoes);
    }
    
}
