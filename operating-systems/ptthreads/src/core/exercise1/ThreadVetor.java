package core.exercise1;

public class ThreadVetor extends Thread {
	
	private int value;
	private int[] data;
	
	public ThreadVetor(int value, int[] data) {
		this.value = value;
		this.data = data;
	}
	
	
	public void oddEvenThread() {
		int sumNumbers = 0;
		if (this.value % 2 != 0) {
			long startTime = System.nanoTime();
			
			for (int i = 0; i < this.data.length; i++) {
				sumNumbers += this.data[i];
				continue;
			}
			
			long endTime = System.nanoTime();
			double timeProcess = (endTime - startTime) / Math.pow(10, 9);
			System.out.println("Thread odd number time process: " + timeProcess + " -> Sum: " + sumNumbers);
			return;
		}
		
		long startTime = System.nanoTime();
		
		for (int i : this.data) {
			sumNumbers += i;
			continue;
		}
		
		long endTime = System.nanoTime();
		double timeProcess = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Thread even number time process: " + timeProcess + " -> Sum: " + sumNumbers);
	}
	
	
	@Override
	public void run() {
		oddEvenThread();
	}
}
