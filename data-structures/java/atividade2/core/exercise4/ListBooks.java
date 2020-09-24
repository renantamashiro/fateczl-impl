package core.exercise4;


public class ListBooks {

    private Book head;

    /**
     * Verificar se a lista está vazia
     * @return true se a lista estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        return this.head == null;
    }


    /**
     * Adicionar um livro no início da lista
     * @param book livro a ser adicionado
     */
    public void addFront(Book book) {
        try {
            if (this.head == null) {
                this.head = book;
                return;
            }

            book.setNext(this.head);
            this.head = book;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Adiciona um livro no final da lista
     * @param book livro a ser adicionado
     */
    public void addBack(Book book) {
        try {
            if (this.head == null) {
                this.head = book;
                return;
            }

            Book lastBook = getLastBook(this.head);
            lastBook.setNext(book);

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }

    /**
     * Percorre a lista de modo recursivo e retorna o último elemento
     * @param head livro que inicia a lista
     * @return head o último livro da lista
     */
    public Book getLastBook(Book head) {
        if (head.getNext() == null) {
            return head;
        } else {
            return getLastBook(head.getNext());
        }
    }


    /**
     * Adiciona um livro em uma determinada posição da lista
     * @param book livro a ser adicionado
     * @param pos posição na lista do livro que será adicionado
     */
    public void addAnyPosition(Book book, int pos) {
        try {
            if (this.head == null) {
                this.head = book;
                return;
            } else if (pos == 0) {
                addFront(book);
                return;
            }

            Book current = getSomeBook(this.head, pos);

            book.setNext(current.getNext());
            current.setNext(book);

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Percorre a lista de modo recursivo e retorna o livro em uma posição anterior a indicada
     * @param head livro que inicia a lista
     * @param pos posição da lista em que o livro será adicionado
     * @return head o livro anterior a posição em que será adicionado o novo
     */
    public Book getSomeBook(Book head, int pos) {
        if (pos <= 1) {
            return head;
        } else {
            return getSomeBook(head.getNext(), pos-1);
        }
    }


    /**
     * Remove o livro no início da lista
     * @return livro removido caso a lista possua elementos, caso contrário o valor null
     */
    public Book removeFront() {
        Book bookRemoved = null;

        try {
            bookRemoved = this.head;
            this.head = this.head.getNext();
        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return bookRemoved;
    }


    /**
     * Remove o livro no final da lista
     * @return livro removido caso a lista possua elementos, caso contrário o valor null
     */
    public Book removeBack() {
        Book bookRemoved = null;

        try {
            Book current = this.head;

            if (current.getNext() == null) {
                bookRemoved = current;
                this.head = null;
            } else {

                current = getLastButOneBook(current);

                bookRemoved = current.getNext();
                current.setNext(null);
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return bookRemoved;
    }


    /**
     * Percorre a lista de modo recursivo e retorna o penúltimo elemento
     * @param head livro que inicia a lista
     * @return head o penúltimo livro da lista
     */
    public Book getLastButOneBook(Book head) {
        if (head.getNext().getNext() == null) {
            return head;
        } else {
            return getLastButOneBook(head.getNext());
        }
    }


    /**
     * Remove o livro em uma determinada posição da lista
     * @param pos posição na lista do livro que será removido
     * @return livro removido caso a lista possua elementos, caso contrário o valor null
     */
    public Book removeAnyPosition(int pos) {
        Book bookRemoved = null;

        try {
            Book current = this.head;

            if (pos == 0) {
                bookRemoved = current;
                this.head = current.getNext();
            } else {

                current = getSomeBook(current, pos);

                bookRemoved = current.getNext();
                current.setNext(current.getNext().getNext());
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return bookRemoved;
    }


    /**
     * Percorre a lista e exibe os livros
     */
    public void show() {
        Book current = this.head;

        while (current != null) {
            System.out.println("" +
                    " ____________________________________\n"+
                    "| Título: " + current.getTitle() + "\n" +
                    "| Exemplares: " + current.getQuantity() + "\n" +
                    "|____________________________________\n"
            );
            current = current.getNext();
        }
    }

}
