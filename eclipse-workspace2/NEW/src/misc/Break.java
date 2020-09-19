package misc;

import java.util.*;

public class Break {
	public static void notUsingBreak(Scanner scanner) {
		boolean done = false;
		
		do {
			System.out.println("Enter integer value: ");
			int value = scanner.nextInt();
			if (value < 0) {
				done = true;
			} else {
				System.out.println("Processing " + value);
			}
		} while (!done);
		
		System.out.println("Done-NotUsingBreak");
	}

	public static void usingBreak(Scanner scanner) {
		do {
			System.out.println("Enter integer value: ");
			int value = scanner.nextInt();
			if (value < 0) {
				break;
			}
			System.out.println("Processing " + value);
		} while (true);
		
		System.out.println("Done-UsingBreak");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		notUsingBreak(scanner);
		usingBreak(scanner);
		
		scanner.close();
	}
}