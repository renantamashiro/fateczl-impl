package core.exercise2;

public class Main {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		MyThread my3 = new MyThread();
		MyThread my4 = new MyThread();
		MyThread my5 = new MyThread();
		
		my1.start();
		my2.start();
		my3.start();
		my4.start();
		my5.start();
	}
}
