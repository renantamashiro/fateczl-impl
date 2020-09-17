package atividade1.core.exercise2;

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
     * Adicionar uma temperatura no final da lista
     * @param temperature temperatura a ser adicionada
     */
    public void addBack(double temperature) {
        try {
            Temperature t = new Temperature(temperature);
            if (this.head == null) {
                this.head = t;
                return;
            }

            Temperature current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(t);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
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

            Temperature current = this.head;
            int position = 0;
            while (position != (pos - 1)) {
                current = current.getNext();
                position += 1;
            }

            t.setNext(current.getNext());
            current.setNext(t);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("This operation can not be executed.");
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
                while (current.getNext().getNext() != null) {
                    current = current.getNext();
                }

                tempRemoved = current.getNext();
                current.setNext(null);
            }

        } catch (NullPointerException e) {
            System.out.println("This operation can not be executed. Empty list.");
        }

        return tempRemoved;
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
                int position = 0;
                while (position != (pos-1)) {
                    current = current.getNext();
                    position += 1;
                }

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
