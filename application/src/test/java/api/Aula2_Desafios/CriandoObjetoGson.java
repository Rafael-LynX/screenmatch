package api.Aula2_Desafios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
record Pessoa1(String nome, int idade, String cidade) {}

public class CriandoObjetoGson {
    public static void main(String[] args) {
        
        String jsonPessoa = """
                {
                    "nome": "João",
                    "idade": 30,
                    "cidade": "São Paulo"
                }
                """;

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa1 pessoa = gson.fromJson(jsonPessoa, Pessoa1.class);

        System.out.println("Objeto Gson/Pessoa: " + pessoa);

    }
}