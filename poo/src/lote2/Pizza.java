package lote2;


public class Pizza {

    private String sabor;
    private String formato;
    private int pedacos;
    private boolean bordaRecheada;
    private boolean assado = false;

    public Pizza(String sabor, String formato, int pedacos) {
        this.sabor = sabor;
        this.formato = formato;
        this.pedacos = pedacos;
    }

    public void preparar() {
        System.out.println("\nPizza gostosa é aqui!\n");
        if (this.formato.equals("redonda")) {
            prepararRedonda();
            return;
        }
        prepararQuadrada();
    }

    private void prepararRedonda() {
        System.out.printf("Pizza redonda de %s no forno!", this.sabor);
        etapaPreparacao("Assando", 10);
        etapaPreparacao("Finalização! Quase pronto", 3);
        this.assado = true;
        System.out.println("\nlote2.Pizza pronta!");
    }

    private void prepararQuadrada() {
        etapaPreparacao("Modulando a pizza quadrada", 15);
        System.out.printf("\nPizza quadrada de %s no forno!", this.sabor);
        etapaPreparacao("Assando", 10);
        etapaPreparacao("Finalização! Quase pronto", 3);
        this.assado = true;
        System.out.println("\nPizza pronta!");
    }

    private static void etapaPreparacao(String etapa, int segundos) {
        System.out.print("\n" + etapa);
        int i;
        int limite = 0;
        for (i = 0; i < segundos; i++) {
            try {
                if (limite == 3) {
                    System.out.print("\n" + etapa);
                    limite = 0;
                }
                Thread.sleep(1000);
                System.out.print(".");
                limite++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
