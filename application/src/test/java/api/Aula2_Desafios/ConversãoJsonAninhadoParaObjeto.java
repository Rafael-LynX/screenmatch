package api.Aula2_Desafios;

import com.google.gson.Gson;

record Editora(String nome, String cidade) {}
record Livro1(String titulo, String autor, Editora editora) {}

public class ConversãoJsonAninhadoParaObjeto {

    public static void main(String[] args) {
        String jsonLivro = """
                {
                    "titulo": "O Senhor dos Anéis",
                    "autor": "J.R.R. Tolkien",
                    "editora": {
                        "nome": "HarperCollins",
                        "cidade": "Londres"
                    }
                }
                """;

                Gson gson = new Gson();
                Livro1 livro = gson.fromJson(jsonLivro, Livro1.class);
                System.out.println("Objeto Livro: " + livro);
    }
}
