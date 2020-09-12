package lista3;

public class TestStack {

    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);

        System.out.println(st.remove());

//        for (int i = 0; i < 5; i++) {
//            System.out.println(st.get(i));
//        }
    }
}
