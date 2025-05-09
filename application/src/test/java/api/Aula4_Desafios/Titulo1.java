package api.Aula4_Desafios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
class Titulo1 {
    public static void main(String[] args) {
        Titulo1 titulo = new Titulo1();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
