package misc;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				continue; // Jump to bottom
			}

			System.out.println(i);
		}
	}
}