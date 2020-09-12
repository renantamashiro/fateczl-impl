package lista1;


public class Exercise2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * ((10 - 1) + 1)) + 1;	
		}

		int[] results = saveFactorial(arr);

		for (int result : results) {
			System.out.println(result);
		}
	}

	/*	Função que retorna um vetor com os fatoriais
		de um outro vetor `arr`
		@param arr vetor com os números para cálculo de
		seu fatorial
	*/
	public static int[] saveFactorial(int[] arr) {
		int[] results = new int[5];
		for (int i = 0; i < 5; i++) {
			results[i] = factorial(arr[i]);
		}

		return results;
	}

	/*
		Processo recursivo para cálculo do fatorial
		@param number número para cálculo de seu fatorial
	*/
	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
}