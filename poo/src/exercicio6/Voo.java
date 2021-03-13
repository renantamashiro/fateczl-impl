package exercicio6;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Voo {
    private int id;
    private Aeronave aeronave;
    private String saida;
    private List<Passageiro> passageiros = new ArrayList<Passageiro>();
    private int assentos;
    private Piloto piloto;

    public Voo(int id, Aeronave aeronave,
               String saida, int assentos, Piloto piloto) {
        this.id = id;
        this.aeronave = aeronave;
        this.saida = saida;
        this.assentos = assentos;
        this.piloto = piloto;
        this.piloto.atribuirVoo(this);
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        if (passageiro.getPassagem().check()) {
            passageiros.add(passageiro);
            return;
        }
        System.out.printf("Sr(a) %s.", passageiro.getNome());
        System.out.println("Você adquiriu a passagem e fez o Check-in?");
    }

    public boolean assentosDisponiveis() {
        if (passageiros.size() == assentos) {
            return false;
        }
        return true;
    }

    public int proximoAssento() {
        return passageiros.size();
    }

    public int getId() {
        return this.id;
    }

    public void embarqueFinalizado() {
        try {
            System.out.print("Decolando");
            for (int i = 0; i < 10; i++) {
                sleep(1000L);
                System.out.print(".");
            }
            System.out.println("");
            this.aeronave.decolar();
        } catch (InterruptedException e) {
            System.out.println("Voo interrompido!!!");
        }
    }
}
