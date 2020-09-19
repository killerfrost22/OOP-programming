package apisEx;

import javax.swing.*;

public class StringExamples {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter a word");
		String answer;

		if (name.charAt(0) == name.charAt(name.length() - 1)) {
			answer = "word starts and end with the same letter";
		} else {
			answer = "word does not start and end with the same letter";
		}
		JOptionPane.showMessageDialog(null, answer);

		String str1 = JOptionPane.showInputDialog("Enter string");
		String str2 = JOptionPane.showInputDialog("Enter string");
		System.out.println("Using compareTo: " + str1.compareTo(str2));
		System.out.println("Using compareToIgnoreCase: " + str1.compareToIgnoreCase(str2));

		String login = JOptionPane.showInputDialog("Enter login id");
		answer = "Access Granted";
		if (!login.equalsIgnoreCase("Hulk")) {
			answer = "Access Denied";
		}
		JOptionPane.showMessageDialog(null, answer);

		String mascot = " Terps ";
		System.out.println("Character r for Terps is at : " + mascot.indexOf('r'));
		System.out.println("Before trimming:--" + mascot + "--");
		String mascotTrimmed = mascot.trim();
		System.out.println("After trimming:--" + mascotTrimmed + "--");
		System.out.println("Uppercase: " + mascot.toUpperCase());
		System.out.println("Lowercase: " + mascot.toLowerCase());
		System.out.println("Mascot after trimming and case changes:--" + mascot + "--");

		int x = 100;
		String strIntValue = String.valueOf(x);
		System.out.println(strIntValue);
	}
}