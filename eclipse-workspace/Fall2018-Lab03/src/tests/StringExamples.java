package tests;
import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner (System.in);
	
		char answer = keyboardInput.next().charAt(0);
		System.out.println("The answer is : " + answer);
		keyboardInput.close();
		

	}

}
