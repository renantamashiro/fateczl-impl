package lote2;

public class Palavra {

    private String palavra;
    private int tamanho;
    private int vogais;
    private int consoantes;
    private boolean verboInfinitivo;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.tamanho = palavra.length();
        this.vogais = contaVogais(palavra);
        this.consoantes = contaConsoantes(palavra);
        this.verboInfinitivo = palavra.endsWith("r") || palavra.endsWith("R");
    }

    private static int contaVogais(String palavra) {
        char[] arr = palavra.toCharArray();
        int contador = 0;
        for (char c : arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    private static int contaConsoantes(String palavra) {
        char[] arr = palavra.toCharArray();
        int contador = 0;
        for (char c : arr) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                contador++;
            }
        }
        return contador;
    }

    public void imprimirDados() {
        if (this.verboInfinitivo) {
            System.out.printf("\n%s possui %d letras,"
                            + " sendo %d vogais e %d consoantes.\n"
                            + "%s é um verbo\n",
                    this.palavra, this.tamanho, this.vogais,
                    this.consoantes, this.palavra);
            return;
        }
        System.out.printf("\n%s possui %d letras,"
                + " sendo %d vogais e %d consoantes.\n"
                + "%s não é um verbo\n",
                this.palavra, this.tamanho, this.vogais,
                this.consoantes, this.palavra);
    }
}
