package core.exercise3;

public class SumValuesThread extends Thread {
	
	private int[] row;
	private int idRow;
	
	public SumValuesThread(int[] row, int idRow) {
		this.row = row;
		this.idRow = idRow;
	}
	
	@Override
	public void run() {
		int  result = 0;
		for (int i : row) {
			result += i;
		}
		
		System.out.println("Id row: " + this.idRow + "; Sum: " + result);
	}

}
