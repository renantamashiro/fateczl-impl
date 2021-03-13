package lote2;

public class TestePizza {
    public static void main(String[] args) {
        Pizza calabresaQuadrada = new Pizza("calabresa", "quadrada", 8);
        calabresaQuadrada.preparar();

        Pizza mocarela = new Pizza("muçarela", "redonda", 8);
        mocarela.preparar();
    }
}
