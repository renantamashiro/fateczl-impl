package lista1;


public class Exercise1 {
	
	public static void main(String[] args) {
		double[] arr = new double[100];
		
		for (int i = 0; i < 100; i++) {
			double num = (Math.random() * ((10000 - (-10000)) + 1)) + (-10000);
			arr[i] = num;
		}
		intervalAverage(arr);
		generalAverage(arr);
		sumNegativeNumbers(arr);
	}
	
	
	/*
	 * Média dos saldos positivos entre 100 à 1000
	 * @param arr vetor [100] real
	 */
	public static void intervalAverage(double[] arr) {
		double average = 0.;
		int countNumbers = 0;
		for (double number : arr) {
			if ((number >= 100) && (number <= 1000)) {
				average += number;
				countNumbers++;
			}
		}
		
		average /= countNumbers;
		
		System.out.println("Average: " + average);
	}
	
	
	/*
	 * Média geral dos saldos
	 * @param arr vetor [100] real
	 */
	public static void generalAverage(double[] arr) {
		double average = 0.;
		for (double number : arr) {
			average += number;
		}
		
		average /= arr.length;
		
		System.out.println("Average: " + average);
	}
	
	
	/*
	 * Soma dos saldos negativos
	 * @param arr vetor [100] real
	 */
	public static void sumNegativeNumbers(double[] arr) {
		double negativeNumbersSum = 0.;
		for (double number : arr) {
			if (number < 0) {
				negativeNumbersSum += number;
			}
		}
		System.out.println("Sum of negative numbers: " + negativeNumbersSum);
	}
}
