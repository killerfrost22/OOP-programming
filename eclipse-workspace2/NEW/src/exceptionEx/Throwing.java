package exceptionEx;

import java.util.Scanner;

public class Throwing {
	public static int processCourse(String courseName) {
		if (courseName == null) {
			throw new IllegalArgumentException("Invalid argument");
		} else {
			if (courseName.equals("cmsc131")) {
				return 4;
			} else {
				return 1;
			}
		}
	}

	public static double computeCost(int option) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter test number (1, 2, 3): ");
		int option = scanner.nextInt();

		if (option == 1) {
			System.out.println("Value: " + processCourse("cmsc131"));
		} else if (option == 2) {
			System.out.println("Value: " + processCourse(null));
		} else {
			System.out.println("Cost: " + computeCost(100));
		}

		scanner.close();
	}
}