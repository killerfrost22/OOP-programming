package sysutilities.apisEx;

import javax.swing.*;

public class MathExamples {
	public static void main(String[] args) {

		// Math m = new Math(); // not possible
		System.out.println("Math.PI: " + Math.PI);
		System.out.println("Maximum between 20 and 10: " + Math.max(20, 10));
		System.out.println("Minimum between 20 and 10: " + Math.min(20, 10));

		double value = Double.parseDouble(JOptionPane.showInputDialog("Enter number"));
		System.out.println("Square root of " + value + ": " + Math.sqrt(value));
		System.out.println("Floor of " + value + ": " + Math.floor(value));
		System.out.println("Ceiling of " + value + ": " + Math.ceil(value));
		System.out.println("Power (2) of " + value + ": " + Math.pow(value, 2));
		System.out.println("Rounding " + value + ": " + Math.round(value));

		System.out.println("Set 1");
		for (int i = 0; i < 100; i++) {
			System.out.println(Math.random());
		}

		System.out.println("Set 2");
		for (int i = 0; i < 100; i++) {
			System.out.println(200 * Math.random());
		}

		System.out.println("Set 3");
		for (int i = 0; i < 100; i++) {
			System.out.println(Math.floor(200 * Math.random()));
		}

		System.out.println("Set 4");
		for (int i = 0; i < 100; i++) {
			System.out.println(Math.floor(201 * Math.random()));
		}

		System.out.println("Set 5");
		for (int i = 0; i < 100; i++) {
			System.out.println(Math.floor(200 * Math.random()) + 1);
		}
	}
}