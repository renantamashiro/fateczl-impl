package Testes;

import java.util.Arrays;

public class Quick {
    static int particiona (int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        // Put the elements smaller than pivot on the left and
        // greater than pivot on the right of pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    public int pickPivotIndex(int[] values, int left, int right) {
        int mid = (left + right) / 2;

        int[] sorted = {values[left], values[mid], values[right]};
        Arrays.sort(sorted);

        if (sorted[1] == values[left]) return left;
        else if (sorted[1] == values[mid]) return mid;
        else return right;
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {

            // Select pivot position and put all the elements smaller
            // than pivot on left and greater than pivot on right
            System.out.println("Antes particiona");
            printQuick(array);
            int pi = particiona(array, low, high);
            System.out.println("Depois particiona");
            printQuick(array);

            // Sort the elements on the left of pivot
            quickSort(array, low, pi - 1);
            System.out.println("Primeiro quick");
            printQuick(array);

            // Sort the elements on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    static void printQuick(int[] arr) {
        String output = "";
        for (int i : arr) {
            output = output + String.valueOf(i) + ", ";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        int[] arr = {11,12,8,9,14,17,22,75,44,98,120,200,138,139,22,33,85,92,35};
        quickSort(arr, 0, 18);
    }
}
