package atividade567.exercicio2;

class NO {
    public Curso dados;
    public NO prox;
    public NO anterior;

    public NO(Curso curso) {
        this.dados = curso;
        this.prox = null;
        this.anterior = null;
    }
}


public class ListaDuplamenteEncadeada {

    private NO head;

    public void adicionarFinal(Curso curso) {
        NO current = retonaUltimoElemento(this.head);
        NO novoCurso = new NO(curso);
        if (current == null) {
            this.head = novoCurso;
        } else {
            current.prox = novoCurso;
            novoCurso.anterior = current;
        }
    }

    public NO retonaUltimoElemento(NO head) {
        if (head == null) {
            return null;
        } else if (head.prox == null) {
            return head;
        } else {
            return retonaUltimoElemento(head.prox);
        }
    }

    public Curso removerFinal() {
        NO current = retonaUltimoElemento(this.head);
        if (current == null) {
            return null;
        } else if (current.anterior == null) {
            this.head = null;
            return current.dados;
        } else {
            NO cursoAnterior = current.anterior;
            cursoAnterior.prox = null;
            return current.dados;
        }
    }

}
