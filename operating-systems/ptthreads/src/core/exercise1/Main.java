package core.exercise1;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random rand =  new Random();
		int[] data = new int[100000];
		
		for (int i = 0; i < 100000; i++) {
			data[i] = rand.nextInt(99) + 1;
		}
		
		ThreadVetor th1 = new ThreadVetor(1, data);
		ThreadVetor th2 = new ThreadVetor(2, data);
		
		th1.start();
		th2.start();
		
		
	}
}
