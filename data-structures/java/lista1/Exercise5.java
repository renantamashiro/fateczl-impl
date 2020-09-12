package lista1;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		loadGrid(arr);
	}
	
	public static void loadGrid(int[][] arr) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == i) {
					arr[i][j] = (int) Math.pow(3, j);
				} else {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter a number: ");
					arr[i][j] = sc.nextInt();
				}
			}
		}
		for (int[] row : arr) {
			for (int value : row) {
				System.out.println(value);
			}
		}
	}
}
