package atividade3.exercicio2.listaDuplamenteLigada;

class Head {

    public int elements = 0;
    public Curso first;
    public Curso last;

}


public class ListaCurso {

    private Head head;


    /**
     * Verificar se a lista está vazia
     * @return true se a lista estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        return this.head == null;
    }


    /**
     * Adicionar um curso no início da lista
     * @param curso curso a ser adicionado
     */
    public void addFront(Curso curso) {
        try {
            if (this.head.first == null) {
                this.head.first = curso;
                this.head.last = curso;
                this.head.elements += 1;
                return;
            }

            curso.setNext(this.head.first);
            this.head.first = curso;
            this.head.elements += 1;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Adiciona um curso no final da lista
     * @param curso a ser adicionado
     */
    public void addBack(Curso curso) {
        try {
            if (this.head.first == null) {
                this.head.first = curso;
                this.head.last = curso;
                this.head.elements += 1;
                return;
            }

            curso.setPrevious(this.head.last);
            this.head.last = curso;
            this.head.elements += 1;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }



    /**
     * Adiciona um curso em uma determinada posição da lista
     * @param curso  a ser adicionado
     * @param pos posição na lista do curso que será adicionado
     */
    public void addAnyPosition(Curso curso, int pos) {
        try {
            if (this.head.first == null) {
                this.head.first = curso;
                this.head.last = curso;
                this.head.elements += 1;
                return;
            } else if (pos == 0) {
                addFront(curso);
                return;
            }

            Curso current = getSomeElement(this.head.first, pos);

            curso.setPrevious(current);
            curso.setNext(current.getNext());

            current.getNext().setPrevious(curso);
            current.setNext(curso);

            this.head.elements += 1;

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Percorre a lista de modo recursivo e retorna o estudante em uma posição anterior a indicada
     *
     * Explicação: O método utiliza o conceito de recursividade direta,
     * uma vez que chama a si mesmo e altera o estado do parâmetro
     * `head` e do parâmetro `pos` até que a condição (pos menor igual que 1) seja satisfeita
     *
     * @param head curso que inicia a lista
     * @param pos posição da lista em que o curso será adicionado
     * @return head o curso anterior a posição em que será adicionado o novo
     */
    public Curso getSomeElement(Curso head, int pos) {
        if (pos <= 1) {
            return head;
        } else {
            return getSomeElement(head.getNext(), pos-1);
        }
    }



    /**
     * Remove o curso no início da lista
     * @return curso removido caso a lista possua elementos, caso contrário o valor null
     */
    public Curso removeFront() {
        Curso cursoRemovido = null;

        try {
            cursoRemovido = this.head.first;
            this.head.first = this.head.first.getNext();
            this.head.elements -= 1;
        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return cursoRemovido;
    }


    /**
     * Remove o curso no final da lista
     * @return curso removido caso a lista possua elementos, caso contrário o valor null
     */
    public Curso removeBack() {
        Curso cursoRemovido = null;

        try {
            cursoRemovido = this.head.last;
            this.head.last = this.head.last.getPrevious();
            this.head.elements -= 1;

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return cursoRemovido;
    }


    /**
     * Percorre a lista de modo recursivo e retorna o penúltimo elemento
     *
     * Explicação: O método utiliza o conceito de recursividade direta,
     * uma vez que chama a si mesmo e altera o estado do parâmetro
     * `head` até que a condição (próximo do próximo elemento igual a null) seja satisfeita
     *
     * @param head curso que inicia a lista
     * @return head o penúltimo curso da lista
     */
    public Curso getLastButOneElement(Curso head) {
        if (head.getNext().getNext() == null) {
            return head;
        } else {
            return getLastButOneElement(head.getNext());
        }
    }


    /**
     * Remove o curso em uma determinada posição da lista
     * @param pos posição na lista do curso que será removido
     * @return curso removido caso a lista possua elementos, caso contrário o valor null
     */
    public Curso removeAnyPosition(int pos) {
        Curso cursoRemovido = null;

        try {
            Curso current = this.head.first;

            if (pos == 0) {
                cursoRemovido = current;
                this.head.first = current.getNext();
            } else {
                current = getSomeElement(current, pos);

                cursoRemovido = current.getNext();

                if (current.getNext().getNext() != null) {
                    current.getNext().getNext().setPrevious(current);
                    current.setNext(current.getNext().getNext());
                } else {
                    current.setNext(null);
                }
            }
            this.head.elements -= 1;

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return cursoRemovido;
    }


    /**
     * Percorre a lista e exibe os cursos
     */
    public void show() {
        Curso current = this.head.first;

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
