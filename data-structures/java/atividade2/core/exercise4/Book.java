package core.exercise4;

public class Book {

    private String title;
    private int quantity;

    private Book next;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book getNext() {
        return this.next;
    }

    public void setNext(Book next) {
        this.next = next;
    }
}
