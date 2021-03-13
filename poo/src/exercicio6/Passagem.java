package exercicio6;

public class Passagem {
    private String id = null;
    private Voo voo;
    private int assento;
    private boolean checkIn = false;
    private String passageiro;

    public Passagem(Voo voo, String passageiro) {
        if (voo.assentosDisponiveis()) {
            this.id = voo.getId() + "TICKET" + voo.proximoAssento();
            this.assento = voo.proximoAssento();
            System.out.println("Compra da passagem realizada com sucesso!");
            System.out.printf("Boa viagem e não se atrase, %s!\n", passageiro);
        } else {
            System.out.printf("Sr(a) %s, infelizmente não temos assentos disponíveis para o voo %d\n",
                    passageiro, voo.getId());
        }
    }

    public void checkInFeito() {
        this.checkIn = true;
    }

    public boolean check() {
        return this.checkIn;
    }

    public String getId() {
        return this.id;
    }
}
