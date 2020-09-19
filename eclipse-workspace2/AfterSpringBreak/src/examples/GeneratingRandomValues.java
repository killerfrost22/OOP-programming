package examples;

import java.util.Scanner;
import java.util.Random;  /* Needed for random number generation */

public class GeneratingRandomValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many random numbers do you want?:  ");
		int arrSize = scanner.nextInt();
		System.out.print("What is maximum range value (integer)?: ");
		int range = scanner.nextInt();
		
		/* Creating array */ 
		int[] arr = new int[arrSize];

		/* Creating a Random object for random number generation. */
		/* The seed will guarantee same numbers are generated.    */
		/* Without it a very likely to be distinct value from     */
		/* any other invocation of this constructor will be used. */
		
		long seed = 10L;
		Random random = new Random(seed);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(range);
		}
		
		System.out.print("Would you like to see the numbers (y/n)?  ");
		if (scanner.next().charAt(0) == 'y') {
			for (int i = 0; i < arrSize; i++) {
				System.out.println(arr[i]);
			}
		}

		System.out.print("Would you like to see the sum (y/n)?  ");
		int sum = 0;
		if (scanner.next().charAt(0) == 'y') {
			for (int i = 0; i < arrSize; i++) {
				sum += arr[i];
			}
		}
		
		System.out.println("Sum: " + sum);
		
		scanner.close();
	}
}