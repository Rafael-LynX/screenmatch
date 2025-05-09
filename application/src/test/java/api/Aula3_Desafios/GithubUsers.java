package api.Aula3_Desafios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GithubUsers {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        var busca = leitura.nextLine();

        String endereco = "https://api.github.com/users/" + busca;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Erro ao consultar o GitHub: ");
            }

            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao consultar o GitHub: ");
        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro ao consultar o GitHub: ");
        } finally {
            System.out.println("Programa finalizado.");
        }
        leitura.close();


    }
}
