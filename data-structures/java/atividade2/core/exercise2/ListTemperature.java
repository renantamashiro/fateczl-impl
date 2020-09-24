package core.exercise2;

public class ListTemperature {

    private Temperature head;


    /**
     * Verificar se a lista está vazia
     * @return true se a lista estiver vazia; false caso tenha algum elemento
     */
    public boolean isEmpty() {
        if (this.head == null) return true;
        return false;
    }


    /**
     * Adicionar uma temperatura no início da lista
     * @param temperature temperatura a ser adicionada
     */
    public void addFront(double temperature) {
        try {
            Temperature t = new Temperature(temperature);
            if (this.head == null) {
                this.head = t;
                return;
            }

            t.setNext(this.head);
            this.head = t;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Adicionar uma temperatura no final da lista de modo RECURSIVO
     * @param temperature temperatura a ser adicionada
     */
    public void addBack(double temperature) {
        try {
            Temperature t = new Temperature(temperature);
            if (this.head == null) {
                this.head = t;
                return;
            }

            Temperature lastTemperature = getLastTemperature(this.head);
            lastTemperature.setNext(t);

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Percorre a lista de modo recursivo e retorna o último elemento
     *
     * Explicação: O método utiliza o conceito de recursividade direta,
     * uma vez que chama a si mesmo e altera o estado do parâmetro
     * `head` até que a condição (próximo elemento do head igual a null) seja satisfeita
     *
     * @param head temperatura que inicia a lista
     * @return head a última temperatura da lista
     */
    public Temperature getLastTemperature(Temperature head) {
        if (head.getNext() == null) {
            return head;
        } else {
            return getLastTemperature(head.getNext());
        }
    }



    /**
     * Adiciona uma temperatura em uma determinada posição da lista
     * @param temperature temperatura a ser adicionada
     * @param pos posição na lista da temperatura que será adicionada
     */
    public void addAnyPosition(double temperature, int pos) {
        try {
            Temperature t = new Temperature(temperature);
            if (this.head == null) {
                this.head = t;
                return;
            } else if (pos == 0) {
                addFront(temperature);
                return;
            }

            Temperature current = getSomeTemperature(this.head, pos);

            t.setNext(current.getNext());
            current.setNext(t);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
        }
    }


    /**
     * Percorre a lista de modo recursivo e retorna a temperatura em uma posição anterior a indicada
     *
     * Explicação: O método utiliza o conceito de recursividade direta,
     * uma vez que chama a si mesmo e altera o estado do parâmetro
     * `head` e do parâmetro `pos` até que a condição (pos menor igual que 1) seja satisfeita
     *
     * @param head temperatura que inicia a lista
     * @param pos posição da lista em que a temperatura será adicionada
     * @return head a temperatura anterior a posição em que será adicionada a nova
     */
    public Temperature getSomeTemperature(Temperature head, int pos) {
        if (pos <= 1) {
            return head;
        } else {
            return getSomeTemperature(head.getNext(), pos-1);
        }
    }


    /**
     * Remove a temperatura no início da lista
     * @return temperatura removida caso a lista possua elementos, caso contrário o valor null
     */
    public Temperature removeFront() {
        Temperature tempRemoved = null;

        try {
            tempRemoved = this.head;
            this.head = this.head.getNext();
        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return tempRemoved;
    }


    /**
     * Remove a temperatura no final da lista
     * @return temperatura removida caso a lista possua elementos, caso contrário o valor null
     */
    public Temperature removeBack() {
        Temperature tempRemoved = null;

        try {
            Temperature current = this.head;

            if (current.getNext() == null) {
                tempRemoved = current;
                this.head = null;
            } else {

                current = getLastButOneTemperature(current);

                tempRemoved = current.getNext();
                current.setNext(null);
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return tempRemoved;
    }

    /**
     * Percorre a lista de modo recursivo e retorna o penúltimo elemento
     *
     * Explicação: O método utiliza o conceito de recursividade direta,
     * uma vez que chama a si mesmo e altera o estado do parâmetro
     * `head` até que a condição (próximo do próximo elemento igual a null) seja satisfeita
     *
     * @param head temperatura que inicia a lista
     * @return head a penúltima temperatura da lista
     */
    public Temperature getLastButOneTemperature(Temperature head) {
        if (head.getNext().getNext() == null) {
            return head;
        } else {
            return getLastButOneTemperature(head.getNext());
        }
    }


    /**
     * Remove a temperatura em uma determinada posição da lista
     * @param pos posição na lista da temperatura que será removida
     * @return temperatura removida caso a lista possua elementos, caso contrário o valor null
     */
    public Temperature removeAnyPosition(int pos) {
        Temperature tempRemoved = null;

        try {
            Temperature current = this.head;

            if (pos == 0) {
                tempRemoved = current;
                this.head = current.getNext();
            } else {

                current = getSomeTemperature(current, pos);

                tempRemoved = current.getNext();
                current.setNext(current.getNext().getNext());
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return tempRemoved;
    }


    /**
     * Percorre a lista e exibe as temperaturas
     */
    public void show() {
        Temperature current = this.head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
