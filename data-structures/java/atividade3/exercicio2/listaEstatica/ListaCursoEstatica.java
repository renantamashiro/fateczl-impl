package atividade3.exercicio2.listaEstatica;

public class ListaCursoEstatica {

    private Curso dados[];
    private int tamanho = 0;

    public ListaCursoEstatica(int tamanho) {
        this.dados = new Curso[tamanho];
    }

    /**
     * Verificar se a lista está vazia
     * @return true se a lista estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        if (this.tamanho == 0) return true;
        return false;
    }


    /**
     * Adicionar um Curso no início da lista
     * @param curso Curso a ser adicionada
     */
    public void addFront(Curso curso) {
        if (this.tamanho != 0) {
            for (int i = this.tamanho; i > 0; i--) {
                this.dados[i] = this.dados[i - 1];
            }
        }
        this.dados[0] = curso;
        this.tamanho += 1;
    }


    /**
     * Adicionar um curso no final da lista
     * @param curso Curso a ser adicionado
     */
    public void addBack(Curso curso) {
        if (this.tamanho != 0) {
            this.dados[this.tamanho] = curso;
            this.tamanho += 1;
        }
        this.dados[0] = curso;
        this.tamanho += 1;
    }


    /**
     * Adiciona um curso em uma determinada posição da lista
     * @param curso curso a ser adicionado
     * @param pos posição na lista do curso que será adicionado
     */
    public void addAnyPosition(Curso curso, int pos) {
        for (int i = this.tamanho-1; i > pos; i--) {
            this.dados[i] = this.dados[i-1];
        }
        this.dados[pos] = curso;
        this.tamanho += 1;
    }


    /**
     * Remove o curso no início da lista
     * @return curso removida caso a lista possua elementos, caso contrário o valor null
     */
    public Curso removeFront() {
        Curso cursoRemovido = this.dados[0];

        for (int i = 0; i < this.tamanho-1; i++) {
            this.dados[i] = this.dados[i+1];
        }

        this.tamanho -= 1;
        return cursoRemovido;
    }


    /**
     * Remove o curso no final da lista
     * @return curso removido caso a lista possua elementos, caso contrário o valor null
     */
    public Curso removeBack() {
        Curso cursoRemovido = this.dados[this.tamanho-1];

        this.tamanho -= 1;
        return cursoRemovido;
    }


    /**
     * Remove o curso em uma determinada posição da lista
     * @param pos posição na lista do curso que será removido
     * @return curso removido caso a lista possua elementos, caso contrário o valor null
     */
    public Curso removeAnyPosition(int pos) {
        Curso cursoRemovido = this.dados[pos];

        for (int i = pos; i < this.tamanho-1; i++) {
            this.dados[i] = this.dados[i+1];
        }
        this.tamanho -= 1;
        return cursoRemovido;
    }


    /**
     * Percorre a lista e exibe os cursos
     */
    public void show() {
        for (Curso curso : this.dados) {
            System.out.println(curso.getNome());
        }
    }
}
