package staticmethods;

public class PassingValues {
	public static void wrongSwap(int a, int b) {
		int temp = a;

		a = b;
		b = temp;
		System.out.println("a: " + a + " b: " + b);
	}

	public static void main(String[] args) {
		int x = 2, y = 3;

		wrongSwap(x, y);
		System.out.println("x: " + x + "y: " + y);
	}
}
