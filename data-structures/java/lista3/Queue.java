package lista3;

public class Queue {

    private Object[] data;
    private int size = 0;

    public Queue(int size){ this.data = new Object[size]; }

    public void add(int element) {
        if (this.size == this.data.length) {
            System.out.println("Fila Cheia!");
            return;
        }

        this.data[this.size] = element;
        this.size += 1;
    }

    public int remove() {
        int value = (int) this.data[0];

        for (int i = 1; i < this.size; i++) {
            this.data[i-1] = this.data[i];
        }

        this.data[this.size-1] = null;

        return value;
    }

    public int get(int index) {
        return (int) this.data[index];
    }

    public StringBuffer show() {
        StringBuffer sb = new StringBuffer();
        sb.append("Queue Values\n");
        for (int i = 0; i < this.size; i++) {
            String str = String.valueOf(this.data[i]);
            sb.append("Pos " + i + ": " + str + "\n");
        }
        return sb;
    }
}
