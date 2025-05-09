package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Titulo;
import com.example.model.TituloOmdb;
import com.example.utils.ErroDeConversaoDeAno;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .setPrettyPrinting()
                        .create();
        
        while (!busca.equalsIgnoreCase("Sair")) {

            System.out.println("Digite o nome do filme: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("Sair")) {
                break;
            }
        
            String endereco = "http://www.omdbapi.com/?i=" + busca.replace(" ", "+") + "&apikey=40f483de"; 
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(endereco))
                            .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                        
                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter o título: " + e.getMessage());
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao converter o título");
            } catch (ErroDeConversaoDeAno e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Programa finalizado com sucesso!");
    }
}
