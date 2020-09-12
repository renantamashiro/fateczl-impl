package lista3;

public class Stack {

    private Object[] data;
    private int size = 0;

    public Stack(int size){ this.data = new Object[size]; }

    public void add(int element) {
        if (this.size == this.data.length) {
            System.out.println("Pilha Cheia!");
            return;
        }

        this.data[this.size] = element;
        this.size += 1;
    }

    public int remove() {
        int value = (int) this.data[this.size-1];

        this.data[this.size-1] = null;
        this.size -= 1;

        return value;
    }

    public int get(int index) {
        return (int) this.data[index];
    }

    public StringBuffer show() {
        StringBuffer sb = new StringBuffer();
        sb.append("Stack Values\n");
        for (int i = 0; i < this.size; i++) {
            String str = String.valueOf(this.data[i]);
            sb.append("Pos " + i + ": " + str + "\n");
        }
        return sb;
    }

}
