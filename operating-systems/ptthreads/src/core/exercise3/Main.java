package core.exercise3;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[][] gridMaster = new int[3][5];
		
		Random rand = new Random();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				gridMaster[i][j] = rand.nextInt(100);
			}
		}
		
		int idRow = 0;
		for (int[] row : gridMaster) {
			new SumValuesThread(row, idRow).start();
			new SumValuesThread(row, idRow).start();
			new SumValuesThread(row, idRow).start();
			
			idRow += 1;
		}
	}

}
