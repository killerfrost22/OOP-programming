package examples;

public class TwoDimArrayExample {
	public static void printArray(int[][] data) {
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(" " + data[row][col]);
			}
			System.out.println(); 
		}
	}
	
	public static void updateArray(int[][] data, int delta) {
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				data[row][col] += delta;
			}
		}		
	}
	
	public static void printRow(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(" " + values[i]);
		}
	}
	
	public static void main(String[] args) {
		int[][] data = {{10, 20, 30}, 
						{40, 50, 60}, 
					   };
		
		System.out.println("Original array:");
		printArray(data);
	
		updateArray(data, 100);
		System.out.println("After increasing every element by a 100:");
		printArray(data);
		
		System.out.println("Printing row:");
		printRow(data[1]);
	}
}