package core.exercise4;

import java.util.Random;

public class FrogThread extends Thread {
	
	private String name;
	private int jumpMax;
	private int distance = 0;
	private int finishLine;
	private Position position;
	
	public FrogThread(String name, Position pos, int jumpMax, int finishLine) {
		this.name = name + "Frog";
		this.position = pos;
		this.jumpMax = jumpMax;
		this.finishLine = finishLine;
	}
	
	
	public void moveLittleFrog() {
		Random rand = new Random();
		int jumpJump = 0;
		
		while (this.distance < this.finishLine) {
			jumpJump = rand.nextInt(this.jumpMax) + 1;
			this.distance += jumpJump;
			System.out.println(this.name + " jumps " + jumpJump
					+ " meters, and its distance is " + this.distance);
		}
		
		this.position.number += 1;
		System.out.println(this.name + " position: " + this.position.number);
		this.position.finish += this.position.number + ": " + this.name + "\n";
		
		if (this.position.number == 5) {
			System.out.println(this.position.finish);
		}
		
	}
	
	@Override
	public void run() {
		moveLittleFrog();
	}

}
