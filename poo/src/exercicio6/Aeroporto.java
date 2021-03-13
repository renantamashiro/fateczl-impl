package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private List<Aeronave> aeronaves = new ArrayList<Aeronave>();
    private String localidade;

    public Aeroporto(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
    }

    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }
}
