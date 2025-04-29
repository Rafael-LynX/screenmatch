
public class Aluno {
    String nome;
    int idade;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;
        aluno.mostraDados();  
    }

    void mostraDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
