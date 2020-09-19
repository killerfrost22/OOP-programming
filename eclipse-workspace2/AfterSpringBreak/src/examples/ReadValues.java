package examples;

import java.util.Scanner;

public class ReadValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many values would you like to store: ");
		int size = scanner.nextInt();

		int[] nums = new int[size];

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter value " + (i + 1) + ": ");
			nums[i] = scanner.nextInt();
		}

		System.out.println("Here are the values you entered:  ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		scanner.close();
	}
}