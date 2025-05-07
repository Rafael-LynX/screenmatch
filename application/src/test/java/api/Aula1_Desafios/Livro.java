package api.Aula1_Desafios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Livro {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        var busca = leitura.nextLine();

        String apiKey = "AIzaSyATHaE8EJFr-vK41L1JIyCnW94_uJLJ30A"; // Substitua pela sua chave de API
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=" + apiKey; 

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco)) 
            .build();
        
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
