package atividade3.exercicio2.filaDinamica;


public class FilaCurso {

    private Curso head;


    /**
     * Verificar se a fila está vazia
     * @return true se a fila estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        return this.head == null;
    }


    /**
     * Adicionar um curso na fila
     * @param curso curso a ser adicionado
     */
    public void enqueue(Curso curso) {
        try {
            if (this.head == null) {
                this.head = curso;
                return;
            }

            Curso topo = getLastElement(this.head);
            topo.setNext(curso);

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }

    public Curso getLastElement(Curso head) {
        if (head.getNext() == null) {
            return head;
        } else return getLastElement(head.getNext());
    }


    /**
     * Remove um curso da fila
     * @return curso a ser adicionada
     */
    public Curso dequeue() {
        Curso cursoRemovido = this.head;
        this.head = this.head.getNext();

        return cursoRemovido;

    }

    public int elements() {
        Curso current = this.head;
        int elements = 0;
        while(current != null) {
            elements += 1;
            current = current.getNext();
        }
        return elements;
    }


    /**
     * Percorre a fila e exibe os cursos
     */
    public void show() {
        Curso current = this.head;

        while (current != null) {
            System.out.println("" +
                    " ____________________________________\n"+
                    "| Curso: " + current.getNome() + "\n" +
                    "| Área: " + current.getArea() + "\n" +
                    "| Período: " + current.getPeriodo() + "\n" +
                    "| Semestres: " + current.getSemestres() + "\n" +
                    "|____________________________________\n"
            );
            current = current.getNext();
        }
    }

}
