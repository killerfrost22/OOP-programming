package examples;

public class PassingArrays {
	public static void printRow(Item[] dataRow) {
		for (int i = 0; i < dataRow.length; i++) {
			System.out.print(dataRow[i]);
		}
	}
	
	public static void updateItems(Item[][] data) {
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (col % 2 != 0) {
					data[row][col] = new Item(300, "Generator");
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		Item[][] order;
		order = new Item[2][3];  /* array of references (no Item objects yet) */
		
		order[0][0] = new Item(10, "TV");
		order[0][1] = new Item(5, "Radio");
		order[0][2] = new Item(8, "Telephone");
		order[1][0] = new Item(12, "CDPlayer");
		order[1][1] = new Item(20, "Table");
		order[1][2] = new Item(30, "Lamp");
		
		updateItems(order);
		System.out.println("After Update");
		for (int row = 0; row < order.length; row++) {
			printRow(order[row]);
			System.out.println();
		}
	}
}