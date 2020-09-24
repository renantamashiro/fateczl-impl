package core.exercise2;


public class Test {

    public static void main(String[] args) {
        ListTemperature lt = new ListTemperature();
        testAddFront(lt);

        ListTemperature lt1 = new ListTemperature();
        testAddBack(lt1);

        ListTemperature lt2 = new ListTemperature();
        testAddAnyPosition(lt2);

        testRemoveFront(lt2);

        testRemoveBack(lt1);

        testRemoveAnyPosition(lt);

    }

    public static void testAddFront(ListTemperature lt) {

        System.out.println("" +
                "=======================================================================\n" +
                "Série de testes para o método: Adicionar temperatura no início da lista\n" +
                "=======================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no início: " + 98.00 + "\n");
        lt.addFront(98.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no início: " + 148.00 + "\n");
        lt.addFront(148.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no início: " + 85.00 + "\n");
        lt.addFront(85.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no início: " + 79.00 + "\n");
        lt.addFront(79.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no início: " + 0.00 + "\n");
        lt.addFront(0.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");
    }


    public static void testAddBack(ListTemperature lt) {

        System.out.println("" +
                "======================================================================\n" +
                "Série de testes para o método: Adicionar temperatura no final da lista\n" +
                "======================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no final: " + 98.00 + "\n");
        lt.addBack(98.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no final: " + 148.00 + "\n");
        lt.addBack(148.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no final: " + 85.00 + "\n");
        lt.addBack(85.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no final: " + 79.00 + "\n");
        lt.addBack(79.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no final: " + 0.00 + "\n");
        lt.addBack(0.00);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");
    }


    public static void testAddAnyPosition(ListTemperature lt) {
        System.out.println("" +
                "=================================================================================\n" +
                "Série de testes para o método: Adicionar temperatura em qualquer posição da lista\n" +
                "=================================================================================\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada: " + 98.00 + "; posição: 0" + "\n");
        lt.addAnyPosition(98.00, 0);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada: " + 148.00 + "; posição: 0" + "\n");
        lt.addAnyPosition(148.00, 0);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada: " + 85.00 + "; posição: 1" + "\n");
        lt.addAnyPosition(85.00, 1);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada no final: " + 79.00 + "; posição: 2" + "\n");
        lt.addAnyPosition(79.00, 2);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperatura a ser adicionada: " + 0.00 + "; posição: 1" + "\n");
        lt.addAnyPosition(0.00, 1);

        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");
    }


    public static void testRemoveFront(ListTemperature lt) {
        Temperature t;
        System.out.println("" +
                "=====================================================================\n" +
                "Série de testes para o método: Remover temperatura no início da lista\n" +
                "=====================================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeFront();
        System.out.println("Temperatura no início removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeFront();
        System.out.println("Temperatura no início removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeFront();
        System.out.println("Temperatura no início removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeFront();
        System.out.println("Temperatura no início removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeFront();
        System.out.println("Temperatura no início removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

    }


    public static void testRemoveBack(ListTemperature lt) {
        Temperature t;
        System.out.println("" +
                "====================================================================\n" +
                "Série de testes para o método: Remover temperatura no final da lista\n" +
                "====================================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeBack();
        System.out.println("Temperatura no final removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeBack();
        System.out.println("Temperatura no final removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeBack();
        System.out.println("Temperatura no final removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeBack();
        System.out.println("Temperatura no final removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeBack();
        System.out.println("Temperatura no final removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");
    }


    public static void testRemoveAnyPosition(ListTemperature lt) {
        Temperature t;
        System.out.println("" +
                "===============================================================================\n" +
                "Série de testes para o método: Remover temperatura em qualquer posição da lista\n" +
                "===============================================================================\n");
        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeAnyPosition(2);
        System.out.println("Temperatura na posição 2 removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeAnyPosition(3);
        System.out.println("Temperatura na posição 3 removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeAnyPosition(0);
        System.out.println("Temperatura na posição 0 removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeAnyPosition(1);
        System.out.println("Temperatura na posição 1 removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");

        t = lt.removeAnyPosition(0);
        System.out.println("Temperatura na posição 0 removida: " + t.getData());

        System.out.println("A lista está vazia? " + lt.isEmpty());
        System.out.println("Temperaturas: ");
        lt.show();
        System.out.println("\n");
    }
}
