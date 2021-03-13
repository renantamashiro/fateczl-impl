package exercicio6;

public class Aeronave {
    private int numero;
    private String modelo;
    private int turbinas = 2;
    private boolean decolou = false;

    public Aeronave(int numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    public void decolar() {
        this.decolou = true;
        System.out.printf("Aeronave %d modelo %s decolou!\n", this.numero, this.modelo);
    }
}
