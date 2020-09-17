package atividade1.core.exercise2;

public class Temperature {

    private double data;
    private Temperature next;

    public Temperature(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public Temperature getNext() {
        return next;
    }

    public void setNext(Temperature next) {
        this.next = next;
    }
}
