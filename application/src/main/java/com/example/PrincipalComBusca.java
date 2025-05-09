package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.example.model.Titulo;
import com.example.model.TituloOmdb;
import com.example.utils.ErroDeConversaoDeAno;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?i=" + busca.replace(" ", "+") + "&apikey=40f483de"; 
        
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
                    

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            // try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o título: " + e.getMessage());
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao converter o título: " + e.getMessage());
            return;
        } catch (ErroDeConversaoDeAno e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            return;
        }
        System.out.println("Programa finalizado com sucesso!");
    }
}
