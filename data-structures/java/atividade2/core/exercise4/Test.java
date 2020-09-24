package core.exercise4;


public class Test {

    public static void main(String[] args) {
        ListBooks lt = new ListBooks();
        testAddFront(lt);

        ListBooks lt1 = new ListBooks();
        testAddBack(lt1);

        ListBooks lt2 = new ListBooks();
        testAddAnyPosition(lt2);

        testRemoveFront(lt2);

        testRemoveBack(lt1);

        testRemoveAnyPosition(lt);
    }

    public static void testAddFront(ListBooks lt) {

        System.out.println("" +
                "=================================================================\n" +
                "Série de testes para o método: Adicionar livro ao início da lista\n" +
                "=================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st1 = new Book();
        st1.setTitle("A cura");
        st1.setQuantity(11);

        System.out.println("Livro " + st1.getTitle() + " adicionado ao início!\n");
        lt.addFront(st1);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st2 = new Book();
        st2.setTitle("A viagem");
        st2.setQuantity(18);

        System.out.println("Livro " + st2.getTitle() + " adicionado ao início!\n");
        lt.addFront(st2);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st3 = new Book();
        st3.setTitle("A procura");
        st3.setQuantity(1);

        System.out.println("Livro " + st3.getTitle() + " adicionado ao início!\n");
        lt.addFront(st3);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st4 = new Book();
        st4.setTitle("A busca");
        st4.setQuantity(110);

        System.out.println("Livro " + st4.getTitle() + " adicionado ao início!\n");
        lt.addFront(st4);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st5 = new Book();
        st5.setTitle("A descoberta");
        st5.setQuantity(11);

        System.out.println("Livro " + st5.getTitle() + " adicionado ao início!\n");
        lt.addFront(st5);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testAddBack(ListBooks lt) {

        System.out.println("" +
                "================================================================\n" +
                "Série de testes para o método: Adicionar livro ao final da lista\n" +
                "================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st1 = new Book();
        st1.setTitle("A cura");
        st1.setQuantity(11);

        System.out.println("Livro " + st1.getTitle() + " adicionado ao final!\n");
        lt.addBack(st1);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st2 = new Book();
        st2.setTitle("A viagem");
        st2.setQuantity(18);

        System.out.println("Livro " + st2.getTitle() + " adicionado ao final!\n");
        lt.addBack(st2);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st3 = new Book();
        st3.setTitle("A procura");
        st3.setQuantity(1);

        System.out.println("Livro " + st3.getTitle() + " adicionado ao final!\n");
        lt.addBack(st3);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st4 = new Book();
        st4.setTitle("A busca");
        st4.setQuantity(110);

        System.out.println("Livro " + st4.getTitle() + " adicionado ao final!\n");
        lt.addBack(st4);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st5 = new Book();
        st5.setTitle("A descoberta");
        st5.setQuantity(11);

        System.out.println("Livro " + st5.getTitle() + " adicionado ao final!\n");
        lt.addBack(st5);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testAddAnyPosition(ListBooks lt) {

        System.out.println("" +
                "====================================================================================\n" +
                "Série de testes para o método: Adicionar livro para determinada posição da lista\n" +
                "====================================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st1 = new Book();
        st1.setTitle("A cura");
        st1.setQuantity(11);

        System.out.println("Livro " + st1.getTitle() + " adicionado para a posição 0\n");
        lt.addAnyPosition(st1, 0);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st2 = new Book();
        st2.setTitle("A viagem");
        st2.setQuantity(18);

        System.out.println("Livro " + st2.getTitle() + " adicionado para a posição 0\n");
        lt.addAnyPosition(st2, 0);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st3 = new Book();
        st3.setTitle("A procura");
        st3.setQuantity(1);

        System.out.println("Livro " + st3.getTitle() + " adicionado para a posição 1\n");
        lt.addAnyPosition(st3, 1);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st4 = new Book();
        st4.setTitle("A busca");
        st4.setQuantity(110);

        System.out.println("Livro " + st4.getTitle() + " adicionado para a posição 2\n");
        lt.addAnyPosition(st4, 2);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());

        Book st5 = new Book();
        st5.setTitle("A descoberta");
        st5.setQuantity(11);

        System.out.println("Livro " + st5.getTitle() + " adicionado para a posição 1\n");
        lt.addAnyPosition(st5, 1);

        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

    }

    public static void testRemoveFront(ListBooks lt) {
        Book st;
        System.out.println("" +
                "===============================================================\n" +
                "Série de testes para o método: Remover livro do início da lista\n" +
                "===============================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Livro removido do início: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Livro removido do início: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Livro removido do início: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Livro removido do início: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeFront();
        System.out.println("Livro removido do início: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testRemoveBack(ListBooks lt) {
        Book st;
        System.out.println("" +
                "===============================================================\n" +
                "Série de testes para o método: Remover livro do final da lista\n" +
                "===============================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Livro removido do final: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Livro removido do final: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Livro removido do final: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Livro removido do final: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeBack();
        System.out.println("Livro removido do final: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");
    }

    public static void testRemoveAnyPosition(ListBooks lt) {
        Book st;
        System.out.println("" +
                "=========================================================================\n" +
                "Série de testes para o método: Remover livro em qualquer posição da lista\n" +
                "=========================================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(2);
        System.out.println("Livro da posição 2 removido: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(3);
        System.out.println("Livro da posição 3 removido: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(0);
        System.out.println("Livro da posição 0 removido: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(1);
        System.out.println("Livro da posição 1 removido: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");

        st = lt.removeAnyPosition(0);
        System.out.println("Livro da posição 0 removido: " + st.getTitle());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Livros: ");
        lt.show();
        System.out.println("\n");
    }
}
