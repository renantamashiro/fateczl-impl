package lote2;

public class TestePalavra {
    public static void main(String[] args) {
        Palavra naoVerbo = new Palavra("otorrinolaringologista");
        naoVerbo.imprimirDados();

        Palavra verbo = new Palavra("cantar");
        verbo.imprimirDados();
    }
}
