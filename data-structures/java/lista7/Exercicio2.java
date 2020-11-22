package lista7;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vet = new int[]{26, 69, 25, 53, 59, 27, 41, 0, 16, 35, 43};
        Lista arr = new Lista(vet);
        mergeSort(arr);
        for (int i : arr.dados) {
            System.out.println(i);
        }
    }

    public static void mergeSort(Lista arr) {
        int arrSize = arr.tamanho;
        if (arrSize < 2) {
            return;
        }

        Lista arr1 = new Lista();
        Lista arr2 = new Lista();

        int i = 0;
        while (i < arrSize/2) {
            arr1.addFinal(arr.removeInicio());
        }

        while (!arr.isEmpty()) {
            arr2.addFinal(arr.removeInicio());
        }

        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1, arr2, arr);

    }

    public static void merge(Lista arr1, Lista arr2, Lista arr) {
        while (!arr1.isEmpty() && !arr2.isEmpty()) {
            if (compare(arr1.dados[0], arr2.dados[0]) <= 0) {
                arr.addFinal(arr1.removeInicio());
            } else {
                arr.addFinal(arr2.removeInicio());
            }
        }
        while (!arr1.isEmpty()) {
            arr.addFinal(arr1.removeInicio());
        }
        while (!arr2.isEmpty()) {
            arr.addFinal(arr2.removeInicio());
        }
    }

    public static int compare(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Lista {

    public int[] dados;
    public int tamanho = 0;

    public Lista(int[] arr) {
        this.dados = arr;
        this.tamanho = arr.length;
    }

    public Lista() {

    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public void addFinal(int num) {
        this.dados[this.tamanho] = num;
        this.tamanho += 1;
    }

    public void addInicio(int num) {
        if (this.tamanho == 0) {
            this.dados[0] = num;
            this.tamanho += 1;
            return;
        }
        for (int i = this.tamanho; i > 0; i--) {
            this.dados[i] = this.dados[i - 1];
        }
        this.dados[0] = num;
        this.tamanho += 1;
    }

    public int removeInicio() {
        int removido = this.dados[0];

        for (int i = 0; i < this.tamanho-1; i++) {
            this.dados[i] = this.dados[i + 1];
        }
        this.tamanho -= 1;
        return removido;
    }

    public int removeFinal() {
        int removido = this.dados[this.tamanho-1];
        this.tamanho -= 1;
        return removido;
    }
}
