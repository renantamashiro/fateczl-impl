package core.exercise4;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Position pos = new Position();
		Random rand = new Random();
		
		int finishLine = 900;
		
		FrogThread malandro = new FrogThread(
				new String("Malandro"), pos, rand.nextInt(10)+1, finishLine);
		FrogThread mane = new FrogThread(
				new String("Mané"), pos, rand.nextInt(10)+1, finishLine);
		FrogThread junior = new FrogThread(
				new String("Júnior"), pos, rand.nextInt(10)+1, finishLine);
		FrogThread ze = new FrogThread(
				new String("Zé"), pos, rand.nextInt(10)+1, finishLine);
		FrogThread minino = new FrogThread(
				new String("Minino"), pos, rand.nextInt(10)+1, finishLine);
		
		malandro.start();
		mane.start();
		junior.start();
		ze.start();
		minino.start();
		
		System.out.println(pos.finish);
		
	}

}
