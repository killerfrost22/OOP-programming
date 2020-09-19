package exceptionEx;

import javax.swing.*;

public class Multiple {
	private static final int START_YEAR_INDEX = 6;
	private static final int END_YEAR_INDEX = 10;

	public static void main(String[] args) {
		String date = "";
		try {
			date = JOptionPane.showInputDialog("Enter date using format: (mm/dd/yyyy)");

			/*
			 * substring may throw IndexOutOfBoundsException (e.g., 10/1/1)
			 * input
			 */
			String yearString = date.substring(START_YEAR_INDEX, END_YEAR_INDEX);

			/*
			 * parseInt may throw NumberFormatException (e.g., 10/10/year) input
			 */
			int year = Integer.parseInt(yearString);

			System.out.println("The year is " + year);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index error");
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		} finally {
			System.out.println("The original string: " + date);
		}
	}
}