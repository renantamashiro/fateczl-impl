package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class TesteAeroporto {

    public static void main(String[] args) {
        Aeronave boeing = new Aeronave(1, "Boeing 737");
        Aeronave embraer = new Aeronave(2, "Embraer 195");

        List<Aeronave> aeronaves = new ArrayList<Aeronave>();
        aeronaves.add(boeing);
        aeronaves.add(embraer);

        Aeroporto guarulhosAeroporto = new Aeroporto("Guarulhos", "Guarulhos");
        guarulhosAeroporto.adicionarAeronave(boeing);
        guarulhosAeroporto.adicionarAeronave(embraer);

        Piloto mariaPiloto = new Piloto("Maria", "000000000", 34, 125.4, 35);
        Piloto joaoPiloto = new Piloto("João", "000000000", 64, 925.4, 210);

        Voo voo101 = new Voo(101, boeing, "01:45", 215, mariaPiloto);
        Voo voo102 = new Voo(102, embraer, "05:45", 0, joaoPiloto);

        Passageiro renan = new Passageiro("Renan", "00000000000", 10,
                new Passagem(voo101, "Renan"), "Não tem");
        Passageiro ronaldo = new Passageiro("Ronaldo", "00000000000", 21,
                new Passagem(voo102, "Ronaldo"), "Não tem");
        Passageiro alice = new Passageiro("Alice", "00000000000", 25,
                new Passagem(voo101, "Alice"), "Não tem");
        Passageiro leila = new Passageiro("Leila", "00000000000", 69,
                new Passagem(voo102, "Leila"), "Não tem");

        alice.fazerCheckIn();
        leila.fazerCheckIn();

        voo101.adicionarPassageiro(renan);
        voo101.adicionarPassageiro(alice);

        voo102.adicionarPassageiro(ronaldo);
        voo102.adicionarPassageiro(leila);

        voo101.embarqueFinalizado();
        voo102.embarqueFinalizado();

    }
}
