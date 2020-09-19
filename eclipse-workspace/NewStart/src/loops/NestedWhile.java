package loops;
public class NestedWhile {
	public static void main(String[] args) {
		int maxRows = 3, maxCols = 4, row;

		row = 1;
		while (row < maxRows) {
			int col = 1;
			
			while (col < maxCols) {
				System.out.println("Row: " + row + " Col: " + col);

				col++;
			}
			System.out.println();

			row++; /* Next row */
		}
	}
}