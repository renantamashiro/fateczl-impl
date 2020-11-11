package atividade3.exercicio2.pilhaDinamica;


public class PilhaCurso {

    private Curso head;


    /**
     * Verificar se a pilha está vazia
     * @return true se a pilha estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        return this.head == null;
    }


    /**
     * Adicionar um curso na pilha
     * @param curso curso a ser adicionado
     */
    public void push(Curso curso) {
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
     * Remove um curso da pilha
     * @return curso a ser adicionada
     */
    public Curso pop() {
        Curso topo = getLastButOneElement(this.head);
        Curso cursoRemovido = topo.getNext();

        topo.setNext(null);

        return cursoRemovido;

    }

    public Curso getLastButOneElement(Curso head) {
        if (head.getNext().getNext() == null) {
            return head;
        } else return getLastButOneElement(head.getNext());
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
     * Percorre a pilha e exibe os cursos
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
