package loops;
import java.util.Scanner;

public class ScopeError {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Enter an integer from 1 to 10: ");
			int answer = scanner.nextInt();

		} while (answer < 1 || answer > 10);  // Why not && instead of || ?

		System.out.println("Good job.");
		scanner.close();
	}
	
	
}
