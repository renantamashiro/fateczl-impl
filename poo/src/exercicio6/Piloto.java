package exercicio6;

public class Piloto extends Pessoa {
    private Voo vooAtual = null;
    private double horasVoo;
    private int quantidadeVoos;

    public Piloto(String nome, String cpf, int idade, double horasVoo, int quantidadeVoos) {
        super(nome, cpf, idade);
        this.horasVoo = horasVoo;
        this.quantidadeVoos = quantidadeVoos;
    }

    public void atribuirVoo(Voo voo) {
        this.vooAtual = voo;
    }
}
