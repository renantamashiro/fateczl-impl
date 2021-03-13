package exercicio6;

public class Passageiro extends Pessoa {
    private Passagem passagem = null;
    private String bagagem;
    private boolean bagagemDespachada = false;

    public Passageiro(String nome, String cpf, int idade,
                      Passagem passagem, String bagagem) {
        super(nome, cpf, idade);
        this.passagem = passagem;
        this.bagagem = bagagem;
    }

    public void fazerCheckIn() {
        if (this.passagem.getId() == null) {
            System.out.printf("Sr(a) %s. Você comprou a passagem?\n", this.getNome());
            return;
        }
        this.passagem.checkInFeito();
        System.out.printf("Check-In feito com sucesso! Vamos embarcar, %s?\n", this.getNome());
    }

    public Passagem getPassagem() {
        return this.passagem;
    }
}
