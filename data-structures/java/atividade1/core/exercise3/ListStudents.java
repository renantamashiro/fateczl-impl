package atividade1.core.exercise3;

import atividade1.core.exercise2.Temperature;

public class ListStudents {

    private Student head;


    /**
     * Verificar se a lista está vazia
     * @return true se a lista estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        if (this.head == null) return true;
        return false;
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

            Student current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(student);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
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

            Student current = this.head;
            int position = 0;
            while (position != (pos - 1)) {
                current = current.getNext();
                position += 1;
            }

            student.setNext(current.getNext());
            current.setNext(student);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
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
                while (current.getNext().getNext() != null) {
                    current = current.getNext();
                }

                studentRemoved = current.getNext();
                current.setNext(null);
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return studentRemoved;
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
                int position = 0;
                while (position != (pos-1)) {
                    current = current.getNext();
                    position += 1;
                }

                studentRemoved = current.getNext();
                current.setNext(current.getNext().getNext());
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return studentRemoved;
    }


    /**
     * Percorre a lista e exibe os aluno
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
