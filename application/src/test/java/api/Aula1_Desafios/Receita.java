package api.Aula1_Desafios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Receita {
    public static void main(String[] args) throws IOException, InterruptedException {      
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da receita: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco)) 
            .build();
        
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }

}
