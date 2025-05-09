package api.Aula4_Desafios;

import java.io.FileWriter;
import java.io.IOException;
public class Arquivando {
    public static void main(String[] args) {
        String data = "Conteúdo a ser gravado no arquivo";

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(data);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
