package lista3;

public class TestQueue {

    public static void main(String[] args) {
        Queue qe = new Queue(4);

        qe.add(2);
        qe.add(1);
        qe.add(5);
        qe.add(7);
        System.out.println(qe.remove());
        System.out.println(qe.remove());
        System.out.println(qe.remove());
        System.out.println(qe.remove());
        System.out.println(qe.remove());

//        for (int i = 0; i < 4; i++) {
//            System.out.println(qe.get(i));
//        }
    }
}
