package staticmethods;

public class Triangle {
	public static void printTriangle(int maxRows) {
		for (int row = 1; row <= maxRows; row++) {
			Triangle.printStars(row); // calling private method
		}
	}

	public static void printUpsideDownTriangle(int maxRows) {
		for (int i = maxRows; i >= 1; i--) {
			printStars(i); // calling private method, no need for class name
		}
	}

	/* private method */
	private static void printStars(int number) {
		for (int col = 1; col <= number; col++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// no main?? Every class in Java can have a main method
}