package core.exercise3;


public class ListStudents {

    private Student head;


    /**
     * Verificar se a lista está vazia
     * @return true se a lista estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        return this.head == null;
    }


    /**
     * Adicionar um aluno no início da lista
     * @param student aluno a ser adicionado
     */
    public void addFront(Student student) {
        try {
            if (this.head == null) {
                this.head = student;
                return;
            }

            student.setNext(this.head);
            this.head = student;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Adiciona um aluno no final da lista
     * @param student temperatura a ser adicionada
     */
    public void addBack(Student student) {
        try {
            if (this.head == null) {
                this.head = student;
                return;
            }

            Student lastStudent = getLastStudent(this.head);
            lastStudent.setNext(student);

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }

    /**
     * Percorre a lista de modo recursivo e retorna o último elemento
     *
     * Explicação: O método utiliza o conceito de recursividade direta,
     * uma vez que chama a si mesmo e altera o estado do parâmetro
     * `head` até que a condição (próximo elemento do head igual a null) seja satisfeita
     *
     * @param head estudante que inicia a lista
     * @return head o último estudante da lista
     */
    public Student getLastStudent(Student head) {
        if (head.getNext() == null) {
            return head;
        } else {
            return getLastStudent(head.getNext());
        }
    }


    /**
     * Adiciona um aluno em uma determinada posição da lista
     * @param student aluno a ser adicionado
     * @param pos posição na lista do aluno que será adicionado
     */
    public void addAnyPosition(Student student, int pos) {
        try {
            if (this.head == null) {
                this.head = student;
                return;
            } else if (pos == 0) {
                addFront(student);
                return;
            }

            Student current = getSomeStudent(this.head, pos);

            student.setNext(current.getNext());
            current.setNext(student);

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
     * @param head estudante que inicia a lista
     * @param pos posição da lista em que o estudante será adicionado
     * @return head o estudante anterior a posição em que será adicionado o novo
     */
    public Student getSomeStudent(Student head, int pos) {
        if (pos <= 1) {
            return head;
        } else {
            return getSomeStudent(head.getNext(), pos-1);
        }
    }



    /**
     * Remove o aluno no início da lista
     * @return aluno removido caso a lista possua elementos, caso contrário o valor null
     */
    public Student removeFront() {
        Student studentRemoved = null;

        try {
            studentRemoved = this.head;
            this.head = this.head.getNext();
        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return studentRemoved;
    }


    /**
     * Remove o aluno no final da lista
     * @return aluno removido caso a lista possua elementos, caso contrário o valor null
     */
    public Student removeBack() {
        Student studentRemoved = null;

        try {
            Student current = this.head;

            if (current.getNext() == null) {
                studentRemoved = current;
                this.head = null;
            } else {

                current = getLastButOneStudent(current);

                studentRemoved = current.getNext();
                current.setNext(null);
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return studentRemoved;
    }


    /**
     * Percorre a lista de modo recursivo e retorna o penúltimo elemento
     *
     * Explicação: O método utiliza o conceito de recursividade direta,
     * uma vez que chama a si mesmo e altera o estado do parâmetro
     * `head` até que a condição (próximo do próximo elemento igual a null) seja satisfeita
     *
     * @param head estudante que inicia a lista
     * @return head o penúltimo estudante da lista
     */
    public Student getLastButOneStudent(Student head) {
        if (head.getNext().getNext() == null) {
            return head;
        } else {
            return getLastButOneStudent(head.getNext());
        }
    }


    /**
     * Remove o aluno em uma determinada posição da lista
     * @param pos posição na lista do aluno que será removido
     * @return aluno removido caso a lista possua elementos, caso contrário o valor null
     */
    public Student removeAnyPosition(int pos) {
        Student studentRemoved = null;

        try {
            Student current = this.head;

            if (pos == 0) {
                studentRemoved = current;
                this.head = current.getNext();
            } else {

                current = getSomeStudent(current, pos);

                studentRemoved = current.getNext();
                current.setNext(current.getNext().getNext());
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return studentRemoved;
    }


    /**
     * Percorre a lista e exibe os alunos
     */
    public void show() {
        Student current = this.head;

        while (current != null) {
            System.out.println("" +
                    " ____________________________________\n"+
                    "| Aluno: " + current.getName() + "\n" +
                    "| RA: " + current.getRa() + "\n" +
                    "| Turma: " + current.getGroup() + "\n" +
                    "| Semestre: " + current.getSemester() + "\n" +
                    "|____________________________________\n"
            );
            current = current.getNext();
        }
    }

}
