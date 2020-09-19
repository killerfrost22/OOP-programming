package tests;

import java.util.Scanner;

public class scannerExample {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner (System.in);
			int x = keyboardInput.nextInt();
			System.out.println(x);
			
			keyboardInput.close();
	}

}
