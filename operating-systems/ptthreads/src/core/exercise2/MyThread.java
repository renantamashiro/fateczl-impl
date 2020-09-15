package core.exercise2;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(this.getId());
	}
	

}
