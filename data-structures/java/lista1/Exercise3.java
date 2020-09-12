package lista1;


public class Exercise3 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random() * ((10 - 1) + 1)) + 1;	
		}
		
		int[] array = sortArray(arr);
		
		for (int number : array) {
			System.out.println(number);
		}
	}

	public static int[] sortArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int number = arr[i];
			int j = i;

			while ((j > 0) && (number < arr[j-1])) {
				arr[j] = arr[i-1];
				j -= 1;
			}

			arr[j] = number;
		}
		return arr;
	}
}