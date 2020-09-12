package lista3;

import javax.swing.JOptionPane;

public class TestQueueStack {

    public static void main(String[] args) {
        Queue qe = new Queue(6);
        Stack st = new Stack(6);

        for (int i = 0; i < 4; i++) {
            qe.add(Integer.parseInt(JOptionPane.showInputDialog("Queue Element (int values)")));
            st.add(Integer.parseInt(JOptionPane.showInputDialog("Stack Element (int values)")));
        }

        show(qe, st);
        move(qe, st);
    }

    public static void move(Queue qe, Stack st) {
        while (true) {
            int option = Integer
                    .parseInt(JOptionPane.showInputDialog("" +
                            "1. Remover da fila e adicionar na pilha\n" +
                            "2. Remover da pilha e adicionar na fila\n" +
                            "0. Sair"));
            if (option == 1) {
                st.add(qe.remove());
                show(qe, st);
            } else if (option == 2) {
                qe.add(st.remove());
                show(qe, st);
            } else {
                break;
            }
        }
    }

    public static void show(Queue qe, Stack st) {
        JOptionPane.showMessageDialog(null, qe.show());
        JOptionPane.showMessageDialog(null, st.show());
    }

}
