package lista1;


public class Exercise4 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = (int) (Math.random() * ((200 - 1) + 1)) + 1;
				System.out.println(arr[i][j]);
			}
		}

		System.out.println("Soma dos valores no intervalo de 1 a 100: "
			+ sumInterval(arr));
		System.out.println("Quantidade de números ímpares entre 30 a 50: "
			+ oddNumbersInterval(arr));
		System.out.println("Quantidade de números divisíveis por 8: " 
			+ divideByEight(arr));
		System.out.println("Quantidade de números ímpares divisíveis por 3: "
			+ (oddDivideByThree(arr)));
		System.out.println("Fatorial do maior número informado na matriz: "
			+ (maxNumberFactorial(arr)));
	}

	public static int sumInterval(int[][] arr) {
		int result = 0;
		for (int[] row : arr) {
			for (int value : row) {
				if ((value >= 1) && (value <= 100)) {
					result += value;
				}
			}
		}
		return result;
	}

	public static int oddNumbersInterval(int[][] arr) {
		int result = 0;
		for (int[] row : arr) {
			for (int value : row) {	
				if ((value % 2 != 0) && (value >= 30) && (value <= 50)) {
					result++;
				}
			}
		}
		return result;
	}

	public static int divideByEight(int[][] arr) {
		int result = 0;
		for (int[] row : arr) {
			for (int value : row) {	
				if (value % 8 == 0) {
					result++;
				}
			}
		}
		return result;
	}

	public static int oddDivideByThree(int[][] arr) {
		int result = 0;
		for (int[] row : arr) {
			for (int value : row) {
				if ((value % 2 != 0) && (value % 3 == 0)) {
					result++;
				}
			}
		}
		return result;
	}

	public static long maxNumberFactorial(int[][] arr) {
		int maxValue = arr[0][0];
		for (int[] row : arr) {
			for (int value : row) {
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}
		System.out.println("Máximo: " + maxValue);
		return factorial(maxValue);
	}

	public static long factorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			long result = number * factorial(number - 1);
			return result;
		}
	}
}