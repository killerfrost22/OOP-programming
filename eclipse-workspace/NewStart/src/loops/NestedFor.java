package loops;

public class NestedFor {
	public static void main(String[] args) {
		int maxRow = 10, maxCol = 10;

		for (int row = 1; row <= maxRow; row++) {
			for (int col = 1; col <= maxCol; col++) {
				System.out.print(row*col+" ");
			}

			System.out.println();
		}
	}
}
