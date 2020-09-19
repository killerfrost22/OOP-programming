package apisEx;

import java.util.Scanner;

public class StringBufferExample {
	private static int MAX_ITERATIONS = 50000;
	private static String MESSAGE = "Terps";
	private static boolean printResult = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char choice;

		System.out.println("Enter y to use StringBuffer, n for String: ");
		choice = scanner.next().charAt(0);

		long time = System.currentTimeMillis();
		if (choice == 'y') {
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < MAX_ITERATIONS; i++) {
				stringBuffer.append(MESSAGE);
			}
			if (printResult) {
				System.out.println(stringBuffer);
			}
		} else {
			System.out.println("String selected");
			String string = new String();
			for (int i = 0; i < MAX_ITERATIONS; i++) {
				string = string + MESSAGE;
			}
			if (printResult) {
				System.out.println(string);
			}
		}
		time = System.currentTimeMillis() - time;
		System.out.println("Time(msec) = " + time);

		scanner.close();
	}
}