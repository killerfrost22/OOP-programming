package examples;

public class TwoDimArrayReferences {
	public static void main(String[] args) {
		Item[][] order;
		order = new Item[2][3];  /* array of references (no Item objects yet) */
		
		order[0][0] = new Item(10, "TV");
		order[0][1] = new Item(5, "Radio");
		order[0][2] = new Item(8, "Telephone");
		order[1][0] = new Item(12, "CDPlayer");
		order[1][1] = new Item(20, "Table");
		order[1][2] = new Item(30, "Lamp");
		
		System.out.println("First Array");
		for (int row = 0; row < order.length; row++) {
			for (int col = 0; col < order[row].length; col++) {
				System.out.print(order[row][col]);
			}
			System.out.println();
		}
		
		/* Initializing the array */
		/* Notice it is ragged array with an empty array */
		Item[][] processedOrder = {{new Item(11,"Bed"), new Item(100, "Sofa")},
								   {},
								   {new Item(200, "Pen")},
								  };
		
		System.out.println("Second Array");
		for (int row = 0; row < processedOrder.length; row++) {
			if (processedOrder[row].length != 0) {
				for (int col = 0; col < processedOrder[row].length; col++) {
					System.out.print(processedOrder[row][col]);
				}
				System.out.println();
			}
		}		
	}
}