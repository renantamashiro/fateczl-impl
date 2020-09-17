package atividade1.core.exercise3;

import atividade1.core.exercise2.ListTemperature;

public class Test {

    public static void main(String[] args) {
        ListStudents lt = new ListStudents();
        testAddFront(lt);

        ListStudents lt1 = new ListStudents();
        testAddBack(lt1);

        ListStudents lt2 = new ListStudents();
        testAddAnyPosition(lt2);

        testRemoveFront(lt2);

        testRemoveBack(lt1);

        testRemoveAnyPosition(lt);
    }

    public static void testAddFront(ListStudents lt) {

        System.out.println("" +
                "=====================================================================\n" +
                "Série de testes para o método: Adicionar estudante ao início da lista\n" +
                "=====================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st1 = new Student();
        st1.setName("João");
        st1.setGroup("Turma 1");
        st1.setRa(123);
        st1.setSemester("2 semestre");

        System.out.println("Estudante " + st1.getName() + " adicionado ao início!\n");
        lt.addFront(st1);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st2 = new Student();
        st2.setName("Maria");
        st2.setGroup("Turma 1");
        st2.setRa(122);
        st2.setSemester("2 semestre");

        System.out.println("Estudante " + st2.getName() + " adicionado ao início!\n");
        lt.addFront(st2);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st3 = new Student();
        st3.setName("Joana");
        st3.setGroup("Turma 3");
        st3.setRa(223);
        st3.setSemester("4 semestre");

        System.out.println("Estudante " + st3.getName() + " adicionado ao início!\n");
        lt.addFront(st3);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st4 = new Student();
        st4.setName("Ronaldo");
        st4.setGroup("Turma 1");
        st4.setRa(12);
        st4.setSemester("8 semestre");

        System.out.println("Estudante " + st4.getName() + " adicionado ao início!\n");
        lt.addFront(st4);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st5 = new Student();
        st5.setName("Mariana");
        st5.setGroup("Turma 5");
        st5.setRa(1234);
        st5.setSemester("1 semestre");

        System.out.println("Estudante " + st5.getName() + " adicionado ao início!\n");
        lt.addFront(st5);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testAddBack(ListStudents lt) {

        System.out.println("" +
                "====================================================================\n" +
                "Série de testes para o método: Adicionar estudante ao final da lista\n" +
                "====================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st1 = new Student();
        st1.setName("João");
        st1.setGroup("Turma 1");
        st1.setRa(123);
        st1.setSemester("2 semestre");

        System.out.println("Estudante " + st1.getName() + " adicionado ao final!\n");
        lt.addBack(st1);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st2 = new Student();
        st2.setName("Maria");
        st2.setGroup("Turma 1");
        st2.setRa(122);
        st2.setSemester("2 semestre");

        System.out.println("Estudante " + st2.getName() + " adicionado ao final!\n");
        lt.addBack(st2);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st3 = new Student();
        st3.setName("Joana");
        st3.setGroup("Turma 3");
        st3.setRa(223);
        st3.setSemester("4 semestre");

        System.out.println("Estudante " + st3.getName() + " adicionado ao final!\n");
        lt.addBack(st3);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st4 = new Student();
        st4.setName("Ronaldo");
        st4.setGroup("Turma 1");
        st4.setRa(12);
        st4.setSemester("8 semestre");

        System.out.println("Estudante " + st4.getName() + " adicionado ao final!\n");
        lt.addBack(st4);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st5 = new Student();
        st5.setName("Mariana");
        st5.setGroup("Turma 5");
        st5.setRa(1234);
        st5.setSemester("1 semestre");

        System.out.println("Estudante " + st5.getName() + " adicionado ao final!\n");
        lt.addBack(st5);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testAddAnyPosition(ListStudents lt) {

        System.out.println("" +
                "====================================================================================\n" +
                "Série de testes para o método: Adicionar estudante para determinada posição da lista\n" +
                "====================================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st1 = new Student();
        st1.setName("João");
        st1.setGroup("Turma 1");
        st1.setRa(123);
        st1.setSemester("2 semestre");

        System.out.println("Estudante " + st1.getName() + " adicionado para a posição 0\n");
        lt.addAnyPosition(st1, 0);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st2 = new Student();
        st2.setName("Maria");
        st2.setGroup("Turma 1");
        st2.setRa(122);
        st2.setSemester("2 semestre");

        System.out.println("Estudante " + st2.getName() + " adicionado para a posição 0\n");
        lt.addAnyPosition(st2, 0);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st3 = new Student();
        st3.setName("Joana");
        st3.setGroup("Turma 3");
        st3.setRa(223);
        st3.setSemester("4 semestre");

        System.out.println("Estudante " + st3.getName() + " adicionado para a posição 1\n");
        lt.addAnyPosition(st3, 1);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st4 = new Student();
        st4.setName("Ronaldo");
        st4.setGroup("Turma 1");
        st4.setRa(12);
        st4.setSemester("8 semestre");

        System.out.println("Estudante " + st4.getName() + " adicionado para a posição 2\n");
        lt.addAnyPosition(st4, 2);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Student st5 = new Student();
        st5.setName("Mariana");
        st5.setGroup("Turma 5");
        st5.setRa(1234);
        st5.setSemester("1 semestre");

        System.out.println("Estudante " + st5.getName() + " adicionado para a posição 1\n");
        lt.addAnyPosition(st5, 1);

        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testRemoveFront(ListStudents lt) {
        Student st;
        System.out.println("" +
                "===============================================================\n" +
                "Série de testes para o método: Remover aluno do início da lista\n" +
                "===============================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Estudante removida do início: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Estudante removida do início: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Estudante removida do início: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Estudante removida do início: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Estudante removida do início: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testRemoveBack(ListStudents lt) {
        Student st;
        System.out.println("" +
                "===============================================================\n" +
                "Série de testes para o método: Remover aluno do final da lista\n" +
                "===============================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Estudante removido do final: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Estudante removido do final: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Estudante removido do final: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Estudante removido do final: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Estudante removido do final: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testRemoveAnyPosition(ListStudents lt) {
        Student st;
        System.out.println("" +
                "=============================================================================\n" +
                "Série de testes para o método: Remover estudante em qualquer posição da lista\n" +
                "=============================================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(2);
        System.out.println("Estudante da posição 2 removido: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(3);
        System.out.println("Estudante da posição 3 removido: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(0);
        System.out.println("Estudante da posição 0 removido: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(1);
        System.out.println("Estudante da posição 1 removido: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(0);
        System.out.println("Estudante da posição 0 removido: " + st.getName());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Estudantes: ");
        lt.show();
        System.out.println("\n");
    }
}
