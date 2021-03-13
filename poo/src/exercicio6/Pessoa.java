package exercicio6;

public class Pessoa {
    private String nome;
    private String CPF;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.CPF = cpf;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.printf("%s - %s - %d", this.nome, this.CPF, this.idade);
    }

    public String getNome() {
        return this.nome;
    }
}
