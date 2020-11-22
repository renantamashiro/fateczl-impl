package atividade567.exercicio2;

public class Teste {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada();

        for (int i = 0; i < 10; i++) {
            Curso c1 = new Curso(i);
            lde.adicionarFinal(c1);
        }

        for (int i = 0; i < 10; i++) {
            Curso c = lde.removerFinal();
            System.out.println(c.getId());
        }
    }
}
