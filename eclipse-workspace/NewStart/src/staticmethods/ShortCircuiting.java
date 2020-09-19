package staticmethods;
import java.util.Scanner;

public class ShortCircuiting {
	public static void main(String[] args) {
		final int MILES_PER_GALLON = 20;
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many miles did you drive today?  ");
		int miles = scanner.nextInt();
		System.out.print("How many gallons of gas did you use?  ");
		int gallons = scanner.nextInt();

		/* What would happen if we revered the expressions connected by && ? */
		if ((gallons != 0) && (miles / gallons < MILES_PER_GALLON)) {
			System.out.println("Your gas milage was pretty bad!");
		}
		scanner.close();
	}
}
