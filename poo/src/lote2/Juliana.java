package lote2;

public class Juliana {
    public static int gregorianoParaJuliana(int dia, int mes, int ano) {
        int data_juliana = (1461 * (ano + 4800 + (mes-14) / 12)) / 4
                + (367 * (mes - 2 - 12 * ((mes-14) / 12))) / 12
                - (3 * ((ano + 4900 + (mes-14) / 12) / 100)) / 4 + dia - 32075;
        return data_juliana;
    }

    public static void main(String[] args) {
        int data = Juliana.gregorianoParaJuliana(5, 8, 2016);
        System.out.println(data);
    }
}
